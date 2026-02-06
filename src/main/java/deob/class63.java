package deob;

@ObfuscatedName("ja")
public final class class63 {

	@ObfuscatedName("ja.a")
	public static int[] field1440 = new int[field1460];

	@ObfuscatedName("ja.b")
	public static class32 field1441 = class73.method593("rect_debug=", true);

	@ObfuscatedName("ja.c")
	public static int[] field1442;

	@ObfuscatedName("ja.d")
	public static volatile long field1443 = 0L;

	@ObfuscatedName("ja.e")
	public static class32 field1444 = class73.method593("Bitte entfernen Sie ", true);

	@ObfuscatedName("ja.f")
	public static class32 field1445 = class73.method593(")1p", true);

	@ObfuscatedName("ja.g")
	public static int[] field1446 = new int[field1460];

	@ObfuscatedName("ja.h")
	public static class36 field1447;

	@ObfuscatedName("ja.i")
	public final class13 field1448 = new class13();

	@ObfuscatedName("ja.m")
	public static class32[] field1452 = new class32[field1460];

	@ObfuscatedName("ja.n")
	public static class32 field1453 = class73.method593("Loading sprites )2 ", true);

	@ObfuscatedName("ja.o")
	public static int[][] field1454;

	@ObfuscatedName("ja.p")
	public static class32 field1455 = class73.method593("sl_arrows", true);

	@ObfuscatedName("ja.r")
	public static int[] field1457 = new int[field1460];

	@ObfuscatedName("ja.t")
	public static class32 field1459 = field1453;

	@ObfuscatedName("ja.u")
	public static final int field1460 = 50;

	@ObfuscatedName("ja.z")
	public static int field1465 = -1;

	@ObfuscatedName("ja.y")
	public static int[] field1464 = new int[field1460];

	@ObfuscatedName("ja.E")
	public static int[] field1470 = new int[field1460];

	@ObfuscatedName("ja.B")
	public static int[] field1467 = new int[field1460];

	@ObfuscatedName("ja.D")
	public static int field1469 = 0;

	@ObfuscatedName("ja.G")
	public static int[] field1472 = new int[field1460];

	@ObfuscatedName("ja.A")
	public static class157 field1466 = new class157();

	@ObfuscatedName("ja.K")
	public static class32 field1476 = class73.method593("Sie haben gerade eine andere Welt verlassen)3", true);

	@ObfuscatedName("ja.H")
	public final class151 field1473 = new class151();

	@ObfuscatedName("ja.F")
	public int field1471;

	@ObfuscatedName("ja.I")
	public final int field1474;

	@ObfuscatedName("ja.J")
	public final class156 field1475;

	@ObfuscatedName("ja.a(III)V")
	public static void method483(int arg0, int arg1) {
		if (class125.field2911 == 2) {
			class136.method1031((class103.field2403 - class118.field2836 << 7) + client.field377, (-class72.field1700 + class145.field3299 << 7) + class137.field3194, class110.field2580 * 2);
			if (class89.field2055 > -1 && class140.field3217 % 20 < 10) {
				class131.field3019[0].method369(arg0 + class89.field2055 - 12, arg1 - (-class130.field3001 + 28));
			}
		}
	}

	@ObfuscatedName("ja.a(B)V")
	public static void method487() {
		class82.field1914.method490();
		class48.field1125.method490();
		class47.field1114.method490();
	}

	@ObfuscatedName("ja.b(B)V")
	public static void method488() {
		field1455 = null;
		field1472 = null;
		field1447 = null;
		field1445 = null;
		field1454 = null;
		field1476 = null;
		field1440 = null;
		field1467 = null;
		field1442 = null;
		field1453 = null;
		field1452 = null;
		field1466 = null;
		field1444 = null;
		field1459 = null;
		field1446 = null;
		field1457 = null;
		field1470 = null;
		field1441 = null;
		field1464 = null;
	}

	@ObfuscatedName("ja.c(B)V")
	public static void method489() {
		Object var0 = class92.field2103;
		synchronized (class92.field2103) {
			if (class146.field3323 != 0) {
				class146.field3323 = 1;
				try {
					class92.field2103.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	public class63(int arg0) {
		int var2 = 1;
		this.field1471 = arg0;
		this.field1474 = arg0;
		while (var2 + var2 < arg0) {
			var2 += var2;
		}
		this.field1475 = new class156(var2);
	}

	@ObfuscatedName("ja.a(JBLbe;)V")
	public void method484(long arg0, class13 arg1) {
		if (this.field1471 == 0) {
			class13 var4 = this.field1473.method1173();
			var4.method1091();
			var4.method68();
			if (this.field1448 == var4) {
				class13 var5 = this.field1473.method1173();
				var5.method1091();
				var5.method68();
			}
		} else {
			this.field1471--;
		}
		this.field1475.method1201(arg0, arg1);
		this.field1473.method1171(arg1);
	}

	@ObfuscatedName("ja.a(IJ)Lbe;")
	public class13 method485(long arg0) {
		class13 var3 = (class13) this.field1475.method1196(arg0);
		if (var3 != null) {
			this.field1473.method1171(var3);
		}
		return var3;
	}

	@ObfuscatedName("ja.a(JZ)V")
	public void method486(long arg0) {
		class13 var3 = (class13) this.field1475.method1196(arg0);
		if (var3 != null) {
			var3.method1091();
			var3.method68();
			this.field1471++;
		}
	}

	@ObfuscatedName("ja.a(I)V")
	public void method490() {
		while (true) {
			class13 var1 = this.field1473.method1173();
			if (var1 == null) {
				this.field1471 = this.field1474;
				return;
			}
			var1.method1091();
			var1.method68();
		}
	}
}
