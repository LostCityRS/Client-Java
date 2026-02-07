package jagex3.io;

import deob.ObfuscatedName;

public class ByteArrayPool {

	@ObfuscatedName("ia.J")
	public static byte[][] cacheMin = new byte[1000][];
	@ObfuscatedName("ha.G")
	public static int cacheMinCount = 0;
	@ObfuscatedName("qb.g")
	public static int cacheMidCount = 0;
	@ObfuscatedName("nb.O")
	public static byte[][] cacheMid = new byte[250][];
	@ObfuscatedName("mb.b")
	public static int cacheMaxCount = 0;
	@ObfuscatedName("wc.u")
	public static byte[][] cacheMax = new byte[50][];

	@ObfuscatedName("qa.a(ZI)[B")
	public static synchronized byte[] alloc(int arg0) {
		if (arg0 == 100 && cacheMinCount > 0) {
			byte[] var1 = cacheMin[--cacheMinCount];
			cacheMin[cacheMinCount] = null;
			return var1;
		} else if (arg0 == 5000 && cacheMidCount > 0) {
			byte[] var2 = cacheMid[--cacheMidCount];
			cacheMid[cacheMidCount] = null;
			return var2;
		} else if (arg0 == 30000 && cacheMaxCount > 0) {
			byte[] var3 = cacheMax[--cacheMaxCount];
			cacheMax[cacheMaxCount] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
