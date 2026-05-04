package deob;

@ObfuscatedName("li")
public final class class129 extends class136 {

	@ObfuscatedName("li.H")
	public static final class88 field2417 = class208.method1423(105, "Sprites geladen)3");

	@ObfuscatedName("li.J")
	public static final class88 field2419 = class208.method1423(105, "Spieler");

	@ObfuscatedName("li.S")
	public static final class88 field2427 = class208.method1423(105, "Select a world");

	@ObfuscatedName("li.Q")
	public static class88 field2425 = field2427;

	@ObfuscatedName("li.L")
	public final class197[] field2421;

	@ObfuscatedName("li.P")
	public static int field2424;

	@ObfuscatedName("li.G")
	public static class130 field2416;

	@ObfuscatedName("li.M")
	public static class144 field2422;

	@ObfuscatedName("li.R")
	public static class174 field2426;

	@ObfuscatedName("li.E")
	public static class3 field2414;

	@ObfuscatedName("li.b(II)I")
	public static int method872(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("li.a(IIIII)V")
	public static void method874(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < class206.field3923; var4++) {
			if (class133.field2485[var4] + class81.field1455[var4] > arg0 && class81.field1455[var4] < arg2 + arg0 && class132.field2471[var4] + class80.field1447[var4] > arg3 && arg1 + arg3 > class132.field2471[var4]) {
				class211.field4005[var4] = true;
			}
		}
	}

	public class129(class144 arg0, class144 arg1, int arg2, boolean arg3) {
		class248 var5 = new class248();
		int var6 = arg0.method942(arg2);
		this.field2421 = new class197[var6];
		int[] var7 = arg0.method948(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.method939(var7[var8], arg2);
			int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
			class78 var11 = null;
			for (class78 var12 = (class78) var5.method1610(); var12 != null; var12 = (class78) var5.method1619()) {
				if (var10 == var12.field1412) {
					var11 = var12;
					break;
				}
			}
			if (var11 == null) {
				byte[] var13 = arg1.method947(0, var10);
				var11 = new class78(var10, var13);
				var5.method1622(var11);
			}
			this.field2421[var7[var8]] = new class197(var9, var11);
		}
	}

	@ObfuscatedName("li.a(ZI)Z")
	public boolean method875(int arg0) {
		return this.field2421[arg0].field3777;
	}
}
