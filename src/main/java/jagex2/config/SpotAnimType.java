package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.dash3d.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("oc")
public class SpotAnimType {

	@ObfuscatedName("oc.b")
	public static int count;

	@ObfuscatedName("oc.c")
	public static SpotAnimType[] types;

	@ObfuscatedName("oc.d")
	public int id;

	@ObfuscatedName("oc.e")
	public int model;

	@ObfuscatedName("oc.f")
	public int anim = -1;

	@ObfuscatedName("oc.g")
	public SeqType seq;

	@ObfuscatedName("oc.h")
	public boolean animHasAlpha = false;

	@ObfuscatedName("oc.i")
	public int[] recol_s = new int[6];

	@ObfuscatedName("oc.j")
	public int[] recol_d = new int[6];

	@ObfuscatedName("oc.k")
	public int resizeh = 128;

	@ObfuscatedName("oc.l")
	public int resizev = 128;

	@ObfuscatedName("oc.m")
	public int angle;

	@ObfuscatedName("oc.n")
	public int ambient;

	@ObfuscatedName("oc.o")
	public int contrast;

	@ObfuscatedName("oc.p")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("oc.a(Lyb;B)V")
	public static void unpack(Jagfile config) {
		Packet var2 = new Packet(config.read("spotanim.dat", null));
		count = var2.g2();

		if (types == null) {
			types = new SpotAnimType[count];
		}

		for (int i = 0; i < count; i++) {
			if (types[i] == null) {
				types[i] = new SpotAnimType();
			}

			types[i].id = i;
			types[i].decode(var2);
		}
	}

	@ObfuscatedName("oc.a(ILmb;)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				this.model = buf.g2();
			} else if (code == 2) {
				this.anim = buf.g2();

				if (SeqType.types != null) {
					this.seq = SeqType.types[this.anim];
				}
			} else if (code == 3) {
				this.animHasAlpha = true;
			} else if (code == 4) {
				this.resizeh = buf.g2();
			} else if (code == 5) {
				this.resizev = buf.g2();
			} else if (code == 6) {
				this.angle = buf.g2();
			} else if (code == 7) {
				this.ambient = buf.g1();
			} else if (code == 8) {
				this.contrast = buf.g1();
			} else if (code >= 40 && code < 50) {
				this.recol_s[code - 40] = buf.g2();
			} else if (code >= 50 && code < 60) {
				this.recol_d[code - 50] = buf.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + code);
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public Model getModel() {
		Model model = (Model) modelCache.get(this.id);
		if (model != null) {
			return model;
		}

		model = Model.tryGet(this.model);
		if (model == null) {
			return null;
		}

		for (int i = 0; i < 6; i++) {
			if (this.recol_s[0] != 0) {
				model.recolour(this.recol_s[i], this.recol_d[i]);
			}
		}

		modelCache.put(model, this.id);
		return model;
	}
}
