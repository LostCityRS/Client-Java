package deob;

@ObfuscatedName("ge")
public final class class71 extends class67 {

	@ObfuscatedName("ge.v")
	public static int field1309;

	@ObfuscatedName("ge.C")
	public static int field1316 = 0;

	@ObfuscatedName("ge.G")
	public static final class88 field1320 = class208.method1423(105, "shake:");

	@ObfuscatedName("ge.u")
	public static final class88 field1308 = field1320;

	@ObfuscatedName("ge.A")
	public static final class88 field1314 = class208.method1423(105, "World");

	@ObfuscatedName("ge.E")
	public static final class88 field1318 = class208.method1423(105, "Hier wechseln");

	@ObfuscatedName("ge.y")
	public static class88 field1312 = field1314;

	@ObfuscatedName("ge.z")
	public static class88 field1313 = field1320;

	@ObfuscatedName("ge.L")
	public static final class88 field1325 = class208.method1423(105, "Mem:");

	@ObfuscatedName("ge.M")
	public static class88 field1326 = field1314;

	@ObfuscatedName("ge.x")
	public static final class88 field1311 = class208.method1423(105, "Loading interfaces )2 ");

	@ObfuscatedName("ge.O")
	public static int field1328 = 0;

	@ObfuscatedName("ge.Q")
	public static final class88 field1330 = class208.method1423(105, "Registrierter Benutzer");

	@ObfuscatedName("ge.I")
	public static class88 field1322 = field1311;

	@ObfuscatedName("ge.B")
	public byte field1315;

	@ObfuscatedName("ge.D")
	public int field1317;

	@ObfuscatedName("ge.H")
	public class88 field1321;

	@ObfuscatedName("ge.J")
	public class88 field1323;

	@ObfuscatedName("ge.a(IB)Lng;")
	public static class149 method472(int arg0) {
		class149 var1 = (class149) class211.field3998.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class236.field4400.method939(class129.method872(arg0), class138.method920(arg0));
		class149 var3 = new class149();
		var3.field2844 = arg0;
		if (var2 != null) {
			var3.method1014(new class46(var2));
		}
		var3.method1013();
		if (var3.field2867 != -1) {
			var3.method1019(method472(var3.field2841), method472(var3.field2867));
		}
		if (var3.field2884 != -1) {
			var3.method1020(method472(var3.field2874), method472(var3.field2884));
		}
		if (!class142.field2623 && var3.field2877) {
			var3.field2836 = 0;
			var3.field2898 = null;
			var3.field2861 = false;
			var3.field2892 = class176.field3533;
			var3.field2904 = null;
		}
		class211.field3998.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ge.a(BI)I")
	public static int method473(int arg0) {
		return arg0 & 0x3FF;
	}

	@ObfuscatedName("ge.b(Z)V")
	public static void method474() {
		class108.field1955.method670();
	}

	@ObfuscatedName("ge.a(ILq;)Z")
	public static boolean method475(class174 arg0) {
		if (class116.field2103) {
			if (class80.method530(arg0) != 0) {
				return false;
			}
			if (arg0.field3390 == 0) {
				return false;
			}
		}
		return arg0.field3378;
	}
}
