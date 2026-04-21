package jagex3.jstring;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;

public class StringTools {
	@ObfuscatedName("kd.B")
	public static JagString NULL = JagString.wrap("null");

	@ObfuscatedName("t.a(BI)Z")
	public static boolean method936(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("aa.a(BI)Z")
	public static boolean method45(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("wa.b(II)Z")
	public static boolean method1037(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("pe.a(III[La;)La;")
	public static JagString join(int arg0, int arg1, JagString[] arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			if (arg2[arg1 + var4] == null) {
				arg2[arg1 + var4] = NULL;
			}
			var3 += arg2[arg1 + var4].length;
		}
		byte[] var5 = new byte[var3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg0; var7++) {
			JagString var8 = arg2[arg1 + var7];
			ArrayUtil.copy(var8.charCode, 0, var5, var6, var8.length);
			var6 += var8.length;
		}
		JagString var9 = new JagString();
		var9.length = var3;
		var9.charCode = var5;
		return var9;
	}
}
