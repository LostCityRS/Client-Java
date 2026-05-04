package deob;

@ObfuscatedName("fb")
public final class TextureOp18 extends TextureOp39 {

	@ObfuscatedName("fb.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310 && this.method924()) {
			int[] var3 = var2[1];
			int[] var4 = var2[0];
			int[] var5 = var2[2];
			int var6 = arg0 % super.field2588 * super.field2588;
			for (int var7 = 0; var7 < Statics.field1276; var7++) {
				int var8 = super.field2589[var7 % super.field2593 + var6];
				var5[var7] = (var8 & 0xFF) << 4;
				var3[var7] = var8 >> 4 & 0xFF0;
				var4[var7] = var8 >> 12 & 0xFF0;
			}
		}
		return var2;
	}
}
