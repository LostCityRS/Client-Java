package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.util.JagString;

import java.util.Random;

@ObfuscatedName("ob")
public abstract class PixFont extends Pix2D {

	@ObfuscatedName("ob.cb")
	public static JagString field2290 = JagString.wrap("lt");
	@ObfuscatedName("ob.jb")
	public static JagString field2297 = JagString.wrap("gt");
	@ObfuscatedName("ob.T")
	public static JagString field2282 = JagString.wrap("img=");
	@ObfuscatedName("ob.yb")
	public static JagString field2312 = JagString.wrap("br");
	@ObfuscatedName("ob.U")
	public static JagString field2283 = JagString.wrap("col=");
	@ObfuscatedName("ob.hb")
	public static JagString field2295 = JagString.wrap(")4col");
	@ObfuscatedName("ob.nb")
	public static JagString field2301 = JagString.wrap("str=");
	@ObfuscatedName("ob.tb")
	public static JagString field2307 = JagString.wrap("str");
	@ObfuscatedName("ob.db")
	public static JagString field2291 = JagString.wrap(")4str");
	@ObfuscatedName("ob.gb")
	public static JagString field2294 = JagString.wrap("u=");
	@ObfuscatedName("ob.ub")
	public static JagString field2308 = JagString.wrap("u");
	@ObfuscatedName("ob.P")
	public static JagString field2279 = JagString.wrap(")4u");
	@ObfuscatedName("ob.ab")
	public static JagString field2288 = JagString.wrap("shad=");
	@ObfuscatedName("ob.vb")
	public static JagString field2309 = JagString.wrap("shad");
	@ObfuscatedName("ob.mb")
	public static JagString field2300 = JagString.wrap(")4shad");
	@ObfuscatedName("ob.bb")
	public int[] field2289;

	@ObfuscatedName("ob.eb")
	public int field2292 = 0;

	@ObfuscatedName("ob.fb")
	public int[] field2293;

	@ObfuscatedName("ob.ib")
	public static Pix8[] modicons;

	@ObfuscatedName("ob.kb")
	public int field2298;

	@ObfuscatedName("ob.lb")
	public static int field2299 = -1;

	@ObfuscatedName("ob.ob")
	public static int field2302 = -1;

	@ObfuscatedName("ob.pb")
	public static int field2303 = 256;

	@ObfuscatedName("ob.qb")
	public static int field2304 = 0;

	@ObfuscatedName("ob.rb")
	public static int field2305 = -1;

	@ObfuscatedName("ob.sb")
	public byte[] field2306;

	@ObfuscatedName("ob.wb")
	public static int field2310 = 0;

	@ObfuscatedName("ob.R")
	public static int field2281 = -1;

	@ObfuscatedName("ob.Q")
	public static int field2280 = 0;

	@ObfuscatedName("ob.Z")
	public static int field2287 = 0;

	@ObfuscatedName("ob.zb")
	public static Random field2313 = new Random();

	@ObfuscatedName("ob.Ab")
	public static JagString[] field2314 = new JagString[100];

	@ObfuscatedName("ob.xb")
	public byte[][] field2311 = new byte[256][];

	@ObfuscatedName("ob.X")
	public int[] field2285;

	@ObfuscatedName("ob.Y")
	public int[] field2286;

	@ObfuscatedName("ob.V")
	public int[] field2284;

	@ObfuscatedName("ob.O")
	public int field2278;

