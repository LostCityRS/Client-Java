package deob;

@ObfuscatedName("tf")
public final class class138 {

	@ObfuscatedName("tf.a")
	public final int field3195 = class93.method738(24);

	@ObfuscatedName("tf.b")
	public final int[] field3196;

	@ObfuscatedName("tf.c")
	public final int field3197 = class93.method738(24);

	@ObfuscatedName("tf.d")
	public final int field3198 = class93.method738(8);

	@ObfuscatedName("tf.e")
	public final int field3199 = class93.method738(24) + 1;

	@ObfuscatedName("tf.f")
	public final int field3200 = class93.method738(6) + 1;

	@ObfuscatedName("tf.g")
	public final int field3201 = class93.method738(16);

	public class138() {
		int[] var1 = new int[this.field3200];
		for (int var2 = 0; var2 < this.field3200; var2++) {
			int var3 = 0;
			int var4 = class93.method738(3);
			boolean var5 = class93.method731() != 0;
			if (var5) {
				var3 = class93.method738(5);
			}
			var1[var2] = var3 << 3 | var4;
		}
		this.field3196 = new int[this.field3200 * 8];
		for (int var6 = 0; var6 < this.field3200 * 8; var6++) {
			this.field3196[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class93.method738(8);
		}
	}

	@ObfuscatedName("tf.a([FIZ)V")
	public void method1042(float[] arg0, int arg1, boolean arg2) {
		for (int var4 = 0; var4 < arg1; var4++) {
			arg0[var4] = 0.0F;
		}
		if (arg2) {
			return;
		}
		int var5 = class93.field2148[this.field3198].field733;
		int var6 = this.field3195 - this.field3197;
		int var7 = var6 / this.field3199;
		int[] var8 = new int[var7];
		for (int var9 = 0; var9 < 8; var9++) {
			int var10 = 0;
			while (var10 < var7) {
				if (var9 == 0) {
					int var11 = class93.field2148[this.field3198].method297();
					for (int var12 = var5 - 1; var12 >= 0; var12--) {
						if (var10 + var12 < var7) {
							var8[var10 + var12] = var11 % this.field3200;
						}
						var11 /= this.field3200;
					}
				}
				for (int var13 = 0; var13 < var5; var13++) {
					int var14 = var8[var10];
					int var15 = this.field3196[var14 * 8 + var9];
					if (var15 >= 0) {
						int var16 = this.field3197 + var10 * this.field3199;
						class35 var17 = class93.field2148[var15];
						if (this.field3201 == 0) {
							int var18 = this.field3199 / var17.field733;
							for (int var19 = 0; var19 < var18; var19++) {
								float[] var20 = var17.method295();
								for (int var21 = 0; var21 < var17.field733; var21++) {
									arg0[var16 + var19 + var21 * var18] += var20[var21];
								}
							}
						} else {
							int var22 = 0;
							while (var22 < this.field3199) {
								float[] var23 = var17.method295();
								for (int var24 = 0; var24 < var17.field733; var24++) {
									arg0[var16 + var22] += var23[var24];
									var22++;
								}
							}
						}
					}
					var10++;
					if (var10 >= var7) {
						break;
					}
				}
			}
		}
	}
}
