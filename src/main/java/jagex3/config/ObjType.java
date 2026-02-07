package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.PixFontGeneric;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("j")
public final class ObjType extends Linkable2 {

	@ObfuscatedName("fe.J")
	public static Js5 field962;
	@ObfuscatedName("ed.m")
	public static Js5 field692;
	@ObfuscatedName("bc.w")
	public static boolean field193;
	@ObfuscatedName("he.o")
	public static PixFontGeneric field1278;
	@ObfuscatedName("lf.J")
	public static LruCache field1914 = new LruCache(64);
	@ObfuscatedName("ge.Vb")
	public static LruCache field1114 = new LruCache(100);
	@ObfuscatedName("gf.g")
	public static LruCache field1125 = new LruCache(50);
	@ObfuscatedName("nd.w")
	public static JagString field2182 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("u.R")
	public static JagString field3212 = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("oe.l")
	public static JagString field2394 = JagString.wrap("<col=00ff80>");
	@ObfuscatedName("g.H")
	public static JagString field996 = JagString.wrap("<)4col>");
	@ObfuscatedName("j.ab")
	public int field1385 = -1;

	@ObfuscatedName("j.bc")
	public static byte[] field1438 = new byte[520];

	@ObfuscatedName("j.db")
	public int field1388 = -1;

	@ObfuscatedName("j.fb")
	public static int[] field1390 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("j.gb")
	public int field1391 = 2000;

	@ObfuscatedName("j.hb")
	public boolean field1392 = false;

	@ObfuscatedName("j.kb")
	public int field1395 = -1;

	@ObfuscatedName("j.ob")
	public int field1399;

	@ObfuscatedName("j.pb")
	public int field1400 = -1;

	@ObfuscatedName("j.rb")
	public int field1402 = 128;

	@ObfuscatedName("j.ub")
	public int field1405 = -1;

	@ObfuscatedName("j.wb")
	public int field1407;

	@ObfuscatedName("j.J")
	public int field1368 = -1;

	@ObfuscatedName("j.P")
	public int field1374 = 0;

	@ObfuscatedName("j.Z")
	public int field1384 = 0;

	@ObfuscatedName("j.Y")
	public int field1383 = 0;

	@ObfuscatedName("j.K")
	public int field1369 = 128;

	@ObfuscatedName("j.U")
	public int field1379 = 0;

	@ObfuscatedName("j.Ab")
	public int field1411 = -1;

	@ObfuscatedName("j.M")
	public int field1371 = 128;

	@ObfuscatedName("j.Fb")
	public int field1416 = 0;

	@ObfuscatedName("j.V")
	public int field1380 = -1;

	@ObfuscatedName("j.Q")
	public int field1375 = 1;

	@ObfuscatedName("j.Nb")
	public int field1424 = -1;

	@ObfuscatedName("j.Ob")
	public int team = 0;

	@ObfuscatedName("j.zb")
	public JagString[] field1410 = new JagString[] { null, null, Text.TAKE, null, null };

	@ObfuscatedName("j.Gb")
	public int field1417 = -1;

	@ObfuscatedName("j.Jb")
	public int field1420 = -1;

	@ObfuscatedName("j.Db")
	public int field1414 = -1;

	@ObfuscatedName("j.W")
	public int field1381 = 0;

	@ObfuscatedName("j.R")
	public int field1376 = 0;

	@ObfuscatedName("j.yb")
	public int field1409 = 0;

	@ObfuscatedName("j.Rb")
	public JagString[] field1428 = new JagString[] { null, null, null, null, Text.DROP};

	@ObfuscatedName("pb.rb")
	public static JagString field2525 = JagString.wrap("null");
	@ObfuscatedName("j.Sb")
	public JagString field1429 = field2525;

	@ObfuscatedName("j.Tb")
	public int field1430 = 0;

	@ObfuscatedName("j.Pb")
	public int field1426 = 0;

	@ObfuscatedName("j.N")
	public int[] field1372;

	@ObfuscatedName("j.Bb")
	public int[] field1412;

	@ObfuscatedName("j.I")
	public short[] field1367;

	@ObfuscatedName("j.T")
	public short[] field1378;

	@ObfuscatedName("j.Kb")
	public short[] field1421;

	@ObfuscatedName("j.Ub")
	public short[] field1431;

