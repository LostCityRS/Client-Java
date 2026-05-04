package deob;

import java.io.IOException;

@ObfuscatedName("b")
public final class class12 {

	@ObfuscatedName("b.a")
	public final class23[] field168;

	@ObfuscatedName("b.c")
	public final class23 field170;

	@ObfuscatedName("b.e")
	public static class22 field172;

	@ObfuscatedName("b.f")
	public final int[] field173;

	@ObfuscatedName("b.g")
	public static final class92 field174 = new class92(64);

	@ObfuscatedName("b.h")
	public static class75 field175;

	@ObfuscatedName("b.j")
	public static class144 field177;

	@ObfuscatedName("b.l")
	public final class23 field179;

	@ObfuscatedName("b.o")
	public static final class88 field182 = class208.method1423(105, "<col=00ff00>");

	@ObfuscatedName("b.p")
	public static int field183 = 100;

	@ObfuscatedName("b.q")
	public final int[] field184;

	@ObfuscatedName("b.a(IIIIIIIIIIIIIIIIIIII)V")
	public static void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			class95 var20 = new class95(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var21 = arg0; var21 >= 0; var21--) {
				if (class29.field489[var21][arg1][arg2] == null) {
					class29.field489[var21][arg1][arg2] = new class52(var21, arg1, arg2);
				}
			}
			class29.field489[arg0][arg1][arg2].field947 = var20;
		} else if (arg3 == 1) {
			class95 var22 = new class95(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var23 = arg0; var23 >= 0; var23--) {
				if (class29.field489[var23][arg1][arg2] == null) {
					class29.field489[var23][arg1][arg2] = new class52(var23, arg1, arg2);
				}
			}
			class29.field489[arg0][arg1][arg2].field947 = var22;
		} else {
			class56 var24 = new class56(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (int var25 = arg0; var25 >= 0; var25--) {
				if (class29.field489[var25][arg1][arg2] == null) {
					class29.field489[var25][arg1][arg2] = new class52(var25, arg1, arg2);
				}
			}
			class29.field489[arg0][arg1][arg2].field964 = var24;
		}
	}

	@ObfuscatedName("b.a(I)Z")
	public static boolean method61() {
		try {
			return class236.method1566();
		} catch (IOException var3) {
			class201.method1380();
			return true;
		} catch (Exception var4) {
			String var1 = "T2 - " + class238.field4430 + "," + class46.field821 + "," + class88.field1634 + " - " + class228.field4270 + "," + (class240.field4456.field4087[0] + class223.field4212) + "," + (class240.field4456.field4141[0] + class190.field3679) + " - ";
			for (int var2 = 0; class228.field4270 > var2 && var2 < 50; var2++) {
				var1 = var1 + class230.field4312.field842[var2] + ",";
			}
			class221.method1488(var1, var4);
			class115.method785();
			return true;
		}
	}

	@ObfuscatedName("b.a(Lea;I)Lgh;")
	public static class74 method62(class46 arg0) {
		return new class74(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method304(), arg0.method304(), arg0.method347());
	}

	@ObfuscatedName("b.a(IJ)V")
	public static void method64(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class146.field2729 >= 100 && class6.field72 != 1 || class146.field2729 >= 200) {
			class223.method1499(class225.field4230, 0, class174.field3453);
			return;
		}
		class88 var2 = class200.method1375(arg0).method614();
		for (int var3 = 0; var3 < class146.field2729; var3++) {
			if (class115.field2086[var3] == arg0) {
				class223.method1499(class166.method1140(new class88[] { var2, class1.field8 }), 0, class174.field3453);
				return;
			}
		}
		for (int var4 = 0; var4 < class67.field1221; var4++) {
			if (class95.field1764[var4] == arg0) {
				class223.method1499(class166.method1140(new class88[] { class109.field1978, var2, class226.field4245 }), 0, class174.field3453);
				return;
			}
		}
		if (var2.method597(-122, class240.field4456.field766)) {
			class223.method1499(class24.field395, 0, class174.field3453);
			return;
		}
		class23.field370[class146.field2729] = var2;
		class115.field2086[class146.field2729] = arg0;
		class160.field3092[class146.field2729] = 0;
		class168.field3238[class146.field2729] = class174.field3453;
		class46.field845[class146.field2729] = 0;
		class59.field1120[class146.field2729] = false;
		class20.field313 = class67.field1211;
		class146.field2729++;
		class146.field2747.method30(82);
		class146.field2747.method328(arg0);
	}

	@ObfuscatedName("b.a(IILq;B)V")
	public static void method65(int arg0, int arg1, class174 arg2) {
		if (arg2.field3368 == 1) {
			class98.method685(0, arg2.field3460, (short) 11, 0L, class174.field3453, arg2.field3423);
		}
		if (arg2.field3368 == 2 && !class10.field145) {
			class88 var3 = class194.method1345(arg2);
			if (var3 != null) {
				class98.method685(-1, var3, (short) 15, 0L, class166.method1140(new class88[] { field182, arg2.field3459 }), arg2.field3423);
			}
		}
		if (arg2.field3368 == 3) {
			class98.method685(0, class33.field530, (short) 14, 0L, class174.field3453, arg2.field3423);
		}
		if (arg2.field3368 == 4) {
			class98.method685(0, arg2.field3460, (short) 36, 0L, class174.field3453, arg2.field3423);
		}
		if (arg2.field3368 == 5) {
			class98.method685(0, arg2.field3460, (short) 20, 0L, class174.field3453, arg2.field3423);
		}
		if (arg2.field3368 == 6 && class53.field967 == null) {
			class98.method685(-1, arg2.field3460, (short) 47, 0L, class174.field3453, arg2.field3423);
		}
		if (arg2.field3390 == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg2.field3418; var5++) {
				for (int var6 = 0; var6 < arg2.field3501; var6++) {
					int var7 = (arg2.field3508 + 32) * var5;
					int var8 = (arg2.field3466 + 32) * var6;
					if (var4 < 20) {
						var7 += arg2.field3397[var4];
						var8 += arg2.field3472[var4];
					}
					if (arg1 >= var8 && arg0 >= var7 && var8 + 32 > arg1 && var7 + 32 > arg0) {
						class225.field4229 = arg2;
						class172.field3333 = var4;
						if (arg2.field3388[var4] > 0) {
							class149 var9 = class71.method472(arg2.field3388[var4] - 1);
							if (class28.field475 == 1 && class60.method431(class80.method530(arg2))) {
								if (class209.field3965 != arg2.field3423 || var4 != class58.field1105) {
									class98.method685(var4, class35.field608, (short) 42, (long) var9.field2844, class166.method1140(new class88[] { class78.field1414, class34.field581, var9.field2892 }), arg2.field3423);
								}
							} else if (!class10.field145 || !class60.method431(class80.method530(arg2))) {
								class88[] var10 = var9.field2904;
								if (class99.field1807) {
									var10 = class138.method921(var10);
								}
								if (class60.method431(class80.method530(arg2))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 21;
											} else {
												var12 = 18;
											}
											class98.method685(var4, var10[var11], var12, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
										} else if (var11 == 4) {
											class98.method685(var4, class221.field4171, (short) 18, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
										}
									}
								}
								if (class6.method27(class80.method530(arg2))) {
									class98.method685(var4, class35.field608, (short) 12, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
								}
								if (class60.method431(class80.method530(arg2)) && var10 != null) {
									for (int var13 = 2; var13 >= 0; var13--) {
										if (var10[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 28;
											}
											if (var13 == 1) {
												var14 = 9;
											}
											if (var13 == 2) {
												var14 = 2;
											}
											class98.method685(var4, var10[var13], var14, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
										}
									}
								}
								class88[] var15 = arg2.field3511;
								if (class99.field1807) {
									var15 = class138.method921(var15);
								}
								if (var15 != null) {
									for (int var16 = 4; var16 >= 0; var16--) {
										if (var15[var16] != null) {
											byte var17 = 0;
											if (var16 == 0) {
												var17 = 6;
											}
											if (var16 == 1) {
												var17 = 8;
											}
											if (var16 == 2) {
												var17 = 49;
											}
											if (var16 == 3) {
												var17 = 44;
											}
											if (var16 == 4) {
												var17 = 13;
											}
											class98.method685(var4, var15[var16], var17, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
										}
									}
								}
								class98.method685(var4, class65.field1174, (short) 1001, (long) var9.field2844, class166.method1140(new class88[] { class136.field2529, var9.field2892 }), arg2.field3423);
							} else if ((class115.field2084 & 0x10) == 16) {
								class98.method685(var4, class201.field3835, (short) 39, (long) var9.field2844, class166.method1140(new class88[] { class28.field464, class34.field581, var9.field2892 }), arg2.field3423);
							}
						}
					}
					var4++;
				}
			}
		}
		if (!arg2.field3410) {
			return;
		}
		if (!class10.field145) {
			for (int var18 = 9; var18 >= 5; var18--) {
				class88 var19 = class222.method1494(arg2, var18);
				if (var19 != null) {
					class98.method685(arg2.field3406, var19, (short) 1003, (long) (var18 + 1), arg2.field3457, arg2.field3423);
				}
			}
			class88 var20 = class194.method1345(arg2);
			if (var20 != null) {
				class98.method685(arg2.field3406, var20, (short) 15, 0L, arg2.field3457, arg2.field3423);
			}
			for (int var21 = 4; var21 >= 0; var21--) {
				class88 var22 = class222.method1494(arg2, var21);
				if (var22 != null) {
					class98.method685(arg2.field3406, var22, (short) 43, (long) (var21 + 1), arg2.field3457, arg2.field3423);
				}
			}
			if (class229.method1526(class80.method530(arg2))) {
				class98.method685(arg2.field3406, class189.field3665, (short) 47, 0L, class174.field3453, arg2.field3423);
				return;
			}
			return;
		}
		if (class31.method201(class80.method530(arg2)) && (class115.field2084 & 0x20) == 32) {
			class98.method685(arg2.field3406, class201.field3835, (short) 40, 0L, class166.method1140(new class88[] { class28.field464, class248.field4548, arg2.field3457 }), arg2.field3423);
			return;
		}
	}

	public class12() {
		this.field173 = new int[0];
		this.field184 = new int[0];
		this.field179 = new class172();
		this.field179.field363 = 1;
		this.field170 = new class172();
		this.field168 = new class23[] { this.field179, this.field170 };
		this.field170.field363 = 1;
	}

	public class12(class46 arg0) {
		int var2 = arg0.method347();
		this.field168 = new class23[var2];
		int var3 = 0;
		int var4 = 0;
		int[][] var5 = new int[var2][];
		for (int var6 = 0; var6 < var2; var6++) {
			class23 var7 = class94.method674(arg0);
			if (var7.method124() >= 0) {
				var4++;
			}
			if (var7.method129() >= 0) {
				var3++;
			}
			int var8 = var7.field376.length;
			var5[var6] = new int[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				var5[var6][var9] = arg0.method347();
			}
			this.field168[var6] = var7;
		}
		this.field173 = new int[var4];
		this.field184 = new int[var3];
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < var2; var12++) {
			class23 var13 = this.field168[var12];
			int var14 = var13.field376.length;
			for (int var15 = 0; var15 < var14; var15++) {
				var13.field376[var15] = this.field168[var5[var12][var15]];
			}
			int var16 = var13.method124();
			int var17 = var13.method129();
			if (var16 > 0) {
				this.field173[var10++] = var16;
			}
			if (var17 > 0) {
				this.field184[var11++] = var17;
			}
			var5[var12] = null;
		}
		this.field179 = this.field168[arg0.method347()];
		this.field170 = this.field168[arg0.method347()];
	}

	@ObfuscatedName("b.a(DIZLnb;Lfe;IIZ)[I")
	public int[] method60(double arg0, int arg1, boolean arg2, class144 arg3, class61 arg4, int arg5, boolean arg6) {
		class44.method282(arg0);
		class244.field4488 = arg4;
		class39.field684 = arg3;
		class118.method802(arg1, arg5);
		for (int var9 = 0; var9 < this.field168.length; var9++) {
			this.field168[var9].method128(arg1, arg5);
		}
		int[] var10 = new int[arg5 * arg1];
		int var11;
		int var12;
		byte var13;
		if (arg6) {
			var11 = -1;
			var12 = arg1 - 1;
			var13 = -1;
		} else {
			var12 = 0;
			var11 = arg1;
			var13 = 1;
		}
		int var14 = 0;
		for (int var15 = 0; var15 < arg5; var15++) {
			if (arg2) {
				var14 = var15;
			}
			int[] var17;
			int[] var18;
			int[] var19;
			if (this.field179.field369) {
				int[] var20 = this.field179.method54(var15);
				var18 = var20;
				var17 = var20;
				var19 = var20;
			} else {
				int[][] var16 = this.field179.method7(var15);
				var17 = var16[1];
				var18 = var16[0];
				var19 = var16[2];
			}
			for (int var21 = var12; var21 != var11; var21 += var13) {
				int var22 = var18[var21] >> 4;
				if (var22 > 255) {
					var22 = 255;
				}
				if (var22 < 0) {
					var22 = 0;
				}
				int var23 = class174.field3507[var22];
				int var24 = var17[var21] >> 4;
				if (var24 > 255) {
					var24 = 255;
				}
				int var25 = var19[var21] >> 4;
				if (var24 < 0) {
					var24 = 0;
				}
				if (var25 > 255) {
					var25 = 255;
				}
				int var26 = class174.field3507[var24];
				if (var25 < 0) {
					var25 = 0;
				}
				int var27 = class174.field3507[var25];
				var10[var14++] = var27 + (var26 << 8) + (var23 << 16);
				if (arg2) {
					var14 += arg1 - 1;
				}
			}
		}
		for (int var28 = 0; var28 < this.field168.length; var28++) {
			this.field168[var28].method127();
		}
		return var10;
	}

	@ObfuscatedName("b.a(Lfe;Lnb;I)Z")
	public boolean method63(class61 arg0, class144 arg1) {
		for (int var3 = 0; var3 < this.field173.length; var3++) {
			if (!arg1.method953(this.field173[var3])) {
				return false;
			}
		}
		for (int var4 = 0; var4 < this.field184.length; var4++) {
			if (!arg0.method439(this.field184[var4])) {
				return false;
			}
		}
		return true;
	}
}
