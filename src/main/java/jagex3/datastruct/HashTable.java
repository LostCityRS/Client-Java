package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ob")
public final class HashTable {

	@ObfuscatedName("ob.h")
	public final Linkable[] field2971;

	@ObfuscatedName("ob.i")
	public final int field2972;

	@ObfuscatedName("ob.r")
	public Linkable field2981;

	@ObfuscatedName("ob.v")
	public long field2985;

	@ObfuscatedName("ob.z")
	public int field2989 = 0;

	@ObfuscatedName("ob.A")
	public Linkable field2990;

	public HashTable(int arg0) {
		this.field2972 = arg0;
		this.field2971 = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.field2971[var2] = new Linkable();
			var3.field1212 = var3;
			var3.field1220 = var3;
		}
	}

	@ObfuscatedName("ob.a(I)Lg;")
	public Linkable method1047() {
		this.field2989 = 0;
		return this.method1048();
	}

	@ObfuscatedName("ob.a(B)Lg;")
	public Linkable method1048() {
		if (this.field2989 > 0 && this.field2990 != this.field2971[this.field2989 - 1]) {
			Linkable var1 = this.field2990;
			this.field2990 = var1.field1220;
			return var1;
		}
		while (this.field2972 > this.field2989) {
			Linkable var2 = this.field2971[this.field2989++].field1220;
			if (this.field2971[this.field2989 - 1] != var2) {
				this.field2990 = var2.field1220;
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("ob.a(IJ)Lg;")
	public Linkable method1049(long arg0) {
		this.field2985 = arg0;
		Linkable var3 = this.field2971[(int) (arg0 & (long) (this.field2972 - 1))];
		for (this.field2981 = var3.field1220; this.field2981 != var3; this.field2981 = this.field2981.field1220) {
			if (arg0 == this.field2981.key) {
				Linkable var4 = this.field2981;
				this.field2981 = this.field2981.field1220;
				return var4;
			}
		}
		this.field2981 = null;
		return null;
	}

	@ObfuscatedName("ob.a(JLg;I)V")
	public void put(long arg0, Linkable arg1) {
		if (arg1.field1212 != null) {
			arg1.unlink();
		}
		Linkable var4 = this.field2971[(int) (arg0 & (long) (this.field2972 - 1))];
		arg1.key = arg0;
		arg1.field1212 = var4.field1212;
		arg1.field1220 = var4;
		arg1.field1212.field1220 = arg1;
		arg1.field1220.field1212 = arg1;
	}

	@ObfuscatedName("ob.c(I)Lg;")
	public Linkable method1054(int arg0) {
		if (this.field2981 == null) {
			return null;
		}
		Linkable var2 = this.field2971[(int) (this.field2985 & (long) (this.field2972 - 1))];
		if (arg0 != 3) {
			this.method1048();
		}
		while (this.field2981 != var2) {
			if (this.field2985 == this.field2981.key) {
				Linkable var3 = this.field2981;
				this.field2981 = this.field2981.field1220;
				return var3;
			}
			this.field2981 = this.field2981.field1220;
		}
		this.field2981 = null;
		return null;
	}
}
