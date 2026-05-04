package deob;

@ObfuscatedName("s")
public final class class196 extends class23 {

	@ObfuscatedName("s.ab")
	public int field3760 = -1;

	@ObfuscatedName("s.cb")
	public static class75 field3762;

	@ObfuscatedName("s.eb")
	public static class91 field3764;

	@ObfuscatedName("s.hb")
	public static final class88 field3767 = class208.method1423(105, "To create a new account you need to");

	@ObfuscatedName("s.ib")
	public static final class88 field3768 = class208.method1423(105, "Loading)3)3)3");

	@ObfuscatedName("s.db")
	public static class88 field3763 = field3768;

	@ObfuscatedName("s.jb")
	public int[] field3769;

	@ObfuscatedName("s.lb")
	public static class22 field3771;

	@ObfuscatedName("s.mb")
	public static final class88 field3772 = class208.method1423(105, ")1 ");

	@ObfuscatedName("s.X")
	public static final class88 field3757 = class208.method1423(105, "Bitte warten Sie)3)3)3");

	@ObfuscatedName("s.V")
	public static final class88 field3755 = class208.method1423(105, "blaugr-Un:");

	@ObfuscatedName("s.Y")
	public static int field3758 = 0;

	@ObfuscatedName("s.U")
	public static int field3754 = 0;

	@ObfuscatedName("s.T")
	public static class88 field3753 = field3767;

	@ObfuscatedName("s.R")
	public int field3751;

	@ObfuscatedName("s.S")
	public int field3752;

	@ObfuscatedName("s.c(Z)V")
	public static void method1357() {
		class93.field1740.method134();
	}

	@ObfuscatedName("s.e(I)Lhi;")
	public static class86 method1358() {
		try {
			return (class86) Class.forName("qh").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new class32();
		}
	}

	@ObfuscatedName("s.d(Z)V")
	public static void method1359() {
		for (int var0 = 0; var0 < class192.field3702; var0++) {
			int var1 = class139.field2579[var0];
			class191 var2 = class225.field4223[var1];
			int var3 = class230.field4312.method347();
			if ((var3 & 0x8) != 0) {
				int var4 = class230.field4312.method302();
				int var5 = class230.field4312.method352();
				if (var4 == 65535) {
					var4 = -1;
				}
				class141.method925(var4, var5, var2);
			}
			if ((var3 & 0x1) != 0) {
				var2.field4071 = class230.field4312.method298();
				var2.field4112 = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.field4096 = class230.field4312.method302();
				var2.field4099 = class230.field4312.method301();
			}
			if ((var3 & 0x80) != 0) {
				var2.field4080 = class230.field4312.method343();
				int var6 = class230.field4312.method313();
				if (var2.field4080 == 65535) {
					var2.field4080 = -1;
				}
				var2.field4125 = var6 >> 16;
				var2.field4075 = 0;
				var2.field4120 = 0;
				var2.field4082 = (var6 & 0xFFFF) + class117.field2113;
				if (class117.field2113 < var2.field4082) {
					var2.field4075 = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.field4114 = class230.field4312.method349();
				if (var2.field4114 == 65535) {
					var2.field4114 = -1;
				}
			}
			if ((var3 & 0x10) != 0) {
				var2.field3682 = class147.method985(class230.field4312.method349());
				var2.field4102 = var2.field3682.field2339;
				var2.field4103 = var2.field3682.field2349;
				var2.field4091 = var2.field3682.field2317;
				var2.field4128 = var2.field3682.field2360;
				var2.field4105 = var2.field3682.field2325;
				var2.field4122 = var2.field3682.field2337;
				var2.field4123 = var2.field3682.field2343;
				var2.field4084 = var2.field3682.field2351;
				var2.field4092 = var2.field3682.field2322;
			}
			if ((var3 & 0x40) != 0) {
				int var7 = class230.field4312.method319();
				int var8 = class230.field4312.method319();
				var2.method1477(class117.field2113, var8, var7);
			}
			if ((var3 & 0x4) != 0) {
				int var9 = class230.field4312.method295();
				int var10 = class230.field4312.method347();
				var2.method1477(class117.field2113, var10, var9);
				var2.field4118 = class117.field2113 + 300;
				var2.field4109 = class230.field4312.method319();
			}
		}
	}

	public class196() {
		super(0, false);
	}

	@ObfuscatedName("s.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310 && this.method1361()) {
			int var3 = this.field3752 * (class27.field460 == this.field3751 ? arg0 : arg0 * this.field3751 / class27.field460);
			int[] var4 = var2[0];
			int[] var5 = var2[1];
			int[] var6 = var2[2];
			if (class70.field1276 == this.field3752) {
				for (int var10 = 0; var10 < class70.field1276; var10++) {
					int var11 = this.field3769[var3++];
					var6[var10] = (var11 & 0xFF) << 4;
					var5[var10] = var11 >> 4 & 0xFF0;
					var4[var10] = var11 >> 12 & 0xFF0;
				}
			} else {
				for (int var7 = 0; var7 < class70.field1276; var7++) {
					int var8 = this.field3752 * var7 / class70.field1276;
					int var9 = this.field3769[var8 + var3];
					var6[var7] = (var9 & 0xFF) << 4;
					var5[var7] = var9 >> 4 & 0xFF0;
					var4[var7] = var9 >> 12 & 0xFF0;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("s.a(Lea;II)V")
	@Override
	public void method11(class46 arg0, int arg1) {
		if (arg1 == 0) {
			this.field3760 = arg0.method301();
		}
	}

	@ObfuscatedName("s.d(I)I")
	@Override
	public int method129() {
		return this.field3760;
	}

	@ObfuscatedName("s.c(I)V")
	@Override
	public void method127() {
		super.method127();
		this.field3769 = null;
	}

	@ObfuscatedName("s.f(I)Z")
	public boolean method1361() {
		if (this.field3769 != null) {
			return true;
		} else if (this.field3760 >= 0) {
			int var1 = class70.field1276;
			int var2 = class27.field460;
			int var3 = class244.field4488.method437(this.field3760) ? 64 : 128;
			this.field3769 = class244.field4488.method440(this.field3760);
			this.field3751 = var3;
			this.field3752 = var3;
			class118.method802(var1, var2);
			return this.field3769 != null;
		} else {
			return false;
		}
	}
}
