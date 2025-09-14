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
	public static void unpack(Jagfile jag) {
		data = new Packet(jag.read("npc.dat", null));
		Packet index = new Packet(jag.read("npc.idx", null));

		count = index.g2();
		idx = new int[count];

		int pos = 2;
		for (int id = 0; id < count; id++) {
			idx[id] = pos;
			pos += index.g2();
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
			if (cache[i].id == (long) id) {
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

	@ObfuscatedName("gc.a(ZLmb;)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				break;
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
				this.runanim = buf.g2();
			} else if (code == 14) {
				this.walkanim = buf.g2();
			} else if (code == 16) {
				this.animHasAlpha = true;
			} else if (code == 17) {
				this.walkanim = buf.g2();
				this.walkanim_b = buf.g2();
				this.walkanim_l = buf.g2();
				this.walkanim_r = buf.g2();
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
				for (int var9 = 0; var9 < count; var9++) {
					this.head[var9] = buf.g2();
				}
			} else if (code == 90) {
				this.field1010 = buf.g2();
			} else if (code == 91) {
				this.field1011 = buf.g2();
			} else if (code == 92) {
				this.field1012 = buf.g2();
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

	@ObfuscatedName("gc.a(IB[II)Lfb;")
	public Model getModel(int primaryFrame, int[] walkmerge, int secondaryFrame) {
		Model model = (Model) modelCache.get(this.id);

		if (model == null) {
			boolean notReady = false;
			for (int i = 0; i < this.models.length; i++) {
				if (!Model.request(this.models[i])) {
					notReady = true;
				}
			}
			if (notReady) {
				return null;
			}

			Model[] models = new Model[this.models.length];
			for (int i = 0; i < this.models.length; i++) {
				models[i] = Model.tryGet(this.models[i]);
			}

			if (models.length == 1) {
				model = models[0];
			} else {
				model = new Model(models, models.length);
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
		tmp.set(model, !this.animHasAlpha);

		if (primaryFrame != -1 && secondaryFrame != -1) {
			tmp.applyFrames(walkmerge, secondaryFrame, primaryFrame);
		} else if (primaryFrame != -1) {
			tmp.applyFrame(primaryFrame);
		}

		if (this.resizeh != 128 || this.resizev != 128) {
			tmp.resize(this.resizeh, this.resizeh, this.resizev);
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
	public Model getHeadModel() {
		if (this.head == null) {
			return null;
		}

		boolean notReady = false;
		for (int i = 0; i < this.head.length; i++) {
			if (!Model.request(this.head[i])) {
				notReady = true;
			}
		}
		if (notReady) {
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
			model = new Model(models, models.length);
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		return model;
	}
}
