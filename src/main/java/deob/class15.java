package deob;

import java.awt.Font;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("bc")
public final class class15 {

	@ObfuscatedName("bc.a")
	public static final class88 field222 = class208.method1423(105, "Bitte versuchen Sie)1");

	@ObfuscatedName("bc.c")
	public static final int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("bc.e")
	public static class217 field226;

	@ObfuscatedName("bc.g")
	public static Font field228;

	@ObfuscatedName("bc.h")
	public static int field229;

	@ObfuscatedName("bc.l")
	public static final class88 field233 = class208.method1423(105, "null");

	@ObfuscatedName("bc.m")
	public static int[] field234;

	@ObfuscatedName("bc.a(ZLae;I)V")
	public static void method71(class6 arg0) {
		while (true) {
			class9 var1 = (class9) class89.field1694.method1610();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field124; var3++) {
				if (var1.field139[var3] != null) {
					if (var1.field139[var3].field3134 == 2) {
						var1.field132[var3] = -5;
					}
					if (var1.field139[var3].field3134 == 0) {
						var2 = true;
					}
				}
				if (var1.field138[var3] != null) {
					if (var1.field138[var3].field3134 == 2) {
						var1.field132[var3] = -6;
					}
					if (var1.field138[var3].field3134 == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.method30(56);
			arg0.method346(0);
			int var4 = arg0.field831;
			arg0.method338(var1.field136);
			for (int var5 = 0; var5 < var1.field124; var5++) {
				if (var1.field132[var5] == 0) {
					try {
						int var6 = var1.field128[var5];
						if (var6 == 0) {
							Field var7 = (Field) var1.field139[var5].field3129;
							int var8 = var7.getInt(null);
							arg0.method346(0);
							arg0.method338(var8);
						} else if (var6 == 1) {
							Field var11 = (Field) var1.field139[var5].field3129;
							var11.setInt(null, var1.field129[var5]);
							arg0.method346(0);
						} else if (var6 == 2) {
							Field var9 = (Field) var1.field139[var5].field3129;
							int var10 = var9.getModifiers();
							arg0.method346(0);
							arg0.method338(var10);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field138[var5].field3129;
							byte[][] var15 = var1.field131[var5];
							Object[] var16 = new Object[var15.length];
							for (int var17 = 0; var17 < var15.length; var17++) {
								ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
								var16[var17] = var18.readObject();
							}
							Object var19 = var14.invoke(null, var16);
							if (var19 == null) {
								arg0.method346(0);
							} else if (var19 instanceof Number) {
								arg0.method346(1);
								arg0.method328(((Number) var19).longValue());
							} else if (var19 instanceof class88) {
								arg0.method346(2);
								arg0.method336((class88) var19);
							} else {
								arg0.method346(4);
							}
						} else if (var6 == 4) {
							Method var12 = (Method) var1.field138[var5].field3129;
							int var13 = var12.getModifiers();
							arg0.method346(0);
							arg0.method338(var13);
						}
					} catch (ClassNotFoundException var20) {
						arg0.method346(-10);
					} catch (InvalidClassException var21) {
						arg0.method346(-11);
					} catch (StreamCorruptedException var22) {
						arg0.method346(-12);
					} catch (OptionalDataException var23) {
						arg0.method346(-13);
					} catch (IllegalAccessException var24) {
						arg0.method346(-14);
					} catch (IllegalArgumentException var25) {
						arg0.method346(-15);
					} catch (InvocationTargetException var26) {
						arg0.method346(-16);
					} catch (SecurityException var27) {
						arg0.method346(-17);
					} catch (IOException var28) {
						arg0.method346(-18);
					} catch (NullPointerException var29) {
						arg0.method346(-19);
					} catch (Exception var30) {
						arg0.method346(-20);
					} catch (Throwable var31) {
						arg0.method346(-21);
					}
				} else {
					arg0.method346(var1.field132[var5]);
				}
			}
			arg0.method345(var4);
			arg0.method341(arg0.field831 - var4);
			var1.method460();
		}
	}

	@ObfuscatedName("bc.a(Li;I)I")
	public static int method72(class88 arg0) {
		return arg0.method604() + 1;
	}

	@ObfuscatedName("bc.a(IIIIB)V")
	public static void method73(int arg0, int arg1, int arg2, int arg3) {
		for (class143 var4 = (class143) class66.field1196.method1610(); var4 != null; var4 = (class143) class66.field1196.method1619()) {
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
				if (var4.field2638 < var5 - 64 || class223.field4211 == 0 || var4.field2647 != arg3) {
					if (var4.field2644 != null) {
						class226.field4248.method1509(var4.field2644);
						var4.field2644 = null;
					}
					if (var4.field2626 != null) {
						class226.field4248.method1509(var4.field2626);
						var4.field2626 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = class223.field4211 * (var4.field2638 - var5) / var4.field2638;
					if (var4.field2644 != null) {
						var4.field2644.method1117(var6);
					} else if (var4.field2629 >= 0) {
						class38 var7 = class38.method252(class12.field172, var4.field2629, 0);
						if (var7 != null) {
							class213 var8 = var7.method253().method1453(class117.field2124);
							class162 var9 = class162.method1124(var8, var6);
							var9.method1119(-1);
							class226.field4248.method1506(var9);
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
						class38 var11 = class38.method252(class12.field172, var4.field2635[var10], 0);
						if (var11 != null) {
							class213 var12 = var11.method253().method1453(class117.field2124);
							class162 var13 = class162.method1124(var12, var6);
							var13.method1119(0);
							class226.field4248.method1506(var13);
							var4.field2628 = (int) ((double) (var4.field2640 - var4.field2645) * Math.random()) + var4.field2645;
							var4.field2626 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public static void method74() {
		class241.field4471.method670();
		class210.field3989.method670();
	}

	@ObfuscatedName("bc.a(IB)Lk;")
	public static class109 method75(int arg0) {
		class109 var1 = (class109) class241.field4471.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class37.field672.method939(class9.method50(arg0), class211.method1441(arg0));
		class109 var3 = new class109();
		if (var2 != null) {
			var3.method751(new class46(var2));
		}
		var3.method757();
		class241.field4471.method663((long) arg0, var3);
		return var3;
	}
}
