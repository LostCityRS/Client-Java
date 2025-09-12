package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("sb")
public class BZip2 {

	@ObfuscatedName("sb.a")
	public static BZip2State state = new BZip2State();

	@ObfuscatedName("sb.a([BI[BII)I")
	public static int decompress(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		BZip2State var5 = state;
		synchronized (state) {
			state.stream = arg2;
			state.next_in = arg4;
			state.decompressed = arg0;
			state.next_out = 0;
			state.avail_in = arg3;
			state.avail_out = arg1;
			state.bsLive = 0;
			state.bsBuff = 0;
			state.total_in_lo32 = 0;
			state.total_in_hi32 = 0;
			state.total_out_lo32 = 0;
			state.total_out_hi32 = 0;
			state.currBlockNo = 0;
			decompress(state);
			return arg1 - state.avail_out;
		}
	}

	@ObfuscatedName("sb.a(Ltb;)V")
	public static void finish(BZip2State arg0) {
		byte var1 = arg0.state_out_ch;
		int var2 = arg0.state_out_len;
		int var3 = arg0.c_nblock_used;
		int var4 = arg0.k0;
		int[] var5 = BZip2State.tt;
		int var6 = arg0.tPos;
		byte[] var7 = arg0.decompressed;
		int var8 = arg0.next_out;
		int var9 = arg0.avail_out;
		int var10 = var9;
		int var11 = arg0.save_nblock + 1;
		label67: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label67;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label67;
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
					break label67;
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
						break label67;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label67;
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
		if (arg0.total_out_lo32 < var23) {
			arg0.total_out_hi32++;
		}
		arg0.state_out_ch = var1;
		arg0.state_out_len = var2;
		arg0.c_nblock_used = var3;
		arg0.k0 = var4;
		BZip2State.tt = var5;
		arg0.tPos = var6;
		arg0.decompressed = var7;
		arg0.next_out = var8;
		arg0.avail_out = var9;
	}

