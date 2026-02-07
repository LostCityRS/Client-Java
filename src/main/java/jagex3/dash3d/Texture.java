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
	public final int animationSpeed;

	@ObfuscatedName("vb.s")
	public final int animationDirection;

	@ObfuscatedName("vb.t")
	public final int[] op3;

	@ObfuscatedName("vb.u")
	public static int[] swapBuffer;

	@ObfuscatedName("vb.v")
	public final boolean opaque;

	@ObfuscatedName("vb.w")
	public final int averageRgb;

	@ObfuscatedName("vb.C")
	public boolean field3365 = false;

	@ObfuscatedName("vb.z")
	public final int[] fileIds;

	@ObfuscatedName("vb.A")
	public int[] op1;

	@ObfuscatedName("vb.y")
	public int[] op2;

	@ObfuscatedName("vb.x")
	public int[] texels;

	public Texture(Packet arg0) {
		this.averageRgb = arg0.g2();
		this.opaque = arg0.g1() == 1;
		int var2 = arg0.g1();
		if (var2 < 1 || var2 > 4) {
			throw new RuntimeException();
		}
		this.fileIds = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.fileIds[var3] = arg0.g2();
		}
		if (var2 > 1) {
			this.op1 = new int[var2 - 1];
			for (int var4 = 0; var4 < var2 - 1; var4++) {
				this.op1[var4] = arg0.g1();
			}
		}
		if (var2 > 1) {
			this.op2 = new int[var2 - 1];
			for (int var5 = 0; var5 < var2 - 1; var5++) {
				this.op2[var5] = arg0.g1();
			}
		}
		this.op3 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.op3[var6] = arg0.g4();
		}
		this.animationDirection = arg0.g1();
		this.animationSpeed = arg0.g1();
		this.texels = null;
	}

	@ObfuscatedName("vb.d(I)V")
	public void animate(int arg0) {
		if (this.texels == null) {
			return;
		}
		if (this.animationDirection == 1 || this.animationDirection == 3) {
			if (swapBuffer == null || swapBuffer.length < this.texels.length) {
				swapBuffer = new int[this.texels.length];
			}
			short var2;
			if (this.texels.length == 4096) {
				var2 = 64;
			} else {
				var2 = 128;
			}
			int var3 = this.texels.length;
			int var4 = var2 * arg0 * this.animationSpeed;
			int var5 = var3 - 1;
			if (this.animationDirection == 1) {
				var4 = -var4;
			}
			for (int var6 = 0; var6 < var3; var6++) {
				int var7 = var6 + var4 & var5;
				swapBuffer[var6] = this.texels[var7];
			}
			int[] var8 = this.texels;
			this.texels = swapBuffer;
			swapBuffer = var8;
		}
		if (this.animationDirection != 2 && this.animationDirection != 4) {
			return;
		}
		if (swapBuffer == null || swapBuffer.length < this.texels.length) {
			swapBuffer = new int[this.texels.length];
		}
		short var9;
		if (this.texels.length == 4096) {
			var9 = 64;
		} else {
			var9 = 128;
		}
		int var10 = this.texels.length;
		int var11 = arg0 * this.animationSpeed;
		int var12 = var9 - 1;
		if (this.animationDirection == 2) {
			var11 = -var11;
		}
		for (int var13 = 0; var13 < var10; var13 += var9) {
			for (int var14 = 0; var14 < var9; var14++) {
				int var15 = var13 + var14;
				int var16 = var13 + (var14 + var11 & var12);
				swapBuffer[var15] = this.texels[var16];
			}
		}
		int[] var17 = this.texels;
		this.texels = swapBuffer;
		swapBuffer = var17;
	}

	@ObfuscatedName("vb.a()V")
	public void unload() {
		this.texels = null;
	}

	@ObfuscatedName("vb.a(DILea;)Z")
	public boolean loadTexture(double arg0, int arg1, Js5 arg2) {
		for (int var5 = 0; var5 < this.fileIds.length; var5++) {
			if (arg2.peekFile(this.fileIds[var5]) == null) {
				return false;
			}
		}
		int var6 = arg1 * arg1;
		this.texels = new int[var6];
		for (int var7 = 0; var7 < this.fileIds.length; var7++) {
			Pix8 var8 = PixLoader.makePix8(arg2, this.fileIds[var7]);
			var8.trim();
			byte[] var9 = var8.bspr;
			int[] var10 = var8.bpal;
			int var11 = this.op3[var7];
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
				var10[var17] = Pix3D.gammaCorrect(var10[var17], arg0);
			}
			int var18;
			if (var7 == 0) {
				var18 = 0;
			} else {
				var18 = this.op1[var7 - 1];
			}
			if (var18 == 0) {
				if (var8.wi == arg1) {
					for (int var19 = 0; var19 < var6; var19++) {
						this.texels[var19] = var10[var9[var19] & 0xFF];
					}
				} else if (var8.wi == 64 && arg1 == 128) {
					int var20 = 0;
					for (int var21 = 0; var21 < arg1; var21++) {
						for (int var22 = 0; var22 < arg1; var22++) {
							this.texels[var20++] = var10[var9[(var22 >> 1) + (var21 >> 1 << 6)] & 0xFF];
						}
					}
				} else if (var8.wi == 128 && arg1 == 64) {
					int var23 = 0;
					for (int var24 = 0; var24 < arg1; var24++) {
						for (int var25 = 0; var25 < arg1; var25++) {
							this.texels[var23++] = var10[var9[(var25 << 1) + (var24 << 1 << 7)] & 0xFF];
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
