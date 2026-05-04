package deob;

import java.util.zip.CRC32;

@ObfuscatedName("id")
public final class class92 {

	@ObfuscatedName("id.d")
	public static final int[] field1720 = new int[4096];

	@ObfuscatedName("id.f")
	public final class136 field1722 = new class136();

	@ObfuscatedName("id.k")
	public final class202 field1727 = new class202();

	@ObfuscatedName("id.l")
	public final class154 field1728;

	@ObfuscatedName("id.m")
	public final int field1729;

	@ObfuscatedName("id.n")
	public int field1730;

	@ObfuscatedName("id.o")
	public static final int[] field1731;

	@ObfuscatedName("id.p")
	public static final CRC32 field1732;

	@ObfuscatedName("id.q")
	public static final class88 field1733;

	@ObfuscatedName("id.r")
	public static int[] field1734;

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field1720[var0] = class54.method394(var0);
		}
		field1731 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
		field1732 = new CRC32();
		field1733 = class208.method1423(105, "title_mute");
	}

	@ObfuscatedName("id.a(BLea;)Ltj;")
	public static class217 method667(class46 arg0) {
		class217 var1 = new class217();
		var1.field4058 = arg0.method301();
		var1.field4065 = class168.method1150(var1.field4058);
		return var1;
	}

	@ObfuscatedName("id.a(IIII)V")
	public static void method668(int arg0, int arg1, int arg2) {
		if (class119.field2172 == 0 || arg0 == 0 || class174.field3445 >= 50 || arg2 == -1) {
			return;
		}
		class25.field397[class174.field3445] = arg2;
		class110.field2016[class174.field3445] = arg0;
		class8.field116[class174.field3445] = arg1;
		class237.field4417[class174.field3445] = null;
		class145.field2726[class174.field3445] = 0;
		class174.field3445++;
	}

	public class92(int arg0) {
		this.field1729 = arg0;
		this.field1730 = arg0;
		int var2;
		for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
		}
		this.field1728 = new class154(var2);
	}

	@ObfuscatedName("id.a(JLme;Z)V")
	public void method663(long arg0, class136 arg1) {
		if (this.field1730 == 0) {
			class136 var4 = this.field1727.method1382();
			var4.method460();
			var4.method907();
			if (var4 == this.field1722) {
				class136 var5 = this.field1727.method1382();
				var5.method460();
				var5.method907();
			}
		} else {
			this.field1730--;
		}
		this.field1728.method1052(arg0, arg1);
		this.field1727.method1387(arg1);
	}

	@ObfuscatedName("id.a(I)Lg;")
	public class67 method664() {
		return this.field1728.method1048();
	}

	@ObfuscatedName("id.a(JI)Lme;")
	public class136 method665(long arg0) {
		class136 var3 = (class136) this.field1728.method1049(arg0);
		if (var3 != null) {
			this.field1727.method1387(var3);
		}
		return var3;
	}

	@ObfuscatedName("id.a(ZJ)V")
	public void method666(long arg0) {
		class136 var3 = (class136) this.field1728.method1049(arg0);
		if (var3 != null) {
			var3.method460();
			var3.method907();
			this.field1730++;
		}
	}

	@ObfuscatedName("id.b(I)V")
	public void method670() {
		while (true) {
			class136 var1 = this.field1727.method1382();
			if (var1 == null) {
				this.field1730 = this.field1729;
				return;
			}
			var1.method460();
			var1.method907();
		}
	}

	@ObfuscatedName("id.a(Z)Lg;")
	public class67 method671() {
		return this.field1728.method1047();
	}
}
