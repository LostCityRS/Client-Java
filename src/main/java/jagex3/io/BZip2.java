package jagex3.io;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ge")
public final class BZip2 {

	@ObfuscatedName("ge.a")
	public static BZip2State field1081 = new BZip2State();

	@ObfuscatedName("ge.a(Lmb;)V")
	public static void method439(BZip2State arg0) {
		arg0.field1833 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.field1818[var1]) {
				arg0.field1804[arg0.field1833] = (byte) var1;
				arg0.field1833++;
			}
		}
	}

	@ObfuscatedName("ge.b(Lmb;)V")
	public static void method440(BZip2State arg0) {
		byte var1 = arg0.field1809;
		int var2 = arg0.field1802;
		int var3 = arg0.field1792;
		int var4 = arg0.field1801;
		int[] var5 = Statics.field899;
		int var6 = arg0.field1810;
		byte[] var7 = arg0.field1827;
		int var8 = arg0.field1815;
		int var9 = arg0.field1813;
		int var10 = var9;
		int var11 = arg0.field1799 + 1;
		label63: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label63;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label63;
						}
						var7[var8] = var1;
						var8++;
						var9--;
						break;
					}
					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}
			}
			boolean var12 = true;
			while (var12) {
				var12 = false;
				if (var3 == var11) {
					var2 = 0;
					break label63;
				}
				var1 = (byte) var4;
				int var13 = var5[var6];
				byte var14 = (byte) (var13 & 0xFF);
				var6 = var13 >> 8;
				var3++;
				if (var4 != var14) {
					var4 = var14;
					if (var9 == 0) {
						var2 = 1;
						break label63;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label63;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				}
			}
			var2 = 2;
			int var15 = var5[var6];
			byte var16 = (byte) (var15 & 0xFF);
			var6 = var15 >> 8;
			var3++;
			if (var3 != var11) {
				if (var4 == var16) {
					var2 = 3;
					int var17 = var5[var6];
					byte var18 = (byte) (var17 & 0xFF);
					var6 = var17 >> 8;
					var3++;
					if (var3 != var11) {
						if (var4 == var18) {
							int var19 = var5[var6];
							byte var20 = (byte) (var19 & 0xFF);
							int var21 = var19 >> 8;
							var3++;
							var2 = (var20 & 0xFF) + 4;
							int var22 = var5[var21];
							var4 = (byte) (var22 & 0xFF);
							var6 = var22 >> 8;
							var3++;
						} else {
							var4 = var18;
						}
					}
				} else {
					var4 = var16;
				}
			}
		}
		int var23 = arg0.field1836;
		arg0.field1836 += var10 - var9;
		arg0.field1809 = var1;
		arg0.field1802 = var2;
		arg0.field1792 = var3;
		arg0.field1801 = var4;
		Statics.field899 = var5;
		arg0.field1810 = var6;
		arg0.field1827 = var7;
		arg0.field1815 = var8;
		arg0.field1813 = var9;
	}

	@ObfuscatedName("ge.c(Lmb;)V")
	public static void method441(BZip2State arg0) {
		arg0.field1800 = 1;
		if (Statics.field899 == null) {
			Statics.field899 = new int[arg0.field1800 * 100000];
		}
		boolean var1 = true;
		while (true) {
			while (var1) {
				byte var2 = method442(arg0);
				if (var2 == 23) {
					return;
				}
				byte var3 = method442(arg0);
				byte var4 = method442(arg0);
				byte var5 = method442(arg0);
				byte var6 = method442(arg0);
				byte var7 = method442(arg0);
				byte var8 = method442(arg0);
				byte var9 = method442(arg0);
				byte var10 = method442(arg0);
				byte var11 = method442(arg0);
				byte var12 = method445(arg0);
				arg0.field1791 = 0;
				byte var13 = method442(arg0);
				arg0.field1791 = arg0.field1791 << 8 | var13 & 0xFF;
				byte var14 = method442(arg0);
				arg0.field1791 = arg0.field1791 << 8 | var14 & 0xFF;
				byte var15 = method442(arg0);
				arg0.field1791 = arg0.field1791 << 8 | var15 & 0xFF;
				for (int var16 = 0; var16 < 16; var16++) {
					byte var17 = method445(arg0);
					if (var17 == 1) {
						arg0.field1814[var16] = true;
					} else {
						arg0.field1814[var16] = false;
					}
				}
				for (int var18 = 0; var18 < 256; var18++) {
					arg0.field1818[var18] = false;
				}
				for (int var19 = 0; var19 < 16; var19++) {
					if (arg0.field1814[var19]) {
						for (int var20 = 0; var20 < 16; var20++) {
							byte var21 = method445(arg0);
							if (var21 == 1) {
								arg0.field1818[var19 * 16 + var20] = true;
							}
						}
					}
				}
				method439(arg0);
				int var22 = arg0.field1833 + 2;
				int var23 = method444(3, arg0);
				int var24 = method444(15, arg0);
				for (int var25 = 0; var25 < var24; var25++) {
					int var26 = 0;
					while (true) {
						byte var27 = method445(arg0);
						if (var27 == 0) {
							arg0.field1829[var25] = (byte) var26;
							break;
						}
						var26++;
					}
				}
				byte[] var28 = new byte[6];
				byte var29 = 0;
				while (var29 < var23) {
					var28[var29] = var29++;
				}
				for (int var30 = 0; var30 < var24; var30++) {
					byte var31 = arg0.field1829[var30];
					byte var32 = var28[var31];
					while (var31 > 0) {
						var28[var31] = var28[var31 - 1];
						var31--;
					}
					var28[0] = var32;
					arg0.field1798[var30] = var32;
				}
				for (int var33 = 0; var33 < var23; var33++) {
					int var34 = method444(5, arg0);
					for (int var35 = 0; var35 < var22; var35++) {
						while (true) {
							byte var36 = method445(arg0);
							if (var36 == 0) {
								arg0.field1812[var33][var35] = (byte) var34;
								break;
							}
							byte var37 = method445(arg0);
							if (var37 == 0) {
								var34++;
							} else {
								var34--;
							}
						}
					}
				}
				for (int var38 = 0; var38 < var23; var38++) {
					byte var39 = 32;
					byte var40 = 0;
					for (int var41 = 0; var41 < var22; var41++) {
						if (arg0.field1812[var38][var41] > var40) {
							var40 = arg0.field1812[var38][var41];
						}
						if (arg0.field1812[var38][var41] < var39) {
							var39 = arg0.field1812[var38][var41];
						}
					}
					method443(arg0.field1825[var38], arg0.field1832[var38], arg0.field1823[var38], arg0.field1812[var38], var39, var40, var22);
					arg0.field1817[var38] = var39;
				}
				int var42 = arg0.field1833 + 1;
				byte var43 = -1;
				for (int var44 = 0; var44 <= 255; var44++) {
					arg0.field1835[var44] = 0;
				}
				int var45 = 4095;
				for (int var46 = 15; var46 >= 0; var46--) {
					for (int var47 = 15; var47 >= 0; var47--) {
						arg0.field1830[var45] = (byte) (var46 * 16 + var47);
						var45--;
					}
					arg0.field1808[var46] = var45 + 1;
				}
				int var48 = 0;
				int var84 = var43 + 1;
				byte var49 = 50;
				byte var50 = arg0.field1798[0];
				int var51 = arg0.field1817[var50];
				int[] var52 = arg0.field1825[var50];
				int[] var53 = arg0.field1823[var50];
				int[] var54 = arg0.field1832[var50];
				int var85 = var49 - 1;
				int var55 = var51;
				int var56;
				byte var57;
				for (var56 = method444(var51, arg0); var56 > var52[var55]; var56 = var56 << 1 | var57) {
					var55++;
					var57 = method445(arg0);
				}
				int var58 = var53[var56 - var54[var55]];
				while (true) {
					while (var42 != var58) {
						if (var58 == 0 || var58 == 1) {
							int var59 = -1;
							int var60 = 1;
							do {
								if (var58 == 0) {
									var59 += var60;
								} else if (var58 == 1) {
									var59 += var60 * 2;
								}
								var60 *= 2;
								if (var85 == 0) {
									var84++;
									var85 = 50;
									byte var61 = arg0.field1798[var84];
									var51 = arg0.field1817[var61];
									var52 = arg0.field1825[var61];
									var53 = arg0.field1823[var61];
									var54 = arg0.field1832[var61];
								}
								var85--;
								int var62 = var51;
								int var63;
								byte var64;
								for (var63 = method444(var51, arg0); var63 > var52[var62]; var63 = var63 << 1 | var64) {
									var62++;
									var64 = method445(arg0);
								}
								var58 = var53[var63 - var54[var62]];
							} while (var58 == 0 || var58 == 1);
							var59++;
							byte var65 = arg0.field1804[arg0.field1830[arg0.field1808[0]] & 0xFF];
							arg0.field1835[var65 & 0xFF] += var59;
							while (var59 > 0) {
								Statics.field899[var48] = var65 & 0xFF;
								var48++;
								var59--;
							}
						} else {
							int var66 = var58 - 1;
							byte var68;
							if (var66 < 16) {
								int var67 = arg0.field1808[0];
								var68 = arg0.field1830[var66 + var67];
								while (var66 > 3) {
									int var69 = var66 + var67;
									arg0.field1830[var69] = arg0.field1830[var69 - 1];
									arg0.field1830[var69 - 1] = arg0.field1830[var69 - 2];
									arg0.field1830[var69 - 2] = arg0.field1830[var69 - 3];
									arg0.field1830[var69 - 3] = arg0.field1830[var69 - 4];
									var66 -= 4;
								}
								while (var66 > 0) {
									arg0.field1830[var66 + var67] = arg0.field1830[var66 + var67 - 1];
									var66--;
								}
								arg0.field1830[var67] = var68;
							} else {
								int var70 = var66 / 16;
								int var71 = var66 % 16;
								int var72 = arg0.field1808[var70] + var71;
								var68 = arg0.field1830[var72];
								while (var72 > arg0.field1808[var70]) {
									arg0.field1830[var72] = arg0.field1830[var72 - 1];
									var72--;
								}
								int var10002 = arg0.field1808[var70]++;
								while (var70 > 0) {
									var10002 = arg0.field1808[var70]--;
									arg0.field1830[arg0.field1808[var70]] = arg0.field1830[arg0.field1808[var70 - 1] + 16 - 1];
									var70--;
								}
								var10002 = arg0.field1808[0]--;
								arg0.field1830[arg0.field1808[0]] = var68;
								if (arg0.field1808[0] == 0) {
									int var73 = 4095;
									for (int var74 = 15; var74 >= 0; var74--) {
										for (int var75 = 15; var75 >= 0; var75--) {
											arg0.field1830[var73] = arg0.field1830[arg0.field1808[var74] + var75];
											var73--;
										}
										arg0.field1808[var74] = var73 + 1;
									}
								}
							}
							arg0.field1835[arg0.field1804[var68 & 0xFF] & 0xFF]++;
							Statics.field899[var48] = arg0.field1804[var68 & 0xFF] & 0xFF;
							var48++;
							if (var85 == 0) {
								var84++;
								var85 = 50;
								byte var76 = arg0.field1798[var84];
								var51 = arg0.field1817[var76];
								var52 = arg0.field1825[var76];
								var53 = arg0.field1823[var76];
								var54 = arg0.field1832[var76];
							}
							var85--;
							int var77 = var51;
							int var78;
							byte var79;
							for (var78 = method444(var51, arg0); var78 > var52[var77]; var78 = var78 << 1 | var79) {
								var77++;
								var79 = method445(arg0);
							}
							var58 = var53[var78 - var54[var77]];
						}
					}
					arg0.field1802 = 0;
					arg0.field1809 = 0;
					arg0.field1806[0] = 0;
					for (int var80 = 1; var80 <= 256; var80++) {
						arg0.field1806[var80] = arg0.field1835[var80 - 1];
					}
					for (int var81 = 1; var81 <= 256; var81++) {
						arg0.field1806[var81] += arg0.field1806[var81 - 1];
					}
					for (int var82 = 0; var82 < var48; var82++) {
						byte var83 = (byte) (Statics.field899[var82] & 0xFF);
						Statics.field899[arg0.field1806[var83 & 0xFF]] |= var82 << 8;
						arg0.field1806[var83 & 0xFF]++;
					}
					arg0.field1810 = Statics.field899[arg0.field1791] >> 8;
					arg0.field1792 = 0;
					arg0.field1810 = Statics.field899[arg0.field1810];
					arg0.field1801 = (byte) (arg0.field1810 & 0xFF);
					arg0.field1810 >>= 0x8;
					arg0.field1792++;
					arg0.field1799 = var48;
					method440(arg0);
					if (arg0.field1799 + 1 == arg0.field1792 && arg0.field1802 == 0) {
						var1 = true;
						break;
					}
					var1 = false;
					break;
				}
			}
			return;
		}
	}

	@ObfuscatedName("ge.d(Lmb;)B")
	public static byte method442(BZip2State arg0) {
		return (byte) method444(8, arg0);
	}

	@ObfuscatedName("ge.a([I[I[I[BIII)V")
	public static void method443(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		for (int var8 = arg4; var8 <= arg5; var8++) {
			for (int var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}
		for (int var10 = 0; var10 < 23; var10++) {
			arg1[var10] = 0;
		}
		for (int var11 = 0; var11 < arg6; var11++) {
			arg1[arg3[var11] + 1]++;
		}
		for (int var12 = 1; var12 < 23; var12++) {
			arg1[var12] += arg1[var12 - 1];
		}
		for (int var13 = 0; var13 < 23; var13++) {
			arg0[var13] = 0;
		}
		int var14 = 0;
		for (int var15 = arg4; var15 <= arg5; var15++) {
			int var16 = arg1[var15 + 1] + var14 - arg1[var15];
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}

	@ObfuscatedName("ge.a(ILmb;)I")
	public static int method444(int arg0, BZip2State arg1) {
		while (arg1.field1837 < arg0) {
			arg1.field1824 = arg1.field1824 << 8 | arg1.field1820[arg1.field1822] & 0xFF;
			arg1.field1837 += 8;
			arg1.field1822++;
			arg1.field1821++;
		}
		int var2 = arg1.field1824 >> arg1.field1837 - arg0 & (0x1 << arg0) - 1;
		arg1.field1837 -= arg0;
		return var2;
	}

	@ObfuscatedName("ge.e(Lmb;)B")
	public static byte method445(BZip2State arg0) {
		return (byte) method444(1, arg0);
	}

	@ObfuscatedName("ge.a([BI[BII)I")
	public static int method446(byte[] arg0, int arg1, byte[] arg2, int arg3) {
		BZip2State var4 = field1081;
		synchronized (field1081) {
			field1081.field1820 = arg2;
			field1081.field1822 = 9;
			field1081.field1827 = arg0;
			field1081.field1815 = 0;
			field1081.field1813 = arg1;
			field1081.field1837 = 0;
			field1081.field1824 = 0;
			field1081.field1821 = 0;
			field1081.field1836 = 0;
			method441(field1081);
			int var5 = arg1 - field1081.field1813;
			field1081.field1820 = null;
			field1081.field1827 = null;
			return var5;
		}
	}
}
