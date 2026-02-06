package deob;

@ObfuscatedName("ud")
public final class class143 extends class13 {

	@ObfuscatedName("ud.ab")
	public static class32 field3276 = class73.method593("::qa_op_test", true);

	@ObfuscatedName("ud.bb")
	public static int field3277 = 0;

	@ObfuscatedName("ud.cb")
	public static class32 field3278 = class73.method593("<img=0>", true);

	@ObfuscatedName("ud.db")
	public static int[] field3279 = new int[] { 1, -1, -1, 1 };

	@ObfuscatedName("ud.L")
	public static class66[] field3262 = new class66[2048];

	@ObfuscatedName("ud.H")
	public static class32 field3258 = class73.method593("Ung-Ultiges Anmelde)2Paket)3", true);

	@ObfuscatedName("ud.T")
	public static class63 field3269 = new class63(50);

	@ObfuscatedName("ud.V")
	public static class32 field3271 = class73.method593("Lade Texturen )2 ", true);

	@ObfuscatedName("ud.Y")
	public static class32 field3274 = class73.method593("scrollbar", true);

	@ObfuscatedName("ud.Z")
	public static final int field3275 = 7759444;

	@ObfuscatedName("ud.I")
	public int field3259;

	@ObfuscatedName("ud.M")
	public int field3263;

	@ObfuscatedName("ud.N")
	public int field3264;

	@ObfuscatedName("ud.Q")
	public int field3267;

	@ObfuscatedName("ud.K")
	public class32 field3261;

	@ObfuscatedName("ud.X")
	public static class8 field3273;

	@ObfuscatedName("ud.O")
	public int[] field3265;

	@ObfuscatedName("ud.U")
	public int[] field3270;

	@ObfuscatedName("ud.W")
	public static int[] field3272;

	@ObfuscatedName("ud.R")
	public class32[] field3268;

	@ObfuscatedName("ud.a(IIIIIII)V")
	public static void method1077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 2048 - arg4 & 0x7FF;
		int var7 = arg2;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		if (var6 != 0) {
			int var11 = class7.field113[var6];
			int var12 = class7.field121[var6];
			int var13 = var12 * 0 - arg2 * var11 >> 16;
			var7 = var11 * 0 + arg2 * var12 >> 16;
			var9 = var13;
		}
		if (var8 != 0) {
			int var14 = class7.field113[var8];
			int var15 = class7.field121[var8];
			int var16 = var15 * 0 + var14 * var7 >> 16;
			var7 = var15 * var7 - var14 * 0 >> 16;
			var10 = var16;
		}
		class73.field1719 = arg1 - var9;
		class105.field2494 = arg3 - var10;
		class48.field1126 = arg5 - var7;
		class115.field2718 = arg0;
		class45.field1049 = arg4;
	}

	@ObfuscatedName("ud.a(IIIIIBI)I")
	public static int method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			int var7 = arg3;
			arg3 = arg1;
			arg1 = var7;
		}
		if (var6 == 0) {
			return arg4;
		} else if (var6 == 1) {
			return arg0;
		} else if (var6 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}
}
