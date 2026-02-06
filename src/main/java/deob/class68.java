package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

@ObfuscatedName("jf")
public final class class68 {

	@ObfuscatedName("jf.c")
	public static int[] field1592;

	@ObfuscatedName("jf.d")
	public static class32 field1593 = class73.method593("::fpsoff", true);

	@ObfuscatedName("jf.e")
	public static class32 field1594 = class73.method593("titlebox", true);

	@ObfuscatedName("jf.j")
	public static class32 field1599 = class73.method593("This world is running a closed Beta)3", true);

	@ObfuscatedName("jf.f")
	public static class32 field1595 = field1599;

	@ObfuscatedName("jf.k")
	public static int[] field1600 = new int[4000];

	@ObfuscatedName("jf.m")
	public static class32 field1602 = class73.method593("bevor Sie den Vorgang wiederholen)3", true);

	@ObfuscatedName("jf.n")
	public static int field1603;

	@ObfuscatedName("jf.o")
	public static class32 field1604 = class73.method593(" steht bereits auf Ihrer Ignorieren)2Liste(Q", true);

	@ObfuscatedName("jf.p")
	public static class32 field1605 = class73.method593("No reply from loginserver)3", true);

	@ObfuscatedName("jf.i")
	public static class32 field1598 = field1605;

	@ObfuscatedName("jf.q")
	public final class30 field1606;

	@ObfuscatedName("jf.u")
	public final class156 field1610 = new class156(256);

	@ObfuscatedName("jf.w")
	public final class30 field1612;

	@ObfuscatedName("jf.x")
	public final class156 field1613 = new class156(256);

