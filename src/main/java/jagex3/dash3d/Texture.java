package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.graphics.Pix8;
import jagex3.graphics.PixLoader;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vb")
public final class Texture extends Linkable {

	@ObfuscatedName("vb.r")
	public final int field3355;

	@ObfuscatedName("vb.s")
	public final int field3356;

	@ObfuscatedName("vb.t")
	public final int[] field3357;

	@ObfuscatedName("vb.u")
	public static int[] field3358;

	@ObfuscatedName("vb.v")
	public final boolean field3359;

	@ObfuscatedName("vb.w")
	public final int field3360;

	@ObfuscatedName("vb.C")
	public boolean field3365 = false;

	@ObfuscatedName("vb.z")
	public final int[] field3363;

	@ObfuscatedName("vb.A")
	public int[] field3364;

	@ObfuscatedName("vb.y")
	public int[] field3362;

	@ObfuscatedName("vb.x")
	public int[] field3361;

	public Texture(Packet arg0) {
		this.field3360 = arg0.g2();
		this.field3359 = arg0.g1() == 1;
		int var2 = arg0.g1();
		if (var2 < 1 || var2 > 4) {
			throw new RuntimeException();
		}
		this.field3363 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field3363[var3] = arg0.g2();
		}
		if (var2 > 1) {
			this.field3364 = new int[var2 - 1];
			for (int var4 = 0; var4 < var2 - 1; var4++) {
				this.field3364[var4] = arg0.g1();
			}
		}
		if (var2 > 1) {
			this.field3362 = new int[var2 - 1];
			for (int var5 = 0; var5 < var2 - 1; var5++) {
				this.field3362[var5] = arg0.g1();
			}
		}
		this.field3357 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field3357[var6] = arg0.g4();
		}
		this.field3356 = arg0.g1();
		this.field3355 = arg0.g1();
		this.field3361 = null;
	}

	@ObfuscatedName("vb.d(I)V")
	public void method1102(int arg0) {
		if (this.field3361 == null) {
			return;
		}
		if (this.field3356 == 1 || this.field3356 == 3) {
			if (field3358 == null || field3358.length < this.field3361.length) {
				field3358 = new int[this.field3361.length];
			}
			short var2;
			if (this.field3361.length == 4096) {
				var2 = 64;
			} else {
				var2 = 128;
			}
			int var3 = this.field3361.length;
			int var4 = var2 * arg0 * this.field3355;
			int var5 = var3 - 1;
			if (this.field3356 == 1) {
				var4 = -var4;
			}
			for (int var6 = 0; var6 < var3; var6++) {
				int var7 = var6 + var4 & var5;
				field3358[var6] = this.field3361[var7];
			}
			int[] var8 = this.field3361;
			this.field3361 = field3358;
			field3358 = var8;
		}
		if (this.field3356 != 2 && this.field3356 != 4) {
			return;
		}
		if (field3358 == null || field3358.length < this.field3361.length) {
			field3358 = new int[this.field3361.length];
		}
		short var9;
		if (this.field3361.length == 4096) {
			var9 = 64;
		} else {
			var9 = 128;
		}
		int var10 = this.field3361.length;
		int var11 = arg0 * this.field3355;
		int var12 = var9 - 1;
		if (this.field3356 == 2) {
			var11 = -var11;
		}
		for (int var13 = 0; var13 < var10; var13 += var9) {
			for (int var14 = 0; var14 < var9; var14++) {
				int var15 = var13 + var14;
				int var16 = var13 + (var14 + var11 & var12);
				field3358[var15] = this.field3361[var16];
			}
		}
		int[] var17 = this.field3361;
		this.field3361 = field3358;
		field3358 = var17;
	}

	@ObfuscatedName("vb.a()V")
	public void method1103() {
		this.field3361 = null;
	}

	@ObfuscatedName("vb.a(DILea;)Z")
	public boolean method1105(double arg0, int arg1, Js5 arg2) {
		for (int var5 = 0; var5 < this.field3363.length; var5++) {
			if (arg2.method216(this.field3363[var5]) == null) {
				return false;
			}
		}
		int var6 = arg1 * arg1;
		this.field3361 = new int[var6];
		for (int var7 = 0; var7 < this.field3363.length; var7++) {
			Pix8 var8 = PixLoader.method408(arg2, this.field3363[var7]);
			var8.method398();
			byte[] var9 = var8.field1164;
			int[] var10 = var8.field1166;
			int var11 = this.field3357[var7];
			if ((var11 & 0xFF000000) == 50331648) {
				int var12 = var11 & 0xFF00FF;
				int var13 = var11 >> 8 & 0xFF;
				for (int var14 = 0; var14 < var10.length; var14++) {
					int var15 = var10[var14];
					if ((var15 & 0xFFFF) == var15 >> 8) {
						int var16 = var15 & 0xFF;
						var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
					}
				}
			}
			for (int var17 = 0; var17 < var10.length; var17++) {
				var10[var17] = Pix3D.method37(var10[var17], arg0);
			}
			int var18;
			if (var7 == 0) {
				var18 = 0;
			} else {
				var18 = this.field3364[var7 - 1];
			}
			if (var18 == 0) {
				if (var8.field1167 == arg1) {
					for (int var19 = 0; var19 < var6; var19++) {
						this.field3361[var19] = var10[var9[var19] & 0xFF];
					}
				} else if (var8.field1167 == 64 && arg1 == 128) {
					int var20 = 0;
					for (int var21 = 0; var21 < arg1; var21++) {
						for (int var22 = 0; var22 < arg1; var22++) {
							this.field3361[var20++] = var10[var9[(var22 >> 1) + (var21 >> 1 << 6)] & 0xFF];
						}
					}
				} else if (var8.field1167 == 128 && arg1 == 64) {
					int var23 = 0;
					for (int var24 = 0; var24 < arg1; var24++) {
						for (int var25 = 0; var25 < arg1; var25++) {
							this.field3361[var23++] = var10[var9[(var25 << 1) + (var24 << 1 << 7)] & 0xFF];
						}
					}
				} else {
					throw new RuntimeException();
				}
			}
		}
		return true;
	}
}
