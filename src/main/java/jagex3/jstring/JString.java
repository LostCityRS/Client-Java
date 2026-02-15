package jagex3.jstring;

import deob.ObfuscatedName;
import jagex3.util.JagString;

public class JString {
	@ObfuscatedName("e.s")
	public static byte[] field519 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@ObfuscatedName("ba.a(JI)Lec;")
	public static JagString toRawUsername(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
				var2++;
			}
			byte[] var5 = new byte[var2];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var2--;
				var5[var2] = field519[(int) (var6 - arg0 * 37L)];
			}
			JagString var8 = new JagString();
			var8.data = var5;
			var8.length = var5.length;
			return var8;
		}
	}
}
