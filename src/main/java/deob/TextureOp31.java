package deob;

@ObfuscatedName("qj")
public final class TextureOp31 extends TextureOp {

	@ObfuscatedName("qj.ab")
	public int field3610 = 1365;

	@ObfuscatedName("qj.db")
	public int field3613 = 20;

	@ObfuscatedName("qj.Q")
	public int field3600 = 0;

	@ObfuscatedName("qj.T")
	public int field3603 = 0;

	public TextureOp31() {
		super(0, true);
	}

	@ObfuscatedName("qj.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < Statics.field1276; var3++) {
				int var4 = this.field3600 + (Statics.field351[var3] << 12) / this.field3610;
				int var5 = this.field3603 + (class111.field2021[arg0] << 12) / this.field3610;
				int var6 = var4;
				int var7 = var4 * var4 >> 12;
				int var8 = var5;
				int var9 = var5 * var5 >> 12;
				int var10 = 0;
				while (var9 + var7 < 16384 && var10 < this.field3613) {
					var8 = (var8 * var6 >> 12) * 2 + var5;
					var6 = var4 + var7 - var9;
					var10++;
					var9 = var8 * var8 >> 12;
					var7 = var6 * var6 >> 12;
				}
				var2[var3] = this.field3613 - 1 > var10 ? (var10 << 12) / this.field3613 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("qj.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field3610 = arg0.g2();
		} else if (arg1 == 1) {
			this.field3613 = arg0.g2();
		} else if (arg1 == 2) {
			this.field3600 = arg0.g2();
		} else if (arg1 == 3) {
			this.field3603 = arg0.g2();
		}
	}
}
