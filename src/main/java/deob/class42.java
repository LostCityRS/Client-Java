package deob;

@ObfuscatedName("h")
public final class class42 extends class44 {

	@ObfuscatedName("h.ac")
	public int field1116 = -1;

	@ObfuscatedName("h.bc")
	public int field1117 = 128;

	@ObfuscatedName("h.cc")
	public static class1 field1118 = Statics.method931("Unexpected server response");

	@ObfuscatedName("h.dc")
	public int field1119 = 0;

	@ObfuscatedName("h.fc")
	public int field1121 = -1;

	@ObfuscatedName("h.hc")
	public int field1123 = -1;

	@ObfuscatedName("h.jc")
	public int field1125 = 128;

	@ObfuscatedName("h.kc")
	public static byte[] field1126 = new byte[520];

	@ObfuscatedName("h.lc")
	public static class1 field1127 = Statics.method931("Versteckt");

	@ObfuscatedName("h.mc")
	public int field1128 = -1;

	@ObfuscatedName("h.pc")
	public int field1131 = -1;

	@ObfuscatedName("h.rc")
	public static class1 field1133 = Statics.method931("(X100(U(Y");

	@ObfuscatedName("h.sb")
	public boolean field1082 = true;

	@ObfuscatedName("h.tc")
	public int field1135 = -1;

	@ObfuscatedName("h.ub")
	public int field1084 = 1;

	@ObfuscatedName("h.uc")
	public int[] field1136;

	@ObfuscatedName("h.vb")
	public int[] field1085;

	@ObfuscatedName("h.vc")
	public int field1137;

	@ObfuscatedName("h.wb")
	public final class1[] field1086 = new class1[5];

	@ObfuscatedName("h.wc")
	public int[] field1138;

	@ObfuscatedName("h.Db")
	public static class1 field1093 = Statics.method931("Please wait 1 minute and try again)3");

	@ObfuscatedName("h.ec")
	public static class1 field1120 = field1093;

	@ObfuscatedName("h.Ab")
	public static class1 field1090 = Statics.method931("Moderator option: Mute player for 48 hours: <ON>");

	@ObfuscatedName("h.Tb")
	public static class1 field1109 = Statics.method931("Loaded fonts");

	@ObfuscatedName("h.Vb")
	public static class1 field1111 = field1093;

	@ObfuscatedName("h.Eb")
	public static class1 field1094 = field1090;

	@ObfuscatedName("h.Ob")
	public static int field1104 = 0;

	@ObfuscatedName("h.Yb")
	public static int field1114 = 0;

	@ObfuscatedName("h.Mb")
	public static class1 field1102 = field1109;

	@ObfuscatedName("h.Ib")
	public static class1 field1098 = Statics.method931("Checking for updates )2 ");

	@ObfuscatedName("h.Qb")
	public static class1 field1106 = field1098;

	@ObfuscatedName("h.Bc")
	public static int field1143 = -1;

	@ObfuscatedName("h.Ac")
	public static class1 field1142 = field1118;

	@ObfuscatedName("h.Cb")
	public int field1092 = -1;

	@ObfuscatedName("h.Bb")
	public int field1091 = -1;

	@ObfuscatedName("h.Lb")
	public int field1101 = 32;

	@ObfuscatedName("h.Hb")
	public int field1097 = 0;

	@ObfuscatedName("h.Fb")
	public int field1095 = -1;

	@ObfuscatedName("h.Rb")
	public boolean field1107 = false;

	@ObfuscatedName("h.Nb")
	public int field1103 = -1;

	@ObfuscatedName("h.Jb")
	public int field1099 = -1;

	@ObfuscatedName("h.Wb")
	public class1 field1112 = class75.field1852;

	@ObfuscatedName("h.yc")
	public boolean field1140 = true;

	@ObfuscatedName("h.Pb")
	public int[] field1105;

	@ObfuscatedName("h.Zb")
	public int[] field1115;

