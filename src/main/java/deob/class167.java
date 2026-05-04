package deob;

@ObfuscatedName("pd")
public final class class167 extends class23 {

	@ObfuscatedName("pd.bb")
	public int field3213;

	@ObfuscatedName("pd.eb")
	public static final class88 field3216 = class208.method1423(105, " steht bereits auf Ihrer Freunde)2Liste(Q");

	@ObfuscatedName("pd.fb")
	public static class130[] field3217;

	@ObfuscatedName("pd.gb")
	public int field3218 = 0;

	@ObfuscatedName("pd.ib")
	public static final class248 field3220 = new class248();

	@ObfuscatedName("pd.jb")
	public static byte[][] field3221;

	@ObfuscatedName("pd.kb")
	public static class29 field3222;

	@ObfuscatedName("pd.lb")
	public static class222 field3223;

	@ObfuscatedName("pd.mb")
	public int field3224;

	@ObfuscatedName("pd.ob")
	public int field3226 = 0;

	@ObfuscatedName("pd.Q")
	public static final long[] field3203 = new long[100];

	@ObfuscatedName("pd.T")
	public int field3206 = 0;

	@ObfuscatedName("pd.U")
	public int field3207;

	@ObfuscatedName("pd.V")
	public int field3208;

	@ObfuscatedName("pd.X")
	public int field3209;

	@ObfuscatedName("pd.Y")
	public int field3210;

	@ObfuscatedName("pd.S")
	public static class75 field3205;

	@ObfuscatedName("pd.Z")
	public static boolean[] field3211;

	@ObfuscatedName("pd.a(I[Lgd;II)V")
	public static void method1143(int arg0, class70[] arg1, int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		int var3 = arg0 - 1;
		int var4 = (arg0 + arg2) / 2;
		int var5 = arg2 + 1;
		class70 var6 = arg1[var4];
		arg1[var4] = arg1[arg0];
		arg1[arg0] = var6;
		while (var3 < var5) {
			boolean var7 = true;
			do {
				var5--;
				for (int var8 = 0; var8 < 4; var8++) {
					int var9;
					int var10;
					if (class27.field461[var8] == 2) {
						var10 = arg1[var5].field1258;
						var9 = var6.field1258;
					} else if (class27.field461[var8] == 1) {
						var9 = var6.field1255;
						if (var9 == -1 && class89.field1686[var8] == 1) {
							var9 = 2001;
						}
						var10 = arg1[var5].field1255;
						if (var10 == -1 && class89.field1686[var8] == 1) {
							var10 = 2001;
						}
					} else if (class27.field461[var8] == 3) {
						var10 = arg1[var5].field1257 ? 1 : 0;
						var9 = var6.field1257 ? 1 : 0;
					} else {
						var10 = arg1[var5].field1261;
						var9 = var6.field1261;
					}
					if (var10 != var9) {
						if ((class89.field1686[var8] != 1 || var10 <= var9) && (class89.field1686[var8] != 0 || var10 >= var9)) {
							var7 = false;
						}
						break;
					}
					if (var8 == 3) {
						var7 = false;
					}
				}
			} while (var7);
			boolean var11 = true;
			do {
				var3++;
				for (int var12 = 0; var12 < 4; var12++) {
					int var13;
					int var14;
					if (class27.field461[var12] == 2) {
						var13 = arg1[var3].field1258;
						var14 = var6.field1258;
					} else if (class27.field461[var12] == 1) {
						var13 = arg1[var3].field1255;
						if (var13 == -1 && class89.field1686[var12] == 1) {
							var13 = 2001;
						}
						var14 = var6.field1255;
						if (var14 == -1 && class89.field1686[var12] == 1) {
							var14 = 2001;
						}
					} else if (class27.field461[var12] == 3) {
						var13 = arg1[var3].field1257 ? 1 : 0;
						var14 = var6.field1257 ? 1 : 0;
					} else {
						var13 = arg1[var3].field1261;
						var14 = var6.field1261;
					}
					if (var13 != var14) {
						if ((class89.field1686[var12] != 1 || var13 >= var14) && (class89.field1686[var12] != 0 || var13 <= var14)) {
							var11 = false;
						}
						break;
					}
					if (var12 == 3) {
						var11 = false;
					}
				}
			} while (var11);
			if (var5 > var3) {
				class70 var15 = arg1[var3];
				arg1[var3] = arg1[var5];
				arg1[var5] = var15;
			}
		}
		method1143(arg0, arg1, var5);
		method1143(var5 + 1, arg1, arg2);
	}

	@ObfuscatedName("pd.c(B)V")
	public static void method1144() {
		for (int var0 = 0; var0 < class55.field1041; var0++) {
			int var1 = class25.field402[var0];
			class191 var2 = class225.field4223[var1];
			if (var2 != null) {
				class77.method514(var2.field3682.field2349, var2);
			}
		}
	}

