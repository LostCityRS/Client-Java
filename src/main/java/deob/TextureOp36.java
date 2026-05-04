package deob;

@ObfuscatedName("s")
public final class TextureOp36 extends TextureOp {

	@ObfuscatedName("s.ab")
	public int field3760 = -1;

	@ObfuscatedName("s.jb")
	public int[] field3769;

	@ObfuscatedName("s.R")
	public int field3751;

	@ObfuscatedName("s.S")
	public int field3752;

	public TextureOp36() {
		super(0, false);
	}

	@ObfuscatedName("s.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310 && this.method1361()) {
			int var3 = this.field3752 * (Statics.field460 == this.field3751 ? arg0 : arg0 * this.field3751 / Statics.field460);
			int[] var4 = var2[0];
			int[] var5 = var2[1];
			int[] var6 = var2[2];
			if (Statics.field1276 == this.field3752) {
				for (int var10 = 0; var10 < Statics.field1276; var10++) {
					int var11 = this.field3769[var3++];
					var6[var10] = (var11 & 0xFF) << 4;
					var5[var10] = var11 >> 4 & 0xFF0;
					var4[var10] = var11 >> 12 & 0xFF0;
				}
			} else {
				for (int var7 = 0; var7 < Statics.field1276; var7++) {
					int var8 = this.field3752 * var7 / Statics.field1276;
					int var9 = this.field3769[var8 + var3];
					var6[var7] = (var9 & 0xFF) << 4;
					var5[var7] = var9 >> 4 & 0xFF0;
					var4[var7] = var9 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("s.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field3760 = arg0.g2();
		}
	}

	@ObfuscatedName("s.d(I)I")
	@Override
	public int method129() {
		return this.field3760;
	}

	@ObfuscatedName("s.c(I)V")
	@Override
	public void method127() {
		super.method127();
		this.field3769 = null;
	}

	@ObfuscatedName("s.f(I)Z")
	public boolean method1361() {
		if (this.field3769 != null) {
			return true;
		} else if (this.field3760 >= 0) {
			int var1 = Statics.field1276;
			int var2 = Statics.field460;
			int var3 = Statics.field4488.method437(this.field3760) ? 64 : 128;
			this.field3769 = Statics.field4488.method440(this.field3760);
			this.field3751 = var3;
			this.field3752 = var3;
			Statics.method802(var1, var2);
			return this.field3769 != null;
		} else {
			return false;
		}
	}
}
