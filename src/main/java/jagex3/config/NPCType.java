package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("o")
public final class NPCType extends Linkable2 {

	@ObfuscatedName("wa.t")
	public static Js5 configClient;

	@ObfuscatedName("cd.f")
	public static Js5 models;

	@ObfuscatedName("ba.f")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("ud.T")
	public static LruCache modelCache = new LruCache(50);

	@ObfuscatedName("o.ub")
	public int id;

	@ObfuscatedName("kb.j")
	public static JagString AUTO_NAME = JagString.wrap("null");
	@ObfuscatedName("o.ab")
	public JagString name = AUTO_NAME;

	@ObfuscatedName("o.S")
	public int size = 1;

	@ObfuscatedName("o.M")
	public int[] model;

	@ObfuscatedName("o.Z")
	public int[] head;

	@ObfuscatedName("o.R")
	public int readyanim = -1;

	@ObfuscatedName("o.H")
	public int turnrightanim = -1;

	@ObfuscatedName("o.fb")
	public int turnleftanim = -1;

	@ObfuscatedName("o.Y")
	public int walkanim = -1;

	@ObfuscatedName("o.X")
	public int walkanim_b = -1;

	@ObfuscatedName("o.pb")
	public int walkanim_l = -1;

	@ObfuscatedName("o.hb")
	public int walkanim_r = -1;

	@ObfuscatedName("o.yb")
	public short[] recol_s;

	@ObfuscatedName("o.qb")
	public short[] recol_d;

	@ObfuscatedName("o.P")
	public short[] retex_s;

	@ObfuscatedName("o.T")
	public short[] retex_d;

	@ObfuscatedName("o.L")
	public final JagString[] op = new JagString[5];

	@ObfuscatedName("o.rb")
	public boolean minimap = true;

	@ObfuscatedName("o.U")
	public int vislevel = -1;

	@ObfuscatedName("o.cb")
	public int resizeh = 128;

	@ObfuscatedName("o.xb")
	public int resizev = 128;

	@ObfuscatedName("o.Nb")
	public boolean alwaysontop = false;

	@ObfuscatedName("o.N")
	public int ambient = 0;

	@ObfuscatedName("o.sb")
	public int contrast = 0;

	@ObfuscatedName("o.nb")
	public int headicon = -1;

	@ObfuscatedName("o.ob")
	public int turnspeed = 32;

	@ObfuscatedName("o.kb")
	public int[] multinpc;

	@ObfuscatedName("o.O")
	public int multivarbit = -1;

	@ObfuscatedName("o.I")
	public int multivarp = -1;

	@ObfuscatedName("o.K")
	public boolean active = true;

	@ObfuscatedName("o.Lb")
	public boolean walksmoothing = true;

	@ObfuscatedName("td.a(Lea;Lea;B)V")
	public static void init(Js5 arg0, Js5 arg1) {
		models = arg1;
		configClient = arg0;
	}

