package deob;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

@ObfuscatedName("client")
public final class client extends class82 {

	@ObfuscatedName("client.cb")
	public static int field388 = 0;

	@ObfuscatedName("client.gb")
	public static class96 field392;

	@ObfuscatedName("client.T")
	public static class32 field379 = class73.method593("Startseite auf (WSpielkonto wiederherstellen(W)3", true);

	@ObfuscatedName("client.R")
	public static int field377 = 0;

	@ObfuscatedName("client.W")
	public static class63 field382 = new class63(64);

	@ObfuscatedName("client.c(Z)V")
	public static void method146() {
		field382 = null;
		field379 = null;
		field392 = null;
	}

	@ObfuscatedName("client.a(IIIBIIII)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (class154.field3529 && class43.field989 != arg5) {
			return;
		}
		int var7 = 0;
		if (arg1 == 0) {
			var7 = class159.field3657.method1153(arg5, arg2, arg6);
		}
		if (arg1 == 1) {
			var7 = class159.field3657.method1131(arg5, arg2, arg6);
		}
		if (arg1 == 2) {
			var7 = class159.field3657.method1133(arg5, arg2, arg6);
		}
		if (arg1 == 3) {
			var7 = class159.field3657.method1134(arg5, arg2, arg6);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = class159.field3657.method1121(arg5, arg2, arg6, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg1 == 0) {
				class159.field3657.method1148(arg5, arg2, arg6);
				class53 var12 = class5.method22(var8);
				if (var12.field1235 != 0) {
					class105.field2482[arg5].method921(arg2, var10, var11, arg6, var12.field1219);
				}
			}
			if (arg1 == 1) {
				class159.field3657.method1124(arg5, arg2, arg6);
			}
			if (arg1 == 2) {
				class159.field3657.method1128(arg5, arg2, arg6);
				class53 var13 = class5.method22(var8);
				if (var13.field1222 + arg2 > 103 || arg6 + var13.field1222 > 103 || var13.field1233 + arg2 > 103 || arg6 + var13.field1233 > 103) {
					return;
				}
				if (var13.field1235 != 0) {
					class105.field2482[arg5].method925(arg2, var13.field1222, arg6, var13.field1219, var10, var13.field1233);
				}
			}
			if (arg1 == 3) {
				class159.field3657.method1136(arg5, arg2, arg6);
				class53 var14 = class5.method22(var8);
				if (var14.field1235 == 1) {
					class105.field2482[arg5].method916(arg6, arg2);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		int var15 = arg5;
		if (arg5 < 3 && (class3.field50[1][arg2][arg6] & 0x2) == 2) {
			var15 = arg5 + 1;
		}
		class66.method537(arg3, arg0, class159.field3657, arg6, var15, arg2, class105.field2482[arg5], arg5, arg4);
	}

	@ObfuscatedName("client.a(ILf;)Z")
	public static boolean method152(class36 arg0) {
		int var1 = arg0.field845;
		if (var1 == 205) {
			class4.field68 = 250;
			return true;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = var1 & 0x1;
			int var3 = (var1 - 300) / 2;
			class61.field1360.method229(var3, var2 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = var1 & 0x1;
			int var5 = (var1 - 314) / 2;
			class61.field1360.method231(var4 == 1, var5);
		}
		if (var1 == 324) {
			class61.field1360.method224(false);
		}
		if (var1 == 325) {
			class61.field1360.method224(true);
		}
		if (var1 == 326) {
			class44.field1026.method356(78);
			class61.field1360.method222(class44.field1026);
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 7) {
				class91.method717(10649);
			}
			class86.field2014 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				class70.field1646 = 0;
			} else if (arg0[1].equals("office")) {
				class70.field1646 = 1;
			} else if (arg0[1].equals("local")) {
				class70.field1646 = 2;
			} else {
				class91.method717(10649);
			}
			if (arg0[2].equals("live")) {
				class53.field1217 = 0;
			} else if (arg0[2].equals("rc")) {
				class53.field1217 = 1;
			} else if (arg0[2].equals("wip")) {
				class53.field1217 = 2;
			} else {
				class91.method717(10649);
			}
			if (arg0[3].equals("lowmem")) {
				class144.method1083();
			} else if (arg0[3].equals("highmem")) {
				class133.method1018();
			} else {
				class91.method717(10649);
			}
			if (arg0[4].equals("free")) {
				class146.field3315 = false;
			} else if (arg0[4].equals("members")) {
				class146.field3315 = true;
			} else {
				class91.method717(10649);
			}
			if (arg0[5].equals("english")) {
				class20.field371 = 0;
			} else if (arg0[5].equals("german")) {
				class103.method831();
				class20.field371 = 1;
				class77.field1784 = class27.field490;
			} else {
				class91.method717(10649);
			}
			if (arg0[6].equals("game0")) {
				class154.field3526 = 0;
			} else if (arg0[6].equals("game1")) {
				class154.field3526 = 1;
			} else {
				class91.method717(10649);
			}
			class151.field3465 = "127.0.0.1";
			client var1 = new client();
			var1.method640(16, 1, 468, "runescape", 765, 503, class53.field1217 + 32);
		} catch (Exception var3) {
			class110.method870(var3, null);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public static void method156(int arg0) {
		if (!class28.method192(arg0)) {
			return;
		}
		class36[] var1 = class79.field1825[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class36 var3 = var1[var2];
			if (var3 != null) {
				var3.field762 = 0;
				var3.field839 = 0;
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void method145() {
		class140.field3217++;
		this.method155();
		class61.method466();
		class158.method1221();
		class125.method980();
		class121.method956();
		class137.method1040();
		if (class102.field2401 != null) {
			int var1 = class102.field2401.method456();
			class72.field1695 = var1;
		}
		if (class134.field3114 == 0) {
			class151.method1172();
			class113.method886();
		} else if (class134.field3114 == 5) {
			class23.method165(this);
			class151.method1172();
			class113.method886();
		} else if (class134.field3114 == 10) {
			class23.method165(this);
		} else if (class134.field3114 == 20) {
			class23.method165(this);
			class43.method329();
		} else if (class134.field3114 == 25) {
			class118.method933();
		}
		if (class134.field3114 == 30) {
			class74.method600();
		} else if (class134.field3114 == 40) {
			class43.method329();
			return;
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void method147() {
		method146();
		class32.method239();
		class82.method648();
		class9.method56();
		class48.method362();
		class132.method1010();
		class66.method508();
		class8.method47();
		class44.method337();
		class152.method1185();
		class134.method1022();
		class111.method877();
		class47.method353();
		class150.method1159();
		class117.method918();
		class36.method303();
		class70.method580();
		class157.method1217();
		class156.method1198();
		class145.method1086();
		class37.method313();
		class114.method895();
		class33.method279();
		class31.method225();
		class149.method1106();
		class115.method898();
		class23.method163();
		class97.method759();
		class144.method1085();
		class146.method1095();
		class147.method1098();
		class1.method3();
		class63.method488();
		class101.method815();
		class104.method850();
		class56.method437();
		class159.method1225();
		class19.method133();
		class154.method1191();
		class45.method347();
		class103.method829();
		class26.method183();
		class3.method10();
		class118.method934();
		class75.method605();
		class158.method1223();
		class46.method348();
		class125.method982();
		class64.method492();
		class80.method635();
		class109.method867();
		class52.method404();
		class137.method1038();
		class86.method665();
		class30.method202();
		class15.method107();
		class68.method563();
		class5.method19();
		class11.method64();
		class102.method826();
		class27.method188();
		class20.method135();
		class105.method858();
		class151.method1169();
		class110.method873();
		class94.method748();
		class2.method5();
		class135.method1028();
		class141.method1064();
		class13.method70();
		class7.method30();
		class77.method614();
		class120.method943();
		class41.method326();
		class73.method594();
		class129.method995();
		class57.method452();
		class34.method290();
		class65.method496();
		class53.method417();
		class62.method480();
		class121.method957();
		class133.method1012();
		class4.method18();
		class61.method461();
		class139.method1046();
		class130.method1001();
		class99.method788();
		class140.method1051();
		class148.method1104();
		class14.method77();
		class28.method194();
		class119.method937();
		class113.method887();
		class107.method866();
		class98.method766();
		class143.method1078();
		class89.method673();
		class79.method629();
		class12.method67();
		class84.method654();
		class126.method986();
		class24.method171();
		class128.method990();
		class136.method1036();
		class38.method317();
		class17.method126();
		class106.method861();
		class39.method319();
		class112.method880();
		class54.method429();
		class124.method976();
		class81.method637();
		class43.method331();
		class131.method1006();
		class88.method670();
		class100.method796();
		class91.method718();
		class71.method587();
		class21.method140();
		class55.method433();
		class85.method662();
		class42.method328();
		class92.method727();
		class142.method1073();
		class122.method966();
		class83.method651();
		class50.method391();
		class72.method588();
		class93.method733();
		class76.method612();
		class74.method601();
		class29.method195();
	}

	@ObfuscatedName("client.h(I)V")
	public void method148() {
		if (field388 >= 4) {
			this.method649("js5crc");
			class134.field3114 = 1000;
			return;
		}
		if (class61.field1355 >= 4) {
			if (class134.field3114 <= 5) {
				this.method649("js5io");
				class134.field3114 = 1000;
				return;
			}
			class112.field2630 = 3000;
			class61.field1355 = 3;
		}
		if (class112.field2630-- > 0) {
			return;
		}
		try {
			if (class137.field3178 == 0) {
				class53.field1214 = class154.field3516.method181(class151.field3465, class39.field940);
				class137.field3178++;
			}
			if (class137.field3178 == 1) {
				if (class53.field1214.field355 == 2) {
					this.method151(-1);
					return;
				}
				if (class53.field1214.field355 == 1) {
					class137.field3178++;
				}
			}
			if (class137.field3178 == 2) {
				class65.field1511 = new class8((Socket) class53.field1214.field352, class154.field3516);
				class66 var1 = new class66(5);
				var1.method514(15);
				var1.method530(468);
				class65.field1511.method49(var1.field1586, 5);
				class137.field3178++;
				class66.field1569 = class52.method407();
			}
			if (class137.field3178 == 3) {
				if (class134.field3114 <= 5 || class65.field1511.method51() > 0) {
					int var2 = class65.field1511.method46();
					if (var2 != 0) {
						this.method151(var2);
						return;
					}
					class137.field3178++;
				} else if (class52.method407() - class66.field1569 > 30000L) {
					this.method151(-2);
					return;
				}
			}
			if (class137.field3178 == 4) {
				class135.method1027(class65.field1511, class134.field3114 > 20);
				class137.field3178 = 0;
				class65.field1511 = null;
				class48.field1131 = 0;
				class53.field1214 = null;
			}
		} catch (IOException var3) {
			this.method151(-3);
		}
	}

	@ObfuscatedName("client.g(I)V")
	@Override
	public void method150() {
		boolean var1 = class8.method53();
		if (var1 && class112.field2621 && class36.field744 != null) {
			class36.field744.method894();
		}
		if (class158.field3619) {
			class17.method131(class107.field2539);
			class126.method987(class107.field2539);
			if (class102.field2401 != null) {
				class102.field2401.method454(class107.field2539);
			}
			this.method645();
			class52.method403(class107.field2539);
			class128.method989(class107.field2539);
			if (class102.field2401 != null) {
				class102.field2401.method455(class107.field2539);
			}
		}
		if (class134.field3114 == 0) {
			class137.method1041(class74.field1743, null, class8.field142);
		} else if (class134.field3114 == 5) {
			class159.method1226(field392, class38.field913);
		} else if (class134.field3114 == 10) {
			class159.method1226(field392, class38.field913);
		} else if (class134.field3114 == 20) {
			class159.method1226(field392, class38.field913);
		} else if (class134.field3114 == 25) {
			if (class119.field2839 == 1) {
				if (class53.field1208 < class37.field879) {
					class53.field1208 = class37.field879;
				}
				int var3 = (class53.field1208 - class37.field879) * 50 / class53.field1208;
				class14.method72(class52.method402(new class32[] { class48.field1135, class115.field2692, class159.method1228(var3), class1.field14 }), false);
			} else if (class119.field2839 == 2) {
				if (class152.field3487 > class37.field883) {
					class37.field883 = class152.field3487;
				}
				int var2 = (class37.field883 - class152.field3487) * 50 / class37.field883 + 50;
				class14.method72(class52.method402(new class32[] { class48.field1135, class115.field2692, class159.method1228(var2), class1.field14 }), false);
			} else {
				class14.method72(class48.field1135, false);
			}
		} else if (class134.field3114 == 30) {
			class61.method462();
		} else if (class134.field3114 == 40) {
			class14.method72(class52.method402(new class32[] { class15.field250, class154.field3538, class86.field2007 }), false);
		}
		if (class134.field3114 == 30 && class92.field2116 == 0 && !class1.field3) {
			try {
				Graphics var4 = class107.field2539.getGraphics();
				for (int var5 = 0; var5 < class133.field3081; var5++) {
					if (class81.field1863[var5]) {
						class50.field1157.method124(var4, class28.field512[var5], class20.field366[var5], class144.field3287[var5], class124.field2892[var5]);
						class81.field1863[var5] = false;
					}
				}
			} catch (Exception var8) {
				class107.field2539.repaint();
			}
		} else if (class134.field3114 > 0) {
			try {
				Graphics var6 = class107.field2539.getGraphics();
				class50.field1157.method122(var6);
				class1.field3 = false;
				for (int var7 = 0; var7 < class133.field3081; var7++) {
					class81.field1863[var7] = false;
				}
			} catch (Exception var9) {
				class107.field2539.repaint();
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public void method151(int arg0) {
		if (class26.field473 == class39.field940) {
			class39.field940 = class13.field223;
		} else {
			class39.field940 = class26.field473;
		}
		class48.field1131++;
		class137.field3178 = 0;
		class53.field1214 = null;
		class65.field1511 = null;
		if (class48.field1131 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (class134.field3114 <= 5) {
				this.method649("js5connect_full");
				class134.field3114 = 1000;
			} else {
				class112.field2630 = 3000;
			}
		} else if (class48.field1131 >= 2 && arg0 == 6) {
			this.method649("js5connect_outofdate");
			class134.field3114 = 1000;
		} else if (class48.field1131 >= 4) {
			if (class134.field3114 > 5) {
				class112.field2630 = 3000;
			} else {
				this.method649("js5connect");
				class134.field3114 = 1000;
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	@Override
	public void method153() {
		if (class137.field3174 != null) {
			class137.field3174.field3022 = false;
		}
		class137.field3174 = null;
		if (class143.field3273 != null) {
			class143.field3273.method52();
			class143.field3273 = null;
		}
		class132.method1009();
		class106.method860();
		class102.field2401 = null;
		if (class36.field744 != null) {
			class36.field744.method888();
		}
		if (class29.field525 != null) {
			class29.field525.method888();
		}
		class41.method324();
		class63.method489();
		try {
			if (class44.field1032 != null) {
				class44.field1032.method1179();
			}
			if (class118.field2832 != null) {
				for (int var1 = 0; var1 < class118.field2832.length; var1++) {
					if (class118.field2832[var1] != null) {
						class118.field2832[var1].method1179();
					}
				}
			}
			if (class152.field3500 != null) {
				class152.field3500.method1179();
			}
			if (class133.field3047 != null) {
				class133.field3047.method1179();
			}
		} catch (IOException var2) {
		}
	}

	@ObfuscatedName("client.a(B)V")
	@Override
	public void method154() {
		class13.field223 = class70.field1646 == 0 ? 443 : class86.field2014 + 50000;
		if (class154.field3526 == 1) {
			class106.field2505 = class54.field1280;
			class140.field3218 = class159.field3653;
			class41.field950 = class84.field1977;
			class8.field141 = class66.field1553;
		} else {
			class106.field2505 = class152.field3489;
			class41.field950 = class83.field1942;
			class140.field3218 = class135.field3146;
			class8.field141 = class147.field3341;
		}
		class26.field473 = class70.field1646 == 0 ? 43594 : class86.field2014 + 40000;
		class39.field940 = class26.field473;
		class12.method66();
		class52.method403(class107.field2539);
		class128.method989(class107.field2539);
		class102.field2401 = class37.method314();
		if (class102.field2401 != null) {
			class102.field2401.method455(class107.field2539);
		}
		class70.field1647 = class25.field465;
		try {
			if (class154.field3516.field454 != null) {
				class44.field1032 = new class152(class154.field3516.field454, 5200, 0);
				for (int var1 = 0; var1 < 16; var1++) {
					class118.field2832[var1] = new class152(class154.field3516.field455[var1], 6000, 0);
				}
				class152.field3500 = new class152(class154.field3516.field460, 6000, 0);
				class132.field3032 = new class134(255, class44.field1032, class152.field3500, 500000);
				class133.field3047 = new class152(class154.field3516.field468, 24, 0);
				class154.field3516.field460 = null;
				class154.field3516.field454 = null;
				class154.field3516.field455 = null;
				class154.field3516.field468 = null;
			}
		} catch (IOException var2) {
			class44.field1032 = null;
			class132.field3032 = null;
			class152.field3500 = null;
			class133.field3047 = null;
		}
		if (class70.field1646 != 0) {
			class157.field3605 = true;
		}
	}

	@Override
	public void init() {
		if (!this.method639()) {
			return;
		}
		class86.field2014 = Integer.parseInt(this.getParameter("worldid"));
		class53.field1217 = Integer.parseInt(this.getParameter("modewhat"));
		class70.field1646 = Integer.parseInt(this.getParameter("modewhere"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			class144.method1083();
		} else {
			class133.method1018();
		}
		String var2 = this.getParameter("members");
		if (var2 != null && var2.equals("1")) {
			class146.field3315 = true;
		} else {
			class146.field3315 = false;
		}
		String var3 = this.getParameter("lang");
		if (var3 != null && var3.equals("1")) {
			class103.method831();
			class20.field371 = 1;
			class77.field1784 = class27.field490;
		}
		String var4 = this.getParameter("game");
		if (var4 != null && var4.equals("1")) {
			class154.field3526 = 1;
		} else {
			class154.field3526 = 0;
		}
		try {
			class130.field3004 = Integer.parseInt(this.getParameter("js"));
			class107.field2532 = Integer.parseInt(this.getParameter("plug"));
		} catch (Exception var5) {
		}
		class151.field3465 = this.getCodeBase().getHost();
		this.method647(class53.field1217 + 32);
	}

	@ObfuscatedName("client.d(Z)V")
	public void method155() {
		if (class134.field3114 != 1000) {
			boolean var1 = class68.method562();
			if (!var1) {
				this.method148();
			}
		}
	}
}
