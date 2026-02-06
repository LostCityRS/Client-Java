package deob;

@ObfuscatedName("m")
public final class class83 {

	@ObfuscatedName("m.a")
	public static int field1922;

	@ObfuscatedName("m.b")
	public int field1923 = 0;

	@ObfuscatedName("m.c")
	public static class32 field1924 = class73.method593("(U0a )2 via: ", true);

	@ObfuscatedName("m.d")
	public final int[][] field1925 = new int[6][258];

	@ObfuscatedName("m.e")
	public final byte[] field1926 = new byte[256];

	@ObfuscatedName("m.f")
	public static int[] field1927 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("m.g")
	public final byte[] field1928 = new byte[4096];

	@ObfuscatedName("m.h")
	public byte field1929;

	@ObfuscatedName("m.i")
	public final byte[][] field1930 = new byte[6][258];

	@ObfuscatedName("m.j")
	public static class32 field1931 = class73.method593("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", true);

	@ObfuscatedName("m.k")
	public int field1932;

	@ObfuscatedName("m.l")
	public static int field1933 = 0;

	@ObfuscatedName("m.m")
	public int field1934;

	@ObfuscatedName("m.n")
	public byte[] field1935;

	@ObfuscatedName("m.o")
	public int field1936;

	@ObfuscatedName("m.p")
	public int field1937;

	@ObfuscatedName("m.q")
	public final int[][] field1938 = new int[6][258];

	@ObfuscatedName("m.s")
	public final int[] field1940 = new int[257];

	@ObfuscatedName("m.u")
	public static short[] field1942 = new short[] { -1, 9104, -1, -1, -1 };

	@ObfuscatedName("m.w")
	public int field1944;

	@ObfuscatedName("m.B")
	public static class32 field1949 = class73.method593("Prepared visibility map", true);

	@ObfuscatedName("m.r")
	public static class32 field1939 = field1949;

	@ObfuscatedName("m.J")
	public static int[] field1957 = new int[1000];

	@ObfuscatedName("m.z")
	public final byte[] field1947 = new byte[18002];

	@ObfuscatedName("m.K")
	public final int[] field1958 = new int[16];

	@ObfuscatedName("m.H")
	public final int[][] field1955 = new int[6][258];

	@ObfuscatedName("m.M")
	public final int[] field1960 = new int[6];

	@ObfuscatedName("m.O")
	public final boolean[] field1962 = new boolean[256];

	@ObfuscatedName("m.A")
	public final byte[] field1948 = new byte[18002];

	@ObfuscatedName("m.F")
	public int field1953 = 0;

	@ObfuscatedName("m.N")
	public final boolean[] field1961 = new boolean[16];

	@ObfuscatedName("m.Q")
	public final int[] field1964 = new int[256];

	@ObfuscatedName("m.y")
	public int field1946;

	@ObfuscatedName("m.C")
	public int field1950;

	@ObfuscatedName("m.D")
	public int field1951;

	@ObfuscatedName("m.E")
	public int field1952;

	@ObfuscatedName("m.I")
	public int field1956;

	@ObfuscatedName("m.P")
	public int field1963;

	@ObfuscatedName("m.R")
	public int field1965;

	@ObfuscatedName("m.T")
	public int field1967;

	@ObfuscatedName("m.S")
	public static class15 field1966;

	@ObfuscatedName("m.x")
	public byte[] field1945;

	@ObfuscatedName("m.a(I)V")
	public static void method650() {
		class112.field2627 = new class157();
	}

	@ObfuscatedName("m.a(B)V")
	public static void method651() {
		field1939 = null;
		field1924 = null;
		field1927 = null;
		field1966 = null;
		field1957 = null;
		field1942 = null;
		field1931 = null;
		field1949 = null;
	}

	@ObfuscatedName("m.b(I)V")
	public static void method652() {
		try {
			if (class81.field1872 == null) {
				class81.field1872 = new class11(class154.field3516, class52.method402(new class32[] { class44.field1045, class77.field1784, class142.field3248 }).method278());
			} else {
				byte[] var0 = class81.field1872.method63();
				if (var0 != null) {
					class66 var1 = new class66(var0);
					class75.field1758 = var1.method531();
					class97.field2235 = new class102[class75.field1758];
					for (int var2 = 0; var2 < class75.field1758; var2++) {
						class102 var3 = class97.field2235[var2] = new class102();
						int var4 = var1.method531();
						var3.field2396 = var4 & 0x7FFF;
						var3.field2393 = (var4 & 0x8000) != 0;
						var3.field2383 = var1.method555();
						var3.field2390 = var1.method551();
						var3.field2398 = var2;
						var3.field2387 = class20.method136(var3.field2383);
					}
					class50.method394(0, class97.field2235.length - 1, class98.field2264, class154.field3510, class97.field2235);
					class117.field2792 = true;
					class81.field1872 = null;
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			class81.field1872 = null;
		}
	}

	@ObfuscatedName("m.a(IIII)I")
	public static int method653(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg2 >> 7;
		if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
			return 0;
		}
		int var5 = arg0;
		int var6 = arg1 & 0x7F;
		if (arg0 < 3 && (class3.field50[1][var3][var4] & 0x2) == 2) {
			var5 = arg0 + 1;
		}
		int var7 = arg2 & 0x7F;
		int var8 = var6 * class70.field1630[var5][var3 + 1][var4] + class70.field1630[var5][var3][var4] * (128 - var6) >> 7;
		int var9 = class70.field1630[var5][var3][var4 + 1] * (128 - var6) + class70.field1630[var5][var3 + 1][var4 + 1] * var6 >> 7;
		return var8 * (128 - var7) + var9 * var7 >> 7;
	}
}
