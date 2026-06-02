package deob;

import jagex3.datastruct.HashTable;
import jagex3.jstring.JagString;

import java.util.Random;

public class Statics {
	@ObfuscatedName("tb.A")
	public static final JagString field3982 = JagString.wrap("(Y<)4col>");
	@ObfuscatedName("l.gb")
	public static final JagString field2199 = JagString.wrap("<)4col>");
	@ObfuscatedName("bc.c")
	public static final int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("db.M")
	public static final JagString field644 = JagString.wrap(" <col=ffffff>");
	@ObfuscatedName("te.Z")
	public static final JagString field4018 = JagString.wrap("m");
	@ObfuscatedName("k.S")
	public static final JagString field1973 = JagString.wrap(" x ");
	@ObfuscatedName("h.r")
	public static final JagString field1370 = JagString.wrap(" <col=ffff00>");
	@ObfuscatedName("nf.Mb")
	public static final JagString field2828 = JagString.wrap(" <col=00ff80>");
	@ObfuscatedName("ha.w")
	public static final JagString field1411 = JagString.wrap("");
	@ObfuscatedName("mj.n")
	public static final JagString field2612 = JagString.wrap(")3");
	@ObfuscatedName("ba.s")
	public static int field203 = 0;
	@ObfuscatedName("g.h")
	public static short[] field1210;
	@ObfuscatedName("ra.gb")
	public static int field3638 = 0;
	@ObfuscatedName("eg.w")
	public static int field941;
	@ObfuscatedName("ud.a")
	public static short field4179 = 32767;
	@ObfuscatedName("sh.H")
	public static int field3893;
	@ObfuscatedName("ne.a")
	public static JagString field2752 = null;
	@ObfuscatedName("sc.ab")
	public static int field3809;
	@ObfuscatedName("va.w")
	public static HashTable field4313;
	@ObfuscatedName("ia.L")
	public static int[] field1698;
	@ObfuscatedName("jd.g")
	public static int field1850;
	@ObfuscatedName("nh.l")
	public static int[] field2920;
	@ObfuscatedName("id.r")
	public static int[] field1734;

	@ObfuscatedName("o.a(II[Li;I[S)V")
	public static void method1037(int arg0, JagString[] arg1, int arg2, short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		int var4 = (arg0 + arg2) / 2;
		JagString var5 = arg1[var4];
		arg1[var4] = arg1[arg2];
		int var6 = arg0;
		arg1[arg2] = var5;
		short var7 = arg3[var4];
		arg3[var4] = arg3[arg2];
		arg3[arg2] = var7;
		for (int var8 = arg0; var8 < arg2; var8++) {
			if (var5 == null || arg1[var8] != null && arg1[var8].compare(var5) < (var8 & 0x1)) {
				JagString var9 = arg1[var8];
				arg1[var8] = arg1[var6];
				arg1[var6] = var9;
				short var10 = arg3[var8];
				arg3[var8] = arg3[var6];
				arg3[var6++] = var10;
			}
		}
		arg1[arg2] = arg1[var6];
		arg1[var6] = var5;
		arg3[arg2] = arg3[var6];
		arg3[var6] = var7;
		method1037(arg0, arg1, var6 - 1, arg3);
		method1037(var6 + 1, arg1, arg2, arg3);
	}

	@ObfuscatedName("td.a(IIB)I")
	public static int method1439(int arg0, int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			int var2 = arg1 % arg0;
			arg1 = arg0;
			arg0 = var2;
		}
		return arg1;
	}

	@ObfuscatedName("bg.a(II)I")
	public static int method96(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; method534(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	@ObfuscatedName("jj.a(I)V")
	public static void method740() {
		if (field1734 != null && field2920 != null) {
			return;
		}
		field1734 = new int[256];
		field2920 = new int[256];
		for (int var0 = 0; var0 < 256; var0++) {
			double var1 = (double) var0 / 255.0D * 6.283185307179586D;
			field1734[var0] = (int) (Math.sin(var1) * 4096.0D);
			field2920[var0] = (int) (Math.cos(var1) * 4096.0D);
		}
	}

	@ObfuscatedName("sd.a([SI[Li;)V")
	public static void method1376(short[] arg0, JagString[] arg1) {
		method1037(0, arg1, arg1.length - 1, arg0);
	}

	@ObfuscatedName("oh.a(III)I")
	public static int method1080(int arg0, int arg1) {
		int var2 = arg1 - 1 & arg0 >> 31;
		return var2 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@ObfuscatedName("hc.b(IBI)I")
	public static int method534(int arg0, int arg1) {
		int var2 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				var2 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("kj.a(ILjava/util/Random;I)I")
	public static int method812(int arg0, Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (method1017(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			int var2 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			int var3;
			do {
				var3 = arg1.nextInt();
			} while (var2 <= var3);
			return method1080(var3, arg0);
		}
	}

	@ObfuscatedName("ng.c(II)Z")
	public static boolean method1017(int arg0) {
		return (-arg0 & arg0) == arg0;
	}

}
