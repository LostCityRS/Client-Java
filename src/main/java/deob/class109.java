package deob;

import java.awt.Component;

@ObfuscatedName("k")
public final class class109 extends class136 {

	@ObfuscatedName("k.bb")
	public static final class88 field1982 = class208.method1423(105, "; Expires=");

	@ObfuscatedName("k.cb")
	public int field1983 = -1;

	@ObfuscatedName("k.eb")
	public int[] field1985;

	@ObfuscatedName("k.gb")
	public static final class88 field1987 = class208.method1423(105, "Please remove ");

	@ObfuscatedName("k.hb")
	public static int field1988;

	@ObfuscatedName("k.jb")
	public int[] field1990;

	@ObfuscatedName("k.mb")
	public boolean field1993 = false;

	@ObfuscatedName("k.nb")
	public static final class88 field1994 = class208.method1423(105, "settings");

	@ObfuscatedName("k.sb")
	public int field1999 = 5;

	@ObfuscatedName("k.tb")
	public int field2000 = -1;

	@ObfuscatedName("k.ub")
	public int[][] field2001;

	@ObfuscatedName("k.wb")
	public int[] field2003;

	@ObfuscatedName("k.N")
	public static short[] field1968 = new short[256];

	@ObfuscatedName("k.F")
	public static final class88 field1961 = class208.method1423(105, "as it was used to break our rules)3");

	@ObfuscatedName("k.rb")
	public static class88 field1998 = field1961;

	@ObfuscatedName("k.S")
	public static final class88 field1973 = class208.method1423(105, " x ");

	@ObfuscatedName("k.Q")
	public static class88 field1971 = field1987;

	@ObfuscatedName("k.X")
	public static class88 field1978 = field1987;

	@ObfuscatedName("k.D")
	public static final class88 field1959 = class208.method1423(105, ":");

	@ObfuscatedName("k.E")
	public boolean field1960 = false;

	@ObfuscatedName("k.R")
	public int field1972 = -1;

	@ObfuscatedName("k.U")
	public int field1975 = -1;

	@ObfuscatedName("k.Z")
	public int field1980 = -1;

	@ObfuscatedName("k.K")
	public int field1966 = 2;

	@ObfuscatedName("k.P")
	public int field1970 = 99;

	@ObfuscatedName("k.xb")
	public static class22 field2004;

	@ObfuscatedName("k.J")
	public int[] field1965;

	@ObfuscatedName("k.G")
	public static byte[][][] field1962;

