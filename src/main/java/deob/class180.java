package deob;

@ObfuscatedName("qf")
public final class class180 extends class23 {

	@ObfuscatedName("qf.Q")
	public static final class88 field3569 = class208.method1423(105, "Fps:");

	@ObfuscatedName("qf.T")
	public static final class88 field3572 = class208.method1423(105, "null");

	@ObfuscatedName("qf.Y")
	public static final class88 field3577 = class208.method1423(105, "unzap");

	@ObfuscatedName("qf.Z")
	public int field3578 = 585;

	@ObfuscatedName("qf.S")
	public static class41 field3571;

	@ObfuscatedName("qf.a(Lnb;B)V")
	public static void method1282(class144 arg0) {
		class204.field3883 = arg0;
	}

	@ObfuscatedName("qf.c(Z)V")
	public static void method1283() {
		int var0 = class240.field4456.field4121 + class33.field536;
		if (class247.field4511[96]) {
			class85.field1531 += (-class85.field1531 - 24) / 2;
		} else if (class247.field4511[97]) {
			class85.field1531 += (24 - class85.field1531) / 2;
		} else {
			class85.field1531 /= 2;
		}
		if (class247.field4511[98]) {
			class55.field1022 += (12 - class55.field1022) / 2;
		} else if (class247.field4511[99]) {
			class55.field1022 += (-class55.field1022 - 12) / 2;
		} else {
			class55.field1022 /= 2;
		}
		int var1 = class240.field4456.field4136 + class223.field4199;
		if (class37.field666 - var1 < -500 || class37.field666 - var1 > 500 || class233.field4366 - var0 < -500 || class233.field4366 - var0 > 500) {
			class37.field666 = var1;
			class233.field4366 = var0;
		}
		if (var1 != class37.field666) {
			class37.field666 += (var1 - class37.field666) / 16;
		}
		class207.field3930 += class85.field1531 / 2;
		class64.field1173 += class55.field1022 / 2;
		if (class233.field4366 != var0) {
			class233.field4366 += (var0 - class233.field4366) / 16;
		}
		class136.method905();
	}

	@ObfuscatedName("qf.a(ZII)I")
	public static int method1284(int arg0, int arg1) {
		int var2 = arg1 >>> 31;
		return (var2 + arg1) / arg0 - var2;
	}

	public class180() {
		super(0, true);
	}

	@ObfuscatedName("qf.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3578 = arg0.method301();
		}
	}

	@ObfuscatedName("qf.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				int var5 = class22.field351[var4];
				if (var5 > this.field3578 && 4096 - this.field3578 > var5 && var3 > 2048 - this.field3578 && var3 < this.field3578 + 2048) {
					int var6 = 2048 - var5;
					int var7 = var6 >= 0 ? var6 : -var6;
					int var8 = var7 << 12;
					int var9 = var8 / (2048 - this.field3578);
					var2[var4] = 4096 - var9;
				} else if (2048 - this.field3578 < var5 && this.field3578 + 2048 > var5) {
					int var10 = var3 - 2048;
					int var11 = var10 < 0 ? -var10 : var10;
					int var12 = var11 - this.field3578;
					int var13 = var12 << 12;
					var2[var4] = var13 / (2048 - this.field3578);
				} else if (var3 < this.field3578 || var3 > 4096 - this.field3578) {
					int var14 = var5 - 2048;
					int var15 = var14 < 0 ? -var14 : var14;
					int var16 = var15 - this.field3578;
					int var17 = var16 << 12;
					var2[var4] = var17 / (2048 - this.field3578);
				} else if (this.field3578 <= var5 && var5 <= 4096 - this.field3578) {
					var2[var4] = 0;
				} else {
					int var18 = 2048 - var3;
					int var19 = var18 < 0 ? -var18 : var18;
					int var20 = var19 << 12;
					int var21 = var20 / (2048 - this.field3578);
					var2[var4] = 4096 - var21;
				}
			}
		}
		return var2;
	}
}
