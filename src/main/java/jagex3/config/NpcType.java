package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;
import jagex3.var.VarCache;

@ObfuscatedName("lf")
public final class NpcType extends Linkable2 {

	@ObfuscatedName("vb.N")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("jh.c")
	public static final ModelSourceCache modelCache = new ModelSourceCache(50);
	@ObfuscatedName("mj.h")
	public static final ModelSourceCache headModelCache = new ModelSourceCache(5);
	@ObfuscatedName("tb.m")
	public static Js5 configClient;
	@ObfuscatedName("pg.L")
	public static Js5 models;
	@ObfuscatedName("af.S")
	public static short[] clientpalette = new short[256];
	@ObfuscatedName("lf.ab")
	public byte[] recol_d_palette;

	@ObfuscatedName("lf.cb")
	public int walkanim_l = -1;

	@ObfuscatedName("lf.eb")
	public int turnspeed = 32;

	@ObfuscatedName("lf.fb")
	public int resizeh = 128;

	@ObfuscatedName("ab.i")
	public static final JagString NULL = JagString.wrap("null");
	@ObfuscatedName("lf.gb")
	public JagString name = NULL;

	@ObfuscatedName("lf.hb")
	public final JagString[] op = new JagString[5];

	@ObfuscatedName("lf.ib")
	public int walkanim_b = -1;

	@ObfuscatedName("lf.jb")
	public HashTable params;

	@ObfuscatedName("lf.kb")
	public short[] retex_d;

	@ObfuscatedName("lf.mb")
	public int resizev = 128;

	@ObfuscatedName("lf.ob")
	public int size = 1;

	@ObfuscatedName("lf.pb")
	public short field2350 = 0;

	@ObfuscatedName("lf.qb")
	public int walkanim_r = -1;

	@ObfuscatedName("lf.sb")
	public int multivarbit = -1;

	@ObfuscatedName("lf.tb")
	public boolean walksmoothing = true;

	@ObfuscatedName("lf.ub")
	public short[] retex_s;

	@ObfuscatedName("lf.wb")
	public boolean minimap = true;

	@ObfuscatedName("lf.Q")
	public int headicon = -1;

	@ObfuscatedName("lf.T")
	public short field2329 = 0;

	@ObfuscatedName("lf.J")
	public int contrast = 0;

	@ObfuscatedName("lf.H")
	public int turnleftanim = -1;

	@ObfuscatedName("lf.W")
	public int vislevel = -1;

	@ObfuscatedName("lf.P")
	public int readyanim = -1;

	@ObfuscatedName("lf.M")
	public int walkanim = -1;

	@ObfuscatedName("lf.xb")
	public int ambient = 0;

	@ObfuscatedName("lf.yb")
	public boolean active = true;

	@ObfuscatedName("lf.zb")
	public int turnrightanim = -1;

	@ObfuscatedName("lf.Cb")
	public boolean alwaysontop = false;

	@ObfuscatedName("lf.Eb")
	public int multivarp = -1;

	@ObfuscatedName("lf.E")
	public int id;

	@ObfuscatedName("lf.R")
	public int[] multinpc;

	@ObfuscatedName("lf.Ab")
	public int[] model;

	@ObfuscatedName("lf.Bb")
	public int[] head;

	@ObfuscatedName("lf.G")
	public short[] recol_d;

	@ObfuscatedName("lf.Y")
	public short[] recol_s;

