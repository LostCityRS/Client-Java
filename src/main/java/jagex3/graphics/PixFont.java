package jagex3.graphics;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.util.JagString;

import java.util.Random;

@ObfuscatedName("bc")
public final class PixFont extends Pix2D {

	@ObfuscatedName("bc.ac")
	public final int field360;

	@ObfuscatedName("bc.Db")
	public static JagString[] field337 = new JagString[100];

	@ObfuscatedName("bc.Fb")
	public static JagString field339 = JagString.wrap("dbl");

	@ObfuscatedName("bc.Ab")
	public static JagString field334 = JagString.wrap("or1");

	@ObfuscatedName("bc.Cb")
	public static JagString field336 = JagString.wrap("mag");

	@ObfuscatedName("bc.Jb")
	public static JagString field343 = JagString.wrap("red");

	@ObfuscatedName("bc.zb")
	public static JagString field333 = JagString.wrap("cya");

	@ObfuscatedName("bc.Lb")
	public static JagString field345 = JagString.wrap("or2");

	@ObfuscatedName("bc.Gb")
	public static JagString field340 = JagString.wrap("gr1");

	@ObfuscatedName("bc.Mb")
	public static JagString field346 = JagString.wrap("bla");

	@ObfuscatedName("bc.Bb")
	public static JagString field335 = JagString.wrap("blu");

	@ObfuscatedName("bc.Sb")
	public static JagString field352 = JagString.wrap("lre");

	@ObfuscatedName("bc.Tb")
	public static JagString field353 = JagString.wrap("dre");

	@ObfuscatedName("bc.Hb")
	public static JagString field341 = JagString.wrap("gr2");

	@ObfuscatedName("bc.Ob")
	public static JagString field348 = JagString.wrap("str");

	@ObfuscatedName("bc.Kb")
	public static JagString field344 = JagString.wrap("gre");

	@ObfuscatedName("bc.Pb")
	public static JagString field349 = JagString.wrap("or3");

	@ObfuscatedName("bc.Xb")
	public static JagString field357 = JagString.wrap("yel");

	@ObfuscatedName("bc.Wb")
	public static JagString field356 = JagString.wrap("gr3");

	@ObfuscatedName("bc.Eb")
	public static JagString field338 = JagString.wrap("whi");

	@ObfuscatedName("bc.Ub")
	public byte[][] field354 = new byte[256][];

	@ObfuscatedName("bc.Qb")
	public int field350 = 0;

	@ObfuscatedName("bc.Ib")
	public final Random field342 = new Random();

	@ObfuscatedName("bc.Yb")
	public boolean field358 = false;

	@ObfuscatedName("bc.Rb")
	public final int[] field351;

	@ObfuscatedName("bc.Nb")
	public final int[] field347;

	@ObfuscatedName("bc.Vb")
	public final int[] field355;

	@ObfuscatedName("bc.Zb")
	public final int field359;

	@ObfuscatedName("bc.d()V")
	public static void method199() {
		field343 = null;
		field344 = null;
		field335 = null;
		field357 = null;
		field333 = null;
		field336 = null;
		field338 = null;
		field346 = null;
		field352 = null;
		field353 = null;
		field339 = null;
		field334 = null;
		field345 = null;
		field349 = null;
		field340 = null;
		field341 = null;
		field356 = null;
		field348 = null;
		field337 = null;
	}

