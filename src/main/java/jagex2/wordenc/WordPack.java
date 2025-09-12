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
	public static String unpack(int arg1, Packet arg2) {
		int var3 = 0;
		int var4 = -1;
		for (int var5 = 0; var5 < arg1; var5++) {
			int var6 = arg2.g1();
			int var7 = var6 >> 4 & 0xF;
			if (var4 != -1) {
				charBuffer[var3++] = TABLE[(var4 << 4) + var7 - 195];
				var4 = -1;
			} else if (var7 < 13) {
				charBuffer[var3++] = TABLE[var7];
			} else {
				var4 = var7;
			}
			int var8 = var6 & 0xF;
			if (var4 != -1) {
				charBuffer[var3++] = TABLE[(var4 << 4) + var8 - 195];
				var4 = -1;
			} else if (var8 < 13) {
				charBuffer[var3++] = TABLE[var8];
			} else {
				var4 = var8;
			}
		}
		boolean var9 = true;
		for (int var10 = 0; var10 < var3; var10++) {
			char var11 = charBuffer[var10];
			if (var9 && var11 >= 'a' && var11 <= 'z') {
				charBuffer[var10] = (char) (charBuffer[var10] + -32);
				var9 = false;
			}
			if (var11 == '.' || var11 == '!') {
				var9 = true;
			}
		}
		return new String(charBuffer, 0, var3);
	}

	@ObfuscatedName("ac.a(ILmb;Ljava/lang/String;)V")
	public static void pack(Packet arg1, String arg2) {
		if (arg2.length() > 80) {
			arg2 = arg2.substring(0, 80);
		}
		String var3 = arg2.toLowerCase();
		int var4 = -1;
		for (int var5 = 0; var5 < var3.length(); var5++) {
			char var6 = var3.charAt(var5);
			int var7 = 0;
			for (int var8 = 0; var8 < TABLE.length; var8++) {
				if (var6 == TABLE[var8]) {
					var7 = var8;
					break;
				}
			}
			if (var7 > 12) {
				var7 += 195;
			}
			if (var4 == -1) {
				if (var7 < 13) {
					var4 = var7;
				} else {
					arg1.p1(var7);
				}
			} else if (var7 < 13) {
				arg1.p1((var4 << 4) + var7);
				var4 = -1;
			} else {
				arg1.p1((var4 << 4) + (var7 >> 4));
				var4 = var7 & 0xF;
			}
		}
		if (var4 != -1) {
			arg1.p1(var4 << 4);
		}
	}
}
