package jagex3.reflectionchecker;

import deob.ObfuscatedName;
import jagex3.client.PrivilegedRequest;
import jagex3.datastruct.Linkable;

@ObfuscatedName("ah")
public final class ReflectionCheck extends Linkable {

	@ObfuscatedName("ah.t")
	public int field124;

	@ObfuscatedName("ah.G")
	public int field136;

	@ObfuscatedName("ah.x")
	public int[] field128;

	@ObfuscatedName("ah.y")
	public int[] field129;

	@ObfuscatedName("ah.B")
	public int[] field132;

	@ObfuscatedName("ah.I")
	public PrivilegedRequest[] field138;

	@ObfuscatedName("ah.K")
	public PrivilegedRequest[] field139;

	@ObfuscatedName("ah.A")
	public byte[][][] field131;

	@ObfuscatedName("vh.a(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1574(String arg0) throws ClassNotFoundException {
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
