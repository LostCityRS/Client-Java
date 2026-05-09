package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("th")
public final class BZip2 {

	@ObfuscatedName("th.a")
	public static final BZip2State state = new BZip2State();
	@ObfuscatedName("jc.G")
	public static int[] field1831;

	@ObfuscatedName("th.a([BI[BII)I")
	public static int decompress(byte[] arg0, int arg1, byte[] arg2, int arg3) {
		BZip2State var4 = state;
		synchronized (state) {
			state.stream = arg2;
			state.next_in = 9;
			state.decompressed = arg0;
			state.next_out = 0;
			state.avail_out = arg1;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.total_in_lo32 = 0;
			state.total_out_lo32 = 0;
			decompress(state);
			int var5 = arg1 - state.avail_out;
			state.stream = null;
			state.decompressed = null;
			return var5;
		}
	}

	@ObfuscatedName("th.a(Lpb;)B")
	public static byte getBit(BZip2State arg0) {
		return (byte) getBits(1, arg0);
	}

	@ObfuscatedName("th.a(ILpb;)I")
	public static int getBits(int arg0, BZip2State arg1) {
		while (arg1.bsLive < arg0) {
			arg1.bsBuff = arg1.bsBuff << 8 | arg1.stream[arg1.next_in] & 0xFF;
			arg1.bsLive += 8;
			arg1.next_in++;
			arg1.total_in_lo32++;
		}
		int var2 = arg1.bsBuff >> arg1.bsLive - arg0 & (0x1 << arg0) - 1;
		arg1.bsLive -= arg0;
		return var2;
	}

	@ObfuscatedName("th.a([I[I[I[BIII)V")
	public static void createDecodeTables(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
			int var16 = var14 + arg1[var15 + 1] - arg1[var15];
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}

