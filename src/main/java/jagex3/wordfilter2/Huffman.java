package jagex3.wordfilter2;

import deob.ObfuscatedName;

@ObfuscatedName("wa")
public final class Huffman {

	@ObfuscatedName("wa.a")
	public int[] field3207;

	@ObfuscatedName("wa.l")
	public final int[] field3218;

	@ObfuscatedName("wa.r")
	public final byte[] field3224;

	@ObfuscatedName("wa.a([BII[BII)I")
	public int method1033(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		int var6 = arg1;
		int var7 = 0;
		int var8 = arg4;
		while (true) {
			byte var9 = arg0[var8];
			if (var9 >= 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var10;
			if ((var10 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var10;
				if (arg2 >= var6) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x40) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var11;
			if ((var11 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var11;
				if (var6 <= arg2) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x20) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var12;
			if ((var12 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var12;
				if (arg2 >= var6) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x10) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var13;
			if ((var13 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var13;
				if (arg2 >= var6) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x8) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var14;
			if ((var14 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var14;
				if (var6 <= arg2) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x4) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var15;
			if ((var15 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var15;
				if (var6 <= arg2) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x2) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var16;
			if ((var16 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var16;
				if (arg2 >= var6) {
					break;
				}
				var7 = 0;
			}
			if ((var9 & 0x1) == 0) {
				var7++;
			} else {
				var7 = this.field3207[var7];
			}
			int var17;
			if ((var17 = this.field3207[var7]) < 0) {
				arg3[arg2++] = (byte) ~var17;
				if (arg2 >= var6) {
					break;
				}
				var7 = 0;
			}
			var8++;
		}
		return var8 + 1 - arg4;
	}

	@ObfuscatedName("wa.a(IIII[B[B)I")
	public int method1036(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4) {
		int var6 = arg2;
		int var7 = 0;
		int var8 = arg1 << 3;
		while (arg0 < var6) {
			int var9 = arg3[arg0] & 0xFF;
			int var10 = this.field3218[var9];
			byte var11 = this.field3224[var9];
			if (var11 == 0) {
				throw new RuntimeException("No codeword for data value " + var9);
			}
			int var12 = var8 >> 3;
			int var13 = var8 & 0x7;
			var8 += var11;
			int var14 = var7 & -var13 >> 31;
			int var15 = var12 + (var13 + var11 - 1 >> 3);
			int var16 = var13 + 24;
			arg4[var12] = (byte) (var7 = var14 | var10 >>> var16);
			if (var12 < var15) {
				var12++;
				var13 = var16 - 8;
				arg4[var12] = (byte) (var7 = var10 >>> var13);
				if (var15 > var12) {
					var13 -= 8;
					var12++;
					arg4[var12] = (byte) (var7 = var10 >>> var13);
					if (var12 < var15) {
						var12++;
						var13 -= 8;
						arg4[var12] = (byte) (var7 = var10 >>> var13);
						if (var12 < var15) {
							var13 -= 8;
							var12++;
							arg4[var12] = (byte) (var7 = var10 << -var13);
						}
					}
				}
			}
			arg0++;
		}
		return (var8 + 7 >> 3) - arg1;
	}

	public Huffman(byte[] arg0) {
		int var2 = arg0.length;
		this.field3224 = arg0;
		this.field3218 = new int[var2];
		int[] var3 = new int[33];
		this.field3207 = new int[8];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = arg0[var5];
			if (var6 != 0) {
				int var7 = 0x1 << 32 - var6;
				int var8 = var3[var6];
				this.field3218[var5] = var8;
				int var12;
				if ((var7 & var8) == 0) {
					for (int var9 = var6 - 1; var9 >= 1; var9--) {
						int var10 = var3[var9];
						if (var8 != var10) {
							break;
						}
						int var11 = 0x1 << 32 - var9;
						if ((var10 & var11) != 0) {
							var3[var9] = var3[var9 - 1];
							break;
						}
						var3[var9] = var10 | var11;
					}
					var12 = var8 | var7;
				} else {
					var12 = var3[var6 - 1];
				}
				var3[var6] = var12;
				for (int var13 = var6 + 1; var13 <= 32; var13++) {
					if (var3[var13] == var8) {
						var3[var13] = var12;
					}
				}
				int var14 = 0;
				for (int var15 = 0; var15 < var6; var15++) {
					int var16 = Integer.MIN_VALUE >>> var15;
					if ((var16 & var8) == 0) {
						var14++;
					} else {
						if (this.field3207[var14] == 0) {
							this.field3207[var14] = var4;
						}
						var14 = this.field3207[var14];
					}
					if (this.field3207.length <= var14) {
						int[] var17 = new int[this.field3207.length * 2];
						for (int var18 = 0; var18 < this.field3207.length; var18++) {
							var17[var18] = this.field3207[var18];
						}
						this.field3207 = var17;
					}
				}
				if (var14 >= var4) {
					var4 = var14 + 1;
				}
				this.field3207[var14] = ~var5;
			}
		}
	}
}
