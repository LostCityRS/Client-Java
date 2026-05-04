package deob;

@ObfuscatedName("oc")
public final class class155 extends class67 {

	@ObfuscatedName("oc.t")
	public static int field2991 = 0;

	@ObfuscatedName("oc.u")
	public final int field2992;

	@ObfuscatedName("oc.v")
	public static int field2993 = 0;

	@ObfuscatedName("oc.w")
	public static class22 field2994;

	@ObfuscatedName("oc.x")
	public static final class88 field2995 = class208.method1423(105, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@ObfuscatedName("oc.C")
	public static final class88 field3000 = class208.method1423(105, "This world is running a closed Beta)3");

	@ObfuscatedName("oc.A")
	public static final class88 field2998 = class208.method1423(105, " is already on your ignore list)3");

	@ObfuscatedName("oc.E")
	public static class88 field3002 = field3000;

	@ObfuscatedName("oc.B")
	public static class88 field2999 = field2998;

	@ObfuscatedName("oc.z")
	public static int field2997 = 0;

	@ObfuscatedName("oc.D")
	public final int field3001;

	@ObfuscatedName("oc.a(IBZII[Lq;)V")
	public static void method1055(int arg0, boolean arg1, int arg2, int arg3, class174[] arg4) {
		for (int var5 = 0; var5 < arg4.length; var5++) {
			class174 var6 = arg4[var5];
			if (var6 != null && arg2 == var6.field3504) {
				class57.method416(arg1, arg3, arg0, var6);
				class200.method1374(var6, arg0, arg3);
				if (var6.field3415 > var6.field3375 - var6.field3422) {
					var6.field3415 = var6.field3375 - var6.field3422;
				}
				if (var6.field3384 - var6.field3380 < var6.field3393) {
					var6.field3393 = var6.field3384 - var6.field3380;
				}
				if (var6.field3393 < 0) {
					var6.field3393 = 0;
				}
				if (var6.field3415 < 0) {
					var6.field3415 = 0;
				}
				if (var6.field3390 == 0) {
					class110.method759(arg1, var6);
				}
			}
		}
	}

	@ObfuscatedName("oc.a(BI)I")
	public static int method1057(int arg0) {
		int var1 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
		int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
		int var4 = var3 + (var3 >>> 8);
		int var5 = var4 + (var4 >>> 16);
		return var5 & 0xFF;
	}

	public class155(int arg0, int arg1) {
		this.field3001 = arg1;
		this.field2992 = arg0;
	}
}
