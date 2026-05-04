package deob;

@ObfuscatedName("ef")
public abstract class class51 extends class67 {

	@ObfuscatedName("ef.t")
	public int field934;

	@ObfuscatedName("ef.u")
	public class69 field935;

	@ObfuscatedName("ef.v")
	public class51 field936;

	@ObfuscatedName("ef.w")
	public volatile boolean field937 = true;

	@ObfuscatedName("ef.a([III)V")
	public abstract void method379(int[] arg0, int arg1, int arg2);

	@ObfuscatedName("ef.a()Lef;")
	public abstract class51 method380();

	@ObfuscatedName("ef.b([III)V")
	public final void method381(int[] arg0, int arg1, int arg2) {
		if (this.field937) {
			this.method379(arg0, arg1, arg2);
		} else {
			this.method384(arg2);
		}
	}

	@ObfuscatedName("ef.b()I")
	public int method382() {
		return 255;
	}

	@ObfuscatedName("ef.c()I")
	public abstract int method383();

	@ObfuscatedName("ef.b(I)V")
	public abstract void method384(int arg0);

	@ObfuscatedName("ef.d()Lef;")
	public abstract class51 method385();
}
