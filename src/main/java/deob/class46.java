package deob;

import java.math.BigInteger;

@ObfuscatedName("ea")
public class class46 extends class67 {

	@ObfuscatedName("ea.ib")
	public byte[] field842;

	@ObfuscatedName("ea.lb")
	public static final int[] field845 = new int[200];

	@ObfuscatedName("ea.ob")
	public static int field848;

	@ObfuscatedName("ea.z")
	public static volatile int field807 = 0;

	@ObfuscatedName("ea.C")
	public static final class88 field810 = class208.method1423(105, "Loading title screen )2 ");

	@ObfuscatedName("ea.Z")
	public static volatile int field833 = 0;

	@ObfuscatedName("ea.J")
	public static class88 field817 = field810;

	@ObfuscatedName("ea.N")
	public static int field821 = 0;

	@ObfuscatedName("ea.zb")
	public static int field859 = 0;

	@ObfuscatedName("ea.X")
	public int field831;

	@ObfuscatedName("ea.a(Lnb;ILnb;ZB)Lli;")
	public static class129 method309(class144 arg0, int arg1, class144 arg2) {
		boolean var3 = true;
		int[] var4 = arg2.method948(arg1);
		for (int var5 = 0; var5 < var4.length; var5++) {
			byte[] var6 = arg2.method947(var4[var5], arg1);
			if (var6 == null) {
				var3 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg0.method947(0, var7);
				if (var8 == null) {
					var3 = false;
				}
			}
		}
		if (!var3) {
			return null;
		}
		try {
			return new class129(arg2, arg0, arg1, false);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("ea.a(IIIBI)V")
	public static void method310(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= arg1) {
			class230.method1534(arg2, arg3, arg1, class3.field42[arg0]);
		} else {
			class230.method1534(arg1, arg3, arg2, class3.field42[arg0]);
		}
	}

	@ObfuscatedName("ea.a(IIIII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0;
		int var5 = arg2;
		int var6 = -arg2;
		int var7 = class156.method1058(class67.field1207, class12.field183, arg1 + arg2);
		int var8 = -1;
		int var9 = class156.method1058(class67.field1207, class12.field183, arg1 - arg2);
		class230.method1534(var9, arg0, var7, class3.field42[arg3]);
		while (var5 > var4) {
			var8 += 2;
			var6 += var8;
			if (var6 > 0) {
				var5--;
				var6 -= var5 << 1;
				int var10 = arg3 - var5;
				int var11 = arg3 + var5;
				if (class49.field919 <= var11 && var10 <= class18.field279) {
					int var12 = class156.method1058(class67.field1207, class12.field183, arg1 + var4);
					int var13 = class156.method1058(class67.field1207, class12.field183, arg1 - var4);
					if (var11 <= class18.field279) {
						class230.method1534(var13, arg0, var12, class3.field42[var11]);
					}
					if (var10 >= class49.field919) {
						class230.method1534(var13, arg0, var12, class3.field42[var10]);
					}
				}
			}
			var4++;
			int var14 = var4 + arg3;
			int var15 = arg3 - var4;
			if (class49.field919 <= var14 && class18.field279 >= var15) {
				int var16 = class156.method1058(class67.field1207, class12.field183, arg1 + var5);
				int var17 = class156.method1058(class67.field1207, class12.field183, arg1 - var5);
				if (var14 <= class18.field279) {
					class230.method1534(var17, arg0, var16, class3.field42[var14]);
				}
				if (var15 >= class49.field919) {
					class230.method1534(var17, arg0, var16, class3.field42[var15]);
				}
			}
		}
	}

	@ObfuscatedName("ea.a(Lnb;BLnb;)I")
	public static int method330(class144 arg0, class144 arg1) {
		int var2 = 0;
		if (arg0.method953(class110.field2009)) {
			var2++;
		}
		if (arg1.method953(class151.field2932)) {
			var2++;
		}
		if (arg1.method953(class104.field1896)) {
			var2++;
		}
		if (arg1.method953(class157.field3019)) {
			var2++;
		}
		if (arg1.method953(class245.field4502)) {
			var2++;
		}
		if (arg1.method953(class150.field2912)) {
			var2++;
		}
		arg1.method953(class14.field209);
		arg1.method953(class8.field119);
		arg1.method953(class97.field1783);
		arg1.method953(class120.field2195);
		arg1.method953(class226.field4247);
		return var2;
	}

	@ObfuscatedName("ea.a(IIIBIIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg6 - arg5;
		int var9 = arg4 - arg7;
		int var10 = (arg1 - arg2 << 16) / var8;
		if (class109.field1988 > arg6) {
			var8++;
		}
		int var11 = (arg0 - arg3 << 16) / var9;
		if (class44.field760 > arg4) {
			var9++;
		}
		for (int var12 = 0; var12 < var8; var12++) {
			int var13 = var10 * (var12 + 1) >> 16;
			int var14 = var12 * var10 >> 16;
			int var15 = var13 - var14;
			if (var15 > 0) {
				int var16 = var13 + arg2;
				int var17 = var14 + arg2;
				int var18 = var12 + arg5 >> 6;
				int[][] var19 = class105.field1912[var18];
				byte[][] var20 = class97.field1786[var18];
				byte[][] var21 = class7.field105[var18];
				byte[][] var22 = class220.field4166[var18];
				byte[][] var23 = class208.field3951[var18];
				byte[][] var24 = class216.field4052[var18];
				for (int var25 = 0; var25 < var9; var25++) {
					int var26 = var25 * var11 >> 16;
					int var27 = var11 * (var25 + 1) >> 16;
					int var28 = var27 - var26;
					if (var28 > 0) {
						int var29 = var26 + arg3;
						int var30 = var25 + arg7 >> 6;
						int var31 = arg7 + var25 & 0x3F;
						int var32 = var27 + arg3;
						int var33 = var12 + arg5 & 0x3F;
						int var34 = var33 + (var31 << 6);
						int var35;
						if (var19[var30] == null) {
							int var36 = var12 + arg5 & 0x4;
							int var37 = var25 + arg7 & 0x4;
							if (var36 < 2 && var37 > 2 || var36 > 2 && var37 < 2) {
								var35 = 4936552;
							} else {
								var35 = class54.field1009[class133.field2489 + 1];
							}
						} else {
							var35 = var19[var30][var34];
						}
						if (var35 == 0) {
							var35 = 1;
						}
						int var38 = var21[var30] == null ? 0 : class54.field1009[var21[var30][var34] & 0xFF];
						int var39 = var23[var30] == null ? 0 : class54.field1009[var23[var30][var34] & 0xFF];
						if (var38 == 0 && var39 == 0) {
							class72.method478(var17, var29, var15, var28, var35);
						} else {
							if (var38 != 0) {
								byte var40 = var20[var30] == null ? 0 : var20[var30][var34];
								int var41 = var40 & 0xFC;
								if (var38 == -1) {
									var38 = 1;
								}
								if (var41 == 0 || var15 <= 1 || var28 <= 1) {
									class72.method478(var17, var29, var15, var28, var38);
								} else {
									class219.method1482(true, var28, var35, var40 & 0x3, var29, var38, var41 >> 2, var17, var15, class72.field1331);
								}
							}
							if (var39 != 0) {
								if (var39 == -1) {
									var39 = var35;
								}
								byte var42 = var22[var30][var34];
								int var43 = var42 & 0xFC;
								if (var43 == 0 || var15 <= 1 || var28 <= 1) {
									class72.method478(var17, var29, var15, var28, var39);
								}
								class219.method1482(var38 == 0, var28, 0, var42 & 0x3, var29, var39, var43 >> 2, var17, var15, class72.field1331);
							}
						}
						if (var24[var30] != null) {
							int var44 = var24[var30][var34] & 0xFF;
							if (var44 != 0) {
								int var45;
								if (var15 == 1) {
									var45 = var17;
								} else {
									var45 = var16 - 1;
								}
								int var46;
								if (var28 == 1) {
									var46 = var29;
								} else {
									var46 = var32 - 1;
								}
								int var47 = 13421772;
								if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
									var44 -= 4;
									var47 = 13369344;
								}
								if (var44 == 1) {
									class72.method487(var17, var29, var28, var47);
								} else if (var44 == 2) {
									class72.method489(var17, var29, var15, var47);
								} else if (var44 == 3) {
									class72.method487(var45, var29, var28, var47);
								} else if (var44 == 4) {
									class72.method489(var17, var46, var15, var47);
								} else if (var44 == 9) {
									class72.method487(var17, var29, var28, 16777215);
									class72.method489(var17, var29, var15, var47);
								} else if (var44 == 10) {
									class72.method487(var45, var29, var28, 16777215);
									class72.method489(var17, var29, var15, var47);
								} else if (var44 == 11) {
									class72.method487(var45, var29, var28, 16777215);
									class72.method489(var17, var46, var15, var47);
								} else if (var44 == 12) {
									class72.method487(var17, var29, var28, 16777215);
									class72.method489(var17, var46, var15, var47);
								} else if (var44 == 17) {
									class72.method489(var17, var29, 1, var47);
								} else if (var44 == 18) {
									class72.method489(var45, var29, 1, var47);
								} else if (var44 == 19) {
									class72.method489(var45, var46, 1, var47);
								} else if (var44 == 20) {
									class72.method489(var17, var46, 1, var47);
								} else if (var44 == 25) {
									for (int var48 = 0; var48 < var28; var48++) {
										class72.method489(var48 + var17, -var48 + var46, 1, var47);
									}
								} else if (var44 == 26) {
									for (int var49 = 0; var49 < var28; var49++) {
										class72.method489(var17 + var49, var49 + var29, 1, var47);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int var50 = 0; var50 < var8; var50++) {
			int var51 = var50 * var10 >> 16;
			int var52 = (var50 + 1) * var10 >> 16;
			int var53 = var52 - var51;
			if (var53 > 0) {
				int var54 = var51 + arg2;
				byte[][] var55 = class117.field2126[arg5 + var50 >> 6];
				for (int var56 = 0; var56 < var9; var56++) {
					int var57 = var56 * var11 >> 16;
					int var58 = (var56 + 1) * var11 >> 16;
					int var59 = var58 - var57;
					if (var59 > 0) {
						int var60 = (arg5 + var50 & 0x3F) + ((var56 + arg7 & 0x3F) << 6);
						int var61 = var56 + arg7 >> 6;
						int var62 = var57 + arg3;
						if (var55[var61] != null) {
							int var63 = var55[var61][var60] & 0xFF;
							if (var63 != 0) {
								if (var63 == 47 || var63 == 53) {
									class240.field4460[var63 - 1].method1338(var54, var62, var53 * 2 + 1, var59 * 2 + 1);
								} else {
									class240.field4460[var63 - 1].method1338(var54 - var53 / 2, var62 + -(var59 / 2), var53 * 2, var59 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	public class46(int arg0) {
		this.field842 = class102.method709(arg0);
		this.field831 = 0;
	}

	public class46(byte[] arg0) {
		this.field831 = 0;
		this.field842 = arg0;
	}

	@ObfuscatedName("ea.b(B)I")
	public final int method295() {
		return -this.field842[this.field831++] & 0xFF;
	}

	@ObfuscatedName("ea.a(BJ)V")
	public final void method296(long arg0) {
		this.method316((int) (arg0 >> 32));
		this.method316((int) arg0);
	}

	@ObfuscatedName("ea.b(II)V")
	public final void method297(int arg0) {
		this.field842[this.field831++] = (byte) -arg0;
	}

	@ObfuscatedName("ea.b(I)Li;")
	public final class88 method298() {
		int var1 = this.field831;
		while (this.field842[this.field831++] != 0) {
		}
		return class54.method395(var1, this.field842, this.field831 - var1 - 1);
	}

	@ObfuscatedName("ea.c(I)I")
	public final int method299() {
		this.field831 += 4;
		return ((this.field842[this.field831 - 3] & 0xFF) << 8) + ((this.field842[this.field831 - 1] & 0xFF) << 24) + ((this.field842[this.field831 + -2] & 0xFF) << 16) + (this.field842[this.field831 + -4] & 0xFF);
	}

	@ObfuscatedName("ea.c(II)J")
	public final long method300(int arg0) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		int var2 = var5 * 8;
		long var3 = 0L;
		while (var2 >= 0) {
			var3 |= ((long) this.field842[this.field831++] & 0xFFL) << var2;
			var2 -= 8;
		}
		return var3;
	}

	@ObfuscatedName("ea.d(I)I")
	public final int method301() {
		this.field831 += 2;
		return (this.field842[this.field831 - 1] & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.e(I)I")
	public final int method302() {
		this.field831 += 2;
		return (this.field842[this.field831 - 2] - 128 & 0xFF) + ((this.field842[this.field831 - 1] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.f(I)B")
	public final byte method303() {
		return (byte) (this.field842[this.field831++] - 128);
	}

	@ObfuscatedName("ea.g(I)I")
	public final int method304() {
		this.field831 += 3;
		return ((this.field842[this.field831 - 2] & 0xFF) << 8) + ((this.field842[this.field831 - 3] & 0xFF) << 16) + (this.field842[this.field831 + -1] & 0xFF);
	}

	@ObfuscatedName("ea.d(II)V")
	public final void method305(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) arg0;
	}

	@ObfuscatedName("ea.a(IIJ)V")
	public final void method306(int arg0, long arg1) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		for (int var4 = var5 * 8; var4 >= 0; var4 -= 8) {
			this.field842[this.field831++] = (byte) (arg1 >> var4);
		}
	}

	@ObfuscatedName("ea.a(ZI[BI)V")
	public final void method307(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = this.field842[this.field831++];
		}
	}

	@ObfuscatedName("ea.a(ZI)V")
	public final void method308(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method346(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method305(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ea.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public final void method311(BigInteger arg0, BigInteger arg1) {
		int var3 = this.field831;
		byte[] var4 = new byte[var3];
		this.field831 = 0;
		this.method307(var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		this.field831 = 0;
		this.method346(var7.length);
		this.method325(var7.length, var7);
	}

	@ObfuscatedName("ea.c(B)I")
	public final int method312() {
		this.field831 += 2;
		int var1 = ((this.field842[this.field831 - 1] & 0xFF) << 8) + (this.field842[this.field831 - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.h(I)I")
	public final int method313() {
		this.field831 += 4;
		return (this.field842[this.field831 - 2] & 0xFF) + ((this.field842[this.field831 - 1] & 0xFF) << 8) + ((this.field842[this.field831 + -4] & 0xFF) << 16) + ((this.field842[this.field831 + -3] & 0xFF) << 24);
	}

	@ObfuscatedName("ea.a(IB)V")
	public final void method314(int arg0) {
		this.field842[this.field831++] = (byte) arg0;
		this.field842[this.field831++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.a([BIII)V")
	public final void method315(byte[] arg0, int arg1) {
		for (int var3 = arg1 - 1; var3 >= 0; var3--) {
			arg0[var3] = this.field842[this.field831++];
		}
	}

	@ObfuscatedName("ea.e(II)V")
	public final void method316(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 16);
		this.field842[this.field831++] = (byte) (arg0 >> 24);
		this.field842[this.field831++] = (byte) arg0;
		this.field842[this.field831++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.d(B)I")
	public final int method317() {
		byte var1 = this.field842[this.field831++];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.field842[this.field831++];
		}
		return var2 | var1;
	}

	@ObfuscatedName("ea.i(I)I")
	public final int method319() {
		return this.field842[this.field831++] - 128 & 0xFF;
	}

	@ObfuscatedName("ea.j(I)I")
	public final int method320() {
		this.field831 += 4;
		return ((this.field842[this.field831 - 4] & 0xFF) << 8) + ((this.field842[this.field831 - 1] & 0xFF) << 16) + ((this.field842[this.field831 + -2] & 0xFF) << 24) + (this.field842[this.field831 + -3] & 0xFF);
	}

	@ObfuscatedName("ea.k(I)J")
	public final long method321() {
		long var1 = (long) this.method323() & 0xFFFFFFFFL;
		long var3 = (long) this.method323() & 0xFFFFFFFFL;
		return var3 + (var1 << 32);
	}

	@ObfuscatedName("ea.a(II[II)V")
	public final void method322(int arg0, int[] arg1) {
		int var3 = (arg0 - 5) / 8;
		int var4 = this.field831;
		this.field831 = 5;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.method323();
			int var7 = this.method323();
			int var8 = -957401312;
			int var9 = 32;
			while (var9-- > 0) {
				var7 -= var8 + arg1[var8 >>> 11 & 0x3] ^ (var6 >>> 5 ^ var6 << 4) - -var6;
				var8 -= -1640531527;
				var6 -= var7 + (var7 >>> 5 ^ var7 << 4) ^ arg1[var8 & 0x3] + var8;
			}
			this.field831 -= 8;
			this.method338(var6);
			this.method338(var7);
		}
		this.field831 = var4;
	}

	@ObfuscatedName("ea.e(B)I")
	public final int method323() {
		this.field831 += 4;
		return (this.field842[this.field831 - 1] & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 8) + ((this.field842[this.field831 + -4] & 0xFF) << 24) + ((this.field842[this.field831 + -3] & 0xFF) << 16);
	}

	@ObfuscatedName("ea.l(I)B")
	public final byte method324() {
		return this.field842[this.field831++];
	}

	@ObfuscatedName("ea.a(BI[BI)V")
	public final void method325(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			this.field842[this.field831++] = arg1[var3];
		}
	}

	@ObfuscatedName("ea.f(II)V")
	public final void method326(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) arg0;
		this.field842[this.field831++] = (byte) (arg0 >> 24);
		this.field842[this.field831++] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("ea.g(II)V")
	public final void method327(int arg0) {
		this.field842[this.field831++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("ea.a(JB)V")
	public final void method328(long arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 56);
		this.field842[this.field831++] = (byte) (arg0 >> 48);
		this.field842[this.field831++] = (byte) (arg0 >> 40);
		this.field842[this.field831++] = (byte) (arg0 >> 32);
		this.field842[this.field831++] = (byte) (arg0 >> 24);
		this.field842[this.field831++] = (byte) (arg0 >> 16);
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) arg0;
	}

	@ObfuscatedName("ea.h(II)V")
	public final void method329(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method346(arg0 >>> 28 | 0x80);
					}
					this.method346(arg0 >>> 21 | 0x80);
				}
				this.method346(arg0 >>> 14 | 0x80);
			}
			this.method346(arg0 >>> 7 | 0x80);
		}
		this.method346(arg0 & 0x7F);
	}

	@ObfuscatedName("ea.i(II)V")
	public final void method331(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("ea.f(B)I")
	public final int method332() {
		int var1 = 0;
		int var2;
		for (var2 = this.method350(); var2 == 32767; var2 = this.method350()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("ea.a(BI)V")
	public final void method333(int arg0) {
		this.field842[this.field831 - arg0 - 4] = (byte) (arg0 >> 24);
		this.field842[this.field831 - arg0 - 3] = (byte) (arg0 >> 16);
		this.field842[this.field831 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field842[this.field831 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ea.g(B)I")
	public final int method334() {
		this.field831 += 2;
		int var1 = (this.field842[this.field831 - 1] & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.m(I)B")
	public final byte method335() {
		return (byte) -this.field842[this.field831++];
	}

	@ObfuscatedName("ea.a(Li;B)V")
	public final void method336(class88 arg0) {
		this.field831 += arg0.method612(arg0.method604(), this.field831, this.field842);
		this.field842[this.field831++] = 0;
	}

	@ObfuscatedName("ea.b(IB)V")
	public final void method337(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 16);
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) arg0;
	}

	@ObfuscatedName("ea.j(II)V")
	public final void method338(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 >> 24);
		this.field842[this.field831++] = (byte) (arg0 >> 16);
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) arg0;
	}

	@ObfuscatedName("ea.n(I)I")
	public final int method339() {
		this.field831 += 2;
		int var1 = (this.field842[this.field831 - 1] - 128 & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("ea.h(B)I")
	public final int method340() {
		this.field831 += 3;
		return (this.field842[this.field831 - 1] & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 16) + ((this.field842[this.field831 + -3] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.k(II)V")
	public final void method341(int arg0) {
		this.field842[this.field831 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("ea.b(Z)I")
	public final int method342() {
		int var1 = this.field842[this.field831] & 0xFF;
		return var1 < 128 ? this.method347() - 64 : this.method301() + -49152;
	}

	@ObfuscatedName("ea.o(I)I")
	public final int method343() {
		this.field831 += 2;
		return ((this.field842[this.field831 - 1] & 0xFF) << 8) + (this.field842[this.field831 - 2] & 0xFF);
	}

	@ObfuscatedName("ea.c(IB)V")
	public final void method344(int arg0) {
		this.field842[this.field831++] = (byte) (arg0 + 128);
		this.field842[this.field831++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("ea.d(IB)I")
	public final int method345(int arg0) {
		int var2 = class231.method1542(arg0, this.field842, this.field831);
		this.method338(var2);
		return var2;
	}

	@ObfuscatedName("ea.l(II)V")
	public final void method346(int arg0) {
		this.field842[this.field831++] = (byte) arg0;
	}

	@ObfuscatedName("ea.p(I)I")
	public final int method347() {
		return this.field842[this.field831++] & 0xFF;
	}

	@ObfuscatedName("ea.c(Z)I")
	public final int method349() {
		this.field831 += 2;
		return (this.field842[this.field831 - 1] - 128 & 0xFF) + ((this.field842[this.field831 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("ea.q(I)I")
	public final int method350() {
		int var1 = this.field842[this.field831] & 0xFF;
		return var1 < 128 ? this.method347() : this.method301() - 32768;
	}

	@ObfuscatedName("ea.b(ZI)V")
	public final void method351(int arg0) {
		this.field842[this.field831++] = (byte) arg0;
		this.field842[this.field831++] = (byte) (arg0 >> 8);
		this.field842[this.field831++] = (byte) (arg0 >> 16);
		this.field842[this.field831++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("ea.r(I)I")
	public final int method352() {
		return 128 - this.field842[this.field831++] & 0xFF;
	}

	@ObfuscatedName("ea.s(I)Li;")
	public final class88 method353() {
		if (this.field842[this.field831] == 0) {
			this.field831++;
			return null;
		} else {
			return this.method298();
		}
	}
}
