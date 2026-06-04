package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("pd")
public final class TextureOpHSL extends TextureOp {

	@ObfuscatedName("pd.bb")
	public int field3213;

	@ObfuscatedName("pd.gb")
	public int saturation = 0;

	@ObfuscatedName("pd.mb")
	public int field3224;

	@ObfuscatedName("pd.ob")
	public int hueShift = 0;

	@ObfuscatedName("pd.T")
	public int brightness = 0;

	@ObfuscatedName("pd.U")
	public int field3207;

	@ObfuscatedName("pd.V")
	public int field3208;

	@ObfuscatedName("pd.X")
	public int field3209;

	@ObfuscatedName("pd.Y")
	public int field3210;

	public TextureOpHSL() {
		super(1, false);
	}

	@ObfuscatedName("pd.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.hueShift = arg0.g2b();
		} else if (arg1 == 1) {
			this.saturation = (arg0.g1b() << 12) / 100;
		} else if (arg1 == 2) {
			this.brightness = (arg0.g1b() << 12) / 100;
		}
	}

	@ObfuscatedName("pd.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.method1539(arg0);
		if (super.colorCache.field4310) {
			int[][] var3 = this.getInputColor(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[0];
			int[] var6 = var3[2];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < Texture.field1276; var10++) {
				this.rgbToHsl(var4[var10], var5[var10], var6[var10]);
				this.field3213 += this.brightness;
				if (this.field3213 < 0) {
					this.field3213 = 0;
				}
				for (this.field3209 += this.hueShift; this.field3209 < 0; this.field3209 += 4096) {
				}
				if (this.field3213 > 4096) {
					this.field3213 = 4096;
				}
				while (this.field3209 > 4096) {
					this.field3209 -= 4096;
				}
				this.field3207 += this.saturation;
				if (this.field3207 < 0) {
					this.field3207 = 0;
				}
				if (this.field3207 > 4096) {
					this.field3207 = 4096;
				}
				this.hslToRgb(this.field3207, this.field3209, this.field3213);
				var7[var10] = this.field3210;
				var8[var10] = this.field3208;
				var9[var10] = this.field3224;
			}
		}
		return var2;
	}

	@ObfuscatedName("pd.a(IIII)V")
	public void hslToRgb(int arg0, int arg1, int arg2) {
		int var4 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (var4 <= 0) {
			this.field3210 = this.field3208 = this.field3224 = arg2;
			return;
		}
		int var5 = arg2 + arg2 - var4;
		int var6 = arg1 * 6;
		int var7 = (var4 - var5 << 12) / var4;
		int var8 = var6 >> 12;
		int var9 = var6 - (var8 << 12);
		int var10 = var4 * var7 >> 12;
		int var11 = var9 * var10 >> 12;
		int var12 = var4 - var11;
		int var13 = var5 + var11;
		if (var8 == 0) {
			this.field3208 = var13;
			this.field3224 = var5;
			this.field3210 = var4;
			return;
		}
		if (var8 == 1) {
			this.field3224 = var5;
			this.field3208 = var4;
			this.field3210 = var12;
			return;
		}
		if (var8 == 2) {
			this.field3224 = var13;
			this.field3208 = var4;
			this.field3210 = var5;
			return;
		}
		if (var8 == 3) {
			this.field3210 = var5;
			this.field3224 = var4;
			this.field3208 = var12;
			return;
		}
		if (var8 == 4) {
			this.field3210 = var13;
			this.field3224 = var4;
			this.field3208 = var5;
			return;
		}
		if (var8 == 5) {
			this.field3210 = var4;
			this.field3208 = var5;
			this.field3224 = var12;
			return;
		}
	}

	@ObfuscatedName("pd.b(IIII)V")
	public void rgbToHsl(int arg0, int arg1, int arg2) {
		int var4 = arg0 >= arg1 ? arg0 : arg1;
		int var5 = var4 >= arg2 ? var4 : arg2;
		int var6 = arg0 > arg1 ? arg1 : arg0;
		int var7 = var6 <= arg2 ? var6 : arg2;
		this.field3213 = (var5 + var7) / 2;
		int var8 = var5 - var7;
		if (var8 <= 0) {
			this.field3209 = 0;
		} else {
			int var9 = (var5 - arg0 << 12) / var8;
			int var10 = (var5 - arg1 << 12) / var8;
			int var11 = (var5 - arg2 << 12) / var8;
			if (var5 == arg1) {
				this.field3209 = arg0 == var7 ? var11 + 20480 : 4096 - var9;
			} else if (var5 == arg0) {
				this.field3209 = arg2 == var7 ? var10 + 4096 : 12288 - var11;
			} else {
				this.field3209 = var7 == arg1 ? var9 + 12288 : -var10 + 20480;
			}
			this.field3209 /= 6;
		}
		if (this.field3213 > 0 && this.field3213 < 4096) {
			this.field3207 = (var8 << 12) / (this.field3213 <= 2048 ? this.field3213 * 2 : 8192 - (this.field3213 * 2));
		} else {
			this.field3207 = 0;
		}
	}
}
