package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.graphics.Pix2D;
import jagex3.util.MathTool;

@ObfuscatedName("af")
public final class Pix3D extends Pix2D {

	@ObfuscatedName("af.ab")
	public static int minX;

	@ObfuscatedName("af.bb")
	public static int minY;

	@ObfuscatedName("af.cb")
	public static TextureProvider field126;

	@ObfuscatedName("af.db")
	public static int[] divTable2 = new int[2048];

	@ObfuscatedName("af.eb")
	public static int field128 = 0;

	@ObfuscatedName("af.fb")
	public static int originY;

	@ObfuscatedName("af.gb")
	public static int sizeX;

	@ObfuscatedName("af.hb")
	public static int sizeY;

	@ObfuscatedName("af.Y")
	public static boolean field122 = false;

	@ObfuscatedName("af.U")
	public static boolean lowDetail = true;

	@ObfuscatedName("af.W")
	public static boolean field120 = false;

	@ObfuscatedName("af.T")
	public static boolean field117 = false;

	@ObfuscatedName("af.V")
	public static int[] divTable = new int[512];

	@ObfuscatedName("af.X")
	public static int[] cosTable = new int[2048];

	@ObfuscatedName("af.S")
	public static int[] scanline = new int[1024];

	@ObfuscatedName("af.P")
	public static int[] sinTable = new int[2048];

	@ObfuscatedName("af.Z")
	public static int[] field123 = new int[65536];

	@ObfuscatedName("af.O")
	public static int maxY;

	@ObfuscatedName("af.Q")
	public static int originX;

	@ObfuscatedName("af.R")
	public static int maxX;

	static {
		for (int var0 = 1; var0 < 512; var0++) {
			divTable[var0] = 32768 / var0;
		}
		for (int var1 = 1; var1 < 2048; var1++) {
			divTable2[var1] = 65536 / var1;
		}
		for (int var2 = 0; var2 < 2048; var2++) {
			sinTable[var2] = (int) (Math.sin((double) var2 * 0.0030679615D) * 65536.0D);
			cosTable[var2] = (int) (Math.cos((double) var2 * 0.0030679615D) * 65536.0D);
		}
	}

	@ObfuscatedName("af.b(III)V")
	public static void setHClip(int arg0, int arg1, int arg2) {
		field117 = arg0 < 0 || arg0 > sizeX || arg1 < 0 || arg1 > sizeX || arg2 < 0 || arg2 > sizeX;
	}

