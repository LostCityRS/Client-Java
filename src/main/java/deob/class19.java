package deob;

@ObfuscatedName("bg")
public final class class19 {

	@ObfuscatedName("bg.a")
	public float[][] field306;

	@ObfuscatedName("bg.b")
	public final int[] field307;

	@ObfuscatedName("bg.c")
	public final int field308;

	@ObfuscatedName("bg.d")
	public final int field309;

	@ObfuscatedName("bg.e")
	public int[] field310;

	@ObfuscatedName("bg.f")
	public int[] field311;

	@ObfuscatedName("bg.a(II)I")
	public static int method96(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class80.method534(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	public class19() {
		class195.method1353(24);
		this.field308 = class195.method1353(16);
		this.field309 = class195.method1353(24);
		this.field307 = new int[this.field309];
		boolean var1 = class195.method1348() != 0;
		if (var1) {
			int var2 = 0;
			int var3 = class195.method1353(5) + 1;
			while (var2 < this.field309) {
				int var4 = class195.method1353(class55.method407(this.field309 - var2));
				for (int var5 = 0; var5 < var4; var5++) {
					this.field307[var2++] = var3;
				}
				var3++;
			}
		} else {
			boolean var6 = class195.method1348() != 0;
			for (int var7 = 0; var7 < this.field309; var7++) {
				if (var6 && class195.method1348() == 0) {
					this.field307[var7] = 0;
				} else {
					this.field307[var7] = class195.method1353(5) + 1;
				}
			}
		}
		this.method93();
		int var8 = class195.method1353(4);
		if (var8 > 0) {
			float var9 = class195.method1351(class195.method1353(32));
			float var10 = class195.method1351(class195.method1353(32));
			int var11 = class195.method1353(4) + 1;
			boolean var12 = class195.method1348() != 0;
			int var13;
			if (var8 == 1) {
				var13 = method96(this.field309, this.field308);
			} else {
				var13 = this.field309 * this.field308;
			}
			this.field310 = new int[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field310[var14] = class195.method1353(var11);
			}
			this.field306 = new float[this.field309][this.field308];
			if (var8 == 1) {
				for (int var15 = 0; var15 < this.field309; var15++) {
					float var16 = 0.0F;
					int var17 = 1;
					for (int var18 = 0; var18 < this.field308; var18++) {
						int var19 = var15 / var17 % var13;
						float var20 = (float) this.field310[var19] * var10 + var9 + var16;
						this.field306[var15][var18] = var20;
						if (var12) {
							var16 = var20;
						}
						var17 *= var13;
					}
				}
				return;
			}
			for (int var21 = 0; var21 < this.field309; var21++) {
				float var22 = 0.0F;
				int var23 = var21 * this.field308;
				for (int var24 = 0; var24 < this.field308; var24++) {
					float var25 = (float) this.field310[var23] * var10 + var9 + var22;
					this.field306[var21][var24] = var25;
					if (var12) {
						var22 = var25;
					}
					var23++;
				}
			}
		}
	}

	@ObfuscatedName("bg.a()V")
	public void method93() {
		int[] var1 = new int[this.field309];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.field309; var3++) {
			int var4 = this.field307[var3];
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
		this.field311 = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.field309; var14++) {
			int var15 = this.field307[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.field311[var17] == 0) {
							this.field311[var17] = var13;
						}
						var17 = this.field311[var17];
					}
					if (var17 >= this.field311.length) {
						int[] var20 = new int[this.field311.length * 2];
						for (int var21 = 0; var21 < this.field311.length; var21++) {
							var20[var21] = this.field311[var21];
						}
						this.field311 = var20;
					}
				}
				this.field311[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}

	@ObfuscatedName("bg.b()[F")
	public float[] method94() {
		return this.field306[this.method95()];
	}

	@ObfuscatedName("bg.c()I")
	public int method95() {
		int var1;
		for (var1 = 0; this.field311[var1] >= 0; var1 = class195.method1348() == 0 ? var1 + 1 : this.field311[var1]) {
		}
		return ~this.field311[var1];
	}
}
