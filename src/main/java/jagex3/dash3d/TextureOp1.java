package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("md")
public final class TextureOp1 extends TextureOp {

	@ObfuscatedName("md.gb")
	public int field2520;

	@ObfuscatedName("md.ib")
	public int field2522;

	@ObfuscatedName("md.R")
	public int field2505;

	public TextureOp1() {
		this(0);
	}

	public TextureOp1(int arg0) {
		super(0, false);
		this.method899(0);
	}

	@ObfuscatedName("md.c(IB)V")
	public void method899(int arg0) {
		this.field2522 = arg0 >> 4 & 0xFF0;
		this.field2520 = (arg0 & 0xFF) << 4;
		this.field2505 = arg0 >> 12 & 0xFF0;
	}

	@ObfuscatedName("md.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.method899(arg0.g3());
		}
	}

	@ObfuscatedName("md.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[2];
			int[] var5 = var2[1];
			for (int var6 = 0; var6 < Texture.field1276; var6++) {
				var3[var6] = this.field2505;
				var5[var6] = this.field2522;
				var4[var6] = this.field2520;
			}
		}
		return var2;
	}
}
