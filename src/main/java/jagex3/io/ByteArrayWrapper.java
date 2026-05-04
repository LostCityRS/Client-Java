package jagex3.io;

import deob.ObfuscatedName;

@ObfuscatedName("a")
public abstract class ByteArrayWrapper {

	@ObfuscatedName("aj.fb")
	public static boolean field166 = false;

	@ObfuscatedName("pe.a(ZB[B)Ljava/lang/Object;")
	public static Object method1153(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !field166) {
			try {
				ByteArrayWrapper var1 = (ByteArrayWrapper) Class.forName("jagex3.datastruct.ByteBufferNode").getDeclaredConstructor().newInstance();
				var1.method4(arg0);
				return var1;
			} catch (Throwable var2) {
				field166 = true;
			}
		}
		return arg0;
	}

	@ObfuscatedName("a.a(B)[B")
	public abstract byte[] method1();

	@ObfuscatedName("a.a(I[B)V")
	public abstract void method4(byte[] arg0);
}
