package deob;

import java.math.BigInteger;

@ObfuscatedName("ve")
public final class class151 {

	@ObfuscatedName("ve.b")
	public static BigInteger field3453 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("ve.c")
	public static class30 field3454;

	@ObfuscatedName("ve.d")
	public final class13 field3455 = new class13();

	@ObfuscatedName("ve.e")
	public static class32 field3456 = class73.method593(")4l", true);

	@ObfuscatedName("ve.j")
	public static class32 field3461 = class73.method593("b12_full", true);

	@ObfuscatedName("ve.k")
	public static class32 field3462 = class73.method593("Loading textures )2 ", true);

	@ObfuscatedName("ve.l")
	public static class32 field3463 = field3473;

	@ObfuscatedName("ve.m")
	public static class32 field3464 = field3462;

	@ObfuscatedName("ve.n")
	public static String field3465;

	@ObfuscatedName("ve.o")
	public static class32 field3466 = class73.method593(" <col=ffff00>", true);

	@ObfuscatedName("ve.p")
	public static volatile int field3467 = 0;

	@ObfuscatedName("ve.q")
	public static boolean field3468 = false;

	@ObfuscatedName("ve.r")
	public static class32 field3469 = class73.method593(" weitere Optionen", true);

	@ObfuscatedName("ve.s")
	public static class32 field3470 = field3473;

	@ObfuscatedName("ve.t")
	public static class32 field3471 = class73.method593("Schrifts-=tze geladen)3", true);

	@ObfuscatedName("ve.u")
	public static int field3472 = 99;

	@ObfuscatedName("ve.v")
	public static class32 field3473 = class73.method593("cyan:", true);

	@ObfuscatedName("ve.a(Z)V")
	public static void method1169() {
		field3461 = null;
		field3453 = null;
		field3469 = null;
		field3454 = null;
		field3471 = null;
		field3462 = null;
		field3466 = null;
		field3465 = null;
		field3463 = null;
		field3473 = null;
		field3470 = null;
		field3464 = null;
		field3456 = null;
	}

