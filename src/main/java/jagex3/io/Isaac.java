package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("nd")
public final class Isaac {

	@ObfuscatedName("nd.a")
	public int[] field2727;

	@ObfuscatedName("nd.b")
	public int field2728;

	@ObfuscatedName("nd.k")
	public int field2737;

	@ObfuscatedName("nd.q")
	public int[] field2743;

	@ObfuscatedName("nd.r")
	public int field2744;

	@ObfuscatedName("nd.w")
	public int field2749;

	public Isaac() {
	}

	public Isaac(int[] arg0) {
		this.field2727 = new int[256];
		this.field2743 = new int[256];
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.field2743[var2] = arg0[var2];
		}
		this.method979();
	}

	@ObfuscatedName("nd.b(I)I")
	public int method978() {
		if (this.field2749-- == 0) {
			this.method980();
			this.field2749 = 255;
		}
		return this.field2743[this.field2749];
	}

	@ObfuscatedName("nd.b(Z)V")
	public void method979() {
		int var1 = -1640531527;
		int var2 = -1640531527;
		int var3 = -1640531527;
		int var4 = -1640531527;
		int var5 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;
		int var8 = -1640531527;
		for (int var9 = 0; var9 < 4; var9++) {
			int var10 = var8 ^ var7 << 11;
			int var11 = var7 + var6;
			int var12 = var11 ^ var6 >>> 2;
			int var13 = var4 + var12;
			int var14 = var5 + var10;
			int var15 = var6 + var14;
			int var16 = var15 ^ var14 << 8;
			int var17 = var3 + var16;
			int var18 = var14 + var13;
			var5 = var18 ^ var13 >>> 16;
			int var19 = var13 + var17;
			int var20 = var2 + var5;
			var4 = var19 ^ var17 << 10;
			int var21 = var17 + var20;
			int var22 = var1 + var4;
			var3 = var21 ^ var20 >>> 4;
			int var23 = var10 + var3;
			int var24 = var20 + var22;
			var2 = var24 ^ var22 << 8;
			var7 = var12 + var2;
			int var25 = var22 + var23;
			var1 = var25 ^ var23 >>> 9;
			var8 = var23 + var7;
			var6 = var16 + var1;
		}
		for (int var26 = 0; var26 < 256; var26 += 8) {
			int var27 = var2 + this.field2743[var26 + 6];
			int var28 = var5 + this.field2743[var26 + 3];
			int var29 = var8 + this.field2743[var26];
			int var30 = var4 + this.field2743[var26 + 4];
			int var31 = var1 + this.field2743[var26 + 7];
			int var32 = var7 + this.field2743[var26 + 1];
			int var33 = var6 + this.field2743[var26 + 2];
			int var34 = var3 + this.field2743[var26 + 5];
			int var35 = var29 ^ var32 << 11;
			int var36 = var28 + var35;
			int var37 = var32 + var33;
			int var38 = var37 ^ var33 >>> 2;
			int var39 = var30 + var38;
			int var40 = var33 + var36;
			int var41 = var40 ^ var36 << 8;
			int var42 = var36 + var39;
			int var43 = var34 + var41;
			var5 = var42 ^ var39 >>> 16;
			int var44 = var27 + var5;
			int var45 = var39 + var43;
			var4 = var45 ^ var43 << 10;
			int var46 = var31 + var4;
			int var47 = var43 + var44;
			var3 = var47 ^ var44 >>> 4;
			int var48 = var44 + var46;
			var2 = var48 ^ var46 << 8;
			var7 = var38 + var2;
			int var49 = var35 + var3;
			int var50 = var46 + var49;
			var1 = var50 ^ var49 >>> 9;
			var6 = var41 + var1;
			var8 = var49 + var7;
			this.field2727[var26] = var8;
			this.field2727[var26 + 1] = var7;
			this.field2727[var26 + 2] = var6;
			this.field2727[var26 + 3] = var5;
			this.field2727[var26 + 4] = var4;
			this.field2727[var26 + 5] = var3;
			this.field2727[var26 + 6] = var2;
			this.field2727[var26 + 7] = var1;
		}
		for (int var51 = 0; var51 < 256; var51 += 8) {
			int var52 = var7 + this.field2727[var51 + 1];
			int var53 = var4 + this.field2727[var51 + 4];
			int var54 = var5 + this.field2727[var51 + 3];
			int var55 = var6 + this.field2727[var51 + 2];
			int var56 = var3 + this.field2727[var51 + 5];
			int var57 = var2 + this.field2727[var51 + 6];
			int var58 = var8 + this.field2727[var51];
			int var59 = var1 + this.field2727[var51 + 7];
			int var60 = var58 ^ var52 << 11;
			int var61 = var52 + var55;
			int var62 = var54 + var60;
			int var63 = var61 ^ var55 >>> 2;
			int var64 = var55 + var62;
			int var65 = var64 ^ var62 << 8;
			int var66 = var56 + var65;
			int var67 = var53 + var63;
			int var68 = var62 + var67;
			var5 = var68 ^ var67 >>> 16;
			int var69 = var57 + var5;
			int var70 = var67 + var66;
			var4 = var70 ^ var66 << 10;
			int var71 = var66 + var69;
			var3 = var71 ^ var69 >>> 4;
			int var72 = var59 + var4;
			int var73 = var60 + var3;
			int var74 = var69 + var72;
			var2 = var74 ^ var72 << 8;
			int var75 = var72 + var73;
			var1 = var75 ^ var73 >>> 9;
			var7 = var63 + var2;
			var8 = var73 + var7;
			this.field2727[var51] = var8;
			var6 = var65 + var1;
			this.field2727[var51 + 1] = var7;
			this.field2727[var51 + 2] = var6;
			this.field2727[var51 + 3] = var5;
			this.field2727[var51 + 4] = var4;
			this.field2727[var51 + 5] = var3;
			this.field2727[var51 + 6] = var2;
			this.field2727[var51 + 7] = var1;
		}
		this.method980();
		this.field2749 = 256;
	}

	@ObfuscatedName("nd.c(I)V")
	public void method980() {
		this.field2744 += ++this.field2737;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.field2727[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					this.field2728 ^= this.field2728 << 13;
				} else {
					this.field2728 ^= this.field2728 >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				this.field2728 ^= this.field2728 << 2;
			} else {
				this.field2728 ^= this.field2728 >>> 16;
			}
			this.field2728 += this.field2727[var1 + 128 & 0xFF];
			int var3;
			this.field2727[var1] = var3 = this.field2728 + this.field2727[var2 >> 2 & 0xFF] + this.field2744;
			this.field2743[var1] = this.field2744 = var2 + this.field2727[var3 >> 8 >> 2 & 0xFF];
		}
	}
}
