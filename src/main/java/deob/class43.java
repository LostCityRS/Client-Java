package deob;

@ObfuscatedName("di")
public final class class43 extends class23 {

	@ObfuscatedName("di.ab")
	public static class17 field732 = new class17();

	@ObfuscatedName("di.bb")
	public static class144 field733;

	@ObfuscatedName("di.cb")
	public static final class88 field734 = class208.method1423(105, "oder ung-Ultiges Passwort)3");

	@ObfuscatedName("di.eb")
	public static class130[] field736;

	@ObfuscatedName("di.gb")
	public static int field738;

	@ObfuscatedName("di.hb")
	public static boolean field739 = false;

	@ObfuscatedName("di.R")
	public static int field723 = -1;

	@ObfuscatedName("di.Z")
	public static final class88 field731 = class208.method1423(105, ":trade:");

	@ObfuscatedName("di.T")
	public int field725 = 4096;

	@ObfuscatedName("di.V")
	public static int field727;

	@ObfuscatedName("di.a(BI)V")
	public static void method277(int arg0) {
		if (arg0 == 37) {
			class150.field2915 = 3.0D;
		} else if (arg0 == 50) {
			class150.field2915 = 4.0D;
		} else if (arg0 == 75) {
			class150.field2915 = 6.0D;
		} else {
			class150.field2915 = 8.0D;
		}
		class34.field594 = -1;
		class34.field594 = -1;
	}

	@ObfuscatedName("di.a(ZB)V")
	public static void method278(boolean arg0) {
		class137.field2555 = arg0;
		if (!class137.field2555) {
			int var1 = (class228.field4270 - class230.field4312.field831) / 16;
			class17.field268 = new int[var1][4];
			for (int var2 = 0; var2 < var1; var2++) {
				for (int var3 = 0; var3 < 4; var3++) {
					class17.field268[var2][var3] = class230.field4312.method299();
				}
			}
			int var4 = class230.field4312.method349();
			boolean var5 = false;
			int var6 = class230.field4312.method302();
			int var7 = class230.field4312.method301();
			int var8 = class230.field4312.method352();
			int var9 = class230.field4312.method301();
			class128.field2402 = new int[var1];
			class146.field2731 = new int[var1];
			class45.field774 = new byte[var1][];
			class27.field453 = new int[var1];
			class167.field3221 = new byte[var1][];
			int var10 = 0;
			if ((var7 / 8 == 48 || var7 / 8 == 49) && (var4 / 8) == 48) {
				var5 = true;
			}
			if (var7 / 8 == 48 && var4 / 8 == 148) {
				var5 = true;
			}
			for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
				for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
					int var13 = (var11 << 8) + var12;
					if (var5 && (var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || var11 == 49 && var12 == 47)) {
						class146.field2731[var10] = var13;
						class27.field453[var10] = -1;
						class128.field2402[var10] = -1;
					} else {
						class146.field2731[var10] = var13;
						class27.field453[var10] = class27.field451.method964(class166.method1140(new class88[] { class212.field4018, class170.method1212(var11), class50.field933, class170.method1212(var12) }));
						class128.field2402[var10] = class27.field451.method964(class166.method1140(new class88[] { class106.field1928, class170.method1212(var11), class50.field933, class170.method1212(var12) }));
					}
					var10++;
				}
			}
			class120.method820(var8, var9, var7, var4, var6);
			return;
		}
		int var14 = class230.field4312.method347();
		int var15 = class230.field4312.method343();
		int var16 = class230.field4312.method302();
		class230.field4312.method34();
		for (int var17 = 0; var17 < 4; var17++) {
			for (int var18 = 0; var18 < 13; var18++) {
				for (int var19 = 0; var19 < 13; var19++) {
					int var20 = class230.field4312.method28(1);
					if (var20 == 1) {
						class111.field2024[var17][var18][var19] = class230.field4312.method28(26);
					} else {
						class111.field2024[var17][var18][var19] = -1;
					}
				}
			}
		}
		class230.field4312.method35();
		int var21 = (class228.field4270 - class230.field4312.field831) / 16;
		class17.field268 = new int[var21][4];
		for (int var22 = 0; var22 < var21; var22++) {
			for (int var23 = 0; var23 < 4; var23++) {
				class17.field268[var22][var23] = class230.field4312.method323();
			}
		}
		int var24 = class230.field4312.method343();
		int var25 = class230.field4312.method301();
		class27.field453 = new int[var21];
		class128.field2402 = new int[var21];
		class167.field3221 = new byte[var21][];
		class146.field2731 = new int[var21];
		class45.field774 = new byte[var21][];
		int var26 = 0;
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < 13; var28++) {
				for (int var29 = 0; var29 < 13; var29++) {
					int var30 = class111.field2024[var27][var28][var29];
					if (var30 != -1) {
						int var31 = var30 >> 3 & 0x7FF;
						int var32 = var30 >> 14 & 0x3FF;
						int var33 = var31 / 8 + (var32 / 8 << 8);
						for (int var34 = 0; var34 < var26; var34++) {
							if (var33 == class146.field2731[var34]) {
								var33 = -1;
								break;
							}
						}
						if (var33 != -1) {
							class146.field2731[var26] = var33;
							int var35 = var33 >> 8 & 0xFF;
							int var36 = var33 & 0xFF;
							class27.field453[var26] = class27.field451.method964(class166.method1140(new class88[] { class212.field4018, class170.method1212(var35), class50.field933, class170.method1212(var36) }));
							class128.field2402[var26] = class27.field451.method964(class166.method1140(new class88[] { class106.field1928, class170.method1212(var35), class50.field933, class170.method1212(var36) }));
							var26++;
						}
					}
				}
			}
		}
		class120.method820(var14, var16, var15, var25, var24);
	}

	@ObfuscatedName("di.c(B)Z")
	public static boolean method279() {
		class53 var0 = class166.field3188;
		synchronized (class166.field3188) {
			if (class203.field3858 == class48.field898) {
				return false;
			} else {
				class137.field2556 = class174.field3438[class203.field3858];
				class219.field4148 = class105.field1908[class203.field3858];
				class203.field3858 = class203.field3858 + 1 & 0x7F;
				return true;
			}
		}
	}

	public class43() {
		super(1, true);
	}

	@ObfuscatedName("di.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(class220.field4158 & arg0 - 1, 0);
			int[] var4 = this.method120(arg0, 0);
			int[] var5 = this.method120(arg0 + 1 & class220.field4158, 0);
			for (int var6 = 0; var6 < class70.field1276; var6++) {
				int var7 = this.field725 * (var5[var6] - var3[var6]);
				int var8 = (var4[var6 + 1 & class45.field789] - var4[class45.field789 & var6 - 1]) * this.field725;
				int var9 = var8 >> 12;
				int var10 = var7 >> 12;
				int var11 = var9 * var9 >> 12;
				int var12 = var10 * var10 >> 12;
				int var13 = (int) (Math.sqrt((double) ((float) (var11 + var12 + 4096) / 4096.0F)) * 4096.0D);
				int var14 = var13 == 0 ? 0 : 16777216 / var13;
				var2[var6] = 4096 - var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("di.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field725 = arg0.method301();
		}
	}
}
