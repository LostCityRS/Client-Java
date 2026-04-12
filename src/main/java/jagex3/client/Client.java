package jagex3.client;

import deob.*;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.dash3d.*;
import jagex3.datastruct.LinkList;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.Pix8;
import jagex3.graphics.PixFont;
import jagex3.io.BZip2State;
import jagex3.io.BufferedRandomAccessFile;
import jagex3.io.DataFile;
import jagex3.io.Packet;
import jagex3.js5.Js5Loader;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.wordfilter2.Huffman;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("client")
public final class Client extends GameShell {

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
	@ObfuscatedName("hd.Jb")
	public static int field1208 = 0;
	@ObfuscatedName("vd.Bd")
	public static World field3183;
	@ObfuscatedName("r.k")
	public static CollisionMap[] field2569 = new CollisionMap[4];
	@ObfuscatedName("rb.Fb")
	public static Pix32 field2626;
	@ObfuscatedName("wb.H")
	public static int field3274 = 10;
	@ObfuscatedName("uc.Q")
	public static JagString field3079 = Statics.field3067;
	@ObfuscatedName("jc.eb")
	public static int[][][] field1451 = new int[4][105][105];
	@ObfuscatedName("id.s")
	public static Js5Loader field1378;
	@ObfuscatedName("d.Bc")
	public static Js5Loader field657;
	@ObfuscatedName("pe.Qb")
	public static Js5Loader field2376;
	@ObfuscatedName("w.d")
	public static Js5Loader field3200;
	@ObfuscatedName("nb.qd")
	public static Js5Loader field2031;
	@ObfuscatedName("vb.ub")
	public static Js5Loader field3131;
	@ObfuscatedName("s.a")
	public static Js5Loader field2702;
	@ObfuscatedName("md.Bb")
	public static Js5Loader field1890;
	@ObfuscatedName("h.xb")
	public static Js5Loader field1087;
	@ObfuscatedName("ld.F")
	public static Js5Loader field1752;
	@ObfuscatedName("kb.b")
	public static Js5Loader field1542;
	@ObfuscatedName("pc.s")
	public static Js5Loader field2324;
	@ObfuscatedName("sa.o")
	public static Js5Loader field2739;
	@ObfuscatedName("pc.A")
	public static boolean lowMem = false;
	@ObfuscatedName("qc.k")
	public static Mixer soundMixer;
	@ObfuscatedName("s.d")
	public static Decimator soundDecimator;
	@ObfuscatedName("tb.Pb")
	public static PixFont p11;
	@ObfuscatedName("rd.A")
	public static PixFont p12;
	@ObfuscatedName("tb.Zb")
	public static PixFont b12;
	@ObfuscatedName("sd.h")
	public static int field2761 = 0;

