package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.jstring.JagString;

import java.util.Random;

@ObfuscatedName("cc")
public abstract class PixfontGeneric extends Linkable2 {

	@ObfuscatedName("cc.ab")
	public int[] field429;

	@ObfuscatedName("cc.bb")
	public int[] field430;

	@ObfuscatedName("cc.cb")
	public static final JagString field431 = JagString.wrap("copy");

	@ObfuscatedName("cc.db")
	public int[] field432;

	@ObfuscatedName("cc.eb")
	public static int field433 = -1;

	@ObfuscatedName("cc.fb")
	public static final JagString field434 = JagString.wrap("gt");

	@ObfuscatedName("cc.gb")
	public static int field435 = 0;

	@ObfuscatedName("cc.hb")
	public static final JagString field436 = JagString.wrap("trans=");

	@ObfuscatedName("cc.ib")
	public static final JagString field437 = JagString.wrap("shy");

	@ObfuscatedName("cc.jb")
	public static final JagString field438 = JagString.wrap("shad");

	@ObfuscatedName("cc.kb")
	public static final JagString field439 = JagString.wrap("col=");

	@ObfuscatedName("cc.lb")
	public static final JagString field440 = JagString.wrap(")4str");

	@ObfuscatedName("cc.mb")
	public static final JagString field441 = JagString.wrap("lt");

	@ObfuscatedName("cc.nb")
	public static final JagString field442 = JagString.wrap(")4trans");

	@ObfuscatedName("cc.ob")
	public static final JagString field443 = JagString.wrap(")4col");

	@ObfuscatedName("cc.pb")
	public static int field444 = 0;

	@ObfuscatedName("cc.qb")
	public static final JagString field445 = JagString.wrap("u");

	@ObfuscatedName("cc.rb")
	public static final JagString field446 = JagString.wrap("str");

	@ObfuscatedName("cc.sb")
	public static final JagString field447 = JagString.wrap("img=");

	@ObfuscatedName("cc.tb")
	public int[] field448;

	@ObfuscatedName("cc.ub")
	public static final JagString[] field449 = new JagString[100];

	@ObfuscatedName("cc.vb")
	public static int field450 = 256;

	@ObfuscatedName("cc.H")
	public static final JagString field410 = JagString.wrap("br");

	@ObfuscatedName("cc.M")
	public static final JagString field415 = JagString.wrap("shad=");

	@ObfuscatedName("cc.I")
	public static final JagString field411 = JagString.wrap("times");

	@ObfuscatedName("cc.Q")
	public static final JagString field419 = JagString.wrap("nbsp");

	@ObfuscatedName("cc.J")
	public static final JagString field412 = JagString.wrap("reg");

	@ObfuscatedName("cc.D")
	public static final JagString field406 = JagString.wrap("euro");

	@ObfuscatedName("cc.T")
	public static int field422 = 256;

	@ObfuscatedName("cc.Z")
	public static int field428 = -1;

	@ObfuscatedName("cc.L")
	public static int field414 = 0;

	@ObfuscatedName("cc.K")
	public static final JagString field413 = JagString.wrap(")4shad");

	@ObfuscatedName("cc.R")
	public static final JagString field420 = JagString.wrap("str=");

	@ObfuscatedName("cc.S")
	public static final JagString field421 = JagString.wrap(")4u");

	@ObfuscatedName("cc.P")
	public static int field418 = 0;

	@ObfuscatedName("cc.W")
	public static int field425 = -1;

	@ObfuscatedName("cc.V")
	public static final JagString field424 = JagString.wrap("u=");

	@ObfuscatedName("cc.G")
	public static int field409 = -1;

	@ObfuscatedName("cc.N")
	public int ascent = 0;

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
	public Pix8[] field423;

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
	public static JagString method162(JagString arg0) {
		int var1 = arg0.method604();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			byte var4 = arg0.chars[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}
		JagString var5 = new JagString();
		var5.length = var1 + var2;
		var5.chars = new byte[var5.length];
		int var6 = 0;
		for (int var7 = 0; var7 < var1; var7++) {
			byte var8 = arg0.chars[var7];
			if (var8 == 60) {
				var5.chars[var6++] = 60;
				var5.chars[var6++] = 108;
				var5.chars[var6++] = 116;
				var5.chars[var6++] = 62;
			} else if (var8 == 62) {
				var5.chars[var6++] = 60;
				var5.chars[var6++] = 103;
				var5.chars[var6++] = 116;
				var5.chars[var6++] = 62;
			} else {
				var5.chars[var6++] = var8;
			}
		}
		return var5;
	}

	public PixfontGeneric(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
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
		this.field417 = this.ascent - var6;
		this.field427 = var7 - this.ascent;
	}

	public PixfontGeneric(byte[] arg0) {
		this.method148(arg0);
	}

