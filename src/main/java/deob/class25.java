package deob;

@ObfuscatedName("e")
public final class class25 extends class111 {

	@ObfuscatedName("e.zb")
	public int field744;

	@ObfuscatedName("e.Bb")
	public int field746;

	@ObfuscatedName("e.Eb")
	public int field749;

	@ObfuscatedName("e.Cb")
	public int field747;

	@ObfuscatedName("e.Fb")
	public int field750;

	@ObfuscatedName("e.Gb")
	public int field751;

	@ObfuscatedName("e.Db")
	public byte[] field748;

	@ObfuscatedName("e.Ab")
	public int[] field745;

	@ObfuscatedName("e.d()Le;")
	public class25 method328() {
		class25 var1 = new class25(this.field744, this.field749, this.field745.length);
		var1.field746 = this.field746;
		var1.field747 = this.field747;
		var1.field751 = this.field751;
		var1.field750 = this.field750;
		int var2 = this.field748.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1.field748[var3] = this.field748[var3];
		}
		int var4 = this.field745.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var1.field745[var5] = this.field745[var5];
		}
		return var1;
	}

	@ObfuscatedName("e.a(II)V")
	public void method329(int arg0, int arg1) {
		int var3 = this.field751 + arg0;
		int var4 = this.field750 + arg1;
		int var5 = Statics.field2749 * var4 + var3;
		int var6 = 0;
		int var7 = this.field749;
		int var8 = this.field744;
		int var9 = Statics.field2749 - var8;
		int var10 = 0;
		if (var4 < class111.field2748) {
			int var11 = class111.field2748 - var4;
			var7 -= var11;
			var4 = class111.field2748;
			var6 = var8 * var11;
			var5 += Statics.field2749 * var11;
		}
		if (var4 + var7 > class111.field2751) {
			var7 -= var4 + var7 - class111.field2751;
		}
		if (var3 < class111.field2752) {
			int var12 = class111.field2752 - var3;
			var8 -= var12;
			var3 = class111.field2752;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class111.field2753) {
			int var13 = var3 + var8 - class111.field2753;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method330(Statics.field2747, this.field748, this.field745, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("e.a([I[B[IIIIIII)V")
	public static void method330(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var9 = -(arg5 >> 2);
		int var10 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				byte var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var13 & 0xFF];
				}
				byte var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var14 & 0xFF];
				}
				byte var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var15 & 0xFF];
				}
				byte var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var16 & 0xFF];
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				byte var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[var18 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("e.e()V")
	public void method331() {
		if (this.field746 == this.field744 && this.field749 == this.field747) {
			return;
		}
		byte[] var1 = new byte[this.field747 * this.field746];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field749; var3++) {
			for (int var4 = 0; var4 < this.field744; var4++) {
				var1[(this.field750 + var3) * this.field746 + this.field751 + var4] = this.field748[var2++];
			}
		}
		this.field748 = var1;
		this.field744 = this.field746;
		this.field749 = this.field747;
		this.field751 = 0;
		this.field750 = 0;
	}

	@ObfuscatedName("e.f()V")
	public void method332() {
		byte[] var1 = new byte[this.field749 * this.field744];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field749; var3++) {
			for (int var4 = this.field744 - 1; var4 >= 0; var4--) {
				var1[var2++] = this.field748[this.field744 * var3 + var4];
			}
		}
		this.field748 = var1;
		this.field751 = this.field746 - this.field744 - this.field751;
	}

	@ObfuscatedName("e.g()V")
	public void method333() {
		byte[] var1 = new byte[this.field749 * this.field744];
		int var2 = 0;
		for (int var3 = this.field749 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.field744; var4++) {
				var1[var2++] = this.field748[this.field744 * var3 + var4];
			}
		}
		this.field748 = var1;
		this.field750 = this.field747 - this.field749 - this.field750;
	}

	@ObfuscatedName("e.a(III)V")
	public void method334(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field745.length; var4++) {
			int var5 = this.field745[var4] >> 16 & 0xFF;
			int var6 = arg0 + var5;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field745[var4] >> 8 & 0xFF;
			int var8 = arg1 + var7;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.field745[var4] & 0xFF;
			int var10 = arg2 + var9;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.field745[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}

	public class25() {
	}

	public class25(int arg0, int arg1, int arg2) {
		this.field746 = this.field744 = arg0;
		this.field747 = this.field749 = arg1;
		this.field751 = this.field750 = 0;
		this.field748 = new byte[arg0 * arg1];
		this.field745 = new int[arg2];
	}
}
