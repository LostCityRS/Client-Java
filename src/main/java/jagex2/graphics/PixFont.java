package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;
import jagex2.io.JagFile;
import jagex2.io.Packet;

import java.util.Random;

@ObfuscatedName("lb")
public class PixFont extends Pix2D {

	@ObfuscatedName("lb.z")
	public int field682 = 3;

	@ObfuscatedName("lb.B")
	public boolean field684 = true;

	@ObfuscatedName("lb.C")
	public int field685 = 3;

	@ObfuscatedName("lb.D")
	public boolean field686 = true;

	@ObfuscatedName("lb.E")
	public byte[][] field687 = new byte[94][];

	@ObfuscatedName("lb.F")
	public int[] field688 = new int[94];

	@ObfuscatedName("lb.G")
	public int[] field689 = new int[94];

	@ObfuscatedName("lb.H")
	public int[] field690 = new int[94];

	@ObfuscatedName("lb.I")
	public int[] field691 = new int[94];

	@ObfuscatedName("lb.J")
	public int[] field692 = new int[95];

	@ObfuscatedName("lb.K")
	public int[] field693 = new int[256];

	@ObfuscatedName("lb.M")
	public Random field695 = new Random();

	@ObfuscatedName("lb.N")
	public boolean field696 = false;

	@ObfuscatedName("lb.L")
	public int field694;

	@ObfuscatedName("lb.O")
	public static int[] field697 = new int[256];

	@ObfuscatedName("lb.A")
	public int field683;

