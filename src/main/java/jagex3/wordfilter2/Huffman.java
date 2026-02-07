package jagex3.wordfilter2;

import deob.ObfuscatedName;

@ObfuscatedName("bf")
public final class Huffman {

	@ObfuscatedName("bf.g")
	public final int[] field233;

	@ObfuscatedName("bf.o")
	public final byte[] field241;

	@ObfuscatedName("bf.r")
	public int[] field244;

	public Huffman(byte[] arg0) {
		int var2 = arg0.length;
		this.field233 = new int[var2];
		this.field244 = new int[8];
		this.field241 = arg0;
		int[] var3 = new int[33];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = arg0[var5];
			if (var6 != 0) {
				int var7 = 0x1 << 32 - var6;
				int var8 = var3[var6];
				this.field233[var5] = var8;
				int var9;
				if ((var8 & var7) == 0) {
					for (int var10 = var6 - 1; var10 >= 1; var10--) {
						int var11 = var3[var10];
						if (var8 != var11) {
							break;
						}
						int var12 = 0x1 << 32 - var10;
						if ((var12 & var11) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}
						var3[var10] = var12 | var11;
					}
					var9 = var8 | var7;
				} else {
					var9 = var3[var6 - 1];
				}
				var3[var6] = var9;
				for (int var13 = var6 + 1; var13 <= 32; var13++) {
					if (var8 == var3[var13]) {
						var3[var13] = var9;
					}
				}
				int var14 = 0;
				for (int var15 = 0; var15 < var6; var15++) {
					int var16 = Integer.MIN_VALUE >>> var15;
					if ((var8 & var16) == 0) {
						var14++;
					} else {
						if (this.field244[var14] == 0) {
							this.field244[var14] = var4;
						}
						var14 = this.field244[var14];
					}
					if (var14 >= this.field244.length) {
						int[] var17 = new int[this.field244.length * 2];
						for (int var18 = 0; var18 < this.field244.length; var18++) {
							var17[var18] = this.field244[var18];
						}
						this.field244 = var17;
					}
				}
				this.field244[var14] = ~var5;
				if (var14 >= var4) {
					var4 = var14 + 1;
				}
			}
		}
	}

	@ObfuscatedName("bf.a(II[BIZ[B)I")
	public int method73(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		int var6 = 0;
		int var7 = arg3;
		int var8 = arg1;
		while (true) {
			byte var9 = arg4[var8];
			if (var9 < 0) {
				var6 = this.field244[var6];
			} else {
				var6++;
			}
			int var10;
			if ((var10 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var10;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x40) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var11;
			if ((var11 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var11;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x20) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var12;
			if ((var12 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var12;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x10) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var13;
			if ((var13 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var13;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x8) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var14;
			if ((var14 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var14;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x4) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var15;
			if ((var15 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var15;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x2) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var16;
			if ((var16 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var16;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x1) == 0) {
				var6++;
			} else {
				var6 = this.field244[var6];
			}
			int var17;
			if ((var17 = this.field244[var6]) < 0) {
				arg2[arg0++] = (byte) ~var17;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			var8++;
		}
		return var8 + 1 - arg1;
	}

	@ObfuscatedName("bf.a(III[B[BI)I")
	public int method75(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4) {
		int var6 = arg1;
		int var7 = 0;
		int var8 = arg2 << 3;
		while (var6 > arg0) {
			int var9 = arg3[arg0] & 0xFF;
			int var10 = this.field233[var9];
			byte var11 = this.field241[var9];
			if (var11 == 0) {
				throw new RuntimeException("No codeword for data value " + var9);
			}
			int var12 = var8 & 0x7;
			int var13 = var7 & -var12 >> 31;
			int var14 = var8 >> 3;
			var8 += var11;
			int var15 = var14 + (var12 + var11 - 1 >> 3);
			int var16 = var12 + 24;
			arg4[var14] = (byte) (var7 = var13 | var10 >>> var16);
			if (var15 > var14) {
				var14++;
				var12 = var16 - 8;
				arg4[var14] = (byte) (var7 = var10 >>> var12);
				if (var14 < var15) {
					var14++;
					var12 -= 8;
					arg4[var14] = (byte) (var7 = var10 >>> var12);
					if (var14 < var15) {
						var14++;
						var12 -= 8;
						arg4[var14] = (byte) (var7 = var10 >>> var12);
						if (var14 < var15) {
							var12 -= 8;
							var14++;
							arg4[var14] = (byte) (var7 = var10 << -var12);
						}
					}
				}
			}
			arg0++;
		}
		return (var8 + 7 >> 3) - arg2;
	}
}
