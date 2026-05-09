package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("jd")
public final class ByteArrayPool {

	@ObfuscatedName("ub.X")
	public static final byte[][] cacheMin = new byte[1000][];
	@ObfuscatedName("mg.zb")
	public static final byte[][] cacheMid = new byte[250][];
	@ObfuscatedName("lf.rb")
	public static final byte[][] cacheMax = new byte[50][];
	@ObfuscatedName("be.p")
	public static int cacheMinCount = 0;
	@ObfuscatedName("n.e")
	public static int cacheMidCount = 0;
	@ObfuscatedName("oe.s")
	public static int cacheMaxCount = 0;

	@ObfuscatedName("jd.a(BI)[B")
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
