package deob;

@ObfuscatedName("nh")
public final class class150 {

	@ObfuscatedName("nh.a")
	public static final class88 field2909 = class208.method1423(105, "Ung-Ultiger Benutzername");

	@ObfuscatedName("nh.b")
	public static int field2910;

	@ObfuscatedName("nh.c")
	public static int field2911;

	@ObfuscatedName("nh.d")
	public static int field2912 = -1;

	@ObfuscatedName("nh.g")
	public static double field2915;

	@ObfuscatedName("nh.h")
	public static int field2916 = 0;

	@ObfuscatedName("nh.i")
	public static final class88 field2917 = class208.method1423(105, "Create a free account");

	@ObfuscatedName("nh.j")
	public static final class88 field2918 = class208.method1423(105, "Cabbage");

	@ObfuscatedName("nh.l")
	public static int[] field2920;

	@ObfuscatedName("nh.m")
	public static class88 field2921 = field2917;

	@ObfuscatedName("nh.a(IIIIILu;I)V")
	public static void method1027(int arg0, int arg1, int arg2, class218 arg3) {
		class97.method681(arg1, arg2, arg3.field4136, arg0, arg3.field4121);
	}

	@ObfuscatedName("nh.a(IIIZII)V")
	public static void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 > class18.field279 || class49.field919 > arg0) {
			return;
		}
		boolean var5;
		if (class67.field1207 > arg2) {
			var5 = false;
			arg2 = class67.field1207;
		} else if (class12.field183 >= arg2) {
			var5 = true;
		} else {
			arg2 = class12.field183;
			var5 = false;
		}
		boolean var6;
		if (arg4 < class67.field1207) {
			arg4 = class67.field1207;
			var6 = false;
		} else if (class12.field183 >= arg4) {
			var6 = true;
		} else {
			arg4 = class12.field183;
			var6 = false;
		}
		if (arg3 >= class49.field919) {
			class230.method1534(arg2, arg1, arg4, class3.field42[arg3++]);
		} else {
			arg3 = class49.field919;
		}
		if (arg0 <= class18.field279) {
			class230.method1534(arg2, arg1, arg4, class3.field42[arg0--]);
		} else {
			arg0 = class18.field279;
		}
		if (var5 && var6) {
			for (int var9 = arg3; var9 <= arg0; var9++) {
				int[] var10 = class3.field42[var9];
				var10[arg2] = var10[arg4] = arg1;
			}
			return;
		}
		if (var5) {
			for (int var7 = arg3; var7 <= arg0; var7++) {
				class3.field42[var7][arg2] = arg1;
			}
			return;
		}
		if (var6) {
			for (int var8 = arg3; var8 <= arg0; var8++) {
				class3.field42[var8][arg4] = arg1;
			}
			return;
		}
	}

	@ObfuscatedName("nh.a([BI)V")
	public static void method1029(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - class16.field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - class119.field2181;
				if (var2 > 0 && var3 > 0 && class109.field1988 > var2 + 64 && class44.field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = class44.field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (class7.field105[var4][var5] == null) {
									class7.field105[var4][var5] = new byte[4096];
								}
								class7.field105[var4][var5][var6 + (-(var7 + 1) << 6)] = var8;
								byte var9 = arg0[var1++];
								if (class97.field1786[var4][var5] == null) {
									class97.field1786[var4][var5] = new byte[4096];
								}
								class97.field1786[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
							}
						}
					}
				} else {
					for (int var10 = -4096; var10 < 0; var10++) {
						byte var11 = arg0[var1++];
						if (var11 != 0) {
							var1++;
						}
					}
				}
			}
			return;
		}
	}
}
