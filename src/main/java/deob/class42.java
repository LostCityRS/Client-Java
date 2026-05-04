package deob;

@ObfuscatedName("dh")
public final class class42 implements Runnable {

	@ObfuscatedName("dh.b")
	public static final class88 field710 = class208.method1423(105, "Null");

	@ObfuscatedName("dh.d")
	public static final class88 field712 = class208.method1423(105, "Username: ");

	@ObfuscatedName("dh.e")
	public static class88 field713 = field712;

	@ObfuscatedName("dh.f")
	public static final class248 field714 = new class248();

	@ObfuscatedName("dh.g")
	public final Object field715 = new Object();

	@ObfuscatedName("dh.i")
	public boolean field717 = true;

	@ObfuscatedName("dh.j")
	public int field718 = 0;

	@ObfuscatedName("dh.k")
	public final int[] field719 = new int[500];

	@ObfuscatedName("dh.l")
	public final int[] field720 = new int[500];

	@ObfuscatedName("dh.m")
	public static final class88 field721 = class208.method1423(105, "Wordpack geladen)3");

	@ObfuscatedName("dh.b(B)V")
	public static void method276() {
		class64.field1163 = new class154(32);
	}

	@Override
	public void run() {
		while (this.field717) {
			Object var1 = this.field715;
			synchronized (this.field715) {
				if (this.field718 < 500) {
					this.field720[this.field718] = class28.field471;
					this.field719[this.field718] = class239.field4449;
					this.field718++;
				}
			}
			class21.method98(50L);
		}
	}
}
