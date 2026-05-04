package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ng")
public final class class149 extends class136 {

	@ObfuscatedName("ng.ab")
	public int field2857 = 0;

	@ObfuscatedName("ng.bb")
	public int field2858 = -1;

	@ObfuscatedName("ng.eb")
	public boolean field2861 = false;

	@ObfuscatedName("ng.fb")
	public int field2862;

	@ObfuscatedName("ng.gb")
	public short[] field2863;

	@ObfuscatedName("ng.ib")
	public int field2865 = -1;

	@ObfuscatedName("ng.jb")
	public int field2866 = 0;

	@ObfuscatedName("ng.kb")
	public int field2867 = -1;

	@ObfuscatedName("ng.mb")
	public class154 field2869;

	@ObfuscatedName("ng.nb")
	public int field2870 = 0;

	@ObfuscatedName("ng.ob")
	public int field2871 = 128;

	@ObfuscatedName("ng.pb")
	public int field2872 = 0;

	@ObfuscatedName("ng.qb")
	public int field2873 = 0;

	@ObfuscatedName("ng.rb")
	public int field2874 = -1;

	@ObfuscatedName("ng.sb")
	public int field2875 = -1;

	@ObfuscatedName("ng.tb")
	public int field2876 = 0;

	@ObfuscatedName("ng.ub")
	public boolean field2877 = false;

	@ObfuscatedName("ng.wb")
	public int field2879 = 0;

	@ObfuscatedName("ng.Mb")
	public static final class88 field2895 = class208.method1423(105, "(U");

	@ObfuscatedName("ng.Z")
	public static final class92 field2856 = new class92(64);

	@ObfuscatedName("ng.Wb")
	public static boolean field2905 = false;

	@ObfuscatedName("ng.Xb")
	public static final class108[] field2906 = new class108[5000];

	@ObfuscatedName("ng.G")
	public int field2838 = -1;

	@ObfuscatedName("ng.K")
	public int field2842 = -1;

	@ObfuscatedName("ng.D")
	public int field2836 = 0;

	@ObfuscatedName("ng.V")
	public int field2852 = 0;

	@ObfuscatedName("ng.Q")
	public int field2847 = 0;

	@ObfuscatedName("ng.R")
	public int field2848 = -1;

	@ObfuscatedName("ng.L")
	public int field2843 = 128;

	@ObfuscatedName("ng.W")
	public int field2853 = -1;

	@ObfuscatedName("ng.X")
	public int field2854 = 1;

	@ObfuscatedName("ng.T")
	public int field2850 = 0;

	@ObfuscatedName("ng.Ib")
	public int field2891 = -1;

	@ObfuscatedName("ng.Gb")
	public int field2889 = 2000;

	@ObfuscatedName("ng.Bb")
	public int field2884 = -1;

	@ObfuscatedName("ng.Hb")
	public int field2890 = 128;

	@ObfuscatedName("ng.xb")
	public int field2880 = -1;

	@ObfuscatedName("ng.J")
	public int field2841 = -1;

	@ObfuscatedName("ng.Jb")
	public class88 field2892 = class2.field12;

	@ObfuscatedName("ng.Pb")
	public class88[] field2898 = new class88[] { null, null, class231.field4343, null, null };

	@ObfuscatedName("ng.Fb")
	public int field2888 = -1;

	@ObfuscatedName("ng.I")
	public int field2840 = 0;

	@ObfuscatedName("ng.Vb")
	public class88[] field2904 = new class88[] { null, null, null, null, class221.field4171 };

	@ObfuscatedName("ng.N")
	public int field2844;

	@ObfuscatedName("ng.Yb")
	public static int field2907;

	@ObfuscatedName("ng.Zb")
	public static class46 field2908;

	@ObfuscatedName("ng.Eb")
	public byte[] field2887;

	@ObfuscatedName("ng.O")
	public int[] field2845;

	@ObfuscatedName("ng.Ub")
	public int[] field2903;

	@ObfuscatedName("ng.F")
	public short[] field2837;

	@ObfuscatedName("ng.S")
	public short[] field2849;

	@ObfuscatedName("ng.Y")
	public short[] field2855;

	@ObfuscatedName("ng.H")
	public int[][] field2839;

	@ObfuscatedName("ng.b(II)V")
	public static void method1005(int arg0) {
		if (!class211.method1445(arg0)) {
			return;
		}
		class174[] var1 = class78.field1418[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class174 var3 = var1[var2];
			if (var3 != null) {
				var3.field3487 = 0;
				var3.field3379 = 0;
			}
		}
	}

