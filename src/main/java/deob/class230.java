package deob;

@ObfuscatedName("va")
public final class class230 {

	@ObfuscatedName("va.a")
	public class156[] field4291;

	@ObfuscatedName("va.c")
	public static final class88 field4293 = class208.method1423(105, "Loading textures )2 ");

	@ObfuscatedName("va.e")
	public static class88 field4295 = field4293;

	@ObfuscatedName("va.f")
	public int field4296 = 0;

	@ObfuscatedName("va.g")
	public final int field4297;

	@ObfuscatedName("va.j")
	public class248 field4300 = new class248();

	@ObfuscatedName("va.k")
	public int field4301 = -1;

	@ObfuscatedName("va.l")
	public static final class24 field4302 = new class24(30);

	@ObfuscatedName("va.m")
	public static final byte[] field4303 = new byte[520];

	@ObfuscatedName("va.o")
	public final int field4305;

	@ObfuscatedName("va.p")
	public int[][][] field4306;

	@ObfuscatedName("va.t")
	public boolean field4310 = false;

	@ObfuscatedName("va.u")
	public static final class88 field4311 = class208.method1423(105, "Diese Welt ist voll)3");

	@ObfuscatedName("va.v")
	public static final class6 field4312 = new class6(5000);

	@ObfuscatedName("va.w")
	public static class154 field4313;

	@ObfuscatedName("va.z")
	public static final int field4316 = 7759444;

	@ObfuscatedName("va.y")
	public static final class88 field4315 = class208.method1423(105, "Please use a different world)3");

	@ObfuscatedName("va.A")
	public static class88 field4317 = field4315;

	@ObfuscatedName("va.C")
	public static int field4318 = 0;

	@ObfuscatedName("va.D")
	public static class88 field4319 = field4315;

	@ObfuscatedName("va.x")
	public static int field4314;

	@ObfuscatedName("va.E")
	public static class193[] field4320;

