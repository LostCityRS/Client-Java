package deob;

import java.util.Random;

@ObfuscatedName("cc")
public abstract class class26 extends class136 {

	@ObfuscatedName("cc.ab")
	public int[] field429;

	@ObfuscatedName("cc.bb")
	public int[] field430;

	@ObfuscatedName("cc.cb")
	public static final class88 field431 = class208.method1423(105, "copy");

	@ObfuscatedName("cc.db")
	public int[] field432;

	@ObfuscatedName("cc.eb")
	public static int field433 = -1;

	@ObfuscatedName("cc.fb")
	public static final class88 field434 = class208.method1423(105, "gt");

	@ObfuscatedName("cc.gb")
	public static int field435 = 0;

	@ObfuscatedName("cc.hb")
	public static final class88 field436 = class208.method1423(105, "trans=");

	@ObfuscatedName("cc.ib")
	public static final class88 field437 = class208.method1423(105, "shy");

	@ObfuscatedName("cc.jb")
	public static final class88 field438 = class208.method1423(105, "shad");

	@ObfuscatedName("cc.kb")
	public static final class88 field439 = class208.method1423(105, "col=");

	@ObfuscatedName("cc.lb")
	public static final class88 field440 = class208.method1423(105, ")4str");

	@ObfuscatedName("cc.mb")
	public static final class88 field441 = class208.method1423(105, "lt");

	@ObfuscatedName("cc.nb")
	public static final class88 field442 = class208.method1423(105, ")4trans");

	@ObfuscatedName("cc.ob")
	public static final class88 field443 = class208.method1423(105, ")4col");

	@ObfuscatedName("cc.pb")
	public static int field444 = 0;

	@ObfuscatedName("cc.qb")
	public static final class88 field445 = class208.method1423(105, "u");

	@ObfuscatedName("cc.rb")
	public static final class88 field446 = class208.method1423(105, "str");

	@ObfuscatedName("cc.sb")
	public static final class88 field447 = class208.method1423(105, "img=");

	@ObfuscatedName("cc.tb")
	public int[] field448;

	@ObfuscatedName("cc.ub")
	public static final class88[] field449 = new class88[100];

	@ObfuscatedName("cc.vb")
	public static int field450 = 256;

	@ObfuscatedName("cc.H")
	public static final class88 field410 = class208.method1423(105, "br");

	@ObfuscatedName("cc.M")
	public static final class88 field415 = class208.method1423(105, "shad=");

	@ObfuscatedName("cc.I")
	public static final class88 field411 = class208.method1423(105, "times");

	@ObfuscatedName("cc.Q")
	public static final class88 field419 = class208.method1423(105, "nbsp");

	@ObfuscatedName("cc.J")
	public static final class88 field412 = class208.method1423(105, "reg");

	@ObfuscatedName("cc.D")
	public static final class88 field406 = class208.method1423(105, "euro");

	@ObfuscatedName("cc.T")
	public static int field422 = 256;

	@ObfuscatedName("cc.Z")
	public static int field428 = -1;

	@ObfuscatedName("cc.L")
	public static int field414 = 0;

	@ObfuscatedName("cc.K")
	public static final class88 field413 = class208.method1423(105, ")4shad");

	@ObfuscatedName("cc.R")
	public static final class88 field420 = class208.method1423(105, "str=");

	@ObfuscatedName("cc.S")
	public static final class88 field421 = class208.method1423(105, ")4u");

	@ObfuscatedName("cc.P")
	public static int field418 = 0;

	@ObfuscatedName("cc.W")
	public static int field425 = -1;

	@ObfuscatedName("cc.V")
	public static final class88 field424 = class208.method1423(105, "u=");

	@ObfuscatedName("cc.G")
	public static int field409 = -1;

	@ObfuscatedName("cc.N")
	public int field416 = 0;

	@ObfuscatedName("cc.X")
	public int[] field426;

	@ObfuscatedName("cc.F")
	public int[] field408;

	@ObfuscatedName("cc.O")
	public int field417;

	@ObfuscatedName("cc.Y")
	public int field427;

	@ObfuscatedName("cc.E")
	public byte[] field407;

	@ObfuscatedName("cc.U")
	public class130[] field423;