	@ObfuscatedName("jf.a(I)Z")
	public static boolean method562() {
		long var0 = class52.method407();
		int var2 = (int) (var0 - class136.field3157);
		if (var2 > 200) {
			var2 = 200;
		}
		class133.field3040 += var2;
		class136.field3157 = var0;
		if (class66.field1579 == 0 && class64.field1494 == 0 && class33.field697 == 0 && class158.field3627 == 0) {
			return true;
		} else if (class4.field81 == null) {
			return false;
		} else {
			try {
				if (class133.field3040 > 30000) {
					throw new IOException();
				}
				while (class64.field1494 < 20 && class158.field3627 > 0) {
					class110 var3 = (class110) class97.field2212.method1203();
					class66 var4 = new class66(4);
					var4.method514(1);
					var4.method550((int) var3.field3324);
					class4.field81.method49(var4.field1586, 4);
					class112.field2616.method1201(var3.field3324, var3);
					class64.field1494++;
					class158.field3627--;
				}
				while (class66.field1579 < 20 && class33.field697 > 0) {
					class110 var5 = (class110) class126.field2918.method1170();
					class66 var6 = new class66(4);
					var6.method514(0);
					var6.method550((int) var5.field3324);
					class4.field81.method49(var6.field1586, 4);
					var5.method68();
					class31.field593.method1201(var5.field3324, var5);
					class66.field1579++;
					class33.field697--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = class4.field81.method51();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					class133.field3040 = 0;
					byte var9 = 0;
					if (class149.field3372 == null) {
						var9 = 8;
					} else if (class38.field921 == 0) {
						var9 = 1;
					}
					if (var9 > 0) {
						int var10 = var9 - class61.field1354.field1568;
						if (var8 < var10) {
							var10 = var8;
						}
						class4.field81.method50(class61.field1354.field1568, class61.field1354.field1586, var10);
						if (class92.field2118 != 0) {
							for (int var11 = 0; var11 < var10; var11++) {
								class61.field1354.field1586[var11 + class61.field1354.field1568] ^= class92.field2118;
							}
						}
						class61.field1354.field1568 += var10;
						if (class61.field1354.field1568 < var9) {
							break;
						}
						if (class149.field3372 == null) {
							class61.field1354.field1568 = 0;
							int var12 = class61.field1354.method532();
							int var13 = class61.field1354.method531();
							long var14 = (long) (var13 + (var12 << 16));
							int var16 = class61.field1354.method532();
							int var17 = class61.field1354.method538();
							class110 var18 = (class110) class112.field2616.method1196(var14);
							class13.field219 = true;
							if (var18 == null) {
								var18 = (class110) class31.field593.method1196(var14);
								class13.field219 = false;
							}
							if (var18 == null) {
								throw new IOException();
							}
							class149.field3372 = var18;
							int var19 = var16 == 0 ? 5 : 9;
							class106.field2529 = new class66(class149.field3372.field2587 + var17 + var19);
							class106.field2529.method514(var16);
							class106.field2529.method530(var17);
							class61.field1354.field1568 = 0;
							class38.field921 = 8;
						} else if (class38.field921 == 0) {
							if (class61.field1354.field1586[0] == -1) {
								class61.field1354.field1568 = 0;
								class38.field921 = 1;
							} else {
								class149.field3372 = null;
							}
						}
					} else {
						int var20 = class106.field2529.field1586.length - class149.field3372.field2587;
						int var21 = 512 - class38.field921;
						if (var20 - class106.field2529.field1568 < var21) {
							var21 = var20 - class106.field2529.field1568;
						}
						if (var21 > var8) {
							var21 = var8;
						}
						class4.field81.method50(class106.field2529.field1568, class106.field2529.field1586, var21);
						if (class92.field2118 != 0) {
							for (int var22 = 0; var22 < var21; var22++) {
								class106.field2529.field1586[class106.field2529.field1568 + var22] = (byte) (class106.field2529.field1586[class106.field2529.field1568 + var22] ^ class92.field2118);
							}
						}
						class38.field921 += var21;
						class106.field2529.field1568 += var21;
						if (var20 == class106.field2529.field1568) {
							if (class149.field3372.field3324 == 16711935L) {
								class119.field2846 = class106.field2529;
								for (int var24 = 0; var24 < 256; var24++) {
									class44 var25 = class88.field2047[var24];
									if (var25 != null) {
										class119.field2846.field1568 = var24 * 8 + 5;
										int var26 = class119.field2846.method538();
										int var27 = class119.field2846.method538();
										var25.method336(var27, var26);
									}
								}
							} else {
								class23.field415.reset();
								class23.field415.update(class106.field2529.field1586, 0, var20);
								int var23 = (int) class23.field415.getValue();
								if (var23 != class149.field3372.field2578) {
									try {
										class4.field81.method52();
									} catch (Exception var29) {
									}
									client.field388++;
									class92.field2118 = (byte) (Math.random() * 255.0D + 1.0D);
									class4.field81 = null;
									return false;
								}
								client.field388 = 0;
								class61.field1355 = 0;
								class149.field3372.field2589.method335(class13.field219, (int) (class149.field3372.field3324 & 0xFFFFL), (class149.field3372.field3324 & 0xFF0000L) == 16711680L, class106.field2529.field1586);
							}
							class149.field3372.method1091();
							if (class13.field219) {
								class64.field1494--;
							} else {
								class66.field1579--;
							}
							class106.field2529 = null;
							class149.field3372 = null;
							class38.field921 = 0;
						} else {
							if (class38.field921 != 512) {
								break;
							}
							class38.field921 = 0;
						}
					}
				}
				return true;
			} catch (IOException var30) {
				try {
					class4.field81.method52();
				} catch (Exception var28) {
				}
				class4.field81 = null;
				class61.field1355++;
				return false;
			}
		}
	}

	@ObfuscatedName("jf.a(B)V")
	public static void method563() {
		field1604 = null;
		field1598 = null;
		field1593 = null;
		field1602 = null;
		field1599 = null;
		field1594 = null;
		field1592 = null;
		field1600 = null;
		field1595 = null;
		field1605 = null;
	}

	@ObfuscatedName("jf.a(Z)V")
	public static void method565() {
		class83.field1966.method115();
		class34.field718 = null;
		class98.field2263 = 1;
	}

