package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSource;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("hd")
public final class LocType extends Linkable2 {

	@ObfuscatedName("fa.D")
	public static boolean lowMem = false;

	@ObfuscatedName("ve.c")
	public static Js5 configClient;

	@ObfuscatedName("ra.c")
	public static Js5 models;

	@ObfuscatedName("ga.ab")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("qd.Cb")
	public static LruCache mc1 = new LruCache(500);

	@ObfuscatedName("ed.j")
	public static LruCache mc2 = new LruCache(30);

	@ObfuscatedName("te.m")
	public static LruCache mc3 = new LruCache(30);

	@ObfuscatedName("te.n")
	public static ModelUnlit[] temp = new ModelUnlit[4];

	@ObfuscatedName("hd.mb")
	public int id;

	@ObfuscatedName("hd.Ib")
	public int[] model;

	@ObfuscatedName("hd.P")
	public int[] shape;

	@ObfuscatedName("qd.hb")
	public static JagString AUTO_NAME = JagString.wrap("null");
	@ObfuscatedName("hd.eb")
	public JagString name = AUTO_NAME;

	@ObfuscatedName("hd.U")
	public short[] recol_s;

	@ObfuscatedName("hd.ac")
	public short[] recol_d;

	@ObfuscatedName("hd.cb")
	public short[] retex_s;

	@ObfuscatedName("hd.N")
	public short[] retex_d;

	@ObfuscatedName("hd.nb")
	public int width = 1;

	@ObfuscatedName("hd.yb")
	public int length = 1;

	@ObfuscatedName("hd.Ab")
	public int blockwalk = 2;

	@ObfuscatedName("hd.kb")
	public boolean blockrange = true;

	@ObfuscatedName("hd.J")
	public int active = -1;

	@ObfuscatedName("hd.Lb")
	public int skewType = -1;

	@ObfuscatedName("hd.K")
	public boolean sharelight = false;

	@ObfuscatedName("hd.bb")
	public boolean occlude = false;

	@ObfuscatedName("hd.qb")
	public int anim = -1;

	@ObfuscatedName("hd.Kb")
	public int wallwidth = 16;

	@ObfuscatedName("hd.wb")
	public int ambient = 0;

	@ObfuscatedName("hd.Hb")
	public int contrast = 0;

	@ObfuscatedName("hd.Ub")
	public final JagString[] op = new JagString[5];

	@ObfuscatedName("hd.ab")
	public int mapfunction = -1;

	@ObfuscatedName("hd.rb")
	public int mapscene = -1;

	@ObfuscatedName("hd.Wb")
	public boolean mirror = false;

	@ObfuscatedName("hd.Sb")
	public boolean shadow = true;

	@ObfuscatedName("hd.hb")
	public int resizex = 128;

	@ObfuscatedName("hd.Db")
	public int resizey = 128;

	@ObfuscatedName("hd.bc")
	public int resizez = 128;

	@ObfuscatedName("hd.W")
	public int offsetx = 0;

	@ObfuscatedName("hd.ob")
	public int offsety = 0;

	@ObfuscatedName("hd.xb")
	public int offsetz = 0;

	@ObfuscatedName("hd.I")
	public int forceapproach = 0;

	@ObfuscatedName("hd.V")
	public boolean forcedecor = false;

	@ObfuscatedName("hd.O")
	public boolean breakroutefinding = false;

	@ObfuscatedName("hd.Rb")
	public int raiseobject = -1;

	@ObfuscatedName("hd.Qb")
	public int[] multiloc;

	@ObfuscatedName("hd.Tb")
	public int multivarbit = -1;

	@ObfuscatedName("hd.Bb")
	public int multivarp = -1;

	@ObfuscatedName("hd.Vb")
	public int bgsound_sound = -1;

	@ObfuscatedName("hd.Fb")
	public int bgsound_range = 0;

	@ObfuscatedName("hd.Yb")
	public int bgsound_mindelay = 0;

	@ObfuscatedName("hd.Pb")
	public int bgsound_maxdelay = 0;

	@ObfuscatedName("hd.jb")
	public int[] bgsound_random;

	@ObfuscatedName("ke.a(Lea;IZLea;)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		configClient = arg2;
		lowMem = arg1;
		models = arg0;
	}

