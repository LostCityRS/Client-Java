package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jd")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("jd.Fb")
	public int[] data;

	@ObfuscatedName("jd.Eb")
	public int owi;

	@ObfuscatedName("jd.Bb")
	public int wi;

	@ObfuscatedName("jd.Cb")
	public int ohi;

	@ObfuscatedName("jd.Ab")
	public int hi;

	@ObfuscatedName("jd.zb")
	public int yof;

	@ObfuscatedName("jd.Db")
	public int xof;

	@ObfuscatedName("jd.a([I[IIIIIIIIIII)V")
	public static void litSprite(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		int var11 = arg2;
		for (int var12 = -arg7; var12 < 0; var12++) {
			int var13 = (arg3 >> 16) * arg10;
			for (int var14 = -arg6; var14 < 0; var14++) {
				int var15 = arg1[(arg2 >> 16) + var13];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = var11;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("jd.f(IIIII)V")
	public void transScalePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var6 = this.wi;
		int var7 = this.hi;
		int var8 = 0;
		int var9 = 0;
		int var10 = this.owi;
		int var11 = this.ohi;
		int var12 = (var10 << 16) / arg2;
		int var13 = (var11 << 16) / arg3;
		if (this.xof > 0) {
			int var14 = ((this.xof << 16) + var12 - 1) / var12;
			arg0 += var14;
			var8 = var12 * var14 - (this.xof << 16);
		}
		if (this.yof > 0) {
			int var15 = ((this.yof << 16) + var13 - 1) / var13;
			arg1 += var15;
			var9 = var13 * var15 - (this.yof << 16);
		}
		if (var6 < var10) {
			arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		if (var7 < var11) {
			arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
		}
		int var16 = Pix2D.width * arg1 + arg0;
		int var17 = Pix2D.width - arg2;
		if (arg1 + arg3 > Pix2D.clipMaxY) {
			arg3 -= arg1 + arg3 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinY) {
			int var18 = Pix2D.clipMinY - arg1;
			arg3 -= var18;
			var16 += Pix2D.width * var18;
			var9 += var13 * var18;
		}
		if (arg0 + arg2 > Pix2D.clipMaxX) {
			int var19 = arg0 + arg2 - Pix2D.clipMaxX;
			arg2 -= var19;
			var17 += var19;
		}
		if (arg0 < Pix2D.clipMinX) {
			int var20 = Pix2D.clipMinX - arg0;
			arg2 -= var20;
			var16 += var20;
			var8 += var12 * var20;
			var17 += var20;
		}
		plotScale(Pix2D.pixels, this.data, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
	}

	@ObfuscatedName("jd.a(III)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.data.length; var4++) {
			int var5 = this.data[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				int var7 = arg0 + var6;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = var5 >> 8 & 0xFF;
				int var9 = arg1 + var8;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}
				int var10 = var5 & 0xFF;
				int var11 = arg2 + var10;
				if (var11 < 1) {
					var11 = 1;
				} else if (var11 > 255) {
					var11 = 255;
				}
				this.data[var4] = (var7 << 16) + (var9 << 8) + var11;
			}
		}
	}

	@ObfuscatedName("jd.a([I[IIIIIIII[B)V")
	public static void method548(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				int var13 = arg1[arg2++];
				if (var13 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = var13;
				} else {
					arg3++;
				}
				int var14 = arg1[arg2++];
				if (var14 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = var14;
				} else {
					arg3++;
				}
				int var15 = arg1[arg2++];
				if (var15 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = var15;
				} else {
					arg3++;
				}
				int var16 = arg1[arg2++];
				if (var16 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = var16;
				} else {
					arg3++;
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				int var18 = arg1[arg2++];
				if (var18 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = var18;
				} else {
					arg3++;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("jd.a([I[IIIIIIII)V")
	public static void plotSprite(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var8; var11 < 0; var11++) {
				int var12 = arg1[arg2++];
				if (var12 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var12;
				}
				int var13 = arg1[arg2++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var13;
				}
				int var14 = arg1[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var14;
				}
				int var15 = arg1[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var15;
				}
			}
			for (int var16 = var9; var16 < 0; var16++) {
				int var17 = arg1[arg2++];
				if (var17 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var17;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("jd.e(IIII)V")
	public void pixelPerfectRotateScalePlotSprite(int arg0, int arg1, int arg2, int arg3) {
		this.pixelPerfectRotateScalePlotSprite(this.owi << 3, this.ohi << 3, arg0 << 4, arg1 << 4, arg2, arg3);
	}

	@ObfuscatedName("jd.a(II)V")
	public void plotSprite(int arg0, int arg1) {
		int var3 = this.xof + arg0;
		int var4 = this.yof + arg1;
		int var5 = Pix2D.width * var4 + var3;
		int var6 = 0;
		int var7 = this.hi;
		int var8 = this.wi;
		int var9 = Pix2D.width - var8;
		int var10 = 0;
		if (var4 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - var4;
			var7 -= var11;
			var4 = Pix2D.clipMinY;
			var6 = var8 * var11;
			var5 += Pix2D.width * var11;
		}
		if (var4 + var7 > Pix2D.clipMaxY) {
			var7 -= var4 + var7 - Pix2D.clipMaxY;
		}
		if (var3 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - var3;
			var8 -= var12;
			var3 = Pix2D.clipMinX;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.clipMaxX) {
			int var13 = var3 + var8 - Pix2D.clipMaxX;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			plotSprite(Pix2D.pixels, this.data, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("jd.c(IIIIII)V")
	public void pixelPerfectRotateScalePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == 0) {
			return;
		}
		int var7 = arg0 - (this.xof << 4);
		int var8 = arg1 - (this.yof << 4);
		double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
		int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
		int var13 = -var7 * var12 + -var8 * var11;
		int var14 = -var8 * var12 + var7 * var11;
		int var15 = ((this.wi << 4) - var7) * var12 + -var8 * var11;
		int var16 = -((this.wi << 4) - var7) * var11 + -var8 * var12;
		int var17 = ((this.hi << 4) - var8) * var11 + -var7 * var12;
		int var18 = ((this.hi << 4) - var8) * var12 + var7 * var11;
		int var19 = ((this.wi << 4) - var7) * var12 + ((this.hi << 4) - var8) * var11;
		int var20 = ((this.hi << 4) - var8) * var12 + -((this.wi << 4) - var7) * var11;
		int var21;
		int var22;
		if (var13 < var15) {
			var21 = var13;
			var22 = var15;
		} else {
			var21 = var15;
			var22 = var13;
		}
		if (var17 < var21) {
			var21 = var17;
		}
		if (var19 < var21) {
			var21 = var19;
		}
		if (var17 > var22) {
			var22 = var17;
		}
		if (var19 > var22) {
			var22 = var19;
		}
		int var23;
		int var24;
		if (var14 < var16) {
			var23 = var14;
			var24 = var16;
		} else {
			var23 = var16;
			var24 = var14;
		}
		if (var18 < var23) {
			var23 = var18;
		}
		if (var20 < var23) {
			var23 = var20;
		}
		if (var18 > var24) {
			var24 = var18;
		}
		if (var20 > var24) {
			var24 = var20;
		}
		int var25 = var21 >> 12;
		int var26 = var22 + 4095 >> 12;
		int var27 = var23 >> 12;
		int var28 = var24 + 4095 >> 12;
		int var29 = arg2 + var25;
		int var30 = arg2 + var26;
		int var31 = arg3 + var27;
		int var32 = arg3 + var28;
		int var33 = var29 >> 4;
		int var34 = var30 + 15 >> 4;
		int var35 = var31 >> 4;
		int var36 = var32 + 15 >> 4;
		if (var33 < Pix2D.clipMinX) {
			var33 = Pix2D.clipMinX;
		}
		if (var34 > Pix2D.clipMaxX) {
			var34 = Pix2D.clipMaxX;
		}
		if (var35 < Pix2D.clipMinY) {
			var35 = Pix2D.clipMinY;
		}
		if (var36 > Pix2D.clipMaxY) {
			var36 = Pix2D.clipMaxY;
		}
		int var37 = var33 - var34;
		if (var37 >= 0) {
			return;
		}
		int var38 = var35 - var36;
		if (var38 >= 0) {
			return;
		}
		int var39 = Pix2D.width * var35 + var33;
		double var40 = 1.6777216E7D / (double) arg5;
		int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
		int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
		int var44 = (var33 << 4) + 8 - arg2;
		int var45 = (var35 << 4) + 8 - arg3;
		int var46 = (var7 << 8) - (var42 * var45 >> 4);
		int var47 = (var8 << 8) + (var43 * var45 >> 4);
		if (var43 == 0) {
			if (var42 == 0) {
				int var48 = var38;
				while (var48 < 0) {
					int var49 = var39;
					int var50 = var37;
					if (var46 >= 0 && var47 >= 0 && var46 - (this.wi << 12) < 0 && var47 - (this.hi << 12) < 0) {
						while (var50 < 0) {
							int var51 = this.data[(var46 >> 12) + (var47 >> 12) * this.wi];
							if (var51 == 0) {
								var49++;
							} else {
								Pix2D.pixels[var49++] = var51;
							}
							var50++;
						}
					}
					var48++;
					var39 += Pix2D.width;
				}
			} else if (var42 < 0) {
				int var52 = var38;
				while (var52 < 0) {
					int var53 = var39;
					int var54 = (var42 * var44 >> 4) + var47;
					int var55 = var37;
					if (var46 >= 0 && var46 - (this.wi << 12) < 0) {
						int var56;
						if ((var56 = var54 - (this.hi << 12)) >= 0) {
							int var57 = (var42 - var56) / var42;
							var55 = var37 + var57;
							var54 += var42 * var57;
							var53 = var39 + var57;
						}
						int var58;
						if ((var58 = (var54 - var42) / var42) > var55) {
							var55 = var58;
						}
						while (var55 < 0) {
							int var59 = this.data[(var46 >> 12) + (var54 >> 12) * this.wi];
							if (var59 == 0) {
								var53++;
							} else {
								Pix2D.pixels[var53++] = var59;
							}
							var54 += var42;
							var55++;
						}
					}
					var52++;
					var46 -= var42;
					var39 += Pix2D.width;
				}
			} else {
				int var60 = var38;
				while (var60 < 0) {
					int var61 = var39;
					int var62 = (var42 * var44 >> 4) + var47;
					int var63 = var37;
					if (var46 >= 0 && var46 - (this.wi << 12) < 0) {
						if (var62 < 0) {
							int var64 = (var42 - var62 - 1) / var42;
							var63 = var37 + var64;
							var62 += var42 * var64;
							var61 = var39 + var64;
						}
						int var65;
						if ((var65 = (var62 + 1 - (this.hi << 12) - var42) / var42) > var63) {
							var63 = var65;
						}
						while (var63 < 0) {
							int var66 = this.data[(var46 >> 12) + (var62 >> 12) * this.wi];
							if (var66 == 0) {
								var61++;
							} else {
								Pix2D.pixels[var61++] = var66;
							}
							var62 += var42;
							var63++;
						}
					}
					var60++;
					var46 -= var42;
					var39 += Pix2D.width;
				}
			}
		} else if (var43 < 0) {
			if (var42 == 0) {
				int var67 = var38;
				while (var67 < 0) {
					int var68 = var39;
					int var69 = (var43 * var44 >> 4) + var46;
					int var70 = var37;
					if (var47 >= 0 && var47 - (this.hi << 12) < 0) {
						int var71;
						if ((var71 = var69 - (this.wi << 12)) >= 0) {
							int var72 = (var43 - var71) / var43;
							var70 = var37 + var72;
							var69 += var43 * var72;
							var68 = var39 + var72;
						}
						int var73;
						if ((var73 = (var69 - var43) / var43) > var70) {
							var70 = var73;
						}
						while (var70 < 0) {
							int var74 = this.data[(var69 >> 12) + (var47 >> 12) * this.wi];
							if (var74 == 0) {
								var68++;
							} else {
								Pix2D.pixels[var68++] = var74;
							}
							var69 += var43;
							var70++;
						}
					}
					var67++;
					var47 += var43;
					var39 += Pix2D.width;
				}
			} else if (var42 < 0) {
				int var75 = var38;
				while (var75 < 0) {
					int var76 = var39;
					int var77 = (var43 * var44 >> 4) + var46;
					int var78 = (var42 * var44 >> 4) + var47;
					int var79 = var37;
					int var80;
					if ((var80 = var77 - (this.wi << 12)) >= 0) {
						int var81 = (var43 - var80) / var43;
						var79 = var37 + var81;
						var77 += var43 * var81;
						var78 += var42 * var81;
						var76 = var39 + var81;
					}
					int var82;
					if ((var82 = (var77 - var43) / var43) > var79) {
						var79 = var82;
					}
					int var83;
					if ((var83 = var78 - (this.hi << 12)) >= 0) {
						int var84 = (var42 - var83) / var42;
						var79 += var84;
						var77 += var43 * var84;
						var78 += var42 * var84;
						var76 += var84;
					}
					int var85;
					if ((var85 = (var78 - var42) / var42) > var79) {
						var79 = var85;
					}
					while (var79 < 0) {
						int var86 = this.data[(var77 >> 12) + (var78 >> 12) * this.wi];
						if (var86 == 0) {
							var76++;
						} else {
							Pix2D.pixels[var76++] = var86;
						}
						var77 += var43;
						var78 += var42;
						var79++;
					}
					var75++;
					var46 -= var42;
					var47 += var43;
					var39 += Pix2D.width;
				}
			} else {
				int var87 = var38;
				while (var87 < 0) {
					int var88 = var39;
					int var89 = (var43 * var44 >> 4) + var46;
					int var90 = (var42 * var44 >> 4) + var47;
					int var91 = var37;
					int var92;
					if ((var92 = var89 - (this.wi << 12)) >= 0) {
						int var93 = (var43 - var92) / var43;
						var91 = var37 + var93;
						var89 += var43 * var93;
						var90 += var42 * var93;
						var88 = var39 + var93;
					}
					int var94;
					if ((var94 = (var89 - var43) / var43) > var91) {
						var91 = var94;
					}
					if (var90 < 0) {
						int var95 = (var42 - var90 - 1) / var42;
						var91 += var95;
						var89 += var43 * var95;
						var90 += var42 * var95;
						var88 += var95;
					}
					int var96;
					if ((var96 = (var90 + 1 - (this.hi << 12) - var42) / var42) > var91) {
						var91 = var96;
					}
					while (var91 < 0) {
						int var97 = this.data[(var89 >> 12) + (var90 >> 12) * this.wi];
						if (var97 == 0) {
							var88++;
						} else {
							Pix2D.pixels[var88++] = var97;
						}
						var89 += var43;
						var90 += var42;
						var91++;
					}
					var87++;
					var46 -= var42;
					var47 += var43;
					var39 += Pix2D.width;
				}
			}
		} else if (var42 == 0) {
			int var98 = var38;
			while (var98 < 0) {
				int var99 = var39;
				int var100 = (var43 * var44 >> 4) + var46;
				int var101 = var37;
				if (var47 >= 0 && var47 - (this.hi << 12) < 0) {
					if (var100 < 0) {
						int var102 = (var43 - var100 - 1) / var43;
						var101 = var37 + var102;
						var100 += var43 * var102;
						var99 = var39 + var102;
					}
					int var103;
					if ((var103 = (var100 + 1 - (this.wi << 12) - var43) / var43) > var101) {
						var101 = var103;
					}
					while (var101 < 0) {
						int var104 = this.data[(var100 >> 12) + (var47 >> 12) * this.wi];
						if (var104 == 0) {
							var99++;
						} else {
							Pix2D.pixels[var99++] = var104;
						}
						var100 += var43;
						var101++;
					}
				}
				var98++;
				var47 += var43;
				var39 += Pix2D.width;
			}
		} else if (var42 < 0) {
			int var105 = var38;
			while (var105 < 0) {
				int var106 = var39;
				int var107 = (var43 * var44 >> 4) + var46;
				int var108 = (var42 * var44 >> 4) + var47;
				int var109 = var37;
				if (var107 < 0) {
					int var110 = (var43 - var107 - 1) / var43;
					var109 = var37 + var110;
					var107 += var43 * var110;
					var108 += var42 * var110;
					var106 = var39 + var110;
				}
				int var111;
				if ((var111 = (var107 + 1 - (this.wi << 12) - var43) / var43) > var109) {
					var109 = var111;
				}
				int var112;
				if ((var112 = var108 - (this.hi << 12)) >= 0) {
					int var113 = (var42 - var112) / var42;
					var109 += var113;
					var107 += var43 * var113;
					var108 += var42 * var113;
					var106 += var113;
				}
				int var114;
				if ((var114 = (var108 - var42) / var42) > var109) {
					var109 = var114;
				}
				while (var109 < 0) {
					int var115 = this.data[(var107 >> 12) + (var108 >> 12) * this.wi];
					if (var115 == 0) {
						var106++;
					} else {
						Pix2D.pixels[var106++] = var115;
					}
					var107 += var43;
					var108 += var42;
					var109++;
				}
				var105++;
				var46 -= var42;
				var47 += var43;
				var39 += Pix2D.width;
			}
		} else {
			int var116 = var38;
			while (var116 < 0) {
				int var117 = var39;
				int var118 = (var43 * var44 >> 4) + var46;
				int var119 = (var42 * var44 >> 4) + var47;
				int var120 = var37;
				if (var118 < 0) {
					int var121 = (var43 - var118 - 1) / var43;
					var120 = var37 + var121;
					var118 += var43 * var121;
					var119 += var42 * var121;
					var117 = var39 + var121;
				}
				int var122;
				if ((var122 = (var118 + 1 - (this.wi << 12) - var43) / var43) > var120) {
					var120 = var122;
				}
				if (var119 < 0) {
					int var123 = (var42 - var119 - 1) / var42;
					var120 += var123;
					var118 += var43 * var123;
					var119 += var42 * var123;
					var117 += var123;
				}
				int var124;
				if ((var124 = (var119 + 1 - (this.hi << 12) - var42) / var42) > var120) {
					var120 = var124;
				}
				while (var120 < 0) {
					int var125 = this.data[(var118 >> 12) + (var119 >> 12) * this.wi];
					if (var125 == 0) {
						var117++;
					} else {
						Pix2D.pixels[var117++] = var125;
					}
					var118 += var43;
					var119 += var42;
					var120++;
				}
				var116++;
				var46 -= var42;
				var47 += var43;
				var39 += Pix2D.width;
			}
		}
	}

	@ObfuscatedName("jd.d()V")
	public void setPixels() {
		Pix2D.setPixels(this.data, this.wi, this.hi);
	}

	@ObfuscatedName("jd.a(IIIIIIII[I[I)V")
	public void scanlineRotatePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			int var15 = arg7 * var13 >> 8;
			int var16 = arg7 * var14 >> 8;
			int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
			int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
			int var19 = Pix2D.width * arg1 + arg0;
			for (int var20 = 0; var20 < arg3; var20++) {
				int var21 = arg8[var20];
				int var22 = var19 + var21;
				int var23 = var16 * var21 + var17;
				int var24 = var18 - var15 * var21;
				for (int var25 = -arg9[var20]; var25 < 0; var25++) {
					Pix2D.pixels[var22++] = this.data[(var23 >> 16) + (var24 >> 16) * this.wi];
					var23 += var16;
					var24 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.width;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("jd.a(Le;II)V")
	public void scanlinePlotSprite(Pix8 arg0, int arg1, int arg2) {
		int var4 = this.xof + arg1;
		int var5 = this.yof + arg2;
		int var6 = Pix2D.width * var5 + var4;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (var5 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - var5;
			var8 -= var12;
			var5 = Pix2D.clipMinY;
			var7 = var9 * var12;
			var6 += Pix2D.width * var12;
		}
		if (var5 + var8 > Pix2D.clipMaxY) {
			var8 -= var5 + var8 - Pix2D.clipMaxY;
		}
		if (var4 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - var4;
			var9 -= var13;
			var4 = Pix2D.clipMinX;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.clipMaxX) {
			int var14 = var4 + var9 - Pix2D.clipMaxX;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			method548(Pix2D.pixels, this.data, var7, var6, var9, var8, var10, var11, arg0.data);
		}
	}

	@ObfuscatedName("jd.e()V")
	public void trim() {
		if (this.owi == this.wi && this.ohi == this.hi) {
			return;
		}
		int[] var1 = new int[this.owi * this.ohi];
		for (int var2 = 0; var2 < this.hi; var2++) {
			for (int var3 = 0; var3 < this.wi; var3++) {
				var1[(this.yof + var2) * this.owi + this.xof + var3] = this.data[this.wi * var2 + var3];
			}
		}
		this.data = var1;
		this.wi = this.owi;
		this.hi = this.ohi;
		this.xof = 0;
		this.yof = 0;
	}

	@ObfuscatedName("jd.b(II)V")
	public void quickPlotSprite(int arg0, int arg1) {
		int var3 = this.xof + arg0;
		int var4 = this.yof + arg1;
		int var5 = Pix2D.width * var4 + var3;
		int var6 = 0;
		int var7 = this.hi;
		int var8 = this.wi;
		int var9 = Pix2D.width - var8;
		int var10 = 0;
		if (var4 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - var4;
			var7 -= var11;
			var4 = Pix2D.clipMinY;
			var6 = var8 * var11;
			var5 += Pix2D.width * var11;
		}
		if (var4 + var7 > Pix2D.clipMaxY) {
			var7 -= var4 + var7 - Pix2D.clipMaxY;
		}
		if (var3 < Pix2D.clipMinX) {
			int var12 = Pix2D.clipMinX - var3;
			var8 -= var12;
			var3 = Pix2D.clipMinX;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.clipMaxX) {
			int var13 = var3 + var8 - Pix2D.clipMaxX;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			plotQuick(Pix2D.pixels, this.data, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("jd.b(III)V")
	public void transPlotSprite(int arg0, int arg1, int arg2) {
		int var4 = this.xof + arg0;
		int var5 = this.yof + arg1;
		int var6 = Pix2D.width * var5 + var4;
		int var7 = 0;
		int var8 = this.hi;
		int var9 = this.wi;
		int var10 = Pix2D.width - var9;
		int var11 = 0;
		if (var5 < Pix2D.clipMinY) {
			int var12 = Pix2D.clipMinY - var5;
			var8 -= var12;
			var5 = Pix2D.clipMinY;
			var7 = var9 * var12;
			var6 += Pix2D.width * var12;
		}
		if (var5 + var8 > Pix2D.clipMaxY) {
			var8 -= var5 + var8 - Pix2D.clipMaxY;
		}
		if (var4 < Pix2D.clipMinX) {
			int var13 = Pix2D.clipMinX - var4;
			var9 -= var13;
			var4 = Pix2D.clipMinX;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.clipMaxX) {
			int var14 = var4 + var9 - Pix2D.clipMaxX;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			tranSprite(Pix2D.pixels, this.data, var7, var6, var9, var8, var10, var11, arg2);
		}
	}

	public Pix32() {
	}

	@ObfuscatedName("jd.a(IIIIIIDI)V")
	public void rotatePlotSprite(int arg0, int arg1, double arg2) {
		try {
			int var5 = (int) (Math.sin(arg2) * 65536.0D);
			int var6 = (int) (Math.cos(arg2) * 65536.0D);
			int var7 = var5 * 256 >> 8;
			int var8 = var6 * 256 >> 8;
			int var9 = var7 * -10 + var8 * -10 + 983040;
			int var10 = var8 * -10 + 983040 - var7 * -10;
			int var11 = Pix2D.width * arg1 + arg0;
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = var11;
				int var14 = var9;
				int var15 = var10;
				for (int var16 = -20; var16 < 0; var16++) {
					int var17 = this.data[(var14 >> 16) + (var15 >> 16) * this.wi];
					if (var17 == 0) {
						var13++;
					} else {
						Pix2D.pixels[var13++] = var17;
					}
					var14 += var8;
					var15 -= var7;
				}
				var9 += var7;
				var10 += var8;
				var11 += Pix2D.width;
			}
		} catch (Exception var18) {
		}
	}

	@ObfuscatedName("jd.a([I[IIIIIIIII)V")
	public static void tranSprite(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = 256 - arg8;
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = -arg4; var11 < 0; var11++) {
				int var12 = arg1[arg2++];
				if (var12 == 0) {
					arg3++;
				} else {
					int var13 = arg0[arg3];
					arg0[arg3++] = ((var12 & 0xFF00FF) * arg8 + (var13 & 0xFF00FF) * var9 & 0xFF00FF00) + ((var12 & 0xFF00) * arg8 + (var13 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("jd.a([I[IIIIIII)V")
	public static void plotQuick(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = -arg5; var8 < 0; var8++) {
			int var9 = arg3 + arg4 - 3;
			while (arg3 < var9) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			var9 += 3;
			while (arg3 < var9) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("jd.f(IIII)V")
	public void scalePlotSprite(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var5 = this.wi;
		int var6 = this.hi;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.owi;
		int var10 = this.ohi;
		int var11 = (var9 << 16) / arg2;
		int var12 = (var10 << 16) / arg3;
		if (this.xof > 0) {
			int var13 = ((this.xof << 16) + var11 - 1) / var11;
			arg0 += var13;
			var7 = var11 * var13 - (this.xof << 16);
		}
		if (this.yof > 0) {
			int var14 = ((this.yof << 16) + var12 - 1) / var12;
			arg1 += var14;
			var8 = var12 * var14 - (this.yof << 16);
		}
		if (var5 < var9) {
			arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
		}
		if (var6 < var10) {
			arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		int var15 = Pix2D.width * arg1 + arg0;
		int var16 = Pix2D.width - arg2;
		if (arg1 + arg3 > Pix2D.clipMaxY) {
			arg3 -= arg1 + arg3 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.clipMinY) {
			int var17 = Pix2D.clipMinY - arg1;
			arg3 -= var17;
			var15 += Pix2D.width * var17;
			var8 += var12 * var17;
		}
		if (arg0 + arg2 > Pix2D.clipMaxX) {
			int var18 = arg0 + arg2 - Pix2D.clipMaxX;
			arg2 -= var18;
			var16 += var18;
		}
		if (arg0 < Pix2D.clipMinX) {
			int var19 = Pix2D.clipMinX - arg0;
			arg2 -= var19;
			var15 += var19;
			var7 += var11 * var19;
			var16 += var19;
		}
		litSprite(Pix2D.pixels, this.data, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
	}

	@ObfuscatedName("jd.a([I[IIIIIIIIIIII)V")
	public static void plotScale(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = 256 - arg11;
		int var13 = arg2;
		for (int var14 = -arg7; var14 < 0; var14++) {
			int var15 = (arg3 >> 16) * arg10;
			for (int var16 = -arg6; var16 < 0; var16++) {
				int var17 = arg1[(arg2 >> 16) + var15];
				if (var17 == 0) {
					arg4++;
				} else {
					int var18 = arg0[arg4];
					arg0[arg4++] = ((var17 & 0xFF00FF) * arg11 + (var18 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var17 & 0xFF00) * arg11 + (var18 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = var13;
			arg4 += arg5;
		}
	}

	public Pix32(int arg0, int arg1) {
		this.data = new int[arg0 * arg1];
		this.wi = this.owi = arg0;
		this.hi = this.ohi = arg1;
		this.xof = this.yof = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.wi = var3.getWidth(arg1);
			this.hi = var3.getHeight(arg1);
			this.owi = this.wi;
			this.ohi = this.hi;
			this.xof = 0;
			this.yof = 0;
			this.data = new int[this.wi * this.hi];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.wi, this.hi, this.data, 0, this.wi);
			var5.grabPixels();
		} catch (InterruptedException var6) {
		}
	}
}
