package deob;

@ObfuscatedName("se")
public final class class130 extends class13 {

	@ObfuscatedName("se.ab")
	public int field3002;

	@ObfuscatedName("se.cb")
	public static int field3004 = 1;

	@ObfuscatedName("se.db")
	public int field3005;

	@ObfuscatedName("se.eb")
	public static class32 field3006 = class73.method593("Ausw-=hlen", true);

	@ObfuscatedName("se.fb")
	public static class33 field3007;

	@ObfuscatedName("se.gb")
	public static class32 field3008 = class73.method593("as it was used to break our rules)3", true);

	@ObfuscatedName("se.bb")
	public static class32 field3003 = field3008;

	@ObfuscatedName("se.O")
	public static class66 field2990 = new class66(new byte[5000]);

	@ObfuscatedName("se.V")
	public static class32 field2997 = class73.method593("<col=ffffff>", true);

	@ObfuscatedName("se.W")
	public static class32 field2998 = class73.method593("RuneScape wurde aktualisiert(Q", true);

	@ObfuscatedName("se.Z")
	public static int field3001 = -1;

	@ObfuscatedName("se.T")
	public static class32 field2995 = class73.method593("purple:", true);

	@ObfuscatedName("se.Y")
	public static class32 field3000 = field2995;

	@ObfuscatedName("se.S")
	public static class32 field2994 = field2995;

	@ObfuscatedName("se.I")
	public class32 field2984 = class132.field3035;

	@ObfuscatedName("se.P")
	public int field2991 = 0;

	@ObfuscatedName("se.U")
	public int field2996;

	@ObfuscatedName("se.J")
	public int[] field2985;

	@ObfuscatedName("se.M")
	public int[] field2988;

	@ObfuscatedName("se.N")
	public class32[] field2989;

	@ObfuscatedName("se.a(IIB)Lf;")
	public static class36 method1000(int arg0, int arg1) {
		class36 var2 = class128.method991(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.field754 == null || var2.field754.length <= arg0) {
			return null;
		} else {
			return var2.field754[arg0];
		}
	}

	@ObfuscatedName("se.a(IZLtb;Lga;)V")
	public static void method1002(int arg0, class134 arg1, class44 arg2) {
		class142 var3 = new class142();
		var3.field3324 = arg0;
		var3.field3254 = arg2;
		var3.field3243 = 1;
		var3.field3245 = arg1;
		class157 var4 = class2.field18;
		synchronized (class2.field18) {
			class2.field18.method1214(var3);
		}
		class111.method875();
	}

	@ObfuscatedName("se.a(Ljd;I)V")
	public void method999(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method1003(var2, arg0);
		}
	}

	@ObfuscatedName("se.a(IILjd;)V")
	public void method1003(int arg0, class66 arg1) {
		if (arg0 == 1) {
			this.field3005 = arg1.method532();
		} else if (arg0 == 2) {
			this.field3002 = arg1.method532();
		} else if (arg0 == 3) {
			this.field2984 = arg1.method555();
		} else if (arg0 == 4) {
			this.field2996 = arg1.method538();
		} else if (arg0 == 5) {
			this.field2991 = arg1.method531();
			this.field2989 = new class32[this.field2991];
			this.field2985 = new int[this.field2991];
			for (int var3 = 0; var3 < this.field2991; var3++) {
				this.field2985[var3] = arg1.method538();
				this.field2989[var3] = arg1.method555();
			}
		} else if (arg0 == 6) {
			this.field2991 = arg1.method531();
			this.field2988 = new int[this.field2991];
			this.field2985 = new int[this.field2991];
			for (int var4 = 0; var4 < this.field2991; var4++) {
				this.field2985[var4] = arg1.method538();
				this.field2988[var4] = arg1.method538();
			}
		}
	}
}
