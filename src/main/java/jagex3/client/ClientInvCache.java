package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.Linkable;

@ObfuscatedName("qc")
public final class ClientInvCache extends Linkable {

	@ObfuscatedName("fh.g")
	public static HashTable invList = new HashTable(32);
	@ObfuscatedName("qc.w")
	public int[] objCount = new int[1];

	@ObfuscatedName("qc.y")
	public int[] objId = new int[] { -1 };

	@ObfuscatedName("nf.a(IB)V")
	public static void delete(int arg0) {
		ClientInvCache var1 = (ClientInvCache) invList.find((long) arg0);
		if (var1 != null) {
			var1.unlink();
		}
	}

	@ObfuscatedName("ac.b(II)V")
	public static void clear(int arg0) {
		ClientInvCache var1 = (ClientInvCache) invList.find((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.objId.length; var2++) {
				var1.objId[var2] = -1;
				var1.objCount[var2] = 0;
			}
		}
	}

	@ObfuscatedName("k.a(BII)I")
	public static int getCount(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && var2.objCount.length > arg1) {
			return var2.objCount[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qc.a(IIIII)V")
	public static void set(int arg0, int arg1, int arg2, int arg3) {
		ClientInvCache var4 = (ClientInvCache) invList.find((long) arg0);
		if (var4 == null) {
			var4 = new ClientInvCache();
			invList.put((long) arg0, var4);
		}
		if (var4.objId.length <= arg2) {
			int[] var5 = new int[arg2 + 1];
			int[] var6 = new int[arg2 + 1];
			for (int var7 = 0; var7 < var4.objId.length; var7++) {
				var6[var7] = var4.objId[var7];
				var5[var7] = var4.objCount[var7];
			}
			for (int var8 = var4.objId.length; var8 < arg2; var8++) {
				var6[var8] = -1;
				var5[var8] = 0;
			}
			var4.objCount = var5;
			var4.objId = var6;
		}
		var4.objId[arg2] = arg3;
		var4.objCount[arg2] = arg1;
	}

	@ObfuscatedName("wg.b(III)I")
	public static int invTotal(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.objCount.length; var4++) {
				if (arg1 == var2.objId[var4]) {
					var3 += var2.objCount[var4];
				}
			}
			return var3;
		}
	}

	@ObfuscatedName("de.a(IZI)I")
	public static int getType(int arg0, int arg1) {
		ClientInvCache var2 = (ClientInvCache) invList.find((long) arg1);
		if (var2 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < var2.objId.length) {
			return var2.objId[arg0];
		} else {
			return -1;
		}
	}

	@ObfuscatedName("dh.b(B)V")
	public static void deleteAll() {
		invList = new HashTable(32);
	}
}
