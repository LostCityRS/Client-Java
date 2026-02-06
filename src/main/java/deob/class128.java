package deob;

import java.awt.Component;

@ObfuscatedName("sc")
public final class class128 extends class26 {

	@ObfuscatedName("sc.bb")
	public static class32 field2939 = class73.method593("", true);

	@ObfuscatedName("sc.cb")
	public static class32 field2940 = class73.method593("jolt", true);

	@ObfuscatedName("sc.eb")
	public int field2942 = 0;

	@ObfuscatedName("sc.gb")
	public boolean field2944 = false;

	@ObfuscatedName("sc.hb")
	public final int field2945;

	@ObfuscatedName("sc.ib")
	public double field2946;

	@ObfuscatedName("sc.kb")
	public final int field2948;

	@ObfuscatedName("sc.lb")
	public double field2949;

	@ObfuscatedName("sc.mb")
	public static class32 field2950 = class73.method593("yellow:", true);

	@ObfuscatedName("sc.jb")
	public static class32 field2947 = field2950;

	@ObfuscatedName("sc.nb")
	public double field2951;

	@ObfuscatedName("sc.ob")
	public double field2952;

	@ObfuscatedName("sc.pb")
	public final int field2953;

	@ObfuscatedName("sc.rb")
	public int field2955 = 0;

	@ObfuscatedName("sc.sb")
	public double field2956;

	@ObfuscatedName("sc.tb")
	public int field2957;

	@ObfuscatedName("sc.ub")
	public final class149 field2958;

	@ObfuscatedName("sc.vb")
	public double field2959;

	@ObfuscatedName("sc.wb")
	public final int field2960;

	@ObfuscatedName("sc.Y")
	public static class32 field2936 = class73.method593("(U", true);

	@ObfuscatedName("sc.yb")
	public static class32 field2962 = field2950;

	@ObfuscatedName("sc.Cb")
	public final int field2966;

	@ObfuscatedName("sc.Z")
	public final int field2937;

	@ObfuscatedName("sc.X")
	public final int field2935;

	@ObfuscatedName("sc.T")
	public final int field2931;

	@ObfuscatedName("sc.zb")
	public final int field2963;

	@ObfuscatedName("sc.Db")
	public final int field2967;

	@ObfuscatedName("sc.U")
	public final int field2932;

	@ObfuscatedName("sc.V")
	public double field2933;

	@ObfuscatedName("sc.W")
	public double field2934;

	@ObfuscatedName("sc.Bb")
	public static int field2965;

	@ObfuscatedName("sc.Eb")
	public int field2968;

	@ObfuscatedName("sc.a(ILjava/awt/Component;)V")
	public static void method989(Component arg0) {
		arg0.addMouseListener(class38.field909);
		arg0.addMouseMotionListener(class38.field909);
		arg0.addFocusListener(class38.field909);
	}

	@ObfuscatedName("sc.c(B)V")
	public static void method990() {
		field2962 = null;
		field2947 = null;
		field2950 = null;
		field2936 = null;
		field2939 = null;
		field2940 = null;
	}

	@ObfuscatedName("sc.c(II)Lf;")
	public static class36 method991(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (class79.field1825[var1] == null || class79.field1825[var1][var2] == null) {
			boolean var3 = class28.method192(var1);
			if (!var3) {
				return null;
			}
		}
		return class79.field1825[var1][var2];
	}