	@ObfuscatedName("ne.a(II)Llf;")
	public static NpcType list(int arg0) {
		NpcType var1 = (NpcType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(getGroupId(arg0), getFileId(arg0));
		NpcType var3 = new NpcType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ab.a(B)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
		headModelCache.clear();
	}

	@ObfuscatedName("eb.a(ILnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		configClient = arg0;
		models = arg1;
	}

	@ObfuscatedName("je.b(I)V")
	public static void resetModelCache() {
		modelCache.clear();
	}

    @ObfuscatedName("ob.b(B)V")
    public static void resetHeadModelCache() {
        headModelCache.clear();
    }

	@ObfuscatedName("jc.b(II)I")
	public static int getFileId(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("eg.a(IB)I")
	public static int getGroupId(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("lf.b(Z)Z")
	public boolean isMultiNpcVisible() {
		if (this.multinpc == null) {
			return true;
		}
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		if (var1 < 0 || var1 >= this.multinpc.length - 1 || this.multinpc[var1] == -1) {
			int var2 = this.multinpc[this.multinpc.length - 1];
			return var2 != -1;
		} else {
			return true;
		}
	}

	@ObfuscatedName("lf.a(Lea;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("lf.a(III)I")
	public int getParamInt(int arg0, int arg1) {
		if (this.params == null) {
			return arg0;
		} else {
			IntNode var3 = (IntNode) this.params.find((long) arg1);
			return var3 == null ? arg0 : var3.field3698;
		}
	}

	@ObfuscatedName("lf.a(IZLea;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			this.model = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.model[var4] = arg1.g2();
			}
		} else if (arg0 == 2) {
			this.name = arg1.gjstr();
		} else if (arg0 == 12) {
			this.size = arg1.g1();
		} else if (arg0 == 13) {
			this.readyanim = arg1.g2();
		} else if (arg0 == 14) {
			this.walkanim = arg1.g2();
		} else if (arg0 == 15) {
			this.turnleftanim = arg1.g2();
		} else if (arg0 == 16) {
			this.turnrightanim = arg1.g2();
		} else if (arg0 == 17) {
			this.walkanim = arg1.g2();
			this.walkanim_b = arg1.g2();
			this.walkanim_r = arg1.g2();
			this.walkanim_l = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.op[arg0 - 30] = arg1.gjstr();
			if (this.op[arg0 - 30].method624(Text.HIDDEN)) {
				this.op[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			int var20 = arg1.g1();
			this.recol_d = new short[var20];
			this.recol_s = new short[var20];
			for (int var21 = 0; var21 < var20; var21++) {
				this.recol_s[var21] = (short) arg1.g2();
				this.recol_d[var21] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var18 = arg1.g1();
			this.retex_d = new short[var18];
			this.retex_s = new short[var18];
			for (int var19 = 0; var19 < var18; var19++) {
				this.retex_s[var19] = (short) arg1.g2();
				this.retex_d[var19] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			int var5 = arg1.g1();
			this.recol_d_palette = new byte[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_d_palette[var6] = arg1.g1b();
			}
		} else if (arg0 == 60) {
			int var16 = arg1.g1();
			this.head = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				this.head[var17] = arg1.g2();
			}
		} else if (arg0 == 93) {
			this.minimap = false;
		} else if (arg0 == 95) {
			this.vislevel = arg1.g2();
		} else if (arg0 == 97) {
			this.resizeh = arg1.g2();
		} else if (arg0 == 98) {
			this.resizev = arg1.g2();
		} else if (arg0 == 99) {
			this.alwaysontop = true;
		} else if (arg0 == 100) {
			this.ambient = arg1.g1b();
		} else if (arg0 == 101) {
			this.contrast = arg1.g1b() * 5;
		} else if (arg0 == 102) {
			this.headicon = arg1.g2();
		} else if (arg0 == 103) {
			this.turnspeed = arg1.g2();
		} else if (arg0 == 106 || arg0 == 118) {
			int var13 = -1;
			this.multivarbit = arg1.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg1.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			if (arg0 == 118) {
				var13 = arg1.g2();
				if (var13 == 65535) {
					var13 = -1;
				}
			}
			int var14 = arg1.g1();
			this.multinpc = new int[var14 + 2];
			for (int var15 = 0; var15 <= var14; var15++) {
				this.multinpc[var15] = arg1.g2();
				if (this.multinpc[var15] == 65535) {
					this.multinpc[var15] = -1;
				}
			}
			this.multinpc[var14 + 1] = var13;
		} else if (arg0 == 107) {
			this.active = false;
		} else if (arg0 == 109) {
			this.walksmoothing = false;
		} else if (arg0 == 111) {
			// spotshadow
		} else if (arg0 == 113) {
			// spotshadowcolour
			arg1.g2();
			arg1.g2();
		} else if (arg0 == 114) {
			// spotshadowtrans
			arg1.g1b();
			arg1.g1b();
		} else if (arg0 == 115) {
			this.field2350 = (short) (arg1.g1() * 4);
			this.field2329 = (short) (arg1.g1() * 4);
		} else if (arg0 == 119) {
			// walkflags
			arg1.g1b();
		} else if (arg0 == 249) {
			int var7 = arg1.g1();
			if (this.params == null) {
				int var8 = IntUtil.bitceil(var7);
				this.params = new HashTable(var8);
			}
			for (int var9 = 0; var9 < var7; var9++) {
				boolean var10 = arg1.g1() == 1;
				int var11 = arg1.g3();
				Linkable var12;
				if (var10) {
					var12 = new StringNode(arg1.gjstr());
				} else {
					var12 = new IntNode(arg1.g4());
				}
				this.params.put((long) var11, var12);
			}
		}
	}

	@ObfuscatedName("lf.d(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("lf.a(IILi;)Li;")
	public JagString getParamString(int arg0, JagString arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			StringNode var3 = (StringNode) this.params.find((long) arg0);
			return var3 == null ? arg1 : var3.field4046;
		}
	}

	@ObfuscatedName("lf.d(B)Llf;")
	public NpcType getMultiNpc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		if (var1 < 0 || this.multinpc.length - 1 <= var1 || this.multinpc[var1] == -1) {
			int var2 = this.multinpc[this.multinpc.length - 1];
			return var2 == -1 ? null : list(var2);
		} else {
			return list(this.multinpc[var1]);
		}
	}

	@ObfuscatedName("lf.a(IILk;)Lcg;")
	public ModelLit getHeadModelLit(int arg0, SeqType arg1) {
		if (this.multinpc != null) {
			NpcType var3 = this.getMultiNpc();
			return var3 == null ? null : var3.getHeadModelLit(arg0, arg1);
		} else if (this.head == null) {
			return null;
		} else {
			ModelLit var4 = (ModelLit) headModelCache.find((long) this.id);
			if (var4 == null) {
				boolean var5 = false;
				for (int var6 = 0; var6 < this.head.length; var6++) {
					if (!models.requestDownload(this.head[var6], 0)) {
						var5 = true;
					}
				}
				if (var5) {
					return null;
				}
				ModelUnlit[] var7 = new ModelUnlit[this.head.length];
				for (int var8 = 0; var8 < this.head.length; var8++) {
					var7[var8] = ModelUnlit.load(models, this.head[var8]);
				}
				ModelUnlit var9;
				if (var7.length == 1) {
					var9 = var7[0];
				} else {
					var9 = new ModelUnlit(var7, var7.length);
				}
				if (this.recol_s != null) {
					for (int var10 = 0; var10 < this.recol_s.length; var10++) {
						if (this.recol_d_palette == null || this.recol_d_palette.length <= var10) {
							var9.recolour(this.recol_s[var10], this.recol_d[var10]);
						} else {
							var9.recolour(this.recol_s[var10], clientpalette[this.recol_d_palette[var10] & 0xFF]);
						}
					}
				}
				if (this.retex_s != null) {
					for (int var11 = 0; var11 < this.retex_s.length; var11++) {
						var9.retexture(this.retex_s[var11], this.retex_d[var11]);
					}
				}
				var4 = var9.light(64, 768, -50, -10, -50);
				headModelCache.put((long) this.id, var4);
			}
			if (arg1 != null) {
				var4 = arg1.animateModelWithExtra(arg0, var4);
			}
			return var4;
		}
	}

	@ObfuscatedName("lf.a(ILk;IILk;)Lcg;")
	public ModelLit getTempModel(SeqType arg0, int arg1, int arg2, SeqType arg3) {
		if (this.multinpc != null) {
			NpcType var5 = this.getMultiNpc();
			return var5 == null ? null : var5.getTempModel(arg0, arg1, arg2, arg3);
		}
		ModelLit var6 = (ModelLit) modelCache.find((long) this.id);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.model.length; var8++) {
				if (!models.requestDownload(this.model[var8], 0)) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			ModelUnlit[] var9 = new ModelUnlit[this.model.length];
			for (int var10 = 0; var10 < this.model.length; var10++) {
				var9[var10] = ModelUnlit.load(models, this.model[var10]);
			}
			ModelUnlit var11;
			if (var9.length == 1) {
				var11 = var9[0];
			} else {
				var11 = new ModelUnlit(var9, var9.length);
			}
			if (this.recol_s != null) {
				for (int var12 = 0; var12 < this.recol_s.length; var12++) {
					if (this.recol_d_palette == null || var12 >= this.recol_d_palette.length) {
						var11.recolour(this.recol_s[var12], this.recol_d[var12]);
					} else {
						var11.recolour(this.recol_s[var12], clientpalette[this.recol_d_palette[var12] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (int var13 = 0; var13 < this.retex_s.length; var13++) {
					var11.retexture(this.retex_s[var13], this.retex_d[var13]);
				}
			}
			var6 = var11.light(this.ambient + 64, 850 - -this.contrast, -30, -50, -30);
			modelCache.put((long) this.id, var6);
		}
		ModelLit var14;
		if (arg3 != null && arg0 != null) {
			var14 = arg3.splitAnimateModel(arg2, arg0, arg1, var6);
		} else if (arg3 != null) {
			var14 = arg3.animateModel2(arg2, var6);
		} else if (arg0 == null) {
			var14 = var6.copyForAnim(true, true);
		} else {
			var14 = arg0.animateModel2(arg1, var6);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var14.resize(this.resizeh, this.resizev, this.resizeh);
		}
		return var14;
	}
}
