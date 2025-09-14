package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public class WordPack {

	@ObfuscatedName("ac.b")
	public static char[] charBuffer = new char[100];

	@ObfuscatedName("ac.c")
	public static char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("ac.a(IILmb;)Ljava/lang/String;")
	public static String unpack(int len, Packet buf) {
		int pos = 0;
		int carry = -1;
		for (int i = 0; i < len; i++) {
			int value = buf.g1();

			int nibble = value >> 4 & 0xF;
			if (carry != -1) {
				charBuffer[pos++] = TABLE[(carry << 4) + nibble - 195];
				carry = -1;
			} else if (nibble < 13) {
				charBuffer[pos++] = TABLE[nibble];
			} else {
				carry = nibble;
			}

			nibble = value & 0xF;
			if (carry != -1) {
				charBuffer[pos++] = TABLE[(carry << 4) + nibble - 195];
				carry = -1;
			} else if (nibble < 13) {
				charBuffer[pos++] = TABLE[nibble];
			} else {
				carry = nibble;
			}
		}

		boolean boundary = true;
		for (int i = 0; i < pos; i++) {
			char c = charBuffer[i];

			if (boundary && c >= 'a' && c <= 'z') {
				charBuffer[i] = (char) (charBuffer[i] + -32);
				boundary = false;
			}

			if (c == '.' || c == '!') {
				boundary = true;
			}
		}

		return new String(charBuffer, 0, pos);
	}

	@ObfuscatedName("ac.a(ILmb;Ljava/lang/String;)V")
	public static void pack(Packet buf, String s) {
		if (s.length() > 80) {
			s = s.substring(0, 80);
		}

		String lower = s.toLowerCase();

		int carry = -1;
		for (int i = 0; i < lower.length(); i++) {
			char c = lower.charAt(i);

			int index = 0;
			for (int j = 0; j < TABLE.length; j++) {
				if (c == TABLE[j]) {
					index = j;
					break;
				}
			}

			if (index > 12) {
				index += 195;
			}

			if (carry == -1) {
				if (index < 13) {
					carry = index;
				} else {
					buf.p1(index);
				}
			} else if (index < 13) {
				buf.p1((carry << 4) + index);
				carry = -1;
			} else {
				buf.p1((carry << 4) + (index >> 4));
				carry = index & 0xF;
			}
		}

		if (carry != -1) {
			buf.p1(carry << 4);
		}
	}
}
