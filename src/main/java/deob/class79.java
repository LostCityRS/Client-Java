package deob;

import java.util.Random;

@ObfuscatedName("hb")
public final class class79 extends class23 {

	@ObfuscatedName("hb.bb")
	public static int field1435;

	@ObfuscatedName("hb.db")
	public int field1437 = 2000;

	@ObfuscatedName("hb.S")
	public static final class88 field1426 = class208.method1423(105, "null");

	@ObfuscatedName("hb.Y")
	public int field1432 = 4096;

	@ObfuscatedName("hb.V")
	public int field1429 = 0;

	@ObfuscatedName("hb.Z")
	public int field1433 = 16;

	@ObfuscatedName("hb.W")
	public int field1430 = 0;

	@ObfuscatedName("hb.U")
	public static int field1428;

	@ObfuscatedName("hb.T")
	public static class46 field1427;

	@ObfuscatedName("hb.a(III[BIII[III)V")
	public static void method527(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			arg2 += arg6;
			arg8 += arg1;
		}
	}

	@ObfuscatedName("hb.b(II)I")
	public static int method528(int arg0) {
		if (class126.field2348 == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	public class79() {
		super(0, true);
	}

	@ObfuscatedName("hb.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1430 = arg0.method347();
		} else if (arg1 == 1) {
			this.field1437 = arg0.method301();
		} else if (arg1 == 2) {
			this.field1433 = arg0.method347();
		} else if (arg1 == 3) {
			this.field1429 = arg0.method301();
		} else if (arg1 == 4) {
			this.field1432 = arg0.method301();
		}
	}

	@ObfuscatedName("hb.b(B)V")
	@Override
	public void method123() {
		class108.method740();
	}

	@ObfuscatedName("hb.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = this.field1432 >> 1;
			int[][] var4 = super.field379.method1075();
			Random var5 = new Random((long) this.field1430);
			for (int var6 = 0; var6 < this.field1437; var6++) {
				int var7 = this.field1432 > 0 ? this.field1429 + class119.method812(this.field1432, var5) - var3 : this.field1429;
				int var8 = var7 >> 4 & 0xFF;
				int var9 = class119.method812(class70.field1276, var5);
				int var10 = class119.method812(class27.field460, var5);
				int var11 = var10 + (this.field1433 * class92.field1734[var8] >> 12);
				int var12 = (class150.field2920[var8] * this.field1433 >> 12) + var9;
				int var13 = var12 - var9;
				int var14 = var11 - var10;
				if (var13 != 0 || var14 != 0) {
					if (var14 < 0) {
						var14 = -var14;
					}
					if (var13 < 0) {
						var13 = -var13;
					}
					boolean var15 = var14 > var13;
					if (var15) {
						int var16 = var12;
						int var17 = var9;
						var12 = var11;
						var9 = var10;
						var11 = var16;
						var10 = var17;
					}
					if (var12 < var9) {
						int var18 = var9;
						int var19 = var10;
						var9 = var12;
						var10 = var11;
						var11 = var19;
						var12 = var18;
					}
					int var20 = var10;
					int var21 = var12 - var9;
					int var22 = var11 - var10;
					int var23 = 2048 / var21;
					int var24 = -var21 / 2;
					int var25 = var11 <= var10 ? -1 : 1;
					if (var22 < 0) {
						var22 = -var22;
					}
					int var26 = 1024 - (class119.method812(4096, var5) >> 2);
					for (int var27 = var9; var27 < var12; var27++) {
						int var28 = class45.field789 & var27;
						var24 += var22;
						int var29 = var26 + var23 * (var27 - var9) + 1024;
						int var30 = var20 & class220.field4158;
						if (var24 > 0) {
							var24 += -var21;
							var20 += var25;
						}
						if (var15) {
							var4[var30][var28] = var29;
						} else {
							var4[var28][var30] = var29;
						}
					}
				}
			}
		}
		return var2;
	}
}
