package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("xb")
public class Isaac {

	@ObfuscatedName("xb.a")
	public int count;

	@ObfuscatedName("xb.b")
	public int[] rsl = new int[256];

	@ObfuscatedName("xb.c")
	public int[] mem = new int[256];

	@ObfuscatedName("xb.d")
	public int a;

	@ObfuscatedName("xb.e")
	public int b;

	@ObfuscatedName("xb.f")
	public int c;

	public Isaac(int[] arg0) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			this.rsl[var3] = arg0[var3];
		}
		this.init();
	}

	@ObfuscatedName("xb.a()I")
	public final int nextInt() {
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}
		return this.rsl[this.count];
	}

	@ObfuscatedName("xb.b()V")
	public final void isaac() {
		this.b += ++this.c;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.mem[var1];
			switch(var1 & 0x3) {
				case 0:
					this.a ^= this.a << 13;
					break;
				case 1:
					this.a ^= this.a >>> 6;
					break;
				case 2:
					this.a ^= this.a << 2;
					break;
				case 3:
					this.a ^= this.a >>> 16;
			}
			this.a += this.mem[var1 + 128 & 0xFF];
			int var3;
			this.mem[var1] = var3 = this.mem[var2 >> 2 & 0xFF] + this.a + this.b;
			this.rsl[var1] = this.b = this.mem[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("xb.c()V")
	public final void init() {
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
			int var11 = var5 + var10;
			int var12 = var7 + var6;
			int var13 = var12 ^ var6 >>> 2;
			int var14 = var4 + var13;
			int var15 = var6 + var11;
			int var16 = var15 ^ var11 << 8;
			int var17 = var3 + var16;
			int var18 = var11 + var14;
			var5 = var18 ^ var14 >>> 16;
			int var19 = var2 + var5;
			int var20 = var14 + var17;
			var4 = var20 ^ var17 << 10;
			int var21 = var1 + var4;
			int var22 = var17 + var19;
			var3 = var22 ^ var19 >>> 4;
			int var23 = var10 + var3;
			int var24 = var19 + var21;
			var2 = var24 ^ var21 << 8;
			var7 = var13 + var2;
			int var25 = var21 + var23;
			var1 = var25 ^ var23 >>> 9;
			var6 = var16 + var1;
			var8 = var23 + var7;
		}
		for (int var26 = 0; var26 < 256; var26 += 8) {
			int var27 = var8 + this.rsl[var26];
			int var28 = var7 + this.rsl[var26 + 1];
			int var29 = var6 + this.rsl[var26 + 2];
			int var30 = var5 + this.rsl[var26 + 3];
			int var31 = var4 + this.rsl[var26 + 4];
			int var32 = var3 + this.rsl[var26 + 5];
			int var33 = var2 + this.rsl[var26 + 6];
			int var34 = var1 + this.rsl[var26 + 7];
			int var35 = var27 ^ var28 << 11;
			int var36 = var30 + var35;
			int var37 = var28 + var29;
			int var38 = var37 ^ var29 >>> 2;
			int var39 = var31 + var38;
			int var40 = var29 + var36;
			int var41 = var40 ^ var36 << 8;
			int var42 = var32 + var41;
			int var43 = var36 + var39;
			var5 = var43 ^ var39 >>> 16;
			int var44 = var33 + var5;
			int var45 = var39 + var42;
			var4 = var45 ^ var42 << 10;
			int var46 = var34 + var4;
			int var47 = var42 + var44;
			var3 = var47 ^ var44 >>> 4;
			int var48 = var35 + var3;
			int var49 = var44 + var46;
			var2 = var49 ^ var46 << 8;
			var7 = var38 + var2;
			int var50 = var46 + var48;
			var1 = var50 ^ var48 >>> 9;
			var6 = var41 + var1;
			var8 = var48 + var7;
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
			int var53 = var7 + this.mem[var51 + 1];
			int var54 = var6 + this.mem[var51 + 2];
			int var55 = var5 + this.mem[var51 + 3];
			int var56 = var4 + this.mem[var51 + 4];
			int var57 = var3 + this.mem[var51 + 5];
			int var58 = var2 + this.mem[var51 + 6];
			int var59 = var1 + this.mem[var51 + 7];
			int var60 = var52 ^ var53 << 11;
			int var61 = var55 + var60;
			int var62 = var53 + var54;
			int var63 = var62 ^ var54 >>> 2;
			int var64 = var56 + var63;
			int var65 = var54 + var61;
			int var66 = var65 ^ var61 << 8;
			int var67 = var57 + var66;
			int var68 = var61 + var64;
			var5 = var68 ^ var64 >>> 16;
			int var69 = var58 + var5;
			int var70 = var64 + var67;
			var4 = var70 ^ var67 << 10;
			int var71 = var59 + var4;
			int var72 = var67 + var69;
			var3 = var72 ^ var69 >>> 4;
			int var73 = var60 + var3;
			int var74 = var69 + var71;
			var2 = var74 ^ var71 << 8;
			var7 = var63 + var2;
			int var75 = var71 + var73;
			var1 = var75 ^ var73 >>> 9;
			var6 = var66 + var1;
			var8 = var73 + var7;
			this.mem[var51] = var8;
			this.mem[var51 + 1] = var7;
			this.mem[var51 + 2] = var6;
			this.mem[var51 + 3] = var5;
			this.mem[var51 + 4] = var4;
			this.mem[var51 + 5] = var3;
			this.mem[var51 + 6] = var2;
			this.mem[var51 + 7] = var1;
		}
		this.isaac();
		this.count = 256;
	}
}
