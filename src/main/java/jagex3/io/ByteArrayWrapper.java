package jagex3.io;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

@ObfuscatedName("sf")
public abstract class ByteArrayWrapper {

	@ObfuscatedName("qd.vc")
	public static boolean useDirectBuffer = false;

	@ObfuscatedName("tc.a(ZILjava/lang/Object;)[B")
	public static byte[] unwrap(boolean arg0, Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			byte[] var2 = (byte[]) arg1;
			return arg0 ? ArrayUtil.copy(var2) : var2;
		} else if (arg1 instanceof ByteArrayWrapper) {
			ByteArrayWrapper var3 = (ByteArrayWrapper) arg1;
			return var3.toByteArray();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("kd.a(I[BZ)Ljava/lang/Object;")
	public static Object wrap(byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !useDirectBuffer) {
			try {
				ByteArrayWrapper var1 = (ByteArrayWrapper) Class.forName("jagex3.io.ByteBufferNode").getDeclaredConstructor().newInstance();
				var1.set(arg0);
				return var1;
			} catch (Throwable var2) {
				useDirectBuffer = true;
			}
		}
		return arg0;
	}

	@ObfuscatedName("sf.a([BB)V")
	public abstract void set(byte[] arg0);

	@ObfuscatedName("sf.a(B)[B")
	public abstract byte[] toByteArray();
}
