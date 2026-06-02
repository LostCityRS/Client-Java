package jagex3.client;

import deob.ObfuscatedName;
import jagex3.config.FloType;
import jagex3.config.FluType;
import jagex3.config.LocType;
import jagex3.dash3d.*;
import jagex3.io.Packet;
import jagex3.sound.BgSound;

public class ClientBuild {
	@ObfuscatedName("kg.ab")
	public static final byte[][][] mapl = new byte[4][104][104];
	@ObfuscatedName("kb.r")
	public static final int[][][] zoneMapArchiveIds = new int[4][13][13];
	@ObfuscatedName("ta.X")
	public static final int[] WSHAPE0 = new int[] { 1, 2, 4, 8 };
	@ObfuscatedName("vi.c")
	public static final int[] WSHAPE1 = new int[] { 16, 32, 64, 128 };
	@ObfuscatedName("ba.n")
	public static final int[] DECORXOF = new int[] { 1, 0, -1, 0 };
	@ObfuscatedName("hi.i")
	public static final int[] DECORZOF = new int[] { 0, -1, 0, 1 };
	@ObfuscatedName("pe.F")
	public static final int[] DECORXOF2 = new int[] { 1, -1, -1, 1 };
	@ObfuscatedName("cj.cb")
	public static final int[] DECORZOF2 = new int[] { -1, -1, 1, 1 };
	@ObfuscatedName("gd.p")
	public static int ligOff = (int) (Math.random() * 33.0D) - 16;
	@ObfuscatedName("u.C")
	public static int hueOff = (int) (Math.random() * 17.0D) - 8;
	@ObfuscatedName("kb.n")
	public static byte[][][] shadow;
	@ObfuscatedName("ff.R")
	public static int[][][] groundh;
	@ObfuscatedName("hh.bb")
	public static int[] huetot;
	@ObfuscatedName("uc.g")
	public static int[] sattot;
	@ObfuscatedName("od.C")
	public static int[] ligtot;
	@ObfuscatedName("nj.s")
	public static int[] tot;
	@ObfuscatedName("uc.h")
	public static int[] comtot;
	@ObfuscatedName("pa.h")
	public static byte[][][] floort1;
	@ObfuscatedName("ce.W")
	public static int minusedlevel = 99;
	@ObfuscatedName("k.G")
	public static byte[][][] floort2;
	@ObfuscatedName("md.X")
	public static int[][][] mapo;
	@ObfuscatedName("ag.a")
	public static byte[][][] floors;
	@ObfuscatedName("ve.T")
	public static byte[][][] floorr;
	@ObfuscatedName("wf.a")
	public static int[][] lightmap;
	@ObfuscatedName("pd.jb")
	public static byte[][] field3221;
	@ObfuscatedName("nd.e")
	public static int[] field2731;
	@ObfuscatedName("e.Q")
	public static byte[][] field774;