	@ObfuscatedName("ve.b(B)V")
	public static void method1172() {
		if (class13.field221 == 0) {
			class159.field3657 = new class150(4, 104, 104, class70.field1630);
			for (int var0 = 0; var0 < 4; var0++) {
				class105.field2482[var0] = new class117(104, 104);
			}
			class142.field3252 = new class49(512, 512);
			class13.field221 = 20;
			class74.field1743 = class8.field155;
			class8.field142 = 5;
		} else if (class13.field221 == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 15 + 128;
				int var4 = var3 * 3 + 600;
				int var5 = class7.field113[var3];
				var1[var2] = var5 * var4 >> 16;
			}
			class150.method1127(var1);
			class8.field142 = 10;
			class74.field1743 = class83.field1939;
			class13.field221 = 30;
		} else if (class13.field221 == 30) {
			class92.field2124 = class132.method1007(0, true, false, true);
			class38.field923 = class132.method1007(1, true, false, true);
			class64.field1488 = class132.method1007(2, true, true, false);
			class66.field1532 = class132.method1007(3, true, false, true);
			class1.field6 = class132.method1007(4, true, false, true);
			class134.field3115 = class132.method1007(5, true, true, true);
			class124.field2887 = class132.method1007(6, false, true, true);
			class147.field3346 = class132.method1007(7, true, false, true);
			class30.field572 = class132.method1007(8, true, false, true);
			class82.field1920 = class132.method1007(9, true, false, true);
			class72.field1701 = class132.method1007(10, true, false, true);
			class98.field2268 = class132.method1007(11, true, false, true);
			class98.field2246 = class132.method1007(12, true, false, true);
			class157.field3596 = class132.method1007(13, true, true, false);
			class103.field2424 = class132.method1007(14, false, false, true);
			class146.field3317 = class132.method1007(15, true, false, true);
			class8.field142 = 20;
			class74.field1743 = class70.field1626;
			class13.field221 = 40;
		} else if (class13.field221 == 40) {
			int var6 = class92.field2124.method338() * 4 / 100;
			int var7 = var6 + class38.field923.method338() * 4 / 100;
			int var8 = var7 + class64.field1488.method338() * 2 / 100;
			int var9 = var8 + class66.field1532.method338() * 2 / 100;
			int var10 = var9 + class1.field6.method338() * 6 / 100;
			int var11 = var10 + class134.field3115.method338() * 4 / 100;
			int var12 = var11 + class124.field2887.method338() * 2 / 100;
			int var13 = var12 + class147.field3346.method338() * 60 / 100;
			int var14 = var13 + class30.field572.method338() * 2 / 100;
			int var15 = var14 + class82.field1920.method338() * 2 / 100;
			int var16 = var15 + class72.field1701.method338() * 2 / 100;
			int var17 = var16 + class98.field2268.method338() * 2 / 100;
			int var18 = var17 + class98.field2246.method338() * 2 / 100;
			int var19 = var18 + class157.field3596.method338() * 2 / 100;
			int var20 = var19 + class103.field2424.method338() * 2 / 100;
			int var21 = var20 + class146.field3317.method338() * 2 / 100;
			if (var21 == 100) {
				class74.field1743 = class105.field2485;
				class13.field221 = 45;
				class8.field142 = 30;
			} else {
				if (var21 != 0) {
					class74.field1743 = class52.method402(new class32[] { class54.field1274, class159.method1228(var21), class128.field2936 });
				}
				class8.field142 = 30;
			}
		} else if (class13.field221 == 45) {
			class13.method71(!class154.field3529);
			class15 var22 = new class15();
			var22.method86();
			class36.field744 = class64.method494(class154.field3516, 0, 22050, class107.field2539);
			class36.field744.method890(var22);
			class47.method349(class1.field6, class103.field2424, var22, class146.field3317);
			class29.field525 = class64.method494(class154.field3516, 1, 2048, class107.field2539);
			class37.field881 = new class116();
			class29.field525.method890(class37.field881);
			class130.field3007 = new class33(22050, class139.field3211);
			class13.field221 = 50;
			class8.field142 = 35;
			class74.field1743 = class57.field1326;
		} else if (class13.field221 == 50) {
			int var23 = 0;
			if (client.field392 == null) {
				client.field392 = class112.method879(class30.field572, class157.field3596, class77.field1786, class50.field1155);
			} else {
				var23++;
			}
			if (class121.field2876 == null) {
				class121.field2876 = class112.method879(class30.field572, class157.field3596, class77.field1786, class64.field1487);
			} else {
				var23++;
			}
			if (class38.field913 == null) {
				class38.field913 = class112.method879(class30.field572, class157.field3596, class77.field1786, field3461);
			} else {
				var23++;
			}
			if (var23 < 3) {
				class74.field1743 = class52.method402(new class32[] { class73.field1729, class159.method1228(var23 * 100 / 3), class128.field2936 });
				class8.field142 = 40;
			} else {
				class74.field1743 = class29.field528;
				class8.field142 = 40;
				class13.field221 = 60;
			}
		} else if (class13.field221 == 60) {
			int var24 = class142.method1074(class30.field572, class72.field1701);
			int var25 = class112.method883();
			if (var25 > var24) {
				class74.field1743 = class52.method402(new class32[] { class85.field1986, class159.method1228(var24 * 100 / var25), class128.field2936 });
				class8.field142 = 50;
			} else {
				class8.field142 = 50;
				class74.field1743 = class52.field1182;
				class54.method425(5);
				class13.field221 = 70;
			}
		} else if (class13.field221 == 70) {
			if (class64.field1488.method208()) {
				class89.method675(class64.field1488);
				class52.method409(class64.field1488);
				class139.method1044(class147.field3346, class64.field1488);
				class74.method599(class147.field3346, class154.field3529, class64.field1488);
				class136.method1034(class64.field1488, class147.field3346);
				class19.method134(class147.field3346, class64.field1488, class146.field3315, client.field392);
				class77.method617(class38.field923, class64.field1488, class92.field2124);
				class3.method11(class147.field3346, class64.field1488);
				class26.method185(class64.field1488);
				class139.method1045(class64.field1488);
				class85.method659(class30.field572, class147.field3346, class157.field3596, class66.field1532);
				class9.method55(class64.field1488);
				class98.method764(class64.field1488);
				class74.field1743 = class43.field1004;
				class8.field142 = 60;
				class13.field221 = 80;
			} else {
				class74.field1743 = class52.method402(new class32[] { class66.field1552, class159.method1228(class64.field1488.method343()), class128.field2936 });
				class8.field142 = 60;
			}
		} else if (class13.field221 == 80) {
			int var26 = 0;
			if (class3.field46 == null) {
				class3.field46 = class2.method8(class30.field572, class77.field1786, class29.field536);
			} else {
				var26++;
			}
			if (class48.field1137 == null) {
				class48.field1137 = class2.method8(class30.field572, class77.field1786, class3.field51);
			} else {
				var26++;
			}
			if (class62.field1434 == null) {
				class62.field1434 = class56.method443(class77.field1786, class23.field422, class30.field572);
			} else {
				var26++;
			}
			if (class111.field2601 == null) {
				class111.field2601 = class62.method474(class134.field3122, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class30.field587 == null) {
				class30.field587 = class62.method474(class31.field595, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class30.field578 == null) {
				class30.field578 = class62.method474(class100.field2315, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class9.field168 == null) {
				class9.field168 = class62.method474(class4.field64, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class131.field3019 == null) {
				class131.field3019 = class62.method474(class4.field69, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class97.field2233 == null) {
				class97.field2233 = class62.method474(class50.field1162, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class1.field2 == null) {
				class1.field2 = class62.method474(class52.field1178, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class28.field515 == null) {
				class28.field515 = class62.method474(class144.field3283, class30.field572, class77.field1786);
			} else {
				var26++;
			}
			if (class98.field2252 == null) {
				class98.field2252 = class56.method443(class77.field1786, class143.field3274, class30.field572);
			} else {
				var26++;
			}
			if (class132.field3036 == null) {
				class132.field3036 = class56.method443(class77.field1786, class39.field937, class30.field572);
			} else {
				var26++;
			}
			if (class20.field369 == null) {
				class20.field369 = class136.method1033(class77.field1786, class30.field572, class137.field3184);
			} else {
				var26++;
			}
			if (var26 < 14) {
				class74.field1743 = class52.method402(new class32[] { class63.field1459, class159.method1228(var26 * 100 / 14), class128.field2936 });
				class8.field142 = 70;
			} else {
				class99.field2296 = class132.field3036;
				int var27 = (int) (Math.random() * 21.0D) - 10;
				class48.field1137.method374();
				int var28 = (int) (Math.random() * 21.0D) - 10;
				int var29 = (int) (Math.random() * 21.0D) - 10;
				int var30 = (int) (Math.random() * 41.0D) - 20;
				for (int var31 = 0; var31 < class111.field2601.length; var31++) {
					class111.field2601[var31].method389(var30 + var27, var30 + var28, var29 + var30);
				}
				class62.field1434[0].method401(var30 + var27, var30 + var28, var29 + var30);
				class107.method864();
				class74.field1743 = class117.field2781;
				class8.field142 = 70;
				class13.field221 = 90;
			}
		} else if (class13.field221 == 90) {
			if (class82.field1920.method208()) {
				class140 var32 = new class140(class82.field1920, class30.field572, 20, 0.8D, class154.field3529 ? 64 : 128);
				class7.method41(var32);
				class7.method29(0.8D);
				class13.field221 = 110;
				class74.field1743 = class129.field2980;
				class8.field142 = 90;
			} else {
				class74.field1743 = class52.method402(new class32[] { field3464, class159.method1228(class82.field1920.method343()), class128.field2936 });
				class8.field142 = 90;
			}
		} else if (class13.field221 == 110) {
			class137.field3174 = new class132();
			class154.field3516.method175(10, class137.field3174, 105);
			class8.field142 = 94;
			class13.field221 = 120;
			class74.field1743 = class109.field2568;
		} else if (class13.field221 == 120) {
			if (class72.field1701.method210(class126.field2927, class77.field1786)) {
				class14 var33 = new class14(class72.field1701.method219(class126.field2927, class77.field1786));
				class129.method997(var33);
				class74.field1743 = class85.field1988;
				class8.field142 = 96;
				class13.field221 = 130;
			} else {
				class74.field1743 = class52.method402(new class32[] { class157.field3602, class38.field922 });
				class8.field142 = 96;
			}
		} else if (class13.field221 == 130) {
			if (!class66.field1532.method208()) {
				class74.field1743 = class52.method402(new class32[] { class9.field167, class159.method1228(class66.field1532.method343() * 4 / 5), class128.field2936 });
				class8.field142 = 100;
			} else if (!class98.field2246.method208()) {
				class74.field1743 = class52.method402(new class32[] { class9.field167, class159.method1228(class98.field2246.method343() / 6 + 80), class128.field2936 });
				class8.field142 = 100;
			} else if (class157.field3596.method208()) {
				class13.field221 = 140;
				class74.field1743 = class85.field1989;
				class8.field142 = 100;
			} else {
				class74.field1743 = class52.method402(new class32[] { class9.field167, class159.method1228(class157.field3596.method343() / 20 + 96), class128.field2936 });
				class8.field142 = 100;
			}
		} else if (class13.field221 == 140) {
			class54.method425(10);
		}
	}

	public class151() {
		this.field3455.field216 = this.field3455;
		this.field3455.field212 = this.field3455;
	}

	@ObfuscatedName("ve.a(BLbe;)V")
	public void method1168(class13 arg0) {
		if (arg0.field216 != null) {
			arg0.method68();
		}
		arg0.field216 = this.field3455;
		arg0.field212 = this.field3455.field212;
		arg0.field216.field212 = arg0;
		arg0.field212.field216 = arg0;
	}

	@ObfuscatedName("ve.a(B)Lbe;")
	public class13 method1170() {
		class13 var1 = this.field3455.field212;
		return this.field3455 == var1 ? null : var1;
	}

	@ObfuscatedName("ve.a(Lbe;I)V")
	public void method1171(class13 arg0) {
		if (arg0.field216 != null) {
			arg0.method68();
		}
		arg0.field212 = this.field3455;
		arg0.field216 = this.field3455.field216;
		arg0.field216.field212 = arg0;
		arg0.field212.field216 = arg0;
	}

	@ObfuscatedName("ve.a(I)Lbe;")
	public class13 method1173() {
		class13 var1 = this.field3455.field212;
		if (var1 == this.field3455) {
			return null;
		} else {
			var1.method68();
			return var1;
		}
	}
}
