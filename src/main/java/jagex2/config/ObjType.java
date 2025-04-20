package jagex2.config;

import deob.*;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("hc")
public class ObjType {

	@ObfuscatedName("hc.a")
	public static int _flowObfuscator1 = 4;

	@ObfuscatedName("hc.b")
	public static int _flowObfuscator2 = 2;

	@ObfuscatedName("hc.c")
	public boolean _flowObfuscator3 = true;

	@ObfuscatedName("hc.d")
	public static int count;

	@ObfuscatedName("hc.e")
	public static int[] idx;

	@ObfuscatedName("hc.f")
	public static Packet data;

	@ObfuscatedName("hc.g")
	public static ObjType[] types;

	@ObfuscatedName("hc.h")
	public static int cachePos;

	@ObfuscatedName("hc.i")
	public static boolean membersWorld = true;

	@ObfuscatedName("hc.j")
	public int id = -1;

	@ObfuscatedName("hc.k")
	public int model;

	@ObfuscatedName("hc.l")
	public String name;

	@ObfuscatedName("hc.m")
	public byte[] desc;

	@ObfuscatedName("hc.n")
	public int[] recol_s;

	@ObfuscatedName("hc.o")
	public int[] recol_d;

	@ObfuscatedName("hc.p")
	public int zoom2d;

	@ObfuscatedName("hc.q")
	public int xan2d;

	@ObfuscatedName("hc.r")
	public int yan2d;

	@ObfuscatedName("hc.s")
	public int zan2d;

	@ObfuscatedName("hc.t")
	public int xof2d;

	@ObfuscatedName("hc.u")
	public int yof2d;

	@ObfuscatedName("hc.v")
	public boolean field1041;

	@ObfuscatedName("hc.w")
	public int field1042;

	@ObfuscatedName("hc.x")
	public boolean stackable;

	@ObfuscatedName("hc.y")
	public int cost;

	@ObfuscatedName("hc.z")
	public boolean members;

	@ObfuscatedName("hc.X")
	public static LruCache modelCache = new LruCache(50, 1);

	@ObfuscatedName("hc.Y")
	public static LruCache iconCache = new LruCache(100, 1);

	@ObfuscatedName("hc.E")
	public byte manwearOffsetY;

	@ObfuscatedName("hc.H")
	public byte womanwearOffsetY;

	@ObfuscatedName("hc.C")
	public int manwear;

	@ObfuscatedName("hc.D")
	public int manwear2;

	@ObfuscatedName("hc.F")
	public int womanwear;

	@ObfuscatedName("hc.G")
	public int womanwear2;

	@ObfuscatedName("hc.I")
	public int manwear3;

	@ObfuscatedName("hc.J")
	public int womanwear3;

	@ObfuscatedName("hc.K")
	public int manhead;

	@ObfuscatedName("hc.L")
	public int manhead2;

	@ObfuscatedName("hc.M")
	public int womanhead;

	@ObfuscatedName("hc.N")
	public int womanhead2;

	@ObfuscatedName("hc.Q")
	public int certlink;

	@ObfuscatedName("hc.R")
	public int certtemplate;

	@ObfuscatedName("hc.S")
	public int resizex;

	@ObfuscatedName("hc.T")
	public int resizey;

	@ObfuscatedName("hc.U")
	public int resizez;

	@ObfuscatedName("hc.V")
	public int ambient;

	@ObfuscatedName("hc.W")
	public int contrast;

	@ObfuscatedName("hc.O")
	public int[] countobj;

	@ObfuscatedName("hc.P")
	public int[] countco;

	@ObfuscatedName("hc.A")
	public String[] op;

