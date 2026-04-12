package deob;

@ObfuscatedName("la")
public final class class67 {

	@ObfuscatedName("la.d")
	public boolean field1658;

	@ObfuscatedName("la.g")
	public static JagString field1661 = JagString.wrap("*6n");

	@ObfuscatedName("la.m")
	public int[] field1667;

	@ObfuscatedName("la.q")
	public int field1671;

	@ObfuscatedName("la.s")
	public static JagString field1673 = JagString.wrap("(U(Y");

	@ObfuscatedName("la.t")
	public static JagString field1674 = JagString.wrap("Trade)4compete");

	@ObfuscatedName("la.v")
	public static JagString field1676 = field1674;

	@ObfuscatedName("la.y")
	public static int field1679 = 0;

	@ObfuscatedName("la.E")
	public static JagString field1685 = JagString.wrap("Off");

	@ObfuscatedName("la.c")
	public static JagString field1657 = field1685;

	@ObfuscatedName("la.D")
	public static final int field1684 = 50;

	@ObfuscatedName("la.r")
	public static JagString[] field1672 = new JagString[field1684];

	@ObfuscatedName("la.p")
	public static int[] field1670 = new int[field1684];

	@ObfuscatedName("la.i")
	public static int[] field1663 = new int[field1684];

	@ObfuscatedName("la.e")
	public static int[] field1659 = new int[field1684];

	@ObfuscatedName("la.f")
	public static int[] field1660 = new int[field1684];

	@ObfuscatedName("la.a")
	public static int[] field1655 = new int[field1684];

	@ObfuscatedName("la.G")
	public static int[] field1687 = new int[field1684];

	@ObfuscatedName("la.J")
	public static int[] field1690 = new int[field1684];

	@ObfuscatedName("la.C")
	public static int field1683 = -1;

	@ObfuscatedName("la.K")
	public static JagString field1691 = JagString.wrap("scape main");

	@ObfuscatedName("la.M")
	public long field1693;

	@ObfuscatedName("la.N")
	public long field1694;

	@ObfuscatedName("la.H")
	public int[] field1688;

	@ObfuscatedName("la.a(I)I")
	public int method634() {
		return this.field1671 == -1 ? (this.field1688[4] << 20) + ((this.field1688[0] << 25) + (this.field1667[0] << 15)) + (this.field1667[8] << 10) + (this.field1667[11] << 5) + this.field1667[1] : Statics.method864(this.field1671).field1137 + 305419896;
	}

	@ObfuscatedName("la.a(ILba;)V")
	public void method635(class8 arg0) {
		arg0.method141(this.field1658 ? 1 : 0);
		for (int var2 = 0; var2 < 7; var2++) {
			int var3 = this.field1667[class114.field2808[var2]];
			if (var3 == 0) {
				arg0.method141(-1);
			} else {
				arg0.method141(var3 - 256);
			}
		}
		for (int var4 = 0; var4 < 5; var4++) {
			arg0.method141(this.field1688[var4]);
		}
	}

