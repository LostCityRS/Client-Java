package deob;

@ObfuscatedName("qf")
public final class TextureOp14 extends TextureOp {

	@ObfuscatedName("qf.Z")
	public int field3578 = 585;

	public TextureOp14() {
		super(0, true);
	}

	@ObfuscatedName("qf.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field3578 = arg0.g2();
		}
	}

	@ObfuscatedName("qf.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			for (int var4 = 0; var4 < Statics.field1276; var4++) {
				int var5 = Statics.field351[var4];
				if (var5 > this.field3578 && 4096 - this.field3578 > var5 && var3 > 2048 - this.field3578 && var3 < this.field3578 + 2048) {
					int var6 = 2048 - var5;
					int var7 = var6 >= 0 ? var6 : -var6;
					int var8 = var7 << 12;
					int var9 = var8 / (2048 - this.field3578);
					var2[var4] = 4096 - var9;
				} else if (2048 - this.field3578 < var5 && this.field3578 + 2048 > var5) {
					int var10 = var3 - 2048;
					int var11 = var10 < 0 ? -var10 : var10;
					int var12 = var11 - this.field3578;
					int var13 = var12 << 12;
					var2[var4] = var13 / (2048 - this.field3578);
				} else if (var3 < this.field3578 || var3 > 4096 - this.field3578) {
					int var14 = var5 - 2048;
					int var15 = var14 < 0 ? -var14 : var14;
					int var16 = var15 - this.field3578;
					int var17 = var16 << 12;
					var2[var4] = var17 / (2048 - this.field3578);
				} else if (this.field3578 <= var5 && var5 <= 4096 - this.field3578) {
					var2[var4] = 0;
				} else {
					int var18 = 2048 - var3;
					int var19 = var18 < 0 ? -var18 : var18;
					int var20 = var19 << 12;
					int var21 = var20 / (2048 - this.field3578);
					var2[var4] = 4096 - var21;
				}
			}
		}
		return var2;
	}
}
