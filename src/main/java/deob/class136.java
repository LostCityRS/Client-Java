package deob;

@ObfuscatedName("td")
public final class class136 extends class26 {

	@ObfuscatedName("td.bb")
	public static int field3156 = 0;

	@ObfuscatedName("td.cb")
	public static long field3157;

	@ObfuscatedName("td.db")
	public boolean field3158 = false;

	@ObfuscatedName("td.hb")
	public int field3162 = 0;

	@ObfuscatedName("td.ib")
	public final int field3163;

	@ObfuscatedName("td.jb")
	public final int field3164;

	@ObfuscatedName("td.lb")
	public int field3166 = 0;

	@ObfuscatedName("td.mb")
	public final int field3167;

	@ObfuscatedName("td.nb")
	public static class32 field3168 = field3148;

	@ObfuscatedName("td.ob")
	public static class32 field3169 = class73.method593("nicht hergestellt werden)3", true);

	@ObfuscatedName("td.pb")
	public static boolean field3170;

	@ObfuscatedName("td.qb")
	public final int field3171;

	@ObfuscatedName("td.rb")
	public static class32 field3172 = class73.method593("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", true);

	@ObfuscatedName("td.Y")
	public static int field3153 = 0;

	@ObfuscatedName("td.T")
	public static class32 field3148 = class73.method593("Please enter your password)3", true);

	@ObfuscatedName("td.U")
	public final int field3149;

	@ObfuscatedName("td.W")
	public final int field3151;

	@ObfuscatedName("td.Z")
	public class149 field3154;

	@ObfuscatedName("td.a(IBII)V")
	public static void method1031(int arg0, int arg1, int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			class130.field3001 = -1;
			class89.field2055 = -1;
			return;
		}
		int var3 = class83.method653(class43.field989, arg1, arg0) - arg2;
		int var4 = arg0 - class48.field1126;
		int var5 = class7.field113[class45.field1049];
		int var6 = var3 - class73.field1719;
		int var7 = class7.field121[class45.field1049];
		int var8 = class7.field113[class115.field2718];
		int var9 = class7.field121[class115.field2718];
		int var10 = arg1 - class105.field2494;
		int var11 = var10 * var9 + var4 * var8 >> 16;
		int var12 = var4 * var9 - var10 * var8 >> 16;
		int var14 = var7 * var6 - var5 * var12 >> 16;
		int var15 = var12 * var7 + var6 * var5 >> 16;
		if (var15 < 50) {
			class89.field2055 = -1;
			class130.field3001 = -1;
		} else {
			class130.field3001 = (var14 << 9) / var15 + 167;
			class89.field2055 = (var11 << 9) / var15 + 256;
		}
	}

	@ObfuscatedName("td.a(IIIILh;I)V")
	public static void method1032(int arg0, int arg1, int arg2, class49 arg3, int arg4) {
		if (arg3 == null) {
			return;
		}
		int var5 = class27.field493 + class133.field3054 & 0x7FF;
		int var6 = arg4 * arg4 + arg2 * arg2;
		if (var6 > 6400) {
			return;
		}
		int var7 = class7.field113[var5];
		int var8 = var7 * 256 / (class29.field527 + 256);
		int var9 = class7.field121[var5];
		int var10 = var9 * 256 / (class29.field527 + 256);
		int var11 = var10 * arg2 - arg4 * var8 >> 16;
		int var12 = arg2 * var8 + var10 * arg4 >> 16;
		if (var6 <= 2500) {
			arg3.method369(var12 + arg0 + 94 + 4 - arg3.field1138 / 2, arg1 + 83 + -var11 + (-(arg3.field1140 / 2) - 4));
		} else {
			arg3.method371(class20.field369, arg0 + var12 + 94 + 4 - arg3.field1138 / 2, -(arg3.field1140 / 2) + 83 + (arg1 - var11) + -4);
		}
	}

	@ObfuscatedName("td.a(Lec;Lea;ZLec;)Lhb;")
	public static class51 method1033(class32 arg0, class30 arg1, class32 arg2) {
		int var3 = arg1.method201(arg2);
		int var4 = arg1.method215(arg0, var3);
		return class1.method4(var4, var3, arg1);
	}

	@ObfuscatedName("td.a(Lea;Lea;B)V")
	public static void method1034(class30 arg0, class30 arg1) {
		class19.field363 = arg1;
		class154.field3512 = arg0;
	}

	@ObfuscatedName("td.c(B)V")
	public static void method1036() {
		field3172 = null;
		field3148 = null;
		field3168 = null;
		field3169 = null;
	}

	public class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		this.field3149 = arg1;
		this.field3164 = arg2;
		this.field3151 = arg5 + arg6;
		this.field3171 = arg3;
		this.field3163 = arg0;
		this.field3167 = arg4;
		int var8 = class38.method316(this.field3163).field3096;
		if (var8 == -1) {
			this.field3158 = true;
		} else {
			this.field3158 = false;
			this.field3154 = class97.method760(var8);
		}
	}

	@ObfuscatedName("td.a(BI)V")
	public void method1035(int arg0) {
		if (this.field3158) {
			return;
		}
		this.field3162 += arg0;
		while (this.field3154.field3376[this.field3166] < this.field3162) {
			this.field3162 -= this.field3154.field3376[this.field3166];
			this.field3166++;
			if (this.field3154.field3393.length <= this.field3166) {
				this.field3158 = true;
				return;
			}
		}
	}

	@ObfuscatedName("td.b(B)Lod;")
	@Override
	public class101 method132() {
		class133 var1 = class38.method316(this.field3163);
		class101 var2;
		if (this.field3158) {
			var2 = var1.method1017(-1);
		} else {
			var2 = var1.method1017(this.field3166);
		}
		return var2 == null ? null : var2;
	}
}
