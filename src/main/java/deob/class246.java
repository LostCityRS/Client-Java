package deob;

@ObfuscatedName("wg")
public final class class246 extends class219 {

	@ObfuscatedName("wg.s")
	public static final class119[] field4504 = new class119[27];

	@ObfuscatedName("wg.u")
	public static int field4506;

	@ObfuscatedName("wg.v")
	public static final class88 field4507 = class208.method1423(105, "Please try again)3");

	@ObfuscatedName("wg.w")
	public static class88 field4508 = field4507;

	@ObfuscatedName("wg.y")
	public static int[] field4510;

	@ObfuscatedName("wg.b(III)I")
	public static int method1608(int arg0, int arg1) {
		class177 var2 = (class177) class64.field1163.method1049((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.field3551.length; var4++) {
				if (arg1 == var2.field3553[var4]) {
					var3 += var2.field3551[var4];
				}
			}
			return var3;
		}
	}
}
