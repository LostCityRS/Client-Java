package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("gb")
public final class Isaac {

	@ObfuscatedName("gb.a")
	public int field1047;

	@ObfuscatedName("gb.b")
	public int field1048;

	@ObfuscatedName("gb.f")
	public int field1052;

	@ObfuscatedName("gb.l")
	public final int[] field1058 = new int[256];

	@ObfuscatedName("gb.o")
	public final int[] field1061 = new int[256];

	@ObfuscatedName("gb.q")
	public int field1063;

	@ObfuscatedName("gb.a(B)V")
	public void method428() {
		this.field1063 += ++this.field1052;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.field1061[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					this.field1048 ^= this.field1048 << 13;
				} else {
					this.field1048 ^= this.field1048 >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				this.field1048 ^= this.field1048 << 2;
			} else {
				this.field1048 ^= this.field1048 >>> 16;
			}
			this.field1048 += this.field1061[var1 + 128 & 0xFF];
			int var3;
			this.field1061[var1] = var3 = this.field1063 + this.field1048 + this.field1061[var2 >> 2 & 0xFF];
			this.field1058[var1] = this.field1063 = this.field1061[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("gb.a(I)I")
	public int method430() {
		if (this.field1047-- == 0) {
			this.method428();
			this.field1047 = 255;
		}
		return this.field1058[this.field1047];
	}

	@ObfuscatedName("gb.b(Z)V")
	public void method431() {
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
			int var12 = var6 + var7;
			int var13 = var12 ^ var6 >>> 2;
			int var14 = var6 + var11;
			int var15 = var14 ^ var11 << 8;
			int var16 = var3 + var15;
			int var17 = var4 + var13;
			int var18 = var11 + var17;
			var5 = var18 ^ var17 >>> 16;
			int var19 = var2 + var5;
			int var20 = var16 + var17;
			var4 = var20 ^ var16 << 10;
			int var21 = var1 + var4;
			int var22 = var16 + var19;
			var3 = var22 ^ var19 >>> 4;
			int var23 = var19 + var21;
			var2 = var23 ^ var21 << 8;
			var7 = var2 + var13;
			int var24 = var3 + var10;
			int var25 = var21 + var24;
			var1 = var25 ^ var24 >>> 9;
			var6 = var1 + var15;
			var8 = var7 + var24;
		}
		for (int var26 = 0; var26 < 256; var26 += 8) {
			int var27 = this.field1058[var26 + 7] + var1;
			int var28 = this.field1058[var26 + 3] + var5;
			int var29 = this.field1058[var26] + var8;
			int var30 = this.field1058[var26 + 1] + var7;
			int var31 = this.field1058[var26 + 4] + var4;
			int var32 = this.field1058[var26 + 6] + var2;
			int var33 = this.field1058[var26 + 5] + var3;
			int var34 = this.field1058[var26 + 2] + var6;
			int var35 = var29 ^ var30 << 11;
			int var36 = var28 + var35;
			int var37 = var30 + var34;
			int var38 = var37 ^ var34 >>> 2;
			int var39 = var31 + var38;
			int var40 = var34 + var36;
			int var41 = var40 ^ var36 << 8;
			int var42 = var36 + var39;
			int var43 = var33 + var41;
			var5 = var42 ^ var39 >>> 16;
			int var44 = var39 + var43;
			int var45 = var5 + var32;
			var4 = var44 ^ var43 << 10;
			int var46 = var4 + var27;
			int var47 = var43 + var45;
			var3 = var47 ^ var45 >>> 4;
			int var48 = var45 + var46;
			int var49 = var3 + var35;
			var2 = var48 ^ var46 << 8;
			int var50 = var46 + var49;
			var7 = var2 + var38;
			var1 = var50 ^ var49 >>> 9;
			var8 = var7 + var49;
			var6 = var1 + var41;
			this.field1061[var26] = var8;
			this.field1061[var26 + 1] = var7;
			this.field1061[var26 + 2] = var6;
			this.field1061[var26 + 3] = var5;
			this.field1061[var26 + 4] = var4;
			this.field1061[var26 + 5] = var3;
			this.field1061[var26 + 6] = var2;
			this.field1061[var26 + 7] = var1;
		}
		for (int var51 = 0; var51 < 256; var51 += 8) {
			int var52 = this.field1061[var51 + 7] + var1;
			int var53 = this.field1061[var51 + 6] + var2;
			int var54 = this.field1061[var51 + 2] + var6;
			int var55 = this.field1061[var51 + 3] + var5;
			int var56 = this.field1061[var51 + 5] + var3;
			int var57 = this.field1061[var51] + var8;
			int var58 = this.field1061[var51 + 4] + var4;
			int var59 = this.field1061[var51 + 1] + var7;
			int var60 = var57 ^ var59 << 11;
			int var61 = var55 + var60;
			int var62 = var54 + var59;
			int var63 = var62 ^ var54 >>> 2;
			int var64 = var54 + var61;
			int var65 = var64 ^ var61 << 8;
			int var66 = var56 + var65;
			int var67 = var58 + var63;
			int var68 = var61 + var67;
			var5 = var68 ^ var67 >>> 16;
			int var69 = var5 + var53;
			int var70 = var66 + var67;
			var4 = var70 ^ var66 << 10;
			int var71 = var4 + var52;
			int var72 = var66 + var69;
			var3 = var72 ^ var69 >>> 4;
			int var73 = var3 + var60;
			int var74 = var69 + var71;
			var2 = var74 ^ var71 << 8;
			int var75 = var71 + var73;
			var1 = var75 ^ var73 >>> 9;
			var7 = var2 + var63;
			var8 = var7 + var73;
			var6 = var1 + var65;
			this.field1061[var51] = var8;
			this.field1061[var51 + 1] = var7;
			this.field1061[var51 + 2] = var6;
			this.field1061[var51 + 3] = var5;
			this.field1061[var51 + 4] = var4;
			this.field1061[var51 + 5] = var3;
			this.field1061[var51 + 6] = var2;
			this.field1061[var51 + 7] = var1;
		}
		this.method428();
		this.field1047 = 256;
	}

	public Isaac(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.field1058[var2] = arg0[var2];
		}
		this.method431();
	}
}
