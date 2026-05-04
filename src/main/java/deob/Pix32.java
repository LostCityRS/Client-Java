package deob;

@ObfuscatedName("rc")
public abstract class Pix32 extends Linkable2 {

	@ObfuscatedName("rc.D")
	public int field3643;

	@ObfuscatedName("rc.F")
	public int field3645;

	@ObfuscatedName("rc.J")
	public int field3649;

	@ObfuscatedName("rc.M")
	public int field3652;

	@ObfuscatedName("rc.N")
	public int field3653;

	@ObfuscatedName("rc.O")
	public int field3654;

	@ObfuscatedName("rc.a(IIII)V")
	public abstract void method1162(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("rc.b(II)V")
	public abstract void method1161(int arg0, int arg1);

	@ObfuscatedName("rc.a(IIIIII)V")
	public abstract void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("rc.a(ZIIII)V")
	public final void method1309(int arg0, int arg1, int arg2, int arg3) {
		int var5 = this.field3645 << 3;
		int var6 = (var5 & 0xF) + (arg0 << 4);
		int var7 = this.field3649 << 3;
		int var8 = (var7 & 0xF) + (arg1 << 4);
		this.method1166(var7, var5, var8, var6, arg3, arg2);
	}

	@ObfuscatedName("rc.a(IIIII)V")
	public abstract void method1174(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("rc.a(III)V")
	public abstract void method1164(int arg0, int arg1, int arg2);

	@ObfuscatedName("rc.b(IIII)V")
	public abstract void method1160(int arg0, int arg1);

	@ObfuscatedName("rc.c(II)V")
	public abstract void method1155(int arg0, int arg1);
}
