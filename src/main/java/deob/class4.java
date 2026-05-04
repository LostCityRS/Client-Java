package deob;

import java.io.IOException;

@ObfuscatedName("ac")
public final class class4 extends class136 {

	@ObfuscatedName("ac.H")
	public static final class88 field50 = class208.method1423(105, "Invalid loginserver requested)3");

	@ObfuscatedName("ac.N")
	public static class88 field56 = field50;

	@ObfuscatedName("ac.U")
	public static final class88 field63 = class208.method1423(105, ")4l");

	@ObfuscatedName("ac.D")
	public static int field46 = 0;

	@ObfuscatedName("ac.T")
	public static final class88 field62 = class208.method1423(105, "Verbindung mit Update)2Server)3)3)3");

	@ObfuscatedName("ac.I")
	public int field51;

	@ObfuscatedName("ac.K")
	public int field53;

	@ObfuscatedName("ac.L")
	public static class88 field54;

	@ObfuscatedName("ac.O")
	public class88 field57;

	@ObfuscatedName("ac.a(IIILq;)V")
	public static void method16(int arg0, int arg1, class174 arg2) {
		if (class247.field4512 != 0 && class247.field4512 != 3) {
			return;
		}
		int var3 = arg1 - arg2.field3422 / 2;
		int var4 = arg0 - arg2.field3380 / 2;
		int var5 = class207.field3930 + class52.field943 & 0x7FF;
		int var6 = class173.field3354[var5];
		int var7 = class173.field3359[var5];
		int var8 = (class65.field1185 + 256) * var6 >> 8;
		int var9 = (class65.field1185 + 256) * var7 >> 8;
		int var10 = var4 * var8 + var9 * var3 >> 11;
		int var11 = var10 + class240.field4456.field4136 >> 7;
		int var12 = var8 * var3 - var4 * var9 >> 11;
		int var13 = class240.field4456.field4121 - var12 >> 7;
		boolean var14 = class207.method1421(0, 0, var13, var11, class240.field4456.field4087[0], 0, 0, 1, true, 0, class240.field4456.field4141[0]);
		if (!var14) {
			return;
		}
		class146.field2747.method346(var4);
		class146.field2747.method346(var3);
		class146.field2747.method305(class207.field3930);
		class146.field2747.method346(57);
		class146.field2747.method346(class52.field943);
		class146.field2747.method346(class65.field1185);
		class146.field2747.method346(89);
		class146.field2747.method305(class240.field4456.field4136);
		class146.field2747.method305(class240.field4456.field4121);
		class146.field2747.method346(class120.field2186);
		class146.field2747.method346(63);
	}

	@ObfuscatedName("ac.a(Lea;B)V")
	public static void method19(class46 arg0) {
		byte[] var1 = new byte[24];
		if (class175.field3529 != null) {
			try {
				class175.field3529.method818(0L);
				class175.field3529.method810(var1);
				int var2;
				for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
				}
				if (var2 >= 24) {
					throw new IOException();
				}
			} catch (Exception var4) {
				for (int var3 = 0; var3 < 24; var3++) {
					var1[var3] = -1;
				}
			}
		}
		arg0.method325(24, var1);
	}

	@ObfuscatedName("ac.b(II)V")
	public static void method20(int arg0) {
		class177 var1 = (class177) class64.field1163.method1049((long) arg0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.field3553.length; var2++) {
				var1.field3553[var2] = -1;
				var1.field3551[var2] = 0;
			}
		}
	}

	@ObfuscatedName("ac.a(ZII)V")
	public static void method23(int arg0, int arg1) {
		if (class65.field1183 != 0 && arg0 != -1) {
			class53.method388(class133.field2486, arg0, class65.field1183);
			class110.field2012 = true;
		}
	}

	@ObfuscatedName("ac.c(II)Z")
	public static boolean method24(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("ac.d(I)Z")
	public boolean method17() {
		return this.field51 == 115;
	}

	@ObfuscatedName("ac.b(Lea;B)V")
	public void method21(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method22(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(ILea;I)V")
	public void method22(int arg0, class46 arg1) {
		if (arg0 == 1) {
			this.field51 = arg1.method347();
		} else if (arg0 == 2) {
			this.field53 = arg1.method323();
		} else if (arg0 == 5) {
			this.field57 = arg1.method298();
		}
	}
}
