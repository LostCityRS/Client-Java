package jagex3.config;

import deob.*;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

@ObfuscatedName("ia")
public final class LocType extends Linkable2 {

	@ObfuscatedName("dc.yb")
	public static Js5 field698;
	@ObfuscatedName("mc.p")
	public static boolean field1861 = false;
	@ObfuscatedName("a.Y")
	public static Js5 field51;
	@ObfuscatedName("se.p")
	public static LruCache field2788 = new LruCache(64);
	@ObfuscatedName("pc.q")
	public static LruCache field2322 = new LruCache(500);
	@ObfuscatedName("qc.d")
	public static LruCache field2428 = new LruCache(30);
	@ObfuscatedName("rb.Cb")
	public static Model[] field2623 = new Model[4];
	@ObfuscatedName("ia.bc")
	public int field1316 = -1;

	@ObfuscatedName("ia.cc")
	public int[] field1317;

	@ObfuscatedName("ia.ec")
	public int field1319 = -1;

	@ObfuscatedName("ia.fc")
	public int field1320 = -1;

	@ObfuscatedName("ia.ic")
	public int field1323 = 128;

	@ObfuscatedName("ia.jc")
	public boolean field1324 = true;

	@ObfuscatedName("ia.kc")
	public int field1325 = 0;

	@ObfuscatedName("ia.mc")
	public int field1327 = 0;

	@ObfuscatedName("ia.oc")
	public int field1329 = -1;

	@ObfuscatedName("ia.pc")
	public boolean field1330 = false;

	@ObfuscatedName("ia.qc")
	public int field1331 = -1;

	@ObfuscatedName("ia.rc")
	public JagString field1332 = Statics.field2183;

	@ObfuscatedName("ia.tb")
	public int field1282 = 0;

	@ObfuscatedName("ia.ub")
	public int field1283 = 0;

	@ObfuscatedName("ia.vb")
	public boolean field1284 = true;

	@ObfuscatedName("ia.vc")
	public boolean field1336 = false;

	@ObfuscatedName("ia.wb")
	public int field1285 = 0;

	@ObfuscatedName("ia.Fb")
	public int field1294 = -1;

	@ObfuscatedName("ia.Gb")
	public int field1295 = 0;

	@ObfuscatedName("ia.Hb")
	public int field1296 = -1;

	@ObfuscatedName("ia.Bb")
	public int field1290 = 128;

	@ObfuscatedName("ia.Mb")
	public boolean field1301 = false;

	@ObfuscatedName("ia.Pb")
	public boolean field1304 = false;

	@ObfuscatedName("ia.Yb")
	public boolean field1313 = false;

	@ObfuscatedName("ia.Ab")
	public int field1289 = -1;

	@ObfuscatedName("ia.zb")
	public int field1288 = 16;

	@ObfuscatedName("ia.Cb")
	public final JagString[] field1291 = new JagString[5];

	@ObfuscatedName("ia.Nb")
	public int field1302 = 0;

	@ObfuscatedName("ia.Jb")
	public int field1298 = 1;

	@ObfuscatedName("ia.yb")
	public int field1287 = 0;

	@ObfuscatedName("ia.Ob")
	public boolean field1303 = false;

	@ObfuscatedName("ia.Wb")
	public boolean field1311 = true;

	@ObfuscatedName("ia.xb")
	public int field1286 = 1;

	@ObfuscatedName("ia.Vb")
	public int field1310 = 0;

	@ObfuscatedName("ia.Lb")
	public int field1300 = 128;

	@ObfuscatedName("ia.gc")
	public int field1321;

	@ObfuscatedName("ia.Eb")
	public int[] field1293;

	@ObfuscatedName("ia.Kb")
	public int[] field1299;

	@ObfuscatedName("ia.Qb")
	public int[] field1305;

	@ObfuscatedName("ia.Rb")
	public int[] field1306;

	@ObfuscatedName("ia.Tb")
	public int[] field1308;

	@ObfuscatedName("se.a(ILbd;ZLbd;)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		field698 = arg2;
		field1861 = arg1;
		field51 = arg0;
	}

