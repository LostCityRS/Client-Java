package deob;

@ObfuscatedName("he")
public final class ModelUnlit extends ModelSource {

	@ObfuscatedName("he.ab")
	public int[] field1514;

	@ObfuscatedName("he.bb")
	public short field1515;

	@ObfuscatedName("he.cb")
	public byte[] field1516;

	@ObfuscatedName("he.db")
	public byte[] field1517;

	@ObfuscatedName("he.eb")
	public int[] field1518;

	@ObfuscatedName("he.fb")
	public short field1519;

	@ObfuscatedName("he.gb")
	public short field1520;

	@ObfuscatedName("he.hb")
	public byte[] field1521;

	@ObfuscatedName("he.ib")
	public int[] field1522;

	@ObfuscatedName("he.jb")
	public short field1523;

	@ObfuscatedName("he.n")
	public short[] field1475;

	@ObfuscatedName("he.o")
	public int[] field1476;

	@ObfuscatedName("he.p")
	public short[] field1477;

	@ObfuscatedName("he.q")
	public byte[] field1478;

	@ObfuscatedName("he.r")
	public short field1479;

	@ObfuscatedName("he.s")
	public byte[] field1480;

	@ObfuscatedName("he.t")
	public static final int[] field1481 = Pix3D.field3359;

	@ObfuscatedName("he.u")
	public short[] field1482;

	@ObfuscatedName("he.v")
	public int[] field1483;

	@ObfuscatedName("he.w")
	public short[] field1484;

	@ObfuscatedName("he.E")
	public static final int[] field1492 = new int[10000];

	@ObfuscatedName("he.M")
	public static int field1500 = 0;

	@ObfuscatedName("he.V")
	public static final int[] field1509 = Pix3D.field3354;

	@ObfuscatedName("he.I")
	public static final int[] field1496 = new int[10000];

	@ObfuscatedName("he.x")
	public int field1485 = 0;

	@ObfuscatedName("he.D")
	public boolean field1491 = false;

	@ObfuscatedName("he.B")
	public int field1489 = 0;

	@ObfuscatedName("he.T")
	public byte field1507 = 0;

	@ObfuscatedName("he.L")
	public int field1499;

	@ObfuscatedName("he.F")
	public byte[] field1493;

	@ObfuscatedName("he.W")
	public byte[] field1510;

	@ObfuscatedName("he.P")
	public short[] field1503;

	@ObfuscatedName("he.A")
	public byte[] field1488;

	@ObfuscatedName("he.S")
	public int[] field1506;

	@ObfuscatedName("he.X")
	public int[] field1511;

	@ObfuscatedName("he.R")
	public int[] field1505;

	@ObfuscatedName("he.N")
	public short[] field1501;

	@ObfuscatedName("he.H")
	public short[] field1495;

	@ObfuscatedName("he.U")
	public short[] field1508;

	@ObfuscatedName("he.Z")
	public byte[] field1513;

	@ObfuscatedName("he.O")
	public byte[] field1502;

	@ObfuscatedName("he.z")
	public int[][] field1487;

	@ObfuscatedName("he.y")
	public int[][] field1486;

	@ObfuscatedName("he.J")
	public class93[] field1497;

	@ObfuscatedName("he.Y")
	public class200[] field1512;

	@ObfuscatedName("he.C")
	public class93[] field1490;

	@ObfuscatedName("he.K")
	public short field1498;

	@ObfuscatedName("he.G")
	public short field1494;

	@ObfuscatedName("he.Q")
	public short field1504;

	@ObfuscatedName("he.a([[III)I")
	public static int method543(int[][] arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg2 >> 7;
		if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2 & 0x7F;
		int var7 = arg0[var3][var4] * (128 - var5) + arg0[var3 + 1][var4] * var5 >> 7;
		int var8 = arg0[var3][var4 + 1] * (128 - var5) + arg0[var3 + 1][var4 + 1] * var5 >> 7;
		return var7 * (128 - var6) + var8 * var6 >> 7;
	}

	@ObfuscatedName("he.a(Lnb;II)Lhe;")
	public static ModelUnlit load(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(0, arg1);
		return var2 == null ? null : new ModelUnlit(var2);
	}

	public ModelUnlit() {
	}

