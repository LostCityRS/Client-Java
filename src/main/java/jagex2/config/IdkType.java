package jagex2.config;

import jagex2.io.Jagfile;
import jagex2.graphics.Model;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public class IdkType {

	@ObfuscatedName("lc.a")
	public static boolean field1098 = true;

	@ObfuscatedName("lc.b")
	public int field1099 = -949;

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
	public int[] heads = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean disable = false;

	@ObfuscatedName("lc.a(Lyb;B)V")
	public static void unpack(Jagfile arg0, byte arg1) {
		if (arg1 != 127) {
			field1098 = !field1098;
		}
		Packet var2 = new Packet((byte) -109, arg0.read("idk.dat", null));
		count = var2.g2();
		if (types == null) {
			types = new IdkType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (types[var3] == null) {
				types[var3] = new IdkType();
			}
			types[var3].decode(168, var2);
		}
	}

	@ObfuscatedName("lc.a(ILmb;)V")
	public void decode(int arg0, Packet arg1) {
		int var3 = 22 / arg0;
		while (true) {
			while (true) {
				int var4 = arg1.g1();
				if (var4 == 0) {
					return;
				}
				if (var4 == 1) {
					this.type = arg1.g1();
				} else if (var4 == 2) {
					int var5 = arg1.g1();
					this.models = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.models[var6] = arg1.g2();
					}
				} else if (var4 == 3) {
					this.disable = true;
				} else if (var4 >= 40 && var4 < 50) {
					this.recol_s[var4 - 40] = arg1.g2();
				} else if (var4 >= 50 && var4 < 60) {
					this.recol_d[var4 - 50] = arg1.g2();
				} else if (var4 >= 60 && var4 < 70) {
					this.heads[var4 - 60] = arg1.g2();
				} else {
					System.out.println("Error unrecognised config code: " + var4);
				}
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method377(int arg0) {
		if (arg0 != 6) {
			throw new NullPointerException();
		} else if (this.models == null) {
			return true;
		} else {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.models.length; var3++) {
				if (!Model.method139(this.models[var3])) {
					var2 = false;
				}
			}
			return var2;
		}
	}

	@ObfuscatedName("lc.b(I)Lfb;")
	public Model method378(int arg0) {
		if (this.models == null) {
			return null;
		}
		Model[] var2 = new Model[this.models.length];
		if (arg0 <= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		for (int var4 = 0; var4 < this.models.length; var4++) {
			var2[var4] = Model.method138(this.models[var4], -404);
		}
		Model var5;
		if (var2.length == 1) {
			var5 = var2[0];
		} else {
			var5 = new Model(var2.length, 652, var2);
		}
		for (int var6 = 0; var6 < 6 && this.recol_s[var6] != 0; var6++) {
			var5.recolour(this.recol_s[var6], this.recol_d[var6]);
		}
		return var5;
	}

	@ObfuscatedName("lc.c(I)Z")
	public boolean method379(int arg0) {
		boolean var2 = true;
		if (arg0 < 8 || arg0 > 8) {
			this.field1099 = 223;
		}
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.heads[var3] != -1 && !Model.method139(this.heads[var3])) {
				var2 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("lc.d(I)Lfb;")
	public Model method380(int arg0) {
		Model[] var2 = new Model[5];
		int var3 = 0;
		for (int var4 = 0; var4 < 5; var4++) {
			if (this.heads[var4] != -1) {
				var2[var3++] = Model.method138(this.heads[var4], -404);
			}
		}
		Model var5 = new Model(var3, 652, var2);
		if (arg0 >= 0) {
			this.field1099 = -459;
		}
		for (int var6 = 0; var6 < 6 && this.recol_s[var6] != 0; var6++) {
			var5.recolour(this.recol_s[var6], this.recol_d[var6]);
		}
		return var5;
	}
}
