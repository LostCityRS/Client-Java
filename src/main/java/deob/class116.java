package deob;

@ObfuscatedName("qe")
public final class class116 extends class40 {

	@ObfuscatedName("qe.v")
	public final class157 field2773 = new class157();

	@ObfuscatedName("qe.w")
	public final class157 field2774 = new class157();

	@ObfuscatedName("qe.x")
	public int field2775 = -1;

	@ObfuscatedName("qe.y")
	public int field2776 = 0;

	@ObfuscatedName("qe.a(Lfd;)V")
	public synchronized void method907(class40 arg0) {
		arg0.method1091();
	}

	@ObfuscatedName("qe.b([III)V")
	@Override
	public synchronized void method116(int[] arg0, int arg1, int arg2) {
		do {
			if (this.field2775 < 0) {
				this.method908(arg0, arg1, arg2);
				return;
			}
			if (this.field2776 + arg2 < this.field2775) {
				this.field2776 += arg2;
				this.method908(arg0, arg1, arg2);
				return;
			}
			int var4 = this.field2775 - this.field2776;
			this.method908(arg0, arg1, var4);
			arg1 += var4;
			arg2 -= var4;
			this.field2776 += var4;
			this.method911();
			class153 var5 = (class153) this.field2774.method1211();
			synchronized (var5) {
				int var7 = var5.method1188(this);
				if (var7 < 0) {
					var5.field3509 = 0;
					this.method913(var5);
				} else {
					var5.field3509 = var7;
					this.method909(var5.field3320, var5);
				}
			}
		} while (arg2 != 0);
	}

	@ObfuscatedName("qe.c([III)V")
	public void method908(int[] arg0, int arg1, int arg2) {
		for (class40 var4 = (class40) this.field2773.method1211(); var4 != null; var4 = (class40) this.field2773.method1209()) {
			var4.method320(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("qe.a(Lv;Lw;)V")
	public void method909(class146 arg0, class153 arg1) {
		while (arg0 != this.field2774.field3581 && ((class153) arg0).field3509 <= arg1.field3509) {
			arg0 = arg0.field3320;
		}
		this.field2774.method1216(arg1, arg0);
		this.field2775 = ((class153) this.field2774.field3581.field3320).field3509;
	}

	@ObfuscatedName("qe.d(I)V")
	@Override
	public synchronized void method104(int arg0) {
		do {
			if (this.field2775 < 0) {
				this.method910(arg0);
				return;
			}
			if (this.field2776 + arg0 < this.field2775) {
				this.field2776 += arg0;
				this.method910(arg0);
				return;
			}
			int var2 = this.field2775 - this.field2776;
			this.method910(var2);
			arg0 -= var2;
			this.field2776 += var2;
			this.method911();
			class153 var3 = (class153) this.field2774.method1211();
			synchronized (var3) {
				int var5 = var3.method1188(this);
				if (var5 < 0) {
					var3.field3509 = 0;
					this.method913(var3);
				} else {
					var3.field3509 = var5;
					this.method909(var3.field3320, var3);
				}
			}
		} while (arg0 != 0);
	}

	@ObfuscatedName("qe.c()Lfd;")
	@Override
	public class40 method106() {
		return (class40) this.field2773.method1211();
	}

	@ObfuscatedName("qe.e(I)V")
	public void method910(int arg0) {
		for (class40 var2 = (class40) this.field2773.method1211(); var2 != null; var2 = (class40) this.field2773.method1209()) {
			var2.method104(arg0);
		}
	}

	@ObfuscatedName("qe.b()Lfd;")
	@Override
	public class40 method113() {
		return (class40) this.field2773.method1209();
	}

	@ObfuscatedName("qe.e()V")
	public void method911() {
		if (this.field2776 <= 0) {
			return;
		}
		for (class153 var1 = (class153) this.field2774.method1211(); var1 != null; var1 = (class153) this.field2774.method1209()) {
			var1.field3509 -= this.field2776;
		}
		this.field2775 -= this.field2776;
		this.field2776 = 0;
	}

	@ObfuscatedName("qe.b(Lfd;)V")
	public synchronized void method912(class40 arg0) {
		this.field2773.method1207(arg0);
	}

	@ObfuscatedName("qe.a(Lw;)V")
	public void method913(class153 arg0) {
		arg0.method1091();
		arg0.method1189();
		class146 var2 = this.field2774.field3581.field3320;
		if (var2 == this.field2774.field3581) {
			this.field2775 = -1;
		} else {
			this.field2775 = ((class153) var2).field3509;
		}
	}

	@ObfuscatedName("qe.a()I")
	@Override
	public int method87() {
		return 0;
	}
}
