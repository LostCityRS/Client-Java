package deob;

import java.math.BigInteger;

@ObfuscatedName("fb")
public final class class58 extends class140 {

	@ObfuscatedName("fb.db")
	public static final class88 field1094 = class208.method1423(105, "Allocating memory");

	@ObfuscatedName("fb.cb")
	public static class88 field1093 = field1094;

	@ObfuscatedName("fb.fb")
	public static final class88 field1096 = class208.method1423(105, "m-Ochte mit Ihnen handeln)3");

	@ObfuscatedName("fb.gb")
	public static boolean field1097 = false;

	@ObfuscatedName("fb.hb")
	public static final BigInteger field1098 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("fb.jb")
	public static final class88 field1100 = class208.method1423(105, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@ObfuscatedName("fb.kb")
	public static int field1101 = -1;

	@ObfuscatedName("fb.lb")
	public static int field1102;

	@ObfuscatedName("fb.mb")
	public static final class88 field1103 = class208.method1423(105, "::rect_debug");

	@ObfuscatedName("fb.nb")
	public static final class88 field1104 = class208.method1423(105, "Bitte versuchen Sie es in ");

	@ObfuscatedName("fb.ob")
	public static int field1105;

	@ObfuscatedName("fb.f(I)V")
	public static void method421() {
		class211.field3998.method670();
		class241.field4470.method134();
		class206.field3920.method670();
	}

	@ObfuscatedName("fb.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310 && this.method924()) {
			int[] var3 = var2[1];
			int[] var4 = var2[0];
			int[] var5 = var2[2];
			int var6 = arg0 % super.field2588 * super.field2588;
			for (int var7 = 0; var7 < class70.field1276; var7++) {
				int var8 = super.field2589[var7 % super.field2593 + var6];
				var5[var7] = (var8 & 0xFF) << 4;
				var3[var7] = var8 >> 4 & 0xFF0;
				var4[var7] = var8 >> 12 & 0xFF0;
			}
		}
		return var2;
	}
}
