package deob;

@ObfuscatedName("nc")
public final class class81 implements Runnable {

	@ObfuscatedName("nc.a")
	public static JagString field2035 = JagString.wrap(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@ObfuscatedName("nc.b")
	public static JagString field2036 = JagString.wrap("Benutzen Sie bitte eine andere Welt)3");

	@ObfuscatedName("nc.c")
	public static JagString field2037 = JagString.wrap("Ok");

	@ObfuscatedName("nc.h")
	public final Object field2042 = new Object();

	@ObfuscatedName("nc.i")
	public static boolean field2043 = false;

	@ObfuscatedName("nc.l")
	public static int field2046 = 0;

	@ObfuscatedName("nc.m")
	public static JagString field2047 = JagString.wrap(" from your ignore list first");

	@ObfuscatedName("nc.n")
	public static JagString field2048 = JagString.wrap("Spiel)2Fenster geladen)3");

	@ObfuscatedName("nc.o")
	public static final int field2049 = 20;

	@ObfuscatedName("nc.p")
	public boolean field2050 = true;

	@ObfuscatedName("nc.q")
	public static JagString field2051 = JagString.wrap("Stufe)2");

	@ObfuscatedName("nc.r")
	public static JagString field2052 = JagString.wrap(" more options");

	@ObfuscatedName("nc.g")
	public static JagString field2041 = field2052;

	@ObfuscatedName("nc.t")
	public static JagString field2054 = field2047;

	@ObfuscatedName("nc.v")
	public static JagString field2056 = field2037;

	@ObfuscatedName("nc.w")
	public final int[] field2057 = new int[500];

	@ObfuscatedName("nc.x")
	public int field2058 = 0;

	@ObfuscatedName("nc.y")
	public final int[] field2059 = new int[500];

	@Override
	public void run() {
		while (this.field2050) {
			Object var1 = this.field2042;
			synchronized (this.field2042) {
				if (this.field2058 < 500) {
					this.field2059[this.field2058] = class24.field741;
					this.field2057[this.field2058] = class102.field2568;
					this.field2058++;
				}
			}
			Statics.method753(50L);
		}
	}
}
