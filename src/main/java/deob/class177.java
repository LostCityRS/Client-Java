package deob;

@ObfuscatedName("qc")
public final class class177 extends class67 {

	@ObfuscatedName("qc.v")
	public static final class88 field3550 = class208.method1423(105, "Allocated memory");

	@ObfuscatedName("qc.u")
	public static class88 field3549 = field3550;

	@ObfuscatedName("qc.w")
	public int[] field3551 = new int[1];

	@ObfuscatedName("qc.z")
	public static final class88 field3554 = class208.method1423(105, "<img=0>");

	@ObfuscatedName("qc.y")
	public int[] field3553 = new int[] { -1 };

	@ObfuscatedName("qc.a(IIIII)V")
	public static void method1268(int arg0, int arg1, int arg2, int arg3) {
		class177 var4 = (class177) class64.field1163.method1049((long) arg0);
		if (var4 == null) {
			var4 = new class177();
			class64.field1163.method1052((long) arg0, var4);
		}
		if (var4.field3553.length <= arg2) {
			int[] var5 = new int[arg2 + 1];
			int[] var6 = new int[arg2 + 1];
			for (int var7 = 0; var7 < var4.field3553.length; var7++) {
				var6[var7] = var4.field3553[var7];
				var5[var7] = var4.field3551[var7];
			}
			for (int var8 = var4.field3553.length; var8 < arg2; var8++) {
				var6[var8] = -1;
				var5[var8] = 0;
			}
			var4.field3551 = var5;
			var4.field3553 = var6;
		}
		var4.field3553[arg2] = arg3;
		var4.field3551[arg2] = arg1;
	}
}
