package jagex3.var;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;

public class VarCache {
	@ObfuscatedName("kd.eb")
	public static final int[] var = new int[2000];
	@ObfuscatedName("jc.H")
	public static final int[] mask = new int[32];
	@ObfuscatedName("kj.p")
	public static final int[] varcInt = new int[2000];
	@ObfuscatedName("pe.K")
	public static final int[] varServ = new int[2000];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			mask[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("k.a(III)V")
	public static void setVarbit(int arg0, int arg1) {
		VarBitType var2 = VarBitType.list(arg0);
		int var3 = var2.basevar;
		int var4 = var2.startbit;
		int var5 = var2.endbit;
		int var6 = mask[var5 - var4];
		if (arg1 < 0 || arg1 > var6) {
			arg1 = 0;
		}
		int var7 = var6 << var4;
		var[var3] = ~var7 & var[var3] | var7 & arg1 << var4;
	}

	@ObfuscatedName("n.b(II)I")
	public static int getVarbit(int arg0) {
		VarBitType var1 = VarBitType.list(arg0);
		int var2 = var1.startbit;
		int var3 = var1.endbit;
		int var4 = var1.basevar;
		int var5 = mask[var3 - var2];
		return var[var4] >> var2 & var5;
	}
}