	@ObfuscatedName("ng.a(ILjava/lang/Object;Lqg;)V")
	public static void method1006(Object arg0, class181 arg1) {
		if (arg1.field3592 == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && arg1.field3592.peekEvent() != null; var2++) {
			class21.method98(1L);
		}
		if (arg0 != null) {
			arg1.field3592.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("ng.a(Lnb;I)V")
	public static void method1007(class144 arg0) {
		class106.field1931 = arg0;
		class28.field465 = class106.field1931.method942(16);
	}

	@ObfuscatedName("ng.c(II)Z")
	public static boolean method1017(int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@ObfuscatedName("ng.a(Lnc;III)V")
	public static void method1018(class145 arg0, int arg1, int arg2, int arg3) {
		if (arg2 < class48.field899) {
			class52 var4 = class29.field489[arg1][arg2 + 1][arg3];
			if (var4 != null && var4.field949 != null && var4.field949.field3194.method544()) {
				arg0.method570(var4.field949.field3194, 128, 0, 0, true);
			}
		}
		if (arg3 < class48.field899) {
			class52 var5 = class29.field489[arg1][arg2][arg3 + 1];
			if (var5 != null && var5.field949 != null && var5.field949.field3194.method544()) {
				arg0.method570(var5.field949.field3194, 0, 0, 128, true);
			}
		}
		if (arg2 < class48.field899 && arg3 < class66.field1202) {
			class52 var6 = class29.field489[arg1][arg2 + 1][arg3 + 1];
			if (var6 != null && var6.field949 != null && var6.field949.field3194.method544()) {
				arg0.method570(var6.field949.field3194, 128, 0, 128, true);
			}
		}
		if (arg2 < class48.field899 && arg3 > 0) {
			class52 var7 = class29.field489[arg1][arg2 + 1][arg3 - 1];
			if (var7 != null && var7.field949 != null && var7.field949.field3194.method544()) {
				arg0.method570(var7.field949.field3194, 128, 0, -128, true);
			}
		}
	}

	@ObfuscatedName("ng.c(ZI)V")
	public static void method1023(boolean arg0) {
		for (int var1 = 0; var1 < class55.field1041; var1++) {
			class191 var2 = class225.field4223[class25.field402[var1]];
			long var3 = (long) class25.field402[var1] << 32 | 0x20000000L;
			if (var2 != null && var2.method287() && arg0 == var2.field3682.field2363 && var2.field3682.method852()) {
				int var5 = var2.field4136 >> 7;
				int var6 = var2.field4121 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var2.field4103 == 1 && (var2.field4136 & 0x7F) == 64 && (var2.field4121 & 0x7F) == 64) {
						if (class210.field3990 == class152.field2948[var5][var6]) {
							continue;
						}
						class152.field2948[var5][var6] = class210.field3990;
					}
					if (!var2.field3682.field2359) {
						var3 |= Long.MIN_VALUE;
					}
					var2.field4097 = class239.method1584(var2.field4136 + (var2.field4103 - 1) * 64, var2.field4121 - (-(var2.field4103 * 64) + 64), field2907);
					class126.method859(field2907, var2.field4136, var2.field4121, var2.field4097, (var2.field4103 - 1) * 64 + 60, var2, var2.field4085, var3, var2.field4093);
				}
			}
		}
	}

	@ObfuscatedName("ng.b(Z)Lle;")
	public class125 method1008() {
		class82 var1 = class82.method568(class156.field3008, this.field2862);
		if (var1 == null) {
			return null;
		}
		if (this.field2855 != null) {
			for (int var2 = 0; var2 < this.field2855.length; var2++) {
				if (this.field2887 == null || var2 >= this.field2887.length) {
					var1.method564(this.field2855[var2], this.field2849[var2]);
				} else {
					var1.method564(this.field2855[var2], class109.field1968[this.field2887[var2] & 0xFF]);
				}
			}
		}
		if (this.field2863 != null) {
			for (int var3 = 0; var3 < this.field2863.length; var3++) {
				var1.method553(this.field2863[var3], this.field2837[var3]);
			}
		}
		class125 var4 = var1.method547(this.field2866 + 64, this.field2840 + 768);
		if (this.field2890 != 128 || this.field2843 != 128 || this.field2871 != 128) {
			var4.method183(this.field2890, this.field2843, this.field2871);
		}
		return var4;
	}

	@ObfuscatedName("ng.a(Li;BI)Li;")
	public class88 method1009(class88 arg0, int arg1) {
		if (this.field2869 == null) {
			return arg0;
		} else {
			class216 var3 = (class216) this.field2869.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("ng.a(ZII)I")
	public int method1010(int arg0, int arg1) {
		if (this.field2869 == null) {
			return arg1;
		} else {
			class192 var3 = (class192) this.field2869.method1049((long) arg0);
			return var3 == null ? arg1 : var3.field3698;
		}
	}

	@ObfuscatedName("ng.a(ZI)Lhe;")
	public class82 method1011(boolean arg0) {
		int var2 = this.field2888;
		int var3 = this.field2842;
		int var4 = this.field2875;
		if (arg0) {
			var2 = this.field2853;
			var3 = this.field2858;
			var4 = this.field2880;
		}
		if (var2 == -1) {
			return null;
		}
		class82 var5 = class82.method568(class156.field3008, var2);
		if (var4 != -1) {
			class82 var6 = class82.method568(class156.field3008, var4);
			if (var3 == -1) {
				class82[] var7 = new class82[] { var5, var6 };
				var5 = new class82(var7, 2);
			} else {
				class82 var8 = class82.method568(class156.field3008, var3);
				class82[] var9 = new class82[] { var5, var6, var8 };
				var5 = new class82(var9, 3);
			}
		}
		if (!arg0 && this.field2857 != 0) {
			var5.method549(0, this.field2857, 0);
		}
		if (arg0 && this.field2879 != 0) {
			var5.method549(0, this.field2879, 0);
		}
		if (this.field2855 != null) {
			for (int var10 = 0; var10 < this.field2855.length; var10++) {
				var5.method564(this.field2855[var10], this.field2849[var10]);
			}
		}
		if (this.field2863 != null) {
			for (int var11 = 0; var11 < this.field2863.length; var11++) {
				var5.method553(this.field2863[var11], this.field2837[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("ng.e(I)V")
	public void method1013() {
	}

	@ObfuscatedName("ng.a(ILea;)V")
	public void method1014(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1024(var2, arg0);
		}
	}

	@ObfuscatedName("ng.b(ZI)Z")
	public boolean method1015(boolean arg0) {
		int var2 = this.field2848;
		int var3 = this.field2838;
		if (arg0) {
			var3 = this.field2865;
			var2 = this.field2891;
		}
		if (var2 == -1) {
			return true;
		}
		boolean var4 = true;
		if (!class156.field3008.method959(var2, 0)) {
			var4 = false;
		}
		if (var3 != -1 && !class156.field3008.method959(var3, 0)) {
			var4 = false;
		}
		return var4;
	}

	@ObfuscatedName("ng.a(BZ)Lhe;")
	public class82 method1016(boolean arg0) {
		int var2 = this.field2848;
		int var3 = this.field2838;
		if (arg0) {
			var3 = this.field2865;
			var2 = this.field2891;
		}
		if (var2 == -1) {
			return null;
		}
		class82 var4 = class82.method568(class156.field3008, var2);
		if (var3 != -1) {
			class82 var5 = class82.method568(class156.field3008, var3);
			class82[] var6 = new class82[] { var4, var5 };
			var4 = new class82(var6, 2);
		}
		if (this.field2855 != null) {
			for (int var7 = 0; var7 < this.field2855.length; var7++) {
				var4.method564(this.field2855[var7], this.field2849[var7]);
			}
		}
		if (this.field2863 != null) {
			for (int var8 = 0; var8 < this.field2863.length; var8++) {
				var4.method553(this.field2863[var8], this.field2837[var8]);
			}
		}
		return var4;
	}

	@ObfuscatedName("ng.a(ILng;Lng;)V")
	public void method1019(class149 arg0, class149 arg1) {
		this.field2870 = arg1.field2870;
		this.field2887 = arg1.field2887;
		this.field2854 = arg0.field2854;
		this.field2852 = 1;
		this.field2855 = arg1.field2855;
		this.field2892 = arg0.field2892;
		this.field2889 = arg1.field2889;
		this.field2873 = arg1.field2873;
		this.field2876 = arg1.field2876;
		this.field2872 = arg1.field2872;
		this.field2863 = arg1.field2863;
		this.field2877 = arg0.field2877;
		this.field2862 = arg1.field2862;
		this.field2837 = arg1.field2837;
		this.field2849 = arg1.field2849;
		this.field2847 = arg1.field2847;
	}

	@ObfuscatedName("ng.a(Lng;ILng;)V")
	public void method1020(class149 arg0, class149 arg1) {
		this.field2873 = arg1.field2873;
		this.field2889 = arg1.field2889;
		this.field2892 = arg0.field2892;
		this.field2879 = arg0.field2879;
		this.field2880 = arg0.field2880;
		this.field2872 = arg1.field2872;
		this.field2849 = arg0.field2849;
		this.field2875 = arg0.field2875;
		this.field2876 = arg1.field2876;
		this.field2838 = arg0.field2838;
		this.field2837 = arg0.field2837;
		this.field2853 = arg0.field2853;
		this.field2898 = arg0.field2898;
		this.field2848 = arg0.field2848;
		this.field2862 = arg1.field2862;
		this.field2877 = arg0.field2877;
		this.field2847 = arg1.field2847;
		this.field2904 = new class88[5];
		this.field2842 = arg0.field2842;
		this.field2858 = arg0.field2858;
		this.field2854 = 0;
		this.field2891 = arg0.field2891;
		this.field2887 = arg0.field2887;
		this.field2865 = arg0.field2865;
		this.field2888 = arg0.field2888;
		this.field2863 = arg0.field2863;
		this.field2870 = arg1.field2870;
		this.field2836 = arg0.field2836;
		this.field2857 = arg0.field2857;
		this.field2855 = arg0.field2855;
		this.field2869 = arg0.field2869;
		if (arg0.field2904 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.field2904[var3] = arg0.field2904[var3];
			}
		}
		this.field2904[4] = class34.field592;
	}

	@ObfuscatedName("ng.d(II)Lng;")
	public class149 method1021(int arg0) {
		if (this.field2903 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2845[var3] && this.field2845[var3] != 0) {
					var2 = this.field2903[var3];
				}
			}
			if (var2 != -1) {
				return class71.method472(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("ng.a(ZB)Z")
	public boolean method1022(boolean arg0) {
		int var2 = this.field2875;
		int var3 = this.field2888;
		int var4 = this.field2842;
		if (arg0) {
			var3 = this.field2853;
			var2 = this.field2880;
			var4 = this.field2858;
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!class156.field3008.method959(var3, 0)) {
			var5 = false;
		}
		if (var2 != -1 && !class156.field3008.method959(var2, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !class156.field3008.method959(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("ng.a(IBLea;)V")
	public void method1024(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field2862 = arg1.method301();
		} else if (arg0 == 2) {
			this.field2892 = arg1.method298();
		} else if (arg0 == 4) {
			this.field2889 = arg1.method301();
		} else if (arg0 == 5) {
			this.field2873 = arg1.method301();
		} else if (arg0 == 6) {
			this.field2872 = arg1.method301();
		} else if (arg0 == 7) {
			this.field2876 = arg1.method301();
			if (this.field2876 > 32767) {
				this.field2876 -= 65536;
			}
		} else if (arg0 == 8) {
			this.field2870 = arg1.method301();
			if (this.field2870 > 32767) {
				this.field2870 -= 65536;
			}
		} else if (arg0 == 11) {
			this.field2852 = 1;
		} else if (arg0 == 12) {
			this.field2854 = arg1.method323();
		} else if (arg0 == 16) {
			this.field2877 = true;
		} else if (arg0 == 23) {
			this.field2888 = arg1.method301();
			this.field2857 = arg1.method347();
		} else if (arg0 == 24) {
			this.field2875 = arg1.method301();
		} else if (arg0 == 25) {
			this.field2853 = arg1.method301();
			this.field2879 = arg1.method347();
		} else if (arg0 == 26) {
			this.field2880 = arg1.method301();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field2898[arg0 - 30] = arg1.method298();
			if (this.field2898[arg0 - 30].method624(class192.field3693)) {
				this.field2898[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.field2904[arg0 - 35] = arg1.method298();
		} else if (arg0 == 40) {
			int var15 = arg1.method347();
			this.field2855 = new short[var15];
			this.field2849 = new short[var15];
			for (int var16 = 0; var16 < var15; var16++) {
				this.field2855[var16] = (short) arg1.method301();
				this.field2849[var16] = (short) arg1.method301();
			}
		} else if (arg0 == 41) {
			int var3 = arg1.method347();
			this.field2837 = new short[var3];
			this.field2863 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2863[var4] = (short) arg1.method301();
				this.field2837[var4] = (short) arg1.method301();
			}
		} else if (arg0 == 42) {
			int var13 = arg1.method347();
			this.field2887 = new byte[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field2887[var14] = arg1.method324();
			}
		} else if (arg0 == 65) {
			this.field2861 = true;
		} else if (arg0 == 78) {
			this.field2842 = arg1.method301();
		} else if (arg0 == 79) {
			this.field2858 = arg1.method301();
		} else if (arg0 == 90) {
			this.field2848 = arg1.method301();
		} else if (arg0 == 91) {
			this.field2891 = arg1.method301();
		} else if (arg0 == 92) {
			this.field2838 = arg1.method301();
		} else if (arg0 == 93) {
			this.field2865 = arg1.method301();
		} else if (arg0 == 95) {
			this.field2847 = arg1.method301();
		} else if (arg0 == 96) {
			this.field2850 = arg1.method347();
		} else if (arg0 == 97) {
			this.field2841 = arg1.method301();
		} else if (arg0 == 98) {
			this.field2867 = arg1.method301();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.field2903 == null) {
				this.field2845 = new int[10];
				this.field2903 = new int[10];
			}
			this.field2903[arg0 - 100] = arg1.method301();
			this.field2845[arg0 - 100] = arg1.method301();
		} else if (arg0 == 110) {
			this.field2890 = arg1.method301();
		} else if (arg0 == 111) {
			this.field2843 = arg1.method301();
		} else if (arg0 == 112) {
			this.field2871 = arg1.method301();
		} else if (arg0 == 113) {
			this.field2866 = arg1.method324();
		} else if (arg0 == 114) {
			this.field2840 = arg1.method324() * 5;
		} else if (arg0 == 115) {
			this.field2836 = arg1.method347();
		} else if (arg0 == 121) {
			this.field2874 = arg1.method301();
		} else if (arg0 == 122) {
			this.field2884 = arg1.method301();
		} else if (arg0 == 124) {
			if (this.field2839 == null) {
				this.field2839 = new int[11][];
			}
			int var11 = arg1.method347();
			this.field2839[var11] = new int[6];
			for (int var12 = 0; var12 < 6; var12++) {
				this.field2839[var11][var12] = arg1.method334();
			}
		} else if (arg0 == 249) {
			int var5 = arg1.method347();
			if (this.field2869 == null) {
				int var6 = class184.method1296(var5);
				this.field2869 = new class154(var6);
			}
			for (int var7 = 0; var7 < var5; var7++) {
				boolean var8 = arg1.method347() == 1;
				int var9 = arg1.method304();
				class67 var10;
				if (var8) {
					var10 = new class216(arg1.method298());
				} else {
					var10 = new class192(arg1.method323());
				}
				this.field2869.method1052((long) var9, var10);
			}
		}
	}

	@ObfuscatedName("ng.a(IIILk;)Lcg;")
	public class30 method1025(int arg0, int arg1, class109 arg2) {
		if (this.field2903 != null && arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= this.field2845[var5] && this.field2845[var5] != 0) {
					var4 = this.field2903[var5];
				}
			}
			if (var4 != -1) {
				return class71.method472(var4).method1025(1, arg1, arg2);
			}
		}
		class30 var6 = (class30) class241.field4470.method135((long) this.field2844);
		if (var6 == null) {
			class82 var7 = class82.method568(class156.field3008, this.field2862);
			if (var7 == null) {
				return null;
			}
			if (this.field2855 != null) {
				for (int var8 = 0; var8 < this.field2855.length; var8++) {
					if (this.field2887 == null || this.field2887.length <= var8) {
						var7.method564(this.field2855[var8], this.field2849[var8]);
					} else {
						var7.method564(this.field2855[var8], class109.field1968[this.field2887[var8] & 0xFF]);
					}
				}
			}
			if (this.field2863 != null) {
				for (int var9 = 0; var9 < this.field2863.length; var9++) {
					var7.method553(this.field2863[var9], this.field2837[var9]);
				}
			}
			var6 = var7.method546(this.field2866 + 64, this.field2840 + 768, -50, -10, -50);
			if (this.field2890 != 128 || this.field2843 != 128 || this.field2871 != 128) {
				var6.method183(this.field2890, this.field2843, this.field2871);
			}
			var6.field494 = true;
			class241.field4470.method130((long) this.field2844, var6);
		}
		if (arg2 != null) {
			var6 = arg2.method758(arg1, var6);
		}
		return var6;
	}
}
