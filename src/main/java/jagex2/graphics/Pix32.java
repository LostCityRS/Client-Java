package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.JagFile;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public class Pix32 extends Pix2D {

	@ObfuscatedName("jb.z")
	public boolean field659 = true;

	@ObfuscatedName("jb.A")
	public byte field660 = -32;

	@ObfuscatedName("jb.B")
	public int field661 = 728;

	@ObfuscatedName("jb.C")
	public boolean field662 = false;

	@ObfuscatedName("jb.D")
	public boolean field663 = false;

	@ObfuscatedName("jb.E")
	public boolean field664 = false;

	@ObfuscatedName("jb.F")
	public int field665 = 6;

	@ObfuscatedName("jb.G")
	public int[] field666;

	@ObfuscatedName("jb.L")
	public int field671;

	@ObfuscatedName("jb.H")
	public int field667;

	@ObfuscatedName("jb.M")
	public int field672;

	@ObfuscatedName("jb.I")
	public int field668;

	@ObfuscatedName("jb.K")
	public int field670;

	@ObfuscatedName("jb.J")
	public int field669;

	public Pix32(int arg0, int arg1) {
		this.field666 = new int[arg0 * arg1];
		this.field667 = this.field671 = arg0;
		this.field668 = this.field672 = arg1;
		this.field669 = this.field670 = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.field667 = var3.getWidth(arg1);
			this.field668 = var3.getHeight(arg1);
			this.field671 = this.field667;
			this.field672 = this.field668;
			this.field669 = 0;
			this.field670 = 0;
			this.field666 = new int[this.field667 * this.field668];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field667, this.field668, this.field666, 0, this.field667);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method309(arg1 + ".dat", null), (byte) 3);
		Packet var5 = new Packet(arg0.method309("index.dat", null), (byte) 3);
		var5.field711 = var4.method241();
		this.field671 = var5.method241();
		this.field672 = var5.method241();
		int var6 = var5.method239();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method243();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field711 += 2;
			var4.field711 += var5.method241() * var5.method241();
			var5.field711++;
		}
		this.field669 = var5.method239();
		this.field670 = var5.method239();
		this.field667 = var5.method241();
		this.field668 = var5.method241();
		int var10 = var5.method239();
		int var11 = this.field667 * this.field668;
		this.field666 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.field666[var12] = var7[var4.method239()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.field667; var13++) {
				for (int var14 = 0; var14 < this.field668; var14++) {
					this.field666[var13 + var14 * this.field667] = var7[var4.method239()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void method194(byte arg0) {
		if (arg0 != 9) {
			this.field664 = !this.field664;
		}
		Pix2D.method165(-216, this.field668, this.field666, this.field667);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method195(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field666.length; var5++) {
			int var6 = this.field666[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xFF;
				int var8 = var7 + arg2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = var6 >> 8 & 0xFF;
				int var10 = var9 + arg1;
				if (var10 < 1) {
					var10 = 1;
				} else if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var6 & 0xFF;
				int var12 = var11 + arg3;
				if (var12 < 1) {
					var12 = 1;
				} else if (var12 > 255) {
					var12 = 255;
				}
				this.field666[var5] = (var8 << 16) + (var10 << 8) + var12;
			}
		}
		if (arg0 < 0 || arg0 > 0) {
			;
		}
	}

	@ObfuscatedName("jb.a(Z)V")
	public void method196(boolean arg0) {
		int[] var2 = new int[this.field671 * this.field672];
		for (int var3 = 0; var3 < this.field668; var3++) {
			for (int var4 = 0; var4 < this.field667; var4++) {
				var2[(var3 + this.field670) * this.field671 + var4 + this.field669] = this.field666[var3 * this.field667 + var4];
			}
		}
		this.field666 = var2;
		this.field667 = this.field671;
		this.field668 = this.field672;
		if (arg0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		this.field669 = 0;
		this.field670 = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void method197(int arg0, int arg1, int arg2) {
		int var4 = arg2 + this.field669;
		int var5 = arg0 + this.field670;
		int var6 = var4 + var5 * Pix2D.field624;
		int var7 = 0;
		if (arg1 != -18217) {
			for (int var8 = 1; var8 > 0; var8++) {
			}
		}
		int var9 = this.field668;
		int var10 = this.field667;
		int var11 = Pix2D.field624 - var10;
		int var12 = 0;
		if (var5 < Pix2D.field626) {
			int var13 = Pix2D.field626 - var5;
			var9 -= var13;
			var5 = Pix2D.field626;
			var7 += var13 * var10;
			var6 += var13 * Pix2D.field624;
		}
		if (var5 + var9 > Pix2D.field627) {
			var9 -= var5 + var9 - Pix2D.field627;
		}
		if (var4 < Pix2D.field628) {
			int var14 = Pix2D.field628 - var4;
			var10 -= var14;
			var4 = Pix2D.field628;
			var7 += var14;
			var6 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var4 + var10 > Pix2D.field629) {
			int var15 = var4 + var10 - Pix2D.field629;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method198(0, Pix2D.field623, var12, this.field666, var7, var6, var11, var9, var10);
		}
	}

	@ObfuscatedName("jb.a(I[II[IIIIII)V")
	public void method198(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 != 0) {
			this.field663 = !this.field663;
		}
		int var10 = -(arg8 >> 2);
		int var11 = -(arg8 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg1[arg5++] = arg3[arg4++];
			}
			arg5 += arg6;
			arg4 += arg2;
		}
	}

	@ObfuscatedName("jb.b(III)V")
	public void method199(int arg0, int arg1, int arg2) {
		if (arg0 < 1 || arg0 > 1) {
			return;
		}
		int var4 = arg1 + this.field669;
		int var5 = arg2 + this.field670;
		int var6 = var4 + var5 * Pix2D.field624;
		int var7 = 0;
		int var8 = this.field668;
		int var9 = this.field667;
		int var10 = Pix2D.field624 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field626) {
			int var12 = Pix2D.field626 - var5;
			var8 -= var12;
			var5 = Pix2D.field626;
			var7 += var12 * var9;
			var6 += var12 * Pix2D.field624;
		}
		if (var5 + var8 > Pix2D.field627) {
			var8 -= var5 + var8 - Pix2D.field627;
		}
		if (var4 < Pix2D.field628) {
			int var13 = Pix2D.field628 - var4;
			var9 -= var13;
			var4 = Pix2D.field628;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field629) {
			int var14 = var4 + var9 - Pix2D.field629;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method200(Pix2D.field623, this.field666, 0, var7, var6, var9, var8, var10, var11);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void method200(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var14;
				}
				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
				int var17 = arg1[arg3++];
				if (var17 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var17;
				}
			}
			for (int var18 = var11; var18 < 0; var18++) {
				int var19 = arg1[arg3++];
				if (var19 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var19;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("jb.b(IIII)V")
	public void method201(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 + this.field669;
		int var6 = arg3 + this.field670;
		int var7 = var5 + var6 * Pix2D.field624;
		int var8 = 0;
		int var9 = this.field668;
		int var10 = this.field667;
		int var11 = Pix2D.field624 - var10;
		int var12 = 0;
		if (var6 < Pix2D.field626) {
			int var13 = Pix2D.field626 - var6;
			var9 -= var13;
			var6 = Pix2D.field626;
			var8 += var13 * var10;
			var7 += var13 * Pix2D.field624;
		}
		if (var6 + var9 > Pix2D.field627) {
			var9 -= var6 + var9 - Pix2D.field627;
		}
		if (var5 < Pix2D.field628) {
			int var14 = Pix2D.field628 - var5;
			var10 -= var14;
			var5 = Pix2D.field628;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.field629) {
			int var15 = var5 + var10 - Pix2D.field629;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method202(var10, this.field660, var8, var7, Pix2D.field623, arg2, 0, this.field666, var12, var9, var11);
			int var16 = 88 / arg1;
		}
	}

	@ObfuscatedName("jb.a(IBII[III[IIII)V")
	public void method202(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
		int var12 = 256 - arg5;
		for (int var13 = -arg9; var13 < 0; var13++) {
			for (int var14 = -arg0; var14 < 0; var14++) {
				int var15 = arg7[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					int var16 = arg4[arg3];
					arg4[arg3++] = ((var15 & 0xFF00FF) * arg5 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg5 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg10;
			arg2 += arg8;
		}
		if (arg1 != -32) {
			this.field664 = !this.field664;
		}
	}

	@ObfuscatedName("jb.a(I[II[IZIIIIII)V")
	public void method203(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg4) {
			this.field659 = !this.field659;
		}
		try {
			int var12 = -arg0 / 2;
			int var13 = -arg7 / 2;
			int var14 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
			int var15 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
			int var16 = var14 * arg2 >> 8;
			int var17 = var15 * arg2 >> 8;
			int var18 = (arg6 << 16) + var13 * var16 + var12 * var17;
			int var19 = (arg9 << 16) + (var13 * var17 - var12 * var16);
			int var20 = arg5 + arg8 * Pix2D.field624;
			for (int var21 = 0; var21 < arg7; var21++) {
				int var22 = arg1[var21];
				int var23 = var20 + var22;
				int var24 = var18 + var17 * var22;
				int var25 = var19 - var16 * var22;
				for (int var26 = -arg3[var21]; var26 < 0; var26++) {
					Pix2D.field623[var23++] = this.field666[(var24 >> 16) + (var25 >> 16) * this.field667];
					var24 += var17;
					var25 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.field624;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("jb.a(IIIIIIIDI)V")
	public void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
		if (arg5 != 4) {
			return;
		}
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg7) * 65536.0D);
			int var14 = (int) (Math.cos(arg7) * 65536.0D);
			int var15 = var13 * arg2 >> 8;
			int var16 = var14 * arg2 >> 8;
			int var17 = (arg3 << 16) + var12 * var15 + var11 * var16;
			int var18 = (arg8 << 16) + (var12 * var16 - var11 * var15);
			int var19 = arg4 + arg0 * Pix2D.field624;
			for (int var20 = 0; var20 < arg1; var20++) {
				int var21 = var19;
				int var22 = var17;
				int var23 = var18;
				for (int var24 = -arg6; var24 < 0; var24++) {
					int var25 = this.field666[(var22 >> 16) + (var23 >> 16) * this.field667];
					if (var25 == 0) {
						var21++;
					} else {
						Pix2D.field623[var21++] = var25;
					}
					var22 += var16;
					var23 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.field624;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("jb.a(ZLkb;II)V")
	public void method205(boolean arg0, Pix8 arg1, int arg2, int arg3) {
		int var5 = arg3 + this.field669;
		int var6 = arg2 + this.field670;
		if (!arg0) {
			this.field662 = !this.field662;
		}
		int var7 = var5 + var6 * Pix2D.field624;
		int var8 = 0;
		int var9 = this.field668;
		int var10 = this.field667;
		int var11 = Pix2D.field624 - var10;
		int var12 = 0;
		if (var6 < Pix2D.field626) {
			int var13 = Pix2D.field626 - var6;
			var9 -= var13;
			var6 = Pix2D.field626;
			var8 += var13 * var10;
			var7 += var13 * Pix2D.field624;
		}
		if (var6 + var9 > Pix2D.field627) {
			var9 -= var6 + var9 - Pix2D.field627;
		}
		if (var5 < Pix2D.field628) {
			int var14 = Pix2D.field628 - var5;
			var10 -= var14;
			var5 = Pix2D.field628;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.field629) {
			int var15 = var5 + var10 - Pix2D.field629;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method206(var8, var12, 0, this.field666, arg1.field674, var10, var9, Pix2D.field623, (byte) 118, var11, var7);
		}
	}

	@ObfuscatedName("jb.a(III[I[BII[IBII)V")
	public void method206(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int[] arg7, byte arg8, int arg9, int arg10) {
		int var12 = -(arg5 >> 2);
		int var13 = -(arg5 & 0x3);
		if (arg8 != 118) {
			this.field659 = !this.field659;
		}
		for (int var14 = -arg6; var14 < 0; var14++) {
			for (int var15 = var12; var15 < 0; var15++) {
				int var16 = arg3[arg0++];
				if (var16 != 0 && arg4[arg10] == 0) {
					arg7[arg10++] = var16;
				} else {
					arg10++;
				}
				int var17 = arg3[arg0++];
				if (var17 != 0 && arg4[arg10] == 0) {
					arg7[arg10++] = var17;
				} else {
					arg10++;
				}
				int var18 = arg3[arg0++];
				if (var18 != 0 && arg4[arg10] == 0) {
					arg7[arg10++] = var18;
				} else {
					arg10++;
				}
				int var19 = arg3[arg0++];
				if (var19 != 0 && arg4[arg10] == 0) {
					arg7[arg10++] = var19;
				} else {
					arg10++;
				}
			}
			for (int var20 = var13; var20 < 0; var20++) {
				int var21 = arg3[arg0++];
				if (var21 != 0 && arg4[arg10] == 0) {
					arg7[arg10++] = var21;
				} else {
					arg10++;
				}
			}
			arg10 += arg9;
			arg0 += arg1;
		}
	}
}
