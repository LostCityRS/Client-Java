package jagex3.util;

import deob.ObfuscatedName;

public class MathTool {
	@ObfuscatedName("ej.b(II)I")
	public static int bitsRequired(int arg0) {
		int var1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			var1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			var1 += 8;
		}
		if (arg0 >= 16) {
			var1 += 4;
			arg0 >>>= 0x4;
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

	@ObfuscatedName("uj.a(IBI)I")
	public static int method1524(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = arg0 & 0x1 | var2 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}

    @ObfuscatedName("td.a(IIB)I")
    public static int hcf(int arg0, int arg1) {
        if (arg0 > 22050) {
            arg1 = arg0;
            arg0 = 22050;
        }
        while (arg0 != 0) {
            int var2 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var2;
        }
        return arg1;
    }
}
