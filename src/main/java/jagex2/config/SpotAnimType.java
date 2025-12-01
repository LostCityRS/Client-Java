package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class SpotAnimType {

	@ObfuscatedName("pc.a")
	public static int count;

	@ObfuscatedName("pc.b")
	public static SpotAnimType[] list;

	@ObfuscatedName("pc.c")
	public int id;

	@ObfuscatedName("pc.d")
	public int model;

	@ObfuscatedName("pc.e")
	public int anim = -1;

	@ObfuscatedName("pc.f")
	public SeqType seq;

	@ObfuscatedName("pc.g")
	public int[] recol_s = new int[6];

	@ObfuscatedName("pc.h")
	public int[] recol_d = new int[6];

	@ObfuscatedName("pc.i")
	public int resizeh = 128;

	@ObfuscatedName("pc.j")
	public int resizev = 128;

	@ObfuscatedName("pc.k")
	public int angle;

	@ObfuscatedName("pc.l")
	public int ambient;

	@ObfuscatedName("pc.m")
	public int contrast;

	@ObfuscatedName("pc.n")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("pc.a(ZLyb;)V")
	public static void unpack(JagFile arg1) {
		Packet var3 = new Packet(arg1.read("spotanim.dat", null));
		count = var3.g2();
		if (list == null) {
			list = new SpotAnimType[count];
		}
		for (int var4 = 0; var4 < count; var4++) {
			if (list[var4] == null) {
				list[var4] = new SpotAnimType();
			}
			list[var4].id = var4;
			list[var4].decode(var3);
		}
	}

	@ObfuscatedName("pc.a(ILmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			if (var3 == 1) {
				this.model = arg1.g2();
			} else if (var3 == 2) {
				this.anim = arg1.g2();
				if (SeqType.list != null) {
					this.seq = SeqType.list[this.anim];
				}
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

	@ObfuscatedName("pc.a()Lfb;")
	public Model getTempModel() {
		Model var1 = (Model) modelCache.get((long) this.id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.load(this.model);
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
