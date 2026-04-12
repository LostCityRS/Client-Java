package deob;

@ObfuscatedName("i")
public final class class48 {

	@ObfuscatedName("i.b")
	public long field1256;

	@ObfuscatedName("i.e")
	public static class1 field1259 = Statics.method931("l");

	@ObfuscatedName("i.f")
	public static int field1260 = 0;

	@ObfuscatedName("i.j")
	public static class1 field1264 = Statics.method931("Ung-Ultige Session)2ID)3");

	@ObfuscatedName("i.n")
	public final int field1268;

	@ObfuscatedName("i.o")
	public static class1 field1269 = Statics.method931("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@ObfuscatedName("i.q")
	public static boolean field1271 = false;

	@ObfuscatedName("i.r")
	public class82 field1272;

	@ObfuscatedName("i.s")
	public final class82[] field1273;

	@ObfuscatedName("i.u")
	public static class1 field1275 = Statics.method931(" (X");

	@ObfuscatedName("i.y")
	public static int field1279 = -1;

	@ObfuscatedName("i.x")
	public int field1278 = 0;

	@ObfuscatedName("i.z")
	public class82 field1280;

	@ObfuscatedName("i.b(Z)Lnd;")
	public class82 method497() {
		this.field1278 = 0;
		return this.method504();
	}

	@ObfuscatedName("i.a(Lnd;BJ)V")
	public void method498(class82 arg0, long arg1) {
		if (arg0.field2105 != null) {
			arg0.method739();
		}
		class82 var4 = this.field1273[(int) ((long) (this.field1268 - 1) & arg1)];
		arg0.field2087 = var4;
		arg0.field2073 = arg1;
		arg0.field2105 = var4.field2105;
		arg0.field2105.field2087 = arg0;
		arg0.field2087.field2105 = arg0;
	}

	@ObfuscatedName("i.a(JI)Lnd;")
	public class82 method499(long arg0) {
		this.field1256 = arg0;
		class82 var3 = this.field1273[(int) ((long) (this.field1268 - 1) & arg0)];
		for (this.field1272 = var3.field2087; this.field1272 != var3; this.field1272 = this.field1272.field2087) {
			if (this.field1272.field2073 == arg0) {
				class82 var4 = this.field1272;
				this.field1272 = this.field1272.field2087;
				return var4;
			}
		}
		this.field1272 = null;
		return null;
	}

	@ObfuscatedName("i.b(I)Lnd;")
	public class82 method501() {
		if (this.field1272 == null) {
			return null;
		}
		class82 var2 = this.field1273[(int) (this.field1256 & (long) (this.field1268 - 1))];
		while (this.field1272 != var2) {
			if (this.field1272.field2073 == this.field1256) {
				class82 var3 = this.field1272;
				this.field1272 = this.field1272.field2087;
				return var3;
			}
			this.field1272 = this.field1272.field2087;
		}
		this.field1272 = null;
		return null;
	}

	public class48(int arg0) {
		this.field1268 = arg0;
		this.field1273 = new class82[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			class82 var3 = this.field1273[var2] = new class82();
			var3.field2087 = var3;
			var3.field2105 = var3;
		}
	}

	@ObfuscatedName("i.b(B)Lnd;")
	public class82 method504() {
		if (this.field1278 > 0 && this.field1273[this.field1278 - 1] != this.field1280) {
			class82 var1 = this.field1280;
			this.field1280 = var1.field2087;
			return var1;
		}
		while (this.field1268 > this.field1278) {
			class82 var2 = this.field1273[this.field1278++].field2087;
			if (this.field1273[this.field1278 - 1] != var2) {
				this.field1280 = var2.field2087;
				return var2;
			}
		}
		return null;
	}
}