	@ObfuscatedName("k.a(IIIIZII)I")
	public static int method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			int var7 = arg4;
			arg4 = arg3;
			arg3 = var7;
		}
		if (var6 == 0) {
			return arg0;
		} else if (var6 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (var6 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

	@ObfuscatedName("k.a(IIILq;B)V")
	public static void method743(int arg0, int arg1, int arg2, class174 arg3) {
		if (class247.field4512 < 3) {
			((class169) class47.field887).method1163(arg1, arg2, arg3.field3380, arg3.field3422, class47.field887.field3654 / 2, class47.field887.field3652 / 2, class207.field3930, arg3.field3402, arg3.field3421);
		} else {
			class72.method491(arg1, arg2, arg3.field3402, arg3.field3421);
		}
		class211.field4005[arg0] = true;
	}

	@ObfuscatedName("k.a(IIIII)V")
	public static void method745(int arg0, int arg1, int arg2, int arg3) {
		class230.method1534(arg3 - arg2, arg1, arg2 + arg3, class3.field42[arg0]);
		int var4 = 0;
		int var5 = arg2;
		int var6 = -1;
		int var7 = -arg2;
		while (var4 < var5) {
			var6 += 2;
			var7 += var6;
			var4++;
			if (var7 >= 0) {
				var5--;
				var7 -= var5 << 1;
				int[] var8 = class3.field42[var5 + arg0];
				int[] var9 = class3.field42[arg0 - var5];
				int var10 = var4 + arg3;
				int var11 = arg3 - var4;
				class230.method1534(var11, arg1, var10, var8);
				class230.method1534(var11, arg1, var10, var9);
			}
			int var12 = arg3 + var5;
			int var13 = arg3 - var5;
			int[] var14 = class3.field42[arg0 + var4];
			int[] var15 = class3.field42[arg0 - var4];
			class230.method1534(var13, arg1, var12, var14);
			class230.method1534(var13, arg1, var12, var15);
		}
	}

	@ObfuscatedName("k.b(II)Z")
	public static boolean method746(int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@ObfuscatedName("k.a(BII)I")
	public static int method747(int arg0, int arg1) {
		class177 var2 = (class177) class64.field1163.method1049((long) arg0);
		if (var2 == null) {
			return 0;
		} else if (arg1 >= 0 && var2.field3551.length > arg1) {
			return var2.field3551[arg1];
		} else {
			return 0;
		}
	}

	@ObfuscatedName("k.a(Ljava/awt/Component;I)V")
	public static void method748(Component arg0) {
		arg0.addMouseListener(class43.field732);
		arg0.addMouseMotionListener(class43.field732);
		arg0.addFocusListener(class43.field732);
	}

	@ObfuscatedName("k.b(IIIII)V")
	public static void method753(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 > arg3) {
			for (int var4 = arg3; var4 < arg1; var4++) {
				class3.field42[var4][arg2] = arg0;
			}
		} else {
			for (int var5 = arg1; var5 < arg3; var5++) {
				class3.field42[var5][arg2] = arg0;
			}
		}
	}

	@ObfuscatedName("k.a(III)V")
	public static void method755(int arg0, int arg1) {
		class226 var2 = class153.method1043(arg0);
		int var3 = var2.field4233;
		int var4 = var2.field4234;
		int var5 = var2.field4237;
		int var6 = class101.field1832[var5 - var4];
		if (arg1 < 0 || arg1 > var6) {
			arg1 = 0;
		}
		int var7 = var6 << var4;
		class113.field2050[var3] = ~var7 & class113.field2050[var3] | var7 & arg1 << var4;
	}

	@ObfuscatedName("k.a(Lu;B)V")
	public static void method756(class218 arg0) {
		int var1 = arg0.field4133 - class117.field2113;
		if (arg0.field4139 == 0) {
			arg0.field4119 = 1024;
		}
		arg0.field4108 = 0;
		if (arg0.field4139 == 1) {
			arg0.field4119 = 1536;
		}
		if (arg0.field4139 == 2) {
			arg0.field4119 = 0;
		}
		if (arg0.field4139 == 3) {
			arg0.field4119 = 512;
		}
		int var2 = arg0.field4094 * 128 + arg0.field4103 * 64;
		arg0.field4121 += (var2 - arg0.field4121) / var1;
		int var3 = arg0.field4103 * 64 + arg0.field4113 * 128;
		arg0.field4136 += (var3 - arg0.field4136) / var1;
	}

	@ObfuscatedName("k.a(ILcg;I)Lcg;")
	public class30 method741(class30 arg0, int arg1) {
		int var3 = this.field1965[arg1];
		class129 var4 = class130.method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method185(true, true);
		} else {
			class30 var6 = arg0.method185(!var4.method875(var5), !this.field1993);
			var6.method187(var4, var5, this.field1993);
			return var6;
		}
	}

	@ObfuscatedName("k.a(Lea;II)V")
	public void method744(class46 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method301();
			this.field1990 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1990[var4] = arg0.method301();
			}
			this.field1965 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field1965[var5] = arg0.method301();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field1965[var6] = (arg0.method301() << 16) + this.field1965[var6];
			}
		} else if (arg1 == 2) {
			this.field1972 = arg0.method301();
		} else if (arg1 == 3) {
			int var7 = arg0.method347();
			this.field1985 = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1985[var8] = arg0.method347();
			}
			this.field1985[var7] = 9999999;
		} else if (arg1 == 4) {
			this.field1960 = true;
		} else if (arg1 == 5) {
			this.field1999 = arg0.method347();
		} else if (arg1 == 6) {
			this.field2000 = arg0.method301();
		} else if (arg1 == 7) {
			this.field1975 = arg0.method301();
		} else if (arg1 == 8) {
			this.field1970 = arg0.method347();
		} else if (arg1 == 9) {
			this.field1983 = arg0.method347();
		} else if (arg1 == 10) {
			this.field1980 = arg0.method347();
		} else if (arg1 == 11) {
			this.field1966 = arg0.method347();
		} else if (arg1 == 12) {
			int var13 = arg0.method347();
			this.field2003 = new int[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field2003[var14] = arg0.method301();
			}
			for (int var15 = 0; var15 < var13; var15++) {
				this.field2003[var15] = (arg0.method301() << 16) + this.field2003[var15];
			}
		} else if (arg1 == 13) {
			int var9 = arg0.method301();
			this.field2001 = new int[var9][];
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.method347();
				if (var11 > 0) {
					this.field2001[var10] = new int[var11];
					this.field2001[var10][0] = arg0.method304();
					for (int var12 = 1; var12 < var11; var12++) {
						this.field2001[var10][var12] = arg0.method301();
					}
				}
			}
			return;
		} else if (arg1 == 14) {
			this.field1993 = true;
			return;
		}
	}

	@ObfuscatedName("k.a(IZLcg;I)Lcg;")
	public class30 method749(int arg0, class30 arg1, int arg2) {
		int var4 = this.field1965[arg2];
		class129 var5 = class130.method878(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg1.method184(true, true);
		}
		int var7 = arg0 & 0x3;
		class30 var8 = arg1.method184(!var5.method875(var6), !this.field1993);
		if (var7 == 1) {
			var8.method181();
		} else if (var7 == 2) {
			var8.method190();
		} else if (var7 == 3) {
			var8.method182();
		}
		var8.method187(var5, var6, this.field1993);
		if (var7 == 1) {
			var8.method182();
		} else if (var7 == 2) {
			var8.method190();
		} else if (var7 == 3) {
			var8.method181();
		}
		return var8;
	}

	@ObfuscatedName("k.a(IILcg;)Lcg;")
	public class30 method750(int arg0, class30 arg1) {
		int var3 = this.field1965[arg0];
		class129 var4 = class130.method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method184(true, true);
		} else {
			class30 var6 = arg1.method184(!var4.method875(var5), !this.field1993);
			var6.method187(var4, var5, this.field1993);
			return var6;
		}
	}

	@ObfuscatedName("k.a(Lea;Z)V")
	public void method751(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method744(arg0, var2);
		}
	}

	@ObfuscatedName("k.a(ILk;IBLcg;)Lcg;")
	public class30 method754(int arg0, class109 arg1, int arg2, class30 arg3) {
		int var5 = this.field1965[arg0];
		class129 var6 = class130.method878(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.method750(arg2, arg3);
		}
		int var8 = arg1.field1965[arg2];
		class129 var9 = class130.method878(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			class30 var11 = arg3.method184(!var6.method875(var7), !this.field1993);
			var11.method187(var6, var7, this.field1993);
			return var11;
		} else {
			class30 var12 = arg3.method184(!var6.method875(var7) & !var9.method875(var10), !arg1.field1993 & !this.field1993);
			var12.method189(var6, var7, var9, var10, this.field1985, arg1.field1993 | this.field1993);
			return var12;
		}
	}

	@ObfuscatedName("k.d(B)V")
	public void method757() {
		if (this.field1983 == -1) {
			if (this.field1985 == null) {
				this.field1983 = 0;
			} else {
				this.field1983 = 2;
			}
		}
		if (this.field1980 != -1) {
			return;
		}
		if (this.field1985 == null) {
			this.field1980 = 0;
		} else {
			this.field1980 = 2;
		}
	}

	@ObfuscatedName("k.a(ILcg;B)Lcg;")
	public class30 method758(int arg0, class30 arg1) {
		int var3 = this.field1965[arg0];
		class129 var4 = class130.method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method184(true, true);
		}
		class129 var6 = null;
		int var7 = 0;
		if (this.field2003 != null && this.field2003.length > arg0) {
			int var8 = this.field2003[arg0];
			var6 = class130.method878(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			class30 var9 = arg1.method184(!var4.method875(var5), !this.field1993);
			var9.method187(var4, var5, this.field1993);
			return var9;
		} else {
			class30 var10 = arg1.method184(!var4.method875(var5) & !var6.method875(var7), !this.field1993);
			var10.method187(var4, var5, this.field1993);
			var10.method187(var6, var7, this.field1993);
			return var10;
		}
	}
}
