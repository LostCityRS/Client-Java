package deob;

@ObfuscatedName("ve")
public final class TextureOp22 extends TextureOp {

	public TextureOp22() {
		super(1, false);
	}

	@ObfuscatedName("ve.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < Statics.field1276; var4++) {
				var2[var4] = 4096 - var3[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[1];
			int[] var6 = var3[2];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < Statics.field1276; var10++) {
				var9[var10] = 4096 - var4[var10];
				var7[var10] = 4096 - var5[var10];
				var8[var10] = 4096 - var6[var10];
			}
		}
		return var2;
	}

	@ObfuscatedName("ve.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			super.field369 = arg0.g1() == 1;
		}
	}
}
