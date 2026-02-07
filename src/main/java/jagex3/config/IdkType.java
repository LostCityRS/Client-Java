package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("jc")
public final class IdkType extends Linkable2 {

	@ObfuscatedName("be.G")
	public static Js5 configClient;

	@ObfuscatedName("c.Db")
	public static Js5 models;

	@ObfuscatedName("na.g")
	public static int numDefinitions;

	@ObfuscatedName("fa.B")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("jc.bb")
	public int type = -1;

	@ObfuscatedName("jc.W")
	public int[] model;

	@ObfuscatedName("jc.cb")
	public short[] recol_s;

	@ObfuscatedName("jc.I")
	public short[] recol_d;

	@ObfuscatedName("jc.P")
	public short[] retex_s;

	@ObfuscatedName("jc.eb")
	public short[] retex_d;

	@ObfuscatedName("jc.H")
	public final int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("jc.Q")
	public boolean disable = false;

	@ObfuscatedName("u.a(Lea;BLea;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		configClient = arg1;
		models = arg0;
		numDefinitions = configClient.getFileIdLimit(3);
	}

	@ObfuscatedName("tb.a(BI)Ljc;")
	public static IdkType list(int arg0) {
		IdkType var1 = (IdkType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(3, arg0);
		IdkType var3 = new IdkType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("jc.a(BLjd;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("jc.a(ILjd;B)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.type = arg1.g1();
		} else if (arg0 == 2) {
			int var3 = arg1.g1();
			this.model = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.model[var4] = arg1.g2();
			}
		} else if (arg0 == 3) {
			this.disable = true;
		} else if (arg0 == 40) {
			int var7 = arg1.g1();
			this.recol_s = new short[var7];
			this.recol_d = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.recol_d[var8] = (short) arg1.g2();
				this.recol_s[var8] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var5 = arg1.g1();
			this.retex_s = new short[var5];
			this.retex_d = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.retex_d[var6] = (short) arg1.g2();
				this.retex_s[var6] = (short) arg1.g2();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.head[arg0 - 60] = arg1.g2();
		}
	}

	@ObfuscatedName("jc.e(I)Z")
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

	@ObfuscatedName("jc.b(B)Lp;")
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
		if (this.recol_d != null) {
			for (int var4 = 0; var4 < this.recol_d.length; var4++) {
				var3.recolour(this.recol_d[var4], this.recol_s[var4]);
			}
		}
		if (this.retex_d != null) {
			for (int var5 = 0; var5 < this.retex_d.length; var5++) {
				var3.retexture(this.retex_d[var5], this.retex_s[var5]);
			}
		}
		return var3;
	}

	@ObfuscatedName("jc.a(B)Z")
	public boolean checkHead() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (this.head[var2] != -1 && !models.requestDownload(this.head[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("jc.g(I)Lp;")
	public ModelUnlit getHeadNoCheck() {
		ModelUnlit[] var1 = new ModelUnlit[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.head[var3] != -1) {
				var1[var2++] = ModelUnlit.load(models, this.head[var3]);
			}
		}
		ModelUnlit var4 = new ModelUnlit(var1, var2);
		if (this.recol_d != null) {
			for (int var5 = 0; var5 < this.recol_d.length; var5++) {
				var4.recolour(this.recol_d[var5], this.recol_s[var5]);
			}
		}
		if (this.retex_d != null) {
			for (int var6 = 0; var6 < this.retex_d.length; var6++) {
				var4.retexture(this.retex_d[var6], this.retex_s[var6]);
			}
		}
		return var4;
	}

	@ObfuscatedName("gf.a(Z)V")
	public static void resetCache() {
		recentUse.clear();
	}
}
