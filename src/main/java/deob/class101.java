package deob;

@ObfuscatedName("jc")
public final class class101 extends class136 {

	@ObfuscatedName("jc.H")
	public static final int[] field1832 = new int[32];

	@ObfuscatedName("jc.J")
	public static final class88 field1834 = class208.method1423(105, "auf der Hautpseite)3");

	@ObfuscatedName("jc.O")
	public static final class88 field1839;

	@ObfuscatedName("jc.Q")
	public static int field1841;

	@ObfuscatedName("jc.M")
	public static final class88 field1837;

	@ObfuscatedName("jc.S")
	public static final class88 field1843;

	@ObfuscatedName("jc.N")
	public static class88 field1838;

	@ObfuscatedName("jc.R")
	public static class88 field1842;

	@ObfuscatedName("jc.E")
	public final class145 field1829;

	@ObfuscatedName("jc.P")
	public static long field1840;

	@ObfuscatedName("jc.G")
	public static int[] field1831;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1832[var1] = var0 - 1;
			var0 += var0;
		}
		field1839 = class208.method1423(105, "red:");
		field1841 = 0;
		field1837 = field1839;
		field1843 = class208.method1423(105, "Please wait )2 attempting to reestablish)3");
		field1838 = field1843;
		field1842 = field1839;
	}

	@ObfuscatedName("jc.a(Lnb;BI)[Llj;")
	public static class130[] method700(class144 arg0, int arg1) {
		return class212.method1451(arg1, arg0) ? class190.method1323() : null;
	}

	@ObfuscatedName("jc.a(Li;B)V")
	public static void method701(class88 arg0) {
		if (class88.field1647 == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.method630();
		if (var2 == 0L) {
			return;
		}
		while (var1 < class88.field1647.length && var2 != class88.field1647[var1].field1219) {
			var1++;
		}
		if (class88.field1647.length > var1 && class88.field1647[var1] != null) {
			class146.field2747.method30(49);
			class146.field2747.method328(class88.field1647[var1].field1219);
		}
	}

	@ObfuscatedName("jc.b(II)I")
	public static int method702(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("jc.b(IZ)Laf;")
	public static class7 method704(int arg0) {
		class7 var1 = (class7) class12.field174.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class139.field2578.method939(arg0, 4);
		class7 var3 = new class7();
		if (var2 != null) {
			var3.method38(new class46(var2), arg0);
		}
		class12.field174.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("jc.a(IIJI)Z")
	public static boolean method705(int arg0, long arg1, int arg2) {
		int var4 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		int var5 = (int) arg1 >> 14 & 0x1F;
		int var6 = (int) arg1 >> 20 & 0x3;
		if (var5 == 10 || var5 == 11 || var5 == 22) {
			class148 var7 = class190.method1321(var4);
			int var8;
			int var9;
			if (var6 == 0 || var6 == 2) {
				var8 = var7.field2794;
				var9 = var7.field2774;
			} else {
				var9 = var7.field2794;
				var8 = var7.field2774;
			}
			int var10 = var7.field2781;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			class207.method1421(var8, 0, arg0, arg2, class240.field4456.field4087[0], var9, 0, 2, true, var10, class240.field4456.field4141[0]);
		} else {
			class207.method1421(0, var6, arg0, arg2, class240.field4456.field4087[0], 0, var5 + 1, 2, true, 0, class240.field4456.field4141[0]);
		}
		class155.field2997 = class172.field3339;
		class157.field3017 = 2;
		class147.field2757 = class226.field4239;
		class45.field796 = 0;
		return true;
	}

	public class101(class145 arg0) {
		this.field1829 = arg0;
	}
}
