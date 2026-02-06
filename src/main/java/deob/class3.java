package deob;

@ObfuscatedName("ab")
public final class class3 {

	@ObfuscatedName("ab.a")
	public class26 field29;

	@ObfuscatedName("ab.b")
	public int field30;

	@ObfuscatedName("ab.d")
	public class26 field32;

	@ObfuscatedName("ab.f")
	public int field34;

	@ObfuscatedName("ab.h")
	public int field36 = 0;

	@ObfuscatedName("ab.i")
	public int field37;

	@ObfuscatedName("ab.j")
	public int field38;

	@ObfuscatedName("ab.k")
	public int field39;

	@ObfuscatedName("ab.n")
	public int field42 = 0;

	@ObfuscatedName("ab.o")
	public static class63 field43 = new class63(64);

	@ObfuscatedName("ab.p")
	public static int[] field44;

	@ObfuscatedName("ab.q")
	public static class30 field45;

	@ObfuscatedName("ab.r")
	public static class49 field46;

	@ObfuscatedName("ab.s")
	public static int[] field47;

	@ObfuscatedName("ab.t")
	public static class32 field48 = class73.method593("me", true);

	@ObfuscatedName("ab.u")
	public static int field49 = 0;

	@ObfuscatedName("ab.v")
	public static byte[][][] field50 = new byte[4][104][104];

	@ObfuscatedName("ab.w")
	public static class32 field51 = class73.method593("mapedge", true);

	@ObfuscatedName("ab.a(IIII)I")
	public static int method9(int arg0, int arg1, int arg2) {
		int var3 = arg2 / arg1;
		int var4 = arg0 / arg1;
		int var5 = arg1 - 1 & arg2;
		int var6 = arg1 - 1 & arg0;
		int var7 = class11.method62(var4, var3);
		int var8 = class11.method62(var4, var3 + 1);
		int var9 = class11.method62(var4 + 1, var3);
		int var10 = class11.method62(var4 + 1, var3 - -1);
		int var11 = class131.method1005(arg1, var5, var8, var7);
		int var12 = class131.method1005(arg1, var5, var10, var9);
		return class131.method1005(arg1, var6, var12, var11);
	}

	@ObfuscatedName("ab.a(I)V")
	public static void method10() {
		field45 = null;
		field47 = null;
		field44 = null;
		field50 = null;
		field48 = null;
		field51 = null;
		field43 = null;
		field46 = null;
	}

	@ObfuscatedName("ab.a(BLea;Lea;)V")
	public static void method11(class30 arg0, class30 arg1) {
		class41.field970 = arg1;
		class158.field3634 = arg0;
	}
}
