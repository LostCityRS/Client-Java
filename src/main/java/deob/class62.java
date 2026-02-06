package deob;

@ObfuscatedName("j")
public final class class62 extends class13 {

	@ObfuscatedName("j.ab")
	public int field1385 = -1;

	@ObfuscatedName("j.ac")
	public static class32 field1437 = field1436;

	@ObfuscatedName("j.bb")
	public static class82 field1386 = null;

	@ObfuscatedName("j.bc")
	public static byte[] field1438 = new byte[520];

	@ObfuscatedName("j.cc")
	public static class32 field1439 = field1432;

	@ObfuscatedName("j.db")
	public int field1388 = -1;

	@ObfuscatedName("j.eb")
	public static boolean field1389 = false;

	@ObfuscatedName("j.fb")
	public static int[] field1390 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("j.gb")
	public int field1391 = 2000;

	@ObfuscatedName("j.hb")
	public boolean field1392 = false;

	@ObfuscatedName("j.kb")
	public int field1395 = -1;

	@ObfuscatedName("j.lb")
	public static int field1396 = 0;

	@ObfuscatedName("j.ob")
	public int field1399;

	@ObfuscatedName("j.pb")
	public int field1400 = -1;

	@ObfuscatedName("j.rb")
	public int field1402 = 128;

	@ObfuscatedName("j.tb")
	public static int field1404 = 0;

	@ObfuscatedName("j.ub")
	public int field1405 = -1;

	@ObfuscatedName("j.vb")
	public static class63 field1406 = new class63(64);

	@ObfuscatedName("j.wb")
	public int field1407;

	@ObfuscatedName("j.H")
	public static class32 field1366 = class73.method593("Schlie-8en", true);

	@ObfuscatedName("j.Hb")
	public static int[] field1418 = new int[2048];

	@ObfuscatedName("j.Qb")
	public static class32 field1427 = class73.method593("Your friend list is full)3 Max of 100 for free users)1 and 200 for members", true);

	@ObfuscatedName("j.Cb")
	public static class32 field1413 = field1427;

	@ObfuscatedName("j.Vb")
	public static class32 field1432 = class73.method593("wave:", true);

	@ObfuscatedName("j.Wb")
	public static class32 field1433 = field1432;

	@ObfuscatedName("j.Yb")
	public static class32 field1435 = class73.method593("auf einer freien Welt zu spielen)3", true);

	@ObfuscatedName("j.Zb")
	public static class32 field1436 = class73.method593("level)2", true);

	@ObfuscatedName("j.J")
	public int field1368 = -1;

	@ObfuscatedName("j.P")
	public int field1374 = 0;

	@ObfuscatedName("j.Z")
	public int field1384 = 0;

	@ObfuscatedName("j.Y")
	public int field1383 = 0;

	@ObfuscatedName("j.K")
	public int field1369 = 128;

	@ObfuscatedName("j.U")
	public int field1379 = 0;

	@ObfuscatedName("j.Ab")
	public int field1411 = -1;

	@ObfuscatedName("j.M")
	public int field1371 = 128;

	@ObfuscatedName("j.Fb")
	public int field1416 = 0;

	@ObfuscatedName("j.V")
	public int field1380 = -1;

	@ObfuscatedName("j.Q")
	public int field1375 = 1;

	@ObfuscatedName("j.Nb")
	public int field1424 = -1;

	@ObfuscatedName("j.Ob")
	public int field1425 = 0;

	@ObfuscatedName("j.zb")
	public class32[] field1410 = new class32[] { null, null, class28.field507, null, null };

	@ObfuscatedName("j.Gb")
	public int field1417 = -1;

	@ObfuscatedName("j.Jb")
	public int field1420 = -1;

	@ObfuscatedName("j.Db")
	public int field1414 = -1;

	@ObfuscatedName("j.W")
	public int field1381 = 0;

	@ObfuscatedName("j.R")
	public int field1376 = 0;

	@ObfuscatedName("j.yb")
	public int field1409 = 0;

	@ObfuscatedName("j.Rb")
	public class32[] field1428 = new class32[] { null, null, null, null, class115.field2739 };

	@ObfuscatedName("j.Sb")
	public class32 field1429 = class106.field2525;

	@ObfuscatedName("j.Tb")
	public int field1430 = 0;

	@ObfuscatedName("j.Pb")
	public int field1426 = 0;

	@ObfuscatedName("j.Lb")
	public static int field1422;

