package deob;

import java.io.DataInputStream;
import java.net.URL;

@ObfuscatedName("pf")
public final class class110 extends class13 {

	@ObfuscatedName("pf.L")
	public static int field2580 = 0;

	@ObfuscatedName("pf.U")
	public static class32 field2588 = class73.method593("Bitte wenden Sie sich an den Kundendienst)3", true);

	@ObfuscatedName("pf.I")
	public static int field2577 = 0;

	@ObfuscatedName("pf.K")
	public static class32 field2579 = class73.method593("Update)2Liste geladen)3", true);

	@ObfuscatedName("pf.M")
	public static int[] field2581 = new int[5];

	@ObfuscatedName("pf.R")
	public static class32 field2586 = class73.method593("<br>(X100(U(Y", true);

	@ObfuscatedName("pf.T")
	public byte field2587;

	@ObfuscatedName("pf.J")
	public int field2578;

	@ObfuscatedName("pf.Q")
	public static int field2585;

	@ObfuscatedName("pf.V")
	public class44 field2589;

	@ObfuscatedName("pf.a(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method870(Throwable arg0, String arg1) {
		try {
			String var2 = "";
			if (arg0 != null) {
				var2 = class68.method571(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg1;
			}
			System.out.println("Error: " + var2);
			String var3 = var2.replace(':', '.');
			String var4 = var3.replace('@', '_');
			String var5 = var4.replace('&', '_');
			String var6 = var5.replace('#', '_');
			if (class86.field2010.field458 != null) {
				class18 var7 = class86.field2010.method178(new URL(class86.field2010.field458.getCodeBase(), "clienterror.ws?c=" + class117.field2812 + "&u=" + class98.field2259 + "&v1=" + class25.field464 + "&v2=" + class25.field457 + "&e=" + var6));
				while (var7.field355 == 0) {
					class54.method426(1L);
				}
				if (var7.field355 == 1) {
					DataInputStream var8 = (DataInputStream) var7.field352;
					var8.read();
					var8.close();
				}
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("pf.e(I)V")
	public static void method871() {
		class44.field1026.method356(113);
		for (class144 var0 = (class144) class109.field2571.method1203(); var0 != null; var0 = (class144) class109.field2571.method1199()) {
			if (var0.field3291 == 0 || var0.field3291 == 3) {
				class134.method1021(true, var0);
			}
		}
		if (class50.field1158 != null) {
			class132.method1008(class50.field1158);
			class50.field1158 = null;
		}
	}

	@ObfuscatedName("pf.b(Z)V")
	public static void method872() {
		class97.field2230 = 0;
		int var0 = (class20.field373.field2747 >> 7) + class72.field1700;
		int var1 = (class20.field373.field2698 >> 7) + class118.field2836;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			class97.field2230 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			class97.field2230 = 1;
		}
		if (class97.field2230 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			class97.field2230 = 0;
		}
	}
}
