package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public final class LocType {

	@ObfuscatedName("ec.W")
	public static LruCache mc1 = new LruCache((byte) 7, 500);

	@ObfuscatedName("ec.X")
	public static LruCache mc2 = new LruCache((byte) 7, 30);

	@ObfuscatedName("ec.l")
	public static final Model[] temp = new Model[4];

	@ObfuscatedName("ec.m")
	public int id = -1;

	@ObfuscatedName("ec.n")
	public int[] model;

	@ObfuscatedName("ec.o")
	public int[] shape;

	@ObfuscatedName("ec.p")
	public String name;

	@ObfuscatedName("ec.r")
	public int[] recol_s;

	@ObfuscatedName("ec.s")
	public int[] recol_d;

	@ObfuscatedName("ec.t")
	public int width;

	@ObfuscatedName("ec.u")
	public int length;

	@ObfuscatedName("ec.v")
	public boolean blockwalk;

	@ObfuscatedName("ec.w")
	public boolean blockrange;

	@ObfuscatedName("ec.x")
	public boolean active;

	@ObfuscatedName("ec.z")
	public boolean sharelight;

	@ObfuscatedName("ec.A")
	public boolean occlude;

	@ObfuscatedName("ec.B")
	public int anim;

	@ObfuscatedName("ec.C")
	public int wallwidth;

	@ObfuscatedName("ec.D")
	public byte ambient;

	@ObfuscatedName("ec.E")
	public byte contrast;

	@ObfuscatedName("ec.F")
	public String[] op;

	@ObfuscatedName("ec.G")
	public int mapfunction;

	@ObfuscatedName("ec.H")
	public int mapscene;

	@ObfuscatedName("ec.I")
	public boolean mirror;

	@ObfuscatedName("ec.J")
	public boolean shadow;

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

	@ObfuscatedName("ec.R")
	public boolean forcedecor;

	@ObfuscatedName("ec.S")
	public boolean breakroutefinding;

	@ObfuscatedName("ec.T")
	public int raiseobject;

	@ObfuscatedName("ec.V")
	public int[] multiloc;

	@ObfuscatedName("ec.U")
	public int multivarbit;

	@ObfuscatedName("ec.a")
	public final boolean field946 = false;

	@ObfuscatedName("ec.b")
	public final int field947 = 44692;

	@ObfuscatedName("ec.c")
	public final byte field948 = 4;

	@ObfuscatedName("ec.d")
	public int field949;

	@ObfuscatedName("ec.e")
	public final int field950 = -139;

	@ObfuscatedName("ec.f")
	public int field951;

	@ObfuscatedName("ec.g")
	public static int numDefinitions;

	@ObfuscatedName("ec.h")
	public static int[] idx;

	@ObfuscatedName("ec.i")
	public static Packet dat;

	@ObfuscatedName("ec.j")
	public static LocType[] recent;

	@ObfuscatedName("ec.k")
	public static int recentPos;

	@ObfuscatedName("ec.q")
	public byte[] desc;

	@ObfuscatedName("ec.y")
	public boolean hillskew;

	@ObfuscatedName("ec.a(Lxb;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("loc.dat", null), 15787);
		Packet var1 = new Packet(arg0.read("loc.idx", null), 15787);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new LocType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static LocType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 20;
		LocType var2 = recent[recentPos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("ec.a(ZLlb;)V")
	public void decode(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.g1();
					if (var3 == 0) {
						if (var2 == -1) {
							active = false;
							if (model != null && (shape == null || shape[0] == 10)) {
								active = true;
							}
							if (op != null) {
								active = true;
							}
						}
						if (breakroutefinding) {
							blockwalk = false;
							blockrange = false;
						}
						if (raiseobject == -1) {
							raiseobject = blockwalk ? 1 : 0;
							return;
						}
						return;
					}
					if (var3 == 1) {
						var4 = arg0.g1();
						break;
					}
					if (var3 == 2) {
						name = arg0.gstr();
					} else if (var3 == 3) {
						desc = arg0.gstrbyte(field947);
					} else if (var3 == 5) {
						int var6 = arg0.g1();
						if (var6 > 0) {
							shape = null;
							model = new int[var6];
							for (int var7 = 0; var7 < var6; var7++) {
								model[var7] = arg0.g2();
							}
						}
					} else if (var3 == 14) {
						width = arg0.g1();
					} else if (var3 == 15) {
						length = arg0.g1();
					} else if (var3 == 17) {
						blockwalk = false;
					} else if (var3 == 18) {
						blockrange = false;
					} else if (var3 == 19) {
						var2 = arg0.g1();
						if (var2 == 1) {
							active = true;
						}
					} else if (var3 == 21) {
						hillskew = true;
					} else if (var3 == 22) {
						sharelight = true;
					} else if (var3 == 23) {
						occlude = true;
					} else if (var3 == 24) {
						anim = arg0.g2();
						if (anim == 65535) {
							anim = -1;
						}
					} else if (var3 == 28) {
						wallwidth = arg0.g1();
					} else if (var3 == 29) {
						ambient = arg0.g1b();
					} else if (var3 == 39) {
						contrast = arg0.g1b();
					} else if (var3 >= 30 && var3 < 39) {
						if (op == null) {
							op = new String[5];
						}
						op[var3 - 30] = arg0.gstr();
						if (op[var3 - 30].equalsIgnoreCase("hidden")) {
							op[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.g1();
						recol_s = new int[var8];
						recol_d = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							recol_s[var9] = arg0.g2();
							recol_d[var9] = arg0.g2();
						}
					} else if (var3 == 60) {
						mapfunction = arg0.g2();
					} else if (var3 == 62) {
						mirror = true;
					} else if (var3 == 64) {
						shadow = false;
					} else if (var3 == 65) {
						resizex = arg0.g2();
					} else if (var3 == 66) {
						resizey = arg0.g2();
					} else if (var3 == 67) {
						resizez = arg0.g2();
					} else if (var3 == 68) {
						mapscene = arg0.g2();
					} else if (var3 == 69) {
						forceapproach = arg0.g1();
					} else if (var3 == 70) {
						offsetx = arg0.g2b();
					} else if (var3 == 71) {
						offsety = arg0.g2b();
					} else if (var3 == 72) {
						offsetz = arg0.g2b();
					} else if (var3 == 73) {
						forcedecor = true;
					} else if (var3 == 74) {
						breakroutefinding = true;
					} else if (var3 == 75) {
						raiseobject = arg0.g1();
					} else if (var3 == 77) {
						multivarbit = arg0.g2();
						int var10 = arg0.g1();
						multiloc = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							multiloc[var11] = arg0.g2();
							if (multiloc[var11] == 65535) {
								multiloc[var11] = -1;
							}
						}
					}
				}
			} while (var4 <= 0);
			shape = new int[var4];
			model = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				model[var5] = arg0.g2();
				shape[var5] = arg0.g1();
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public boolean checkModel(int arg0) {
		if (shape != null) {
			for (int var4 = 0; var4 < shape.length; var4++) {
				if (shape[var4] == arg0) {
					return Model.requestDownload(model[var4] & 0xFFFF);
				}
			}
			return true;
		} else if (model == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < model.length; var3++) {
				var2 &= Model.requestDownload(model[var3] & 0xFFFF);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ec.b(I)Z")
	public boolean checkModelAll() {
		if (model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < model.length; var2++) {
			var1 &= Model.requestDownload(model[var2] & 0xFFFF);
		}
		return var1;
	}

	@ObfuscatedName("ec.a(IIIIIII)Leb;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = buildModel(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}
		if (hillskew || sharelight) {
			var8 = new Model(sharelight, 0, var8, hillskew);
		}
		if (hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.numPoints; var10++) {
				int var11 = var8.pointX[var10];
				int var12 = var8.pointZ[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.pointY[var10] += var15 - var9;
			}
			var8.recalcBoundingCylinder(field950);
		}
		return var8;
	}

	@ObfuscatedName("ec.a(BIII)Leb;")
	public Model buildModel(int arg0, int arg1, int arg2) {
		Model var4 = null;
		long var5;
		if (shape == null) {
			if (arg2 != 10) {
				return null;
			}
			var5 = (long) ((id << 6) + arg1) + ((long) (arg0 + 1) << 32);
			Model var7 = (Model) mc2.find(var5);
			if (var7 != null) {
				return var7;
			}
			if (model == null) {
				return null;
			}
			boolean var8 = mirror ^ arg1 > 3;
			int var9 = model.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = model[var10];
				if (var8) {
					var11 += 65536;
				}
				var4 = (Model) mc1.find((long) var11);
				if (var4 == null) {
					var4 = Model.load(var11 & 0xFFFF, field948);
					if (var4 == null) {
						return null;
					}
					if (var8) {
						var4.mirror();
					}
					mc1.put((long) var11, var4);
				}
				if (var9 > 1) {
					temp[var10] = var4;
				}
			}
			if (var9 > 1) {
				var4 = new Model(temp, var9, -33019);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < shape.length; var13++) {
				if (shape[var13] == arg2) {
					var12 = var13;
					break;
				}
			}
			if (var12 == -1) {
				return null;
			}
			var5 = (long) ((id << 6) + (var12 << 3) + arg1) + ((long) (arg0 + 1) << 32);
			Model var14 = (Model) mc2.find(var5);
			if (var14 != null) {
				return var14;
			}
			int var15 = model[var12];
			boolean var16 = mirror ^ arg1 > 3;
			if (var16) {
				var15 += 65536;
			}
			var4 = (Model) mc1.find((long) var15);
			if (var4 == null) {
				var4 = Model.load(var15 & 0xFFFF, field948);
				if (var4 == null) {
					return null;
				}
				if (var16) {
					var4.mirror();
				}
				mc1.put((long) var15, var4);
			}
		}
		boolean var17;
		if (resizex == 128 && resizey == 128 && resizez == 128) {
			var17 = false;
		} else {
			var17 = true;
		}
		boolean var18;
		if (offsetx == 0 && offsety == 0 && offsetz == 0) {
			var18 = false;
		} else {
			var18 = true;
		}
		Model var19 = new Model(var4, AnimFrame.animateTransparencies(arg0), arg1 == 0 && arg0 == -1 && !var17 && !var18, field949, recol_s == null);
		if (arg0 != -1) {
			var19.prepareAnim();
			var19.animate(arg0);
			var19.labelFaces = null;
			var19.labelVertices = null;
		}
		while (arg1-- > 0) {
			var19.rotate90();
		}
		if (recol_s != null) {
			for (int var20 = 0; var20 < recol_s.length; var20++) {
				var19.recolour(recol_s[var20], recol_d[var20]);
			}
		}
		if (var17) {
			var19.resize(resizex, resizez, resizey);
		}
		if (var18) {
			var19.translate(offsety, offsetx, offsetz);
		}
		var19.calculateNormals(ambient + 64, contrast * 5 + 768, -50, -10, -50, !sharelight);
		if (raiseobject == 1) {
			var19.objRaise = var19.minY;
		}
		mc2.put(var5, var19);
		return var19;
	}

	@ObfuscatedName("ec.a(B)V")
	public static void unload() {
		mc1 = null;
		mc2 = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("ec.a()V")
	public void reset() {
		model = null;
		shape = null;
		name = null;
		desc = null;
		recol_s = null;
		recol_d = null;
		width = 1;
		length = 1;
		blockwalk = true;
		blockrange = true;
		active = false;
		hillskew = false;
		sharelight = false;
		occlude = false;
		anim = -1;
		wallwidth = 16;
		ambient = 0;
		contrast = 0;
		op = null;
		mapfunction = -1;
		mapscene = -1;
		mirror = false;
		shadow = true;
		resizex = 128;
		resizey = 128;
		resizez = 128;
		forceapproach = 0;
		offsetx = 0;
		offsety = 0;
		offsetz = 0;
		forcedecor = false;
		breakroutefinding = false;
		raiseobject = -1;
		multivarbit = -1;
		multiloc = null;
	}

	@ObfuscatedName("ec.a(Lub;B)V")
	public void prefetchModelAll(OnDemand arg0) {
		if (model != null) {
			for (int var2 = 0; var2 < model.length; var2++) {
				arg0.prefetch(model[var2] & 0xFFFF, 0);
			}
		}
	}
}
