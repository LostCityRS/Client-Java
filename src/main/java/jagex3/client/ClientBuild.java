package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.FloType;
import jagex3.config.FluType;
import jagex3.config.LocType;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.io.Packet;
import jagex3.sound.BgSound;

public class ClientBuild {
	@ObfuscatedName("fc.Bb")
	public static byte[][][] mapl = new byte[4][104][104];
	@ObfuscatedName("jc.eb")
	public static int[][][] groundh = new int[4][105][105];
	@ObfuscatedName("vc.D")
	public static int minusedlevel = 99;
	@ObfuscatedName("tc.s")
	public static int[] field2930;
	@ObfuscatedName("fc.Nb")
	public static byte[][][] field910;
	@ObfuscatedName("bd.Z")
	public static int[][][] field412;
	@ObfuscatedName("g.z")
	public static byte[][][] field1003;
	@ObfuscatedName("id.z")
	public static int[] field1385;
	@ObfuscatedName("wb.f")
	public static int[] field3246;
	@ObfuscatedName("fa.kb")
	public static int[] field856;
	@ObfuscatedName("he.Sb")
	public static int[][] field1247;
	@ObfuscatedName("ub.A")
	public static byte[][][] field3053;
	@ObfuscatedName("tb.dc")
	public static int[] field2906;
	@ObfuscatedName("mc.A")
	public static byte[][][] field1872;
	@ObfuscatedName("oa.f")
	public static byte[][][] field2131;
	@ObfuscatedName("t.Kb")
	public static int field2822 = (int) (Math.random() * 17.0D) - 8;
	@ObfuscatedName("nb.kd")
	public static int field2025 = (int) (Math.random() * 33.0D) - 16;
	@ObfuscatedName("jc.zb")
	public static int field1472 = 0;
	@ObfuscatedName("ld.t")
	public static int[] field1740 = new int[]{1, 2, 4, 8};
	@ObfuscatedName("t.Hb")
	public static int[] field2819 = new int[]{16, 32, 64, 128};
	@ObfuscatedName("kc.E")
	public static int[] field1595 = new int[]{1, 0, -1, 0};
	@ObfuscatedName("ac.S")
	public static int[] field181 = new int[]{0, -1, 0, 1};

