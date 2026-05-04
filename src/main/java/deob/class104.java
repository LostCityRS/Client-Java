package deob;

@ObfuscatedName("jf")
public final class class104 extends class23 {

	@ObfuscatedName("jf.ab")
	public int field1885 = 0;

	@ObfuscatedName("jf.bb")
	public int field1886 = 8192;

	@ObfuscatedName("jf.fb")
	public static final class88 field1890 = class208.method1423(105, "Stufe)2");

	@ObfuscatedName("jf.hb")
	public static class119 field1892;

	@ObfuscatedName("jf.ib")
	public static final class88 field1893 = class208.method1423(105, "Lade Sprites )2 ");

	@ObfuscatedName("jf.jb")
	public int field1894 = 2048;

	@ObfuscatedName("jf.kb")
	public static int field1895 = 0;

	@ObfuscatedName("jf.lb")
	public static int field1896 = -1;

	@ObfuscatedName("jf.mb")
	public int field1897 = 12288;

	@ObfuscatedName("jf.U")
	public static final class88 field1879 = class208.method1423(105, "(Y");

	@ObfuscatedName("jf.X")
	public static boolean field1882 = true;

	@ObfuscatedName("jf.T")
	public int field1878 = 4096;

	@ObfuscatedName("jf.Q")
	public int field1875 = 2048;

	@ObfuscatedName("jf.W")
	public int field1881 = 0;

	@ObfuscatedName("jf.c(B)I")
	public static int method717() {
		return 6;
	}

