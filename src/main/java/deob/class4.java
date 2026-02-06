package deob;

@ObfuscatedName("ac")
public final class class4 extends class13 {

	@ObfuscatedName("ac.ab")
	public static class51 field71;

	@ObfuscatedName("ac.bb")
	public static int field72 = 0;

	@ObfuscatedName("ac.db")
	public static class32 field74 = class73.method593("New User", true);

	@ObfuscatedName("ac.cb")
	public static class32 field73 = field74;

	@ObfuscatedName("ac.eb")
	public int field75;

	@ObfuscatedName("ac.gb")
	public static class32 field77 = class73.method593("Your account has been disabled)3", true);

	@ObfuscatedName("ac.hb")
	public int field78;

	@ObfuscatedName("ac.ib")
	public static class32 field79 = class73.method593("Lade Sprites )2 ", true);

	@ObfuscatedName("ac.kb")
	public static class8 field81;

	@ObfuscatedName("ac.H")
	public static class32 field52 = class73.method593(" is already on your ignore list", true);

	@ObfuscatedName("ac.K")
	public static int[] field55 = new int[128];

	@ObfuscatedName("ac.X")
	public static int field68 = 0;

	@ObfuscatedName("ac.J")
	public static class32 field54 = class73.method593("Please use a different world)3", true);

	@ObfuscatedName("ac.S")
	public static class32 field63 = field54;

	@ObfuscatedName("ac.W")
	public static class32 field67 = class73.method593("Select a world", true);

	@ObfuscatedName("ac.U")
	public static class32 field65 = field67;

	@ObfuscatedName("ac.R")
	public static class32 field62 = field54;

	@ObfuscatedName("ac.T")
	public static class32 field64 = class73.method593("headicons_prayer", true);

	@ObfuscatedName("ac.Z")
	public static class32 field70 = class73.method593("Lade Eingabe)2Steuerungsprogramm)3)3)3", true);

	@ObfuscatedName("ac.O")
	public static class32 field59 = field52;

	@ObfuscatedName("ac.N")
	public static class32 field58 = field77;

	@ObfuscatedName("ac.Y")
	public static class32 field69 = class73.method593("headicons_hint", true);

	@ObfuscatedName("ac.V")
	public int field66;

	@ObfuscatedName("ac.L")
	public static class30 field56;

	@ObfuscatedName("ac.M")
	public static class30 field57;

	@ObfuscatedName("ac.a(IIILea;)[Lhb;")
	public static class51[] method12(int arg0, int arg1, class30 arg2) {
		return class28.method193(arg0, arg2, arg1) ? class144.method1084() : null;
	}

