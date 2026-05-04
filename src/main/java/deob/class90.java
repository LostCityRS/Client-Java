package deob;

@ObfuscatedName("ib")
public final class class90 extends class67 {

	@ObfuscatedName("ib.v")
	public int field1701;

	@ObfuscatedName("ib.w")
	public class22 field1702;

	@ObfuscatedName("ib.D")
	public static final class88 field1709 = class208.method1423(105, "Standort");

	@ObfuscatedName("ib.E")
	public static final int[] field1710 = new int[99];

	@ObfuscatedName("ib.C")
	public static int field1708 = 0;

	@ObfuscatedName("ib.I")
	public static int field1714 = -1;

	@ObfuscatedName("ib.y")
	public static class144 field1704;

	@ObfuscatedName("ib.A")
	public static class174 field1706;

	@ObfuscatedName("ib.H")
	public class222 field1713;

	@ObfuscatedName("ib.B")
	public static boolean field1707;

	@ObfuscatedName("ib.z")
	public byte[] field1705;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1710[var1] = var0 / 4;
		}
	}

	@ObfuscatedName("ib.a(III)V")
	public static void method656(int arg0, int arg1) {
		int[] var2 = new int[4];
		int var3 = 1;
		int[] var4 = new int[4];
		var4[0] = arg0;
		var2[0] = arg1;
		for (int var5 = 0; var5 < 4; var5++) {
			if (arg0 != class27.field461[var5]) {
				var4[var3] = class27.field461[var5];
				var2[var3] = class89.field1686[var5];
				var3++;
			}
		}
		class89.field1686 = var2;
		class27.field461 = var4;
		class167.method1143(0, class202.field3845, class202.field3845.length - 1);
	}

	@ObfuscatedName("ib.a([BB)V")
	public static void method658(byte[] arg0) {
		class46 var1 = new class46(arg0);
		int var2 = var1.method301();
		for (int var3 = 0; var3 < var2; var3++) {
			class244 var4 = new class244();
			class88 var5 = var1.method298();
			var4.field4483 = var1.method301();
			var4.field4485 = var1.method301();
			var4.field4492 = var1.method347();
			var4.field4486 = var5.method626();
			var4.field4490 = var5.method600(47);
			class159.field3049.method1622(var4);
		}
	}

	@ObfuscatedName("ib.a(IIIII)V")
	public static void method659(int arg0, int arg1, int arg2, int arg3) {
		if (class49.field919 <= arg1 && arg1 <= class18.field279) {
			int var4 = class156.method1058(class67.field1207, class12.field183, arg3);
			int var5 = class156.method1058(class67.field1207, class12.field183, arg0);
			class46.method310(arg1, var5, var4, arg2);
		}
	}
}