	@ObfuscatedName("cc.a(Li;II)V")
	public void method137(JagString arg0, int arg1, int arg2) {
		int var4 = arg2 - this.ascent;
		int var5 = -1;
		int var6 = -1;
		for (int var7 = 0; var7 < arg0.length; var7++) {
			int var8 = arg0.chars[var7] & 0xFF;
			if (var8 == 60) {
				var5 = var7;
			} else {
				if (var8 == 62 && var5 != -1) {
					JagString var9 = arg0.method623(var5 + 1, var7);
					var5 = -1;
					if (var9.method597(field441)) {
						var8 = 60;
					} else if (var9.method597(field434)) {
						var8 = 62;
					} else if (var9.method597(field419)) {
						var8 = 160;
					} else if (var9.method597(field437)) {
						var8 = 173;
					} else if (var9.method597(field411)) {
						var8 = 215;
					} else if (var9.method597(field406)) {
						var8 = 128;
					} else if (var9.method597(field431)) {
						var8 = 169;
					} else {
						if (!var9.method597(field412)) {
							if (var9.method619(field447)) {
								try {
									int var10 = var9.method635(4).method603();
									Pix8 var11 = this.field423[var10];
									int var12 = this.field430 == null ? var11.ohi : this.field430[var10];
									if (field450 == 256) {
										var11.plotSprite(arg1, var4 + this.ascent - var12);
									} else {
										var11.method877(arg1, var4 + this.ascent - var12, field450);
									}
									arg1 += var11.owi;
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
						Pix2D.hline(arg1, var4 + (int) ((double) this.ascent * 0.7D), var15, field433);
					}
					if (field409 != -1) {
						Pix2D.hline(arg1, var4 + this.ascent + 1, var15, field409);
					}
					arg1 += var15;
					var6 = var8;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;I)V")
	public void method138(JagString arg0, int arg1) {
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
	public int method140(JagString arg0, int[] arg1, JagString[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		int var4 = 0;
		int var5 = 0;
		JagString var6 = JagString.method1135(100);
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
					JagString var16 = arg0.method623(var10 + 1, var14);
					var10 = -1;
					var6.method638(60);
					var6.method616(var16);
					var6.method638(62);
					if (var16.method597(field410)) {
						arg2[var12++] = var6.method623(var5, var6.method604());
						var5 = var6.method604();
						var4 = 0;
						var7 = -1;
						var11 = -1;
					} else if (var16.method597(field441)) {
						var4 += this.method139(60);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 60];
						}
						var11 = 60;
					} else if (var16.method597(field434)) {
						var4 += this.method139(62);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 62];
						}
						var11 = 62;
					} else if (var16.method597(field419)) {
						var4 += this.method139(160);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 160];
						}
						var11 = 160;
					} else if (var16.method597(field437)) {
						var4 += this.method139(173);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 173];
						}
						var11 = 173;
					} else if (var16.method597(field411)) {
						var4 += this.method139(215);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 215];
						}
						var11 = 215;
					} else if (var16.method597(field406)) {
						var4 += this.method139(128);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 128];
						}
						var11 = 128;
					} else if (var16.method597(field431)) {
						var4 += this.method139(169);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 169];
						}
						var11 = 169;
					} else if (var16.method597(field412)) {
						var4 += this.method139(174);
						if (this.field407 != null && var11 != -1) {
							var4 += this.field407[(var11 << 8) + 174];
						}
						var11 = 174;
					} else if (var16.method619(field447)) {
						try {
							int var17 = var16.method635(4).method603();
							var4 += this.field423[var17].owi;
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
	public final void method141(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
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
	public final void method144(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		int[] var6 = new int[arg0.length];
		for (int var7 = 0; var7 < arg0.length; var7++) {
			var6[var7] = (int) (Math.sin((double) var7 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.method158(arg0) / 2, arg2, null, var6);
	}

	@ObfuscatedName("cc.b(Li;IIIII)V")
	public final void method145(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		int[] var6 = new int[arg0.length];
		int[] var7 = new int[arg0.length];
		for (int var8 = 0; var8 < arg0.length; var8++) {
			var6[var8] = (int) (Math.sin((double) var8 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			var7[var8] = (int) (Math.sin((double) var8 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.method158(arg0) / 2, arg2, var6, var7);
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
			this.ascent = arg0[256] & 0xFF;
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
		this.ascent = var6[32] + var5[32];
	}

	@ObfuscatedName("cc.a([Llj;[I)V")
	public final void method149(Pix8[] arg0, int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.field423 = arg0;
		this.field430 = arg1;
	}

	@ObfuscatedName("cc.b(Li;IIII)V")
	public final void method150(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method161(arg3, arg4);
			this.method137(arg0, arg1 - this.method158(arg0), arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;II[I[I)V")
	public void drawStringInnerCustomOffsetsAndColours(JagString arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		int var6 = arg2 - this.ascent;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.length; var10++) {
			int var11 = arg0.chars[var10] & 0xFF;
			if (var11 == 60) {
				var7 = var10;
			} else {
				if (var11 == 62 && var7 != -1) {
					JagString var12 = arg0.method623(var7 + 1, var10);
					var7 = -1;
					if (var12.method597(field441)) {
						var11 = 60;
					} else if (var12.method597(field434)) {
						var11 = 62;
					} else if (var12.method597(field419)) {
						var11 = 160;
					} else if (var12.method597(field437)) {
						var11 = 173;
					} else if (var12.method597(field411)) {
						var11 = 215;
					} else if (var12.method597(field406)) {
						var11 = 128;
					} else if (var12.method597(field431)) {
						var11 = 169;
					} else {
						if (!var12.method597(field412)) {
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
									Pix8 var16 = this.field423[var15];
									int var17 = this.field430 == null ? var16.ohi : this.field430[var15];
									if (field450 == 256) {
										var16.plotSprite(arg1 + var13, var6 + this.ascent - var17 + var14);
									} else {
										var16.method877(arg1 + var13, var6 + this.ascent - var17 + var14, field450);
									}
									arg1 += var16.owi;
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
						Pix2D.hline(arg1, var6 + (int) ((double) this.ascent * 0.7D), var22, field433);
					}
					if (field409 != -1) {
						Pix2D.hline(arg1, var6 + this.ascent, var22, field409);
					}
					arg1 += var22;
					var8 = var11;
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Li;IIIIIIIIII)I")
	public int method152(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method146(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.ascent;
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
	public final int method153(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		return this.method152(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("cc.c(Li;IIII)V")
	public final void method154(JagString arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			this.method161(arg3, arg4);
			this.method137(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("cc.a(Li;)V")
	public void method155(JagString arg0) {
		try {
			if (arg0.method619(field439)) {
				field444 = arg0.method635(4).method607(16);
				return;
			}
			if (arg0.method597(field443)) {
				field444 = field418;
				return;
			}
			if (arg0.method619(field436)) {
				field450 = arg0.method635(6).method603();
				return;
			}
			if (arg0.method597(field442)) {
				field450 = field422;
				return;
			}
			if (arg0.method619(field420)) {
				field433 = arg0.method635(4).method607(16);
				return;
			}
			if (arg0.method597(field446)) {
				field433 = 8388608;
				return;
			}
			if (arg0.method597(field440)) {
				field433 = -1;
				return;
			}
			if (arg0.method619(field424)) {
				field409 = arg0.method635(2).method607(16);
				return;
			}
			if (arg0.method597(field445)) {
				field409 = 0;
				return;
			}
			if (arg0.method597(field421)) {
				field409 = -1;
				return;
			}
			if (arg0.method619(field415)) {
				field428 = arg0.method635(5).method607(16);
				return;
			}
			if (arg0.method597(field438)) {
				field428 = 0;
				return;
			}
			if (arg0.method597(field413)) {
				field428 = field425;
				return;
			}
			if (arg0.method597(field410)) {
				this.method146(field418, field425, field422);
				return;
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("cc.b(Li;I)I")
	public final int method156(JagString arg0, int arg1) {
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
	public final int method158(JagString arg0) {
		if (arg0 == null) {
			return 0;
		}
		int var2 = -1;
		int var3 = -1;
		int var4 = 0;
		for (int var5 = 0; var5 < arg0.length; var5++) {
			int var6 = arg0.chars[var5] & 0xFF;
			if (var6 == 60) {
				var2 = var5;
			} else {
				if (var6 == 62 && var2 != -1) {
					JagString var7 = arg0.method623(var2 + 1, var5);
					var2 = -1;
					if (var7.method597(field441)) {
						var6 = 60;
					} else if (var7.method597(field434)) {
						var6 = 62;
					} else if (var7.method597(field419)) {
						var6 = 160;
					} else if (var7.method597(field437)) {
						var6 = 173;
					} else if (var7.method597(field411)) {
						var6 = 215;
					} else if (var7.method597(field406)) {
						var6 = 128;
					} else if (var7.method597(field431)) {
						var6 = 169;
					} else {
						if (!var7.method597(field412)) {
							if (var7.method619(field447)) {
								try {
									int var8 = var7.method635(4).method603();
									var4 += this.field423[var8].owi;
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
	public final int method163(JagString arg0, int arg1) {
		return this.method140(arg0, new int[] { arg1 }, field449);
	}

	@ObfuscatedName("cc.a(Li;IIIIII)V")
	public final void method164(JagString arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method161(arg3, 0);
		double var7 = 7.0D - (double) arg5 / 8.0D;
		if (var7 < 0.0D) {
			var7 = 0.0D;
		}
		int[] var9 = new int[arg0.length];
		for (int var10 = 0; var10 < arg0.length; var10++) {
			var9[var10] = (int) (Math.sin((double) var10 / 1.5D + (double) arg4) * var7);
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1 - this.method158(arg0) / 2, arg2, null, var9);
	}

	@ObfuscatedName("cc.a(Li;IIIILjava/util/Random;I)I")
	public final int drawStringAntiMacro(JagString arg0, int arg1, int arg2, Random arg3, int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method146(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		int[] var6 = new int[arg0.length];
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.length; var8++) {
			var6[var8] = var7;
			if ((arg3.nextInt() & 0x3) == 0) {
				var7++;
			}
		}
		this.drawStringInnerCustomOffsetsAndColours(arg0, arg1, arg2, var6, null);
		return var7;
	}
}