	@ObfuscatedName("ac.a(IZI)I")
	public static int method15(int arg0, int arg1) {
		if (arg1 >= 2) {
			int var2 = method15(arg0 * arg0, arg1 >> 1);
			if ((arg1 & 0x1) != 0) {
				var2 *= arg0;
			}
			return var2;
		} else if (arg1 == 1) {
			return arg0;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("ac.a(ZB)V")
	public static void method16(boolean arg0) {
		class56.field1299 = arg0;
		if (!class56.field1299) {
			int var1 = class158.field3612.method529();
			int var2 = class158.field3612.method518();
			int var3 = class158.field3612.method531();
			int var4 = (class115.field2700 - class158.field3612.field1568) / 16;
			class63.field1454 = new int[var4][4];
			for (int var5 = 0; var5 < var4; var5++) {
				for (int var6 = 0; var6 < 4; var6++) {
					class63.field1454[var5][var6] = class158.field3612.method549();
				}
			}
			int var7 = class158.field3612.method524();
			boolean var8 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && (var2 / 8) == 48) {
				var8 = true;
			}
			int var9 = class158.field3612.method531();
			class74.field1747 = new int[var4];
			class142.field3256 = new byte[var4][];
			class27.field483 = new byte[var4][];
			class39.field935 = new int[var4];
			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var8 = true;
			}
			class119.field2841 = new int[var4];
			int var10 = 0;
			for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
				for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
					int var13 = var12 + (var11 << 8);
					if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
						class39.field935[var10] = var13;
						class119.field2841[var10] = class134.field3115.method201(class52.method402(new class32[] { class36.field767, class159.method1228(var11), class19.field361, class159.method1228(var12) }));
						class74.field1747[var10] = class134.field3115.method201(class52.method402(new class32[] { class114.field2669, class159.method1228(var11), class19.field361, class159.method1228(var12) }));
						var10++;
					}
				}
			}
			class121.method955(var1, var9, var2, var3, var7);
			return;
		}
		int var14 = class158.field3612.method531();
		int var15 = class158.field3612.method520();
		int var16 = class158.field3612.method531();
		int var17 = class158.field3612.method518();
		class158.field3612.method351();
		for (int var18 = 0; var18 < 4; var18++) {
			for (int var19 = 0; var19 < 13; var19++) {
				for (int var20 = 0; var20 < 13; var20++) {
					int var21 = class158.field3612.method352(1);
					if (var21 == 1) {
						class32.field641[var18][var19][var20] = class158.field3612.method352(26);
					} else {
						class32.field641[var18][var19][var20] = -1;
					}
				}
			}
		}
		class158.field3612.method355();
		int var22 = (class115.field2700 - class158.field3612.field1568) / 16;
		class63.field1454 = new int[var22][4];
		for (int var23 = 0; var23 < var22; var23++) {
			for (int var24 = 0; var24 < 4; var24++) {
				class63.field1454[var23][var24] = class158.field3612.method509();
			}
		}
		int var25 = class158.field3612.method524();
		class74.field1747 = new int[var22];
		class27.field483 = new byte[var22][];
		class39.field935 = new int[var22];
		class119.field2841 = new int[var22];
		class142.field3256 = new byte[var22][];
		int var26 = 0;
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < 13; var28++) {
				for (int var29 = 0; var29 < 13; var29++) {
					int var30 = class32.field641[var27][var28][var29];
					if (var30 != -1) {
						int var31 = var30 >> 14 & 0x3FF;
						int var32 = var30 >> 3 & 0x7FF;
						int var33 = var32 / 8 + (var31 / 8 << 8);
						for (int var34 = 0; var34 < var26; var34++) {
							if (var33 == class39.field935[var34]) {
								var33 = -1;
								break;
							}
						}
						if (var33 != -1) {
							class39.field935[var26] = var33;
							int var35 = var33 & 0xFF;
							int var36 = var33 >> 8 & 0xFF;
							class119.field2841[var26] = class134.field3115.method201(class52.method402(new class32[] { class36.field767, class159.method1228(var36), class19.field361, class159.method1228(var35) }));
							class74.field1747[var26] = class134.field3115.method201(class52.method402(new class32[] { class114.field2669, class159.method1228(var36), class19.field361, class159.method1228(var35) }));
							var26++;
						}
					}
				}
			}
		}
		class121.method955(var15, var14, var25, var16, var17);
	}

	@ObfuscatedName("ac.a(IBII)V")
	public static void method17(int arg0, int arg1, int arg2) {
		if (class70.field1629 == 0 || arg2 == 0 || class143.field3277 >= 50) {
			return;
		}
		class53.field1195[class143.field3277] = arg0;
		class126.field2923[class143.field3277] = arg2;
		class112.field2626[class143.field3277] = arg1;
		class65.field1509[class143.field3277] = null;
		class114.field2672[class143.field3277] = 0;
		class143.field3277++;
	}

	@ObfuscatedName("ac.a(Ljd;I)V")
	public void method13(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method14(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(BILjd;)V")
	public void method14(int arg0, class66 arg1) {
		if (arg0 == 1) {
			this.field75 = arg1.method531();
			this.field66 = arg1.method532();
			this.field78 = arg1.method532();
		}
	}
}