	@ObfuscatedName("sc.a(IIIIIIII)V")
	public static void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (class28.method192(arg0)) {
			class85.method660(class79.field1825[arg0], arg6, arg1, arg2, arg5, arg4, arg3, -1);
		}
	}

	@ObfuscatedName("sc.e(I)V")
	public static void method993() {
		class11.field182 = 0L;
		class126.field2926 = true;
		class152.field3497 = 0;
		class77.field1812 = true;
		class137.field3174.field3028 = 0;
		class83.method650();
		class158.field3616 = -1;
		class119.field2849 = 0;
		class34.field710 = -1;
		class34.field703 = 0;
		class56.field1294 = 0;
		class125.field2911 = 0;
		class44.field1026.field1568 = 0;
		class26.field476 = false;
		class4.field68 = 0;
		class158.field3612.field1568 = 0;
		class12.field201 = -1;
		class86.field2004 = -1;
		class75.method604(0);
		for (int var0 = 0; var0 < 100; var0++) {
			class36.field832[var0] = null;
		}
		class13.field225 = (int) (Math.random() * 110.0D) - 55;
		class102.field2397 = 0;
		class62.field1404 = 0;
		class45.field1066 = 0;
		class27.field493 = (int) (Math.random() * 120.0D) - 60;
		class11.field173 = (int) (Math.random() * 80.0D) - 40;
		class133.field3067 = (int) (Math.random() * 100.0D) - 50;
		class5.field92 = -1;
		class143.field3277 = 0;
		class125.field2913 = 0;
		class133.field3054 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		class31.field615 = 0;
		class4.field72 = 0;
		class29.field527 = (int) (Math.random() * 30.0D) - 20;
		class151.field3468 = false;
		class23.field423 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			class52.field1175[var1] = null;
			class143.field3262[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			class14.field230[var2] = null;
		}
		class20.field373 = class52.field1175[2047] = new class70();
		class88.field2038.method1204();
		class157.field3594.method1204();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					class23.field397[var3][var4][var5] = null;
				}
			}
		}
		class45.field1076 = new class157();
		class2.field20 = 0;
		class61.field1356 = 0;
		for (int var6 = 0; var6 < class61.field1361; var6++) {
			class61 var7 = class56.method440(var6);
			if (var7 != null && var7.field1351 == 0) {
				class14.field238[var6] = 0;
				class27.field504[var6] = 0;
			}
		}
		for (int var8 = 0; var8 < class79.field1831.length; var8++) {
			class79.field1831[var8] = -1;
		}
		if (class13.field220 != -1) {
			class117.method926(class13.field220);
		}
		for (class144 var9 = (class144) class109.field2571.method1203(); var9 != null; var9 = (class144) class109.field2571.method1199()) {
			class134.method1021(true, var9);
		}
		class13.field220 = -1;
		class109.field2571 = new class156(8);
		class50.field1158 = null;
		class119.field2849 = 0;
		class26.field476 = false;
		class61.field1360.method232(new int[5], -1, null, false);
		for (int var10 = 0; var10 < 8; var10++) {
			class38.field914[var10] = null;
			class44.field1042[var10] = false;
		}
		class71.method586();
		class88.field2032 = true;
		for (int var11 = 0; var11 < 100; var11++) {
			class145.field3297[var11] = true;
		}
		class131.field3010 = null;
		class158.field3636 = 0;
		class111.field2609 = null;
	}

	public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		this.field2966 = arg8;
		this.field2937 = arg3;
		this.field2935 = arg1;
		this.field2931 = arg4;
		this.field2960 = arg9;
		this.field2945 = arg7;
		this.field2953 = arg0;
		this.field2963 = arg5;
		this.field2948 = arg6;
		this.field2944 = false;
		this.field2967 = arg2;
		this.field2932 = arg10;
		int var12 = class38.method316(this.field2953).field3096;
		if (var12 == -1) {
			this.field2958 = null;
		} else {
			this.field2958 = class97.method760(var12);
		}
	}

	@ObfuscatedName("sc.b(II)V")
	public void method988(int arg0) {
		this.field2949 += this.field2956 * (double) arg0;
		this.field2944 = true;
		this.field2952 += this.field2934 * 0.5D * (double) arg0 * (double) arg0 + this.field2946 * (double) arg0;
		this.field2946 += (double) arg0 * this.field2934;
		this.field2951 += (double) arg0 * this.field2933;
		this.field2968 = (int) (Math.atan2(this.field2956, this.field2933) * 325.949D) + 1024 & 0x7FF;
		this.field2957 = (int) (Math.atan2(this.field2946, this.field2959) * 325.949D) & 0x7FF;
		if (this.field2958 == null) {
			return;
		}
		this.field2942 += arg0;
		while (true) {
			do {
				do {
					if (this.field2942 <= this.field2958.field3376[this.field2955]) {
						return;
					}
					this.field2942 -= this.field2958.field3376[this.field2955];
					this.field2955++;
				} while (this.field2955 < this.field2958.field3393.length);
				this.field2955 -= this.field2958.field3386;
			} while (this.field2955 >= 0 && this.field2958.field3393.length > this.field2955);
			this.field2955 = 0;
		}
	}

	@ObfuscatedName("sc.b(B)Lod;")
	@Override
	public class101 method132() {
		class133 var1 = class38.method316(this.field2953);
		class101 var2 = var1.method1017(this.field2955);
		if (var2 == null) {
			return null;
		} else {
			var2.method802(this.field2957);
			return var2;
		}
	}

	@ObfuscatedName("sc.a(IIBII)V")
	public void method994(int arg0, int arg1, int arg2, int arg3) {
		if (!this.field2944) {
			double var5 = (double) (arg1 - this.field2967);
			double var7 = (double) (arg0 - this.field2937);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field2949 = (double) this.field2967 + var5 * (double) this.field2966 / var9;
			this.field2952 = this.field2931;
			this.field2951 = (double) this.field2937 + (double) this.field2966 * var7 / var9;
		}
		double var11 = (double) (this.field2948 + 1 - arg2);
		this.field2956 = ((double) arg1 - this.field2949) / var11;
		this.field2933 = ((double) arg0 - this.field2951) / var11;
		this.field2959 = Math.sqrt(this.field2956 * this.field2956 + this.field2933 * this.field2933);
		if (!this.field2944) {
			this.field2946 = -this.field2959 * Math.tan((double) this.field2945 * 0.02454369D);
		}
		this.field2934 = ((double) arg3 - var11 * this.field2946 - this.field2952) * 2.0D / (var11 * var11);
	}
}