	@ObfuscatedName("sb.b(Ltb;)V")
	public static void decompress(BZip2State arg0) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		int var20 = 0;
		int[] var21 = null;
		int[] var22 = null;
		int[] var23 = null;
		arg0.blockSize100k = 1;
		if (BZip2State.tt == null) {
			BZip2State.tt = new int[arg0.blockSize100k * 100000];
		}
		boolean var24 = true;
		while (true) {
			while (var24) {
				byte var25 = getUnsignedChar(arg0);
				if (var25 == 23) {
					return;
				}
				byte var26 = getUnsignedChar(arg0);
				byte var27 = getUnsignedChar(arg0);
				byte var28 = getUnsignedChar(arg0);
				byte var29 = getUnsignedChar(arg0);
				byte var30 = getUnsignedChar(arg0);
				arg0.currBlockNo++;
				byte var31 = getUnsignedChar(arg0);
				byte var32 = getUnsignedChar(arg0);
				byte var33 = getUnsignedChar(arg0);
				byte var34 = getUnsignedChar(arg0);
				byte var35 = getBit(arg0);
				if (var35 == 0) {
					arg0.blockRandomized = false;
				} else {
					arg0.blockRandomized = true;
				}
				if (arg0.blockRandomized) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.origPtr = 0;
				byte var36 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var36 & 0xFF;
				byte var37 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var37 & 0xFF;
				byte var38 = getUnsignedChar(arg0);
				arg0.origPtr = arg0.origPtr << 8 | var38 & 0xFF;
				for (int var39 = 0; var39 < 16; var39++) {
					byte var40 = getBit(arg0);
					if (var40 == 1) {
						arg0.inUse16[var39] = true;
					} else {
						arg0.inUse16[var39] = false;
					}
				}
				for (int var41 = 0; var41 < 256; var41++) {
					arg0.inUse[var41] = false;
				}
				for (int var42 = 0; var42 < 16; var42++) {
					if (arg0.inUse16[var42]) {
						for (int var43 = 0; var43 < 16; var43++) {
							byte var44 = getBit(arg0);
							if (var44 == 1) {
								arg0.inUse[var42 * 16 + var43] = true;
							}
						}
					}
				}
				makeMaps(arg0);
				int var45 = arg0.nInUse + 2;
				int var46 = getBits(3, arg0);
				int var47 = getBits(15, arg0);
				for (int var48 = 0; var48 < var47; var48++) {
					int var49 = 0;
					while (true) {
						byte var50 = getBit(arg0);
						if (var50 == 0) {
							arg0.selectorMtf[var48] = (byte) var49;
							break;
						}
						var49++;
					}
				}
				byte[] var51 = new byte[6];
				byte var52 = 0;
				while (var52 < var46) {
					var51[var52] = var52++;
				}
				for (int var53 = 0; var53 < var47; var53++) {
					byte var54 = arg0.selectorMtf[var53];
					byte var55 = var51[var54];
					while (var54 > 0) {
						var51[var54] = var51[var54 - 1];
						var54--;
					}
					var51[0] = var55;
					arg0.selector[var53] = var55;
				}
				for (int var56 = 0; var56 < var46; var56++) {
					int var57 = getBits(5, arg0);
					for (int var58 = 0; var58 < var45; var58++) {
						while (true) {
							byte var59 = getBit(arg0);
							if (var59 == 0) {
								arg0.len[var56][var58] = (byte) var57;
								break;
							}
							byte var60 = getBit(arg0);
							if (var60 == 0) {
								var57++;
							} else {
								var57--;
							}
						}
					}
				}
				for (int var61 = 0; var61 < var46; var61++) {
					byte var62 = 32;
					byte var63 = 0;
					for (int var64 = 0; var64 < var45; var64++) {
						if (arg0.len[var61][var64] > var63) {
							var63 = arg0.len[var61][var64];
						}
						if (arg0.len[var61][var64] < var62) {
							var62 = arg0.len[var61][var64];
						}
					}
					createDecodeTables(arg0.limit[var61], arg0.base[var61], arg0.perm[var61], arg0.len[var61], var62, var63, var45);
					arg0.minLens[var61] = var62;
				}
				int var65 = arg0.nInUse + 1;
				int var66 = arg0.blockSize100k * 100000;
				int var67 = -1;
				byte var68 = 0;
				for (int var69 = 0; var69 <= 255; var69++) {
					arg0.unzftab[var69] = 0;
				}
				int var70 = 4095;
				for (int var71 = 15; var71 >= 0; var71--) {
					for (int var72 = 15; var72 >= 0; var72--) {
						arg0.mtfa[var70] = (byte) (var71 * 16 + var72);
						var70--;
					}
					arg0.mtfbase[var71] = var70 + 1;
				}
				int var73 = 0;
				if (var68 == 0) {
					var67++;
					var68 = 50;
					byte var74 = arg0.selector[var67];
					var20 = arg0.minLens[var74];
					var21 = arg0.limit[var74];
					var23 = arg0.perm[var74];
					var22 = arg0.base[var74];
				}
				int var104 = var68 - 1;
				int var75 = var20;
				int var76;
				byte var77;
				for (var76 = getBits(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
					var75++;
					var77 = getBit(arg0);
				}
				int var78 = var23[var76 - var22[var75]];
				while (true) {
					while (var78 != var65) {
						if (var78 == 0 || var78 == 1) {
							int var79 = -1;
							int var80 = 1;
							do {
								if (var78 == 0) {
									var79 += var80;
								} else if (var78 == 1) {
									var79 += var80 * 2;
								}
								var80 *= 2;
								if (var104 == 0) {
									var67++;
									var104 = 50;
									byte var81 = arg0.selector[var67];
									var20 = arg0.minLens[var81];
									var21 = arg0.limit[var81];
									var23 = arg0.perm[var81];
									var22 = arg0.base[var81];
								}
								var104--;
								int var82 = var20;
								int var83;
								byte var84;
								for (var83 = getBits(var20, arg0); var83 > var21[var82]; var83 = var83 << 1 | var84) {
									var82++;
									var84 = getBit(arg0);
								}
								var78 = var23[var83 - var22[var82]];
							} while (var78 == 0 || var78 == 1);
							var79++;
							byte var85 = arg0.seqToUnseq[arg0.mtfa[arg0.mtfbase[0]] & 0xFF];
							arg0.unzftab[var85 & 0xFF] += var79;
							while (var79 > 0) {
								BZip2State.tt[var73] = var85 & 0xFF;
								var73++;
								var79--;
							}
						} else {
							int var86 = var78 - 1;
							byte var88;
							if (var86 < 16) {
								int var87 = arg0.mtfbase[0];
								var88 = arg0.mtfa[var87 + var86];
								while (var86 > 3) {
									int var89 = var87 + var86;
									arg0.mtfa[var89] = arg0.mtfa[var89 - 1];
									arg0.mtfa[var89 - 1] = arg0.mtfa[var89 - 2];
									arg0.mtfa[var89 - 2] = arg0.mtfa[var89 - 3];
									arg0.mtfa[var89 - 3] = arg0.mtfa[var89 - 4];
									var86 -= 4;
								}
								while (var86 > 0) {
									arg0.mtfa[var87 + var86] = arg0.mtfa[var87 + var86 - 1];
									var86--;
								}
								arg0.mtfa[var87] = var88;
							} else {
								int var90 = var86 / 16;
								int var91 = var86 % 16;
								int var92 = arg0.mtfbase[var90] + var91;
								var88 = arg0.mtfa[var92];
								while (var92 > arg0.mtfbase[var90]) {
									arg0.mtfa[var92] = arg0.mtfa[var92 - 1];
									var92--;
								}
								int var10002 = arg0.mtfbase[var90]++;
								while (var90 > 0) {
									var10002 = arg0.mtfbase[var90]--;
									arg0.mtfa[arg0.mtfbase[var90]] = arg0.mtfa[arg0.mtfbase[var90 - 1] + 16 - 1];
									var90--;
								}
								var10002 = arg0.mtfbase[0]--;
								arg0.mtfa[arg0.mtfbase[0]] = var88;
								if (arg0.mtfbase[0] == 0) {
									int var93 = 4095;
									for (int var94 = 15; var94 >= 0; var94--) {
										for (int var95 = 15; var95 >= 0; var95--) {
											arg0.mtfa[var93] = arg0.mtfa[arg0.mtfbase[var94] + var95];
											var93--;
										}
										arg0.mtfbase[var94] = var93 + 1;
									}
								}
							}
							arg0.unzftab[arg0.seqToUnseq[var88 & 0xFF] & 0xFF]++;
							BZip2State.tt[var73] = arg0.seqToUnseq[var88 & 0xFF] & 0xFF;
							var73++;
							if (var104 == 0) {
								var67++;
								var104 = 50;
								byte var96 = arg0.selector[var67];
								var20 = arg0.minLens[var96];
								var21 = arg0.limit[var96];
								var23 = arg0.perm[var96];
								var22 = arg0.base[var96];
							}
							var104--;
							int var97 = var20;
							int var98;
							byte var99;
							for (var98 = getBits(var20, arg0); var98 > var21[var97]; var98 = var98 << 1 | var99) {
								var97++;
								var99 = getBit(arg0);
							}
							var78 = var23[var98 - var22[var97]];
						}
					}
					arg0.state_out_len = 0;
					arg0.state_out_ch = 0;
					arg0.cftab[0] = 0;
					for (int var100 = 1; var100 <= 256; var100++) {
						arg0.cftab[var100] = arg0.unzftab[var100 - 1];
					}
					for (int var101 = 1; var101 <= 256; var101++) {
						arg0.cftab[var101] += arg0.cftab[var101 - 1];
					}
					for (int var102 = 0; var102 < var73; var102++) {
						byte var103 = (byte) (BZip2State.tt[var102] & 0xFF);
						BZip2State.tt[arg0.cftab[var103 & 0xFF]] |= var102 << 8;
						arg0.cftab[var103 & 0xFF]++;
					}
					arg0.tPos = BZip2State.tt[arg0.origPtr] >> 8;
					arg0.c_nblock_used = 0;
					arg0.tPos = BZip2State.tt[arg0.tPos];
					arg0.k0 = (byte) (arg0.tPos & 0xFF);
					arg0.tPos >>= 0x8;
					arg0.c_nblock_used++;
					arg0.save_nblock = var73;
					finish(arg0);
					if (arg0.c_nblock_used == arg0.save_nblock + 1 && arg0.state_out_len == 0) {
						var24 = true;
						break;
					}
					var24 = false;
					break;
				}
			}
			return;
		}
	}

