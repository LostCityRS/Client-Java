package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public class LocType {

	@ObfuscatedName("ec.c")
	public static int count;

	@ObfuscatedName("ec.d")
	public static int[] idx;

	@ObfuscatedName("ec.e")
	public static Packet dat;

	@ObfuscatedName("ec.f")
	public static LocType[] cache;

	@ObfuscatedName("ec.g")
	public static int cachePos;

	@ObfuscatedName("ec.h")
	public static Model[] temp = new Model[4];

	@ObfuscatedName("ec.i")
	public int id = -1;

	@ObfuscatedName("ec.j")
	public int[] models;

	@ObfuscatedName("ec.k")
	public int[] shapes;

	@ObfuscatedName("ec.l")
	public String name;

	@ObfuscatedName("ec.m")
	public byte[] desc;

	@ObfuscatedName("ec.n")
	public int[] recol_s;

	@ObfuscatedName("ec.o")
	public int[] recol_d;

	@ObfuscatedName("ec.p")
	public int width;

	@ObfuscatedName("ec.q")
	public int length;

	@ObfuscatedName("ec.r")
	public boolean blockwalk;

	@ObfuscatedName("ec.s")
	public boolean blockrange;

	@ObfuscatedName("ec.t")
	public boolean active;

	@ObfuscatedName("ec.u")
	public boolean hillskew;

	@ObfuscatedName("ec.v")
	public boolean sharelight;

	@ObfuscatedName("ec.w")
	public boolean occlude;

	@ObfuscatedName("ec.x")
	public int anim;

	@ObfuscatedName("ec.y")
	public int wallwidth;

	@ObfuscatedName("ec.z")
	public byte ambient;

	@ObfuscatedName("ec.Q")
	public static LruCache mc1 = new LruCache(500);

	@ObfuscatedName("ec.R")
	public static LruCache mc2 = new LruCache(30);

	@ObfuscatedName("ec.A")
	public byte contrast;

	@ObfuscatedName("ec.C")
	public int mapfunction;

	@ObfuscatedName("ec.D")
	public int mapscene;

	@ObfuscatedName("ec.G")
	public int resizex;

	@ObfuscatedName("ec.H")
	public int resizey;

	@ObfuscatedName("ec.I")
	public int resizez;

	@ObfuscatedName("ec.J")
	public int offsetx;

	@ObfuscatedName("ec.K")
	public int offsety;

	@ObfuscatedName("ec.L")
	public int offsetz;

	@ObfuscatedName("ec.M")
	public int forceapproach;

	@ObfuscatedName("ec.P")
	public int raiseobject;

	@ObfuscatedName("ec.E")
	public boolean mirror;

	@ObfuscatedName("ec.F")
	public boolean shadow;

	@ObfuscatedName("ec.N")
	public boolean forcedecor;

	@ObfuscatedName("ec.O")
	public boolean breakroutefinding;

	@ObfuscatedName("ec.B")
	public String[] op;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static void unpack(JagFile arg0) {
		dat = new Packet(arg0.read("loc.dat", null));
		Packet var1 = new Packet(arg0.read("loc.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		cache = new LocType[10];
		for (int var4 = 0; var4 < 10; var4++) {
			cache[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(I)V")
	public static void unload() {
		mc1 = null;
		mc2 = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("ec.b(I)Lec;")
	public static LocType get(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (cache[var1].id == arg0) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 10;
		LocType var2 = cache[cachePos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("ec.a()V")
	public void reset() {
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
		this.breakroutefinding = false;
		this.raiseobject = -1;
	}

	@ObfuscatedName("ec.a(ILmb;)V")
	public void decode(Packet arg1) {
		int var3 = -1;
		while (true) {
			int var5;
			do {
				while (true) {
					int var4 = arg1.g1();
					if (var4 == 0) {
						if (var3 == -1) {
							this.active = false;
							if (this.models != null && (this.shapes == null || this.shapes[0] == 10)) {
								this.active = true;
							}
							if (this.op != null) {
								this.active = true;
							}
						}
						if (this.breakroutefinding) {
							this.blockwalk = false;
							this.blockrange = false;
						}
						if (this.raiseobject == -1) {
							this.raiseobject = this.blockwalk ? 1 : 0;
							return;
						}
						return;
					}
					if (var4 == 1) {
						var5 = arg1.g1();
						break;
					}
					if (var4 == 2) {
						this.name = arg1.gstr();
					} else if (var4 == 3) {
						this.desc = arg1.gstrbyte();
					} else if (var4 == 5) {
						int var7 = arg1.g1();
						if (var7 > 0) {
							this.shapes = null;
							this.models = new int[var7];
							for (int var8 = 0; var8 < var7; var8++) {
								this.models[var8] = arg1.g2();
							}
						}
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
						this.op[var4 - 30] = arg1.gstr();
						if (this.op[var4 - 30].equalsIgnoreCase("hidden")) {
							this.op[var4 - 30] = null;
						}
					} else if (var4 == 40) {
						int var9 = arg1.g1();
						this.recol_s = new int[var9];
						this.recol_d = new int[var9];
						for (int var10 = 0; var10 < var9; var10++) {
							this.recol_s[var10] = arg1.g2();
							this.recol_d[var10] = arg1.g2();
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
					} else if (var4 == 74) {
						this.breakroutefinding = true;
					} else if (var4 == 75) {
						this.raiseobject = arg1.g1();
					}
				}
			} while (var5 <= 0);
			this.shapes = new int[var5];
			this.models = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.models[var6] = arg1.g2();
				this.shapes[var6] = arg1.g1();
			}
		}
	}

	@ObfuscatedName("ec.a(IZ)Z")
	public boolean checkModel(int arg0) {
		if (this.shapes != null) {
			for (int var5 = 0; var5 < this.shapes.length; var5++) {
				if (this.shapes[var5] == arg0) {
					return Model.requestDownload(this.models[var5] & 0xFFFF);
				}
			}
			return true;
		} else if (this.models == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.models.length; var4++) {
				var3 &= Model.requestDownload(this.models[var4] & 0xFFFF);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ec.c(I)Z")
	public boolean checkModelAll() {
		if (this.models == null) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.models.length; var3++) {
				var2 &= Model.requestDownload(this.models[var3] & 0xFFFF);
			}
			return var2;
		}
	}

	@ObfuscatedName("ec.a(ILvb;)V")
	public void prefetchModelAll(OnDemand arg1) {
		if (this.models != null) {
			for (int var3 = 0; var3 < this.models.length; var3++) {
				arg1.prefetch(0, this.models[var3] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.buildModel(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}
		if (this.hillskew || this.sharelight) {
			var8 = new Model(this.hillskew, var8, this.sharelight);
		}
		if (this.hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.vertexCount; var10++) {
				int var11 = var8.vertexX[var10];
				int var12 = var8.vertexZ[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.vertexY[var10] += var15 - var9;
			}
			var8.calcHeight();
		}
		return var8;
	}

	@ObfuscatedName("ec.a(IBII)Lfb;")
	public Model buildModel(int arg0, int arg2, int arg3) {
		Model var5 = null;
		boolean var6 = false;
		long var7;
		if (this.shapes == null) {
			if (arg0 != 10) {
				return null;
			}
			var7 = (long) ((this.id << 6) + arg3) + ((long) (arg2 + 1) << 32);
			Model var9 = (Model) mc2.get(var7);
			if (var9 != null) {
				return var9;
			}
			if (this.models == null) {
				return null;
			}
			boolean var10 = this.mirror ^ arg3 > 3;
			int var11 = this.models.length;
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = this.models[var12];
				if (var10) {
					var13 += 65536;
				}
				var5 = (Model) mc1.get((long) var13);
				if (var5 == null) {
					var5 = Model.load(var13 & 0xFFFF);
					if (var5 == null) {
						return null;
					}
					if (var10) {
						var5.rotate180();
					}
					mc1.put(var5, (long) var13);
				}
				if (var11 > 1) {
					temp[var12] = var5;
				}
			}
			if (var11 > 1) {
				var5 = new Model(temp, var11);
			}
		} else {
			int var14 = -1;
			for (int var15 = 0; var15 < this.shapes.length; var15++) {
				if (this.shapes[var15] == arg0) {
					var14 = var15;
					break;
				}
			}
			if (var14 == -1) {
				return null;
			}
			var7 = (long) ((this.id << 6) + (var14 << 3) + arg3) + ((long) (arg2 + 1) << 32);
			Model var16 = (Model) mc2.get(var7);
			if (var16 != null) {
				return var16;
			}
			int var17 = this.models[var14];
			boolean var18 = this.mirror ^ arg3 > 3;
			if (var18) {
				var17 += 65536;
			}
			var5 = (Model) mc1.get((long) var17);
			if (var5 == null) {
				var5 = Model.load(var17 & 0xFFFF);
				if (var5 == null) {
					return null;
				}
				if (var18) {
					var5.rotate180();
				}
				mc1.put(var5, (long) var17);
			}
		}
		boolean var19;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var19 = false;
		} else {
			var19 = true;
		}
		boolean var20;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var20 = false;
		} else {
			var20 = true;
		}
		Model var21 = new Model(AnimFrame.shareAlpha(arg2), arg3 == 0 && arg2 == -1 && !var19 && !var20, this.recol_s == null, var5);
		if (arg2 != -1) {
			var21.prepareAnim();
			var21.animate(arg2);
			var21.labelFaces = null;
			var21.labelVertices = null;
		}
		while (arg3-- > 0) {
			var21.rotate90();
		}
		if (this.recol_s != null) {
			for (int var22 = 0; var22 < this.recol_s.length; var22++) {
				var21.recolour(this.recol_s[var22], this.recol_d[var22]);
			}
		}
		if (var19) {
			var21.resize(this.resizez, this.resizex, this.resizey);
		}
		if (var20) {
			var21.translate(this.offsetx, this.offsetz, this.offsety);
		}
		var21.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
		if (this.raiseobject == 1) {
			var21.objRaise = var21.minY;
		}
		mc2.put(var21, var7);
		return var21;
	}
}
