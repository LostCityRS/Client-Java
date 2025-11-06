package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("kb")
public class Pix8 extends Pix2D {

	@ObfuscatedName("kb.z")
	public boolean field673 = false;

	@ObfuscatedName("kb.G")
	public int field680;

	@ObfuscatedName("kb.H")
	public int field681;

	@ObfuscatedName("kb.B")
	public int[] field675;

	@ObfuscatedName("kb.E")
	public int field678;

	@ObfuscatedName("kb.F")
	public int field679;

	@ObfuscatedName("kb.C")
	public int field676;

	@ObfuscatedName("kb.D")
	public int field677;

	@ObfuscatedName("kb.A")
	public byte[] field674;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method309(arg1 + ".dat", null), (byte) 3);
		Packet var5 = new Packet(arg0.method309("index.dat", null), (byte) 3);
		var5.field711 = var4.method241();
		this.field680 = var5.method241();
		this.field681 = var5.method241();
		int var6 = var5.method239();
		this.field675 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.field675[var7 + 1] = var5.method243();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field711 += 2;
			var4.field711 += var5.method241() * var5.method241();
			var5.field711++;
		}
		this.field678 = var5.method239();
		this.field679 = var5.method239();
		this.field676 = var5.method241();
		this.field677 = var5.method241();
		int var9 = var5.method239();
		int var10 = this.field676 * this.field677;
		this.field674 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.field674[var11] = var4.method240();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.field676; var12++) {
				for (int var13 = 0; var13 < this.field677; var13++) {
					this.field674[var12 + var13 * this.field676] = var4.method240();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(Z)V")
	public void method207(boolean arg0) {
		this.field680 /= 2;
		this.field681 /= 2;
		byte[] var2 = new byte[this.field680 * this.field681];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field677; var4++) {
			for (int var5 = 0; var5 < this.field676; var5++) {
				var2[(var5 + this.field678 >> 1) + (var4 + this.field679 >> 1) * this.field680] = this.field674[var3++];
			}
		}
		this.field674 = var2;
		this.field676 = this.field680;
		this.field677 = this.field681;
		this.field678 = 0;
		if (!arg0) {
			this.field673 = !this.field673;
		}
		this.field679 = 0;
	}

	@ObfuscatedName("kb.a(B)V")
	public void method208(byte arg0) {
		if (this.field676 == this.field680 && this.field677 == this.field681) {
			return;
		}
		byte[] var2 = new byte[this.field680 * this.field681];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field677; var4++) {
			for (int var5 = 0; var5 < this.field676; var5++) {
				var2[var5 + this.field678 + (var4 + this.field679) * this.field680] = this.field674[var3++];
			}
		}
		if (arg0 != -86) {
			this.field673 = !this.field673;
		}
		this.field674 = var2;
		this.field676 = this.field680;
		this.field677 = this.field681;
		this.field678 = 0;
		this.field679 = 0;
	}

	@ObfuscatedName("kb.b(B)V")
	public void method209(byte arg0) {
		byte[] var2 = new byte[this.field676 * this.field677];
		int var3 = 0;
		for (int var4 = 0; var4 < this.field677; var4++) {
			for (int var5 = this.field676 - 1; var5 >= 0; var5--) {
				var2[var3++] = this.field674[var5 + var4 * this.field676];
			}
		}
		this.field674 = var2;
		if (arg0 != 15) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		this.field678 = this.field680 - this.field676 - this.field678;
	}

	@ObfuscatedName("kb.b(Z)V")
	public void method210(boolean arg0) {
		if (arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		byte[] var3 = new byte[this.field676 * this.field677];
		int var4 = 0;
		for (int var5 = this.field677 - 1; var5 >= 0; var5--) {
			for (int var6 = 0; var6 < this.field676; var6++) {
				var3[var4++] = this.field674[var6 + var5 * this.field676];
			}
		}
		this.field674 = var3;
		this.field679 = this.field681 - this.field677 - this.field679;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void method211(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field675.length; var5++) {
			int var6 = this.field675[var5] >> 16 & 0xFF;
			int var7 = var6 + arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			int var8 = this.field675[var5] >> 8 & 0xFF;
			int var9 = var8 + arg1;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}
			int var10 = this.field675[var5] & 0xFF;
			int var11 = var10 + arg3;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			this.field675[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
		if (arg0 < 0 || arg0 > 0) {
			;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void method212(int arg0, int arg1, int arg2) {
		int var4 = arg1 + this.field678;
		int var5 = arg2 + this.field679;
		int var6 = var4 + var5 * Pix2D.field624;
		int var7 = 0;
		int var8 = this.field677;
		int var9 = this.field676;
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
			this.method213(this.field674, -107, Pix2D.field623, var7, var11, this.field675, var8, var9, var10, var6);
			if (arg0 < 1 || arg0 > 1) {
				;
			}
		}
	}

	@ObfuscatedName("kb.a([BI[III[IIIII)V")
	public void method213(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg1 >= 0) {
			return;
		}
		int var11 = -(arg7 >> 2);
		int var12 = -(arg7 & 0x3);
		for (int var13 = -arg6; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				byte var15 = arg0[arg3++];
				if (var15 == 0) {
					arg9++;
				} else {
					arg2[arg9++] = arg5[var15 & 0xFF];
				}
				byte var16 = arg0[arg3++];
				if (var16 == 0) {
					arg9++;
				} else {
					arg2[arg9++] = arg5[var16 & 0xFF];
				}
				byte var17 = arg0[arg3++];
				if (var17 == 0) {
					arg9++;
				} else {
					arg2[arg9++] = arg5[var17 & 0xFF];
				}
				byte var18 = arg0[arg3++];
				if (var18 == 0) {
					arg9++;
				} else {
					arg2[arg9++] = arg5[var18 & 0xFF];
				}
			}
			for (int var19 = var12; var19 < 0; var19++) {
				byte var20 = arg0[arg3++];
				if (var20 == 0) {
					arg9++;
				} else {
					arg2[arg9++] = arg5[var20 & 0xFF];
				}
			}
			arg9 += arg8;
			arg3 += arg4;
		}
	}
}
