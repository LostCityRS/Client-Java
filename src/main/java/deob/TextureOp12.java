package deob;

@ObfuscatedName("ma")
public final class TextureOp12 extends TextureOp {

	@ObfuscatedName("ma.eb")
	public int field2475 = 1;

	@ObfuscatedName("ma.fb")
	public int field2476 = 0;

	@ObfuscatedName("ma.hb")
	public int field2478 = 0;

	public TextureOp12() {
		super(0, true);
	}

	@ObfuscatedName("ma.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2476 = arg0.g1();
		} else if (arg1 == 1) {
			this.field2478 = arg0.g1();
		} else if (arg1 == 3) {
			this.field2475 = arg0.g1();
		}
	}

	@ObfuscatedName("ma.b(B)V")
	@Override
	public void method123() {
		Statics.method740();
	}

	@ObfuscatedName("ma.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0];
			int var4 = var3 - 2048 >> 1;
			for (int var5 = 0; var5 < Statics.field1276; var5++) {
				int var6 = Statics.field351[var5];
				int var7 = var6 - 2048 >> 1;
				int var8;
				if (this.field2476 == 0) {
					var8 = (var6 - var3) * this.field2475;
				} else {
					int var9 = var4 * var4 + var7 * var7 >> 12;
					int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
					var8 = (int) ((double) (var10 * this.field2475) * 3.141592653589793D);
				}
				int var11 = var8 - (var8 & 0xFFFFF000);
				if (this.field2478 == 0) {
					var11 = Statics.field1734[var11 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.field2478 == 2) {
					var11 -= 2048;
					if (var11 < 0) {
						var11 = -var11;
					}
					var11 = 2048 - var11 << 1;
				}
				var2[var5] = var11;
			}
		}
		return var2;
	}
}
