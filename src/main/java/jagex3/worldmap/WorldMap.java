package jagex3.worldmap;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.client.GameShell;
import jagex3.config.FloType;
import jagex3.config.FluType;
import jagex3.config.IfType;
import jagex3.config.LocType;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.LinkList;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.SoftwarePix32;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

public class WorldMap {
	@ObfuscatedName("hc.W")
	public static final JagString field1444 = JagString.wrap("details)3dat");
	@ObfuscatedName("client.cb")
	public static final JagString field570 = JagString.wrap("underlay)3dat");
	@ObfuscatedName("bi.d")
	public static final JagString field325 = JagString.wrap("overlay)3dat");
	@ObfuscatedName("ue.p")
	public static final JagString field4208 = JagString.wrap("overlay2)3dat");
	@ObfuscatedName("pg.D")
	public static final JagString field3254 = JagString.wrap("loc)3dat");
	@ObfuscatedName("cb.i")
	public static final JagString field404 = JagString.wrap("labels)3dat");
	@ObfuscatedName("og.t")
	public static final LinkList field3049 = new LinkList();
	@ObfuscatedName("vc.eb")
	public static final LinkList field4359 = new LinkList();
	@ObfuscatedName("e.Z")
	public static final LinkList field783 = new LinkList();
	@ObfuscatedName("fc.h")
	public static final JagString field1113 = JagString.wrap("");
	@ObfuscatedName("bh.M")
	public static JagString field319 = null;
	@ObfuscatedName("uj.j")
	public static int field4276 = 0;
	@ObfuscatedName("fc.e")
	public static double field1110;
	@ObfuscatedName("nh.g")
	public static double field2915;
	@ObfuscatedName("ei.h")
	public static int[] field1009;
	@ObfuscatedName("ti.B")
	public static byte[][][] field4052;
	@ObfuscatedName("af.N")
	public static byte[][][] field105;
	@ObfuscatedName("jg.L")
	public static int[][][] field1912;
	@ObfuscatedName("ij.K")
	public static byte[][][] field1786;
	@ObfuscatedName("ub.ib")
	public static byte[][][] field4166;
	@ObfuscatedName("kh.W")
	public static byte[][][] field2126;
	@ObfuscatedName("oe.q")
	public static int field3033;
	@ObfuscatedName("lf.V")
	public static int field2330;
	@ObfuscatedName("ec.G")
	public static int[][][] field895;
	@ObfuscatedName("ta.Z")
	public static byte[][][] field3951;
	@ObfuscatedName("b.h")
	public static WorldMapFont field175;
	@ObfuscatedName("ki.q")
	public static WorldMapFont field2147;
	@ObfuscatedName("vg.m")
	public static WorldMapFont field4397;
	@ObfuscatedName("s.cb")
	public static WorldMapFont field3762;
	@ObfuscatedName("pd.S")
	public static WorldMapFont field3205;
	@ObfuscatedName("pc.m")
	public static WorldMapFont field3199;
	@ObfuscatedName("vb.H")
	public static WorldMapFont field4325;
	@ObfuscatedName("ui.D")
	public static WorldMapFont field4250;
	@ObfuscatedName("rd.E")
	public static int field3659 = -1;
	@ObfuscatedName("d.hb")
	public static int field594 = -1;
	@ObfuscatedName("dj.ac")
	public static int field760;
	@ObfuscatedName("ib.A")
	public static IfType field1706;
	@ObfuscatedName("wf.e")
	public static Pix32 field4500;
	@ObfuscatedName("kj.D")
	public static int field2181;
	@ObfuscatedName("bd.d")
	public static int field239;
	@ObfuscatedName("k.hb")
	public static int field1988;
	@ObfuscatedName("dj.mc")
	public static int field772;
	@ObfuscatedName("ei.k")
	public static int field1012 = 0;
	@ObfuscatedName("de.K")
	public static int field693;
	@ObfuscatedName("ge.v")
	public static int field1309;
	@ObfuscatedName("di.V")
	public static int field727;
	@ObfuscatedName("pa.b")
	public static int field3136;

