package deob;

@ObfuscatedName("fd")
public abstract class class40 extends class146 {

	@ObfuscatedName("fd.r")
	public class40 field944;

	@ObfuscatedName("fd.s")
	public int field945;

	@ObfuscatedName("fd.t")
	public class95 field946;

	@ObfuscatedName("fd.u")
	public volatile boolean field947 = true;

	@ObfuscatedName("fd.a()I")
	public abstract int method87();

	@ObfuscatedName("fd.a([III)V")
	public final void method320(int[] arg0, int arg1, int arg2) {
		if (this.field947) {
			this.method116(arg0, arg1, arg2);
		} else {
			this.method104(arg2);
		}
	}

	@ObfuscatedName("fd.b([III)V")
	public abstract void method116(int[] arg0, int arg1, int arg2);

	@ObfuscatedName("fd.b()Lfd;")
	public abstract class40 method113();

	@ObfuscatedName("fd.d(I)V")
	public abstract void method104(int arg0);

	@ObfuscatedName("fd.c()Lfd;")
	public abstract class40 method106();

	@ObfuscatedName("fd.d()I")
	public int method321() {
		return 255;
	}
}