	@ObfuscatedName("va.a(IIIIB)V")
	public static void method1532(int arg0, int arg1, int arg2, int arg3) {
		if (class67.field1207 <= arg0 - arg1 && class12.field183 >= arg1 + arg0 && arg2 - arg1 >= class49.field919 && class18.field279 >= arg1 + arg2) {
			class109.method745(arg2, arg3, arg1, arg0);
		} else {
			class46.method318(arg3, arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("va.a(IIIIIIII)V")
	public static void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (class211.method1445(arg5)) {
			class143.method933(arg2, arg4, arg6, -1, arg1, class78.field1418[arg5], arg3, arg0);
		}
	}

	@ObfuscatedName("va.a(IIII[I)V")
	public static void method1534(int arg0, int arg1, int arg2, int[] arg3) {
		arg0--;
		int var10 = arg2 - 1;
		int var4 = var10 - 7;
		while (arg0 < var4) {
			int var5 = arg0 + 1;
			arg3[var5] = arg1;
			int var6 = var5 + 1;
			arg3[var6] = arg1;
			int var7 = var6 + 1;
			arg3[var7] = arg1;
			int var8 = var7 + 1;
			arg3[var8] = arg1;
			int var9 = var8 + 1;
			arg3[var9] = arg1;
			int var11 = var9 + 1;
			arg3[var11] = arg1;
			int var12 = var11 + 1;
			arg3[var12] = arg1;
			arg0 = var12 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < var10) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}

	@ObfuscatedName("va.a(Lqg;IILea;)V")
	public static void method1535(class181 arg0, int arg1, class46 arg2) {
		class9 var3 = new class9();
		var3.field124 = arg2.method347();
		var3.field136 = arg2.method323();
		var3.field129 = new int[var3.field124];
		var3.field139 = new class163[var3.field124];
		var3.field128 = new int[var3.field124];
		var3.field132 = new int[var3.field124];
		var3.field131 = new byte[var3.field124][][];
		var3.field138 = new class163[var3.field124];
		for (int var4 = 0; var4 < var3.field124; var4++) {
			try {
				int var5 = arg2.method347();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					String var16 = new String(arg2.method298().method613());
					String var17 = new String(arg2.method298().method613());
					int var18 = 0;
					if (var5 == 1) {
						var18 = arg2.method323();
					}
					var3.field128[var4] = var5;
					var3.field129[var4] = var18;
					var3.field139[var4] = arg0.method1291(var17, class237.method1574(var16));
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg2.method298().method613());
					String var7 = new String(arg2.method298().method613());
					int var8 = arg2.method347();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg2.method298().method613());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg2.method323();
							var11[var12] = new byte[var13];
							arg2.method307(var13, var11[var12]);
						}
					}
					var3.field128[var4] = var5;
					Class[] var14 = new Class[var8];
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = class237.method1574(var9[var15]);
					}
					var3.field138[var4] = arg0.method1294(var7, class237.method1574(var6), var14);
					var3.field131[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field132[var4] = -1;
			} catch (SecurityException var20) {
				var3.field132[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field132[var4] = -3;
			} catch (Exception var22) {
				var3.field132[var4] = -4;
			} catch (Throwable var23) {
				var3.field132[var4] = -5;
			}
		}
		class89.field1694.method1622(var3);
	}

	@ObfuscatedName("va.a(IZ[Lq;)V")
	public static void method1536(int arg0, class174[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			class174 var3 = arg1[var2];
			if (var3 != null) {
				if (var3.field3390 == 0) {
					if (var3.field3465 != null) {
						method1536(arg0, var3.field3465);
					}
					class168 var4 = (class168) class128.field2395.method1049((long) var3.field3423);
					if (var4 != null) {
						class137.method912(var4.field3229, arg0);
					}
				}
				if (arg0 == 0 && var3.field3434 != null) {
					class39 var5 = new class39();
					var5.field678 = var3;
					var5.field681 = var3.field3434;
					class200.method1373(var5);
				}
				if (arg0 == 1 && var3.field3495 != null) {
					if (var3.field3406 >= 0) {
						class174 var6 = class239.method1579(var3.field3423);
						if (var6 == null || var6.field3465 == null || var3.field3406 >= var6.field3465.length || var3 != var6.field3465[var3.field3406]) {
							continue;
						}
					}
					class39 var7 = new class39();
					var7.field678 = var3;
					var7.field681 = var3.field3495;
					class200.method1373(var7);
				}
			}
		}
	}

	public class230(int arg0, int arg1, int arg2) {
		this.field4305 = arg1;
		this.field4291 = new class156[this.field4305];
		this.field4297 = arg0;
		this.field4306 = new int[this.field4297][3][arg2];
	}

	@ObfuscatedName("va.a(I)V")
	public void method1531() {
		for (int var1 = 0; var1 < this.field4297; var1++) {
			this.field4306[var1][0] = null;
			this.field4306[var1][1] = null;
			this.field4306[var1][2] = null;
			this.field4306[var1] = null;
		}
		this.field4306 = null;
		this.field4291 = null;
		this.field4300.method1616();
		this.field4300 = null;
	}

	@ObfuscatedName("va.a(Z)[[[I")
	public int[][][] method1537() {
		if (this.field4297 != this.field4305) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int var1 = 0; var1 < this.field4297; var1++) {
			this.field4291[var1] = class68.field1236;
		}
		return this.field4306;
	}

	@ObfuscatedName("va.a(ZI)[[I")
	public int[][] method1539(int arg0) {
		if (this.field4297 == this.field4305) {
			this.field4310 = this.field4291[arg0] == null;
			this.field4291[arg0] = class68.field1236;
			return this.field4306[arg0];
		} else if (this.field4297 == 1) {
			this.field4310 = arg0 != this.field4301;
			this.field4301 = arg0;
			return this.field4306[0];
		} else {
			class156 var2 = this.field4291[arg0];
			if (var2 == null) {
				this.field4310 = true;
				if (this.field4297 > this.field4296) {
					var2 = new class156(arg0, this.field4296);
					this.field4296++;
				} else {
					class156 var3 = (class156) this.field4300.method1612();
					var2 = new class156(arg0, var3.field3006);
					this.field4291[var3.field3015] = null;
					var3.method460();
				}
				this.field4291[arg0] = var2;
			} else {
				this.field4310 = false;
			}
			this.field4300.method1615(var2);
			return this.field4306[var2.field3006];
		}
	}
}
