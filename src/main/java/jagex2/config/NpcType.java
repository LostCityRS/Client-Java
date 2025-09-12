package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("gc")
public class NpcType {

	@ObfuscatedName("gc.e")
	public static int count;

	@ObfuscatedName("gc.f")
	public static int[] idx;

	@ObfuscatedName("gc.g")
	public static Packet data;

	@ObfuscatedName("gc.h")
	public static NpcType[] cache;

	@ObfuscatedName("gc.i")
	public static int cachePos;

	@ObfuscatedName("gc.j")
	public long id = -1L;

	@ObfuscatedName("gc.k")
	public String name;

	@ObfuscatedName("gc.l")
	public byte[] desc;

	@ObfuscatedName("gc.m")
	public byte size = 1;

	@ObfuscatedName("gc.n")
	public int[] models;

	@ObfuscatedName("gc.o")
	public int[] head;

	@ObfuscatedName("gc.p")
	public int runanim = -1;

	@ObfuscatedName("gc.q")
	public int walkanim = -1;

	@ObfuscatedName("gc.r")
	public int walkanim_b = -1;

	@ObfuscatedName("gc.s")
	public int walkanim_l = -1;

	@ObfuscatedName("gc.t")
	public int walkanim_r = -1;

	@ObfuscatedName("gc.u")
	public boolean animHasAlpha = false;

	@ObfuscatedName("gc.v")
	public int[] recol_s;

	@ObfuscatedName("gc.w")
	public int[] recol_d;

	@ObfuscatedName("gc.x")
	public String[] op;

	@ObfuscatedName("gc.y")
	public int field1010 = -1;

	@ObfuscatedName("gc.z")
	public int field1011 = -1;

	@ObfuscatedName("gc.A")
	public int field1012 = -1;

	@ObfuscatedName("gc.B")
	public boolean minimap = true;

	@ObfuscatedName("gc.C")
	public int vislevel = -1;

	@ObfuscatedName("gc.D")
	public int resizeh = 128;

	@ObfuscatedName("gc.E")
	public int resizev = 128;

	@ObfuscatedName("gc.F")
	public boolean alwaysontop = false;

	@ObfuscatedName("gc.I")
	public int headicon = -1;

	@ObfuscatedName("gc.J")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("gc.G")
	public int ambient;

	@ObfuscatedName("gc.H")
	public int contrast;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void unpack(Jagfile arg0) {
		data = new Packet(arg0.read("npc.dat", null));
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

	@ObfuscatedName("gc.a(B)V")
	public static final void unload() {
		modelCache = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final NpcType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (cache[var1].id == (long) arg0) {
				return cache[var1];
			}
		}
		cachePos = (cachePos + 1) % 20;
		NpcType var2 = cache[cachePos] = new NpcType();
		data.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(data);
		return var2;
	}

	@ObfuscatedName("gc.a(ZLmb;)V")
	public final void decode(Packet arg1) {
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
				this.name = arg1.gjstr();
			} else if (var3 == 3) {
				this.desc = arg1.gjstrraw();
			} else if (var3 == 12) {
				this.size = arg1.g1b();
			} else if (var3 == 13) {
				this.runanim = arg1.g2();
			} else if (var3 == 14) {
				this.walkanim = arg1.g2();
			} else if (var3 == 16) {
				this.animHasAlpha = true;
			} else if (var3 == 17) {
				this.walkanim = arg1.g2();
				this.walkanim_b = arg1.g2();
				this.walkanim_l = arg1.g2();
				this.walkanim_r = arg1.g2();
			} else if (var3 >= 30 && var3 < 40) {
				if (this.op == null) {
					this.op = new String[5];
				}
				this.op[var3 - 30] = arg1.gjstr();
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
				this.field1010 = arg1.g2();
			} else if (var3 == 91) {
				this.field1011 = arg1.g2();
			} else if (var3 == 92) {
				this.field1012 = arg1.g2();
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
			}
		}
	}

	@ObfuscatedName("gc.a(IB[II)Lfb;")
	public final Model getModel(int arg0, int[] arg2, int arg3) {
		Model var5 = (Model) modelCache.get(this.id);
		boolean var6 = false;
		if (var5 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.models.length; var8++) {
				if (!Model.request(this.models[var8])) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			Model[] var9 = new Model[this.models.length];
			for (int var10 = 0; var10 < this.models.length; var10++) {
				var9[var10] = Model.tryGet(this.models[var10]);
			}
			if (var9.length == 1) {
				var5 = var9[0];
			} else {
				var5 = new Model(var9, var9.length);
			}
			if (this.recol_s != null) {
				for (int var11 = 0; var11 < this.recol_s.length; var11++) {
					var5.recolour(this.recol_s[var11], this.recol_d[var11]);
				}
			}
			var5.createLabelReferences();
			var5.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCache.put(var5, this.id);
		}
		Model var12 = Model.empty;
		var12.set(var5, !this.animHasAlpha);
		if (arg0 != -1 && arg3 != -1) {
			var12.applyTransforms(arg2, arg3, arg0);
		} else if (arg0 != -1) {
			var12.applyTransform(arg0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var12.scale(this.resizeh, this.resizeh, this.resizev);
		}
		var12.calculateBoundsCylinder();
		var12.labelFaces = null;
		var12.labelVertices = null;
		if (this.size == 1) {
			var12.picking = true;
		}
		return var12;
	}

	@ObfuscatedName("gc.a(Z)Lfb;")
	public final Model getHeadModel() {
		if (this.head == null) {
			return null;
		}
		boolean var2 = false;
		for (int var3 = 0; var3 < this.head.length; var3++) {
			if (!Model.request(this.head[var3])) {
				var2 = true;
			}
		}
		if (var2) {
			return null;
		}
		Model[] var4 = new Model[this.head.length];
		for (int var5 = 0; var5 < this.head.length; var5++) {
			var4[var5] = Model.tryGet(this.head[var5]);
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
