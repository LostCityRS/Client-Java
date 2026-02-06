package deob;

@ObfuscatedName("fe")
public final class class41 extends class40 {

	@ObfuscatedName("fe.A")
	public static class32 field953 = class73.method593("Use", true);

	@ObfuscatedName("fe.B")
	public static class32 field954 = class73.method593(" (X", true);

	@ObfuscatedName("fe.C")
	public static int[] field955 = new int[] { -1, -1, 1, 1 };

	@ObfuscatedName("fe.O")
	public static class32 field967 = class73.method593("Willkommen auf RuneScape", true);

	@ObfuscatedName("fe.M")
	public static class32 field965 = field953;

	@ObfuscatedName("fe.S")
	public static class32 field971 = class73.method593(" has logged in)3", true);

	@ObfuscatedName("fe.K")
	public static class32 field963 = field971;

	@ObfuscatedName("fe.E")
	public final class157 field957 = new class157();

	@ObfuscatedName("fe.Q")
	public final class116 field969 = new class116();

	@ObfuscatedName("fe.I")
	public final class15 field961;

	@ObfuscatedName("fe.N")
	public static int field966;

	@ObfuscatedName("fe.J")
	public static class30 field962;

	@ObfuscatedName("fe.R")
	public static class30 field970;

	@ObfuscatedName("fe.F")
	public static class51[] field958;

	@ObfuscatedName("fe.x")
	public static short[] field950;

	@ObfuscatedName("fe.e(I)V")
	public static void method323() {
		class61.field1352 = 0;
		class102.field2391 = 0;
		class94.method746();
		class142.method1075();
		class32.method242();
		for (int var0 = 0; var0 < class102.field2391; var0++) {
			int var1 = class27.field495[var0];
			if (class14.field230[var1].field2713 != class140.field3217) {
				class14.field230[var1].field2595 = null;
				class14.field230[var1] = null;
			}
		}
		if (class158.field3612.field1568 != class115.field2700) {
			throw new RuntimeException("gnp1 pos:" + class158.field3612.field1568 + " psize:" + class115.field2700);
		}
		for (int var2 = 0; var2 < class102.field2397; var2++) {
			if (class14.field230[class15.field313[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class102.field2397);
			}
		}
	}

	@ObfuscatedName("fe.a(Z)V")
	public static void method324() {
		if (class4.field81 != null) {
			class4.field81.method52();
		}
	}

	public class41(class15 arg0) {
		this.field961 = arg0;
	}

	@ObfuscatedName("fe.b()Lfd;")
	@Override
	public class40 method113() {
		class77 var1;
		do {
			var1 = (class77) this.field957.method1209();
			if (var1 == null) {
				return null;
			}
		} while (var1.field1788 == null);
		return var1.field1788;
	}

	@ObfuscatedName("fe.a(IILla;)V")
	public void method322(int arg0, class77 arg1) {
		if ((this.field961.field297[arg1.field1818] & 0x4) != 0 && arg1.field1819 < 0) {
			int var3 = this.field961.field310[arg1.field1818] / class139.field3211;
			int var4 = (var3 + 1048575 - arg1.field1800) / var3;
			arg1.field1800 = arg1.field1800 + arg0 * var3 & 0xFFFFF;
			if (var4 <= arg0) {
				if (this.field961.field287[arg1.field1818] == 0) {
					arg1.field1788 = class90.method681(arg1.field1811, arg1.field1788.method692(), arg1.field1788.method701(), arg1.field1788.method697());
				} else {
					arg1.field1788 = class90.method681(arg1.field1811, arg1.field1788.method692(), 0, arg1.field1788.method697());
					this.field961.method92(arg1.field1804.field1722[arg1.field1803] < 0, arg1);
				}
				if (arg1.field1804.field1722[arg1.field1803] < 0) {
					arg1.field1788.method684(-1);
				}
				arg0 = arg1.field1800 / var3;
			}
		}
		arg1.field1788.method104(arg0);
	}

	@ObfuscatedName("fe.b([III)V")
	@Override
	public void method116(int[] arg0, int arg1, int arg2) {
		this.field969.method116(arg0, arg1, arg2);
		for (class77 var4 = (class77) this.field957.method1211(); var4 != null; var4 = (class77) this.field957.method1209()) {
			if (!this.field961.method114(var4)) {
				int var5 = arg1;
				int var6 = arg2;
				do {
					if (var6 <= var4.field1791) {
						this.method327(var4, arg0, var5, var6 + var5, var6);
						var4.field1791 -= var6;
						break;
					}
					this.method327(var4, arg0, var5, var5 + var6, var4.field1791);
					var5 += var4.field1791;
					var6 -= var4.field1791;
				} while (!this.field961.method108(var4, var5, arg0, var6));
			}
		}
	}

	@ObfuscatedName("fe.c()Lfd;")
	@Override
	public class40 method106() {
		class77 var1 = (class77) this.field957.method1211();
		if (var1 == null) {
			return null;
		} else if (var1.field1788 == null) {
			return this.method113();
		} else {
			return var1.field1788;
		}
	}

	@ObfuscatedName("fe.a()I")
	@Override
	public int method87() {
		return 0;
	}

	@ObfuscatedName("fe.d(I)V")
	@Override
	public void method104(int arg0) {
		this.field969.method104(arg0);
		for (class77 var2 = (class77) this.field957.method1211(); var2 != null; var2 = (class77) this.field957.method1209()) {
			if (!this.field961.method114(var2)) {
				int var3 = arg0;
				do {
					if (var2.field1791 >= var3) {
						this.method322(var3, var2);
						var2.field1791 -= var3;
						break;
					}
					this.method322(var2.field1791, var2);
					var3 -= var2.field1791;
				} while (!this.field961.method108(var2, 0, null, var3));
			}
		}
	}

	@ObfuscatedName("fe.a(Lla;[IIIII)V")
	public void method327(class77 arg0, int[] arg1, int arg2, int arg3, int arg4) {
		if ((this.field961.field297[arg0.field1818] & 0x4) != 0 && arg0.field1819 < 0) {
			int var6 = this.field961.field310[arg0.field1818] / class139.field3211;
			while (true) {
				int var7 = (var6 + 1048575 - arg0.field1800) / var6;
				if (var7 > arg4) {
					arg0.field1800 += var6 * arg4;
					break;
				}
				arg4 -= var7;
				int var8 = 262144 / var6;
				arg0.field1788.method116(arg1, arg2, var7);
				arg0.field1800 += var7 * var6 - 1048576;
				arg2 += var7;
				class90 var9 = arg0.field1788;
				int var10 = class139.field3211 / 100;
				if (var8 < var10) {
					var10 = var8;
				}
				if (this.field961.field287[arg0.field1818] == 0) {
					arg0.field1788 = class90.method681(arg0.field1811, var9.method692(), var9.method701(), var9.method697());
				} else {
					arg0.field1788 = class90.method681(arg0.field1811, var9.method692(), 0, var9.method697());
					this.field961.method92(arg0.field1804.field1722[arg0.field1803] < 0, arg0);
					arg0.field1788.method678(var10, var9.method701());
				}
				if (arg0.field1804.field1722[arg0.field1803] < 0) {
					arg0.field1788.method684(-1);
				}
				var9.method682(var10);
				var9.method116(arg1, arg2, arg3 - arg2);
				if (var9.method716()) {
					this.field969.method912(var9);
				}
			}
		}
		arg0.field1788.method116(arg1, arg2, arg4);
	}
}
