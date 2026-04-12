package deob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("client")
public final class client extends GameShell {

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

	@ObfuscatedName("dc.c(I)V")
	public static void method316() {
		if (class46.field1208 == 0) {
			Statics.field3183 = new World(4, 104, 104, Js5WorkerRequest.field1451);
			for (int var0 = 0; var0 < 4; var0++) {
				class102.field2569[var0] = new CollisionMap(104, 104);
			}
			Statics.field2626 = new Pix32(512, 512);
			BufferedRandomAccessFile.field3274 = 5;
			class46.field1208 = 20;
			Statics.field3079 = Statics.field2480;
		} else if (class46.field1208 == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 128 + 15;
				int var4 = var3 * 3 + 600;
				int var5 = Pix3D.field775[var3];
				var1[var2] = var4 * var5 >> 16;
			}
			World.method51(var1);
			BufferedRandomAccessFile.field3274 = 10;
			Statics.field3079 = Statics.field1557;
			class46.field1208 = 30;
		} else if (class46.field1208 == 30) {
			Statics.field1378 = Statics.method894(0, true, false, true);
			Statics.field657 = Statics.method894(1, true, false, true);
			Statics.field2376 = Statics.method894(2, true, true, false);
			Statics.field3200 = Statics.method894(3, true, false, true);
			Statics.field2031 = Statics.method894(4, true, false, true);
			Statics.field3131 = Statics.method894(5, true, true, true);
			Statics.field2702 = Statics.method894(6, false, true, true);
			Statics.field1890 = Statics.method894(7, true, false, true);
			Statics.field1087 = Statics.method894(8, true, false, true);
			Statics.field1752 = Statics.method894(9, true, false, true);
			Statics.field1542 = Statics.method894(10, true, false, true);
			Statics.field2324 = Statics.method894(11, true, false, true);
			Statics.field2739 = Statics.method894(12, true, false, true);
			class46.field1208 = 40;
			Statics.field3079 = Statics.field1362;
			BufferedRandomAccessFile.field3274 = 20;
		} else if (class46.field1208 == 40) {
			int var6 = Statics.field1378.method977() * 5 / 100;
			int var7 = var6 + Statics.field657.method977() * 5 / 100;
			int var8 = var7 + Statics.field2376.method977() * 5 / 100;
			int var9 = var8 + Statics.field3200.method977() * 5 / 100;
			int var10 = var9 + Statics.field2031.method977() * 5 / 100;
			int var11 = var10 + Statics.field3131.method977() * 5 / 100;
			int var12 = var11 + Statics.field2702.method977() * 5 / 100;
			int var13 = var12 + Statics.field1890.method977() * 40 / 100;
			int var14 = var13 + Statics.field1087.method977() * 5 / 100;
			int var15 = var14 + Statics.field1752.method977() * 5 / 100;
			int var16 = var15 + Statics.field1542.method977() * 5 / 100;
			int var17 = var16 + Statics.field2324.method977() * 5 / 100;
			int var18 = var17 + Statics.field2739.method977() * 5 / 100;
			if (var18 == 100) {
				class46.field1208 = 45;
				Statics.field3079 = Statics.field1782;
				BufferedRandomAccessFile.field3274 = 30;
			} else {
				if (var18 != 0) {
					Statics.field3079 = Statics.method956(new JagString[] { Statics.field1106, Statics.method502(var18), Statics.field2181 });
				}
				BufferedRandomAccessFile.field3274 = 30;
			}
		} else if (class46.field1208 == 45) {
			Statics.method574(Statics.field1071, !class93.field2332);
			Statics.field2435 = Statics.method993(Statics.field1071, Statics.field3049);
			Statics.field2705 = new Decimator(22050, Statics.field192);
			class46.field1208 = 50;
			Statics.field3079 = Statics.field2325;
			BufferedRandomAccessFile.field3274 = 35;
		} else if (class46.field1208 == 50) {
			int var19 = 0;
			if (Statics.field2892 == null) {
				Statics.field2892 = Statics.method528(Statics.field1087, Statics.field3234, Statics.field1453);
			} else {
				var19++;
			}
			if (Statics.field2684 == null) {
				Statics.field2684 = Statics.method528(Statics.field1087, Statics.field3234, Statics.field3247);
			} else {
				var19++;
			}
			if (Statics.field2902 == null) {
				Statics.field2902 = Statics.method528(Statics.field1087, Statics.field3234, Statics.field1526);
			} else {
				var19++;
			}
			if (var19 < 3) {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field2319, Statics.method502(var19 * 100 / 3), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 40;
			} else {
				class46.field1208 = 60;
				BufferedRandomAccessFile.field3274 = 40;
				Statics.field3079 = Statics.field1102;
			}
		} else if (class46.field1208 == 60) {
			int var20 = Statics.method966(Statics.field1542, Statics.field1087);
			int var21 = Statics.method432();
			if (var20 < var21) {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field2407, Statics.method502(var20 * 100 / var21), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 50;
			} else {
				Statics.field3079 = Statics.field3305;
				BufferedRandomAccessFile.field3274 = 50;
				Statics.method399(5);
				class46.field1208 = 70;
			}
		} else if (class46.field1208 == 70) {
			if (Statics.field2376.method230()) {
				Statics.method723(Statics.field2376);
				Statics.method702(Statics.field2376);
				Statics.method930(Statics.field2376, Statics.field1890);
				Statics.method933(Statics.field1890, class93.field2332, Statics.field2376);
				Statics.method603(Statics.field1890, Statics.field2376);
				Statics.method748(Statics.field2376, MidiStream.field1183, Statics.field1890);
				Statics.method268(Statics.field657, Statics.field2376, Statics.field1378);
				Statics.method903(Statics.field1890, Statics.field2376);
				Statics.method868(Statics.field2376);
				Statics.method289(Statics.field2376);
				Statics.method292(Statics.field3200, Statics.field1087, Statics.field1890);
				class46.field1208 = 80;
				BufferedRandomAccessFile.field3274 = 60;
				Statics.field3079 = Statics.field2138;
			} else {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field1762, Statics.method502(Statics.field2376.method982()), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 60;
			}
		} else if (class46.field1208 == 80) {
			int var22 = 0;
			if (Statics.field1239 == null) {
				Statics.field1239 = Statics.method1038(Statics.field1087, Statics.field2700, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field784 == null) {
				Statics.field784 = Statics.method1038(Statics.field1087, Statics.field3007, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field800 == null) {
				Statics.field800 = Statics.method372(Statics.field1087, Statics.field1646, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field470 == null) {
				Statics.field470 = Statics.method245(Statics.field1087, Statics.field1440, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1231 == null) {
				Statics.field1231 = Statics.method245(Statics.field1087, Statics.field1466, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1376 == null) {
				Statics.field1376 = Statics.method245(Statics.field1087, Statics.field2965, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field178 == null) {
				Statics.field178 = Statics.method245(Statics.field1087, Statics.field1034, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1886 == null) {
				Statics.field1886 = Statics.method245(Statics.field1087, Statics.field2646, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field2277 == null) {
				Statics.field2277 = Statics.method1038(Statics.field1087, Statics.field1461, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field680 == null) {
				Statics.field680 = Statics.method245(Statics.field1087, Statics.field325, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1926 == null) {
				Statics.field1926 = Statics.method245(Statics.field1087, Statics.field3118, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1578 == null) {
				Statics.field1578 = Statics.method245(Statics.field1087, Statics.field234, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field365 == null) {
				Statics.field365 = Statics.method372(Statics.field1087, Statics.field23, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field2614 == null) {
				Statics.field2614 = Statics.method372(Statics.field1087, Statics.field1929, Statics.field3234);
			} else {
				var22++;
			}
			if (var22 < 14) {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field833, Statics.method502(var22 * 100 / 14), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 70;
			} else {
				Statics.field784.method556();
				int var23 = (int) (Math.random() * 21.0D) - 10;
				int var24 = (int) (Math.random() * 21.0D) - 10;
				int var25 = (int) (Math.random() * 41.0D) - 20;
				int var26 = (int) (Math.random() * 21.0D) - 10;
				for (int var27 = 0; var27 < Statics.field470.length; var27++) {
					Statics.field470[var27].method547(var23 + var25, var24 - -var25, var26 + var25);
				}
				Statics.field800[0].method334(var23 + var25, var24 + var25, var25 + var26);
				Statics.field3079 = Statics.field1527;
				BufferedRandomAccessFile.field3274 = 70;
				class46.field1208 = 85;
			}
		} else if (class46.field1208 == 85) {
			int var28 = Statics.method892(Statics.field1087);
			int var29 = Statics.method456();
			if (var28 < var29) {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field1597, Statics.method502(var28 * 100 / var29), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 80;
			} else {
				Statics.field3079 = Statics.field1431;
				class46.field1208 = 90;
				BufferedRandomAccessFile.field3274 = 80;
			}
		} else if (class46.field1208 == 90) {
			if (Statics.field1752.method230()) {
				TextureManager var30 = new TextureManager(Statics.field1752, Statics.field1087, 20, 0.8D, class93.field2332 ? 64 : 128);
				Pix3D.method357(var30);
				Pix3D.method365(0.8D);
				class46.field1208 = 110;
				BufferedRandomAccessFile.field3274 = 90;
				Statics.field3079 = Statics.field1998;
			} else {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field793, Statics.method502(Statics.field1752.method982()), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 90;
			}
		} else if (class46.field1208 == 110) {
			Statics.field708 = new MouseTracking();
			Statics.field1071.method656(10, Statics.field708);
			Statics.field3079 = Statics.field796;
			class46.field1208 = 120;
			BufferedRandomAccessFile.field3274 = 94;
		} else if (class46.field1208 == 120) {
			if (Statics.field1542.method239(Statics.field1388, Statics.field3234)) {
				Huffman var31 = new Huffman(Statics.field1542.method215(Statics.field3234, Statics.field1388));
				Statics.method567(var31);
				class46.field1208 = 130;
				Statics.field3079 = Statics.field2575;
				BufferedRandomAccessFile.field3274 = 96;
			} else {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field671, Statics.field2772 });
				BufferedRandomAccessFile.field3274 = 96;
			}
		} else if (class46.field1208 == 130) {
			if (!Statics.field3200.method230()) {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field1789, Statics.method502(Statics.field3200.method982() * 4 / 5), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 100;
			} else if (Statics.field2739.method230()) {
				Statics.field3079 = Statics.field1031;
				class46.field1208 = 140;
				BufferedRandomAccessFile.field3274 = 100;
			} else {
				Statics.field3079 = Statics.method956(new JagString[] { Statics.field1789, Statics.method502(Statics.field2739.method982() / 5 + 80), Statics.field2181 });
				BufferedRandomAccessFile.field3274 = 100;
			}
		} else if (class46.field1208 == 140) {
			Statics.method399(10);
		}
	}

	@ObfuscatedName("d.b(Z)V")
	public static void method293() {
		LruCache.field488.method417();
		int var0 = LruCache.field488.method412(8);
		if (var0 < LocType.field1341) {
			for (int var1 = var0; var1 < LocType.field1341; var1++) {
				Js5.field375[class31.field841++] = class22.field677[var1];
			}
		}
		if (var0 > LocType.field1341) {
			throw new RuntimeException("gnpov1");
		}
		LocType.field1341 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class22.field677[var2];
			ClientNpc var4 = Js5Loader.field2992[var3];
			int var5 = LruCache.field488.method412(1);
			if (var5 == 0) {
				class22.field677[LocType.field1341++] = var3;
				var4.field2008 = Linkable.field2063;
			} else {
				int var6 = LruCache.field488.method412(2);
				if (var6 == 0) {
					class22.field677[LocType.field1341++] = var3;
					var4.field2008 = Linkable.field2063;
					class50.field1348[ClientEntity.field2027++] = var3;
				} else if (var6 == 1) {
					class22.field677[LocType.field1341++] = var3;
					var4.field2008 = Linkable.field2063;
					int var7 = LruCache.field488.method412(3);
					var4.method725(var7, false);
					int var8 = LruCache.field488.method412(1);
					if (var8 == 1) {
						class50.field1348[ClientEntity.field2027++] = var3;
					}
				} else if (var6 == 2) {
					class22.field677[LocType.field1341++] = var3;
					var4.field2008 = Linkable.field2063;
					int var9 = LruCache.field488.method412(3);
					var4.method725(var9, true);
					int var10 = LruCache.field488.method412(3);
					var4.method725(var10, true);
					int var11 = LruCache.field488.method412(1);
					if (var11 == 1) {
						class50.field1348[ClientEntity.field2027++] = var3;
					}
				} else if (var6 == 3) {
					Js5.field375[class31.field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(B)V")
	public static void method599() {
		VarpType.field2399++;
		Statics.method957(true);
		Statics.method950(true);
		Statics.method957(false);
		Statics.method950(false);
		Statics.method503();
		Statics.method990();
		if (!MouseTracking.field2043) {
			int var0 = class131.field3204;
			if (Js5WorkerRequest.field1459 / 256 > var0) {
				var0 = Js5WorkerRequest.field1459 / 256;
			}
			int var1 = class113.field2797 + class112.field2766 & 0x7FF;
			if (ClientProj.field632[4] && field1599[4] + 128 > var0) {
				var0 = field1599[4] + 128;
			}
			Statics.method848(var0, Statics.field1194, Statics.method712(Statics.field75, Statics.field2621.field1972, Statics.field2621.field1963) - 50, var1, Statics.field1839, var0 * 3 + 600);
		}
		int var2;
		if (MouseTracking.field2043) {
			var2 = Statics.method273();
		} else {
			var2 = Statics.method298();
		}
		int var3 = Statics.field709;
		int var4 = Statics.field184;
		int var5 = Statics.field1748;
		int var6 = Statics.field1400;
		int var7 = Statics.field1200;
		for (int var8 = 0; var8 < 5; var8++) {
			if (ClientProj.field632[var8]) {
				int var9 = (int) ((double) (class14.field471[var8] * 2 + 1) * Math.random() + Math.sin((double) class113.field2782[var8] / 100.0D * (double) JavaBrowserMidiPlayer.field1019[var8]) * (double) field1599[var8] - (double) class14.field471[var8]);
				if (var8 == 1) {
					Statics.field1748 += var9;
				}
				if (var8 == 0) {
					Statics.field709 += var9;
				}
				if (var8 == 2) {
					Statics.field1200 += var9;
				}
				if (var8 == 4) {
					Statics.field1400 += var9;
					if (Statics.field1400 < 128) {
						Statics.field1400 = 128;
					}
					if (Statics.field1400 > 383) {
						Statics.field1400 = 383;
					}
				}
				if (var8 == 3) {
					Statics.field184 = Statics.field184 + var9 & 0x7FF;
				}
			}
		}
		Statics.method1028();
		ModelLit.field2239 = class102.field2568 - 4;
		ModelLit.field2248 = true;
		ModelLit.field2270 = class24.field741 - 4;
		ModelLit.field2261 = 0;
		Pix2D.method920();
		Statics.field3183.method53(Statics.field709, Statics.field1748, Statics.field1200, Statics.field1400, Statics.field184, var2);
		Statics.field3183.method60();
		Statics.method671();
		Statics.method578();
		((TextureManager) Statics.field771).method697(class9.field321);
		Statics.method891();
		if (Isaac.field1069 && Statics.method614() == 0) {
			Isaac.field1069 = false;
		}
		if (Isaac.field1069) {
			Statics.method1028();
			Pix2D.method920();
			Statics.method872(Statics.field3252, false, null);
		}
		Statics.method44();
		Statics.field709 = var3;
		Statics.field1200 = var7;
		Statics.field184 = var4;
		Statics.field1400 = var6;
		Statics.field1748 = var5;
	}

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
				Isaac.field1059 = 3000;
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
				Isaac.field1059 = 3000;
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
			method316();
			Statics.method970();
		} else if (class103.field2599 == 5) {
			method316();
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
		if (BufferedRandomAccessFile.field3242) {
			Statics.method422(Statics.field3049);
			Statics.method902(Statics.field3049);
			this.method628();
			Statics.method856(Statics.field3049);
			Statics.method465(Statics.field3049);
		}
		if (class103.field2599 == 0) {
			Statics.method536(BufferedRandomAccessFile.field3274, null, Statics.field3079);
		} else if (class103.field2599 == 5) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 10) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 20) {
			Statics.method888(Statics.field2902, Statics.field2892);
		} else if (class103.field2599 == 25) {
			if (PixMap.field3301 == 1) {
				if (class78.field1922 > PacketBit.field948) {
					PacketBit.field948 = class78.field1922;
				}
				int var1 = (PacketBit.field948 - class78.field1922) * 50 / PacketBit.field948;
				Statics.method872(Statics.field3252, true, Statics.method956(new JagString[] { Statics.field221, Statics.method502(var1), Statics.field1673 }));
			} else if (PixMap.field3301 == 2) {
				if (IdkType.field2358 > ClientLocAnim.field1441) {
					ClientLocAnim.field1441 = IdkType.field2358;
				}
				int var2 = (ClientLocAnim.field1441 - IdkType.field2358) * 50 / ClientLocAnim.field1441 + 50;
				Statics.method872(Statics.field3252, true, Statics.method956(new JagString[] { Statics.field221, Statics.method502(var2), Statics.field1673 }));
			} else {
				Statics.method872(Statics.field3252, false, null);
			}
		} else if (class103.field2599 == 30) {
			Statics.method611();
		} else if (class103.field2599 == 35) {
			Statics.method188();
		} else if (class103.field2599 == 40) {
			Statics.method872(Statics.field3187, false, Statics.field2033);
		}
		ClientNpc.field3176 = 0;
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 6) {
				Statics.method714((byte) 37);
			}
			class24.field723 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Js5NetThread.field2182 = 0;
			} else if (arg0[1].equals("office")) {
				Js5NetThread.field2182 = 1;
			} else if (arg0[1].equals("local")) {
				Js5NetThread.field2182 = 2;
			} else {
				Statics.method714((byte) 118);
			}
			if (arg0[2].equals("live")) {
				Js5NetThread.field2175 = 0;
			} else if (arg0[2].equals("rc")) {
				Js5NetThread.field2175 = 1;
			} else if (arg0[2].equals("wip")) {
				Js5NetThread.field2175 = 2;
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
				MidiStream.field1183 = false;
			} else if (arg0[4].equals("members")) {
				MidiStream.field1183 = true;
			} else {
				Statics.method714((byte) 93);
			}
			if (arg0[5].equals("english")) {
				BZip2State.field1838 = 0;
			} else if (arg0[5].equals("german")) {
				Statics.method899();
				BZip2State.field1838 = 1;
			} else {
				Statics.method714((byte) 106);
			}
			client var1 = new client();
			var1.method626("runescape", 13, 503, Js5NetThread.field2175 + 32, InetAddress.getLocalHost(), 435, 765);
		} catch (Exception var3) {
			Statics.method214(null, var3);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void method284() {
		if (BZip2State.field1803 >= 4) {
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
			Isaac.field1059 = 3000;
		}
		if (Isaac.field1059-- > 0) {
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
				Packet var1 = new Packet(5);
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
		Js5NetThread.field2175 = Integer.parseInt(this.getParameter("modewhat"));
		Js5NetThread.field2182 = Integer.parseInt(this.getParameter("modewhere"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			Statics.method961();
		} else {
			Statics.method253();
		}
		String var2 = this.getParameter("members");
		if (var2 != null && var2.equals("1")) {
			MidiStream.field1183 = true;
		} else {
			MidiStream.field1183 = false;
		}
		String var3 = this.getParameter("lang");
		if (var3 != null && var3.equals("1")) {
			Statics.method899();
			BZip2State.field1838 = 1;
		}
		this.method621(Js5NetThread.field2175 + 32);
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
		PixFont.method199();
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
		ModelLit.method768();
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
		Ground.method276();
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
		Pix3D.method358();
		Pix2D.method924();
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
		Texture.method765();
		Statics.method1032();
		Statics.method963();
		Statics.method187();
		Statics.method243();
		Statics.method269();
		Statics.method123();
		Tone.method1004();
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
		Filter.method376();
		Statics.method927();
		AnimFrame.method744();
		Statics.method1008();
		BZip2.method438();
		Statics.method687();
		Statics.method543();
		Statics.method471();
		Statics.method477();
		PcmPlayer.method816();
		JavaSafePcmPlayer.method437();
		Statics.method630();
		Statics.method975();
		Statics.method999();
		MidiParser.method351();
		Statics.method421();
	}

	@ObfuscatedName("client.c(Z)V")
	@Override
	public void method290() {
		Statics.field223 = Js5NetThread.field2182 == 0 ? 443 : class24.field723 + 50000;
		Statics.field915 = Js5NetThread.field2182 == 0 ? 43594 : class24.field723 + 40000;
		Statics.field545 = Statics.field915;
		Statics.method987();
		Statics.method856(Statics.field3049);
		Statics.method465(Statics.field3049);
		Statics.field1551 = SignLink.field1716;
		try {
			if (Statics.field1071.field1715 != null) {
				Statics.field797 = new BufferedRandomAccessFile(Statics.field1071.field1715, 5200, 0);
				for (int var1 = 0; var1 < 13; var1++) {
					class46.field1193[var1] = new BufferedRandomAccessFile(Statics.field1071.field1702[var1], 6000, 0);
				}
				Statics.field1668 = new BufferedRandomAccessFile(Statics.field1071.field1707, 6000, 0);
				Statics.field931 = new DataFile(255, Statics.field797, Statics.field1668, 500000);
				Statics.field1071.field1702 = null;
				Statics.field1071.field1707 = null;
				Statics.field1071.field1715 = null;
			}
		} catch (IOException var2) {
			Statics.field931 = null;
			Statics.field797 = null;
			Statics.field1668 = null;
		}
		if (Js5NetThread.field2182 != 0) {
			Sprite.field1007 = true;
		}
		Statics.field704 = new IfType();
	}
}
