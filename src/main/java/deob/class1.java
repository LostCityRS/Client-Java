package deob;

@ObfuscatedName("a")
public abstract class class1 {

	@ObfuscatedName("pe.a(ZB[B)Ljava/lang/Object;")
	public static Object method1153(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Statics.field166) {
			try {
				class1 var1 = (class1) Class.forName("deob.class183").getDeclaredConstructor().newInstance();
				var1.method4(arg0);
				return var1;
			} catch (Throwable var2) {
				Statics.field166 = true;
			}
		}
		return arg0;
	}

	@ObfuscatedName("a.a(B)[B")
	public abstract byte[] method1();

	@ObfuscatedName("a.a(I[B)V")
	public abstract void method4(byte[] arg0);
}
