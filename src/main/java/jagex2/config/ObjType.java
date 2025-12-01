package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public class ObjType {

	@ObfuscatedName("hc.f")
	public static int count;

	@ObfuscatedName("hc.g")
	public static int[] idx;

	@ObfuscatedName("hc.h")
	public static Packet dat;

	@ObfuscatedName("hc.i")
	public static ObjType[] cache;

	@ObfuscatedName("hc.j")
	public static int cachePos;

	@ObfuscatedName("hc.k")
	public static boolean membersWorld = true;

	@ObfuscatedName("hc.l")
	public int id = -1;

	@ObfuscatedName("hc.m")
	public int model;

	@ObfuscatedName("hc.n")
	public String name;

	@ObfuscatedName("hc.o")
	public byte[] desc;

	@ObfuscatedName("hc.p")
	public int[] recol_s;

	@ObfuscatedName("hc.q")
	public int[] recol_d;

	@ObfuscatedName("hc.r")
	public int zoom2d;

	@ObfuscatedName("hc.s")
	public int xan2d;

	@ObfuscatedName("hc.t")
	public int yan2d;

	@ObfuscatedName("hc.u")
	public int zan2d;

	@ObfuscatedName("hc.v")
	public int xof2d;

	@ObfuscatedName("hc.w")
	public int yof2d;

	@ObfuscatedName("hc.x")
	public int field1034;

	@ObfuscatedName("hc.y")
	public boolean stackable;

	@ObfuscatedName("hc.z")
	public int cost;

	@ObfuscatedName("hc.Y")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("hc.Z")
	public static LruCache spriteCache = new LruCache(100);

	@ObfuscatedName("hc.F")
	public byte manwearOffsetY;

	@ObfuscatedName("hc.I")
	public byte womanwearOffsetY;

	@ObfuscatedName("hc.D")
	public int manwear;

	@ObfuscatedName("hc.E")
	public int manwear2;

	@ObfuscatedName("hc.G")
	public int womanwear;

	@ObfuscatedName("hc.H")
	public int womanwear2;

	@ObfuscatedName("hc.J")
	public int manwear3;

	@ObfuscatedName("hc.K")
	public int womanwear3;

	@ObfuscatedName("hc.L")
	public int manhead;

	@ObfuscatedName("hc.M")
	public int manhead2;

	@ObfuscatedName("hc.N")
	public int womanhead;

	@ObfuscatedName("hc.O")
	public int womanhead2;

	@ObfuscatedName("hc.R")
	public int certlink;

	@ObfuscatedName("hc.S")
	public int certtemplate;

	@ObfuscatedName("hc.T")
	public int resizex;

	@ObfuscatedName("hc.U")
	public int resizey;

	@ObfuscatedName("hc.V")
	public int resizez;

	@ObfuscatedName("hc.W")
	public int ambient;

	@ObfuscatedName("hc.X")
	public int contrast;

	@ObfuscatedName("hc.A")
	public boolean members;

	@ObfuscatedName("hc.P")
	public int[] countobj;

	@ObfuscatedName("hc.Q")
	public int[] countco;

	@ObfuscatedName("hc.B")
	public String[] op;

	@ObfuscatedName("hc.C")
	public String[] iop;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static void unpack(JagFile arg0) {
		dat = new Packet(arg0.read("obj.dat", null));
		Packet var1 = new Packet(arg0.read("obj.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		cache = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			cache[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static void unload() {
		modelCache = null;
		spriteCache = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static ObjType get(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (cache[var1].id == arg0) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 10;
		ObjType var2 = cache[cachePos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		if (var2.certtemplate != -1) {
			var2.genCert();
		}
		if (!membersWorld && var2.members) {
			var2.name = "Members Object";
			var2.desc = "Login to a members' server to use this object.".getBytes();
			var2.op = null;
			var2.iop = null;
		}
		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public void reset() {
		this.model = 0;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.xof2d = 0;
		this.yof2d = 0;
		this.field1034 = -1;
		this.stackable = false;
		this.cost = 1;
		this.members = false;
		this.op = null;
		this.iop = null;
		this.manwear = -1;
		this.manwear2 = -1;
		this.manwearOffsetY = 0;
		this.womanwear = -1;
		this.womanwear2 = -1;
		this.womanwearOffsetY = 0;
		this.manwear3 = -1;
		this.womanwear3 = -1;
		this.manhead = -1;
		this.manhead2 = -1;
		this.womanhead = -1;
		this.womanhead2 = -1;
		this.countobj = null;
		this.countco = null;
		this.certlink = -1;
		this.certtemplate = -1;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("hc.a(ILmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.model = arg1.g2();
			} else if (var4 == 2) {
				this.name = arg1.gstr();
			} else if (var4 == 3) {
				this.desc = arg1.gstrbyte();
			} else if (var4 == 4) {
				this.zoom2d = arg1.g2();
			} else if (var4 == 5) {
				this.xan2d = arg1.g2();
			} else if (var4 == 6) {
				this.yan2d = arg1.g2();
			} else if (var4 == 7) {
				this.xof2d = arg1.g2();
				if (this.xof2d > 32767) {
					this.xof2d -= 65536;
				}
			} else if (var4 == 8) {
				this.yof2d = arg1.g2();
				if (this.yof2d > 32767) {
					this.yof2d -= 65536;
				}
			} else if (var4 == 10) {
				this.field1034 = arg1.g2();
			} else if (var4 == 11) {
				this.stackable = true;
			} else if (var4 == 12) {
				this.cost = arg1.g4();
			} else if (var4 == 16) {
				this.members = true;
			} else if (var4 == 23) {
				this.manwear = arg1.g2();
				this.manwearOffsetY = arg1.g1b();
			} else if (var4 == 24) {
				this.manwear2 = arg1.g2();
			} else if (var4 == 25) {
				this.womanwear = arg1.g2();
				this.womanwearOffsetY = arg1.g1b();
			} else if (var4 == 26) {
				this.womanwear2 = arg1.g2();
			} else if (var4 >= 30 && var4 < 35) {
				if (this.op == null) {
					this.op = new String[5];
				}
				this.op[var4 - 30] = arg1.gstr();
				if (this.op[var4 - 30].equalsIgnoreCase("hidden")) {
					this.op[var4 - 30] = null;
				}
			} else if (var4 >= 35 && var4 < 40) {
				if (this.iop == null) {
					this.iop = new String[5];
				}
				this.iop[var4 - 35] = arg1.gstr();
			} else if (var4 == 40) {
				int var5 = arg1.g1();
				this.recol_s = new int[var5];
				this.recol_d = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.recol_s[var6] = arg1.g2();
					this.recol_d[var6] = arg1.g2();
				}
			} else if (var4 == 78) {
				this.manwear3 = arg1.g2();
			} else if (var4 == 79) {
				this.womanwear3 = arg1.g2();
			} else if (var4 == 90) {
				this.manhead = arg1.g2();
			} else if (var4 == 91) {
				this.womanhead = arg1.g2();
			} else if (var4 == 92) {
				this.manhead2 = arg1.g2();
			} else if (var4 == 93) {
				this.womanhead2 = arg1.g2();
			} else if (var4 == 95) {
				this.zan2d = arg1.g2();
			} else if (var4 == 97) {
				this.certlink = arg1.g2();
			} else if (var4 == 98) {
				this.certtemplate = arg1.g2();
			} else if (var4 >= 100 && var4 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}
				this.countobj[var4 - 100] = arg1.g2();
				this.countco[var4 - 100] = arg1.g2();
			} else if (var4 == 110) {
				this.resizex = arg1.g2();
			} else if (var4 == 111) {
				this.resizey = arg1.g2();
			} else if (var4 == 112) {
				this.resizez = arg1.g2();
			} else if (var4 == 113) {
				this.ambient = arg1.g1b();
			} else if (var4 == 114) {
				this.contrast = arg1.g1b() * 5;
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void genCert() {
		ObjType var2 = get(this.certtemplate);
		this.model = var2.model;
		this.zoom2d = var2.zoom2d;
		this.xan2d = var2.xan2d;
		this.yan2d = var2.yan2d;
		this.zan2d = var2.zan2d;
		this.xof2d = var2.xof2d;
		this.yof2d = var2.yof2d;
		this.recol_s = var2.recol_s;
		this.recol_d = var2.recol_d;
		ObjType var3 = get(this.certlink);
		this.name = var3.name;
		this.members = var3.members;
		this.cost = var3.cost;
		String var4 = "a";
		char var5 = var3.name.charAt(0);
		if (var5 == 'A' || var5 == 'E' || var5 == 'I' || var5 == 'O' || var5 == 'U') {
			var4 = "an";
		}
		this.desc = ("Swap this note at any bank for " + var4 + " " + var3.name + ".").getBytes();
		this.stackable = true;
	}

	@ObfuscatedName("hc.c(I)Lfb;")
	public Model getModel(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return get(var2).getModel(1);
			}
		}
		Model var4 = (Model) modelCache.get((long) this.id);
		if (var4 != null) {
			return var4;
		}
		Model var5 = Model.load(this.model);
		if (var5 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var5.resize(this.resizez, this.resizex, this.resizey);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		var5.calculateNormals(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
		var5.useAABBMouseCheck = true;
		modelCache.put(var5, (long) this.id);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public Model getInvModel(int arg1) {
		if (this.countobj != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.countco[var4] && this.countco[var4] != 0) {
					var3 = this.countobj[var4];
				}
			}
			if (var3 != -1) {
				return get(var3).getInvModel(1);
			}
		}
		Model var5 = Model.load(this.model);
		if (var5 == null) {
			return null;
		}
		if (this.recol_s != null) {
			for (int var7 = 0; var7 < this.recol_s.length; var7++) {
				var5.recolour(this.recol_s[var7], this.recol_d[var7]);
			}
		}
		return var5;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static Pix32 getSprite(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			Pix32 var4 = (Pix32) spriteCache.get((long) arg2);
			if (var4 != null && var4.ohi != arg1 && var4.ohi != -1) {
				var4.unlink();
				var4 = null;
			}
			if (var4 != null) {
				return var4;
			}
		}
		ObjType var5 = get(arg2);
		if (var5.countobj == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			int var6 = -1;
			for (int var7 = 0; var7 < 10; var7++) {
				if (arg1 >= var5.countco[var7] && var5.countco[var7] != 0) {
					var6 = var5.countobj[var7];
				}
			}
			if (var6 != -1) {
				var5 = get(var6);
			}
		}
		Model var8 = var5.getModel(1);
		if (var8 == null) {
			return null;
		}
		Pix32 var9 = null;
		if (var5.certtemplate != -1) {
			var9 = getSprite(-1, 10, var5.certlink);
			if (var9 == null) {
				return null;
			}
		}
		Pix32 var10 = new Pix32(32, 32);
		int var11 = Pix3D.projectionX;
		int var12 = Pix3D.projectionY;
		int[] var13 = Pix3D.scanline;
		int[] var14 = Pix2D.pixels;
		int var15 = Pix2D.width;
		int var16 = Pix2D.height;
		int var17 = Pix2D.boundLeft;
		int var18 = Pix2D.boundRight;
		int var19 = Pix2D.boundTop;
		int var20 = Pix2D.boundBottom;
		Pix3D.lowDetail = false;
		Pix2D.setPixels(32, var10.data, 32);
		Pix2D.fillRect(32, 32, 0, 0, 0);
		Pix3D.init();
		int var21 = var5.zoom2d;
		if (arg0 == -1) {
			var21 = (int) ((double) var21 * 1.5D);
		}
		if (arg0 > 0) {
			var21 = (int) ((double) var21 * 1.04D);
		}
		int var22 = Pix3D.sinTable[var5.xan2d] * var21 >> 16;
		int var23 = Pix3D.cosTable[var5.xan2d] * var21 >> 16;
		var8.objRender(0, var5.yan2d, var5.zan2d, var5.xan2d, var5.xof2d, var22 + var8.minY / 2 + var5.yof2d, var23 + var5.yof2d);
		for (int var24 = 31; var24 >= 0; var24--) {
			for (int var25 = 31; var25 >= 0; var25--) {
				if (var10.data[var24 + var25 * 32] == 0) {
					if (var24 > 0 && var10.data[var24 - 1 + var25 * 32] > 1) {
						var10.data[var24 + var25 * 32] = 1;
					} else if (var25 > 0 && var10.data[var24 + (var25 - 1) * 32] > 1) {
						var10.data[var24 + var25 * 32] = 1;
					} else if (var24 < 31 && var10.data[var24 + 1 + var25 * 32] > 1) {
						var10.data[var24 + var25 * 32] = 1;
					} else if (var25 < 31 && var10.data[var24 + (var25 + 1) * 32] > 1) {
						var10.data[var24 + var25 * 32] = 1;
					}
				}
			}
		}
		if (arg0 > 0) {
			for (int var26 = 31; var26 >= 0; var26--) {
				for (int var27 = 31; var27 >= 0; var27--) {
					if (var10.data[var26 + var27 * 32] == 0) {
						if (var26 > 0 && var10.data[var26 - 1 + var27 * 32] == 1) {
							var10.data[var26 + var27 * 32] = arg0;
						} else if (var27 > 0 && var10.data[var26 + (var27 - 1) * 32] == 1) {
							var10.data[var26 + var27 * 32] = arg0;
						} else if (var26 < 31 && var10.data[var26 + 1 + var27 * 32] == 1) {
							var10.data[var26 + var27 * 32] = arg0;
						} else if (var27 < 31 && var10.data[var26 + (var27 + 1) * 32] == 1) {
							var10.data[var26 + var27 * 32] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var28 = 31; var28 >= 0; var28--) {
				for (int var29 = 31; var29 >= 0; var29--) {
					if (var10.data[var28 + var29 * 32] == 0 && var28 > 0 && var29 > 0 && var10.data[var28 - 1 + (var29 - 1) * 32] > 0) {
						var10.data[var28 + var29 * 32] = 3153952;
					}
				}
			}
		}
		if (var5.certtemplate != -1) {
			int var30 = var9.owi;
			int var31 = var9.ohi;
			var9.owi = 32;
			var9.ohi = 32;
			var9.plotSprite(0, 0);
			var9.owi = var30;
			var9.ohi = var31;
		}
		if (arg0 == 0) {
			spriteCache.put(var10, (long) arg2);
		}
		Pix2D.setPixels(var16, var14, var15);
		Pix2D.setClipping(var18, var17, var20, var19);
		Pix3D.projectionX = var11;
		Pix3D.projectionY = var12;
		Pix3D.scanline = var13;
		Pix3D.lowDetail = true;
		if (var5.stackable) {
			var10.owi = 33;
		} else {
			var10.owi = 32;
		}
		var10.ohi = arg1;
		return var10;
	}

	@ObfuscatedName("hc.a(BI)Z")
	public boolean checkWearModel(int arg1) {
		int var3 = this.manwear;
		int var4 = this.manwear2;
		int var5 = this.manwear3;
		if (arg1 == 1) {
			var3 = this.womanwear;
			var4 = this.womanwear2;
			var5 = this.womanwear3;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!Model.requestDownload(var3)) {
			var6 = false;
		}
		if (var4 != -1 && !Model.requestDownload(var4)) {
			var6 = false;
		}
		if (var5 != -1 && !Model.requestDownload(var5)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("hc.b(II)Lfb;")
	public Model getWearModelNoCheck(int arg1) {
		int var4 = this.manwear;
		int var5 = this.manwear2;
		int var6 = this.manwear3;
		if (arg1 == 1) {
			var4 = this.womanwear;
			var5 = this.womanwear2;
			var6 = this.womanwear3;
		}
		if (var4 == -1) {
			return null;
		}
		Model var7 = Model.load(var4);
		if (var5 != -1) {
			if (var6 == -1) {
				Model var11 = Model.load(var5);
				Model[] var12 = new Model[] { var7, var11 };
				var7 = new Model(var12, 2);
			} else {
				Model var8 = Model.load(var5);
				Model var9 = Model.load(var6);
				Model[] var10 = new Model[] { var7, var8, var9 };
				var7 = new Model(var10, 3);
			}
		}
		if (arg1 == 0 && this.manwearOffsetY != 0) {
			var7.translate(0, 0, this.manwearOffsetY);
		}
		if (arg1 == 1 && this.womanwearOffsetY != 0) {
			var7.translate(0, 0, this.womanwearOffsetY);
		}
		if (this.recol_s != null) {
			for (int var13 = 0; var13 < this.recol_s.length; var13++) {
				var7.recolour(this.recol_s[var13], this.recol_d[var13]);
			}
		}
		return var7;
	}

	@ObfuscatedName("hc.a(ZI)Z")
	public boolean checkHeadModel(int arg1) {
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg1 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!Model.requestDownload(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.requestDownload(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("hc.b(ZI)Lfb;")
	public Model getHeadModelNoCheck(int arg1) {
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg1 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return null;
		}
		Model var5 = Model.load(var3);
		if (var4 != -1) {
			Model var6 = Model.load(var4);
			Model[] var7 = new Model[] { var5, var6 };
			var5 = new Model(var7, 2);
		}
		if (this.recol_s != null) {
			for (int var8 = 0; var8 < this.recol_s.length; var8++) {
				var5.recolour(this.recol_s[var8], this.recol_d[var8]);
			}
		}
		return var5;
	}
}
