package jagex2.config;

import deob.*;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public class LocType {

	@ObfuscatedName("ec.a")
	public int _flowObfuscator1 = 2;

	@ObfuscatedName("ec.b")
	public static boolean _flowObfuscator2;

	@ObfuscatedName("ec.c")
	public int _flowObfuscator3;

	@ObfuscatedName("ec.d")
	public int _flowObfuscator4 = 679;

	@ObfuscatedName("ec.e")
	public boolean _flowObfuscator5 = true;

	@ObfuscatedName("ec.f")
	public static boolean field940;

	@ObfuscatedName("ec.g")
	public static int count;

	@ObfuscatedName("ec.h")
	public static int[] idx;

	@ObfuscatedName("ec.i")
	public static Packet data;

	@ObfuscatedName("ec.j")
	public static LocType[] types;

	@ObfuscatedName("ec.k")
	public static int cachePos;

	@ObfuscatedName("ec.l")
	public int id = -1;

	@ObfuscatedName("ec.m")
	public int[] models;

	@ObfuscatedName("ec.n")
	public int[] shapes;

	@ObfuscatedName("ec.o")
	public String name;

	@ObfuscatedName("ec.p")
	public byte[] desc;

	@ObfuscatedName("ec.q")
	public int[] recol_s;

	@ObfuscatedName("ec.r")
	public int[] recol_d;

	@ObfuscatedName("ec.s")
	public int width;

	@ObfuscatedName("ec.t")
	public int length;

	@ObfuscatedName("ec.u")
	public boolean blockwalk;

	@ObfuscatedName("ec.v")
	public boolean blockrange;

	@ObfuscatedName("ec.w")
	public boolean active;

	@ObfuscatedName("ec.x")
	public boolean hillskew;

	@ObfuscatedName("ec.y")
	public boolean sharelight;

	@ObfuscatedName("ec.z")
	public boolean occlude;

	@ObfuscatedName("ec.S")
	public static LruCache modelCacheStatic = new LruCache(500, 1);

	@ObfuscatedName("ec.T")
	public static LruCache modelCacheDynamic = new LruCache(30, 1);

	@ObfuscatedName("ec.C")
	public byte ambient;

	@ObfuscatedName("ec.D")
	public byte contrast;

	@ObfuscatedName("ec.A")
	public int anim;

	@ObfuscatedName("ec.B")
	public int wallwidth;

	@ObfuscatedName("ec.G")
	public int mapfunction;

	@ObfuscatedName("ec.H")
	public int mapscene;

	@ObfuscatedName("ec.K")
	public int resizex;

	@ObfuscatedName("ec.L")
	public int resizey;

	@ObfuscatedName("ec.M")
	public int resizez;

	@ObfuscatedName("ec.N")
	public int offsetx;

	@ObfuscatedName("ec.O")
	public int offsety;

	@ObfuscatedName("ec.P")
	public int offsetz;

	@ObfuscatedName("ec.Q")
	public int forceapproach;

	@ObfuscatedName("ec.F")
	public boolean animHasAlpha;

	@ObfuscatedName("ec.I")
	public boolean mirror;

	@ObfuscatedName("ec.J")
	public boolean shadow;

	@ObfuscatedName("ec.R")
	public boolean forcedecor;

	@ObfuscatedName("ec.E")
	public String[] op;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static final void unpack(Jagfile arg0) {
		data = new Packet((byte) -109, arg0.read("loc.dat", null));
		Packet var1 = new Packet((byte) -109, arg0.read("loc.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		types = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			types[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void unload(byte arg0) {
		modelCacheStatic = null;
		if (arg0 != 9) {
			_flowObfuscator2 = !_flowObfuscator2;
		}
		modelCacheDynamic = null;
		idx = null;
		types = null;
		data = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final LocType get(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (types[var1].id == arg0) {
				return types[var1];
			}
		}
		cachePos = (cachePos + 1) % 10;
		LocType var2 = types[cachePos];
		data.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(168, data);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public final void reset() {
		this.models = null;
		this.shapes = null;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.width = 1;
		this.length = 1;
		this.blockwalk = true;
		this.blockrange = true;
		this.active = false;
		this.hillskew = false;
		this.sharelight = false;
		this.occlude = false;
		this.anim = -1;
		this.wallwidth = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.op = null;
		this.animHasAlpha = false;
		this.mapfunction = -1;
		this.mapscene = -1;
		this.mirror = false;
		this.shadow = true;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.forceapproach = 0;
		this.offsetx = 0;
		this.offsety = 0;
		this.offsetz = 0;
		this.forcedecor = false;
	}

	@ObfuscatedName("ec.a(ILmb;)V")
	public final void decode(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			this._flowObfuscator5 = !this._flowObfuscator5;
		}
		int var3 = -1;
		while (true) {
			while (true) {
				int var4 = arg1.g1();
				if (var4 == 0) {
					if (this.shapes == null) {
						this.shapes = new int[0];
					}
					if (var3 == -1) {
						this.active = false;
						if (this.shapes.length > 0 && this.shapes[0] == 10) {
							this.active = true;
						}
						if (this.op != null) {
							this.active = true;
							return;
						}
					}
					return;
				}
				if (var4 == 1) {
					int var5 = arg1.g1();
					this.shapes = new int[var5];
					this.models = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.models[var6] = arg1.g2();
						this.shapes[var6] = arg1.g1();
					}
				} else if (var4 == 2) {
					this.name = arg1.gjstr();
				} else if (var4 == 3) {
					this.desc = arg1.gjstrraw(1);
				} else if (var4 == 14) {
					this.width = arg1.g1();
				} else if (var4 == 15) {
					this.length = arg1.g1();
				} else if (var4 == 17) {
					this.blockwalk = false;
				} else if (var4 == 18) {
					this.blockrange = false;
				} else if (var4 == 19) {
					var3 = arg1.g1();
					if (var3 == 1) {
						this.active = true;
					}
				} else if (var4 == 21) {
					this.hillskew = true;
				} else if (var4 == 22) {
					this.sharelight = true;
				} else if (var4 == 23) {
					this.occlude = true;
				} else if (var4 == 24) {
					this.anim = arg1.g2();
					if (this.anim == 65535) {
						this.anim = -1;
					}
				} else if (var4 == 25) {
					this.animHasAlpha = true;
				} else if (var4 == 28) {
					this.wallwidth = arg1.g1();
				} else if (var4 == 29) {
					this.ambient = arg1.g1b();
				} else if (var4 == 39) {
					this.contrast = arg1.g1b();
				} else if (var4 >= 30 && var4 < 39) {
					if (this.op == null) {
						this.op = new String[5];
					}
					this.op[var4 - 30] = arg1.gjstr();
					if (this.op[var4 - 30].equalsIgnoreCase("hidden")) {
						this.op[var4 - 30] = null;
					}
				} else if (var4 == 40) {
					int var7 = arg1.g1();
					this.recol_s = new int[var7];
					this.recol_d = new int[var7];
					for (int var8 = 0; var8 < var7; var8++) {
						this.recol_s[var8] = arg1.g2();
						this.recol_d[var8] = arg1.g2();
					}
				} else if (var4 == 60) {
					this.mapfunction = arg1.g2();
				} else if (var4 == 62) {
					this.mirror = true;
				} else if (var4 == 64) {
					this.shadow = false;
				} else if (var4 == 65) {
					this.resizex = arg1.g2();
				} else if (var4 == 66) {
					this.resizey = arg1.g2();
				} else if (var4 == 67) {
					this.resizez = arg1.g2();
				} else if (var4 == 68) {
					this.mapscene = arg1.g2();
				} else if (var4 == 69) {
					this.forceapproach = arg1.g1();
				} else if (var4 == 70) {
					this.offsetx = arg1.g2b();
				} else if (var4 == 71) {
					this.offsety = arg1.g2b();
				} else if (var4 == 72) {
					this.offsetz = arg1.g2b();
				} else if (var4 == 73) {
					this.forcedecor = true;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean validate(int arg0, int arg1) {
		int var3 = -1;
		for (int var4 = 0; var4 < this.shapes.length; var4++) {
			if (this.shapes[var4] == arg1) {
				var3 = var4;
				break;
			}
		}
		if (arg0 != 0) {
			throw new NullPointerException();
		} else if (var3 == -1) {
			return true;
		} else if (this.models == null) {
			return true;
		} else {
			int var5 = this.models[var3];
			return var5 == -1 ? true : Model.validate(var5 & 0xFFFF);
		}
	}

	@ObfuscatedName("ec.b(I)Z")
	public final boolean validate(int arg0) {
		boolean var2 = true;
		if (arg0 != 0) {
			this._flowObfuscator4 = -413;
		}
		if (this.models == null) {
			return true;
		}
		for (int var3 = 0; var3 < this.models.length; var3++) {
			int var4 = this.models[var3];
			if (var4 != -1) {
				var2 &= Model.validate(var4 & 0xFFFF);
			}
		}
		return var2;
	}

	@ObfuscatedName("ec.a(ILvb;)V")
	public final void prefetch(int arg0, OnDemand arg1) {
		while (arg0 >= 0) {
			this._flowObfuscator1 = -234;
		}
		if (this.models == null) {
			return;
		}
		for (int var3 = 0; var3 < this.models.length; var3++) {
			int var4 = this.models[var3];
			if (var4 != -1) {
				arg1.prefetch(0, var4 & 0xFFFF, -938);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < this.shapes.length; var9++) {
			if (this.shapes[var9] == arg0) {
				var8 = var9;
				break;
			}
		}
		if (var8 == -1) {
			return null;
		}
		long var10 = ((long) (arg6 + 1) << 32) + (long) ((this.id << 6) + (var8 << 3) + arg1);
		if (field940) {
			var10 = 0L;
		}
		Model var12 = (Model) modelCacheDynamic.get(var10);
		if (var12 == null) {
			if (this.models == null || var8 >= this.models.length) {
				return null;
			}
			int var20 = this.models[var8];
			if (var20 == -1) {
				return null;
			}
			boolean var21 = this.mirror ^ arg1 > 3;
			if (var21) {
				var20 += 65536;
			}
			Model var22 = (Model) modelCacheStatic.get((long) var20);
			if (var22 == null) {
				var22 = Model.tryGet(var20 & 0xFFFF, -404);
				if (var22 == null) {
					return null;
				}
				if (var21) {
					var22.method153(4);
				}
				modelCacheStatic.put(var22, (long) var20, 39399);
			}
			boolean var23;
			if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
				var23 = false;
			} else {
				var23 = true;
			}
			boolean var24;
			if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
				var24 = false;
			} else {
				var24 = true;
			}
			Model var25 = new Model(var22, this.recol_s == null, arg1 == 0 && arg6 == -1 && !var23 && !var24, !this.animHasAlpha, -796);
			if (arg6 != -1) {
				var25.createLabelReferences(-591);
				var25.applyTransform(arg6, 13056);
				var25.labelFaces = null;
				var25.labelVertices = null;
			}
			while (arg1-- > 0) {
				var25.method149((byte) 3);
			}
			if (this.recol_s != null) {
				for (int var26 = 0; var26 < this.recol_s.length; var26++) {
					var25.recolour(this.recol_s[var26], this.recol_d[var26]);
				}
			}
			if (var23) {
				var25.scale(this.resizey, this.resizez, 4, this.resizex);
			}
			if (var24) {
				var25.translate(this.offsety, this.offsetx, this.offsetz, false);
			}
			var25.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
			if (this.blockwalk) {
				var25.objRaise = var25.minY;
			}
			modelCacheDynamic.put(var25, var10, 39399);
			if (this.hillskew || this.sharelight) {
				var25 = new Model(this._flowObfuscator3, this.sharelight, this.hillskew, var25);
			}
			if (this.hillskew) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.vertexCount; var28++) {
					int var29 = var25.vertexX[var28];
					int var30 = var25.vertexZ[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.vertexY[var28] += var33 - var27;
				}
				var25.calculateBoundsY((byte) 6);
			}
			return var25;
		} else if (field940) {
			return var12;
		} else {
			if (this.hillskew || this.sharelight) {
				var12 = new Model(this._flowObfuscator3, this.sharelight, this.hillskew, var12);
			}
			if (this.hillskew) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.vertexCount; var14++) {
					int var15 = var12.vertexX[var14];
					int var16 = var12.vertexZ[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.vertexY[var14] += var19 - var13;
				}
				var12.calculateBoundsY((byte) 6);
			}
			return var12;
		}
	}
}
