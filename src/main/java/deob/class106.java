package deob;

@ObfuscatedName("pb")
public final class class106 extends class26 {

	@ObfuscatedName("pb.ab")
	public int field2508;

	@ObfuscatedName("pb.bb")
	public class149 field2509;

	@ObfuscatedName("pb.db")
	public static int[] field2511;

	@ObfuscatedName("pb.eb")
	public final int field2512;

	@ObfuscatedName("pb.fb")
	public final int field2513;

	@ObfuscatedName("pb.gb")
	public static int field2514 = 0;

	@ObfuscatedName("pb.hb")
	public final int field2515;

	@ObfuscatedName("pb.ib")
	public final int field2516;

	@ObfuscatedName("pb.jb")
	public final int field2517;

	@ObfuscatedName("pb.kb")
	public static int[] field2518 = new int[128];

	@ObfuscatedName("pb.lb")
	public int field2519;

	@ObfuscatedName("pb.nb")
	public static class32 field2521 = class73.method593("slide:", true);

	@ObfuscatedName("pb.pb")
	public static class32 field2523 = field2521;

	@ObfuscatedName("pb.rb")
	public static class32 field2525 = class73.method593("null", true);

	@ObfuscatedName("pb.tb")
	public static class32 field2527 = field2521;

	@ObfuscatedName("pb.ub")
	public static int field2528;

	@ObfuscatedName("pb.vb")
	public static class66 field2529;

	@ObfuscatedName("pb.wb")
	public static class32 field2530 = class73.method593("Keine Antwort vom Anmelde)2Server)3", true);

	@ObfuscatedName("pb.T")
	public static class32 field2501 = class73.method593("(Y<)4col>", true);

	@ObfuscatedName("pb.W")
	public static int field2504 = 0;

	@ObfuscatedName("pb.Y")
	public static class32 field2506 = class73.method593("shake:", true);

	@ObfuscatedName("pb.qb")
	public static class32 field2524 = field2506;

	@ObfuscatedName("pb.xb")
	public static class32 field2531 = field2506;

	@ObfuscatedName("pb.V")
	public final int field2503;

	@ObfuscatedName("pb.X")
	public static short[][] field2505;

	@ObfuscatedName("pb.a(I[Lf;I)V")
	public static void method859(int arg0, class36[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			class36 var3 = arg1[var2];
			if (var3 != null && var3.field864 == arg0 && (!var3.field848 || !class118.method932(var3))) {
				if (var3.field755 == 0) {
					if (!var3.field848 && class118.method932(var3) && class50.field1163 != var3) {
						continue;
					}
					method859(var3.field743, arg1);
					if (var3.field754 != null) {
						method859(var3.field743, var3.field754);
					}
					class144 var4 = (class144) class109.field2571.method1196((long) var3.field743);
					if (var4 != null) {
						class109.method869(var4.field3280);
					}
				}
				if (var3.field755 == 6) {
					if (var3.field765 != -1 || var3.field787 != -1) {
						boolean var5 = class84.method657(var3);
						int var6;
						if (var5) {
							var6 = var3.field787;
						} else {
							var6 = var3.field765;
						}
						if (var6 != -1) {
							class149 var7 = class97.method760(var6);
							var3.field839 += class54.field1282;
							while (var7.field3376[var3.field762] < var3.field839) {
								var3.field839 -= var7.field3376[var3.field762];
								var3.field762++;
								if (var7.field3393.length <= var3.field762) {
									var3.field762 -= var7.field3386;
									if (var3.field762 < 0 || var7.field3393.length <= var3.field762) {
										var3.field762 = 0;
									}
								}
								class132.method1008(var3);
							}
						}
					}
					if (var3.field749 != 0 && !var3.field848) {
						int var8 = var3.field749 >> 16;
						int var9 = var3.field749 << 16 >> 16;
						int var10 = var8 * class54.field1282;
						var3.field812 = var10 + var3.field812 & 0x7FF;
						int var11 = var9 * class54.field1282;
						var3.field874 = var3.field874 + var11 & 0x7FF;
						class132.method1008(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("pb.e(I)V")
	public static void method860() {
		if (class38.field909 != null) {
			class109 var0 = class38.field909;
			synchronized (class38.field909) {
				class38.field909 = null;
			}
		}
	}

	@ObfuscatedName("pb.f(I)V")
	public static void method861() {
		field2505 = null;
		field2511 = null;
		field2525 = null;
		field2531 = null;
		field2529 = null;
		field2524 = null;
		field2527 = null;
		field2530 = null;
		field2506 = null;
		field2521 = null;
		field2523 = null;
		field2501 = null;
		field2518 = null;
	}

	public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class26 arg8) {
		this.field2515 = arg0;
		this.field2513 = arg1;
		this.field2503 = arg3;
		this.field2516 = arg5;
		this.field2517 = arg2;
		this.field2512 = arg4;
		if (arg6 != -1) {
			this.field2509 = class97.method760(arg6);
			this.field2508 = 0;
			this.field2519 = class140.field3217 - 1;
			if (this.field2509.field3395 == 0 && arg8 != null && arg8 instanceof class106) {
				class106 var10 = (class106) arg8;
				if (this.field2509 == var10.field2509) {
					this.field2508 = var10.field2508;
					this.field2519 = var10.field2519;
					return;
				}
			}
			if (arg7 && this.field2509.field3386 != -1) {
				this.field2508 = (int) ((double) this.field2509.field3393.length * Math.random());
				this.field2519 -= (int) ((double) this.field2509.field3376[this.field2508] * Math.random());
				return;
			}
		}
	}

	@ObfuscatedName("pb.b(B)Lod;")
	@Override
	public class101 method132() {
		if (this.field2509 != null) {
			int var1 = class140.field3217 - this.field2519;
			if (var1 > 100 && this.field2509.field3386 > 0) {
				var1 = 100;
			}
			label46: {
				do {
					do {
						if (var1 <= this.field2509.field3376[this.field2508]) {
							break label46;
						}
						var1 -= this.field2509.field3376[this.field2508];
						this.field2508++;
					} while (this.field2509.field3393.length > this.field2508);
					this.field2508 -= this.field2509.field3386;
				} while (this.field2508 >= 0 && this.field2509.field3393.length > this.field2508);
				this.field2509 = null;
			}
			this.field2519 = class140.field3217 - var1;
		}
		class53 var2 = class5.method22(this.field2515);
		if (var2.field1251 != null) {
			var2 = var2.method422();
		}
		if (var2 == null) {
			return null;
		}
		int var3;
		int var4;
		if (this.field2517 == 1 || this.field2517 == 3) {
			var3 = var2.field1222;
			var4 = var2.field1233;
		} else {
			var4 = var2.field1222;
			var3 = var2.field1233;
		}
		int var5 = this.field2512 + (var4 + 1 >> 1);
		int var6 = this.field2512 + (var4 >> 1);
		int var7 = this.field2516 + (var3 >> 1);
		int var8 = (var3 + 1 >> 1) + this.field2516;
		int[][] var9 = class70.field1630[this.field2503];
		int var10 = var9[var5][var8] + var9[var6][var8] + var9[var6][var7] + var9[var5][var7] >> 2;
		int var11 = (this.field2512 << 7) + (var4 << 6);
		int var12 = (this.field2516 << 7) + (var3 << 6);
		return var2.method415(this.field2509, var12, this.field2513, var9, var11, this.field2508, var10, this.field2517);
	}
}
