package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.PrivilegedRequest;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ah")
public final class ReflectionCheck extends Linkable {

	@ObfuscatedName("ah.t")
	public int size;

	@ObfuscatedName("ah.G")
	public int id;

	@ObfuscatedName("ah.x")
	public int[] type;

	@ObfuscatedName("ah.y")
	public int[] fieldValue;

	@ObfuscatedName("ah.B")
	public int[] error;

	@ObfuscatedName("ah.I")
	public PrivilegedRequest[] method;

	@ObfuscatedName("ah.K")
	public PrivilegedRequest[] field;

	@ObfuscatedName("ah.A")
	public byte[][][] methodArgs;

	@ObfuscatedName("vh.a(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class findClass(String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
