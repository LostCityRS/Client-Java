package jagex3.worldmap;

import deob.ObfuscatedName;
import jagex3.client.Client;
import jagex3.client.ClientBuild;
import jagex3.client.GameShell;
import jagex3.config.FloType;
import jagex3.config.FluType;
import jagex3.config.IfType;
import jagex3.config.LocType;
import jagex3.constants.Text;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.LinkList;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.SoftwarePix32;
import jagex3.io.Packet;
import jagex3.jstring.JagString;

public class WorldMap {
	@ObfuscatedName("hc.W")
	public static final JagString AUTO_DETAILS = JagString.wrap("details)3dat");
	@ObfuscatedName("client.cb")
	public static final JagString AUTO_UNDERLAY = JagString.wrap("underlay)3dat");
	@ObfuscatedName("bi.d")
	public static final JagString AUTO_OVERLAY = JagString.wrap("overlay)3dat");
	@ObfuscatedName("ue.p")
	public static final JagString AUTO_OVERLAY2 = JagString.wrap("overlay2)3dat");
	@ObfuscatedName("pg.D")
	public static final JagString AUTO_LOC = JagString.wrap("loc)3dat");
	@ObfuscatedName("cb.i")
	public static final JagString AUTO_LABELS = JagString.wrap("labels)3dat");
	@ObfuscatedName("og.t")
	public static final LinkList labels = new LinkList();
	@ObfuscatedName("vc.eb")
	public static final LinkList mapElements = new LinkList();
	@ObfuscatedName("e.Z")
	public static final LinkList flashingElements = new LinkList();
	@ObfuscatedName("fc.h")
	public static final JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("eh.A")
	public static final JagString AUTO_FPS = JagString.wrap("Fps:");
	@ObfuscatedName("ge.L")
	public static final JagString AUTO_MEM = JagString.wrap("Mem:");
	@ObfuscatedName("h.G")
	public static final JagString AUTO_MEM_UNIT = JagString.wrap("k");
	@ObfuscatedName("bh.M")
	public static JagString currentMap = null;
	@ObfuscatedName("uj.j")
	public static int loadingStep = 0;
	@ObfuscatedName("fc.e")
	public static double zoom;
	@ObfuscatedName("nh.g")
	public static double targetZoom;
	@ObfuscatedName("ei.h")
	public static int[] floorColours;
	@ObfuscatedName("ti.B")
	public static byte[][][] locShapes;
	@ObfuscatedName("af.N")
	public static byte[][][] overlayIds;
	@ObfuscatedName("jg.L")
	public static int[][][] underlayColours;
	@ObfuscatedName("ij.K")
	public static byte[][][] overlayShapes;
	@ObfuscatedName("ub.ib")
	public static byte[][][] overlay2Shapes;
	@ObfuscatedName("kh.W")
	public static byte[][][] mapscene;
	@ObfuscatedName("oe.q")
	public static int centreY;
	@ObfuscatedName("lf.V")
	public static int centreX;
	@ObfuscatedName("ec.G")
	public static int[][][] locIds;
	@ObfuscatedName("ta.Z")
	public static byte[][][] overlay2Ids;
	@ObfuscatedName("b.h")
	public static WorldMapFont f11;
	@ObfuscatedName("ki.q")
	public static WorldMapFont f12;
	@ObfuscatedName("vg.m")
	public static WorldMapFont f14;
	@ObfuscatedName("s.cb")
	public static WorldMapFont f17;
	@ObfuscatedName("pd.S")
	public static WorldMapFont f19;
	@ObfuscatedName("pc.m")
	public static WorldMapFont f22;
	@ObfuscatedName("vb.H")
	public static WorldMapFont f26;
	@ObfuscatedName("ui.D")
	public static WorldMapFont f30;
	@ObfuscatedName("rd.E")
	public static int targetCentreX = -1;
	@ObfuscatedName("d.hb")
	public static int targetCentreY = -1;
	@ObfuscatedName("dj.ac")
	public static int mapHeight;
	@ObfuscatedName("ib.A")
	public static IfType mapCom;
	@ObfuscatedName("wf.e")
	public static Pix32 overviewSprite;
	@ObfuscatedName("kj.D")
	public static int baseY;
	@ObfuscatedName("bd.d")
	public static int baseX;
	@ObfuscatedName("k.hb")
	public static int mapWidth;
	@ObfuscatedName("dj.mc")
	public static int flashingMapFunction;
	@ObfuscatedName("ei.k")
	public static int flashCycle = 0;
	@ObfuscatedName("de.K")
	public static int viewMinX;
	@ObfuscatedName("ge.v")
	public static int viewWidth;
	@ObfuscatedName("di.V")
	public static int viewMinY;
	@ObfuscatedName("pa.b")
	public static int viewHeight;

