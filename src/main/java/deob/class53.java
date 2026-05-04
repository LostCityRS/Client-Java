package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("eh")
public final class class53 implements KeyListener, FocusListener {

	@ObfuscatedName("eh.a")
	public static class174 field967 = null;

	@ObfuscatedName("eh.d")
	public static final class88 field970 = class208.method1423(105, "Apr");

	@ObfuscatedName("eh.e")
	public static volatile boolean field971 = true;

	@ObfuscatedName("eh.k")
	public static final class88 field977 = class208.method1423(105, "Jun");

	@ObfuscatedName("eh.l")
	public static final class88 field978 = class208.method1423(105, "Aug");

	@ObfuscatedName("eh.m")
	public static final class88 field979 = class208.method1423(105, ")1");

	@ObfuscatedName("eh.n")
	public static final class88 field980 = class208.method1423(105, "Sep");

	@ObfuscatedName("eh.o")
	public static final class88 field981 = class208.method1423(105, "Mar");

	@ObfuscatedName("eh.r")
	public static final class88 field984 = class208.method1423(105, "Please wait 5 minutes before trying again)3");

	@ObfuscatedName("eh.s")
	public static final class88 field985 = class208.method1423(105, "Dec");

	@ObfuscatedName("eh.t")
	public static final class88 field986 = class208.method1423(105, "This computers address has been blocked");

	@ObfuscatedName("eh.q")
	public static class88 field983 = field986;

	@ObfuscatedName("eh.u")
	public static final class88 field987 = class208.method1423(105, "May");

	@ObfuscatedName("eh.v")
	public static final class88 field988 = class208.method1423(105, "Jan");

	@ObfuscatedName("eh.w")
	public static final class88 field989 = class208.method1423(105, "Oct");

	@ObfuscatedName("eh.B")
	public static final short[] field994 = new short[500];

	@ObfuscatedName("eh.A")
	public static final class88 field993 = class208.method1423(105, "Fps:");

	@ObfuscatedName("eh.E")
	public static boolean field997 = false;

	@ObfuscatedName("eh.y")
	public static final class88 field991 = class208.method1423(105, "Nov");

	@ObfuscatedName("eh.C")
	public static final class88 field995 = class208.method1423(105, "Feb");

	@ObfuscatedName("eh.G")
	public static final int[] field999 = new int[1000];

	@ObfuscatedName("eh.D")
	public static final class88 field996 = class208.method1423(105, "Jul");

	@ObfuscatedName("eh.F")
	public static class88 field998 = field984;

	@ObfuscatedName("eh.I")
	public static final int[] field1001 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("eh.z")
	public static final class88[] field992 = new class88[] { field988, field995, field981, field970, field987, field977, field996, field978, field980, field989, field991, field985 };

	@ObfuscatedName("eh.x")
	public static class97 field990;

	@ObfuscatedName("eh.a(ILnb;BZII)V")
	public static void method388(class144 arg0, int arg1, int arg2) {
		class11.field159 = arg2;
		class158.field3039 = arg0;
		class228.field4268 = arg1;
		class172.field3343 = 10000;
		class122.field2230 = 1;
		class242.field4480 = 0;
		class17.field277 = false;
	}

