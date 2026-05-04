package deob;

@ObfuscatedName("tb")
public final class class209 {

	@ObfuscatedName("tb.b")
	public boolean field3957;

	@ObfuscatedName("tb.d")
	public static boolean field3959 = false;

	@ObfuscatedName("tb.g")
	public int[] field3962;

	@ObfuscatedName("tb.j")
	public static int field3965;

	@ObfuscatedName("tb.k")
	public int[] field3966;

	@ObfuscatedName("tb.m")
	public static class144 field3968;

	@ObfuscatedName("tb.q")
	public static final class88 field3972 = class208.method1423(105, "");

	@ObfuscatedName("tb.h")
	public static class88 field3963 = field3972;

	@ObfuscatedName("tb.l")
	public static class88 field3967 = field3972;

	@ObfuscatedName("tb.o")
	public static class88 field3970 = field3972;

	@ObfuscatedName("tb.s")
	public long field3974;

	@ObfuscatedName("tb.t")
	public int field3975;

	@ObfuscatedName("tb.u")
	public static final class88 field3976 = class208.method1423(105, "Lade Titelbild )2 ");

	@ObfuscatedName("tb.w")
	public long field3978;

	@ObfuscatedName("tb.x")
	public static class88 field3979 = field3972;

	@ObfuscatedName("tb.y")
	public static class88 field3980 = field3972;

	@ObfuscatedName("tb.A")
	public static final class88 field3982 = class208.method1423(105, "(Y<)4col>");

	@ObfuscatedName("tb.z")
	public static class88 field3981 = field3972;

	@ObfuscatedName("tb.a(I)I")
	public int method1427() {
		return this.field3975 == -1 ? (this.field3966[11] << 5) + (this.field3962[0] << 25) + (this.field3962[4] << 20) + (this.field3966[0] << 15) + (this.field3966[8] << 10) + this.field3966[1] : 305419896 - -class147.method985(this.field3975).field2314;
	}

	@ObfuscatedName("tb.a(BLk;I)Lcg;")
	public class30 method1428(class109 arg0, int arg1) {
		if (this.field3975 != -1) {
			return class147.method985(this.field3975).method864(arg1, arg0);
		}
		class30 var3 = (class30) class142.field2616.method135(this.field3974);
		if (var3 == null) {
			boolean var4 = false;
			for (int var5 = 0; var5 < 12; var5++) {
				int var6 = this.field3966[var5];
				if ((var6 & 0x40000000) == 0) {
					if ((var6 & Integer.MIN_VALUE) != 0 && !class103.method710(var6 & 0x3FFFFFFF).method1545()) {
						var4 = true;
					}
				} else if (!class71.method472(var6 & 0x3FFFFFFF).method1015(this.field3957)) {
					var4 = true;
				}
			}
			if (var4) {
				return null;
			}
			int var7 = 0;
			class82[] var8 = new class82[12];
			for (int var9 = 0; var9 < 12; var9++) {
				int var10 = this.field3966[var9];
				if ((var10 & 0x40000000) != 0) {
					class82 var12 = class71.method472(var10 & 0x3FFFFFFF).method1016(this.field3957);
					if (var12 != null) {
						var8[var7++] = var12;
					}
				} else if ((var10 & Integer.MIN_VALUE) != 0) {
					class82 var11 = class103.method710(var10 & 0x3FFFFFFF).method1543();
					if (var11 != null) {
						var8[var7++] = var11;
					}
				}
			}
			class82 var13 = new class82(var8, var7);
			for (int var14 = 0; var14 < 5; var14++) {
				if (this.field3962[var14] < class7.field96[var14].length) {
					var13.method564(class14.field219[var14], class7.field96[var14][this.field3962[var14]]);
				}
				if (this.field3962[var14] < class87.field1596[var14].length) {
					var13.method564(class146.field2750[var14], class87.field1596[var14][this.field3962[var14]]);
				}
			}
			var3 = var13.method546(64, 768, -50, -10, -50);
			class142.field2616.method130(this.field3974, var3);
		}
		if (arg0 != null) {
			var3 = arg0.method758(arg1, var3);
		}
		return var3;
	}

	@ObfuscatedName("tb.b(I)V")
	public void method1429() {
		long var1 = this.field3974;
		this.field3974 = -1L;
		long[] var3 = class141.field2608;
		for (int var4 = 0; var4 < 12; var4++) {
			this.field3974 = var3[(int) (((long) (this.field3966[var4] >> 24) ^ this.field3974) & 0xFFL)] ^ this.field3974 >>> 8;
			this.field3974 = this.field3974 >>> 8 ^ var3[(int) (((long) (this.field3966[var4] >> 16) ^ this.field3974) & 0xFFL)];
			this.field3974 = this.field3974 >>> 8 ^ var3[(int) (((long) (this.field3966[var4] >> 8) ^ this.field3974) & 0xFFL)];
			this.field3974 = this.field3974 >>> 8 ^ var3[(int) (((long) this.field3966[var4] ^ this.field3974) & 0xFFL)];
		}
		for (int var5 = 0; var5 < 5; var5++) {
			this.field3974 = var3[(int) (((long) this.field3962[var5] ^ this.field3974) & 0xFFL)] ^ this.field3974 >>> 8;
		}
		this.field3974 = var3[(int) ((this.field3974 ^ (long) (this.field3957 ? 1 : 0)) & 0xFFL)] ^ this.field3974 >>> 8;
		if (var1 != 0L && var1 != this.field3974) {
			class93.field1740.method133(var1);
		}
	}