	@ObfuscatedName("la.a(Lhe;Lhe;IIB)Lpa;")
	public class91 method637(class47 arg0, class47 arg1, int arg2, int arg3) {
		if (this.field1671 != -1) {
			return Statics.method864(this.field1671).method448(arg0, arg1, arg2, arg3);
		}
		long var5 = this.field1693;
		int[] var7 = this.field1667;
		if (arg0 != null && (arg0.field1234 >= 0 || arg0.field1246 >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.field1667[var8];
			}
			if (arg0.field1234 >= 0) {
				var5 += arg0.field1234 - this.field1667[5] << 8;
				var7[5] = arg0.field1234;
			}
			if (arg0.field1246 >= 0) {
				var5 += arg0.field1246 - this.field1667[3] << 16;
				var7[3] = arg0.field1246;
			}
		}
		class91 var9 = (class91) Js5.field379.method263(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if (var12 >= 256 && var12 < 512 && !Statics.method177(var12 - 256).method821()) {
					var10 = true;
				}
				if (var12 >= 512 && !Statics.method760(var12 - 512).method940(this.field1658)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field1694 != -1L) {
					var9 = (class91) Js5.field379.method263(this.field1694);
				}
				if (var9 == null) {
					return null;
				}
			}
			if (var9 == null) {
				class91[] var13 = new class91[12];
				int var14 = 0;
				for (int var15 = 0; var15 < 12; var15++) {
					int var16 = var7[var15];
					if (var16 >= 256 && var16 < 512) {
						class91 var17 = Statics.method177(var16 - 256).method828();
						if (var17 != null) {
							var13[var14++] = var17;
						}
					}
					if (var16 >= 512) {
						class91 var18 = Statics.method760(var16 - 512).method941(this.field1658);
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				var9 = new class91(var13, var14);
				for (int var19 = 0; var19 < 5; var19++) {
					if (this.field1688[var19] != 0) {
						var9.method771(class116.field2894[var19][0], class116.field2894[var19][this.field1688[var19]]);
						if (var19 == 1) {
							var9.method771(class75.field1865[0], class75.field1865[this.field1688[var19]]);
						}
					}
				}
				var9.method778();
				var9.method770(64, 850, -30, -50, -30, true);
				Js5.field379.method262(var5, var9);
				this.field1694 = var5;
			}
		}
		if (arg0 == null && arg1 == null) {
			return var9;
		}
		class91 var20;
		if (arg0 != null && arg1 != null) {
			var20 = arg0.method485(var9, arg1, arg3, arg2);
		} else if (arg0 == null) {
			var20 = arg1.method494(arg2, var9);
		} else {
			var20 = arg0.method494(arg3, var9);
		}
		return var20;
	}

	@ObfuscatedName("la.c(I)V")
	public void method638() {
		int var1 = this.field1667[9];
		int var2 = this.field1667[5];
		long var3 = this.field1693;
		this.field1667[5] = var1;
		this.field1667[9] = var2;
		this.field1693 = 0L;
		for (int var5 = 0; var5 < 12; var5++) {
			this.field1693 <<= 0x4;
			if (this.field1667[var5] >= 256) {
				this.field1693 += this.field1667[var5] - 256;
			}
		}
		if (this.field1667[0] >= 256) {
			this.field1693 += this.field1667[0] - 256 >> 4;
		}
		if (this.field1667[1] >= 256) {
			this.field1693 += this.field1667[1] - 256 >> 8;
		}
		for (int var6 = 0; var6 < 5; var6++) {
			this.field1693 <<= 0x3;
			this.field1693 += this.field1688[var6];
		}
		this.field1693 <<= 0x1;
		this.field1693 += this.field1658 ? 1 : 0;
		this.field1667[5] = var2;
		this.field1667[9] = var1;
		if (var3 != 0L && this.field1693 != var3) {
			Js5.field379.method264(var3);
		}
	}

	@ObfuscatedName("la.d(I)Lpa;")
	public class91 method639() {
		if (this.field1671 != -1) {
			return Statics.method864(this.field1671).method455();
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field1667[var2];
			if (var3 >= 256 && var3 < 512 && !Statics.method177(var3 - 256).method822()) {
				var1 = true;
			}
			if (var3 >= 512 && !Statics.method760(var3 - 512).method939(this.field1658)) {
				var1 = true;
			}
		}
		if (var1) {
			return null;
		}
		class91[] var4 = new class91[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = this.field1667[var6];
			if (var7 >= 256 && var7 < 512) {
				class91 var8 = Statics.method177(var7 - 256).method827();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}
			if (var7 >= 512) {
				class91 var9 = Statics.method760(var7 - 512).method948(this.field1658);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}
		class91 var10 = new class91(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field1688[var11] != 0) {
				var10.method771(class116.field2894[var11][0], class116.field2894[var11][this.field1688[var11]]);
				if (var11 == 1) {
					var10.method771(class75.field1865[0], class75.field1865[this.field1688[var11]]);
				}
			}
		}
		return var10;
	}

	@ObfuscatedName("la.a([IZI[II)V")
	public void method640(int[] arg0, boolean arg1, int[] arg2, int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < Statics.field974; var6++) {
					class95 var7 = Statics.method177(var6);
					if (var7 != null && !var7.field2373 && var5 + (arg1 ? 7 : 0) == var7.field2366) {
						arg0[class114.field2808[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.field1671 = arg3;
		this.field1658 = arg1;
		this.field1667 = arg0;
		this.field1688 = arg2;
		this.method638();
	}

	@ObfuscatedName("la.a(IZI)V")
	public void method642(int arg0, boolean arg1) {
		if (arg0 == 1 && this.field1658) {
			return;
		}
		int var3 = this.field1667[class114.field2808[arg0]];
		if (var3 == 0) {
			return;
		}
		var3 -= 256;
		class95 var4;
		do {
			if (arg1) {
				var3++;
				if (Statics.field974 <= var3) {
					var3 = 0;
				}
			} else {
				var3--;
				if (var3 < 0) {
					var3 = Statics.field974 - 1;
				}
			}
			var4 = Statics.method177(var3);
		} while (var4 == null || var4.field2373 || var4.field2366 != arg0 + (this.field1658 ? 7 : 0));
		this.field1667[class114.field2808[arg0]] = var3 + 256;
		this.method638();
	}

	@ObfuscatedName("la.a(ZB)V")
	public void method643(boolean arg0) {
		if (this.field1658 != arg0) {
			this.method640(null, arg0, this.field1688, -1);
		}
	}

	@ObfuscatedName("la.b(IZI)V")
	public void method644(boolean arg0, int arg1) {
		int var3 = this.field1688[arg1];
		if (arg0) {
			var3++;
			if (var3 >= class116.field2894[arg1].length) {
				var3 = 0;
			}
		} else {
			var3--;
			if (var3 < 0) {
				var3 = class116.field2894[arg1].length - 1;
			}
		}
		this.field1688[arg1] = var3;
		this.method638();
	}
}
