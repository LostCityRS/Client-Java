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
	public static String unpack(int arg0, Packet arg2) {
		int var3 = 0;
		int var4 = -1;
		for (int var6 = 0; var6 < arg0; var6++) {
			int var10 = arg2.g1();
			int var11 = var10 >> 4 & 0xF;
			if (var4 != -1) {
				charBuffer[var3++] = TABLE[(var4 << 4) + var11 - 195];
				var4 = -1;
			} else if (var11 < 13) {
				charBuffer[var3++] = TABLE[var11];
			} else {
				var4 = var11;
			}
			int var12 = var10 & 0xF;
			if (var4 != -1) {
				charBuffer[var3++] = TABLE[(var4 << 4) + var12 - 195];
				var4 = -1;
			} else if (var12 < 13) {
				charBuffer[var3++] = TABLE[var12];
			} else {
				var4 = var12;
			}
		}
		boolean var7 = true;
		for (int var8 = 0; var8 < var3; var8++) {
			char var9 = charBuffer[var8];
			if (var7 && var9 >= 'a' && var9 <= 'z') {
				charBuffer[var8] = (char) (charBuffer[var8] + -32);
				var7 = false;
			}
			if (var9 == '.' || var9 == '!') {
				var7 = true;
			}
		}
		return new String(charBuffer, 0, var3);
	}

	@ObfuscatedName("ac.a(Ljava/lang/String;ILmb;)V")
	public static void pack(String arg0, Packet arg2) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		String var3 = arg0.toLowerCase();
		int var4 = -1;
		for (int var5 = 0; var5 < var3.length(); var5++) {
			char var6 = var3.charAt(var5);
			int var7 = 0;
			for (int var8 = 0; var8 < TABLE.length; var8++) {
				if (TABLE[var8] == var6) {
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
					arg2.p1(var7);
				}
			} else if (var7 < 13) {
				arg2.p1((var4 << 4) + var7);
				var4 = -1;
			} else {
				arg2.p1((var4 << 4) + (var7 >> 4));
				var4 = var7 & 0xF;
			}
		}
		if (var4 != -1) {
			arg2.p1(var4 << 4);
		}
	}
}
