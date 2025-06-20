package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public class WordPack {

	@ObfuscatedName("ac.c")
	public static char[] charBuffer = new char[100];

	@ObfuscatedName("ac.d")
	public static char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("ac.a(IILmb;)Ljava/lang/String;")
	public static String unpack(int length, Packet buf) {
		int pos = 0;
		int carry = -1;

		for (int i = 0; i < length; i++) {
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

		boolean uppercase = true;
		for (int i = 0; i < pos; i++) {
			char c = charBuffer[i];
			if (uppercase && c >= 'a' && c <= 'z') {
				charBuffer[i] = (char) (charBuffer[i] + -32);
				uppercase = false;
			}

			if (c == '.' || c == '!') {
				uppercase = true;
			}
		}

		return new String(charBuffer, 0, pos);
	}

	@ObfuscatedName("ac.a(Ljava/lang/String;ILmb;)V")
	public static void pack(String str, Packet buf) {
		if (str.length() > 80) {
			str = str.substring(0, 80);
		}
		str = str.toLowerCase();

		int carry = -1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			int index = 0;
			for (int j = 0; j < TABLE.length; j++) {
				if (TABLE[j] == c) {
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
