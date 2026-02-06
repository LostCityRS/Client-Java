package deob;

@ObfuscatedName("q")
public final class class111 extends class115 {

	@ObfuscatedName("q.Kc")
	public static class157 field2598 = new class157();

	@ObfuscatedName("q.Oc")
	public static class32 field2602 = class73.method593("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", true);

	@ObfuscatedName("q.Qc")
	public static class32 field2604 = class73.method593("Benutzen", true);

	@ObfuscatedName("q.Pc")
	public static class32 field2603 = class73.method593("Hidden)2", true);

	@ObfuscatedName("q.Sc")
	public static int field2606 = -1;

	@ObfuscatedName("q.Wc")
	public static class32[] field2610 = new class32[100];

	@ObfuscatedName("q.Tc")
	public static class32 field2607 = class73.method593("sl_stars", true);

	@ObfuscatedName("q.Uc")
	public static class32 field2608 = class73.method593("Verbindung konnte nicht hergestellt werden)3", true);

	@ObfuscatedName("q.Rc")
	public static class32 field2605 = class73.method593("Lade Konfiguration )2 ", true);

	@ObfuscatedName("q.Xc")
	public static int field2611;

	@ObfuscatedName("q.Hc")
	public class97 field2595;

	@ObfuscatedName("q.Vc")
	public static class37[] field2609;

	@ObfuscatedName("q.Nc")
	public static class49[] field2601;

	@ObfuscatedName("q.Yc")
	public static byte[][][] field2612;

	@ObfuscatedName("q.a(ILjd;ILdc;)V")
	public static void method874(int arg0, class66 arg1, class25 arg2) {
		class29 var3 = new class29();
		var3.field535 = arg1.method532();
		var3.field518 = arg1.method538();
		var3.field534 = new class18[var3.field535];
		var3.field524 = new int[var3.field535];
		var3.field533 = new byte[var3.field535][][];
		var3.field526 = new int[var3.field535];
		var3.field532 = new int[var3.field535];
		var3.field529 = new class18[var3.field535];
		for (int var4 = 0; var4 < var3.field535; var4++) {
			try {
				int var5 = arg1.method532();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					String var16 = new String(arg1.method555().method255());
					String var17 = new String(arg1.method555().method255());
					int var18 = 0;
					if (var5 == 1) {
						var18 = arg1.method538();
					}
					var3.field532[var4] = var5;
					var3.field526[var4] = var18;
					var3.field529[var4] = arg2.method173(class45.method346(var16), var17);
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg1.method555().method255());
					String var7 = new String(arg1.method555().method255());
					int var8 = arg1.method532();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg1.method555().method255());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg1.method538();
							var11[var12] = new byte[var13];
							arg1.method557(var13, var11[var12]);
						}
					}
					Class[] var14 = new Class[var8];
					var3.field532[var4] = var5;
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = class45.method346(var9[var15]);
					}
					var3.field534[var4] = arg2.method179(var14, var7, class45.method346(var6));
					var3.field533[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field524[var4] = -1;
			} catch (SecurityException var20) {
				var3.field524[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field524[var4] = -3;
			} catch (Exception var22) {
				var3.field524[var4] = -4;
			} catch (Throwable var23) {
				var3.field524[var4] = -5;
			}
		}
		class112.field2627.method1214(var3);
	}

	@ObfuscatedName("q.c(B)V")
	public static void method875() {
		Object var0 = class92.field2103;
		synchronized (class92.field2103) {
			if (class146.field3323 == 0) {
				class154.field3516.method175(5, new class137(), 112);
			}
			class146.field3323 = 600;
		}
	}

	@ObfuscatedName("q.a(BLec;)Z")
	public static boolean method876(class32 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < class106.field2504; var1++) {
			if (arg0.method271(class71.field1685[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("q.d(B)V")
	public static void method877() {
		field2603 = null;
		field2607 = null;
		field2602 = null;
		field2610 = null;
		field2601 = null;
		field2609 = null;
		field2598 = null;
		field2608 = null;
		field2604 = null;
		field2605 = null;
		field2612 = null;
	}

	@ObfuscatedName("q.a(ZI)Lec;")
	public static class32 method878(int arg0) {
		return class56.field1295[arg0].method240() > 0 ? class52.method402(new class32[] { class109.field2575[arg0], class114.field2651, class56.field1295[arg0] }) : class109.field2575[arg0];
	}

	@ObfuscatedName("q.j(I)Z")
	@Override
	public boolean method578() {
		return this.field2595 != null;
	}

	@ObfuscatedName("q.b(B)Lod;")
	@Override
	public class101 method132() {
		if (this.field2595 == null) {
			return null;
		}
		class149 var1 = super.field2712 != -1 && super.field2715 == 0 ? class97.method760(super.field2712) : null;
		class149 var2 = super.field2708 == -1 || super.field2708 == super.field2687 && var1 != null ? null : class97.method760(super.field2708);
		class101 var3 = this.field2595.method761(var2, super.field2725, var1, super.field2728);
		if (var3 == null) {
			return null;
		}
		var3.method804();
		super.field2688 = var3.field470;
		if (super.field2731 != -1 && super.field2754 != -1) {
			class101 var4 = class38.method316(super.field2731).method1017(super.field2754);
			if (var4 != null) {
				var4.method817(0, -super.field2727, 0);
				class101[] var5 = new class101[] { var3, var4 };
				var3 = new class101(var5, 2);
			}
		}
		if (this.field2595.field2196 == 1) {
			var3.field2322 = true;
		}
		return var3;
	}
}