	@ObfuscatedName("th.b(Lpb;)V")
	public static void decompress(BZip2State arg0) {
		arg0.blockSize100k = 1;
		if (field1831 == null) {
			field1831 = new int[arg0.blockSize100k * 100000];
		}
		boolean var1 = true;
		while (true) {
			while (var1) {
				byte var2 = getUnsignedChar(arg0);
				if (var2 == 23) {
					return;
				}
				byte var3 = getUnsignedChar(arg0);
				byte var4 = getUnsignedChar(arg0);
				byte var5 = getUnsignedChar(arg0);
				byte var6 = getUnsignedChar(arg0);
				byte var7 = getUnsignedChar(arg0);
				byte var8 = getUnsignedChar(arg0);
				byte var9 = getUnsignedChar(arg0);
				byte var10 = getUnsignedChar(arg0);
				byte var11 = getUnsignedChar(arg0);
				byte var12 = getBit(arg0);
				arg0.origPtr = 0;
				byte var13 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var13 & 0xFF;
				byte var14 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var14 & 0xFF;
				byte var15 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var15 & 0xFF;
				for (int var16 = 0; var16 < 16; var16++) {
					byte var17 = getBit(arg0);
					if (var17 == 1) {
						arg0.inUse16[var16] = true;
					} else {
						arg0.inUse16[var16] = false;
					}
				}
				for (int var18 = 0; var18 < 256; var18++) {
					arg0.inUse[var18] = false;
				}
				for (int var19 = 0; var19 < 16; var19++) {
					if (arg0.inUse16[var19]) {
						for (int var20 = 0; var20 < 16; var20++) {
							byte var21 = getBit(arg0);
							if (var21 == 1) {
								arg0.inUse[var19 * 16 + var20] = true;
							}
						}
					}
				}
				makeMaps(arg0);
				int var22 = arg0.nInUse + 2;
				int var23 = getBits(3, arg0);
				int var24 = getBits(15, arg0);
				for (int var25 = 0; var25 < var24; var25++) {
					int var26 = 0;
					while (true) {
						byte var27 = getBit(arg0);
						if (var27 == 0) {
							arg0.selectorMtf[var25] = (byte) var26;
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
					byte var31 = arg0.selectorMtf[var30];
					byte var32 = var28[var31];
					while (var31 > 0) {
						var28[var31] = var28[var31 - 1];
						var31--;
					}
					var28[0] = var32;
					arg0.selector[var30] = var32;
				}
				for (int var33 = 0; var33 < var23; var33++) {
					int var34 = getBits(5, arg0);
					for (int var35 = 0; var35 < var22; var35++) {
						while (true) {
							byte var36 = getBit(arg0);
							if (var36 == 0) {
								arg0.len[var33][var35] = (byte) var34;
								break;
							}
							byte var37 = getBit(arg0);
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
						if (arg0.len[var38][var41] > var40) {
							var40 = arg0.len[var38][var41];
						}
						if (arg0.len[var38][var41] < var39) {
							var39 = arg0.len[var38][var41];
						}
					}
					createDecodeTables(arg0.limit[var38], arg0.base[var38], arg0.perm[var38], arg0.len[var38], var39, var40, var22);
					arg0.minLens[var38] = var39;
				}
				int var42 = arg0.nInUse + 1;
				byte var43 = -1;
				for (int var44 = 0; var44 <= 255; var44++) {
					arg0.unzftab[var44] = 0;
				}
				int var45 = 4095;
				for (int var46 = 15; var46 >= 0; var46--) {
					for (int var47 = 15; var47 >= 0; var47--) {
						arg0.mtfa[var45] = (byte) (var46 * 16 + var47);
						var45--;
					}
					arg0.mtfbase[var46] = var45 + 1;
				}
				int var48 = 0;
				int var84 = var43 + 1;
				byte var49 = 50;
				byte var50 = arg0.selector[0];
				int var51 = arg0.minLens[var50];
				int[] var52 = arg0.limit[var50];
				int[] var53 = arg0.perm[var50];
				int[] var54 = arg0.base[var50];
				int var85 = var49 - 1;
				int var55 = var51;
				int var56;
				byte var57;
				for (var56 = getBits(var51, arg0); var56 > var52[var55]; var56 = var56 << 1 | var57) {
					var55++;
					var57 = getBit(arg0);
				}
				int var58 = var53[var56 - var54[var55]];
				while (true) {
					while (var58 != var42) {
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
									byte var61 = arg0.selector[var84];
									var51 = arg0.minLens[var61];
									var52 = arg0.limit[var61];
									var53 = arg0.perm[var61];
									var54 = arg0.base[var61];
								}
								var85--;
								int var62 = var51;
								int var63;
								byte var64;
								for (var63 = getBits(var51, arg0); var63 > var52[var62]; var63 = var63 << 1 | var64) {
									var62++;
									var64 = getBit(arg0);
								}
								var58 = var53[var63 - var54[var62]];
							} while (var58 == 0 || var58 == 1);
							var59++;
							byte var65 = arg0.seqToUnseq[arg0.mtfa[arg0.mtfbase[0]] & 0xFF];
							arg0.unzftab[var65 & 0xFF] += var59;
							while (var59 > 0) {
								field1831[var48] = var65 & 0xFF;
								var48++;
								var59--;
							}
						} else {
							int var66 = var58 - 1;
							byte var68;
							if (var66 < 16) {
								int var67 = arg0.mtfbase[0];
								var68 = arg0.mtfa[var67 + var66];
								while (var66 > 3) {
									int var69 = var67 + var66;
									arg0.mtfa[var69] = arg0.mtfa[var69 - 1];
									arg0.mtfa[var69 - 1] = arg0.mtfa[var69 - 2];
									arg0.mtfa[var69 - 2] = arg0.mtfa[var69 - 3];
									arg0.mtfa[var69 - 3] = arg0.mtfa[var69 - 4];
									var66 -= 4;
								}
								while (var66 > 0) {
									arg0.mtfa[var67 + var66] = arg0.mtfa[var67 + var66 - 1];
									var66--;
								}
								arg0.mtfa[var67] = var68;
							} else {
								int var70 = var66 / 16;
								int var71 = var66 % 16;
								int var72 = arg0.mtfbase[var70] + var71;
								var68 = arg0.mtfa[var72];
								while (var72 > arg0.mtfbase[var70]) {
									arg0.mtfa[var72] = arg0.mtfa[var72 - 1];
									var72--;
								}
								int var10002 = arg0.mtfbase[var70]++;
								while (var70 > 0) {
									var10002 = arg0.mtfbase[var70]--;
									arg0.mtfa[arg0.mtfbase[var70]] = arg0.mtfa[arg0.mtfbase[var70 - 1] + 16 - 1];
									var70--;
								}
								var10002 = arg0.mtfbase[0]--;
								arg0.mtfa[arg0.mtfbase[0]] = var68;
								if (arg0.mtfbase[0] == 0) {
									int var73 = 4095;
									for (int var74 = 15; var74 >= 0; var74--) {
										for (int var75 = 15; var75 >= 0; var75--) {
											arg0.mtfa[var73] = arg0.mtfa[arg0.mtfbase[var74] + var75];
											var73--;
										}
										arg0.mtfbase[var74] = var73 + 1;
									}
								}
							}
							arg0.unzftab[arg0.seqToUnseq[var68 & 0xFF] & 0xFF]++;
							field1831[var48] = arg0.seqToUnseq[var68 & 0xFF] & 0xFF;
							var48++;
							if (var85 == 0) {
								var84++;
								var85 = 50;
								byte var76 = arg0.selector[var84];
								var51 = arg0.minLens[var76];
								var52 = arg0.limit[var76];
								var53 = arg0.perm[var76];
								var54 = arg0.base[var76];
							}
							var85--;
							int var77 = var51;
							int var78;
							byte var79;
							for (var78 = getBits(var51, arg0); var78 > var52[var77]; var78 = var78 << 1 | var79) {
								var77++;
								var79 = getBit(arg0);
							}
							var58 = var53[var78 - var54[var77]];
						}
					}
					arg0.state_out_len = 0;
					arg0.state_out_ch = 0;
					arg0.cftab[0] = 0;
					for (int var80 = 1; var80 <= 256; var80++) {
						arg0.cftab[var80] = arg0.unzftab[var80 - 1];
					}
					for (int var81 = 1; var81 <= 256; var81++) {
						arg0.cftab[var81] += arg0.cftab[var81 - 1];
					}
					for (int var82 = 0; var82 < var48; var82++) {
						byte var83 = (byte) (field1831[var82] & 0xFF);
						field1831[arg0.cftab[var83 & 0xFF]] |= var82 << 8;
						arg0.cftab[var83 & 0xFF]++;
					}
					arg0.tPos = field1831[arg0.origPtr] >> 8;
					arg0.c_nblock_used = 0;
					arg0.tPos = field1831[arg0.tPos];
					arg0.k0 = (byte) (arg0.tPos & 0xFF);
					arg0.tPos >>= 0x8;
					arg0.c_nblock_used++;
					arg0.save_nblock = var48;
					finish(arg0);
					if (arg0.c_nblock_used == arg0.save_nblock + 1 && arg0.state_out_len == 0) {
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

	@ObfuscatedName("th.c(Lpb;)B")
	public static byte getUnsignedChar(BZip2State arg0) {
		return (byte) getBits(8, arg0);
	}

	@ObfuscatedName("th.d(Lpb;)V")
	public static void makeMaps(BZip2State arg0) {
		arg0.nInUse = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.inUse[var1]) {
				arg0.seqToUnseq[arg0.nInUse] = (byte) var1;
				arg0.nInUse++;
			}
		}
	}

	@ObfuscatedName("th.e(Lpb;)V")
	public static void finish(BZip2State arg0) {
		byte var1 = arg0.state_out_ch;
		int var2 = arg0.state_out_len;
		int var3 = arg0.c_nblock_used;
		int var4 = arg0.k0;
		int[] var5 = field1831;
		int var6 = arg0.tPos;
		byte[] var7 = arg0.decompressed;
		int var8 = arg0.next_out;
		int var9 = arg0.avail_out;
		int var10 = var9;
		int var11 = arg0.save_nblock + 1;
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
				if (var14 != var4) {
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
				if (var16 == var4) {
					var2 = 3;
					int var17 = var5[var6];
					byte var18 = (byte) (var17 & 0xFF);
					var6 = var17 >> 8;
					var3++;
					if (var3 != var11) {
						if (var18 == var4) {
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
		int var23 = arg0.total_out_lo32;
		arg0.total_out_lo32 += var10 - var9;
		arg0.state_out_ch = var1;
		arg0.state_out_len = var2;
		arg0.c_nblock_used = var3;
		arg0.k0 = var4;
		field1831 = var5;
		arg0.tPos = var6;
		arg0.decompressed = var7;
		arg0.next_out = var8;
		arg0.avail_out = var9;
	}
}