	@ObfuscatedName("pd.b(II)Leb;")
	public static class47 method1148(int arg0) {
		class47 var1 = (class47) class1.field2.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class202.field3849.method939(class201.method1379(arg0), class188.method1314(arg0));
		class47 var3 = new class47();
		if (var2 != null) {
			var3.method355(new class46(var2));
		}
		class1.field2.method663((long) arg0, var3);
		return var3;
	}

	public class167() {
		super(1, false);
	}

	@ObfuscatedName("pd.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3226 = arg0.method334();
		} else if (arg1 == 1) {
			this.field3218 = (arg0.method324() << 12) / 100;
		} else if (arg1 == 2) {
			this.field3206 = (arg0.method324() << 12) / 100;
		}
	}

	@ObfuscatedName("pd.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[][] var3 = this.method121(0, arg0);
			int[] var4 = var3[1];
			int[] var5 = var3[0];
			int[] var6 = var3[2];
			int[] var7 = var2[0];
			int[] var8 = var2[1];
			int[] var9 = var2[2];
			for (int var10 = 0; var10 < class70.field1276; var10++) {
				this.method1147(var4[var10], var5[var10], var6[var10]);
				this.field3213 += this.field3206;
				if (this.field3213 < 0) {
					this.field3213 = 0;
				}
				for (this.field3209 += this.field3226; this.field3209 < 0; this.field3209 += 4096) {
				}
				if (this.field3213 > 4096) {
					this.field3213 = 4096;
				}
				while (this.field3209 > 4096) {
					this.field3209 -= 4096;
				}
				this.field3207 += this.field3218;
				if (this.field3207 < 0) {
					this.field3207 = 0;
				}
				if (this.field3207 > 4096) {
					this.field3207 = 4096;
				}
				this.method1146(this.field3207, this.field3209, this.field3213);
				var7[var10] = this.field3210;
				var8[var10] = this.field3208;
				var9[var10] = this.field3224;
			}
		}
		return var2;
	}

	@ObfuscatedName("pd.a(IIII)V")
	public void method1146(int arg0, int arg1, int arg2) {
		int var4 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (var4 <= 0) {
			this.field3210 = this.field3208 = this.field3224 = arg2;
			return;
		}
		int var5 = arg2 + arg2 - var4;
		int var6 = arg1 * 6;
		int var7 = (var4 - var5 << 12) / var4;
		int var8 = var6 >> 12;
		int var9 = var6 - (var8 << 12);
		int var10 = var4 * var7 >> 12;
		int var11 = var9 * var10 >> 12;
		int var12 = var4 - var11;
		int var13 = var5 + var11;
		if (var8 == 0) {
			this.field3208 = var13;
			this.field3224 = var5;
			this.field3210 = var4;
			return;
		}
		if (var8 == 1) {
			this.field3224 = var5;
			this.field3208 = var4;
			this.field3210 = var12;
			return;
		}
		if (var8 == 2) {
			this.field3224 = var13;
			this.field3208 = var4;
			this.field3210 = var5;
			return;
		}
		if (var8 == 3) {
			this.field3210 = var5;
			this.field3224 = var4;
			this.field3208 = var12;
			return;
		}
		if (var8 == 4) {
			this.field3210 = var13;
			this.field3224 = var4;
			this.field3208 = var5;
			return;
		}
		if (var8 == 5) {
			this.field3210 = var4;
			this.field3208 = var5;
			this.field3224 = var12;
			return;
		}
	}

	@ObfuscatedName("pd.b(IIII)V")
	public void method1147(int arg0, int arg1, int arg2) {
		int var4 = arg0 >= arg1 ? arg0 : arg1;
		int var5 = var4 >= arg2 ? var4 : arg2;
		int var6 = arg0 > arg1 ? arg1 : arg0;
		int var7 = var6 <= arg2 ? var6 : arg2;
		this.field3213 = (var5 + var7) / 2;
		int var8 = var5 - var7;
		if (var8 <= 0) {
			this.field3209 = 0;
		} else {
			int var9 = (var5 - arg0 << 12) / var8;
			int var10 = (var5 - arg1 << 12) / var8;
			int var11 = (var5 - arg2 << 12) / var8;
			if (var5 == arg1) {
				this.field3209 = arg0 == var7 ? var11 + 20480 : 4096 - var9;
			} else if (var5 == arg0) {
				this.field3209 = arg2 == var7 ? var10 + 4096 : 12288 - var11;
			} else {
				this.field3209 = var7 == arg1 ? var9 + 12288 : -var10 + 20480;
			}
			this.field3209 /= 6;
		}
		if (this.field3213 > 0 && this.field3213 < 4096) {
			this.field3207 = (var8 << 12) / (this.field3213 <= 2048 ? this.field3213 * 2 : 8192 - (this.field3213 * 2));
		} else {
			this.field3207 = 0;
		}
	}
}
