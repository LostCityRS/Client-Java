package deob;

import java.util.zip.CRC32;

@ObfuscatedName("da")
public final class class23 extends class146 {

	@ObfuscatedName("da.r")
	public static class157[][][] field397 = new class157[4][104][104];

	@ObfuscatedName("da.s")
	public int field398;

	@ObfuscatedName("da.v")
	public int field401;

	@ObfuscatedName("da.w")
	public static class32 field402 = class73.method593("<col=ffb000>", true);

	@ObfuscatedName("da.x")
	public static class32 field403 = class73.method593("(Y", true);

	@ObfuscatedName("da.J")
	public static CRC32 field415 = new CRC32();

	@ObfuscatedName("da.R")
	public static class32 field422 = class73.method593("mapscene", true);

	@ObfuscatedName("da.S")
	public static int field423 = 0;

	@ObfuscatedName("da.L")
	public static class32 field417 = class73.method593("Hier wechseln", true);

	@ObfuscatedName("da.M")
	public static boolean field418 = false;

	@ObfuscatedName("da.K")
	public static boolean field416 = false;

	@ObfuscatedName("da.T")
	public static class32 field424 = class73.method593("To create a new account you need to", true);

	@ObfuscatedName("da.Q")
	public static class32 field421 = field424;

	@ObfuscatedName("da.G")
	public int field412 = 0;

	@ObfuscatedName("da.F")
	public int field411 = -1;

	@ObfuscatedName("da.y")
	public int field404;

	@ObfuscatedName("da.z")
	public int field405;

	@ObfuscatedName("da.A")
	public int field406;

	@ObfuscatedName("da.C")
	public int field408;

	@ObfuscatedName("da.E")
	public int field410;

	@ObfuscatedName("da.H")
	public int field413;

	@ObfuscatedName("da.I")
	public int field414;

	@ObfuscatedName("da.P")
	public int field420;

