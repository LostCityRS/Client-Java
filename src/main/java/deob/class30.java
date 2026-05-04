package deob;

@ObfuscatedName("cg")
public abstract class class30 extends class145 {

	@ObfuscatedName("cg.n")
	public boolean field494 = false;

	@ObfuscatedName("cg.a([[III)I")
	public static int method195(int[][] arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg2 >> 7;
		if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2 & 0x7F;
		int var7 = arg0[var3][var4] * (128 - var5) + arg0[var3 + 1][var4] * var5 >> 7;
		int var8 = arg0[var3][var4 + 1] * (128 - var5) + arg0[var3 + 1][var4 + 1] * var5 >> 7;
		return var7 * (128 - var6) + var8 * var6 >> 7;
	}

	@ObfuscatedName("cg.c(III)V")
	public abstract void method180(int arg0, int arg1, int arg2);

	@ObfuscatedName("cg.c()V")
	public abstract void method181();

	@ObfuscatedName("cg.d()V")
	public abstract void method182();

	@ObfuscatedName("cg.d(III)V")
	public abstract void method183(int arg0, int arg1, int arg2);

	@ObfuscatedName("cg.a(ZZ)Lcg;")
	public abstract class30 method184(boolean arg0, boolean arg1);

	@ObfuscatedName("cg.b(ZZ)Lcg;")
	public abstract class30 method185(boolean arg0, boolean arg1);

	@ObfuscatedName("cg.e()I")
	public abstract int method186();

	@ObfuscatedName("cg.a(Lli;IZ)V")
	public abstract void method187(class129 arg0, int arg1, boolean arg2);

	@ObfuscatedName("cg.a(IIIIIIIIJ)V")
	public abstract void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

	@ObfuscatedName("cg.b(I)V")
	public abstract void method188(int arg0);

	@ObfuscatedName("cg.a(Lli;ILli;I[IZ)V")
	public abstract void method189(class129 arg0, int arg1, class129 arg2, int arg3, int[] arg4, boolean arg5);

	@ObfuscatedName("cg.f()V")
	public abstract void method190();

	@ObfuscatedName("cg.c(I)V")
	public abstract void method191(int arg0);

	@ObfuscatedName("cg.g()I")
	public abstract int method192();

	@ObfuscatedName("cg.a(IIIIIII)V")
	public abstract void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("cg.h()I")
	public abstract int method194();

	@ObfuscatedName("cg.i()I")
	public abstract int method196();

	@ObfuscatedName("cg.d(I)V")
	public abstract void method197(int arg0);

	@ObfuscatedName("cg.j()I")
	public abstract int method198();

	@ObfuscatedName("cg.a([[IIIIII)V")
	public final void method199(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = -arg4 / 2;
		int var8 = -arg5 / 2;
		int var9 = method195(arg0, arg1 + var7, arg3 + var8);
		int var10 = arg4 / 2;
		int var11 = -arg5 / 2;
		int var12 = method195(arg0, arg1 + var10, arg3 + var11);
		int var13 = -arg4 / 2;
		int var14 = arg5 / 2;
		int var15 = method195(arg0, arg1 + var13, arg3 + var14);
		int var16 = arg4 / 2;
		int var17 = arg5 / 2;
		int var18 = method195(arg0, arg1 + var16, arg3 + var17);
		int var19 = var9 < var12 ? var9 : var12;
		int var20 = var15 < var18 ? var15 : var18;
		int var21 = var12 < var18 ? var12 : var18;
		int var22 = var9 < var15 ? var9 : var15;
		int var23 = (int) (Math.atan2((double) (var19 - var20), (double) arg5) * 325.95D) & 0x7FF;
		if (var23 != 0) {
			this.method197(var23);
		}
		int var24 = (int) (Math.atan2((double) (var22 - var21), (double) arg4) * 325.95D) & 0x7FF;
		if (var24 != 0) {
			this.method191(var24);
		}
		int var25 = var9 + var18;
		if (var12 + var15 < var25) {
			var25 = var12 + var15;
		}
		int var26 = (var25 >> 1) - arg2;
		if (var26 != 0) {
			this.method180(0, var26, 0);
		}
	}

	@ObfuscatedName("cg.b()I")
	public abstract int method88();
}
