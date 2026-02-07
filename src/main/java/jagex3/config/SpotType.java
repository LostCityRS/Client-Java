package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ta")
public final class SpotType extends Linkable2 {

	@ObfuscatedName("fe.R")
	public static Js5 configClient;

	@ObfuscatedName("we.A")
	public static Js5 models;

	@ObfuscatedName("nd.k")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ge.Wb")
	public static LruCache modelCache = new LruCache(30);

	@ObfuscatedName("ta.ob")
	public int id;

	@ObfuscatedName("ta.J")
	public int model;

	@ObfuscatedName("ta.Ob")
	public int anim = -1;

	@ObfuscatedName("ta.pb")
	public short[] recol_s;

	@ObfuscatedName("ta.Z")
	public short[] recol_d;

	@ObfuscatedName("ta.Ub")
	public short[] retex_s;

	@ObfuscatedName("ta.Wb")
	public short[] retex_d;

	@ObfuscatedName("ta.sb")
	public int resizev = 128;

	@ObfuscatedName("ta.xb")
	public int resizeh = 128;

	@ObfuscatedName("ta.db")
	public int angle = 0;

	@ObfuscatedName("ta.ib")
	public int contrast = 0;

	@ObfuscatedName("ta.rb")
	public int ambient = 0;

	@ObfuscatedName("ab.a(BLea;Lea;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		configClient = arg1;
		models = arg0;
	}

	@ObfuscatedName("fb.b(II)Lta;")
	public static SpotType list(int arg0) {
		SpotType var1 = (SpotType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(13, arg0);
		SpotType var3 = new SpotType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ta.a(ILjd;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("ta.a(ZILjd;)V")
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
		} else if (arg0 == 40) {
			int var5 = arg1.g1();
			this.recol_s = new short[var5];
			this.recol_d = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_s[var6] = (short) arg1.g2();
				this.recol_d[var6] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.g1();
			this.retex_d = new short[var3];
			this.retex_s = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.retex_s[var4] = (short) arg1.g2();
				this.retex_d[var4] = (short) arg1.g2();
			}
		}
	}

	@ObfuscatedName("ta.c(II)Lod;")
	public ModelLit getTempModel2(int arg0) {
		ModelLit var2 = (ModelLit) modelCache.find((long) this.id);
		if (var2 == null) {
			ModelUnlit var3 = ModelUnlit.load(models, this.model);
			if (var3 == null) {
				return null;
			}
			if (this.recol_s != null) {
				for (int var4 = 0; var4 < this.recol_s.length; var4++) {
					var3.recolour(this.recol_s[var4], this.recol_d[var4]);
				}
			}
			if (this.retex_s != null) {
				for (int var5 = 0; var5 < this.retex_s.length; var5++) {
					var3.retexture(this.retex_s[var5], this.retex_d[var5]);
				}
			}
			var2 = var3.light(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			modelCache.put((long) this.id, var2);
		}
		ModelLit var6;
		if (this.anim == -1 || arg0 == -1) {
			var6 = var2.copyForAnim2(true);
		} else {
			var6 = SeqType.list(this.anim).animateModel2(var2, arg0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var6.resize(this.resizeh, this.resizev, this.resizeh);
		}
		if (this.angle != 0) {
			if (this.angle == 90) {
				var6.rotate90();
			}
			if (this.angle == 180) {
				var6.rotate90();
				var6.rotate90();
			}
			if (this.angle == 270) {
				var6.rotate90();
				var6.rotate90();
				var6.rotate90();
			}
		}
		return var6;
	}

	@ObfuscatedName("oe.a(I)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
	}
}
