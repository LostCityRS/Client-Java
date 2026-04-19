package jagex3.util;

import deob.ObfuscatedName;

public class MathTool {

	@ObfuscatedName("s.a(IBI)I")
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