	@ObfuscatedName("j.N")
	public int[] field1372;

	@ObfuscatedName("j.Bb")
	public int[] field1412;

	@ObfuscatedName("j.Xb")
	public static class51[] field1434;

	@ObfuscatedName("j.I")
	public short[] field1367;

	@ObfuscatedName("j.T")
	public short[] field1378;

	@ObfuscatedName("j.Kb")
	public short[] field1421;

	@ObfuscatedName("j.Ub")
	public short[] field1431;

	@ObfuscatedName("j.a(IZ)V")
	public static void method468(boolean arg0) {
		for (int var1 = 0; var1 < class102.field2397; var1++) {
			class111 var2 = class14.field230[class15.field313[var1]];
			int var3 = (class15.field313[var1] << 14) + 536870912;
			if (var2 != null && var2.method578() && arg0 == var2.field2595.field2243 && var2.field2595.method755()) {
				int var4 = var2.field2747 >> 7;
				int var5 = var2.field2698 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field2711 == 1 && (var2.field2747 & 0x7F) == 64 && (var2.field2698 & 0x7F) == 64) {
						if (class36.field789[var4][var5] == class159.field3658) {
							continue;
						}
						class36.field789[var4][var5] = class159.field3658;
					}
					if (!var2.field2595.field2188) {
						var3 += Integer.MIN_VALUE;
					}
					class159.field3657.method1146(class43.field989, var2.field2747, var2.field2698, class83.method653(class43.field989, var2.field2711 * 64 + var2.field2747 - 64, (var2.field2711 - 1) * 64 + var2.field2698), (var2.field2711 - 1) * 64 + 60, var2, var2.field2745, var3, var2.field2735);
				}
			}
		}
	}

	@ObfuscatedName("j.a(Lec;Lea;ZLec;)[Lh;")
	public static class49[] method474(class32 arg0, class30 arg1, class32 arg2) {
		int var3 = arg1.method201(arg0);
		int var4 = arg1.method215(arg2, var3);
		return class94.method739(var4, arg1, var3);
	}

	@ObfuscatedName("j.a(IIIII)V")
	public static void method476(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < class133.field3081; var4++) {
			if (class144.field3287[var4] + class28.field512[var4] > arg0 && arg2 + arg0 > class144.field3287[var4] && class124.field2892[var4] + class20.field366[var4] > arg1 && class124.field2892[var4] < arg1 + arg3) {
				class145.field3297[var4] = true;
			}
		}
	}

	@ObfuscatedName("j.a(IIB)I")
	public static int method478(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		return class149.field3372 != null && var2 == class149.field3372.field3324 ? class106.field2529.field1568 * 99 / (class106.field2529.field1586.length - class149.field3372.field2587) + 1 : 0;
	}

	@ObfuscatedName("j.b(B)V")
	public static void method480() {
		field1406 = null;
		field1432 = null;
		field1427 = null;
		field1435 = null;
		field1439 = null;
		field1434 = null;
		field1366 = null;
		field1438 = null;
		field1433 = null;
		field1437 = null;
		field1413 = null;
		field1436 = null;
		field1390 = null;
		field1418 = null;
	}

	@ObfuscatedName("j.a(BZ)Z")
	public boolean method467(boolean arg0) {
		int var2 = this.field1405;
		int var3 = this.field1395;
		if (arg0) {
			var3 = this.field1368;
			var2 = this.field1424;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!class33.field692.method213(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !class33.field692.method213(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("j.b(IZ)Lp;")
	public class104 method469(boolean arg0) {
		int var2 = this.field1385;
		int var3 = this.field1417;
		int var4 = this.field1380;
		if (arg0) {
			var3 = this.field1414;
			var4 = this.field1420;
			var2 = this.field1400;
		}
		if (var2 == -1) {
			return null;
		}
		class104 var5 = class104.method840(class33.field692, var2);
		if (var3 != -1) {
			class104 var6 = class104.method840(class33.field692, var3);
			if (var4 == -1) {
				class104[] var9 = new class104[] { var5, var6 };
				var5 = new class104(var9, 2);
			} else {
				class104 var7 = class104.method840(class33.field692, var4);
				class104[] var8 = new class104[] { var5, var6, var7 };
				var5 = new class104(var8, 3);
			}
		}
		if (!arg0 && this.field1430 != 0) {
			var5.method834(0, this.field1430, 0);
		}
		if (arg0 && this.field1379 != 0) {
			var5.method834(0, this.field1379, 0);
		}
		if (this.field1421 != null) {
			for (int var10 = 0; var10 < this.field1421.length; var10++) {
				var5.method833(this.field1421[var10], this.field1431[var10]);
			}
		}
		if (this.field1378 != null) {
			for (int var11 = 0; var11 < this.field1378.length; var11++) {
				var5.method853(this.field1378[var11], this.field1367[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("j.b(II)Lod;")
	public class101 method470(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.field1372[var3] <= arg0 && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return class146.method1092(var2).method470(1);
			}
		}
		class101 var4 = (class101) class48.field1125.method485((long) this.field1399);
		if (var4 != null) {
			return var4;
		}
		class104 var5 = class104.method840(class33.field692, this.field1407);
		if (var5 == null) {
			return null;
		}
		if (this.field1371 != 128 || this.field1402 != 128 || this.field1369 != 128) {
			var5.method855(this.field1371, this.field1402, this.field1369);
		}
		if (this.field1421 != null) {
			for (int var6 = 0; var6 < this.field1421.length; var6++) {
				var5.method833(this.field1421[var6], this.field1431[var6]);
			}
		}
		if (this.field1378 != null) {
			for (int var7 = 0; var7 < this.field1378.length; var7++) {
				var5.method853(this.field1378[var7], this.field1367[var7]);
			}
		}
		class101 var8 = var5.method847(this.field1381 + 64, 768 - -this.field1383, -50, -10, -50);
		var8.field2322 = true;
		class48.field1125.method484((long) this.field1399, var8);
		return var8;
	}

	@ObfuscatedName("j.a(BI)Lj;")
	public class62 method471(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1372[var3] && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return class146.method1092(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("j.a(B)V")
	public void method472() {
	}

	@ObfuscatedName("j.c(IZ)Lp;")
	public class104 method473(boolean arg0) {
		int var2 = this.field1405;
		int var3 = this.field1395;
		if (arg0) {
			var3 = this.field1368;
			var2 = this.field1424;
		}
		if (var2 == -1) {
			return null;
		}
		class104 var4 = class104.method840(class33.field692, var2);
		if (var3 != -1) {
			class104 var5 = class104.method840(class33.field692, var3);
			class104[] var6 = new class104[] { var4, var5 };
			var4 = new class104(var6, 2);
		}
		if (this.field1421 != null) {
			for (int var7 = 0; var7 < this.field1421.length; var7++) {
				var4.method833(this.field1421[var7], this.field1431[var7]);
			}
		}
		if (this.field1378 != null) {
			for (int var8 = 0; var8 < this.field1378.length; var8++) {
				var4.method853(this.field1378[var8], this.field1367[var8]);
			}
		}
		return var4;
	}

	@ObfuscatedName("j.a(Ljd;I)V")
	public void method475(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method477(arg0, var2);
		}
	}

	@ObfuscatedName("j.a(BLjd;I)V")
	public void method477(class66 arg0, int arg1) {
		if (arg1 == 1) {
			this.field1407 = arg0.method531();
		} else if (arg1 == 2) {
			this.field1429 = arg0.method555();
		} else if (arg1 == 4) {
			this.field1391 = arg0.method531();
		} else if (arg1 == 5) {
			this.field1426 = arg0.method531();
		} else if (arg1 == 6) {
			this.field1416 = arg0.method531();
		} else if (arg1 == 7) {
			this.field1384 = arg0.method531();
			if (this.field1384 > 32767) {
				this.field1384 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.field1376 = arg0.method531();
			if (this.field1376 > 32767) {
				this.field1376 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.field1409 = 1;
			return;
		} else if (arg1 == 12) {
			this.field1375 = arg0.method538();
		} else if (arg1 == 16) {
			this.field1392 = true;
			return;
		} else if (arg1 == 23) {
			this.field1385 = arg0.method531();
			this.field1430 = arg0.method532();
			return;
		} else if (arg1 == 24) {
			this.field1417 = arg0.method531();
			return;
		} else {
			if (arg1 == 25) {
				this.field1400 = arg0.method531();
				this.field1379 = arg0.method532();
			} else if (arg1 == 26) {
				this.field1414 = arg0.method531();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.field1410[arg1 - 30] = arg0.method555();
				if (this.field1410[arg1 - 30].method271(class159.field3655)) {
					this.field1410[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 != 41) {
						if (arg1 == 78) {
							this.field1380 = arg0.method531();
							return;
						}
						if (arg1 != 79) {
							if (arg1 != 90) {
								if (arg1 == 91) {
									this.field1424 = arg0.method531();
									return;
								}
								if (arg1 == 92) {
									this.field1395 = arg0.method531();
									return;
								}
								if (arg1 == 93) {
									this.field1368 = arg0.method531();
									return;
								}
								if (arg1 == 95) {
									this.field1374 = arg0.method531();
									return;
								}
								if (arg1 != 97) {
									if (arg1 == 98) {
										this.field1388 = arg0.method531();
										return;
									}
									if (arg1 >= 100 && arg1 < 110) {
										if (this.field1412 == null) {
											this.field1372 = new int[10];
											this.field1412 = new int[10];
										}
										this.field1412[arg1 - 100] = arg0.method531();
										this.field1372[arg1 - 100] = arg0.method531();
										return;
									}
									if (arg1 == 110) {
										this.field1371 = arg0.method531();
										return;
									}
									if (arg1 == 111) {
										this.field1402 = arg0.method531();
										return;
									}
									if (arg1 != 112) {
										if (arg1 == 113) {
											this.field1381 = arg0.method544();
											return;
										}
										if (arg1 == 114) {
											this.field1383 = arg0.method544() * 5;
										} else if (arg1 == 115) {
											this.field1425 = arg0.method532();
											return;
										}
										return;
									}
									this.field1369 = arg0.method531();
									return;
								}
								this.field1411 = arg0.method531();
								return;
							}
							this.field1405 = arg0.method531();
							return;
						}
						this.field1420 = arg0.method531();
						return;
					}
					int var3 = arg0.method532();
					this.field1367 = new short[var3];
					this.field1378 = new short[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field1378[var4] = (short) arg0.method531();
						this.field1367[var4] = (short) arg0.method531();
					}
					return;
				}
				int var5 = arg0.method532();
				this.field1431 = new short[var5];
				this.field1421 = new short[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1421[var6] = (short) arg0.method531();
					this.field1431[var6] = (short) arg0.method531();
				}
				return;
			} else {
				this.field1428[arg1 - 35] = arg0.method555();
				return;
			}
			return;
		}
	}

	@ObfuscatedName("j.a(ZI)Z")
	public boolean method479(boolean arg0) {
		int var2 = this.field1385;
		int var3 = this.field1417;
		int var4 = this.field1380;
		if (arg0) {
			var4 = this.field1420;
			var3 = this.field1414;
			var2 = this.field1400;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!class33.field692.method213(var2, 0)) {
			var5 = false;
		}
		if (var3 != -1 && !class33.field692.method213(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !class33.field692.method213(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("j.a(Lj;Lj;I)V")
	public void method481(class62 arg0, class62 arg1) {
		this.field1374 = arg1.field1374;
		this.field1421 = arg1.field1421;
		this.field1375 = arg0.field1375;
		this.field1392 = arg0.field1392;
		this.field1429 = arg0.field1429;
		this.field1378 = arg1.field1378;
		this.field1409 = 1;
		this.field1376 = arg1.field1376;
		this.field1407 = arg1.field1407;
		this.field1391 = arg1.field1391;
		this.field1416 = arg1.field1416;
		this.field1426 = arg1.field1426;
		this.field1431 = arg1.field1431;
		this.field1367 = arg1.field1367;
		this.field1384 = arg1.field1384;
	}

	@ObfuscatedName("j.c(II)Lp;")
	public class104 method482(int arg0) {
		if (this.field1412 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1372[var3] && this.field1372[var3] != 0) {
					var2 = this.field1412[var3];
				}
			}
			if (var2 != -1) {
				return class146.method1092(var2).method482(1);
			}
		}
		class104 var4 = class104.method840(class33.field692, this.field1407);
		if (var4 == null) {
			return null;
		}
		if (this.field1371 != 128 || this.field1402 != 128 || this.field1369 != 128) {
			var4.method855(this.field1371, this.field1402, this.field1369);
		}
		if (this.field1421 != null) {
			for (int var5 = 0; var5 < this.field1421.length; var5++) {
				var4.method833(this.field1421[var5], this.field1431[var5]);
			}
		}
		if (this.field1378 != null) {
			for (int var6 = 0; var6 < this.field1378.length; var6++) {
				var4.method853(this.field1378[var6], this.field1367[var6]);
			}
		}
		return var4;
	}
}
