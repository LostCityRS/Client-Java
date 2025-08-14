package jagex2.config;

import deob.*;
import jagex2.datastruct.LruCache;
import jagex2.dash3d.Model;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("ec")
public class LocType {

	@ObfuscatedName("ec.f")
	public static boolean ignoreCache;

	@ObfuscatedName("ec.g")
	public static int count;

	@ObfuscatedName("ec.h")
	public static int[] idx;

	@ObfuscatedName("ec.i")
	public static Packet data;

	@ObfuscatedName("ec.j")
	public static LocType[] cache;

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
	public static LruCache modelCacheStatic = new LruCache(500);

	@ObfuscatedName("ec.T")
	public static LruCache modelCacheDynamic = new LruCache(30);

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
	public static final void unpack(Jagfile config) {
		data = new Packet(config.read("loc.dat", null));
		Packet temp = new Packet(config.read("loc.idx", null));

		count = temp.g2();
		idx = new int[count];

		int pos = 2;
		for (int i = 0; i < count; i++) {
			idx[i] = pos;
			pos += temp.g2();
		}

		cache = new LocType[10];
		for (int i = 0; i < 10; i++) {
			cache[i] = new LocType();
		}
	}

	@ObfuscatedName("ec.a(B)V")
	public static final void unload() {
		modelCacheStatic = null;
		modelCacheDynamic = null;
		idx = null;
		cache = null;
		data = null;
	}

	@ObfuscatedName("ec.a(I)Lec;")
	public static final LocType get(int id) {
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
	public final void decode(Packet buf) {
		int active = -1;
		while (true) {
			int code = buf.g1();
			if (code == 0) {
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
						return;
					}
				}

				return;
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
			}
		}
	}

	@ObfuscatedName("ec.a(II)Z")
	public final boolean checkModel(int shape) {
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
		return model == -1 ? true : Model.request(model & 0xFFFF);
	}

	@ObfuscatedName("ec.b(I)Z")
	public final boolean checkModelAll() {
		boolean ready = true;
		if (this.models == null) {
			return true;
		}

		for (int i = 0; i < this.models.length; i++) {
			int model = this.models[i];
			if (model != -1) {
				ready &= Model.request(model & 0xFFFF);
			}
		}

		return ready;
	}

	@ObfuscatedName("ec.a(ILvb;)V")
	public final void prefetch(OnDemand od) {
		if (this.models == null) {
			return;
		}

		for (int i = 0; i < this.models.length; i++) {
			int model = this.models[i];
			if (model != -1) {
				od.prefetch(0, model & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIII)Lfb;")
	public final Model getModel(int shape, int angle, int heightmapSW, int heightmapSE, int heightmapNE, int heightmapNW, int transformId) {
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

		long key = ((long) (transformId + 1) << 32) + ((long) this.id << 6) + ((long) index << 3) + angle;
		if (ignoreCache) {
			key = 0L;
		}

		Model model = (Model) modelCacheDynamic.get(key);
		if (model != null) {
			if (ignoreCache) {
				return model;
			}

			if (this.hillskew || this.sharelight) {
				model = new Model(this.sharelight, this.hillskew, model);
			}

			if (this.hillskew) {
				int groundY = (heightmapSW + heightmapSE + heightmapNE + heightmapNW) / 4;

				for (int i = 0; i < model.vertexCount; i++) {
					int x = model.vertexX[i];
					int z = model.vertexZ[i];

					int heightS = (heightmapSE - heightmapSW) * (x + 64) / 128 + heightmapSW;
					int heightN = (heightmapNE - heightmapNW) * (x + 64) / 128 + heightmapNW;
					int y = (heightN - heightS) * (z + 64) / 128 + heightS;

					model.vertexY[i] += y - groundY;
				}

				model.calculateBoundsY();
			}

			return model;
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

		model = (Model) modelCacheStatic.get(modelId);
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

		boolean scaled;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			scaled = false;
		} else {
			scaled = true;
		}

		boolean translated;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			translated = false;
		} else {
			translated = true;
		}

		Model modified = new Model(model, this.recol_s == null, angle == 0 && transformId == -1 && !scaled && !translated, !this.animHasAlpha);
		if (transformId != -1) {
			modified.createLabelReferences();
			modified.applyTransform(transformId);
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

		if (scaled) {
			modified.scale(this.resizey, this.resizez, this.resizex);
		}

		if (translated) {
			modified.translate(this.offsety, this.offsetx, this.offsetz);
		}

		modified.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);

		if (this.blockwalk) {
			modified.objRaise = modified.minY;
		}

		modelCacheDynamic.put(modified, key);

		if (this.hillskew || this.sharelight) {
			modified = new Model(this.sharelight, this.hillskew, modified);
		}

		if (this.hillskew) {
			int groundY = (heightmapSW + heightmapSE + heightmapNE + heightmapNW) / 4;

			for (int i = 0; i < modified.vertexCount; i++) {
				int x = modified.vertexX[i];
				int z = modified.vertexZ[i];

				int heightS = (heightmapSE - heightmapSW) * (x + 64) / 128 + heightmapSW;
				int heightN = (heightmapNE - heightmapNW) * (x + 64) / 128 + heightmapNW;
				int y = (heightN - heightS) * (z + 64) / 128 + heightS;

				modified.vertexY[i] += y - groundY;
			}

			modified.calculateBoundsY();
		}

		return modified;
	}
}