	@ObfuscatedName("sb.c(Ltb;)B")
	public static byte getUnsignedChar(BZip2State arg0) {
		return (byte) getBits(8, arg0);
	}

	@ObfuscatedName("sb.d(Ltb;)B")
	public static byte getBit(BZip2State arg0) {
		return (byte) getBits(1, arg0);
	}

	@ObfuscatedName("sb.a(ILtb;)I")
	public static int getBits(int arg0, BZip2State arg1) {
		while (arg1.bsLive < arg0) {
			arg1.bsBuff = arg1.bsBuff << 8 | arg1.stream[arg1.next_in] & 0xFF;
			arg1.bsLive += 8;
			arg1.next_in++;
			arg1.avail_in--;
			arg1.total_in_lo32++;
			if (arg1.total_in_lo32 == 0) {
				arg1.total_in_hi32++;
			}
		}
		int var2 = arg1.bsBuff >> arg1.bsLive - arg0 & (0x1 << arg0) - 1;
		arg1.bsLive -= arg0;
		return var2;
	}

	@ObfuscatedName("sb.e(Ltb;)V")
	public static void makeMaps(BZip2State arg0) {
		arg0.nInUse = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.inUse[var1]) {
				arg0.seqToUnseq[arg0.nInUse] = (byte) var1;
				arg0.nInUse++;
			}
		}
	}

	@ObfuscatedName("sb.a([I[I[I[BIII)V")
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
			int var16 = var14 + (arg1[var15 + 1] - arg1[var15]);
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}
}
