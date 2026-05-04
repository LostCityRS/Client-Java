package deob;

@ObfuscatedName("fd")
public final class TextureOp19 extends TextureOp {

	@ObfuscatedName("fd.Y")
	public int field1129 = 32768;

	public TextureOp19() {
		super(3, false);
	}

	@ObfuscatedName("fd.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field1129 = arg0.g2() << 4;
		} else if (arg1 == 1) {
			super.field369 = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("fd.b(B)V")
	@Override
	public void method123() {
		Statics.method740();
	}

	@ObfuscatedName("fd.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 1);
			int[] var4 = this.method120(arg0, 2);
			for (int var5 = 0; var5 < Statics.field1276; var5++) {
				int var6 = this.field1129 * var4[var5] >> 12;
				int var7 = var3[var5] >> 4 & 0xFF;
				int var8 = Statics.field2920[var7] * var6 >> 12;
				int var9 = Statics.field1734[var7] * var6 >> 12;
				int var10 = var5 + (var8 >> 12) & Statics.field789;
				int var11 = ClientMouseListener.field4158 & (var9 >> 12) + arg0;
				int[] var12 = this.method120(var11, 0);
				var2[var5] = var12[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("fd.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(arg0, 1);
			int[] var4 = this.method120(arg0, 2);
			int[] var5 = var2[0];
			int[] var6 = var2[1];
			int[] var7 = var2[2];
			for (int var8 = 0; var8 < Statics.field1276; var8++) {
				int var9 = var3[var8] * 255 >> 12 & 0xFF;
				int var10 = this.field1129 * var4[var8] >> 12;
				int var11 = var10 * Statics.field2920[var9] >> 12;
				int var12 = var10 * Statics.field1734[var9] >> 12;
				int var13 = var8 + (var11 >> 12) & Statics.field789;
				int var14 = arg0 + (var12 >> 12) & ClientMouseListener.field4158;
				int[][] var15 = this.method121(0, var14);
				var5[var8] = var15[0][var13];
				var6[var8] = var15[1][var13];
				var7[var8] = var15[2][var13];
			}
		}
		return var2;
	}
}
