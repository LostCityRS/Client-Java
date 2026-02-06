package deob;

@ObfuscatedName("ef")
public final class class35 {

	@ObfuscatedName("ef.a")
	public float[][] field730;

	@ObfuscatedName("ef.b")
	public int[] field731;

	@ObfuscatedName("ef.c")
	public final int[] field732;

	@ObfuscatedName("ef.d")
	public final int field733;

	@ObfuscatedName("ef.e")
	public final int field734;

	@ObfuscatedName("ef.f")
	public int[] field735;

	@ObfuscatedName("ef.a(II)I")
	public static int method296(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class4.method15(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	public class35() {
		class93.method738(24);
		this.field733 = class93.method738(16);
		this.field734 = class93.method738(24);
		this.field732 = new int[this.field734];
		boolean var1 = class93.method731() != 0;
		if (var1) {
			int var2 = 0;
			int var3 = class93.method738(5) + 1;
			while (var2 < this.field734) {
				int var4 = class93.method738(class147.method1099(this.field734 - var2));
				for (int var5 = 0; var5 < var4; var5++) {
					this.field732[var2++] = var3;
				}
				var3++;
			}
		} else {
			boolean var6 = class93.method731() != 0;
			for (int var7 = 0; var7 < this.field734; var7++) {
				if (var6 && class93.method731() == 0) {
					this.field732[var7] = 0;
				} else {
					this.field732[var7] = class93.method738(5) + 1;
				}
			}
		}
		this.method298();
		int var8 = class93.method738(4);
		if (var8 > 0) {
			float var9 = class93.method737(class93.method738(32));
			float var10 = class93.method737(class93.method738(32));
			int var11 = class93.method738(4) + 1;
			boolean var12 = class93.method731() != 0;
			int var13;
			if (var8 == 1) {
				var13 = method296(this.field734, this.field733);
			} else {
				var13 = this.field734 * this.field733;
			}
			this.field731 = new int[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field731[var14] = class93.method738(var11);
			}
			this.field730 = new float[this.field734][this.field733];
			if (var8 == 1) {
				for (int var15 = 0; var15 < this.field734; var15++) {
					float var16 = 0.0F;
					int var17 = 1;
					for (int var18 = 0; var18 < this.field733; var18++) {
						int var19 = var15 / var17 % var13;
						float var20 = (float) this.field731[var19] * var10 + var9 + var16;
						this.field730[var15][var18] = var20;
						if (var12) {
							var16 = var20;
						}
						var17 *= var13;
					}
				}
				return;
			}
			for (int var21 = 0; var21 < this.field734; var21++) {
				float var22 = 0.0F;
				int var23 = var21 * this.field733;
				for (int var24 = 0; var24 < this.field733; var24++) {
					float var25 = (float) this.field731[var23] * var10 + var9 + var22;
					this.field730[var21][var24] = var25;
					if (var12) {
						var22 = var25;
					}
					var23++;
				}
			}
		}
	}

	@ObfuscatedName("ef.a()[F")
	public float[] method295() {
		return this.field730[this.method297()];
	}

	@ObfuscatedName("ef.b()I")
	public int method297() {
		int var1;
		for (var1 = 0; this.field735[var1] >= 0; var1 = class93.method731() == 0 ? var1 + 1 : this.field735[var1]) {
		}
		return ~this.field735[var1];
	}

	@ObfuscatedName("ef.c()V")
	public void method298() {
		int[] var1 = new int[this.field734];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.field734; var3++) {
			int var4 = this.field732[var3];
			if (var4 != 0) {
				int var5 = 0x1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) == 0) {
					var7 = var6 | var5;
					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}
						int var10 = 0x1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}
						var2[var8] = var9 | var10;
					}
				} else {
					var7 = var2[var4 - 1];
				}
				var2[var4] = var7;
				for (int var11 = var4 + 1; var11 <= 32; var11++) {
					int var12 = var2[var11];
					if (var12 == var6) {
						var2[var11] = var7;
					}
				}
			}
		}
		this.field735 = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.field734; var14++) {
			int var15 = this.field732[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.field735[var17] == 0) {
							this.field735[var17] = var13;
						}
						var17 = this.field735[var17];
					}
					if (var17 >= this.field735.length) {
						int[] var20 = new int[this.field735.length * 2];
						for (int var21 = 0; var21 < this.field735.length; var21++) {
							var20[var21] = this.field735[var21];
						}
						this.field735 = var20;
					}
				}
				this.field735[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}
}