	@ObfuscatedName("ad.a(II)Lhd;")
	public static LocType list(int arg0) {
		LocType var1 = (LocType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(6, arg0);
		LocType var3 = new LocType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (var3.breakroutefinding) {
			var3.blockrange = false;
			var3.blockwalk = 0;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("hd.f(I)V")
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
			this.raiseobject = this.blockwalk == 0 ? 0 : 1;
		}
	}

	@ObfuscatedName("hd.a(Ljd;Z)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("hd.a(BLjd;I)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			if (var3 > 0) {
				if (this.model != null && !lowMem) {
					arg0.pos += var3 * 3;
					return;
				}
				this.model = new int[var3];
				this.shape = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.model[var4] = arg0.g2();
					this.shape[var4] = arg0.g1();
				}
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 5) {
			int var13 = arg0.g1();
			if (var13 > 0) {
				if (this.model != null && !lowMem) {
					arg0.pos += var13 * 2;
					return;
				}
				this.shape = null;
				this.model = new int[var13];
				for (int var14 = 0; var14 < var13; var14++) {
					this.model[var14] = arg0.g2();
				}
			}
		} else if (arg1 == 14) {
			this.width = arg0.g1();
		} else if (arg1 == 15) {
			this.length = arg0.g1();
		} else if (arg1 == 17) {
			this.blockrange = false;
			this.blockwalk = 0;
		} else if (arg1 == 18) {
			this.blockrange = false;
		} else if (arg1 == 19) {
			this.active = arg0.g1();
		} else if (arg1 == 21) {
			this.skewType = 0;
		} else if (arg1 == 22) {
			this.sharelight = true;
		} else if (arg1 == 23) {
			this.occlude = true;
		} else if (arg1 == 24) {
			this.anim = arg0.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
		} else if (arg1 == 27) {
			this.blockwalk = 1;
		} else if (arg1 == 28) {
			this.wallwidth = arg0.g1();
		} else if (arg1 == 29) {
			this.ambient = arg0.g1b();
		} else if (arg1 == 39) {
			this.contrast = arg0.g1b() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.op[arg1 - 30] = arg0.gjstr();
			if (this.op[arg1 - 30].equalsIgnoreCase(Text.HIDDEN)) {
				this.op[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var11 = arg0.g1();
			this.recol_s = new short[var11];
			this.recol_d = new short[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				this.recol_s[var12] = (short) arg0.g2();
				this.recol_d[var12] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.g1();
			this.retex_d = new short[var5];
			this.retex_s = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.retex_s[var6] = (short) arg0.g2();
				this.retex_d[var6] = (short) arg0.g2();
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
			int var7 = arg0.g1();
			this.multiloc = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.multiloc[var8] = arg0.g2();
				if (this.multiloc[var8] == 65535) {
					this.multiloc[var8] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.bgsound_sound = arg0.g2();
			this.bgsound_range = arg0.g1();
		} else if (arg1 == 79) {
			this.bgsound_mindelay = arg0.g2();
			this.bgsound_maxdelay = arg0.g2();
			this.bgsound_range = arg0.g1();
			int var9 = arg0.g1();
			this.bgsound_random = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.bgsound_random[var10] = arg0.g2();
			}
		} else if (arg1 == 81) {
			this.skewType = arg0.g1() * 256;
		}
	}

	@ObfuscatedName("hd.b(II)Z")
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

	@ObfuscatedName("hd.e(I)Z")
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

	@ObfuscatedName("hd.a(ZIII[[III)Ldd;")
	public ModelSource getModel(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
		long var7;
		if (this.shape == null) {
			var7 = arg2 + (this.id << 10);
		} else {
			var7 = (this.id << 10) + (arg5 << 3) + arg2;
		}
		ModelSource var9 = (ModelSource) mc2.find(var7);
		if (var9 == null) {
			ModelUnlit var10 = this.buildModel(arg2, arg5);
			if (var10 == null) {
				return null;
			}
			if (this.sharelight) {
				var9 = var10;
				var10.contrast = (short) (this.contrast * 5 + 768);
				var10.ambient = (short) (this.ambient + 64);
				var10.calculateNormals();
			} else {
				var9 = var10.light(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			}
			mc2.put(var7, var9);
		}
		if (this.sharelight) {
			var9 = ((ModelUnlit) var9).copyForShareLight();
		}
		if (this.skewType >= 0) {
			if (var9 instanceof ModelLit) {
				var9 = ((ModelLit) var9).hillSkew(arg3, arg4, arg1, arg0, true, this.skewType);
			} else if (var9 instanceof ModelUnlit) {
				var9 = ((ModelUnlit) var9).hillSkew(arg3, arg4, arg1, arg0, this.skewType);
			}
		}
		return var9;
	}

	@ObfuscatedName("hd.a(IIII[[III)Lod;")
	public ModelLit getModelLit(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
		long var7;
		if (this.shape == null) {
			var7 = arg4 + (this.id << 10);
		} else {
			var7 = arg4 + (arg1 << 3) + (this.id << 10);
		}
		ModelLit var9 = (ModelLit) mc3.find(var7);
		if (var9 == null) {
			ModelUnlit var10 = this.buildModel(arg4, arg1);
			if (var10 == null) {
				return null;
			}
			var9 = var10.light(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			mc3.put(var7, var9);
		}
		if (this.skewType >= 0) {
			var9 = var9.hillSkew(arg3, arg0, arg5, arg2, true, this.skewType);
		}
		return var9;
	}

	@ObfuscatedName("hd.a(ZLvc;II[[IIIII)Lod;")
	public ModelLit getTempModel(SeqType arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6, int arg7) {
		long var9;
		if (this.shape == null) {
			var9 = (this.id << 10) + arg7;
		} else {
			var9 = (arg2 << 3) + (this.id << 10) + arg7;
		}
		ModelLit var11 = (ModelLit) mc3.find(var9);
		if (var11 == null) {
			ModelUnlit var12 = this.buildModel(arg7, arg2);
			if (var12 == null) {
				return null;
			}
			var11 = var12.light(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			mc3.put(var9, var11);
		}
		if (arg0 == null && this.skewType == -1) {
			return var11;
		}
		ModelLit var13;
		if (arg0 == null) {
			var13 = var11.copyForAnim(true);
		} else {
			var13 = arg0.animateModel90(arg7, arg5, var11);
		}
		if (this.skewType >= 0) {
			var13 = var13.hillSkew(arg3, arg4, arg6, arg1, false, this.skewType);
		}
		return var13;
	}

	@ObfuscatedName("hd.a(IZI)Lp;")
	public ModelUnlit buildModel(int arg0, int arg1) {
		ModelUnlit var3 = null;
		if (this.shape == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.model == null) {
				return null;
			}
			boolean var8 = this.mirror;
			if (arg1 == 2 && arg0 > 3) {
				var8 = !var8;
			}
			int var9 = this.model.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = this.model[var10];
				if (var8) {
					var11 += 65536;
				}
				var3 = (ModelUnlit) mc1.find((long) var11);
				if (var3 == null) {
					var3 = ModelUnlit.load(models, var11 & 0xFFFF);
					if (var3 == null) {
						return null;
					}
					if (var8) {
						var3.mirror();
					}
					mc1.put((long) var11, var3);
				}
				if (var9 > 1) {
					temp[var10] = var3;
				}
			}
			if (var9 > 1) {
				var3 = new ModelUnlit(temp, var9);
			}
		} else {
			int var4 = -1;
			for (int var5 = 0; var5 < this.shape.length; var5++) {
				if (this.shape[var5] == arg1) {
					var4 = var5;
					break;
				}
			}
			if (var4 == -1) {
				return null;
			}
			int var6 = this.model[var4];
			boolean var7 = arg0 > 3 ^ this.mirror;
			if (var7) {
				var6 += 65536;
			}
			var3 = (ModelUnlit) mc1.find((long) var6);
			if (var3 == null) {
				var3 = ModelUnlit.load(models, var6 & 0xFFFF);
				if (var3 == null) {
					return null;
				}
				if (var7) {
					var3.mirror();
				}
				mc1.put((long) var6, var3);
			}
		}
		boolean var12;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var12 = false;
		} else {
			var12 = true;
		}
		boolean var13;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var13 = false;
		} else {
			var13 = true;
		}
		ModelUnlit var14 = new ModelUnlit(var3, arg0 == 0 && !var12 && !var13, this.recol_s == null, this.retex_s == null, true);
		if (arg1 == 4 && arg0 > 3) {
			var14.rotateXAxis();
			var14.translate(45, 0, -45);
		}
		int var15 = arg0 & 0x3;
		if (var15 == 1) {
			var14.rotate90();
		} else if (var15 == 2) {
			var14.rotate180();
		} else if (var15 == 3) {
			var14.rotate270();
		}
		if (this.recol_s != null) {
			for (int var16 = 0; var16 < this.recol_s.length; var16++) {
				var14.recolour(this.recol_s[var16], this.recol_d[var16]);
			}
		}
		if (this.retex_s != null) {
			for (int var17 = 0; var17 < this.retex_s.length; var17++) {
				var14.retexture(this.retex_s[var17], this.retex_d[var17]);
			}
		}
		if (var12) {
			var14.resize(this.resizex, this.resizey, this.resizez);
		}
		if (var13) {
			var14.translate(this.offsetx, this.offsety, this.offsetz);
		}
		return var14;
	}

	@ObfuscatedName("hd.d(B)Lhd;")
	public LocType getMultiLoc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		return var1 < 0 || var1 >= this.multiloc.length || this.multiloc[var1] == -1 ? null : list(this.multiloc[var1]);
	}

	@ObfuscatedName("ge.v(I)V")
	public static void resetCache() {
		recentUse.clear();
		mc1.clear();
		mc2.clear();
		mc3.clear();
	}

	@ObfuscatedName("hd.a(B)Z")
	public boolean hasBgSound() {
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
}
