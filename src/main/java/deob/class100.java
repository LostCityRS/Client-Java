package deob;

@ObfuscatedName("oc")
public final class class100 {

	@ObfuscatedName("oc.a")
	public static class32 field2315 = class73.method593("headicons_pk", true);

	@ObfuscatedName("oc.c")
	public static int[][] field2317 = new int[104][104];

	@ObfuscatedName("oc.d")
	public static class32 field2318 = class73.method593("Mitglieder)2Welt", true);

	@ObfuscatedName("oc.f")
	public static class49 field2320;

	@ObfuscatedName("oc.a(IIII)I")
	public static int method795(int arg0, int arg1, int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg2 / 32 << 7) + (arg0 / 4 << 10);
	}

	@ObfuscatedName("oc.a(BLfd;)V")
	public static void method797(class40 arg0) {
		arg0.field947 = false;
		if (arg0.field946 != null) {
			arg0.field946.field2184 = 0;
		}
		for (class40 var1 = arg0.method106(); var1 != null; var1 = arg0.method113()) {
			method797(var1);
		}
	}
}