	public PixFont(String arg0, JagFile arg1, boolean arg2) {
		Packet var4 = new Packet(arg1.method309(arg0 + ".dat", null), (byte) 3);
		Packet var5 = new Packet(arg1.method309("index.dat", null), (byte) 3);
		boolean var6 = true;
		var5.field711 = var4.method241() + 4;
		if (!arg2) {
			this.field682 = -151;
		}
		int var7 = var5.method239();
		if (var7 > 0) {
			var5.field711 += (var7 - 1) * 3;
		}
		for (int var8 = 0; var8 < 94; var8++) {
			this.field690[var8] = var5.method239();
			this.field691[var8] = var5.method239();
			int var10 = this.field688[var8] = var5.method241();
			int var11 = this.field689[var8] = var5.method241();
			int var12 = var5.method239();
			int var13 = var10 * var11;
			this.field687[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					this.field687[var8][var14] = var4.method240();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						this.field687[var8][var15 + var16 * var10] = var4.method240();
					}
				}
			}
			if (var11 > this.field694) {
				this.field694 = var11;
			}
			this.field690[var8] = 1;
			this.field692[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += this.field687[var8][var18 * var10];
			}
			int var10002;
			if (var17 <= var11 / 7) {
				var10002 = this.field692[var8]--;
				this.field690[var8] = 0;
			}
			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += this.field687[var8][var10 - 1 + var20 * var10];
			}
			if (var19 <= var11 / 7) {
				var10002 = this.field692[var8]--;
			}
		}
		this.field692[94] = this.field692[8];
		for (int var21 = 0; var21 < 256; var21++) {
			this.field693[var21] = this.field692[field697[var21]];
		}
		if (Linkable.field377) {
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;III)V")
	public void method214(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg2 == 0) {
			this.method217(arg4, arg3 - this.method216(arg1, true) / 2, arg0, this.field685, arg1);
		}
	}

	@ObfuscatedName("lb.a(IILjava/lang/String;ZIZ)V")
	public void method215(int arg0, int arg1, String arg2, boolean arg3, int arg4, boolean arg5) {
		if (!arg3) {
			this.field686 = !this.field686;
		}
		this.method219(arg5, arg2, arg4, (byte) 45, arg0, arg1 - this.method216(arg2, true) / 2);
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;Z)I")
	public int method216(String arg0, boolean arg1) {
		if (arg0 == null) {
			return 0;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			if (arg0.charAt(var4) == '@' && var4 + 4 < arg0.length() && arg0.charAt(var4 + 4) == '@') {
				var4 += 4;
			} else {
				var3 += this.field693[arg0.charAt(var4)];
			}
		}
		if (arg1) {
			return var3;
		} else {
			return this.field683;
		}
	}

	@ObfuscatedName("lb.a(IIIILjava/lang/String;)V")
	public void method217(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg3 < 3 || arg3 > 3) {
			this.field683 = -464;
		}
		if (arg4 == null) {
			return;
		}
		int var6 = arg2 - this.field694;
		for (int var7 = 0; var7 < arg4.length(); var7++) {
			int var8 = field697[arg4.charAt(var7)];
			if (var8 != 94) {
				this.method222(this.field687[var8], arg1 + this.field690[var8], var6 + this.field691[var8], this.field688[var8], this.field689[var8], arg0);
			}
			arg1 += this.field692[var8];
		}
	}

	@ObfuscatedName("lb.a(IIBILjava/lang/String;I)V")
	public void method218(int arg0, int arg1, byte arg2, int arg3, String arg4, int arg5) {
		if (arg4 == null) {
			return;
		}
		int var7 = arg3 - this.method216(arg4, true) / 2;
		int var8 = arg5 - this.field694;
		if (arg2 != -94) {
			for (int var9 = 1; var9 > 0; var9++) {
			}
		}
		for (int var10 = 0; var10 < arg4.length(); var10++) {
			int var11 = field697[arg4.charAt(var10)];
			if (var11 != 94) {
				this.method222(this.field687[var11], var7 + this.field690[var11], var8 + this.field691[var11] + (int) (Math.sin((double) var10 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.field688[var11], this.field689[var11], arg1);
			}
			var7 += this.field692[var11];
		}
	}

	@ObfuscatedName("lb.a(ZLjava/lang/String;IBII)V")
	public void method219(boolean arg0, String arg1, int arg2, byte arg3, int arg4, int arg5) {
		this.field696 = false;
		int var7 = arg5;
		if (arg1 == null) {
			return;
		}
		int var8 = arg2 - this.field694;
		if (arg3 != 45) {
			this.field684 = !this.field684;
		}
		for (int var9 = 0; var9 < arg1.length(); var9++) {
			if (arg1.charAt(var9) == '@' && var9 + 4 < arg1.length() && arg1.charAt(var9 + 4) == '@') {
				int var10 = this.method221((byte) 91, arg1.substring(var9 + 1, var9 + 4));
				if (var10 != -1) {
					arg4 = var10;
				}
				var9 += 4;
			} else {
				int var11 = field697[arg1.charAt(var9)];
				if (var11 != 94) {
					if (arg0) {
						this.method222(this.field687[var11], arg5 + this.field690[var11] + 1, var8 + this.field691[var11] + 1, this.field688[var11], this.field689[var11], 0);
					}
					this.method222(this.field687[var11], arg5 + this.field690[var11], var8 + this.field691[var11], this.field688[var11], this.field689[var11], arg4);
				}
				arg5 += this.field692[var11];
			}
		}
		if (this.field696) {
			Pix2D.method173(var7, var8 + (int) ((double) this.field694 * 0.7D), 4, 8388608, arg5 - var7);
		}
	}

	@ObfuscatedName("lb.a(ILjava/lang/String;IIZII)V")
	public void method220(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
		if (arg1 == null) {
			return;
		}
		this.field695.setSeed((long) arg5);
		int var8 = (this.field695.nextInt() & 0x1F) + 192;
		int var9 = arg0 - this.field694;
		if (arg2 != 21042) {
			return;
		}
		for (int var10 = 0; var10 < arg1.length(); var10++) {
			if (arg1.charAt(var10) == '@' && var10 + 4 < arg1.length() && arg1.charAt(var10 + 4) == '@') {
				int var11 = this.method221((byte) 91, arg1.substring(var10 + 1, var10 + 4));
				if (var11 != -1) {
					arg3 = var11;
				}
				var10 += 4;
			} else {
				int var12 = field697[arg1.charAt(var10)];
				if (var12 != 94) {
					if (arg4) {
						this.method224(this.field689[var12], var9 + this.field691[var12] + 1, 0, 192, this.field688[var12], this.field687[var12], 4, arg6 + this.field690[var12] + 1);
					}
					this.method224(this.field689[var12], var9 + this.field691[var12], arg3, var8, this.field688[var12], this.field687[var12], 4, arg6 + this.field690[var12]);
				}
				arg6 += this.field692[var12];
				if ((this.field695.nextInt() & 0x3) == 0) {
					arg6++;
				}
			}
		}
	}

	@ObfuscatedName("lb.a(BLjava/lang/String;)I")
	public int method221(byte arg0, String arg1) {
		if (arg0 != 91) {
			return 0;
		} else if (arg1.equals("red")) {
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
				this.field696 = true;
			}
			return -1;
		}
	}

	@ObfuscatedName("lb.a([BIIIII)V")
	public void method222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * Pix2D.field624;
		int var8 = Pix2D.field624 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.field626) {
			int var11 = Pix2D.field626 - arg2;
			arg4 -= var11;
			arg2 = Pix2D.field626;
			var10 += var11 * arg3;
			var7 += var11 * Pix2D.field624;
		}
		if (arg2 + arg4 >= Pix2D.field627) {
			arg4 -= arg2 + arg4 - Pix2D.field627 + 1;
		}
		if (arg1 < Pix2D.field628) {
			int var12 = Pix2D.field628 - arg1;
			arg3 -= var12;
			arg1 = Pix2D.field628;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= Pix2D.field629) {
			int var13 = arg1 + arg3 - Pix2D.field629 + 1;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method223(Pix2D.field623, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("lb.a([I[BIIIIIII)V")
	public void method223(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("lb.a(IIIII[BII)V")
	public void method224(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7) {
		if (arg6 < 4 || arg6 > 4) {
			this.field686 = !this.field686;
		}
		int var9 = arg7 + arg1 * Pix2D.field624;
		int var10 = Pix2D.field624 - arg4;
		int var11 = 0;
		int var12 = 0;
		if (arg1 < Pix2D.field626) {
			int var13 = Pix2D.field626 - arg1;
			arg0 -= var13;
			arg1 = Pix2D.field626;
			var12 += var13 * arg4;
			var9 += var13 * Pix2D.field624;
		}
		if (arg1 + arg0 >= Pix2D.field627) {
			arg0 -= arg1 + arg0 - Pix2D.field627 + 1;
		}
		if (arg7 < Pix2D.field628) {
			int var14 = Pix2D.field628 - arg7;
			arg4 -= var14;
			arg7 = Pix2D.field628;
			var12 += var14;
			var9 += var14;
			var11 += var14;
			var10 += var14;
		}
		if (arg7 + arg4 >= Pix2D.field629) {
			int var15 = arg7 + arg4 - Pix2D.field629 + 1;
			arg4 -= var15;
			var11 += var15;
			var10 += var15;
		}
		if (arg4 > 0 && arg0 > 0) {
			this.method225(arg2, Pix2D.field623, arg4, arg3, 32727, var11, arg5, var12, var10, arg0, var9);
		}
	}

	@ObfuscatedName("lb.a(I[IIIII[BIIII)V")
	public void method225(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
		int var12 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
		int var13 = 256 - arg3;
		if (arg4 != 32727) {
			return;
		}
		for (int var14 = -arg9; var14 < 0; var14++) {
			for (int var15 = -arg2; var15 < 0; var15++) {
				if (arg6[arg7++] == 0) {
					arg10++;
				} else {
					int var16 = arg1[arg10];
					arg1[arg10++] = (((var16 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 & 0xFF0000) >> 8) + var12;
				}
			}
			arg10 += arg8;
			arg7 += arg5;
		}
	}

	static {
		String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = var0.indexOf(var1);
			if (var2 == -1) {
				var2 = 74;
			}
			field697[var1] = var2;
		}
	}
}