	@ObfuscatedName("ob.a([BIIIII)V")
	public static void method772(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg1 + arg2 * Pix2D.field3240;
		int var7 = Pix2D.field3240 - arg3;
		int var8 = 0;
		int var9 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var10 = Pix2D.clipMinY - arg2;
			arg4 -= var10;
			arg2 = Pix2D.clipMinY;
			var9 = var10 * arg3;
			var6 += var10 * Pix2D.field3240;
		}
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.field3238) {
			int var11 = Pix2D.field3238 - arg1;
			arg3 -= var11;
			arg1 = Pix2D.field3238;
			var9 += var11;
			var6 += var11;
			var8 = var11;
			var7 += var11;
		}
		if (arg1 + arg3 > Pix2D.field3241) {
			int var12 = arg1 + arg3 - Pix2D.field3241;
			arg3 -= var12;
			var8 += var12;
			var7 += var12;
		}
		if (arg3 > 0 && arg4 > 0) {
			method792(Pix2D.field3237, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
		}
	}

	@ObfuscatedName("ob.a([I[BIIIIIIII)V")
	public static void method778(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		int var11 = 256 - arg9;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					int var14 = arg0[arg4];
					arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ob.b([BIIIIII)V")
	public static void method785(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg1 + arg2 * Pix2D.field3240;
		int var8 = Pix2D.field3240 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.clipMinY) {
			int var11 = Pix2D.clipMinY - arg2;
			arg4 -= var11;
			arg2 = Pix2D.clipMinY;
			var10 = var11 * arg3;
			var7 += var11 * Pix2D.field3240;
		}
		if (arg2 + arg4 > Pix2D.clipMaxY) {
			arg4 -= arg2 + arg4 - Pix2D.clipMaxY;
		}
		if (arg1 < Pix2D.field3238) {
			int var12 = Pix2D.field3238 - arg1;
			arg3 -= var12;
			arg1 = Pix2D.field3238;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 > Pix2D.field3241) {
			int var13 = arg1 + arg3 - Pix2D.field3241;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			method778(Pix2D.field3237, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
		}
	}

	@ObfuscatedName("ob.a([I[BIIIIIII)V")
	public static void method792(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
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
			for (int var13 = var10; var13 < 0; var13++) {
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

	@ObfuscatedName("ob.a([[B[[B[I[I[III)I")
	public static int method794(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
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

	public PixFont(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		this.field2285 = arg1;
		this.field2286 = arg2;
		this.field2284 = arg3;
		this.field2293 = arg4;
		this.method774(arg0);
		this.field2311 = arg6;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;
		for (int var10 = 0; var10 < 256; var10++) {
			if (this.field2286[var10] < var8 && this.field2293[var10] != 0) {
				var8 = this.field2286[var10];
			}
			if (this.field2286[var10] + this.field2293[var10] > var9) {
				var9 = this.field2286[var10] + this.field2293[var10];
			}
		}
		this.field2278 = this.field2292 - var8;
		this.field2298 = var9 - this.field2292;
	}

	public PixFont(byte[] arg0) {
		this.method774(arg0);
	}

	@ObfuscatedName("ob.b(Lec;)Lec;")
	public static JagString escape(JagString arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			byte var4 = arg0.field618[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		JagString var5 = new JagString();
		var5.field674 = var1 + var2;
		var5.field618 = new byte[var5.field674];
		int var6 = 0;
		for (int var7 = 0; var7 < var1; var7++) {
			byte var8 = arg0.field618[var7];
			if (var8 == 60) {
				var5.field618[var6++] = 60;
				var5.field618[var6++] = 108;
				var5.field618[var6++] = 116;
				var5.field618[var6++] = 62;
			} else if (var8 == 62) {
				var5.field618[var6++] = 60;
				var5.field618[var6++] = 103;
				var5.field618[var6++] = 116;
				var5.field618[var6++] = 62;
			} else {
				var5.field618[var6++] = var8;
			}
		}
		return var5;
	}

	@ObfuscatedName("ob.a(Lec;IIIIIIIII)I")
	public final int drawStringMultiline(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method781(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.field2292;
		}
		int[] var11 = new int[] { arg3 };
		if (arg4 < this.field2278 + this.field2298 + arg9 && arg4 < arg9 + arg9) {
			var11 = null;
		}
		int var12 = this.method782(arg0, var11, field2314);
		if (arg8 == 3 && var12 == 1) {
			arg8 = 1;
		}
		int var13;
		if (arg8 == 0) {
			var13 = arg2 + this.field2278;
		} else if (arg8 == 1) {
			var13 = arg2 + this.field2278 + (arg4 - this.field2278 - this.field2298 - (var12 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			var13 = arg2 + arg4 - this.field2298 - (var12 - 1) * arg9;
		} else {
			int var14 = (arg4 - this.field2278 - this.field2298 - (var12 - 1) * arg9) / (var12 + 1);
			if (var14 < 0) {
				var14 = 0;
			}
			var13 = arg2 + this.field2278 + var14;
			arg9 += var14;
		}
		for (int var15 = 0; var15 < var12; var15++) {
			if (arg7 == 0) {
				this.method786(field2314[var15], arg1, var13);
			} else if (arg7 == 1) {
				this.method786(field2314[var15], arg1 + (arg3 - this.method770(field2314[var15])) / 2, var13);
			} else if (arg7 == 2) {
				this.method786(field2314[var15], arg1 + arg3 - this.method770(field2314[var15]), var13);
			} else if (var15 == var12 - 1) {
				this.method786(field2314[var15], arg1, var13);
			} else {
				this.method773(field2314[var15], arg3);
				this.method786(field2314[var15], arg1, var13);
				field2280 = 0;
			}
			var13 += arg9;
		}
		return var12;
	}

	@ObfuscatedName("ob.a(Lec;)I")
	public final int method770(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.field674; var5++) {
			int var6 = arg0.field618[var5] & 0xFF;
			if (var6 == 60) {
				var2 = var5;
			} else {
				if (var6 == 62 && var2 != -1) {
					JagString var7 = arg0.substring(var2 + 1, var5);
					var2 = -1;
					if (var7.method272(field2290)) {
						var6 = 60;
					} else {
						if (!var7.method272(field2297)) {
							if (var7.method262(field2282)) {
								try {
									int var8 = var7.method268(4).method261();
									var4 += modicons[var8].field1169;
									var3 = -1;
								} catch (Exception var9) {
								}
							}
							continue;
						}
						var6 = 62;
					}
				}
				if (var2 == -1) {
					var4 += this.field2289[var6];
					if (this.field2306 != null && var3 != -1) {
						var4 += this.field2306[(var3 << 8) + var6];
					}
					var3 = var6;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("ob.a(Lec;I)V")
	public void method773(JagString arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			int var6 = arg0.method260(var5);
			if (var6 == 60) {
				var4 = true;
			} else if (var6 == 62) {
				var4 = false;
			} else if (!var4 && var6 == 32) {
				var3++;
			}
		}
		if (var3 > 0) {
			field2280 = (arg1 - this.method770(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("ob.a([BIIIIII)V")
	public abstract void method750(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("ob.a([B)V")
	public void method774(byte[] arg0) {
		this.field2289 = new int[256];
		if (arg0.length == 257) {
			for (int var2 = 0; var2 < this.field2289.length; var2++) {
				this.field2289[var2] = arg0[var2] & 0xFF;
			}
			this.field2292 = arg0[256] & 0xFF;
			return;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < 256; var4++) {
			this.field2289[var4] = arg0[var3++] & 0xFF;
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
		this.field2306 = new byte[65536];
		for (int var17 = 0; var17 < 256; var17++) {
			if (var17 != 32 && var17 != 160) {
				for (int var18 = 0; var18 < 256; var18++) {
					if (var18 != 32 && var18 != 160) {
						this.field2306[(var17 << 8) + var18] = (byte) method794(var9, var13, var6, this.field2289, var5, var17, var18);
					}
				}
			}
		}
		this.field2292 = var6[32] + var5[32];
	}

	@ObfuscatedName("ob.b(Lec;I)I")
	public final int method775(JagString arg0, int arg1) {
		return this.method782(arg0, new int[] { arg1 }, field2314);
	}

	@ObfuscatedName("ob.e(I)I")
	public int method776(int arg0) {
		return this.field2289[arg0 & 0xFF];
	}

	@ObfuscatedName("ob.a(Lec;IIII)V")
	public final void method777(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method781(arg3, arg4);
			this.method786(arg0, arg1 - this.method770(arg0), arg2);
		}
	}

	@ObfuscatedName("ob.a(Lec;IIIII)V")
	public final void method779(JagString arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method781(16777215, 0);
		field2313.setSeed((long) arg3);
		field2303 = (field2313.nextInt() & 0x1F) + 192;
		int[] var5 = new int[arg0.field674];
		int var6 = 0;
		for (int var7 = 0; var7 < arg0.field674; var7++) {
			var5[var7] = var6;
			if ((field2313.nextInt() & 0x3) == 0) {
				var6++;
			}
		}
		this.method780(arg0, arg1, arg2, var5, null);
	}

	@ObfuscatedName("ob.a(Lec;II[I[I)V")
	public void method780(JagString arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6 = arg2 - this.field2292;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field674; var10++) {
			int var11 = arg0.field618[var10] & 0xFF;
			if (var11 == 60) {
				var7 = var10;
			} else {
				if (var11 == 62 && var7 != -1) {
					JagString var12 = arg0.substring(var7 + 1, var10);
					var7 = -1;
					if (var12.method272(field2290)) {
						var11 = 60;
					} else {
						if (!var12.method272(field2297)) {
							if (var12.method262(field2282)) {
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
									int var15 = var12.method268(4).method261();
									Pix8 var16 = modicons[var15];
									var16.plotSprite(arg1 + var13, var6 + this.field2292 - var16.field1168 + var14);
									arg1 += var16.field1169;
									var8 = -1;
								} catch (Exception var22) {
								}
							} else {
								this.method784(var12);
							}
							continue;
						}
						var11 = 62;
					}
				}
				if (var7 == -1) {
					if (this.field2306 != null && var8 != -1) {
						arg1 += this.field2306[(var8 << 8) + var11];
					}
					int var17 = this.field2284[var11];
					int var18 = this.field2293[var11];
					int var19;
					if (arg3 == null) {
						var19 = 0;
					} else {
						var19 = arg3[var9];
					}
					int var20;
					if (arg4 == null) {
						var20 = 0;
					} else {
						var20 = arg4[var9];
					}
					var9++;
					if (var11 == 32) {
						if (field2280 > 0) {
							field2304 += field2280;
							arg1 += field2304 >> 8;
							field2304 &= 0xFF;
						}
					} else if (field2303 == 256) {
						if (field2281 != -1) {
							method772(this.field2311[var11], arg1 + this.field2285[var11] + var19 + 1, var6 + this.field2286[var11] + 1 + var20, var17, var18, field2281);
						}
						this.method749(this.field2311[var11], arg1 + this.field2285[var11] + var19, var6 + this.field2286[var11] + var20, var17, var18, field2310);
					} else {
						if (field2281 != -1) {
							method785(this.field2311[var11], arg1 + this.field2285[var11] + var19 + 1, var6 + this.field2286[var11] + 1 + var20, var17, var18, field2281, field2303);
						}
						this.method750(this.field2311[var11], arg1 + this.field2285[var11] + var19, var6 + this.field2286[var11] + var20, var17, var18, field2310, field2303);
					}
					int var21 = this.field2289[var11];
					if (field2302 != -1) {
						Pix2D.method1063(arg1, var6 + (int) ((double) this.field2292 * 0.7D), var21, field2302);
					}
					if (field2299 != -1) {
						Pix2D.method1063(arg1, var6 + this.field2292, var21, field2299);
					}
					arg1 += var21;
					var8 = var11;
				}
			}
		}
	}

	@ObfuscatedName("ob.b(II)V")
	public void method781(int arg0, int arg1) {
		field2302 = -1;
		field2299 = -1;
		field2305 = arg1;
		field2281 = arg1;
		field2287 = arg0;
		field2310 = arg0;
		field2303 = 256;
		field2280 = 0;
		field2304 = 0;
	}

	@ObfuscatedName("ob.a(Lec;[I[Lec;)I")
	public int method782(JagString arg0, int[] arg1, JagString[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		int var4 = 0;
		int var5 = 0;
		JagString var6 = JagString.method491(100);
		int var7 = -1;
		int var8 = 0;
		byte var9 = 0;
		int var10 = -1;
		int var11 = -1;
		int var12 = 0;
		int var13 = arg0.length();
		for (int var14 = 0; var14 < var13; var14++) {
			int var15 = arg0.method260(var14);
			if (var15 == 60) {
				var10 = var14;
			} else {
				if (var15 == 62 && var10 != -1) {
					JagString var16 = arg0.substring(var10 + 1, var14);
					var10 = -1;
					var6.method273(60);
					var6.method243(var16);
					var6.method273(62);
					if (var16.method272(field2312)) {
						arg2[var12++] = var6.substring(var5, var6.length());
						var5 = var6.length();
						var4 = 0;
						var7 = -1;
						var11 = -1;
					} else if (var16.method272(field2290)) {
						var4 += this.method776(60);
						if (this.field2306 != null && var11 != -1) {
							var4 += this.field2306[(var11 << 8) + 60];
						}
						var11 = 60;
					} else if (var16.method272(field2297)) {
						var4 += this.method776(62);
						if (this.field2306 != null && var11 != -1) {
							var4 += this.field2306[(var11 << 8) + 62];
						}
						var11 = 62;
					} else if (var16.method262(field2282)) {
						try {
							int var17 = var16.method268(4).method261();
							var4 += modicons[var17].field1169;
							var11 = -1;
						} catch (Exception var18) {
						}
					}
					var15 = -1;
				}
				if (var10 == -1) {
					if (var15 != -1) {
						var6.method273(var15);
						var4 += this.method776(var15);
						if (this.field2306 != null && var11 != -1) {
							var4 += this.field2306[(var11 << 8) + var15];
						}
						var11 = var15;
					}
					if (var15 == 32) {
						var7 = var6.length();
						var8 = var4;
						var9 = 1;
					}
					if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
						arg2[var12++] = var6.substring(var5, var7 - var9);
						var5 = var7;
						var7 = -1;
						var4 -= var8;
						var11 = -1;
					}
					if (var15 == 45) {
						var7 = var6.length();
						var8 = var4;
						var9 = 0;
					}
				}
			}
		}
		if (var6.length() > var5) {
			arg2[var12++] = var6.substring(var5, var6.length());
		}
		return var12;
	}

	@ObfuscatedName("ob.b(Lec;IIIII)V")
	public final void method783(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method781(arg3, 0);
		int[] var6 = new int[arg0.field674];
		for (int var7 = 0; var7 < arg0.field674; var7++) {
			var6[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method780(arg0, arg1 - this.method770(arg0) / 2, arg2, null, var6);
	}

	@ObfuscatedName("ob.c(Lec;)V")
	public void method784(JagString arg0) {
		try {
			if (arg0.method262(field2283)) {
				field2310 = arg0.method268(4).method256(16);
				return;
			}
			if (arg0.method272(field2295)) {
				field2310 = field2287;
				return;
			}
			if (arg0.method262(field2301)) {
				field2302 = arg0.method268(4).method256(16);
				return;
			}
			if (arg0.method272(field2307)) {
				field2302 = 8388608;
				return;
			}
			if (arg0.method272(field2291)) {
				field2302 = -1;
				return;
			}
			if (arg0.method262(field2294)) {
				field2299 = arg0.method268(2).method256(16);
				return;
			}
			if (arg0.method272(field2308)) {
				field2299 = 0;
				return;
			}
			if (arg0.method272(field2279)) {
				field2299 = -1;
				return;
			}
			if (arg0.method262(field2288)) {
				field2281 = arg0.method268(5).method256(16);
				return;
			}
			if (arg0.method272(field2309)) {
				field2281 = 0;
				return;
			}
			if (arg0.method272(field2300)) {
				field2281 = field2305;
				return;
			}
			if (arg0.method272(field2312)) {
				this.method781(field2287, field2305);
				return;
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("ob.a(Lec;II)V")
	public void method786(JagString arg0, int arg1, int arg2) {
		int var4 = arg2 - this.field2292;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.field674; var7++) {
			int var8 = arg0.field618[var7] & 0xFF;
			if (var8 == 60) {
				var5 = var7;
			} else {
				if (var8 == 62 && var5 != -1) {
					JagString var9 = arg0.substring(var5 + 1, var7);
					var5 = -1;
					if (var9.method272(field2290)) {
						var8 = 60;
					} else {
						if (!var9.method272(field2297)) {
							if (var9.method262(field2282)) {
								try {
									int var10 = var9.method268(4).method261();
									Pix8 var11 = modicons[var10];
									var11.plotSprite(arg1, var4 + this.field2292 - var11.field1168);
									arg1 += var11.field1169;
									var6 = -1;
								} catch (Exception var15) {
								}
							} else {
								this.method784(var9);
							}
							continue;
						}
						var8 = 62;
					}
				}
				if (var5 == -1) {
					if (this.field2306 != null && var6 != -1) {
						arg1 += this.field2306[(var6 << 8) + var8];
					}
					int var12 = this.field2284[var8];
					int var13 = this.field2293[var8];
					if (var8 == 32) {
						if (field2280 > 0) {
							field2304 += field2280;
							arg1 += field2304 >> 8;
							field2304 &= 0xFF;
						}
					} else if (field2303 == 256) {
						if (field2281 != -1) {
							method772(this.field2311[var8], arg1 + this.field2285[var8] + 1, var4 + this.field2286[var8] + 1, var12, var13, field2281);
						}
						this.method749(this.field2311[var8], arg1 + this.field2285[var8], var4 + this.field2286[var8], var12, var13, field2310);
					} else {
						if (field2281 != -1) {
							method785(this.field2311[var8], arg1 + this.field2285[var8] + 1, var4 + this.field2286[var8] + 1, var12, var13, field2281, field2303);
						}
						this.method750(this.field2311[var8], arg1 + this.field2285[var8], var4 + this.field2286[var8], var12, var13, field2310, field2303);
					}
					int var14 = this.field2289[var8];
					if (field2302 != -1) {
						Pix2D.method1063(arg1, var4 + (int) ((double) this.field2292 * 0.7D), var14, field2302);
					}
					if (field2299 != -1) {
						Pix2D.method1063(arg1, var4 + this.field2292 + 1, var14, field2299);
					}
					arg1 += var14;
					var6 = var8;
				}
			}
		}
	}

	@ObfuscatedName("ob.b([BIIIII)V")
	public abstract void method749(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("ob.c(Lec;IIIII)V")
	public final void method787(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method781(arg3, 0);
		int[] var6 = new int[arg0.field674];
		int[] var7 = new int[arg0.field674];
		for (int var8 = 0; var8 < arg0.field674; var8++) {
			var6[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			var7[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method780(arg0, arg1 - this.method770(arg0) / 2, arg2, var6, var7);
	}

	@ObfuscatedName("ob.c(Lec;I)I")
	public final int method789(JagString arg0, int arg1) {
		int var3 = this.method782(arg0, new int[] { arg1 }, field2314);
		int var4 = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = this.method770(field2314[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}
		return var4;
	}

	@ObfuscatedName("ob.a(Lec;IIIIII)V")
	public final void method790(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method781(arg3, 0);
		double var7 = 7.0D - (double) arg5 / 8.0D;
		if (var7 < 0.0D) {
			var7 = 0.0D;
		}
		int[] var9 = new int[arg0.field674];
		for (int var10 = 0; var10 < arg0.field674; var10++) {
			var9[var10] = (int) (Math.sin((double) var10 / 1.5D + (double) arg4) * var7);
		}
		this.method780(arg0, arg1 - this.method770(arg0) / 2, arg2, null, var9);
	}

	@ObfuscatedName("ob.b(Lec;IIII)V")
	public final void method791(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method781(arg3, arg4);
			this.method786(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("ob.c(Lec;IIII)V")
	public final void centreString(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method781(arg3, arg4);
			this.method786(arg0, arg1 - this.method770(arg0) / 2, arg2);
		}
	}
}