	@ObfuscatedName("tb.a(Lk;IIILk;)Lcg;")
	public class30 method1430(class109 arg0, int arg1, int arg2, class109 arg3) {
		if (this.field3975 != -1) {
			return class147.method985(this.field3975).method865(arg0, arg2, arg1, arg3);
		}
		long var5 = this.field3974;
		int[] var7 = this.field3966;
		if (arg3 != null && (arg3.field2000 >= 0 || arg3.field1975 >= 0)) {
			var7 = new int[12];
			for (int var8 = 0; var8 < 12; var8++) {
				var7[var8] = this.field3966[var8];
			}
			if (arg3.field2000 >= 0) {
				if (arg3.field2000 == 65535) {
					var7[5] = 0;
					var5 ^= 0xFFFFFFFF00000000L;
				} else {
					var7[5] = arg3.field2000 | 0x40000000;
					var5 ^= (long) var7[5] << 32;
				}
			}
			if (arg3.field1975 >= 0) {
				if (arg3.field1975 == 65535) {
					var7[3] = 0;
					var5 ^= 0xFFFFFFFFL;
				} else {
					var7[3] = arg3.field1975 | 0x40000000;
					var5 ^= var7[3];
				}
			}
		}
		class30 var9 = (class30) class93.field1740.method135(var5);
		if (var9 == null) {
			boolean var10 = false;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = var7[var11];
				if ((var12 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & var12) != 0 && !class103.method710(var12 & 0x3FFFFFFF).method1547()) {
						var10 = true;
					}
				} else if (!class71.method472(var12 & 0x3FFFFFFF).method1022(this.field3957)) {
					var10 = true;
				}
			}
			if (var10) {
				if (this.field3978 != -1L) {
					var9 = (class30) class93.field1740.method135(this.field3978);
				}
				if (var9 == null) {
					return null;
				}
			}
			if (var9 == null) {
				class82[] var13 = new class82[12];
				int var14 = 0;
				for (int var15 = 0; var15 < 12; var15++) {
					int var16 = var7[var15];
					if ((var16 & 0x40000000) != 0) {
						class82 var17 = class71.method472(var16 & 0x3FFFFFFF).method1011(this.field3957);
						if (var17 != null) {
							var13[var14++] = var17;
						}
					} else if ((Integer.MIN_VALUE & var16) != 0) {
						class82 var18 = class103.method710(var16 & 0x3FFFFFFF).method1540();
						if (var18 != null) {
							var13[var14++] = var18;
						}
					}
				}
				int var19 = var7[0];
				if ((var19 & 0x40000000) != 0) {
					class149 var20 = class71.method472(var19 & 0x3FFFFFFF);
					if (var20.field2839 != null) {
						for (int var21 = 0; var21 < var20.field2839.length; var21++) {
							int var22 = var20.field2839[var21][1];
							int var23 = var20.field2839[var21][3];
							int var24 = var20.field2839[var21][0];
							int var25 = var20.field2839[var21][2];
							int var26 = var20.field2839[var21][4];
							int var27 = var20.field2839[var21][5];
							var13[var21 + 1].method549(var24, var22, var25);
							var13[var21 + 1].method565(var23, var26, var27);
						}
					}
				}
				class82 var28 = new class82(var13, var14);
				for (int var29 = 0; var29 < 5; var29++) {
					if (this.field3962[var29] < class7.field96[var29].length) {
						var28.method564(class14.field219[var29], class7.field96[var29][this.field3962[var29]]);
					}
					if (class87.field1596[var29].length > this.field3962[var29]) {
						var28.method564(class146.field2750[var29], class87.field1596[var29][this.field3962[var29]]);
					}
				}
				var9 = var28.method546(64, 850, -30, -50, -30);
				class93.field1740.method130(var5, var9);
				this.field3978 = var5;
			}
		}
		if (arg3 == null && arg0 == null) {
			return var9;
		}
		class30 var30;
		if (arg3 != null && arg0 != null) {
			var30 = arg3.method754(arg1, arg0, arg2, var9);
		} else if (arg3 == null) {
			var30 = arg0.method750(arg2, var9);
		} else {
			var30 = arg3.method750(arg1, var9);
		}
		return var30;
	}

	@ObfuscatedName("tb.a(IZ[I[IZ)V")
	public void method1431(int arg0, int[] arg1, int[] arg2, boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (int var5 = 0; var5 < 7; var5++) {
				for (int var6 = 0; var6 < class23.field374; var6++) {
					class231 var7 = class103.method710(var6);
					if (var7 != null && !var7.field4337 && var5 + (arg3 ? 7 : 0) == var7.field4341) {
						arg1[class55.field1023[var5]] = var6 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.field3966 = arg1;
		this.field3962 = arg2;
		this.field3957 = arg3;
		this.field3975 = arg0;
		this.method1429();
	}

	@ObfuscatedName("tb.a(BII)V")
	public void method1432(int arg0, int arg1) {
		this.field3962[arg1] = arg0;
		this.method1429();
	}

	@ObfuscatedName("tb.a(IZ)V")
	public void method1434(boolean arg0) {
		this.field3957 = arg0;
		this.method1429();
	}

	@ObfuscatedName("tb.a(IBI)V")
	public void method1435(int arg0, int arg1) {
		int var3 = class55.field1023[arg0];
		if (this.field3966[var3] != 0 && class103.method710(arg1) != null) {
			this.field3966[var3] = Integer.MIN_VALUE | arg1;
			this.method1429();
		}
	}
}
