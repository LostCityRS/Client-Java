package deob;

@ObfuscatedName("ee")
public abstract class class50 {

	@ObfuscatedName("ee.a")
	public final int field925;

	@ObfuscatedName("ee.b")
	public static short field926 = 32767;

	@ObfuscatedName("ee.c")
	public final int field927;

	@ObfuscatedName("ee.f")
	public static int field930 = 0;

	@ObfuscatedName("ee.g")
	public final int field931;

	@ObfuscatedName("ee.i")
	public static final class88 field933 = class208.method1423(105, "_");

	@ObfuscatedName("ee.a(B)V")
	public static void method372() {
		if (class135.field2514 != null || class179.field3568 != null) {
			return;
		}
		int var0 = class36.field625;
		if (class108.field1958) {
			if (var0 != 1) {
				int var5 = class28.field471;
				int var6 = class239.field4449;
				if (class86.field1549 - 10 > var5 || class86.field1549 + class237.field4421 + 10 < var5 || var6 < class234.field4383 - 10 || class47.field889 + class234.field4383 + 10 < var6) {
					class108.field1958 = false;
					class126.method861(class47.field889, class237.field4421, class234.field4383, class86.field1549);
				}
			}
			if (var0 != 1) {
				return;
			}
			int var7 = class86.field1549;
			int var8 = class234.field4383;
			int var9 = class237.field4421;
			int var10 = class226.field4239;
			int var11 = class172.field3339;
			int var12 = -1;
			for (int var13 = 0; var13 < class203.field3862; var13++) {
				int var14 = var8 + (-var13 + class203.field3862 + -1) * 15 + 31;
				if (var10 > var7 && var10 < var7 + var9 && var11 > var14 - 13 && var11 < var14 + 3) {
					var12 = var13;
				}
			}
			if (var12 != -1) {
				class175.method1257(var12);
			}
			class108.field1958 = false;
			class126.method861(class47.field889, class237.field4421, class234.field4383, class86.field1549);
			return;
		}
		if (var0 == 1 && class203.field3862 > 0) {
			short var1 = class53.field994[class203.field3862 - 1];
			if (var1 == 6 || var1 == 8 || var1 == 49 || var1 == 44 || var1 == 13 || var1 == 28 || var1 == 9 || var1 == 2 || var1 == 21 || var1 == 18 || var1 == 12 || var1 == 1001) {
				int var2 = class165.field3176[class203.field3862 - 1];
				int var3 = class217.field4060[class203.field3862 - 1];
				class174 var4 = class239.method1579(var3);
				if (class68.method465(class80.method530(var4)) || class159.method1070(class80.method530(var4))) {
					class248.field4535 = 0;
					class43.field739 = false;
					if (class135.field2514 != null) {
						class200.method1371(class135.field2514);
					}
					class135.field2514 = class239.method1579(var3);
					class18.field305 = var2;
					class219.field4146 = class226.field4239;
					class48.field894 = class172.field3339;
					class200.method1371(class135.field2514);
					return;
				}
			}
		}
		if (var0 == 1 && (class203.field3859 == 1 && class203.field3862 > 2 || class234.method1554(class203.field3862 - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && class203.field3862 > 0) {
			class175.method1257(class203.field3862 - 1);
		}
		if (var0 == 2 && class203.field3862 > 0) {
			class136.method904();
			return;
		}
	}

	@ObfuscatedName("ee.b(III)V")
	public static void method374(int arg0, int arg1, int arg2) {
		class118.field2145 = true;
		class133.field2484 = arg0;
		class39.field698 = arg1;
		class35.field621 = arg2;
		class114.field2057 = -1;
		class90.field1714 = -1;
	}

	@ObfuscatedName("ee.a(BZI)Li;")
	public static class88 method375(int arg0) {
		return class219.method1481(true, arg0);
	}

	@ObfuscatedName("ee.a(BLhj;)V")
	public static void method376(class87 arg0) {
		if (class209.field3959) {
			class65.method453(arg0);
			return;
		}
		if (class36.field625 == 1 && class226.field4239 >= 715 && class172.field3339 >= 453) {
			class131.field2460 = !class131.field2460;
			if (class131.field2460) {
				class1.method5();
			} else {
				class53.method388(class99.field1814, class86.field1552, 255);
			}
		}
		if (class229.field4284 == 5) {
			return;
		}
		class86.field1550++;
		if (class229.field4284 != 10) {
			return;
		}
		if (class143.field2657 != 2) {
			if (class36.field625 == 1 && class226.field4239 >= 5 && class226.field4239 <= 105 && class172.field3339 >= 463 && class172.field3339 <= 498) {
				class114.method779();
				return;
			}
			if (class129.field2414 != null) {
				class114.method779();
			}
		}
		int var1 = class36.field625;
		int var2 = class226.field4239;
		int var3 = class172.field3339;
		if (class65.field1182 == 0) {
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 271 && var3 <= 311) {
				class142.field2620 = 0;
				class65.field1182 = 3;
			}
			boolean var4 = false;
			if (class115.field2071 != 0) {
				while (class43.method279()) {
					if (class137.field2556 == 84) {
						var4 = true;
						break;
					}
				}
			}
			if (var4 || var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 271 && var3 <= 311) {
				class65.field1182 = 2;
				class209.field3980 = class70.field1277;
				class209.field3981 = class70.field1298;
				class142.field2620 = 0;
				class209.field3979 = class16.field242;
			}
		} else if (class65.field1182 == 2) {
			short var5 = 231;
			int var8 = var5 + 30;
			if (var1 == 1 && var3 >= 246 && var3 < 261) {
				class142.field2620 = 0;
			}
			var8 += 15;
			if (var1 == 1 && var3 >= 261 && var3 < 276) {
				class142.field2620 = 1;
			}
			var8 += 15;
			if (var1 == 1 && var2 >= 227 && var2 <= 377 && var3 >= 301 && var3 <= 341) {
				class209.field3967 = class209.field3967.method611().method614();
				if (class209.field3967.method604() == 0) {
					class34.method227(class70.field1285, class70.field1295, class3.field38);
				} else if (class209.field3970.method604() == 0) {
					class34.method227(class70.field1288, class70.field1290, class37.field662);
				} else {
					class34.method227(class70.field1306, class70.field1275, class59.field1117);
					class131.method881(20);
				}
			} else {
				if (var1 == 1 && var2 >= 387 && var2 <= 537 && var3 >= 301 && var3 <= 341) {
					class209.field3967 = class209.field3972;
					class65.field1182 = 0;
					class209.field3970 = class209.field3972;
				}
				while (true) {
					boolean var6;
					label226: do {
						while (class43.method279()) {
							var6 = false;
							for (int var7 = 0; var7 < class74.field1339.method604(); var7++) {
								if (class219.field4148 == class74.field1339.method599(var7)) {
									var6 = true;
									break;
								}
							}
							if (class142.field2620 != 0) {
								continue label226;
							}
							if (class137.field2556 == 85 && class209.field3967.method604() > 0) {
								class209.field3967 = class209.field3967.method623(0, class209.field3967.method604() - 1);
							}
							if (class137.field2556 == 84 || class137.field2556 == 80) {
								class142.field2620 = 1;
							}
							if (var6 && class209.field3967.method604() < 12) {
								class209.field3967 = class209.field3967.method618(class219.field4148);
							}
						}
						return;
					} while (class142.field2620 != 1);
					if (class137.field2556 == 85 && class209.field3970.method604() > 0) {
						class209.field3970 = class209.field3970.method623(0, class209.field3970.method604() - 1);
					}
					if (class137.field2556 == 84 || class137.field2556 == 80) {
						class142.field2620 = 0;
					}
					if (class115.field2071 != 0 && class137.field2556 == 84) {
						class209.field3967 = class209.field3967.method611().method614();
						if (class209.field3967.method604() == 0) {
							class34.method227(class70.field1285, class70.field1295, class3.field38);
							return;
						}
						if (class209.field3970.method604() == 0) {
							class34.method227(class70.field1288, class70.field1290, class37.field662);
							return;
						}
						class34.method227(class70.field1306, class70.field1275, class59.field1117);
						class131.method881(20);
						return;
					}
					if (var6 && class209.field3970.method604() < 20) {
						class209.field3970 = class209.field3970.method618(class219.field4148);
					}
				}
			}
		} else if (class65.field1182 == 3 && var1 == 1 && var2 >= 307 && var2 <= 457 && var3 >= 301 && var3 <= 341) {
			class65.field1182 = 0;
		}
	}

	public class50(int arg0, int arg1, int arg2) {
		this.field927 = arg1;
		this.field925 = arg0;
		this.field931 = arg2;
	}

	@ObfuscatedName("ee.a(III)V")
	public abstract void method371(int arg0, int arg1);

	@ObfuscatedName("ee.a(IIZ)V")
	public abstract void method373(int arg0, int arg1);

	@ObfuscatedName("ee.a(IIB)V")
	public abstract void method377(int arg0, int arg1);
}
