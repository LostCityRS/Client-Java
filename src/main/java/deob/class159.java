package deob;

import java.awt.Graphics;

@ObfuscatedName("wf")
public final class class159 extends RuntimeException {

	@ObfuscatedName("wf.a")
	public String field3643;

	@ObfuscatedName("wf.b")
	public static class68 field3644;

	@ObfuscatedName("wf.e")
	public final Throwable field3647;

	@ObfuscatedName("wf.g")
	public static class157 field3649 = new class157();

	@ObfuscatedName("wf.h")
	public static class32 field3650 = class73.method593("Standort", true);

	@ObfuscatedName("wf.i")
	public static class32 field3651 = class73.method593("Hidden", true);

	@ObfuscatedName("wf.j")
	public static class32 field3652 = class73.method593("", true);

	@ObfuscatedName("wf.k")
	public static short[][] field3653 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	@ObfuscatedName("wf.m")
	public static class32 field3655 = field3651;

	@ObfuscatedName("wf.n")
	public static class32 field3656 = class73.method593("Regeln versto-8en hat)3", true);

	@ObfuscatedName("wf.o")
	public static class150 field3657;

	@ObfuscatedName("wf.p")
	public static int field3658 = 0;

	@ObfuscatedName("wf.a(Lnf;ILnf;)V")
	public static void method1226(class96 arg0, class96 arg1) {
		if (class117.field2792) {
			class50.method393(arg1, arg0);
			return;
		}
		if (class134.field3114 == 0 || class134.field3114 == 5) {
			arg1.method793(class158.field3642, 382, 225, 16777215, -1);
			class141.method1058(230, 233, 304, 34, 9179409);
			class141.method1058(231, 234, 302, 32, 0);
			class141.method1053(232, 235, class8.field142 * 3, 30, 9179409);
			class141.method1053(class8.field142 * 3 + 232, 235, 300 - class8.field142 * 3, 30, 0);
			arg1.method793(class74.field1743, 382, 256, 16777215, -1);
		}
		if (class134.field3114 == 20) {
			short var2 = 211;
			class4.field71.method399(382 - class4.field71.field1167 / 2, 271 - class4.field71.field1171 / 2);
			arg1.method793(class74.field1754, 382, 211, 16776960, 0);
			int var8 = var2 + 15;
			arg1.method793(class74.field1742, 382, 226, 16776960, 0);
			int var9 = var8 + 15;
			arg1.method793(class74.field1740, 382, 241, 16776960, 0);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg1.method791(class52.method402(new class32[] { class65.field1506, class99.method771(class74.field1751) }), 272, 266, 16777215, 0);
			int var13 = var11 + 15;
			arg1.method791(class52.method402(new class32[] { class37.field889, class74.field1738.method248() }), 274, 281, 16777215, 0);
			int var15 = var13 + 15;
		}
		if (class134.field3114 == 10) {
			class4.field71.method399(202, 171);
			if (class11.field189 == 0) {
				short var5 = 251;
				arg1.method793(class32.field626, 382, 251, 16776960, 0);
				class80.field1851.method399(229, 271);
				arg1.method769(class4.field73, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				int var21 = var5 + 30;
				class80.field1851.method399(389, 271);
				arg1.method769(class105.field2492, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (class11.field189 == 2) {
				short var4 = 211;
				arg1.method793(class74.field1754, 382, 211, 16776960, 0);
				int var17 = var4 + 15;
				arg1.method793(class74.field1742, 382, 226, 16776960, 0);
				int var19 = var17 + 15;
				arg1.method793(class74.field1740, 382, 241, 16776960, 0);
				int var20 = var19 + 15;
				int var22 = var20 + 10;
				arg1.method791(class52.method402(new class32[] { class65.field1506, class99.method771(class74.field1751), class135.field3134 == 0 & class140.field3217 % 40 < 20 ? class92.field2104 : class74.field1748 }), 272, 266, 16777215, 0);
				int var23 = var22 + 15;
				arg1.method791(class52.method402(new class32[] { class37.field889, class74.field1738.method248(), class140.field3217 % 40 < 20 & class135.field3134 == 1 ? class92.field2104 : class74.field1748 }), 274, 281, 16777215, 0);
				int var24 = var23 + 15;
				class80.field1851.method399(229, 301);
				arg1.method793(class37.field893, 302, 326, 16777215, 0);
				class80.field1851.method399(389, 301);
				arg1.method793(class92.field2114, 462, 326, 16777215, 0);
			} else if (class11.field189 == 3) {
				short var3 = 236;
				arg1.method793(class86.field2020, 382, 211, 16776960, 0);
				arg1.method793(class23.field421, 382, 236, 16777215, 0);
				int var12 = var3 + 15;
				arg1.method793(class98.field2277, 382, 251, 16777215, 0);
				int var14 = var12 + 15;
				arg1.method793(class43.field1003, 382, 266, 16777215, 0);
				int var16 = var14 + 15;
				arg1.method793(class105.field2489, 382, 281, 16777215, 0);
				class80.field1851.method399(309, 301);
				arg1.method793(class92.field2114, 382, 326, 16777215, 0);
				int var18 = var16 + 15;
			}
		}
		if (class154.field3526 != 1) {
			if (class66.field1570 > 0) {
				class72.method589(class66.field1570);
				class66.field1570 = 0;
			}
			class125.method977();
		}
		class14.field237[class30.field551 ? 1 : 0].method399(725, 463);
		if (class134.field3114 > 5 && class107.field2532 != 2 && class20.field371 == 0) {
			if (class156.field3565 == null) {
				class156.field3565 = class136.method1033(class74.field1748, class30.field572, class117.field2815);
			} else {
				class156.field3565.method399(5, 463);
				arg1.method793(class52.method402(new class32[] { class15.field260, class77.field1801, method1228(class86.field2014) }), 55, 478, 16777215, 0);
				if (class81.field1872 == null) {
					arg0.method793(class71.field1666, 55, 492, 16777215, 0);
				} else {
					arg0.method793(class72.field1708, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			Graphics var6 = class107.field2539.getGraphics();
			class50.field1157.method122(var6);
		} catch (Exception var7) {
			class107.field2539.repaint();
		}
	}

	@ObfuscatedName("wf.a(IBI)V")
	public static void method1227(int arg0, int arg1) {
		class4 var2 = class80.method636(arg1);
		int var3 = var2.field75;
		int var4 = var2.field78;
		int var5 = var2.field66;
		int var6 = class117.field2779[var4 - var5];
		if (arg0 < 0 || arg0 > var6) {
			arg0 = 0;
		}
		int var7 = var6 << var5;
		class27.field504[var3] = var7 & arg0 << var5 | class27.field504[var3] & ~var7;
	}

	@ObfuscatedName("wf.a(II)Lec;")
	public static class32 method1228(int arg0) {
		return class124.method975(arg0, false);
	}

	@ObfuscatedName("wf.a(ZILf;I)V")
	public static void method1229(int arg0, class36 arg1, int arg2) {
		if (arg1.field790 == 1) {
			class56.method442(0, arg1.field791, arg1.field743, 26, class77.field1786, 0);
		}
		if (arg1.field790 == 2 && !class151.field3468) {
			class32 var3 = class61.method459(arg1);
			if (var3 != null) {
				class56.method442(0, var3, arg1.field743, 8, class52.method402(new class32[] { class134.field3128, arg1.field833 }), -1);
			}
		}
		if (arg1.field790 == 3) {
			class56.method442(0, class70.field1656, arg1.field743, 4, class77.field1786, 0);
		}
		if (arg1.field790 == 4) {
			class56.method442(0, arg1.field791, arg1.field743, 40, class77.field1786, 0);
		}
		if (arg1.field790 == 5) {
			class56.method442(0, arg1.field791, arg1.field743, 34, class77.field1786, 0);
		}
		if (arg1.field790 == 6 && class50.field1158 == null) {
			class56.method442(0, arg1.field791, arg1.field743, 39, class77.field1786, -1);
		}
		if (arg1.field755 == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg1.field773; var5++) {
				for (int var6 = 0; var6 < arg1.field810; var6++) {
					int var7 = var6 * (arg1.field818 + 32);
					int var8 = (arg1.field784 + 32) * var5;
					if (var4 < 20) {
						var7 += arg1.field809[var4];
						var8 += arg1.field745[var4];
					}
					if (var7 <= arg2 && var8 <= arg0 && var7 + 32 > arg2 && arg0 < var8 + 32) {
						class48.field1123 = arg1;
						class81.field1856 = var4;
						if (arg1.field834[var4] > 0) {
							class62 var9 = class146.method1092(arg1.field834[var4] - 1);
							if (class125.field2913 == 1 && class103.method830(class147.method1100(arg1))) {
								if (class44.field1038 != arg1.field743 || class41.field966 != var4) {
									class56.method442(var9.field1399, class41.field965, arg1.field743, 25, class52.method402(new class32[] { class50.field1148, class48.field1132, var9.field1429 }), var4);
								}
							} else if (!class151.field3468 || !class103.method830(class147.method1100(arg1))) {
								class32[] var10 = var9.field1428;
								if (class94.field2164) {
									var10 = class125.method984(var10);
								}
								if (class103.method830(class147.method1100(arg1))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 19;
											} else {
												var12 = 35;
											}
											class56.method442(var9.field1399, var10[var11], arg1.field743, var12, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
										} else if (var11 == 4) {
											class56.method442(var9.field1399, class115.field2739, arg1.field743, 35, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
										}
									}
								}
								if (class157.method1210(class147.method1100(arg1))) {
									class56.method442(var9.field1399, class41.field965, arg1.field743, 21, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
								}
								if (class103.method830(class147.method1100(arg1)) && var10 != null) {
									for (int var13 = 2; var13 >= 0; var13--) {
										if (var10[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 17;
											}
											if (var13 == 1) {
												var14 = 30;
											}
											if (var13 == 2) {
												var14 = 7;
											}
											class56.method442(var9.field1399, var10[var13], arg1.field743, var14, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
										}
									}
								}
								class32[] var15 = arg1.field756;
								if (class94.field2164) {
									var15 = class125.method984(var15);
								}
								if (var15 != null) {
									for (int var16 = 4; var16 >= 0; var16--) {
										if (var15[var16] != null) {
											byte var17 = 0;
											if (var16 == 0) {
												var17 = 38;
											}
											if (var16 == 1) {
												var17 = 15;
											}
											if (var16 == 2) {
												var17 = 51;
											}
											if (var16 == 3) {
												var17 = 18;
											}
											if (var16 == 4) {
												var17 = 41;
											}
											class56.method442(var9.field1399, var15[var16], arg1.field743, var17, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
										}
									}
								}
								class56.method442(var9.field1399, class135.field3140, arg1.field743, 1004, class52.method402(new class32[] { class38.field902, var9.field1429 }), var4);
							} else if ((class88.field2045 & 0x10) == 16) {
								class56.method442(var9.field1399, class147.field3353, arg1.field743, 43, class52.method402(new class32[] { class14.field234, class48.field1132, var9.field1429 }), var4);
							}
						}
					}
					var4++;
				}
			}
		}
		if (!arg1.field848) {
			return;
		}
		if (!class151.field3468) {
			for (int var18 = 9; var18 >= 5; var18--) {
				class32 var19 = class71.method584(arg1, var18);
				if (var19 != null) {
					class56.method442(var18 + 1, var19, arg1.field743, 1005, arg1.field813, arg1.field828);
				}
			}
			class32 var20 = class61.method459(arg1);
			if (var20 != null) {
				class56.method442(0, var20, arg1.field743, 8, arg1.field813, arg1.field828);
			}
			for (int var21 = 4; var21 >= 0; var21--) {
				class32 var22 = class71.method584(arg1, var21);
				if (var22 != null) {
					class56.method442(var21 + 1, var22, arg1.field743, 46, arg1.field813, arg1.field828);
				}
			}
			if (class71.method583(class147.method1100(arg1))) {
				class56.method442(0, class86.field2002, arg1.field743, 39, class77.field1786, arg1.field828);
			}
		} else if (class94.method742(class147.method1100(arg1)) && (class88.field2045 & 0x20) == 32) {
			class56.method442(0, class147.field3353, arg1.field743, 42, class52.method402(new class32[] { class14.field234, class1.field1, arg1.field813 }), arg1.field828);
		}
	}

	public class159(Throwable arg0, String arg1) {
		this.field3647 = arg0;
		this.field3643 = arg1;
	}
}
