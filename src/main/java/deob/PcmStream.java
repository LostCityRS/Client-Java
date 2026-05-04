package deob;

@ObfuscatedName("ef")
public abstract class PcmStream extends Linkable {

	@ObfuscatedName("ef.t")
	public int field934;

	@ObfuscatedName("ef.u")
	public PcmStreamable field935;

	@ObfuscatedName("ef.v")
	public PcmStream field936;

	@ObfuscatedName("ef.w")
	public volatile boolean field937 = true;

	@ObfuscatedName("ef.a([III)V")
	public abstract void method379(int[] arg0, int arg1, int arg2);

	@ObfuscatedName("ef.a()Lef;")
	public abstract PcmStream method380();

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
	public abstract PcmStream method385();
}
