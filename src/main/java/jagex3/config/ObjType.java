package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.client.Client;
import jagex3.client.ClientMouseListener;
import jagex3.constants.Text;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.SoftwarePix32;
import jagex3.graphics.SoftwarePixFont;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntMath;

@ObfuscatedName("ng")
public final class ObjType extends Linkable2 {

	@ObfuscatedName("td.V")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("wb.j")
	public static final ModelSourceCache modelCache = new ModelSourceCache(50);
	@ObfuscatedName("sj.c")
	public static final LruCache spriteCache = new LruCache(100);
	@ObfuscatedName("vg.p")
	public static Js5 configClient;
	@ObfuscatedName("n.k")
	public static boolean memServer;
	@ObfuscatedName("od.x")
	public static Js5 models;
	@ObfuscatedName("sf.o")
	public static int numDefinitions;
	@ObfuscatedName("qf.S")
	public static SoftwarePixFont countFont;
	@ObfuscatedName("k.N")
	public static short[] clientpalette = new short[256];
	@ObfuscatedName("ng.ab")
	public int manwearOffsetY = 0;

	@ObfuscatedName("ng.bb")
	public int womanwear3 = -1;

	@ObfuscatedName("ng.eb")
	public boolean stockmarket = false;

	@ObfuscatedName("ng.fb")
	public int model;

	@ObfuscatedName("ng.gb")
	public short[] retex_s;

	@ObfuscatedName("ng.ib")
	public int womanhead2 = -1;

	@ObfuscatedName("ng.jb")
	public int ambient = 0;

	@ObfuscatedName("ng.kb")
	public int certtemplate = -1;

	@ObfuscatedName("ng.mb")
	public HashTable params;

	@ObfuscatedName("ng.nb")
	public int yof2d = 0;

	@ObfuscatedName("ng.ob")
	public int resizez = 128;

	@ObfuscatedName("ng.pb")
	public int yan2d = 0;

	@ObfuscatedName("ng.qb")
	public int xan2d = 0;

	@ObfuscatedName("ng.rb")
	public int lentlink = -1;

	@ObfuscatedName("ng.sb")
	public int manwear2 = -1;

	@ObfuscatedName("ng.tb")
	public int xof2d = 0;

	@ObfuscatedName("ng.ub")
	public boolean members = false;

	@ObfuscatedName("ng.wb")
	public int womanwearOffsetY = 0;

	@ObfuscatedName("ng.G")
	public int manhead2 = -1;

	@ObfuscatedName("ng.K")
	public int manwear3 = -1;

	@ObfuscatedName("ng.D")
	public int team = 0;

	@ObfuscatedName("ng.V")
	public int stackable = 0;

	@ObfuscatedName("ng.Q")
	public int zan2d = 0;

	@ObfuscatedName("ng.R")
	public int manhead = -1;

	@ObfuscatedName("ng.L")
	public int resizey = 128;

	@ObfuscatedName("ng.W")
	public int womanwear = -1;

	@ObfuscatedName("ng.X")
	public int cost = 1;

	@ObfuscatedName("ng.T")
	public int dummyitem = 0;

	@ObfuscatedName("ng.Ib")
	public int womanhead = -1;

	@ObfuscatedName("ng.Gb")
	public int zoom2d = 2000;

	@ObfuscatedName("ng.Bb")
	public int lenttemplate = -1;

	@ObfuscatedName("ng.Hb")
	public int resizex = 128;

	@ObfuscatedName("ng.xb")
	public int womanwear2 = -1;

	@ObfuscatedName("ng.J")
	public int certlink = -1;

	@ObfuscatedName("aa.Q")
	public static final JagString NULL = JagString.wrap("null");
	@ObfuscatedName("ng.Jb")
	public JagString name = NULL;

	@ObfuscatedName("ng.Pb")
	public JagString[] op = new JagString[] { null, null, Text.TAKE, null, null };

	@ObfuscatedName("ng.Fb")
	public int manwear = -1;

	@ObfuscatedName("ng.I")
	public int contrast = 0;

	@ObfuscatedName("ng.Vb")
	public JagString[] iop = new JagString[] { null, null, null, null, Text.DROP };

	@ObfuscatedName("ng.N")
	public int id;