	@ObfuscatedName("dc.c(I)V")
	public static void method316() {
		if (field1208 == 0) {
			field3183 = new World(4, 104, 104, field1451);
			for (int var0 = 0; var0 < 4; var0++) {
				field2569[var0] = new CollisionMap(104, 104);
			}
			field2626 = new Pix32(512, 512);
			field3274 = 5;
			field1208 = 20;
			field3079 = Statics.field2480;
		} else if (field1208 == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 128 + 15;
				int var4 = var3 * 3 + 600;
				int var5 = Pix3D.field775[var3];
				var1[var2] = var4 * var5 >> 16;
			}
			World.method51(var1);
			field3274 = 10;
			field3079 = Statics.field1557;
			field1208 = 30;
		} else if (field1208 == 30) {
			field1378 = method894(0, true, false, true);
			field657 = method894(1, true, false, true);
			field2376 = method894(2, true, true, false);
			field3200 = method894(3, true, false, true);
			field2031 = method894(4, true, false, true);
			field3131 = method894(5, true, true, true);
			field2702 = method894(6, false, true, true);
			field1890 = method894(7, true, false, true);
			field1087 = method894(8, true, false, true);
			field1752 = method894(9, true, false, true);
			field1542 = method894(10, true, false, true);
			field2324 = method894(11, true, false, true);
			field2739 = method894(12, true, false, true);
			field1208 = 40;
			field3079 = Statics.field1362;
			field3274 = 20;
		} else if (field1208 == 40) {
			int var6 = field1378.method977() * 5 / 100;
			int var7 = var6 + field657.method977() * 5 / 100;
			int var8 = var7 + field2376.method977() * 5 / 100;
			int var9 = var8 + field3200.method977() * 5 / 100;
			int var10 = var9 + field2031.method977() * 5 / 100;
			int var11 = var10 + field3131.method977() * 5 / 100;
			int var12 = var11 + field2702.method977() * 5 / 100;
			int var13 = var12 + field1890.method977() * 40 / 100;
			int var14 = var13 + field1087.method977() * 5 / 100;
			int var15 = var14 + field1752.method977() * 5 / 100;
			int var16 = var15 + field1542.method977() * 5 / 100;
			int var17 = var16 + field2324.method977() * 5 / 100;
			int var18 = var17 + field2739.method977() * 5 / 100;
			if (var18 == 100) {
				field1208 = 45;
				field3079 = Statics.field1782;
				field3274 = 30;
			} else {
				if (var18 != 0) {
					field3079 = JagString.join(new JagString[] { Statics.field1106, Statics.method502(var18), Statics.field2181 });
				}
				field3274 = 30;
			}
		} else if (field1208 == 45) {
			PcmPlayer.init(GameShell.signlink, !lowMem);
			soundMixer = Statics.method993(GameShell.signlink, GameShell.canvas);
			soundDecimator = new Decimator(22050, PcmPlayer.frequency);
			field1208 = 50;
			field3079 = Statics.field2325;
			field3274 = 35;
		} else if (field1208 == 50) {
			int var19 = 0;
			if (p11 == null) {
				p11 = Statics.method528(field1087, Statics.field3234, Statics.field1453);
			} else {
				var19++;
			}
			if (p12 == null) {
				p12 = Statics.method528(field1087, Statics.field3234, Statics.field3247);
			} else {
				var19++;
			}
			if (b12 == null) {
				b12 = Statics.method528(field1087, Statics.field3234, Statics.field1526);
			} else {
				var19++;
			}
			if (var19 < 3) {
				field3079 = JagString.join(new JagString[] { Statics.field2319, Statics.method502(var19 * 100 / 3), Statics.field2181 });
				field3274 = 40;
			} else {
				field1208 = 60;
				field3274 = 40;
				field3079 = Statics.field1102;
			}
		} else if (field1208 == 60) {
			int var20 = Statics.method966(field1542, field1087);
			int var21 = Statics.method432();
			if (var20 < var21) {
				field3079 = JagString.join(new JagString[] { Statics.field2407, Statics.method502(var20 * 100 / var21), Statics.field2181 });
				field3274 = 50;
			} else {
				field3079 = Statics.field3305;
				field3274 = 50;
				Statics.method399(5);
				field1208 = 70;
			}
		} else if (field1208 == 70) {
			if (field2376.method230()) {
				FloType.init(field2376);
				FluType.init(field2376);
				IdkType.init(field2376, field1890);
				LocType.init(field1890, lowMem, field2376);
				NpcType.init(field1890, field2376);
				ObjType.init(field2376, MidiStream.field1183, field1890);
				SeqType.init(field657, field2376, field1378);
				SpotType.init(field1890, field2376);
				VarBitType.init(field2376);
				VarpType.init(field2376);
				IfType.init(field3200, field1087, field1890);
				field1208 = 80;
				field3274 = 60;
				field3079 = Statics.field2138;
			} else {
				field3079 = JagString.join(new JagString[] { Statics.field1762, Statics.method502(field2376.method982()), Statics.field2181 });
				field3274 = 60;
			}
		} else if (field1208 == 80) {
			int var22 = 0;
			if (Statics.field1239 == null) {
				Statics.field1239 = Statics.method1038(field1087, Statics.field2700, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field784 == null) {
				Statics.field784 = Statics.method1038(field1087, Statics.field3007, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field800 == null) {
				Statics.field800 = Statics.method372(field1087, Statics.field1646, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field470 == null) {
				Statics.field470 = Statics.method245(field1087, Statics.field1440, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1231 == null) {
				Statics.field1231 = Statics.method245(field1087, Statics.field1466, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1376 == null) {
				Statics.field1376 = Statics.method245(field1087, Statics.field2965, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field178 == null) {
				Statics.field178 = Statics.method245(field1087, Statics.field1034, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1886 == null) {
				Statics.field1886 = Statics.method245(field1087, Statics.field2646, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field2277 == null) {
				Statics.field2277 = Statics.method1038(field1087, Statics.field1461, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field680 == null) {
				Statics.field680 = Statics.method245(field1087, Statics.field325, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1926 == null) {
				Statics.field1926 = Statics.method245(field1087, Statics.field3118, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field1578 == null) {
				Statics.field1578 = Statics.method245(field1087, Statics.field234, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field365 == null) {
				Statics.field365 = Statics.method372(field1087, Statics.field23, Statics.field3234);
			} else {
				var22++;
			}
			if (Statics.field2614 == null) {
				Statics.field2614 = Statics.method372(field1087, Statics.field1929, Statics.field3234);
			} else {
				var22++;
			}
			if (var22 < 14) {
				field3079 = JagString.join(new JagString[] { Statics.field833, Statics.method502(var22 * 100 / 14), Statics.field2181 });
				field3274 = 70;
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
				field3079 = Statics.field1527;
				field3274 = 70;
				field1208 = 85;
			}
		} else if (field1208 == 85) {
			int var28 = Statics.method892(field1087);
			int var29 = Statics.method456();
			if (var28 < var29) {
				field3079 = JagString.join(new JagString[] { Statics.field1597, Statics.method502(var28 * 100 / var29), Statics.field2181 });
				field3274 = 80;
			} else {
				field3079 = Statics.field1431;
				field1208 = 90;
				field3274 = 80;
			}
		} else if (field1208 == 90) {
			if (field1752.method230()) {
				TextureManager var30 = new TextureManager(field1752, field1087, 20, 0.8D, lowMem ? 64 : 128);
				Pix3D.method357(var30);
				Pix3D.method365(0.8D);
				field1208 = 110;
				field3274 = 90;
				field3079 = Statics.field1998;
			} else {
				field3079 = JagString.join(new JagString[] { Statics.field793, Statics.method502(field1752.method982()), Statics.field2181 });
				field3274 = 90;
			}
		} else if (field1208 == 110) {
			Statics.field708 = new MouseTracking();
			GameShell.signlink.method656(10, Statics.field708);
			field3079 = Statics.field796;
			field1208 = 120;
			field3274 = 94;
		} else if (field1208 == 120) {
			if (field1542.method239(Statics.field1388, Statics.field3234)) {
				Huffman var31 = new Huffman(field1542.method215(Statics.field3234, Statics.field1388));
				Statics.method567(var31);
				field1208 = 130;
				field3079 = Statics.field2575;
				field3274 = 96;
			} else {
				field3079 = JagString.join(new JagString[] { Statics.field671, Statics.field2772 });
				field3274 = 96;
			}
		} else if (field1208 == 130) {
			if (!field3200.method230()) {
				field3079 = JagString.join(new JagString[] { Statics.field1789, Statics.method502(field3200.method982() * 4 / 5), Statics.field2181 });
				field3274 = 100;
			} else if (field2739.method230()) {
				field3079 = Statics.field1031;
				field1208 = 140;
				field3274 = 100;
			} else {
				field3079 = JagString.join(new JagString[] { Statics.field1789, Statics.method502(field2739.method982() / 5 + 80), Statics.field2181 });
				field3274 = 100;
			}
		} else if (field1208 == 140) {
			Statics.method399(10);
		}
	}

	@ObfuscatedName("d.b(Z)V")
	public static void method293() {
		Statics.field488.method417();
		int var0 = Statics.field488.method412(8);
		if (var0 < Statics.field1341) {
			for (int var1 = var0; var1 < Statics.field1341; var1++) {
				Statics.field375[class31.field841++] = LocChange.field677[var1];
			}
		}
		if (var0 > Statics.field1341) {
			throw new RuntimeException("gnpov1");
		}
		Statics.field1341 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = LocChange.field677[var2];
			ClientNpc var4 = Statics.field2992[var3];
			int var5 = Statics.field488.method412(1);
			if (var5 == 0) {
				LocChange.field677[Statics.field1341++] = var3;
				var4.field2008 = Statics.field2063;
			} else {
				int var6 = Statics.field488.method412(2);
				if (var6 == 0) {
					LocChange.field677[Statics.field1341++] = var3;
					var4.field2008 = Statics.field2063;
					class50.field1348[Statics.field2027++] = var3;
				} else if (var6 == 1) {
					LocChange.field677[Statics.field1341++] = var3;
					var4.field2008 = Statics.field2063;
					int var7 = Statics.field488.method412(3);
					var4.method725(var7, false);
					int var8 = Statics.field488.method412(1);
					if (var8 == 1) {
						class50.field1348[Statics.field2027++] = var3;
					}
				} else if (var6 == 2) {
					LocChange.field677[Statics.field1341++] = var3;
					var4.field2008 = Statics.field2063;
					int var9 = Statics.field488.method412(3);
					var4.method725(var9, true);
					int var10 = Statics.field488.method412(3);
					var4.method725(var10, true);
					int var11 = Statics.field488.method412(1);
					if (var11 == 1) {
						class50.field1348[Statics.field2027++] = var3;
					}
				} else if (var6 == 3) {
					Statics.field375[class31.field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(B)V")
	public static void method599() {
		Statics.field2399++;
		method957(true);
		Statics.method950(true);
		method957(false);
		Statics.method950(false);
		method503();
		method990();
		if (!Statics.field2043) {
			int var0 = class131.field3204;
			if (Statics.field1459 / 256 > var0) {
				var0 = Statics.field1459 / 256;
			}
			int var1 = class113.field2797 + class112.field2766 & 0x7FF;
			if (Statics.field632[4] && field1599[4] + 128 > var0) {
				var0 = field1599[4] + 128;
			}
			Statics.method848(var0, Statics.field1194, Statics.method712(Statics.field75, Statics.field2621.field1972, Statics.field2621.field1963) - 50, var1, Statics.field1839, var0 * 3 + 600);
		}
		int var2;
		if (Statics.field2043) {
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
			if (Statics.field632[var8]) {
				int var9 = (int) ((double) (class14.field471[var8] * 2 + 1) * Math.random() + Math.sin((double) class113.field2782[var8] / 100.0D * (double) Statics.field1019[var8]) * (double) field1599[var8] - (double) class14.field471[var8]);
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
		Model.field2239 = class102.field2568 - 4;
		Model.field2248 = true;
		Model.field2270 = class24.field741 - 4;
		Model.field2261 = 0;
		Pix2D.method920();
		field3183.method53(Statics.field709, Statics.field1748, Statics.field1200, Statics.field1400, Statics.field184, var2);
		field3183.method60();
		method671();
		Statics.method578();
		((TextureManager) Statics.field771).method697(class9.field321);
		Statics.method891();
		if (Statics.field1069 && Statics.method614() == 0) {
			Statics.field1069 = false;
		}
		if (Statics.field1069) {
			Statics.method1028();
			Pix2D.method920();
			method872(Statics.field3252, false, null);
		}
		Statics.method44();
		Statics.field709 = var3;
		Statics.field1200 = var7;
		Statics.field184 = var4;
		Statics.field1400 = var6;
		Statics.field1748 = var5;
	}

	@ObfuscatedName("re.a(IZZBZ)Lu;")
	public static Js5Loader method894(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (Statics.field797 != null) {
			var4 = new DataFile(arg0, Statics.field797, class46.field1193[arg0], 1000000);
		}
		return new Js5Loader(var4, Statics.field931, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("i.a(B)V")
	public static void method503() {
		for (ClientProj var0 = (ClientProj) class86.field2160.method802(); var0 != null; var0 = (ClientProj) class86.field2160.method809()) {
			if (Statics.field75 != var0.field638 || Statics.field2063 > var0.field628) {
				var0.method739();
			} else if (var0.field631 <= Statics.field2063) {
				if (var0.field618 > 0) {
					ClientNpc var1 = Statics.field2992[var0.field618 - 1];
					if (var1 != null && var1.field1972 >= 0 && var1.field1972 < 13312 && var1.field1963 >= 0 && var1.field1963 < 13312) {
						var0.method300(Statics.field2063, var1.field1963, Statics.method712(var0.field638, var1.field1972, var1.field1963) - var0.field617, var1.field1972);
					}
				}
				if (var0.field618 < 0) {
					int var2 = -var0.field618 - 1;
					ClientPlayer var3;
					if (Statics.field1683 == var2) {
						var3 = Statics.field2621;
					} else {
						var3 = Statics.field2030[var2];
					}
					if (var3 != null && var3.field1972 >= 0 && var3.field1972 < 13312 && var3.field1963 >= 0 && var3.field1963 < 13312) {
						var0.method300(Statics.field2063, var3.field1963, Statics.method712(var0.field638, var3.field1972, var3.field1963) - var0.field617, var3.field1972);
					}
				}
				var0.method299(class9.field321);
				field3183.method90(Statics.field75, (int) var0.field637, (int) var0.field650, (int) var0.field649, 60, var0, var0.field670, -1, false);
			}
		}
	}

	@ObfuscatedName("fa.a(III)La;")
	public static JagString method390(int arg0, int arg1) {
		int var2 = arg0 - arg1;
		if (var2 < -9) {
			return Statics.field1383;
		} else if (var2 < -6) {
			return Statics.field1645;
		} else if (var2 < -3) {
			return Statics.field3306;
		} else if (var2 < 0) {
			return Statics.field501;
		} else if (var2 > 9) {
			return Statics.field2564;
		} else if (var2 > 6) {
			return Statics.field1005;
		} else if (var2 > 3) {
			return Statics.field2069;
		} else if (var2 > 0) {
			return Statics.field1925;
		} else {
			return Statics.field2699;
		}
	}

	@ObfuscatedName("ga.e(I)V")
	public static void method424() {
		for (int var0 = -1; var0 < class118.field2939; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class112.field2758[var0];
			}
			ClientPlayer var2 = Statics.field2030[var1];
			if (var2 != null && var2.field1952 > 0) {
				var2.field1952--;
				if (var2.field1952 == 0) {
					var2.field1964 = null;
				}
			}
		}
		for (int var3 = 0; var3 < Statics.field1341; var3++) {
			int var4 = LocChange.field677[var3];
			ClientNpc var5 = Statics.field2992[var4];
			if (var5 != null && var5.field1952 > 0) {
				var5.field1952--;
				if (var5.field1952 == 0) {
					var5.field1964 = null;
				}
			}
		}
	}

	@ObfuscatedName("ua.a(Z)V")
	public static void method990() {
		for (MapSpotAnim var0 = (MapSpotAnim) class112.field2756.method802(); var0 != null; var0 = (MapSpotAnim) class112.field2756.method809()) {
			if (Statics.field75 != var0.field2895 || var0.field2893) {
				var0.method739();
			} else if (Statics.field2063 >= var0.field2886) {
				var0.method958(class9.field321);
				if (var0.field2893) {
					var0.method739();
				} else {
					field3183.method90(var0.field2895, var0.field2900, var0.field2891, var0.field2887, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("kc.b(B)V")
	public static void method600() {
		Statics.field2027 = 0;
		class31.field841 = 0;
		Statics.method728();
		method633();
		method688();
		method837();
		for (int var0 = 0; var0 < class31.field841; var0++) {
			int var1 = Statics.field375[var0];
			if (Statics.field2063 != Statics.field2030[var1].field2008) {
				Statics.field2030[var1] = null;
			}
		}
		if (Statics.field2547 != Statics.field488.field267) {
			throw new RuntimeException("gpp1 pos:" + Statics.field488.field267 + " psize:" + Statics.field2547);
		}
		for (int var2 = 0; var2 < class118.field2939; var2++) {
			if (Statics.field2030[class112.field2758[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class118.field2939);
			}
		}
	}

	@ObfuscatedName("fa.c(I)V")
	public static void method391() {
		if (Statics.field1104 < 2 && class14.field475 == 0 && field594 == 0) {
			return;
		}
		JagString var0;
		if (class14.field475 == 1 && Statics.field1104 < 2) {
			var0 = JagString.join(new JagString[] {field584, Statics.field2337, Statics.field3177, Statics.field1942 });
		} else if (field594 == 1 && Statics.field1104 < 2) {
			var0 = JagString.join(new JagString[] { Statics.field1523, Statics.field2337, Statics.field1384, Statics.field1942 });
		} else {
			var0 = class102.field2586[Statics.field1104 - 1];
		}
		if (Statics.field1104 > 2) {
			var0 = JagString.join(new JagString[] { var0, Statics.field2659, Statics.method502(Statics.field1104 - 2), Statics.field2041 });
		}
		b12.method207(var0, 4, 16777215, Statics.field2063 / 1000);
	}

	@ObfuscatedName("hc.b(II)V")
	public static void method476(int arg0) {
		Statics.field1237 = Statics.field2063;
		Statics.method1040();
		int var1 = VarpType.method1023(arg0).field2404;
		if (var1 == 0) {
			return;
		}
		int var2 = class113.field2803[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				Pix3D.method365(0.9D);
				((TextureManager) Statics.field771).method696(0.9D);
			}
			if (var2 == 2) {
				Pix3D.method365(0.8D);
				((TextureManager) Statics.field771).method696(0.8D);
			}
			if (var2 == 3) {
				Pix3D.method365(0.7D);
				((TextureManager) Statics.field771).method696(0.7D);
			}
			if (var2 == 4) {
				Pix3D.method365(0.6D);
				((TextureManager) Statics.field771).method696(0.6D);
			}
			Statics.method538();
			field2402 = true;
		}
		if (var1 == 3) {
			short var3 = 0;
			if (var2 == 0) {
				var3 = 255;
			}
			if (var2 == 1) {
				var3 = 192;
			}
			if (var2 == 2) {
				var3 = 128;
			}
			if (var2 == 3) {
				var3 = 64;
			}
			if (var2 == 4) {
				var3 = 0;
			}
			if (Statics.field1554 != var3) {
				if (Statics.field1554 == 0 && Statics.field3037 != -1) {
					Statics.method681(0, Statics.field3037, var3, field2702);
					Statics.field1860 = 0;
				} else if (var3 == 0) {
					Statics.method669();
					Statics.field1860 = 0;
				} else {
					Statics.method738(var3);
				}
				Statics.field1554 = var3;
			}
		}
		if (var1 == 9) {
			class86.field2163 = var2;
		}
		if (var1 == 10) {
			if (var2 == 0) {
				Statics.field1559 = 127;
			}
			if (var2 == 1) {
				Statics.field1559 = 96;
			}
			if (var2 == 2) {
				Statics.field1559 = 64;
			}
			if (var2 == 3) {
				Statics.field1559 = 32;
			}
			if (var2 == 4) {
				Statics.field1559 = 0;
			}
		}
		if (var1 == 8) {
			class105.field2637 = true;
			Statics.field216 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				class9.field322 = 127;
			}
			if (var2 == 1) {
				class9.field322 = 96;
			}
			if (var2 == 2) {
				class9.field322 = 64;
			}
			if (var2 == 3) {
				class9.field322 = 32;
			}
			if (var2 == 4) {
				class9.field322 = 0;
			}
		}
		if (var1 == 6) {
			ClientScript.field527 = var2;
		}
		if (var1 == 5) {
			Statics.field3297 = var2;
		}
	}

	@ObfuscatedName("rd.a(B)V")
	public static void method886() {
		if (field2761 == 49) {
			int var0 = Statics.field488.method152();
			int var1 = (var0 & 0x7) + Statics.field893;
			int var2 = (var0 >> 4 & 0x7) + Statics.field1471;
			int var3 = Statics.field488.method152();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = Statics.field3186[var4];
			int var7 = Statics.field488.method180();
			if (var2 >= 0 && var1 >= 0 && var2 < 103 && var1 < 103) {
				int var8 = field1451[Statics.field75][var2][var1];
				int var9 = field1451[Statics.field75][var2 + 1][var1];
				int var10 = field1451[Statics.field75][var2 + 1][var1 + 1];
				int var11 = field1451[Statics.field75][var2][var1 + 1];
				if (var6 == 0) {
					class17 var12 = field3183.method82(Statics.field75, var2, var1);
					if (var12 != null) {
						int var13 = var12.field531 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var12.field536 = new ClientLocAnim(var13, 2, var5 + 4, var8, var9, var10, var11, var7, false);
							var12.field535 = new ClientLocAnim(var13, 2, var5 + 1 & 0x3, var8, var9, var10, var11, var7, false);
						} else {
							var12.field536 = new ClientLocAnim(var13, var4, var5, var8, var9, var10, var11, var7, false);
						}
					}
				}
				if (var6 == 1) {
					class106 var14 = field3183.method56(Statics.field75, var2, var1);
					if (var14 != null) {
						var14.field2665 = new ClientLocAnim(var14.field2678 >> 14 & 0x7FFF, 4, 0, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 2) {
					Sprite var15 = field3183.method63(Statics.field75, var2, var1);
					if (var4 == 11) {
						var4 = 10;
					}
					if (var15 != null) {
						var15.field985 = new ClientLocAnim(var15.field980 >> 14 & 0x7FFF, var4, var5, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 3) {
					class52 var16 = field3183.method89(Statics.field75, var2, var1);
					if (var16 != null) {
						var16.field1373 = new ClientLocAnim(var16.field1361 >> 14 & 0x7FFF, 22, var5, var8, var9, var10, var11, var7, false);
					}
				}
			}
		} else if (field2761 == 241) {
			int var17 = Statics.field488.method147();
			int var18 = var17 & 0x3;
			int var19 = var17 >> 2;
			int var20 = Statics.field3186[var19];
			int var21 = Statics.field488.method145();
			int var22 = Statics.field488.method152();
			int var23 = (var22 & 0x7) + Statics.field893;
			int var24 = (var22 >> 4 & 0x7) + Statics.field1471;
			if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
				Statics.method514(var21, var24, var18, -1, Statics.field75, var23, var20, var19, 0);
			}
		} else {
			if (field2761 == 9) {
				int var25 = Statics.field488.method144();
				int var26 = (var25 & 0x7) + Statics.field893;
				int var27 = (var25 >> 4 & 0x7) + Statics.field1471;
				int var28 = Statics.field488.method145();
				int var29 = Statics.field488.method144();
				int var30 = var29 >> 4 & 0xF;
				int var31 = var29 & 0x7;
				int var32 = Statics.field488.method144();
				if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
					int var33 = var30 + 1;
					if (var27 - var33 <= Statics.field2621.field1962[0] && var27 + var33 >= Statics.field2621.field1962[0] && var26 - var33 <= Statics.field2621.field2009[0] && var26 + var33 >= Statics.field2621.field2009[0] && Statics.field1559 != 0 && var31 > 0 && Statics.field965 < 50) {
						Statics.field2369[Statics.field965] = var28;
						ObjType.field2845[Statics.field965] = var31;
						LocChange.field684[Statics.field965] = var32;
						Statics.field955[Statics.field965] = null;
						Statics.field1521[Statics.field965] = (var26 << 8) + (var27 << 16) + var30;
						Statics.field965++;
					}
				}
			}
			if (field2761 == 202) {
				int var34 = Statics.field488.method144();
				int var35 = (var34 >> 4 & 0x7) + Statics.field1471;
				int var36 = Statics.field893 + (var34 & 0x7);
				int var37 = Statics.field488.method145();
				int var38 = Statics.field488.method144();
				int var39 = Statics.field488.method145();
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					int var40 = var36 * 128 + 64;
					int var41 = var35 * 128 + 64;
					MapSpotAnim var42 = new MapSpotAnim(var37, Statics.field75, var41, var40, Statics.method712(Statics.field75, var41, var40) - var38, var39, Statics.field2063);
					class112.field2756.method804(var42);
				}
			} else if (field2761 == 99) {
				int var43 = Statics.field488.method144();
				int var44 = (var43 >> 4 & 0x7) + Statics.field1471;
				int var45 = (var43 & 0x7) + Statics.field893;
				int var46 = Statics.field488.method145();
				int var47 = Statics.field488.method145();
				int var48 = Statics.field488.method145();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
					LinkList var49 = class17.field552[Statics.field75][var44][var45];
					if (var49 != null) {
						for (ClientObj var50 = (ClientObj) var49.method802(); var50 != null; var50 = (ClientObj) var49.method809()) {
							if ((var46 & 0x7FFF) == var50.field1499 && var50.field1490 == var47) {
								var50.field1490 = var48;
								break;
							}
						}
						Statics.method1011(var45, var44);
					}
				}
			} else if (field2761 == 143) {
				int var51 = Statics.field488.method152();
				int var52 = Statics.field893 + (var51 & 0x7);
				int var53 = Statics.field1471 + (var51 >> 4 & 0x7);
				int var54 = Statics.field488.method147();
				int var55 = var54 & 0x3;
				int var56 = var54 >> 2;
				int var57 = Statics.field3186[var56];
				if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
					Statics.method514(-1, var53, var55, -1, Statics.field75, var52, var57, var56, 0);
				}
			} else {
				if (field2761 == 229) {
					byte var58 = Statics.field488.method171();
					int var59 = Statics.field488.method137();
					byte var60 = Statics.field488.method184();
					byte var61 = Statics.field488.method184();
					int var62 = Statics.field488.method152();
					int var63 = var62 & 0x3;
					int var64 = var62 >> 2;
					int var65 = Statics.field3186[var64];
					int var66 = Statics.field488.method156();
					int var67 = (var66 & 0x7) + Statics.field893;
					int var68 = Statics.field1471 + (var66 >> 4 & 0x7);
					int var69 = Statics.field488.method145();
					byte var70 = Statics.field488.method143();
					int var71 = Statics.field488.method166();
					int var72 = Statics.field488.method180();
					ClientPlayer var73;
					if (Statics.field1683 == var59) {
						var73 = Statics.field2621;
					} else {
						var73 = Statics.field2030[var59];
					}
					if (var73 != null) {
						LocType var74 = LocType.method389(var71);
						int var75 = field1451[Statics.field75][var68][var67];
						int var76 = field1451[Statics.field75][var68][var67 + 1];
						int var77 = field1451[Statics.field75][var68 + 1][var67 + 1];
						int var78 = field1451[Statics.field75][var68 + 1][var67];
						Model var79 = var74.method505(var77, var76, var63, var75, var64, var78);
						if (var79 != null) {
							if (var58 < var70) {
								byte var80 = var70;
								var70 = var58;
								var58 = var80;
							}
							if (var60 < var61) {
								byte var81 = var61;
								var61 = var60;
								var60 = var81;
							}
							Statics.method514(-1, var68, 0, var72 + 1, Statics.field75, var67, var65, 0, var69 + 1);
							var73.field82 = Statics.field2063 + var72;
							int var82 = var74.field1286;
							var73.field73 = var79;
							var73.field91 = Statics.field2063 + var69;
							int var83 = var74.field1298;
							if (var63 == 1 || var63 == 3) {
								var83 = var74.field1286;
								var82 = var74.field1298;
							}
							var73.field79 = var68 * 128 + var82 * 64;
							var73.field99 = var67 * 128 + var83 * 64;
							var73.field80 = Statics.method712(Statics.field75, var73.field79, var73.field99);
							var73.field89 = var61 + var67;
							var73.field66 = var68 + var70;
							var73.field70 = var68 + var58;
							var73.field97 = var60 + var67;
						}
					}
				}
				if (field2761 == 74) {
					int var84 = Statics.field488.method144();
					int var85 = (var84 >> 4 & 0x7) + Statics.field1471;
					int var86 = (var84 & 0x7) + Statics.field893;
					int var87 = Statics.field488.method137();
					if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
						LinkList var88 = class17.field552[Statics.field75][var85][var86];
						if (var88 != null) {
							for (ClientObj var89 = (ClientObj) var88.method802(); var89 != null; var89 = (ClientObj) var88.method809()) {
								if ((var87 & 0x7FFF) == var89.field1499) {
									var89.method739();
									break;
								}
							}
							if (var88.method802() == null) {
								class17.field552[Statics.field75][var85][var86] = null;
							}
							Statics.method1011(var86, var85);
						}
					}
				} else if (field2761 == 1) {
					int var90 = Statics.field488.method144();
					int var91 = (var90 & 0x7) + Statics.field893;
					int var92 = Statics.field1471 + (var90 >> 4 & 0x7);
					int var93 = var92 + Statics.field488.method184();
					int var94 = var91 + Statics.field488.method184();
					int var95 = Statics.field488.method139();
					int var96 = Statics.field488.method145();
					int var97 = Statics.field488.method144() * 4;
					int var98 = Statics.field488.method144() * 4;
					int var99 = Statics.field488.method145();
					int var100 = Statics.field488.method145();
					int var101 = Statics.field488.method144();
					int var102 = Statics.field488.method144();
					if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104 && var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var96 != 65535) {
						int var103 = var93 * 128 + 64;
						int var104 = var92 * 128 + 64;
						int var105 = var91 * 128 + 64;
						ClientProj var106 = new ClientProj(var96, Statics.field75, var104, var105, Statics.method712(Statics.field75, var104, var105) - var97, var99 - -Statics.field2063, var100 + Statics.field2063, var101, var102, var95, var98);
						int var107 = var94 * 128 + 64;
						var106.method300(Statics.field2063 + var99, var107, Statics.method712(Statics.field75, var103, var107) - var98, var103);
						class86.field2160.method804(var106);
					}
				} else if (field2761 == 19) {
					int var108 = Statics.field488.method180();
					int var109 = Statics.field488.method180();
					int var110 = Statics.field488.method145();
					int var111 = Statics.field488.method152();
					int var112 = (var111 >> 4 & 0x7) + Statics.field1471;
					int var113 = (var111 & 0x7) + Statics.field893;
					if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && Statics.field1683 != var109) {
						ClientObj var114 = new ClientObj();
						var114.field1499 = var110;
						var114.field1490 = var108;
						if (class17.field552[Statics.field75][var112][var113] == null) {
							class17.field552[Statics.field75][var112][var113] = new LinkList();
						}
						class17.field552[Statics.field75][var112][var113].method804(var114);
						Statics.method1011(var113, var112);
					}
				} else if (field2761 == 175) {
					int var115 = Statics.field488.method166();
					int var116 = Statics.field488.method145();
					int var117 = Statics.field488.method144();
					int var118 = (var117 & 0x7) + Statics.field893;
					int var119 = (var117 >> 4 & 0x7) + Statics.field1471;
					if (var119 >= 0 && var118 >= 0 && var119 < 104 && var118 < 104) {
						ClientObj var120 = new ClientObj();
						var120.field1490 = var116;
						var120.field1499 = var115;
						if (class17.field552[Statics.field75][var119][var118] == null) {
							class17.field552[Statics.field75][var119][var118] = new LinkList();
						}
						class17.field552[Statics.field75][var119][var118].method804(var120);
						Statics.method1011(var118, var119);
					}
				}
			}
		}
	}

	@ObfuscatedName("ca.a(I)V")
	public static void method252() {
		for (int var0 = 0; var0 < Statics.field1341; var0++) {
			int var1 = LocChange.field677[var0];
			ClientNpc var2 = Statics.field2992[var1];
			if (var2 != null) {
				method319(var2, var2.field3182.field1084);
			}
		}
	}

	@ObfuscatedName("nc.a(Ldc;I)V")
	public static void method733(LocChange arg0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		if (arg0.field688 == 0) {
			var1 = field3183.method78(arg0.field679, arg0.field700, arg0.field699);
		}
		int var4 = 0;
		if (arg0.field688 == 1) {
			var1 = field3183.method47(arg0.field679, arg0.field700, arg0.field699);
		}
		if (arg0.field688 == 2) {
			var1 = field3183.method66(arg0.field679, arg0.field700, arg0.field699);
		}
		if (arg0.field688 == 3) {
			var1 = field3183.method49(arg0.field679, arg0.field700, arg0.field699);
		}
		if (var1 != 0) {
			int var5 = field3183.method97(arg0.field679, arg0.field700, arg0.field699, var1);
			var2 = var1 >> 14 & 0x7FFF;
			var4 = var5 >> 6 & 0x3;
			var3 = var5 & 0x1F;
		}
		arg0.field686 = var4;
		arg0.field689 = var2;
		arg0.field697 = var3;
	}

	@ObfuscatedName("j.g(I)V")
	public static void method532() {
		class31.field841 = 0;
		Statics.field2027 = 0;
		method293();
		Statics.method752();
		method323();
		for (int var0 = 0; var0 < class31.field841; var0++) {
			int var1 = Statics.field375[var0];
			if (Statics.field2063 != Statics.field2992[var1].field2008) {
				Statics.field2992[var1].field3182 = null;
				Statics.field2992[var1] = null;
			}
		}
		if (Statics.field2547 != Statics.field488.field267) {
			throw new RuntimeException("gnp1 pos:" + Statics.field488.field267 + " psize:" + Statics.field2547);
		}
		for (int var2 = 0; var2 < Statics.field1341; var2++) {
			if (Statics.field2992[LocChange.field677[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + Statics.field1341);
			}
		}
	}

	@ObfuscatedName("ld.a(I)V")
	public static void method660() {
		JagString var0 = null;
		for (int var1 = 0; var1 < Statics.field1104; var1++) {
			if (class102.field2586[var1].method11(Statics.field2334) != -1) {
				var0 = class102.field2586[var1].method1(class102.field2586[var1].method11(Statics.field2334));
				break;
			}
		}
		if (var0 == null) {
			Statics.method483();
			return;
		}
		int var2 = Statics.field2306;
		int var3 = Statics.field986;
		if (var2 > 190) {
			var2 = 190;
		}
		int var4 = Statics.field219;
		int var5 = Statics.field579;
		if (var3 < 0) {
			var3 = 0;
		}
		Pix2D.method913(var3, var5, var2, var4, 6116423);
		Pix2D.method913(var3 + 1, var5 - -1, var2 - 2, 16, 0);
		Pix2D.method922(var3 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
		b12.method206(var0, var3 + 3, var5 + 14, 6116423, false);
		int var6 = class24.field741;
		int var7 = class102.field2568;
		if (Statics.field640 == 0) {
			var6 -= 4;
			var7 -= 4;
		}
		if (Statics.field640 == 1) {
			var6 -= 553;
			var7 -= 205;
		}
		if (Statics.field640 == 2) {
			var7 -= 357;
			var6 -= 17;
		}
		for (int var8 = 0; var8 < Statics.field1104; var8++) {
			int var9 = (Statics.field1104 - var8 - 1) * 15 + var5 + 31;
			JagString var10 = class102.field2586[var8];
			int var11 = 16777215;
			if (var10.method38(var0)) {
				var10 = var10.method19(0, var10.method10() - var0.method10());
				if (var10.method38(Statics.field2337)) {
					var10 = var10.method19(0, var10.method10() - Statics.field2337.method10());
				}
			}
			if (var3 < var6 && var6 < var2 + var3 && var9 - 13 < var7 && var9 + 3 > var7) {
				var11 = 16776960;
			}
			b12.method206(var10, var3 + 3, var9, var11, true);
		}
	}

	@ObfuscatedName("nb.a(IIIIII)V")
	public static void method724(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = field3183.method78(arg0, arg1, arg4);
		if (var5 != 0) {
			int var6 = field3183.method97(arg0, arg1, arg4, var5);
			int var7 = var6 & 0x1F;
			int var8 = var6 >> 6 & 0x3;
			int var9 = arg2;
			if (var5 > 0) {
				var9 = arg3;
			}
			int var10 = (103 - arg4) * 4 * 512 + arg1 * 4 + 24624;
			int var11 = var5 >> 14 & 0x7FFF;
			int[] var12 = field2626.field1480;
			LocType var13 = LocType.method389(var11);
			if (var13.field1320 == -1) {
				if (var7 == 0 || var7 == 2) {
					if (var8 == 0) {
						var12[var10] = var9;
						var12[var10 + 512] = var9;
						var12[var10 + 1024] = var9;
						var12[var10 + 1536] = var9;
					} else if (var8 == 1) {
						var12[var10] = var9;
						var12[var10 + 1] = var9;
						var12[var10 + 2] = var9;
						var12[var10 + 3] = var9;
					} else if (var8 == 2) {
						var12[var10 + 3] = var9;
						var12[var10 + 512 + 3] = var9;
						var12[var10 + 1024 + 3] = var9;
						var12[var10 + 1539] = var9;
					} else if (var8 == 3) {
						var12[var10 + 1536] = var9;
						var12[var10 + 1 + 1536] = var9;
						var12[var10 + 1536 + 2] = var9;
						var12[var10 + 3 + 1536] = var9;
					}
				}
				if (var7 == 3) {
					if (var8 == 0) {
						var12[var10] = var9;
					} else if (var8 == 1) {
						var12[var10 + 3] = var9;
					} else if (var8 == 2) {
						var12[var10 + 3 + 1536] = var9;
					} else if (var8 == 3) {
						var12[var10 + 1536] = var9;
					}
				}
				if (var7 == 2) {
					if (var8 == 3) {
						var12[var10] = var9;
						var12[var10 + 512] = var9;
						var12[var10 + 1024] = var9;
						var12[var10 + 1536] = var9;
					} else if (var8 == 0) {
						var12[var10] = var9;
						var12[var10 + 1] = var9;
						var12[var10 + 2] = var9;
						var12[var10 + 3] = var9;
					} else if (var8 == 1) {
						var12[var10 + 3] = var9;
						var12[var10 + 3 + 512] = var9;
						var12[var10 + 1027] = var9;
						var12[var10 + 3 + 1536] = var9;
					} else if (var8 == 2) {
						var12[var10 + 1536] = var9;
						var12[var10 + 1537] = var9;
						var12[var10 + 1538] = var9;
						var12[var10 + 1536 + 3] = var9;
					}
				}
			} else {
				Pix8 var14 = Statics.field800[var13.field1320];
				if (var14 != null) {
					int var15 = (var13.field1286 * 4 - var14.field744) / 2;
					int var16 = (var13.field1298 * 4 - var14.field749) / 2;
					var14.method329(arg1 * 4 + var15 + 48, 48 - -((-arg4 + 104 - var13.field1298) * 4) + var16);
				}
			}
		}
		int var17 = field3183.method66(arg0, arg1, arg4);
		if (var17 != 0) {
			int var18 = field3183.method97(arg0, arg1, arg4, var17);
			int var19 = var17 >> 14 & 0x7FFF;
			int var20 = var18 >> 6 & 0x3;
			LocType var21 = LocType.method389(var19);
			int var22 = var18 & 0x1F;
			if (var21.field1320 != -1) {
				Pix8 var23 = Statics.field800[var21.field1320];
				if (var23 != null) {
					int var24 = (var21.field1298 * 4 - var23.field749) / 2;
					int var25 = (var21.field1286 * 4 - var23.field744) / 2;
					var23.method329(arg1 * 4 + var25 + 48, 48 - (-((-var21.field1298 + 104 + -arg4) * 4) + -var24));
				}
			} else if (var22 == 9) {
				int[] var26 = field2626.field1480;
				int var27 = 15658734;
				if (var17 > 0) {
					var27 = 15597568;
				}
				int var28 = (52736 - arg4 * 512) * 4 + arg1 * 4 + 24624;
				if (var20 == 0 || var20 == 2) {
					var26[var28 + 1536] = var27;
					var26[var28 + 1 + 1024] = var27;
					var26[var28 + 514] = var27;
					var26[var28 + 3] = var27;
				} else {
					var26[var28] = var27;
					var26[var28 + 513] = var27;
					var26[var28 + 1024 + 2] = var27;
					var26[var28 + 1536 + 3] = var27;
				}
			}
		}
		int var29 = field3183.method49(arg0, arg1, arg4);
		if (var29 == 0) {
			return;
		}
		int var30 = var29 >> 14 & 0x7FFF;
		LocType var31 = LocType.method389(var30);
		if (var31.field1320 == -1) {
			return;
		}
		Pix8 var32 = Statics.field800[var31.field1320];
		if (var32 != null) {
			int var33 = (var31.field1286 * 4 - var32.field744) / 2;
			int var34 = (var31.field1298 * 4 - var32.field749) / 2;
			var32.method329(arg1 * 4 + var33 + 48, (104 - (arg4 - -var31.field1298)) * 4 + var34 + 48);
			return;
		}
	}

	@ObfuscatedName("se.a(BLqd;)V")
	public static void method929(IfType arg0) {
		int var1 = arg0.field2445;
		if (var1 >= 1 && var1 <= 100 || var1 >= 701 && var1 <= 800) {
			if (var1 == 1 && class23.field701 == 0) {
				arg0.field2474 = Statics.field726;
				arg0.field2520 = 0;
			} else if (var1 == 1 && class23.field701 == 1) {
				arg0.field2474 = Statics.field3219;
				arg0.field2520 = 0;
			} else if (var1 == 2 && class23.field701 != 2) {
				arg0.field2520 = 0;
				arg0.field2474 = Statics.field957;
			} else {
				int var2 = Statics.field1492;
				if (var1 > 700) {
					var1 -= 601;
				} else {
					var1--;
				}
				if (class23.field701 != 2) {
					var2 = 0;
				}
				if (var2 <= var1) {
					arg0.field2474 = Statics.field3234;
					arg0.field2520 = 0;
				} else {
					arg0.field2474 = class119.field2951[var1];
					arg0.field2520 = 1;
				}
			}
		} else if (var1 >= 101 && var1 <= 200 || var1 >= 801 && var1 <= 900) {
			if (var1 <= 800) {
				var1 -= 101;
			} else {
				var1 -= 701;
			}
			int var3 = Statics.field1492;
			if (class23.field701 != 2) {
				var3 = 0;
			}
			if (var1 >= var3) {
				arg0.field2474 = Statics.field3234;
				arg0.field2520 = 0;
			} else {
				if (class73.field1788[var1] == 0) {
					arg0.field2474 = JagString.join(new JagString[] { Statics.field1383, Statics.field1593 });
				} else if (class73.field1788[var1] < 5000) {
					if (class73.field1788[var1] == class24.field723) {
						arg0.field2474 = JagString.join(new JagString[] { Statics.field2564, Statics.field1407, Statics.method502(class73.field1788[var1]) });
					} else {
						arg0.field2474 = JagString.join(new JagString[] { Statics.field2699, Statics.field1407, Statics.method502(class73.field1788[var1]) });
					}
				} else if (class73.field1788[var1] == class24.field723) {
					arg0.field2474 = JagString.join(new JagString[] { Statics.field2564, Statics.field507, Statics.method502(class73.field1788[var1] - 5000) });
				} else {
					arg0.field2474 = JagString.join(new JagString[] { Statics.field2699, Statics.field507, Statics.method502(class73.field1788[var1] - 5000) });
				}
				arg0.field2520 = 1;
			}
		} else if (var1 == 203) {
			int var4 = Statics.field1492;
			if (class23.field701 != 2) {
				var4 = 0;
			}
			arg0.field2526 = var4 * 15 + 20;
			if (arg0.field2449 >= arg0.field2526) {
				arg0.field2526 = arg0.field2449 + 1;
			}
		} else if (var1 >= 401 && var1 <= 500) {
			var1 -= 401;
			if (var1 == 0 && class23.field701 == 0) {
				arg0.field2474 = Statics.field2431;
				arg0.field2520 = 0;
			} else if (var1 == 1 && class23.field701 == 0) {
				arg0.field2474 = Statics.field957;
				arg0.field2520 = 0;
			} else {
				int var5 = Statics.field2146;
				if (class23.field701 == 0) {
					var5 = 0;
				}
				if (var5 <= var1) {
					arg0.field2520 = 0;
					arg0.field2474 = Statics.field3234;
				} else {
					arg0.field2474 = Statics.method969(class106.field2683[var1]).method36();
					arg0.field2520 = 1;
				}
			}
		} else if (var1 == 503) {
			arg0.field2526 = Statics.field2146 * 15 + 20;
			if (arg0.field2449 >= arg0.field2526) {
				arg0.field2526 = arg0.field2449 + 1;
			}
		} else if (var1 == 324) {
			if (class129.field3157 == -1) {
				class129.field3157 = arg0.field2550;
				field590 = arg0.field2476;
			}
			if (Statics.field2302.field1658) {
				arg0.field2550 = class129.field3157;
			} else {
				arg0.field2550 = field590;
			}
		} else if (var1 == 325) {
			if (class129.field3157 == -1) {
				field590 = arg0.field2476;
				class129.field3157 = arg0.field2550;
			}
			if (Statics.field2302.field1658) {
				arg0.field2550 = field590;
			} else {
				arg0.field2550 = class129.field3157;
			}
		} else if (var1 == 327) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) Statics.field2063 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 0;
			arg0.field2493 = 5;
		} else if (var1 == 328) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) Statics.field2063 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 1;
			arg0.field2493 = 5;
		} else if (var1 == 600) {
			arg0.field2474 = JagString.join(new JagString[] { Statics.field3217, Statics.field3059 });
		} else if (var1 == 620) {
			if (Statics.field1004 < 1) {
				arg0.field2474 = Statics.field3234;
			} else if (Statics.field3268) {
				arg0.field2453 = 16711680;
				arg0.field2474 = Statics.field1094;
			} else {
				arg0.field2453 = 16777215;
				arg0.field2474 = Statics.field2308;
			}
		}
	}

	@ObfuscatedName("hc.a(BI)V")
	public static void method472(int arg0) {
		int[] var1 = field2626.field1480;
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 0;
		}
		for (int var4 = 1; var4 < 103; var4++) {
			int var5 = (52736 - var4 * 512) * 4 + 24628;
			for (int var6 = 1; var6 < 103; var6++) {
				if ((Statics.field898[arg0][var6][var4] & 0x18) == 0) {
					field3183.method52(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (Statics.field898[arg0 + 1][var6][var4] & 0x8) != 0) {
					field3183.method52(var1, var5, arg0 + 1, var6, var4);
				}
				var5 += 4;
			}
		}
		field2626.method553();
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var10 = 1; var10 < 103; var10++) {
				if ((Statics.field898[arg0][var10][var9] & 0x18) == 0) {
					method724(arg0, var10, var7, var8, var9);
				}
				if (arg0 < 3 && (Statics.field898[arg0 + 1][var10][var9] & 0x8) != 0) {
					method724(arg0 + 1, var10, var7, var8, var9);
				}
			}
		}
		Statics.field1433 = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = field3183.method49(Statics.field75, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = LocType.method389(var14).field1294;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var11;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = field2569[Statics.field75].field201;
							for (int var19 = 0; var19 < 10; var19++) {
								int var20 = (int) (Math.random() * 4.0D);
								if (var20 == 0 && var17 > 0 && var17 > var11 - 3 && (var18[var17 - 1][var16] & 0x1280108) == 0) {
									var17--;
								}
								if (var20 == 1 && var17 < 103 && var17 < var11 + 3 && (var18[var17 + 1][var16] & 0x1280180) == 0) {
									var17++;
								}
								if (var20 == 2 && var16 > 0 && var16 > var12 - 3 && (var18[var17][var16 - 1] & 0x1280102) == 0) {
									var16--;
								}
								if (var20 == 3 && var16 < 103 && var12 + 3 > var16 && (var18[var17][var16 + 1] & 0x1280120) == 0) {
									var16++;
								}
							}
						}
						Statics.field3046[Statics.field1433] = Statics.field470[var15];
						Statics.field2023[Statics.field1433] = var17;
						Statics.field2303[Statics.field1433] = var16;
						Statics.field1433++;
					}
				}
			}
		}
	}

	@ObfuscatedName("m.a(B)V")
	public static void method671() {
		Statics.field1749 = 0;
		for (int var0 = -1; var0 < class118.field2939 + Statics.field1341; var0++) {
			ClientEntity var1;
			if (var0 == -1) {
				var1 = Statics.field2621;
			} else if (class118.field2939 > var0) {
				var1 = Statics.field2030[class112.field2758[var0]];
			} else {
				var1 = Statics.field2992[LocChange.field677[var0 - class118.field2939]];
			}
			if (var1 != null && var1.method42()) {
				if (var1 instanceof ClientNpc) {
					NpcType var2 = ((ClientNpc) var1).field3182;
					if (var2.field1136 != null) {
						var2 = var2.method457();
					}
					if (var2 == null) {
						continue;
					}
				}
				if (var0 >= class118.field2939) {
					NpcType var3 = ((ClientNpc) var1).field3182;
					if (var3.field1091 >= 0 && var3.field1091 < Statics.field178.length) {
						Statics.method523(var1.field1991 + 15, var1);
						if (Statics.field1072 > -1) {
							Statics.field178[var3.field1091].method551(Statics.field1072 - 12, Statics.field2188 + -30);
						}
					}
					if (Statics.field96 == 1 && LocChange.field677[var0 - class118.field2939] == Statics.field3212 && Statics.field2063 % 20 < 10) {
						Statics.method523(var1.field1991 + 15, var1);
						if (Statics.field1072 > -1) {
							Statics.field1886[0].method551(Statics.field1072 - 12, Statics.field2188 + -28);
						}
					}
				} else {
					ClientPlayer var4 = (ClientPlayer) var1;
					int var5 = 30;
					if (var4.field76 != -1 || var4.field81 != -1) {
						Statics.method523(var1.field1991 + 15, var1);
						if (Statics.field1072 > -1) {
							if (var4.field76 != -1) {
								Statics.field1376[var4.field76].method551(Statics.field1072 - 12, Statics.field2188 - 30);
								var5 += 25;
							}
							if (var4.field81 != -1) {
								Statics.field178[var4.field81].method551(Statics.field1072 - 12, -var5 + Statics.field2188);
								var5 += 25;
							}
						}
					}
					if (var0 >= 0 && Statics.field96 == 10 && class112.field2758[var0] == Statics.field3290) {
						Statics.method523(var1.field1991 + 15, var1);
						if (Statics.field1072 > -1) {
							Statics.field1886[1].method551(Statics.field1072 - 12, -var5 + Statics.field2188);
						}
					}
				}
				if (var1.field1964 != null && (var0 >= class118.field2939 || Statics.field1864 == 0 || Statics.field1864 == 3 || Statics.field1864 == 1 && Statics.method242(((ClientPlayer) var1).field86))) {
					Statics.method523(var1.field1991, var1);
					if (Statics.field1072 > -1 && Statics.field1684 > Statics.field1749) {
						Statics.field1655[Statics.field1749] = b12.method208(var1.field1964) / 2;
						Statics.field1663[Statics.field1749] = b12.field350;
						Statics.field1690[Statics.field1749] = Statics.field1072;
						Statics.field1660[Statics.field1749] = Statics.field2188;
						Statics.field1687[Statics.field1749] = var1.field1976;
						Statics.field1670[Statics.field1749] = var1.field1997;
						Statics.field1659[Statics.field1749] = var1.field1952;
						Statics.field1672[Statics.field1749] = var1.field1964;
						Statics.field1749++;
					}
				}
				if (Statics.field2063 < var1.field2013) {
					Statics.method523(var1.field1991 + 15, var1);
					if (Statics.field1072 > -1) {
						int var6 = var1.field2004 * 30 / var1.field1975;
						if (var6 > 30) {
							var6 = 30;
						}
						Pix2D.method913(Statics.field1072 - 15, Statics.field2188 + -3, var6, 5, 65280);
						Pix2D.method913(Statics.field1072 + var6 - 15, Statics.field2188 + -3, 30 - var6, 5, 16711680);
					}
				}
				for (int var7 = 0; var7 < 4; var7++) {
					if (Statics.field2063 < var1.field2010[var7]) {
						Statics.method523(var1.field1991 / 2, var1);
						if (Statics.field1072 > -1) {
							if (var7 == 1) {
								Statics.field2188 -= 20;
							}
							if (var7 == 2) {
								Statics.field1072 -= 15;
								Statics.field2188 -= 10;
							}
							if (var7 == 3) {
								Statics.field1072 += 15;
								Statics.field2188 -= 10;
							}
							Statics.field1231[var1.field1960[var7]].method551(Statics.field1072 - 12, Statics.field2188 + -12);
							p11.method209(Statics.method502(var1.field1961[var7]), Statics.field1072, Statics.field2188 + 4, 0);
							p11.method209(Statics.method502(var1.field1961[var7]), Statics.field1072 - 1, Statics.field2188 + 3, 16777215);
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < Statics.field1749; var8++) {
			int var9 = Statics.field1690[var8];
			int var10 = Statics.field1660[var8];
			int var11 = Statics.field1655[var8];
			int var12 = Statics.field1663[var8];
			boolean var13 = true;
			while (var13) {
				var13 = false;
				for (int var14 = 0; var14 < var8; var14++) {
					if (Statics.field1660[var14] - Statics.field1663[var14] < var10 + 2 && var10 - var12 < Statics.field1660[var14] + 2 && var9 - var11 < Statics.field1690[var14] + Statics.field1655[var14] && var9 + var11 > Statics.field1690[var14] + -Statics.field1655[var14] && var10 > Statics.field1660[var14] - Statics.field1663[var14]) {
						var13 = true;
						var10 = Statics.field1660[var14] - Statics.field1663[var14];
					}
				}
			}
			Statics.field1072 = Statics.field1690[var8];
			Statics.field2188 = Statics.field1660[var8] = var10;
			JagString var15 = Statics.field1672[var8];
			if (ClientScript.field527 == 0) {
				int var16 = 16776960;
				if (Statics.field1687[var8] < 6) {
					var16 = Statics.field1458[Statics.field1687[var8]];
				}
				if (Statics.field1687[var8] == 6) {
					var16 = Statics.field2399 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Statics.field1687[var8] == 7) {
					var16 = Statics.field2399 % 20 < 10 ? 255 : 65535;
				}
				if (Statics.field1687[var8] == 8) {
					var16 = Statics.field2399 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Statics.field1687[var8] == 9) {
					int var17 = 150 - Statics.field1659[var8];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}
				if (Statics.field1687[var8] == 10) {
					int var18 = 150 - Statics.field1659[var8];
					if (var18 < 50) {
						var16 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var16 = 16711935 + 16384000 - var18 * 327680;
					} else if (var18 < 150) {
						var16 = (var18 - 100) * 327680 + 255 + 500 - var18 * 5;
					}
				}
				if (Statics.field1687[var8] == 11) {
					int var19 = 150 - Statics.field1659[var8];
					if (var19 < 50) {
						var16 = 16777215 - var19 * 327685;
					} else if (var19 < 100) {
						var16 = (var19 - 50) * 327685 + 65280;
					} else if (var19 < 150) {
						var16 = 16777215 - (var19 - 100) * 327680;
					}
				}
				if (Statics.field1670[var8] == 0) {
					b12.method209(var15, Statics.field1072, Statics.field2188 + 1, 0);
					b12.method209(var15, Statics.field1072, Statics.field2188, var16);
				}
				if (Statics.field1670[var8] == 1) {
					b12.method196(var15, Statics.field1072, Statics.field2188 + 1, 0, Statics.field2399);
					b12.method196(var15, Statics.field1072, Statics.field2188, var16, Statics.field2399);
				}
				if (Statics.field1670[var8] == 2) {
					b12.method198(var15, Statics.field1072, Statics.field2188 + 1, 0, Statics.field2399);
					b12.method198(var15, Statics.field1072, Statics.field2188, var16, Statics.field2399);
				}
				if (Statics.field1670[var8] == 3) {
					b12.method201(var15, Statics.field1072, Statics.field2188 + 1, 0, Statics.field2399, 150 - Statics.field1659[var8]);
					b12.method201(var15, Statics.field1072, Statics.field2188, var16, Statics.field2399, 150 - Statics.field1659[var8]);
				}
				if (Statics.field1670[var8] == 4) {
					int var20 = b12.method208(var15);
					int var21 = (150 - Statics.field1659[var8]) * (var20 + 100) / 150;
					Pix2D.method912(Statics.field1072 - 50, 0, Statics.field1072 + 50, 334);
					b12.method213(var15, Statics.field1072 + 50 - var21, Statics.field2188 + 1, 0);
					b12.method213(var15, Statics.field1072 + 50 - var21, Statics.field2188, var16);
					Pix2D.method919();
				}
				if (Statics.field1670[var8] == 5) {
					int var22 = 0;
					int var23 = 150 - Statics.field1659[var8];
					Pix2D.method912(0, Statics.field2188 - b12.field350 - 1, 512, Statics.field2188 + 5);
					if (var23 < 25) {
						var22 = var23 - 25;
					} else if (var23 > 125) {
						var22 = var23 - 125;
					}
					b12.method209(var15, Statics.field1072, Statics.field2188 + var22 + 1, 0);
					b12.method209(var15, Statics.field1072, Statics.field2188 + var22, var16);
					Pix2D.method919();
				}
			} else {
				b12.method209(var15, Statics.field1072, Statics.field2188 + 1, 0);
				b12.method209(var15, Statics.field1072, Statics.field2188, 16776960);
			}
		}
	}

	@ObfuscatedName("qa.g(I)V")
	public static void method837() {
		for (int var0 = 0; var0 < Statics.field2027; var0++) {
			int var1 = class50.field1348[var0];
			ClientPlayer var2 = Statics.field2030[var1];
			int var3 = Statics.field488.method144();
			if ((var3 & 0x2) != 0) {
				var3 += Statics.field488.method144() << 8;
			}
			method102(var2, var3, var1);
		}
	}

	@ObfuscatedName("ac.a(Laa;BII)V")
	public static void method102(ClientPlayer arg0, int arg1, int arg2) {
		if ((arg1 & 0x100) != 0) {
			int var3 = Statics.field488.method156();
			int var4 = Statics.field488.method152();
			arg0.method727(var4, Statics.field2063, var3);
			arg0.field2013 = Statics.field2063 + 300;
			arg0.field2004 = Statics.field488.method156();
			arg0.field1975 = Statics.field488.method152();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.field2022 = Statics.field488.method145();
			arg0.field1974 = Statics.field488.method166();
		}
		if ((arg1 & 0x1) != 0) {
			int var5 = Statics.field488.method166();
			if (var5 == 65535) {
				var5 = -1;
			}
			int var6 = Statics.field488.method147();
			Statics.method450(var5, var6, arg0);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.field2011 = Statics.field488.method137();
			if (arg0.field2011 == 65535) {
				arg0.field2011 = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			int var7 = Statics.field488.method144();
			int var8 = Statics.field488.method152();
			arg0.method727(var8, Statics.field2063, var7);
			arg0.field2013 = Statics.field2063 + 300;
			arg0.field2004 = Statics.field488.method152();
			arg0.field1975 = Statics.field488.method152();
		}
		if ((arg1 & 0x400) != 0) {
			arg0.field1999 = Statics.field488.method156();
			arg0.field1955 = Statics.field488.method156();
			arg0.field1973 = Statics.field488.method144();
			arg0.field2001 = Statics.field488.method144();
			arg0.field1986 = Statics.field488.method137() + Statics.field2063;
			arg0.field1981 = Statics.field488.method180() + Statics.field2063;
			arg0.field1947 = Statics.field488.method152();
			arg0.method732();
		}
		if ((arg1 & 0x8) != 0) {
			int var9 = Statics.field488.method145();
			int var10 = Statics.field488.method152();
			int var11 = Statics.field488.method147();
			int var12 = Statics.field488.field267;
			if (arg0.field86 != null && arg0.field90 != null) {
				long var13 = arg0.field86.method9();
				boolean var15 = false;
				if (var10 <= 1) {
					for (int var16 = 0; var16 < Statics.field2146; var16++) {
						if (class106.field2683[var16] == var13) {
							var15 = true;
							break;
						}
					}
				}
				if (!var15 && class6.field233 == 0) {
					class117.field2917.field267 = 0;
					Statics.field488.method138(class117.field2917.field284, var11);
					class117.field2917.field267 = 0;
					JagString var17 = Statics.method893(class117.field2917).method4();
					arg0.field1964 = var17.method40();
					arg0.field1952 = 150;
					arg0.field1997 = var9 & 0xFF;
					arg0.field1976 = var9 >> 8;
					if (var10 == 2 || var10 == 3) {
						Statics.method758(1, var17, JagString.join(new JagString[] { Statics.field2535, arg0.field86 }));
					} else if (var10 == 1) {
						Statics.method758(1, var17, JagString.join(new JagString[] { Statics.field2612, arg0.field86 }));
					} else {
						Statics.method758(2, var17, arg0.field86);
					}
				}
			}
			Statics.field488.field267 = var11 + var12;
		}
		if ((arg1 & 0x20) != 0) {
			int var18 = Statics.field488.method144();
			byte[] var19 = new byte[var18];
			Packet var20 = new Packet(var19);
			Statics.field488.method173(var19, var18);
			MidiStream.field1176[arg2] = var20;
			arg0.method43(var20);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.field1965 = Statics.field488.method166();
			int var21 = Statics.field488.method146();
			arg0.field2003 = 0;
			arg0.field1967 = (var21 & 0xFFFF) + Statics.field2063;
			if (arg0.field1965 == 65535) {
				arg0.field1965 = -1;
			}
			arg0.field2014 = 0;
			arg0.field1984 = var21 >> 16;
			if (arg0.field1967 > Statics.field2063) {
				arg0.field2014 = -1;
			}
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		arg0.field1964 = Statics.field488.method140();
		if (arg0.field1964.method6(0) == 126) {
			arg0.field1964 = arg0.field1964.method1(1);
			Statics.method758(2, arg0.field1964, arg0.field86);
		} else if (Statics.field2621 == arg0) {
			Statics.method758(2, arg0.field1964, arg0.field86);
		}
		arg0.field1952 = 150;
		arg0.field1976 = 0;
		arg0.field1997 = 0;
	}

	@ObfuscatedName("l.a(B)V")
	public static void method633() {
		int var0 = Statics.field488.method412(8);
		if (class118.field2939 > var0) {
			for (int var1 = var0; var1 < class118.field2939; var1++) {
				Statics.field375[class31.field841++] = class112.field2758[var1];
			}
		}
		if (var0 > class118.field2939) {
			throw new RuntimeException("gppov1");
		}
		class118.field2939 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class112.field2758[var2];
			ClientPlayer var4 = Statics.field2030[var3];
			int var5 = Statics.field488.method412(1);
			if (var5 == 0) {
				class112.field2758[class118.field2939++] = var3;
				var4.field2008 = Statics.field2063;
			} else {
				int var6 = Statics.field488.method412(2);
				if (var6 == 0) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = Statics.field2063;
					class50.field1348[Statics.field2027++] = var3;
				} else if (var6 == 1) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = Statics.field2063;
					int var7 = Statics.field488.method412(3);
					var4.method725(var7, false);
					int var8 = Statics.field488.method412(1);
					if (var8 == 1) {
						class50.field1348[Statics.field2027++] = var3;
					}
				} else if (var6 == 2) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = Statics.field2063;
					int var9 = Statics.field488.method412(3);
					var4.method725(var9, true);
					int var10 = Statics.field488.method412(3);
					var4.method725(var10, true);
					int var11 = Statics.field488.method412(1);
					if (var11 == 1) {
						class50.field1348[Statics.field2027++] = var3;
					}
				} else if (var6 == 3) {
					Statics.field375[class31.field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII[Lqd;Z)Z")
	public static boolean method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, IfType[] arg8) {
		Pix2D.method912(arg2, arg1, arg6, arg5);
		boolean var9 = true;
		for (int var10 = 0; var10 < arg8.length; var10++) {
			IfType var11 = arg8[var10];
			if (var11 != null && var11.field2454 == arg4) {
				if (var11.field2445 > 0) {
					method929(var11);
				}
				int var12 = var11.field2462 + arg2;
				if (!var11.field2500) {
					var12 -= arg3;
				}
				int var13 = var11.field2502 + arg1;
				if (!var11.field2500) {
					var13 -= arg7;
				}
				int var14 = var11.field2551;
				if (class17.field548 == var11) {
					var14 = 128;
					IfType var15 = Statics.method1009(var11);
					int[] var16 = Statics.method325(var15);
					int[] var17 = Statics.method325(var11);
					int var18 = var17[1] + class102.field2568 - var16[1] - Statics.field2392;
					if (var18 < 0) {
						var18 = 0;
					}
					if (var18 + var11.field2449 > var15.field2449) {
						var18 = var15.field2449 - var11.field2449;
					}
					var13 = var16[1] + var18;
					int var19 = class24.field741 + var17[0] - var16[0] - class12.field419;
					if (var19 < 0) {
						var19 = 0;
					}
					if (var19 + var11.field2498 > var15.field2498) {
						var19 = var15.field2498 - var11.field2498;
					}
					var12 = var16[0] + var19;
				}
				if (!var11.field2442 || Pix2D.field2753 >= var12 && Pix2D.field2751 >= var13 && Pix2D.field2752 <= var11.field2498 + var12 && var13 + var11.field2449 >= Pix2D.field2748) {
					if (var11.field2489 == 0) {
						if (var11.field2556 && !Statics.method631(arg0, var10)) {
							continue;
						}
						if (!var11.field2442) {
							if (var11.field2526 - var11.field2449 < var11.field2537) {
								var11.field2537 = var11.field2526 - var11.field2449;
							}
							if (var11.field2537 < 0) {
								var11.field2537 = 0;
							}
						}
						var9 &= method278(arg0, var13, var12, var11.field2552, var10, var11.field2449 + var13, var11.field2498 + var12, var11.field2537, arg8);
						if (var11.field2519 != null) {
							var9 &= method278(arg0, var13, var12, var11.field2552, var11.field2495, var13 + var11.field2449, var11.field2498 + var12, var11.field2537, var11.field2519);
						}
						Pix2D.method912(arg2, arg1, arg6, arg5);
						if (var11.field2449 < var11.field2526) {
							Statics.method601(var11.field2537, var11.field2526, var11.field2498 + var12, var11.field2449, var13);
						}
					}
					if (var11.field2489 != 1) {
						if (var11.field2489 == 2) {
							int var20 = 0;
							for (int var21 = 0; var21 < var11.field2449; var21++) {
								for (int var22 = 0; var22 < var11.field2498; var22++) {
									int var23 = (var11.field2555 + 32) * var22 + var12;
									int var24 = (var11.field2473 + 32) * var21 + var13;
									if (var20 < 20) {
										var23 += var11.field2505[var20];
										var24 += var11.field2514[var20];
									}
									if (var11.field2491[var20] > 0) {
										int var26 = 0;
										int var27 = var11.field2491[var20] - 1;
										int var28 = 0;
										if (Pix2D.field2752 - 32 < var23 && var23 < Pix2D.field2753 && Pix2D.field2748 - 32 < var24 && Pix2D.field2751 > var24 || Statics.field857 != 0 && class113.field2776 == var20) {
											int var29 = 0;
											if (class14.field475 == 1 && Statics.field2281 == var20 && Statics.field1075 == var11.field2495) {
												var29 = 16777215;
											}
											Pix32 var30 = Statics.method1007(var11.field2516[var20], var27, var29);
											if (var30 == null) {
												var9 = false;
											} else {
												if (Statics.field857 != 0 && class113.field2776 == var20 && Statics.field2410 == var11.field2495) {
													var28 = class102.field2568 - ObjType.field2829;
													var26 = class24.field741 - Statics.field3143;
													if (var26 < 5 && var26 > -5) {
														var26 = 0;
													}
													if (var28 < 5 && var28 > -5) {
														var28 = 0;
													}
													if (Statics.field298 < 5) {
														var28 = 0;
														var26 = 0;
													}
													var30.method558(var23 + var26, var24 + var28, 128);
													if (arg4 != -1) {
														IfType var31 = arg8[arg4];
														if (var24 + var28 < Pix2D.field2748 && var31.field2537 > 0) {
															int var32 = (Pix2D.field2748 - var24 - var28) * class9.field321 / 3;
															if (class9.field321 * 10 < var32) {
																var32 = class9.field321 * 10;
															}
															if (var32 > var31.field2537) {
																var32 = var31.field2537;
															}
															var31.field2537 -= var32;
															ObjType.field2829 += var32;
														}
														if (Pix2D.field2751 < var24 + var28 + 32 && var31.field2537 < var31.field2526 - var31.field2449) {
															int var33 = (var24 + var28 + 32 - Pix2D.field2751) * class9.field321 / 3;
															if (class9.field321 * 10 < var33) {
																var33 = class9.field321 * 10;
															}
															if (var31.field2526 - var31.field2537 - var31.field2449 < var33) {
																var33 = var31.field2526 - var31.field2449 - var31.field2537;
															}
															ObjType.field2829 -= var33;
															var31.field2537 += var33;
														}
													}
												} else if (Statics.field656 != 0 && class105.field2649 == var20 && Statics.field1679 == var11.field2495) {
													var30.method558(var23, var24, 128);
												} else {
													var30.method551(var23, var24);
												}
												if (var30.field1479 == 33 || var11.field2516[var20] != 1) {
													int var34 = var11.field2516[var20];
													p11.method213(Statics.method862(var34), var23 + var26 + 1, var24 + 10 - -var28, 0);
													p11.method213(Statics.method862(var34), var23 + var26, var24 - -9 + var28, 16776960);
												}
											}
										}
									} else if (var11.field2510 != null && var20 < 20) {
										Pix32 var25 = var11.method852(var20);
										if (var25 != null) {
											var25.method551(var23, var24);
										} else if (Statics.field3116) {
											var9 = false;
										}
									}
									var20++;
								}
							}
						} else if (var11.field2489 == 3) {
							int var35;
							if (Statics.method947(var11)) {
								var35 = var11.field2532;
								if (Statics.method631(arg0, var10) && var11.field2469 != 0) {
									var35 = var11.field2469;
								}
							} else {
								var35 = var11.field2453;
								if (Statics.method631(arg0, var10) && var11.field2525 != 0) {
									var35 = var11.field2525;
								}
							}
							if (var14 == 0) {
								if (var11.field2451) {
									Pix2D.method913(var12, var13, var11.field2498, var11.field2449, var35);
								} else {
									Pix2D.method922(var12, var13, var11.field2498, var11.field2449, var35);
								}
							} else if (var11.field2451) {
								Pix2D.method921(var12, var13, var11.field2498, var11.field2449, var35, 256 - (var14 & 0xFF));
							} else {
								Pix2D.method911(var12, var13, var11.field2498, var11.field2449, var35, 256 - (var14 & 0xFF));
							}
						} else if (var11.field2489 == 4) {
							PixFont var36 = var11.method861();
							if (var36 != null) {
								JagString var37 = var11.field2474;
								int var38;
								if (Statics.method947(var11)) {
									var38 = var11.field2532;
									if (Statics.method631(arg0, var10) && var11.field2469 != 0) {
										var38 = var11.field2469;
									}
									if (var11.field2446.method10() > 0) {
										var37 = var11.field2446;
									}
								} else {
									var38 = var11.field2453;
									if (Statics.method631(arg0, var10) && var11.field2525 != 0) {
										var38 = var11.field2525;
									}
								}
								if (var11.field2442 && var11.field2524 != -1) {
									ObjType var39 = ObjType.method760(var11.field2524);
									var37 = var39.field2827;
									if (var37 == null) {
										var37 = Statics.field1631;
									}
									if (var39.field2826 == 1 || var11.field2540 != 1) {
										var37 = JagString.join(new JagString[] { var37, Statics.field1649, Statics.method803(var11.field2540) });
									}
								}
								if (var11.field2520 == 6 && Statics.field2998 == var11.field2495) {
									var38 = var11.field2453;
									var37 = Statics.field957;
								}
								if (Statics.field2749 == 479) {
									if (var38 == 16776960) {
										var38 = 255;
									}
									if (var38 == 49152) {
										var38 = 16777215;
									}
								}
								JagString var40 = Statics.method386(var11, var37);
								var36.method195(var40, var12, var13, var11.field2498, var11.field2449, var38, var11.field2471, var11.field2539, var11.field2521, var11.field2538);
							} else if (Statics.field3116) {
								var9 = false;
							}
						} else if (var11.field2489 == 5) {
							if (var11.field2442) {
								int var42 = 0;
								int var43 = 0;
								Pix32 var44;
								if (var11.field2524 == -1) {
									var44 = var11.method857(false);
								} else {
									var44 = Statics.method1007(var11.field2540, var11.field2524, 0);
									var42 = var44.field1479;
									var43 = var44.field1477;
									var44.field1477 = 32;
									var44.field1479 = 32;
								}
								if (var44 != null) {
									int var45 = var44.field1475;
									int var46 = var44.field1476;
									if (var11.field2447) {
										int[] var48 = new int[4];
										Pix2D.method918(var48);
										int var49 = var12;
										if (var48[0] > var12) {
											var49 = var48[0];
										}
										int var50 = var13;
										if (var48[1] > var13) {
											var50 = var48[1];
										}
										int var51 = var11.field2498 + var12;
										if (var48[2] < var51) {
											var51 = var48[2];
										}
										int var52 = var11.field2449 + var13;
										if (var52 > var48[3]) {
											var52 = var48[3];
										}
										Pix2D.method912(var49, var50, var51, var52);
										int var53 = (var11.field2498 + var46 - 1) / var46;
										int var54 = (var11.field2449 + var45 - 1) / var45;
										for (int var55 = 0; var55 < var53; var55++) {
											for (int var56 = 0; var56 < var54; var56++) {
												if (var11.field2557 != 0) {
													var44.method550(var46 / 2 + var46 * var55 + var12, var45 / 2 + (var13 - -(var45 * var56)), var11.field2557, 4096);
												} else if (var14 == 0) {
													var44.method551(var46 * var55 + var12, var45 * var56 + var13);
												} else {
													var44.method558(var12 + var46 * var55, var13 - -(var45 * var56), 256 - (var14 & 0xFF));
												}
											}
										}
										Pix2D.method914(var48);
									} else {
										int var47 = var11.field2498 * 4096 / var46;
										if (var11.field2557 != 0) {
											var44.method550(var11.field2498 / 2 + var12, var11.field2449 / 2 + var13, var11.field2557, var47);
										} else if (var14 != 0) {
											var44.method546(var12, var13, var11.field2498, var11.field2449, 256 - (var14 & 0xFF));
										} else if (var11.field2498 == var46 && var11.field2449 == var45) {
											var44.method551(var12, var13);
										} else {
											var44.method562(var12, var13, var11.field2498, var11.field2449);
										}
									}
								} else if (Statics.field3116) {
									var9 = false;
								}
								if (var11.field2524 != -1) {
									if (var11.field2540 != 1 || var42 == 33) {
										p11.method213(Statics.method502(var11.field2540), var12 + 1, var13 + 10, 0);
										p11.method213(Statics.method502(var11.field2540), var12, var13 + 9, 16776960);
									}
									var44.field1479 = var42;
									var44.field1477 = var43;
								}
							} else {
								Pix32 var41 = var11.method857(Statics.method947(var11));
								if (var41 != null) {
									var41.method551(var12, var13);
								} else if (Statics.field3116) {
									var9 = false;
								}
							}
						} else if (var11.field2489 == 6) {
							boolean var57 = Statics.method947(var11);
							int var58;
							if (var57) {
								var58 = var11.field2459;
							} else {
								var58 = var11.field2465;
							}
							Model var59;
							if (var11.field2493 == 5) {
								if (var11.field2479 == 0) {
									var59 = Statics.field2302.method637(null, null, -1, -1);
								} else {
									var59 = Statics.field2621.method41();
								}
							} else if (var58 == -1) {
								var59 = var11.method860(null, -1, var57, Statics.field2621.field90);
								if (var59 == null && Statics.field3116) {
									var9 = false;
								}
							} else {
								SeqType var60 = SeqType.method103(var58);
								var59 = var11.method860(var60, var11.field2460, var57, Statics.field2621.field90);
								if (var59 == null && Statics.field3116) {
									var9 = false;
								}
							}
							int var61 = var11.field2496;
							int var62 = var11.field2531;
							int var63 = var11.field2485;
							int var64 = var11.field2463;
							int var65 = var11.field2543;
							int var66 = var11.field2534;
							if (var11.field2524 != -1) {
								ObjType var67 = ObjType.method760(var11.field2524);
								if (var67 != null) {
									ObjType var68 = var67.method944(var11.field2540);
									var59 = var68.method954(true, 1);
									var62 = var68.field2858;
									var63 = var68.field2841;
									var65 = var68.field2837;
									var61 = var68.field2875;
									var66 = var68.field2848;
									var64 = var68.field2861;
									if (var11.field2498 > 0) {
										var66 = var66 * 32 / var11.field2498;
									}
								}
							}
							Pix3D.method364(var11.field2498 / 2 + var12, var11.field2449 / 2 + var13);
							int var69 = Pix3D.field775[var61] * var66 >> 16;
							int var70 = Pix3D.field778[var61] * var66 >> 16;
							if (var59 != null) {
								if (var11.field2442) {
									var59.method766();
									if (var11.field2507) {
										var59.method769(var64, var62, var61, var65, var59.field3135 / 2 + var63 + var69, var70 - -var63, var66);
									} else {
										var59.method780(var64, var62, var61, var65, var59.field3135 / 2 + var69 + var63, var63 + var70);
									}
								} else {
									var59.method780(var64, 0, var61, 0, var69, var70);
								}
							}
							Pix3D.method356();
						} else {
							if (var11.field2489 == 7) {
								PixFont var71 = var11.method861();
								if (var71 == null) {
									if (Statics.field3116) {
										var9 = false;
									}
									continue;
								}
								int var72 = 0;
								for (int var73 = 0; var73 < var11.field2449; var73++) {
									for (int var74 = 0; var74 < var11.field2498; var74++) {
										if (var11.field2491[var72] > 0) {
											ObjType var75 = ObjType.method760(var11.field2491[var72] - 1);
											JagString var76 = var75.field2827;
											if (var76 == null) {
												var76 = Statics.field1631;
											}
											if (var75.field2826 == 1 || var11.field2516[var72] != 1) {
												var76 = JagString.join(new JagString[] { var76, Statics.field1649, Statics.method803(var11.field2516[var72]) });
											}
											int var77 = (var11.field2555 + 115) * var74 + var12;
											int var78 = (var11.field2473 + 12) * var73 + var13;
											if (var11.field2539 == 0) {
												var71.method206(var76, var77, var78, var11.field2453, var11.field2471);
											} else if (var11.field2539 == 1) {
												var71.method211(var76, var11.field2498 / 2 + var77, var78, var11.field2453, var11.field2471);
											} else {
												var71.method200(var76, var11.field2498 + var77 - 1, var78, var11.field2453, var11.field2471);
											}
										}
										var72++;
									}
								}
							}
							if (var11.field2489 == 8 && Statics.method720(arg0, var10) && class106.field2673 == Statics.field57) {
								int var79 = 0;
								int var80 = 0;
								PixFont var81 = p12;
								JagString var82 = var11.field2474;
								JagString var83 = Statics.method386(var11, var82);
								while (var83.method10() > 0) {
									int var84 = var83.method11(Statics.field1661);
									JagString var85;
									if (var84 == -1) {
										var85 = var83;
										var83 = Statics.field3234;
									} else {
										var85 = var83.method19(0, var84);
										var83 = var83.method1(var84 + 2);
									}
									int var86 = var81.method204(var85);
									var80 += var81.field350 + 1;
									if (var79 < var86) {
										var79 = var86;
									}
								}
								var80 += 7;
								int var87 = var11.field2449 + var13 + 5;
								if (var80 + var87 > arg5) {
									var87 = arg5 - var80;
								}
								var79 += 6;
								int var88 = var11.field2498 + var12 - var79 - 5;
								if (var88 < var12 + 5) {
									var88 = var12 + 5;
								}
								if (var79 + var88 > arg6) {
									var88 = arg6 - var79;
								}
								Pix2D.method913(var88, var87, var79, var80, 16777120);
								Pix2D.method922(var88, var87, var79, var80, 0);
								JagString var89 = var11.field2474;
								int var90 = var87 + var81.field350 + 2;
								JagString var91 = Statics.method386(var11, var89);
								while (var91.method10() > 0) {
									int var92 = var91.method11(Statics.field1661);
									JagString var93;
									if (var92 == -1) {
										var93 = var91;
										var91 = Statics.field3234;
									} else {
										var93 = var91.method19(0, var92);
										var91 = var91.method1(var92 + 2);
									}
									var81.method206(var93, var88 + 3, var90, 0, false);
									var90 += var81.field350 + 1;
								}
							}
							if (var11.field2489 == 9) {
								Pix2D.method923(var12, var13, var11.field2498 + var12, var11.field2449 + var13, var11.field2453);
							}
						}
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("t.a(ZLnb;)V")
	public static void method937(ClientEntity arg0) {
		arg0.field1979 = false;
		if (arg0.field1951 != -1) {
			SeqType var1 = SeqType.method103(arg0.field1951);
			if (var1 == null || var1.field1242 == null) {
				arg0.field1951 = -1;
			} else {
				arg0.field1994++;
				if (arg0.field1990 < var1.field1242.length && var1.field1223[arg0.field1990] < arg0.field1994) {
					arg0.field1990++;
					arg0.field1994 = 1;
				}
				if (var1.field1242.length <= arg0.field1990) {
					arg0.field1990 = 0;
					arg0.field1994 = 0;
				}
			}
		}
		if (arg0.field1965 != -1 && arg0.field1967 <= Statics.field2063) {
			if (arg0.field2014 < 0) {
				arg0.field2014 = 0;
			}
			int var2 = SpotType.method713(arg0.field1965).field786;
			if (var2 == -1) {
				arg0.field1965 = -1;
			} else {
				SeqType var3 = SeqType.method103(var2);
				if (var3 == null || var3.field1242 == null) {
					arg0.field1965 = -1;
				} else {
					arg0.field2003++;
					if (var3.field1242.length > arg0.field2014 && arg0.field2003 > var3.field1223[arg0.field2014]) {
						arg0.field2003 = 1;
						arg0.field2014++;
					}
					if (var3.field1242.length <= arg0.field2014 && (arg0.field2014 < 0 || var3.field1242.length <= arg0.field2014)) {
						arg0.field1965 = -1;
					}
				}
			}
		}
		if (arg0.field2015 != -1 && arg0.field1996 <= 1) {
			SeqType var4 = SeqType.method103(arg0.field2015);
			if (var4.field1227 == 1 && arg0.field1968 > 0 && arg0.field1986 <= Statics.field2063 && arg0.field1981 < Statics.field2063) {
				arg0.field1996 = 1;
				return;
			}
		}
		if (arg0.field2015 != -1 && arg0.field1996 == 0) {
			SeqType var5 = SeqType.method103(arg0.field2015);
			if (var5 == null || var5.field1242 == null) {
				arg0.field2015 = -1;
			} else {
				arg0.field1989++;
				if (var5.field1242.length > arg0.field1978 && var5.field1223[arg0.field1978] < arg0.field1989) {
					arg0.field1978++;
					arg0.field1989 = 1;
				}
				if (var5.field1242.length <= arg0.field1978) {
					arg0.field1978 -= var5.field1254;
					arg0.field1969++;
					if (var5.field1252 <= arg0.field1969) {
						arg0.field2015 = -1;
					}
					if (arg0.field1978 < 0 || arg0.field1978 >= var5.field1242.length) {
						arg0.field2015 = -1;
					}
				}
				arg0.field1979 = var5.field1253;
			}
		}
		if (arg0.field1996 > 0) {
			arg0.field1996--;
		}
	}

	@ObfuscatedName("ad.a(Z)Z")
	public static boolean method111() {
		if (Statics.field1450 == null) {
			return false;
		}
		try {
			int var0 = Statics.field1450.method1020();
			if (var0 == 0) {
				return false;
			}
			if (field2761 == -1) {
				Statics.field1450.method1014(0, 1, Statics.field488.field284);
				Statics.field488.field267 = 0;
				var0--;
				field2761 = Statics.field488.method409();
				Statics.field2547 = class50.field1353[field2761];
			}
			if (Statics.field2547 == -1) {
				if (var0 <= 0) {
					return false;
				}
				Statics.field1450.method1014(0, 1, Statics.field488.field284);
				Statics.field2547 = Statics.field488.field284[0] & 0xFF;
				var0--;
			}
			if (Statics.field2547 == -2) {
				if (var0 <= 1) {
					return false;
				}
				var0 -= 2;
				Statics.field1450.method1014(0, 2, Statics.field488.field284);
				Statics.field488.field267 = 0;
				Statics.field2547 = Statics.field488.method145();
			}
			if (Statics.field2547 > var0) {
				return false;
			}
			Statics.field488.field267 = 0;
			Statics.field1450.method1014(0, Statics.field2547, Statics.field488.field284);
			class99.field2434 = Statics.field498;
			Statics.field1855 = 0;
			Statics.field498 = Statics.field36;
			Statics.field36 = field2761;
			if (field2761 == 71) {
				long var1 = Statics.field488.method174();
				JagString var3 = Statics.method893(Statics.field488).method4();
				Statics.method758(6, var3, Statics.method969(var1).method36());
				field2761 = -1;
				return true;
			}
			if (field2761 == 156) {
				long var4 = Statics.field488.method174();
				int var6 = Statics.field488.method145();
				JagString var7 = Statics.method969(var4).method36();
				for (int var8 = 0; var8 < Statics.field1492; var8++) {
					if (class117.field2929[var8] == var4) {
						if (class73.field1788[var8] != var6) {
							class73.field1788[var8] = var6;
							Statics.field1055 = true;
							if (var6 > 0) {
								Statics.method758(5, JagString.join(new JagString[] { var7, Statics.field2126 }), Statics.field3234);
							}
							if (var6 == 0) {
								Statics.method758(5, JagString.join(new JagString[] { var7, Statics.field1510 }), Statics.field3234);
							}
						}
						var7 = null;
						break;
					}
				}
				boolean var9 = false;
				if (var7 != null && Statics.field1492 < 200) {
					class117.field2929[Statics.field1492] = var4;
					class119.field2951[Statics.field1492] = var7;
					class73.field1788[Statics.field1492] = var6;
					Statics.field1492++;
					Statics.field1055 = true;
				}
				while (!var9) {
					var9 = true;
					for (int var10 = 0; var10 < Statics.field1492 - 1; var10++) {
						if (class73.field1788[var10] != class24.field723 && class73.field1788[var10 + 1] == class24.field723 || class73.field1788[var10] == 0 && class73.field1788[var10 + 1] != 0) {
							var9 = false;
							int var11 = class73.field1788[var10];
							class73.field1788[var10] = class73.field1788[var10 + 1];
							class73.field1788[var10 + 1] = var11;
							JagString var12 = class119.field2951[var10];
							class119.field2951[var10] = class119.field2951[var10 + 1];
							class119.field2951[var10 + 1] = var12;
							long var13 = class117.field2929[var10];
							class117.field2929[var10] = class117.field2929[var10 + 1];
							class117.field2929[var10 + 1] = var13;
							Statics.field1055 = true;
						}
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 233) {
				field2761 = -1;
				VarBitType.field941 = 0;
				return true;
			}
			if (field2761 == 7) {
				Statics.field2043 = false;
				for (int var15 = 0; var15 < 5; var15++) {
					Statics.field632[var15] = false;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 23) {
				Statics.method524(true);
				field2761 = -1;
				return true;
			}
			if (field2761 == 222) {
				byte var16 = Statics.field488.method168();
				int var17 = Statics.field488.method137();
				Statics.field304[var17] = var16;
				if (class113.field2803[var17] != var16) {
					class113.field2803[var17] = var16;
					method476(var17);
					Statics.field1055 = true;
					if (Statics.field2421 != -1) {
						class105.field2637 = true;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 115) {
				boolean var18 = Statics.field488.method144() == 1;
				int var19 = Statics.field488.method146();
				IfType var20 = Statics.method1053(var19);
				var20.field2556 = var18;
				field2761 = -1;
				return true;
			}
			if (field2761 == 12) {
				Statics.field1055 = true;
				int var21 = Statics.field488.method167();
				IfType var22 = Statics.method1053(var21);
				if (var22.field2442) {
					IfType[] var24 = Statics.field2922[var21 >> 16];
					for (int var25 = 0; var25 < var24.length; var25++) {
						IfType var26 = var24[var25];
						if ((var22.field2495 & 0xFFFF) == (var26.field2454 & 0xFFFF) && var26.field2542 > 0) {
							var26.field2540 = 0;
							var26.field2524 = -1;
						}
					}
				} else {
					for (int var23 = 0; var23 < var22.field2491.length; var23++) {
						var22.field2491[var23] = 0;
						var22.field2516[var23] = 0;
					}
				}
				int var27 = Statics.field488.method145();
				for (int var28 = 0; var28 < var27; var28++) {
					int var29 = Statics.field488.method152();
					if (var29 == 255) {
						var29 = Statics.field488.method167();
					}
					int var30 = Statics.field488.method137();
					if (var22.field2442) {
						IfType[] var31 = Statics.field2922[var21 >> 16];
						for (int var32 = 0; var32 < var31.length; var32++) {
							IfType var33 = var31[var32];
							if ((var22.field2495 & 0xFFFF) == (var33.field2454 & 0xFFFF) && var28 + 1 == var33.field2542) {
								var33.field2540 = var29;
								var33.field2524 = var30 - 1;
							}
						}
					} else if (var22.field2491.length > var28) {
						var22.field2491[var28] = var30;
						var22.field2516[var28] = var29;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 250) {
				int var34 = Statics.field488.method166();
				int var35 = Statics.field488.method146();
				IfType var36 = Statics.method1053(var35);
				var36.field2479 = var34;
				var36.field2493 = 1;
				field2761 = -1;
				return true;
			}
			if (field2761 == 255) {
				int var37 = Statics.field488.method144();
				int var38 = Statics.field488.method144();
				int var39 = Statics.field488.method144();
				int var40 = Statics.field488.method144();
				Statics.field632[var37] = true;
				class14.field471[var37] = var38;
				field1599[var37] = var39;
				class113.field2782[var37] = var40;
				Statics.field1019[var37] = 0;
				field2761 = -1;
				return true;
			}
			if (field2761 == 235) {
				Statics.field1587 = Statics.field488.method144();
				field2761 = -1;
				return true;
			}
			if (field2761 == 48) {
				Statics.field1470 = Statics.field488.method144();
				field2761 = -1;
				return true;
			}
			if (field2761 == 82) {
				JagString var41 = Statics.field488.method140();
				if (var41.method38(Statics.field1229)) {
					JagString var53 = var41.method19(0, var41.method11(Statics.field2165));
					long var54 = var53.method9();
					boolean var56 = false;
					for (int var57 = 0; var57 < Statics.field2146; var57++) {
						if (class106.field2683[var57] == var54) {
							var56 = true;
							break;
						}
					}
					if (!var56 && class6.field233 == 0) {
						Statics.method758(4, Statics.field231, var53);
					}
				} else if (var41.method38(Statics.field1191)) {
					JagString var48 = var41.method19(0, var41.method11(Statics.field2165));
					long var49 = var48.method9();
					boolean var51 = false;
					for (int var52 = 0; var52 < Statics.field2146; var52++) {
						if (class106.field2683[var52] == var49) {
							var51 = true;
							break;
						}
					}
					if (!var51 && class6.field233 == 0) {
						Statics.method758(8, Statics.field3008, var48);
					}
				} else if (var41.method38(Statics.field2085)) {
					JagString var42 = var41.method19(0, var41.method11(Statics.field2165));
					long var43 = var42.method9();
					boolean var45 = false;
					for (int var46 = 0; var46 < Statics.field2146; var46++) {
						if (class106.field2683[var46] == var43) {
							var45 = true;
							break;
						}
					}
					if (!var45 && class6.field233 == 0) {
						JagString var47 = var41.method19(var41.method11(Statics.field2165) + 1, var41.method10() + -9);
						Statics.method758(8, var47, var42);
					}
				} else {
					Statics.method758(0, var41, Statics.field3234);
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 182) {
				int var58 = Statics.field488.method145();
				int var59 = Statics.field488.method161();
				IfType var60 = Statics.method1053(var59);
				field2761 = -1;
				if (var60 != null && var60.field2489 == 0) {
					if (var58 < 0) {
						var58 = 0;
					}
					if (var60.field2526 - var60.field2449 < var58) {
						var58 = var60.field2526 - var60.field2449;
					}
					var60.field2537 = var58;
				}
				return true;
			}
			if (field2761 == 174) {
				int var61 = Statics.field488.method146();
				IfType var62 = Statics.method1053(var61);
				if (var62.field2442) {
					IfType[] var63 = Statics.field2922[var61 >> 16];
					for (int var64 = 0; var64 < var63.length; var64++) {
						IfType var65 = var63[var64];
						if ((var62.field2495 & 0xFFFF) == (var65.field2454 & 0xFFFF) && var65.field2542 > 0) {
							var65.field2524 = -1;
							var65.field2540 = 0;
						}
					}
				} else {
					for (int var66 = 0; var66 < var62.field2491.length; var66++) {
						var62.field2491[var66] = -1;
						var62.field2491[var66] = 0;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 130) {
				BZip2State.field1844 = Statics.field488.method166();
				field2761 = -1;
				return true;
			}
			if (field2761 == 129) {
				int var67 = Statics.field488.method147();
				int var68 = Statics.field488.method152();
				int var69 = Statics.field488.method147();
				Statics.field75 = var67 >> 1;
				Statics.field2621.method729(var69, (var67 & 0x1) == 1, var68);
				field2761 = -1;
				return true;
			}
			if (field2761 == 181) {
				Statics.method847();
				field2761 = -1;
				return false;
			}
			if (field2761 == 24) {
				int var70 = Statics.field488.method139();
				int var71 = Statics.field488.method167();
				IfType var72 = Statics.method1053(var71);
				if (var72.field2465 != var70 || var70 == -1) {
					var72.field2466 = 0;
					var72.field2460 = 0;
					var72.field2465 = var70;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 56) {
				int var73 = Statics.field488.method136();
				if (var73 >= 0) {
					Statics.method746(var73);
				}
				if (class113.field2800 != var73) {
					Statics.method895(class113.field2800);
					class113.field2800 = var73;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 117) {
				int var74 = Statics.field488.method145();
				int var75 = Statics.field488.method180();
				int var76 = Statics.field488.method161();
				IfType var77 = Statics.method1053(var76);
				field2761 = -1;
				var77.field2528 = (var74 << 16) + var75;
				return true;
			}
			if (field2761 == 84) {
				int var78 = Statics.field488.method145();
				int var79 = Statics.field488.method180();
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (Statics.field1143 != -1) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = -1;
					Statics.method399(30);
				}
				if (Statics.field1881 != -1) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = -1;
				}
				if (Statics.field3227 != var79) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = var79;
				}
				if (class66.field1648 != var78) {
					Statics.method895(class66.field1648);
					class66.field1648 = var78;
				}
				Statics.field2998 = -1;
				if (Statics.field2811 != 0) {
					class105.field2637 = true;
					Statics.field2811 = 0;
				}
				Statics.field1055 = true;
				Statics.field2364 = true;
				field2761 = -1;
				return true;
			}
			if (field2761 == 64) {
				Statics.field893 = Statics.field488.method144();
				Statics.field1471 = Statics.field488.method152();
				for (int var80 = Statics.field1471; var80 < Statics.field1471 + 8; var80++) {
					for (int var81 = Statics.field893; var81 < Statics.field893 + 8; var81++) {
						if (class17.field552[Statics.field75][var80][var81] != null) {
							class17.field552[Statics.field75][var80][var81] = null;
							Statics.method1011(var81, var80);
						}
					}
				}
				for (LocChange var82 = (LocChange) Statics.field2284.method802(); var82 != null; var82 = (LocChange) Statics.field2284.method809()) {
					if (var82.field700 >= Statics.field1471 && Statics.field1471 + 8 > var82.field700 && var82.field699 >= Statics.field893 && Statics.field893 + 8 > var82.field699 && Statics.field75 == var82.field679) {
						var82.field692 = 0;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 223) {
				JagString var83 = Statics.field488.method140();
				int var84 = Statics.field488.method156();
				int var85 = Statics.field488.method144();
				if (var85 >= 1 && var85 <= 5) {
					if (var83.method14(Statics.field1631)) {
						var83 = null;
					}
					field599[var85 - 1] = var83;
					class24.field735[var85 - 1] = var84 == 0;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 118) {
				int var86 = Statics.field488.method145();
				Statics.method746(var86);
				if (class66.field1648 != -1) {
					Statics.method895(class66.field1648);
					Statics.field2364 = true;
					class66.field1648 = -1;
					Statics.field1055 = true;
				}
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (Statics.field1143 != -1) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = -1;
					Statics.method399(30);
				}
				if (Statics.field1881 != -1) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = -1;
				}
				if (Statics.field3227 != var86) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = var86;
				}
				Statics.field2998 = -1;
				if (Statics.field2811 != 0) {
					class105.field2637 = true;
					Statics.field2811 = 0;
				}
				Statics.method1018(Statics.field3227);
				field2761 = -1;
				return true;
			}
			if (field2761 == 18) {
				if (class9.field330 == 12) {
					Statics.field1055 = true;
				}
				class119.field2962 = Statics.field488.method144();
				field2761 = -1;
				return true;
			}
			if (field2761 == 253) {
				Statics.field2043 = true;
				Statics.field1187 = Statics.field488.method144();
				Statics.field1746 = Statics.field488.method144();
				Statics.field316 = Statics.field488.method145();
				Statics.field239 = Statics.field488.method144();
				Statics.field2918 = Statics.field488.method144();
				if (Statics.field2918 >= 100) {
					Statics.field1200 = Statics.field1746 * 128 + 64;
					Statics.field709 = Statics.field1187 * 128 + 64;
					Statics.field1748 = Statics.method712(Statics.field75, Statics.field709, Statics.field1200) - Statics.field316;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 185) {
				int var87 = Statics.field488.method136();
				if (Statics.field2421 != var87) {
					Statics.method895(Statics.field2421);
					Statics.field2421 = var87;
				}
				field2761 = -1;
				class105.field2637 = true;
				return true;
			}
			if (field2761 == 195) {
				int var88 = Statics.field488.method137();
				int var89 = Statics.field488.method145();
				Statics.method746(var89);
				if (var88 != -1) {
					Statics.method746(var88);
				}
				if (Statics.field3227 != -1) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = -1;
				}
				if (class66.field1648 != -1) {
					Statics.method895(class66.field1648);
					class66.field1648 = -1;
				}
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class86.field2166 = -1;
				}
				if (Statics.field1143 != var89) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = var89;
					Statics.method399(35);
				}
				if (Statics.field1881 != var89) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = var88;
				}
				Statics.field2998 = -1;
				Statics.field2811 = 0;
				field2761 = -1;
				return true;
			}
			if (field2761 == 180) {
				if (class66.field1648 != -1) {
					Statics.method895(class66.field1648);
					Statics.field1055 = true;
					Statics.field2364 = true;
					class66.field1648 = -1;
				}
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (Statics.field1143 != -1) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = -1;
					Statics.method399(30);
				}
				if (Statics.field1881 != -1) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = -1;
				}
				if (Statics.field3227 != -1) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = -1;
				}
				field2761 = -1;
				Statics.field2998 = -1;
				if (Statics.field2811 != 0) {
					class105.field2637 = true;
					Statics.field2811 = 0;
				}
				return true;
			}
			if (field2761 == 208) {
				int var90 = Statics.field488.method137();
				Statics.method746(var90);
				if (class66.field1648 != -1) {
					Statics.method895(class66.field1648);
					Statics.field2364 = true;
					class66.field1648 = -1;
					Statics.field1055 = true;
				}
				if (Statics.field1143 != -1) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = -1;
					Statics.method399(30);
				}
				if (Statics.field1881 != -1) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = -1;
				}
				if (Statics.field3227 != -1) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = -1;
				}
				if (class86.field2166 != var90) {
					Statics.method895(class86.field2166);
					class86.field2166 = var90;
				}
				class105.field2637 = true;
				field2761 = -1;
				Statics.field2998 = -1;
				return true;
			}
			if (field2761 == 217) {
				int var91 = Statics.field488.method166();
				if (var91 == 65535) {
					var91 = -1;
				}
				Statics.method874(var91);
				field2761 = -1;
				return true;
			}
			if (field2761 == 40) {
				int var92 = Statics.field488.method164();
				int var93 = Statics.field488.method137();
				if (var93 == 65535) {
					var93 = -1;
				}
				Statics.method928(var92, var93);
				field2761 = -1;
				return true;
			}
			if (field2761 == 254) {
				Statics.field893 = Statics.field488.method156();
				Statics.field1471 = Statics.field488.method147();
				field2761 = -1;
				return true;
			}
			if (field2761 == 88) {
				class103.field2607 = Statics.field488.method152();
				if (class9.field330 == class103.field2607) {
					if (class103.field2607 == 3) {
						class9.field330 = 1;
					} else {
						class9.field330 = 3;
					}
					Statics.field1055 = true;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 63) {
				Statics.field1471 = Statics.field488.method147();
				Statics.field893 = Statics.field488.method156();
				while (Statics.field488.field267 < Statics.field2547) {
					field2761 = Statics.field488.method144();
					method886();
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 196) {
				Statics.field1864 = Statics.field488.method144();
				class6.field236 = Statics.field488.method144();
				ObjType.field2828 = Statics.field488.method144();
				class105.field2637 = true;
				Statics.field504 = true;
				field2761 = -1;
				return true;
			}
			if (field2761 == 116) {
				Statics.field2813 = Statics.field488.method166() * 30;
				field2761 = -1;
				return true;
			}
			if (field2761 == 92) {
				method600();
				field2761 = -1;
				return true;
			}
			if (field2761 == 2) {
				int var94 = Statics.field488.method146();
				int var95 = Statics.field488.method145();
				Statics.field304[var95] = var94;
				if (class113.field2803[var95] != var94) {
					class113.field2803[var95] = var94;
					method476(var95);
					if (Statics.field2421 != -1) {
						class105.field2637 = true;
					}
					Statics.field1055 = true;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 128) {
				method532();
				field2761 = -1;
				return true;
			}
			if (field2761 == 131) {
				int var96 = Statics.field488.method145();
				int var97 = Statics.field488.method144();
				int var98 = Statics.field488.method145();
				Statics.method887(var96, var97, var98);
				field2761 = -1;
				return true;
			}
			if (field2761 == 237) {
				int var99 = Statics.field488.method145();
				Statics.method746(var99);
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class86.field2166 = -1;
					class105.field2637 = true;
				}
				if (Statics.field1143 != -1) {
					Statics.method895(Statics.field1143);
					Statics.field1143 = -1;
					Statics.method399(30);
				}
				if (Statics.field1881 != -1) {
					Statics.method895(Statics.field1881);
					Statics.field1881 = -1;
				}
				if (Statics.field3227 != -1) {
					Statics.method895(Statics.field3227);
					Statics.field3227 = -1;
				}
				if (class66.field1648 != var99) {
					Statics.method895(class66.field1648);
					class66.field1648 = var99;
				}
				Statics.field2364 = true;
				if (Statics.field2811 != 0) {
					class105.field2637 = true;
					Statics.field2811 = 0;
				}
				Statics.field2998 = -1;
				field2761 = -1;
				Statics.field1055 = true;
				return true;
			}
			if (field2761 == 234) {
				Statics.field2043 = true;
				Statics.field1270 = Statics.field488.method144();
				Statics.field1895 = Statics.field488.method144();
				Statics.field1940 = Statics.field488.method145();
				Statics.field2945 = Statics.field488.method144();
				Statics.field1029 = Statics.field488.method144();
				if (Statics.field1029 >= 100) {
					int var100 = Statics.field1270 * 128 + 64;
					int var101 = Statics.field1895 * 128 + 64;
					int var102 = Statics.method712(Statics.field75, var100, var101) - Statics.field1940;
					int var103 = var100 - Statics.field709;
					int var104 = var101 - Statics.field1200;
					int var105 = var102 - Statics.field1748;
					int var106 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104));
					Statics.field1400 = (int) (Math.atan2((double) var105, (double) var106) * 325.949D) & 0x7FF;
					Statics.field184 = (int) (Math.atan2((double) var103, (double) var104) * -325.949D) & 0x7FF;
					if (Statics.field1400 < 128) {
						Statics.field1400 = 128;
					}
					if (Statics.field1400 > 383) {
						Statics.field1400 = 383;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 142) {
				int var107 = Statics.field488.method145();
				int var108 = Statics.field488.method166();
				int var109 = Statics.field488.method145();
				int var110 = Statics.field488.method161();
				IfType var111 = Statics.method1053(var110);
				field2761 = -1;
				var111.field2463 = var107;
				var111.field2534 = var108;
				var111.field2496 = var109;
				return true;
			}
			if (field2761 == 6) {
				class9.field330 = Statics.field488.method144();
				Statics.field2364 = true;
				Statics.field1055 = true;
				field2761 = -1;
				return true;
			}
			if (field2761 == 171) {
				if (class9.field330 == 12) {
					Statics.field1055 = true;
				}
				class105.field2638 = Statics.field488.method139();
				field2761 = -1;
				return true;
			}
			if (field2761 == 9 || field2761 == 99 || field2761 == 229 || field2761 == 19 || field2761 == 202 || field2761 == 1 || field2761 == 74 || field2761 == 175 || field2761 == 49 || field2761 == 143 || field2761 == 241) {
				method886();
				field2761 = -1;
				return true;
			}
			if (field2761 == 14) {
				for (int var112 = 0; var112 < Statics.field2915; var112++) {
					VarpType var113 = VarpType.method1023(var112);
					if (var113 != null && var113.field2404 == 0) {
						Statics.field304[var112] = 0;
						class113.field2803[var112] = 0;
					}
				}
				if (Statics.field2421 != -1) {
					class105.field2637 = true;
				}
				Statics.field1055 = true;
				field2761 = -1;
				return true;
			}
			if (field2761 == 160) {
				int var114 = Statics.field488.method166();
				int var115 = Statics.field488.method161();
				IfType var116 = Statics.method1053(var115);
				var116.field2493 = 2;
				field2761 = -1;
				var116.field2479 = var114;
				return true;
			}
			if (field2761 == 132) {
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class86.field2166 = -1;
				}
				field2761 = -1;
				Statics.field3210 = Statics.field3234;
				Statics.field2811 = 1;
				class105.field2637 = true;
				Statics.field1001 = false;
				return true;
			}
			if (field2761 == 186) {
				Statics.field96 = Statics.field488.method144();
				if (Statics.field96 == 1) {
					Statics.field3212 = Statics.field488.method145();
				}
				if (Statics.field96 >= 2 && Statics.field96 <= 6) {
					if (Statics.field96 == 2) {
						Statics.field1857 = 64;
						class102.field2572 = 64;
					}
					if (Statics.field96 == 3) {
						Statics.field1857 = 64;
						class102.field2572 = 0;
					}
					if (Statics.field96 == 4) {
						Statics.field1857 = 64;
						class102.field2572 = 128;
					}
					if (Statics.field96 == 5) {
						class102.field2572 = 64;
						Statics.field1857 = 0;
					}
					if (Statics.field96 == 6) {
						class102.field2572 = 64;
						Statics.field1857 = 128;
					}
					Statics.field96 = 2;
					Statics.field3304 = Statics.field488.method145();
					class6.field226 = Statics.field488.method145();
					Statics.field1114 = Statics.field488.method144();
				}
				if (Statics.field96 == 10) {
					Statics.field3290 = Statics.field488.method145();
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 210) {
				int var117 = Statics.field488.method161();
				IfType var118 = Statics.method1053(var117);
				var118.field2493 = 3;
				var118.field2479 = Statics.field2621.field90.method634();
				field2761 = -1;
				return true;
			}
			if (field2761 == 110) {
				int var119 = Statics.field488.method161();
				JagString var120 = Statics.field488.method140();
				IfType var121 = Statics.method1053(var119);
				var121.field2474 = var120;
				if (var119 >> 16 == Statics.field2397[class9.field330]) {
					Statics.field1055 = true;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 70) {
				class23.field701 = Statics.field488.method144();
				Statics.field1055 = true;
				field2761 = -1;
				return true;
			}
			if (field2761 == 120) {
				int var122 = Statics.field488.method145();
				int var123 = Statics.field488.method166();
				int var124 = Statics.field488.method161();
				if (var123 == 65535) {
					var123 = -1;
				}
				IfType var125 = Statics.method1053(var124);
				if (var125.field2442) {
					var125.field2540 = 1;
					var125.field2524 = var123;
				} else if (var123 == -1) {
					field2761 = -1;
					var125.field2493 = 0;
					return true;
				} else {
					ObjType var126 = ObjType.method760(var123);
					var125.field2496 = var126.field2875;
					var125.field2479 = var123;
					var125.field2493 = 4;
					var125.field2534 = var126.field2848 * 100 / var122;
					var125.field2463 = var126.field2861;
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 51) {
				long var127 = Statics.field488.method174();
				long var129 = (long) Statics.field488.method145();
				long var131 = (long) Statics.field488.method164();
				int var133 = Statics.field488.method144();
				boolean var134 = false;
				long var135 = (var129 << 32) + var131;
				for (int var137 = 0; var137 < 100; var137++) {
					if (class104.field2618[var137] == var135) {
						var134 = true;
						break;
					}
				}
				if (var133 <= 1) {
					for (int var138 = 0; var138 < Statics.field2146; var138++) {
						if (class106.field2683[var138] == var127) {
							var134 = true;
							break;
						}
					}
				}
				if (!var134 && class6.field233 == 0) {
					class104.field2618[LocChange.field682] = var135;
					LocChange.field682 = (LocChange.field682 + 1) % 100;
					JagString var139 = Statics.method893(Statics.field488).method4();
					if (var133 == 2 || var133 == 3) {
						Statics.method758(7, var139, JagString.join(new JagString[] { Statics.field2535, Statics.method969(var127).method36() }));
					} else if (var133 == 1) {
						Statics.method758(7, var139, JagString.join(new JagString[] { Statics.field2612, Statics.method969(var127).method36() }));
					} else {
						Statics.method758(3, var139, Statics.method969(var127).method36());
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 27) {
				for (int var140 = 0; var140 < Statics.field2030.length; var140++) {
					if (Statics.field2030[var140] != null) {
						Statics.field2030[var140].field2015 = -1;
					}
				}
				for (int var141 = 0; var141 < Statics.field2992.length; var141++) {
					if (Statics.field2992[var141] != null) {
						Statics.field2992[var141].field2015 = -1;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 140) {
				int var142 = Statics.field488.method145();
				int var143 = Statics.field488.method144();
				if (var142 == 65535) {
					var142 = -1;
				}
				if (Statics.field2397[var143] != var142) {
					Statics.method895(Statics.field2397[var143]);
					Statics.field2397[var143] = var142;
				}
				Statics.field2364 = true;
				field2761 = -1;
				Statics.field1055 = true;
				return true;
			}
			if (field2761 == 34) {
				Statics.field1055 = true;
				int var144 = Statics.field488.method152();
				int var145 = Statics.field488.method144();
				int var146 = Statics.field488.method146();
				Statics.field1483[var145] = var146;
				class24.field724[var145] = var144;
				class17.field549[var145] = 1;
				for (int var147 = 0; var147 < 98; var147++) {
					if (Statics.field1514[var147] <= var146) {
						class17.field549[var145] = var147 + 2;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 3) {
				int var148 = Statics.field488.method167();
				int var149 = Statics.field488.method160();
				int var150 = Statics.field488.method160();
				IfType var151 = Statics.method1053(var148);
				var151.field2462 = var151.field2455 + var150;
				field2761 = -1;
				var151.field2502 = var151.field2549 + var149;
				return true;
			}
			if (field2761 == 72) {
				for (int var152 = 0; var152 < class113.field2803.length; var152++) {
					if (Statics.field304[var152] != class113.field2803[var152]) {
						class113.field2803[var152] = Statics.field304[var152];
						method476(var152);
						Statics.field1055 = true;
					}
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 240) {
				Statics.method460(signlink, Statics.field488, Statics.field2547);
				field2761 = -1;
				return true;
			}
			if (field2761 == 58) {
				int var153 = Statics.field488.method183();
				Statics.field715 = signlink.method655(var153);
				field2761 = -1;
				return true;
			}
			if (field2761 == 214) {
				Statics.field1055 = true;
				int var154 = Statics.field488.method167();
				IfType var155 = Statics.method1053(var154);
				while (true) {
					while (Statics.field2547 > Statics.field488.field267) {
						int var156 = Statics.field488.method178();
						int var157 = Statics.field488.method145();
						int var158 = 0;
						if (var157 != 0) {
							var158 = Statics.field488.method144();
							if (var158 == 255) {
								var158 = Statics.field488.method167();
							}
						}
						if (var155.field2442) {
							IfType[] var159 = Statics.field2922[var154 >> 16];
							for (int var160 = 0; var160 < var159.length; var160++) {
								IfType var161 = var159[var160];
								if ((var155.field2495 & 0xFFFF) == (var161.field2454 & 0xFFFF) && var156 + 1 == var161.field2542) {
									var161.field2540 = var158;
									var161.field2524 = var157 - 1;
								}
							}
						} else if (var156 >= 0 && var155.field2491.length > var156) {
							var155.field2491[var156] = var157;
							var155.field2516[var156] = var158;
						}
					}
					field2761 = -1;
					return true;
				}
			}
			if (field2761 == 166) {
				Statics.method524(false);
				field2761 = -1;
				return true;
			}
			if (field2761 == 231) {
				int var162 = Statics.field488.method137();
				int var163 = Statics.field488.method161();
				int var164 = var162 >> 10 & 0x1F;
				int var165 = var162 >> 5 & 0x1F;
				IfType var166 = Statics.method1053(var163);
				field2761 = -1;
				int var167 = var162 & 0x1F;
				var166.field2453 = (var167 << 3) + (var164 << 19) + (var165 << 11);
				return true;
			}
			if (field2761 == 211) {
				Statics.field2146 = Statics.field2547 / 8;
				for (int var168 = 0; var168 < Statics.field2146; var168++) {
					class106.field2683[var168] = Statics.field488.method174();
				}
				field2761 = -1;
				return true;
			}
			if (field2761 == 124) {
				if (class86.field2166 != -1) {
					Statics.method895(class86.field2166);
					class86.field2166 = -1;
				}
				class105.field2637 = true;
				Statics.field3210 = Statics.field3234;
				Statics.field2811 = 2;
				field2761 = -1;
				Statics.field1001 = false;
				return true;
			}
			JagException.report("T1 - " + field2761 + "," + Statics.field498 + "," + class99.field2434 + " - " + Statics.field2547, null);
			Statics.method847();
		} catch (IOException var172) {
			Statics.method960();
		} catch (Exception var173) {
			String var170 = "T2 - " + field2761 + "," + Statics.field498 + "," + class99.field2434 + " - " + Statics.field2547 + "," + (Statics.field2621.field1962[0] + Statics.field806) + "," + (Statics.field2621.field2009[0] + Statics.field1408) + " - ";
			for (int var171 = 0; Statics.field2547 > var171 && var171 < 50; var171++) {
				var170 = var170 + Statics.field488.field284[var171] + ",";
			}
			JagException.report(var170, var173);
			Statics.method847();
		}
		return true;
	}

	@ObfuscatedName("n.a(B)V")
	public static void method714(byte arg0) {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
		if (arg0 > 0) {
			;
		}
	}

	@ObfuscatedName("td.b(I)V")
	public static void method968() {
		int var0 = b12.method208(Statics.field2490);
		for (int var1 = 0; var1 < Statics.field1104; var1++) {
			int var2 = b12.method204(class102.field2586[var1]);
			if (var0 < var2) {
				var0 = var2;
			}
		}
		var0 += 8;
		int var3 = Statics.field1104 * 15 + 21;
		if (class112.field2762 > 4 && Statics.field14 > 4 && class112.field2762 < 516 && Statics.field14 < 338) {
			Statics.field640 = 0;
			Statics.field219 = Statics.field1104 * 15 + 22;
			class6.field224 = true;
			int var4 = class112.field2762 - var0 / 2 - 4;
			Statics.field2306 = var0;
			if (var0 + var4 > 512) {
				var4 = 512 - var0;
			}
			if (var4 < 0) {
				var4 = 0;
			}
			Statics.field986 = var4;
			int var5 = Statics.field14 - 4;
			if (var5 + var3 > 334) {
				var5 = 334 - var3;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			Statics.field579 = var5;
		}
		if (class112.field2762 > 553 && Statics.field14 > 205 && class112.field2762 < 743 && Statics.field14 < 466) {
			Statics.field219 = Statics.field1104 * 15 + 22;
			Statics.field640 = 1;
			int var6 = Statics.field14 - 205;
			int var7 = class112.field2762 - var0 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var0 + var7 > 190) {
				var7 = 190 - var0;
			}
			class6.field224 = true;
			Statics.field986 = var7;
			if (var6 < 0) {
				var6 = 0;
			} else if (var3 + var6 > 261) {
				var6 = 261 - var3;
			}
			Statics.field2306 = var0;
			Statics.field579 = var6;
		}
		if (class112.field2762 <= 17 || Statics.field14 <= 357 || class112.field2762 >= 496 || Statics.field14 >= 453) {
			return;
		}
		Statics.field2306 = var0;
		Statics.field640 = 2;
		Statics.field219 = Statics.field1104 * 15 + 22;
		int var8 = Statics.field14 - 357;
		if (var8 < 0) {
			var8 = 0;
		} else if (var3 + var8 > 96) {
			var8 = 96 - var3;
		}
		int var9 = class112.field2762 - var0 / 2 - 17;
		class6.field224 = true;
		Statics.field579 = var8;
		if (var9 < 0) {
			var9 = 0;
		} else if (var0 + var9 > 479) {
			var9 = 479 - var0;
		}
		Statics.field986 = var9;
	}

	@ObfuscatedName("vd.c(B)V")
	public static void method1024() {
		if (Statics.field2813 > 1) {
			Statics.field2813--;
		}
		if (Statics.field1750 > 0) {
			Statics.field1750--;
		}
		if (class78.field1919) {
			class78.field1919 = false;
			Statics.method960();
			return;
		}
		for (int var0 = 0; var0 < 100 && method111(); var0++) {
		}
		if (class103.field2599 != 30 && class103.field2599 != 35) {
			return;
		}
		if (Statics.field1069 && class103.field2599 == 30) {
			Statics.field801 = 0;
			Statics.field3050 = 0;
			while (Statics.method685()) {
			}
			for (int var1 = 0; var1 < Statics.field1488.length; var1++) {
				Statics.field1488[var1] = false;
			}
		}
		Statics.method479(Statics.field1726);
		Object var2 = Statics.field708.lock;
		synchronized (Statics.field708.lock) {
			if (!MidiStream.field1186) {
				Statics.field708.field2058 = 0;
			} else if (Statics.field3050 != 0 || Statics.field708.field2058 >= 40) {
				int var3 = 0;
				Statics.field1726.method415(210);
				Statics.field1726.method141(0);
				int var4 = Statics.field1726.field267;
				for (int var5 = 0; var5 < Statics.field708.field2058 && Statics.field1726.field267 - var4 < 240; var5++) {
					var3++;
					int var6 = Statics.field708.field2057[var5];
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 502) {
						var6 = 502;
					}
					int var7 = Statics.field708.field2059[var5];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 764) {
						var7 = 764;
					}
					int var8 = var6 * 765 + var7;
					if (Statics.field708.field2057[var5] == -1 && Statics.field708.field2059[var5] == -1) {
						var7 = -1;
						var8 = 524287;
						var6 = -1;
					}
					if (Statics.field973 != var7 || Statics.field1342 != var6) {
						int var9 = var7 - Statics.field973;
						Statics.field973 = var7;
						int var10 = var6 - Statics.field1342;
						Statics.field1342 = var6;
						if (MidiPlayer.field3069 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							Statics.field1726.method150((MidiPlayer.field3069 << 12) + (var9 << 6) + var10);
							MidiPlayer.field3069 = 0;
						} else if (MidiPlayer.field3069 < 8) {
							Statics.field1726.method153(var8 + (MidiPlayer.field3069 << 19) + 8388608);
							MidiPlayer.field3069 = 0;
						} else {
							Statics.field1726.method182((MidiPlayer.field3069 << 19) + var8 - 1073741824);
							MidiPlayer.field3069 = 0;
						}
					} else if (MidiPlayer.field3069 < 2047) {
						MidiPlayer.field3069++;
					}
				}
				Statics.field1726.method155(Statics.field1726.field267 - var4);
				if (var3 < Statics.field708.field2058) {
					Statics.field708.field2058 -= var3;
					for (int var11 = 0; var11 < Statics.field708.field2058; var11++) {
						Statics.field708.field2059[var11] = Statics.field708.field2059[var3 + var11];
						Statics.field708.field2057[var11] = Statics.field708.field2057[var3 + var11];
					}
				} else {
					Statics.field708.field2058 = 0;
				}
			}
		}
		if (Statics.field3050 != 0) {
			long var12 = (Statics.field1344 - class103.field2605) / 50L;
			int var14 = class112.field2762;
			int var15 = Statics.field14;
			class103.field2605 = Statics.field1344;
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 764) {
				var14 = 764;
			}
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 502) {
				var15 = 502;
			}
			byte var16 = 0;
			if (Statics.field3050 == 2) {
				var16 = 1;
			}
			if (var12 > 4095L) {
				var12 = 4095L;
			}
			int var17 = (int) var12;
			Statics.field1726.method415(234);
			int var18 = var15 * 765 + var14;
			Statics.field1726.method170((var16 << 19) + ((var17 << 20) + var18));
		}
		if (Statics.field998 > 0) {
			Statics.field998--;
		}
		if (Statics.field1488[96] || Statics.field1488[97] || Statics.field1488[98] || Statics.field1488[99]) {
			Statics.field1271 = true;
		}
		if (Statics.field1271 && Statics.field998 <= 0) {
			Statics.field998 = 20;
			Statics.field1271 = false;
			Statics.field1726.method415(58);
			Statics.field1726.method150(class113.field2797);
			Statics.field1726.method150(class131.field3204);
		}
		if (field1277 && !Statics.field1862) {
			Statics.field1862 = true;
			Statics.field1726.method415(160);
			Statics.field1726.method141(1);
		}
		if (!field1277 && Statics.field1862) {
			Statics.field1862 = false;
			Statics.field1726.method415(160);
			Statics.field1726.method141(0);
		}
		Statics.method810();
		if (class103.field2599 != 30 && class103.field2599 != 35) {
			return;
		}
		method878();
		Statics.method125();
		Statics.field1855++;
		if (Statics.field1855 > 750) {
			Statics.method960();
			return;
		}
		Statics.method384();
		method252();
		method424();
		if (Statics.field2295 != 0) {
			Statics.field894 += 20;
			if (Statics.field894 >= 400) {
				Statics.field2295 = 0;
			}
		}
		if (Statics.field656 != 0) {
			Statics.field1154++;
			if (Statics.field1154 >= 15) {
				if (Statics.field656 == 2) {
					Statics.field1055 = true;
				}
				if (Statics.field656 == 3) {
					class105.field2637 = true;
				}
				Statics.field656 = 0;
			}
		}
		class9.field321++;
		if (Statics.field857 != 0) {
			Statics.field298++;
			if (class24.field741 > Statics.field3143 + 5 || Statics.field3143 - 5 > class24.field741 || ObjType.field2829 + 5 < class102.field2568 || ObjType.field2829 - 5 > class102.field2568) {
				Statics.field2815 = true;
			}
			if (Statics.field801 == 0) {
				if (Statics.field857 == 3) {
					class105.field2637 = true;
				}
				if (Statics.field857 == 2) {
					Statics.field1055 = true;
				}
				Statics.field857 = 0;
				if (Statics.field2815 && Statics.field298 >= 5) {
					Statics.field1145 = -1;
					Statics.method757();
					if (Statics.field2410 == Statics.field1145 && class113.field2776 != class108.field2704) {
						IfType var19 = Statics.method1053(Statics.field2410);
						byte var20 = 0;
						if (class86.field2163 == 1 && var19.field2445 == 206) {
							var20 = 1;
						}
						if (var19.field2491[class108.field2704] <= 0) {
							var20 = 0;
						}
						if (var19.field2529) {
							int var23 = class108.field2704;
							int var24 = class113.field2776;
							var19.field2491[var23] = var19.field2491[var24];
							var19.field2516[var23] = var19.field2516[var24];
							var19.field2491[var24] = -1;
							var19.field2516[var24] = 0;
						} else if (var20 == 1) {
							int var21 = class113.field2776;
							int var22 = class108.field2704;
							while (var21 != var22) {
								if (var21 > var22) {
									var19.method850(var21 - 1, var21);
									var21--;
								} else if (var21 < var22) {
									var19.method850(var21 + 1, var21);
									var21++;
								}
							}
						} else {
							var19.method850(class108.field2704, class113.field2776);
						}
						Statics.field1726.method415(83);
						Statics.field1726.method165(var20);
						Statics.field1726.method169(class113.field2776);
						Statics.field1726.method154(class108.field2704);
						Statics.field1726.method179(Statics.field2410);
					}
				} else if ((Statics.field3297 == 1 || Statics.method676(Statics.field1104 - 1)) && Statics.field1104 > 2) {
					method968();
				} else if (Statics.field1104 > 0) {
					Statics.method604(Statics.field1104 - 1);
				}
				Statics.field1154 = 10;
				Statics.field3050 = 0;
			}
		}
		if (World.field105 != -1) {
			int var25 = World.field105;
			int var26 = World.field108;
			boolean var27 = Statics.method576(0, 0, Statics.field2621.field1962[0], var25, 0, true, 0, 0, Statics.field2621.field2009[0], var26, 0);
			if (var27) {
				ClientScript.field523 = Statics.field14;
				Statics.field894 = 0;
				class119.field2967 = class112.field2762;
				Statics.field2295 = 1;
			}
			World.field105 = -1;
		}
		if (Statics.field3050 == 1 && Statics.field1605 != null) {
			Statics.field3050 = 0;
			class105.field2637 = true;
			Statics.field1605 = null;
		}
		Statics.method992();
		if (Statics.field1143 == -1) {
			method565();
			Statics.method575();
			Statics.method271();
		}
		if (Statics.field801 == 1 || Statics.field3050 == 1) {
			Statics.field3176++;
		}
		if (Statics.field3227 != -1) {
			Statics.method606(516, 34, 338, Statics.field3227, 4, 4);
		}
		if (class66.field1648 != -1) {
			Statics.method606(743, 34, 466, class66.field1648, 205, 553);
		} else if (Statics.field2397[class9.field330] != -1) {
			Statics.method606(743, 34, 466, Statics.field2397[class9.field330], 205, 553);
		}
		if (class86.field2166 != -1) {
			Statics.method606(496, 34, 453, class86.field2166, 357, 17);
		} else if (Statics.field2421 != -1) {
			Statics.method606(496, 34, 453, Statics.field2421, 357, 17);
		}
		if (Statics.field3227 != -1) {
			Statics.method606(516, -35, 338, Statics.field3227, 4, 4);
		}
		if (class66.field1648 != -1) {
			Statics.method606(743, -35, 466, class66.field1648, 205, 553);
		} else if (Statics.field2397[class9.field330] != -1) {
			Statics.method606(743, -35, 466, Statics.field2397[class9.field330], 205, 553);
		}
		if (class86.field2166 != -1) {
			Statics.method606(496, -35, 453, class86.field2166, 357, 17);
		} else if (Statics.field2421 != -1) {
			Statics.method606(496, -35, 453, Statics.field2421, 357, 17);
		}
		if (Statics.field3253 == -1 && class52.field1387 == -1 && Statics.field1279 == -1) {
			if (class106.field2673 > 0) {
				class106.field2673--;
			}
		} else if (Statics.field57 > class106.field2673) {
			class106.field2673++;
			if (class106.field2673 == Statics.field57) {
				if (Statics.field3253 != -1) {
					class105.field2637 = true;
				}
				if (class52.field1387 != -1) {
					Statics.field1055 = true;
				}
			}
		}
		Statics.method564();
		if (Statics.field2043) {
			Statics.method189();
		}
		for (int var28 = 0; var28 < 5; var28++) {
			int var10002 = Statics.field1019[var28]++;
		}
		Statics.method482();
		int var29 = Statics.method662();
		int var30 = Statics.method382();
		if (var29 > 4500 && var30 > 4500) {
			Statics.field1750 = 250;
			Statics.method876(4000);
			Statics.field1726.method415(216);
		}
		Statics.field72++;
		Statics.field1528++;
		if (Statics.field1528 > 500) {
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x2) == 2) {
				Statics.field2409 += Statics.field185;
			}
			if ((var31 & 0x1) == 1) {
				Statics.field296 += Statics.field2148;
			}
			Statics.field1528 = 0;
			if ((var31 & 0x4) == 4) {
				class112.field2766 += class9.field317;
			}
		}
		if (Statics.field2409 < -55) {
			Statics.field185 = 2;
		}
		if (Statics.field72 > 500) {
			int var32 = (int) (Math.random() * 8.0D);
			if ((var32 & 0x1) == 1) {
				class86.field2158 += class24.field740;
			}
			if ((var32 & 0x2) == 2) {
				class103.field2589 += field587;
			}
			Statics.field72 = 0;
		}
		if (Statics.field2409 > 55) {
			Statics.field185 = -2;
		}
		if (Statics.field296 < -50) {
			Statics.field2148 = 2;
		}
		if (class86.field2158 < -60) {
			class24.field740 = 2;
		}
		MidiStream.field1179++;
		if (Statics.field296 > 50) {
			Statics.field2148 = -2;
		}
		if (class86.field2158 > 60) {
			class24.field740 = -2;
		}
		if (class112.field2766 < -40) {
			class9.field317 = 1;
		}
		if (class112.field2766 > 40) {
			class9.field317 = -1;
		}
		if (class103.field2589 < -20) {
			field587 = 1;
		}
		if (class103.field2589 > 10) {
			field587 = -1;
		}
		if (MidiStream.field1179 > 50) {
			Statics.field1726.method415(13);
		}
		try {
			if (Statics.field1450 != null && Statics.field1726.field267 > 0) {
				Statics.field1450.method1016(Statics.field1726.field267, Statics.field1726.field284);
				MidiStream.field1179 = 0;
				Statics.field1726.field267 = 0;
			}
		} catch (IOException var33) {
			Statics.method960();
		}
	}

	@ObfuscatedName("r.a(I)V")
	public static void method865() {
		Statics.method610(false);
		class78.field1922 = 0;
		boolean var0 = true;
		for (int var1 = 0; var1 < Statics.field61.length; var1++) {
			if (Statics.field2291[var1] != -1 && Statics.field61[var1] == null) {
				Statics.field61[var1] = field3131.method217(0, Statics.field2291[var1]);
				if (Statics.field61[var1] == null) {
					class78.field1922++;
					var0 = false;
				}
			}
			if (Statics.field742[var1] != -1 && Statics.field2633[var1] == null) {
				Statics.field2633[var1] = field3131.method221(Statics.field742[var1], 0, Statics.field2170[var1]);
				if (Statics.field2633[var1] == null) {
					class78.field1922++;
					var0 = false;
				}
			}
		}
		if (!var0) {
			Statics.field3301 = 1;
			return;
		}
		boolean var2 = true;
		Statics.field2358 = 0;
		for (int var3 = 0; var3 < Statics.field61.length; var3++) {
			byte[] var4 = Statics.field2633[var3];
			if (var4 != null) {
				int var5 = (Statics.field1078[var3] & 0xFF) * 64 - Statics.field1408;
				int var6 = (Statics.field1078[var3] >> 8) * 64 - Statics.field806;
				if (class113.field2773) {
					var6 = 10;
					var5 = 10;
				}
				var2 &= Statics.method683(var4, var6, var5);
			}
		}
		if (!var2) {
			Statics.field3301 = 2;
			return;
		}
		if (Statics.field3301 != 0) {
			method872(Statics.field3252, true, Statics.field1133);
		}
		Statics.method595();
		field3183.method54();
		System.gc();
		for (int var7 = 0; var7 < 4; var7++) {
			field2569[var7].method110();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					Statics.field898[var8][var9][var10] = 0;
				}
			}
		}
		Statics.method1030();
		int var11 = Statics.field61.length;
		Statics.method718();
		Statics.method610(true);
		if (!class113.field2773) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (Statics.field1078[var12] & 0xFF) * 64 - Statics.field1408;
				int var14 = (Statics.field1078[var12] >> 8) * 64 - Statics.field806;
				byte[] var15 = Statics.field61[var12];
				if (var15 != null) {
					Statics.method487(field2569, (Statics.field2604 - 6) * 8, var15, var14, var13, (Statics.field829 - 6) * 8);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (Statics.field1078[var16] >> 8) * 64 - Statics.field806;
				byte[] var18 = Statics.field61[var16];
				int var19 = (Statics.field1078[var16] & 0xFF) * 64 - Statics.field1408;
				if (var18 == null && Statics.field829 < 800) {
					Statics.method989(var19, 64, 64, var17);
				}
			}
			Statics.method610(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = Statics.field2633[var20];
				if (var21 != null) {
					int var22 = (Statics.field1078[var20] >> 8) * 64 - Statics.field806;
					int var23 = (Statics.field1078[var20] & 0xFF) * 64 - Statics.field1408;
					Statics.method535(var22, field3183, field2569, var21, var23);
				}
			}
		}
		if (class113.field2773) {
			for (int var24 = 0; var24 < 4; var24++) {
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						int var27 = Statics.field908[var24][var25][var26];
						boolean var28 = false;
						if (var27 != -1) {
							int var29 = var27 >> 1 & 0x3;
							int var30 = var27 >> 14 & 0x3FF;
							int var31 = var27 >> 24 & 0x3;
							int var32 = var27 >> 3 & 0x7FF;
							int var33 = (var30 / 8 << 8) + (var32 / 8);
							for (int var34 = 0; var34 < Statics.field1078.length; var34++) {
								if (Statics.field1078[var34] == var33 && Statics.field61[var34] != null) {
									Statics.method186(var26 * 8, (var30 & 0x7) * 8, var31, var24, var25 * 8, (var32 & 0x7) * 8, var29, Statics.field61[var34], field2569);
									var28 = true;
									break;
								}
							}
						}
						if (!var28) {
							Statics.method737(var26 * 8, var24, var25 * 8);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = Statics.field908[0][var35][var36];
					if (var37 == -1) {
						Statics.method989(var36 * 8, 8, 8, var35 * 8);
					}
				}
			}
			Statics.method610(true);
			for (int var38 = 0; var38 < 4; var38++) {
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = Statics.field908[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 14 & 0x3FF;
							int var44 = var41 >> 1 & 0x3;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = (var43 / 8 << 8) + (var45 / 8);
							for (int var47 = 0; var47 < Statics.field1078.length; var47++) {
								if (Statics.field1078[var47] == var46 && Statics.field2633[var47] != null) {
									Statics.method522((var43 & 0x7) * 8, field3183, var38, var44, var42, Statics.field2633[var47], var40 * 8, field2569, (var45 & 0x7) * 8, var39 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Statics.method610(true);
		Statics.method595();
		Statics.method425(field3183, field2569);
		Statics.method610(true);
		int var48 = class129.field3175;
		if (Statics.field75 < var48) {
			var48 = Statics.field75;
		}
		if (var48 < Statics.field75 - 1) {
		}
		if (lowMem) {
			field3183.method92(class129.field3175);
		} else {
			field3183.method92(0);
		}
		for (int var49 = 0; var49 < 104; var49++) {
			for (int var50 = 0; var50 < 104; var50++) {
				Statics.method1011(var50, var49);
			}
		}
		Statics.method429();
		class93.field2322.method267();
		if (field1859 != null) {
			Statics.field1726.method415(121);
			Statics.field1726.method182(1057001181);
		}
		if (!class113.field2773) {
			int var51 = (Statics.field2604 - 6) / 8;
			int var52 = (Statics.field829 - 6) / 8;
			int var53 = (Statics.field829 + 6) / 8;
			int var54 = (Statics.field2604 + 6) / 8;
			for (int var55 = var51 - 1; var55 <= var54 + 1; var55++) {
				for (int var56 = var52 - 1; var56 <= var53 + 1; var56++) {
					if (var51 > var55 || var55 > var54 || var56 < var52 || var56 > var53) {
						field3131.method240(JagString.join(new JagString[] { Statics.field2305, Statics.method502(var55), Statics.field477, Statics.method502(var56) }));
						field3131.method240(JagString.join(new JagString[] { Statics.field1259, Statics.method502(var55), Statics.field477, Statics.method502(var56) }));
					}
				}
			}
		}
		if (Statics.field1143 == -1) {
			Statics.method399(30);
		} else {
			Statics.method399(35);
		}
		Statics.method910();
		Statics.field1726.method415(178);
		Statics.method466();
	}

	@ObfuscatedName("rb.b(B)V")
	public static void method878() {
		for (LocChange var0 = (LocChange) Statics.field2284.method802(); var0 != null; var0 = (LocChange) Statics.field2284.method809()) {
			if (var0.field692 > 0) {
				var0.field692--;
			}
			if (var0.field692 != 0) {
				if (var0.field694 > 0) {
					var0.field694--;
				}
				if (var0.field694 == 0 && var0.field700 >= 1 && var0.field699 >= 1 && var0.field700 <= 102 && var0.field699 <= 102 && (var0.field678 < 0 || Statics.method741(var0.field691, var0.field678))) {
					Statics.method882(var0.field699, var0.field678, var0.field700, var0.field691, var0.field696, var0.field688, var0.field679);
					var0.field694 = -1;
					if (var0.field689 == var0.field678 && var0.field689 == -1) {
						var0.method739();
					} else if (var0.field689 == var0.field678 && var0.field696 == var0.field686 && var0.field697 == var0.field691) {
						var0.method739();
					}
				}
			} else if (var0.field689 < 0 || Statics.method741(var0.field697, var0.field689)) {
				Statics.method882(var0.field699, var0.field689, var0.field700, var0.field697, var0.field686, var0.field688, var0.field679);
				var0.method739();
			}
		}
	}

	@ObfuscatedName("ra.a(ILa;ZLa;)V")
	public static void method872(JagString arg0, boolean arg1, JagString arg2) {
		if (field2402) {
			field2402 = false;
			Statics.method943();
			Statics.method808();
			Statics.method901();
			Statics.method454();
			Statics.method880(ObjType.field2828, p12, class6.field236, Statics.field1864);
			Statics.method246(class9.field330, Statics.field2397, class66.field1648 == -1, -1);
			Statics.field1941 = true;
			LocChange.field687 = true;
			Statics.field410 = true;
		}
		short var3 = 151;
		Statics.method1028();
		int var5 = var3 - 3;
		p12.method209(arg0, 257, 148, 0);
		p12.method209(arg0, 256, 147, 16777215);
		if (arg2 != null) {
			var5 += 15;
			if (arg1) {
				int var4 = p12.method208(arg2) + 4;
				Pix2D.method913(257 - var4 / 2, 152, var4, 11, 0);
			}
			p12.method209(arg2, 257, 163, 0);
			p12.method209(arg2, 256, 162, 16777215);
		}
		Statics.method44();
	}

	@ObfuscatedName("je.c(B)V")
	public static void method565() {
		if (Statics.field1587 != 0 || Statics.field3050 != 1) {
			return;
		}
		int var0 = class112.field2762 - 575;
		int var1 = Statics.field14 - 4 - 5;
		if (var0 < 0 || var1 < 0 || var0 >= 146 || var1 >= 151) {
			return;
		}
		var1 -= 75;
		var0 -= 73;
		int var2 = class86.field2158 + class113.field2797 & 0x7FF;
		int var3 = Pix3D.field775[var2];
		int var4 = Pix3D.field778[var2];
		int var5 = (class103.field2589 + 256) * var4 >> 8;
		int var6 = (class103.field2589 + 256) * var3 >> 8;
		int var7 = var1 * var6 + var0 * var5 >> 11;
		int var8 = var1 * var5 - var0 * var6 >> 11;
		int var9 = Statics.field2621.field1972 + var7 >> 7;
		int var10 = Statics.field2621.field1963 - var8 >> 7;
		boolean var11 = Statics.method576(0, 0, Statics.field2621.field1962[0], var9, 0, true, 0, 0, Statics.field2621.field2009[0], var10, 1);
		if (!var11) {
			return;
		}
		Statics.field1726.method141(var0);
		Statics.field1726.method141(var1);
		Statics.field1726.method150(class113.field2797);
		Statics.field1726.method141(57);
		Statics.field1726.method141(class86.field2158);
		Statics.field1726.method141(class103.field2589);
		Statics.field1726.method141(89);
		Statics.field1726.method150(Statics.field2621.field1972);
		Statics.field1726.method150(Statics.field2621.field1963);
		Statics.field1726.method141(Statics.field2809);
		Statics.field1726.method141(63);
		return;
	}

	@ObfuscatedName("mb.b(B)V")
	public static void method688() {
		while (true) {
			if (Statics.field488.method407(Statics.field2547) >= 11) {
				int var0 = Statics.field488.method412(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (Statics.field2030[var0] == null) {
						Statics.field2030[var0] = new ClientPlayer();
						if (MidiStream.field1176[var0] != null) {
							Statics.field2030[var0].method43(MidiStream.field1176[var0]);
						}
						var1 = true;
					}
					class112.field2758[class118.field2939++] = var0;
					ClientPlayer var2 = Statics.field2030[var0];
					var2.field2008 = Statics.field2063;
					int var3 = Statics.field488.method412(5);
					int var4 = Statics.field488.method412(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = Statics.field644[Statics.field488.method412(3)];
					if (var1) {
						var2.field1992 = var5;
					}
					int var6 = Statics.field488.method412(1);
					int var7 = Statics.field488.method412(1);
					if (var7 == 1) {
						class50.field1348[Statics.field2027++] = var0;
					}
					var2.method729(Statics.field2621.field2009[0] + var4, var6 == 1, Statics.field2621.field1962[0] + var3);
					continue;
				}
			}
			Statics.field488.method408();
			return;
		}
	}

	@ObfuscatedName("tb.a(IZ)V")
	public static void method957(boolean arg0) {
		if (Statics.field2621.field1972 >> 7 == VarBitType.field941 && Statics.field2621.field1963 >> 7 == class108.field2720) {
			VarBitType.field941 = 0;
		}
		int var1 = class118.field2939;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3;
			ClientPlayer var4;
			if (arg0) {
				var3 = 33538048;
				var4 = Statics.field2621;
			} else {
				var3 = class112.field2758[var2] << 14;
				var4 = Statics.field2030[class112.field2758[var2]];
			}
			if (var4 != null && var4.method42()) {
				var4.field95 = false;
				int var5 = var4.field1972 >> 7;
				int var6 = var4.field1963 >> 7;
				if ((lowMem && class118.field2939 > 50 || class118.field2939 > 200) && !arg0 && var4.field2000 == var4.field1951) {
					var4.field95 = true;
				}
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var4.field73 == null || var4.field91 > Statics.field2063 || Statics.field2063 >= var4.field82) {
						if ((var4.field1972 & 0x7F) == 64 && (var4.field1963 & 0x7F) == 64) {
							if (class121.field3015[var5][var6] == Statics.field2399) {
								continue;
							}
							class121.field3015[var5][var6] = Statics.field2399;
						}
						var4.field84 = Statics.method712(Statics.field75, var4.field1972, var4.field1963);
						field3183.method90(Statics.field75, var4.field1972, var4.field1963, var4.field84, 60, var4, var4.field1992, var3, var4.field1979);
					} else {
						var4.field95 = false;
						var4.field84 = Statics.method712(Statics.field75, var4.field1972, var4.field1963);
						field3183.method68(Statics.field75, var4.field1972, var4.field1963, var4.field84, var4, var4.field1992, var3, var4.field66, var4.field89, var4.field70, var4.field97);
					}
				}
			}
		}
	}

	@ObfuscatedName("de.a(I)V")
	public static void method323() {
		for (int var0 = 0; var0 < Statics.field2027; var0++) {
			int var1 = class50.field1348[var0];
			ClientNpc var2 = Statics.field2992[var1];
			int var3 = Statics.field488.method144();
			if ((var3 & 0x1) != 0) {
				int var4 = Statics.field488.method152();
				int var5 = Statics.field488.method156();
				var2.method727(var5, Statics.field2063, var4);
				var2.field2013 = Statics.field2063 + 300;
				var2.field2004 = Statics.field488.method152();
				var2.field1975 = Statics.field488.method144();
			}
			if ((var3 & 0x20) != 0) {
				var2.field1965 = Statics.field488.method180();
				int var6 = Statics.field488.method167();
				var2.field2003 = 0;
				var2.field1967 = (var6 & 0xFFFF) + Statics.field2063;
				var2.field1984 = var6 >> 16;
				var2.field2014 = 0;
				if (var2.field1967 > Statics.field2063) {
					var2.field2014 = -1;
				}
				if (var2.field1965 == 65535) {
					var2.field1965 = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				var2.field2011 = Statics.field488.method137();
				if (var2.field2011 == 65535) {
					var2.field2011 = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				int var7 = Statics.field488.method152();
				int var8 = Statics.field488.method144();
				var2.method727(var8, Statics.field2063, var7);
				var2.field2013 = Statics.field2063 + 300;
				var2.field2004 = Statics.field488.method156();
				var2.field1975 = Statics.field488.method156();
			}
			if ((var3 & 0x40) != 0) {
				var2.field1964 = Statics.field488.method140();
				var2.field1952 = 100;
			}
			if ((var3 & 0x80) != 0) {
				var2.field3182 = NpcType.method864(Statics.field488.method137());
				var2.field1957 = var2.field3182.field1099;
				var2.field1987 = var2.field3182.field1101;
				var2.field1949 = var2.field3182.field1128;
				var2.field2000 = var2.field3182.field1092;
				var2.field2005 = var2.field3182.field1135;
				var2.field2019 = var2.field3182.field1131;
				var2.field1970 = var2.field3182.field1084;
				var2.field2006 = var2.field3182.field1123;
				var2.field1953 = var2.field3182.field1116;
			}
			if ((var3 & 0x8) != 0) {
				var2.field2022 = Statics.field488.method137();
				var2.field1974 = Statics.field488.method166();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = Statics.field488.method137();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = Statics.field488.method147();
				if (var2.field2015 == var9 && var9 != -1) {
					int var11 = SeqType.method103(var9).field1240;
					if (var11 == 1) {
						var2.field1989 = 0;
						var2.field1969 = 0;
						var2.field1978 = 0;
						var2.field1996 = var10;
					}
					if (var11 == 2) {
						var2.field1969 = 0;
					}
				} else if (var9 == -1 || var2.field2015 == -1 || SeqType.method103(var9).field1251 >= SeqType.method103(var2.field2015).field1251) {
					var2.field2015 = var9;
					var2.field1989 = 0;
					var2.field1996 = var10;
					var2.field1978 = 0;
					var2.field1969 = 0;
					var2.field1968 = var2.field1983;
				}
			}
		}
	}

	@ObfuscatedName("de.a(Lnb;IB)V")
	public static void method319(ClientEntity arg0, int arg1) {
		if (arg0.field1972 < 128 || arg0.field1963 < 128 || arg0.field1972 >= 13184 || arg0.field1963 >= 13184) {
			arg0.field2015 = -1;
			arg0.field1986 = 0;
			arg0.field1981 = 0;
			arg0.field1965 = -1;
			arg0.field1972 = arg0.field1962[0] * 128 + arg0.field1970 * 64;
			arg0.field1963 = arg0.field2009[0] * 128 + arg0.field1970 * 64;
			arg0.method732();
		}
		if (Statics.field2621 == arg0 && (arg0.field1972 < 1536 || arg0.field1963 < 1536 || arg0.field1972 >= 11776 || arg0.field1963 >= 11776)) {
			arg0.field1965 = -1;
			arg0.field1981 = 0;
			arg0.field1986 = 0;
			arg0.field2015 = -1;
			arg0.field1972 = arg0.field1962[0] * 128 + arg0.field1970 * 64;
			arg0.field1963 = arg0.field2009[0] * 128 + arg0.field1970 * 64;
			arg0.method732();
		}
		if (Statics.field2063 < arg0.field1986) {
			Statics.method835(arg0);
		} else if (arg0.field1981 < Statics.field2063) {
			method761(arg0);
		} else {
			Statics.method641(arg0);
		}
		Statics.method296(arg0);
		method937(arg0);
	}

	@ObfuscatedName("oe.a(ILnb;)V")
	public static void method761(ClientEntity arg0) {
		arg0.field1951 = arg0.field2000;
		if (arg0.field1983 == 0) {
			arg0.field1948 = 0;
			return;
		}
		if (arg0.field2015 != -1 && arg0.field1996 == 0) {
			SeqType var1 = SeqType.method103(arg0.field2015);
			if (arg0.field1968 > 0 && var1.field1227 == 0) {
				arg0.field1948++;
				return;
			}
			if (arg0.field1968 <= 0 && var1.field1233 == 0) {
				arg0.field1948++;
				return;
			}
		}
		int var2 = arg0.field1972;
		int var3 = arg0.field1962[arg0.field1983 - 1] * 128 + arg0.field1970 * 64;
		int var4 = arg0.field1963;
		int var5 = arg0.field2009[arg0.field1983 - 1] * 128 + arg0.field1970 * 64;
		if (var3 - var2 > 256 || var3 - var2 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
			arg0.field1972 = var3;
			arg0.field1963 = var5;
			return;
		}
		if (var2 < var3) {
			if (var4 < var5) {
				arg0.field1954 = 1280;
			} else if (var5 < var4) {
				arg0.field1954 = 1792;
			} else {
				arg0.field1954 = 1536;
			}
		} else if (var2 <= var3) {
			if (var5 > var4) {
				arg0.field1954 = 1024;
			} else if (var5 < var4) {
				arg0.field1954 = 0;
			}
		} else if (var4 < var5) {
			arg0.field1954 = 768;
		} else if (var5 < var4) {
			arg0.field1954 = 256;
		} else {
			arg0.field1954 = 512;
		}
		int var6 = arg0.field1953;
		int var7 = 4;
		if (arg0.field1992 != arg0.field1954 && arg0.field2011 == -1 && arg0.field1987 != 0) {
			var7 = 2;
		}
		if (arg0.field1983 > 2) {
			var7 = 6;
		}
		if (arg0.field1983 > 3) {
			var7 = 8;
		}
		int var8 = arg0.field1954 - arg0.field1992 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		if (var8 >= -256 && var8 <= 256) {
			var6 = arg0.field2005;
		} else if (var8 >= 256 && var8 < 768) {
			var6 = arg0.field2006;
		} else if (var8 >= -768 && var8 <= -256) {
			var6 = arg0.field1949;
		}
		if (var6 == -1) {
			var6 = arg0.field2005;
		}
		arg0.field1951 = var6;
		if (arg0.field1948 > 0 && arg0.field1983 > 1) {
			arg0.field1948--;
			var7 = 8;
		}
		if (arg0.field1946[arg0.field1983 - 1]) {
			var7 <<= 0x1;
		}
		if (var4 < var5) {
			arg0.field1963 += var7;
			if (arg0.field1963 > var5) {
				arg0.field1963 = var5;
			}
		} else if (var4 > var5) {
			arg0.field1963 -= var7;
			if (arg0.field1963 < var5) {
				arg0.field1963 = var5;
			}
		}
		if (var7 >= 8 && arg0.field2005 == arg0.field1951 && arg0.field1956 != -1) {
			arg0.field1951 = arg0.field1956;
		}
		if (var2 < var3) {
			arg0.field1972 += var7;
			if (var3 < arg0.field1972) {
				arg0.field1972 = var3;
			}
		} else if (var3 < var2) {
			arg0.field1972 -= var7;
			if (var3 > arg0.field1972) {
				arg0.field1972 = var3;
			}
		}
		if (arg0.field1972 == var3 && arg0.field1963 == var5) {
			if (arg0.field1968 > 0) {
				arg0.field1968--;
			}
			arg0.field1983--;
		}
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
				Statics.field1059 = 3000;
			} else {
				this.error("js5connect_full");
				class103.field2599 = 1000;
			}
		} else if (class14.field466 >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			class103.field2599 = 1000;
		} else if (class14.field466 >= 4) {
			if (class103.field2599 <= 5) {
				this.error("js5connect");
				class103.field2599 = 1000;
			} else {
				Statics.field1059 = 3000;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void method279() {
		Statics.field2063++;
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
			method865();
		}
		if (class103.field2599 == 30) {
			method1024();
		} else if (class103.field2599 == 35) {
			method1024();
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
		if (GameShell.field3242) {
			ClientKeyboardListener.method422(GameShell.canvas);
			Statics.method902(GameShell.canvas);
			this.method628();
			Statics.method856(GameShell.canvas);
			ClientMouseListener.method465(GameShell.canvas);
		}
		if (class103.field2599 == 0) {
			Statics.method536(field3274, null, field3079);
		} else if (class103.field2599 == 5) {
			Statics.method888(b12, p11);
		} else if (class103.field2599 == 10) {
			Statics.method888(b12, p11);
		} else if (class103.field2599 == 20) {
			Statics.method888(b12, p11);
		} else if (class103.field2599 == 25) {
			if (Statics.field3301 == 1) {
				if (class78.field1922 > Statics.field948) {
					Statics.field948 = class78.field1922;
				}
				int var1 = (Statics.field948 - class78.field1922) * 50 / Statics.field948;
				method872(Statics.field3252, true, JagString.join(new JagString[] { Statics.field221, Statics.method502(var1), Statics.field1673 }));
			} else if (Statics.field3301 == 2) {
				if (Statics.field2358 > Statics.field1441) {
					Statics.field1441 = Statics.field2358;
				}
				int var2 = (Statics.field1441 - Statics.field2358) * 50 / Statics.field1441 + 50;
				method872(Statics.field3252, true, JagString.join(new JagString[] { Statics.field221, Statics.method502(var2), Statics.field1673 }));
			} else {
				method872(Statics.field3252, false, null);
			}
		} else if (class103.field2599 == 30) {
			Statics.method611();
		} else if (class103.field2599 == 35) {
			Statics.method188();
		} else if (class103.field2599 == 40) {
			method872(Statics.field3187, false, Statics.field2033);
		}
		Statics.field3176 = 0;
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 6) {
				method714((byte) 37);
			}
			class24.field723 = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				Statics.field2182 = 0;
			} else if (arg0[1].equals("office")) {
				Statics.field2182 = 1;
			} else if (arg0[1].equals("local")) {
				Statics.field2182 = 2;
			} else {
				method714((byte) 118);
			}
			if (arg0[2].equals("live")) {
				Statics.field2175 = 0;
			} else if (arg0[2].equals("rc")) {
				Statics.field2175 = 1;
			} else if (arg0[2].equals("wip")) {
				Statics.field2175 = 2;
			} else {
				method714((byte) 34);
			}
			if (arg0[3].equals("lowmem")) {
				Statics.method961();
			} else if (arg0[3].equals("highmem")) {
				Statics.method253();
			} else {
				method714((byte) 121);
			}
			if (arg0[4].equals("free")) {
				MidiStream.field1183 = false;
			} else if (arg0[4].equals("members")) {
				MidiStream.field1183 = true;
			} else {
				method714((byte) 93);
			}
			if (arg0[5].equals("english")) {
				BZip2State.field1838 = 0;
			} else if (arg0[5].equals("german")) {
				Statics.method899();
				BZip2State.field1838 = 1;
			} else {
				method714((byte) 106);
			}
			Client var1 = new Client();
			var1.method626("runescape", 13, 503, Statics.field2175 + 32, InetAddress.getLocalHost(), 435, 765);
		} catch (Exception var3) {
			JagException.report(null, var3);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void method284() {
		if (BZip2State.field1803 >= 4) {
			this.error("js5crc");
			class103.field2599 = 1000;
			return;
		}
		if (ClientScript.field525 >= 4) {
			if (class103.field2599 <= 5) {
				this.error("js5io");
				class103.field2599 = 1000;
				return;
			}
			ClientScript.field525 = 3;
			Statics.field1059 = 3000;
		}
		if (Statics.field1059-- > 0) {
			return;
		}
		try {
			if (class14.field464 == 0) {
				Statics.field3299 = GameShell.signlink.method657(Statics.field545);
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
				Statics.field1651 = new class129((Socket) Statics.field3299.field818, GameShell.signlink);
				Packet var1 = new Packet(5);
				var1.method141(15);
				var1.method182(435);
				Statics.field1651.method1016(5, var1.field284);
				class14.field464++;
				Statics.field1014 = Statics.currentTime();
			}
			if (class14.field464 == 3) {
				if (class103.field2599 <= 5 || Statics.field1651.method1020() > 0) {
					int var2 = Statics.field1651.method1022();
					if (var2 != 0) {
						this.method277(var2);
						return;
					}
					class14.field464++;
				} else if (Statics.currentTime() - Statics.field1014 > 30000L) {
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
		ClientKeyboardListener.method945();
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
		Statics.field2175 = Integer.parseInt(this.getParameter("modewhat"));
		Statics.field2182 = Integer.parseInt(this.getParameter("modewhere"));
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
		this.method621(Statics.field2175 + 32);
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
		Statics.method199();
		Statics.method70();
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
		Statics.method768();
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
		Statics.method276();
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
		Statics.method358();
		Statics.method924();
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
		Statics.method765();
		Statics.method1032();
		Statics.method963();
		Statics.method187();
		Statics.method243();
		Statics.method269();
		Statics.method123();
		Statics.method1004();
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
		Statics.method376();
		Statics.method927();
		Statics.method744();
		Statics.method1008();
		Statics.method438();
		Statics.method687();
		Statics.method543();
		Statics.method471();
		Statics.method477();
		Statics.method816();
		Statics.method437();
		Statics.method630();
		Statics.method975();
		Statics.method999();
		Statics.method351();
		Statics.method421();
	}

	@ObfuscatedName("client.c(Z)V")
	@Override
	public void method290() {
		Statics.field223 = Statics.field2182 == 0 ? 443 : class24.field723 + 50000;
		Statics.field915 = Statics.field2182 == 0 ? 43594 : class24.field723 + 40000;
		Statics.field545 = Statics.field915;
		ClientKeyboardListener.method987();
		Statics.method856(GameShell.canvas);
		ClientMouseListener.method465(GameShell.canvas);
		Statics.field1551 = SignLink.field1716;
		try {
			if (GameShell.signlink.field1715 != null) {
				Statics.field797 = new BufferedRandomAccessFile(GameShell.signlink.field1715, 5200, 0);
				for (int var1 = 0; var1 < 13; var1++) {
					class46.field1193[var1] = new BufferedRandomAccessFile(GameShell.signlink.field1702[var1], 6000, 0);
				}
				Statics.field1668 = new BufferedRandomAccessFile(GameShell.signlink.field1707, 6000, 0);
				Statics.field931 = new DataFile(255, Statics.field797, Statics.field1668, 500000);
				GameShell.signlink.field1702 = null;
				GameShell.signlink.field1707 = null;
				GameShell.signlink.field1715 = null;
			}
		} catch (IOException var2) {
			Statics.field931 = null;
			Statics.field797 = null;
			Statics.field1668 = null;
		}
		if (Statics.field2182 != 0) {
			Statics.field1007 = true;
		}
		Statics.field704 = new IfType();
	}
}
