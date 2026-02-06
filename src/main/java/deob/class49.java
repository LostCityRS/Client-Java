package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("h")
public final class class49 extends class141 {

	@ObfuscatedName("h.U")
	public int[] field1144;

	@ObfuscatedName("h.O")
	public int field1138;

	@ObfuscatedName("h.R")
	public int field1141;

	@ObfuscatedName("h.Q")
	public int field1140;

	@ObfuscatedName("h.S")
	public int field1142;

	@ObfuscatedName("h.T")
	public int field1143;

	@ObfuscatedName("h.P")
	public int field1139;

	@ObfuscatedName("h.a([I[IIIIIIIIIIII)V")
	public static void method367(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

	@ObfuscatedName("h.a([I[IIIIIIII)V")
	public static void method368(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("h.a([I[IIIIIIIIII[B)V")
	public static void method375(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
		int var11 = -(arg5 >> 2);
		int var12 = -(arg5 & 0x3);
		for (int var13 = -arg6; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				int var15 = arg1[arg2++];
				if (var15 != 0 && arg10[arg4] == 0) {
					arg0[arg3++] = var15;
				} else {
					arg3++;
				}
				arg4++;
				int var16 = arg1[arg2++];
				if (var16 != 0 && arg10[arg4] == 0) {
					arg0[arg3++] = var16;
				} else {
					arg3++;
				}
				arg4++;
				int var17 = arg1[arg2++];
				if (var17 != 0 && arg10[arg4] == 0) {
					arg0[arg3++] = var17;
				} else {
					arg3++;
				}
				arg4++;
				int var18 = arg1[arg2++];
				if (var18 != 0 && arg10[arg4] == 0) {
					arg0[arg3++] = var18;
				} else {
					arg3++;
				}
				arg4++;
			}
			for (int var19 = var12; var19 < 0; var19++) {
				int var20 = arg1[arg2++];
				if (var20 != 0 && arg10[arg4] == 0) {
					arg0[arg3++] = var20;
				} else {
					arg3++;
				}
				arg4++;
			}
			arg3 += arg7;
			arg2 += arg8;
			arg4 += arg9;
		}
	}

	@ObfuscatedName("h.a([I[IIIIIII)V")
	public static void method377(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("h.a([I[IIIIIIIII)V")
	public static void method379(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("h.a([I[IIIIIIIIIII)V")
	public static void method381(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
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

	@ObfuscatedName("h.a([I[IIIIIIIIII)V")
	public static void method383(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = -arg5; var8 < 0; var8++) {
			for (int var9 = -arg4; var9 < 0; var9++) {
				int var10 = arg1[arg2++];
				if (var10 == 0) {
					arg3++;
				} else {
					int var11 = (var10 & 0xFF00FF) * 128 & 0xFF00FF00;
					int var12 = (var10 & 0xFF00) * 128 & 0xFF0000;
					arg0[arg3++] = ((var11 | var12) >>> 8) + 8355711;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public class49() {
	}

	public class49(int arg0, int arg1) {
		this.field1144 = new int[arg0 * arg1];
		this.field1141 = this.field1138 = arg0;
		this.field1142 = this.field1140 = arg1;
		this.field1139 = this.field1143 = 0;
	}

	public class49(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.field1141 = var3.getWidth(arg1);
			this.field1142 = var3.getHeight(arg1);
			this.field1138 = this.field1141;
			this.field1140 = this.field1142;
			this.field1139 = 0;
			this.field1143 = 0;
			this.field1144 = new int[this.field1141 * this.field1142];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1141, this.field1142, this.field1144, 0, this.field1141);
			var5.grabPixels();
		} catch (InterruptedException var6) {
		}
	}

	@ObfuscatedName("h.d(IIIIII)V")
	public void method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == 0) {
			return;
		}
		int var7 = arg0 - (this.field1139 << 4);
		int var8 = arg1 - (this.field1143 << 4);
		double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
		int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
		int var13 = -var7 * var12 + -var8 * var11;
		int var14 = var7 * var11 + -var8 * var12;
		int var15 = ((this.field1141 << 4) - var7) * var12 + -var8 * var11;
		int var16 = -((this.field1141 << 4) - var7) * var11 + -var8 * var12;
		int var17 = -var7 * var12 + ((this.field1142 << 4) - var8) * var11;
		int var18 = var7 * var11 + ((this.field1142 << 4) - var8) * var12;
		int var19 = ((this.field1141 << 4) - var7) * var12 + ((this.field1142 << 4) - var8) * var11;
		int var20 = -((this.field1141 << 4) - var7) * var11 + ((this.field1142 << 4) - var8) * var12;
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
		int var29 = var25 + arg2;
		int var30 = var26 + arg2;
		int var31 = var27 + arg3;
		int var32 = var28 + arg3;
		int var33 = var29 >> 4;
		int var34 = var30 + 15 >> 4;
		int var35 = var31 >> 4;
		int var36 = var32 + 15 >> 4;
		if (var33 < class141.field3238) {
			var33 = class141.field3238;
		}
		if (var34 > class141.field3241) {
			var34 = class141.field3241;
		}
		if (var35 < class141.field3236) {
			var35 = class141.field3236;
		}
		if (var36 > class141.field3239) {
			var36 = class141.field3239;
		}
		int var37 = var33 - var34;
		if (var37 >= 0) {
			return;
		}
		int var38 = var35 - var36;
		if (var38 >= 0) {
			return;
		}
		int var39 = var35 * class141.field3240 + var33;
		double var40 = 1.6777216E7D / (double) arg5;
		int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
		int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
		int var44 = (var33 << 4) + 8 - arg2;
		int var45 = (var35 << 4) + 8 - arg3;
		int var46 = (var7 << 8) - (var45 * var42 >> 4);
		int var47 = (var8 << 8) + (var45 * var43 >> 4);
		if (var43 == 0) {
			if (var42 == 0) {
				int var48 = var38;
				while (var48 < 0) {
					int var49 = var39;
					int var50 = var37;
					if (var46 >= 0 && var47 >= 0 && var46 - (this.field1141 << 12) < 0 && var47 - (this.field1142 << 12) < 0) {
						while (var50 < 0) {
							int var51 = this.field1144[(var47 >> 12) * this.field1141 + (var46 >> 12)];
							if (var51 == 0) {
								var49++;
							} else {
								class141.field3237[var49++] = var51;
							}
							var50++;
						}
					}
					var48++;
					var39 += class141.field3240;
				}
			} else if (var42 < 0) {
				int var52 = var38;
				while (var52 < 0) {
					int var53 = var39;
					int var54 = var47 + (var44 * var42 >> 4);
					int var55 = var37;
					if (var46 >= 0 && var46 - (this.field1141 << 12) < 0) {
						int var56;
						if ((var56 = var54 - (this.field1142 << 12)) >= 0) {
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
							int var59 = this.field1144[(var54 >> 12) * this.field1141 + (var46 >> 12)];
							if (var59 == 0) {
								var53++;
							} else {
								class141.field3237[var53++] = var59;
							}
							var54 += var42;
							var55++;
						}
					}
					var52++;
					var46 -= var42;
					var39 += class141.field3240;
				}
			} else {
				int var60 = var38;
				while (var60 < 0) {
					int var61 = var39;
					int var62 = var47 + (var44 * var42 >> 4);
					int var63 = var37;
					if (var46 >= 0 && var46 - (this.field1141 << 12) < 0) {
						if (var62 < 0) {
							int var64 = (var42 - var62 - 1) / var42;
							var63 = var37 + var64;
							var62 += var42 * var64;
							var61 = var39 + var64;
						}
						int var65;
						if ((var65 = (var62 + 1 - (this.field1142 << 12) - var42) / var42) > var63) {
							var63 = var65;
						}
						while (var63 < 0) {
							int var66 = this.field1144[(var62 >> 12) * this.field1141 + (var46 >> 12)];
							if (var66 == 0) {
								var61++;
							} else {
								class141.field3237[var61++] = var66;
							}
							var62 += var42;
							var63++;
						}
					}
					var60++;
					var46 -= var42;
					var39 += class141.field3240;
				}
			}
		} else if (var43 < 0) {
			if (var42 == 0) {
				int var67 = var38;
				while (var67 < 0) {
					int var68 = var39;
					int var69 = var46 + (var44 * var43 >> 4);
					int var70 = var37;
					if (var47 >= 0 && var47 - (this.field1142 << 12) < 0) {
						int var71;
						if ((var71 = var69 - (this.field1141 << 12)) >= 0) {
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
							int var74 = this.field1144[(var47 >> 12) * this.field1141 + (var69 >> 12)];
							if (var74 == 0) {
								var68++;
							} else {
								class141.field3237[var68++] = var74;
							}
							var69 += var43;
							var70++;
						}
					}
					var67++;
					var47 += var43;
					var39 += class141.field3240;
				}
			} else if (var42 < 0) {
				int var75 = var38;
				while (var75 < 0) {
					int var76 = var39;
					int var77 = var46 + (var44 * var43 >> 4);
					int var78 = var47 + (var44 * var42 >> 4);
					int var79 = var37;
					int var80;
					if ((var80 = var77 - (this.field1141 << 12)) >= 0) {
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
					if ((var83 = var78 - (this.field1142 << 12)) >= 0) {
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
						int var86 = this.field1144[(var78 >> 12) * this.field1141 + (var77 >> 12)];
						if (var86 == 0) {
							var76++;
						} else {
							class141.field3237[var76++] = var86;
						}
						var77 += var43;
						var78 += var42;
						var79++;
					}
					var75++;
					var46 -= var42;
					var47 += var43;
					var39 += class141.field3240;
				}
			} else {
				int var87 = var38;
				while (var87 < 0) {
					int var88 = var39;
					int var89 = var46 + (var44 * var43 >> 4);
					int var90 = var47 + (var44 * var42 >> 4);
					int var91 = var37;
					int var92;
					if ((var92 = var89 - (this.field1141 << 12)) >= 0) {
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
					if ((var96 = (var90 + 1 - (this.field1142 << 12) - var42) / var42) > var91) {
						var91 = var96;
					}
					while (var91 < 0) {
						int var97 = this.field1144[(var90 >> 12) * this.field1141 + (var89 >> 12)];
						if (var97 == 0) {
							var88++;
						} else {
							class141.field3237[var88++] = var97;
						}
						var89 += var43;
						var90 += var42;
						var91++;
					}
					var87++;
					var46 -= var42;
					var47 += var43;
					var39 += class141.field3240;
				}
			}
		} else if (var42 == 0) {
			int var98 = var38;
			while (var98 < 0) {
				int var99 = var39;
				int var100 = var46 + (var44 * var43 >> 4);
				int var101 = var37;
				if (var47 >= 0 && var47 - (this.field1142 << 12) < 0) {
					if (var100 < 0) {
						int var102 = (var43 - var100 - 1) / var43;
						var101 = var37 + var102;
						var100 += var43 * var102;
						var99 = var39 + var102;
					}
					int var103;
					if ((var103 = (var100 + 1 - (this.field1141 << 12) - var43) / var43) > var101) {
						var101 = var103;
					}
					while (var101 < 0) {
						int var104 = this.field1144[(var47 >> 12) * this.field1141 + (var100 >> 12)];
						if (var104 == 0) {
							var99++;
						} else {
							class141.field3237[var99++] = var104;
						}
						var100 += var43;
						var101++;
					}
				}
				var98++;
				var47 += var43;
				var39 += class141.field3240;
			}
		} else if (var42 < 0) {
			int var105 = var38;
			while (var105 < 0) {
				int var106 = var39;
				int var107 = var46 + (var44 * var43 >> 4);
				int var108 = var47 + (var44 * var42 >> 4);
				int var109 = var37;
				if (var107 < 0) {
					int var110 = (var43 - var107 - 1) / var43;
					var109 = var37 + var110;
					var107 += var43 * var110;
					var108 += var42 * var110;
					var106 = var39 + var110;
				}
				int var111;
				if ((var111 = (var107 + 1 - (this.field1141 << 12) - var43) / var43) > var109) {
					var109 = var111;
				}
				int var112;
				if ((var112 = var108 - (this.field1142 << 12)) >= 0) {
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
					int var115 = this.field1144[(var108 >> 12) * this.field1141 + (var107 >> 12)];
					if (var115 == 0) {
						var106++;
					} else {
						class141.field3237[var106++] = var115;
					}
					var107 += var43;
					var108 += var42;
					var109++;
				}
				var105++;
				var46 -= var42;
				var47 += var43;
				var39 += class141.field3240;
			}
		} else {
			int var116 = var38;
			while (var116 < 0) {
				int var117 = var39;
				int var118 = var46 + (var44 * var43 >> 4);
				int var119 = var47 + (var44 * var42 >> 4);
				int var120 = var37;
				if (var118 < 0) {
					int var121 = (var43 - var118 - 1) / var43;
					var120 = var37 + var121;
					var118 += var43 * var121;
					var119 += var42 * var121;
					var117 = var39 + var121;
				}
				int var122;
				if ((var122 = (var118 + 1 - (this.field1141 << 12) - var43) / var43) > var120) {
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
				if ((var124 = (var119 + 1 - (this.field1142 << 12) - var42) / var42) > var120) {
					var120 = var124;
				}
				while (var120 < 0) {
					int var125 = this.field1144[(var119 >> 12) * this.field1141 + (var118 >> 12)];
					if (var125 == 0) {
						var117++;
					} else {
						class141.field3237[var117++] = var125;
					}
					var118 += var43;
					var119 += var42;
					var120++;
				}
				var116++;
				var46 -= var42;
				var47 += var43;
				var39 += class141.field3240;
			}
		}
	}

	@ObfuscatedName("h.d()V")
	public void method365() {
		int[] var1 = new int[this.field1141 * this.field1142];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field1142; var3++) {
			for (int var4 = this.field1141 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field1144[var4 + var3 * this.field1141];
			}
		}
		this.field1144 = var1;
		this.field1139 = this.field1138 - this.field1141 - this.field1139;
	}

	@ObfuscatedName("h.a(IIIIIIII[I[I)V")
	public void method366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			int var15 = var13 * arg7 >> 8;
			int var16 = var14 * arg7 >> 8;
			int var17 = (arg4 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg0 + arg1 * class141.field3240;
			for (int var20 = 0; var20 < arg3; var20++) {
				int var21 = arg8[var20];
				int var22 = var19 + var21;
				int var23 = var17 + var16 * var21;
				int var24 = var18 - var15 * var21;
				for (int var25 = -arg9[var20]; var25 < 0; var25++) {
					class141.field3237[var22++] = this.field1144[(var23 >> 16) + (var24 >> 16) * this.field1141];
					var23 += var16;
					var24 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += class141.field3240;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("h.b(II)V")
	public void method369(int arg0, int arg1) {
		int var3 = arg0 + this.field1139;
		int var4 = arg1 + this.field1143;
		int var5 = var3 + var4 * class141.field3240;
		int var6 = 0;
		int var7 = this.field1142;
		int var8 = this.field1141;
		int var9 = class141.field3240 - var8;
		int var10 = 0;
		if (var4 < class141.field3236) {
			int var11 = class141.field3236 - var4;
			var7 -= var11;
			var4 = class141.field3236;
			var6 = var11 * var8;
			var5 += var11 * class141.field3240;
		}
		if (var4 + var7 > class141.field3239) {
			var7 -= var4 + var7 - class141.field3239;
		}
		if (var3 < class141.field3238) {
			int var12 = class141.field3238 - var3;
			var8 -= var12;
			var3 = class141.field3238;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class141.field3241) {
			int var13 = var3 + var8 - class141.field3241;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method368(class141.field3237, this.field1144, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("h.e(IIII)V")
	public void method370(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var5 = this.field1141;
		int var6 = this.field1142;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field1138;
		int var10 = this.field1140;
		int var11 = (var9 << 16) / arg2;
		int var12 = (var10 << 16) / arg3;
		if (this.field1139 > 0) {
			int var13 = ((this.field1139 << 16) + var11 - 1) / var11;
			arg0 += var13;
			var7 = var13 * var11 - (this.field1139 << 16);
		}
		if (this.field1143 > 0) {
			int var14 = ((this.field1143 << 16) + var12 - 1) / var12;
			arg1 += var14;
			var8 = var14 * var12 - (this.field1143 << 16);
		}
		if (var5 < var9) {
			arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
		}
		if (var6 < var10) {
			arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		int var15 = arg0 + arg1 * class141.field3240;
		int var16 = class141.field3240 - arg2;
		if (arg1 + arg3 > class141.field3239) {
			arg3 -= arg1 + arg3 - class141.field3239;
		}
		if (arg1 < class141.field3236) {
			int var17 = class141.field3236 - arg1;
			arg3 -= var17;
			var15 += var17 * class141.field3240;
			var8 += var12 * var17;
		}
		if (arg0 + arg2 > class141.field3241) {
			int var18 = arg0 + arg2 - class141.field3241;
			arg2 -= var18;
			var16 += var18;
		}
		if (arg0 < class141.field3238) {
			int var19 = class141.field3238 - arg0;
			arg2 -= var19;
			var15 += var19;
			var7 += var11 * var19;
			var16 += var19;
		}
		method381(class141.field3237, this.field1144, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
	}

	@ObfuscatedName("h.a(Lhb;II)V")
	public void method371(class51 arg0, int arg1, int arg2) {
		if (class141.field3241 - class141.field3238 != arg0.field1167 || class141.field3239 - class141.field3236 != arg0.field1171) {
			throw new IllegalStateException();
		}
		int var4 = arg1 + this.field1139;
		int var5 = arg2 + this.field1143;
		int var6 = var4 + var5 * class141.field3240;
		int var7 = 0;
		int var8 = this.field1142;
		int var9 = this.field1141;
		int var10 = class141.field3240 - var9;
		int var11 = 0;
		if (var5 < class141.field3236) {
			int var12 = class141.field3236 - var5;
			var8 -= var12;
			var5 = class141.field3236;
			var7 = var12 * var9;
			var6 += var12 * class141.field3240;
		}
		if (var5 + var8 > class141.field3239) {
			var8 -= var5 + var8 - class141.field3239;
		}
		if (var4 < class141.field3238) {
			int var13 = class141.field3238 - var4;
			var9 -= var13;
			var4 = class141.field3238;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > class141.field3241) {
			int var14 = var4 + var9 - class141.field3241;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			int var15 = var4 + (var5 - class141.field3236) * arg0.field1167 - class141.field3238;
			int var16 = arg0.field1167 - var9;
			method375(class141.field3237, this.field1144, var7, var6, var15, var9, var8, var10, var11, var16, arg0.field1164);
		}
	}

	@ObfuscatedName("h.f(IIIII)V")
	public void method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var6 = this.field1141;
		int var7 = this.field1142;
		int var8 = 0;
		int var9 = 0;
		int var10 = this.field1138;
		int var11 = this.field1140;
		int var12 = (var10 << 16) / arg2;
		int var13 = (var11 << 16) / arg3;
		if (this.field1139 > 0) {
			int var14 = ((this.field1139 << 16) + var12 - 1) / var12;
			arg0 += var14;
			var8 = var14 * var12 - (this.field1139 << 16);
		}
		if (this.field1143 > 0) {
			int var15 = ((this.field1143 << 16) + var13 - 1) / var13;
			arg1 += var15;
			var9 = var15 * var13 - (this.field1143 << 16);
		}
		if (var6 < var10) {
			arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		if (var7 < var11) {
			arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
		}
		int var16 = arg0 + arg1 * class141.field3240;
		int var17 = class141.field3240 - arg2;
		if (arg1 + arg3 > class141.field3239) {
			arg3 -= arg1 + arg3 - class141.field3239;
		}
		if (arg1 < class141.field3236) {
			int var18 = class141.field3236 - arg1;
			arg3 -= var18;
			var16 += var18 * class141.field3240;
			var9 += var13 * var18;
		}
		if (arg0 + arg2 > class141.field3241) {
			int var19 = arg0 + arg2 - class141.field3241;
			arg2 -= var19;
			var17 += var19;
		}
		if (arg0 < class141.field3238) {
			int var20 = class141.field3238 - arg0;
			arg2 -= var20;
			var16 += var20;
			var8 += var12 * var20;
			var17 += var20;
		}
		method367(class141.field3237, this.field1144, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
	}

	@ObfuscatedName("h.e(I)V")
	public void method373(int arg0) {
		for (int var2 = this.field1142 - 1; var2 > 0; var2--) {
			int var3 = var2 * this.field1141;
			for (int var4 = this.field1141 - 1; var4 > 0; var4--) {
				if (this.field1144[var4 + var3] == 0 && this.field1144[var4 + var3 - this.field1141 - 1] != 0) {
					this.field1144[var4 + var3] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("h.e()V")
	public void method374() {
		if (this.field1141 == this.field1138 && this.field1142 == this.field1140) {
			return;
		}
		int[] var1 = new int[this.field1138 * this.field1140];
		for (int var2 = 0; var2 < this.field1142; var2++) {
			for (int var3 = 0; var3 < this.field1141; var3++) {
				var1[(var2 + this.field1143) * this.field1138 + var3 + this.field1139] = this.field1144[var2 * this.field1141 + var3];
			}
		}
		this.field1144 = var1;
		this.field1141 = this.field1138;
		this.field1142 = this.field1140;
		this.field1139 = 0;
		this.field1143 = 0;
	}

	@ObfuscatedName("h.f(I)V")
	public void method376(int arg0) {
		if (this.field1141 == this.field1138 && this.field1142 == this.field1140) {
			return;
		}
		int var2 = arg0;
		if (arg0 > this.field1139) {
			var2 = this.field1139;
		}
		int var3 = arg0;
		if (arg0 + this.field1139 + this.field1141 > this.field1138) {
			var3 = this.field1138 - this.field1139 - this.field1141;
		}
		int var4 = arg0;
		if (arg0 > this.field1143) {
			var4 = this.field1143;
		}
		int var5 = arg0;
		if (arg0 + this.field1143 + this.field1142 > this.field1140) {
			var5 = this.field1140 - this.field1143 - this.field1142;
		}
		int var6 = this.field1141 + var2 + var3;
		int var7 = this.field1142 + var4 + var5;
		int[] var8 = new int[var6 * var7];
		for (int var9 = 0; var9 < this.field1142; var9++) {
			for (int var10 = 0; var10 < this.field1141; var10++) {
				var8[(var9 + var4) * var6 + var10 + var2] = this.field1144[var9 * this.field1141 + var10];
			}
		}
		this.field1144 = var8;
		this.field1141 = var6;
		this.field1142 = var7;
		this.field1139 -= var2;
		this.field1143 -= var4;
	}

	@ObfuscatedName("h.g(I)V")
	public void method378(int arg0) {
		int[] var2 = new int[this.field1141 * this.field1142];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field1142; var4++) {
			for (int var5 = 0; var5 < this.field1141; var5++) {
				int var6 = this.field1144[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.field1144[var3 - 1] != 0) {
						var6 = arg0;
					} else if (var4 > 0 && this.field1144[var3 - this.field1141] != 0) {
						var6 = arg0;
					} else if (var5 < this.field1141 - 1 && this.field1144[var3 + 1] != 0) {
						var6 = arg0;
					} else if (var4 < this.field1142 - 1 && this.field1144[var3 + this.field1141] != 0) {
						var6 = arg0;
					}
				}
				var2[var3++] = var6;
			}
		}
		this.field1144 = var2;
	}

	@ObfuscatedName("h.f()V")
	public void method380() {
		int[] var1 = new int[this.field1141 * this.field1142];
		int var2 = 0;
		for (int var3 = this.field1142 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.field1141; var4++) {
				var1[var2++] = this.field1144[var4 + var3 * this.field1141];
			}
		}
		this.field1144 = var1;
		this.field1143 = this.field1140 - this.field1142 - this.field1143;
	}

	@ObfuscatedName("h.f(IIII)V")
	public void method382(int arg0, int arg1, int arg2, int arg3) {
		this.method364(this.field1138 << 3, this.field1140 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
	}

	@ObfuscatedName("h.b(III)V")
	public void method384(int arg0, int arg1, int arg2) {
		int var4 = arg0 + this.field1139;
		int var5 = arg1 + this.field1143;
		int var6 = var4 + var5 * class141.field3240;
		int var7 = 0;
		int var8 = this.field1142;
		int var9 = this.field1141;
		int var10 = class141.field3240 - var9;
		int var11 = 0;
		if (var5 < class141.field3236) {
			int var12 = class141.field3236 - var5;
			var8 -= var12;
			var5 = class141.field3236;
			var7 = var12 * var9;
			var6 += var12 * class141.field3240;
		}
		if (var5 + var8 > class141.field3239) {
			var8 -= var5 + var8 - class141.field3239;
		}
		if (var4 < class141.field3238) {
			int var13 = class141.field3238 - var4;
			var9 -= var13;
			var4 = class141.field3238;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > class141.field3241) {
			int var14 = var4 + var9 - class141.field3241;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			method379(class141.field3237, this.field1144, var7, var6, var9, var8, var10, var11, arg2);
		}
	}

	@ObfuscatedName("h.g()Lh;")
	public class49 method385() {
		class49 var1 = new class49(this.field1141, this.field1142);
		var1.field1138 = this.field1138;
		var1.field1140 = this.field1140;
		var1.field1139 = this.field1138 - this.field1141 - this.field1139;
		var1.field1143 = this.field1143;
		for (int var2 = 0; var2 < this.field1142; var2++) {
			for (int var3 = 0; var3 < this.field1141; var3++) {
				var1.field1144[var2 * this.field1141 + var3] = this.field1144[var2 * this.field1141 + this.field1141 - var3 - 1];
			}
		}
		return var1;
	}

	@ObfuscatedName("h.g(IIII)V")
	public void method386(int arg0, int arg1) {
		int var3 = arg0 + this.field1139;
		int var4 = arg1 + this.field1143;
		int var5 = var3 + var4 * class141.field3240;
		int var6 = 0;
		int var7 = this.field1142;
		int var8 = this.field1141;
		int var9 = class141.field3240 - var8;
		int var10 = 0;
		if (var4 < class141.field3236) {
			int var11 = class141.field3236 - var4;
			var7 -= var11;
			var4 = class141.field3236;
			var6 = var11 * var8;
			var5 += var11 * class141.field3240;
		}
		if (var4 + var7 > class141.field3239) {
			var7 -= var4 + var7 - class141.field3239;
		}
		if (var3 < class141.field3238) {
			int var12 = class141.field3238 - var3;
			var8 -= var12;
			var3 = class141.field3238;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class141.field3241) {
			int var13 = var3 + var8 - class141.field3241;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method383(class141.field3237, this.field1144, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("h.c(II)V")
	public void method387(int arg0, int arg1) {
		int var3 = arg0 + this.field1139;
		int var4 = arg1 + this.field1143;
		int var5 = var3 + var4 * class141.field3240;
		int var6 = 0;
		int var7 = this.field1142;
		int var8 = this.field1141;
		int var9 = class141.field3240 - var8;
		int var10 = 0;
		if (var4 < class141.field3236) {
			int var11 = class141.field3236 - var4;
			var7 -= var11;
			var4 = class141.field3236;
			var6 = var11 * var8;
			var5 += var11 * class141.field3240;
		}
		if (var4 + var7 > class141.field3239) {
			var7 -= var4 + var7 - class141.field3239;
		}
		if (var3 < class141.field3238) {
			int var12 = class141.field3238 - var3;
			var8 -= var12;
			var3 = class141.field3238;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class141.field3241) {
			int var13 = var3 + var8 - class141.field3241;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method377(class141.field3237, this.field1144, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("h.h()V")
	public void method388() {
		class141.method1052(this.field1144, this.field1141, this.field1142);
	}

	@ObfuscatedName("h.c(III)V")
	public void method389(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1144.length; var4++) {
			int var5 = this.field1144[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				int var7 = var6 + arg0;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = var5 >> 8 & 0xFF;
				int var9 = var8 + arg1;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}
				int var10 = var5 & 0xFF;
				int var11 = var10 + arg2;
				if (var11 < 1) {
					var11 = 1;
				} else if (var11 > 255) {
					var11 = 255;
				}
				this.field1144[var4] = (var7 << 16) + (var9 << 8) + var11;
			}
		}
	}

	@ObfuscatedName("h.a(IIIIIIDI)V")
	public void method390(int arg0, int arg1, double arg2) {
		try {
			int var5 = (int) (Math.sin(arg2) * 65536.0D);
			int var6 = (int) (Math.cos(arg2) * 65536.0D);
			int var7 = var5 * 256 >> 8;
			int var8 = var6 * 256 >> 8;
			int var9 = var7 * -10 + var8 * -10 + 983040;
			int var10 = var8 * -10 + 983040 - var7 * -10;
			int var11 = arg0 + arg1 * class141.field3240;
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = var11;
				int var14 = var9;
				int var15 = var10;
				for (int var16 = -20; var16 < 0; var16++) {
					int var17 = this.field1144[(var14 >> 16) + (var15 >> 16) * this.field1141];
					if (var17 == 0) {
						var13++;
					} else {
						class141.field3237[var13++] = var17;
					}
					var14 += var8;
					var15 -= var7;
				}
				var9 += var7;
				var10 += var8;
				var11 += class141.field3240;
			}
		} catch (Exception var18) {
		}
	}
}
