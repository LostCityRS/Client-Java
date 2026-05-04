package deob;

@ObfuscatedName("aa")
public final class TextureOp33 extends TextureOp {

	@ObfuscatedName("aa.S")
	public boolean field14 = true;

	@ObfuscatedName("aa.V")
	public int field17 = 4096;

	public TextureOp33() {
		super(1, false);
	}

	@ObfuscatedName("aa.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = this.method120(ClientMouseListener.field4158 & arg0 - 1, 0);
			int[] var4 = this.method120(arg0, 0);
			int[] var5 = this.method120(arg0 + 1 & ClientMouseListener.field4158, 0);
			int[] var6 = var2[0];
			int[] var7 = var2[2];
			int[] var8 = var2[1];
			for (int var9 = 0; var9 < Statics.field1276; var9++) {
				int var10 = (var5[var9] - var3[var9]) * this.field17;
				int var11 = (var4[var9 + 1 & Statics.field789] - var4[var9 - 1 & Statics.field789]) * this.field17;
				int var12 = var11 >> 12;
				int var13 = var10 >> 12;
				int var14 = var12 * var12 >> 12;
				int var15 = var13 * var13 >> 12;
				int var16 = (int) (Math.sqrt((double) ((float) (var14 + var15 + 4096) / 4096.0F)) * 4096.0D);
				int var17;
				int var18;
				int var19;
				if (var16 == 0) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
				} else {
					var17 = var10 / var16;
					var18 = 16777216 / var16;
					var19 = var11 / var16;
				}
				if (this.field14) {
					var18 = (var18 >> 1) + 2048;
					var19 = (var19 >> 1) + 2048;
					var17 = (var17 >> 1) + 2048;
				}
				var6[var9] = var19;
				var8[var9] = var17;
				var7[var9] = var18;
			}
		}
		return var2;
	}

	@ObfuscatedName("aa.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field17 = arg0.g2();
		} else if (arg1 == 1) {
			this.field14 = arg0.g1() == 1;
		}
	}
}