	@ObfuscatedName("bc.a(La;)I")
	public int method193(JagString arg0) {
		if (arg0.strEquals(field343)) {
			return 16711680;
		} else if (arg0.strEquals(field344)) {
			return 65280;
		} else if (arg0.strEquals(field335)) {
			return 255;
		} else if (arg0.strEquals(field357)) {
			return 16776960;
		} else if (arg0.strEquals(field333)) {
			return 65535;
		} else if (arg0.strEquals(field336)) {
			return 16711935;
		} else if (arg0.strEquals(field338)) {
			return 16777215;
		} else if (arg0.strEquals(field346)) {
			return 0;
		} else if (arg0.strEquals(field352)) {
			return 16748608;
		} else if (arg0.strEquals(field353)) {
			return 8388608;
		} else if (arg0.strEquals(field339)) {
			return 128;
		} else if (arg0.strEquals(field334)) {
			return 16756736;
		} else if (arg0.strEquals(field345)) {
			return 16740352;
		} else if (arg0.strEquals(field349)) {
			return 16723968;
		} else if (arg0.strEquals(field340)) {
			return 12648192;
		} else if (arg0.strEquals(field341)) {
			return 8453888;
		} else if (arg0.strEquals(field356)) {
			return 4259584;
		} else {
			if (arg0.strEquals(field348)) {
				this.field358 = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("bc.a([I[BIIIIIII)V")
	public void method194(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("bc.a(La;IIIIIZIII)V")
	public void method195(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return;
		}
		int var11 = 0;
		int var12 = 0;
		JagString var13 = Statics.method566();
		int var14 = -1;
		int var15 = 0;
		JagString var16 = null;
		if (arg9 == 0) {
			arg9 = this.field360;
		}
		boolean var17 = true;
		if (arg4 < this.field360 + this.field359 + arg9 && arg4 < arg9 + arg9) {
			var17 = false;
		}
		int var18 = 0;
		int var19 = arg0.method10();
		for (int var20 = 0; var20 < var19; var20++) {
			int var21 = arg0.method6(var20);
			if (var21 == 64 && var20 + 4 < var19 && arg0.method6(var20 + 4) == 64) {
				var16 = arg0.method19(var20, var20 + 5);
				var13.method23(var16);
				var20 += 4;
			} else if (var21 == 92 && var20 + 1 < var19 && arg0.method6(var20 + 1) == 110) {
				var16 = null;
				field337[var18++] = var13.method19(var12, var13.method10()).method40();
				var12 = var13.method10();
				var11 = 0;
				var14 = -1;
				var20++;
			} else {
				var13.method29(var21);
				var11 += this.method212(var21);
				if (var21 == 32 || var21 == 45) {
					var14 = var13.method10();
					var15 = var11;
				}
				if (var17 && var11 > arg3 && var14 >= 0) {
					field337[var18++] = var13.method19(var12, var14).method40();
					var12 = var14;
					var14 = -1;
					var11 -= var15;
					if (var16 != null && var12 > 4) {
						var12 -= 5;
						var13.method20(var16, var12);
					}
				}
			}
		}
		if (var13.method10() > var12) {
			field337[var18++] = var13.method19(var12, var13.method10()).method40();
		}
		if (arg8 == 3 && var18 == 1) {
			arg8 = 1;
		}
		int var22;
		if (arg8 == 0) {
			var22 = this.field360 + arg2;
		} else if (arg8 == 1) {
			var22 = (arg4 - this.field360 - this.field359 - (var18 - 1) * arg9) / 2 + this.field360 + arg2;
		} else if (arg8 == 2) {
			var22 = arg2 + arg4 - this.field359 - (var18 - 1) * arg9;
		} else {
			int var23 = (arg4 - this.field360 - this.field359 - (var18 - 1) * arg9) / (var18 + 1);
			if (var23 < 0) {
				var23 = 0;
			}
			var22 = this.field360 + arg2 + var23;
			arg9 += var23;
		}
		for (int var24 = 0; var24 < var18; var24++) {
			if (arg7 == 0) {
				this.drawString(field337[var24], arg1, var22, arg5, arg6);
			} else if (arg7 == 1) {
				this.method211(field337[var24], arg3 / 2 + arg1, var22, arg5, arg6);
			} else if (arg7 == 2) {
				this.method200(field337[var24], arg1 + arg3, var22, arg5, arg6);
			} else if (var18 - 1 == var24) {
				this.drawString(field337[var24], arg1, var22, arg5, arg6);
			} else {
				this.method203(field337[var24], arg1, var22, arg5, arg6, arg3);
			}
			var22 += arg9;
		}
	}

	@ObfuscatedName("bc.a(La;IIII)V")
	public void method196(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		int var6 = arg1 - this.method208(arg0) / 2;
		int var7 = arg2 - this.field350;
		for (int var8 = 0; var8 < arg0.field26; var8++) {
			int var9 = arg0.field38[var8] & 0xFF;
			if (var9 != 32) {
				this.method205(this.field354[var9], var6, this.field351[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field347[var9], this.field355[var9], arg3);
			}
			var6 += this.field347[var9];
		}
	}

	@ObfuscatedName("bc.a([I[BIIIIIIII)V")
	public void method197(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		int var12 = 256 - arg9;
		for (int var13 = -arg6; var13 < 0; var13++) {
			for (int var14 = -arg5; var14 < 0; var14++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					int var15 = arg0[arg4];
					arg0[arg4++] = (((var15 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * var12 & 0xFF0000) >> 8) + var11;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("bc.b(La;IIII)V")
	public void method198(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		int var6 = arg1 - this.method208(arg0) / 2;
		int var7 = arg2 - this.field350;
		for (int var8 = 0; var8 < arg0.method10(); var8++) {
			int var9 = arg0.field38[var8] & 0xFF;
			if (var9 != 32) {
				this.method205(this.field354[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field351[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field347[var9], this.field355[var9], arg3);
			}
			var6 += this.field347[var9];
		}
	}

	@ObfuscatedName("bc.a(La;IIIZ)V")
	public void method200(JagString arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.drawString(arg0, arg1 - this.method204(arg0), arg2, arg3, arg4);
	}

	@ObfuscatedName("bc.a(La;IIIII)V")
	public void method201(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		double var7 = 7.0D - (double) arg5 / 8.0D;
		if (var7 < 0.0D) {
			var7 = 0.0D;
		}
		int var9 = arg1 - this.method208(arg0) / 2;
		int var10 = arg2 - this.field350;
		for (int var11 = 0; var11 < arg0.method10(); var11++) {
			int var12 = arg0.field38[var11] & 0xFF;
			if (var12 != 32) {
				this.method205(this.field354[var12], var9, this.field351[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field347[var12], this.field355[var12], arg3);
			}
			var9 += this.field347[var12];
		}
	}

	@ObfuscatedName("bc.a([BIIIIII)V")
	public void method202(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix2D.field2749 * arg2 + arg1;
		int var9 = Pix2D.field2749 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < Pix2D.field2748) {
			int var12 = Pix2D.field2748 - arg2;
			arg4 -= var12;
			arg2 = Pix2D.field2748;
			var11 = arg3 * var12;
			var8 += Pix2D.field2749 * var12;
		}
		if (arg2 + arg4 > Pix2D.field2751) {
			arg4 -= arg2 + arg4 - Pix2D.field2751;
		}
		if (arg1 < Pix2D.field2752) {
			int var13 = Pix2D.field2752 - arg1;
			arg3 -= var13;
			arg1 = Pix2D.field2752;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg1 + arg3 > Pix2D.field2753) {
			int var14 = arg1 + arg3 - Pix2D.field2753;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method197(Pix2D.pixels, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
		}
	}

	@ObfuscatedName("bc.a(La;IIIZI)V")
	public void method203(JagString arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		JagString var7 = arg0.method40();
		int var8 = 0;
		for (int var9 = 0; var9 < var7.method10(); var9++) {
			if (var7.method6(var9) == 32) {
				var8++;
			}
		}
		int var10 = 0;
		int var11 = 0;
		if (var8 > 0) {
			var10 = (arg5 - this.method204(var7)) * 256 / var8;
		}
		this.field358 = false;
		int var12 = arg1;
		if (var7 == null) {
			return;
		}
		int var13 = arg2 - this.field350;
		for (int var14 = 0; var14 < var7.field26; var14++) {
			if (var7.field38[var14] == 64 && var14 + 4 < var7.field26 && var7.field38[var14 + 4] == 64) {
				int var15 = this.method193(var7.method19(var14 + 1, var14 + 4));
				if (var15 != -1) {
					arg3 = var15;
				}
				var14 += 4;
			} else {
				int var16 = var7.field38[var14] & 0xFF;
				if (var16 != 32) {
					if (arg4) {
						this.method205(this.field354[var16], arg1 + 1, this.field351[var16] + var13 + 1, this.field347[var16], this.field355[var16], 0);
					}
					this.method205(this.field354[var16], arg1, this.field351[var16] + var13, this.field347[var16], this.field355[var16], arg3);
				}
				arg1 += this.field347[var16];
				if (var16 == 32) {
					int var17 = var10 + var11;
					arg1 += var17 / 256;
					var11 = var17 & 0xFF;
				}
			}
		}
		if (this.field358) {
			Pix2D.method916(var12, (int) ((double) this.field350 * 0.7D) + var13, arg1 - var12, 8388608);
		}
	}

	@ObfuscatedName("bc.b(La;)I")
	public int method204(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.field26; var3++) {
			if (arg0.field38[var3] == 64 && var3 + 4 < arg0.field26 && arg0.field38[var3 + 4] == 64) {
				var3 += 4;
			} else {
				var2 += this.field347[arg0.field38[var3] & 0xFF];
			}
		}
		return var2;
	}

	@ObfuscatedName("bc.a([BIIIII)V")
	public void method205(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.field2749 * arg2 + arg1;
		int var8 = Pix2D.field2749 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.field2748) {
			int var11 = Pix2D.field2748 - arg2;
			arg4 -= var11;
			arg2 = Pix2D.field2748;
			var10 = arg3 * var11;
			var7 += Pix2D.field2749 * var11;
		}
		if (arg2 + arg4 > Pix2D.field2751) {
			arg4 -= arg2 + arg4 - Pix2D.field2751;
		}
		if (arg1 < Pix2D.field2752) {
			int var12 = Pix2D.field2752 - arg1;
			arg3 -= var12;
			arg1 = Pix2D.field2752;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 > Pix2D.field2753) {
			int var13 = arg1 + arg3 - Pix2D.field2753;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method194(Pix2D.pixels, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("bc.b(La;IIIZ)V")
	public void drawString(JagString arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.field358 = false;
		int var6 = arg1;
		if (arg0 == null) {
			return;
		}
		int var7 = arg2 - this.field350;
		for (int var8 = 0; var8 < arg0.field26; var8++) {
			if (arg0.field38[var8] == 64 && var8 + 4 < arg0.field26 && arg0.field38[var8 + 4] == 64) {
				int var9 = this.method193(arg0.method19(var8 + 1, var8 + 4));
				if (var9 != -1) {
					arg3 = var9;
				}
				var8 += 4;
			} else {
				int var10 = arg0.field38[var8] & 0xFF;
				if (var10 != 32) {
					if (arg4) {
						this.method205(this.field354[var10], arg1 + 1, this.field351[var10] + var7 + 1, this.field347[var10], this.field355[var10], 0);
					}
					this.method205(this.field354[var10], arg1, this.field351[var10] + var7, this.field347[var10], this.field355[var10], arg3);
				}
				arg1 += this.field347[var10];
			}
		}
		if (this.field358) {
			Pix2D.method916(var6, (int) ((double) this.field350 * 0.7D) + var7, arg1 - var6, 8388608);
		}
	}

	@ObfuscatedName("bc.b(La;IIIZI)V")
	public void method207(JagString arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return;
		}
		this.field342.setSeed((long) arg3);
		int var5 = (this.field342.nextInt() & 0x1F) + 192;
		int var6 = 15 - this.field350;
		for (int var7 = 0; var7 < arg0.field26; var7++) {
			if (arg0.field38[var7] == 64 && var7 + 4 < arg0.field26 && arg0.field38[var7 + 4] == 64) {
				int var8 = this.method193(arg0.method19(var7 + 1, var7 + 4));
				if (var8 != -1) {
					arg2 = var8;
				}
				var7 += 4;
			} else {
				int var9 = arg0.field38[var7] & 0xFF;
				if (var9 != 32) {
					this.method202(this.field354[var9], arg1 + 1, this.field351[var9] + var6 + 1, this.field347[var9], this.field355[var9], 0, 192);
					this.method202(this.field354[var9], arg1, this.field351[var9] + var6, this.field347[var9], this.field355[var9], arg2, var5);
				}
				arg1 += this.field347[var9];
				if ((this.field342.nextInt() & 0x3) == 0) {
					arg1++;
				}
			}
		}
	}

	@ObfuscatedName("bc.c(La;)I")
	public int method208(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = 0;
		for (int var3 = 0; var3 < arg0.field26; var3++) {
			var2 += this.field347[arg0.field38[var3] & 0xFF];
		}
		return var2;
	}

	@ObfuscatedName("bc.a(La;III)V")
	public void method209(JagString arg0, int arg1, int arg2, int arg3) {
		this.drawString(arg0, arg1 - this.method208(arg0) / 2, arg2, arg3);
	}

	@ObfuscatedName("bc.b(La;III)V")
	public void method210(JagString arg0, int arg1, int arg2) {
		this.drawString(arg0, 507 - this.method208(arg0), arg1, arg2);
	}

	@ObfuscatedName("bc.c(La;IIIZ)V")
	public void method211(JagString arg0, int arg1, int arg2, int arg3, boolean arg4) {
		this.drawString(arg0, arg1 - this.method204(arg0) / 2, arg2, arg3, arg4);
	}

	public PixFont(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
		this.field351 = arg0;
		this.field347 = arg1;
		this.field355 = arg2;
		byte var6 = 0;
		for (int var7 = 1; var7 < arg3.length; var7++) {
			if (arg3[var7] == 1) {
				var6 = (byte) var7;
			}
		}
		this.field354 = arg4;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		for (int var10 = 0; var10 < 256; var10++) {
			if (this.field351[var10] < var8) {
				var8 = this.field351[var10];
			}
			if (this.field355[var10] + this.field351[var10] > var9) {
				var9 = this.field355[var10] + this.field351[var10];
			}
			byte[] var11 = this.field354[var10];
			int var12 = var11.length;
			for (int var13 = 0; var13 < var12; var13++) {
				var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
			}
		}
		this.field350 = this.field355[32] + this.field351[32];
		this.field360 = this.field350 - var8;
		this.field359 = var9 - this.field350;
	}

	@ObfuscatedName("bc.f(I)I")
	public int method212(int arg0) {
		return this.field347[arg0 & 0xFF];
	}

	@ObfuscatedName("bc.c(La;III)V")
	public void drawString(JagString arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return;
		}
		int var5 = arg2 - this.field350;
		for (int var6 = 0; var6 < arg0.field26; var6++) {
			int var7 = arg0.field38[var6] & 0xFF;
			if (var7 != 32) {
				this.method205(this.field354[var7], arg1, this.field351[var7] + var5, this.field347[var7], this.field355[var7], arg3);
			}
			arg1 += this.field347[var7];
		}
	}
}
