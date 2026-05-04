package deob;

import java.util.Random;

@ObfuscatedName("l")
public final class TextureOp15 extends TextureOp {

	@ObfuscatedName("l.eb")
	public int field2197 = 2048;

	@ObfuscatedName("l.hb")
	public int field2200 = 0;

	@ObfuscatedName("l.jb")
	public int field2202 = 5;

	@ObfuscatedName("l.lb")
	public int field2204 = 1;

	@ObfuscatedName("l.Q")
	public int field2183 = 5;

	@ObfuscatedName("l.U")
	public int field2187 = 2;

	@ObfuscatedName("l.W")
	public byte[] field2189 = new byte[512];

	@ObfuscatedName("l.V")
	public short[] field2188 = new short[512];

	public TextureOp15() {
		super(0, true);
	}

	@ObfuscatedName("l.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field2202 = this.field2183 = arg0.g1();
		} else if (arg1 == 1) {
			this.field2200 = arg0.g1();
		} else if (arg1 == 2) {
			this.field2197 = arg0.g2();
		} else if (arg1 == 3) {
			this.field2187 = arg0.g1();
		} else if (arg1 == 4) {
			this.field2204 = arg0.g1();
		} else if (arg1 == 5) {
			this.field2202 = arg0.g1();
		} else if (arg1 == 6) {
			this.field2183 = arg0.g1();
		}
	}

	@ObfuscatedName("l.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0] * this.field2183 + 2048;
			int var4 = var3 >> 12;
			int var5 = var4 + 1;
			for (int var6 = 0; var6 < Statics.field1276; var6++) {
				ClientMouseListener.field1452 = Integer.MAX_VALUE;
				Statics.field1850 = Integer.MAX_VALUE;
				Statics.field3809 = Integer.MAX_VALUE;
				Statics.field2472 = Integer.MAX_VALUE;
				int var7 = Statics.field351[var6] * this.field2202 + 2048;
				int var8 = var7 >> 12;
				int var9 = var8 + 1;
				for (int var10 = var4 - 1; var10 <= var5; var10++) {
					int var11 = this.field2189[(var10 < this.field2183 ? var10 : var10 - this.field2183) & 0xFF] & 0xFF;
					for (int var12 = var8 - 1; var12 <= var9; var12++) {
						int var13 = (this.field2189[var11 + (this.field2202 <= var12 ? var12 - this.field2202 : var12) & 0xFF] & 0xFF) * 2;
						int var26 = var13 + 1;
						int var14 = var7 - this.field2188[var13] - (var12 << 12);
						int var15 = var3 - (var10 << 12) - this.field2188[var26];
						int var16 = this.field2204;
						int var17;
						if (var16 == 1) {
							var17 = var14 * var14 + var15 * var15 >> 12;
						} else if (var16 == 3) {
							int var18 = var15 >= 0 ? var15 : -var15;
							int var19 = var14 < 0 ? -var14 : var14;
							var17 = var19 <= var18 ? var18 : var19;
						} else if (var16 == 4) {
							int var20 = (int) (Math.sqrt((double) ((float) (var14 >= 0 ? var14 : -var14) / 4096.0F)) * 4096.0D);
							int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
							int var22 = var21 + var20;
							var17 = var22 * var22 >> 12;
						} else if (var16 == 5) {
							int var23 = var14 * var14;
							int var24 = var15 * var15;
							var17 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var23 + var24) / 1.6777216E7F))) * 4096.0D);
						} else if (var16 == 2) {
							var17 = (var15 >= 0 ? var15 : -var15) + (var14 < 0 ? -var14 : var14);
						} else {
							var17 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var14 * var14) / 1.6777216E7F)) * 4096.0D);
						}
						if (Statics.field2472 > var17) {
							ClientMouseListener.field1452 = Statics.field1850;
							Statics.field1850 = Statics.field3809;
							Statics.field3809 = Statics.field2472;
							Statics.field2472 = var17;
						} else if (var17 < Statics.field3809) {
							ClientMouseListener.field1452 = Statics.field1850;
							Statics.field1850 = Statics.field3809;
							Statics.field3809 = var17;
						} else if (var17 < Statics.field1850) {
							ClientMouseListener.field1452 = Statics.field1850;
							Statics.field1850 = var17;
						} else if (var17 < ClientMouseListener.field1452) {
							ClientMouseListener.field1452 = var17;
						}
					}
				}
				int var25 = this.field2187;
				if (var25 == 0) {
					var2[var6] = Statics.field2472;
				} else if (var25 == 1) {
					var2[var6] = Statics.field3809;
				} else if (var25 == 3) {
					var2[var6] = Statics.field1850;
				} else if (var25 == 4) {
					var2[var6] = ClientMouseListener.field1452;
				} else if (var25 == 2) {
					var2[var6] = Statics.field3809 - Statics.field2472;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("l.b(B)V")
	@Override
	public void method123() {
		this.field2189 = Statics.method1072(this.field2200);
		this.method821();
	}

	@ObfuscatedName("l.e(I)V")
	public void method821() {
		Random var1 = new Random((long) this.field2200);
		this.field2188 = new short[512];
		if (this.field2197 > 0) {
			for (int var2 = 0; var2 < 512; var2++) {
				this.field2188[var2] = (short) Statics.method812(this.field2197, var1);
			}
		}
	}
}
