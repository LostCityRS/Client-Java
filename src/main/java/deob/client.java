package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

@ObfuscatedName("client")
public final class client extends class87 {

	@ObfuscatedName("client.bb")
	public static int field569 = -1;

	@ObfuscatedName("client.cb")
	public static final class88 field570 = class208.method1423(105, "underlay)3dat");

	@ObfuscatedName("client.T")
	public static final class88 field561 = class208.method1423(105, "titlebox");

	@ObfuscatedName("client.V")
	public static int field563 = 0;

	@ObfuscatedName("client.Z")
	public static class144 field567;

	@ObfuscatedName("client.a(IIIIIII)V")
	public static void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (class67.field1207 <= arg5 - arg0 && class12.field183 >= arg5 + arg0 && class49.field919 <= arg3 - arg0 && class18.field279 >= arg0 + arg3) {
			class9.method46(arg1, arg5, arg2, arg0, arg3, arg4);
		} else {
			class122.method827(arg1, arg3, arg2, arg0, arg5, arg4);
		}
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 7) {
				class114.method776(false);
			}
			class28.field470 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				class115.field2071 = 0;
			} else if (arg0[1].equals("office")) {
				class115.field2071 = 1;
			} else if (arg0[1].equals("local")) {
				class115.field2071 = 2;
			} else {
				class114.method776(false);
			}
			if (arg0[2].equals("live")) {
				class139.field2584 = 0;
			} else if (arg0[2].equals("rc")) {
				class139.field2584 = 1;
			} else if (arg0[2].equals("wip")) {
				class139.field2584 = 2;
			} else {
				class114.method776(false);
			}
			if (arg0[3].equals("lowmem")) {
				class64.method452();
			} else if (arg0[3].equals("highmem")) {
				class64.method451();
			} else {
				class114.method776(false);
			}
			if (arg0[4].equals("free")) {
				class67.field1215 = false;
			} else if (arg0[4].equals("members")) {
				class67.field1215 = true;
			} else {
				class114.method776(false);
			}
			if (arg0[5].equals("english")) {
				class126.field2348 = 0;
			} else if (arg0[5].equals("german")) {
				class112.method767();
				class126.field2348 = 1;
			} else {
				class114.method776(false);
			}
			if (arg0[6].equals("game0")) {
				class47.field884 = 0;
			} else if (arg0[6].equals("game1")) {
				class47.field884 = 1;
			} else {
				class114.method776(false);
			}
			class4.field46 = 0;
			class218.field4134 = class174.field3453;
			class95.field1760 = "127.0.0.1";
			client var1 = new client();
			var1.method586(27, 503, 765, 500, class139.field2584 + 32, -11124, "runescape");
			class201.field3832.setLocation(40, 40);
		} catch (Exception var3) {
			class221.method1488(null, var3);
		}
	}

	@ObfuscatedName("client.a(Li;ZI)V")
	public static void method221(class88 arg0, boolean arg1) {
		int var2 = class3.field30.method156(arg0, 250);
		int var3 = class3.field30.method163(arg0, 250) * 13;
		class72.method478(6, 6, var2 + 4 + 4, 4 + 4 + var3, 0);
		class72.method476(6, 6, var2 + 4 + 4, 4 + 4 + var3, 16777215);
		class3.field30.method153(arg0, 10, 10, var2, var3, 16777215, -1, 1, 1, 0);
		class126.method861(var3 + 4 + 4, var2 - -4 + 4, 6, 6);
		if (!arg1) {
			class129.method874(10, var3, var2, 10);
			return;
		}
		Canvas var4 = class154.field2975;
		try {
			Graphics var5 = var4.getGraphics();
			class202.field3852.method246(var5);
		} catch (Exception var6) {
			var4.repaint();
		}
	}

	@ObfuscatedName("client.a(IIIIII)Z")
	public static boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var8 = arg1; var8 <= arg2; var8++) {
				for (int var9 = arg3; var9 <= arg4; var9++) {
					if (class238.field4429[arg0][var8][var9] == -class143.field2627) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = class62.field1137[arg0][arg1][arg3] + arg5;
			if (!class104.method718(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!class104.method718(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!class104.method718(var10, var12, var14)) {
				return false;
			} else if (class104.method718(var13, var12, var14)) {
				return true;
			} else {
				return false;
			}
		} else if (class239.method1581(arg0, arg1, arg3)) {
			int var6 = arg1 << 7;
			int var7 = arg3 << 7;
			return class104.method718(var6 + 1, class62.field1137[arg0][arg1][arg3] + arg5, var7 + 1) && class104.method718(var6 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class104.method718(var6 + 128 - 1, class62.field1137[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class104.method718(var6 + 1, class62.field1137[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public static void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = class156.method1058(class49.field919, class18.field279, arg1);
		int var6 = class156.method1058(class49.field919, class18.field279, arg2);
		int var7 = class156.method1058(class67.field1207, class12.field183, arg3);
		int var8 = class156.method1058(class67.field1207, class12.field183, arg4);
		for (int var9 = var5; var9 <= var6; var9++) {
			class230.method1534(var7, arg0, var8, class3.field42[var9]);
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void method213() {
		if (class151.field2938 >= 4) {
			this.method588("js5crc");
			class229.field4284 = 1000;
			return;
		}
		if (class77.field1389 >= 4) {
			if (class229.field4284 <= 5) {
				this.method588("js5io");
				class229.field4284 = 1000;
				return;
			}
			class77.field1389 = 3;
			class164.field3138 = 3000;
		}
		if (class164.field3138-- > 0) {
			return;
		}
		try {
			if (class244.field4493 == 0) {
				class62.field1151 = class126.field2324.method1288(class95.field1760, class168.field3246);
				class244.field4493++;
			}
			if (class244.field4493 == 1) {
				if (class62.field1151.field3134 == 2) {
					this.method217(-1);
					return;
				}
				if (class62.field1151.field3134 == 1) {
					class244.field4493++;
				}
			}
			if (class244.field4493 == 2) {
				class190.field3680 = new class137((Socket) class62.field1151.field3129, class126.field2324);
				class46 var1 = new class46(5);
				var1.method346(15);
				var1.method338(500);
				class190.field3680.method911(5, var1.field842);
				class244.field4493++;
				class101.field1840 = class206.method1418();
			}
			if (class244.field4493 == 3) {
				if (class229.field4284 <= 5 || class190.field3680.method909() > 0) {
					int var2 = class190.field3680.method916();
					if (var2 != 0) {
						this.method217(var2);
						return;
					}
					class244.field4493++;
				} else if (class206.method1418() - class101.field1840 > 30000L) {
					this.method217(-2);
					return;
				}
			}
			if (class244.field4493 == 4) {
				class80.method529(class229.field4284 > 20, class190.field3680);
				class244.field4493 = 0;
				class119.field2159 = 0;
				class62.field1151 = null;
				class190.field3680 = null;
			}
		} catch (IOException var3) {
			this.method217(-3);
		}
	}

	@ObfuscatedName("client.b(I)V")
	@Override
	public void method214() {
		class117.field2108 = class120.field2192 = class7.field108 = class109.field1968 = new short[256];
		if (class47.field884 == 1) {
			class7.field96 = class99.field1810;
			class87.field1596 = class202.field3850;
			class146.field2750 = class70.field1265;
			class14.field219 = class202.field3853;
		} else {
			class14.field219 = class208.field3955;
			class146.field2750 = class88.field1601;
			class7.field96 = class217.field4062;
			class87.field1596 = class141.field2611;
		}
		class220.field4156 = class115.field2071 == 0 ? 43594 : class28.field470 + 40000;
		class49.field911 = class115.field2071 == 0 ? 443 : class28.field470 + 50000;
		class168.field3246 = class220.field4156;
		class204.method1401();
		class143.method935(class154.field2975);
		class109.method748(class154.field2975);
		class167.field3222 = class35.method235();
		if (class167.field3222 != null) {
			class167.field3222.method173(class154.field2975);
		}
		class52.field941 = class181.field3579;
		try {
			if (class126.field2324.field3590 != null) {
				class18.field299 = new class119(class126.field2324.field3590, 5200, 0);
				for (int var1 = 0; var1 < 27; var1++) {
					class246.field4504[var1] = new class119(class126.field2324.field3584[var1], 6000, 0);
				}
				class104.field1892 = new class119(class126.field2324.field3582, 6000, 0);
				class167.field3223 = new class222(255, class18.field299, class104.field1892, 500000);
				class175.field3529 = new class119(class126.field2324.field3588, 24, 0);
				class126.field2324.field3584 = null;
				class126.field2324.field3582 = null;
				class126.field2324.field3588 = null;
				class126.field2324.field3590 = null;
			}
		} catch (IOException var2) {
			class104.field1892 = null;
			class18.field299 = null;
			class175.field3529 = null;
			class167.field3223 = null;
		}
		class147.field2752 = class132.field2466;
		if (class115.field2071 != 0) {
			class148.field2768 = true;
		}
	}

	@Override
	public void init() {
		if (!this.method590()) {
			return;
		}
		class28.field470 = Integer.parseInt(this.getParameter("worldid"));
		class139.field2584 = Integer.parseInt(this.getParameter("modewhat"));
		class115.field2071 = Integer.parseInt(this.getParameter("modewhere"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			class64.method452();
		} else {
			class64.method451();
		}
		String var2 = this.getParameter("members");
		if (var2 != null && var2.equals("1")) {
			class67.field1215 = true;
		} else {
			class67.field1215 = false;
		}
		String var3 = this.getParameter("lang");
		if (var3 != null && var3.equals("1")) {
			class112.method767();
			class126.field2348 = 1;
		}
		String var4 = this.getParameter("game");
		if (var4 != null && var4.equals("1")) {
			class47.field884 = 1;
		} else {
			class47.field884 = 0;
		}
		try {
			class70.field1281 = Integer.parseInt(this.getParameter("js"));
			class143.field2657 = Integer.parseInt(this.getParameter("plug"));
			class4.field46 = Integer.parseInt(this.getParameter("affid"));
		} catch (Exception var5) {
		}
		class218.field4134 = class109.field1994.method608(this);
		if (class218.field4134 == null) {
			class218.field4134 = class174.field3453;
		}
		class95.field1760 = this.getCodeBase().getHost();
		this.method593(class139.field2584 + 32);
	}

	@ObfuscatedName("client.b(II)V")
	public void method217(int arg0) {
		class62.field1151 = null;
		class244.field4493 = 0;
		class190.field3680 = null;
		class119.field2159++;
		if (class168.field3246 == class220.field4156) {
			class168.field3246 = class49.field911;
		} else {
			class168.field3246 = class220.field4156;
		}
		if (class119.field2159 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (class229.field4284 > 5) {
				class164.field3138 = 3000;
			} else {
				this.method588("js5connect_full");
				class229.field4284 = 1000;
			}
		} else if (class119.field2159 >= 2 && arg0 == 6) {
			this.method588("js5connect_outofdate");
			class229.field4284 = 1000;
		} else if (class119.field2159 >= 4) {
			if (class229.field4284 <= 5) {
				this.method588("js5connect");
				class229.field4284 = 1000;
			} else {
				class164.field3138 = 3000;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void method218() {
		if (class219.field4143 != null) {
			class219.field4143.field717 = false;
		}
		class219.field4143 = null;
		if (class33.field556 != null) {
			class33.field556.method917();
			class33.field556 = null;
		}
		class120.method819(class154.field2975);
		class116.method790(class154.field2975);
		if (class167.field3222 != null) {
			class167.field3222.method177(class154.field2975);
		}
		class146.method975();
		class47.method362();
		class167.field3222 = null;
		if (class27.field458 != null) {
			class27.field458.method402();
		}
		if (class114.field2056 != null) {
			class114.field2056.method402();
		}
		class45.method290();
		class236.method1564();
		try {
			if (class18.field299 != null) {
				class18.field299.method817();
			}
			if (class246.field4504 != null) {
				for (int var1 = 0; var1 < class246.field4504.length; var1++) {
					if (class246.field4504[var1] != null) {
						class246.field4504[var1].method817();
					}
				}
			}
			if (class104.field1892 != null) {
				class104.field1892.method817();
			}
			if (class175.field3529 != null) {
				class175.field3529.method817();
			}
		} catch (IOException var2) {
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void method219() {
		if (class32.field519 == 0) {
			Runtime var1 = Runtime.getRuntime();
			int var2 = (int) ((var1.totalMemory() - var1.freeMemory()) / 1024L);
			long var3 = class206.method1418();
			if (class1.field10 == 0L) {
				class1.field10 = var3;
			}
			if (var2 > 16384 && var3 - class1.field10 < 5000L) {
				if (var3 - class175.field3519 > 1000L) {
					System.gc();
					class175.field3519 = var3;
				}
				class6.field83 = 5;
				class209.field3963 = class58.field1093;
			} else {
				class32.field519 = 10;
				class6.field83 = 5;
				class209.field3963 = class177.field3549;
			}
		} else if (class32.field519 == 10) {
			class179.method1277();
			for (int var5 = 0; var5 < 4; var5++) {
				class166.field3200[var5] = new class89(104, 104);
			}
			class6.field83 = 10;
			class209.field3963 = class10.field144;
			class32.field519 = 30;
		} else if (class32.field519 == 30) {
			class67.field1204 = class98.method684(0, true, true, false);
			class223.field4201 = class98.method684(1, true, true, false);
			class85.field1546 = class98.method684(2, true, false, true);
			class89.field1670 = class98.method684(3, true, true, false);
			class12.field172 = class98.method684(4, true, true, false);
			class27.field451 = class98.method684(5, true, true, true);
			class99.field1814 = class98.method684(6, false, true, true);
			class233.field4365 = class98.method684(7, true, true, false);
			class226.field4243 = class98.method684(8, true, true, false);
			class66.field1193 = class98.method684(9, true, true, false);
			class9.field137 = class98.method684(10, true, true, false);
			class133.field2486 = class98.method684(11, true, true, false);
			class18.field300 = class98.method684(12, true, true, false);
			class98.field1793 = class98.method684(13, true, true, false);
			class18.field280 = class98.method684(14, false, true, false);
			class147.field2760 = class98.method684(15, true, true, false);
			class109.field2004 = class98.method684(16, true, true, false);
			class190.field3672 = class98.method684(17, true, true, false);
			class161.field3113 = class98.method684(18, true, true, false);
			class248.field4550 = class98.method684(19, true, true, false);
			class196.field3771 = class98.method684(20, true, true, false);
			class17.field274 = class98.method684(21, true, true, false);
			class238.field4431 = class98.method684(22, true, true, false);
			class130.field2440 = class98.method684(23, true, true, true);
			class20.field321 = class98.method684(24, true, true, false);
			class203.field3870 = class98.method684(25, true, true, false);
			class155.field2994 = class98.method684(26, true, true, true);
			class32.field519 = 40;
			class6.field83 = 15;
			class209.field3963 = class68.field1251;
		} else if (class32.field519 == 40) {
			int var6 = class67.field1204.method115() * 4 / 100;
			int var7 = var6 + class223.field4201.method115() * 4 / 100;
			int var8 = var7 + class85.field1546.method115() / 100;
			int var9 = var8 + class89.field1670.method115() * 2 / 100;
			int var10 = var9 + class12.field172.method115() * 6 / 100;
			int var11 = var10 + class27.field451.method115() * 4 / 100;
			int var12 = var11 + class99.field1814.method115() * 2 / 100;
			int var13 = var12 + class233.field4365.method115() * 50 / 100;
			int var14 = var13 + class226.field4243.method115() * 2 / 100;
			int var15 = var14 + class66.field1193.method115() * 2 / 100;
			int var16 = var15 + class9.field137.method115() * 2 / 100;
			int var17 = var16 + class133.field2486.method115() * 2 / 100;
			int var18 = var17 + class18.field300.method115() * 2 / 100;
			int var19 = var18 + class98.field1793.method115() * 2 / 100;
			int var20 = var19 + class18.field280.method115() * 2 / 100;
			int var21 = var20 + class147.field2760.method115() * 2 / 100;
			int var22 = var21 + class109.field2004.method115() / 100;
			int var23 = var22 + class190.field3672.method115() / 100;
			int var24 = var23 + class161.field3113.method115() / 100;
			int var25 = var24 + class248.field4550.method115() / 100;
			int var26 = var25 + class196.field3771.method115() / 100;
			int var27 = var26 + class17.field274.method115() / 100;
			int var28 = var27 + class238.field4431.method115() / 100;
			int var29 = var28 + class130.field2440.method115() / 100;
			int var30 = var29 + class20.field321.method115() / 100;
			int var31 = var30 + class203.field3870.method115() / 100;
			int var32 = var31 + class155.field2994.method115() / 100;
			if (var32 == 100) {
				class6.field83 = 20;
				class209.field3963 = class247.field4515;
				class152.method1038(class99.field1814, class9.field137, class226.field4243);
				class32.field519 = 45;
			} else {
				if (var32 != 0) {
					class209.field3963 = class166.method1140(new class88[] { class14.field212, class170.method1212(var32), class149.field2895 });
				}
				class6.field83 = 20;
			}
		} else if (class32.field519 == 45) {
			class44.method284(!class245.field4497);
			class170 var33 = new class170();
			var33.method1209();
			class27.field458 = class220.method1483(0, class154.field2975, class126.field2324, 22050);
			class27.field458.method410(var33);
			class165.method1134(class18.field280, var33, class12.field172, class147.field2760);
			class114.field2056 = class220.method1483(1, class154.field2975, class126.field2324, 2048);
			class226.field4248 = new class224();
			class114.field2056.method410(class226.field4248);
			class117.field2124 = new class179(22050, class11.field161);
			class32.field519 = 50;
			class209.field3963 = class31.field507;
			class6.field83 = 30;
		} else if (class32.field519 == 50) {
			int var34 = 0;
			if (class226.field4243.method944(class199.field3795)) {
				var34++;
			}
			if (class226.field4243.method944(class158.field3045)) {
				var34++;
			}
			if (class226.field4243.method944(class108.field1957)) {
				var34++;
			}
			if (class98.field1793.method944(class199.field3795)) {
				var34++;
			}
			if (class98.field1793.method944(class158.field3045)) {
				var34++;
			}
			if (class98.field1793.method944(class108.field1957)) {
				var34++;
			}
			if (var34 < 6) {
				class209.field3963 = class166.method1140(new class88[] { class115.field2076, class170.method1212(var34 * 100 / 6), class149.field2895 });
				class6.field83 = 35;
			} else {
				class6.field83 = 35;
				class32.field519 = 60;
				class209.field3963 = class154.field2986;
			}
		} else if (class32.field519 == 60) {
			int var35 = class46.method330(class9.field137, class226.field4243);
			int var36 = class104.method717();
			if (var35 < var36) {
				class209.field3963 = class166.method1140(new class88[] { class46.field817, class170.method1212(var35 * 100 / var36), class149.field2895 });
				class6.field83 = 40;
			} else {
				class6.field83 = 40;
				class209.field3963 = class99.field1812;
				class32.field519 = 65;
			}
		} else if (class32.field519 == 65) {
			class49.field917 = class60.method429(class98.field1793, class226.field4243, class174.field3453, class199.field3795);
			class154.field2966 = (class41) class49.field917;
			class3.field30 = class60.method429(class98.field1793, class226.field4243, class174.field3453, class158.field3045);
			class54.field1011 = class60.method429(class98.field1793, class226.field4243, class174.field3453, class108.field1957);
			class6.field83 = 45;
			class209.field3963 = class2.field24;
			class131.method881(5);
			class32.field519 = 70;
		} else if (class32.field519 == 70) {
			class85.field1546.method962();
			int var37 = class85.field1546.method950();
			class109.field2004.method962();
			int var38 = var37 + class109.field2004.method950();
			class190.field3672.method962();
			int var39 = var38 + class190.field3672.method950();
			class161.field3113.method962();
			int var40 = var39 + class161.field3113.method950();
			class248.field4550.method962();
			int var41 = var40 + class248.field4550.method950();
			class196.field3771.method962();
			int var42 = var41 + class196.field3771.method950();
			class17.field274.method962();
			int var43 = var42 + class17.field274.method950();
			class238.field4431.method962();
			int var44 = var43 + class238.field4431.method950();
			class20.field321.method962();
			int var45 = var44 + class20.field321.method950();
			class203.field3870.method962();
			int var46 = var45 + class203.field3870.method950();
			if (var46 < 1000) {
				class209.field3963 = class166.method1140(new class88[] { class49.field918, class170.method1212(var46 / 10), class149.field2895 });
				class6.field83 = 50;
			} else {
				class98.method686(class85.field1546);
				class137.method910(class85.field1546);
				class135.method898(class85.field1546);
				class199.method1364(class233.field4365, class85.field1546);
				class27.method166(class109.field2004, class233.field4365, class67.field1215, class245.field4497);
				class47.method357(class161.field3113, class233.field4365);
				class189.method1318(class67.field1215, class248.field4550, class154.field2966, class233.field4365);
				class18.method91(class85.field1546);
				class45.method291(class196.field3771, class67.field1204, class223.field4201);
				class211.method1443(class233.field4365, class17.field274);
				class180.method1282(class238.field4431);
				class149.method1007(class85.field1546);
				class126.method856(class226.field4243, class89.field1670, class98.field1793, class233.field4365);
				class190.method1324(class85.field1546);
				class74.method502(class190.field3672);
				class153.method1045(class203.field3870, new class164(), class20.field321);
				class189.method1316(class20.field321, class203.field3870);
				class209.field3963 = class214.field4040;
				class6.field83 = 50;
				class206.method1416();
				class32.field519 = 80;
			}
		} else if (class32.field519 == 80) {
			int var47 = 0;
			if (class47.field887 == null) {
				class169 var48 = class9.method49(class59.field1106, class226.field4243, class174.field3453);
				if (var48 != null) {
					var48.method1178();
					class47.field887 = var48;
				}
			} else {
				var47++;
			}
			if (class240.field4460 == null) {
				class240.field4460 = class147.method981(class17.field260, class174.field3453, class226.field4243);
			} else {
				var47++;
			}
			if (class31.field505 == null) {
				class31.field505 = class3.method15(class1.field7, class174.field3453, class226.field4243);
			} else {
				var47++;
			}
			if (class145.field2718 == null) {
				class145.field2718 = class239.method1582(class144.field2664, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class238.field4425 == null) {
				class238.field4425 = class239.method1582(class98.field1796, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class130.field2428 == null) {
				class130.field2428 = class239.method1582(class106.field1921, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class176.field3543 == null) {
				class176.field3543 = class239.method1582(class233.field4367, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class227.field4257 == null) {
				class227.field4257 = class239.method1582(class142.field2622, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class113.field2041 == null) {
				class169[] var49 = class3.method15(class39.field690, class174.field3453, class226.field4243);
				if (var49 != null) {
					for (int var50 = 0; var50 < var49.length; var50++) {
						var49[var50].method1178();
					}
					class113.field2041 = var49;
				}
			} else {
				var47++;
			}
			if (class200.field3826 == null) {
				class200.field3826 = class221.method1490(class237.field4411, class174.field3453, class226.field4243);
			} else {
				var47++;
			}
			if (class154.field2982 == null) {
				class154.field2982 = class239.method1582(class227.field4251, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class35.field597 == null) {
				class35.field597 = class239.method1582(class115.field2075, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class7.field106 == null) {
				class7.field106 = class1.method2(class142.field2621, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			if (class34.field587 == null) {
				class34.field587 = class1.method2(class240.field4459, class226.field4243, class174.field3453);
			} else {
				var47++;
			}
			var47++;
			if (var47 < 15) {
				class209.field3963 = class166.method1140(new class88[] { class151.field2939, class170.method1212(var47 * 100 / 15), class149.field2895 });
				class6.field83 = 60;
			} else {
				int var51 = (int) (Math.random() * 21.0D) - 10;
				int var52 = (int) (Math.random() * 21.0D) - 10;
				int var53 = (int) (Math.random() * 21.0D) - 10;
				class49.field917.method149(class34.field587, null);
				class3.field30.method149(class34.field587, null);
				int var54 = (int) (Math.random() * 41.0D) - 20;
				class54.field1011.method149(class34.field587, null);
				for (int var55 = 0; var55 < class31.field505.length; var55++) {
					class31.field505[var55].method1158(var54 + var51, var54 + var53, var54 + var52);
				}
				class240.field4460[0].method1336(var51 + var54, var54 + var53, var54 + var52);
				class6.field83 = 60;
				class32.field519 = 90;
				class247.field4525 = class31.field505;
				class209.field3963 = class143.field2633;
			}
		} else if (class32.field519 == 90) {
			if (class155.field2994.method962()) {
				class68 var56 = new class68(class66.field1193, class155.field2994, class226.field4243, 20, class245.field4497);
				class173.method1236(var56);
				class173.method1224(0.7F);
				class209.field3963 = class138.field2569;
				class32.field519 = 110;
				class6.field83 = 70;
			} else {
				class209.field3963 = class166.method1140(new class88[] { class230.field4295, class170.method1212(class155.field2994.method950()), class149.field2895 });
				class6.field83 = 70;
			}
		} else if (class32.field519 == 110) {
			class219.field4143 = new class42();
			class126.field2324.method1287(2, class219.field4143, 10);
			class209.field3963 = class200.field3829;
			class6.field83 = 75;
			class32.field519 = 120;
		} else if (class32.field519 == 120) {
			if (class9.field137.method946(class154.field2973, class174.field3453)) {
				class214 var57 = new class214(class9.field137.method960(class154.field2973, class174.field3453));
				class14.method69(var57);
				class32.field519 = 130;
				class209.field3963 = class85.field1547;
				class6.field83 = 80;
			} else {
				class209.field3963 = class166.method1140(new class88[] { class211.field4007, class200.field3814 });
				class6.field83 = 80;
			}
		} else if (class32.field519 == 130) {
			if (!class89.field1670.method962()) {
				class209.field3963 = class166.method1140(new class88[] { class71.field1322, class170.method1212(class89.field1670.method950() * 4 / 5), class149.field2895 });
				class6.field83 = 85;
			} else if (!class18.field300.method962()) {
				class209.field3963 = class166.method1140(new class88[] { class71.field1322, class170.method1212(class18.field300.method950() / 6 + 80), class149.field2895 });
				class6.field83 = 85;
			} else if (class98.field1793.method962()) {
				class6.field83 = 100;
				class32.field519 = 140;
				class209.field3963 = class24.field392;
			} else {
				class209.field3963 = class166.method1140(new class88[] { class71.field1322, class170.method1212(class98.field1793.method950() / 20 + 96), class149.field2895 });
				class6.field83 = 85;
			}
		} else if (class32.field519 == 140) {
			class27.field451.method965(false);
			class99.field1814.method965(true);
			class226.field4243.method965(true);
			class98.field1793.method965(true);
			class9.field137.method965(true);
			class89.field1670.method965(true);
			class131.method881(10);
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void method220() {
		boolean var1 = false;
		boolean var2 = class142.method929();
		if (var2 && class110.field2012 && class27.field458 != null) {
			class27.field458.method401();
		}
		if (class53.field971) {
			var1 = true;
			class53.field971 = false;
		}
		if (class229.field4284 == 0) {
			class166.method1142(null, class209.field3963, var1, class6.field83);
		} else if (class229.field4284 == 5 || class229.field4284 == 10 || class229.field4284 == 20) {
			class188.method1310(class49.field917, class54.field1011);
		} else if (class229.field4284 == 25) {
			if (class203.field3861 == 1) {
				if (class196.field3754 > class146.field2751) {
					class146.field2751 = class196.field3754;
				}
				int var4 = (class146.field2751 - class196.field3754) * 50 / class146.field2751;
				method221(class166.method1140(new class88[] { class242.field4478, class31.field509, class170.method1212(var4), class14.field216 }), false);
			} else if (class203.field3861 == 2) {
				if (class113.field2045 > class143.field2652) {
					class143.field2652 = class113.field2045;
				}
				int var3 = (class143.field2652 - class113.field2045) * 50 / class143.field2652 + 50;
				method221(class166.method1140(new class88[] { class242.field4478, class31.field509, class170.method1212(var3), class14.field216 }), false);
			} else {
				method221(class242.field4478, false);
			}
		} else if (class229.field4284 == 30) {
			class245.method1605();
		} else if (class229.field4284 == 40) {
			method221(class166.method1140(new class88[] { class113.field2040, class142.field2618, class101.field1838 }), false);
		}
		Canvas var5 = class154.field2975;
		if (class229.field4284 == 30 && class134.field2503 == 0 && !var1) {
			try {
				Graphics var8 = var5.getGraphics();
				for (int var9 = 0; var9 < class206.field3923; var9++) {
					if (class211.field4005[var9]) {
						class202.field3852.method242(class80.field1447[var9], class133.field2485[var9], class132.field2471[var9], class81.field1455[var9], var8);
						class211.field4005[var9] = false;
					}
				}
			} catch (Exception var10) {
				var5.repaint();
			}
		} else if (class229.field4284 > 0) {
			try {
				Graphics var6 = var5.getGraphics();
				class202.field3852.method246(var6);
				for (int var7 = 0; var7 < class206.field3923; var7++) {
					class211.field4005[var7] = false;
				}
			} catch (Exception var11) {
				var5.repaint();
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	@Override
	public void method222() {
		class117.field2113++;
		if (class117.field2113 % 1000 == 1) {
			GregorianCalendar var1 = new GregorianCalendar();
			class27.field454 = var1.get(11) * 600 + var1.get(12) * 10 + var1.get(13) / 6;
			class70.field1259.setSeed((long) class27.field454);
		}
		this.method223();
		class45.method293();
		class22.method107();
		class219.method1479();
		class48.method366();
		class204.method1397();
		if (class167.field3222 != null) {
			int var2 = class167.field3222.method176();
			class90.field1708 = var2;
		}
		if (class229.field4284 == 0) {
			this.method219();
			class108.method738();
		} else if (class229.field4284 == 5) {
			class50.method376(this);
			this.method219();
			class108.method738();
		} else if (class229.field4284 == 10) {
			class50.method376(this);
		} else if (class229.field4284 == 20) {
			class50.method376(this);
			class176.method1261();
		} else if (class229.field4284 == 25) {
			class184.method1297();
		}
		if (class229.field4284 == 30) {
			class116.method789();
		} else if (class229.field4284 == 40) {
			class176.method1261();
			return;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public void method223() {
		if (class229.field4284 != 1000) {
			boolean var1 = class99.method687();
			if (!var1) {
				this.method213();
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void method225() {
	}
}
