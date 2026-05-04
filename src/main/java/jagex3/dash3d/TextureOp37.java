package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("jf")
public final class TextureOp37 extends TextureOp {

	@ObfuscatedName("jf.ab")
	public int field1885 = 0;

	@ObfuscatedName("jf.bb")
	public int field1886 = 8192;

	@ObfuscatedName("jf.jb")
	public int field1894 = 2048;

	@ObfuscatedName("jf.mb")
	public int field1897 = 12288;

	@ObfuscatedName("jf.T")
	public int field1878 = 4096;

	@ObfuscatedName("jf.Q")
	public int field1875 = 2048;

	@ObfuscatedName("jf.W")
	public int field1881 = 0;

	@ObfuscatedName("jf.c(B)I")
	public static int method717() {
		return 6;
	}

	public TextureOp37() {
		super(0, true);
	}

	@ObfuscatedName("jf.b(IBI)Z")
	public boolean method715(int arg0, int arg1) {
		int var3 = this.field1897 * (arg1 + arg0) >> 12;
		int var4 = Statics.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.field1897;
		int var6 = (var5 << 12) / this.field1886;
		int var7 = this.field1878 * var6 >> 12;
		return arg1 - arg0 < var7 && -var7 < arg1 - arg0;
	}

	@ObfuscatedName("jf.b(B)V")
	@Override
	public void method123() {
		Statics.method740();
	}

	@ObfuscatedName("jf.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field1875 = arg0.g2();
		} else if (arg1 == 1) {
			this.field1885 = arg0.g2();
		} else if (arg1 == 2) {
			this.field1881 = arg0.g2();
		} else if (arg1 == 3) {
			this.field1894 = arg0.g2();
		} else if (arg1 == 4) {
			this.field1897 = arg0.g2();
		} else if (arg1 == 5) {
			this.field1878 = arg0.g2();
		} else if (arg1 == 6) {
			this.field1886 = arg0.g2();
		}
	}

	@ObfuscatedName("jf.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = Texture.field2021[arg0] - 2048;
			for (int var4 = 0; var4 < Texture.field1276; var4++) {
				int var5 = Texture.field351[var4] - 2048;
				int var6 = var5 + this.field1875;
				int var7 = this.field1885 + var3;
				int var8 = var7 >= -2048 ? var7 : var7 + 4096;
				int var9 = var8 > 2048 ? var8 - 4096 : var8;
				int var10 = var6 < -2048 ? var6 + 4096 : var6;
				int var11 = var10 <= 2048 ? var10 : var10 - 4096;
				int var12 = this.field1894 + var3;
				int var13 = var12 < -2048 ? var12 + 4096 : var12;
				int var14 = var13 <= 2048 ? var13 : var13 - 4096;
				int var15 = this.field1881 + var5;
				int var16 = var15 >= -2048 ? var15 : var15 + 4096;
				int var17 = var16 <= 2048 ? var16 : var16 - 4096;
				var2[var4] = this.method722(var11, var9) || this.method715(var17, var14) ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("jf.b(III)Z")
	public boolean method722(int arg0, int arg1) {
		int var3 = (arg1 - arg0) * this.field1897 >> 12;
		int var4 = Statics.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.field1897;
		int var6 = (var5 << 12) / this.field1886;
		int var7 = this.field1878 * var6 >> 12;
		return var7 > arg0 + arg1 && -var7 < arg1 + arg0;
	}
}
