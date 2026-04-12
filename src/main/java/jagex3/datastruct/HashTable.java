package jagex3.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("i")
public final class HashTable {

	@ObfuscatedName("i.b")
	public long field1256;

	@ObfuscatedName("i.f")
	public static int field1260 = 0;

	@ObfuscatedName("i.n")
	public final int field1268;

	@ObfuscatedName("i.q")
	public static boolean field1271 = false;

	@ObfuscatedName("i.r")
	public Linkable field1272;

	@ObfuscatedName("i.s")
	public final Linkable[] field1273;

	@ObfuscatedName("i.y")
	public static int field1279 = -1;

	@ObfuscatedName("i.x")
	public int field1278 = 0;

	@ObfuscatedName("i.z")
	public Linkable field1280;

	@ObfuscatedName("i.b(Z)Lnd;")
	public Linkable method497() {
		this.field1278 = 0;
		return this.method504();
	}

	@ObfuscatedName("i.a(Lnd;BJ)V")
	public void method498(Linkable arg0, long arg1) {
		if (arg0.field2105 != null) {
			arg0.method739();
		}
		Linkable var4 = this.field1273[(int) ((long) (this.field1268 - 1) & arg1)];
		arg0.field2087 = var4;
		arg0.field2073 = arg1;
		arg0.field2105 = var4.field2105;
		arg0.field2105.field2087 = arg0;
		arg0.field2087.field2105 = arg0;
	}

	@ObfuscatedName("i.a(JI)Lnd;")
	public Linkable method499(long arg0) {
		this.field1256 = arg0;
		Linkable var3 = this.field1273[(int) ((long) (this.field1268 - 1) & arg0)];
		for (this.field1272 = var3.field2087; this.field1272 != var3; this.field1272 = this.field1272.field2087) {
			if (this.field1272.field2073 == arg0) {
				Linkable var4 = this.field1272;
				this.field1272 = this.field1272.field2087;
				return var4;
			}
		}
		this.field1272 = null;
		return null;
	}

	@ObfuscatedName("i.b(I)Lnd;")
	public Linkable method501() {
		if (this.field1272 == null) {
			return null;
		}
		Linkable var2 = this.field1273[(int) (this.field1256 & (long) (this.field1268 - 1))];
		while (this.field1272 != var2) {
			if (this.field1272.field2073 == this.field1256) {
				Linkable var3 = this.field1272;
				this.field1272 = this.field1272.field2087;
				return var3;
			}
			this.field1272 = this.field1272.field2087;
		}
		this.field1272 = null;
		return null;
	}

	public HashTable(int arg0) {
		this.field1268 = arg0;
		this.field1273 = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = this.field1273[var2] = new Linkable();
			var3.field2087 = var3;
			var3.field2105 = var3;
		}
	}

	@ObfuscatedName("i.b(B)Lnd;")
	public Linkable method504() {
		if (this.field1278 > 0 && this.field1273[this.field1278 - 1] != this.field1280) {
			Linkable var1 = this.field1280;
			this.field1280 = var1.field2087;
			return var1;
		}
		while (this.field1268 > this.field1278) {
			Linkable var2 = this.field1273[this.field1278++].field2087;
			if (this.field1273[this.field1278 - 1] != var2) {
				this.field1280 = var2.field2087;
				return var2;
			}
		}
		return null;
	}
}
