package deob;

@ObfuscatedName("v")
public final class class229 extends class136 {

	@ObfuscatedName("v.E")
	public static int field4284 = 0;

	@ObfuscatedName("v.F")
	public static final int[] field4285 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("v.G")
	public static final class88 field4286 = class208.method1423(105, "Lade Texturen )2 ");

	@ObfuscatedName("v.J")
	public int field4288 = 0;

	@ObfuscatedName("v.b(II)Z")
	public static boolean method1526(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("v.a(IBIIII)V")
	public static void method1529(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg1 - arg3;
		if (var5 == 0) {
			if (var6 != 0) {
				class86.method580(arg4, arg1, arg3, arg0);
			}
		} else if (var6 == 0) {
			class90.method659(arg2, arg3, arg4, arg0);
		} else {
			int var7 = (var6 << 12) / var5;
			int var8 = arg3 - (var7 * arg0 >> 12);
			int var9;
			int var10;
			if (class67.field1207 > arg2) {
				var9 = class67.field1207;
				var10 = (class67.field1207 * var7 >> 12) + var8;
			} else if (arg2 > class12.field183) {
				var9 = class12.field183;
				var10 = var8 + (class12.field183 * var7 >> 12);
			} else {
				var9 = arg2;
				var10 = arg1;
			}
			if (class49.field919 > var10) {
				var10 = class49.field919;
				var9 = (class49.field919 - var8 << 12) / var7;
			} else if (var10 > class18.field279) {
				var10 = class18.field279;
				var9 = (class18.field279 - var8 << 12) / var7;
			}
			int var11;
			int var12;
			if (class67.field1207 > arg0) {
				var11 = class67.field1207;
				var12 = (class67.field1207 * var7 >> 12) + var8;
			} else if (class12.field183 < arg0) {
				var11 = class12.field183;
				var12 = (var7 * class12.field183 >> 12) + var8;
			} else {
				var11 = arg0;
				var12 = arg3;
			}
			if (var12 < class49.field919) {
				var12 = class49.field919;
				var11 = (class49.field919 - var8 << 12) / var7;
			} else if (class18.field279 < var12) {
				var12 = class18.field279;
				var11 = (class18.field279 - var8 << 12) / var7;
			}
			class105.method723(var11, var10, arg4, var12, var9);
		}
	}

	@ObfuscatedName("v.a(ILea;B)V")
	public void method1527(int arg0, class46 arg1) {
		if (arg0 == 5) {
			this.field4288 = arg1.method301();
		}
	}

	@ObfuscatedName("v.a(ZLea;)V")
	public void method1528(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1527(var2, arg0);
		}
	}
}
