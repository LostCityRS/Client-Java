package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("gc")
public final class NpcType {

	@ObfuscatedName("gc.I")
	public static LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("gc.i")
	public long id = -1L;

	@ObfuscatedName("gc.j")
	public String name;

	@ObfuscatedName("gc.l")
	public byte size = 1;

	@ObfuscatedName("gc.m")
	public int[] model;

	@ObfuscatedName("gc.n")
	public int[] head;

	@ObfuscatedName("gc.o")
	public int readyanim = -1;

	@ObfuscatedName("gc.p")
	public int walkanim = -1;

	@ObfuscatedName("gc.q")
	public int walkanim_b = -1;

	@ObfuscatedName("gc.r")
	public int walkanim_r = -1;

	@ObfuscatedName("gc.s")
	public int walkanim_l = -1;

	@ObfuscatedName("gc.t")
	public int[] recol_s;

	@ObfuscatedName("gc.u")
	public int[] recol_d;

	@ObfuscatedName("gc.v")
	public String[] op;

	@ObfuscatedName("gc.z")
	public boolean minimap = true;

	@ObfuscatedName("gc.A")
	public int vislevel = -1;

	@ObfuscatedName("gc.B")
	public int resizeh = 128;

	@ObfuscatedName("gc.C")
	public int resizev = 128;

	@ObfuscatedName("gc.D")
	public boolean alwaysontop = false;

	@ObfuscatedName("gc.E")
	public int ambient;

	@ObfuscatedName("gc.F")
	public int contrast;

	@ObfuscatedName("gc.G")
	public int headicon = -1;

	@ObfuscatedName("gc.H")
	public int turnspeed = 32;

	@ObfuscatedName("gc.a")
	public final boolean field1002 = false;

	@ObfuscatedName("gc.b")
	public final int field1003 = 44692;

	@ObfuscatedName("gc.c")
	public final byte field1004 = 4;

	@ObfuscatedName("gc.d")
	public static int numDefinitions;

	@ObfuscatedName("gc.e")
	public static int[] idx;

	@ObfuscatedName("gc.f")
	public static Packet dat;

	@ObfuscatedName("gc.g")
	public static NpcType[] recent;

	@ObfuscatedName("gc.h")
	public static int recentPos;

	@ObfuscatedName("gc.k")
	public byte[] desc;

	@ObfuscatedName("gc.w")
	public int field1024 = -1;

	@ObfuscatedName("gc.x")
	public int field1025 = -1;

	@ObfuscatedName("gc.y")
	public int field1026 = -1;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("npc.dat", null), 15787);
		Packet var1 = new Packet(arg0.read("npc.idx", null), 15787);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new NpcType();
		}
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static NpcType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (recent[var1].id == (long) arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 20;
		NpcType var2 = recent[recentPos] = new NpcType();
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("gc.a(ZLlb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.g1();
				model = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					model[var4] = arg0.g2();
				}
			} else if (var2 == 2) {
				name = arg0.gstr();
			} else if (var2 == 3) {
				desc = arg0.gstrbyte(field1003);
			} else if (var2 == 12) {
				size = arg0.g1b();
			} else if (var2 == 13) {
				readyanim = arg0.g2();
			} else if (var2 == 14) {
				walkanim = arg0.g2();
			} else if (var2 == 17) {
				walkanim = arg0.g2();
				walkanim_b = arg0.g2();
				walkanim_r = arg0.g2();
				walkanim_l = arg0.g2();
			} else if (var2 >= 30 && var2 < 40) {
				if (op == null) {
					op = new String[5];
				}
				op[var2 - 30] = arg0.gstr();
				if (op[var2 - 30].equalsIgnoreCase("hidden")) {
					op[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.g1();
				recol_s = new int[var5];
				recol_d = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					recol_s[var6] = arg0.g2();
					recol_d[var6] = arg0.g2();
				}
			} else if (var2 == 60) {
				int var7 = arg0.g1();
				head = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					head[var8] = arg0.g2();
				}
			} else if (var2 == 90) {
				field1024 = arg0.g2();
			} else if (var2 == 91) {
				field1025 = arg0.g2();
			} else if (var2 == 92) {
				field1026 = arg0.g2();
			} else if (var2 == 93) {
				minimap = false;
			} else if (var2 == 95) {
				vislevel = arg0.g2();
			} else if (var2 == 97) {
				resizeh = arg0.g2();
			} else if (var2 == 98) {
				resizev = arg0.g2();
			} else if (var2 == 99) {
				alwaysontop = true;
			} else if (var2 == 100) {
				ambient = arg0.g1b();
			} else if (var2 == 101) {
				contrast = arg0.g1b() * 5;
			} else if (var2 == 102) {
				headicon = arg0.g2();
			} else if (var2 == 103) {
				turnspeed = arg0.g2();
			}
		}
	}

	@ObfuscatedName("gc.a(III[I)Leb;")
	public Model getTempModel(int arg0, int arg1, int[] arg2) {
		Model var4 = (Model) modelCache.find(id);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < model.length; var6++) {
				if (!Model.requestDownload(model[var6])) {
					var5 = true;
				}
			}
			if (var5) {
				return null;
			}
			Model[] var7 = new Model[model.length];
			for (int var8 = 0; var8 < model.length; var8++) {
				var7[var8] = Model.load(model[var8], field1004);
			}
			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new Model(var7, var7.length, -33019);
			}
			if (recol_s != null) {
				for (int var9 = 0; var9 < recol_s.length; var9++) {
					var4.recolour(recol_s[var9], recol_d[var9]);
				}
			}
			var4.prepareAnim();
			var4.calculateNormals(ambient + 64, contrast + 850, -30, -50, -30, true);
			modelCache.put(id, var4);
		}
		Model var10 = Model.tempModel;
		var10.set(AnimFrame.animateTransparencies(arg1) & AnimFrame.animateTransparencies(arg0), var4);
		if (arg1 != -1 && arg0 != -1) {
			var10.maskAnimate(arg1, arg0, arg2);
		} else if (arg1 != -1) {
			var10.animate(arg1);
		}
		if (resizeh != 128 || resizev != 128) {
			var10.resize(resizeh, resizeh, resizev);
		}
		var10.calcBoundingCylinder();
		var10.labelFaces = null;
		var10.labelVertices = null;
		if (size == 1) {
			var10.useAABBMouseCheck = true;
		}
		return var10;
	}

	@ObfuscatedName("gc.a(B)V")
	public static void unload() {
		modelCache = null;
		idx = null;
		recent = null;
		dat = null;
	}

	@ObfuscatedName("gc.b(B)Leb;")
	public Model getHeadModel() {
		if (head == null) {
			return null;
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < head.length; var2++) {
			if (!Model.requestDownload(head[var2])) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		Model[] var3 = new Model[head.length];
		for (int var4 = 0; var4 < head.length; var4++) {
			var3[var4] = Model.load(head[var4], field1004);
		}
		Model var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new Model(var3, var3.length, -33019);
		}
		if (recol_s != null) {
			for (int var6 = 0; var6 < recol_s.length; var6++) {
				var5.recolour(recol_s[var6], recol_d[var6]);
			}
		}
		return var5;
	}
}
