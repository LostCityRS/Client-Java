package deob;

import jagex3.sound.PcmPlayer;

import java.util.Calendar;

@ObfuscatedName("ca")
public class class14 {

	@ObfuscatedName("ca.e")
	public static Calendar field453 = Calendar.getInstance();

	@ObfuscatedName("ca.B")
	public static byte field476 = 0;

	@ObfuscatedName("ca.A")
	public static int field475 = 0;

	public class14(int arg0) {
		PcmPlayer.frequency = arg0;
		Statics.field462 = Statics.currentTime();
	}

	@ObfuscatedName("ca.a(J)V")
	public void method255(long arg0) {
	}

	@ObfuscatedName("ca.a()V")
	public void method256() {
	}

	@ObfuscatedName("ca.a([II)V")
	public static synchronized void method258(int[] arg0, int arg1) {
		int var2 = 0;
		int var3 = arg1 - 7;
		while (var2 < var3) {
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
			arg0[var2++] = 0;
		}
		var3 += 7;
		while (var2 < var3) {
			arg0[var2++] = 0;
		}
		if (Statics.field1381 != null) {
			Statics.field1381.method134(arg0, 0, var3);
		}
		Statics.method949(var3);
	}
}
