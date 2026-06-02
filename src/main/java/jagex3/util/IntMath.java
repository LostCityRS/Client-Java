package jagex3.util;

import deob.ObfuscatedName;

public class IntMath {

	@ObfuscatedName("qj.a(ZI)I")
	public static int bitceil(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

    @ObfuscatedName("od.a(IIII)I")
    public static int method1058(int arg0, int arg1, int arg2) {
        if (arg0 > arg2) {
            return arg0;
        } else if (arg2 > arg1) {
            return arg1;
        } else {
            return arg2;
        }
    }
}