	@ObfuscatedName("h.a(BLhe;Lhe;II)Lpa;")
	public class91 method448(class47 arg0, class47 arg1, int arg2, int arg3) {
		if (this.field1136 != null) {
			class42 var5 = this.method457();
			return var5 == null ? null : var5.method448(arg0, arg1, arg2, arg3);
		}
		class91 var6 = (class91) class133.field3278.method263((long) this.field1137);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.field1115.length; var8++) {
				if (!Statics.field3244.method218(this.field1115[var8], 0)) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			class91[] var9 = new class91[this.field1115.length];
			for (int var10 = 0; var10 < this.field1115.length; var10++) {
				var9[var10] = class91.method798(Statics.field3244, this.field1115[var10]);
			}
			if (var9.length == 1) {
				var6 = var9[0];
			} else {
				var6 = new class91(var9, var9.length);
			}
			if (this.field1138 != null) {
				for (int var11 = 0; var11 < this.field1138.length; var11++) {
					var6.method771(this.field1138[var11], this.field1105[var11]);
				}
			}
			var6.method778();
			var6.method770(this.field1097 + 64, 850 - -this.field1119, -30, -50, -30, true);
			class133.field3278.method262((long) this.field1137, var6);
		}
		class91 var12;
		if (arg0 != null && arg1 != null) {
			var12 = arg0.method485(var6, arg1, arg3, arg2);
		} else if (arg0 != null) {
			var12 = arg0.method494(arg3, var6);
		} else if (arg1 == null) {
			var12 = var6.method785(true);
		} else {
			var12 = arg1.method494(arg2, var6);
		}
		if (this.field1117 != 128 || this.field1125 != 128) {
			var12.method789(this.field1117, this.field1125, this.field1117);
		}
		return var12;
	}

	@ObfuscatedName("h.g(I)Z")
	public boolean method451() {
		if (this.field1136 == null) {
			return true;
		}
		int var1 = -1;
		if (this.field1121 != -1) {
			var1 = Statics.method480(this.field1121);
		} else if (this.field1095 != -1) {
			var1 = class113.field2803[this.field1095];
		}
		return var1 >= 0 && this.field1136.length > var1 && this.field1136[var1] != -1;
	}

	@ObfuscatedName("h.a(IILba;)V")
	public void method452(int arg0, class8 arg1) {
		if (arg0 == 1) {
			int var3 = arg1.method144();
			this.field1115 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1115[var4] = arg1.method145();
			}
		} else if (arg0 == 2) {
			this.field1112 = arg1.method140();
		} else if (arg0 == 12) {
			this.field1084 = arg1.method144();
		} else if (arg0 == 13) {
			this.field1092 = arg1.method145();
		} else if (arg0 == 14) {
			this.field1135 = arg1.method145();
		} else if (arg0 == 15) {
			this.field1131 = arg1.method145();
		} else if (arg0 == 16) {
			this.field1099 = arg1.method145();
		} else if (arg0 == 17) {
			this.field1135 = arg1.method145();
			this.field1116 = arg1.method145();
			this.field1128 = arg1.method145();
			this.field1123 = arg1.method145();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field1086[arg0 - 30] = arg1.method140();
			if (this.field1086[arg0 - 30].method14(class117.field2928)) {
				this.field1086[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			int var5 = arg1.method144();
			this.field1105 = new int[var5];
			this.field1138 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field1138[var6] = arg1.method145();
				this.field1105[var6] = arg1.method145();
			}
		} else if (arg0 == 60) {
			int var9 = arg1.method144();
			this.field1085 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field1085[var10] = arg1.method145();
			}
		} else if (arg0 == 93) {
			this.field1140 = false;
		} else if (arg0 == 95) {
			this.field1103 = arg1.method145();
		} else if (arg0 == 97) {
			this.field1117 = arg1.method145();
		} else if (arg0 == 98) {
			this.field1125 = arg1.method145();
		} else if (arg0 == 99) {
			this.field1107 = true;
		} else if (arg0 == 100) {
			this.field1097 = arg1.method184();
		} else if (arg0 == 101) {
			this.field1119 = arg1.method184() * 5;
		} else if (arg0 == 102) {
			this.field1091 = arg1.method145();
		} else if (arg0 == 103) {
			this.field1101 = arg1.method145();
		} else if (arg0 == 106) {
			this.field1121 = arg1.method145();
			if (this.field1121 == 65535) {
				this.field1121 = -1;
			}
			this.field1095 = arg1.method145();
			if (this.field1095 == 65535) {
				this.field1095 = -1;
			}
			int var7 = arg1.method144();
			this.field1136 = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.field1136[var8] = arg1.method145();
				if (this.field1136[var8] == 65535) {
					this.field1136[var8] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.field1082 = false;
		}
	}

	@ObfuscatedName("h.a(ZLba;)V")
	public void method453(class8 arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method452(var2, arg0);
		}
	}

	@ObfuscatedName("h.b(B)Lpa;")
	public class91 method455() {
		if (this.field1136 != null) {
			class42 var1 = this.method457();
			return var1 == null ? null : var1.method455();
		} else if (this.field1085 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < this.field1085.length; var3++) {
				if (!Statics.field3244.method218(this.field1085[var3], 0)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			class91[] var4 = new class91[this.field1085.length];
			for (int var5 = 0; var5 < this.field1085.length; var5++) {
				var4[var5] = class91.method798(Statics.field3244, this.field1085[var5]);
			}
			class91 var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new class91(var4, var4.length);
			}
			if (this.field1138 != null) {
				for (int var7 = 0; var7 < this.field1138.length; var7++) {
					var6.method771(this.field1138[var7], this.field1105[var7]);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("h.i(I)Lh;")
	public class42 method457() {
		int var1 = -1;
		if (this.field1121 != -1) {
			var1 = Statics.method480(this.field1121);
		} else if (this.field1095 != -1) {
			var1 = class113.field2803[this.field1095];
		}
		return var1 < 0 || var1 >= this.field1136.length || this.field1136[var1] == -1 ? null : Statics.method864(this.field1136[var1]);
	}

	@ObfuscatedName("h.c(B)V")
	public void method459() {
	}
}
