package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("uc")
public final class class221 {

	@ObfuscatedName("uc.a")
	public static int field4167;

	@ObfuscatedName("uc.b")
	public static final class88 field4168 = class208.method1423(105, "Drop");

	@ObfuscatedName("uc.c")
	public static int[] field4169;

	@ObfuscatedName("uc.e")
	public static class88 field4171 = field4168;

	@ObfuscatedName("uc.g")
	public static int[] field4173;

	@ObfuscatedName("uc.h")
	public static int[] field4174;

	@ObfuscatedName("uc.i")
	public static short field4175 = 256;

	@ObfuscatedName("uc.a(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1488(String arg0, Throwable arg1) {
		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = class175.method1256(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg0;
			}
			System.out.println("Error: " + var2);
			String var3 = var2.replace(':', '.');
			String var4 = var3.replace('@', '_');
			String var5 = var4.replace('&', '_');
			String var6 = var5.replace('#', '_');
			if (class6.field93.field3597 != null) {
				class163 var7 = class6.field93.method1293(new URL(class6.field93.field3597.getCodeBase(), "clienterror.ws?c=" + class225.field4226 + "&u=" + class36.field631 + "&v1=" + class181.field3594 + "&v2=" + class181.field3591 + "&e=" + var6));
				while (var7.field3134 == 0) {
					class21.method98(1L);
				}
				if (var7.field3134 == 1) {
					DataInputStream var8 = (DataInputStream) var7.field3129;
					var8.read();
					var8.close();
				}
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("uc.a(II)Z")
	public static boolean method1489(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("uc.a(Li;Li;BLnb;)Lrc;")
	public static class188 method1490(class88 arg0, class88 arg1, class144 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return class234.method1558(arg2, var3, var4);
	}

	@ObfuscatedName("uc.a(Li;Z)Li;")
	public static class88 method1492(class88 arg0) {
		class244 var1 = class33.method207(arg0);
		return var1 == null ? class59.field1113 : var1.field4486;
	}

	@ObfuscatedName("uc.b(I)V")
	public static void method1493() {
		class88.field1640.method1161(0, 0);
		class105.field1901.method1161(382, 0);
		class208.field3946.method876(382 - class208.field3946.field2434 / 2, 18);
	}
}
