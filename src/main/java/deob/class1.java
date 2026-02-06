package deob;

@ObfuscatedName("a")
public final class class1 {

	@ObfuscatedName("a.a")
	public static class32 field1 = class73.method593(" )2> ", true);

	@ObfuscatedName("a.b")
	public static class49[] field2;

	@ObfuscatedName("a.c")
	public static volatile boolean field3 = true;

	@ObfuscatedName("a.d")
	public static class32 field4 = class73.method593("Hierhin gehen", true);

	@ObfuscatedName("a.f")
	public static class44 field6;

	@ObfuscatedName("a.g")
	public static class32 field7 = class73.method593("Ung-Ultige Session)2ID)3", true);

	@ObfuscatedName("a.h")
	public static int field8 = 0;

	@ObfuscatedName("a.j")
	public static class32 field10 = class73.method593("Please wait 5 minutes before trying again)3", true);

	@ObfuscatedName("a.k")
	public static int field11 = 0;

	@ObfuscatedName("a.l")
	public static class32 field12 = field10;

	@ObfuscatedName("a.n")
	public static class32 field14 = class73.method593("(U(Y", true);

	@ObfuscatedName("a.a(I)[Lh;")
	public static class49[] method1() {
		class49[] var0 = new class49[class92.field2110];
		for (int var1 = 0; var1 < class92.field2110; var1++) {
			class49 var2 = var0[var1] = new class49();
			var2.field1138 = class152.field3506;
			var2.field1140 = class128.field2965;
			var2.field1139 = class70.field1638[var1];
			var2.field1143 = class74.field1746[var1];
			var2.field1141 = class126.field2925[var1];
			var2.field1142 = class34.field719[var1];
			int var3 = var2.field1142 * var2.field1141;
			byte[] var4 = class147.field3344[var1];
			var2.field1144 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				var2.field1144[var5] = class31.field616[var4[var5] & 0xFF];
			}
		}
		class70.method579();
		return var0;
	}

	@ObfuscatedName("a.a(III)V")
	public static void method2(int arg0, int arg1) {
		if (class4.field72 != 0 && class4.field72 != 3 || class79.field1826 != 1) {
			return;
		}
		int var2 = class9.field166 - arg0 - 25;
		int var3 = class66.field1589 - arg1 - 5;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = class133.field3054 + class27.field493 & 0x7FF;
		int var5 = class7.field113[var4];
		int var6 = (class29.field527 + 256) * var5 >> 8;
		int var7 = class7.field121[var4];
		int var8 = (class29.field527 + 256) * var7 >> 8;
		int var9 = var3 * var8 - var2 * var6 >> 11;
		int var10 = var6 * var3 + var2 * var8 >> 11;
		int var11 = class20.field373.field2698 - var9 >> 7;
		int var12 = class20.field373.field2747 + var10 >> 7;
		boolean var13 = class94.method747(true, 0, class20.field373.field2736[0], 0, 0, var12, class20.field373.field2759[0], 0, var11, 0, 1);
		if (!var13) {
			return;
		}
		class44.field1026.method514(var2);
		class44.field1026.method514(var3);
		class44.field1026.method513(class133.field3054);
		class44.field1026.method514(57);
		class44.field1026.method514(class27.field493);
		class44.field1026.method514(class29.field527);
		class44.field1026.method514(89);
		class44.field1026.method513(class20.field373.field2747);
		class44.field1026.method513(class20.field373.field2698);
		class44.field1026.method514(class57.field1327);
		class44.field1026.method514(63);
		return;
	}

	@ObfuscatedName("a.b(I)V")
	public static void method3() {
		field10 = null;
		field7 = null;
		field14 = null;
		field4 = null;
		field12 = null;
		field1 = null;
		field6 = null;
		field2 = null;
	}

	@ObfuscatedName("a.a(IIZLea;)Lhb;")
	public static class51 method4(int arg0, int arg1, class30 arg2) {
		return class28.method193(arg1, arg2, arg0) ? class94.method741() : null;
	}
}
