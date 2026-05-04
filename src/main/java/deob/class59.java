package deob;

import java.util.zip.Inflater;

@ObfuscatedName("fc")
public final class class59 {

	@ObfuscatedName("fc.a")
	public static final class88 field1106 = class208.method1423(105, "compass");

	@ObfuscatedName("fc.c")
	public static final class88 field1108 = class208.method1423(105, "Connecting to server)3)3)3");

	@ObfuscatedName("fc.e")
	public static double field1110;

	@ObfuscatedName("fc.g")
	public Inflater field1112;

	@ObfuscatedName("fc.h")
	public static final class88 field1113 = class208.method1423(105, "");

	@ObfuscatedName("fc.i")
	public static class144 field1114;

	@ObfuscatedName("fc.l")
	public static class88 field1117 = field1108;

	@ObfuscatedName("fc.m")
	public static final class88 field1118 = class208.method1423(105, "zap");

	@ObfuscatedName("fc.n")
	public static final class88 field1119 = class208.method1423(105, "Eingabeprozedur geladen)3");

	@ObfuscatedName("fc.o")
	public static final boolean[] field1120 = new boolean[200];

	@ObfuscatedName("fc.a(II)Z")
	public static boolean method423(int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@ObfuscatedName("fc.a(III)V")
	public static void method426(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		class97 var4 = (class97) class205.field3907.method1049(var2);
		if (var4 != null) {
			class138.field2559.method1388(var4);
		}
	}

	@ObfuscatedName("fc.b(II)Lwh;")
	public static class247 method427(int arg0) {
		class247 var1 = (class247) class33.field555.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class18.field300.method939(0, arg0);
		if (var2 == null) {
			return null;
		}
		class247 var3 = new class247();
		class46 var4 = new class46(var2);
		var4.field831 = var4.field842.length - 2;
		int var5 = var4.method301();
		int var6 = var4.field842.length - var5 - 2 - 12;
		var4.field831 = var6;
		int var7 = var4.method323();
		var3.field4526 = var4.method301();
		var3.field4517 = var4.method301();
		var3.field4520 = var4.method301();
		var3.field4518 = var4.method301();
		int var8 = var4.method347();
		if (var8 > 0) {
			var3.field4514 = new class154[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = var4.method301();
				class154 var11 = new class154(class184.method1296(var10));
				var3.field4514[var9] = var11;
				while (var10-- > 0) {
					int var12 = var4.method323();
					int var13 = var4.method323();
					var11.method1052((long) var12, new class192(var13));
				}
			}
		}
		int var14 = 0;
		var4.field831 = 0;
		var3.field4530 = var4.method353();
		var3.field4522 = new class88[var7];
		var3.field4519 = new int[var7];
		var3.field4521 = new int[var7];
		while (var6 > var4.field831) {
			int var15 = var4.method301();
			if (var15 == 3) {
				var3.field4522[var14] = var4.method298();
			} else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
				var3.field4521[var14] = var4.method347();
			} else {
				var3.field4521[var14] = var4.method323();
			}
			var3.field4519[var14++] = var15;
		}
		class33.field555.method663((long) arg0, var3);
		return var3;
	}

	public class59() {
		this(-1, 1000000, 1000000);
	}

	public class59(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("fc.a(Lea;Z[B)V")
	public void method424(class46 arg0, byte[] arg1) {
		if (arg0.field842[arg0.field831] != 31 || arg0.field842[arg0.field831 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.field1112 == null) {
			this.field1112 = new Inflater(true);
		}
		try {
			this.field1112.setInput(arg0.field842, arg0.field831 + 10, arg0.field842.length - arg0.field831 - 18);
			this.field1112.inflate(arg1);
		} catch (Exception var3) {
			this.field1112.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.field1112.reset();
	}
}
