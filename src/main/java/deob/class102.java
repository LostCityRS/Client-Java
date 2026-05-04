package deob;

@ObfuscatedName("jd")
public final class class102 {

	@ObfuscatedName("jd.a")
	public static final class88 field1844 = class208.method1423(105, "");

	@ObfuscatedName("jd.e")
	public static final class88 field1848 = class208.method1423(105, "(U4");

	@ObfuscatedName("jd.f")
	public static int field1849;

	@ObfuscatedName("jd.g")
	public static int field1850;

	@ObfuscatedName("jd.h")
	public static int[] field1851;

	@ObfuscatedName("jd.i")
	public static final class88 field1852 = class208.method1423(105, "Press (Wrecover a locked account(W on front page)3");

	@ObfuscatedName("jd.c")
	public static class88 field1846 = field1852;

	@ObfuscatedName("jd.b(I)Z")
	public static boolean method707() {
		return class122.field2230 == 0 ? class31.field503.method1199() : true;
	}

	@ObfuscatedName("jd.c(I)I")
	public static int method708() {
		if (class150.field2915 == 3.0D) {
			return 37;
		} else if (class150.field2915 == 4.0D) {
			return 50;
		} else if (class150.field2915 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@ObfuscatedName("jd.a(BI)[B")
	public static synchronized byte[] method709(int arg0) {
		if (arg0 == 100 && class17.field265 > 0) {
			byte[] var1 = class220.field4155[--class17.field265];
			class220.field4155[class17.field265] = null;
			return var1;
		} else if (arg0 == 5000 && class142.field2617 > 0) {
			byte[] var2 = class138.field2560[--class142.field2617];
			class138.field2560[class142.field2617] = null;
			return var2;
		} else if (arg0 == 30000 && class157.field3035 > 0) {
			byte[] var3 = class126.field2352[--class157.field3035];
			class126.field2352[class157.field3035] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
