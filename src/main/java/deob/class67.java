package deob;

@ObfuscatedName("g")
public class class67 {

	@ObfuscatedName("g.b")
	public static class22 field1204;

	@ObfuscatedName("g.d")
	public static int field1206 = 0;

	@ObfuscatedName("g.e")
	public static int field1207 = 0;

	@ObfuscatedName("g.f")
	public static int field1208 = 0;

	@ObfuscatedName("g.h")
	public static short[] field1210;

	@ObfuscatedName("g.i")
	public static int field1211 = 1;

	@ObfuscatedName("g.j")
	public class67 field1212;

	@ObfuscatedName("g.l")
	public static final class88 field1214 = class208.method1423(105, "<)4col>");

	@ObfuscatedName("g.m")
	public static boolean field1215 = false;

	@ObfuscatedName("g.n")
	public static final class88 field1216 = class208.method1423(105, "Keine Antwort vom Server)3");

	@ObfuscatedName("g.p")
	public static int[] field1218;

	@ObfuscatedName("g.q")
	public long field1219;

	@ObfuscatedName("g.r")
	public class67 field1220;

	@ObfuscatedName("g.s")
	public static int field1221 = 0;

	@ObfuscatedName("g.a(ZLjava/lang/Object;I)[B")
	public static byte[] method457(boolean arg0, Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			byte[] var2 = (byte[]) arg1;
			return arg0 ? class179.method1276(var2) : var2;
		} else if (arg1 instanceof class1) {
			class1 var3 = (class1) arg1;
			return var3.method1();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("g.a(II)Lke;")
	public static class114 method458(int arg0) {
		class114 var1 = (class114) class17.field251.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = client.field567.method939(arg0, 5);
		class114 var3 = new class114();
		if (var2 != null) {
			var3.method775(new class46(var2));
		}
		class17.field251.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("g.a(I)Z")
	public final boolean method459() {
		return this.field1212 != null;
	}

	@ObfuscatedName("g.a(Z)V")
	public final void method460() {
		if (this.field1212 != null) {
			this.field1212.field1220 = this.field1220;
			this.field1220.field1212 = this.field1212;
			this.field1220 = null;
			this.field1212 = null;
		}
	}
}
