package deob;

@ObfuscatedName("sg")
public final class class203 extends class50 {

	@ObfuscatedName("sg.v")
	public final int field3869;

	@ObfuscatedName("sg.E")
	public final int field3878;

	@ObfuscatedName("sg.z")
	public final int field3873;

	@ObfuscatedName("sg.A")
	public final int field3874;

	public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		super(-1, arg4, arg5);
		this.field3878 = arg0;
		this.field3869 = arg3;
		this.field3873 = arg2;
		this.field3874 = arg1;
	}

	@ObfuscatedName("sg.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
	}

	@ObfuscatedName("sg.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
	}

	@ObfuscatedName("sg.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = arg0 * this.field3878 >> 12;
		int var4 = arg0 * this.field3873 >> 12;
		int var5 = arg1 * this.field3874 >> 12;
		int var6 = this.field3869 * arg1 >> 12;
		Statics.method1529(var3, var6, var4, var5, super.field927);
	}
}
