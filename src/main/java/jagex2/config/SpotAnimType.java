package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("oc")
public class SpotAnimType {

	@ObfuscatedName("oc.a")
	public boolean field1136 = true;

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
	public static LruCache field1151 = new LruCache(30, 1);

	@ObfuscatedName("oc.a(Lyb;B)V")
	public static void unpack(Jagfile arg0, byte arg1) {
		if (arg1 != 127) {
			return;
		}
		Packet var2 = new Packet((byte) -109, arg0.read("spotanim.dat", null));
		count = var2.g2();
		if (types == null) {
			types = new SpotAnimType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (types[var3] == null) {
				types[var3] = new SpotAnimType();
			}
			types[var3].id = var3;
			types[var3].decode(168, var2);
		}
	}

	@ObfuscatedName("oc.a(ILmb;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			this.field1136 = !this.field1136;
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.model = arg1.g2();
				} else if (var3 == 2) {
					this.anim = arg1.g2();
					if (SeqType.types != null) {
						this.seq = SeqType.types[this.anim];
					}
				} else if (var3 == 3) {
					this.animHasAlpha = true;
				} else if (var3 == 4) {
					this.resizeh = arg1.g2();
				} else if (var3 == 5) {
					this.resizev = arg1.g2();
				} else if (var3 == 6) {
					this.angle = arg1.g2();
				} else if (var3 == 7) {
					this.ambient = arg1.g1();
				} else if (var3 == 8) {
					this.contrast = arg1.g1();
				} else if (var3 >= 40 && var3 < 50) {
					this.recol_s[var3 - 40] = arg1.g2();
				} else if (var3 >= 50 && var3 < 60) {
					this.recol_d[var3 - 50] = arg1.g2();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var3);
				}
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public Model method386() {
		Model var1 = (Model) field1151.get((long) this.id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.tryGet(this.model, -404);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.recol_s[0] != 0) {
				var2.recolour(this.recol_s[var3], this.recol_d[var3]);
			}
		}
		field1151.put(var2, (long) this.id, 39399);
		return var2;
	}
}
