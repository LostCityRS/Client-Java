package deob;

@ObfuscatedName("di")
public final class TextureOp35 extends TextureOp {

	@ObfuscatedName("di.T")
	public int field725 = 4096;

	public TextureOp35() {
		super(1, true);
	}

	@ObfuscatedName("di.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(ClientMouseListener.field4158 & arg0 - 1, 0);
			int[] var4 = this.method120(arg0, 0);
			int[] var5 = this.method120(arg0 + 1 & ClientMouseListener.field4158, 0);
			for (int var6 = 0; var6 < Statics.field1276; var6++) {
				int var7 = this.field725 * (var5[var6] - var3[var6]);
				int var8 = (var4[var6 + 1 & Statics.field789] - var4[Statics.field789 & var6 - 1]) * this.field725;
				int var9 = var8 >> 12;
				int var10 = var7 >> 12;
				int var11 = var9 * var9 >> 12;
				int var12 = var10 * var10 >> 12;
				int var13 = (int) (Math.sqrt((double) ((float) (var11 + var12 + 4096) / 4096.0F)) * 4096.0D);
				int var14 = var13 == 0 ? 0 : 16777216 / var13;
				var2[var6] = 4096 - var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("di.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field725 = arg0.g2();
		}
	}
}
