package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public class IdkType {

	@ObfuscatedName("lc.c")
	public static int count;

	@ObfuscatedName("lc.d")
	public static IdkType[] types;

	@ObfuscatedName("lc.e")
	public int type = -1;

	@ObfuscatedName("lc.f")
	public int[] models;

	@ObfuscatedName("lc.g")
	public int[] recol_s = new int[6];

	@ObfuscatedName("lc.h")
	public int[] recol_d = new int[6];

	@ObfuscatedName("lc.i")
	public int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean disable = false;

	@ObfuscatedName("lc.a(ILyb;)V")
	public static void unpack(Jagfile arg1) {
		Packet var2 = new Packet(arg1.read("idk.dat", null));
		count = var2.g2();
		if (types == null) {
			types = new IdkType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (types[var3] == null) {
				types[var3] = new IdkType();
			}
			types[var3].decode(var2);
		}
	}

	@ObfuscatedName("lc.a(ZLmb;)V")
	public void decode(Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			if (var3 == 1) {
				this.type = arg1.g1();
			} else if (var3 == 2) {
				int var4 = arg1.g1();
				this.models = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					this.models[var5] = arg1.g2();
				}
			} else if (var3 == 3) {
				this.disable = true;
			} else if (var3 >= 40 && var3 < 50) {
				this.recol_s[var3 - 40] = arg1.g2();
			} else if (var3 >= 50 && var3 < 60) {
				this.recol_d[var3 - 50] = arg1.g2();
			} else if (var3 >= 60 && var3 < 70) {
				this.head[var3 - 60] = arg1.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean checkModel() {
		if (this.models == null) {
			return true;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.models.length; var3++) {
			if (!Model.request(this.models[var3])) {
				var2 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("lc.a(Z)Lfb;")
	public Model getModel() {
		if (this.models == null) {
			return null;
		}
		Model[] var2 = new Model[this.models.length];
		for (int var3 = 0; var3 < this.models.length; var3++) {
			var2[var3] = Model.tryGet(this.models[var3]);
		}
		Model var4;
		if (var2.length == 1) {
			var4 = var2[0];
		} else {
			var4 = new Model(var2, var2.length);
		}
		for (int var5 = 0; var5 < 6 && this.recol_s[var5] != 0; var5++) {
			var4.recolour(this.recol_s[var5], this.recol_d[var5]);
		}
		return var4;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean checkHead() {
		boolean var2 = true;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.head[var3] != -1 && !Model.request(this.head[var3])) {
				var2 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("lc.a(B)Lfb;")
	public Model getHeadModel() {
		Model[] var2 = new Model[5];
		int var3 = 0;
		for (int var4 = 0; var4 < 5; var4++) {
			if (this.head[var4] != -1) {
				var2[var3++] = Model.tryGet(this.head[var4]);
			}
		}
		Model var5 = new Model(var2, var3);
		for (int var6 = 0; var6 < 6 && this.recol_s[var6] != 0; var6++) {
			var5.recolour(this.recol_s[var6], this.recol_d[var6]);
		}
		return var5;
	}
}
