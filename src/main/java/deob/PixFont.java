package deob;

import java.util.Random;

@ObfuscatedName("lb")
public class PixFont extends Pix2D {

	@ObfuscatedName("lb.B")
	public int field692 = 11089;

	@ObfuscatedName("lb.D")
	public byte field694 = 8;

	@ObfuscatedName("lb.E")
	public boolean field695 = false;

	@ObfuscatedName("lb.G")
	public byte[][] field697 = new byte[94][];

	@ObfuscatedName("lb.H")
	public int[] field698 = new int[94];

	@ObfuscatedName("lb.I")
	public int[] field699 = new int[94];

	@ObfuscatedName("lb.J")
	public int[] field700 = new int[94];

	@ObfuscatedName("lb.K")
	public int[] field701 = new int[94];

	@ObfuscatedName("lb.L")
	public int[] field702 = new int[95];

	@ObfuscatedName("lb.M")
	public int[] field703 = new int[256];

	@ObfuscatedName("lb.O")
	public Random field705 = new Random();

	@ObfuscatedName("lb.P")
	public boolean field706 = false;

	@ObfuscatedName("lb.F")
	public int field696;

	@ObfuscatedName("lb.N")
	public int field704;

	@ObfuscatedName("lb.Q")
	public static int[] field707 = new int[256];

	@ObfuscatedName("lb.A")
	public int field691;

	@ObfuscatedName("lb.C")
	public int field693;

	public PixFont(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet((byte) -109, arg0.method308(arg1 + ".dat", null));
		Packet var5 = new Packet((byte) -109, arg0.method308("index.dat", null));
		boolean var6 = true;
		if (arg2 != 0) {
			this.field696 = 169;
		}
		var5.field719 = var4.method240() + 4;
		int var7 = var5.method238();
		if (var7 > 0) {
			var5.field719 += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 94; var8++) {
			this.field700[var8] = var5.method238();
			this.field701[var8] = var5.method238();
			int var11 = this.field698[var8] = var5.method240();
			int var12 = this.field699[var8] = var5.method240();
			int var13 = var5.method238();
			int var14 = var11 * var12;
			this.field697[var8] = new byte[var14];
			if (var13 == 0) {
				for (int var15 = 0; var15 < var14; var15++) {
					this.field697[var8][var15] = var4.method239();
				}
			} else if (var13 == 1) {
				for (int var16 = 0; var16 < var11; var16++) {
					for (int var17 = 0; var17 < var12; var17++) {
						this.field697[var8][var11 * var17 + var16] = var4.method239();
					}
				}
			}
			if (var12 > this.field704) {
				this.field704 = var12;
			}
			this.field700[var8] = 1;
			this.field702[var8] = var11 + 2;
			int var18 = 0;
			for (int var19 = var12 / 7; var19 < var12; var19++) {
				var18 += this.field697[var8][var11 * var19];
			}
			int var10002;
			if (var18 <= var12 / 7) {
				var10002 = this.field702[var8]--;
				this.field700[var8] = 0;
			}
			int var20 = 0;
			for (int var21 = var12 / 7; var21 < var12; var21++) {
				var20 += this.field697[var8][var11 * var21 + (var11 - 1)];
			}
			if (var20 <= var12 / 7) {
				var10002 = this.field702[var8]--;
			}
		}
		this.field702[94] = this.field702[8];
		for (int var9 = 0; var9 < 256; var9++) {
			this.field703[var9] = this.field702[field707[var9]];
		}
	}

