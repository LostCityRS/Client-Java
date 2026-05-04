package deob;

@ObfuscatedName("ae")
public final class class6 extends class46 {

	@ObfuscatedName("ae.ac")
	public static final class88 field87 = class208.method1423(105, "Freie Welt");

	@ObfuscatedName("ae.cc")
	public static final class88 field89 = class208.method1423(105, "Cancel");

	@ObfuscatedName("ae.ec")
	public class146 field91;

	@ObfuscatedName("ae.Lb")
	public static int field72 = 0;

	@ObfuscatedName("ae.Ob")
	public static final int[] field75 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@ObfuscatedName("ae.Kb")
	public static int field71 = 0;

	@ObfuscatedName("ae.Vb")
	public static final class88 field82 = class208.method1423(105, " GMT");

	@ObfuscatedName("ae.Mb")
	public static final class88 field73 = class208.method1423(105, "Ihr Spielkonto wurde deaktiviert)3");

	@ObfuscatedName("ae.Zb")
	public static final class88 field86 = class208.method1423(105, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@ObfuscatedName("ae.Wb")
	public static int field83 = 10;

	@ObfuscatedName("ae.Pb")
	public static class88 field76 = field89;

	@ObfuscatedName("ae.Qb")
	public static int field77;

	@ObfuscatedName("ae.Rb")
	public int field78;

	@ObfuscatedName("ae.Xb")
	public static int field84;

	@ObfuscatedName("ae.gc")
	public static class181 field93;

	@ObfuscatedName("ae.a(ZIIIII)V")
	public static void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (class67.field1207 <= arg3 && class12.field183 >= arg4 && arg1 >= class49.field919 && class18.field279 >= arg0) {
			class223.method1502(arg3, arg2, arg4, arg1, arg0);
		} else {
			client.method226(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@ObfuscatedName("ae.e(IB)Z")
	public static boolean method27(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	public class6(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("ae.m(II)I")
	public int method28(int arg0) {
		int var2 = this.field78 >> 3;
		int var3 = 8 - (this.field78 & 0x7);
		this.field78 += arg0;
		int var4 = 0;
		while (var3 < arg0) {
			var4 += (class219.field4142[var3] & super.field842[var2++]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}
		int var5;
		if (arg0 == var3) {
			var5 = var4 + (super.field842[var2] & class219.field4142[var3]);
		} else {
			var5 = var4 + (super.field842[var2] >> var3 - arg0 & class219.field4142[arg0]);
		}
		return var5;
	}

	@ObfuscatedName("ae.a(I[BZI)V")
	public void method29(int arg0, byte[] arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			arg1[var3] = (byte) (super.field842[super.field831++] - this.field91.method978());
		}
	}

	@ObfuscatedName("ae.b(BI)V")
	public void method30(int arg0) {
		super.field842[super.field831++] = (byte) (arg0 + this.field91.method978());
	}

	@ObfuscatedName("ae.c(ZI)I")
	public int method31(int arg0) {
		return arg0 * 8 - this.field78;
	}

	@ObfuscatedName("ae.i(B)I")
	public int method33() {
		return super.field842[super.field831++] - this.field91.method978() & 0xFF;
	}

	@ObfuscatedName("ae.u(I)V")
	public void method34() {
		this.field78 = super.field831 * 8;
	}

	@ObfuscatedName("ae.v(I)V")
	public void method35() {
		super.field831 = (this.field78 + 7) / 8;
	}

	@ObfuscatedName("ae.a([IB)V")
	public void method36(int[] arg0) {
		this.field91 = new class146(arg0);
	}
}