	@ObfuscatedName("nd.a(IIB)Z")
	public static boolean method741(int arg0, int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		LocType var2 = LocType.list(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return var2.checkModel(arg0);
	}

	@ObfuscatedName("ma.a(B[BII)Z")
	public static boolean checkLocations(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg0);
		int var5 = -1;
		label52:
		while (true) {
			int var6 = var4.method178();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				while (!var8) {
					int var10 = var4.method178();
					if (var10 == 0) {
						continue label52;
					}
					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var4.g1() >> 2;
					int var13 = var7 >> 6 & 0x3F;
					int var14 = var13 + arg1;
					int var15 = var11 + arg2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.list(var5);
						if (var12 != 22 || !Client.lowMem || var16.active != 0 || var16.forcedecor) {
							var8 = true;
							if (!var16.checkModelAll()) {
								var3 = false;
								Client.locModelLoadCount++;
							}
						}
					}
				}
				int var9 = var4.method178();
				if (var9 == 0) {
					break;
				}
				var4.g1();
			}
		}
	}

	@ObfuscatedName("w.a(Z)V")
	public static void init() {
		field2930 = new int[104];
		field910 = new byte[4][104][104];
		field412 = new int[4][105][105];
		minusedlevel = 99;
		field1003 = new byte[4][105][105];
		field1385 = new int[104];
		field3246 = new int[104];
		field856 = new int[104];
		field1247 = new int[105][105];
		field3053 = new byte[4][104][104];
		field2906 = new int[104];
		field1872 = new byte[4][104][104];
		field2131 = new byte[4][104][104];
	}

	@ObfuscatedName("he.a([Lad;I[BIIII)V")
	public static void loadGround(CollisionMap[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (arg3 + var7 > 0 && arg3 + var7 < 103 && arg4 + var8 > 0 && arg4 + var8 < 103) {
						arg0[var6].flags[arg3 + var7][arg4 + var8] &= 0xFEFFFFFF;
					}
				}
			}
		}
		Packet var9 = new Packet(arg2);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					method841(var11 + arg3, 0, var9, arg4 + var12, arg5, arg1, var10);
				}
			}
		}
	}

	@ObfuscatedName("ua.a(IBIII)V")
	public static void fadeAdjacent(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = arg0; var4 <= arg0 + arg1; var4++) {
			for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					field1003[0][var5][var4] = 127;
					if (arg3 == var5 && var5 > 0) {
						groundh[0][var5][var4] = groundh[0][var5 - 1][var4];
					}
					if (arg2 + arg3 == var5 && var5 < 103) {
						groundh[0][var5][var4] = groundh[0][var5 + 1][var4];
					}
					if (arg0 == var4 && var4 > 0) {
						groundh[0][var5][var4] = groundh[0][var5][var4 - 1];
					}
					if (arg0 + arg1 == var4 && var4 < 103) {
						groundh[0][var5][var4] = groundh[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("j.a(ILab;[Lad;[BIB)V")
	public static void loadLocations(int arg0, World arg1, CollisionMap[] arg2, byte[] arg3, int arg4) {
		Packet var5 = new Packet(arg3);
		int var6 = -1;
		while (true) {
			int var7 = var5.method178();
			if (var7 == 0) {
				return;
			}
			int var8 = 0;
			var6 += var7;
			while (true) {
				int var9 = var5.method178();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 & 0x3F;
				int var11 = var8 >> 6 & 0x3F;
				int var12 = var8 >> 12;
				int var13 = var5.g1();
				int var14 = var13 >> 2;
				int var15 = var13 & 0x3;
				int var16 = arg0 + var11;
				int var17 = var10 + arg4;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					CollisionMap var18 = null;
					int var19 = var12;
					if ((mapl[1][var16][var17] & 0x2) == 2) {
						var19 = var12 - 1;
					}
					if (var19 >= 0) {
						var18 = arg2[var19];
					}
					method301(var15, var18, var16, arg1, var14, var6, var17, var12);
				}
			}
		}
	}

	@ObfuscatedName("bb.a(IIIIIIII[B[Lad;)V")
	public static void loadGroundRegion(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, CollisionMap[] arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (arg4 + var9 > 0 && arg4 + var9 < 103 && arg0 + var10 > 0 && arg0 + var10 < 103) {
					arg8[arg3].flags[arg4 + var9][arg0 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		Packet var11 = new Packet(arg7);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (arg2 == var12 && var13 >= arg1 && arg1 + 8 > var13 && var14 >= arg5 && arg5 + 8 > var14) {
						method841(arg4 + RegionRotate.method519(arg6, var13 & 0x7, var14 & 0x7), arg6, var11, arg0 + RegionRotate.method677(var13 & 0x7, var14 & 0x7, arg6), 0, 0, arg3);
					} else {
						method841(-1, 0, var11, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("nd.a(IIII)V")
	public static void autoGroundRegion(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				groundh[arg1][arg2 + var3][arg0 + var4] = 0;
			}
		}
		if (arg2 > 0) {
			for (int var5 = 1; var5 < 8; var5++) {
				groundh[arg1][arg2][arg0 + var5] = groundh[arg1][arg2 - 1][arg0 + var5];
			}
		}
		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				groundh[arg1][arg2 + var6][arg0] = groundh[arg1][arg2 + var6][arg0 - 1];
			}
		}
		if (arg2 > 0 && groundh[arg1][arg2 - 1][arg0] != 0) {
			groundh[arg1][arg2][arg0] = groundh[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && groundh[arg1][arg2][arg0 - 1] != 0) {
			groundh[arg1][arg2][arg0] = groundh[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && groundh[arg1][arg2 - 1][arg0 - 1] != 0) {
			groundh[arg1][arg2][arg0] = groundh[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("ib.a(ILab;IIII[BI[Lad;II)V")
	public static void loadLocationsRegion(int arg0, World arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, CollisionMap[] arg7, int arg8, int arg9) {
		Packet var10 = new Packet(arg5);
		int var11 = -1;
		while (true) {
			int var12 = var10.method178();
			if (var12 == 0) {
				return;
			}
			int var13 = 0;
			var11 += var12;
			while (true) {
				int var14 = var10.method178();
				if (var14 == 0) {
					break;
				}
				var13 += var14 - 1;
				int var15 = var13 >> 12;
				int var16 = var13 >> 6 & 0x3F;
				int var17 = var10.g1();
				int var18 = var17 >> 2;
				int var19 = var13 & 0x3F;
				int var20 = var17 & 0x3;
				if (arg4 == var15 && arg0 <= var16 && var16 < arg0 + 8 && arg8 <= var19 && arg8 + 8 > var19) {
					LocType var21 = LocType.list(var11);
					int var22 = RegionRotate.method287(var20, var21.width, var16 & 0x7, var21.length, arg3, var19 & 0x7) + arg9;
					int var23 = RegionRotate.method404(var19 & 0x7, var21.length, var16 & 0x7, var21.width, arg3, var20) + arg6;
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						CollisionMap var24 = null;
						int var25 = arg2;
						if ((mapl[1][var22][var23] & 0x2) == 2) {
							var25 = arg2 - 1;
						}
						if (var25 >= 0) {
							var24 = arg7[var25];
						}
						method301(arg3 + var20 & 0x3, var24, var22, arg1, var18, var11, var23, arg2);
					}
				}
			}
		}
	}

	@ObfuscatedName("gb.a(Lab;I[Lad;)V")
	public static void finishBuild(World arg0, CollisionMap[] arg1) {
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					if ((mapl[var2][var3][var4] & 0x1) == 1) {
						int var5 = var2;
						if ((mapl[1][var3][var4] & 0x2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							arg1[var5].method115(var4, var3);
						}
					}
				}
			}
		}
		field2822 += (int) (Math.random() * 5.0D) - 2;
		field2025 += (int) (Math.random() * 5.0D) - 2;
		if (field2822 < -8) {
			field2822 = -8;
		}
		if (field2822 > 8) {
			field2822 = 8;
		}
		if (field2025 < -16) {
			field2025 = -16;
		}
		if (field2025 > 16) {
			field2025 = 16;
		}
		for (int var6 = 0; var6 < 4; var6++) {
			byte[][] var7 = field1003[var6];
			int var8 = (int) Math.sqrt(5100.0D);
			int var9 = var8 * 768 >> 8;
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					int var12 = groundh[var6][var11 + 1][var10] - groundh[var6][var11 - 1][var10];
					int var13 = groundh[var6][var11][var10 + 1] - groundh[var6][var11][var10 - 1];
					int var14 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536));
					int var15 = 65536 / var14;
					int var16 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11 - 1][var10] >> 2) + (var7[var11][var10 + -1] >> 2) + (var7[var11 + 1][var10] >> 3);
					int var17 = (var12 << 8) / var14;
					int var18 = (var13 << 8) / var14;
					int var19 = (var18 * -50 + var17 * -50 + var15 * -10) / var9 + 96;
					field1247[var11][var10] = var19 - var16;
				}
			}
			for (int var20 = 0; var20 < 104; var20++) {
				field2906[var20] = 0;
				field2930[var20] = 0;
				field856[var20] = 0;
				field3246[var20] = 0;
				field1385[var20] = 0;
			}
			for (int var21 = -5; var21 < 109; var21++) {
				for (int var22 = 0; var22 < 104; var22++) {
					int var23 = var21 + 5;
					int var10002;
					if (var23 >= 0 && var23 < 104) {
						int var24 = field2131[var6][var23][var22] & 0xFF;
						if (var24 > 0) {
							FluType var25 = FluType.list(var24 - 1);
							field2906[var22] += var25.hue;
							field2930[var22] += var25.saturation;
							field856[var22] += var25.lightness;
							field3246[var22] += var25.chroma;
							var10002 = field1385[var22]++;
						}
					}
					int var26 = var21 - 5;
					if (var26 >= 0 && var26 < 104) {
						int var27 = field2131[var6][var26][var22] & 0xFF;
						if (var27 > 0) {
							FluType var28 = FluType.list(var27 - 1);
							field2906[var22] -= var28.hue;
							field2930[var22] -= var28.saturation;
							field856[var22] -= var28.lightness;
							field3246[var22] -= var28.chroma;
							var10002 = field1385[var22]--;
						}
					}
				}
				if (var21 >= 1 && var21 < 103) {
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					for (int var34 = -5; var34 < 109; var34++) {
						int var35 = var34 + 5;
						int var36 = var34 - 5;
						if (var35 >= 0 && var35 < 104) {
							var33 += field3246[var35];
							var30 += field2930[var35];
							var32 += field1385[var35];
							var31 += field856[var35];
							var29 += field2906[var35];
						}
						if (var36 >= 0 && var36 < 104) {
							var30 -= field2930[var36];
							var32 -= field1385[var36];
							var31 -= field856[var36];
							var33 -= field3246[var36];
							var29 -= field2906[var36];
						}
						if (var34 >= 1 && var34 < 103 && (!Client.lowMem || (mapl[0][var21][var34] & 0x2) != 0 || (mapl[var6][var21][var34] & 0x10) == 0 && method964(var6, var34, var21) == field1472)) {
							if (var6 < minusedlevel) {
								minusedlevel = var6;
							}
							int var37 = field2131[var6][var21][var34] & 0xFF;
							int var38 = field3053[var6][var21][var34] & 0xFF;
							if (var37 > 0 || var38 > 0) {
								int var39 = groundh[var6][var21][var34];
								int var40 = groundh[var6][var21 + 1][var34];
								int var41 = groundh[var6][var21 + 1][var34 + 1];
								int var42 = groundh[var6][var21][var34 + 1];
								int var43 = field1247[var21][var34];
								int var44 = field1247[var21 + 1][var34];
								int var45 = field1247[var21 + 1][var34 + 1];
								int var46 = -1;
								int var47 = field1247[var21][var34 + 1];
								int var48 = -1;
								if (var37 > 0) {
									int var49 = var29 * 256 / var33;
									int var50 = var30 / var32;
									int var51 = var31 / var32;
									var46 = method322(var50, var51, var49);
									int var52 = field2025 + var51;
									int var53 = var49 + field2822 & 0xFF;
									if (var52 < 0) {
										var52 = 0;
									} else if (var52 > 255) {
										var52 = 255;
									}
									var48 = method322(var50, var52, var53);
								}
								if (var6 > 0) {
									boolean var54 = true;
									if (var37 == 0 && field910[var6][var21][var34] != 0) {
										var54 = false;
									}
									if (var38 > 0 && !FloType.list(var38 - 1).occlude) {
										var54 = false;
									}
									if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
										field412[var6][var21][var34] |= 0x924;
									}
								}
								int var55 = 0;
								if (var48 != -1) {
									var55 = Pix3D.field764[method955(var48, 96)];
								}
								if (var38 == 0) {
									arg0.method55(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method955(var46, var43), method955(var46, var44), method955(var46, var45), method955(var46, var47), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = field910[var6][var21][var34] + 1;
									byte var57 = field1872[var6][var21][var34];
									FloType var58 = FloType.list(var38 - 1);
									int var59 = var58.texture;
									int var60;
									int var61;
									if (var59 >= 0) {
										var60 = -1;
										var61 = Pix3D.field771.method693(var59);
									} else if (var58.colour == 16711935) {
										var60 = -2;
										var59 = -1;
										var61 = -2;
									} else {
										var60 = method322(var58.saturation, var58.hue, var58.lightness);
										int var62 = field2822 + var58.lightness & 0xFF;
										int var63 = field2025 + var58.hue;
										if (var63 < 0) {
											var63 = 0;
										} else if (var63 > 255) {
											var63 = 255;
										}
										var61 = method322(var58.saturation, var63, var62);
									}
									int var64 = 0;
									if (var61 != -2) {
										var64 = Pix3D.field764[method689(var61, 96)];
									}
									if (var58.mapcolour != -1) {
										int var65 = field2822 + var58.mapLightness & 0xFF;
										int var66 = field2025 + var58.mapHue;
										if (var66 < 0) {
											var66 = 0;
										} else if (var66 > 255) {
											var66 = 255;
										}
										int var67 = method322(var58.mapSaturation, var66, var65);
										var64 = Pix3D.field764[method689(var67, 96)];
									}
									arg0.method55(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method955(var46, var43), method955(var46, var44), method955(var46, var45), method955(var46, var47), method689(var60, var43), method689(var60, var44), method689(var60, var45), method689(var60, var47), var55, var64);
								}
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					arg0.method86(var6, var69, var68, method964(var6, var68, var69));
				}
			}
			field2131[var6] = null;
			field3053[var6] = null;
			field910[var6] = null;
			field1872[var6] = null;
			field1003[var6] = null;
		}
		arg0.method74();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((mapl[1][var70][var71] & 0x2) == 2) {
					arg0.method48(var70, var71);
				}
			}
		}
		int var72 = 1;
		int var73 = 2;
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
						if ((field412[var76][var78][var77] & var72) != 0) {
							int var79;
							for (var79 = var77; var79 > 0 && (var72 & field412[var76][var78][var79 - 1]) != 0; var79--) {
							}
							int var80;
							for (var80 = var77; var80 < 104 && (field412[var76][var78][var80 + 1] & var72) != 0; var80++) {
							}
							int var81 = var76;
							int var82 = var76;
							label347:
							while (var81 > 0) {
								for (int var83 = var79; var83 <= var80; var83++) {
									if ((field412[var81 - 1][var78][var83] & var72) == 0) {
										break label347;
									}
								}
								var81--;
							}
							label336:
							while (var82 < var75) {
								for (int var84 = var79; var84 <= var80; var84++) {
									if ((var72 & field412[var82 + 1][var78][var84]) == 0) {
										break label336;
									}
								}
								var82++;
							}
							int var85 = (var80 + 1 - var79) * (var82 + 1 - var81);
							if (var85 >= 8) {
								int var86 = groundh[var82][var78][var79] - 240;
								int var87 = groundh[var81][var78][var79];
								World.method72(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var86, var87);
								for (int var88 = var81; var88 <= var82; var88++) {
									for (int var89 = var79; var89 <= var80; var89++) {
										field412[var88][var78][var89] &= ~var72;
									}
								}
							}
						}
						if ((var73 & field412[var76][var78][var77]) != 0) {
							int var90;
							for (var90 = var78; var90 > 0 && (var73 & field412[var76][var90 - 1][var77]) != 0; var90--) {
							}
							int var91 = var76;
							int var92 = var78;
							int var93 = var76;
							while (var92 < 104 && (var73 & field412[var76][var92 + 1][var77]) != 0) {
								var92++;
							}
							label402:
							while (var93 > 0) {
								for (int var94 = var90; var94 <= var92; var94++) {
									if ((field412[var93 - 1][var94][var77] & var73) == 0) {
										break label402;
									}
								}
								var93--;
							}
							label391:
							while (var91 < var75) {
								for (int var95 = var90; var95 <= var92; var95++) {
									if ((var73 & field412[var91 + 1][var95][var77]) == 0) {
										break label391;
									}
								}
								var91++;
							}
							int var96 = (var92 + 1 - var90) * (var91 + 1 - var93);
							if (var96 >= 8) {
								int var97 = groundh[var93][var90][var77];
								int var98 = groundh[var91][var90][var77] - 240;
								World.method72(var75, 2, var90 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
								for (int var99 = var93; var99 <= var91; var99++) {
									for (int var100 = var90; var100 <= var92; var100++) {
										field412[var99][var100][var77] &= ~var73;
									}
								}
							}
						}
						if ((field412[var76][var78][var77] & var74) != 0) {
							int var101 = var78;
							int var102 = var78;
							int var103 = var77;
							int var104 = var77;
							while (var103 > 0 && (field412[var76][var78][var103 - 1] & var74) != 0) {
								var103--;
							}
							while (var104 < 104 && (var74 & field412[var76][var78][var104 + 1]) != 0) {
								var104++;
							}
							label456:
							while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((var74 & field412[var76][var101 - 1][var105]) == 0) {
										break label456;
									}
								}
								var101--;
							}
							label445:
							while (var102 < 104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((var74 & field412[var76][var102 + 1][var106]) == 0) {
										break label445;
									}
								}
								var102++;
							}
							if ((var104 + 1 - var103) * (var102 + 1 - var101) >= 4) {
								int var107 = groundh[var76][var101][var103];
								World.method72(var75, 4, var101 * 128, var102 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field412[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("sa.b(I)V")
	public static void quit() {
		field3246 = null;
		field856 = null;
		field1385 = null;
		field412 = null;
		field1247 = null;
		field1872 = null;
		field2930 = null;
		field1003 = null;
		field910 = null;
		field3053 = null;
		field2131 = null;
		field2906 = null;
	}

	@ObfuscatedName("qb.a(IILba;IIIII)V")
	public static void method841(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0 || arg0 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				int var9 = arg2.g1();
				if (var9 == 0) {
					break;
				}
				if (var9 == 1) {
					arg2.g1();
					break;
				}
				if (var9 <= 49) {
					arg2.g1();
				}
			}
			return;
		}
		mapl[arg6][arg0][arg3] = 0;
		while (true) {
			int var7 = arg2.g1();
			if (var7 == 0) {
				if (arg6 == 0) {
					groundh[0][arg0][arg3] = -method751(arg0 + arg5 + 932731, arg4 + 556238 + arg3) * 8;
				} else {
					groundh[arg6][arg0][arg3] = groundh[arg6 - 1][arg0][arg3] - 240;
				}
				break;
			}
			if (var7 == 1) {
				int var8 = arg2.g1();
				if (var8 == 1) {
					var8 = 0;
				}
				if (arg6 == 0) {
					groundh[0][arg0][arg3] = -var8 * 8;
				} else {
					groundh[arg6][arg0][arg3] = groundh[arg6 - 1][arg0][arg3] - var8 * 8;
				}
				break;
			}
			if (var7 <= 49) {
				field3053[arg6][arg0][arg3] = arg2.g1b();
				field910[arg6][arg0][arg3] = (byte) ((var7 - 2) / 4);
				field1872[arg6][arg0][arg3] = (byte) (arg1 + var7 - 2 & 0x3);
			} else if (var7 <= 81) {
				mapl[arg6][arg0][arg3] = (byte) (var7 - 49);
			} else {
				field2131[arg6][arg0][arg3] = (byte) (var7 - 81);
			}
		}
	}

	@ObfuscatedName("d.a(ILad;ILab;IIIII)V")
	public static void method301(int arg0, CollisionMap arg1, int arg2, World arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Client.lowMem && (mapl[0][arg2][arg6] & 0x2) == 0) {
			if ((mapl[arg7][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (method964(arg7, arg6, arg2) != field1472) {
				return;
			}
		}
		if (minusedlevel > arg7) {
			minusedlevel = arg7;
		}
		int var8 = groundh[arg7][arg2 + 1][arg6 + 1];
		int var9 = groundh[arg7][arg2][arg6];
		int var10 = groundh[arg7][arg2 + 1][arg6];
		int var11 = groundh[arg7][arg2][arg6 + 1];
		int var12 = (arg6 << 7) + arg2 + (arg5 << 14) + 1073741824;
		int var13 = (arg0 << 6) + arg4;
		int var14 = var9 + var10 + var8 + var11 >> 2;
		LocType var15 = LocType.list(arg5);
		if (var15.raiseobject == 1) {
			var13 += 256;
		}
		if (var15.active == 0) {
			var12 += Integer.MIN_VALUE;
		}
		if (var15.method506()) {
			BgSound.method719(arg6, arg7, arg0, arg2, var15);
		}
		if (arg4 == 22) {
			if (!Client.lowMem || var15.active != 0 || var15.forcedecor) {
				ModelSource var16;
				if (var15.anim == -1 && var15.multiloc == null) {
					var16 = var15.getModel(var8, var11, arg0, var9, 22, var10);
				} else {
					var16 = new ClientLocAnim(arg5, 22, arg0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setGroundDecor(arg7, arg2, arg6, var14, var16, var12, var13);
				if (var15.blockwalk && var15.active == 1 && arg1 != null) {
					arg1.method115(arg6, arg2);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var17;
			if (var15.anim == -1 && var15.multiloc == null) {
				var17 = var15.getModel(var8, var11, arg0, var9, 10, var10);
			} else {
				var17 = new ClientLocAnim(arg5, 10, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			if (var17 != null) {
				int var18;
				int var19;
				if (arg0 == 1 || arg0 == 3) {
					var19 = var15.width;
					var18 = var15.length;
				} else {
					var18 = var15.width;
					var19 = var15.length;
				}
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}
				if (arg3.addScenery(arg7, arg2, arg6, var14, var18, var19, var17, var20, var12, var13) && var15.shadow) {
					Model var21;
					if (var17 instanceof Model) {
						var21 = (Model) var17;
					} else {
						var21 = var15.getModel(var8, var11, arg0, var9, 10, var10);
					}
					if (var21 != null) {
						for (int var22 = 0; var22 <= var18; var22++) {
							for (int var23 = 0; var23 <= var19; var23++) {
								int var24 = var21.method773() / 4;
								if (var24 > 30) {
									var24 = 30;
								}
								if (var24 > field1003[arg7][arg2 + var22][arg6 + var23]) {
									field1003[arg7][arg2 + var22][arg6 + var23] = (byte) var24;
								}
							}
						}
					}
				}
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method118(arg2, var15.blockrange, var15.length, arg0, arg6, var15.width);
			}
		} else if (arg4 >= 12) {
			ModelSource var25;
			if (var15.anim == -1 && var15.multiloc == null) {
				var25 = var15.getModel(var8, var11, arg0, var9, arg4, var10);
			} else {
				var25 = new ClientLocAnim(arg5, arg4, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.addScenery(arg7, arg2, arg6, var14, 1, 1, var25, 0, var12, var13);
			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
				field412[arg7][arg2][arg6] |= 0x924;
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method118(arg2, var15.blockrange, var15.length, arg0, arg6, var15.width);
			}
		} else if (arg4 == 0) {
			ModelSource var26;
			if (var15.anim == -1 && var15.multiloc == null) {
				var26 = var15.getModel(var8, var11, arg0, var9, 0, var10);
			} else {
				var26 = new ClientLocAnim(arg5, 0, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.setWall(arg7, arg2, arg6, var14, var26, null, field1740[arg0], 0, var12, var13);
			if (arg0 == 0) {
				if (var15.shadow) {
					field1003[arg7][arg2][arg6] = 50;
					field1003[arg7][arg2][arg6 + 1] = 50;
				}
				if (var15.occlude) {
					field412[arg7][arg2][arg6] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var15.shadow) {
					field1003[arg7][arg2][arg6 + 1] = 50;
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				}
				if (var15.occlude) {
					field412[arg7][arg2][arg6 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var15.shadow) {
					field1003[arg7][arg2 + 1][arg6] = 50;
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				}
				if (var15.occlude) {
					field412[arg7][arg2 + 1][arg6] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var15.shadow) {
					field1003[arg7][arg2][arg6] = 50;
					field1003[arg7][arg2 + 1][arg6] = 50;
				}
				if (var15.occlude) {
					field412[arg7][arg2][arg6] |= 0x492;
				}
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.blockrange);
			}
			if (var15.wallwidth != 16) {
				arg3.method71(arg7, arg2, arg6, var15.wallwidth);
			}
		} else if (arg4 == 1) {
			ModelSource var27;
			if (var15.anim == -1 && var15.multiloc == null) {
				var27 = var15.getModel(var8, var11, arg0, var9, 1, var10);
			} else {
				var27 = new ClientLocAnim(arg5, 1, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.setWall(arg7, arg2, arg6, var14, var27, null, field2819[arg0], 0, var12, var13);
			if (var15.shadow) {
				if (arg0 == 0) {
					field1003[arg7][arg2][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field1003[arg7][arg2 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field1003[arg7][arg2][arg6] = 50;
				}
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.blockrange);
			}
		} else if (arg4 == 2) {
			int var28 = arg0 + 1 & 0x3;
			ModelSource var29;
			ModelSource var30;
			if (var15.anim == -1 && var15.multiloc == null) {
				var29 = var15.getModel(var8, var11, arg0 + 4, var9, 2, var10);
				var30 = var15.getModel(var8, var11, var28, var9, 2, var10);
			} else {
				var29 = new ClientLocAnim(arg5, 2, arg0 + 4, var9, var10, var8, var11, var15.anim, true);
				var30 = new ClientLocAnim(arg5, 2, var28, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.setWall(arg7, arg2, arg6, var14, var29, var30, field1740[arg0], field1740[var28], var12, var13);
			if (var15.occlude) {
				if (arg0 == 0) {
					field412[arg7][arg2][arg6] |= 0x249;
					field412[arg7][arg2][arg6 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field412[arg7][arg2][arg6 + 1] |= 0x492;
					field412[arg7][arg2 + 1][arg6] |= 0x249;
				} else if (arg0 == 2) {
					field412[arg7][arg2 + 1][arg6] |= 0x249;
					field412[arg7][arg2][arg6] |= 0x492;
				} else if (arg0 == 3) {
					field412[arg7][arg2][arg6] |= 0x492;
					field412[arg7][arg2][arg6] |= 0x249;
				}
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.blockrange);
			}
			if (var15.wallwidth != 16) {
				arg3.method71(arg7, arg2, arg6, var15.wallwidth);
			}
		} else if (arg4 == 3) {
			ModelSource var31;
			if (var15.anim == -1 && var15.multiloc == null) {
				var31 = var15.getModel(var8, var11, arg0, var9, 3, var10);
			} else {
				var31 = new ClientLocAnim(arg5, 3, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.setWall(arg7, arg2, arg6, var14, var31, null, field2819[arg0], 0, var12, var13);
			if (var15.shadow) {
				if (arg0 == 0) {
					field1003[arg7][arg2][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field1003[arg7][arg2 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field1003[arg7][arg2][arg6] = 50;
				}
			}
			if (var15.blockwalk && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.blockrange);
			}
		} else if (arg4 == 9) {
			ModelSource var32;
			if (var15.anim == -1 && var15.multiloc == null) {
				var32 = var15.getModel(var8, var11, arg0, var9, arg4, var10);
			} else {
				var32 = new ClientLocAnim(arg5, arg4, arg0, var9, var10, var8, var11, var15.anim, true);
			}
			arg3.addScenery(arg7, arg2, arg6, var14, 1, 1, var32, 0, var12, var13);
			if (var15.blockwalk && arg1 != null) {
				arg1.method118(arg2, var15.blockrange, var15.length, arg0, arg6, var15.width);
			}
		} else {
			if (var15.hillskew) {
				if (arg0 == 1) {
					int var33 = var11;
					var11 = var8;
					var8 = var10;
					var10 = var9;
					var9 = var33;
				} else if (arg0 == 2) {
					int var34 = var11;
					var11 = var10;
					var10 = var34;
					int var35 = var8;
					var8 = var9;
					var9 = var35;
				} else if (arg0 == 3) {
					int var36 = var11;
					var11 = var9;
					var9 = var10;
					var10 = var8;
					var8 = var36;
				}
			}
			if (arg4 == 4) {
				ModelSource var37;
				if (var15.anim == -1 && var15.multiloc == null) {
					var37 = var15.getModel(var8, var11, 0, var9, 4, var10);
				} else {
					var37 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setDecor(arg7, arg2, arg6, var14, var37, field1740[arg0], arg0 * 512, 0, 0, var12, var13);
			} else if (arg4 == 5) {
				int var38 = arg3.wallType(arg7, arg2, arg6);
				int var39 = 16;
				if (var38 > 0) {
					var39 = LocType.list(var38 >> 14 & 0x7FFF).wallwidth;
				}
				ModelSource var40;
				if (var15.anim == -1 && var15.multiloc == null) {
					var40 = var15.getModel(var8, var11, 0, var9, 4, var10);
				} else {
					var40 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setDecor(arg7, arg2, arg6, var14, var40, field1740[arg0], arg0 * 512, field1595[arg0] * var39, field181[arg0] * var39, var12, var13);
			} else if (arg4 == 6) {
				ModelSource var41;
				if (var15.anim == -1 && var15.multiloc == null) {
					var41 = var15.getModel(var8, var11, 0, var9, 4, var10);
				} else {
					var41 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setDecor(arg7, arg2, arg6, var14, var41, 256, arg0, 0, 0, var12, var13);
			} else if (arg4 == 7) {
				ModelSource var42;
				if (var15.anim == -1 && var15.multiloc == null) {
					var42 = var15.getModel(var8, var11, 0, var9, 4, var10);
				} else {
					var42 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setDecor(arg7, arg2, arg6, var14, var42, 512, arg0, 0, 0, var12, var13);
			} else if (arg4 == 8) {
				ModelSource var43;
				if (var15.anim == -1 && var15.multiloc == null) {
					var43 = var15.getModel(var8, var11, 0, var9, 4, var10);
				} else {
					var43 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.anim, true);
				}
				arg3.setDecor(arg7, arg2, arg6, var14, var43, 768, arg0, 0, 0, var12, var13);
			}
		}
	}

	@ObfuscatedName("de.a(IIII)I")
	public static int method322(int arg0, int arg1, int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}

	@ObfuscatedName("tb.b(IIB)I")
	public static int method955(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("mb.a(IIZ)I")
	public static int method689(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var3 = (arg0 & 0x7F) * arg1 / 128;
			if (var3 < 2) {
				var3 = 2;
			} else if (var3 > 126) {
				var3 = 126;
			}
			return (arg0 & 0xFF80) + var3;
		}
	}

	@ObfuscatedName("tc.a(IIII)I")
	public static int method964(int arg0, int arg1, int arg2) {
		if ((mapl[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (mapl[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("fc.b(B)V")
	public static void method394() {
		field910 = null;
		mapl = null;
		Client.mapBuildRegionSrc = null;
		TextGerman.field890 = null;
		Text.field889 = null;
		TextGerman.field902 = null;
		Text.field900 = null;
		Statics.field899 = null;
	}

	@ObfuscatedName("kd.a(IIIZI)I")
	public static int method627(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg3 * 1024 / arg1] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg2 * var4 >> 16);
	}

	@ObfuscatedName("ae.a(IIII)I")
	public static int method124(int arg0, int arg1, int arg2) {
		int var3 = arg0 & arg1 - 1;
		int var4 = arg2 / arg1;
		int var5 = arg1 - 1 & arg2;
		int var6 = arg0 / arg1;
		int var7 = method121(var6, var4);
		int var8 = method121(var6 + 1, var4);
		int var9 = method121(var6, var4 + 1);
		int var10 = method121(var6 + 1, var4 + 1);
		int var11 = method627(var7, arg1, var8, var3);
		int var12 = method627(var9, arg1, var10, var3);
		return method627(var11, arg1, var12, var5);
	}

	@ObfuscatedName("oa.a(IBI)I")
	public static int method751(int arg0, int arg1) {
		int var2 = method124(arg0 + 45365, 4, arg1 + 91923) + (method124(arg0 - -10294, 2, arg1 + 37821) - 128 >> 1) + (method124(arg0, 1, arg1) + -128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("ad.b(III)I")
	public static int method121(int arg0, int arg1) {
		int var2 = method747(arg0 - 1, arg1 + -1) + method747(arg0 + 1, arg1 - 1) + method747(arg0 + -1, arg1 + 1) + method747(arg0 + 1, arg1 - -1);
		int var3 = method747(arg0 - 1, arg1) + method747(arg0 + 1, arg1) + method747(arg0, arg1 - 1) + method747(arg0, arg1 + 1);
		int var4 = method747(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("oa.a(III)I")
	public static int method747(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 ^ var2 << 13;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("cc.a(Lad;IIIILab;IIII)V")
	public static void method270(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, World arg5, int arg6, int arg7, int arg8) {
		int var9 = groundh[arg2][arg8][arg7];
		int var10 = groundh[arg2][arg8 + 1][arg7];
		int var11 = groundh[arg2][arg8][arg7 + 1];
		int var12 = groundh[arg2][arg8 + 1][arg7 + 1];
		LocType var13 = LocType.list(arg1);
		int var14 = var9 + var11 + var10 + var12 >> 2;
		int var15 = (arg6 << 6) + arg4;
		int var16 = arg8 + (arg7 << 7) + (arg1 << 14) + 1073741824;
		if (var13.active == 0) {
			var16 += Integer.MIN_VALUE;
		}
		if (var13.raiseobject == 1) {
			var15 += 256;
		}
		if (arg4 == 22) {
			ModelSource var17;
			if (var13.anim == -1 && var13.multiloc == null) {
				var17 = var13.getModel(var12, var11, arg6, var9, 22, var10);
			} else {
				var17 = new ClientLocAnim(arg1, 22, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.setGroundDecor(arg3, arg8, arg7, var14, var17, var16, var15);
			if (var13.blockwalk && var13.active == 1) {
				arg0.method115(arg7, arg8);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var18;
			if (var13.anim == -1 && var13.multiloc == null) {
				var18 = var13.getModel(var12, var11, arg6, var9, 10, var10);
			} else {
				var18 = new ClientLocAnim(arg1, 10, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			if (var18 != null) {
				int var19;
				int var20;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var13.width;
					var19 = var13.length;
				} else {
					var19 = var13.width;
					var20 = var13.length;
				}
				int var21 = 0;
				if (arg4 == 11) {
					var21 += 256;
				}
				arg5.addScenery(arg3, arg8, arg7, var14, var19, var20, var18, var21, var16, var15);
			}
			if (var13.blockwalk) {
				arg0.method118(arg8, var13.blockrange, var13.length, arg6, arg7, var13.width);
			}
		} else if (arg4 >= 12) {
			ModelSource var22;
			if (var13.anim == -1 && var13.multiloc == null) {
				var22 = var13.getModel(var12, var11, arg6, var9, arg4, var10);
			} else {
				var22 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.addScenery(arg3, arg8, arg7, var14, 1, 1, var22, 0, var16, var15);
			if (var13.blockwalk) {
				arg0.method118(arg8, var13.blockrange, var13.length, arg6, arg7, var13.width);
			}
		} else if (arg4 == 0) {
			ModelSource var23;
			if (var13.anim == -1 && var13.multiloc == null) {
				var23 = var13.getModel(var12, var11, arg6, var9, 0, var10);
			} else {
				var23 = new ClientLocAnim(arg1, 0, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.setWall(arg3, arg8, arg7, var14, var23, null, field1740[arg6], 0, var16, var15);
			if (var13.blockwalk) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.blockrange);
			}
		} else if (arg4 == 1) {
			ModelSource var24;
			if (var13.anim == -1 && var13.multiloc == null) {
				var24 = var13.getModel(var12, var11, arg6, var9, 1, var10);
			} else {
				var24 = new ClientLocAnim(arg1, 1, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.setWall(arg3, arg8, arg7, var14, var24, null, field2819[arg6], 0, var16, var15);
			if (var13.blockwalk) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.blockrange);
			}
		} else if (arg4 == 2) {
			int var25 = arg6 + 1 & 0x3;
			ModelSource var26;
			ModelSource var27;
			if (var13.anim == -1 && var13.multiloc == null) {
				var26 = var13.getModel(var12, var11, arg6 + 4, var9, 2, var10);
				var27 = var13.getModel(var12, var11, var25, var9, 2, var10);
			} else {
				var26 = new ClientLocAnim(arg1, 2, arg6 + 4, var9, var10, var12, var11, var13.anim, true);
				var27 = new ClientLocAnim(arg1, 2, var25, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.setWall(arg3, arg8, arg7, var14, var26, var27, field1740[arg6], field1740[var25], var16, var15);
			if (var13.blockwalk) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.blockrange);
			}
		} else if (arg4 == 3) {
			ModelSource var28;
			if (var13.anim == -1 && var13.multiloc == null) {
				var28 = var13.getModel(var12, var11, arg6, var9, 3, var10);
			} else {
				var28 = new ClientLocAnim(arg1, 3, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.setWall(arg3, arg8, arg7, var14, var28, null, field2819[arg6], 0, var16, var15);
			if (var13.blockwalk) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.blockrange);
			}
		} else if (arg4 == 9) {
			ModelSource var29;
			if (var13.anim == -1 && var13.multiloc == null) {
				var29 = var13.getModel(var12, var11, arg6, var9, arg4, var10);
			} else {
				var29 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.anim, true);
			}
			arg5.addScenery(arg3, arg8, arg7, var14, 1, 1, var29, 0, var16, var15);
			if (var13.blockwalk) {
				arg0.method118(arg8, var13.blockrange, var13.length, arg6, arg7, var13.width);
			}
		} else {
			if (var13.hillskew) {
				if (arg6 == 1) {
					int var33 = var11;
					var11 = var12;
					var12 = var10;
					var10 = var9;
					var9 = var33;
				} else if (arg6 == 2) {
					int var31 = var11;
					var11 = var10;
					var10 = var31;
					int var32 = var12;
					var12 = var9;
					var9 = var32;
				} else if (arg6 == 3) {
					int var30 = var11;
					var11 = var9;
					var9 = var10;
					var10 = var12;
					var12 = var30;
				}
			}
			if (arg4 == 4) {
				ModelSource var34;
				if (var13.anim == -1 && var13.multiloc == null) {
					var34 = var13.getModel(var12, var11, 0, var9, 4, var10);
				} else {
					var34 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.anim, true);
				}
				arg5.setDecor(arg3, arg8, arg7, var14, var34, field1740[arg6], arg6 * 512, 0, 0, var16, var15);
			} else if (arg4 == 5) {
				int var35 = 16;
				int var36 = arg5.wallType(arg3, arg8, arg7);
				if (var36 > 0) {
					var35 = LocType.list(var36 >> 14 & 0x7FFF).wallwidth;
				}
				ModelSource var37;
				if (var13.anim == -1 && var13.multiloc == null) {
					var37 = var13.getModel(var12, var11, 0, var9, 4, var10);
				} else {
					var37 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.anim, true);
				}
				arg5.setDecor(arg3, arg8, arg7, var14, var37, field1740[arg6], arg6 * 512, field1595[arg6] * var35, field181[arg6] * var35, var16, var15);
			} else if (arg4 == 6) {
				ModelSource var38;
				if (var13.anim == -1 && var13.multiloc == null) {
					var38 = var13.getModel(var12, var11, 0, var9, 4, var10);
				} else {
					var38 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.anim, true);
				}
				arg5.setDecor(arg3, arg8, arg7, var14, var38, 256, arg6, 0, 0, var16, var15);
			} else if (arg4 == 7) {
				ModelSource var39;
				if (var13.anim == -1 && var13.multiloc == null) {
					var39 = var13.getModel(var12, var11, 0, var9, 4, var10);
				} else {
					var39 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.anim, true);
				}
				arg5.setDecor(arg3, arg8, arg7, var14, var39, 512, arg6, 0, 0, var16, var15);
			} else if (arg4 == 8) {
				ModelSource var40;
				if (var13.anim == -1 && var13.multiloc == null) {
					var40 = var13.getModel(var12, var11, 0, var9, 4, var10);
				} else {
					var40 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.anim, true);
				}
				arg5.setDecor(arg3, arg8, arg7, var14, var40, 768, arg6, 0, 0, var16, var15);
			}
		}
	}
}
