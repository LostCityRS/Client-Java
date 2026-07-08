package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public final class IdkType {

	@ObfuscatedName("lc.e")
	public static int numDefinitions;

	@ObfuscatedName("lc.h")
	public int[] model;

	@ObfuscatedName("lc.i")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("lc.j")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("lc.k")
	public final int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.l")
	public boolean disable = false;

	@ObfuscatedName("lc.f")
	public static IdkType[] list;

	@ObfuscatedName("lc.a")
	public final boolean field1123 = false;

	@ObfuscatedName("lc.b")
	public final byte field1124 = 4;

	@ObfuscatedName("lc.c")
	public int field1125;

	@ObfuscatedName("lc.d")
	public static boolean field1126;

	@ObfuscatedName("lc.g")
	public int part = -1;

	@ObfuscatedName("lc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("idk.dat", null), 15787);
		numDefinitions = var1.g2();
		if (list == null) {
			list = new IdkType[numDefinitions];
		}
		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new IdkType();
			}
			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("lc.a(ZLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				part = arg0.g1();
			} else if (var2 == 2) {
				int var3 = arg0.g1();
				model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					model[var4] = arg0.g2();
				}
			} else if (var2 == 3) {
				disable = true;
			} else if (var2 >= 40 && var2 < 50) {
				recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				recol_d[var2 - 50] = arg0.g2();
			} else if (var2 >= 60 && var2 < 70) {
				head[var2 - 60] = arg0.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean checkModel() {
		if (model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < model.length; var2++) {
			if (!Model.requestDownload(model[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.b(I)Leb;")
	public Model getModelNoCheck() {
		if (model == null) {
			return null;
		}
		Model[] var1 = new Model[model.length];
		for (int var2 = 0; var2 < model.length; var2++) {
			var1[var2] = Model.load(model[var2], field1124);
		}
		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1, var1.length, -33019);
		}
		for (int var4 = 0; var4 < 6 && recol_s[var4] != 0; var4++) {
			var3.recolour(recol_s[var4], recol_d[var4]);
		}
		return var3;
	}

	@ObfuscatedName("lc.a(B)Z")
	public boolean checkHead() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (head[var2] != -1 && !Model.requestDownload(head[var2])) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("lc.b(B)Leb;")
	public Model getHeadNoCheck() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (head[var3] != -1) {
				var1[var2++] = Model.load(head[var3], field1124);
			}
		}
		Model var4 = new Model(var1, var2, -33019);
		for (int var5 = 0; var5 < 6 && recol_s[var5] != 0; var5++) {
			var4.recolour(recol_s[var5], recol_d[var5]);
		}
		return var4;
	}
}
