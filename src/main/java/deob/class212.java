package deob;

@ObfuscatedName("te")
public final class class212 extends class23 {

	@ObfuscatedName("te.ab")
	public static final class88[] field4019 = new class88[100];

	@ObfuscatedName("te.eb")
	public static final class88 field4023 = class208.method1423(105, "Willkommen auf RuneScape");

	@ObfuscatedName("te.fb")
	public int[][] field4024;

	@ObfuscatedName("te.hb")
	public int[] field4026;

	@ObfuscatedName("te.S")
	public static final class88 field4011 = class208.method1423(105, "sl_flags");

	@ObfuscatedName("te.Q")
	public static final class88 field4009 = class208.method1423(105, "::tele 0)1");

	@ObfuscatedName("te.Z")
	public static final class88 field4018 = class208.method1423(105, "m");

	@ObfuscatedName("te.U")
	public final short[] field4013 = new short[257];

	@ObfuscatedName("te.Y")
	public int field4017 = 0;

	@ObfuscatedName("te.W")
	public int[] field4015;

	@ObfuscatedName("te.a(II[Lia;III[BZIII)V")
	public static void method1447(int arg0, int arg1, class89[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var9 = -1;
		class46 var10 = new class46(arg5);
		while (true) {
			int var11 = var10.method332();
			if (var11 == 0) {
				return;
			}
			int var12 = 0;
			var9 += var11;
			while (true) {
				int var13 = var10.method350();
				if (var13 == 0) {
					break;
				}
				var12 += var13 - 1;
				int var14 = var12 >> 6 & 0x3F;
				int var15 = var12 & 0x3F;
				int var16 = var12 >> 12;
				int var17 = var10.method347();
				int var18 = var17 >> 2;
				int var19 = var17 & 0x3;
				if (arg6 == var16 && arg1 <= var14 && var14 < arg1 + 8 && arg3 <= var15 && var15 < arg3 + 8) {
					class148 var20 = class190.method1321(var9);
					int var21 = class70.method469(var20.field2774, arg0, var15 & 0x7, var14 & 0x7, var20.field2794, var19) + arg8;
					int var22 = class109.method742(var15 & 0x7, var14 & 0x7, var19, var20.field2794, var20.field2774, arg0) + arg7;
					if (var21 > 0 && var22 > 0 && var21 < 103 && var22 < 103) {
						class89 var23 = null;
						int var24 = arg4;
						if ((class116.field2098[1][var21][var22] & 0x2) == 2) {
							var24 = arg4 - 1;
						}
						if (var24 >= 0) {
							var23 = arg2[var24];
						}
						class223.method1503(true, arg4, arg0 + var19 & 0x3, var18, class245.field4497, var9, arg4, var23, var22, var21);
					}
				}
			}
		}
	}

	@ObfuscatedName("te.a(IIBIZ)V")
	public static void method1449(int arg0, int arg1, int arg2, boolean arg3) {
		if (class211.method1445(arg1)) {
			class155.method1055(arg0, arg3, -1, arg2, class78.field1418[arg1]);
		}
	}

	@ObfuscatedName("te.a(BILnb;)Z")
	public static boolean method1451(int arg0, class144 arg1) {
		byte[] var2 = arg1.method956(arg0);
		if (var2 == null) {
			return false;
		} else {
			class244.method1601(var2);
			return true;
		}
	}

	public class212() {
		super(1, true);
	}

	@ObfuscatedName("te.b(B)V")
	@Override
	public void method123() {
		if (this.field4024 == null) {
			this.field4024 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.field4024.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.field4017 == 2) {
			this.method1450();
		}
		class108.method740();
		this.method1452();
	}

	@ObfuscatedName("te.c(IB)[I")
	public int[] method1446(int arg0) {
		if (arg0 < 0) {
			return this.field4015;
		} else if (this.field4024.length <= arg0) {
			return this.field4026;
		} else {
			return this.field4024[arg0];
		}
	}

	@ObfuscatedName("te.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int[] var3 = this.method120(arg0, 0);
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				int var5 = var3[var4] >> 4;
				if (var5 < 0) {
					var5 = 0;
				}
				if (var5 > 256) {
					var5 = 256;
				}
				var2[var4] = this.field4013[var5];
			}
		}
		return var2;
	}

	@ObfuscatedName("te.c(Z)V")
	public void method1450() {
		int[] var1 = this.field4024[0];
		int[] var2 = this.field4024[1];
		int[] var3 = this.field4024[this.field4024.length - 1];
		int[] var4 = this.field4024[this.field4024.length - 2];
		this.field4015 = new int[] { var1[0] + var1[0] - var2[0], var1[1] - var2[1] - -var1[1] };
		this.field4026 = new int[] { var4[0] + var4[0] - var3[0], var4[1] - (var3[1] - var4[1]) };
	}

	@ObfuscatedName("te.c(B)V")
	public void method1452() {
		int var1 = this.field4017;
		if (var1 == 2) {
			for (int var2 = 0; var2 < 257; var2++) {
				int var3 = var2 << 4;
				int var4;
				for (var4 = 1; var4 < this.field4024.length - 1 && var3 >= this.field4024[var4][0]; var4++) {
				}
				int[] var5 = this.field4024[var4 - 1];
				int[] var6 = this.field4024[var4];
				int var7 = this.method1446(var4 - 2)[1];
				int var8 = var5[1];
				int var9 = var6[1];
				int var10 = this.method1446(var4 + 1)[1];
				int var11 = (var3 - var5[0] << 12) / (var6[0] - var5[0]);
				int var12 = var11 * var11 >> 12;
				int var13 = var8 + var10 - var9 - var7;
				int var14 = (var11 * var13 >> 12) * var12 >> 12;
				int var15 = var9 - var7;
				int var16 = var7 - var13 - var8;
				int var17 = var16 * var12 >> 12;
				int var18 = var11 * var15 >> 12;
				int var19 = var8 + var18 + var17 + var14;
				if (var19 <= -32768) {
					var19 = -32767;
				}
				if (var19 >= 32768) {
					var19 = 32767;
				}
				this.field4013[var2] = (short) var19;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < 257; var20++) {
				int var21 = var20 << 4;
				int var22;
				for (var22 = 1; var22 < this.field4024.length - 1 && var21 >= this.field4024[var22][0]; var22++) {
				}
				int[] var23 = this.field4024[var22 - 1];
				int[] var24 = this.field4024[var22];
				int var25 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
				int var26 = 4096 - class150.field2920[var25 >> 5 & 0xFF] >> 1;
				int var27 = 4096 - var26;
				int var28 = var27 * var23[1] + var26 * var24[1] >> 12;
				if (var28 <= -32768) {
					var28 = -32767;
				}
				if (var28 >= 32768) {
					var28 = 32767;
				}
				this.field4013[var20] = (short) var28;
			}
		} else {
			for (int var29 = 0; var29 < 257; var29++) {
				int var30 = var29 << 4;
				int var31;
				for (var31 = 1; var31 < this.field4024.length - 1 && var30 >= this.field4024[var31][0]; var31++) {
				}
				int[] var32 = this.field4024[var31];
				int[] var33 = this.field4024[var31 - 1];
				int var34 = (var30 - var33[0] << 12) / (var32[0] - var33[0]);
				int var35 = 4096 - var34;
				int var36 = var33[1] * var35 + var34 * var32[1] >> 12;
				if (var36 <= -32768) {
					var36 = -32767;
				}
				if (var36 >= 32768) {
					var36 = 32767;
				}
				this.field4013[var29] = (short) var36;
			}
		}
	}

	@ObfuscatedName("te.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.field4017 = arg0.method347();
		this.field4024 = new int[arg0.method347()][2];
		for (int var3 = 0; var3 < this.field4024.length; var3++) {
			this.field4024[var3][0] = arg0.method301();
			this.field4024[var3][1] = arg0.method301();
		}
	}
}
