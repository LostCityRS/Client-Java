package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;
import jagex3.var.VarCache;

@ObfuscatedName("nf")
public final class LocType extends Linkable2 {

	@ObfuscatedName("qe.d")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("fd.S")
	public static final ModelSourceCache mc1 = new ModelSourceCache(500);
	@ObfuscatedName("eb.M")
	public static final ModelSourceCache mc2 = new ModelSourceCache(30);
	@ObfuscatedName("ra.R")
	public static final ModelCacheLit mc3 = new ModelCacheLit();
	@ObfuscatedName("fd.W")
	public static final ModelUnlit[] temp = new ModelUnlit[4];
	@ObfuscatedName("sd.p")
	public static Js5 clientConfig;
	@ObfuscatedName("hc.U")
	public static ModelSourceCache modelCacheDynamic;
	@ObfuscatedName("ma.U")
	public static boolean lowMem = false;
	@ObfuscatedName("bh.K")
	public static boolean membersWorld;
	@ObfuscatedName("qa.f")
	public static Js5 models;
	@ObfuscatedName("l.Z")
	public static short[] clientpalette = new short[256];
	@ObfuscatedName("nf.ab")
	public short[] recol_d;

	@ObfuscatedName("nf.cb")
	public int resizex = 128;

	@ObfuscatedName("nf.eb")
	public int length = 1;

	@ObfuscatedName("nf.fb")
	public int bgsound_maxdelay = 0;

	@ObfuscatedName("nf.gb")
	public int contrast = 0;

	@ObfuscatedName("nf.jb")
	public boolean field2799 = false;

	@ObfuscatedName("nf.mb")
	public int resizez = 128;

	@ObfuscatedName("nf.nb")
	public boolean breakroutefinding = false;

	@ObfuscatedName("nf.ob")
	public short[] recol_s;

	@ObfuscatedName("nf.pb")
	public int wallwidth = 16;

	@ObfuscatedName("nf.qb")
	public int bgsound_sound = -1;

	@ObfuscatedName("nf.rb")
	public int bgsound_mindelay = 0;

	@ObfuscatedName("nf.tb")
	public int ambient = 0;

	@ObfuscatedName("nf.ub")
	public int anim = -1;

	@ObfuscatedName("nf.vb")
	public int[] shape;

	@ObfuscatedName("nf.I")
	public boolean occlude = false;

	@ObfuscatedName("nf.Q")
	public int raiseobject = -1;

	@ObfuscatedName("nf.X")
	public short skewAmount = -1;

	@ObfuscatedName("nf.Y")
	public int offsety = 0;

	@ObfuscatedName("nf.K")
	public int width = 1;

	@ObfuscatedName("nf.D")
	public int multivarbit = -1;

	@ObfuscatedName("nf.R")
	public int forceapproach = 0;

	@ObfuscatedName("nf.Db")
	public int blockwalk = 2;

	@ObfuscatedName("nf.H")
	public int bgsound_range = 0;

	@ObfuscatedName("nf.Fb")
	public int resizey = 128;

	@ObfuscatedName("nf.Z")
	public boolean blockrange = true;

	@ObfuscatedName("nf.T")
	public boolean sharelight = false;

	@ObfuscatedName("nf.Ab")
	public JagString[] op = new JagString[5];

	@ObfuscatedName("nf.S")
	public boolean shadow = true;

	@ObfuscatedName("nf.xb")
	public byte skewType = 0;

	@ObfuscatedName("nf.Bb")
	public int mapfunction = -1;

	@ObfuscatedName("hb.S")
	public static final JagString NULL = JagString.wrap("null");
	@ObfuscatedName("nf.J")
	public JagString name = NULL;

	@ObfuscatedName("nf.Cb")
	public int multivarp = -1;

	@ObfuscatedName("nf.Nb")
	public boolean randomanimframe = true;

	@ObfuscatedName("nf.Ob")
	public int offsetx = 0;