	@ObfuscatedName("af.a([I[IIIIIIIIIIIIII)V")
	public static void method27(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		if (field117) {
			if (arg4 > sizeX) {
				arg4 = sizeX;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		int var13 = arg2 + arg3;
		int var14 = arg5 + arg6 * arg3;
		int var15 = arg4 - arg3;
		if (!field122) {
			int var74 = arg3 - originX;
			int var75 = arg7 + (arg10 >> 3) * var74;
			int var76 = arg8 + (arg11 >> 3) * var74;
			int var77 = arg9 + (arg12 >> 3) * var74;
			int var78 = var77 >> 14;
			int var79;
			int var80;
			if (var78 == 0) {
				var79 = 0;
				var80 = 0;
			} else {
				var79 = var75 / var78;
				var80 = var76 / var78;
				if (var79 < 0) {
					var79 = 0;
				} else if (var79 > 16256) {
					var79 = 16256;
				}
			}
			int var81 = var75 + arg10;
			int var82 = var76 + arg11;
			int var83 = var77 + arg12;
			int var84 = var83 >> 14;
			int var85;
			int var86;
			if (var84 == 0) {
				var85 = 0;
				var86 = 0;
			} else {
				var85 = var81 / var84;
				var86 = var82 / var84;
				if (var85 < 0) {
					var85 = 0;
				} else if (var85 > 16256) {
					var85 = 16256;
				}
			}
			int var87 = (var79 << 18) + var80;
			int var88 = (var85 - var79 >> 3 << 18) + (var86 - var80 >> 3);
			int var89 = var15 >> 3;
			int var90 = arg6 << 3;
			int var91 = var14 >> 8;
			if (field120) {
				if (var89 > 0) {
					do {
						int var92 = arg1[(var87 & 0x3F80) + (var87 >>> 25)];
						arg0[var13++] = ((var92 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var92 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var93 = var87 + var88;
						int var94 = arg1[(var93 & 0x3F80) + (var93 >>> 25)];
						arg0[var13++] = ((var94 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var94 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var95 = var93 + var88;
						int var96 = arg1[(var95 & 0x3F80) + (var95 >>> 25)];
						arg0[var13++] = ((var96 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var96 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var97 = var95 + var88;
						int var98 = arg1[(var97 & 0x3F80) + (var97 >>> 25)];
						arg0[var13++] = ((var98 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var98 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var99 = var97 + var88;
						int var100 = arg1[(var99 & 0x3F80) + (var99 >>> 25)];
						arg0[var13++] = ((var100 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var100 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var101 = var99 + var88;
						int var102 = arg1[(var101 & 0x3F80) + (var101 >>> 25)];
						arg0[var13++] = ((var102 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var102 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var103 = var101 + var88;
						int var104 = arg1[(var103 & 0x3F80) + (var103 >>> 25)];
						arg0[var13++] = ((var104 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var104 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var105 = var103 + var88;
						int var106 = arg1[(var105 & 0x3F80) + (var105 >>> 25)];
						arg0[var13++] = ((var106 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var106 & 0xFF00) * var91 & 0xFF0000) >> 8;
						int var107 = var85;
						int var108 = var86;
						var81 += arg10;
						var82 += arg11;
						var83 += arg12;
						int var109 = var83 >> 14;
						if (var109 == 0) {
							var85 = 0;
							var86 = 0;
						} else {
							var85 = var81 / var109;
							var86 = var82 / var109;
							if (var85 < 0) {
								var85 = 0;
							} else if (var85 > 16256) {
								var85 = 16256;
							}
						}
						var87 = (var107 << 18) + var108;
						var88 = (var85 - var107 >> 3 << 18) + (var86 - var108 >> 3);
						var14 += var90;
						var91 = var14 >> 8;
						var89--;
					} while (var89 > 0);
				}
				int var110 = arg4 - arg3 & 0x7;
				if (var110 > 0) {
					do {
						int var111 = arg1[(var87 & 0x3F80) + (var87 >>> 25)];
						arg0[var13++] = ((var111 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var111 & 0xFF00) * var91 & 0xFF0000) >> 8;
						var87 += var88;
						var110--;
					} while (var110 > 0);
					return;
				}
			} else {
				if (var89 > 0) {
					do {
						int var112;
						if ((var112 = arg1[(var87 & 0x3F80) + (var87 >>> 25)]) != 0) {
							arg0[var13] = ((var112 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var112 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var113 = var87 + var88;
						int var114;
						if ((var114 = arg1[(var113 & 0x3F80) + (var113 >>> 25)]) != 0) {
							arg0[var13] = ((var114 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var114 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var115 = var113 + var88;
						int var116;
						if ((var116 = arg1[(var115 & 0x3F80) + (var115 >>> 25)]) != 0) {
							arg0[var13] = ((var116 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var116 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var117 = var115 + var88;
						int var118;
						if ((var118 = arg1[(var117 & 0x3F80) + (var117 >>> 25)]) != 0) {
							arg0[var13] = ((var118 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var118 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var119 = var117 + var88;
						int var120;
						if ((var120 = arg1[(var119 & 0x3F80) + (var119 >>> 25)]) != 0) {
							arg0[var13] = ((var120 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var120 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var121 = var119 + var88;
						int var122;
						if ((var122 = arg1[(var121 & 0x3F80) + (var121 >>> 25)]) != 0) {
							arg0[var13] = ((var122 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var122 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var123 = var121 + var88;
						int var124;
						if ((var124 = arg1[(var123 & 0x3F80) + (var123 >>> 25)]) != 0) {
							arg0[var13] = ((var124 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var124 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var125 = var123 + var88;
						int var126;
						if ((var126 = arg1[(var125 & 0x3F80) + (var125 >>> 25)]) != 0) {
							arg0[var13] = ((var126 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var126 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						int var127 = var85;
						int var128 = var86;
						var81 += arg10;
						var82 += arg11;
						var83 += arg12;
						int var129 = var83 >> 14;
						if (var129 == 0) {
							var85 = 0;
							var86 = 0;
						} else {
							var85 = var81 / var129;
							var86 = var82 / var129;
							if (var85 < 0) {
								var85 = 0;
							} else if (var85 > 16256) {
								var85 = 16256;
							}
						}
						var87 = (var127 << 18) + var128;
						var88 = (var85 - var127 >> 3 << 18) + (var86 - var128 >> 3);
						var14 += var90;
						var91 = var14 >> 8;
						var89--;
					} while (var89 > 0);
				}
				int var130 = arg4 - arg3 & 0x7;
				if (var130 > 0) {
					do {
						int var131;
						if ((var131 = arg1[(var87 & 0x3F80) + (var87 >>> 25)]) != 0) {
							arg0[var13] = ((var131 & 0xFF00FF) * var91 & 0xFF00FF00) + ((var131 & 0xFF00) * var91 & 0xFF0000) >> 8;
						}
						var13++;
						var87 += var88;
						var130--;
					} while (var130 > 0);
				}
			}
			return;
		}
		int var16 = arg3 - originX;
		int var17 = arg7 + (arg10 >> 3) * var16;
		int var18 = arg8 + (arg11 >> 3) * var16;
		int var19 = arg9 + (arg12 >> 3) * var16;
		int var20 = var19 >> 12;
		int var21;
		int var22;
		if (var20 == 0) {
			var21 = 0;
			var22 = 0;
		} else {
			var21 = var17 / var20;
			var22 = var18 / var20;
			if (var21 < 0) {
				var21 = 0;
			} else if (var21 > 4032) {
				var21 = 4032;
			}
		}
		int var23 = var17 + arg10;
		int var24 = var18 + arg11;
		int var25 = var19 + arg12;
		int var26 = var25 >> 12;
		int var27;
		int var28;
		if (var26 == 0) {
			var27 = 0;
			var28 = 0;
		} else {
			var27 = var23 / var26;
			var28 = var24 / var26;
			if (var27 < 0) {
				var27 = 0;
			} else if (var27 > 4032) {
				var27 = 4032;
			}
		}
		int var29 = (var21 << 20) + var22;
		int var30 = (var27 - var21 >> 3 << 20) + (var28 - var22 >> 3);
		int var31 = var15 >> 3;
		int var32 = arg6 << 3;
		int var33 = var14 >> 8;
		if (field120) {
			if (var31 > 0) {
				do {
					int var34 = arg1[(var29 & 0xFC0) + (var29 >>> 26)];
					arg0[var13++] = ((var34 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var34 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var35 = var29 + var30;
					int var36 = arg1[(var35 & 0xFC0) + (var35 >>> 26)];
					arg0[var13++] = ((var36 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var36 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var37 = var35 + var30;
					int var38 = arg1[(var37 & 0xFC0) + (var37 >>> 26)];
					arg0[var13++] = ((var38 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var38 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var39 = var37 + var30;
					int var40 = arg1[(var39 & 0xFC0) + (var39 >>> 26)];
					arg0[var13++] = ((var40 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var40 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var41 = var39 + var30;
					int var42 = arg1[(var41 & 0xFC0) + (var41 >>> 26)];
					arg0[var13++] = ((var42 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var42 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var43 = var41 + var30;
					int var44 = arg1[(var43 & 0xFC0) + (var43 >>> 26)];
					arg0[var13++] = ((var44 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var44 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var45 = var43 + var30;
					int var46 = arg1[(var45 & 0xFC0) + (var45 >>> 26)];
					arg0[var13++] = ((var46 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var46 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var47 = var45 + var30;
					int var48 = arg1[(var47 & 0xFC0) + (var47 >>> 26)];
					arg0[var13++] = ((var48 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var48 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var49 = var27;
					int var50 = var28;
					var23 += arg10;
					var24 += arg11;
					var25 += arg12;
					int var51 = var25 >> 12;
					if (var51 == 0) {
						var27 = 0;
						var28 = 0;
					} else {
						var27 = var23 / var51;
						var28 = var24 / var51;
						if (var27 < 0) {
							var27 = 0;
						} else if (var27 > 4032) {
							var27 = 4032;
						}
					}
					var29 = (var49 << 20) + var50;
					var30 = (var27 - var49 >> 3 << 20) + (var28 - var50 >> 3);
					var14 += var32;
					var33 = var14 >> 8;
					var31--;
				} while (var31 > 0);
			}
			int var52 = arg4 - arg3 & 0x7;
			if (var52 > 0) {
				do {
					int var53 = arg1[(var29 & 0xFC0) + (var29 >>> 26)];
					arg0[var13++] = ((var53 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var53 & 0xFF00) * var33 & 0xFF0000) >> 8;
					var29 += var30;
					var52--;
				} while (var52 > 0);
				return;
			}
		} else {
			if (var31 > 0) {
				do {
					int var54;
					if ((var54 = arg1[(var29 & 0xFC0) + (var29 >>> 26)]) != 0) {
						arg0[var13] = ((var54 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var54 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var55 = var29 + var30;
					int var56;
					if ((var56 = arg1[(var55 & 0xFC0) + (var55 >>> 26)]) != 0) {
						arg0[var13] = ((var56 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var56 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var57 = var55 + var30;
					int var58;
					if ((var58 = arg1[(var57 & 0xFC0) + (var57 >>> 26)]) != 0) {
						arg0[var13] = ((var58 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var58 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var59 = var57 + var30;
					int var60;
					if ((var60 = arg1[(var59 & 0xFC0) + (var59 >>> 26)]) != 0) {
						arg0[var13] = ((var60 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var60 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var61 = var59 + var30;
					int var62;
					if ((var62 = arg1[(var61 & 0xFC0) + (var61 >>> 26)]) != 0) {
						arg0[var13] = ((var62 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var62 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var63 = var61 + var30;
					int var64;
					if ((var64 = arg1[(var63 & 0xFC0) + (var63 >>> 26)]) != 0) {
						arg0[var13] = ((var64 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var64 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var65 = var63 + var30;
					int var66;
					if ((var66 = arg1[(var65 & 0xFC0) + (var65 >>> 26)]) != 0) {
						arg0[var13] = ((var66 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var66 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var67 = var65 + var30;
					int var68;
					if ((var68 = arg1[(var67 & 0xFC0) + (var67 >>> 26)]) != 0) {
						arg0[var13] = ((var68 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var68 & 0xFF00) * var33 & 0xFF0000) >> 8;
					}
					var13++;
					int var69 = var27;
					int var70 = var28;
					var23 += arg10;
					var24 += arg11;
					var25 += arg12;
					int var71 = var25 >> 12;
					if (var71 == 0) {
						var27 = 0;
						var28 = 0;
					} else {
						var27 = var23 / var71;
						var28 = var24 / var71;
						if (var27 < 0) {
							var27 = 0;
						} else if (var27 > 4032) {
							var27 = 4032;
						}
					}
					var29 = (var69 << 20) + var70;
					var30 = (var27 - var69 >> 3 << 20) + (var28 - var70 >> 3);
					var14 += var32;
					var33 = var14 >> 8;
					var31--;
				} while (var31 > 0);
			}
			int var72 = arg4 - arg3 & 0x7;
			if (var72 <= 0) {
				return;
			}
			do {
				int var73;
				if ((var73 = arg1[(var29 & 0xFC0) + (var29 >>> 26)]) != 0) {
					arg0[var13] = ((var73 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var73 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				var29 += var30;
				var72--;
			} while (var72 > 0);
		}
		return;
	}

	@ObfuscatedName("af.a([IIIIIIII)V")
	public static void method28(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field117) {
			if (arg3 > sizeX) {
				arg3 = sizeX;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
		}
		if (arg2 >= arg3) {
			return;
		}
		int var6 = arg1 + arg2;
		int var7 = arg4 + arg5 * arg2;
		if (!lowDetail) {
			int var25 = arg3 - arg2;
			if (field128 == 0) {
				do {
					arg0[var6++] = field123[var7 >> 8];
					var7 += arg5;
					var25--;
				} while (var25 > 0);
			} else {
				int var26 = field128;
				int var27 = 256 - field128;
				do {
					int var28 = field123[var7 >> 8];
					var7 += arg5;
					int var29 = ((var28 & 0xFF00FF) * var27 >> 8 & 0xFF00FF) + ((var28 & 0xFF00) * var27 >> 8 & 0xFF00);
					int var30 = arg0[var6];
					arg0[var6++] = var29 + ((var30 & 0xFF00FF) * var26 >> 8 & 0xFF00FF) + ((var30 & 0xFF00) * var26 >> 8 & 0xFF00);
					var25--;
				} while (var25 > 0);
			}
			return;
		}
		int var8 = arg3 - arg2 >> 2;
		int var9 = arg5 << 2;
		if (field128 == 0) {
			if (var8 > 0) {
				do {
					int var10 = field123[var7 >> 8];
					var7 += var9;
					arg0[var6++] = var10;
					arg0[var6++] = var10;
					arg0[var6++] = var10;
					arg0[var6++] = var10;
					var8--;
				} while (var8 > 0);
			}
			int var11 = arg3 - arg2 & 0x3;
			if (var11 > 0) {
				int var12 = field123[var7 >> 8];
				do {
					arg0[var6++] = var12;
					var11--;
				} while (var11 > 0);
				return;
			}
			return;
		}
		int var13 = field128;
		int var14 = 256 - field128;
		if (var8 > 0) {
			do {
				int var15 = field123[var7 >> 8];
				var7 += var9;
				int var16 = ((var15 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var14 >> 8 & 0xFF00);
				int var17 = arg0[var6];
				arg0[var6++] = var16 + ((var17 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var13 >> 8 & 0xFF00);
				int var18 = arg0[var6];
				arg0[var6++] = var16 + ((var18 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var18 & 0xFF00) * var13 >> 8 & 0xFF00);
				int var19 = arg0[var6];
				arg0[var6++] = var16 + ((var19 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var19 & 0xFF00) * var13 >> 8 & 0xFF00);
				int var20 = arg0[var6];
				arg0[var6++] = var16 + ((var20 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var13 >> 8 & 0xFF00);
				var8--;
			} while (var8 > 0);
		}
		int var21 = arg3 - arg2 & 0x3;
		if (var21 <= 0) {
			return;
		}
		int var22 = field123[var7 >> 8];
		int var23 = ((var22 & 0xFF00FF) * var14 >> 8 & 0xFF00FF) + ((var22 & 0xFF00) * var14 >> 8 & 0xFF00);
		do {
			int var24 = arg0[var6];
			arg0[var6++] = var23 + ((var24 & 0xFF00FF) * var13 >> 8 & 0xFF00FF) + ((var24 & 0xFF00) * var13 >> 8 & 0xFF00);
			var21--;
		} while (var21 > 0);
	}

	@ObfuscatedName("af.a(D)V")
	public static void initColourTable(double arg0) {
		initColourTable2(arg0);
	}

	@ObfuscatedName("af.a(IIIIIIIIIIIIIIIIIII)V")
	public static void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		int[] var19 = field126.getTexels(arg18);
		if (var19 == null) {
			int var20 = field126.getAverageRgb(arg18);
			method33(arg0, arg1, arg2, arg3, arg4, arg5, textureLightColour(var20, arg6), textureLightColour(var20, arg7), textureLightColour(var20, arg8));
			return;
		}
		field122 = field126.isLowMem(arg18);
		field120 = field126.isOpaque(arg18);
		int var21 = arg4 - arg3;
		int var22 = arg1 - arg0;
		int var23 = arg5 - arg3;
		int var24 = arg2 - arg0;
		int var25 = arg7 - arg6;
		int var26 = arg8 - arg6;
		int var27 = 0;
		if (arg1 != arg0) {
			var27 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var28 = 0;
		if (arg2 != arg1) {
			var28 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var29 = 0;
		if (arg2 != arg0) {
			var29 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		int var30 = var21 * var24 - var23 * var22;
		if (var30 == 0) {
			return;
		}
		int var31 = (var25 * var24 - var26 * var22 << 9) / var30;
		int var32 = (var26 * var21 - var25 * var23 << 9) / var30;
		int var33 = arg9 - arg10;
		int var34 = arg12 - arg13;
		int var35 = arg15 - arg16;
		int var36 = arg11 - arg9;
		int var37 = arg14 - arg12;
		int var38 = arg17 - arg15;
		int var39 = var36 * arg12 - var37 * arg9 << 14;
		int var40 = var37 * arg15 - var38 * arg12 << 5;
		int var41 = var38 * arg9 - var36 * arg15 << 5;
		int var42 = var33 * arg12 - var34 * arg9 << 14;
		int var43 = var34 * arg15 - var35 * arg12 << 5;
		int var44 = var35 * arg9 - var33 * arg15 << 5;
		int var45 = var34 * var36 - var33 * var37 << 14;
		int var46 = var35 * var37 - var34 * var38 << 5;
		int var47 = var33 * var38 - var35 * var36 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < sizeY) {
				if (arg1 > sizeY) {
					arg1 = sizeY;
				}
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				int var48 = (arg6 << 9) + var31 - var31 * arg3;
				if (arg1 < arg2) {
					int var49;
					int var50 = var49 = arg3 << 16;
					if (arg0 < 0) {
						var50 -= var29 * arg0;
						var49 -= var27 * arg0;
						var48 -= var32 * arg0;
						arg0 = 0;
					}
					int var51 = arg4 << 16;
					if (arg1 < 0) {
						var51 -= var28 * arg1;
						arg1 = 0;
					}
					int var52 = arg0 - originY;
					int var53 = var39 + var41 * var52;
					int var54 = var42 + var44 * var52;
					int var55 = var45 + var47 * var52;
					if (arg0 != arg1 && var29 < var27 || arg0 == arg1 && var29 > var28) {
						int var56 = arg2 - arg1;
						int var57 = arg1 - arg0;
						int var58 = scanline[arg0];
						while (true) {
							var57--;
							if (var57 < 0) {
								while (true) {
									var56--;
									if (var56 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var58, var50 >> 16, var51 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
									var50 += var29;
									var51 += var28;
									var48 += var32;
									var58 += Pix2D.width;
									var53 += var41;
									var54 += var44;
									var55 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var58, var50 >> 16, var49 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
							var50 += var29;
							var49 += var27;
							var48 += var32;
							var58 += Pix2D.width;
							var53 += var41;
							var54 += var44;
							var55 += var47;
						}
					} else {
						int var59 = arg2 - arg1;
						int var60 = arg1 - arg0;
						int var61 = scanline[arg0];
						while (true) {
							var60--;
							if (var60 < 0) {
								while (true) {
									var59--;
									if (var59 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var61, var51 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
									var50 += var29;
									var51 += var28;
									var48 += var32;
									var61 += Pix2D.width;
									var53 += var41;
									var54 += var44;
									var55 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var61, var49 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
							var50 += var29;
							var49 += var27;
							var48 += var32;
							var61 += Pix2D.width;
							var53 += var41;
							var54 += var44;
							var55 += var47;
						}
					}
				} else {
					int var62;
					int var63 = var62 = arg3 << 16;
					if (arg0 < 0) {
						var63 -= var29 * arg0;
						var62 -= var27 * arg0;
						var48 -= var32 * arg0;
						arg0 = 0;
					}
					int var64 = arg5 << 16;
					if (arg2 < 0) {
						var64 -= var28 * arg2;
						arg2 = 0;
					}
					int var65 = arg0 - originY;
					int var66 = var39 + var41 * var65;
					int var67 = var42 + var44 * var65;
					int var68 = var45 + var47 * var65;
					if ((arg0 == arg2 || var29 >= var27) && (arg0 != arg2 || var28 <= var27)) {
						int var72 = arg1 - arg2;
						int var73 = arg2 - arg0;
						int var74 = scanline[arg0];
						while (true) {
							var73--;
							if (var73 < 0) {
								while (true) {
									var72--;
									if (var72 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var74, var62 >> 16, var64 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
									var64 += var28;
									var62 += var27;
									var48 += var32;
									var74 += Pix2D.width;
									var66 += var41;
									var67 += var44;
									var68 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var74, var62 >> 16, var63 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
							var63 += var29;
							var62 += var27;
							var48 += var32;
							var74 += Pix2D.width;
							var66 += var41;
							var67 += var44;
							var68 += var47;
						}
					} else {
						int var69 = arg1 - arg2;
						int var70 = arg2 - arg0;
						int var71 = scanline[arg0];
						while (true) {
							var70--;
							if (var70 < 0) {
								while (true) {
									var69--;
									if (var69 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var71, var64 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
									var64 += var28;
									var62 += var27;
									var48 += var32;
									var71 += Pix2D.width;
									var66 += var41;
									var67 += var44;
									var68 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var71, var63 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
							var63 += var29;
							var62 += var27;
							var48 += var32;
							var71 += Pix2D.width;
							var66 += var41;
							var67 += var44;
							var68 += var47;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < sizeY) {
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				if (arg0 > sizeY) {
					arg0 = sizeY;
				}
				int var75 = (arg7 << 9) + var31 - var31 * arg4;
				if (arg2 < arg0) {
					int var76;
					int var77 = var76 = arg4 << 16;
					if (arg1 < 0) {
						var77 -= var27 * arg1;
						var76 -= var28 * arg1;
						var75 -= var32 * arg1;
						arg1 = 0;
					}
					int var78 = arg5 << 16;
					if (arg2 < 0) {
						var78 -= var29 * arg2;
						arg2 = 0;
					}
					int var79 = arg1 - originY;
					int var80 = var39 + var41 * var79;
					int var81 = var42 + var44 * var79;
					int var82 = var45 + var47 * var79;
					if (arg1 != arg2 && var27 < var28 || arg1 == arg2 && var27 > var29) {
						int var83 = arg0 - arg2;
						int var84 = arg2 - arg1;
						int var85 = scanline[arg1];
						while (true) {
							var84--;
							if (var84 < 0) {
								while (true) {
									var83--;
									if (var83 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var85, var77 >> 16, var78 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
									var77 += var27;
									var78 += var29;
									var75 += var32;
									var85 += Pix2D.width;
									var80 += var41;
									var81 += var44;
									var82 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var85, var77 >> 16, var76 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
							var77 += var27;
							var76 += var28;
							var75 += var32;
							var85 += Pix2D.width;
							var80 += var41;
							var81 += var44;
							var82 += var47;
						}
					} else {
						int var86 = arg0 - arg2;
						int var87 = arg2 - arg1;
						int var88 = scanline[arg1];
						while (true) {
							var87--;
							if (var87 < 0) {
								while (true) {
									var86--;
									if (var86 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var88, var78 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
									var77 += var27;
									var78 += var29;
									var75 += var32;
									var88 += Pix2D.width;
									var80 += var41;
									var81 += var44;
									var82 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var88, var76 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
							var77 += var27;
							var76 += var28;
							var75 += var32;
							var88 += Pix2D.width;
							var80 += var41;
							var81 += var44;
							var82 += var47;
						}
					}
				} else {
					int var89;
					int var90 = var89 = arg4 << 16;
					if (arg1 < 0) {
						var90 -= var27 * arg1;
						var89 -= var28 * arg1;
						var75 -= var32 * arg1;
						arg1 = 0;
					}
					int var91 = arg3 << 16;
					if (arg0 < 0) {
						var91 -= var29 * arg0;
						arg0 = 0;
					}
					int var92 = arg1 - originY;
					int var93 = var39 + var41 * var92;
					int var94 = var42 + var44 * var92;
					int var95 = var45 + var47 * var92;
					if (var27 < var28) {
						int var96 = arg2 - arg0;
						int var97 = arg0 - arg1;
						int var98 = scanline[arg1];
						while (true) {
							var97--;
							if (var97 < 0) {
								while (true) {
									var96--;
									if (var96 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var98, var91 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
									var91 += var29;
									var89 += var28;
									var75 += var32;
									var98 += Pix2D.width;
									var93 += var41;
									var94 += var44;
									var95 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var98, var90 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
							var90 += var27;
							var89 += var28;
							var75 += var32;
							var98 += Pix2D.width;
							var93 += var41;
							var94 += var44;
							var95 += var47;
						}
					} else {
						int var99 = arg2 - arg0;
						int var100 = arg0 - arg1;
						int var101 = scanline[arg1];
						while (true) {
							var100--;
							if (var100 < 0) {
								while (true) {
									var99--;
									if (var99 < 0) {
										return;
									}
									method40(Pix2D.pixels, var19, var101, var89 >> 16, var91 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
									var91 += var29;
									var89 += var28;
									var75 += var32;
									var101 += Pix2D.width;
									var93 += var41;
									var94 += var44;
									var95 += var47;
								}
							}
							method40(Pix2D.pixels, var19, var101, var89 >> 16, var90 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
							var90 += var27;
							var89 += var28;
							var75 += var32;
							var101 += Pix2D.width;
							var93 += var41;
							var94 += var44;
							var95 += var47;
						}
					}
				}
			}
		} else if (arg2 < sizeY) {
			if (arg0 > sizeY) {
				arg0 = sizeY;
			}
			if (arg1 > sizeY) {
				arg1 = sizeY;
			}
			int var102 = (arg8 << 9) + var31 - var31 * arg5;
			if (arg0 < arg1) {
				int var103;
				int var104 = var103 = arg5 << 16;
				if (arg2 < 0) {
					var104 -= var28 * arg2;
					var103 -= var29 * arg2;
					var102 -= var32 * arg2;
					arg2 = 0;
				}
				int var105 = arg3 << 16;
				if (arg0 < 0) {
					var105 -= var27 * arg0;
					arg0 = 0;
				}
				int var106 = arg2 - originY;
				int var107 = var39 + var41 * var106;
				int var108 = var42 + var44 * var106;
				int var109 = var45 + var47 * var106;
				if (var28 < var29) {
					int var110 = arg1 - arg0;
					int var111 = arg0 - arg2;
					int var112 = scanline[arg2];
					while (true) {
						var111--;
						if (var111 < 0) {
							while (true) {
								var110--;
								if (var110 < 0) {
									return;
								}
								method40(Pix2D.pixels, var19, var112, var104 >> 16, var105 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
								var104 += var28;
								var105 += var27;
								var102 += var32;
								var112 += Pix2D.width;
								var107 += var41;
								var108 += var44;
								var109 += var47;
							}
						}
						method40(Pix2D.pixels, var19, var112, var104 >> 16, var103 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
						var104 += var28;
						var103 += var29;
						var102 += var32;
						var112 += Pix2D.width;
						var107 += var41;
						var108 += var44;
						var109 += var47;
					}
				} else {
					int var113 = arg1 - arg0;
					int var114 = arg0 - arg2;
					int var115 = scanline[arg2];
					while (true) {
						var114--;
						if (var114 < 0) {
							while (true) {
								var113--;
								if (var113 < 0) {
									return;
								}
								method40(Pix2D.pixels, var19, var115, var105 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
								var104 += var28;
								var105 += var27;
								var102 += var32;
								var115 += Pix2D.width;
								var107 += var41;
								var108 += var44;
								var109 += var47;
							}
						}
						method40(Pix2D.pixels, var19, var115, var103 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
						var104 += var28;
						var103 += var29;
						var102 += var32;
						var115 += Pix2D.width;
						var107 += var41;
						var108 += var44;
						var109 += var47;
					}
				}
			} else {
				int var116;
				int var117 = var116 = arg5 << 16;
				if (arg2 < 0) {
					var117 -= var28 * arg2;
					var116 -= var29 * arg2;
					var102 -= var32 * arg2;
					arg2 = 0;
				}
				int var118 = arg4 << 16;
				if (arg1 < 0) {
					var118 -= var27 * arg1;
					arg1 = 0;
				}
				int var119 = arg2 - originY;
				int var120 = var39 + var41 * var119;
				int var121 = var42 + var44 * var119;
				int var122 = var45 + var47 * var119;
				if (var28 < var29) {
					int var123 = arg0 - arg1;
					int var124 = arg1 - arg2;
					int var125 = scanline[arg2];
					while (true) {
						var124--;
						if (var124 < 0) {
							while (true) {
								var123--;
								if (var123 < 0) {
									return;
								}
								method40(Pix2D.pixels, var19, var125, var118 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
								var118 += var27;
								var116 += var29;
								var102 += var32;
								var125 += Pix2D.width;
								var120 += var41;
								var121 += var44;
								var122 += var47;
							}
						}
						method40(Pix2D.pixels, var19, var125, var117 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
						var117 += var28;
						var116 += var29;
						var102 += var32;
						var125 += Pix2D.width;
						var120 += var41;
						var121 += var44;
						var122 += var47;
					}
				} else {
					int var126 = arg0 - arg1;
					int var127 = arg1 - arg2;
					int var128 = scanline[arg2];
					while (true) {
						var127--;
						if (var127 < 0) {
							while (true) {
								var126--;
								if (var126 < 0) {
									return;
								}
								method40(Pix2D.pixels, var19, var128, var116 >> 16, var118 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
								var118 += var27;
								var116 += var29;
								var102 += var32;
								var128 += Pix2D.width;
								var120 += var41;
								var121 += var44;
								var122 += var47;
							}
						}
						method40(Pix2D.pixels, var19, var128, var116 >> 16, var117 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
						var117 += var28;
						var116 += var29;
						var102 += var32;
						var128 += Pix2D.width;
						var120 += var41;
						var121 += var44;
						var122 += var47;
					}
				}
			}
		}
	}

	@ObfuscatedName("af.e()V")
	public static void resetOrigin() {
		originX = sizeX / 2;
		originY = sizeY / 2;
		minX = -originX;
		maxX = sizeX - originX;
		minY = -originY;
		maxY = sizeY - originY;
	}

	@ObfuscatedName("af.a(IIIIIIIII)V")
	public static void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = arg4 - arg3;
		int var10 = arg1 - arg0;
		int var11 = arg5 - arg3;
		int var12 = arg2 - arg0;
		int var13 = arg7 - arg6;
		int var14 = arg8 - arg6;
		int var15;
		if (arg2 == arg1) {
			var15 = 0;
		} else {
			var15 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var16;
		if (arg1 == arg0) {
			var16 = 0;
		} else {
			var16 = (var9 << 16) / var10;
		}
		int var17;
		if (arg2 == arg0) {
			var17 = 0;
		} else {
			var17 = (var11 << 16) / var12;
		}
		int var18 = var9 * var12 - var11 * var10;
		if (var18 == 0) {
			return;
		}
		int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
		int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < sizeY) {
				if (arg1 > sizeY) {
					arg1 = sizeY;
				}
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				int var21 = (arg6 << 8) + var19 - var19 * arg3;
				if (arg1 < arg2) {
					int var22;
					int var23 = var22 = arg3 << 16;
					if (arg0 < 0) {
						var23 -= var17 * arg0;
						var22 -= var16 * arg0;
						var21 -= var20 * arg0;
						arg0 = 0;
					}
					int var24 = arg4 << 16;
					if (arg1 < 0) {
						var24 -= var15 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && var17 < var16 || arg0 == arg1 && var17 > var15) {
						int var25 = arg2 - arg1;
						int var26 = arg1 - arg0;
						int var27 = scanline[arg0];
						while (true) {
							var26--;
							if (var26 < 0) {
								while (true) {
									var25--;
									if (var25 < 0) {
										return;
									}
									method28(Pix2D.pixels, var27, var23 >> 16, var24 >> 16, var21, var19);
									var23 += var17;
									var24 += var15;
									var21 += var20;
									var27 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var27, var23 >> 16, var22 >> 16, var21, var19);
							var23 += var17;
							var22 += var16;
							var21 += var20;
							var27 += Pix2D.width;
						}
					} else {
						int var28 = arg2 - arg1;
						int var29 = arg1 - arg0;
						int var30 = scanline[arg0];
						while (true) {
							var29--;
							if (var29 < 0) {
								while (true) {
									var28--;
									if (var28 < 0) {
										return;
									}
									method28(Pix2D.pixels, var30, var24 >> 16, var23 >> 16, var21, var19);
									var23 += var17;
									var24 += var15;
									var21 += var20;
									var30 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var30, var22 >> 16, var23 >> 16, var21, var19);
							var23 += var17;
							var22 += var16;
							var21 += var20;
							var30 += Pix2D.width;
						}
					}
				} else {
					int var31;
					int var32 = var31 = arg3 << 16;
					if (arg0 < 0) {
						var32 -= var17 * arg0;
						var31 -= var16 * arg0;
						var21 -= var20 * arg0;
						arg0 = 0;
					}
					int var33 = arg5 << 16;
					if (arg2 < 0) {
						var33 -= var15 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && var17 < var16 || arg0 == arg2 && var15 > var16) {
						int var34 = arg1 - arg2;
						int var35 = arg2 - arg0;
						int var36 = scanline[arg0];
						while (true) {
							var35--;
							if (var35 < 0) {
								while (true) {
									var34--;
									if (var34 < 0) {
										return;
									}
									method28(Pix2D.pixels, var36, var33 >> 16, var31 >> 16, var21, var19);
									var33 += var15;
									var31 += var16;
									var21 += var20;
									var36 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var36, var32 >> 16, var31 >> 16, var21, var19);
							var32 += var17;
							var31 += var16;
							var21 += var20;
							var36 += Pix2D.width;
						}
					} else {
						int var37 = arg1 - arg2;
						int var38 = arg2 - arg0;
						int var39 = scanline[arg0];
						while (true) {
							var38--;
							if (var38 < 0) {
								while (true) {
									var37--;
									if (var37 < 0) {
										return;
									}
									method28(Pix2D.pixels, var39, var31 >> 16, var33 >> 16, var21, var19);
									var33 += var15;
									var31 += var16;
									var21 += var20;
									var39 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var39, var31 >> 16, var32 >> 16, var21, var19);
							var32 += var17;
							var31 += var16;
							var21 += var20;
							var39 += Pix2D.width;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < sizeY) {
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				if (arg0 > sizeY) {
					arg0 = sizeY;
				}
				int var40 = (arg7 << 8) + var19 - var19 * arg4;
				if (arg2 < arg0) {
					int var41;
					int var42 = var41 = arg4 << 16;
					if (arg1 < 0) {
						var42 -= var16 * arg1;
						var41 -= var15 * arg1;
						var40 -= var20 * arg1;
						arg1 = 0;
					}
					int var43 = arg5 << 16;
					if (arg2 < 0) {
						var43 -= var17 * arg2;
						arg2 = 0;
					}
					if ((arg1 == arg2 || var16 >= var15) && (arg1 != arg2 || var16 <= var17)) {
						int var47 = arg0 - arg2;
						int var48 = arg2 - arg1;
						int var49 = scanline[arg1];
						while (true) {
							var48--;
							if (var48 < 0) {
								while (true) {
									var47--;
									if (var47 < 0) {
										return;
									}
									method28(Pix2D.pixels, var49, var43 >> 16, var42 >> 16, var40, var19);
									var42 += var16;
									var43 += var17;
									var40 += var20;
									var49 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var49, var41 >> 16, var42 >> 16, var40, var19);
							var42 += var16;
							var41 += var15;
							var40 += var20;
							var49 += Pix2D.width;
						}
					} else {
						int var44 = arg0 - arg2;
						int var45 = arg2 - arg1;
						int var46 = scanline[arg1];
						while (true) {
							var45--;
							if (var45 < 0) {
								while (true) {
									var44--;
									if (var44 < 0) {
										return;
									}
									method28(Pix2D.pixels, var46, var42 >> 16, var43 >> 16, var40, var19);
									var42 += var16;
									var43 += var17;
									var40 += var20;
									var46 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var46, var42 >> 16, var41 >> 16, var40, var19);
							var42 += var16;
							var41 += var15;
							var40 += var20;
							var46 += Pix2D.width;
						}
					}
				} else {
					int var50;
					int var51 = var50 = arg4 << 16;
					if (arg1 < 0) {
						var51 -= var16 * arg1;
						var50 -= var15 * arg1;
						var40 -= var20 * arg1;
						arg1 = 0;
					}
					int var52 = arg3 << 16;
					if (arg0 < 0) {
						var52 -= var17 * arg0;
						arg0 = 0;
					}
					if (var16 < var15) {
						int var53 = arg2 - arg0;
						int var54 = arg0 - arg1;
						int var55 = scanline[arg1];
						while (true) {
							var54--;
							if (var54 < 0) {
								while (true) {
									var53--;
									if (var53 < 0) {
										return;
									}
									method28(Pix2D.pixels, var55, var52 >> 16, var50 >> 16, var40, var19);
									var52 += var17;
									var50 += var15;
									var40 += var20;
									var55 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var55, var51 >> 16, var50 >> 16, var40, var19);
							var51 += var16;
							var50 += var15;
							var40 += var20;
							var55 += Pix2D.width;
						}
					} else {
						int var56 = arg2 - arg0;
						int var57 = arg0 - arg1;
						int var58 = scanline[arg1];
						while (true) {
							var57--;
							if (var57 < 0) {
								while (true) {
									var56--;
									if (var56 < 0) {
										return;
									}
									method28(Pix2D.pixels, var58, var50 >> 16, var52 >> 16, var40, var19);
									var52 += var17;
									var50 += var15;
									var40 += var20;
									var58 += Pix2D.width;
								}
							}
							method28(Pix2D.pixels, var58, var50 >> 16, var51 >> 16, var40, var19);
							var51 += var16;
							var50 += var15;
							var40 += var20;
							var58 += Pix2D.width;
						}
					}
				}
			}
		} else if (arg2 < sizeY) {
			if (arg0 > sizeY) {
				arg0 = sizeY;
			}
			if (arg1 > sizeY) {
				arg1 = sizeY;
			}
			int var59 = (arg8 << 8) + var19 - var19 * arg5;
			if (arg0 < arg1) {
				int var60;
				int var61 = var60 = arg5 << 16;
				if (arg2 < 0) {
					var61 -= var15 * arg2;
					var60 -= var17 * arg2;
					var59 -= var20 * arg2;
					arg2 = 0;
				}
				int var62 = arg3 << 16;
				if (arg0 < 0) {
					var62 -= var16 * arg0;
					arg0 = 0;
				}
				if (var15 < var17) {
					int var63 = arg1 - arg0;
					int var64 = arg0 - arg2;
					int var65 = scanline[arg2];
					while (true) {
						var64--;
						if (var64 < 0) {
							while (true) {
								var63--;
								if (var63 < 0) {
									return;
								}
								method28(Pix2D.pixels, var65, var61 >> 16, var62 >> 16, var59, var19);
								var61 += var15;
								var62 += var16;
								var59 += var20;
								var65 += Pix2D.width;
							}
						}
						method28(Pix2D.pixels, var65, var61 >> 16, var60 >> 16, var59, var19);
						var61 += var15;
						var60 += var17;
						var59 += var20;
						var65 += Pix2D.width;
					}
				} else {
					int var66 = arg1 - arg0;
					int var67 = arg0 - arg2;
					int var68 = scanline[arg2];
					while (true) {
						var67--;
						if (var67 < 0) {
							while (true) {
								var66--;
								if (var66 < 0) {
									return;
								}
								method28(Pix2D.pixels, var68, var62 >> 16, var61 >> 16, var59, var19);
								var61 += var15;
								var62 += var16;
								var59 += var20;
								var68 += Pix2D.width;
							}
						}
						method28(Pix2D.pixels, var68, var60 >> 16, var61 >> 16, var59, var19);
						var61 += var15;
						var60 += var17;
						var59 += var20;
						var68 += Pix2D.width;
					}
				}
			} else {
				int var69;
				int var70 = var69 = arg5 << 16;
				if (arg2 < 0) {
					var70 -= var15 * arg2;
					var69 -= var17 * arg2;
					var59 -= var20 * arg2;
					arg2 = 0;
				}
				int var71 = arg4 << 16;
				if (arg1 < 0) {
					var71 -= var16 * arg1;
					arg1 = 0;
				}
				if (var15 < var17) {
					int var72 = arg0 - arg1;
					int var73 = arg1 - arg2;
					int var74 = scanline[arg2];
					while (true) {
						var73--;
						if (var73 < 0) {
							while (true) {
								var72--;
								if (var72 < 0) {
									return;
								}
								method28(Pix2D.pixels, var74, var71 >> 16, var69 >> 16, var59, var19);
								var71 += var16;
								var69 += var17;
								var59 += var20;
								var74 += Pix2D.width;
							}
						}
						method28(Pix2D.pixels, var74, var70 >> 16, var69 >> 16, var59, var19);
						var70 += var15;
						var69 += var17;
						var59 += var20;
						var74 += Pix2D.width;
					}
				} else {
					int var75 = arg0 - arg1;
					int var76 = arg1 - arg2;
					int var77 = scanline[arg2];
					while (true) {
						var76--;
						if (var76 < 0) {
							while (true) {
								var75--;
								if (var75 < 0) {
									return;
								}
								method28(Pix2D.pixels, var77, var69 >> 16, var71 >> 16, var59, var19);
								var71 += var16;
								var69 += var17;
								var59 += var20;
								var77 += Pix2D.width;
							}
						}
						method28(Pix2D.pixels, var77, var69 >> 16, var70 >> 16, var59, var19);
						var70 += var15;
						var69 += var17;
						var59 += var20;
						var77 += Pix2D.width;
					}
				}
			}
		}
	}

	@ObfuscatedName("af.e(IIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		sizeX = arg2 - arg0;
		sizeY = arg3 - arg1;
		resetOrigin();
		if (scanline.length < sizeY) {
			scanline = new int[MathTool.method342(sizeY)];
		}
		int var4 = arg1 * Pix2D.width + arg0;
		for (int var5 = 0; var5 < sizeY; var5++) {
			scanline[var5] = var4;
			var4 += Pix2D.width;
		}
	}

	@ObfuscatedName("af.a([IIIIII)V")
	public static void method35(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field117) {
			if (arg4 > sizeX) {
				arg4 = sizeX;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		int var5 = arg1 + arg3;
		int var6 = arg4 - arg3 >> 2;
		if (field128 == 0) {
			while (true) {
				var6--;
				if (var6 < 0) {
					int var7 = arg4 - arg3 & 0x3;
					while (true) {
						var7--;
						if (var7 < 0) {
							return;
						}
						arg0[var5++] = arg2;
					}
				}
				arg0[var5++] = arg2;
				arg0[var5++] = arg2;
				arg0[var5++] = arg2;
				arg0[var5++] = arg2;
			}
		} else if (field128 == 254) {
			while (true) {
				var6--;
				if (var6 < 0) {
					int var8 = arg4 - arg3 & 0x3;
					while (true) {
						var8--;
						if (var8 < 0) {
							return;
						}
						arg0[var5++] = arg0[var5];
					}
				}
				arg0[var5++] = arg0[var5];
				arg0[var5++] = arg0[var5];
				arg0[var5++] = arg0[var5];
				arg0[var5++] = arg0[var5];
			}
		} else {
			int var9 = field128;
			int var10 = 256 - field128;
			int var11 = ((arg2 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var10 >> 8 & 0xFF00);
			while (true) {
				var6--;
				if (var6 < 0) {
					int var16 = arg4 - arg3 & 0x3;
					while (true) {
						var16--;
						if (var16 < 0) {
							return;
						}
						int var17 = arg0[var5];
						arg0[var5++] = var11 + ((var17 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((var17 & 0xFF00) * var9 >> 8 & 0xFF00);
					}
				}
				int var12 = arg0[var5];
				arg0[var5++] = var11 + ((var12 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var9 >> 8 & 0xFF00);
				int var13 = arg0[var5];
				arg0[var5++] = var11 + ((var13 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((var13 & 0xFF00) * var9 >> 8 & 0xFF00);
				int var14 = arg0[var5];
				arg0[var5++] = var11 + ((var14 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((var14 & 0xFF00) * var9 >> 8 & 0xFF00);
				int var15 = arg0[var5];
				arg0[var5++] = var11 + ((var15 & 0xFF00FF) * var9 >> 8 & 0xFF00FF) + ((var15 & 0xFF00) * var9 >> 8 & 0xFF00);
			}
		}
	}

	@ObfuscatedName("af.f()V")
	public static void setRenderClipping() {
		setClipping(Pix2D.clipMinX, Pix2D.clipMinY, Pix2D.clipMaxX, Pix2D.clipMaxY);
	}

	@ObfuscatedName("af.a(ID)I")
	public static int gammaCorrect(int arg0, double arg1) {
		double var3 = (double) (arg0 >> 16) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg0 & 0xFF) / 256.0D;
		double var9 = Math.pow(var3, arg1);
		double var11 = Math.pow(var5, arg1);
		double var13 = Math.pow(var7, arg1);
		int var15 = (int) (var9 * 256.0D);
		int var16 = (int) (var11 * 256.0D);
		int var17 = (int) (var13 * 256.0D);
		return (var15 << 16) + (var16 << 8) + var17;
	}

	@ObfuscatedName("af.a(IIIIIII)V")
	public static void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		if (arg1 != arg0) {
			var7 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var8 = 0;
		if (arg2 != arg1) {
			var8 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var9 = 0;
		if (arg2 != arg0) {
			var9 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < sizeY) {
				if (arg1 > sizeY) {
					arg1 = sizeY;
				}
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				if (arg1 < arg2) {
					int var10;
					int var11 = var10 = arg3 << 16;
					if (arg0 < 0) {
						var11 -= var9 * arg0;
						var10 -= var7 * arg0;
						arg0 = 0;
					}
					int var12 = arg4 << 16;
					if (arg1 < 0) {
						var12 -= var8 * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && var9 < var7 || arg0 == arg1 && var9 > var8) {
						int var13 = arg2 - arg1;
						int var14 = arg1 - arg0;
						int var15 = scanline[arg0];
						while (true) {
							var14--;
							if (var14 < 0) {
								while (true) {
									var13--;
									if (var13 < 0) {
										return;
									}
									method35(Pix2D.pixels, var15, arg6, var11 >> 16, var12 >> 16);
									var11 += var9;
									var12 += var8;
									var15 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var15, arg6, var11 >> 16, var10 >> 16);
							var11 += var9;
							var10 += var7;
							var15 += Pix2D.width;
						}
					} else {
						int var16 = arg2 - arg1;
						int var17 = arg1 - arg0;
						int var18 = scanline[arg0];
						while (true) {
							var17--;
							if (var17 < 0) {
								while (true) {
									var16--;
									if (var16 < 0) {
										return;
									}
									method35(Pix2D.pixels, var18, arg6, var12 >> 16, var11 >> 16);
									var11 += var9;
									var12 += var8;
									var18 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var18, arg6, var10 >> 16, var11 >> 16);
							var11 += var9;
							var10 += var7;
							var18 += Pix2D.width;
						}
					}
				} else {
					int var19;
					int var20 = var19 = arg3 << 16;
					if (arg0 < 0) {
						var20 -= var9 * arg0;
						var19 -= var7 * arg0;
						arg0 = 0;
					}
					int var21 = arg5 << 16;
					if (arg2 < 0) {
						var21 -= var8 * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && var9 < var7 || arg0 == arg2 && var8 > var7) {
						int var22 = arg1 - arg2;
						int var23 = arg2 - arg0;
						int var24 = scanline[arg0];
						while (true) {
							var23--;
							if (var23 < 0) {
								while (true) {
									var22--;
									if (var22 < 0) {
										return;
									}
									method35(Pix2D.pixels, var24, arg6, var21 >> 16, var19 >> 16);
									var21 += var8;
									var19 += var7;
									var24 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var24, arg6, var20 >> 16, var19 >> 16);
							var20 += var9;
							var19 += var7;
							var24 += Pix2D.width;
						}
					} else {
						int var25 = arg1 - arg2;
						int var26 = arg2 - arg0;
						int var27 = scanline[arg0];
						while (true) {
							var26--;
							if (var26 < 0) {
								while (true) {
									var25--;
									if (var25 < 0) {
										return;
									}
									method35(Pix2D.pixels, var27, arg6, var19 >> 16, var21 >> 16);
									var21 += var8;
									var19 += var7;
									var27 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var27, arg6, var19 >> 16, var20 >> 16);
							var20 += var9;
							var19 += var7;
							var27 += Pix2D.width;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < sizeY) {
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				if (arg0 > sizeY) {
					arg0 = sizeY;
				}
				if (arg2 < arg0) {
					int var28;
					int var29 = var28 = arg4 << 16;
					if (arg1 < 0) {
						var29 -= var7 * arg1;
						var28 -= var8 * arg1;
						arg1 = 0;
					}
					int var30 = arg5 << 16;
					if (arg2 < 0) {
						var30 -= var9 * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && var7 < var8 || arg1 == arg2 && var7 > var9) {
						int var31 = arg0 - arg2;
						int var32 = arg2 - arg1;
						int var33 = scanline[arg1];
						while (true) {
							var32--;
							if (var32 < 0) {
								while (true) {
									var31--;
									if (var31 < 0) {
										return;
									}
									method35(Pix2D.pixels, var33, arg6, var29 >> 16, var30 >> 16);
									var29 += var7;
									var30 += var9;
									var33 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var33, arg6, var29 >> 16, var28 >> 16);
							var29 += var7;
							var28 += var8;
							var33 += Pix2D.width;
						}
					} else {
						int var34 = arg0 - arg2;
						int var35 = arg2 - arg1;
						int var36 = scanline[arg1];
						while (true) {
							var35--;
							if (var35 < 0) {
								while (true) {
									var34--;
									if (var34 < 0) {
										return;
									}
									method35(Pix2D.pixels, var36, arg6, var30 >> 16, var29 >> 16);
									var29 += var7;
									var30 += var9;
									var36 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var36, arg6, var28 >> 16, var29 >> 16);
							var29 += var7;
							var28 += var8;
							var36 += Pix2D.width;
						}
					}
				} else {
					int var37;
					int var38 = var37 = arg4 << 16;
					if (arg1 < 0) {
						var38 -= var7 * arg1;
						var37 -= var8 * arg1;
						arg1 = 0;
					}
					int var39 = arg3 << 16;
					if (arg0 < 0) {
						var39 -= var9 * arg0;
						arg0 = 0;
					}
					if (var7 < var8) {
						int var40 = arg2 - arg0;
						int var41 = arg0 - arg1;
						int var42 = scanline[arg1];
						while (true) {
							var41--;
							if (var41 < 0) {
								while (true) {
									var40--;
									if (var40 < 0) {
										return;
									}
									method35(Pix2D.pixels, var42, arg6, var39 >> 16, var37 >> 16);
									var39 += var9;
									var37 += var8;
									var42 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var42, arg6, var38 >> 16, var37 >> 16);
							var38 += var7;
							var37 += var8;
							var42 += Pix2D.width;
						}
					} else {
						int var43 = arg2 - arg0;
						int var44 = arg0 - arg1;
						int var45 = scanline[arg1];
						while (true) {
							var44--;
							if (var44 < 0) {
								while (true) {
									var43--;
									if (var43 < 0) {
										return;
									}
									method35(Pix2D.pixels, var45, arg6, var37 >> 16, var39 >> 16);
									var39 += var9;
									var37 += var8;
									var45 += Pix2D.width;
								}
							}
							method35(Pix2D.pixels, var45, arg6, var37 >> 16, var38 >> 16);
							var38 += var7;
							var37 += var8;
							var45 += Pix2D.width;
						}
					}
				}
			}
		} else if (arg2 < sizeY) {
			if (arg0 > sizeY) {
				arg0 = sizeY;
			}
			if (arg1 > sizeY) {
				arg1 = sizeY;
			}
			if (arg0 < arg1) {
				int var46;
				int var47 = var46 = arg5 << 16;
				if (arg2 < 0) {
					var47 -= var8 * arg2;
					var46 -= var9 * arg2;
					arg2 = 0;
				}
				int var48 = arg3 << 16;
				if (arg0 < 0) {
					var48 -= var7 * arg0;
					arg0 = 0;
				}
				if (var8 < var9) {
					int var49 = arg1 - arg0;
					int var50 = arg0 - arg2;
					int var51 = scanline[arg2];
					while (true) {
						var50--;
						if (var50 < 0) {
							while (true) {
								var49--;
								if (var49 < 0) {
									return;
								}
								method35(Pix2D.pixels, var51, arg6, var47 >> 16, var48 >> 16);
								var47 += var8;
								var48 += var7;
								var51 += Pix2D.width;
							}
						}
						method35(Pix2D.pixels, var51, arg6, var47 >> 16, var46 >> 16);
						var47 += var8;
						var46 += var9;
						var51 += Pix2D.width;
					}
				} else {
					int var52 = arg1 - arg0;
					int var53 = arg0 - arg2;
					int var54 = scanline[arg2];
					while (true) {
						var53--;
						if (var53 < 0) {
							while (true) {
								var52--;
								if (var52 < 0) {
									return;
								}
								method35(Pix2D.pixels, var54, arg6, var48 >> 16, var47 >> 16);
								var47 += var8;
								var48 += var7;
								var54 += Pix2D.width;
							}
						}
						method35(Pix2D.pixels, var54, arg6, var46 >> 16, var47 >> 16);
						var47 += var8;
						var46 += var9;
						var54 += Pix2D.width;
					}
				}
			} else {
				int var55;
				int var56 = var55 = arg5 << 16;
				if (arg2 < 0) {
					var56 -= var8 * arg2;
					var55 -= var9 * arg2;
					arg2 = 0;
				}
				int var57 = arg4 << 16;
				if (arg1 < 0) {
					var57 -= var7 * arg1;
					arg1 = 0;
				}
				if (var8 < var9) {
					int var58 = arg0 - arg1;
					int var59 = arg1 - arg2;
					int var60 = scanline[arg2];
					while (true) {
						var59--;
						if (var59 < 0) {
							while (true) {
								var58--;
								if (var58 < 0) {
									return;
								}
								method35(Pix2D.pixels, var60, arg6, var57 >> 16, var55 >> 16);
								var57 += var7;
								var55 += var9;
								var60 += Pix2D.width;
							}
						}
						method35(Pix2D.pixels, var60, arg6, var56 >> 16, var55 >> 16);
						var56 += var8;
						var55 += var9;
						var60 += Pix2D.width;
					}
				} else {
					int var61 = arg0 - arg1;
					int var62 = arg1 - arg2;
					int var63 = scanline[arg2];
					while (true) {
						var62--;
						if (var62 < 0) {
							while (true) {
								var61--;
								if (var61 < 0) {
									return;
								}
								method35(Pix2D.pixels, var63, arg6, var55 >> 16, var57 >> 16);
								var57 += var7;
								var55 += var9;
								var63 += Pix2D.width;
							}
						}
						method35(Pix2D.pixels, var63, arg6, var55 >> 16, var56 >> 16);
						var56 += var8;
						var55 += var9;
						var63 += Pix2D.width;
					}
				}
			}
		}
	}

	@ObfuscatedName("af.b(IIIIIIIIIIIIIIIIIII)V")
	public static void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		int[] var19 = field126.getTexels(arg18);
		if (var19 == null) {
			int var20 = field126.getAverageRgb(arg18);
			method33(arg0, arg1, arg2, arg3, arg4, arg5, textureLightColour(var20, arg6), textureLightColour(var20, arg7), textureLightColour(var20, arg8));
			return;
		}
		field122 = field126.isLowMem(arg18);
		field120 = field126.isOpaque(arg18);
		int var21 = arg4 - arg3;
		int var22 = arg1 - arg0;
		int var23 = arg5 - arg3;
		int var24 = arg2 - arg0;
		int var25 = arg7 - arg6;
		int var26 = arg8 - arg6;
		int var27 = 0;
		if (arg1 != arg0) {
			var27 = (arg4 - arg3 << 16) / (arg1 - arg0);
		}
		int var28 = 0;
		if (arg2 != arg1) {
			var28 = (arg5 - arg4 << 16) / (arg2 - arg1);
		}
		int var29 = 0;
		if (arg2 != arg0) {
			var29 = (arg3 - arg5 << 16) / (arg0 - arg2);
		}
		int var30 = var21 * var24 - var23 * var22;
		if (var30 == 0) {
			return;
		}
		int var31 = (var25 * var24 - var26 * var22 << 9) / var30;
		int var32 = (var26 * var21 - var25 * var23 << 9) / var30;
		int var33 = arg9 - arg10;
		int var34 = arg12 - arg13;
		int var35 = arg15 - arg16;
		int var36 = arg11 - arg9;
		int var37 = arg14 - arg12;
		int var38 = arg17 - arg15;
		int var39 = var36 * arg12 - var37 * arg9 << 14;
		int var40 = var37 * arg15 - var38 * arg12 << 8;
		int var41 = var38 * arg9 - var36 * arg15 << 5;
		int var42 = var33 * arg12 - var34 * arg9 << 14;
		int var43 = var34 * arg15 - var35 * arg12 << 8;
		int var44 = var35 * arg9 - var33 * arg15 << 5;
		int var45 = var34 * var36 - var33 * var37 << 14;
		int var46 = var35 * var37 - var34 * var38 << 8;
		int var47 = var33 * var38 - var35 * var36 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < sizeY) {
				if (arg1 > sizeY) {
					arg1 = sizeY;
				}
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				int var48 = (arg6 << 9) + var31 - var31 * arg3;
				if (arg1 < arg2) {
					int var49;
					int var50 = var49 = arg3 << 16;
					if (arg0 < 0) {
						var50 -= var29 * arg0;
						var49 -= var27 * arg0;
						var48 -= var32 * arg0;
						arg0 = 0;
					}
					int var51 = arg4 << 16;
					if (arg1 < 0) {
						var51 -= var28 * arg1;
						arg1 = 0;
					}
					int var52 = arg0 - originY;
					int var53 = var39 + var41 * var52;
					int var54 = var42 + var44 * var52;
					int var55 = var45 + var47 * var52;
					if (arg0 != arg1 && var29 < var27 || arg0 == arg1 && var29 > var28) {
						int var56 = arg2 - arg1;
						int var57 = arg1 - arg0;
						int var58 = scanline[arg0];
						while (true) {
							var57--;
							if (var57 < 0) {
								while (true) {
									var56--;
									if (var56 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var58, var50 >> 16, var51 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
									var50 += var29;
									var51 += var28;
									var48 += var32;
									var58 += Pix2D.width;
									var53 += var41;
									var54 += var44;
									var55 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var58, var50 >> 16, var49 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
							var50 += var29;
							var49 += var27;
							var48 += var32;
							var58 += Pix2D.width;
							var53 += var41;
							var54 += var44;
							var55 += var47;
						}
					} else {
						int var59 = arg2 - arg1;
						int var60 = arg1 - arg0;
						int var61 = scanline[arg0];
						while (true) {
							var60--;
							if (var60 < 0) {
								while (true) {
									var59--;
									if (var59 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var61, var51 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
									var50 += var29;
									var51 += var28;
									var48 += var32;
									var61 += Pix2D.width;
									var53 += var41;
									var54 += var44;
									var55 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var61, var49 >> 16, var50 >> 16, var48, var31, var53, var54, var55, var40, var43, var46);
							var50 += var29;
							var49 += var27;
							var48 += var32;
							var61 += Pix2D.width;
							var53 += var41;
							var54 += var44;
							var55 += var47;
						}
					}
				} else {
					int var62;
					int var63 = var62 = arg3 << 16;
					if (arg0 < 0) {
						var63 -= var29 * arg0;
						var62 -= var27 * arg0;
						var48 -= var32 * arg0;
						arg0 = 0;
					}
					int var64 = arg5 << 16;
					if (arg2 < 0) {
						var64 -= var28 * arg2;
						arg2 = 0;
					}
					int var65 = arg0 - originY;
					int var66 = var39 + var41 * var65;
					int var67 = var42 + var44 * var65;
					int var68 = var45 + var47 * var65;
					if ((arg0 == arg2 || var29 >= var27) && (arg0 != arg2 || var28 <= var27)) {
						int var72 = arg1 - arg2;
						int var73 = arg2 - arg0;
						int var74 = scanline[arg0];
						while (true) {
							var73--;
							if (var73 < 0) {
								while (true) {
									var72--;
									if (var72 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var74, var62 >> 16, var64 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
									var64 += var28;
									var62 += var27;
									var48 += var32;
									var74 += Pix2D.width;
									var66 += var41;
									var67 += var44;
									var68 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var74, var62 >> 16, var63 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
							var63 += var29;
							var62 += var27;
							var48 += var32;
							var74 += Pix2D.width;
							var66 += var41;
							var67 += var44;
							var68 += var47;
						}
					} else {
						int var69 = arg1 - arg2;
						int var70 = arg2 - arg0;
						int var71 = scanline[arg0];
						while (true) {
							var70--;
							if (var70 < 0) {
								while (true) {
									var69--;
									if (var69 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var71, var64 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
									var64 += var28;
									var62 += var27;
									var48 += var32;
									var71 += Pix2D.width;
									var66 += var41;
									var67 += var44;
									var68 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var71, var63 >> 16, var62 >> 16, var48, var31, var66, var67, var68, var40, var43, var46);
							var63 += var29;
							var62 += var27;
							var48 += var32;
							var71 += Pix2D.width;
							var66 += var41;
							var67 += var44;
							var68 += var47;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < sizeY) {
				if (arg2 > sizeY) {
					arg2 = sizeY;
				}
				if (arg0 > sizeY) {
					arg0 = sizeY;
				}
				int var75 = (arg7 << 9) + var31 - var31 * arg4;
				if (arg2 < arg0) {
					int var76;
					int var77 = var76 = arg4 << 16;
					if (arg1 < 0) {
						var77 -= var27 * arg1;
						var76 -= var28 * arg1;
						var75 -= var32 * arg1;
						arg1 = 0;
					}
					int var78 = arg5 << 16;
					if (arg2 < 0) {
						var78 -= var29 * arg2;
						arg2 = 0;
					}
					int var79 = arg1 - originY;
					int var80 = var39 + var41 * var79;
					int var81 = var42 + var44 * var79;
					int var82 = var45 + var47 * var79;
					if (arg1 != arg2 && var27 < var28 || arg1 == arg2 && var27 > var29) {
						int var83 = arg0 - arg2;
						int var84 = arg2 - arg1;
						int var85 = scanline[arg1];
						while (true) {
							var84--;
							if (var84 < 0) {
								while (true) {
									var83--;
									if (var83 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var85, var77 >> 16, var78 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
									var77 += var27;
									var78 += var29;
									var75 += var32;
									var85 += Pix2D.width;
									var80 += var41;
									var81 += var44;
									var82 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var85, var77 >> 16, var76 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
							var77 += var27;
							var76 += var28;
							var75 += var32;
							var85 += Pix2D.width;
							var80 += var41;
							var81 += var44;
							var82 += var47;
						}
					} else {
						int var86 = arg0 - arg2;
						int var87 = arg2 - arg1;
						int var88 = scanline[arg1];
						while (true) {
							var87--;
							if (var87 < 0) {
								while (true) {
									var86--;
									if (var86 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var88, var78 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
									var77 += var27;
									var78 += var29;
									var75 += var32;
									var88 += Pix2D.width;
									var80 += var41;
									var81 += var44;
									var82 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var88, var76 >> 16, var77 >> 16, var75, var31, var80, var81, var82, var40, var43, var46);
							var77 += var27;
							var76 += var28;
							var75 += var32;
							var88 += Pix2D.width;
							var80 += var41;
							var81 += var44;
							var82 += var47;
						}
					}
				} else {
					int var89;
					int var90 = var89 = arg4 << 16;
					if (arg1 < 0) {
						var90 -= var27 * arg1;
						var89 -= var28 * arg1;
						var75 -= var32 * arg1;
						arg1 = 0;
					}
					int var91 = arg3 << 16;
					if (arg0 < 0) {
						var91 -= var29 * arg0;
						arg0 = 0;
					}
					int var92 = arg1 - originY;
					int var93 = var39 + var41 * var92;
					int var94 = var42 + var44 * var92;
					int var95 = var45 + var47 * var92;
					if (var27 < var28) {
						int var96 = arg2 - arg0;
						int var97 = arg0 - arg1;
						int var98 = scanline[arg1];
						while (true) {
							var97--;
							if (var97 < 0) {
								while (true) {
									var96--;
									if (var96 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var98, var91 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
									var91 += var29;
									var89 += var28;
									var75 += var32;
									var98 += Pix2D.width;
									var93 += var41;
									var94 += var44;
									var95 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var98, var90 >> 16, var89 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
							var90 += var27;
							var89 += var28;
							var75 += var32;
							var98 += Pix2D.width;
							var93 += var41;
							var94 += var44;
							var95 += var47;
						}
					} else {
						int var99 = arg2 - arg0;
						int var100 = arg0 - arg1;
						int var101 = scanline[arg1];
						while (true) {
							var100--;
							if (var100 < 0) {
								while (true) {
									var99--;
									if (var99 < 0) {
										return;
									}
									method27(Pix2D.pixels, var19, var101, var89 >> 16, var91 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
									var91 += var29;
									var89 += var28;
									var75 += var32;
									var101 += Pix2D.width;
									var93 += var41;
									var94 += var44;
									var95 += var47;
								}
							}
							method27(Pix2D.pixels, var19, var101, var89 >> 16, var90 >> 16, var75, var31, var93, var94, var95, var40, var43, var46);
							var90 += var27;
							var89 += var28;
							var75 += var32;
							var101 += Pix2D.width;
							var93 += var41;
							var94 += var44;
							var95 += var47;
						}
					}
				}
			}
		} else if (arg2 < sizeY) {
			if (arg0 > sizeY) {
				arg0 = sizeY;
			}
			if (arg1 > sizeY) {
				arg1 = sizeY;
			}
			int var102 = (arg8 << 9) + var31 - var31 * arg5;
			if (arg0 < arg1) {
				int var103;
				int var104 = var103 = arg5 << 16;
				if (arg2 < 0) {
					var104 -= var28 * arg2;
					var103 -= var29 * arg2;
					var102 -= var32 * arg2;
					arg2 = 0;
				}
				int var105 = arg3 << 16;
				if (arg0 < 0) {
					var105 -= var27 * arg0;
					arg0 = 0;
				}
				int var106 = arg2 - originY;
				int var107 = var39 + var41 * var106;
				int var108 = var42 + var44 * var106;
				int var109 = var45 + var47 * var106;
				if (var28 < var29) {
					int var110 = arg1 - arg0;
					int var111 = arg0 - arg2;
					int var112 = scanline[arg2];
					while (true) {
						var111--;
						if (var111 < 0) {
							while (true) {
								var110--;
								if (var110 < 0) {
									return;
								}
								method27(Pix2D.pixels, var19, var112, var104 >> 16, var105 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
								var104 += var28;
								var105 += var27;
								var102 += var32;
								var112 += Pix2D.width;
								var107 += var41;
								var108 += var44;
								var109 += var47;
							}
						}
						method27(Pix2D.pixels, var19, var112, var104 >> 16, var103 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
						var104 += var28;
						var103 += var29;
						var102 += var32;
						var112 += Pix2D.width;
						var107 += var41;
						var108 += var44;
						var109 += var47;
					}
				} else {
					int var113 = arg1 - arg0;
					int var114 = arg0 - arg2;
					int var115 = scanline[arg2];
					while (true) {
						var114--;
						if (var114 < 0) {
							while (true) {
								var113--;
								if (var113 < 0) {
									return;
								}
								method27(Pix2D.pixels, var19, var115, var105 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
								var104 += var28;
								var105 += var27;
								var102 += var32;
								var115 += Pix2D.width;
								var107 += var41;
								var108 += var44;
								var109 += var47;
							}
						}
						method27(Pix2D.pixels, var19, var115, var103 >> 16, var104 >> 16, var102, var31, var107, var108, var109, var40, var43, var46);
						var104 += var28;
						var103 += var29;
						var102 += var32;
						var115 += Pix2D.width;
						var107 += var41;
						var108 += var44;
						var109 += var47;
					}
				}
			} else {
				int var116;
				int var117 = var116 = arg5 << 16;
				if (arg2 < 0) {
					var117 -= var28 * arg2;
					var116 -= var29 * arg2;
					var102 -= var32 * arg2;
					arg2 = 0;
				}
				int var118 = arg4 << 16;
				if (arg1 < 0) {
					var118 -= var27 * arg1;
					arg1 = 0;
				}
				int var119 = arg2 - originY;
				int var120 = var39 + var41 * var119;
				int var121 = var42 + var44 * var119;
				int var122 = var45 + var47 * var119;
				if (var28 < var29) {
					int var123 = arg0 - arg1;
					int var124 = arg1 - arg2;
					int var125 = scanline[arg2];
					while (true) {
						var124--;
						if (var124 < 0) {
							while (true) {
								var123--;
								if (var123 < 0) {
									return;
								}
								method27(Pix2D.pixels, var19, var125, var118 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
								var118 += var27;
								var116 += var29;
								var102 += var32;
								var125 += Pix2D.width;
								var120 += var41;
								var121 += var44;
								var122 += var47;
							}
						}
						method27(Pix2D.pixels, var19, var125, var117 >> 16, var116 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
						var117 += var28;
						var116 += var29;
						var102 += var32;
						var125 += Pix2D.width;
						var120 += var41;
						var121 += var44;
						var122 += var47;
					}
				} else {
					int var126 = arg0 - arg1;
					int var127 = arg1 - arg2;
					int var128 = scanline[arg2];
					while (true) {
						var127--;
						if (var127 < 0) {
							while (true) {
								var126--;
								if (var126 < 0) {
									return;
								}
								method27(Pix2D.pixels, var19, var128, var116 >> 16, var118 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
								var118 += var27;
								var116 += var29;
								var102 += var32;
								var128 += Pix2D.width;
								var120 += var41;
								var121 += var44;
								var122 += var47;
							}
						}
						method27(Pix2D.pixels, var19, var128, var116 >> 16, var117 >> 16, var102, var31, var120, var121, var122, var40, var43, var46);
						var117 += var28;
						var116 += var29;
						var102 += var32;
						var128 += Pix2D.width;
						var120 += var41;
						var121 += var44;
						var122 += var47;
					}
				}
			}
		}
	}

	@ObfuscatedName("af.b([I[IIIIIIIIIIIIII)V")
	public static void method40(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
		if (field117) {
			if (arg4 > sizeX) {
				arg4 = sizeX;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
		}
		if (arg3 >= arg4) {
			return;
		}
		int var13 = arg2 + arg3;
		int var14 = arg5 + arg6 * arg3;
		int var15 = arg4 - arg3;
		if (!field122) {
			int var68 = arg3 - originX;
			int var69 = arg7 + arg10 * var68;
			int var70 = arg8 + arg11 * var68;
			int var71 = arg9 + arg12 * var68;
			int var72 = var71 >> 14;
			int var73;
			int var74;
			if (var72 == 0) {
				var73 = 0;
				var74 = 0;
			} else {
				var73 = var69 / var72;
				var74 = var70 / var72;
			}
			int var75 = var69 + arg10 * var15;
			int var76 = var70 + arg11 * var15;
			int var77 = var71 + arg12 * var15;
			int var78 = var77 >> 14;
			int var79;
			int var80;
			if (var78 == 0) {
				var79 = 0;
				var80 = 0;
			} else {
				var79 = var75 / var78;
				var80 = var76 / var78;
			}
			int var81 = (var73 << 18) + var74;
			int var82 = ((var79 - var73) / var15 << 18) + (var80 - var74) / var15;
			int var83 = var15 >> 3;
			int var84 = arg6 << 3;
			int var85 = var14 >> 8;
			if (field120) {
				if (var83 > 0) {
					do {
						int var86 = arg1[(var81 & 0x3F80) + (var81 >>> 25)];
						arg0[var13++] = ((var86 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var86 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var87 = var81 + var82;
						int var88 = arg1[(var87 & 0x3F80) + (var87 >>> 25)];
						arg0[var13++] = ((var88 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var88 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var89 = var87 + var82;
						int var90 = arg1[(var89 & 0x3F80) + (var89 >>> 25)];
						arg0[var13++] = ((var90 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var90 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var91 = var89 + var82;
						int var92 = arg1[(var91 & 0x3F80) + (var91 >>> 25)];
						arg0[var13++] = ((var92 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var92 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var93 = var91 + var82;
						int var94 = arg1[(var93 & 0x3F80) + (var93 >>> 25)];
						arg0[var13++] = ((var94 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var94 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var95 = var93 + var82;
						int var96 = arg1[(var95 & 0x3F80) + (var95 >>> 25)];
						arg0[var13++] = ((var96 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var96 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var97 = var95 + var82;
						int var98 = arg1[(var97 & 0x3F80) + (var97 >>> 25)];
						arg0[var13++] = ((var98 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var98 & 0xFF00) * var85 & 0xFF0000) >> 8;
						int var99 = var97 + var82;
						int var100 = arg1[(var99 & 0x3F80) + (var99 >>> 25)];
						arg0[var13++] = ((var100 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var100 & 0xFF00) * var85 & 0xFF0000) >> 8;
						var81 = var99 + var82;
						var14 += var84;
						var85 = var14 >> 8;
						var83--;
					} while (var83 > 0);
				}
				int var101 = arg4 - arg3 & 0x7;
				if (var101 > 0) {
					do {
						int var102 = arg1[(var81 & 0x3F80) + (var81 >>> 25)];
						arg0[var13++] = ((var102 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var102 & 0xFF00) * var85 & 0xFF0000) >> 8;
						var81 += var82;
						var101--;
					} while (var101 > 0);
					return;
				}
			} else {
				if (var83 > 0) {
					do {
						int var103;
						if ((var103 = arg1[(var81 & 0x3F80) + (var81 >>> 25)]) != 0) {
							arg0[var13] = ((var103 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var103 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var104 = var81 + var82;
						int var105;
						if ((var105 = arg1[(var104 & 0x3F80) + (var104 >>> 25)]) != 0) {
							arg0[var13] = ((var105 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var105 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var106 = var104 + var82;
						int var107;
						if ((var107 = arg1[(var106 & 0x3F80) + (var106 >>> 25)]) != 0) {
							arg0[var13] = ((var107 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var107 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var108 = var106 + var82;
						int var109;
						if ((var109 = arg1[(var108 & 0x3F80) + (var108 >>> 25)]) != 0) {
							arg0[var13] = ((var109 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var109 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var110 = var108 + var82;
						int var111;
						if ((var111 = arg1[(var110 & 0x3F80) + (var110 >>> 25)]) != 0) {
							arg0[var13] = ((var111 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var111 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var112 = var110 + var82;
						int var113;
						if ((var113 = arg1[(var112 & 0x3F80) + (var112 >>> 25)]) != 0) {
							arg0[var13] = ((var113 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var113 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var114 = var112 + var82;
						int var115;
						if ((var115 = arg1[(var114 & 0x3F80) + (var114 >>> 25)]) != 0) {
							arg0[var13] = ((var115 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var115 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						int var116 = var114 + var82;
						int var117;
						if ((var117 = arg1[(var116 & 0x3F80) + (var116 >>> 25)]) != 0) {
							arg0[var13] = ((var117 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var117 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						var81 = var116 + var82;
						var14 += var84;
						var85 = var14 >> 8;
						var83--;
					} while (var83 > 0);
				}
				int var118 = arg4 - arg3 & 0x7;
				if (var118 > 0) {
					do {
						int var119;
						if ((var119 = arg1[(var81 & 0x3F80) + (var81 >>> 25)]) != 0) {
							arg0[var13] = ((var119 & 0xFF00FF) * var85 & 0xFF00FF00) + ((var119 & 0xFF00) * var85 & 0xFF0000) >> 8;
						}
						var13++;
						var81 += var82;
						var118--;
					} while (var118 > 0);
				}
			}
			return;
		}
		int var16 = arg3 - originX;
		int var17 = arg7 + arg10 * var16;
		int var18 = arg8 + arg11 * var16;
		int var19 = arg9 + arg12 * var16;
		int var20 = var19 >> 12;
		int var21;
		int var22;
		if (var20 == 0) {
			var21 = 0;
			var22 = 0;
		} else {
			var21 = var17 / var20;
			var22 = var18 / var20;
		}
		int var23 = var17 + arg10 * var15;
		int var24 = var18 + arg11 * var15;
		int var25 = var19 + arg12 * var15;
		int var26 = var25 >> 12;
		int var27;
		int var28;
		if (var26 == 0) {
			var27 = 0;
			var28 = 0;
		} else {
			var27 = var23 / var26;
			var28 = var24 / var26;
		}
		int var29 = (var21 << 20) + var22;
		int var30 = ((var27 - var21) / var15 << 20) + (var28 - var22) / var15;
		int var31 = var15 >> 3;
		int var32 = arg6 << 3;
		int var33 = var14 >> 8;
		if (field120) {
			if (var31 > 0) {
				do {
					int var34 = arg1[(var29 & 0xFC0) + (var29 >>> 26)];
					arg0[var13++] = ((var34 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var34 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var35 = var29 + var30;
					int var36 = arg1[(var35 & 0xFC0) + (var35 >>> 26)];
					arg0[var13++] = ((var36 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var36 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var37 = var35 + var30;
					int var38 = arg1[(var37 & 0xFC0) + (var37 >>> 26)];
					arg0[var13++] = ((var38 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var38 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var39 = var37 + var30;
					int var40 = arg1[(var39 & 0xFC0) + (var39 >>> 26)];
					arg0[var13++] = ((var40 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var40 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var41 = var39 + var30;
					int var42 = arg1[(var41 & 0xFC0) + (var41 >>> 26)];
					arg0[var13++] = ((var42 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var42 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var43 = var41 + var30;
					int var44 = arg1[(var43 & 0xFC0) + (var43 >>> 26)];
					arg0[var13++] = ((var44 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var44 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var45 = var43 + var30;
					int var46 = arg1[(var45 & 0xFC0) + (var45 >>> 26)];
					arg0[var13++] = ((var46 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var46 & 0xFF00) * var33 & 0xFF0000) >> 8;
					int var47 = var45 + var30;
					int var48 = arg1[(var47 & 0xFC0) + (var47 >>> 26)];
					arg0[var13++] = ((var48 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var48 & 0xFF00) * var33 & 0xFF0000) >> 8;
					var29 = var47 + var30;
					var14 += var32;
					var33 = var14 >> 8;
					var31--;
				} while (var31 > 0);
			}
			int var49 = arg4 - arg3 & 0x7;
			if (var49 > 0) {
				do {
					int var50 = arg1[(var29 & 0xFC0) + (var29 >>> 26)];
					arg0[var13++] = ((var50 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var50 & 0xFF00) * var33 & 0xFF0000) >> 8;
					var29 += var30;
					var49--;
				} while (var49 > 0);
				return;
			}
			return;
		}
		if (var31 > 0) {
			do {
				int var51;
				if ((var51 = arg1[(var29 & 0xFC0) + (var29 >>> 26)]) != 0) {
					arg0[var13] = ((var51 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var51 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var52 = var29 + var30;
				int var53;
				if ((var53 = arg1[(var52 & 0xFC0) + (var52 >>> 26)]) != 0) {
					arg0[var13] = ((var53 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var53 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var54 = var52 + var30;
				int var55;
				if ((var55 = arg1[(var54 & 0xFC0) + (var54 >>> 26)]) != 0) {
					arg0[var13] = ((var55 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var55 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var56 = var54 + var30;
				int var57;
				if ((var57 = arg1[(var56 & 0xFC0) + (var56 >>> 26)]) != 0) {
					arg0[var13] = ((var57 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var57 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var58 = var56 + var30;
				int var59;
				if ((var59 = arg1[(var58 & 0xFC0) + (var58 >>> 26)]) != 0) {
					arg0[var13] = ((var59 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var59 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var60 = var58 + var30;
				int var61;
				if ((var61 = arg1[(var60 & 0xFC0) + (var60 >>> 26)]) != 0) {
					arg0[var13] = ((var61 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var61 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var62 = var60 + var30;
				int var63;
				if ((var63 = arg1[(var62 & 0xFC0) + (var62 >>> 26)]) != 0) {
					arg0[var13] = ((var63 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var63 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				int var64 = var62 + var30;
				int var65;
				if ((var65 = arg1[(var64 & 0xFC0) + (var64 >>> 26)]) != 0) {
					arg0[var13] = ((var65 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var65 & 0xFF00) * var33 & 0xFF0000) >> 8;
				}
				var13++;
				var29 = var64 + var30;
				var14 += var32;
				var33 = var14 >> 8;
				var31--;
			} while (var31 > 0);
		}
		int var66 = arg4 - arg3 & 0x7;
		if (var66 <= 0) {
			return;
		}
		do {
			int var67;
			if ((var67 = arg1[(var29 & 0xFC0) + (var29 >>> 26)]) != 0) {
				arg0[var13] = ((var67 & 0xFF00FF) * var33 & 0xFF00FF00) + ((var67 & 0xFF00) * var33 & 0xFF0000) >> 8;
			}
			var13++;
			var29 += var30;
			var66--;
		} while (var66 > 0);
		return;
	}

	@ObfuscatedName("af.a(Lje;)V")
	public static void setTextures(TextureProvider arg0) {
		field126 = arg0;
	}

	@ObfuscatedName("af.a(DII)V")
	public static void initColourTable2(double arg0) {
		double var2 = arg0 + Math.random() * 0.03D - 0.015D;
		int var4 = 0;
		for (int var5 = 0; var5 < 512; var5++) {
			double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double) (var5 & 0x7) / 8.0D + 0.0625D;
			for (int var10 = 0; var10 < 128; var10++) {
				double var11 = (double) var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (var8 + 1.0D);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}
					double var21 = var11 * 2.0D - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						var23--;
					}
					double var25 = var6 - 0.3333333333333333D;
					if (var25 < 0.0D) {
						var25++;
					}
					if (var23 * 6.0D < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}
					if (var6 * 6.0D < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (var6 * 2.0D < 1.0D) {
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}
					if (var25 * 6.0D < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var25;
					} else if (var25 * 2.0D < 1.0D) {
						var17 = var19;
					} else if (var25 * 3.0D < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var25) * 6.0D;
					} else {
						var17 = var21;
					}
				}
				int var27 = (int) (var13 * 256.0D);
				int var28 = (int) (var15 * 256.0D);
				int var29 = (int) (var17 * 256.0D);
				int var30 = (var27 << 16) + (var28 << 8) + var29;
				int var31 = gammaCorrect(var30, var2);
				if (var31 == 0) {
					var31 = 1;
				}
				field123[var4++] = var31;
			}
		}
	}

	@ObfuscatedName("af.b(II)V")
	public static void setOrigin(int arg0, int arg1) {
		int var2 = scanline[0];
		int var3 = var2 / Pix2D.width;
		int var4 = var2 - var3 * Pix2D.width;
		originX = arg0 - var4;
		originY = arg1 - var3;
		minX = -originX;
		maxX = sizeX - originX;
		minY = -originY;
		maxY = sizeY - originY;
	}

	@ObfuscatedName("af.c(II)I")
	public static int textureLightColour(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

}
