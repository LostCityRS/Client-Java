package deob;

@ObfuscatedName("kg")
public final class TextureOp6 extends TextureOp {

	@ObfuscatedName("kg.Q")
	public int field2088 = 4096;

	@ObfuscatedName("kg.Z")
	public int field2097 = 0;

	public TextureOp6() {
		super(1, false);
	}

	@ObfuscatedName("kg.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < Statics.field1276; var4++) {
				int var5 = var3[var4];
				if (this.field2097 > var5) {
					var2[var4] = this.field2097;
				} else if (this.field2088 >= var5) {
					var2[var4] = var5;
				} else {
					var2[var4] = this.field2088;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[0];
			int[] var5 = var3[2];
			int[] var6 = var3[1];
			int[] var7 = var2[1];
			int[] var8 = var2[2];
			int[] var9 = var2[0];
			for (int var10 = 0; var10 < Statics.field1276; var10++) {
				int var11 = var4[var10];
				int var12 = var6[var10];
				int var13 = var5[var10];
				if (var11 < this.field2097) {
					var9[var10] = this.field2097;
				} else if (this.field2088 >= var11) {
					var9[var10] = var11;
				} else {
					var9[var10] = this.field2088;
				}
				if (this.field2097 > var12) {
					var7[var10] = this.field2097;
				} else if (this.field2088 < var12) {
					var7[var10] = this.field2088;
				} else {
					var7[var10] = var12;
				}
				if (var13 < this.field2097) {
					var8[var10] = this.field2097;
				} else if (var13 > this.field2088) {
					var8[var10] = this.field2088;
				} else {
					var8[var10] = var13;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kg.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2097 = arg0.g2();
		} else if (arg1 == 1) {
			this.field2088 = arg0.g2();
		} else if (arg1 == 2) {
			super.field369 = arg0.g1() == 1;
		}
	}
}
