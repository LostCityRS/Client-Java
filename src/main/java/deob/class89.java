package deob;

@ObfuscatedName("oe")
public final class class89 implements Runnable {

	@ObfuscatedName("oe.g")
	public static int field2175 = 0;

	@ObfuscatedName("oe.k")
	public static byte[][] field2179 = new byte[250][];

	@ObfuscatedName("oe.l")
	public static int field2180 = 256;

	@ObfuscatedName("oe.n")
	public static int field2182 = 0;

	@ObfuscatedName("oe.t")
	public static int field2188 = -1;

	@ObfuscatedName("oe.u")
	public static int field2189 = 0;

	@Override
	public void run() {
		try {
			while (true) {
				LinkList var1 = class62.field1547;
				class57 var2;
				synchronized (class62.field1547) {
					var2 = (class57) class62.field1547.method802();
				}
				if (var2 == null) {
					Statics.method753(100L);
					Object var3 = class5.field213;
					synchronized (class5.field213) {
						if (class8.field307 <= 1) {
							class8.field307 = 0;
							class5.field213.notifyAll();
							return;
						}
						class8.field307--;
					}
				} else {
					if (var2.field1464 == 0) {
						var2.field1469.method908(var2.field1454, var2.field1454.length, (int) var2.field2073);
						LinkList var5 = class62.field1547;
						synchronized (class62.field1547) {
							var2.method739();
						}
					} else if (var2.field1464 == 1) {
						var2.field1454 = var2.field1469.method906((int) var2.field2073);
						LinkList var4 = class62.field1547;
						synchronized (class62.field1547) {
							class95.field2371.method804(var2);
						}
					}
					Object var6 = class5.field213;
					synchronized (class5.field213) {
						if (class8.field307 <= 1) {
							class8.field307 = 0;
							class5.field213.notifyAll();
							return;
						}
						class8.field307 = 600;
					}
				}
			}
		} catch (Exception var13) {
			Statics.method214(null, var13);
		}
	}
}
