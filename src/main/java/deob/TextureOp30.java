package deob;

@ObfuscatedName("kd")
public final class TextureOp30 extends TextureOp {

	@ObfuscatedName("kd.fb")
	public int field2051 = 1024;

	@ObfuscatedName("kd.Y")
	public int field2044 = 3072;

	@ObfuscatedName("kd.Q")
	public int field2036 = 2048;

	public TextureOp30() {
		super(1, false);
	}

	@ObfuscatedName("kd.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			int[] var7 = var2[2];
			int[] var8 = var2[0];
			int[] var9 = var2[1];
			for (int var10 = 0; var10 < Statics.field1276; var10++) {
				var8[var10] = this.field2051 + (var6[var10] * this.field2036 >> 12);
				var9[var10] = (this.field2036 * var4[var10] >> 12) + this.field2051;
				var7[var10] = this.field2051 + (this.field2036 * var5[var10] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < Statics.field1276; var4++) {
				var2[var4] = this.field2051 + (this.field2036 * var3[var4] >> 12);
			}
		}
		return var2;
	}

	@ObfuscatedName("kd.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2051 = arg0.g2();
		} else if (arg1 == 1) {
			this.field2044 = arg0.g2();
		} else if (arg1 == 2) {
			super.field369 = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("kd.b(B)V")
	@Override
	public void method123() {
		this.field2036 = this.field2044 - this.field2051;
	}
}