	@ObfuscatedName("fa.b(IB)Lia;")
	public static LocType method389(int arg0) {
		LocType var1 = (LocType) field2788.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field698.method217(arg0, 6);
		LocType var3 = new LocType();
		var3.field1321 = arg0;
		if (var2 != null) {
			var3.method508(new Packet(var2));
		}
		var3.method510();
		if (var3.field1301) {
			var3.field1284 = false;
			var3.field1311 = false;
		}
		field2788.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("qd.c(B)V")
	public static void method859() {
		field2788.method267();
		field2322.method267();
		Statics.field981.method267();
		field2428.method267();
	}

	@ObfuscatedName("ia.a(IIIIIBI)Lpa;")
	public Model method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var7;
		if (this.field1305 == null) {
			var7 = (this.field1321 << 10) + arg2;
		} else {
			var7 = (this.field1321 << 10) + (arg4 << 3) + arg2;
		}
		Model var9 = (Model) Statics.field981.method263(var7);
		if (var9 == null) {
			var9 = this.method511(!this.field1303, false, arg2, arg4);
			if (var9 == null) {
				return null;
			}
			Statics.field981.method262(var7, var9);
		}
		if (this.field1313 || this.field1303) {
			var9 = new Model(var9, this.field1313, this.field1303);
		}
		if (this.field1313) {
			int var10 = (arg0 + arg5 + arg1 + arg3) / 4;
			for (int var11 = 0; var11 < var9.field2208; var11++) {
				int var12 = var9.field2229[var11];
				int var13 = var9.field2203[var11];
				int var14 = arg3 + (arg5 - arg3) * (var12 + 64) / 128;
				int var15 = arg1 + (arg0 - arg1) * (var12 + 64) / 128;
				int var16 = (var13 + 64) * (var15 - var14) / 128 + var14;
				var9.field2228[var11] += var16 - var10;
			}
		}
		return var9;
	}

