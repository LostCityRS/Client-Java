package jagex2.wordfilter;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("zb")
public final class WordPack {

	@ObfuscatedName("zb.a")
	public static final int field879 = 991;

	@ObfuscatedName("zb.b")
	public static int field880;

	@ObfuscatedName("zb.c")
	public static int field881;

	@ObfuscatedName("zb.d")
	public static final char[] builder = new char[100];

	@ObfuscatedName("zb.e")
	public static final Packet temp = new Packet(new byte[100], 15787);

	@ObfuscatedName("zb.f")
	public static final char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("zb.a(BLlb;I)Ljava/lang/String;")
	public static String unpack(Packet arg0, int arg1) {
		int var2 = 0;
		int var3 = -1;
		for (int var4 = 0; var4 < arg1; var4++) {
			int var5 = arg0.g1();
			int var6 = var5 >> 4 & 0xF;
			if (var3 != -1) {
				builder[var2++] = TABLE[(var3 << 4) + var6 - 0xC3];
				var3 = -1;
			} else if (var6 < 13) {
				builder[var2++] = TABLE[var6];
			} else {
				var3 = var6;
			}
			int var7 = var5 & 0xF;
			if (var3 != -1) {
				builder[var2++] = TABLE[(var3 << 4) + var7 - 0xC3];
				var3 = -1;
			} else if (var7 < 13) {
				builder[var2++] = TABLE[var7];
			} else {
				var3 = var7;
			}
		}
		boolean var8 = true;
		for (int var9 = 0; var9 < var2; var9++) {
			char var10 = builder[var9];
			if (var8 && var10 >= 'a' && var10 <= 'z') {
				builder[var9] = (char) (builder[var9] - 32);
				var8 = false;
			}
			if (var10 == '.' || var10 == '!' || var10 == '?') {
				var8 = true;
			}
		}
		return new String(builder, 0, var2);
	}

	@ObfuscatedName("zb.a(Ljava/lang/String;Llb;I)V")
	public static void pack(String arg0, Packet arg1) {
		if (arg0.length() > 80) {
			arg0 = arg0.substring(0, 80);
		}
		String var2 = arg0.toLowerCase();
		int var3 = -1;
		for (int var4 = 0; var4 < var2.length(); var4++) {
			char var5 = var2.charAt(var4);
			int var6 = 0;
			for (int var7 = 0; var7 < TABLE.length; var7++) {
				if (var5 == TABLE[var7]) {
					var6 = var7;
					break;
				}
			}
			if (var6 > 12) {
				var6 += 195;
			}
			if (var3 == -1) {
				if (var6 < 13) {
					var3 = var6;
				} else {
					arg1.p1(var6);
				}
			} else if (var6 < 13) {
				arg1.p1((var3 << 4) + var6);
				var3 = -1;
			} else {
				arg1.p1((var3 << 4) + (var6 >> 4));
				var3 = var6 & 0xF;
			}
		}
		if (var3 != -1) {
			arg1.p1(var3 << 4);
		}
	}

	@ObfuscatedName("zb.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method306(String arg0, int arg1) {
		temp.pos = 0;
		pack(arg0, temp);
		int var2 = temp.pos;
		if (arg1 != 0) {
			field880 = -64;
		}
		temp.pos = 0;
		return unpack(temp, var2);
	}
}