	@ObfuscatedName("da.a(IJ)V")
	public static void method164(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class106.field2504 >= 100) {
			class79.method628(class107.field2545, 0, class77.field1786);
			return;
		}
		class32 var2 = class9.method59(arg0).method264();
		for (int var3 = 0; var3 < class106.field2504; var3++) {
			if (class103.field2407[var3] == arg0) {
				class79.method628(class52.method402(new class32[] { var2, class4.field59 }), 0, class77.field1786);
				return;
			}
		}
		for (int var4 = 0; var4 < class2.field20; var4++) {
			if (class33.field694[var4] == arg0) {
				class79.method628(class52.method402(new class32[] { class5.field95, var2, class94.field2178 }), 0, class77.field1786);
				return;
			}
		}
		if (var2.method272(class20.field373.field1659)) {
			class79.method628(class43.field1009, 0, class77.field1786);
			return;
		}
		class103.field2407[class106.field2504] = arg0;
		class71.field1685[class106.field2504++] = class9.method59(arg0);
		class2.field26 = class115.field2767;
		class44.field1026.method356(38);
		class44.field1026.method541(arg0);
	}

	@ObfuscatedName("da.a(BLlf;)V")
	public static void method165(class82 arg0) {
		if (class117.field2792) {
			class119.method936(arg0);
			return;
		}
		if (class79.field1826 == 1 && class9.field166 >= 715 && class66.field1589 >= 453) {
			class30.field551 = !class30.field551;
			if (class30.field551) {
				class68.method565();
			} else {
				class102.method823(class74.field1748, class124.field2887, class73.field1712);
			}
		}
		if (class134.field3114 == 5) {
			return;
		}
		class66.field1570++;
		if (class134.field3114 != 10) {
			return;
		}
		if (class107.field2532 != 2 && class20.field371 == 0) {
			if (class79.field1826 == 1 && class9.field166 >= 5 && class9.field166 <= 105 && class66.field1589 >= 463 && class66.field1589 <= 498) {
				class83.method652();
				return;
			}
			if (class81.field1872 != null) {
				class83.method652();
			}
		}
		int var1 = class79.field1826;
		int var2 = class66.field1589;
		int var3 = class9.field166;
		if (class11.field189 == 0) {
			if (var1 == 1 && var3 >= 227 && var3 <= 377 && var2 >= 271 && var2 <= 311) {
				class135.field3134 = 0;
				class11.field189 = 3;
			}
			if (var1 == 1 && var3 >= 387 && var3 <= 537 && var2 >= 271 && var2 <= 311) {
				class74.field1754 = class133.field3090;
				class74.field1740 = class133.field3065;
				class135.field3134 = 0;
				class74.field1742 = class77.field1787;
				class11.field189 = 2;
				return;
			}
		} else if (class11.field189 == 2) {
			short var4 = 231;
			int var7 = var4 + 30;
			if (var1 == 1 && var2 >= 246 && var2 < 261) {
				class135.field3134 = 0;
			}
			var7 += 15;
			if (var1 == 1 && var2 >= 261 && var2 < 276) {
				class135.field3134 = 1;
			}
			var7 += 15;
			if (var1 == 1 && var3 >= 227 && var3 <= 377 && var2 >= 301 && var2 <= 341) {
				class74.field1751 = class74.field1751.method244().method264();
				if (class74.field1751.method240() == 0) {
					class114.method891(class133.field3094, class133.field3037, class37.field892);
					return;
				}
				if (class74.field1738.method240() == 0) {
					class114.method891(class133.field3083, class133.field3095, class136.field3168);
					return;
				}
				class114.method891(class133.field3051, class133.field3077, class105.field2487);
				class54.method425(20);
				return;
			}
			if (var1 == 1 && var3 >= 387 && var3 <= 537 && var2 >= 301 && var2 <= 341) {
				class74.field1738 = class74.field1748;
				class11.field189 = 0;
				class74.field1751 = class74.field1748;
			}
			while (true) {
				while (class145.method1089()) {
					boolean var5 = false;
					for (int var6 = 0; class91.field2083.method240() > var6; var6++) {
						if (class109.field2562 == class91.field2083.method260(var6)) {
							var5 = true;
							break;
						}
					}
					if (class135.field3134 == 0) {
						if (class13.field224 == 85 && class74.field1751.method240() > 0) {
							class74.field1751 = class74.field1751.method241(0, class74.field1751.method240() - 1);
						}
						if (class13.field224 == 84 || class13.field224 == 80) {
							class135.field3134 = 1;
						}
						if (var5 && class74.field1751.method240() < 12) {
							class74.field1751 = class74.field1751.method277(class109.field2562);
						}
					} else if (class135.field3134 == 1) {
						if (class13.field224 == 85 && class74.field1738.method240() > 0) {
							class74.field1738 = class74.field1738.method241(0, class74.field1738.method240() - 1);
						}
						if (class13.field224 == 84 || class13.field224 == 80) {
							class135.field3134 = 0;
						}
						if (class70.field1646 == 2 && class13.field224 == 84) {
							class74.field1751 = class74.field1751.method244().method264();
							if (class74.field1751.method240() == 0) {
								class114.method891(class133.field3094, class133.field3037, class37.field892);
								return;
							}
							if (class74.field1738.method240() == 0) {
								class114.method891(class133.field3083, class133.field3095, class136.field3168);
								return;
							}
							class114.method891(class133.field3051, class133.field3077, class105.field2487);
							class54.method425(20);
							return;
						}
						if (var5 && class74.field1738.method240() < 20) {
							class74.field1738 = class74.field1738.method277(class109.field2562);
						}
					}
				}
				return;
			}
		} else if (class11.field189 == 3 && var1 == 1 && var3 >= 307 && var3 <= 457 && var2 >= 301 && var2 <= 341) {
			class11.field189 = 0;
			return;
		}
	}

	@ObfuscatedName("da.a(BI)Z")
	public static boolean method166(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("da.a(B)V")
	public static void method167() {
		if (!class136.field3170) {
			return;
		}
		class43.field998 = null;
		class156.field3556 = null;
		class74.field1752 = null;
		class41.field958 = null;
		class156.field3565 = null;
		class45.field1052 = null;
		class80.field1851 = null;
		class70.field1651 = null;
		class3.field44 = null;
		class100.field2320 = null;
		class98.field2262 = null;
		class4.field71 = null;
		class124.field2890 = null;
		class133.field3086 = null;
		class94.field2169 = null;
		class5.field99 = null;
		class14.field237 = null;
		class63.field1442 = null;
		class9.field160 = null;
		class54.field1264 = null;
		class152.method1176();
		class94.method740(true);
		class136.field3170 = false;
	}

	@ObfuscatedName("da.a(III)I")
	public static int method168(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = arg0 & 0x1 | var2 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}
}
