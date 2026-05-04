package deob;

@ObfuscatedName("t")
public class class207 extends class27 {

	@ObfuscatedName("t.m")
	public static final int field3925 = 50;

	@ObfuscatedName("t.n")
	public static final int[] field3926 = new int[field3925];

	@ObfuscatedName("t.o")
	public static final class88 field3927 = class208.method1423(105, ":chalreq:");

	@ObfuscatedName("t.q")
	public static final int[] field3929 = new int[field3925];

	@ObfuscatedName("t.r")
	public static int field3930 = 0;

	@ObfuscatedName("t.s")
	public static final int[] field3931 = new int[field3925];

	@ObfuscatedName("t.t")
	public static final int[] field3932 = new int[field3925];

	@ObfuscatedName("t.u")
	public static final class88[] field3933 = new class88[field3925];

	@ObfuscatedName("t.v")
	public static int field3934;

	@ObfuscatedName("t.x")
	public static final class88 field3936 = class208.method1423(105, "Bitte laden Sie die Seite neu)3");

	@ObfuscatedName("t.z")
	public static final int[] field3938 = new int[field3925];

	@ObfuscatedName("t.B")
	public static final int[] field3940 = new int[field3925];

	@ObfuscatedName("t.C")
	public static int field3941 = 0;

	@ObfuscatedName("t.y")
	public static final int[] field3937 = new int[field3925];

	@ObfuscatedName("t.b(III)V")
	public static void method1419(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field949 = null;
		}
	}

	@ObfuscatedName("t.a(IIBIII)V")
	public static void method1420(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var8 = arg3 + 1;
		class230.method1534(arg0, arg4, arg1, class3.field42[arg3]);
		int var7 = arg2 - 1;
		class230.method1534(arg0, arg4, arg1, class3.field42[arg2]);
		for (int var5 = var8; var5 <= var7; var5++) {
			int[] var6 = class3.field42[var5];
			var6[arg0] = var6[arg1] = arg4;
		}
	}

	@ObfuscatedName("t.a(IIIIIIIIIZII)Z")
	public static boolean method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		if (class240.field4456.field4103 == 2) {
			return class108.method737(arg8, arg10, arg5, arg0, arg4, arg6, arg1, arg3, arg9, arg7, arg2);
		} else if (class240.field4456.field4103 > 2) {
			return class241.method1591(arg5, arg3, class240.field4456.field4103, arg6, arg2, arg4, arg1, arg8, arg10, arg7, arg9, arg0);
		} else {
			return class99.method690(arg2, arg6, arg10, arg4, arg3, arg0, arg1, arg5, arg7, arg9, arg8);
		}
	}
}