	@ObfuscatedName("nf.Kb")
	public boolean forcedecor = false;

	@ObfuscatedName("nf.Rb")
	public int active = -1;

	@ObfuscatedName("nf.Qb")
	public int mapscene = -1;

	@ObfuscatedName("nf.Sb")
	public boolean members = false;

	@ObfuscatedName("nf.Tb")
	public int offsetz = 0;

	@ObfuscatedName("nf.W")
	public boolean mirror = false;

	@ObfuscatedName("nf.Pb")
	public int id;

	@ObfuscatedName("nf.N")
	public HashTable params;

	@ObfuscatedName("nf.Ib")
	public byte[] recol_d_palette;

	@ObfuscatedName("nf.G")
	public int[] multiloc;

	@ObfuscatedName("nf.P")
	public int[] model;

	@ObfuscatedName("nf.zb")
	public int[] bgsound_random;

	@ObfuscatedName("nf.M")
	public short[] retex_s;

	@ObfuscatedName("nf.yb")
	public short[] retex_d;

	@ObfuscatedName("re.a(II)Lnf;")
	public static LocType list(int arg0) {
		LocType var1 = (LocType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = clientConfig.getFile(getGroupId(arg0), getFileId(arg0));
		LocType var3 = new LocType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		if (!membersWorld && var3.members) {
			var3.op = null;
		}
		if (var3.breakroutefinding) {
			var3.blockwalk = 0;
			var3.blockrange = false;
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("h.c(I)V")
	public static void resetCache() {
		recentUse.clear();
		mc1.clear();
		modelCacheDynamic.clear();
		mc2.clear();
	}

	@ObfuscatedName("cd.a(Lnb;ILnb;ZZ)V")
	public static void init(Js5 arg0, Js5 arg1, boolean arg2, boolean arg3) {
		lowMem = arg3;
		membersWorld = arg2;
		clientConfig = arg0;
		models = arg1;
		modelCacheDynamic = new ModelSourceCache(30);
	}

	@ObfuscatedName("ri.b(II)I")
	public static int getGroupId(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("oh.a(ZI)I")
	public static int getFileId(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("nf.d(I)Z")
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

	@ObfuscatedName("nf.a(BI)Z")
	public boolean checkModel(int arg0) {
		if (this.shape != null) {
			for (int var4 = 0; var4 < this.shape.length; var4++) {
				if (arg0 == this.shape[var4]) {
					return models.requestDownload(this.model[var4] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.model == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.model.length; var3++) {
				var2 &= models.requestDownload(this.model[var3] & 0xFFFF, 0);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nf.f(I)Z")
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

	@ObfuscatedName("nf.a(BII)I")
	public int getParamInt(int arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			IntNode var3 = (IntNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.field3698;
		}
	}

	@ObfuscatedName("nf.a(I[[I[[IIZIIII)Ltc;")
	public ModelCacheLit getModel(int arg0, int[][] arg1, int[][] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
		long var9;
		if (this.shape == null) {
			var9 = arg6 + (this.id << 10);
		} else {
			var9 = arg6 + (this.id << 10) + (arg0 << 3);
		}
		boolean var11;
		if (arg4 && this.sharelight) {
			var11 = true;
			var9 |= Long.MIN_VALUE;
		} else {
			var11 = false;
		}
		ModelSource var12 = modelCacheDynamic.find(var9);
		if (var12 == null) {
			ModelUnlit var13 = this.buildModel(arg6, arg0);
			if (var13 == null) {
				mc3.field3984 = null;
				return mc3;
			}
			var13.method563();
			if (var11) {
				var12 = var13;
				var13.contrast = (short) (this.contrast * 5 + 768);
				var13.ambient = (short) (this.ambient + 64);
				var13.calculateNormals();
			} else {
				var12 = new SoftwareModelLit(var13, this.ambient + 64, 768 - -(this.contrast * 5), -50, -10, -50);
			}
			modelCacheDynamic.put(var9, var12);
		}
		if (var11) {
			var12 = ((ModelUnlit) var12).copyForShareLight();
		}
		if (this.skewType != 0) {
			if (var12 instanceof SoftwareModelLit) {
				var12 = ((SoftwareModelLit) var12).hillSkew(this.skewType, this.skewAmount, arg2, arg1, arg3, arg7, arg5, true);
			} else if (var12 instanceof ModelUnlit) {
				var12 = ((ModelUnlit) var12).hillSkew(this.skewType, this.skewAmount, arg2, arg1, arg3, arg7, arg5);
			}
		}
		mc3.field3984 = var12;
		return mc3;
	}

	@ObfuscatedName("nf.d(B)Lnf;")
	public LocType getMultiLoc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		if (var1 < 0 || var1 >= this.multiloc.length - 1 || this.multiloc[var1] == -1) {
			int var2 = this.multiloc[this.multiloc.length - 1];
			return var2 == -1 ? null : list(var2);
		} else {
			return list(this.multiloc[var1]);
		}
	}

	@ObfuscatedName("nf.a(ILi;I)Li;")
	public JagString getParamString(JagString arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			StringNode var3 = (StringNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("nf.a(IIB)Lhe;")
	public ModelUnlit buildModel(int arg0, int arg1) {
		ModelUnlit var3 = null;
		boolean var4 = this.mirror;
		if (arg1 == 2 && arg0 > 3) {
			var4 = !var4;
		}
		if (this.shape == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.model == null) {
				return null;
			}
			int var5 = this.model.length;
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = this.model[var6];
				if (var4) {
					var7 += 65536;
				}
				var3 = (ModelUnlit) mc1.find((long) var7);
				if (var3 == null) {
					var3 = ModelUnlit.load(models, var7 & 0xFFFF);
					if (var3 == null) {
						return null;
					}
					if (var4) {
						var3.mirror();
					}
					mc1.put((long) var7, var3);
				}
				if (var5 > 1) {
					temp[var6] = var3;
				}
			}
			if (var5 > 1) {
				var3 = new ModelUnlit(temp, var5);
			}
		} else {
			int var8 = -1;
			for (int var9 = 0; var9 < this.shape.length; var9++) {
				if (arg1 == this.shape[var9]) {
					var8 = var9;
					break;
				}
			}
			if (var8 == -1) {
				return null;
			}
			int var10 = this.model[var8];
			if (var4) {
				var10 += 65536;
			}
			var3 = (ModelUnlit) mc1.find((long) var10);
			if (var3 == null) {
				var3 = ModelUnlit.load(models, var10 & 0xFFFF);
				if (var3 == null) {
					return null;
				}
				if (var4) {
					var3.mirror();
				}
				mc1.put((long) var10, var3);
			}
		}
		boolean var11;
		if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
			var11 = false;
		} else {
			var11 = true;
		}
		boolean var12;
		if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
			var12 = false;
		} else {
			var12 = true;
		}
		ModelUnlit var13 = new ModelUnlit(var3, arg0 == 0 && !var11 && !var12, this.recol_s == null, this.retex_s == null, true);
		if (arg1 == 4 && arg0 > 3) {
			var13.method573();
			var13.translate(45, 0, -45);
		}
		int var14 = arg0 & 0x3;
		if (var14 == 1) {
			var13.rotate90();
		} else if (var14 == 2) {
			var13.rotate180();
		} else if (var14 == 3) {
			var13.rotate270();
		}
		if (this.recol_s != null) {
			for (int var15 = 0; var15 < this.recol_s.length; var15++) {
				if (this.recol_d_palette == null || var15 >= this.recol_d_palette.length) {
					var13.recolour(this.recol_s[var15], this.recol_d[var15]);
				} else {
					var13.recolour(this.recol_s[var15], clientpalette[this.recol_d_palette[var15] & 0xFF]);
				}
			}
		}
		if (this.retex_s != null) {
			for (int var16 = 0; var16 < this.retex_s.length; var16++) {
				var13.retexture(this.retex_s[var16], this.retex_d[var16]);
			}
		}
		if (var11) {
			var13.resize(this.resizex, this.resizey, this.resizez);
		}
		if (var12) {
			var13.translate(this.offsetx, this.offsety, this.offsetz);
		}
		return var13;
	}

	@ObfuscatedName("nf.a(BILea;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			if (var3 > 0) {
				if (this.model != null && !lowMem) {
					arg1.pos += var3 * 3;
					return;
				}
				this.shape = new int[var3];
				this.model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.model[var4] = arg1.g2();
					this.shape[var4] = arg1.g1();
				}
			}
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 5) {
			int var22 = arg1.g1();
			if (var22 > 0) {
				if (this.model != null && !lowMem) {
					arg1.pos += var22 * 2;
					return;
				}
				this.model = new int[var22];
				this.shape = null;
				for (int var23 = 0; var23 < var22; var23++) {
					this.model[var23] = arg1.g2();
				}
			}
		} else if (arg0 == 14) {
			this.width = arg1.g1();
		} else if (arg0 == 15) {
			this.length = arg1.g1();
		} else if (arg0 == 17) {
			this.blockrange = false;
			this.blockwalk = 0;
		} else if (arg0 == 18) {
			this.blockrange = false;
		} else if (arg0 == 19) {
			this.active = arg1.g1();
		} else if (arg0 == 21) {
			this.skewType = 1;
		} else if (arg0 == 22) {
			this.sharelight = true;
		} else if (arg0 == 23) {
			this.occlude = true;
		} else if (arg0 == 24) {
			this.anim = arg1.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
		} else if (arg0 == 27) {
			this.blockwalk = 1;
		} else if (arg0 == 28) {
			this.wallwidth = arg1.g1();
		} else if (arg0 == 29) {
			this.ambient = arg1.g1b();
		} else if (arg0 == 39) {
			this.contrast = arg1.g1b() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.op[arg0 - 30] = arg1.gjstr();
			if (this.op[arg0 - 30].method624(Text.HIDDEN)) {
				this.op[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			int var5 = arg1.g1();
			this.recol_s = new short[var5];
			this.recol_d = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_s[var6] = (short) arg1.g2();
				this.recol_d[var6] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var20 = arg1.g1();
			this.retex_d = new short[var20];
			this.retex_s = new short[var20];
			for (int var21 = 0; var21 < var20; var21++) {
				this.retex_s[var21] = (short) arg1.g2();
				this.retex_d[var21] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			int var7 = arg1.g1();
			this.recol_d_palette = new byte[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.recol_d_palette[var8] = arg1.g1b();
			}
		} else if (arg0 == 60) {
			this.mapfunction = arg1.g2();
		} else if (arg0 == 62) {
			this.mirror = true;
		} else if (arg0 == 64) {
			this.shadow = false;
		} else if (arg0 == 65) {
			this.resizex = arg1.g2();
		} else if (arg0 == 66) {
			this.resizey = arg1.g2();
		} else if (arg0 == 67) {
			this.resizez = arg1.g2();
		} else if (arg0 == 68) {
			this.mapscene = arg1.g2();
		} else if (arg0 == 69) {
			this.forceapproach = arg1.g1();
		} else if (arg0 == 70) {
			this.offsetx = arg1.g2b();
		} else if (arg0 == 71) {
			this.offsety = arg1.g2b();
		} else if (arg0 == 72) {
			this.offsetz = arg1.g2b();
		} else if (arg0 == 73) {
			this.forcedecor = true;
		} else if (arg0 == 74) {
			this.breakroutefinding = true;
		} else if (arg0 == 75) {
			this.raiseobject = arg1.g1();
		} else if (arg0 == 77 || arg0 == 92) {
			this.multivarbit = arg1.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			int var17 = -1;
			this.multivarp = arg1.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			if (arg0 == 92) {
				var17 = arg1.g2();
				if (var17 == 65535) {
					var17 = -1;
				}
			}
			int var18 = arg1.g1();
			this.multiloc = new int[var18 + 2];
			for (int var19 = 0; var19 <= var18; var19++) {
				this.multiloc[var19] = arg1.g2();
				if (this.multiloc[var19] == 65535) {
					this.multiloc[var19] = -1;
				}
			}
			this.multiloc[var18 + 1] = var17;
		} else if (arg0 == 78) {
			this.bgsound_sound = arg1.g2();
			this.bgsound_range = arg1.g1();
		} else if (arg0 == 79) {
			this.bgsound_mindelay = arg1.g2();
			this.bgsound_maxdelay = arg1.g2();
			this.bgsound_range = arg1.g1();
			int var15 = arg1.g1();
			this.bgsound_random = new int[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.bgsound_random[var16] = arg1.g2();
			}
		} else if (arg0 == 81) {
			this.skewType = 2;
			this.skewAmount = (short) (arg1.g1() * 256);
		} else if (arg0 == 82 || arg0 == 88) {
			// istexture || hardshadow
		} else if (arg0 == 89) {
			this.randomanimframe = false;
		} else if (arg0 == 90) {
			this.field2799 = true;
		} else if (arg0 == 91) {
			this.members = true;
		} else if (arg0 == 93) {
			this.skewType = 3;
			this.skewAmount = (short) arg1.g2();
		} else if (arg0 == 94) {
			this.skewType = 4;
		} else if (arg0 == 95) {
			this.skewType = 5;
		} else if (arg0 == 249) {
			int var9 = arg1.g1();
			if (this.params == null) {
				int var10 = IntUtil.bitceil(var9);
				this.params = new HashTable(var10);
			}
			for (int var11 = 0; var11 < var9; var11++) {
				boolean var12 = arg1.g1() == 1;
				int var13 = arg1.g3();
				Linkable var14;
				if (var12) {
					var14 = new StringNode(arg1.gjstr());
				} else {
					var14 = new IntNode(arg1.g4());
				}
				this.params.put((long) var13, var14);
			}
		}
	}

	@ObfuscatedName("nf.a(Lea;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("nf.g(I)V")
	public void postDecode() {
		if (this.active == -1) {
			this.active = 0;
			if (this.model != null && (this.shape == null || this.shape[0] == 10)) {
				this.active = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.op[var1] != null) {
					this.active = 1;
					break;
				}
			}
		}
		if (this.raiseobject == -1) {
			this.raiseobject = this.blockwalk == 0 ? 0 : 1;
		}
	}

	@ObfuscatedName("nf.a(BIIIIILk;[[I[[II)Ltc;")
	public ModelCacheLit getTempModel(int arg0, int arg1, int arg2, int arg3, int arg4, SeqType arg5, int[][] arg6, int[][] arg7, int arg8) {
		long var10;
		if (this.shape == null) {
			var10 = arg8 + (this.id << 10);
		} else {
			var10 = arg8 + (this.id << 10) + (arg2 << 3);
		}
		SoftwareModelLit var12 = (SoftwareModelLit) mc2.find(var10);
		if (var12 == null) {
			ModelUnlit var13 = this.buildModel(arg8, arg2);
			if (var13 == null) {
				return null;
			}
			var12 = new SoftwareModelLit(var13, this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
			mc2.put(var10, var12);
		}
		if (arg5 != null) {
			var12 = (SoftwareModelLit) arg5.animateModel90(arg8, var12, arg4);
		}
		if (this.skewType != 0) {
			if (arg5 == null) {
				var12 = (SoftwareModelLit) var12.copyForAnim(true, true);
			}
			var12 = var12.hillSkew(this.skewType, this.skewAmount, arg6, arg7, arg1, arg0, arg3, false);
		}
		mc3.field3984 = var12;
		return mc3;
	}
}
