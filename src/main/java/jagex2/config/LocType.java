package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public class LocType {

	@ObfuscatedName("ec.e")
	public static boolean ignoreCache;

	@ObfuscatedName("ec.f")
	public static int count;

	@ObfuscatedName("ec.g")
	public static int[] idx;

	@ObfuscatedName("ec.h")
	public static Packet data;

	@ObfuscatedName("ec.i")
	public static LocType[] cache;

	@ObfuscatedName("ec.j")
	public static int cachePos;

	@ObfuscatedName("ec.k")
	public int id = -1;

	@ObfuscatedName("ec.l")
	public int[] models;

	@ObfuscatedName("ec.m")
	public int[] shapes;

	@ObfuscatedName("ec.n")
	public String name;

	@ObfuscatedName("ec.o")
	public byte[] desc;

	@ObfuscatedName("ec.p")
	public int[] recol_s;

	@ObfuscatedName("ec.q")
	public int[] recol_d;

	@ObfuscatedName("ec.r")
	public int width;

	@ObfuscatedName("ec.s")
	public int length;

	@ObfuscatedName("ec.t")
	public boolean blockwalk;

	@ObfuscatedName("ec.u")
	public boolean blockrange;

	@ObfuscatedName("ec.v")
	public boolean active;

	@ObfuscatedName("ec.w")
	public boolean hillskew;

	@ObfuscatedName("ec.x")
	public boolean sharelight;

	@ObfuscatedName("ec.y")
	public boolean occlude;

	@ObfuscatedName("ec.z")
	public int anim;

	@ObfuscatedName("ec.S")
	public static LruCache modelCacheStatic = new LruCache(500);

	@ObfuscatedName("ec.T")
	public static LruCache modelCacheDynamic = new LruCache(30);

	@ObfuscatedName("ec.B")
	public byte ambient;

	@ObfuscatedName("ec.C")
	public byte contrast;

	@ObfuscatedName("ec.A")
	public int wallwidth;

	@ObfuscatedName("ec.F")
	public int mapfunction;

	@ObfuscatedName("ec.G")
	public int mapscene;

	@ObfuscatedName("ec.J")
	public int resizex;

	@ObfuscatedName("ec.K")
	public int resizey;

	@ObfuscatedName("ec.L")
	public int resizez;

	@ObfuscatedName("ec.M")
	public int offsetx;

	@ObfuscatedName("ec.N")
	public int offsety;

	@ObfuscatedName("ec.O")
	public int offsetz;

	@ObfuscatedName("ec.P")
	public int forceapproach;

	@ObfuscatedName("ec.E")
	public boolean animHasAlpha;

	@ObfuscatedName("ec.H")
	public boolean mirror;

	@ObfuscatedName("ec.I")
	public boolean shadow;

	@ObfuscatedName("ec.Q")
	public boolean forcedecor;

	@ObfuscatedName("ec.R")
	public boolean breakroutefinding;

	@ObfuscatedName("ec.D")
	public String[] op;

	@ObfuscatedName("ec.a(Lyb;)V")
	public static void unpack(Jagfile jag) {
		data = new Packet(jag.read("loc.dat", null));
		Packet index = new Packet(jag.read("loc.idx", null));

		count = index.g2();
		idx = new int[count];

		int pos = 2;
		for (int id = 0; id < count; id++) {
			idx[id] = pos;
			pos += index.g2();
		}

		cache = new LocType[10];
		for (int i = 0; i < 10; i++) {
			cache[i] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static void unload() {
		modelCacheStatic = null;
		modelCacheDynamic = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static LocType get(int id) {
		for (int i = 0; i < 10; i++) {
			if (cache[i].id == id) {
				return cache[i];
			}
		}

		cachePos = (cachePos + 1) % 10;

		LocType loc = cache[cachePos];
		data.pos = idx[id];
		loc.id = id;
		loc.reset();
		loc.decode(data);
		return loc;
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
		this.breakroutefinding = false;
	}

	@ObfuscatedName("ec.a(ZLmb;)V")
	public void decode(Packet buf) {
		int active = -1;

		while (true) {
			int code = buf.g1();
			if (code == 0) {
				break;
			}

			if (code == 1) {
				int count = buf.g1();

				this.shapes = new int[count];
				this.models = new int[count];
				for (int i = 0; i < count; i++) {
					this.models[i] = buf.g2();
					this.shapes[i] = buf.g1();
				}
			} else if (code == 2) {
				this.name = buf.gjstr();
			} else if (code == 3) {
				this.desc = buf.gjstrraw();
			} else if (code == 14) {
				this.width = buf.g1();
			} else if (code == 15) {
				this.length = buf.g1();
			} else if (code == 17) {
				this.blockwalk = false;
			} else if (code == 18) {
				this.blockrange = false;
			} else if (code == 19) {
				active = buf.g1();
				if (active == 1) {
					this.active = true;
				}
			} else if (code == 21) {
				this.hillskew = true;
			} else if (code == 22) {
				this.sharelight = true;
			} else if (code == 23) {
				this.occlude = true;
			} else if (code == 24) {
				this.anim = buf.g2();
				if (this.anim == 65535) {
					this.anim = -1;
				}
			} else if (code == 25) {
				this.animHasAlpha = true;
			} else if (code == 28) {
				this.wallwidth = buf.g1();
			} else if (code == 29) {
				this.ambient = buf.g1b();
			} else if (code == 39) {
				this.contrast = buf.g1b();
			} else if (code >= 30 && code < 39) {
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
				this.mapfunction = buf.g2();
			} else if (code == 62) {
				this.mirror = true;
			} else if (code == 64) {
				this.shadow = false;
			} else if (code == 65) {
				this.resizex = buf.g2();
			} else if (code == 66) {
				this.resizey = buf.g2();
			} else if (code == 67) {
				this.resizez = buf.g2();
			} else if (code == 68) {
				this.mapscene = buf.g2();
			} else if (code == 69) {
				this.forceapproach = buf.g1();
			} else if (code == 70) {
				this.offsetx = buf.g2b();
			} else if (code == 71) {
				this.offsety = buf.g2b();
			} else if (code == 72) {
				this.offsetz = buf.g2b();
			} else if (code == 73) {
				this.forcedecor = true;
			} else if (code == 74) {
				this.breakroutefinding = true;
			}
		}

		if (this.shapes == null) {
			this.shapes = new int[0];
		}

		if (active == -1) {
			this.active = false;

			if (this.shapes.length > 0 && this.shapes[0] == 10) {
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
	}

	@ObfuscatedName("ec.a(IB)Z")
	public boolean checkModel(int shape) {
		int index = -1;
		for (int i = 0; i < this.shapes.length; i++) {
			if (this.shapes[i] == shape) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return true;
		}

		if (this.models == null) {
			return true;
		}

		int model = this.models[index];
		if (model == -1) {
			return true;
		}

		return Model.request(model & 0xFFFF);
	}

	@ObfuscatedName("ec.b(B)Z")
	public boolean checkModelAll() {
		if (this.models == null) {
			return true;
		}

		boolean ready = true;
		for (int i = 0; i < this.models.length; i++) {
			int model = this.models[i];
			if (model != -1) {
				ready &= Model.request(model & 0xFFFF);
			}
		}
		return ready;
	}

	@ObfuscatedName("ec.a(Lvb;I)V")
	public void prefetch(OnDemand od) {
		if (this.models == null) {
			return;
		}

		for (int i = 0; i < this.models.length; i++) {
			int model = this.models[i];
			if (model != -1) {
				od.prefetch(model & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public Model getModel(int shape, int angle, int heightSW, int heightSE, int heightNE, int heightNW, int frame) {
		int index = -1;
		for (int i = 0; i < this.shapes.length; i++) {
			if (this.shapes[i] == shape) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return null;
		}

		long key = (((long) this.id << 6) + ((long) index << 3) + angle) + ((long) (frame + 1) << 32);
		if (ignoreCache) {
			key = 0L;
		}

		Model cached = (Model) modelCacheDynamic.get(key);
		if (cached != null) {
			if (ignoreCache) {
				return cached;
			}

			if (this.hillskew || this.sharelight) {
				cached = new Model(this.hillskew, this.sharelight, cached);
			}

			if (this.hillskew) {
				int groundY = (heightSW + heightSE + heightNE + heightNW) / 4;
				for (int v = 0; v < cached.vertexCount; v++) {
					int x = cached.vertexX[v];
					int z = cached.vertexZ[v];

					int heightS = heightSW + (heightSE - heightSW) * (x + 64) / 128;
					int heightN = heightNW + (heightNE - heightNW) * (x + 64) / 128;
					int y = heightS + (heightN - heightS) * (z + 64) / 128;

					cached.vertexY[v] += y - groundY;
				}

				cached.calculateBoundsY();
			}

			return cached;
		}

		if (this.models == null || index >= this.models.length) {
			return null;
		}

		int modelId = this.models[index];
		if (modelId == -1) {
			return null;
		}

		boolean flip = this.mirror ^ angle > 3;
		if (flip) {
			modelId += 65536;
		}

		Model model = (Model) modelCacheStatic.get(modelId);
		if (model == null) {
			model = Model.tryGet(modelId & 0xFFFF);
			if (model == null) {
				return null;
			}

			if (flip) {
				model.rotateY180();
			}

			modelCacheStatic.put(model, modelId);
		}

		boolean resize;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			resize = false;
		} else {
			resize = true;
		}

		boolean offset;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			offset = false;
		} else {
			offset = true;
		}

		Model modified = new Model(this.recol_s == null, model, angle == 0 && frame == -1 && !resize && !offset, !this.animHasAlpha);
		if (frame != -1) {
			modified.createLabelReferences();
			modified.applyFrame(frame);
			modified.labelFaces = null;
			modified.labelVertices = null;
		}

		while (angle-- > 0) {
			modified.rotateY90();
		}

		if (this.recol_s != null) {
			for (int i = 0; i < this.recol_s.length; i++) {
				modified.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		if (resize) {
			modified.resize(this.resizex, this.resizez, this.resizey);
		}

		if (offset) {
			modified.offset(this.offsetx, this.offsetz, this.offsety);
		}

		modified.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);

		if (this.blockwalk) {
			modified.objRaise = modified.minY;
		}

		modelCacheDynamic.put(modified, key);

		if (this.hillskew || this.sharelight) {
			modified = new Model(this.hillskew, this.sharelight, modified);
		}

		if (this.hillskew) {
			int groundY = (heightSW + heightSE + heightNE + heightNW) / 4;

			for (int v = 0; v < modified.vertexCount; v++) {
				int x = modified.vertexX[v];
				int z = modified.vertexZ[v];

				int heightS = heightSW + (heightSE - heightSW) * (x + 64) / 128;
				int heightN = heightNW + (heightNE - heightNW) * (x + 64) / 128;
				int y = heightS + (heightN - heightS) * (z + 64) / 128;

				modified.vertexY[v] += y - groundY;
			}

			modified.calculateBoundsY();
		}

		return modified;
	}
}
