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
	public static Js5 configClient;

	@ObfuscatedName("ed.m")
	public static Js5 models;

	@ObfuscatedName("bc.w")
	public static boolean memServer;

	@ObfuscatedName("lf.J")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("gf.g")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("ge.Vb")
	public static LruCache spriteCache = new LruCache(100);

	@ObfuscatedName("he.o")
	public static PixFontGeneric countFont;

	@ObfuscatedName("j.ob")
	public int id;

	@ObfuscatedName("j.wb")
	public int model;

	@ObfuscatedName("pb.rb")
	public static JagString AUTO_NAME = JagString.wrap("null");
	@ObfuscatedName("j.Sb")
	public JagString name = AUTO_NAME;

	@ObfuscatedName("j.Kb")
	public short[] recol_s;

	@ObfuscatedName("j.Ub")
	public short[] recol_d;

	@ObfuscatedName("j.T")
	public short[] retex_s;

	@ObfuscatedName("j.I")
	public short[] retex_d;

	@ObfuscatedName("j.gb")
	public int zoom2d = 2000;

	@ObfuscatedName("j.Pb")
	public int xan2d = 0;

	@ObfuscatedName("j.Fb")
	public int yan2d = 0;

	@ObfuscatedName("j.P")
	public int zan2d = 0;

	@ObfuscatedName("j.Z")
	public int xof2d = 0;

	@ObfuscatedName("j.R")
	public int yof2d = 0;

	@ObfuscatedName("j.yb")
	public int stackable = 0;

	@ObfuscatedName("j.Q")
	public int cost = 1;

	@ObfuscatedName("j.hb")
	public boolean members = false;

	@ObfuscatedName("j.zb")
	public JagString[] op = new JagString[] { null, null, Text.TAKE, null, null };

	@ObfuscatedName("j.Rb")
	public JagString[] iop = new JagString[] { null, null, null, null, Text.DROP};

	@ObfuscatedName("j.ab")
	public int manwear = -1;

	@ObfuscatedName("j.Gb")
	public int manwear2 = -1;

	@ObfuscatedName("j.Tb")
	public int manwearOffsetY = 0;

	@ObfuscatedName("j.pb")
	public int womanwear = -1;

	@ObfuscatedName("j.Db")
	public int womanwear2 = -1;

	@ObfuscatedName("j.U")
	public int womanwearOffsetY = 0;

	@ObfuscatedName("j.V")
	public int manwear3 = -1;

	@ObfuscatedName("j.Jb")
	public int womanwear3 = -1;

	@ObfuscatedName("j.ub")
	public int manhead = -1;

	@ObfuscatedName("j.kb")
	public int manhead2 = -1;

	@ObfuscatedName("j.Nb")
	public int womanhead = -1;

	@ObfuscatedName("j.J")
	public int womanhead2 = -1;

	@ObfuscatedName("j.Bb")
	public int[] countobj;

	@ObfuscatedName("j.N")
	public int[] countco;

	@ObfuscatedName("j.Ab")
	public int certlink = -1;

	@ObfuscatedName("j.db")
	public int certtemplate = -1;

	@ObfuscatedName("j.M")
	public int resizex = 128;

	@ObfuscatedName("j.rb")
	public int resizey = 128;

	@ObfuscatedName("j.K")
	public int resizez = 128;

	@ObfuscatedName("j.W")
	public int ambient = 0;

	@ObfuscatedName("j.Y")
	public int contrast = 0;

	@ObfuscatedName("j.Ob")
	public int team = 0;

	@ObfuscatedName("nd.w")
	public static JagString AUTO_COL_FFFF00 = JagString.wrap("<col=ffff00>");

	@ObfuscatedName("u.R")
	public static JagString AUTO_COL_FFFFFF = JagString.wrap("<col=ffffff>");

	@ObfuscatedName("oe.l")
	public static JagString AUTO_COL_00FF80 = JagString.wrap("<col=00ff80>");

	@ObfuscatedName("g.H")
	public static JagString AUTO_COL_CLOSE = JagString.wrap("<)4col>");

	@ObfuscatedName("cd.a(Lea;Lea;ZLnf;B)V")
	public static void init(Js5 arg0, Js5 arg1, boolean arg2, PixFontGeneric arg3) {
		configClient = arg1;
		models = arg0;
		memServer = arg2;
		configClient.getFileIdLimit(10);
		countFont = arg3;
	}

	@ObfuscatedName("v.a(II)Lj;")
	public static ObjType list(int arg0) {
		ObjType var1 = (ObjType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(10, arg0);
		ObjType var3 = new ObjType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (var3.certtemplate != -1) {
			var3.genCert(list(var3.certlink), list(var3.certtemplate));
		}
		if (!memServer && var3.members) {
			var3.op = null;
			var3.team = 0;
			var3.name = Text.MEMBERS_OBJECT;
			var3.iop = null;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("j.a(B)V")
	public void postDecode() {
	}

	@ObfuscatedName("j.a(Ljd;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("j.a(BLjd;I)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.model = arg0.g2();
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 4) {
			this.zoom2d = arg0.g2();
		} else if (arg1 == 5) {
			this.xan2d = arg0.g2();
		} else if (arg1 == 6) {
			this.yan2d = arg0.g2();
		} else if (arg1 == 7) {
			this.xof2d = arg0.g2();
			if (this.xof2d > 32767) {
				this.xof2d -= 65536;
			}
		} else if (arg1 == 8) {
			this.yof2d = arg0.g2();
			if (this.yof2d > 32767) {
				this.yof2d -= 65536;
			}
		} else if (arg1 == 11) {
			this.stackable = 1;
		} else if (arg1 == 12) {
			this.cost = arg0.g4();
		} else if (arg1 == 16) {
			this.members = true;
		} else if (arg1 == 23) {
			this.manwear = arg0.g2();
			this.manwearOffsetY = arg0.g1();
		} else if (arg1 == 24) {
			this.manwear2 = arg0.g2();
		} else if (arg1 == 25) {
			this.womanwear = arg0.g2();
			this.womanwearOffsetY = arg0.g1();
		} else if (arg1 == 26) {
			this.womanwear2 = arg0.g2();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.op[arg1 - 30] = arg0.gjstr();
			if (this.op[arg1 - 30].equalsIgnoreCase(Text.HIDDEN)) {
				this.op[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.iop[arg1 - 35] = arg0.gjstr();
		} else if (arg1 == 40) {
			int var5 = arg0.g1();
			this.recol_d = new short[var5];
			this.recol_s = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_s[var6] = (short) arg0.g2();
				this.recol_d[var6] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var3 = arg0.g1();
			this.retex_d = new short[var3];
			this.retex_s = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.retex_s[var4] = (short) arg0.g2();
				this.retex_d[var4] = (short) arg0.g2();
			}
		} else if (arg1 == 78) {
			this.manwear3 = arg0.g2();
		} else if (arg1 == 79) {
			this.womanwear3 = arg0.g2();
		} else if (arg1 == 90) {
			this.manhead = arg0.g2();
		} else if (arg1 == 91) {
			this.womanhead = arg0.g2();
		} else if (arg1 == 92) {
			this.manhead2 = arg0.g2();
		} else if (arg1 == 93) {
			this.womanhead2 = arg0.g2();
		} else if (arg1 == 95) {
			this.zan2d = arg0.g2();
		} else if (arg1 == 97) {
			this.certlink = arg0.g2();
		} else if (arg1 == 98) {
			this.certtemplate = arg0.g2();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.countobj == null) {
				this.countco = new int[10];
				this.countobj = new int[10];
			}
			this.countobj[arg1 - 100] = arg0.g2();
			this.countco[arg1 - 100] = arg0.g2();
		} else if (arg1 == 110) {
			this.resizex = arg0.g2();
		} else if (arg1 == 111) {
			this.resizey = arg0.g2();
		} else if (arg1 == 112) {
			this.resizez = arg0.g2();
		} else if (arg1 == 113) {
			this.ambient = arg0.g1b();
		} else if (arg1 == 114) {
			this.contrast = arg0.g1b() * 5;
		} else if (arg1 == 115) {
			this.team = arg0.g1();
		}
	}

	@ObfuscatedName("j.a(Lj;Lj;I)V")
	public void genCert(ObjType arg0, ObjType arg1) {
		this.zan2d = arg1.zan2d;
		this.recol_s = arg1.recol_s;
		this.cost = arg0.cost;
		this.members = arg0.members;
		this.name = arg0.name;
		this.retex_s = arg1.retex_s;
		this.stackable = 1;
		this.yof2d = arg1.yof2d;
		this.model = arg1.model;
		this.zoom2d = arg1.zoom2d;
		this.yan2d = arg1.yan2d;
		this.xan2d = arg1.xan2d;
		this.recol_d = arg1.recol_d;
		this.retex_d = arg1.retex_d;
		this.xof2d = arg1.xof2d;
	}

	@ObfuscatedName("j.c(II)Lp;")
	public ModelUnlit getModelUnlit(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).getModelUnlit(1);
			}
		}
		ModelUnlit var4 = ModelUnlit.load(models, this.model);
		if (var4 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var4.resize(this.resizex, this.resizey, this.resizez);
		}
		if (this.recol_s != null) {
			for (int var5 = 0; var5 < this.recol_s.length; var5++) {
				var4.recolour(this.recol_s[var5], this.recol_d[var5]);
			}
		}
		if (this.retex_s != null) {
			for (int var6 = 0; var6 < this.retex_s.length; var6++) {
				var4.retexture(this.retex_s[var6], this.retex_d[var6]);
			}
		}
		return var4;
	}

	@ObfuscatedName("j.b(II)Lod;")
	public ModelLit getModelLit(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.countco[var3] <= arg0 && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return list(var2).getModelLit(1);
			}
		}
		ModelLit var4 = (ModelLit) modelCache.find((long) this.id);
		if (var4 != null) {
			return var4;
		}
		ModelUnlit var5 = ModelUnlit.load(models, this.model);
		if (var5 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var5.resize(this.resizex, this.resizey, this.resizez);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		if (this.retex_s != null) {
			for (int var7 = 0; var7 < this.retex_s.length; var7++) {
				var5.retexture(this.retex_s[var7], this.retex_d[var7]);
			}
		}
		ModelLit var8 = var5.light(this.ambient + 64, 768 + this.contrast, -50, -10, -50);
		var8.useAABBMouseCheck = true;
		modelCache.put((long) this.id, var8);
		return var8;
	}

	@ObfuscatedName("j.a(BI)Lj;")
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

	@ObfuscatedName("ta.a(IIIZII)Lh;")
	public static Pix32 getSprite(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		long var5 = ((long) arg3 << 40) + ((long) arg0 << 38) + (long) arg1 + ((long) arg4 << 16);
		if (!arg2) {
			Pix32 var7 = (Pix32) spriteCache.find(var5);
			if (var7 != null) {
				return var7;
			}
		}
		ObjType var8 = list(arg1);
		if (arg4 > 1 && var8.countobj != null) {
			int var9 = -1;
			for (int var10 = 0; var10 < 10; var10++) {
				if (arg4 >= var8.countco[var10] && var8.countco[var10] != 0) {
					var9 = var8.countobj[var10];
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
		if (var8.certtemplate != -1) {
			var12 = getSprite(1, var8.certlink, true, 0, 10);
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
		int var18 = var8.zoom2d;
		Pix3D.lowDetail = false;
		if (arg2) {
			var18 = (int) ((double) var18 * 1.5D);
		} else if (arg0 == 2) {
			var18 = (int) ((double) var18 * 1.04D);
		}
		int var19 = Pix3D.sinTable[var8.xan2d] * var18 >> 16;
		int var20 = Pix3D.cosTable[var8.xan2d] * var18 >> 16;
		var11.calcBoundingCylinder();
		var11.objRender(var8.yan2d, var8.zan2d, var8.xan2d, var8.xof2d, var8.yof2d + var19 + var11.minY / 2, var8.yof2d + var20);
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
		if (var8.certtemplate != -1) {
			var12.plotSprite(0, 0);
		}
		if (!arg2 && (var8.stackable == 1 || arg4 != 1) && arg4 != -1) {
			countFont.drawString(invNumber(arg4), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			spriteCache.put(var5, var17);
		}
		Pix2D.setPixels(var13, var14, var15);
		Pix2D.restoreClipping(var16);
		Pix3D.setRenderClipping();
		Pix3D.lowDetail = true;
		return var17;
	}

	@ObfuscatedName("ke.a(IB)Lec;")
	public static JagString invNumber(int arg0) {
		if (arg0 < 100000) {
			return JagString.join(new JagString[] {AUTO_COL_FFFF00, JagString.parseInt(arg0), AUTO_COL_CLOSE});
		} else if (arg0 < 10000000) {
			return JagString.join(new JagString[] {AUTO_COL_FFFFFF, JagString.parseInt(arg0 / 1000), Text.THOUSAND_SHORT, AUTO_COL_CLOSE});
		} else {
			return JagString.join(new JagString[] {AUTO_COL_00FF80, JagString.parseInt(arg0 / 1000000), Text.MILLION_SHORT, AUTO_COL_CLOSE});
		}
	}

	@ObfuscatedName("j.a(ZI)Z")
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

	@ObfuscatedName("j.b(IZ)Lp;")
	public ModelUnlit getWearModelNoCheck(boolean arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear2;
		int var4 = this.manwear3;
		if (arg0) {
			var3 = this.womanwear2;
			var4 = this.womanwear3;
			var2 = this.womanwear;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var5 = ModelUnlit.load(models, var2);
		if (var3 != -1) {
			ModelUnlit var6 = ModelUnlit.load(models, var3);
			if (var4 == -1) {
				ModelUnlit[] var9 = new ModelUnlit[] { var5, var6 };
				var5 = new ModelUnlit(var9, 2);
			} else {
				ModelUnlit var7 = ModelUnlit.load(models, var4);
				ModelUnlit[] var8 = new ModelUnlit[] { var5, var6, var7 };
				var5 = new ModelUnlit(var8, 3);
			}
		}
		if (!arg0 && this.manwearOffsetY != 0) {
			var5.translate(0, this.manwearOffsetY, 0);
		}
		if (arg0 && this.womanwearOffsetY != 0) {
			var5.translate(0, this.womanwearOffsetY, 0);
		}
		if (this.recol_s != null) {
			for (int var10 = 0; var10 < this.recol_s.length; var10++) {
				var5.recolour(this.recol_s[var10], this.recol_d[var10]);
			}
		}
		if (this.retex_s != null) {
			for (int var11 = 0; var11 < this.retex_s.length; var11++) {
				var5.retexture(this.retex_s[var11], this.retex_d[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("j.a(BZ)Z")
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

	@ObfuscatedName("j.c(IZ)Lp;")
	public ModelUnlit getHeadModelNoCheck(boolean arg0) {
		int var2 = this.manhead;
		int var3 = this.manhead2;
		if (arg0) {
			var3 = this.womanhead2;
			var2 = this.womanhead;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var4 = ModelUnlit.load(models, var2);
		if (var3 != -1) {
			ModelUnlit var5 = ModelUnlit.load(models, var3);
			ModelUnlit[] var6 = new ModelUnlit[] { var4, var5 };
			var4 = new ModelUnlit(var6, 2);
		}
		if (this.recol_s != null) {
			for (int var7 = 0; var7 < this.recol_s.length; var7++) {
				var4.recolour(this.recol_s[var7], this.recol_d[var7]);
			}
		}
		if (this.retex_s != null) {
			for (int var8 = 0; var8 < this.retex_s.length; var8++) {
				var4.retexture(this.retex_s[var8], this.retex_d[var8]);
			}
		}
		return var4;
	}

	@ObfuscatedName("ja.a(B)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
		spriteCache.clear();
	}

	@ObfuscatedName("pa.a(B)V")
	public static void resetSpriteCache() {
		spriteCache.clear();
	}
}
