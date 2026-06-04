package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("qj")
public final class TextureOpMandelbrot extends TextureOp {

	@ObfuscatedName("qj.ab")
	public int zoom = 1365;

	@ObfuscatedName("qj.db")
	public int maxIterations = 20;

	@ObfuscatedName("qj.Q")
	public int centerX = 0;

	@ObfuscatedName("qj.T")
	public int centerY = 0;

	public TextureOpMandelbrot() {
		super(0, true);
	}

	@ObfuscatedName("qj.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			for (int var3 = 0; var3 < Texture.field1276; var3++) {
				int var4 = this.centerX + (Texture.field351[var3] << 12) / this.zoom;
				int var5 = this.centerY + (Texture.field2021[arg0] << 12) / this.zoom;
				int var6 = var4;
				int var7 = var4 * var4 >> 12;
				int var8 = var5;
				int var9 = var5 * var5 >> 12;
				int var10 = 0;
				while (var9 + var7 < 16384 && var10 < this.maxIterations) {
					var8 = (var8 * var6 >> 12) * 2 + var5;
					var6 = var4 + var7 - var9;
					var10++;
					var9 = var8 * var8 >> 12;
					var7 = var6 * var6 >> 12;
				}
				var2[var3] = this.maxIterations - 1 > var10 ? (var10 << 12) / this.maxIterations : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("qj.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.zoom = arg0.g2();
		} else if (arg1 == 1) {
			this.maxIterations = arg0.g2();
		} else if (arg1 == 2) {
			this.centerX = arg0.g2();
		} else if (arg1 == 3) {
			this.centerY = arg0.g2();
		}
	}
}
