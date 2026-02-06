package deob;

import java.awt.Component;

@ObfuscatedName("qc")
public class class114 {

	@ObfuscatedName("qc.c")
	public static int field2646 = 127;

	@ObfuscatedName("qc.f")
	public static class32 field2649 = class73.method593(":tradereq:", true);

	@ObfuscatedName("qc.h")
	public static class32 field2651 = field2652;

	@ObfuscatedName("qc.i")
	public static class32 field2652 = class73.method593(" ", true);

	@ObfuscatedName("qc.j")
	public static int[] field2653 = new int[5];

	@ObfuscatedName("qc.l")
	public static class32 field2655 = class73.method593("gleiten:", true);

	@ObfuscatedName("qc.m")
	public int[] field2656;

	@ObfuscatedName("qc.q")
	public static int field2660 = 0;

	@ObfuscatedName("qc.r")
	public static class32 field2661 = class73.method593("Zu viele Verbindungen von Ihrer Adresse)3", true);

	@ObfuscatedName("qc.v")
	public class40 field2665;

	@ObfuscatedName("qc.w")
	public final int field2666 = 32;

	@ObfuscatedName("qc.z")
	public static class32 field2669 = class73.method593("l", true);

	@ObfuscatedName("qc.D")
	public static int[] field2672 = new int[50];

	@ObfuscatedName("qc.y")
	public long field2668 = class52.method407();

	@ObfuscatedName("qc.F")
	public long field2674 = 0L;

	@ObfuscatedName("qc.E")
	public boolean field2673 = true;

	@ObfuscatedName("qc.H")
	public final class40[] field2676 = new class40[8];

	@ObfuscatedName("qc.G")
	public int field2675 = 0;

	@ObfuscatedName("qc.M")
	public int field2681 = 0;

	@ObfuscatedName("qc.J")
	public long field2678 = 0L;

	@ObfuscatedName("qc.P")
	public int field2684 = 0;

	@ObfuscatedName("qc.O")
	public int field2683 = 0;

	@ObfuscatedName("qc.N")
	public final class40[] field2682 = new class40[8];

	@ObfuscatedName("qc.I")
	public int field2677;

	@ObfuscatedName("qc.K")
	public int field2679;

	@ObfuscatedName("qc.L")
	public int field2680;

	@ObfuscatedName("qc.a(ZLec;Lec;Lec;)V")
	public static void method891(class32 arg0, class32 arg1, class32 arg2) {
		class74.field1742 = arg2;
		class74.field1754 = arg0;
		class74.field1740 = arg1;
	}

	@ObfuscatedName("qc.c(Z)V")
	public static void method895() {
		field2655 = null;
		field2651 = null;
		field2653 = null;
		field2652 = null;
		field2672 = null;
		field2661 = null;
		field2669 = null;
		field2649 = null;
	}

