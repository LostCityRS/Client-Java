package deob;

@ObfuscatedName("fh")
public final class class64 {

	@ObfuscatedName("fh.a")
	public int field1157;

	@ObfuscatedName("fh.b")
	public long field1158 = 0L;

	@ObfuscatedName("fh.c")
	public class145 field1159;

	@ObfuscatedName("fh.d")
	public class145 field1160;

	@ObfuscatedName("fh.e")
	public int field1161;

	@ObfuscatedName("fh.g")
	public static class154 field1163 = new class154(32);

	@ObfuscatedName("fh.h")
	public int field1164;

	@ObfuscatedName("fh.k")
	public int field1167;

	@ObfuscatedName("fh.l")
	public int field1168;

	@ObfuscatedName("fh.m")
	public int field1169;

	@ObfuscatedName("fh.n")
	public static final class88 field1170 = class208.method1423(105, "auf einer freien Welt zu spielen)3");

	@ObfuscatedName("fh.o")
	public static final class118[] field1171 = new class118[4];

	@ObfuscatedName("fh.p")
	public int field1172;

	@ObfuscatedName("fh.q")
	public static int field1173 = 128;

	@ObfuscatedName("fh.a(IIZIII[Lia;I[BII)V")
	public static void method449(int arg0, int arg1, int arg2, int arg3, class89[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (var9 + arg0 > 0 && var9 + arg0 < 103 && arg7 + var10 > 0 && var10 + arg7 < 103) {
					arg4[arg8].field1667[arg0 + var9][arg7 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		class46 var11 = new class46(arg6);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (var12 == arg5 && var13 >= arg2 && var13 < arg2 + 8 && var14 >= arg3 && var14 < arg3 + 8) {
						class137.method914(class245.method1606(arg1, var13 & 0x7, var14 & 0x7) + arg0, var11, 0, 0, arg7 + class159.method1069(var14 & 0x7, var13 & 0x7, arg1), arg1, arg8);
					} else {
						class137.method914(-1, var11, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("fh.b(I)V")
	public static void method451() {
		class245.field4497 = false;
		class104.field1882 = false;
	}

	@ObfuscatedName("fh.a(B)V")
	public static void method452() {
		class245.field4497 = true;
		class104.field1882 = true;
	}
}
