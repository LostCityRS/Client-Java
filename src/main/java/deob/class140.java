package deob;

@ObfuscatedName("ua")
public final class class140 implements class67 {

	@ObfuscatedName("ua.c")
	public static class32 field3215 = field3222;

	@ObfuscatedName("ua.d")
	public static int field3216 = 0;

	@ObfuscatedName("ua.e")
	public static int field3217 = 0;

	@ObfuscatedName("ua.f")
	public static short[][] field3218;

	@ObfuscatedName("ua.j")
	public static class32 field3222 = class73.method593("Sorry invited players only)3", true);

	@ObfuscatedName("ua.k")
	public static class32 field3223 = class73.method593("::rect_debug", true);

	@ObfuscatedName("ua.l")
	public static class32 field3224 = class73.method593("Texturen geladen)3", true);

	@ObfuscatedName("ua.n")
	public final class148[] field3226;

	@ObfuscatedName("ua.o")
	public class157 field3227 = new class157();

	@ObfuscatedName("ua.q")
	public double field3229 = 1.0D;

	@ObfuscatedName("ua.r")
	public final int field3230;

	@ObfuscatedName("ua.s")
	public int field3231 = 0;

	@ObfuscatedName("ua.t")
	public int field3232 = 128;

	@ObfuscatedName("ua.u")
	public static int field3233 = 0;

	@ObfuscatedName("ua.v")
	public final class30 field3234;

	@ObfuscatedName("ua.a(B)V")
	public static void method1051() {
		field3215 = null;
		field3224 = null;
		field3218 = null;
		field3222 = null;
		field3223 = null;
	}

	public class140(class30 arg0, class30 arg1, int arg2, double arg3, int arg4) {
		this.field3232 = arg4;
		this.field3229 = arg3;
		this.field3234 = arg1;
		this.field3230 = 20;
		this.field3231 = this.field3230;
		int[] var7 = arg0.method207(0);
		int var8 = var7.length;
		this.field3226 = new class148[arg0.method200(0)];
		for (int var9 = 0; var9 < var8; var9++) {
			class66 var10 = new class66(arg0.method206(0, var7[var9]));
			this.field3226[var7[var9]] = new class148(var10);
		}
	}

	@ObfuscatedName("ua.a(ID)V")
	public void method1048(double arg0) {
		this.field3229 = arg0;
		this.method1050();
	}

	@ObfuscatedName("ua.a(BI)V")
	public void method1049(int arg0) {
		for (int var2 = 0; var2 < this.field3226.length; var2++) {
			class148 var3 = this.field3226[var2];
			if (var3 != null && var3.field3356 != 0 && var3.field3365) {
				var3.method1102(arg0);
				var3.field3365 = false;
			}
		}
	}

	@ObfuscatedName("ua.a(ZI)Z")
	@Override
	public boolean method559(int arg0) {
		return this.field3232 == 64;
	}

	@ObfuscatedName("ua.a(I)V")
	public void method1050() {
		for (int var1 = 0; var1 < this.field3226.length; var1++) {
			if (this.field3226[var1] != null) {
				this.field3226[var1].method1103();
			}
		}
		this.field3227 = new class157();
		this.field3231 = this.field3230;
	}

	@ObfuscatedName("ua.b(II)Z")
	@Override
	public boolean method561(int arg0) {
		return this.field3226[arg0].field3359;
	}

	@ObfuscatedName("ua.a(IZ)I")
	@Override
	public int method558(int arg0) {
		return this.field3226[arg0] == null ? 0 : this.field3226[arg0].field3360;
	}

	@ObfuscatedName("ua.a(II)[I")
	@Override
	public int[] method560(int arg0) {
		class148 var2 = this.field3226[arg0];
		if (var2 != null) {
			if (var2.field3361 != null) {
				this.field3227.method1207(var2);
				var2.field3365 = true;
				return var2.field3361;
			}
			boolean var3 = var2.method1105(this.field3229, this.field3232, this.field3234);
			if (var3) {
				if (this.field3231 == 0) {
					class148 var4 = (class148) this.field3227.method1206();
					var4.method1103();
				} else {
					this.field3231--;
				}
				this.field3227.method1207(var2);
				var2.field3365 = true;
				return var2.field3361;
			}
		}
		return null;
	}
}
