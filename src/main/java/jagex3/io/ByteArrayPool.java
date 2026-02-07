package jagex3.io;

import deob.ObfuscatedName;

public class ByteArrayPool {
	@ObfuscatedName("ia.J")
	public static byte[][] field1314 = new byte[1000][];
	@ObfuscatedName("ha.G")
	public static int field1160 = 0;
	@ObfuscatedName("qb.g")
	public static int field2640 = 0;
	@ObfuscatedName("nb.O")
	public static byte[][] field2125 = new byte[250][];
	@ObfuscatedName("mb.b")
	public static int field1979 = 0;
	@ObfuscatedName("wc.u")
	public static byte[][] field3575 = new byte[50][];

	@ObfuscatedName("qa.a(ZI)[B")
	public static synchronized byte[] alloc(int arg0) {
		if (arg0 == 100 && field1160 > 0) {
			byte[] var1 = field1314[--field1160];
			field1314[field1160] = null;
			return var1;
		} else if (arg0 == 5000 && field2640 > 0) {
			byte[] var2 = field2125[--field2640];
			field2125[field2640] = null;
			return var2;
		} else if (arg0 == 30000 && field1979 > 0) {
			byte[] var3 = field3575[--field1979];
			field3575[field1979] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
