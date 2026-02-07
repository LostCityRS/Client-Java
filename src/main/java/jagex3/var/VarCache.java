package jagex3.var;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;

public class VarCache {
	@ObfuscatedName("bf.l")
	public static int[] field238 = new int[2000];
	@ObfuscatedName("de.x")
	public static int[] var = new int[2000];
    @ObfuscatedName("qf.c")
    public static int[] field2779 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2779[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("ka.a(BI)I")
	public static int getVarbit(int arg0) {
		VarBitType var1 = VarBitType.list(arg0);
		int var2 = var1.basevar;
		int var3 = var1.startbit;
		int var4 = var1.endbit;
		int var5 = field2779[var4 - var3];
		return var[var2] >> var3 & var5;
	}

	@ObfuscatedName("wf.a(IBI)V")
	public static void setVarbit(int arg0, int arg1) {
		VarBitType var2 = VarBitType.list(arg1);
		int var3 = var2.basevar;
		int var4 = var2.endbit;
		int var5 = var2.startbit;
		int var6 = field2779[var4 - var5];
		if (arg0 < 0 || arg0 > var6) {
			arg0 = 0;
		}
		int var7 = var6 << var5;
		var[var3] = var7 & arg0 << var5 | var[var3] & ~var7;
	}
}
