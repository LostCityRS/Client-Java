package deob;

import java.awt.Component;

@ObfuscatedName("ej")
public class class55 {

	@ObfuscatedName("ej.b")
	public static final class88 field1015 = class208.method1423(105, "Verbindung konnte nicht hergestellt werden)3");

	@ObfuscatedName("ej.h")
	public final int field1021 = 32;

	@ObfuscatedName("ej.i")
	public static int field1022 = 0;

	@ObfuscatedName("ej.j")
	public static final int[] field1023 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@ObfuscatedName("ej.l")
	public int[] field1025;

	@ObfuscatedName("ej.n")
	public static int field1027 = 0;

	@ObfuscatedName("ej.s")
	public static class87 field1032 = null;

	@ObfuscatedName("ej.t")
	public static int field1033 = -1;

	@ObfuscatedName("ej.u")
	public static final class88 field1034 = class208.method1423(105, "Please check your message)2centre for details)3");

	@ObfuscatedName("ej.c")
	public static class88 field1016 = field1034;

	@ObfuscatedName("ej.v")
	public long field1035 = class206.method1418();

	@ObfuscatedName("ej.w")
	public class51 field1036;

	@ObfuscatedName("ej.B")
	public static int field1041 = 0;

	@ObfuscatedName("ej.z")
	public boolean field1039 = true;

	@ObfuscatedName("ej.x")
	public final class51[] field1037 = new class51[8];

	@ObfuscatedName("ej.F")
	public long field1045 = 0L;

	@ObfuscatedName("ej.G")
	public int field1046 = 0;

	@ObfuscatedName("ej.C")
	public int field1042 = 0;

	@ObfuscatedName("ej.I")
	public int field1048 = 0;

	@ObfuscatedName("ej.E")
	public long field1044 = 0L;

	@ObfuscatedName("ej.J")
	public int field1049 = 0;

	@ObfuscatedName("ej.L")
	public final class51[] field1051 = new class51[8];

	@ObfuscatedName("ej.y")
	public int field1038;

	@ObfuscatedName("ej.D")
	public int field1043;

	@ObfuscatedName("ej.M")
	public int field1052;

