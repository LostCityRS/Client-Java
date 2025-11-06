package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public class WordPack {

	@ObfuscatedName("ac.a")
	public static char[] field877 = new char[100];

	@ObfuscatedName("ac.b")
	public static char[] field878 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("ac.a(Lmb;II)Ljava/lang/String;")
	public static String method317(Packet arg0, int arg1, int arg2) {
		int var3 = 0;
		int var4 = -1;
		for (int var5 = 0; var5 < arg1; var5++) {
			int var6 = arg0.method239();
			int var7 = var6 >> 4 & 0xF;
			if (var4 != -1) {
				field877[var3++] = field878[(var4 << 4) + var7 - 195];
				var4 = -1;
			} else if (var7 < 13) {
				field877[var3++] = field878[var7];
			} else {
				var4 = var7;
			}
			int var8 = var6 & 0xF;
			if (var4 != -1) {
				field877[var3++] = field878[(var4 << 4) + var8 - 195];
				var4 = -1;
			} else if (var8 < 13) {
				field877[var3++] = field878[var8];
			} else {
				var4 = var8;
			}
		}
		boolean var9 = true;
		while (arg2 >= 0) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		for (int var11 = 0; var11 < var3; var11++) {
			char var12 = field877[var11];
			if (var9 && var12 >= 'a' && var12 <= 'z') {
				field877[var11] = (char) (field877[var11] + -32);
				var9 = false;
			}
			if (var12 == '.' || var12 == '!') {
				var9 = true;
			}
		}
		return new String(field877, 0, var3);
	}

	@ObfuscatedName("ac.a(Lmb;ILjava/lang/String;)V")
	public static void method318(Packet arg0, int arg1, String arg2) {
		if (arg2.length() > 80) {
			arg2 = arg2.substring(0, 80);
		}
		String var3 = arg2.toLowerCase();
		if (arg1 != 7) {
			return;
		}
		int var4 = -1;
		for (int var5 = 0; var5 < var3.length(); var5++) {
			char var6 = var3.charAt(var5);
			int var7 = 0;
			for (int var8 = 0; var8 < field878.length; var8++) {
				if (var6 == field878[var8]) {
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
					arg0.method229(var7);
				}
			} else if (var7 < 13) {
				arg0.method229((var4 << 4) + var7);
				var4 = -1;
			} else {
				arg0.method229((var4 << 4) + (var7 >> 4));
				var4 = var7 & 0xF;
			}
		}
		if (var4 != -1) {
			arg0.method229(var4 << 4);
		}
	}
}
