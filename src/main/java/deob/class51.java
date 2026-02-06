package deob;

@ObfuscatedName("hb")
public final class class51 extends class141 {

	@ObfuscatedName("hb.P")
	public int field1165;

	@ObfuscatedName("hb.R")
	public int field1167;

	@ObfuscatedName("hb.S")
	public int field1168;

	@ObfuscatedName("hb.U")
	public int field1169;

	@ObfuscatedName("hb.V")
	public int field1170;

	@ObfuscatedName("hb.X")
	public int field1171;

	@ObfuscatedName("hb.O")
	public byte[] field1164;

	@ObfuscatedName("hb.Q")
	public int[] field1166;

	@ObfuscatedName("hb.a([I[B[IIIIIII)V")
	public static void method400(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("hb.d()V")
	public void method398() {
		if (this.field1167 == this.field1169 && this.field1171 == this.field1168) {
			return;
		}
		byte[] var1 = new byte[this.field1169 * this.field1168];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field1171; var3++) {
			for (int var4 = 0; var4 < this.field1167; var4++) {
				var1[var4 + this.field1170 + (var3 + this.field1165) * this.field1169] = this.field1164[var2++];
			}
		}
		this.field1164 = var1;
		this.field1167 = this.field1169;
		this.field1171 = this.field1168;
		this.field1170 = 0;
		this.field1165 = 0;
	}

	@ObfuscatedName("hb.b(II)V")
	public void method399(int arg0, int arg1) {
		int var3 = arg0 + this.field1170;
		int var4 = arg1 + this.field1165;
		int var5 = var3 + var4 * class141.field3240;
		int var6 = 0;
		int var7 = this.field1171;
		int var8 = this.field1167;
		int var9 = class141.field3240 - var8;
		int var10 = 0;
		if (var4 < class141.field3236) {
			int var11 = class141.field3236 - var4;
			var7 -= var11;
			var4 = class141.field3236;
			var6 = var11 * var8;
			var5 += var11 * class141.field3240;
		}
		if (var4 + var7 > class141.field3239) {
			var7 -= var4 + var7 - class141.field3239;
		}
		if (var3 < class141.field3238) {
			int var12 = class141.field3238 - var3;
			var8 -= var12;
			var3 = class141.field3238;
			var6 += var12;
			var5 += var12;
			var10 = var12;
			var9 += var12;
		}
		if (var3 + var8 > class141.field3241) {
			int var13 = var3 + var8 - class141.field3241;
			var8 -= var13;
			var10 += var13;
			var9 += var13;
		}
		if (var8 > 0 && var7 > 0) {
			method400(class141.field3237, this.field1164, this.field1166, var6, var5, var8, var7, var9, var10);
		}
	}

	@ObfuscatedName("hb.b(III)V")
	public void method401(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1166.length; var4++) {
			int var5 = this.field1166[var4] >> 16 & 0xFF;
			int var6 = var5 + arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}
			int var7 = this.field1166[var4] >> 8 & 0xFF;
			int var8 = var7 + arg1;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}
			int var9 = this.field1166[var4] & 0xFF;
			int var10 = var9 + arg2;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 > 255) {
				var10 = 255;
			}
			this.field1166[var4] = (var6 << 16) + (var8 << 8) + var10;
		}
	}
}
