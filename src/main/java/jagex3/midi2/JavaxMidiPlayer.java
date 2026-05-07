package jagex3.midi2;

import deob.ObfuscatedName;

import javax.sound.midi.*;
import java.io.ByteArrayInputStream;

@ObfuscatedName("da")
public final class JavaxMidiPlayer extends MidiPlayer implements Receiver {

	@ObfuscatedName("da.R")
	public static Sequencer sequencer = null;

	@ObfuscatedName("da.T")
	public static Receiver receiver = null;

	@ObfuscatedName("da.S")
	public static volatile boolean playing = false;

	@ObfuscatedName("da.a(BII)V")
	@Override
	public synchronized void setVolume(int arg0, int arg1) {
		if (sequencer != null) {
			this.setVolume(arg0, arg1, -1L);
		}
	}

	@ObfuscatedName("da.c(B)V")
	@Override
	public void closeStream() {
		if (sequencer != null) {
			sequencer.close();
			sequencer = null;
		}
		if (receiver != null) {
			receiver.close();
			receiver = null;
		}
	}

	public JavaxMidiPlayer() {
		try {
			receiver = MidiSystem.getReceiver();
			sequencer = MidiSystem.getSequencer(false);
			sequencer.getTransmitter().setReceiver(this);
			sequencer.open();
			this.resetAllChannels(-1L);
		} catch (Exception var2) {
			MidiManager.shutdown();
		}
	}

	@ObfuscatedName("da.a(II)V")
	@Override
	public void resetVolume(int arg0) {
		if (sequencer != null) {
			this.resetVolume(-1L, arg0);
		}
	}

	@Override
	public void close() {
	}

	@ObfuscatedName("da.a(B)V")
	@Override
	public void stop() {
		if (sequencer != null) {
			playing = false;
			sequencer.stop();
			this.resetAllChannels(-1L);
		}
	}

	@ObfuscatedName("da.a(IIIJ)V")
	@Override
	public void sendMidiCommand(int arg0, int arg1, int arg2, long arg3) {
		try {
			ShortMessage var6 = new ShortMessage();
			var6.setMessage(arg0, arg1, arg2);
			receiver.send(var6, arg3);
		} catch (InvalidMidiDataException var8) {
		}
	}

	@ObfuscatedName("da.a([BZII)V")
	@Override
	public void play(byte[] arg0, boolean arg1, int arg2) {
		if (sequencer == null) {
			return;
		}
		try {
			Sequence var4 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			sequencer.setSequence(var4);
			sequencer.setLoopCount(arg1 ? -1 : 0);
			this.setVolume(arg2, 0, -1L);
			playing = true;
			sequencer.start();
		} catch (Exception var6) {
		}
	}

	@Override
	public synchronized void send(MidiMessage arg0, long arg1) {
		if (playing) {
			byte[] var4 = arg0.getMessage();
			if (!this.loadAndQueuePatches(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
				receiver.send(arg0, arg1);
			}
		}
	}

	@ObfuscatedName("da.b(I)V")
	@Override
	public void poll() {
	}
}
