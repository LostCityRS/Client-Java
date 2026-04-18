package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.constants.Text;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("ia")
public final class LocType extends Linkable2 {

	@ObfuscatedName("dc.yb")
	public static Js5 configClient;
	@ObfuscatedName("mc.p")
	public static boolean lowMem = false;
	@ObfuscatedName("a.Y")
	public static Js5 models;
	@ObfuscatedName("se.p")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("pc.q")
	public static LruCache mc1 = new LruCache(500);
	@ObfuscatedName("qc.d")
	public static LruCache mc3 = new LruCache(30);
	@ObfuscatedName("rb.Cb")
	public static Model[] temp = new Model[4];
	@ObfuscatedName("g.d")
	public static LruCache mc2 = new LruCache(10);
	@ObfuscatedName("ia.bc")
	public int raiseobject = -1;

	@ObfuscatedName("ia.cc")
	public int[] multiloc;

	@ObfuscatedName("ia.ec")
	public int multivarp = -1;

	@ObfuscatedName("ia.fc")
	public int mapscene = -1;

	@ObfuscatedName("ia.ic")
	public int resizey = 128;

	@ObfuscatedName("ia.jc")
	public boolean shadow = true;

	@ObfuscatedName("ia.kc")
	public int bgsound_maxdelay = 0;

	@ObfuscatedName("ia.mc")
	public int contrast = 0;

	@ObfuscatedName("ia.oc")
	public int active = -1;

	@ObfuscatedName("ia.pc")
	public boolean forcedecor = false;

	@ObfuscatedName("ia.qc")
	public int multivarbit = -1;

	@ObfuscatedName("ia.rc")
	public JagString name = Statics.field2183;

	@ObfuscatedName("ia.tb")
	public int bgsound_mindelay = 0;

	@ObfuscatedName("ia.ub")
	public int offsetx = 0;

	@ObfuscatedName("ia.vb")
	public boolean blockwalk = true;

	@ObfuscatedName("ia.vc")
	public boolean mirror = false;

	@ObfuscatedName("ia.wb")
	public int bgsound_range = 0;

	@ObfuscatedName("ia.Fb")
	public int mapfunction = -1;

	@ObfuscatedName("ia.Gb")
	public int forceapproach = 0;

	@ObfuscatedName("ia.Hb")
	public int bgsound_sound = -1;

	@ObfuscatedName("ia.Bb")
	public int resizex = 128;

	@ObfuscatedName("ia.Mb")
	public boolean breakroutefinding = false;

	@ObfuscatedName("ia.Pb")
	public boolean occlude = false;

	@ObfuscatedName("ia.Yb")
	public boolean hillskew = false;

	@ObfuscatedName("ia.Ab")
	public int anim = -1;

	@ObfuscatedName("ia.zb")
	public int wallwidth = 16;

	@ObfuscatedName("ia.Cb")
	public final JagString[] op = new JagString[5];

	@ObfuscatedName("ia.Nb")
	public int offsety = 0;

	@ObfuscatedName("ia.Jb")
	public int length = 1;

	@ObfuscatedName("ia.yb")
	public int offsetz = 0;

	@ObfuscatedName("ia.Ob")
	public boolean sharelight = false;

	@ObfuscatedName("ia.Wb")
	public boolean blockrange = true;

	@ObfuscatedName("ia.xb")
	public int width = 1;

	@ObfuscatedName("ia.Vb")
	public int ambient = 0;

	@ObfuscatedName("ia.Lb")
	public int resizez = 128;

	@ObfuscatedName("ia.gc")
	public int id;

	@ObfuscatedName("ia.Eb")
	public int[] recol_d;

	@ObfuscatedName("ia.Kb")
	public int[] recol_s;

	@ObfuscatedName("ia.Qb")
	public int[] shape;

	@ObfuscatedName("ia.Rb")
	public int[] bgsound_random;

	@ObfuscatedName("ia.Tb")
	public int[] model;

	@ObfuscatedName("se.a(ILbd;ZLbd;)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		configClient = arg2;
		lowMem = arg1;
		models = arg0;
	}

