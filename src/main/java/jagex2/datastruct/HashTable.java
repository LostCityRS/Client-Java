package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class HashTable {

	@ObfuscatedName("u.c")
	public int field371;

	@ObfuscatedName("u.d")
	public Linkable[] field372;

	public HashTable(int arg0) {
		this.field371 = arg0;
		this.field372 = new Linkable[arg0];
		for (int var3 = 0; var3 < arg0; var3++) {
			Linkable var4 = this.field372[var3] = new Linkable();
			var4.field375 = var4;
			var4.field376 = var4;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable method118(long arg0) {
		Linkable var3 = this.field372[(int) (arg0 & (long) (this.field371 - 1))];
		for (Linkable var4 = var3.field375; var4 != var3; var4 = var4.field375) {
			if (var4.field374 == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("u.a(JBLv;)V")
	public void method119(long arg0, Linkable arg2) {
		if (arg2.field376 != null) {
			arg2.method120();
		}
		Linkable var5 = this.field372[(int) (arg0 & (long) (this.field371 - 1))];
		arg2.field376 = var5.field376;
		arg2.field375 = var5;
		arg2.field376.field375 = arg2;
		arg2.field375.field376 = arg2;
		arg2.field374 = arg0;
	}
}
