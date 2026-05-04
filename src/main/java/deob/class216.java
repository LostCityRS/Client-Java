package deob;

@ObfuscatedName("ti")
public final class class216 extends class67 {

	@ObfuscatedName("ti.u")
	public static final int[] field4045 = new int[256];

	@ObfuscatedName("ti.v")
	public class88 field4046;

	@ObfuscatedName("ti.w")
	public static final class92 field4047;

	@ObfuscatedName("ti.C")
	public static final class88 field4053;

	@ObfuscatedName("ti.y")
	public static class88 field4049;

	@ObfuscatedName("ti.z")
	public static final class88 field4050;

	@ObfuscatedName("ti.D")
	public static final class88 field4054;

	@ObfuscatedName("ti.A")
	public static class88 field4051;

	@ObfuscatedName("ti.x")
	public static int field4048;

	@ObfuscatedName("ti.B")
	public static byte[][][] field4052;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field4045[var0] = var1;
		}
		field4047 = new class92(64);
		field4053 = class208.method1423(105, "slide:");
		field4049 = field4053;
		field4050 = field4053;
		field4054 = class208.method1423(105, "Select");
		field4051 = field4054;
	}

	@ObfuscatedName("ti.a(IB)Lac;")
	public static class4 method1467(int arg0) {
		class4 var1 = (class4) class158.field3038.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class179.field3565.method939(arg0, 11);
		class4 var3 = new class4();
		if (var2 != null) {
			var3.method21(new class46(var2));
		}
		class158.field3038.method663((long) arg0, var3);
		return var3;
	}

	public class216() {
	}

	public class216(class88 arg0) {
		this.field4046 = arg0;
	}
}
