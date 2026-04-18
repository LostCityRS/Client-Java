package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ec")
public final class SpotType extends Linkable2 {

	@ObfuscatedName("ob.a")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("g.v")
	public static Js5 configClient;
	@ObfuscatedName("mb.Z")
	public static LruCache modelCache = new LruCache(30);
	@ObfuscatedName("md.Mb")
	public static Js5 models;
	@ObfuscatedName("ec.Fb")
	public int contrast = 0;

	@ObfuscatedName("ec.Kb")
	public int ambient = 0;

	@ObfuscatedName("ec.Pb")
	public int resizeh = 128;

	@ObfuscatedName("ec.xb")
	public int anim = -1;

	@ObfuscatedName("ec.Tb")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("ec.Sb")
	public int angle = 0;

	@ObfuscatedName("ec.Xb")
	public int resizev = 128;

	@ObfuscatedName("ec.Wb")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("ec.Db")
	public int model;

	@ObfuscatedName("ec.Ub")
	public int id;

	@ObfuscatedName("n.a(II)Lec;")
	public static SpotType list(int arg0) {
		SpotType var1 = (SpotType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 13);
		SpotType var3 = new SpotType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("s.a(ILbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		models = arg0;
		configClient = arg1;
	}

	@ObfuscatedName("uc.e(I)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
	}

	@ObfuscatedName("ec.a(IBLba;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.model = arg1.g2();
		} else if (arg0 == 2) {
			this.anim = arg1.g2();
		} else if (arg0 == 4) {
			this.resizeh = arg1.g2();
		} else if (arg0 == 5) {
			this.resizev = arg1.g2();
		} else if (arg0 == 6) {
			this.angle = arg1.g2();
		} else if (arg0 == 7) {
			this.ambient = arg1.g1();
		} else if (arg0 == 8) {
			this.contrast = arg1.g1();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.recol_s[arg0 - 40] = arg1.g2();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.recol_d[arg0 - 50] = arg1.g2();
		}
	}

	@ObfuscatedName("ec.a(II)Lpa;")
	public Model getTempModel2(int arg0) {
		Model var2 = (Model) modelCache.find((long) this.id);
		if (var2 == null) {
			var2 = Model.load(models, this.model);
			if (var2 == null) {
				return null;
			}
			for (int var3 = 0; var3 < 6; var3++) {
				if (this.recol_s[0] != 0) {
					var2.recolour(this.recol_s[var3], this.recol_d[var3]);
				}
			}
			var2.prepareAnim();
			var2.light(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
			modelCache.put((long) this.id, var2);
		}
		Model var4;
		if (this.anim == -1 || arg0 == -1) {
			var4 = var2.copyForAnim2(true);
		} else {
			var4 = SeqType.list(this.anim).animateModel2(var2, arg0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var4.resize(this.resizeh, this.resizev, this.resizeh);
		}
		if (this.angle != 0) {
			if (this.angle == 90) {
				var4.rotate90();
			}
			if (this.angle == 180) {
				var4.rotate90();
				var4.rotate90();
			}
			if (this.angle == 270) {
				var4.rotate90();
				var4.rotate90();
				var4.rotate90();
			}
		}
		return var4;
	}

	@ObfuscatedName("ec.a(Lba;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}
}
