package jagex3.var;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;

public class VarCache {
	@ObfuscatedName("ac.J")
	public static int[] field173 = new int[32];
	@ObfuscatedName("se.E")
	public static int[] field2803 = new int[2000];
	@ObfuscatedName("ga.E")
	public static int[] field1020 = new int[2000];
    @ObfuscatedName("ba.ic")
    public static int[] field304 = new int[2000];

    static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field173[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("hd.a(II)I")
	public static int method480(int arg0) {
		VarBitType var1 = VarBitType.list(arg0);
		int var2 = var1.field945;
		int var3 = var1.field933;
		int var4 = var1.field943;
		int var5 = field173[var2 - var4];
		return field2803[var3] >> var4 & var5;
	}

	@ObfuscatedName("be.b(IIB)V")
	public static void method241(int arg0, int arg1) {
		VarBitType var2 = VarBitType.list(arg1);
		int var3 = var2.field943;
		int var4 = var2.field933;
		int var5 = var2.field945;
		int var6 = field173[var5 - var3];
		if (arg0 < 0 || var6 < arg0) {
			arg0 = 0;
		}
		int var7 = var6 << var3;
		field2803[var4] = field2803[var4] & ~var7 | var7 & arg0 << var3;
	}
}
