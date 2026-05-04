package deob;

import java.awt.Component;
import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("qb")
public final class class176 extends class136 {

	@ObfuscatedName("qb.R")
	public static int field3545 = 0;

	@ObfuscatedName("qb.F")
	public static int field3535 = 0;

	@ObfuscatedName("qb.J")
	public static final class88 field3538 = class208.method1423(105, "Members object");

	@ObfuscatedName("qb.D")
	public static class88 field3533 = field3538;

	@ObfuscatedName("qb.S")
	public static boolean field3546 = true;

	@ObfuscatedName("qb.L")
	public class154 field3539;

	@ObfuscatedName("qb.P")
	public static class188[] field3543;

	@ObfuscatedName("qb.a(IILjava/awt/Component;I)Luj;")
	public static class228 method1259(int arg0, Component arg1, int arg2) {
		try {
			Class var3 = Class.forName("gj");
			class228 var4 = (class228) var3.getDeclaredConstructor().newInstance();
			var4.method243(arg2, arg0, arg1);
			return var4;
		} catch (Throwable var6) {
			class36 var5 = new class36();
			var5.method243(arg2, arg0, arg1);
			return var5;
		}
	}

	@ObfuscatedName("qb.d(B)V")
	public static void method1261() {
		try {
			if (class117.field2117 == 0) {
				if (class33.field556 != null) {
					class33.field556.method917();
					class33.field556 = null;
				}
				class6.field71 = 0;
				class117.field2117 = 1;
				class58.field1097 = false;
				class98.field1799 = null;
			}
			if (class117.field2117 == 1) {
				if (class98.field1799 == null) {
					class98.field1799 = class126.field2324.method1288(class95.field1760, class168.field3246);
				}
				if (class98.field1799.field3134 == 2) {
					throw new IOException();
				}
				if (class98.field1799.field3134 == 1) {
					class33.field556 = new class137((Socket) class98.field1799.field3129, class126.field2324);
					class117.field2117 = 2;
					class98.field1799 = null;
				}
			}
			if (class117.field2117 == 2) {
				long var0 = class36.field631 = class209.field3967.method630();
				class146.field2747.field831 = 0;
				class146.field2747.method346(14);
				int var2 = (int) (var0 >> 16 & 0x1FL);
				class146.field2747.method346(var2);
				class33.field556.method911(2, class146.field2747.field842);
				class117.field2117 = 3;
				class230.field4312.field831 = 0;
			}
			if (class117.field2117 == 3) {
				if (class27.field458 != null) {
					class27.field458.method403();
				}
				if (class114.field2056 != null) {
					class114.field2056.method403();
				}
				int var3 = class33.field556.method916();
				if (class27.field458 != null) {
					class27.field458.method403();
				}
				if (class114.field2056 != null) {
					class114.field2056.method403();
				}
				if (var3 != 0) {
					class57.method417(var3);
					return;
				}
				class230.field4312.field831 = 0;
				class117.field2117 = 4;
			}
			if (class117.field2117 == 4) {
				if (class230.field4312.field831 < 8) {
					int var4 = class33.field556.method909();
					if (8 - class230.field4312.field831 < var4) {
						var4 = 8 - class230.field4312.field831;
					}
					if (var4 > 0) {
						class33.field556.method913(class230.field4312.field831, class230.field4312.field842, var4);
						class230.field4312.field831 += var4;
					}
				}
				if (class230.field4312.field831 == 8) {
					class230.field4312.field831 = 0;
					class33.field528 = class230.field4312.method321();
					class117.field2117 = 5;
				}
			}
			if (class117.field2117 == 5) {
				class146.field2747.field831 = 0;
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class33.field528 >> 32), (int) class33.field528 };
				class146.field2747.method346(10);
				class146.field2747.method338(var5[0]);
				class146.field2747.method338(var5[1]);
				class146.field2747.method338(var5[2]);
				class146.field2747.method338(var5[3]);
				class146.field2747.method328(class209.field3967.method630());
				class146.field2747.method336(class209.field3970);
				class146.field2747.method311(class32.field515, class58.field1098);
				class31.field501.field831 = 0;
				if (class229.field4284 == 40) {
					class31.field501.method346(18);
				} else {
					class31.field501.method346(16);
				}
				class31.field501.method346(class146.field2747.field831 + class15.method72(class218.field4134) + 141);
				class31.field501.method338(500);
				class31.field501.method346(class245.field4497 ? 1 : 0);
				class4.method19(class31.field501);
				class31.field501.method336(class218.field4134);
				class31.field501.method338(class4.field46);
				class31.field501.method338(class67.field1204.field2712);
				class31.field501.method338(class223.field4201.field2712);
				class31.field501.method338(class85.field1546.field2712);
				class31.field501.method338(class89.field1670.field2712);
				class31.field501.method338(class12.field172.field2712);
				class31.field501.method338(class27.field451.field2712);
				class31.field501.method338(class99.field1814.field2712);
				class31.field501.method338(class233.field4365.field2712);
				class31.field501.method338(class226.field4243.field2712);
				class31.field501.method338(class66.field1193.field2712);
				class31.field501.method338(class9.field137.field2712);
				class31.field501.method338(class133.field2486.field2712);
				class31.field501.method338(class18.field300.field2712);
				class31.field501.method338(class98.field1793.field2712);
				class31.field501.method338(class18.field280.field2712);
				class31.field501.method338(class147.field2760.field2712);
				class31.field501.method338(class109.field2004.field2712);
				class31.field501.method338(class190.field3672.field2712);
				class31.field501.method338(class161.field3113.field2712);
				class31.field501.method338(class248.field4550.field2712);
				class31.field501.method338(class196.field3771.field2712);
				class31.field501.method338(class17.field274.field2712);
				class31.field501.method338(class238.field4431.field2712);
				class31.field501.method338(class130.field2440.field2712);
				class31.field501.method338(class20.field321.field2712);
				class31.field501.method338(class203.field3870.field2712);
				class31.field501.method338(class155.field2994.field2712);
				class31.field501.method325(class146.field2747.field831, class146.field2747.field842);
				class33.field556.method911(class31.field501.field831, class31.field501.field842);
				class146.field2747.method36(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				class230.field4312.method36(var5);
				class117.field2117 = 6;
			}
			if (class117.field2117 == 6 && class33.field556.method909() > 0) {
				int var7 = class33.field556.method916();
				if (var7 == 21 && class229.field4284 == 20) {
					class117.field2117 = 7;
				} else if (var7 == 2) {
					class117.field2117 = 9;
				} else if (var7 == 15 && class229.field4284 == 40) {
					class138.method918();
					return;
				} else if (var7 == 23 && class196.field3758 < 1) {
					class196.field3758++;
					class117.field2117 = 0;
				} else {
					class57.method417(var7);
					return;
				}
			}
			if (class117.field2117 == 7 && class33.field556.method909() > 0) {
				class237.field4424 = (class33.field556.method916() + 3) * 60;
				class117.field2117 = 8;
			}
			if (class117.field2117 == 8) {
				class6.field71 = 0;
				class34.method227(class166.method1140(new class88[] { class170.method1212(class237.field4424 / 60), class127.field2370 }), class110.field2015, class139.field2587);
				if (--class237.field4424 <= 0) {
					class117.field2117 = 0;
				}
			} else {
				if (class117.field2117 == 9 && class33.field556.method909() >= 9) {
					class67.field1208 = class33.field556.method916();
					class29.field479 = class33.field556.method916();
					class238.field4428 = class33.field556.method916();
					if (class238.field4428 == 1) {
						try {
							class59.field1118.method628(class126.field2324.field3597);
						} catch (Throwable var9) {
						}
					} else {
						try {
							class180.field3577.method628(class126.field2324.field3597);
						} catch (Throwable var8) {
						}
					}
					field3535 = class33.field556.method916();
					class57.field1077 = class33.field556.method916() == 1;
					class220.field4164 = class33.field556.method916();
					class220.field4164 <<= 0x8;
					class220.field4164 += class33.field556.method916();
					class6.field72 = class33.field556.method916();
					class33.field556.method913(0, class230.field4312.field842, 1);
					class230.field4312.field831 = 0;
					class238.field4430 = class230.field4312.method33();
					class33.field556.method913(0, class230.field4312.field842, 2);
					class230.field4312.field831 = 0;
					class228.field4270 = class230.field4312.method301();
					class117.field2117 = 10;
				}
				if (class117.field2117 != 10) {
					class6.field71++;
					if (class6.field71 > 2000) {
						if (class196.field3758 < 1) {
							class196.field3758++;
							class117.field2117 = 0;
							if (class220.field4156 == class168.field3246) {
								class168.field3246 = class49.field911;
							} else {
								class168.field3246 = class220.field4156;
							}
						} else {
							class57.method417(-3);
						}
					}
				} else if (class33.field556.method909() >= class228.field4270) {
					class230.field4312.field831 = 0;
					class33.field556.method913(0, class230.field4312.field842, class228.field4270);
					class106.method731();
					class140.field2595 = -1;
					class43.method278(false);
					class238.field4430 = -1;
				}
			}
		} catch (IOException var10) {
			if (class196.field3758 < 1) {
				class196.field3758++;
				class117.field2117 = 0;
				if (class220.field4156 == class168.field3246) {
					class168.field3246 = class49.field911;
				} else {
					class168.field3246 = class220.field4156;
				}
			} else {
				class57.method417(-2);
			}
		}
	}

	@ObfuscatedName("qb.a(ZLnb;I)Lsh;")
	public static class204 method1266(class144 arg0, int arg1) {
		byte[] var2 = arg0.method956(arg1);
		return var2 == null ? null : new class204(var2);
	}

	@ObfuscatedName("qb.a(IILea;)V")
	public void method1260(int arg0, class46 arg1) {
		if (arg0 != 249) {
			return;
		}
		int var3 = arg1.method347();
		if (this.field3539 == null) {
			int var4 = class184.method1296(var3);
			this.field3539 = new class154(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = arg1.method347() == 1;
			int var7 = arg1.method304();
			class67 var8;
			if (var6) {
				var8 = new class216(arg1.method298());
			} else {
				var8 = new class192(arg1.method323());
			}
			this.field3539.method1052((long) var7, var8);
		}
	}

	@ObfuscatedName("qb.a(Li;II)Li;")
	public class88 method1263(class88 arg0, int arg1) {
		if (this.field3539 == null) {
			return arg0;
		} else {
			class216 var3 = (class216) this.field3539.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field4046;
		}
	}

	@ObfuscatedName("qb.a(Lea;I)V")
	public void method1264(class46 arg0) {
		while (true) {
			int var2 = arg0.method347();
			if (var2 == 0) {
				return;
			}
			this.method1260(var2, arg0);
		}
	}

	@ObfuscatedName("qb.a(III)I")
	public int method1265(int arg0, int arg1) {
		if (this.field3539 == null) {
			return arg0;
		} else {
			class192 var3 = (class192) this.field3539.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field3698;
		}
	}
}
