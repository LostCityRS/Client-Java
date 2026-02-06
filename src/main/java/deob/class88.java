package deob;

@ObfuscatedName("me")
public final class class88 {

	@ObfuscatedName("me.a")
	public int field2028;

	@ObfuscatedName("me.b")
	public static int field2029 = 0;

	@ObfuscatedName("me.c")
	public static class32 field2030 = class73.method593("Error loading your profile)3", true);

	@ObfuscatedName("me.e")
	public static boolean field2032 = true;

	@ObfuscatedName("me.f")
	public int field2033;

	@ObfuscatedName("me.g")
	public int field2034;

	@ObfuscatedName("me.j")
	public class26 field2037;

	@ObfuscatedName("me.k")
	public static class157 field2038 = new class157();

	@ObfuscatedName("me.l")
	public int field2039;

	@ObfuscatedName("me.m")
	public class26 field2040;

	@ObfuscatedName("me.o")
	public class26 field2042;

	@ObfuscatedName("me.p")
	public static class32 field2043 = field2030;

	@ObfuscatedName("me.r")
	public static int field2045;

	@ObfuscatedName("me.s")
	public int field2046;

	@ObfuscatedName("me.t")
	public static class44[] field2047 = new class44[256];

	@ObfuscatedName("me.a(IILga;Ltb;)V")
	public static void method669(int arg0, class44 arg1, class134 arg2) {
		byte[] var3 = null;
		class157 var4 = class2.field18;
		synchronized (class2.field18) {
			for (class142 var5 = (class142) class2.field18.method1211(); var5 != null; var5 = (class142) class2.field18.method1209()) {
				if ((long) arg0 == var5.field3324 && arg2 == var5.field3245 && var5.field3243 == 0) {
					var3 = var5.field3249;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.method1024(arg0);
			arg1.method340(true, var6, arg0, arg2);
		} else {
			arg1.method340(true, var3, arg0, arg2);
		}
	}

	@ObfuscatedName("me.a(IIII)V")
	public static void method671(int arg0, int arg1, int arg2) {
		class125.method980();
		class141.method1066(arg1, arg0, class20.field369.field1167 + arg1, arg0 - -class20.field369.field1171);
		if (class4.field72 == 2 || class4.field72 == 5) {
			class141.method1069(arg1 + 25, arg0 + 5, class98.field2273, class2.field27);
		} else {
			int var3 = class27.field493 + class133.field3054 & 0x7FF;
			int var4 = class20.field373.field2747 / 32 + 48;
			int var5 = 464 - class20.field373.field2698 / 32;
			class142.field3252.method366(arg1 + 25, arg0 + 5, 146, 151, var4, var5, var3, class29.field527 + 256, class98.field2273, class2.field27);
			for (int var6 = 0; var6 < class82.field1908; var6++) {
				int var7 = class119.field2850[var6] * 4 + 2 - class20.field373.field2747 / 32;
				int var8 = class83.field1957[var6] * 4 + 2 - class20.field373.field2698 / 32;
				class136.method1032(arg1, arg0, var8, class158.field3624[var6], var7);
			}
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					class157 var11 = class23.field397[class43.field989][var9][var10];
					if (var11 != null) {
						int var12 = var10 * 4 + 2 - class20.field373.field2698 / 32;
						int var13 = var9 * 4 + 2 - class20.field373.field2747 / 32;
						class136.method1032(arg1, arg0, var12, class28.field515[0], var13);
					}
				}
			}
			for (int var14 = 0; var14 < class102.field2397; var14++) {
				class111 var15 = class14.field230[class15.field313[var14]];
				if (var15 != null && var15.method578()) {
					class97 var16 = var15.field2595;
					if (var16 != null && var16.field2214 != null) {
						var16 = var16.method757();
					}
					if (var16 != null && var16.field2221 && var16.field2188) {
						int var17 = var15.field2698 / 32 - class20.field373.field2698 / 32;
						int var18 = var15.field2747 / 32 - class20.field373.field2747 / 32;
						class136.method1032(arg1, arg0, var17, class28.field515[1], var18);
					}
				}
			}
			for (int var19 = 0; var19 < class62.field1404; var19++) {
				class70 var20 = class52.field1175[class137.field3187[var19]];
				if (var20 != null && var20.method578()) {
					int var21 = var20.field2747 / 32 - class20.field373.field2747 / 32;
					int var22 = var20.field2698 / 32 - class20.field373.field2698 / 32;
					long var23 = var20.field1659.method259();
					boolean var25 = false;
					for (int var26 = 0; var26 < class2.field20; var26++) {
						if (class33.field694[var26] == var23 && class91.field2094[var26] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var27 = false;
					if (class20.field373.field1637 != 0 && var20.field1637 != 0 && var20.field1637 == class20.field373.field1637) {
						var27 = true;
					}
					if (var25) {
						class136.method1032(arg1, arg0, var22, class28.field515[3], var21);
					} else if (var27) {
						class136.method1032(arg1, arg0, var22, class28.field515[4], var21);
					} else {
						class136.method1032(arg1, arg0, var22, class28.field515[2], var21);
					}
				}
			}
			if (class125.field2911 != 0 && class140.field3217 % 20 < 10) {
				if (class125.field2911 == 1 && class80.field1854 >= 0 && class80.field1854 < class14.field230.length) {
					class111 var28 = class14.field230[class80.field1854];
					if (var28 != null) {
						int var29 = var28.field2747 / 32 - class20.field373.field2747 / 32;
						int var30 = var28.field2698 / 32 - class20.field373.field2698 / 32;
						class131.method1004(var29, arg0, arg1, var30, class97.field2233[1]);
					}
				}
				if (class125.field2911 == 2) {
					int var31 = (class145.field3299 - class72.field1700) * 4 + 2 - class20.field373.field2747 / 32;
					int var32 = (class103.field2403 - class118.field2836) * 4 + 2 - class20.field373.field2698 / 32;
					class131.method1004(var31, arg0, arg1, var32, class97.field2233[1]);
				}
				if (class125.field2911 == 10 && class79.field1830 >= 0 && class52.field1175.length > class79.field1830) {
					class70 var33 = class52.field1175[class79.field1830];
					if (var33 != null) {
						int var34 = var33.field2747 / 32 - class20.field373.field2747 / 32;
						int var35 = var33.field2698 / 32 - class20.field373.field2698 / 32;
						class131.method1004(var34, arg0, arg1, var35, class97.field2233[1]);
					}
				}
			}
			if (class45.field1066 != 0) {
				int var36 = class45.field1066 * 4 + 2 - class20.field373.field2747 / 32;
				int var37 = class31.field615 * 4 + 2 - class20.field373.field2698 / 32;
				class136.method1032(arg1, arg0, var37, class97.field2233[0], var36);
			}
			class141.method1053(arg1 + 4 + 93, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (class4.field72 < 3) {
			class3.field46.method366(arg1, arg0, 33, 33, 25, 25, class133.field3054, 256, class36.field854, class132.field3034);
		} else {
			class141.method1069(arg1, arg0, class36.field854, class132.field3034);
		}
		if (class57.field1318[arg2]) {
			class20.field369.method399(arg1, arg0);
		}
		class81.field1863[arg2] = true;
	}

	@ObfuscatedName("me.a(IBI)V")
	public static void method672(int arg0, int arg1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var3[0] = arg1;
		int var4 = 1;
		var2[0] = arg0;
		for (int var5 = 0; var5 < 4; var5++) {
			if (class154.field3510[var5] != arg1) {
				var3[var4] = class154.field3510[var5];
				var2[var4] = class98.field2264[var5];
				var4++;
			}
		}
		class154.field3510 = var3;
		class98.field2264 = var2;
		class50.method394(0, class97.field2235.length - 1, class98.field2264, class154.field3510, class97.field2235);
	}
}
