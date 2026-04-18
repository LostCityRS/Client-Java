package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("pe")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("kc.s")
	public static Js5 models;
	@ObfuscatedName("qc.i")
	public static Js5 configClient;
	@ObfuscatedName("fe.Qc")
	public static int numDefinitions;
	@ObfuscatedName("wc.a")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("pe.tb")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("pe.Gb")
	public int type = -1;

	@ObfuscatedName("pe.Nb")
	public boolean disable = false;

	@ObfuscatedName("pe.Rb")
	public final int[] head = new int[]{-1, -1, -1, -1, -1};

	@ObfuscatedName("pe.Bb")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("pe.Hb")
	public int[] model;

	@ObfuscatedName("se.a(ILbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		models = arg1;
		configClient = arg0;
		numDefinitions = configClient.getFileIdLimit(3);
	}

	@ObfuscatedName("ba.a(BI)Lpe;")
	public static IdkType list(int arg0) {
		IdkType var1 = (IdkType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 3);
		IdkType var3 = new IdkType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("qd.b(B)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("pe.a(BLba;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("pe.b(Z)Z")
	public boolean checkModel() {
		if (this.model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.model.length; var2++) {
			if (!models.requestDownload(this.model[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("pe.c(Z)Z")
	public boolean checkHead() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.head[var2] != -1 && !models.requestDownload(this.head[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("pe.a(Lba;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.type = arg0.g1();
		} else if (arg1 == 2) {
			int var3 = arg0.g1();
			this.model = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.model[var4] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.disable = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.recol_s[arg1 - 40] = arg0.g2();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.recol_d[arg1 - 50] = arg0.g2();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.head[arg1 - 60] = arg0.g2();
		}
	}

	@ObfuscatedName("pe.b(B)Lpa;")
	public Model getHeadNoCheck() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.head[var3] != -1) {
				var1[var2++] = Model.load(models, this.head[var3]);
			}
		}
		Model var4 = new Model(var1, var2);
		for (int var5 = 0; var5 < 6 && this.recol_s[var5] != 0; var5++) {
			var4.recolour(this.recol_s[var5], this.recol_d[var5]);
		}
		return var4;
	}

	@ObfuscatedName("pe.d(Z)Lpa;")
	public Model getModelNoCheck() {
		if (this.model == null) {
			return null;
		}
		Model[] var1 = new Model[this.model.length];
		for (int var2 = 0; var2 < this.model.length; var2++) {
			var1[var2] = Model.load(models, this.model[var2]);
		}
		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1, var1.length);
		}
		for (int var4 = 0; var4 < 6 && this.recol_s[var4] != 0; var4++) {
			var3.recolour(this.recol_s[var4], this.recol_d[var4]);
		}
		return var3;
	}
}