	@ObfuscatedName("ng.Eb")
	public byte[] recol_d_palette;

	@ObfuscatedName("ng.O")
	public int[] countco;

	@ObfuscatedName("ng.Ub")
	public int[] countobj;

	@ObfuscatedName("ng.F")
	public short[] retex_d;

	@ObfuscatedName("ng.S")
	public short[] recol_d;

	@ObfuscatedName("ng.Y")
	public short[] recol_s;

	@ObfuscatedName("ng.H")
	public int[][] field2839;

	@ObfuscatedName("ge.a(IB)Lng;")
	public static ObjType list(int arg0) {
		ObjType var1 = (ObjType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(getGroupId(arg0), getFileId(arg0));
		ObjType var3 = new ObjType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (var3.certtemplate != -1) {
			var3.genCert(list(var3.certlink), list(var3.certtemplate));
		}
		if (var3.lenttemplate != -1) {
			var3.genLent(list(var3.lentlink), list(var3.lenttemplate));
		}
		if (!memServer && var3.members) {
			var3.team = 0;
			var3.op = null;
			var3.stockmarket = false;
			var3.name = Text.MEMBERS_OBJECT;
			var3.iop = null;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("fb.f(I)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
		spriteCache.clear();
	}

	@ObfuscatedName("rd.a(ZLnb;Ldg;Lnb;B)V")
	public static void init(boolean arg0, Js5 arg1, SoftwarePixFont arg2, Js5 arg3) {
		models = arg3;
		memServer = arg0;
		configClient = arg1;
		int var4 = configClient.getGroupCount() - 1;
		numDefinitions = var4 * 256 + configClient.getFileIdLimit(var4);
		countFont = arg2;
	}

	@ObfuscatedName("af.d(B)V")
	public static void resetModelCache() {
		modelCache.clear();
	}

	@ObfuscatedName("sh.c(B)V")
	public static void resetSpriteCache() {
		spriteCache.clear();
	}

	@ObfuscatedName("bj.a(IBIIZI)Lrc;")
	public static Pix32 getSprite(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		long var5 = ((long) arg4 << 40) + ((long) arg2 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L) + ((long) arg0 << 38);
		Pix32 var7 = (Pix32) spriteCache.find(var5);
		if (var7 != null) {
			return var7;
		}
		Pix3D.textureFallback = false;
		Pix32 var8 = getSpriteInner(arg1, arg2, arg4, arg0, false, arg3);
		if (var8 != null && !Pix3D.textureFallback) {
			spriteCache.put(var5, var8);
		}
		return var8;
	}

	@ObfuscatedName("h.a(IIIIZZZZ)Lrc;")
	public static Pix32 getSpriteInner(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
		ObjType var6 = list(arg0);
		if (arg1 > 1 && var6.countobj != null) {
			int var7 = -1;
			for (int var8 = 0; var8 < 10; var8++) {
				if (arg1 >= var6.countco[var8] && var6.countco[var8] != 0) {
					var7 = var6.countobj[var8];
				}
			}
			if (var7 != -1) {
				var6 = list(var7);
			}
		}
		SoftwareModelLit var9 = var6.getModelLit();
		if (var9 == null) {
			return null;
		}
		SoftwarePix32 var10 = null;
		if (var6.certtemplate != -1) {
			var10 = (SoftwarePix32) getSpriteInner(var6.certlink, 10, 0, 1, true, false);
			if (var10 == null) {
				return null;
			}
		} else if (var6.lenttemplate != -1) {
			var10 = (SoftwarePix32) getSpriteInner(var6.lentlink, arg1, arg2, arg3, false, false);
			if (var10 == null) {
				return null;
			}
		}
		int[] var11 = Pix2D.pixels;
		int var12 = Pix2D.width;
		int var13 = Pix2D.height;
		int[] var14 = new int[4];
		Pix2D.saveClipping(var14);
		SoftwarePix32 var15 = new SoftwarePix32(36, 32);
		Pix2D.setPixels(var15.data, 36, 32);
		Pix3D.setRenderClipping();
		Pix3D.setOrigin(16, 16);
		int var16 = var6.zoom2d;
		if (arg4) {
			var16 = (int) ((double) var16 * 1.5D);
		} else if (arg3 == 2) {
			var16 = (int) ((double) var16 * 1.04D);
		}
		Pix3D.lowDetail = false;
		int var17 = Pix3D.cosTable[var6.xan2d] * var16 >> 16;
		int var18 = var16 * Pix3D.sinTable[var6.xan2d] >> 16;
		var9.method193(var6.yan2d, var6.zan2d, var6.xan2d, var6.xof2d, var18 + var6.yof2d - var9.method88() / 2, var6.yof2d + var17);
		if (arg3 >= 1) {
			var15.addOutline(1);
			if (arg3 >= 2) {
				var15.addOutline(16777215);
			}
			Pix2D.setPixels(var15.data, 36, 32);
		}
		if (arg2 != 0) {
			var15.addShadow(arg2);
		}
		if (var6.certtemplate != -1) {
			var10.plotSprite(0, 0);
		} else if (var6.lenttemplate != -1) {
			Pix2D.setPixels(var10.data, 36, 32);
			var15.plotSprite(0, 0);
			var15 = var10;
		}
		if (arg5 && (var6.stackable == 1 || arg1 != 1) && arg1 != -1) {
			countFont.drawString(invNumber(arg1), 0, 9, 16776960, 1);
		}
		Pix2D.setPixels(var11, var12, var13);
		Pix2D.restoreClipping(var14);
		Pix3D.setRenderClipping();
		Pix3D.lowDetail = true;
		return var15;
	}

	@ObfuscatedName("li.b(II)I")
	public static int getGroupId(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("mg.c(II)I")
	public static int getFileId(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("mb.b(II)Li;")
	public static JagString invNumber(int arg0) {
		if (arg0 < 100000) {
			return JagString.join(new JagString[] { Client.field399, JagString.parseInt(arg0), Client.field1214 });
		} else if (arg0 < 10000000) {
			return JagString.join(new JagString[] { Client.field241, JagString.parseInt(arg0 / 1000), Text.THOUSAND_SHORT, Client.field1214 });
		} else {
			return JagString.join(new JagString[] { Client.field2462, JagString.parseInt(arg0 / 1000000), Text.MILLION_SHORT, Client.field1214 });
		}
	}

	@ObfuscatedName("sj.a(I)V")
	public static void method1416() {
		int[] var0 = new int[numDefinitions];
		int var1 = 0;
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			ObjType var3 = list(var2);
			if (var3.manwear >= 0 || var3.womanwear >= 0) {
				var0[var1++] = var2;
			}
		}
		Statics.field1698 = new int[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			Statics.field1698[var4] = var0[var4];
		}
	}

	@ObfuscatedName("gd.a(IZLi;)V")
	public static void method467(boolean arg0, JagString arg1) {
		JagString var2 = arg1.toLowerCase();
		int var3 = 0;
		short[] var4 = new short[16];
		for (int var5 = 0; var5 < numDefinitions; var5++) {
			ObjType var6 = list(var5);
			if ((!arg0 || var6.stockmarket) && var6.certtemplate == -1 && var6.lenttemplate == -1 && var6.dummyitem == 0 && var6.name.toLowerCase().indexOf(var2) != -1) {
				if (var3 >= 250) {
					Statics.field3893 = -1;
					Statics.field1210 = null;
					return;
				}
				if (var3 >= var4.length) {
					short[] var7 = new short[var4.length * 2];
					for (int var8 = 0; var8 < var3; var8++) {
						var7[var8] = var4[var8];
					}
					var4 = var7;
				}
				var4[var3++] = (short) var5;
			}
		}
		ClientMouseListener.field2107 = 0;
		Statics.field3893 = var3;
		Statics.field1210 = var4;
		JagString[] var9 = new JagString[Statics.field3893];
		for (int var10 = 0; var10 < Statics.field3893; var10++) {
			var9[var10] = list(var4[var10]).name;
		}
		Statics.method1376(Statics.field1210, var9);
	}

	@ObfuscatedName("ng.b(Z)Lle;")
	public SoftwareModelLit getModelLit() {
		ModelUnlit var1 = ModelUnlit.load(models, this.model);
		if (var1 == null) {
			return null;
		}
		if (this.recol_s != null) {
			for (int var2 = 0; var2 < this.recol_s.length; var2++) {
				if (this.recol_d_palette == null || var2 >= this.recol_d_palette.length) {
					var1.recolour(this.recol_s[var2], this.recol_d[var2]);
				} else {
					var1.recolour(this.recol_s[var2], clientpalette[this.recol_d_palette[var2] & 0xFF]);
				}
			}
		}
		if (this.retex_s != null) {
			for (int var3 = 0; var3 < this.retex_s.length; var3++) {
				var1.retexture(this.retex_s[var3], this.retex_d[var3]);
			}
		}
		SoftwareModelLit var4 = var1.method547(this.ambient + 64, this.contrast + 768);
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var4.resize(this.resizex, this.resizey, this.resizez);
		}
		return var4;
	}

	@ObfuscatedName("ng.a(Li;BI)Li;")
	public JagString getParamString(JagString arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			StringNode var3 = (StringNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("ng.a(ZII)I")
	public int getParamInt(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.find((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("ng.a(ZI)Lhe;")
	public ModelUnlit getWearModelNoCheck(boolean arg0) {
		int var2 = this.manwear;
		int var3 = this.manwear3;
		int var4 = this.manwear2;
		if (arg0) {
			var2 = this.womanwear;
			var3 = this.womanwear3;
			var4 = this.womanwear2;
		}
		if (var2 == -1) {
			return null;
		}
		ModelUnlit var5 = ModelUnlit.load(models, var2);
		if (var4 != -1) {
			ModelUnlit var6 = ModelUnlit.load(models, var4);
			if (var3 == -1) {
				ModelUnlit[] var7 = new ModelUnlit[] { var5, var6 };
				var5 = new ModelUnlit(var7, 2);
			} else {
				ModelUnlit var8 = ModelUnlit.load(models, var3);
				ModelUnlit[] var9 = new ModelUnlit[] { var5, var6, var8 };
				var5 = new ModelUnlit(var9, 3);
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

	@ObfuscatedName("ng.e(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("ng.a(ILea;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("ng.b(ZI)Z")
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

	@ObfuscatedName("ng.a(BZ)Lhe;")
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

	@ObfuscatedName("ng.a(ILng;Lng;)V")
	public void genCert(ObjType arg0, ObjType arg1) {
		this.yof2d = arg1.yof2d;
		this.recol_d_palette = arg1.recol_d_palette;
		this.cost = arg0.cost;
		this.stackable = 1;
		this.recol_s = arg1.recol_s;
		this.name = arg0.name;
		this.zoom2d = arg1.zoom2d;
		this.xan2d = arg1.xan2d;
		this.xof2d = arg1.xof2d;
		this.yan2d = arg1.yan2d;
		this.retex_s = arg1.retex_s;
		this.members = arg0.members;
		this.model = arg1.model;
		this.retex_d = arg1.retex_d;
		this.recol_d = arg1.recol_d;
		this.zan2d = arg1.zan2d;
	}

	@ObfuscatedName("ng.a(Lng;ILng;)V")
	public void genLent(ObjType arg0, ObjType arg1) {
		this.xan2d = arg1.xan2d;
		this.zoom2d = arg1.zoom2d;
		this.name = arg0.name;
		this.womanwearOffsetY = arg0.womanwearOffsetY;
		this.womanwear2 = arg0.womanwear2;
		this.yan2d = arg1.yan2d;
		this.recol_d = arg0.recol_d;
		this.manwear2 = arg0.manwear2;
		this.xof2d = arg1.xof2d;
		this.manhead2 = arg0.manhead2;
		this.retex_d = arg0.retex_d;
		this.womanwear = arg0.womanwear;
		this.op = arg0.op;
		this.manhead = arg0.manhead;
		this.model = arg1.model;
		this.members = arg0.members;
		this.zan2d = arg1.zan2d;
		this.iop = new JagString[5];
		this.manwear3 = arg0.manwear3;
		this.womanwear3 = arg0.womanwear3;
		this.cost = 0;
		this.womanhead = arg0.womanhead;
		this.recol_d_palette = arg0.recol_d_palette;
		this.womanhead2 = arg0.womanhead2;
		this.manwear = arg0.manwear;
		this.retex_s = arg0.retex_s;
		this.yof2d = arg1.yof2d;
		this.team = arg0.team;
		this.manwearOffsetY = arg0.manwearOffsetY;
		this.recol_s = arg0.recol_s;
		this.params = arg0.params;
		if (arg0.iop != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.iop[var3] = arg0.iop[var3];
			}
		}
		this.iop[4] = Text.field592;
	}

	@ObfuscatedName("ng.d(II)Lng;")
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

	@ObfuscatedName("ng.a(ZB)Z")
	public boolean checkWearModel(boolean arg0) {
		int var2 = this.manwear2;
		int var3 = this.manwear;
		int var4 = this.manwear3;
		if (arg0) {
			var3 = this.womanwear;
			var2 = this.womanwear2;
			var4 = this.womanwear3;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!models.requestDownload(var3, 0)) {
			var5 = false;
		}
		if (var2 != -1 && !models.requestDownload(var2, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !models.requestDownload(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ng.a(IBLea;)V")
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
			int var15 = arg1.g1();
			this.recol_s = new short[var15];
			this.recol_d = new short[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.recol_s[var16] = (short) arg1.g2();
				this.recol_d[var16] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.g1();
			this.retex_d = new short[var3];
			this.retex_s = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.retex_s[var4] = (short) arg1.g2();
				this.retex_d[var4] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			int var13 = arg1.g1();
			this.recol_d_palette = new byte[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.recol_d_palette[var14] = arg1.g1b();
			}
		} else if (arg0 == 65) {
			this.stockmarket = true;
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
		} else if (arg0 == 96) {
			this.dummyitem = arg1.g1();
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
		} else if (arg0 == 121) {
			this.lentlink = arg1.g2();
		} else if (arg0 == 122) {
			this.lenttemplate = arg1.g2();
		} else if (arg0 == 124) {
			if (this.field2839 == null) {
				this.field2839 = new int[11][];
			}
			int var11 = arg1.g1();
			this.field2839[var11] = new int[6];
			for (int var12 = 0; var12 < 6; var12++) {
				this.field2839[var11][var12] = arg1.g2b();
			}
		} else if (arg0 == 249) {
			int var5 = arg1.g1();
			if (this.params == null) {
				int var6 = IntMath.bitceil(var5);
				this.params = new HashTable(var6);
			}
			for (int var7 = 0; var7 < var5; var7++) {
				boolean var8 = arg1.g1() == 1;
				int var9 = arg1.g3();
				Linkable var10;
				if (var8) {
					var10 = new StringNode(arg1.gjstr());
				} else {
					var10 = new IntNode(arg1.g4());
				}
				this.params.put((long) var9, var10);
			}
		}
	}

	@ObfuscatedName("ng.a(IIILk;)Lcg;")
	public ModelLit getModelLit(int arg0, int arg1, SeqType arg2) {
		if (this.countobj != null && arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= this.countco[var5] && this.countco[var5] != 0) {
					var4 = this.countobj[var5];
				}
			}
			if (var4 != -1) {
				return list(var4).getModelLit(1, arg1, arg2);
			}
		}
		ModelLit var6 = (ModelLit) modelCache.find((long) this.id);
		if (var6 == null) {
			ModelUnlit var7 = ModelUnlit.load(models, this.model);
			if (var7 == null) {
				return null;
			}
			if (this.recol_s != null) {
				for (int var8 = 0; var8 < this.recol_s.length; var8++) {
					if (this.recol_d_palette == null || this.recol_d_palette.length <= var8) {
						var7.recolour(this.recol_s[var8], this.recol_d[var8]);
					} else {
						var7.recolour(this.recol_s[var8], clientpalette[this.recol_d_palette[var8] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (int var9 = 0; var9 < this.retex_s.length; var9++) {
					var7.retexture(this.retex_s[var9], this.retex_d[var9]);
				}
			}
			var6 = var7.light(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
				var6.resize(this.resizex, this.resizey, this.resizez);
			}
			var6.useAABBMouseCheck = true;
			modelCache.put((long) this.id, var6);
		}
		if (arg2 != null) {
			var6 = arg2.animateModelWithExtra(arg1, var6);
		}
		return var6;
	}
}
