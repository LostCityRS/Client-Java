package deob;

@ObfuscatedName("o")
public final class TextureOp24 extends TextureOp {

	public TextureOp24() {
		super(1, true);
	}

	@ObfuscatedName("o.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[2];
			int[] var6 = var3[0];
			for (int var7 = 0; var7 < Statics.field1276; var7++) {
				var2[var7] = (var4[var7] + var6[var7] + var5[var7]) / 3;
			}
		}
		return var2;
	}
}
