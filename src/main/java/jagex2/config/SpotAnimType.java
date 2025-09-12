package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("oc")
public class SpotAnimType {

	@ObfuscatedName("oc.a")
	public static int count;

	@ObfuscatedName("oc.b")
	public static SpotAnimType[] types;

	@ObfuscatedName("oc.c")
	public int id;

	@ObfuscatedName("oc.d")
	public int model;

	@ObfuscatedName("oc.e")
	public int anim = -1;

	@ObfuscatedName("oc.f")
	public SeqType seq;

	@ObfuscatedName("oc.g")
	public boolean animHasAlpha = false;

	@ObfuscatedName("oc.h")
	public int[] recol_s = new int[6];

	@ObfuscatedName("oc.i")
	public int[] recol_d = new int[6];

	@ObfuscatedName("oc.j")
	public int resizeh = 128;

	@ObfuscatedName("oc.k")
	public int resizev = 128;

	@ObfuscatedName("oc.l")
	public int angle;

	@ObfuscatedName("oc.m")
	public int ambient;

	@ObfuscatedName("oc.n")
	public int contrast;

	@ObfuscatedName("oc.o")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("oc.a(ILyb;)V")
	public static void unpack(Jagfile arg1) {
		Packet var2 = new Packet(arg1.read("spotanim.dat", null));
		count = var2.g2();
		if (types == null) {
			types = new SpotAnimType[count];
		}
		for (int var4 = 0; var4 < count; var4++) {
			if (types[var4] == null) {
				types[var4] = new SpotAnimType();
			}
			types[var4].id = var4;
			types[var4].decode(var2);
		}
	}

	@ObfuscatedName("oc.a(ZLmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.model = arg1.g2();
			} else if (var4 == 2) {
				this.anim = arg1.g2();
				if (SeqType.types != null) {
					this.seq = SeqType.types[this.anim];
				}
			} else if (var4 == 3) {
				this.animHasAlpha = true;
			} else if (var4 == 4) {
				this.resizeh = arg1.g2();
			} else if (var4 == 5) {
				this.resizev = arg1.g2();
			} else if (var4 == 6) {
				this.angle = arg1.g2();
			} else if (var4 == 7) {
				this.ambient = arg1.g1();
			} else if (var4 == 8) {
				this.contrast = arg1.g1();
			} else if (var4 >= 40 && var4 < 50) {
				this.recol_s[var4 - 40] = arg1.g2();
			} else if (var4 >= 50 && var4 < 60) {
				this.recol_d[var4 - 50] = arg1.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var4);
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public Model getModel() {
		Model var1 = (Model) modelCache.get((long) this.id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.tryGet(this.model);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.recol_s[0] != 0) {
				var2.recolour(this.recol_s[var3], this.recol_d[var3]);
			}
		}
		modelCache.put(var2, (long) this.id);
		return var2;
	}
}