	@ObfuscatedName("ia.b(B)Z")
	public boolean method506() {
		if (this.field1317 == null) {
			return this.field1296 != -1 || this.field1306 != null;
		}
		for (int var1 = 0; var1 < this.field1317.length; var1++) {
			if (this.field1317[var1] != -1) {
				LocType var2 = method389(this.field1317[var1]);
				if (var2.field1296 != -1 || var2.field1306 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ia.a(Lba;I)V")
	public void method508(Packet arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method513(arg0, var2);
		}
	}

	@ObfuscatedName("ia.c(Z)V")
	public void method510() {
		if (this.field1329 == -1) {
			this.field1329 = 0;
			if (this.field1308 != null && (this.field1305 == null || this.field1305[0] == 10)) {
				this.field1329 = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.field1291[var1] != null) {
					this.field1329 = 1;
				}
			}
		}
		if (this.field1316 == -1) {
			this.field1316 = this.field1284 ? 1 : 0;
		}
	}

	@ObfuscatedName("ia.a(ZBZII)Lpa;")
	public Model method511(boolean arg0, boolean arg1, int arg2, int arg3) {
		Model var5 = null;
		if (this.field1305 == null) {
			if (arg3 != 10) {
				return null;
			}
			if (this.field1308 == null) {
				return null;
			}
			boolean var6 = arg2 > 3 ^ this.field1336;
			int var7 = this.field1308.length;
			for (int var8 = 0; var8 < var7; var8++) {
				int var9 = this.field1308[var8];
				if (var6) {
					var9 += 65536;
				}
				var5 = (Model) field2322.method263((long) var9);
				if (var5 == null) {
					var5 = Model.method798(field51, var9 & 0xFFFF);
					if (var5 == null) {
						return null;
					}
					if (var6) {
						var5.method786();
					}
					field2322.method262((long) var9, var5);
				}
				if (var7 > 1) {
					field2623[var8] = var5;
				}
			}
			if (var7 > 1) {
				var5 = new Model(field2623, var7);
			}
		} else {
			int var10 = -1;
			for (int var11 = 0; var11 < this.field1305.length; var11++) {
				if (this.field1305[var11] == arg3) {
					var10 = var11;
					break;
				}
			}
			if (var10 == -1) {
				return null;
			}
			int var12 = this.field1308[var10];
			boolean var13 = this.field1336 ^ arg2 > 3;
			if (var13) {
				var12 += 65536;
			}
			var5 = (Model) field2322.method263((long) var12);
			if (var5 == null) {
				var5 = Model.method798(field51, var12 & 0xFFFF);
				if (var5 == null) {
					return null;
				}
				if (var13) {
					var5.method786();
				}
				field2322.method262((long) var12, var5);
			}
		}
		boolean var14;
		if (this.field1290 == 128 && this.field1323 == 128 && this.field1300 == 128) {
			var14 = false;
		} else {
			var14 = true;
		}
		boolean var15;
		if (this.field1283 == 0 && this.field1302 == 0 && this.field1287 == 0) {
			var15 = false;
		} else {
			var15 = true;
		}
		Model var16 = new Model(var5, arg2 == 0 && !var14 && !var15, this.field1299 == null, true);
		int var17 = arg2 & 0x3;
		if (var17 == 1) {
			var16.method781();
		} else if (var17 == 2) {
			var16.method787();
		} else if (var17 == 3) {
			var16.method792();
		}
		if (this.field1299 != null) {
			for (int var18 = 0; var18 < this.field1299.length; var18++) {
				var16.method771(this.field1299[var18], this.field1293[var18]);
			}
		}
		if (var14) {
			var16.method789(this.field1290, this.field1323, this.field1300);
		}
		if (var15) {
			var16.method796(this.field1283, this.field1302, this.field1287);
		}
		if (arg1) {
			var16.method778();
		}
		var16.method770(this.field1310 + 64, 768 - -(this.field1327 * 5), -50, -10, -50, arg0);
		return var16;
	}

	@ObfuscatedName("ia.a(IIIIIILhe;II)Lpa;")
	public Model method512(int arg0, int arg1, int arg2, int arg3, int arg4, SeqType arg5, int arg6, int arg7) {
		long var9;
		if (this.field1305 == null) {
			var9 = (this.field1321 << 10) + arg4;
		} else {
			var9 = (this.field1321 << 10) + (arg3 << 3) + arg4;
		}
		Model var11 = (Model) field2428.method263(var9);
		if (var11 == null) {
			var11 = this.method511(true, true, arg4, arg3);
			if (var11 == null) {
				return null;
			}
			field2428.method262(var9, var11);
		}
		if (arg5 == null && !this.field1313) {
			return var11;
		}
		Model var12;
		if (arg5 == null) {
			var12 = var11.method785(true);
		} else {
			var12 = arg5.method488(arg2, var11, arg4);
		}
		if (this.field1313) {
			int var13 = (arg0 + arg1 + arg6 + arg7) / 4;
			for (int var14 = 0; var14 < var12.field2208; var14++) {
				int var15 = var12.field2203[var14];
				int var16 = var12.field2229[var14];
				int var17 = (arg1 - arg0) * (var16 + 64) / 128 + arg0;
				int var18 = (arg7 - arg6) * (var16 + 64) / 128 + arg6;
				int var19 = (var15 + 64) * (-var17 + var18) / 128 + var17;
				var12.field2228[var14] += var19 - var13;
			}
		}
		return var12;
	}

	@ObfuscatedName("ia.a(Lba;II)V")
	public void method513(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var11 = arg0.method144();
			if (var11 > 0) {
				if (this.field1308 == null || field1861) {
					this.field1305 = new int[var11];
					this.field1308 = new int[var11];
					for (int var12 = 0; var12 < var11; var12++) {
						this.field1308[var12] = arg0.method145();
						this.field1305[var12] = arg0.method144();
					}
				} else {
					arg0.pos += var11 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.field1332 = arg0.method140();
		} else if (arg1 == 5) {
			int var9 = arg0.method144();
			if (var9 > 0) {
				if (this.field1308 == null || field1861) {
					this.field1305 = null;
					this.field1308 = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						this.field1308[var10] = arg0.method145();
					}
				} else {
					arg0.pos += var9 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.field1286 = arg0.method144();
		} else if (arg1 == 15) {
			this.field1298 = arg0.method144();
		} else if (arg1 == 17) {
			this.field1284 = false;
		} else if (arg1 == 18) {
			this.field1311 = false;
		} else if (arg1 == 19) {
			this.field1329 = arg0.method144();
		} else if (arg1 == 21) {
			this.field1313 = true;
		} else if (arg1 == 22) {
			this.field1303 = true;
		} else if (arg1 == 23) {
			this.field1304 = true;
		} else if (arg1 == 24) {
			this.field1289 = arg0.method145();
			if (this.field1289 == 65535) {
				this.field1289 = -1;
			}
		} else if (arg1 == 28) {
			this.field1288 = arg0.method144();
		} else if (arg1 == 29) {
			this.field1310 = arg0.method184();
		} else if (arg1 == 39) {
			this.field1327 = arg0.method184() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field1291[arg1 - 30] = arg0.method140();
			if (this.field1291[arg1 - 30].method14(Statics.field2928)) {
				this.field1291[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var7 = arg0.method144();
			this.field1299 = new int[var7];
			this.field1293 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1299[var8] = arg0.method145();
				this.field1293[var8] = arg0.method145();
			}
		} else if (arg1 == 60) {
			this.field1294 = arg0.method145();
		} else if (arg1 == 62) {
			this.field1336 = true;
		} else if (arg1 == 64) {
			this.field1324 = false;
		} else if (arg1 == 65) {
			this.field1290 = arg0.method145();
		} else if (arg1 == 66) {
			this.field1323 = arg0.method145();
		} else if (arg1 == 67) {
			this.field1300 = arg0.method145();
		} else if (arg1 == 68) {
			this.field1320 = arg0.method145();
		} else if (arg1 == 69) {
			this.field1295 = arg0.method144();
		} else if (arg1 == 70) {
			this.field1283 = arg0.method139();
		} else if (arg1 == 71) {
			this.field1302 = arg0.method139();
		} else if (arg1 == 72) {
			this.field1287 = arg0.method139();
		} else if (arg1 == 73) {
			this.field1330 = true;
		} else if (arg1 == 74) {
			this.field1301 = true;
		} else if (arg1 == 75) {
			this.field1316 = arg0.method144();
		} else if (arg1 == 77) {
			this.field1331 = arg0.method145();
			if (this.field1331 == 65535) {
				this.field1331 = -1;
			}
			this.field1319 = arg0.method145();
			if (this.field1319 == 65535) {
				this.field1319 = -1;
			}
			int var5 = arg0.method144();
			this.field1317 = new int[var5 + 1];
			for (int var6 = 0; var6 <= var5; var6++) {
				this.field1317[var6] = arg0.method145();
				if (this.field1317[var6] == 65535) {
					this.field1317[var6] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.field1296 = arg0.method145();
			this.field1285 = arg0.method144();
		} else if (arg1 == 79) {
			this.field1282 = arg0.method145();
			this.field1325 = arg0.method145();
			this.field1285 = arg0.method144();
			int var3 = arg0.method144();
			this.field1306 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1306[var4] = arg0.method145();
			}
		}
	}

	@ObfuscatedName("ia.a(II)Z")
	public boolean method515(int arg0) {
		if (this.field1305 != null) {
			for (int var2 = 0; var2 < this.field1305.length; var2++) {
				if (this.field1305[var2] == arg0) {
					return field51.method218(this.field1308[var2] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.field1308 == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.field1308.length; var4++) {
				var3 &= field51.method218(this.field1308[var4] & 0xFFFF, 0);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ia.f(I)Lia;")
	public LocType method516() {
		int var1 = -1;
		if (this.field1331 != -1) {
			var1 = Statics.method480(this.field1331);
		} else if (this.field1319 != -1) {
			var1 = Statics.field2803[this.field1319];
		}
		return var1 < 0 || this.field1317.length <= var1 || this.field1317[var1] == -1 ? null : method389(this.field1317[var1]);
	}

	@ObfuscatedName("ia.c(B)Z")
	public boolean method517() {
		if (this.field1308 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1308.length; var2++) {
			var1 &= field51.method218(this.field1308[var2] & 0xFFFF, 0);
		}
		return var1;
	}
}
