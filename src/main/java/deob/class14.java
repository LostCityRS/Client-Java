package deob;

import java.util.Calendar;

@ObfuscatedName("ca")
public class class14 {

	@ObfuscatedName("ca.e")
	public static Calendar field453 = Calendar.getInstance();

	@ObfuscatedName("ca.g")
	public static JagString field455 = JagString.wrap("backright1");

	@ObfuscatedName("ca.l")
	public static JagString field460 = JagString.wrap("Unexpected loginserver response)3");

	@ObfuscatedName("ca.d")
	public static JagString field452 = field460;

	@ObfuscatedName("ca.p")
	public static int field464 = 0;

	@ObfuscatedName("ca.q")
	public static JagString field465 = JagString.wrap("You have only just left another world)3");

	@ObfuscatedName("ca.r")
	public static int field466 = 0;

	@ObfuscatedName("ca.s")
	public static JagString field467 = JagString.wrap("Duell akzeptieren");

	@ObfuscatedName("ca.t")
	public static JagString field468 = field465;

	@ObfuscatedName("ca.w")
	public static int[] field471 = new int[5];

	@ObfuscatedName("ca.y")
	public static JagString field473 = JagString.wrap("runes");

	@ObfuscatedName("ca.B")
	public static byte field476 = 0;

	@ObfuscatedName("ca.C")
	public static JagString field477 = JagString.wrap("_");

	@ObfuscatedName("ca.z")
	public static JagString field474 = JagString.wrap("welle2:");

	@ObfuscatedName("ca.A")
	public static int field475 = 0;

	@ObfuscatedName("ca.E")
	public static JagString field479 = JagString.wrap("");

	@ObfuscatedName("ca.D")
	public static JagString field478 = JagString.wrap("backhmid2");

	public class14(int arg0) {
		Statics.field192 = arg0;
		Statics.field462 = Statics.method869();
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
