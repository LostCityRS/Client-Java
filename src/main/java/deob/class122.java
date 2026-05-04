package deob;

@ObfuscatedName("lb")
public final class class122 extends class50 {

	@ObfuscatedName("lb.j")
	public static class174 field2217 = null;

	@ObfuscatedName("lb.m")
	public final int field2220;

	@ObfuscatedName("lb.p")
	public final int field2223;

	@ObfuscatedName("lb.q")
	public final int field2224;

	@ObfuscatedName("lb.r")
	public static final class88 field2225 = class208.method1423(105, "You need a members account to login to this world)3");

	@ObfuscatedName("lb.s")
	public static class88 field2226 = field2225;

	@ObfuscatedName("lb.w")
	public static int field2230 = 0;

	@ObfuscatedName("lb.x")
	public final int field2231;

	@ObfuscatedName("lb.a(BILnb;)Llj;")
	public static class130 method826(int arg0, class144 arg1) {
		return class212.method1451(arg0, arg1) ? class27.method170() : null;
	}

	@ObfuscatedName("lb.a(IIIIIIB)V")
	public static void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		class136.method906(arg3);
		int var6 = 0;
		int var7 = arg3 - arg5;
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = arg3;
		int var9 = -arg3;
		int var10 = var7;
		if (class49.field919 <= arg1 && arg1 <= class18.field279) {
			int[] var11 = class3.field42[arg1];
			int var12 = class156.method1058(class67.field1207, class12.field183, arg4 - arg3);
			int var13 = class156.method1058(class67.field1207, class12.field183, arg4 + arg3);
			int var14 = class156.method1058(class67.field1207, class12.field183, arg4 - var7);
			int var15 = class156.method1058(class67.field1207, class12.field183, arg4 + var7);
			class230.method1534(var12, arg2, var14, var11);
			class230.method1534(var14, arg0, var15, var11);
			class230.method1534(var15, arg2, var13, var11);
		}
		int var16 = -1;
		int var17 = -var7;
		int var18 = -1;
		while (var8 > var6) {
			var18 += 2;
			var9 += var18;
			var16 += 2;
			var17 += var16;
			if (var17 >= 0 && var10 >= 1) {
				var10--;
				class29.field482[var10] = var6;
				var17 -= var10 << 1;
			}
			var6++;
			if (var9 >= 0) {
				var8--;
				var9 -= var8 << 1;
				int var19 = arg1 - var8;
				int var20 = arg1 + var8;
				if (class49.field919 <= var20 && class18.field279 >= var19) {
					if (var8 < var7) {
						int var21 = class29.field482[var8];
						int var22 = class156.method1058(class67.field1207, class12.field183, arg4 + var6);
						int var23 = class156.method1058(class67.field1207, class12.field183, arg4 - var6);
						int var24 = class156.method1058(class67.field1207, class12.field183, var21 + arg4);
						int var25 = class156.method1058(class67.field1207, class12.field183, arg4 - var21);
						if (var20 <= class18.field279) {
							int[] var26 = class3.field42[var20];
							class230.method1534(var23, arg2, var25, var26);
							class230.method1534(var25, arg0, var24, var26);
							class230.method1534(var24, arg2, var22, var26);
						}
						if (var19 >= class49.field919) {
							int[] var27 = class3.field42[var19];
							class230.method1534(var23, arg2, var25, var27);
							class230.method1534(var25, arg0, var24, var27);
							class230.method1534(var24, arg2, var22, var27);
						}
					} else {
						int var28 = class156.method1058(class67.field1207, class12.field183, var6 + arg4);
						int var29 = class156.method1058(class67.field1207, class12.field183, arg4 - var6);
						if (var20 <= class18.field279) {
							class230.method1534(var29, arg2, var28, class3.field42[var20]);
						}
						if (class49.field919 <= var19) {
							class230.method1534(var29, arg2, var28, class3.field42[var19]);
						}
					}
				}
			}
			int var30 = var6 + arg1;
			int var31 = arg1 - var6;
			if (var30 >= class49.field919 && var31 <= class18.field279) {
				int var32 = arg4 + var8;
				int var33 = arg4 - var8;
				if (class67.field1207 <= var32 && var33 <= class12.field183) {
					int var34 = class156.method1058(class67.field1207, class12.field183, var32);
					int var35 = class156.method1058(class67.field1207, class12.field183, var33);
					if (var7 > var6) {
						int var36 = var10 >= var6 ? var10 : class29.field482[var6];
						int var37 = class156.method1058(class67.field1207, class12.field183, var36 + arg4);
						int var38 = class156.method1058(class67.field1207, class12.field183, arg4 - var36);
						if (var30 <= class18.field279) {
							int[] var39 = class3.field42[var30];
							class230.method1534(var35, arg2, var38, var39);
							class230.method1534(var38, arg0, var37, var39);
							class230.method1534(var37, arg2, var34, var39);
						}
						if (var31 >= class49.field919) {
							int[] var40 = class3.field42[var31];
							class230.method1534(var35, arg2, var38, var40);
							class230.method1534(var38, arg0, var37, var40);
							class230.method1534(var37, arg2, var34, var40);
						}
					} else {
						if (class18.field279 >= var30) {
							class230.method1534(var35, arg2, var34, class3.field42[var30]);
						}
						if (class49.field919 <= var31) {
							class230.method1534(var35, arg2, var34, class3.field42[var31]);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.a(IILbj;Lud;)V")
	public static void method828(int arg0, class22 arg1, class222 arg2) {
		class90 var3 = new class90();
		var3.field1702 = arg1;
		var3.field1219 = arg0;
		var3.field1701 = 1;
		var3.field1713 = arg2;
		class248 var4 = class227.field4252;
		synchronized (class227.field4252) {
			class227.field4252.method1622(var3);
		}
		class146.method977();
	}

	@ObfuscatedName("lb.a(Lnb;II)[Lrh;")
	public static class193[] method830(class144 arg0, int arg1) {
		return class212.method1451(arg1, arg0) ? class174.method1243() : null;
	}

	public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg4, arg5, arg6);
		this.field2220 = arg3;
		this.field2223 = arg2;
		this.field2224 = arg1;
		this.field2231 = arg0;
	}

	@ObfuscatedName("lb.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
		int var3 = arg1 * this.field2224 >> 12;
		int var4 = arg1 * this.field2220 >> 12;
		int var5 = this.field2231 * arg0 >> 12;
		int var6 = this.field2223 * arg0 >> 12;
		class225.method1514(super.field931, var4, var6, var5, super.field927, super.field925, var3);
	}

	@ObfuscatedName("lb.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
		int var3 = this.field2231 * arg1 >> 12;
		int var4 = arg1 * this.field2223 >> 12;
		int var5 = arg0 * this.field2220 >> 12;
		int var6 = arg0 * this.field2224 >> 12;
		class236.method1565(var4, super.field925, var6, var3, var5);
	}

	@ObfuscatedName("lb.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
	}
}
