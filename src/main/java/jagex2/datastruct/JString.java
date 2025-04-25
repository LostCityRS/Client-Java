package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("zb")
public class JString {

	@ObfuscatedName("zb.c")
	public static char[] builder = new char[12];

	@ObfuscatedName("zb.d")
	public static char[] BASE37_LOOKUP = new char[] {
		'_',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
		'u', 'v', 'w', 'x', 'y', 'z',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
	};

	@ObfuscatedName("zb.a(Ljava/lang/String;)J")
	public static long toBase37(String s) {
		long hash = 0L;

		for (int i = 0; i < s.length() && i < 12; i++) {
			char c = s.charAt(i);
			hash *= 37L;

			if (c >= 'A' && c <= 'Z') {
				hash += c + 1 - 65;
			} else if (c >= 'a' && c <= 'z') {
				hash += c + 1 - 97;
			} else if (c >= '0' && c <= '9') {
				hash += c + 27 - 48;
			}
		}

		while (hash % 37L == 0L && hash != 0L) {
			hash /= 37L;
		}

		return hash;
	}

	@ObfuscatedName("zb.a(BJ)Ljava/lang/String;")
	public static String fromBase37(long username) {
		if (username <= 0L || username >= 6582952005840035281L) {
			return "invalid_name";
		} else if (username % 37L == 0L) {
			return "invalid_name";
		} else {
			int len = 0;

			while (username != 0L) {
				long last = username;
				username /= 37L;
				builder[11 - len++] = BASE37_LOOKUP[(int) (last - username * 37L)];
			}

			return new String(builder, 12 - len, len);
		}
	}

	@ObfuscatedName("zb.a(ZLjava/lang/String;)J")
	public static long hashCode(String s) {
		String upper = s.toUpperCase();

		long hash = 0L;
		for (int i = 0; i < upper.length(); i++) {
			hash = hash * 61L + (long) upper.charAt(i) - 32L;
			hash = hash + (hash >> 56) & 0xFFFFFFFFFFFFFFL;
		}

		return hash;
	}

	@ObfuscatedName("zb.a(IB)Ljava/lang/String;")
	public static String formatIPv4(int ip) {
		return (ip >> 24 & 0xFF) + "." + (ip >> 16 & 0xFF) + "." + (ip >> 8 & 0xFF) + "." + (ip & 0xFF);
	}

	@ObfuscatedName("zb.b(ZLjava/lang/String;)Ljava/lang/String;")
	public static String formatDisplayName(String username) {
		if (username.length() <= 0) {
			return username;
		}

		char[] chars = username.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '_') {
				chars[i] = ' ';

				if (i + 1 < chars.length && chars[i + 1] >= 'a' && chars[i + 1] <= 'z') {
					chars[i + 1] = (char) (chars[i + 1] + 'A' - 97);
				}
			}
		}

		if (chars[0] >= 'a' && chars[0] <= 'z') {
			chars[0] = (char) (chars[0] + 'A' - 97);
		}

		return new String(chars);
	}

	@ObfuscatedName("zb.c(ZLjava/lang/String;)Ljava/lang/String;")
	public static String toSentenceCase(String s) {
		String lower = s.toLowerCase();
		char[] chars = lower.toCharArray();
		int length = chars.length;

		boolean capital = true;
		for (int i = 0; i < length; i++) {
			char c = chars[i];

			if (capital && c >= 'a' && c <= 'z') {
				chars[i] = (char) (chars[i] + -32);
				capital = false;
			}

			if (c == '.' || c == '!') {
				capital = true;
			}
		}

		return new String(chars);
	}

	@ObfuscatedName("zb.d(ZLjava/lang/String;)Ljava/lang/String;")
	public static String censor(String s) {
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			temp = temp + "*";
		}

		return temp;
	}
}
