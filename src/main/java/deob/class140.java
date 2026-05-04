package deob;

@ObfuscatedName("mi")
public class class140 extends class23 {

	@ObfuscatedName("mi.W")
	public static int field2594 = 0;

	@ObfuscatedName("mi.U")
	public int field2592 = -1;

	@ObfuscatedName("mi.Q")
	public int field2588;

	@ObfuscatedName("mi.V")
	public int field2593;

	@ObfuscatedName("mi.X")
	public static int field2595;

	@ObfuscatedName("mi.R")
	public int[] field2589;

	public class140() {
		super(0, false);
	}

	@ObfuscatedName("mi.b(I)I")
	@Override
	public final int method124() {
		return this.field2592;
	}

	@ObfuscatedName("mi.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310 && this.method924()) {
			int[] var3 = var2[1];
			int[] var4 = var2[2];
			int var5 = this.field2593 * (this.field2588 == class27.field460 ? arg0 : this.field2588 * arg0 / class27.field460);
			int[] var6 = var2[0];
			if (this.field2593 == class70.field1276) {
				for (int var10 = 0; var10 < class70.field1276; var10++) {
					int var11 = this.field2589[var5++];
					var4[var10] = (var11 & 0xFF) << 4;
					var3[var10] = var11 >> 4 & 0xFF0;
					var6[var10] = var11 >> 12 & 0xFF0;
				}
			} else {
				for (int var7 = 0; var7 < class70.field1276; var7++) {
					int var8 = var7 * this.field2593 / class70.field1276;
					int var9 = this.field2589[var8 + var5];
					var4[var7] = (var9 & 0xFF) << 4;
					var3[var7] = var9 >> 4 & 0xFF0;
					var6[var7] = var9 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("mi.e(I)Z")
	public final boolean method924() {
		if (this.field2589 != null) {
			return true;
		} else if (this.field2592 >= 0) {
			class169 var1 = class37.method250(class39.field684, this.field2592);
			var1.method1178();
			this.field2593 = var1.field3654;
			this.field2588 = var1.field3652;
			this.field2589 = var1.field3247;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("mi.a(Lea;II)V")
	@Override
	public final void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field2592 = arg0.method301();
		}
	}

	@ObfuscatedName("mi.c(I)V")
	@Override
	public final void method127() {
		super.method127();
		this.field2589 = null;
	}
}
