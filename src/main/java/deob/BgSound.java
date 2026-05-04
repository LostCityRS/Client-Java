package deob;

@ObfuscatedName("na")
public final class BgSound extends Linkable {

	@ObfuscatedName("na.t")
	public class162 field2626;

	@ObfuscatedName("na.v")
	public int field2628;

	@ObfuscatedName("na.w")
	public int field2629;

	@ObfuscatedName("na.x")
	public int field2630;

	@ObfuscatedName("na.z")
	public int field2632;

	@ObfuscatedName("na.F")
	public int field2638;

	@ObfuscatedName("na.G")
	public int field2639;

	@ObfuscatedName("na.H")
	public int field2640;

	@ObfuscatedName("na.N")
	public int field2645;

	@ObfuscatedName("na.P")
	public int field2647;

	@ObfuscatedName("na.X")
	public int field2655;

	@ObfuscatedName("na.B")
	public LocType field2634;

	@ObfuscatedName("na.M")
	public class162 field2644;

	@ObfuscatedName("na.C")
	public int[] field2635;

	@ObfuscatedName("bc.a(IIIIB)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) Statics.field1196.head(); var4 != null; var4 = (BgSound) Statics.field1196.method1619()) {
			if (var4.field2629 != -1 || var4.field2635 != null) {
				int var5 = 0;
				if (var4.field2639 < arg2) {
					var5 = arg2 - var4.field2639;
				} else if (arg2 < var4.field2655) {
					var5 = var4.field2655 - arg2;
				}
				if (arg0 > var4.field2630) {
					var5 += arg0 - var4.field2630;
				} else if (arg0 < var4.field2632) {
					var5 += var4.field2632 - arg0;
				}
				if (var4.field2638 < var5 - 64 || client.field4211 == 0 || var4.field2647 != arg3) {
					if (var4.field2644 != null) {
						client.mixer.stopStream(var4.field2644);
						var4.field2644 = null;
					}
					if (var4.field2626 != null) {
						client.mixer.stopStream(var4.field2626);
						var4.field2626 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = client.field4211 * (var4.field2638 - var5) / var4.field2638;
					if (var4.field2644 != null) {
						var4.field2644.method1117(var6);
					} else if (var4.field2629 >= 0) {
						JagFX var7 = JagFX.method252(client.jagFX, var4.field2629, 0);
						if (var7 != null) {
							class213 var8 = var7.method253().method1453(client.decimator);
							class162 var9 = class162.method1124(var8, var6);
							var9.method1119(-1);
							client.mixer.method1506(var9);
							var4.field2644 = var9;
						}
					}
					if (var4.field2626 != null) {
						var4.field2626.method1117(var6);
						if (!var4.field2626.method459()) {
							var4.field2626 = null;
						}
					} else if (var4.field2635 != null && (var4.field2628 -= arg1) <= 0) {
						int var10 = (int) ((double) var4.field2635.length * Math.random());
						JagFX var11 = JagFX.method252(client.jagFX, var4.field2635[var10], 0);
						if (var11 != null) {
							class213 var12 = var11.method253().method1453(client.decimator);
							class162 var13 = class162.method1124(var12, var6);
							var13.method1119(0);
							client.mixer.method1506(var13);
							var4.field2628 = (int) ((double) (var4.field2640 - var4.field2645) * Math.random()) + var4.field2645;
							var4.field2626 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("be.a(IIIZILnf;)V")
	public static void method84(int arg0, int arg1, int arg2, int arg3, LocType arg4) {
		BgSound var5 = new BgSound();
		var5.field2638 = arg4.field2771 * 128;
		var5.field2635 = arg4.field2815;
		var5.field2647 = arg1;
		var5.field2629 = arg4.field2806;
		int var6 = arg4.field2774;
		var5.field2632 = arg3 * 128;
		var5.field2655 = arg0 * 128;
		var5.field2640 = arg4.field2795;
		var5.field2645 = arg4.field2807;
		int var7 = arg4.field2794;
		if (arg2 == 1 || arg2 == 3) {
			var7 = arg4.field2774;
			var6 = arg4.field2794;
		}
		var5.field2639 = (var6 + arg0) * 128;
		var5.field2630 = (arg3 + var7) * 128;
		if (arg4.field2770 != null) {
			var5.field2634 = arg4;
			var5.method938();
		}
		Statics.field1196.push(var5);
		if (var5.field2635 != null) {
			var5.field2628 = var5.field2645 + (int) ((double) (var5.field2640 - var5.field2645) * Math.random());
		}
	}

	@ObfuscatedName("dj.f(I)V")
	public static void method288() {
		for (BgSound var0 = (BgSound) Statics.field1196.head(); var0 != null; var0 = (BgSound) Statics.field1196.method1619()) {
			if (var0.field2644 != null) {
				client.mixer.stopStream(var0.field2644);
				var0.field2644 = null;
			}
			if (var0.field2626 != null) {
				client.mixer.stopStream(var0.field2626);
				var0.field2626 = null;
			}
		}
		Statics.field1196.method1616();
	}

	@ObfuscatedName("ag.a(B)V")
	public static void method44() {
		for (BgSound var0 = (BgSound) Statics.field1196.head(); var0 != null; var0 = (BgSound) Statics.field1196.method1619()) {
			if (var0.field2634 != null) {
				var0.method938();
			}
		}
	}

	@ObfuscatedName("na.b(I)V")
	public void method938() {
		int var1 = this.field2629;
		LocType var2 = this.field2634.method998();
		if (var2 == null) {
			this.field2635 = null;
			this.field2645 = 0;
			this.field2629 = -1;
			this.field2638 = 0;
			this.field2640 = 0;
		} else {
			this.field2638 = var2.field2771 * 128;
			this.field2635 = var2.field2815;
			this.field2645 = var2.field2807;
			this.field2629 = var2.field2806;
			this.field2640 = var2.field2795;
		}
		if (var1 != this.field2629 && this.field2644 != null) {
			client.mixer.stopStream(this.field2644);
			this.field2644 = null;
		}
	}
}
