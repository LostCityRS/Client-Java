package deob;

@ObfuscatedName("ge")
public final class class47 extends class66 {

	@ObfuscatedName("ge.Vb")
	public static class63 field1114 = new class63(100);

	@ObfuscatedName("ge.Wb")
	public static class63 field1115 = new class63(30);

	@ObfuscatedName("ge.Yb")
	public static class32 field1117 = class73.method593("Walk here", true);

	@ObfuscatedName("ge.Xb")
	public static class32 field1116 = field1117;

	@ObfuscatedName("ge.Zb")
	public static int field1118 = 0;

	@ObfuscatedName("ge.Hb")
	public int field1100;

	@ObfuscatedName("ge.Ob")
	public class147 field1107;

	@ObfuscatedName("ge.a(Lea;Lea;Lc;BLea;)Z")
	public static boolean method349(class30 arg0, class30 arg1, class15 arg2, class30 arg3) {
		class83.field1966 = arg2;
		class105.field2499 = arg0;
		class97.field2237 = arg3;
		class98.field2257 = arg1;
		return true;
	}

	@ObfuscatedName("ge.v(I)V")
	public static void method357() {
		class44.field1014.method490();
		class115.field2720.method490();
		class33.field689.method490();
		class137.field3185.method490();
	}

	@ObfuscatedName("ge.a(Lea;IB)Z")
	public static boolean method358(class30 arg0, int arg1) {
		byte[] var2 = arg0.method218(arg1);
		if (var2 == null) {
			return false;
		} else {
			class54.method427(var2);
			return true;
		}
	}

	@ObfuscatedName("ge.a(IIIII[Lqf;B[BII)V")
	public static void method360(int arg0, int arg1, int arg2, int arg3, int arg4, class117[] arg5, byte[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (var9 + arg2 > 0 && arg2 + var9 < 103 && arg1 + var10 > 0 && var10 + arg1 < 103) {
					arg5[arg8].field2811[arg2 + var9][var10 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		class66 var11 = new class66(arg6);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (var12 == arg4 && arg0 <= var13 && var13 < arg0 + 8 && arg3 <= var14 && arg3 + 8 > var14) {
						class134.method1025(var11, arg8, 0, arg7, class33.method281(arg7, var14 & 0x7, var13 & 0x7) + arg1, class39.method318(arg7, var13 & 0x7, var14 & 0x7) + arg2, 0);
					} else {
						class134.method1025(var11, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	public class47(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ge.s(I)I")
	public int method350() {
		return super.field1586[super.field1568++] - this.field1107.method1101() & 0xFF;
	}

	@ObfuscatedName("ge.t(I)V")
	public void method351() {
		this.field1100 = super.field1568 * 8;
	}

	@ObfuscatedName("ge.d(IB)I")
	public int method352(int arg0) {
		int var2 = this.field1100 >> 3;
		int var3 = 8 - (this.field1100 & 0x7);
		int var4 = 0;
		this.field1100 += arg0;
		while (arg0 > var3) {
			var4 += (class157.field3607[var3] & super.field1586[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (var3 == arg0) {
			var5 = var4 + (class157.field3607[var3] & super.field1586[var2]);
		} else {
			var5 = var4 + (super.field1586[var2] >> var3 - arg0 & class157.field3607[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ge.d(BI)I")
	public int method354(int arg0) {
		return arg0 * 8 - this.field1100;
	}

	@ObfuscatedName("ge.u(I)V")
	public void method355() {
		super.field1568 = (this.field1100 + 7) / 8;
	}

	@ObfuscatedName("ge.j(II)V")
	public void method356(int arg0) {
		super.field1586[super.field1568++] = (byte) (arg0 + this.field1107.method1101());
	}

	@ObfuscatedName("ge.a([IB)V")
	public void method359(int[] arg0) {
		this.field1107 = new class147(arg0);
	}
}
