package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("xb")
public class Isaac {

	@ObfuscatedName("xb.a")
	public int field863;

	@ObfuscatedName("xb.b")
	public int[] field864 = new int[256];

	@ObfuscatedName("xb.c")
	public int[] field865 = new int[256];

	@ObfuscatedName("xb.d")
	public int field866;

	@ObfuscatedName("xb.e")
	public int field867;

	@ObfuscatedName("xb.f")
	public int field868;

	public Isaac(int[] arg0, int arg1) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			this.field864[var3] = arg0[var3];
		}
		this.method306();
		if (arg1 < 0 || arg1 > 0) {
			throw new NullPointerException();
		}
	}

	@ObfuscatedName("xb.a()I")
	public final int nextInt() {
		if (this.field863-- == 0) {
			this.method305();
			this.field863 = 255;
		}
		return this.field864[this.field863];
	}

	@ObfuscatedName("xb.b()V")
	public final void method305() {
		this.field867 += ++this.field868;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.field865[var1];
			switch(var1 & 0x3) {
				case 0:
					this.field866 ^= this.field866 << 13;
					break;
				case 1:
					this.field866 ^= this.field866 >>> 6;
					break;
				case 2:
					this.field866 ^= this.field866 << 2;
					break;
				case 3:
					this.field866 ^= this.field866 >>> 16;
			}
			this.field866 += this.field865[var1 + 128 & 0xFF];
			int var3;
			this.field865[var1] = var3 = this.field865[var2 >> 2 & 0xFF] + this.field866 + this.field867;
			this.field864[var1] = this.field867 = this.field865[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("xb.c()V")
	public final void method306() {
		int var1 = -1640531527;
		int var2 = -1640531527;
		int var3 = -1640531527;
		int var4 = -1640531527;
		int var5 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;
		int var8 = -1640531527;
		for (int var9 = 0; var9 < 4; var9++) {
			int var60 = var8 ^ var7 << 11;
			int var61 = var5 + var60;
			int var62 = var6 + var7;
			int var63 = var62 ^ var6 >>> 2;
			int var64 = var4 + var63;
			int var65 = var6 + var61;
			int var66 = var65 ^ var61 << 8;
			int var67 = var3 + var66;
			int var68 = var61 + var64;
			var5 = var68 ^ var64 >>> 16;
			int var69 = var2 + var5;
			int var70 = var64 + var67;
			var4 = var70 ^ var67 << 10;
			int var71 = var1 + var4;
			int var72 = var67 + var69;
			var3 = var72 ^ var69 >>> 4;
			int var73 = var3 + var60;
			int var74 = var69 + var71;
			var2 = var74 ^ var71 << 8;
			var7 = var2 + var63;
			int var75 = var71 + var73;
			var1 = var75 ^ var73 >>> 9;
			var6 = var1 + var66;
			var8 = var7 + var73;
		}
		for (int var10 = 0; var10 < 256; var10 += 8) {
			int var36 = this.field864[var10] + var8;
			int var37 = this.field864[var10 + 1] + var7;
			int var38 = this.field864[var10 + 2] + var6;
			int var39 = this.field864[var10 + 3] + var5;
			int var40 = this.field864[var10 + 4] + var4;
			int var41 = this.field864[var10 + 5] + var3;
			int var42 = this.field864[var10 + 6] + var2;
			int var43 = this.field864[var10 + 7] + var1;
			int var44 = var36 ^ var37 << 11;
			int var45 = var39 + var44;
			int var46 = var37 + var38;
			int var47 = var46 ^ var38 >>> 2;
			int var48 = var40 + var47;
			int var49 = var38 + var45;
			int var50 = var49 ^ var45 << 8;
			int var51 = var41 + var50;
			int var52 = var45 + var48;
			var5 = var52 ^ var48 >>> 16;
			int var53 = var5 + var42;
			int var54 = var48 + var51;
			var4 = var54 ^ var51 << 10;
			int var55 = var4 + var43;
			int var56 = var51 + var53;
			var3 = var56 ^ var53 >>> 4;
			int var57 = var3 + var44;
			int var58 = var53 + var55;
			var2 = var58 ^ var55 << 8;
			var7 = var2 + var47;
			int var59 = var55 + var57;
			var1 = var59 ^ var57 >>> 9;
			var6 = var1 + var50;
			var8 = var7 + var57;
			this.field865[var10] = var8;
			this.field865[var10 + 1] = var7;
			this.field865[var10 + 2] = var6;
			this.field865[var10 + 3] = var5;
			this.field865[var10 + 4] = var4;
			this.field865[var10 + 5] = var3;
			this.field865[var10 + 6] = var2;
			this.field865[var10 + 7] = var1;
		}
		for (int var11 = 0; var11 < 256; var11 += 8) {
			int var12 = this.field865[var11] + var8;
			int var13 = this.field865[var11 + 1] + var7;
			int var14 = this.field865[var11 + 2] + var6;
			int var15 = this.field865[var11 + 3] + var5;
			int var16 = this.field865[var11 + 4] + var4;
			int var17 = this.field865[var11 + 5] + var3;
			int var18 = this.field865[var11 + 6] + var2;
			int var19 = this.field865[var11 + 7] + var1;
			int var20 = var12 ^ var13 << 11;
			int var21 = var15 + var20;
			int var22 = var13 + var14;
			int var23 = var22 ^ var14 >>> 2;
			int var24 = var16 + var23;
			int var25 = var14 + var21;
			int var26 = var25 ^ var21 << 8;
			int var27 = var17 + var26;
			int var28 = var21 + var24;
			var5 = var28 ^ var24 >>> 16;
			int var29 = var5 + var18;
			int var30 = var24 + var27;
			var4 = var30 ^ var27 << 10;
			int var31 = var4 + var19;
			int var32 = var27 + var29;
			var3 = var32 ^ var29 >>> 4;
			int var33 = var3 + var20;
			int var34 = var29 + var31;
			var2 = var34 ^ var31 << 8;
			var7 = var2 + var23;
			int var35 = var31 + var33;
			var1 = var35 ^ var33 >>> 9;
			var6 = var1 + var26;
			var8 = var7 + var33;
			this.field865[var11] = var8;
			this.field865[var11 + 1] = var7;
			this.field865[var11 + 2] = var6;
			this.field865[var11 + 3] = var5;
			this.field865[var11 + 4] = var4;
			this.field865[var11 + 5] = var3;
			this.field865[var11 + 6] = var2;
			this.field865[var11 + 7] = var1;
		}
		this.method305();
		this.field863 = 256;
	}
}
