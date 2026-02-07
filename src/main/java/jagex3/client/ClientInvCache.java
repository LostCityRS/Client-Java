package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.Linkable;

@ObfuscatedName("pc")
public final class ClientInvCache extends Linkable {

	@ObfuscatedName("ee.Q")
	public static HashTable invList = new HashTable(32);
	@ObfuscatedName("pc.u")
	public int[] field2535 = new int[1];

	@ObfuscatedName("pc.w")
	public int[] field2537 = new int[] { -1 };

	@ObfuscatedName("oe.a(II)V")
	public static void method822(int arg0) {
		ClientInvCache var1 = (ClientInvCache) invList.find((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.field2537.length; var2++) {
				var1.field2537[var2] = -1;
				var1.field2535[var2] = 0;
			}
		}
	}

    @ObfuscatedName("gb.a(BI)V")
    public static void method344(int arg0) {
        ClientInvCache var1 = (ClientInvCache) invList.find((long) arg0);
        if (var1 != null) {
            var1.unlink();
        }
    }

	@ObfuscatedName("f.a(IIIII)V")
	public static void method304(int arg0, int arg1, int arg2, int arg3) {
		ClientInvCache var4 = (ClientInvCache) invList.find((long) arg0);
		if (var4 == null) {
			var4 = new ClientInvCache();
			invList.put((long) arg0, var4);
		}
		if (arg1 >= var4.field2537.length) {
			int[] var5 = new int[arg1 + 1];
			int[] var6 = new int[arg1 + 1];
			for (int var7 = 0; var7 < var4.field2537.length; var7++) {
				var5[var7] = var4.field2537[var7];
				var6[var7] = var4.field2535[var7];
			}
			for (int var8 = var4.field2537.length; var8 < arg1; var8++) {
				var5[var8] = -1;
				var6[var8] = 0;
			}
			var4.field2535 = var6;
			var4.field2537 = var5;
		}
		var4.field2537[arg1] = arg3;
		var4.field2535[arg1] = arg2;
	}

	@ObfuscatedName("kd.a(III)I")
	public static int method597(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg1);
		if (var2 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < var2.field2537.length) {
			return var2.field2537[arg0];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public static void deleteAll() {
		invList = new HashTable(32);
	}

	@ObfuscatedName("hc.a(III)I")
	public static int method406(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && var2.field2535.length > arg1) {
			return var2.field2535[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("e.a(IIZ)I")
	public static int method196(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.field2535.length; var4++) {
				if (var2.field2537[var4] == arg1) {
					var3 += var2.field2535[var4];
				}
			}
			return var3;
		}
	}
}
