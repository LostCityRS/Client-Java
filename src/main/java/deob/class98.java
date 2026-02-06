package deob;

@ObfuscatedName("oa")
public final class class98 extends class146 {

	@ObfuscatedName("oa.r")
	public int field2244;

	@ObfuscatedName("oa.s")
	public int[] field2245;

	@ObfuscatedName("oa.t")
	public static class44 field2246;

	@ObfuscatedName("oa.u")
	public class90 field2247;

	@ObfuscatedName("oa.v")
	public int field2248;

	@ObfuscatedName("oa.w")
	public int field2249;

	@ObfuscatedName("oa.B")
	public static class32 field2254 = class73.method593("go back to the main RuneScape webpage", true);

	@ObfuscatedName("oa.N")
	public static int[] field2266 = new int[] { 45, 23, 50, 29, 44, 48, 16, 6 };

	@ObfuscatedName("oa.V")
	public static class32 field2274 = class73.method593("Wordpack geladen)3", true);

	@ObfuscatedName("oa.K")
	public static int field2263 = 0;

	@ObfuscatedName("oa.R")
	public static int field2270 = 0;

	@ObfuscatedName("oa.L")
	public static int[] field2264 = new int[] { 1, 1, 1, 1 };

	@ObfuscatedName("oa.Y")
	public static class32 field2277 = field2254;

	@ObfuscatedName("oa.y")
	public int field2251;

	@ObfuscatedName("oa.C")
	public int field2255;

	@ObfuscatedName("oa.D")
	public int field2256;

	@ObfuscatedName("oa.H")
	public int field2260;

	@ObfuscatedName("oa.Q")
	public int field2269;

	@ObfuscatedName("oa.W")
	public int field2275;

	@ObfuscatedName("oa.X")
	public int field2276;

	@ObfuscatedName("oa.G")
	public static long field2259;

	@ObfuscatedName("oa.O")
	public static long field2267;

	@ObfuscatedName("oa.E")
	public static class30 field2257;

	@ObfuscatedName("oa.P")
	public static class44 field2268;

	@ObfuscatedName("oa.J")
	public static class51 field2262;

	@ObfuscatedName("oa.x")
	public class53 field2250;

	@ObfuscatedName("oa.S")
	public class90 field2271;

	@ObfuscatedName("oa.U")
	public static int[] field2273;

	@ObfuscatedName("oa.A")
	public static class36[] field2253;

	@ObfuscatedName("oa.z")
	public static class51[] field2252;

	@ObfuscatedName("oa.a(Lea;I)V")
	public static void method764(class30 arg0) {
		class48.field1133 = arg0;
	}

	@ObfuscatedName("oa.a(Ljava/lang/Throwable;Ljava/lang/String;)Lwf;")
	public static class159 method765(Throwable arg0, String arg1) {
		class159 var2;
		if (arg0 instanceof class159) {
			var2 = (class159) arg0;
			var2.field3643 = var2.field3643 + ' ' + arg1;
		} else {
			var2 = new class159(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("oa.a(ZI)I")
	public static int method768(int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@ObfuscatedName("oa.d(I)V")
	public void method767() {
		int var1 = this.field2275;
		class53 var2 = this.field2250.method422();
		if (var2 == null) {
			this.field2275 = -1;
			this.field2245 = null;
			this.field2244 = 0;
			this.field2260 = 0;
			this.field2249 = 0;
		} else {
			this.field2249 = var2.field1250;
			this.field2244 = var2.field1259;
			this.field2275 = var2.field1256;
			this.field2245 = var2.field1218;
			this.field2260 = var2.field1240 * 128;
		}
		if (this.field2275 != var1 && this.field2247 != null) {
			class37.field881.method907(this.field2247);
			this.field2247 = null;
		}
	}
}
