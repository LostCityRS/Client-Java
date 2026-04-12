package deob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("client")
public final class client extends class64 {

	@ObfuscatedName("client.cb")
	public static JagString field583 = JagString.wrap("logo");

	@ObfuscatedName("client.eb")
	public static int field585 = 0;

	@ObfuscatedName("client.gb")
	public static int field587 = 1;

	@ObfuscatedName("client.hb")
	public static JagString field588 = JagString.wrap("Use");

	@ObfuscatedName("client.db")
	public static JagString field584 = field588;

	@ObfuscatedName("client.jb")
	public static int field590 = -1;

	@ObfuscatedName("client.nb")
	public static int field594 = 0;

	@ObfuscatedName("client.pb")
	public static JagString field596 = JagString.wrap("Account locked as we suspect it has been stolen)3");

	@ObfuscatedName("client.rb")
	public static JagString field598 = JagString.wrap("Verbinde mit Server)3)3)3");

	@ObfuscatedName("client.sb")
	public static JagString[] field599 = new JagString[5];

	@ObfuscatedName("client.vb")
	public static JagString field602 = field596;

	@ObfuscatedName("client.X")
	public static JagString field578 = JagString.wrap("RuneScape wurde aktualisiert(Q");

	@ObfuscatedName("client.W")
	public static int field577 = 0;

	@ObfuscatedName("client.xb")
	public static JagString field604 = JagString.wrap("Welcome to RuneScape");

	@ObfuscatedName("client.bb")
	public static JagString field582 = field604;

	@ObfuscatedName("client.Cb")
	public static JagString field609 = JagString.wrap("backtop1");