	@ObfuscatedName("cb.b(II)Lo;")
	public static NPCType list(int arg0) {
		NPCType var1 = (NPCType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(9, arg0);
		NPCType var3 = new NPCType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("o.b(B)V")
	public void postDecode() {
	}

	@ObfuscatedName("o.a(BLjd;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("o.a(ILjd;I)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			this.model = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.model[var4] = arg0.g2();
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 12) {
			this.size = arg0.g1();
		} else if (arg1 == 13) {
			this.readyanim = arg0.g2();
		} else if (arg1 == 14) {
			this.walkanim = arg0.g2();
		} else if (arg1 == 15) {
			this.turnleftanim = arg0.g2();
		} else if (arg1 == 16) {
			this.turnrightanim = arg0.g2();
		} else if (arg1 == 17) {
			this.walkanim = arg0.g2();
			this.walkanim_b = arg0.g2();
			this.walkanim_l = arg0.g2();
			this.walkanim_r = arg0.g2();
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
			int var9 = arg0.g1();
			this.retex_s = new short[var9];
			this.retex_d = new short[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.retex_s[var10] = (short) arg0.g2();
				this.retex_d[var10] = (short) arg0.g2();
			}
		} else if (arg1 == 60) {
			int var5 = arg0.g1();
			this.head = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.head[var6] = arg0.g2();
			}
		} else if (arg1 == 93) {
			this.minimap = false;
		} else if (arg1 == 95) {
			this.vislevel = arg0.g2();
		} else if (arg1 == 97) {
			this.resizeh = arg0.g2();
		} else if (arg1 == 98) {
			this.resizev = arg0.g2();
		} else if (arg1 == 99) {
			this.alwaysontop = true;
		} else if (arg1 == 100) {
			this.ambient = arg0.g1b();
		} else if (arg1 == 101) {
			this.contrast = arg0.g1b() * 5;
		} else if (arg1 == 102) {
			this.headicon = arg0.g2();
		} else if (arg1 == 103) {
			this.turnspeed = arg0.g2();
		} else if (arg1 == 106) {
			this.multivarbit = arg0.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg0.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int var7 = arg0.g1();
			this.multinpc = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.multinpc[var8] = arg0.g2();
				if (this.multinpc[var8] == 65535) {
					this.multinpc[var8] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.active = false;
		} else if (arg1 == 109) {
			this.walksmoothing = false;
		}
	}

	@ObfuscatedName("o.a(Lvc;ILvc;BI)Lod;")
	public ModelLit getTempModel(SeqType arg0, int arg1, SeqType arg2, int arg3) {
		if (this.multinpc != null) {
			NPCType var5 = this.getMultiNpc();
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
					var11.recolour(this.recol_s[var12], this.recol_d[var12]);
				}
			}
			if (this.retex_s != null) {
				for (int var13 = 0; var13 < this.retex_s.length; var13++) {
					var11.retexture(this.retex_s[var13], this.retex_d[var13]);
				}
			}
			var6 = var11.light(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			modelCache.put((long) this.id, var6);
		}
		ModelLit var14;
		if (arg2 != null && arg0 != null) {
			var14 = arg2.splitAnimateModel(arg3, arg0, var6, arg1);
		} else if (arg2 != null) {
			var14 = arg2.animateModel(var6, arg1);
		} else if (arg0 == null) {
			var14 = var6.copyForAnim(true);
		} else {
			var14 = arg0.animateModel(var6, arg3);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var14.resize(this.resizeh, this.resizev, this.resizeh);
		}
		return var14;
	}

	@ObfuscatedName("o.e(I)Lp;")
	public ModelUnlit getHead() {
		if (this.multinpc != null) {
			NPCType var1 = this.getMultiNpc();
			return var1 == null ? null : var1.getHead();
		} else if (this.head == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < this.head.length; var3++) {
				if (!models.requestDownload(this.head[var3], 0)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			ModelUnlit[] var4 = new ModelUnlit[this.head.length];
			for (int var5 = 0; var5 < this.head.length; var5++) {
				var4[var5] = ModelUnlit.load(models, this.head[var5]);
			}
			ModelUnlit var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new ModelUnlit(var4, var4.length);
			}
			if (this.recol_s != null) {
				for (int var7 = 0; var7 < this.recol_s.length; var7++) {
					var6.recolour(this.recol_s[var7], this.recol_d[var7]);
				}
			}
			if (this.retex_s != null) {
				for (int var8 = 0; var8 < this.retex_s.length; var8++) {
					var6.retexture(this.retex_s[var8], this.retex_d[var8]);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("o.g(I)Lo;")
	public NPCType getMultiNpc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		return var1 < 0 || var1 >= this.multinpc.length || this.multinpc[var1] == -1 ? null : list(this.multinpc[var1]);
	}

	@ObfuscatedName("o.f(I)Z")
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
		return var1 >= 0 && var1 < this.multinpc.length && this.multinpc[var1] != -1;
	}

	@ObfuscatedName("ld.a(I)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
	}
}
