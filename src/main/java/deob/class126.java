package deob;

import java.awt.Component;

@ObfuscatedName("sa")
public final class class126 {

	@ObfuscatedName("sa.a")
	public static volatile int field2915 = -1;

	@ObfuscatedName("sa.b")
	public class32[] field2916;

	@ObfuscatedName("sa.c")
	public int[] field2917;

	@ObfuscatedName("sa.d")
	public static class151 field2918 = new class151();

	@ObfuscatedName("sa.f")
	public int field2920 = -1;

	@ObfuscatedName("sa.g")
	public class143 field2921;

	@ObfuscatedName("sa.h")
	public static class63 field2922 = new class63(50);

	@ObfuscatedName("sa.i")
	public static int[] field2923 = new int[50];

	@ObfuscatedName("sa.j")
	public static class32 field2924 = null;

	@ObfuscatedName("sa.k")
	public static int[] field2925;

	@ObfuscatedName("sa.l")
	public static boolean field2926;

	@ObfuscatedName("sa.m")
	public static class32 field2927 = class73.method593("huffman", true);

	@ObfuscatedName("sa.n")
	public static int field2928;

	@ObfuscatedName("sa.p")
	public static int field2930 = -1;

	@ObfuscatedName("sa.a(ZBBIILga;I)V")
	public static void method985(boolean arg0, byte arg1, int arg2, int arg3, class44 arg4, int arg5) {
		long var6 = (long) (arg2 + (arg3 << 16));
		class110 var8 = (class110) class97.field2212.method1196(var6);
		if (var8 != null) {
			return;
		}
		class110 var9 = (class110) class112.field2616.method1196(var6);
		if (var9 != null) {
			return;
		}
		class110 var10 = (class110) class132.field3029.method1196(var6);
		if (var10 == null) {
			if (!arg0) {
				class110 var11 = (class110) class31.field593.method1196(var6);
				if (var11 != null) {
					return;
				}
			}
			class110 var12 = new class110();
			var12.field2587 = arg1;
			var12.field2589 = arg4;
			var12.field2578 = arg5;
			if (arg0) {
				class97.field2212.method1201(var6, var12);
				class158.field3627++;
			} else {
				field2918.method1171(var12);
				class132.field3029.method1201(var6, var12);
				class33.field697++;
			}
		} else if (arg0) {
			var10.method68();
			class97.field2212.method1201(var6, var10);
			class158.field3627++;
			class33.field697--;
		}
	}

	@ObfuscatedName("sa.a(Ljava/awt/Component;I)V")
	public static void method987(Component arg0) {
		arg0.removeMouseListener(class38.field909);
		arg0.removeMouseMotionListener(class38.field909);
		arg0.removeFocusListener(class38.field909);
		class82.field1917 = 0;
	}
}
