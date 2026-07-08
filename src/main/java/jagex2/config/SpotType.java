package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public final class SpotType {

	@ObfuscatedName("pc.p")
	public static LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("pc.e")
	public int id;

	@ObfuscatedName("pc.f")
	public int model;

	@ObfuscatedName("pc.g")
	public int anim = -1;

	@ObfuscatedName("pc.i")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("pc.j")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("pc.k")
	public int resizeh = 128;

	@ObfuscatedName("pc.l")
	public int resizev = 128;

	@ObfuscatedName("pc.m")
	public int angle;

	@ObfuscatedName("pc.n")
	public int ambient;

	@ObfuscatedName("pc.o")
	public int contrast;

	@ObfuscatedName("pc.d")
	public static SpotType[] list;

	@ObfuscatedName("pc.a")
	public final boolean field1170 = false;

	@ObfuscatedName("pc.b")
	public final byte field1171 = 4;

	@ObfuscatedName("pc.c")
	public static int numDefinitions;

	@ObfuscatedName("pc.h")
	public SeqType seq;

	@ObfuscatedName("pc.a(ZLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				model = arg0.g2();
			} else if (var2 == 2) {
				anim = arg0.g2();
				if (SeqType.list != null) {
					seq = SeqType.list[anim];
				}
			} else if (var2 == 4) {
				resizeh = arg0.g2();
			} else if (var2 == 5) {
				resizev = arg0.g2();
			} else if (var2 == 6) {
				angle = arg0.g2();
			} else if (var2 == 7) {
				ambient = arg0.g1();
			} else if (var2 == 8) {
				contrast = arg0.g1();
			} else if (var2 >= 40 && var2 < 50) {
				recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				recol_d[var2 - 50] = arg0.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("pc.a()Leb;")
	public Model getTempModel2() {
		Model var1 = (Model) modelCache.find((long) id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.load(model, field1171);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (recol_s[0] != 0) {
				var2.recolour(recol_s[var3], recol_d[var3]);
			}
		}
		modelCache.put((long) id, var2);
		return var2;
	}

	@ObfuscatedName("pc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("spotanim.dat", null), 15787);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new SpotType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new SpotType();
			}
			list[var2].id = var2;
			list[var2].decode(var1);
		}
	}
}
