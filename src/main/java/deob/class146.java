package deob;

@ObfuscatedName("nd")
public final class class146 {

	@ObfuscatedName("nd.a")
	public int[] field2727;

	@ObfuscatedName("nd.b")
	public int field2728;

	@ObfuscatedName("nd.c")
	public static int field2729 = 0;

	@ObfuscatedName("nd.e")
	public static int[] field2731;

	@ObfuscatedName("nd.i")
	public static final class88 field2735 = class208.method1423(105, "Location");

	@ObfuscatedName("nd.h")
	public static class88 field2734 = field2735;

	@ObfuscatedName("nd.k")
	public int field2737;

	@ObfuscatedName("nd.l")
	public static class161 field2738;

	@ObfuscatedName("nd.o")
	public static final class88[] field2741 = new class88[100];

	@ObfuscatedName("nd.p")
	public static int field2742;

	@ObfuscatedName("nd.q")
	public int[] field2743;

	@ObfuscatedName("nd.r")
	public int field2744;

	@ObfuscatedName("nd.s")
	public static final int[] field2745 = new int[1000];

	@ObfuscatedName("nd.u")
	public static final class6 field2747 = new class6(5000);

	@ObfuscatedName("nd.w")
	public int field2749;

	@ObfuscatedName("nd.y")
	public static int field2751 = 1;

	@ObfuscatedName("nd.x")
	public static short[] field2750;

	@ObfuscatedName("nd.a(BI)V")
	public static void method972(int arg0) {
		if (arg0 == -1 || !class211.method1445(arg0)) {
			return;
		}
		class174[] var1 = class78.field1418[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class174 var3 = var1[var2];
			if (var3.field3436 != null) {
				class39 var4 = new class39();
				var4.field678 = var3;
				var4.field681 = var3.field3436;
				class135.method902(var4, 2000000);
			}
		}
	}

	@ObfuscatedName("nd.a(IJ)V")
	public static void method973(long arg0) {
		if (arg0 == (long) 0) {
			return;
		}
		for (int var2 = 0; var2 < class67.field1221; var2++) {
			if (class95.field1764[var2] == arg0) {
				class67.field1221--;
				for (int var3 = var2; var3 < class67.field1221; var3++) {
					class95.field1764[var3] = class95.field1764[var3 + 1];
					field2741[var3] = field2741[var3 + 1];
				}
				class20.field313 = class67.field1211;
				field2747.method30(126);
				field2747.method328(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("nd.a(III)V")
	public static void method974(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			class108 var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				class137.method915(var5);
				return;
			}
		}
	}

	@ObfuscatedName("nd.a(I)V")
	public static void method975() {
		if (class166.field3188 != null) {
			class53 var0 = class166.field3188;
			synchronized (class166.field3188) {
				class166.field3188 = null;
			}
		}
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method977() {
		Object var0 = class33.field533;
		synchronized (class33.field533) {
			if (class225.field4231 == 0) {
				class126.field2324.method1287(2, new class31(), 5);
			}
			class225.field4231 = 600;
		}
	}

	public class146() {
	}

	public class146(int[] arg0) {
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
