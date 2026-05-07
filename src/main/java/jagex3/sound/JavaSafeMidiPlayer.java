package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.SignLink;
import jagex3.util.ThreadSleep;

@ObfuscatedName("ja")
public final class JavaSafeMidiPlayer extends MidiPlayer implements Runnable {

	@ObfuscatedName("ja.T")
	public static final MidiParser field1444 = new MidiParser();

	@ObfuscatedName("ja.V")
	public static final int[] field1446 = new int[256];
	@ObfuscatedName("ja.R")
	public static MidiDevice field1442;
	@ObfuscatedName("ja.X")
	public static int field1448;
	@ObfuscatedName("ja.U")
	public static int field1445;
    @ObfuscatedName("ja.S")
    public static boolean field1443;
	@ObfuscatedName("ja.W")
	public static boolean field1447;

	@ObfuscatedName("ja.a(IBIII)V")
	public static void method541(int arg0, int arg1, int arg2, int arg3) {
		if (field1446.length <= field1448) {
			field1442.method310(field1446, field1448);
			field1448 = 0;
		}
		field1446[field1448++] = arg2 - field1445;
		field1445 = arg2;
		field1446[field1448++] = arg3 | arg0 << 8 | arg1 << 16;
	}

	@ObfuscatedName("ja.e(B)V")
	public static void method540() {
		if (field1448 > 0) {
			field1442.method310(field1446, field1448);
			field1448 = 0;
		}
	}

	@ObfuscatedName("ja.b(I)V")
	@Override
	public synchronized void method308() {
		if (!field1444.gotMidi()) {
			return;
		}
		long var1 = (long) (field1445 + 200 - field1442.method313()) * (long) (field1444.division * 1000);
		while (true) {
			while (true) {
				int var3 = field1444.nextTrackToPlay();
				int var4 = field1444.trackCurrentTick[var3];
				long var5 = field1444.timeFromTick(var4);
				if (var5 > var1) {
					method540();
					return;
				}
				while (field1444.trackCurrentTick[var3] == var4) {
					field1444.method350(var3);
					this.method539(var5, var3);
					if (field1444.method343()) {
						field1444.method345(var3);
						if (field1444.allTracksFinished()) {
							if (!field1447) {
								this.method1000((long) (var5 / (long) (field1444.division * 1000)));
								field1444.dropMidi();
								method540();
								return;
							}
							field1444.restart(var5);
						}
						break;
					}
					field1444.processDeltaTime(var3);
					field1444.method345(var3);
				}
			}
		}
	}

	@ObfuscatedName("ja.a(JBI)V")
	public void method539(long arg0, int arg1) {
		int var4 = field1444.getEvent(arg1);
		if (var4 == 1) {
			field1444.finishTrack();
		} else if ((var4 & 0x80) != 0) {
			int var5 = (int) (arg0 / (long) (field1444.division * 1000));
			int var6 = var4 & 0xFF;
			int var7 = var4 >> 8 & 0xFF;
			int var8 = var4 >> 16 & 0xFF;
			if (!this.loadAndQueuePatches(var6, var7, var8, (long) var5)) {
				method541(var7, var8, var5, var6);
				return;
			}
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (field1443) {
						field1443 = false;
						return;
					}
					this.method308();
				}
				ThreadSleep.sleepPrecise(100L);
			}
		} catch (Exception var4) {
			JagException.report(null, var4);
		}
	}

	@ObfuscatedName("ja.c(B)V")
	@Override
	public void method303() {
		synchronized (this) {
			field1443 = true;
		}
		while (true) {
			synchronized (this) {
				if (!field1443) {
					break;
				}
			}
			ThreadSleep.sleepPrecise(20L);
		}
		field1442.method312();
	}

	@ObfuscatedName("ja.a([BZII)V")
	@Override
	public synchronized void method307(byte[] arg0, boolean arg1, int arg2) {
		boolean var4 = true;
		field1444.setMidi(arg0);
		field1445 = 0;
		field1447 = arg1;
		field1442.method314();
		this.method996(arg2, 0, (long) field1445);
		int var5 = field1444.getTrackCount();
		for (int var6 = 0; var6 < var5; var6++) {
			field1444.method350(var6);
			while (!field1444.method343()) {
				field1444.processDeltaTime(var6);
				if (field1444.trackCurrentTick[var6] != 0) {
					var4 = false;
					break;
				}
				this.method539(0L, var6);
			}
			field1444.method345(var6);
		}
		if (var4) {
			if (field1447) {
				throw new RuntimeException();
			}
			this.method1000((long) field1445);
			field1444.dropMidi();
		}
		method540();
	}

	@ObfuscatedName("ja.a(II)V")
	@Override
	public synchronized void method304(int arg0) {
		this.method997((long) field1445, arg0);
		field1442.method310(field1446, field1448);
		field1448 = 0;
	}

	@ObfuscatedName("ja.a(IIIJ)V")
	@Override
	public void method306(int arg0, int arg1, int arg2, long arg3) {
		method541(arg1, arg2, (int) arg3, arg0);
	}

	@ObfuscatedName("ja.a(BII)V")
	@Override
	public synchronized void method302(int arg0, int arg1) {
		this.method996(arg0, arg1, (long) field1445);
	}

	public JavaSafeMidiPlayer(SignLink arg0, MidiDevice arg1) {
		field1442 = arg1;
		field1442.method311();
		field1442.method314();
		this.method1000((long) field1445);
		field1442.method310(field1446, field1448);
		field1448 = 0;
		arg0.threadreq(10, this);
	}

	@ObfuscatedName("ja.a(B)V")
	@Override
	public synchronized void method305() {
		field1442.method314();
		this.method1000((long) field1445);
		field1442.method310(field1446, field1448);
		field1448 = 0;
		field1444.dropMidi();
	}
}
