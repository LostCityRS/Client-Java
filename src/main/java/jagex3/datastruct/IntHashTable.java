package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("nd")
public final class IntHashTable {

	@ObfuscatedName("nd.l")
	public final int[] buckets;

	public IntHashTable(int[] arg0) {
		int var2;
		for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
		}
		this.buckets = new int[var2 + var2];
		for (int var3 = 0; var3 < var2 + var2; var3++) {
			this.buckets[var3] = -1;
		}
		int var4 = 0;
		while (var4 < arg0.length) {
			int var5;
			for (var5 = arg0[var4] & var2 - 1; this.buckets[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
			}
			this.buckets[var5 + var5] = arg0[var4];
			this.buckets[var5 + var5 + 1] = var4++;
		}
	}

	@ObfuscatedName("nd.a(BI)I")
	public int find(int arg0) {
		int var2 = this.buckets.length - 2;
		int var3 = arg0 << 1 & var2;
		while (true) {
			int var4 = this.buckets[var3];
			if (var4 == arg0) {
				return this.buckets[var3 + 1];
			}
			if (var4 == -1) {
				return -1;
			}
			var3 = var3 + 2 & var2;
		}
	}
}