	@ObfuscatedName("fa.b(IB)Lia;")
	public static LocType list(int arg0) {
		LocType var1 = (LocType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 6);
		LocType var3 = new LocType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (var3.breakroutefinding) {
			var3.blockwalk = false;
			var3.blockrange = false;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("qd.c(B)V")
	public static void resetCache() {
		recentUse.clear();
		mc1.clear();
		mc2.clear();
		mc3.clear();
	}

	@ObfuscatedName("ia.a(IIIIIBI)Lpa;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7;
		if (this.shape == null) {
			var7 = (this.id << 10) + arg2;
		} else {
			var7 = (this.id << 10) + (arg4 << 3) + arg2;
		}
		Model var9 = (Model) mc2.find(var7);
		if (var9 == null) {
			var9 = this.buildModel(!this.sharelight, false, arg2, arg4);
			if (var9 == null) {
				return null;
			}
			mc2.put(var7, var9);
		}
		if (this.hillskew || this.sharelight) {
			var9 = new Model(var9, this.hillskew, this.sharelight);
		}
		if (this.hillskew) {
			int var10 = (arg0 + arg5 + arg1 + arg3) / 4;
			for (int var11 = 0; var11 < var9.numPoints; var11++) {
				int var12 = var9.pointZ[var11];
				int var13 = var9.pointX[var11];
				int var14 = arg3 + (arg5 - arg3) * (var12 + 64) / 128;
				int var15 = arg1 + (arg0 - arg1) * (var12 + 64) / 128;
				int var16 = (var13 + 64) * (var15 - var14) / 128 + var14;
				var9.pointY[var11] += var16 - var10;
			}
		}
		return var9;
	}

	@ObfuscatedName("ia.b(B)Z")
	public boolean method506() {
		if (this.multiloc == null) {
			return this.bgsound_sound != -1 || this.bgsound_random != null;
		}
		for (int var1 = 0; var1 < this.multiloc.length; var1++) {
			if (this.multiloc[var1] != -1) {
				LocType var2 = list(this.multiloc[var1]);
				if (var2.bgsound_sound != -1 || var2.bgsound_random != null) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ia.a(Lba;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("ia.c(Z)V")
	public void postDecode() {
		if (this.active == -1) {
			this.active = 0;
			if (this.model != null && (this.shape == null || this.shape[0] == 10)) {
				this.active = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.op[var1] != null) {
					this.active = 1;
				}
			}
		}
		if (this.raiseobject == -1) {
			this.raiseobject = this.blockwalk ? 1 : 0;
		}
	}

	@ObfuscatedName("ia.a(ZBZII)Lpa;")
	public Model buildModel(boolean arg0, boolean arg1, int arg2, int arg3) {
		Model var5 = null;
		if (this.shape == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.model == null) {
				return null;
			}
			boolean var6 = arg2 > 3 ^ this.mirror;
			int var7 = this.model.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = this.model[var8];
				if (var6) {
					var9 += 65536;
				}
				var5 = (Model) mc1.find((long) var9);
				if (var5 == null) {
					var5 = Model.load(models, var9 & 0xFFFF);
					if (var5 == null) {
						return null;
					}
					if (var6) {
						var5.mirror();
					}
					mc1.put((long) var9, var5);
				}
				if (var7 > 1) {
					temp[var8] = var5;
				}
			}
			if (var7 > 1) {
				var5 = new Model(temp, var7);
			}
		} else {
			int var10 = -1;
			for (int var11 = 0; var11 < this.shape.length; var11++) {
				if (this.shape[var11] == arg3) {
					var10 = var11;
					break;
				}
			}
			if (var10 == -1) {
				return null;
			}
			int var12 = this.model[var10];
			boolean var13 = this.mirror ^ arg2 > 3;
			if (var13) {
				var12 += 65536;
			}
			var5 = (Model) mc1.find((long) var12);
			if (var5 == null) {
				var5 = Model.load(models, var12 & 0xFFFF);
				if (var5 == null) {
					return null;
				}
				if (var13) {
					var5.mirror();
				}
				mc1.put((long) var12, var5);
			}
		}
		boolean var14;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var14 = false;
		} else {
			var14 = true;
		}
		boolean var15;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var15 = false;
		} else {
			var15 = true;
		}
		Model var16 = new Model(var5, arg2 == 0 && !var14 && !var15, this.recol_s == null, true);
		int var17 = arg2 & 0x3;
		if (var17 == 1) {
			var16.rotate90();
		} else if (var17 == 2) {
			var16.rotate180();
		} else if (var17 == 3) {
			var16.rotate270();
		}
		if (this.recol_s != null) {
			for (int var18 = 0; var18 < this.recol_s.length; var18++) {
				var16.recolour(this.recol_s[var18], this.recol_d[var18]);
			}
		}
		if (var14) {
			var16.resize(this.resizex, this.resizey, this.resizez);
		}
		if (var15) {
			var16.translate(this.offsetx, this.offsety, this.offsetz);
		}
		if (arg1) {
			var16.prepareAnim();
		}
		var16.light(this.ambient + 64, 768 + (this.contrast * 5), -50, -10, -50, arg0);
		return var16;
	}

	@ObfuscatedName("ia.a(IIIIIILhe;II)Lpa;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, SeqType arg5, int arg6, int arg7) {
		long var9;
		if (this.shape == null) {
			var9 = (this.id << 10) + arg4;
		} else {
			var9 = (this.id << 10) + (arg3 << 3) + arg4;
		}
		Model var11 = (Model) mc3.find(var9);
		if (var11 == null) {
			var11 = this.buildModel(true, true, arg4, arg3);
			if (var11 == null) {
				return null;
			}
			mc3.put(var9, var11);
		}
		if (arg5 == null && !this.hillskew) {
			return var11;
		}
		Model var12;
		if (arg5 == null) {
			var12 = var11.copyForAnim(true);
		} else {
			var12 = arg5.animateModel90(arg2, var11, arg4);
		}
		if (this.hillskew) {
			int var13 = (arg0 + arg1 + arg6 + arg7) / 4;
			for (int var14 = 0; var14 < var12.numPoints; var14++) {
				int var15 = var12.pointX[var14];
				int var16 = var12.pointZ[var14];
				int var17 = (arg1 - arg0) * (var16 + 64) / 128 + arg0;
				int var18 = (arg7 - arg6) * (var16 + 64) / 128 + arg6;
				int var19 = (var15 + 64) * (-var17 + var18) / 128 + var17;
				var12.pointY[var14] += var19 - var13;
			}
		}
		return var12;
	}

	@ObfuscatedName("ia.a(Lba;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var11 = arg0.g1();
			if (var11 > 0) {
				if (this.model == null || lowMem) {
					this.shape = new int[var11];
					this.model = new int[var11];
					for (int var12 = 0; var12 < var11; var12++) {
						this.model[var12] = arg0.g2();
						this.shape[var12] = arg0.g1();
					}
				} else {
					arg0.pos += var11 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 5) {
			int var9 = arg0.g1();
			if (var9 > 0) {
				if (this.model == null || lowMem) {
					this.shape = null;
					this.model = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						this.model[var10] = arg0.g2();
					}
				} else {
					arg0.pos += var9 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.width = arg0.g1();
		} else if (arg1 == 15) {
			this.length = arg0.g1();
		} else if (arg1 == 17) {
			this.blockwalk = false;
		} else if (arg1 == 18) {
			this.blockrange = false;
		} else if (arg1 == 19) {
			this.active = arg0.g1();
		} else if (arg1 == 21) {
			this.hillskew = true;
		} else if (arg1 == 22) {
			this.sharelight = true;
		} else if (arg1 == 23) {
			this.occlude = true;
		} else if (arg1 == 24) {
			this.anim = arg0.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
		} else if (arg1 == 28) {
			this.wallwidth = arg0.g1();
		} else if (arg1 == 29) {
			this.ambient = arg0.g1b();
		} else if (arg1 == 39) {
			this.contrast = arg0.g1b() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.op[arg1 - 30] = arg0.gjstr();
			if (this.op[arg1 - 30].method14(Text.field2928)) {
				this.op[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var7 = arg0.g1();
			this.recol_s = new int[var7];
			this.recol_d = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.recol_s[var8] = arg0.g2();
				this.recol_d[var8] = arg0.g2();
			}
		} else if (arg1 == 60) {
			this.mapfunction = arg0.g2();
		} else if (arg1 == 62) {
			this.mirror = true;
		} else if (arg1 == 64) {
			this.shadow = false;
		} else if (arg1 == 65) {
			this.resizex = arg0.g2();
		} else if (arg1 == 66) {
			this.resizey = arg0.g2();
		} else if (arg1 == 67) {
			this.resizez = arg0.g2();
		} else if (arg1 == 68) {
			this.mapscene = arg0.g2();
		} else if (arg1 == 69) {
			this.forceapproach = arg0.g1();
		} else if (arg1 == 70) {
			this.offsetx = arg0.g2b();
		} else if (arg1 == 71) {
			this.offsety = arg0.g2b();
		} else if (arg1 == 72) {
			this.offsetz = arg0.g2b();
		} else if (arg1 == 73) {
			this.forcedecor = true;
		} else if (arg1 == 74) {
			this.breakroutefinding = true;
		} else if (arg1 == 75) {
			this.raiseobject = arg0.g1();
		} else if (arg1 == 77) {
			this.multivarbit = arg0.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg0.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int var5 = arg0.g1();
			this.multiloc = new int[var5 + 1];
			for (int var6 = 0; var6 <= var5; var6++) {
				this.multiloc[var6] = arg0.g2();
				if (this.multiloc[var6] == 65535) {
					this.multiloc[var6] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.bgsound_sound = arg0.g2();
			this.bgsound_range = arg0.g1();
		} else if (arg1 == 79) {
			this.bgsound_mindelay = arg0.g2();
			this.bgsound_maxdelay = arg0.g2();
			this.bgsound_range = arg0.g1();
			int var3 = arg0.g1();
			this.bgsound_random = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.bgsound_random[var4] = arg0.g2();
			}
		}
	}

	@ObfuscatedName("ia.a(II)Z")
	public boolean checkModel(int arg0) {
		if (this.shape != null) {
			for (int var2 = 0; var2 < this.shape.length; var2++) {
				if (this.shape[var2] == arg0) {
					return models.requestDownload(this.model[var2] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.model == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.model.length; var4++) {
				var3 &= models.requestDownload(this.model[var4] & 0xFFFF, 0);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ia.f(I)Lia;")
	public LocType getMultiLoc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		return var1 < 0 || this.multiloc.length <= var1 || this.multiloc[var1] == -1 ? null : list(this.multiloc[var1]);
	}

	@ObfuscatedName("ia.c(B)Z")
	public boolean checkModelAll() {
		if (this.model == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.model.length; var2++) {
			var1 &= models.requestDownload(this.model[var2] & 0xFFFF, 0);
		}
		return var1;
	}
}
