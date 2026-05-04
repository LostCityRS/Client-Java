package deob;

@ObfuscatedName("hh")
public final class TextureOp32 extends TextureOp {

	@ObfuscatedName("hh.cb")
	public final int[] field1542 = new int[3];

	@ObfuscatedName("hh.db")
	public int field1543 = 3216;

	@ObfuscatedName("hh.Y")
	public int field1538 = 3216;

	@ObfuscatedName("hh.Q")
	public int field1530 = 4096;

	public TextureOp32() {
		super(1, true);
	}

	@ObfuscatedName("hh.b(B)V")
	@Override
	public void method123() {
		this.method578();
	}

	@ObfuscatedName("hh.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = this.field1530 * Statics.field738 >> 12;
			int[] var4 = this.method120(ClientMouseListener.field4158 & arg0 - 1, 0);
			int[] var5 = this.method120(arg0, 0);
			int[] var6 = this.method120(ClientMouseListener.field4158 & arg0 + 1, 0);
			for (int var7 = 0; var7 < Statics.field1276; var7++) {
				int var8 = (var6[var7] - var4[var7]) * var3 >> 12;
				int var9 = var3 * (var5[Statics.field789 & var7 - 1] - var5[var7 + 1 & Statics.field789]) >> 12;
				int var10 = var9 >> 4;
				if (var10 < 0) {
					var10 = -var10;
				}
				if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var8 >> 4;
				if (var11 < 0) {
					var11 = -var11;
				}
				if (var11 > 255) {
					var11 = 255;
				}
				int var12 = Statics.field2431[((var11 + 1) * var11 >> 1) + var10] & 0xFF;
				int var13 = var12 * 4096 >> 8;
				int var14 = this.field1542[2] * var13 >> 12;
				int var15 = var9 * var12 >> 8;
				int var16 = this.field1542[0] * var15 >> 12;
				int var17 = var8 * var12 >> 8;
				int var18 = this.field1542[1] * var17 >> 12;
				var2[var7] = var16 + var18 + var14;
			}
		}
		return var2;
	}

	@ObfuscatedName("hh.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field1530 = arg0.g2();
		} else if (arg1 == 1) {
			this.field1543 = arg0.g2();
		} else if (arg1 == 2) {
			this.field1538 = arg0.g2();
		}
	}

	@ObfuscatedName("hh.f(I)V")
	public void method578() {
		double var1 = Math.cos((double) ((float) this.field1538 / 4096.0F));
		this.field1542[0] = (int) (var1 * Math.sin((double) ((float) this.field1543 / 4096.0F)) * 4096.0D);
		this.field1542[1] = (int) (Math.cos((double) ((float) this.field1543 / 4096.0F)) * 4096.0D * var1);
		this.field1542[2] = (int) (Math.sin((double) ((float) this.field1538 / 4096.0F)) * 4096.0D);
		int var3 = this.field1542[1] * this.field1542[1] >> 12;
		int var4 = this.field1542[0] * this.field1542[0] >> 12;
		int var5 = this.field1542[2] * this.field1542[2] >> 12;
		int var6 = (int) (Math.sqrt((double) (var5 + var4 + var3 >> 12)) * 4096.0D);
		if (var6 != 0) {
			this.field1542[0] = (this.field1542[0] << 12) / var6;
			this.field1542[2] = (this.field1542[2] << 12) / var6;
			this.field1542[1] = (this.field1542[1] << 12) / var6;
		}
	}
}
