package deob;

@ObfuscatedName("fa")
public final class TextureOp9 extends TextureOp {

	@ObfuscatedName("fa.db")
	public boolean field1088 = true;

	@ObfuscatedName("fa.eb")
	public boolean field1089 = true;

	public TextureOp9() {
		super(1, false);
	}

	@ObfuscatedName("fa.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field1089 = arg0.g1() == 1;
		} else if (arg1 == 1) {
			this.field1088 = arg0.g1() == 1;
		} else if (arg1 == 2) {
			super.field369 = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("fa.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, this.field1088 ? ClientMouseListener.field4158 - arg0 : arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			if (this.field1089) {
				for (int var11 = 0; var11 < Statics.field1276; var11++) {
					var7[var11] = var4[Statics.field789 - var11];
					var8[var11] = var6[Statics.field789 - var11];
					var9[var11] = var5[Statics.field789 - var11];
				}
			} else {
				for (int var10 = 0; var10 < Statics.field1276; var10++) {
					var7[var10] = var4[var10];
					var8[var10] = var6[var10];
					var9[var10] = var5[var10];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("fa.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(this.field1088 ? ClientMouseListener.field4158 - arg0 : arg0, 0);
			if (this.field1089) {
				for (int var4 = 0; var4 < Statics.field1276; var4++) {
					var2[var4] = var3[Statics.field789 - var4];
				}
			} else {
				ArrayUtil.method838(var3, 0, var2, 0, Statics.field1276);
			}
		}
		return var2;
	}
}