	public ModelUnlit(byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method556(arg0);
		} else {
			this.method571(arg0);
		}
	}

	public ModelUnlit(ModelUnlit[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.field1489 = 0;
		this.field1485 = 0;
		this.field1499 = 0;
		this.field1507 = -1;
		for (int var9 = 0; var9 < arg1; var9++) {
			ModelUnlit var10 = arg0[var9];
			if (var10 != null) {
				this.field1489 += var10.field1489;
				this.field1485 += var10.field1485;
				this.field1499 += var10.field1499;
				if (var10.field1493 == null) {
					if (this.field1507 == -1) {
						this.field1507 = var10.field1507;
					}
					if (this.field1507 != var10.field1507) {
						var4 = true;
					}
				} else {
					var4 = true;
				}
				var3 |= var10.field1480 != null;
				var5 |= var10.field1510 != null;
				var6 |= var10.field1514 != null;
				var7 |= var10.field1503 != null;
				var8 |= var10.field1488 != null;
			}
		}
		this.field1522 = new int[this.field1489];
		this.field1476 = new int[this.field1489];
		this.field1506 = new int[this.field1489];
		this.field1483 = new int[this.field1489];
		this.field1511 = new int[this.field1485];
		this.field1518 = new int[this.field1485];
		this.field1505 = new int[this.field1485];
		if (var3) {
			this.field1480 = new byte[this.field1485];
		}
		if (var4) {
			this.field1493 = new byte[this.field1485];
		}
		if (var5) {
			this.field1510 = new byte[this.field1485];
		}
		if (var6) {
			this.field1514 = new int[this.field1485];
		}
		if (var7) {
			this.field1503 = new short[this.field1485];
		}
		if (var8) {
			this.field1488 = new byte[this.field1485];
		}
		this.field1482 = new short[this.field1485];
		if (this.field1499 > 0) {
			this.field1521 = new byte[this.field1499];
			this.field1501 = new short[this.field1499];
			this.field1495 = new short[this.field1499];
			this.field1477 = new short[this.field1499];
			this.field1484 = new short[this.field1499];
			this.field1508 = new short[this.field1499];
			this.field1475 = new short[this.field1499];
			this.field1478 = new byte[this.field1499];
			this.field1517 = new byte[this.field1499];
			this.field1516 = new byte[this.field1499];
			this.field1513 = new byte[this.field1499];
			this.field1502 = new byte[this.field1499];
		}
		this.field1489 = 0;
		this.field1485 = 0;
		this.field1499 = 0;
		for (int var11 = 0; var11 < arg1; var11++) {
			ModelUnlit var12 = arg0[var11];
			if (var12 != null) {
				for (int var13 = 0; var13 < var12.field1485; var13++) {
					if (var3 && var12.field1480 != null) {
						this.field1480[this.field1485] = var12.field1480[var13];
					}
					if (var4) {
						if (var12.field1493 == null) {
							this.field1493[this.field1485] = var12.field1507;
						} else {
							this.field1493[this.field1485] = var12.field1493[var13];
						}
					}
					if (var5 && var12.field1510 != null) {
						this.field1510[this.field1485] = var12.field1510[var13];
					}
					if (var6 && var12.field1514 != null) {
						this.field1514[this.field1485] = var12.field1514[var13];
					}
					if (var7) {
						if (var12.field1503 == null) {
							this.field1503[this.field1485] = -1;
						} else {
							this.field1503[this.field1485] = var12.field1503[var13];
						}
					}
					if (var8) {
						if (var12.field1488 == null || var12.field1488[var13] == -1) {
							this.field1488[this.field1485] = -1;
						} else {
							this.field1488[this.field1485] = (byte) (var12.field1488[var13] + this.field1499);
						}
					}
					this.field1482[this.field1485] = var12.field1482[var13];
					this.field1511[this.field1485] = this.method567(var12, var12.field1511[var13]);
					this.field1518[this.field1485] = this.method567(var12, var12.field1518[var13]);
					this.field1505[this.field1485] = this.method567(var12, var12.field1505[var13]);
					this.field1485++;
				}
				for (int var14 = 0; var14 < var12.field1499; var14++) {
					byte var15 = this.field1521[this.field1499] = var12.field1521[var14];
					if (var15 == 0) {
						this.field1501[this.field1499] = (short) this.method567(var12, var12.field1501[var14]);
						this.field1495[this.field1499] = (short) this.method567(var12, var12.field1495[var14]);
						this.field1477[this.field1499] = (short) this.method567(var12, var12.field1477[var14]);
					}
					if (var15 >= 1 && var15 <= 3) {
						this.field1501[this.field1499] = var12.field1501[var14];
						this.field1495[this.field1499] = var12.field1495[var14];
						this.field1477[this.field1499] = var12.field1477[var14];
						this.field1484[this.field1499] = var12.field1484[var14];
						this.field1508[this.field1499] = var12.field1508[var14];
						this.field1475[this.field1499] = var12.field1475[var14];
						this.field1478[this.field1499] = var12.field1478[var14];
						this.field1517[this.field1499] = var12.field1517[var14];
						this.field1516[this.field1499] = var12.field1516[var14];
					}
					if (var15 == 2) {
						this.field1513[this.field1499] = var12.field1513[var14];
						this.field1502[this.field1499] = var12.field1502[var14];
					}
					this.field1499++;
				}
			}
		}
	}

	public ModelUnlit(ModelUnlit arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.field1489 = arg0.field1489;
		this.field1485 = arg0.field1485;
		this.field1499 = arg0.field1499;
		if (arg1) {
			this.field1522 = arg0.field1522;
			this.field1476 = arg0.field1476;
			this.field1506 = arg0.field1506;
		} else {
			this.field1522 = new int[this.field1489];
			this.field1476 = new int[this.field1489];
			this.field1506 = new int[this.field1489];
			for (int var6 = 0; var6 < this.field1489; var6++) {
				this.field1522[var6] = arg0.field1522[var6];
				this.field1476[var6] = arg0.field1476[var6];
				this.field1506[var6] = arg0.field1506[var6];
			}
		}
		if (arg2) {
			this.field1482 = arg0.field1482;
		} else {
			this.field1482 = new short[this.field1485];
			for (int var7 = 0; var7 < this.field1485; var7++) {
				this.field1482[var7] = arg0.field1482[var7];
			}
		}
		if (arg3 || arg0.field1503 == null) {
			this.field1503 = arg0.field1503;
		} else {
			this.field1503 = new short[this.field1485];
			for (int var8 = 0; var8 < this.field1485; var8++) {
				this.field1503[var8] = arg0.field1503[var8];
			}
		}
		this.field1510 = arg0.field1510;
		this.field1511 = arg0.field1511;
		this.field1518 = arg0.field1518;
		this.field1505 = arg0.field1505;
		this.field1480 = arg0.field1480;
		this.field1493 = arg0.field1493;
		this.field1488 = arg0.field1488;
		this.field1507 = arg0.field1507;
		this.field1521 = arg0.field1521;
		this.field1501 = arg0.field1501;
		this.field1495 = arg0.field1495;
		this.field1477 = arg0.field1477;
		this.field1484 = arg0.field1484;
		this.field1508 = arg0.field1508;
		this.field1475 = arg0.field1475;
		this.field1478 = arg0.field1478;
		this.field1517 = arg0.field1517;
		this.field1516 = arg0.field1516;
		this.field1513 = arg0.field1513;
		this.field1502 = arg0.field1502;
		this.field1483 = arg0.field1483;
		this.field1514 = arg0.field1514;
		this.field1487 = arg0.field1487;
		this.field1486 = arg0.field1486;
		this.field1497 = arg0.field1497;
		this.field1512 = arg0.field1512;
		this.field1490 = arg0.field1490;
		this.field1498 = arg0.field1498;
		this.field1523 = arg0.field1523;
	}

	@ObfuscatedName("he.a()Z")
	@Override
	public boolean method544() {
		return true;
	}

	@ObfuscatedName("he.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
	}

	@ObfuscatedName("he.a(II[[I[[IIIIZZ)Lhe;")
	public ModelUnlit method545(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
		this.method561();
		int var8 = arg4 + this.field1515;
		int var9 = arg4 + this.field1520;
		int var10 = arg6 + this.field1504;
		int var11 = arg6 + this.field1479;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var8 < 0 || var9 + 128 >> 7 >= arg2.length || var10 < 0 || var11 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (var8 < 0 || var9 + 128 >> 7 >= arg3.length || var10 < 0 || var11 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			int var12 = var8 >> 7;
			int var13 = var9 + 127 >> 7;
			int var14 = var10 >> 7;
			int var15 = var11 + 127 >> 7;
			if (arg2[var12][var14] == arg5 && arg2[var13][var14] == arg5 && arg2[var12][var15] == arg5 && arg2[var13][var15] == arg5) {
				return this;
			}
		}
		ModelUnlit var16 = new ModelUnlit();
		var16.field1489 = this.field1489;
		var16.field1485 = this.field1485;
		var16.field1499 = this.field1499;
		var16.field1511 = this.field1511;
		var16.field1518 = this.field1518;
		var16.field1505 = this.field1505;
		var16.field1480 = this.field1480;
		var16.field1493 = this.field1493;
		var16.field1510 = this.field1510;
		var16.field1488 = this.field1488;
		var16.field1482 = this.field1482;
		var16.field1503 = this.field1503;
		var16.field1507 = this.field1507;
		var16.field1521 = this.field1521;
		var16.field1501 = this.field1501;
		var16.field1495 = this.field1495;
		var16.field1477 = this.field1477;
		var16.field1484 = this.field1484;
		var16.field1508 = this.field1508;
		var16.field1475 = this.field1475;
		var16.field1478 = this.field1478;
		var16.field1517 = this.field1517;
		var16.field1516 = this.field1516;
		var16.field1513 = this.field1513;
		var16.field1502 = this.field1502;
		var16.field1483 = this.field1483;
		var16.field1514 = this.field1514;
		var16.field1487 = this.field1487;
		var16.field1486 = this.field1486;
		var16.field1498 = this.field1498;
		var16.field1523 = this.field1523;
		var16.field1497 = this.field1497;
		var16.field1512 = this.field1512;
		var16.field1490 = this.field1490;
		if (arg0 == 3) {
			var16.field1522 = Statics.method169(this.field1522);
			var16.field1476 = Statics.method169(this.field1476);
			var16.field1506 = Statics.method169(this.field1506);
		} else {
			var16.field1522 = this.field1522;
			var16.field1476 = new int[var16.field1489];
			var16.field1506 = this.field1506;
		}
		if (arg0 == 1) {
			for (int var17 = 0; var17 < var16.field1489; var17++) {
				int var18 = this.field1522[var17] + arg4;
				int var19 = this.field1506[var17] + arg6;
				int var20 = var18 & 0x7F;
				int var21 = var19 & 0x7F;
				int var22 = var18 >> 7;
				int var23 = var19 >> 7;
				int var24 = arg2[var22][var23] * (128 - var20) + arg2[var22 + 1][var23] * var20 >> 7;
				int var25 = arg2[var22][var23 + 1] * (128 - var20) + arg2[var22 + 1][var23 + 1] * var20 >> 7;
				int var26 = var24 * (128 - var21) + var25 * var21 >> 7;
				var16.field1476[var17] = this.field1476[var17] + var26 - arg5;
			}
		} else if (arg0 == 2) {
			for (int var27 = 0; var27 < var16.field1489; var27++) {
				int var28 = (this.field1476[var27] << 16) / this.field1519;
				if (var28 < arg1) {
					int var29 = this.field1522[var27] + arg4;
					int var30 = this.field1506[var27] + arg6;
					int var31 = var29 & 0x7F;
					int var32 = var30 & 0x7F;
					int var33 = var29 >> 7;
					int var34 = var30 >> 7;
					int var35 = arg2[var33][var34] * (128 - var31) + arg2[var33 + 1][var34] * var31 >> 7;
					int var36 = arg2[var33][var34 + 1] * (128 - var31) + arg2[var33 + 1][var34 + 1] * var31 >> 7;
					int var37 = var35 * (128 - var32) + var36 * var32 >> 7;
					var16.field1476[var27] = this.field1476[var27] + (var37 - arg5) * (arg1 - var28) / arg1;
				} else {
					var16.field1476[var27] = this.field1476[var27];
				}
			}
		} else if (arg0 == 3) {
			int var38 = (arg1 & 0xFF) * 4;
			int var39 = (arg1 >> 8 & 0xFF) * 4;
			this.method562(arg2, arg4, arg5, arg6, var38, var39);
		} else if (arg0 == 4) {
			int var40 = this.field1494 - this.field1519;
			for (int var41 = 0; var41 < this.field1489; var41++) {
				int var42 = this.field1522[var41] + arg4;
				int var43 = this.field1506[var41] + arg6;
				int var44 = var42 & 0x7F;
				int var45 = var43 & 0x7F;
				int var46 = var42 >> 7;
				int var47 = var43 >> 7;
				int var48 = arg3[var46][var47] * (128 - var44) + arg3[var46 + 1][var47] * var44 >> 7;
				int var49 = arg3[var46][var47 + 1] * (128 - var44) + arg3[var46 + 1][var47 + 1] * var44 >> 7;
				int var50 = var48 * (128 - var45) + var49 * var45 >> 7;
				var16.field1476[var41] = this.field1476[var41] + var50 + var40 - arg5;
			}
		} else if (arg0 == 5) {
			int var51 = this.field1494 - this.field1519;
			for (int var52 = 0; var52 < this.field1489; var52++) {
				int var53 = this.field1522[var52] + arg4;
				int var54 = this.field1506[var52] + arg6;
				int var55 = var53 & 0x7F;
				int var56 = var54 & 0x7F;
				int var57 = var53 >> 7;
				int var58 = var54 >> 7;
				int var59 = arg2[var57][var58] * (128 - var55) + arg2[var57 + 1][var58] * var55 >> 7;
				int var60 = arg2[var57][var58 + 1] * (128 - var55) + arg2[var57 + 1][var58 + 1] * var55 >> 7;
				int var61 = var59 * (128 - var56) + var60 * var56 >> 7;
				int var62 = arg3[var57][var58] * (128 - var55) + arg3[var57 + 1][var58] * var55 >> 7;
				int var63 = arg3[var57][var58 + 1] * (128 - var55) + arg3[var57 + 1][var58 + 1] * var55 >> 7;
				int var64 = var62 * (128 - var56) + var63 * var56 >> 7;
				int var65 = var61 - var64;
				var16.field1476[var52] = ((this.field1476[var52] << 8) / var51 * var65 >> 8) - (arg5 - var61);
			}
		}
		this.field1491 = false;
		return var16;
	}

	@ObfuscatedName("he.a(IIIII)Lcg;")
	public ModelLit light(int arg0, int arg1, int arg2, int arg3, int arg4) {
		return new SoftwareModelLit(this, arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("he.b(IIIII)Lle;")
	public SoftwareModelLit method547(int arg0, int arg1) {
		return new SoftwareModelLit(this, arg0, arg1, -50, -10, -50);
	}

	@ObfuscatedName("he.c()V")
	public void method548() {
		if (this.field1497 != null) {
			return;
		}
		this.field1497 = new class93[this.field1489];
		for (int var1 = 0; var1 < this.field1489; var1++) {
			this.field1497[var1] = new class93();
		}
		for (int var2 = 0; var2 < this.field1485; var2++) {
			int var3 = this.field1511[var2];
			int var4 = this.field1518[var2];
			int var5 = this.field1505[var2];
			int var6 = this.field1522[var4] - this.field1522[var3];
			int var7 = this.field1476[var4] - this.field1476[var3];
			int var8 = this.field1506[var4] - this.field1506[var3];
			int var9 = this.field1522[var5] - this.field1522[var3];
			int var10 = this.field1476[var5] - this.field1476[var3];
			int var11 = this.field1506[var5] - this.field1506[var3];
			int var12 = var7 * var11 - var10 * var8;
			int var13 = var8 * var9 - var11 * var6;
			int var14;
			for (var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
				var12 >>= 0x1;
				var13 >>= 0x1;
			}
			int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
			if (var15 <= 0) {
				var15 = 1;
			}
			int var16 = var12 * 256 / var15;
			int var17 = var13 * 256 / var15;
			int var18 = var14 * 256 / var15;
			byte var19;
			if (this.field1480 == null) {
				var19 = 0;
			} else {
				var19 = this.field1480[var2];
			}
			if (var19 == 0) {
				class93 var20 = this.field1497[var3];
				var20.field1739 += var16;
				var20.field1736 += var17;
				var20.field1737 += var18;
				var20.field1738++;
				class93 var21 = this.field1497[var4];
				var21.field1739 += var16;
				var21.field1736 += var17;
				var21.field1737 += var18;
				var21.field1738++;
				class93 var22 = this.field1497[var5];
				var22.field1739 += var16;
				var22.field1736 += var17;
				var22.field1737 += var18;
				var22.field1738++;
			} else if (var19 == 1) {
				if (this.field1512 == null) {
					this.field1512 = new class200[this.field1485];
				}
				class200 var23 = this.field1512[var2] = new class200();
				var23.field3822 = var16;
				var23.field3830 = var17;
				var23.field3825 = var18;
			}
		}
	}

	@ObfuscatedName("he.c(III)V")
	public void method549(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1489; var4++) {
			this.field1522[var4] += arg0;
			this.field1476[var4] += arg1;
			this.field1506[var4] += arg2;
		}
		this.method554();
	}

	@ObfuscatedName("he.b(I)V")
	public void method550(int arg0) {
		int var2 = field1481[arg0];
		int var3 = field1509[arg0];
		for (int var4 = 0; var4 < this.field1489; var4++) {
			int var5 = this.field1476[var4] * var3 - this.field1506[var4] * var2 >> 16;
			this.field1506[var4] = this.field1476[var4] * var2 + this.field1506[var4] * var3 >> 16;
			this.field1476[var4] = var5;
		}
		this.method554();
	}

	@ObfuscatedName("he.d()V")
	public void method551() {
		for (int var1 = 0; var1 < this.field1489; var1++) {
			this.field1506[var1] = -this.field1506[var1];
		}
		for (int var2 = 0; var2 < this.field1485; var2++) {
			int var3 = this.field1511[var2];
			this.field1511[var2] = this.field1505[var2];
			this.field1505[var2] = var3;
		}
		this.method554();
	}

	@ObfuscatedName("he.d(III)V")
	public void method552(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1489; var4++) {
			this.field1522[var4] = this.field1522[var4] * arg0 / 128;
			this.field1476[var4] = this.field1476[var4] * arg1 / 128;
			this.field1506[var4] = this.field1506[var4] * arg2 / 128;
		}
		this.method554();
	}

	@ObfuscatedName("he.a(SS)V")
	public void method553(short arg0, short arg1) {
		if (this.field1503 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field1485; var3++) {
			if (this.field1503[var3] == arg0) {
				this.field1503[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("he.e()V")
	public void method554() {
		this.field1497 = null;
		this.field1490 = null;
		this.field1512 = null;
		this.field1491 = false;
	}

	@ObfuscatedName("he.f()V")
	public void method555() {
		for (int var1 = 0; var1 < this.field1489; var1++) {
			int var2 = this.field1522[var1];
			this.field1522[var1] = this.field1506[var1];
			this.field1506[var1] = -var2;
		}
		this.method554();
	}

	@ObfuscatedName("he.a([B)V")
	public void method556(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		Packet var3 = new Packet(arg0);
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var2.pos = arg0.length - 23;
		int var9 = var2.g2();
		int var10 = var2.g2();
		int var11 = var2.g1();
		int var12 = var2.g1();
		int var13 = var2.g1();
		int var14 = var2.g1();
		int var15 = var2.g1();
		int var16 = var2.g1();
		int var17 = var2.g1();
		int var18 = var2.g2();
		int var19 = var2.g2();
		int var20 = var2.g2();
		int var21 = var2.g2();
		int var22 = var2.g2();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		if (var11 > 0) {
			this.field1521 = new byte[var11];
			var2.pos = 0;
			for (int var26 = 0; var26 < var11; var26++) {
				byte var27 = this.field1521[var26] = var2.method324();
				if (var27 == 0) {
					var23++;
				}
				if (var27 >= 1 && var27 <= 3) {
					var24++;
				}
				if (var27 == 2) {
					var25++;
				}
			}
		}
		int var29 = var11 + var9;
		int var30 = var29;
		if (var12 == 1) {
			var29 += var10;
		}
		int var32 = var29 + var10;
		int var33 = var32;
		if (var13 == 255) {
			var32 += var10;
		}
		int var34 = var32;
		if (var15 == 1) {
			var32 += var10;
		}
		int var35 = var32;
		if (var17 == 1) {
			var32 += var9;
		}
		int var36 = var32;
		if (var14 == 1) {
			var32 += var10;
		}
		int var38 = var32 + var21;
		int var39 = var38;
		if (var16 == 1) {
			var38 += var10 * 2;
		}
		int var41 = var38 + var22;
		int var43 = var41 + var10 * 2;
		int var45 = var43 + var18;
		int var47 = var45 + var19;
		int var49 = var47 + var20;
		int var51 = var49 + var23 * 6;
		int var53 = var51 + var24 * 6;
		int var55 = var53 + var24 * 6;
		int var57 = var55 + var24;
		int var59 = var57 + var24;
		this.field1489 = var9;
		this.field1485 = var10;
		this.field1499 = var11;
		this.field1522 = new int[var9];
		this.field1476 = new int[var9];
		this.field1506 = new int[var9];
		this.field1511 = new int[var10];
		this.field1518 = new int[var10];
		this.field1505 = new int[var10];
		if (var17 == 1) {
			this.field1483 = new int[var9];
		}
		if (var12 == 1) {
			this.field1480 = new byte[var10];
		}
		if (var13 == 255) {
			this.field1493 = new byte[var10];
		} else {
			this.field1507 = (byte) var13;
		}
		if (var14 == 1) {
			this.field1510 = new byte[var10];
		}
		if (var15 == 1) {
			this.field1514 = new int[var10];
		}
		if (var16 == 1) {
			this.field1503 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field1488 = new byte[var10];
		}
		this.field1482 = new short[var10];
		if (var11 > 0) {
			this.field1501 = new short[var11];
			this.field1495 = new short[var11];
			this.field1477 = new short[var11];
			if (var24 > 0) {
				this.field1484 = new short[var24];
				this.field1508 = new short[var24];
				this.field1475 = new short[var24];
				this.field1478 = new byte[var24];
				this.field1517 = new byte[var24];
				this.field1516 = new byte[var24];
			}
			if (var25 > 0) {
				this.field1513 = new byte[var25];
				this.field1502 = new byte[var25];
			}
		}
		var2.pos = var11;
		var3.pos = var43;
		var4.pos = var45;
		var5.pos = var47;
		var6.pos = var35;
		int var61 = 0;
		int var62 = 0;
		int var63 = 0;
		for (int var64 = 0; var64 < var9; var64++) {
			int var65 = var2.g1();
			int var66 = 0;
			if ((var65 & 0x1) != 0) {
				var66 = var3.method342();
			}
			int var67 = 0;
			if ((var65 & 0x2) != 0) {
				var67 = var4.method342();
			}
			int var68 = 0;
			if ((var65 & 0x4) != 0) {
				var68 = var5.method342();
			}
			this.field1522[var64] = var61 + var66;
			this.field1476[var64] = var62 + var67;
			this.field1506[var64] = var63 + var68;
			var61 = this.field1522[var64];
			var62 = this.field1476[var64];
			var63 = this.field1506[var64];
			if (var17 == 1) {
				this.field1483[var64] = var6.g1();
			}
		}
		var2.pos = var41;
		var3.pos = var30;
		var4.pos = var33;
		var5.pos = var36;
		var6.pos = var34;
		var7.pos = var39;
		var8.pos = var38;
		for (int var69 = 0; var69 < var10; var69++) {
			this.field1482[var69] = (short) var2.g2();
			if (var12 == 1) {
				this.field1480[var69] = var3.method324();
			}
			if (var13 == 255) {
				this.field1493[var69] = var4.method324();
			}
			if (var14 == 1) {
				this.field1510[var69] = var5.method324();
			}
			if (var15 == 1) {
				this.field1514[var69] = var6.g1();
			}
			if (var16 == 1) {
				this.field1503[var69] = (short) (var7.g2() - 1);
			}
			if (this.field1488 != null) {
				if (this.field1503[var69] == -1) {
					this.field1488[var69] = -1;
				} else {
					this.field1488[var69] = (byte) (var8.g1() - 1);
				}
			}
		}
		var2.pos = var32;
		var3.pos = var29;
		int var70 = 0;
		int var71 = 0;
		int var72 = 0;
		int var73 = 0;
		for (int var74 = 0; var74 < var10; var74++) {
			int var75 = var3.g1();
			if (var75 == 1) {
				var70 = var2.method342() + var73;
				var71 = var2.method342() + var70;
				var72 = var2.method342() + var71;
				var73 = var72;
				this.field1511[var74] = var70;
				this.field1518[var74] = var71;
				this.field1505[var74] = var72;
			}
			if (var75 == 2) {
				var71 = var72;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.field1511[var74] = var70;
				this.field1518[var74] = var71;
				this.field1505[var74] = var72;
			}
			if (var75 == 3) {
				var70 = var72;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.field1511[var74] = var70;
				this.field1518[var74] = var71;
				this.field1505[var74] = var72;
			}
			if (var75 == 4) {
				int var76 = var70;
				var70 = var71;
				var71 = var76;
				var72 = var2.method342() + var73;
				var73 = var72;
				this.field1511[var74] = var70;
				this.field1518[var74] = var76;
				this.field1505[var74] = var72;
			}
		}
		var2.pos = var49;
		var3.pos = var51;
		var4.pos = var53;
		var5.pos = var55;
		var6.pos = var57;
		var7.pos = var59;
		for (int var77 = 0; var77 < var11; var77++) {
			int var78 = this.field1521[var77] & 0xFF;
			if (var78 == 0) {
				this.field1501[var77] = (short) var2.g2();
				this.field1495[var77] = (short) var2.g2();
				this.field1477[var77] = (short) var2.g2();
			}
			if (var78 == 1) {
				this.field1501[var77] = (short) var3.g2();
				this.field1495[var77] = (short) var3.g2();
				this.field1477[var77] = (short) var3.g2();
				this.field1484[var77] = (short) var4.g2();
				this.field1508[var77] = (short) var4.g2();
				this.field1475[var77] = (short) var4.g2();
				this.field1478[var77] = var5.method324();
				this.field1517[var77] = var6.method324();
				this.field1516[var77] = var7.method324();
			}
			if (var78 == 2) {
				this.field1501[var77] = (short) var3.g2();
				this.field1495[var77] = (short) var3.g2();
				this.field1477[var77] = (short) var3.g2();
				this.field1484[var77] = (short) var4.g2();
				this.field1508[var77] = (short) var4.g2();
				this.field1475[var77] = (short) var4.g2();
				this.field1478[var77] = var5.method324();
				this.field1517[var77] = var6.method324();
				this.field1516[var77] = var7.method324();
				this.field1513[var77] = var7.method324();
				this.field1502[var77] = var7.method324();
			}
			if (var78 == 3) {
				this.field1501[var77] = (short) var3.g2();
				this.field1495[var77] = (short) var3.g2();
				this.field1477[var77] = (short) var3.g2();
				this.field1484[var77] = (short) var4.g2();
				this.field1508[var77] = (short) var4.g2();
				this.field1475[var77] = (short) var4.g2();
				this.field1478[var77] = var5.method324();
				this.field1517[var77] = var6.method324();
				this.field1516[var77] = var7.method324();
			}
		}
	}

	@ObfuscatedName("he.h()Lhe;")
	public ModelUnlit method558() {
		ModelUnlit var1 = new ModelUnlit();
		if (this.field1480 != null) {
			var1.field1480 = new byte[this.field1485];
			for (int var2 = 0; var2 < this.field1485; var2++) {
				var1.field1480[var2] = this.field1480[var2];
			}
		}
		var1.field1489 = this.field1489;
		var1.field1485 = this.field1485;
		var1.field1499 = this.field1499;
		var1.field1522 = this.field1522;
		var1.field1476 = this.field1476;
		var1.field1506 = this.field1506;
		var1.field1511 = this.field1511;
		var1.field1518 = this.field1518;
		var1.field1505 = this.field1505;
		var1.field1493 = this.field1493;
		var1.field1510 = this.field1510;
		var1.field1488 = this.field1488;
		var1.field1482 = this.field1482;
		var1.field1503 = this.field1503;
		var1.field1507 = this.field1507;
		var1.field1521 = this.field1521;
		var1.field1501 = this.field1501;
		var1.field1495 = this.field1495;
		var1.field1477 = this.field1477;
		var1.field1484 = this.field1484;
		var1.field1508 = this.field1508;
		var1.field1475 = this.field1475;
		var1.field1478 = this.field1478;
		var1.field1517 = this.field1517;
		var1.field1516 = this.field1516;
		var1.field1513 = this.field1513;
		var1.field1502 = this.field1502;
		var1.field1483 = this.field1483;
		var1.field1514 = this.field1514;
		var1.field1487 = this.field1487;
		var1.field1486 = this.field1486;
		var1.field1497 = this.field1497;
		var1.field1512 = this.field1512;
		var1.field1498 = this.field1498;
		var1.field1523 = this.field1523;
		return var1;
	}

	@ObfuscatedName("he.a(III)Lnc;")
	@Override
	public ModelSource method559() {
		return this.light(this.field1498, this.field1523, -50, -10, -50);
	}

	@ObfuscatedName("he.b()I")
	@Override
	public int method88() {
		if (!this.field1491) {
			this.method561();
		}
		return this.field1519;
	}

	@ObfuscatedName("he.c(I)V")
	public void method560(int arg0) {
		int var2 = field1481[arg0];
		int var3 = field1509[arg0];
		for (int var4 = 0; var4 < this.field1489; var4++) {
			int var5 = this.field1476[var4] * var2 + this.field1522[var4] * var3 >> 16;
			this.field1476[var4] = this.field1476[var4] * var3 - this.field1522[var4] * var2 >> 16;
			this.field1522[var4] = var5;
		}
		this.method554();
	}

	@ObfuscatedName("he.i()V")
	public void method561() {
		if (this.field1491) {
			return;
		}
		this.field1491 = true;
		int var1 = 32767;
		int var2 = 32767;
		int var3 = 32767;
		int var4 = -32768;
		int var5 = -32768;
		int var6 = -32768;
		for (int var7 = 0; var7 < this.field1489; var7++) {
			int var8 = this.field1522[var7];
			int var9 = this.field1476[var7];
			int var10 = this.field1506[var7];
			if (var8 < var1) {
				var1 = var8;
			}
			if (var8 > var4) {
				var4 = var8;
			}
			if (var9 < var2) {
				var2 = var9;
			}
			if (var9 > var5) {
				var5 = var9;
			}
			if (var10 < var3) {
				var3 = var10;
			}
			if (var10 > var6) {
				var6 = var10;
			}
		}
		this.field1515 = (short) var1;
		this.field1520 = (short) var4;
		this.field1519 = (short) var2;
		this.field1494 = (short) var5;
		this.field1504 = (short) var3;
		this.field1479 = (short) var6;
	}

	@ObfuscatedName("he.a([[IIIIII)V")
	public void method562(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = -arg4 / 2;
		int var8 = -arg5 / 2;
		int var9 = method543(arg0, arg1 + var7, arg3 + var8);
		int var10 = arg4 / 2;
		int var11 = -arg5 / 2;
		int var12 = method543(arg0, arg1 + var10, arg3 + var11);
		int var13 = -arg4 / 2;
		int var14 = arg5 / 2;
		int var15 = method543(arg0, arg1 + var13, arg3 + var14);
		int var16 = arg4 / 2;
		int var17 = arg5 / 2;
		int var18 = method543(arg0, arg1 + var16, arg3 + var17);
		int var19 = var9 < var12 ? var9 : var12;
		int var20 = var15 < var18 ? var15 : var18;
		int var21 = var12 < var18 ? var12 : var18;
		int var22 = var9 < var15 ? var9 : var15;
		int var23 = (int) (Math.atan2((double) (var19 - var20), (double) arg5) * 325.95D) & 0x7FF;
		if (var23 != 0) {
			this.method550(var23);
		}
		int var24 = (int) (Math.atan2((double) (var22 - var21), (double) arg4) * 325.95D) & 0x7FF;
		if (var24 != 0) {
			this.method560(var24);
		}
		int var25 = var9 + var18;
		if (var12 + var15 < var25) {
			var25 = var12 + var15;
		}
		int var26 = (var25 >> 1) - arg2;
		if (var26 != 0) {
			this.method549(0, var26, 0);
		}
	}

	@ObfuscatedName("he.j()V")
	public void method563() {
		this.field1483 = null;
		this.field1514 = null;
		this.field1487 = null;
		this.field1486 = null;
	}

	@ObfuscatedName("he.b(SS)V")
	public void method564(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field1485; var3++) {
			if (this.field1482[var3] == arg0) {
				this.field1482[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("he.e(III)V")
	public void method565(int arg0, int arg1, int arg2) {
		if (arg2 != 0) {
			int var4 = field1481[arg2];
			int var5 = field1509[arg2];
			for (int var6 = 0; var6 < this.field1489; var6++) {
				int var7 = this.field1476[var6] * var4 + this.field1522[var6] * var5 >> 16;
				this.field1476[var6] = this.field1476[var6] * var5 - this.field1522[var6] * var4 >> 16;
				this.field1522[var6] = var7;
			}
		}
		if (arg0 != 0) {
			int var8 = field1481[arg0];
			int var9 = field1509[arg0];
			for (int var10 = 0; var10 < this.field1489; var10++) {
				int var11 = this.field1476[var10] * var9 - this.field1506[var10] * var8 >> 16;
				this.field1506[var10] = this.field1476[var10] * var8 + this.field1506[var10] * var9 >> 16;
				this.field1476[var10] = var11;
			}
		}
		if (arg1 == 0) {
			return;
		}
		int var12 = field1481[arg1];
		int var13 = field1509[arg1];
		for (int var14 = 0; var14 < this.field1489; var14++) {
			int var15 = this.field1506[var14] * var12 + this.field1522[var14] * var13 >> 16;
			this.field1506[var14] = this.field1506[var14] * var13 - this.field1522[var14] * var12 >> 16;
			this.field1522[var14] = var15;
		}
	}

	@ObfuscatedName("he.k()V")
	public void method566() {
		for (int var1 = 0; var1 < this.field1489; var1++) {
			int var2 = this.field1506[var1];
			this.field1506[var1] = this.field1522[var1];
			this.field1522[var1] = -var2;
		}
		this.method554();
	}

	@ObfuscatedName("he.a(Lhe;I)I")
	public int method567(ModelUnlit arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.field1522[arg1];
		int var5 = arg0.field1476[arg1];
		int var6 = arg0.field1506[arg1];
		for (int var7 = 0; var7 < this.field1489; var7++) {
			if (var4 == this.field1522[var7] && var5 == this.field1476[var7] && var6 == this.field1506[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.field1522[this.field1489] = var4;
			this.field1476[this.field1489] = var5;
			this.field1506[this.field1489] = var6;
			if (arg0.field1483 != null) {
				this.field1483[this.field1489] = arg0.field1483[arg1];
			}
			var3 = this.field1489++;
		}
		return var3;
	}

	@ObfuscatedName("he.l()V")
	public void method569() {
		int var10002;
		if (this.field1483 != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field1489; var3++) {
				int var4 = this.field1483[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.field1487 = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				this.field1487[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.field1489) {
				int var7 = this.field1483[var6];
				this.field1487[var7][var1[var7]++] = var6++;
			}
			this.field1483 = null;
		}
		if (this.field1514 == null) {
			return;
		}
		int[] var8 = new int[256];
		int var9 = 0;
		for (int var10 = 0; var10 < this.field1485; var10++) {
			int var11 = this.field1514[var10];
			var10002 = var8[var11]++;
			if (var11 > var9) {
				var9 = var11;
			}
		}
		this.field1486 = new int[var9 + 1][];
		for (int var12 = 0; var12 <= var9; var12++) {
			this.field1486[var12] = new int[var8[var12]];
			var8[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.field1485) {
			int var14 = this.field1514[var13];
			this.field1486[var14][var8[var14]++] = var13++;
		}
		this.field1514 = null;
	}

	@ObfuscatedName("he.a(Lnc;IIIZ)V")
	@Override
	public void method570(ModelSource arg0, int arg1, int arg2, int arg3, boolean arg4) {
		ModelUnlit var6 = (ModelUnlit) arg0;
		var6.method561();
		var6.method548();
		field1500++;
		int var7 = 0;
		int[] var8 = var6.field1522;
		int var9 = var6.field1489;
		for (int var10 = 0; var10 < this.field1489; var10++) {
			class93 var11 = this.field1497[var10];
			if (var11.field1738 != 0) {
				int var12 = this.field1476[var10] - arg2;
				if (var12 >= var6.field1519 && var12 <= var6.field1494) {
					int var13 = this.field1522[var10] - arg1;
					if (var13 >= var6.field1515 && var13 <= var6.field1520) {
						int var14 = this.field1506[var10] - arg3;
						if (var14 >= var6.field1504 && var14 <= var6.field1479) {
							for (int var15 = 0; var15 < var9; var15++) {
								class93 var16 = var6.field1497[var15];
								if (var13 == var8[var15] && var14 == var6.field1506[var15] && var12 == var6.field1476[var15] && var16.field1738 != 0) {
									if (this.field1490 == null) {
										this.field1490 = new class93[this.field1489];
									}
									if (var6.field1490 == null) {
										var6.field1490 = new class93[var9];
									}
									class93 var17 = this.field1490[var10];
									if (var17 == null) {
										var17 = this.field1490[var10] = new class93(var11);
									}
									class93 var18 = var6.field1490[var15];
									if (var18 == null) {
										var18 = var6.field1490[var15] = new class93(var16);
									}
									var17.field1739 += var16.field1739;
									var17.field1736 += var16.field1736;
									var17.field1737 += var16.field1737;
									var17.field1738 += var16.field1738;
									var18.field1739 += var11.field1739;
									var18.field1736 += var11.field1736;
									var18.field1737 += var11.field1737;
									var18.field1738 += var11.field1738;
									var7++;
									field1492[var10] = field1500;
									field1496[var15] = field1500;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3 || !arg4) {
			return;
		}
		for (int var19 = 0; var19 < this.field1485; var19++) {
			if (field1492[this.field1511[var19]] == field1500 && field1492[this.field1518[var19]] == field1500 && field1492[this.field1505[var19]] == field1500) {
				if (this.field1480 == null) {
					this.field1480 = new byte[this.field1485];
				}
				this.field1480[var19] = 2;
			}
		}
		for (int var20 = 0; var20 < var6.field1485; var20++) {
			if (field1496[var6.field1511[var20]] == field1500 && field1496[var6.field1518[var20]] == field1500 && field1496[var6.field1505[var20]] == field1500) {
				if (var6.field1480 == null) {
					var6.field1480 = new byte[var6.field1485];
				}
				var6.field1480[var20] = 2;
			}
		}
	}

	@ObfuscatedName("he.b([B)V")
	public void method571(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		Packet var4 = new Packet(arg0);
		Packet var5 = new Packet(arg0);
		Packet var6 = new Packet(arg0);
		Packet var7 = new Packet(arg0);
		Packet var8 = new Packet(arg0);
		var4.pos = arg0.length - 18;
		int var9 = var4.g2();
		int var10 = var4.g2();
		int var11 = var4.g1();
		int var12 = var4.g1();
		int var13 = var4.g1();
		int var14 = var4.g1();
		int var15 = var4.g1();
		int var16 = var4.g1();
		int var17 = var4.g2();
		int var18 = var4.g2();
		int var19 = var4.g2();
		int var20 = var4.g2();
		int var21 = var9;
		int var23 = var21 + var10;
		int var24 = var23;
		if (var13 == 255) {
			var23 += var10;
		}
		int var25 = var23;
		if (var15 == 1) {
			var23 += var10;
		}
		int var26 = var23;
		if (var12 == 1) {
			var23 += var10;
		}
		int var27 = var23;
		if (var16 == 1) {
			var23 += var9;
		}
		int var28 = var23;
		if (var14 == 1) {
			var23 += var10;
		}
		int var30 = var23 + var20;
		int var32 = var30 + var10 * 2;
		int var34 = var32 + var11 * 6;
		int var36 = var34 + var17;
		int var38 = var36 + var18;
		this.field1489 = var9;
		this.field1485 = var10;
		this.field1499 = var11;
		this.field1522 = new int[var9];
		this.field1476 = new int[var9];
		this.field1506 = new int[var9];
		this.field1511 = new int[var10];
		this.field1518 = new int[var10];
		this.field1505 = new int[var10];
		if (var11 > 0) {
			this.field1521 = new byte[var11];
			this.field1501 = new short[var11];
			this.field1495 = new short[var11];
			this.field1477 = new short[var11];
		}
		if (var16 == 1) {
			this.field1483 = new int[var9];
		}
		if (var12 == 1) {
			this.field1480 = new byte[var10];
			this.field1488 = new byte[var10];
			this.field1503 = new short[var10];
		}
		if (var13 == 255) {
			this.field1493 = new byte[var10];
		} else {
			this.field1507 = (byte) var13;
		}
		if (var14 == 1) {
			this.field1510 = new byte[var10];
		}
		if (var15 == 1) {
			this.field1514 = new int[var10];
		}
		this.field1482 = new short[var10];
		var4.pos = 0;
		var5.pos = var34;
		var6.pos = var36;
		var7.pos = var38;
		var8.pos = var27;
		int var40 = 0;
		int var41 = 0;
		int var42 = 0;
		for (int var43 = 0; var43 < var9; var43++) {
			int var44 = var4.g1();
			int var45 = 0;
			if ((var44 & 0x1) != 0) {
				var45 = var5.method342();
			}
			int var46 = 0;
			if ((var44 & 0x2) != 0) {
				var46 = var6.method342();
			}
			int var47 = 0;
			if ((var44 & 0x4) != 0) {
				var47 = var7.method342();
			}
			this.field1522[var43] = var40 + var45;
			this.field1476[var43] = var41 + var46;
			this.field1506[var43] = var42 + var47;
			var40 = this.field1522[var43];
			var41 = this.field1476[var43];
			var42 = this.field1506[var43];
			if (var16 == 1) {
				this.field1483[var43] = var8.g1();
			}
		}
		var4.pos = var30;
		var5.pos = var26;
		var6.pos = var24;
		var7.pos = var28;
		var8.pos = var25;
		for (int var48 = 0; var48 < var10; var48++) {
			this.field1482[var48] = (short) var4.g2();
			if (var12 == 1) {
				int var49 = var5.g1();
				if ((var49 & 0x1) == 1) {
					this.field1480[var48] = 1;
					var2 = true;
				} else {
					this.field1480[var48] = 0;
				}
				if ((var49 & 0x2) == 2) {
					this.field1488[var48] = (byte) (var49 >> 2);
					this.field1503[var48] = this.field1482[var48];
					this.field1482[var48] = 127;
					if (this.field1503[var48] != -1) {
						var3 = true;
					}
				} else {
					this.field1488[var48] = -1;
					this.field1503[var48] = -1;
				}
			}
			if (var13 == 255) {
				this.field1493[var48] = var6.method324();
			}
			if (var14 == 1) {
				this.field1510[var48] = var7.method324();
			}
			if (var15 == 1) {
				this.field1514[var48] = var8.g1();
			}
		}
		var4.pos = var23;
		var5.pos = var21;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;
		int var53 = 0;
		for (int var54 = 0; var54 < var10; var54++) {
			int var55 = var5.g1();
			if (var55 == 1) {
				var50 = var4.method342() + var53;
				var51 = var4.method342() + var50;
				var52 = var4.method342() + var51;
				var53 = var52;
				this.field1511[var54] = var50;
				this.field1518[var54] = var51;
				this.field1505[var54] = var52;
			}
			if (var55 == 2) {
				var51 = var52;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.field1511[var54] = var50;
				this.field1518[var54] = var51;
				this.field1505[var54] = var52;
			}
			if (var55 == 3) {
				var50 = var52;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.field1511[var54] = var50;
				this.field1518[var54] = var51;
				this.field1505[var54] = var52;
			}
			if (var55 == 4) {
				int var56 = var50;
				var50 = var51;
				var51 = var56;
				var52 = var4.method342() + var53;
				var53 = var52;
				this.field1511[var54] = var50;
				this.field1518[var54] = var56;
				this.field1505[var54] = var52;
			}
		}
		var4.pos = var32;
		for (int var57 = 0; var57 < var11; var57++) {
			this.field1521[var57] = 0;
			this.field1501[var57] = (short) var4.g2();
			this.field1495[var57] = (short) var4.g2();
			this.field1477[var57] = (short) var4.g2();
		}
		if (this.field1488 != null) {
			boolean var58 = false;
			for (int var59 = 0; var59 < var10; var59++) {
				int var60 = this.field1488[var59] & 0xFF;
				if (var60 != 255) {
					if ((this.field1501[var60] & 0xFFFF) == this.field1511[var59] && (this.field1495[var60] & 0xFFFF) == this.field1518[var59] && (this.field1477[var60] & 0xFFFF) == this.field1505[var59]) {
						this.field1488[var59] = -1;
					} else {
						var58 = true;
					}
				}
			}
			if (!var58) {
				this.field1488 = null;
			}
		}
		if (!var3) {
			this.field1503 = null;
		}
		if (!var2) {
			this.field1480 = null;
		}
	}

	@ObfuscatedName("he.m()V")
	public void method572() {
		for (int var1 = 0; var1 < this.field1489; var1++) {
			this.field1522[var1] = -this.field1522[var1];
			this.field1506[var1] = -this.field1506[var1];
		}
		this.method554();
	}

	@ObfuscatedName("he.d(I)V")
	public void method573() {
		int var1 = field1481[256];
		int var2 = field1509[256];
		for (int var3 = 0; var3 < this.field1489; var3++) {
			int var4 = this.field1506[var3] * var1 + this.field1522[var3] * var2 >> 16;
			this.field1506[var3] = this.field1506[var3] * var2 - this.field1522[var3] * var1 >> 16;
			this.field1522[var3] = var4;
		}
		this.method554();
	}
}
