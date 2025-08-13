package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.dash3d.Model;
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
	public static NpcType[] cache;

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
	public int[] head;

	@ObfuscatedName("gc.m")
	public int readyanim = -1; // ready anim (idle)

	@ObfuscatedName("gc.n")
	public int walkanim = -1; // walk anim (moving forward)

	@ObfuscatedName("gc.o")
	public int walkanim_b = -1; // walk anim (moving backward)

	@ObfuscatedName("gc.p")
	public int walkanim_r = -1; // walk anim (moving right)

	@ObfuscatedName("gc.q")
	public int walkanim_l = -1; // walk anim (moving left)

	@ObfuscatedName("gc.r")
	public boolean animHasAlpha = false;

	@ObfuscatedName("gc.s")
	public int[] recol_s; // recolour source

	@ObfuscatedName("gc.t")
	public int[] recol_d; // recolour dest

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
	public int vislevel = -1; // visible combat level

	@ObfuscatedName("gc.A")
	public int resizeh = 128;

	@ObfuscatedName("gc.B")
	public int resizev = 128;

	@ObfuscatedName("gc.C")
	public boolean alwaysontop = false;

	@ObfuscatedName("gc.F")
	public int headicon = -1; // head icon graphic

	@ObfuscatedName("gc.G")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("gc.D")
	public int ambient;

	@ObfuscatedName("gc.E")
	public int contrast;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static void unpack(Jagfile config) {
		data = new Packet(config.read("npc.dat", null));
		Packet temp = new Packet(config.read("npc.idx", null));

		count = temp.g2();
		idx = new int[count];

		int pos = 2;
		for (int i = 0; i < count; i++) {
			idx[i] = pos;
			pos += temp.g2();
		}

		cache = new NpcType[20];
		for (int i = 0; i < 20; i++) {
			cache[i] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static void unload() {
		modelCache = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static NpcType get(int id) {
		for (int i = 0; i < 20; i++) {
			if ((long) id == cache[i].id) {
				return cache[i];
			}
		}

		cachePos = (cachePos + 1) % 20;

		NpcType npc = cache[cachePos] = new NpcType();
		data.pos = idx[id];
		npc.id = id;
		npc.decode(data);
		return npc;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public final void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				int count = buf.g1();
				this.models = new int[count];

				for (int i = 0; i < count; i++) {
					this.models[i] = buf.g2();
				}
			} else if (code == 2) {
				this.name = buf.gjstr();
			} else if (code == 3) {
				this.desc = buf.gjstrraw();
			} else if (code == 12) {
				this.size = buf.g1b();
			} else if (code == 13) {
				this.readyanim = buf.g2();
			} else if (code == 14) {
				this.walkanim = buf.g2();
			} else if (code == 16) {
				this.animHasAlpha = true;
			} else if (code == 17) {
				this.walkanim = buf.g2();
				this.walkanim_b = buf.g2();
				this.walkanim_r = buf.g2();
				this.walkanim_l = buf.g2();
			} else if (code >= 30 && code < 40) {
				if (this.op == null) {
					this.op = new String[5];
				}

				this.op[code - 30] = buf.gjstr();
				if (this.op[code - 30].equalsIgnoreCase("hidden")) {
					this.op[code - 30] = null;
				}
			} else if (code == 40) {
				int count = buf.g1();
				this.recol_s = new int[count];
				this.recol_d = new int[count];

				for (int i = 0; i < count; i++) {
					this.recol_s[i] = buf.g2();
					this.recol_d[i] = buf.g2();
				}
			} else if (code == 60) {
				int count = buf.g1();
				this.head = new int[count];

				for (int i = 0; i < count; i++) {
					this.head[i] = buf.g2();
				}
			} else if (code == 90) {
				this.field1008 = buf.g2();
			} else if (code == 91) {
				this.field1009 = buf.g2();
			} else if (code == 92) {
				this.field1010 = buf.g2();
			} else if (code == 93) {
				this.minimap = false;
			} else if (code == 95) {
				this.vislevel = buf.g2();
			} else if (code == 97) {
				this.resizeh = buf.g2();
			} else if (code == 98) {
				this.resizev = buf.g2();
			} else if (code == 99) {
				this.alwaysontop = true;
			} else if (code == 100) {
				this.ambient = buf.g1b();
			} else if (code == 101) {
				this.contrast = buf.g1b() * 5;
			} else if (code == 102) {
				this.headicon = buf.g2();
			}
		}
	}

	@ObfuscatedName("gc.a(BII[I)Lfb;")
	public final Model getModel(int primaryTransformId, int secondaryTransformId, int[] seqMask) {
		Model model = (Model) modelCache.get(this.id);

		if (model == null) {
			boolean ready = false;
			for (int i = 0; i < this.models.length; i++) {
				if (!Model.request(this.models[i])) {
					ready = true;
				}
			}
			if (ready) {
				return null;
			}

			Model[] models = new Model[this.models.length];
			for (int i = 0; i < this.models.length; i++) {
				models[i] = Model.tryGet(this.models[i]);
			}

			if (models.length == 1) {
				model = models[0];
			} else {
				model = new Model(models.length, models);
			}

			if (this.recol_s != null) {
				for (int i = 0; i < this.recol_s.length; i++) {
					model.recolour(this.recol_s[i], this.recol_d[i]);
				}
			}

			model.createLabelReferences();
			model.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCache.put(model, this.id);
		}

		Model tmp = Model.empty;
		tmp.set(!this.animHasAlpha, model);

		if (primaryTransformId != -1 && secondaryTransformId != -1) {
			tmp.applyTransforms(primaryTransformId, secondaryTransformId, seqMask);
		} else if (primaryTransformId != -1) {
			tmp.applyTransform(primaryTransformId);
		}

		if (this.resizeh != 128 || this.resizev != 128) {
			tmp.scale(this.resizev, this.resizeh, this.resizeh);
		}

		tmp.calculateBoundsCylinder();
		tmp.labelFaces = null;
		tmp.labelVertices = null;

		if (this.size == 1) {
			tmp.picking = true;
		}

		return tmp;
	}

	@ObfuscatedName("gc.a(Z)Lfb;")
	public final Model getHeadModel() {
		if (this.head == null) {
			return null;
		}

		boolean exists = false;
		for (int i = 0; i < this.head.length; i++) {
			if (!Model.request(this.head[i])) {
				exists = true;
			}
		}
		if (exists) {
			return null;
		}

		Model[] models = new Model[this.head.length];
		for (int i = 0; i < this.head.length; i++) {
			models[i] = Model.tryGet(this.head[i]);
		}

		Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models.length, models);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}
}
