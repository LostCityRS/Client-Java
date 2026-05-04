package deob;

@ObfuscatedName("eb")
public final class class47 extends class136 {

	@ObfuscatedName("eb.M")
	public static final class24 field879 = new class24(30);

	@ObfuscatedName("eb.R")
	public static int field884 = 0;

	@ObfuscatedName("eb.O")
	public static final class88 field881 = class208.method1423(105, "sl_arrows");

	@ObfuscatedName("eb.Y")
	public static final class88 field891 = class208.method1423(105, "<col=ffffff> )4 ");

	@ObfuscatedName("eb.J")
	public class88 field876 = class93.field1749;

	@ObfuscatedName("eb.G")
	public int field873;

	@ObfuscatedName("eb.K")
	public int field877;

	@ObfuscatedName("eb.P")
	public int field882;

	@ObfuscatedName("eb.S")
	public static int field885;

	@ObfuscatedName("eb.W")
	public static int field889;

	@ObfuscatedName("eb.X")
	public static int field890;

	@ObfuscatedName("eb.E")
	public class154 field871;

	@ObfuscatedName("eb.U")
	public static class188 field887;

	@ObfuscatedName("eb.a(ILnb;Lnb;)V")
	public static void method357(class144 arg0, class144 arg1) {
		class209.field3968 = arg0;
		class170.field3262 = arg1;
	}

	@ObfuscatedName("eb.a(ILnb;II)Z")
	public static boolean method358(class144 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method939(arg2, arg1);
		if (var3 == null) {
			return false;
		} else {
			class244.method1601(var3);
			return true;
		}
	}

	@ObfuscatedName("eb.a(IIIIIIII)V")
	public static void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 0;
		int var9 = 0;
		int var10 = arg4;
		int var11 = 2048 - arg3 & 0x7FF;
		if (var11 != 0) {
			int var12 = class173.field3359[var11];
			int var13 = class173.field3354[var11];
			var9 = var12 * -arg4 >> 16;
			var10 = var13 * arg4 >> 16;
		}
		if (var7 != 0) {
			int var14 = class173.field3359[var7];
			int var15 = class173.field3354[var7];
			var8 = var10 * var14 >> 16;
			var10 = var15 * var10 >> 16;
		}
		class108.field1954 = arg1 - var9;
		class79.field1428 = arg0 - var8;
		class184.field3608 = arg6 - var10;
		class170.field3257 = arg2;
		class207.field3934 = arg3;
	}

	@ObfuscatedName("eb.d(I)V")
	public static void method362() {
		if (class43.field732 != null) {
			class17 var0 = class43.field732;
			synchronized (class43.field732) {
				class43.field732 = null;
			}
		}
	}

	@ObfuscatedName("eb.e(I)V")
	public static void method363() {
		if (!class10.field145) {
			return;
		}
		class174 var0 = class36.method238(client.field569, class16.field249);
		if (var0 != null && var0.field3440 != null) {
			class39 var1 = new class39();
			var1.field678 = var0;
			var1.field681 = var0.field3440;
			class200.method1373(var1);
		}
		class10.field145 = false;
		class200.method1371(var0);
	}

	@ObfuscatedName("eb.a(BLea;)V")
	public void method355(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method364(var2, arg0);
		}
	}

	@ObfuscatedName("eb.b(II)I")
	public int method356(int arg0) {
		if (this.field871 == null) {
			return this.field877;
		} else {
			class192 var2 = (class192) this.field871.method1049((long) arg0);
			return var2 == null ? this.field877 : var2.field3698;
		}
	}

	@ObfuscatedName("eb.a(IB)Li;")
	public class88 method360(int arg0) {
		if (this.field871 == null) {
			return this.field876;
		} else {
			class216 var2 = (class216) this.field871.method1049((long) arg0);
			return var2 == null ? this.field876 : var2.field4046;
		}
	}

	@ObfuscatedName("eb.a(IBLea;)V")
	public void method364(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field873 = arg1.method347();
		} else if (arg0 == 2) {
			this.field882 = arg1.method347();
		} else if (arg0 == 3) {
			this.field876 = arg1.method298();
		} else if (arg0 == 4) {
			this.field877 = arg1.method323();
		} else if (arg0 == 5 || arg0 == 6) {
			int var3 = arg1.method301();
			this.field871 = new class154(class184.method1296(var3));
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = arg1.method323();
				class67 var6;
				if (arg0 == 5) {
					var6 = new class216(arg1.method298());
				} else {
					var6 = new class192(arg1.method323());
				}
				this.field871.method1052((long) var5, var6);
			}
		}
	}
}
