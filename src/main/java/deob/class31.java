package deob;

@ObfuscatedName("ch")
public final class class31 implements Runnable {

	@ObfuscatedName("ch.a")
	public static class154 field495 = new class154(512);

	@ObfuscatedName("ch.g")
	public static final class6 field501 = new class6(5000);

	@ObfuscatedName("ch.h")
	public static final class88 field502 = class208.method1423(105, "<col=ffb000>");

	@ObfuscatedName("ch.i")
	public static class170 field503;

	@ObfuscatedName("ch.j")
	public static final class88 field504 = class208.method1423(105, "Prepared sound engine");

	@ObfuscatedName("ch.k")
	public static class169[] field505;

	@ObfuscatedName("ch.l")
	public static class144 field506;

	@ObfuscatedName("ch.m")
	public static class88 field507 = field504;

	@ObfuscatedName("ch.n")
	public static final class88 field508 = class208.method1423(105, "Lade Konfiguration )2 ");

	@ObfuscatedName("ch.o")
	public static final class88 field509 = class208.method1423(105, "<br>(X");

	@ObfuscatedName("ch.a(II)Z")
	public static boolean method201(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("ch.a(III)I")
	public static int method202(int arg0, int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			int var2 = (arg1 & 0x7F) * arg0 >> 7;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return (arg1 & 0xFF80) + var2;
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				class248 var1 = class227.field4252;
				class90 var2;
				synchronized (class227.field4252) {
					var2 = (class90) class227.field4252.method1610();
				}
				if (var2 == null) {
					class21.method98(100L);
					Object var6 = class33.field533;
					synchronized (class33.field533) {
						if (class225.field4231 <= 1) {
							class225.field4231 = 0;
							class33.field533.notifyAll();
							return;
						}
						class225.field4231--;
					}
				} else {
					if (var2.field1701 == 0) {
						var2.field1713.method1498(var2.field1705, (int) var2.field1219, var2.field1705.length);
						class248 var3 = class227.field4252;
						synchronized (class227.field4252) {
							var2.method460();
						}
					} else if (var2.field1701 == 1) {
						var2.field1705 = var2.field1713.method1497((int) var2.field1219);
						class248 var4 = class227.field4252;
						synchronized (class227.field4252) {
							class131.field2461.method1622(var2);
						}
					}
					Object var5 = class33.field533;
					synchronized (class33.field533) {
						if (class225.field4231 <= 1) {
							class225.field4231 = 0;
							class33.field533.notifyAll();
							return;
						}
						class225.field4231 = 600;
					}
				}
			}
		} catch (Exception var13) {
			class221.method1488(null, var13);
		}
	}
}
