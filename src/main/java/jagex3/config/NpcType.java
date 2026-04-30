package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("h")
public final class NpcType extends Linkable2 {

	@ObfuscatedName("se.A")
	public static Js5 configClient;
	@ObfuscatedName("wb.d")
	public static Js5 models;
	@ObfuscatedName("gb.n")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("wb.L")
	public static LruCache modelCache = new LruCache(50);
	@ObfuscatedName("h.ac")
	public int walkanim_b = -1;

	@ObfuscatedName("h.bc")
	public int resizeh = 128;

	@ObfuscatedName("h.dc")
	public int contrast = 0;

	@ObfuscatedName("h.fc")
	public int multivarbit = -1;

	@ObfuscatedName("h.hc")
	public int walkanim_l = -1;

	@ObfuscatedName("h.jc")
	public int resizev = 128;

	@ObfuscatedName("h.mc")
	public int walkanim_r = -1;

	@ObfuscatedName("h.pc")
	public int turnleftanim = -1;

	@ObfuscatedName("h.sb")
	public boolean active = true;

	@ObfuscatedName("h.tc")
	public int walkanim = -1;

	@ObfuscatedName("h.ub")
	public int size = 1;

	@ObfuscatedName("h.uc")
	public int[] multinpc;

	@ObfuscatedName("h.vb")
	public int[] head;

	@ObfuscatedName("h.vc")
	public int id;

	@ObfuscatedName("h.wb")
	public final JagString[] op = new JagString[5];

	@ObfuscatedName("h.wc")
	public int[] recol_d;

	@ObfuscatedName("h.Cb")
	public int readyanim = -1;

	@ObfuscatedName("h.Bb")
	public int headicon = -1;

	@ObfuscatedName("h.Lb")
	public int turnspeed = 32;

	@ObfuscatedName("h.Hb")
	public int ambient = 0;

	@ObfuscatedName("h.Fb")
	public int multivarp = -1;

	@ObfuscatedName("h.Rb")
	public boolean alwaysontop = false;

	@ObfuscatedName("h.Nb")
	public int vislevel = -1;

	@ObfuscatedName("h.Jb")
	public int turnrightanim = -1;

	@ObfuscatedName("mc.g")
	public static JagString field1852 = JagString.wrap("null");
	@ObfuscatedName("h.Wb")
	public JagString name = field1852;

	@ObfuscatedName("h.yc")
	public boolean minimap = true;

	@ObfuscatedName("h.Pb")
	public int[] recol_s;

	@ObfuscatedName("h.Zb")
	public int[] model;

	@ObfuscatedName("kc.a(Lbd;ILbd;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		configClient = arg1;
		models = arg0;
	}

	@ObfuscatedName("r.a(BI)Lh;")
	public static NpcType list(int arg0) {
		NpcType var1 = (NpcType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 9);
		NpcType var3 = new NpcType();
		var3.id = arg0;
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("hd.f(I)V")
	public static void resetCache() {
		recentUse.clear();
		modelCache.clear();
	}

	@ObfuscatedName("h.a(BLhe;Lhe;II)Lpa;")
	public Model getTempModel(SeqType arg0, SeqType arg1, int arg2, int arg3) {
		if (this.multinpc != null) {
			NpcType var5 = this.getMultiNpc();
			return var5 == null ? null : var5.getTempModel(arg0, arg1, arg2, arg3);
		}
		Model var6 = (Model) modelCache.find((long) this.id);
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
			Model[] var9 = new Model[this.model.length];
			for (int var10 = 0; var10 < this.model.length; var10++) {
				var9[var10] = Model.load(models, this.model[var10]);
			}
			if (var9.length == 1) {
				var6 = var9[0];
			} else {
				var6 = new Model(var9, var9.length);
			}
			if (this.recol_d != null) {
				for (int var11 = 0; var11 < this.recol_d.length; var11++) {
					var6.recolour(this.recol_d[var11], this.recol_s[var11]);
				}
			}
			var6.prepareAnim();
			var6.light(this.ambient + 64, 850 - -this.contrast, -30, -50, -30, true);
			modelCache.put((long) this.id, var6);
		}
		Model var12;
		if (arg0 != null && arg1 != null) {
			var12 = arg0.splitAnimateModel(var6, arg1, arg3, arg2);
		} else if (arg0 != null) {
			var12 = arg0.animateModel(arg3, var6);
		} else if (arg1 == null) {
			var12 = var6.copyForAnim(true);
		} else {
			var12 = arg1.animateModel(arg2, var6);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var12.resize(this.resizeh, this.resizev, this.resizeh);
		}
		return var12;
	}

	@ObfuscatedName("h.g(I)Z")
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
		return var1 >= 0 && this.multinpc.length > var1 && this.multinpc[var1] != -1;
	}

	@ObfuscatedName("h.a(IILba;)V")
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
			if (this.op[arg0 - 30].equalsIgnoreCase(Text.HIDDEN)) {
				this.op[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			int var5 = arg1.g1();
			this.recol_s = new int[var5];
			this.recol_d = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_d[var6] = arg1.g2();
				this.recol_s[var6] = arg1.g2();
			}
		} else if (arg0 == 60) {
			int var9 = arg1.g1();
			this.head = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.head[var10] = arg1.g2();
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
		} else if (arg0 == 106) {
			this.multivarbit = arg1.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg1.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int var7 = arg1.g1();
			this.multinpc = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.multinpc[var8] = arg1.g2();
				if (this.multinpc[var8] == 65535) {
					this.multinpc[var8] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.active = false;
		}
	}

	@ObfuscatedName("h.a(ZLba;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("h.b(B)Lpa;")
	public Model getHead() {
		if (this.multinpc != null) {
			NpcType var1 = this.getMultiNpc();
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
			Model[] var4 = new Model[this.head.length];
			for (int var5 = 0; var5 < this.head.length; var5++) {
				var4[var5] = Model.load(models, this.head[var5]);
			}
			Model var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new Model(var4, var4.length);
			}
			if (this.recol_d != null) {
				for (int var7 = 0; var7 < this.recol_d.length; var7++) {
					var6.recolour(this.recol_d[var7], this.recol_s[var7]);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("h.i(I)Lh;")
	public NpcType getMultiNpc() {
		int var1 = -1;
		if (this.multivarbit != -1) {
			var1 = VarCache.getVarbit(this.multivarbit);
		} else if (this.multivarp != -1) {
			var1 = VarCache.var[this.multivarp];
		}
		return var1 < 0 || var1 >= this.multinpc.length || this.multinpc[var1] == -1 ? null : list(this.multinpc[var1]);
	}

	@ObfuscatedName("h.c(B)V")
	public void postDecode() {
	}
}
