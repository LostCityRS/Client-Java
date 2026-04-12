package deob;

@ObfuscatedName("vb")
public abstract class ModelSource extends Linkable2 {

	@ObfuscatedName("vb.tb")
	public static JagString[] field3130 = new JagString[100];

	@ObfuscatedName("vb.vb")
	public static long field3132 = 0L;

	@ObfuscatedName("vb.Gb")
	public static int field3143 = 0;

	@ObfuscatedName("vb.yb")
	public int field3135 = 1000;

	@ObfuscatedName("vb.a(IIIIIIIII)V")
	public void method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		ModelLit var10 = this.method41();
		if (var10 != null) {
			this.field3135 = var10.field3135;
			var10.method767(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("vb.f(I)Lpa;")
	public ModelLit method41() {
		return null;
	}
}
