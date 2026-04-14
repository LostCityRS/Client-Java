package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable;
import jagex3.graphics.Pix8;
import jagex3.graphics.PixLoader;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("p")
public final class Texture extends Linkable {

	@ObfuscatedName("p.cb")
	public final int field2191;

	@ObfuscatedName("p.db")
	public final int field2192;

	@ObfuscatedName("p.eb")
	public int[] field2193;

	@ObfuscatedName("p.fb")
	public int[] field2194;

	@ObfuscatedName("p.gb")
	public int[] field2195;

	@ObfuscatedName("p.ib")
	public final int field2197;

	@ObfuscatedName("p.jb")
	public final boolean field2198;

	@ObfuscatedName("p.kb")
	public final int[] field2199;

	@ObfuscatedName("p.lb")
	public final int[] field2200;

	@ObfuscatedName("p.mb")
	public boolean field2201 = false;

	@ObfuscatedName("p.b(I)V")
	public void method762(int arg0) {
		if (this.field2194 == null) {
			return;
		}
		if (this.field2191 == 1 || this.field2191 == 3) {
			if (Statics.field2196 == null || Statics.field2196.length < this.field2194.length) {
				Statics.field2196 = new int[this.field2194.length];
			}
			short var2;
			if (this.field2194.length == 16384) {
				var2 = 64;
			} else {
				var2 = 128;
			}
			int var3 = this.field2194.length / 4;
			int var4 = arg0 * var2 * this.field2197;
			int var5 = var3 - 1;
			if (this.field2191 == 1) {
				var4 = -var4;
			}
			for (int var6 = 0; var6 < var3; var6++) {
				int var7 = var4 + var6 & var5;
				Statics.field2196[var6] = this.field2194[var7];
				Statics.field2196[var3 + var6] = this.field2194[var3 + var7];
				Statics.field2196[var3 + var6 + var3] = this.field2194[var3 + var7 + var3];
				Statics.field2196[var3 + var6 + var3 + var3] = this.field2194[var3 + var7 + var3 + var3];
			}
			int[] var8 = this.field2194;
			this.field2194 = Statics.field2196;
			Statics.field2196 = var8;
		}
		if (this.field2191 != 2 && this.field2191 != 4) {
			return;
		}
		if (Statics.field2196 == null || Statics.field2196.length < this.field2194.length) {
			Statics.field2196 = new int[this.field2194.length];
		}
		short var9;
		if (this.field2194.length == 16384) {
			var9 = 64;
		} else {
			var9 = 128;
		}
		int var10 = this.field2194.length / 4;
		int var11 = this.field2197 * arg0;
		int var12 = var9 - 1;
		if (this.field2191 == 2) {
			var11 = -var11;
		}
		for (int var13 = 0; var13 < var10; var13 += var9) {
			for (int var14 = 0; var14 < var9; var14++) {
				int var15 = var13 + var14;
				int var16 = (var11 + var14 & var12) + var13;
				Statics.field2196[var15] = this.field2194[var16];
				Statics.field2196[var10 + var15] = this.field2194[var10 + var16];
				Statics.field2196[var10 + var15 + var10] = this.field2194[var10 + var16 + var10];
				Statics.field2196[var10 + var15 + var10 + var10] = this.field2194[var10 + var16 + var10 + var10];
			}
		}
		int[] var17 = this.field2194;
		this.field2194 = Statics.field2196;
		Statics.field2196 = var17;
	}

	@ObfuscatedName("p.a(DILbd;)Z")
	public boolean method763(double arg0, int arg1, Js5 arg2) {
		for (int var5 = 0; var5 < this.field2199.length; var5++) {
			if (arg2.method238(this.field2199[var5]) == null) {
				return false;
			}
		}
		int var6 = arg1 * arg1;
		this.field2194 = new int[var6 * 4];
		for (int var7 = 0; var7 < this.field2199.length; var7++) {
			Pix8 var8 = PixLoader.method533(arg2, this.field2199[var7]);
			var8.method331();
			byte[] var9 = var8.data;
			int[] var10 = var8.bpal;
			int var11 = this.field2200[var7];
			if ((var11 & 0xFF000000) == 50331648) {
				int var12 = var11 & 0xFF00FF;
				int var13 = var11 >> 8 & 0xFF;
				for (int var14 = 0; var14 < var10.length; var14++) {
					int var15 = var10[var14];
					if (var15 >> 8 == (var15 & 0xFFFF)) {
						int var16 = var15 & 0xFF;
						var10[var14] = var12 * var16 >> 8 & 0xFF00FF | var13 * var16 & 0xFF00;
					}
				}
			}
			for (int var17 = 0; var17 < var10.length; var17++) {
				var10[var17] = Pix3D.method361(var10[var17], arg0);
			}
			int var18;
			if (var7 == 0) {
				var18 = 0;
			} else {
				var18 = this.field2195[var7 - 1];
			}
			if (var18 == 0) {
				if (var8.wi == arg1) {
					for (int var19 = 0; var19 < var6; var19++) {
						this.field2194[var19] = var10[var9[var19] & 0xFF];
					}
				} else if (var8.wi == 64 && arg1 == 128) {
					int var20 = 0;
					for (int var21 = 0; var21 < arg1; var21++) {
						for (int var22 = 0; var22 < arg1; var22++) {
							this.field2194[var20++] = var10[var9[(var21 >> 1 << 6) + (var22 >> 1)] & 0xFF];
						}
					}
				} else if (var8.wi == 128 && arg1 == 64) {
					int var23 = 0;
					for (int var24 = 0; var24 < arg1; var24++) {
						for (int var25 = 0; var25 < arg1; var25++) {
							this.field2194[var23++] = var10[var9[(var24 << 1 << 7) + (var25 << 1)] & 0xFF];
						}
					}
				} else {
					throw new RuntimeException();
				}
			}
		}
		for (int var26 = 0; var26 < var6; var26++) {
			this.field2194[var26] &= 0xF8F8FF;
			int var27 = this.field2194[var26];
			this.field2194[var6 + var26] = var27 - (var27 >>> 3) & 0xF8F8FF;
			this.field2194[var6 + var26 + var6] = var27 - (var27 >>> 2) & 0xF8F8FF;
			this.field2194[var6 + var26 + var6 + var6] = var27 - (var27 >>> 2) - (var27 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@ObfuscatedName("p.a()V")
	public void method764() {
		this.field2194 = null;
	}

	public Texture(Packet arg0) {
		this.field2192 = arg0.g2();
		this.field2198 = arg0.g1() == 1;
		int var2 = arg0.g1();
		if (var2 < 1 || var2 > 4) {
			throw new RuntimeException();
		}
		this.field2199 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			this.field2199[var3] = arg0.g2();
		}
		if (var2 > 1) {
			this.field2195 = new int[var2 - 1];
			for (int var4 = 0; var4 < var2 - 1; var4++) {
				this.field2195[var4] = arg0.g1();
			}
		}
		if (var2 > 1) {
			this.field2193 = new int[var2 - 1];
			for (int var5 = 0; var5 < var2 - 1; var5++) {
				this.field2193[var5] = arg0.g1();
			}
		}
		this.field2200 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field2200[var6] = arg0.method167();
		}
		this.field2191 = arg0.g1();
		this.field2197 = arg0.g1();
		this.field2194 = null;
	}
}
