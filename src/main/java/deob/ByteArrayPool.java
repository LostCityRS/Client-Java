package deob;

@ObfuscatedName("jd")
public final class ByteArrayPool {

	@ObfuscatedName("ub.X")
	public static final byte[][] field4155 = new byte[1000][];
	@ObfuscatedName("mg.zb")
	public static final byte[][] field2560 = new byte[250][];
	@ObfuscatedName("lf.rb")
	public static final byte[][] field2352 = new byte[50][];
	@ObfuscatedName("be.p")
	public static int field265 = 0;
	@ObfuscatedName("n.e")
	public static int field2617 = 0;
	@ObfuscatedName("oe.s")
	public static int field3035 = 0;

	@ObfuscatedName("jd.a(BI)[B")
	public static synchronized byte[] method709(int arg0) {
		if (arg0 == 100 && field265 > 0) {
			byte[] var1 = field4155[--field265];
			field4155[field265] = null;
			return var1;
		} else if (arg0 == 5000 && field2617 > 0) {
			byte[] var2 = field2560[--field2617];
			field2560[field2617] = null;
			return var2;
		} else if (arg0 == 30000 && field3035 > 0) {
			byte[] var3 = field2352[--field3035];
			field2352[field3035] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}
}
