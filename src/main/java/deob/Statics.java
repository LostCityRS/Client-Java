package deob;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URL;
import java.util.Date;
import java.util.zip.GZIPInputStream;
// import netscape.javascript.JSObject;

public class Statics {

	@ObfuscatedName("g.z")
	public static byte[][][] field1003;

	@ObfuscatedName("ga.y")
	public static long field1014;

	@ObfuscatedName("ga.M")
	public static class11 field1028;

	@ObfuscatedName("ga.N")
	public static int field1029;

	@ObfuscatedName("ab.b")
	public static int field103;

	@ObfuscatedName("ab.e")
	public static int field106;

	@ObfuscatedName("gb.p")
	public static boolean field1062;

	@ObfuscatedName("gb.y")
	public static class69 field1071;

	@ObfuscatedName("gb.B")
	public static class25 field1074;

	@ObfuscatedName("gb.C")
	public static int field1075;

	@ObfuscatedName("gb.F")
	public static int[] field1078;

	@ObfuscatedName("gd.T")
	public static class71 field1080;

	@ObfuscatedName("h.xb")
	public static class120 field1087;

	@ObfuscatedName("ab.h")
	public static int field109;

	@ObfuscatedName("h.Gb")
	public static int[] field1096;

	@ObfuscatedName("a.k")
	public static class134 field11;

	@ObfuscatedName("ab.j")
	public static int field111;

	@ObfuscatedName("ab.l")
	public static int field113;

	@ObfuscatedName("ab.m")
	public static int field114;

	@ObfuscatedName("hb.cb")
	public static int field1157;

	@ObfuscatedName("ab.o")
	public static int field116;

	@ObfuscatedName("hb.hb")
	public static int[] field1162;

	@ObfuscatedName("hb.mb")
	public static class134 field1167;

	@ObfuscatedName("hc.e")
	public static class25[] field1177;

	@ObfuscatedName("hc.o")
	public static int field1187;

	@ObfuscatedName("hd.vb")
	public static int field1194;

	@ObfuscatedName("hd.Bb")
	public static int field1200;

	@ObfuscatedName("ab.u")
	public static int field122;

	@ObfuscatedName("he.Cb")
	public static class58[] field1231;

	@ObfuscatedName("he.Kb")
	public static class58 field1239;

	@ObfuscatedName("he.Mb")
	public static class11 field1241;

	@ObfuscatedName("he.Sb")
	public static int[][] field1247;

	@ObfuscatedName("ab.x")
	public static int field125;

	@ObfuscatedName("i.a")
	public static class25 field1255;

	@ObfuscatedName("ab.y")
	public static int field126;

	@ObfuscatedName("ab.z")
	public static int field127;

	@ObfuscatedName("i.p")
	public static int field1270;

	@ObfuscatedName("i.w")
	public static boolean field1277;

	@ObfuscatedName("ia.Sb")
	public static class134 field1307;

	@ObfuscatedName("ab.E")
	public static int field131;

	@ObfuscatedName("ib.c")
	public static int[] field1347;

	@ObfuscatedName("id.g")
	public static class25 field1366;

	@ObfuscatedName("ab.K")
	public static int field137;

	@ObfuscatedName("id.q")
	public static class58[] field1376;

	@ObfuscatedName("id.s")
	public static class120 field1378;

	@ObfuscatedName("ab.L")
	public static int field138;

	@ObfuscatedName("id.u")
	public static class29 field1380;

	@ObfuscatedName("id.v")
	public static class87 field1381;

	@ObfuscatedName("id.z")
	public static int[] field1385;

	@ObfuscatedName("ie.i")
	public static Image field1397;

	@ObfuscatedName("ie.l")
	public static int field1400;

	@ObfuscatedName("ie.q")
	public static class11 field1405;

	@ObfuscatedName("ie.t")
	public static int field1408;

	@ObfuscatedName("j.jc")
	public static class134 field1435;

	@ObfuscatedName("j.mc")
	public static class134 field1438;

	@ObfuscatedName("ja.R")
	public static class21 field1442;

	@ObfuscatedName("ja.S")
	public static boolean field1443;

	@ObfuscatedName("ja.U")
	public static int field1445;

	@ObfuscatedName("ja.W")
	public static boolean field1447;

	@ObfuscatedName("ja.X")
	public static int field1448;

	@ObfuscatedName("ab.S")
	public static int field145;

	@ObfuscatedName("jc.db")
	public static class129 field1450;

	@ObfuscatedName("jc.kb")
	public static class25 field1457;

	@ObfuscatedName("jc.pb")
	public static int field1462;

	@ObfuscatedName("jc.vb")
	public static class100 field1468;

	@ObfuscatedName("jc.yb")
	public static int field1471;

	@ObfuscatedName("ab.W")
	public static int field149;

	@ObfuscatedName("ab.Y")
	public static int field151;

	@ObfuscatedName("k.M")
	public static class25 field1524;

	@ObfuscatedName("kb.b")
	public static class120 field1542;

	@ObfuscatedName("ab.cb")
	public static int field155;

	@ObfuscatedName("kb.k")
	public static int field1551;

	@ObfuscatedName("kb.m")
	public static class134 field1553;

	@ObfuscatedName("kb.o")
	public static class11 field1555;

	@ObfuscatedName("kb.p")
	public static int[] field1556;

	@ObfuscatedName("kb.r")
	public static class134 field1558;

	@ObfuscatedName("kb.t")
	public static int[] field1560;

	@ObfuscatedName("kc.n")
	public static class58[] field1578;

	@ObfuscatedName("kc.s")
	public static class11 field1583;

	@ObfuscatedName("kc.z")
	public static int field1590;

	@ObfuscatedName("kd.a")
	public static class25 field1598;

	@ObfuscatedName("ab.hb")
	public static boolean[][] field160;

	@ObfuscatedName("ab.jb")
	public static int field162;

	@ObfuscatedName("kd.E")
	public static int field1628;

	@ObfuscatedName("ab.kb")
	public static int field163;

	@ObfuscatedName("l.h")
	public static class129 field1651;

	@ObfuscatedName("la.b")
	public static int field1656;

	@ObfuscatedName("la.h")
	public static boolean field1662;

	@ObfuscatedName("la.n")
	public static class133 field1668;

	@ObfuscatedName("la.I")
	public static class134 field1689;

	@ObfuscatedName("la.L")
	public static class129 field1692;

	@ObfuscatedName("lc.e")
	public static Method field1703;

	@ObfuscatedName("lc.g")
	public static String field1705;

	@ObfuscatedName("lc.j")
	public static Method field1708;

	@ObfuscatedName("lc.p")
	public static String field1714;

	@ObfuscatedName("lc.t")
	public static String field1718;

	@ObfuscatedName("ld.z")
	public static int field1746;

	@ObfuscatedName("ld.A")
	public static class79 field1747;

	@ObfuscatedName("ld.B")
	public static int field1748;

	@ObfuscatedName("ld.F")
	public static class120 field1752;

	@ObfuscatedName("ac.P")
	public static class58[] field178;

	@ObfuscatedName("ma.db")
	public static class134 field1780;

	@ObfuscatedName("mb.f")
	public static class48 field1795;

	@ObfuscatedName("mb.X")
	public static int field1839;

	@ObfuscatedName("ac.V")
	public static int field184;

	@ObfuscatedName("mb.ab")
	public static int[] field1842;

	@ObfuscatedName("mb.bb")
	public static long field1843;

	@ObfuscatedName("mb.db")
	public static class25 field1845;

	@ObfuscatedName("mc.n")
	public static Frame field1859;

	@ObfuscatedName("ac.Y")
	public static class134 field187;

	@ObfuscatedName("mc.z")
	public static class25 field1871;

	@ObfuscatedName("mc.A")
	public static byte[][][] field1872;

	@ObfuscatedName("md.xb")
	public static class58[] field1886;

	@ObfuscatedName("md.Bb")
	public static class120 field1890;

	@ObfuscatedName("md.Gb")
	public static int field1895;

	@ObfuscatedName("md.Lb")
	public static int field1900;

	@ObfuscatedName("md.Mb")
	public static class11 field1901;

	@ObfuscatedName("ad.e")
	public static int field192;

	@ObfuscatedName("n.t")
	public static class58[] field1926;

	@ObfuscatedName("na.g")
	public static class134 field1935;

	@ObfuscatedName("na.l")
	public static int field1940;

	@ObfuscatedName("nb.wc")
	public static int[] field1985;

	@ObfuscatedName("nb.dd")
	public static class11 field2018;

	@ObfuscatedName("nb.jd")
	public static class11 field2024;

	@ObfuscatedName("nb.ld")
	public static class69 field2026;

	@ObfuscatedName("nb.qd")
	public static class120 field2031;

	@ObfuscatedName("nc.d")
	public static int field2038;

	@ObfuscatedName("nc.j")
	public static class134 field2044;

	@ObfuscatedName("nc.k")
	public static class134 field2045;

	@ObfuscatedName("nc.u")
	public static class58 field2055;

	@ObfuscatedName("oa.f")
	public static byte[][][] field2131;

	@ObfuscatedName("oa.z")
	public static int[] field2151;

	@ObfuscatedName("ad.D")
	public static class14 field217;

	@ObfuscatedName("oe.b")
	public static int[][] field2170;

	@ObfuscatedName("oe.s")
	public static class25 field2187;

	@ObfuscatedName("ad.F")
	public static int field219;

	@ObfuscatedName("p.hb")
	public static int[] field2196;

	@ObfuscatedName("ad.J")
	public static int field223;

	@ObfuscatedName("pa.Cc")
	public static int field2247;

	@ObfuscatedName("pa.Jc")
	public static int field2254;

	@ObfuscatedName("pa.Oc")
	public static int field2259;

	@ObfuscatedName("pb.a")
	public static long field2271;

	@ObfuscatedName("pb.g")
	public static class58 field2277;

	@ObfuscatedName("pb.k")
	public static int field2281;

	@ObfuscatedName("ae.f")
	public static int[] field229;

	@ObfuscatedName("pb.u")
	public static int[] field2291;

	@ObfuscatedName("pc.a")
	public static int field2306;

	@ObfuscatedName("pc.s")
	public static class120 field2324;

	@ObfuscatedName("pe.xb")
	public static class132 field2357;

	@ObfuscatedName("pe.Mb")
	public static int field2372;

	@ObfuscatedName("pe.Qb")
	public static class120 field2376;

	@ObfuscatedName("pe.Yb")
	public static boolean field2384;

	@ObfuscatedName("ae.p")
	public static int field239;

	@ObfuscatedName("qb.k")
	public static class8 field2415;

	@ObfuscatedName("qc.i")
	public static class11 field2433;

	@ObfuscatedName("qc.k")
	public static class7 field2435;

	@ObfuscatedName("qc.m")
	public static int field2437;

	@ObfuscatedName("r.l")
	public static int[] field2570;

	@ObfuscatedName("r.C")
	public static class134 field2587;

	@ObfuscatedName("r.D")
	public static int[] field2588;

	@ObfuscatedName("ra.l")
	public static int[] field2600;

	@ObfuscatedName("ra.p")
	public static int field2604;

	@ObfuscatedName("ra.r")
	public static class1[] field2606;

	@ObfuscatedName("ra.t")
	public static class134 field2608;

	@ObfuscatedName("rb.sb")
	public static class8 field2613;

	@ObfuscatedName("rb.tb")
	public static class25[] field2614;

	@ObfuscatedName("rb.Ab")
	public static class2 field2621;

	@ObfuscatedName("rb.Fb")
	public static class58 field2626;

	@ObfuscatedName("rc.g")
	public static byte[][] field2633;

	@ObfuscatedName("rd.A")
	public static class10 field2684;

	@ObfuscatedName("rd.C")
	public static class25 field2686;

	@ObfuscatedName("re.o")
	public static class134 field2701;

	@ObfuscatedName("s.a")
	public static class120 field2702;

	@ObfuscatedName("s.d")
	public static class98 field2705;

	@ObfuscatedName("sa.g")
	public static class25 field2731;

	@ObfuscatedName("sa.o")
	public static class120 field2739;

	@ObfuscatedName("sa.u")
	public static class25 field2745;

	@ObfuscatedName("sc.sb")
	public static int[] field2747;

	@ObfuscatedName("sc.ub")
	public static int field2749;

	@ObfuscatedName("sc.vb")
	public static int field2750;

	@ObfuscatedName("sd.p")
	public static class129 field2769;

	@ObfuscatedName("sd.q")
	public static class25 field2770;

	@ObfuscatedName("sd.r")
	public static int[] field2771;

	@ObfuscatedName("ba.Jb")
	public static class25 field279;

	@ObfuscatedName("se.v")
	public static byte[][] field2794;

	@ObfuscatedName("se.A")
	public static class11 field2799;

	@ObfuscatedName("t.ub")
	public static class25 field2806;

	@ObfuscatedName("t.vb")
	public static class25[] field2807;

	@ObfuscatedName("t.yb")
	public static class11 field2810;

	@ObfuscatedName("ta.Mb")
	public static int field2846;

	@ObfuscatedName("ta.rc")
	public static int field2877;

	@ObfuscatedName("ta.zc")
	public static int field2885;

	@ObfuscatedName("tb.Pb")
	public static class10 field2892;

	@ObfuscatedName("tb.Wb")
	public static class134 field2899;

	@ObfuscatedName("tb.Zb")
	public static class10 field2902;

	@ObfuscatedName("tb.bc")
	public static int[] field2904;

	@ObfuscatedName("tb.dc")
	public static int[] field2906;

	@ObfuscatedName("tb.gc")
	public static int[] field2909;

	@ObfuscatedName("tb.ic")
	public static int[] field2911;

	@ObfuscatedName("tc.d")
	public static int field2915;

	@ObfuscatedName("tc.g")
	public static int field2918;

	@ObfuscatedName("tc.h")
	public static class25 field2919;

	@ObfuscatedName("ba.Wb")
	public static int[] field292;

	@ObfuscatedName("tc.i")
	public static int field2920;

	@ObfuscatedName("tc.k")
	public static class100[][] field2922;

	@ObfuscatedName("tc.s")
	public static int[] field2930;

	@ObfuscatedName("td.n")
	public static int field2945;

	@ObfuscatedName("td.r")
	public static int field2949;

	@ObfuscatedName("te.rb")
	public static class11 field2966;

	@ObfuscatedName("u.pb")
	public static int field2985;

	@ObfuscatedName("a.D")
	public static class15 field30;

	@ObfuscatedName("ua.w")
	public static class134 field3021;

	@ObfuscatedName("ua.A")
	public static int[] field3025;

	@ObfuscatedName("ub.j")
	public static long field3036;

	@ObfuscatedName("ub.u")
	public static long field3047;

	@ObfuscatedName("ub.v")
	public static int field3048;

	@ObfuscatedName("ub.w")
	public static Canvas field3049;

	@ObfuscatedName("ub.A")
	public static byte[][][] field3053;

	@ObfuscatedName("uc.F")
	public static class100 field3068;

	@ObfuscatedName("bb.a")
	public static class45 field311;

	@ObfuscatedName("vb.ub")
	public static class120 field3131;

	@ObfuscatedName("vb.xb")
	public static class25 field3134;

	@ObfuscatedName("vb.Cb")
	public static int[] field3139;

	@ObfuscatedName("vb.Db")
	public static int field3140;

	@ObfuscatedName("bb.f")
	public static int field316;

	@ObfuscatedName("vc.v")
	public static class11 field3167;

	@ObfuscatedName("vd.yd")
	public static boolean field3180;

	@ObfuscatedName("vd.Bd")
	public static class3 field3183;

	@ObfuscatedName("vd.Md")
	public static int[] field3194;

	@ObfuscatedName("bb.j")
	public static int[] field320;

	@ObfuscatedName("w.d")
	public static class120 field3200;

	@ObfuscatedName("wa.b")
	public static class134 field3208;

	@ObfuscatedName("wb.d")
	public static class11 field3244;

	@ObfuscatedName("wb.f")
	public static int[] field3246;

	@ObfuscatedName("wc.o")
	public static boolean[] field3296;

	@ObfuscatedName("wc.q")
	public static class134 field3298;

	@ObfuscatedName("wc.r")
	public static class29 field3299;

	@ObfuscatedName("bd.e")
	public static class25[] field365;

	@ObfuscatedName("bd.S")
	public static int field405;

	@ObfuscatedName("bd.Z")
	public static int[][][] field412;

	@ObfuscatedName("ca.j")
	public static class11 field458;

	@ObfuscatedName("ca.n")
	public static long field462;

	@ObfuscatedName("ca.o")
	public static int field463;

	@ObfuscatedName("ca.u")
	public static FontMetrics field469;

	@ObfuscatedName("ca.v")
	public static class58[] field470;

	@ObfuscatedName("ca.x")
	public static class134 field472;

	@ObfuscatedName("cb.x")
	public static class11 field503;

	@ObfuscatedName("a.Y")
	public static class11 field51;

	@ObfuscatedName("cc.Gb")
	public static class134 field522;

	@ObfuscatedName("cd.q")
	public static int field545;

	@ObfuscatedName("client.Y")
	public static int field579;

	@ObfuscatedName("a.ib")
	public static byte[][] field61;

	@ObfuscatedName("client.Eb")
	public static boolean field611;

	@ObfuscatedName("d.kc")
	public static int field640;

	@ObfuscatedName("d.Bc")
	public static class120 field657;

	@ObfuscatedName("d.Fc")
	public static int field661;

	@ObfuscatedName("dc.gb")
	public static class58[] field680;

	@ObfuscatedName("dc.hb")
	public static int field681;

	@ObfuscatedName("dc.yb")
	public static class11 field698;

	@ObfuscatedName("dd.d")
	public static class100 field704;

	@ObfuscatedName("dd.h")
	public static class81 field708;

	@ObfuscatedName("dd.i")
	public static int field709;

	@ObfuscatedName("dd.k")
	public static int field711;

	@ObfuscatedName("dd.o")
	public static class29 field715;

	@ObfuscatedName("de.s")
	public static class25 field739;

	@ObfuscatedName("de.v")
	public static int[] field742;

	@ObfuscatedName("aa.Fd")
	public static int field75;

	@ObfuscatedName("eb.Ab")
	public static int field762;

	@ObfuscatedName("eb.Bb")
	public static int field763;

	@ObfuscatedName("eb.Eb")
	public static int field766;

	@ObfuscatedName("eb.Fb")
	public static int field767;

	@ObfuscatedName("eb.Hb")
	public static int field769;

	@ObfuscatedName("eb.Ib")
	public static int[] field770;

	@ObfuscatedName("eb.Jb")
	public static class88 field771;

	@ObfuscatedName("eb.Lb")
	public static int field773;

	@ObfuscatedName("eb.Mb")
	public static int field774;

	@ObfuscatedName("eb.Pb")
	public static int field777;

	@ObfuscatedName("aa.Id")
	public static byte[] field78;

	@ObfuscatedName("ec.vb")
	public static class58 field784;

	@ObfuscatedName("ec.Ib")
	public static class133 field797;

	@ObfuscatedName("ec.Lb")
	public static class25[] field800;

	@ObfuscatedName("ec.Rb")
	public static int field806;

	@ObfuscatedName("ee.a")
	public static float field819;

	@ObfuscatedName("ee.e")
	public static int field823;

	@ObfuscatedName("f.c")
	public static int field829;

	@ObfuscatedName("f.k")
	public static int[] field837;

	@ObfuscatedName("f.p")
	public static Font field842;

	@ObfuscatedName("f.q")
	public static class134 field843;

	@ObfuscatedName("f.r")
	public static class134 field844;

	@ObfuscatedName("fa.fb")
	public static class58 field851;

	@ObfuscatedName("fa.kb")
	public static int[] field856;

	@ObfuscatedName("fc.wb")
	public static int field893;

	@ObfuscatedName("fc.Cb")
	public static int[] field899;

	@ObfuscatedName("fc.Nb")
	public static byte[][][] field910;

	@ObfuscatedName("fc.Sb")
	public static int field915;

	@ObfuscatedName("fc.Ub")
	public static int field917;

	@ObfuscatedName("aa.Wd")
	public static int[] field92;

	@ObfuscatedName("fd.sb")
	public static class11 field924;

	@ObfuscatedName("fd.tb")
	public static class134 field925;

	@ObfuscatedName("fd.zb")
	public static class109 field931;

	@ObfuscatedName("fd.Hb")
	public static class11 field939;

	@ObfuscatedName("fe.Jc")
	public static class104 field967;

	@ObfuscatedName("fe.Qc")
	public static int field974;

	@ObfuscatedName("fe.Rc")
	public static int field975;

	@ObfuscatedName("g.i")
	public static int field986;

	@ObfuscatedName("g.p")
	public static class134 field993;

	@ObfuscatedName("g.v")
	public static class11 field999;

	@ObfuscatedName("cd.a(I)V")
	public static void method274() {
		class17.field547 = null;
		class17.field539 = null;
		class17.field533 = null;
		class17.field549 = null;
		class17.field552 = null;
		class17.field538 = null;
		class17.field541 = null;
		class17.field546 = null;
		class17.field548 = null;
	}

	@ObfuscatedName("cc.f(I)V")
	public static void method269() {
		class16.field526 = null;
		class16.field524 = null;
		class16.field520 = null;
		class16.field521 = null;
		field522 = null;
		class16.field515 = null;
	}

	@ObfuscatedName("f.a(Lvc;IZ)V")
	public static void method381(class129 arg0, boolean arg1) {
		if (field2769 != null) {
			try {
				field2769.method1015();
			} catch (Exception var7) {
			}
			field2769 = null;
		}
		field2769 = arg0;
		method617(arg1);
		class92.field2301.field267 = 0;
		field2613 = null;
		class102.field2559 = 0;
		field967 = null;
		while (true) {
			class104 var2 = (class104) class78.field1917.method497();
			if (var2 == null) {
				while (true) {
					class104 var3 = (class104) class74.field1831.method497();
					if (var3 == null) {
						if (class14.field476 != 0) {
							try {
								class8 var4 = new class8(4);
								var4.method141(4);
								var4.method141(class14.field476);
								var4.method150(0);
								field2769.method1016(4, var4.field284);
							} catch (IOException var6) {
								try {
									field2769.method1015();
								} catch (Exception var5) {
								}
								field2769 = null;
								class16.field525++;
							}
						}
						class45.field1189 = 0;
						field2271 = method869();
						return;
					}
					class37.field996.method613(var3);
					class49.field1328.method498(var3, var3.field2073);
					class85.field2144--;
					class48.field1260++;
				}
			}
			class103.field2596.method498(var2, var2.field2073);
			class31.field845--;
			class134.field3285++;
		}
	}

	@ObfuscatedName("fa.a(BLqd;La;)La;")
	public static class1 method386(class100 arg0, class1 arg1) {
		if (arg1.method11(class89.field2181) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.method11(class79.field1938);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.method11(class92.field2297);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.method11(class133.field3277);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.method11(class108.field2716);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.method11(class44.field1166);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.method11(class49.field1309);
													if (var7 == -1) {
														return arg1;
													}
													class1 var8 = class132.field3234;
													if (field715 != null) {
														var8 = method984(field715.field813);
														try {
															if (field715.field818 != null) {
																byte[] var9 = ((String) field715.field818).getBytes("ISO-8859-1");
																var8 = method419(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = method956(new class1[] { arg1.method19(0, var7), var8, arg1.method1(var7 + 4) });
												}
											}
											arg1 = method956(new class1[] { arg1.method19(0, var6), method973(method1039(4, arg0)), arg1.method1(var6 + 2) });
										}
									}
									arg1 = method956(new class1[] { arg1.method19(0, var5), method973(method1039(3, arg0)), arg1.method1(var5 + 2) });
								}
							}
							arg1 = method956(new class1[] { arg1.method19(0, var4), method973(method1039(2, arg0)), arg1.method1(var4 + 2) });
						}
					}
					arg1 = method956(new class1[] { arg1.method19(0, var3), method973(method1039(1, arg0)), arg1.method1(var3 + 2) });
				}
			}
			arg1 = method956(new class1[] { arg1.method19(0, var2), method973(method1039(0, arg0)), arg1.method1(var2 + 2) });
		}
	}

	@ObfuscatedName("gb.a(Lab;I[Lad;)V")
	public static void method425(class3 arg0, class5[] arg1) {
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					if ((class34.field898[var2][var3][var4] & 0x1) == 1) {
						int var5 = var2;
						if ((class34.field898[1][var3][var4] & 0x2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							arg1[var5].method115(var4, var3);
						}
					}
				}
			}
		}
		class114.field2822 += (int) (Math.random() * 5.0D) - 2;
		class80.field2025 += (int) (Math.random() * 5.0D) - 2;
		if (class114.field2822 < -8) {
			class114.field2822 = -8;
		}
		if (class114.field2822 > 8) {
			class114.field2822 = 8;
		}
		if (class80.field2025 < -16) {
			class80.field2025 = -16;
		}
		if (class80.field2025 > 16) {
			class80.field2025 = 16;
		}
		for (int var6 = 0; var6 < 4; var6++) {
			byte[][] var7 = field1003[var6];
			int var8 = (int) Math.sqrt(5100.0D);
			int var9 = var8 * 768 >> 8;
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					int var12 = class57.field1451[var6][var11 + 1][var10] - class57.field1451[var6][var11 - 1][var10];
					int var13 = class57.field1451[var6][var11][var10 + 1] - class57.field1451[var6][var11][var10 - 1];
					int var14 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536));
					int var15 = 65536 / var14;
					int var16 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11 - 1][var10] >> 2) + (var7[var11][var10 + -1] >> 2) + (var7[var11 + 1][var10] >> 3);
					int var17 = (var12 << 8) / var14;
					int var18 = (var13 << 8) / var14;
					int var19 = (var18 * -50 + var17 * -50 + var15 * -10) / var9 + 96;
					field1247[var11][var10] = var19 - var16;
				}
			}
			for (int var20 = 0; var20 < 104; var20++) {
				field2906[var20] = 0;
				field2930[var20] = 0;
				field856[var20] = 0;
				field3246[var20] = 0;
				field1385[var20] = 0;
			}
			for (int var21 = -5; var21 < 109; var21++) {
				for (int var22 = 0; var22 < 104; var22++) {
					int var23 = var21 + 5;
					int var10002;
					if (var23 >= 0 && var23 < 104) {
						int var24 = field2131[var6][var23][var22] & 0xFF;
						if (var24 > 0) {
							class76 var25 = method317(var24 - 1);
							field2906[var22] += var25.field1884;
							field2930[var22] += var25.field1893;
							field856[var22] += var25.field1882;
							field3246[var22] += var25.field1887;
							var10002 = field1385[var22]++;
						}
					}
					int var26 = var21 - 5;
					if (var26 >= 0 && var26 < 104) {
						int var27 = field2131[var6][var26][var22] & 0xFF;
						if (var27 > 0) {
							class76 var28 = method317(var27 - 1);
							field2906[var22] -= var28.field1884;
							field2930[var22] -= var28.field1893;
							field856[var22] -= var28.field1882;
							field3246[var22] -= var28.field1887;
							var10002 = field1385[var22]--;
						}
					}
				}
				if (var21 >= 1 && var21 < 103) {
					int var29 = 0;
					int var30 = 0;
					int var31 = 0;
					int var32 = 0;
					int var33 = 0;
					for (int var34 = -5; var34 < 109; var34++) {
						int var35 = var34 + 5;
						int var36 = var34 - 5;
						if (var35 >= 0 && var35 < 104) {
							var33 += field3246[var35];
							var30 += field2930[var35];
							var32 += field1385[var35];
							var31 += field856[var35];
							var29 += field2906[var35];
						}
						if (var36 >= 0 && var36 < 104) {
							var30 -= field2930[var36];
							var32 -= field1385[var36];
							var31 -= field856[var36];
							var33 -= field3246[var36];
							var29 -= field2906[var36];
						}
						if (var34 >= 1 && var34 < 103 && (!class93.field2332 || (class34.field898[0][var21][var34] & 0x2) != 0 || (class34.field898[var6][var21][var34] & 0x10) == 0 && method964(var6, var34, var21) == class57.field1472)) {
							if (var6 < class129.field3175) {
								class129.field3175 = var6;
							}
							int var37 = field2131[var6][var21][var34] & 0xFF;
							int var38 = field3053[var6][var21][var34] & 0xFF;
							if (var37 > 0 || var38 > 0) {
								int var39 = class57.field1451[var6][var21][var34];
								int var40 = class57.field1451[var6][var21 + 1][var34];
								int var41 = class57.field1451[var6][var21 + 1][var34 + 1];
								int var42 = class57.field1451[var6][var21][var34 + 1];
								int var43 = field1247[var21][var34];
								int var44 = field1247[var21 + 1][var34];
								int var45 = field1247[var21 + 1][var34 + 1];
								int var46 = -1;
								int var47 = field1247[var21][var34 + 1];
								int var48 = -1;
								if (var37 > 0) {
									int var49 = var29 * 256 / var33;
									int var50 = var30 / var32;
									int var51 = var31 / var32;
									var46 = method322(var50, var51, var49);
									int var52 = class80.field2025 + var51;
									int var53 = var49 + class114.field2822 & 0xFF;
									if (var52 < 0) {
										var52 = 0;
									} else if (var52 > 255) {
										var52 = 255;
									}
									var48 = method322(var50, var52, var53);
								}
								if (var6 > 0) {
									boolean var54 = true;
									if (var37 == 0 && field910[var6][var21][var34] != 0) {
										var54 = false;
									}
									if (var38 > 0 && !method1026(var38 - 1).field913) {
										var54 = false;
									}
									if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
										field412[var6][var21][var34] |= 0x924;
									}
								}
								int var55 = 0;
								if (var48 != -1) {
									var55 = class27.field764[method955(var48, 96)];
								}
								if (var38 == 0) {
									arg0.method55(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method955(var46, var43), method955(var46, var44), method955(var46, var45), method955(var46, var47), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = field910[var6][var21][var34] + 1;
									byte var57 = field1872[var6][var21][var34];
									class34 var58 = method1026(var38 - 1);
									int var59 = var58.field897;
									int var60;
									int var61;
									if (var59 >= 0) {
										var60 = -1;
										var61 = field771.method693(var59);
									} else if (var58.field920 == 16711935) {
										var60 = -2;
										var59 = -1;
										var61 = -2;
									} else {
										var60 = method322(var58.field912, var58.field895, var58.field907);
										int var62 = class114.field2822 + var58.field907 & 0xFF;
										int var63 = class80.field2025 + var58.field895;
										if (var63 < 0) {
											var63 = 0;
										} else if (var63 > 255) {
											var63 = 255;
										}
										var61 = method322(var58.field912, var63, var62);
									}
									int var64 = 0;
									if (var61 != -2) {
										var64 = class27.field764[method689(var61, 96)];
									}
									if (var58.field911 != -1) {
										int var65 = class114.field2822 + var58.field909 & 0xFF;
										int var66 = class80.field2025 + var58.field905;
										if (var66 < 0) {
											var66 = 0;
										} else if (var66 > 255) {
											var66 = 255;
										}
										int var67 = method322(var58.field921, var66, var65);
										var64 = class27.field764[method689(var67, 96)];
									}
									arg0.method55(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method955(var46, var43), method955(var46, var44), method955(var46, var45), method955(var46, var47), method689(var60, var43), method689(var60, var44), method689(var60, var45), method689(var60, var47), var55, var64);
								}
							}
						}
					}
				}
			}
			for (int var68 = 1; var68 < 103; var68++) {
				for (int var69 = 1; var69 < 103; var69++) {
					arg0.method86(var6, var69, var68, method964(var6, var68, var69));
				}
			}
			field2131[var6] = null;
			field3053[var6] = null;
			field910[var6] = null;
			field1872[var6] = null;
			field1003[var6] = null;
		}
		arg0.method74();
		for (int var70 = 0; var70 < 104; var70++) {
			for (int var71 = 0; var71 < 104; var71++) {
				if ((class34.field898[1][var70][var71] & 0x2) == 2) {
					arg0.method48(var70, var71);
				}
			}
		}
		int var72 = 1;
		int var73 = 2;
		int var74 = 4;
		for (int var75 = 0; var75 < 4; var75++) {
			if (var75 > 0) {
				var72 <<= 0x3;
				var74 <<= 0x3;
				var73 <<= 0x3;
			}
			for (int var76 = 0; var76 <= var75; var76++) {
				for (int var77 = 0; var77 <= 104; var77++) {
					for (int var78 = 0; var78 <= 104; var78++) {
						if ((field412[var76][var78][var77] & var72) != 0) {
							int var79;
							for (var79 = var77; var79 > 0 && (var72 & field412[var76][var78][var79 - 1]) != 0; var79--) {
							}
							int var80;
							for (var80 = var77; var80 < 104 && (field412[var76][var78][var80 + 1] & var72) != 0; var80++) {
							}
							int var81 = var76;
							int var82 = var76;
							label347: while (var81 > 0) {
								for (int var83 = var79; var83 <= var80; var83++) {
									if ((field412[var81 - 1][var78][var83] & var72) == 0) {
										break label347;
									}
								}
								var81--;
							}
							label336: while (var82 < var75) {
								for (int var84 = var79; var84 <= var80; var84++) {
									if ((var72 & field412[var82 + 1][var78][var84]) == 0) {
										break label336;
									}
								}
								var82++;
							}
							int var85 = (var80 + 1 - var79) * (var82 + 1 - var81);
							if (var85 >= 8) {
								int var86 = class57.field1451[var82][var78][var79] - 240;
								int var87 = class57.field1451[var81][var78][var79];
								class3.method72(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var86, var87);
								for (int var88 = var81; var88 <= var82; var88++) {
									for (int var89 = var79; var89 <= var80; var89++) {
										field412[var88][var78][var89] &= ~var72;
									}
								}
							}
						}
						if ((var73 & field412[var76][var78][var77]) != 0) {
							int var90;
							for (var90 = var78; var90 > 0 && (var73 & field412[var76][var90 - 1][var77]) != 0; var90--) {
							}
							int var91 = var76;
							int var92 = var78;
							int var93 = var76;
							while (var92 < 104 && (var73 & field412[var76][var92 + 1][var77]) != 0) {
								var92++;
							}
							label402: while (var93 > 0) {
								for (int var94 = var90; var94 <= var92; var94++) {
									if ((field412[var93 - 1][var94][var77] & var73) == 0) {
										break label402;
									}
								}
								var93--;
							}
							label391: while (var91 < var75) {
								for (int var95 = var90; var95 <= var92; var95++) {
									if ((var73 & field412[var91 + 1][var95][var77]) == 0) {
										break label391;
									}
								}
								var91++;
							}
							int var96 = (var92 + 1 - var90) * (var91 + 1 - var93);
							if (var96 >= 8) {
								int var97 = class57.field1451[var93][var90][var77];
								int var98 = class57.field1451[var91][var90][var77] - 240;
								class3.method72(var75, 2, var90 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
								for (int var99 = var93; var99 <= var91; var99++) {
									for (int var100 = var90; var100 <= var92; var100++) {
										field412[var99][var100][var77] &= ~var73;
									}
								}
							}
						}
						if ((field412[var76][var78][var77] & var74) != 0) {
							int var101 = var78;
							int var102 = var78;
							int var103 = var77;
							int var104 = var77;
							while (var103 > 0 && (field412[var76][var78][var103 - 1] & var74) != 0) {
								var103--;
							}
							while (var104 < 104 && (var74 & field412[var76][var78][var104 + 1]) != 0) {
								var104++;
							}
							label456: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((var74 & field412[var76][var101 - 1][var105]) == 0) {
										break label456;
									}
								}
								var101--;
							}
							label445: while (var102 < 104) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((var74 & field412[var76][var102 + 1][var106]) == 0) {
										break label445;
									}
								}
								var102++;
							}
							if ((var104 + 1 - var103) * (var102 + 1 - var101) >= 4) {
								int var107 = class57.field1451[var76][var101][var103];
								class3.method72(var75, 4, var101 * 128, var102 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field412[var76][var108][var109] &= ~var74;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hd.b(Z)V")
	public static void method477() {
		class46.field1218 = null;
		class46.field1203 = null;
		class46.field1191 = null;
		class46.field1216 = null;
		class46.field1220 = null;
		class46.field1204 = null;
		class46.field1195 = null;
		class46.field1193 = null;
		class46.field1215 = null;
		class46.field1199 = null;
		class46.field1219 = null;
		class46.field1196 = null;
		class46.field1214 = null;
		class46.field1217 = null;
		class46.field1197 = null;
	}

	@ObfuscatedName("mc.a(Lbd;BILbd;Z)Lt;")
	public static class114 method690(class11 arg0, int arg1, class11 arg2) {
		boolean var3 = true;
		int[] var4 = arg0.method237(arg1);
		for (int var5 = 0; var5 < var4.length; var5++) {
			byte[] var6 = arg0.method227(var4[var5], arg1);
			if (var6 == null) {
				var3 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg2.method227(0, var7);
				if (var8 == null) {
					var3 = false;
				}
			}
		}
		if (!var3) {
			return null;
		}
		try {
			return new class114(arg0, arg2, arg1, false);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("qa.a(Lnb;Z)V")
	public static void method835(class80 arg0) {
		int var1 = arg0.field1999 * 128 + arg0.field1970 * 64;
		int var2 = arg0.field1986 - class82.field2063;
		if (arg0.field1947 == 0) {
			arg0.field1954 = 1024;
		}
		if (arg0.field1947 == 1) {
			arg0.field1954 = 1536;
		}
		if (arg0.field1947 == 2) {
			arg0.field1954 = 0;
		}
		int var3 = arg0.field1970 * 64 + arg0.field1955 * 128;
		arg0.field1972 += (var1 - arg0.field1972) / var2;
		if (arg0.field1947 == 3) {
			arg0.field1954 = 512;
		}
		arg0.field1948 = 0;
		arg0.field1963 += (var3 - arg0.field1963) / var2;
	}

	@ObfuscatedName("rb.a(IILjava/awt/Component;I)Lwc;")
	public static class134 method875(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("qe");
			class134 var4 = (class134) var3.getDeclaredConstructor().newInstance();
			var4.method106(arg1, arg2, arg0);
			return var4;
		} catch (Throwable var6) {
			class4 var5 = new class4();
			var5.method106(arg1, arg2, arg0);
			return var5;
		}
	}

	@ObfuscatedName("rc.a(IILbc;II)V")
	public static void method880(int arg0, class10 arg1, int arg2, int arg3) {
		field3208.method1054();
		field2770.method329(0, 0);
		arg1.method211(class37.field1006, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method211(class130.field3193, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method211(class114.field2817, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method211(class67.field1657, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg1.method211(class97.field2393, 55, 41, 65535, true);
		}
		arg1.method211(class1.field49, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method211(class130.field3193, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method211(class114.field2817, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method211(class67.field1657, 184, 41, 16711680, true);
		}
		arg1.method211(class67.field1676, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method211(class130.field3193, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method211(class114.field2817, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method211(class67.field1657, 324, 41, 16711680, true);
		}
		arg1.method195(class38.field1038, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			Graphics var4 = field3049.getGraphics();
			field3208.method101(0, var4, 453);
		} catch (Exception var5) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("i.a(ZLu;IIBIB)V")
	public static void method495(boolean arg0, class120 arg1, int arg2, int arg3, byte arg4, int arg5) {
		long var6 = (long) ((arg2 << 16) + arg3);
		class104 var8 = (class104) class103.field2596.method499(var6);
		if (var8 != null) {
			return;
		}
		class104 var9 = (class104) class78.field1917.method499(var6);
		if (var9 != null) {
			return;
		}
		class104 var10 = (class104) class49.field1328.method499(var6);
		if (var10 == null) {
			if (!arg0) {
				class104 var11 = (class104) class74.field1831.method499(var6);
				if (var11 != null) {
					return;
				}
			}
			class104 var12 = new class104();
			var12.field2624 = arg5;
			var12.field2619 = arg4;
			var12.field2615 = arg1;
			if (arg0) {
				class103.field2596.method498(var12, var6);
				class134.field3285++;
			} else {
				class37.field996.method598(var12);
				class49.field1328.method498(var12, var6);
				class48.field1260++;
			}
		} else if (arg0) {
			var10.method468();
			class103.field2596.method498(var10, var6);
			class48.field1260--;
			class134.field3285++;
		}
	}

	@ObfuscatedName("na.a(B)V")
	public static void method721() {
		class79.field1930 = null;
		class79.field1943 = null;
		class79.field1938 = null;
		class79.field1929 = null;
		class79.field1933 = null;
		class79.field1932 = null;
		class79.field1937 = null;
		class79.field1944 = null;
		class79.field1931 = null;
		class79.field1942 = null;
		field1935 = null;
		class79.field1934 = null;
		class79.field1936 = null;
	}

	@ObfuscatedName("s.a(II)V")
	public static void method895(int arg0) {
		method985(arg0);
	}

	@ObfuscatedName("sa.a(I)V")
	public static void method904() {
		class109.field2730 = null;
		class109.field2736 = null;
		field2731 = null;
		field2739 = null;
		class109.field2732 = null;
		field2745 = null;
	}

	@ObfuscatedName("td.a(I)Lbc;")
	public static class10 method965() {
		class10 var0 = new class10(field1985, field837, field3194, field292, field2794);
		method449();
		return var0;
	}

	@ObfuscatedName("wc.a(Ljava/awt/Component;ILlc;)V")
	public static void method1050(Component arg0, class69 arg1) {
		try {
			class94 var2 = (class94) Class.forName("ic").getDeclaredConstructor().newInstance();
			var2.method818(arg1, 2048);
			field217 = var2;
		} catch (Throwable var5) {
			try {
				field217 = new class40(arg1, arg0);
			} catch (Throwable var4) {
				if (field1714.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						field217 = new class126();
						return;
					} catch (Throwable var3) {
					}
				}
				field217 = new class14(8000);
			}
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static void method471() {
		class45.field1188 = null;
		class45.field1174 = null;
		class45.field1180 = null;
		field1177 = null;
		class45.field1176 = null;
		class45.field1184 = null;
		class45.field1175 = null;
		class45.field1190 = null;
	}

	@ObfuscatedName("id.a(IILnb;)V")
	public static void method523(int arg0, class80 arg1) {
		method423(arg0, arg1.field1963, arg1.field1972);
	}

	@ObfuscatedName("je.b(Z)V")
	public static void method564() {
		int var0 = class98.field2409 + field2621.field1963;
		int var1 = class8.field296 + field2621.field1972;
		if (field1194 - var1 < -500 || field1194 - var1 > 500 || field1839 - var0 < -500 || field1839 - var0 > 500) {
			field1839 = var0;
			field1194 = var1;
		}
		if (field1194 != var1) {
			field1194 += (var1 - field1194) / 16;
		}
		if (field1839 != var0) {
			field1839 += (var0 - field1839) / 16;
		}
		if (class59.field1488[96]) {
			class17.field544 += (-class17.field544 - 24) / 2;
		} else if (class59.field1488[97]) {
			class17.field544 += (24 - class17.field544) / 2;
		} else {
			class17.field544 /= 2;
		}
		if (class59.field1488[98]) {
			class118.field2947 += (12 - class118.field2947) / 2;
		} else if (class59.field1488[99]) {
			class118.field2947 += (-class118.field2947 - 12) / 2;
		} else {
			class118.field2947 /= 2;
		}
		int var2 = field1839 >> 7;
		class113.field2797 = class17.field544 / 2 + class113.field2797 & 0x7FF;
		int var3 = field1194 >> 7;
		class131.field3204 += class118.field2947 / 2;
		int var4 = 0;
		if (class131.field3204 < 128) {
			class131.field3204 = 128;
		}
		if (class131.field3204 > 383) {
			class131.field3204 = 383;
		}
		int var5 = method712(field75, field1194, field1839);
		if (var3 > 3 && var2 > 3 && var3 < 100 && var2 < 100) {
			for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
				for (int var7 = var2 - 4; var7 <= var2 + 4; var7++) {
					int var8 = field75;
					if (var8 < 3 && (class34.field898[1][var6][var7] & 0x2) == 2) {
						var8++;
					}
					int var9 = var5 - class57.field1451[var8][var6][var7];
					if (var9 > var4) {
						var4 = var9;
					}
				}
			}
		}
		int var10 = var4 * 192;
		if (var10 > 98048) {
			var10 = 98048;
		}
		if (var10 < 32768) {
			var10 = 32768;
		}
		if (class57.field1459 < var10) {
			class57.field1459 += (var10 - class57.field1459) / 24;
		} else if (class57.field1459 > var10) {
			class57.field1459 += (var10 - class57.field1459) / 80;
			return;
		}
	}

	@ObfuscatedName("ke.a(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method629(Applet arg0, String arg1) throws Throwable {
		return null; // JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("m.a(Z)V")
	public static synchronized void method669() {
		if (method521()) {
			method475();
			class53.field1391 = false;
			field1028 = null;
		}
	}

	@ObfuscatedName("ob.a(JI)V")
	public static void method753(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			method427(arg0 - 1L);
			method427(1L);
		} else {
			method427(arg0);
		}
	}

	@ObfuscatedName("oe.a(IILa;La;)V")
	public static void method758(int arg0, class1 arg1, class1 arg2) {
		if (class86.field2166 == -1) {
			class105.field2637 = true;
		}
		if (arg0 == 0 && class98.field2421 != -1) {
			class122.field3050 = 0;
			class64.field1605 = arg1;
		}
		for (int var3 = 99; var3 > 0; var3--) {
			class132.field3236[var3] = class132.field3236[var3 - 1];
			class128.field3130[var3] = class128.field3130[var3 - 1];
			class80.field2034[var3] = class80.field2034[var3 - 1];
		}
		class132.field3236[0] = arg0;
		class128.field3130[0] = arg2;
		class80.field2034[0] = arg1;
	}

	@ObfuscatedName("rd.a(B)V")
	public static void method886() {
		if (class112.field2761 == 49) {
			int var0 = class15.field488.method152();
			int var1 = (var0 & 0x7) + field893;
			int var2 = (var0 >> 4 & 0x7) + field1471;
			int var3 = class15.field488.method152();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = class130.field3186[var4];
			int var7 = class15.field488.method180();
			if (var2 >= 0 && var1 >= 0 && var2 < 103 && var1 < 103) {
				int var8 = class57.field1451[field75][var2][var1];
				int var9 = class57.field1451[field75][var2 + 1][var1];
				int var10 = class57.field1451[field75][var2 + 1][var1 + 1];
				int var11 = class57.field1451[field75][var2][var1 + 1];
				if (var6 == 0) {
					class17 var12 = field3183.method82(field75, var2, var1);
					if (var12 != null) {
						int var13 = var12.field531 >> 14 & 0x7FFF;
						if (var4 == 2) {
							var12.field536 = new class54(var13, 2, var5 + 4, var8, var9, var10, var11, var7, false);
							var12.field535 = new class54(var13, 2, var5 + 1 & 0x3, var8, var9, var10, var11, var7, false);
						} else {
							var12.field536 = new class54(var13, var4, var5, var8, var9, var10, var11, var7, false);
						}
					}
				}
				if (var6 == 1) {
					class106 var14 = field3183.method56(field75, var2, var1);
					if (var14 != null) {
						var14.field2665 = new class54(var14.field2678 >> 14 & 0x7FFF, 4, 0, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 2) {
					class37 var15 = field3183.method63(field75, var2, var1);
					if (var4 == 11) {
						var4 = 10;
					}
					if (var15 != null) {
						var15.field985 = new class54(var15.field980 >> 14 & 0x7FFF, var4, var5, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 3) {
					class52 var16 = field3183.method89(field75, var2, var1);
					if (var16 != null) {
						var16.field1373 = new class54(var16.field1361 >> 14 & 0x7FFF, 22, var5, var8, var9, var10, var11, var7, false);
					}
				}
			}
		} else if (class112.field2761 == 241) {
			int var17 = class15.field488.method147();
			int var18 = var17 & 0x3;
			int var19 = var17 >> 2;
			int var20 = class130.field3186[var19];
			int var21 = class15.field488.method145();
			int var22 = class15.field488.method152();
			int var23 = (var22 & 0x7) + field893;
			int var24 = (var22 >> 4 & 0x7) + field1471;
			if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
				method514(var21, var24, var18, -1, field75, var23, var20, var19, 0);
			}
		} else {
			if (class112.field2761 == 9) {
				int var25 = class15.field488.method144();
				int var26 = (var25 & 0x7) + field893;
				int var27 = (var25 >> 4 & 0x7) + field1471;
				int var28 = class15.field488.method145();
				int var29 = class15.field488.method144();
				int var30 = var29 >> 4 & 0xF;
				int var31 = var29 & 0x7;
				int var32 = class15.field488.method144();
				if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
					int var33 = var30 + 1;
					if (var27 - var33 <= field2621.field1962[0] && var27 + var33 >= field2621.field1962[0] && var26 - var33 <= field2621.field2009[0] && var26 + var33 >= field2621.field2009[0] && class62.field1559 != 0 && var31 > 0 && class36.field965 < 50) {
						class95.field2369[class36.field965] = var28;
						class115.field2845[class36.field965] = var31;
						class22.field684[class36.field965] = var32;
						class36.field955[class36.field965] = null;
						class60.field1521[class36.field965] = (var26 << 8) + (var27 << 16) + var30;
						class36.field965++;
					}
				}
			}
			if (class112.field2761 == 202) {
				int var34 = class15.field488.method144();
				int var35 = (var34 >> 4 & 0x7) + field1471;
				int var36 = field893 + (var34 & 0x7);
				int var37 = class15.field488.method145();
				int var38 = class15.field488.method144();
				int var39 = class15.field488.method145();
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					int var40 = var36 * 128 + 64;
					int var41 = var35 * 128 + 64;
					class116 var42 = new class116(var37, field75, var41, var40, method712(field75, var41, var40) - var38, var39, class82.field2063);
					class112.field2756.method804(var42);
				}
			} else if (class112.field2761 == 99) {
				int var43 = class15.field488.method144();
				int var44 = (var43 >> 4 & 0x7) + field1471;
				int var45 = (var43 & 0x7) + field893;
				int var46 = class15.field488.method145();
				int var47 = class15.field488.method145();
				int var48 = class15.field488.method145();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
					class92 var49 = class17.field552[field75][var44][var45];
					if (var49 != null) {
						for (class59 var50 = (class59) var49.method802(); var50 != null; var50 = (class59) var49.method809()) {
							if ((var46 & 0x7FFF) == var50.field1499 && var50.field1490 == var47) {
								var50.field1490 = var48;
								break;
							}
						}
						method1011(var45, var44);
					}
				}
			} else if (class112.field2761 == 143) {
				int var51 = class15.field488.method152();
				int var52 = field893 + (var51 & 0x7);
				int var53 = field1471 + (var51 >> 4 & 0x7);
				int var54 = class15.field488.method147();
				int var55 = var54 & 0x3;
				int var56 = var54 >> 2;
				int var57 = class130.field3186[var56];
				if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
					method514(-1, var53, var55, -1, field75, var52, var57, var56, 0);
				}
			} else {
				if (class112.field2761 == 229) {
					byte var58 = class15.field488.method171();
					int var59 = class15.field488.method137();
					byte var60 = class15.field488.method184();
					byte var61 = class15.field488.method184();
					int var62 = class15.field488.method152();
					int var63 = var62 & 0x3;
					int var64 = var62 >> 2;
					int var65 = class130.field3186[var64];
					int var66 = class15.field488.method156();
					int var67 = (var66 & 0x7) + field893;
					int var68 = field1471 + (var66 >> 4 & 0x7);
					int var69 = class15.field488.method145();
					byte var70 = class15.field488.method143();
					int var71 = class15.field488.method166();
					int var72 = class15.field488.method180();
					class2 var73;
					if (class67.field1683 == var59) {
						var73 = field2621;
					} else {
						var73 = class80.field2030[var59];
					}
					if (var73 != null) {
						class49 var74 = method389(var71);
						int var75 = class57.field1451[field75][var68][var67];
						int var76 = class57.field1451[field75][var68][var67 + 1];
						int var77 = class57.field1451[field75][var68 + 1][var67 + 1];
						int var78 = class57.field1451[field75][var68 + 1][var67];
						class91 var79 = var74.method505(var77, var76, var63, var75, var64, var78);
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
							method514(-1, var68, 0, var72 + 1, field75, var67, var65, 0, var69 + 1);
							var73.field82 = class82.field2063 + var72;
							int var82 = var74.field1286;
							var73.field73 = var79;
							var73.field91 = class82.field2063 + var69;
							int var83 = var74.field1298;
							if (var63 == 1 || var63 == 3) {
								var83 = var74.field1286;
								var82 = var74.field1298;
							}
							var73.field79 = var68 * 128 + var82 * 64;
							var73.field99 = var67 * 128 + var83 * 64;
							var73.field80 = method712(field75, var73.field79, var73.field99);
							var73.field89 = var61 + var67;
							var73.field66 = var68 + var70;
							var73.field70 = var68 + var58;
							var73.field97 = var60 + var67;
						}
					}
				}
				if (class112.field2761 == 74) {
					int var84 = class15.field488.method144();
					int var85 = (var84 >> 4 & 0x7) + field1471;
					int var86 = (var84 & 0x7) + field893;
					int var87 = class15.field488.method137();
					if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
						class92 var88 = class17.field552[field75][var85][var86];
						if (var88 != null) {
							for (class59 var89 = (class59) var88.method802(); var89 != null; var89 = (class59) var88.method809()) {
								if ((var87 & 0x7FFF) == var89.field1499) {
									var89.method739();
									break;
								}
							}
							if (var88.method802() == null) {
								class17.field552[field75][var85][var86] = null;
							}
							method1011(var86, var85);
						}
					}
				} else if (class112.field2761 == 1) {
					int var90 = class15.field488.method144();
					int var91 = (var90 & 0x7) + field893;
					int var92 = field1471 + (var90 >> 4 & 0x7);
					int var93 = var92 + class15.field488.method184();
					int var94 = var91 + class15.field488.method184();
					int var95 = class15.field488.method139();
					int var96 = class15.field488.method145();
					int var97 = class15.field488.method144() * 4;
					int var98 = class15.field488.method144() * 4;
					int var99 = class15.field488.method145();
					int var100 = class15.field488.method145();
					int var101 = class15.field488.method144();
					int var102 = class15.field488.method144();
					if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104 && var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var96 != 65535) {
						int var103 = var93 * 128 + 64;
						int var104 = var92 * 128 + 64;
						int var105 = var91 * 128 + 64;
						class19 var106 = new class19(var96, field75, var104, var105, method712(field75, var104, var105) - var97, var99 - -class82.field2063, var100 + class82.field2063, var101, var102, var95, var98);
						int var107 = var94 * 128 + 64;
						var106.method300(class82.field2063 + var99, var107, method712(field75, var103, var107) - var98, var103);
						class86.field2160.method804(var106);
					}
				} else if (class112.field2761 == 19) {
					int var108 = class15.field488.method180();
					int var109 = class15.field488.method180();
					int var110 = class15.field488.method145();
					int var111 = class15.field488.method152();
					int var112 = (var111 >> 4 & 0x7) + field1471;
					int var113 = (var111 & 0x7) + field893;
					if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && class67.field1683 != var109) {
						class59 var114 = new class59();
						var114.field1499 = var110;
						var114.field1490 = var108;
						if (class17.field552[field75][var112][var113] == null) {
							class17.field552[field75][var112][var113] = new class92();
						}
						class17.field552[field75][var112][var113].method804(var114);
						method1011(var113, var112);
					}
				} else if (class112.field2761 == 175) {
					int var115 = class15.field488.method166();
					int var116 = class15.field488.method145();
					int var117 = class15.field488.method144();
					int var118 = (var117 & 0x7) + field893;
					int var119 = (var117 >> 4 & 0x7) + field1471;
					if (var119 >= 0 && var118 >= 0 && var119 < 104 && var118 < 104) {
						class59 var120 = new class59();
						var120.field1490 = var116;
						var120.field1499 = var115;
						if (class17.field552[field75][var119][var118] == null) {
							class17.field552[field75][var119][var118] = new class92();
						}
						class17.field552[field75][var119][var118].method804(var120);
						method1011(var118, var119);
					}
				}
			}
		}
	}

	@ObfuscatedName("ca.a(I)V")
	public static void method252() {
		for (int var0 = 0; var0 < class49.field1341; var0++) {
			int var1 = class22.field677[var0];
			class130 var2 = class120.field2992[var1];
			if (var2 != null) {
				method319(var2, var2.field3182.field1084);
			}
		}
	}

	@ObfuscatedName("nc.a(Ldc;I)V")
	public static void method733(class22 arg0) {
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

	@ObfuscatedName("uc.d(I)[Le;")
	public static class25[] method994() {
		class25[] var0 = new class25[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			class25 var2 = var0[var1] = new class25();
			var2.field746 = field2877;
			var2.field747 = field1628;
			var2.field751 = field2771[var1];
			var2.field750 = field1985[var1];
			var2.field744 = field837[var1];
			var2.field749 = field3194[var1];
			var2.field745 = field292;
			var2.field748 = field2794[var1];
		}
		method449();
		return var0;
	}

	@ObfuscatedName("h.f(I)V")
	public static void method447() {
		if (field2769 != null) {
			field2769.method1015();
		}
	}

	@ObfuscatedName("he.f(I)V")
	public static void method484() {
		class47.field1245 = null;
		field1241 = null;
		class47.field1232 = null;
		field1239 = null;
		class47.field1229 = null;
		field1231 = null;
		class47.field1238 = null;
		class47.field1244 = null;
		field1247 = null;
	}

	@ObfuscatedName("r.a([BI)[B")
	public static byte[] method863(byte[] arg0) {
		class8 var1 = new class8(arg0);
		int var2 = var1.method144();
		int var3 = var1.method167();
		if (var3 < 0 || class103.field2597 != 0 && class103.field2597 < var3) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var7 = new byte[var3];
			var1.method173(var7, var3);
			return var7;
		} else {
			int var4 = var1.method167();
			if (var4 < 0 || class103.field2597 != 0 && var4 > class103.field2597) {
				throw new RuntimeException();
			}
			byte[] var5 = new byte[var4];
			if (var2 == 1) {
				class41.method446(var5, var4, arg0, var3);
			} else {
				try {
					DataInputStream var6 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var3)));
					var6.readFully(var5);
					var6.close();
				} catch (IOException var8) {
				}
			}
			return var5;
		}
	}

	@ObfuscatedName("bb.a(IIIIIIII[B[Lad;)V")
	public static void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class5[] arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (arg4 + var9 > 0 && arg4 + var9 < 103 && arg0 + var10 > 0 && arg0 + var10 < 103) {
					arg8[arg3].field201[arg4 + var9][arg0 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		class8 var11 = new class8(arg7);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (arg2 == var12 && var13 >= arg1 && arg1 + 8 > var13 && var14 >= arg5 && arg5 + 8 > var14) {
						method841(arg4 + method519(arg6, var13 & 0x7, var14 & 0x7), arg6, var11, arg0 + method677(var13 & 0x7, var14 & 0x7, arg6), 0, 0, arg3);
					} else {
						method841(-1, 0, var11, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("hb.b(I)Le;")
	public static class25 method467() {
		class25 var0 = new class25();
		var0.field746 = field2877;
		var0.field747 = field1628;
		var0.field751 = field2771[0];
		var0.field750 = field1985[0];
		var0.field744 = field837[0];
		var0.field749 = field3194[0];
		var0.field745 = field292;
		var0.field748 = field2794[0];
		method449();
		return var0;
	}

	@ObfuscatedName("pc.a(I)V")
	public static void method814() {
		class93.field2335 = null;
		class93.field2334 = null;
		class93.field2329 = null;
		class93.field2337 = null;
		class93.field2310 = null;
		class93.field2313 = null;
		class93.field2336 = null;
		class93.field2308 = null;
		class93.field2318 = null;
		class93.field2319 = null;
		class93.field2320 = null;
		class93.field2325 = null;
		class93.field2322 = null;
		class93.field2315 = null;
		class93.field2333 = null;
		class93.field2317 = null;
		class93.field2309 = null;
		field2324 = null;
		class93.field2331 = null;
	}

	@ObfuscatedName("bd.a(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method214(String arg0, Throwable arg1) {
		try {
			String var2 = "";
			if (arg1 != null) {
				var2 = method896(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					var2 = var2 + " | ";
				}
				var2 = var2 + arg0;
			}
			System.out.println("Error: " + var2);
			String var3 = var2.replace(':', '.');
			String var4 = var3.replace('@', '_');
			String var5 = var4.replace('&', '_');
			String var6 = var5.replace('#', '_');
			class29 var7 = field2026.method650(new URL(field2026.field1719.getCodeBase(), "clienterror.ws?c=" + field2038 + "&u=" + field1843 + "&v1=" + field1714 + "&v2=" + field1718 + "&e=" + var6));
			while (var7.field815 == 0) {
				method753(1L);
			}
			if (var7.field815 == 1) {
				DataInputStream var8 = (DataInputStream) var7.field818;
				var8.read();
				var8.close();
			}
		} catch (Exception var9) {
		}
	}

	@ObfuscatedName("dc.b(I)V")
	public static void method315() {
		class22.field684 = null;
		field698 = null;
		class22.field677 = null;
		class22.field676 = null;
		field680 = null;
	}

	@ObfuscatedName("qc.a(IIIIIII)V")
	public static void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 0;
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 0;
		int var9 = 2048 - arg0 & 0x7FF;
		int var10 = arg5;
		if (var9 != 0) {
			int var11 = class91.field2258[var9];
			int var12 = class91.field2256[var9];
			int var13 = var11 * 0 - arg5 * var12 >> 16;
			var10 = arg5 * var11 + var12 * 0 >> 16;
			var8 = var13;
		}
		if (var7 != 0) {
			int var14 = class91.field2258[var7];
			int var15 = class91.field2256[var7];
			int var16 = var10 * var15 + var14 * 0 >> 16;
			var10 = var10 * var14 - var15 * 0 >> 16;
			var6 = var16;
		}
		field184 = arg3;
		field1748 = arg2 - var8;
		field709 = arg1 - var6;
		field1400 = arg0;
		field1200 = arg4 - var10;
	}

	@ObfuscatedName("tc.a(I)V")
	public static void method960() {
		if (class70.field1750 > 0) {
			method847();
		} else {
			method399(40);
			field1692 = field1450;
			field1450 = null;
		}
	}

	@ObfuscatedName("d.a(Lbd;Lbd;Lbd;B)V")
	public static void method292(class11 arg0, class11 arg1, class11 arg2) {
		field503 = arg2;
		field924 = arg0;
		field2810 = arg1;
		field2922 = new class100[field924.method220()][];
		field3296 = new boolean[field924.method220()];
	}

	@ObfuscatedName("dd.a(B)V")
	public static void method318() {
		class23.field712 = null;
		class23.field707 = null;
		field715 = null;
		field704 = null;
		class23.field703 = null;
		class23.field719 = null;
		class23.field706 = null;
		class23.field717 = null;
		class23.field702 = null;
		class23.field716 = null;
		class23.field705 = null;
		class23.field720 = null;
		field708 = null;
		class23.field714 = null;
		class23.field713 = null;
		class23.field718 = null;
	}

	@ObfuscatedName("ua.a(BI)V")
	public static void method985(int arg0) {
		if (arg0 == -1 || !field3296[arg0]) {
			return;
		}
		field924.method216(arg0);
		if (field2922[arg0] == null) {
			return;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < field2922[arg0].length; var2++) {
			if (field2922[arg0][var2] != null) {
				if (field2922[arg0][var2].field2489 == 2) {
					var1 = false;
				} else {
					field2922[arg0][var2] = null;
				}
			}
		}
		if (var1) {
			field2922[arg0] = null;
		}
		field3296[arg0] = false;
	}

	@ObfuscatedName("de.a(Lnb;IB)V")
	public static void method319(class80 arg0, int arg1) {
		if (arg0.field1972 < 128 || arg0.field1963 < 128 || arg0.field1972 >= 13184 || arg0.field1963 >= 13184) {
			arg0.field2015 = -1;
			arg0.field1986 = 0;
			arg0.field1981 = 0;
			arg0.field1965 = -1;
			arg0.field1972 = arg0.field1962[0] * 128 + arg0.field1970 * 64;
			arg0.field1963 = arg0.field2009[0] * 128 + arg0.field1970 * 64;
			arg0.method732();
		}
		if (field2621 == arg0 && (arg0.field1972 < 1536 || arg0.field1963 < 1536 || arg0.field1972 >= 11776 || arg0.field1963 >= 11776)) {
			arg0.field1965 = -1;
			arg0.field1981 = 0;
			arg0.field1986 = 0;
			arg0.field2015 = -1;
			arg0.field1972 = arg0.field1962[0] * 128 + arg0.field1970 * 64;
			arg0.field1963 = arg0.field2009[0] * 128 + arg0.field1970 * 64;
			arg0.method732();
		}
		if (class82.field2063 < arg0.field1986) {
			method835(arg0);
		} else if (arg0.field1981 < class82.field2063) {
			method761(arg0);
		} else {
			method641(arg0);
		}
		method296(arg0);
		method937(arg0);
	}

	@ObfuscatedName("g.a([BZII)La;")
	public static class1 method419(byte[] arg0, int arg1, int arg2) {
		class1 var3 = new class1();
		var3.field26 = 0;
		var3.field38 = new byte[arg2];
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			if (arg0[var4] != 0) {
				var3.field38[var3.field26++] = arg0[var4];
			}
		}
		return var3;
	}

	@ObfuscatedName("jc.b(I)V")
	public static void method542() {
		for (int var0 = 10; var0 < 117; var0++) {
			int var1 = (int) (Math.random() * 100.0D);
			if (var1 < 50) {
				field229[var0 + 32512] = 255;
			}
		}
		for (int var2 = 0; var2 < 100; var2++) {
			int var3 = (int) (Math.random() * 124.0D) + 2;
			int var4 = (int) (Math.random() * 128.0D) + 128;
			int var5 = (var4 << 7) + var3;
			field229[var5] = 192;
		}
		for (int var6 = 1; var6 < 255; var6++) {
			for (int var7 = 1; var7 < 127; var7++) {
				int var8 = var7 + (var6 << 7);
				field2911[var8] = (field229[var8 - 1] + field229[var8 + 1] + field229[var8 + -128] + field229[var8 + 128]) / 4;
			}
		}
		class43.field1144 += 128;
		if (class43.field1144 > field2570.length) {
			class43.field1144 -= field2570.length;
			int var9 = (int) (Math.random() * 12.0D);
			method1010(field1177[var9]);
		}
		for (int var10 = 1; var10 < 255; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = (var10 << 7) + var11;
				int var13 = field2911[var12 + 128] - field2570[var12 + class43.field1144 & field2570.length + -1] / 5;
				if (var13 < 0) {
					var13 = 0;
				}
				field229[var12] = var13;
			}
		}
		for (int var14 = 0; var14 < 255; var14++) {
			class31.field847[var14] = class31.field847[var14 + 1];
		}
		class31.field847[255] = (int) (Math.sin((double) class82.field2063 / 14.0D) * 16.0D + Math.sin((double) class82.field2063 / 15.0D) * 14.0D + Math.sin((double) class82.field2063 / 16.0D) * 12.0D);
		if (class46.field1209 > 0) {
			class46.field1209 -= 4;
		}
		if (class95.field2380 > 0) {
			class95.field2380 -= 4;
		}
		if (class46.field1209 != 0 || class95.field2380 != 0) {
			return;
		}
		int var15 = (int) (Math.random() * 2000.0D);
		if (var15 == 0) {
			class46.field1209 = 1024;
		}
		if (var15 == 1) {
			class95.field2380 = 1024;
			return;
		}
	}

	@ObfuscatedName("n.a(BIII)I")
	public static int method712(int arg0, int arg1, int arg2) {
		int var3 = arg2 >> 7;
		int var4 = arg1 >> 7;
		if (var4 < 0 || var3 < 0 || var4 > 103 || var3 > 103) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg0;
		if (arg0 < 3 && (class34.field898[1][var4][var3] & 0x2) == 2) {
			var6 = arg0 + 1;
		}
		int var7 = (128 - var5) * class57.field1451[var6][var4][var3] + class57.field1451[var6][var4 + 1][var3] * var5 >> 7;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var5) * class57.field1451[var6][var4][var3 + 1] + class57.field1451[var6][var4 + 1][var3 + 1] * var5 >> 7;
		return (128 - var8) * var7 + var8 * var9 >> 7;
	}

	@ObfuscatedName("be.b(IIB)V")
	public static void method241(int arg0, int arg1) {
		class35 var2 = method686(arg1);
		int var3 = var2.field943;
		int var4 = var2.field933;
		int var5 = var2.field945;
		int var6 = class4.field173[var5 - var3];
		if (arg0 < 0 || var6 < arg0) {
			arg0 = 0;
		}
		int var7 = var6 << var3;
		class113.field2803[var4] = class113.field2803[var4] & ~var7 | var7 & arg0 << var3;
	}

	@ObfuscatedName("ra.a(I)J")
	public static synchronized long method869() {
		long var0 = System.currentTimeMillis();
		if (field3036 > var0) {
			field3047 += field3036 - var0;
		}
		field3036 = var0;
		return field3047 + var0;
	}

	@ObfuscatedName("mb.a(BII)I")
	public static int method684(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		return field967 != null && field967.field2073 == var2 ? field2613.field267 * 99 / (field2613.field284.length - field967.field2619) + 1 : 0;
	}

	@ObfuscatedName("vd.a(BI)Lqa;")
	public static class97 method1023(int arg0) {
		class97 var1 = (class97) class24.field727.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3167.method217(arg0, 16);
		class97 var3 = new class97();
		if (var2 != null) {
			var3.method838(new class8(var2));
		}
		class24.field727.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("j.g(I)V")
	public static void method532() {
		class31.field841 = 0;
		class80.field2027 = 0;
		method293();
		method752();
		method323();
		for (int var0 = 0; var0 < class31.field841; var0++) {
			int var1 = class11.field375[var0];
			if (class82.field2063 != class120.field2992[var1].field2008) {
				class120.field2992[var1].field3182 = null;
				class120.field2992[var1] = null;
			}
		}
		if (class100.field2547 != class15.field488.field267) {
			throw new RuntimeException("gnp1 pos:" + class15.field488.field267 + " psize:" + class100.field2547);
		}
		for (int var2 = 0; var2 < class49.field1341; var2++) {
			if (class120.field2992[class22.field677[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class49.field1341);
			}
		}
	}

	@ObfuscatedName("ld.a(I)V")
	public static void method660() {
		class1 var0 = null;
		for (int var1 = 0; var1 < class42.field1104; var1++) {
			if (class102.field2586[var1].method11(class93.field2334) != -1) {
				var0 = class102.field2586[var1].method1(class102.field2586[var1].method11(class93.field2334));
				break;
			}
		}
		if (var0 == null) {
			method483();
			return;
		}
		int var2 = field2306;
		int var3 = field986;
		if (var2 > 190) {
			var2 = 190;
		}
		int var4 = field219;
		int var5 = field579;
		if (var3 < 0) {
			var3 = 0;
		}
		class111.method913(var3, var5, var2, var4, 6116423);
		class111.method913(var3 + 1, var5 - -1, var2 - 2, 16, 0);
		class111.method922(var3 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
		field2902.method206(var0, var3 + 3, var5 + 14, 6116423, false);
		int var6 = class24.field741;
		int var7 = class102.field2568;
		if (field640 == 0) {
			var6 -= 4;
			var7 -= 4;
		}
		if (field640 == 1) {
			var6 -= 553;
			var7 -= 205;
		}
		if (field640 == 2) {
			var7 -= 357;
			var6 -= 17;
		}
		for (int var8 = 0; var8 < class42.field1104; var8++) {
			int var9 = (class42.field1104 - var8 - 1) * 15 + var5 + 31;
			class1 var10 = class102.field2586[var8];
			int var11 = 16777215;
			if (var10.method38(var0)) {
				var10 = var10.method19(0, var10.method10() - var0.method10());
				if (var10.method38(class93.field2337)) {
					var10 = var10.method19(0, var10.method10() - class93.field2337.method10());
				}
			}
			if (var3 < var6 && var6 < var2 + var3 && var9 - 13 < var7 && var9 + 3 > var7) {
				var11 = 16776960;
			}
			field2902.method206(var10, var3 + 3, var9, var11, true);
		}
	}

	@ObfuscatedName("sd.a(I)V")
	public static void method927() {
		class112.field2756 = null;
		class112.field2772 = null;
		field2770 = null;
		class112.field2759 = null;
		class112.field2755 = null;
		class112.field2760 = null;
		class112.field2768 = null;
		field2769 = null;
		class112.field2763 = null;
		class112.field2764 = null;
		class112.field2767 = null;
		field2771 = null;
		class112.field2758 = null;
		class112.field2765 = null;
		class112.field2757 = null;
	}

	@ObfuscatedName("ae.a(B)V")
	public static void method123() {
		class6.field228 = null;
		class6.field231 = null;
		class6.field234 = null;
		field229 = null;
		class6.field227 = null;
		class6.field232 = null;
	}

	@ObfuscatedName("va.b(IIII)Ljd;")
	public static class58 method1007(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			class58 var3 = (class58) class8.field253.method263((long) arg1);
			if (var3 != null && var3.field1477 != arg0 && var3.field1477 != -1) {
				var3.method739();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		class115 var4 = method760(arg1);
		if (var4.field2862 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field2865[var6] && var4.field2865[var6] != 0) {
					var5 = var4.field2862[var6];
				}
			}
			if (var5 != -1) {
				var4 = method760(var5);
			}
		}
		class91 var7 = var4.method954(true, 1);
		if (var7 == null) {
			return null;
		}
		class58 var8 = null;
		if (var4.field2838 != -1) {
			var8 = method1007(10, var4.field2843, -1);
			if (var8 == null) {
				return null;
			}
		}
		int[] var9 = field2747;
		int var10 = field2750;
		int var11 = field2749;
		int var12 = class111.field2752;
		int var13 = class111.field2753;
		int var14 = class111.field2748;
		int var15 = class111.field2751;
		int[] var16 = class27.method367();
		int var17 = field762;
		int var18 = field777;
		class58 var19 = new class58(32, 32);
		class111.method926(var19.field1480, 32, 32);
		field2909 = class27.method362(field2909);
		class111.method913(0, 0, 32, 32, 0);
		int var20 = var4.field2848;
		if (arg2 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg2 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		class27.field776 = false;
		int var21 = class27.field775[var4.field2875] * var20 >> 16;
		int var22 = class27.field778[var4.field2875] * var20 >> 16;
		var7.method766();
		var7.method780(var4.field2861, var4.field2858, var4.field2875, var4.field2837, var7.field3135 / 2 + var4.field2841 + var21, var4.field2841 + var22);
		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var19.field1480[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var19.field1480[var24 * 32 + var23 - 1] > 1) {
						var19.field1480[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var19.field1480[var23 + (var24 - 1) * 32] > 1) {
						var19.field1480[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var19.field1480[var24 * 32 + var23 + 1] > 1) {
						var19.field1480[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var19.field1480[(var24 + 1) * 32 + var23] > 1) {
						var19.field1480[var24 * 32 + var23] = 1;
					}
				}
			}
		}
		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var19.field1480[var25 + var26 * 32] == 0) {
						if (var25 > 0 && var19.field1480[var26 * 32 + var25 - 1] == 1) {
							var19.field1480[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var19.field1480[var25 + (var26 - 1) * 32] == 1) {
							var19.field1480[var25 + var26 * 32] = arg2;
						} else if (var25 < 31 && var19.field1480[var25 + var26 * 32 + 1] == 1) {
							var19.field1480[var25 + var26 * 32] = arg2;
						} else if (var26 < 31 && var19.field1480[var26 * 32 + var25 + 32] == 1) {
							var19.field1480[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var19.field1480[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var19.field1480[var27 + (var28 - 1) * 32 - 1] > 0) {
						var19.field1480[var28 * 32 + var27] = 3153952;
					}
				}
			}
		}
		if (var4.field2838 != -1) {
			int var29 = var8.field1477;
			int var30 = var8.field1479;
			var8.field1477 = 32;
			var8.field1479 = 32;
			var8.method551(0, 0);
			var8.field1479 = var30;
			var8.field1477 = var29;
		}
		if (arg2 == 0) {
			class8.field253.method262((long) arg1, var19);
		}
		class111.method926(var9, var11, var10);
		class111.method912(var12, var14, var13, var15);
		class27.method362(var16);
		field762 = var17;
		field777 = var18;
		class27.method356();
		class27.field776 = true;
		if (var4.field2826 == 1) {
			var19.field1479 = 33;
		} else {
			var19.field1479 = 32;
		}
		var19.field1477 = arg0;
		return var19;
	}

	@ObfuscatedName("w.a(B)V")
	public static void method1027() {
		field3200 = null;
		class131.field3198 = null;
		class131.field3197 = null;
		class131.field3205 = null;
		class131.field3203 = null;
		class131.field3202 = null;
	}

	@ObfuscatedName("ac.b(I)V")
	public static void method99() {
		field187 = null;
		field178 = null;
		class4.field183 = null;
		class4.field172 = null;
		class4.field186 = null;
		class4.field173 = null;
		class4.field181 = null;
	}

	@ObfuscatedName("id.a(ZI)V")
	public static void method524(boolean arg0) {
		class113.field2773 = arg0;
		if (!class113.field2773) {
			int var24 = class15.field488.method145();
			int var25 = class15.field488.method166();
			int var26 = class15.field488.method137();
			int var27 = class15.field488.method180();
			int var28 = class15.field488.method147();
			int var29 = (class100.field2547 - class15.field488.field267) / 16;
			field2170 = new int[var29][4];
			for (int var30 = 0; var30 < var29; var30++) {
				for (int var31 = 0; var31 < 4; var31++) {
					field2170[var30][var31] = class15.field488.method146();
				}
			}
			field1078 = new int[var29];
			field61 = new byte[var29][];
			boolean var32 = false;
			field2633 = new byte[var29][];
			if ((var25 / 8 == 48 || var25 / 8 == 49) && var27 / 8 == 48) {
				var32 = true;
			}
			field2291 = new int[var29];
			if (var25 / 8 == 48 && var27 / 8 == 148) {
				var32 = true;
			}
			field742 = new int[var29];
			int var33 = 0;
			for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
				for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
					int var36 = (var34 << 8) + var35;
					if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
						field1078[var33] = var36;
						field2291[var33] = field3131.method228(method956(new class1[] { class92.field2305, method502(var34), class14.field477, method502(var35) }));
						field742[var33] = field3131.method228(method956(new class1[] { class48.field1259, method502(var34), class14.field477, method502(var35) }));
						var33++;
					}
				}
			}
			method731(var26, var27, var25, var24, var28);
			return;
		}
		int var1 = class15.field488.method145();
		int var2 = class15.field488.method180();
		int var3 = class15.field488.method145();
		int var4 = class15.field488.method156();
		int var5 = class15.field488.method145();
		class15.field488.method417();
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 13; var7++) {
				for (int var8 = 0; var8 < 13; var8++) {
					int var9 = class15.field488.method412(1);
					if (var9 == 1) {
						class34.field908[var6][var7][var8] = class15.field488.method412(26);
					} else {
						class34.field908[var6][var7][var8] = -1;
					}
				}
			}
		}
		class15.field488.method408();
		int var10 = (class100.field2547 - class15.field488.field267) / 16;
		field2170 = new int[var10][4];
		for (int var11 = 0; var11 < var10; var11++) {
			for (int var12 = 0; var12 < 4; var12++) {
				field2170[var11][var12] = class15.field488.method183();
			}
		}
		field2291 = new int[var10];
		field61 = new byte[var10][];
		field742 = new int[var10];
		field2633 = new byte[var10][];
		field1078 = new int[var10];
		int var13 = 0;
		for (int var14 = 0; var14 < 4; var14++) {
			for (int var15 = 0; var15 < 13; var15++) {
				for (int var16 = 0; var16 < 13; var16++) {
					int var17 = class34.field908[var14][var15][var16];
					if (var17 != -1) {
						int var18 = var17 >> 14 & 0x3FF;
						int var19 = var17 >> 3 & 0x7FF;
						int var20 = (var18 / 8 << 8) + var19 / 8;
						for (int var21 = 0; var21 < var13; var21++) {
							if (field1078[var21] == var20) {
								var20 = -1;
								break;
							}
						}
						if (var20 != -1) {
							field1078[var13] = var20;
							int var22 = var20 & 0xFF;
							int var23 = var20 >> 8 & 0xFF;
							field2291[var13] = field3131.method228(method956(new class1[] { class92.field2305, method502(var23), class14.field477, method502(var22) }));
							field742[var13] = field3131.method228(method956(new class1[] { class48.field1259, method502(var23), class14.field477, method502(var22) }));
							var13++;
						}
					}
				}
			}
		}
		method731(var2, var5, var3, var1, var4);
	}

	@ObfuscatedName("l.a(I)V")
	public static void method630() {
		class66.field1649 = null;
		class66.field1645 = null;
		class66.field1646 = null;
		field1651 = null;
	}

	@ObfuscatedName("ha.a(I)V")
	public static void method462() {
		class43.field1151 = null;
		class43.field1147 = null;
		class43.field1150 = null;
		class43.field1152 = null;
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
			class49 var13 = method389(var11);
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
				class25 var14 = field800[var13.field1320];
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
			class49 var21 = method389(var19);
			int var22 = var18 & 0x1F;
			if (var21.field1320 != -1) {
				class25 var23 = field800[var21.field1320];
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
		class49 var31 = method389(var30);
		if (var31.field1320 == -1) {
			return;
		}
		class25 var32 = field800[var31.field1320];
		if (var32 != null) {
			int var33 = (var31.field1286 * 4 - var32.field744) / 2;
			int var34 = (var31.field1298 * 4 - var32.field749) / 2;
			var32.method329(arg1 * 4 + var33 + 48, (104 - (arg4 - -var31.field1298)) * 4 + var34 + 48);
			return;
		}
	}

	@ObfuscatedName("se.a(BLqd;)V")
	public static void method929(class100 arg0) {
		int var1 = arg0.field2445;
		if (var1 >= 1 && var1 <= 100 || var1 >= 701 && var1 <= 800) {
			if (var1 == 1 && class23.field701 == 0) {
				arg0.field2474 = class24.field726;
				arg0.field2520 = 0;
			} else if (var1 == 1 && class23.field701 == 1) {
				arg0.field2474 = class132.field3219;
				arg0.field2520 = 0;
			} else if (var1 == 2 && class23.field701 != 2) {
				arg0.field2520 = 0;
				arg0.field2474 = class36.field957;
			} else {
				int var2 = class59.field1492;
				if (var1 > 700) {
					var1 -= 601;
				} else {
					var1--;
				}
				if (class23.field701 != 2) {
					var2 = 0;
				}
				if (var2 <= var1) {
					arg0.field2474 = class132.field3234;
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
			int var3 = class59.field1492;
			if (class23.field701 != 2) {
				var3 = 0;
			}
			if (var1 >= var3) {
				arg0.field2474 = class132.field3234;
				arg0.field2520 = 0;
			} else {
				if (class73.field1788[var1] == 0) {
					arg0.field2474 = method956(new class1[] { class52.field1383, class63.field1593 });
				} else if (class73.field1788[var1] < 5000) {
					if (class73.field1788[var1] == class24.field723) {
						arg0.field2474 = method956(new class1[] { class102.field2564, class53.field1407, method502(class73.field1788[var1]) });
					} else {
						arg0.field2474 = method956(new class1[] { class107.field2699, class53.field1407, method502(class73.field1788[var1]) });
					}
				} else if (class73.field1788[var1] == class24.field723) {
					arg0.field2474 = method956(new class1[] { class102.field2564, class15.field507, method502(class73.field1788[var1] - 5000) });
				} else {
					arg0.field2474 = method956(new class1[] { class107.field2699, class15.field507, method502(class73.field1788[var1] - 5000) });
				}
				arg0.field2520 = 1;
			}
		} else if (var1 == 203) {
			int var4 = class59.field1492;
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
				arg0.field2474 = class99.field2431;
				arg0.field2520 = 0;
			} else if (var1 == 1 && class23.field701 == 0) {
				arg0.field2474 = class36.field957;
				arg0.field2520 = 0;
			} else {
				int var5 = class85.field2146;
				if (class23.field701 == 0) {
					var5 = 0;
				}
				if (var5 <= var1) {
					arg0.field2520 = 0;
					arg0.field2474 = class132.field3234;
				} else {
					arg0.field2474 = method969(class106.field2683[var1]).method36();
					arg0.field2520 = 1;
				}
			}
		} else if (var1 == 503) {
			arg0.field2526 = class85.field2146 * 15 + 20;
			if (arg0.field2449 >= arg0.field2526) {
				arg0.field2526 = arg0.field2449 + 1;
			}
		} else if (var1 == 324) {
			if (class129.field3157 == -1) {
				class129.field3157 = arg0.field2550;
				client.field590 = arg0.field2476;
			}
			if (class92.field2302.field1658) {
				arg0.field2550 = class129.field3157;
			} else {
				arg0.field2550 = client.field590;
			}
		} else if (var1 == 325) {
			if (class129.field3157 == -1) {
				client.field590 = arg0.field2476;
				class129.field3157 = arg0.field2550;
			}
			if (class92.field2302.field1658) {
				arg0.field2550 = client.field590;
			} else {
				arg0.field2550 = class129.field3157;
			}
		} else if (var1 == 327) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) class82.field2063 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 0;
			arg0.field2493 = 5;
		} else if (var1 == 328) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) class82.field2063 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 1;
			arg0.field2493 = 5;
		} else if (var1 == 600) {
			arg0.field2474 = method956(new class1[] { class132.field3217, class123.field3059 });
		} else if (var1 == 620) {
			if (class37.field1004 < 1) {
				arg0.field2474 = class132.field3234;
			} else if (class133.field3268) {
				arg0.field2453 = 16711680;
				arg0.field2474 = class42.field1094;
			} else {
				arg0.field2453 = 16777215;
				arg0.field2474 = class93.field2308;
			}
		}
	}

	@ObfuscatedName("vb.a(II)Z")
	public static boolean method1012(int arg0) {
		if (!method1052(arg0)) {
			return false;
		}
		class100[] var1 = field2922[arg0];
		boolean var2 = false;
		for (int var3 = 0; var3 < var1.length; var3++) {
			class100 var4 = var1[var3];
			if (var4 != null && var4.field2489 == 6) {
				if (var4.field2465 != -1 || var4.field2459 != -1) {
					boolean var5 = method947(var4);
					int var6;
					if (var5) {
						var6 = var4.field2459;
					} else {
						var6 = var4.field2465;
					}
					if (var6 != -1) {
						class47 var7 = method103(var6);
						var4.field2466 += class9.field321;
						label50: while (true) {
							do {
								do {
									if (var7.field1223[var4.field2460] >= var4.field2466) {
										break label50;
									}
									var2 = true;
									var4.field2466 -= var7.field1223[var4.field2460];
									var4.field2460++;
								} while (var4.field2460 < var7.field1242.length);
								var4.field2460 -= var7.field1254;
							} while (var4.field2460 >= 0 && var4.field2460 < var7.field1242.length);
							var4.field2460 = 0;
						}
					}
				}
				if (var4.field2528 != 0) {
					var2 = true;
					int var8 = var4.field2528 >> 16;
					int var9 = var4.field2528 << 16 >> 16;
					int var10 = class9.field321 * var8;
					var4.field2496 = var4.field2496 + var10 & 0x7FF;
					int var11 = class9.field321 * var9;
					var4.field2463 = var4.field2463 + var11 & 0x7FF;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("wa.a(I)V")
	public static void method1032() {
		class132.field3232 = null;
		field3208 = null;
		class132.field3225 = null;
		class132.field3222 = null;
		class132.field3230 = null;
		class132.field3211 = null;
		class132.field3209 = null;
		class132.field3210 = null;
		class132.field3236 = null;
		class132.field3213 = null;
		class132.field3221 = null;
		class132.field3217 = null;
		class132.field3219 = null;
		class132.field3216 = null;
		class132.field3239 = null;
		class132.field3231 = null;
		class132.field3234 = null;
		class132.field3223 = null;
	}

	@ObfuscatedName("ad.a(I)V")
	public static void method108() {
		field469 = null;
		field842 = null;
		field1397 = null;
	}

	@ObfuscatedName("s.a(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method896(Throwable arg0) throws IOException {
		String var2;
		if (arg0 instanceof class43) {
			class43 var1 = (class43) arg0;
			var2 = var1.field1156 + " | ";
			arg0 = var1.field1155;
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

	@ObfuscatedName("kb.a(B)V")
	public static void method594() {
		field11.method1054();
	}

	@ObfuscatedName("t.f(I)V")
	public static void method935() {
		class114.field2823 = null;
		field2806 = null;
		class114.field2821 = null;
		field2807 = null;
		class114.field2808 = null;
		class114.field2818 = null;
		class114.field2804 = null;
		field2810 = null;
		class114.field2819 = null;
		class114.field2824 = null;
		class114.field2817 = null;
		class114.field2812 = null;
		class114.field2805 = null;
	}

	@ObfuscatedName("tb.b(IIB)I")
	public static int method955(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
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
				if ((class34.field898[arg0][var6][var4] & 0x18) == 0) {
					field3183.method52(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (class34.field898[arg0 + 1][var6][var4] & 0x8) != 0) {
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
				if ((class34.field898[arg0][var10][var9] & 0x18) == 0) {
					method724(arg0, var10, var7, var8, var9);
				}
				if (arg0 < 3 && (class34.field898[arg0 + 1][var10][var9] & 0x8) != 0) {
					method724(arg0 + 1, var10, var7, var8, var9);
				}
			}
		}
		class54.field1433 = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = field3183.method49(field75, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = method389(var14).field1294;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var11;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = class102.field2569[field75].field201;
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
						class122.field3046[class54.field1433] = field470[var15];
						class80.field2023[class54.field1433] = var17;
						class92.field2303[class54.field1433] = var16;
						class54.field1433++;
					}
				}
			}
		}
	}

	@ObfuscatedName("pb.a(I)V")
	public static void method800() {
		class92.field2300 = null;
		class92.field2303 = null;
		class92.field2284 = null;
		class92.field2302 = null;
		class92.field2297 = null;
		field2277 = null;
		class92.field2305 = null;
		class92.field2301 = null;
		field2291 = null;
		class92.field2304 = null;
		class92.field2299 = null;
		class92.field2296 = null;
		class92.field2279 = null;
		class92.field2298 = null;
	}

	@ObfuscatedName("te.a(II)La;")
	public static class1 method973(int arg0) {
		return arg0 < 999999999 ? method502(arg0) : class37.field989;
	}

	@ObfuscatedName("ib.a(ILbd;II)[Le;")
	public static class25[] method518(class11 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method994() : null;
	}

	@ObfuscatedName("sa.a([La;Z)[La;")
	public static class1[] method905(class1[] arg0) {
		class1[] var1 = new class1[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = method956(new class1[] { method502(var2), class39.field1065 });
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = method956(new class1[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("ob.a([Ljava/lang/Object;IILqd;IZ)V")
	public static void method754(Object[] arg0, int arg1, class100 arg2, int arg3) {
		int var4 = 0;
		class16 var5 = method824((Integer) arg0[0], 76);
		int[] var6 = var5.field509;
		int[] var7 = var5.field519;
		int var8 = 0;
		int var9 = -1;
		try {
			field1162 = new int[var5.field518];
			field2606 = new class1[var5.field514];
			int var10 = 0;
			int var11 = 0;
			for (int var12 = 1; var12 < arg0.length; var12++) {
				if (arg0[var12] instanceof Integer) {
					int var13 = (Integer) arg0[var12];
					if (var13 == -2147483647) {
						var13 = arg3;
					}
					if (var13 == -2147483646) {
						var13 = arg1;
					}
					if (var13 == -2147483645) {
						var13 = arg2.field2495;
					}
					if (var13 == -2147483644) {
						var13 = 0;
					}
					field1162[var10++] = var13;
				} else if (arg0[var12] instanceof class1) {
					field2606[var11++] = (class1) arg0[var12];
				}
			}
			while (true) {
				int var14;
				while (true) {
					var9++;
					var14 = var7[var9];
					if (var14 >= 100) {
						break;
					}
					if (var14 == 0) {
						class133.field3255[var4++] = var6[var9];
					} else if (var14 == 1) {
						int var15 = var6[var9];
						class133.field3255[var4++] = class113.field2803[var15];
					} else if (var14 == 2) {
						int var16 = var6[var9];
						var4--;
						class113.field2803[var16] = class133.field3255[var4];
					} else if (var14 == 3) {
						class119.field2957[var8++] = var5.field517[var9];
					} else if (var14 == 6) {
						var9 += var6[var9];
					} else if (var14 == 7) {
						var4 -= 2;
						if (class133.field3255[var4 + 1] != class133.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 8) {
						var4 -= 2;
						if (class133.field3255[var4 + 1] == class133.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 9) {
						var4 -= 2;
						if (class133.field3255[var4 + 1] > class133.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 10) {
						var4 -= 2;
						if (class133.field3255[var4 + 1] < class133.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 21) {
						if (class66.field1653 == 0) {
							return;
						}
						class121 var17 = class109.field2736[--class66.field1653];
						field2606 = var17.field3010;
						field1162 = var17.field3000;
						var9 = var17.field3013;
						var5 = var17.field2999;
						var6 = var5.field509;
						var7 = var5.field519;
					} else if (var14 == 25) {
						int var18 = var6[var9];
						class133.field3255[var4++] = method480(var18);
					} else if (var14 == 27) {
						int var19 = var6[var9];
						var4--;
						method241(class133.field3255[var4], var19);
					} else if (var14 == 31) {
						var4 -= 2;
						if (class133.field3255[var4] <= class133.field3255[var4 + 1]) {
							var9 += var6[var9];
						}
					} else if (var14 == 32) {
						var4 -= 2;
						if (class133.field3255[var4 + 1] <= class133.field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 33) {
						class133.field3255[var4++] = field1162[var6[var9]];
					} else {
						int var10001;
						if (var14 == 34) {
							var10001 = var6[var9];
							var4--;
							field1162[var10001] = class133.field3255[var4];
						} else if (var14 == 35) {
							class119.field2957[var8++] = field2606[var6[var9]];
						} else if (var14 == 36) {
							var10001 = var6[var9];
							var8--;
							field2606[var10001] = class119.field2957[var8];
						} else if (var14 == 37) {
							int var20 = var6[var9];
							var8 -= var20;
							class1 var21 = method825(var20, var8, class119.field2957);
							class119.field2957[var8++] = var21;
						} else if (var14 == 38) {
							var4--;
						} else if (var14 == 39) {
							var8--;
						} else if (var14 == 40) {
							int var22 = var6[var9];
							class16 var23 = method824(var22, 73);
							int[] var24 = new int[var23.field518];
							class1[] var25 = new class1[var23.field514];
							for (int var26 = 0; var26 < var23.field510; var26++) {
								var24[var26] = class133.field3255[var4 + var26 - var23.field510];
							}
							for (int var27 = 0; var27 < var23.field513; var27++) {
								var25[var27] = class119.field2957[var8 + var27 - var23.field513];
							}
							var8 -= var23.field513;
							var4 -= var23.field510;
							class121 var28 = new class121();
							var28.field3010 = field2606;
							var28.field2999 = var5;
							var28.field3000 = field1162;
							var5 = var23;
							var28.field3013 = var9;
							class109.field2736[class66.field1653++] = var28;
							var6 = var23.field509;
							field2606 = var25;
							var9 = -1;
							field1162 = var24;
							var7 = var23.field519;
						} else if (var14 == 42) {
							class133.field3255[var4++] = class38.field1020[var6[var9]];
						} else {
							if (var14 != 43) {
								break;
							}
							var10001 = var6[var9];
							var4--;
							class38.field1020[var10001] = class133.field3255[var4];
						}
					}
				}
				boolean var29;
				if (var6[var9] == 1) {
					var29 = true;
				} else {
					var29 = false;
				}
				if (var14 < 1000) {
					if (var14 == 100) {
						var4 -= 3;
						int var30 = class133.field3255[var4];
						int var31 = class133.field3255[var4 + 1];
						int var32 = class133.field3255[var4 + 2];
						class100 var33 = method1053(var30);
						if (var33.field2519 == null) {
							var33.field2519 = new class100[var32 + 1];
						}
						if (var32 >= var33.field2519.length) {
							class100[] var34 = new class100[var32 + 1];
							for (int var35 = 0; var35 < var33.field2519.length; var35++) {
								var34[var35] = var33.field2519[var35];
							}
							var33.field2519 = var34;
						}
						class100 var36 = new class100();
						var36.field2454 = var33.field2495;
						var36.field2489 = var31;
						var36.field2495 = ((var33.field2495 & 0xFFFF) << 15) + var32 + Integer.MIN_VALUE;
						var33.field2519[var32] = var36;
						if (var29) {
							field1468 = var36;
						} else {
							field3068 = var36;
						}
					} else if (var14 == 101) {
						class100 var37 = var29 ? field1468 : field3068;
						class100 var38 = method1053(var37.field2454);
						var38.field2519[var37.field2495 & 0x7FFF] = null;
					} else {
						if (var14 != 102) {
							break;
						}
						var4--;
						class100 var39 = method1053(class133.field3255[var4]);
						var39.field2519 = null;
					}
				} else if (var14 >= 1000 && var14 < 1100 || !(var14 < 2000 || var14 >= 2100)) {
					class100 var40;
					if (var14 >= 2000) {
						var4--;
						var40 = method1053(class133.field3255[var4]);
						var14 -= 1000;
					} else {
						var40 = var29 ? field1468 : field3068;
					}
					if (var14 == 1000) {
						var4 -= 2;
						var40.field2462 = class133.field3255[var4];
						var40.field2502 = class133.field3255[var4 + 1];
					} else if (var14 == 1001) {
						var4 -= 2;
						var40.field2498 = class133.field3255[var4];
						var40.field2449 = class133.field3255[var4 + 1];
					} else if (var14 == 1003) {
						var4--;
						var40.field2556 = class133.field3255[var4] == 1;
					} else {
						if (var14 != 1004) {
							break;
						}
						var4--;
						var40.field2494 = class133.field3255[var4] == 1;
					}
				} else if (var14 >= 1100 && var14 < 1200 || !(var14 < 2100 || var14 >= 2200)) {
					class100 var41;
					if (var14 < 2000) {
						var41 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var41 = method1053(class133.field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1100) {
						var4 -= 2;
						var41.field2552 = class133.field3255[var4];
						var41.field2537 = class133.field3255[var4 + 1];
					} else if (var14 == 1101) {
						var4--;
						int var42 = class133.field3255[var4];
						int var43 = var42 >> 10 & 0x1F;
						int var44 = var42 & 0x1F;
						int var45 = var42 >> 5 & 0x1F;
						var41.field2453 = (var43 << 19) + (var45 << 11) + (var44 << 3);
					} else if (var14 == 1102) {
						var4--;
						var41.field2451 = class133.field3255[var4] == 1;
					} else if (var14 == 1103) {
						var4--;
						var41.field2551 = class133.field3255[var4];
					} else if (var14 == 1104) {
						var4--;
					} else if (var14 == 1105) {
						var4--;
						var41.field2550 = class133.field3255[var4];
					} else if (var14 == 1106) {
						var4--;
						var41.field2557 = class133.field3255[var4];
					} else if (var14 == 1107) {
						var4--;
						var41.field2447 = class133.field3255[var4] == 1;
					} else if (var14 == 1108) {
						var41.field2493 = 1;
						var4--;
						var41.field2479 = class133.field3255[var4];
					} else if (var14 == 1109) {
						var4 -= 6;
						var41.field2543 = class133.field3255[var4];
						var41.field2485 = class133.field3255[var4 + 1];
						var41.field2496 = class133.field3255[var4 + 2];
						var41.field2463 = class133.field3255[var4 + 3];
						var41.field2531 = class133.field3255[var4 + 4];
						var41.field2534 = class133.field3255[var4 + 5];
					} else if (var14 == 1110) {
						var4--;
						var41.field2465 = class133.field3255[var4];
					} else if (var14 == 1111) {
						var4--;
						var41.field2507 = class133.field3255[var4] == 1;
					} else if (var14 == 1112) {
						var8--;
						var41.field2474 = class119.field2957[var8];
					} else if (var14 == 1113) {
						var4--;
						var41.field2448 = class133.field3255[var4];
					} else if (var14 == 1114) {
						var4 -= 3;
						var41.field2539 = class133.field3255[var4];
						var41.field2521 = class133.field3255[var4 + 1];
						var41.field2538 = class133.field3255[var4 + 2];
					} else {
						if (var14 != 1115) {
							break;
						}
						var4--;
						var41.field2471 = class133.field3255[var4] == 1;
					}
				} else if (var14 >= 1200 && var14 < 1300 || var14 >= 2200 && var14 < 2300) {
					class100 var128;
					if (var14 < 2000) {
						var128 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var128 = method1053(class133.field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1200) {
						var4 -= 3;
						int var129 = class133.field3255[var4];
						int var130 = class133.field3255[var4 + 2];
						if (var129 == -1) {
							var128.field2493 = 0;
						} else {
							class115 var131 = method760(var129);
							var128.field2493 = 4;
							var128.field2496 = var131.field2875;
							var128.field2531 = var131.field2858;
							var128.field2534 = var131.field2848 * 100 / var130;
							var128.field2463 = var131.field2861;
							var128.field2485 = var131.field2841;
							var128.field2543 = var131.field2837;
							var128.field2479 = var129;
						}
					} else if (var14 == 1201) {
						var128.field2493 = 2;
						var4--;
						var128.field2479 = class133.field3255[var4];
					} else if (var14 == 1202) {
						var128.field2493 = 3;
						var128.field2479 = field2621.field90.method634();
					} else {
						if (var14 != 1203) {
							break;
						}
						class100 var132 = var29 ? field3068 : field1468;
						var128.field2544 = var132.field2495;
					}
				} else if (var14 >= 1300 && var14 < 1400 || var14 >= 2300 && var14 < 2400) {
					class100 var121;
					if (var14 >= 2000) {
						var4--;
						var121 = method1053(class133.field3255[var4]);
						var14 -= 1000;
					} else {
						var121 = var29 ? field1468 : field3068;
					}
					if (var14 >= 1300 && var14 <= 1309 || !(var14 < 1314 || var14 > 1317)) {
						var8--;
						class1 var122 = class119.field2957[var8];
						Object[] var123 = new Object[var122.method10() + 1];
						for (int var124 = var123.length - 1; var124 >= 1; var124--) {
							if (var122.method6(var124 - 1) == 115) {
								var8--;
								var123[var124] = class119.field2957[var8];
							} else {
								var4--;
								var123[var124] = Integer.valueOf(class133.field3255[var4]);
							}
						}
						var4--;
						var123[0] = Integer.valueOf(class133.field3255[var4]);
						if (var14 == 1303) {
							var121.field2513 = var123;
						}
						if (var14 == 1317) {
							var121.field2486 = var123;
						}
						if (var14 == 1304) {
							var121.field2464 = var123;
						}
						if (var14 == 1302) {
							var121.field2450 = var123;
						}
						if (var14 == 1316) {
							var121.field2553 = var123;
						}
						if (var14 == 1301) {
							var121.field2487 = var123;
						}
						if (var14 == 1300) {
							var121.field2483 = var123;
						}
						if (var14 == 1315) {
							var121.field2501 = var123;
						}
						if (var14 == 1306) {
							var121.field2475 = var123;
						}
						if (var14 == 1305) {
							var121.field2478 = var123;
						}
						if (var14 == 1309) {
							var121.field2518 = var123;
						}
						if (var14 == 1308) {
							var121.field2456 = var123;
						}
					} else if (var14 == 1310) {
						var4--;
						int var125 = class133.field3255[var4] - 1;
						if (var125 >= 0 && var125 <= 9) {
							if (var121.field2467 == null || var121.field2467.length <= var125) {
								class1[] var126 = new class1[var125 + 1];
								if (var121.field2467 != null) {
									for (int var127 = 0; var127 < var121.field2467.length; var127++) {
										var126[var127] = var121.field2467[var127];
									}
								}
								var121.field2467 = var126;
							}
							var8--;
							var121.field2467[var125] = class119.field2957[var8];
						} else {
							var8--;
						}
					} else if (var14 == 1311) {
						var4--;
						var121.field2544 = class133.field3255[var4];
					} else if (var14 == 1312) {
						var4--;
						var121.field2500 = class133.field3255[var4] == 1;
					} else {
						if (var14 != 1313) {
							break;
						}
						var4--;
					}
				} else if (var14 < 1500) {
					if (var14 == 1400) {
						var4 -= 2;
						int var46 = class133.field3255[var4 + 1];
						int var47 = class133.field3255[var4];
						class100 var48 = method1053(var47);
						if (var48.field2519 == null || var48.field2519.length <= var46 || var48.field2519[var46] == null) {
							class133.field3255[var4++] = 0;
						} else {
							class133.field3255[var4++] = 1;
							if (var29) {
								field1468 = var48.field2519[var46];
							} else {
								field3068 = var48.field2519[var46];
							}
						}
					} else if (var14 == 1401) {
						var4 -= 3;
						int var49 = class133.field3255[var4];
						int var50 = class133.field3255[var4 + 2];
						int var51 = class133.field3255[var4 + 1];
						class100 var52 = method607(field2922[var49], var50, true, 0, -1, 0, var51);
						if (var52 == null) {
							class133.field3255[var4++] = 0;
						} else {
							class133.field3255[var4++] = 1;
							if (var29) {
								field1468 = var52;
							} else {
								field3068 = var52;
							}
						}
					} else {
						if (var14 != 1402) {
							break;
						}
						var4 -= 3;
						class100 var53 = method1053(class133.field3255[var4]);
						int var54 = class133.field3255[var4 + 2];
						int var55 = class133.field3255[var4 + 1];
						class100 var56 = method607(var53.field2519, var54, true, var53.field2537, var53.field2495, var53.field2552, var55);
						if (var56 == null) {
							class133.field3255[var4++] = 0;
						} else {
							class133.field3255[var4++] = 1;
							if (var29) {
								field1468 = var56;
							} else {
								field3068 = var56;
							}
						}
					}
				} else if (var14 < 1600) {
					class100 var57 = var29 ? field1468 : field3068;
					if (var14 == 1500) {
						class133.field3255[var4++] = var57.field2462;
					} else if (var14 == 1501) {
						class133.field3255[var4++] = var57.field2502;
					} else if (var14 == 1502) {
						class133.field3255[var4++] = var57.field2498;
					} else if (var14 == 1503) {
						class133.field3255[var4++] = var57.field2449;
					} else if (var14 == 1504) {
						class133.field3255[var4++] = var57.field2556 ? 1 : 0;
					} else {
						if (var14 != 1505) {
							break;
						}
						class133.field3255[var4++] = var57.field2454;
					}
				} else if (var14 < 1700) {
					class100 var120 = var29 ? field1468 : field3068;
					if (var14 == 1600) {
						class133.field3255[var4++] = var120.field2552;
					} else {
						if (var14 != 1601) {
							break;
						}
						class133.field3255[var4++] = var120.field2537;
					}
				} else if (var14 < 2500) {
					if (var14 == 2401) {
						var4 -= 3;
						int var58 = class133.field3255[var4 + 1];
						int var59 = class133.field3255[var4];
						int var60 = class133.field3255[var4 + 2];
						class100 var61 = method607(field2922[var59], var60, false, 0, -1, 0, var58);
						if (var61 == null) {
							class133.field3255[var4++] = -1;
						} else {
							class133.field3255[var4++] = var61.field2495;
						}
					} else {
						if (var14 != 2402) {
							break;
						}
						var4 -= 3;
						class100 var62 = method1053(class133.field3255[var4]);
						int var63 = class133.field3255[var4 + 1];
						int var64 = class133.field3255[var4 + 2];
						class100 var65 = method607(field2922[var62.field2495 >> 16], var64, false, var62.field2537, var62.field2495 & 0xFFFF, var62.field2552, var63);
						if (var65 == null) {
							class133.field3255[var4++] = -1;
						} else {
							class133.field3255[var4++] = var65.field2495;
						}
					}
				} else if (var14 < 2600) {
					var4--;
					class100 var119 = method1053(class133.field3255[var4]);
					if (var14 == 2500) {
						class133.field3255[var4++] = var119.field2462;
					} else if (var14 == 2501) {
						class133.field3255[var4++] = var119.field2502;
					} else if (var14 == 2502) {
						class133.field3255[var4++] = var119.field2498;
					} else if (var14 == 2503) {
						class133.field3255[var4++] = var119.field2449;
					} else if (var14 == 2504) {
						class133.field3255[var4++] = var119.field2556 ? 1 : 0;
					} else {
						if (var14 != 2505) {
							break;
						}
						class133.field3255[var4++] = var119.field2454;
					}
				} else if (var14 < 2700) {
					var4--;
					class100 var66 = method1053(class133.field3255[var4]);
					if (var14 == 2600) {
						class133.field3255[var4++] = var66.field2552;
					} else {
						if (var14 != 2601) {
							break;
						}
						class133.field3255[var4++] = var66.field2537;
					}
				} else {
					if (var14 < 2800) {
						break;
					}
					if (var14 < 3100) {
						if (var14 == 3000) {
							var4--;
							int var67 = class133.field3255[var4];
							if (class120.field2998 == -1) {
								method414(0, var67);
								class120.field2998 = var67;
							}
						} else if (var14 == 3001 || var14 == 3003) {
							var4 -= 2;
							int var68 = class133.field3255[var4];
							int var69 = class133.field3255[var4 + 1];
							method673(0, var69, var68);
						} else if (var14 == 3002) {
							class100 var70 = var29 ? field1468 : field3068;
							if (class120.field2998 == -1) {
								method414(var70.field2495 & 0x7FFF, var70.field2454);
								class120.field2998 = var70.field2495;
							}
						} else {
							if (var14 != 3003) {
								break;
							}
							class100 var71 = var29 ? field1468 : field3068;
							var4--;
							int var72 = class133.field3255[var4];
							method673(var71.field2495 & 0x7FFF, var72, var71.field2454);
						}
					} else if (var14 >= 3200) {
						if (var14 < 3300) {
							if (var14 == 3200) {
								var4 -= 3;
								method887(class133.field3255[var4], class133.field3255[var4 + 1], class133.field3255[var4 + 2]);
							} else if (var14 == 3201) {
								var4--;
								method874(class133.field3255[var4]);
							} else {
								if (var14 != 3202) {
									break;
								}
								var4 -= 2;
								method928(class133.field3255[var4 + 1], class133.field3255[var4]);
							}
						} else if (var14 < 3400) {
							if (var14 != 3300) {
								break;
							}
							class133.field3255[var4++] = class82.field2063;
						} else if (var14 >= 4100) {
							if (var14 >= 4200) {
								break;
							}
							if (var14 == 4100) {
								var8--;
								class1 var102 = class119.field2957[var8];
								var4--;
								int var103 = class133.field3255[var4];
								class119.field2957[var8++] = method956(new class1[] { var102, method502(var103) });
							} else if (var14 == 4101) {
								var8 -= 2;
								class1 var104 = class119.field2957[var8 + 1];
								class1 var105 = class119.field2957[var8];
								class119.field2957[var8++] = method956(new class1[] { var105, var104 });
							} else if (var14 == 4102) {
								var8--;
								class1 var106 = class119.field2957[var8];
								var4--;
								int var107 = class133.field3255[var4];
								class119.field2957[var8++] = method956(new class1[] { var106, method1034(var107) });
							} else if (var14 == 4103) {
								var8--;
								class1 var108 = class119.field2957[var8];
								class119.field2957[var8++] = var108.method30();
							} else if (var14 == 4104) {
								var4--;
								int var109 = class133.field3255[var4];
								long var110 = ((long) var109 + 11745L) * 86400000L;
								class14.field453.setTime(new Date(var110));
								int var112 = class14.field453.get(5);
								int var113 = class14.field453.get(2);
								int var114 = class14.field453.get(1);
								class119.field2957[var8++] = method956(new class1[] { method502(var112), class63.field1572, class19.field621[var113], class63.field1572, method502(var114) });
							} else if (var14 == 4105) {
								var8 -= 2;
								class1 var115 = class119.field2957[var8];
								class1 var116 = class119.field2957[var8 + 1];
								if (field2621.field90 != null && field2621.field90.field1658) {
									class119.field2957[var8++] = var116;
								} else {
									class119.field2957[var8++] = var115;
								}
							} else if (var14 == 4106) {
								var4--;
								int var117 = class133.field3255[var4];
								class119.field2957[var8++] = method502(var117);
							} else {
								if (var14 != 4107) {
									break;
								}
								var8 -= 2;
								class133.field3255[var4++] = class119.field2957[var8].method35(class119.field2957[var8 + 1]);
							}
						} else if (var14 == 4000) {
							var4 -= 2;
							int var73 = class133.field3255[var4];
							int var74 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = var73 + var74;
						} else if (var14 == 4001) {
							var4 -= 2;
							int var75 = class133.field3255[var4 + 1];
							int var76 = class133.field3255[var4];
							class133.field3255[var4++] = var76 - var75;
						} else if (var14 == 4002) {
							var4 -= 2;
							int var77 = class133.field3255[var4 + 1];
							int var78 = class133.field3255[var4];
							class133.field3255[var4++] = var77 * var78;
						} else if (var14 == 4003) {
							var4 -= 2;
							int var79 = class133.field3255[var4];
							int var80 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = var79 / var80;
						} else if (var14 == 4004) {
							var4--;
							int var81 = class133.field3255[var4];
							class133.field3255[var4++] = (int) (Math.random() * (double) var81);
						} else if (var14 == 4005) {
							var4--;
							int var82 = class133.field3255[var4];
							class133.field3255[var4++] = (int) ((double) (var82 + 1) * Math.random());
						} else if (var14 == 4006) {
							var4 -= 5;
							int var83 = class133.field3255[var4 + 1];
							int var84 = class133.field3255[var4];
							int var85 = class133.field3255[var4 + 3];
							int var86 = class133.field3255[var4 + 4];
							int var87 = class133.field3255[var4 + 2];
							class133.field3255[var4++] = var84 + (var83 - var84) * (-var87 + var86) / (var85 - var87);
						} else if (var14 == 4007) {
							var4 -= 2;
							int var88 = class133.field3255[var4];
							int var89 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = var88 * var89 / 100 + var88;
						} else if (var14 == 4008) {
							var4 -= 2;
							int var90 = class133.field3255[var4];
							int var91 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = 0x1 << var91 | var90;
						} else if (var14 == 4009) {
							var4 -= 2;
							int var92 = class133.field3255[var4];
							int var93 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = var92 & -(0x1 << var93) - 1;
						} else if (var14 == 4010) {
							var4 -= 2;
							int var94 = class133.field3255[var4];
							int var95 = class133.field3255[var4 + 1];
							class133.field3255[var4++] = (0x1 << var95 & var94) == 0 ? 0 : 1;
						} else if (var14 == 4011) {
							var4 -= 2;
							int var96 = class133.field3255[var4 + 1];
							int var97 = class133.field3255[var4];
							class133.field3255[var4++] = var97 % var96;
						} else if (var14 == 4012) {
							var4 -= 2;
							int var98 = class133.field3255[var4];
							int var99 = class133.field3255[var4 + 1];
							if (var98 == 0) {
								class133.field3255[var4++] = 0;
							} else {
								class133.field3255[var4++] = (int) Math.pow((double) var98, (double) var99);
							}
						} else {
							if (var14 != 4013) {
								break;
							}
							var4 -= 2;
							int var100 = class133.field3255[var4];
							int var101 = class133.field3255[var4 + 1];
							if (var100 == 0) {
								class133.field3255[var4++] = 0;
							} else if (var101 == 0) {
								class133.field3255[var4++] = Integer.MAX_VALUE;
							} else {
								class133.field3255[var4++] = (int) Math.pow((double) var100, 1.0D / (double) var101);
							}
						}
					} else if (var14 == 3100) {
						var8--;
						class1 var118 = class119.field2957[var8];
						method758(0, var118, class102.field2585);
					} else {
						if (var14 != 3101) {
							break;
						}
						var4 -= 2;
						method450(class133.field3255[var4], class133.field3255[var4 + 1], field2621);
					}
				}
			}
		} catch (Exception var133) {
		}
	}

	@ObfuscatedName("d.b(Z)V")
	public static void method293() {
		class15.field488.method417();
		int var0 = class15.field488.method412(8);
		if (var0 < class49.field1341) {
			for (int var1 = var0; var1 < class49.field1341; var1++) {
				class11.field375[class31.field841++] = class22.field677[var1];
			}
		}
		if (var0 > class49.field1341) {
			throw new RuntimeException("gnpov1");
		}
		class49.field1341 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class22.field677[var2];
			class130 var4 = class120.field2992[var3];
			int var5 = class15.field488.method412(1);
			if (var5 == 0) {
				class22.field677[class49.field1341++] = var3;
				var4.field2008 = class82.field2063;
			} else {
				int var6 = class15.field488.method412(2);
				if (var6 == 0) {
					class22.field677[class49.field1341++] = var3;
					var4.field2008 = class82.field2063;
					class50.field1348[class80.field2027++] = var3;
				} else if (var6 == 1) {
					class22.field677[class49.field1341++] = var3;
					var4.field2008 = class82.field2063;
					int var7 = class15.field488.method412(3);
					var4.method725(var7, false);
					int var8 = class15.field488.method412(1);
					if (var8 == 1) {
						class50.field1348[class80.field2027++] = var3;
					}
				} else if (var6 == 2) {
					class22.field677[class49.field1341++] = var3;
					var4.field2008 = class82.field2063;
					int var9 = class15.field488.method412(3);
					var4.method725(var9, true);
					int var10 = class15.field488.method412(3);
					var4.method725(var10, true);
					int var11 = class15.field488.method412(1);
					if (var11 == 1) {
						class50.field1348[class80.field2027++] = var3;
					}
				} else if (var6 == 3) {
					class11.field375[class31.field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("ha.a(B)V")
	public static void method463() {
		if (field217 == null) {
			return;
		}
		long var0 = method869();
		if (var0 <= field462) {
			return;
		}
		field217.method255(var0);
		int var2 = (int) (var0 - field462);
		field462 = var0;
		Class var3 = class14.class;
		synchronized (class14.class) {
			field1157 += field192 * var2;
			int var4 = (field1157 - field192 * 2000) / 1000;
			if (var4 > 0) {
				if (field1381 != null) {
					field1381.method127(var4);
				}
				field1157 -= var4 * 1000;
			}
		}
	}

	@ObfuscatedName("cc.a(Lad;IIIILab;IIII)V")
	public static void method270(class5 arg0, int arg1, int arg2, int arg3, int arg4, class3 arg5, int arg6, int arg7, int arg8) {
		int var9 = class57.field1451[arg2][arg8][arg7];
		int var10 = class57.field1451[arg2][arg8 + 1][arg7];
		int var11 = class57.field1451[arg2][arg8][arg7 + 1];
		int var12 = class57.field1451[arg2][arg8 + 1][arg7 + 1];
		class49 var13 = method389(arg1);
		int var14 = var9 + var11 + var10 + var12 >> 2;
		int var15 = (arg6 << 6) + arg4;
		int var16 = arg8 + (arg7 << 7) + (arg1 << 14) + 1073741824;
		if (var13.field1329 == 0) {
			var16 += Integer.MIN_VALUE;
		}
		if (var13.field1316 == 1) {
			var15 += 256;
		}
		if (arg4 == 22) {
			class128 var17;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var17 = var13.method505(var12, var11, arg6, var9, 22, var10);
			} else {
				var17 = new class54(arg1, 22, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method88(arg3, arg8, arg7, var14, var17, var16, var15);
			if (var13.field1284 && var13.field1329 == 1) {
				arg0.method115(arg7, arg8);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			class128 var18;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var18 = var13.method505(var12, var11, arg6, var9, 10, var10);
			} else {
				var18 = new class54(arg1, 10, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			if (var18 != null) {
				int var19;
				int var20;
				if (arg6 == 1 || arg6 == 3) {
					var20 = var13.field1286;
					var19 = var13.field1298;
				} else {
					var19 = var13.field1286;
					var20 = var13.field1298;
				}
				int var21 = 0;
				if (arg4 == 11) {
					var21 += 256;
				}
				arg5.method93(arg3, arg8, arg7, var14, var19, var20, var18, var21, var16, var15);
			}
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else if (arg4 >= 12) {
			class128 var22;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var22 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var22 = new class54(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method93(arg3, arg8, arg7, var14, 1, 1, var22, 0, var16, var15);
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else if (arg4 == 0) {
			class128 var23;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var23 = var13.method505(var12, var11, arg6, var9, 0, var10);
			} else {
				var23 = new class54(arg1, 0, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var23, null, class70.field1740[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 1) {
			class128 var24;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var24 = var13.method505(var12, var11, arg6, var9, 1, var10);
			} else {
				var24 = new class54(arg1, 1, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var24, null, class114.field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 2) {
			int var25 = arg6 + 1 & 0x3;
			class128 var26;
			class128 var27;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var26 = var13.method505(var12, var11, arg6 + 4, var9, 2, var10);
				var27 = var13.method505(var12, var11, var25, var9, 2, var10);
			} else {
				var26 = new class54(arg1, 2, arg6 + 4, var9, var10, var12, var11, var13.field1289, true);
				var27 = new class54(arg1, 2, var25, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var26, var27, class70.field1740[arg6], class70.field1740[var25], var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 3) {
			class128 var28;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var28 = var13.method505(var12, var11, arg6, var9, 3, var10);
			} else {
				var28 = new class54(arg1, 3, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var28, null, class114.field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 9) {
			class128 var29;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var29 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var29 = new class54(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method93(arg3, arg8, arg7, var14, 1, 1, var29, 0, var16, var15);
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else {
			if (var13.field1313) {
				if (arg6 == 1) {
					int var33 = var11;
					var11 = var12;
					var12 = var10;
					var10 = var9;
					var9 = var33;
				} else if (arg6 == 2) {
					int var31 = var11;
					var11 = var10;
					var10 = var31;
					int var32 = var12;
					var12 = var9;
					var9 = var32;
				} else if (arg6 == 3) {
					int var30 = var11;
					var11 = var9;
					var9 = var10;
					var10 = var12;
					var12 = var30;
				}
			}
			if (arg4 == 4) {
				class128 var34;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var34 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var34 = new class54(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var34, class70.field1740[arg6], arg6 * 512, 0, 0, var16, var15);
			} else if (arg4 == 5) {
				int var35 = 16;
				int var36 = arg5.method78(arg3, arg8, arg7);
				if (var36 > 0) {
					var35 = method389(var36 >> 14 & 0x7FFF).field1288;
				}
				class128 var37;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var37 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var37 = new class54(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var37, class70.field1740[arg6], arg6 * 512, class63.field1595[arg6] * var35, class4.field181[arg6] * var35, var16, var15);
			} else if (arg4 == 6) {
				class128 var38;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var38 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var38 = new class54(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var38, 256, arg6, 0, 0, var16, var15);
			} else if (arg4 == 7) {
				class128 var39;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var39 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var39 = new class54(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var39, 512, arg6, 0, 0, var16, var15);
			} else if (arg4 == 8) {
				class128 var40;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var40 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var40 = new class54(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var40, 768, arg6, 0, 0, var16, var15);
			}
		}
	}

	@ObfuscatedName("qb.a(IILba;IIIII)V")
	public static void method841(int arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0 || arg0 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				int var9 = arg2.method144();
				if (var9 == 0) {
					break;
				}
				if (var9 == 1) {
					arg2.method144();
					break;
				}
				if (var9 <= 49) {
					arg2.method144();
				}
			}
			return;
		}
		class34.field898[arg6][arg0][arg3] = 0;
		while (true) {
			int var7 = arg2.method144();
			if (var7 == 0) {
				if (arg6 == 0) {
					class57.field1451[0][arg0][arg3] = -method751(arg0 + arg5 + 932731, arg4 + 556238 + arg3) * 8;
				} else {
					class57.field1451[arg6][arg0][arg3] = class57.field1451[arg6 - 1][arg0][arg3] - 240;
				}
				break;
			}
			if (var7 == 1) {
				int var8 = arg2.method144();
				if (var8 == 1) {
					var8 = 0;
				}
				if (arg6 == 0) {
					class57.field1451[0][arg0][arg3] = -var8 * 8;
				} else {
					class57.field1451[arg6][arg0][arg3] = class57.field1451[arg6 - 1][arg0][arg3] - var8 * 8;
				}
				break;
			}
			if (var7 <= 49) {
				field3053[arg6][arg0][arg3] = arg2.method184();
				field910[arg6][arg0][arg3] = (byte) ((var7 - 2) / 4);
				field1872[arg6][arg0][arg3] = (byte) (arg1 + var7 - 2 & 0x3);
			} else if (var7 <= 81) {
				class34.field898[arg6][arg0][arg3] = (byte) (var7 - 49);
			} else {
				field2131[arg6][arg0][arg3] = (byte) (var7 - 81);
			}
		}
	}

	@ObfuscatedName("w.b(B)V")
	public static void method1028() {
		field925.method1054();
		field1347 = class27.method362(field1347);
	}

	@ObfuscatedName("dc.c(I)V")
	public static void method316() {
		if (class46.field1208 == 0) {
			field3183 = new class3(4, 104, 104, class57.field1451);
			for (int var0 = 0; var0 < 4; var0++) {
				class102.field2569[var0] = new class5(104, 104);
			}
			field2626 = new class58(512, 512);
			class133.field3274 = 5;
			class46.field1208 = 20;
			class123.field3079 = class100.field2480;
		} else if (class46.field1208 == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 128 + 15;
				int var4 = var3 * 3 + 600;
				int var5 = class27.field775[var3];
				var1[var2] = var4 * var5 >> 16;
			}
			class3.method51(var1);
			class133.field3274 = 10;
			class123.field3079 = class62.field1557;
			class46.field1208 = 30;
		} else if (class46.field1208 == 30) {
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
			class46.field1208 = 40;
			class123.field3079 = class52.field1362;
			class133.field3274 = 20;
		} else if (class46.field1208 == 40) {
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
				class46.field1208 = 45;
				class123.field3079 = class73.field1782;
				class133.field3274 = 30;
			} else {
				if (var18 != 0) {
					class123.field3079 = method956(new class1[] { class42.field1106, method502(var18), class89.field2181 });
				}
				class133.field3274 = 30;
			}
		} else if (class46.field1208 == 45) {
			method574(field1071, !class93.field2332);
			field2435 = method993(field1071, field3049);
			field2705 = new class98(22050, field192);
			class46.field1208 = 50;
			class123.field3079 = class93.field2325;
			class133.field3274 = 35;
		} else if (class46.field1208 == 50) {
			int var19 = 0;
			if (field2892 == null) {
				field2892 = method528(field1087, class132.field3234, class57.field1453);
			} else {
				var19++;
			}
			if (field2684 == null) {
				field2684 = method528(field1087, class132.field3234, class133.field3247);
			} else {
				var19++;
			}
			if (field2902 == null) {
				field2902 = method528(field1087, class132.field3234, class60.field1526);
			} else {
				var19++;
			}
			if (var19 < 3) {
				class123.field3079 = method956(new class1[] { class93.field2319, method502(var19 * 100 / 3), class89.field2181 });
				class133.field3274 = 40;
			} else {
				class46.field1208 = 60;
				class133.field3274 = 40;
				class123.field3079 = class42.field1102;
			}
		} else if (class46.field1208 == 60) {
			int var20 = method966(field1542, field1087);
			int var21 = method432();
			if (var20 < var21) {
				class123.field3079 = method956(new class1[] { class98.field2407, method502(var20 * 100 / var21), class89.field2181 });
				class133.field3274 = 50;
			} else {
				class123.field3079 = class134.field3305;
				class133.field3274 = 50;
				method399(5);
				class46.field1208 = 70;
			}
		} else if (class46.field1208 == 70) {
			if (field2376.method230()) {
				method723(field2376);
				method702(field2376);
				method930(field2376, field1890);
				method933(field1890, class93.field2332, field2376);
				method603(field1890, field2376);
				method748(field2376, class45.field1183, field1890);
				method268(field657, field2376, field1378);
				method903(field1890, field2376);
				method868(field2376);
				method289(field2376);
				method292(field3200, field1087, field1890);
				class46.field1208 = 80;
				class133.field3274 = 60;
				class123.field3079 = class85.field2138;
			} else {
				class123.field3079 = method956(new class1[] { class72.field1762, method502(field2376.method982()), class89.field2181 });
				class133.field3274 = 60;
			}
		} else if (class46.field1208 == 80) {
			int var22 = 0;
			if (field1239 == null) {
				field1239 = method1038(field1087, class107.field2700, class132.field3234);
			} else {
				var22++;
			}
			if (field784 == null) {
				field784 = method1038(field1087, class121.field3007, class132.field3234);
			} else {
				var22++;
			}
			if (field800 == null) {
				field800 = method372(field1087, class66.field1646, class132.field3234);
			} else {
				var22++;
			}
			if (field470 == null) {
				field470 = method245(field1087, class54.field1440, class132.field3234);
			} else {
				var22++;
			}
			if (field1231 == null) {
				field1231 = method245(field1087, class57.field1466, class132.field3234);
			} else {
				var22++;
			}
			if (field1376 == null) {
				field1376 = method245(field1087, class119.field2965, class132.field3234);
			} else {
				var22++;
			}
			if (field178 == null) {
				field178 = method245(field1087, class38.field1034, class132.field3234);
			} else {
				var22++;
			}
			if (field1886 == null) {
				field1886 = method245(field1087, class105.field2646, class132.field3234);
			} else {
				var22++;
			}
			if (field2277 == null) {
				field2277 = method1038(field1087, class57.field1461, class132.field3234);
			} else {
				var22++;
			}
			if (field680 == null) {
				field680 = method245(field1087, class9.field325, class132.field3234);
			} else {
				var22++;
			}
			if (field1926 == null) {
				field1926 = method245(field1087, class127.field3118, class132.field3234);
			} else {
				var22++;
			}
			if (field1578 == null) {
				field1578 = method245(field1087, class6.field234, class132.field3234);
			} else {
				var22++;
			}
			if (field365 == null) {
				field365 = method372(field1087, class1.field23, class132.field3234);
			} else {
				var22++;
			}
			if (field2614 == null) {
				field2614 = method372(field1087, class79.field1929, class132.field3234);
			} else {
				var22++;
			}
			if (var22 < 14) {
				class123.field3079 = method956(new class1[] { class31.field833, method502(var22 * 100 / 14), class89.field2181 });
				class133.field3274 = 70;
			} else {
				field784.method556();
				int var23 = (int) (Math.random() * 21.0D) - 10;
				int var24 = (int) (Math.random() * 21.0D) - 10;
				int var25 = (int) (Math.random() * 41.0D) - 20;
				int var26 = (int) (Math.random() * 21.0D) - 10;
				for (int var27 = 0; var27 < field470.length; var27++) {
					field470[var27].method547(var23 + var25, var24 - -var25, var26 + var25);
				}
				field800[0].method334(var23 + var25, var24 + var25, var25 + var26);
				class123.field3079 = class60.field1527;
				class133.field3274 = 70;
				class46.field1208 = 85;
			}
		} else if (class46.field1208 == 85) {
			int var28 = method892(field1087);
			int var29 = method456();
			if (var28 < var29) {
				class123.field3079 = method956(new class1[] { class63.field1597, method502(var28 * 100 / var29), class89.field2181 });
				class133.field3274 = 80;
			} else {
				class123.field3079 = class54.field1431;
				class46.field1208 = 90;
				class133.field3274 = 80;
			}
		} else if (class46.field1208 == 90) {
			if (field1752.method230()) {
				class75 var30 = new class75(field1752, field1087, 20, 0.8D, class93.field2332 ? 64 : 128);
				class27.method357(var30);
				class27.method365(0.8D);
				class46.field1208 = 110;
				class133.field3274 = 90;
				class123.field3079 = class80.field1998;
			} else {
				class123.field3079 = method956(new class1[] { class28.field793, method502(field1752.method982()), class89.field2181 });
				class133.field3274 = 90;
			}
		} else if (class46.field1208 == 110) {
			field708 = new class81();
			field1071.method656(10, field708);
			class123.field3079 = class28.field796;
			class46.field1208 = 120;
			class133.field3274 = 94;
		} else if (class46.field1208 == 120) {
			if (field1542.method239(class52.field1388, class132.field3234)) {
				class132 var31 = new class132(field1542.method215(class132.field3234, class52.field1388));
				method567(var31);
				class46.field1208 = 130;
				class123.field3079 = class102.field2575;
				class133.field3274 = 96;
			} else {
				class123.field3079 = method956(new class1[] { class19.field671, class112.field2772 });
				class133.field3274 = 96;
			}
		} else if (class46.field1208 == 130) {
			if (!field3200.method230()) {
				class123.field3079 = method956(new class1[] { class73.field1789, method502(field3200.method982() * 4 / 5), class89.field2181 });
				class133.field3274 = 100;
			} else if (field2739.method230()) {
				class123.field3079 = class38.field1031;
				class46.field1208 = 140;
				class133.field3274 = 100;
			} else {
				class123.field3079 = method956(new class1[] { class73.field1789, method502(field2739.method982() / 5 + 80), class89.field2181 });
				class133.field3274 = 100;
			}
		} else if (class46.field1208 == 140) {
			method399(10);
		}
	}

	@ObfuscatedName("hd.a(IIIBIII)Z")
	public static boolean method478(int arg0, int arg1, int arg2, int arg3) {
		return method1052(arg0) ? method278(arg2, 0, 0, 0, -1, arg1, arg3, 0, field2922[arg0]) : false;
	}

	@ObfuscatedName("m.a(IZIILbd;IIZ)V")
	public static synchronized void method670(int arg0, int arg1, class11 arg2, int arg3) {
		if (!method521()) {
			return;
		}
		field611 = false;
		field405 = 10;
		field661 = arg3;
		class53.field1391 = true;
		field1028 = arg2;
		field2985 = -1;
		field917 = arg0;
		field1462 = 0;
		field463 = arg1;
	}

	@ObfuscatedName("mb.a(B)Z")
	public static boolean method685() {
		class107 var0 = class117.field2924;
		synchronized (class117.field2924) {
			if (class117.field2921 == class105.field2630) {
				return false;
			} else {
				field2885 = class57.field1465[class117.field2921];
				field2920 = class104.field2625[class117.field2921];
				class117.field2921 = class117.field2921 + 1 & 0x7F;
				return true;
			}
		}
	}

	@ObfuscatedName("na.b(B)V")
	public static void method722() {
		if (!field1062) {
			return;
		}
		field2600 = null;
		field1435 = null;
		field3298 = null;
		field2608 = null;
		field2570 = null;
		field2911 = null;
		field2919 = null;
		field3025 = null;
		field2806 = null;
		field3139 = null;
		field472 = null;
		field2044 = null;
		field1307 = null;
		field2055 = null;
		field1177 = null;
		field2904 = null;
		field1935 = null;
		field851 = null;
		field229 = null;
		field2701 = null;
		field844 = null;
		field2151 = null;
		method672();
		method617(true);
		field1062 = false;
	}

	@ObfuscatedName("tc.b(I)V")
	public static void method961() {
		class3.field115 = true;
		class93.field2332 = true;
	}

	@ObfuscatedName("l.a(III)Z")
	public static boolean method631(int arg0, int arg1) {
		if (arg0 == 0 && class115.field2881 == arg1) {
			return true;
		} else if (arg0 == 1 && class5.field214 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && class108.field2712 == arg1;
		}
	}

	@ObfuscatedName("ma.b(I)V")
	public static void method682() {
		field1780 = null;
		class73.field1789 = null;
		class73.field1788 = null;
		class73.field1785 = null;
		class73.field1786 = null;
		class73.field1784 = null;
		class73.field1787 = null;
		class73.field1782 = null;
	}

	@ObfuscatedName("oa.a(BI)V")
	public static void method746(int arg0) {
		if (!method1052(arg0)) {
			return;
		}
		class100[] var1 = field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class100 var3 = var1[var2];
			if (var3 != null) {
				var3.field2466 = 0;
				var3.field2460 = 0;
			}
		}
	}

	@ObfuscatedName("rb.a(ZI)V")
	public static void method876(int arg0) {
		class92.field2293 = arg0;
	}

	@ObfuscatedName("td.a(Lbd;Lbd;I)I")
	public static int method966(class11 arg0, class11 arg1) {
		int var2 = 0;
		if (arg0.method239(class70.field1751, class123.field3067)) {
			var2++;
		}
		if (arg1.method239(client.field583, class123.field3067)) {
			var2++;
		}
		if (arg1.method239(class47.field1245, class123.field3067)) {
			var2++;
		}
		if (arg1.method239(class39.field1056, class123.field3067)) {
			var2++;
		}
		if (arg1.method239(class14.field473, class123.field3067)) {
			var2++;
		}
		return var2;
	}

	@ObfuscatedName("uc.e(I)V")
	public static void method995() {
		class86.field2152.method267();
		class74.field1841.method267();
	}

	@ObfuscatedName("kb.a(I)V")
	public static void method595() {
		method265();
		method234();
		method854();
		method859();
		method481();
		method254();
		method233();
		method995();
		method807();
		method191();
		method873();
		method726();
		((class75) field771).method691();
		class31.field830.method267();
		field1378.method236();
		field657.method236();
		field3200.method236();
		field2031.method236();
		field3131.method236();
		field2702.method236();
		field1890.method236();
		field1087.method236();
		field1752.method236();
		field1542.method236();
		field2324.method236();
		field2739.method236();
	}

	@ObfuscatedName("ca.b(I)V")
	public static void method253() {
		class93.field2332 = false;
		class3.field115 = false;
	}

	@ObfuscatedName("re.a(B)V")
	public static void method890() {
		class107.field2687 = null;
		class107.field2699 = null;
		field2701 = null;
		class107.field2694 = null;
		class107.field2698 = null;
		class107.field2700 = null;
	}

	@ObfuscatedName("fe.a(ILu;Lsa;B)V")
	public static void method410(int arg0, class120 arg1, class109 arg2) {
		class57 var3 = new class57();
		var3.field1464 = 1;
		var3.field2073 = arg0;
		var3.field1469 = arg2;
		var3.field1456 = arg1;
		class92 var4 = class62.field1547;
		synchronized (class62.field1547) {
			class62.field1547.method804(var3);
		}
		method500();
	}

	@ObfuscatedName("ib.a(IZII)I")
	public static int method519(int arg0, int arg1, int arg2) {
		int var3 = arg0 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return arg2;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@ObfuscatedName("sd.a(IBI)V")
	public static void method928(int arg0, int arg1) {
		if (class62.field1554 != 0 && arg1 != -1) {
			method681(1, arg1, class62.field1554, field2324);
			class75.field1860 = arg0;
		}
	}

	@ObfuscatedName("wc.a(I)V")
	public static void method1051() {
		class134.field3305 = null;
		class134.field3306 = null;
		field3296 = null;
		field3298 = null;
		field3299 = null;
		class134.field3303 = null;
		class134.field3282 = null;
		class134.field3307 = null;
		class134.field3302 = null;
		class134.field3295 = null;
		class134.field3300 = null;
	}

	@ObfuscatedName("qa.f(I)V")
	public static void method836() {
		class97.field2398 = null;
		class97.field2394 = null;
		class97.field2401 = null;
		class97.field2400 = null;
		class97.field2391 = null;
		class97.field2397 = null;
		class97.field2393 = null;
	}

	@ObfuscatedName("be.a(La;I)Z")
	public static boolean method242(class1 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < class59.field1492; var1++) {
			if (arg0.method14(class119.field2951[var1])) {
				return true;
			}
		}
		return arg0.method14(field2621.field86);
	}

	@ObfuscatedName("ie.a(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method530(String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@ObfuscatedName("te.a(III)V")
	public static void method974(int arg0, int arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < 100; var3++) {
			if (class80.field2034[var3] != null) {
				int var4 = class132.field3236[var3];
				int var5 = class49.field1340 + 4 + 70 - var2 * 14;
				if (var5 < -20) {
					break;
				}
				if (var4 == 0) {
					var2++;
				}
				class1 var6 = class128.field3130[var3];
				if (var6 != null && var6.method26(class103.field2612)) {
					var6 = var6.method1(5);
				}
				if (var6 != null && var6.method26(class100.field2535)) {
					var6 = var6.method1(5);
				}
				if ((var4 == 1 || var4 == 2) && (var4 == 1 || class75.field1864 == 0 || class75.field1864 == 1 && method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5 && !var6.method5(field2621.field86)) {
						if (class37.field1004 >= 1) {
							method398(0, class38.field1038, 0, 0, 28, method956(new class1[] { class53.field1393, var6 }));
						}
						method398(0, class79.field1933, 0, 0, 51, method956(new class1[] { class53.field1393, var6 }));
						method398(0, class52.field1364, 0, 0, 45, method956(new class1[] { class53.field1393, var6 }));
					}
					var2++;
				}
				if ((var4 == 3 || var4 == 7) && class5.field216 == 0 && (var4 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var6))) {
					var2++;
					if (arg1 > var5 - 14 && arg1 <= var5) {
						if (class37.field1004 >= 1) {
							method398(0, class38.field1038, 0, 0, 28, method956(new class1[] { class53.field1393, var6 }));
						}
						method398(0, class79.field1933, 0, 0, 51, method956(new class1[] { class53.field1393, var6 }));
						method398(0, class52.field1364, 0, 0, 45, method956(new class1[] { class53.field1393, var6 }));
					}
				}
				if (var4 == 4 && (class115.field2828 == 0 || class115.field2828 == 1 && method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5) {
						method398(0, class103.field2610, 0, 0, 26, method956(new class1[] { class53.field1393, var6 }));
					}
					var2++;
				}
				if ((var4 == 5 || var4 == 6) && class5.field216 == 0 && class6.field236 < 2) {
					var2++;
				}
				if (var4 == 8 && (class115.field2828 == 0 || class115.field2828 == 1 && method242(var6))) {
					if (var5 - 14 < arg1 && arg1 <= var5) {
						method398(0, class54.field1432, 0, 0, 46, method956(new class1[] { class53.field1393, var6 }));
					}
					var2++;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(B)V")
	public static void method599() {
		class97.field2399++;
		method957(true);
		method950(true);
		method957(false);
		method950(false);
		method503();
		method990();
		if (!class81.field2043) {
			int var0 = class131.field3204;
			if (class57.field1459 / 256 > var0) {
				var0 = class57.field1459 / 256;
			}
			int var1 = class113.field2797 + class112.field2766 & 0x7FF;
			if (class19.field632[4] && class64.field1599[4] + 128 > var0) {
				var0 = class64.field1599[4] + 128;
			}
			method848(var0, field1194, method712(field75, field2621.field1972, field2621.field1963) - 50, var1, field1839, var0 * 3 + 600);
		}
		int var2;
		if (class81.field2043) {
			var2 = method273();
		} else {
			var2 = method298();
		}
		int var3 = field709;
		int var4 = field184;
		int var5 = field1748;
		int var6 = field1400;
		int var7 = field1200;
		for (int var8 = 0; var8 < 5; var8++) {
			if (class19.field632[var8]) {
				int var9 = (int) ((double) (class14.field471[var8] * 2 + 1) * Math.random() + Math.sin((double) class113.field2782[var8] / 100.0D * (double) class38.field1019[var8]) * (double) class64.field1599[var8] - (double) class14.field471[var8]);
				if (var8 == 1) {
					field1748 += var9;
				}
				if (var8 == 0) {
					field709 += var9;
				}
				if (var8 == 2) {
					field1200 += var9;
				}
				if (var8 == 4) {
					field1400 += var9;
					if (field1400 < 128) {
						field1400 = 128;
					}
					if (field1400 > 383) {
						field1400 = 383;
					}
				}
				if (var8 == 3) {
					field184 = field184 + var9 & 0x7FF;
				}
			}
		}
		method1028();
		class91.field2239 = class102.field2568 - 4;
		class91.field2248 = true;
		class91.field2270 = class24.field741 - 4;
		class91.field2261 = 0;
		class111.method920();
		field3183.method53(field709, field1748, field1200, field1400, field184, var2);
		field3183.method60();
		method671();
		method578();
		((class75) field771).method697(class9.field321);
		method891();
		if (class39.field1069 && method614() == 0) {
			class39.field1069 = false;
		}
		if (class39.field1069) {
			method1028();
			class111.method920();
			method872(class133.field3252, false, null);
		}
		method44();
		field709 = var3;
		field1200 = var7;
		field184 = var4;
		field1400 = var6;
		field1748 = var5;
	}

	@ObfuscatedName("nd.a(IIII)V")
	public static void method737(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				class57.field1451[arg1][arg2 + var3][arg0 + var4] = 0;
			}
		}
		if (arg2 > 0) {
			for (int var5 = 1; var5 < 8; var5++) {
				class57.field1451[arg1][arg2][arg0 + var5] = class57.field1451[arg1][arg2 - 1][arg0 + var5];
			}
		}
		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				class57.field1451[arg1][arg2 + var6][arg0] = class57.field1451[arg1][arg2 + var6][arg0 - 1];
			}
		}
		if (arg2 > 0 && class57.field1451[arg1][arg2 - 1][arg0] != 0) {
			class57.field1451[arg1][arg2][arg0] = class57.field1451[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && class57.field1451[arg1][arg2][arg0 - 1] != 0) {
			class57.field1451[arg1][arg2][arg0] = class57.field1451[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && class57.field1451[arg1][arg2 - 1][arg0 - 1] != 0) {
			class57.field1451[arg1][arg2][arg0] = class57.field1451[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("rb.a(II)V")
	public static void method877(int arg0) {
		if (field311 == null) {
			return;
		}
		if (class62.field1548 == 0) {
			if (class122.field3030 >= 0) {
				class122.field3030 = arg0;
				field311.method302(arg0, 0);
			}
		} else if (field78 != null) {
			field975 = arg0;
		}
	}

	@ObfuscatedName("ra.a(ILjava/awt/event/KeyEvent;)I")
	public static int method870(KeyEvent arg0) {
		int var1 = arg0.getKeyChar();
		if (var1 <= 0 || var1 >= 256) {
			var1 = -1;
		}
		return var1;
	}

	@ObfuscatedName("t.a(BI)Z")
	public static boolean method936(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("la.b(I)V")
	public static void method636() {
		class67.field1687 = null;
		class67.field1663 = null;
		field1692 = null;
		class67.field1670 = null;
		class67.field1660 = null;
		class67.field1690 = null;
		class67.field1661 = null;
		class67.field1685 = null;
		class67.field1672 = null;
		field1668 = null;
		class67.field1674 = null;
		class67.field1659 = null;
		class67.field1655 = null;
		field1689 = null;
		class67.field1676 = null;
		class67.field1657 = null;
		class67.field1673 = null;
		class67.field1691 = null;
	}

	@ObfuscatedName("ca.a(B)V")
	public static void method254() {
		class39.field1066.method267();
		class122.field3035.method267();
		class8.field253.method267();
	}

	@ObfuscatedName("k.c(I)V")
	public static void method572() {
		if (class5.field216 == 0) {
			return;
		}
		int var0 = 0;
		if (class114.field2813 != 0) {
			var0 = 1;
		}
		for (int var1 = 0; var1 < 100; var1++) {
			if (class80.field2034[var1] != null) {
				int var2 = class132.field3236[var1];
				class1 var3 = class128.field3130[var1];
				if (var3 != null && var3.method26(class103.field2612)) {
					var3 = var3.method1(5);
				}
				if (var3 != null && var3.method26(class100.field2535)) {
					var3 = var3.method1(5);
				}
				if ((var2 == 3 || var2 == 7) && (var2 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var3))) {
					int var4 = 329 - var0 * 13;
					var0++;
					if (class24.field741 > 4 && var4 - 10 < class102.field2568 + -4 && class102.field2568 - 4 <= var4 + 3) {
						int var5 = field2684.method208(method956(new class1[] { class46.field1215, class23.field713, var3, class80.field2034[var1] })) + 25;
						if (var5 > 450) {
							var5 = 450;
						}
						if (class24.field741 < var5 + 4) {
							if (class37.field1004 >= 1) {
								method398(0, class38.field1038, 0, 0, 2028, method956(new class1[] { class53.field1393, var3 }));
							}
							method398(0, class79.field1933, 0, 0, 2051, method956(new class1[] { class53.field1393, var3 }));
							method398(0, class52.field1364, 0, 0, 2045, method956(new class1[] { class53.field1393, var3 }));
						}
					}
					if (var0 >= 5) {
						return;
					}
				}
				if ((var2 == 5 || var2 == 6) && class6.field236 < 2) {
					var0++;
					if (var0 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("fc.b(B)V")
	public static void method394() {
		field910 = null;
		class34.field898 = null;
		class34.field908 = null;
		class34.field890 = null;
		class34.field889 = null;
		class34.field902 = null;
		class34.field900 = null;
		field899 = null;
	}

	@ObfuscatedName("tc.c(I)V")
	public static void method962() {
		if (field311 == null) {
			return;
		}
		if (class122.field3030 >= 0) {
			if (class62.field1548 > 0) {
				class81.field2046 += class8.field302;
				field311.method302(class122.field3030, class81.field2046);
				class62.field1548--;
				if (class62.field1548 == 0) {
					field311.method305();
					class122.field3030 = -1;
					class62.field1548 = 20;
				}
			}
		} else if (class62.field1548 > 0) {
			class62.field1548--;
			if (class62.field1548 == 0) {
				if (field78 == null) {
					field311.method304(256);
				} else {
					field311.method304(field975);
					class122.field3030 = field975;
					field311.method307(field78, field1662, field975);
					field78 = null;
				}
				class81.field2046 = 0;
			}
		}
		field311.method308();
	}

	@ObfuscatedName("l.a(II)I")
	public static int method632(int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@ObfuscatedName("n.a(II)Lec;")
	public static class28 method713(int arg0) {
		class28 var1 = (class28) class86.field2152.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field999.method217(arg0, 13);
		class28 var3 = new class28();
		var3.field809 = arg0;
		if (var2 != null) {
			var3.method373(new class8(var2));
		}
		class86.field2152.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ae.a(IIII)I")
	public static int method124(int arg0, int arg1, int arg2) {
		int var3 = arg0 & arg1 - 1;
		int var4 = arg2 / arg1;
		int var5 = arg1 - 1 & arg2;
		int var6 = arg0 / arg1;
		int var7 = method121(var6, var4);
		int var8 = method121(var6 + 1, var4);
		int var9 = method121(var6, var4 + 1);
		int var10 = method121(var6 + 1, var4 + 1);
		int var11 = method627(var7, arg1, var8, var3);
		int var12 = method627(var9, arg1, var10, var3);
		return method627(var11, arg1, var12, var5);
	}

	@ObfuscatedName("m.a(B)V")
	public static void method671() {
		class70.field1749 = 0;
		for (int var0 = -1; var0 < class118.field2939 + class49.field1341; var0++) {
			class80 var1;
			if (var0 == -1) {
				var1 = field2621;
			} else if (class118.field2939 > var0) {
				var1 = class80.field2030[class112.field2758[var0]];
			} else {
				var1 = class120.field2992[class22.field677[var0 - class118.field2939]];
			}
			if (var1 != null && var1.method42()) {
				if (var1 instanceof class130) {
					class42 var2 = ((class130) var1).field3182;
					if (var2.field1136 != null) {
						var2 = var2.method457();
					}
					if (var2 == null) {
						continue;
					}
				}
				if (var0 >= class118.field2939) {
					class42 var3 = ((class130) var1).field3182;
					if (var3.field1091 >= 0 && var3.field1091 < field178.length) {
						method523(var1.field1991 + 15, var1);
						if (class39.field1072 > -1) {
							field178[var3.field1091].method551(class39.field1072 - 12, class89.field2188 + -30);
						}
					}
					if (class2.field96 == 1 && class22.field677[var0 - class118.field2939] == class132.field3212 && class82.field2063 % 20 < 10) {
						method523(var1.field1991 + 15, var1);
						if (class39.field1072 > -1) {
							field1886[0].method551(class39.field1072 - 12, class89.field2188 + -28);
						}
					}
				} else {
					class2 var4 = (class2) var1;
					int var5 = 30;
					if (var4.field76 != -1 || var4.field81 != -1) {
						method523(var1.field1991 + 15, var1);
						if (class39.field1072 > -1) {
							if (var4.field76 != -1) {
								field1376[var4.field76].method551(class39.field1072 - 12, class89.field2188 - 30);
								var5 += 25;
							}
							if (var4.field81 != -1) {
								field178[var4.field81].method551(class39.field1072 - 12, -var5 + class89.field2188);
								var5 += 25;
							}
						}
					}
					if (var0 >= 0 && class2.field96 == 10 && class112.field2758[var0] == class134.field3290) {
						method523(var1.field1991 + 15, var1);
						if (class39.field1072 > -1) {
							field1886[1].method551(class39.field1072 - 12, -var5 + class89.field2188);
						}
					}
				}
				if (var1.field1964 != null && (var0 >= class118.field2939 || class75.field1864 == 0 || class75.field1864 == 3 || class75.field1864 == 1 && method242(((class2) var1).field86))) {
					method523(var1.field1991, var1);
					if (class39.field1072 > -1 && class67.field1684 > class70.field1749) {
						class67.field1655[class70.field1749] = field2902.method208(var1.field1964) / 2;
						class67.field1663[class70.field1749] = field2902.field350;
						class67.field1690[class70.field1749] = class39.field1072;
						class67.field1660[class70.field1749] = class89.field2188;
						class67.field1687[class70.field1749] = var1.field1976;
						class67.field1670[class70.field1749] = var1.field1997;
						class67.field1659[class70.field1749] = var1.field1952;
						class67.field1672[class70.field1749] = var1.field1964;
						class70.field1749++;
					}
				}
				if (class82.field2063 < var1.field2013) {
					method523(var1.field1991 + 15, var1);
					if (class39.field1072 > -1) {
						int var6 = var1.field2004 * 30 / var1.field1975;
						if (var6 > 30) {
							var6 = 30;
						}
						class111.method913(class39.field1072 - 15, class89.field2188 + -3, var6, 5, 65280);
						class111.method913(class39.field1072 + var6 - 15, class89.field2188 + -3, 30 - var6, 5, 16711680);
					}
				}
				for (int var7 = 0; var7 < 4; var7++) {
					if (class82.field2063 < var1.field2010[var7]) {
						method523(var1.field1991 / 2, var1);
						if (class39.field1072 > -1) {
							if (var7 == 1) {
								class89.field2188 -= 20;
							}
							if (var7 == 2) {
								class39.field1072 -= 15;
								class89.field2188 -= 10;
							}
							if (var7 == 3) {
								class39.field1072 += 15;
								class89.field2188 -= 10;
							}
							field1231[var1.field1960[var7]].method551(class39.field1072 - 12, class89.field2188 + -12);
							field2892.method209(method502(var1.field1961[var7]), class39.field1072, class89.field2188 + 4, 0);
							field2892.method209(method502(var1.field1961[var7]), class39.field1072 - 1, class89.field2188 + 3, 16777215);
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < class70.field1749; var8++) {
			int var9 = class67.field1690[var8];
			int var10 = class67.field1660[var8];
			int var11 = class67.field1655[var8];
			int var12 = class67.field1663[var8];
			boolean var13 = true;
			while (var13) {
				var13 = false;
				for (int var14 = 0; var14 < var8; var14++) {
					if (class67.field1660[var14] - class67.field1663[var14] < var10 + 2 && var10 - var12 < class67.field1660[var14] + 2 && var9 - var11 < class67.field1690[var14] + class67.field1655[var14] && var9 + var11 > class67.field1690[var14] + -class67.field1655[var14] && var10 > class67.field1660[var14] - class67.field1663[var14]) {
						var13 = true;
						var10 = class67.field1660[var14] - class67.field1663[var14];
					}
				}
			}
			class39.field1072 = class67.field1690[var8];
			class89.field2188 = class67.field1660[var8] = var10;
			class1 var15 = class67.field1672[var8];
			if (class16.field527 == 0) {
				int var16 = 16776960;
				if (class67.field1687[var8] < 6) {
					var16 = class57.field1458[class67.field1687[var8]];
				}
				if (class67.field1687[var8] == 6) {
					var16 = class97.field2399 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (class67.field1687[var8] == 7) {
					var16 = class97.field2399 % 20 < 10 ? 255 : 65535;
				}
				if (class67.field1687[var8] == 8) {
					var16 = class97.field2399 % 20 >= 10 ? 8454016 : 45056;
				}
				if (class67.field1687[var8] == 9) {
					int var17 = 150 - class67.field1659[var8];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}
				if (class67.field1687[var8] == 10) {
					int var18 = 150 - class67.field1659[var8];
					if (var18 < 50) {
						var16 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var16 = 16711935 + 16384000 - var18 * 327680;
					} else if (var18 < 150) {
						var16 = (var18 - 100) * 327680 + 255 + 500 - var18 * 5;
					}
				}
				if (class67.field1687[var8] == 11) {
					int var19 = 150 - class67.field1659[var8];
					if (var19 < 50) {
						var16 = 16777215 - var19 * 327685;
					} else if (var19 < 100) {
						var16 = (var19 - 50) * 327685 + 65280;
					} else if (var19 < 150) {
						var16 = 16777215 - (var19 - 100) * 327680;
					}
				}
				if (class67.field1670[var8] == 0) {
					field2902.method209(var15, class39.field1072, class89.field2188 + 1, 0);
					field2902.method209(var15, class39.field1072, class89.field2188, var16);
				}
				if (class67.field1670[var8] == 1) {
					field2902.method196(var15, class39.field1072, class89.field2188 + 1, 0, class97.field2399);
					field2902.method196(var15, class39.field1072, class89.field2188, var16, class97.field2399);
				}
				if (class67.field1670[var8] == 2) {
					field2902.method198(var15, class39.field1072, class89.field2188 + 1, 0, class97.field2399);
					field2902.method198(var15, class39.field1072, class89.field2188, var16, class97.field2399);
				}
				if (class67.field1670[var8] == 3) {
					field2902.method201(var15, class39.field1072, class89.field2188 + 1, 0, class97.field2399, 150 - class67.field1659[var8]);
					field2902.method201(var15, class39.field1072, class89.field2188, var16, class97.field2399, 150 - class67.field1659[var8]);
				}
				if (class67.field1670[var8] == 4) {
					int var20 = field2902.method208(var15);
					int var21 = (150 - class67.field1659[var8]) * (var20 + 100) / 150;
					class111.method912(class39.field1072 - 50, 0, class39.field1072 + 50, 334);
					field2902.method213(var15, class39.field1072 + 50 - var21, class89.field2188 + 1, 0);
					field2902.method213(var15, class39.field1072 + 50 - var21, class89.field2188, var16);
					class111.method919();
				}
				if (class67.field1670[var8] == 5) {
					int var22 = 0;
					int var23 = 150 - class67.field1659[var8];
					class111.method912(0, class89.field2188 - field2902.field350 - 1, 512, class89.field2188 + 5);
					if (var23 < 25) {
						var22 = var23 - 25;
					} else if (var23 > 125) {
						var22 = var23 - 125;
					}
					field2902.method209(var15, class39.field1072, class89.field2188 + var22 + 1, 0);
					field2902.method209(var15, class39.field1072, class89.field2188 + var22, var16);
					class111.method919();
				}
			} else {
				field2902.method209(var15, class39.field1072, class89.field2188 + 1, 0);
				field2902.method209(var15, class39.field1072, class89.field2188, 16776960);
			}
		}
	}

	@ObfuscatedName("fd.a(IIIIIIB)I")
	public static int method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			int var7 = arg3;
			arg3 = arg1;
			arg1 = var7;
		}
		if (var6 == 0) {
			return arg0;
		} else if (var6 == 1) {
			return 7 + 1 - arg3 - arg2;
		} else if (var6 == 2) {
			return 7 + 1 - arg0 - arg1;
		} else {
			return arg2;
		}
	}

	@ObfuscatedName("fe.n(I)V")
	public static void method411() {
		field967 = null;
		class36.field977 = null;
		class36.field971 = null;
		class36.field964 = null;
		class36.field955 = null;
		class36.field962 = null;
		class36.field957 = null;
		class36.field976 = null;
	}

	@ObfuscatedName("j.a(ILbd;I)Le;")
	public static class25 method533(class11 arg0, int arg1) {
		return method148(arg0, arg1) ? method467() : null;
	}

	@ObfuscatedName("ua.a(I)V")
	public static void method986() {
		field1167.method1054();
		field1366.method329(0, 0);
		field1096 = class27.method362(field1096);
	}

	@ObfuscatedName("ra.b(I)V")
	public static void method871() {
		class103.field2609 = null;
		class103.field2602 = null;
		class103.field2598 = null;
		class103.field2612 = null;
		class103.field2603 = null;
		class103.field2610 = null;
		field2600 = null;
		class103.field2596 = null;
		field2606 = null;
		field2608 = null;
		class103.field2601 = null;
		class103.field2611 = null;
	}

	@ObfuscatedName("de.a(B)V")
	public static void method320() {
		while (true) {
			class92 var0 = class62.field1547;
			class57 var1;
			synchronized (class62.field1547) {
				var1 = (class57) class95.field2371.method813();
			}
			if (var1 == null) {
				return;
			}
			var1.field1456.method978(false, var1.field1454, (int) var1.field2073, var1.field1469);
		}
	}

	@ObfuscatedName("ga.d(I)V")
	public static void method421() {
		class38.field1031 = null;
		class38.field1034 = null;
		class38.field1021 = null;
		class38.field1019 = null;
		class38.field1041 = null;
		class38.field1036 = null;
		class38.field1020 = null;
		class38.field1024 = null;
		class38.field1043 = null;
		class38.field1037 = null;
		class38.field1044 = null;
		class38.field1040 = null;
		class38.field1046 = null;
		class38.field1011 = null;
		class38.field1030 = null;
		class38.field1038 = null;
		class38.field1018 = null;
		class38.field1017 = null;
		class38.field1022 = null;
		field1028 = null;
	}

	@ObfuscatedName("qa.g(I)V")
	public static void method837() {
		for (int var0 = 0; var0 < class80.field2027; var0++) {
			int var1 = class50.field1348[var0];
			class2 var2 = class80.field2030[var1];
			int var3 = class15.field488.method144();
			if ((var3 & 0x2) != 0) {
				var3 += class15.field488.method144() << 8;
			}
			method102(var2, var3, var1);
		}
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1029() {
		if (field311 == null) {
			return;
		}
		method475();
		if (class62.field1548 > 0) {
			field311.method304(256);
			class62.field1548 = 0;
		}
		field311.method303();
		field311 = null;
	}

	@ObfuscatedName("ib.a(B)V")
	public static void method520() {
		field1347 = null;
		class50.field1353 = null;
		class50.field1348 = null;
		class50.field1350 = null;
		class50.field1351 = null;
		class50.field1345 = null;
	}

	@ObfuscatedName("ac.a(Laa;BII)V")
	public static void method102(class2 arg0, int arg1, int arg2) {
		if ((arg1 & 0x100) != 0) {
			int var3 = class15.field488.method156();
			int var4 = class15.field488.method152();
			arg0.method727(var4, class82.field2063, var3);
			arg0.field2013 = class82.field2063 + 300;
			arg0.field2004 = class15.field488.method156();
			arg0.field1975 = class15.field488.method152();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.field2022 = class15.field488.method145();
			arg0.field1974 = class15.field488.method166();
		}
		if ((arg1 & 0x1) != 0) {
			int var5 = class15.field488.method166();
			if (var5 == 65535) {
				var5 = -1;
			}
			int var6 = class15.field488.method147();
			method450(var5, var6, arg0);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.field2011 = class15.field488.method137();
			if (arg0.field2011 == 65535) {
				arg0.field2011 = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			int var7 = class15.field488.method144();
			int var8 = class15.field488.method152();
			arg0.method727(var8, class82.field2063, var7);
			arg0.field2013 = class82.field2063 + 300;
			arg0.field2004 = class15.field488.method152();
			arg0.field1975 = class15.field488.method152();
		}
		if ((arg1 & 0x400) != 0) {
			arg0.field1999 = class15.field488.method156();
			arg0.field1955 = class15.field488.method156();
			arg0.field1973 = class15.field488.method144();
			arg0.field2001 = class15.field488.method144();
			arg0.field1986 = class15.field488.method137() + class82.field2063;
			arg0.field1981 = class15.field488.method180() + class82.field2063;
			arg0.field1947 = class15.field488.method152();
			arg0.method732();
		}
		if ((arg1 & 0x8) != 0) {
			int var9 = class15.field488.method145();
			int var10 = class15.field488.method152();
			int var11 = class15.field488.method147();
			int var12 = class15.field488.field267;
			if (arg0.field86 != null && arg0.field90 != null) {
				long var13 = arg0.field86.method9();
				boolean var15 = false;
				if (var10 <= 1) {
					for (int var16 = 0; var16 < class85.field2146; var16++) {
						if (class106.field2683[var16] == var13) {
							var15 = true;
							break;
						}
					}
				}
				if (!var15 && class6.field233 == 0) {
					class117.field2917.field267 = 0;
					class15.field488.method138(class117.field2917.field284, var11);
					class117.field2917.field267 = 0;
					class1 var17 = method893(class117.field2917).method4();
					arg0.field1964 = var17.method40();
					arg0.field1952 = 150;
					arg0.field1997 = var9 & 0xFF;
					arg0.field1976 = var9 >> 8;
					if (var10 == 2 || var10 == 3) {
						method758(1, var17, method956(new class1[] { class100.field2535, arg0.field86 }));
					} else if (var10 == 1) {
						method758(1, var17, method956(new class1[] { class103.field2612, arg0.field86 }));
					} else {
						method758(2, var17, arg0.field86);
					}
				}
			}
			class15.field488.field267 = var11 + var12;
		}
		if ((arg1 & 0x20) != 0) {
			int var18 = class15.field488.method144();
			byte[] var19 = new byte[var18];
			class8 var20 = new class8(var19);
			class15.field488.method173(var19, var18);
			class45.field1176[arg2] = var20;
			arg0.method43(var20);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.field1965 = class15.field488.method166();
			int var21 = class15.field488.method146();
			arg0.field2003 = 0;
			arg0.field1967 = (var21 & 0xFFFF) + class82.field2063;
			if (arg0.field1965 == 65535) {
				arg0.field1965 = -1;
			}
			arg0.field2014 = 0;
			arg0.field1984 = var21 >> 16;
			if (arg0.field1967 > class82.field2063) {
				arg0.field2014 = -1;
			}
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		arg0.field1964 = class15.field488.method140();
		if (arg0.field1964.method6(0) == 126) {
			arg0.field1964 = arg0.field1964.method1(1);
			method758(2, arg0.field1964, arg0.field86);
		} else if (field2621 == arg0) {
			method758(2, arg0.field1964, arg0.field86);
		}
		arg0.field1952 = 150;
		arg0.field1976 = 0;
		arg0.field1997 = 0;
	}

	@ObfuscatedName("ha.a([BBLsa;I)V")
	public static void method464(byte[] arg0, class109 arg1, int arg2) {
		class57 var3 = new class57();
		var3.field2073 = arg2;
		var3.field1454 = arg0;
		var3.field1464 = 0;
		var3.field1469 = arg1;
		class92 var4 = class62.field1547;
		synchronized (class62.field1547) {
			class62.field1547.method804(var3);
		}
		method500();
	}

	@ObfuscatedName("l.a(B)V")
	public static void method633() {
		int var0 = class15.field488.method412(8);
		if (class118.field2939 > var0) {
			for (int var1 = var0; var1 < class118.field2939; var1++) {
				class11.field375[class31.field841++] = class112.field2758[var1];
			}
		}
		if (var0 > class118.field2939) {
			throw new RuntimeException("gppov1");
		}
		class118.field2939 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = class112.field2758[var2];
			class2 var4 = class80.field2030[var3];
			int var5 = class15.field488.method412(1);
			if (var5 == 0) {
				class112.field2758[class118.field2939++] = var3;
				var4.field2008 = class82.field2063;
			} else {
				int var6 = class15.field488.method412(2);
				if (var6 == 0) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = class82.field2063;
					class50.field1348[class80.field2027++] = var3;
				} else if (var6 == 1) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = class82.field2063;
					int var7 = class15.field488.method412(3);
					var4.method725(var7, false);
					int var8 = class15.field488.method412(1);
					if (var8 == 1) {
						class50.field1348[class80.field2027++] = var3;
					}
				} else if (var6 == 2) {
					class112.field2758[class118.field2939++] = var3;
					var4.field2008 = class82.field2063;
					int var9 = class15.field488.method412(3);
					var4.method725(var9, true);
					int var10 = class15.field488.method412(3);
					var4.method725(var10, true);
					int var11 = class15.field488.method412(1);
					if (var11 == 1) {
						class50.field1348[class80.field2027++] = var3;
					}
				} else if (var6 == 3) {
					class11.field375[class31.field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("td.a(Z)V")
	public static void method967() {
		if (field217 != null) {
			field217.method256();
			field217 = null;
		}
	}

	@ObfuscatedName("client.a(IIIIIIII[Lqd;Z)Z")
	public static boolean method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class100[] arg8) {
		class111.method912(arg2, arg1, arg6, arg5);
		boolean var9 = true;
		for (int var10 = 0; var10 < arg8.length; var10++) {
			class100 var11 = arg8[var10];
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
					class100 var15 = method1009(var11);
					int[] var16 = method325(var15);
					int[] var17 = method325(var11);
					int var18 = var17[1] + class102.field2568 - var16[1] - class97.field2392;
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
				if (!var11.field2442 || class111.field2753 >= var12 && class111.field2751 >= var13 && class111.field2752 <= var11.field2498 + var12 && var13 + var11.field2449 >= class111.field2748) {
					if (var11.field2489 == 0) {
						if (var11.field2556 && !method631(arg0, var10)) {
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
						class111.method912(arg2, arg1, arg6, arg5);
						if (var11.field2449 < var11.field2526) {
							method601(var11.field2537, var11.field2526, var11.field2498 + var12, var11.field2449, var13);
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
										if (class111.field2752 - 32 < var23 && var23 < class111.field2753 && class111.field2748 - 32 < var24 && class111.field2751 > var24 || class32.field857 != 0 && class113.field2776 == var20) {
											int var29 = 0;
											if (class14.field475 == 1 && field2281 == var20 && field1075 == var11.field2495) {
												var29 = 16777215;
											}
											class58 var30 = method1007(var11.field2516[var20], var27, var29);
											if (var30 == null) {
												var9 = false;
											} else {
												if (class32.field857 != 0 && class113.field2776 == var20 && class98.field2410 == var11.field2495) {
													var28 = class102.field2568 - class115.field2829;
													var26 = class24.field741 - class128.field3143;
													if (var26 < 5 && var26 > -5) {
														var26 = 0;
													}
													if (var28 < 5 && var28 > -5) {
														var28 = 0;
													}
													if (class8.field298 < 5) {
														var28 = 0;
														var26 = 0;
													}
													var30.method558(var23 + var26, var24 + var28, 128);
													if (arg4 != -1) {
														class100 var31 = arg8[arg4];
														if (var24 + var28 < class111.field2748 && var31.field2537 > 0) {
															int var32 = (class111.field2748 - var24 - var28) * class9.field321 / 3;
															if (class9.field321 * 10 < var32) {
																var32 = class9.field321 * 10;
															}
															if (var32 > var31.field2537) {
																var32 = var31.field2537;
															}
															var31.field2537 -= var32;
															class115.field2829 += var32;
														}
														if (class111.field2751 < var24 + var28 + 32 && var31.field2537 < var31.field2526 - var31.field2449) {
															int var33 = (var24 + var28 + 32 - class111.field2751) * class9.field321 / 3;
															if (class9.field321 * 10 < var33) {
																var33 = class9.field321 * 10;
															}
															if (var31.field2526 - var31.field2537 - var31.field2449 < var33) {
																var33 = var31.field2526 - var31.field2449 - var31.field2537;
															}
															class115.field2829 -= var33;
															var31.field2537 += var33;
														}
													}
												} else if (class19.field656 != 0 && class105.field2649 == var20 && class67.field1679 == var11.field2495) {
													var30.method558(var23, var24, 128);
												} else {
													var30.method551(var23, var24);
												}
												if (var30.field1479 == 33 || var11.field2516[var20] != 1) {
													int var34 = var11.field2516[var20];
													field2892.method213(method862(var34), var23 + var26 + 1, var24 + 10 - -var28, 0);
													field2892.method213(method862(var34), var23 + var26, var24 - -9 + var28, 16776960);
												}
											}
										}
									} else if (var11.field2510 != null && var20 < 20) {
										class58 var25 = var11.method852(var20);
										if (var25 != null) {
											var25.method551(var23, var24);
										} else if (class127.field3116) {
											var9 = false;
										}
									}
									var20++;
								}
							}
						} else if (var11.field2489 == 3) {
							int var35;
							if (method947(var11)) {
								var35 = var11.field2532;
								if (method631(arg0, var10) && var11.field2469 != 0) {
									var35 = var11.field2469;
								}
							} else {
								var35 = var11.field2453;
								if (method631(arg0, var10) && var11.field2525 != 0) {
									var35 = var11.field2525;
								}
							}
							if (var14 == 0) {
								if (var11.field2451) {
									class111.method913(var12, var13, var11.field2498, var11.field2449, var35);
								} else {
									class111.method922(var12, var13, var11.field2498, var11.field2449, var35);
								}
							} else if (var11.field2451) {
								class111.method921(var12, var13, var11.field2498, var11.field2449, var35, 256 - (var14 & 0xFF));
							} else {
								class111.method911(var12, var13, var11.field2498, var11.field2449, var35, 256 - (var14 & 0xFF));
							}
						} else if (var11.field2489 == 4) {
							class10 var36 = var11.method861();
							if (var36 != null) {
								class1 var37 = var11.field2474;
								int var38;
								if (method947(var11)) {
									var38 = var11.field2532;
									if (method631(arg0, var10) && var11.field2469 != 0) {
										var38 = var11.field2469;
									}
									if (var11.field2446.method10() > 0) {
										var37 = var11.field2446;
									}
								} else {
									var38 = var11.field2453;
									if (method631(arg0, var10) && var11.field2525 != 0) {
										var38 = var11.field2525;
									}
								}
								if (var11.field2442 && var11.field2524 != -1) {
									class115 var39 = method760(var11.field2524);
									var37 = var39.field2827;
									if (var37 == null) {
										var37 = class64.field1631;
									}
									if (var39.field2826 == 1 || var11.field2540 != 1) {
										var37 = method956(new class1[] { var37, class66.field1649, method803(var11.field2540) });
									}
								}
								if (var11.field2520 == 6 && class120.field2998 == var11.field2495) {
									var38 = var11.field2453;
									var37 = class36.field957;
								}
								if (field2749 == 479) {
									if (var38 == 16776960) {
										var38 = 255;
									}
									if (var38 == 49152) {
										var38 = 16777215;
									}
								}
								class1 var40 = method386(var11, var37);
								var36.method195(var40, var12, var13, var11.field2498, var11.field2449, var38, var11.field2471, var11.field2539, var11.field2521, var11.field2538);
							} else if (class127.field3116) {
								var9 = false;
							}
						} else if (var11.field2489 == 5) {
							if (var11.field2442) {
								int var42 = 0;
								int var43 = 0;
								class58 var44;
								if (var11.field2524 == -1) {
									var44 = var11.method857(false);
								} else {
									var44 = method1007(var11.field2540, var11.field2524, 0);
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
										class111.method918(var48);
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
										class111.method912(var49, var50, var51, var52);
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
										class111.method914(var48);
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
								} else if (class127.field3116) {
									var9 = false;
								}
								if (var11.field2524 != -1) {
									if (var11.field2540 != 1 || var42 == 33) {
										field2892.method213(method502(var11.field2540), var12 + 1, var13 + 10, 0);
										field2892.method213(method502(var11.field2540), var12, var13 + 9, 16776960);
									}
									var44.field1479 = var42;
									var44.field1477 = var43;
								}
							} else {
								class58 var41 = var11.method857(method947(var11));
								if (var41 != null) {
									var41.method551(var12, var13);
								} else if (class127.field3116) {
									var9 = false;
								}
							}
						} else if (var11.field2489 == 6) {
							boolean var57 = method947(var11);
							int var58;
							if (var57) {
								var58 = var11.field2459;
							} else {
								var58 = var11.field2465;
							}
							class91 var59;
							if (var11.field2493 == 5) {
								if (var11.field2479 == 0) {
									var59 = class92.field2302.method637(null, null, -1, -1);
								} else {
									var59 = field2621.method41();
								}
							} else if (var58 == -1) {
								var59 = var11.method860(null, -1, var57, field2621.field90);
								if (var59 == null && class127.field3116) {
									var9 = false;
								}
							} else {
								class47 var60 = method103(var58);
								var59 = var11.method860(var60, var11.field2460, var57, field2621.field90);
								if (var59 == null && class127.field3116) {
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
								class115 var67 = method760(var11.field2524);
								if (var67 != null) {
									class115 var68 = var67.method944(var11.field2540);
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
							class27.method364(var11.field2498 / 2 + var12, var11.field2449 / 2 + var13);
							int var69 = class27.field775[var61] * var66 >> 16;
							int var70 = class27.field778[var61] * var66 >> 16;
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
							class27.method356();
						} else {
							if (var11.field2489 == 7) {
								class10 var71 = var11.method861();
								if (var71 == null) {
									if (class127.field3116) {
										var9 = false;
									}
									continue;
								}
								int var72 = 0;
								for (int var73 = 0; var73 < var11.field2449; var73++) {
									for (int var74 = 0; var74 < var11.field2498; var74++) {
										if (var11.field2491[var72] > 0) {
											class115 var75 = method760(var11.field2491[var72] - 1);
											class1 var76 = var75.field2827;
											if (var76 == null) {
												var76 = class64.field1631;
											}
											if (var75.field2826 == 1 || var11.field2516[var72] != 1) {
												var76 = method956(new class1[] { var76, class66.field1649, method803(var11.field2516[var72]) });
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
							if (var11.field2489 == 8 && method720(arg0, var10) && class106.field2673 == class1.field57) {
								int var79 = 0;
								int var80 = 0;
								class10 var81 = field2684;
								class1 var82 = var11.field2474;
								class1 var83 = method386(var11, var82);
								while (var83.method10() > 0) {
									int var84 = var83.method11(class67.field1661);
									class1 var85;
									if (var84 == -1) {
										var85 = var83;
										var83 = class132.field3234;
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
								class111.method913(var88, var87, var79, var80, 16777120);
								class111.method922(var88, var87, var79, var80, 0);
								class1 var89 = var11.field2474;
								int var90 = var87 + var81.field350 + 2;
								class1 var91 = method386(var11, var89);
								while (var91.method10() > 0) {
									int var92 = var91.method11(class67.field1661);
									class1 var93;
									if (var92 == -1) {
										var93 = var91;
										var91 = class132.field3234;
									} else {
										var93 = var91.method19(0, var92);
										var91 = var91.method1(var92 + 2);
									}
									var81.method206(var93, var88 + 3, var90, 0, false);
									var90 += var81.field350 + 1;
								}
							}
							if (var11.field2489 == 9) {
								class111.method923(var12, var13, var11.field2498 + var12, var11.field2449 + var13, var11.field2453);
							}
						}
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("i.a(Z)V")
	public static void method496() {
		field1255 = null;
		class48.field1259 = null;
		class48.field1264 = null;
		class48.field1269 = null;
		class48.field1275 = null;
	}

	@ObfuscatedName("ec.f(I)V")
	public static void method370() {
		class28.field790 = null;
		field797 = null;
		class28.field796 = null;
		class28.field782 = null;
		field800 = null;
		field784 = null;
		class28.field798 = null;
		class28.field805 = null;
		class28.field793 = null;
		class28.field810 = null;
		class28.field789 = null;
		class28.field785 = null;
		class28.field802 = null;
		class28.field795 = null;
		class28.field791 = null;
	}

	@ObfuscatedName("r.a(BI)Lh;")
	public static class42 method864(int arg0) {
		class42 var1 = (class42) class39.field1060.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2799.method217(arg0, 9);
		class42 var3 = new class42();
		var3.field1137 = arg0;
		if (var2 != null) {
			var3.method453(new class8(var2));
		}
		var3.method459();
		class39.field1060.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("mb.a(II)Lfd;")
	public static class35 method686(int arg0) {
		class35 var1 = (class35) class112.field2755.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1555.method217(arg0, 14);
		class35 var3 = new class35();
		if (var2 != null) {
			var3.method402(new class8(var2));
		}
		class112.field2755.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("qc.a(I)V")
	public static void method849() {
		class99.field2436 = null;
		class99.field2428 = null;
		field2435 = null;
		class99.field2438 = null;
		class99.field2432 = null;
		class99.field2431 = null;
		class99.field2429 = null;
		class99.field2426 = null;
		class99.field2439 = null;
		field2433 = null;
	}

	@ObfuscatedName("rc.a(BILbd;I)[Ljd;")
	public static class58[] method881(int arg0, class11 arg1, int arg2) {
		return method885(arg2, arg0, arg1) ? method998() : null;
	}

	@ObfuscatedName("t.a(ZLnb;)V")
	public static void method937(class80 arg0) {
		arg0.field1979 = false;
		if (arg0.field1951 != -1) {
			class47 var1 = method103(arg0.field1951);
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
		if (arg0.field1965 != -1 && arg0.field1967 <= class82.field2063) {
			if (arg0.field2014 < 0) {
				arg0.field2014 = 0;
			}
			int var2 = method713(arg0.field1965).field786;
			if (var2 == -1) {
				arg0.field1965 = -1;
			} else {
				class47 var3 = method103(var2);
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
			class47 var4 = method103(arg0.field2015);
			if (var4.field1227 == 1 && arg0.field1968 > 0 && arg0.field1986 <= class82.field2063 && arg0.field1981 < class82.field2063) {
				arg0.field1996 = 1;
				return;
			}
		}
		if (arg0.field2015 != -1 && arg0.field1996 == 0) {
			class47 var5 = method103(arg0.field2015);
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

	@ObfuscatedName("bb.a(B)V")
	public static void method187() {
		class9.field318 = null;
		class9.field326 = null;
		class9.field324 = null;
		class9.field328 = null;
		class9.field313 = null;
		field311 = null;
		class9.field325 = null;
		class9.field315 = null;
		class9.field332 = null;
		field320 = null;
	}

	@ObfuscatedName("na.a(Lbd;I)V")
	public static void method723(class11 arg0) {
		field2018 = arg0;
	}

	@ObfuscatedName("be.b(I)V")
	public static void method243() {
		class12.field418 = null;
		class12.field431 = null;
		class12.field414 = null;
	}

	@ObfuscatedName("ma.a(B[BII)Z")
	public static boolean method683(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		class8 var4 = new class8(arg0);
		int var5 = -1;
		label52: while (true) {
			int var6 = var4.method178();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				while (!var8) {
					int var10 = var4.method178();
					if (var10 == 0) {
						continue label52;
					}
					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var4.method144() >> 2;
					int var13 = var7 >> 6 & 0x3F;
					int var14 = var13 + arg1;
					int var15 = var11 + arg2;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class49 var16 = method389(var5);
						if (var12 != 22 || !class93.field2332 || var16.field1329 != 0 || var16.field1330) {
							var8 = true;
							if (!var16.method517()) {
								var3 = false;
								class95.field2358++;
							}
						}
					}
				}
				int var9 = var4.method178();
				if (var9 == 0) {
					break;
				}
				var4.method144();
			}
		}
	}

	@ObfuscatedName("hb.d(I)V")
	public static void method469() {
		class107.field2694 = new class92();
	}

	@ObfuscatedName("oa.a(III)I")
	public static int method747(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 ^ var2 << 13;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("pe.f(I)V")
	public static void method823() {
		class95.field2362 = null;
		class95.field2382 = null;
		class95.field2378 = null;
		class95.field2355 = null;
		field2376 = null;
		field2357 = null;
		class95.field2383 = null;
		class95.field2381 = null;
		class95.field2359 = null;
		class95.field2354 = null;
		class95.field2371 = null;
		class95.field2369 = null;
		class95.field2360 = null;
	}

	@ObfuscatedName("wc.a(II)Z")
	public static boolean method1052(int arg0) {
		if (field3296[arg0]) {
			return true;
		} else if (field924.method231(arg0)) {
			int var1 = field924.method235(arg0);
			if (var1 == 0) {
				field3296[arg0] = true;
				return true;
			}
			if (field2922[arg0] == null) {
				field2922[arg0] = new class100[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (field2922[arg0][var2] == null) {
					byte[] var3 = field924.method217(var2, arg0);
					if (var3 != null) {
						field2922[arg0][var2] = new class100();
						field2922[arg0][var2].field2495 = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							field2922[arg0][var2].method858(new class8(var3));
						} else {
							field2922[arg0][var2].method851(new class8(var3));
						}
					}
				}
			}
			field3296[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cd.b(I)V")
	public static void method275() {
		if (class5.field216 == 0) {
			return;
		}
		class10 var0 = field2684;
		int var1 = 0;
		if (class114.field2813 != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (class80.field2034[var2] != null) {
				class1 var3 = class128.field3130[var2];
				byte var4 = 0;
				int var5 = class132.field3236[var2];
				if (var3 != null && var3.method26(class103.field2612)) {
					var3 = var3.method1(5);
					var4 = 1;
				}
				if (var3 != null && var3.method26(class100.field2535)) {
					var3 = var3.method1(5);
					var4 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var3))) {
					int var6 = 329 - var1 * 13;
					var1++;
					var0.method213(class46.field1215, 4, var6, 0);
					var0.method213(class46.field1215, 4, var6 - 1, 65535);
					int var7 = var0.method208(class46.field1215) + 4;
					int var8 = var7 + var0.method212(32);
					if (var4 == 1) {
						field2614[0].method329(var8, var6 - 12);
						var8 += 14;
					}
					if (var4 == 2) {
						field2614[1].method329(var8, var6 - 12);
						var8 += 14;
					}
					var0.method213(method956(new class1[] { var3, class39.field1065, class80.field2034[var2] }), var8, var6, 0);
					var0.method213(method956(new class1[] { var3, class39.field1065, class80.field2034[var2] }), var8, var6 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 5 && class6.field236 < 2) {
					int var9 = 329 - var1 * 13;
					var1++;
					var0.method213(class80.field2034[var2], 4, var9, 0);
					var0.method213(class80.field2034[var2], 4, var9 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 6 && class6.field236 < 2) {
					int var10 = 329 - var1 * 13;
					var1++;
					var0.method213(method956(new class1[] { class16.field521, class98.field2406, var3, class39.field1065, class80.field2034[var2] }), 4, var10, 0);
					var0.method213(method956(new class1[] { class16.field521, class98.field2406, var3, class39.field1065, class80.field2034[var2] }), 4, var10 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("j.c(B)V")
	public static void method534() {
		class54.field1430 = null;
		class54.field1440 = null;
		field1435 = null;
		class54.field1439 = null;
		class54.field1434 = null;
		class54.field1437 = null;
		field1438 = null;
		class54.field1412 = null;
		class54.field1431 = null;
		class54.field1429 = null;
		class54.field1432 = null;
		class54.field1436 = null;
	}

	@ObfuscatedName("ad.a(Z)Z")
	public static boolean method111() {
		if (field1450 == null) {
			return false;
		}
		try {
			int var0 = field1450.method1020();
			if (var0 == 0) {
				return false;
			}
			if (class112.field2761 == -1) {
				field1450.method1014(0, 1, class15.field488.field284);
				class15.field488.field267 = 0;
				var0--;
				class112.field2761 = class15.field488.method409();
				class100.field2547 = class50.field1353[class112.field2761];
			}
			if (class100.field2547 == -1) {
				if (var0 <= 0) {
					return false;
				}
				field1450.method1014(0, 1, class15.field488.field284);
				class100.field2547 = class15.field488.field284[0] & 0xFF;
				var0--;
			}
			if (class100.field2547 == -2) {
				if (var0 <= 1) {
					return false;
				}
				var0 -= 2;
				field1450.method1014(0, 2, class15.field488.field284);
				class15.field488.field267 = 0;
				class100.field2547 = class15.field488.method145();
			}
			if (class100.field2547 > var0) {
				return false;
			}
			class15.field488.field267 = 0;
			field1450.method1014(0, class100.field2547, class15.field488.field284);
			class99.field2434 = class15.field498;
			class75.field1855 = 0;
			class15.field498 = class1.field36;
			class1.field36 = class112.field2761;
			if (class112.field2761 == 71) {
				long var1 = class15.field488.method174();
				class1 var3 = method893(class15.field488).method4();
				method758(6, var3, method969(var1).method36());
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 156) {
				long var4 = class15.field488.method174();
				int var6 = class15.field488.method145();
				class1 var7 = method969(var4).method36();
				for (int var8 = 0; var8 < class59.field1492; var8++) {
					if (class117.field2929[var8] == var4) {
						if (class73.field1788[var8] != var6) {
							class73.field1788[var8] = var6;
							class39.field1055 = true;
							if (var6 > 0) {
								method758(5, method956(new class1[] { var7, class85.field2126 }), class132.field3234);
							}
							if (var6 == 0) {
								method758(5, method956(new class1[] { var7, class60.field1510 }), class132.field3234);
							}
						}
						var7 = null;
						break;
					}
				}
				boolean var9 = false;
				if (var7 != null && class59.field1492 < 200) {
					class117.field2929[class59.field1492] = var4;
					class119.field2951[class59.field1492] = var7;
					class73.field1788[class59.field1492] = var6;
					class59.field1492++;
					class39.field1055 = true;
				}
				while (!var9) {
					var9 = true;
					for (int var10 = 0; var10 < class59.field1492 - 1; var10++) {
						if (class73.field1788[var10] != class24.field723 && class73.field1788[var10 + 1] == class24.field723 || class73.field1788[var10] == 0 && class73.field1788[var10 + 1] != 0) {
							var9 = false;
							int var11 = class73.field1788[var10];
							class73.field1788[var10] = class73.field1788[var10 + 1];
							class73.field1788[var10 + 1] = var11;
							class1 var12 = class119.field2951[var10];
							class119.field2951[var10] = class119.field2951[var10 + 1];
							class119.field2951[var10 + 1] = var12;
							long var13 = class117.field2929[var10];
							class117.field2929[var10] = class117.field2929[var10 + 1];
							class117.field2929[var10 + 1] = var13;
							class39.field1055 = true;
						}
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 233) {
				class112.field2761 = -1;
				class35.field941 = 0;
				return true;
			}
			if (class112.field2761 == 7) {
				class81.field2043 = false;
				for (int var15 = 0; var15 < 5; var15++) {
					class19.field632[var15] = false;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 23) {
				method524(true);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 222) {
				byte var16 = class15.field488.method168();
				int var17 = class15.field488.method137();
				class8.field304[var17] = var16;
				if (class113.field2803[var17] != var16) {
					class113.field2803[var17] = var16;
					method476(var17);
					class39.field1055 = true;
					if (class98.field2421 != -1) {
						class105.field2637 = true;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 115) {
				boolean var18 = class15.field488.method144() == 1;
				int var19 = class15.field488.method146();
				class100 var20 = method1053(var19);
				var20.field2556 = var18;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 12) {
				class39.field1055 = true;
				int var21 = class15.field488.method167();
				class100 var22 = method1053(var21);
				if (var22.field2442) {
					class100[] var24 = field2922[var21 >> 16];
					for (int var25 = 0; var25 < var24.length; var25++) {
						class100 var26 = var24[var25];
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
				int var27 = class15.field488.method145();
				for (int var28 = 0; var28 < var27; var28++) {
					int var29 = class15.field488.method152();
					if (var29 == 255) {
						var29 = class15.field488.method167();
					}
					int var30 = class15.field488.method137();
					if (var22.field2442) {
						class100[] var31 = field2922[var21 >> 16];
						for (int var32 = 0; var32 < var31.length; var32++) {
							class100 var33 = var31[var32];
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
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 250) {
				int var34 = class15.field488.method166();
				int var35 = class15.field488.method146();
				class100 var36 = method1053(var35);
				var36.field2479 = var34;
				var36.field2493 = 1;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 255) {
				int var37 = class15.field488.method144();
				int var38 = class15.field488.method144();
				int var39 = class15.field488.method144();
				int var40 = class15.field488.method144();
				class19.field632[var37] = true;
				class14.field471[var37] = var38;
				class64.field1599[var37] = var39;
				class113.field2782[var37] = var40;
				class38.field1019[var37] = 0;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 235) {
				class63.field1587 = class15.field488.method144();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 48) {
				class57.field1470 = class15.field488.method144();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 82) {
				class1 var41 = class15.field488.method140();
				if (var41.method38(class47.field1229)) {
					class1 var53 = var41.method19(0, var41.method11(class86.field2165));
					long var54 = var53.method9();
					boolean var56 = false;
					for (int var57 = 0; var57 < class85.field2146; var57++) {
						if (class106.field2683[var57] == var54) {
							var56 = true;
							break;
						}
					}
					if (!var56 && class6.field233 == 0) {
						method758(4, class6.field231, var53);
					}
				} else if (var41.method38(class46.field1191)) {
					class1 var48 = var41.method19(0, var41.method11(class86.field2165));
					long var49 = var48.method9();
					boolean var51 = false;
					for (int var52 = 0; var52 < class85.field2146; var52++) {
						if (class106.field2683[var52] == var49) {
							var51 = true;
							break;
						}
					}
					if (!var51 && class6.field233 == 0) {
						method758(8, class121.field3008, var48);
					}
				} else if (var41.method38(class82.field2085)) {
					class1 var42 = var41.method19(0, var41.method11(class86.field2165));
					long var43 = var42.method9();
					boolean var45 = false;
					for (int var46 = 0; var46 < class85.field2146; var46++) {
						if (class106.field2683[var46] == var43) {
							var45 = true;
							break;
						}
					}
					if (!var45 && class6.field233 == 0) {
						class1 var47 = var41.method19(var41.method11(class86.field2165) + 1, var41.method10() + -9);
						method758(8, var47, var42);
					}
				} else {
					method758(0, var41, class132.field3234);
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 182) {
				int var58 = class15.field488.method145();
				int var59 = class15.field488.method161();
				class100 var60 = method1053(var59);
				class112.field2761 = -1;
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
			if (class112.field2761 == 174) {
				int var61 = class15.field488.method146();
				class100 var62 = method1053(var61);
				if (var62.field2442) {
					class100[] var63 = field2922[var61 >> 16];
					for (int var64 = 0; var64 < var63.length; var64++) {
						class100 var65 = var63[var64];
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
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 130) {
				class74.field1844 = class15.field488.method166();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 129) {
				int var67 = class15.field488.method147();
				int var68 = class15.field488.method152();
				int var69 = class15.field488.method147();
				field75 = var67 >> 1;
				field2621.method729(var69, (var67 & 0x1) == 1, var68);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 181) {
				method847();
				class112.field2761 = -1;
				return false;
			}
			if (class112.field2761 == 24) {
				int var70 = class15.field488.method139();
				int var71 = class15.field488.method167();
				class100 var72 = method1053(var71);
				if (var72.field2465 != var70 || var70 == -1) {
					var72.field2466 = 0;
					var72.field2460 = 0;
					var72.field2465 = var70;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 56) {
				int var73 = class15.field488.method136();
				if (var73 >= 0) {
					method746(var73);
				}
				if (class113.field2800 != var73) {
					method895(class113.field2800);
					class113.field2800 = var73;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 117) {
				int var74 = class15.field488.method145();
				int var75 = class15.field488.method180();
				int var76 = class15.field488.method161();
				class100 var77 = method1053(var76);
				class112.field2761 = -1;
				var77.field2528 = (var74 << 16) + var75;
				return true;
			}
			if (class112.field2761 == 84) {
				int var78 = class15.field488.method145();
				int var79 = class15.field488.method180();
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (class42.field1143 != -1) {
					method895(class42.field1143);
					class42.field1143 = -1;
					method399(30);
				}
				if (class76.field1881 != -1) {
					method895(class76.field1881);
					class76.field1881 = -1;
				}
				if (class132.field3227 != var79) {
					method895(class132.field3227);
					class132.field3227 = var79;
				}
				if (class66.field1648 != var78) {
					method895(class66.field1648);
					class66.field1648 = var78;
				}
				class120.field2998 = -1;
				if (class114.field2811 != 0) {
					class105.field2637 = true;
					class114.field2811 = 0;
				}
				class39.field1055 = true;
				class95.field2364 = true;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 64) {
				field893 = class15.field488.method144();
				field1471 = class15.field488.method152();
				for (int var80 = field1471; var80 < field1471 + 8; var80++) {
					for (int var81 = field893; var81 < field893 + 8; var81++) {
						if (class17.field552[field75][var80][var81] != null) {
							class17.field552[field75][var80][var81] = null;
							method1011(var81, var80);
						}
					}
				}
				for (class22 var82 = (class22) class92.field2284.method802(); var82 != null; var82 = (class22) class92.field2284.method809()) {
					if (var82.field700 >= field1471 && field1471 + 8 > var82.field700 && var82.field699 >= field893 && field893 + 8 > var82.field699 && field75 == var82.field679) {
						var82.field692 = 0;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 223) {
				class1 var83 = class15.field488.method140();
				int var84 = class15.field488.method156();
				int var85 = class15.field488.method144();
				if (var85 >= 1 && var85 <= 5) {
					if (var83.method14(class64.field1631)) {
						var83 = null;
					}
					client.field599[var85 - 1] = var83;
					class24.field735[var85 - 1] = var84 == 0;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 118) {
				int var86 = class15.field488.method145();
				method746(var86);
				if (class66.field1648 != -1) {
					method895(class66.field1648);
					class95.field2364 = true;
					class66.field1648 = -1;
					class39.field1055 = true;
				}
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (class42.field1143 != -1) {
					method895(class42.field1143);
					class42.field1143 = -1;
					method399(30);
				}
				if (class76.field1881 != -1) {
					method895(class76.field1881);
					class76.field1881 = -1;
				}
				if (class132.field3227 != var86) {
					method895(class132.field3227);
					class132.field3227 = var86;
				}
				class120.field2998 = -1;
				if (class114.field2811 != 0) {
					class105.field2637 = true;
					class114.field2811 = 0;
				}
				method1018(class132.field3227);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 18) {
				if (class9.field330 == 12) {
					class39.field1055 = true;
				}
				class119.field2962 = class15.field488.method144();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 253) {
				class81.field2043 = true;
				field1187 = class15.field488.method144();
				field1746 = class15.field488.method144();
				field316 = class15.field488.method145();
				field239 = class15.field488.method144();
				field2918 = class15.field488.method144();
				if (field2918 >= 100) {
					field1200 = field1746 * 128 + 64;
					field709 = field1187 * 128 + 64;
					field1748 = method712(field75, field709, field1200) - field316;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 185) {
				int var87 = class15.field488.method136();
				if (class98.field2421 != var87) {
					method895(class98.field2421);
					class98.field2421 = var87;
				}
				class112.field2761 = -1;
				class105.field2637 = true;
				return true;
			}
			if (class112.field2761 == 195) {
				int var88 = class15.field488.method137();
				int var89 = class15.field488.method145();
				method746(var89);
				if (var88 != -1) {
					method746(var88);
				}
				if (class132.field3227 != -1) {
					method895(class132.field3227);
					class132.field3227 = -1;
				}
				if (class66.field1648 != -1) {
					method895(class66.field1648);
					class66.field1648 = -1;
				}
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class86.field2166 = -1;
				}
				if (class42.field1143 != var89) {
					method895(class42.field1143);
					class42.field1143 = var89;
					method399(35);
				}
				if (class76.field1881 != var89) {
					method895(class76.field1881);
					class76.field1881 = var88;
				}
				class120.field2998 = -1;
				class114.field2811 = 0;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 180) {
				if (class66.field1648 != -1) {
					method895(class66.field1648);
					class39.field1055 = true;
					class95.field2364 = true;
					class66.field1648 = -1;
				}
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class105.field2637 = true;
					class86.field2166 = -1;
				}
				if (class42.field1143 != -1) {
					method895(class42.field1143);
					class42.field1143 = -1;
					method399(30);
				}
				if (class76.field1881 != -1) {
					method895(class76.field1881);
					class76.field1881 = -1;
				}
				if (class132.field3227 != -1) {
					method895(class132.field3227);
					class132.field3227 = -1;
				}
				class112.field2761 = -1;
				class120.field2998 = -1;
				if (class114.field2811 != 0) {
					class105.field2637 = true;
					class114.field2811 = 0;
				}
				return true;
			}
			if (class112.field2761 == 208) {
				int var90 = class15.field488.method137();
				method746(var90);
				if (class66.field1648 != -1) {
					method895(class66.field1648);
					class95.field2364 = true;
					class66.field1648 = -1;
					class39.field1055 = true;
				}
				if (class42.field1143 != -1) {
					method895(class42.field1143);
					class42.field1143 = -1;
					method399(30);
				}
				if (class76.field1881 != -1) {
					method895(class76.field1881);
					class76.field1881 = -1;
				}
				if (class132.field3227 != -1) {
					method895(class132.field3227);
					class132.field3227 = -1;
				}
				if (class86.field2166 != var90) {
					method895(class86.field2166);
					class86.field2166 = var90;
				}
				class105.field2637 = true;
				class112.field2761 = -1;
				class120.field2998 = -1;
				return true;
			}
			if (class112.field2761 == 217) {
				int var91 = class15.field488.method166();
				if (var91 == 65535) {
					var91 = -1;
				}
				method874(var91);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 40) {
				int var92 = class15.field488.method164();
				int var93 = class15.field488.method137();
				if (var93 == 65535) {
					var93 = -1;
				}
				method928(var92, var93);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 254) {
				field893 = class15.field488.method156();
				field1471 = class15.field488.method147();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 88) {
				class103.field2607 = class15.field488.method152();
				if (class9.field330 == class103.field2607) {
					if (class103.field2607 == 3) {
						class9.field330 = 1;
					} else {
						class9.field330 = 3;
					}
					class39.field1055 = true;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 63) {
				field1471 = class15.field488.method147();
				field893 = class15.field488.method156();
				while (class15.field488.field267 < class100.field2547) {
					class112.field2761 = class15.field488.method144();
					method886();
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 196) {
				class75.field1864 = class15.field488.method144();
				class6.field236 = class15.field488.method144();
				class115.field2828 = class15.field488.method144();
				class105.field2637 = true;
				class15.field504 = true;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 116) {
				class114.field2813 = class15.field488.method166() * 30;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 92) {
				method600();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 2) {
				int var94 = class15.field488.method146();
				int var95 = class15.field488.method145();
				class8.field304[var95] = var94;
				if (class113.field2803[var95] != var94) {
					class113.field2803[var95] = var94;
					method476(var95);
					if (class98.field2421 != -1) {
						class105.field2637 = true;
					}
					class39.field1055 = true;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 128) {
				method532();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 131) {
				int var96 = class15.field488.method145();
				int var97 = class15.field488.method144();
				int var98 = class15.field488.method145();
				method887(var96, var97, var98);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 237) {
				int var99 = class15.field488.method145();
				method746(var99);
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class86.field2166 = -1;
					class105.field2637 = true;
				}
				if (class42.field1143 != -1) {
					method895(class42.field1143);
					class42.field1143 = -1;
					method399(30);
				}
				if (class76.field1881 != -1) {
					method895(class76.field1881);
					class76.field1881 = -1;
				}
				if (class132.field3227 != -1) {
					method895(class132.field3227);
					class132.field3227 = -1;
				}
				if (class66.field1648 != var99) {
					method895(class66.field1648);
					class66.field1648 = var99;
				}
				class95.field2364 = true;
				if (class114.field2811 != 0) {
					class105.field2637 = true;
					class114.field2811 = 0;
				}
				class120.field2998 = -1;
				class112.field2761 = -1;
				class39.field1055 = true;
				return true;
			}
			if (class112.field2761 == 234) {
				class81.field2043 = true;
				field1270 = class15.field488.method144();
				field1895 = class15.field488.method144();
				field1940 = class15.field488.method145();
				field2945 = class15.field488.method144();
				field1029 = class15.field488.method144();
				if (field1029 >= 100) {
					int var100 = field1270 * 128 + 64;
					int var101 = field1895 * 128 + 64;
					int var102 = method712(field75, var100, var101) - field1940;
					int var103 = var100 - field709;
					int var104 = var101 - field1200;
					int var105 = var102 - field1748;
					int var106 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104));
					field1400 = (int) (Math.atan2((double) var105, (double) var106) * 325.949D) & 0x7FF;
					field184 = (int) (Math.atan2((double) var103, (double) var104) * -325.949D) & 0x7FF;
					if (field1400 < 128) {
						field1400 = 128;
					}
					if (field1400 > 383) {
						field1400 = 383;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 142) {
				int var107 = class15.field488.method145();
				int var108 = class15.field488.method166();
				int var109 = class15.field488.method145();
				int var110 = class15.field488.method161();
				class100 var111 = method1053(var110);
				class112.field2761 = -1;
				var111.field2463 = var107;
				var111.field2534 = var108;
				var111.field2496 = var109;
				return true;
			}
			if (class112.field2761 == 6) {
				class9.field330 = class15.field488.method144();
				class95.field2364 = true;
				class39.field1055 = true;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 171) {
				if (class9.field330 == 12) {
					class39.field1055 = true;
				}
				class105.field2638 = class15.field488.method139();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 9 || class112.field2761 == 99 || class112.field2761 == 229 || class112.field2761 == 19 || class112.field2761 == 202 || class112.field2761 == 1 || class112.field2761 == 74 || class112.field2761 == 175 || class112.field2761 == 49 || class112.field2761 == 143 || class112.field2761 == 241) {
				method886();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 14) {
				for (int var112 = 0; var112 < field2915; var112++) {
					class97 var113 = method1023(var112);
					if (var113 != null && var113.field2404 == 0) {
						class8.field304[var112] = 0;
						class113.field2803[var112] = 0;
					}
				}
				if (class98.field2421 != -1) {
					class105.field2637 = true;
				}
				class39.field1055 = true;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 160) {
				int var114 = class15.field488.method166();
				int var115 = class15.field488.method161();
				class100 var116 = method1053(var115);
				var116.field2493 = 2;
				class112.field2761 = -1;
				var116.field2479 = var114;
				return true;
			}
			if (class112.field2761 == 132) {
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class86.field2166 = -1;
				}
				class112.field2761 = -1;
				class132.field3210 = class132.field3234;
				class114.field2811 = 1;
				class105.field2637 = true;
				class37.field1001 = false;
				return true;
			}
			if (class112.field2761 == 186) {
				class2.field96 = class15.field488.method144();
				if (class2.field96 == 1) {
					class132.field3212 = class15.field488.method145();
				}
				if (class2.field96 >= 2 && class2.field96 <= 6) {
					if (class2.field96 == 2) {
						class75.field1857 = 64;
						class102.field2572 = 64;
					}
					if (class2.field96 == 3) {
						class75.field1857 = 64;
						class102.field2572 = 0;
					}
					if (class2.field96 == 4) {
						class75.field1857 = 64;
						class102.field2572 = 128;
					}
					if (class2.field96 == 5) {
						class102.field2572 = 64;
						class75.field1857 = 0;
					}
					if (class2.field96 == 6) {
						class102.field2572 = 64;
						class75.field1857 = 128;
					}
					class2.field96 = 2;
					class134.field3304 = class15.field488.method145();
					class6.field226 = class15.field488.method145();
					class42.field1114 = class15.field488.method144();
				}
				if (class2.field96 == 10) {
					class134.field3290 = class15.field488.method145();
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 210) {
				int var117 = class15.field488.method161();
				class100 var118 = method1053(var117);
				var118.field2493 = 3;
				var118.field2479 = field2621.field90.method634();
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 110) {
				int var119 = class15.field488.method161();
				class1 var120 = class15.field488.method140();
				class100 var121 = method1053(var119);
				var121.field2474 = var120;
				if (var119 >> 16 == class97.field2397[class9.field330]) {
					class39.field1055 = true;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 70) {
				class23.field701 = class15.field488.method144();
				class39.field1055 = true;
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 120) {
				int var122 = class15.field488.method145();
				int var123 = class15.field488.method166();
				int var124 = class15.field488.method161();
				if (var123 == 65535) {
					var123 = -1;
				}
				class100 var125 = method1053(var124);
				if (var125.field2442) {
					var125.field2540 = 1;
					var125.field2524 = var123;
				} else if (var123 == -1) {
					class112.field2761 = -1;
					var125.field2493 = 0;
					return true;
				} else {
					class115 var126 = method760(var123);
					var125.field2496 = var126.field2875;
					var125.field2479 = var123;
					var125.field2493 = 4;
					var125.field2534 = var126.field2848 * 100 / var122;
					var125.field2463 = var126.field2861;
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 51) {
				long var127 = class15.field488.method174();
				long var129 = (long) class15.field488.method145();
				long var131 = (long) class15.field488.method164();
				int var133 = class15.field488.method144();
				boolean var134 = false;
				long var135 = (var129 << 32) + var131;
				for (int var137 = 0; var137 < 100; var137++) {
					if (class104.field2618[var137] == var135) {
						var134 = true;
						break;
					}
				}
				if (var133 <= 1) {
					for (int var138 = 0; var138 < class85.field2146; var138++) {
						if (class106.field2683[var138] == var127) {
							var134 = true;
							break;
						}
					}
				}
				if (!var134 && class6.field233 == 0) {
					class104.field2618[class22.field682] = var135;
					class22.field682 = (class22.field682 + 1) % 100;
					class1 var139 = method893(class15.field488).method4();
					if (var133 == 2 || var133 == 3) {
						method758(7, var139, method956(new class1[] { class100.field2535, method969(var127).method36() }));
					} else if (var133 == 1) {
						method758(7, var139, method956(new class1[] { class103.field2612, method969(var127).method36() }));
					} else {
						method758(3, var139, method969(var127).method36());
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 27) {
				for (int var140 = 0; var140 < class80.field2030.length; var140++) {
					if (class80.field2030[var140] != null) {
						class80.field2030[var140].field2015 = -1;
					}
				}
				for (int var141 = 0; var141 < class120.field2992.length; var141++) {
					if (class120.field2992[var141] != null) {
						class120.field2992[var141].field2015 = -1;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 140) {
				int var142 = class15.field488.method145();
				int var143 = class15.field488.method144();
				if (var142 == 65535) {
					var142 = -1;
				}
				if (class97.field2397[var143] != var142) {
					method895(class97.field2397[var143]);
					class97.field2397[var143] = var142;
				}
				class95.field2364 = true;
				class112.field2761 = -1;
				class39.field1055 = true;
				return true;
			}
			if (class112.field2761 == 34) {
				class39.field1055 = true;
				int var144 = class15.field488.method152();
				int var145 = class15.field488.method144();
				int var146 = class15.field488.method146();
				class59.field1483[var145] = var146;
				class24.field724[var145] = var144;
				class17.field549[var145] = 1;
				for (int var147 = 0; var147 < 98; var147++) {
					if (class60.field1514[var147] <= var146) {
						class17.field549[var145] = var147 + 2;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 3) {
				int var148 = class15.field488.method167();
				int var149 = class15.field488.method160();
				int var150 = class15.field488.method160();
				class100 var151 = method1053(var148);
				var151.field2462 = var151.field2455 + var150;
				class112.field2761 = -1;
				var151.field2502 = var151.field2549 + var149;
				return true;
			}
			if (class112.field2761 == 72) {
				for (int var152 = 0; var152 < class113.field2803.length; var152++) {
					if (class8.field304[var152] != class113.field2803[var152]) {
						class113.field2803[var152] = class8.field304[var152];
						method476(var152);
						class39.field1055 = true;
					}
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 240) {
				method460(field1071, class15.field488, class100.field2547);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 58) {
				int var153 = class15.field488.method183();
				field715 = field1071.method655(var153);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 214) {
				class39.field1055 = true;
				int var154 = class15.field488.method167();
				class100 var155 = method1053(var154);
				while (true) {
					while (class100.field2547 > class15.field488.field267) {
						int var156 = class15.field488.method178();
						int var157 = class15.field488.method145();
						int var158 = 0;
						if (var157 != 0) {
							var158 = class15.field488.method144();
							if (var158 == 255) {
								var158 = class15.field488.method167();
							}
						}
						if (var155.field2442) {
							class100[] var159 = field2922[var154 >> 16];
							for (int var160 = 0; var160 < var159.length; var160++) {
								class100 var161 = var159[var160];
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
					class112.field2761 = -1;
					return true;
				}
			}
			if (class112.field2761 == 166) {
				method524(false);
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 231) {
				int var162 = class15.field488.method137();
				int var163 = class15.field488.method161();
				int var164 = var162 >> 10 & 0x1F;
				int var165 = var162 >> 5 & 0x1F;
				class100 var166 = method1053(var163);
				class112.field2761 = -1;
				int var167 = var162 & 0x1F;
				var166.field2453 = (var167 << 3) + (var164 << 19) + (var165 << 11);
				return true;
			}
			if (class112.field2761 == 211) {
				class85.field2146 = class100.field2547 / 8;
				for (int var168 = 0; var168 < class85.field2146; var168++) {
					class106.field2683[var168] = class15.field488.method174();
				}
				class112.field2761 = -1;
				return true;
			}
			if (class112.field2761 == 124) {
				if (class86.field2166 != -1) {
					method895(class86.field2166);
					class86.field2166 = -1;
				}
				class105.field2637 = true;
				class132.field3210 = class132.field3234;
				class114.field2811 = 2;
				class112.field2761 = -1;
				class37.field1001 = false;
				return true;
			}
			method214("T1 - " + class112.field2761 + "," + class15.field498 + "," + class99.field2434 + " - " + class100.field2547, null);
			method847();
		} catch (IOException var172) {
			method960();
		} catch (Exception var173) {
			String var170 = "T2 - " + class112.field2761 + "," + class15.field498 + "," + class99.field2434 + " - " + class100.field2547 + "," + (field2621.field1962[0] + field806) + "," + (field2621.field2009[0] + field1408) + " - ";
			for (int var171 = 0; class100.field2547 > var171 && var171 < 50; var171++) {
				var170 = var170 + class15.field488.field284[var171] + ",";
			}
			method214(var170, var173);
			method847();
		}
		return true;
	}

	@ObfuscatedName("ib.a(I)Z")
	public static boolean method521() {
		return field311 != null;
	}

	@ObfuscatedName("ub.a(Z)V")
	public static void method991() {
		class122.field3051 = null;
		class122.field3046 = null;
		class122.field3045 = null;
		class122.field3043 = null;
		class122.field3035 = null;
		field3049 = null;
		class122.field3044 = null;
		class122.field3054 = null;
		field3053 = null;
	}

	@ObfuscatedName("re.a(I)V")
	public static void method891() {
		method275();
		if (class92.field2295 == 1) {
			field1926[class34.field894 / 100].method551(class119.field2967 - 4 - 8, class16.field523 - 4 + -8);
		}
		if (class92.field2295 == 2) {
			field1926[class34.field894 / 100 + 4].method551(class119.field2967 - 8 - 4, class16.field523 + -4 - 8);
		}
		if (class113.field2800 != -1) {
			method1012(class113.field2800);
			method478(class113.field2800, 334, 4, 512);
		}
		if (class132.field3227 != -1) {
			method1012(class132.field3227);
			method478(class132.field3227, 334, 0, 512);
		}
		method22();
		if (!class6.field224) {
			method757();
			method391();
		} else if (field640 == 0) {
			method483();
		}
		if (class57.field1470 == 1) {
			field2277.method551(472, 296);
		}
		if (class37.field1007) {
			byte var0 = 20;
			int var1 = 16776960;
			if (class105.field2635 < 30 && class93.field2332) {
				var1 = 16711680;
			}
			if (class105.field2635 < 20 && !class93.field2332) {
				var1 = 16711680;
			}
			field2684.method210(method956(new class1[] { class121.field3026, method502(class105.field2635) }), 20, var1);
			int var2 = 16776960;
			int var8 = var0 + 15;
			Runtime var3 = Runtime.getRuntime();
			int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
			if (var4 > 32768 && class93.field2332) {
				var2 = 16711680;
			}
			if (var4 > 65536 && !class93.field2332) {
				var2 = 16711680;
			}
			field2684.method210(method956(new class1[] { class73.field1786, method502(var4), class62.field1562 }), 35, var2);
			var8 += 15;
			if (class79.field1941) {
				field2684.method210(class132.field3211, 50, 16711680);
				var8 += 15;
				class79.field1941 = false;
			}
			if (class11.field410) {
				field2684.method210(class113.field2802, var8, 16711680);
				var8 += 15;
				class11.field410 = false;
			}
			if (class22.field687) {
				field2684.method210(class132.field3213, var8, 16711680);
				class22.field687 = false;
				var8 += 15;
			}
		}
		if (class114.field2813 == 0) {
			return;
		}
		int var5 = class114.field2813 / 50;
		int var6 = var5 / 60;
		int var7 = var5 % 60;
		if (var7 < 10) {
			field2684.method213(method956(new class1[] { class121.field3012, method502(var6), class31.field846, method502(var7) }), 4, 329, 16776960);
		} else {
			field2684.method213(method956(new class1[] { class121.field3012, method502(var6), class86.field2165, method502(var7) }), 4, 329, 16776960);
		}
	}

	@ObfuscatedName("be.a([BIB)I")
	public static int method244(byte[] arg0, int arg1) {
		return method1044(0, arg1, arg0);
	}

	@ObfuscatedName("kb.b(B)V")
	public static void method596() {
		class62.field1562 = null;
		class62.field1564 = null;
		class62.field1541 = null;
		field1542 = null;
		class62.field1557 = null;
		class62.field1549 = null;
		field1556 = null;
		class62.field1547 = null;
		class62.field1545 = null;
		class62.field1563 = null;
		field1555 = null;
		field1558 = null;
		field1560 = null;
		class62.field1561 = null;
		field1553 = null;
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
		int var0 = field2902.method208(class100.field2490);
		for (int var1 = 0; var1 < class42.field1104; var1++) {
			int var2 = field2902.method204(class102.field2586[var1]);
			if (var0 < var2) {
				var0 = var2;
			}
		}
		var0 += 8;
		int var3 = class42.field1104 * 15 + 21;
		if (class112.field2762 > 4 && class1.field14 > 4 && class112.field2762 < 516 && class1.field14 < 338) {
			field640 = 0;
			field219 = class42.field1104 * 15 + 22;
			class6.field224 = true;
			int var4 = class112.field2762 - var0 / 2 - 4;
			field2306 = var0;
			if (var0 + var4 > 512) {
				var4 = 512 - var0;
			}
			if (var4 < 0) {
				var4 = 0;
			}
			field986 = var4;
			int var5 = class1.field14 - 4;
			if (var5 + var3 > 334) {
				var5 = 334 - var3;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			field579 = var5;
		}
		if (class112.field2762 > 553 && class1.field14 > 205 && class112.field2762 < 743 && class1.field14 < 466) {
			field219 = class42.field1104 * 15 + 22;
			field640 = 1;
			int var6 = class1.field14 - 205;
			int var7 = class112.field2762 - var0 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var0 + var7 > 190) {
				var7 = 190 - var0;
			}
			class6.field224 = true;
			field986 = var7;
			if (var6 < 0) {
				var6 = 0;
			} else if (var3 + var6 > 261) {
				var6 = 261 - var3;
			}
			field2306 = var0;
			field579 = var6;
		}
		if (class112.field2762 <= 17 || class1.field14 <= 357 || class112.field2762 >= 496 || class1.field14 >= 453) {
			return;
		}
		field2306 = var0;
		field640 = 2;
		field219 = class42.field1104 * 15 + 22;
		int var8 = class1.field14 - 357;
		if (var8 < 0) {
			var8 = 0;
		} else if (var3 + var8 > 96) {
			var8 = 96 - var3;
		}
		int var9 = class112.field2762 - var0 / 2 - 17;
		class6.field224 = true;
		field579 = var8;
		if (var9 < 0) {
			var9 = 0;
		} else if (var0 + var9 > 479) {
			var9 = 479 - var0;
		}
		field986 = var9;
	}

	@ObfuscatedName("de.a(BIIIIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (method1052(arg3)) {
			method844(arg2, field2922[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@ObfuscatedName("hd.a(IILfe;)V")
	public static void method479(class36 arg0) {
		while (true) {
			class119 var1 = (class119) class107.field2694.method802();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field2964; var3++) {
				if (var1.field2961[var3] != null) {
					if (var1.field2961[var3].field815 == 2) {
						var1.field2959[var3] = -5;
					}
					if (var1.field2961[var3].field815 == 0) {
						var2 = true;
					}
				}
				if (var1.field2960[var3] != null) {
					if (var1.field2960[var3].field815 == 2) {
						var1.field2959[var3] = -6;
					}
					if (var1.field2960[var3].field815 == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.method415(205);
			arg0.method141(0);
			int var4 = arg0.field267;
			arg0.method182(var1.field2970);
			for (int var5 = 0; var5 < var1.field2964; var5++) {
				if (var1.field2959[var5] == 0) {
					try {
						int var6 = var1.field2958[var5];
						if (var6 == 0) {
							Field var7 = (Field) var1.field2961[var5].field818;
							int var8 = var7.getInt(null);
							arg0.method141(0);
							arg0.method182(var8);
						} else if (var6 == 1) {
							Field var9 = (Field) var1.field2961[var5].field818;
							var9.setInt(null, var1.field2969[var5]);
							arg0.method141(0);
						} else if (var6 == 2) {
							Field var10 = (Field) var1.field2961[var5].field818;
							int var11 = var10.getModifiers();
							arg0.method141(0);
							arg0.method182(var11);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field2960[var5].field818;
							byte[][] var15 = var1.field2963[var5];
							Object[] var16 = new Object[var15.length];
							for (int var17 = 0; var17 < var15.length; var17++) {
								ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
								var16[var17] = var18.readObject();
							}
							Object var19 = var14.invoke(null, var16);
							if (var19 == null) {
								arg0.method141(0);
							} else if (var19 instanceof Number) {
								arg0.method141(1);
								arg0.method157(((Number) var19).longValue());
							} else if (var19 instanceof class1) {
								arg0.method141(2);
								arg0.method181((class1) var19);
							} else {
								arg0.method141(4);
							}
						} else if (var6 == 4) {
							Method var12 = (Method) var1.field2960[var5].field818;
							int var13 = var12.getModifiers();
							arg0.method141(0);
							arg0.method182(var13);
						}
					} catch (ClassNotFoundException var20) {
						arg0.method141(-10);
					} catch (InvalidClassException var21) {
						arg0.method141(-11);
					} catch (StreamCorruptedException var22) {
						arg0.method141(-12);
					} catch (OptionalDataException var23) {
						arg0.method141(-13);
					} catch (IllegalAccessException var24) {
						arg0.method141(-14);
					} catch (IllegalArgumentException var25) {
						arg0.method141(-15);
					} catch (InvocationTargetException var26) {
						arg0.method141(-16);
					} catch (SecurityException var27) {
						arg0.method141(-17);
					} catch (IOException var28) {
						arg0.method141(-18);
					} catch (NullPointerException var29) {
						arg0.method141(-19);
					} catch (Exception var30) {
						arg0.method141(-20);
					} catch (Throwable var31) {
						arg0.method141(-21);
					}
				} else {
					arg0.method141(var1.field2959[var5]);
				}
			}
			arg0.method149(var4);
			arg0.method155(arg0.field267 - var4);
			var1.method739();
		}
	}

	@ObfuscatedName("g.a(Z)V")
	public static void method420() {
		class37.field1006 = null;
		class37.field1005 = null;
		field993 = null;
		class37.field1000 = null;
		class37.field996 = null;
		field1003 = null;
		class37.field981 = null;
		class37.field989 = null;
		class37.field994 = null;
		field999 = null;
	}

	@ObfuscatedName("tb.a(I[La;)La;")
	public static class1 method956(class1[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return method825(arg0.length, 0, arg0);
	}

	@ObfuscatedName("w.a(Z)V")
	public static void method1030() {
		field2930 = new int[104];
		field910 = new byte[4][104][104];
		field412 = new int[4][105][105];
		class129.field3175 = 99;
		field1003 = new byte[4][105][105];
		field1385 = new int[104];
		field3246 = new int[104];
		field856 = new int[104];
		field1247 = new int[105][105];
		field3053 = new byte[4][104][104];
		field2906 = new int[104];
		field1872 = new byte[4][104][104];
		field2131 = new byte[4][104][104];
	}

	@ObfuscatedName("hb.e(I)V")
	public static void method470() {
		class44.field1166 = null;
		class44.field1171 = null;
		class44.field1160 = null;
		class44.field1169 = null;
		field1167 = null;
		field1162 = null;
	}

	@ObfuscatedName("f.a(Z)I")
	public static int method382() {
		return class99.field2430++;
	}

	@ObfuscatedName("nc.a(Llc;BZ)Z")
	public static boolean method734(class69 arg0, boolean arg1) {
		class62.field1548 = 20;
		try {
			field311 = (class45) Class.forName("da").getDeclaredConstructor().newInstance();
			return true;
		} catch (Throwable var3) {
			class21 var2 = arg0.method653();
			if (var2 != null) {
				field311 = new class55(arg0, var2);
				return true;
			} else if (arg1) {
				field311 = new class38(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ha.a(Ljava/awt/Component;B)V")
	public static void method465(Component arg0) {
		arg0.addMouseListener(class54.field1412);
		arg0.addMouseMotionListener(class54.field1412);
		arg0.addFocusListener(class54.field1412);
	}

	@ObfuscatedName("oa.a(Lbd;ZLbd;I)V")
	public static void method748(class11 arg0, boolean arg1, class11 arg2) {
		field2384 = arg1;
		field458 = arg2;
		field1405 = arg0;
		field1590 = field1405.method235(10);
	}

	@ObfuscatedName("vd.c(B)V")
	public static void method1024() {
		if (class114.field2813 > 1) {
			class114.field2813--;
		}
		if (class70.field1750 > 0) {
			class70.field1750--;
		}
		if (class78.field1919) {
			class78.field1919 = false;
			method960();
			return;
		}
		for (int var0 = 0; var0 < 100 && method111(); var0++) {
		}
		if (class103.field2599 != 30 && class103.field2599 != 35) {
			return;
		}
		if (class39.field1069 && class103.field2599 == 30) {
			class28.field801 = 0;
			class122.field3050 = 0;
			while (method685()) {
			}
			for (int var1 = 0; var1 < class59.field1488.length; var1++) {
				class59.field1488[var1] = false;
			}
		}
		method479(class70.field1726);
		Object var2 = field708.field2042;
		synchronized (field708.field2042) {
			if (!class45.field1186) {
				field708.field2058 = 0;
			} else if (class122.field3050 != 0 || field708.field2058 >= 40) {
				int var3 = 0;
				class70.field1726.method415(210);
				class70.field1726.method141(0);
				int var4 = class70.field1726.field267;
				for (int var5 = 0; var5 < field708.field2058 && class70.field1726.field267 - var4 < 240; var5++) {
					var3++;
					int var6 = field708.field2057[var5];
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 502) {
						var6 = 502;
					}
					int var7 = field708.field2059[var5];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 764) {
						var7 = 764;
					}
					int var8 = var6 * 765 + var7;
					if (field708.field2057[var5] == -1 && field708.field2059[var5] == -1) {
						var7 = -1;
						var8 = 524287;
						var6 = -1;
					}
					if (class36.field973 != var7 || class49.field1342 != var6) {
						int var9 = var7 - class36.field973;
						class36.field973 = var7;
						int var10 = var6 - class49.field1342;
						class49.field1342 = var6;
						if (class123.field3069 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							class70.field1726.method150((class123.field3069 << 12) + (var9 << 6) + var10);
							class123.field3069 = 0;
						} else if (class123.field3069 < 8) {
							class70.field1726.method153(var8 + (class123.field3069 << 19) + 8388608);
							class123.field3069 = 0;
						} else {
							class70.field1726.method182((class123.field3069 << 19) + var8 - 1073741824);
							class123.field3069 = 0;
						}
					} else if (class123.field3069 < 2047) {
						class123.field3069++;
					}
				}
				class70.field1726.method155(class70.field1726.field267 - var4);
				if (var3 < field708.field2058) {
					field708.field2058 -= var3;
					for (int var11 = 0; var11 < field708.field2058; var11++) {
						field708.field2059[var11] = field708.field2059[var3 + var11];
						field708.field2057[var11] = field708.field2057[var3 + var11];
					}
				} else {
					field708.field2058 = 0;
				}
			}
		}
		if (class122.field3050 != 0) {
			long var12 = (class49.field1344 - class103.field2605) / 50L;
			int var14 = class112.field2762;
			int var15 = class1.field14;
			class103.field2605 = class49.field1344;
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
			if (class122.field3050 == 2) {
				var16 = 1;
			}
			if (var12 > 4095L) {
				var12 = 4095L;
			}
			int var17 = (int) var12;
			class70.field1726.method415(234);
			int var18 = var15 * 765 + var14;
			class70.field1726.method170((var16 << 19) + ((var17 << 20) + var18));
		}
		if (class37.field998 > 0) {
			class37.field998--;
		}
		if (class59.field1488[96] || class59.field1488[97] || class59.field1488[98] || class59.field1488[99]) {
			class48.field1271 = true;
		}
		if (class48.field1271 && class37.field998 <= 0) {
			class37.field998 = 20;
			class48.field1271 = false;
			class70.field1726.method415(58);
			class70.field1726.method150(class113.field2797);
			class70.field1726.method150(class131.field3204);
		}
		if (field1277 && !class75.field1862) {
			class75.field1862 = true;
			class70.field1726.method415(160);
			class70.field1726.method141(1);
		}
		if (!field1277 && class75.field1862) {
			class75.field1862 = false;
			class70.field1726.method415(160);
			class70.field1726.method141(0);
		}
		method810();
		if (class103.field2599 != 30 && class103.field2599 != 35) {
			return;
		}
		method878();
		method125();
		class75.field1855++;
		if (class75.field1855 > 750) {
			method960();
			return;
		}
		method384();
		method252();
		method424();
		if (class92.field2295 != 0) {
			class34.field894 += 20;
			if (class34.field894 >= 400) {
				class92.field2295 = 0;
			}
		}
		if (class19.field656 != 0) {
			class43.field1154++;
			if (class43.field1154 >= 15) {
				if (class19.field656 == 2) {
					class39.field1055 = true;
				}
				if (class19.field656 == 3) {
					class105.field2637 = true;
				}
				class19.field656 = 0;
			}
		}
		class9.field321++;
		if (class32.field857 != 0) {
			class8.field298++;
			if (class24.field741 > class128.field3143 + 5 || class128.field3143 - 5 > class24.field741 || class115.field2829 + 5 < class102.field2568 || class115.field2829 - 5 > class102.field2568) {
				class114.field2815 = true;
			}
			if (class28.field801 == 0) {
				if (class32.field857 == 3) {
					class105.field2637 = true;
				}
				if (class32.field857 == 2) {
					class39.field1055 = true;
				}
				class32.field857 = 0;
				if (class114.field2815 && class8.field298 >= 5) {
					class43.field1145 = -1;
					method757();
					if (class98.field2410 == class43.field1145 && class113.field2776 != class108.field2704) {
						class100 var19 = method1053(class98.field2410);
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
						class70.field1726.method415(83);
						class70.field1726.method165(var20);
						class70.field1726.method169(class113.field2776);
						class70.field1726.method154(class108.field2704);
						class70.field1726.method179(class98.field2410);
					}
				} else if ((class134.field3297 == 1 || method676(class42.field1104 - 1)) && class42.field1104 > 2) {
					method968();
				} else if (class42.field1104 > 0) {
					method604(class42.field1104 - 1);
				}
				class43.field1154 = 10;
				class122.field3050 = 0;
			}
		}
		if (class3.field105 != -1) {
			int var25 = class3.field105;
			int var26 = class3.field108;
			boolean var27 = method576(0, 0, field2621.field1962[0], var25, 0, true, 0, 0, field2621.field2009[0], var26, 0);
			if (var27) {
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class119.field2967 = class112.field2762;
				class92.field2295 = 1;
			}
			class3.field105 = -1;
		}
		if (class122.field3050 == 1 && class64.field1605 != null) {
			class122.field3050 = 0;
			class105.field2637 = true;
			class64.field1605 = null;
		}
		method992();
		if (class42.field1143 == -1) {
			method565();
			method575();
			method271();
		}
		if (class28.field801 == 1 || class122.field3050 == 1) {
			class130.field3176++;
		}
		if (class132.field3227 != -1) {
			method606(516, 34, 338, class132.field3227, 4, 4);
		}
		if (class66.field1648 != -1) {
			method606(743, 34, 466, class66.field1648, 205, 553);
		} else if (class97.field2397[class9.field330] != -1) {
			method606(743, 34, 466, class97.field2397[class9.field330], 205, 553);
		}
		if (class86.field2166 != -1) {
			method606(496, 34, 453, class86.field2166, 357, 17);
		} else if (class98.field2421 != -1) {
			method606(496, 34, 453, class98.field2421, 357, 17);
		}
		if (class132.field3227 != -1) {
			method606(516, -35, 338, class132.field3227, 4, 4);
		}
		if (class66.field1648 != -1) {
			method606(743, -35, 466, class66.field1648, 205, 553);
		} else if (class97.field2397[class9.field330] != -1) {
			method606(743, -35, 466, class97.field2397[class9.field330], 205, 553);
		}
		if (class86.field2166 != -1) {
			method606(496, -35, 453, class86.field2166, 357, 17);
		} else if (class98.field2421 != -1) {
			method606(496, -35, 453, class98.field2421, 357, 17);
		}
		if (class133.field3253 == -1 && class52.field1387 == -1 && class48.field1279 == -1) {
			if (class106.field2673 > 0) {
				class106.field2673--;
			}
		} else if (class1.field57 > class106.field2673) {
			class106.field2673++;
			if (class106.field2673 == class1.field57) {
				if (class133.field3253 != -1) {
					class105.field2637 = true;
				}
				if (class52.field1387 != -1) {
					class39.field1055 = true;
				}
			}
		}
		method564();
		if (class81.field2043) {
			method189();
		}
		for (int var28 = 0; var28 < 5; var28++) {
			int var10002 = class38.field1019[var28]++;
		}
		method482();
		int var29 = method662();
		int var30 = method382();
		if (var29 > 4500 && var30 > 4500) {
			class70.field1750 = 250;
			method876(4000);
			class70.field1726.method415(216);
		}
		class2.field72++;
		class60.field1528++;
		if (class60.field1528 > 500) {
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x2) == 2) {
				class98.field2409 += class4.field185;
			}
			if ((var31 & 0x1) == 1) {
				class8.field296 += class85.field2148;
			}
			class60.field1528 = 0;
			if ((var31 & 0x4) == 4) {
				class112.field2766 += class9.field317;
			}
		}
		if (class98.field2409 < -55) {
			class4.field185 = 2;
		}
		if (class2.field72 > 500) {
			int var32 = (int) (Math.random() * 8.0D);
			if ((var32 & 0x1) == 1) {
				class86.field2158 += class24.field740;
			}
			if ((var32 & 0x2) == 2) {
				class103.field2589 += client.field587;
			}
			class2.field72 = 0;
		}
		if (class98.field2409 > 55) {
			class4.field185 = -2;
		}
		if (class8.field296 < -50) {
			class85.field2148 = 2;
		}
		if (class86.field2158 < -60) {
			class24.field740 = 2;
		}
		class45.field1179++;
		if (class8.field296 > 50) {
			class85.field2148 = -2;
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
			client.field587 = 1;
		}
		if (class103.field2589 > 10) {
			client.field587 = -1;
		}
		if (class45.field1179 > 50) {
			class70.field1726.method415(13);
		}
		try {
			if (field1450 != null && class70.field1726.field267 > 0) {
				field1450.method1016(class70.field1726.field267, class70.field1726.field284);
				class45.field1179 = 0;
				class70.field1726.field267 = 0;
			}
		} catch (IOException var33) {
			method960();
		}
	}

	@ObfuscatedName("cb.a(Z)V")
	public static void method265() {
		class72.field1757.method267();
	}

	@ObfuscatedName("pe.a(III)Lcc;")
	public static class16 method824(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		class16 var4 = (class16) class31.field830.method263(var2);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = field2739.method215(class54.field1437, method956(new class1[] { method502(arg1), class44.field1160, method502(arg0) }));
		class8 var6 = new class8(var5);
		class16 var7 = new class16();
		var6.field267 = var6.field284.length - 12;
		int var8 = var6.method167();
		int var9 = 0;
		var7.field518 = var6.method145();
		var7.field514 = var6.method145();
		var7.field510 = var6.method145();
		var7.field513 = var6.method145();
		var7.field517 = new class1[var8];
		var7.field509 = new int[var8];
		var6.field267 = 0;
		var7.field519 = new int[var8];
		while (var6.field267 < var6.field284.length - 12) {
			int var10 = var6.method145();
			if (var10 == 3) {
				var7.field517[var9] = var6.method140();
			} else if (var10 >= 100 || var10 == 21 || var10 == 38 || var10 == 39) {
				var7.field509[var9] = var6.method144();
			} else {
				var7.field509[var9] = var6.method167();
			}
			var7.field519[var9++] = var10;
		}
		class31.field830.method262(var2, var7);
		return var7;
	}

	@ObfuscatedName("he.a([Lad;I[BIIII)V")
	public static void method487(class5[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (arg3 + var7 > 0 && arg3 + var7 < 103 && arg4 + var8 > 0 && arg4 + var8 < 103) {
						arg0[var6].field201[arg3 + var7][arg4 + var8] &= 0xFEFFFFFF;
					}
				}
			}
		}
		class8 var9 = new class8(arg2);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					method841(var11 + arg3, 0, var9, arg4 + var12, arg5, arg1, var10);
				}
			}
		}
	}

	@ObfuscatedName("pb.a(IB)La;")
	public static class1 method803(int arg0) {
		class1 var1 = method502(arg0);
		for (int var2 = var1.method10() - 3; var2 > 0; var2 -= 3) {
			var1 = method956(new class1[] { var1.method19(0, var2), class72.field1774, var1.method1(var2) });
		}
		if (var1.method10() > 8) {
			var1 = method956(new class1[] { class102.field2564, var1.method19(0, var1.method10() - 8), class76.field1896, class105.field2629, var1, class103.field2601 });
		} else if (var1.method10() > 4) {
			var1 = method956(new class1[] { class128.field3136, var1.method19(0, var1.method10() - 4), class95.field2360, class105.field2629, var1, class103.field2601 });
		}
		return method956(new class1[] { class98.field2406, var1 });
	}

	@ObfuscatedName("ca.c(I)V")
	public static void method257() {
		class14.field460 = null;
		class14.field452 = null;
		class14.field471 = null;
		field469 = null;
		class14.field479 = null;
		field458 = null;
		class14.field465 = null;
		class14.field477 = null;
		class14.field453 = null;
		class14.field473 = null;
		field472 = null;
		class14.field478 = null;
		field470 = null;
		class14.field474 = null;
		class14.field467 = null;
		class14.field468 = null;
		class14.field455 = null;
	}

	@ObfuscatedName("fa.a(IILjd;B)V")
	public static void method387(int arg0, int arg1, class58 arg2) {
		if (arg2 == null) {
			return;
		}
		int var3 = class86.field2158 + class113.field2797 & 0x7FF;
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 6400) {
			return;
		}
		int var5 = class91.field2256[var3];
		int var6 = var5 * 256 / (class103.field2589 + 256);
		int var7 = class91.field2258[var3];
		int var8 = var7 * 256 / (class103.field2589 + 256);
		int var9 = arg0 * var6 + arg1 * var8 >> 16;
		int var10 = arg0 * var8 - arg1 * var6 >> 16;
		if (var4 > 2500) {
			arg2.method555(field1845, var9 + 98 - arg2.field1479 / 2, -var10 + 79 + -(arg2.field1477 / 2));
		} else {
			arg2.method551(var9 + 4 + 94 - arg2.field1479 / 2, -(arg2.field1477 / 2) + 83 + -var10 + -4);
		}
	}

	@ObfuscatedName("ib.a(ILab;IIII[BI[Lad;II)V")
	public static void method522(int arg0, class3 arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class5[] arg7, int arg8, int arg9) {
		class8 var10 = new class8(arg5);
		int var11 = -1;
		while (true) {
			int var12 = var10.method178();
			if (var12 == 0) {
				return;
			}
			int var13 = 0;
			var11 += var12;
			while (true) {
				int var14 = var10.method178();
				if (var14 == 0) {
					break;
				}
				var13 += var14 - 1;
				int var15 = var13 >> 12;
				int var16 = var13 >> 6 & 0x3F;
				int var17 = var10.method144();
				int var18 = var17 >> 2;
				int var19 = var13 & 0x3F;
				int var20 = var17 & 0x3;
				if (arg4 == var15 && arg0 <= var16 && var16 < arg0 + 8 && arg8 <= var19 && arg8 + 8 > var19) {
					class49 var21 = method389(var11);
					int var22 = method287(var20, var21.field1286, var16 & 0x7, var21.field1298, arg3, var19 & 0x7) + arg9;
					int var23 = method404(var19 & 0x7, var21.field1298, var16 & 0x7, var21.field1286, arg3, var20) + arg6;
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						class5 var24 = null;
						int var25 = arg2;
						if ((class34.field898[1][var22][var23] & 0x2) == 2) {
							var25 = arg2 - 1;
						}
						if (var25 >= 0) {
							var24 = arg7[var25];
						}
						method301(arg3 + var20 & 0x3, var24, var22, arg1, var18, var11, var23, arg2);
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(I)V")
	public static void method865() {
		method610(false);
		class78.field1922 = 0;
		boolean var0 = true;
		for (int var1 = 0; var1 < field61.length; var1++) {
			if (field2291[var1] != -1 && field61[var1] == null) {
				field61[var1] = field3131.method217(0, field2291[var1]);
				if (field61[var1] == null) {
					class78.field1922++;
					var0 = false;
				}
			}
			if (field742[var1] != -1 && field2633[var1] == null) {
				field2633[var1] = field3131.method221(field742[var1], 0, field2170[var1]);
				if (field2633[var1] == null) {
					class78.field1922++;
					var0 = false;
				}
			}
		}
		if (!var0) {
			class134.field3301 = 1;
			return;
		}
		boolean var2 = true;
		class95.field2358 = 0;
		for (int var3 = 0; var3 < field61.length; var3++) {
			byte[] var4 = field2633[var3];
			if (var4 != null) {
				int var5 = (field1078[var3] & 0xFF) * 64 - field1408;
				int var6 = (field1078[var3] >> 8) * 64 - field806;
				if (class113.field2773) {
					var6 = 10;
					var5 = 10;
				}
				var2 &= method683(var4, var6, var5);
			}
		}
		if (!var2) {
			class134.field3301 = 2;
			return;
		}
		if (class134.field3301 != 0) {
			method872(class133.field3252, true, class42.field1133);
		}
		method595();
		field3183.method54();
		System.gc();
		for (int var7 = 0; var7 < 4; var7++) {
			class102.field2569[var7].method110();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					class34.field898[var8][var9][var10] = 0;
				}
			}
		}
		method1030();
		int var11 = field61.length;
		method718();
		method610(true);
		if (!class113.field2773) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (field1078[var12] & 0xFF) * 64 - field1408;
				int var14 = (field1078[var12] >> 8) * 64 - field806;
				byte[] var15 = field61[var12];
				if (var15 != null) {
					method487(class102.field2569, (field2604 - 6) * 8, var15, var14, var13, (field829 - 6) * 8);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (field1078[var16] >> 8) * 64 - field806;
				byte[] var18 = field61[var16];
				int var19 = (field1078[var16] & 0xFF) * 64 - field1408;
				if (var18 == null && field829 < 800) {
					method989(var19, 64, 64, var17);
				}
			}
			method610(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = field2633[var20];
				if (var21 != null) {
					int var22 = (field1078[var20] >> 8) * 64 - field806;
					int var23 = (field1078[var20] & 0xFF) * 64 - field1408;
					method535(var22, field3183, class102.field2569, var21, var23);
				}
			}
		}
		if (class113.field2773) {
			for (int var24 = 0; var24 < 4; var24++) {
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						int var27 = class34.field908[var24][var25][var26];
						boolean var28 = false;
						if (var27 != -1) {
							int var29 = var27 >> 1 & 0x3;
							int var30 = var27 >> 14 & 0x3FF;
							int var31 = var27 >> 24 & 0x3;
							int var32 = var27 >> 3 & 0x7FF;
							int var33 = (var30 / 8 << 8) + (var32 / 8);
							for (int var34 = 0; var34 < field1078.length; var34++) {
								if (field1078[var34] == var33 && field61[var34] != null) {
									method186(var26 * 8, (var30 & 0x7) * 8, var31, var24, var25 * 8, (var32 & 0x7) * 8, var29, field61[var34], class102.field2569);
									var28 = true;
									break;
								}
							}
						}
						if (!var28) {
							method737(var26 * 8, var24, var25 * 8);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = class34.field908[0][var35][var36];
					if (var37 == -1) {
						method989(var36 * 8, 8, 8, var35 * 8);
					}
				}
			}
			method610(true);
			for (int var38 = 0; var38 < 4; var38++) {
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = class34.field908[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 14 & 0x3FF;
							int var44 = var41 >> 1 & 0x3;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = (var43 / 8 << 8) + (var45 / 8);
							for (int var47 = 0; var47 < field1078.length; var47++) {
								if (field1078[var47] == var46 && field2633[var47] != null) {
									method522((var43 & 0x7) * 8, field3183, var38, var44, var42, field2633[var47], var40 * 8, class102.field2569, (var45 & 0x7) * 8, var39 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		method610(true);
		method595();
		method425(field3183, class102.field2569);
		method610(true);
		int var48 = class129.field3175;
		if (field75 < var48) {
			var48 = field75;
		}
		if (var48 < field75 - 1) {
		}
		if (class93.field2332) {
			field3183.method92(class129.field3175);
		} else {
			field3183.method92(0);
		}
		for (int var49 = 0; var49 < 104; var49++) {
			for (int var50 = 0; var50 < 104; var50++) {
				method1011(var50, var49);
			}
		}
		method429();
		class93.field2322.method267();
		if (field1859 != null) {
			class70.field1726.method415(121);
			class70.field1726.method182(1057001181);
		}
		if (!class113.field2773) {
			int var51 = (field2604 - 6) / 8;
			int var52 = (field829 - 6) / 8;
			int var53 = (field829 + 6) / 8;
			int var54 = (field2604 + 6) / 8;
			for (int var55 = var51 - 1; var55 <= var54 + 1; var55++) {
				for (int var56 = var52 - 1; var56 <= var53 + 1; var56++) {
					if (var51 > var55 || var55 > var54 || var56 < var52 || var56 > var53) {
						field3131.method240(method956(new class1[] { class92.field2305, method502(var55), class14.field477, method502(var56) }));
						field3131.method240(method956(new class1[] { class48.field1259, method502(var55), class14.field477, method502(var56) }));
					}
				}
			}
		}
		if (class42.field1143 == -1) {
			method399(30);
		} else {
			method399(35);
		}
		method910();
		class70.field1726.method415(178);
		method466();
	}

	@ObfuscatedName("be.a(Lbd;ILa;La;)[Ljd;")
	public static class58[] method245(class11 arg0, class1 arg1, class1 arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method881(var3, arg0, var4);
	}

	@ObfuscatedName("rb.b(B)V")
	public static void method878() {
		for (class22 var0 = (class22) class92.field2284.method802(); var0 != null; var0 = (class22) class92.field2284.method809()) {
			if (var0.field692 > 0) {
				var0.field692--;
			}
			if (var0.field692 != 0) {
				if (var0.field694 > 0) {
					var0.field694--;
				}
				if (var0.field694 == 0 && var0.field700 >= 1 && var0.field699 >= 1 && var0.field700 <= 102 && var0.field699 <= 102 && (var0.field678 < 0 || method741(var0.field691, var0.field678))) {
					method882(var0.field699, var0.field678, var0.field700, var0.field691, var0.field696, var0.field688, var0.field679);
					var0.field694 = -1;
					if (var0.field689 == var0.field678 && var0.field689 == -1) {
						var0.method739();
					} else if (var0.field689 == var0.field678 && var0.field696 == var0.field686 && var0.field697 == var0.field691) {
						var0.method739();
					}
				}
			} else if (var0.field689 < 0 || method741(var0.field697, var0.field689)) {
				method882(var0.field699, var0.field689, var0.field700, var0.field697, var0.field686, var0.field688, var0.field679);
				var0.method739();
			}
		}
	}

	@ObfuscatedName("n.a(I)V")
	public static void method715() {
		class78.field1920 = null;
		class78.field1917 = null;
		class78.field1923 = null;
		class78.field1908 = null;
		field1926 = null;
		class78.field1927 = null;
		class78.field1928 = null;
		class78.field1921 = null;
		class78.field1915 = null;
		class78.field1925 = null;
	}

	@ObfuscatedName("j.a(ILab;[Lad;[BIB)V")
	public static void method535(int arg0, class3 arg1, class5[] arg2, byte[] arg3, int arg4) {
		class8 var5 = new class8(arg3);
		int var6 = -1;
		while (true) {
			int var7 = var5.method178();
			if (var7 == 0) {
				return;
			}
			int var8 = 0;
			var6 += var7;
			while (true) {
				int var9 = var5.method178();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 & 0x3F;
				int var11 = var8 >> 6 & 0x3F;
				int var12 = var8 >> 12;
				int var13 = var5.method144();
				int var14 = var13 >> 2;
				int var15 = var13 & 0x3;
				int var16 = arg0 + var11;
				int var17 = var10 + arg4;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					class5 var18 = null;
					int var19 = var12;
					if ((class34.field898[1][var16][var17] & 0x2) == 2) {
						var19 = var12 - 1;
					}
					if (var19 >= 0) {
						var18 = arg2[var19];
					}
					method301(var15, var18, var16, arg1, var14, var6, var17, var12);
				}
			}
		}
	}

	@ObfuscatedName("md.a(BIII)I")
	public static int method700(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("s.a(BI)Lt;")
	public static class114 method897(int arg0) {
		class114 var1 = (class114) class85.field2136.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class114 var2 = method690(field939, arg0, field2966);
		if (var2 != null) {
			class85.field2136.method262((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("f.a(IJ)V")
	public static void method383(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class85.field2146 >= 100) {
			method758(0, class102.field2582, class132.field3234);
			return;
		}
		class1 var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < class85.field2146; var3++) {
			if (class106.field2683[var3] == arg0) {
				method758(0, method956(new class1[] { var2, class134.field3295 }), class132.field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < class59.field1492; var4++) {
			if (class117.field2929[var4] == arg0) {
				method758(0, method956(new class1[] { class89.field2172, var2, class128.field3138 }), class132.field3234);
				return;
			}
		}
		if (!var2.method5(field2621.field86)) {
			class106.field2683[class85.field2146++] = arg0;
			class39.field1055 = true;
			class70.field1726.method415(251);
			class70.field1726.method157(arg0);
		}
	}

	@ObfuscatedName("ra.a(ILa;ZLa;)V")
	public static void method872(class1 arg0, boolean arg1, class1 arg2) {
		if (class97.field2402) {
			class97.field2402 = false;
			method943();
			method808();
			method901();
			method454();
			method880(class115.field2828, field2684, class6.field236, class75.field1864);
			method246(class9.field330, class97.field2397, class66.field1648 == -1, -1);
			class79.field1941 = true;
			class22.field687 = true;
			class11.field410 = true;
		}
		short var3 = 151;
		method1028();
		int var5 = var3 - 3;
		field2684.method209(arg0, 257, 148, 0);
		field2684.method209(arg0, 256, 147, 16777215);
		if (arg2 != null) {
			var5 += 15;
			if (arg1) {
				int var4 = field2684.method208(arg2) + 4;
				class111.method913(257 - var4 / 2, 152, var4, 11, 0);
			}
			field2684.method209(arg2, 257, 163, 0);
			field2684.method209(arg2, 256, 162, 16777215);
		}
		method44();
	}

	@ObfuscatedName("ia.a(Lu;ILsa;B)V")
	public static void method507(class120 arg0, int arg1, class109 arg2) {
		byte[] var3 = null;
		class92 var4 = class62.field1547;
		synchronized (class62.field1547) {
			for (class57 var5 = (class57) class62.field1547.method802(); var5 != null; var5 = (class57) class62.field1547.method809()) {
				if ((long) arg1 == var5.field2073 && var5.field1469 == arg2 && var5.field1464 == 0) {
					var3 = var5.field1454;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.method906(arg1);
			arg0.method978(true, var6, arg1, arg2);
		} else {
			arg0.method978(true, var3, arg1, arg2);
		}
	}

	@ObfuscatedName("bb.a(I)V")
	public static void method188() {
		method1012(class42.field1143);
		if (class76.field1881 != -1) {
			method1012(class76.field1881);
		}
		class9.field321 = 0;
		field187.method1054();
		field92 = class27.method362(field92);
		class111.method920();
		method478(class42.field1143, 503, 0, 765);
		if (class76.field1881 != -1) {
			method478(class76.field1881, 503, 0, 765);
		}
		if (class6.field224) {
			method483();
		} else {
			method757();
			method391();
		}
		try {
			Graphics var0 = field3049.getGraphics();
			field187.method101(0, var0, 0);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("mb.a(I)V")
	public static void method687() {
		class74.field1816 = null;
		class74.field1807 = null;
		class74.field1794 = null;
		class74.field1834 = null;
		class74.field1841 = null;
		class74.field1831 = null;
		class74.field1819 = null;
		field1842 = null;
		field1795 = null;
		class74.field1840 = null;
		field1845 = null;
	}

	@ObfuscatedName("oa.a(IIZ[BI)V")
	public static void method749(int arg0, boolean arg1, byte[] arg2, int arg3) {
		if (field311 == null) {
			return;
		}
		if (class122.field3030 >= 0) {
			class8.field302 = arg3;
			if (class122.field3030 == 0) {
				class62.field1548 = 1;
			} else {
				int var4 = method632(class122.field3030);
				int var5 = var4 - class81.field2046;
				class62.field1548 = (var5 + 3600) / arg3;
				if (class62.field1548 < 1) {
					class62.field1548 = 1;
				}
			}
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		} else if (class62.field1548 == 0) {
			method7(arg1, arg2, arg0);
		} else {
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		}
	}

	@ObfuscatedName("ua.b(I)V")
	public static void method987() {
		if (field1714.toLowerCase().indexOf("microsoft") != -1) {
			class132.field3231[186] = 57;
			class132.field3231[187] = 27;
			class132.field3231[188] = 71;
			class132.field3231[189] = 26;
			class132.field3231[190] = 72;
			class132.field3231[191] = 73;
			class132.field3231[192] = 58;
			class132.field3231[219] = 42;
			class132.field3231[220] = 74;
			class132.field3231[221] = 43;
			class132.field3231[222] = 59;
			class132.field3231[223] = 28;
			return;
		}
		class132.field3231[44] = 71;
		class132.field3231[45] = 26;
		class132.field3231[46] = 72;
		class132.field3231[47] = 73;
		class132.field3231[59] = 57;
		class132.field3231[61] = 27;
		class132.field3231[91] = 42;
		class132.field3231[92] = 74;
		class132.field3231[93] = 43;
		if (field1708 == null) {
			class132.field3231[192] = 58;
			class132.field3231[222] = 59;
		} else {
			class132.field3231[192] = 28;
			class132.field3231[222] = 58;
			class132.field3231[520] = 59;
		}
	}

	@ObfuscatedName("fd.f(I)V")
	public static void method405() {
		class35.field926 = null;
		field939 = null;
		field925 = null;
		field924 = null;
		class35.field932 = null;
		class35.field936 = null;
		field931 = null;
		class35.field929 = null;
		class35.field942 = null;
		class35.field927 = null;
	}

	@ObfuscatedName("h.b(Z)V")
	public static void method449() {
		field837 = null;
		field2794 = null;
		field3194 = null;
		field1985 = null;
		field292 = null;
		field2771 = null;
	}

	@ObfuscatedName("cb.a(I)V")
	public static void method266() {
		class15.field487 = null;
		class15.field507 = null;
		class15.field486 = null;
		class15.field506 = null;
		class15.field502 = null;
		class15.field505 = null;
		class15.field488 = null;
		class15.field499 = null;
		class15.field500 = null;
		field503 = null;
		class15.field501 = null;
		class15.field497 = null;
	}

	@ObfuscatedName("be.a(II[IZI)V")
	public static void method246(int arg0, int[] arg1, boolean arg2, int arg3) {
		field993.method1054();
		field279.method329(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 0) {
					field2731.method329(22, 10);
				}
				if (arg0 == 1) {
					field1598.method329(54, 8);
				}
				if (arg0 == 2) {
					field1598.method329(82, 8);
				}
				if (arg0 == 3) {
					field1871.method329(110, 8);
				}
				if (arg0 == 4) {
					field2686.method329(153, 8);
				}
				if (arg0 == 5) {
					field2686.method329(181, 8);
				}
				if (arg0 == 6) {
					field1457.method329(209, 9);
				}
			}
			if (arg1[0] != -1 && arg3 != 0) {
				field2807[0].method329(29, 13);
			}
			if (arg1[1] != -1 && arg3 != 1) {
				field2807[1].method329(53, 11);
			}
			if (arg1[2] != -1 && arg3 != 2) {
				field2807[2].method329(82, 11);
			}
			if (arg1[3] != -1 && arg3 != 3) {
				field2807[3].method329(115, 12);
			}
			if (arg1[4] != -1 && arg3 != 4) {
				field2807[4].method329(153, 13);
			}
			if (arg1[5] != -1 && arg3 != 5) {
				field2807[5].method329(180, 11);
			}
			if (arg1[6] != -1 && arg3 != 6) {
				field2807[6].method329(208, 13);
			}
		}
		field1553.method1054();
		field2745.method329(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 7) {
					field3134.method329(42, 0);
				}
				if (arg0 == 8) {
					field1255.method329(74, 0);
				}
				if (arg0 == 9) {
					field1255.method329(102, 0);
				}
				if (arg0 == 10) {
					field1524.method329(130, 1);
				}
				if (arg0 == 11) {
					field739.method329(173, 0);
				}
				if (arg0 == 12) {
					field739.method329(201, 0);
				}
				if (arg0 == 13) {
					field1074.method329(229, 0);
				}
			}
			if (arg1[8] != -1 && arg3 != 8) {
				field2807[7].method329(74, 2);
			}
			if (arg1[9] != -1 && arg3 != 9) {
				field2807[8].method329(102, 3);
			}
			if (arg1[10] != -1 && arg3 != 10) {
				field2807[9].method329(137, 4);
			}
			if (arg1[11] != -1 && arg3 != 11) {
				field2807[10].method329(174, 2);
			}
			if (arg1[12] != -1 && arg3 != 12) {
				field2807[11].method329(201, 2);
			}
			if (arg1[13] != -1 && arg3 != 13) {
				field2807[12].method329(226, 2);
			}
		}
		try {
			Graphics var4 = field3049.getGraphics();
			field993.method101(516, var4, 160);
			field1553.method101(496, var4, 466);
		} catch (Exception var5) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("ie.a(I)V")
	public static void method531() {
		class53.field1404 = null;
		class53.field1403 = null;
		class53.field1402 = null;
		field1397 = null;
		class53.field1407 = null;
		class53.field1394 = null;
		class53.field1393 = null;
		class53.field1406 = null;
		field1405 = null;
		class53.field1392 = null;
		class53.field1396 = null;
	}

	@ObfuscatedName("tc.a(B)V")
	public static void method963() {
		class117.field2917 = null;
		field2922 = null;
		field2930 = null;
		class117.field2926 = null;
		field2919 = null;
		class117.field2931 = null;
		class117.field2929 = null;
		class117.field2927 = null;
		class117.field2924 = null;
		class117.field2923 = null;
		class117.field2928 = null;
		class117.field2925 = null;
	}

	@ObfuscatedName("vc.a(Z)V")
	public static void method1017() {
		class129.field3151 = null;
		class129.field3172 = null;
		class129.field3169 = null;
		class129.field3148 = null;
		field3167 = null;
		class129.field3170 = null;
		class129.field3146 = null;
		class129.field3163 = null;
	}

	@ObfuscatedName("ha.b(I)V")
	public static void method466() {
		field1747.method570();
		for (int var0 = 0; var0 < 32; var0++) {
			class64.field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			class133.field3281[var1] = 0L;
		}
		field681 = 0;
	}

	@ObfuscatedName("uc.d(B)[Ljd;")
	public static class58[] method998() {
		class58[] var0 = new class58[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			class58 var2 = var0[var1] = new class58();
			var2.field1479 = field2877;
			var2.field1477 = field1628;
			var2.field1478 = field2771[var1];
			var2.field1474 = field1985[var1];
			var2.field1476 = field837[var1];
			var2.field1475 = field3194[var1];
			byte[] var3 = field2794[var1];
			int var4 = var2.field1476 * var2.field1475;
			var2.field1480 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				var2.field1480[var5] = field292[var3[var5] & 0xFF];
			}
		}
		method449();
		return var0;
	}

	@ObfuscatedName("ae.a(I)V")
	public static void method125() {
		for (int var0 = 0; var0 < class36.field965; var0++) {
			int var10002 = class22.field684[var0]--;
			if (class22.field684[var0] >= -10) {
				class77 var2 = class36.field955[var0];
				if (var2 == null) {
					var2 = class77.method711(field2031, class95.field2369[var0]);
					if (var2 == null) {
						continue;
					}
					class22.field684[var0] += var2.method709();
					class36.field955[var0] = var2;
				}
				if (class22.field684[var0] < 0) {
					int var9;
					if (class60.field1521[var0] == 0) {
						var9 = class9.field322;
					} else {
						int var3 = (class60.field1521[var0] & 0xFF) * 128;
						int var4 = class60.field1521[var0] >> 16 & 0xFF;
						int var5 = class60.field1521[var0] >> 8 & 0xFF;
						int var6 = var5 * 128 + 64 - field2621.field1963;
						int var7 = var4 * 128 + 64 - field2621.field1972;
						if (var7 < 0) {
							var7 = -var7;
						}
						if (var6 < 0) {
							var6 = -var6;
						}
						int var8 = var6 + var7 - 128;
						if (var8 > var3) {
							class22.field684[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var9 = (var3 - var8) * class62.field1559 / var3;
					}
					class135 var10 = var2.method710().method1055(field2705);
					class61 var11 = class61.method590(var10, var9);
					var11.method585(class115.field2845[var0] - 1);
					field2435.method126(var11);
					class22.field684[var0] = -100;
				}
			} else {
				class36.field965--;
				for (int var1 = var0; var1 < class36.field965; var1++) {
					class95.field2369[var1] = class95.field2369[var1 + 1];
					class36.field955[var1] = class36.field955[var1 + 1];
					class115.field2845[var1] = class115.field2845[var1 + 1];
					class22.field684[var1] = class22.field684[var1 + 1];
					class60.field1521[var1] = class60.field1521[var1 + 1];
				}
				var0--;
			}
		}
		if (class75.field1860 <= 0) {
			return;
		}
		class75.field1860 -= 20;
		if (class75.field1860 < 0) {
			class75.field1860 = 0;
		}
		if (class75.field1860 == 0 && class62.field1554 != 0 && class122.field3037 != -1) {
			method681(0, class122.field3037, class62.field1554, field2702);
			return;
		}
	}

	@ObfuscatedName("de.a(IIII)I")
	public static int method322(int arg0, int arg1, int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return arg1 / 2 + (arg0 / 32 << 7) + (arg2 / 4 << 10);
	}

	@ObfuscatedName("ld.a(III)V")
	public static void method661(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		class104 var4 = (class104) class49.field1328.method499(var2);
		if (var4 != null) {
			class37.field996.method613(var4);
		}
	}

	@ObfuscatedName("fe.o(I)V")
	public static void method413() {
		class70.field1726.method415(176);
		if (class66.field1648 != -1) {
			method895(class66.field1648);
			class120.field2998 = -1;
			class95.field2364 = true;
			class39.field1055 = true;
			class66.field1648 = -1;
		}
		if (class86.field2166 != -1) {
			method895(class86.field2166);
			class120.field2998 = -1;
			class105.field2637 = true;
			class86.field2166 = -1;
		}
		if (class42.field1143 != -1) {
			method895(class42.field1143);
			class42.field1143 = -1;
			method399(30);
		}
		if (class76.field1881 != -1) {
			method895(class76.field1881);
			class76.field1881 = -1;
		}
		if (class132.field3227 != -1) {
			method895(class132.field3227);
			class132.field3227 = -1;
			class120.field2998 = -1;
		}
	}

	@ObfuscatedName("nd.a(IB)V")
	public static void method738(int arg0) {
		if (!method521()) {
			return;
		}
		if (class53.field1391) {
			field917 = arg0;
		} else {
			method877(arg0);
		}
	}

	@ObfuscatedName("s.a(I)V")
	public static void method898() {
		class108.field2708 = null;
		class108.field2710 = null;
		class108.field2716 = null;
		class108.field2707 = null;
		field2702 = null;
		class108.field2717 = null;
		field2705 = null;
		class108.field2714 = null;
	}

	@ObfuscatedName("rc.a(IIIIIIII)V")
	public static void method882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (class93.field2332 && field75 != arg6) {
			return;
		}
		int var7 = 0;
		if (arg5 == 0) {
			var7 = field3183.method78(arg6, arg2, arg0);
		}
		if (arg5 == 1) {
			var7 = field3183.method47(arg6, arg2, arg0);
		}
		if (arg5 == 2) {
			var7 = field3183.method66(arg6, arg2, arg0);
		}
		if (arg5 == 3) {
			var7 = field3183.method49(arg6, arg2, arg0);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = field3183.method97(arg6, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg5 == 0) {
				field3183.method80(arg6, arg2, arg0);
				class49 var12 = method389(var8);
				if (var12.field1284) {
					class102.field2569[arg6].method112(arg2, var10, var12.field1311, arg0, var11);
				}
			}
			if (arg5 == 1) {
				field3183.method83(arg6, arg2, arg0);
			}
			if (arg5 == 2) {
				field3183.method91(arg6, arg2, arg0);
				class49 var13 = method389(var8);
				if (arg2 + var13.field1286 > 103 || var13.field1286 + arg0 > 103 || var13.field1298 + arg2 > 103 || var13.field1298 + arg0 > 103) {
					return;
				}
				if (var13.field1284) {
					class102.field2569[arg6].method113(var13.field1311, arg0, arg2, var10, var13.field1286, var13.field1298);
				}
			}
			if (arg5 == 3) {
				field3183.method87(arg6, arg2, arg0);
				class49 var14 = method389(var8);
				if (var14.field1284 && var14.field1329 == 1) {
					class102.field2569[arg6].method109(arg0, arg2);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		int var15 = arg6;
		if (arg6 < 3 && (class34.field898[1][arg2][arg0] & 0x2) == 2) {
			var15 = arg6 + 1;
		}
		method270(class102.field2569[arg6], arg1, var15, arg6, arg3, field3183, arg4, arg0, arg2);
		return;
	}

	@ObfuscatedName("jc.b(B)V")
	public static void method543() {
		class57.field1463 = null;
		class57.field1451 = null;
		class57.field1466 = null;
		class57.field1473 = null;
		field1468 = null;
		class57.field1455 = null;
		class57.field1461 = null;
		field1450 = null;
		class57.field1449 = null;
		class57.field1453 = null;
		class57.field1458 = null;
		field1457 = null;
		class57.field1465 = null;
	}

	@ObfuscatedName("je.c(B)V")
	public static void method565() {
		if (class63.field1587 != 0 || class122.field3050 != 1) {
			return;
		}
		int var0 = class112.field2762 - 575;
		int var1 = class1.field14 - 4 - 5;
		if (var0 < 0 || var1 < 0 || var0 >= 146 || var1 >= 151) {
			return;
		}
		var1 -= 75;
		var0 -= 73;
		int var2 = class86.field2158 + class113.field2797 & 0x7FF;
		int var3 = class27.field775[var2];
		int var4 = class27.field778[var2];
		int var5 = (class103.field2589 + 256) * var4 >> 8;
		int var6 = (class103.field2589 + 256) * var3 >> 8;
		int var7 = var1 * var6 + var0 * var5 >> 11;
		int var8 = var1 * var5 - var0 * var6 >> 11;
		int var9 = field2621.field1972 + var7 >> 7;
		int var10 = field2621.field1963 - var8 >> 7;
		boolean var11 = method576(0, 0, field2621.field1962[0], var9, 0, true, 0, 0, field2621.field2009[0], var10, 1);
		if (!var11) {
			return;
		}
		class70.field1726.method141(var0);
		class70.field1726.method141(var1);
		class70.field1726.method150(class113.field2797);
		class70.field1726.method141(57);
		class70.field1726.method141(class86.field2158);
		class70.field1726.method141(class103.field2589);
		class70.field1726.method141(89);
		class70.field1726.method150(field2621.field1972);
		class70.field1726.method150(field2621.field1963);
		class70.field1726.method141(class114.field2809);
		class70.field1726.method141(63);
		return;
	}

	@ObfuscatedName("d.a(IBLbd;I)Lbc;")
	public static class10 method294(int arg0, class11 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method965() : null;
	}

	@ObfuscatedName("n.b(I)V")
	public static void method716() {
		class6.field224 = false;
		class112.field2761 = -1;
		class42.field1104 = 0;
		class100.field2547 = 0;
		class70.field1726.field267 = 0;
		class1.field36 = -1;
		class15.field498 = -1;
		class75.field1855 = 0;
		class99.field2434 = -1;
		class35.field941 = 0;
		class63.field1587 = 0;
		class114.field2813 = 0;
		class15.field488.field267 = 0;
		for (int var0 = 0; var0 < class80.field2030.length; var0++) {
			if (class80.field2030[var0] != null) {
				class80.field2030[var0].field2011 = -1;
			}
		}
		for (int var1 = 0; var1 < class120.field2992.length; var1++) {
			if (class120.field2992[var1] != null) {
				class120.field2992[var1].field2011 = -1;
			}
		}
		method399(30);
	}

	@ObfuscatedName("qb.a(B)V")
	public static void method843() {
		class98.field2420 = null;
		field2415 = null;
		class98.field2406 = null;
		class98.field2412 = null;
		class98.field2405 = null;
		class98.field2407 = null;
		class98.field2408 = null;
	}

	@ObfuscatedName("mb.b(B)V")
	public static void method688() {
		while (true) {
			if (class15.field488.method407(class100.field2547) >= 11) {
				int var0 = class15.field488.method412(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (class80.field2030[var0] == null) {
						class80.field2030[var0] = new class2();
						if (class45.field1176[var0] != null) {
							class80.field2030[var0].method43(class45.field1176[var0]);
						}
						var1 = true;
					}
					class112.field2758[class118.field2939++] = var0;
					class2 var2 = class80.field2030[var0];
					var2.field2008 = class82.field2063;
					int var3 = class15.field488.method412(5);
					int var4 = class15.field488.method412(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = class19.field644[class15.field488.method412(3)];
					if (var1) {
						var2.field1992 = var5;
					}
					int var6 = class15.field488.method412(1);
					int var7 = class15.field488.method412(1);
					if (var7 == 1) {
						class50.field1348[class80.field2027++] = var0;
					}
					var2.method729(field2621.field2009[0] + var4, var6 == 1, field2621.field1962[0] + var3);
					continue;
				}
			}
			class15.field488.method408();
			return;
		}
	}

	@ObfuscatedName("oe.a(I)V")
	public static void method759() {
		class89.field2174 = null;
		field2187 = null;
		class89.field2173 = null;
		class89.field2179 = null;
		class89.field2181 = null;
		class89.field2172 = null;
		class89.field2178 = null;
		field2170 = null;
		class89.field2183 = null;
	}

	@ObfuscatedName("wc.a(IB)Lqd;")
	public static class100 method1053(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (field2922[var1] == null || field2922[var1][var2] == null) {
			boolean var3 = method1052(var1);
			if (!var3) {
				return null;
			}
		}
		return field2922[var1][var2];
	}

	@ObfuscatedName("kd.a(Z)V")
	public static void method616() {
		class64.field1632 = null;
		class64.field1605 = null;
		class64.field1631 = null;
		class64.field1625 = null;
		class64.field1601 = null;
		class64.field1611 = null;
		field1598 = null;
		class64.field1618 = null;
		class64.field1599 = null;
		class64.field1622 = null;
	}

	@ObfuscatedName("tc.a(IIII)I")
	public static int method964(int arg0, int arg1, int arg2) {
		if ((class34.field898[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (class34.field898[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("tb.a(IZ)V")
	public static void method957(boolean arg0) {
		if (field2621.field1972 >> 7 == class35.field941 && field2621.field1963 >> 7 == class108.field2720) {
			class35.field941 = 0;
		}
		int var1 = class118.field2939;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3;
			class2 var4;
			if (arg0) {
				var3 = 33538048;
				var4 = field2621;
			} else {
				var3 = class112.field2758[var2] << 14;
				var4 = class80.field2030[class112.field2758[var2]];
			}
			if (var4 != null && var4.method42()) {
				var4.field95 = false;
				int var5 = var4.field1972 >> 7;
				int var6 = var4.field1963 >> 7;
				if ((class93.field2332 && class118.field2939 > 50 || class118.field2939 > 200) && !arg0 && var4.field2000 == var4.field1951) {
					var4.field95 = true;
				}
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var4.field73 == null || var4.field91 > class82.field2063 || class82.field2063 >= var4.field82) {
						if ((var4.field1972 & 0x7F) == 64 && (var4.field1963 & 0x7F) == 64) {
							if (class121.field3015[var5][var6] == class97.field2399) {
								continue;
							}
							class121.field3015[var5][var6] = class97.field2399;
						}
						var4.field84 = method712(field75, var4.field1972, var4.field1963);
						field3183.method90(field75, var4.field1972, var4.field1963, var4.field84, 60, var4, var4.field1992, var3, var4.field1979);
					} else {
						var4.field95 = false;
						var4.field84 = method712(field75, var4.field1972, var4.field1963);
						field3183.method68(field75, var4.field1972, var4.field1963, var4.field84, var4, var4.field1992, var3, var4.field66, var4.field89, var4.field70, var4.field97);
					}
				}
			}
		}
	}

	@ObfuscatedName("ld.b(I)I")
	public static int method662() {
		return class92.field2293++;
	}

	@ObfuscatedName("bb.b(I)V")
	public static void method189() {
		int var0 = field1746 * 128 + 64;
		int var1 = field1187 * 128 + 64;
		int var2 = method712(field75, var1, var0) - field316;
		if (var1 > field709) {
			field709 += (var1 - field709) * field2918 / 1000 + field239;
			if (field709 > var1) {
				field709 = var1;
			}
		}
		if (var2 > field1748) {
			field1748 += (var2 - field1748) * field2918 / 1000 + field239;
			if (var2 < field1748) {
				field1748 = var2;
			}
		}
		if (field709 > var1) {
			field709 -= field239 + (field709 - var1) * field2918 / 1000;
			if (var1 > field709) {
				field709 = var1;
			}
		}
		if (field1200 < var0) {
			field1200 += field239 + (var0 - field1200) * field2918 / 1000;
			if (field1200 > var0) {
				field1200 = var0;
			}
		}
		if (field1748 > var2) {
			field1748 -= (field1748 - var2) * field2918 / 1000 + field239;
			if (var2 > field1748) {
				field1748 = var2;
			}
		}
		int var3 = field1270 * 128 + 64;
		if (field1200 > var0) {
			field1200 -= (field1200 - var0) * field2918 / 1000 + field239;
			if (field1200 < var0) {
				field1200 = var0;
			}
		}
		int var4 = field1895 * 128 + 64;
		int var5 = method712(field75, var3, var4) - field1940;
		int var6 = var5 - field1748;
		int var7 = var4 - field1200;
		int var8 = var3 - field709;
		int var9 = (int) Math.sqrt((double) (var8 * var8 + var7 * var7));
		int var10 = (int) (Math.atan2((double) var6, (double) var9) * 325.949D) & 0x7FF;
		if (var10 < 128) {
			var10 = 128;
		}
		int var11 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
		if (var10 > 383) {
			var10 = 383;
		}
		int var12 = var11 - field184;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (var12 > 0) {
			field184 += field1029 * var12 / 1000 + field2945;
			field184 &= 0x7FF;
		}
		if (var12 < 0) {
			field184 -= field2945 + -var12 * field1029 / 1000;
			field184 &= 0x7FF;
		}
		if (var10 > field1400) {
			field1400 += (var10 - field1400) * field1029 / 1000 + field2945;
			if (field1400 > var10) {
				field1400 = var10;
			}
		}
		if (field1400 > var10) {
			field1400 -= (field1400 - var10) * field1029 / 1000 + field2945;
			if (field1400 < var10) {
				field1400 = var10;
			}
		}
		int var13 = var11 - field184;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			field184 = var11;
		}
	}

	@ObfuscatedName("h.a(IILaa;I)V")
	public static void method450(int arg0, int arg1, class2 arg2) {
		if (arg2.field2015 == arg0 && arg0 != -1) {
			int var3 = method103(arg0).field1240;
			if (var3 == 1) {
				arg2.field1978 = 0;
				arg2.field1969 = 0;
				arg2.field1996 = arg1;
				arg2.field1989 = 0;
			}
			if (var3 == 2) {
				arg2.field1969 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.field2015 == -1 || method103(arg0).field1251 >= method103(arg2.field2015).field1251) {
			arg2.field1968 = arg2.field1983;
			arg2.field1978 = 0;
			arg2.field1989 = 0;
			arg2.field1969 = 0;
			arg2.field1996 = arg1;
			arg2.field2015 = arg0;
		}
	}

	@ObfuscatedName("fa.b(I)V")
	public static void method388() {
		class32.field850 = null;
		class32.field863 = null;
		class32.field858 = null;
		class32.field855 = null;
		class32.field852 = null;
		class32.field859 = null;
		class32.field865 = null;
		class32.field861 = null;
		field856 = null;
		class32.field862 = null;
		class32.field854 = null;
		field851 = null;
	}

	@ObfuscatedName("nc.a(B)V")
	public static void method735() {
		class81.field2037 = null;
		field2044 = null;
		class81.field2036 = null;
		class81.field2054 = null;
		class81.field2048 = null;
		field2055 = null;
		class81.field2041 = null;
		class81.field2056 = null;
		class81.field2051 = null;
		class81.field2035 = null;
		field2045 = null;
		class81.field2047 = null;
		class81.field2052 = null;
	}

	@ObfuscatedName("s.b(I)V")
	public static void method899() {
		class81.field2054 = class82.field2070;
		class32.field865 = class128.field3145;
		client.field602 = class78.field1928;
		class1.field63 = class23.field719;
		class74.field1807 = class75.field1870;
		class80.field2033 = class127.field3115;
		class9.field326 = class127.field3113;
		class112.field2757 = class114.field2804;
		class75.field1873 = class78.field1920;
		class103.field2598 = class28.field810;
		class129.field3172 = class93.field2329;
		class82.field2066 = class63.field1581;
		class97.field2393 = class42.field1127;
		class59.field1498 = class116.field2903;
		class117.field2928 = class42.field1127;
		class134.field3302 = class131.field3197;
		class82.field2103 = class133.field3280;
		class37.field1006 = class118.field2933;
		class42.field1106 = class74.field1840;
		class32.field862 = class78.field1908;
		class82.field2095 = class129.field3169;
		class62.field1545 = class47.field1244;
		class108.field2707 = class133.field3276;
		class134.field3305 = class127.field3124;
		class78.field1921 = class72.field1758;
		class82.field2096 = class106.field2681;
		class28.field793 = class133.field3279;
		class93.field2337 = class49.field1343;
		class15.field497 = class34.field902;
		class122.field3045 = class81.field2035;
		class106.field2667 = class48.field1269;
		class82.field2097 = class19.field634;
		class82.field2083 = class129.field3169;
		class105.field2639 = class17.field547;
		class34.field900 = class12.field414;
		class32.field855 = class78.field1908;
		class24.field738 = class95.field2381;
		class17.field539 = class105.field2654;
		class23.field720 = class118.field2941;
		class46.field1215 = class54.field1439;
		class80.field2012 = class64.field1611;
		class112.field2767 = class39.field1077;
		class82.field2090 = class129.field3169;
		class82.field2079 = class129.field3169;
		class123.field3057 = class130.field3191;
		class82.field2089 = class129.field3169;
		class114.field2805 = class53.field1403;
		class82.field2091 = class129.field3169;
		class130.field3193 = class99.field2429;
		class134.field3295 = class46.field1214;
		class24.field726 = class93.field2335;
		class95.field2354 = class38.field1011;
		class97.field2391 = class53.field1404;
		class63.field1593 = class120.field2978;
		class121.field3002 = class107.field2687;
		class102.field2583 = class132.field3216;
		class73.field1782 = class133.field3258;
		class76.field1896 = class98.field2420;
		class128.field3138 = class120.field2995;
		class4.field183 = class1.field48;
		class42.field1094 = class106.field2685;
		class45.field1174 = class112.field2764;
		class133.field3265 = class78.field1915;
		class130.field3187 = class38.field1044;
		class52.field1364 = class50.field1345;
		class82.field2077 = class78.field1927;
		class28.field796 = class59.field1494;
		class60.field1522 = class45.field1180;
		class67.field1676 = class75.field1858;
		class85.field2135 = class28.field791;
		class81.field2041 = class109.field2730;
		class121.field3001 = class39.field1079;
		class15.field487 = class44.field1171;
		class100.field2546 = class59.field1503;
		class85.field2139 = class99.field2438;
		class43.field1152 = class8.field310;
		class103.field2602 = class75.field1853;
		class132.field3239 = class79.field1944;
		class15.field507 = class23.field712;
		class103.field2610 = class129.field3151;
		class82.field2088 = class129.field3169;
		class82.field2068 = class36.field976;
		client.field584 = class123.field3070;
		class8.field303 = class34.field890;
		class102.field2575 = class129.field3148;
		class32.field861 = class128.field3145;
		class28.field785 = class81.field2051;
		class32.field858 = class78.field1908;
		class82.field2106 = class129.field3169;
		class82.field2071 = class129.field3169;
		class46.field1217 = client.field578;
		class93.field2319 = class80.field2028;
		class95.field2360 = class38.field1011;
		class2.field94 = class95.field2378;
		class82.field2110 = class129.field3169;
		class52.field1362 = class52.field1386;
		class2.field64 = class130.field3190;
		class16.field521 = class99.field2432;
		class14.field452 = class24.field732;
		class105.field2634 = class95.field2359;
		class82.field2092 = class129.field3169;
		class117.field2931 = class105.field2644;
		class38.field1024 = class64.field1632;
		class82.field2086 = class63.field1576;
		class46.field1219 = class123.field3064;
		class127.field3127 = class120.field2993;
		class85.field2140 = class28.field791;
		class60.field1510 = class106.field2662;
		class82.field2094 = class63.field1581;
		class79.field1933 = class70.field1745;
		class38.field1030 = class23.field702;
		class62.field1561 = class114.field2824;
		class82.field2109 = class78.field1908;
		class53.field1392 = class73.field1785;
		class63.field1597 = class12.field418;
		class42.field1142 = class35.field929;
		class97.field2400 = class39.field1073;
		class32.field850 = class106.field2679;
		class82.field2111 = class15.field499;
		class123.field3072 = class81.field2036;
		class132.field3219 = class32.field854;
		class82.field2113 = class129.field3169;
		class82.field2080 = class118.field2940;
		class82.field2067 = class129.field3169;
		class46.field1195 = class82.field2102;
		class79.field1930 = class2.field93;
		class73.field1789 = class23.field716;
		class62.field1557 = class130.field3184;
		class112.field2763 = class1.field59;
		class102.field2576 = class129.field3170;
		class79.field1931 = class114.field2812;
		class38.field1037 = class102.field2562;
		class82.field2093 = class63.field1576;
		class100.field2477 = class132.field3225;
		class86.field2157 = class120.field2977;
		class46.field1203 = class4.field172;
		class100.field2490 = class28.field790;
		class63.field1594 = class28.field795;
		class98.field2407 = class122.field3051;
		class9.field315 = class102.field2563;
		class99.field2431 = class16.field526;
		class72.field1778 = class130.field3189;
		class6.field231 = class74.field1794;
		class114.field2817 = class120.field2980;
		class54.field1432 = class14.field467;
		class19.field666 = client.field598;
		class54.field1431 = class81.field2048;
		class31.field833 = class43.field1147;
		class85.field2126 = class127.field3125;
		class113.field2778 = class2.field77;
		class38.field1038 = class43.field1150;
		class121.field3008 = class32.field859;
		class100.field2480 = class72.field1776;
		class67.field1657 = class36.field962;
		class42.field1120 = class64.field1618;
		class76.field1885 = class52.field1382;
		class82.field2081 = class129.field3169;
		class36.field957 = class99.field2436;
		class93.field2325 = class127.field3120;
		class85.field2149 = class80.field2032;
		class38.field1043 = class99.field2426;
		class122.field3054 = class14.field474;
		class82.field2074 = class129.field3169;
		class93.field2310 = class86.field2164;
		class42.field1111 = class64.field1618;
		class82.field2104 = class17.field538;
		class131.field3205 = class54.field1436;
		class42.field1102 = class32.field852;
		class93.field2317 = class38.field1022;
		class57.field1449 = class47.field1238;
		class133.field3252 = class121.field3006;
		class1.field49 = class23.field706;
		class93.field2308 = class53.field1406;
		class92.field2296 = class49.field1339;
		class74.field1819 = class64.field1622;
		class5.field218 = class53.field1402;
		class102.field2580 = class11.field409;
		class121.field3012 = class89.field2174;
		class82.field2078 = class129.field3169;
		class53.field1407 = class76.field1883;
		class106.field2675 = class23.field717;
		class35.field926 = class6.field232;
		class38.field1031 = class23.field703;
		class11.field408 = class47.field1232;
		class75.field1874 = class92.field2299;
		class72.field1762 = class85.field2141;
		class95.field2382 = class48.field1264;
		client.field582 = class31.field838;
		class60.field1527 = class23.field707;
		class89.field2178 = class92.field2279;
		class59.field1482 = class109.field2732;
		class57.field1463 = class93.field2336;
		class81.field2056 = class54.field1430;
		class23.field718 = class2.field98;
		class102.field2582 = class12.field431;
		class45.field1184 = class98.field2420;
		class31.field836 = class36.field977;
		class82.field2061 = class108.field2708;
		class108.field2714 = class59.field1487;
		class80.field1998 = class92.field2304;
		class118.field2948 = class100.field2522;
		class85.field2138 = class5.field215;
		class39.field1076 = class24.field743;
		class82.field2100 = class92.field2298;
		class59.field1501 = class39.field1067;
		class98.field2405 = class15.field505;
		class19.field671 = class105.field2657;
		class89.field2172 = class92.field2279;
		class35.field932 = class2.field83;
		class14.field468 = class116.field2901;
		class82.field2101 = class129.field3169;
	}

	@ObfuscatedName("ra.a(B)V")
	public static void method873() {
		class11.field379.method267();
	}

	@ObfuscatedName("de.a(I)V")
	public static void method323() {
		for (int var0 = 0; var0 < class80.field2027; var0++) {
			int var1 = class50.field1348[var0];
			class130 var2 = class120.field2992[var1];
			int var3 = class15.field488.method144();
			if ((var3 & 0x1) != 0) {
				int var4 = class15.field488.method152();
				int var5 = class15.field488.method156();
				var2.method727(var5, class82.field2063, var4);
				var2.field2013 = class82.field2063 + 300;
				var2.field2004 = class15.field488.method152();
				var2.field1975 = class15.field488.method144();
			}
			if ((var3 & 0x20) != 0) {
				var2.field1965 = class15.field488.method180();
				int var6 = class15.field488.method167();
				var2.field2003 = 0;
				var2.field1967 = (var6 & 0xFFFF) + class82.field2063;
				var2.field1984 = var6 >> 16;
				var2.field2014 = 0;
				if (var2.field1967 > class82.field2063) {
					var2.field2014 = -1;
				}
				if (var2.field1965 == 65535) {
					var2.field1965 = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				var2.field2011 = class15.field488.method137();
				if (var2.field2011 == 65535) {
					var2.field2011 = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				int var7 = class15.field488.method152();
				int var8 = class15.field488.method144();
				var2.method727(var8, class82.field2063, var7);
				var2.field2013 = class82.field2063 + 300;
				var2.field2004 = class15.field488.method156();
				var2.field1975 = class15.field488.method156();
			}
			if ((var3 & 0x40) != 0) {
				var2.field1964 = class15.field488.method140();
				var2.field1952 = 100;
			}
			if ((var3 & 0x80) != 0) {
				var2.field3182 = method864(class15.field488.method137());
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
				var2.field2022 = class15.field488.method137();
				var2.field1974 = class15.field488.method166();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = class15.field488.method137();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = class15.field488.method147();
				if (var2.field2015 == var9 && var9 != -1) {
					int var11 = method103(var9).field1240;
					if (var11 == 1) {
						var2.field1989 = 0;
						var2.field1969 = 0;
						var2.field1978 = 0;
						var2.field1996 = var10;
					}
					if (var11 == 2) {
						var2.field1969 = 0;
					}
				} else if (var9 == -1 || var2.field2015 == -1 || method103(var9).field1251 >= method103(var2.field2015).field1251) {
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

	@ObfuscatedName("fc.a(II)V")
	public static void method397() {
		method749(0, false, null, 10);
	}

	@ObfuscatedName("fd.a(IZI[BI)V")
	public static void method406(int arg0, boolean arg1, int arg2, byte[] arg3) {
		if (field311 == null) {
			return;
		}
		if (class122.field3030 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			class62.field1548 = arg2;
			if (class122.field3030 == 0) {
				class8.field302 = 0;
			} else {
				int var4 = method632(class122.field3030);
				int var5 = var4 - class81.field2046;
				class8.field302 = (arg2 + var5 + 3600 - 1) / arg2;
			}
			field78 = arg3;
			field975 = arg0;
			field1662 = arg1;
		} else if (class62.field1548 == 0) {
			method7(arg1, arg3, arg0);
		} else {
			field975 = arg0;
			field1662 = arg1;
			field78 = arg3;
		}
	}

	@ObfuscatedName("oa.a(B)V")
	public static void method750() {
		class85.field2126 = null;
		class85.field2141 = null;
		class85.field2139 = null;
		class85.field2127 = null;
		class85.field2150 = null;
		class85.field2136 = null;
		field2151 = null;
		field2131 = null;
		class85.field2133 = null;
		class85.field2128 = null;
		class85.field2143 = null;
		class85.field2135 = null;
		class85.field2149 = null;
		class85.field2140 = null;
		class85.field2138 = null;
	}

	@ObfuscatedName("ga.a(BLjava/awt/Component;)V")
	public static void method422(Component arg0) {
		arg0.removeKeyListener(class117.field2924);
		arg0.removeFocusListener(class117.field2924);
	}

	@ObfuscatedName("jc.a(IJ)V")
	public static void method544(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < class85.field2146; var2++) {
			if (class106.field2683[var2] == arg0) {
				class39.field1055 = true;
				class85.field2146--;
				for (int var3 = var2; var3 < class85.field2146; var3++) {
					class106.field2683[var3] = class106.field2683[var3 + 1];
				}
				class70.field1726.method415(28);
				class70.field1726.method157(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("qb.a(I[Lqd;IIIIIIIIII)V")
	public static void method844(int arg0, class100[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg2 > arg7 || arg4 < arg8 || arg7 >= arg10 || arg4 >= arg0) {
			return;
		}
		for (int var11 = 0; var11 < arg1.length; var11++) {
			class100 var12 = arg1[var11];
			if (var12 != null && var12.field2454 == arg5) {
				int var13 = var12.field2502 + arg8 - arg3;
				int var14 = var12.field2462 + arg2 - arg9;
				if (var12.field2489 == 8 && var14 <= arg7 && var13 <= arg4 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
					class59.field1497 = var11;
				}
				if ((var12.field2527 >= 0 || var12.field2525 != 0) && var14 <= arg7 && var13 <= arg4 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
					if (var12.field2527 >= 0) {
						class34.field903 = var12.field2527;
					} else {
						class34.field903 = var11;
					}
				}
				if (var12.field2489 != 0) {
					if (var12.field2520 == 1 && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && var12.field2449 + var13 > arg4) {
						boolean var15 = false;
						if (var12.field2445 != 0) {
							var15 = method104(var12);
						}
						if (!var15) {
							method398(0, var12.field2482, var12.field2495, 0, 42, class132.field3234);
						}
					}
					if (var12.field2520 == 2 && client.field594 == 0 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var13 + var12.field2449) {
						method398(0, var12.field2470, var12.field2495, 0, 33, method956(new class1[] { class102.field2564, var12.field2515 }));
					}
					if (var12.field2520 == 3 && arg7 >= var14 && arg4 >= var13 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						byte var16;
						if (arg6 == 3) {
							var16 = 40;
						} else {
							var16 = 9;
						}
						method398(0, class93.field2310, var12.field2495, 0, var16, class132.field3234);
					}
					if (var12.field2520 == 4 && arg7 >= var14 && var13 <= arg4 && arg7 < var12.field2498 + var14 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 23, class132.field3234);
					}
					if (var12.field2520 == 5 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 57, class132.field3234);
					}
					if (var12.field2520 == 6 && class120.field2998 == -1 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && arg4 < var12.field2449 + var13) {
						method398(0, var12.field2482, var12.field2495, 0, 54, class132.field3234);
					}
					if (var12.field2489 == 2) {
						int var17 = 0;
						for (int var18 = 0; var18 < var12.field2449; var18++) {
							for (int var19 = 0; var19 < var12.field2498; var19++) {
								int var20 = (var12.field2555 + 32) * var19 + var14;
								int var21 = var13 + (var12.field2473 + 32) * var18;
								if (var17 < 20) {
									var20 += var12.field2505[var17];
									var21 += var12.field2514[var17];
								}
								if (arg7 >= var20 && var21 <= arg4 && var20 + 32 > arg7 && arg4 < var21 + 32) {
									class43.field1145 = var12.field2495;
									class108.field2704 = var17;
									if (var12.field2491[var17] > 0) {
										class115 var22 = method760(var12.field2491[var17] - 1);
										if (class14.field475 == 1 && var12.field2533) {
											if (field1075 != var12.field2495 || field2281 != var17) {
												method398(var22.field2883, client.field584, var12.field2495, var17, 56, method956(new class1[] { class130.field3177, class9.field328, var22.field2827 }));
											}
										} else if (client.field594 != 1 || !var12.field2533) {
											class1[] var23 = var22.field2830;
											if (class118.field2934) {
												var23 = method905(var23);
											}
											if (var12.field2533) {
												for (int var24 = 4; var24 >= 3; var24--) {
													if (var23 != null && var23[var24] != null) {
														byte var25;
														if (var24 == 3) {
															var25 = 43;
														} else {
															var25 = 11;
														}
														method398(var22.field2883, var23[var24], var12.field2495, var17, var25, method956(new class1[] { class93.field2334, var22.field2827 }));
													} else if (var24 == 4) {
														method398(var22.field2883, class15.field487, var12.field2495, var17, 11, method956(new class1[] { class93.field2334, var22.field2827 }));
													}
												}
											}
											if (var12.field2461) {
												method398(var22.field2883, client.field584, var12.field2495, var17, 19, method956(new class1[] { class93.field2334, var22.field2827 }));
											}
											if (var12.field2533 && var23 != null) {
												for (int var26 = 2; var26 >= 0; var26--) {
													if (var23[var26] != null) {
														byte var27 = 0;
														if (var26 == 0) {
															var27 = 52;
														}
														if (var26 == 1) {
															var27 = 6;
														}
														if (var26 == 2) {
															var27 = 31;
														}
														method398(var22.field2883, var23[var26], var12.field2495, var17, var27, method956(new class1[] { class93.field2334, var22.field2827 }));
													}
												}
											}
											class1[] var28 = var12.field2504;
											if (class118.field2934) {
												var28 = method905(var28);
											}
											if (var28 != null) {
												for (int var29 = 4; var29 >= 0; var29--) {
													if (var28[var29] != null) {
														byte var30 = 0;
														if (var29 == 0) {
															var30 = 53;
														}
														if (var29 == 1) {
															var30 = 25;
														}
														if (var29 == 2) {
															var30 = 55;
														}
														if (var29 == 3) {
															var30 = 48;
														}
														if (var29 == 4) {
															var30 = 24;
														}
														method398(var22.field2883, var28[var29], var12.field2495, var17, var30, method956(new class1[] { class93.field2334, var22.field2827 }));
													}
												}
											}
											method398(var22.field2883, class114.field2805, var12.field2495, var17, 1006, method956(new class1[] { class93.field2334, var22.field2827 }));
										} else if ((field2846 & 0x10) == 16) {
											method398(var22.field2883, class60.field1523, var12.field2495, var17, 37, method956(new class1[] { class52.field1384, class9.field328, var22.field2827 }));
										}
									}
								}
								var17++;
							}
						}
					}
					if (var12.field2442 && var12.field2524 != -1 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
						class115 var31 = method760(var12.field2524);
						if (var12.field2533) {
							class1[] var32 = var31.field2830;
							if (class118.field2934) {
								var32 = method905(var32);
							}
							if (var32 == null || var32[4] == null) {
								method398(var31.field2883, class15.field487, var12.field2495, var12.field2542 - 1, 11, method956(new class1[] { class93.field2334, var31.field2827 }));
							} else {
								method398(var31.field2883, var32[4], var12.field2495, var12.field2542 - 1, 11, method956(new class1[] { class93.field2334, var31.field2827 }));
							}
							if (var32 != null && var32[3] != null) {
								method398(var31.field2883, var32[3], var12.field2495, var12.field2542 - 1, 43, method956(new class1[] { class93.field2334, var31.field2827 }));
							}
							if (var32 != null && var32[2] != null) {
								method398(var31.field2883, var32[2], var12.field2495, var12.field2542 - 1, 31, method956(new class1[] { class93.field2334, var31.field2827 }));
							}
							if (var32 != null && var32[1] != null) {
								method398(var31.field2883, var32[1], var12.field2495, var12.field2542 - 1, 6, method956(new class1[] { class93.field2334, var31.field2827 }));
							}
							if (var32 != null && var32[0] != null) {
								method398(var31.field2883, var32[0], var12.field2495, var12.field2542 - 1, 52, method956(new class1[] { class93.field2334, var31.field2827 }));
							}
						}
						if (var12.field2495 >= 0) {
							method398(var31.field2883, class114.field2805, var12.field2495, -1, 1007, method956(new class1[] { class93.field2334, var31.field2827 }));
						} else {
							method398(var31.field2883, class114.field2805, var12.field2454, var12.field2495 & 0x7FFF, 1007, method956(new class1[] { class93.field2334, var31.field2827 }));
						}
					}
					if (var12.field2494 && var12.field2467 != null && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						class1 var33 = class132.field3234;
						if (var12.field2524 != -1) {
							class115 var34 = method760(var12.field2524);
							var33 = method956(new class1[] { class93.field2334, var34.field2827 });
						}
						for (int var35 = var12.field2467.length - 1; var35 >= 0; var35--) {
							if (var12.field2467[var35] != null) {
								if (var12.field2495 < 0) {
									method398(var35 + 1, var12.field2467[var35], var12.field2454, var12.field2495 & 0x7FFF, 50, var33);
								} else {
									method398(var35 + 1, var12.field2467[var35], var12.field2495, 0, 50, var33);
								}
							}
						}
					}
				} else if (!var12.field2556 || method631(arg6, var11) || class36.field953) {
					method844(var12.field2449 + var13, arg1, var14, var12.field2537, arg4, var11, arg6, arg7, var13, var12.field2552, var14 + var12.field2498);
					if (var12.field2519 != null) {
						method844(var13 + var12.field2449, var12.field2519, var14, var12.field2537, arg4, var12.field2495, arg6, arg7, var13, var12.field2552, var12.field2498 + var14);
					}
					if (var12.field2449 < var12.field2526) {
						method192(var12.field2449, arg4, arg7, var12.field2526, var12, var12.field2498 + var14, arg6, var13);
					}
				}
			}
		}
	}

	@ObfuscatedName("ca.a(Ljava/lang/Throwable;Ljava/lang/String;)Lha;")
	public static class43 method259(Throwable arg0, String arg1) {
		class43 var2;
		if (arg0 instanceof class43) {
			var2 = (class43) arg0;
			var2.field1156 = var2.field1156 + ' ' + arg1;
		} else {
			var2 = new class43(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("i.a(I)V")
	public static void method500() {
		Object var0 = class5.field213;
		synchronized (class5.field213) {
			if (class8.field307 == 0) {
				field1071.method656(5, new class89());
			}
			class8.field307 = 600;
		}
	}

	@ObfuscatedName("vc.a(II)V")
	public static void method1018(int arg0) {
		if (!method1052(arg0)) {
			return;
		}
		class100[] var1 = field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			class100 var3 = var1[var2];
			if (var3.field2483 != null) {
				method754(var3.field2483, 0, var3, 0);
			}
		}
	}

	@ObfuscatedName("md.a(Lbd;B)V")
	public static void method702(class11 arg0) {
		field2024 = arg0;
	}

	@ObfuscatedName("kc.b(B)V")
	public static void method600() {
		class80.field2027 = 0;
		class31.field841 = 0;
		method728();
		method633();
		method688();
		method837();
		for (int var0 = 0; var0 < class31.field841; var0++) {
			int var1 = class11.field375[var0];
			if (class82.field2063 != class80.field2030[var1].field2008) {
				class80.field2030[var1] = null;
			}
		}
		if (class100.field2547 != class15.field488.field267) {
			throw new RuntimeException("gpp1 pos:" + class15.field488.field267 + " psize:" + class100.field2547);
		}
		for (int var2 = 0; var2 < class118.field2939; var2++) {
			if (class80.field2030[class112.field2758[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class118.field2939);
			}
		}
	}

	@ObfuscatedName("ld.c(I)V")
	public static void method663() {
		class70.field1753 = null;
		field1747 = null;
		class70.field1745 = null;
		class70.field1751 = null;
		class70.field1740 = null;
		class70.field1726 = null;
		field1752 = null;
	}

	@ObfuscatedName("ra.a(II)V")
	public static void method874(int arg0) {
		if (arg0 == -1 && class75.field1860 == 0) {
			method669();
		} else if (arg0 != -1 && class122.field3037 != arg0 && class62.field1554 != 0 && class75.field1860 == 0) {
			method670(class62.field1554, arg0, field2702, 0);
		}
		class122.field3037 = arg0;
	}

	@ObfuscatedName("ua.c(I)V")
	public static void method988() {
		class121.field3015 = null;
		class121.field3026 = null;
		field3025 = null;
		field3021 = null;
		class121.field3003 = null;
		class121.field3002 = null;
		class121.field3009 = null;
		class121.field3006 = null;
		class121.field3019 = null;
		class121.field3017 = null;
		class121.field3018 = null;
		class121.field3005 = null;
		class121.field3001 = null;
		class121.field3012 = null;
		class121.field3008 = null;
		class121.field3020 = null;
		class121.field3007 = null;
	}

	@ObfuscatedName("oe.a(II)Lta;")
	public static class115 method760(int arg0) {
		class115 var1 = (class115) class39.field1066.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1405.method217(arg0, 10);
		class115 var3 = new class115();
		var3.field2883 = arg0;
		if (var2 != null) {
			var3.method952(new class8(var2));
		}
		var3.method942();
		if (var3.field2838 != -1) {
			var3.method953(method760(var3.field2838), method760(var3.field2843));
		}
		if (!field2384 && var3.field2880) {
			var3.field2830 = null;
			var3.field2854 = 0;
			var3.field2835 = null;
			var3.field2827 = class59.field1501;
		}
		class39.field1066.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("f.a(I)V")
	public static void method384() {
		for (int var0 = -1; var0 < class118.field2939; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = class112.field2758[var0];
			}
			class2 var2 = class80.field2030[var1];
			if (var2 != null) {
				method319(var2, 1);
			}
		}
	}

	@ObfuscatedName("ec.a(Lbd;BLa;La;)[Le;")
	public static class25[] method372(class11 arg0, class1 arg1, class1 arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method518(arg0, var4, var3);
	}

	@ObfuscatedName("pe.a(III[La;)La;")
	public static class1 method825(int arg0, int arg1, class1[] arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			if (arg2[arg1 + var4] == null) {
				arg2[arg1 + var4] = class64.field1625;
			}
			var3 += arg2[arg1 + var4].field26;
		}
		byte[] var5 = new byte[var3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg0; var7++) {
			class1 var8 = arg2[arg1 + var7];
			class33.method392(var8.field38, 0, var5, var6, var8.field26);
			var6 += var8.field26;
		}
		class1 var9 = new class1();
		var9.field26 = var3;
		var9.field38 = var5;
		return var9;
	}

	@ObfuscatedName("fc.a(ILa;IIIILa;)V")
	public static void method398(int arg0, class1 arg1, int arg2, int arg3, int arg4, class1 arg5) {
		if (class42.field1104 >= 500) {
			return;
		}
		if (arg5.method10() <= 0) {
			class102.field2586[class42.field1104] = arg1;
		} else {
			class102.field2586[class42.field1104] = method956(new class1[] { arg1, class93.field2337, arg5 });
		}
		class79.field1932[class42.field1104] = arg4;
		class72.field1770[class42.field1104] = arg0;
		class37.field994[class42.field1104] = arg3;
		class117.field2925[class42.field1104] = arg2;
		class42.field1104++;
	}

	@ObfuscatedName("fa.b(IB)Lia;")
	public static class49 method389(int arg0) {
		class49 var1 = (class49) class113.field2788.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field698.method217(arg0, 6);
		class49 var3 = new class49();
		var3.field1321 = arg0;
		if (var2 != null) {
			var3.method508(new class8(var2));
		}
		var3.method510();
		if (var3.field1301) {
			var3.field1284 = false;
			var3.field1311 = false;
		}
		class113.field2788.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("kd.a(ZI)V")
	public static void method617(boolean arg0) {
		if (field2769 == null) {
			return;
		}
		try {
			class8 var1 = new class8(4);
			var1.method141(arg0 ? 2 : 3);
			var1.method153(0);
			field2769.method1016(4, var1.field284);
		} catch (IOException var3) {
			try {
				field2769.method1015();
			} catch (Exception var2) {
			}
			field2769 = null;
			class16.field525++;
		}
	}

	@ObfuscatedName("wb.a(ZII[B)I")
	public static int method1044(int arg0, int arg1, byte[] arg2) {
		int var3 = -1;
		for (int var4 = arg0; var4 < arg1; var4++) {
			var3 = class107.field2698[(var3 ^ arg2[var4]) & 0xFF] ^ var3 >>> 8;
		}
		return ~var3;
	}

	@ObfuscatedName("a.a(IZ[BI)V")
	public static void method7(boolean arg0, byte[] arg1, int arg2) {
		if (field311 == null) {
			return;
		}
		if (class122.field3030 >= 0) {
			field311.method305();
			class81.field2046 = 0;
			field78 = null;
			class62.field1548 = 20;
			class122.field3030 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (class62.field1548 > 0) {
			field311.method304(arg2);
			class62.field1548 = 0;
		}
		class122.field3030 = arg2;
		field311.method307(arg1, arg0, arg2);
	}

	@ObfuscatedName("cb.a(ZLbd;Lbd;Lbd;)V")
	public static void method268(class11 arg0, class11 arg1, class11 arg2) {
		field2966 = arg0;
		field939 = arg2;
		field1241 = arg1;
	}

	@ObfuscatedName("fe.a(III)V")
	public static void method414(int arg0, int arg1) {
		class70.field1726.method415(132);
		class70.field1726.method179(arg1);
		class70.field1726.method162(arg0);
	}

	@ObfuscatedName("n.a(Z)V")
	public static void method717() {
		method594();
		if (class63.field1587 == 2) {
			int[] var0 = field2747;
			byte[] var1 = field1845.field748;
			int var2 = var1.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (var1[var3] == 0) {
					var0[var3] = 0;
				}
			}
			field1239.method554(0, 0, 33, 33, 25, 25, class113.field2797, 256, field1556, field1560);
			method454();
			return;
		}
		int var4 = field2621.field1972 / 32 + 48;
		int var5 = 464 - field2621.field1963 / 32;
		int var6 = class86.field2158 + class113.field2797 & 0x7FF;
		field2626.method554(25, 5, 146, 151, var4, var5, var6, class103.field2589 + 256, field2588, field1842);
		for (int var7 = 0; var7 < class54.field1433; var7++) {
			int var8 = class80.field2023[var7] * 4 + 2 - field2621.field1972 / 32;
			int var9 = class92.field2303[var7] * 4 + 2 - field2621.field1963 / 32;
			method387(var9, var8, class122.field3046[var7]);
		}
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				class92 var12 = class17.field552[field75][var10][var11];
				if (var12 != null) {
					int var13 = var11 * 4 + 2 - field2621.field1963 / 32;
					int var14 = var10 * 4 + 2 - field2621.field1972 / 32;
					method387(var13, var14, field1578[0]);
				}
			}
		}
		for (int var15 = 0; var15 < class49.field1341; var15++) {
			class130 var16 = class120.field2992[class22.field677[var15]];
			if (var16 != null && var16.method42()) {
				class42 var17 = var16.field3182;
				if (var17.field1136 != null) {
					var17 = var17.method457();
				}
				if (var17 != null && var17.field1140 && var17.field1082) {
					int var18 = var16.field1972 / 32 - field2621.field1972 / 32;
					int var19 = var16.field1963 / 32 - field2621.field1963 / 32;
					method387(var19, var18, field1578[1]);
				}
			}
		}
		for (int var20 = 0; var20 < class118.field2939; var20++) {
			class2 var21 = class80.field2030[class112.field2758[var20]];
			if (var21 != null && var21.method42()) {
				int var22 = var21.field1972 / 32 - field2621.field1972 / 32;
				int var23 = var21.field1963 / 32 - field2621.field1963 / 32;
				boolean var24 = false;
				long var25 = var21.field86.method9();
				for (int var27 = 0; var27 < class59.field1492; var27++) {
					if (class117.field2929[var27] == var25 && class73.field1788[var27] != 0) {
						var24 = true;
						break;
					}
				}
				boolean var28 = false;
				if (field2621.field74 != 0 && var21.field74 != 0 && field2621.field74 == var21.field74) {
					var28 = true;
				}
				if (var24) {
					method387(var23, var22, field1578[3]);
				} else if (var28) {
					method387(var23, var22, field1578[4]);
				} else {
					method387(var23, var22, field1578[2]);
				}
			}
		}
		if (class2.field96 != 0 && class82.field2063 % 20 < 10) {
			if (class2.field96 == 1 && class132.field3212 >= 0 && class120.field2992.length > class132.field3212) {
				class130 var29 = class120.field2992[class132.field3212];
				if (var29 != null) {
					int var30 = var29.field1972 / 32 - field2621.field1972 / 32;
					int var31 = var29.field1963 / 32 - field2621.field1963 / 32;
					method400(var30, field680[1], var31);
				}
			}
			if (class2.field96 == 2) {
				int var32 = (class6.field226 - field1408) * 4 + 2 - field2621.field1963 / 32;
				int var33 = (class134.field3304 - field806) * 4 + 2 - field2621.field1972 / 32;
				method400(var33, field680[1], var32);
			}
			if (class2.field96 == 10 && class134.field3290 >= 0 && class80.field2030.length > class134.field3290) {
				class2 var34 = class80.field2030[class134.field3290];
				if (var34 != null) {
					int var35 = var34.field1963 / 32 - field2621.field1963 / 32;
					int var36 = var34.field1972 / 32 - field2621.field1972 / 32;
					method400(var36, field680[1], var35);
				}
			}
		}
		if (class35.field941 != 0) {
			int var37 = class35.field941 * 4 + 2 - field2621.field1972 / 32;
			int var38 = class108.field2720 * 4 + 2 - field2621.field1963 / 32;
			method387(var38, var37, field680[0]);
		}
		class111.method913(97, 78, 3, 3, 16777215);
		field1239.method554(0, 0, 33, 33, 25, 25, class113.field2797, 256, field1556, field1560);
		method454();
	}

	@ObfuscatedName("ca.a(IB)V")
	public static synchronized void method260() {
		if (field1381 != null) {
			field1381.method127(256);
		}
		method949(256);
	}

	@ObfuscatedName("mc.a(B)V")
	public static void method694() {
		class75.field1847 = null;
		field1872 = null;
		class75.field1852 = null;
		class75.field1873 = null;
		field1859 = null;
		class75.field1865 = null;
		class75.field1870 = null;
		class75.field1863 = null;
		field1871 = null;
		class75.field1874 = null;
		class75.field1853 = null;
		class75.field1858 = null;
	}

	@ObfuscatedName("md.a(JB)V")
	public static void method703(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (class59.field1492 >= 100 && class89.field2189 != 1 || class59.field1492 >= 200) {
			method758(0, class117.field2931, class132.field3234);
			return;
		}
		class1 var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < class59.field1492; var3++) {
			if (class117.field2929[var3] == arg0) {
				method758(0, method956(new class1[] { var2, class122.field3045 }), class132.field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < class85.field2146; var4++) {
			if (class106.field2683[var4] == arg0) {
				method758(0, method956(new class1[] { class89.field2178, var2, class81.field2054 }), class132.field3234);
				return;
			}
		}
		if (var2.method5(field2621.field86)) {
			return;
		}
		class119.field2951[class59.field1492] = var2;
		class117.field2929[class59.field1492] = arg0;
		class73.field1788[class59.field1492] = 0;
		class59.field1492++;
		class39.field1055 = true;
		class70.field1726.method415(114);
		class70.field1726.method157(arg0);
	}

	@ObfuscatedName("rb.f(I)V")
	public static void method879() {
		class104.field2625 = null;
		field2613 = null;
		field2621 = null;
		class104.field2623 = null;
		field2626 = null;
		class104.field2618 = null;
		field2614 = null;
	}

	@ObfuscatedName("oa.a(IBI)I")
	public static int method751(int arg0, int arg1) {
		int var2 = method124(arg0 + 45365, 4, arg1 + 91923) + (method124(arg0 - -10294, 2, arg1 + 37821) - 128 >> 1) + (method124(arg0, 1, arg1) + -128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("ia.b(Z)V")
	public static void method509() {
		class49.field1328 = null;
		class49.field1339 = null;
		class49.field1343 = null;
		class49.field1309 = null;
		field1307 = null;
	}

	@ObfuscatedName("vb.b(B)V")
	public static void method1013() {
		class128.field3145 = null;
		class128.field3130 = null;
		field3134 = null;
		field3131 = null;
		class128.field3144 = null;
		field3139 = null;
		class128.field3136 = null;
		class128.field3138 = null;
	}

	@ObfuscatedName("uc.f(I)V")
	public static void method999() {
		class123.field3058 = null;
		class123.field3066 = null;
		class123.field3079 = null;
		class123.field3067 = null;
		class123.field3062 = null;
		field3068 = null;
		class123.field3060 = null;
		class123.field3059 = null;
		class123.field3071 = null;
		class123.field3074 = null;
		class123.field3072 = null;
		class123.field3057 = null;
		class123.field3056 = null;
		class123.field3070 = null;
		class123.field3077 = null;
		class123.field3055 = null;
		class123.field3064 = null;
		class123.field3076 = null;
	}

	@ObfuscatedName("j.a(ILjava/awt/Color;La;I)V")
	public static void method536(int arg0, Color arg1, class1 arg2) {
		try {
			Graphics var3 = field3049.getGraphics();
			if (field842 == null) {
				field842 = new Font("Helvetica", 1, 13);
				field469 = field3049.getFontMetrics(field842);
			}
			if (class97.field2402) {
				class97.field2402 = false;
				var3.setColor(Color.black);
				var3.fillRect(0, 0, field711, field2372);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (field1397 == null) {
					field1397 = field3049.createImage(304, 34);
				}
				Graphics var4 = field1397.getGraphics();
				var4.setColor(arg1);
				var4.drawRect(0, 0, 303, 33);
				var4.fillRect(2, 2, arg0 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(1, 1, 301, 31);
				var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				var4.setFont(field842);
				var4.setColor(Color.white);
				arg2.method16((304 - arg2.method24(field469)) / 2, 22, var4);
				var3.drawImage(field1397, field711 / 2 - 152, field2372 / 2 + -18, null);
			} catch (Exception var7) {
				int var5 = field711 / 2 - 152;
				int var6 = field2372 / 2 - 18;
				var3.setColor(arg1);
				var3.drawRect(var5, var6, 303, 33);
				var3.fillRect(var5 + 2, var6 - -2, arg0 * 3, 30);
				var3.setColor(Color.black);
				var3.drawRect(var5 + 1, var6 + 1, 301, 31);
				var3.fillRect(arg0 * 3 + var5 + 2, var6 + 2, 300 - arg0 * 3, 30);
				var3.setFont(field842);
				var3.setColor(Color.white);
				arg2.method16((304 - arg2.method24(field469)) / 2 + var5, var6 + 22, var3);
			}
		} catch (Exception var8) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("d.c(B)V")
	public static void method295() {
		class19.field621 = null;
		class19.field623 = null;
		class19.field620 = null;
		field657 = null;
		class19.field632 = null;
		class19.field647 = null;
		class19.field634 = null;
		class19.field648 = null;
		class19.field659 = null;
		class19.field669 = null;
		class19.field642 = null;
		class19.field626 = null;
		class19.field622 = null;
		class19.field671 = null;
		class19.field644 = null;
		class19.field672 = null;
		class19.field624 = null;
		class19.field655 = null;
		class19.field645 = null;
		class19.field667 = null;
		class19.field666 = null;
	}

	@ObfuscatedName("ub.a(I)V")
	public static void method992() {
		if (class32.field857 != 0) {
			return;
		}
		int var0 = class122.field3050;
		if (client.field594 == 1 && class112.field2762 >= 516 && class1.field14 >= 160 && class112.field2762 <= 765 && class1.field14 <= 205) {
			var0 = 0;
		}
		if (!class6.field224) {
			if (var0 == 1 && class42.field1104 > 0) {
				int var1 = class79.field1932[class42.field1104 - 1];
				if (var1 == 53 || var1 == 25 || var1 == 55 || var1 == 48 || var1 == 24 || var1 == 52 || var1 == 6 || var1 == 31 || var1 == 43 || var1 == 11 || var1 == 19 || var1 == 1006) {
					int var2 = class37.field994[class42.field1104 - 1];
					int var3 = class117.field2925[class42.field1104 - 1];
					class100 var4 = method1053(var3);
					if (var4.field2509 || var4.field2529) {
						class128.field3143 = class112.field2762;
						class114.field2815 = false;
						class32.field857 = 2;
						class98.field2410 = var3;
						class115.field2829 = class1.field14;
						class113.field2776 = var2;
						if (var3 >> 16 == class132.field3227) {
							class32.field857 = 1;
						}
						if (var3 >> 16 == class86.field2166) {
							class32.field857 = 3;
						}
						class8.field298 = 0;
						return;
					}
				}
			}
			if (var0 == 1 && (class134.field3297 == 1 || method676(class42.field1104 - 1)) && class42.field1104 > 2) {
				var0 = 2;
			}
			if (var0 == 1 && class42.field1104 > 0) {
				method604(class42.field1104 - 1);
			}
			if (var0 == 2 && class42.field1104 > 0) {
				method968();
			}
			return;
		}
		if (var0 != 1) {
			int var5 = class24.field741;
			int var6 = class102.field2568;
			if (field640 == 0) {
				var5 -= 4;
				var6 -= 4;
			}
			if (field640 == 1) {
				var6 -= 205;
				var5 -= 553;
			}
			if (field640 == 2) {
				var6 -= 357;
				var5 -= 17;
			}
			if (field986 - 10 > var5 || field2306 + field986 + 10 < var5 || var6 < field579 - 10 || var6 > field579 + field219 + 10) {
				if (field640 == 1) {
					class39.field1055 = true;
				}
				class6.field224 = false;
				if (field640 == 2) {
					class105.field2637 = true;
				}
			}
		}
		if (var0 != 1) {
			return;
		}
		int var7 = field986;
		int var8 = field579;
		int var9 = field2306;
		int var10 = class112.field2762;
		int var11 = -1;
		int var12 = class1.field14;
		if (field640 == 0) {
			var10 -= 4;
			var12 -= 4;
		}
		if (field640 == 1) {
			var10 -= 553;
			var12 -= 205;
		}
		if (field640 == 2) {
			var10 -= 17;
			var12 -= 357;
		}
		for (int var13 = 0; var13 < class42.field1104; var13++) {
			int var14 = (class42.field1104 - var13 - 1) * 15 + var8 + 31;
			if (var10 > var7 && var10 < var7 + var9 && var12 > var14 - 13 && var12 < var14 + 3) {
				var11 = var13;
			}
		}
		if (var11 != -1) {
			method604(var11);
		}
		if (field640 == 1) {
			class39.field1055 = true;
		}
		class6.field224 = false;
		if (field640 == 2) {
			class105.field2637 = true;
			return;
		}
	}

	@ObfuscatedName("ca.a(Loc;I)V")
	public static synchronized void method261(class87 arg0) {
		field1381 = arg0;
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method740() {
		class82.field2089 = null;
		class82.field2076 = null;
		class82.field2101 = null;
		class82.field2102 = null;
		class82.field2077 = null;
		class82.field2110 = null;
		class82.field2061 = null;
		class82.field2071 = null;
		class82.field2104 = null;
		class82.field2091 = null;
		class82.field2109 = null;
		class82.field2113 = null;
		class82.field2081 = null;
		class82.field2096 = null;
		class82.field2080 = null;
		class82.field2070 = null;
		class82.field2112 = null;
		class82.field2086 = null;
		class82.field2088 = null;
		class82.field2111 = null;
		class82.field2100 = null;
		class82.field2079 = null;
		class82.field2083 = null;
		class82.field2066 = null;
		class82.field2092 = null;
		class82.field2068 = null;
		class82.field2078 = null;
		class82.field2082 = null;
		class82.field2067 = null;
		class82.field2093 = null;
		class82.field2085 = null;
		class82.field2103 = null;
		class82.field2097 = null;
		class82.field2106 = null;
		class82.field2069 = null;
		class82.field2060 = null;
		class82.field2090 = null;
		class82.field2094 = null;
		class82.field2074 = null;
		class82.field2062 = null;
		class82.field2095 = null;
	}

	@ObfuscatedName("fc.b(II)V")
	public static void method399(int arg0) {
		if (class103.field2599 == arg0) {
			return;
		}
		if (class103.field2599 == 0) {
			method108();
		}
		if (arg0 == 20 || arg0 == 40) {
			client.field577 = 0;
			class34.field896 = 0;
			class22.field693 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && field1692 != null) {
			field1692.method1015();
			field1692 = null;
		}
		if (class103.field2599 == 25 || class103.field2599 == 40) {
			method1028();
			class111.method920();
		}
		if (class103.field2599 == 25) {
			class78.field1922 = 0;
			class36.field948 = 1;
			class95.field2358 = 0;
			class54.field1441 = 1;
			class134.field3301 = 0;
		}
		if (arg0 == 35) {
			method525();
			method722();
			if (field187 == null) {
				field187 = method875(503, 765, field3049);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			field187 = null;
			method525();
			method568(field3049, field1542, field1087);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			field187 = null;
			method722();
			method297(field3049, field1087);
		}
		class103.field2599 = arg0;
		class97.field2402 = true;
	}

	@ObfuscatedName("ua.a(IBIII)V")
	public static void method989(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = arg0; var4 <= arg0 + arg1; var4++) {
			for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					field1003[0][var5][var4] = 127;
					if (arg3 == var5 && var5 > 0) {
						class57.field1451[0][var5][var4] = class57.field1451[0][var5 - 1][var4];
					}
					if (arg2 + arg3 == var5 && var5 < 103) {
						class57.field1451[0][var5][var4] = class57.field1451[0][var5 + 1][var4];
					}
					if (arg0 == var4 && var4 > 0) {
						class57.field1451[0][var5][var4] = class57.field1451[0][var5][var4 - 1];
					}
					if (arg0 + arg1 == var4 && var4 < 103) {
						class57.field1451[0][var5][var4] = class57.field1451[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("ga.a(IIII)V")
	public static void method423(int arg0, int arg1, int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			class89.field2188 = -1;
			class39.field1072 = -1;
			return;
		}
		int var3 = method712(field75, arg2, arg1) - arg0;
		int var4 = arg1 - field1200;
		int var5 = var3 - field1748;
		int var6 = class91.field2258[field1400];
		int var7 = class91.field2256[field1400];
		int var8 = arg2 - field709;
		int var9 = class91.field2256[field184];
		int var10 = class91.field2258[field184];
		int var11 = var4 * var9 + var8 * var10 >> 16;
		int var12 = var4 * var10 - var8 * var9 >> 16;
		int var14 = var5 * var6 - var7 * var12 >> 16;
		int var15 = var5 * var7 + var6 * var12 >> 16;
		if (var15 < 50) {
			class89.field2188 = -1;
			class39.field1072 = -1;
		} else {
			class39.field1072 = (var11 << 9) / var15 + 256;
			class89.field2188 = (var14 << 9) / var15 + 167;
		}
	}

	@ObfuscatedName("ba.a(ILbd;I)Z")
	public static boolean method148(class11 arg0, int arg1) {
		byte[] var2 = arg0.method232(arg1);
		if (var2 == null) {
			return false;
		} else {
			method229(var2);
			return true;
		}
	}

	@ObfuscatedName("hc.b(B)V")
	public static void method473() {
		field1558.method1054();
		field2187.method329(0, 0);
		field320 = class27.method362(field320);
	}

	@ObfuscatedName("kd.a(IIIIIII[Lqd;II)V")
	public static void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class100[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < arg6.length; var9++) {
			class100 var10 = arg6[var9];
			if (var10 != null && (var10.field2489 == 0 || var10.field2494) && var10 != null && var10.field2454 == arg5 && (!var10.field2556 || class36.field953)) {
				int var11 = var10.field2462 + arg4;
				int var12 = var10.field2502 + arg0;
				if (!var10.field2500) {
					var12 -= arg8;
				}
				int var13 = var10.field2449 + var12;
				int var14 = arg0 >= var12 ? arg0 : var12;
				if (!var10.field2500) {
					var11 -= arg2;
				}
				int var15 = var11 + var10.field2498;
				int var16 = arg4 < var11 ? var11 : arg4;
				int var17 = arg1 > var13 ? var13 : arg1;
				int var18 = var15 < arg7 ? var15 : arg7;
				if (var10.field2489 == 0) {
					method618(var14, var17, var10.field2552, arg3, var16, var9, arg6, var18, var10.field2537);
					if (var10.field2519 != null) {
						method618(var14, var17, var10.field2552, arg3, var16, var10.field2495, var10.field2519, var18, var10.field2537);
					}
				}
				if (var10.field2494) {
					boolean var19;
					if (class24.field741 >= var16 && var14 <= class102.field2568 && var18 > class24.field741 && var17 > class102.field2568) {
						var19 = true;
					} else {
						var19 = false;
					}
					boolean var20 = false;
					if (class28.field801 == 1 && var19) {
						var20 = true;
					}
					boolean var21 = false;
					if (var10.field2544 != -1 && var20 && class17.field548 == null) {
						class12.field419 = class24.field741;
						class17.field548 = var10;
						class97.field2392 = class102.field2568;
					}
					if (class122.field3050 == 1 && var16 <= class112.field2762 && class1.field14 >= var14 && class112.field2762 < var18 && class1.field14 < var17) {
						var21 = true;
					}
					if (class17.field548 != null) {
						var20 = false;
						var19 = false;
						var21 = false;
					}
					if (!var10.field2536 && var21 && (arg3 & 0x1) != 0) {
						var10.field2536 = true;
						if (var10.field2487 != null) {
							method754(var10.field2487, class1.field14 - var12, var10, class112.field2762 - var11);
						}
					}
					if (var10.field2536 && var20 && (arg3 & 0x4) != 0 && var10.field2553 != null) {
						method754(var10.field2553, class102.field2568 - var12, var10, class24.field741 - var11);
					}
					if (var10.field2536 && !var20 && (arg3 & 0x2) != 0) {
						var10.field2536 = false;
						if (var10.field2513 != null) {
							method754(var10.field2513, class102.field2568 - var12, var10, class24.field741 - var11);
						}
					}
					if (var20 && (arg3 & 0x8) != 0 && var10.field2450 != null) {
						method754(var10.field2450, class102.field2568 - var12, var10, class24.field741 - var11);
					}
					if (!var10.field2488 && var19 && (arg3 & 0x10) != 0) {
						var10.field2488 = true;
						if (var10.field2464 != null) {
							method754(var10.field2464, class102.field2568 - var12, var10, class24.field741 - var11);
						}
					}
					if (var10.field2488 && var19 && (arg3 & 0x40) != 0 && var10.field2486 != null) {
						method754(var10.field2486, class102.field2568 - var12, var10, class24.field741 - var11);
					}
					if (var10.field2488 && !var19 && (arg3 & 0x20) != 0) {
						var10.field2488 = false;
						if (var10.field2478 != null) {
							method754(var10.field2478, class102.field2568 - var12, var10, class24.field741 - var11);
						}
					}
					if (var10.field2518 != null && (arg3 & 0x80) != 0) {
						method754(var10.field2518, 0, var10, 0);
					}
					if (class82.field2063 == class47.field1237 && var10.field2456 != null && (arg3 & 0x100) != 0) {
						method754(var10.field2456, 0, var10, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("oe.a(ILnb;)V")
	public static void method761(class80 arg0) {
		arg0.field1951 = arg0.field2000;
		if (arg0.field1983 == 0) {
			arg0.field1948 = 0;
			return;
		}
		if (arg0.field2015 != -1 && arg0.field1996 == 0) {
			class47 var1 = method103(arg0.field2015);
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

	@ObfuscatedName("wa.a(ZBI)La;")
	public static class1 method1034(int arg0) {
		return method418(true, arg0);
	}

	@ObfuscatedName("je.b(II)La;")
	public static class1 method566() {
		class1 var0 = new class1();
		var0.field38 = new byte[100];
		var0.field26 = 0;
		return var0;
	}

	@ObfuscatedName("f.a(B)V")
	public static void method385() {
		class31.field831 = null;
		field843 = null;
		class31.field830 = null;
		class31.field846 = null;
		class31.field833 = null;
		class31.field836 = null;
		field844 = null;
		class31.field838 = null;
		field837 = null;
		class31.field832 = null;
		field842 = null;
		class31.field847 = null;
	}

	@ObfuscatedName("kc.a(IIIIII)V")
	public static void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg3 - 32) * arg3 / arg1;
		field365[0].method329(arg2, arg4);
		field365[1].method329(arg2, arg4 + arg3 - 16);
		class111.method913(arg2, arg4 + 16, 16, arg3 - 32, class108.field2715);
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (arg3 - var5 - 32) * arg0 / (arg1 - arg3);
		class111.method913(arg2, arg4 + var6 + 16, 16, var5, class15.field495);
		class111.method925(arg2, arg4 + var6 + 16, var5, class132.field3226);
		class111.method925(arg2 + 1, arg4 + var6 + 16, var5, class132.field3226);
		class111.method916(arg2, arg4 + var6 + 16, 16, class132.field3226);
		class111.method916(arg2, arg4 + var6 + 17, 16, class132.field3226);
		class111.method925(arg2 + 15, arg4 - -16 - -var6, var5, class109.field2734);
		class111.method925(arg2 + 14, var6 + 17 + arg4, var5 - 1, class109.field2734);
		class111.method916(arg2, arg4 + var6 + var5 + 15, 16, class109.field2734);
		class111.method916(arg2 + 1, arg4 - -var6 + var5 + 14, 15, class109.field2734);
	}

	@ObfuscatedName("i.a(II)La;")
	public static class1 method502(int arg0) {
		return method418(false, arg0);
	}

	@ObfuscatedName("pb.c(I)V")
	public static void method807() {
		class112.field2755.method267();
	}

	@ObfuscatedName("ja.e(B)V")
	public static void method540() {
		if (field1448 > 0) {
			field1442.method310(class55.field1446, field1448);
			field1448 = 0;
		}
	}

	@ObfuscatedName("te.b(B)V")
	public static void method975() {
		class119.field2957 = null;
		field2966 = null;
		class119.field2968 = null;
		class119.field2965 = null;
		class119.field2951 = null;
	}

	@ObfuscatedName("td.a(IJ)La;")
	public static class1 method969(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			long var2 = arg0;
			int var4 = 0;
			while (var2 != 0L) {
				var2 /= 37L;
				var4++;
			}
			byte[] var5 = new byte[var4];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var4--;
				var5[var4] = class5.field220[(int) (var6 - arg0 * 37L)];
			}
			class1 var8 = new class1();
			var8.field38 = var5;
			var8.field26 = var5.length;
			return var8;
		}
	}

	@ObfuscatedName("wa.a(IIIILh;)V")
	public static void method1035(int arg0, int arg1, int arg2, class42 arg3) {
		if (class42.field1104 >= 400) {
			return;
		}
		if (arg3.field1136 != null) {
			arg3 = arg3.method457();
		}
		if (arg3 == null || !arg3.field1082) {
			return;
		}
		class1 var4 = arg3.field1112;
		if (arg3.field1103 != 0) {
			var4 = method956(new class1[] { var4, method390(field2621.field68, arg3.field1103), class48.field1275, class28.field785, method502(arg3.field1103), class103.field2601 });
		}
		if (class14.field475 == 1) {
			method398(arg2, client.field584, arg1, arg0, 49, method956(new class1[] { class130.field3177, class28.field805, var4 }));
		} else if (client.field594 != 1) {
			class1[] var5 = arg3.field1086;
			if (class118.field2934) {
				var5 = method905(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].method14(class60.field1522)) {
						byte var7 = 0;
						if (var6 == 0) {
							var7 = 12;
						}
						if (var6 == 1) {
							var7 = 30;
						}
						if (var6 == 2) {
							var7 = 4;
						}
						if (var6 == 3) {
							var7 = 34;
						}
						if (var6 == 4) {
							var7 = 20;
						}
						method398(arg2, var5[var6], arg1, arg0, var7, method956(new class1[] { class107.field2699, var4 }));
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method14(class60.field1522)) {
						short var9 = 0;
						if (field2621.field68 < arg3.field1103) {
							var9 = 2000;
						}
						int var10 = 0;
						if (var8 == 0) {
							var10 = var9 + 12;
						}
						if (var8 == 1) {
							var10 = var9 + 30;
						}
						if (var8 == 2) {
							var10 = var9 + 4;
						}
						if (var8 == 3) {
							var10 = var9 + 34;
						}
						if (var8 == 4) {
							var10 = var9 + 20;
						}
						method398(arg2, var5[var8], arg1, arg0, var10, method956(new class1[] { class107.field2699, var4 }));
					}
				}
			}
			method398(arg2, class114.field2805, arg1, arg0, 1001, method956(new class1[] { class107.field2699, var4 }));
		} else if ((field2846 & 0x2) == 2) {
			method398(arg2, class60.field1523, arg1, arg0, 21, method956(new class1[] { class52.field1384, class28.field805, var4 }));
			return;
		}
	}

	@ObfuscatedName("rc.a(Z)V")
	public static void method883() {
		class105.field2629 = null;
		class105.field2657 = null;
		class105.field2644 = null;
		class105.field2654 = null;
		class105.field2639 = null;
		class105.field2650 = null;
		field2633 = null;
		class105.field2634 = null;
		class105.field2632 = null;
		class105.field2646 = null;
	}

	@ObfuscatedName("hc.a(Lba;II)La;")
	public static class1 method474(class8 arg0) {
		try {
			class1 var1 = new class1();
			var1.field26 = arg0.method178();
			if (var1.field26 > 32767) {
				var1.field26 = 32767;
			}
			var1.field38 = new byte[var1.field26];
			arg0.field267 += field2357.method1033(arg0.field284, var1.field26, 0, var1.field38, arg0.field267);
			return var1;
		} catch (Exception var2) {
			return class72.field1756;
		}
	}

	@ObfuscatedName("re.a(Lbd;B)I")
	public static int method892(class11 arg0) {
		int var1 = 0;
		if (arg0.method239(class63.field1567, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class1.field62, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class93.field2333, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class117.field2927, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class11.field406, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class17.field533, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class121.field3020, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class86.field2162, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class14.field455, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class106.field2682, class14.field479)) {
			var1++;
		}
		if (arg0.method239(client.field609, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class113.field2798, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class95.field2355, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class9.field318, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class14.field478, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class44.field1169, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class116.field2910, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class129.field3163, class14.field479)) {
			var1++;
		}
		if (arg0.method239(class114.field2818, class14.field479)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("je.a(ZLwa;)V")
	public static void method567(class132 arg0) {
		field2357 = arg0;
	}

	@ObfuscatedName("oa.a(I)V")
	public static void method752() {
		while (true) {
			if (class15.field488.method407(class100.field2547) >= 27) {
				int var0 = class15.field488.method412(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (class120.field2992[var0] == null) {
						class120.field2992[var0] = new class130();
						var1 = true;
					}
					class130 var2 = class120.field2992[var0];
					class22.field677[class49.field1341++] = var0;
					var2.field2008 = class82.field2063;
					int var3 = class19.field644[class15.field488.method412(3)];
					if (var1) {
						var2.field1992 = var3;
					}
					int var4 = class15.field488.method412(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = class15.field488.method412(5);
					int var6 = class15.field488.method412(1);
					if (var5 > 15) {
						var5 -= 32;
					}
					if (var6 == 1) {
						class50.field1348[class80.field2027++] = var0;
					}
					int var7 = class15.field488.method412(1);
					var2.field3182 = method864(class15.field488.method412(13));
					var2.field2006 = var2.field3182.field1123;
					var2.field2000 = var2.field3182.field1092;
					var2.field1957 = var2.field3182.field1099;
					var2.field2005 = var2.field3182.field1135;
					var2.field1970 = var2.field3182.field1084;
					var2.field1953 = var2.field3182.field1116;
					var2.field2019 = var2.field3182.field1131;
					var2.field1987 = var2.field3182.field1101;
					if (var2.field1987 == 0) {
						var2.field1992 = 0;
					}
					var2.field1949 = var2.field3182.field1128;
					var2.method729(field2621.field2009[0] + var5, var7 == 1, field2621.field1962[0] + var4);
					continue;
				}
			}
			class15.field488.method408();
			return;
		}
	}

	@ObfuscatedName("pb.d(B)V")
	public static void method808() {
		try {
			Graphics var0 = field3049.getGraphics();
			field1558.method101(17, var0, 357);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("mb.a(IIZ)I")
	public static int method689(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var3 = (arg0 & 0x7F) * arg1 / 128;
			if (var3 < 2) {
				var3 = 2;
			} else if (var3 > 126) {
				var3 = 126;
			}
			return (arg0 & 0xFF80) + var3;
		}
	}

	@ObfuscatedName("d.a(ILnb;)V")
	public static void method296(class80 arg0) {
		if (arg0.field1987 == 0) {
			return;
		}
		if (arg0.field2011 != -1 && arg0.field2011 < 32768) {
			class130 var1 = class120.field2992[arg0.field2011];
			if (var1 != null) {
				int var2 = arg0.field1963 - var1.field1963;
				int var3 = arg0.field1972 - var1.field1972;
				if (var3 != 0 || var2 != 0) {
					arg0.field1954 = (int) (Math.atan2((double) var3, (double) var2) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field2011 >= 32768) {
			int var4 = arg0.field2011 - 32768;
			if (class67.field1683 == var4) {
				var4 = 2047;
			}
			class2 var5 = class80.field2030[var4];
			if (var5 != null) {
				int var6 = arg0.field1972 - var5.field1972;
				int var7 = arg0.field1963 - var5.field1963;
				if (var6 != 0 || var7 != 0) {
					arg0.field1954 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field2022 != 0 || arg0.field1974 != 0) && (arg0.field1983 == 0 || arg0.field1948 > 0)) {
			int var8 = arg0.field1963 - (arg0.field1974 - field1408 - field1408) * 64;
			int var9 = arg0.field1972 - (arg0.field2022 - field806 - field806) * 64;
			if (var9 != 0 || var8 != 0) {
				arg0.field1954 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
			}
			arg0.field1974 = 0;
			arg0.field2022 = 0;
		}
		int var10 = arg0.field1954 - arg0.field1992 & 0x7FF;
		if (var10 == 0) {
			arg0.field1971 = 0;
			return;
		}
		arg0.field1971++;
		if (var10 > 1024) {
			arg0.field1992 -= arg0.field1987;
			boolean var11 = true;
			if (arg0.field1987 > var10 || 2048 - arg0.field1987 < var10) {
				var11 = false;
				arg0.field1992 = arg0.field1954;
			}
			if (arg0.field2000 == arg0.field1951 && (arg0.field1971 > 25 || var11)) {
				if (arg0.field2019 == -1) {
					arg0.field1951 = arg0.field2005;
				} else {
					arg0.field1951 = arg0.field2019;
				}
			}
		} else {
			arg0.field1992 += arg0.field1987;
			boolean var12 = true;
			if (var10 < arg0.field1987 || var10 > 2048 - arg0.field1987) {
				arg0.field1992 = arg0.field1954;
				var12 = false;
			}
			if (arg0.field2000 == arg0.field1951 && (arg0.field1971 > 25 || var12)) {
				if (arg0.field1957 == -1) {
					arg0.field1951 = arg0.field2005;
				} else {
					arg0.field1951 = arg0.field1957;
				}
			}
		}
		arg0.field1992 &= 0x7FF;
	}

	@ObfuscatedName("k.a(Llc;IZB)Z")
	public static boolean method574(class69 arg0, boolean arg1) {
		return method734(arg0, arg1);
	}

	@ObfuscatedName("i.a(B)V")
	public static void method503() {
		for (class19 var0 = (class19) class86.field2160.method802(); var0 != null; var0 = (class19) class86.field2160.method809()) {
			if (field75 != var0.field638 || class82.field2063 > var0.field628) {
				var0.method739();
			} else if (var0.field631 <= class82.field2063) {
				if (var0.field618 > 0) {
					class130 var1 = class120.field2992[var0.field618 - 1];
					if (var1 != null && var1.field1972 >= 0 && var1.field1972 < 13312 && var1.field1963 >= 0 && var1.field1963 < 13312) {
						var0.method300(class82.field2063, var1.field1963, method712(var0.field638, var1.field1972, var1.field1963) - var0.field617, var1.field1972);
					}
				}
				if (var0.field618 < 0) {
					int var2 = -var0.field618 - 1;
					class2 var3;
					if (class67.field1683 == var2) {
						var3 = field2621;
					} else {
						var3 = class80.field2030[var2];
					}
					if (var3 != null && var3.field1972 >= 0 && var3.field1972 < 13312 && var3.field1963 >= 0 && var3.field1963 < 13312) {
						var0.method300(class82.field2063, var3.field1963, method712(var0.field638, var3.field1972, var3.field1963) - var0.field617, var3.field1972);
					}
				}
				var0.method299(class9.field321);
				field3183.method90(field75, (int) var0.field637, (int) var0.field650, (int) var0.field649, 60, var0, var0.field670, -1, false);
			}
		}
	}

	@ObfuscatedName("kc.b(I)V")
	public static void method602() {
		class63.field1576 = null;
		field1578 = null;
		class63.field1591 = null;
		field1583 = null;
		class63.field1567 = null;
		class63.field1582 = null;
		class63.field1581 = null;
		class63.field1597 = null;
		class63.field1594 = null;
		class63.field1595 = null;
		class63.field1593 = null;
		class63.field1572 = null;
		class63.field1566 = null;
	}

	@ObfuscatedName("ta.g(I)V")
	public static void method943() {
		try {
			Graphics var0 = field3049.getGraphics();
			field2587.method101(0, var0, 4);
			field522.method101(0, var0, 357);
			field2045.method101(722, var0, 4);
			field1438.method101(743, var0, 205);
			field2899.method101(0, var0, 0);
			field1780.method101(516, var0, 4);
			field3021.method101(516, var0, 205);
			field1689.method101(496, var0, 357);
			field843.method101(0, var0, 338);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("fa.a(III)La;")
	public static class1 method390(int arg0, int arg1) {
		int var2 = arg0 - arg1;
		if (var2 < -9) {
			return class52.field1383;
		} else if (var2 < -6) {
			return class66.field1645;
		} else if (var2 < -3) {
			return class134.field3306;
		} else if (var2 < 0) {
			return class15.field501;
		} else if (var2 > 9) {
			return class102.field2564;
		} else if (var2 > 6) {
			return class37.field1005;
		} else if (var2 > 3) {
			return class82.field2069;
		} else if (var2 > 0) {
			return class78.field1925;
		} else {
			return class107.field2699;
		}
	}

	@ObfuscatedName("id.a(I)V")
	public static void method525() {
		if (!class44.field1159) {
			return;
		}
		field320 = null;
		class44.field1159 = false;
		field1560 = null;
		field1845 = null;
		field2588 = null;
		field843 = null;
		field1553 = null;
		field1438 = null;
		field2770 = null;
		field1366 = null;
		field2686 = null;
		field2807 = null;
		field739 = null;
		field11 = null;
		field1556 = null;
		field1096 = null;
		field2045 = null;
		field1524 = null;
		field2745 = null;
		field2587 = null;
		field1598 = null;
		field1457 = null;
		field1842 = null;
		field3208 = null;
		field279 = null;
		field1167 = null;
		field2731 = null;
		field925 = null;
		field1074 = null;
		field1558 = null;
		field1780 = null;
		field993 = null;
		field522 = null;
		field3021 = null;
		field1871 = null;
		field1255 = null;
		field3134 = null;
		field1347 = null;
		field1689 = null;
		field2899 = null;
		field2187 = null;
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
			class2 var2 = class80.field2030[var1];
			if (var2 != null && var2.field1952 > 0) {
				var2.field1952--;
				if (var2.field1952 == 0) {
					var2.field1964 = null;
				}
			}
		}
		for (int var3 = 0; var3 < class49.field1341; var3++) {
			int var4 = class22.field677[var3];
			class130 var5 = class120.field2992[var4];
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
		for (class116 var0 = (class116) class112.field2756.method802(); var0 != null; var0 = (class116) class112.field2756.method809()) {
			if (field75 != var0.field2895 || var0.field2893) {
				var0.method739();
			} else if (class82.field2063 >= var0.field2886) {
				var0.method958(class9.field321);
				if (var0.field2893) {
					var0.method739();
				} else {
					field3183.method90(var0.field2895, var0.field2900, var0.field2891, var0.field2887, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("je.a(Ljava/awt/Component;ZLbd;Lbd;)V")
	public static void method568(Component arg0, class11 arg1, class11 arg2) {
		if (field1062) {
			return;
		}
		field472 = method875(265, 128, arg0);
		class111.method920();
		field1435 = method875(265, 128, arg0);
		class111.method920();
		field2044 = method875(171, 509, arg0);
		class111.method920();
		field2608 = method875(132, 360, arg0);
		class111.method920();
		field1935 = method875(200, 360, arg0);
		class111.method920();
		field844 = method875(238, 202, arg0);
		class111.method920();
		field2701 = method875(238, 203, arg0);
		class111.method920();
		field1307 = method875(94, 74, arg0);
		class111.method920();
		field3298 = method875(94, 75, arg0);
		class111.method920();
		byte[] var3 = arg1.method215(class123.field3067, class70.field1751);
		class58 var4 = new class58(var3, arg0);
		field472.method1054();
		var4.method557(0, 0);
		field1435.method1054();
		var4.method557(-637, 0);
		field2044.method1054();
		var4.method557(-128, 0);
		field2608.method1054();
		var4.method557(-202, -371);
		field1935.method1054();
		var4.method557(-202, -171);
		field844.method1054();
		var4.method557(0, -265);
		field2701.method1054();
		var4.method557(-562, -265);
		field1307.method1054();
		var4.method557(-128, -171);
		field3298.method1054();
		var4.method557(-562, -171);
		int[] var5 = new int[var4.field1476];
		for (int var6 = 0; var6 < var4.field1475; var6++) {
			for (int var7 = 0; var7 < var4.field1476; var7++) {
				var5[var7] = var4.field1480[var4.field1476 * var6 + var4.field1476 - var7 - 1];
			}
			for (int var8 = 0; var8 < var4.field1476; var8++) {
				var4.field1480[var4.field1476 * var6 + var8] = var5[var8];
			}
		}
		field472.method1054();
		var4.method557(382, 0);
		field1435.method1054();
		var4.method557(-255, 0);
		field2044.method1054();
		var4.method557(254, 0);
		field2608.method1054();
		var4.method557(180, -371);
		field1935.method1054();
		var4.method557(180, -171);
		field844.method1054();
		var4.method557(382, -265);
		field2701.method1054();
		var4.method557(-180, -265);
		field1307.method1054();
		var4.method557(254, -171);
		field3298.method1054();
		var4.method557(-180, -171);
		class58 var9 = method1038(arg2, client.field583, class123.field3067);
		field2044.method1054();
		var9.method551(382 - var9.field1476 / 2 - 128, 18);
		field2806 = method605(class47.field1245, class123.field3067, arg2);
		field2919 = method605(class39.field1056, class123.field3067, arg2);
		field1177 = method372(arg2, class14.field473, class123.field3067);
		field2055 = new class58(128, 265);
		field851 = new class58(128, 265);
		for (int var10 = 0; var10 < 33920; var10++) {
			field2055.field1480[var10] = field472.field3288[var10];
		}
		for (int var11 = 0; var11 < 33920; var11++) {
			field851.field1480[var11] = field1435.field3288[var11];
		}
		field2600 = new int[256];
		for (int var12 = 0; var12 < 64; var12++) {
			field2600[var12] = var12 * 262144;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			field2600[var13 + 64] = var13 * 1024 + 16711680;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			field2600[var14 + 128] = var14 * 4 + 16776960;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			field2600[var15 + 192] = 16777215;
		}
		field3139 = new int[256];
		for (int var16 = 0; var16 < 64; var16++) {
			field3139[var16] = var16 * 1024;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			field3139[var17 + 64] = var17 * 4 + 65280;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			field3139[var18 + 128] = var18 * 262144 + 65535;
		}
		for (int var19 = 0; var19 < 64; var19++) {
			field3139[var19 + 192] = 16777215;
		}
		field2904 = new int[256];
		for (int var20 = 0; var20 < 64; var20++) {
			field2904[var20] = var20 * 4;
		}
		for (int var21 = 0; var21 < 64; var21++) {
			field2904[var21 + 64] = var21 * 262144 + 255;
		}
		for (int var22 = 0; var22 < 64; var22++) {
			field2904[var22 + 128] = var22 * 1024 + 16711935;
		}
		for (int var23 = 0; var23 < 64; var23++) {
			field2904[var23 + 192] = 16777215;
		}
		field2151 = new int[256];
		field3025 = new int[32768];
		field2570 = new int[32768];
		method1010(null);
		field2911 = new int[32768];
		class123.field3055 = class123.field3067;
		class123.field3071 = class123.field3067;
		field229 = new int[32768];
		class53.field1395 = 0;
		if (class62.field1554 == 0 || class93.field2332) {
			method672();
		} else {
			method679(field2702, class67.field1691, class123.field3067, class62.field1554);
		}
		method617(false);
		class97.field2402 = true;
		field1062 = true;
	}

	@ObfuscatedName("nd.a(IIB)Z")
	public static boolean method741(int arg0, int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		class49 var2 = method389(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return var2.method515(arg0);
	}

	@ObfuscatedName("j.a(BLa;)V")
	public static void method537(class1 arg0) {
		if (arg0 == null || arg0.method10() == 0) {
			class93.field2330 = 0;
			return;
		}
		class1 var1 = arg0;
		class1[] var2 = new class1[100];
		int var3 = 0;
		while (true) {
			int var4 = var1.method8();
			if (var4 == -1) {
				class1 var5 = var1.method40();
				if (var5.method10() > 0) {
					var2[var3++] = var5.method30();
				}
				class93.field2330 = 0;
				label46: for (int var7 = 0; var7 < field1590; var7++) {
					class115 var8 = method760(var7);
					if (var8.field2838 == -1 && var8.field2827 != null) {
						class1 var9 = var8.field2827.method30();
						for (int var10 = 0; var10 < var3; var10++) {
							if (var9.method11(var2[var10]) == -1) {
								continue label46;
							}
						}
						class38.field1017[class93.field2330] = var9;
						class9.field313[class93.field2330] = var7;
						class93.field2330++;
						if (class93.field2330 >= class38.field1017.length) {
							return;
						}
					}
				}
				return;
			}
			class1 var6 = var1.method19(0, var4).method40();
			if (var6.method10() > 0) {
				var2[var3++] = var6.method30();
			}
			var1 = var1.method1(var4 + 1);
		}
	}

	@ObfuscatedName("tb.c(B)V")
	public static void method959() {
		class116.field2903 = null;
		field2899 = null;
		field2906 = null;
		class116.field2894 = null;
		field2902 = null;
		field2909 = null;
		class116.field2901 = null;
		class116.field2910 = null;
		field2904 = null;
		field2911 = null;
		field2892 = null;
	}

	@ObfuscatedName("k.c(B)V")
	public static void method575() {
		if (class122.field3050 != 1) {
			return;
		}
		if (class112.field2762 >= 539 && class112.field2762 <= 573 && class1.field14 >= 169 && class1.field14 < 205 && class97.field2397[0] != -1) {
			class95.field2364 = true;
			class39.field1055 = true;
			class9.field330 = 0;
		}
		if (class112.field2762 >= 569 && class112.field2762 <= 599 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2397[1] != -1) {
			class9.field330 = 1;
			class39.field1055 = true;
			class95.field2364 = true;
		}
		if (class112.field2762 >= 597 && class112.field2762 <= 627 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2397[2] != -1) {
			class95.field2364 = true;
			class9.field330 = 2;
			class39.field1055 = true;
		}
		if (class112.field2762 >= 625 && class112.field2762 <= 669 && class1.field14 >= 168 && class1.field14 < 203 && class97.field2397[3] != -1) {
			class95.field2364 = true;
			class39.field1055 = true;
			class9.field330 = 3;
		}
		if (class112.field2762 >= 666 && class112.field2762 <= 696 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2397[4] != -1) {
			class9.field330 = 4;
			class39.field1055 = true;
			class95.field2364 = true;
		}
		if (class112.field2762 >= 694 && class112.field2762 <= 724 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2397[5] != -1) {
			class95.field2364 = true;
			class39.field1055 = true;
			class9.field330 = 5;
		}
		if (class112.field2762 >= 722 && class112.field2762 <= 756 && class1.field14 >= 169 && class1.field14 < 205 && class97.field2397[6] != -1) {
			class39.field1055 = true;
			class9.field330 = 6;
			class95.field2364 = true;
		}
		if (class112.field2762 >= 540 && class112.field2762 <= 574 && class1.field14 >= 466 && class1.field14 < 502 && class97.field2397[7] != -1) {
			class9.field330 = 7;
			class95.field2364 = true;
			class39.field1055 = true;
		}
		if (class112.field2762 >= 572 && class112.field2762 <= 602 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2397[8] != -1) {
			class39.field1055 = true;
			class95.field2364 = true;
			class9.field330 = 8;
		}
		if (class112.field2762 >= 599 && class112.field2762 <= 629 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2397[9] != -1) {
			class95.field2364 = true;
			class9.field330 = 9;
			class39.field1055 = true;
		}
		if (class112.field2762 >= 627 && class112.field2762 <= 671 && class1.field14 >= 467 && class1.field14 < 502 && class97.field2397[10] != -1) {
			class9.field330 = 10;
			class95.field2364 = true;
			class39.field1055 = true;
		}
		if (class112.field2762 >= 669 && class112.field2762 <= 699 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2397[11] != -1) {
			class9.field330 = 11;
			class39.field1055 = true;
			class95.field2364 = true;
		}
		if (class112.field2762 >= 696 && class112.field2762 <= 726 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2397[12] != -1) {
			class39.field1055 = true;
			class95.field2364 = true;
			class9.field330 = 12;
		}
		if (class112.field2762 >= 724 && class112.field2762 <= 758 && class1.field14 >= 466 && class1.field14 < 502 && class97.field2397[13] != -1) {
			class9.field330 = 13;
			class39.field1055 = true;
			class95.field2364 = true;
			return;
		}
	}

	@ObfuscatedName("kc.a(Lbd;ILbd;)V")
	public static void method603(class11 arg0, class11 arg1) {
		field2799 = arg1;
		field3244 = arg0;
	}

	@ObfuscatedName("td.c(I)V")
	public static void method970() {
		field1747.method571();
		for (int var0 = 0; var0 < 32; var0++) {
			class64.field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			class133.field3281[var1] = 0L;
		}
		field681 = 0;
	}

	@ObfuscatedName("ec.b(Z)V")
	public static void method374() {
		try {
			if (class22.field693 == 0) {
				if (field1450 != null) {
					field1450.method1015();
					field1450 = null;
				}
				class78.field1919 = false;
				class22.field693 = 1;
				client.field577 = 0;
				field1380 = null;
			}
			if (class22.field693 == 1) {
				if (field1380 == null) {
					field1380 = field1071.method657(field545);
				}
				if (field1380.field815 == 2) {
					throw new IOException();
				}
				if (field1380.field815 == 1) {
					field1450 = new class129((Socket) field1380.field818, field1071);
					class22.field693 = 2;
					field1380 = null;
				}
			}
			if (class22.field693 == 2) {
				long var0 = field1843 = class123.field3071.method9();
				class70.field1726.field267 = 0;
				class70.field1726.method141(14);
				int var2 = (int) (var0 >> 16 & 0x1FL);
				class70.field1726.method141(var2);
				field1450.method1016(2, class70.field1726.field284);
				class22.field693 = 3;
				class15.field488.field267 = 0;
			}
			if (class22.field693 == 3) {
				int var3 = field1450.method1022();
				if (var3 != 0) {
					method612(var3);
					return;
				}
				class15.field488.field267 = 0;
				class22.field693 = 4;
			}
			if (class22.field693 == 4) {
				if (class15.field488.field267 < 8) {
					int var4 = field1450.method1020();
					if (var4 > 8 - class15.field488.field267) {
						var4 = 8 - class15.field488.field267;
					}
					if (var4 > 0) {
						field1450.method1014(class15.field488.field267, var4, class15.field488.field284);
						class15.field488.field267 += var4;
					}
				}
				if (class15.field488.field267 == 8) {
					class15.field488.field267 = 0;
					class128.field3132 = class15.field488.method174();
					class22.field693 = 5;
				}
			}
			if (class22.field693 == 5) {
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class128.field3132 >> 32), (int) class128.field3132 };
				class70.field1726.field267 = 0;
				class70.field1726.method141(10);
				class70.field1726.method182(var5[0]);
				class70.field1726.method182(var5[1]);
				class70.field1726.method182(var5[2]);
				class70.field1726.method182(var5[3]);
				class70.field1726.method182(field1071.field1701);
				class70.field1726.method157(class123.field3071.method9());
				class70.field1726.method181(class123.field3055);
				class70.field1726.method142(class80.field1993, class36.field964);
				class121.field3003.field267 = 0;
				if (class103.field2599 == 40) {
					class121.field3003.method141(18);
				} else {
					class121.field3003.method141(16);
				}
				class121.field3003.method141(class70.field1726.field267 + 57);
				class121.field3003.method182(435);
				class121.field3003.method141(class93.field2332 ? 1 : 0);
				class121.field3003.method182(field1378.field366);
				class121.field3003.method182(field657.field366);
				class121.field3003.method182(field2376.field366);
				class121.field3003.method182(field3200.field366);
				class121.field3003.method182(field2031.field366);
				class121.field3003.method182(field3131.field366);
				class121.field3003.method182(field2702.field366);
				class121.field3003.method182(field1890.field366);
				class121.field3003.method182(field1087.field366);
				class121.field3003.method182(field1752.field366);
				class121.field3003.method182(field1542.field366);
				class121.field3003.method182(field2324.field366);
				class121.field3003.method182(field2739.field366);
				class121.field3003.method151(class70.field1726.field267, class70.field1726.field284);
				field1450.method1016(class121.field3003.field267, class121.field3003.field284);
				class70.field1726.method416(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				class15.field488.method416(var5);
				class22.field693 = 6;
			}
			if (class22.field693 == 6 && field1450.method1020() > 0) {
				int var7 = field1450.method1022();
				if (var7 == 21 && class103.field2599 == 20) {
					class22.field693 = 7;
				} else if (var7 == 2) {
					class22.field693 = 9;
				} else if (var7 == 15 && class103.field2599 == 40) {
					method716();
					return;
				} else if (var7 == 23 && class34.field896 < 1) {
					class34.field896++;
					class22.field693 = 0;
				} else {
					method612(var7);
					return;
				}
			}
			if (class22.field693 == 7 && field1450.method1020() > 0) {
				class72.field1763 = field1450.method1022() * 60 + 180;
				class22.field693 = 8;
			}
			if (class22.field693 == 8) {
				client.field577 = 0;
				method678(method956(new class1[] { method502(class72.field1763 / 60), class79.field1931 }), class14.field468, class62.field1561);
				if (--class72.field1763 <= 0) {
					class22.field693 = 0;
				}
			} else {
				if (class22.field693 == 9 && field1450.method1020() >= 8) {
					class37.field1004 = field1450.method1022();
					class45.field1186 = field1450.method1022() == 1;
					class67.field1683 = field1450.method1022();
					class67.field1683 <<= 0x8;
					class67.field1683 += field1450.method1022();
					class89.field2189 = field1450.method1022();
					field1450.method1014(0, 1, class15.field488.field284);
					class15.field488.field267 = 0;
					class112.field2761 = class15.field488.method409();
					field1450.method1014(0, 2, class15.field488.field284);
					class15.field488.field267 = 0;
					class100.field2547 = class15.field488.method145();
					class22.field693 = 10;
				}
				if (class22.field693 != 10) {
					client.field577++;
					if (client.field577 > 2000) {
						if (class34.field896 < 1) {
							class34.field896++;
							if (field915 == field545) {
								field545 = field223;
							} else {
								field545 = field915;
							}
							class22.field693 = 0;
						} else {
							method612(-3);
						}
					}
				} else if (field1450.method1020() >= class100.field2547) {
					class15.field488.field267 = 0;
					field1450.method1014(0, class100.field2547, class15.field488.field284);
					method291();
					field2604 = -1;
					method524(false);
					class112.field2761 = -1;
				}
			}
		} catch (IOException var8) {
			if (class34.field896 < 1) {
				if (field915 == field545) {
					field545 = field223;
				} else {
					field545 = field915;
				}
				class34.field896++;
				class22.field693 = 0;
			} else {
				method612(-2);
			}
		}
	}

	@ObfuscatedName("rc.a(I)V")
	public static void method884() {
		Object var0 = class5.field213;
		synchronized (class5.field213) {
			if (class8.field307 != 0) {
				class8.field307 = 1;
				try {
					class5.field213.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("ja.a(IBIII)V")
	public static void method541(int arg0, int arg1, int arg2, int arg3) {
		if (class55.field1446.length <= field1448) {
			field1442.method310(class55.field1446, field1448);
			field1448 = 0;
		}
		class55.field1446[field1448++] = arg2 - field1445;
		field1445 = arg2;
		class55.field1446[field1448++] = arg3 | arg0 << 8 | arg1 << 16;
	}

	@ObfuscatedName("fe.a(ZBII)La;")
	public static class1 method418(boolean arg0, int arg1) {
		int var2 = 1;
		int var3 = arg1 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg1 < 0 || arg0) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg1 < 0) {
			var5[0] = 45;
		} else if (arg0) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg1 % 10;
			arg1 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		class1 var8 = new class1();
		var8.field38 = var5;
		var8.field26 = var4;
		return var8;
	}

	@ObfuscatedName("hc.c(I)V")
	public static void method475() {
		method7(false, null, 0);
	}

	@ObfuscatedName("va.b(I)V")
	public static void method1008() {
		class127.field3127 = null;
		class127.field3120 = null;
		class127.field3118 = null;
		class127.field3125 = null;
		class127.field3124 = null;
		class127.field3115 = null;
		class127.field3111 = null;
		class127.field3113 = null;
		class127.field3128 = null;
		class127.field3126 = null;
	}

	@ObfuscatedName("aa.k(I)V")
	public static void method44() {
		try {
			Graphics var0 = field3049.getGraphics();
			field925.method101(4, var0, 4);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public static void method604(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = class37.field994[arg0];
		int var2 = class117.field2925[arg0];
		int var3 = class79.field1932[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = class72.field1770[arg0];
		if (class114.field2811 != 0 && var3 != 1005) {
			class114.field2811 = 0;
			class105.field2637 = true;
		}
		if (var3 == 37) {
			class70.field1726.method415(21);
			class70.field1726.method170(field2949);
			class70.field1726.method179(var2);
			class70.field1726.method150(var4);
			class70.field1726.method150(var1);
			class19.field656 = 2;
			class105.field2649 = var1;
			class43.field1154 = 0;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			class67.field1679 = var2;
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 38) {
			boolean var5 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var5) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class34.field894 = 0;
			class16.field523 = class1.field14;
			class119.field2967 = class112.field2762;
			class92.field2295 = 2;
			class70.field1726.method415(190);
			class70.field1726.method154(var1 + field806);
			class70.field1726.method150(var4);
			class70.field1726.method150(field1408 + var2);
		}
		if (var3 == 1004) {
			class16.field523 = class1.field14;
			class119.field2967 = class112.field2762;
			class92.field2295 = 2;
			class34.field894 = 0;
			class70.field1726.method415(148);
			class70.field1726.method162(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 27) {
			method491(var1, var4, var2);
			class70.field1726.method415(229);
			class70.field1726.method162(field806 + var1);
			class70.field1726.method162(var4 >> 14 & 0x7FFF);
			class70.field1726.method162(field1408 + var2);
		}
		if (var3 == 1) {
			class2 var7 = class80.field2030[var4];
			if (var7 != null) {
				method576(1, 0, field2621.field1962[0], var7.field1962[0], 0, false, 0, 1, field2621.field2009[0], var7.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class34.field894 = 0;
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class70.field1726.method415(221);
				class70.field1726.method163(field2949);
				class70.field1726.method162(var4);
			}
		}
		if (var3 == 26 || var3 == 46) {
			class1 var8 = class102.field2586[arg0];
			int var9 = var8.method11(class53.field1393);
			if (var9 != -1) {
				class1 var10 = var8.method1(var9 + 5).method40();
				class1 var11 = var10.method13().method36();
				boolean var12 = false;
				for (int var13 = 0; var13 < class118.field2939; var13++) {
					class2 var14 = class80.field2030[class112.field2758[var13]];
					if (var14 != null && var14.field86 != null && var14.field86.method14(var11)) {
						var12 = true;
						method576(1, 0, field2621.field1962[0], var14.field1962[0], 0, false, 0, 1, field2621.field2009[0], var14.field2009[0], 2);
						if (var3 == 26) {
							class70.field1726.method415(96);
							class70.field1726.method169(class112.field2758[var13]);
						}
						if (var3 == 46) {
							class70.field1726.method415(68);
							class70.field1726.method162(class112.field2758[var13]);
						}
						break;
					}
				}
				if (!var12) {
					method758(0, method956(new class1[] { class23.field718, var11 }), class132.field3234);
				}
			}
		}
		if (var3 == 55) {
			class70.field1726.method415(26);
			class70.field1726.method169(var1);
			class70.field1726.method170(var2);
			class70.field1726.method169(var4);
			class67.field1679 = var2;
			class43.field1154 = 0;
			class105.field2649 = var1;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 53) {
			class70.field1726.method415(38);
			class70.field1726.method169(var4);
			class70.field1726.method162(var1);
			class70.field1726.method163(var2);
			class105.field2649 = var1;
			class19.field656 = 2;
			class43.field1154 = 0;
			class67.field1679 = var2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 57) {
			class70.field1726.method415(64);
			class70.field1726.method182(var2);
			class100 var15 = method1053(var2);
			if (var15.field2554 != null && var15.field2554[0][0] == 5) {
				int var16 = var15.field2554[0][1];
				if (class113.field2803[var16] != var15.field2499[0]) {
					class113.field2803[var16] = var15.field2499[0];
					method476(var16);
					class39.field1055 = true;
				}
			}
		}
		if (var3 == 52) {
			class70.field1726.method415(240);
			class70.field1726.method154(var1);
			class70.field1726.method162(var4);
			class70.field1726.method179(var2);
			class105.field2649 = var1;
			class67.field1679 = var2;
			class43.field1154 = 0;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 10) {
			class2 var17 = class80.field2030[var4];
			if (var17 != null) {
				method576(1, 0, field2621.field1962[0], var17.field1962[0], 0, false, 0, 1, field2621.field2009[0], var17.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class70.field1726.method415(68);
				class70.field1726.method162(var4);
			}
		}
		if (var3 == 14) {
			class2 var18 = class80.field2030[var4];
			if (var18 != null) {
				method576(1, 0, field2621.field1962[0], var18.field1962[0], 0, false, 0, 1, field2621.field2009[0], var18.field2009[0], 2);
				class34.field894 = 0;
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class119.field2967 = class112.field2762;
				class70.field1726.method415(96);
				class70.field1726.method169(var4);
			}
		}
		if (var3 == 1001) {
			class119.field2967 = class112.field2762;
			class92.field2295 = 2;
			class16.field523 = class1.field14;
			class34.field894 = 0;
			class130 var19 = class120.field2992[var4];
			if (var19 != null) {
				class42 var20 = var19.field3182;
				if (var20.field1136 != null) {
					var20 = var20.method457();
				}
				if (var20 != null) {
					class70.field1726.method415(247);
					class70.field1726.method154(var20.field1137);
				}
			}
		}
		if (var3 == 22) {
			class2 var21 = class80.field2030[var4];
			if (var21 != null) {
				method576(1, 0, field2621.field1962[0], var21.field1962[0], 0, false, 0, 1, field2621.field2009[0], var21.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class70.field1726.method415(110);
				class70.field1726.method154(var4);
				class70.field1726.method163(field1075);
				class70.field1726.method150(field2437);
				class70.field1726.method150(field2281);
			}
		}
		if (var3 == 19) {
			field2437 = var4;
			field2281 = var1;
			field1075 = var2;
			class14.field475 = 1;
			class130.field3177 = method956(new class1[] { class93.field2334, method760(var4).field2827, class53.field1393 });
			client.field594 = 0;
			if (class130.field3177 == null) {
				class130.field3177 = class64.field1631;
			}
			class39.field1055 = true;
			return;
		}
		if (var3 == 15) {
			boolean var22 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var22) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class34.field894 = 0;
			class92.field2295 = 2;
			class16.field523 = class1.field14;
			class119.field2967 = class112.field2762;
			class70.field1726.method415(168);
			class70.field1726.method162(var4);
			class70.field1726.method169(field806 + var1);
			class70.field1726.method163(field2949);
			class70.field1726.method150(field1408 + var2);
		}
		if (var3 == 23) {
			class70.field1726.method415(64);
			class70.field1726.method182(var2);
			class100 var24 = method1053(var2);
			if (var24.field2554 != null && var24.field2554[0][0] == 5) {
				int var25 = var24.field2554[0][1];
				class113.field2803[var25] = 1 - class113.field2803[var25];
				method476(var25);
				class39.field1055 = true;
			}
		}
		if (var3 == 48) {
			class70.field1726.method415(147);
			class70.field1726.method169(var4);
			class70.field1726.method162(var1);
			class70.field1726.method170(var2);
			class19.field656 = 2;
			class105.field2649 = var1;
			class67.field1679 = var2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
			class43.field1154 = 0;
		}
		if (var3 == 18) {
			class1 var26 = class102.field2586[arg0];
			int var27 = var26.method11(class53.field1393);
			if (var27 != -1) {
				long var28 = var26.method1(var27 + 5).method40().method9();
				int var30 = -1;
				for (int var31 = 0; var31 < class59.field1492; var31++) {
					if (class117.field2929[var31] == var28) {
						var30 = var31;
						break;
					}
				}
				if (var30 != -1 && class73.field1788[var30] > 0) {
					class78.field1924 = 3;
					class105.field2637 = true;
					class114.field2811 = 0;
					class132.field3232 = class132.field3234;
					class37.field1001 = true;
					class36.field958 = class117.field2929[var30];
					class132.field3230 = method956(new class1[] { class75.field1873, class119.field2951[var30] });
				}
			}
		}
		if (var3 == 1003) {
			class34.field894 = 0;
			class92.field2295 = 2;
			class16.field523 = class1.field14;
			class119.field2967 = class112.field2762;
			class70.field1726.method415(151);
			class70.field1726.method154(var4);
		}
		if (var3 == 1002) {
			method491(var1, var4, var2);
			class70.field1726.method415(62);
			class70.field1726.method150(var4 >> 14 & 0x7FFF);
			class70.field1726.method162(var2 + field1408);
			class70.field1726.method154(field806 + var1);
		}
		if (var3 == 30) {
			class130 var32 = class120.field2992[var4];
			if (var32 != null) {
				method576(1, 0, field2621.field1962[0], var32.field1962[0], 0, false, 0, 1, field2621.field2009[0], var32.field2009[0], 2);
				class34.field894 = 0;
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class92.field2295 = 2;
				class70.field1726.method415(57);
				class70.field1726.method150(var4);
			}
		}
		if (var3 == 49) {
			class130 var33 = class120.field2992[var4];
			if (var33 != null) {
				method576(1, 0, field2621.field1962[0], var33.field1962[0], 0, false, 0, 1, field2621.field2009[0], var33.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class92.field2295 = 2;
				class70.field1726.method415(208);
				class70.field1726.method169(var4);
				class70.field1726.method169(field2437);
				class70.field1726.method154(field2281);
				class70.field1726.method182(field1075);
			}
		}
		if (var3 == 29) {
			method491(var1, var4, var2);
			class70.field1726.method415(164);
			class70.field1726.method154(field806 + var1);
			class70.field1726.method154(field1408 + var2);
			class70.field1726.method154(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 5 && method491(var1, var4, var2)) {
			class70.field1726.method415(24);
			class70.field1726.method154(field1408 + var2);
			class70.field1726.method169(field2437);
			class70.field1726.method162(var4 >> 14 & 0x7FFF);
			class70.field1726.method154(field2281);
			class70.field1726.method163(field1075);
			class70.field1726.method154(field806 + var1);
		}
		if (var3 == 34) {
			class130 var34 = class120.field2992[var4];
			if (var34 != null) {
				method576(1, 0, field2621.field1962[0], var34.field1962[0], 0, false, 0, 1, field2621.field2009[0], var34.field2009[0], 2);
				class34.field894 = 0;
				class92.field2295 = 2;
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class70.field1726.method415(0);
				class70.field1726.method169(var4);
			}
		}
		if (var3 == 56) {
			class70.field1726.method415(40);
			class70.field1726.method154(var4);
			class70.field1726.method154(var1);
			class70.field1726.method170(var2);
			class70.field1726.method170(field1075);
			class70.field1726.method162(field2437);
			class70.field1726.method169(field2281);
			class67.field1679 = var2;
			class43.field1154 = 0;
			class105.field2649 = var1;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 33) {
			class100 var35 = method1053(var2);
			class39.field1055 = true;
			client.field594 = 1;
			class60.field1523 = var35.field2470;
			field2846 = var35.field2508;
			class14.field475 = 0;
			field2949 = var2;
			class52.field1384 = method956(new class1[] { class102.field2564, var35.field2515, class53.field1393 });
			if (field2846 == 16) {
				class95.field2364 = true;
				class9.field330 = 3;
				class39.field1055 = true;
			}
			return;
		}
		if (var3 == 1007) {
			class100 var36 = method1053(var2);
			if (var36 != null && var36.field2519 != null && var1 != -1) {
				var36 = var36.field2519[var1];
			}
			if (var36 == null || var36.field2540 < 100000) {
				class70.field1726.method415(151);
				class70.field1726.method154(var4);
			} else {
				method758(0, method956(new class1[] { method502(var36.field2540), class131.field3203, method760(var4).field2827 }), class132.field3234);
			}
		}
		if (var3 == 42) {
			class100 var37 = method1053(var2);
			boolean var38 = true;
			if (var37.field2445 > 0) {
				var38 = method190(var37);
			}
			if (var38) {
				class70.field1726.method415(64);
				class70.field1726.method182(var2);
			}
		}
		if (var3 == 31) {
			class70.field1726.method415(163);
			class70.field1726.method154(var1);
			class70.field1726.method154(var4);
			class70.field1726.method182(var2);
			class105.field2649 = var1;
			class19.field656 = 2;
			class67.field1679 = var2;
			class43.field1154 = 0;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 12) {
			class130 var39 = class120.field2992[var4];
			if (var39 != null) {
				method576(1, 0, field2621.field1962[0], var39.field1962[0], 0, false, 0, 1, field2621.field2009[0], var39.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class92.field2295 = 2;
				class70.field1726.method415(63);
				class70.field1726.method154(var4);
			}
		}
		if (var3 == 2) {
			boolean var40 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var40) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class92.field2295 = 2;
			class34.field894 = 0;
			class119.field2967 = class112.field2762;
			class16.field523 = class1.field14;
			class70.field1726.method415(244);
			class70.field1726.method162(var1 + field806);
			class70.field1726.method169(field1408 + var2);
			class70.field1726.method150(var4);
		}
		if (var3 == 3) {
			boolean var42 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var42) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class34.field894 = 0;
			class119.field2967 = class112.field2762;
			class92.field2295 = 2;
			class16.field523 = class1.field14;
			class70.field1726.method415(85);
			class70.field1726.method169(field1408 + var2);
			class70.field1726.method169(var4);
			class70.field1726.method162(field806 + var1);
		}
		if (var3 == 21) {
			class130 var44 = class120.field2992[var4];
			if (var44 != null) {
				method576(1, 0, field2621.field1962[0], var44.field1962[0], 0, false, 0, 1, field2621.field2009[0], var44.field2009[0], 2);
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class92.field2295 = 2;
				class70.field1726.method415(253);
				class70.field1726.method150(var4);
				class70.field1726.method163(field2949);
			}
		}
		if (var3 == 45 || var3 == 51 || var3 == 13 || var3 == 35) {
			class1 var45 = class102.field2586[arg0];
			int var46 = var45.method11(class53.field1393);
			if (var46 != -1) {
				long var47 = var45.method1(var46 + 5).method40().method9();
				if (var3 == 45) {
					method703(var47);
				}
				if (var3 == 51) {
					method383(var47);
				}
				if (var3 == 13) {
					method624(var47);
				}
				if (var3 == 35) {
					method544(var47);
				}
			}
		}
		if (var3 == 44) {
			class2 var49 = class80.field2030[var4];
			if (var49 != null) {
				method576(1, 0, field2621.field1962[0], var49.field1962[0], 0, false, 0, 1, field2621.field2009[0], var49.field2009[0], 2);
				class92.field2295 = 2;
				class34.field894 = 0;
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class70.field1726.method415(220);
				class70.field1726.method150(var4);
			}
		}
		if (var3 == 7) {
			if (class6.field224) {
				field3183.method76(var1 - 4, var2 + -4);
			} else {
				field3183.method76(class112.field2762 - 4, class1.field14 + -4);
			}
		}
		if (var3 == 1006) {
			class100 var50 = method1053(var2);
			if (var50 == null || var50.field2516[var1] < 100000) {
				class70.field1726.method415(151);
				class70.field1726.method154(var4);
			} else {
				method758(0, method956(new class1[] { method502(var50.field2516[var1]), class131.field3203, method760(var4).field2827 }), class132.field3234);
			}
			class105.field2649 = var1;
			class43.field1154 = 0;
			class67.field1679 = var2;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 17) {
			method491(var1, var4, var2);
			class70.field1726.method415(183);
			class70.field1726.method169(var2 + field1408);
			class70.field1726.method150(var4 >> 14 & 0x7FFF);
			class70.field1726.method169(var1 + field806);
		}
		if (var3 == 50) {
			method673(var1, var4, var2);
		}
		if (var3 == 40) {
			method895(class98.field2421);
			class98.field2421 = -1;
			class105.field2637 = true;
		}
		if (var3 == 32 && method491(var1, var4, var2)) {
			class70.field1726.method415(225);
			class70.field1726.method150(var4 >> 14 & 0x7FFF);
			class70.field1726.method154(var2 + field1408);
			class70.field1726.method163(field2949);
			class70.field1726.method162(field806 + var1);
		}
		if (var3 == 25) {
			class70.field1726.method415(228);
			class70.field1726.method162(var4);
			class70.field1726.method170(var2);
			class70.field1726.method162(var1);
			class43.field1154 = 0;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
			class67.field1679 = var2;
			class105.field2649 = var1;
		}
		if (var3 == 11) {
			class70.field1726.method415(29);
			class70.field1726.method163(var2);
			class70.field1726.method169(var1);
			class70.field1726.method162(var4);
			class105.field2649 = var1;
			class67.field1679 = var2;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
			class43.field1154 = 0;
		}
		if (var3 == 41) {
			class2 var51 = class80.field2030[var4];
			if (var51 != null) {
				method576(1, 0, field2621.field1962[0], var51.field1962[0], 0, false, 0, 1, field2621.field2009[0], var51.field2009[0], 2);
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class119.field2967 = class112.field2762;
				class34.field894 = 0;
				class70.field1726.method415(187);
				class70.field1726.method154(var4);
			}
		}
		if (var3 == 28) {
			class1 var52 = class102.field2586[arg0];
			int var53 = var52.method11(class53.field1393);
			if (var53 != -1) {
				if (class132.field3227 == -1) {
					method413();
					if (class74.field1844 != -1) {
						class132.field3217 = var52.method1(var53 + 5).method40();
						class132.field3215 = class132.field3227 = class74.field1844;
						class133.field3268 = false;
					}
				} else {
					method758(0, class78.field1921, class132.field3234);
				}
			}
		}
		if (var3 == 8) {
			boolean var54 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var54) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class119.field2967 = class112.field2762;
			class34.field894 = 0;
			class92.field2295 = 2;
			class16.field523 = class1.field14;
			class70.field1726.method415(65);
			class70.field1726.method169(var4);
			class70.field1726.method169(var2 + field1408);
			class70.field1726.method162(field806 + var1);
		}
		if (var3 == 9) {
			method413();
		}
		if (var3 == 54 && class120.field2998 == -1) {
			method414(0, var2);
			class120.field2998 = var2;
		}
		if (var3 == 43) {
			class70.field1726.method415(98);
			class70.field1726.method150(var1);
			class70.field1726.method163(var2);
			class70.field1726.method150(var4);
			class43.field1154 = 0;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			class105.field2649 = var1;
			class67.field1679 = var2;
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 36) {
			boolean var56 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var56) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class16.field523 = class1.field14;
			class92.field2295 = 2;
			class34.field894 = 0;
			class119.field2967 = class112.field2762;
			class70.field1726.method415(27);
			class70.field1726.method150(field806 + var1);
			class70.field1726.method169(var4);
			class70.field1726.method169(field1408 + var2);
		}
		if (var3 == 39) {
			class2 var58 = class80.field2030[var4];
			if (var58 != null) {
				method576(1, 0, field2621.field1962[0], var58.field1962[0], 0, false, 0, 1, field2621.field2009[0], var58.field2009[0], 2);
				class34.field894 = 0;
				class119.field2967 = class112.field2762;
				class92.field2295 = 2;
				class16.field523 = class1.field14;
				class70.field1726.method415(211);
				class70.field1726.method162(var4);
			}
		}
		if (var3 == 24) {
			class70.field1726.method415(124);
			class70.field1726.method150(var1);
			class70.field1726.method170(var2);
			class70.field1726.method150(var4);
			class67.field1679 = var2;
			class43.field1154 = 0;
			class105.field2649 = var1;
			class19.field656 = 2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 16) {
			method491(var1, var4, var2);
			class70.field1726.method415(30);
			class70.field1726.method169(var4 >> 14 & 0x7FFF);
			class70.field1726.method169(field1408 + var2);
			class70.field1726.method154(field806 + var1);
		}
		if (var3 == 20) {
			class130 var59 = class120.field2992[var4];
			if (var59 != null) {
				method576(1, 0, field2621.field1962[0], var59.field1962[0], 0, false, 0, 1, field2621.field2009[0], var59.field2009[0], 2);
				class92.field2295 = 2;
				class119.field2967 = class112.field2762;
				class16.field523 = class1.field14;
				class34.field894 = 0;
				class70.field1726.method415(153);
				class70.field1726.method162(var4);
			}
		}
		if (var3 == 47) {
			boolean var60 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var60) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class119.field2967 = class112.field2762;
			class16.field523 = class1.field14;
			class34.field894 = 0;
			class92.field2295 = 2;
			class70.field1726.method415(172);
			class70.field1726.method169(field806 + var1);
			class70.field1726.method150(field2281);
			class70.field1726.method169(var4);
			class70.field1726.method179(field1075);
			class70.field1726.method162(field1408 + var2);
			class70.field1726.method162(field2437);
		}
		if (var3 == 6) {
			class70.field1726.method415(102);
			class70.field1726.method170(var2);
			class70.field1726.method154(var1);
			class70.field1726.method150(var4);
			class105.field2649 = var1;
			class43.field1154 = 0;
			class19.field656 = 2;
			class67.field1679 = var2;
			if (var2 >> 16 == class132.field3227) {
				class19.field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				class19.field656 = 3;
			}
		}
		if (var3 == 4) {
			class130 var62 = class120.field2992[var4];
			if (var62 != null) {
				method576(1, 0, field2621.field1962[0], var62.field1962[0], 0, false, 0, 1, field2621.field2009[0], var62.field2009[0], 2);
				class92.field2295 = 2;
				class119.field2967 = class112.field2762;
				class34.field894 = 0;
				class16.field523 = class1.field14;
				class70.field1726.method415(116);
				class70.field1726.method162(var4);
			}
		}
		if (class14.field475 != 0) {
			class14.field475 = 0;
			class39.field1055 = true;
		}
		if (client.field594 != 0) {
			class39.field1055 = true;
			client.field594 = 0;
		}
	}

	@ObfuscatedName("pb.e(I)V")
	public static void method810() {
		if (class93.field2332 && class57.field1472 != field75) {
			method731(field2621.field1962[0], field829, field2604, field2621.field2009[0], field75);
		} else if (class8.field305 != field75) {
			class8.field305 = field75;
			method472(field75);
		}
	}

	@ObfuscatedName("ac.b(II)Lhe;")
	public static class47 method103(int arg0) {
		class47 var1 = (class47) class46.field1196.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1241.method217(arg0, 12);
		class47 var3 = new class47();
		if (var2 != null) {
			var3.method489(new class8(var2));
		}
		var3.method486();
		class46.field1196.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("se.a(ILbd;Lbd;)V")
	public static void method930(class11 arg0, class11 arg1) {
		field1583 = arg1;
		field2433 = arg0;
		field974 = field2433.method235(3);
	}

	@ObfuscatedName("hd.a(II)I")
	public static int method480(int arg0) {
		class35 var1 = method686(arg0);
		int var2 = var1.field945;
		int var3 = var1.field933;
		int var4 = var1.field943;
		int var5 = class4.field173[var2 - var4];
		return class113.field2803[var3] >> var4 & var5;
	}

	@ObfuscatedName("fc.a(ILjd;II)V")
	public static void method400(int arg0, class58 arg1, int arg2) {
		int var3 = arg0 * arg0 + arg2 * arg2;
		if (var3 <= 4225 || var3 >= 90000) {
			method387(arg2, arg0, arg1);
			return;
		}
		int var4 = class86.field2158 + class113.field2797 & 0x7FF;
		int var5 = class91.field2256[var4];
		int var6 = class91.field2258[var4];
		int var7 = var5 * 256 / (class103.field2589 + 256);
		int var8 = var6 * 256 / (class103.field2589 + 256);
		int var9 = arg2 * var8 - arg0 * var7 >> 16;
		int var10 = arg0 * var8 + arg2 * var7 >> 16;
		double var11 = Math.atan2((double) var10, (double) var9);
		int var13 = (int) (Math.sin(var11) * 63.0D);
		int var14 = (int) (Math.cos(var11) * 57.0D);
		field784.method559(var13 + 4 + 94 - 10, -var14 + 83 + -20, var11);
	}

	@ObfuscatedName("vc.b(Z)V")
	public static void method1019() {
		int var0 = -1;
		if (class14.field475 == 0 && client.field594 == 0) {
			method398(0, class123.field3057, class102.field2568, class24.field741, 7, class132.field3234);
		}
		for (int var1 = 0; var1 < class91.field2261; var1++) {
			int var2 = class91.field2252[var1];
			int var3 = var2 & 0x7F;
			int var4 = var2 >> 7 & 0x7F;
			int var5 = var2 >> 29 & 0x3;
			int var6 = var2 >> 14 & 0x7FFF;
			if (var0 != var2) {
				var0 = var2;
				if (var5 == 2 && field3183.method97(field75, var3, var4, var2) >= 0) {
					class49 var7 = method389(var6);
					if (var7.field1317 != null) {
						var7 = var7.method516();
					}
					if (var7 == null) {
						continue;
					}
					if (class14.field475 == 1) {
						method398(var2, client.field584, var4, var3, 5, method956(new class1[] { class130.field3177, class16.field524, var7.field1332 }));
					} else if (client.field594 != 1) {
						class1[] var8 = var7.field1291;
						if (class118.field2934) {
							var8 = method905(var8);
						}
						if (var8 != null) {
							for (int var9 = 4; var9 >= 0; var9--) {
								if (var8[var9] != null) {
									short var10 = 0;
									if (var9 == 0) {
										var10 = 16;
									}
									if (var9 == 1) {
										var10 = 29;
									}
									if (var9 == 2) {
										var10 = 17;
									}
									if (var9 == 3) {
										var10 = 27;
									}
									if (var9 == 4) {
										var10 = 1002;
									}
									method398(var2, var8[var9], var4, var3, var10, method956(new class1[] { class128.field3136, var7.field1332 }));
								}
							}
						}
						method398(var7.field1321 << 14, class114.field2805, var4, var3, 1004, method956(new class1[] { class128.field3136, var7.field1332 }));
					} else if ((field2846 & 0x4) == 4) {
						method398(var2, class60.field1523, var4, var3, 32, method956(new class1[] { class52.field1384, class16.field524, var7.field1332 }));
					}
				}
				if (var5 == 1) {
					class130 var11 = class120.field2992[var6];
					if (var11.field3182.field1084 == 1 && (var11.field1972 & 0x7F) == 64 && (var11.field1963 & 0x7F) == 64) {
						for (int var12 = 0; var12 < class49.field1341; var12++) {
							class130 var13 = class120.field2992[class22.field677[var12]];
							if (var13 != null && var11 != var13 && var13.field3182.field1084 == 1 && var11.field1972 == var13.field1972 && var11.field1963 == var13.field1963) {
								method1035(var3, var4, class22.field677[var12], var13.field3182);
							}
						}
						for (int var14 = 0; var14 < class118.field2939; var14++) {
							class2 var15 = class80.field2030[class112.field2758[var14]];
							if (var15 != null && var11.field1972 == var15.field1972 && var11.field1963 == var15.field1963) {
								method272(var4, var3, var15, class112.field2758[var14]);
							}
						}
					}
					method1035(var3, var4, var6, var11.field3182);
				}
				if (var5 == 0) {
					class2 var16 = class80.field2030[var6];
					if ((var16.field1972 & 0x7F) == 64 && (var16.field1963 & 0x7F) == 64) {
						for (int var17 = 0; var17 < class49.field1341; var17++) {
							class130 var18 = class120.field2992[class22.field677[var17]];
							if (var18 != null && var18.field3182.field1084 == 1 && var16.field1972 == var18.field1972 && var16.field1963 == var18.field1963) {
								method1035(var3, var4, class22.field677[var17], var18.field3182);
							}
						}
						for (int var19 = 0; var19 < class118.field2939; var19++) {
							class2 var20 = class80.field2030[class112.field2758[var19]];
							if (var20 != null && var16 != var20 && var16.field1972 == var20.field1972 && var16.field1963 == var20.field1963) {
								method272(var4, var3, var20, class112.field2758[var19]);
							}
						}
					}
					method272(var4, var3, var16, var6);
				}
				if (var5 == 3) {
					class92 var21 = class17.field552[field75][var3][var4];
					if (var21 != null) {
						for (class59 var22 = (class59) var21.method801(); var22 != null; var22 = (class59) var21.method812()) {
							class115 var23 = method760(var22.field1499);
							if (class14.field475 == 1) {
								method398(var22.field1499, client.field584, var4, var3, 47, method956(new class1[] { class130.field3177, class9.field328, var23.field2827 }));
							} else if (client.field594 != 1) {
								class1[] var24 = var23.field2835;
								if (class118.field2934) {
									var24 = method905(var24);
								}
								for (int var25 = 4; var25 >= 0; var25--) {
									if (var24 != null && var24[var25] != null) {
										byte var26 = 0;
										if (var25 == 0) {
											var26 = 2;
										}
										if (var25 == 1) {
											var26 = 38;
										}
										if (var25 == 2) {
											var26 = 3;
										}
										if (var25 == 3) {
											var26 = 8;
										}
										if (var25 == 4) {
											var26 = 36;
										}
										method398(var22.field1499, var24[var25], var4, var3, var26, method956(new class1[] { class93.field2334, var23.field2827 }));
									} else if (var25 == 2) {
										method398(var22.field1499, class63.field1594, var4, var3, 3, method956(new class1[] { class93.field2334, var23.field2827 }));
									}
								}
								method398(var22.field1499, class114.field2805, var4, var3, 1003, method956(new class1[] { class93.field2334, var23.field2827 }));
							} else if ((field2846 & 0x1) == 1) {
								method398(var22.field1499, class60.field1523, var4, var3, 15, method956(new class1[] { class52.field1384, class9.field328, var23.field2827 }));
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rc.a(IILbd;I)Z")
	public static boolean method885(int arg0, int arg1, class11 arg2) {
		byte[] var3 = arg2.method217(arg0, arg1);
		if (var3 == null) {
			return false;
		} else {
			method229(var3);
			return true;
		}
	}

	@ObfuscatedName("va.a(ILqd;)Lqd;")
	public static class100 method1009(class100 arg0) {
		int var1;
		if (arg0.field2495 < 0) {
			var1 = arg0.field2454 >> 16;
		} else {
			var1 = arg0.field2495 >> 16;
		}
		if (!method1052(var1)) {
			return null;
		} else if (arg0.field2544 >= 0) {
			return field2922[var1][arg0.field2544 & 0xFFFF];
		} else {
			class100 var2 = field2922[var1][arg0.field2544 >> 15 & 0xFFFF];
			return var2.field2519[arg0.field2544 & 0x7FFF];
		}
	}

	@ObfuscatedName("aa.a(BI)Z")
	public static boolean method45(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("fa.c(I)V")
	public static void method391() {
		if (class42.field1104 < 2 && class14.field475 == 0 && client.field594 == 0) {
			return;
		}
		class1 var0;
		if (class14.field475 == 1 && class42.field1104 < 2) {
			var0 = method956(new class1[] { client.field584, class93.field2337, class130.field3177, class79.field1942 });
		} else if (client.field594 == 1 && class42.field1104 < 2) {
			var0 = method956(new class1[] { class60.field1523, class93.field2337, class52.field1384, class79.field1942 });
		} else {
			var0 = class102.field2586[class42.field1104 - 1];
		}
		if (class42.field1104 > 2) {
			var0 = method956(new class1[] { var0, class106.field2659, method502(class42.field1104 - 2), class81.field2041 });
		}
		field2902.method207(var0, 4, 16777215, class82.field2063 / 1000);
	}

	@ObfuscatedName("hc.b(II)V")
	public static void method476(int arg0) {
		class47.field1237 = class82.field2063;
		method1040();
		int var1 = method1023(arg0).field2404;
		if (var1 == 0) {
			return;
		}
		int var2 = class113.field2803[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				class27.method365(0.9D);
				((class75) field771).method696(0.9D);
			}
			if (var2 == 2) {
				class27.method365(0.8D);
				((class75) field771).method696(0.8D);
			}
			if (var2 == 3) {
				class27.method365(0.7D);
				((class75) field771).method696(0.7D);
			}
			if (var2 == 4) {
				class27.method365(0.6D);
				((class75) field771).method696(0.6D);
			}
			method538();
			class97.field2402 = true;
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
			if (class62.field1554 != var3) {
				if (class62.field1554 == 0 && class122.field3037 != -1) {
					method681(0, class122.field3037, var3, field2702);
					class75.field1860 = 0;
				} else if (var3 == 0) {
					method669();
					class75.field1860 = 0;
				} else {
					method738(var3);
				}
				class62.field1554 = var3;
			}
		}
		if (var1 == 9) {
			class86.field2163 = var2;
		}
		if (var1 == 10) {
			if (var2 == 0) {
				class62.field1559 = 127;
			}
			if (var2 == 1) {
				class62.field1559 = 96;
			}
			if (var2 == 2) {
				class62.field1559 = 64;
			}
			if (var2 == 3) {
				class62.field1559 = 32;
			}
			if (var2 == 4) {
				class62.field1559 = 0;
			}
		}
		if (var1 == 8) {
			class105.field2637 = true;
			class5.field216 = var2;
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
			class16.field527 = var2;
		}
		if (var1 == 5) {
			class134.field3297 = var2;
		}
	}

	@ObfuscatedName("id.a(BLba;)[Ljava/lang/Object;")
	public static Object[] method526(class8 arg0) {
		int var1 = arg0.method144();
		if (var1 == 0) {
			return null;
		}
		Object[] var2 = new Object[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = arg0.method144();
			if (var4 == 0) {
				var2[var3] = Integer.valueOf(arg0.method167());
			} else if (var4 == 1) {
				var2[var3] = arg0.method140();
			}
		}
		return var2;
	}

	@ObfuscatedName("se.a(ILjava/lang/String;)La;")
	public static class1 method931(String arg1) {
		byte[] var2 = arg1.getBytes();
		int var3 = var2.length;
		class1 var4 = new class1();
		int var5 = 0;
		var4.field38 = new byte[var3];
		while (var3 > var5) {
			int var6 = var2[var5++] & 0xFF;
			if (var6 <= 45 && var6 >= 40) {
				if (var5 >= var3) {
					break;
				}
				int var7 = var2[var5++] & 0xFF;
				var4.field38[var4.field26++] = (byte) ((var6 - 40) * 43 + var7 - 48);
			} else if (var6 != 0) {
				var4.field38[var4.field26++] = (byte) var6;
			}
		}
		var4.method28();
		return var4.method17();
	}

	@ObfuscatedName("ta.b(B)V")
	public static void method945() {
		if (class117.field2924 != null) {
			class107 var0 = class117.field2924;
			synchronized (class117.field2924) {
				class117.field2924 = null;
			}
		}
	}

	@ObfuscatedName("td.d(I)V")
	public static void method971() {
		method542();
		if (class103.field2599 != 10) {
			return;
		}
		int var0 = class112.field2762 - 202;
		int var1 = class122.field3050;
		int var2 = class1.field14 - 171;
		if (class53.field1395 == 0) {
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 100 && var2 <= 140) {
				class82.field2084 = 0;
				class53.field1395 = 3;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 100 && var2 <= 140) {
				class53.field1395 = 2;
				class82.field2084 = 0;
				class123.field3060 = class82.field2104;
				class123.field3077 = class38.field1030;
				class123.field3062 = class82.field2088;
				return;
			}
			return;
		}
		if (class53.field1395 == 2) {
			byte var3 = 60;
			int var6 = var3 + 30;
			if (var1 == 1 && var2 >= 75 && var2 < 90) {
				class82.field2084 = 0;
			}
			var6 += 15;
			if (var1 == 1 && var2 >= 90 && var2 < 105) {
				class82.field2084 = 1;
			}
			var6 += 15;
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 130 && var2 <= 170) {
				class123.field3071 = class123.field3071.method13().method36();
				method678(class82.field2101, class82.field2095, class19.field666);
				method399(20);
				return;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 130 && var2 <= 170) {
				class123.field3071 = class123.field3067;
				class123.field3055 = class123.field3067;
				class53.field1395 = 0;
			}
			while (true) {
				boolean var4;
				label138: do {
					while (method685()) {
						var4 = false;
						for (int var5 = 0; var5 < class123.field3074.method10(); var5++) {
							if (field2920 == class123.field3074.method6(var5)) {
								var4 = true;
								break;
							}
						}
						if (class82.field2084 != 0) {
							continue label138;
						}
						if (field2885 == 85 && class123.field3071.method10() > 0) {
							class123.field3071 = class123.field3071.method19(0, class123.field3071.method10() - 1);
						}
						if (field2885 == 84 || field2885 == 80) {
							class82.field2084 = 1;
						}
						if (var4 && class123.field3071.method10() < 12) {
							class123.field3071 = class123.field3071.method21(field2920);
						}
					}
					return;
				} while (class82.field2084 != 1);
				if (field2885 == 85 && class123.field3055.method10() > 0) {
					class123.field3055 = class123.field3055.method19(0, class123.field3055.method10() - 1);
				}
				if (field2885 == 84 || field2885 == 80) {
					class82.field2084 = 0;
				}
				if (var4 && class123.field3055.method10() < 20) {
					class123.field3055 = class123.field3055.method21(field2920);
				}
			}
		}
		if (class53.field1395 != 3 || var1 != 1 || var0 < 105 || var0 > 255 || var2 < 130 || var2 > 170) {
			return;
		}
		class53.field1395 = 0;
	}

	@ObfuscatedName("md.f(I)V")
	public static void method707() {
		class76.field1902 = null;
		class76.field1885 = null;
		field1886 = null;
		class76.field1883 = null;
		field1901 = null;
		class76.field1896 = null;
		class76.field1889 = null;
		field1890 = null;
	}

	@ObfuscatedName("re.a(ILba;)La;")
	public static class1 method893(class8 arg0) {
		return method474(arg0);
	}

	@ObfuscatedName("ac.a(ILqd;)Z")
	public static boolean method104(class100 arg0) {
		int var1 = arg0.field2445;
		if (var1 >= 1 && var1 <= 200 || !(var1 < 701 || var1 > 900)) {
			if (var1 >= 801) {
				var1 -= 701;
			} else if (var1 >= 701) {
				var1 -= 601;
			} else if (var1 < 101) {
				var1--;
			} else {
				var1 -= 101;
			}
			method398(0, class132.field3239, 0, 0, 13, method956(new class1[] { class53.field1393, class119.field2951[var1] }));
			method398(0, class113.field2778, 0, 0, 18, method956(new class1[] { class53.field1393, class119.field2951[var1] }));
			return true;
		} else if (var1 >= 401 && var1 <= 500) {
			method398(0, class132.field3239, 0, 0, 35, method956(new class1[] { class53.field1393, arg0.field2474 }));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("sa.a(B)Lna;")
	public static class79 method909() {
		try {
			return (class79) Class.forName("sb").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new class60();
		}
	}

	@ObfuscatedName("bb.a(BLqd;)Z")
	public static boolean method190(class100 arg0) {
		int var1 = arg0.field2445;
		if (class23.field701 == 2) {
			if (var1 == 201) {
				class78.field1924 = 1;
				class132.field3230 = class100.field2546;
				class37.field1001 = true;
				class114.field2811 = 0;
				class132.field3232 = class132.field3234;
				class105.field2637 = true;
			}
			if (var1 == 202) {
				class78.field1924 = 2;
				class132.field3230 = class24.field738;
				class105.field2637 = true;
				class114.field2811 = 0;
				class37.field1001 = true;
				class132.field3232 = class132.field3234;
			}
		}
		if (var1 == 205) {
			class70.field1750 = 250;
			return true;
		}
		if (var1 == 501) {
			class114.field2811 = 0;
			class78.field1924 = 4;
			class105.field2637 = true;
			class132.field3230 = class103.field2602;
			class132.field3232 = class132.field3234;
			class37.field1001 = true;
		}
		if (var1 == 502) {
			class105.field2637 = true;
			class114.field2811 = 0;
			class78.field1924 = 5;
			class37.field1001 = true;
			class132.field3232 = class132.field3234;
			class132.field3230 = class23.field720;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = (var1 - 300) / 2;
			int var3 = var1 & 0x1;
			class92.field2302.method642(var2, var3 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = (var1 - 314) / 2;
			int var5 = var1 & 0x1;
			class92.field2302.method644(var5 == 1, var4);
		}
		if (var1 == 324) {
			class92.field2302.method643(false);
		}
		if (var1 == 325) {
			class92.field2302.method643(true);
		}
		if (var1 == 326) {
			class70.field1726.method415(231);
			class92.field2302.method635(class70.field1726);
			return true;
		}
		if (var1 == 620) {
			class133.field3268 = !class133.field3268;
		}
		if (var1 >= 601 && var1 <= 613) {
			method413();
			if (class132.field3217.method10() > 0) {
				class70.field1726.method415(202);
				class70.field1726.method157(class132.field3217.method9());
				class70.field1726.method141(var1 - 601);
				class70.field1726.method141(class133.field3268 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("hd.f(I)V")
	public static void method481() {
		class39.field1060.method267();
		class133.field3278.method267();
	}

	@ObfuscatedName("de.a(II)[B")
	public static synchronized byte[] method324(int arg0) {
		if (arg0 == 100 && class17.field551 > 0) {
			byte[] var1 = class113.field2801[--class17.field551];
			class113.field2801[class17.field551] = null;
			return var1;
		} else if (arg0 == 5000 && client.field585 > 0) {
			byte[] var2 = class89.field2179[--client.field585];
			class89.field2179[client.field585] = null;
			return var2;
		} else if (arg0 == 30000 && class35.field934 > 0) {
			byte[] var3 = class62.field1541[--class35.field934];
			class62.field1541[class35.field934] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}

	@ObfuscatedName("va.a(ILe;)V")
	public static void method1010(class25 arg0) {
		for (int var1 = 0; var1 < field2570.length; var1++) {
			field2570[var1] = 0;
		}
		for (int var2 = 0; var2 < 5000; var2++) {
			int var3 = (int) ((double) 256 * 128.0D * Math.random());
			field2570[var3] = (int) (Math.random() * 256.0D);
		}
		for (int var4 = 0; var4 < 20; var4++) {
			for (int var5 = 1; var5 < 255; var5++) {
				for (int var6 = 1; var6 < 127; var6++) {
					int var7 = (var5 << 7) + var6;
					field3025[var7] = (field2570[var7 + 1] + field2570[var7 + 128] + field2570[var7 - 128] + field2570[var7 + -1]) / 4;
				}
			}
			int[] var8 = field2570;
			field2570 = field3025;
			field3025 = var8;
		}
		if (arg0 == null) {
			return;
		}
		int var9 = 0;
		for (int var10 = 0; var10 < arg0.field749; var10++) {
			for (int var11 = 0; var11 < arg0.field744; var11++) {
				if (arg0.field748[var9++] != 0) {
					int var12 = arg0.field750 + var10 + 16;
					int var13 = var11 + arg0.field751 + 16;
					int var14 = (var12 << 7) + var13;
					field2570[var14] = 0;
				}
			}
		}
	}

	@ObfuscatedName("cc.b(B)V")
	public static void method271() {
		if (class122.field3050 != 1) {
			return;
		}
		if (class112.field2762 >= 6 && class112.field2762 <= 106 && class1.field14 >= 467 && class1.field14 <= 499) {
			class15.field504 = true;
			class75.field1864 = (class75.field1864 + 1) % 4;
			class105.field2637 = true;
			class70.field1726.method415(32);
			class70.field1726.method141(class75.field1864);
			class70.field1726.method141(class6.field236);
			class70.field1726.method141(class115.field2828);
		}
		if (class112.field2762 >= 135 && class112.field2762 <= 235 && class1.field14 >= 467 && class1.field14 <= 499) {
			class105.field2637 = true;
			class6.field236 = (class6.field236 + 1) % 3;
			class15.field504 = true;
			class70.field1726.method415(32);
			class70.field1726.method141(class75.field1864);
			class70.field1726.method141(class6.field236);
			class70.field1726.method141(class115.field2828);
		}
		if (class112.field2762 >= 273 && class112.field2762 <= 373 && class1.field14 >= 467 && class1.field14 <= 499) {
			class115.field2828 = (class115.field2828 + 1) % 3;
			class15.field504 = true;
			class105.field2637 = true;
			class70.field1726.method415(32);
			class70.field1726.method141(class75.field1864);
			class70.field1726.method141(class6.field236);
			class70.field1726.method141(class115.field2828);
		}
		if (class112.field2762 < 412 || class112.field2762 > 512 || class1.field14 < 467 || class1.field14 > 499) {
			return;
		}
		if (class132.field3227 == -1) {
			method413();
			if (class74.field1844 != -1) {
				class133.field3268 = false;
				class132.field3215 = class132.field3227 = class74.field1844;
				class132.field3217 = class132.field3234;
				return;
			}
		} else {
			method758(0, class78.field1921, class132.field3234);
		}
		return;
	}

	@ObfuscatedName("re.a(IZZBZ)Lu;")
	public static class120 method894(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		class109 var4 = null;
		if (field797 != null) {
			var4 = new class109(arg0, field797, class46.field1193[arg0], 1000000);
		}
		return new class120(var4, field931, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("ta.h(I)V")
	public static void method946() {
		class115.field2845 = null;
	}

	@ObfuscatedName("nb.g(I)V")
	public static void method726() {
		class15.field500.method267();
		class106.field2680.method267();
		class133.field3249.method267();
	}

	@ObfuscatedName("aa.c(Z)V")
	public static void method46() {
		class2.field83 = null;
		class2.field77 = null;
		field78 = null;
		class2.field93 = null;
		field92 = null;
		class2.field67 = null;
		class2.field101 = null;
		class2.field94 = null;
		class2.field98 = null;
		class2.field64 = null;
	}

	@ObfuscatedName("id.a(B)Z")
	public static boolean method527() {
		long var0 = method869();
		int var2 = (int) (var0 - field2271);
		field2271 = var0;
		if (var2 > 200) {
			var2 = 200;
		}
		class45.field1189 += var2;
		if (class85.field2144 == 0 && class31.field845 == 0 && class48.field1260 == 0 && class134.field3285 == 0) {
			return true;
		} else if (field2769 == null) {
			return false;
		} else {
			try {
				if (class45.field1189 > 30000) {
					throw new IOException();
				}
				while (class31.field845 < 20 && class134.field3285 > 0) {
					class104 var3 = (class104) class103.field2596.method497();
					class8 var4 = new class8(4);
					var4.method141(1);
					var4.method153((int) var3.field2073);
					field2769.method1016(4, var4.field284);
					class78.field1917.method498(var3, var3.field2073);
					class134.field3285--;
					class31.field845++;
				}
				while (class85.field2144 < 20 && class48.field1260 > 0) {
					class104 var5 = (class104) class37.field996.method608();
					class8 var6 = new class8(4);
					var6.method141(0);
					var6.method153((int) var5.field2073);
					field2769.method1016(4, var6.field284);
					var5.method468();
					class74.field1831.method498(var5, var5.field2073);
					class85.field2144++;
					class48.field1260--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = field2769.method1020();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					class45.field1189 = 0;
					byte var9 = 0;
					if (field967 == null) {
						var9 = 8;
					} else if (class102.field2559 == 0) {
						var9 = 1;
					}
					if (var9 <= 0) {
						int var10 = field2613.field284.length - field967.field2619;
						int var11 = 512 - class102.field2559;
						if (var10 - field2613.field267 < var11) {
							var11 = var10 - field2613.field267;
						}
						if (var11 > var8) {
							var11 = var8;
						}
						field2769.method1014(field2613.field267, var11, field2613.field284);
						if (class14.field476 != 0) {
							for (int var12 = 0; var12 < var11; var12++) {
								field2613.field284[field2613.field267 + var12] ^= class14.field476;
							}
						}
						field2613.field267 += var11;
						class102.field2559 += var11;
						if (field2613.field267 == var10) {
							if (field967.field2073 == 16711935L) {
								field2415 = field2613;
								for (int var14 = 0; var14 < 256; var14++) {
									class120 var15 = class50.field1350[var14];
									if (var15 != null) {
										field2415.field267 = var14 * 4 + 5;
										int var16 = field2415.method167();
										var15.method980(var16);
									}
								}
							} else {
								class52.field1363.reset();
								class52.field1363.update(field2613.field284, 0, var10);
								int var13 = (int) class52.field1363.getValue();
								if (field967.field2624 != var13) {
									try {
										field2769.method1015();
									} catch (Exception var28) {
									}
									class14.field476 = (byte) (Math.random() * 255.0D + 1.0D);
									field2769 = null;
									class74.field1803++;
									return false;
								}
								class16.field525 = 0;
								class74.field1803 = 0;
								field967.field2615.method976((field967.field2073 & 0xFF0000L) == 16711680L, (int) (field967.field2073 & 0xFFFFL), field3180, field2613.field284);
							}
							field967.method739();
							field967 = null;
							field2613 = null;
							class102.field2559 = 0;
							if (field3180) {
								class31.field845--;
							} else {
								class85.field2144--;
							}
						} else {
							if (class102.field2559 != 512) {
								break;
							}
							class102.field2559 = 0;
						}
					} else {
						int var17 = var9 - class92.field2301.field267;
						if (var17 > var8) {
							var17 = var8;
						}
						field2769.method1014(class92.field2301.field267, var17, class92.field2301.field284);
						if (class14.field476 != 0) {
							for (int var18 = 0; var18 < var17; var18++) {
								class92.field2301.field284[class92.field2301.field267 + var18] ^= class14.field476;
							}
						}
						class92.field2301.field267 += var17;
						if (var9 > class92.field2301.field267) {
							break;
						}
						if (field967 == null) {
							class92.field2301.field267 = 0;
							int var19 = class92.field2301.method144();
							int var20 = class92.field2301.method145();
							int var21 = class92.field2301.method144();
							int var22 = class92.field2301.method167();
							long var23 = (long) ((var19 << 16) + var20);
							class104 var25 = (class104) class78.field1917.method499(var23);
							field3180 = true;
							if (var25 == null) {
								var25 = (class104) class74.field1831.method499(var23);
								field3180 = false;
							}
							if (var25 == null) {
								throw new IOException();
							}
							field967 = var25;
							int var26 = var21 == 0 ? 5 : 9;
							field2613 = new class8(field967.field2619 + var26 + var22);
							field2613.method141(var21);
							field2613.method182(var22);
							class102.field2559 = 8;
							class92.field2301.field267 = 0;
						} else if (class102.field2559 == 0) {
							if (class92.field2301.field284[0] == -1) {
								class92.field2301.field267 = 0;
								class102.field2559 = 1;
							} else {
								field967 = null;
							}
						}
					}
				}
				return true;
			} catch (IOException var29) {
				try {
					field2769.method1015();
				} catch (Exception var27) {
				}
				class16.field525++;
				field2769 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("sa.b(I)V")
	public static void method910() {
		field3246 = null;
		field856 = null;
		field1385 = null;
		field412 = null;
		field1247 = null;
		field1872 = null;
		field2930 = null;
		field1003 = null;
		field910 = null;
		field3053 = null;
		field2131 = null;
		field2906 = null;
	}

	@ObfuscatedName("hd.g(I)V")
	public static void method482() {
		while (method685()) {
			if (class132.field3227 != -1 && class132.field3227 == class132.field3215) {
				if (field2885 == 85 && class132.field3217.method10() > 0) {
					class132.field3217 = class132.field3217.method19(0, class132.field3217.method10() - 1);
				}
				if ((method936(field2920) || field2920 == 32) && class132.field3217.method10() < 12) {
					class132.field3217 = class132.field3217.method21(field2920);
				}
			} else if (class37.field1001) {
				if (field2885 == 85 && class132.field3232.method10() > 0) {
					class132.field3232 = class132.field3232.method19(0, class132.field3232.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && class132.field3232.method10() < 80) {
					class132.field3232 = class132.field3232.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					class37.field1001 = false;
					class105.field2637 = true;
					if (class78.field1924 == 1) {
						long var9 = class132.field3232.method9();
						method703(var9);
					}
					if (class78.field1924 == 2 && class59.field1492 > 0) {
						long var11 = class132.field3232.method9();
						method624(var11);
					}
					if (class78.field1924 == 3 && class132.field3232.method10() > 0) {
						class70.field1726.method415(207);
						class70.field1726.method141(0);
						int var13 = class70.field1726.field267;
						class70.field1726.method157(class36.field958);
						method105(class132.field3232, class70.field1726);
						class70.field1726.method155(class70.field1726.field267 - var13);
						if (class6.field236 == 2) {
							class6.field236 = 1;
							class15.field504 = true;
							class70.field1726.method415(32);
							class70.field1726.method141(class75.field1864);
							class70.field1726.method141(class6.field236);
							class70.field1726.method141(class115.field2828);
						}
					}
					if (class78.field1924 == 4 && class85.field2146 < 100) {
						long var14 = class132.field3232.method9();
						method383(var14);
					}
					if (class78.field1924 == 5 && class85.field2146 > 0) {
						long var16 = class132.field3232.method9();
						method544(var16);
					}
				}
			} else if (class114.field2811 == 1) {
				if (field2885 == 85 && class132.field3210.method10() > 0) {
					class132.field3210 = class132.field3210.method19(0, class132.field3210.method10() - 1);
					class105.field2637 = true;
				}
				if (method1037(field2920) && class132.field3210.method10() < 10) {
					class132.field3210 = class132.field3210.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					if (class132.field3210.method10() > 0) {
						int var0 = 0;
						if (class132.field3210.method33()) {
							var0 = class132.field3210.method3();
						}
						class70.field1726.method415(238);
						class70.field1726.method182(var0);
					}
					class105.field2637 = true;
					class114.field2811 = 0;
				}
			} else if (class114.field2811 == 2) {
				if (field2885 == 85 && class132.field3210.method10() > 0) {
					class132.field3210 = class132.field3210.method19(0, class132.field3210.method10() - 1);
					class105.field2637 = true;
				}
				if ((method936(field2920) || field2920 == 32) && class132.field3210.method10() < 12) {
					class132.field3210 = class132.field3210.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					if (class132.field3210.method10() > 0) {
						class70.field1726.method415(86);
						class70.field1726.method157(class132.field3210.method9());
					}
					class114.field2811 = 0;
					class105.field2637 = true;
				}
			} else if (class114.field2811 == 3) {
				if (field2885 == 85 && class132.field3210.method10() > 0) {
					class132.field3210 = class132.field3210.method19(0, class132.field3210.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && class132.field3210.method10() < 40) {
					class132.field3210 = class132.field3210.method21(field2920);
					class105.field2637 = true;
				}
			} else if (class86.field2166 == -1 && class42.field1143 == -1) {
				if (field2885 == 85 && class132.field3223.method10() > 0) {
					class132.field3223 = class132.field3223.method19(0, class132.field3223.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && class132.field3223.method10() < 80) {
					class132.field3223 = class132.field3223.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84 && class132.field3223.method10() > 0) {
					if (class37.field1004 == 2) {
						if (class132.field3223.method5(class113.field2783)) {
							method960();
						}
						if (class132.field3223.method5(class22.field676)) {
							class37.field1007 = true;
						}
						if (class132.field3223.method5(class119.field2968)) {
							class37.field1007 = false;
						}
						if (class132.field3223.method5(class28.field789)) {
							for (int var1 = 0; var1 < 4; var1++) {
								for (int var2 = 1; var2 < 103; var2++) {
									for (int var3 = 1; var3 < 103; var3++) {
										class102.field2569[var1].field201[var2][var3] = 0;
									}
								}
							}
						}
						if (class132.field3223.method5(class100.field2497) && class89.field2182 == 2) {
							throw new RuntimeException();
						}
						if (class132.field3223.method5(class6.field228)) {
							class36.field953 = true;
						}
					}
					if (class132.field3223.method26(class72.field1765)) {
						class70.field1726.method415(248);
						class70.field1726.method141(class132.field3223.method10() - 1);
						class70.field1726.method181(class132.field3223.method1(2));
					} else {
						byte var4 = 0;
						class1 var5 = class132.field3223.method30();
						byte var6 = 0;
						if (var5.method26(class97.field2391)) {
							var6 = 0;
							class132.field3223 = class132.field3223.method1(class97.field2391.method10());
						} else if (var5.method26(class9.field326)) {
							class132.field3223 = class132.field3223.method1(class9.field326.method10());
							var6 = 1;
						} else if (var5.method26(class2.field64)) {
							var6 = 2;
							class132.field3223 = class132.field3223.method1(class2.field64.method10());
						} else if (var5.method26(class92.field2296)) {
							var6 = 3;
							class132.field3223 = class132.field3223.method1(class92.field2296.method10());
						} else if (var5.method26(class1.field63)) {
							var6 = 4;
							class132.field3223 = class132.field3223.method1(class1.field63.method10());
						} else if (var5.method26(class82.field2077)) {
							class132.field3223 = class132.field3223.method1(class82.field2077.method10());
							var6 = 5;
						} else if (var5.method26(class86.field2157)) {
							var6 = 6;
							class132.field3223 = class132.field3223.method1(class86.field2157.method10());
						} else if (var5.method26(class76.field1885)) {
							var6 = 7;
							class132.field3223 = class132.field3223.method1(class76.field1885.method10());
						} else if (var5.method26(class112.field2767)) {
							var6 = 8;
							class132.field3223 = class132.field3223.method1(class112.field2767.method10());
						} else if (var5.method26(class102.field2583)) {
							var6 = 9;
							class132.field3223 = class132.field3223.method1(class102.field2583.method10());
						} else if (var5.method26(class100.field2477)) {
							class132.field3223 = class132.field3223.method1(class100.field2477.method10());
							var6 = 10;
						} else if (var5.method26(class103.field2598)) {
							class132.field3223 = class132.field3223.method1(class103.field2598.method10());
							var6 = 11;
						}
						class1 var7 = class132.field3223.method30();
						if (var7.method26(class93.field2317)) {
							var4 = 1;
							class132.field3223 = class132.field3223.method1(class93.field2317.method10());
						} else if (var7.method26(class122.field3054)) {
							var4 = 2;
							class132.field3223 = class132.field3223.method1(class122.field3054.method10());
						} else if (var7.method26(class62.field1545)) {
							class132.field3223 = class132.field3223.method1(class62.field1545.method10());
							var4 = 3;
						} else if (var7.method26(class46.field1195)) {
							var4 = 4;
							class132.field3223 = class132.field3223.method1(class46.field1195.method10());
						} else if (var7.method26(class108.field2707)) {
							var4 = 5;
							class132.field3223 = class132.field3223.method1(class108.field2707.method10());
						}
						class70.field1726.method415(75);
						class70.field1726.method141(0);
						int var8 = class70.field1726.field267;
						class70.field1726.method141(var6);
						class70.field1726.method141(var4);
						method105(class132.field3223, class70.field1726);
						class70.field1726.method155(class70.field1726.field267 - var8);
						if (class75.field1864 == 2) {
							class15.field504 = true;
							class75.field1864 = 3;
							class70.field1726.method415(32);
							class70.field1726.method141(class75.field1864);
							class70.field1726.method141(class6.field236);
							class70.field1726.method141(class115.field2828);
						}
					}
					class105.field2637 = true;
					class132.field3223 = class132.field3234;
				}
			}
		}
	}

	@ObfuscatedName("se.a(Z)V")
	public static void method932() {
		class11.field410 = true;
		method473();
		if (class37.field1001) {
			field2902.method209(class132.field3230, 239, 40, 0);
			field2902.method209(method956(new class1[] { class132.field3232, class37.field989 }), 239, 60, 128);
		} else if (class114.field2811 == 1) {
			field2902.method209(class102.field2576, 239, 40, 0);
			field2902.method209(method956(new class1[] { class132.field3210, class37.field989 }), 239, 60, 128);
		} else if (class114.field2811 == 2) {
			field2902.method209(class46.field1203, 239, 40, 0);
			field2902.method209(method956(new class1[] { class132.field3210, class37.field989 }), 239, 60, 128);
		} else if (class114.field2811 == 3) {
			if (class132.field3210 != class132.field3209) {
				method537(class132.field3210);
				class132.field3209 = class132.field3210;
			}
			class10 var15 = field2684;
			class111.method912(0, 0, 463, 77);
			for (int var16 = 0; var16 < class93.field2330; var16++) {
				int var17 = var16 * 14 + 18 - class53.field1390;
				if (var17 > 0 && var17 < 110) {
					var15.method209(class38.field1017[var16], 239, var17, 0);
				}
			}
			class111.method919();
			if (class93.field2330 > 5) {
				method601(class53.field1390, class93.field2330 * 14 + 7, 463, 77, 0);
			}
			if (class132.field3210.method10() == 0) {
				field2902.method209(class75.field1874, 239, 40, 255);
			} else if (class93.field2330 == 0) {
				field2902.method209(class57.field1449, 239, 40, 0);
			}
			var15.method209(method956(new class1[] { class132.field3210, class37.field989 }), 239, 90, 0);
			class111.method916(0, 77, 479, 0);
		} else if (class64.field1605 != null) {
			field2902.method209(class64.field1605, 239, 40, 0);
			field2902.method209(class74.field1819, 239, 60, 128);
		} else if (class86.field2166 != -1) {
			boolean var14 = method478(class86.field2166, 96, 2, 479);
			if (!var14) {
				class105.field2637 = true;
			}
		} else if (class98.field2421 == -1) {
			int var1 = 0;
			class10 var2 = field2684;
			class111.method912(0, 0, 463, 77);
			for (int var3 = 0; var3 < 100; var3++) {
				if (class80.field2034[var3] != null) {
					int var4 = class132.field3236[var3];
					class1 var5 = class128.field3130[var3];
					int var6 = class49.field1340 + 70 - var1 * 14;
					byte var7 = 0;
					if (var5 != null && var5.method26(class103.field2612)) {
						var5 = var5.method1(5);
						var7 = 1;
					}
					if (var5 != null && var5.method26(class100.field2535)) {
						var5 = var5.method1(5);
						var7 = 2;
					}
					if (var4 == 0) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(class80.field2034[var3], 4, var6, 0);
						}
					}
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || class75.field1864 == 0 || class75.field1864 == 1 && method242(var5))) {
						if (var6 > 0 && var6 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								field2614[0].method329(4, var6 - 12);
								var8 += 14;
							}
							if (var7 == 2) {
								field2614[1].method329(var8, var6 - 12);
								var8 += 14;
							}
							var2.method213(method956(new class1[] { var5, class86.field2165 }), var8, var6, 0);
							int var9 = var8 + var2.method208(var5) + 8;
							var2.method213(class80.field2034[var3], var9, var6, 255);
						}
						var1++;
					}
					if ((var4 == 3 || var4 == 7) && class5.field216 == 0 && (var4 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(class46.field1215, 4, var6, 0);
							int var10 = var2.method208(class46.field1215) + 4;
							int var11 = var10 + var2.method212(32);
							if (var7 == 1) {
								field2614[0].method329(var11, var6 - 12);
								var11 += 14;
							}
							if (var7 == 2) {
								field2614[1].method329(var11, var6 - 12);
								var11 += 14;
							}
							var2.method213(method956(new class1[] { var5, class86.field2165 }), var11, var6, 0);
							int var12 = var11 + var2.method208(var5) + 8;
							var2.method213(class80.field2034[var3], var12, var6, 8388608);
						}
					}
					if (var4 == 4 && (class115.field2828 == 0 || class115.field2828 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(method956(new class1[] { var5, class98.field2406, class80.field2034[var3] }), 4, var6, 8388736);
						}
					}
					if (var4 == 5 && class5.field216 == 0 && class6.field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method213(class80.field2034[var3], 4, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 6 && class5.field216 == 0 && class6.field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method213(method956(new class1[] { class16.field521, class98.field2406, var5, class86.field2165 }), 4, var6, 0);
							var2.method213(class80.field2034[var3], var2.method208(method956(new class1[] { class16.field521, class98.field2406, var5 })) + 12, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 8 && (class115.field2828 == 0 || class115.field2828 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(method956(new class1[] { var5, class98.field2406, class80.field2034[var3] }), 4, var6, 8270336);
						}
					}
				}
			}
			class111.method919();
			class122.field3052 = var1 * 14 + 7;
			if (class122.field3052 < 78) {
				class122.field3052 = 78;
			}
			method601(class122.field3052 - class49.field1340 - 77, class122.field3052, 463, 77, 0);
			class1 var13;
			if (field2621 == null || field2621.field86 == null) {
				var13 = class123.field3071;
			} else {
				var13 = field2621.field86;
			}
			var2.method213(method956(new class1[] { var13, class86.field2165 }), 4, 90, 0);
			var2.method213(method956(new class1[] { class132.field3223, class37.field989 }), var2.method208(method956(new class1[] { var13, class39.field1065 })) + 6, 90, 255);
			class111.method916(0, 77, 479, 0);
		} else {
			boolean var0 = method478(class98.field2421, 96, 3, 479);
			if (!var0) {
				class105.field2637 = true;
			}
		}
		if (class6.field224 && field640 == 2) {
			method483();
		}
		method808();
	}

	@ObfuscatedName("ta.a(ZLqd;)Z")
	public static boolean method947(class100 arg0) {
		if (arg0.field2548 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field2548.length; var1++) {
			int var2 = method1039(var1, arg0);
			int var3 = arg0.field2499[var1];
			if (arg0.field2548[var1] == 2) {
				if (var3 <= var2) {
					return false;
				}
			} else if (arg0.field2548[var1] == 3) {
				if (var3 >= var2) {
					return false;
				}
			} else if (arg0.field2548[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var2 != var3) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("qd.f(I)V")
	public static void method853() {
		class107 var0 = class117.field2924;
		synchronized (class117.field2924) {
			class117.field2921 = class105.field2630;
			if (class49.field1326 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					class59.field1488[var1] = false;
				}
				class49.field1326 = class127.field3122;
			} else {
				while (class49.field1326 != class127.field3122) {
					int var2 = class1.field52[class127.field3122];
					class127.field3122 = class127.field3122 + 1 & 0x7F;
					if (var2 < 0) {
						class59.field1488[~var2] = false;
					} else {
						class59.field1488[var2] = true;
					}
				}
			}
			class105.field2630 = class95.field2365;
		}
	}

	@ObfuscatedName("de.a(Lqd;B)[I")
	public static int[] method325(class100 arg0) {
		int var1;
		if (arg0.field2495 < 0) {
			var1 = arg0.field2454 >> 16;
		} else {
			var1 = arg0.field2495 >> 16;
		}
		if (!method1052(var1)) {
			return null;
		}
		int var2 = arg0.field2462;
		int var3 = arg0.field2502;
		int var4 = arg0.field2454;
		while (var4 != -1) {
			class100 var5 = field2922[var1][var4 & 0xFFFF];
			var2 += var5.field2462;
			if (!arg0.field2500) {
				var2 -= var5.field2552;
			}
			var3 += var5.field2502;
			var4 = var5.field2454;
			if (!arg0.field2500) {
				var3 -= var5.field2537;
			}
		}
		return new int[] { var2, var3 };
	}

	@ObfuscatedName("ac.a(ILa;Lba;)I")
	public static int method105(class1 arg0, class8 arg1) {
		int var2 = arg1.field267;
		arg1.method185(arg0.field26);
		arg1.field267 += field2357.method1036(0, arg1.field267, arg0.field26, arg0.field38, arg1.field284);
		return arg1.field267 - var2;
	}

	@ObfuscatedName("d.a(Ljava/awt/Component;BLbd;)V")
	public static void method297(Component arg0, class11 arg1) {
		if (class44.field1159) {
			return;
		}
		field1366 = method605(class63.field1567, class14.field479, arg1);
		field2187 = method605(class1.field62, class14.field479, arg1);
		field1845 = method605(class93.field2333, class14.field479, arg1);
		field2770 = method605(class117.field2927, class14.field479, arg1);
		field2745 = method605(class11.field406, class14.field479, arg1);
		field279 = method605(class17.field533, class14.field479, arg1);
		field1558 = method875(96, 479, arg0);
		field2187.method329(0, 0);
		field11 = method875(156, 172, arg0);
		class111.method920();
		field1845.method329(0, 0);
		field1167 = method875(261, 190, arg0);
		field1366.method329(0, 0);
		field925 = method875(334, 512, arg0);
		class111.method920();
		field3208 = method875(50, 496, arg0);
		field1553 = method875(37, 269, arg0);
		field993 = method875(45, 249, arg0);
		class58 var2 = method1038(arg1, class121.field3020, class14.field479);
		field2587 = method875(var2.field1475, var2.field1476, arg0);
		var2.method557(0, 0);
		class58 var3 = method1038(arg1, class86.field2162, class14.field479);
		field522 = method875(var3.field1475, var3.field1476, arg0);
		var3.method557(0, 0);
		class58 var4 = method1038(arg1, class14.field455, class14.field479);
		field2045 = method875(var4.field1475, var4.field1476, arg0);
		var4.method557(0, 0);
		class58 var5 = method1038(arg1, class106.field2682, class14.field479);
		field1438 = method875(var5.field1475, var5.field1476, arg0);
		var5.method557(0, 0);
		class58 var6 = method1038(arg1, client.field609, class14.field479);
		field2899 = method875(var6.field1475, var6.field1476, arg0);
		var6.method557(0, 0);
		class58 var7 = method1038(arg1, class113.field2798, class14.field479);
		field1780 = method875(var7.field1475, var7.field1476, arg0);
		var7.method557(0, 0);
		class58 var8 = method1038(arg1, class95.field2355, class14.field479);
		field3021 = method875(var8.field1475, var8.field1476, arg0);
		var8.method557(0, 0);
		class58 var9 = method1038(arg1, class9.field318, class14.field479);
		field1689 = method875(var9.field1475, var9.field1476, arg0);
		var9.method557(0, 0);
		class58 var10 = method1038(arg1, class14.field478, class14.field479);
		field843 = method875(var10.field1475, var10.field1476, arg0);
		var10.method557(0, 0);
		field2731 = method605(class44.field1169, class14.field479, arg1);
		field1598 = method605(class116.field2910, class14.field479, arg1);
		field1871 = method605(class129.field3163, class14.field479, arg1);
		field1457 = field2731.method328();
		field1457.method332();
		field2686 = field1598.method328();
		field2686.method332();
		field3134 = field2731.method328();
		field3134.method333();
		field1255 = field1598.method328();
		field1255.method333();
		field1524 = field1871.method328();
		field1524.method333();
		field1074 = field2731.method328();
		field1074.method332();
		field1074.method333();
		field739 = field1598.method328();
		field739.method332();
		field739.method333();
		field2807 = method372(arg1, class114.field2818, class14.field479);
		field2588 = new int[151];
		field1560 = new int[33];
		field1556 = new int[33];
		field1842 = new int[151];
		for (int var11 = 0; var11 < 33; var11++) {
			int var12 = 0;
			int var13 = 999;
			for (int var14 = 0; var14 < 34; var14++) {
				if (field1845.field748[field1845.field744 * var11 + var14] == 0) {
					if (var13 == 999) {
						var13 = var14;
					}
				} else if (var13 != 999) {
					var12 = var14;
					break;
				}
			}
			field1556[var11] = var13;
			field1560[var11] = var12 - var13;
		}
		for (int var15 = 5; var15 < 156; var15++) {
			int var16 = 0;
			int var17 = 999;
			for (int var18 = 25; var18 < 172; var18++) {
				if (field1845.field748[field1845.field744 * var15 + var18] == 0 && (var18 > 34 || var15 > 34)) {
					if (var17 == 999) {
						var17 = var18;
					}
				} else if (var17 != 999) {
					var16 = var18;
					break;
				}
			}
			field2588[var15 - 5] = var17 - 25;
			field1842[var15 - 5] = var16 - var17;
		}
		class44.field1159 = true;
	}

	@ObfuscatedName("bd.b(I)V")
	public static void method225() {
		class11.field409 = null;
		field365 = null;
		class11.field406 = null;
		class11.field379 = null;
		class11.field407 = null;
		class11.field375 = null;
		field412 = null;
		class11.field408 = null;
	}

	@ObfuscatedName("ub.a(Llc;Ljava/awt/Component;I)Lb;")
	public static class7 method993(class69 arg0, Component arg1) {
		method1050(arg1, arg0);
		class7 var2 = new class7();
		method261(var2);
		return var2;
	}

	@ObfuscatedName("k.a(IIIIBIZIIIII)Z")
	public static boolean method576(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				class112.field2759[var11][var12] = 0;
				class102.field2577[var11][var12] = 99999999;
			}
		}
		class112.field2759[arg2][arg8] = 99;
		byte var13 = 0;
		int var14 = arg8;
		boolean var15 = false;
		int var16 = 0;
		class102.field2577[arg2][arg8] = 0;
		int var17 = arg2;
		class50.field1351[0] = arg2;
		int var35 = var13 + 1;
		class17.field546[0] = arg8;
		int var18 = class50.field1351.length;
		int[][] var19 = class102.field2569[field75].field201;
		while (var35 != var16) {
			var14 = class17.field546[var16];
			var17 = class50.field1351[var16];
			var16 = (var16 + 1) % var18;
			if (arg3 == var17 && arg9 == var14) {
				var15 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && class102.field2569[field75].method119(var17, arg4 - 1, arg9, var14, arg6, arg3)) {
					var15 = true;
					break;
				}
				if (arg4 < 10 && class102.field2569[field75].method122(arg9, arg6, var14, arg3, var17, arg4 - 1)) {
					var15 = true;
					break;
				}
			}
			if (arg0 != 0 && arg7 != 0 && class102.field2569[field75].method117(arg7, arg3, arg0, arg9, arg1, var14, var17)) {
				var15 = true;
				break;
			}
			int var20 = class102.field2577[var17][var14] + 1;
			if (var17 > 0 && class112.field2759[var17 - 1][var14] == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0) {
				class50.field1351[var35] = var17 - 1;
				class17.field546[var35] = var14;
				var35 = (var35 + 1) % var18;
				class112.field2759[var17 - 1][var14] = 2;
				class102.field2577[var17 - 1][var14] = var20;
			}
			if (var17 < 103 && class112.field2759[var17 + 1][var14] == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0) {
				class50.field1351[var35] = var17 + 1;
				class17.field546[var35] = var14;
				var35 = (var35 + 1) % var18;
				class112.field2759[var17 + 1][var14] = 8;
				class102.field2577[var17 + 1][var14] = var20;
			}
			if (var14 > 0 && class112.field2759[var17][var14 - 1] == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				class50.field1351[var35] = var17;
				class17.field546[var35] = var14 - 1;
				class112.field2759[var17][var14 - 1] = 1;
				var35 = (var35 + 1) % var18;
				class102.field2577[var17][var14 - 1] = var20;
			}
			if (var14 < 103 && class112.field2759[var17][var14 + 1] == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				class50.field1351[var35] = var17;
				class17.field546[var35] = var14 + 1;
				class112.field2759[var17][var14 + 1] = 4;
				class102.field2577[var17][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 > 0 && var14 > 0 && class112.field2759[var17 - 1][var14 - 1] == 0 && (var19[var17 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				class50.field1351[var35] = var17 - 1;
				class17.field546[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				class112.field2759[var17 - 1][var14 - 1] = 3;
				class102.field2577[var17 - 1][var14 - 1] = var20;
			}
			if (var17 < 103 && var14 > 0 && class112.field2759[var17 + 1][var14 - 1] == 0 && (var19[var17 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				class50.field1351[var35] = var17 + 1;
				class17.field546[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				class112.field2759[var17 + 1][var14 - 1] = 9;
				class102.field2577[var17 + 1][var14 - 1] = var20;
			}
			if (var17 > 0 && var14 < 103 && class112.field2759[var17 - 1][var14 + 1] == 0 && (var19[var17 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				class50.field1351[var35] = var17 - 1;
				class17.field546[var35] = var14 + 1;
				class112.field2759[var17 - 1][var14 + 1] = 6;
				class102.field2577[var17 - 1][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 < 103 && var14 < 103 && class112.field2759[var17 + 1][var14 + 1] == 0 && (var19[var17 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				class50.field1351[var35] = var17 + 1;
				class17.field546[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				class112.field2759[var17 + 1][var14 + 1] = 12;
				class102.field2577[var17 + 1][var14 + 1] = var20;
			}
		}
		class114.field2809 = 0;
		if (!var15) {
			if (!arg5) {
				return false;
			}
			int var21 = 1000;
			int var22 = 100;
			for (int var23 = arg3 - 10; var23 <= arg3 + 10; var23++) {
				for (int var24 = arg9 - 10; var24 <= arg9 + 10; var24++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class102.field2577[var23][var24] < 100) {
						int var25 = 0;
						int var26 = 0;
						if (var24 < arg9) {
							var25 = arg9 - var24;
						} else if (var24 > arg9 + arg7 - 1) {
							var25 = var24 + 1 - arg7 - arg9;
						}
						if (var23 < arg3) {
							var26 = arg3 - var23;
						} else if (arg0 + arg3 - 1 < var23) {
							var26 = var23 + 1 - arg0 - arg3;
						}
						int var27 = var25 * var25 + var26 * var26;
						if (var21 > var27 || var21 == var27 && class102.field2577[var23][var24] < var22) {
							var14 = var24;
							var21 = var27;
							var17 = var23;
							var22 = class102.field2577[var23][var24];
						}
					}
				}
			}
			if (var21 == 1000) {
				return false;
			}
			if (arg2 == var17 && arg8 == var14) {
				return false;
			}
			class114.field2809 = 1;
		}
		byte var28 = 0;
		class50.field1351[0] = var17;
		int var36 = var28 + 1;
		class17.field546[0] = var14;
		int var29;
		int var30 = var29 = class112.field2759[var17][var14];
		while (arg2 != var17 || arg8 != var14) {
			if (var29 != var30) {
				var29 = var30;
				class50.field1351[var36] = var17;
				class17.field546[var36++] = var14;
			}
			if ((var30 & 0x1) != 0) {
				var14++;
			} else if ((var30 & 0x4) != 0) {
				var14--;
			}
			if ((var30 & 0x2) != 0) {
				var17++;
			} else if ((var30 & 0x8) != 0) {
				var17--;
			}
			var30 = class112.field2759[var17][var14];
		}
		if (var36 > 0) {
			int var31 = var36;
			if (var36 > 25) {
				var31 = 25;
			}
			var36--;
			int var32 = class17.field546[var36];
			int var33 = class50.field1351[var36];
			if (arg10 == 0) {
				class70.field1726.method415(73);
				class70.field1726.method141(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				class70.field1726.method415(236);
				class70.field1726.method141(var31 + var31 + 14 + 3);
			}
			if (arg10 == 2) {
				class70.field1726.method415(89);
				class70.field1726.method141(var31 + var31 + 3);
			}
			class70.field1726.method162(var32 + field1408);
			class70.field1726.method172(class59.field1488[82] ? 1 : 0);
			class70.field1726.method162(field806 + var33);
			class35.field941 = class50.field1351[0];
			class108.field2720 = class17.field546[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				class70.field1726.method165(class50.field1351[var36] - var33);
				class70.field1726.method172(class17.field546[var36] - var32);
			}
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("u.f(I)V")
	public static void method983() {
		class120.field2978 = null;
		class120.field2992 = null;
		class120.field2980 = null;
		class120.field2977 = null;
		class120.field2995 = null;
		class120.field2993 = null;
	}

	@ObfuscatedName("he.a(IIBI)Z")
	public static boolean method491(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 14 & 0x7FFF;
		int var4 = field3183.method97(field75, arg0, arg2, arg1);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 >> 6 & 0x3;
		int var6 = var4 & 0x1F;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			class49 var7 = method389(var3);
			int var8 = var7.field1295;
			if (var5 != 0) {
				var8 = (var8 >> 4 - var5) + (var8 << var5 & 0xF);
			}
			int var9;
			int var10;
			if (var5 == 0 || var5 == 2) {
				var9 = var7.field1298;
				var10 = var7.field1286;
			} else {
				var10 = var7.field1298;
				var9 = var7.field1286;
			}
			method576(var10, var8, field2621.field1962[0], arg0, 0, true, 0, var9, field2621.field2009[0], arg2, 2);
		} else {
			method576(0, 0, field2621.field1962[0], arg0, var6 + 1, true, var5, 0, field2621.field2009[0], arg2, 2);
		}
		class119.field2967 = class112.field2762;
		class92.field2295 = 2;
		class16.field523 = class1.field14;
		class34.field894 = 0;
		return true;
	}

	@ObfuscatedName("j.d(B)V")
	public static void method538() {
		class8.field253.method267();
	}

	@ObfuscatedName("n.c(I)V")
	public static void method718() {
		for (class12 var0 = (class12) class16.field515.method802(); var0 != null; var0 = (class12) class16.field515.method809()) {
			if (var0.field424 != null) {
				field2435.method135(var0.field424);
				var0.field424 = null;
			}
			if (var0.field433 != null) {
				field2435.method135(var0.field433);
				var0.field433 = null;
			}
		}
		class16.field515.method806();
	}

	@ObfuscatedName("qd.b(B)V")
	public static void method854() {
		class134.field3282.method267();
	}

	@ObfuscatedName("cc.a(IZILaa;I)V")
	public static void method272(int arg0, int arg1, class2 arg2, int arg3) {
		if (field2621 == arg2 || class42.field1104 >= 400) {
			return;
		}
		class1 var4;
		if (arg2.field65 == 0) {
			var4 = method956(new class1[] { arg2.field86, method390(field2621.field68, arg2.field68), class48.field1275, class28.field785, method502(arg2.field68), class103.field2601 });
		} else {
			var4 = method956(new class1[] { arg2.field86, class48.field1275, class53.field1392, method502(arg2.field65), class103.field2601 });
		}
		if (class14.field475 == 1) {
			method398(arg3, client.field584, arg0, arg1, 22, method956(new class1[] { class130.field3177, class59.field1500, var4 }));
		} else if (client.field594 != 1) {
			for (int var5 = 4; var5 >= 0; var5--) {
				if (client.field599[var5] != null) {
					int var6 = 0;
					short var7 = 0;
					if (client.field599[var5].method14(class60.field1522)) {
						if (field2621.field68 < arg2.field68) {
							var7 = 2000;
						}
						if (field2621.field74 != 0 && arg2.field74 != 0) {
							if (field2621.field74 == arg2.field74) {
								var7 = 2000;
							} else {
								var7 = 0;
							}
						}
					} else if (class24.field735[var5]) {
						var7 = 2000;
					}
					if (var5 == 0) {
						var6 = var7 + 10;
					}
					if (var5 == 1) {
						var6 = var7 + 39;
					}
					if (var5 == 2) {
						var6 = var7 + 44;
					}
					if (var5 == 3) {
						var6 = var7 + 14;
					}
					if (var5 == 4) {
						var6 = var7 + 41;
					}
					method398(arg3, client.field599[var5], arg0, arg1, var6, method956(new class1[] { class53.field1393, var4 }));
				}
			}
		} else if ((field2846 & 0x8) == 8) {
			method398(arg3, class60.field1523, arg0, arg1, 1, method956(new class1[] { class52.field1384, class59.field1500, var4 }));
		}
		for (int var8 = 0; var8 < class42.field1104; var8++) {
			if (class79.field1932[var8] == 7) {
				class102.field2586[var8] = method956(new class1[] { class123.field3057, class93.field2337, class53.field1393, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("u.f(II)La;")
	public static class1 method984(int arg0) {
		return method956(new class1[] { method502(arg0 >> 24 & 0xFF), class82.field2112, method502(arg0 >> 16 & 0xFF), class82.field2112, method502(arg0 >> 8 & 0xFF), class82.field2112, method502(arg0 & 0xFF) });
	}

	@ObfuscatedName("de.b(I)V")
	public static void method326() {
		field742 = null;
		class24.field743 = null;
		class24.field725 = null;
		field739 = null;
		class24.field726 = null;
		class24.field732 = null;
		class24.field738 = null;
		class24.field724 = null;
		class24.field735 = null;
		class24.field727 = null;
		class24.field733 = null;
	}

	@ObfuscatedName("wb.a(Z)V")
	public static void method1047() {
		field3246 = null;
		class133.field3265 = null;
		class133.field3281 = null;
		class133.field3279 = null;
		class133.field3247 = null;
		class133.field3280 = null;
		class133.field3249 = null;
		class133.field3258 = null;
		class133.field3272 = null;
		class133.field3277 = null;
		class133.field3278 = null;
		class133.field3255 = null;
		class133.field3257 = null;
		class133.field3252 = null;
		class133.field3276 = null;
		field3244 = null;
	}

	@ObfuscatedName("s.a(IBI)I")
	public static int method900(int arg0, int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			int var2 = arg1 % arg0;
			arg1 = arg0;
			arg0 = var2;
		}
		return arg1;
	}

	@ObfuscatedName("va.a(BII)V")
	public static void method1011(int arg0, int arg1) {
		class92 var2 = class17.field552[field75][arg1][arg0];
		if (var2 == null) {
			field3183.method81(field75, arg1, arg0);
			return;
		}
		int var3 = -99999999;
		class59 var4 = null;
		for (class59 var5 = (class59) var2.method802(); var5 != null; var5 = (class59) var2.method809()) {
			class115 var6 = method760(var5.field1499);
			int var7 = var6.field2859;
			if (var6.field2826 == 1) {
				var7 = (var5.field1490 + 1) * var7;
			}
			if (var7 > var3) {
				var3 = var7;
				var4 = var5;
			}
		}
		if (var4 == null) {
			field3183.method81(field75, arg1, arg0);
			return;
		}
		class59 var8 = null;
		class59 var9 = null;
		var2.method805(var4);
		for (class59 var10 = (class59) var2.method802(); var10 != null; var10 = (class59) var2.method809()) {
			if (var4.field1499 != var10.field1499) {
				if (var9 == null) {
					var9 = var10;
				}
				if (var9.field1499 != var10.field1499 && var8 == null) {
					var8 = var10;
				}
			}
		}
		int var11 = (arg0 << 7) + arg1 + 1610612736;
		field3183.method95(field75, arg1, arg0, method712(field75, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var9, var8);
	}

	@ObfuscatedName("n.a(IZIIILia;)V")
	public static void method719(int arg0, int arg1, int arg2, int arg3, class49 arg4) {
		class12 var5 = new class12();
		var5.field423 = arg4.field1285 * 128;
		var5.field425 = arg4.field1325;
		var5.field428 = arg4.field1306;
		var5.field435 = arg4.field1282;
		int var6 = arg4.field1286;
		int var7 = arg4.field1298;
		var5.field416 = arg1;
		var5.field417 = arg3 * 128;
		if (arg2 == 1 || arg2 == 3) {
			var6 = arg4.field1298;
			var7 = arg4.field1286;
		}
		var5.field426 = arg0 * 128;
		var5.field430 = (arg0 + var7) * 128;
		var5.field436 = (arg3 + var6) * 128;
		var5.field420 = arg4.field1296;
		if (arg4.field1317 != null) {
			var5.field434 = arg4;
			var5.method247();
		}
		class16.field515.method804(var5);
		if (var5.field428 != null) {
			var5.field437 = (int) ((double) (var5.field425 - var5.field435) * Math.random()) + var5.field435;
		}
	}

	@ObfuscatedName("de.a(Z)V")
	public static void method327() {
		if (class54.field1412 != null) {
			class122 var0 = class54.field1412;
			synchronized (class54.field1412) {
				class54.field1412 = null;
			}
		}
	}

	@ObfuscatedName("bb.c(I)V")
	public static void method191() {
		class24.field727.method267();
	}

	@ObfuscatedName("m.a(II)V")
	public static synchronized void method672() {
		if (method521()) {
			method397();
			field1028 = null;
			class53.field1391 = false;
		}
	}

	@ObfuscatedName("wa.b(II)Z")
	public static boolean method1037(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("dc.a(BI)Lmd;")
	public static class76 method317(int arg0) {
		class76 var1 = (class76) class106.field2663.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2024.method217(arg0, 1);
		class76 var3 = new class76();
		if (var2 != null) {
			var3.method704(arg0, new class8(var2));
		}
		var3.method701();
		class106.field2663.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("la.a(ILnb;)V")
	public static void method641(class80 arg0) {
		if (class82.field2063 == arg0.field1981 || arg0.field2015 == -1 || arg0.field1996 != 0 || arg0.field1989 + 1 > method103(arg0.field2015).field1223[arg0.field1978]) {
			int var1 = arg0.field1981 - arg0.field1986;
			int var2 = class82.field2063 - arg0.field1986;
			int var3 = arg0.field1999 * 128 + arg0.field1970 * 64;
			int var4 = arg0.field1970 * 64 + arg0.field1955 * 128;
			int var5 = arg0.field1973 * 128 + arg0.field1970 * 64;
			int var6 = arg0.field2001 * 128 + arg0.field1970 * 64;
			arg0.field1972 = ((var1 - var2) * var3 + var2 * var5) / var1;
			arg0.field1963 = ((var1 - var2) * var4 + var2 * var6) / var1;
		}
		if (arg0.field1947 == 0) {
			arg0.field1954 = 1024;
		}
		arg0.field1948 = 0;
		if (arg0.field1947 == 1) {
			arg0.field1954 = 1536;
		}
		if (arg0.field1947 == 2) {
			arg0.field1954 = 0;
		}
		if (arg0.field1947 == 3) {
			arg0.field1954 = 512;
		}
		arg0.field1992 = arg0.field1954;
	}

	@ObfuscatedName("h.h(I)V")
	public static void method454() {
		try {
			Graphics var0 = field3049.getGraphics();
			field11.method101(550, var0, 4);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("qd.g(I)V")
	public static void method855() {
		class100.field2522 = null;
		class100.field2477 = null;
		class100.field2484 = null;
		class100.field2512 = null;
		class100.field2492 = null;
		class100.field2497 = null;
		class100.field2535 = null;
		class100.field2443 = null;
		class100.field2480 = null;
		class100.field2546 = null;
		class100.field2490 = null;
	}

	@ObfuscatedName("wa.a(Lbd;La;BLa;)Ljd;")
	public static class58 method1038(class11 arg0, class1 arg1, class1 arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method846(var4, arg0, var3);
	}

	@ObfuscatedName("m.a(IIII)V")
	public static void method673(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			class70.field1726.method415(111);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 2) {
			class70.field1726.method415(9);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 3) {
			class70.field1726.method415(193);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 4) {
			class70.field1726.method415(53);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 5) {
			class70.field1726.method415(94);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 6) {
			class70.field1726.method415(213);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 7) {
			class70.field1726.method415(46);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 8) {
			class70.field1726.method415(130);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 9) {
			class70.field1726.method415(157);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
		if (arg1 == 10) {
			class70.field1726.method415(84);
			class70.field1726.method182(arg2);
			class70.field1726.method150(arg0);
		}
	}

	@ObfuscatedName("td.b(Z)V")
	public static void method972() {
		class118.field2933 = null;
		class118.field2940 = null;
		class118.field2941 = null;
		class118.field2943 = null;
		class118.field2948 = null;
	}

	@ObfuscatedName("s.c(I)V")
	public static void method901() {
		try {
			Graphics var0 = field3049.getGraphics();
			field1167.method101(553, var0, 205);
		} catch (Exception var1) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("bb.a(IIIIBLqd;III)V")
	public static void method192(int arg0, int arg1, int arg2, int arg3, class100 arg4, int arg5, int arg6, int arg7) {
		if (class121.field3024) {
			class102.field2573 = 32;
		} else {
			class102.field2573 = 0;
		}
		class121.field3024 = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.field2537 -= class130.field3176 * 4;
			if (arg6 == 1) {
				class39.field1055 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.field2537 += class130.field3176 * 4;
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
			if (arg6 == 1) {
				class39.field1055 = true;
			}
		} else if (arg5 - class102.field2573 <= arg2 && arg2 < class102.field2573 + arg5 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && class130.field3176 > 0) {
			class121.field3024 = true;
			int var8 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
			if (arg6 == 1) {
				class39.field1055 = true;
			}
			if (var8 < 8) {
				var8 = 8;
			}
			int var9 = arg0 - var8 - 32;
			int var10 = arg1 - arg7 - var8 / 2 - 16;
			arg4.field2537 = (arg3 - arg0) * var10 / var9;
		}
	}

	@ObfuscatedName("wa.a(IZLqd;)I")
	public static int method1039(int arg0, class100 arg1) {
		if (arg1.field2554 == null || arg1.field2554.length <= arg0) {
			return -2;
		}
		try {
			int[] var2 = arg1.field2554[arg0];
			int var3 = 0;
			int var4 = 0;
			byte var5 = 0;
			while (true) {
				int var6 = 0;
				byte var7 = 0;
				int var8 = var2[var4++];
				if (var8 == 0) {
					return var3;
				}
				if (var8 == 15) {
					var7 = 1;
				}
				if (var8 == 16) {
					var7 = 2;
				}
				if (var8 == 1) {
					var6 = class24.field724[var2[var4++]];
				}
				if (var8 == 2) {
					var6 = class17.field549[var2[var4++]];
				}
				if (var8 == 3) {
					var6 = class59.field1483[var2[var4++]];
				}
				if (var8 == 17) {
					var7 = 3;
				}
				if (var8 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					class100 var11 = method1053(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!method760(var12).field2880 || class45.field1183)) {
						for (int var13 = 0; var13 < var11.field2491.length; var13++) {
							if (var12 + 1 == var11.field2491[var13]) {
								var6 += var11.field2516[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var6 = class113.field2803[var2[var4++]];
				}
				if (var8 == 6) {
					var6 = class60.field1514[class17.field549[var2[var4++]] - 1];
				}
				if (var8 == 7) {
					var6 = class113.field2803[var2[var4++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var6 = field2621.field68;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (class45.field1190[var14]) {
							var6 += class17.field549[var14];
						}
					}
				}
				if (var8 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					class100 var17 = method1053(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!method760(var18).field2880 || class45.field1183)) {
						for (int var19 = 0; var19 < var17.field2491.length; var19++) {
							if (var18 + 1 == var17.field2491[var19]) {
								var6 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var6 = class119.field2962;
				}
				if (var8 == 12) {
					var6 = class105.field2638;
				}
				if (var8 == 13) {
					int var20 = class113.field2803[var2[var4++]];
					int var21 = var2[var4++];
					var6 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var22 = var2[var4++];
					var6 = method480(var22);
				}
				if (var8 == 18) {
					var6 = (field2621.field1972 >> 7) + field806;
				}
				if (var8 == 19) {
					var6 = (field2621.field1963 >> 7) + field1408;
				}
				if (var8 == 20) {
					var6 = var2[var4++];
				}
				if (var7 == 0) {
					if (var5 == 0) {
						var3 += var6;
					}
					if (var5 == 1) {
						var3 -= var6;
					}
					if (var5 == 2 && var6 != 0) {
						var3 /= var6;
					}
					if (var5 == 3) {
						var3 *= var6;
					}
					var5 = 0;
				} else {
					var5 = var7;
				}
			}
		} catch (Exception var23) {
			return -1;
		}
	}

	@ObfuscatedName("ta.b(ZI)V")
	public static void method949(int arg0) {
		for (field3140 += arg0; field3140 >= field192; field3140 -= field192) {
			field1157 -= field1157 >> 2;
		}
		field1157 -= arg0 * 1000;
		if (field1157 < 0) {
			field1157 = 0;
		}
	}

	@ObfuscatedName("je.g(I)V")
	public static void method569() {
		class59.field1488 = null;
		class59.field1486 = null;
		class59.field1482 = null;
		class59.field1491 = null;
		class59.field1501 = null;
		class59.field1494 = null;
		class59.field1498 = null;
		class59.field1500 = null;
		class59.field1483 = null;
		class59.field1487 = null;
		class59.field1481 = null;
		class59.field1503 = null;
	}

	@ObfuscatedName("n.a(IIB)Z")
	public static boolean method720(int arg0, int arg1) {
		if (arg0 == 0 && class48.field1279 == arg1) {
			return true;
		} else if (arg0 == 1 && class52.field1387 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && class133.field3253 == arg1;
		}
	}

	@ObfuscatedName("qd.a(Ljava/awt/Component;I)V")
	public static void method856(Component arg0) {
		Method var1 = field1708;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(class117.field2924);
		arg0.addFocusListener(class117.field2924);
	}

	@ObfuscatedName("s.a(ILjava/awt/Component;)V")
	public static void method902(Component arg0) {
		arg0.removeMouseListener(class54.field1412);
		arg0.removeMouseMotionListener(class54.field1412);
		arg0.removeFocusListener(class54.field1412);
	}

	@ObfuscatedName("ta.c(ZI)V")
	public static void method950(boolean arg0) {
		for (int var1 = 0; var1 < class49.field1341; var1++) {
			class130 var2 = class120.field2992[class22.field677[var1]];
			int var3 = (class22.field677[var1] << 14) + 536870912;
			if (var2 != null && var2.method42() && arg0 == var2.field3182.field1107 && var2.field3182.method451()) {
				int var4 = var2.field1972 >> 7;
				int var5 = var2.field1963 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field1970 == 1 && (var2.field1972 & 0x7F) == 64 && (var2.field1963 & 0x7F) == 64) {
						if (class121.field3015[var4][var5] == class97.field2399) {
							continue;
						}
						class121.field3015[var4][var5] = class97.field2399;
					}
					if (!var2.field3182.field1082) {
						var3 += Integer.MIN_VALUE;
					}
					field3183.method90(field75, var2.field1972, var2.field1963, method712(field75, (var2.field1970 - 1) * 64 + var2.field1972, var2.field1970 * 64 + var2.field1963 + -64), var2.field1970 * 64 + 60 - 64, var2, var2.field1992, var3, var2.field1979);
				}
			}
		}
	}

	@ObfuscatedName("s.a(ILbd;Lbd;)V")
	public static void method903(class11 arg0, class11 arg1) {
		field1901 = arg0;
		field999 = arg1;
	}

	@ObfuscatedName("d.d(B)I")
	public static int method298() {
		int var0 = 3;
		if (field1400 < 310) {
			int var1 = field1200 >> 7;
			int var2 = field709 >> 7;
			if ((class34.field898[field75][var2][var1] & 0x4) != 0) {
				var0 = field75;
			}
			int var3 = field2621.field1972 >> 7;
			int var4 = field2621.field1963 >> 7;
			int var5;
			if (var3 <= var2) {
				var5 = var2 - var3;
			} else {
				var5 = var3 - var2;
			}
			int var6;
			if (var1 < var4) {
				var6 = var4 - var1;
			} else {
				var6 = var1 - var4;
			}
			if (var5 <= var6) {
				int var7 = var5 * 65536 / var6;
				int var8 = 32768;
				while (var1 != var4) {
					if (var4 > var1) {
						var1++;
					} else if (var1 > var4) {
						var1--;
					}
					var8 += var7;
					if ((class34.field898[field75][var2][var1] & 0x4) != 0) {
						var0 = field75;
					}
					if (var8 >= 65536) {
						if (var2 < var3) {
							var2++;
						} else if (var3 < var2) {
							var2--;
						}
						var8 -= 65536;
						if ((class34.field898[field75][var2][var1] & 0x4) != 0) {
							var0 = field75;
						}
					}
				}
			} else {
				int var9 = var6 * 65536 / var5;
				int var10 = 32768;
				while (var2 != var3) {
					if (var2 < var3) {
						var2++;
					} else if (var3 < var2) {
						var2--;
					}
					if ((class34.field898[field75][var2][var1] & 0x4) != 0) {
						var0 = field75;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var4 > var1) {
							var1++;
						} else if (var1 > var4) {
							var1--;
						}
						if ((class34.field898[field75][var2][var1] & 0x4) != 0) {
							var0 = field75;
						}
					}
				}
			}
		}
		if ((class34.field898[field75][field2621.field1972 >> 7][field2621.field1963 >> 7] & 0x4) != 0) {
			var0 = field75;
		}
		return var0;
	}

	@ObfuscatedName("nb.b(Z)V")
	public static void method728() {
		class15.field488.method417();
		int var0 = class15.field488.method412(1);
		if (var0 == 0) {
			return;
		}
		int var1 = class15.field488.method412(2);
		if (var1 == 0) {
			class50.field1348[class80.field2027++] = 2047;
		} else if (var1 == 1) {
			int var2 = class15.field488.method412(3);
			field2621.method725(var2, false);
			int var3 = class15.field488.method412(1);
			if (var3 == 1) {
				class50.field1348[class80.field2027++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = class15.field488.method412(3);
			field2621.method725(var4, true);
			int var5 = class15.field488.method412(3);
			field2621.method725(var5, true);
			int var6 = class15.field488.method412(1);
			if (var6 == 1) {
				class50.field1348[class80.field2027++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = class15.field488.method412(1);
			field75 = class15.field488.method412(2);
			int var8 = class15.field488.method412(1);
			if (var8 == 1) {
				class50.field1348[class80.field2027++] = 2047;
			}
			int var9 = class15.field488.method412(7);
			int var10 = class15.field488.method412(7);
			field2621.method729(var10, var7 == 1, var9);
		}
	}

	@ObfuscatedName("cc.g(I)I")
	public static int method273() {
		int var0 = method712(field75, field709, field1200);
		return var0 - field1748 >= 800 || (class34.field898[field75][field709 >> 7][field1200 >> 7] & 0x4) == 0 ? 3 : field75;
	}

	@ObfuscatedName("rd.a(IBII)V")
	public static void method887(int arg0, int arg1, int arg2) {
		if (class9.field322 == 0 || arg1 == 0 || class36.field965 >= 50) {
			return;
		}
		class95.field2369[class36.field965] = arg0;
		class115.field2845[class36.field965] = arg1;
		class22.field684[class36.field965] = arg2;
		class36.field955[class36.field965] = null;
		class60.field1521[class36.field965] = 0;
		class36.field965++;
	}

	@ObfuscatedName("m.b(Z)V")
	public static synchronized void method674() {
		method1029();
	}

	@ObfuscatedName("rd.a(ILbc;Lbc;)V")
	public static void method888(class10 arg0, class10 arg1) {
		field1935.method1054();
		if (class103.field2599 == 0 || class103.field2599 == 5) {
			arg0.method209(class98.field2405, 180, 54, 16777215);
			class111.method922(28, 62, 304, 34, 9179409);
			class111.method922(29, 63, 302, 32, 0);
			class111.method913(30, 64, class133.field3274 * 3, 30, 9179409);
			class111.method913(class133.field3274 * 3 + 30, 64, 300 - class133.field3274 * 3, 30, 0);
			arg0.method209(class123.field3079, 180, 85, 16777215);
		}
		if (class103.field2599 == 20) {
			byte var2 = 40;
			field2806.method329(0, 0);
			arg0.method211(class123.field3060, 180, 40, 16776960, true);
			int var8 = var2 + 15;
			arg0.method211(class123.field3077, 180, 55, 16776960, true);
			int var9 = var8 + 15;
			arg0.method211(class123.field3062, 180, 70, 16776960, true);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg0.method206(method956(new class1[] { class121.field3002, class123.field3071 }), 90, 95, 16777215, true);
			int var13 = var11 + 15;
			arg0.method206(method956(new class1[] { class38.field1037, class123.field3055.method12() }), 92, 110, 16777215, true);
			int var15 = var13 + 15;
		}
		if (class103.field2599 == 10) {
			field2806.method329(0, 0);
			if (class53.field1395 == 0) {
				byte var5 = 80;
				arg0.method211(client.field582, 180, 80, 16776960, true);
				int var23 = var5 + 30;
				field2919.method329(27, 100);
				arg0.method195(class105.field2639, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				field2919.method329(187, 100);
				arg0.method195(class85.field2149, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (class53.field1395 == 2) {
				byte var3 = 40;
				arg0.method211(class123.field3060, 180, 40, 16776960, true);
				int var12 = var3 + 15;
				arg0.method211(class123.field3077, 180, 55, 16776960, true);
				int var14 = var12 + 15;
				arg0.method211(class123.field3062, 180, 70, 16776960, true);
				int var16 = var14 + 15;
				int var17 = var16 + 10;
				arg0.method206(method956(new class1[] { class121.field3002, class123.field3071, class82.field2063 % 40 < 20 & class82.field2084 == 0 ? class46.field1204 : class123.field3067 }), 90, 95, 16777215, true);
				int var19 = var17 + 15;
				arg0.method206(method956(new class1[] { class38.field1037, class123.field3055.method12(), class82.field2063 % 40 < 20 & class82.field2084 == 1 ? class46.field1204 : class123.field3067 }), 92, 110, 16777215, true);
				field2919.method329(27, 130);
				int var21 = var19 + 15;
				arg0.method211(class35.field926, 100, 155, 16777215, true);
				field2919.method329(187, 130);
				arg0.method211(class134.field3302, 260, 155, 16777215, true);
			} else if (class53.field1395 == 3) {
				arg0.method211(class133.field3265, 180, 40, 16776960, true);
				byte var4 = 65;
				arg0.method211(class112.field2757, 180, 65, 16777215, true);
				int var18 = var4 + 15;
				arg0.method211(class106.field2675, 180, 80, 16777215, true);
				int var20 = var18 + 15;
				arg0.method211(class106.field2667, 180, 95, 16777215, true);
				int var22 = var20 + 15;
				arg0.method211(class97.field2400, 180, 110, 16777215, true);
				field2919.method329(107, 130);
				arg0.method211(class134.field3302, 180, 155, 16777215, true);
				int var24 = var22 + 15;
			}
		}
		method281();
		try {
			Graphics var6 = field3049.getGraphics();
			field1935.method101(202, var6, 171);
			field472.method101(0, var6, 0);
			field1435.method101(637, var6, 0);
			if (class97.field2402) {
				class97.field2402 = false;
				field2044.method101(128, var6, 0);
				field2608.method101(202, var6, 371);
				field844.method101(0, var6, 265);
				field2701.method101(562, var6, 265);
				field1307.method101(128, var6, 171);
				field3298.method101(562, var6, 171);
			}
		} catch (Exception var7) {
			field3049.repaint();
		}
	}

	@ObfuscatedName("m.a(I)V")
	public static void method675() {
		class72.field1758 = null;
		class72.field1778 = null;
		class72.field1765 = null;
		class72.field1770 = null;
		class72.field1775 = null;
		class72.field1774 = null;
		class72.field1756 = null;
		class72.field1776 = null;
		class72.field1757 = null;
		class72.field1762 = null;
		class72.field1777 = null;
	}

	@ObfuscatedName("bd.a([BI)V")
	public static void method229(byte[] arg0) {
		class8 var1 = new class8(arg0);
		var1.field267 = arg0.length - 2;
		field1900 = var1.method145();
		field1985 = new int[field1900];
		field2794 = new byte[field1900][];
		field837 = new int[field1900];
		field3194 = new int[field1900];
		field2771 = new int[field1900];
		var1.field267 = arg0.length - field1900 * 8 - 7;
		field2877 = var1.method145();
		field1628 = var1.method145();
		int var2 = (var1.method144() & 0xFF) + 1;
		for (int var3 = 0; var3 < field1900; var3++) {
			field2771[var3] = var1.method145();
		}
		for (int var4 = 0; var4 < field1900; var4++) {
			field1985[var4] = var1.method145();
		}
		for (int var5 = 0; var5 < field1900; var5++) {
			field837[var5] = var1.method145();
		}
		for (int var6 = 0; var6 < field1900; var6++) {
			field3194[var6] = var1.method145();
		}
		var1.field267 = arg0.length + 3 - field1900 * 8 - var2 * 3 - 7;
		field292 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			field292[var7] = var1.method164();
			if (field292[var7] == 0) {
				field292[var7] = 1;
			}
		}
		var1.field267 = 0;
		for (int var8 = 0; var8 < field1900; var8++) {
			int var9 = field3194[var8];
			int var10 = field837[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			field2794[var8] = var12;
			int var13 = var1.method144();
			if (var13 == 0) {
				for (int var16 = 0; var16 < var11; var16++) {
					var12[var16] = var1.method184();
				}
			} else if (var13 == 1) {
				for (int var14 = 0; var14 < var10; var14++) {
					for (int var15 = 0; var15 < var9; var15++) {
						var12[var10 * var15 + var14] = var1.method184();
					}
				}
			}
		}
	}

	@ObfuscatedName("h.c(Z)I")
	public static int method456() {
		return 19;
	}

	@ObfuscatedName("m.a(BI)Z")
	public static boolean method676(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = class79.field1932[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 45;
	}

	@ObfuscatedName("r.a(IIIII)V")
	public static void method866(int arg0, int arg1, int arg2, int arg3) {
		for (class12 var4 = (class12) class16.field515.method802(); var4 != null; var4 = (class12) class16.field515.method809()) {
			if (var4.field420 != -1 || var4.field428 != null) {
				int var5 = 0;
				if (arg0 > var4.field436) {
					var5 = arg0 - var4.field436;
				} else if (arg0 < var4.field417) {
					var5 = var4.field417 - arg0;
				}
				if (arg3 > var4.field430) {
					var5 += arg3 - var4.field430;
				} else if (arg3 < var4.field426) {
					var5 += var4.field426 - arg3;
				}
				if (var4.field423 < var5 - 64 || class62.field1559 == 0 || var4.field416 != arg1) {
					if (var4.field424 != null) {
						field2435.method135(var4.field424);
						var4.field424 = null;
					}
					if (var4.field433 != null) {
						field2435.method135(var4.field433);
						var4.field433 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field423 - var5) * class62.field1559 / var4.field423;
					if (var4.field424 != null) {
						var4.field424.method582(var6);
					} else if (var4.field420 >= 0) {
						class77 var7 = class77.method711(field2031, var4.field420);
						if (var7 != null) {
							class135 var8 = var7.method710().method1055(field2705);
							class61 var9 = class61.method590(var8, var6);
							var9.method585(-1);
							field2435.method126(var9);
							var4.field424 = var9;
						}
					}
					if (var4.field433 != null) {
						var4.field433.method582(var6);
						if (!var4.field433.method589()) {
							var4.field433 = null;
						}
					} else if (var4.field428 != null && (var4.field437 -= arg2) <= 0) {
						int var10 = (int) ((double) var4.field428.length * Math.random());
						class77 var11 = class77.method711(field2031, var4.field428[var10]);
						if (var11 != null) {
							class135 var12 = var11.method710().method1055(field2705);
							class61 var13 = class61.method590(var12, var6);
							var13.method585(0);
							field2435.method126(var13);
							var4.field437 = var4.field435 + (int) ((double) (var4.field425 - var4.field435) * Math.random());
							var4.field433 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vc.c(I)V")
	public static void method1021() {
		class122 var0 = class54.field1412;
		synchronized (class54.field1412) {
			class28.field801 = class15.field494;
			class24.field741 = class23.field710;
			class102.field2568 = class15.field496;
			class122.field3050 = class80.field2017;
			class112.field2762 = class108.field2711;
			class1.field14 = class97.field2396;
			class49.field1344 = class34.field919;
			class80.field2017 = 0;
		}
	}

	@ObfuscatedName("h.j(I)Ljd;")
	public static class58 method458() {
		class58 var0 = new class58();
		var0.field1479 = field2877;
		var0.field1477 = field1628;
		var0.field1478 = field2771[0];
		var0.field1474 = field1985[0];
		var0.field1476 = field837[0];
		var0.field1475 = field3194[0];
		byte[] var1 = field2794[0];
		int var2 = var0.field1476 * var0.field1475;
		var0.field1480 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			var0.field1480[var3] = field292[var1[var3] & 0xFF];
		}
		method449();
		return var0;
	}

	@ObfuscatedName("id.a(Lbd;ILa;La;)Lbc;")
	public static class10 method528(class11 arg0, class1 arg1, class1 arg2) {
		int var3 = arg0.method228(arg2);
		int var4 = arg0.method224(var3, arg1);
		return method294(var4, arg0, var3);
	}

	@ObfuscatedName("m.a(IIIZ)I")
	public static int method677(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return 7 - arg0;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("ba.d(Z)V")
	public static void method175() {
		class8.field310 = null;
		class8.field304 = null;
		field279 = null;
		class8.field308 = null;
		class8.field303 = null;
		class8.field253 = null;
		field292 = null;
	}

	@ObfuscatedName("id.b(I)V")
	public static void method529() {
		class52.field1367 = null;
		field1366 = null;
		class52.field1363 = null;
		class52.field1383 = null;
		class52.field1384 = null;
		class52.field1386 = null;
		class52.field1379 = null;
		field1385 = null;
		class52.field1364 = null;
		field1376 = null;
		field1378 = null;
		class52.field1362 = null;
		class52.field1388 = null;
		class52.field1382 = null;
		field1380 = null;
		field1381 = null;
	}

	@ObfuscatedName("nb.i(I)V")
	public static void method730() {
		class80.field2032 = null;
		field2031 = null;
		class80.field1966 = null;
		class80.field2028 = null;
		class80.field2012 = null;
		class80.field1988 = null;
		class80.field2034 = null;
		class80.field2030 = null;
		field2024 = null;
		class80.field2029 = null;
		field2018 = null;
		field2026 = null;
		field1985 = null;
		class80.field1998 = null;
		class80.field2023 = null;
		class80.field1993 = null;
		class80.field2033 = null;
	}

	@ObfuscatedName("kd.a(JI)V")
	public static void method624(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < class59.field1492; var2++) {
			if (class117.field2929[var2] == arg0) {
				class59.field1492--;
				class39.field1055 = true;
				for (int var3 = var2; var3 < class59.field1492; var3++) {
					class119.field2951[var3] = class119.field2951[var3 + 1];
					class73.field1788[var3] = class73.field1788[var3 + 1];
					class117.field2929[var3] = class117.field2929[var3 + 1];
				}
				class70.field1726.method415(255);
				class70.field1726.method157(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("m.a(La;La;La;B)V")
	public static void method678(class1 arg0, class1 arg1, class1 arg2) {
		class123.field3062 = arg0;
		class123.field3077 = arg2;
		class123.field3060 = arg1;
	}

	@ObfuscatedName("se.a(ILbd;ZLbd;)V")
	public static void method933(class11 arg0, boolean arg1, class11 arg2) {
		field698 = arg2;
		class75.field1861 = arg1;
		field51 = arg0;
	}

	@ObfuscatedName("nb.b(IIIIII)V")
	public static void method731(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field2604 == arg2 && field829 == arg1 && (class57.field1472 == arg4 || !class93.field2332)) {
			return;
		}
		class57.field1472 = arg4;
		field2604 = arg2;
		if (!class93.field2332) {
			class57.field1472 = 0;
		}
		field829 = arg1;
		method399(25);
		method872(class133.field3252, false, null);
		int var5 = field1408;
		int var6 = field806;
		field806 = (arg2 - 6) * 8;
		int var7 = field806 - var6;
		field1408 = (arg1 - 6) * 8;
		int var8 = field1408 - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			class130 var10 = class120.field2992[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.field1962[var11] -= var7;
					var10.field2009[var11] -= var8;
				}
				var10.field1972 -= var7 * 128;
				var10.field1963 -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			class2 var13 = class80.field2030[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.field1962[var14] -= var7;
					var13.field2009[var14] -= var8;
				}
				var13.field1963 -= var8 * 128;
				var13.field1972 -= var7 * 128;
			}
		}
		field75 = arg4;
		byte var15 = 0;
		field2621.method729(arg3, false, arg0);
		byte var16 = 104;
		byte var17 = 1;
		if (var7 < 0) {
			var16 = -1;
			var15 = 103;
			var17 = -1;
		}
		byte var18 = 104;
		byte var19 = 0;
		byte var20 = 1;
		if (var8 < 0) {
			var19 = 103;
			var18 = -1;
			var20 = -1;
		}
		for (int var21 = var15; var21 != var16; var21 += var17) {
			for (int var22 = var19; var22 != var18; var22 += var20) {
				int var23 = var7 + var21;
				int var24 = var8 + var22;
				for (int var25 = 0; var25 < 4; var25++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
						class17.field552[var25][var21][var22] = class17.field552[var25][var23][var24];
					} else {
						class17.field552[var25][var21][var22] = null;
					}
				}
			}
		}
		for (class22 var26 = (class22) class92.field2284.method802(); var26 != null; var26 = (class22) class92.field2284.method809()) {
			var26.field699 -= var8;
			var26.field700 -= var7;
			if (var26.field700 < 0 || var26.field699 < 0 || var26.field700 >= 104 || var26.field699 >= 104) {
				var26.method739();
			}
		}
		class8.field305 = -1;
		if (class35.field941 != 0) {
			class35.field941 -= var7;
			class108.field2720 -= var8;
		}
		class81.field2043 = false;
		class36.field965 = 0;
		class112.field2756.method806();
		class86.field2160.method806();
	}

	@ObfuscatedName("m.a(ZLbd;IBLa;ILa;I)V")
	public static synchronized void method679(class11 arg0, class1 arg1, class1 arg2, int arg3) {
		if (method521()) {
			int var4 = arg0.method228(arg1);
			int var5 = arg0.method224(var4, arg2);
			method670(arg3, var4, arg0, var5);
		}
	}

	@ObfuscatedName("ba.a(BI)Lpe;")
	public static class95 method177(int arg0) {
		class95 var1 = (class95) class134.field3282.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2433.method217(arg0, 3);
		class95 var3 = new class95();
		if (var2 != null) {
			var3.method820(new class8(var2));
		}
		class134.field3282.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("se.a(B)V")
	public static void method934() {
		class113.field2778 = null;
		class113.field2803 = null;
		class113.field2801 = null;
		class113.field2789 = null;
		class113.field2798 = null;
		class113.field2788 = null;
		class113.field2782 = null;
		field2794 = null;
		class113.field2802 = null;
		class113.field2783 = null;
		field2799 = null;
	}

	@ObfuscatedName("h.a(Llc;BLba;I)V")
	public static void method460(class69 arg0, class8 arg1, int arg2) {
		class119 var3 = new class119();
		var3.field2964 = arg1.method144();
		var3.field2970 = arg1.method167();
		var3.field2958 = new int[var3.field2964];
		var3.field2961 = new class29[var3.field2964];
		var3.field2969 = new int[var3.field2964];
		var3.field2963 = new byte[var3.field2964][][];
		var3.field2960 = new class29[var3.field2964];
		var3.field2959 = new int[var3.field2964];
		for (int var4 = 0; var4 < var3.field2964; var4++) {
			try {
				int var5 = arg1.method144();
				if (var5 == 0 || var5 == 1 || var5 == 2) {
					int var16 = 0;
					String var17 = new String(arg1.method140().method31());
					String var18 = new String(arg1.method140().method31());
					if (var5 == 1) {
						var16 = arg1.method167();
					}
					var3.field2958[var4] = var5;
					var3.field2969[var4] = var16;
					var3.field2961[var4] = arg0.method654(method530(var17), var18);
				} else if (var5 == 3 || var5 == 4) {
					String var6 = new String(arg1.method140().method31());
					String var7 = new String(arg1.method140().method31());
					int var8 = arg1.method144();
					String[] var9 = new String[var8];
					for (int var10 = 0; var10 < var8; var10++) {
						var9[var10] = new String(arg1.method140().method31());
					}
					byte[][] var11 = new byte[var8][];
					if (var5 == 3) {
						for (int var12 = 0; var12 < var8; var12++) {
							int var13 = arg1.method167();
							var11[var12] = new byte[var13];
							arg1.method173(var11[var12], var13);
						}
					}
					var3.field2958[var4] = var5;
					Class[] var14 = new Class[var8];
					for (int var15 = 0; var15 < var8; var15++) {
						var14[var15] = method530(var9[var15]);
					}
					var3.field2960[var4] = arg0.method648(var14, var7, method530(var6));
					var3.field2963[var4] = var11;
				}
			} catch (ClassNotFoundException var19) {
				var3.field2959[var4] = -1;
			} catch (SecurityException var20) {
				var3.field2959[var4] = -2;
			} catch (NullPointerException var21) {
				var3.field2959[var4] = -3;
			} catch (Exception var22) {
				var3.field2959[var4] = -4;
			} catch (Throwable var23) {
				var3.field2959[var4] = -5;
			}
		}
		class107.field2694.method804(var3);
	}

	@ObfuscatedName("qd.c(B)V")
	public static void method859() {
		class113.field2788.method267();
		class93.field2322.method267();
		class37.field981.method267();
		class99.field2428.method267();
	}

	@ObfuscatedName("a.e(I)V")
	public static void method22() {
		class6.field233 = 0;
		int var0 = (field2621.field1972 >> 7) + field806;
		int var1 = (field2621.field1963 >> 7) + field1408;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			class6.field233 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			class6.field233 = 1;
		}
		if (class6.field233 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			class6.field233 = 0;
		}
	}

	@ObfuscatedName("vd.k(I)V")
	public static void method1025() {
		class130.field3189 = null;
		class130.field3186 = null;
		class130.field3196 = null;
		class130.field3187 = null;
		class130.field3179 = null;
		class130.field3177 = null;
		class130.field3193 = null;
		class130.field3190 = null;
		field3194 = null;
		class130.field3184 = null;
		field3183 = null;
		class130.field3191 = null;
	}

	@ObfuscatedName("m.b(B)V")
	public static synchronized void method680() {
		if (!method521()) {
			return;
		}
		if (class53.field1391) {
			byte[] var0 = method25(field661, field1028, field463, field1462);
			if (var0 != null) {
				if (field405 >= 0) {
					method749(field917, field611, var0, field405);
				} else if (field2985 < 0) {
					method7(field611, var0, field917);
				} else {
					method406(field917, field611, field2985, var0);
				}
				class53.field1391 = false;
				field1028 = null;
			}
		}
		method962();
	}

	@ObfuscatedName("rd.a(I)V")
	public static void method889() {
		field2686 = null;
		field2684 = null;
		class106.field2663 = null;
		class106.field2659 = null;
		class106.field2667 = null;
		class106.field2662 = null;
		class106.field2681 = null;
		class106.field2685 = null;
		class106.field2682 = null;
		class106.field2671 = null;
		class106.field2680 = null;
		class106.field2675 = null;
		class106.field2683 = null;
		class106.field2679 = null;
		class106.field2676 = null;
	}

	@ObfuscatedName("k.d(I)V")
	public static void method577() {
		class60.field1511 = null;
		class60.field1521 = null;
		class60.field1525 = null;
		class60.field1523 = null;
		class60.field1522 = null;
		class60.field1514 = null;
		field1524 = null;
		class60.field1510 = null;
		class60.field1527 = null;
		class60.field1529 = null;
		class60.field1526 = null;
	}

	@ObfuscatedName("qb.a(ILbd;ZI)Ljd;")
	public static class58 method846(int arg0, class11 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method458() : null;
	}

	@ObfuscatedName("r.b(I)V")
	public static void method867() {
		class102.field2577 = null;
		class102.field2565 = null;
		class102.field2562 = null;
		class102.field2560 = null;
		class102.field2564 = null;
		class102.field2569 = null;
		class102.field2583 = null;
		class102.field2578 = null;
		field2570 = null;
		class102.field2580 = null;
		class102.field2585 = null;
		class102.field2563 = null;
		class102.field2574 = null;
		class102.field2582 = null;
		field2587 = null;
		class102.field2575 = null;
		field2588 = null;
		class102.field2586 = null;
		class102.field2571 = null;
		class102.field2576 = null;
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method426() {
		class39.field1079 = null;
		class39.field1065 = null;
		class39.field1068 = null;
		class39.field1076 = null;
		field1074 = null;
		class39.field1056 = null;
		class39.field1060 = null;
		class39.field1077 = null;
		class39.field1066 = null;
		class39.field1073 = null;
		field1071 = null;
		field1078 = null;
		class39.field1067 = null;
	}

	@ObfuscatedName("vd.b(II)Lfc;")
	public static class34 method1026(int arg0) {
		class34 var1 = (class34) class72.field1757.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2018.method217(arg0, 4);
		class34 var3 = new class34();
		if (var2 != null) {
			var3.method393(arg0, new class8(var2));
		}
		var3.method395();
		class72.field1757.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("d.a(ILad;ILab;IIIII)V")
	public static void method301(int arg0, class5 arg1, int arg2, class3 arg3, int arg4, int arg5, int arg6, int arg7) {
		if (class93.field2332 && (class34.field898[0][arg2][arg6] & 0x2) == 0) {
			if ((class34.field898[arg7][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (method964(arg7, arg6, arg2) != class57.field1472) {
				return;
			}
		}
		if (class129.field3175 > arg7) {
			class129.field3175 = arg7;
		}
		int var8 = class57.field1451[arg7][arg2 + 1][arg6 + 1];
		int var9 = class57.field1451[arg7][arg2][arg6];
		int var10 = class57.field1451[arg7][arg2 + 1][arg6];
		int var11 = class57.field1451[arg7][arg2][arg6 + 1];
		int var12 = (arg6 << 7) + arg2 + (arg5 << 14) + 1073741824;
		int var13 = (arg0 << 6) + arg4;
		int var14 = var9 + var10 + var8 + var11 >> 2;
		class49 var15 = method389(arg5);
		if (var15.field1316 == 1) {
			var13 += 256;
		}
		if (var15.field1329 == 0) {
			var12 += Integer.MIN_VALUE;
		}
		if (var15.method506()) {
			method719(arg6, arg7, arg0, arg2, var15);
		}
		if (arg4 == 22) {
			if (!class93.field2332 || var15.field1329 != 0 || var15.field1330) {
				class128 var16;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var16 = var15.method505(var8, var11, arg0, var9, 22, var10);
				} else {
					var16 = new class54(arg5, 22, arg0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method88(arg7, arg2, arg6, var14, var16, var12, var13);
				if (var15.field1284 && var15.field1329 == 1 && arg1 != null) {
					arg1.method115(arg6, arg2);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			class128 var17;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var17 = var15.method505(var8, var11, arg0, var9, 10, var10);
			} else {
				var17 = new class54(arg5, 10, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			if (var17 != null) {
				int var18;
				int var19;
				if (arg0 == 1 || arg0 == 3) {
					var19 = var15.field1286;
					var18 = var15.field1298;
				} else {
					var18 = var15.field1286;
					var19 = var15.field1298;
				}
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}
				if (arg3.method93(arg7, arg2, arg6, var14, var18, var19, var17, var20, var12, var13) && var15.field1324) {
					class91 var21;
					if (var17 instanceof class91) {
						var21 = (class91) var17;
					} else {
						var21 = var15.method505(var8, var11, arg0, var9, 10, var10);
					}
					if (var21 != null) {
						for (int var22 = 0; var22 <= var18; var22++) {
							for (int var23 = 0; var23 <= var19; var23++) {
								int var24 = var21.method773() / 4;
								if (var24 > 30) {
									var24 = 30;
								}
								if (var24 > field1003[arg7][arg2 + var22][arg6 + var23]) {
									field1003[arg7][arg2 + var22][arg6 + var23] = (byte) var24;
								}
							}
						}
					}
				}
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method118(arg2, var15.field1311, var15.field1298, arg0, arg6, var15.field1286);
			}
		} else if (arg4 >= 12) {
			class128 var25;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var25 = var15.method505(var8, var11, arg0, var9, arg4, var10);
			} else {
				var25 = new class54(arg5, arg4, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method93(arg7, arg2, arg6, var14, 1, 1, var25, 0, var12, var13);
			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
				field412[arg7][arg2][arg6] |= 0x924;
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method118(arg2, var15.field1311, var15.field1298, arg0, arg6, var15.field1286);
			}
		} else if (arg4 == 0) {
			class128 var26;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var26 = var15.method505(var8, var11, arg0, var9, 0, var10);
			} else {
				var26 = new class54(arg5, 0, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var26, null, class70.field1740[arg0], 0, var12, var13);
			if (arg0 == 0) {
				if (var15.field1324) {
					field1003[arg7][arg2][arg6] = 50;
					field1003[arg7][arg2][arg6 + 1] = 50;
				}
				if (var15.field1304) {
					field412[arg7][arg2][arg6] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var15.field1324) {
					field1003[arg7][arg2][arg6 + 1] = 50;
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				}
				if (var15.field1304) {
					field412[arg7][arg2][arg6 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var15.field1324) {
					field1003[arg7][arg2 + 1][arg6] = 50;
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				}
				if (var15.field1304) {
					field412[arg7][arg2 + 1][arg6] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var15.field1324) {
					field1003[arg7][arg2][arg6] = 50;
					field1003[arg7][arg2 + 1][arg6] = 50;
				}
				if (var15.field1304) {
					field412[arg7][arg2][arg6] |= 0x492;
				}
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.field1311);
			}
			if (var15.field1288 != 16) {
				arg3.method71(arg7, arg2, arg6, var15.field1288);
			}
		} else if (arg4 == 1) {
			class128 var27;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var27 = var15.method505(var8, var11, arg0, var9, 1, var10);
			} else {
				var27 = new class54(arg5, 1, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var27, null, class114.field2819[arg0], 0, var12, var13);
			if (var15.field1324) {
				if (arg0 == 0) {
					field1003[arg7][arg2][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field1003[arg7][arg2 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field1003[arg7][arg2][arg6] = 50;
				}
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.field1311);
			}
		} else if (arg4 == 2) {
			int var28 = arg0 + 1 & 0x3;
			class128 var29;
			class128 var30;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var29 = var15.method505(var8, var11, arg0 + 4, var9, 2, var10);
				var30 = var15.method505(var8, var11, var28, var9, 2, var10);
			} else {
				var29 = new class54(arg5, 2, arg0 + 4, var9, var10, var8, var11, var15.field1289, true);
				var30 = new class54(arg5, 2, var28, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var29, var30, class70.field1740[arg0], class70.field1740[var28], var12, var13);
			if (var15.field1304) {
				if (arg0 == 0) {
					field412[arg7][arg2][arg6] |= 0x249;
					field412[arg7][arg2][arg6 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field412[arg7][arg2][arg6 + 1] |= 0x492;
					field412[arg7][arg2 + 1][arg6] |= 0x249;
				} else if (arg0 == 2) {
					field412[arg7][arg2 + 1][arg6] |= 0x249;
					field412[arg7][arg2][arg6] |= 0x492;
				} else if (arg0 == 3) {
					field412[arg7][arg2][arg6] |= 0x492;
					field412[arg7][arg2][arg6] |= 0x249;
				}
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.field1311);
			}
			if (var15.field1288 != 16) {
				arg3.method71(arg7, arg2, arg6, var15.field1288);
			}
		} else if (arg4 == 3) {
			class128 var31;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var31 = var15.method505(var8, var11, arg0, var9, 3, var10);
			} else {
				var31 = new class54(arg5, 3, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var31, null, class114.field2819[arg0], 0, var12, var13);
			if (var15.field1324) {
				if (arg0 == 0) {
					field1003[arg7][arg2][arg6 + 1] = 50;
				} else if (arg0 == 1) {
					field1003[arg7][arg2 + 1][arg6 + 1] = 50;
				} else if (arg0 == 2) {
					field1003[arg7][arg2 + 1][arg6] = 50;
				} else if (arg0 == 3) {
					field1003[arg7][arg2][arg6] = 50;
				}
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method114(arg6, arg4, arg0, arg2, var15.field1311);
			}
		} else if (arg4 == 9) {
			class128 var32;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var32 = var15.method505(var8, var11, arg0, var9, arg4, var10);
			} else {
				var32 = new class54(arg5, arg4, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method93(arg7, arg2, arg6, var14, 1, 1, var32, 0, var12, var13);
			if (var15.field1284 && arg1 != null) {
				arg1.method118(arg2, var15.field1311, var15.field1298, arg0, arg6, var15.field1286);
			}
		} else {
			if (var15.field1313) {
				if (arg0 == 1) {
					int var33 = var11;
					var11 = var8;
					var8 = var10;
					var10 = var9;
					var9 = var33;
				} else if (arg0 == 2) {
					int var34 = var11;
					var11 = var10;
					var10 = var34;
					int var35 = var8;
					var8 = var9;
					var9 = var35;
				} else if (arg0 == 3) {
					int var36 = var11;
					var11 = var9;
					var9 = var10;
					var10 = var8;
					var8 = var36;
				}
			}
			if (arg4 == 4) {
				class128 var37;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var37 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var37 = new class54(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var37, class70.field1740[arg0], arg0 * 512, 0, 0, var12, var13);
			} else if (arg4 == 5) {
				int var38 = arg3.method78(arg7, arg2, arg6);
				int var39 = 16;
				if (var38 > 0) {
					var39 = method389(var38 >> 14 & 0x7FFF).field1288;
				}
				class128 var40;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var40 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var40 = new class54(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var40, class70.field1740[arg0], arg0 * 512, class63.field1595[arg0] * var39, class4.field181[arg0] * var39, var12, var13);
			} else if (arg4 == 6) {
				class128 var41;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var41 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var41 = new class54(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var41, 256, arg0, 0, 0, var12, var13);
			} else if (arg4 == 7) {
				class128 var42;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var42 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var42 = new class54(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var42, 512, arg0, 0, 0, var12, var13);
			} else if (arg4 == 8) {
				class128 var43;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var43 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var43 = new class54(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var43, 768, arg0, 0, 0, var12, var13);
			}
		}
	}

	@ObfuscatedName("qb.a(I)V")
	public static void method847() {
		if (field1450 != null) {
			field1450.method1015();
			field1450 = null;
		}
		method595();
		field3183.method54();
		for (int var0 = 0; var0 < 4; var0++) {
			class102.field2569[var0].method110();
		}
		System.gc();
		method672();
		class75.field1860 = 0;
		class122.field3037 = -1;
		method718();
		method399(10);
	}

	@ObfuscatedName("k.d(B)V")
	public static void method578() {
		if (class2.field96 == 2) {
			method423(class42.field1114 * 2, (class6.field226 - field1408 << 7) + class75.field1857, (-field806 + class134.field3304 << 7) - -class102.field2572);
			if (class39.field1072 > -1 && class82.field2063 % 20 < 10) {
				field1886[0].method551(class39.field1072 - 12, class89.field2188 + -28);
			}
		}
	}

	@ObfuscatedName("m.a(ZIIIILbd;I)V")
	public static synchronized void method681(int arg0, int arg1, int arg2, class11 arg3) {
		if (!method521()) {
			return;
		}
		class53.field1391 = true;
		field2985 = -1;
		field405 = -1;
		field917 = arg2;
		field661 = 0;
		field611 = false;
		field1462 = arg0;
		field1028 = arg3;
		field463 = arg1;
	}

	@ObfuscatedName("gb.a(JI)V")
	public static void method427(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}

	@ObfuscatedName("bd.a(Z)V")
	public static void method233() {
		class46.field1196.method267();
		class85.field2136.method267();
	}

	@ObfuscatedName("ia.a(IZIIIIIIII)V")
	public static void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class22 var9 = null;
		for (class22 var10 = (class22) class92.field2284.method802(); var10 != null; var10 = (class22) class92.field2284.method809()) {
			if (var10.field679 == arg4 && var10.field700 == arg1 && var10.field699 == arg5 && var10.field688 == arg6) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new class22();
			var9.field700 = arg1;
			var9.field688 = arg6;
			var9.field679 = arg4;
			var9.field699 = arg5;
			method733(var9);
			class92.field2284.method804(var9);
		}
		var9.field678 = arg0;
		var9.field692 = arg3;
		var9.field694 = arg8;
		var9.field696 = arg2;
		var9.field691 = arg7;
	}

	@ObfuscatedName("bd.b(Z)V")
	public static void method234() {
		class106.field2663.method267();
	}

	@ObfuscatedName("r.a(ILbd;)V")
	public static void method868(class11 arg0) {
		field1555 = arg0;
	}

	@ObfuscatedName("a.a(ILbd;III)[B")
	public static byte[] method25(int arg0, class11 arg1, int arg2, int arg3) {
		long var4 = ((long) arg3 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF) + (long) (arg2 << 16);
		if (field30 != null) {
			class46 var6 = (class46) field30.method263(var4);
			if (var6 != null) {
				return var6.field1198;
			}
		}
		byte[] var7 = arg1.method217(arg0, arg2);
		if (var7 == null) {
			return null;
		} else {
			if (field30 != null) {
				field30.method262(var4, new class46(var7));
			}
			return var7;
		}
	}

	@ObfuscatedName("h.k(I)V")
	public static void method461() {
		field1096 = null;
		field1087 = null;
		class42.field1098 = null;
		class42.field1109 = null;
		class42.field1142 = null;
		class42.field1090 = null;
		class42.field1106 = null;
		class42.field1133 = null;
		class42.field1127 = null;
		class42.field1120 = null;
		class42.field1093 = null;
		class42.field1126 = null;
		class42.field1111 = null;
		class42.field1102 = null;
		class42.field1118 = null;
		class42.field1094 = null;
	}

	@ObfuscatedName("hd.h(I)V")
	public static void method483() {
		int var0 = field986;
		int var1 = field219;
		int var2 = field579;
		int var3 = field2306;
		class111.method913(var0, var2, var3, var1, 6116423);
		class111.method913(var0 + 1, var2 + 1, var3 - 2, 16, 0);
		class111.method922(var0 + 1, var2 + 18, var3 - 2, var1 + -19, 0);
		field2902.method213(class100.field2490, var0 + 3, var2 + 14, 6116423);
		int var4 = class24.field741;
		int var5 = class102.field2568;
		if (field640 == 0) {
			var4 -= 4;
			var5 -= 4;
		}
		if (field640 == 1) {
			var5 -= 205;
			var4 -= 553;
		}
		if (field640 == 2) {
			var5 -= 357;
			var4 -= 17;
		}
		for (int var6 = 0; var6 < class42.field1104; var6++) {
			int var7 = (class42.field1104 - var6 - 1) * 15 + var2 + 31;
			int var8 = 16777215;
			if (var4 > var0 && var0 + var3 > var4 && var5 > var7 - 13 && var7 + 3 > var5) {
				var8 = 16776960;
			}
			field2902.method206(class102.field2586[var6], var0 + 3, var7, var8, true);
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void method1040() {
		for (class12 var0 = (class12) class16.field515.method802(); var0 != null; var0 = (class12) class16.field515.method809()) {
			if (var0.field434 != null) {
				var0.method247();
			}
		}
	}

	@ObfuscatedName("kd.a(IIIZI)I")
	public static int method627(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - class27.field778[arg3 * 1024 / arg1] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg2 * var4 >> 16);
	}

	@ObfuscatedName("gb.b(B)V")
	public static void method429() {
		for (class22 var0 = (class22) class92.field2284.method802(); var0 != null; var0 = (class22) class92.field2284.method809()) {
			if (var0.field692 == -1) {
				var0.field694 = 0;
				method733(var0);
			} else {
				var0.method739();
			}
		}
	}

	@ObfuscatedName("client.a(Lu;BI)V")
	public static void method280(class120 arg0, int arg1) {
		if (field2415 == null) {
			method495(true, null, 255, 255, (byte) 0, 0);
			class50.field1350[arg1] = arg0;
		} else {
			field2415.field267 = arg1 * 4 + 5;
			int var2 = field2415.method167();
			arg0.method980(var2);
		}
	}

	@ObfuscatedName("client.g(I)V")
	public static void method281() {
		if (class46.field1209 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (class46.field1209 > 768) {
					field2151[var2] = method700(field2600[var2], field3139[var2], 1024 - class46.field1209);
				} else if (class46.field1209 > 256) {
					field2151[var2] = field3139[var2];
				} else {
					field2151[var2] = method700(field3139[var2], field2600[var2], 256 - class46.field1209);
				}
			}
		} else if (class95.field2380 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (class95.field2380 > 768) {
					field2151[var0] = method700(field2600[var0], field2904[var0], 1024 - class95.field2380);
				} else if (class95.field2380 > 256) {
					field2151[var0] = field2904[var0];
				} else {
					field2151[var0] = method700(field2904[var0], field2600[var0], 256 - class95.field2380);
				}
			}
		} else {
			for (int var1 = 0; var1 < 256; var1++) {
				field2151[var1] = field2600[var1];
			}
		}
		for (int var3 = 0; var3 < 33920; var3++) {
			field472.field3288[var3] = field2055.field1480[var3];
		}
		int var4 = 0;
		int var5 = 1152;
		for (int var6 = 1; var6 < 255; var6++) {
			int var7 = (256 - var6) * class31.field847[var6] / 256;
			int var8 = var7 + 22;
			if (var8 < 0) {
				var8 = 0;
			}
			var4 += var8;
			for (int var9 = var8; var9 < 128; var9++) {
				int var10 = field229[var4++];
				if (var10 == 0) {
					var5++;
				} else {
					int var11 = 256 - var10;
					int var13 = field2151[var10];
					int var14 = field472.field3288[var5];
					field472.field3288[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}
			var5 += var8;
		}
		int var15 = 1176;
		int var16 = 0;
		for (int var17 = 0; var17 < 33920; var17++) {
			field1435.field3288[var17] = field851.field1480[var17];
		}
		for (int var18 = 1; var18 < 255; var18++) {
			int var19 = (256 - var18) * class31.field847[var18] / 256;
			int var20 = 103 - var19;
			int var21 = var15 + var19;
			for (int var22 = 0; var22 < var20; var22++) {
				int var23 = field229[var16++];
				if (var23 == 0) {
					var21++;
				} else {
					int var25 = field1435.field3288[var21];
					int var26 = 256 - var23;
					int var27 = field2151[var23];
					field1435.field3288[var21++] = ((var25 & 0xFF00) * var26 + (var27 & 0xFF00) * var23 & 0xFF0000) + ((var25 & 0xFF00FF) * var26 + (var27 & 0xFF00FF) * var23 & 0xFF00FF00) >> 8;
				}
			}
			var15 = var21 + 128 - var20 - var19;
			var16 += 128 - var20;
		}
	}

	@ObfuscatedName("qd.b(IB)La;")
	public static class1 method862(int arg0) {
		if (arg0 < 100000) {
			return method502(arg0);
		} else if (arg0 < 10000000) {
			return method956(new class1[] { method502(arg0 / 1000), class95.field2354 });
		} else {
			return method956(new class1[] { method502(arg0 / 1000000), class45.field1184 });
		}
	}

	@ObfuscatedName("gb.c(B)I")
	public static int method432() {
		return 5;
	}

	@ObfuscatedName("a.e(B)V")
	public static void method34() {
		field30 = null;
		class1.field59 = null;
		field61 = null;
		class1.field23 = null;
		field51 = null;
		class1.field48 = null;
		class1.field63 = null;
		field11 = null;
		class1.field45 = null;
		class1.field62 = null;
		class1.field37 = null;
		class1.field49 = null;
		class1.field52 = null;
	}

	@ObfuscatedName("kc.a(La;La;Lbd;B)Le;")
	public static class25 method605(class1 arg0, class1 arg1, class11 arg2) {
		int var3 = arg2.method228(arg0);
		int var4 = arg2.method224(var3, arg1);
		return method609(arg2, var4, var3);
	}

	@ObfuscatedName("ob.a(I)V")
	public static void method755() {
		class79.field1941 = true;
		method986();
		if (class66.field1648 != -1) {
			boolean var0 = method478(class66.field1648, 261, 1, 190);
			if (!var0) {
				class39.field1055 = true;
			}
		} else if (class97.field2397[class9.field330] != -1) {
			boolean var1 = method478(class97.field2397[class9.field330], 261, 1, 190);
			if (!var1) {
				class39.field1055 = true;
			}
		}
		if (class6.field224 && field640 == 1) {
			if (class74.field1838 == 1) {
				method660();
			} else {
				method483();
			}
		}
		method901();
	}

	@ObfuscatedName("client.d(Z)V")
	public static void method285() {
		client.field583 = null;
		client.field602 = null;
		client.field599 = null;
		client.field584 = null;
		client.field596 = null;
		client.field604 = null;
		client.field598 = null;
		client.field609 = null;
		client.field588 = null;
		client.field582 = null;
		client.field578 = null;
	}

	@ObfuscatedName("kc.a(BIIIIII)V")
	public static void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!method1052(arg3)) {
			return;
		}
		method618(arg4, arg2, 0, arg1, arg5, -1, field2922[arg3], arg0, 0);
		if (class17.field548 == null) {
			return;
		}
		class100 var6 = class17.field548;
		class100 var7 = method1009(var6);
		if (var7 == null) {
			return;
		}
		int[] var8 = method325(var7);
		int[] var9 = method325(var6);
		int var10 = var9[1] + class102.field2568 - var8[1] - class97.field2392;
		int var11 = var9[0] + class24.field741 - var8[0] - class12.field419;
		if (var10 < 0) {
			var10 = 0;
		}
		if (var7.field2449 < var6.field2449 + var10) {
			var10 = var7.field2449 - var6.field2449;
		}
		if (var11 < 0) {
			var11 = 0;
		}
		if (var7.field2498 < var6.field2498 + var11) {
			var11 = var7.field2498 - var6.field2498;
		}
		if (class17.field548.field2475 != null && (arg1 & 0x200) != 0) {
			method754(var6.field2475, var10, var6, var11);
		}
		if (class28.field801 != 0 || (arg1 & 0x400) == 0) {
			return;
		}
		if (class17.field548.field2501 != null) {
			method754(var6.field2501, var10, var6, var11);
		}
		class17.field548 = null;
		return;
	}

	@ObfuscatedName("ob.a(B)V")
	public static void method756() {
		class86.field2152 = null;
		class86.field2164 = null;
		class86.field2159 = null;
		class86.field2160 = null;
		class86.field2162 = null;
		class86.field2157 = null;
		class86.field2165 = null;
	}

	@ObfuscatedName("ob.a(Z)V")
	public static void method757() {
		if (class32.field857 != 0) {
			return;
		}
		class102.field2586[0] = class134.field3302;
		class79.field1932[0] = 1005;
		class42.field1104 = 1;
		if (class42.field1143 != -1) {
			class59.field1497 = -1;
			class34.field903 = -1;
			method321(0, 765, 503, class42.field1143, 0, class24.field741, class102.field2568, 0);
			class115.field2881 = class34.field903;
			class48.field1279 = class59.field1497;
			return;
		}
		method572();
		class59.field1497 = -1;
		class34.field903 = -1;
		boolean var0 = false;
		if (class24.field741 > 4 && class102.field2568 > 4 && class24.field741 < 516 && class102.field2568 < 338) {
			if (class132.field3227 == -1) {
				method1019();
			} else {
				method321(4, 516, 338, class132.field3227, 4, class24.field741, class102.field2568, 0);
			}
		}
		class48.field1279 = class59.field1497;
		class115.field2881 = class34.field903;
		class59.field1497 = -1;
		class34.field903 = -1;
		if (class24.field741 > 553 && class102.field2568 > 205 && class24.field741 < 743 && class102.field2568 < 466) {
			if (class66.field1648 != -1) {
				method321(205, 743, 466, class66.field1648, 553, class24.field741, class102.field2568, 1);
			} else if (class97.field2397[class9.field330] != -1) {
				method321(205, 743, 466, class97.field2397[class9.field330], 553, class24.field741, class102.field2568, 1);
			}
		}
		if (class5.field214 != class34.field903) {
			class39.field1055 = true;
			class5.field214 = class34.field903;
		}
		class34.field903 = -1;
		if (class59.field1497 != class52.field1387) {
			class52.field1387 = class59.field1497;
			class39.field1055 = true;
		}
		class59.field1497 = -1;
		if (class24.field741 > 17 && class102.field2568 > 357 && class24.field741 < 496 && class102.field2568 < 453) {
			if (class86.field2166 != -1) {
				method321(357, 496, 453, class86.field2166, 17, class24.field741, class102.field2568, 2);
			} else if (class98.field2421 != -1) {
				method321(357, 496, 453, class98.field2421, 17, class24.field741, class102.field2568, 3);
			} else if (class102.field2568 < 434 && class24.field741 < 426) {
				method974(class24.field741 - 17, class102.field2568 + -357);
			}
		}
		if ((class86.field2166 != -1 || class98.field2421 != -1) && class34.field903 != class108.field2712) {
			class105.field2637 = true;
			class108.field2712 = class34.field903;
		}
		if ((class86.field2166 != -1 || class98.field2421 != -1) && class59.field1497 != class133.field3253) {
			class105.field2637 = true;
			class133.field3253 = class59.field1497;
		}
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < class42.field1104 - 1; var1++) {
				if (class79.field1932[var1] < 1000 && class79.field1932[var1 + 1] > 1000) {
					var0 = false;
					class1 var2 = class102.field2586[var1];
					class102.field2586[var1] = class102.field2586[var1 + 1];
					class102.field2586[var1 + 1] = var2;
					int var3 = class79.field1932[var1];
					class79.field1932[var1] = class79.field1932[var1 + 1];
					class79.field1932[var1 + 1] = var3;
					int var4 = class37.field994[var1];
					class37.field994[var1] = class37.field994[var1 + 1];
					class37.field994[var1 + 1] = var4;
					int var5 = class117.field2925[var1];
					class117.field2925[var1] = class117.field2925[var1 + 1];
					class117.field2925[var1 + 1] = var5;
					int var6 = class72.field1770[var1];
					class72.field1770[var1] = class72.field1770[var1 + 1];
					class72.field1770[var1 + 1] = var6;
				}
			}
		}
	}

	@ObfuscatedName("kc.a([Lqd;IZIIIII)Lqd;")
	public static class100 method607(class100[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == null) {
			return null;
		}
		class100 var7 = null;
		for (int var8 = 0; var8 < arg0.length; var8++) {
			class100 var9 = arg0[var8];
			if (var9 != null && var9.field2454 == arg4) {
				int var10 = var9.field2502 + arg3;
				int var11 = var9.field2462 + arg5;
				if (var11 <= arg6 && var10 <= arg1 && var9.field2498 + var11 > arg6 && arg1 < var10 + var9.field2449 && !var9.field2556) {
					if (var9.field2495 < 0 && arg2 || var9.field2495 >= 0 && !arg2) {
						var7 = var9;
					}
					if (var9.field2489 == 0) {
						class100 var12 = method607(arg0, arg1, arg2, var9.field2502 - var9.field2537, var8, var9.field2462 - var9.field2552, arg6);
						if (var12 != null) {
							var7 = var12;
						}
						if (arg2 && var9.field2519 != null) {
							class100 var13 = method607(var9.field2519, arg1, arg2, var9.field2502 - var9.field2537, var9.field2495, var9.field2462 - var9.field2552, arg6);
							if (var13 != null) {
								var7 = var13;
							}
						}
					}
				}
			}
		}
		return var7;
	}

	@ObfuscatedName("client.a(IIIIIII)I")
	public static int method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			int var7 = arg1;
			arg1 = arg3;
			arg3 = var7;
		}
		if (var6 == 0) {
			return arg2;
		} else if (var6 == 1) {
			return arg5;
		} else if (var6 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 1 + 7 - arg5 - arg3;
		}
	}

	@ObfuscatedName("kc.a(Lbd;BII)Le;")
	public static class25 method609(class11 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method467() : null;
	}

	@ObfuscatedName("kc.a(BZ)V")
	public static void method610(boolean arg0) {
		class45.field1179++;
		if (class45.field1179 < 50 && !arg0) {
			return;
		}
		class45.field1179 = 0;
		if (class78.field1919 || field1450 == null) {
			return;
		}
		class70.field1726.method415(13);
		try {
			field1450.method1016(class70.field1726.field267, class70.field1726.field284);
			class70.field1726.field267 = 0;
		} catch (IOException var1) {
			class78.field1919 = true;
		}
	}

	@ObfuscatedName("kc.d(I)V")
	public static void method611() {
		if (class97.field2402) {
			class97.field2402 = false;
			method943();
			class95.field2364 = true;
			class105.field2637 = true;
			class39.field1055 = true;
			class15.field504 = true;
		}
		method599();
		if (class6.field224 && field640 == 1) {
			class39.field1055 = true;
		}
		if (class66.field1648 != -1) {
			boolean var0 = method1012(class66.field1648);
			if (var0) {
				class39.field1055 = true;
			}
		}
		if (class19.field656 == 2) {
			class39.field1055 = true;
		}
		if (class32.field857 == 2) {
			class39.field1055 = true;
		}
		if (class39.field1055) {
			class39.field1055 = false;
			method755();
		}
		if (class86.field2166 == -1) {
			field704.field2537 = class122.field3052 - class49.field1340 - 77;
			if (class24.field741 > 448 && class24.field741 < 560 && class102.field2568 > 332) {
				method192(77, class102.field2568 - 357, class24.field741 + -17, class122.field3052, field704, 463, -1, 0);
			}
			int var1 = class122.field3052 - field704.field2537 - 77;
			if (var1 < 0) {
				var1 = 0;
			}
			if (var1 > class122.field3052 - 77) {
				var1 = class122.field3052 - 77;
			}
			if (class49.field1340 != var1) {
				class49.field1340 = var1;
				class105.field2637 = true;
			}
		}
		if (class86.field2166 == -1 && class114.field2811 == 3) {
			field704.field2537 = class53.field1390;
			int var2 = class93.field2330 * 14 + 7;
			if (class24.field741 > 448 && class24.field741 < 560 && class102.field2568 > 332) {
				method192(77, class102.field2568 - 357, class24.field741 + -17, var2, field704, 463, -1, 0);
			}
			int var3 = field704.field2537;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > var2 - 77) {
				var3 = var2 - 77;
			}
			if (class53.field1390 != var3) {
				class53.field1390 = var3;
				class105.field2637 = true;
			}
		}
		if (class86.field2166 != -1) {
			boolean var4 = method1012(class86.field2166);
			if (var4) {
				class105.field2637 = true;
			}
		}
		if (class19.field656 == 3) {
			class105.field2637 = true;
		}
		if (class32.field857 == 3) {
			class105.field2637 = true;
		}
		if (class64.field1605 != null) {
			class105.field2637 = true;
		}
		if (class6.field224 && field640 == 2) {
			class105.field2637 = true;
		}
		if (class105.field2637) {
			class105.field2637 = false;
			method932();
		}
		method717();
		if (class103.field2607 != -1) {
			class95.field2364 = true;
		}
		if (class95.field2364) {
			if (class103.field2607 != -1 && class9.field330 == class103.field2607) {
				class103.field2607 = -1;
				class70.field1726.method415(44);
				class70.field1726.method141(class9.field330);
			}
			class95.field2364 = false;
			class22.field687 = true;
			method246(class9.field330, class97.field2397, class66.field1648 == -1, class82.field2063 % 20 >= 10 ? class103.field2607 : -1);
		}
		if (class15.field504) {
			class22.field687 = true;
			class15.field504 = false;
			method880(class115.field2828, field2684, class6.field236, class75.field1864);
		}
		method866(field2621.field1972, field75, class9.field321, field2621.field1963);
		class9.field321 = 0;
	}

	@ObfuscatedName("client.a(Lbd;Z)V")
	public static void method289(class11 arg0) {
		field3167 = arg0;
		field2915 = field3167.method235(16);
	}

	@ObfuscatedName("kc.b(II)V")
	public static void method612(int arg0) {
		if (arg0 == -3) {
			method678(class82.field2093, class105.field2634, class32.field865);
		} else if (arg0 == -2) {
			method678(class82.field2071, class82.field2106, class46.field1219);
		} else if (arg0 == -1) {
			method678(class82.field2086, class72.field1778, class32.field861);
		} else if (arg0 == 3) {
			method678(class82.field2078, class82.field2111, class39.field1076);
		} else if (arg0 == 4) {
			method678(class82.field2113, class129.field3172, class15.field497);
		} else if (arg0 == 5) {
			method678(class82.field2103, class45.field1174, class2.field94);
		} else if (arg0 == 6) {
			method678(class82.field2067, class46.field1217, class131.field3205);
		} else if (arg0 == 7) {
			method678(class82.field2090, class112.field2763, class123.field3072);
		} else if (arg0 == 8) {
			method678(class82.field2074, class85.field2135, class4.field183);
		} else if (arg0 == 9) {
			method678(class82.field2079, class80.field2012, class59.field1482);
		} else if (arg0 == 10) {
			method678(class82.field2089, class85.field2140, class95.field2382);
		} else if (arg0 == 11) {
			method678(class82.field2080, class85.field2139, class57.field1463);
		} else if (arg0 == 12) {
			method678(class82.field2068, class127.field3127, class35.field932);
		} else if (arg0 == 13) {
			method678(class82.field2109, class59.field1498, class32.field850);
		} else if (arg0 == 14) {
			method678(class82.field2066, class17.field539, class42.field1111);
		} else if (arg0 == 16) {
			method678(class82.field2061, class8.field303, class38.field1043);
		} else if (arg0 == 17) {
			method678(class82.field2096, class102.field2580, class121.field3001);
		} else if (arg0 == 18) {
			method678(class82.field2100, client.field602, class74.field1807);
		} else if (arg0 == 20) {
			method678(class82.field2081, class108.field2714, class32.field855);
		} else if (arg0 == 22) {
			method678(class82.field2092, class34.field900, class11.field408);
		} else if (arg0 == 23) {
			method678(class82.field2094, class79.field1930, class42.field1120);
		} else if (arg0 == 24) {
			method678(class82.field2091, class118.field2948, class9.field315);
		} else if (arg0 == 25) {
			method678(class82.field2110, class14.field452, class32.field858);
		} else if (arg0 == 26) {
			method678(class82.field2097, class38.field1024, class31.field836);
		} else if (arg0 == 27) {
			method678(class82.field2082, class82.field2062, class127.field3128);
		} else {
			method678(class82.field2083, class42.field1142, class32.field862);
		}
		method399(10);
	}

	@ObfuscatedName("client.j(I)V")
	public static void method291() {
		class103.field2605 = 0L;
		field708.field2058 = 0;
		class123.field3069 = 0;
		class75.field1862 = true;
		field1277 = true;
		method469();
		class15.field498 = -1;
		class6.field224 = false;
		class1.field36 = -1;
		class112.field2761 = -1;
		class114.field2813 = 0;
		class75.field1855 = 0;
		class2.field96 = 0;
		class70.field1726.field267 = 0;
		class70.field1750 = 0;
		class99.field2434 = -1;
		class15.field488.field267 = 0;
		class42.field1104 = 0;
		method876(0);
		for (int var0 = 0; var0 < 100; var0++) {
			class80.field2034[var0] = null;
		}
		class14.field475 = 0;
		class112.field2766 = (int) (Math.random() * 80.0D) - 40;
		class98.field2409 = (int) (Math.random() * 110.0D) - 55;
		class35.field941 = 0;
		class86.field2158 = (int) (Math.random() * 120.0D) - 60;
		class8.field305 = -1;
		class49.field1341 = 0;
		class36.field965 = 0;
		client.field594 = 0;
		class113.field2797 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		class103.field2589 = (int) (Math.random() * 30.0D) - 20;
		class63.field1587 = 0;
		class8.field296 = (int) (Math.random() * 100.0D) - 50;
		class118.field2939 = 0;
		class108.field2720 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			class80.field2030[var1] = null;
			class45.field1176[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			class120.field2992[var2] = null;
		}
		field2621 = class80.field2030[2047] = new class2();
		class86.field2160.method806();
		class112.field2756.method806();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					class17.field552[var3][var4][var5] = null;
				}
			}
		}
		class92.field2284 = new class92();
		class59.field1492 = 0;
		class23.field701 = 0;
		method895(class98.field2421);
		class98.field2421 = -1;
		method895(class86.field2166);
		class86.field2166 = -1;
		method895(class132.field3227);
		class132.field3227 = -1;
		method895(class42.field1143);
		class42.field1143 = -1;
		method895(class76.field1881);
		class76.field1881 = -1;
		method895(class66.field1648);
		class66.field1648 = -1;
		method895(class113.field2800);
		class114.field2811 = 0;
		class37.field1001 = false;
		class6.field224 = false;
		class113.field2800 = -1;
		class64.field1605 = null;
		class120.field2998 = -1;
		class103.field2607 = -1;
		class57.field1470 = 0;
		class9.field330 = 3;
		class92.field2302.method640(null, false, new int[5], -1);
		for (int var6 = 0; var6 < 5; var6++) {
			client.field599[var6] = null;
			class24.field735[var6] = false;
		}
		class39.field1069 = true;
	}

	@ObfuscatedName("kc.a(BZZ)I")
	public static int method614() {
		return class31.field845 + class134.field3285;
	}

	@ObfuscatedName("ad.c(I)V")
	public static void method116() {
		class5.field220 = null;
		class5.field213 = null;
		class5.field218 = null;
		class5.field221 = null;
		class5.field215 = null;
		class5.field222 = null;
		field217 = null;
	}

	@ObfuscatedName("ad.b(III)I")
	public static int method121(int arg0, int arg1) {
		int var2 = method747(arg0 - 1, arg1 + -1) + method747(arg0 + 1, arg1 - 1) + method747(arg0 + -1, arg1 + 1) + method747(arg0 + 1, arg1 - -1);
		int var3 = method747(arg0 - 1, arg1) + method747(arg0 + 1, arg1) + method747(arg0, arg1 - 1) + method747(arg0, arg1 + 1);
		int var4 = method747(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
