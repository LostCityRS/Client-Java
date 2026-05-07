package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.Model;
import jagex3.dash3d.Pix3D;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("ta")
public final class ObjType extends Linkable2 {

	@ObfuscatedName("pe.Yb")
	public static boolean memServer;
	@ObfuscatedName("ca.j")
	public static Js5 models;
	@ObfuscatedName("ie.q")
	public static Js5 configClient;
	@ObfuscatedName("kc.z")
	public static int numDefinitions;
	@ObfuscatedName("gb.t")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("ba.jb")
	public static LruCache spriteCache = new LruCache(100);
	@ObfuscatedName("ub.i")
	public static LruCache modelCache = new LruCache(50);
	@ObfuscatedName("ta.ac")
	public int womanwearOffsetY = 0;

	@ObfuscatedName("ta.bc")
	public int yan2d = 0;

	@ObfuscatedName("ta.cc")
	public int[] countobj;

	@ObfuscatedName("ta.ec")
	public int resizez = 128;

	@ObfuscatedName("ta.fc")
	public int[] countco;

	@ObfuscatedName("ta.hc")
	public int manwear = -1;

	@ObfuscatedName("ta.lc")
	public int contrast = 0;

	@ObfuscatedName("ta.mc")
	public int manhead2 = -1;

	@ObfuscatedName("ta.pc")
	public int xan2d = 0;

	@ObfuscatedName("ta.qc")
	public int womanwear3 = -1;

	@ObfuscatedName("ta.sb")
	public int stackable = 0;

	@ObfuscatedName("ua.s")
	public static JagString field3017 = JagString.wrap("null");
	@ObfuscatedName("ta.tb")
	public JagString name = field3017;

	@ObfuscatedName("ta.tc")
	public int womanwear = -1;

	@ObfuscatedName("ta.uc")
	public boolean members = false;

	@ObfuscatedName("ta.wb")
	public JagString[] iop = new JagString[]{null, null, null, null, Text.DROP};

	@ObfuscatedName("ta.wc")
	public int womanhead = -1;

	@ObfuscatedName("ta.xb")
	public int manhead = -1;

	@ObfuscatedName("ta.Pb")
	public int manwearOffsetY = 0;

	@ObfuscatedName("ta.Hb")
	public int yof2d = 0;

	@ObfuscatedName("ta.Zb")
	public int cost = 1;

	@ObfuscatedName("ta.Db")
	public int xof2d = 0;

	@ObfuscatedName("ta.Wb")
	public int ambient = 0;

	@ObfuscatedName("ta.Rb")
	public int manwear2 = -1;

	@ObfuscatedName("ta.Bb")
	public JagString[] op = new JagString[]{null, null, Text.TAKE, null, null};

	@ObfuscatedName("ta.Kb")
	public int resizex = 128;

	@ObfuscatedName("ta.Eb")
	public int certtemplate = -1;

	@ObfuscatedName("ta.Tb")
	public int womanhead2 = -1;

	@ObfuscatedName("ta.Ob")
	public int zoom2d = 2000;

	@ObfuscatedName("ta.Vb")
	public int manwear3 = -1;

	@ObfuscatedName("ta.Ub")
	public int team = 0;

	@ObfuscatedName("ta.Yb")
	public int zan2d = 0;

	@ObfuscatedName("ta.Qb")
	public int womanwear2 = -1;

	@ObfuscatedName("ta.yc")
	public int resizey = 128;

	@ObfuscatedName("ta.Jb")
	public int certlink = -1;

	@ObfuscatedName("ta.Cb")
	public int model;

	@ObfuscatedName("ta.xc")
	public int id;

	@ObfuscatedName("ta.Ab")
	public int[] recol_d;

	@ObfuscatedName("ta.Nb")
	public int[] recol_s;

