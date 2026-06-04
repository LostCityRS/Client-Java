package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("sc")
public final class GlTexture extends Linkable2 {

	@ObfuscatedName("ug.a")
	public static int[] field4218;
	@ObfuscatedName("sc.R")
	public boolean field3800 = false;

	@ObfuscatedName("sc.I")
	public final Texture field3791;

	@ObfuscatedName("sc.L")
	public final boolean field3794;

	@ObfuscatedName("sc.S")
	public final boolean field3801;

	@ObfuscatedName("sc.H")
	public final int field3790;

	@ObfuscatedName("sc.Y")
	public final int field3807;

	@ObfuscatedName("sc.P")
	public float field3798;

	@ObfuscatedName("sc.Z")
	public int[] field3808;

	public GlTexture(Packet arg0) {
		this.field3791 = new Texture(arg0);
		this.field3794 = arg0.g1() == 1;
		this.field3801 = arg0.g1() == 1;
		arg0.g1();
		arg0.g1();
		int var2 = arg0.g1() & 0x3;
		this.field3790 = arg0.g1b();
		this.field3807 = arg0.g1b();
		arg0.g1();
		arg0.g1();
	}

	@ObfuscatedName("sc.a(Lnb;ZZLfe;)[I")
	public int[] method1366(Js5 arg0, boolean arg1, TextureProvider arg2) {
		if (this.field3791.checkLoaded(arg2, arg0)) {
			int var4 = arg1 ? 64 : 128;
			return this.field3791.render(1.0D, var4, this.field3801, arg0, arg2, var4, false);
		} else {
			return null;
		}
	}

	@ObfuscatedName("sc.b(IZ)V")
	public void method1367(int arg0) {
		if (this.field3808 == null || this.field3807 == 0 && this.field3790 == 0) {
			return;
		}
		if (field4218 == null || field4218.length < this.field3808.length) {
			field4218 = new int[this.field3808.length];
		}
		int var2 = this.field3808.length;
		int var3 = this.field3790 * arg0;
		int var4 = var2 - 1;
		int var5 = this.field3808.length == 4096 ? 64 : 128;
		int var6 = var5 * arg0 * this.field3807;
		int var7 = var5 - 1;
		for (int var8 = 0; var8 < var2; var8 += var5) {
			int var9 = var8 + var6 & var4;
			for (int var10 = 0; var10 < var5; var10++) {
				int var11 = var8 + var10;
				int var12 = var9 + (var7 & var3 + var10);
				field4218[var11] = this.field3808[var12];
			}
		}
		int[] var13 = this.field3808;
		this.field3808 = field4218;
		field4218 = var13;
	}

	@ObfuscatedName("sc.a(Lfe;ILnb;)Z")
	public boolean method1368(TextureProvider arg0, Js5 arg1) {
		return this.field3791.checkLoaded(arg0, arg1);
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@ObfuscatedName("sc.a(Lfe;FLnb;ZZ)[I")
	public int[] method1369(TextureProvider arg0, float arg1, Js5 arg2, boolean arg3) {
		if (this.field3808 == null || arg1 != this.field3798) {
			if (!this.field3791.checkLoaded(arg0, arg2)) {
				return null;
			}
			int var5 = arg3 ? 64 : 128;
			this.field3808 = this.field3791.render((double) arg1, var5, this.field3801, arg2, arg0, var5, true);
			this.field3798 = arg1;
			if (this.field3794) {
				int[] var6 = new int[var5];
				int[] var7 = new int[var5 * var5];
				int[] var8 = new int[var5];
				int[] var9 = new int[var5];
				int var10 = var5;
				int var11 = var5;
				int var12 = var5 - 1;
				int var13 = var5 - 1;
				int var14 = var5 * var5;
				for (int var15 = 2; var15 >= 0; var15--) {
					for (int var16 = var13; var16 >= 0; var16--) {
						var10--;
						int var17 = this.field3808[var10];
						var6[var16] += var17 >> 16 & 0xFF;
						var9[var16] += var17 >> 8 & 0xFF;
						var8[var16] += var17 & 0xFF;
					}
					if (var10 == 0) {
						var10 = var14;
					}
				}
				int var18 = var14;
				for (int var19 = var12; var19 >= 0; var19--) {
					int var20 = 1;
					int var21 = 0;
					int var22 = 0;
					int var23 = 0;
					int var24 = 1;
					for (int var25 = 2; var25 >= 0; var25--) {
						var24--;
						var23 += var6[var24];
						var22 += var8[var24];
						var21 += var9[var24];
						if (var24 == 0) {
							var24 = var5;
						}
					}
					for (int var26 = var13; var26 >= 0; var26--) {
						var20--;
						var24--;
						int var27 = var23 / 9;
						int var28 = var22 / 9;
						int var29 = var21 / 9;
						var18--;
						var7[var18] = var28 | var29 << 8 | var27 << 16;
						var21 += var9[var24] - var9[var20];
						var23 += var6[var24] - var6[var20];
						var22 += var8[var24] - var8[var20];
						if (var24 == 0) {
							var24 = var5;
						}
						if (var20 == 0) {
							var20 = var5;
						}
					}
					for (int var30 = var13; var30 >= 0; var30--) {
						var11--;
						int var31 = this.field3808[var11];
						var10--;
						int var32 = this.field3808[var10];
						var6[var30] += (var32 >> 16 & 0xFF) - ((var31 & 0xFF6387) >> 16);
						var9[var30] += (var32 >> 8 & 0xFF) - (var31 >> 8 & 0xFF);
						var8[var30] += (var32 & 0xFF) - (var31 & 0xFF);
					}
					if (var11 == 0) {
						var11 = var14;
					}
					if (var10 == 0) {
						var10 = var14;
					}
				}
				this.field3808 = var7;
			}
		}
		return this.field3808;
	}
}
