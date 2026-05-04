package deob;

@ObfuscatedName("nb")
public abstract class class144 {

	@ObfuscatedName("nb.ab")
	public int field2712;

	@ObfuscatedName("nb.bb")
	public static int[] field2713;

	@ObfuscatedName("nb.e")
	public static final class88 field2664 = class208.method1423(105, "hitmarks");

	@ObfuscatedName("nb.g")
	public static final class88 field2666 = class208.method1423(105, "Speicher wird zugewiesen)3");

	@ObfuscatedName("nb.i")
	public int[] field2668;

	@ObfuscatedName("nb.n")
	public class99[] field2673;

	@ObfuscatedName("nb.o")
	public int[] field2674;

	@ObfuscatedName("nb.r")
	public final boolean field2677;

	@ObfuscatedName("nb.s")
	public int[][] field2678;

	@ObfuscatedName("nb.w")
	public int[] field2682;

	@ObfuscatedName("nb.L")
	public static final class88 field2697 = class208.method1423(105, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@ObfuscatedName("nb.V")
	public static int field2707 = 0;

	@ObfuscatedName("nb.S")
	public final boolean field2704;

	@ObfuscatedName("nb.N")
	public int field2699;

	@ObfuscatedName("nb.C")
	public class99 field2688;

	@ObfuscatedName("nb.x")
	public int[] field2683;

	@ObfuscatedName("nb.E")
	public int[] field2690;

	@ObfuscatedName("nb.W")
	public int[] field2708;

	@ObfuscatedName("nb.U")
	public Object[] field2706;

	@ObfuscatedName("nb.K")
	public int[][] field2696;

	@ObfuscatedName("nb.O")
	public Object[][] field2700;

	@ObfuscatedName("nb.a(IIII)Z")
	public static boolean method945(int arg0, int arg1, int arg2, int arg3) {
		if (!class239.method1581(arg0, arg1, arg2)) {
			return false;
		}
		int var4 = arg1 << 7;
		int var5 = arg2 << 7;
		int var6 = class62.field1137[arg0][arg1][arg2] - 1;
		int var7 = var6 - 120;
		int var8 = var6 - 230;
		int var9 = var6 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var4 > class74.field1353) {
					if (!class104.method718(var4, var6, var5)) {
						return false;
					}
					if (!class104.method718(var4, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!class104.method718(var4, var7, var5)) {
						return false;
					}
					if (!class104.method718(var4, var7, var5 + 128)) {
						return false;
					}
				}
				if (!class104.method718(var4, var8, var5)) {
					return false;
				}
				if (!class104.method718(var4, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var5 < class216.field4048) {
					if (!class104.method718(var4, var6, var5 + 128)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!class104.method718(var4, var7, var5 + 128)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!class104.method718(var4, var8, var5 + 128)) {
					return false;
				}
				if (!class104.method718(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var4 < class74.field1353) {
					if (!class104.method718(var4 + 128, var6, var5)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var6, var5 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!class104.method718(var4 + 128, var7, var5)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var7, var5 + 128)) {
						return false;
					}
				}
				if (!class104.method718(var4 + 128, var8, var5)) {
					return false;
				}
				if (!class104.method718(var4 + 128, var8, var5 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var5 > class216.field4048) {
					if (!class104.method718(var4, var6, var5)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var6, var5)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!class104.method718(var4, var7, var5)) {
						return false;
					}
					if (!class104.method718(var4 + 128, var7, var5)) {
						return false;
					}
				}
				if (!class104.method718(var4, var8, var5)) {
					return false;
				}
				if (!class104.method718(var4 + 128, var8, var5)) {
					return false;
				}
				return true;
			}
		}
		if (!class104.method718(var4 + 64, var9, var5 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return class104.method718(var4, var8, var5 + 128);
		} else if (arg3 == 32) {
			return class104.method718(var4 + 128, var8, var5 + 128);
		} else if (arg3 == 64) {
			return class104.method718(var4 + 128, var8, var5);
		} else if (arg3 == 128) {
			return class104.method718(var4, var8, var5);
		} else {
			return true;
		}
	}

	@ObfuscatedName("nb.a(JII[I)Li;")
	public static class88 method952(long arg0, int arg1, int[] arg2) {
		if (class247.field4527 != null) {
			class88 var4 = class247.field4527.method1126(arg2, arg1, arg0);
			if (var4 != null) {
				return var4;
			}
		}
		return arg1 == 5 ? class200.method1375(arg0).method614() : class234.method1556(arg0);
	}

	@ObfuscatedName("nb.f(II)Li;")
	public static class88 method958(int arg0) {
		class88 var1 = class170.method1212(arg0);
		for (int var2 = var1.method604() - 3; var2 > 0; var2 -= 3) {
			var1 = class166.method1140(new class88[] { var1.method623(0, var2), class53.field979, var1.method635(var2) });
		}
		if (var1.method604() > 9) {
			return class166.method1140(new class88[] { class148.field2828, var1.method623(0, var1.method604() - 8), class132.field2469, class68.field1238, var1, class209.field3982 });
		} else if (var1.method604() > 6) {
			return class166.method1140(new class88[] { class36.field644, var1.method623(0, var1.method604() - 4), class159.field3071, class68.field1238, var1, class209.field3982 });
		} else {
			return class166.method1140(new class88[] { class77.field1370, var1, class120.field2199 });
		}
	}

	@ObfuscatedName("nb.a(III[Lia;IB[BZ)V")
	public static void method963(int arg0, int arg1, int arg2, class89[] arg3, int arg4, byte[] arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (var7 + arg1 > 0 && var7 + arg1 < 103 && var8 + arg4 > 0 && arg4 + var8 < 103) {
						arg3[var6].field1667[var7 + arg1][var8 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		class46 var9 = new class46(arg5);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					class137.method914(var11 + arg1, var9, arg0, arg2, var12 + arg4, 0, var10);
				}
			}
		}
	}

	public class144(boolean arg0, boolean arg1) {
		this.field2677 = arg0;
		this.field2704 = arg1;
	}

	@ObfuscatedName("nb.a(II)V")
	public void method110(int arg0) {
	}

	@ObfuscatedName("nb.a(BII)[B")
	public final byte[] method939(int arg0, int arg1) {
		return this.method949(null, arg1, arg0);
	}

	@ObfuscatedName("nb.a(B)I")
	public final int method940() {
		return this.field2674.length;
	}

	@ObfuscatedName("nb.a(I)V")
	public final void method941() {
		for (int var1 = 0; var1 < this.field2700.length; var1++) {
			this.field2700[var1] = null;
		}
	}

	@ObfuscatedName("nb.b(II)I")
	public final int method942(int arg0) {
		return this.method968(arg0) ? this.field2674[arg0] : 0;
	}

	@ObfuscatedName("nb.a(III)Z")
	public boolean method943(int arg0, int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.field2674.length > arg1 && arg0 < this.field2674[arg1]) {
			return true;
		} else if (class35.field615) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.a(Li;I)Z")
	public final boolean method944(class88 arg0) {
		int var2 = this.method964(class228.field4281);
		return var2 == -1 ? this.method946(arg0, class228.field4281) : this.method946(class228.field4281, arg0);
	}

	@ObfuscatedName("nb.a(ILi;Li;)Z")
	public final boolean method946(class88 arg0, class88 arg1) {
		class88 var3 = arg0.method639();
		class88 var4 = arg1.method639();
		int var5 = this.field2688.method691(var3.method605());
		if (this.method968(var5)) {
			int var6 = this.field2673[var5].method691(var4.method605());
			return this.method959(var5, var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.b(III)[B")
	public final byte[] method947(int arg0, int arg1) {
		if (!this.method943(arg0, arg1)) {
			return null;
		}
		if (this.field2700[arg1] == null || this.field2700[arg1][arg0] == null) {
			boolean var3 = this.method951(arg1, null);
			if (!var3) {
				this.method112(arg1);
				boolean var4 = this.method951(arg1, null);
				if (!var4) {
					return null;
				}
			}
		}
		return class67.method457(false, this.field2700[arg1][arg0]);
	}

	@ObfuscatedName("nb.c(II)[I")
	public final int[] method948(int arg0) {
		if (!this.method968(arg0)) {
			return null;
		}
		int[] var2 = this.field2678[arg0];
		if (var2 == null) {
			var2 = new int[this.field2683[arg0]];
			int var3 = 0;
			while (var2.length > var3) {
				var2[var3] = var3++;
			}
		}
		return var2;
	}

	@ObfuscatedName("nb.a(I[III)[B")
	public final byte[] method949(int[] arg0, int arg1, int arg2) {
		if (!this.method943(arg2, arg1)) {
			return null;
		}
		if (this.field2700[arg1] == null || this.field2700[arg1][arg2] == null) {
			boolean var4 = this.method951(arg1, arg0);
			if (!var4) {
				this.method112(arg1);
				boolean var5 = this.method951(arg1, arg0);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = class67.method457(false, this.field2700[arg1][arg2]);
		if (this.field2704) {
			this.field2700[arg1][arg2] = null;
			if (this.field2674[arg1] == 1) {
				this.field2700[arg1] = null;
			}
		}
		return var6;
	}

	@ObfuscatedName("nb.a(Z)I")
	public final int method950() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.field2706.length; var3++) {
			if (this.field2683[var3] > 0) {
				var2 += this.method116(var3);
				var1 += 100;
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("nb.a(I[IB)Z")
	public boolean method951(int arg0, int[] arg1) {
		if (!this.method968(arg0)) {
			return false;
		} else if (this.field2706[arg0] == null) {
			return false;
		} else {
			int var3 = this.field2683[arg0];
			int[] var4 = this.field2678[arg0];
			if (this.field2700[arg0] == null) {
				this.field2700[arg0] = new Object[this.field2674[arg0]];
			}
			boolean var5 = true;
			Object[] var6 = this.field2700[arg0];
			for (int var7 = 0; var7 < var3; var7++) {
				int var8;
				if (var4 == null) {
					var8 = var7;
				} else {
					var8 = var4[var7];
				}
				if (var6[var8] == null) {
					var5 = false;
					break;
				}
			}
			if (var5) {
				return true;
			}
			byte[] var9;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				var9 = class67.method457(false, this.field2706[arg0]);
			} else {
				var9 = class67.method457(true, this.field2706[arg0]);
				class46 var10 = new class46(var9);
				var10.method322(var10.field842.length, arg1);
			}
			byte[] var11;
			try {
				var11 = class23.method119(var9);
			} catch (RuntimeException var30) {
				throw class160.method1076(var30, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + class81.method541(var9, var9.length) + "," + class81.method541(var9, var9.length - 2) + "," + this.field2690[arg0] + "," + this.field2712);
			}
			if (this.field2677) {
				this.field2706[arg0] = null;
			}
			if (var3 > 1) {
				int var13 = var11.length;
				int var31 = var13 - 1;
				int var14 = var11[var31] & 0xFF;
				int var15 = var31 - var3 * var14 * 4;
				class46 var16 = new class46(var11);
				int[] var17 = new int[var3];
				var16.field831 = var15;
				for (int var18 = 0; var18 < var14; var18++) {
					int var19 = 0;
					for (int var20 = 0; var20 < var3; var20++) {
						var19 += var16.method323();
						var17[var20] += var19;
					}
				}
				byte[][] var21 = new byte[var3][];
				for (int var22 = 0; var22 < var3; var22++) {
					var21[var22] = new byte[var17[var22]];
					var17[var22] = 0;
				}
				var16.field831 = var15;
				int var23 = 0;
				for (int var24 = 0; var24 < var14; var24++) {
					int var25 = 0;
					for (int var26 = 0; var26 < var3; var26++) {
						var25 += var16.method323();
						class124.method836(var11, var23, var21[var26], var17[var26], var25);
						var23 += var25;
						var17[var26] += var25;
					}
				}
				for (int var27 = 0; var27 < var3; var27++) {
					int var28;
					if (var4 == null) {
						var28 = var27;
					} else {
						var28 = var4[var27];
					}
					if (this.field2704) {
						var6[var28] = var21[var27];
					} else {
						var6[var28] = class168.method1153(var21[var27]);
					}
				}
			} else {
				int var29;
				if (var4 == null) {
					var29 = 0;
				} else {
					var29 = var4[0];
				}
				if (this.field2704) {
					var6[var29] = var11;
				} else {
					var6[var29] = class168.method1153(var11);
				}
			}
			return true;
		}
	}

	@ObfuscatedName("nb.d(II)Z")
	public final boolean method953(int arg0) {
		if (this.field2674.length == 1) {
			return this.method959(0, arg0);
		} else if (!this.method968(arg0)) {
			return false;
		} else if (this.field2674[arg0] == 1) {
			return this.method959(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nb.a(ILi;)Z")
	public final boolean method954(class88 arg0) {
		class88 var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		return this.method970(var3);
	}

	@ObfuscatedName("nb.a(BI)I")
	public int method116(int arg0) {
		if (this.method968(arg0)) {
			return this.field2706[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("nb.a(IB)V")
	public final void method955(int arg0) {
		if (this.method968(arg0)) {
			this.field2700[arg0] = null;
		}
	}

	@ObfuscatedName("nb.a(IZ)V")
	public void method112(int arg0) {
	}

	@ObfuscatedName("nb.e(II)[B")
	public final byte[] method956(int arg0) {
		if (this.field2674.length == 1) {
			return this.method939(arg0, 0);
		} else if (!this.method968(arg0)) {
			return null;
		} else if (this.field2674[arg0] == 1) {
			return this.method939(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nb.a(Li;B)I")
	public final int method957(class88 arg0) {
		class88 var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		return this.method116(var3);
	}

	@ObfuscatedName("nb.a(IIB)Z")
	public final boolean method959(int arg0, int arg1) {
		if (!this.method943(arg1, arg0)) {
			return false;
		} else if (this.field2700[arg0] != null && this.field2700[arg0][arg1] != null) {
			return true;
		} else if (this.field2706[arg0] == null) {
			this.method112(arg0);
			return this.field2706[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nb.b(ILi;Li;)[B")
	public final byte[] method960(class88 arg0, class88 arg1) {
		class88 var3 = arg0.method639();
		class88 var4 = arg1.method639();
		int var5 = this.field2688.method691(var3.method605());
		if (this.method968(var5)) {
			int var6 = this.field2673[var5].method691(var4.method605());
			return this.method939(var6, var5);
		} else {
			return null;
		}
	}

	@ObfuscatedName("nb.b(B)Z")
	public final boolean method962() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field2708.length; var2++) {
			int var3 = this.field2708[var2];
			if (this.field2706[var3] == null) {
				this.method112(var3);
				if (this.field2706[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("nb.b(Li;B)I")
	public final int method964(class88 arg0) {
		class88 var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		return this.method968(var3) ? var3 : -1;
	}

	@ObfuscatedName("nb.a(ZZI)V")
	public final void method965(boolean arg0) {
		this.field2673 = null;
		this.field2696 = null;
		if (arg0) {
			this.field2682 = null;
			this.field2688 = null;
		}
	}

	@ObfuscatedName("nb.a(Li;II)I")
	public final int method966(class88 arg0, int arg1) {
		if (this.method968(arg1)) {
			class88 var3 = arg0.method639();
			int var4 = this.field2673[arg1].method691(var3.method605());
			return this.method943(var4, arg1) ? var4 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("nb.a([BZ)V")
	public final void method967(byte[] arg0) {
		this.field2712 = class81.method541(arg0, arg0.length);
		class46 var2 = new class46(class23.method119(arg0));
		int var3 = var2.method347();
		if (var3 != 5 && var3 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + var3);
		}
		if (var3 >= 6) {
			var2.method323();
		}
		int var4 = 0;
		int var5 = var2.method347();
		this.field2699 = var2.method301();
		this.field2708 = new int[this.field2699];
		int var6 = -1;
		for (int var7 = 0; var7 < this.field2699; var7++) {
			this.field2708[var7] = var4 += var2.method301();
			if (var6 < this.field2708[var7]) {
				var6 = this.field2708[var7];
			}
		}
		this.field2674 = new int[var6 + 1];
		this.field2678 = new int[var6 + 1][];
		this.field2700 = new Object[var6 + 1][];
		this.field2690 = new int[var6 + 1];
		this.field2706 = new Object[var6 + 1];
		this.field2683 = new int[var6 + 1];
		this.field2668 = new int[var6 + 1];
		if (var5 != 0) {
			this.field2682 = new int[var6 + 1];
			for (int var8 = 0; var8 < var6 + 1; var8++) {
				this.field2682[var8] = -1;
			}
			for (int var9 = 0; var9 < this.field2699; var9++) {
				this.field2682[this.field2708[var9]] = var2.method323();
			}
			this.field2688 = new class99(this.field2682);
		}
		for (int var10 = 0; var10 < this.field2699; var10++) {
			this.field2690[this.field2708[var10]] = var2.method323();
		}
		for (int var11 = 0; var11 < this.field2699; var11++) {
			this.field2668[this.field2708[var11]] = var2.method323();
		}
		for (int var12 = 0; var12 < this.field2699; var12++) {
			this.field2683[this.field2708[var12]] = var2.method301();
		}
		for (int var13 = 0; var13 < this.field2699; var13++) {
			int var14 = this.field2708[var13];
			int var15 = this.field2683[var14];
			int var16 = 0;
			this.field2678[var14] = new int[var15];
			int var17 = -1;
			for (int var18 = 0; var18 < var15; var18++) {
				int var19 = this.field2678[var14][var18] = var16 += var2.method301();
				if (var17 < var19) {
					var17 = var19;
				}
			}
			this.field2674[var14] = var17 + 1;
			if (var15 == var17 + 1) {
				this.field2678[var14] = null;
			}
		}
		if (var5 == 0) {
			return;
		}
		this.field2696 = new int[var6 + 1][];
		this.field2673 = new class99[var6 + 1];
		for (int var20 = 0; var20 < this.field2699; var20++) {
			int var21 = this.field2708[var20];
			int var22 = this.field2683[var21];
			this.field2696[var21] = new int[this.field2674[var21]];
			for (int var23 = 0; var23 < this.field2674[var21]; var23++) {
				this.field2696[var21][var23] = -1;
			}
			for (int var24 = 0; var24 < var22; var24++) {
				int var25;
				if (this.field2678[var21] == null) {
					var25 = var24;
				} else {
					var25 = this.field2678[var21][var24];
				}
				this.field2696[var21][var25] = var2.method323();
			}
			this.field2673[var21] = new class99(this.field2696[var21]);
		}
	}

	@ObfuscatedName("nb.g(II)Z")
	public final boolean method968(int arg0) {
		if (arg0 >= 0 && arg0 < this.field2674.length && this.field2674[arg0] != 0) {
			return true;
		} else if (class35.field615) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.b(Li;I)V")
	public final void method969(class88 arg0) {
		class88 var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		this.method110(var3);
	}

	@ObfuscatedName("nb.b(IB)Z")
	public final boolean method970(int arg0) {
		if (!this.method968(arg0)) {
			return false;
		} else if (this.field2706[arg0] == null) {
			this.method112(arg0);
			return this.field2706[arg0] != null;
		} else {
			return true;
		}
	}
}
