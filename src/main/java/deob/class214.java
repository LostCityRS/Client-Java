package deob;

@ObfuscatedName("tg")
public final class class214 {

	@ObfuscatedName("tg.a")
	public static class137 field4033;

	@ObfuscatedName("tg.c")
	public int[] field4035;

	@ObfuscatedName("tg.d")
	public final byte[] field4036;

	@ObfuscatedName("tg.e")
	public final int[] field4037;

	@ObfuscatedName("tg.i")
	public static double field4041 = -1.0D;

	@ObfuscatedName("tg.j")
	public static final class88 field4042 = class208.method1423(105, "Loaded config");

	@ObfuscatedName("tg.h")
	public static class88 field4040 = field4042;

	@ObfuscatedName("tg.a(IILnb;I)Llj;")
	public static class130 method1454(int arg0, class144 arg1) {
		return class47.method358(arg1, arg0, 0) ? class27.method170() : null;
	}

	public class214(byte[] arg0) {
		int var2 = arg0.length;
		this.field4035 = new int[8];
		this.field4037 = new int[var2];
		this.field4036 = arg0;
		int[] var3 = new int[33];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; var5++) {
			byte var6 = arg0[var5];
			if (var6 != 0) {
				int var7 = 0x1 << 32 - var6;
				int var8 = var3[var6];
				this.field4037[var5] = var8;
				int var9;
				if ((var8 & var7) == 0) {
					var9 = var8 | var7;
					for (int var10 = var6 - 1; var10 >= 1; var10--) {
						int var11 = var3[var10];
						if (var8 != var11) {
							break;
						}
						int var12 = 0x1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}
						var3[var10] = var12 | var11;
					}
				} else {
					var9 = var3[var6 - 1];
				}
				var3[var6] = var9;
				for (int var13 = var6 + 1; var13 <= 32; var13++) {
					if (var3[var13] == var8) {
						var3[var13] = var9;
					}
				}
				int var14 = 0;
				for (int var15 = 0; var15 < var6; var15++) {
					int var16 = Integer.MIN_VALUE >>> var15;
					if ((var16 & var8) == 0) {
						var14++;
					} else {
						if (this.field4035[var14] == 0) {
							this.field4035[var14] = var4;
						}
						var14 = this.field4035[var14];
					}
					if (this.field4035.length <= var14) {
						int[] var17 = new int[this.field4035.length * 2];
						for (int var18 = 0; var18 < this.field4035.length; var18++) {
							var17[var18] = this.field4035[var18];
						}
						this.field4035 = var17;
					}
				}
				if (var4 <= var14) {
					var4 = var14 + 1;
				}
				this.field4035[var14] = ~var5;
			}
		}
	}

	@ObfuscatedName("tg.a([BIII[BZ)I")
	public int method1456(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4) {
		int var6 = 0;
		int var7 = arg2;
		int var8 = arg1 << 3;
		while (arg3 < var7) {
			int var9 = arg0[arg3] & 0xFF;
			byte var10 = this.field4036[var9];
			int var11 = this.field4037[var9];
			if (var10 == 0) {
				throw new RuntimeException("No codeword for data value " + var9);
			}
			int var12 = var8 >> 3;
			int var13 = var8 & 0x7;
			var8 += var10;
			int var14 = var12 + (var13 + var10 - 1 >> 3);
			int var15 = var6 & -var13 >> 31;
			int var16 = var13 + 24;
			arg4[var12] = (byte) (var6 = var15 | var11 >>> var16);
			if (var14 > var12) {
				var12++;
				var13 = var16 - 8;
				arg4[var12] = (byte) (var6 = var11 >>> var13);
				if (var14 > var12) {
					var13 -= 8;
					var12++;
					arg4[var12] = (byte) (var6 = var11 >>> var13);
					if (var14 > var12) {
						var12++;
						var13 -= 8;
						arg4[var12] = (byte) (var6 = var11 >>> var13);
						if (var12 < var14) {
							var13 -= 8;
							var12++;
							arg4[var12] = (byte) (var6 = var11 << -var13);
						}
					}
				}
			}
			arg3++;
		}
		return (var8 + 7 >> 3) - arg1;
	}

	@ObfuscatedName("tg.a(II[B[BII)I")
	public int method1457(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		int var6 = 0;
		int var7 = arg3;
		int var8 = arg4;
		while (true) {
			byte var9 = arg2[var8];
			if (var9 >= 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var10;
			if ((var10 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var10;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x40) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var11;
			if ((var11 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var11;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x20) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var12;
			if ((var12 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var12;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x10) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var13;
			if ((var13 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var13;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x8) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var14;
			if ((var14 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var14;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x4) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var15;
			if ((var15 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var15;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x2) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var16;
			if ((var16 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var16;
				if (arg0 >= var7) {
					break;
				}
				var6 = 0;
			}
			if ((var9 & 0x1) == 0) {
				var6++;
			} else {
				var6 = this.field4035[var6];
			}
			int var17;
			if ((var17 = this.field4035[var6]) < 0) {
				arg1[arg0++] = (byte) ~var17;
				if (var7 <= arg0) {
					break;
				}
				var6 = 0;
			}
			var8++;
		}
		return var8 + 1 - arg4;
	}
}
