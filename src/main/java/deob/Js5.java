package deob;

@ObfuscatedName("nb")
public abstract class Js5 {

	@ObfuscatedName("nb.ab")
	public int crc;

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

	public Js5(boolean arg0, boolean arg1) {
		this.field2677 = arg0;
		this.field2704 = arg1;
	}

	@ObfuscatedName("c.a([BI)[B")
	public static byte[] method119(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		int var3 = var1.g4();
		if (var3 < 0 || Statics.field3073 != 0 && var3 > Statics.field3073) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.method307(var3, var4);
			return var4;
		} else {
			int var5 = var1.g4();
			if (var5 < 0 || Statics.field3073 != 0 && Statics.field3073 < var5) {
				throw new RuntimeException();
			}
			byte[] var6 = new byte[var5];
			if (var2 == 1) {
				BZip2.method1458(var6, var5, arg0, var3);
			} else {
				Statics.gzip.method424(var1, var6);
			}
			return var6;
		}
	}

	@ObfuscatedName("nb.a(II)V")
	public void method110(int arg0) {
	}

	@ObfuscatedName("nb.a(BII)[B")
	public final byte[] getFile(int arg0, int arg1) {
		return this.method949(null, arg1, arg0);
	}

	@ObfuscatedName("nb.a(B)I")
	public final int method940() {
		return this.field2674.length;
	}

	@ObfuscatedName("nb.a(I)V")
	public final void discardAllFiles() {
		for (int var1 = 0; var1 < this.field2700.length; var1++) {
			this.field2700[var1] = null;
		}
	}

	@ObfuscatedName("nb.b(II)I")
	public final int getFileIdLimit(int arg0) {
		return this.method968(arg0) ? this.field2674[arg0] : 0;
	}

	@ObfuscatedName("nb.a(III)Z")
	public boolean method943(int arg0, int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.field2674.length > arg1 && arg0 < this.field2674[arg1]) {
			return true;
		} else if (Statics.field615) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.a(Li;I)Z")
	public final boolean method944(JagString arg0) {
		int var2 = this.method964(Statics.field4281);
		return var2 == -1 ? this.method946(arg0, Statics.field4281) : this.method946(Statics.field4281, arg0);
	}

	@ObfuscatedName("nb.a(ILi;Li;)Z")
	public final boolean method946(JagString arg0, JagString arg1) {
		JagString var3 = arg0.method639();
		JagString var4 = arg1.method639();
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
		return Statics.method457(false, this.field2700[arg1][arg0]);
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
		byte[] var6 = Statics.method457(false, this.field2700[arg1][arg2]);
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
				var9 = Statics.method457(false, this.field2706[arg0]);
			} else {
				var9 = Statics.method457(true, this.field2706[arg0]);
				Packet var10 = new Packet(var9);
				var10.method322(var10.data.length, arg1);
			}
			byte[] var11;
			try {
				var11 = method119(var9);
			} catch (RuntimeException var30) {
				throw JagException.method1076(var30, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + Statics.method541(var9, var9.length) + "," + Statics.method541(var9, var9.length - 2) + "," + this.field2690[arg0] + "," + this.crc);
			}
			if (this.field2677) {
				this.field2706[arg0] = null;
			}
			if (var3 > 1) {
				int var13 = var11.length;
				int var31 = var13 - 1;
				int var14 = var11[var31] & 0xFF;
				int var15 = var31 - var3 * var14 * 4;
				Packet var16 = new Packet(var11);
				int[] var17 = new int[var3];
				var16.pos = var15;
				for (int var18 = 0; var18 < var14; var18++) {
					int var19 = 0;
					for (int var20 = 0; var20 < var3; var20++) {
						var19 += var16.g4();
						var17[var20] += var19;
					}
				}
				byte[][] var21 = new byte[var3][];
				for (int var22 = 0; var22 < var3; var22++) {
					var21[var22] = new byte[var17[var22]];
					var17[var22] = 0;
				}
				var16.pos = var15;
				int var23 = 0;
				for (int var24 = 0; var24 < var14; var24++) {
					int var25 = 0;
					for (int var26 = 0; var26 < var3; var26++) {
						var25 += var16.g4();
						ArrayUtil.method836(var11, var23, var21[var26], var17[var26], var25);
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
						var6[var28] = class1.method1153(var21[var27]);
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
					var6[var29] = class1.method1153(var11);
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
	public final boolean method954(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		return this.requestGroupDownload(var3);
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
			return this.getFile(arg0, 0);
		} else if (!this.method968(arg0)) {
			return null;
		} else if (this.field2674[arg0] == 1) {
			return this.getFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nb.a(Li;B)I")
	public final int method957(JagString arg0) {
		JagString var2 = arg0.method639();
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
	public final byte[] method960(JagString arg0, JagString arg1) {
		JagString var3 = arg0.method639();
		JagString var4 = arg1.method639();
		int var5 = this.field2688.method691(var3.method605());
		if (this.method968(var5)) {
			int var6 = this.field2673[var5].method691(var4.method605());
			return this.getFile(var6, var5);
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
	public final int method964(JagString arg0) {
		JagString var2 = arg0.method639();
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
	public final int method966(JagString arg0, int arg1) {
		if (this.method968(arg1)) {
			JagString var3 = arg0.method639();
			int var4 = this.field2673[arg1].method691(var3.method605());
			return this.method943(var4, arg1) ? var4 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("nb.a([BZ)V")
	public final void method967(byte[] arg0) {
		this.crc = Statics.method541(arg0, arg0.length);
		Packet var2 = new Packet(method119(arg0));
		int var3 = var2.g1();
		if (var3 != 5 && var3 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + var3);
		}
		if (var3 >= 6) {
			var2.g4();
		}
		int var4 = 0;
		int var5 = var2.g1();
		this.field2699 = var2.g2();
		this.field2708 = new int[this.field2699];
		int var6 = -1;
		for (int var7 = 0; var7 < this.field2699; var7++) {
			this.field2708[var7] = var4 += var2.g2();
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
				this.field2682[this.field2708[var9]] = var2.g4();
			}
			this.field2688 = new class99(this.field2682);
		}
		for (int var10 = 0; var10 < this.field2699; var10++) {
			this.field2690[this.field2708[var10]] = var2.g4();
		}
		for (int var11 = 0; var11 < this.field2699; var11++) {
			this.field2668[this.field2708[var11]] = var2.g4();
		}
		for (int var12 = 0; var12 < this.field2699; var12++) {
			this.field2683[this.field2708[var12]] = var2.g2();
		}
		for (int var13 = 0; var13 < this.field2699; var13++) {
			int var14 = this.field2708[var13];
			int var15 = this.field2683[var14];
			int var16 = 0;
			this.field2678[var14] = new int[var15];
			int var17 = -1;
			for (int var18 = 0; var18 < var15; var18++) {
				int var19 = this.field2678[var14][var18] = var16 += var2.g2();
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
				this.field2696[var21][var25] = var2.g4();
			}
			this.field2673[var21] = new class99(this.field2696[var21]);
		}
	}

	@ObfuscatedName("nb.g(II)Z")
	public final boolean method968(int arg0) {
		if (arg0 >= 0 && arg0 < this.field2674.length && this.field2674[arg0] != 0) {
			return true;
		} else if (Statics.field615) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.b(Li;I)V")
	public final void method969(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.field2688.method691(var2.method605());
		this.method110(var3);
	}

	@ObfuscatedName("nb.b(IB)Z")
	public final boolean requestGroupDownload(int arg0) {
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
