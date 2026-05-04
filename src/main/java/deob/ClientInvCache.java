package deob;

@ObfuscatedName("qc")
public final class ClientInvCache extends Linkable {

	@ObfuscatedName("fh.g")
	public static HashTable field1163 = new HashTable(32);
	@ObfuscatedName("qc.w")
	public int[] field3551 = new int[1];

	@ObfuscatedName("qc.y")
	public int[] field3553 = new int[] { -1 };

	@ObfuscatedName("nf.a(IB)V")
	public static void method996(int arg0) {
		ClientInvCache var1 = (ClientInvCache) field1163.method1049((long) arg0);
		if (var1 != null) {
			var1.unlink();
		}
	}

	@ObfuscatedName("ac.b(II)V")
	public static void method20(int arg0) {
		ClientInvCache var1 = (ClientInvCache) field1163.method1049((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.field3553.length; var2++) {
				var1.field3553[var2] = -1;
				var1.field3551[var2] = 0;
			}
		}
	}

	@ObfuscatedName("k.a(BII)I")
	public static int method747(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) field1163.method1049((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && var2.field3551.length > arg1) {
			return var2.field3551[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(IIIII)V")
	public static void method1268(int arg0, int arg1, int arg2, int arg3) {
		ClientInvCache var4 = (ClientInvCache) field1163.method1049((long) arg0);
		if (var4 == null) {
			var4 = new ClientInvCache();
			field1163.put((long) arg0, var4);
		}
		if (var4.field3553.length <= arg2) {
			int[] var5 = new int[arg2 + 1];
			int[] var6 = new int[arg2 + 1];
			for (int var7 = 0; var7 < var4.field3553.length; var7++) {
				var6[var7] = var4.field3553[var7];
				var5[var7] = var4.field3551[var7];
			}
			for (int var8 = var4.field3553.length; var8 < arg2; var8++) {
				var6[var8] = -1;
				var5[var8] = 0;
			}
			var4.field3551 = var5;
			var4.field3553 = var6;
		}
		var4.field3553[arg2] = arg3;
		var4.field3551[arg2] = arg1;
	}

	@ObfuscatedName("wg.b(III)I")
	public static int method1608(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) field1163.method1049((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.field3551.length; var4++) {
				if (arg1 == var2.field3553[var4]) {
					var3 += var2.field3551[var4];
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("de.a(IZI)I")
	public static int method255(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) field1163.method1049((long) arg1);
		if (var2 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < var2.field3553.length) {
			return var2.field3553[arg0];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("dh.b(B)V")
	public static void method276() {
		field1163 = new HashTable(32);
	}
}