	@ObfuscatedName("qc.a(B)V")
	public final synchronized void method888() {
		if (class132.field3031 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (class132.field3031.field487[var2] == this) {
					class132.field3031.field487[var2] = null;
				}
				if (class132.field3031.field487[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				class132.field3031.field501 = true;
				while (class132.field3031.field497) {
					class54.method426(50L);
				}
				class132.field3031 = null;
			}
		}
		this.method144();
		this.field2656 = null;
	}

	@ObfuscatedName("qc.a([II)V")
	public void method889(int[] arg0) {
		short var2 = 256;
		if (class56.field1310) {
			var2 = 512;
		}
		class60.method458(arg0, 0, var2);
		this.field2683 -= 256;
		if (this.field2665 != null && this.field2683 <= 0) {
			this.field2683 += class139.field3211 >> 4;
			class100.method797(this.field2665);
			this.method897(this.field2665, this.field2665.method321());
			int var3 = 0;
			int var4 = 255;
			int var5 = 7;
			label103: while (var4 != 0) {
				int var6;
				int var7;
				if (var5 < 0) {
					var6 = var5 & 0x3;
					var7 = -(var5 >> 2);
				} else {
					var6 = var5;
					var7 = 0;
				}
				for (int var8 = var4 >>> var6 & 0x11111111; var8 != 0; var8 >>>= 0x4) {
					if ((var8 & 0x1) != 0) {
						var4 &= ~(0x1 << var6);
						class40 var9 = null;
						class40 var10 = this.field2676[var6];
						label97: while (true) {
							while (true) {
								if (var10 == null) {
									break label97;
								}
								class95 var11 = var10.field946;
								if (var11 == null || var11.field2184 <= var7) {
									var10.field947 = true;
									int var12 = var10.method87();
									var3 += var12;
									if (var11 != null) {
										var11.field2184 += var12;
									}
									if (var3 >= this.field2666) {
										break label103;
									}
									class40 var13 = var10.method106();
									if (var13 != null) {
										int var14 = var10.field945;
										while (var13 != null) {
											this.method897(var13, var14 * var13.method321() >> 8);
											var13 = var10.method113();
										}
									}
									class40 var15 = var10.field944;
									var10.field944 = null;
									if (var9 == null) {
										this.field2676[var6] = var15;
									} else {
										var9.field944 = var15;
									}
									if (var15 == null) {
										this.field2682[var6] = var9;
									}
									var10 = var15;
								} else {
									var4 |= 0x1 << var6;
									var9 = var10;
									var10 = var10.field944;
								}
							}
						}
					}
					var6 += 4;
					var7++;
				}
				var5--;
			}
			for (int var16 = 0; var16 < 8; var16++) {
				class40 var17 = this.field2676[var16];
				this.field2676[var16] = this.field2682[var16] = null;
				while (var17 != null) {
					class40 var18 = var17.field944;
					var17.field944 = null;
					var17 = var18;
				}
			}
		}
		if (this.field2683 < 0) {
			this.field2683 = 0;
		}
		if (this.field2665 != null) {
			this.field2665.method116(arg0, 0, 256);
		}
		this.field2668 = class52.method407();
	}

	@ObfuscatedName("qc.a(Lfd;I)V")
	public final synchronized void method890(class40 arg0) {
		this.field2665 = arg0;
	}

	@ObfuscatedName("qc.a(Z)V")
	public final void method892() {
		this.field2673 = true;
	}

	@ObfuscatedName("qc.a(Ljava/awt/Component;)V")
	public void method141(Component arg0) throws Exception {
	}

	@ObfuscatedName("qc.a(I)V")
	public void method143(int arg0) throws Exception {
	}

	@ObfuscatedName("qc.a()V")
	public void method139() throws Exception {
	}

	@ObfuscatedName("qc.b(I)V")
	public final synchronized void method893() {
		if (this.field2656 == null) {
			return;
		}
		long var1 = class52.method407();
		try {
			if (this.field2678 != 0L) {
				if (var1 < this.field2678) {
					return;
				}
				this.method143(this.field2680);
				this.field2673 = true;
				this.field2678 = 0L;
			}
			int var3 = this.method138();
			if (this.field2681 - var3 > this.field2684) {
				this.field2684 = this.field2681 - var3;
			}
			int var4 = this.field2679 + this.field2677;
			if (var4 + 256 > 16384) {
				var4 = 16128;
			}
			if (this.field2680 < var4 + 256) {
				this.field2680 += 1024;
				if (this.field2680 > 16384) {
					this.field2680 = 16384;
				}
				var3 = 0;
				this.method144();
				this.method143(this.field2680);
				if (var4 + 256 > this.field2680) {
					var4 = this.field2680 - 256;
					this.field2677 = var4 - this.field2679;
				}
				this.field2673 = true;
			}
			while (var4 > var3) {
				var3 += 256;
				this.method889(this.field2656);
				this.method139();
			}
			if (var1 > this.field2674) {
				if (this.field2673) {
					this.field2673 = false;
				} else if (this.field2684 == 0 && this.field2675 == 0) {
					this.method144();
					this.field2678 = var1 + 2000L;
					return;
				} else {
					this.field2677 = Math.min(this.field2675, this.field2684);
					this.field2675 = this.field2684;
				}
				this.field2674 = var1 + 2000L;
				this.field2684 = 0;
			}
			this.field2681 = var3;
		} catch (Exception var6) {
			this.method144();
			this.field2678 = var1 + 2000L;
		}
		try {
			if (this.field2668 + 500000L < var1) {
				var1 = this.field2668;
			}
			while (this.field2668 + 5000L < var1) {
				this.method896();
				this.field2668 += 256000 / class139.field3211;
			}
		} catch (Exception var5) {
			this.field2668 = var1;
		}
	}

	@ObfuscatedName("qc.b(Z)V")
	public final synchronized void method894() {
		this.field2673 = true;
		try {
			this.method142();
		} catch (Exception var1) {
			this.method144();
			this.field2678 = class52.method407() + 2000L;
		}
	}

	@ObfuscatedName("qc.b()I")
	public int method138() throws Exception {
		return this.field2680;
	}

	@ObfuscatedName("qc.c()V")
	public void method144() {
	}

	@ObfuscatedName("qc.d()V")
	public void method142() throws Exception {
	}

	@ObfuscatedName("qc.a(II)V")
	public void method896() {
		this.field2683 -= 256;
		if (this.field2683 < 0) {
			this.field2683 = 0;
		}
		if (this.field2665 != null) {
			this.field2665.method104(256);
		}
	}

	@ObfuscatedName("qc.a(ILfd;I)V")
	public void method897(class40 arg0, int arg1) {
		int var3 = arg1 >> 5;
		class40 var4 = this.field2682[var3];
		if (var4 == null) {
			this.field2676[var3] = arg0;
		} else {
			var4.field944 = arg0;
		}
		this.field2682[var3] = arg0;
		arg0.field945 = arg1;
	}
}
