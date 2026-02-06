package deob;

@ObfuscatedName("kb")
public final class class71 {

	@ObfuscatedName("kb.b")
	public static class32 field1663 = class73.method593("Spiel)2Engine wird gestartet)3)3)3", true);

	@ObfuscatedName("kb.c")
	public static class32 field1664 = class73.method593("(U3", true);

	@ObfuscatedName("kb.d")
	public static class36 field1665;

	@ObfuscatedName("kb.e")
	public static class32 field1666 = field1681;

	@ObfuscatedName("kb.f")
	public static class32 field1667 = class73.method593(" x ", true);

	@ObfuscatedName("kb.g")
	public static class32 field1668 = class73.method593("Benutzen Sie bitte eine andere Welt)3", true);

	@ObfuscatedName("kb.j")
	public static class32 field1671 = class73.method593("null", true);

	@ObfuscatedName("kb.k")
	public int field1672;

	@ObfuscatedName("kb.l")
	public static class32 field1673 = class73.method593("runes", true);

	@ObfuscatedName("kb.m")
	public static class32 field1674 = class73.method593("blinken3:", true);

	@ObfuscatedName("kb.n")
	public static class32 field1675 = class73.method593("Clientscript error in: ", true);

	@ObfuscatedName("kb.o")
	public int field1676;

	@ObfuscatedName("kb.p")
	public static class32 field1677 = class73.method593("Sie befinden sich in einem Mitglieder)2Gebiet(Q", true);

	@ObfuscatedName("kb.s")
	public static class32 field1680 = class73.method593("60 Sekunden noch einmal)3)3)3", true);

	@ObfuscatedName("kb.t")
	public static class32 field1681 = class73.method593("Click to switch", true);

	@ObfuscatedName("kb.u")
	public int field1682;

	@ObfuscatedName("kb.w")
	public int field1684;

	@ObfuscatedName("kb.z")
	public static class32 field1687 = class73.method593("Neuer Benutzer", true);

	@ObfuscatedName("kb.A")
	public static class32 field1688 = class73.method593("sl_back", true);

	@ObfuscatedName("kb.x")
	public static class32[] field1685 = new class32[100];

	@ObfuscatedName("kb.a(ILhb;)V")
	public static void method581(class51 arg0) {
		for (int var1 = 0; var1 < class5.field99.length; var1++) {
			class5.field99[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			class5.field99[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					class9.field160[var7] = (class5.field99[var7 - 1] + class5.field99[var7 + 1] + class5.field99[var7 + -128] + class5.field99[var7 + 128]) / 4;
				}
			}
			int[] var8 = class5.field99;
			class5.field99 = class9.field160;
			class9.field160 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field1171; var10++) {
			for (int var11 = 0; var11 < arg0.field1167; var11++) {
				if (arg0.field1164[var9++] != 0) {
					int var12 = arg0.field1170 + var11 + 16;
					int var13 = var10 + arg0.field1165 + 16;
					int var14 = (var13 << 7) + var12;
					class5.field99[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("kb.a(IIIIIII)I")
	public static int method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg3;
			arg3 = var6;
		}
		int var7 = arg2 & 0x3;
		if (var7 == 0) {
			return arg1;
		} else if (var7 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (var7 == 2) {
			return 7 + 1 - arg1 - arg3;
		} else {
			return arg5;
		}
	}

	@ObfuscatedName("kb.a(II)Z")
	public static boolean method583(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("kb.a(Lf;II)Lec;")
	public static class32 method584(class36 arg0, int arg1) {
		if (!class13.method69(class147.method1100(arg0), arg1) && arg0.field794 == null) {
			return null;
		} else if (arg0.field738 == null || arg0.field738.length <= arg1 || arg0.field738[arg1] == null || arg0.field738[arg1].method275().method240() == 0) {
			return class146.field3318 ? class52.method402(new class32[] { class111.field2603, class159.method1228(arg1) }) : null;
		} else {
			return arg0.field738[arg1];
		}
	}

	@ObfuscatedName("kb.a(IIIILvc;)V")
	public static void method585(int arg0, int arg1, int arg2, class149 arg3) {
		if (class143.field3277 >= 50 || class114.field2646 == 0 || (arg3.field3368 == null || arg2 >= arg3.field3368.length)) {
			return;
		}
		int var4 = arg3.field3368[arg2];
		if (var4 == 0) {
			return;
		}
		int var5 = var4 >> 8;
		class53.field1195[class143.field3277] = var5;
		int var6 = var4 >> 4 & 0x7;
		int var7 = var4 & 0xF;
		int var8 = (arg0 - 64) / 128;
		int var9 = (arg1 - 64) / 128;
		class126.field2923[class143.field3277] = var6;
		class112.field2626[class143.field3277] = 0;
		class65.field1509[class143.field3277] = null;
		class114.field2672[class143.field3277] = var7 + (var9 << 16) + (var8 << 8);
		class143.field3277++;
	}

	@ObfuscatedName("kb.a(I)V")
	public static void method586() {
		class34.field709 = new class156(32);
	}

	@ObfuscatedName("kb.b(I)V")
	public static void method587() {
		field1687 = null;
		field1666 = null;
		field1675 = null;
		field1677 = null;
		field1688 = null;
		field1665 = null;
		field1680 = null;
		field1685 = null;
		field1663 = null;
		field1671 = null;
		field1667 = null;
		field1668 = null;
		field1664 = null;
		field1673 = null;
		field1674 = null;
		field1681 = null;
	}

	public class71() {
	}

	public class71(class71 arg0) {
		this.field1672 = arg0.field1672;
		this.field1682 = arg0.field1682;
		this.field1684 = arg0.field1684;
		this.field1676 = arg0.field1676;
	}
}
