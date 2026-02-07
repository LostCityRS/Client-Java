package jagex3.var;

import deob.ObfuscatedName;
import jagex3.config.VarBitType;
import jagex3.dash3d.CollisionMap;

public class VarCache {
	@ObfuscatedName("bf.l")
	public static int[] field238 = new int[2000];
	@ObfuscatedName("de.x")
	public static int[] field504 = new int[2000];

	@ObfuscatedName("ka.a(BI)I")
	public static int getVarbit(int arg0) {
		VarBitType var1 = VarBitType.method636(arg0);
		int var2 = var1.field75;
		int var3 = var1.field66;
		int var4 = var1.field78;
		int var5 = CollisionMap.field2779[var4 - var3];
		return field504[var2] >> var3 & var5;
	}

	@ObfuscatedName("wf.a(IBI)V")
	public static void setVarbit(int arg0, int arg1) {
		VarBitType var2 = VarBitType.method636(arg1);
		int var3 = var2.field75;
		int var4 = var2.field78;
		int var5 = var2.field66;
		int var6 = CollisionMap.field2779[var4 - var5];
		if (arg0 < 0 || arg0 > var6) {
			arg0 = 0;
		}
		int var7 = var6 << var5;
		field504[var3] = var7 & arg0 << var5 | field504[var3] & ~var7;
	}
}
