package jagex3.util;

import deob.ObfuscatedName;

public class MathUtil {
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
}
