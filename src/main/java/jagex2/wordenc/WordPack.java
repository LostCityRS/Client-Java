package jagex2.wordenc;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public class WordPack {

	@ObfuscatedName("ac.a")
	public static int field883 = 355;

	@ObfuscatedName("ac.b")
	public static boolean field884 = true;

	@ObfuscatedName("ac.c")
	public static char[] field885 = new char[100];

	@ObfuscatedName("ac.d")
	public static char[] field886 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("ac.a(IILmb;)Ljava/lang/String;")
	public static String method316(int arg0, int arg1, Packet arg2) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 39 / arg1;
		for (int var6 = 0; var6 < arg0; var6++) {
			int var10 = arg2.g1();
			int var11 = var10 >> 4 & 0xF;
			if (var4 != -1) {
				field885[var3++] = field886[(var4 << 4) + var11 - 195];
				var4 = -1;
			} else if (var11 < 13) {
				field885[var3++] = field886[var11];
			} else {
				var4 = var11;
			}
			int var12 = var10 & 0xF;
			if (var4 != -1) {
				field885[var3++] = field886[(var4 << 4) + var12 - 195];
				var4 = -1;
			} else if (var12 < 13) {
				field885[var3++] = field886[var12];
			} else {
				var4 = var12;
			}
		}
		boolean var7 = true;
		for (int var8 = 0; var8 < var3; var8++) {
			char var9 = field885[var8];
			if (var7 && var9 >= 'a' && var9 <= 'z') {
				field885[var8] = (char) (field885[var8] + -32);
				var7 = false;
			}
			if (var9 == '.' || var9 == '!') {
				var7 = true;
			}
		}
		return new String(field885, 0, var3);
	}

	@ObfuscatedName("ac.a(Ljava/lang/String;ILmb;)V")
	public static void method317(String arg0, int arg1, Packet arg2) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		String var3 = arg0.toLowerCase();
		int var4 = -1;
		for (int var5 = 0; var5 < var3.length(); var5++) {
			char var6 = var3.charAt(var5);
			int var7 = 0;
			for (int var8 = 0; var8 < field886.length; var8++) {
				if (field886[var8] == var6) {
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
		while (arg1 >= 0) {
			field884 = !field884;
		}
		if (var4 != -1) {
			arg2.p1(var4 << 4);
		}
	}
}
