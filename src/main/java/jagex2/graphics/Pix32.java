package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.io.Jagfile;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public class Pix32 extends Pix2D {

	@ObfuscatedName("jb.A")
	public int field665 = 25800;

	@ObfuscatedName("jb.B")
	public boolean field666 = true;

	@ObfuscatedName("jb.C")
	public byte field667 = 9;

	@ObfuscatedName("jb.D")
	public boolean field668 = false;

	@ObfuscatedName("jb.F")
	public int[] field670;

	@ObfuscatedName("jb.K")
	public int field675;

	@ObfuscatedName("jb.G")
	public int field671;

	@ObfuscatedName("jb.L")
	public int field676;

	@ObfuscatedName("jb.H")
	public int field672;

	@ObfuscatedName("jb.J")
	public int field674;

	@ObfuscatedName("jb.I")
	public int field673;

	@ObfuscatedName("jb.E")
	public int field669;

	public Pix32(int arg0, int arg1) {
		this.field670 = new int[arg0 * arg1];
		this.field671 = this.field675 = arg0;
		this.field672 = this.field676 = arg1;
		this.field673 = this.field674 = 0;
	}

	public Pix32(byte[] arg0, java.awt.Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.field671 = var3.getWidth(arg1);
			this.field672 = var3.getHeight(arg1);
			this.field675 = this.field671;
			this.field676 = this.field672;
			this.field673 = 0;
			this.field674 = 0;
			this.field670 = new int[this.field672 * this.field671];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field671, this.field672, this.field670, 0, this.field671);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet((byte) -109, arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet((byte) -109, arg0.read("index.dat", null));
		var5.pos = var4.g2();
		this.field675 = var5.g2();
		this.field676 = var5.g2();
		int var6 = var5.g1();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.g3();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.field673 = var5.g1();
		this.field674 = var5.g1();
		this.field671 = var5.g2();
		this.field672 = var5.g2();
		int var10 = var5.g1();
		int var11 = this.field672 * this.field671;
		this.field670 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.field670[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.field671; var13++) {
				for (int var14 = 0; var14 < this.field672; var14++) {
					this.field670[this.field671 * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void method193(int arg0) {
		int var2 = 51 / arg0;
		Pix2D.method164(this.field671, 2, this.field670, this.field672);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method194(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field670.length; var5++) {
			int var6 = this.field670[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xFF;
				int var8 = arg0 + var7;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = var6 >> 8 & 0xFF;
				int var10 = arg3 + var9;
				if (var10 < 1) {
					var10 = 1;
				} else if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var6 & 0xFF;
				int var12 = arg1 + var11;
				if (var12 < 1) {
					var12 = 1;
				} else if (var12 > 255) {
					var12 = 255;
				}
				this.field670[var5] = (var8 << 16) + (var10 << 8) + var12;
			}
		}
		if (arg2 < 8 || arg2 > 8) {
			this.field666 = !this.field666;
		}
	}

	@ObfuscatedName("jb.b(Z)V")
	public void method195(boolean arg0) {
		int[] var2 = new int[this.field676 * this.field675];
		for (int var3 = 0; var3 < this.field672; var3++) {
			for (int var4 = 0; var4 < this.field671; var4++) {
				var2[(this.field674 + var3) * this.field675 + this.field673 + var4] = this.field670[this.field671 * var3 + var4];
			}
		}
		this.field670 = var2;
		this.field671 = this.field675;
		if (!arg0) {
			this.field672 = this.field676;
			this.field673 = 0;
			this.field674 = 0;
		}
	}

	@ObfuscatedName("jb.a(III)V")
	public void method196(int arg0, int arg1, int arg2) {
		int var4 = this.field673 + arg0;
		int var5 = this.field674 + arg1;
		int var6 = Pix2D.field628 * var5 + var4;
		int var7 = 0;
		int var8 = this.field672;
		int var9 = this.field671;
		int var10 = Pix2D.field628 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field630) {
			int var12 = Pix2D.field630 - var5;
			var8 -= var12;
			var5 = Pix2D.field630;
			var7 += var9 * var12;
			var6 += Pix2D.field628 * var12;
		}
		if (var5 + var8 > Pix2D.field631) {
			var8 -= var5 + var8 - Pix2D.field631;
		}
		if (var4 < Pix2D.field632) {
			int var13 = Pix2D.field632 - var4;
			var9 -= var13;
			var4 = Pix2D.field632;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field633) {
			int var14 = var4 + var9 - Pix2D.field633;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method197(var7, this.field670, var11, 3, var10, var6, var9, var8, Pix2D.field627);
			if (arg2 < 7 || arg2 > 7) {
				;
			}
		}
	}

	@ObfuscatedName("jb.a(I[IIIIIII[I)V")
	public void method197(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg6 >> 2);
		int var11 = -(arg6 & 0x3);
		if (arg3 != 3) {
			return;
		}
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
				arg8[arg5++] = arg1[arg0++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg8[arg5++] = arg1[arg0++];
			}
			arg5 += arg4;
			arg0 += arg2;
		}
	}

	@ObfuscatedName("jb.a(BII)V")
	public void method198(byte arg0, int arg1, int arg2) {
		if (this.field667 != arg0) {
			return;
		}
		int var4 = this.field673 + arg1;
		int var5 = this.field674 + arg2;
		int var6 = Pix2D.field628 * var5 + var4;
		int var7 = 0;
		int var8 = this.field672;
		int var9 = this.field671;
		int var10 = Pix2D.field628 - var9;
		int var11 = 0;
		if (var5 < Pix2D.field630) {
			int var12 = Pix2D.field630 - var5;
			var8 -= var12;
			var5 = Pix2D.field630;
			var7 += var9 * var12;
			var6 += Pix2D.field628 * var12;
		}
		if (var5 + var8 > Pix2D.field631) {
			var8 -= var5 + var8 - Pix2D.field631;
		}
		if (var4 < Pix2D.field632) {
			int var13 = Pix2D.field632 - var4;
			var9 -= var13;
			var4 = Pix2D.field632;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.field633) {
			int var14 = var4 + var9 - Pix2D.field633;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.method199(Pix2D.field627, this.field670, 0, var7, var6, var9, var8, var10, var11);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void method199(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
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
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
				int var19 = arg1[arg3++];
				if (var19 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var19;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("jb.b(IIII)V")
	public void method200(int arg0, int arg1, int arg2, int arg3) {
		int var5 = this.field673 + arg0;
		int var6 = this.field674 + arg3;
		int var7 = Pix2D.field628 * var6 + var5;
		int var8 = 0;
		int var9 = this.field672;
		int var10 = this.field671;
		int var11 = Pix2D.field628 - var10;
		int var12 = 0;
		if (var6 < Pix2D.field630) {
			int var13 = Pix2D.field630 - var6;
			var9 -= var13;
			var6 = Pix2D.field630;
			var8 += var10 * var13;
			var7 += Pix2D.field628 * var13;
		}
		if (var6 + var9 > Pix2D.field631) {
			var9 -= var6 + var9 - Pix2D.field631;
		}
		if (var5 < Pix2D.field632) {
			int var14 = Pix2D.field632 - var5;
			var10 -= var14;
			var5 = Pix2D.field632;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.field633) {
			int var15 = var5 + var10 - Pix2D.field633;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method201(0, var12, -855, this.field670, var11, var9, arg1, var7, var10, var8, Pix2D.field627);
			if (arg2 <= 0) {
				this.field669 = 317;
			}
		}
	}

	@ObfuscatedName("jb.a(III[IIIIIII[I)V")
	public void method201(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
		int var12 = 256 - arg6;
		for (int var13 = -arg5; var13 < 0; var13++) {
			for (int var14 = -arg8; var14 < 0; var14++) {
				int var15 = arg3[arg9++];
				if (var15 == 0) {
					arg7++;
				} else {
					int var16 = arg10[arg7];
					arg10[arg7++] = ((var15 & 0xFF00FF) * arg6 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg6 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
			}
			arg7 += arg4;
			arg9 += arg1;
		}
		if (arg2 >= 0) {
			this.field666 = !this.field666;
		}
	}

	@ObfuscatedName("jb.a(IIIIIIZ[I[III)V")
	public void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int[] arg7, int[] arg8, int arg9, int arg10) {
		if (arg6) {
			return;
		}
		try {
			int var12 = -arg2 / 2;
			int var13 = -arg10 / 2;
			int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
			int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
			int var16 = arg3 * var14 >> 8;
			int var17 = arg3 * var15 >> 8;
			int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
			int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
			int var20 = Pix2D.field628 * arg4 + arg0;
			for (int var21 = 0; var21 < arg10; var21++) {
				int var22 = arg8[var21];
				int var23 = var20 + var22;
				int var24 = var17 * var22 + var18;
				int var25 = var19 - var16 * var22;
				for (int var26 = -arg7[var21]; var26 < 0; var26++) {
					Pix2D.field627[var23++] = this.field670[(var24 >> 16) + (var25 >> 16) * this.field671];
					var24 += var17;
					var25 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.field628;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("jb.a(IBDIIIIII)V")
	public void method203(int arg0, byte arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg1 != 0) {
			for (int var11 = 1; var11 > 0; var11++) {
			}
		}
		try {
			int var12 = -arg6 / 2;
			int var13 = -arg7 / 2;
			int var14 = (int) (Math.sin(arg2) * 65536.0D);
			int var15 = (int) (Math.cos(arg2) * 65536.0D);
			int var16 = arg3 * var14 >> 8;
			int var17 = arg3 * var15 >> 8;
			int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
			int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
			int var20 = Pix2D.field628 * arg0 + arg8;
			for (int var21 = 0; var21 < arg7; var21++) {
				int var22 = var20;
				int var23 = var18;
				int var24 = var19;
				for (int var25 = -arg6; var25 < 0; var25++) {
					int var26 = this.field670[(var23 >> 16) + (var24 >> 16) * this.field671];
					if (var26 == 0) {
						var22++;
					} else {
						Pix2D.field627[var22++] = var26;
					}
					var23 += var17;
					var24 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.field628;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("jb.a(Lkb;ZII)V")
	public void method204(Pix8 arg0, boolean arg1, int arg2, int arg3) {
		int var5 = this.field673 + arg2;
		int var6 = this.field674 + arg3;
		int var7 = Pix2D.field628 * var6 + var5;
		int var8 = 0;
		int var9 = this.field672;
		int var10 = this.field671;
		int var11 = Pix2D.field628 - var10;
		int var12 = 0;
		if (arg1) {
			return;
		}
		if (var6 < Pix2D.field630) {
			int var13 = Pix2D.field630 - var6;
			var9 -= var13;
			var6 = Pix2D.field630;
			var8 += var10 * var13;
			var7 += Pix2D.field628 * var13;
		}
		if (var6 + var9 > Pix2D.field631) {
			var9 -= var6 + var9 - Pix2D.field631;
		}
		if (var5 < Pix2D.field632) {
			int var14 = Pix2D.field632 - var5;
			var10 -= var14;
			var5 = Pix2D.field632;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.field633) {
			int var15 = var5 + var10 - Pix2D.field633;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.method205(var7, 0, this.field670, var10, var12, var8, var11, var9, Pix2D.field627, (byte) 18, arg0.field683);
		}
	}

	@ObfuscatedName("jb.a(II[IIIIII[IB[B)V")
	public void method205(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte arg9, byte[] arg10) {
		if (arg9 != 18) {
			this.field666 = !this.field666;
		}
		int var12 = -(arg3 >> 2);
		int var13 = -(arg3 & 0x3);
		for (int var14 = -arg7; var14 < 0; var14++) {
			for (int var15 = var12; var15 < 0; var15++) {
				int var18 = arg2[arg5++];
				if (var18 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var18;
				} else {
					arg0++;
				}
				int var19 = arg2[arg5++];
				if (var19 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var19;
				} else {
					arg0++;
				}
				int var20 = arg2[arg5++];
				if (var20 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var20;
				} else {
					arg0++;
				}
				int var21 = arg2[arg5++];
				if (var21 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var21;
				} else {
					arg0++;
				}
			}
			for (int var16 = var13; var16 < 0; var16++) {
				int var17 = arg2[arg5++];
				if (var17 != 0 && arg10[arg0] == 0) {
					arg8[arg0++] = var17;
				} else {
					arg0++;
				}
			}
			arg0 += arg6;
			arg5 += arg4;
		}
	}
}
