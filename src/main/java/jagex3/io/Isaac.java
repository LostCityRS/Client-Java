package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("va")
public final class Isaac {

	@ObfuscatedName("va.a")
	public final int[] mem = new int[256];

	@ObfuscatedName("va.e")
	public int a;

	@ObfuscatedName("va.r")
	public final int[] rsl = new int[256];

	@ObfuscatedName("va.s")
	public int c;

	@ObfuscatedName("va.u")
	public int b;

	@ObfuscatedName("va.w")
	public int count;

	public Isaac(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.rsl[var2] = arg0[var2];
		}
		this.init();
	}

	@ObfuscatedName("va.a(I)V")
	public void generate() {
		this.b += ++this.c;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.mem[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					this.a ^= this.a << 13;
				} else {
					this.a ^= this.a >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				this.a ^= this.a << 2;
			} else {
				this.a ^= this.a >>> 16;
			}
			this.a += this.mem[var1 + 128 & 0xFF];
			int var3;
			this.mem[var1] = var3 = this.b + this.a + this.mem[var2 >> 2 & 0xFF];
			this.rsl[var1] = this.b = this.mem[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("va.a(Z)V")
	public void init() {
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
			int var12 = var5 + var10;
			int var13 = var11 ^ var6 >>> 2;
			int var14 = var6 + var12;
			int var15 = var14 ^ var12 << 8;
			int var16 = var4 + var13;
			int var17 = var3 + var15;
			int var18 = var12 + var16;
			var5 = var18 ^ var16 >>> 16;
			int var19 = var16 + var17;
			var4 = var19 ^ var17 << 10;
			int var20 = var1 + var4;
			int var21 = var2 + var5;
			int var22 = var17 + var21;
			var3 = var22 ^ var21 >>> 4;
			int var23 = var10 + var3;
			int var24 = var21 + var20;
			var2 = var24 ^ var20 << 8;
			var7 = var13 + var2;
			int var25 = var20 + var23;
			var1 = var25 ^ var23 >>> 9;
			var8 = var23 + var7;
			var6 = var15 + var1;
		}
		for (int var26 = 0; var26 < 256; var26 += 8) {
			int var27 = var7 + this.rsl[var26 + 1];
			int var28 = var2 + this.rsl[var26 + 6];
			int var29 = var3 + this.rsl[var26 + 5];
			int var30 = var5 + this.rsl[var26 + 3];
			int var31 = var4 + this.rsl[var26 + 4];
			int var32 = var8 + this.rsl[var26];
			int var33 = var1 + this.rsl[var26 + 7];
			int var34 = var6 + this.rsl[var26 + 2];
			int var35 = var32 ^ var27 << 11;
			int var36 = var30 + var35;
			int var37 = var27 + var34;
			int var38 = var37 ^ var34 >>> 2;
			int var39 = var31 + var38;
			int var40 = var34 + var36;
			int var41 = var40 ^ var36 << 8;
			int var42 = var36 + var39;
			var5 = var42 ^ var39 >>> 16;
			int var43 = var29 + var41;
			int var44 = var39 + var43;
			int var45 = var28 + var5;
			var4 = var44 ^ var43 << 10;
			int var46 = var43 + var45;
			int var47 = var33 + var4;
			var3 = var46 ^ var45 >>> 4;
			int var48 = var45 + var47;
			var2 = var48 ^ var47 << 8;
			int var49 = var35 + var3;
			int var50 = var47 + var49;
			var1 = var50 ^ var49 >>> 9;
			var7 = var38 + var2;
			var6 = var41 + var1;
			var8 = var49 + var7;
			this.mem[var26] = var8;
			this.mem[var26 + 1] = var7;
			this.mem[var26 + 2] = var6;
			this.mem[var26 + 3] = var5;
			this.mem[var26 + 4] = var4;
			this.mem[var26 + 5] = var3;
			this.mem[var26 + 6] = var2;
			this.mem[var26 + 7] = var1;
		}
		for (int var51 = 0; var51 < 256; var51 += 8) {
			int var52 = var8 + this.mem[var51];
			int var53 = var3 + this.mem[var51 + 5];
			int var54 = var4 + this.mem[var51 + 4];
			int var55 = var7 + this.mem[var51 + 1];
			int var56 = var1 + this.mem[var51 + 7];
			int var57 = var6 + this.mem[var51 + 2];
			int var58 = var5 + this.mem[var51 + 3];
			int var59 = var2 + this.mem[var51 + 6];
			int var60 = var52 ^ var55 << 11;
			int var61 = var58 + var60;
			int var62 = var55 + var57;
			int var63 = var62 ^ var57 >>> 2;
			int var64 = var57 + var61;
			int var65 = var64 ^ var61 << 8;
			int var66 = var54 + var63;
			int var67 = var61 + var66;
			var5 = var67 ^ var66 >>> 16;
			int var68 = var53 + var65;
			int var69 = var59 + var5;
			int var70 = var66 + var68;
			var4 = var70 ^ var68 << 10;
			int var71 = var56 + var4;
			int var72 = var68 + var69;
			var3 = var72 ^ var69 >>> 4;
			int var73 = var60 + var3;
			int var74 = var69 + var71;
			var2 = var74 ^ var71 << 8;
			var7 = var63 + var2;
			int var75 = var71 + var73;
			var1 = var75 ^ var73 >>> 9;
			var8 = var73 + var7;
			this.mem[var51] = var8;
			var6 = var65 + var1;
			this.mem[var51 + 1] = var7;
			this.mem[var51 + 2] = var6;
			this.mem[var51 + 3] = var5;
			this.mem[var51 + 4] = var4;
			this.mem[var51 + 5] = var3;
			this.mem[var51 + 6] = var2;
			this.mem[var51 + 7] = var1;
		}
		this.generate();
		this.count = 256;
	}

	@ObfuscatedName("va.c(I)I")
	public int takeNextValue() {
		if (this.count-- == 0) {
			this.generate();
			this.count = 255;
		}
		return this.rsl[this.count];
	}
}