	@ObfuscatedName("cc.a([[B[[B[I[I[III)I")
	public static int method157(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
		int var7 = arg2[arg5];
		int var8 = var7 + arg4[arg5];
		int var9 = arg2[arg6];
		int var10 = var9 + arg4[arg6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}
		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}
		int var13 = arg3[arg5];
		if (arg3[arg6] < var13) {
			var13 = arg3[arg6];
		}
		byte[] var14 = arg1[arg5];
		byte[] var15 = arg0[arg6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;
		for (int var18 = var11; var18 < var12; var18++) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}
		return -var13;
	}

	@ObfuscatedName("cc.c(Li;)Li;")
	public static class88 method162(class88 arg0) {
		int var1 = arg0.method604();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			byte var4 = arg0.field1643[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		class88 var5 = new class88();
		var5.field1660 = var1 + var2;
		var5.field1643 = new byte[var5.field1660];
		int var6 = 0;
		for (int var7 = 0; var7 < var1; var7++) {
			byte var8 = arg0.field1643[var7];
			if (var8 == 60) {
				var5.field1643[var6++] = 60;
				var5.field1643[var6++] = 108;
				var5.field1643[var6++] = 116;
				var5.field1643[var6++] = 62;
			} else if (var8 == 62) {
				var5.field1643[var6++] = 60;
				var5.field1643[var6++] = 103;
				var5.field1643[var6++] = 116;
				var5.field1643[var6++] = 62;
			} else {
				var5.field1643[var6++] = var8;
			}
		}
		return var5;
	}

	public class26(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
		this.field426 = arg1;
		this.field448 = arg2;
		this.field429 = arg3;
		this.field408 = arg4;
		this.method148(arg0);
		int var6 = Integer.MAX_VALUE;
		int var7 = Integer.MIN_VALUE;
		for (int var8 = 0; var8 < 256; var8++) {
			if (this.field448[var8] < var6 && this.field408[var8] != 0) {
				var6 = this.field448[var8];
			}
			if (this.field448[var8] + this.field408[var8] > var7) {
				var7 = this.field448[var8] + this.field408[var8];
			}
		}
		this.field417 = this.field416 - var6;
		this.field427 = var7 - this.field416;
	}

	public class26(byte[] arg0) {
		this.method148(arg0);
	}

	@ObfuscatedName("cc.a(Li;II)V")
	public void method137(class88 arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field416;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.field1660; var7++) {
			int var8 = arg0.field1643[var7] & 0xFF;
			if (var8 == 60) {
				var5 = var7;
			} else {
				if (var8 == 62 && var5 != -1) {
					class88 var9 = arg0.method623(var5 + 1, var7);
					var5 = -1;
					if (var9.method597(-119, field441)) {
						var8 = 60;
					} else if (var9.method597(-124, field434)) {
						var8 = 62;
					} else if (var9.method597(-109, field419)) {
						var8 = 160;
					} else if (var9.method597(-111, field437)) {
						var8 = 173;
					} else if (var9.method597(-122, field411)) {
						var8 = 215;
					} else if (var9.method597(-126, field406)) {
						var8 = 128;
					} else if (var9.method597(-104, field431)) {
						var8 = 169;
					} else {
						if (!var9.method597(-123, field412)) {
							if (var9.method619(field447)) {
								try {
									int var10 = var9.method635(4).method603();
									class130 var11 = this.field423[var10];
									int var12 = this.field430 == null ? var11.field2439 : this.field430[var10];
									if (field450 == 256) {
										var11.method876(arg1, var4 + this.field416 - var12);
									} else {
										var11.method877(arg1, var4 + this.field416 - var12, field450);
									}
									arg1 += var11.field2433;
									var6 = -1;
								} catch (Exception var16) {
								}
							} else {
								this.method155(var9);
							}
							continue;
						}
						var8 = 174;
					}
				}
				if (var5 == -1) {
					if (this.field407 != null && var6 != -1) {
						arg1 += this.field407[(var6 << 8) + var8];
					}
					int var13 = this.field429[var8];
					int var14 = this.field408[var8];
					if (var8 == 32) {
						if (field435 > 0) {
							field414 += field435;
							arg1 += field414 >> 8;
							field414 &= 0xFF;
						}
					} else if (field450 == 256) {
						if (field428 != -1) {
							this.method142(var8, arg1 + this.field426[var8] + 1, var4 + this.field448[var8] + 1, var13, var14, field428);
						}
						this.method143(var8, arg1 + this.field426[var8], var4 + this.field448[var8], var13, var14, field444);
					} else {
						if (field428 != -1) {
							this.method160(var8, arg1 + this.field426[var8] + 1, var4 + this.field448[var8] + 1, var13, var14, field428, field450);
						}
						this.method147(var8, arg1 + this.field426[var8], var4 + this.field448[var8], var13, var14, field444, field450);
					}
					int var15 = this.field432[var8];
					if (field433 != -1) {
						class72.method489(arg1, var4 + (int) ((double) this.field416 * 0.7D), var15, field433);
					}
					if (field409 != -1) {
						class72.method489(arg1, var4 + this.field416 + 1, var15, field409);
					}
					arg1 += var15;
					var6 = var8;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;I)V")
	public void method138(class88 arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.method604(); var5++) {
			int var6 = arg0.method599(var5);
			if (var6 == 60) {
				var4 = true;
			} else if (var6 == 62) {
				var4 = false;
			} else if (!var4 && var6 == 32) {
				var3++;
			}
		}
		if (var3 > 0) {
			field435 = (arg1 - this.method158(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("cc.d(I)I")
	public int method139(int arg0) {
		return this.field432[arg0 & 0xFF];
	}

	@ObfuscatedName("cc.a(Li;[I[Li;)I")
	public int method140(class88 arg0, int[] arg1, class88[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		int var4 = 0;
		int var5 = 0;
		class88 var6 = class165.method1135(100);
		int var7 = -1;
		int var8 = 0;
		byte var9 = 0;
		int var10 = -1;
		int var11 = -1;
		int var12 = 0;
		int var13 = arg0.method604();
		for (int var14 = 0; var14 < var13; var14++) {
			int var15 = arg0.method599(var14);
			if (var15 == 60) {
				var10 = var14;
			} else {
				if (var15 == 62 && var10 != -1) {
					class88 var16 = arg0.method623(var10 + 1, var14);
					var10 = -1;
					var6.method638(60);
					var6.method616(var16);
					var6.method638(62);
					if (var16.method597(-110, field410)) {
						arg2[var12++] = var6.method623(var5, var6.method604());
						var5 = var6.method604();
						var4 = 0;
						var7 = -1;
						var11 = -1;
					} else if (var16.method597(-118, field441)) {
						var4 += this.method139(60);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 60];
						}
						var11 = 60;
					} else if (var16.method597(-111, field434)) {
						var4 += this.method139(62);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 62];
						}
						var11 = 62;
					} else if (var16.method597(-117, field419)) {
						var4 += this.method139(160);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 160];
						}
						var11 = 160;
					} else if (var16.method597(-116, field437)) {
						var4 += this.method139(173);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 173];
						}
						var11 = 173;
					} else if (var16.method597(-105, field411)) {
						var4 += this.method139(215);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 215];
						}
						var11 = 215;
					} else if (var16.method597(-122, field406)) {
						var4 += this.method139(128);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 128];
						}
						var11 = 128;
					} else if (var16.method597(-118, field431)) {
						var4 += this.method139(169);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 169];
						}
						var11 = 169;
					} else if (var16.method597(-115, field412)) {
						var4 += this.method139(174);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 174];
						}
						var11 = 174;
					} else if (var16.method619(field447)) {
						try {
							int var17 = var16.method635(4).method603();
							var4 += this.field423[var17].field2433;
							var11 = -1;
						} catch (Exception var18) {
						}
					}
					var15 = -1;
				}
				if (var10 == -1) {
					if (var15 != -1) {
						var6.method638(var15);
						var4 += this.method139(var15);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + var15];
						}
						var11 = var15;
					}
					if (var15 == 32) {
						var7 = var6.method604();
						var8 = var4;
						var9 = 1;
					}
					if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
						arg2[var12++] = var6.method623(var5, var7 - var9);
						var5 = var7;
						var7 = -1;
						var4 -= var8;
						var11 = -1;
					}
					if (var15 == 45) {
						var7 = var6.method604();
						var8 = var4;
						var9 = 0;
					}
				}
			}
		}
		if (var6.method604() > var5) {
			arg2[var12++] = var6.method623(var5, var6.method604());
		}
		return var12;
	}

	@ObfuscatedName("cc.a(Li;IIII)V")
	public final void method141(class88 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method161(arg3, arg4);
			this.method137(arg0, arg1 - this.method158(arg0) / 2, arg2);
		}
	}

	@ObfuscatedName("cc.a(IIIIII)V")
	public abstract void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("cc.b(IIIIII)V")
	public abstract void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("cc.a(Li;IIIII)V")
	public final void method144(class88 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		int[] var6 = new int[arg0.field1660];
		for (int var7 = 0; var7 < arg0.field1660; var7++) {
			var6[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method151(arg0, arg1 - this.method158(arg0) / 2, arg2, null, var6);
	}

	@ObfuscatedName("cc.b(Li;IIIII)V")
	public final void method145(class88 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		int[] var6 = new int[arg0.field1660];
		int[] var7 = new int[arg0.field1660];
		for (int var8 = 0; var8 < arg0.field1660; var8++) {
			var6[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			var7[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method151(arg0, arg1 - this.method158(arg0) / 2, arg2, var6, var7);
	}

	@ObfuscatedName("cc.a(III)V")
	public void method146(int arg0, int arg1, int arg2) {
		field433 = -1;
		field409 = -1;
		field425 = arg1;
		field428 = arg1;
		field418 = arg0;
		field444 = arg0;
		field422 = arg2;
		field450 = arg2;
		field435 = 0;
		field414 = 0;
	}

	@ObfuscatedName("cc.a(IIIIIII)V")
	public abstract void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("cc.a([B)V")
	public void method148(byte[] arg0) {
		this.field432 = new int[256];
		if (arg0.length == 257) {
			for (int var2 = 0; var2 < this.field432.length; var2++) {
				this.field432[var2] = arg0[var2] & 0xFF;
			}
			this.field416 = arg0[256] & 0xFF;
			return;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < 256; var4++) {
			this.field432[var4] = arg0[var3++] & 0xFF;
		}
		int[] var5 = new int[256];
		int[] var6 = new int[256];
		for (int var7 = 0; var7 < 256; var7++) {
			var5[var7] = arg0[var3++] & 0xFF;
		}
		for (int var8 = 0; var8 < 256; var8++) {
			var6[var8] = arg0[var3++] & 0xFF;
		}
		byte[][] var9 = new byte[256][];
		for (int var10 = 0; var10 < 256; var10++) {
			var9[var10] = new byte[var5[var10]];
			byte var11 = 0;
			for (int var12 = 0; var12 < var9[var10].length; var12++) {
				var11 += arg0[var3++];
				var9[var10][var12] = var11;
			}
		}
		byte[][] var13 = new byte[256][];
		for (int var14 = 0; var14 < 256; var14++) {
			var13[var14] = new byte[var5[var14]];
			byte var15 = 0;
			for (int var16 = 0; var16 < var13[var14].length; var16++) {
				var15 += arg0[var3++];
				var13[var14][var16] = var15;
			}
		}
		this.field407 = new byte[65536];
		for (int var17 = 0; var17 < 256; var17++) {
			if (var17 != 32 && var17 != 160) {
				for (int var18 = 0; var18 < 256; var18++) {
					if (var18 != 32 && var18 != 160) {
						this.field407[(var17 << 8) + var18] = (byte) method157(var9, var13, var6, this.field432, var5, var17, var18);
					}
				}
			}
		}
		this.field416 = var6[32] + var5[32];
	}

	@ObfuscatedName("cc.a([Llj;[I)V")
	public final void method149(class130[] arg0, int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.field423 = arg0;
		this.field430 = arg1;
	}

	@ObfuscatedName("cc.b(Li;IIII)V")
	public final void method150(class88 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method161(arg3, arg4);
			this.method137(arg0, arg1 - this.method158(arg0), arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;II[I[I)V")
	public void method151(class88 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6 = arg2 - this.field416;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field1660; var10++) {
			int var11 = arg0.field1643[var10] & 0xFF;
			if (var11 == 60) {
				var7 = var10;
			} else {
				if (var11 == 62 && var7 != -1) {
					class88 var12 = arg0.method623(var7 + 1, var10);
					var7 = -1;
					if (var12.method597(-112, field441)) {
						var11 = 60;
					} else if (var12.method597(-106, field434)) {
						var11 = 62;
					} else if (var12.method597(-122, field419)) {
						var11 = 160;
					} else if (var12.method597(-128, field437)) {
						var11 = 173;
					} else if (var12.method597(-127, field411)) {
						var11 = 215;
					} else if (var12.method597(-128, field406)) {
						var11 = 128;
					} else if (var12.method597(-123, field431)) {
						var11 = 169;
					} else {
						if (!var12.method597(-128, field412)) {
							if (var12.method619(field447)) {
								try {
									int var13;
									if (arg3 == null) {
										var13 = 0;
									} else {
										var13 = arg3[var9];
									}
									int var14;
									if (arg4 == null) {
										var14 = 0;
									} else {
										var14 = arg4[var9];
									}
									var9++;
									int var15 = var12.method635(4).method603();
									class130 var16 = this.field423[var15];
									int var17 = this.field430 == null ? var16.field2439 : this.field430[var15];
									if (field450 == 256) {
										var16.method876(arg1 + var13, var6 + this.field416 - var17 + var14);
									} else {
										var16.method877(arg1 + var13, var6 + this.field416 - var17 + var14, field450);
									}
									arg1 += var16.field2433;
									var8 = -1;
								} catch (Exception var23) {
								}
							} else {
								this.method155(var12);
							}
							continue;
						}
						var11 = 174;
					}
				}
				if (var7 == -1) {
					if (this.field407 != null && var8 != -1) {
						arg1 += this.field407[(var8 << 8) + var11];
					}
					int var18 = this.field429[var11];
					int var19 = this.field408[var11];
					int var20;
					if (arg3 == null) {
						var20 = 0;
					} else {
						var20 = arg3[var9];
					}
					int var21;
					if (arg4 == null) {
						var21 = 0;
					} else {
						var21 = arg4[var9];
					}
					var9++;
					if (var11 == 32) {
						if (field435 > 0) {
							field414 += field435;
							arg1 += field414 >> 8;
							field414 &= 0xFF;
						}
					} else if (field450 == 256) {
						if (field428 != -1) {
							this.method142(var11, arg1 + this.field426[var11] + var20 + 1, var6 + this.field448[var11] + 1 + var21, var18, var19, field428);
						}
						this.method143(var11, arg1 + this.field426[var11] + var20, var6 + this.field448[var11] + var21, var18, var19, field444);
					} else {
						if (field428 != -1) {
							this.method160(var11, arg1 + this.field426[var11] + var20 + 1, var6 + this.field448[var11] + 1 + var21, var18, var19, field428, field450);
						}
						this.method147(var11, arg1 + this.field426[var11] + var20, var6 + this.field448[var11] + var21, var18, var19, field444, field450);
					}
					int var22 = this.field432[var11];
					if (field433 != -1) {
						class72.method489(arg1, var6 + (int) ((double) this.field416 * 0.7D), var22, field433);
					}
					if (field409 != -1) {
						class72.method489(arg1, var6 + this.field416, var22, field409);
					}
					arg1 += var22;
					var8 = var11;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;IIIIIIIIII)I")
	public int method152(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method146(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.field416;
		}
		int[] var11 = new int[] { arg3 };
		if (arg4 < this.field417 + this.field427 + arg9 && arg4 < arg9 + arg9) {
			var11 = null;
		}
		int var12 = this.method140(arg0, var11, field449);
		if (arg8 == 3 && var12 == 1) {
			arg8 = 1;
		}
		int var13;
		if (arg8 == 0) {
			var13 = arg2 + this.field417;
		} else if (arg8 == 1) {
			var13 = arg2 + this.field417 + (arg4 - this.field417 - this.field427 - (var12 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			var13 = arg2 + arg4 - this.field427 - (var12 - 1) * arg9;
		} else {
			int var14 = (arg4 - this.field417 - this.field427 - (var12 - 1) * arg9) / (var12 + 1);
			if (var14 < 0) {
				var14 = 0;
			}
			var13 = arg2 + this.field417 + var14;
			arg9 += var14;
		}
		for (int var15 = 0; var15 < var12; var15++) {
			if (arg7 == 0) {
				this.method137(field449[var15], arg1, var13);
			} else if (arg7 == 1) {
				this.method137(field449[var15], arg1 + (arg3 - this.method158(field449[var15])) / 2, var13);
			} else if (arg7 == 2) {
				this.method137(field449[var15], arg1 + arg3 - this.method158(field449[var15]), var13);
			} else if (var15 == var12 - 1) {
				this.method137(field449[var15], arg1, var13);
			} else {
				this.method138(field449[var15], arg3);
				this.method137(field449[var15], arg1, var13);
				field435 = 0;
			}
			var13 += arg9;
		}
		return var12;
	}

	@ObfuscatedName("cc.a(Li;IIIIIIIII)I")
	public final int method153(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		return this.method152(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("cc.c(Li;IIII)V")
	public final void method154(class88 arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method161(arg3, arg4);
			this.method137(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;)V")
	public void method155(class88 arg0) {
		try {
			if (arg0.method619(field439)) {
				field444 = arg0.method635(4).method607(16);
				return;
			}
			if (arg0.method597(-117, field443)) {
				field444 = field418;
				return;
			}
			if (arg0.method619(field436)) {
				field450 = arg0.method635(6).method603();
				return;
			}
			if (arg0.method597(-112, field442)) {
				field450 = field422;
				return;
			}
			if (arg0.method619(field420)) {
				field433 = arg0.method635(4).method607(16);
				return;
			}
			if (arg0.method597(-116, field446)) {
				field433 = 8388608;
				return;
			}
			if (arg0.method597(-112, field440)) {
				field433 = -1;
				return;
			}
			if (arg0.method619(field424)) {
				field409 = arg0.method635(2).method607(16);
				return;
			}
			if (arg0.method597(-113, field445)) {
				field409 = 0;
				return;
			}
			if (arg0.method597(-118, field421)) {
				field409 = -1;
				return;
			}
			if (arg0.method619(field415)) {
				field428 = arg0.method635(5).method607(16);
				return;
			}
			if (arg0.method597(-125, field438)) {
				field428 = 0;
				return;
			}
			if (arg0.method597(-122, field413)) {
				field428 = field425;
				return;
			}
			if (arg0.method597(-110, field410)) {
				this.method146(field418, field425, field422);
				return;
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("cc.b(Li;I)I")
	public final int method156(class88 arg0, int arg1) {
		int var3 = this.method140(arg0, new int[] { arg1 }, field449);
		int var4 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.method158(field449[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}
		return var4;
	}

	@ObfuscatedName("cc.b(Li;)I")
	public final int method158(class88 arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.field1660; var5++) {
			int var6 = arg0.field1643[var5] & 0xFF;
			if (var6 == 60) {
				var2 = var5;
			} else {
				if (var6 == 62 && var2 != -1) {
					class88 var7 = arg0.method623(var2 + 1, var5);
					var2 = -1;
					if (var7.method597(-122, field441)) {
						var6 = 60;
					} else if (var7.method597(-109, field434)) {
						var6 = 62;
					} else if (var7.method597(-116, field419)) {
						var6 = 160;
					} else if (var7.method597(-122, field437)) {
						var6 = 173;
					} else if (var7.method597(-118, field411)) {
						var6 = 215;
					} else if (var7.method597(-115, field406)) {
						var6 = 128;
					} else if (var7.method597(-119, field431)) {
						var6 = 169;
					} else {
						if (!var7.method597(-128, field412)) {
							if (var7.method619(field447)) {
								try {
									int var8 = var7.method635(4).method603();
									var4 += this.field423[var8].field2433;
									var3 = -1;
								} catch (Exception var9) {
								}
							}
							continue;
						}
						var6 = 174;
					}
				}
				if (var2 == -1) {
					var4 += this.field432[var6];
					if (this.field407 != null && var3 != -1) {
						var4 += this.field407[(var3 << 8) + var6];
					}
					var3 = var6;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("cc.b(IIIIIII)V")
	public abstract void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("cc.b(II)V")
	public void method161(int arg0, int arg1) {
		field433 = -1;
		field409 = -1;
		field425 = arg1;
		field428 = arg1;
		field418 = arg0;
		field444 = arg0;
		field422 = 256;
		field450 = 256;
		field435 = 0;
		field414 = 0;
	}

	@ObfuscatedName("cc.c(Li;I)I")
	public final int method163(class88 arg0, int arg1) {
		return this.method140(arg0, new int[] { arg1 }, field449);
	}

	@ObfuscatedName("cc.a(Li;IIIIII)V")
	public final void method164(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		double var7 = 7.0D - (double) arg5 / 8.0D;
		if (var7 < 0.0D) {
			var7 = 0.0D;
		}
		int[] var9 = new int[arg0.field1660];
		for (int var10 = 0; var10 < arg0.field1660; var10++) {
			var9[var10] = (int) (Math.sin((double) var10 / 1.5D + (double) arg4) * var7);
		}
		this.method151(arg0, arg1 - this.method158(arg0) / 2, arg2, null, var9);
	}

	@ObfuscatedName("cc.a(Li;IIIILjava/util/Random;I)I")
	public final int method165(class88 arg0, int arg1, int arg2, Random arg3, int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method146(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		int[] var6 = new int[arg0.field1660];
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.field1660; var8++) {
			var6[var8] = var7;
			if ((arg3.nextInt() & 0x3) == 0) {
				var7++;
			}
		}
		this.method151(arg0, arg1, arg2, var6, null);
		return var7;
	}
}
