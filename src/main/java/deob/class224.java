package deob;

@ObfuscatedName("uf")
public final class class224 extends class51 {

	@ObfuscatedName("uf.x")
	public final class248 field4214 = new class248();

	@ObfuscatedName("uf.y")
	public final class248 field4215 = new class248();

	@ObfuscatedName("uf.z")
	public int field4216 = -1;

	@ObfuscatedName("uf.A")
	public int field4217 = 0;

	@ObfuscatedName("uf.c([III)V")
	public void method1504(int[] arg0, int arg1, int arg2) {
		for (class51 var4 = (class51) this.field4214.method1610(); var4 != null; var4 = (class51) this.field4214.method1619()) {
			var4.method381(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("uf.e()V")
	public void method1505() {
		if (this.field4217 <= 0) {
			return;
		}
		for (class73 var1 = (class73) this.field4215.method1610(); var1 != null; var1 = (class73) this.field4215.method1619()) {
			var1.field1338 -= this.field4217;
		}
		this.field4216 -= this.field4217;
		this.field4217 = 0;
	}

	@ObfuscatedName("uf.a([III)V")
	@Override
	public synchronized void method379(int[] arg0, int arg1, int arg2) {
		do {
			if (this.field4216 < 0) {
				this.method1504(arg0, arg1, arg2);
				return;
			}
			if (this.field4217 + arg2 < this.field4216) {
				this.field4217 += arg2;
				this.method1504(arg0, arg1, arg2);
				return;
			}
			int var4 = this.field4216 - this.field4217;
			this.method1504(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.field4217 += var4;
			this.method1505();
			class73 var5 = (class73) this.field4215.method1610();
			synchronized (var5) {
				int var7 = var5.method500(this);
				if (var7 < 0) {
					var5.field1338 = 0;
					this.method1508(var5);
				} else {
					var5.field1338 = var7;
					this.method1510(var5.field1220, var5);
				}
			}
		} while (arg2 != 0);
	}

	@ObfuscatedName("uf.a()Lef;")
	@Override
	public class51 method380() {
		return (class51) this.field4214.method1619();
	}

	@ObfuscatedName("uf.b(I)V")
	@Override
	public synchronized void method384(int arg0) {
		do {
			if (this.field4216 < 0) {
				this.method1507(arg0);
				return;
			}
			if (this.field4217 + arg0 < this.field4216) {
				this.field4217 += arg0;
				this.method1507(arg0);
				return;
			}
			int var2 = this.field4216 - this.field4217;
			this.method1507(var2);
			arg0 -= var2;
			this.field4217 += var2;
			this.method1505();
			class73 var3 = (class73) this.field4215.method1610();
			synchronized (var3) {
				int var5 = var3.method500(this);
				if (var5 < 0) {
					var3.field1338 = 0;
					this.method1508(var3);
				} else {
					var3.field1338 = var5;
					this.method1510(var3.field1220, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("uf.c()I")
	@Override
	public int method383() {
		return 0;
	}

	@ObfuscatedName("uf.a(Lef;)V")
	public synchronized void method1506(class51 arg0) {
		this.field4214.method1615(arg0);
	}

	@ObfuscatedName("uf.c(I)V")
	public void method1507(int arg0) {
		for (class51 var2 = (class51) this.field4214.method1610(); var2 != null; var2 = (class51) this.field4214.method1619()) {
			var2.method384(arg0);
		}
	}

	@ObfuscatedName("uf.a(Lgg;)V")
	public void method1508(class73 arg0) {
		arg0.method460();
		arg0.method499();
		class67 var2 = this.field4215.field4534.field1220;
		if (var2 == this.field4215.field4534) {
			this.field4216 = -1;
		} else {
			this.field4216 = ((class73) var2).field1338;
		}
	}

	@ObfuscatedName("uf.b(Lef;)V")
	public synchronized void method1509(class51 arg0) {
		arg0.method460();
	}

	@ObfuscatedName("uf.d()Lef;")
	@Override
	public class51 method385() {
		return (class51) this.field4214.method1610();
	}

	@ObfuscatedName("uf.a(Lg;Lgg;)V")
	public void method1510(class67 arg0, class73 arg1) {
		while (arg0 != this.field4215.field4534 && ((class73) arg0).field1338 <= arg1.field1338) {
			arg0 = arg0.field1220;
		}
		this.field4215.method1620(arg1, arg0);
		this.field4216 = ((class73) this.field4215.field4534.field1220).field1338;
	}
}
