package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vb")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("ti.w")
	public static final LruCache recentUse = new LruCache(64);

	@ObfuscatedName("li.M")
	public static Js5 configClient;
	@ObfuscatedName("di.bb")
	public static Js5 models;
	@ObfuscatedName("c.I")
	public static int numDefinitions;

	@ObfuscatedName("vb.T")
	public boolean disable = false;

	@ObfuscatedName("vb.V")
	public final int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("vb.X")
	public int type = -1;

	@ObfuscatedName("vb.G")
	public int[] model;

	@ObfuscatedName("vb.D")
	public short[] recol_s;

	@ObfuscatedName("vb.J")
	public short[] recol_d;

	@ObfuscatedName("vb.M")
	public short[] retex_s;

	@ObfuscatedName("vb.S")
	public short[] retex_d;

	@ObfuscatedName("je.a(II)Lvb;")
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

	@ObfuscatedName("wi.d(B)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("sc.a(BLnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		models = arg0;
		configClient = arg1;
		numDefinitions = configClient.getFileIdLimit(3);
	}

	@ObfuscatedName("vb.d(I)Lhe;")
	public ModelUnlit getModelNoCheck() {
		if (this.model == null) {
			return null;
		}
		ModelUnlit[] var1 = new ModelUnlit[this.model.length];
		for (int var2 = 0; var2 < this.model.length; var2++) {
			var1[var2] = ModelUnlit.load(models, this.model[var2]);
		}
		ModelUnlit var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new ModelUnlit(var1, var1.length);
		}
		if (this.retex_d != null) {
			for (int var4 = 0; var4 < this.retex_d.length; var4++) {
				var3.recolour(this.retex_d[var4], this.recol_d[var4]);
			}
		}
		if (this.retex_s != null) {
			for (int var5 = 0; var5 < this.retex_s.length; var5++) {
				var3.retexture(this.retex_s[var5], this.recol_s[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("vb.a(Lea;ZI)V")
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
		} else if (arg1 == 40) {
			int var7 = arg0.g1();
			this.recol_d = new short[var7];
			this.retex_d = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.retex_d[var8] = (short) arg0.g2();
				this.recol_d[var8] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.g1();
			this.recol_s = new short[var5];
			this.retex_s = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.retex_s[var6] = (short) arg0.g2();
				this.recol_s[var6] = (short) arg0.g2();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.head[arg1 - 60] = arg0.g2();
			return;
		}
	}

	@ObfuscatedName("vb.b(Z)Lhe;")
	public ModelUnlit getHeadNoCheck() {
		int var1 = 0;
		ModelUnlit[] var2 = new ModelUnlit[5];
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.head[var3] != -1) {
				var2[var1++] = ModelUnlit.load(models, this.head[var3]);
			}
		}
		ModelUnlit var4 = new ModelUnlit(var2, var1);
		if (this.retex_d != null) {
			for (int var5 = 0; var5 < this.retex_d.length; var5++) {
				var4.recolour(this.retex_d[var5], this.recol_d[var5]);
			}
		}
		if (this.retex_s != null) {
			for (int var6 = 0; var6 < this.retex_s.length; var6++) {
				var4.retexture(this.retex_s[var6], this.recol_s[var6]);
			}
		}
		return var4;
	}

	@ObfuscatedName("vb.d(B)Z")
	public boolean checkModel() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.head[var2] != -1 && !models.requestDownload(this.head[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("vb.a(ILea;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("vb.e(B)Z")
	public boolean checkHead() {
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
}
