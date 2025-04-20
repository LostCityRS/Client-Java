package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("zb")
public class JString {

	@ObfuscatedName("zb.a")
	public static int field879 = 98;

	@ObfuscatedName("zb.b")
	public static int field880 = 354;

	@ObfuscatedName("zb.c")
	public static char[] field881 = new char[12];

	@ObfuscatedName("zb.d")
	public static char[] field882 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("zb.a(Ljava/lang/String;)J")
	public static long method309(String arg0) {
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

	@ObfuscatedName("zb.a(BJ)Ljava/lang/String;")
	public static String method310(byte arg0, long arg1) {
		if (arg0 != 88) {
			throw new NullPointerException();
		} else if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
			return "invalid_name";
		} else if (arg1 % 37L == 0L) {
			return "invalid_name";
		} else {
			int var3 = 0;
			while (arg1 != 0L) {
				long var4 = arg1;
				arg1 /= 37L;
				field881[11 - var3++] = field882[(int) (var4 - arg1 * 37L)];
			}
			return new String(field881, 12 - var3, var3);
		}
	}

	@ObfuscatedName("zb.a(ZLjava/lang/String;)J")
	public static long hashCode(boolean arg0, String arg1) {
		String var2 = arg1.toUpperCase();
		if (arg0) {
			throw new NullPointerException();
		}
		long var3 = 0L;
		for (int var5 = 0; var5 < var2.length(); var5++) {
			long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
			var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
		}
		return var3;
	}

	@ObfuscatedName("zb.a(IB)Ljava/lang/String;")
	public static String method312(int arg0, byte arg1) {
		if (arg1 != -35) {
			throw new NullPointerException();
		}
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@ObfuscatedName("zb.b(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method313(boolean arg0, String arg1) {
		if (!arg0) {
			throw new NullPointerException();
		} else if (arg1.length() > 0) {
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

	@ObfuscatedName("zb.c(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method314(boolean arg0, String arg1) {
		String var2 = arg1.toLowerCase();
		char[] var3 = var2.toCharArray();
		if (!arg0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		int var5 = var3.length;
		boolean var6 = true;
		for (int var7 = 0; var7 < var5; var7++) {
			char var8 = var3[var7];
			if (var6 && var8 >= 'a' && var8 <= 'z') {
				var3[var7] = (char) (var3[var7] + -32);
				var6 = false;
			}
			if (var8 == '.' || var8 == '!') {
				var6 = true;
			}
		}
		return new String(var3);
	}

	@ObfuscatedName("zb.d(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method315(boolean arg0, String arg1) {
		String var2 = "";
		if (arg0) {
			throw new NullPointerException();
		}
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			var2 = var2 + "*";
		}
		return var2;
	}
}