	@ObfuscatedName("oe.a(II)Lta;")
	public static ObjType list(int arg0) {
		ObjType var1 = (ObjType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 10);
		ObjType var3 = new ObjType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (var3.certtemplate != -1) {
			var3.genCert(list(var3.certtemplate), list(var3.certlink));
		}
		if (!memServer && var3.members) {
			var3.iop = null;
			var3.team = 0;
			var3.op = null;
			var3.name = Text.MEMBERS_OBJECT;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("oa.a(Lbd;ZLbd;I)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		memServer = arg1;
		models = arg2;
		configClient = arg0;
		numDefinitions = configClient.getFileIdLimit(10);
	}

	@ObfuscatedName("va.b(IIII)Ljd;")
	public static Pix32 getSprite(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			Pix32 var3 = (Pix32) spriteCache.find((long) arg1);
			if (var3 != null && var3.ohi != arg0 && var3.ohi != -1) {
				var3.unlink();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		ObjType var4 = list(arg1);
		if (var4.countobj == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.countco[var6] && var4.countco[var6] != 0) {
					var5 = var4.countobj[var6];
				}
			}
			if (var5 != -1) {
				var4 = list(var5);
			}
		}
		Model var7 = var4.getModelLit(true, 1);
		if (var7 == null) {
			return null;
		}
		Pix32 var8 = null;
		if (var4.certtemplate != -1) {
			var8 = getSprite(10, var4.certlink, -1);
			if (var8 == null) {
				return null;
			}
		}
		int[] var9 = Pix2D.pixels;
		int var10 = Pix2D.height;
		int var11 = Pix2D.width;
		int var12 = Pix2D.clipMinX;
		int var13 = Pix2D.clipMaxX;
		int var14 = Pix2D.clipMinY;
		int var15 = Pix2D.clipMaxY;
		int[] var16 = Pix3D.saveClipping();
		int var17 = Pix3D.height;
		int var18 = Pix3D.width;
		Pix32 var19 = new Pix32(32, 32);
		Pix2D.setPixels(var19.data, 32, 32);
		Pix3D.field2909 = Pix2D.restoreClipping(Pix3D.field2909);
		Pix2D.fillRect(0, 0, 32, 32, 0);
		int var20 = var4.zoom2d;
		if (arg2 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg2 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		Pix3D.lowDetail = false;
		int var21 = Pix3D.sinTable[var4.xan2d] * var20 >> 16;
		int var22 = Pix3D.cosTable[var4.xan2d] * var20 >> 16;
		var7.calcBoundingCylinder();
		var7.objRender(var4.yan2d, var4.zan2d, var4.xan2d, var4.xof2d, var7.minY / 2 + var4.yof2d + var21, var4.yof2d + var22);
		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var19.data[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var19.data[var24 * 32 + var23 - 1] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var19.data[var23 + (var24 - 1) * 32] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var19.data[var24 * 32 + var23 + 1] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var19.data[(var24 + 1) * 32 + var23] > 1) {
						var19.data[var24 * 32 + var23] = 1;
					}
				}
			}
		}
		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var19.data[var25 + var26 * 32] == 0) {
						if (var25 > 0 && var19.data[var26 * 32 + var25 - 1] == 1) {
							var19.data[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var19.data[var25 + (var26 - 1) * 32] == 1) {
							var19.data[var25 + var26 * 32] = arg2;
						} else if (var25 < 31 && var19.data[var25 + var26 * 32 + 1] == 1) {
							var19.data[var25 + var26 * 32] = arg2;
						} else if (var26 < 31 && var19.data[var26 * 32 + var25 + 32] == 1) {
							var19.data[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var19.data[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var19.data[var27 + (var28 - 1) * 32 - 1] > 0) {
						var19.data[var28 * 32 + var27] = 3153952;
					}
				}
			}
		}
		if (var4.certtemplate != -1) {
			int var29 = var8.ohi;
			int var30 = var8.owi;
			var8.ohi = 32;
			var8.owi = 32;
			var8.plotSprite(0, 0);
			var8.owi = var30;
			var8.ohi = var29;
		}
		if (arg2 == 0) {
			spriteCache.put((long) arg1, var19);
		}
		Pix2D.setPixels(var9, var11, var10);
		Pix2D.setSubClipping(var12, var14, var13, var15);
		Pix2D.restoreClipping(var16);
		Pix3D.height = var17;
		Pix3D.width = var18;
		Pix3D.setRenderClipping();
		Pix3D.lowDetail = true;
		if (var4.stackable == 1) {
			var19.owi = 33;
		} else {
			var19.owi = 32;
		}
		var19.ohi = arg0;
		return var19;
	}

	@ObfuscatedName("ca.a(B)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
		spriteCache.clear();
	}

    @ObfuscatedName("qd.b(IB)La;")
    public static JagString invNumber(int arg0) {
        if (arg0 < 100000) {
            return JagString.parseInt(arg0);
        } else if (arg0 < 10000000) {
            return JagString.join(new JagString[]{JagString.parseInt(arg0 / 1000), Text.THOUSAND_SHORT});
        } else {
            return JagString.join(new JagString[]{JagString.parseInt(arg0 / 1000000), Text.MILLION_SHORT});
        }
    }

    @ObfuscatedName("j.d(B)V")
    public static void resetSpriteCache() {
        spriteCache.clear();
    }

    @ObfuscatedName("ta.a(BZ)Z")
	public boolean checkHeadModel(boolean arg0) {
		int var2 = this.manhead;
		int var3 = this.manhead2;
		if (arg0) {
			var3 = this.womanhead2;
			var2 = this.womanhead;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!models.requestDownload(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !models.requestDownload(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("ta.a(ZB)Z")
	public boolean checkWearModel(boolean arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear2;
		int var4 = this.manwear3;
		if (arg0) {
			var4 = this.womanwear3;
			var3 = this.womanwear2;
			var2 = this.womanwear;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!models.requestDownload(var2, 0)) {
			var5 = false;
		}
		if (var3 != -1 && !models.requestDownload(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !models.requestDownload(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ta.a(ZI)Lpa;")
	public Model getWearModelNoCheck(boolean arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear2;
		int var4 = this.manwear3;
		if (arg0) {
			var2 = this.womanwear;
			var3 = this.womanwear2;
			var4 = this.womanwear3;
		}
		if (var2 == -1) {
			return null;
		}
		Model var5 = Model.load(models, var2);
		if (var3 != -1) {
			Model var6 = Model.load(models, var3);
			if (var4 == -1) {
				Model[] var7 = new Model[]{var5, var6};
				var5 = new Model(var7, 2);
			} else {
				Model var8 = Model.load(models, var4);
				Model[] var9 = new Model[]{var5, var6, var8};
				var5 = new Model(var9, 3);
			}
		}
		if (!arg0 && this.manwearOffsetY != 0) {
			var5.translate(0, this.manwearOffsetY, 0);
		}
		if (arg0 && this.womanwearOffsetY != 0) {
			var5.translate(0, this.womanwearOffsetY, 0);
		}
		if (this.recol_d != null) {
			for (int var10 = 0; var10 < this.recol_d.length; var10++) {
				var5.recolour(this.recol_d[var10], this.recol_s[var10]);
			}
		}
		return var5;
	}

	@ObfuscatedName("ta.f(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("ta.a(BI)Lta;")
	public ObjType getStackSizeAlt(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return list(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("ta.b(ZB)Lpa;")
	public Model getHeadModelNoCheck(boolean arg0) {
		int var2 = this.manhead;
		int var3 = this.manhead2;
		if (arg0) {
			var2 = this.womanhead;
			var3 = this.womanhead2;
		}
		if (var2 == -1) {
			return null;
		}
		Model var4 = Model.load(models, var2);
		if (var3 != -1) {
			Model var5 = Model.load(models, var3);
			Model[] var6 = new Model[]{var4, var5};
			var4 = new Model(var6, 2);
		}
		if (this.recol_d != null) {
			for (int var7 = 0; var7 < this.recol_d.length; var7++) {
				var4.recolour(this.recol_d[var7], this.recol_s[var7]);
			}
		}
		return var4;
	}

	@ObfuscatedName("ta.a(IILba;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.model = arg1.g2();
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 4) {
			this.zoom2d = arg1.g2();
		} else if (arg0 == 5) {
			this.xan2d = arg1.g2();
		} else if (arg0 == 6) {
			this.yan2d = arg1.g2();
		} else if (arg0 == 7) {
			this.xof2d = arg1.g2();
			if (this.xof2d > 32767) {
				this.xof2d -= 65536;
			}
		} else if (arg0 == 8) {
			this.yof2d = arg1.g2();
			if (this.yof2d > 32767) {
				this.yof2d -= 65536;
			}
		} else if (arg0 == 11) {
			this.stackable = 1;
		} else if (arg0 == 12) {
			this.cost = arg1.g4();
		} else if (arg0 == 16) {
			this.members = true;
		} else if (arg0 == 23) {
			this.manwear = arg1.g2();
			this.manwearOffsetY = arg1.g1();
		} else if (arg0 == 24) {
			this.manwear2 = arg1.g2();
		} else if (arg0 == 25) {
			this.womanwear = arg1.g2();
			this.womanwearOffsetY = arg1.g1();
		} else if (arg0 == 26) {
			this.womanwear2 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.op[arg0 - 30] = arg1.gjstr();
			if (this.op[arg0 - 30].equalsIgnoreCase(Text.HIDDEN)) {
				this.op[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.iop[arg0 - 35] = arg1.gjstr();
		} else if (arg0 == 40) {
			int var3 = arg1.g1();
			this.recol_s = new int[var3];
			this.recol_d = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.recol_d[var4] = arg1.g2();
				this.recol_s[var4] = arg1.g2();
			}
		} else if (arg0 == 78) {
			this.manwear3 = arg1.g2();
		} else if (arg0 == 79) {
			this.womanwear3 = arg1.g2();
		} else if (arg0 == 90) {
			this.manhead = arg1.g2();
		} else if (arg0 == 91) {
			this.womanhead = arg1.g2();
		} else if (arg0 == 92) {
			this.manhead2 = arg1.g2();
		} else if (arg0 == 93) {
			this.womanhead2 = arg1.g2();
		} else if (arg0 == 95) {
			this.zan2d = arg1.g2();
		} else if (arg0 == 97) {
			this.certlink = arg1.g2();
		} else if (arg0 == 98) {
			this.certtemplate = arg1.g2();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.countobj == null) {
				this.countco = new int[10];
				this.countobj = new int[10];
			}
			this.countobj[arg0 - 100] = arg1.g2();
			this.countco[arg0 - 100] = arg1.g2();
		} else if (arg0 == 110) {
			this.resizex = arg1.g2();
		} else if (arg0 == 111) {
			this.resizey = arg1.g2();
		} else if (arg0 == 112) {
			this.resizez = arg1.g2();
		} else if (arg0 == 113) {
			this.ambient = arg1.g1b();
		} else if (arg0 == 114) {
			this.contrast = arg1.g1b() * 5;
		} else if (arg0 == 115) {
			this.team = arg1.g1();
		}
	}

	@ObfuscatedName("ta.a(Lba;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("ta.a(Lta;ZLta;)V")
	public void genCert(ObjType arg0, ObjType arg1) {
		this.xan2d = arg0.xan2d;
		this.xof2d = arg0.xof2d;
		this.zan2d = arg0.zan2d;
		this.name = arg1.name;
		this.cost = arg1.cost;
		this.stackable = 1;
		this.zoom2d = arg0.zoom2d;
		this.members = arg1.members;
		this.recol_s = arg0.recol_s;
		this.recol_d = arg0.recol_d;
		this.yan2d = arg0.yan2d;
		this.yof2d = arg0.yof2d;
		this.model = arg0.model;
	}

	@ObfuscatedName("ta.a(ZII)Lpa;")
	public Model getModelLit(boolean arg0, int arg1) {
		if (this.countobj != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.countco[var4] && this.countco[var4] != 0) {
					var3 = this.countobj[var4];
				}
			}
			if (var3 != -1) {
				return list(var3).getModelLit(arg0, 1);
			}
		}
		if (arg0) {
			Model var5 = (Model) modelCache.find((long) this.id);
			if (var5 != null) {
				return var5;
			}
		}
		Model var6 = Model.load(models, this.model);
		if (var6 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var6.resize(this.resizex, this.resizey, this.resizez);
		}
		if (this.recol_d != null) {
			for (int var7 = 0; var7 < this.recol_d.length; var7++) {
				var6.recolour(this.recol_d[var7], this.recol_s[var7]);
			}
		}
		if (arg0) {
			var6.light(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
			var6.useAABBMouseCheck = true;
			modelCache.put((long) this.id, var6);
		}
		return var6;
	}
}
