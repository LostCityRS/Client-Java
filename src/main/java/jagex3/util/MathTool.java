package jagex3.util;

import deob.ObfuscatedName;

public class MathTool {
	@ObfuscatedName("va.a(BI)I")
	public static int bitsRequired(int arg0) {
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

    @ObfuscatedName("rc.b(II)I")
    public static int method959(int arg0) {
        int var1 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = var2 + (var2 >>> 4) & 0xF0F0F0F;
        int var4 = var3 + (var3 >>> 8);
        int var5 = var4 + (var4 >>> 16);
        return var5 & 0xFF;
    }

	@ObfuscatedName("cb.b(III)I")
	public static int hcf(int arg0, int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			int var2 = arg0 % arg1;
			arg0 = arg1;
			arg1 = var2;
		}
		return arg0;
	}

	@ObfuscatedName("da.a(III)I")
	public static int method168(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = arg0 & 0x1 | var2 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}

    @ObfuscatedName("ga.f(II)I")
    public static int method342(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }
}