	@ObfuscatedName("ej.b(II)I")
	public static int method407(int arg0) {
		int var1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			var1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			var1 += 8;
		}
		if (arg0 >= 16) {
			var1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			var1 += 2;
		}
		if (arg0 >= 1) {
			var1++;
			arg0 >>>= 0x1;
		}
		return var1 + arg0;
	}

	@ObfuscatedName("ej.a(Lih;IIIIIIIZ)V")
	public static void method411(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
		int var9;
		int var10 = var9 = (arg6 << 7) - class74.field1353;
		int var11;
		int var12 = var11 = (arg7 << 7) - class216.field4048;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = class62.field1137[arg1][arg6][arg7] - class241.field4461;
		int var18 = class62.field1137[arg1][arg6 + 1][arg7] - class241.field4461;
		int var19 = class62.field1137[arg1][arg6 + 1][arg7 + 1] - class241.field4461;
		int var20 = class62.field1137[arg1][arg6][arg7 + 1] - class241.field4461;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = var11 * arg4 + var14 * arg5 >> 16;
		int var28 = var11 * arg5 - var14 * arg4 >> 16;
		int var30 = var18 * arg3 - var28 * arg2 >> 16;
		int var31 = var18 * arg2 + var28 * arg3 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = var16 * arg4 + var13 * arg5 >> 16;
		int var34 = var16 * arg5 - var13 * arg4 >> 16;
		int var36 = var19 * arg3 - var34 * arg2 >> 16;
		int var37 = var19 * arg2 + var34 * arg3 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = var15 * arg4 + var9 * arg5 >> 16;
		int var40 = var15 * arg5 - var9 * arg4 >> 16;
		int var42 = var20 * arg3 - var40 * arg2 >> 16;
		int var43 = var20 * arg2 + var40 * arg3 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = class173.field3363 + (var21 << 9) / var25;
		int var45 = class173.field3361 + (var24 << 9) / var25;
		int var46 = class173.field3363 + (var27 << 9) / var31;
		int var47 = class173.field3361 + (var30 << 9) / var31;
		int var48 = class173.field3363 + (var33 << 9) / var37;
		int var49 = class173.field3361 + (var36 << 9) / var37;
		int var50 = class173.field3363 + (var39 << 9) / var43;
		int var51 = class173.field3361 + (var42 << 9) / var43;
		class173.field3348 = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			if (class118.field2145 && class23.method122(class39.field698 + class173.field3363, class35.field621 + class173.field3361, var49, var51, var47, var48, var50, var46)) {
				class114.field2057 = arg6;
				class90.field1714 = arg7;
			}
			if (!arg8) {
				class173.field3358 = false;
				if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class173.field3350 || var50 > class173.field3350 || var46 > class173.field3350) {
					class173.field3358 = true;
				}
				if (arg0.field1763 == -1) {
					if (arg0.field1766 != 12345678) {
						class173.method1227(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773);
					}
				} else if (class104.field1882) {
					int var52 = class173.field3356.method438(arg0.field1763);
					class173.method1227(var49, var51, var47, var48, var50, var46, class117.method791(var52, arg0.field1766), class117.method791(var52, arg0.field1759), class117.method791(var52, arg0.field1773));
				} else if (arg0.field1769) {
					class173.method1225(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1763);
				} else {
					class173.method1225(var49, var51, var47, var48, var50, var46, arg0.field1766, arg0.field1759, arg0.field1773, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1763);
				}
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		if (class118.field2145 && class23.method122(class39.field698 + class173.field3363, class35.field621 + class173.field3361, var45, var47, var51, var44, var46, var50)) {
			class114.field2057 = arg6;
			class90.field1714 = arg7;
		}
		if (arg8) {
			return;
		}
		class173.field3358 = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class173.field3350 || var46 > class173.field3350 || var50 > class173.field3350) {
			class173.field3358 = true;
		}
		if (arg0.field1763 != -1) {
			if (!class104.field1882) {
				class173.method1225(var45, var47, var51, var44, var46, var50, arg0.field1761, arg0.field1773, arg0.field1759, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1763);
				return;
			}
			int var53 = class173.field3356.method438(arg0.field1763);
			class173.method1227(var45, var47, var51, var44, var46, var50, class117.method791(var53, arg0.field1761), class117.method791(var53, arg0.field1773), class117.method791(var53, arg0.field1759));
		} else if (arg0.field1761 != 12345678) {
			class173.method1227(var45, var47, var51, var44, var46, var50, arg0.field1761, arg0.field1773, arg0.field1759);
			return;
		}
	}

	@ObfuscatedName("ej.a()I")
	public int method398() throws Exception {
		return this.field1038;
	}

	@ObfuscatedName("ej.a(II)V")
	public void method399() {
		this.field1046 -= 256;
		if (this.field1046 < 0) {
			this.field1046 = 0;
		}
		if (this.field1036 != null) {
			this.field1036.method384(256);
		}
	}

	@ObfuscatedName("ej.b()V")
	public void method400() throws Exception {
	}

	@ObfuscatedName("ej.a(I)V")
	public final synchronized void method401() {
		this.field1039 = true;
		try {
			this.method413();
		} catch (Exception var1) {
			this.method408();
			this.field1045 = class206.method1418() + 2000L;
		}
	}

	@ObfuscatedName("ej.b(I)V")
	public final synchronized void method402() {
		if (class146.field2738 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (class146.field2738.field3102[var2] == this) {
					class146.field2738.field3102[var2] = null;
				}
				if (class146.field2738.field3102[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				class146.field2738.field3106 = true;
				while (class146.field2738.field3107) {
					class21.method98(50L);
				}
				class146.field2738 = null;
			}
		}
		this.method408();
		this.field1025 = null;
	}

	@ObfuscatedName("ej.a(Z)V")
	public final void method403() {
		this.field1039 = true;
	}

	@ObfuscatedName("ej.a(IILef;)V")
	public void method404(int arg0, class51 arg1) {
		int var3 = arg0 >> 5;
		class51 var4 = this.field1037[var3];
		if (var4 == null) {
			this.field1051[var3] = arg1;
		} else {
			var4.field936 = arg1;
		}
		this.field1037[var3] = arg1;
		arg1.field934 = arg0;
	}

	@ObfuscatedName("ej.a([II)V")
	public void method405(int[] arg0) {
		short var2 = 256;
		if (class7.field99) {
			var2 = 512;
		}
		class124.method835(arg0, 0, var2);
		this.field1046 -= 256;
		if (this.field1036 != null && this.field1046 <= 0) {
			this.field1046 += class11.field161 >> 4;
			class21.method99(this.field1036);
			this.method404(this.field1036.method382(), this.field1036);
			int var3 = 0;
			int var4 = 255;
			int var5 = 7;
			label103: while (var4 != 0) {
				int var6;
				int var7;
				if (var5 < 0) {
					var6 = var5 & 0x3;
					var7 = -(var5 >> 2);
				} else {
					var6 = var5;
					var7 = 0;
				}
				for (int var8 = var4 >>> var6 & 0x11111111; var8 != 0; var8 >>>= 0x4) {
					if ((var8 & 0x1) != 0) {
						var4 &= ~(0x1 << var6);
						class51 var9 = null;
						class51 var10 = this.field1051[var6];
						label97: while (true) {
							while (true) {
								if (var10 == null) {
									break label97;
								}
								class69 var11 = var10.field935;
								if (var11 == null || var11.field1254 <= var7) {
									var10.field937 = true;
									int var12 = var10.method383();
									var3 += var12;
									if (var11 != null) {
										var11.field1254 += var12;
									}
									if (var3 >= this.field1021) {
										break label103;
									}
									class51 var13 = var10.method385();
									if (var13 != null) {
										int var14 = var10.field934;
										while (var13 != null) {
											this.method404(var14 * var13.method382() >> 8, var13);
											var13 = var10.method380();
										}
									}
									class51 var15 = var10.field936;
									var10.field936 = null;
									if (var9 == null) {
										this.field1051[var6] = var15;
									} else {
										var9.field936 = var15;
									}
									if (var15 == null) {
										this.field1037[var6] = var9;
									}
									var10 = var15;
								} else {
									var4 |= 0x1 << var6;
									var9 = var10;
									var10 = var10.field936;
								}
							}
						}
					}
					var6 += 4;
					var7++;
				}
				var5--;
			}
			for (int var16 = 0; var16 < 8; var16++) {
				class51 var17 = this.field1051[var16];
				this.field1051[var16] = this.field1037[var16] = null;
				while (var17 != null) {
					class51 var18 = var17.field936;
					var17.field936 = null;
					var17 = var18;
				}
			}
		}
		if (this.field1046 < 0) {
			this.field1046 = 0;
		}
		if (this.field1036 != null) {
			this.field1036.method379(arg0, 0, 256);
		}
		this.field1035 = class206.method1418();
	}

	@ObfuscatedName("ej.a(B)V")
	public final synchronized void method406() {
		if (this.field1025 == null) {
			return;
		}
		long var1 = class206.method1418();
		try {
			if (this.field1045 != 0L) {
				if (var1 < this.field1045) {
					return;
				}
				this.method409(this.field1038);
				this.field1045 = 0L;
				this.field1039 = true;
			}
			int var3 = this.method398();
			int var4 = this.field1052 + this.field1043;
			if (this.field1049 - var3 > this.field1042) {
				this.field1042 = this.field1049 - var3;
			}
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (this.field1038 < var4 + 256) {
				var3 = 0;
				this.field1038 += 1024;
				if (this.field1038 > 16384) {
					this.field1038 = 16384;
				}
				this.method408();
				this.method409(this.field1038);
				this.field1039 = true;
				if (var4 + 256 > this.field1038) {
					var4 = this.field1038 - 256;
					this.field1052 = var4 - this.field1043;
				}
			}
			while (var3 < var4) {
				this.method405(this.field1025);
				this.method400();
				var3 += 256;
			}
			if (var1 > this.field1044) {
				if (this.field1039) {
					this.field1039 = false;
				} else if (this.field1042 == 0 && this.field1048 == 0) {
					this.method408();
					this.field1045 = var1 + 2000L;
					return;
				} else {
					this.field1052 = Math.min(this.field1048, this.field1042);
					this.field1048 = this.field1042;
				}
				this.field1042 = 0;
				this.field1044 = var1 + 2000L;
			}
			this.field1049 = var3;
		} catch (Exception var6) {
			this.method408();
			this.field1045 = var1 + 2000L;
		}
		try {
			if (var1 > this.field1035 + 500000L) {
				var1 = this.field1035;
			}
			while (var1 > this.field1035 + 5000L) {
				this.method399();
				this.field1035 += 256000 / class11.field161;
			}
		} catch (Exception var5) {
			this.field1035 = var1;
		}
	}

	@ObfuscatedName("ej.c()V")
	public void method408() {
	}

	@ObfuscatedName("ej.c(I)V")
	public void method409(int arg0) throws Exception {
	}

	@ObfuscatedName("ej.a(Lef;I)V")
	public final synchronized void method410(class51 arg0) {
		this.field1036 = arg0;
	}

	@ObfuscatedName("ej.a(Ljava/awt/Component;)V")
	public void method412(Component arg0) throws Exception {
	}

	@ObfuscatedName("ej.d()V")
	public void method413() throws Exception {
	}
}
