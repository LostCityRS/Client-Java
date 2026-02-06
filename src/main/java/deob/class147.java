package deob;

@ObfuscatedName("va")
public final class class147 {

	@ObfuscatedName("va.a")
	public final int[] field3325 = new int[256];

	@ObfuscatedName("va.b")
	public static class32 field3326 = class73.method593("Jun", true);

	@ObfuscatedName("va.c")
	public static class32 field3327 = class73.method593("Oct", true);

	@ObfuscatedName("va.d")
	public static class32 field3328 = class73.method593("Nov", true);

	@ObfuscatedName("va.e")
	public int field3329;

	@ObfuscatedName("va.f")
	public static class32 field3330 = class73.method593("May", true);

	@ObfuscatedName("va.h")
	public static class32 field3332 = class73.method593("Sep", true);

	@ObfuscatedName("va.j")
	public static class32 field3334 = class73.method593("Aug", true);

	@ObfuscatedName("va.m")
	public static class32 field3337 = class73.method593("Jul", true);

	@ObfuscatedName("va.n")
	public static class32 field3338 = class73.method593("Feb", true);

	@ObfuscatedName("va.o")
	public static class32 field3339 = class73.method593("Invalid loginserver requested)3", true);

	@ObfuscatedName("va.p")
	public static class32 field3340 = class73.method593("Apr", true);

	@ObfuscatedName("va.q")
	public static short[] field3341 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@ObfuscatedName("va.r")
	public final int[] field3342 = new int[256];

	@ObfuscatedName("va.s")
	public int field3343;

	@ObfuscatedName("va.t")
	public static byte[][] field3344;

	@ObfuscatedName("va.u")
	public int field3345;

	@ObfuscatedName("va.v")
	public static class44 field3346;

	@ObfuscatedName("va.w")
	public int field3347;

	@ObfuscatedName("va.x")
	public static class32 field3348 = field3339;

	@ObfuscatedName("va.A")
	public static class32 field3351 = class73.method593("Jan", true);

	@ObfuscatedName("va.C")
	public static class32 field3353 = null;

	@ObfuscatedName("va.z")
	public static class32 field3350 = class73.method593("Mar", true);

	@ObfuscatedName("va.B")
	public static class32 field3352 = class73.method593("Dec", true);

	@ObfuscatedName("va.i")
	public static class32[] field3333 = new class32[] { field3351, field3338, field3350, field3340, field3330, field3326, field3337, field3334, field3332, field3327, field3328, field3352 };

	@ObfuscatedName("va.a(BI)I")
	public static int method1099(int arg0) {
		int var1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			var1 += 16;
		}
		if (arg0 >= 256) {
			var1 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			var1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			var1 += 2;
		}
		if (arg0 >= 1) {
			var1++;
			arg0 >>>= 0x1;
		}
		return var1 + arg0;
	}

	@ObfuscatedName("va.a(ILf;)I")
	public static int method1100(class36 arg0) {
		class38 var1 = (class38) class115.field2768.method1196(((long) arg0.field743 << 32) + ((long) arg0.field828));
		return var1 == null ? arg0.field768 : var1.field900;
	}

	public class147(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			this.field3342[var2] = arg0[var2];
		}
		this.method1097();
	}

	@ObfuscatedName("va.a(I)V")
	public void method1096() {
		this.field3345 += ++this.field3343;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = this.field3325[var1];
			if ((var1 & 0x2) == 0) {
				if ((var1 & 0x1) == 0) {
					this.field3329 ^= this.field3329 << 13;
				} else {
					this.field3329 ^= this.field3329 >>> 6;
				}
			} else if ((var1 & 0x1) == 0) {
				this.field3329 ^= this.field3329 << 2;
			} else {
				this.field3329 ^= this.field3329 >>> 16;
			}
			this.field3329 += this.field3325[var1 + 128 & 0xFF];
			int var3;
			this.field3325[var1] = var3 = this.field3345 + this.field3329 + this.field3325[var2 >> 2 & 0xFF];
			this.field3342[var1] = this.field3345 = this.field3325[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("va.a(Z)V")
	public void method1097() {
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
			int var27 = var7 + this.field3342[var26 + 1];
			int var28 = var2 + this.field3342[var26 + 6];
			int var29 = var3 + this.field3342[var26 + 5];
			int var30 = var5 + this.field3342[var26 + 3];
			int var31 = var4 + this.field3342[var26 + 4];
			int var32 = var8 + this.field3342[var26];
			int var33 = var1 + this.field3342[var26 + 7];
			int var34 = var6 + this.field3342[var26 + 2];
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
			this.field3325[var26] = var8;
			this.field3325[var26 + 1] = var7;
			this.field3325[var26 + 2] = var6;
			this.field3325[var26 + 3] = var5;
			this.field3325[var26 + 4] = var4;
			this.field3325[var26 + 5] = var3;
			this.field3325[var26 + 6] = var2;
			this.field3325[var26 + 7] = var1;
		}
		for (int var51 = 0; var51 < 256; var51 += 8) {
			int var52 = var8 + this.field3325[var51];
			int var53 = var3 + this.field3325[var51 + 5];
			int var54 = var4 + this.field3325[var51 + 4];
			int var55 = var7 + this.field3325[var51 + 1];
			int var56 = var1 + this.field3325[var51 + 7];
			int var57 = var6 + this.field3325[var51 + 2];
			int var58 = var5 + this.field3325[var51 + 3];
			int var59 = var2 + this.field3325[var51 + 6];
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
			this.field3325[var51] = var8;
			var6 = var65 + var1;
			this.field3325[var51 + 1] = var7;
			this.field3325[var51 + 2] = var6;
			this.field3325[var51 + 3] = var5;
			this.field3325[var51 + 4] = var4;
			this.field3325[var51 + 5] = var3;
			this.field3325[var51 + 6] = var2;
			this.field3325[var51 + 7] = var1;
		}
		this.method1096();
		this.field3347 = 256;
	}

	@ObfuscatedName("va.c(I)I")
	public int method1101() {
		if (this.field3347-- == 0) {
			this.method1096();
			this.field3347 = 255;
		}
		return this.field3342[this.field3347];
	}
}
