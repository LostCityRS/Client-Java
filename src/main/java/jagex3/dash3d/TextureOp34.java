package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.ByteArrayNode2;
import jagex3.io.Packet;

@ObfuscatedName("da")
public final class TextureOp34 extends TextureOp {

    @ObfuscatedName("id.d")
    public static final int[] field1720 = new int[4096];

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field1720[var0] = method394(var0);
		}
	}

	@ObfuscatedName("da.cb")
	public int field607 = 1638;

	@ObfuscatedName("da.eb")
	public short[] field609;

	@ObfuscatedName("da.fb")
	public boolean field610 = true;

	@ObfuscatedName("da.ib")
	public byte[] field613 = new byte[512];

	@ObfuscatedName("da.W")
	public int field601 = 4;

	@ObfuscatedName("da.Q")
	public int field595 = 4;

	@ObfuscatedName("da.V")
	public int field600 = 0;

	@ObfuscatedName("da.R")
	public int field596 = 4;

	@ObfuscatedName("da.Y")
	public short[] field603;

	public TextureOp34() {
		super(0, true);
	}

	@ObfuscatedName("ei.a(II)I")
	public static int method394(int arg0) {
		int var1 = arg0 * 6 - 61440;
		int var2 = (var1 * arg0 >> 12) + 40960;
		int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
		return var2 * var3 >> 12;
	}

	@ObfuscatedName("da.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.field610 = arg0.g1() == 1;
		} else if (arg1 == 1) {
			this.field595 = arg0.g1();
		} else if (arg1 == 2) {
			this.field607 = arg0.g2b();
			if (this.field607 < 0) {
				this.field609 = new short[this.field595];
				for (int var3 = 0; var3 < this.field595; var3++) {
					this.field609[var3] = (short) arg0.g2b();
				}
			}
		} else if (arg1 == 3) {
			this.field601 = this.field596 = arg0.g1();
		} else if (arg1 == 4) {
			this.field600 = arg0.g1();
		} else if (arg1 == 5) {
			this.field601 = arg0.g1();
		} else if (arg1 == 6) {
			this.field596 = arg0.g1();
		}
	}

	@ObfuscatedName("da.a(IIIIIII)I")
	public int method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg0 - 4096;
		int var8 = arg1 >> 12;
		int var9 = arg1 & 0xFFF;
		int var10 = var9 - 4096;
		int var11 = field1720[var9];
		int var12 = var8 + 1;
		int var13 = var8 & 0xFF;
		if (var12 >= arg4) {
			var12 = 0;
		}
		int var14 = var12 & 0xFF;
		int var15 = this.field613[var13 + arg2] & 0x3;
		int var16;
		if (var15 > 1) {
			var16 = var15 == 2 ? var9 - arg0 : -arg0 + -var9;
		} else {
			var16 = var15 == 0 ? var9 + arg0 : arg0 + -var9;
		}
		int var17 = this.field613[arg2 + var14] & 0x3;
		int var18;
		if (var17 <= 1) {
			var18 = var17 == 0 ? var10 + arg0 : arg0 + -var10;
		} else {
			var18 = var17 == 2 ? var10 - arg0 : -arg0 + -var10;
		}
		int var19 = this.field613[var13 + arg3] & 0x3;
		int var20 = ((var18 - var16) * var11 >> 12) + var16;
		int var21;
		if (var19 <= 1) {
			var21 = var19 == 0 ? var7 + var9 : -var9 + var7;
		} else {
			var21 = var19 == 2 ? var9 - var7 : -var9 - var7;
		}
		int var22 = this.field613[arg3 + var14] & 0x3;
		int var23;
		if (var22 > 1) {
			var23 = var22 == 2 ? var10 - var7 : -var10 - var7;
		} else {
			var23 = var22 == 0 ? var7 + var10 : var7 + -var10;
		}
		int var24 = var21 + (var11 * (var23 - var21) >> 12);
		return ((var24 - var20) * arg5 >> 12) + var20;
	}

	@ObfuscatedName("da.a(IZ[I)V")
	public void method234(int arg0, int[] arg1) {
		int var3 = Texture.field2021[arg0] * this.field596;
		if (this.field595 == 1) {
			int var4 = this.field603[0] << 12;
			int var5 = var3 * var4 >> 12;
			int var6 = var4 * this.field601 >> 12;
			short var7 = this.field609[0];
			int var8 = var4 * this.field596 >> 12;
			int var9 = var5 >> 12;
			int var10 = var5 & 0xFFF;
			int var11 = field1720[var10];
			int var12 = var9 + 1;
			if (var8 <= var12) {
				var12 = 0;
			}
			int var13 = this.field613[var9 & 0xFF] & 0xFF;
			int var14 = this.field613[var12 & 0xFF] & 0xFF;
			if (this.field610) {
				for (int var18 = 0; var18 < Texture.field1276; var18++) {
					int var19 = this.field601 * Texture.field351[var18];
					int var20 = this.method231(var10, var19 * var4 >> 12, var13, var14, var6, var11);
					int var21 = var7 * var20 >> 12;
					arg1[var18] = (var21 >> 1) + 2048;
				}
			} else {
				for (int var15 = 0; var15 < Texture.field1276; var15++) {
					int var16 = this.field601 * Texture.field351[var15];
					int var17 = this.method231(var10, var4 * var16 >> 12, var13, var14, var6, var11);
					arg1[var15] = var17 * var7 >> 12;
				}
			}
			return;
		}
		short var22 = this.field609[0];
		if (var22 > 8 || var22 < -8) {
			int var23 = this.field603[0] << 12;
			int var24 = this.field596 * var23 >> 12;
			int var25 = var3 * var23 >> 12;
			int var26 = var25 >> 12;
			int var27 = this.field613[var26 & 0xFF] & 0xFF;
			int var28 = this.field601 * var23 >> 12;
			int var29 = var26 + 1;
			if (var29 >= var24) {
				var29 = 0;
			}
			int var30 = var25 & 0xFFF;
			int var31 = this.field613[var29 & 0xFF] & 0xFF;
			int var32 = field1720[var30];
			for (int var33 = 0; var33 < Texture.field1276; var33++) {
				int var34 = Texture.field351[var33] * this.field601;
				int var35 = this.method231(var30, var34 * var23 >> 12, var27, var31, var28, var32);
				arg1[var33] = var35 * var22 >> 12;
			}
		}
		for (int var36 = 1; var36 < this.field595; var36++) {
			short var37 = this.field609[var36];
			if (var37 > 8 || var37 < -8) {
				int var38 = this.field603[var36] << 12;
				int var39 = this.field601 * var38 >> 12;
				int var40 = this.field596 * var38 >> 12;
				int var41 = var3 * var38 >> 12;
				int var42 = var41 >> 12;
				int var43 = var42 + 1;
				int var44 = this.field613[var42 & 0xFF] & 0xFF;
				int var45 = var41 & 0xFFF;
				if (var40 <= var43) {
					var43 = 0;
				}
				int var46 = this.field613[var43 & 0xFF] & 0xFF;
				int var47 = field1720[var45];
				if (this.field610 && var36 == this.field595 - 1) {
					for (int var51 = 0; var51 < Texture.field1276; var51++) {
						int var52 = this.field601 * Texture.field351[var51];
						int var53 = this.method231(var45, var38 * var52 >> 12, var44, var46, var39, var47);
						int var54 = arg1[var51] + (var37 * var53 >> 12);
						arg1[var51] = (var54 >> 1) + 2048;
					}
				} else {
					for (int var48 = 0; var48 < Texture.field1276; var48++) {
						int var49 = Texture.field351[var48] * this.field601;
						int var50 = this.method231(var45, var49 * var38 >> 12, var44, var46, var39, var47);
						arg1[var48] += var50 * var37 >> 12;
					}
				}
			}
		}
	}

	@ObfuscatedName("da.b(B)V")
	@Override
	public void method123() {
		this.field613 = ByteArrayNode2.method1072(this.field600);
		this.method237();
		for (int var1 = this.field595 - 1; var1 >= 1; var1--) {
			short var2 = this.field609[var1];
			if (var2 > 8 || var2 < -8) {
				return;
			}
			this.field595--;
		}
	}

	@ObfuscatedName("da.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			this.method234(arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("da.e(B)V")
	public void method237() {
		if (this.field607 > 0) {
			this.field609 = new short[this.field595];
			this.field603 = new short[this.field595];
			for (int var2 = 0; var2 < this.field595; var2++) {
				this.field609[var2] = (short) (Math.pow((double) ((float) this.field607 / 4096.0F), (double) var2) * 4096.0D);
				this.field603[var2] = (short) Math.pow(2.0D, (double) var2);
			}
		} else if (this.field609 != null && this.field595 == this.field609.length) {
			this.field603 = new short[this.field595];
			for (int var1 = 0; var1 < this.field595; var1++) {
				this.field603[var1] = (short) Math.pow(2.0D, (double) var1);
			}
		}
	}
}