	@ObfuscatedName("lb.a(IIILjava/lang/String;I)V")
	public void method213(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg1 >= 1 && arg1 <= 1) {
			this.method216(arg3, arg2, (byte) 8, arg4, arg0 - this.method215(arg3, (byte) 4) / 2);
		}
	}

	@ObfuscatedName("lb.a(IZLjava/lang/String;ZII)V")
	public void method214(int arg0, boolean arg1, String arg2, boolean arg3, int arg4, int arg5) {
		if (arg3) {
			this.method218(arg5, arg0 - this.method215(arg2, (byte) 4) / 2, arg1, false, arg4, arg2);
		}
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;B)I")
	public int method215(String arg0, byte arg1) {
		if (arg1 == 4) {
			boolean var3 = false;
		} else {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		if (arg0 == null) {
			return 0;
		}
		int var5 = 0;
		for (int var6 = 0; var6 < arg0.length(); var6++) {
			if (arg0.charAt(var6) == '@' && var6 + 4 < arg0.length() && arg0.charAt(var6 + 4) == '@') {
				var6 += 4;
			} else {
				var5 += this.field703[arg0.charAt(var6)];
			}
		}
		return var5;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;IBII)V")
	public void method216(String arg0, int arg1, byte arg2, int arg3, int arg4) {
		if (this.field694 == arg2) {
			boolean var6 = false;
		} else {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		if (arg0 == null) {
			return;
		}
		int var8 = arg3 - this.field704;
		for (int var9 = 0; var9 < arg0.length(); var9++) {
			int var10 = field707[arg0.charAt(var9)];
			if (var10 != 94) {
				this.method221(this.field697[var10], this.field700[var10] + arg4, this.field701[var10] + var8, this.field698[var10], this.field699[var10], arg1);
			}
			arg4 += this.field702[var10];
		}
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;III)V")
	public void method217(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 == null) {
			return;
		}
		int var7 = arg4 - this.method215(arg2, (byte) 4) / 2;
		int var8 = arg0 - this.field704;
		if (arg3 != 29720) {
			return;
		}
		for (int var9 = 0; var9 < arg2.length(); var9++) {
			int var10 = field707[arg2.charAt(var9)];
			if (var10 != 94) {
				this.method221(this.field697[var10], this.field700[var10] + var7, this.field701[var10] + var8 + (int) (Math.sin((double) arg1 / 5.0D + (double) var9 / 2.0D) * 5.0D), this.field698[var10], this.field699[var10], arg5);
			}
			var7 += this.field702[var10];
		}
	}

	@ObfuscatedName("lb.a(IIZZILjava/lang/String;)V")
	public void method218(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, String arg5) {
		this.field706 = false;
		int var7 = arg1;
		if (arg3) {
			this.field692 = 183;
		}
		if (arg5 == null) {
			return;
		}
		int var8 = arg4 - this.field704;
		for (int var9 = 0; var9 < arg5.length(); var9++) {
			if (arg5.charAt(var9) == '@' && var9 + 4 < arg5.length() && arg5.charAt(var9 + 4) == '@') {
				int var10 = this.method220(-856, arg5.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg0 = var10;
				}
				var9 += 4;
			} else {
				int var11 = field707[arg5.charAt(var9)];
				if (var11 != 94) {
					if (arg2) {
						this.method221(this.field697[var11], this.field700[var11] + arg1 + 1, this.field701[var11] + var8 + 1, this.field698[var11], this.field699[var11], 0);
					}
					this.method221(this.field697[var11], this.field700[var11] + arg1, this.field701[var11] + var8, this.field698[var11], this.field699[var11], arg0);
				}
				arg1 += this.field702[var11];
			}
		}
		if (this.field706) {
			Pix2D.method172(8388608, (int) ((double) this.field704 * 0.7D) + var8, arg1 - var7, var7, this.field693);
		}
	}

	@ObfuscatedName("lb.a(ZIIIIILjava/lang/String;)V")
	public void method219(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
		if (arg6 == null) {
			return;
		}
		this.field705.setSeed((long) arg1);
		int var8 = (this.field705.nextInt() & 0x1F) + 192;
		int var9 = arg3 - this.field704;
		if (arg4 != 7019) {
			return;
		}
		for (int var10 = 0; var10 < arg6.length(); var10++) {
			if (arg6.charAt(var10) == '@' && var10 + 4 < arg6.length() && arg6.charAt(var10 + 4) == '@') {
				int var11 = this.method220(-856, arg6.substring(var10 + 1, var10 + 4));
				if (var11 != -1) {
					arg5 = var11;
				}
				var10 += 4;
			} else {
				int var12 = field707[arg6.charAt(var10)];
				if (var12 != 94) {
					if (arg0) {
						this.method223(0, this.field699[var12], this.field697[var12], this.field701[var12] + var9 + 1, 1, this.field700[var12] + arg2 + 1, this.field698[var12], 192);
					}
					this.method223(arg5, this.field699[var12], this.field697[var12], this.field701[var12] + var9, 1, this.field700[var12] + arg2, this.field698[var12], var8);
				}
				arg2 += this.field702[var12];
				if ((this.field705.nextInt() & 0x3) == 0) {
					arg2++;
				}
			}
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;)I")
	public int method220(int arg0, String arg1) {
		while (arg0 >= 0) {
			this.field691 = -315;
		}
		if (arg1.equals("red")) {
			return 16711680;
		} else if (arg1.equals("gre")) {
			return 65280;
		} else if (arg1.equals("blu")) {
			return 255;
		} else if (arg1.equals("yel")) {
			return 16776960;
		} else if (arg1.equals("cya")) {
			return 65535;
		} else if (arg1.equals("mag")) {
			return 16711935;
		} else if (arg1.equals("whi")) {
			return 16777215;
		} else if (arg1.equals("bla")) {
			return 0;
		} else if (arg1.equals("lre")) {
			return 16748608;
		} else if (arg1.equals("dre")) {
			return 8388608;
		} else if (arg1.equals("dbl")) {
			return 128;
		} else if (arg1.equals("or1")) {
			return 16756736;
		} else if (arg1.equals("or2")) {
			return 16740352;
		} else if (arg1.equals("or3")) {
			return 16723968;
		} else if (arg1.equals("gr1")) {
			return 12648192;
		} else if (arg1.equals("gr2")) {
			return 8453888;
		} else if (arg1.equals("gr3")) {
			return 4259584;
		} else {
			if (arg1.equals("str")) {
				this.field706 = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void method221(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.field628 * arg2 + arg1;
		int var8 = Pix2D.field628 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.field630) {
			int var11 = Pix2D.field630 - arg2;
			arg4 -= var11;
			arg2 = Pix2D.field630;
			var10 += arg3 * var11;
			var7 += Pix2D.field628 * var11;
		}
		if (arg2 + arg4 >= Pix2D.field631) {
			arg4 -= arg2 + arg4 - Pix2D.field631 + 1;
		}
		if (arg1 < Pix2D.field632) {
			int var12 = Pix2D.field632 - arg1;
			arg3 -= var12;
			arg1 = Pix2D.field632;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.field633) {
			int var13 = arg1 + arg3 - Pix2D.field633 + 1;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method222(Pix2D.field627, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void method222(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(II[BIIIII)V")
	public void method223(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg4 != 1) {
			for (int var9 = 1; var9 > 0; var9++) {
			}
		}
		int var10 = Pix2D.field628 * arg3 + arg5;
		int var11 = Pix2D.field628 - arg6;
		int var12 = 0;
		int var13 = 0;
		if (arg3 < Pix2D.field630) {
			int var14 = Pix2D.field630 - arg3;
			arg1 -= var14;
			arg3 = Pix2D.field630;
			var13 += arg6 * var14;
			var10 += Pix2D.field628 * var14;
		}
		if (arg1 + arg3 >= Pix2D.field631) {
			arg1 -= arg1 + arg3 - Pix2D.field631 + 1;
		}
		if (arg5 < Pix2D.field632) {
			int var15 = Pix2D.field632 - arg5;
			arg6 -= var15;
			arg5 = Pix2D.field632;
			var13 += var15;
			var10 += var15;
			var12 += var15;
			var11 += var15;
		}
		if (arg5 + arg6 >= Pix2D.field633) {
			int var16 = arg5 + arg6 - Pix2D.field633 + 1;
			arg6 -= var16;
			var12 += var16;
			var11 += var16;
		}
		if (arg6 > 0 && arg1 > 0) {
			this.method224(var12, arg0, var10, Pix2D.field627, 4, var13, var11, arg7, arg1, arg2, arg6);
		}
	}

	@ObfuscatedName("lb.a(III[IIIIII[BI)V")
	public void method224(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
		int var12 = ((arg1 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		int var13 = 256 - arg7;
		if (arg4 != 4) {
			this.field695 = !this.field695;
		}
		for (int var14 = -arg8; var14 < 0; var14++) {
			for (int var15 = -arg10; var15 < 0; var15++) {
				if (arg9[arg5++] == 0) {
					arg2++;
				} else {
					int var16 = arg3[arg2];
					arg3[arg2++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
				}
			}
			arg2 += arg6;
			arg5 += arg0;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}
			field707[var1] = var2;
		}
	}
}
