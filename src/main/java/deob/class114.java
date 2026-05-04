package deob;

@ObfuscatedName("ke")
public final class class114 extends class136 {

	@ObfuscatedName("ke.G")
	public static int field2057 = -1;

	@ObfuscatedName("ke.J")
	public static final class88 field2060 = class208.method1423(105, "RuneScape has been updated(Q");

	@ObfuscatedName("ke.O")
	public static class88 field2064 = field2060;

	@ObfuscatedName("ke.I")
	public static final int[] field2059 = new int[128];

	@ObfuscatedName("ke.S")
	public static volatile int field2068 = 0;

	@ObfuscatedName("ke.E")
	public static final class88 field2055 = class208.method1423(105, "Unable to find ");

	@ObfuscatedName("ke.K")
	public static int field2061 = 0;

	@ObfuscatedName("ke.N")
	public static class88 field2063 = field2055;

	@ObfuscatedName("ke.R")
	public int field2067 = 0;

	@ObfuscatedName("ke.F")
	public static class55 field2056;

	@ObfuscatedName("ke.b(Z)V")
	public static void method776(boolean arg0) {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		if (arg0) {
			method782(-33);
		}
	}

	@ObfuscatedName("ke.a(IJ)V")
	public static void method777(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < class146.field2729; var2++) {
			if (class115.field2086[var2] == arg0) {
				class146.field2729--;
				for (int var3 = var2; var3 < class146.field2729; var3++) {
					class23.field370[var3] = class23.field370[var3 + 1];
					class160.field3092[var3] = class160.field3092[var3 + 1];
					class168.field3238[var3] = class168.field3238[var3 + 1];
					class115.field2086[var3] = class115.field2086[var3 + 1];
					class46.field845[var3] = class46.field845[var3 + 1];
					class59.field1120[var3] = class59.field1120[var3 + 1];
				}
				class20.field313 = class67.field1211;
				class146.field2747.method30(121);
				class146.field2747.method328(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("ke.d(I)V")
	public static void method779() {
		try {
			if (class129.field2414 == null) {
				class129.field2414 = new class3(class126.field2324, class166.method1140(new class88[] { class210.field3983, class170.method1212(class126.field2348), class49.field915 }).method606());
			} else {
				byte[] var0 = class129.field2414.method12();
				if (var0 != null) {
					class46 var1 = new class46(var0);
					class104.field1895 = var1.method301();
					class202.field3845 = new class70[class104.field1895];
					for (int var2 = 0; var2 < class104.field1895; var2++) {
						class70 var3 = class202.field3845[var2] = new class70();
						int var4 = var1.method301();
						var3.field1261 = var4 & 0x7FFF;
						var3.field1257 = (var4 & 0x8000) != 0;
						var3.field1262 = var1.method298();
						var3.field1255 = var1.method334();
						var3.field1258 = var2;
						var3.field1260 = class79.method528(var1.method301());
					}
					class167.method1143(0, class202.field3845, class202.field3845.length - 1);
					class209.field3959 = true;
					class129.field2414 = null;
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			class129.field2414 = null;
		}
	}

	@ObfuscatedName("ke.a(IIIIZIII)V")
	public static void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
			return;
		}
		if (class245.field4497 && (class116.field2098[0][arg6][arg2] & 0x2) == 0) {
			int var7 = arg0;
			if ((class116.field2098[arg0][arg6][arg2] & 0x8) != 0) {
				var7 = 0;
			}
			if (class157.field3026 != var7) {
				return;
			}
		}
		int var8 = arg0;
		if (arg0 < 3 && (class116.field2098[1][arg6][arg2] & 0x2) == 2) {
			var8 = arg0 + 1;
		}
		class148.method989(class166.field3200[arg0], arg6, var8, arg1, arg0, arg2);
		if (arg4 >= 0) {
			class223.method1503(false, arg0, arg5, arg3, false, arg4, var8, class166.field3200[arg0], arg2, arg6);
			return;
		}
	}

	@ObfuscatedName("ke.a(ZI)Z")
	public static boolean method782(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("ke.a(Lea;B)V")
	public void method775(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method778(var2, arg0);
		}
	}

	@ObfuscatedName("ke.a(ILea;I)V")
	public void method778(int arg0, class46 arg1) {
		if (arg0 == 2) {
			this.field2067 = arg1.method301();
		}
	}
}
