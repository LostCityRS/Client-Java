package deob;

import java.awt.Component;

@ObfuscatedName("qj")
public final class class184 extends class23 {

	@ObfuscatedName("qj.ab")
	public int field3610 = 1365;

	@ObfuscatedName("qj.db")
	public int field3613 = 20;

	@ObfuscatedName("qj.S")
	public static final class88 field3602 = class208.method1423(105, "New User");

	@ObfuscatedName("qj.R")
	public static class88 field3601 = field3602;

	@ObfuscatedName("qj.U")
	public static int field3604 = 0;

	@ObfuscatedName("qj.Q")
	public int field3600 = 0;

	@ObfuscatedName("qj.T")
	public int field3603 = 0;

	@ObfuscatedName("qj.Y")
	public static int field3608;

	@ObfuscatedName("qj.V")
	public static int[] field3605;

	@ObfuscatedName("qj.a(ZI)I")
	public static int method1296(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

	@ObfuscatedName("qj.c(Z)V")
	public static void method1297() {
		class134.method893(false);
		boolean var0 = true;
		class196.field3754 = 0;
		for (int var1 = 0; var1 < class167.field3221.length; var1++) {
			if (class27.field453[var1] != -1 && class167.field3221[var1] == null) {
				class167.field3221[var1] = class27.field451.method939(0, class27.field453[var1]);
				if (class167.field3221[var1] == null) {
					var0 = false;
					class196.field3754++;
				}
			}
			if (class128.field2402[var1] != -1 && class45.field774[var1] == null) {
				class45.field774[var1] = class27.field451.method949(class17.field268[var1], class128.field2402[var1], 0);
				if (class45.field774[var1] == null) {
					var0 = false;
					class196.field3754++;
				}
			}
		}
		if (!var0) {
			class203.field3861 = 1;
			return;
		}
		class113.field2045 = 0;
		boolean var2 = true;
		for (int var3 = 0; var3 < class167.field3221.length; var3++) {
			byte[] var4 = class45.field774[var3];
			if (var4 != null) {
				int var5 = (class146.field2731[var3] >> 8) * 64 - class223.field4212;
				int var6 = (class146.field2731[var3] & 0xFF) * 64 - class190.field3679;
				if (class137.field2555) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= class188.method1311(var4, var6, var5);
			}
		}
		if (!var2) {
			class203.field3861 = 2;
			return;
		}
		if (class203.field3861 != 0) {
			client.method221(class166.method1140(new class88[] { class242.field4478, class222.field4190 }), true);
		}
		class219.method1479();
		class27.method167();
		class85.method579();
		for (int var7 = 0; var7 < 4; var7++) {
			class166.field3200[var7].method643();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					class116.field2098[var8][var9][var10] = 0;
				}
			}
		}
		class44.method288();
		class219.method1479();
		System.gc();
		class219.method1479();
		class134.method893(true);
		class208.method1425();
		if (!class137.field2555) {
			class143.method934();
			class134.method893(true);
			class190.method1327();
		}
		if (class137.field2555) {
			class36.method239();
			class134.method893(true);
			class85.method576();
		}
		class27.method167();
		class134.method893(true);
		class219.method1479();
		class78.method523(class166.field3200);
		class134.method893(true);
		class219.method1479();
		int var11 = class28.field468;
		if (class149.field2907 < var11) {
			var11 = class149.field2907;
		}
		if (var11 < class149.field2907 - 1) {
		}
		if (class245.field4497) {
			class44.method281(class28.field468);
		} else {
			class44.method281(0);
		}
		class7.method39();
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				class29.method175(var12, var13);
			}
		}
		class219.method1479();
		class210.method1437();
		class27.method167();
		if (class201.field3832 != null) {
			class146.field2747.method30(198);
			class146.field2747.method338(1057001181);
		}
		if (!class137.field2555) {
			int var14 = (class140.field2595 - 6) / 8;
			int var15 = (class110.field2014 - 6) / 8;
			int var16 = (class140.field2595 + 6) / 8;
			int var17 = (class110.field2014 + 6) / 8;
			for (int var18 = var14 - 1; var18 <= var16 + 1; var18++) {
				for (int var19 = var15 - 1; var19 <= var17 + 1; var19++) {
					if (var14 > var18 || var16 < var18 || var19 < var15 || var19 > var17) {
						class27.field451.method969(class166.method1140(new class88[] { class212.field4018, class170.method1212(var18), class50.field933, class170.method1212(var19) }));
						class27.field451.method969(class166.method1140(new class88[] { class106.field1928, class170.method1212(var18), class50.field933, class170.method1212(var19) }));
					}
				}
			}
		}
		class131.method881(30);
		class219.method1479();
		class146.field2747.method30(213);
		class108.method738();
	}

	@ObfuscatedName("qj.a(Lnb;Ljava/awt/Component;ZLnb;)V")
	public static void method1298(class144 arg0, Component arg1, class144 arg2) {
		if (class90.field1707) {
			return;
		}
		class72.method481();
		byte[] var3 = arg0.method939(0, class110.field2009);
		class88.field1640 = new class169(var3, arg1);
		class105.field1901 = class88.field1640.method1156();
		class208.field3946 = class122.method826(class151.field2932, arg2);
		class242.field4473 = class122.method826(class104.field1896, arg2);
		class129.field2416 = class122.method826(class157.field3019, arg2);
		class230.field4320 = class122.method830(arg2, class245.field4502);
		class116.field2095 = class101.method700(arg2, class150.field2912);
		class3.field32 = new int[256];
		for (int var4 = 0; var4 < 64; var4++) {
			class3.field32[var4] = var4 * 262144;
		}
		for (int var5 = 0; var5 < 64; var5++) {
			class3.field32[var5 + 64] = var5 * 1024 + 16711680;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			class3.field32[var6 + 128] = var6 * 4 + 16776960;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			class3.field32[var7 + 192] = 16777215;
		}
		class15.field234 = new int[256];
		for (int var8 = 0; var8 < 64; var8++) {
			class15.field234[var8] = var8 * 1024;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			class15.field234[var9 + 64] = var9 * 4 + 65280;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			class15.field234[var10 + 128] = var10 * 262144 + 65535;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			class15.field234[var11 + 192] = 16777215;
		}
		class156.field3014 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			class156.field3014[var12] = var12 * 4;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			class156.field3014[var13 + 64] = var13 * 262144 + 255;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			class156.field3014[var14 + 128] = var14 * 1024 + 16711935;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			class156.field3014[var15 + 192] = 16777215;
		}
		class157.field3034 = new int[256];
		class221.field4169 = new int[32768];
		class113.field2049 = new int[32768];
		class49.method369(null);
		class141.field2609 = new int[32768];
		class209.field3970 = class209.field3972;
		class65.field1182 = 0;
		class209.field3959 = false;
		if (class65.field1183 == 0) {
			class131.field2460 = true;
		} else {
			class131.field2460 = false;
		}
		class209.field3967 = class209.field3972;
		class190.field3667 = new int[32768];
		if (class131.field2460) {
			class117.method795();
		} else {
			class106.method730(255, class86.field1552, class99.field1814);
		}
		class147.method988(false);
		class90.field1707 = true;
		class221.method1493();
		class34.field589 = new class169(128, 254);
		class89.field1675 = new class169(128, 254);
	}

	public class184() {
		super(0, true);
	}

	@ObfuscatedName("qj.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < class70.field1276; var3++) {
				int var4 = this.field3600 + (class22.field351[var3] << 12) / this.field3610;
				int var5 = this.field3603 + (class111.field2021[arg0] << 12) / this.field3610;
				int var6 = var4;
				int var7 = var4 * var4 >> 12;
				int var8 = var5;
				int var9 = var5 * var5 >> 12;
				int var10 = 0;
				while (var9 + var7 < 16384 && var10 < this.field3613) {
					var8 = (var8 * var6 >> 12) * 2 + var5;
					var6 = var4 + var7 - var9;
					var10++;
					var9 = var8 * var8 >> 12;
					var7 = var6 * var6 >> 12;
				}
				var2[var3] = this.field3613 - 1 > var10 ? (var10 << 12) / this.field3613 : 0;
			}
		}
		return var2;
	}

	@ObfuscatedName("qj.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3610 = arg0.method301();
		} else if (arg1 == 1) {
			this.field3613 = arg0.method301();
		} else if (arg1 == 2) {
			this.field3600 = arg0.method301();
		} else if (arg1 == 3) {
			this.field3603 = arg0.method301();
		}
	}
}
