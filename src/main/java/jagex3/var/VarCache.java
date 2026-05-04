package jagex3.var;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;

public class VarCache {
	@ObfuscatedName("kd.eb")
	public static final int[] field2050 = new int[2000];
	@ObfuscatedName("jc.H")
	public static final int[] field1832 = new int[32];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1832[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("k.a(III)V")
	public static void method755(int arg0, int arg1) {
		VarBitType var2 = VarBitType.method1043(arg0);
		int var3 = var2.field4233;
		int var4 = var2.field4234;
		int var5 = var2.field4237;
		int var6 = field1832[var5 - var4];
		if (arg1 < 0 || arg1 > var6) {
			arg1 = 0;
		}
		int var7 = var6 << var4;
		field2050[var3] = ~var7 & field2050[var3] | var7 & arg1 << var4;
	}

	@ObfuscatedName("n.b(II)I")
	public static int method930(int arg0) {
		VarBitType var1 = VarBitType.method1043(arg0);
		int var2 = var1.field4234;
		int var3 = var1.field4237;
		int var4 = var1.field4233;
		int var5 = field1832[var3 - var2];
		return field2050[var4] >> var2 & var5;
	}
}
