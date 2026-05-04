package deob;

import java.util.zip.CRC32;

@ObfuscatedName("uh")
public final class class226 extends class136 {

	@ObfuscatedName("uh.K")
	public static int field4239 = 0;

	@ObfuscatedName("uh.M")
	public static final CRC32 field4241 = new CRC32();

	@ObfuscatedName("uh.S")
	public static int field4247 = -1;

	@ObfuscatedName("uh.P")
	public static int field4244 = 0;

	@ObfuscatedName("uh.R")
	public static final class88 field4246 = class208.method1423(105, " from your ignore list first)3");

	@ObfuscatedName("uh.Q")
	public static class88 field4245 = field4246;

	@ObfuscatedName("uh.U")
	public static final class88 field4249 = class208.method1423(105, "::fps ");

	@ObfuscatedName("uh.D")
	public int field4233;

	@ObfuscatedName("uh.E")
	public int field4234;

	@ObfuscatedName("uh.I")
	public int field4237;

	@ObfuscatedName("uh.T")
	public static class224 field4248;

	@ObfuscatedName("uh.O")
	public static class22 field4243;

	@ObfuscatedName("uh.a(BIILdj;)V")
	public static void method1515(int arg0, int arg1, class44 arg2) {
		if (arg0 == arg2.field4077 && arg0 != -1) {
			class109 var3 = class15.method75(arg0);
			int var4 = var3.field1966;
			if (var4 == 1) {
				arg2.field4098 = 0;
				arg2.field4132 = 0;
				arg2.field4101 = 0;
				arg2.field4140 = arg1;
				class60.method433(arg2 == class240.field4456, arg2.field4121, arg2.field4101, arg2.field4136, var3);
			}
			if (var4 == 2) {
				arg2.field4132 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.field4077 == -1 || class15.method75(arg0).field1999 >= class15.method75(arg2.field4077).field1999) {
			arg2.field4101 = 0;
			arg2.field4140 = arg1;
			arg2.field4137 = arg2.field4135;
			arg2.field4077 = arg0;
			arg2.field4132 = 0;
			arg2.field4098 = 0;
			if (arg2.field4077 == -1) {
				return;
			}
			class60.method433(class240.field4456 == arg2, arg2.field4121, arg2.field4101, arg2.field4136, class15.method75(arg2.field4077));
		}
	}

	@ObfuscatedName("uh.a(Lea;I)V")
	public void method1516(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1518(var2, arg0);
		}
	}

	@ObfuscatedName("uh.a(IILea;)V")
	public void method1518(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field4233 = arg1.method301();
			this.field4234 = arg1.method347();
			this.field4237 = arg1.method347();
		}
	}
}
