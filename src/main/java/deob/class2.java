package deob;

@ObfuscatedName("aa")
public final class class2 extends class23 {

	@ObfuscatedName("aa.bb")
	public static final class88 field23 = class208.method1423(105, "Ung-Ultiges Anmelde)2Paket)3");

	@ObfuscatedName("aa.db")
	public static int field25 = -1;

	@ObfuscatedName("aa.W")
	public static final class88 field18 = class208.method1423(105, "<col=ff7000>");

	@ObfuscatedName("aa.Q")
	public static final class88 field12 = class208.method1423(105, "null");

	@ObfuscatedName("aa.Y")
	public static final class88 field20 = class208.method1423(105, "Started 3d library");

	@ObfuscatedName("aa.cb")
	public static class88 field24 = field20;

	@ObfuscatedName("aa.Z")
	public static final class88 field21 = class208.method1423(105, ")1p");

	@ObfuscatedName("aa.S")
	public boolean field14 = true;

	@ObfuscatedName("aa.V")
	public int field17 = 4096;

	@ObfuscatedName("aa.d(B)V")
	public static void method9() {
		class230.field4312.method34();
		int var0 = class230.field4312.method28(8);
		if (class55.field1041 > var0) {
			for (int var1 = var0; var1 < class55.field1041; var1++) {
				class53.field999[class223.field4196++] = class25.field402[var1];
			}
		}
		if (var0 > class55.field1041) {
			throw new RuntimeException("gnpov1");
		}
		class55.field1041 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class25.field402[var2];
			class191 var4 = class225.field4223[var3];
			int var5 = class230.field4312.method28(1);
			if (var5 == 0) {
				class25.field402[class55.field1041++] = var3;
				var4.field4081 = class117.field2113;
			} else {
				int var6 = class230.field4312.method28(2);
				if (var6 == 0) {
					class25.field402[class55.field1041++] = var3;
					var4.field4081 = class117.field2113;
					class139.field2579[class192.field3702++] = var3;
				} else if (var6 == 1) {
					class25.field402[class55.field1041++] = var3;
					var4.field4081 = class117.field2113;
					int var7 = class230.field4312.method28(3);
					var4.method1476(false, var7);
					int var8 = class230.field4312.method28(1);
					if (var8 == 1) {
						class139.field2579[class192.field3702++] = var3;
					}
				} else if (var6 == 2) {
					class25.field402[class55.field1041++] = var3;
					var4.field4081 = class117.field2113;
					int var9 = class230.field4312.method28(3);
					var4.method1476(true, var9);
					int var10 = class230.field4312.method28(3);
					var4.method1476(true, var10);
					int var11 = class230.field4312.method28(1);
					if (var11 == 1) {
						class139.field2579[class192.field3702++] = var3;
					}
				} else if (var6 == 3) {
					class53.field999[class223.field4196++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("aa.a(Lq;B)V")
	public static void method10(class174 arg0) {
		class174 var1 = class205.method1413(arg0);
		int var2;
		int var3;
		if (var1 == null) {
			var2 = class222.field4192;
			var3 = class145.field2725;
		} else {
			var3 = var1.field3422;
			var2 = var1.field3380;
		}
		class200.method1374(arg0, var2, var3);
	}

	public class2() {
		super(1, false);
	}

	@ObfuscatedName("aa.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(class220.field4158 & arg0 - 1, 0);
			int[] var4 = this.method120(arg0, 0);
			int[] var5 = this.method120(arg0 + 1 & class220.field4158, 0);
			int[] var6 = var2[0];
			int[] var7 = var2[2];
			int[] var8 = var2[1];
			for (int var9 = 0; var9 < class70.field1276; var9++) {
				int var10 = (var5[var9] - var3[var9]) * this.field17;
				int var11 = (var4[var9 + 1 & class45.field789] - var4[var9 - 1 & class45.field789]) * this.field17;
				int var12 = var11 >> 12;
				int var13 = var10 >> 12;
				int var14 = var12 * var12 >> 12;
				int var15 = var13 * var13 >> 12;
				int var16 = (int) (Math.sqrt((double) ((float) (var14 + var15 + 4096) / 4096.0F)) * 4096.0D);
				int var17;
				int var18;
				int var19;
				if (var16 == 0) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
				} else {
					var17 = var10 / var16;
					var18 = 16777216 / var16;
					var19 = var11 / var16;
				}
				if (this.field14) {
					var18 = (var18 >> 1) + 2048;
					var19 = (var19 >> 1) + 2048;
					var17 = (var17 >> 1) + 2048;
				}
				var6[var9] = var19;
				var8[var9] = var17;
				var7[var9] = var18;
			}
		}
		return var2;
	}

	@ObfuscatedName("aa.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field17 = arg0.method301();
		} else if (arg1 == 1) {
			this.field14 = arg0.method347() == 1;
		}
	}
}