	@ObfuscatedName("eh.a(ILq;)Z")
	public static boolean method389(class174 arg0) {
		if (arg0.field3439 == 205) {
			class105.field1910 = 250;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eh.a(IIIIIILnc;IJ)Z")
	public static boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			int var10 = arg1 * 128 + arg4 * 64;
			int var11 = arg2 * 128 + arg5 * 64;
			return class112.method768(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
		}
	}

	@ObfuscatedName("eh.a(IIIIIII)V")
	public static void method391(int arg0, int arg1, int arg2, int arg3) {
		class105.field1918 = 0;
		for (int var4 = -1; var4 < class55.field1041 + class55.field1027; var4++) {
			class218 var5;
			if (var4 == -1) {
				var5 = class240.field4456;
			} else if (var4 >= class55.field1027) {
				var5 = class225.field4223[class25.field402[var4 - class55.field1027]];
			} else {
				var5 = class244.field4491[class174.field3428[var4]];
			}
			if (var5 != null && var5.method287()) {
				if (var5 instanceof class191) {
					class126 var6 = ((class191) var5).field3682;
					if (var6.field2327 != null) {
						var6 = var6.method862();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (var4 >= class55.field1027) {
					class126 var12 = ((class191) var5).field3682;
					if (var12.field2327 != null) {
						var12 = var12.method862();
					}
					if (var12.field2326 >= 0 && class130.field2428.length > var12.field2326) {
						class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (class25.field401 > -1) {
							class130.field2428[var12.field2326].method1155(class25.field401 + arg0 - 12, class33.field541 + -30 + arg1);
						}
					}
					class118[] var13 = class64.field1171;
					for (int var14 = 0; var14 < var13.length; var14++) {
						class118 var15 = var13[var14];
						if (var15 != null && var15.field2139 == 1 && var15.field2146 == class25.field402[var4 - class55.field1027] && class117.field2113 % 20 < 10) {
							class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
							if (class25.field401 > -1) {
								class176.field3543[var15.field2137].method1155(class25.field401 + arg0 - 12, class33.field541 + arg1 - 28);
							}
						}
					}
				} else {
					int var7 = 30;
					class44 var8 = (class44) var5;
					if (var8.field756 != -1 || var8.field750 != -1) {
						class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (class25.field401 > -1) {
							if (var8.field756 != -1) {
								class238.field4425[var8.field756].method1155(class25.field401 + arg0 - 12, class33.field541 + -30 + arg1);
								var7 += 25;
							}
							if (var8.field750 != -1) {
								class130.field2428[var8.field750].method1155(arg0 + class25.field401 - 12, arg1 - -class33.field541 + -var7);
								var7 += 25;
							}
						}
					}
					if (var4 >= 0) {
						class118[] var9 = class64.field1171;
						for (int var10 = 0; var10 < var9.length; var10++) {
							class118 var11 = var9[var10];
							if (var11 != null && var11.field2139 == 10 && class174.field3428[var4] == var11.field2146) {
								class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
								if (class25.field401 > -1) {
									class176.field3543[var11.field2137].method1155(arg0 + class25.field401 - 12, arg1 - (-class33.field541 + var7));
								}
							}
						}
					}
				}
				if (var5.field4071 != null && (class55.field1027 <= var4 || class67.field1206 == 0 || class67.field1206 == 3 || class67.field1206 == 1 && class135.method901(((class44) var5).field766))) {
					class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475(), var5);
					if (class25.field401 > -1 && class207.field3925 > class105.field1918) {
						class207.field3931[class105.field1918] = class54.field1011.method158(var5.field4071) / 2;
						class207.field3929[class105.field1918] = class54.field1011.field416;
						class207.field3938[class105.field1918] = class25.field401;
						class207.field3940[class105.field1918] = class33.field541;
						class207.field3937[class105.field1918] = var5.field4083;
						class207.field3932[class105.field1918] = var5.field4138;
						class207.field3926[class105.field1918] = var5.field4112;
						class207.field3933[class105.field1918] = var5.field4071;
						class105.field1918++;
					}
				}
				if (var5.field4118 > class117.field2113) {
					class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
					if (class25.field401 > -1) {
						class72.method478(arg0 + class25.field401 - 15, class33.field541 + -3 + arg1, var5.field4109, 5, 65280);
						class72.method478(var5.field4109 + arg0 + class25.field401 - 15, arg1 + -3 + class33.field541, 30 - var5.field4109, 5, 16711680);
					}
				}
				for (int var16 = 0; var16 < 4; var16++) {
					if (class117.field2113 < var5.field4073[var16]) {
						class150.method1027(arg3 >> 1, arg2 >> 1, var5.method1475() / 2, var5);
						if (class25.field401 > -1) {
							if (var16 == 1) {
								class33.field541 -= 20;
							}
							if (var16 == 2) {
								class33.field541 -= 10;
								class25.field401 -= 15;
							}
							if (var16 == 3) {
								class33.field541 -= 10;
								class25.field401 += 15;
							}
							class145.field2718[var5.field4078[var16]].method1155(arg0 + class25.field401 - 12, arg1 + -12 + class33.field541);
							class49.field917.method141(class170.method1212(var5.field4131[var16]), arg0 + class25.field401 - 1, class33.field541 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var17 = 0; var17 < class105.field1918; var17++) {
			int var18 = class207.field3938[var17];
			int var19 = class207.field3940[var17];
			int var20 = class207.field3931[var17];
			boolean var21 = true;
			int var22 = class207.field3929[var17];
			while (var21) {
				var21 = false;
				for (int var23 = 0; var23 < var17; var23++) {
					if (class207.field3940[var23] - class207.field3929[var23] < var19 + 2 && var19 - var22 < class207.field3940[var23] + 2 && var18 - var20 < class207.field3938[var23] - -class207.field3931[var23] && class207.field3938[var23] - class207.field3931[var23] < var20 + var18 && var19 > class207.field3940[var23] - class207.field3929[var23]) {
						var19 = class207.field3940[var23] - class207.field3929[var23];
						var21 = true;
					}
				}
			}
			class25.field401 = class207.field3938[var17];
			class33.field541 = class207.field3940[var17] = var19;
			class88 var24 = class207.field3933[var17];
			if (class137.field2548 == 0) {
				int var25 = 16776960;
				if (class207.field3937[var17] < 6) {
					var25 = class200.field3812[class207.field3937[var17]];
				}
				if (class207.field3937[var17] == 6) {
					var25 = class210.field3990 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (class207.field3937[var17] == 7) {
					var25 = class210.field3990 % 20 >= 10 ? 65535 : 255;
				}
				if (class207.field3937[var17] == 8) {
					var25 = class210.field3990 % 20 < 10 ? 45056 : 8454016;
				}
				if (class207.field3937[var17] == 9) {
					int var26 = 150 - class207.field3926[var17];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16384000 + 16776960 - var26 * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}
				if (class207.field3937[var17] == 10) {
					int var27 = 150 - class207.field3926[var17];
					if (var27 < 50) {
						var25 = var27 * 5 + 16711680;
					} else if (var27 < 100) {
						var25 = 16711935 - (var27 - 50) * 327680;
					} else if (var27 < 150) {
						var25 = var27 * 327680 + 500 + 255 - var27 * 5 - 32768000;
					}
				}
				if (class207.field3937[var17] == 11) {
					int var28 = 150 - class207.field3926[var17];
					if (var28 < 50) {
						var25 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var25 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var25 = 16777215 - (var28 - 100) * 327680;
					}
				}
				if (class207.field3932[var17] == 0) {
					class54.field1011.method141(var24, arg0 + class25.field401, class33.field541 + arg1, var25, 0);
				}
				if (class207.field3932[var17] == 1) {
					class54.field1011.method144(var24, class25.field401 + arg0, class33.field541 + arg1, var25, class210.field3990);
				}
				if (class207.field3932[var17] == 2) {
					class54.field1011.method145(var24, arg0 + class25.field401, arg1 - -class33.field541, var25, class210.field3990);
				}
				if (class207.field3932[var17] == 3) {
					class54.field1011.method164(var24, class25.field401 + arg0, arg1 + class33.field541, var25, class210.field3990, 150 - class207.field3926[var17]);
				}
				if (class207.field3932[var17] == 4) {
					int var29 = (150 - class207.field3926[var17]) * (class54.field1011.method158(var24) + 100) / 150;
					class72.method493(arg0 + class25.field401 - 50, arg1, arg0 + class25.field401 + 50, arg1 + arg2);
					class54.field1011.method154(var24, arg0 + class25.field401 + 50 - var29, arg1 - -class33.field541, var25, 0);
					class72.method480(arg0, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (class207.field3932[var17] == 5) {
					int var30 = 0;
					int var31 = 150 - class207.field3926[var17];
					if (var31 < 25) {
						var30 = var31 - 25;
					} else if (var31 > 125) {
						var30 = var31 - 125;
					}
					class72.method493(arg0, class33.field541 + arg1 - class54.field1011.field416 - 1, arg3 + arg0, class33.field541 + arg1 + 5);
					class54.field1011.method141(var24, arg0 + class25.field401, arg1 + (class33.field541 - -var30), var25, 0);
					class72.method480(arg0, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				class54.field1011.method141(var24, arg0 + class25.field401, arg1 + class33.field541, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("eh.a(IIBIIIIII)V")
	public static void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (class211.method1445(arg1)) {
			class179.field3564 = null;
			class165.method1131(class78.field1418[arg1], arg5, arg2, arg3, arg0, arg6, arg4, -1, arg7);
			if (class179.field3564 != null) {
				class165.method1131(class179.field3564, arg5, arg2, arg3, arg0, class94.field1756, class6.field77, -1412584499, arg7);
				class179.field3564 = null;
			}
		} else if (arg3 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				class225.field4228[var8] = true;
			}
		} else {
			class225.field4228[arg3] = true;
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		if (class166.field3188 != null) {
			class114.field2068 = 0;
			int var2 = arg0.getKeyCode();
			int var3;
			if (var2 >= 0 && class237.field4423.length > var2) {
				var3 = class237.field4423[var2] & 0xFFFFFF7F;
			} else {
				var3 = -1;
			}
			if (class32.field524 >= 0 && var3 >= 0) {
				class114.field2059[class32.field524] = ~var3;
				class32.field524 = class32.field524 + 1 & 0x7F;
				if (class148.field2801 == class32.field524) {
					class32.field524 = -1;
				}
			}
		}
		arg0.consume();
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		if (class166.field3188 == null) {
			return;
		}
		class114.field2068 = 0;
		int var2 = arg0.getKeyCode();
		int var3;
		if (var2 >= 0 && class237.field4423.length > var2) {
			var3 = class237.field4423[var2];
			if ((var3 & 0x80) != 0) {
				var3 = -1;
			}
		} else {
			var3 = -1;
		}
		if (class32.field524 >= 0 && var3 >= 0) {
			class114.field2059[class32.field524] = var3;
			class32.field524 = class32.field524 + 1 & 0x7F;
			if (class32.field524 == class148.field2801) {
				class32.field524 = -1;
			}
		}
		if (var3 >= 0) {
			int var4 = class191.field3681 + 1 & 0x7F;
			if (var4 != class203.field3858) {
				class174.field3438[class191.field3681] = var3;
				class105.field1908[class191.field3681] = -1;
				class191.field3681 = var4;
			}
		}
		int var5 = arg0.getModifiers();
		if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class166.field3188 != null) {
			class32.field524 = -1;
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		if (class166.field3188 != null) {
			int var2 = class66.method455(arg0);
			if (var2 >= 0) {
				int var3 = class191.field3681 + 1 & 0x7F;
				if (class203.field3858 != var3) {
					class174.field3438[class191.field3681] = -1;
					class105.field1908[class191.field3681] = var2;
					class191.field3681 = var3;
				}
			}
		}
		arg0.consume();
	}
}
