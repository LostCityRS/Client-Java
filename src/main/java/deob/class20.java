package deob;

import javax.sound.midi.*;
import java.io.ByteArrayInputStream;

@ObfuscatedName("da")
public final class class20 extends class123 implements Receiver {

	@ObfuscatedName("da.R")
	public static Sequencer field673 = null;

	@ObfuscatedName("da.T")
	public static Receiver field675 = null;

	@ObfuscatedName("da.S")
	public static volatile boolean field674 = false;

	@ObfuscatedName("da.a(BII)V")
	@Override
	public synchronized void method302(int arg0, int arg1) {
		if (field673 != null) {
			this.method996(arg0, arg1, -1L);
		}
	}

	@ObfuscatedName("da.c(B)V")
	@Override
	public void method303() {
		if (field673 != null) {
			field673.close();
			field673 = null;
		}
		if (field675 != null) {
			field675.close();
			field675 = null;
		}
	}

	public class20() {
		try {
			field675 = MidiSystem.getReceiver();
			field673 = MidiSystem.getSequencer(false);
			field673.getTransmitter().setReceiver(this);
			field673.open();
			this.method1000(-1L);
		} catch (Exception var2) {
			Statics.method1029();
		}
	}

	@ObfuscatedName("da.a(II)V")
	@Override
	public void method304(int arg0) {
		if (field673 != null) {
			this.method997(-1L, arg0);
		}
	}

	@Override
	public void close() {
	}

	@ObfuscatedName("da.a(B)V")
	@Override
	public void method305() {
		if (field673 != null) {
			field674 = false;
			field673.stop();
			this.method1000(-1L);
		}
	}

	@ObfuscatedName("da.a(IIIJ)V")
	@Override
	public void method306(int arg0, int arg1, int arg2, long arg3) {
		try {
			ShortMessage var6 = new ShortMessage();
			var6.setMessage(arg0, arg1, arg2);
			field675.send(var6, arg3);
		} catch (InvalidMidiDataException var8) {
		}
	}

	@ObfuscatedName("da.a([BZII)V")
	@Override
	public void method307(byte[] arg0, boolean arg1, int arg2) {
		if (field673 == null) {
			return;
		}
		try {
			Sequence var4 = MidiSystem.getSequence(new ByteArrayInputStream(arg0));
			field673.setSequence(var4);
			field673.setLoopCount(arg1 ? -1 : 0);
			this.method996(arg2, 0, -1L);
			field674 = true;
			field673.start();
		} catch (Exception var6) {
		}
	}

	@Override
	public synchronized void send(MidiMessage arg0, long arg1) {
		if (field674) {
			byte[] var4 = arg0.getMessage();
			if (!this.method1001(var4[0] & 0xFF, var4[1], var4.length >= 3 ? var4[2] : 0, arg1)) {
				field675.send(arg0, arg1);
			}
		}
	}

	@ObfuscatedName("da.b(I)V")
	@Override
	public void method308() {
	}
}
