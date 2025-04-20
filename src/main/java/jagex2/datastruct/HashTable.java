package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public class HashTable {

	@ObfuscatedName("u.a")
	public boolean field365 = true;

	@ObfuscatedName("u.b")
	public int field366;

	@ObfuscatedName("u.c")
	public Linkable[] field367;

	public HashTable(int arg0, int arg1) {
		if (arg0 < 3 || arg0 > 3) {
			this.field365 = !this.field365;
		}
		this.field366 = arg1;
		this.field367 = new Linkable[arg1];
		for (int var3 = 0; var3 < arg1; var3++) {
			Linkable var4 = this.field367[var3] = new Linkable();
			var4.next = var4;
			var4.prev = var4;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable method117(long arg0) {
		Linkable var3 = this.field367[(int) (arg0 & (long) (this.field366 - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("u.a(IJLv;)V")
	public void method118(int arg0, long arg1, Linkable arg2) {
		if (arg2.prev != null) {
			arg2.unlink();
		}
		Linkable var5 = this.field367[(int) (arg1 & (long) (this.field366 - 1))];
		arg2.prev = var5.prev;
		arg2.next = var5;
		arg2.prev.next = arg2;
		if (arg0 < 5 || arg0 > 5) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		arg2.next.prev = arg2;
		arg2.key = arg1;
	}
}