	@ObfuscatedName("rd.e(B)V")
	public static void method1319() {
		if (field319 == null) {
			return;
		}
		if (field4276 < 10) {
			if (!Client.worldmap.requestGroupDownload(field319)) {
				field4276 = Client.worldmap.getGroupLoadProgress(field319) / 10;
				return;
			}
			field4276 = 10;
		}
		if (field4276 == 10) {
			Packet var0 = new Packet(Client.worldmap.getFile(field319, field1444));
			int var1 = var0.g2();
			int var2 = var0.g2();
			int var3 = var0.g2();
			int var4 = var0.g2();
			int var5 = var0.g2();
			int var6 = var0.g2();
			field2181 = var2 * 64;
			field239 = var1 * 64;
			field1110 = 8.0D;
			field2915 = 8.0D;
			field1009 = new int[FloType.numDefinitions + 1];
			field760 = (var4 - var2) * 64 + 64;
			field1988 = (var3 + 1 - var1) * 64;
			int var7 = Client.mapBuildBaseZ + (Client.localPlayer.z >> 7) - field2181;
			int var8 = Client.mapBuildBaseX + (Client.localPlayer.x >> 7) - field239;
			int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
			int var10 = var7 + (int) (Math.random() * 10.0D) - 5;
			int var11 = field760 >> 6;
			int var12 = field1988 >> 6;
			field4052 = new byte[var12][var11][];
			field105 = new byte[var12][var11][];
			field1912 = new int[var12][var11][];
			field1786 = new byte[var12][var11][];
			field4166 = new byte[var12][var11][];
			int var13 = ClientBuild.ligOff >> 1;
			field2126 = new byte[var12][var11][];
			if (var9 >= 0 && var9 < field1988 && var10 >= 0 && field760 > var10) {
				field3033 = field760 - var10;
				field2330 = var9;
			} else {
				field3033 = field2181 + field760 - var6 * 64;
				field2330 = var5 * 64 - field239;
			}
			int var14 = ClientBuild.hueOff >> 2 << 10;
			field895 = new int[var12][var11][];
			field3951 = new byte[var12][var11][];
			for (int var15 = 0; var15 < FloType.numDefinitions; var15++) {
				FloType var16 = FloType.list(var15);
				if (var16 != null) {
					int var17 = var16.texture;
					if (var17 >= 0 && !Pix3D.textureManager.method436(var17)) {
						var17 = -1;
					}
					int var21;
					if (var16.mapcolour >= 0) {
						int var18 = var16.mapcolour;
						int var19 = var13 + (var18 & 0x7F);
						if (var19 < 0) {
							var19 = 0;
						} else if (var19 > 127) {
							var19 = 127;
						}
						int var20 = (var18 & 0x380) + ((var18 + var14 & 0xFC00) + var19);
						var21 = Pix3D.colourTable[ClientBuild.getOCol(96, var20)];
					} else if (var17 >= 0) {
						var21 = Pix3D.colourTable[ClientBuild.getOCol(96, Pix3D.textureManager.getAverageRgb(var17))];
					} else if (var16.colour == -1) {
						var21 = -1;
					} else {
						int var22 = var16.colour;
						int var23 = var13 + (var22 & 0x7F);
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 127) {
							var23 = 127;
						}
						int var24 = (var22 & 0x380) + (var22 + var14 & 0xFC00) + var23;
						var21 = Pix3D.colourTable[ClientBuild.getOCol(96, var24)];
					}
					field1009[var15 + 1] = var21;
				}
			}
			field4276 = 20;
		} else if (field4276 == 20) {
			method1085(Client.worldmap.getFile(field319, field570));
			field4276 = 30;
			GameShell.doneslowupdate();
		} else if (field4276 == 30) {
			method1029(Client.worldmap.getFile(field319, field325));
			field4276 = 50;
			GameShell.doneslowupdate();
		} else if (field4276 == 50) {
			method1473(Client.worldmap.getFile(field319, field4208));
			field4276 = 70;
			GameShell.doneslowupdate();
		} else if (field4276 == 70) {
			method937(Client.worldmap.getFile(field319, field3254));
			field4276 = 90;
			GameShell.doneslowupdate();
		} else {
			method658(Client.worldmap.getFile(field319, field404));
			if (field4276 == 90) {
				field175 = new WorldMapFont(11, true, GameShell.canvas);
				field2147 = new WorldMapFont(12, true, GameShell.canvas);
				field4397 = new WorldMapFont(14, true, GameShell.canvas);
				field3762 = new WorldMapFont(17, true, GameShell.canvas);
				field3205 = new WorldMapFont(19, true, GameShell.canvas);
				field3199 = new WorldMapFont(22, true, GameShell.canvas);
				field4325 = new WorldMapFont(26, true, GameShell.canvas);
				field4250 = new WorldMapFont(30, true, GameShell.canvas);
				field4276 = 100;
			}
			field3659 = -1;
			field4276 = 100;
			field594 = -1;
			GameShell.doneslowupdate();
			System.gc();
		}
	}

	@ObfuscatedName("nh.a([BI)V")
	public static void method1029(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - field2181;
				if (var2 > 0 && var3 > 0 && field1988 > var2 + 64 && field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (field105[var4][var5] == null) {
									field105[var4][var5] = new byte[4096];
								}
								field105[var4][var5][var6 + (-(var7 + 1) << 6)] = var8;
								byte var9 = arg0[var1++];
								if (field1786[var4][var5] == null) {
									field1786[var4][var5] = new byte[4096];
								}
								field1786[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
							}
						}
					}
				} else {
					for (int var10 = -4096; var10 < 0; var10++) {
						byte var11 = arg0[var1++];
						if (var11 != 0) {
							var1++;
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("u.a([BI)V")
	public static void method1473(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < field1988 && field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (field3951[var4][var5] == null) {
									field3951[var4][var5] = new byte[4096];
								}
								field3951[var4][var5][(-(var7 + 1) << 6) + var6] = var8;
								byte var9 = arg0[var1++];
								if (field4166[var4][var5] == null) {
									field4166[var4][var5] = new byte[4096];
								}
								field4166[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
							}
						}
					}
				} else {
					for (int var10 = -4096; var10 < 0; var10++) {
						byte var11 = arg0[var1++];
						if (var11 != 0) {
							var1++;
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("na.a([BB)V")
	public static void method937(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = arg0[var1++] * 64 - field239;
				int var3 = arg0[var1++] * 64 - field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < field1988 && var3 + 64 < field760) {
					int var7 = var2 >> 6;
					int var8 = field760 - var3 - 1 >> 6;
					for (int var9 = 0; var9 < 64; var9++) {
						for (int var10 = -64; var10 < 0; var10++) {
							byte var11 = arg0[var1++];
							if (var11 != 0) {
								if ((var11 & 0x1) == 1) {
									byte var12 = arg0[var1++];
									if (field4052[var7][var8] == null) {
										field4052[var7][var8] = new byte[4096];
									}
									field4052[var7][var8][(-(var10 + 1) << 6) + var9] = (byte) var12;
								}
								if ((var11 & 0x2) == 2) {
									byte var13 = arg0[var1++];
									if (field2126[var7][var8] == null) {
										field2126[var7][var8] = new byte[4096];
									}
									field2126[var7][var8][var9 + (-(var10 + 1) << 6)] = (byte) (var13 - 28);
								}
								if ((var11 & 0x4) == 4) {
									var1 += 3;
									int var14 = (arg0[var1 - 1] & 0xFF) + ((arg0[var1 - 3] & 0xFF) << 16) + ((arg0[var1 - 2] & 0xFF) << 8);
									if (field895[var7][var8] == null) {
										field895[var7][var8] = new int[4096];
									}
									var14--;
									LocType var15 = LocType.list(var14);
									if (var15.multiloc != null) {
										var15 = var15.getMultiLoc();
										if (var15 == null || var15.mapfunction == -1) {
											continue;
										}
									}
									field895[var7][var8][(-(var10 + 1) << 6) + var9] = var15.id + 1;
									MapElement var16 = new MapElement();
									var16.field1175 = field760 - var3;
									var16.field1180 = var15.mapfunction;
									var16.field1179 = var2;
									field4359.push(var16);
								}
							}
						}
					}
				} else {
					for (int var4 = 0; var4 < 64; var4++) {
						for (int var5 = -64; var5 < 0; var5++) {
							byte var6 = arg0[var1++];
							if (var6 != 0) {
								if ((var6 & 0x1) == 1) {
									var1++;
								}
								if ((var6 & 0x2) == 2) {
									var1++;
								}
								if ((var6 & 0x4) == 4) {
									var1 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("oi.a(I[B)V")
	public static void method1085(byte[] arg0) {
		int var1 = ClientBuild.hueOff >> 2 << 10;
		byte[][] var2 = new byte[field1988][field760];
		int var3 = ClientBuild.ligOff >> 1;
		int var4 = 0;
		while (true) {
			while (arg0.length > var4) {
				int var5 = (arg0[var4++] & 0xFF) * 64 - field239;
				int var6 = (arg0[var4++] & 0xFF) * 64 - field2181;
				if (var5 > 0 && var6 > 0 && var5 + 64 < field1988 && var6 + 64 < field760) {
					for (int var7 = 0; var7 < 64; var7++) {
						byte[] var8 = var2[var5 + var7];
						int var9 = field760 - var6 - 1;
						for (int var10 = -64; var10 < 0; var10++) {
							var8[var9--] = arg0[var4++];
						}
					}
				} else {
					var4 += 4096;
				}
			}
			int var11 = field760;
			int var12 = field1988;
			int[] var13 = new int[var11];
			int[] var14 = new int[var11];
			int[] var15 = new int[var11];
			int[] var16 = new int[var11];
			int[] var17 = new int[var11];
			for (int var18 = -5; var18 < var12; var18++) {
				for (int var19 = 0; var19 < var11; var19++) {
					int var20 = var18 + 5;
					int var10002;
					if (var12 > var20) {
						int var21 = var2[var20][var19] & 0xFF;
						if (var21 > 0) {
							FluType var22 = FluType.list(var21 - 1);
							var13[var19] += var22.hue;
							var14[var19] += var22.saturation;
							var17[var19] += var22.lightness;
							var15[var19] += var22.chroma;
							var10002 = var16[var19]++;
						}
					}
					int var23 = var18 - 5;
					if (var23 >= 0) {
						int var24 = var2[var23][var19] & 0xFF;
						if (var24 > 0) {
							FluType var25 = FluType.list(var24 - 1);
							var13[var19] -= var25.hue;
							var14[var19] -= var25.saturation;
							var17[var19] -= var25.lightness;
							var15[var19] -= var25.chroma;
							var10002 = var16[var19]--;
						}
					}
				}
				if (var18 >= 0) {
					int[][] var26 = field1912[var18 >> 6];
					int var27 = 0;
					int var28 = 0;
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					for (int var32 = -5; var32 < var11; var32++) {
						int var33 = var32 - 5;
						int var34 = var32 + 5;
						if (var34 < var11) {
							var30 += var15[var34];
							var31 += var16[var34];
							var28 += var17[var34];
							var27 += var14[var34];
							var29 += var13[var34];
						}
						if (var33 >= 0) {
							var30 -= var15[var33];
							var27 -= var14[var33];
							var28 -= var17[var33];
							var29 -= var13[var33];
							var31 -= var16[var33];
						}
						if (var32 >= 0 && var31 > 0) {
							int var35 = var32 >> 6;
							int var36 = var30 == 0 ? 0 : ClientBuild.getTable(var29 * 256 / var30, var28 / var31, var27 / var31);
							if (var2[var18][var32] != 0) {
								if (var26[var35] == null) {
									var26[var35] = field1912[var18 >> 6][var35] = new int[4096];
								}
								int var37 = var3 + (var36 & 0x7F);
								if (var37 < 0) {
									var37 = 0;
								} else if (var37 > 127) {
									var37 = 127;
								}
								int var38 = (var36 + var1 & 0xFC00) + ((var36 & 0x380) + var37);
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = Pix3D.colourTable[ClientBuild.getUCol(96, var38)];
							} else if (var26[var35] != null) {
								var26[var35][((var32 & 0x3F) << 6) + (var18 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("ib.a([BB)V")
	public static void method658(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g2();
		for (int var3 = 0; var3 < var2; var3++) {
			WorldMapLabel var4 = new WorldMapLabel();
			JagString var5 = var1.gjstr();
			var4.field4483 = var1.g2();
			var4.field4485 = var1.g2();
			var4.field4492 = var1.g1();
			var4.field4486 = var5.method626();
			var4.field4490 = var5.method600(47);
			field3049.push(var4);
		}
	}

	@ObfuscatedName("di.a(BI)V")
	public static void method277(int arg0) {
		if (arg0 == 37) {
			field2915 = 3.0D;
		} else if (arg0 == 50) {
			field2915 = 4.0D;
		} else if (arg0 == 75) {
			field2915 = 6.0D;
		} else {
			field2915 = 8.0D;
		}
		field594 = -1;
		field594 = -1;
	}

	@ObfuscatedName("pi.b(II)V")
	public static void method1221(int arg0) {
		field3033 = arg0;
		field594 = -1;
		field594 = -1;
		method1604();
	}

	@ObfuscatedName("cj.a(BLi;)Lwe;")
	public static WorldMapLabel method207(JagString arg0) {
		if (arg0.method604() == 0) {
			return null;
		}
		for (WorldMapLabel var1 = (WorldMapLabel) field3049.head(); var1 != null; var1 = (WorldMapLabel) field3049.next()) {
			if (var1.field4486.method595(arg0)) {
				return var1;
			}
		}
		return null;
	}

	@ObfuscatedName("rd.d(B)V")
	public static void method1315() {
		if (field2915 > field1110) {
			field1110 += field1110 / 30.0D;
			if (field1110 > field2915) {
				field1110 = field2915;
			}
			method1604();
		} else if (field2915 < field1110) {
			field1110 -= field1110 / 30.0D;
			if (field2915 > field1110) {
				field1110 = field2915;
			}
			method1604();
		}
		if (field3659 == -1 || field594 == -1) {
			return;
		}
		int var0 = field3659 - field2330;
		if (var0 < 2 || var0 > 2) {
			var0 >>= 0x4;
		}
		int var1 = field594 - field3033;
		if (var1 < 2 || var1 > 2) {
			var1 >>= 0x4;
		}
		field3033 += var1;
		field2330 += var0;
		if (var0 == 0 && var1 == 0) {
			field3659 = -1;
			field594 = -1;
		}
		method1604();
	}

	@ObfuscatedName("uc.a(Li;Z)Li;")
	public static JagString method1492(JagString arg0) {
		WorldMapLabel var1 = method207(arg0);
		return var1 == null ? field1113 : var1.field4486;
	}

	@ObfuscatedName("wf.a(I)V")
	public static void method1604() {
		int var0 = field2330 - (int) ((double) field1706.renderWidth / field1110);
		int var1 = field3033 - (int) ((double) field1706.renderHeight / field1110);
		int var2 = field2330 + (int) ((double) field1706.renderWidth / field1110);
		if (var0 < 0) {
			field2330 = (int) ((double) field1706.renderWidth / field1110);
			field3659 = -1;
			field594 = -1;
		}
		if (field1988 < var2) {
			field2330 = field1988 - (int) ((double) field1706.renderWidth / field1110);
			field594 = -1;
			field3659 = -1;
		}
		int var3 = (int) ((double) field1706.renderHeight / field1110) + field3033;
		if (var1 < 0) {
			field3033 = (int) ((double) field1706.renderHeight / field1110);
			field3659 = -1;
			field594 = -1;
		}
		if (var3 > field760) {
			field3033 = field760 - (int) ((double) field1706.renderHeight / field1110);
			field3659 = -1;
			field594 = -1;
		}
	}

	@ObfuscatedName("vd.a(ZI)V")
	public static void method1551(int arg0) {
		field2330 = arg0;
		field3659 = -1;
		field594 = -1;
		method1604();
	}

	@ObfuscatedName("lj.a(BLi;)V")
	public static void method879(JagString arg0) {
		WorldMapLabel var1 = method207(arg0);
		if (var1 == null) {
			return;
		}
		field594 = field760 + field2181 - var1.field4485;
		field3659 = var1.field4483 - field239;
		int var2 = field594 - (int) ((double) field1706.renderHeight / field1110);
		int var3 = field3659 - (int) ((double) field1706.renderWidth / field1110);
		int var4 = field3659 + (int) ((double) field1706.renderWidth / field1110);
		if (var3 < 0) {
			field3659 = (int) ((double) field1706.renderWidth / field1110);
		}
		int var5 = (int) ((double) field1706.renderHeight / field1110) + field594;
		if (var4 > field1988) {
			field3659 = field1988 - (int) ((double) field1706.renderWidth / field1110);
		}
		if (var2 < 0) {
			field594 = (int) ((double) field1706.renderHeight / field1110);
		}
		if (var5 > field760) {
			field594 = field760 - (int) ((double) field1706.renderHeight / field1110);
		}
	}

	@ObfuscatedName("pb.a(IIIII)V")
	public static void method1137(int arg0, int arg1, int arg2, int arg3) {
		field2330 = field1988 * arg2 / arg0;
		field3033 = field760 * arg1 / arg3;
		field594 = -1;
		field3659 = -1;
		method1604();
	}

	@ObfuscatedName("wb.a(IIIII)V")
	public static void method1590(int arg0, int arg1, int arg2, int arg3) {
		Pix2D.setClipping(arg1, arg0, arg2 + arg1, arg3 + arg0);
		Pix2D.fillRect(arg1, arg0, arg2, arg3, 0);
		if (field4276 < 100) {
			return;
		}
		if (field4500 == null) {
			SoftwarePix32 var4 = new SoftwarePix32(arg2, arg3);
			Pix2D.setPixels(var4.data, arg2, arg3);
			method348(arg3, arg2, 0, 0, field760, 0, field1988, 0);
			field4500 = var4;
			GameShell.drawArea.bind();
		}
		field4500.quickPlotSprite(arg1, arg0);
		int var5 = arg1 + field693 * arg2 / field1988;
		int var6 = field1309 * arg2 / field1988;
		int var7 = arg0 + field727 * arg3 / field760;
		int var8 = field3136 * arg3 / field760;
		Pix2D.fillRectTrans(var5, var7, var6, var8, 16711680, 128);
		Pix2D.drawRect(var5, var7, var6, var8, 16711680);
		if (field1012 > 0 && field1012 % 10 < 5) {
			for (MapElement var9 = (MapElement) field4359.head(); var9 != null; var9 = (MapElement) field4359.next()) {
				if (var9.field1180 == field772) {
					int var10 = arg1 + arg2 * var9.field1179 / field1988;
					int var11 = var9.field1175 * arg3 / field760 + arg0;
					Pix2D.fillRect(var10 - 2, var11 + -2, 4, 4, 16776960);
				}
			}
		}
	}

	@ObfuscatedName("jd.c(I)I")
	public static int method708() {
		if (field2915 == 3.0D) {
			return 37;
		} else if (field2915 == 4.0D) {
			return 50;
		} else if (field2915 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@ObfuscatedName("se.a(I)V")
	public static void method1378() {
		field4052 = null;
		field4166 = null;
		field1912 = null;
		field105 = null;
		field2126 = null;
		field1786 = null;
		field3951 = null;
		field1706 = null;
		field895 = null;
		field1009 = null;
		field4276 = 0;
		field4359.clear();
		field3049.clear();
		field4397 = null;
		field2147 = null;
		field4325 = null;
		field4250 = null;
		field3199 = null;
		field3205 = null;
		field175 = null;
		field4500 = null;
		field3762 = null;
	}

	@ObfuscatedName("ue.a(IIIIIIIII)V")
	public static void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg5 - arg6;
		int var9 = arg7 - arg4;
		int var10 = (arg2 - arg1 << 16) / var8;
		int var11 = (arg3 - arg0 << 16) / var9;
		boolean var12;
		if (field1012 > 0 && field1012 % 10 < 5) {
			var12 = true;
		} else {
			var12 = false;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			int var14 = var10 * (var13 + 1) >> 16;
			int var15 = var13 * var10 >> 16;
			int var16 = var14 - var15;
			if (var16 > 0) {
				int[][] var17 = field895[var13 + arg6 >> 6];
				int var18 = var15 + arg1;
				for (int var19 = 0; var19 < var9; var19++) {
					int var20 = (var19 + 1) * var11 >> 16;
					int var21 = var19 * var11 >> 16;
					int var22 = var20 - var21;
					if (var22 > 0) {
						int var23 = var21 + arg0;
						int var24 = var19 + arg4 >> 6;
						if (var17[var24] != null) {
							int var25 = (var13 + arg6 & 0x3F) + ((var19 + arg4 & 0x3F) << 6);
							int var26 = var17[var24][var25];
							if (var26 != 0) {
								LocType var27 = LocType.list(var26 - 1);
								if (var12 && field772 == var27.mapfunction) {
									MapElement var28 = new MapElement();
									var28.field1179 = var18;
									var28.field1180 = var27.mapfunction;
									var28.field1175 = var23;
									field783.push(var28);
								}
								Client.mapfunction[var27.mapfunction].plotSprite(var18 - 7, var23 + -7);
							}
						}
					}
				}
			}
		}
		if (field1110 == field2915) {
			for (WorldMapLabel var29 = (WorldMapLabel) field3049.head(); var29 != null; var29 = (WorldMapLabel) field3049.next()) {
				int var30 = var29.field4483;
				int var31 = var30 - field239;
				int var32 = var29.field4485;
				int var33 = field2181 + field760 - var32;
				int var34 = arg1 + (arg2 - arg1) * (var31 - arg6) / (arg5 - arg6);
				int var35 = (var33 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				int var36 = var29.field4492;
				int var37 = 16777215;
				WorldMapFont var38 = null;
				if (var36 == 0) {
					if (field1110 == 3.0D) {
						var38 = field175;
					}
					if (field1110 == 4.0D) {
						var38 = field2147;
					}
					if (field1110 == 6.0D) {
						var38 = field4397;
					}
					if (field1110 == 8.0D) {
						var38 = field3762;
					}
				}
				if (var36 == 1) {
					if (field1110 == 3.0D) {
						var38 = field4397;
					}
					if (field1110 == 4.0D) {
						var38 = field3762;
					}
					if (field1110 == 6.0D) {
						var38 = field3205;
					}
					if (field1110 == 8.0D) {
						var38 = field3199;
					}
				}
				if (var36 == 2) {
					var37 = 16755200;
					if (field1110 == 3.0D) {
						var38 = field3205;
					}
					if (field1110 == 4.0D) {
						var38 = field3199;
					}
					if (field1110 == 6.0D) {
						var38 = field4325;
					}
					if (field1110 == 8.0D) {
						var38 = field4250;
					}
				}
				if (var38 != null) {
					JagString[] var39 = var29.field4490;
					int var40 = var39.length;
					int var41 = var35 - var38.method508() * (var40 - 1) / 2;
					int var42 = var41 + var38.method505() / 2;
					for (int var43 = 0; var43 < var40; var43++) {
						var38.method511(var39[var43], var34, var42, var37);
						var42 += var38.method508();
					}
				}
			}
		}
		for (MapElement var44 = (MapElement) field783.head(); var44 != null; var44 = (MapElement) field783.next()) {
			Client.mapfunction[var44.field1180].plotSprite(var44.field1179 - 7, var44.field1175 + -7);
			Pix2D.method483(var44.field1179, var44.field1175, 15, 16776960, 128);
			Pix2D.method483(var44.field1179, var44.field1175, 7, 16777215, 256);
		}
		field783.clear();
	}

	@ObfuscatedName("ea.a(IIIBIIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg6 - arg5;
		int var9 = arg4 - arg7;
		int var10 = (arg1 - arg2 << 16) / var8;
		if (field1988 > arg6) {
			var8++;
		}
		int var11 = (arg0 - arg3 << 16) / var9;
		if (field760 > arg4) {
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
				int[][] var19 = field1912[var18];
				byte[][] var20 = field1786[var18];
				byte[][] var21 = field105[var18];
				byte[][] var22 = field4166[var18];
				byte[][] var23 = field3951[var18];
				byte[][] var24 = field4052[var18];
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
								var35 = field1009[FloType.defaultWater + 1];
							}
						} else {
							var35 = var19[var30][var34];
						}
						if (var35 == 0) {
							var35 = 1;
						}
						int var38 = var21[var30] == null ? 0 : field1009[var21[var30][var34] & 0xFF];
						int var39 = var23[var30] == null ? 0 : field1009[var23[var30][var34] & 0xFF];
						if (var38 == 0 && var39 == 0) {
							Pix2D.fillRect(var17, var29, var15, var28, var35);
						} else {
							if (var38 != 0) {
								byte var40 = var20[var30] == null ? 0 : var20[var30][var34];
								int var41 = var40 & 0xFC;
								if (var38 == -1) {
									var38 = 1;
								}
								if (var41 == 0 || var15 <= 1 || var28 <= 1) {
									Pix2D.fillRect(var17, var29, var15, var28, var38);
								} else {
									method1482(true, var28, var35, var40 & 0x3, var29, var38, var41 >> 2, var17, var15, Pix2D.pixels);
								}
							}
							if (var39 != 0) {
								if (var39 == -1) {
									var39 = var35;
								}
								byte var42 = var22[var30][var34];
								int var43 = var42 & 0xFC;
								if (var43 == 0 || var15 <= 1 || var28 <= 1) {
									Pix2D.fillRect(var17, var29, var15, var28, var39);
								}
								method1482(var38 == 0, var28, 0, var42 & 0x3, var29, var39, var43 >> 2, var17, var15, Pix2D.pixels);
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
									Pix2D.vline(var17, var29, var28, var47);
								} else if (var44 == 2) {
									Pix2D.hline(var17, var29, var15, var47);
								} else if (var44 == 3) {
									Pix2D.vline(var45, var29, var28, var47);
								} else if (var44 == 4) {
									Pix2D.hline(var17, var46, var15, var47);
								} else if (var44 == 9) {
									Pix2D.vline(var17, var29, var28, 16777215);
									Pix2D.hline(var17, var29, var15, var47);
								} else if (var44 == 10) {
									Pix2D.vline(var45, var29, var28, 16777215);
									Pix2D.hline(var17, var29, var15, var47);
								} else if (var44 == 11) {
									Pix2D.vline(var45, var29, var28, 16777215);
									Pix2D.hline(var17, var46, var15, var47);
								} else if (var44 == 12) {
									Pix2D.vline(var17, var29, var28, 16777215);
									Pix2D.hline(var17, var46, var15, var47);
								} else if (var44 == 17) {
									Pix2D.hline(var17, var29, 1, var47);
								} else if (var44 == 18) {
									Pix2D.hline(var45, var29, 1, var47);
								} else if (var44 == 19) {
									Pix2D.hline(var45, var46, 1, var47);
								} else if (var44 == 20) {
									Pix2D.hline(var17, var46, 1, var47);
								} else if (var44 == 25) {
									for (int var48 = 0; var48 < var28; var48++) {
										Pix2D.hline(var48 + var17, -var48 + var46, 1, var47);
									}
								} else if (var44 == 26) {
									for (int var49 = 0; var49 < var28; var49++) {
										Pix2D.hline(var17 + var49, var49 + var29, 1, var47);
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
				byte[][] var55 = field2126[arg5 + var50 >> 6];
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
									Client.mapscene[var63 - 1].scalePlotSprite(var54, var62, var53 * 2 + 1, var59 * 2 + 1);
								} else {
									Client.mapscene[var63 - 1].scalePlotSprite(var54 - var53 / 2, var62 + -(var59 / 2), var53 * 2, var59 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ua.a(ZIIIIIIIBI[I)V")
	public static void method1482(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		if (Pix2D.clipMinY > arg4) {
			arg1 -= Pix2D.clipMinY - arg4;
			arg4 = Pix2D.clipMinY;
		}
		if (Pix2D.clipMaxY < arg1 + arg4) {
			arg1 = Pix2D.clipMaxY - arg4;
		}
		if (Pix2D.clipMinX > arg7) {
			arg8 -= Pix2D.clipMinX - arg7;
			arg7 = Pix2D.clipMinX;
		}
		int var10 = arg4 * Pix2D.width + arg7;
		if (arg6 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 8;
		}
		if (Pix2D.clipMaxX < arg8 + arg7) {
			arg8 = Pix2D.clipMaxX - arg7;
		}
		int var11 = Pix2D.width - arg8;
		if (arg6 == 1) {
			if (arg3 == 0) {
				for (int var12 = 0; var12 < arg1; var12++) {
					for (int var13 = 0; var13 < arg8; var13++) {
						if (var13 <= var12) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var14 = arg1 - 1; var14 >= 0; var14--) {
					for (int var15 = 0; var15 < arg8; var15++) {
						if (var14 >= var15) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var16 = 0; var16 < arg1; var16++) {
					for (int var17 = 0; var17 < arg8; var17++) {
						if (var16 <= var17) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var18 = arg1 - 1; var18 >= 0; var18--) {
					for (int var19 = 0; var19 < arg8; var19++) {
						if (var18 <= var19) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 2) {
			if (arg3 == 0) {
				for (int var20 = arg1 - 1; var20 >= 0; var20--) {
					for (int var21 = 0; var21 < arg8; var21++) {
						if (var21 <= var20 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var22 = 0; var22 < arg1; var22++) {
					for (int var23 = 0; var23 < arg8; var23++) {
						if (var23 >= var22 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var24 = 0; var24 < arg1; var24++) {
					for (int var25 = arg8 - 1; var25 >= 0; var25--) {
						if (var24 >> 1 >= var25) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var26 = arg1 - 1; var26 >= 0; var26--) {
					for (int var27 = arg8 - 1; var27 >= 0; var27--) {
						if (var27 >= var26 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 3) {
			if (arg3 == 0) {
				for (int var28 = arg1 - 1; var28 >= 0; var28--) {
					for (int var29 = arg8 - 1; var29 >= 0; var29--) {
						if (var29 <= var28 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var30 = arg1 - 1; var30 >= 0; var30--) {
					for (int var31 = 0; var31 < arg8; var31++) {
						if (var30 << 1 <= var31) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var32 = 0; var32 < arg1; var32++) {
					for (int var33 = 0; var33 < arg8; var33++) {
						if (var33 <= var32 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var34 = 0; var34 < arg1; var34++) {
					for (int var35 = arg8 - 1; var35 >= 0; var35--) {
						if (var34 << 1 <= var35) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 4) {
			if (arg3 == 0) {
				for (int var36 = arg1 - 1; var36 >= 0; var36--) {
					for (int var37 = 0; var37 < arg8; var37++) {
						if (var36 >> 1 <= var37) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var38 = 0; var38 < arg1; var38++) {
					for (int var39 = 0; var39 < arg8; var39++) {
						if (var38 << 1 >= var39) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var40 = 0; var40 < arg1; var40++) {
					for (int var41 = arg8 - 1; var41 >= 0; var41--) {
						if (var40 >> 1 <= var41) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var42 = arg1 - 1; var42 >= 0; var42--) {
					for (int var43 = arg8 - 1; var43 >= 0; var43--) {
						if (var43 <= var42 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg3 == 0) {
					for (int var52 = 0; var52 < arg1; var52++) {
						for (int var53 = 0; var53 < arg8; var53++) {
							if (var53 <= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var54 = 0; var54 < arg1; var54++) {
						for (int var55 = 0; var55 < arg8; var55++) {
							if (var54 <= arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var56 = 0; var56 < arg1; var56++) {
						for (int var57 = 0; var57 < arg8; var57++) {
							if (var57 >= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var58 = 0; var58 < arg1; var58++) {
						for (int var59 = 0; var59 < arg8; var59++) {
							if (arg1 / 2 <= var58) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg3 == 0) {
					for (int var60 = 0; var60 < arg1; var60++) {
						for (int var61 = 0; var61 < arg8; var61++) {
							if (var61 <= var60 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var62 = arg1 - 1; var62 >= 0; var62--) {
						for (int var63 = 0; var63 < arg8; var63++) {
							if (var62 - arg1 / 2 >= var63) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var64 = arg1 - 1; var64 >= 0; var64--) {
						for (int var65 = arg8 - 1; var65 >= 0; var65--) {
							if (var64 - arg1 / 2 >= var65) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var66 = 0; var66 < arg1; var66++) {
						for (int var67 = arg8 - 1; var67 >= 0; var67--) {
							if (var67 <= var66 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg3 == 0) {
					for (int var68 = 0; var68 < arg1; var68++) {
						for (int var69 = 0; var69 < arg8; var69++) {
							if (var68 - arg1 / 2 <= var69) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var70 = arg1 - 1; var70 >= 0; var70--) {
						for (int var71 = 0; var71 < arg8; var71++) {
							if (var70 - arg1 / 2 <= var71) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var72 = arg1 - 1; var72 >= 0; var72--) {
						for (int var73 = arg8 - 1; var73 >= 0; var73--) {
							if (var72 - arg1 / 2 <= var73) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var74 = 0; var74 < arg1; var74++) {
						for (int var75 = arg8 - 1; var75 >= 0; var75--) {
							if (var74 - arg1 / 2 <= var75) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (int var44 = arg1 - 1; var44 >= 0; var44--) {
				for (int var45 = arg8 - 1; var45 >= 0; var45--) {
					if (var45 >= var44 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 1) {
			for (int var46 = arg1 - 1; var46 >= 0; var46--) {
				for (int var47 = 0; var47 < arg8; var47++) {
					if (var47 <= var46 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 2) {
			for (int var48 = 0; var48 < arg1; var48++) {
				for (int var49 = 0; var49 < arg8; var49++) {
					if (var49 >= var48 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 3) {
			for (int var50 = 0; var50 < arg1; var50++) {
				for (int var51 = arg8 - 1; var51 >= 0; var51--) {
					if (var51 <= var50 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		}
	}

	@ObfuscatedName("kb.a(Li;Z)V")
	public static void method764(JagString arg0) {
		field319 = arg0;
		method1378();
	}

	@ObfuscatedName("hi.a(IZ)V")
	public static void method581(int arg0) {
		field772 = arg0;
		field1012 = 50;
	}
}
