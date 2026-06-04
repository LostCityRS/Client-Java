package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

import java.util.Random;

@ObfuscatedName("hb")
public final class TextureOpSparkle extends TextureOp {

	@ObfuscatedName("hb.db")
	public int count = 2000;

	@ObfuscatedName("hb.Y")
	public int variance = 4096;

	@ObfuscatedName("hb.V")
	public int brightness = 0;

	@ObfuscatedName("hb.Z")
	public int length = 16;

	@ObfuscatedName("hb.W")
	public int seed = 0;

	public TextureOpSparkle() {
		super(0, true);
	}

	@ObfuscatedName("hb.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.seed = arg0.g1();
		} else if (arg1 == 1) {
			this.count = arg0.g2();
		} else if (arg1 == 2) {
			this.length = arg0.g1();
		} else if (arg1 == 3) {
			this.brightness = arg0.g2();
		} else if (arg1 == 4) {
			this.variance = arg0.g2();
		}
	}

	@ObfuscatedName("hb.b(B)V")
	@Override
	public void postDecode() {
		Statics.method740();
	}

	@ObfuscatedName("hb.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = this.variance >> 1;
			int[][] var4 = super.monoCache.method1075();
			Random var5 = new Random((long) this.seed);
			for (int var6 = 0; var6 < this.count; var6++) {
				int var7 = this.variance > 0 ? this.brightness + Statics.method812(this.variance, var5) - var3 : this.brightness;
				int var8 = var7 >> 4 & 0xFF;
				int var9 = Statics.method812(Texture.field1276, var5);
				int var10 = Statics.method812(Texture.field460, var5);
				int var11 = var10 + (this.length * Statics.field1734[var8] >> 12);
				int var12 = (Statics.field2920[var8] * this.length >> 12) + var9;
				int var13 = var12 - var9;
				int var14 = var11 - var10;
				if (var13 != 0 || var14 != 0) {
					if (var14 < 0) {
						var14 = -var14;
					}
					if (var13 < 0) {
						var13 = -var13;
					}
					boolean var15 = var14 > var13;
					if (var15) {
						int var16 = var12;
						int var17 = var9;
						var12 = var11;
						var9 = var10;
						var11 = var16;
						var10 = var17;
					}
					if (var12 < var9) {
						int var18 = var9;
						int var19 = var10;
						var9 = var12;
						var10 = var11;
						var11 = var19;
						var12 = var18;
					}
					int var20 = var10;
					int var21 = var12 - var9;
					int var22 = var11 - var10;
					int var23 = 2048 / var21;
					int var24 = -var21 / 2;
					int var25 = var11 <= var10 ? -1 : 1;
					if (var22 < 0) {
						var22 = -var22;
					}
					int var26 = 1024 - (Statics.method812(4096, var5) >> 2);
					for (int var27 = var9; var27 < var12; var27++) {
						int var28 = Texture.field789 & var27;
						var24 += var22;
						int var29 = var26 + var23 * (var27 - var9) + 1024;
						int var30 = var20 & Texture.field4158;
						if (var24 > 0) {
							var24 += -var21;
							var20 += var25;
						}
						if (var15) {
							var4[var30][var28] = var29;
						} else {
							var4[var28][var30] = var29;
						}
					}
				}
			}
		}
		return var2;
	}
}