	@ObfuscatedName("ch.a(III)I")
	public static int getOCol(int arg0, int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			int var2 = (arg1 & 0x7F) * arg0 >> 7;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return (arg1 & 0xFF80) + var2;
		}
	}

	@ObfuscatedName("rc.a([BIII)Z")
	public static boolean checkLocations(byte[] arg0, int arg1, int arg2) {
		Packet var3 = new Packet(arg0);
		boolean var4 = true;
		int var5 = -1;
		label68: while (true) {
			int var6 = var3.method332();
			if (var6 == 0) {
				return var4;
			}
			int var7 = 0;
			var5 += var6;
			boolean var8 = false;
			while (true) {
				int var12;
				LocType var15;
				do {
					int var13;
					int var14;
					do {
						do {
							do {
								do {
									while (var8) {
										int var16 = var3.method350();
										if (var16 == 0) {
											continue label68;
										}
										var3.g1();
									}
									int var9 = var3.method350();
									if (var9 == 0) {
										continue label68;
									}
									var7 += var9 - 1;
									int var10 = var7 >> 6 & 0x3F;
									int var11 = var7 & 0x3F;
									var12 = var3.g1() >> 2;
									var13 = arg2 + var10;
									var14 = var11 + arg1;
								} while (var13 <= 0);
							} while (var14 <= 0);
						} while (var13 >= 103);
					} while (var14 >= 103);
					var15 = LocType.list(var5);
				} while (var12 == 22 && Client.lowMem && var15.active == 0 && var15.blockwalk != 1 && !var15.forcedecor);
				var8 = true;
				if (!var15.checkModelAll()) {
					var4 = false;
					Client.field2045++;
				}
			}
		}
	}

	@ObfuscatedName("ha.a(ZZ[Lia;)V")
	public static void finishBuild(CollisionMap[] arg0) {
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < 104; var2++) {
				for (int var3 = 0; var3 < 104; var3++) {
					if ((mapl[var1][var2][var3] & 0x1) == 1) {
						int var4 = var1;
						if ((mapl[1][var2][var3] & 0x2) == 2) {
							var4 = var1 - 1;
						}
						if (var4 >= 0) {
							arg0[var4].blockGround(var3, var2);
						}
					}
				}
			}
		}
		ligOff += (int) (Math.random() * 5.0D) - 2;
		hueOff += (int) (Math.random() * 5.0D) - 2;
		if (hueOff < -8) {
			hueOff = -8;
		}
		if (hueOff > 8) {
			hueOff = 8;
		}
		if (ligOff < -16) {
			ligOff = -16;
		}
		if (ligOff > 16) {
			ligOff = 16;
		}
		int var5 = ligOff >> 1;
		int var6 = hueOff >> 2 << 10;
		int[][] var7 = new int[104][104];
		int[][] var8 = new int[104][104];
		for (int var9 = 0; var9 < 4; var9++) {
			byte[][] var10 = shadow[var9];
			int var11 = (int) Math.sqrt(5100.0D);
			int var12 = var11 * 768 >> 8;
			for (int var13 = 1; var13 < 103; var13++) {
				for (int var14 = 1; var14 < 103; var14++) {
					int var15 = groundh[var9][var14 + 1][var13] - groundh[var9][var14 - 1][var13];
					int var16 = groundh[var9][var14][var13 + 1] - groundh[var9][var14][var13 - 1];
					int var17 = (int) Math.sqrt((double) (var15 * var15 + var16 * var16 + 65536));
					int var18 = (var15 << 8) / var17;
					int var19 = -65536 / var17;
					int var20 = (var16 << 8) / var17;
					int var21 = (var18 * -50 + var19 * -10 + var20 * -50) / var12 + 74;
					int var22 = (var10[var14][var13] >> 1) + (var10[var14][var13 + 1] >> 3) + (var10[var14][var13 + -1] >> 2) + (var10[var14 + 1][var13] >> 3) + (var10[var14 + -1][var13] >> 2);
					var8[var14][var13] = var21 - var22;
				}
			}
			for (int var23 = 0; var23 < 104; var23++) {
				huetot[var23] = 0;
				sattot[var23] = 0;
				ligtot[var23] = 0;
				comtot[var23] = 0;
				tot[var23] = 0;
			}
			for (int var24 = -5; var24 < 104; var24++) {
				for (int var25 = 0; var25 < 104; var25++) {
					int var26 = var24 + 5;
					int var10002;
					if (var26 < 104) {
						int var27 = floort1[var9][var26][var25] & 0xFF;
						if (var27 > 0) {
							FluType var28 = FluType.list(var27 - 1);
							huetot[var25] += var28.hue;
							sattot[var25] += var28.saturation;
							ligtot[var25] += var28.lightness;
							comtot[var25] += var28.chroma;
							var10002 = tot[var25]++;
						}
					}
					int var29 = var24 - 5;
					if (var29 >= 0) {
						int var30 = floort1[var9][var29][var25] & 0xFF;
						if (var30 > 0) {
							FluType var31 = FluType.list(var30 - 1);
							huetot[var25] -= var31.hue;
							sattot[var25] -= var31.saturation;
							ligtot[var25] -= var31.lightness;
							comtot[var25] -= var31.chroma;
							var10002 = tot[var25]--;
						}
					}
				}
				if (var24 >= 0) {
					int var32 = 0;
					int var33 = 0;
					int var34 = 0;
					int var35 = 0;
					int var36 = 0;
					for (int var37 = -5; var37 < 104; var37++) {
						int var38 = var37 + 5;
						int var39 = var37 - 5;
						if (var38 < 104) {
							var36 += tot[var38];
							var33 += sattot[var38];
							var35 += ligtot[var38];
							var34 += comtot[var38];
							var32 += huetot[var38];
						}
						if (var39 >= 0) {
							var34 -= comtot[var39];
							var33 -= sattot[var39];
							var36 -= tot[var39];
							var32 -= huetot[var39];
							var35 -= ligtot[var39];
						}
						if (var37 >= 0 && var36 > 0) {
							var7[var24][var37] = getTable(var32 * 256 / var34, var35 / var36, var33 / var36);
						}
					}
				}
			}
			for (int var40 = 1; var40 < 103; var40++) {
				for (int var41 = 1; var41 < 103; var41++) {
					if (!Client.lowMem || (mapl[0][var40][var41] & 0x2) != 0 || (mapl[var9][var40][var41] & 0x10) == 0 && getDrawLevel(var41, var40, var9) == Client.lastBuiltLevel) {
						if (var9 < minusedlevel) {
							minusedlevel = var9;
						}
						int var42 = floort1[var9][var40][var41] & 0xFF;
						int var43 = floort2[var9][var40][var41] & 0xFF;
						if (var42 > 0 || var43 > 0) {
							int var44 = groundh[var9][var40 + 1][var41];
							int var45 = groundh[var9][var40][var41];
							int var46 = groundh[var9][var40 + 1][var41 + 1];
							int var47 = groundh[var9][var40][var41 + 1];
							if (var9 > 0) {
								boolean var48 = true;
								if (var42 == 0 && floors[var9][var40][var41] != 0) {
									var48 = false;
								}
								if (var43 > 0 && !FloType.list(var43 - 1).occlude) {
									var48 = false;
								}
								if (var48 && var44 == var45 && var46 == var45 && var47 == var45) {
									mapo[var9][var40][var41] |= 0x924;
								}
							}
							int var49;
							int var52;
							if (var42 > 0) {
								var49 = var7[var40][var41];
								int var50 = var5 + (var49 & 0x7F);
								if (var50 < 0) {
									var50 = 0;
								} else if (var50 > 127) {
									var50 = 127;
								}
								int var51 = var50 + (var49 + var6 & 0xFC00) + (var49 & 0x380);
								var52 = Pix3D.colourTable[getUCol(96, var51)];
							} else {
								var49 = -1;
								var52 = 0;
							}
							int var53 = var8[var40][var41];
							int var54 = var8[var40 + 1][var41];
							int var55 = var8[var40][var41 + 1];
							int var56 = var8[var40 + 1][var41 + 1];
							if (var43 == 0) {
								World.setGround(var9, var40, var41, 0, 0, -1, var45, var44, var46, var47, getUCol(var53, var49), getUCol(var54, var49), getUCol(var56, var49), getUCol(var55, var49), 0, 0, 0, 0, var52, 0);
							} else {
								int var57 = floors[var9][var40][var41] + 1;
								byte var58 = floorr[var9][var40][var41];
								FloType var59 = FloType.list(var43 - 1);
								if (lightmap != null && var9 == 0) {
									lightmap[var40][var41] = var59.waterfogcolour + (var59.waterfogscale << 24);
								}
								int var60 = var59.texture;
								if (var60 >= 0 && !Pix3D.textureManager.isTextureEnabled(var60)) {
									var60 = -1;
								}
								int var61;
								int var62;
								if (var60 >= 0) {
									var61 = -1;
									var62 = Pix3D.colourTable[getOCol(96, Pix3D.textureManager.getAverageRgb(var60))];
								} else if (var59.colour == -1) {
									var62 = 0;
									var61 = -2;
								} else {
									var61 = var59.colour;
									int var63 = (var61 & 0x7F) + var5;
									if (var63 < 0) {
										var63 = 0;
									} else if (var63 > 127) {
										var63 = 127;
									}
									int var64 = var63 + (var61 + var6 & 0xFC00) + (var61 & 0x380);
									var62 = Pix3D.colourTable[getOCol(96, var64)];
								}
								if (var59.mapcolour >= 0) {
									int var65 = var59.mapcolour;
									int var66 = (var65 & 0x7F) + var5;
									if (var66 < 0) {
										var66 = 0;
									} else if (var66 > 127) {
										var66 = 127;
									}
									int var67 = var66 + (var6 + var65 & 0xFC00) + (var65 & 0x380);
									var62 = Pix3D.colourTable[getOCol(96, var67)];
								}
								World.setGround(var9, var40, var41, var57, var58, var60, var45, var44, var46, var47, getUCol(var53, var49), getUCol(var54, var49), getUCol(var56, var49), getUCol(var55, var49), getOCol(var53, var61), getOCol(var54, var61), getOCol(var56, var61), getOCol(var55, var61), var52, var62);
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					World.setLayer(var9, var69, var68, getDrawLevel(var68, var69, var9));
				}
			}
			floort1[var9] = null;
			floort2[var9] = null;
			floors[var9] = null;
			floorr[var9] = null;
			shadow[var9] = null;
		}
		World.shareLight();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((mapl[1][var70][var71] & 0x2) == 2) {
					World.pushDown(var70, var71);
				}
			}
		}
		int var72 = 2;
		int var73 = 1;
		int var74 = 4;
		for (int var75 = 0; var75 < 4; var75++) {
			if (var75 > 0) {
				var72 <<= 0x3;
				var74 <<= 0x3;
				var73 <<= 0x3;
			}
			for (int var76 = 0; var76 <= var75; var76++) {
				for (int var77 = 0; var77 <= 104; var77++) {
					for (int var78 = 0; var78 <= 104; var78++) {
						if ((var73 & mapo[var76][var78][var77]) != 0) {
							int var79 = var77;
							int var80 = var76;
							int var81 = var76;
							int var82 = var77;
							while (var79 > 0 && (mapo[var76][var78][var79 - 1] & var73) != 0) {
								var79--;
							}
							while (var82 < 104 && (mapo[var76][var78][var82 + 1] & var73) != 0) {
								var82++;
							}
							label356: while (var80 > 0) {
								for (int var83 = var79; var83 <= var82; var83++) {
									if ((mapo[var80 - 1][var78][var83] & var73) == 0) {
										break label356;
									}
								}
								var80--;
							}
							label345: while (var81 < var75) {
								for (int var84 = var79; var84 <= var82; var84++) {
									if ((mapo[var81 + 1][var78][var84] & var73) == 0) {
										break label345;
									}
								}
								var81++;
							}
							int var85 = (var82 + 1 - var79) * (var81 + 1 - var80);
							if (var85 >= 8) {
								int var86 = groundh[var80][var78][var79];
								int var87 = groundh[var81][var78][var79] - 240;
								World.setOcclude(var75, 1, var78 * 128, var78 * 128, var79 * 128, var82 * 128 + 128, var87, var86);
								for (int var88 = var80; var88 <= var81; var88++) {
									for (int var89 = var79; var89 <= var82; var89++) {
										mapo[var88][var78][var89] &= ~var73;
									}
								}
							}
						}
						if ((var72 & mapo[var76][var78][var77]) != 0) {
							int var90 = var78;
							int var91;
							for (var91 = var78; var91 > 0 && (var72 & mapo[var76][var91 - 1][var77]) != 0; var91--) {
							}
							int var92 = var76;
							while (var90 < 104 && (var72 & mapo[var76][var90 + 1][var77]) != 0) {
								var90++;
							}
							label410: while (var92 > 0) {
								for (int var93 = var91; var93 <= var90; var93++) {
									if ((mapo[var92 - 1][var93][var77] & var72) == 0) {
										break label410;
									}
								}
								var92--;
							}
							int var94;
							label398: for (var94 = var76; var94 < var75; var94++) {
								for (int var95 = var91; var95 <= var90; var95++) {
									if ((var72 & mapo[var94 + 1][var95][var77]) == 0) {
										break label398;
									}
								}
							}
							int var96 = (var90 + 1 - var91) * (var94 + 1 - var92);
							if (var96 >= 8) {
								int var97 = groundh[var92][var91][var77];
								int var98 = groundh[var94][var91][var77] - 240;
								World.setOcclude(var75, 2, var91 * 128, var90 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
								for (int var99 = var92; var99 <= var94; var99++) {
									for (int var100 = var91; var100 <= var90; var100++) {
										mapo[var99][var100][var77] &= ~var72;
									}
								}
							}
						}
						if ((var74 & mapo[var76][var78][var77]) != 0) {
							int var101 = var78;
							int var102 = var78;
							int var103;
							for (var103 = var77; var103 > 0 && (var74 & mapo[var76][var78][var103 - 1]) != 0; var103--) {
							}
							int var104;
							for (var104 = var77; var104 < 104 && (var74 & mapo[var76][var78][var104 + 1]) != 0; var104++) {
							}
							label464: while (var102 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((mapo[var76][var102 - 1][var105] & var74) == 0) {
										break label464;
									}
								}
								var102--;
							}
							label453: while (var101 < 104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((var74 & mapo[var76][var101 + 1][var106]) == 0) {
										break label453;
									}
								}
								var101++;
							}
							if ((var101 + 1 - var102) * (-var103 + 1 + var104) >= 4) {
								int var107 = groundh[var76][var102][var103];
								World.setOcclude(var75, 4, var102 * 128, var101 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
								for (int var108 = var102; var108 <= var101; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										mapo[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag.a(III)Z")
	public static boolean changeLocAvailable(int arg0, int arg1) {
		LocType var2 = LocType.list(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return var2.checkModel(arg0);
	}

	@ObfuscatedName("ve.a(IIII)I")
	public static int getDrawLevel(int arg0, int arg1, int arg2) {
		if ((mapl[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (mapl[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("be.a(IIZIII)V")
	public static void fadeAdjacent(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg4; var6 <= arg4 + arg2; var6++) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					shadow[arg0][var6][var5] = 127;
				}
			}
		}
		for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg4; var8 < arg2 + arg4; var8++) {
				if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
					groundh[arg0][var8][var7] = arg0 <= 0 ? 0 : groundh[arg0 - 1][var8][var7];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (int var9 = arg3 + 1; var9 < arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < 104) {
					groundh[arg0][arg4][var9] = groundh[arg0][arg4 - 1][var9];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (int var10 = arg4 + 1; var10 < arg2 + arg4; var10++) {
				if (var10 >= 0 && var10 < 104) {
					groundh[arg0][var10][arg3] = groundh[arg0][var10][arg3 - 1];
				}
			}
		}
		if (arg4 >= 0 && arg3 >= 0 && arg4 < 104 && arg3 < 104) {
			if (arg0 == 0) {
				if (arg4 > 0 && groundh[arg0][arg4 - 1][arg3] != 0) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4 - 1][arg3];
				} else if (arg3 > 0 && groundh[arg0][arg4][arg3 - 1] != 0) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4][arg3 - 1];
				} else if (arg4 > 0 && arg3 > 0 && groundh[arg0][arg4 - 1][arg3 - 1] != 0) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4 - 1][arg3 - 1];
				}
			} else {
				if (arg4 > 0 && groundh[arg0 - 1][arg4 - 1][arg3] != groundh[arg0][arg4 - 1][arg3]) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4 - 1][arg3];
				} else if (arg3 > 0 && groundh[arg0][arg4][arg3 - 1] != groundh[arg0 - 1][arg4][arg3 - 1]) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4][arg3 - 1];
				} else if (arg4 > 0 && arg3 > 0 && groundh[arg0 - 1][arg4 - 1][arg3 - 1] != groundh[arg0][arg4 - 1][arg3 - 1]) {
					groundh[arg0][arg4][arg3] = groundh[arg0][arg4 - 1][arg3 - 1];
				}
			}
		}
	}

	@ObfuscatedName("ta.a(IZ)V")
	public static void init() {
		tot = new int[104];
		minusedlevel = 99;
		huetot = new int[104];
		sattot = new int[104];
		ligtot = new int[104];
		comtot = new int[104];
		shadow = new byte[4][105][105];
		floort2 = new byte[4][104][104];
		floort1 = new byte[4][104][104];
		floorr = new byte[4][104][104];
		mapo = new int[4][105][105];
		floors = new byte[4][104][104];
	}

	@ObfuscatedName("bf.a([Lia;[BIIZI)V")
	public static void loadLocations(CollisionMap[] arg0, byte[] arg1, int arg2, int arg3) {
		Packet var4 = new Packet(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method332();
			if (var6 == 0) {
				return;
			}
			var5 += var6;
			int var7 = 0;
			while (true) {
				int var8 = var4.method350();
				if (var8 == 0) {
					break;
				}
				var7 += var8 - 1;
				int var9 = var7 & 0x3F;
				int var10 = var7 >> 6 & 0x3F;
				int var11 = var4.g1();
				int var12 = var7 >> 12;
				int var13 = arg3 + var9;
				int var14 = var11 & 0x3;
				int var15 = var10 + arg2;
				int var16 = var11 >> 2;
				if (var15 > 0 && var13 > 0 && var15 < 103 && var13 < 103) {
					CollisionMap var17 = null;
					int var18 = var12;
					if ((mapl[1][var15][var13] & 0x2) == 2) {
						var18 = var12 - 1;
					}
					if (var18 >= 0) {
						var17 = arg0[var18];
					}
					addLoc(true, var12, var14, var16, Client.lowMem, var5, var12, var17, var13, var15);
				}
			}
		}
	}

	@ObfuscatedName("af.d(I)V")
	public static void quit() {
		ligtot = null;
		comtot = null;
		floorr = null;
		sattot = null;
		mapo = null;
		tot = null;
		shadow = null;
		floors = null;
		floort1 = null;
		floort2 = null;
		huetot = null;
	}

	@ObfuscatedName("ke.a(IIIIZIII)V")
	public static void changeLocUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
			return;
		}
		if (Client.lowMem && (mapl[0][arg6][arg2] & 0x2) == 0) {
			int var7 = arg0;
			if ((mapl[arg0][arg6][arg2] & 0x8) != 0) {
				var7 = 0;
			}
			if (Client.lastBuiltLevel != var7) {
				return;
			}
		}
		int var8 = arg0;
		if (arg0 < 3 && (mapl[1][arg6][arg2] & 0x2) == 2) {
			var8 = arg0 + 1;
		}
		Client.locChangeUnchecked(Client.collision[arg0], arg6, var8, arg1, arg0, arg2);
		if (arg4 >= 0) {
			addLoc(false, arg0, arg5, arg3, false, arg4, var8, Client.collision[arg0], arg2, arg6);
			return;
		}
	}

	@ObfuscatedName("te.a(II[Lia;III[BZIII)V")
	public static void loadLocationsRegion(int arg0, int arg1, CollisionMap[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var9 = -1;
		Packet var10 = new Packet(arg5);
		while (true) {
			int var11 = var10.method332();
			if (var11 == 0) {
				return;
			}
			int var12 = 0;
			var9 += var11;
			while (true) {
				int var13 = var10.method350();
				if (var13 == 0) {
					break;
				}
				var12 += var13 - 1;
				int var14 = var12 >> 6 & 0x3F;
				int var15 = var12 & 0x3F;
				int var16 = var12 >> 12;
				int var17 = var10.g1();
				int var18 = var17 >> 2;
				int var19 = var17 & 0x3;
				if (arg6 == var16 && arg1 <= var14 && var14 < arg1 + 8 && arg3 <= var15 && var15 < arg3 + 8) {
					LocType var20 = LocType.list(var9);
					int var21 = RegionRotate.method469(var20.width, arg0, var15 & 0x7, var14 & 0x7, var20.length, var19) + arg8;
					int var22 = RegionRotate.method742(var15 & 0x7, var14 & 0x7, var19, var20.length, var20.width, arg0) + arg7;
					if (var21 > 0 && var22 > 0 && var21 < 103 && var22 < 103) {
						CollisionMap var23 = null;
						int var24 = arg4;
						if ((mapl[1][var21][var22] & 0x2) == 2) {
							var24 = arg4 - 1;
						}
						if (var24 >= 0) {
							var23 = arg2[var24];
						}
						addLoc(true, arg4, arg0 + var19 & 0x3, var18, Client.lowMem, var9, arg4, var23, var22, var21);
					}
				}
			}
		}
	}

	@ObfuscatedName("nb.a(III[Lia;IB[BZ)V")
	public static void loadGround(int arg0, int arg1, int arg2, CollisionMap[] arg3, int arg4, byte[] arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (var7 + arg1 > 0 && var7 + arg1 < 103 && var8 + arg4 > 0 && arg4 + var8 < 103) {
						arg3[var6].flags[var7 + arg1][var8 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		Packet var9 = new Packet(arg5);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					loadGroundSquare(var11 + arg1, var9, arg0, arg2, var12 + arg4, 0, var10);
				}
			}
		}
	}

	@ObfuscatedName("ue.a(BZIZIIZIILia;II)V")
	public static void addLoc(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, CollisionMap arg7, int arg8, int arg9) {
		if (arg4 && (mapl[0][arg9][arg8] & 0x2) == 0) {
			if ((mapl[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (getDrawLevel(arg8, arg9, arg1) != Client.lastBuiltLevel) {
				return;
			}
		}
		if (arg1 < minusedlevel) {
			minusedlevel = arg1;
		}
		LocType var10 = LocType.list(arg5);
		int var11;
		int var12;
		if (arg2 == 1 || arg2 == 3) {
			var11 = var10.length;
			var12 = var10.width;
		} else {
			var12 = var10.length;
			var11 = var10.width;
		}
		int var13;
		int var14;
		if (var11 + arg9 <= 104) {
			var13 = (var11 >> 1) + arg9;
			var14 = (var11 + 1 >> 1) + arg9;
		} else {
			var13 = arg9;
			var14 = arg9 + 1;
		}
		int var15;
		int var16;
		if (arg8 + var12 > 104) {
			var15 = arg8;
			var16 = arg8 + 1;
		} else {
			var15 = (var12 >> 1) + arg8;
			var16 = arg8 + (var12 + 1 >> 1);
		}
		int[][] var17 = groundh[arg6];
		int var18 = (var11 << 6) + (arg9 << 7);
		int var19 = var17[var14][var16] + var17[var13][var16] + var17[var14][var15] + var17[var13][var15] >> 2;
		int var20 = (var12 << 6) + (arg8 << 7);
		int[][] var21 = null;
		long var22 = (long) ((arg2 | 0x400) << 20 | arg3 << 14 | arg8 << 7 | arg9);
		if (var10.active == 0) {
			var22 |= Long.MIN_VALUE;
		}
		if (arg6 < 3) {
			var21 = groundh[arg6 + 1];
		}
		if (var10.raiseobject == 1) {
			var22 |= 0x400000L;
		}
		long var24 = var22 | (long) arg5 << 32;
		if (arg0 && var10.hasBgSound()) {
			BgSound.addSound(arg9, arg1, arg2, arg8, var10);
		}
		if (arg3 == 22) {
			if (!arg4 || var10.active != 0 || var10.blockwalk == 1 || var10.forcedecor) {
				ModelSource var27;
				if (var10.anim == -1 && var10.multiloc == null) {
					ModelCacheLit var26 = var10.getModel(22, var21, var17, var18, arg0, var20, arg2, var19);
					var27 = var26.field3984;
				} else {
					var27 = new ClientLocAnim(arg5, 22, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
				}
				World.setGroundDecor(arg1, arg9, arg8, var19, var27, var24, var10.field2799);
				if (var10.blockwalk == 1 && arg7 != null) {
					arg7.blockGroundDecor(arg8, arg9);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ModelSource var29;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var28 = var10.getModel(10, var21, var17, var18, arg0, var20, arg2, var19);
				var29 = var28.field3984;
			} else {
				var29 = new ClientLocAnim(arg5, 10, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			if (var29 != null) {
				boolean var30 = World.addScenery(arg1, arg9, arg8, var19, var11, var12, var29, arg3 == 11 ? 256 : 0, var24);
				if (var10.shadow && var30 && arg0) {
					int var31 = 15;
					if (var29 instanceof ModelLit) {
						var31 = ((ModelLit) var29).getRadiusCylinder() / 4;
						if (var31 > 30) {
							var31 = 30;
						}
					}
					for (int var32 = 0; var32 <= var11; var32++) {
						for (int var33 = 0; var33 <= var12; var33++) {
							if (var31 > shadow[arg1][arg9 + var32][var33 + arg8]) {
								shadow[arg1][arg9 + var32][var33 + arg8] = (byte) var31;
							}
						}
					}
				}
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addLoc(var11, var12, var10.blockrange, arg9, arg8);
			}
		} else if (arg3 >= 12) {
			ModelSource var35;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var34 = var10.getModel(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var35 = var34.field3984;
			} else {
				var35 = new ClientLocAnim(arg5, arg3, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.addScenery(arg1, arg9, arg8, var19, 1, 1, var35, 0, var24);
			if (arg0 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
				mapo[arg1][arg9][arg8] |= 0x924;
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addLoc(var11, var12, var10.blockrange, arg9, arg8);
			}
		} else if (arg3 == 0) {
			ModelSource var36;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var37 = var10.getModel(0, var21, var17, var18, arg0, var20, arg2, var19);
				var36 = var37.field3984;
			} else {
				var36 = new ClientLocAnim(arg5, 0, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setWall(arg1, arg9, arg8, var19, var36, null, WSHAPE0[arg2], 0, var24);
			if (arg0) {
				if (arg2 == 0) {
					if (var10.shadow) {
						shadow[arg1][arg9][arg8] = 50;
						shadow[arg1][arg9][arg8 + 1] = 50;
					}
					if (var10.occlude) {
						mapo[arg1][arg9][arg8] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (var10.shadow) {
						shadow[arg1][arg9][arg8 + 1] = 50;
						shadow[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.occlude) {
						mapo[arg1][arg9][arg8 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (var10.shadow) {
						shadow[arg1][arg9 + 1][arg8] = 50;
						shadow[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (var10.occlude) {
						mapo[arg1][arg9 + 1][arg8] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (var10.shadow) {
						shadow[arg1][arg9][arg8] = 50;
						shadow[arg1][arg9 + 1][arg8] = 50;
					}
					if (var10.occlude) {
						mapo[arg1][arg9][arg8] |= 0x492;
					}
				}
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addWall(arg3, arg8, var10.blockrange, arg2, arg9);
			}
			if (var10.wallwidth != 16) {
				World.moveDecor(arg1, arg9, arg8, var10.wallwidth);
			}
		} else if (arg3 == 1) {
			ModelSource var38;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var39 = var10.getModel(1, var21, var17, var18, arg0, var20, arg2, var19);
				var38 = var39.field3984;
			} else {
				var38 = new ClientLocAnim(arg5, 1, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setWall(arg1, arg9, arg8, var19, var38, null, WSHAPE1[arg2], 0, var24);
			if (var10.shadow && arg0) {
				if (arg2 == 0) {
					shadow[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					shadow[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					shadow[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					shadow[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addWall(arg3, arg8, var10.blockrange, arg2, arg9);
			}
		} else if (arg3 == 2) {
			int var40 = arg2 + 1 & 0x3;
			ModelSource var41;
			ModelSource var42;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var43 = var10.getModel(2, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var41 = var43.field3984;
				ModelCacheLit var44 = var10.getModel(2, var21, var17, var18, arg0, var20, var40, var19);
				var42 = var44.field3984;
			} else {
				var41 = new ClientLocAnim(arg5, 2, arg2 + 4, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
				var42 = new ClientLocAnim(arg5, 2, var40, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setWall(arg1, arg9, arg8, var19, var41, var42, WSHAPE0[arg2], WSHAPE0[var40], var24);
			if (var10.occlude && arg0) {
				if (arg2 == 0) {
					mapo[arg1][arg9][arg8] |= 0x249;
					mapo[arg1][arg9][arg8 + 1] |= 0x492;
				} else if (arg2 == 1) {
					mapo[arg1][arg9][arg8 + 1] |= 0x492;
					mapo[arg1][arg9 + 1][arg8] |= 0x249;
				} else if (arg2 == 2) {
					mapo[arg1][arg9 + 1][arg8] |= 0x249;
					mapo[arg1][arg9][arg8] |= 0x492;
				} else if (arg2 == 3) {
					mapo[arg1][arg9][arg8] |= 0x492;
					mapo[arg1][arg9][arg8] |= 0x249;
				}
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addWall(arg3, arg8, var10.blockrange, arg2, arg9);
			}
			if (var10.wallwidth != 16) {
				World.moveDecor(arg1, arg9, arg8, var10.wallwidth);
			}
		} else if (arg3 == 3) {
			ModelSource var46;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var45 = var10.getModel(3, var21, var17, var18, arg0, var20, arg2, var19);
				var46 = var45.field3984;
			} else {
				var46 = new ClientLocAnim(arg5, 3, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setWall(arg1, arg9, arg8, var19, var46, null, WSHAPE1[arg2], 0, var24);
			if (var10.shadow && arg0) {
				if (arg2 == 0) {
					shadow[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					shadow[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					shadow[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					shadow[arg1][arg9][arg8] = 50;
				}
			}
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addWall(arg3, arg8, var10.blockrange, arg2, arg9);
			}
		} else if (arg3 == 9) {
			ModelSource var47;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var48 = var10.getModel(arg3, var21, var17, var18, arg0, var20, arg2, var19);
				var47 = var48.field3984;
			} else {
				var47 = new ClientLocAnim(arg5, arg3, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.addScenery(arg1, arg9, arg8, var19, 1, 1, var47, 0, var24);
			if (var10.blockwalk != 0 && arg7 != null) {
				arg7.addLoc(var11, var12, var10.blockrange, arg9, arg8);
			}
			if (var10.wallwidth != 16) {
				World.moveDecor(arg1, arg9, arg8, var10.wallwidth);
			}
		} else if (arg3 == 4) {
			ModelSource var49;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var50 = var10.getModel(4, var21, var17, var18, arg0, var20, arg2, var19);
				var49 = var50.field3984;
			} else {
				var49 = new ClientLocAnim(arg5, 4, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setDecor(arg1, arg9, arg8, var19, var49, null, WSHAPE0[arg2], 0, 0, 0, var24);
		} else if (arg3 == 5) {
			int var51 = 16;
			long var52 = World.wallType(arg1, arg9, arg8);
			if (var52 != 0L) {
				var51 = LocType.list((int) (var52 >>> 32) & Integer.MAX_VALUE).wallwidth;
			}
			ModelSource var54;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var55 = var10.getModel(4, var21, var17, var18, arg0, var20, arg2, var19);
				var54 = var55.field3984;
			} else {
				var54 = new ClientLocAnim(arg5, 4, arg2, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setDecor(arg1, arg9, arg8, var19, var54, null, WSHAPE0[arg2], 0, var51 * DECORXOF[arg2], var51 * DECORZOF[arg2], var24);
		} else if (arg3 == 6) {
			int var56 = 8;
			long var57 = World.wallType(arg1, arg9, arg8);
			if (var57 != 0L) {
				var56 = LocType.list(Integer.MAX_VALUE & (int) (var57 >>> 32)).wallwidth / 2;
			}
			ModelSource var59;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var60 = var10.getModel(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var59 = var60.field3984;
			} else {
				var59 = new ClientLocAnim(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setDecor(arg1, arg9, arg8, var19, var59, null, 256, arg2, DECORXOF2[arg2] * var56, DECORZOF2[arg2] * var56, var24);
		} else if (arg3 == 7) {
			int var61 = arg2 + 2 & 0x3;
			ModelSource var63;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var62 = var10.getModel(4, var21, var17, var18, arg0, var20, var61 + 4, var19);
				var63 = var62.field3984;
			} else {
				var63 = new ClientLocAnim(arg5, 4, var61 + 4, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setDecor(arg1, arg9, arg8, var19, var63, null, 256, var61, 0, 0, var24);
		} else if (arg3 == 8) {
			int var64 = 8;
			long var65 = World.wallType(arg1, arg9, arg8);
			if (var65 != 0L) {
				var64 = LocType.list((int) (var65 >>> 32) & Integer.MAX_VALUE).wallwidth / 2;
			}
			int var67 = arg2 + 2 & 0x3;
			ModelSource var68;
			ModelSource var69;
			if (var10.anim == -1 && var10.multiloc == null) {
				ModelCacheLit var70 = var10.getModel(4, var21, var17, var18, arg0, var20, arg2 + 4, var19);
				var68 = var70.field3984;
				ModelCacheLit var71 = var10.getModel(4, var21, var17, var18, arg0, var20, var67 + 4, var19);
				var69 = var71.field3984;
			} else {
				var68 = new ClientLocAnim(arg5, 4, arg2 + 4, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
				var69 = new ClientLocAnim(arg5, 4, var67 + 4, arg6, arg9, arg8, var10.anim, var10.randomanimframe, null);
			}
			World.setDecor(arg1, arg9, arg8, var19, var68, var69, 256, arg2, DECORXOF2[arg2] * var64, var64 * DECORZOF2[arg2], var24);
		}
	}

	@ObfuscatedName("mf.a(ILea;IZIIIII)V")
	public static void loadGroundSquare(int arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0 || arg0 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				int var7 = arg1.g1();
				if (var7 == 0) {
					return;
				}
				if (var7 == 1) {
					arg1.g1();
					return;
				}
				if (var7 <= 49) {
					arg1.g1();
				}
			}
		}
		mapl[arg6][arg0][arg4] = 0;
		while (true) {
			int var8 = arg1.g1();
			if (var8 == 0) {
				if (arg6 == 0) {
					groundh[0][arg0][arg4] = -perlinNoise(arg3 + arg0 + 932731, 556238 - -arg4 - -arg2) * 8;
					return;
				} else {
					groundh[arg6][arg0][arg4] = groundh[arg6 - 1][arg0][arg4] - 240;
					return;
				}
			}
			if (var8 == 1) {
				int var9 = arg1.g1();
				if (var9 == 1) {
					var9 = 0;
				}
				if (arg6 == 0) {
					groundh[0][arg0][arg4] = -var9 * 8;
					return;
				}
				groundh[arg6][arg0][arg4] = groundh[arg6 - 1][arg0][arg4] - var9 * 8;
				return;
			}
			if (var8 <= 49) {
				floort2[arg6][arg0][arg4] = arg1.g1b();
				floors[arg6][arg0][arg4] = (byte) ((var8 - 2) / 4);
				floorr[arg6][arg0][arg4] = (byte) (arg5 + var8 - 2 & 0x3);
			} else if (var8 <= 81) {
				mapl[arg6][arg0][arg4] = (byte) (var8 - 49);
			} else {
				floort1[arg6][arg0][arg4] = (byte) (var8 - 81);
			}
		}
	}

	@ObfuscatedName("e.a(IIII)I")
	public static int interpolatedNoise(int arg0, int arg1, int arg2) {
		int var3 = arg2 / arg1;
		int var4 = arg1 - 1 & arg2;
		int var5 = arg1 - 1 & arg0;
		int var6 = arg0 / arg1;
		int var7 = smoothNoise(var6, var3);
		int var8 = smoothNoise(var6, var3 + 1);
		int var9 = smoothNoise(var6 + 1, var3);
		int var10 = smoothNoise(var6 + 1, var3 + 1);
		int var11 = method419(arg1, var7, var4, var8);
		int var12 = method419(arg1, var9, var4, var10);
		return method419(arg1, var11, var5, var12);
	}

	@ObfuscatedName("ah.a(III)I")
	public static int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 + -1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + -1) + noise(arg0 - -1, arg1 - -1);
		int var3 = noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1) + noise(arg0 + -1, arg1) + noise(arg0 - -1, arg1);
		int var4 = noise(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("fa.a(IIIII)I")
	public static int method419(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg0] >> 1;
		return (arg1 * (65536 - var4) >> 16) + (arg3 * var4 >> 16);
	}

	@ObfuscatedName("fh.a(IIZIII[Lia;I[BII)V")
	public static void loadGroundRegion(int arg0, int arg1, int arg2, int arg3, CollisionMap[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (var9 + arg0 > 0 && var9 + arg0 < 103 && arg7 + var10 > 0 && var10 + arg7 < 103) {
					arg4[arg8].flags[arg0 + var9][arg7 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		Packet var11 = new Packet(arg6);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (var12 == arg5 && var13 >= arg2 && var13 < arg2 + 8 && var14 >= arg3 && var14 < arg3 + 8) {
						loadGroundSquare(RegionRotate.method1606(arg1, var13 & 0x7, var14 & 0x7) + arg0, var11, 0, 0, arg7 + RegionRotate.method1069(var14 & 0x7, var13 & 0x7, arg1), arg1, arg8);
					} else {
						loadGroundSquare(-1, var11, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("db.a(IZ)V")
	public static void loadGroundRegion() {
		byte[][] var0 = field3221;
		for (int var1 = 0; var1 < 4; var1++) {
			Client.doAudio();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					boolean var4 = false;
					int var5 = zoneMapArchiveIds[var1][var2][var3];
					if (var5 != -1) {
						int var6 = var5 >> 24 & 0x3;
						int var7 = var5 >> 14 & 0x3FF;
						int var8 = var5 >> 1 & 0x3;
						int var9 = var5 >> 3 & 0x7FF;
						int var10 = var9 / 8 + (var7 / 8 << 8);
						for (int var11 = 0; var11 < field2731.length; var11++) {
							if (var10 == field2731[var11] && var0[var11] != null) {
								loadGroundRegion(var2 * 8, var8, (var7 & 0x7) * 8, (var9 & 0x7) * 8, Client.collision, var6, var0[var11], var3 * 8, var1);
								var4 = true;
								break;
							}
						}
					}
					if (!var4) {
						fadeAdjacent(var1, 8, 8, var3 * 8, var2 * 8);
					}
				}
			}
		}
	}

	@ObfuscatedName("rg.a(III)I")
	public static int noise(int arg0, int arg1) {
		int var2 = arg0 * 57 + arg1;
		int var3 = var2 << 13 ^ var2;
		int var4 = Integer.MAX_VALUE & var3 * (var3 * var3 * 15731 + 789221) + 1376312589;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("of.a(IIII)I")
	public static int getTable(int arg0, int arg1, int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
	}

	@ObfuscatedName("ba.a(III)I")
	public static int getUCol(int arg0, int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		int var2 = arg0 * (arg1 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return var2 + (arg1 & 0xFF80);
	}

	@ObfuscatedName("tj.a(III)I")
	public static int perlinNoise(int arg0, int arg1) {
		int var2 = interpolatedNoise(arg1 + 91923, 4, arg0 + 45365) + (interpolatedNoise(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (interpolatedNoise(arg1, 1, arg0) + -128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("hh.a(ZI)V")
	public static void loadLocationsRegion() {
		byte[][] var0 = field774;
		for (int var1 = 0; var1 < 4; var1++) {
			Client.doAudio();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					int var4 = zoneMapArchiveIds[var1][var2][var3];
					if (var4 != -1) {
						int var5 = var4 >> 24 & 0x3;
						int var6 = var4 >> 1 & 0x3;
						int var7 = var4 >> 14 & 0x3FF;
						int var8 = var4 >> 3 & 0x7FF;
						int var9 = (var7 / 8 << 8) + (var8 / 8);
						for (int var10 = 0; var10 < field2731.length; var10++) {
							if (var9 == field2731[var10] && var0[var10] != null) {
								loadLocationsRegion(var6, (var7 & 0x7) * 8, Client.collision, (var8 & 0x7) * 8, var1, var0[var10], var5, var3 * 8, var2 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("na.a(ZI)V")
	public static void loadGround() {
		byte[][] var0 = field3221;
		int var1 = var0.length;
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = (field2731[var2] >> 8) * 64 - Client.mapBuildBaseX;
			byte[] var4 = var0[var2];
			int var5 = (field2731[var2] & 0xFF) * 64 - Client.mapBuildBaseZ;
			if (var4 != null) {
				Client.doAudio();
				loadGround(Client.mapBuildCentreZoneZ * 8 - 48, var3, (Client.mapBuildCentreZoneX - 6) * 8, Client.collision, var5, var4);
			}
		}
		for (int var6 = 0; var6 < var1; var6++) {
			int var7 = (field2731[var6] >> 8) * 64 - Client.mapBuildBaseX;
			int var8 = (field2731[var6] & 0xFF) * 64 - Client.mapBuildBaseZ;
			byte[] var9 = var0[var6];
			if (var9 == null && Client.mapBuildCentreZoneZ < 800) {
				Client.doAudio();
				for (int var10 = 0; var10 < 4; var10++) {
					fadeAdjacent(var10, 64, 64, var8, var7);
				}
			}
		}
	}

	@ObfuscatedName("re.a(ZZ)V")
	public static void loadLocations() {
		byte[][] var0 = field774;
		int var1 = field3221.length;
		for (int var2 = 0; var2 < var1; var2++) {
			byte[] var3 = var0[var2];
			if (var3 != null) {
				int var4 = (field2731[var2] >> 8) * 64 - Client.mapBuildBaseX;
				int var5 = (field2731[var2] & 0xFF) * 64 - Client.mapBuildBaseZ;
				Client.doAudio();
				loadLocations(Client.collision, var3, var4, var5);
			}
		}
	}
}
