package deob;

@ObfuscatedName("kh")
public final class class117 extends class136 {

	@ObfuscatedName("kh.ab")
	public int[] field2130;

	@ObfuscatedName("kh.H")
	public static final class88 field2112 = class208.method1423(105, " has logged out)3");

	@ObfuscatedName("kh.I")
	public static int field2113 = 0;

	@ObfuscatedName("kh.M")
	public static int field2117 = 0;

	@ObfuscatedName("kh.J")
	public static final class88 field2114 = class208.method1423(105, "Benutzen Sie die (WPasswort -=ndern(W Option");

	@ObfuscatedName("kh.P")
	public static final class88 field2120 = class208.method1423(105, "Sorry invited players only)3");

	@ObfuscatedName("kh.S")
	public static class88 field2123 = field2112;

	@ObfuscatedName("kh.G")
	public static class88 field2111 = field2120;

	@ObfuscatedName("kh.X")
	public static int field2127 = 0;

	@ObfuscatedName("kh.U")
	public static class179 field2124;

	@ObfuscatedName("kh.Y")
	public class88 field2128;

	@ObfuscatedName("kh.L")
	public int[] field2116;

	@ObfuscatedName("kh.O")
	public int[] field2119;

	@ObfuscatedName("kh.Q")
	public int[] field2121;

	@ObfuscatedName("kh.D")
	public static short[] field2108;

	@ObfuscatedName("kh.W")
	public static byte[][][] field2126;

	@ObfuscatedName("kh.b(II)I")
	public static int method791(int arg0, int arg1) {
		int var2 = arg1 * (arg0 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("kh.d(II)V")
	public static void method795() {
		class242.field4480 = -1;
		class11.field159 = 0;
		class172.field3343 = 2;
		class158.field3039 = null;
		class17.field277 = false;
		class122.field2230 = 1;
		class228.field4268 = -1;
	}

	@ObfuscatedName("kh.c(II)I")
	public int method792(int arg0) {
		if (this.field2121 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field2121.length; var2++) {
			if (this.field2130[var2] == arg0) {
				return this.field2121[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.a(ILea;B)V")
	public void method793(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field2128 = arg1.method298();
		} else if (arg0 == 2) {
			int var3 = arg1.method347();
			this.field2119 = new int[var3];
			this.field2116 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2116[var4] = arg1.method301();
				int var5 = arg1.method347();
				if (var5 == 0) {
					this.field2119[var4] = -1;
				} else {
					this.field2119[var4] = var5;
				}
			}
		} else if (arg0 == 3) {
			int var6 = arg1.method347();
			this.field2130 = new int[var6];
			this.field2121 = new int[var6];
			for (int var7 = 0; var7 < var6; var7++) {
				this.field2121[var7] = arg1.method301();
				int var8 = arg1.method347();
				if (var8 == 0) {
					this.field2130[var7] = -1;
				} else {
					this.field2130[var7] = var8;
				}
			}
		}
	}

	@ObfuscatedName("kh.a(BLea;)V")
	public void method794(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method793(var2, arg0);
		}
	}

	@ObfuscatedName("kh.e(II)I")
	public int method796(int arg0) {
		if (this.field2116 == null) {
			return -1;
		}
		for (int var2 = 0; var2 < this.field2116.length; var2++) {
			if (this.field2119[var2] == arg0) {
				return this.field2116[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("kh.b(Z)V")
	public void method797() {
		if (this.field2121 != null) {
			for (int var1 = 0; var1 < this.field2121.length; var1++) {
				this.field2121[var1] |= 0x8000;
			}
		}
		if (this.field2116 != null) {
			for (int var2 = 0; var2 < this.field2116.length; var2++) {
				this.field2116[var2] |= 0x8000;
			}
		}
	}
}