	@ObfuscatedName("client.b(II)V")
	public void method277(int arg0) {
		if (Statics.field915 == Statics.field545) {
			Statics.field545 = Statics.field223;
		} else {
			Statics.field545 = Statics.field915;
		}
		Statics.field1651 = null;
		Statics.field3299 = null;
		class14.field466++;
		class14.field464 = 0;
		if (class14.field466 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (class103.field2599 > 5) {
				class39.field1059 = 3000;
			} else {
				this.method620("js5connect_full");
				class103.field2599 = 1000;
			}
		} else if (class14.field466 >= 2 && arg0 == 6) {
			this.method620("js5connect_outofdate");
			class103.field2599 = 1000;
		} else if (class14.field466 >= 4) {
			if (class103.field2599 <= 5) {
				this.method620("js5connect");
				class103.field2599 = 1000;
			} else {
				class39.field1059 = 3000;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void method279() {
		Linkable.field2063++;
		this.method282();
		Statics.method320();
		Statics.method680();
		Statics.method463();
		Statics.method853();
		Statics.method1021();
		if (class103.field2599 == 0) {
			Statics.method316();
			Statics.method970();
		} else if (class103.field2599 == 5) {
			Statics.method316();
			Statics.method970();
		} else if (class103.field2599 == 10) {
			Statics.method971();
		} else if (class103.field2599 == 20) {
			Statics.method971();
			Statics.method374();
		} else if (class103.field2599 == 25) {
			Statics.method865();
		}
		if (class103.field2599 == 30) {
			Statics.method1024();
		} else if (class103.field2599 == 35) {
			Statics.method1024();
		} else if (class103.field2599 == 40) {
			Statics.method374();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void method282() {
		if (class103.field2599 != 1000) {
			boolean var1 = Statics.method527();
			if (!var1) {
				this.method284();
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	@Override
	public void method283() {
		if (class133.field3242) {
			Statics.method422(Statics.field3049);
			Statics.method902(Statics.field3049);
			this.method628();
			Statics.method856(Statics.field3049);
			Statics.method465(Statics.field3049);
		}
		if (class103.field2599 == 0) {
			Statics.method536(class133.field3274, null, class123.field3079);
		} else if (class103.field2599 == 5) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 10) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 20) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 25) {
			if (PixMap.field3301 == 1) {
				if (class78.field1922 > class36.field948) {
					class36.field948 = class78.field1922;
				}
				int var1 = (class36.field948 - class78.field1922) * 50 / class36.field948;
				Statics.method872(class133.field3252, true, Statics.method956(new JagString[] { class5.field221, Statics.method502(var1), class67.field1673 }));
			} else if (PixMap.field3301 == 2) {
				if (class95.field2358 > class54.field1441) {
					class54.field1441 = class95.field2358;
				}
				int var2 = (class54.field1441 - class95.field2358) * 50 / class54.field1441 + 50;
				Statics.method872(class133.field3252, true, Statics.method956(new JagString[] { class5.field221, Statics.method502(var2), class67.field1673 }));
			} else {
				Statics.method872(class133.field3252, false, null);
			}
		} else if (class103.field2599 == 30) {
			Statics.method611();
		} else if (class103.field2599 == 35) {
			Statics.method188();
		} else if (class103.field2599 == 40) {
			Statics.method872(class130.field3187, false, class80.field2033);
		}
		class130.field3176 = 0;
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 6) {
				Statics.method714((byte) 37);
			}
			class24.field723 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				class89.field2182 = 0;
			} else if (arg0[1].equals("office")) {
				class89.field2182 = 1;
			} else if (arg0[1].equals("local")) {
				class89.field2182 = 2;
			} else {
				Statics.method714((byte) 118);
			}
			if (arg0[2].equals("live")) {
				class89.field2175 = 0;
			} else if (arg0[2].equals("rc")) {
				class89.field2175 = 1;
			} else if (arg0[2].equals("wip")) {
				class89.field2175 = 2;
			} else {
				Statics.method714((byte) 34);
			}
			if (arg0[3].equals("lowmem")) {
				Statics.method961();
			} else if (arg0[3].equals("highmem")) {
				Statics.method253();
			} else {
				Statics.method714((byte) 121);
			}
			if (arg0[4].equals("free")) {
				class45.field1183 = false;
			} else if (arg0[4].equals("members")) {
				class45.field1183 = true;
			} else {
				Statics.method714((byte) 93);
			}
			if (arg0[5].equals("english")) {
				class74.field1838 = 0;
			} else if (arg0[5].equals("german")) {
				Statics.method899();
				class74.field1838 = 1;
			} else {
				Statics.method714((byte) 106);
			}
			client var1 = new client();
			var1.method626("runescape", 13, 503, class89.field2175 + 32, InetAddress.getLocalHost(), 435, 765);
		} catch (Exception var3) {
			Statics.method214(null, var3);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void method284() {
		if (class74.field1803 >= 4) {
			this.method620("js5crc");
			class103.field2599 = 1000;
			return;
		}
		if (class16.field525 >= 4) {
			if (class103.field2599 <= 5) {
				this.method620("js5io");
				class103.field2599 = 1000;
				return;
			}
			class16.field525 = 3;
			class39.field1059 = 3000;
		}
		if (class39.field1059-- > 0) {
			return;
		}
		try {
			if (class14.field464 == 0) {
				Statics.field3299 = Statics.field1071.method657(Statics.field545);
				class14.field464++;
			}
			if (class14.field464 == 1) {
				if (Statics.field3299.field815 == 2) {
					this.method277(-1);
					return;
				}
				if (Statics.field3299.field815 == 1) {
					class14.field464++;
				}
			}
			if (class14.field464 == 2) {
				Statics.field1651 = new class129((Socket) Statics.field3299.field818, Statics.field1071);
				class8 var1 = new class8(5);
				var1.method141(15);
				var1.method182(435);
				Statics.field1651.method1016(5, var1.field284);
				class14.field464++;
				Statics.field1014 = Statics.method869();
			}
			if (class14.field464 == 3) {
				if (class103.field2599 <= 5 || Statics.field1651.method1020() > 0) {
					int var2 = Statics.field1651.method1022();
					if (var2 != 0) {
						this.method277(var2);
						return;
					}
					class14.field464++;
				} else if (Statics.method869() - Statics.field1014 > 30000L) {
					this.method277(-2);
					return;
				}
			}
			if (class14.field464 == 4) {
				Statics.method381(Statics.field1651, class103.field2599 > 20);
				Statics.field3299 = null;
				class14.field464 = 0;
				Statics.field1651 = null;
				class14.field466 = 0;
			}
		} catch (IOException var3) {
			this.method277(-3);
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void method286() {
		if (Statics.field708 != null) {
			Statics.field708.field2050 = false;
		}
		Statics.field708 = null;
		if (Statics.field1450 != null) {
			Statics.field1450.method1015();
			Statics.field1450 = null;
		}
		Statics.method945();
		Statics.method327();
		Statics.method674();
		Statics.method967();
		Statics.method447();
		Statics.method884();
		try {
			if (Statics.field797 != null) {
				Statics.field797.method1046();
			}
			if (class46.field1193 != null) {
				for (int var1 = 0; var1 < class46.field1193.length; var1++) {
					if (class46.field1193[var1] != null) {
						class46.field1193[var1].method1046();
					}
				}
			}
			if (Statics.field1668 != null) {
				Statics.field1668.method1046();
			}
		} catch (IOException var2) {
		}
	}

	@Override
	public void init() {
		if (!this.method619()) {
			return;
		}
		class24.field723 = Integer.parseInt(this.getParameter("worldid"));
		class89.field2175 = Integer.parseInt(this.getParameter("modewhat"));
		class89.field2182 = Integer.parseInt(this.getParameter("modewhere"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			Statics.method961();
		} else {
			Statics.method253();
		}
		String var2 = this.getParameter("members");
		if (var2 != null && var2.equals("1")) {
			class45.field1183 = true;
		} else {
			class45.field1183 = false;
		}
		String var3 = this.getParameter("lang");
		if (var3 != null && var3.equals("1")) {
			Statics.method899();
			class74.field1838 = 1;
		}
		this.method621(class89.field2175 + 32);
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void method288() {
		Statics.method285();
		Statics.method34();
		Statics.method616();
		Statics.method721();
		Statics.method1051();
		Statics.method735();
		Statics.method175();
		Statics.method1017();
		Statics.method983();
		Statics.method1047();
		Statics.method904();
		Statics.method1025();
		Statics.method411();
		class10.method199();
		World.method70();
		Statics.method116();
		Statics.method46();
		Statics.method800();
		Statics.method855();
		Statics.method843();
		Statics.method636();
		Statics.method730();
		Statics.method315();
		Statics.method461();
		Statics.method496();
		Statics.method740();
		Statics.method426();
		Statics.method849();
		Statics.method266();
		Statics.method484();
		class91.method768();
		Statics.method715();
		Statics.method462();
		Statics.method531();
		Statics.method388();
		Statics.method420();
		Statics.method663();
		Statics.method1013();
		Statics.method274();
		Statics.method889();
		Statics.method529();
		Statics.method883();
		class18.method276();
		Statics.method890();
		Statics.method991();
		Statics.method871();
		Statics.method470();
		Statics.method225();
		Statics.method759();
		Statics.method675();
		Statics.method257();
		Statics.method898();
		Statics.method972();
		Statics.method1027();
		Statics.method602();
		Statics.method879();
		Statics.method867();
		class27.method358();
		class111.method924();
		Statics.method750();
		Statics.method520();
		Statics.method385();
		Statics.method394();
		Statics.method707();
		Statics.method823();
		Statics.method509();
		Statics.method946();
		Statics.method935();
		Statics.method370();
		Statics.method405();
		Statics.method836();
		Statics.method694();
		class90.method765();
		Statics.method1032();
		Statics.method963();
		Statics.method187();
		Statics.method243();
		Statics.method269();
		Statics.method123();
		class125.method1004();
		Statics.method814();
		Statics.method295();
		Statics.method959();
		Statics.method318();
		Statics.method756();
		Statics.method988();
		Statics.method534();
		Statics.method569();
		Statics.method682();
		Statics.method326();
		Statics.method596();
		Statics.method577();
		Statics.method99();
		Statics.method934();
		class30.method376();
		Statics.method927();
		class84.method744();
		Statics.method1008();
		class41.method438();
		Statics.method687();
		Statics.method543();
		Statics.method471();
		Statics.method477();
		class94.method816();
		class40.method437();
		Statics.method630();
		Statics.method975();
		Statics.method999();
		class26.method351();
		Statics.method421();
	}

	@ObfuscatedName("client.c(Z)V")
	@Override
	public void method290() {
		Statics.field223 = class89.field2182 == 0 ? 443 : class24.field723 + 50000;
		Statics.field915 = class89.field2182 == 0 ? 43594 : class24.field723 + 40000;
		Statics.field545 = Statics.field915;
		Statics.method987();
		Statics.method856(Statics.field3049);
		Statics.method465(Statics.field3049);
		Statics.field1551 = class69.field1716;
		try {
			if (Statics.field1071.field1715 != null) {
				Statics.field797 = new class133(Statics.field1071.field1715, 5200, 0);
				for (int var1 = 0; var1 < 13; var1++) {
					class46.field1193[var1] = new class133(Statics.field1071.field1702[var1], 6000, 0);
				}
				Statics.field1668 = new class133(Statics.field1071.field1707, 6000, 0);
				Statics.field931 = new class109(255, Statics.field797, Statics.field1668, 500000);
				Statics.field1071.field1702 = null;
				Statics.field1071.field1707 = null;
				Statics.field1071.field1715 = null;
			}
		} catch (IOException var2) {
			Statics.field931 = null;
			Statics.field797 = null;
			Statics.field1668 = null;
		}
		if (class89.field2182 != 0) {
			Sprite.field1007 = true;
		}
		Statics.field704 = new class100();
	}
}