	@ObfuscatedName("rd.e(B)V")
	public static void load() {
		if (currentMap == null) {
			return;
		}
		if (loadingStep < 10) {
			if (!Client.worldmap.requestGroupDownload(currentMap)) {
				loadingStep = Client.worldmap.getGroupLoadProgress(currentMap) / 10;
				return;
			}
			loadingStep = 10;
		}
		if (loadingStep == 10) {
			Packet var0 = new Packet(Client.worldmap.getFile(currentMap, AUTO_DETAILS));
			int var1 = var0.g2();
			int var2 = var0.g2();
			int var3 = var0.g2();
			int var4 = var0.g2();
			int var5 = var0.g2();
			int var6 = var0.g2();
			baseY = var2 * 64;
			baseX = var1 * 64;
			zoom = 8.0D;
			targetZoom = 8.0D;
			floorColours = new int[FloType.numDefinitions + 1];
			mapHeight = (var4 - var2) * 64 + 64;
			mapWidth = (var3 + 1 - var1) * 64;
			int var7 = Client.mapBuildBaseZ + (Client.localPlayer.z >> 7) - baseY;
			int var8 = Client.mapBuildBaseX + (Client.localPlayer.x >> 7) - baseX;
			int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
			int var10 = var7 + (int) (Math.random() * 10.0D) - 5;
			int var11 = mapHeight >> 6;
			int var12 = mapWidth >> 6;
			locShapes = new byte[var12][var11][];
			overlayIds = new byte[var12][var11][];
			underlayColours = new int[var12][var11][];
			overlayShapes = new byte[var12][var11][];
			overlay2Shapes = new byte[var12][var11][];
			int var13 = ClientBuild.ligOff >> 1;
			mapscene = new byte[var12][var11][];
			if (var9 >= 0 && var9 < mapWidth && var10 >= 0 && mapHeight > var10) {
				centreY = mapHeight - var10;
				centreX = var9;
			} else {
				centreY = baseY + mapHeight - var6 * 64;
				centreX = var5 * 64 - baseX;
			}
			int var14 = ClientBuild.hueOff >> 2 << 10;
			locIds = new int[var12][var11][];
			overlay2Ids = new byte[var12][var11][];
			for (int var15 = 0; var15 < FloType.numDefinitions; var15++) {
				FloType var16 = FloType.list(var15);
				if (var16 != null) {
					int var17 = var16.texture;
					if (var17 >= 0 && !Pix3D.textureManager.isTextureEnabled(var17)) {
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
					floorColours[var15 + 1] = var21;
				}
			}
			loadingStep = 20;
		} else if (loadingStep == 20) {
			decodeUnderlay(Client.worldmap.getFile(currentMap, AUTO_UNDERLAY));
			loadingStep = 30;
			GameShell.doneslowupdate();
		} else if (loadingStep == 30) {
			decodeOverlay(Client.worldmap.getFile(currentMap, AUTO_OVERLAY));
			loadingStep = 50;
			GameShell.doneslowupdate();
		} else if (loadingStep == 50) {
			decodeOverlay2(Client.worldmap.getFile(currentMap, AUTO_OVERLAY2));
			loadingStep = 70;
			GameShell.doneslowupdate();
		} else if (loadingStep == 70) {
			decodeLocs(Client.worldmap.getFile(currentMap, AUTO_LOC));
			loadingStep = 90;
			GameShell.doneslowupdate();
		} else {
			decodeLabels(Client.worldmap.getFile(currentMap, AUTO_LABELS));
			if (loadingStep == 90) {
				f11 = new WorldMapFont(11, true, GameShell.canvas);
				f12 = new WorldMapFont(12, true, GameShell.canvas);
				f14 = new WorldMapFont(14, true, GameShell.canvas);
				f17 = new WorldMapFont(17, true, GameShell.canvas);
				f19 = new WorldMapFont(19, true, GameShell.canvas);
				f22 = new WorldMapFont(22, true, GameShell.canvas);
				f26 = new WorldMapFont(26, true, GameShell.canvas);
				f30 = new WorldMapFont(30, true, GameShell.canvas);
				loadingStep = 100;
			}
			targetCentreX = -1;
			loadingStep = 100;
			targetCentreY = -1;
			GameShell.doneslowupdate();
			System.gc();
		}
	}

	@ObfuscatedName("nh.a([BI)V")
	public static void decodeOverlay(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - baseX;
				int var3 = (arg0[var1++] & 0xFF) * 64 - baseY;
				if (var2 > 0 && var3 > 0 && mapWidth > var2 + 64 && mapHeight > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = mapHeight - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (overlayIds[var4][var5] == null) {
									overlayIds[var4][var5] = new byte[4096];
								}
								overlayIds[var4][var5][var6 + (-(var7 + 1) << 6)] = var8;
								byte var9 = arg0[var1++];
								if (overlayShapes[var4][var5] == null) {
									overlayShapes[var4][var5] = new byte[4096];
								}
								overlayShapes[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
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
	public static void decodeOverlay2(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - baseX;
				int var3 = (arg0[var1++] & 0xFF) * 64 - baseY;
				if (var2 > 0 && var3 > 0 && var2 + 64 < mapWidth && mapHeight > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = mapHeight - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (overlay2Ids[var4][var5] == null) {
									overlay2Ids[var4][var5] = new byte[4096];
								}
								overlay2Ids[var4][var5][(-(var7 + 1) << 6) + var6] = var8;
								byte var9 = arg0[var1++];
								if (overlay2Shapes[var4][var5] == null) {
									overlay2Shapes[var4][var5] = new byte[4096];
								}
								overlay2Shapes[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
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
	public static void decodeLocs(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = arg0[var1++] * 64 - baseX;
				int var3 = arg0[var1++] * 64 - baseY;
				if (var2 > 0 && var3 > 0 && var2 + 64 < mapWidth && var3 + 64 < mapHeight) {
					int var7 = var2 >> 6;
					int var8 = mapHeight - var3 - 1 >> 6;
					for (int var9 = 0; var9 < 64; var9++) {
						for (int var10 = -64; var10 < 0; var10++) {
							byte var11 = arg0[var1++];
							if (var11 != 0) {
								if ((var11 & 0x1) == 1) {
									byte var12 = arg0[var1++];
									if (locShapes[var7][var8] == null) {
										locShapes[var7][var8] = new byte[4096];
									}
									locShapes[var7][var8][(-(var10 + 1) << 6) + var9] = (byte) var12;
								}
								if ((var11 & 0x2) == 2) {
									byte var13 = arg0[var1++];
									if (mapscene[var7][var8] == null) {
										mapscene[var7][var8] = new byte[4096];
									}
									mapscene[var7][var8][var9 + (-(var10 + 1) << 6)] = (byte) (var13 - 28);
								}
								if ((var11 & 0x4) == 4) {
									var1 += 3;
									int var14 = (arg0[var1 - 1] & 0xFF) + ((arg0[var1 - 3] & 0xFF) << 16) + ((arg0[var1 - 2] & 0xFF) << 8);
									if (locIds[var7][var8] == null) {
										locIds[var7][var8] = new int[4096];
									}
									var14--;
									LocType var15 = LocType.list(var14);
									if (var15.multiloc != null) {
										var15 = var15.getMultiLoc();
										if (var15 == null || var15.mapfunction == -1) {
											continue;
										}
									}
									locIds[var7][var8][(-(var10 + 1) << 6) + var9] = var15.id + 1;
									MapElement var16 = new MapElement();
									var16.y = mapHeight - var3;
									var16.mapfunction = var15.mapfunction;
									var16.x = var2;
									mapElements.push(var16);
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
	public static void decodeUnderlay(byte[] arg0) {
		int var1 = ClientBuild.hueOff >> 2 << 10;
		byte[][] var2 = new byte[mapWidth][mapHeight];
		int var3 = ClientBuild.ligOff >> 1;
		int var4 = 0;
		while (true) {
			while (arg0.length > var4) {
				int var5 = (arg0[var4++] & 0xFF) * 64 - baseX;
				int var6 = (arg0[var4++] & 0xFF) * 64 - baseY;
				if (var5 > 0 && var6 > 0 && var5 + 64 < mapWidth && var6 + 64 < mapHeight) {
					for (int var7 = 0; var7 < 64; var7++) {
						byte[] var8 = var2[var5 + var7];
						int var9 = mapHeight - var6 - 1;
						for (int var10 = -64; var10 < 0; var10++) {
							var8[var9--] = arg0[var4++];
						}
					}
				} else {
					var4 += 4096;
				}
			}
			int var11 = mapHeight;
			int var12 = mapWidth;
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
					int[][] var26 = underlayColours[var18 >> 6];
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
									var26[var35] = underlayColours[var18 >> 6][var35] = new int[4096];
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
	public static void decodeLabels(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g2();
		for (int var3 = 0; var3 < var2; var3++) {
			WorldMapLabel var4 = new WorldMapLabel();
			JagString var5 = var1.gjstr();
			var4.x = var1.g2();
			var4.y = var1.g2();
			var4.size = var1.g1();
			var4.displayName = var5.method626();
			var4.textLines = var5.method600(47);
			labels.push(var4);
		}
	}

	@ObfuscatedName("di.a(BI)V")
	public static void setZoom(int arg0) {
		if (arg0 == 37) {
			targetZoom = 3.0D;
		} else if (arg0 == 50) {
			targetZoom = 4.0D;
		} else if (arg0 == 75) {
			targetZoom = 6.0D;
		} else {
			targetZoom = 8.0D;
		}
		targetCentreY = -1;
		targetCentreY = -1;
	}

	@ObfuscatedName("pi.b(II)V")
	public static void setCentreY(int arg0) {
		centreY = arg0;
		targetCentreY = -1;
		targetCentreY = -1;
		clampCentreToBounds();
	}

	@ObfuscatedName("cj.a(BLi;)Lwe;")
	public static WorldMapLabel findLabel(JagString arg0) {
		if (arg0.length() == 0) {
			return null;
		}
		for (WorldMapLabel var1 = (WorldMapLabel) labels.head(); var1 != null; var1 = (WorldMapLabel) labels.next()) {
			if (var1.displayName.method595(arg0)) {
				return var1;
			}
		}
		return null;
	}

	@ObfuscatedName("rd.d(B)V")
	public static void loop() {
		if (targetZoom > zoom) {
			zoom += zoom / 30.0D;
			if (zoom > targetZoom) {
				zoom = targetZoom;
			}
			clampCentreToBounds();
		} else if (targetZoom < zoom) {
			zoom -= zoom / 30.0D;
			if (targetZoom > zoom) {
				zoom = targetZoom;
			}
			clampCentreToBounds();
		}
		if (targetCentreX != -1 && targetCentreY != -1) {
			int var0 = targetCentreX - centreX;
			if (var0 < 2 || var0 > 2) {
				var0 >>= 0x4;
			}
			int var1 = targetCentreY - centreY;
			if (var1 < 2 || var1 > 2) {
				var1 >>= 0x4;
			}
			centreY += var1;
			centreX += var0;
			if (var0 == 0 && var1 == 0) {
				targetCentreX = -1;
				targetCentreY = -1;
			}
			clampCentreToBounds();
		}
	}

	@ObfuscatedName("uc.a(Li;Z)Li;")
	public static JagString getLabelName(JagString arg0) {
		WorldMapLabel var1 = findLabel(arg0);
		return var1 == null ? AUTO_EMPTY : var1.displayName;
	}

	@ObfuscatedName("wf.a(I)V")
	public static void clampCentreToBounds() {
		int var0 = centreX - (int) ((double) mapCom.renderWidth / zoom);
		int var1 = centreY - (int) ((double) mapCom.renderHeight / zoom);
		int var2 = centreX + (int) ((double) mapCom.renderWidth / zoom);
		if (var0 < 0) {
			centreX = (int) ((double) mapCom.renderWidth / zoom);
			targetCentreX = -1;
			targetCentreY = -1;
		}
		if (mapWidth < var2) {
			centreX = mapWidth - (int) ((double) mapCom.renderWidth / zoom);
			targetCentreY = -1;
			targetCentreX = -1;
		}
		int var3 = (int) ((double) mapCom.renderHeight / zoom) + centreY;
		if (var1 < 0) {
			centreY = (int) ((double) mapCom.renderHeight / zoom);
			targetCentreX = -1;
			targetCentreY = -1;
		}
		if (var3 > mapHeight) {
			centreY = mapHeight - (int) ((double) mapCom.renderHeight / zoom);
			targetCentreX = -1;
			targetCentreY = -1;
		}
	}

	@ObfuscatedName("vd.a(ZI)V")
	public static void setCentreX(int arg0) {
		centreX = arg0;
		targetCentreX = -1;
		targetCentreY = -1;
		clampCentreToBounds();
	}

	@ObfuscatedName("lj.a(BLi;)V")
	public static void jumpToLabel(JagString arg0) {
		WorldMapLabel var1 = findLabel(arg0);
		if (var1 == null) {
			return;
		}
		targetCentreY = mapHeight + baseY - var1.y;
		targetCentreX = var1.x - baseX;
		int var2 = targetCentreY - (int) ((double) mapCom.renderHeight / zoom);
		int var3 = targetCentreX - (int) ((double) mapCom.renderWidth / zoom);
		int var4 = targetCentreX + (int) ((double) mapCom.renderWidth / zoom);
		if (var3 < 0) {
			targetCentreX = (int) ((double) mapCom.renderWidth / zoom);
		}
		int var5 = (int) ((double) mapCom.renderHeight / zoom) + targetCentreY;
		if (var4 > mapWidth) {
			targetCentreX = mapWidth - (int) ((double) mapCom.renderWidth / zoom);
		}
		if (var2 < 0) {
			targetCentreY = (int) ((double) mapCom.renderHeight / zoom);
		}
		if (var5 > mapHeight) {
			targetCentreY = mapHeight - (int) ((double) mapCom.renderHeight / zoom);
		}
	}

	@ObfuscatedName("pb.a(IIIII)V")
	public static void clickOverview(int arg0, int arg1, int arg2, int arg3) {
		centreX = mapWidth * arg2 / arg0;
		centreY = mapHeight * arg1 / arg3;
		targetCentreY = -1;
		targetCentreX = -1;
		clampCentreToBounds();
	}

	@ObfuscatedName("wb.a(IIIII)V")
	public static void drawOverview(int arg0, int arg1, int arg2, int arg3) {
		Pix2D.setClipping(arg1, arg0, arg2 + arg1, arg3 + arg0);
		Pix2D.fillRect(arg1, arg0, arg2, arg3, 0);
		if (loadingStep < 100) {
			return;
		}
		if (overviewSprite == null) {
			SoftwarePix32 var4 = new SoftwarePix32(arg2, arg3);
			Pix2D.setPixels(var4.data, arg2, arg3);
			drawTiles(arg3, arg2, 0, 0, mapHeight, 0, mapWidth, 0);
			overviewSprite = var4;
			GameShell.drawArea.bind();
		}
		overviewSprite.quickPlotSprite(arg1, arg0);
		int var5 = arg1 + viewMinX * arg2 / mapWidth;
		int var6 = viewWidth * arg2 / mapWidth;
		int var7 = arg0 + viewMinY * arg3 / mapHeight;
		int var8 = viewHeight * arg3 / mapHeight;
		Pix2D.fillRectTrans(var5, var7, var6, var8, 16711680, 128);
		Pix2D.drawRect(var5, var7, var6, var8, 16711680);
		if (flashCycle > 0 && flashCycle % 10 < 5) {
			for (MapElement var9 = (MapElement) mapElements.head(); var9 != null; var9 = (MapElement) mapElements.next()) {
				if (var9.mapfunction == flashingMapFunction) {
					int var10 = arg1 + arg2 * var9.x / mapWidth;
					int var11 = var9.y * arg3 / mapHeight + arg0;
					Pix2D.fillRect(var10 - 2, var11 + -2, 4, 4, 16776960);
				}
			}
		}
	}

	@ObfuscatedName("jd.c(I)I")
	public static int getZoom() {
		if (targetZoom == 3.0D) {
			return 37;
		} else if (targetZoom == 4.0D) {
			return 50;
		} else if (targetZoom == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@ObfuscatedName("se.a(I)V")
	public static void reset() {
		locShapes = null;
		overlay2Shapes = null;
		underlayColours = null;
		overlayIds = null;
		mapscene = null;
		overlayShapes = null;
		overlay2Ids = null;
		mapCom = null;
		locIds = null;
		floorColours = null;
		loadingStep = 0;
		mapElements.clear();
		labels.clear();
		f14 = null;
		f12 = null;
		f26 = null;
		f30 = null;
		f22 = null;
		f19 = null;
		f11 = null;
		overviewSprite = null;
		f17 = null;
	}

	@ObfuscatedName("ue.a(IIIIIIIII)V")
	public static void drawMapFunctionsAndLabels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg5 - arg6;
		int var9 = arg7 - arg4;
		int var10 = (arg2 - arg1 << 16) / var8;
		int var11 = (arg3 - arg0 << 16) / var9;
		boolean var12;
		if (flashCycle > 0 && flashCycle % 10 < 5) {
			var12 = true;
		} else {
			var12 = false;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			int var14 = var10 * (var13 + 1) >> 16;
			int var15 = var13 * var10 >> 16;
			int var16 = var14 - var15;
			if (var16 > 0) {
				int[][] var17 = locIds[var13 + arg6 >> 6];
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
								if (var12 && flashingMapFunction == var27.mapfunction) {
									MapElement var28 = new MapElement();
									var28.x = var18;
									var28.mapfunction = var27.mapfunction;
									var28.y = var23;
									flashingElements.push(var28);
								}
								Client.mapfunction[var27.mapfunction].plotSprite(var18 - 7, var23 + -7);
							}
						}
					}
				}
			}
		}
		if (zoom == targetZoom) {
			for (WorldMapLabel var29 = (WorldMapLabel) labels.head(); var29 != null; var29 = (WorldMapLabel) labels.next()) {
				int var30 = var29.x;
				int var31 = var30 - baseX;
				int var32 = var29.y;
				int var33 = baseY + mapHeight - var32;
				int var34 = arg1 + (arg2 - arg1) * (var31 - arg6) / (arg5 - arg6);
				int var35 = (var33 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				int var36 = var29.size;
				int var37 = 16777215;
				WorldMapFont var38 = null;
				if (var36 == 0) {
					if (zoom == 3.0D) {
						var38 = f11;
					}
					if (zoom == 4.0D) {
						var38 = f12;
					}
					if (zoom == 6.0D) {
						var38 = f14;
					}
					if (zoom == 8.0D) {
						var38 = f17;
					}
				}
				if (var36 == 1) {
					if (zoom == 3.0D) {
						var38 = f14;
					}
					if (zoom == 4.0D) {
						var38 = f17;
					}
					if (zoom == 6.0D) {
						var38 = f19;
					}
					if (zoom == 8.0D) {
						var38 = f22;
					}
				}
				if (var36 == 2) {
					var37 = 16755200;
					if (zoom == 3.0D) {
						var38 = f19;
					}
					if (zoom == 4.0D) {
						var38 = f22;
					}
					if (zoom == 6.0D) {
						var38 = f26;
					}
					if (zoom == 8.0D) {
						var38 = f30;
					}
				}
				if (var38 != null) {
					JagString[] var39 = var29.textLines;
					int var40 = var39.length;
					int var41 = var35 - var38.getHeight() * (var40 - 1) / 2;
					int var42 = var41 + var38.getYOffset() / 2;
					for (int var43 = 0; var43 < var40; var43++) {
						var38.centreString(var39[var43], var34, var42, var37);
						var42 += var38.getHeight();
					}
				}
			}
		}
		for (MapElement var44 = (MapElement) flashingElements.head(); var44 != null; var44 = (MapElement) flashingElements.next()) {
			Client.mapfunction[var44.mapfunction].plotSprite(var44.x - 7, var44.y + -7);
			Pix2D.fillCircleTrans(var44.x, var44.y, 15, 16776960, 128);
			Pix2D.fillCircleTrans(var44.x, var44.y, 7, 16777215, 256);
		}
		flashingElements.clear();
	}

	@ObfuscatedName("ea.a(IIIBIIIII)V")
	public static void drawTiles(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg6 - arg5;
		int var9 = arg4 - arg7;
		int var10 = (arg1 - arg2 << 16) / var8;
		if (mapWidth > arg6) {
			var8++;
		}
		int var11 = (arg0 - arg3 << 16) / var9;
		if (mapHeight > arg4) {
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
				int[][] var19 = underlayColours[var18];
				byte[][] var20 = overlayShapes[var18];
				byte[][] var21 = overlayIds[var18];
				byte[][] var22 = overlay2Shapes[var18];
				byte[][] var23 = overlay2Ids[var18];
				byte[][] var24 = locShapes[var18];
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
								var35 = floorColours[FloType.defaultWater + 1];
							}
						} else {
							var35 = var19[var30][var34];
						}
						if (var35 == 0) {
							var35 = 1;
						}
						int var38 = var21[var30] == null ? 0 : floorColours[var21[var30][var34] & 0xFF];
						int var39 = var23[var30] == null ? 0 : floorColours[var23[var30][var34] & 0xFF];
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
									drawTileOverlayShape(true, var28, var35, var40 & 0x3, var29, var38, var41 >> 2, var17, var15, Pix2D.pixels);
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
								drawTileOverlayShape(var38 == 0, var28, 0, var42 & 0x3, var29, var39, var43 >> 2, var17, var15, Pix2D.pixels);
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
				byte[][] var55 = mapscene[arg5 + var50 >> 6];
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
	public static void drawTileOverlayShape(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
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
	public static void setMap(JagString arg0) {
		currentMap = arg0;
		reset();
	}

	@ObfuscatedName("hi.a(IZ)V")
	public static void flashMapFunction(int arg0) {
		flashingMapFunction = arg0;
		flashCycle = 50;
	}

	@ObfuscatedName("jf.a(BIIII)V")
	public static void draw(int arg0, int arg1, int arg2, int arg3) {
		if (loadingStep < 100) {
			load();
		}
		Pix2D.setClipping(arg2, arg3, arg0 + arg2, arg1 + arg3);
		if (loadingStep < 100) {
			int var4 = arg0 / 2 + arg2;
			int var5 = arg1 / 2 + arg3 - 38;
			Pix2D.fillRect(arg2, arg3, arg0, arg1, 0);
			Pix2D.drawRect(var4 - 152, var5, 304, 34, 9179409);
			Pix2D.drawRect(var4 - 151, var5 + 1, 302, 32, 0);
			Pix2D.fillRect(var4 - 150, var5 + 2, loadingStep * 3, 30, 9179409);
			Pix2D.fillRect(var4 + loadingStep * 3 - 150, var5 - -2, 300 - loadingStep * 3, 30, 0);
			Client.b12.centreString(Text.LOADINGDOTDOTDOT, var4, var5 + 20, 16777215, -1);
			return;
		}
		viewMinX = centreX - (int) ((double) arg0 / zoom);
		int var6 = centreX - (int) ((double) arg0 / zoom);
		viewMinY = centreY - (int) ((double) arg1 / zoom);
		viewHeight = (int) ((double) (arg1 * 2) / zoom);
		int var7 = centreY - (int) ((double) arg1 / zoom);
		viewWidth = (int) ((double) (arg0 * 2) / zoom);
		int var8 = (int) ((double) arg0 / zoom) + centreX;
		int var9 = (int) ((double) arg1 / zoom) + centreY;
		drawTiles(arg1 + arg3, arg2 - -arg0, arg2, arg3, var9, var6, var8, var7);
		drawMapFunctionsAndLabels(arg3, arg2, arg2 + arg0, arg1 + arg3, var7, var8, var6, var9);
		if (flashCycle > 0) {
			flashCycle--;
		}
		if (Client.showFps) {
			int var10 = arg2 + arg0 - 5;
			int var11 = arg1 + arg3 - 8;
			Client.p12.rightString(JagString.join(new JagString[]{AUTO_FPS, JagString.method1212(GameShell.fps)}), var10, var11, 16776960, -1);
			int var15 = var11 - 15;
			Runtime var12 = Runtime.getRuntime();
			int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
			int var14 = 16776960;
			if (var13 > 65536) {
				var14 = 16711680;
			}
			Client.p12.rightString(JagString.join(new JagString[]{AUTO_MEM, JagString.method1212(var13), AUTO_MEM_UNIT}), var10, var15, var14, -1);
			var11 = var15 - 15;
		}
	}
}
