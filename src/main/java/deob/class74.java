package deob;

@ObfuscatedName("gh")
public final class class74 extends class50 {

	@ObfuscatedName("gh.k")
	public final int field1340;

	@ObfuscatedName("gh.l")
	public static final class88 field1341 = class208.method1423(105, "M");

	@ObfuscatedName("gh.n")
	public final int field1343;

	@ObfuscatedName("gh.o")
	public static final class88 field1344 = class208.method1423(105, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@ObfuscatedName("gh.j")
	public static final class88 field1339 = field1344;

	@ObfuscatedName("gh.p")
	public final int field1345;

	@ObfuscatedName("gh.q")
	public final int field1346;

	@ObfuscatedName("gh.t")
	public static final class248 field1349 = new class248();

	@ObfuscatedName("gh.v")
	public static final class88 field1351 = class208.method1423(105, ")1j");

	@ObfuscatedName("gh.w")
	public static final long[] field1352 = new long[500];

	@ObfuscatedName("gh.B")
	public static final class88 field1357 = class208.method1423(105, "scrollen:");

	@ObfuscatedName("gh.C")
	public static final class88 field1358 = class208.method1423(105, "und loggen sich dann erneut ein)3");

	@ObfuscatedName("gh.A")
	public static final class88 field1356 = class208.method1423(105, "white:");

	@ObfuscatedName("gh.y")
	public static class88 field1354 = field1356;

	@ObfuscatedName("gh.z")
	public static final class88 field1355 = field1356;

	@ObfuscatedName("gh.x")
	public static int field1353;

	@ObfuscatedName("gh.c(III)J")
	public static long method501(int arg0, int arg1, int arg2) {
		class52 var3 = class29.field489[arg0][arg1][arg2];
		return var3 == null || var3.field949 == null ? 0L : var3.field949.field3202;
	}

	@ObfuscatedName("gh.a(ILnb;)V")
	public static void method502(class144 arg0) {
		class202.field3849 = arg0;
	}

	public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg4, arg5, arg6);
		this.field1343 = arg3;
		this.field1345 = arg2;
		this.field1340 = arg0;
		this.field1346 = arg1;
	}

	@ObfuscatedName("gh.a(IIB)V")
	@Override
	public void method377(int arg0, int arg1) {
		int var3 = this.field1340 * arg0 >> 12;
		int var4 = this.field1345 * arg0 >> 12;
		int var5 = arg1 * this.field1346 >> 12;
		int var6 = arg1 * this.field1343 >> 12;
		class132.method887(super.field931, var5, var4, var6, super.field927, var3);
	}

	@ObfuscatedName("gh.a(IIZ)V")
	@Override
	public void method373(int arg0, int arg1) {
		int var3 = this.field1345 * arg1 >> 12;
		int var4 = arg1 * this.field1340 >> 12;
		int var5 = this.field1346 * arg0 >> 12;
		int var6 = arg0 * this.field1343 >> 12;
		class6.method26(var6, var5, super.field925, var4, var3);
	}

	@ObfuscatedName("gh.a(III)V")
	@Override
	public void method371(int arg0, int arg1) {
		int var3 = arg0 * this.field1340 >> 12;
		int var4 = arg0 * this.field1345 >> 12;
		int var5 = this.field1346 * arg1 >> 12;
		int var6 = arg1 * this.field1343 >> 12;
		class49.method368(var4, super.field927, var5, super.field931, super.field925, var3, var6);
	}
}
