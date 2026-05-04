package deob;

@ObfuscatedName("nj")
public final class class151 {

	@ObfuscatedName("nj.a")
	public static final class154 field2922 = new class154(32);

	@ObfuscatedName("nj.b")
	public static int field2923;

	@ObfuscatedName("nj.d")
	public static final class88 field2925 = class208.method1423(105, "Error connecting to server)3");

	@ObfuscatedName("nj.e")
	public static class88 field2926 = field2925;

	@ObfuscatedName("nj.g")
	public final class154 field2928 = new class154(256);

	@ObfuscatedName("nj.h")
	public final class144 field2929;

	@ObfuscatedName("nj.j")
	public static int field2931;

	@ObfuscatedName("nj.k")
	public static int field2932 = -1;

	@ObfuscatedName("nj.o")
	public final class144 field2936;

	@ObfuscatedName("nj.p")
	public final class154 field2937 = new class154(256);

	@ObfuscatedName("nj.q")
	public static int field2938 = 0;

	@ObfuscatedName("nj.s")
	public static int[] field2940;

	@ObfuscatedName("nj.t")
	public static final class88 field2941 = class208.method1423(105, "Loading sprites )2 ");

	@ObfuscatedName("nj.r")
	public static class88 field2939 = field2941;

	@ObfuscatedName("nj.a(BI)V")
	public static void method1031(int arg0) {
		class17 var1 = class43.field732;
		synchronized (class43.field732) {
			class190.field3668 = arg0;
		}
	}

	@ObfuscatedName("nj.a(IIIIIIII)V")
	public static void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		class13 var8 = new class13();
		var8.field204 = arg2 / 128;
		var8.field194 = arg3 / 128;
		var8.field187 = arg4 / 128;
		var8.field200 = arg5 / 128;
		var8.field190 = arg1;
		var8.field185 = arg2;
		var8.field193 = arg3;
		var8.field191 = arg4;
		var8.field205 = arg5;
		var8.field189 = arg6;
		var8.field196 = arg7;
		class62.field1149[arg0][class62.field1148[arg0]++] = var8;
	}

	public class151(class144 arg0, class144 arg1) {
		this.field2936 = arg1;
		this.field2929 = arg0;
	}

	@ObfuscatedName("nj.a(II[I)Ltf;")
	public class213 method1032(int arg0, int[] arg1) {
		if (this.field2929.method940() == 1) {
			return this.method1034(arg0, arg1, 0);
		} else if (this.field2929.method942(arg0) == 1) {
			return this.method1034(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nj.a([IIII)Ltf;")
	public class213 method1033(int[] arg0, int arg1, int arg2) {
		int var4 = arg2 ^ ((arg1 & 0xD0000FFF) << 4 | arg1 >>> 12);
		int var5 = var4 | arg1 << 16;
		long var6 = (long) var5 ^ 0x100000000L;
		class213 var8 = (class213) this.field2937.method1049(var6);
		if (var8 != null) {
			return var8;
		} else if (arg0 == null || arg0[0] > 0) {
			class195 var9 = (class195) this.field2928.method1049(var6);
			if (var9 == null) {
				var9 = class195.method1354(this.field2936, arg1, arg2);
				if (var9 == null) {
					return null;
				}
				this.field2928.method1052(var6, var9);
			}
			class213 var10 = var9.method1355(arg0);
			if (var10 == null) {
				return null;
			} else {
				var9.method460();
				this.field2937.method1052(var6, var10);
				return var10;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("nj.a(II[II)Ltf;")
	public class213 method1034(int arg0, int[] arg1, int arg2) {
		int var4 = (arg2 << 4 & 0xFFF4 | arg2 >>> 12) ^ arg0;
		int var5 = var4 | arg2 << 16;
		long var6 = (long) var5;
		class213 var8 = (class213) this.field2937.method1049(var6);
		if (var8 != null) {
			return var8;
		} else if (arg1 == null || arg1[0] > 0) {
			class38 var9 = class38.method252(this.field2929, arg2, arg0);
			if (var9 == null) {
				return null;
			}
			class213 var10 = var9.method253();
			this.field2937.method1052(var6, var10);
			if (arg1 != null) {
				arg1[0] -= var10.field4031.length;
			}
			return var10;
		} else {
			return null;
		}
	}

	@ObfuscatedName("nj.a([III)Ltf;")
	public class213 method1035(int[] arg0, int arg1) {
		if (this.field2936.method940() == 1) {
			return this.method1033(arg0, 0, arg1);
		} else if (this.field2936.method942(arg1) == 1) {
			return this.method1033(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