	@ObfuscatedName("jf.a(III)Z")
	public static boolean method718(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < class71.field1316; var3++) {
			class13 var4 = class159.field3075[var3];
			if (var4.field206 == 1) {
				int var5 = var4.field185 - arg0;
				if (var5 > 0) {
					int var6 = var4.field191 + (var4.field199 * var5 >> 8);
					int var7 = var4.field205 + (var4.field186 * var5 >> 8);
					int var8 = var4.field189 + (var4.field188 * var5 >> 8);
					int var9 = var4.field196 + (var4.field201 * var5 >> 8);
					if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
						return true;
					}
				}
			} else if (var4.field206 == 2) {
				int var10 = arg0 - var4.field185;
				if (var10 > 0) {
					int var11 = var4.field191 + (var4.field199 * var10 >> 8);
					int var12 = var4.field205 + (var4.field186 * var10 >> 8);
					int var13 = var4.field189 + (var4.field188 * var10 >> 8);
					int var14 = var4.field196 + (var4.field201 * var10 >> 8);
					if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
						return true;
					}
				}
			} else if (var4.field206 == 3) {
				int var15 = var4.field191 - arg2;
				if (var15 > 0) {
					int var16 = var4.field185 + (var4.field197 * var15 >> 8);
					int var17 = var4.field193 + (var4.field195 * var15 >> 8);
					int var18 = var4.field189 + (var4.field188 * var15 >> 8);
					int var19 = var4.field196 + (var4.field201 * var15 >> 8);
					if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
						return true;
					}
				}
			} else if (var4.field206 == 4) {
				int var20 = arg2 - var4.field191;
				if (var20 > 0) {
					int var21 = var4.field185 + (var4.field197 * var20 >> 8);
					int var22 = var4.field193 + (var4.field195 * var20 >> 8);
					int var23 = var4.field189 + (var4.field188 * var20 >> 8);
					int var24 = var4.field196 + (var4.field201 * var20 >> 8);
					if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
						return true;
					}
				}
			} else if (var4.field206 == 5) {
				int var25 = arg1 - var4.field189;
				if (var25 > 0) {
					int var26 = var4.field185 + (var4.field197 * var25 >> 8);
					int var27 = var4.field193 + (var4.field195 * var25 >> 8);
					int var28 = var4.field191 + (var4.field199 * var25 >> 8);
					int var29 = var4.field205 + (var4.field186 * var25 >> 8);
					if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@ObfuscatedName("jf.a(BIIII)V")
	public static void method719(int arg0, int arg1, int arg2, int arg3) {
		if (class228.field4276 < 100) {
			class189.method1319();
		}
		class72.method480(arg2, arg3, arg0 + arg2, arg1 + arg3);
		if (class228.field4276 < 100) {
			int var4 = arg0 / 2 + arg2;
			int var5 = arg1 / 2 + arg3 - 38;
			class72.method478(arg2, arg3, arg0, arg1, 0);
			class72.method476(var4 - 152, var5, 304, 34, 9179409);
			class72.method476(var4 - 151, var5 + 1, 302, 32, 0);
			class72.method478(var4 - 150, var5 + 2, class228.field4276 * 3, 30, 9179409);
			class72.method478(var4 + class228.field4276 * 3 - 150, var5 - -2, 300 - class228.field4276 * 3, 30, 0);
			class54.field1011.method141(class196.field3763, var4, var5 + 20, 16777215, -1);
			return;
		}
		class39.field693 = class126.field2330 - (int) ((double) arg0 / class59.field1110);
		int var6 = class126.field2330 - (int) ((double) arg0 / class59.field1110);
		class43.field727 = class157.field3033 - (int) ((double) arg1 / class59.field1110);
		class164.field3136 = (int) ((double) (arg1 * 2) / class59.field1110);
		int var7 = class157.field3033 - (int) ((double) arg1 / class59.field1110);
		class71.field1309 = (int) ((double) (arg0 * 2) / class59.field1110);
		int var8 = (int) ((double) arg0 / class59.field1110) + class126.field2330;
		int var9 = (int) ((double) arg1 / class59.field1110) + class157.field3033;
		class46.method348(arg1 + arg3, arg2 - -arg0, arg2, arg3, var9, var6, var8, var7);
		class223.method1500(arg3, arg2, arg2 + arg0, arg1 + arg3, var7, var8, var6, var9);
		if (class54.field1012 > 0) {
			class54.field1012--;
		}
		if (!class148.field2768) {
			return;
		}
		int var10 = arg2 + arg0 - 5;
		int var11 = arg1 + arg3 - 8;
		class3.field30.method150(class166.method1140(new class88[] { class53.field993, class170.method1212(class13.field192) }), var10, var11, 16776960, -1);
		int var15 = var11 - 15;
		Runtime var12 = Runtime.getRuntime();
		int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
		int var14 = 16776960;
		if (var13 > 65536) {
			var14 = 16711680;
		}
		class3.field30.method150(class166.method1140(new class88[] { class71.field1325, class170.method1212(var13), class77.field1385 }), var10, var15, var14, -1);
		var11 = var15 - 15;
	}

	@ObfuscatedName("jf.a(IIIB)Lpe;")
	public static class168 method720(int arg0, int arg1, int arg2) {
		class168 var3 = new class168();
		var3.field3233 = arg0;
		var3.field3229 = arg2;
		class128.field2395.method1052((long) arg1, var3);
		class149.method1005(arg2);
		class174 var4 = class239.method1579(arg1);
		if (var4 != null) {
			class200.method1371(var4);
		}
		if (class53.field967 != null) {
			class200.method1371(class53.field967);
			class53.field967 = null;
		}
		class108.field1958 = false;
		class203.field3862 = 0;
		class126.method861(class47.field889, class237.field4421, class234.field4383, class86.field1549);
		if (var4 != null) {
			class110.method759(false, var4);
		}
		class146.method972(arg2);
		if (class43.field723 != -1) {
			class137.method912(class43.field723, 1);
		}
		return var3;
	}

	@ObfuscatedName("jf.a(Lu;I)V")
	public static void method721(class218 arg0) {
		arg0.field4093 = false;
		if (arg0.field4106 != -1) {
			class109 var1 = class15.method75(arg0.field4106);
			if (var1 == null || var1.field1965 == null) {
				arg0.field4106 = -1;
			} else {
				arg0.field4111++;
				if (arg0.field4127 < var1.field1965.length && var1.field1990[arg0.field4127] < arg0.field4111) {
					arg0.field4111 = 1;
					arg0.field4127++;
					class60.method433(arg0 == class240.field4456, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
				if (arg0.field4127 >= var1.field1965.length) {
					arg0.field4127 = 0;
					arg0.field4111 = 0;
					class60.method433(arg0 == class240.field4456, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
			}
		}
		if (arg0.field4080 != -1 && class117.field2113 >= arg0.field4082) {
			if (arg0.field4075 < 0) {
				arg0.field4075 = 0;
			}
			int var2 = class62.method441(arg0.field4080).field542;
			if (var2 == -1) {
				arg0.field4080 = -1;
			} else {
				class109 var3 = class15.method75(var2);
				if (var3 == null || var3.field1965 == null) {
					arg0.field4080 = -1;
				} else {
					arg0.field4120++;
					if (var3.field1965.length > arg0.field4075 && var3.field1990[arg0.field4075] < arg0.field4120) {
						arg0.field4075++;
						arg0.field4120 = 1;
						class60.method433(class240.field4456 == arg0, arg0.field4121, arg0.field4075, arg0.field4136, var3);
					}
					if (arg0.field4075 >= var3.field1965.length) {
						arg0.field4080 = -1;
					}
				}
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 <= 1) {
			class109 var4 = class15.method75(arg0.field4077);
			if (var4.field1983 == 1 && arg0.field4137 > 0 && arg0.field4133 <= class117.field2113 && class117.field2113 > arg0.field4130) {
				arg0.field4140 = 1;
				return;
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 == 0) {
			class109 var5 = class15.method75(arg0.field4077);
			if (var5 == null || var5.field1965 == null) {
				arg0.field4077 = -1;
			} else {
				arg0.field4098++;
				if (arg0.field4101 < var5.field1965.length && var5.field1990[arg0.field4101] < arg0.field4098) {
					arg0.field4098 = 1;
					arg0.field4101++;
					class60.method433(arg0 == class240.field4456, arg0.field4121, arg0.field4101, arg0.field4136, var5);
				}
				if (arg0.field4101 >= var5.field1965.length) {
					arg0.field4132++;
					arg0.field4101 -= var5.field1972;
					if (arg0.field4132 >= var5.field1970) {
						arg0.field4077 = -1;
					} else if (arg0.field4101 >= 0 && arg0.field4101 < var5.field1965.length) {
						class60.method433(arg0 == class240.field4456, arg0.field4121, arg0.field4101, arg0.field4136, var5);
					} else {
						arg0.field4077 = -1;
					}
				}
				arg0.field4093 = var5.field1960;
			}
		}
		if (arg0.field4140 > 0) {
			arg0.field4140--;
		}
	}

	public class104() {
		super(0, true);
	}

	@ObfuscatedName("jf.b(IBI)Z")
	public boolean method715(int arg0, int arg1) {
		int var3 = this.field1897 * (arg1 + arg0) >> 12;
		int var4 = class150.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.field1897;
		int var6 = (var5 << 12) / this.field1886;
		int var7 = this.field1878 * var6 >> 12;
		return arg1 - arg0 < var7 && -var7 < arg1 - arg0;
	}

	@ObfuscatedName("jf.b(B)V")
	@Override
	public void method123() {
		class108.method740();
	}

	@ObfuscatedName("jf.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field1875 = arg0.method301();
		} else if (arg1 == 1) {
			this.field1885 = arg0.method301();
		} else if (arg1 == 2) {
			this.field1881 = arg0.method301();
		} else if (arg1 == 3) {
			this.field1894 = arg0.method301();
		} else if (arg1 == 4) {
			this.field1897 = arg0.method301();
		} else if (arg1 == 5) {
			this.field1878 = arg0.method301();
		} else if (arg1 == 6) {
			this.field1886 = arg0.method301();
		}
	}

	@ObfuscatedName("jf.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			int var3 = class111.field2021[arg0] - 2048;
			for (int var4 = 0; var4 < class70.field1276; var4++) {
				int var5 = class22.field351[var4] - 2048;
				int var6 = var5 + this.field1875;
				int var7 = this.field1885 + var3;
				int var8 = var7 >= -2048 ? var7 : var7 + 4096;
				int var9 = var8 > 2048 ? var8 - 4096 : var8;
				int var10 = var6 < -2048 ? var6 + 4096 : var6;
				int var11 = var10 <= 2048 ? var10 : var10 - 4096;
				int var12 = this.field1894 + var3;
				int var13 = var12 < -2048 ? var12 + 4096 : var12;
				int var14 = var13 <= 2048 ? var13 : var13 - 4096;
				int var15 = this.field1881 + var5;
				int var16 = var15 >= -2048 ? var15 : var15 + 4096;
				int var17 = var16 <= 2048 ? var16 : var16 - 4096;
				var2[var4] = this.method722(var11, var9) || this.method715(var17, var14) ? 4096 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("jf.b(III)Z")
	public boolean method722(int arg0, int arg1) {
		int var3 = (arg1 - arg0) * this.field1897 >> 12;
		int var4 = class150.field2920[var3 * 255 >> 12 & 0xFF];
		int var5 = (var4 << 12) / this.field1897;
		int var6 = (var5 << 12) / this.field1886;
		int var7 = this.field1878 * var6 >> 12;
		return var7 > arg0 + arg1 && -var7 < arg1 + arg0;
	}
}
