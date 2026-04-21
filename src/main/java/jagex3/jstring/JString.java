package jagex3.jstring;

import deob.ObfuscatedName;
import jagex3.util.JagString;

public class JString {
	@ObfuscatedName("ad.G")
	public static byte[] field220 = new byte[]{95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

	@ObfuscatedName("td.a(IJ)La;")
	public static JagString toScreenName(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			long var2 = arg0;
			int var4 = 0;
			while (var2 != 0L) {
				var2 /= 37L;
				var4++;
			}
			byte[] var5 = new byte[var4];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var4--;
				var5[var4] = field220[(int) (var6 - arg0 * 37L)];
			}
			JagString var8 = new JagString();
			var8.charCode = var5;
			var8.length = var5.length;
			return var8;
		}
	}
}
