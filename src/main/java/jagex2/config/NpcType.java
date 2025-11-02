package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class NpcType {

	@ObfuscatedName("SLDUQHOR.a")
	public int field1424 = -1;

	@ObfuscatedName("SLDUQHOR.g")
	public int field1430 = -1;

	@ObfuscatedName("SLDUQHOR.h")
	public long field1431 = -1L;

	@ObfuscatedName("SLDUQHOR.j")
	public int field1433 = 128;

	@ObfuscatedName("SLDUQHOR.k")
	public boolean field1434 = true;

	@ObfuscatedName("SLDUQHOR.l")
	public int field1435 = 128;

	@ObfuscatedName("SLDUQHOR.m")
	public int field1436 = -1;

	@ObfuscatedName("SLDUQHOR.p")
	public boolean field1439 = true;

	@ObfuscatedName("SLDUQHOR.q")
	public int field1440 = -1;

	@ObfuscatedName("SLDUQHOR.r")
	public int field1441 = -1;

	@ObfuscatedName("SLDUQHOR.s")
	public int field1442 = -1;

	@ObfuscatedName("SLDUQHOR.u")
	public int field1444 = -1;

	@ObfuscatedName("SLDUQHOR.v")
	public byte field1445 = 1;

	@ObfuscatedName("SLDUQHOR.w")
	public int field1446 = -1;

	@ObfuscatedName("SLDUQHOR.x")
	public boolean field1447 = false;

	@ObfuscatedName("SLDUQHOR.y")
	public int field1448 = -1;

	@ObfuscatedName("SLDUQHOR.B")
	public int field1451 = -1;

	@ObfuscatedName("SLDUQHOR.E")
	public int field1454 = 32;

	@ObfuscatedName("SLDUQHOR.F")
	public String field1455 = "null";

	@ObfuscatedName("SLDUQHOR.H")
	public int field1457 = -1;

	@ObfuscatedName("SLDUQHOR.M")
	public int field1462 = -1;

	@ObfuscatedName("SLDUQHOR.o")
	public static LruCache field1438 = new LruCache(30);

	@ObfuscatedName("SLDUQHOR.C")
	public static int field1452;

	@ObfuscatedName("SLDUQHOR.L")
	public int field1461;

	@ObfuscatedName("SLDUQHOR.O")
	public static int field1464;

	@ObfuscatedName("SLDUQHOR.Q")
	public int field1466;

	@ObfuscatedName("SLDUQHOR.K")
	public static Packet field1460;

	@ObfuscatedName("SLDUQHOR.i")
	public static Client varProvider;

	@ObfuscatedName("SLDUQHOR.N")
	public byte[] field1463;

	@ObfuscatedName("SLDUQHOR.b")
	public int[] field1425;

	@ObfuscatedName("SLDUQHOR.e")
	public int[] field1428;

	@ObfuscatedName("SLDUQHOR.f")
	public int[] field1429;

	@ObfuscatedName("SLDUQHOR.n")
	public int[] field1437;

	@ObfuscatedName("SLDUQHOR.D")
	public static int[] field1453;

	@ObfuscatedName("SLDUQHOR.J")
	public int[] field1459;

	@ObfuscatedName("SLDUQHOR.I")
	public static NpcType[] field1458;

	@ObfuscatedName("SLDUQHOR.z")
	public String[] field1449;

	@ObfuscatedName("SLDUQHOR.a(BLMFMVIYHT;)V")
	public void method470(Packet arg1) {
		boolean var3 = false;
		while (true) {
			int var4 = arg1.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				int var5 = arg1.g1();
				this.field1429 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1429[var6] = arg1.g2();
				}
			} else if (var4 == 2) {
				this.field1455 = arg1.gjstr();
			} else if (var4 == 3) {
				this.field1463 = arg1.gjstrraw();
			} else if (var4 == 12) {
				this.field1445 = arg1.g1b();
			} else if (var4 == 13) {
				this.field1424 = arg1.g2();
			} else if (var4 == 14) {
				this.field1448 = arg1.g2();
			} else if (var4 == 17) {
				this.field1448 = arg1.g2();
				this.field1446 = arg1.g2();
				this.field1444 = arg1.g2();
				this.field1436 = arg1.g2();
			} else if (var4 >= 30 && var4 < 40) {
				if (this.field1449 == null) {
					this.field1449 = new String[5];
				}
				this.field1449[var4 - 30] = arg1.gjstr();
				if (this.field1449[var4 - 30].equalsIgnoreCase("hidden")) {
					this.field1449[var4 - 30] = null;
				}
			} else if (var4 == 40) {
				int var7 = arg1.g1();
				this.field1437 = new int[var7];
				this.field1459 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					this.field1437[var8] = arg1.g2();
					this.field1459[var8] = arg1.g2();
				}
			} else if (var4 == 60) {
				int var9 = arg1.g1();
				this.field1428 = new int[var9];
				for (int var10 = 0; var10 < var9; var10++) {
					this.field1428[var10] = arg1.g2();
				}
			} else if (var4 == 90) {
				this.field1451 = arg1.g2();
			} else if (var4 == 91) {
				this.field1430 = arg1.g2();
			} else if (var4 == 92) {
				this.field1440 = arg1.g2();
			} else if (var4 == 93) {
				this.field1439 = false;
			} else if (var4 == 95) {
				this.field1442 = arg1.g2();
			} else if (var4 == 97) {
				this.field1435 = arg1.g2();
			} else if (var4 == 98) {
				this.field1433 = arg1.g2();
			} else if (var4 == 99) {
				this.field1447 = true;
			} else if (var4 == 100) {
				this.field1466 = arg1.g1b();
			} else if (var4 == 101) {
				this.field1461 = arg1.g1b() * 5;
			} else if (var4 == 102) {
				this.field1441 = arg1.g2();
			} else if (var4 == 103) {
				this.field1454 = arg1.g2();
			} else if (var4 == 106) {
				this.field1457 = arg1.g2();
				if (this.field1457 == 65535) {
					this.field1457 = -1;
				}
				this.field1462 = arg1.g2();
				if (this.field1462 == 65535) {
					this.field1462 = -1;
				}
				int var11 = arg1.g1();
				this.field1425 = new int[var11 + 1];
				for (int var12 = 0; var12 <= var11; var12++) {
					this.field1425[var12] = arg1.g2();
					if (this.field1425[var12] == 65535) {
						this.field1425[var12] = -1;
					}
				}
			} else if (var4 == 107) {
				this.field1434 = false;
			}
		}
	}

	@ObfuscatedName("SLDUQHOR.a(Z)V")
	public static void unload() {
		field1438 = null;
		field1453 = null;
		field1458 = null;
		field1460 = null;
	}

	@ObfuscatedName("SLDUQHOR.a(I)LLZYQDKJV;")
	public Model getHeadModel() {
		if (this.field1425 != null) {
			NpcType var3 = this.method476();
			return var3 == null ? null : var3.getHeadModel();
		} else if (this.field1428 == null) {
			return null;
		}
		boolean var4 = false;
		for (int var5 = 0; var5 < this.field1428.length; var5++) {
			if (!Model.method360(this.field1428[var5])) {
				var4 = true;
			}
		}
		if (var4) {
			return null;
		}
		Model[] var6 = new Model[this.field1428.length];
		for (int var7 = 0; var7 < this.field1428.length; var7++) {
			var6[var7] = Model.tryGet(this.field1428[var7]);
		}
		Model var8;
		if (var6.length == 1) {
			var8 = var6[0];
		} else {
			var8 = new Model(var6.length, var6, (byte) -89);
		}
		if (this.field1437 != null) {
			for (int var9 = 0; var9 < this.field1437.length; var9++) {
				var8.method373(this.field1437[var9], this.field1459[var9]);
			}
		}
		return var8;
	}

	@ObfuscatedName("SLDUQHOR.b(I)Z")
	public boolean method473() {
		if (this.field1425 == null) {
			return true;
		}
		int var2 = -1;
		if (this.field1457 != -1) {
			VarbitType var3 = VarbitType.field1760[this.field1457];
			int var4 = var3.field1762;
			int var5 = var3.field1763;
			int var6 = var3.field1764;
			int var7 = Client.VARBIT_MASKS[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.field1462 != -1) {
			var2 = varProvider.varps[this.field1462];
		}
		if (var2 < 0 || var2 >= this.field1425.length || this.field1425[var2] == -1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("SLDUQHOR.a(LATJMVOZR;)V")
	public static void unpack(Jagfile arg0) {
		field1460 = new Packet(arg0.read("npc.dat", null));
		Packet var1 = new Packet(arg0.read("npc.idx", null));
		field1452 = var1.g2();
		field1453 = new int[field1452];
		int var2 = 2;
		for (int var3 = 0; var3 < field1452; var3++) {
			field1453[var3] = var2;
			var2 += var1.g2();
		}
		field1458 = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1458[var4] = new NpcType();
		}
	}

	@ObfuscatedName("SLDUQHOR.a(III[I)LLZYQDKJV;")
	public Model method475(int arg0, int arg1, int[] arg3) {
		if (this.field1425 != null) {
			NpcType var5 = this.method476();
			return var5 == null ? null : var5.method475(arg0, arg1, arg3);
		}
		Model var6 = (Model) field1438.get(this.field1431);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.field1429.length; var8++) {
				if (!Model.method360(this.field1429[var8])) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			Model[] var9 = new Model[this.field1429.length];
			for (int var10 = 0; var10 < this.field1429.length; var10++) {
				var9[var10] = Model.tryGet(this.field1429[var10]);
			}
			if (var9.length == 1) {
				var6 = var9[0];
			} else {
				var6 = new Model(var9.length, var9, (byte) -89);
			}
			if (this.field1437 != null) {
				for (int var11 = 0; var11 < this.field1437.length; var11++) {
					var6.method373(this.field1437[var11], this.field1459[var11]);
				}
			}
			var6.createLabelReferences();
			var6.calculateNormals(this.field1466 + 64, this.field1461 + 850, -30, -50, -30, true);
			field1438.put(var6, this.field1431);
		}
		Model var12 = Model.field1190;
		var12.method361(AnimFrame.isNull(arg0) & AnimFrame.isNull(arg1), var6);
		if (arg0 != -1 && arg1 != -1) {
			var12.method368(arg1, arg0, arg3);
		} else if (arg0 != -1) {
			var12.applyTransform(arg0);
		}
		if (this.field1435 != 128 || this.field1433 != 128) {
			var12.method375(this.field1433, this.field1435, this.field1435);
		}
		var12.method363();
		var12.field1226 = null;
		var12.field1225 = null;
		if (this.field1445 == 1) {
			var12.field1227 = true;
		}
		return var12;
	}

	@ObfuscatedName("SLDUQHOR.b(Z)LSLDUQHOR;")
	public NpcType method476() {
		int var2 = -1;
		if (this.field1457 != -1) {
			VarbitType var3 = VarbitType.field1760[this.field1457];
			int var4 = var3.field1762;
			int var5 = var3.field1763;
			int var6 = var3.field1764;
			int var7 = Client.VARBIT_MASKS[var6 - var5];
			var2 = varProvider.varps[var4] >> var5 & var7;
		} else if (this.field1462 != -1) {
			var2 = varProvider.varps[this.field1462];
		}
		return var2 < 0 || var2 >= this.field1425.length || this.field1425[var2] == -1 ? null : get(this.field1425[var2]);
	}

	@ObfuscatedName("SLDUQHOR.c(I)LSLDUQHOR;")
	public static final NpcType get(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if ((long) arg0 == field1458[var1].field1431) {
				return field1458[var1];
			}
		}
		field1464 = (field1464 + 1) % 20;
		NpcType var2 = field1458[field1464] = new NpcType();
		field1460.pos = field1453[arg0];
		var2.field1431 = arg0;
		var2.method470(field1460);
		return var2;
	}
}
