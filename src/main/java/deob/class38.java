package deob;

@ObfuscatedName("fb")
public final class class38 extends class146 {

	@ObfuscatedName("fb.t")
	public int field900;

	@ObfuscatedName("fb.v")
	public static class32 field902 = class73.method593("<col=ff9040>", true);

	@ObfuscatedName("fb.w")
	public static class32 field903 = field908;

	@ObfuscatedName("fb.B")
	public static class32 field908 = class73.method593("Members object", true);

	@ObfuscatedName("fb.y")
	public static class32 field905 = class73.method593("You need a members account to login to this world)3", true);

	@ObfuscatedName("fb.J")
	public static int[] field916 = new int[1000];

	@ObfuscatedName("fb.H")
	public static class32[] field914 = new class32[8];

	@ObfuscatedName("fb.I")
	public static class32 field915 = field905;

	@ObfuscatedName("fb.F")
	public static class32 field912 = class73.method593("(U2", true);

	@ObfuscatedName("fb.K")
	public static class32 field917 = class73.method593("green:", true);

	@ObfuscatedName("fb.D")
	public static class32 field910 = class73.method593("W-=hlen Sie eine Welt", true);

	@ObfuscatedName("fb.L")
	public static class32 field918 = field917;

	@ObfuscatedName("fb.z")
	public static class32 field906 = field917;

	@ObfuscatedName("fb.C")
	public static class109 field909 = new class109();

	@ObfuscatedName("fb.M")
	public static class80 field919 = new class80();

	@ObfuscatedName("fb.N")
	public static class32 field920 = class73.method593("(U4", true);

	@ObfuscatedName("fb.O")
	public static int field921 = 0;

	@ObfuscatedName("fb.R")
	public static int field924 = 0;

	@ObfuscatedName("fb.P")
	public static class32 field922 = class73.method593("0(U", true);

	@ObfuscatedName("fb.S")
	public static class63 field925 = new class63(260);

	@ObfuscatedName("fb.U")
	public static class32 field927 = class73.method593(" <col=ffffff>", true);

	@ObfuscatedName("fb.T")
	public static class32 field926 = class73.method593("au", true);

	@ObfuscatedName("fb.Q")
	public static class44 field923;

	@ObfuscatedName("fb.G")
	public static class96 field913;

	@ObfuscatedName("fb.a(III)V")
	public static void method315(int arg0, int arg1) {
		if (class158.field3638 != 0 && arg0 != -1) {
			class154.method1195(class98.field2268, arg0, class158.field3638, 0);
			class112.field2621 = true;
		}
	}

	@ObfuscatedName("fb.b(II)Lta;")
	public static class133 method316(int arg0) {
		class133 var1 = (class133) class94.field2170.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class41.field970.method206(13, arg0);
		class133 var3 = new class133();
		var3.field3070 = arg0;
		if (var2 != null) {
			var3.method1013(new class66(var2));
		}
		class94.field2170.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("fb.a(Z)V")
	public static void method317() {
		field919 = null;
		field925 = null;
		field918 = null;
		field902 = null;
		field910 = null;
		field913 = null;
		field908 = null;
		field905 = null;
		field917 = null;
		field926 = null;
		field922 = null;
		field915 = null;
		field914 = null;
		field916 = null;
		field903 = null;
		field923 = null;
		field909 = null;
		field906 = null;
		field912 = null;
		field927 = null;
		field920 = null;
	}

	public class38() {
	}

	public class38(int arg0) {
		this.field900 = arg0;
	}
}
