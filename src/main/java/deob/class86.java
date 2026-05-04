package deob;

@ObfuscatedName("hi")
public abstract class class86 {

	@ObfuscatedName("hi.b")
	public static int field1550 = 0;

	@ObfuscatedName("hi.d")
	public static int field1552 = -1;

	@ObfuscatedName("hi.i")
	public static final int[] field1557 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("hi.a(IBIII)V")
	public static void method580(int arg0, int arg1, int arg2, int arg3) {
		if (Statics.field1207 <= arg3 && arg3 <= Statics.field183) {
			int var4 = Statics.method1058(Statics.field919, Statics.field279, arg2);
			int var5 = Statics.method1058(Statics.field919, Statics.field279, arg1);
			SeqType.method753(arg0, var4, arg3, var5);
		}
	}

	@ObfuscatedName("hi.a(IZ)V")
	public static void method581(int arg0) {
		Statics.field772 = arg0;
		Statics.field1012 = 50;
	}

	@ObfuscatedName("s.e(I)Lhi;")
	public static class86 method1358() {
		try {
			return (class86) Class.forName("deob.class182").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new class32();
		}
	}

	@ObfuscatedName("hi.a(B)V")
	public abstract void method205();

	@ObfuscatedName("hi.a(III)I")
	public abstract int method204(int arg0, int arg1);
}
