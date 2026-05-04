package deob;

import java.io.UnsupportedEncodingException;

@ObfuscatedName("kb")
public final class class111 extends ModelSource {

	@ObfuscatedName("kb.o")
	public static int[] field2021;

	@ObfuscatedName("kb.p")
	public int field2022 = -32768;

	@ObfuscatedName("kb.r")
	public static final int[][][] field2024 = new int[4][13][13];

	@ObfuscatedName("kb.u")
	public static int field2027 = 0;

	@ObfuscatedName("kb.w")
	public int field2029;

	@ObfuscatedName("kb.x")
	public int field2030;

	@ObfuscatedName("kb.a(Li;Z)V")
	public static void method764(JagString arg0) {
		Statics.field319 = arg0;
		Statics.method1378();
	}

	@ObfuscatedName("kb.a(ILjava/lang/String;)Li;")
	public static JagString method765(String arg0) {
		byte[] var1;
		try {
			var1 = arg0.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException var4) {
			var1 = arg0.getBytes();
		}
		JagString var2 = new JagString();
		var2.length = 0;
		var2.chars = var1;
		for (int var3 = 0; var3 < var1.length; var3++) {
			if (var1[var3] != 0) {
				var1[var2.length++] = var1[var3];
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.b()I")
	@Override
	public int method88() {
		return this.field2022;
	}

	@ObfuscatedName("kb.a(IIIIIIIIJ)V")
	@Override
	public void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
		ModelLit var11 = ObjType.list(this.field2030).method1025(this.field2029, 0, null);
		if (var11 != null) {
			var11.method87(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.field2022 = var11.method88();
		}
	}
}
