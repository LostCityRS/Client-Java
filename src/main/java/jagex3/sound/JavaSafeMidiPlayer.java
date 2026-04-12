package jagex3.sound;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class21;
import jagex3.client.SignLink;

@ObfuscatedName("ja")
public final class JavaSafeMidiPlayer extends MidiPlayer implements Runnable {

	@ObfuscatedName("ja.T")
	public static final MidiParser field1444 = new MidiParser();

	@ObfuscatedName("ja.V")
	public static final int[] field1446 = new int[256];

	@ObfuscatedName("ja.b(I)V")
	@Override
	public synchronized void method308() {
		if (!field1444.method342()) {
			return;
		}
		long var1 = (long) (Statics.field1445 + 200 - Statics.field1442.method313()) * (long) (field1444.field760 * 1000);
		while (true) {
			while (true) {
				int var3 = field1444.method335();
				int var4 = field1444.field756[var3];
				long var5 = field1444.method336(var4);
				if (var5 > var1) {
					Statics.method540();
					return;
				}
				while (field1444.field756[var3] == var4) {
					field1444.method350(var3);
					this.method539(var5, var3);
					if (field1444.method343()) {
						field1444.method345(var3);
						if (field1444.method348()) {
							if (!Statics.field1447) {
								this.method1000((long) (var5 / (long) (field1444.field760 * 1000)));
								field1444.method340();
								Statics.method540();
								return;
							}
							field1444.method344(var5);
						}
						break;
					}
					field1444.method339(var3);
					field1444.method345(var3);
				}
			}
		}
	}

	@ObfuscatedName("ja.a(JBI)V")
	public void method539(long arg0, int arg1) {
		int var4 = field1444.method337(arg1);
		if (var4 == 1) {
			field1444.method349();
		} else if ((var4 & 0x80) != 0) {
			int var5 = (int) (arg0 / (long) (field1444.field760 * 1000));
			int var6 = var4 & 0xFF;
			int var7 = var4 >> 8 & 0xFF;
			int var8 = var4 >> 16 & 0xFF;
			if (!this.method1001(var6, var7, var8, (long) var5)) {
				Statics.method541(var7, var8, var5, var6);
				return;
			}
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (this) {
					if (Statics.field1443) {
						Statics.field1443 = false;
						return;
					}
					this.method308();
				}
				Statics.sleepPrecise(100L);
			}
		} catch (Exception var4) {
			Statics.method214(null, var4);
		}
	}

	@ObfuscatedName("ja.c(B)V")
	@Override
	public void method303() {
		synchronized (this) {
			Statics.field1443 = true;
		}
		while (true) {
			synchronized (this) {
				if (!Statics.field1443) {
					break;
				}
			}
			Statics.sleepPrecise(20L);
		}
		Statics.field1442.method312();
	}

	@ObfuscatedName("ja.a([BZII)V")
	@Override
	public synchronized void method307(byte[] arg0, boolean arg1, int arg2) {
		boolean var4 = true;
		field1444.method341(arg0);
		Statics.field1445 = 0;
		Statics.field1447 = arg1;
		Statics.field1442.method314();
		this.method996(arg2, 0, (long) Statics.field1445);
		int var5 = field1444.method338();
		for (int var6 = 0; var6 < var5; var6++) {
			field1444.method350(var6);
			while (!field1444.method343()) {
				field1444.method339(var6);
				if (field1444.field756[var6] != 0) {
					var4 = false;
					break;
				}
				this.method539(0L, var6);
			}
			field1444.method345(var6);
		}
		if (var4) {
			if (Statics.field1447) {
				throw new RuntimeException();
			}
			this.method1000((long) Statics.field1445);
			field1444.method340();
		}
		Statics.method540();
	}

	@ObfuscatedName("ja.a(II)V")
	@Override
	public synchronized void method304(int arg0) {
		this.method997((long) Statics.field1445, arg0);
		Statics.field1442.method310(field1446, Statics.field1448);
		Statics.field1448 = 0;
	}

	@ObfuscatedName("ja.a(IIIJ)V")
	@Override
	public void method306(int arg0, int arg1, int arg2, long arg3) {
		Statics.method541(arg1, arg2, (int) arg3, arg0);
	}

	@ObfuscatedName("ja.a(BII)V")
	@Override
	public synchronized void method302(int arg0, int arg1) {
		this.method996(arg0, arg1, (long) Statics.field1445);
	}

	public JavaSafeMidiPlayer(SignLink arg0, class21 arg1) {
		Statics.field1442 = arg1;
		Statics.field1442.method311();
		Statics.field1442.method314();
		this.method1000((long) Statics.field1445);
		Statics.field1442.method310(field1446, Statics.field1448);
		Statics.field1448 = 0;
		arg0.method656(10, this);
	}

	@ObfuscatedName("ja.a(B)V")
	@Override
	public synchronized void method305() {
		Statics.field1442.method314();
		this.method1000((long) Statics.field1445);
		Statics.field1442.method310(field1446, Statics.field1448);
		Statics.field1448 = 0;
		field1444.method340();
	}
}
