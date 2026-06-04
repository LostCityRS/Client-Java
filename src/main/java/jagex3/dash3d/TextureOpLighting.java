package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("hh")
public final class TextureOpLighting extends TextureOp {

	@ObfuscatedName("lj.d")
	public static final byte[] field2431;

	static {
		int var0 = 0;
		field2431 = new byte[32896];
		for (int var1 = 0; var1 < 256; var1++) {
			for (int var2 = 0; var2 <= var1; var2++) {
				field2431[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F)));
			}
		}
	}

	@ObfuscatedName("hh.cb")
	public final int[] lightDir = new int[3];

	@ObfuscatedName("hh.db")
	public int azimuth = 3216;

	@ObfuscatedName("hh.Y")
	public int altitude = 3216;

	@ObfuscatedName("hh.Q")
	public int intensity = 4096;

	public TextureOpLighting() {
		super(1, true);
	}

	@ObfuscatedName("hh.b(B)V")
	@Override
	public void postDecode() {
		this.computeLightDir();
	}

	@ObfuscatedName("hh.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = this.intensity * Texture.field738 >> 12;
			int[] var4 = this.getInputMono(Texture.field4158 & arg0 - 1, 0);
			int[] var5 = this.getInputMono(arg0, 0);
			int[] var6 = this.getInputMono(Texture.field4158 & arg0 + 1, 0);
			for (int var7 = 0; var7 < Texture.field1276; var7++) {
				int var8 = (var6[var7] - var4[var7]) * var3 >> 12;
				int var9 = var3 * (var5[Texture.field789 & var7 - 1] - var5[var7 + 1 & Texture.field789]) >> 12;
				int var10 = var9 >> 4;
				if (var10 < 0) {
					var10 = -var10;
				}
				if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var8 >> 4;
				if (var11 < 0) {
					var11 = -var11;
				}
				if (var11 > 255) {
					var11 = 255;
				}
				int var12 = field2431[((var11 + 1) * var11 >> 1) + var10] & 0xFF;
				int var13 = var12 * 4096 >> 8;
				int var14 = this.lightDir[2] * var13 >> 12;
				int var15 = var9 * var12 >> 8;
				int var16 = this.lightDir[0] * var15 >> 12;
				int var17 = var8 * var12 >> 8;
				int var18 = this.lightDir[1] * var17 >> 12;
				var2[var7] = var16 + var18 + var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("hh.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.intensity = arg0.g2();
		} else if (arg1 == 1) {
			this.azimuth = arg0.g2();
		} else if (arg1 == 2) {
			this.altitude = arg0.g2();
		}
	}

	@ObfuscatedName("hh.f(I)V")
	public void computeLightDir() {
		double var1 = Math.cos((double) ((float) this.altitude / 4096.0F));
		this.lightDir[0] = (int) (var1 * Math.sin((double) ((float) this.azimuth / 4096.0F)) * 4096.0D);
		this.lightDir[1] = (int) (Math.cos((double) ((float) this.azimuth / 4096.0F)) * 4096.0D * var1);
		this.lightDir[2] = (int) (Math.sin((double) ((float) this.altitude / 4096.0F)) * 4096.0D);
		int var3 = this.lightDir[1] * this.lightDir[1] >> 12;
		int var4 = this.lightDir[0] * this.lightDir[0] >> 12;
		int var5 = this.lightDir[2] * this.lightDir[2] >> 12;
		int var6 = (int) (Math.sqrt((double) (var5 + var4 + var3 >> 12)) * 4096.0D);
		if (var6 != 0) {
			this.lightDir[0] = (this.lightDir[0] << 12) / var6;
			this.lightDir[2] = (this.lightDir[2] << 12) / var6;
			this.lightDir[1] = (this.lightDir[1] << 12) / var6;
		}
	}
}