	@ObfuscatedName("v.a(II)Lj;")
	public static ObjType list(int arg0) {
		ObjType var1 = (ObjType) field1914.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field962.getFile(10, arg0);
		ObjType var3 = new ObjType();
		var3.field1399 = arg0;
		if (var2 != null) {
			var3.method475(new Packet(var2));
		}
		var3.method472();
		if (var3.field1388 != -1) {
			var3.method481(list(var3.field1411), list(var3.field1388));
		}
		if (!field193 && var3.field1392) {
			var3.field1410 = null;
			var3.team = 0;
			var3.field1429 = Text.MEMBERS_OBJECT;
			var3.field1428 = null;
		}
		field1914.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("cd.a(Lea;Lea;ZLnf;B)V")
	public static void init(Js5 arg0, Js5 arg1, boolean arg2, PixFontGeneric arg3) {
		field962 = arg1;
		field692 = arg0;
		field193 = arg2;
		field962.getFileIdLimit(10);
		field1278 = arg3;
	}

	@ObfuscatedName("ke.a(IB)Lec;")
	public static JagString method598(int arg0) {
		if (arg0 < 100000) {
			return JagString.join(new JagString[] { field2182, JagString.parseInt(arg0), field996 });
		} else if (arg0 < 10000000) {
			return JagString.join(new JagString[] { field3212, JagString.parseInt(arg0 / 1000), Text.field2052, field996 });
		} else {
			return JagString.join(new JagString[] { field2394, JagString.parseInt(arg0 / 1000000), Text.field1041, field996 });
		}
	}

	@ObfuscatedName("ta.a(IIIZII)Lh;")
	public static Pix32 method1016(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		long var5 = ((long) arg3 << 40) + ((long) arg0 << 38) + (long) arg1 + ((long) arg4 << 16);
		if (!arg2) {
			Pix32 var7 = (Pix32) field1114.find(var5);
			if (var7 != null) {
				return var7;
			}
		}
		ObjType var8 = list(arg1);
		if (arg4 > 1 && var8.field1412 != null) {
			int var9 = -1;
			for (int var10 = 0; var10 < 10; var10++) {
				if (arg4 >= var8.field1372[var10] && var8.field1372[var10] != 0) {
					var9 = var8.field1412[var10];
				}
			}
			if (var9 != -1) {
				var8 = list(var9);
			}
		}
		ModelLit var11 = var8.getModelLit(1);
		if (var11 == null) {
			return null;
		}
		Pix32 var12 = null;
		if (var8.field1388 != -1) {
			var12 = method1016(1, var8.field1411, true, 0, 10);
			if (var12 == null) {
				return null;
			}
		}
		int[] var13 = Pix2D.pixels;
		int var14 = Pix2D.width;
		int var15 = Pix2D.height;
		int[] var16 = new int[4];
		Pix2D.saveClipping(var16);
		Pix32 var17 = new Pix32(36, 32);
		Pix2D.setPixels(var17.data, 36, 32);
		Pix2D.cls();
		Pix3D.setRenderClipping();
		Pix3D.setOrigin(16, 16);
		int var18 = var8.field1391;
		Pix3D.field118 = false;
		if (arg2) {
			var18 = (int) ((double) var18 * 1.5D);
		} else if (arg0 == 2) {
			var18 = (int) ((double) var18 * 1.04D);
		}
		int var19 = Pix3D.sinTable[var8.field1426] * var18 >> 16;
		int var20 = Pix3D.cosTable[var8.field1426] * var18 >> 16;
		var11.calcBoundingCylinder();
		var11.method813(var8.field1416, var8.field1374, var8.field1426, var8.field1384, var8.field1376 + var19 + var11.minY / 2, var8.field1376 + var20);
		if (arg0 >= 1) {
			var17.addOutline(1);
		}
		if (arg0 >= 2) {
			var17.addOutline(16777215);
		}
		if (arg3 != 0) {
			var17.addShadow(arg3);
		}
		Pix2D.setPixels(var17.data, 36, 32);
		if (var8.field1388 != -1) {
			var12.plotSprite(0, 0);
		}
		if (!arg2 && (var8.field1409 == 1 || arg4 != 1) && arg4 != -1) {
			field1278.drawString(method598(arg4), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			field1114.put(var5, var17);
		}
		Pix2D.setPixels(var13, var14, var15);
		Pix2D.restoreClipping(var16);
		Pix3D.setRenderClipping();
		Pix3D.field118 = true;
		return var17;
	}

	@ObfuscatedName("ja.a(B)V")
	public static void method487() {
		field1914.clear();
		field1125.clear();
		field1114.clear();
	}

	@ObfuscatedName("pa.a(B)V")
	public static void method857() {
		field1114.clear();
	}

	@ObfuscatedName("j.a(BZ)Z")
	public boolean checkHeadModel(boolean arg0) {
		int var2 = this.field1405;
		int var3 = this.field1395;
		if (arg0) {
			var3 = this.field1368;
			var2 = this.field1424;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!field692.requestDownload(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !field692.requestDownload(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("j.b(IZ)Lp;")
	public ModelUnlit method469(boolean arg0) {
		int var2 = this.field1385;
		int var3 = this.field1417;
		int var4 = this.field1380;
		if (arg0) {
			var3 = this.field1414;
			var4 = this.field1420;
			var2 = this.field1400;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var5 = ModelUnlit.method840(field692, var2);
		if (var3 != -1) {
			ModelUnlit var6 = ModelUnlit.method840(field692, var3);
			if (var4 == -1) {
				ModelUnlit[] var9 = new ModelUnlit[] { var5, var6 };
				var5 = new ModelUnlit(var9, 2);
			} else {
				ModelUnlit var7 = ModelUnlit.method840(field692, var4);
				ModelUnlit[] var8 = new ModelUnlit[] { var5, var6, var7 };
				var5 = new ModelUnlit(var8, 3);
			}
		}
		if (!arg0 && this.field1430 != 0) {
			var5.method834(0, this.field1430, 0);
		}
		if (arg0 && this.field1379 != 0) {
			var5.method834(0, this.field1379, 0);
		}
		if (this.field1421 != null) {
			for (int var10 = 0; var10 < this.field1421.length; var10++) {
				var5.recolour(this.field1421[var10], this.field1431[var10]);
			}
		}
		if (this.field1378 != null) {
			for (int var11 = 0; var11 < this.field1378.length; var11++) {
				var5.method853(this.field1378[var11], this.field1367[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("j.b(II)Lod;")
	public ModelLit getModelLit(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.field1372[var3] <= arg0 && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).getModelLit(1);
			}
		}
		ModelLit var4 = (ModelLit) field1125.find((long) this.field1399);
		if (var4 != null) {
			return var4;
		}
		ModelUnlit var5 = ModelUnlit.method840(field692, this.field1407);
		if (var5 == null) {
			return null;
		}
		if (this.field1371 != 128 || this.field1402 != 128 || this.field1369 != 128) {
			var5.method855(this.field1371, this.field1402, this.field1369);
		}
		if (this.field1421 != null) {
			for (int var6 = 0; var6 < this.field1421.length; var6++) {
				var5.recolour(this.field1421[var6], this.field1431[var6]);
			}
		}
		if (this.field1378 != null) {
			for (int var7 = 0; var7 < this.field1378.length; var7++) {
				var5.method853(this.field1378[var7], this.field1367[var7]);
			}
		}
		ModelLit var8 = var5.light(this.field1381 + 64, 768 - -this.field1383, -50, -10, -50);
		var8.useAABBMouseCheck = true;
		field1125.put((long) this.field1399, var8);
		return var8;
	}

	@ObfuscatedName("j.a(BI)Lj;")
	public ObjType method471(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1372[var3] && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return list(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("j.a(B)V")
	public void method472() {
	}

	@ObfuscatedName("j.c(IZ)Lp;")
	public ModelUnlit method473(boolean arg0) {
		int var2 = this.field1405;
		int var3 = this.field1395;
		if (arg0) {
			var3 = this.field1368;
			var2 = this.field1424;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var4 = ModelUnlit.method840(field692, var2);
		if (var3 != -1) {
			ModelUnlit var5 = ModelUnlit.method840(field692, var3);
			ModelUnlit[] var6 = new ModelUnlit[] { var4, var5 };
			var4 = new ModelUnlit(var6, 2);
		}
		if (this.field1421 != null) {
			for (int var7 = 0; var7 < this.field1421.length; var7++) {
				var4.recolour(this.field1421[var7], this.field1431[var7]);
			}
		}
		if (this.field1378 != null) {
			for (int var8 = 0; var8 < this.field1378.length; var8++) {
				var4.method853(this.field1378[var8], this.field1367[var8]);
			}
		}
		return var4;
	}

	@ObfuscatedName("j.a(Ljd;I)V")
	public void method475(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method477(arg0, var2);
		}
	}

	@ObfuscatedName("j.a(BLjd;I)V")
	public void method477(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field1407 = arg0.g2();
		} else if (arg1 == 2) {
			this.field1429 = arg0.method555();
		} else if (arg1 == 4) {
			this.field1391 = arg0.g2();
		} else if (arg1 == 5) {
			this.field1426 = arg0.g2();
		} else if (arg1 == 6) {
			this.field1416 = arg0.g2();
		} else if (arg1 == 7) {
			this.field1384 = arg0.g2();
			if (this.field1384 > 32767) {
				this.field1384 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.field1376 = arg0.g2();
			if (this.field1376 > 32767) {
				this.field1376 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.field1409 = 1;
			return;
		} else if (arg1 == 12) {
			this.field1375 = arg0.g4();
		} else if (arg1 == 16) {
			this.field1392 = true;
			return;
		} else if (arg1 == 23) {
			this.field1385 = arg0.g2();
			this.field1430 = arg0.g1();
			return;
		} else if (arg1 == 24) {
			this.field1417 = arg0.g2();
			return;
		} else {
			if (arg1 == 25) {
				this.field1400 = arg0.g2();
				this.field1379 = arg0.g1();
			} else if (arg1 == 26) {
				this.field1414 = arg0.g2();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.field1410[arg1 - 30] = arg0.method555();
				if (this.field1410[arg1 - 30].method271(Text.HIDDEN)) {
					this.field1410[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 != 41) {
						if (arg1 == 78) {
							this.field1380 = arg0.g2();
							return;
						}
						if (arg1 != 79) {
							if (arg1 != 90) {
								if (arg1 == 91) {
									this.field1424 = arg0.g2();
									return;
								}
								if (arg1 == 92) {
									this.field1395 = arg0.g2();
									return;
								}
								if (arg1 == 93) {
									this.field1368 = arg0.g2();
									return;
								}
								if (arg1 == 95) {
									this.field1374 = arg0.g2();
									return;
								}
								if (arg1 != 97) {
									if (arg1 == 98) {
										this.field1388 = arg0.g2();
										return;
									}
									if (arg1 >= 100 && arg1 < 110) {
										if (this.field1412 == null) {
											this.field1372 = new int[10];
											this.field1412 = new int[10];
										}
										this.field1412[arg1 - 100] = arg0.g2();
										this.field1372[arg1 - 100] = arg0.g2();
										return;
									}
									if (arg1 == 110) {
										this.field1371 = arg0.g2();
										return;
									}
									if (arg1 == 111) {
										this.field1402 = arg0.g2();
										return;
									}
									if (arg1 != 112) {
										if (arg1 == 113) {
											this.field1381 = arg0.g1b();
											return;
										}
										if (arg1 == 114) {
											this.field1383 = arg0.g1b() * 5;
										} else if (arg1 == 115) {
											this.team = arg0.g1();
											return;
										}
										return;
									}
									this.field1369 = arg0.g2();
									return;
								}
								this.field1411 = arg0.g2();
								return;
							}
							this.field1405 = arg0.g2();
							return;
						}
						this.field1420 = arg0.g2();
						return;
					}
					int var3 = arg0.g1();
					this.field1367 = new short[var3];
					this.field1378 = new short[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field1378[var4] = (short) arg0.g2();
						this.field1367[var4] = (short) arg0.g2();
					}
					return;
				}
				int var5 = arg0.g1();
				this.field1431 = new short[var5];
				this.field1421 = new short[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1421[var6] = (short) arg0.g2();
					this.field1431[var6] = (short) arg0.g2();
				}
				return;
			} else {
				this.field1428[arg1 - 35] = arg0.method555();
				return;
			}
			return;
		}
	}

	@ObfuscatedName("j.a(ZI)Z")
	public boolean checkWearModel(boolean arg0) {
		int var2 = this.field1385;
		int var3 = this.field1417;
		int var4 = this.field1380;
		if (arg0) {
			var4 = this.field1420;
			var3 = this.field1414;
			var2 = this.field1400;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!field692.requestDownload(var2, 0)) {
			var5 = false;
		}
		if (var3 != -1 && !field692.requestDownload(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !field692.requestDownload(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("j.a(Lj;Lj;I)V")
	public void method481(ObjType arg0, ObjType arg1) {
		this.field1374 = arg1.field1374;
		this.field1421 = arg1.field1421;
		this.field1375 = arg0.field1375;
		this.field1392 = arg0.field1392;
		this.field1429 = arg0.field1429;
		this.field1378 = arg1.field1378;
		this.field1409 = 1;
		this.field1376 = arg1.field1376;
		this.field1407 = arg1.field1407;
		this.field1391 = arg1.field1391;
		this.field1416 = arg1.field1416;
		this.field1426 = arg1.field1426;
		this.field1431 = arg1.field1431;
		this.field1367 = arg1.field1367;
		this.field1384 = arg1.field1384;
	}

	@ObfuscatedName("j.c(II)Lp;")
	public ModelUnlit method482(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1372[var3] && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).method482(1);
			}
		}
		ModelUnlit var4 = ModelUnlit.method840(field692, this.field1407);
		if (var4 == null) {
			return null;
		}
		if (this.field1371 != 128 || this.field1402 != 128 || this.field1369 != 128) {
			var4.method855(this.field1371, this.field1402, this.field1369);
		}
		if (this.field1421 != null) {
			for (int var5 = 0; var5 < this.field1421.length; var5++) {
				var4.recolour(this.field1421[var5], this.field1431[var5]);
			}
		}
		if (this.field1378 != null) {
			for (int var6 = 0; var6 < this.field1378.length; var6++) {
				var4.method853(this.field1378[var6], this.field1367[var6]);
			}
		}
		return var4;
	}
}
