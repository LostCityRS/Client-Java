package deob;

import java.util.Calendar;
import java.util.TimeZone;

@ObfuscatedName("wi")
public final class class248 {

	@ObfuscatedName("wi.d")
	public final class67 field4534 = new class67();

	@ObfuscatedName("wi.e")
	public static int field4535 = 0;

	@ObfuscatedName("wi.h")
	public class67 field4538;

	@ObfuscatedName("wi.o")
	public static final Calendar field4545 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@ObfuscatedName("wi.p")
	public static final class88 field4546 = class208.method1423(105, "leuchten1:");

	@ObfuscatedName("wi.q")
	public static final class88 field4547 = class208.method1423(105, "::fpson");

	@ObfuscatedName("wi.r")
	public static final class88 field4548 = class208.method1423(105, " )2> ");

	@ObfuscatedName("wi.s")
	public static boolean field4549 = false;

	@ObfuscatedName("wi.t")
	public static class22 field4550;

	@ObfuscatedName("wi.v")
	public static class151 field4552;

	@ObfuscatedName("wi.a(I[I[III)V")
	public static void method1611(int arg0, int[] arg1, int[] arg2, int arg3) {
		int var4 = arg3;
		if (arg3 > 25) {
			var4 = 25;
		}
		arg3--;
		int var5 = arg2[arg3];
		int var6 = arg1[arg3];
		if (arg0 == 0) {
			class146.field2747.method30(200);
			class146.field2747.method346(var4 + var4 + 3);
		}
		if (arg0 == 1) {
			class146.field2747.method30(199);
			class146.field2747.method346(var4 + var4 + 17);
		}
		if (arg0 == 2) {
			class146.field2747.method30(159);
			class146.field2747.method346(var4 + var4 + 3);
		}
		class146.field2747.method305(var5 + class190.field3679);
		class146.field2747.method297(class247.field4511[82] ? 1 : 0);
		class116.field2102 = arg1[0];
		class140.field2594 = arg2[0];
		for (int var7 = 1; var7 < var4; var7++) {
			arg3--;
			class146.field2747.method327(arg1[arg3] - var6);
			class146.field2747.method297(arg2[arg3] - var5);
		}
		class146.field2747.method331(var6 + class223.field4212);
	}

	@ObfuscatedName("wi.d(B)V")
	public static void method1618() {
		class216.field4047.method670();
	}

	@ObfuscatedName("wi.e(B)V")
	public static void method1621() {
		class146.field2747.method30(58);
		class146.field2747.method328(0L);
	}

	public class248() {
		this.field4534.field1220 = this.field4534;
		this.field4534.field1212 = this.field4534;
	}

	@ObfuscatedName("wi.a(Z)Lg;")
	public class67 method1610() {
		class67 var1 = this.field4534.field1220;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1220;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(B)Lg;")
	public class67 method1612() {
		class67 var1 = this.field4534.field1212;
		if (var1 == this.field4534) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1212;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(I)Lg;")
	public class67 method1613() {
		class67 var1 = this.field4534.field1220;
		if (var1 == this.field4534) {
			return null;
		} else {
			var1.method460();
			return var1;
		}
	}

	@ObfuscatedName("wi.a(ILg;)V")
	public void method1615(class67 arg0) {
		if (arg0.field1212 != null) {
			arg0.method460();
		}
		arg0.field1220 = this.field4534.field1220;
		arg0.field1212 = this.field4534;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}

	@ObfuscatedName("wi.b(I)V")
	public void method1616() {
		while (true) {
			class67 var1 = this.field4534.field1220;
			if (this.field4534 == var1) {
				return;
			}
			var1.method460();
		}
	}

	@ObfuscatedName("wi.c(B)Lg;")
	public class67 method1617() {
		class67 var1 = this.field4538;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1212;
			return var1;
		}
	}

	@ObfuscatedName("wi.c(I)Lg;")
	public class67 method1619() {
		class67 var1 = this.field4538;
		if (this.field4534 == var1) {
			this.field4538 = null;
			return null;
		} else {
			this.field4538 = var1.field1220;
			return var1;
		}
	}

	@ObfuscatedName("wi.a(Lg;BLg;)V")
	public void method1620(class67 arg0, class67 arg1) {
		if (arg0.field1212 != null) {
			arg0.method460();
		}
		arg0.field1212 = arg1.field1212;
		arg0.field1220 = arg1;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}

	@ObfuscatedName("wi.a(Lg;I)V")
	public void method1622(class67 arg0) {
		if (arg0.field1212 != null) {
			arg0.method460();
		}
		arg0.field1212 = this.field4534.field1212;
		arg0.field1220 = this.field4534;
		arg0.field1212.field1220 = arg0;
		arg0.field1220.field1212 = arg0;
	}
}
