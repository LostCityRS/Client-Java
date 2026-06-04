package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("md")
public final class TextureOpColorFill extends TextureOp {

	@ObfuscatedName("md.gb")
	public int red;

	@ObfuscatedName("md.ib")
	public int green;

	@ObfuscatedName("md.R")
	public int blue;

	public TextureOpColorFill() {
		this(0);
	}

	public TextureOpColorFill(int arg0) {
		super(0, false);
		this.setColor(0);
	}

	@ObfuscatedName("md.c(IB)V")
	public void setColor(int arg0) {
		this.green = arg0 >> 4 & 0xFF0;
		this.red = (arg0 & 0xFF) << 4;
		this.blue = arg0 >> 12 & 0xFF0;
	}

	@ObfuscatedName("md.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.setColor(arg0.g3());
		}
	}

	@ObfuscatedName("md.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.getFrame(arg0);
		if (super.colorCache.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[2];
			int[] var5 = var2[1];
			for (int var6 = 0; var6 < Texture.width; var6++) {
				var3[var6] = this.blue;
				var5[var6] = this.green;
				var4[var6] = this.red;
			}
		}
		return var2;
	}
}