	@ObfuscatedName("jf.a(IZ)V")
	public static void method568(int arg0) {
		if (class98.field2263 == 0) {
			class83.field1966.method89(arg0);
		} else {
			class57.field1321 = arg0;
		}
	}

	@ObfuscatedName("jf.b(B)V")
	public static void method569() {
		for (int var0 = -1; var0 < class62.field1404; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class137.field3187[var0];
			}
			class70 var2 = class52.field1175[var1];
			if (var2 != null) {
				class31.method227(1, var2);
			}
		}
	}

	@ObfuscatedName("jf.a(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method571(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof class159) {
			class159 var1 = (class159) arg0;
			arg0 = var1.field3647;
			var2 = var1.field3643 + " | ";
		} else {
			var2 = "";
		}
		StringWriter var3 = new StringWriter();
		PrintWriter var4 = new PrintWriter(var3);
		arg0.printStackTrace(var4);
		var4.close();
		String var5 = var3.toString();
		BufferedReader var6 = new BufferedReader(new StringReader(var5));
		String var7 = var6.readLine();
		while (true) {
			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					return var2 + "| " + var7;
				}
				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, var9 + 1);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(var9 + 1, var10);
					int var12 = var11.indexOf(".java:");
					if (var12 >= 0) {
						String var13 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var13 + ' ';
						continue;
					}
					var8 = var8.substring(0, var9);
				}
				String var14 = var8.trim();
				String var15 = var14.substring(var14.lastIndexOf(32) + 1);
				String var16 = var15.substring(var15.lastIndexOf(9) + 1);
				var2 = var2 + var16 + ' ';
			}
		}
	}

	public class68(class30 arg0, class30 arg1) {
		this.field1606 = arg1;
		this.field1612 = arg0;
	}

	@ObfuscatedName("jf.a(II[II)Lib;")
	public class58 method564(int arg0, int[] arg1, int arg2) {
		int var4 = ((arg2 & 0xA0000FFF) << 4 | arg2 >>> 12) ^ arg0;
		int var5 = var4 | arg2 << 16;
		long var6 = (long) var5;
		class58 var8 = (class58) this.field1613.method1196(var6);
		if (var8 != null) {
			return var8;
		} else if (arg1 == null || arg1[0] > 0) {
			class123 var9 = class123.method972(this.field1612, arg2, arg0);
			if (var9 == null) {
				return null;
			}
			class58 var10 = var9.method971();
			this.field1613.method1201(var6, var10);
			if (arg1 != null) {
				arg1[0] -= var10.field1343.length;
			}
			return var10;
		} else {
			return null;
		}
	}

	@ObfuscatedName("jf.a(IB[I)Lib;")
	public class58 method566(int arg0, int[] arg1) {
		if (this.field1612.method204() == 1) {
			return this.method564(arg0, arg1, 0);
		} else if (this.field1612.method200(arg0) == 1) {
			return this.method564(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jf.a([IBI)Lib;")
	public class58 method567(int[] arg0, int arg1) {
		if (this.field1606.method204() == 1) {
			return this.method570(arg1, 0, arg0);
		} else if (this.field1606.method200(arg1) == 1) {
			return this.method570(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jf.a(IIB[I)Lib;")
	public class58 method570(int arg0, int arg1, int[] arg2) {
		int var4 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFFF);
		int var5 = var4 | arg1 << 16;
		long var6 = (long) var5 ^ 0x100000000L;
		class58 var8 = (class58) this.field1613.method1196(var6);
		if (var8 != null) {
			return var8;
		} else if (arg2 == null || arg2[0] > 0) {
			class93 var9 = (class93) this.field1610.method1196(var6);
			if (var9 == null) {
				var9 = class93.method736(this.field1606, arg1, arg0);
				if (var9 == null) {
					return null;
				}
				this.field1610.method1201(var6, var9);
			}
			class58 var10 = var9.method732(arg2);
			if (var10 == null) {
				return null;
			} else {
				var9.method1091();
				this.field1613.method1201(var6, var10);
				return var10;
			}
		} else {
			return null;
		}
	}
}
