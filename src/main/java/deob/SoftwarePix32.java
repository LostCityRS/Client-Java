package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("pf")
public final class SoftwarePix32 extends Pix32 {

	@ObfuscatedName("pf.S")
	public int[] field3247;

	@ObfuscatedName("pf.a([I[IIIIIIIII)V")
	public static void method1157(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = 256 - arg8;
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = -arg4; var11 < 0; var11++) {
				int var12 = arg1[arg2++];
				if (var12 == 0) {
					arg3++;
				} else {
					int var13 = arg0[arg3];
					arg0[arg3++] = ((var12 & 0xFF00FF) * arg8 + (var13 & 0xFF00FF) * var9 & 0xFF00FF00) + ((var12 & 0xFF00) * arg8 + (var13 & 0xFF00) * var9 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("pf.a([I[IIIIIIIIIII)V")
	public static void method1169(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		int var11 = arg2;
		for (int var12 = -arg7; var12 < 0; var12++) {
			int var13 = (arg3 >> 16) * arg10;
			for (int var14 = -arg6; var14 < 0; var14++) {
				int var15 = arg1[(arg2 >> 16) + var13];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = var11;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("pf.a([I[IIIIIIIIII)V")
	public static void method1172(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = -arg5; var8 < 0; var8++) {
			for (int var9 = -arg4; var9 < 0; var9++) {
				int var10 = arg1[arg2++];
				if (var10 == 0) {
					arg3++;
				} else {
					int var11 = (var10 & 0xFF00FF) * 128 & 0xFF00FF00;
					int var12 = (var10 & 0xFF00) * 128 & 0xFF0000;
					arg0[arg3++] = ((var11 | var12) >>> 8) + 8355711;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("pf.a([I[IIIIIIIIIIII)V")
	public static void method1175(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		int var12 = 256 - arg11;
		int var13 = arg2;
		for (int var14 = -arg7; var14 < 0; var14++) {
			int var15 = (arg3 >> 16) * arg10;
			for (int var16 = -arg6; var16 < 0; var16++) {
				int var17 = arg1[(arg2 >> 16) + var15];
				if (var17 == 0) {
					arg4++;
				} else {
					int var18 = arg0[arg4];
					arg0[arg4++] = ((var17 & 0xFF00FF) * arg11 + (var18 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var17 & 0xFF00) * arg11 + (var18 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = var13;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("pf.a([I[IIIIIIII)V")
	public static void method1177(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = -(arg4 >> 2);
		int var9 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var8; var11 < 0; var11++) {
				int var12 = arg1[arg2++];
				if (var12 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var12;
				}
				int var13 = arg1[arg2++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var13;
				}
				int var14 = arg1[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var14;
				}
				int var15 = arg1[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var15;
				}
			}
			for (int var16 = var9; var16 < 0; var16++) {
				int var17 = arg1[arg2++];
				if (var17 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var17;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("pf.a([I[IIIIIII)V")
	public static void method1179(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = -arg5; var8 < 0; var8++) {
			int var9 = arg3 + arg4 - 3;
			while (arg3 < var9) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			var9 += 3;
			while (arg3 < var9) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	public SoftwarePix32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
		super.field3649 = arg0;
		super.field3645 = arg1;
		super.field3643 = arg2;
		super.field3653 = arg3;
		super.field3654 = arg4;
		super.field3652 = arg5;
		this.field3247 = arg6;
	}

	public SoftwarePix32(int arg0, int arg1) {
		this.field3247 = new int[arg0 * arg1];
		super.field3654 = super.field3649 = arg0;
		super.field3652 = super.field3645 = arg1;
		super.field3643 = super.field3653 = 0;
	}

	public SoftwarePix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			super.field3654 = var3.getWidth(arg1);
			super.field3652 = var3.getHeight(arg1);
			super.field3649 = super.field3654;
			super.field3645 = super.field3652;
			super.field3643 = 0;
			super.field3653 = 0;
			this.field3247 = new int[super.field3654 * super.field3652];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, super.field3654, super.field3652, this.field3247, 0, super.field3654);
			var5.grabPixels();
		} catch (InterruptedException var6) {
		}
	}

	@ObfuscatedName("pf.d(I)V")
	public void method1154(int arg0) {
		for (int var2 = super.field3652 - 1; var2 > 0; var2--) {
			int var3 = var2 * super.field3654;
			for (int var4 = super.field3654 - 1; var4 > 0; var4--) {
				if (this.field3247[var4 + var3] == 0 && this.field3247[var4 + var3 - super.field3654 - 1] != 0) {
					this.field3247[var4 + var3] = arg0;
				}
			}
		}
	}

	@ObfuscatedName("pf.c(II)V")
	@Override
	public void method1155(int arg0, int arg1) {
		int var3 = arg0 + super.field3643;
		int var4 = arg1 + super.field3653;
		int var5 = var3 + var4 * Pix2D.field1333;
		int var6 = 0;
		int var7 = super.field3652;
		int var8 = super.field3654;
		int var9 = Pix2D.field1333 - var8;
		int var10 = 0;
		if (var4 < Pix2D.field1334) {
			int var11 = Pix2D.field1334 - var4;
			var7 -= var11;
			var4 = Pix2D.field1334;
			var6 = var11 * var8;
			var5 += var11 * Pix2D.field1333;
		}
		if (var4 + var7 > Pix2D.field1335) {
			var7 -= var4 + var7 - Pix2D.field1335;
		}
		if (var3 < Pix2D.field1332) {
			int var12 = Pix2D.field1332 - var3;
			var8 -= var12;
			var3 = Pix2D.field1332;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.field1336) {
			int var13 = var3 + var8 - Pix2D.field1336;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method1177(Pix2D.field1331, this.field3247, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("pf.a()Lpf;")
	public SoftwarePix32 method1156() {
		SoftwarePix32 var1 = new SoftwarePix32(super.field3654, super.field3652);
		var1.field3649 = super.field3649;
		var1.field3645 = super.field3645;
		var1.field3643 = super.field3649 - super.field3654 - super.field3643;
		var1.field3653 = super.field3653;
		for (int var2 = 0; var2 < super.field3652; var2++) {
			for (int var3 = 0; var3 < super.field3654; var3++) {
				var1.field3247[var2 * super.field3654 + var3] = this.field3247[var2 * super.field3654 + super.field3654 - var3 - 1];
			}
		}
		return var1;
	}

	@ObfuscatedName("pf.b(III)V")
	public void method1158(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field3247.length; var4++) {
			int var5 = this.field3247[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				int var7 = var6 + arg0;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}
				int var8 = var5 >> 8 & 0xFF;
				int var9 = var8 + arg1;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}
				int var10 = var5 & 0xFF;
				int var11 = var10 + arg2;
				if (var11 < 1) {
					var11 = 1;
				} else if (var11 > 255) {
					var11 = 255;
				}
				this.field3247[var4] = (var7 << 16) + (var9 << 8) + var11;
			}
		}
	}

	@ObfuscatedName("pf.b()V")
	public void method1159() {
		int[] var1 = new int[super.field3654 * super.field3652];
		int var2 = 0;
		for (int var3 = 0; var3 < super.field3652; var3++) {
			for (int var4 = super.field3654 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field3247[var4 + var3 * super.field3654];
			}
		}
		this.field3247 = var1;
		super.field3643 = super.field3649 - super.field3654 - super.field3643;
	}

	@ObfuscatedName("pf.b(IIII)V")
	@Override
	public void method1160(int arg0, int arg1) {
		int var3 = arg0 + super.field3643;
		int var4 = arg1 + super.field3653;
		int var5 = var3 + var4 * Pix2D.field1333;
		int var6 = 0;
		int var7 = super.field3652;
		int var8 = super.field3654;
		int var9 = Pix2D.field1333 - var8;
		int var10 = 0;
		if (var4 < Pix2D.field1334) {
			int var11 = Pix2D.field1334 - var4;
			var7 -= var11;
			var4 = Pix2D.field1334;
			var6 = var11 * var8;
			var5 += var11 * Pix2D.field1333;
		}
		if (var4 + var7 > Pix2D.field1335) {
			var7 -= var4 + var7 - Pix2D.field1335;
		}
		if (var3 < Pix2D.field1332) {
			int var12 = Pix2D.field1332 - var3;
			var8 -= var12;
			var3 = Pix2D.field1332;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.field1336) {
			int var13 = var3 + var8 - Pix2D.field1336;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method1172(Pix2D.field1331, this.field3247, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("pf.b(II)V")
	@Override
	public void method1161(int arg0, int arg1) {
		int var3 = arg0 + super.field3643;
		int var4 = arg1 + super.field3653;
		int var5 = var3 + var4 * Pix2D.field1333;
		int var6 = 0;
		int var7 = super.field3652;
		int var8 = super.field3654;
		int var9 = Pix2D.field1333 - var8;
		int var10 = 0;
		if (var4 < Pix2D.field1334) {
			int var11 = Pix2D.field1334 - var4;
			var7 -= var11;
			var4 = Pix2D.field1334;
			var6 = var11 * var8;
			var5 += var11 * Pix2D.field1333;
		}
		if (var4 + var7 > Pix2D.field1335) {
			var7 -= var4 + var7 - Pix2D.field1335;
		}
		if (var3 < Pix2D.field1332) {
			int var12 = Pix2D.field1332 - var3;
			var8 -= var12;
			var3 = Pix2D.field1332;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > Pix2D.field1336) {
			int var13 = var3 + var8 - Pix2D.field1336;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method1179(Pix2D.field1331, this.field3247, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("pf.a(IIII)V")
	@Override
	public void method1162(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var5 = super.field3654;
		int var6 = super.field3652;
		int var7 = 0;
		int var8 = 0;
		int var9 = super.field3649;
		int var10 = super.field3645;
		int var11 = (var9 << 16) / arg2;
		int var12 = (var10 << 16) / arg3;
		if (super.field3643 > 0) {
			int var13 = ((super.field3643 << 16) + var11 - 1) / var11;
			arg0 += var13;
			var7 = var13 * var11 - (super.field3643 << 16);
		}
		if (super.field3653 > 0) {
			int var14 = ((super.field3653 << 16) + var12 - 1) / var12;
			arg1 += var14;
			var8 = var14 * var12 - (super.field3653 << 16);
		}
		if (var5 < var9) {
			arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
		}
		if (var6 < var10) {
			arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		int var15 = arg0 + arg1 * Pix2D.field1333;
		int var16 = Pix2D.field1333 - arg2;
		if (arg1 + arg3 > Pix2D.field1335) {
			arg3 -= arg1 + arg3 - Pix2D.field1335;
		}
		if (arg1 < Pix2D.field1334) {
			int var17 = Pix2D.field1334 - arg1;
			arg3 -= var17;
			var15 += var17 * Pix2D.field1333;
			var8 += var12 * var17;
		}
		if (arg0 + arg2 > Pix2D.field1336) {
			int var18 = arg0 + arg2 - Pix2D.field1336;
			arg2 -= var18;
			var16 += var18;
		}
		if (arg0 < Pix2D.field1332) {
			int var19 = Pix2D.field1332 - arg0;
			arg2 -= var19;
			var15 += var19;
			var7 += var11 * var19;
			var16 += var19;
		}
		method1169(Pix2D.field1331, this.field3247, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
	}

	@ObfuscatedName("pf.a(IIIIIIII[I[I)V")
	public void method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			int var13 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			int var14 = var12 * 256 >> 8;
			int var15 = var13 * 256 >> 8;
			int var16 = (arg4 << 16) + var11 * var14 + var10 * var15;
			int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
			int var18 = arg0 + arg1 * Pix2D.field1333;
			for (int var19 = 0; var19 < arg3; var19++) {
				int var20 = arg7[var19];
				int var21 = var18 + var20;
				int var22 = var16 + var15 * var20;
				int var23 = var17 - var14 * var20;
				for (int var24 = -arg8[var19]; var24 < 0; var24++) {
					int var25 = this.field3247[(var22 >> 16) + (var23 >> 16) * super.field3654];
					if (var25 == 0) {
						var21++;
					} else {
						Pix2D.field1331[var21++] = var25;
					}
					var22 += var15;
					var23 -= var14;
				}
				var16 += var14;
				var17 += var15;
				var18 += Pix2D.field1333;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("pf.a(III)V")
	@Override
	public void method1164(int arg0, int arg1, int arg2) {
		int var4 = arg0 + super.field3643;
		int var5 = arg1 + super.field3653;
		int var6 = var4 + var5 * Pix2D.field1333;
		int var7 = 0;
		int var8 = super.field3652;
		int var9 = super.field3654;
		int var10 = Pix2D.field1333 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field1334) {
			int var12 = Pix2D.field1334 - var5;
			var8 -= var12;
			var5 = Pix2D.field1334;
			var7 = var12 * var9;
			var6 += var12 * Pix2D.field1333;
		}
		if (var5 + var8 > Pix2D.field1335) {
			var8 -= var5 + var8 - Pix2D.field1335;
		}
		if (var4 < Pix2D.field1332) {
			int var13 = Pix2D.field1332 - var4;
			var9 -= var13;
			var4 = Pix2D.field1332;
			var7 += var13;
			var6 += var13;
			var11 = var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field1336) {
			int var14 = var4 + var9 - Pix2D.field1336;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			method1157(Pix2D.field1331, this.field3247, var7, var6, var9, var8, var10, var11, arg2);
		}
	}

	@ObfuscatedName("pf.a(II[I[I)V")
	public void method1165(int arg0, int arg1, int[] arg2, int[] arg3) {
		if (Pix2D.field1335 - Pix2D.field1334 != arg2.length) {
			throw new IllegalStateException();
		}
		int var5 = arg0 + super.field3643;
		int var6 = arg1 + super.field3653;
		int var7 = 0;
		int var8 = super.field3652;
		int var9 = super.field3654;
		int var10 = Pix2D.field1333 - var9;
		int var11 = 0;
		int var12 = var5 + var6 * Pix2D.field1333;
		if (var6 < Pix2D.field1334) {
			int var13 = Pix2D.field1334 - var6;
			var8 -= var13;
			var6 = Pix2D.field1334;
			var7 = var13 * var9;
			var12 += var13 * Pix2D.field1333;
		}
		if (var6 + var8 > Pix2D.field1335) {
			var8 -= var6 + var8 - Pix2D.field1335;
		}
		if (var5 < Pix2D.field1332) {
			int var14 = Pix2D.field1332 - var5;
			var9 -= var14;
			var5 = Pix2D.field1332;
			var7 += var14;
			var12 += var14;
			var11 = var14;
			var10 += var14;
		}
		if (var5 + var9 > Pix2D.field1336) {
			int var15 = var5 + var9 - Pix2D.field1336;
			var9 -= var15;
			var11 += var15;
			var10 += var15;
		}
		if (var9 <= 0 || var8 <= 0) {
			return;
		}
		int var16 = var5 - Pix2D.field1332;
		int var17 = var6 - Pix2D.field1334;
		for (int var18 = var17; var18 < var17 + var8; var18++) {
			int var19 = arg2[var18];
			int var20 = arg3[var18];
			int var21 = var9;
			if (var16 > var19) {
				int var22 = var16 - var19;
				if (var22 >= var20) {
					var7 += var9 + var11;
					var12 += var9 + var10;
					continue;
				}
				var20 -= var22;
			} else {
				int var23 = var19 - var16;
				if (var23 >= var9) {
					var7 += var9 + var11;
					var12 += var9 + var10;
					continue;
				}
				var7 += var23;
				var21 = var9 - var23;
				var12 += var23;
			}
			int var24 = 0;
			if (var21 < var20) {
				var20 = var21;
			} else {
				var24 = var21 - var20;
			}
			for (int var25 = -var20; var25 < 0; var25++) {
				int var26 = this.field3247[var7++];
				if (var26 == 0) {
					var12++;
				} else {
					Pix2D.field1331[var12++] = var26;
				}
			}
			var7 += var24 + var11;
			var12 += var24 + var10;
		}
	}

	@ObfuscatedName("pf.a(IIIIII)V")
	@Override
	public void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 == 0) {
			return;
		}
		int var7 = arg0 - (super.field3643 << 4);
		int var8 = arg1 - (super.field3653 << 4);
		double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
		int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
		int var13 = -var7 * var12 + -var8 * var11;
		int var14 = var7 * var11 + -var8 * var12;
		int var15 = ((super.field3654 << 4) - var7) * var12 + -var8 * var11;
		int var16 = -((super.field3654 << 4) - var7) * var11 + -var8 * var12;
		int var17 = -var7 * var12 + ((super.field3652 << 4) - var8) * var11;
		int var18 = var7 * var11 + ((super.field3652 << 4) - var8) * var12;
		int var19 = ((super.field3654 << 4) - var7) * var12 + ((super.field3652 << 4) - var8) * var11;
		int var20 = -((super.field3654 << 4) - var7) * var11 + ((super.field3652 << 4) - var8) * var12;
		int var21;
		int var22;
		if (var13 < var15) {
			var21 = var13;
			var22 = var15;
		} else {
			var21 = var15;
			var22 = var13;
		}
		if (var17 < var21) {
			var21 = var17;
		}
		if (var19 < var21) {
			var21 = var19;
		}
		if (var17 > var22) {
			var22 = var17;
		}
		if (var19 > var22) {
			var22 = var19;
		}
		int var23;
		int var24;
		if (var14 < var16) {
			var23 = var14;
			var24 = var16;
		} else {
			var23 = var16;
			var24 = var14;
		}
		if (var18 < var23) {
			var23 = var18;
		}
		if (var20 < var23) {
			var23 = var20;
		}
		if (var18 > var24) {
			var24 = var18;
		}
		if (var20 > var24) {
			var24 = var20;
		}
		int var25 = var21 >> 12;
		int var26 = var22 + 4095 >> 12;
		int var27 = var23 >> 12;
		int var28 = var24 + 4095 >> 12;
		int var29 = var25 + arg2;
		int var30 = var26 + arg2;
		int var31 = var27 + arg3;
		int var32 = var28 + arg3;
		int var33 = var29 >> 4;
		int var34 = var30 + 15 >> 4;
		int var35 = var31 >> 4;
		int var36 = var32 + 15 >> 4;
		if (var33 < Pix2D.field1332) {
			var33 = Pix2D.field1332;
		}
		if (var34 > Pix2D.field1336) {
			var34 = Pix2D.field1336;
		}
		if (var35 < Pix2D.field1334) {
			var35 = Pix2D.field1334;
		}
		if (var36 > Pix2D.field1335) {
			var36 = Pix2D.field1335;
		}
		int var37 = var33 - var34;
		if (var37 >= 0) {
			return;
		}
		int var38 = var35 - var36;
		if (var38 >= 0) {
			return;
		}
		int var39 = var35 * Pix2D.field1333 + var33;
		double var40 = 1.6777216E7D / (double) arg5;
		int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
		int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
		int var44 = (var33 << 4) + 8 - arg2;
		int var45 = (var35 << 4) + 8 - arg3;
		int var46 = (var7 << 8) - (var45 * var42 >> 4);
		int var47 = (var8 << 8) + (var45 * var43 >> 4);
		if (var43 == 0) {
			if (var42 == 0) {
				int var48 = var38;
				while (var48 < 0) {
					int var49 = var39;
					int var50 = var37;
					if (var46 >= 0 && var47 >= 0 && var46 - (super.field3654 << 12) < 0 && var47 - (super.field3652 << 12) < 0) {
						while (var50 < 0) {
							int var51 = this.field3247[(var47 >> 12) * super.field3654 + (var46 >> 12)];
							if (var51 == 0) {
								var49++;
							} else {
								Pix2D.field1331[var49++] = var51;
							}
							var50++;
						}
					}
					var48++;
					var39 += Pix2D.field1333;
				}
			} else if (var42 < 0) {
				int var52 = var38;
				while (var52 < 0) {
					int var53 = var39;
					int var54 = var47 + (var44 * var42 >> 4);
					int var55 = var37;
					if (var46 >= 0 && var46 - (super.field3654 << 12) < 0) {
						int var56;
						if ((var56 = var54 - (super.field3652 << 12)) >= 0) {
							int var57 = (var42 - var56) / var42;
							var55 = var37 + var57;
							var54 += var42 * var57;
							var53 = var39 + var57;
						}
						int var58;
						if ((var58 = (var54 - var42) / var42) > var55) {
							var55 = var58;
						}
						while (var55 < 0) {
							int var59 = this.field3247[(var54 >> 12) * super.field3654 + (var46 >> 12)];
							if (var59 == 0) {
								var53++;
							} else {
								Pix2D.field1331[var53++] = var59;
							}
							var54 += var42;
							var55++;
						}
					}
					var52++;
					var46 -= var42;
					var39 += Pix2D.field1333;
				}
			} else {
				int var60 = var38;
				while (var60 < 0) {
					int var61 = var39;
					int var62 = var47 + (var44 * var42 >> 4);
					int var63 = var37;
					if (var46 >= 0 && var46 - (super.field3654 << 12) < 0) {
						if (var62 < 0) {
							int var64 = (var42 - var62 - 1) / var42;
							var63 = var37 + var64;
							var62 += var42 * var64;
							var61 = var39 + var64;
						}
						int var65;
						if ((var65 = (var62 + 1 - (super.field3652 << 12) - var42) / var42) > var63) {
							var63 = var65;
						}
						while (var63 < 0) {
							int var66 = this.field3247[(var62 >> 12) * super.field3654 + (var46 >> 12)];
							if (var66 == 0) {
								var61++;
							} else {
								Pix2D.field1331[var61++] = var66;
							}
							var62 += var42;
							var63++;
						}
					}
					var60++;
					var46 -= var42;
					var39 += Pix2D.field1333;
				}
			}
		} else if (var43 < 0) {
			if (var42 == 0) {
				int var67 = var38;
				while (var67 < 0) {
					int var68 = var39;
					int var69 = var46 + (var44 * var43 >> 4);
					int var70 = var37;
					if (var47 >= 0 && var47 - (super.field3652 << 12) < 0) {
						int var71;
						if ((var71 = var69 - (super.field3654 << 12)) >= 0) {
							int var72 = (var43 - var71) / var43;
							var70 = var37 + var72;
							var69 += var43 * var72;
							var68 = var39 + var72;
						}
						int var73;
						if ((var73 = (var69 - var43) / var43) > var70) {
							var70 = var73;
						}
						while (var70 < 0) {
							int var74 = this.field3247[(var47 >> 12) * super.field3654 + (var69 >> 12)];
							if (var74 == 0) {
								var68++;
							} else {
								Pix2D.field1331[var68++] = var74;
							}
							var69 += var43;
							var70++;
						}
					}
					var67++;
					var47 += var43;
					var39 += Pix2D.field1333;
				}
			} else if (var42 < 0) {
				int var75 = var38;
				while (var75 < 0) {
					int var76 = var39;
					int var77 = var46 + (var44 * var43 >> 4);
					int var78 = var47 + (var44 * var42 >> 4);
					int var79 = var37;
					int var80;
					if ((var80 = var77 - (super.field3654 << 12)) >= 0) {
						int var81 = (var43 - var80) / var43;
						var79 = var37 + var81;
						var77 += var43 * var81;
						var78 += var42 * var81;
						var76 = var39 + var81;
					}
					int var82;
					if ((var82 = (var77 - var43) / var43) > var79) {
						var79 = var82;
					}
					int var83;
					if ((var83 = var78 - (super.field3652 << 12)) >= 0) {
						int var84 = (var42 - var83) / var42;
						var79 += var84;
						var77 += var43 * var84;
						var78 += var42 * var84;
						var76 += var84;
					}
					int var85;
					if ((var85 = (var78 - var42) / var42) > var79) {
						var79 = var85;
					}
					while (var79 < 0) {
						int var86 = this.field3247[(var78 >> 12) * super.field3654 + (var77 >> 12)];
						if (var86 == 0) {
							var76++;
						} else {
							Pix2D.field1331[var76++] = var86;
						}
						var77 += var43;
						var78 += var42;
						var79++;
					}
					var75++;
					var46 -= var42;
					var47 += var43;
					var39 += Pix2D.field1333;
				}
			} else {
				int var87 = var38;
				while (var87 < 0) {
					int var88 = var39;
					int var89 = var46 + (var44 * var43 >> 4);
					int var90 = var47 + (var44 * var42 >> 4);
					int var91 = var37;
					int var92;
					if ((var92 = var89 - (super.field3654 << 12)) >= 0) {
						int var93 = (var43 - var92) / var43;
						var91 = var37 + var93;
						var89 += var43 * var93;
						var90 += var42 * var93;
						var88 = var39 + var93;
					}
					int var94;
					if ((var94 = (var89 - var43) / var43) > var91) {
						var91 = var94;
					}
					if (var90 < 0) {
						int var95 = (var42 - var90 - 1) / var42;
						var91 += var95;
						var89 += var43 * var95;
						var90 += var42 * var95;
						var88 += var95;
					}
					int var96;
					if ((var96 = (var90 + 1 - (super.field3652 << 12) - var42) / var42) > var91) {
						var91 = var96;
					}
					while (var91 < 0) {
						int var97 = this.field3247[(var90 >> 12) * super.field3654 + (var89 >> 12)];
						if (var97 == 0) {
							var88++;
						} else {
							Pix2D.field1331[var88++] = var97;
						}
						var89 += var43;
						var90 += var42;
						var91++;
					}
					var87++;
					var46 -= var42;
					var47 += var43;
					var39 += Pix2D.field1333;
				}
			}
		} else if (var42 == 0) {
			int var98 = var38;
			while (var98 < 0) {
				int var99 = var39;
				int var100 = var46 + (var44 * var43 >> 4);
				int var101 = var37;
				if (var47 >= 0 && var47 - (super.field3652 << 12) < 0) {
					if (var100 < 0) {
						int var102 = (var43 - var100 - 1) / var43;
						var101 = var37 + var102;
						var100 += var43 * var102;
						var99 = var39 + var102;
					}
					int var103;
					if ((var103 = (var100 + 1 - (super.field3654 << 12) - var43) / var43) > var101) {
						var101 = var103;
					}
					while (var101 < 0) {
						int var104 = this.field3247[(var47 >> 12) * super.field3654 + (var100 >> 12)];
						if (var104 == 0) {
							var99++;
						} else {
							Pix2D.field1331[var99++] = var104;
						}
						var100 += var43;
						var101++;
					}
				}
				var98++;
				var47 += var43;
				var39 += Pix2D.field1333;
			}
		} else if (var42 < 0) {
			int var105 = var38;
			while (var105 < 0) {
				int var106 = var39;
				int var107 = var46 + (var44 * var43 >> 4);
				int var108 = var47 + (var44 * var42 >> 4);
				int var109 = var37;
				if (var107 < 0) {
					int var110 = (var43 - var107 - 1) / var43;
					var109 = var37 + var110;
					var107 += var43 * var110;
					var108 += var42 * var110;
					var106 = var39 + var110;
				}
				int var111;
				if ((var111 = (var107 + 1 - (super.field3654 << 12) - var43) / var43) > var109) {
					var109 = var111;
				}
				int var112;
				if ((var112 = var108 - (super.field3652 << 12)) >= 0) {
					int var113 = (var42 - var112) / var42;
					var109 += var113;
					var107 += var43 * var113;
					var108 += var42 * var113;
					var106 += var113;
				}
				int var114;
				if ((var114 = (var108 - var42) / var42) > var109) {
					var109 = var114;
				}
				while (var109 < 0) {
					int var115 = this.field3247[(var108 >> 12) * super.field3654 + (var107 >> 12)];
					if (var115 == 0) {
						var106++;
					} else {
						Pix2D.field1331[var106++] = var115;
					}
					var107 += var43;
					var108 += var42;
					var109++;
				}
				var105++;
				var46 -= var42;
				var47 += var43;
				var39 += Pix2D.field1333;
			}
		} else {
			int var116 = var38;
			while (var116 < 0) {
				int var117 = var39;
				int var118 = var46 + (var44 * var43 >> 4);
				int var119 = var47 + (var44 * var42 >> 4);
				int var120 = var37;
				if (var118 < 0) {
					int var121 = (var43 - var118 - 1) / var43;
					var120 = var37 + var121;
					var118 += var43 * var121;
					var119 += var42 * var121;
					var117 = var39 + var121;
				}
				int var122;
				if ((var122 = (var118 + 1 - (super.field3654 << 12) - var43) / var43) > var120) {
					var120 = var122;
				}
				if (var119 < 0) {
					int var123 = (var42 - var119 - 1) / var42;
					var120 += var123;
					var118 += var43 * var123;
					var119 += var42 * var123;
					var117 += var123;
				}
				int var124;
				if ((var124 = (var119 + 1 - (super.field3652 << 12) - var42) / var42) > var120) {
					var120 = var124;
				}
				while (var120 < 0) {
					int var125 = this.field3247[(var119 >> 12) * super.field3654 + (var118 >> 12)];
					if (var125 == 0) {
						var117++;
					} else {
						Pix2D.field1331[var117++] = var125;
					}
					var118 += var43;
					var119 += var42;
					var120++;
				}
				var116++;
				var46 -= var42;
				var47 += var43;
				var39 += Pix2D.field1333;
			}
		}
	}

	@ObfuscatedName("pf.c()V")
	public void method1167() {
		Pix2D.method496(this.field3247, super.field3654, super.field3652);
	}

	@ObfuscatedName("pf.e(I)V")
	public void method1168(int arg0) {
		int[] var2 = new int[super.field3654 * super.field3652];
		int var3 = 0;
		for (int var4 = 0; var4 < super.field3652; var4++) {
			for (int var5 = 0; var5 < super.field3654; var5++) {
				int var6 = this.field3247[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.field3247[var3 - 1] != 0) {
						var6 = arg0;
					} else if (var4 > 0 && this.field3247[var3 - super.field3654] != 0) {
						var6 = arg0;
					} else if (var5 < super.field3654 - 1 && this.field3247[var3 + 1] != 0) {
						var6 = arg0;
					} else if (var4 < super.field3652 - 1 && this.field3247[var3 + super.field3654] != 0) {
						var6 = arg0;
					}
				}
				var2[var3++] = var6;
			}
		}
		this.field3247 = var2;
	}

	@ObfuscatedName("pf.a(IIIIIIDI)V")
	public void method1170(int arg0, int arg1, double arg2) {
		try {
			int var5 = (int) (Math.sin(arg2) * 65536.0D);
			int var6 = (int) (Math.cos(arg2) * 65536.0D);
			int var7 = var5 * 256 >> 8;
			int var8 = var6 * 256 >> 8;
			int var9 = var7 * -10 + var8 * -10 + 983040;
			int var10 = var8 * -10 + 983040 - var7 * -10;
			int var11 = arg0 + arg1 * Pix2D.field1333;
			for (int var12 = 0; var12 < 20; var12++) {
				int var13 = var11;
				int var14 = var9;
				int var15 = var10;
				for (int var16 = -20; var16 < 0; var16++) {
					int var17 = this.field3247[(var14 >> 16) + (var15 >> 16) * super.field3654];
					if (var17 == 0) {
						var13++;
					} else {
						Pix2D.field1331[var13++] = var17;
					}
					var14 += var8;
					var15 -= var7;
				}
				var9 += var7;
				var10 += var8;
				var11 += Pix2D.field1333;
			}
		} catch (Exception var18) {
		}
	}

	@ObfuscatedName("pf.d()V")
	public void method1171() {
		int[] var1 = new int[super.field3654 * super.field3652];
		int var2 = 0;
		for (int var3 = super.field3652 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < super.field3654; var4++) {
				var1[var2++] = this.field3247[var4 + var3 * super.field3654];
			}
		}
		this.field3247 = var1;
		super.field3653 = super.field3645 - super.field3652 - super.field3653;
	}

	@ObfuscatedName("pf.f(I)V")
	public void method1173(int arg0) {
		if (super.field3654 == super.field3649 && super.field3652 == super.field3645) {
			return;
		}
		int var2 = arg0;
		if (arg0 > super.field3643) {
			var2 = super.field3643;
		}
		int var3 = arg0;
		if (arg0 + super.field3643 + super.field3654 > super.field3649) {
			var3 = super.field3649 - super.field3643 - super.field3654;
		}
		int var4 = arg0;
		if (arg0 > super.field3653) {
			var4 = super.field3653;
		}
		int var5 = arg0;
		if (arg0 + super.field3653 + super.field3652 > super.field3645) {
			var5 = super.field3645 - super.field3653 - super.field3652;
		}
		int var6 = super.field3654 + var2 + var3;
		int var7 = super.field3652 + var4 + var5;
		int[] var8 = new int[var6 * var7];
		for (int var9 = 0; var9 < super.field3652; var9++) {
			for (int var10 = 0; var10 < super.field3654; var10++) {
				var8[(var9 + var4) * var6 + var10 + var2] = this.field3247[var9 * super.field3654 + var10];
			}
		}
		this.field3247 = var8;
		super.field3654 = var6;
		super.field3652 = var7;
		super.field3643 -= var2;
		super.field3653 -= var4;
	}

	@ObfuscatedName("pf.a(IIIII)V")
	@Override
	public void method1174(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		int var6 = super.field3654;
		int var7 = super.field3652;
		int var8 = 0;
		int var9 = 0;
		int var10 = super.field3649;
		int var11 = super.field3645;
		int var12 = (var10 << 16) / arg2;
		int var13 = (var11 << 16) / arg3;
		if (super.field3643 > 0) {
			int var14 = ((super.field3643 << 16) + var12 - 1) / var12;
			arg0 += var14;
			var8 = var14 * var12 - (super.field3643 << 16);
		}
		if (super.field3653 > 0) {
			int var15 = ((super.field3653 << 16) + var13 - 1) / var13;
			arg1 += var15;
			var9 = var15 * var13 - (super.field3653 << 16);
		}
		if (var6 < var10) {
			arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
		}
		if (var7 < var11) {
			arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
		}
		int var16 = arg0 + arg1 * Pix2D.field1333;
		int var17 = Pix2D.field1333 - arg2;
		if (arg1 + arg3 > Pix2D.field1335) {
			arg3 -= arg1 + arg3 - Pix2D.field1335;
		}
		if (arg1 < Pix2D.field1334) {
			int var18 = Pix2D.field1334 - arg1;
			arg3 -= var18;
			var16 += var18 * Pix2D.field1333;
			var9 += var13 * var18;
		}
		if (arg0 + arg2 > Pix2D.field1336) {
			int var19 = arg0 + arg2 - Pix2D.field1336;
			arg2 -= var19;
			var17 += var19;
		}
		if (arg0 < Pix2D.field1332) {
			int var20 = Pix2D.field1332 - arg0;
			arg2 -= var20;
			var16 += var20;
			var8 += var12 * var20;
			var17 += var20;
		}
		method1175(Pix2D.field1331, this.field3247, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
	}

	@ObfuscatedName("pf.b(IIIIIIII[I[I)V")
	public void method1176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			int var15 = var13 * arg7 >> 8;
			int var16 = var14 * arg7 >> 8;
			int var17 = (arg4 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg0 + arg1 * Pix2D.field1333;
			for (int var20 = 0; var20 < arg3; var20++) {
				int var21 = arg8[var20];
				int var22 = var19 + var21;
				int var23 = var17 + var16 * var21;
				int var24 = var18 - var15 * var21;
				for (int var25 = -arg9[var20]; var25 < 0; var25++) {
					Pix2D.field1331[var22++] = this.field3247[(var23 >> 16) + (var24 >> 16) * super.field3654];
					var23 += var16;
					var24 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.field1333;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("pf.e()V")
	public void method1178() {
		if (super.field3654 == super.field3649 && super.field3652 == super.field3645) {
			return;
		}
		int[] var1 = new int[super.field3649 * super.field3645];
		for (int var2 = 0; var2 < super.field3652; var2++) {
			for (int var3 = 0; var3 < super.field3654; var3++) {
				var1[(var2 + super.field3653) * super.field3649 + var3 + super.field3643] = this.field3247[var2 * super.field3654 + var3];
			}
		}
		this.field3247 = var1;
		super.field3654 = super.field3649;
		super.field3652 = super.field3645;
		super.field3643 = 0;
		super.field3653 = 0;
	}
}
