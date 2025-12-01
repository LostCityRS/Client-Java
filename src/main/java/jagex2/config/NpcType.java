package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("gc")
public class NpcType {

	@ObfuscatedName("gc.c")
	public static int count;

	@ObfuscatedName("gc.d")
	public static int[] idx;

	@ObfuscatedName("gc.e")
	public static Packet dat;

	@ObfuscatedName("gc.f")
	public static NpcType[] cache;

	@ObfuscatedName("gc.g")
	public static int cachePos;

	@ObfuscatedName("gc.h")
	public long id = -1L;

	@ObfuscatedName("gc.i")
	public String name;

	@ObfuscatedName("gc.j")
	public byte[] desc;

	@ObfuscatedName("gc.k")
	public byte size = 1;

	@ObfuscatedName("gc.l")
	public int[] models;

	@ObfuscatedName("gc.m")
	public int[] head;

	@ObfuscatedName("gc.n")
	public int runanim = -1;

	@ObfuscatedName("gc.o")
	public int walkanim = -1;

	@ObfuscatedName("gc.p")
	public int walkanim_b = -1;

	@ObfuscatedName("gc.q")
	public int walkanim_l = -1;

	@ObfuscatedName("gc.r")
	public int walkanim_r = -1;

	@ObfuscatedName("gc.s")
	public int[] recol_s;

	@ObfuscatedName("gc.t")
	public int[] recol_d;

	@ObfuscatedName("gc.u")
	public String[] op;

	@ObfuscatedName("gc.v")
	public int field998 = -1;

	@ObfuscatedName("gc.w")
	public int field999 = -1;

	@ObfuscatedName("gc.x")
	public int field1000 = -1;

	@ObfuscatedName("gc.y")
	public boolean minimap = true;

	@ObfuscatedName("gc.z")
	public int vislevel = -1;

	@ObfuscatedName("gc.A")
	public int resizeh = 128;

	@ObfuscatedName("gc.B")
	public int resizev = 128;

	@ObfuscatedName("gc.C")
	public boolean alwaysontop = false;

	@ObfuscatedName("gc.F")
	public int headicon = -1;

	@ObfuscatedName("gc.G")
	public int turnspeed = 32;

	@ObfuscatedName("gc.H")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("gc.D")
	public int ambient;

	@ObfuscatedName("gc.E")
	public int contrast;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static void unpack(JagFile arg0) {
		dat = new Packet(arg0.read("npc.dat", null));
		Packet var1 = new Packet(arg0.read("npc.idx", null));
		count = var1.g2();
		idx = new int[count];
		int var2 = 2;
		for (int var3 = 0; var3 < count; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		cache = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			cache[var4] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(I)V")
	public static void unload() {
		modelCache = null;
		idx = null;
		cache = null;
		dat = null;
	}

	@ObfuscatedName("gc.b(I)Lgc;")
	public static NpcType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (cache[var1].id == (long) arg0) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 20;
		NpcType var2 = cache[cachePos] = new NpcType();
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			if (var3 == 1) {
				int var4 = arg1.g1();
				this.models = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					this.models[var5] = arg1.g2();
				}
			} else if (var3 == 2) {
				this.name = arg1.gstr();
			} else if (var3 == 3) {
				this.desc = arg1.gstrbyte();
			} else if (var3 == 12) {
				this.size = arg1.g1b();
			} else if (var3 == 13) {
				this.runanim = arg1.g2();
			} else if (var3 == 14) {
				this.walkanim = arg1.g2();
			} else if (var3 == 17) {
				this.walkanim = arg1.g2();
				this.walkanim_b = arg1.g2();
				this.walkanim_l = arg1.g2();
				this.walkanim_r = arg1.g2();
			} else if (var3 >= 30 && var3 < 40) {
				if (this.op == null) {
					this.op = new String[5];
				}
				this.op[var3 - 30] = arg1.gstr();
				if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
					this.op[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg1.g1();
				this.recol_s = new int[var6];
				this.recol_d = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					this.recol_s[var7] = arg1.g2();
					this.recol_d[var7] = arg1.g2();
				}
			} else if (var3 == 60) {
				int var8 = arg1.g1();
				this.head = new int[var8];
				for (int var9 = 0; var9 < var8; var9++) {
					this.head[var9] = arg1.g2();
				}
			} else if (var3 == 90) {
				this.field998 = arg1.g2();
			} else if (var3 == 91) {
				this.field999 = arg1.g2();
			} else if (var3 == 92) {
				this.field1000 = arg1.g2();
			} else if (var3 == 93) {
				this.minimap = false;
			} else if (var3 == 95) {
				this.vislevel = arg1.g2();
			} else if (var3 == 97) {
				this.resizeh = arg1.g2();
			} else if (var3 == 98) {
				this.resizev = arg1.g2();
			} else if (var3 == 99) {
				this.alwaysontop = true;
			} else if (var3 == 100) {
				this.ambient = arg1.g1b();
			} else if (var3 == 101) {
				this.contrast = arg1.g1b() * 5;
			} else if (var3 == 102) {
				this.headicon = arg1.g2();
			} else if (var3 == 103) {
				this.turnspeed = arg1.g2();
			}
		}
	}

	@ObfuscatedName("gc.a(II[II)Lfb;")
	public Model getTempModel(int arg1, int[] arg2, int arg3) {
		Model var5 = (Model) modelCache.get(this.id);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < this.models.length; var7++) {
				if (!Model.requestDownload(this.models[var7])) {
					var6 = true;
				}
			}
			if (var6) {
				return null;
			}
			Model[] var8 = new Model[this.models.length];
			for (int var9 = 0; var9 < this.models.length; var9++) {
				var8[var9] = Model.load(this.models[var9]);
			}
			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new Model(var8, var8.length);
			}
			if (this.recol_s != null) {
				for (int var10 = 0; var10 < this.recol_s.length; var10++) {
					var5.recolour(this.recol_s[var10], this.recol_d[var10]);
				}
			}
			var5.prepareAnim();
			var5.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCache.put(var5, this.id);
		}
		Model var11 = Model.empty;
		var11.set(AnimFrame.shareAlpha(arg1) & AnimFrame.shareAlpha(arg3), var5);
		if (arg1 != -1 && arg3 != -1) {
			var11.maskAnimate(arg2, arg1, arg3);
		} else if (arg1 != -1) {
			var11.animate(arg1);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var11.resize(this.resizeh, this.resizeh, this.resizev);
		}
		var11.calcBoundingCylinder();
		var11.labelFaces = null;
		var11.labelVertices = null;
		if (this.size == 1) {
			var11.useAABBMouseCheck = true;
		}
		return var11;
	}

	@ObfuscatedName("gc.c(I)Lfb;")
	public Model getHead() {
		if (this.head == null) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < this.head.length; var3++) {
			if (!Model.requestDownload(this.head[var3])) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var4 = new Model[this.head.length];
		for (int var5 = 0; var5 < this.head.length; var5++) {
			var4[var5] = Model.load(this.head[var5]);
		}
		Model var6;
		if (var4.length == 1) {
			var6 = var4[0];
		} else {
			var6 = new Model(var4, var4.length);
		}
		if (this.recol_s != null) {
			for (int var7 = 0; var7 < this.recol_s.length; var7++) {
				var6.recolour(this.recol_s[var7], this.recol_d[var7]);
			}
		}
		return var6;
	}
}
