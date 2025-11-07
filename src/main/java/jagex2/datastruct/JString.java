package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("zb")
public class JString {

	@ObfuscatedName("zb.f")
	public static final char[] BASE37_LOOKUP = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("zb.a(Ljava/lang/String;)J")
	public static long toBase37(String arg0) {
		long var1 = 0L;
		for (int var3 = 0; var3 < arg0.length() && var3 < 12; var3++) {
			char var4 = arg0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += var4 + 1 - 65;
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += var4 + 1 - 97;
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += var4 + 27 - 48;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("zb.a(JZ)Ljava/lang/String;")
	public static String fromBase37(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return "invalid_name";
		} else if (arg0 % 37L == 0L) {
			return "invalid_name";
		} else {
			int var3 = 0;
			char[] var4 = new char[12];
			while (arg0 != 0L) {
				long var5 = arg0;
				arg0 /= 37L;
				var4[11 - var3++] = BASE37_LOOKUP[(int) (var5 - arg0 * 37L)];
			}
			return new String(var4, 12 - var3, var3);
		}
	}

	@ObfuscatedName("zb.a(ILjava/lang/String;)J")
	public static long hashCode(String arg1) {
		String var2 = arg1.toUpperCase();
		long var3 = 0L;
		for (int var5 = 0; var5 < var2.length(); var5++) {
			long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
			var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
		}
		return var3;
	}

	@ObfuscatedName("zb.a(BI)Ljava/lang/String;")
	public static String formatIPv4(int arg1) {
		return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
	}

	@ObfuscatedName("zb.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static String formatDisplayName(String arg1) {
		if (arg1.length() > 0) {
			char[] var2 = arg1.toCharArray();
			for (int var3 = 0; var3 < var2.length; var3++) {
				if (var2[var3] == '_') {
					var2[var3] = ' ';
					if (var3 + 1 < var2.length && var2[var3 + 1] >= 'a' && var2[var3 + 1] <= 'z') {
						var2[var3 + 1] = (char) (var2[var3 + 1] + 'A' - 97);
					}
				}
			}
			if (var2[0] >= 'a' && var2[0] <= 'z') {
				var2[0] = (char) (var2[0] + 'A' - 97);
			}
			return new String(var2);
		} else {
			return arg1;
		}
	}

	@ObfuscatedName("zb.b(ILjava/lang/String;)Ljava/lang/String;")
	public static String toSentenceCase(String arg1) {
		String var2 = arg1.toLowerCase();
		char[] var3 = var2.toCharArray();
		int var4 = var3.length;
		boolean var5 = true;
		for (int var6 = 0; var6 < var4; var6++) {
			char var7 = var3[var6];
			if (var5 && var7 >= 'a' && var7 <= 'z') {
				var3[var6] = (char) (var3[var6] + -32);
				var5 = false;
			}
			if (var7 == '.' || var7 == '!') {
				var5 = true;
			}
		}
		return new String(var3);
	}

	@ObfuscatedName("zb.a(BLjava/lang/String;)Ljava/lang/String;")
	public static String censor(String arg1) {
		StringBuffer var2 = new StringBuffer();
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			var2.append("*");
		}
		return var2.toString();
	}
}