	@ObfuscatedName("hc.B")
	public String[] iop;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void unpack(Jagfile arg0) {
		data = new Packet((byte) -109, arg0.read("obj.dat", null));
		Packet var1 = new Packet((byte) -109, arg0.read("obj.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		types = new ObjType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			types[var4] = new ObjType();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static final void unload(byte arg0) {
		if (arg0 != 9) {
			_flowObfuscator2 = 395;
		}
		modelCache = null;
		iconCache = null;
		idx = null;
		types = null;
		data = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final ObjType get(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (types[var1].id == arg0) {
				return types[var1];
			}
		}
		cachePos = (cachePos + 1) % 10;
		ObjType var2 = types[cachePos];
		data.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(168, data);
		if (var2.certtemplate != -1) {
			var2.toCertificate(6);
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
	public final void reset() {
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
		this.field1041 = false;
		this.field1042 = -1;
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
	public final void decode(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.model = arg1.g2();
				} else if (var3 == 2) {
					this.name = arg1.gjstr();
				} else if (var3 == 3) {
					this.desc = arg1.gjstrraw(1);
				} else if (var3 == 4) {
					this.zoom2d = arg1.g2();
				} else if (var3 == 5) {
					this.xan2d = arg1.g2();
				} else if (var3 == 6) {
					this.yan2d = arg1.g2();
				} else if (var3 == 7) {
					this.xof2d = arg1.g2();
					if (this.xof2d > 32767) {
						this.xof2d -= 65536;
					}
				} else if (var3 == 8) {
					this.yof2d = arg1.g2();
					if (this.yof2d > 32767) {
						this.yof2d -= 65536;
					}
				} else if (var3 == 9) {
					this.field1041 = true;
				} else if (var3 == 10) {
					this.field1042 = arg1.g2();
				} else if (var3 == 11) {
					this.stackable = true;
				} else if (var3 == 12) {
					this.cost = arg1.g4();
				} else if (var3 == 16) {
					this.members = true;
				} else if (var3 == 23) {
					this.manwear = arg1.g2();
					this.manwearOffsetY = arg1.g1b();
				} else if (var3 == 24) {
					this.manwear2 = arg1.g2();
				} else if (var3 == 25) {
					this.womanwear = arg1.g2();
					this.womanwearOffsetY = arg1.g1b();
				} else if (var3 == 26) {
					this.womanwear2 = arg1.g2();
				} else if (var3 >= 30 && var3 < 35) {
					if (this.op == null) {
						this.op = new String[5];
					}
					this.op[var3 - 30] = arg1.gjstr();
					if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
						this.op[var3 - 30] = null;
					}
				} else if (var3 >= 35 && var3 < 40) {
					if (this.iop == null) {
						this.iop = new String[5];
					}
					this.iop[var3 - 35] = arg1.gjstr();
				} else if (var3 == 40) {
					int var4 = arg1.g1();
					this.recol_s = new int[var4];
					this.recol_d = new int[var4];
					for (int var5 = 0; var5 < var4; var5++) {
						this.recol_s[var5] = arg1.g2();
						this.recol_d[var5] = arg1.g2();
					}
				} else if (var3 == 78) {
					this.manwear3 = arg1.g2();
				} else if (var3 == 79) {
					this.womanwear3 = arg1.g2();
				} else if (var3 == 90) {
					this.manhead = arg1.g2();
				} else if (var3 == 91) {
					this.womanhead = arg1.g2();
				} else if (var3 == 92) {
					this.manhead2 = arg1.g2();
				} else if (var3 == 93) {
					this.womanhead2 = arg1.g2();
				} else if (var3 == 95) {
					this.zan2d = arg1.g2();
				} else if (var3 == 97) {
					this.certlink = arg1.g2();
				} else if (var3 == 98) {
					this.certtemplate = arg1.g2();
				} else if (var3 >= 100 && var3 < 110) {
					if (this.countobj == null) {
						this.countobj = new int[10];
						this.countco = new int[10];
					}
					this.countobj[var3 - 100] = arg1.g2();
					this.countco[var3 - 100] = arg1.g2();
				} else if (var3 == 110) {
					this.resizex = arg1.g2();
				} else if (var3 == 111) {
					this.resizey = arg1.g2();
				} else if (var3 == 112) {
					this.resizez = arg1.g2();
				} else if (var3 == 113) {
					this.ambient = arg1.g1b();
				} else if (var3 == 114) {
					this.contrast = arg1.g1b() * 5;
				}
			}
		}
	}

	@ObfuscatedName("hc.b(I)V")
	public void toCertificate(int arg0) {
		ObjType var2 = get(this.certtemplate);
		this.model = var2.model;
		this.zoom2d = var2.zoom2d;
		this.xan2d = var2.xan2d;
		this.yan2d = var2.yan2d;
		if (arg0 < 6 || arg0 > 6) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
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
	public final Model getModel(int arg0) {
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
		Model var5 = Model.tryGet(this.model, -404);
		if (var5 == null) {
			return null;
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var5.scale(this.resizey, this.resizez, 4, this.resizex);
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		var5.calculateNormals(this.ambient + 64, this.contrast + 768, -50, -10, -50, true);
		var5.picking = true;
		modelCache.put(var5, (long) this.id, 39399);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final Model getInvModel(int arg0, int arg1) {
		if (arg0 != -42857) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		if (this.countobj != null && arg1 > 1) {
			int var3 = -1;
			for (int var4 = 0; var4 < 10; var4++) {
				if (arg1 >= this.countco[var4] && this.countco[var4] != 0) {
					var3 = this.countobj[var4];
				}
			}
			if (var3 != -1) {
				return get(var3).getInvModel(-42857, 1);
			}
		}
		Model var5 = Model.tryGet(this.model, -404);
		if (var5 == null) {
			return null;
		}
		if (this.recol_s != null) {
			for (int var6 = 0; var6 < this.recol_s.length; var6++) {
				var5.recolour(this.recol_s[var6], this.recol_d[var6]);
			}
		}
		return var5;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static final Pix32 getIcon(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 == 0) {
			Pix32 var4 = (Pix32) iconCache.get((long) arg2);
			if (var4 != null && var4.height != arg1 && var4.height != -1) {
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
			var9 = getIcon(-1, 10, var5.certlink, 723);
			if (var9 == null) {
				return null;
			}
		}
		Pix32 var10 = new Pix32(32, 32);
		int var11 = Pix3D.centerX;
		int var12 = Pix3D.centerY;
		int[] var13 = Pix3D.lineOffset;
		int[] var14 = Pix2D.data;
		int var15 = Pix2D.width2d;
		int var16 = Pix2D.height2d;
		int var17 = 91 / arg3;
		int var18 = Pix2D.left;
		int var19 = Pix2D.right;
		int var20 = Pix2D.top;
		int var21 = Pix2D.bottom;
		Pix3D.jagged = false;
		Pix2D.bind(32, 2, var10.pixels, 32);
		Pix2D.fillRect(0, 0, 32, 32, 0, 0);
		Pix3D.init2D((byte) 6);
		int var22 = var5.zoom2d;
		if (arg0 == -1) {
			var22 = (int) ((double) var22 * 1.5D);
		}
		if (arg0 > 0) {
			var22 = (int) ((double) var22 * 1.04D);
		}
		int var23 = Pix3D.sinTable[var5.xan2d] * var22 >> 16;
		int var24 = Pix3D.cosTable[var5.xan2d] * var22 >> 16;
		var8.drawSimple(0, var5.yan2d, var5.zan2d, var5.xan2d, var5.xof2d, var8.field400 / 2 + var23 + var5.yof2d, var5.yof2d + var24);
		for (int var25 = 31; var25 >= 0; var25--) {
			for (int var32 = 31; var32 >= 0; var32--) {
				if (var10.pixels[var32 * 32 + var25] == 0) {
					if (var25 > 0 && var10.pixels[var32 * 32 + (var25 - 1)] > 1) {
						var10.pixels[var32 * 32 + var25] = 1;
					} else if (var32 > 0 && var10.pixels[(var32 - 1) * 32 + var25] > 1) {
						var10.pixels[var32 * 32 + var25] = 1;
					} else if (var25 < 31 && var10.pixels[var32 * 32 + var25 + 1] > 1) {
						var10.pixels[var32 * 32 + var25] = 1;
					} else if (var32 < 31 && var10.pixels[(var32 + 1) * 32 + var25] > 1) {
						var10.pixels[var32 * 32 + var25] = 1;
					}
				}
			}
		}
		if (arg0 > 0) {
			for (int var26 = 31; var26 >= 0; var26--) {
				for (int var27 = 31; var27 >= 0; var27--) {
					if (var10.pixels[var27 * 32 + var26] == 0) {
						if (var26 > 0 && var10.pixels[var27 * 32 + (var26 - 1)] == 1) {
							var10.pixels[var27 * 32 + var26] = arg0;
						} else if (var27 > 0 && var10.pixels[(var27 - 1) * 32 + var26] == 1) {
							var10.pixels[var27 * 32 + var26] = arg0;
						} else if (var26 < 31 && var10.pixels[var27 * 32 + var26 + 1] == 1) {
							var10.pixels[var27 * 32 + var26] = arg0;
						} else if (var27 < 31 && var10.pixels[(var27 + 1) * 32 + var26] == 1) {
							var10.pixels[var27 * 32 + var26] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var28 = 31; var28 >= 0; var28--) {
				for (int var29 = 31; var29 >= 0; var29--) {
					if (var10.pixels[var29 * 32 + var28] == 0 && var28 > 0 && var29 > 0 && var10.pixels[(var29 - 1) * 32 + (var28 - 1)] > 0) {
						var10.pixels[var29 * 32 + var28] = 3153952;
					}
				}
			}
		}
		if (var5.certtemplate != -1) {
			int var30 = var9.width;
			int var31 = var9.height;
			var9.width = 32;
			var9.height = 32;
			var9.draw((byte) 9, 0, 0);
			var9.width = var30;
			var9.height = var31;
		}
		if (arg0 == 0) {
			iconCache.put(var10, (long) arg2, 39399);
		}
		Pix2D.bind(var15, 2, var14, var16);
		Pix2D.setBounds(var19, var21, _flowObfuscator1, var20, var18);
		Pix3D.centerX = var11;
		Pix3D.centerY = var12;
		Pix3D.lineOffset = var13;
		Pix3D.jagged = true;
		if (var5.stackable) {
			var10.width = 33;
		} else {
			var10.width = 32;
		}
		var10.height = arg1;
		return var10;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean validateWornModel(int arg0, int arg1) {
		int var3 = this.manwear;
		int var4 = this.manwear2;
		int var5 = this.manwear3;
		while (arg0 >= 0) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		if (arg1 == 1) {
			var3 = this.womanwear;
			var4 = this.womanwear2;
			var5 = this.womanwear3;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!Model.validate(var3)) {
			var6 = false;
		}
		if (var4 != -1 && !Model.validate(var4)) {
			var6 = false;
		}
		if (var5 != -1 && !Model.validate(var5)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("hc.a(ZI)Lfb;")
	public final Model getWornModel(boolean arg0, int arg1) {
		int var3 = this.manwear;
		int var4 = this.manwear2;
		int var5 = this.manwear3;
		if (arg1 == 1) {
			var3 = this.womanwear;
			var4 = this.womanwear2;
			var5 = this.womanwear3;
		}
		if (var3 == -1) {
			return null;
		}
		Model var6 = Model.tryGet(var3, -404);
		if (!arg0) {
			throw new NullPointerException();
		}
		if (var4 != -1) {
			if (var5 == -1) {
				Model var10 = Model.tryGet(var4, -404);
				Model[] var11 = new Model[] { var6, var10 };
				var6 = new Model(2, 652, var11);
			} else {
				Model var7 = Model.tryGet(var4, -404);
				Model var8 = Model.tryGet(var5, -404);
				Model[] var9 = new Model[] { var6, var7, var8 };
				var6 = new Model(3, 652, var9);
			}
		}
		if (arg1 == 0 && this.manwearOffsetY != 0) {
			var6.translate(this.manwearOffsetY, 0, 0, false);
		}
		if (arg1 == 1 && this.womanwearOffsetY != 0) {
			var6.translate(this.womanwearOffsetY, 0, 0, false);
		}
		if (this.recol_s != null) {
			for (int var12 = 0; var12 < this.recol_s.length; var12++) {
				var6.recolour(this.recol_s[var12], this.recol_d[var12]);
			}
		}
		return var6;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean validateHeadModel(int arg0, int arg1) {
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg0 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (arg1 != -5652) {
			throw new NullPointerException();
		}
		if (!Model.validate(var3)) {
			var5 = false;
		}
		if (var4 != -1 && !Model.validate(var4)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("hc.b(ZI)Lfb;")
	public final Model getHeadModel(boolean arg0, int arg1) {
		int var3 = this.manhead;
		int var4 = this.manhead2;
		if (arg0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if (arg1 == 1) {
			var3 = this.womanhead;
			var4 = this.womanhead2;
		}
		if (var3 == -1) {
			return null;
		}
		Model var6 = Model.tryGet(var3, -404);
		if (var4 != -1) {
			Model var7 = Model.tryGet(var4, -404);
			Model[] var8 = new Model[] { var6, var7 };
			var6 = new Model(2, 652, var8);
		}
		if (this.recol_s != null) {
			for (int var9 = 0; var9 < this.recol_s.length; var9++) {
				var6.recolour(this.recol_s[var9], this.recol_d[var9]);
			}
		}
		return var6;
	}
}
