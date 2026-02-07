package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wc")
public final class HashTable {

	@ObfuscatedName("wc.h")
	public Linkable field3562;

	@ObfuscatedName("wc.j")
	public final int field3564;

	@ObfuscatedName("wc.m")
	public long field3567;

	@ObfuscatedName("wc.t")
	public final Linkable[] field3574;

	@ObfuscatedName("wc.v")
	public int field3576 = 0;

	@ObfuscatedName("wc.w")
	public Linkable field3577;

	public HashTable(int arg0) {
		this.field3574 = new Linkable[arg0];
		this.field3564 = arg0;
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.field3574[var2] = new Linkable();
			var3.field3320 = var3;
			var3.field3316 = var3;
		}
	}

	@ObfuscatedName("wc.a(JB)Lv;")
	public Linkable method1196(long arg0) {
		this.field3567 = arg0;
		Linkable var3 = this.field3574[(int) (arg0 & (long) (this.field3564 - 1))];
		for (this.field3562 = var3.field3320; this.field3562 != var3; this.field3562 = this.field3562.field3320) {
			if (arg0 == this.field3562.field3324) {
				Linkable var4 = this.field3562;
				this.field3562 = this.field3562.field3320;
				return var4;
			}
		}
		this.field3562 = null;
		return null;
	}

	@ObfuscatedName("wc.a(I)Lv;")
	public Linkable findnext() {
		if (this.field3576 > 0 && this.field3574[this.field3576 - 1] != this.field3577) {
			Linkable var1 = this.field3577;
			this.field3577 = var1.field3320;
			return var1;
		}
		while (this.field3576 < this.field3564) {
			Linkable var2 = this.field3574[this.field3576++].field3320;
			if (var2 != this.field3574[this.field3576 - 1]) {
				this.field3577 = var2.field3320;
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("wc.a(ZJLv;)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.field3316 != null) {
			arg1.unlink();
		}
		Linkable var4 = this.field3574[(int) ((long) (this.field3564 - 1) & arg0)];
		arg1.field3320 = var4;
		arg1.field3316 = var4.field3316;
		arg1.field3316.field3320 = arg1;
		arg1.field3320.field3316 = arg1;
		arg1.field3324 = arg0;
	}

	@ObfuscatedName("wc.b(B)Lv;")
	public Linkable method1202(byte arg0) {
		if (this.field3562 == null) {
			return null;
		}
		Linkable var2 = this.field3574[(int) ((long) (this.field3564 - 1) & this.field3567)];
		while (this.field3562 != var2) {
			if (this.field3562.field3324 == this.field3567) {
				Linkable var3 = this.field3562;
				this.field3562 = this.field3562.field3320;
				return var3;
			}
			this.field3562 = this.field3562.field3320;
		}
		this.field3562 = null;
		return null;
	}

	@ObfuscatedName("wc.c(B)Lv;")
	public Linkable search() {
		this.field3576 = 0;
		return this.findnext();
	}
}
