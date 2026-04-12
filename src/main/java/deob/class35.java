package deob;

@ObfuscatedName("fd")
public final class class35 extends class44 {

	@ObfuscatedName("fd.vb")
	public static JagString field927 = JagString.wrap("Login");

	@ObfuscatedName("fd.ub")
	public static JagString field926 = field927;

	@ObfuscatedName("fd.Cb")
	public static int field934 = 0;

	@ObfuscatedName("fd.Kb")
	public static JagString field942 = JagString.wrap("Please subscribe)1 or use a different world)3");

	@ObfuscatedName("fd.Ab")
	public static JagString field932 = field942;

	@ObfuscatedName("fd.Eb")
	public static int[] field936 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("fd.Jb")
	public static int field941 = 0;

	@ObfuscatedName("fd.xb")
	public static JagString field929 = JagString.wrap("Unerwartete Antwort vom Anmelde)2Server");

	@ObfuscatedName("fd.Bb")
	public int field933;

	@ObfuscatedName("fd.Lb")
	public int field943;

	@ObfuscatedName("fd.Nb")
	public int field945;

	@ObfuscatedName("fd.a(ILba;)V")
	public void method402(class8 arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method403(arg0, var2);
		}
	}

	@ObfuscatedName("fd.a(Lba;II)V")
	public void method403(class8 arg0, int arg1) {
		if (arg1 == 1) {
			this.field933 = arg0.method145();
			this.field943 = arg0.method144();
			this.field945 = arg0.method144();
		}
	}
}
