package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("gc")
public class NpcType {

	@ObfuscatedName("gc.b")
	public static int count;

	@ObfuscatedName("gc.c")
	public static int[] idx;

	@ObfuscatedName("gc.d")
	public static Packet data;

	@ObfuscatedName("gc.e")
	public static NpcType[] types;

	@ObfuscatedName("gc.f")
	public static int cachePos;

	@ObfuscatedName("gc.g")
	public long id = -1L;

	@ObfuscatedName("gc.h")
	public String name;

	@ObfuscatedName("gc.i")
	public byte[] desc;

	@ObfuscatedName("gc.j")
	public byte size = 1;

	@ObfuscatedName("gc.k")
	public int[] models;

	@ObfuscatedName("gc.l")
	public int[] heads;

	@ObfuscatedName("gc.m")
	public int readyanim = -1;

	@ObfuscatedName("gc.n")
	public int walkanim = -1;

	@ObfuscatedName("gc.o")
	public int walkanim_b = -1;

	@ObfuscatedName("gc.p")
	public int walkanim_r = -1;

	@ObfuscatedName("gc.q")
	public int walkanim_l = -1;

	@ObfuscatedName("gc.r")
	public boolean animHasAlpha = false;

	@ObfuscatedName("gc.s")
	public int[] recol_s;

	@ObfuscatedName("gc.t")
	public int[] recol_d;

	@ObfuscatedName("gc.u")
	public String[] op;

	@ObfuscatedName("gc.v")
	public int field1008 = -1;

	@ObfuscatedName("gc.w")
	public int field1009 = -1;

	@ObfuscatedName("gc.x")
	public int field1010 = -1;

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
	public static LruCache modelCacheStatic = new LruCache(30);

	@ObfuscatedName("gc.D")
	public int ambient;

	@ObfuscatedName("gc.E")
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
		types = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			types[var4] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void unload() {
		modelCacheStatic = null;
		idx = null;
		types = null;
		data = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final NpcType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if ((long) arg0 == types[var1].id) {
				return types[var1];
			}
		}
		cachePos = (cachePos + 1) % 20;
		NpcType var2 = types[cachePos] = new NpcType();
		data.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(data);
		return var2;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public final void decode(Packet arg1) {
		while (true) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				int var5 = arg1.g1();
				this.models = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.models[var6] = arg1.g2();
				}
			} else if (var4 == 2) {
				this.name = arg1.gjstr();
			} else if (var4 == 3) {
				this.desc = arg1.gjstrraw();
			} else if (var4 == 12) {
				this.size = arg1.g1b();
			} else if (var4 == 13) {
				this.readyanim = arg1.g2();
			} else if (var4 == 14) {
				this.walkanim = arg1.g2();
			} else if (var4 == 16) {
				this.animHasAlpha = true;
			} else if (var4 == 17) {
				this.walkanim = arg1.g2();
				this.walkanim_b = arg1.g2();
				this.walkanim_r = arg1.g2();
				this.walkanim_l = arg1.g2();
			} else if (var4 >= 30 && var4 < 40) {
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
				int var9 = arg1.g1();
				this.heads = new int[var9];
				for (int var10 = 0; var10 < var9; var10++) {
					this.heads[var10] = arg1.g2();
				}
			} else if (var4 == 90) {
				this.field1008 = arg1.g2();
			} else if (var4 == 91) {
				this.field1009 = arg1.g2();
			} else if (var4 == 92) {
				this.field1010 = arg1.g2();
			} else if (var4 == 93) {
				this.minimap = false;
			} else if (var4 == 95) {
				this.vislevel = arg1.g2();
			} else if (var4 == 97) {
				this.resizeh = arg1.g2();
			} else if (var4 == 98) {
				this.resizev = arg1.g2();
			} else if (var4 == 99) {
				this.alwaysontop = true;
			} else if (var4 == 100) {
				this.ambient = arg1.g1b();
			} else if (var4 == 101) {
				this.contrast = arg1.g1b() * 5;
			} else if (var4 == 102) {
				this.headicon = arg1.g2();
			}
		}
	}

	@ObfuscatedName("gc.a(BII[I)Lfb;")
	public final Model getModel(int arg1, int arg2, int[] arg3) {
		Model var5 = (Model) modelCacheStatic.get(this.id);
		if (var5 == null) {
			boolean var8 = false;
			for (int var9 = 0; var9 < this.models.length; var9++) {
				if (!Model.validate(this.models[var9])) {
					var8 = true;
				}
			}
			if (var8) {
				return null;
			}
			Model[] var10 = new Model[this.models.length];
			for (int var11 = 0; var11 < this.models.length; var11++) {
				var10[var11] = Model.tryGet(this.models[var11]);
			}
			if (var10.length == 1) {
				var5 = var10[0];
			} else {
				var5 = new Model(var10.length, var10);
			}
			if (this.recol_s != null) {
				for (int var12 = 0; var12 < this.recol_s.length; var12++) {
					var5.recolour(this.recol_s[var12], this.recol_d[var12]);
				}
			}
			var5.createLabelReferences(-591);
			var5.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCacheStatic.put(var5, this.id);
		}
		Model var13 = Model.empty;
		var13.set(!this.animHasAlpha, var5);
		if (arg1 != -1 && arg2 != -1) {
			var13.applyTransforms(arg1, arg2, arg3);
		} else if (arg1 != -1) {
			var13.applyTransform(arg1);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var13.scale(this.resizev, this.resizeh, this.resizeh);
		}
		var13.calculateBoundsCylinder();
		var13.labelFaces = null;
		var13.labelVertices = null;
		if (this.size == 1) {
			var13.picking = true;
		}
		return var13;
	}

	@ObfuscatedName("gc.a(Z)Lfb;")
	public final Model getHeadModel() {
		if (this.heads == null) {
			return null;
		}
		boolean var3 = false;
		for (int var4 = 0; var4 < this.heads.length; var4++) {
			if (!Model.validate(this.heads[var4])) {
				var3 = true;
			}
		}
		if (var3) {
			return null;
		}
		Model[] var5 = new Model[this.heads.length];
		for (int var6 = 0; var6 < this.heads.length; var6++) {
			var5[var6] = Model.tryGet(this.heads[var6]);
		}
		Model var7;
		if (var5.length == 1) {
			var7 = var5[0];
		} else {
			var7 = new Model(var5.length, var5);
		}
		if (this.recol_s != null) {
			for (int var8 = 0; var8 < this.recol_s.length; var8++) {
				var7.recolour(this.recol_s[var8], this.recol_d[var8]);
			}
		}
		return var7;
	}
}
