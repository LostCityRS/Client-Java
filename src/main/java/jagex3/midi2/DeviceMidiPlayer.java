package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.SignLink;
import jagex3.util.ThreadSleep;

@ObfuscatedName("ja")
public final class DeviceMidiPlayer extends MidiPlayer implements Runnable {

	@ObfuscatedName("ja.T")
	public static final MidiParser parser = new MidiParser();

	@ObfuscatedName("ja.V")
	public static final int[] eventBuffer = new int[256];
	@ObfuscatedName("ja.R")
	public static MidiDevice device;
	@ObfuscatedName("ja.X")
	public static int eventBufferSize;
	@ObfuscatedName("ja.U")
	public static int currentTimeMillis;
    @ObfuscatedName("ja.S")
    public static boolean stopRequested;
	@ObfuscatedName("ja.W")
	public static boolean loop;

	@ObfuscatedName("ja.a(IBIII)V")
	public static void queueEvent(int arg0, int arg1, int arg2, int arg3) {
		if (eventBuffer.length <= eventBufferSize) {
			device.writeEvents(eventBuffer, eventBufferSize);
			eventBufferSize = 0;
		}
		eventBuffer[eventBufferSize++] = arg2 - currentTimeMillis;
		currentTimeMillis = arg2;
		eventBuffer[eventBufferSize++] = arg3 | arg0 << 8 | arg1 << 16;
	}

	@ObfuscatedName("ja.e(B)V")
	public static void flushEvents() {
		if (eventBufferSize > 0) {
			device.writeEvents(eventBuffer, eventBufferSize);
			eventBufferSize = 0;
		}
	}

	@ObfuscatedName("ja.b(I)V")
	@Override
	public synchronized void poll() {
		if (!parser.gotMidi()) {
			return;
		}
		long var1 = (long) (currentTimeMillis + 200 - device.getTimeMillis()) * (long) (parser.division * 1000);
		while (true) {
			while (true) {
				int var3 = parser.nextTrackToPlay();
				int var4 = parser.trackCurrentTick[var3];
				long var5 = parser.timeFromTick(var4);
				if (var5 > var1) {
					flushEvents();
					return;
				}
				while (parser.trackCurrentTick[var3] == var4) {
					parser.loadTrackPosition(var3);
					this.processTrackEvent(var5, var3);
					if (parser.isTrackFinished()) {
						parser.saveTrackPosition(var3);
						if (parser.allTracksFinished()) {
							if (!loop) {
								this.resetAllChannels((long) (var5 / (long) (parser.division * 1000)));
								parser.dropMidi();
								flushEvents();
								return;
							}
							parser.restart(var5);
						}
						break;
					}
					parser.processDeltaTime(var3);
					parser.saveTrackPosition(var3);
				}
			}
		}
	}

	@ObfuscatedName("ja.a(JBI)V")
	public void processTrackEvent(long arg0, int arg1) {
		int var4 = parser.getEvent(arg1);
		if (var4 == 1) {
			parser.finishTrack();
		} else if ((var4 & 0x80) != 0) {
			int var5 = (int) (arg0 / (long) (parser.division * 1000));
			int var6 = var4 & 0xFF;
			int var7 = var4 >> 8 & 0xFF;
			int var8 = var4 >> 16 & 0xFF;
			if (!this.loadAndQueuePatches(var6, var7, var8, (long) var5)) {
				queueEvent(var7, var8, var5, var6);
				return;
			}
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (stopRequested) {
						stopRequested = false;
						return;
					}
					this.poll();
				}
				ThreadSleep.sleepPrecise(100L);
			}
		} catch (Exception var4) {
			JagException.report(null, var4);
		}
	}

	@ObfuscatedName("ja.c(B)V")
	@Override
	public void closeStream() {
		synchronized (this) {
			stopRequested = true;
		}
		while (true) {
			synchronized (this) {
				if (!stopRequested) {
					break;
				}
			}
			ThreadSleep.sleepPrecise(20L);
		}
		device.close();
	}

	@ObfuscatedName("ja.a([BZII)V")
	@Override
	public synchronized void play(byte[] arg0, boolean arg1, int arg2) {
		boolean var4 = true;
		parser.setMidi(arg0);
		currentTimeMillis = 0;
		loop = arg1;
		device.reset();
		this.setVolume(arg2, 0, (long) currentTimeMillis);
		int var5 = parser.getTrackCount();
		for (int var6 = 0; var6 < var5; var6++) {
			parser.loadTrackPosition(var6);
			while (!parser.isTrackFinished()) {
				parser.processDeltaTime(var6);
				if (parser.trackCurrentTick[var6] != 0) {
					var4 = false;
					break;
				}
				this.processTrackEvent(0L, var6);
			}
			parser.saveTrackPosition(var6);
		}
		if (var4) {
			if (loop) {
				throw new RuntimeException();
			}
			this.resetAllChannels((long) currentTimeMillis);
			parser.dropMidi();
		}
		flushEvents();
	}

	@ObfuscatedName("ja.a(II)V")
	@Override
	public synchronized void resetVolume(int arg0) {
		this.resetVolume((long) currentTimeMillis, arg0);
		device.writeEvents(eventBuffer, eventBufferSize);
		eventBufferSize = 0;
	}

	@ObfuscatedName("ja.a(IIIJ)V")
	@Override
	public void sendMidiCommand(int arg0, int arg1, int arg2, long arg3) {
		queueEvent(arg1, arg2, (int) arg3, arg0);
	}

	@ObfuscatedName("ja.a(BII)V")
	@Override
	public synchronized void setVolume(int arg0, int arg1) {
		this.setVolume(arg0, arg1, (long) currentTimeMillis);
	}

	public DeviceMidiPlayer(SignLink arg0, MidiDevice arg1) {
		device = arg1;
		device.open();
		device.reset();
		this.resetAllChannels((long) currentTimeMillis);
		device.writeEvents(eventBuffer, eventBufferSize);
		eventBufferSize = 0;
		arg0.threadreq(10, this);
	}

	@ObfuscatedName("ja.a(B)V")
	@Override
	public synchronized void stop() {
		device.reset();
		this.resetAllChannels((long) currentTimeMillis);
		device.writeEvents(eventBuffer, eventBufferSize);
		eventBufferSize = 0;
		parser.dropMidi();
	}
}
