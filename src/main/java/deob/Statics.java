package deob;

import jagex3.callstack.JagException;
import jagex3.client.*;
import jagex3.config.*;
import jagex3.dash3d.*;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.LinkList2;
import jagex3.datastruct.LruCache;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.Js5;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5NetThread;
import jagex3.js5.Js5WorkerRequest;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.wordfilter2.Huffman;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Date;
import java.util.zip.GZIPInputStream;
// import netscape.javascript.JSObject;

public class Statics {

	@ObfuscatedName("la.D")
	public static final int field1684 = 50;
	@ObfuscatedName("cb.p")
	public static final int field495 = 5063219;
	@ObfuscatedName("sa.j")
	public static final int field2734 = 3353893;
	@ObfuscatedName("a.eb")
	public static final int field57 = 50;
	@ObfuscatedName("wa.t")
	public static final int field3226 = 7759444;
	@ObfuscatedName("la.J")
	public static int[] field1690 = new int[field1684];
	@ObfuscatedName("la.G")
	public static int[] field1687 = new int[field1684];
	@ObfuscatedName("la.a")
	public static int[] field1655 = new int[field1684];
	@ObfuscatedName("la.f")
	public static int[] field1660 = new int[field1684];
	@ObfuscatedName("la.e")
	public static int[] field1659 = new int[field1684];
	@ObfuscatedName("la.i")
	public static int[] field1663 = new int[field1684];
	@ObfuscatedName("la.p")
	public static int[] field1670 = new int[field1684];
	@ObfuscatedName("la.r")
	public static JagString[] field1672 = new JagString[field1684];
	@ObfuscatedName("g.z")
	public static byte[][][] field1003;

	@ObfuscatedName("ga.y")
	public static long field1014;

	@ObfuscatedName("ga.M")
	public static Js5 field1028;

	@ObfuscatedName("ga.N")
	public static int field1029;

	@ObfuscatedName("ab.b")
	public static int field103;

	@ObfuscatedName("ab.e")
	public static int field106;

	@ObfuscatedName("gb.p")
	public static boolean field1062;

	@ObfuscatedName("gb.B")
	public static Pix8 field1074;

	@ObfuscatedName("gb.C")
	public static int field1075;

	@ObfuscatedName("gb.F")
	public static int[] field1078;

	@ObfuscatedName("h.Gb")
	public static int[] field1096;

	@ObfuscatedName("a.k")
	public static PixMap field11;

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
	public static PixMap field1167;

	@ObfuscatedName("hc.e")
	public static Pix8[] field1177;

	@ObfuscatedName("hc.o")
	public static int field1187;

	@ObfuscatedName("hd.vb")
	public static int field1194;

	@ObfuscatedName("hd.Bb")
	public static int field1200;

	@ObfuscatedName("ab.u")
	public static int field122;

	@ObfuscatedName("he.Cb")
	public static Pix32[] field1231;

	@ObfuscatedName("he.Kb")
	public static Pix32 field1239;

	@ObfuscatedName("he.Mb")
	public static Js5 field1241;

	@ObfuscatedName("he.Sb")
	public static int[][] field1247;

	@ObfuscatedName("ab.x")
	public static int field125;

	@ObfuscatedName("i.a")
	public static Pix8 field1255;

	@ObfuscatedName("ab.z")
	public static int field127;

	@ObfuscatedName("i.p")
	public static int field1270;

	@ObfuscatedName("ia.Sb")
	public static PixMap field1307;

	@ObfuscatedName("ib.c")
	public static int[] field1347;

	@ObfuscatedName("id.g")
	public static Pix8 field1366;

	@ObfuscatedName("id.q")
	public static Pix32[] field1376;

	@ObfuscatedName("ab.L")
	public static int field138;

	@ObfuscatedName("id.u")
	public static PrivilegedRequest field1380;

	@ObfuscatedName("id.v")
	public static PcmStream field1381;

	@ObfuscatedName("id.z")
	public static int[] field1385;

	@ObfuscatedName("ie.i")
	public static Image field1397;

	@ObfuscatedName("ie.l")
	public static int field1400;

	@ObfuscatedName("ie.q")
	public static Js5 field1405;

	@ObfuscatedName("ie.t")
	public static int field1408;

	@ObfuscatedName("j.jc")
	public static PixMap field1435;

	@ObfuscatedName("j.mc")
	public static PixMap field1438;

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

	@ObfuscatedName("jc.db")
	public static class129 field1450;

	@ObfuscatedName("jc.kb")
	public static Pix8 field1457;

	@ObfuscatedName("jc.pb")
	public static int field1462;

	@ObfuscatedName("jc.vb")
	public static IfType field1468;

	@ObfuscatedName("jc.yb")
	public static int field1471;

	@ObfuscatedName("k.M")
	public static Pix8 field1524;

	@ObfuscatedName("kb.k")
	public static int field1551;

	@ObfuscatedName("kb.m")
	public static PixMap field1553;

	@ObfuscatedName("kb.o")
	public static Js5 field1555;

	@ObfuscatedName("kb.p")
	public static int[] field1556;

	@ObfuscatedName("kb.r")
	public static PixMap field1558;

	@ObfuscatedName("kb.t")
	public static int[] field1560;

	@ObfuscatedName("kc.n")
	public static Pix32[] field1578;

	@ObfuscatedName("kc.s")
	public static Js5 field1583;

	@ObfuscatedName("kc.z")
	public static int field1590;

	@ObfuscatedName("kd.a")
	public static Pix8 field1598;

	@ObfuscatedName("ab.hb")
	public static boolean[][] field160;

	@ObfuscatedName("kd.E")
	public static int field1628;

	@ObfuscatedName("l.h")
	public static class129 field1651;

	@ObfuscatedName("la.h")
	public static boolean field1662;

	@ObfuscatedName("la.n")
	public static BufferedRandomAccessFile field1668;

	@ObfuscatedName("la.I")
	public static PixMap field1689;

	@ObfuscatedName("la.L")
	public static class129 field1692;

	@ObfuscatedName("ld.z")
	public static int field1746;

	@ObfuscatedName("ld.B")
	public static int field1748;

	@ObfuscatedName("ac.P")
	public static Pix32[] field178;

	@ObfuscatedName("ma.db")
	public static PixMap field1780;

	@ObfuscatedName("mb.f")
	public static HashTable field1795;

	@ObfuscatedName("mb.X")
	public static int field1839;

	@ObfuscatedName("ac.V")
	public static int field184;

	@ObfuscatedName("mb.ab")
	public static int[] field1842;

	@ObfuscatedName("mb.bb")
	public static long field1843;

	@ObfuscatedName("mb.db")
	public static Pix8 field1845;

	@ObfuscatedName("mc.z")
	public static Pix8 field1871;

	@ObfuscatedName("mc.A")
	public static byte[][][] field1872;

	@ObfuscatedName("md.xb")
	public static Pix32[] field1886;

	@ObfuscatedName("md.Gb")
	public static int field1895;

	@ObfuscatedName("md.Lb")
	public static int field1900;

	@ObfuscatedName("md.Mb")
	public static Js5 field1901;

	@ObfuscatedName("n.t")
	public static Pix32[] field1926;

	@ObfuscatedName("na.g")
	public static PixMap field1935;

	@ObfuscatedName("na.l")
	public static int field1940;

	@ObfuscatedName("nb.wc")
	public static int[] field1985;

	@ObfuscatedName("nb.dd")
	public static Js5 field2018;

	@ObfuscatedName("nb.jd")
	public static Js5 field2024;

	@ObfuscatedName("nc.j")
	public static PixMap field2044;

	@ObfuscatedName("nc.k")
	public static PixMap field2045;

	@ObfuscatedName("nc.u")
	public static Pix32 field2055;

	@ObfuscatedName("oa.f")
	public static byte[][][] field2131;

	@ObfuscatedName("oa.z")
	public static int[] field2151;

	@ObfuscatedName("ad.D")
	public static class14 field217;

	@ObfuscatedName("oe.b")
	public static int[][] field2170;

	@ObfuscatedName("oe.s")
	public static Pix8 field2187;

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
	public static Pix32 field2277;

	@ObfuscatedName("pb.k")
	public static int field2281;

	@ObfuscatedName("ae.f")
	public static int[] field229;

	@ObfuscatedName("pb.u")
	public static int[] field2291;

	@ObfuscatedName("pc.a")
	public static int field2306;

	@ObfuscatedName("pe.xb")
	public static Huffman field2357;

	@ObfuscatedName("pe.Yb")
	public static boolean field2384;

	@ObfuscatedName("ae.p")
	public static int field239;

	@ObfuscatedName("qb.k")
	public static Packet field2415;

	@ObfuscatedName("qc.i")
	public static Js5 field2433;

	@ObfuscatedName("qc.m")
	public static int field2437;

	@ObfuscatedName("r.l")
	public static int[] field2570;

	@ObfuscatedName("r.C")
	public static PixMap field2587;

	@ObfuscatedName("r.D")
	public static int[] field2588;

	@ObfuscatedName("ra.l")
	public static int[] field2600;

	@ObfuscatedName("ra.p")
	public static int field2604;

	@ObfuscatedName("ra.r")
	public static JagString[] field2606;

	@ObfuscatedName("ra.t")
	public static PixMap field2608;

	@ObfuscatedName("rb.sb")
	public static Packet field2613;

	@ObfuscatedName("rb.tb")
	public static Pix8[] field2614;

	@ObfuscatedName("rb.Ab")
	public static ClientPlayer field2621;

	@ObfuscatedName("rc.g")
	public static byte[][] field2633;

	@ObfuscatedName("rd.C")
	public static Pix8 field2686;

	@ObfuscatedName("re.o")
	public static PixMap field2701;

	@ObfuscatedName("sa.g")
	public static Pix8 field2731;

	@ObfuscatedName("sa.u")
	public static Pix8 field2745;

	@ObfuscatedName("sc.sb")
	public static int[] field2747;

	@ObfuscatedName("sc.ub")
	public static int field2749;

	@ObfuscatedName("sc.vb")
	public static int field2750;

	@ObfuscatedName("sd.p")
	public static class129 field2769;

	@ObfuscatedName("sd.q")
	public static Pix8 field2770;

	@ObfuscatedName("sd.r")
	public static int[] field2771;

	@ObfuscatedName("ba.Jb")
	public static Pix8 field279;

	@ObfuscatedName("se.v")
	public static byte[][] field2794;

	@ObfuscatedName("se.A")
	public static Js5 field2799;

	@ObfuscatedName("t.ub")
	public static Pix8 field2806;

	@ObfuscatedName("t.vb")
	public static Pix8[] field2807;

	@ObfuscatedName("t.yb")
	public static Js5 field2810;

	@ObfuscatedName("ta.Mb")
	public static int field2846;

	@ObfuscatedName("ta.rc")
	public static int field2877;

	@ObfuscatedName("ta.zc")
	public static int field2885;

	@ObfuscatedName("tb.Wb")
	public static PixMap field2899;

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
	public static Pix8 field2919;

	@ObfuscatedName("ba.Wb")
	public static int[] field292;

	@ObfuscatedName("tc.i")
	public static int field2920;

	@ObfuscatedName("tc.k")
	public static IfType[][] field2922;

	@ObfuscatedName("tc.s")
	public static int[] field2930;

	@ObfuscatedName("td.n")
	public static int field2945;

	@ObfuscatedName("td.r")
	public static int field2949;

	@ObfuscatedName("te.rb")
	public static Js5 field2966;

	@ObfuscatedName("u.pb")
	public static int field2985;

	@ObfuscatedName("a.D")
	public static LruCache field30;

	@ObfuscatedName("ua.w")
	public static PixMap field3021;

	@ObfuscatedName("ua.A")
	public static int[] field3025;

	@ObfuscatedName("ub.j")
	public static long field3036;

	@ObfuscatedName("ub.u")
	public static long field3047;

	@ObfuscatedName("ub.A")
	public static byte[][][] field3053;

	@ObfuscatedName("uc.F")
	public static IfType field3068;

	@ObfuscatedName("bb.a")
	public static MidiStream field311;

	@ObfuscatedName("vb.xb")
	public static Pix8 field3134;

	@ObfuscatedName("vb.Cb")
	public static int[] field3139;

	@ObfuscatedName("vb.Db")
	public static int field3140;

	@ObfuscatedName("bb.f")
	public static int field316;

	@ObfuscatedName("vc.v")
	public static Js5 field3167;

	@ObfuscatedName("vd.yd")
	public static boolean field3180;

	@ObfuscatedName("vd.Md")
	public static int[] field3194;

	@ObfuscatedName("bb.j")
	public static int[] field320;

	@ObfuscatedName("wa.b")
	public static PixMap field3208;

	@ObfuscatedName("wb.d")
	public static Js5 field3244;

	@ObfuscatedName("wb.f")
	public static int[] field3246;

	@ObfuscatedName("wc.o")
	public static boolean[] field3296;

	@ObfuscatedName("wc.q")
	public static PixMap field3298;

	@ObfuscatedName("wc.r")
	public static PrivilegedRequest field3299;

	@ObfuscatedName("bd.e")
	public static Pix8[] field365;

	@ObfuscatedName("bd.S")
	public static int field405;

	@ObfuscatedName("bd.Z")
	public static int[][][] field412;

	@ObfuscatedName("ca.j")
	public static Js5 field458;

	@ObfuscatedName("ca.n")
	public static long field462;

	@ObfuscatedName("ca.o")
	public static int field463;

	@ObfuscatedName("ca.u")
	public static FontMetrics field469;

	@ObfuscatedName("ca.v")
	public static Pix32[] field470;

	@ObfuscatedName("ca.x")
	public static PixMap field472;

	@ObfuscatedName("cb.x")
	public static Js5 field503;

	@ObfuscatedName("a.Y")
	public static Js5 field51;

	@ObfuscatedName("cc.Gb")
	public static PixMap field522;

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

	@ObfuscatedName("d.Fc")
	public static int field661;

	@ObfuscatedName("dc.gb")
	public static Pix32[] field680;

	@ObfuscatedName("dc.yb")
	public static Js5 field698;

	@ObfuscatedName("dd.d")
	public static IfType field704;

	@ObfuscatedName("dd.h")
	public static MouseTracking field708;

	@ObfuscatedName("dd.i")
	public static int field709;

	@ObfuscatedName("dd.o")
	public static PrivilegedRequest field715;

	@ObfuscatedName("de.s")
	public static Pix8 field739;

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
	public static TextureProvider field771;

	@ObfuscatedName("eb.Lb")
	public static int field773;

	@ObfuscatedName("eb.Mb")
	public static int field774;

	@ObfuscatedName("eb.Pb")
	public static int field777;

	@ObfuscatedName("aa.Id")
	public static byte[] field78;

	@ObfuscatedName("ec.vb")
	public static Pix32 field784;

	@ObfuscatedName("ec.Ib")
	public static BufferedRandomAccessFile field797;

	@ObfuscatedName("ec.Lb")
	public static Pix8[] field800;

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
	public static PixMap field843;

	@ObfuscatedName("f.r")
	public static PixMap field844;

	@ObfuscatedName("fa.fb")
	public static Pix32 field851;

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
	public static Js5 field924;

	@ObfuscatedName("fd.tb")
	public static PixMap field925;

	@ObfuscatedName("fd.zb")
	public static DataFile field931;

	@ObfuscatedName("fd.Hb")
	public static Js5 field939;

	@ObfuscatedName("fe.Jc")
	public static class104 field967;

	@ObfuscatedName("fe.Qc")
	public static int field974;

	@ObfuscatedName("fe.Rc")
	public static int field975;

	@ObfuscatedName("g.i")
	public static int field986;

	@ObfuscatedName("g.p")
	public static PixMap field993;

	@ObfuscatedName("g.v")
	public static Js5 field999;
	@ObfuscatedName("aa.ce")
	public static JagString field98 = JagString.wrap("Spieler kann nicht gefunden werden: ");
	@ObfuscatedName("aa.fe")
	public static JagString field101 = JagString.wrap("green:");
	@ObfuscatedName("aa.ud")
	public static JagString field64 = field101;
	@ObfuscatedName("aa.Hd")
	public static JagString field77 = JagString.wrap("Mitteilung");
	@ObfuscatedName("aa.Nd")
	public static JagString field83 = JagString.wrap("Bitte starten Sie eine Mitgliedschaft");
	@ObfuscatedName("aa.xd")
	public static JagString field67 = JagString.wrap("Try again in 60 secs)3)3)3");
	@ObfuscatedName("aa.Yd")
	public static JagString field94 = field67;
	@ObfuscatedName("aa.Xd")
	public static JagString field93 = JagString.wrap("Keine Antwort vom Anmelde)2Server)3");
	@ObfuscatedName("oa.b")
	public static JagString field2127 = JagString.wrap("We suspect someone knows your password)3");
	@ObfuscatedName("oa.n")
	public static JagString field2139 = field2127;
	@ObfuscatedName("oa.c")
	public static JagString field2128 = JagString.wrap("Unable to connect)3");
	@ObfuscatedName("oa.o")
	public static JagString field2140 = field2128;
	@ObfuscatedName("oa.j")
	public static JagString field2135 = field2128;
	@ObfuscatedName("oa.h")
	public static JagString field2133 = JagString.wrap(" has logged in)3");
	@ObfuscatedName("oa.a")
	public static JagString field2126 = field2133;
	@ObfuscatedName("oa.p")
	public static JagString field2141 = JagString.wrap("Lade Konfiguration )2 ");
	@ObfuscatedName("oa.r")
	public static JagString field2143 = JagString.wrap("Loaded config");
	@ObfuscatedName("oa.m")
	public static JagString field2138 = field2143;
	@ObfuscatedName("oa.y")
	public static JagString field2150 = JagString.wrap("Existing user");
	@ObfuscatedName("oa.x")
	public static JagString field2149 = field2150;
	@ObfuscatedName("a.gb")
	public static JagString field59 = JagString.wrap("Diese Welt ist voll)3");
	@ObfuscatedName("a.jb")
	public static JagString field62 = JagString.wrap("chatback");
	@ObfuscatedName("a.w")
	public static JagString field23 = JagString.wrap("scrollbar");
	@ObfuscatedName("a.K")
	public static JagString field37 = JagString.wrap("Private chat");
	@ObfuscatedName("a.W")
	public static JagString field49 = field37;
	@ObfuscatedName("a.S")
	public static JagString field45 = JagString.wrap("purple:");
	@ObfuscatedName("a.kb")
	public static JagString field63 = field45;
	@ObfuscatedName("a.V")
	public static JagString field48 = JagString.wrap("Der Anmelde)2Server ist offline)3");
	@ObfuscatedName("ac.I")
	public static JagString field172 = JagString.wrap("Name eingeben:");
	@ObfuscatedName("ac.X")
	public static JagString field186 = JagString.wrap("Login server offline)3");
	@ObfuscatedName("ac.U")
	public static JagString field183 = field186;
	@ObfuscatedName("bd.T")
	public static JagString field406 = JagString.wrap("backbase2");
	@ObfuscatedName("bd.U")
	public static JagString field407 = JagString.wrap("Please try again)3");
	@ObfuscatedName("bd.V")
	public static JagString field408 = field407;
	@ObfuscatedName("bd.W")
	public static JagString field409 = JagString.wrap("Sie befinden sich in einem Mitglieder)2Gebiet(Q");
	@ObfuscatedName("u.hb")
	public static JagString field2977 = JagString.wrap("blinken1:");
	@ObfuscatedName("u.ib")
	public static JagString field2978 = JagString.wrap("Offline");
	@ObfuscatedName("u.kb")
	public static JagString field2980 = JagString.wrap("Freunde");
	@ObfuscatedName("u.xb")
	public static JagString field2993 = JagString.wrap("Das ist eine Mitglieder)2Welt(Q");
	@ObfuscatedName("u.zb")
	public static JagString field2995 = JagString.wrap(" zuerst von Ihrer Freunde)2Liste(Q");
	@ObfuscatedName("nd.a")
	public static JagString field2060 = JagString.wrap("");
	@ObfuscatedName("nd.X")
	public static JagString field2109 = field2060;
	@ObfuscatedName("nd.O")
	public static JagString field2100 = field2060;
	@ObfuscatedName("nd.H")
	public static JagString field2093 = field2060;
	@ObfuscatedName("nd.Y")
	public static JagString field2110 = field2060;
	@ObfuscatedName("nd.L")
	public static JagString field2097 = field2060;
	@ObfuscatedName("nd.E")
	public static JagString field2090 = field2060;
	@ObfuscatedName("nd.F")
	public static JagString field2091 = field2060;
	@ObfuscatedName("nd.I")
	public static JagString field2094 = field2060;
	@ObfuscatedName("nd.D")
	public static JagString field2089 = field2060;
	@ObfuscatedName("nd.x")
	public static JagString field2083 = field2060;
	@ObfuscatedName("nd.U")
	public static JagString field2106 = field2060;
	@ObfuscatedName("nd.P")
	public static JagString field2101 = field2060;
	@ObfuscatedName("nd.K")
	public static JagString field2096 = field2060;
	@ObfuscatedName("nd.Z")
	public static JagString field2111 = field2060;
	@ObfuscatedName("nd.A")
	public static JagString field2086 = field2060;
	@ObfuscatedName("nd.R")
	public static JagString field2103 = field2060;
	@ObfuscatedName("nd.C")
	public static JagString field2088 = field2060;
	@ObfuscatedName("nd.S")
	public static JagString field2104 = field2060;
	@ObfuscatedName("nd.J")
	public static JagString field2095 = field2060;
	@ObfuscatedName("nd.G")
	public static JagString field2092 = field2060;
	@ObfuscatedName("nd.w")
	public static JagString field2082 = field2060;
	@ObfuscatedName("nd.v")
	public static JagString field2081 = field2060;
	@ObfuscatedName("nd.u")
	public static JagString field2080 = field2060;
	@ObfuscatedName("nd.t")
	public static JagString field2079 = field2060;
	@ObfuscatedName("nd.s")
	public static JagString field2078 = field2060;
	@ObfuscatedName("nd.o")
	public static JagString field2074 = field2060;
	@ObfuscatedName("nd.l")
	public static JagString field2071 = field2060;
	@ObfuscatedName("nd.i")
	public static JagString field2068 = field2060;
	@ObfuscatedName("nd.h")
	public static JagString field2067 = field2060;
	@ObfuscatedName("nd.g")
	public static JagString field2066 = field2060;
	@ObfuscatedName("nd.c")
	public static JagString field2062 = field2060;
	@ObfuscatedName("nd.bb")
	public static JagString field2113 = field2060;
	@ObfuscatedName("nd.b")
	public static JagString field2061 = field2060;
	@ObfuscatedName("nd.ab")
	public static JagString field2112 = JagString.wrap(")3");
	@ObfuscatedName("nd.j")
	public static JagString field2069 = JagString.wrap("@gr2@");
	@ObfuscatedName("nd.k")
	public static JagString field2070 = JagString.wrap(" zuerst von Ihrer Ignorieren)2Liste(Q");
	@ObfuscatedName("nd.q")
	public static JagString field2076 = JagString.wrap("white:");
	@ObfuscatedName("nd.r")
	public static JagString field2077 = field2076;
	@ObfuscatedName("nd.z")
	public static JagString field2085 = JagString.wrap(":chalreq:");
	@ObfuscatedName("nd.Q")
	public static JagString field2102 = JagString.wrap("scrollen:");
	@ObfuscatedName("pb.i")
	public static JagString field2279 = JagString.wrap("Bitte entfernen Sie ");
	@ObfuscatedName("pb.A")
	public static JagString field2297 = JagString.wrap("(U2");
	@ObfuscatedName("pb.D")
	public static JagString field2300 = JagString.wrap("cyan:");
	@ObfuscatedName("pb.z")
	public static JagString field2296 = field2300;
	@ObfuscatedName("pb.B")
	public static JagString field2298 = JagString.wrap("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");
	@ObfuscatedName("pb.C")
	public static JagString field2299 = JagString.wrap("Name des Gegenstands eingeben:");
	@ObfuscatedName("pb.H")
	public static JagString field2304 = JagString.wrap("Texturen geladen)3");
	@ObfuscatedName("pb.I")
	public static JagString field2305 = JagString.wrap("m");
	@ObfuscatedName("ld.E")
	public static JagString field1751 = JagString.wrap("title)3jpg");
	@ObfuscatedName("ld.y")
	public static JagString field1745 = JagString.wrap("Ignorieren");
	@ObfuscatedName("wc.s")
	public static JagString field3300 = JagString.wrap(" is already on your ignore list");
	@ObfuscatedName("wc.n")
	public static JagString field3295 = field3300;
	@ObfuscatedName("wc.v")
	public static JagString field3303 = JagString.wrap("Loaded title screen");
	@ObfuscatedName("wc.x")
	public static JagString field3305 = field3303;
	@ObfuscatedName("wc.y")
	public static JagString field3306 = JagString.wrap("@or2@");
	@ObfuscatedName("wc.z")
	public static JagString field3307 = JagString.wrap("Cancel");
	@ObfuscatedName("wc.u")
	public static JagString field3302 = field3307;
	@ObfuscatedName("g.l")
	public static JagString field989 = JagString.wrap("(Z");
	@ObfuscatedName("g.w")
	public static JagString field1000 = JagString.wrap("Public chat");
	@ObfuscatedName("g.C")
	public static JagString field1006 = field1000;
	@ObfuscatedName("g.B")
	public static JagString field1005 = JagString.wrap("@gr3@");
	@ObfuscatedName("fa.gb")
	public static JagString field852 = JagString.wrap("Schrifts-=tze geladen)3");
	@ObfuscatedName("fa.ib")
	public static JagString field854 = JagString.wrap("Verbindung mit Freunde)2Server)3)3)3");
	@ObfuscatedName("fa.nb")
	public static JagString field859 = JagString.wrap("m-Ochte sich mit Ihnen duellieren)3");
	@ObfuscatedName("fa.rb")
	public static JagString field863 = JagString.wrap("Please try using a different world)3");
	@ObfuscatedName("fa.tb")
	public static JagString field865 = field863;
	@ObfuscatedName("fa.qb")
	public static JagString field862 = field863;
	@ObfuscatedName("fa.pb")
	public static JagString field861 = field863;
	@ObfuscatedName("fa.mb")
	public static JagString field858 = field863;
	@ObfuscatedName("fa.jb")
	public static JagString field855 = field863;
	@ObfuscatedName("fa.eb")
	public static JagString field850 = field863;
	@ObfuscatedName("ad.B")
	public static JagString field215 = JagString.wrap("Konfig geladen)3");
	@ObfuscatedName("ad.I")
	public static JagString field222 = JagString.wrap("Continue");
	@ObfuscatedName("ad.E")
	public static JagString field218 = field222;
	@ObfuscatedName("ad.H")
	public static JagString field221 = JagString.wrap("(X");
	@ObfuscatedName("ae.d")
	public static JagString field227 = JagString.wrap("wishes to trade with you)3");
	@ObfuscatedName("ae.h")
	public static JagString field231 = field227;
	@ObfuscatedName("ae.e")
	public static JagString field228 = JagString.wrap("::hiddenbuttontest");
	@ObfuscatedName("ae.i")
	public static JagString field232 = JagString.wrap("Einloggen");
	@ObfuscatedName("ae.k")
	public static JagString field234 = JagString.wrap("mapdots");
	@ObfuscatedName("ba.mc")
	public static JagString field308 = JagString.wrap("Too many incorrect logins from your address)3");
	@ObfuscatedName("ba.hc")
	public static JagString field303 = field308;
	@ObfuscatedName("ba.oc")
	public static JagString field310 = JagString.wrap("Ausw-=hlen");
	@ObfuscatedName("bb.h")
	public static JagString field318 = JagString.wrap("backvmid3");
	@ObfuscatedName("bb.n")
	public static JagString field324 = JagString.wrap("red:");
	@ObfuscatedName("bb.p")
	public static JagString field326 = field324;
	@ObfuscatedName("bb.o")
	public static JagString field325 = JagString.wrap("mapmarker");
	@ObfuscatedName("bb.r")
	public static JagString field328 = JagString.wrap(" )2> @lre@");
	@ObfuscatedName("bb.v")
	public static JagString field332 = JagString.wrap("Please contact customer support)3");
	@ObfuscatedName("bb.e")
	public static JagString field315 = field332;
	@ObfuscatedName("be.cb")
	public static JagString field414 = JagString.wrap("Ung-Ultiges Anmelde)2Paket)3");
	@ObfuscatedName("be.gb")
	public static JagString field418 = JagString.wrap("Lade Spiel)2Fenster )2 ");
	@ObfuscatedName("be.tb")
	public static JagString field431 = JagString.wrap("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
	@ObfuscatedName("ca.g")
	public static JagString field455 = JagString.wrap("backright1");
	@ObfuscatedName("ca.l")
	public static JagString field460 = JagString.wrap("Unexpected loginserver response)3");
	@ObfuscatedName("ca.d")
	public static JagString field452 = field460;
	@ObfuscatedName("ca.q")
	public static JagString field465 = JagString.wrap("You have only just left another world)3");
	@ObfuscatedName("ca.t")
	public static JagString field468 = field465;
	@ObfuscatedName("ca.s")
	public static JagString field467 = JagString.wrap("Duell akzeptieren");
	@ObfuscatedName("ca.y")
	public static JagString field473 = JagString.wrap("runes");
	@ObfuscatedName("ca.C")
	public static JagString field477 = JagString.wrap("_");
	@ObfuscatedName("ca.z")
	public static JagString field474 = JagString.wrap("welle2:");
	@ObfuscatedName("ca.E")
	public static JagString field479 = JagString.wrap("");
	@ObfuscatedName("ca.D")
	public static JagString field478 = JagString.wrap("backhmid2");
	@ObfuscatedName("cb.g")
	public static JagString field486 = JagString.wrap("Drop");
	@ObfuscatedName("cb.h")
	public static JagString field487 = field486;
	@ObfuscatedName("cb.t")
	public static JagString field499 = JagString.wrap("Ung-Ultiger Benutzername");
	@ObfuscatedName("cb.v")
	public static JagString field501 = JagString.wrap("@or1@");
	@ObfuscatedName("cb.w")
	public static JagString field502 = JagString.wrap("Please check your message)2centre for details)3");
	@ObfuscatedName("cb.r")
	public static JagString field497 = field502;
	@ObfuscatedName("cb.A")
	public static JagString field506 = JagString.wrap("Classic");
	@ObfuscatedName("cb.B")
	public static JagString field507 = field506;
	@ObfuscatedName("cb.z")
	public static JagString field505 = JagString.wrap("RuneScape wird geladen )2 bitte warten)3)3)3");
	@ObfuscatedName("cc.Kb")
	public static JagString field526 = JagString.wrap("Lade Ignorieren)2Liste)3)3)3");
	@ObfuscatedName("cc.Ib")
	public static JagString field524 = JagString.wrap(" )2> @cya@");
	@ObfuscatedName("cc.Eb")
	public static JagString field520 = JagString.wrap("To");
	@ObfuscatedName("cc.Fb")
	public static JagString field521 = field520;
	@ObfuscatedName("cd.e")
	public static JagString field533 = JagString.wrap("backhmid1");
	@ObfuscatedName("cd.j")
	public static JagString field538 = JagString.wrap("Geben Sie Ihren Benutzernamen");
	@ObfuscatedName("cd.m")
	public static JagString field541 = JagString.wrap("The server is being updated)3");
	@ObfuscatedName("cd.k")
	public static JagString field539 = field541;
	@ObfuscatedName("cd.s")
	public static JagString field547 = JagString.wrap("Neuer Benutzer");
	@ObfuscatedName("d.ec")
	public static JagString field634 = JagString.wrap("Regeln versto-8en hat)3");
	@ObfuscatedName("d.mc")
	public static JagString field642 = JagString.wrap("Jun");
	@ObfuscatedName("d.pc")
	public static JagString field645 = JagString.wrap("Nov");
	@ObfuscatedName("d.rc")
	public static JagString field647 = JagString.wrap("Mar");
	@ObfuscatedName("d.sc")
	public static JagString field648 = JagString.wrap("Jul");
	@ObfuscatedName("d.Qb")
	public static JagString field620 = JagString.wrap("Feb");
	@ObfuscatedName("d.Wb")
	public static JagString field626 = JagString.wrap("Aug");
	@ObfuscatedName("d.Ub")
	public static JagString field624 = JagString.wrap("Dec");
	@ObfuscatedName("d.zc")
	public static JagString field655 = JagString.wrap("May");
	@ObfuscatedName("d.Dc")
	public static JagString field659 = JagString.wrap("Loading wordpack )2 ");
	@ObfuscatedName("d.Pc")
	public static JagString field671 = field659;
	@ObfuscatedName("d.Sb")
	public static JagString field622 = JagString.wrap("Oct");
	@ObfuscatedName("d.Lc")
	public static JagString field667 = JagString.wrap("Connecting to server)3)3)3");
	@ObfuscatedName("d.Kc")
	public static JagString field666 = field667;
	@ObfuscatedName("d.Nc")
	public static JagString field669 = JagString.wrap("Jan");
	@ObfuscatedName("d.Tb")
	public static JagString field623 = JagString.wrap("Sep");
	@ObfuscatedName("d.Qc")
	public static JagString field672 = JagString.wrap("Apr");
	@ObfuscatedName("d.Rb")
	public static JagString[] field621 = new JagString[] { field669, field620, field647, field672, field655, field642, field648, field626, field623, field622, field645, field624 };
	@ObfuscatedName("dc.cb")
	public static JagString field676 = JagString.wrap("::fpson");
	@ObfuscatedName("dd.b")
	public static JagString field702 = JagString.wrap("und Ihr Passwort ein)3");
	@ObfuscatedName("dd.c")
	public static JagString field703 = JagString.wrap("Benutzeroberfl-=che geladen)3");
	@ObfuscatedName("dd.e")
	public static JagString field705 = JagString.wrap("Enter name of player to delete from list");
	@ObfuscatedName("dd.t")
	public static JagString field720 = field705;
	@ObfuscatedName("dd.f")
	public static JagString field706 = JagString.wrap("Privater Chat");
	@ObfuscatedName("dd.g")
	public static JagString field707 = JagString.wrap("Sprites geladen)3");
	@ObfuscatedName("dd.l")
	public static JagString field712 = JagString.wrap("Classic");
	@ObfuscatedName("dd.m")
	public static JagString field713 = JagString.wrap(":  ");
	@ObfuscatedName("dd.n")
	public static JagString field714 = JagString.wrap("Unable to find ");
	@ObfuscatedName("dd.r")
	public static JagString field718 = field714;
	@ObfuscatedName("dd.p")
	public static JagString field716 = JagString.wrap("Lade Benutzeroberfl-=che )2 ");
	@ObfuscatedName("dd.q")
	public static JagString field717 = JagString.wrap("zur-Uck auf die RuneScape)2Webseite gehen");
	@ObfuscatedName("dd.s")
	public static JagString field719 = JagString.wrap("lila:");
	@ObfuscatedName("de.e")
	public static JagString field725 = JagString.wrap("Enter name of friend to delete from list");
	@ObfuscatedName("de.r")
	public static JagString field738 = field725;
	@ObfuscatedName("de.l")
	public static JagString field732 = JagString.wrap("Unerwartete Antwort vom Anmelde)2Server)3");
	@ObfuscatedName("de.m")
	public static JagString field733 = JagString.wrap("Loading friend list");
	@ObfuscatedName("de.f")
	public static JagString field726 = field733;
	@ObfuscatedName("de.w")
	public static JagString field743 = JagString.wrap("oder ung-Ultiges Passwort)3");
	@ObfuscatedName("ec.tb")
	public static JagString field782 = JagString.wrap("Loading textures )2 ");
	@ObfuscatedName("ec.Eb")
	public static JagString field793 = field782;
	@ObfuscatedName("ec.Ab")
	public static JagString field789 = JagString.wrap("::noclip");
	@ObfuscatedName("ec.Gb")
	public static JagString field795 = JagString.wrap("Nehmen");
	@ObfuscatedName("ec.Cb")
	public static JagString field791 = JagString.wrap("Verbindung konnte nicht hergestellt werden)3");
	@ObfuscatedName("ec.Jb")
	public static JagString field798 = JagString.wrap("Loaded input handler");
	@ObfuscatedName("ec.Hb")
	public static JagString field796 = field798;
	@ObfuscatedName("ec.Bb")
	public static JagString field790 = JagString.wrap("W-=hlen Sie eine Option");
	@ObfuscatedName("ec.Qb")
	public static JagString field805 = JagString.wrap(" )2> @yel@");
	@ObfuscatedName("ec.Nb")
	public static JagString field802 = JagString.wrap("level)2");
	@ObfuscatedName("ec.wb")
	public static JagString field785 = field802;
	@ObfuscatedName("ec.Vb")
	public static JagString field810 = JagString.wrap("leuchten3:");
	@ObfuscatedName("f.e")
	public static JagString field831 = JagString.wrap("Loading sprites )2 ");
	@ObfuscatedName("f.g")
	public static JagString field833 = field831;
	@ObfuscatedName("f.f")
	public static JagString field832 = JagString.wrap("as it was used to break our rules)3");
	@ObfuscatedName("f.j")
	public static JagString field836 = field832;
	@ObfuscatedName("f.l")
	public static JagString field838 = JagString.wrap("Willkommen auf RuneScape");
	@ObfuscatedName("f.t")
	public static JagString field846 = JagString.wrap(":0");
	@ObfuscatedName("fc.sb")
	public static JagString field889 = JagString.wrap("Malformed login packet)3");
	@ObfuscatedName("fc.Db")
	public static JagString field900 = field889;
	@ObfuscatedName("fc.tb")
	public static JagString field890 = JagString.wrap("Zu viele Anmelde)2Versuche von Ihrer Adresse");
	@ObfuscatedName("fc.Fb")
	public static JagString field902 = JagString.wrap("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
	@ObfuscatedName("fd.vb")
	public static JagString field927 = JagString.wrap("Login");
	@ObfuscatedName("fd.ub")
	public static JagString field926 = field927;
	@ObfuscatedName("fd.Kb")
	public static JagString field942 = JagString.wrap("Please subscribe)1 or use a different world)3");
	@ObfuscatedName("fd.Ab")
	public static JagString field932 = field942;
	@ObfuscatedName("fd.xb")
	public static JagString field929 = JagString.wrap("Unerwartete Antwort vom Anmelde)2Server");
	@ObfuscatedName("fe.Ec")
	public static JagString field962 = JagString.wrap("Aus");
	@ObfuscatedName("fe.Nc")
	public static JagString field971 = JagString.wrap("Please wait)3)3)3");
	@ObfuscatedName("fe.zc")
	public static JagString field957 = field971;
	@ObfuscatedName("fe.Tc")
	public static JagString field977 = JagString.wrap("da dieser Computer gegen unsere ");
	@ObfuscatedName("fe.Sc")
	public static JagString field976 = JagString.wrap("oder benutzen Sie eine andere Welt)3");
	@ObfuscatedName("ga.cb")
	public static JagString field1044 = JagString.wrap("Verbindung abgebrochen)3");
	@ObfuscatedName("ga.eb")
	public static JagString field1046 = JagString.wrap("Password: ");
	@ObfuscatedName("ga.V")
	public static JagString field1037 = field1046;
	@ObfuscatedName("ga.v")
	public static JagString field1011 = JagString.wrap("T");
	@ObfuscatedName("ga.B")
	public static JagString[] field1017 = new JagString[100];
	@ObfuscatedName("ga.F")
	public static JagString field1021 = JagString.wrap("This computers address has been blocked");
	@ObfuscatedName("ga.I")
	public static JagString field1024 = field1021;
	@ObfuscatedName("ga.C")
	public static JagString field1018 = JagString.wrap("Enter your username (V password)3");
	@ObfuscatedName("ga.O")
	public static JagString field1030 = field1018;
	@ObfuscatedName("ga.G")
	public static JagString field1022 = JagString.wrap("welle:");
	@ObfuscatedName("ga.Y")
	public static JagString field1040 = JagString.wrap("Loaded interfaces");
	@ObfuscatedName("ga.P")
	public static JagString field1031 = field1040;
	@ObfuscatedName("ga.U")
	public static JagString field1036 = JagString.wrap("Please wait 5 minutes before trying again)3");
	@ObfuscatedName("ga.bb")
	public static JagString field1043 = field1036;
	@ObfuscatedName("ga.S")
	public static JagString field1034 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("ga.Z")
	public static JagString field1041 = JagString.wrap("Report abuse");
	@ObfuscatedName("ga.W")
	public static JagString field1038 = field1041;
	@ObfuscatedName("gb.j")
	public static JagString field1056 = JagString.wrap("titlebutton");
	@ObfuscatedName("gb.s")
	public static JagString field1065 = JagString.wrap(": ");
	@ObfuscatedName("gb.u")
	public static JagString field1067 = JagString.wrap("Gegenstand f-Ur Mitglieder");
	@ObfuscatedName("gb.v")
	public static JagString field1068 = JagString.wrap("Invalid username or password)3");
	@ObfuscatedName("gb.D")
	public static JagString field1076 = field1068;
	@ObfuscatedName("gb.E")
	public static JagString field1077 = JagString.wrap("blinken3:");
	@ObfuscatedName("gb.A")
	public static JagString field1073 = JagString.wrap("oberen Rand der Webseite ausw-=hlen)3");
	@ObfuscatedName("gb.G")
	public static JagString field1079 = JagString.wrap("Begeben Sie sich in ein freies Gebiet)1 um");
	@ObfuscatedName("h.cc")
	public static JagString field1118 = JagString.wrap("Unexpected server response");
	@ObfuscatedName("h.Ac")
	public static JagString field1142 = field1118;
	@ObfuscatedName("h.lc")
	public static JagString field1127 = JagString.wrap("Versteckt");
	@ObfuscatedName("h.rc")
	public static JagString field1133 = JagString.wrap("(X100(U(Y");
	@ObfuscatedName("h.Db")
	public static JagString field1093 = JagString.wrap("Please wait 1 minute and try again)3");
	@ObfuscatedName("h.Vb")
	public static JagString field1111 = field1093;
	@ObfuscatedName("h.ec")
	public static JagString field1120 = field1093;
	@ObfuscatedName("h.Ab")
	public static JagString field1090 = JagString.wrap("Moderator option: Mute player for 48 hours: <ON>");
	@ObfuscatedName("h.Eb")
	public static JagString field1094 = field1090;
	@ObfuscatedName("h.Tb")
	public static JagString field1109 = JagString.wrap("Loaded fonts");
	@ObfuscatedName("h.Mb")
	public static JagString field1102 = field1109;
	@ObfuscatedName("h.Ib")
	public static JagString field1098 = JagString.wrap("Checking for updates )2 ");
	@ObfuscatedName("h.Qb")
	public static JagString field1106 = field1098;
	@ObfuscatedName("ha.d")
	public static JagString field1147 = JagString.wrap("Lade Sprites )2 ");
	@ObfuscatedName("ha.g")
	public static JagString field1150 = JagString.wrap("Regelversto-8 melden");
	@ObfuscatedName("ha.h")
	public static JagString field1151 = JagString.wrap("Select");
	@ObfuscatedName("ha.i")
	public static JagString field1152 = field1151;
	@ObfuscatedName("hb.fb")
	public static JagString field1160 = JagString.wrap(")1");
	@ObfuscatedName("hb.lb")
	public static JagString field1166 = JagString.wrap("(U5");
	@ObfuscatedName("hb.ob")
	public static JagString field1169 = JagString.wrap("redstone1");
	@ObfuscatedName("hb.qb")
	public static JagString field1171 = JagString.wrap("Fallen lassen");
	@ObfuscatedName("hc.c")
	public static JagString field1175 = JagString.wrap("M");
	@ObfuscatedName("hc.l")
	public static JagString field1184 = field1175;
	@ObfuscatedName("hc.h")
	public static JagString field1180 = JagString.wrap("Angreifen");
	@ObfuscatedName("hc.p")
	public static JagString field1188 = JagString.wrap("Your account is already logged in)3");
	@ObfuscatedName("hc.b")
	public static JagString field1174 = field1188;
	@ObfuscatedName("hd.sb")
	public static JagString field1191 = JagString.wrap(":duelreq:");
	@ObfuscatedName("hd.Fb")
	public static JagString field1204 = JagString.wrap("@yel@*V");
	@ObfuscatedName("hd.yb")
	public static JagString field1197 = JagString.wrap("Enter name:");
	@ObfuscatedName("hd.Eb")
	public static JagString field1203 = field1197;
	@ObfuscatedName("hd.Ab")
	public static JagString field1199 = JagString.wrap("scroll:");
	@ObfuscatedName("hd.wb")
	public static JagString field1195 = field1199;
	@ObfuscatedName("hd.Pb")
	public static JagString field1214 = JagString.wrap(" steht bereits auf Ihrer Ignorieren)2Liste(Q");
	@ObfuscatedName("hd.Rb")
	public static JagString field1216 = JagString.wrap("From");
	@ObfuscatedName("hd.Qb")
	public static JagString field1215 = field1216;
	@ObfuscatedName("hd.Tb")
	public static JagString field1218 = JagString.wrap("Error connecting to server)3");
	@ObfuscatedName("hd.Ub")
	public static JagString field1219 = field1218;
	@ObfuscatedName("hd.Vb")
	public static JagString field1220 = JagString.wrap("RuneScape has been updated(Q");
	@ObfuscatedName("hd.Sb")
	public static JagString field1217 = field1220;
	@ObfuscatedName("he.Ab")
	public static JagString field1229 = JagString.wrap(":tradereq:");
	@ObfuscatedName("he.Jb")
	public static JagString field1238 = JagString.wrap("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");
	@ObfuscatedName("he.Qb")
	public static JagString field1245 = JagString.wrap("titlebox");
	@ObfuscatedName("he.Db")
	public static JagString field1232 = JagString.wrap("Bitte versuchen Sie es erneut)3");
	@ObfuscatedName("he.Pb")
	public static JagString field1244 = JagString.wrap("sch-Utteln:");
	@ObfuscatedName("i.e")
	public static JagString field1259 = JagString.wrap("l");
	@ObfuscatedName("i.j")
	public static JagString field1264 = JagString.wrap("Ung-Ultige Session)2ID)3");
	@ObfuscatedName("i.o")
	public static JagString field1269 = JagString.wrap("und die Schaltfl-=che (WSpielkonto erstellen(W am");
	@ObfuscatedName("i.u")
	public static JagString field1275 = JagString.wrap(" (X");
	@ObfuscatedName("ia.Ub")
	public static JagString field1309 = JagString.wrap("(Udns");
	@ObfuscatedName("ia.yc")
	public static JagString field1339 = JagString.wrap("blaugr-Un:");
	@ObfuscatedName("ia.Cc")
	public static JagString field1343 = JagString.wrap(": ");
	@ObfuscatedName("ib.a")
	public static JagString field1345 = JagString.wrap("Freund hinzuf-Ugen");
	@ObfuscatedName("id.h")
	public static JagString field1367 = JagString.wrap("Connecting to update server");
	@ObfuscatedName("id.c")
	public static JagString field1362 = field1367;
	@ObfuscatedName("id.t")
	public static JagString field1379 = JagString.wrap("Add friend");
	@ObfuscatedName("id.e")
	public static JagString field1364 = field1379;
	@ObfuscatedName("id.w")
	public static JagString field1382 = JagString.wrap("blinken2:");
	@ObfuscatedName("id.x")
	public static JagString field1383 = JagString.wrap("@red@");
	@ObfuscatedName("id.y")
	public static JagString field1384 = null;
	@ObfuscatedName("id.A")
	public static JagString field1386 = JagString.wrap("Verbindung mit Update)2Server)3)3)3");
	@ObfuscatedName("id.C")
	public static JagString field1388 = JagString.wrap("huffman");
	@ObfuscatedName("ie.e")
	public static JagString field1393 = JagString.wrap("@whi@");
	@ObfuscatedName("ie.f")
	public static JagString field1394 = JagString.wrap("World");
	@ObfuscatedName("ie.s")
	public static JagString field1407 = field1394;
	@ObfuscatedName("ie.h")
	public static JagString field1396 = JagString.wrap("skill)2");
	@ObfuscatedName("ie.d")
	public static JagString field1392 = field1396;
	@ObfuscatedName("ie.n")
	public static JagString field1402 = JagString.wrap("Weiter");
	@ObfuscatedName("ie.o")
	public static JagString field1403 = JagString.wrap("Untersuchen");
	@ObfuscatedName("ie.p")
	public static JagString field1404 = JagString.wrap("gelb:");
	@ObfuscatedName("ie.r")
	public static JagString field1406 = JagString.wrap("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");
	@ObfuscatedName("j.dc")
	public static JagString field1429 = JagString.wrap("Accept challenge");
	@ObfuscatedName("j.gc")
	public static JagString field1432 = field1429;
	@ObfuscatedName("j.ec")
	public static JagString field1430 = JagString.wrap("Okay");
	@ObfuscatedName("j.ic")
	public static JagString field1434 = JagString.wrap("Loaded gamescreen");
	@ObfuscatedName("j.fc")
	public static JagString field1431 = field1434;
	@ObfuscatedName("j.kc")
	public static JagString field1436 = JagString.wrap("Bitte laden Sie die Seite neu)3");
	@ObfuscatedName("j.lc")
	public static JagString field1437 = JagString.wrap("");
	@ObfuscatedName("j.nc")
	public static JagString field1439 = JagString.wrap("Absender:");
	@ObfuscatedName("j.oc")
	public static JagString field1440 = JagString.wrap("mapfunction");
	@ObfuscatedName("jc.gb")
	public static JagString field1453 = JagString.wrap("p11_full");
	@ObfuscatedName("jc.ib")
	public static JagString field1455 = JagString.wrap("No matching objects found)1 please shorten search");
	@ObfuscatedName("jc.cb")
	public static JagString field1449 = field1455;
	@ObfuscatedName("jc.ob")
	public static JagString field1461 = JagString.wrap("overlay_multiway");
	@ObfuscatedName("jc.tb")
	public static JagString field1466 = JagString.wrap("hitmarks");
	@ObfuscatedName("jc.Ab")
	public static JagString field1473 = JagString.wrap("Press (Wchange your password(W on front page)3");
	@ObfuscatedName("jc.qb")
	public static JagString field1463 = field1473;
	@ObfuscatedName("je.cc")
	public static JagString field1500 = JagString.wrap(" )2> @whi@");
	@ObfuscatedName("je.fc")
	public static JagString field1503 = JagString.wrap("Wen m-Ochten Sie hinzuf-Ugen?");
	@ObfuscatedName("je.Jb")
	public static JagString field1481 = JagString.wrap("Could not complete login)3");
	@ObfuscatedName("je.ac")
	public static JagString field1498 = field1481;
	@ObfuscatedName("je.Pb")
	public static JagString field1487 = JagString.wrap("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");
	@ObfuscatedName("je.Ob")
	public static JagString field1486 = JagString.wrap("Members object");
	@ObfuscatedName("je.dc")
	public static JagString field1501 = field1486;
	@ObfuscatedName("je.Tb")
	public static JagString field1491 = JagString.wrap("Too many connections from your address)3");
	@ObfuscatedName("je.Kb")
	public static JagString field1482 = field1491;
	@ObfuscatedName("je.Wb")
	public static JagString field1494 = JagString.wrap("Lade Eingabe)2Steuerungsprogramm)3)3)3");
	@ObfuscatedName("k.y")
	public static JagString field1511 = JagString.wrap(" has logged out)3");
	@ObfuscatedName("k.x")
	public static JagString field1510 = field1511;
	@ObfuscatedName("k.L")
	public static JagString field1523 = null;
	@ObfuscatedName("k.R")
	public static JagString field1529 = JagString.wrap("Attack");
	@ObfuscatedName("k.N")
	public static JagString field1525 = JagString.wrap("Loaded sprites");
	@ObfuscatedName("k.K")
	public static JagString field1522 = field1529;
	@ObfuscatedName("k.O")
	public static JagString field1526 = JagString.wrap("b12_full");
	@ObfuscatedName("k.P")
	public static JagString field1527 = field1525;
	@ObfuscatedName("kb.i")
	public static JagString field1549 = JagString.wrap("shake:");
	@ObfuscatedName("kb.e")
	public static JagString field1545 = field1549;
	@ObfuscatedName("kb.v")
	public static JagString field1562 = JagString.wrap("k");
	@ObfuscatedName("kb.w")
	public static JagString field1563 = JagString.wrap("Your profile will be transferred in:");
	@ObfuscatedName("kb.u")
	public static JagString field1561 = field1563;
	@ObfuscatedName("kb.x")
	public static JagString field1564 = JagString.wrap("Prepared visibility map");
	@ObfuscatedName("kb.q")
	public static JagString field1557 = field1564;
	@ObfuscatedName("kc.b")
	public static JagString field1566 = JagString.wrap("Loading game screen )2 ");
	@ObfuscatedName("kc.G")
	public static JagString field1597 = field1566;
	@ObfuscatedName("kc.c")
	public static JagString field1567 = JagString.wrap("invback");
	@ObfuscatedName("kc.h")
	public static JagString field1572 = JagString.wrap(")2");
	@ObfuscatedName("kc.l")
	public static JagString field1576 = JagString.wrap("sich mit einer anderen Welt zu verbinden)3");
	@ObfuscatedName("kc.q")
	public static JagString field1581 = JagString.wrap("und loggen sich dann erneut ein)3");
	@ObfuscatedName("kc.r")
	public static JagString field1582 = JagString.wrap("Offline");
	@ObfuscatedName("kc.C")
	public static JagString field1593 = field1582;
	@ObfuscatedName("kc.A")
	public static JagString field1591 = JagString.wrap("Take");
	@ObfuscatedName("kc.D")
	public static JagString field1594 = field1591;
	@ObfuscatedName("kd.h")
	public static JagString field1605 = null;
	@ObfuscatedName("kd.n")
	public static JagString field1611 = JagString.wrap("Anmelde)2Limit -Uberschritten)3");
	@ObfuscatedName("kd.u")
	public static JagString field1618 = JagString.wrap("Bitte warten Sie eine Minute");
	@ObfuscatedName("kd.I")
	public static JagString field1632 = JagString.wrap("Die Adresse dieses Computers wurde gesperrt)1");
	@ObfuscatedName("kd.H")
	public static JagString field1631 = JagString.wrap("null");
	@ObfuscatedName("kd.y")
	public static JagString field1622 = JagString.wrap("Hier klicken)1 um fortzufahren)3)3)3");
	@ObfuscatedName("kd.B")
	public static JagString field1625 = JagString.wrap("null");
	@ObfuscatedName("l.b")
	public static JagString field1645 = JagString.wrap("@or3@");
	@ObfuscatedName("l.c")
	public static JagString field1646 = JagString.wrap("mapscene");
	@ObfuscatedName("l.f")
	public static JagString field1649 = JagString.wrap(" x");
	@ObfuscatedName("la.g")
	public static JagString field1661 = JagString.wrap("*6n");
	@ObfuscatedName("la.s")
	public static JagString field1673 = JagString.wrap("(U(Y");
	@ObfuscatedName("la.t")
	public static JagString field1674 = JagString.wrap("Trade)4compete");
	@ObfuscatedName("la.v")
	public static JagString field1676 = field1674;
	@ObfuscatedName("la.E")
	public static JagString field1685 = JagString.wrap("Off");
	@ObfuscatedName("la.c")
	public static JagString field1657 = field1685;
	@ObfuscatedName("la.K")
	public static JagString field1691 = JagString.wrap("scape main");
	@ObfuscatedName("m.c")
	public static JagString field1756 = JagString.wrap("Cabbage");
	@ObfuscatedName("m.e")
	public static JagString field1758 = JagString.wrap("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");
	@ObfuscatedName("m.l")
	public static JagString field1765 = JagString.wrap("::");
	@ObfuscatedName("m.u")
	public static JagString field1774 = JagString.wrap(")1");
	@ObfuscatedName("m.v")
	public static JagString field1775 = JagString.wrap("Loading config )2 ");
	@ObfuscatedName("m.i")
	public static JagString field1762 = field1775;
	@ObfuscatedName("m.w")
	public static JagString field1776 = JagString.wrap("Spiel)2Engine wird gestartet)3)3)3");
	@ObfuscatedName("m.x")
	public static JagString field1777 = JagString.wrap("No response from server)3");
	@ObfuscatedName("m.y")
	public static JagString field1778 = field1777;
	@ObfuscatedName("ma.hb")
	public static JagString field1784 = JagString.wrap("Loading interfaces )2 ");
	@ObfuscatedName("ma.mb")
	public static JagString field1789 = field1784;
	@ObfuscatedName("ma.ib")
	public static JagString field1785 = JagString.wrap("Fertigkeit)2");
	@ObfuscatedName("ma.jb")
	public static JagString field1786 = JagString.wrap("Mem:");
	@ObfuscatedName("ma.kb")
	public static JagString field1787 = JagString.wrap("Loaded update list");
	@ObfuscatedName("ma.fb")
	public static JagString field1782 = field1787;
	@ObfuscatedName("mb.e")
	public static JagString field1794 = JagString.wrap("m-Ochte mit Ihnen handeln)3");
	@ObfuscatedName("mb.A")
	public static JagString field1816 = JagString.wrap("Click to continue");
	@ObfuscatedName("mb.D")
	public static JagString field1819 = field1816;
	@ObfuscatedName("mb.S")
	public static JagString field1834 = JagString.wrap("Press (Wrecover a locked account(W on front page)3");
	@ObfuscatedName("mb.r")
	public static JagString field1807 = field1834;
	@ObfuscatedName("mb.Y")
	public static JagString field1840 = JagString.wrap("Suche nach Updates )2 ");
	@ObfuscatedName("mc.b")
	public static JagString field1847 = JagString.wrap("Enter object name");
	@ObfuscatedName("mc.C")
	public static JagString field1874 = field1847;
	@ObfuscatedName("mc.g")
	public static JagString field1852 = JagString.wrap("null");
	@ObfuscatedName("mc.h")
	public static JagString field1853 = JagString.wrap("Wen m-Ochten Sie der Liste hinzuf-Ugen?");
	@ObfuscatedName("mc.m")
	public static JagString field1858 = JagString.wrap("Handel)4Duell");
	@ObfuscatedName("mc.r")
	public static JagString field1863 = JagString.wrap("Enter message to send to ");
	@ObfuscatedName("mc.B")
	public static JagString field1873 = field1863;
	@ObfuscatedName("mc.y")
	public static JagString field1870 = JagString.wrap("und haben es deaktiviert)3 Benutzen Sie die");
	@ObfuscatedName("md.ub")
	public static JagString field1883 = JagString.wrap("Welt");
	@ObfuscatedName("md.Ab")
	public static JagString field1889 = JagString.wrap("flash2:");
	@ObfuscatedName("md.wb")
	public static JagString field1885 = field1889;
	@ObfuscatedName("md.Nb")
	public static JagString field1902 = JagString.wrap(" million");
	@ObfuscatedName("md.Hb")
	public static JagString field1896 = field1902;
	@ObfuscatedName("n.b")
	public static JagString field1908 = JagString.wrap("Bitte benutzen Sie eine andere Welt)3");
	@ObfuscatedName("n.i")
	public static JagString field1915 = JagString.wrap("Ein kostenloses Spielkonto erstellen)3");
	@ObfuscatedName("n.n")
	public static JagString field1920 = JagString.wrap("Ihre Nachricht an: ");
	@ObfuscatedName("n.q")
	public static JagString field1923 = JagString.wrap("Please close the interface you have open before using (Wreport abuse(W");
	@ObfuscatedName("n.o")
	public static JagString field1921 = field1923;
	@ObfuscatedName("n.s")
	public static JagString field1925 = JagString.wrap("@gr1@");
	@ObfuscatedName("n.u")
	public static JagString field1927 = JagString.wrap("weiss:");
	@ObfuscatedName("n.v")
	public static JagString field1928 = JagString.wrap("Wir vermuten ihr Spielkonto wurde gestohlen");
	@ObfuscatedName("na.a")
	public static JagString field1929 = JagString.wrap("mod_icons");
	@ObfuscatedName("na.f")
	public static JagString field1934 = JagString.wrap(" seconds)3");
	@ObfuscatedName("na.c")
	public static JagString field1931 = field1934;
	@ObfuscatedName("na.h")
	public static JagString field1936 = JagString.wrap("No reply from loginserver)3");
	@ObfuscatedName("na.b")
	public static JagString field1930 = field1936;
	@ObfuscatedName("na.j")
	public static JagString field1938 = JagString.wrap("(U1");
	@ObfuscatedName("na.n")
	public static JagString field1942 = JagString.wrap(" )2>");
	@ObfuscatedName("na.o")
	public static JagString field1943 = JagString.wrap("Add ignore");
	@ObfuscatedName("na.e")
	public static JagString field1933 = field1943;
	@ObfuscatedName("na.p")
	public static JagString field1944 = JagString.wrap("Entfernen");
	@ObfuscatedName("nb.dc")
	public static JagString field1966 = JagString.wrap("Loaded textures");
	@ObfuscatedName("nb.Jc")
	public static JagString field1998 = field1966;
	@ObfuscatedName("nb.nd")
	public static JagString field2028 = JagString.wrap("Lade Schrifts-=tze )2 ");
	@ObfuscatedName("nb.od")
	public static JagString field2029 = JagString.wrap("Please wait )2 attempting to reestablish");
	@ObfuscatedName("nb.sd")
	public static JagString field2033 = field2029;
	@ObfuscatedName("nb.rd")
	public static JagString field2032 = JagString.wrap("Registrierter Benutzer");
	@ObfuscatedName("nb.zc")
	public static JagString field1988 = JagString.wrap("Login limit exceeded)3");
	@ObfuscatedName("nb.Xc")
	public static JagString field2012 = field1988;
	@ObfuscatedName("nc.a")
	public static JagString field2035 = JagString.wrap(" steht bereits auf Ihrer Freunde)2Liste(Q");
	@ObfuscatedName("nc.b")
	public static JagString field2036 = JagString.wrap("Benutzen Sie bitte eine andere Welt)3");
	@ObfuscatedName("nc.c")
	public static JagString field2037 = JagString.wrap("Ok");
	@ObfuscatedName("nc.v")
	public static JagString field2056 = field2037;
	@ObfuscatedName("nc.m")
	public static JagString field2047 = JagString.wrap(" from your ignore list first");
	@ObfuscatedName("nc.t")
	public static JagString field2054 = field2047;
	@ObfuscatedName("nc.n")
	public static JagString field2048 = JagString.wrap("Spiel)2Fenster geladen)3");
	@ObfuscatedName("nc.q")
	public static JagString field2051 = JagString.wrap("Stufe)2");
	@ObfuscatedName("nc.r")
	public static JagString field2052 = JagString.wrap(" more options");
	@ObfuscatedName("nc.g")
	public static JagString field2041 = field2052;
	@ObfuscatedName("ob.h")
	public static JagString field2159 = JagString.wrap("flash1:");
	@ObfuscatedName("ob.f")
	public static JagString field2157 = field2159;
	@ObfuscatedName("ob.k")
	public static JagString field2162 = JagString.wrap("backleft2");
	@ObfuscatedName("ob.m")
	public static JagString field2164 = JagString.wrap("Schlie-8en");
	@ObfuscatedName("ob.n")
	public static JagString field2165 = JagString.wrap(":");
	@ObfuscatedName("oe.e")
	public static JagString field2173 = JagString.wrap("Please remove ");
	@ObfuscatedName("oe.j")
	public static JagString field2178 = field2173;
	@ObfuscatedName("oe.d")
	public static JagString field2172 = field2173;
	@ObfuscatedName("oe.f")
	public static JagString field2174 = JagString.wrap("System)2Update in: ");
	@ObfuscatedName("oe.m")
	public static JagString field2181 = JagString.wrap("(U");
	@ObfuscatedName("oe.o")
	public static JagString field2183 = JagString.wrap("null");
	@ObfuscatedName("pc.d")
	public static JagString field2309 = JagString.wrap("wave:");
	@ObfuscatedName("pc.l")
	public static JagString field2317 = field2309;
	@ObfuscatedName("pc.h")
	public static JagString field2313 = JagString.wrap("Prepared sound engine");
	@ObfuscatedName("pc.t")
	public static JagString field2325 = field2313;
	@ObfuscatedName("pc.j")
	public static JagString field2315 = JagString.wrap("Moderator option: Mute player for 48 hours: <OFF>");
	@ObfuscatedName("pc.c")
	public static JagString field2308 = field2315;
	@ObfuscatedName("pc.m")
	public static JagString field2318 = JagString.wrap("Loading fonts )2 ");
	@ObfuscatedName("pc.n")
	public static JagString field2319 = field2318;
	@ObfuscatedName("pc.o")
	public static JagString field2320 = JagString.wrap("Close");
	@ObfuscatedName("pc.e")
	public static JagString field2310 = field2320;
	@ObfuscatedName("pc.x")
	public static JagString field2329 = JagString.wrap("Ihr Spielkonto wurde deaktiviert)3");
	@ObfuscatedName("pc.B")
	public static JagString field2333 = JagString.wrap("mapback");
	@ObfuscatedName("pc.C")
	public static JagString field2334 = JagString.wrap("@lre@");
	@ObfuscatedName("pc.z")
	public static JagString field2331 = JagString.wrap(" ");
	@ObfuscatedName("pc.F")
	public static JagString field2337 = field2331;
	@ObfuscatedName("pc.D")
	public static JagString field2335 = JagString.wrap("Lade Freunde)2Liste)3)3)3");
	@ObfuscatedName("pc.E")
	public static JagString field2336 = JagString.wrap("Benutzen Sie die (WPasswort -=ndern(W Option");
	@ObfuscatedName("pe.vb")
	public static JagString field2355 = JagString.wrap("backvmid2");
	@ObfuscatedName("pe.zb")
	public static JagString field2359 = JagString.wrap("Anmelde)2Zeitlimit -Uberschritten)3");
	@ObfuscatedName("pe.Sb")
	public static JagString field2378 = JagString.wrap("Bitte versuchen Sie es in ");
	@ObfuscatedName("pe.Cb")
	public static JagString field2362 = JagString.wrap("K");
	@ObfuscatedName("pe.Ab")
	public static JagString field2360 = field2362;
	@ObfuscatedName("pe.ub")
	public static JagString field2354 = field2362;
	@ObfuscatedName("pe.Vb")
	public static JagString field2381 = JagString.wrap("Wen m-Ochten Sie entfernen?");
	@ObfuscatedName("pe.Xb")
	public static JagString field2383 = JagString.wrap("Bad session id)3");
	@ObfuscatedName("pe.Wb")
	public static JagString field2382 = field2383;
	@ObfuscatedName("qa.Eb")
	public static JagString field2401 = JagString.wrap("Hide");
	@ObfuscatedName("qa.wb")
	public static JagString field2393 = field2401;
	@ObfuscatedName("qa.xb")
	public static JagString field2394 = JagString.wrap("button near the top of that page)3");
	@ObfuscatedName("qa.Db")
	public static JagString field2400 = field2394;
	@ObfuscatedName("qa.Bb")
	public static JagString field2398 = JagString.wrap("yellow:");
	@ObfuscatedName("qa.ub")
	public static JagString field2391 = field2398;
	@ObfuscatedName("qb.b")
	public static JagString field2406 = JagString.wrap(" ");
	@ObfuscatedName("qb.d")
	public static JagString field2408 = JagString.wrap("Loading title screen )2 ");
	@ObfuscatedName("qb.c")
	public static JagString field2407 = field2408;
	@ObfuscatedName("qb.h")
	public static JagString field2412 = JagString.wrap("RuneScape is loading )2 please wait)3)3)3");
	@ObfuscatedName("qb.a")
	public static JagString field2405 = field2412;
	@ObfuscatedName("qb.p")
	public static JagString field2420 = JagString.wrap("M");
	@ObfuscatedName("qc.b")
	public static JagString field2426 = JagString.wrap("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");
	@ObfuscatedName("qc.e")
	public static JagString field2429 = JagString.wrap("An");
	@ObfuscatedName("qc.h")
	public static JagString field2432 = JagString.wrap("Empf-=nger:");
	@ObfuscatedName("qc.l")
	public static JagString field2436 = JagString.wrap("Bitte warten Sie)3)3)3");
	@ObfuscatedName("qc.n")
	public static JagString field2438 = JagString.wrap("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");
	@ObfuscatedName("qc.o")
	public static JagString field2439 = JagString.wrap("Loading ignore list");
	@ObfuscatedName("qc.g")
	public static JagString field2431 = field2439;
	@ObfuscatedName("qd.jd")
	public static JagString field2535 = JagString.wrap("@cr2@");
	@ObfuscatedName("qd.kc")
	public static JagString field2484 = JagString.wrap("Enter name of friend to add to list");
	@ObfuscatedName("qd.ud")
	public static JagString field2546 = field2484;
	@ObfuscatedName("qd.sc")
	public static JagString field2492 = JagString.wrap("Starting game engine)3)3)3");
	@ObfuscatedName("qd.gc")
	public static JagString field2480 = field2492;
	@ObfuscatedName("qd.vb")
	public static JagString field2443 = JagString.wrap("glow2:");
	@ObfuscatedName("qd.dc")
	public static JagString field2477 = field2443;
	@ObfuscatedName("qd.Mc")
	public static JagString field2512 = JagString.wrap("Choose Option");
	@ObfuscatedName("qd.qc")
	public static JagString field2490 = field2512;
	@ObfuscatedName("qd.xc")
	public static JagString field2497 = JagString.wrap("::errortest");
	@ObfuscatedName("qd.Wc")
	public static JagString field2522 = JagString.wrap("Fehler beim Laden Ihres Charakter)2Profils");
	@ObfuscatedName("r.b")
	public static JagString field2560 = JagString.wrap("Enter amount:");
	@ObfuscatedName("r.r")
	public static JagString field2576 = field2560;
	@ObfuscatedName("r.d")
	public static JagString field2562 = JagString.wrap("Passwort: ");
	@ObfuscatedName("r.e")
	public static JagString field2563 = JagString.wrap("Bitte wenden Sie sich an den Kundendienst)3");
	@ObfuscatedName("r.f")
	public static JagString field2564 = JagString.wrap("@gre@");
	@ObfuscatedName("r.g")
	public static JagString field2565 = JagString.wrap("glow1:");
	@ObfuscatedName("r.y")
	public static JagString field2583 = field2565;
	@ObfuscatedName("r.m")
	public static JagString field2571 = JagString.wrap("Your ignore list is full)3 Max of 100 hit");
	@ObfuscatedName("r.x")
	public static JagString field2582 = field2571;
	@ObfuscatedName("r.p")
	public static JagString field2574 = JagString.wrap("You are standing in a members)2only area)3");
	@ObfuscatedName("r.v")
	public static JagString field2580 = field2574;
	@ObfuscatedName("r.t")
	public static JagString field2578 = JagString.wrap("Loaded wordpack");
	@ObfuscatedName("r.q")
	public static JagString field2575 = field2578;
	@ObfuscatedName("r.A")
	public static JagString field2585 = JagString.wrap("");
	@ObfuscatedName("ra.m")
	public static JagString field2601 = JagString.wrap("(Y");
	@ObfuscatedName("ra.o")
	public static JagString field2603 = JagString.wrap("Enter name of player to add to list");
	@ObfuscatedName("ra.n")
	public static JagString field2602 = field2603;
	@ObfuscatedName("ra.u")
	public static JagString field2609 = JagString.wrap("Accept trade");
	@ObfuscatedName("ra.v")
	public static JagString field2610 = field2609;
	@ObfuscatedName("ra.w")
	public static JagString field2611 = JagString.wrap("glow3:");
	@ObfuscatedName("ra.j")
	public static JagString field2598 = field2611;
	@ObfuscatedName("ra.x")
	public static JagString field2612 = JagString.wrap("@cr1@");
	@ObfuscatedName("rc.c")
	public static JagString field2629 = JagString.wrap(" @whi@(X");
	@ObfuscatedName("rc.f")
	public static JagString field2632 = JagString.wrap("New User");
	@ObfuscatedName("rc.m")
	public static JagString field2639 = field2632;
	@ObfuscatedName("rc.r")
	public static JagString field2644 = JagString.wrap("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");
	@ObfuscatedName("rc.t")
	public static JagString field2646 = JagString.wrap("headicons_hint");
	@ObfuscatedName("rc.x")
	public static JagString field2650 = JagString.wrap("Connection timed out)3");
	@ObfuscatedName("rc.h")
	public static JagString field2634 = field2650;
	@ObfuscatedName("rc.B")
	public static JagString field2654 = JagString.wrap("Der Server wird gerade aktualisiert)3");
	@ObfuscatedName("rc.E")
	public static JagString field2657 = JagString.wrap("Lade Wordpack )2 ");
	@ObfuscatedName("rd.b")
	public static JagString field2659 = JagString.wrap("@whi@ )4 ");
	@ObfuscatedName("rd.e")
	public static JagString field2662 = JagString.wrap(" hat sich ausgeloggt)3");
	@ObfuscatedName("rd.n")
	public static JagString field2671 = JagString.wrap("and choose the (Wcreate account(W");
	@ObfuscatedName("rd.j")
	public static JagString field2667 = field2671;
	@ObfuscatedName("rd.s")
	public static JagString field2676 = JagString.wrap("go back to the main RuneScape webpage");
	@ObfuscatedName("rd.r")
	public static JagString field2675 = field2676;
	@ObfuscatedName("rd.v")
	public static JagString field2679 = JagString.wrap("nicht hergestellt werden)3");
	@ObfuscatedName("rd.y")
	public static JagString field2682 = JagString.wrap("backright2");
	@ObfuscatedName("rd.x")
	public static JagString field2681 = JagString.wrap("auf einer freien Welt zu spielen)3");
	@ObfuscatedName("rd.B")
	public static JagString field2685 = JagString.wrap("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");
	@ObfuscatedName("re.a")
	public static JagString field2687 = JagString.wrap("Benutzername: ");
	@ObfuscatedName("re.m")
	public static JagString field2699 = JagString.wrap("@yel@");
	@ObfuscatedName("re.n")
	public static JagString field2700 = JagString.wrap("compass");
	@ObfuscatedName("s.g")
	public static JagString field2708 = JagString.wrap("bevor Sie den Vorgang wiederholen)3");
	@ObfuscatedName("s.i")
	public static JagString field2710 = JagString.wrap("slide:");
	@ObfuscatedName("s.f")
	public static JagString field2707 = field2710;
	@ObfuscatedName("s.o")
	public static JagString field2716 = JagString.wrap("(U4");
	@ObfuscatedName("s.p")
	public static JagString field2717 = JagString.wrap("Invalid loginserver requested)3");
	@ObfuscatedName("s.m")
	public static JagString field2714 = field2717;
	@ObfuscatedName("sa.f")
	public static JagString field2730 = JagString.wrap(" weitere Optionen");
	@ObfuscatedName("sa.h")
	public static JagString field2732 = JagString.wrap("Zu viele Verbindungen von Ihrer Adresse)3");
	@ObfuscatedName("sd.g")
	public static JagString field2760 = JagString.wrap("To create a new account you need to");
	@ObfuscatedName("sd.d")
	public static JagString field2757 = field2760;
	@ObfuscatedName("sd.k")
	public static JagString field2764 = JagString.wrap("Ihr Spielkonto wird bereits benutzt)3");
	@ObfuscatedName("sd.l")
	public static JagString field2765 = JagString.wrap("This world is full)3");
	@ObfuscatedName("sd.j")
	public static JagString field2763 = field2765;
	@ObfuscatedName("sd.o")
	public static JagString field2768 = JagString.wrap("flash3:");
	@ObfuscatedName("sd.n")
	public static JagString field2767 = field2768;
	@ObfuscatedName("sd.s")
	public static JagString field2772 = JagString.wrap("0(U");
	@ObfuscatedName("se.k")
	public static JagString field2783 = JagString.wrap("::clientdrop");
	@ObfuscatedName("se.q")
	public static JagString field2789 = JagString.wrap("Message");
	@ObfuscatedName("se.f")
	public static JagString field2778 = field2789;
	@ObfuscatedName("se.z")
	public static JagString field2798 = JagString.wrap("backvmid1");
	@ObfuscatedName("se.D")
	public static JagString field2802 = JagString.wrap("Chat panel redrawn");
	@ObfuscatedName("t.sb")
	public static JagString field2804 = JagString.wrap("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");
	@ObfuscatedName("t.Ab")
	public static JagString field2812 = JagString.wrap(" Sekunde(Xn(Y -Ubertragen)3");
	@ObfuscatedName("t.Gb")
	public static JagString field2818 = JagString.wrap("sideicons");
	@ObfuscatedName("t.Jb")
	public static JagString field2821 = JagString.wrap("Friends");
	@ObfuscatedName("t.Fb")
	public static JagString field2817 = field2821;
	@ObfuscatedName("t.Lb")
	public static JagString field2823 = JagString.wrap("Examine");
	@ObfuscatedName("t.tb")
	public static JagString field2805 = field2823;
	@ObfuscatedName("t.Mb")
	public static JagString field2824 = JagString.wrap("Ihr Charakter)2Profil wird in:");
	@ObfuscatedName("tb.ac")
	public static JagString field2903 = JagString.wrap("Die Verbindung konnte");
	@ObfuscatedName("tb.hc")
	public static JagString field2910 = JagString.wrap("redstone2");
	@ObfuscatedName("tb.Yb")
	public static JagString field2901 = JagString.wrap("Sie haben gerade eine andere Welt verlassen)3");
	@ObfuscatedName("tc.l")
	public static JagString field2923 = JagString.wrap("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");
	@ObfuscatedName("tc.t")
	public static JagString field2931 = field2923;
	@ObfuscatedName("tc.o")
	public static JagString field2926 = JagString.wrap("Hidden");
	@ObfuscatedName("tc.q")
	public static JagString field2928 = field2926;
	@ObfuscatedName("tc.p")
	public static JagString field2927 = JagString.wrap("backbase1");
	@ObfuscatedName("td.b")
	public static JagString field2933 = JagString.wrap(",Zffentlicher Chat");
	@ObfuscatedName("td.i")
	public static JagString field2940 = JagString.wrap("auf der Hautpseite)3");
	@ObfuscatedName("td.j")
	public static JagString field2941 = JagString.wrap("Wen m-Ochten Sie von der Liste entfernen?");
	@ObfuscatedName("td.l")
	public static JagString field2943 = JagString.wrap("Error loading your profile)3");
	@ObfuscatedName("td.q")
	public static JagString field2948 = field2943;
	@ObfuscatedName("te.qb")
	public static JagString field2965 = JagString.wrap("headicons_pk");
	@ObfuscatedName("te.tb")
	public static JagString field2968 = JagString.wrap("::fpsoff");
	@ObfuscatedName("ua.g")
	public static JagString field3005 = JagString.wrap("Username: ");
	@ObfuscatedName("ua.d")
	public static JagString field3002 = field3005;
	@ObfuscatedName("ua.h")
	public static JagString field3006 = JagString.wrap("Ladevorgang )2 bitte warten Sie)3");
	@ObfuscatedName("ua.i")
	public static JagString field3007 = JagString.wrap("mapedge");
	@ObfuscatedName("ua.k")
	public static JagString field3009 = JagString.wrap("wishes to duel with you)3");
	@ObfuscatedName("ua.j")
	public static JagString field3008 = field3009;
	@ObfuscatedName("ua.s")
	public static JagString field3017 = JagString.wrap("null");
	@ObfuscatedName("ua.t")
	public static JagString field3018 = JagString.wrap("System update in: ");
	@ObfuscatedName("ua.n")
	public static JagString field3012 = field3018;
	@ObfuscatedName("ua.u")
	public static JagString field3019 = JagString.wrap("To play on this world move to a free area first");
	@ObfuscatedName("ua.c")
	public static JagString field3001 = field3019;
	@ObfuscatedName("ua.v")
	public static JagString field3020 = JagString.wrap("backleft1");
	@ObfuscatedName("ua.B")
	public static JagString field3026 = JagString.wrap("Fps:");
	@ObfuscatedName("ub.q")
	public static JagString field3043 = JagString.wrap("wave2:");
	@ObfuscatedName("ub.B")
	public static JagString field3054 = field3043;
	@ObfuscatedName("ub.r")
	public static JagString field3044 = JagString.wrap(" is already on your friend list");
	@ObfuscatedName("ub.s")
	public static JagString field3045 = field3044;
	@ObfuscatedName("ub.y")
	public static JagString field3051 = JagString.wrap("Lade Titelbild )2 ");
	@ObfuscatedName("uc.t")
	public static JagString field3056 = JagString.wrap("Please use a different world)3");
	@ObfuscatedName("uc.J")
	public static JagString field3072 = field3056;
	@ObfuscatedName("uc.v")
	public static JagString field3058 = JagString.wrap("");
	@ObfuscatedName("uc.w")
	public static JagString field3059 = JagString.wrap("@yel@*V");
	@ObfuscatedName("uc.E")
	public static JagString field3067 = JagString.wrap("");
	@ObfuscatedName("uc.O")
	public static JagString field3077 = field3067;
	@ObfuscatedName("uc.x")
	public static JagString field3060 = field3067;
	@ObfuscatedName("uc.z")
	public static JagString field3062 = field3067;
	@ObfuscatedName("uc.I")
	public static JagString field3071 = field3067;
	@ObfuscatedName("uc.s")
	public static JagString field3055 = field3067;
	@ObfuscatedName("uc.H")
	public static JagString field3070 = JagString.wrap("Benutzen");
	@ObfuscatedName("uc.B")
	public static JagString field3064 = JagString.wrap("Fehler bei der Verbindung zum Server)3");
	@ObfuscatedName("uc.D")
	public static JagString field3066 = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("uc.L")
	public static JagString field3074 = field3066;
	@ObfuscatedName("uc.N")
	public static JagString field3076 = JagString.wrap("Walk here");
	@ObfuscatedName("uc.u")
	public static JagString field3057 = field3076;
	@ObfuscatedName("va.gb")
	public static JagString field3111 = JagString.wrap("Service unavailable)3");
	@ObfuscatedName("va.xb")
	public static JagString field3128 = field3111;
	@ObfuscatedName("va.ib")
	public static JagString field3113 = JagString.wrap("rot:");
	@ObfuscatedName("va.kb")
	public static JagString field3115 = JagString.wrap("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
	@ObfuscatedName("va.nb")
	public static JagString field3118 = JagString.wrap("cross");
	@ObfuscatedName("va.pb")
	public static JagString field3120 = JagString.wrap("Musik)2Engine vorbereitet)3");
	@ObfuscatedName("va.tb")
	public static JagString field3124 = JagString.wrap("Titelbild geladen)3");
	@ObfuscatedName("va.ub")
	public static JagString field3125 = JagString.wrap(" hat sich eingeloggt)3");
	@ObfuscatedName("va.vb")
	public static JagString field3126 = JagString.wrap("You need a members account to login to this world)3");
	@ObfuscatedName("va.wb")
	public static JagString field3127 = field3126;
	@ObfuscatedName("vb.zb")
	public static JagString field3136 = JagString.wrap("@cya@");
	@ObfuscatedName("vb.Hb")
	public static JagString field3144 = JagString.wrap(" from your friend list first");
	@ObfuscatedName("vb.Bb")
	public static JagString field3138 = field3144;
	@ObfuscatedName("vb.Ib")
	public static JagString field3145 = JagString.wrap("Bitte versuchen Sie)1");
	@ObfuscatedName("vc.a")
	public static JagString field3146 = JagString.wrap("Your account has been disabled)3");
	@ObfuscatedName("vc.A")
	public static JagString field3172 = field3146;
	@ObfuscatedName("vc.c")
	public static JagString field3148 = JagString.wrap("Wordpack geladen)3");
	@ObfuscatedName("vc.f")
	public static JagString field3151 = JagString.wrap("Handel akzeptieren");
	@ObfuscatedName("vc.r")
	public static JagString field3163 = JagString.wrap("redstone3");
	@ObfuscatedName("vc.x")
	public static JagString field3169 = JagString.wrap("");
	@ObfuscatedName("vc.y")
	public static JagString field3170 = JagString.wrap("Menge eingeben:");
	@ObfuscatedName("vd.vd")
	public static JagString field3177 = null;
	@ObfuscatedName("vd.Cd")
	public static JagString field3184 = JagString.wrap("Sichtbare Karte vorbereitet)3");
	@ObfuscatedName("vd.Id")
	public static JagString field3190 = JagString.wrap("gr-Un:");
	@ObfuscatedName("vd.Jd")
	public static JagString field3191 = JagString.wrap("Hierhin gehen");
	@ObfuscatedName("vd.Hd")
	public static JagString field3189 = JagString.wrap("Keine Antwort vom Server)3");
	@ObfuscatedName("vd.xd")
	public static JagString field3179 = JagString.wrap("On");
	@ObfuscatedName("vd.Ld")
	public static JagString field3193 = field3179;
	@ObfuscatedName("vd.Od")
	public static JagString field3196 = JagString.wrap("Connection lost");
	@ObfuscatedName("vd.Fd")
	public static JagString field3187 = field3196;
	@ObfuscatedName("w.a")
	public static JagString field3197 = JagString.wrap("Abbrechen");
	@ObfuscatedName("w.f")
	public static JagString field3202 = JagString.wrap("Please reload this page)3");
	@ObfuscatedName("w.i")
	public static JagString field3205 = field3202;
	@ObfuscatedName("w.g")
	public static JagString field3203 = JagString.wrap(" x ");
	@ObfuscatedName("wa.e")
	public static JagString field3211 = JagString.wrap("Side panel redrawn");
	@ObfuscatedName("wa.g")
	public static JagString field3213 = JagString.wrap("Icons redrawn");
	@ObfuscatedName("wa.j")
	public static JagString field3216 = JagString.wrap("leuchten1:");
	@ObfuscatedName("wa.o")
	public static JagString field3221 = JagString.wrap("Connecting to friendserver");
	@ObfuscatedName("wa.m")
	public static JagString field3219 = field3221;
	@ObfuscatedName("wa.p")
	public static JagString field3222 = JagString.wrap("Remove");
	@ObfuscatedName("wa.G")
	public static JagString field3239 = field3222;
	@ObfuscatedName("wa.s")
	public static JagString field3225 = JagString.wrap("leuchten2:");
	@ObfuscatedName("wa.B")
	public static JagString field3234 = JagString.wrap("");
	@ObfuscatedName("wa.z")
	public static JagString field3232 = field3234;
	@ObfuscatedName("wa.x")
	public static JagString field3230 = field3234;
	@ObfuscatedName("wa.q")
	public static JagString field3223 = field3234;
	@ObfuscatedName("wa.k")
	public static JagString field3217 = field3234;
	@ObfuscatedName("wa.d")
	public static JagString field3210 = field3234;
	@ObfuscatedName("wa.c")
	public static JagString field3209 = field3234;
	@ObfuscatedName("wb.g")
	public static JagString field3247 = JagString.wrap("p12_full");
	@ObfuscatedName("wb.q")
	public static JagString field3257 = JagString.wrap("Create a free account");
	@ObfuscatedName("wb.y")
	public static JagString field3265 = field3257;
	@ObfuscatedName("wb.r")
	public static JagString field3258 = JagString.wrap("Update)2Liste geladen)3");
	@ObfuscatedName("wb.F")
	public static JagString field3272 = JagString.wrap("Loading )2 please wait)3");
	@ObfuscatedName("wb.l")
	public static JagString field3252 = field3272;
	@ObfuscatedName("wb.J")
	public static JagString field3276 = JagString.wrap("gleiten:");
	@ObfuscatedName("wb.K")
	public static JagString field3277 = JagString.wrap("(U3");
	@ObfuscatedName("wb.N")
	public static JagString field3280 = JagString.wrap("60 Sekunden noch einmal)3)3)3");
	@ObfuscatedName("wb.M")
	public static JagString field3279 = JagString.wrap("Lade Texturen )2 ");
	@ObfuscatedName("kb.a")
	public static byte[][] field1541 = new byte[50][];
	@ObfuscatedName("kb.g")
	public static LinkList field1547 = new LinkList();
	@ObfuscatedName("kb.h")
	public static int field1548 = 0;
	@ObfuscatedName("kb.n")
	public static int field1554 = 255;
	@ObfuscatedName("kb.s")
	public static int field1559 = 127;
	@ObfuscatedName("ha.a")
	public static int field1144 = 0;
	@ObfuscatedName("ha.b")
	public static int field1145 = 0;
	@ObfuscatedName("ha.k")
	public static int field1154 = 0;
	@ObfuscatedName("re.h")
	public static LinkList field2694 = new LinkList();
	@ObfuscatedName("ub.d")
	public static int field3030 = -1;
	@ObfuscatedName("ub.i")
	public static LruCache field3035 = new LruCache(50);
	@ObfuscatedName("ub.k")
	public static int field3037 = -1;
	@ObfuscatedName("ub.t")
	public static Pix32[] field3046 = new Pix32[1000];
	@ObfuscatedName("ub.x")
	public static int field3050 = 0;
	@ObfuscatedName("ub.z")
	public static int field3052 = 78;
	@ObfuscatedName("nc.i")
	public static boolean field2043 = false;
	@ObfuscatedName("nc.l")
	public static int field2046 = 0;
	@ObfuscatedName("fc.xb")
	public static int field894 = 0;
	@ObfuscatedName("fc.zb")
	public static int field896 = 0;
	@ObfuscatedName("fc.Bb")
	public static byte[][][] field898 = new byte[4][104][104];
	@ObfuscatedName("fc.Gb")
	public static int field903 = -1;
	@ObfuscatedName("fc.Lb")
	public static int[][][] field908 = new int[4][13][13];
	@ObfuscatedName("md.sb")
	public static int field1881 = -1;
	@ObfuscatedName("pe.Eb")
	public static boolean field2364 = false;
	@ObfuscatedName("pe.Jb")
	public static int[] field2369 = new int[50];
	@ObfuscatedName("pe.yb")
	public static int field2358 = 0;
	@ObfuscatedName("pe.Lb")
	public static LinkList field2371 = new LinkList();
	@ObfuscatedName("pe.Ub")
	public static int field2380 = 0;
	@ObfuscatedName("qd.vd")
	public static int field2547 = 0;
	@ObfuscatedName("ia.nc")
	public static HashTable field1328 = new HashTable(4096);
	@ObfuscatedName("ia.Bc")
	public static int field1342 = 0;
	@ObfuscatedName("ia.zc")
	public static int field1340 = 0;
	@ObfuscatedName("ia.Dc")
	public static long field1344 = 0L;
	@ObfuscatedName("ia.Ac")
	public static int field1341 = 0;
	@ObfuscatedName("h.kc")
	public static byte[] field1126 = new byte[520];
	@ObfuscatedName("h.Ob")
	public static int field1104 = 0;
	@ObfuscatedName("h.Yb")
	public static int field1114 = 0;
	@ObfuscatedName("h.Bc")
	public static int field1143 = -1;
	@ObfuscatedName("he.Ib")
	public static int field1237 = 0;
	@ObfuscatedName("ec.Mb")
	public static int field801 = 0;
	@ObfuscatedName("qa.vb")
	public static int field2392 = 0;
	@ObfuscatedName("qa.Cb")
	public static int field2399 = 0;
	@ObfuscatedName("qa.Ab")
	public static int[] field2397 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@ObfuscatedName("va.lb")
	public static boolean field3116 = false;
	@ObfuscatedName("t.wb")
	public static int[] field2808 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@ObfuscatedName("t.zb")
	public static int field2811 = 0;
	@ObfuscatedName("t.Bb")
	public static int field2813 = 0;
	@ObfuscatedName("t.xb")
	public static int field2809 = 0;
	@ObfuscatedName("t.Hb")
	public static int[] field2819 = new int[] { 16, 32, 64, 128 };
	@ObfuscatedName("t.Db")
	public static boolean field2815 = false;
	@ObfuscatedName("t.Kb")
	public static int field2822 = (int) (Math.random() * 17.0D) - 8;
	@ObfuscatedName("nb.id")
	public static int[] field2023 = new int[1000];
	@ObfuscatedName("nb.kd")
	public static int field2025 = (int) (Math.random() * 33.0D) - 16;
	@ObfuscatedName("nb.md")
	public static int field2027 = 0;
	@ObfuscatedName("nb.pd")
	public static ClientPlayer[] field2030 = new ClientPlayer[2048];
	@ObfuscatedName("nb.td")
	public static JagString[] field2034 = new JagString[100];
	@ObfuscatedName("nb.Ec")
	public static BigInteger field1993 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("j.hc")
	public static int field1433 = 0;
	@ObfuscatedName("j.pc")
	public static int field1441 = 1;
	@ObfuscatedName("vd.ud")
	public static int field3176 = 0;
	@ObfuscatedName("vd.Ed")
	public static int[] field3186 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	@ObfuscatedName("je.Lb")
	public static int[] field1483 = new int[25];
	@ObfuscatedName("je.Qb")
	public static boolean[] field1488 = new boolean[112];
	@ObfuscatedName("je.Ub")
	public static int field1492 = 0;
	@ObfuscatedName("je.Zb")
	public static int field1497 = -1;
	@ObfuscatedName("aa.ae")
	public static int field96 = 0;
	@ObfuscatedName("aa.Cd")
	public static int field72 = 0;
	@ObfuscatedName("d.cc")
	public static boolean[] field632 = new boolean[5];
	@ObfuscatedName("d.oc")
	public static int[] field644 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	@ObfuscatedName("d.Ac")
	public static int field656 = 0;
	@ObfuscatedName("ad.z")
	public static Object field213 = new Object();
	@ObfuscatedName("ad.C")
	public static int field216 = 0;
	@ObfuscatedName("ad.A")
	public static int field214 = -1;
	@ObfuscatedName("ad.G")
	public static byte[] field220 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	@ObfuscatedName("tb.Rb")
	public static int[][] field2894 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	@ObfuscatedName("vb.tb")
	public static JagString[] field3130 = new JagString[100];
	@ObfuscatedName("vb.vb")
	public static long field3132 = 0L;
	@ObfuscatedName("vb.Gb")
	public static int field3143 = 0;
	@ObfuscatedName("ld.f")
	public static PacketBit field1726 = new PacketBit(5000);
	@ObfuscatedName("ld.t")
	public static int[] field1740 = new int[] { 1, 2, 4, 8 };
	@ObfuscatedName("ld.C")
	public static int field1749 = 0;
	@ObfuscatedName("ld.G")
	public static int[] field1753 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };
	@ObfuscatedName("ld.D")
	public static int field1750 = 0;
	@ObfuscatedName("la.y")
	public static int field1679 = 0;
	@ObfuscatedName("la.C")
	public static int field1683 = -1;
	@ObfuscatedName("g.d")
	public static LruCache field981 = new LruCache(10);
	@ObfuscatedName("g.q")
	public static int[] field994 = new int[500];
	@ObfuscatedName("g.s")
	public static LinkList2 field996 = new LinkList2();
	@ObfuscatedName("g.u")
	public static int field998 = 0;
	@ObfuscatedName("g.x")
	public static boolean field1001 = false;
	@ObfuscatedName("g.A")
	public static int field1004 = 0;
	@ObfuscatedName("g.D")
	public static boolean field1007 = false;
	@ObfuscatedName("fa.lb")
	public static int field857 = 0;
	@ObfuscatedName("mc.j")
	public static int field1855 = 0;
	@ObfuscatedName("mc.l")
	public static int field1857 = 0;
	@ObfuscatedName("mc.o")
	public static int field1860 = 0;
	@ObfuscatedName("mc.p")
	public static boolean field1861 = false;
	@ObfuscatedName("mc.q")
	public static boolean field1862 = true;
	@ObfuscatedName("mc.s")
	public static int field1864 = 0;
	@ObfuscatedName("mc.t")
	public static int[] field1865 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	@ObfuscatedName("i.f")
	public static int field1260 = 0;
	@ObfuscatedName("i.q")
	public static boolean field1271 = false;
	@ObfuscatedName("i.y")
	public static int field1279 = -1;
	@ObfuscatedName("oa.k")
	public static LruCache field2136 = new LruCache(100);
	@ObfuscatedName("oa.s")
	public static int field2144 = 0;
	@ObfuscatedName("oa.u")
	public static int field2146 = 0;
	@ObfuscatedName("oa.w")
	public static int field2148 = 2;
	@ObfuscatedName("nd.d")
	public static int field2063 = 0;
	@ObfuscatedName("nd.y")
	public static int field2084 = 0;
	@ObfuscatedName("hb.eb")
	public static boolean field1159 = false;
	@ObfuscatedName("pb.n")
	public static LinkList field2284 = new LinkList();
	@ObfuscatedName("pb.y")
	public static int field2295 = 0;
	@ObfuscatedName("pb.E")
	public static Packet field2301 = new Packet(8);
	@ObfuscatedName("pb.G")
	public static int[] field2303 = new int[1000];
	@ObfuscatedName("pb.F")
	public static PlayerModel field2302 = new PlayerModel();
	@ObfuscatedName("kc.w")
	public static int field1587 = 0;
	@ObfuscatedName("kc.E")
	public static int[] field1595 = new int[] { 1, 0, -1, 0 };
	@ObfuscatedName("cb.i")
	public static PacketBit field488 = new PacketBit(5000);
	@ObfuscatedName("cb.s")
	public static int field498 = 0;
	@ObfuscatedName("cb.u")
	public static LruCache field500 = new LruCache(200);
	@ObfuscatedName("cb.y")
	public static boolean field504 = false;
	@ObfuscatedName("ac.J")
	public static int[] field173 = new int[32];
	@ObfuscatedName("ac.S")
	public static int[] field181 = new int[] { 0, -1, 0, 1 };
	@ObfuscatedName("ac.W")
	public static int field185 = 2;
	@ObfuscatedName("wc.a")
	public static LruCache field3282 = new LruCache(64);
	@ObfuscatedName("wc.d")
	public static int field3285 = 0;
	@ObfuscatedName("wc.i")
	public static int field3290 = 0;
	@ObfuscatedName("wc.p")
	public static int field3297 = 0;
	@ObfuscatedName("wc.t")
	public static int field3301 = 0;
	@ObfuscatedName("wc.w")
	public static int field3304 = 0;
	@ObfuscatedName("wb.i")
	public static LruCache field3249 = new LruCache(20);
	@ObfuscatedName("wb.m")
	public static int field3253 = -1;
	@ObfuscatedName("wb.o")
	public static int[] field3255 = new int[1000];
	@ObfuscatedName("wb.B")
	public static boolean field3268 = false;
	@ObfuscatedName("wb.L")
	public static LruCache field3278 = new LruCache(50);
	@ObfuscatedName("sa.l")
	public static class121[] field2736 = new class121[50];
	@ObfuscatedName("gb.i")
	public static boolean field1055 = false;
	@ObfuscatedName("gb.m")
	public static int field1059 = 0;
	@ObfuscatedName("gb.n")
	public static LruCache field1060 = new LruCache(64);
	@ObfuscatedName("gb.t")
	public static LruCache field1066 = new LruCache(64);
	@ObfuscatedName("gb.w")
	public static boolean field1069 = true;
	@ObfuscatedName("gb.z")
	public static int field1072 = -1;
	@ObfuscatedName("ba.ac")
	public static int field296 = 0;
	@ObfuscatedName("ba.cc")
	public static int field298 = 0;
	@ObfuscatedName("ba.ic")
	public static int[] field304 = new int[2000];
	@ObfuscatedName("ba.jb")
	public static LruCache field253 = new LruCache(100);
	@ObfuscatedName("ba.jc")
	public static int field305 = -1;
	@ObfuscatedName("ba.lc")
	public static int field307 = 0;
	@ObfuscatedName("ba.gc")
	public static int field302 = 0;
	@ObfuscatedName("fe.qc")
	public static int field948 = 1;
	@ObfuscatedName("fe.vc")
	public static boolean field953 = false;
	@ObfuscatedName("fe.Ac")
	public static long field958 = 0L;
	@ObfuscatedName("fe.xc")
	public static JagFX[] field955 = new JagFX[50];
	@ObfuscatedName("fe.Hc")
	public static int field965 = 0;
	@ObfuscatedName("fe.Gc")
	public static BigInteger field964 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("fe.Pc")
	public static int field973 = 0;
	@ObfuscatedName("bd.o")
	public static int[] field375 = new int[1000];
	@ObfuscatedName("bd.s")
	public static LruCache field379 = new LruCache(260);
	@ObfuscatedName("bd.X")
	public static boolean field410 = false;
	@ObfuscatedName("u.wb")
	public static ClientNpc[] field2992 = new ClientNpc[32768];
	@ObfuscatedName("u.Cb")
	public static int field2998 = -1;
	@ObfuscatedName("oe.g")
	public static int field2175 = 0;
	@ObfuscatedName("oe.k")
	public static byte[][] field2179 = new byte[250][];
	@ObfuscatedName("oe.l")
	public static int field2180 = 256;
	@ObfuscatedName("oe.n")
	public static int field2182 = 0;
	@ObfuscatedName("oe.t")
	public static int field2188 = -1;
	@ObfuscatedName("oe.u")
	public static int field2189 = 0;
	@ObfuscatedName("jc.lb")
	public static int[] field1458 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	@ObfuscatedName("jc.mb")
	public static int field1459 = 0;
	@ObfuscatedName("jc.xb")
	public static int field1470 = 0;
	@ObfuscatedName("jc.zb")
	public static int field1472 = 0;
	@ObfuscatedName("qb.e")
	public static int field2409 = 0;
	@ObfuscatedName("qb.f")
	public static int field2410 = 0;
	@ObfuscatedName("qb.q")
	public static int field2421 = -1;
	@ObfuscatedName("ga.D")
	public static int[] field1019 = new int[5];
	@ObfuscatedName("ga.E")
	public static int[] field1020 = new int[2000];
	@ObfuscatedName("a.n")
	public static int field14 = 0;
	@ObfuscatedName("a.J")
	public static int field36 = 0;
	@ObfuscatedName("k.C")
	public static int[] field1514 = new int[99];
	@ObfuscatedName("k.J")
	public static int[] field1521 = new int[50];
	@ObfuscatedName("k.Q")
	public static int field1528 = 0;
	@ObfuscatedName("na.d")
	public static int[] field1932 = new int[500];
	@ObfuscatedName("na.i")
	public static int[] field1937 = new int[128];
	@ObfuscatedName("na.m")
	public static boolean field1941 = false;
	@ObfuscatedName("wa.f")
	public static int field3212 = 0;
	@ObfuscatedName("wa.i")
	public static int field3215 = -1;
	@ObfuscatedName("wa.u")
	public static int field3227 = -1;
	@ObfuscatedName("wa.D")
	public static int[] field3236 = new int[100];

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field173[var1] = var0 - 1;
			var0 += var0;
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1514[var1] = var0 / 4;
		}
	}

	@ObfuscatedName("cd.a(I)V")
	public static void method274() {
		field547 = null;
		field539 = null;
		field533 = null;
		class17.field549 = null;
		class17.field552 = null;
		field538 = null;
		field541 = null;
		class17.field546 = null;
		class17.field548 = null;
	}

	@ObfuscatedName("cc.f(I)V")
	public static void method269() {
		field526 = null;
		field524 = null;
		field520 = null;
		field521 = null;
		field522 = null;
		ClientScript.field515 = null;
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
		field2301.field267 = 0;
		field2613 = null;
		class102.field2559 = 0;
		field967 = null;
		while (true) {
			class104 var2 = (class104) class78.field1917.method497();
			if (var2 == null) {
				while (true) {
					class104 var3 = (class104) BZip2State.field1831.method497();
					if (var3 == null) {
						if (class14.field476 != 0) {
							try {
								Packet var4 = new Packet(4);
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
								ClientScript.field525++;
							}
						}
						MidiStream.field1189 = 0;
						field2271 = currentTime();
						return;
					}
					field996.method613(var3);
					field1328.method498(var3, var3.field2073);
					field2144--;
					field1260++;
				}
			}
			class103.field2596.method498(var2, var2.field2073);
			class31.field845--;
			field3285++;
		}
	}

	@ObfuscatedName("fa.a(BLqd;La;)La;")
	public static JagString method386(IfType arg0, JagString arg1) {
		if (arg1.method11(field2181) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.method11(field1938);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.method11(field2297);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.method11(field3277);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.method11(field2716);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.method11(field1166);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.method11(field1309);
													if (var7 == -1) {
														return arg1;
													}
													JagString var8 = field3234;
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
													arg1 = JagString.join(new JagString[] { arg1.method19(0, var7), var8, arg1.method1(var7 + 4) });
												}
											}
											arg1 = JagString.join(new JagString[] { arg1.method19(0, var6), method973(method1039(4, arg0)), arg1.method1(var6 + 2) });
										}
									}
									arg1 = JagString.join(new JagString[] { arg1.method19(0, var5), method973(method1039(3, arg0)), arg1.method1(var5 + 2) });
								}
							}
							arg1 = JagString.join(new JagString[] { arg1.method19(0, var4), method973(method1039(2, arg0)), arg1.method1(var4 + 2) });
						}
					}
					arg1 = JagString.join(new JagString[] { arg1.method19(0, var3), method973(method1039(1, arg0)), arg1.method1(var3 + 2) });
				}
			}
			arg1 = JagString.join(new JagString[] { arg1.method19(0, var2), method973(method1039(0, arg0)), arg1.method1(var2 + 2) });
		}
	}

	@ObfuscatedName("gb.a(Lab;I[Lad;)V")
	public static void method425(World arg0, CollisionMap[] arg1) {
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 104; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					if ((field898[var2][var3][var4] & 0x1) == 1) {
						int var5 = var2;
						if ((field898[1][var3][var4] & 0x2) == 2) {
							var5 = var2 - 1;
						}
						if (var5 >= 0) {
							arg1[var5].method115(var4, var3);
						}
					}
				}
			}
		}
		field2822 += (int) (Math.random() * 5.0D) - 2;
		field2025 += (int) (Math.random() * 5.0D) - 2;
		if (field2822 < -8) {
			field2822 = -8;
		}
		if (field2822 > 8) {
			field2822 = 8;
		}
		if (field2025 < -16) {
			field2025 = -16;
		}
		if (field2025 > 16) {
			field2025 = 16;
		}
		for (int var6 = 0; var6 < 4; var6++) {
			byte[][] var7 = field1003[var6];
			int var8 = (int) Math.sqrt(5100.0D);
			int var9 = var8 * 768 >> 8;
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					int var12 = Client.field1451[var6][var11 + 1][var10] - Client.field1451[var6][var11 - 1][var10];
					int var13 = Client.field1451[var6][var11][var10 + 1] - Client.field1451[var6][var11][var10 - 1];
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
							FluType var25 = method317(var24 - 1);
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
							FluType var28 = method317(var27 - 1);
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
						if (var34 >= 1 && var34 < 103 && (!Client.lowMem || (field898[0][var21][var34] & 0x2) != 0 || (field898[var6][var21][var34] & 0x10) == 0 && method964(var6, var34, var21) == field1472)) {
							if (var6 < class129.field3175) {
								class129.field3175 = var6;
							}
							int var37 = field2131[var6][var21][var34] & 0xFF;
							int var38 = field3053[var6][var21][var34] & 0xFF;
							if (var37 > 0 || var38 > 0) {
								int var39 = Client.field1451[var6][var21][var34];
								int var40 = Client.field1451[var6][var21 + 1][var34];
								int var41 = Client.field1451[var6][var21 + 1][var34 + 1];
								int var42 = Client.field1451[var6][var21][var34 + 1];
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
									int var52 = field2025 + var51;
									int var53 = var49 + field2822 & 0xFF;
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
									var55 = Pix3D.field764[method955(var48, 96)];
								}
								if (var38 == 0) {
									arg0.method55(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method955(var46, var43), method955(var46, var44), method955(var46, var45), method955(var46, var47), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = field910[var6][var21][var34] + 1;
									byte var57 = field1872[var6][var21][var34];
									FloType var58 = method1026(var38 - 1);
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
										int var62 = field2822 + var58.field907 & 0xFF;
										int var63 = field2025 + var58.field895;
										if (var63 < 0) {
											var63 = 0;
										} else if (var63 > 255) {
											var63 = 255;
										}
										var61 = method322(var58.field912, var63, var62);
									}
									int var64 = 0;
									if (var61 != -2) {
										var64 = Pix3D.field764[method689(var61, 96)];
									}
									if (var58.field911 != -1) {
										int var65 = field2822 + var58.field909 & 0xFF;
										int var66 = field2025 + var58.field905;
										if (var66 < 0) {
											var66 = 0;
										} else if (var66 > 255) {
											var66 = 255;
										}
										int var67 = method322(var58.field921, var66, var65);
										var64 = Pix3D.field764[method689(var67, 96)];
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
				if ((field898[1][var70][var71] & 0x2) == 2) {
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
								int var86 = Client.field1451[var82][var78][var79] - 240;
								int var87 = Client.field1451[var81][var78][var79];
								World.method72(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var86, var87);
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
								int var97 = Client.field1451[var93][var90][var77];
								int var98 = Client.field1451[var91][var90][var77] - 240;
								World.method72(var75, 2, var90 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var98, var97);
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
								int var107 = Client.field1451[var76][var101][var103];
								World.method72(var75, 4, var101 * 128, var102 * 128 + 128, var103 * 128, var104 * 128 + 128, var107, var107);
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
		field1218 = null;
		field1203 = null;
		field1191 = null;
		field1216 = null;
		field1220 = null;
		field1204 = null;
		field1195 = null;
		class46.field1193 = null;
		field1215 = null;
		field1199 = null;
		field1219 = null;
		class46.field1196 = null;
		field1214 = null;
		field1217 = null;
		field1197 = null;
	}

	@ObfuscatedName("mc.a(Lbd;BILbd;Z)Lt;")
	public static AnimFrameSet method690(Js5 arg0, int arg1, Js5 arg2) {
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
			return new AnimFrameSet(arg0, arg2, arg1, false);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("qa.a(Lnb;Z)V")
	public static void method835(ClientEntity arg0) {
		int var1 = arg0.field1999 * 128 + arg0.field1970 * 64;
		int var2 = arg0.field1986 - field2063;
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
	public static PixMap method875(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("jagex3.graphics.JavaPixMap");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.method106(arg1, arg2, arg0);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.method106(arg1, arg2, arg0);
			return var5;
		}
	}

	@ObfuscatedName("rc.a(IILbc;II)V")
	public static void method880(int arg0, PixFont arg1, int arg2, int arg3) {
		field3208.method1054();
		field2770.method329(0, 0);
		arg1.method211(field1006, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method211(field3193, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method211(field2817, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method211(field1657, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg1.method211(field2393, 55, 41, 65535, true);
		}
		arg1.method211(field49, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method211(field3193, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method211(field2817, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method211(field1657, 184, 41, 16711680, true);
		}
		arg1.method211(field1676, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method211(field3193, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method211(field2817, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method211(field1657, 324, 41, 16711680, true);
		}
		arg1.method195(field1038, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			Graphics var4 = GameShell.canvas.getGraphics();
			field3208.method101(0, var4, 453);
		} catch (Exception var5) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("i.a(ZLu;IIBIB)V")
	public static void method495(boolean arg0, Js5Loader arg1, int arg2, int arg3, byte arg4, int arg5) {
		long var6 = (long) ((arg2 << 16) + arg3);
		class104 var8 = (class104) class103.field2596.method499(var6);
		if (var8 != null) {
			return;
		}
		class104 var9 = (class104) class78.field1917.method499(var6);
		if (var9 != null) {
			return;
		}
		class104 var10 = (class104) field1328.method499(var6);
		if (var10 == null) {
			if (!arg0) {
				class104 var11 = (class104) BZip2State.field1831.method499(var6);
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
				field3285++;
			} else {
				field996.method598(var12);
				field1328.method498(var12, var6);
				field1260++;
			}
		} else if (arg0) {
			var10.method468();
			class103.field2596.method498(var10, var6);
			field1260--;
			field3285++;
		}
	}

	@ObfuscatedName("na.a(B)V")
	public static void method721() {
		field1930 = null;
		field1943 = null;
		field1938 = null;
		field1929 = null;
		field1933 = null;
		field1932 = null;
		field1937 = null;
		field1944 = null;
		field1931 = null;
		field1942 = null;
		field1935 = null;
		field1934 = null;
		field1936 = null;
	}

	@ObfuscatedName("s.a(II)V")
	public static void method895(int arg0) {
		method985(arg0);
	}

	@ObfuscatedName("sa.a(I)V")
	public static void method904() {
		field2730 = null;
		field2736 = null;
		field2731 = null;
		Client.field2739 = null;
		field2732 = null;
		field2745 = null;
	}

	@ObfuscatedName("td.a(I)Lbc;")
	public static PixFont method965() {
		PixFont var0 = new PixFont(field1985, field837, field3194, field292, field2794);
		method449();
		return var0;
	}

	@ObfuscatedName("hc.a(I)V")
	public static void method471() {
		field1188 = null;
		field1174 = null;
		field1180 = null;
		field1177 = null;
		MidiStream.field1176 = null;
		field1184 = null;
		field1175 = null;
		MidiStream.field1190 = null;
	}

	@ObfuscatedName("id.a(IILnb;)V")
	public static void method523(int arg0, ClientEntity arg1) {
		method423(arg0, arg1.field1963, arg1.field1972);
	}

	@ObfuscatedName("je.b(Z)V")
	public static void method564() {
		int var0 = field2409 + field2621.field1963;
		int var1 = field296 + field2621.field1972;
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
		if (field1488[96]) {
			class17.field544 += (-class17.field544 - 24) / 2;
		} else if (field1488[97]) {
			class17.field544 += (24 - class17.field544) / 2;
		} else {
			class17.field544 /= 2;
		}
		if (field1488[98]) {
			class118.field2947 += (12 - class118.field2947) / 2;
		} else if (field1488[99]) {
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
					if (var8 < 3 && (field898[1][var6][var7] & 0x2) == 2) {
						var8++;
					}
					int var9 = var5 - Client.field1451[var8][var6][var7];
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
		if (field1459 < var10) {
			field1459 += (var10 - field1459) / 24;
		} else if (field1459 > var10) {
			field1459 += (var10 - field1459) / 80;
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
	public static void sleepPrecise(long arg0) {
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
	public static void method758(int arg0, JagString arg1, JagString arg2) {
		if (class86.field2166 == -1) {
			class105.field2637 = true;
		}
		if (arg0 == 0 && field2421 != -1) {
			field3050 = 0;
			field1605 = arg1;
		}
		for (int var3 = 99; var3 > 0; var3--) {
			field3236[var3] = field3236[var3 - 1];
			field3130[var3] = field3130[var3 - 1];
			field2034[var3] = field2034[var3 - 1];
		}
		field3236[0] = arg0;
		field3130[0] = arg2;
		field2034[0] = arg1;
	}

	@ObfuscatedName("uc.d(I)[Le;")
	public static Pix8[] method994() {
		Pix8[] var0 = new Pix8[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			Pix8 var2 = var0[var1] = new Pix8();
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
		field1245 = null;
		field1241 = null;
		field1232 = null;
		field1239 = null;
		field1229 = null;
		field1231 = null;
		field1238 = null;
		field1244 = null;
		field1247 = null;
	}

	@ObfuscatedName("r.a([BI)[B")
	public static byte[] method863(byte[] arg0) {
		Packet var1 = new Packet(arg0);
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
				BZip2.method446(var5, var4, arg0, var3);
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
	public static void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, CollisionMap[] arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (arg4 + var9 > 0 && arg4 + var9 < 103 && arg0 + var10 > 0 && arg0 + var10 < 103) {
					arg8[arg3].field201[arg4 + var9][arg0 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		Packet var11 = new Packet(arg7);
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
	public static Pix8 method467() {
		Pix8 var0 = new Pix8();
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
		field2335 = null;
		field2334 = null;
		field2329 = null;
		field2337 = null;
		field2310 = null;
		field2313 = null;
		field2336 = null;
		field2308 = null;
		field2318 = null;
		field2319 = null;
		field2320 = null;
		field2325 = null;
		class93.field2322 = null;
		field2315 = null;
		field2333 = null;
		field2317 = null;
		field2309 = null;
		Client.field2324 = null;
		field2331 = null;
	}

	@ObfuscatedName("dc.b(I)V")
	public static void method315() {
		LocChange.field684 = null;
		field698 = null;
		LocChange.field677 = null;
		field676 = null;
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
			int var11 = Model.field2258[var9];
			int var12 = Model.field2256[var9];
			int var13 = var11 * 0 - arg5 * var12 >> 16;
			var10 = arg5 * var11 + var12 * 0 >> 16;
			var8 = var13;
		}
		if (var7 != 0) {
			int var14 = Model.field2258[var7];
			int var15 = Model.field2256[var7];
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
		if (field1750 > 0) {
			method847();
		} else {
			method399(40);
			field1692 = field1450;
			field1450 = null;
		}
	}

	@ObfuscatedName("dd.a(B)V")
	public static void method318() {
		field712 = null;
		field707 = null;
		field715 = null;
		field704 = null;
		field703 = null;
		field719 = null;
		field706 = null;
		field717 = null;
		field702 = null;
		field716 = null;
		field705 = null;
		field720 = null;
		field708 = null;
		field714 = null;
		field713 = null;
		field718 = null;
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

	@ObfuscatedName("g.a([BZII)La;")
	public static JagString method419(byte[] arg0, int arg1, int arg2) {
		JagString var3 = new JagString();
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
		field1144 += 128;
		if (field1144 > field2570.length) {
			field1144 -= field2570.length;
			int var9 = (int) (Math.random() * 12.0D);
			method1010(field1177[var9]);
		}
		for (int var10 = 1; var10 < 255; var10++) {
			for (int var11 = 1; var11 < 127; var11++) {
				int var12 = (var10 << 7) + var11;
				int var13 = field2911[var12 + 128] - field2570[var12 + field1144 & field2570.length + -1] / 5;
				if (var13 < 0) {
					var13 = 0;
				}
				field229[var12] = var13;
			}
		}
		for (int var14 = 0; var14 < 255; var14++) {
			class31.field847[var14] = class31.field847[var14 + 1];
		}
		class31.field847[255] = (int) (Math.sin((double) field2063 / 14.0D) * 16.0D + Math.sin((double) field2063 / 15.0D) * 14.0D + Math.sin((double) field2063 / 16.0D) * 12.0D);
		if (class46.field1209 > 0) {
			class46.field1209 -= 4;
		}
		if (field2380 > 0) {
			field2380 -= 4;
		}
		if (class46.field1209 != 0 || field2380 != 0) {
			return;
		}
		int var15 = (int) (Math.random() * 2000.0D);
		if (var15 == 0) {
			class46.field1209 = 1024;
		}
		if (var15 == 1) {
			field2380 = 1024;
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
		if (arg0 < 3 && (field898[1][var4][var3] & 0x2) == 2) {
			var6 = arg0 + 1;
		}
		int var7 = (128 - var5) * Client.field1451[var6][var4][var3] + Client.field1451[var6][var4 + 1][var3] * var5 >> 7;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var5) * Client.field1451[var6][var4][var3 + 1] + Client.field1451[var6][var4 + 1][var3 + 1] * var5 >> 7;
		return (128 - var8) * var7 + var8 * var9 >> 7;
	}

	@ObfuscatedName("be.b(IIB)V")
	public static void method241(int arg0, int arg1) {
		VarBitType var2 = VarBitType.method686(arg1);
		int var3 = var2.field943;
		int var4 = var2.field933;
		int var5 = var2.field945;
		int var6 = field173[var5 - var3];
		if (arg0 < 0 || var6 < arg0) {
			arg0 = 0;
		}
		int var7 = var6 << var3;
		class113.field2803[var4] = class113.field2803[var4] & ~var7 | var7 & arg0 << var3;
	}

	@ObfuscatedName("ra.a(I)J")
	public static synchronized long currentTime() {
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

	@ObfuscatedName("sd.a(I)V")
	public static void method927() {
		class112.field2756 = null;
		field2772 = null;
		field2770 = null;
		class112.field2759 = null;
		class112.field2755 = null;
		field2760 = null;
		field2768 = null;
		field2769 = null;
		field2763 = null;
		field2764 = null;
		field2767 = null;
		field2771 = null;
		class112.field2758 = null;
		field2765 = null;
		field2757 = null;
	}

	@ObfuscatedName("ae.a(B)V")
	public static void method123() {
		field228 = null;
		field231 = null;
		field234 = null;
		field229 = null;
		field227 = null;
		field232 = null;
	}

	@ObfuscatedName("va.b(IIII)Ljd;")
	public static Pix32 method1007(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			Pix32 var3 = (Pix32) field253.method263((long) arg1);
			if (var3 != null && var3.field1477 != arg0 && var3.field1477 != -1) {
				var3.method739();
				var3 = null;
			}
			if (var3 != null) {
				return var3;
			}
		}
		ObjType var4 = ObjType.method760(arg1);
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
				var4 = ObjType.method760(var5);
			}
		}
		Model var7 = var4.method954(true, 1);
		if (var7 == null) {
			return null;
		}
		Pix32 var8 = null;
		if (var4.field2838 != -1) {
			var8 = method1007(10, var4.field2843, -1);
			if (var8 == null) {
				return null;
			}
		}
		int[] var9 = field2747;
		int var10 = field2750;
		int var11 = field2749;
		int var12 = Pix2D.field2752;
		int var13 = Pix2D.field2753;
		int var14 = Pix2D.field2748;
		int var15 = Pix2D.field2751;
		int[] var16 = Pix3D.method367();
		int var17 = field762;
		int var18 = field777;
		Pix32 var19 = new Pix32(32, 32);
		Pix2D.method926(var19.field1480, 32, 32);
		field2909 = Pix3D.method362(field2909);
		Pix2D.method913(0, 0, 32, 32, 0);
		int var20 = var4.field2848;
		if (arg2 == -1) {
			var20 = (int) ((double) var20 * 1.5D);
		}
		if (arg2 > 0) {
			var20 = (int) ((double) var20 * 1.04D);
		}
		Pix3D.field776 = false;
		int var21 = Pix3D.field775[var4.field2875] * var20 >> 16;
		int var22 = Pix3D.field778[var4.field2875] * var20 >> 16;
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
			field253.method262((long) arg1, var19);
		}
		Pix2D.method926(var9, var11, var10);
		Pix2D.method912(var12, var14, var13, var15);
		Pix3D.method362(var16);
		field762 = var17;
		field777 = var18;
		Pix3D.method356();
		Pix3D.field776 = true;
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
		Client.field3200 = null;
		class131.field3198 = null;
		field3197 = null;
		field3205 = null;
		field3203 = null;
		field3202 = null;
	}

	@ObfuscatedName("ac.b(I)V")
	public static void method99() {
		GameShell.field187 = null;
		field178 = null;
		field183 = null;
		field172 = null;
		field186 = null;
		field173 = null;
		field181 = null;
	}

	@ObfuscatedName("id.a(ZI)V")
	public static void method524(boolean arg0) {
		class113.field2773 = arg0;
		if (!class113.field2773) {
			int var24 = field488.method145();
			int var25 = field488.method166();
			int var26 = field488.method137();
			int var27 = field488.method180();
			int var28 = field488.method147();
			int var29 = (field2547 - field488.field267) / 16;
			field2170 = new int[var29][4];
			for (int var30 = 0; var30 < var29; var30++) {
				for (int var31 = 0; var31 < 4; var31++) {
					field2170[var30][var31] = field488.method146();
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
						field2291[var33] = Client.field3131.method228(JagString.join(new JagString[] { field2305, method502(var34), field477, method502(var35) }));
						field742[var33] = Client.field3131.method228(JagString.join(new JagString[] { field1259, method502(var34), field477, method502(var35) }));
						var33++;
					}
				}
			}
			method731(var26, var27, var25, var24, var28);
			return;
		}
		int var1 = field488.method145();
		int var2 = field488.method180();
		int var3 = field488.method145();
		int var4 = field488.method156();
		int var5 = field488.method145();
		field488.method417();
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 13; var7++) {
				for (int var8 = 0; var8 < 13; var8++) {
					int var9 = field488.method412(1);
					if (var9 == 1) {
						field908[var6][var7][var8] = field488.method412(26);
					} else {
						field908[var6][var7][var8] = -1;
					}
				}
			}
		}
		field488.method408();
		int var10 = (field2547 - field488.field267) / 16;
		field2170 = new int[var10][4];
		for (int var11 = 0; var11 < var10; var11++) {
			for (int var12 = 0; var12 < 4; var12++) {
				field2170[var11][var12] = field488.method183();
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
					int var17 = field908[var14][var15][var16];
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
							field2291[var13] = Client.field3131.method228(JagString.join(new JagString[] { field2305, method502(var23), field477, method502(var22) }));
							field742[var13] = Client.field3131.method228(JagString.join(new JagString[] { field1259, method502(var23), field477, method502(var22) }));
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
		field1649 = null;
		field1645 = null;
		field1646 = null;
		field1651 = null;
	}

	@ObfuscatedName("ha.a(I)V")
	public static void method462() {
		field1151 = null;
		field1147 = null;
		field1150 = null;
		field1152 = null;
	}

	@ObfuscatedName("vb.a(II)Z")
	public static boolean method1012(int arg0) {
		if (!method1052(arg0)) {
			return false;
		}
		IfType[] var1 = field2922[arg0];
		boolean var2 = false;
		for (int var3 = 0; var3 < var1.length; var3++) {
			IfType var4 = var1[var3];
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
						SeqType var7 = SeqType.method103(var6);
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
		field3232 = null;
		field3208 = null;
		field3225 = null;
		field3222 = null;
		field3230 = null;
		field3211 = null;
		field3209 = null;
		field3210 = null;
		field3236 = null;
		field3213 = null;
		field3221 = null;
		field3217 = null;
		field3219 = null;
		field3216 = null;
		field3239 = null;
		ClientKeyboardListener.field3231 = null;
		field3234 = null;
		field3223 = null;
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
		if (arg0 instanceof JagException) {
			JagException var1 = (JagException) arg0;
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
		field2823 = null;
		field2806 = null;
		field2821 = null;
		field2807 = null;
		field2808 = null;
		field2818 = null;
		field2804 = null;
		field2810 = null;
		field2819 = null;
		field2824 = null;
		field2817 = null;
		field2812 = null;
		field2805 = null;
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

	@ObfuscatedName("pb.a(I)V")
	public static void method800() {
		field2300 = null;
		field2303 = null;
		field2284 = null;
		field2302 = null;
		field2297 = null;
		field2277 = null;
		field2305 = null;
		field2301 = null;
		field2291 = null;
		field2304 = null;
		field2299 = null;
		field2296 = null;
		field2279 = null;
		field2298 = null;
	}

	@ObfuscatedName("te.a(II)La;")
	public static JagString method973(int arg0) {
		return arg0 < 999999999 ? method502(arg0) : field989;
	}

	@ObfuscatedName("ib.a(ILbd;II)[Le;")
	public static Pix8[] method518(Js5 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method994() : null;
	}

	@ObfuscatedName("sa.a([La;Z)[La;")
	public static JagString[] method905(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[] { method502(var2), field1065 });
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("ob.a([Ljava/lang/Object;IILqd;IZ)V")
	public static void method754(Object[] arg0, int arg1, IfType arg2, int arg3) {
		int var4 = 0;
		ClientScript var5 = ClientScript.method824((Integer) arg0[0], 76);
		int[] var6 = var5.field509;
		int[] var7 = var5.field519;
		int var8 = 0;
		int var9 = -1;
		try {
			field1162 = new int[var5.field518];
			field2606 = new JagString[var5.field514];
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
				} else if (arg0[var12] instanceof JagString) {
					field2606[var11++] = (JagString) arg0[var12];
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
						field3255[var4++] = var6[var9];
					} else if (var14 == 1) {
						int var15 = var6[var9];
						field3255[var4++] = class113.field2803[var15];
					} else if (var14 == 2) {
						int var16 = var6[var9];
						var4--;
						class113.field2803[var16] = field3255[var4];
					} else if (var14 == 3) {
						class119.field2957[var8++] = var5.field517[var9];
					} else if (var14 == 6) {
						var9 += var6[var9];
					} else if (var14 == 7) {
						var4 -= 2;
						if (field3255[var4 + 1] != field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 8) {
						var4 -= 2;
						if (field3255[var4 + 1] == field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 9) {
						var4 -= 2;
						if (field3255[var4 + 1] > field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 10) {
						var4 -= 2;
						if (field3255[var4 + 1] < field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 21) {
						if (class66.field1653 == 0) {
							return;
						}
						class121 var17 = field2736[--class66.field1653];
						field2606 = var17.field3010;
						field1162 = var17.field3000;
						var9 = var17.field3013;
						var5 = var17.field2999;
						var6 = var5.field509;
						var7 = var5.field519;
					} else if (var14 == 25) {
						int var18 = var6[var9];
						field3255[var4++] = method480(var18);
					} else if (var14 == 27) {
						int var19 = var6[var9];
						var4--;
						method241(field3255[var4], var19);
					} else if (var14 == 31) {
						var4 -= 2;
						if (field3255[var4] <= field3255[var4 + 1]) {
							var9 += var6[var9];
						}
					} else if (var14 == 32) {
						var4 -= 2;
						if (field3255[var4 + 1] <= field3255[var4]) {
							var9 += var6[var9];
						}
					} else if (var14 == 33) {
						field3255[var4++] = field1162[var6[var9]];
					} else {
						int var10001;
						if (var14 == 34) {
							var10001 = var6[var9];
							var4--;
							field1162[var10001] = field3255[var4];
						} else if (var14 == 35) {
							class119.field2957[var8++] = field2606[var6[var9]];
						} else if (var14 == 36) {
							var10001 = var6[var9];
							var8--;
							field2606[var10001] = class119.field2957[var8];
						} else if (var14 == 37) {
							int var20 = var6[var9];
							var8 -= var20;
							JagString var21 = method825(var20, var8, class119.field2957);
							class119.field2957[var8++] = var21;
						} else if (var14 == 38) {
							var4--;
						} else if (var14 == 39) {
							var8--;
						} else if (var14 == 40) {
							int var22 = var6[var9];
							ClientScript var23 = ClientScript.method824(var22, 73);
							int[] var24 = new int[var23.field518];
							JagString[] var25 = new JagString[var23.field514];
							for (int var26 = 0; var26 < var23.field510; var26++) {
								var24[var26] = field3255[var4 + var26 - var23.field510];
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
							field2736[class66.field1653++] = var28;
							var6 = var23.field509;
							field2606 = var25;
							var9 = -1;
							field1162 = var24;
							var7 = var23.field519;
						} else if (var14 == 42) {
							field3255[var4++] = field1020[var6[var9]];
						} else {
							if (var14 != 43) {
								break;
							}
							var10001 = var6[var9];
							var4--;
							field1020[var10001] = field3255[var4];
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
						int var30 = field3255[var4];
						int var31 = field3255[var4 + 1];
						int var32 = field3255[var4 + 2];
						IfType var33 = method1053(var30);
						if (var33.field2519 == null) {
							var33.field2519 = new IfType[var32 + 1];
						}
						if (var32 >= var33.field2519.length) {
							IfType[] var34 = new IfType[var32 + 1];
							for (int var35 = 0; var35 < var33.field2519.length; var35++) {
								var34[var35] = var33.field2519[var35];
							}
							var33.field2519 = var34;
						}
						IfType var36 = new IfType();
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
						IfType var37 = var29 ? field1468 : field3068;
						IfType var38 = method1053(var37.field2454);
						var38.field2519[var37.field2495 & 0x7FFF] = null;
					} else {
						if (var14 != 102) {
							break;
						}
						var4--;
						IfType var39 = method1053(field3255[var4]);
						var39.field2519 = null;
					}
				} else if (var14 >= 1000 && var14 < 1100 || !(var14 < 2000 || var14 >= 2100)) {
					IfType var40;
					if (var14 >= 2000) {
						var4--;
						var40 = method1053(field3255[var4]);
						var14 -= 1000;
					} else {
						var40 = var29 ? field1468 : field3068;
					}
					if (var14 == 1000) {
						var4 -= 2;
						var40.field2462 = field3255[var4];
						var40.field2502 = field3255[var4 + 1];
					} else if (var14 == 1001) {
						var4 -= 2;
						var40.field2498 = field3255[var4];
						var40.field2449 = field3255[var4 + 1];
					} else if (var14 == 1003) {
						var4--;
						var40.field2556 = field3255[var4] == 1;
					} else {
						if (var14 != 1004) {
							break;
						}
						var4--;
						var40.field2494 = field3255[var4] == 1;
					}
				} else if (var14 >= 1100 && var14 < 1200 || !(var14 < 2100 || var14 >= 2200)) {
					IfType var41;
					if (var14 < 2000) {
						var41 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var41 = method1053(field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1100) {
						var4 -= 2;
						var41.field2552 = field3255[var4];
						var41.field2537 = field3255[var4 + 1];
					} else if (var14 == 1101) {
						var4--;
						int var42 = field3255[var4];
						int var43 = var42 >> 10 & 0x1F;
						int var44 = var42 & 0x1F;
						int var45 = var42 >> 5 & 0x1F;
						var41.field2453 = (var43 << 19) + (var45 << 11) + (var44 << 3);
					} else if (var14 == 1102) {
						var4--;
						var41.field2451 = field3255[var4] == 1;
					} else if (var14 == 1103) {
						var4--;
						var41.field2551 = field3255[var4];
					} else if (var14 == 1104) {
						var4--;
					} else if (var14 == 1105) {
						var4--;
						var41.field2550 = field3255[var4];
					} else if (var14 == 1106) {
						var4--;
						var41.field2557 = field3255[var4];
					} else if (var14 == 1107) {
						var4--;
						var41.field2447 = field3255[var4] == 1;
					} else if (var14 == 1108) {
						var41.field2493 = 1;
						var4--;
						var41.field2479 = field3255[var4];
					} else if (var14 == 1109) {
						var4 -= 6;
						var41.field2543 = field3255[var4];
						var41.field2485 = field3255[var4 + 1];
						var41.field2496 = field3255[var4 + 2];
						var41.field2463 = field3255[var4 + 3];
						var41.field2531 = field3255[var4 + 4];
						var41.field2534 = field3255[var4 + 5];
					} else if (var14 == 1110) {
						var4--;
						var41.field2465 = field3255[var4];
					} else if (var14 == 1111) {
						var4--;
						var41.field2507 = field3255[var4] == 1;
					} else if (var14 == 1112) {
						var8--;
						var41.field2474 = class119.field2957[var8];
					} else if (var14 == 1113) {
						var4--;
						var41.field2448 = field3255[var4];
					} else if (var14 == 1114) {
						var4 -= 3;
						var41.field2539 = field3255[var4];
						var41.field2521 = field3255[var4 + 1];
						var41.field2538 = field3255[var4 + 2];
					} else {
						if (var14 != 1115) {
							break;
						}
						var4--;
						var41.field2471 = field3255[var4] == 1;
					}
				} else if (var14 >= 1200 && var14 < 1300 || var14 >= 2200 && var14 < 2300) {
					IfType var128;
					if (var14 < 2000) {
						var128 = var29 ? field1468 : field3068;
					} else {
						var4--;
						var128 = method1053(field3255[var4]);
						var14 -= 1000;
					}
					if (var14 == 1200) {
						var4 -= 3;
						int var129 = field3255[var4];
						int var130 = field3255[var4 + 2];
						if (var129 == -1) {
							var128.field2493 = 0;
						} else {
							ObjType var131 = ObjType.method760(var129);
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
						var128.field2479 = field3255[var4];
					} else if (var14 == 1202) {
						var128.field2493 = 3;
						var128.field2479 = field2621.field90.method634();
					} else {
						if (var14 != 1203) {
							break;
						}
						IfType var132 = var29 ? field3068 : field1468;
						var128.field2544 = var132.field2495;
					}
				} else if (var14 >= 1300 && var14 < 1400 || var14 >= 2300 && var14 < 2400) {
					IfType var121;
					if (var14 >= 2000) {
						var4--;
						var121 = method1053(field3255[var4]);
						var14 -= 1000;
					} else {
						var121 = var29 ? field1468 : field3068;
					}
					if (var14 >= 1300 && var14 <= 1309 || !(var14 < 1314 || var14 > 1317)) {
						var8--;
						JagString var122 = class119.field2957[var8];
						Object[] var123 = new Object[var122.method10() + 1];
						for (int var124 = var123.length - 1; var124 >= 1; var124--) {
							if (var122.method6(var124 - 1) == 115) {
								var8--;
								var123[var124] = class119.field2957[var8];
							} else {
								var4--;
								var123[var124] = Integer.valueOf(field3255[var4]);
							}
						}
						var4--;
						var123[0] = Integer.valueOf(field3255[var4]);
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
						int var125 = field3255[var4] - 1;
						if (var125 >= 0 && var125 <= 9) {
							if (var121.field2467 == null || var121.field2467.length <= var125) {
								JagString[] var126 = new JagString[var125 + 1];
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
						var121.field2544 = field3255[var4];
					} else if (var14 == 1312) {
						var4--;
						var121.field2500 = field3255[var4] == 1;
					} else {
						if (var14 != 1313) {
							break;
						}
						var4--;
					}
				} else if (var14 < 1500) {
					if (var14 == 1400) {
						var4 -= 2;
						int var46 = field3255[var4 + 1];
						int var47 = field3255[var4];
						IfType var48 = method1053(var47);
						if (var48.field2519 == null || var48.field2519.length <= var46 || var48.field2519[var46] == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
							if (var29) {
								field1468 = var48.field2519[var46];
							} else {
								field3068 = var48.field2519[var46];
							}
						}
					} else if (var14 == 1401) {
						var4 -= 3;
						int var49 = field3255[var4];
						int var50 = field3255[var4 + 2];
						int var51 = field3255[var4 + 1];
						IfType var52 = method607(field2922[var49], var50, true, 0, -1, 0, var51);
						if (var52 == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
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
						IfType var53 = method1053(field3255[var4]);
						int var54 = field3255[var4 + 2];
						int var55 = field3255[var4 + 1];
						IfType var56 = method607(var53.field2519, var54, true, var53.field2537, var53.field2495, var53.field2552, var55);
						if (var56 == null) {
							field3255[var4++] = 0;
						} else {
							field3255[var4++] = 1;
							if (var29) {
								field1468 = var56;
							} else {
								field3068 = var56;
							}
						}
					}
				} else if (var14 < 1600) {
					IfType var57 = var29 ? field1468 : field3068;
					if (var14 == 1500) {
						field3255[var4++] = var57.field2462;
					} else if (var14 == 1501) {
						field3255[var4++] = var57.field2502;
					} else if (var14 == 1502) {
						field3255[var4++] = var57.field2498;
					} else if (var14 == 1503) {
						field3255[var4++] = var57.field2449;
					} else if (var14 == 1504) {
						field3255[var4++] = var57.field2556 ? 1 : 0;
					} else {
						if (var14 != 1505) {
							break;
						}
						field3255[var4++] = var57.field2454;
					}
				} else if (var14 < 1700) {
					IfType var120 = var29 ? field1468 : field3068;
					if (var14 == 1600) {
						field3255[var4++] = var120.field2552;
					} else {
						if (var14 != 1601) {
							break;
						}
						field3255[var4++] = var120.field2537;
					}
				} else if (var14 < 2500) {
					if (var14 == 2401) {
						var4 -= 3;
						int var58 = field3255[var4 + 1];
						int var59 = field3255[var4];
						int var60 = field3255[var4 + 2];
						IfType var61 = method607(field2922[var59], var60, false, 0, -1, 0, var58);
						if (var61 == null) {
							field3255[var4++] = -1;
						} else {
							field3255[var4++] = var61.field2495;
						}
					} else {
						if (var14 != 2402) {
							break;
						}
						var4 -= 3;
						IfType var62 = method1053(field3255[var4]);
						int var63 = field3255[var4 + 1];
						int var64 = field3255[var4 + 2];
						IfType var65 = method607(field2922[var62.field2495 >> 16], var64, false, var62.field2537, var62.field2495 & 0xFFFF, var62.field2552, var63);
						if (var65 == null) {
							field3255[var4++] = -1;
						} else {
							field3255[var4++] = var65.field2495;
						}
					}
				} else if (var14 < 2600) {
					var4--;
					IfType var119 = method1053(field3255[var4]);
					if (var14 == 2500) {
						field3255[var4++] = var119.field2462;
					} else if (var14 == 2501) {
						field3255[var4++] = var119.field2502;
					} else if (var14 == 2502) {
						field3255[var4++] = var119.field2498;
					} else if (var14 == 2503) {
						field3255[var4++] = var119.field2449;
					} else if (var14 == 2504) {
						field3255[var4++] = var119.field2556 ? 1 : 0;
					} else {
						if (var14 != 2505) {
							break;
						}
						field3255[var4++] = var119.field2454;
					}
				} else if (var14 < 2700) {
					var4--;
					IfType var66 = method1053(field3255[var4]);
					if (var14 == 2600) {
						field3255[var4++] = var66.field2552;
					} else {
						if (var14 != 2601) {
							break;
						}
						field3255[var4++] = var66.field2537;
					}
				} else {
					if (var14 < 2800) {
						break;
					}
					if (var14 < 3100) {
						if (var14 == 3000) {
							var4--;
							int var67 = field3255[var4];
							if (field2998 == -1) {
								method414(0, var67);
								field2998 = var67;
							}
						} else if (var14 == 3001 || var14 == 3003) {
							var4 -= 2;
							int var68 = field3255[var4];
							int var69 = field3255[var4 + 1];
							method673(0, var69, var68);
						} else if (var14 == 3002) {
							IfType var70 = var29 ? field1468 : field3068;
							if (field2998 == -1) {
								method414(var70.field2495 & 0x7FFF, var70.field2454);
								field2998 = var70.field2495;
							}
						} else {
							if (var14 != 3003) {
								break;
							}
							IfType var71 = var29 ? field1468 : field3068;
							var4--;
							int var72 = field3255[var4];
							method673(var71.field2495 & 0x7FFF, var72, var71.field2454);
						}
					} else if (var14 >= 3200) {
						if (var14 < 3300) {
							if (var14 == 3200) {
								var4 -= 3;
								method887(field3255[var4], field3255[var4 + 1], field3255[var4 + 2]);
							} else if (var14 == 3201) {
								var4--;
								method874(field3255[var4]);
							} else {
								if (var14 != 3202) {
									break;
								}
								var4 -= 2;
								method928(field3255[var4 + 1], field3255[var4]);
							}
						} else if (var14 < 3400) {
							if (var14 != 3300) {
								break;
							}
							field3255[var4++] = field2063;
						} else if (var14 >= 4100) {
							if (var14 >= 4200) {
								break;
							}
							if (var14 == 4100) {
								var8--;
								JagString var102 = class119.field2957[var8];
								var4--;
								int var103 = field3255[var4];
								class119.field2957[var8++] = JagString.join(new JagString[] { var102, method502(var103) });
							} else if (var14 == 4101) {
								var8 -= 2;
								JagString var104 = class119.field2957[var8 + 1];
								JagString var105 = class119.field2957[var8];
								class119.field2957[var8++] = JagString.join(new JagString[] { var105, var104 });
							} else if (var14 == 4102) {
								var8--;
								JagString var106 = class119.field2957[var8];
								var4--;
								int var107 = field3255[var4];
								class119.field2957[var8++] = JagString.join(new JagString[] { var106, method1034(var107) });
							} else if (var14 == 4103) {
								var8--;
								JagString var108 = class119.field2957[var8];
								class119.field2957[var8++] = var108.method30();
							} else if (var14 == 4104) {
								var4--;
								int var109 = field3255[var4];
								long var110 = ((long) var109 + 11745L) * 86400000L;
								class14.field453.setTime(new Date(var110));
								int var112 = class14.field453.get(5);
								int var113 = class14.field453.get(2);
								int var114 = class14.field453.get(1);
								class119.field2957[var8++] = JagString.join(new JagString[] { method502(var112), field1572, field621[var113], field1572, method502(var114) });
							} else if (var14 == 4105) {
								var8 -= 2;
								JagString var115 = class119.field2957[var8];
								JagString var116 = class119.field2957[var8 + 1];
								if (field2621.field90 != null && field2621.field90.field1658) {
									class119.field2957[var8++] = var116;
								} else {
									class119.field2957[var8++] = var115;
								}
							} else if (var14 == 4106) {
								var4--;
								int var117 = field3255[var4];
								class119.field2957[var8++] = method502(var117);
							} else {
								if (var14 != 4107) {
									break;
								}
								var8 -= 2;
								field3255[var4++] = class119.field2957[var8].method35(class119.field2957[var8 + 1]);
							}
						} else if (var14 == 4000) {
							var4 -= 2;
							int var73 = field3255[var4];
							int var74 = field3255[var4 + 1];
							field3255[var4++] = var73 + var74;
						} else if (var14 == 4001) {
							var4 -= 2;
							int var75 = field3255[var4 + 1];
							int var76 = field3255[var4];
							field3255[var4++] = var76 - var75;
						} else if (var14 == 4002) {
							var4 -= 2;
							int var77 = field3255[var4 + 1];
							int var78 = field3255[var4];
							field3255[var4++] = var77 * var78;
						} else if (var14 == 4003) {
							var4 -= 2;
							int var79 = field3255[var4];
							int var80 = field3255[var4 + 1];
							field3255[var4++] = var79 / var80;
						} else if (var14 == 4004) {
							var4--;
							int var81 = field3255[var4];
							field3255[var4++] = (int) (Math.random() * (double) var81);
						} else if (var14 == 4005) {
							var4--;
							int var82 = field3255[var4];
							field3255[var4++] = (int) ((double) (var82 + 1) * Math.random());
						} else if (var14 == 4006) {
							var4 -= 5;
							int var83 = field3255[var4 + 1];
							int var84 = field3255[var4];
							int var85 = field3255[var4 + 3];
							int var86 = field3255[var4 + 4];
							int var87 = field3255[var4 + 2];
							field3255[var4++] = var84 + (var83 - var84) * (-var87 + var86) / (var85 - var87);
						} else if (var14 == 4007) {
							var4 -= 2;
							int var88 = field3255[var4];
							int var89 = field3255[var4 + 1];
							field3255[var4++] = var88 * var89 / 100 + var88;
						} else if (var14 == 4008) {
							var4 -= 2;
							int var90 = field3255[var4];
							int var91 = field3255[var4 + 1];
							field3255[var4++] = 0x1 << var91 | var90;
						} else if (var14 == 4009) {
							var4 -= 2;
							int var92 = field3255[var4];
							int var93 = field3255[var4 + 1];
							field3255[var4++] = var92 & -(0x1 << var93) - 1;
						} else if (var14 == 4010) {
							var4 -= 2;
							int var94 = field3255[var4];
							int var95 = field3255[var4 + 1];
							field3255[var4++] = (0x1 << var95 & var94) == 0 ? 0 : 1;
						} else if (var14 == 4011) {
							var4 -= 2;
							int var96 = field3255[var4 + 1];
							int var97 = field3255[var4];
							field3255[var4++] = var97 % var96;
						} else if (var14 == 4012) {
							var4 -= 2;
							int var98 = field3255[var4];
							int var99 = field3255[var4 + 1];
							if (var98 == 0) {
								field3255[var4++] = 0;
							} else {
								field3255[var4++] = (int) Math.pow((double) var98, (double) var99);
							}
						} else {
							if (var14 != 4013) {
								break;
							}
							var4 -= 2;
							int var100 = field3255[var4];
							int var101 = field3255[var4 + 1];
							if (var100 == 0) {
								field3255[var4++] = 0;
							} else if (var101 == 0) {
								field3255[var4++] = Integer.MAX_VALUE;
							} else {
								field3255[var4++] = (int) Math.pow((double) var100, 1.0D / (double) var101);
							}
						}
					} else if (var14 == 3100) {
						var8--;
						JagString var118 = class119.field2957[var8];
						method758(0, var118, field2585);
					} else {
						if (var14 != 3101) {
							break;
						}
						var4 -= 2;
						method450(field3255[var4], field3255[var4 + 1], field2621);
					}
				}
			}
		} catch (Exception var133) {
		}
	}

	@ObfuscatedName("ha.a(B)V")
	public static void method463() {
		if (field217 == null) {
			return;
		}
		long var0 = currentTime();
		if (var0 <= field462) {
			return;
		}
		field217.method255(var0);
		int var2 = (int) (var0 - field462);
		field462 = var0;
		Class var3 = class14.class;
		synchronized (class14.class) {
			field1157 += PcmPlayer.frequency * var2;
			int var4 = (field1157 - PcmPlayer.frequency * 2000) / 1000;
			if (var4 > 0) {
				if (field1381 != null) {
					field1381.method127(var4);
				}
				field1157 -= var4 * 1000;
			}
		}
	}

	@ObfuscatedName("cc.a(Lad;IIIILab;IIII)V")
	public static void method270(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, World arg5, int arg6, int arg7, int arg8) {
		int var9 = Client.field1451[arg2][arg8][arg7];
		int var10 = Client.field1451[arg2][arg8 + 1][arg7];
		int var11 = Client.field1451[arg2][arg8][arg7 + 1];
		int var12 = Client.field1451[arg2][arg8 + 1][arg7 + 1];
		LocType var13 = LocType.method389(arg1);
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
			ModelSource var17;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var17 = var13.method505(var12, var11, arg6, var9, 22, var10);
			} else {
				var17 = new ClientLocAnim(arg1, 22, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method88(arg3, arg8, arg7, var14, var17, var16, var15);
			if (var13.field1284 && var13.field1329 == 1) {
				arg0.method115(arg7, arg8);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var18;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var18 = var13.method505(var12, var11, arg6, var9, 10, var10);
			} else {
				var18 = new ClientLocAnim(arg1, 10, arg6, var9, var10, var12, var11, var13.field1289, true);
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
			ModelSource var22;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var22 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var22 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method93(arg3, arg8, arg7, var14, 1, 1, var22, 0, var16, var15);
			if (var13.field1284) {
				arg0.method118(arg8, var13.field1311, var13.field1298, arg6, arg7, var13.field1286);
			}
		} else if (arg4 == 0) {
			ModelSource var23;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var23 = var13.method505(var12, var11, arg6, var9, 0, var10);
			} else {
				var23 = new ClientLocAnim(arg1, 0, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var23, null, field1740[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 1) {
			ModelSource var24;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var24 = var13.method505(var12, var11, arg6, var9, 1, var10);
			} else {
				var24 = new ClientLocAnim(arg1, 1, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var24, null, field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 2) {
			int var25 = arg6 + 1 & 0x3;
			ModelSource var26;
			ModelSource var27;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var26 = var13.method505(var12, var11, arg6 + 4, var9, 2, var10);
				var27 = var13.method505(var12, var11, var25, var9, 2, var10);
			} else {
				var26 = new ClientLocAnim(arg1, 2, arg6 + 4, var9, var10, var12, var11, var13.field1289, true);
				var27 = new ClientLocAnim(arg1, 2, var25, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var26, var27, field1740[arg6], field1740[var25], var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 3) {
			ModelSource var28;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var28 = var13.method505(var12, var11, arg6, var9, 3, var10);
			} else {
				var28 = new ClientLocAnim(arg1, 3, arg6, var9, var10, var12, var11, var13.field1289, true);
			}
			arg5.method50(arg3, arg8, arg7, var14, var28, null, field2819[arg6], 0, var16, var15);
			if (var13.field1284) {
				arg0.method114(arg7, arg4, arg6, arg8, var13.field1311);
			}
		} else if (arg4 == 9) {
			ModelSource var29;
			if (var13.field1289 == -1 && var13.field1317 == null) {
				var29 = var13.method505(var12, var11, arg6, var9, arg4, var10);
			} else {
				var29 = new ClientLocAnim(arg1, arg4, arg6, var9, var10, var12, var11, var13.field1289, true);
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
				ModelSource var34;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var34 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var34 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var34, field1740[arg6], arg6 * 512, 0, 0, var16, var15);
			} else if (arg4 == 5) {
				int var35 = 16;
				int var36 = arg5.method78(arg3, arg8, arg7);
				if (var36 > 0) {
					var35 = LocType.method389(var36 >> 14 & 0x7FFF).field1288;
				}
				ModelSource var37;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var37 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var37 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var37, field1740[arg6], arg6 * 512, field1595[arg6] * var35, field181[arg6] * var35, var16, var15);
			} else if (arg4 == 6) {
				ModelSource var38;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var38 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var38 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var38, 256, arg6, 0, 0, var16, var15);
			} else if (arg4 == 7) {
				ModelSource var39;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var39 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var39 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var39, 512, arg6, 0, 0, var16, var15);
			} else if (arg4 == 8) {
				ModelSource var40;
				if (var13.field1289 == -1 && var13.field1317 == null) {
					var40 = var13.method505(var12, var11, 0, var9, 4, var10);
				} else {
					var40 = new ClientLocAnim(arg1, 4, 0, var9, var10, var12, var11, var13.field1289, true);
				}
				arg5.method65(arg3, arg8, arg7, var14, var40, 768, arg6, 0, 0, var16, var15);
			}
		}
	}

	@ObfuscatedName("qb.a(IILba;IIIII)V")
	public static void method841(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6) {
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
		field898[arg6][arg0][arg3] = 0;
		while (true) {
			int var7 = arg2.method144();
			if (var7 == 0) {
				if (arg6 == 0) {
					Client.field1451[0][arg0][arg3] = -method751(arg0 + arg5 + 932731, arg4 + 556238 + arg3) * 8;
				} else {
					Client.field1451[arg6][arg0][arg3] = Client.field1451[arg6 - 1][arg0][arg3] - 240;
				}
				break;
			}
			if (var7 == 1) {
				int var8 = arg2.method144();
				if (var8 == 1) {
					var8 = 0;
				}
				if (arg6 == 0) {
					Client.field1451[0][arg0][arg3] = -var8 * 8;
				} else {
					Client.field1451[arg6][arg0][arg3] = Client.field1451[arg6 - 1][arg0][arg3] - var8 * 8;
				}
				break;
			}
			if (var7 <= 49) {
				field3053[arg6][arg0][arg3] = arg2.method184();
				field910[arg6][arg0][arg3] = (byte) ((var7 - 2) / 4);
				field1872[arg6][arg0][arg3] = (byte) (arg1 + var7 - 2 & 0x3);
			} else if (var7 <= 81) {
				field898[arg6][arg0][arg3] = (byte) (var7 - 49);
			} else {
				field2131[arg6][arg0][arg3] = (byte) (var7 - 81);
			}
		}
	}

	@ObfuscatedName("w.b(B)V")
	public static void method1028() {
		field925.method1054();
		field1347 = Pix3D.method362(field1347);
	}

	@ObfuscatedName("hd.a(IIIBIII)Z")
	public static boolean method478(int arg0, int arg1, int arg2, int arg3) {
		return method1052(arg0) ? Client.method278(arg2, 0, 0, 0, -1, arg1, arg3, 0, field2922[arg0]) : false;
	}

	@ObfuscatedName("m.a(IZIILbd;IIZ)V")
	public static synchronized void method670(int arg0, int arg1, Js5 arg2, int arg3) {
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
		ClientKeyboardListener var0 = ClientKeyboardListener.field2924;
		synchronized (ClientKeyboardListener.field2924) {
			if (ClientKeyboardListener.field2921 == class105.field2630) {
				return false;
			} else {
				field2885 = ClientKeyboardListener.field1465[ClientKeyboardListener.field2921];
				field2920 = ClientKeyboardListener.field2625[ClientKeyboardListener.field2921];
				ClientKeyboardListener.field2921 = ClientKeyboardListener.field2921 + 1 & 0x7F;
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
		World.field115 = true;
		Client.lowMem = true;
	}

	@ObfuscatedName("l.a(III)Z")
	public static boolean method631(int arg0, int arg1) {
		if (arg0 == 0 && ObjType.field2881 == arg1) {
			return true;
		} else if (arg0 == 1 && field214 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && class108.field2712 == arg1;
		}
	}

	@ObfuscatedName("ma.b(I)V")
	public static void method682() {
		field1780 = null;
		field1789 = null;
		class73.field1788 = null;
		field1785 = null;
		field1786 = null;
		field1784 = null;
		field1787 = null;
		field1782 = null;
	}

	@ObfuscatedName("oa.a(BI)V")
	public static void method746(int arg0) {
		if (!method1052(arg0)) {
			return;
		}
		IfType[] var1 = field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3 != null) {
				var3.field2466 = 0;
				var3.field2460 = 0;
			}
		}
	}

	@ObfuscatedName("rb.a(ZI)V")
	public static void method876(int arg0) {
		ClientMouseListener.field2293 = arg0;
	}

	@ObfuscatedName("td.a(Lbd;Lbd;I)I")
	public static int method966(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg0.method239(field1751, field3067)) {
			var2++;
		}
		if (arg1.method239(Client.field583, field3067)) {
			var2++;
		}
		if (arg1.method239(field1245, field3067)) {
			var2++;
		}
		if (arg1.method239(field1056, field3067)) {
			var2++;
		}
		if (arg1.method239(field473, field3067)) {
			var2++;
		}
		return var2;
	}

	@ObfuscatedName("uc.e(I)V")
	public static void method995() {
		class86.field2152.method267();
		BZip2State.field1841.method267();
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
		((TextureManager) field771).method691();
		class31.field830.method267();
		Client.field1378.method236();
		Client.field657.method236();
		Client.field3200.method236();
		Client.field2031.method236();
		Client.field3131.method236();
		Client.field2702.method236();
		Client.field1890.method236();
		Client.field1087.method236();
		Client.field1752.method236();
		Client.field1542.method236();
		Client.field2324.method236();
		Client.field2739.method236();
	}

	@ObfuscatedName("ca.b(I)V")
	public static void method253() {
		Client.lowMem = false;
		World.field115 = false;
	}

	@ObfuscatedName("re.a(B)V")
	public static void method890() {
		field2687 = null;
		field2699 = null;
		field2701 = null;
		field2694 = null;
		Packet.field2698 = null;
		field2700 = null;
	}

	@ObfuscatedName("fe.a(ILu;Lsa;B)V")
	public static void method410(int arg0, Js5Loader arg1, DataFile arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field1464 = 1;
		var3.field2073 = arg0;
		var3.field1469 = arg2;
		var3.field1456 = arg1;
		LinkList var4 = field1547;
		synchronized (field1547) {
			field1547.method804(var3);
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
		if (field1554 != 0 && arg1 != -1) {
			method681(1, arg1, field1554, Client.field2324);
			field1860 = arg0;
		}
	}

	@ObfuscatedName("wc.a(I)V")
	public static void method1051() {
		field3305 = null;
		field3306 = null;
		field3296 = null;
		field3298 = null;
		field3299 = null;
		field3303 = null;
		field3282 = null;
		field3307 = null;
		field3302 = null;
		field3295 = null;
		field3300 = null;
	}

	@ObfuscatedName("qa.f(I)V")
	public static void method836() {
		field2398 = null;
		field2394 = null;
		field2401 = null;
		field2400 = null;
		field2391 = null;
		field2397 = null;
		field2393 = null;
	}

	@ObfuscatedName("be.a(La;I)Z")
	public static boolean method242(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field1492; var1++) {
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
			if (field2034[var3] != null) {
				int var4 = field3236[var3];
				int var5 = field1340 + 4 + 70 - var2 * 14;
				if (var5 < -20) {
					break;
				}
				if (var4 == 0) {
					var2++;
				}
				JagString var6 = field3130[var3];
				if (var6 != null && var6.method26(field2612)) {
					var6 = var6.method1(5);
				}
				if (var6 != null && var6.method26(field2535)) {
					var6 = var6.method1(5);
				}
				if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1864 == 0 || field1864 == 1 && method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5 && !var6.method5(field2621.field86)) {
						if (field1004 >= 1) {
							method398(0, field1038, 0, 0, 28, JagString.join(new JagString[] { field1393, var6 }));
						}
						method398(0, field1933, 0, 0, 51, JagString.join(new JagString[] { field1393, var6 }));
						method398(0, field1364, 0, 0, 45, JagString.join(new JagString[] { field1393, var6 }));
					}
					var2++;
				}
				if ((var4 == 3 || var4 == 7) && field216 == 0 && (var4 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var6))) {
					var2++;
					if (arg1 > var5 - 14 && arg1 <= var5) {
						if (field1004 >= 1) {
							method398(0, field1038, 0, 0, 28, JagString.join(new JagString[] { field1393, var6 }));
						}
						method398(0, field1933, 0, 0, 51, JagString.join(new JagString[] { field1393, var6 }));
						method398(0, field1364, 0, 0, 45, JagString.join(new JagString[] { field1393, var6 }));
					}
				}
				if (var4 == 4 && (ObjType.field2828 == 0 || ObjType.field2828 == 1 && method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5) {
						method398(0, field2610, 0, 0, 26, JagString.join(new JagString[] { field1393, var6 }));
					}
					var2++;
				}
				if ((var4 == 5 || var4 == 6) && field216 == 0 && class6.field236 < 2) {
					var2++;
				}
				if (var4 == 8 && (ObjType.field2828 == 0 || ObjType.field2828 == 1 && method242(var6))) {
					if (var5 - 14 < arg1 && arg1 <= var5) {
						method398(0, field1432, 0, 0, 46, JagString.join(new JagString[] { field1393, var6 }));
					}
					var2++;
				}
			}
		}
	}

	@ObfuscatedName("nd.a(IIII)V")
	public static void method737(int arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < 8; var3++) {
			for (int var4 = 0; var4 < 8; var4++) {
				Client.field1451[arg1][arg2 + var3][arg0 + var4] = 0;
			}
		}
		if (arg2 > 0) {
			for (int var5 = 1; var5 < 8; var5++) {
				Client.field1451[arg1][arg2][arg0 + var5] = Client.field1451[arg1][arg2 - 1][arg0 + var5];
			}
		}
		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				Client.field1451[arg1][arg2 + var6][arg0] = Client.field1451[arg1][arg2 + var6][arg0 - 1];
			}
		}
		if (arg2 > 0 && Client.field1451[arg1][arg2 - 1][arg0] != 0) {
			Client.field1451[arg1][arg2][arg0] = Client.field1451[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Client.field1451[arg1][arg2][arg0 - 1] != 0) {
			Client.field1451[arg1][arg2][arg0] = Client.field1451[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Client.field1451[arg1][arg2 - 1][arg0 - 1] != 0) {
			Client.field1451[arg1][arg2][arg0] = Client.field1451[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("rb.a(II)V")
	public static void method877(int arg0) {
		if (field311 == null) {
			return;
		}
		if (field1548 == 0) {
			if (field3030 >= 0) {
				field3030 = arg0;
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
		field1687 = null;
		field1663 = null;
		field1692 = null;
		field1670 = null;
		field1660 = null;
		field1690 = null;
		field1661 = null;
		field1685 = null;
		field1672 = null;
		field1668 = null;
		field1674 = null;
		field1659 = null;
		field1655 = null;
		field1689 = null;
		field1676 = null;
		field1657 = null;
		field1673 = null;
		field1691 = null;
	}

	@ObfuscatedName("ca.a(B)V")
	public static void method254() {
		field1066.method267();
		field3035.method267();
		field253.method267();
	}

	@ObfuscatedName("k.c(I)V")
	public static void method572() {
		if (field216 == 0) {
			return;
		}
		int var0 = 0;
		if (field2813 != 0) {
			var0 = 1;
		}
		for (int var1 = 0; var1 < 100; var1++) {
			if (field2034[var1] != null) {
				int var2 = field3236[var1];
				JagString var3 = field3130[var1];
				if (var3 != null && var3.method26(field2612)) {
					var3 = var3.method1(5);
				}
				if (var3 != null && var3.method26(field2535)) {
					var3 = var3.method1(5);
				}
				if ((var2 == 3 || var2 == 7) && (var2 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var3))) {
					int var4 = 329 - var0 * 13;
					var0++;
					if (class24.field741 > 4 && var4 - 10 < class102.field2568 + -4 && class102.field2568 - 4 <= var4 + 3) {
						int var5 = Client.p12.method208(JagString.join(new JagString[] { field1215, field713, var3, field2034[var1] })) + 25;
						if (var5 > 450) {
							var5 = 450;
						}
						if (class24.field741 < var5 + 4) {
							if (field1004 >= 1) {
								method398(0, field1038, 0, 0, 2028, JagString.join(new JagString[] { field1393, var3 }));
							}
							method398(0, field1933, 0, 0, 2051, JagString.join(new JagString[] { field1393, var3 }));
							method398(0, field1364, 0, 0, 2045, JagString.join(new JagString[] { field1393, var3 }));
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
		field898 = null;
		field908 = null;
		field890 = null;
		field889 = null;
		field902 = null;
		field900 = null;
		field899 = null;
	}

	@ObfuscatedName("tc.c(I)V")
	public static void method962() {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			if (field1548 > 0) {
				field2046 += field302;
				field311.method302(field3030, field2046);
				field1548--;
				if (field1548 == 0) {
					field311.method305();
					field3030 = -1;
					field1548 = 20;
				}
			}
		} else if (field1548 > 0) {
			field1548--;
			if (field1548 == 0) {
				if (field78 == null) {
					field311.method304(256);
				} else {
					field311.method304(field975);
					field3030 = field975;
					field311.method307(field78, field1662, field975);
					field78 = null;
				}
				field2046 = 0;
			}
		}
		field311.method308();
	}

	@ObfuscatedName("l.a(II)I")
	public static int method632(int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
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
		field977 = null;
		field971 = null;
		field964 = null;
		field955 = null;
		field962 = null;
		field957 = null;
		field976 = null;
	}

	@ObfuscatedName("j.a(ILbd;I)Le;")
	public static Pix8 method533(Js5 arg0, int arg1) {
		return method148(arg0, arg1) ? method467() : null;
	}

	@ObfuscatedName("ua.a(I)V")
	public static void method986() {
		field1167.method1054();
		field1366.method329(0, 0);
		field1096 = Pix3D.method362(field1096);
	}

	@ObfuscatedName("ra.b(I)V")
	public static void method871() {
		field2609 = null;
		field2602 = null;
		field2598 = null;
		field2612 = null;
		field2603 = null;
		field2610 = null;
		field2600 = null;
		class103.field2596 = null;
		field2606 = null;
		field2608 = null;
		field2601 = null;
		field2611 = null;
	}

	@ObfuscatedName("de.a(B)V")
	public static void method320() {
		while (true) {
			LinkList var0 = field1547;
			Js5WorkerRequest var1;
			synchronized (field1547) {
				var1 = (Js5WorkerRequest) field2371.method813();
			}
			if (var1 == null) {
				return;
			}
			var1.field1456.method978(false, var1.field1454, (int) var1.field2073, var1.field1469);
		}
	}

	@ObfuscatedName("ga.d(I)V")
	public static void method421() {
		field1031 = null;
		field1034 = null;
		field1021 = null;
		field1019 = null;
		field1041 = null;
		field1036 = null;
		field1020 = null;
		field1024 = null;
		field1043 = null;
		field1037 = null;
		field1044 = null;
		field1040 = null;
		field1046 = null;
		field1011 = null;
		field1030 = null;
		field1038 = null;
		field1018 = null;
		field1017 = null;
		field1022 = null;
		field1028 = null;
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1029() {
		if (field311 == null) {
			return;
		}
		method475();
		if (field1548 > 0) {
			field311.method304(256);
			field1548 = 0;
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
		field1345 = null;
	}

	@ObfuscatedName("ha.a([BBLsa;I)V")
	public static void method464(byte[] arg0, DataFile arg1, int arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field2073 = arg2;
		var3.field1454 = arg0;
		var3.field1464 = 0;
		var3.field1469 = arg1;
		LinkList var4 = field1547;
		synchronized (field1547) {
			field1547.method804(var3);
		}
		method500();
	}

	@ObfuscatedName("td.a(Z)V")
	public static void method967() {
		if (field217 != null) {
			field217.method256();
			field217 = null;
		}
	}

	@ObfuscatedName("i.a(Z)V")
	public static void method496() {
		field1255 = null;
		field1259 = null;
		field1264 = null;
		field1269 = null;
		field1275 = null;
	}

	@ObfuscatedName("ec.f(I)V")
	public static void method370() {
		field790 = null;
		field797 = null;
		field796 = null;
		field782 = null;
		field800 = null;
		field784 = null;
		field798 = null;
		field805 = null;
		field793 = null;
		field810 = null;
		field789 = null;
		field785 = null;
		field802 = null;
		field795 = null;
		field791 = null;
	}

	@ObfuscatedName("qc.a(I)V")
	public static void method849() {
		field2436 = null;
		class99.field2428 = null;
		Client.soundMixer = null;
		field2438 = null;
		field2432 = null;
		field2431 = null;
		field2429 = null;
		field2426 = null;
		field2439 = null;
		field2433 = null;
	}

	@ObfuscatedName("rc.a(BILbd;I)[Ljd;")
	public static Pix32[] method881(int arg0, Js5 arg1, int arg2) {
		return method885(arg2, arg0, arg1) ? method998() : null;
	}

	@ObfuscatedName("bb.a(B)V")
	public static void method187() {
		field318 = null;
		field326 = null;
		field324 = null;
		field328 = null;
		class9.field313 = null;
		field311 = null;
		field325 = null;
		field315 = null;
		field332 = null;
		field320 = null;
	}

	@ObfuscatedName("be.b(I)V")
	public static void method243() {
		field418 = null;
		field431 = null;
		field414 = null;
	}

	@ObfuscatedName("ma.a(B[BII)Z")
	public static boolean method683(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg0);
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
						LocType var16 = LocType.method389(var5);
						if (var12 != 22 || !Client.lowMem || var16.field1329 != 0 || var16.field1330) {
							var8 = true;
							if (!var16.method517()) {
								var3 = false;
								field2358++;
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
		field2694 = new LinkList();
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
		field2362 = null;
		field2382 = null;
		field2378 = null;
		field2355 = null;
		Client.field2376 = null;
		field2357 = null;
		field2383 = null;
		field2381 = null;
		field2359 = null;
		field2354 = null;
		field2371 = null;
		field2369 = null;
		field2360 = null;
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
				field2922[arg0] = new IfType[var1];
			}
			for (int var2 = 0; var2 < var1; var2++) {
				if (field2922[arg0][var2] == null) {
					byte[] var3 = field924.method217(var2, arg0);
					if (var3 != null) {
						field2922[arg0][var2] = new IfType();
						field2922[arg0][var2].field2495 = (arg0 << 16) + var2;
						if (var3[0] == -1) {
							field2922[arg0][var2].method858(new Packet(var3));
						} else {
							field2922[arg0][var2].method851(new Packet(var3));
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
		if (field216 == 0) {
			return;
		}
		PixFont var0 = Client.p12;
		int var1 = 0;
		if (field2813 != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (field2034[var2] != null) {
				JagString var3 = field3130[var2];
				byte var4 = 0;
				int var5 = field3236[var2];
				if (var3 != null && var3.method26(field2612)) {
					var3 = var3.method1(5);
					var4 = 1;
				}
				if (var3 != null && var3.method26(field2535)) {
					var3 = var3.method1(5);
					var4 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var3))) {
					int var6 = 329 - var1 * 13;
					var1++;
					var0.method213(field1215, 4, var6, 0);
					var0.method213(field1215, 4, var6 - 1, 65535);
					int var7 = var0.method208(field1215) + 4;
					int var8 = var7 + var0.method212(32);
					if (var4 == 1) {
						field2614[0].method329(var8, var6 - 12);
						var8 += 14;
					}
					if (var4 == 2) {
						field2614[1].method329(var8, var6 - 12);
						var8 += 14;
					}
					var0.method213(JagString.join(new JagString[] { var3, field1065, field2034[var2] }), var8, var6, 0);
					var0.method213(JagString.join(new JagString[] { var3, field1065, field2034[var2] }), var8, var6 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 5 && class6.field236 < 2) {
					int var9 = 329 - var1 * 13;
					var1++;
					var0.method213(field2034[var2], 4, var9, 0);
					var0.method213(field2034[var2], 4, var9 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 6 && class6.field236 < 2) {
					int var10 = 329 - var1 * 13;
					var1++;
					var0.method213(JagString.join(new JagString[] { field521, field2406, var3, field1065, field2034[var2] }), 4, var10, 0);
					var0.method213(JagString.join(new JagString[] { field521, field2406, var3, field1065, field2034[var2] }), 4, var10 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("j.c(B)V")
	public static void method534() {
		field1430 = null;
		field1440 = null;
		field1435 = null;
		field1439 = null;
		field1434 = null;
		field1437 = null;
		field1438 = null;
		ClientMouseListener.field1412 = null;
		field1431 = null;
		field1429 = null;
		field1432 = null;
		field1436 = null;
	}

	@ObfuscatedName("ib.a(I)Z")
	public static boolean method521() {
		return field311 != null;
	}

	@ObfuscatedName("ub.a(Z)V")
	public static void method991() {
		field3051 = null;
		field3046 = null;
		field3045 = null;
		field3043 = null;
		field3035 = null;
		GameShell.canvas = null;
		field3044 = null;
		field3054 = null;
		field3053 = null;
	}

	@ObfuscatedName("re.a(I)V")
	public static void method891() {
		method275();
		if (field2295 == 1) {
			field1926[field894 / 100].method551(class119.field2967 - 4 - 8, ClientScript.field523 - 4 + -8);
		}
		if (field2295 == 2) {
			field1926[field894 / 100 + 4].method551(class119.field2967 - 8 - 4, ClientScript.field523 + -4 - 8);
		}
		if (class113.field2800 != -1) {
			method1012(class113.field2800);
			method478(class113.field2800, 334, 4, 512);
		}
		if (field3227 != -1) {
			method1012(field3227);
			method478(field3227, 334, 0, 512);
		}
		method22();
		if (!class6.field224) {
			method757();
			Client.method391();
		} else if (field640 == 0) {
			method483();
		}
		if (field1470 == 1) {
			field2277.method551(472, 296);
		}
		if (field1007) {
			byte var0 = 20;
			int var1 = 16776960;
			if (GameShell.field2635 < 30 && Client.lowMem) {
				var1 = 16711680;
			}
			if (GameShell.field2635 < 20 && !Client.lowMem) {
				var1 = 16711680;
			}
			Client.p12.method210(JagString.join(new JagString[] { field3026, method502(GameShell.field2635) }), 20, var1);
			int var2 = 16776960;
			int var8 = var0 + 15;
			Runtime var3 = Runtime.getRuntime();
			int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
			if (var4 > 32768 && Client.lowMem) {
				var2 = 16711680;
			}
			if (var4 > 65536 && !Client.lowMem) {
				var2 = 16711680;
			}
			Client.p12.method210(JagString.join(new JagString[] { field1786, method502(var4), field1562 }), 35, var2);
			var8 += 15;
			if (field1941) {
				Client.p12.method210(field3211, 50, 16711680);
				var8 += 15;
				field1941 = false;
			}
			if (field410) {
				Client.p12.method210(field2802, var8, 16711680);
				var8 += 15;
				field410 = false;
			}
			if (LocChange.field687) {
				Client.p12.method210(field3213, var8, 16711680);
				LocChange.field687 = false;
				var8 += 15;
			}
		}
		if (field2813 == 0) {
			return;
		}
		int var5 = field2813 / 50;
		int var6 = var5 / 60;
		int var7 = var5 % 60;
		if (var7 < 10) {
			Client.p12.method213(JagString.join(new JagString[] { field3012, method502(var6), field846, method502(var7) }), 4, 329, 16776960);
		} else {
			Client.p12.method213(JagString.join(new JagString[] { field3012, method502(var6), field2165, method502(var7) }), 4, 329, 16776960);
		}
	}

	@ObfuscatedName("be.a([BIB)I")
	public static int method244(byte[] arg0, int arg1) {
		return method1044(0, arg1, arg0);
	}

	@ObfuscatedName("kb.b(B)V")
	public static void method596() {
		field1562 = null;
		field1564 = null;
		field1541 = null;
		Client.field1542 = null;
		field1557 = null;
		field1549 = null;
		field1556 = null;
		field1547 = null;
		field1545 = null;
		field1563 = null;
		field1555 = null;
		field1558 = null;
		field1560 = null;
		field1561 = null;
		field1553 = null;
	}

	@ObfuscatedName("de.a(BIIIIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (method1052(arg3)) {
			method844(arg2, field2922[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@ObfuscatedName("hd.a(IILfe;)V")
	public static void method479(PacketBit arg0) {
		while (true) {
			class119 var1 = (class119) field2694.method802();
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
							} else if (var19 instanceof JagString) {
								arg0.method141(2);
								arg0.method181((JagString) var19);
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
		field1006 = null;
		field1005 = null;
		field993 = null;
		field1000 = null;
		field996 = null;
		field1003 = null;
		field981 = null;
		field989 = null;
		field994 = null;
		field999 = null;
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
		field1166 = null;
		field1171 = null;
		field1160 = null;
		field1169 = null;
		field1167 = null;
		field1162 = null;
	}

	@ObfuscatedName("f.a(Z)I")
	public static int method382() {
		return ClientKeyboardListener.field2430++;
	}

	@ObfuscatedName("nc.a(Llc;BZ)Z")
	public static boolean method734(SignLink arg0, boolean arg1) {
		field1548 = 20;
		try {
			field311 = (MidiStream) Class.forName("jagex3.sound.JavaMidiPlayer").getDeclaredConstructor().newInstance();
			return true;
		} catch (Throwable var3) {
			class21 var2 = arg0.method653();
			if (var2 != null) {
				field311 = new JavaSafeMidiPlayer(arg0, var2);
				return true;
			} else if (arg1) {
				field311 = new JavaBrowserMidiPlayer(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("cb.a(Z)V")
	public static void method265() {
		class72.field1757.method267();
	}

	@ObfuscatedName("he.a([Lad;I[BIIII)V")
	public static void method487(CollisionMap[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					if (arg3 + var7 > 0 && arg3 + var7 < 103 && arg4 + var8 > 0 && arg4 + var8 < 103) {
						arg0[var6].field201[arg3 + var7][arg4 + var8] &= 0xFEFFFFFF;
					}
				}
			}
		}
		Packet var9 = new Packet(arg2);
		for (int var10 = 0; var10 < 4; var10++) {
			for (int var11 = 0; var11 < 64; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					method841(var11 + arg3, 0, var9, arg4 + var12, arg5, arg1, var10);
				}
			}
		}
	}

	@ObfuscatedName("pb.a(IB)La;")
	public static JagString method803(int arg0) {
		JagString var1 = method502(arg0);
		for (int var2 = var1.method10() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[] { var1.method19(0, var2), field1774, var1.method1(var2) });
		}
		if (var1.method10() > 8) {
			var1 = JagString.join(new JagString[] { field2564, var1.method19(0, var1.method10() - 8), field1896, field2629, var1, field2601 });
		} else if (var1.method10() > 4) {
			var1 = JagString.join(new JagString[] { field3136, var1.method19(0, var1.method10() - 4), field2360, field2629, var1, field2601 });
		}
		return JagString.join(new JagString[] { field2406, var1 });
	}

	@ObfuscatedName("ca.c(I)V")
	public static void method257() {
		field460 = null;
		field452 = null;
		class14.field471 = null;
		field469 = null;
		field479 = null;
		field458 = null;
		field465 = null;
		field477 = null;
		class14.field453 = null;
		field473 = null;
		field472 = null;
		field478 = null;
		field470 = null;
		field474 = null;
		field467 = null;
		field468 = null;
		field455 = null;
	}

	@ObfuscatedName("fa.a(IILjd;B)V")
	public static void method387(int arg0, int arg1, Pix32 arg2) {
		if (arg2 == null) {
			return;
		}
		int var3 = class86.field2158 + class113.field2797 & 0x7FF;
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 6400) {
			return;
		}
		int var5 = Model.field2256[var3];
		int var6 = var5 * 256 / (class103.field2589 + 256);
		int var7 = Model.field2258[var3];
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
	public static void method522(int arg0, World arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, CollisionMap[] arg7, int arg8, int arg9) {
		Packet var10 = new Packet(arg5);
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
					LocType var21 = LocType.method389(var11);
					int var22 = method287(var20, var21.field1286, var16 & 0x7, var21.field1298, arg3, var19 & 0x7) + arg9;
					int var23 = method404(var19 & 0x7, var21.field1298, var16 & 0x7, var21.field1286, arg3, var20) + arg6;
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						CollisionMap var24 = null;
						int var25 = arg2;
						if ((field898[1][var22][var23] & 0x2) == 2) {
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

	@ObfuscatedName("be.a(Lbd;ILa;La;)[Ljd;")
	public static Pix32[] method245(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method881(var3, arg0, var4);
	}

	@ObfuscatedName("n.a(I)V")
	public static void method715() {
		field1920 = null;
		class78.field1917 = null;
		field1923 = null;
		field1908 = null;
		field1926 = null;
		field1927 = null;
		field1928 = null;
		field1921 = null;
		field1915 = null;
		field1925 = null;
	}

	@ObfuscatedName("j.a(ILab;[Lad;[BIB)V")
	public static void method535(int arg0, World arg1, CollisionMap[] arg2, byte[] arg3, int arg4) {
		Packet var5 = new Packet(arg3);
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
					CollisionMap var18 = null;
					int var19 = var12;
					if ((field898[1][var16][var17] & 0x2) == 2) {
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

	@ObfuscatedName("f.a(IJ)V")
	public static void method383(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field2146 >= 100) {
			method758(0, field2582, field3234);
			return;
		}
		JagString var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < field2146; var3++) {
			if (class106.field2683[var3] == arg0) {
				method758(0, JagString.join(new JagString[] { var2, field3295 }), field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field1492; var4++) {
			if (class117.field2929[var4] == arg0) {
				method758(0, JagString.join(new JagString[] { field2172, var2, field3138 }), field3234);
				return;
			}
		}
		if (!var2.method5(field2621.field86)) {
			class106.field2683[field2146++] = arg0;
			field1055 = true;
			field1726.method415(251);
			field1726.method157(arg0);
		}
	}

	@ObfuscatedName("ia.a(Lu;ILsa;B)V")
	public static void method507(Js5Loader arg0, int arg1, DataFile arg2) {
		byte[] var3 = null;
		LinkList var4 = field1547;
		synchronized (field1547) {
			for (Js5WorkerRequest var5 = (Js5WorkerRequest) field1547.method802(); var5 != null; var5 = (Js5WorkerRequest) field1547.method809()) {
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
		method1012(field1143);
		if (field1881 != -1) {
			method1012(field1881);
		}
		class9.field321 = 0;
		GameShell.field187.method1054();
		field92 = Pix3D.method362(field92);
		Pix2D.method920();
		method478(field1143, 503, 0, 765);
		if (field1881 != -1) {
			method478(field1881, 503, 0, 765);
		}
		if (class6.field224) {
			method483();
		} else {
			method757();
			Client.method391();
		}
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
			GameShell.field187.method101(0, var0, 0);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("mb.a(I)V")
	public static void method687() {
		field1816 = null;
		field1807 = null;
		field1794 = null;
		field1834 = null;
		BZip2State.field1841 = null;
		BZip2State.field1831 = null;
		field1819 = null;
		field1842 = null;
		field1795 = null;
		field1840 = null;
		field1845 = null;
	}

	@ObfuscatedName("oa.a(IIZ[BI)V")
	public static void method749(int arg0, boolean arg1, byte[] arg2, int arg3) {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			field302 = arg3;
			if (field3030 == 0) {
				field1548 = 1;
			} else {
				int var4 = method632(field3030);
				int var5 = var4 - field2046;
				field1548 = (var5 + 3600) / arg3;
				if (field1548 < 1) {
					field1548 = 1;
				}
			}
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		} else if (field1548 == 0) {
			method7(arg1, arg2, arg0);
		} else {
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		}
	}

	@ObfuscatedName("fd.f(I)V")
	public static void method405() {
		field926 = null;
		field939 = null;
		field925 = null;
		field924 = null;
		field932 = null;
		VarBitType.field936 = null;
		field931 = null;
		field929 = null;
		field942 = null;
		field927 = null;
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
		field487 = null;
		field507 = null;
		field486 = null;
		field506 = null;
		field502 = null;
		field505 = null;
		field488 = null;
		field499 = null;
		field500 = null;
		field503 = null;
		field501 = null;
		field497 = null;
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
			Graphics var4 = GameShell.canvas.getGraphics();
			field993.method101(516, var4, 160);
			field1553.method101(496, var4, 466);
		} catch (Exception var5) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("ie.a(I)V")
	public static void method531() {
		field1404 = null;
		field1403 = null;
		field1402 = null;
		field1397 = null;
		field1407 = null;
		field1394 = null;
		field1393 = null;
		field1406 = null;
		field1405 = null;
		field1392 = null;
		field1396 = null;
	}

	@ObfuscatedName("tc.a(B)V")
	public static void method963() {
		class117.field2917 = null;
		field2922 = null;
		field2930 = null;
		field2926 = null;
		field2919 = null;
		field2931 = null;
		class117.field2929 = null;
		field2927 = null;
		ClientKeyboardListener.field2924 = null;
		field2923 = null;
		field2928 = null;
		class117.field2925 = null;
	}

	@ObfuscatedName("vc.a(Z)V")
	public static void method1017() {
		field3151 = null;
		field3172 = null;
		field3169 = null;
		field3148 = null;
		field3167 = null;
		field3170 = null;
		field3146 = null;
		field3163 = null;
	}

	@ObfuscatedName("ha.b(I)V")
	public static void method466() {
		GameShell.field1747.method570();
		for (int var0 = 0; var0 < 32; var0++) {
			GameShell.field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			GameShell.field3281[var1] = 0L;
		}
		GameShell.field681 = 0;
	}

	@ObfuscatedName("uc.d(B)[Ljd;")
	public static Pix32[] method998() {
		Pix32[] var0 = new Pix32[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			Pix32 var2 = var0[var1] = new Pix32();
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
		for (int var0 = 0; var0 < field965; var0++) {
			int var10002 = LocChange.field684[var0]--;
			if (LocChange.field684[var0] >= -10) {
				JagFX var2 = field955[var0];
				if (var2 == null) {
					var2 = JagFX.method711(Client.field2031, field2369[var0]);
					if (var2 == null) {
						continue;
					}
					LocChange.field684[var0] += var2.method709();
					field955[var0] = var2;
				}
				if (LocChange.field684[var0] < 0) {
					int var9;
					if (field1521[var0] == 0) {
						var9 = class9.field322;
					} else {
						int var3 = (field1521[var0] & 0xFF) * 128;
						int var4 = field1521[var0] >> 16 & 0xFF;
						int var5 = field1521[var0] >> 8 & 0xFF;
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
							LocChange.field684[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var9 = (var3 - var8) * field1559 / var3;
					}
					Wave var10 = var2.method710().method1055(Client.soundDecimator);
					WaveStream var11 = WaveStream.method590(var10, var9);
					var11.method585(ObjType.field2845[var0] - 1);
					Client.soundMixer.method126(var11);
					LocChange.field684[var0] = -100;
				}
			} else {
				field965--;
				for (int var1 = var0; var1 < field965; var1++) {
					field2369[var1] = field2369[var1 + 1];
					field955[var1] = field955[var1 + 1];
					ObjType.field2845[var1] = ObjType.field2845[var1 + 1];
					LocChange.field684[var1] = LocChange.field684[var1 + 1];
					field1521[var1] = field1521[var1 + 1];
				}
				var0--;
			}
		}
		if (field1860 <= 0) {
			return;
		}
		field1860 -= 20;
		if (field1860 < 0) {
			field1860 = 0;
		}
		if (field1860 == 0 && field1554 != 0 && field3037 != -1) {
			method681(0, field3037, field1554, Client.field2702);
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
		class104 var4 = (class104) field1328.method499(var2);
		if (var4 != null) {
			field996.method613(var4);
		}
	}

	@ObfuscatedName("fe.o(I)V")
	public static void method413() {
		field1726.method415(176);
		if (class66.field1648 != -1) {
			method895(class66.field1648);
			field2998 = -1;
			field2364 = true;
			field1055 = true;
			class66.field1648 = -1;
		}
		if (class86.field2166 != -1) {
			method895(class86.field2166);
			field2998 = -1;
			class105.field2637 = true;
			class86.field2166 = -1;
		}
		if (field1143 != -1) {
			method895(field1143);
			field1143 = -1;
			method399(30);
		}
		if (field1881 != -1) {
			method895(field1881);
			field1881 = -1;
		}
		if (field3227 != -1) {
			method895(field3227);
			field3227 = -1;
			field2998 = -1;
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
		field2708 = null;
		field2710 = null;
		field2716 = null;
		field2707 = null;
		Client.field2702 = null;
		field2717 = null;
		Client.soundDecimator = null;
		field2714 = null;
	}

	@ObfuscatedName("rc.a(IIIIIIII)V")
	public static void method882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (Client.lowMem && field75 != arg6) {
			return;
		}
		int var7 = 0;
		if (arg5 == 0) {
			var7 = Client.field3183.method78(arg6, arg2, arg0);
		}
		if (arg5 == 1) {
			var7 = Client.field3183.method47(arg6, arg2, arg0);
		}
		if (arg5 == 2) {
			var7 = Client.field3183.method66(arg6, arg2, arg0);
		}
		if (arg5 == 3) {
			var7 = Client.field3183.method49(arg6, arg2, arg0);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = Client.field3183.method97(arg6, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg5 == 0) {
				Client.field3183.method80(arg6, arg2, arg0);
				LocType var12 = LocType.method389(var8);
				if (var12.field1284) {
					Client.field2569[arg6].method112(arg2, var10, var12.field1311, arg0, var11);
				}
			}
			if (arg5 == 1) {
				Client.field3183.method83(arg6, arg2, arg0);
			}
			if (arg5 == 2) {
				Client.field3183.method91(arg6, arg2, arg0);
				LocType var13 = LocType.method389(var8);
				if (arg2 + var13.field1286 > 103 || var13.field1286 + arg0 > 103 || var13.field1298 + arg2 > 103 || var13.field1298 + arg0 > 103) {
					return;
				}
				if (var13.field1284) {
					Client.field2569[arg6].method113(var13.field1311, arg0, arg2, var10, var13.field1286, var13.field1298);
				}
			}
			if (arg5 == 3) {
				Client.field3183.method87(arg6, arg2, arg0);
				LocType var14 = LocType.method389(var8);
				if (var14.field1284 && var14.field1329 == 1) {
					Client.field2569[arg6].method109(arg0, arg2);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		int var15 = arg6;
		if (arg6 < 3 && (field898[1][arg2][arg0] & 0x2) == 2) {
			var15 = arg6 + 1;
		}
		method270(Client.field2569[arg6], arg1, var15, arg6, arg3, Client.field3183, arg4, arg0, arg2);
		return;
	}

	@ObfuscatedName("jc.b(B)V")
	public static void method543() {
		field1463 = null;
		Client.field1451 = null;
		field1466 = null;
		field1473 = null;
		field1468 = null;
		field1455 = null;
		field1461 = null;
		field1450 = null;
		field1449 = null;
		field1453 = null;
		field1458 = null;
		field1457 = null;
		ClientKeyboardListener.field1465 = null;
	}

	@ObfuscatedName("d.a(IBLbd;I)Lbc;")
	public static PixFont method294(int arg0, Js5 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method965() : null;
	}

	@ObfuscatedName("n.b(I)V")
	public static void method716() {
		class6.field224 = false;
		Client.field2761 = -1;
		field1104 = 0;
		field2547 = 0;
		field1726.field267 = 0;
		field36 = -1;
		field498 = -1;
		field1855 = 0;
		class99.field2434 = -1;
		VarBitType.field941 = 0;
		field1587 = 0;
		field2813 = 0;
		field488.field267 = 0;
		for (int var0 = 0; var0 < field2030.length; var0++) {
			if (field2030[var0] != null) {
				field2030[var0].field2011 = -1;
			}
		}
		for (int var1 = 0; var1 < field2992.length; var1++) {
			if (field2992[var1] != null) {
				field2992[var1].field2011 = -1;
			}
		}
		method399(30);
	}

	@ObfuscatedName("qb.a(B)V")
	public static void method843() {
		field2420 = null;
		field2415 = null;
		field2406 = null;
		field2412 = null;
		field2405 = null;
		field2407 = null;
		field2408 = null;
	}

	@ObfuscatedName("oe.a(I)V")
	public static void method759() {
		field2174 = null;
		field2187 = null;
		field2173 = null;
		field2179 = null;
		field2181 = null;
		field2172 = null;
		field2178 = null;
		field2170 = null;
		field2183 = null;
	}

	@ObfuscatedName("wc.a(IB)Lqd;")
	public static IfType method1053(int arg0) {
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
		field1632 = null;
		field1605 = null;
		field1631 = null;
		field1625 = null;
		GameShell.field1601 = null;
		field1611 = null;
		field1598 = null;
		field1618 = null;
		GameShell.field1599 = null;
		field1622 = null;
	}

	@ObfuscatedName("tc.a(IIII)I")
	public static int method964(int arg0, int arg1, int arg2) {
		if ((field898[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (field898[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ld.b(I)I")
	public static int method662() {
		return ClientMouseListener.field2293++;
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
	public static void method450(int arg0, int arg1, ClientPlayer arg2) {
		if (arg2.field2015 == arg0 && arg0 != -1) {
			int var3 = SeqType.method103(arg0).field1240;
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
		} else if (arg0 == -1 || arg2.field2015 == -1 || SeqType.method103(arg0).field1251 >= SeqType.method103(arg2.field2015).field1251) {
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
		field850 = null;
		field863 = null;
		field858 = null;
		field855 = null;
		field852 = null;
		field859 = null;
		field865 = null;
		field861 = null;
		field856 = null;
		field862 = null;
		field854 = null;
		field851 = null;
	}

	@ObfuscatedName("nc.a(B)V")
	public static void method735() {
		field2037 = null;
		field2044 = null;
		field2036 = null;
		field2054 = null;
		field2048 = null;
		field2055 = null;
		field2041 = null;
		field2056 = null;
		field2051 = null;
		field2035 = null;
		field2045 = null;
		field2047 = null;
		field2052 = null;
	}

	@ObfuscatedName("s.b(I)V")
	public static void method899() {
		field2054 = field2070;
		field865 = field3145;
		Client.field602 = field1928;
		field63 = field719;
		field1807 = field1870;
		field2033 = field3115;
		field326 = field3113;
		field2757 = field2804;
		field1873 = field1920;
		field2598 = field810;
		field3172 = field2329;
		field2066 = field1581;
		field2393 = field1127;
		field1498 = field2903;
		field2928 = field1127;
		field3302 = field3197;
		field2103 = field3280;
		field1006 = field2933;
		field1106 = field1840;
		field862 = field1908;
		field2095 = field3169;
		field1545 = field1244;
		field2707 = field3276;
		field3305 = field3124;
		field1921 = field1758;
		field2096 = field2681;
		field793 = field3279;
		field2337 = field1343;
		field497 = field902;
		field3045 = field2035;
		field2667 = field1269;
		field2097 = field634;
		field2083 = field3169;
		field2639 = field547;
		field900 = field414;
		field855 = field1908;
		field738 = field2381;
		field539 = field2654;
		field720 = field2941;
		field1215 = field1439;
		field2012 = field1611;
		field2767 = field1077;
		field2090 = field3169;
		field2079 = field3169;
		field3057 = field3191;
		field2089 = field3169;
		field2805 = field1403;
		field2091 = field3169;
		field3193 = field2429;
		field3295 = field1214;
		field726 = field2335;
		field2354 = field1011;
		field2391 = field1404;
		field1593 = field2978;
		field3002 = field2687;
		field2583 = field3216;
		field1782 = field3258;
		field1896 = field2420;
		field3138 = field2995;
		field183 = field48;
		field1094 = field2685;
		field1174 = field2764;
		field3265 = field1915;
		field3187 = field1044;
		field1364 = field1345;
		field2077 = field1927;
		field796 = field1494;
		field1522 = field1180;
		field1676 = field1858;
		field2135 = field791;
		field2041 = field2730;
		field3001 = field1079;
		field487 = field1171;
		field2546 = field1503;
		field2139 = field2438;
		field1152 = field310;
		field2602 = field1853;
		field3239 = field1944;
		field507 = field712;
		field2610 = field3151;
		field2088 = field3169;
		field2068 = field976;
		Client.field584 = field3070;
		field303 = field890;
		field2575 = field3148;
		field861 = field3145;
		field785 = field2051;
		field858 = field1908;
		field2106 = field3169;
		field2071 = field3169;
		field1217 = Client.field578;
		field2319 = field2028;
		field2360 = field1011;
		field94 = field2378;
		field2110 = field3169;
		field1362 = field1386;
		field64 = field3190;
		field521 = field2432;
		field452 = field732;
		field2634 = field2359;
		field2092 = field3169;
		field2931 = field2644;
		field1024 = field1632;
		field2086 = field1576;
		field1219 = field3064;
		field3127 = field2993;
		field2140 = field791;
		field1510 = field2662;
		field2094 = field1581;
		field1933 = field1745;
		field1030 = field702;
		field1561 = field2824;
		field2109 = field1908;
		field1392 = field1785;
		field1597 = field418;
		field1142 = field929;
		field2400 = field1073;
		field850 = field2679;
		field2111 = field499;
		field3072 = field2036;
		field3219 = field854;
		field2113 = field3169;
		field2080 = field2940;
		field2067 = field3169;
		field1195 = field2102;
		field1930 = field93;
		field1789 = field716;
		field1557 = field3184;
		field2763 = field59;
		field2576 = field3170;
		field1931 = field2812;
		field1037 = field2562;
		field2093 = field1576;
		field2477 = field3225;
		field2157 = field2977;
		field1203 = field172;
		field2490 = field790;
		field1594 = field795;
		field2407 = field3051;
		field315 = field2563;
		field2431 = field526;
		field1778 = field3189;
		field231 = field1794;
		field2817 = field2980;
		field1432 = field467;
		field666 = Client.field598;
		field1431 = field2048;
		field833 = field1147;
		field2126 = field3125;
		field2778 = field77;
		field1038 = field1150;
		field3008 = field859;
		field2480 = field1776;
		field1657 = field962;
		field1120 = field1618;
		field1885 = field1382;
		field2081 = field3169;
		field957 = field2436;
		field2325 = field3120;
		field2149 = field2032;
		field1043 = field2426;
		field3054 = field474;
		field2074 = field3169;
		field2310 = field2164;
		field1111 = field1618;
		field2104 = field538;
		field3205 = field1436;
		field1102 = field852;
		field2317 = field1022;
		field1449 = field1238;
		field3252 = field3006;
		field49 = field706;
		field2308 = field1406;
		field2296 = field1339;
		field1819 = field1622;
		field218 = field1402;
		field2580 = field409;
		field3012 = field2174;
		field2078 = field3169;
		field1407 = field1883;
		field2675 = field717;
		field926 = field232;
		field1031 = field703;
		field408 = field1232;
		field1874 = field2299;
		field1762 = field2141;
		field2382 = field1264;
		Client.field582 = field838;
		field1527 = field707;
		field2178 = field2279;
		field1482 = field2732;
		field1463 = field2336;
		field2056 = field1430;
		field718 = field98;
		field2582 = field431;
		field1184 = field2420;
		field836 = field977;
		field2061 = field2708;
		field2714 = field1487;
		field1998 = field2304;
		field2948 = field2522;
		field2138 = field215;
		field1076 = field743;
		field2100 = field2298;
		field1501 = field1067;
		field2405 = field505;
		field671 = field2657;
		field2172 = field2279;
		field932 = field83;
		field468 = field2901;
		field2101 = field3169;
	}

	@ObfuscatedName("ra.a(B)V")
	public static void method873() {
		field379.method267();
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
		if (field3030 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			field1548 = arg2;
			if (field3030 == 0) {
				field302 = 0;
			} else {
				int var4 = method632(field3030);
				int var5 = var4 - field2046;
				field302 = (arg2 + var5 + 3600 - 1) / arg2;
			}
			field78 = arg3;
			field975 = arg0;
			field1662 = arg1;
		} else if (field1548 == 0) {
			method7(arg1, arg3, arg0);
		} else {
			field975 = arg0;
			field1662 = arg1;
			field78 = arg3;
		}
	}

	@ObfuscatedName("oa.a(B)V")
	public static void method750() {
		field2126 = null;
		field2141 = null;
		field2139 = null;
		field2127 = null;
		field2150 = null;
		field2136 = null;
		field2151 = null;
		field2131 = null;
		field2133 = null;
		field2128 = null;
		field2143 = null;
		field2135 = null;
		field2149 = null;
		field2140 = null;
		field2138 = null;
	}

	@ObfuscatedName("jc.a(IJ)V")
	public static void method544(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field2146; var2++) {
			if (class106.field2683[var2] == arg0) {
				field1055 = true;
				field2146--;
				for (int var3 = var2; var3 < field2146; var3++) {
					class106.field2683[var3] = class106.field2683[var3 + 1];
				}
				field1726.method415(28);
				field1726.method157(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("qb.a(I[Lqd;IIIIIIIIII)V")
	public static void method844(int arg0, IfType[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg2 > arg7 || arg4 < arg8 || arg7 >= arg10 || arg4 >= arg0) {
			return;
		}
		for (int var11 = 0; var11 < arg1.length; var11++) {
			IfType var12 = arg1[var11];
			if (var12 != null && var12.field2454 == arg5) {
				int var13 = var12.field2502 + arg8 - arg3;
				int var14 = var12.field2462 + arg2 - arg9;
				if (var12.field2489 == 8 && var14 <= arg7 && var13 <= arg4 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
					field1497 = var11;
				}
				if ((var12.field2527 >= 0 || var12.field2525 != 0) && var14 <= arg7 && var13 <= arg4 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
					if (var12.field2527 >= 0) {
						field903 = var12.field2527;
					} else {
						field903 = var11;
					}
				}
				if (var12.field2489 != 0) {
					if (var12.field2520 == 1 && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && var12.field2449 + var13 > arg4) {
						boolean var15 = false;
						if (var12.field2445 != 0) {
							var15 = method104(var12);
						}
						if (!var15) {
							method398(0, var12.field2482, var12.field2495, 0, 42, field3234);
						}
					}
					if (var12.field2520 == 2 && Client.field594 == 0 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var13 + var12.field2449) {
						method398(0, var12.field2470, var12.field2495, 0, 33, JagString.join(new JagString[] { field2564, var12.field2515 }));
					}
					if (var12.field2520 == 3 && arg7 >= var14 && arg4 >= var13 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						byte var16;
						if (arg6 == 3) {
							var16 = 40;
						} else {
							var16 = 9;
						}
						method398(0, field2310, var12.field2495, 0, var16, field3234);
					}
					if (var12.field2520 == 4 && arg7 >= var14 && var13 <= arg4 && arg7 < var12.field2498 + var14 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 23, field3234);
					}
					if (var12.field2520 == 5 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 57, field3234);
					}
					if (var12.field2520 == 6 && field2998 == -1 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && arg4 < var12.field2449 + var13) {
						method398(0, var12.field2482, var12.field2495, 0, 54, field3234);
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
									field1145 = var12.field2495;
									class108.field2704 = var17;
									if (var12.field2491[var17] > 0) {
										ObjType var22 = ObjType.method760(var12.field2491[var17] - 1);
										if (class14.field475 == 1 && var12.field2533) {
											if (field1075 != var12.field2495 || field2281 != var17) {
												method398(var22.field2883, Client.field584, var12.field2495, var17, 56, JagString.join(new JagString[] { field3177, field328, var22.field2827 }));
											}
										} else if (Client.field594 != 1 || !var12.field2533) {
											JagString[] var23 = var22.field2830;
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
														method398(var22.field2883, var23[var24], var12.field2495, var17, var25, JagString.join(new JagString[] { field2334, var22.field2827 }));
													} else if (var24 == 4) {
														method398(var22.field2883, field487, var12.field2495, var17, 11, JagString.join(new JagString[] { field2334, var22.field2827 }));
													}
												}
											}
											if (var12.field2461) {
												method398(var22.field2883, Client.field584, var12.field2495, var17, 19, JagString.join(new JagString[] { field2334, var22.field2827 }));
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
														method398(var22.field2883, var23[var26], var12.field2495, var17, var27, JagString.join(new JagString[] { field2334, var22.field2827 }));
													}
												}
											}
											JagString[] var28 = var12.field2504;
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
														method398(var22.field2883, var28[var29], var12.field2495, var17, var30, JagString.join(new JagString[] { field2334, var22.field2827 }));
													}
												}
											}
											method398(var22.field2883, field2805, var12.field2495, var17, 1006, JagString.join(new JagString[] { field2334, var22.field2827 }));
										} else if ((field2846 & 0x10) == 16) {
											method398(var22.field2883, field1523, var12.field2495, var17, 37, JagString.join(new JagString[] { field1384, field328, var22.field2827 }));
										}
									}
								}
								var17++;
							}
						}
					}
					if (var12.field2442 && var12.field2524 != -1 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
						ObjType var31 = ObjType.method760(var12.field2524);
						if (var12.field2533) {
							JagString[] var32 = var31.field2830;
							if (class118.field2934) {
								var32 = method905(var32);
							}
							if (var32 == null || var32[4] == null) {
								method398(var31.field2883, field487, var12.field2495, var12.field2542 - 1, 11, JagString.join(new JagString[] { field2334, var31.field2827 }));
							} else {
								method398(var31.field2883, var32[4], var12.field2495, var12.field2542 - 1, 11, JagString.join(new JagString[] { field2334, var31.field2827 }));
							}
							if (var32 != null && var32[3] != null) {
								method398(var31.field2883, var32[3], var12.field2495, var12.field2542 - 1, 43, JagString.join(new JagString[] { field2334, var31.field2827 }));
							}
							if (var32 != null && var32[2] != null) {
								method398(var31.field2883, var32[2], var12.field2495, var12.field2542 - 1, 31, JagString.join(new JagString[] { field2334, var31.field2827 }));
							}
							if (var32 != null && var32[1] != null) {
								method398(var31.field2883, var32[1], var12.field2495, var12.field2542 - 1, 6, JagString.join(new JagString[] { field2334, var31.field2827 }));
							}
							if (var32 != null && var32[0] != null) {
								method398(var31.field2883, var32[0], var12.field2495, var12.field2542 - 1, 52, JagString.join(new JagString[] { field2334, var31.field2827 }));
							}
						}
						if (var12.field2495 >= 0) {
							method398(var31.field2883, field2805, var12.field2495, -1, 1007, JagString.join(new JagString[] { field2334, var31.field2827 }));
						} else {
							method398(var31.field2883, field2805, var12.field2454, var12.field2495 & 0x7FFF, 1007, JagString.join(new JagString[] { field2334, var31.field2827 }));
						}
					}
					if (var12.field2494 && var12.field2467 != null && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						JagString var33 = field3234;
						if (var12.field2524 != -1) {
							ObjType var34 = ObjType.method760(var12.field2524);
							var33 = JagString.join(new JagString[] { field2334, var34.field2827 });
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
				} else if (!var12.field2556 || method631(arg6, var11) || field953) {
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
	public static JagException method259(Throwable arg0, String arg1) {
		JagException var2;
		if (arg0 instanceof JagException) {
			var2 = (JagException) arg0;
			var2.field1156 = var2.field1156 + ' ' + arg1;
		} else {
			var2 = new JagException(arg0, arg1);
		}
		return var2;
	}

	@ObfuscatedName("i.a(I)V")
	public static void method500() {
		Object var0 = field213;
		synchronized (field213) {
			if (field307 == 0) {
				GameShell.signlink.method656(5, new Js5NetThread());
			}
			field307 = 600;
		}
	}

	@ObfuscatedName("vc.a(II)V")
	public static void method1018(int arg0) {
		if (!method1052(arg0)) {
			return;
		}
		IfType[] var1 = field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.field2483 != null) {
				method754(var3.field2483, 0, var3, 0);
			}
		}
	}

	@ObfuscatedName("ld.c(I)V")
	public static void method663() {
		field1753 = null;
		GameShell.field1747 = null;
		field1745 = null;
		field1751 = null;
		field1740 = null;
		field1726 = null;
		Client.field1752 = null;
	}

	@ObfuscatedName("ra.a(II)V")
	public static void method874(int arg0) {
		if (arg0 == -1 && field1860 == 0) {
			method669();
		} else if (arg0 != -1 && field3037 != arg0 && field1554 != 0 && field1860 == 0) {
			method670(field1554, arg0, Client.field2702, 0);
		}
		field3037 = arg0;
	}

	@ObfuscatedName("ua.c(I)V")
	public static void method988() {
		class121.field3015 = null;
		field3026 = null;
		field3025 = null;
		field3021 = null;
		class121.field3003 = null;
		field3002 = null;
		field3009 = null;
		field3006 = null;
		field3019 = null;
		field3017 = null;
		field3018 = null;
		field3005 = null;
		field3001 = null;
		field3012 = null;
		field3008 = null;
		field3020 = null;
		field3007 = null;
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
			ClientPlayer var2 = field2030[var1];
			if (var2 != null) {
				Client.method319(var2, 1);
			}
		}
	}

	@ObfuscatedName("ec.a(Lbd;BLa;La;)[Le;")
	public static Pix8[] method372(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method518(arg0, var4, var3);
	}

	@ObfuscatedName("pe.a(III[La;)La;")
	public static JagString method825(int arg0, int arg1, JagString[] arg2) {
		int var3 = 0;
		for (int var4 = 0; var4 < arg0; var4++) {
			if (arg2[arg1 + var4] == null) {
				arg2[arg1 + var4] = field1625;
			}
			var3 += arg2[arg1 + var4].field26;
		}
		byte[] var5 = new byte[var3];
		int var6 = 0;
		for (int var7 = 0; var7 < arg0; var7++) {
			JagString var8 = arg2[arg1 + var7];
			class33.method392(var8.field38, 0, var5, var6, var8.field26);
			var6 += var8.field26;
		}
		JagString var9 = new JagString();
		var9.field26 = var3;
		var9.field38 = var5;
		return var9;
	}

	@ObfuscatedName("fc.a(ILa;IIIILa;)V")
	public static void method398(int arg0, JagString arg1, int arg2, int arg3, int arg4, JagString arg5) {
		if (field1104 >= 500) {
			return;
		}
		if (arg5.method10() <= 0) {
			class102.field2586[field1104] = arg1;
		} else {
			class102.field2586[field1104] = JagString.join(new JagString[] { arg1, field2337, arg5 });
		}
		field1932[field1104] = arg4;
		class72.field1770[field1104] = arg0;
		field994[field1104] = arg3;
		class117.field2925[field1104] = arg2;
		field1104++;
	}

	@ObfuscatedName("kd.a(ZI)V")
	public static void method617(boolean arg0) {
		if (field2769 == null) {
			return;
		}
		try {
			Packet var1 = new Packet(4);
			var1.method141(arg0 ? 2 : 3);
			var1.method153(0);
			field2769.method1016(4, var1.field284);
		} catch (IOException var3) {
			try {
				field2769.method1015();
			} catch (Exception var2) {
			}
			field2769 = null;
			ClientScript.field525++;
		}
	}

	@ObfuscatedName("wb.a(ZII[B)I")
	public static int method1044(int arg0, int arg1, byte[] arg2) {
		int var3 = -1;
		for (int var4 = arg0; var4 < arg1; var4++) {
			var3 = Packet.field2698[(var3 ^ arg2[var4]) & 0xFF] ^ var3 >>> 8;
		}
		return ~var3;
	}

	@ObfuscatedName("a.a(IZ[BI)V")
	public static void method7(boolean arg0, byte[] arg1, int arg2) {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			field311.method305();
			field2046 = 0;
			field78 = null;
			field1548 = 20;
			field3030 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (field1548 > 0) {
			field311.method304(arg2);
			field1548 = 0;
		}
		field3030 = arg2;
		field311.method307(arg1, arg0, arg2);
	}

	@ObfuscatedName("fe.a(III)V")
	public static void method414(int arg0, int arg1) {
		field1726.method415(132);
		field1726.method179(arg1);
		field1726.method162(arg0);
	}

	@ObfuscatedName("n.a(Z)V")
	public static void method717() {
		method594();
		if (field1587 == 2) {
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
		Client.field2626.method554(25, 5, 146, 151, var4, var5, var6, class103.field2589 + 256, field2588, field1842);
		for (int var7 = 0; var7 < field1433; var7++) {
			int var8 = field2023[var7] * 4 + 2 - field2621.field1972 / 32;
			int var9 = field2303[var7] * 4 + 2 - field2621.field1963 / 32;
			method387(var9, var8, field3046[var7]);
		}
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				LinkList var12 = class17.field552[field75][var10][var11];
				if (var12 != null) {
					int var13 = var11 * 4 + 2 - field2621.field1963 / 32;
					int var14 = var10 * 4 + 2 - field2621.field1972 / 32;
					method387(var13, var14, field1578[0]);
				}
			}
		}
		for (int var15 = 0; var15 < field1341; var15++) {
			ClientNpc var16 = field2992[LocChange.field677[var15]];
			if (var16 != null && var16.method42()) {
				NpcType var17 = var16.field3182;
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
			ClientPlayer var21 = field2030[class112.field2758[var20]];
			if (var21 != null && var21.method42()) {
				int var22 = var21.field1972 / 32 - field2621.field1972 / 32;
				int var23 = var21.field1963 / 32 - field2621.field1963 / 32;
				boolean var24 = false;
				long var25 = var21.field86.method9();
				for (int var27 = 0; var27 < field1492; var27++) {
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
		if (field96 != 0 && field2063 % 20 < 10) {
			if (field96 == 1 && field3212 >= 0 && field2992.length > field3212) {
				ClientNpc var29 = field2992[field3212];
				if (var29 != null) {
					int var30 = var29.field1972 / 32 - field2621.field1972 / 32;
					int var31 = var29.field1963 / 32 - field2621.field1963 / 32;
					method400(var30, field680[1], var31);
				}
			}
			if (field96 == 2) {
				int var32 = (class6.field226 - field1408) * 4 + 2 - field2621.field1963 / 32;
				int var33 = (field3304 - field806) * 4 + 2 - field2621.field1972 / 32;
				method400(var33, field680[1], var32);
			}
			if (field96 == 10 && field3290 >= 0 && field2030.length > field3290) {
				ClientPlayer var34 = field2030[field3290];
				if (var34 != null) {
					int var35 = var34.field1963 / 32 - field2621.field1963 / 32;
					int var36 = var34.field1972 / 32 - field2621.field1972 / 32;
					method400(var36, field680[1], var35);
				}
			}
		}
		if (VarBitType.field941 != 0) {
			int var37 = VarBitType.field941 * 4 + 2 - field2621.field1972 / 32;
			int var38 = class108.field2720 * 4 + 2 - field2621.field1963 / 32;
			method387(var38, var37, field680[0]);
		}
		Pix2D.method913(97, 78, 3, 3, 16777215);
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
		field1847 = null;
		field1872 = null;
		field1852 = null;
		field1873 = null;
		GameShell.field1859 = null;
		field1865 = null;
		field1870 = null;
		field1863 = null;
		field1871 = null;
		field1874 = null;
		field1853 = null;
		field1858 = null;
	}

	@ObfuscatedName("md.a(JB)V")
	public static void method703(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field1492 >= 100 && field2189 != 1 || field1492 >= 200) {
			method758(0, field2931, field3234);
			return;
		}
		JagString var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < field1492; var3++) {
			if (class117.field2929[var3] == arg0) {
				method758(0, JagString.join(new JagString[] { var2, field3045 }), field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field2146; var4++) {
			if (class106.field2683[var4] == arg0) {
				method758(0, JagString.join(new JagString[] { field2178, var2, field2054 }), field3234);
				return;
			}
		}
		if (var2.method5(field2621.field86)) {
			return;
		}
		class119.field2951[field1492] = var2;
		class117.field2929[field1492] = arg0;
		class73.field1788[field1492] = 0;
		field1492++;
		field1055 = true;
		field1726.method415(114);
		field1726.method157(arg0);
	}

	@ObfuscatedName("rb.f(I)V")
	public static void method879() {
		ClientKeyboardListener.field2625 = null;
		field2613 = null;
		field2621 = null;
		class104.field2623 = null;
		Client.field2626 = null;
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
		field1328 = null;
		field1339 = null;
		field1343 = null;
		field1309 = null;
		field1307 = null;
	}

	@ObfuscatedName("vb.b(B)V")
	public static void method1013() {
		field3145 = null;
		field3130 = null;
		field3134 = null;
		Client.field3131 = null;
		field3144 = null;
		field3139 = null;
		field3136 = null;
		field3138 = null;
	}

	@ObfuscatedName("uc.f(I)V")
	public static void method999() {
		field3058 = null;
		field3066 = null;
		Client.field3079 = null;
		field3067 = null;
		field3062 = null;
		field3068 = null;
		field3060 = null;
		field3059 = null;
		field3071 = null;
		field3074 = null;
		field3072 = null;
		field3057 = null;
		field3056 = null;
		field3070 = null;
		field3077 = null;
		field3055 = null;
		field3064 = null;
		field3076 = null;
	}

	@ObfuscatedName("j.a(ILjava/awt/Color;La;I)V")
	public static void method536(int arg0, Color arg1, JagString arg2) {
		try {
			Graphics var3 = GameShell.canvas.getGraphics();
			if (field842 == null) {
				field842 = new Font("Helvetica", 1, 13);
				field469 = GameShell.canvas.getFontMetrics(field842);
			}
			if (GameShell.field2402) {
				GameShell.field2402 = false;
				var3.setColor(Color.black);
				var3.fillRect(0, 0, GameShell.field711, GameShell.field2372);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (field1397 == null) {
					field1397 = GameShell.canvas.createImage(304, 34);
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
				var3.drawImage(field1397, GameShell.field711 / 2 - 152, GameShell.field2372 / 2 + -18, null);
			} catch (Exception var7) {
				int var5 = GameShell.field711 / 2 - 152;
				int var6 = GameShell.field2372 / 2 - 18;
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
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("d.c(B)V")
	public static void method295() {
		field621 = null;
		field623 = null;
		field620 = null;
		Client.field657 = null;
		field632 = null;
		field647 = null;
		field634 = null;
		field648 = null;
		field659 = null;
		field669 = null;
		field642 = null;
		field626 = null;
		field622 = null;
		field671 = null;
		field644 = null;
		field672 = null;
		field624 = null;
		field655 = null;
		field645 = null;
		field667 = null;
		field666 = null;
	}

	@ObfuscatedName("ub.a(I)V")
	public static void method992() {
		if (field857 != 0) {
			return;
		}
		int var0 = field3050;
		if (Client.field594 == 1 && class112.field2762 >= 516 && field14 >= 160 && class112.field2762 <= 765 && field14 <= 205) {
			var0 = 0;
		}
		if (!class6.field224) {
			if (var0 == 1 && field1104 > 0) {
				int var1 = field1932[field1104 - 1];
				if (var1 == 53 || var1 == 25 || var1 == 55 || var1 == 48 || var1 == 24 || var1 == 52 || var1 == 6 || var1 == 31 || var1 == 43 || var1 == 11 || var1 == 19 || var1 == 1006) {
					int var2 = field994[field1104 - 1];
					int var3 = class117.field2925[field1104 - 1];
					IfType var4 = method1053(var3);
					if (var4.field2509 || var4.field2529) {
						field3143 = class112.field2762;
						field2815 = false;
						field857 = 2;
						field2410 = var3;
						ObjType.field2829 = field14;
						class113.field2776 = var2;
						if (var3 >> 16 == field3227) {
							field857 = 1;
						}
						if (var3 >> 16 == class86.field2166) {
							field857 = 3;
						}
						field298 = 0;
						return;
					}
				}
			}
			if (var0 == 1 && (field3297 == 1 || method676(field1104 - 1)) && field1104 > 2) {
				var0 = 2;
			}
			if (var0 == 1 && field1104 > 0) {
				method604(field1104 - 1);
			}
			if (var0 == 2 && field1104 > 0) {
				Client.method968();
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
					field1055 = true;
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
		int var12 = field14;
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
		for (int var13 = 0; var13 < field1104; var13++) {
			int var14 = (field1104 - var13 - 1) * 15 + var8 + 31;
			if (var10 > var7 && var10 < var7 + var9 && var12 > var14 - 13 && var12 < var14 + 3) {
				var11 = var13;
			}
		}
		if (var11 != -1) {
			method604(var11);
		}
		if (field640 == 1) {
			field1055 = true;
		}
		class6.field224 = false;
		if (field640 == 2) {
			class105.field2637 = true;
			return;
		}
	}

	@ObfuscatedName("ca.a(Loc;I)V")
	public static synchronized void method261(PcmStream arg0) {
		field1381 = arg0;
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method740() {
		field2089 = null;
		field2076 = null;
		field2101 = null;
		field2102 = null;
		field2077 = null;
		field2110 = null;
		field2061 = null;
		field2071 = null;
		field2104 = null;
		field2091 = null;
		field2109 = null;
		field2113 = null;
		field2081 = null;
		field2096 = null;
		field2080 = null;
		field2070 = null;
		field2112 = null;
		field2086 = null;
		field2088 = null;
		field2111 = null;
		field2100 = null;
		field2079 = null;
		field2083 = null;
		field2066 = null;
		field2092 = null;
		field2068 = null;
		field2078 = null;
		field2082 = null;
		field2067 = null;
		field2093 = null;
		field2085 = null;
		field2103 = null;
		field2097 = null;
		field2106 = null;
		field2069 = null;
		field2060 = null;
		field2090 = null;
		field2094 = null;
		field2074 = null;
		field2062 = null;
		field2095 = null;
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
			Client.field577 = 0;
			field896 = 0;
			LocChange.field693 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && field1692 != null) {
			field1692.method1015();
			field1692 = null;
		}
		if (class103.field2599 == 25 || class103.field2599 == 40) {
			method1028();
			Pix2D.method920();
		}
		if (class103.field2599 == 25) {
			class78.field1922 = 0;
			field948 = 1;
			field2358 = 0;
			field1441 = 1;
			field3301 = 0;
		}
		if (arg0 == 35) {
			method525();
			method722();
			if (GameShell.field187 == null) {
				GameShell.field187 = method875(503, 765, GameShell.canvas);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			GameShell.field187 = null;
			method525();
			method568(GameShell.canvas, Client.field1542, Client.field1087);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			GameShell.field187 = null;
			method722();
			method297(GameShell.canvas, Client.field1087);
		}
		class103.field2599 = arg0;
		GameShell.field2402 = true;
	}

	@ObfuscatedName("ua.a(IBIII)V")
	public static void method989(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = arg0; var4 <= arg0 + arg1; var4++) {
			for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					field1003[0][var5][var4] = 127;
					if (arg3 == var5 && var5 > 0) {
						Client.field1451[0][var5][var4] = Client.field1451[0][var5 - 1][var4];
					}
					if (arg2 + arg3 == var5 && var5 < 103) {
						Client.field1451[0][var5][var4] = Client.field1451[0][var5 + 1][var4];
					}
					if (arg0 == var4 && var4 > 0) {
						Client.field1451[0][var5][var4] = Client.field1451[0][var5][var4 - 1];
					}
					if (arg0 + arg1 == var4 && var4 < 103) {
						Client.field1451[0][var5][var4] = Client.field1451[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("ga.a(IIII)V")
	public static void method423(int arg0, int arg1, int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			field2188 = -1;
			field1072 = -1;
			return;
		}
		int var3 = method712(field75, arg2, arg1) - arg0;
		int var4 = arg1 - field1200;
		int var5 = var3 - field1748;
		int var6 = Model.field2258[field1400];
		int var7 = Model.field2256[field1400];
		int var8 = arg2 - field709;
		int var9 = Model.field2256[field184];
		int var10 = Model.field2258[field184];
		int var11 = var4 * var9 + var8 * var10 >> 16;
		int var12 = var4 * var10 - var8 * var9 >> 16;
		int var14 = var5 * var6 - var7 * var12 >> 16;
		int var15 = var5 * var7 + var6 * var12 >> 16;
		if (var15 < 50) {
			field2188 = -1;
			field1072 = -1;
		} else {
			field1072 = (var11 << 9) / var15 + 256;
			field2188 = (var14 << 9) / var15 + 167;
		}
	}

	@ObfuscatedName("ba.a(ILbd;I)Z")
	public static boolean method148(Js5 arg0, int arg1) {
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
		field320 = Pix3D.method362(field320);
	}

	@ObfuscatedName("kd.a(IIIIIII[Lqd;II)V")
	public static void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IfType[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < arg6.length; var9++) {
			IfType var10 = arg6[var9];
			if (var10 != null && (var10.field2489 == 0 || var10.field2494) && var10 != null && var10.field2454 == arg5 && (!var10.field2556 || field953)) {
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
					if (field801 == 1 && var19) {
						var20 = true;
					}
					boolean var21 = false;
					if (var10.field2544 != -1 && var20 && class17.field548 == null) {
						class12.field419 = class24.field741;
						class17.field548 = var10;
						field2392 = class102.field2568;
					}
					if (field3050 == 1 && var16 <= class112.field2762 && field14 >= var14 && class112.field2762 < var18 && field14 < var17) {
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
							method754(var10.field2487, field14 - var12, var10, class112.field2762 - var11);
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
					if (field2063 == field1237 && var10.field2456 != null && (arg3 & 0x100) != 0) {
						method754(var10.field2456, 0, var10, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("wa.a(ZBI)La;")
	public static JagString method1034(int arg0) {
		return method418(true, arg0);
	}

	@ObfuscatedName("je.b(II)La;")
	public static JagString method566() {
		JagString var0 = new JagString();
		var0.field38 = new byte[100];
		var0.field26 = 0;
		return var0;
	}

	@ObfuscatedName("f.a(B)V")
	public static void method385() {
		field831 = null;
		field843 = null;
		class31.field830 = null;
		field846 = null;
		field833 = null;
		field836 = null;
		field844 = null;
		field838 = null;
		field837 = null;
		field832 = null;
		field842 = null;
		class31.field847 = null;
	}

	@ObfuscatedName("kc.a(IIIIII)V")
	public static void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg3 - 32) * arg3 / arg1;
		field365[0].method329(arg2, arg4);
		field365[1].method329(arg2, arg4 + arg3 - 16);
		Pix2D.method913(arg2, arg4 + 16, 16, arg3 - 32, class108.field2715);
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (arg3 - var5 - 32) * arg0 / (arg1 - arg3);
		Pix2D.method913(arg2, arg4 + var6 + 16, 16, var5, field495);
		Pix2D.method925(arg2, arg4 + var6 + 16, var5, field3226);
		Pix2D.method925(arg2 + 1, arg4 + var6 + 16, var5, field3226);
		Pix2D.method916(arg2, arg4 + var6 + 16, 16, field3226);
		Pix2D.method916(arg2, arg4 + var6 + 17, 16, field3226);
		Pix2D.method925(arg2 + 15, arg4 - -16 - -var6, var5, field2734);
		Pix2D.method925(arg2 + 14, var6 + 17 + arg4, var5 - 1, field2734);
		Pix2D.method916(arg2, arg4 + var6 + var5 + 15, 16, field2734);
		Pix2D.method916(arg2 + 1, arg4 - -var6 + var5 + 14, 15, field2734);
	}

	@ObfuscatedName("i.a(II)La;")
	public static JagString method502(int arg0) {
		return method418(false, arg0);
	}

	@ObfuscatedName("pb.c(I)V")
	public static void method807() {
		class112.field2755.method267();
	}

	@ObfuscatedName("ja.e(B)V")
	public static void method540() {
		if (field1448 > 0) {
			field1442.method310(JavaSafeMidiPlayer.field1446, field1448);
			field1448 = 0;
		}
	}

	@ObfuscatedName("te.b(B)V")
	public static void method975() {
		class119.field2957 = null;
		field2966 = null;
		field2968 = null;
		field2965 = null;
		class119.field2951 = null;
	}

	@ObfuscatedName("td.a(IJ)La;")
	public static JagString method969(long arg0) {
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
				var5[var4] = field220[(int) (var6 - arg0 * 37L)];
			}
			JagString var8 = new JagString();
			var8.field38 = var5;
			var8.field26 = var5.length;
			return var8;
		}
	}

	@ObfuscatedName("wa.a(IIIILh;)V")
	public static void method1035(int arg0, int arg1, int arg2, NpcType arg3) {
		if (field1104 >= 400) {
			return;
		}
		if (arg3.field1136 != null) {
			arg3 = arg3.method457();
		}
		if (arg3 == null || !arg3.field1082) {
			return;
		}
		JagString var4 = arg3.field1112;
		if (arg3.field1103 != 0) {
			var4 = JagString.join(new JagString[] { var4, Client.method390(field2621.field68, arg3.field1103), field1275, field785, method502(arg3.field1103), field2601 });
		}
		if (class14.field475 == 1) {
			method398(arg2, Client.field584, arg1, arg0, 49, JagString.join(new JagString[] { field3177, field805, var4 }));
		} else if (Client.field594 != 1) {
			JagString[] var5 = arg3.field1086;
			if (class118.field2934) {
				var5 = method905(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].method14(field1522)) {
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
						method398(arg2, var5[var6], arg1, arg0, var7, JagString.join(new JagString[] { field2699, var4 }));
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method14(field1522)) {
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
						method398(arg2, var5[var8], arg1, arg0, var10, JagString.join(new JagString[] { field2699, var4 }));
					}
				}
			}
			method398(arg2, field2805, arg1, arg0, 1001, JagString.join(new JagString[] { field2699, var4 }));
		} else if ((field2846 & 0x2) == 2) {
			method398(arg2, field1523, arg1, arg0, 21, JagString.join(new JagString[] { field1384, field805, var4 }));
			return;
		}
	}

	@ObfuscatedName("rc.a(Z)V")
	public static void method883() {
		field2629 = null;
		field2657 = null;
		field2644 = null;
		field2654 = null;
		field2639 = null;
		field2650 = null;
		field2633 = null;
		field2634 = null;
		field2632 = null;
		field2646 = null;
	}

	@ObfuscatedName("hc.a(Lba;II)La;")
	public static JagString method474(Packet arg0) {
		try {
			JagString var1 = new JagString();
			var1.field26 = arg0.method178();
			if (var1.field26 > 32767) {
				var1.field26 = 32767;
			}
			var1.field38 = new byte[var1.field26];
			arg0.field267 += field2357.method1033(arg0.field284, var1.field26, 0, var1.field38, arg0.field267);
			return var1;
		} catch (Exception var2) {
			return field1756;
		}
	}

	@ObfuscatedName("re.a(Lbd;B)I")
	public static int method892(Js5 arg0) {
		int var1 = 0;
		if (arg0.method239(field1567, field479)) {
			var1++;
		}
		if (arg0.method239(field62, field479)) {
			var1++;
		}
		if (arg0.method239(field2333, field479)) {
			var1++;
		}
		if (arg0.method239(field2927, field479)) {
			var1++;
		}
		if (arg0.method239(field406, field479)) {
			var1++;
		}
		if (arg0.method239(field533, field479)) {
			var1++;
		}
		if (arg0.method239(field3020, field479)) {
			var1++;
		}
		if (arg0.method239(field2162, field479)) {
			var1++;
		}
		if (arg0.method239(field455, field479)) {
			var1++;
		}
		if (arg0.method239(field2682, field479)) {
			var1++;
		}
		if (arg0.method239(Client.field609, field479)) {
			var1++;
		}
		if (arg0.method239(field2798, field479)) {
			var1++;
		}
		if (arg0.method239(field2355, field479)) {
			var1++;
		}
		if (arg0.method239(field318, field479)) {
			var1++;
		}
		if (arg0.method239(field478, field479)) {
			var1++;
		}
		if (arg0.method239(field1169, field479)) {
			var1++;
		}
		if (arg0.method239(field2910, field479)) {
			var1++;
		}
		if (arg0.method239(field3163, field479)) {
			var1++;
		}
		if (arg0.method239(field2818, field479)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("je.a(ZLwa;)V")
	public static void method567(Huffman arg0) {
		field2357 = arg0;
	}

	@ObfuscatedName("oa.a(I)V")
	public static void method752() {
		while (true) {
			if (field488.method407(field2547) >= 27) {
				int var0 = field488.method412(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (field2992[var0] == null) {
						field2992[var0] = new ClientNpc();
						var1 = true;
					}
					ClientNpc var2 = field2992[var0];
					LocChange.field677[field1341++] = var0;
					var2.field2008 = field2063;
					int var3 = field644[field488.method412(3)];
					if (var1) {
						var2.field1992 = var3;
					}
					int var4 = field488.method412(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = field488.method412(5);
					int var6 = field488.method412(1);
					if (var5 > 15) {
						var5 -= 32;
					}
					if (var6 == 1) {
						class50.field1348[field2027++] = var0;
					}
					int var7 = field488.method412(1);
					var2.field3182 = NpcType.method864(field488.method412(13));
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
			field488.method408();
			return;
		}
	}

	@ObfuscatedName("pb.d(B)V")
	public static void method808() {
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
			field1558.method101(17, var0, 357);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
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
	public static void method296(ClientEntity arg0) {
		if (arg0.field1987 == 0) {
			return;
		}
		if (arg0.field2011 != -1 && arg0.field2011 < 32768) {
			ClientNpc var1 = field2992[arg0.field2011];
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
			if (field1683 == var4) {
				var4 = 2047;
			}
			ClientPlayer var5 = field2030[var4];
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

	@ObfuscatedName("kc.b(I)V")
	public static void method602() {
		field1576 = null;
		field1578 = null;
		field1591 = null;
		field1583 = null;
		field1567 = null;
		field1582 = null;
		field1581 = null;
		field1597 = null;
		field1594 = null;
		field1595 = null;
		field1593 = null;
		field1572 = null;
		field1566 = null;
	}

	@ObfuscatedName("ta.g(I)V")
	public static void method943() {
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
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
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("id.a(I)V")
	public static void method525() {
		if (!field1159) {
			return;
		}
		field320 = null;
		field1159 = false;
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

	@ObfuscatedName("je.a(Ljava/awt/Component;ZLbd;Lbd;)V")
	public static void method568(Component arg0, Js5 arg1, Js5 arg2) {
		if (field1062) {
			return;
		}
		field472 = method875(265, 128, arg0);
		Pix2D.method920();
		field1435 = method875(265, 128, arg0);
		Pix2D.method920();
		field2044 = method875(171, 509, arg0);
		Pix2D.method920();
		field2608 = method875(132, 360, arg0);
		Pix2D.method920();
		field1935 = method875(200, 360, arg0);
		Pix2D.method920();
		field844 = method875(238, 202, arg0);
		Pix2D.method920();
		field2701 = method875(238, 203, arg0);
		Pix2D.method920();
		field1307 = method875(94, 74, arg0);
		Pix2D.method920();
		field3298 = method875(94, 75, arg0);
		Pix2D.method920();
		byte[] var3 = arg1.method215(field3067, field1751);
		Pix32 var4 = new Pix32(var3, arg0);
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
		Pix32 var9 = method1038(arg2, Client.field583, field3067);
		field2044.method1054();
		var9.method551(382 - var9.field1476 / 2 - 128, 18);
		field2806 = method605(field1245, field3067, arg2);
		field2919 = method605(field1056, field3067, arg2);
		field1177 = method372(arg2, field473, field3067);
		field2055 = new Pix32(128, 265);
		field851 = new Pix32(128, 265);
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
		field3055 = field3067;
		field3071 = field3067;
		field229 = new int[32768];
		class53.field1395 = 0;
		if (field1554 == 0 || Client.lowMem) {
			method672();
		} else {
			method679(Client.field2702, field1691, field3067, field1554);
		}
		method617(false);
		GameShell.field2402 = true;
		field1062 = true;
	}

	@ObfuscatedName("nd.a(IIB)Z")
	public static boolean method741(int arg0, int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		LocType var2 = LocType.method389(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return var2.method515(arg0);
	}

	@ObfuscatedName("j.a(BLa;)V")
	public static void method537(JagString arg0) {
		if (arg0 == null || arg0.method10() == 0) {
			class93.field2330 = 0;
			return;
		}
		JagString var1 = arg0;
		JagString[] var2 = new JagString[100];
		int var3 = 0;
		while (true) {
			int var4 = var1.method8();
			if (var4 == -1) {
				JagString var5 = var1.method40();
				if (var5.method10() > 0) {
					var2[var3++] = var5.method30();
				}
				class93.field2330 = 0;
				label46: for (int var7 = 0; var7 < field1590; var7++) {
					ObjType var8 = ObjType.method760(var7);
					if (var8.field2838 == -1 && var8.field2827 != null) {
						JagString var9 = var8.field2827.method30();
						for (int var10 = 0; var10 < var3; var10++) {
							if (var9.method11(var2[var10]) == -1) {
								continue label46;
							}
						}
						field1017[class93.field2330] = var9;
						class9.field313[class93.field2330] = var7;
						class93.field2330++;
						if (class93.field2330 >= field1017.length) {
							return;
						}
					}
				}
				return;
			}
			JagString var6 = var1.method19(0, var4).method40();
			if (var6.method10() > 0) {
				var2[var3++] = var6.method30();
			}
			var1 = var1.method1(var4 + 1);
		}
	}

	@ObfuscatedName("tb.c(B)V")
	public static void method959() {
		field2903 = null;
		field2899 = null;
		field2906 = null;
		field2894 = null;
		Client.b12 = null;
		field2909 = null;
		field2901 = null;
		field2910 = null;
		field2904 = null;
		field2911 = null;
		Client.p11 = null;
	}

	@ObfuscatedName("k.c(B)V")
	public static void method575() {
		if (field3050 != 1) {
			return;
		}
		if (class112.field2762 >= 539 && class112.field2762 <= 573 && field14 >= 169 && field14 < 205 && field2397[0] != -1) {
			field2364 = true;
			field1055 = true;
			class9.field330 = 0;
		}
		if (class112.field2762 >= 569 && class112.field2762 <= 599 && field14 >= 168 && field14 < 205 && field2397[1] != -1) {
			class9.field330 = 1;
			field1055 = true;
			field2364 = true;
		}
		if (class112.field2762 >= 597 && class112.field2762 <= 627 && field14 >= 168 && field14 < 205 && field2397[2] != -1) {
			field2364 = true;
			class9.field330 = 2;
			field1055 = true;
		}
		if (class112.field2762 >= 625 && class112.field2762 <= 669 && field14 >= 168 && field14 < 203 && field2397[3] != -1) {
			field2364 = true;
			field1055 = true;
			class9.field330 = 3;
		}
		if (class112.field2762 >= 666 && class112.field2762 <= 696 && field14 >= 168 && field14 < 205 && field2397[4] != -1) {
			class9.field330 = 4;
			field1055 = true;
			field2364 = true;
		}
		if (class112.field2762 >= 694 && class112.field2762 <= 724 && field14 >= 168 && field14 < 205 && field2397[5] != -1) {
			field2364 = true;
			field1055 = true;
			class9.field330 = 5;
		}
		if (class112.field2762 >= 722 && class112.field2762 <= 756 && field14 >= 169 && field14 < 205 && field2397[6] != -1) {
			field1055 = true;
			class9.field330 = 6;
			field2364 = true;
		}
		if (class112.field2762 >= 540 && class112.field2762 <= 574 && field14 >= 466 && field14 < 502 && field2397[7] != -1) {
			class9.field330 = 7;
			field2364 = true;
			field1055 = true;
		}
		if (class112.field2762 >= 572 && class112.field2762 <= 602 && field14 >= 466 && field14 < 503 && field2397[8] != -1) {
			field1055 = true;
			field2364 = true;
			class9.field330 = 8;
		}
		if (class112.field2762 >= 599 && class112.field2762 <= 629 && field14 >= 466 && field14 < 503 && field2397[9] != -1) {
			field2364 = true;
			class9.field330 = 9;
			field1055 = true;
		}
		if (class112.field2762 >= 627 && class112.field2762 <= 671 && field14 >= 467 && field14 < 502 && field2397[10] != -1) {
			class9.field330 = 10;
			field2364 = true;
			field1055 = true;
		}
		if (class112.field2762 >= 669 && class112.field2762 <= 699 && field14 >= 466 && field14 < 503 && field2397[11] != -1) {
			class9.field330 = 11;
			field1055 = true;
			field2364 = true;
		}
		if (class112.field2762 >= 696 && class112.field2762 <= 726 && field14 >= 466 && field14 < 503 && field2397[12] != -1) {
			field1055 = true;
			field2364 = true;
			class9.field330 = 12;
		}
		if (class112.field2762 >= 724 && class112.field2762 <= 758 && field14 >= 466 && field14 < 502 && field2397[13] != -1) {
			class9.field330 = 13;
			field1055 = true;
			field2364 = true;
			return;
		}
	}

	@ObfuscatedName("td.c(I)V")
	public static void method970() {
		GameShell.field1747.method571();
		for (int var0 = 0; var0 < 32; var0++) {
			GameShell.field1601[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			GameShell.field3281[var1] = 0L;
		}
		GameShell.field681 = 0;
	}

	@ObfuscatedName("ec.b(Z)V")
	public static void method374() {
		try {
			if (LocChange.field693 == 0) {
				if (field1450 != null) {
					field1450.method1015();
					field1450 = null;
				}
				class78.field1919 = false;
				LocChange.field693 = 1;
				Client.field577 = 0;
				field1380 = null;
			}
			if (LocChange.field693 == 1) {
				if (field1380 == null) {
					field1380 = GameShell.signlink.method657(field545);
				}
				if (field1380.field815 == 2) {
					throw new IOException();
				}
				if (field1380.field815 == 1) {
					field1450 = new class129((Socket) field1380.field818, GameShell.signlink);
					LocChange.field693 = 2;
					field1380 = null;
				}
			}
			if (LocChange.field693 == 2) {
				long var0 = field1843 = field3071.method9();
				field1726.field267 = 0;
				field1726.method141(14);
				int var2 = (int) (var0 >> 16 & 0x1FL);
				field1726.method141(var2);
				field1450.method1016(2, field1726.field284);
				LocChange.field693 = 3;
				field488.field267 = 0;
			}
			if (LocChange.field693 == 3) {
				int var3 = field1450.method1022();
				if (var3 != 0) {
					method612(var3);
					return;
				}
				field488.field267 = 0;
				LocChange.field693 = 4;
			}
			if (LocChange.field693 == 4) {
				if (field488.field267 < 8) {
					int var4 = field1450.method1020();
					if (var4 > 8 - field488.field267) {
						var4 = 8 - field488.field267;
					}
					if (var4 > 0) {
						field1450.method1014(field488.field267, var4, field488.field284);
						field488.field267 += var4;
					}
				}
				if (field488.field267 == 8) {
					field488.field267 = 0;
					field3132 = field488.method174();
					LocChange.field693 = 5;
				}
			}
			if (LocChange.field693 == 5) {
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field3132 >> 32), (int) field3132 };
				field1726.field267 = 0;
				field1726.method141(10);
				field1726.method182(var5[0]);
				field1726.method182(var5[1]);
				field1726.method182(var5[2]);
				field1726.method182(var5[3]);
				field1726.method182(GameShell.signlink.field1701);
				field1726.method157(field3071.method9());
				field1726.method181(field3055);
				field1726.method142(field1993, field964);
				class121.field3003.field267 = 0;
				if (class103.field2599 == 40) {
					class121.field3003.method141(18);
				} else {
					class121.field3003.method141(16);
				}
				class121.field3003.method141(field1726.field267 + 57);
				class121.field3003.method182(435);
				class121.field3003.method141(Client.lowMem ? 1 : 0);
				class121.field3003.method182(Client.field1378.field366);
				class121.field3003.method182(Client.field657.field366);
				class121.field3003.method182(Client.field2376.field366);
				class121.field3003.method182(Client.field3200.field366);
				class121.field3003.method182(Client.field2031.field366);
				class121.field3003.method182(Client.field3131.field366);
				class121.field3003.method182(Client.field2702.field366);
				class121.field3003.method182(Client.field1890.field366);
				class121.field3003.method182(Client.field1087.field366);
				class121.field3003.method182(Client.field1752.field366);
				class121.field3003.method182(Client.field1542.field366);
				class121.field3003.method182(Client.field2324.field366);
				class121.field3003.method182(Client.field2739.field366);
				class121.field3003.method151(field1726.field267, field1726.field284);
				field1450.method1016(class121.field3003.field267, class121.field3003.field284);
				field1726.method416(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				field488.method416(var5);
				LocChange.field693 = 6;
			}
			if (LocChange.field693 == 6 && field1450.method1020() > 0) {
				int var7 = field1450.method1022();
				if (var7 == 21 && class103.field2599 == 20) {
					LocChange.field693 = 7;
				} else if (var7 == 2) {
					LocChange.field693 = 9;
				} else if (var7 == 15 && class103.field2599 == 40) {
					method716();
					return;
				} else if (var7 == 23 && field896 < 1) {
					field896++;
					LocChange.field693 = 0;
				} else {
					method612(var7);
					return;
				}
			}
			if (LocChange.field693 == 7 && field1450.method1020() > 0) {
				class72.field1763 = field1450.method1022() * 60 + 180;
				LocChange.field693 = 8;
			}
			if (LocChange.field693 == 8) {
				Client.field577 = 0;
				method678(JagString.join(new JagString[] { method502(class72.field1763 / 60), field1931 }), field468, field1561);
				if (--class72.field1763 <= 0) {
					LocChange.field693 = 0;
				}
			} else {
				if (LocChange.field693 == 9 && field1450.method1020() >= 8) {
					field1004 = field1450.method1022();
					MidiStream.field1186 = field1450.method1022() == 1;
					field1683 = field1450.method1022();
					field1683 <<= 0x8;
					field1683 += field1450.method1022();
					field2189 = field1450.method1022();
					field1450.method1014(0, 1, field488.field284);
					field488.field267 = 0;
					Client.field2761 = field488.method409();
					field1450.method1014(0, 2, field488.field284);
					field488.field267 = 0;
					field2547 = field488.method145();
					LocChange.field693 = 10;
				}
				if (LocChange.field693 != 10) {
					Client.field577++;
					if (Client.field577 > 2000) {
						if (field896 < 1) {
							field896++;
							if (field915 == field545) {
								field545 = field223;
							} else {
								field545 = field915;
							}
							LocChange.field693 = 0;
						} else {
							method612(-3);
						}
					}
				} else if (field1450.method1020() >= field2547) {
					field488.field267 = 0;
					field1450.method1014(0, field2547, field488.field284);
					method291();
					field2604 = -1;
					method524(false);
					Client.field2761 = -1;
				}
			}
		} catch (IOException var8) {
			if (field896 < 1) {
				if (field915 == field545) {
					field545 = field223;
				} else {
					field545 = field915;
				}
				field896++;
				LocChange.field693 = 0;
			} else {
				method612(-2);
			}
		}
	}

	@ObfuscatedName("rc.a(I)V")
	public static void method884() {
		Object var0 = field213;
		synchronized (field213) {
			if (field307 != 0) {
				field307 = 1;
				try {
					field213.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("ja.a(IBIII)V")
	public static void method541(int arg0, int arg1, int arg2, int arg3) {
		if (JavaSafeMidiPlayer.field1446.length <= field1448) {
			field1442.method310(JavaSafeMidiPlayer.field1446, field1448);
			field1448 = 0;
		}
		JavaSafeMidiPlayer.field1446[field1448++] = arg2 - field1445;
		field1445 = arg2;
		JavaSafeMidiPlayer.field1446[field1448++] = arg3 | arg0 << 8 | arg1 << 16;
	}

	@ObfuscatedName("fe.a(ZBII)La;")
	public static JagString method418(boolean arg0, int arg1) {
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
		JagString var8 = new JagString();
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
		field3127 = null;
		field3120 = null;
		field3118 = null;
		field3125 = null;
		field3124 = null;
		field3115 = null;
		field3111 = null;
		field3113 = null;
		field3128 = null;
		field3126 = null;
	}

	@ObfuscatedName("aa.k(I)V")
	public static void method44() {
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
			field925.method101(4, var0, 4);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public static void method604(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = field994[arg0];
		int var2 = class117.field2925[arg0];
		int var3 = field1932[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = class72.field1770[arg0];
		if (field2811 != 0 && var3 != 1005) {
			field2811 = 0;
			class105.field2637 = true;
		}
		if (var3 == 37) {
			field1726.method415(21);
			field1726.method170(field2949);
			field1726.method179(var2);
			field1726.method150(var4);
			field1726.method150(var1);
			field656 = 2;
			class105.field2649 = var1;
			field1154 = 0;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			field1679 = var2;
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 38) {
			boolean var5 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var5) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			field894 = 0;
			ClientScript.field523 = field14;
			class119.field2967 = class112.field2762;
			field2295 = 2;
			field1726.method415(190);
			field1726.method154(var1 + field806);
			field1726.method150(var4);
			field1726.method150(field1408 + var2);
		}
		if (var3 == 1004) {
			ClientScript.field523 = field14;
			class119.field2967 = class112.field2762;
			field2295 = 2;
			field894 = 0;
			field1726.method415(148);
			field1726.method162(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 27) {
			method491(var1, var4, var2);
			field1726.method415(229);
			field1726.method162(field806 + var1);
			field1726.method162(var4 >> 14 & 0x7FFF);
			field1726.method162(field1408 + var2);
		}
		if (var3 == 1) {
			ClientPlayer var7 = field2030[var4];
			if (var7 != null) {
				method576(1, 0, field2621.field1962[0], var7.field1962[0], 0, false, 0, 1, field2621.field2009[0], var7.field2009[0], 2);
				class119.field2967 = class112.field2762;
				field894 = 0;
				field2295 = 2;
				ClientScript.field523 = field14;
				field1726.method415(221);
				field1726.method163(field2949);
				field1726.method162(var4);
			}
		}
		if (var3 == 26 || var3 == 46) {
			JagString var8 = class102.field2586[arg0];
			int var9 = var8.method11(field1393);
			if (var9 != -1) {
				JagString var10 = var8.method1(var9 + 5).method40();
				JagString var11 = var10.method13().method36();
				boolean var12 = false;
				for (int var13 = 0; var13 < class118.field2939; var13++) {
					ClientPlayer var14 = field2030[class112.field2758[var13]];
					if (var14 != null && var14.field86 != null && var14.field86.method14(var11)) {
						var12 = true;
						method576(1, 0, field2621.field1962[0], var14.field1962[0], 0, false, 0, 1, field2621.field2009[0], var14.field2009[0], 2);
						if (var3 == 26) {
							field1726.method415(96);
							field1726.method169(class112.field2758[var13]);
						}
						if (var3 == 46) {
							field1726.method415(68);
							field1726.method162(class112.field2758[var13]);
						}
						break;
					}
				}
				if (!var12) {
					method758(0, JagString.join(new JagString[] { field718, var11 }), field3234);
				}
			}
		}
		if (var3 == 55) {
			field1726.method415(26);
			field1726.method169(var1);
			field1726.method170(var2);
			field1726.method169(var4);
			field1679 = var2;
			field1154 = 0;
			class105.field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 53) {
			field1726.method415(38);
			field1726.method169(var4);
			field1726.method162(var1);
			field1726.method163(var2);
			class105.field2649 = var1;
			field656 = 2;
			field1154 = 0;
			field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 57) {
			field1726.method415(64);
			field1726.method182(var2);
			IfType var15 = method1053(var2);
			if (var15.field2554 != null && var15.field2554[0][0] == 5) {
				int var16 = var15.field2554[0][1];
				if (class113.field2803[var16] != var15.field2499[0]) {
					class113.field2803[var16] = var15.field2499[0];
					Client.method476(var16);
					field1055 = true;
				}
			}
		}
		if (var3 == 52) {
			field1726.method415(240);
			field1726.method154(var1);
			field1726.method162(var4);
			field1726.method179(var2);
			class105.field2649 = var1;
			field1679 = var2;
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 10) {
			ClientPlayer var17 = field2030[var4];
			if (var17 != null) {
				method576(1, 0, field2621.field1962[0], var17.field1962[0], 0, false, 0, 1, field2621.field2009[0], var17.field2009[0], 2);
				class119.field2967 = class112.field2762;
				field2295 = 2;
				ClientScript.field523 = field14;
				field894 = 0;
				field1726.method415(68);
				field1726.method162(var4);
			}
		}
		if (var3 == 14) {
			ClientPlayer var18 = field2030[var4];
			if (var18 != null) {
				method576(1, 0, field2621.field1962[0], var18.field1962[0], 0, false, 0, 1, field2621.field2009[0], var18.field2009[0], 2);
				field894 = 0;
				field2295 = 2;
				ClientScript.field523 = field14;
				class119.field2967 = class112.field2762;
				field1726.method415(96);
				field1726.method169(var4);
			}
		}
		if (var3 == 1001) {
			class119.field2967 = class112.field2762;
			field2295 = 2;
			ClientScript.field523 = field14;
			field894 = 0;
			ClientNpc var19 = field2992[var4];
			if (var19 != null) {
				NpcType var20 = var19.field3182;
				if (var20.field1136 != null) {
					var20 = var20.method457();
				}
				if (var20 != null) {
					field1726.method415(247);
					field1726.method154(var20.field1137);
				}
			}
		}
		if (var3 == 22) {
			ClientPlayer var21 = field2030[var4];
			if (var21 != null) {
				method576(1, 0, field2621.field1962[0], var21.field1962[0], 0, false, 0, 1, field2621.field2009[0], var21.field2009[0], 2);
				class119.field2967 = class112.field2762;
				field2295 = 2;
				ClientScript.field523 = field14;
				field894 = 0;
				field1726.method415(110);
				field1726.method154(var4);
				field1726.method163(field1075);
				field1726.method150(field2437);
				field1726.method150(field2281);
			}
		}
		if (var3 == 19) {
			field2437 = var4;
			field2281 = var1;
			field1075 = var2;
			class14.field475 = 1;
			field3177 = JagString.join(new JagString[] { field2334, ObjType.method760(var4).field2827, field1393 });
			Client.field594 = 0;
			if (field3177 == null) {
				field3177 = field1631;
			}
			field1055 = true;
			return;
		}
		if (var3 == 15) {
			boolean var22 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var22) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			field894 = 0;
			field2295 = 2;
			ClientScript.field523 = field14;
			class119.field2967 = class112.field2762;
			field1726.method415(168);
			field1726.method162(var4);
			field1726.method169(field806 + var1);
			field1726.method163(field2949);
			field1726.method150(field1408 + var2);
		}
		if (var3 == 23) {
			field1726.method415(64);
			field1726.method182(var2);
			IfType var24 = method1053(var2);
			if (var24.field2554 != null && var24.field2554[0][0] == 5) {
				int var25 = var24.field2554[0][1];
				class113.field2803[var25] = 1 - class113.field2803[var25];
				Client.method476(var25);
				field1055 = true;
			}
		}
		if (var3 == 48) {
			field1726.method415(147);
			field1726.method169(var4);
			field1726.method162(var1);
			field1726.method170(var2);
			field656 = 2;
			class105.field2649 = var1;
			field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
			field1154 = 0;
		}
		if (var3 == 18) {
			JagString var26 = class102.field2586[arg0];
			int var27 = var26.method11(field1393);
			if (var27 != -1) {
				long var28 = var26.method1(var27 + 5).method40().method9();
				int var30 = -1;
				for (int var31 = 0; var31 < field1492; var31++) {
					if (class117.field2929[var31] == var28) {
						var30 = var31;
						break;
					}
				}
				if (var30 != -1 && class73.field1788[var30] > 0) {
					class78.field1924 = 3;
					class105.field2637 = true;
					field2811 = 0;
					field3232 = field3234;
					field1001 = true;
					field958 = class117.field2929[var30];
					field3230 = JagString.join(new JagString[] { field1873, class119.field2951[var30] });
				}
			}
		}
		if (var3 == 1003) {
			field894 = 0;
			field2295 = 2;
			ClientScript.field523 = field14;
			class119.field2967 = class112.field2762;
			field1726.method415(151);
			field1726.method154(var4);
		}
		if (var3 == 1002) {
			method491(var1, var4, var2);
			field1726.method415(62);
			field1726.method150(var4 >> 14 & 0x7FFF);
			field1726.method162(var2 + field1408);
			field1726.method154(field806 + var1);
		}
		if (var3 == 30) {
			ClientNpc var32 = field2992[var4];
			if (var32 != null) {
				method576(1, 0, field2621.field1962[0], var32.field1962[0], 0, false, 0, 1, field2621.field2009[0], var32.field2009[0], 2);
				field894 = 0;
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field2295 = 2;
				field1726.method415(57);
				field1726.method150(var4);
			}
		}
		if (var3 == 49) {
			ClientNpc var33 = field2992[var4];
			if (var33 != null) {
				method576(1, 0, field2621.field1962[0], var33.field1962[0], 0, false, 0, 1, field2621.field2009[0], var33.field2009[0], 2);
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field894 = 0;
				field2295 = 2;
				field1726.method415(208);
				field1726.method169(var4);
				field1726.method169(field2437);
				field1726.method154(field2281);
				field1726.method182(field1075);
			}
		}
		if (var3 == 29) {
			method491(var1, var4, var2);
			field1726.method415(164);
			field1726.method154(field806 + var1);
			field1726.method154(field1408 + var2);
			field1726.method154(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 5 && method491(var1, var4, var2)) {
			field1726.method415(24);
			field1726.method154(field1408 + var2);
			field1726.method169(field2437);
			field1726.method162(var4 >> 14 & 0x7FFF);
			field1726.method154(field2281);
			field1726.method163(field1075);
			field1726.method154(field806 + var1);
		}
		if (var3 == 34) {
			ClientNpc var34 = field2992[var4];
			if (var34 != null) {
				method576(1, 0, field2621.field1962[0], var34.field1962[0], 0, false, 0, 1, field2621.field2009[0], var34.field2009[0], 2);
				field894 = 0;
				field2295 = 2;
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field1726.method415(0);
				field1726.method169(var4);
			}
		}
		if (var3 == 56) {
			field1726.method415(40);
			field1726.method154(var4);
			field1726.method154(var1);
			field1726.method170(var2);
			field1726.method170(field1075);
			field1726.method162(field2437);
			field1726.method169(field2281);
			field1679 = var2;
			field1154 = 0;
			class105.field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 33) {
			IfType var35 = method1053(var2);
			field1055 = true;
			Client.field594 = 1;
			field1523 = var35.field2470;
			field2846 = var35.field2508;
			class14.field475 = 0;
			field2949 = var2;
			field1384 = JagString.join(new JagString[] { field2564, var35.field2515, field1393 });
			if (field2846 == 16) {
				field2364 = true;
				class9.field330 = 3;
				field1055 = true;
			}
			return;
		}
		if (var3 == 1007) {
			IfType var36 = method1053(var2);
			if (var36 != null && var36.field2519 != null && var1 != -1) {
				var36 = var36.field2519[var1];
			}
			if (var36 == null || var36.field2540 < 100000) {
				field1726.method415(151);
				field1726.method154(var4);
			} else {
				method758(0, JagString.join(new JagString[] { method502(var36.field2540), field3203, ObjType.method760(var4).field2827 }), field3234);
			}
		}
		if (var3 == 42) {
			IfType var37 = method1053(var2);
			boolean var38 = true;
			if (var37.field2445 > 0) {
				var38 = method190(var37);
			}
			if (var38) {
				field1726.method415(64);
				field1726.method182(var2);
			}
		}
		if (var3 == 31) {
			field1726.method415(163);
			field1726.method154(var1);
			field1726.method154(var4);
			field1726.method182(var2);
			class105.field2649 = var1;
			field656 = 2;
			field1679 = var2;
			field1154 = 0;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 12) {
			ClientNpc var39 = field2992[var4];
			if (var39 != null) {
				method576(1, 0, field2621.field1962[0], var39.field1962[0], 0, false, 0, 1, field2621.field2009[0], var39.field2009[0], 2);
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field894 = 0;
				field2295 = 2;
				field1726.method415(63);
				field1726.method154(var4);
			}
		}
		if (var3 == 2) {
			boolean var40 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var40) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			field2295 = 2;
			field894 = 0;
			class119.field2967 = class112.field2762;
			ClientScript.field523 = field14;
			field1726.method415(244);
			field1726.method162(var1 + field806);
			field1726.method169(field1408 + var2);
			field1726.method150(var4);
		}
		if (var3 == 3) {
			boolean var42 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var42) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			field894 = 0;
			class119.field2967 = class112.field2762;
			field2295 = 2;
			ClientScript.field523 = field14;
			field1726.method415(85);
			field1726.method169(field1408 + var2);
			field1726.method169(var4);
			field1726.method162(field806 + var1);
		}
		if (var3 == 21) {
			ClientNpc var44 = field2992[var4];
			if (var44 != null) {
				method576(1, 0, field2621.field1962[0], var44.field1962[0], 0, false, 0, 1, field2621.field2009[0], var44.field2009[0], 2);
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field894 = 0;
				field2295 = 2;
				field1726.method415(253);
				field1726.method150(var4);
				field1726.method163(field2949);
			}
		}
		if (var3 == 45 || var3 == 51 || var3 == 13 || var3 == 35) {
			JagString var45 = class102.field2586[arg0];
			int var46 = var45.method11(field1393);
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
			ClientPlayer var49 = field2030[var4];
			if (var49 != null) {
				method576(1, 0, field2621.field1962[0], var49.field1962[0], 0, false, 0, 1, field2621.field2009[0], var49.field2009[0], 2);
				field2295 = 2;
				field894 = 0;
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field1726.method415(220);
				field1726.method150(var4);
			}
		}
		if (var3 == 7) {
			if (class6.field224) {
				Client.field3183.method76(var1 - 4, var2 + -4);
			} else {
				Client.field3183.method76(class112.field2762 - 4, field14 + -4);
			}
		}
		if (var3 == 1006) {
			IfType var50 = method1053(var2);
			if (var50 == null || var50.field2516[var1] < 100000) {
				field1726.method415(151);
				field1726.method154(var4);
			} else {
				method758(0, JagString.join(new JagString[] { method502(var50.field2516[var1]), field3203, ObjType.method760(var4).field2827 }), field3234);
			}
			class105.field2649 = var1;
			field1154 = 0;
			field1679 = var2;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 17) {
			method491(var1, var4, var2);
			field1726.method415(183);
			field1726.method169(var2 + field1408);
			field1726.method150(var4 >> 14 & 0x7FFF);
			field1726.method169(var1 + field806);
		}
		if (var3 == 50) {
			method673(var1, var4, var2);
		}
		if (var3 == 40) {
			method895(field2421);
			field2421 = -1;
			class105.field2637 = true;
		}
		if (var3 == 32 && method491(var1, var4, var2)) {
			field1726.method415(225);
			field1726.method150(var4 >> 14 & 0x7FFF);
			field1726.method154(var2 + field1408);
			field1726.method163(field2949);
			field1726.method162(field806 + var1);
		}
		if (var3 == 25) {
			field1726.method415(228);
			field1726.method162(var4);
			field1726.method170(var2);
			field1726.method162(var1);
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
			field1679 = var2;
			class105.field2649 = var1;
		}
		if (var3 == 11) {
			field1726.method415(29);
			field1726.method163(var2);
			field1726.method169(var1);
			field1726.method162(var4);
			class105.field2649 = var1;
			field1679 = var2;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
			field1154 = 0;
		}
		if (var3 == 41) {
			ClientPlayer var51 = field2030[var4];
			if (var51 != null) {
				method576(1, 0, field2621.field1962[0], var51.field1962[0], 0, false, 0, 1, field2621.field2009[0], var51.field2009[0], 2);
				field2295 = 2;
				ClientScript.field523 = field14;
				class119.field2967 = class112.field2762;
				field894 = 0;
				field1726.method415(187);
				field1726.method154(var4);
			}
		}
		if (var3 == 28) {
			JagString var52 = class102.field2586[arg0];
			int var53 = var52.method11(field1393);
			if (var53 != -1) {
				if (field3227 == -1) {
					method413();
					if (BZip2State.field1844 != -1) {
						field3217 = var52.method1(var53 + 5).method40();
						field3215 = field3227 = BZip2State.field1844;
						field3268 = false;
					}
				} else {
					method758(0, field1921, field3234);
				}
			}
		}
		if (var3 == 8) {
			boolean var54 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var54) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class119.field2967 = class112.field2762;
			field894 = 0;
			field2295 = 2;
			ClientScript.field523 = field14;
			field1726.method415(65);
			field1726.method169(var4);
			field1726.method169(var2 + field1408);
			field1726.method162(field806 + var1);
		}
		if (var3 == 9) {
			method413();
		}
		if (var3 == 54 && field2998 == -1) {
			method414(0, var2);
			field2998 = var2;
		}
		if (var3 == 43) {
			field1726.method415(98);
			field1726.method150(var1);
			field1726.method163(var2);
			field1726.method150(var4);
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			class105.field2649 = var1;
			field1679 = var2;
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 36) {
			boolean var56 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var56) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			ClientScript.field523 = field14;
			field2295 = 2;
			field894 = 0;
			class119.field2967 = class112.field2762;
			field1726.method415(27);
			field1726.method150(field806 + var1);
			field1726.method169(var4);
			field1726.method169(field1408 + var2);
		}
		if (var3 == 39) {
			ClientPlayer var58 = field2030[var4];
			if (var58 != null) {
				method576(1, 0, field2621.field1962[0], var58.field1962[0], 0, false, 0, 1, field2621.field2009[0], var58.field2009[0], 2);
				field894 = 0;
				class119.field2967 = class112.field2762;
				field2295 = 2;
				ClientScript.field523 = field14;
				field1726.method415(211);
				field1726.method162(var4);
			}
		}
		if (var3 == 24) {
			field1726.method415(124);
			field1726.method150(var1);
			field1726.method170(var2);
			field1726.method150(var4);
			field1679 = var2;
			field1154 = 0;
			class105.field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 16) {
			method491(var1, var4, var2);
			field1726.method415(30);
			field1726.method169(var4 >> 14 & 0x7FFF);
			field1726.method169(field1408 + var2);
			field1726.method154(field806 + var1);
		}
		if (var3 == 20) {
			ClientNpc var59 = field2992[var4];
			if (var59 != null) {
				method576(1, 0, field2621.field1962[0], var59.field1962[0], 0, false, 0, 1, field2621.field2009[0], var59.field2009[0], 2);
				field2295 = 2;
				class119.field2967 = class112.field2762;
				ClientScript.field523 = field14;
				field894 = 0;
				field1726.method415(153);
				field1726.method162(var4);
			}
		}
		if (var3 == 47) {
			boolean var60 = method576(0, 0, field2621.field1962[0], var1, 0, false, 0, 0, field2621.field2009[0], var2, 2);
			if (!var60) {
				method576(1, 0, field2621.field1962[0], var1, 0, false, 0, 1, field2621.field2009[0], var2, 2);
			}
			class119.field2967 = class112.field2762;
			ClientScript.field523 = field14;
			field894 = 0;
			field2295 = 2;
			field1726.method415(172);
			field1726.method169(field806 + var1);
			field1726.method150(field2281);
			field1726.method169(var4);
			field1726.method179(field1075);
			field1726.method162(field1408 + var2);
			field1726.method162(field2437);
		}
		if (var3 == 6) {
			field1726.method415(102);
			field1726.method170(var2);
			field1726.method154(var1);
			field1726.method150(var4);
			class105.field2649 = var1;
			field1154 = 0;
			field656 = 2;
			field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == class86.field2166) {
				field656 = 3;
			}
		}
		if (var3 == 4) {
			ClientNpc var62 = field2992[var4];
			if (var62 != null) {
				method576(1, 0, field2621.field1962[0], var62.field1962[0], 0, false, 0, 1, field2621.field2009[0], var62.field2009[0], 2);
				field2295 = 2;
				class119.field2967 = class112.field2762;
				field894 = 0;
				ClientScript.field523 = field14;
				field1726.method415(116);
				field1726.method162(var4);
			}
		}
		if (class14.field475 != 0) {
			class14.field475 = 0;
			field1055 = true;
		}
		if (Client.field594 != 0) {
			field1055 = true;
			Client.field594 = 0;
		}
	}

	@ObfuscatedName("pb.e(I)V")
	public static void method810() {
		if (Client.lowMem && field1472 != field75) {
			method731(field2621.field1962[0], field829, field2604, field2621.field2009[0], field75);
		} else if (field305 != field75) {
			field305 = field75;
			Client.method472(field75);
		}
	}

	@ObfuscatedName("hd.a(II)I")
	public static int method480(int arg0) {
		VarBitType var1 = VarBitType.method686(arg0);
		int var2 = var1.field945;
		int var3 = var1.field933;
		int var4 = var1.field943;
		int var5 = field173[var2 - var4];
		return class113.field2803[var3] >> var4 & var5;
	}

	@ObfuscatedName("fc.a(ILjd;II)V")
	public static void method400(int arg0, Pix32 arg1, int arg2) {
		int var3 = arg0 * arg0 + arg2 * arg2;
		if (var3 <= 4225 || var3 >= 90000) {
			method387(arg2, arg0, arg1);
			return;
		}
		int var4 = class86.field2158 + class113.field2797 & 0x7FF;
		int var5 = Model.field2256[var4];
		int var6 = Model.field2258[var4];
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
		if (class14.field475 == 0 && Client.field594 == 0) {
			method398(0, field3057, class102.field2568, class24.field741, 7, field3234);
		}
		for (int var1 = 0; var1 < Model.field2261; var1++) {
			int var2 = Model.field2252[var1];
			int var3 = var2 & 0x7F;
			int var4 = var2 >> 7 & 0x7F;
			int var5 = var2 >> 29 & 0x3;
			int var6 = var2 >> 14 & 0x7FFF;
			if (var0 != var2) {
				var0 = var2;
				if (var5 == 2 && Client.field3183.method97(field75, var3, var4, var2) >= 0) {
					LocType var7 = LocType.method389(var6);
					if (var7.field1317 != null) {
						var7 = var7.method516();
					}
					if (var7 == null) {
						continue;
					}
					if (class14.field475 == 1) {
						method398(var2, Client.field584, var4, var3, 5, JagString.join(new JagString[] { field3177, field524, var7.field1332 }));
					} else if (Client.field594 != 1) {
						JagString[] var8 = var7.field1291;
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
									method398(var2, var8[var9], var4, var3, var10, JagString.join(new JagString[] { field3136, var7.field1332 }));
								}
							}
						}
						method398(var7.field1321 << 14, field2805, var4, var3, 1004, JagString.join(new JagString[] { field3136, var7.field1332 }));
					} else if ((field2846 & 0x4) == 4) {
						method398(var2, field1523, var4, var3, 32, JagString.join(new JagString[] { field1384, field524, var7.field1332 }));
					}
				}
				if (var5 == 1) {
					ClientNpc var11 = field2992[var6];
					if (var11.field3182.field1084 == 1 && (var11.field1972 & 0x7F) == 64 && (var11.field1963 & 0x7F) == 64) {
						for (int var12 = 0; var12 < field1341; var12++) {
							ClientNpc var13 = field2992[LocChange.field677[var12]];
							if (var13 != null && var11 != var13 && var13.field3182.field1084 == 1 && var11.field1972 == var13.field1972 && var11.field1963 == var13.field1963) {
								method1035(var3, var4, LocChange.field677[var12], var13.field3182);
							}
						}
						for (int var14 = 0; var14 < class118.field2939; var14++) {
							ClientPlayer var15 = field2030[class112.field2758[var14]];
							if (var15 != null && var11.field1972 == var15.field1972 && var11.field1963 == var15.field1963) {
								method272(var4, var3, var15, class112.field2758[var14]);
							}
						}
					}
					method1035(var3, var4, var6, var11.field3182);
				}
				if (var5 == 0) {
					ClientPlayer var16 = field2030[var6];
					if ((var16.field1972 & 0x7F) == 64 && (var16.field1963 & 0x7F) == 64) {
						for (int var17 = 0; var17 < field1341; var17++) {
							ClientNpc var18 = field2992[LocChange.field677[var17]];
							if (var18 != null && var18.field3182.field1084 == 1 && var16.field1972 == var18.field1972 && var16.field1963 == var18.field1963) {
								method1035(var3, var4, LocChange.field677[var17], var18.field3182);
							}
						}
						for (int var19 = 0; var19 < class118.field2939; var19++) {
							ClientPlayer var20 = field2030[class112.field2758[var19]];
							if (var20 != null && var16 != var20 && var16.field1972 == var20.field1972 && var16.field1963 == var20.field1963) {
								method272(var4, var3, var20, class112.field2758[var19]);
							}
						}
					}
					method272(var4, var3, var16, var6);
				}
				if (var5 == 3) {
					LinkList var21 = class17.field552[field75][var3][var4];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.method801(); var22 != null; var22 = (ClientObj) var21.method812()) {
							ObjType var23 = ObjType.method760(var22.field1499);
							if (class14.field475 == 1) {
								method398(var22.field1499, Client.field584, var4, var3, 47, JagString.join(new JagString[] { field3177, field328, var23.field2827 }));
							} else if (Client.field594 != 1) {
								JagString[] var24 = var23.field2835;
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
										method398(var22.field1499, var24[var25], var4, var3, var26, JagString.join(new JagString[] { field2334, var23.field2827 }));
									} else if (var25 == 2) {
										method398(var22.field1499, field1594, var4, var3, 3, JagString.join(new JagString[] { field2334, var23.field2827 }));
									}
								}
								method398(var22.field1499, field2805, var4, var3, 1003, JagString.join(new JagString[] { field2334, var23.field2827 }));
							} else if ((field2846 & 0x1) == 1) {
								method398(var22.field1499, field1523, var4, var3, 15, JagString.join(new JagString[] { field1384, field328, var23.field2827 }));
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rc.a(IILbd;I)Z")
	public static boolean method885(int arg0, int arg1, Js5 arg2) {
		byte[] var3 = arg2.method217(arg0, arg1);
		if (var3 == null) {
			return false;
		} else {
			method229(var3);
			return true;
		}
	}

	@ObfuscatedName("va.a(ILqd;)Lqd;")
	public static IfType method1009(IfType arg0) {
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
			IfType var2 = field2922[var1][arg0.field2544 >> 15 & 0xFFFF];
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

	@ObfuscatedName("id.a(BLba;)[Ljava/lang/Object;")
	public static Object[] method526(Packet arg0) {
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

	@ObfuscatedName("td.d(I)V")
	public static void method971() {
		method542();
		if (class103.field2599 != 10) {
			return;
		}
		int var0 = class112.field2762 - 202;
		int var1 = field3050;
		int var2 = field14 - 171;
		if (class53.field1395 == 0) {
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 100 && var2 <= 140) {
				field2084 = 0;
				class53.field1395 = 3;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 100 && var2 <= 140) {
				class53.field1395 = 2;
				field2084 = 0;
				field3060 = field2104;
				field3077 = field1030;
				field3062 = field2088;
				return;
			}
			return;
		}
		if (class53.field1395 == 2) {
			byte var3 = 60;
			int var6 = var3 + 30;
			if (var1 == 1 && var2 >= 75 && var2 < 90) {
				field2084 = 0;
			}
			var6 += 15;
			if (var1 == 1 && var2 >= 90 && var2 < 105) {
				field2084 = 1;
			}
			var6 += 15;
			if (var1 == 1 && var0 >= 25 && var0 <= 175 && var2 >= 130 && var2 <= 170) {
				field3071 = field3071.method13().method36();
				method678(field2101, field2095, field666);
				method399(20);
				return;
			}
			if (var1 == 1 && var0 >= 185 && var0 <= 335 && var2 >= 130 && var2 <= 170) {
				field3071 = field3067;
				field3055 = field3067;
				class53.field1395 = 0;
			}
			while (true) {
				boolean var4;
				label138: do {
					while (method685()) {
						var4 = false;
						for (int var5 = 0; var5 < field3074.method10(); var5++) {
							if (field2920 == field3074.method6(var5)) {
								var4 = true;
								break;
							}
						}
						if (field2084 != 0) {
							continue label138;
						}
						if (field2885 == 85 && field3071.method10() > 0) {
							field3071 = field3071.method19(0, field3071.method10() - 1);
						}
						if (field2885 == 84 || field2885 == 80) {
							field2084 = 1;
						}
						if (var4 && field3071.method10() < 12) {
							field3071 = field3071.method21(field2920);
						}
					}
					return;
				} while (field2084 != 1);
				if (field2885 == 85 && field3055.method10() > 0) {
					field3055 = field3055.method19(0, field3055.method10() - 1);
				}
				if (field2885 == 84 || field2885 == 80) {
					field2084 = 0;
				}
				if (var4 && field3055.method10() < 20) {
					field3055 = field3055.method21(field2920);
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
		field1902 = null;
		field1885 = null;
		field1886 = null;
		field1883 = null;
		field1901 = null;
		field1896 = null;
		field1889 = null;
		Client.field1890 = null;
	}

	@ObfuscatedName("re.a(ILba;)La;")
	public static JagString method893(Packet arg0) {
		return method474(arg0);
	}

	@ObfuscatedName("ac.a(ILqd;)Z")
	public static boolean method104(IfType arg0) {
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
			method398(0, field3239, 0, 0, 13, JagString.join(new JagString[] { field1393, class119.field2951[var1] }));
			method398(0, field2778, 0, 0, 18, JagString.join(new JagString[] { field1393, class119.field2951[var1] }));
			return true;
		} else if (var1 >= 401 && var1 <= 500) {
			method398(0, field3239, 0, 0, 35, JagString.join(new JagString[] { field1393, arg0.field2474 }));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bb.a(BLqd;)Z")
	public static boolean method190(IfType arg0) {
		int var1 = arg0.field2445;
		if (class23.field701 == 2) {
			if (var1 == 201) {
				class78.field1924 = 1;
				field3230 = field2546;
				field1001 = true;
				field2811 = 0;
				field3232 = field3234;
				class105.field2637 = true;
			}
			if (var1 == 202) {
				class78.field1924 = 2;
				field3230 = field738;
				class105.field2637 = true;
				field2811 = 0;
				field1001 = true;
				field3232 = field3234;
			}
		}
		if (var1 == 205) {
			field1750 = 250;
			return true;
		}
		if (var1 == 501) {
			field2811 = 0;
			class78.field1924 = 4;
			class105.field2637 = true;
			field3230 = field2602;
			field3232 = field3234;
			field1001 = true;
		}
		if (var1 == 502) {
			class105.field2637 = true;
			field2811 = 0;
			class78.field1924 = 5;
			field1001 = true;
			field3232 = field3234;
			field3230 = field720;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = (var1 - 300) / 2;
			int var3 = var1 & 0x1;
			field2302.method642(var2, var3 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = (var1 - 314) / 2;
			int var5 = var1 & 0x1;
			field2302.method644(var5 == 1, var4);
		}
		if (var1 == 324) {
			field2302.method643(false);
		}
		if (var1 == 325) {
			field2302.method643(true);
		}
		if (var1 == 326) {
			field1726.method415(231);
			field2302.method635(field1726);
			return true;
		}
		if (var1 == 620) {
			field3268 = !field3268;
		}
		if (var1 >= 601 && var1 <= 613) {
			method413();
			if (field3217.method10() > 0) {
				field1726.method415(202);
				field1726.method157(field3217.method9());
				field1726.method141(var1 - 601);
				field1726.method141(field3268 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("hd.f(I)V")
	public static void method481() {
		field1060.method267();
		field3278.method267();
	}

	@ObfuscatedName("de.a(II)[B")
	public static synchronized byte[] method324(int arg0) {
		if (arg0 == 100 && class17.field551 > 0) {
			byte[] var1 = class113.field2801[--class17.field551];
			class113.field2801[class17.field551] = null;
			return var1;
		} else if (arg0 == 5000 && Client.field585 > 0) {
			byte[] var2 = field2179[--Client.field585];
			field2179[Client.field585] = null;
			return var2;
		} else if (arg0 == 30000 && VarBitType.field934 > 0) {
			byte[] var3 = field1541[--VarBitType.field934];
			field1541[VarBitType.field934] = null;
			return var3;
		} else {
			return new byte[arg0];
		}
	}

	@ObfuscatedName("va.a(ILe;)V")
	public static void method1010(Pix8 arg0) {
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
		if (field3050 != 1) {
			return;
		}
		if (class112.field2762 >= 6 && class112.field2762 <= 106 && field14 >= 467 && field14 <= 499) {
			field504 = true;
			field1864 = (field1864 + 1) % 4;
			class105.field2637 = true;
			field1726.method415(32);
			field1726.method141(field1864);
			field1726.method141(class6.field236);
			field1726.method141(ObjType.field2828);
		}
		if (class112.field2762 >= 135 && class112.field2762 <= 235 && field14 >= 467 && field14 <= 499) {
			class105.field2637 = true;
			class6.field236 = (class6.field236 + 1) % 3;
			field504 = true;
			field1726.method415(32);
			field1726.method141(field1864);
			field1726.method141(class6.field236);
			field1726.method141(ObjType.field2828);
		}
		if (class112.field2762 >= 273 && class112.field2762 <= 373 && field14 >= 467 && field14 <= 499) {
			ObjType.field2828 = (ObjType.field2828 + 1) % 3;
			field504 = true;
			class105.field2637 = true;
			field1726.method415(32);
			field1726.method141(field1864);
			field1726.method141(class6.field236);
			field1726.method141(ObjType.field2828);
		}
		if (class112.field2762 < 412 || class112.field2762 > 512 || field14 < 467 || field14 > 499) {
			return;
		}
		if (field3227 == -1) {
			method413();
			if (BZip2State.field1844 != -1) {
				field3268 = false;
				field3215 = field3227 = BZip2State.field1844;
				field3217 = field3234;
				return;
			}
		} else {
			method758(0, field1921, field3234);
		}
		return;
	}

	@ObfuscatedName("ta.h(I)V")
	public static void method946() {
		ObjType.field2845 = null;
	}

	@ObfuscatedName("nb.g(I)V")
	public static void method726() {
		field500.method267();
		class106.field2680.method267();
		field3249.method267();
	}

	@ObfuscatedName("aa.c(Z)V")
	public static void method46() {
		field83 = null;
		field77 = null;
		field78 = null;
		field93 = null;
		field92 = null;
		field67 = null;
		field101 = null;
		field94 = null;
		field98 = null;
		field64 = null;
	}

	@ObfuscatedName("id.a(B)Z")
	public static boolean method527() {
		long var0 = currentTime();
		int var2 = (int) (var0 - field2271);
		field2271 = var0;
		if (var2 > 200) {
			var2 = 200;
		}
		MidiStream.field1189 += var2;
		if (field2144 == 0 && class31.field845 == 0 && field1260 == 0 && field3285 == 0) {
			return true;
		} else if (field2769 == null) {
			return false;
		} else {
			try {
				if (MidiStream.field1189 > 30000) {
					throw new IOException();
				}
				while (class31.field845 < 20 && field3285 > 0) {
					class104 var3 = (class104) class103.field2596.method497();
					Packet var4 = new Packet(4);
					var4.method141(1);
					var4.method153((int) var3.field2073);
					field2769.method1016(4, var4.field284);
					class78.field1917.method498(var3, var3.field2073);
					field3285--;
					class31.field845++;
				}
				while (field2144 < 20 && field1260 > 0) {
					class104 var5 = (class104) field996.method608();
					Packet var6 = new Packet(4);
					var6.method141(0);
					var6.method153((int) var5.field2073);
					field2769.method1016(4, var6.field284);
					var5.method468();
					BZip2State.field1831.method498(var5, var5.field2073);
					field2144++;
					field1260--;
				}
				for (int var7 = 0; var7 < 100; var7++) {
					int var8 = field2769.method1020();
					if (var8 < 0) {
						throw new IOException();
					}
					if (var8 == 0) {
						break;
					}
					MidiStream.field1189 = 0;
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
									Js5Loader var15 = class50.field1350[var14];
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
									BZip2State.field1803++;
									return false;
								}
								ClientScript.field525 = 0;
								BZip2State.field1803 = 0;
								field967.field2615.method976((field967.field2073 & 0xFF0000L) == 16711680L, (int) (field967.field2073 & 0xFFFFL), field3180, field2613.field284);
							}
							field967.method739();
							field967 = null;
							field2613 = null;
							class102.field2559 = 0;
							if (field3180) {
								class31.field845--;
							} else {
								field2144--;
							}
						} else {
							if (class102.field2559 != 512) {
								break;
							}
							class102.field2559 = 0;
						}
					} else {
						int var17 = var9 - field2301.field267;
						if (var17 > var8) {
							var17 = var8;
						}
						field2769.method1014(field2301.field267, var17, field2301.field284);
						if (class14.field476 != 0) {
							for (int var18 = 0; var18 < var17; var18++) {
								field2301.field284[field2301.field267 + var18] ^= class14.field476;
							}
						}
						field2301.field267 += var17;
						if (var9 > field2301.field267) {
							break;
						}
						if (field967 == null) {
							field2301.field267 = 0;
							int var19 = field2301.method144();
							int var20 = field2301.method145();
							int var21 = field2301.method144();
							int var22 = field2301.method167();
							long var23 = (long) ((var19 << 16) + var20);
							class104 var25 = (class104) class78.field1917.method499(var23);
							field3180 = true;
							if (var25 == null) {
								var25 = (class104) BZip2State.field1831.method499(var23);
								field3180 = false;
							}
							if (var25 == null) {
								throw new IOException();
							}
							field967 = var25;
							int var26 = var21 == 0 ? 5 : 9;
							field2613 = new Packet(field967.field2619 + var26 + var22);
							field2613.method141(var21);
							field2613.method182(var22);
							class102.field2559 = 8;
							field2301.field267 = 0;
						} else if (class102.field2559 == 0) {
							if (field2301.field284[0] == -1) {
								field2301.field267 = 0;
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
				ClientScript.field525++;
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
			if (field3227 != -1 && field3227 == field3215) {
				if (field2885 == 85 && field3217.method10() > 0) {
					field3217 = field3217.method19(0, field3217.method10() - 1);
				}
				if ((method936(field2920) || field2920 == 32) && field3217.method10() < 12) {
					field3217 = field3217.method21(field2920);
				}
			} else if (field1001) {
				if (field2885 == 85 && field3232.method10() > 0) {
					field3232 = field3232.method19(0, field3232.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && field3232.method10() < 80) {
					field3232 = field3232.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					field1001 = false;
					class105.field2637 = true;
					if (class78.field1924 == 1) {
						long var9 = field3232.method9();
						method703(var9);
					}
					if (class78.field1924 == 2 && field1492 > 0) {
						long var11 = field3232.method9();
						method624(var11);
					}
					if (class78.field1924 == 3 && field3232.method10() > 0) {
						field1726.method415(207);
						field1726.method141(0);
						int var13 = field1726.field267;
						field1726.method157(field958);
						method105(field3232, field1726);
						field1726.method155(field1726.field267 - var13);
						if (class6.field236 == 2) {
							class6.field236 = 1;
							field504 = true;
							field1726.method415(32);
							field1726.method141(field1864);
							field1726.method141(class6.field236);
							field1726.method141(ObjType.field2828);
						}
					}
					if (class78.field1924 == 4 && field2146 < 100) {
						long var14 = field3232.method9();
						method383(var14);
					}
					if (class78.field1924 == 5 && field2146 > 0) {
						long var16 = field3232.method9();
						method544(var16);
					}
				}
			} else if (field2811 == 1) {
				if (field2885 == 85 && field3210.method10() > 0) {
					field3210 = field3210.method19(0, field3210.method10() - 1);
					class105.field2637 = true;
				}
				if (method1037(field2920) && field3210.method10() < 10) {
					field3210 = field3210.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					if (field3210.method10() > 0) {
						int var0 = 0;
						if (field3210.method33()) {
							var0 = field3210.method3();
						}
						field1726.method415(238);
						field1726.method182(var0);
					}
					class105.field2637 = true;
					field2811 = 0;
				}
			} else if (field2811 == 2) {
				if (field2885 == 85 && field3210.method10() > 0) {
					field3210 = field3210.method19(0, field3210.method10() - 1);
					class105.field2637 = true;
				}
				if ((method936(field2920) || field2920 == 32) && field3210.method10() < 12) {
					field3210 = field3210.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84) {
					if (field3210.method10() > 0) {
						field1726.method415(86);
						field1726.method157(field3210.method9());
					}
					field2811 = 0;
					class105.field2637 = true;
				}
			} else if (field2811 == 3) {
				if (field2885 == 85 && field3210.method10() > 0) {
					field3210 = field3210.method19(0, field3210.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && field3210.method10() < 40) {
					field3210 = field3210.method21(field2920);
					class105.field2637 = true;
				}
			} else if (class86.field2166 == -1 && field1143 == -1) {
				if (field2885 == 85 && field3223.method10() > 0) {
					field3223 = field3223.method19(0, field3223.method10() - 1);
					class105.field2637 = true;
				}
				if (method45(field2920) && field3223.method10() < 80) {
					field3223 = field3223.method21(field2920);
					class105.field2637 = true;
				}
				if (field2885 == 84 && field3223.method10() > 0) {
					if (field1004 == 2) {
						if (field3223.method5(field2783)) {
							method960();
						}
						if (field3223.method5(field676)) {
							field1007 = true;
						}
						if (field3223.method5(field2968)) {
							field1007 = false;
						}
						if (field3223.method5(field789)) {
							for (int var1 = 0; var1 < 4; var1++) {
								for (int var2 = 1; var2 < 103; var2++) {
									for (int var3 = 1; var3 < 103; var3++) {
										Client.field2569[var1].field201[var2][var3] = 0;
									}
								}
							}
						}
						if (field3223.method5(field2497) && field2182 == 2) {
							throw new RuntimeException();
						}
						if (field3223.method5(field228)) {
							field953 = true;
						}
					}
					if (field3223.method26(field1765)) {
						field1726.method415(248);
						field1726.method141(field3223.method10() - 1);
						field1726.method181(field3223.method1(2));
					} else {
						byte var4 = 0;
						JagString var5 = field3223.method30();
						byte var6 = 0;
						if (var5.method26(field2391)) {
							var6 = 0;
							field3223 = field3223.method1(field2391.method10());
						} else if (var5.method26(field326)) {
							field3223 = field3223.method1(field326.method10());
							var6 = 1;
						} else if (var5.method26(field64)) {
							var6 = 2;
							field3223 = field3223.method1(field64.method10());
						} else if (var5.method26(field2296)) {
							var6 = 3;
							field3223 = field3223.method1(field2296.method10());
						} else if (var5.method26(field63)) {
							var6 = 4;
							field3223 = field3223.method1(field63.method10());
						} else if (var5.method26(field2077)) {
							field3223 = field3223.method1(field2077.method10());
							var6 = 5;
						} else if (var5.method26(field2157)) {
							var6 = 6;
							field3223 = field3223.method1(field2157.method10());
						} else if (var5.method26(field1885)) {
							var6 = 7;
							field3223 = field3223.method1(field1885.method10());
						} else if (var5.method26(field2767)) {
							var6 = 8;
							field3223 = field3223.method1(field2767.method10());
						} else if (var5.method26(field2583)) {
							var6 = 9;
							field3223 = field3223.method1(field2583.method10());
						} else if (var5.method26(field2477)) {
							field3223 = field3223.method1(field2477.method10());
							var6 = 10;
						} else if (var5.method26(field2598)) {
							field3223 = field3223.method1(field2598.method10());
							var6 = 11;
						}
						JagString var7 = field3223.method30();
						if (var7.method26(field2317)) {
							var4 = 1;
							field3223 = field3223.method1(field2317.method10());
						} else if (var7.method26(field3054)) {
							var4 = 2;
							field3223 = field3223.method1(field3054.method10());
						} else if (var7.method26(field1545)) {
							field3223 = field3223.method1(field1545.method10());
							var4 = 3;
						} else if (var7.method26(field1195)) {
							var4 = 4;
							field3223 = field3223.method1(field1195.method10());
						} else if (var7.method26(field2707)) {
							var4 = 5;
							field3223 = field3223.method1(field2707.method10());
						}
						field1726.method415(75);
						field1726.method141(0);
						int var8 = field1726.field267;
						field1726.method141(var6);
						field1726.method141(var4);
						method105(field3223, field1726);
						field1726.method155(field1726.field267 - var8);
						if (field1864 == 2) {
							field504 = true;
							field1864 = 3;
							field1726.method415(32);
							field1726.method141(field1864);
							field1726.method141(class6.field236);
							field1726.method141(ObjType.field2828);
						}
					}
					class105.field2637 = true;
					field3223 = field3234;
				}
			}
		}
	}

	@ObfuscatedName("se.a(Z)V")
	public static void method932() {
		field410 = true;
		method473();
		if (field1001) {
			Client.b12.method209(field3230, 239, 40, 0);
			Client.b12.method209(JagString.join(new JagString[] { field3232, field989 }), 239, 60, 128);
		} else if (field2811 == 1) {
			Client.b12.method209(field2576, 239, 40, 0);
			Client.b12.method209(JagString.join(new JagString[] { field3210, field989 }), 239, 60, 128);
		} else if (field2811 == 2) {
			Client.b12.method209(field1203, 239, 40, 0);
			Client.b12.method209(JagString.join(new JagString[] { field3210, field989 }), 239, 60, 128);
		} else if (field2811 == 3) {
			if (field3210 != field3209) {
				method537(field3210);
				field3209 = field3210;
			}
			PixFont var15 = Client.p12;
			Pix2D.method912(0, 0, 463, 77);
			for (int var16 = 0; var16 < class93.field2330; var16++) {
				int var17 = var16 * 14 + 18 - class53.field1390;
				if (var17 > 0 && var17 < 110) {
					var15.method209(field1017[var16], 239, var17, 0);
				}
			}
			Pix2D.method919();
			if (class93.field2330 > 5) {
				method601(class53.field1390, class93.field2330 * 14 + 7, 463, 77, 0);
			}
			if (field3210.method10() == 0) {
				Client.b12.method209(field1874, 239, 40, 255);
			} else if (class93.field2330 == 0) {
				Client.b12.method209(field1449, 239, 40, 0);
			}
			var15.method209(JagString.join(new JagString[] { field3210, field989 }), 239, 90, 0);
			Pix2D.method916(0, 77, 479, 0);
		} else if (field1605 != null) {
			Client.b12.method209(field1605, 239, 40, 0);
			Client.b12.method209(field1819, 239, 60, 128);
		} else if (class86.field2166 != -1) {
			boolean var14 = method478(class86.field2166, 96, 2, 479);
			if (!var14) {
				class105.field2637 = true;
			}
		} else if (field2421 == -1) {
			int var1 = 0;
			PixFont var2 = Client.p12;
			Pix2D.method912(0, 0, 463, 77);
			for (int var3 = 0; var3 < 100; var3++) {
				if (field2034[var3] != null) {
					int var4 = field3236[var3];
					JagString var5 = field3130[var3];
					int var6 = field1340 + 70 - var1 * 14;
					byte var7 = 0;
					if (var5 != null && var5.method26(field2612)) {
						var5 = var5.method1(5);
						var7 = 1;
					}
					if (var5 != null && var5.method26(field2535)) {
						var5 = var5.method1(5);
						var7 = 2;
					}
					if (var4 == 0) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(field2034[var3], 4, var6, 0);
						}
					}
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1864 == 0 || field1864 == 1 && method242(var5))) {
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
							var2.method213(JagString.join(new JagString[] { var5, field2165 }), var8, var6, 0);
							int var9 = var8 + var2.method208(var5) + 8;
							var2.method213(field2034[var3], var9, var6, 255);
						}
						var1++;
					}
					if ((var4 == 3 || var4 == 7) && field216 == 0 && (var4 == 7 || class6.field236 == 0 || class6.field236 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(field1215, 4, var6, 0);
							int var10 = var2.method208(field1215) + 4;
							int var11 = var10 + var2.method212(32);
							if (var7 == 1) {
								field2614[0].method329(var11, var6 - 12);
								var11 += 14;
							}
							if (var7 == 2) {
								field2614[1].method329(var11, var6 - 12);
								var11 += 14;
							}
							var2.method213(JagString.join(new JagString[] { var5, field2165 }), var11, var6, 0);
							int var12 = var11 + var2.method208(var5) + 8;
							var2.method213(field2034[var3], var12, var6, 8388608);
						}
					}
					if (var4 == 4 && (ObjType.field2828 == 0 || ObjType.field2828 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(JagString.join(new JagString[] { var5, field2406, field2034[var3] }), 4, var6, 8388736);
						}
					}
					if (var4 == 5 && field216 == 0 && class6.field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method213(field2034[var3], 4, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 6 && field216 == 0 && class6.field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method213(JagString.join(new JagString[] { field521, field2406, var5, field2165 }), 4, var6, 0);
							var2.method213(field2034[var3], var2.method208(JagString.join(new JagString[] { field521, field2406, var5 })) + 12, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 8 && (ObjType.field2828 == 0 || ObjType.field2828 == 1 && method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.method213(JagString.join(new JagString[] { var5, field2406, field2034[var3] }), 4, var6, 8270336);
						}
					}
				}
			}
			Pix2D.method919();
			field3052 = var1 * 14 + 7;
			if (field3052 < 78) {
				field3052 = 78;
			}
			method601(field3052 - field1340 - 77, field3052, 463, 77, 0);
			JagString var13;
			if (field2621 == null || field2621.field86 == null) {
				var13 = field3071;
			} else {
				var13 = field2621.field86;
			}
			var2.method213(JagString.join(new JagString[] { var13, field2165 }), 4, 90, 0);
			var2.method213(JagString.join(new JagString[] { field3223, field989 }), var2.method208(JagString.join(new JagString[] { var13, field1065 })) + 6, 90, 255);
			Pix2D.method916(0, 77, 479, 0);
		} else {
			boolean var0 = method478(field2421, 96, 3, 479);
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
	public static boolean method947(IfType arg0) {
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
		ClientKeyboardListener var0 = ClientKeyboardListener.field2924;
		synchronized (ClientKeyboardListener.field2924) {
			ClientKeyboardListener.field2921 = class105.field2630;
			if (ClientKeyboardListener.field1326 < 0) {
				for (int var1 = 0; var1 < 112; var1++) {
					field1488[var1] = false;
				}
				ClientKeyboardListener.field1326 = ClientKeyboardListener.field3122;
			} else {
				while (ClientKeyboardListener.field1326 != ClientKeyboardListener.field3122) {
					int var2 = ClientKeyboardListener.field52[ClientKeyboardListener.field3122];
					ClientKeyboardListener.field3122 = ClientKeyboardListener.field3122 + 1 & 0x7F;
					if (var2 < 0) {
						field1488[~var2] = false;
					} else {
						field1488[var2] = true;
					}
				}
			}
			class105.field2630 = ClientKeyboardListener.field2365;
		}
	}

	@ObfuscatedName("de.a(Lqd;B)[I")
	public static int[] method325(IfType arg0) {
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
			IfType var5 = field2922[var1][var4 & 0xFFFF];
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
	public static int method105(JagString arg0, Packet arg1) {
		int var2 = arg1.field267;
		arg1.method185(arg0.field26);
		arg1.field267 += field2357.method1036(0, arg1.field267, arg0.field26, arg0.field38, arg1.field284);
		return arg1.field267 - var2;
	}

	@ObfuscatedName("d.a(Ljava/awt/Component;BLbd;)V")
	public static void method297(Component arg0, Js5 arg1) {
		if (field1159) {
			return;
		}
		field1366 = method605(field1567, field479, arg1);
		field2187 = method605(field62, field479, arg1);
		field1845 = method605(field2333, field479, arg1);
		field2770 = method605(field2927, field479, arg1);
		field2745 = method605(field406, field479, arg1);
		field279 = method605(field533, field479, arg1);
		field1558 = method875(96, 479, arg0);
		field2187.method329(0, 0);
		field11 = method875(156, 172, arg0);
		Pix2D.method920();
		field1845.method329(0, 0);
		field1167 = method875(261, 190, arg0);
		field1366.method329(0, 0);
		field925 = method875(334, 512, arg0);
		Pix2D.method920();
		field3208 = method875(50, 496, arg0);
		field1553 = method875(37, 269, arg0);
		field993 = method875(45, 249, arg0);
		Pix32 var2 = method1038(arg1, field3020, field479);
		field2587 = method875(var2.field1475, var2.field1476, arg0);
		var2.method557(0, 0);
		Pix32 var3 = method1038(arg1, field2162, field479);
		field522 = method875(var3.field1475, var3.field1476, arg0);
		var3.method557(0, 0);
		Pix32 var4 = method1038(arg1, field455, field479);
		field2045 = method875(var4.field1475, var4.field1476, arg0);
		var4.method557(0, 0);
		Pix32 var5 = method1038(arg1, field2682, field479);
		field1438 = method875(var5.field1475, var5.field1476, arg0);
		var5.method557(0, 0);
		Pix32 var6 = method1038(arg1, Client.field609, field479);
		field2899 = method875(var6.field1475, var6.field1476, arg0);
		var6.method557(0, 0);
		Pix32 var7 = method1038(arg1, field2798, field479);
		field1780 = method875(var7.field1475, var7.field1476, arg0);
		var7.method557(0, 0);
		Pix32 var8 = method1038(arg1, field2355, field479);
		field3021 = method875(var8.field1475, var8.field1476, arg0);
		var8.method557(0, 0);
		Pix32 var9 = method1038(arg1, field318, field479);
		field1689 = method875(var9.field1475, var9.field1476, arg0);
		var9.method557(0, 0);
		Pix32 var10 = method1038(arg1, field478, field479);
		field843 = method875(var10.field1475, var10.field1476, arg0);
		var10.method557(0, 0);
		field2731 = method605(field1169, field479, arg1);
		field1598 = method605(field2910, field479, arg1);
		field1871 = method605(field3163, field479, arg1);
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
		field2807 = method372(arg1, field2818, field479);
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
		field1159 = true;
	}

	@ObfuscatedName("bd.b(I)V")
	public static void method225() {
		field409 = null;
		field365 = null;
		field406 = null;
		field379 = null;
		field407 = null;
		field375 = null;
		field412 = null;
		field408 = null;
	}

	@ObfuscatedName("ub.a(Llc;Ljava/awt/Component;I)Lb;")
	public static Mixer method993(SignLink arg0, Component arg1) {
		PcmPlayer.method1050(arg1, arg0);
		Mixer var2 = new Mixer();
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
		int[][] var19 = Client.field2569[field75].field201;
		while (var35 != var16) {
			var14 = class17.field546[var16];
			var17 = class50.field1351[var16];
			var16 = (var16 + 1) % var18;
			if (arg3 == var17 && arg9 == var14) {
				var15 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && Client.field2569[field75].method119(var17, arg4 - 1, arg9, var14, arg6, arg3)) {
					var15 = true;
					break;
				}
				if (arg4 < 10 && Client.field2569[field75].method122(arg9, arg6, var14, arg3, var17, arg4 - 1)) {
					var15 = true;
					break;
				}
			}
			if (arg0 != 0 && arg7 != 0 && Client.field2569[field75].method117(arg7, arg3, arg0, arg9, arg1, var14, var17)) {
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
		field2809 = 0;
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
			field2809 = 1;
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
				field1726.method415(73);
				field1726.method141(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				field1726.method415(236);
				field1726.method141(var31 + var31 + 14 + 3);
			}
			if (arg10 == 2) {
				field1726.method415(89);
				field1726.method141(var31 + var31 + 3);
			}
			field1726.method162(var32 + field1408);
			field1726.method172(field1488[82] ? 1 : 0);
			field1726.method162(field806 + var33);
			VarBitType.field941 = class50.field1351[0];
			class108.field2720 = class17.field546[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				field1726.method165(class50.field1351[var36] - var33);
				field1726.method172(class17.field546[var36] - var32);
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
		field2978 = null;
		field2992 = null;
		field2980 = null;
		field2977 = null;
		field2995 = null;
		field2993 = null;
	}

	@ObfuscatedName("he.a(IIBI)Z")
	public static boolean method491(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 14 & 0x7FFF;
		int var4 = Client.field3183.method97(field75, arg0, arg2, arg1);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 >> 6 & 0x3;
		int var6 = var4 & 0x1F;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LocType var7 = LocType.method389(var3);
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
		field2295 = 2;
		ClientScript.field523 = field14;
		field894 = 0;
		return true;
	}

	@ObfuscatedName("j.d(B)V")
	public static void method538() {
		field253.method267();
	}

	@ObfuscatedName("n.c(I)V")
	public static void method718() {
		for (class12 var0 = (class12) ClientScript.field515.method802(); var0 != null; var0 = (class12) ClientScript.field515.method809()) {
			if (var0.field424 != null) {
				Client.soundMixer.method135(var0.field424);
				var0.field424 = null;
			}
			if (var0.field433 != null) {
				Client.soundMixer.method135(var0.field433);
				var0.field433 = null;
			}
		}
		ClientScript.field515.method806();
	}

	@ObfuscatedName("qd.b(B)V")
	public static void method854() {
		field3282.method267();
	}

	@ObfuscatedName("cc.a(IZILaa;I)V")
	public static void method272(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (field2621 == arg2 || field1104 >= 400) {
			return;
		}
		JagString var4;
		if (arg2.field65 == 0) {
			var4 = JagString.join(new JagString[] { arg2.field86, Client.method390(field2621.field68, arg2.field68), field1275, field785, method502(arg2.field68), field2601 });
		} else {
			var4 = JagString.join(new JagString[] { arg2.field86, field1275, field1392, method502(arg2.field65), field2601 });
		}
		if (class14.field475 == 1) {
			method398(arg3, Client.field584, arg0, arg1, 22, JagString.join(new JagString[] { field3177, field1500, var4 }));
		} else if (Client.field594 != 1) {
			for (int var5 = 4; var5 >= 0; var5--) {
				if (Client.field599[var5] != null) {
					int var6 = 0;
					short var7 = 0;
					if (Client.field599[var5].method14(field1522)) {
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
					method398(arg3, Client.field599[var5], arg0, arg1, var6, JagString.join(new JagString[] { field1393, var4 }));
				}
			}
		} else if ((field2846 & 0x8) == 8) {
			method398(arg3, field1523, arg0, arg1, 1, JagString.join(new JagString[] { field1384, field1500, var4 }));
		}
		for (int var8 = 0; var8 < field1104; var8++) {
			if (field1932[var8] == 7) {
				class102.field2586[var8] = JagString.join(new JagString[] { field3057, field2337, field1393, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("u.f(II)La;")
	public static JagString method984(int arg0) {
		return JagString.join(new JagString[] { method502(arg0 >> 24 & 0xFF), field2112, method502(arg0 >> 16 & 0xFF), field2112, method502(arg0 >> 8 & 0xFF), field2112, method502(arg0 & 0xFF) });
	}

	@ObfuscatedName("de.b(I)V")
	public static void method326() {
		field742 = null;
		field743 = null;
		field725 = null;
		field739 = null;
		field726 = null;
		field732 = null;
		field738 = null;
		class24.field724 = null;
		class24.field735 = null;
		class24.field727 = null;
		field733 = null;
	}

	@ObfuscatedName("wb.a(Z)V")
	public static void method1047() {
		field3246 = null;
		field3265 = null;
		GameShell.field3281 = null;
		field3279 = null;
		field3247 = null;
		field3280 = null;
		field3249 = null;
		field3258 = null;
		field3272 = null;
		field3277 = null;
		field3278 = null;
		field3255 = null;
		field3257 = null;
		field3252 = null;
		field3276 = null;
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
		LinkList var2 = class17.field552[field75][arg1][arg0];
		if (var2 == null) {
			Client.field3183.method81(field75, arg1, arg0);
			return;
		}
		int var3 = -99999999;
		ClientObj var4 = null;
		for (ClientObj var5 = (ClientObj) var2.method802(); var5 != null; var5 = (ClientObj) var2.method809()) {
			ObjType var6 = ObjType.method760(var5.field1499);
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
			Client.field3183.method81(field75, arg1, arg0);
			return;
		}
		ClientObj var8 = null;
		ClientObj var9 = null;
		var2.method805(var4);
		for (ClientObj var10 = (ClientObj) var2.method802(); var10 != null; var10 = (ClientObj) var2.method809()) {
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
		Client.field3183.method95(field75, arg1, arg0, method712(field75, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var9, var8);
	}

	@ObfuscatedName("n.a(IZIIILia;)V")
	public static void method719(int arg0, int arg1, int arg2, int arg3, LocType arg4) {
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
		ClientScript.field515.method804(var5);
		if (var5.field428 != null) {
			var5.field437 = (int) ((double) (var5.field425 - var5.field435) * Math.random()) + var5.field435;
		}
	}

	@ObfuscatedName("de.a(Z)V")
	public static void method327() {
		if (ClientMouseListener.field1412 != null) {
			ClientMouseListener var0 = ClientMouseListener.field1412;
			synchronized (ClientMouseListener.field1412) {
				ClientMouseListener.field1412 = null;
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
	public static FluType method317(int arg0) {
		FluType var1 = (FluType) class106.field2663.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2024.method217(arg0, 1);
		FluType var3 = new FluType();
		if (var2 != null) {
			var3.method704(arg0, new Packet(var2));
		}
		var3.method701();
		class106.field2663.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("la.a(ILnb;)V")
	public static void method641(ClientEntity arg0) {
		if (field2063 == arg0.field1981 || arg0.field2015 == -1 || arg0.field1996 != 0 || arg0.field1989 + 1 > SeqType.method103(arg0.field2015).field1223[arg0.field1978]) {
			int var1 = arg0.field1981 - arg0.field1986;
			int var2 = field2063 - arg0.field1986;
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
			Graphics var0 = GameShell.canvas.getGraphics();
			field11.method101(550, var0, 4);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("qd.g(I)V")
	public static void method855() {
		field2522 = null;
		field2477 = null;
		field2484 = null;
		field2512 = null;
		field2492 = null;
		field2497 = null;
		field2535 = null;
		field2443 = null;
		field2480 = null;
		field2546 = null;
		field2490 = null;
	}

	@ObfuscatedName("wa.a(Lbd;La;BLa;)Ljd;")
	public static Pix32 method1038(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method846(var4, arg0, var3);
	}

	@ObfuscatedName("m.a(IIII)V")
	public static void method673(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			field1726.method415(111);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 2) {
			field1726.method415(9);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 3) {
			field1726.method415(193);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 4) {
			field1726.method415(53);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 5) {
			field1726.method415(94);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 6) {
			field1726.method415(213);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 7) {
			field1726.method415(46);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 8) {
			field1726.method415(130);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 9) {
			field1726.method415(157);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
		if (arg1 == 10) {
			field1726.method415(84);
			field1726.method182(arg2);
			field1726.method150(arg0);
		}
	}

	@ObfuscatedName("td.b(Z)V")
	public static void method972() {
		field2933 = null;
		field2940 = null;
		field2941 = null;
		field2943 = null;
		field2948 = null;
	}

	@ObfuscatedName("s.c(I)V")
	public static void method901() {
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
			field1167.method101(553, var0, 205);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("bb.a(IIIIBLqd;III)V")
	public static void method192(int arg0, int arg1, int arg2, int arg3, IfType arg4, int arg5, int arg6, int arg7) {
		if (class121.field3024) {
			class102.field2573 = 32;
		} else {
			class102.field2573 = 0;
		}
		class121.field3024 = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.field2537 -= field3176 * 4;
			if (arg6 == 1) {
				field1055 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.field2537 += field3176 * 4;
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
			if (arg6 == 1) {
				field1055 = true;
			}
		} else if (arg5 - class102.field2573 <= arg2 && arg2 < class102.field2573 + arg5 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && field3176 > 0) {
			class121.field3024 = true;
			int var8 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				class105.field2637 = true;
			}
			if (arg6 == 1) {
				field1055 = true;
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
	public static int method1039(int arg0, IfType arg1) {
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
					var6 = field1483[var2[var4++]];
				}
				if (var8 == 17) {
					var7 = 3;
				}
				if (var8 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					IfType var11 = method1053(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!ObjType.method760(var12).field2880 || MidiStream.field1183)) {
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
					var6 = field1514[class17.field549[var2[var4++]] - 1];
				}
				if (var8 == 7) {
					var6 = class113.field2803[var2[var4++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var6 = field2621.field68;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (MidiStream.field1190[var14]) {
							var6 += class17.field549[var14];
						}
					}
				}
				if (var8 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					IfType var17 = method1053(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!ObjType.method760(var18).field2880 || MidiStream.field1183)) {
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
		for (field3140 += arg0; field3140 >= PcmPlayer.frequency; field3140 -= PcmPlayer.frequency) {
			field1157 -= field1157 >> 2;
		}
		field1157 -= arg0 * 1000;
		if (field1157 < 0) {
			field1157 = 0;
		}
	}

	@ObfuscatedName("je.g(I)V")
	public static void method569() {
		field1488 = null;
		field1486 = null;
		field1482 = null;
		field1491 = null;
		field1501 = null;
		field1494 = null;
		field1498 = null;
		field1500 = null;
		field1483 = null;
		field1487 = null;
		field1481 = null;
		field1503 = null;
	}

	@ObfuscatedName("n.a(IIB)Z")
	public static boolean method720(int arg0, int arg1) {
		if (arg0 == 0 && field1279 == arg1) {
			return true;
		} else if (arg0 == 1 && class52.field1387 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && field3253 == arg1;
		}
	}

	@ObfuscatedName("qd.a(Ljava/awt/Component;I)V")
	public static void method856(Component arg0) {
		Method var1 = SignLink.field1708;
		if (var1 != null) {
			try {
				var1.invoke(arg0, Boolean.FALSE);
			} catch (Throwable var2) {
			}
		}
		arg0.addKeyListener(ClientKeyboardListener.field2924);
		arg0.addFocusListener(ClientKeyboardListener.field2924);
	}

	@ObfuscatedName("s.a(ILjava/awt/Component;)V")
	public static void method902(Component arg0) {
		arg0.removeMouseListener(ClientMouseListener.field1412);
		arg0.removeMouseMotionListener(ClientMouseListener.field1412);
		arg0.removeFocusListener(ClientMouseListener.field1412);
	}

	@ObfuscatedName("ta.c(ZI)V")
	public static void method950(boolean arg0) {
		for (int var1 = 0; var1 < field1341; var1++) {
			ClientNpc var2 = field2992[LocChange.field677[var1]];
			int var3 = (LocChange.field677[var1] << 14) + 536870912;
			if (var2 != null && var2.method42() && arg0 == var2.field3182.field1107 && var2.field3182.method451()) {
				int var4 = var2.field1972 >> 7;
				int var5 = var2.field1963 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field1970 == 1 && (var2.field1972 & 0x7F) == 64 && (var2.field1963 & 0x7F) == 64) {
						if (class121.field3015[var4][var5] == field2399) {
							continue;
						}
						class121.field3015[var4][var5] = field2399;
					}
					if (!var2.field3182.field1082) {
						var3 += Integer.MIN_VALUE;
					}
					Client.field3183.method90(field75, var2.field1972, var2.field1963, method712(field75, (var2.field1970 - 1) * 64 + var2.field1972, var2.field1970 * 64 + var2.field1963 + -64), var2.field1970 * 64 + 60 - 64, var2, var2.field1992, var3, var2.field1979);
				}
			}
		}
	}

	@ObfuscatedName("d.d(B)I")
	public static int method298() {
		int var0 = 3;
		if (field1400 < 310) {
			int var1 = field1200 >> 7;
			int var2 = field709 >> 7;
			if ((field898[field75][var2][var1] & 0x4) != 0) {
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
					if ((field898[field75][var2][var1] & 0x4) != 0) {
						var0 = field75;
					}
					if (var8 >= 65536) {
						if (var2 < var3) {
							var2++;
						} else if (var3 < var2) {
							var2--;
						}
						var8 -= 65536;
						if ((field898[field75][var2][var1] & 0x4) != 0) {
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
					if ((field898[field75][var2][var1] & 0x4) != 0) {
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
						if ((field898[field75][var2][var1] & 0x4) != 0) {
							var0 = field75;
						}
					}
				}
			}
		}
		if ((field898[field75][field2621.field1972 >> 7][field2621.field1963 >> 7] & 0x4) != 0) {
			var0 = field75;
		}
		return var0;
	}

	@ObfuscatedName("nb.b(Z)V")
	public static void method728() {
		field488.method417();
		int var0 = field488.method412(1);
		if (var0 == 0) {
			return;
		}
		int var1 = field488.method412(2);
		if (var1 == 0) {
			class50.field1348[field2027++] = 2047;
		} else if (var1 == 1) {
			int var2 = field488.method412(3);
			field2621.method725(var2, false);
			int var3 = field488.method412(1);
			if (var3 == 1) {
				class50.field1348[field2027++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = field488.method412(3);
			field2621.method725(var4, true);
			int var5 = field488.method412(3);
			field2621.method725(var5, true);
			int var6 = field488.method412(1);
			if (var6 == 1) {
				class50.field1348[field2027++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = field488.method412(1);
			field75 = field488.method412(2);
			int var8 = field488.method412(1);
			if (var8 == 1) {
				class50.field1348[field2027++] = 2047;
			}
			int var9 = field488.method412(7);
			int var10 = field488.method412(7);
			field2621.method729(var10, var7 == 1, var9);
		}
	}

	@ObfuscatedName("cc.g(I)I")
	public static int method273() {
		int var0 = method712(field75, field709, field1200);
		return var0 - field1748 >= 800 || (field898[field75][field709 >> 7][field1200 >> 7] & 0x4) == 0 ? 3 : field75;
	}

	@ObfuscatedName("rd.a(IBII)V")
	public static void method887(int arg0, int arg1, int arg2) {
		if (class9.field322 == 0 || arg1 == 0 || field965 >= 50) {
			return;
		}
		field2369[field965] = arg0;
		ObjType.field2845[field965] = arg1;
		LocChange.field684[field965] = arg2;
		field955[field965] = null;
		field1521[field965] = 0;
		field965++;
	}

	@ObfuscatedName("m.b(Z)V")
	public static synchronized void method674() {
		method1029();
	}

	@ObfuscatedName("rd.a(ILbc;Lbc;)V")
	public static void method888(PixFont arg0, PixFont arg1) {
		field1935.method1054();
		if (class103.field2599 == 0 || class103.field2599 == 5) {
			arg0.method209(field2405, 180, 54, 16777215);
			Pix2D.method922(28, 62, 304, 34, 9179409);
			Pix2D.method922(29, 63, 302, 32, 0);
			Pix2D.method913(30, 64, Client.field3274 * 3, 30, 9179409);
			Pix2D.method913(Client.field3274 * 3 + 30, 64, 300 - Client.field3274 * 3, 30, 0);
			arg0.method209(Client.field3079, 180, 85, 16777215);
		}
		if (class103.field2599 == 20) {
			byte var2 = 40;
			field2806.method329(0, 0);
			arg0.method211(field3060, 180, 40, 16776960, true);
			int var8 = var2 + 15;
			arg0.method211(field3077, 180, 55, 16776960, true);
			int var9 = var8 + 15;
			arg0.method211(field3062, 180, 70, 16776960, true);
			int var10 = var9 + 15;
			int var11 = var10 + 10;
			arg0.method206(JagString.join(new JagString[] { field3002, field3071 }), 90, 95, 16777215, true);
			int var13 = var11 + 15;
			arg0.method206(JagString.join(new JagString[] { field1037, field3055.method12() }), 92, 110, 16777215, true);
			int var15 = var13 + 15;
		}
		if (class103.field2599 == 10) {
			field2806.method329(0, 0);
			if (class53.field1395 == 0) {
				byte var5 = 80;
				arg0.method211(Client.field582, 180, 80, 16776960, true);
				int var23 = var5 + 30;
				field2919.method329(27, 100);
				arg0.method195(field2639, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				field2919.method329(187, 100);
				arg0.method195(field2149, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (class53.field1395 == 2) {
				byte var3 = 40;
				arg0.method211(field3060, 180, 40, 16776960, true);
				int var12 = var3 + 15;
				arg0.method211(field3077, 180, 55, 16776960, true);
				int var14 = var12 + 15;
				arg0.method211(field3062, 180, 70, 16776960, true);
				int var16 = var14 + 15;
				int var17 = var16 + 10;
				arg0.method206(JagString.join(new JagString[] { field3002, field3071, field2063 % 40 < 20 & field2084 == 0 ? field1204 : field3067 }), 90, 95, 16777215, true);
				int var19 = var17 + 15;
				arg0.method206(JagString.join(new JagString[] { field1037, field3055.method12(), field2063 % 40 < 20 & field2084 == 1 ? field1204 : field3067 }), 92, 110, 16777215, true);
				field2919.method329(27, 130);
				int var21 = var19 + 15;
				arg0.method211(field926, 100, 155, 16777215, true);
				field2919.method329(187, 130);
				arg0.method211(field3302, 260, 155, 16777215, true);
			} else if (class53.field1395 == 3) {
				arg0.method211(field3265, 180, 40, 16776960, true);
				byte var4 = 65;
				arg0.method211(field2757, 180, 65, 16777215, true);
				int var18 = var4 + 15;
				arg0.method211(field2675, 180, 80, 16777215, true);
				int var20 = var18 + 15;
				arg0.method211(field2667, 180, 95, 16777215, true);
				int var22 = var20 + 15;
				arg0.method211(field2400, 180, 110, 16777215, true);
				field2919.method329(107, 130);
				arg0.method211(field3302, 180, 155, 16777215, true);
				int var24 = var22 + 15;
			}
		}
		method281();
		try {
			Graphics var6 = GameShell.canvas.getGraphics();
			field1935.method101(202, var6, 171);
			field472.method101(0, var6, 0);
			field1435.method101(637, var6, 0);
			if (GameShell.field2402) {
				GameShell.field2402 = false;
				field2044.method101(128, var6, 0);
				field2608.method101(202, var6, 371);
				field844.method101(0, var6, 265);
				field2701.method101(562, var6, 265);
				field1307.method101(128, var6, 171);
				field3298.method101(562, var6, 171);
			}
		} catch (Exception var7) {
			GameShell.canvas.repaint();
		}
	}

	@ObfuscatedName("m.a(I)V")
	public static void method675() {
		field1758 = null;
		field1778 = null;
		field1765 = null;
		class72.field1770 = null;
		field1775 = null;
		field1774 = null;
		field1756 = null;
		field1776 = null;
		class72.field1757 = null;
		field1762 = null;
		field1777 = null;
	}

	@ObfuscatedName("bd.a([BI)V")
	public static void method229(byte[] arg0) {
		Packet var1 = new Packet(arg0);
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
		int var1 = field1932[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 45;
	}

	@ObfuscatedName("r.a(IIIII)V")
	public static void method866(int arg0, int arg1, int arg2, int arg3) {
		for (class12 var4 = (class12) ClientScript.field515.method802(); var4 != null; var4 = (class12) ClientScript.field515.method809()) {
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
				if (var4.field423 < var5 - 64 || field1559 == 0 || var4.field416 != arg1) {
					if (var4.field424 != null) {
						Client.soundMixer.method135(var4.field424);
						var4.field424 = null;
					}
					if (var4.field433 != null) {
						Client.soundMixer.method135(var4.field433);
						var4.field433 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field423 - var5) * field1559 / var4.field423;
					if (var4.field424 != null) {
						var4.field424.method582(var6);
					} else if (var4.field420 >= 0) {
						JagFX var7 = JagFX.method711(Client.field2031, var4.field420);
						if (var7 != null) {
							Wave var8 = var7.method710().method1055(Client.soundDecimator);
							WaveStream var9 = WaveStream.method590(var8, var6);
							var9.method585(-1);
							Client.soundMixer.method126(var9);
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
						JagFX var11 = JagFX.method711(Client.field2031, var4.field428[var10]);
						if (var11 != null) {
							Wave var12 = var11.method710().method1055(Client.soundDecimator);
							WaveStream var13 = WaveStream.method590(var12, var6);
							var13.method585(0);
							Client.soundMixer.method126(var13);
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
		ClientMouseListener var0 = ClientMouseListener.field1412;
		synchronized (ClientMouseListener.field1412) {
			field801 = ClientMouseListener.field494;
			class24.field741 = ClientMouseListener.field710;
			class102.field2568 = ClientMouseListener.field496;
			field3050 = ClientMouseListener.field2017;
			class112.field2762 = ClientMouseListener.field2711;
			field14 = ClientMouseListener.field2396;
			field1344 = ClientMouseListener.field919;
			ClientMouseListener.field2017 = 0;
		}
	}

	@ObfuscatedName("h.j(I)Ljd;")
	public static Pix32 method458() {
		Pix32 var0 = new Pix32();
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
	public static PixFont method528(Js5 arg0, JagString arg1, JagString arg2) {
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
		field310 = null;
		field304 = null;
		field279 = null;
		field308 = null;
		field303 = null;
		field253 = null;
		field292 = null;
	}

	@ObfuscatedName("id.b(I)V")
	public static void method529() {
		field1367 = null;
		field1366 = null;
		class52.field1363 = null;
		field1383 = null;
		field1384 = null;
		field1386 = null;
		field1379 = null;
		field1385 = null;
		field1364 = null;
		field1376 = null;
		Client.field1378 = null;
		field1362 = null;
		field1388 = null;
		field1382 = null;
		field1380 = null;
		field1381 = null;
	}

	@ObfuscatedName("nb.i(I)V")
	public static void method730() {
		field2032 = null;
		Client.field2031 = null;
		field1966 = null;
		field2028 = null;
		field2012 = null;
		field1988 = null;
		field2034 = null;
		field2030 = null;
		field2024 = null;
		field2029 = null;
		field2018 = null;
		JagException.signlink = null;
		field1985 = null;
		field1998 = null;
		field2023 = null;
		field1993 = null;
		field2033 = null;
	}

	@ObfuscatedName("kd.a(JI)V")
	public static void method624(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field1492; var2++) {
			if (class117.field2929[var2] == arg0) {
				field1492--;
				field1055 = true;
				for (int var3 = var2; var3 < field1492; var3++) {
					class119.field2951[var3] = class119.field2951[var3 + 1];
					class73.field1788[var3] = class73.field1788[var3 + 1];
					class117.field2929[var3] = class117.field2929[var3 + 1];
				}
				field1726.method415(255);
				field1726.method157(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("m.a(La;La;La;B)V")
	public static void method678(JagString arg0, JagString arg1, JagString arg2) {
		field3062 = arg0;
		field3077 = arg2;
		field3060 = arg1;
	}

	@ObfuscatedName("nb.b(IIIIII)V")
	public static void method731(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field2604 == arg2 && field829 == arg1 && (field1472 == arg4 || !Client.lowMem)) {
			return;
		}
		field1472 = arg4;
		field2604 = arg2;
		if (!Client.lowMem) {
			field1472 = 0;
		}
		field829 = arg1;
		method399(25);
		Client.method872(field3252, false, null);
		int var5 = field1408;
		int var6 = field806;
		field806 = (arg2 - 6) * 8;
		int var7 = field806 - var6;
		field1408 = (arg1 - 6) * 8;
		int var8 = field1408 - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			ClientNpc var10 = field2992[var9];
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
			ClientPlayer var13 = field2030[var12];
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
		for (LocChange var26 = (LocChange) field2284.method802(); var26 != null; var26 = (LocChange) field2284.method809()) {
			var26.field699 -= var8;
			var26.field700 -= var7;
			if (var26.field700 < 0 || var26.field699 < 0 || var26.field700 >= 104 || var26.field699 >= 104) {
				var26.method739();
			}
		}
		field305 = -1;
		if (VarBitType.field941 != 0) {
			VarBitType.field941 -= var7;
			class108.field2720 -= var8;
		}
		field2043 = false;
		field965 = 0;
		class112.field2756.method806();
		class86.field2160.method806();
	}

	@ObfuscatedName("m.a(ZLbd;IBLa;ILa;I)V")
	public static synchronized void method679(Js5 arg0, JagString arg1, JagString arg2, int arg3) {
		if (method521()) {
			int var4 = arg0.method228(arg1);
			int var5 = arg0.method224(var4, arg2);
			method670(arg3, var4, arg0, var5);
		}
	}

	@ObfuscatedName("se.a(B)V")
	public static void method934() {
		field2778 = null;
		class113.field2803 = null;
		class113.field2801 = null;
		field2789 = null;
		field2798 = null;
		class113.field2788 = null;
		class113.field2782 = null;
		field2794 = null;
		field2802 = null;
		field2783 = null;
		field2799 = null;
	}

	@ObfuscatedName("h.a(Llc;BLba;I)V")
	public static void method460(SignLink arg0, Packet arg1, int arg2) {
		class119 var3 = new class119();
		var3.field2964 = arg1.method144();
		var3.field2970 = arg1.method167();
		var3.field2958 = new int[var3.field2964];
		var3.field2961 = new PrivilegedRequest[var3.field2964];
		var3.field2969 = new int[var3.field2964];
		var3.field2963 = new byte[var3.field2964][][];
		var3.field2960 = new PrivilegedRequest[var3.field2964];
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
		field2694.method804(var3);
	}

	@ObfuscatedName("qd.c(B)V")
	public static void method859() {
		class113.field2788.method267();
		class93.field2322.method267();
		field981.method267();
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
		field3189 = null;
		field3186 = null;
		field3196 = null;
		field3187 = null;
		field3179 = null;
		field3177 = null;
		field3193 = null;
		field3190 = null;
		field3194 = null;
		field3184 = null;
		Client.field3183 = null;
		field3191 = null;
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
		Client.p12 = null;
		class106.field2663 = null;
		field2659 = null;
		field2667 = null;
		field2662 = null;
		field2681 = null;
		field2685 = null;
		field2682 = null;
		field2671 = null;
		class106.field2680 = null;
		field2675 = null;
		class106.field2683 = null;
		field2679 = null;
		field2676 = null;
	}

	@ObfuscatedName("k.d(I)V")
	public static void method577() {
		field1511 = null;
		field1521 = null;
		field1525 = null;
		field1523 = null;
		field1522 = null;
		field1514 = null;
		field1524 = null;
		field1510 = null;
		field1527 = null;
		field1529 = null;
		field1526 = null;
	}

	@ObfuscatedName("qb.a(ILbd;ZI)Ljd;")
	public static Pix32 method846(int arg0, Js5 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method458() : null;
	}

	@ObfuscatedName("r.b(I)V")
	public static void method867() {
		class102.field2577 = null;
		field2565 = null;
		field2562 = null;
		field2560 = null;
		field2564 = null;
		Client.field2569 = null;
		field2583 = null;
		field2578 = null;
		field2570 = null;
		field2580 = null;
		field2585 = null;
		field2563 = null;
		field2574 = null;
		field2582 = null;
		field2587 = null;
		field2575 = null;
		field2588 = null;
		class102.field2586 = null;
		field2571 = null;
		field2576 = null;
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method426() {
		field1079 = null;
		field1065 = null;
		field1068 = null;
		field1076 = null;
		field1074 = null;
		field1056 = null;
		field1060 = null;
		field1077 = null;
		field1066 = null;
		field1073 = null;
		GameShell.signlink = null;
		field1078 = null;
		field1067 = null;
	}

	@ObfuscatedName("vd.b(II)Lfc;")
	public static FloType method1026(int arg0) {
		FloType var1 = (FloType) class72.field1757.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field2018.method217(arg0, 4);
		FloType var3 = new FloType();
		if (var2 != null) {
			var3.method393(arg0, new Packet(var2));
		}
		var3.method395();
		class72.field1757.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("d.a(ILad;ILab;IIIII)V")
	public static void method301(int arg0, CollisionMap arg1, int arg2, World arg3, int arg4, int arg5, int arg6, int arg7) {
		if (Client.lowMem && (field898[0][arg2][arg6] & 0x2) == 0) {
			if ((field898[arg7][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (method964(arg7, arg6, arg2) != field1472) {
				return;
			}
		}
		if (class129.field3175 > arg7) {
			class129.field3175 = arg7;
		}
		int var8 = Client.field1451[arg7][arg2 + 1][arg6 + 1];
		int var9 = Client.field1451[arg7][arg2][arg6];
		int var10 = Client.field1451[arg7][arg2 + 1][arg6];
		int var11 = Client.field1451[arg7][arg2][arg6 + 1];
		int var12 = (arg6 << 7) + arg2 + (arg5 << 14) + 1073741824;
		int var13 = (arg0 << 6) + arg4;
		int var14 = var9 + var10 + var8 + var11 >> 2;
		LocType var15 = LocType.method389(arg5);
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
			if (!Client.lowMem || var15.field1329 != 0 || var15.field1330) {
				ModelSource var16;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var16 = var15.method505(var8, var11, arg0, var9, 22, var10);
				} else {
					var16 = new ClientLocAnim(arg5, 22, arg0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method88(arg7, arg2, arg6, var14, var16, var12, var13);
				if (var15.field1284 && var15.field1329 == 1 && arg1 != null) {
					arg1.method115(arg6, arg2);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			ModelSource var17;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var17 = var15.method505(var8, var11, arg0, var9, 10, var10);
			} else {
				var17 = new ClientLocAnim(arg5, 10, arg0, var9, var10, var8, var11, var15.field1289, true);
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
					Model var21;
					if (var17 instanceof Model) {
						var21 = (Model) var17;
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
			ModelSource var25;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var25 = var15.method505(var8, var11, arg0, var9, arg4, var10);
			} else {
				var25 = new ClientLocAnim(arg5, arg4, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method93(arg7, arg2, arg6, var14, 1, 1, var25, 0, var12, var13);
			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
				field412[arg7][arg2][arg6] |= 0x924;
			}
			if (var15.field1284 && arg1 != null) {
				arg1.method118(arg2, var15.field1311, var15.field1298, arg0, arg6, var15.field1286);
			}
		} else if (arg4 == 0) {
			ModelSource var26;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var26 = var15.method505(var8, var11, arg0, var9, 0, var10);
			} else {
				var26 = new ClientLocAnim(arg5, 0, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var26, null, field1740[arg0], 0, var12, var13);
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
			ModelSource var27;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var27 = var15.method505(var8, var11, arg0, var9, 1, var10);
			} else {
				var27 = new ClientLocAnim(arg5, 1, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var27, null, field2819[arg0], 0, var12, var13);
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
			ModelSource var29;
			ModelSource var30;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var29 = var15.method505(var8, var11, arg0 + 4, var9, 2, var10);
				var30 = var15.method505(var8, var11, var28, var9, 2, var10);
			} else {
				var29 = new ClientLocAnim(arg5, 2, arg0 + 4, var9, var10, var8, var11, var15.field1289, true);
				var30 = new ClientLocAnim(arg5, 2, var28, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var29, var30, field1740[arg0], field1740[var28], var12, var13);
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
			ModelSource var31;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var31 = var15.method505(var8, var11, arg0, var9, 3, var10);
			} else {
				var31 = new ClientLocAnim(arg5, 3, arg0, var9, var10, var8, var11, var15.field1289, true);
			}
			arg3.method50(arg7, arg2, arg6, var14, var31, null, field2819[arg0], 0, var12, var13);
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
			ModelSource var32;
			if (var15.field1289 == -1 && var15.field1317 == null) {
				var32 = var15.method505(var8, var11, arg0, var9, arg4, var10);
			} else {
				var32 = new ClientLocAnim(arg5, arg4, arg0, var9, var10, var8, var11, var15.field1289, true);
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
				ModelSource var37;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var37 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var37 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var37, field1740[arg0], arg0 * 512, 0, 0, var12, var13);
			} else if (arg4 == 5) {
				int var38 = arg3.method78(arg7, arg2, arg6);
				int var39 = 16;
				if (var38 > 0) {
					var39 = LocType.method389(var38 >> 14 & 0x7FFF).field1288;
				}
				ModelSource var40;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var40 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var40 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var40, field1740[arg0], arg0 * 512, field1595[arg0] * var39, field181[arg0] * var39, var12, var13);
			} else if (arg4 == 6) {
				ModelSource var41;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var41 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var41 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var41, 256, arg0, 0, 0, var12, var13);
			} else if (arg4 == 7) {
				ModelSource var42;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var42 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var42 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
				}
				arg3.method65(arg7, arg2, arg6, var14, var42, 512, arg0, 0, 0, var12, var13);
			} else if (arg4 == 8) {
				ModelSource var43;
				if (var15.field1289 == -1 && var15.field1317 == null) {
					var43 = var15.method505(var8, var11, 0, var9, 4, var10);
				} else {
					var43 = new ClientLocAnim(arg5, 4, 0, var9, var10, var8, var11, var15.field1289, true);
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
		Client.field3183.method54();
		for (int var0 = 0; var0 < 4; var0++) {
			Client.field2569[var0].method110();
		}
		System.gc();
		method672();
		field1860 = 0;
		field3037 = -1;
		method718();
		method399(10);
	}

	@ObfuscatedName("k.d(B)V")
	public static void method578() {
		if (field96 == 2) {
			method423(field1114 * 2, (class6.field226 - field1408 << 7) + field1857, (-field806 + field3304 << 7) - -class102.field2572);
			if (field1072 > -1 && field2063 % 20 < 10) {
				field1886[0].method551(field1072 - 12, field2188 + -28);
			}
		}
	}

	@ObfuscatedName("m.a(ZIIIILbd;I)V")
	public static synchronized void method681(int arg0, int arg1, int arg2, Js5 arg3) {
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
		field2136.method267();
	}

	@ObfuscatedName("ia.a(IZIIIIIIII)V")
	public static void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) field2284.method802(); var10 != null; var10 = (LocChange) field2284.method809()) {
			if (var10.field679 == arg4 && var10.field700 == arg1 && var10.field699 == arg5 && var10.field688 == arg6) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new LocChange();
			var9.field700 = arg1;
			var9.field688 = arg6;
			var9.field679 = arg4;
			var9.field699 = arg5;
			Client.method733(var9);
			field2284.method804(var9);
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

	@ObfuscatedName("a.a(ILbd;III)[B")
	public static byte[] method25(int arg0, Js5 arg1, int arg2, int arg3) {
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
		Client.field1087 = null;
		field1098 = null;
		field1109 = null;
		field1142 = null;
		field1090 = null;
		field1106 = null;
		field1133 = null;
		field1127 = null;
		field1120 = null;
		field1093 = null;
		field1126 = null;
		field1111 = null;
		field1102 = null;
		field1118 = null;
		field1094 = null;
	}

	@ObfuscatedName("hd.h(I)V")
	public static void method483() {
		int var0 = field986;
		int var1 = field219;
		int var2 = field579;
		int var3 = field2306;
		Pix2D.method913(var0, var2, var3, var1, 6116423);
		Pix2D.method913(var0 + 1, var2 + 1, var3 - 2, 16, 0);
		Pix2D.method922(var0 + 1, var2 + 18, var3 - 2, var1 + -19, 0);
		Client.b12.method213(field2490, var0 + 3, var2 + 14, 6116423);
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
		for (int var6 = 0; var6 < field1104; var6++) {
			int var7 = (field1104 - var6 - 1) * 15 + var2 + 31;
			int var8 = 16777215;
			if (var4 > var0 && var0 + var3 > var4 && var5 > var7 - 13 && var7 + 3 > var5) {
				var8 = 16776960;
			}
			Client.b12.method206(class102.field2586[var6], var0 + 3, var7, var8, true);
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void method1040() {
		for (class12 var0 = (class12) ClientScript.field515.method802(); var0 != null; var0 = (class12) ClientScript.field515.method809()) {
			if (var0.field434 != null) {
				var0.method247();
			}
		}
	}

	@ObfuscatedName("kd.a(IIIZI)I")
	public static int method627(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.field778[arg3 * 1024 / arg1] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg2 * var4 >> 16);
	}

	@ObfuscatedName("gb.b(B)V")
	public static void method429() {
		for (LocChange var0 = (LocChange) field2284.method802(); var0 != null; var0 = (LocChange) field2284.method809()) {
			if (var0.field692 == -1) {
				var0.field694 = 0;
				Client.method733(var0);
			} else {
				var0.method739();
			}
		}
	}

	@ObfuscatedName("client.a(Lu;BI)V")
	public static void method280(Js5Loader arg0, int arg1) {
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
		} else if (field2380 > 0) {
			for (int var0 = 0; var0 < 256; var0++) {
				if (field2380 > 768) {
					field2151[var0] = method700(field2600[var0], field2904[var0], 1024 - field2380);
				} else if (field2380 > 256) {
					field2151[var0] = field2904[var0];
				} else {
					field2151[var0] = method700(field2904[var0], field2600[var0], 256 - field2380);
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
	public static JagString method862(int arg0) {
		if (arg0 < 100000) {
			return method502(arg0);
		} else if (arg0 < 10000000) {
			return JagString.join(new JagString[] { method502(arg0 / 1000), field2354 });
		} else {
			return JagString.join(new JagString[] { method502(arg0 / 1000000), field1184 });
		}
	}

	@ObfuscatedName("gb.c(B)I")
	public static int method432() {
		return 5;
	}

	@ObfuscatedName("a.e(B)V")
	public static void method34() {
		field30 = null;
		field59 = null;
		field61 = null;
		field23 = null;
		field51 = null;
		field48 = null;
		field63 = null;
		field11 = null;
		field45 = null;
		field62 = null;
		field37 = null;
		field49 = null;
		ClientKeyboardListener.field52 = null;
	}

	@ObfuscatedName("kc.a(La;La;Lbd;B)Le;")
	public static Pix8 method605(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method228(arg0);
		int var4 = arg2.method224(var3, arg1);
		return method609(arg2, var4, var3);
	}

	@ObfuscatedName("ob.a(I)V")
	public static void method755() {
		field1941 = true;
		method986();
		if (class66.field1648 != -1) {
			boolean var0 = method478(class66.field1648, 261, 1, 190);
			if (!var0) {
				field1055 = true;
			}
		} else if (field2397[class9.field330] != -1) {
			boolean var1 = method478(field2397[class9.field330], 261, 1, 190);
			if (!var1) {
				field1055 = true;
			}
		}
		if (class6.field224 && field640 == 1) {
			if (BZip2State.field1838 == 1) {
				Client.method660();
			} else {
				method483();
			}
		}
		method901();
	}

	@ObfuscatedName("client.d(Z)V")
	public static void method285() {
		Client.field583 = null;
		Client.field602 = null;
		Client.field599 = null;
		Client.field584 = null;
		Client.field596 = null;
		Client.field604 = null;
		Client.field598 = null;
		Client.field609 = null;
		Client.field588 = null;
		Client.field582 = null;
		Client.field578 = null;
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
		IfType var6 = class17.field548;
		IfType var7 = method1009(var6);
		if (var7 == null) {
			return;
		}
		int[] var8 = method325(var7);
		int[] var9 = method325(var6);
		int var10 = var9[1] + class102.field2568 - var8[1] - field2392;
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
		if (field801 != 0 || (arg1 & 0x400) == 0) {
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
		field2164 = null;
		field2159 = null;
		class86.field2160 = null;
		field2162 = null;
		field2157 = null;
		field2165 = null;
	}

	@ObfuscatedName("ob.a(Z)V")
	public static void method757() {
		if (field857 != 0) {
			return;
		}
		class102.field2586[0] = field3302;
		field1932[0] = 1005;
		field1104 = 1;
		if (field1143 != -1) {
			field1497 = -1;
			field903 = -1;
			method321(0, 765, 503, field1143, 0, class24.field741, class102.field2568, 0);
			ObjType.field2881 = field903;
			field1279 = field1497;
			return;
		}
		method572();
		field1497 = -1;
		field903 = -1;
		boolean var0 = false;
		if (class24.field741 > 4 && class102.field2568 > 4 && class24.field741 < 516 && class102.field2568 < 338) {
			if (field3227 == -1) {
				method1019();
			} else {
				method321(4, 516, 338, field3227, 4, class24.field741, class102.field2568, 0);
			}
		}
		field1279 = field1497;
		ObjType.field2881 = field903;
		field1497 = -1;
		field903 = -1;
		if (class24.field741 > 553 && class102.field2568 > 205 && class24.field741 < 743 && class102.field2568 < 466) {
			if (class66.field1648 != -1) {
				method321(205, 743, 466, class66.field1648, 553, class24.field741, class102.field2568, 1);
			} else if (field2397[class9.field330] != -1) {
				method321(205, 743, 466, field2397[class9.field330], 553, class24.field741, class102.field2568, 1);
			}
		}
		if (field214 != field903) {
			field1055 = true;
			field214 = field903;
		}
		field903 = -1;
		if (field1497 != class52.field1387) {
			class52.field1387 = field1497;
			field1055 = true;
		}
		field1497 = -1;
		if (class24.field741 > 17 && class102.field2568 > 357 && class24.field741 < 496 && class102.field2568 < 453) {
			if (class86.field2166 != -1) {
				method321(357, 496, 453, class86.field2166, 17, class24.field741, class102.field2568, 2);
			} else if (field2421 != -1) {
				method321(357, 496, 453, field2421, 17, class24.field741, class102.field2568, 3);
			} else if (class102.field2568 < 434 && class24.field741 < 426) {
				method974(class24.field741 - 17, class102.field2568 + -357);
			}
		}
		if ((class86.field2166 != -1 || field2421 != -1) && field903 != class108.field2712) {
			class105.field2637 = true;
			class108.field2712 = field903;
		}
		if ((class86.field2166 != -1 || field2421 != -1) && field1497 != field3253) {
			class105.field2637 = true;
			field3253 = field1497;
		}
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < field1104 - 1; var1++) {
				if (field1932[var1] < 1000 && field1932[var1 + 1] > 1000) {
					var0 = false;
					JagString var2 = class102.field2586[var1];
					class102.field2586[var1] = class102.field2586[var1 + 1];
					class102.field2586[var1 + 1] = var2;
					int var3 = field1932[var1];
					field1932[var1] = field1932[var1 + 1];
					field1932[var1 + 1] = var3;
					int var4 = field994[var1];
					field994[var1] = field994[var1 + 1];
					field994[var1 + 1] = var4;
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
	public static IfType method607(IfType[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == null) {
			return null;
		}
		IfType var7 = null;
		for (int var8 = 0; var8 < arg0.length; var8++) {
			IfType var9 = arg0[var8];
			if (var9 != null && var9.field2454 == arg4) {
				int var10 = var9.field2502 + arg3;
				int var11 = var9.field2462 + arg5;
				if (var11 <= arg6 && var10 <= arg1 && var9.field2498 + var11 > arg6 && arg1 < var10 + var9.field2449 && !var9.field2556) {
					if (var9.field2495 < 0 && arg2 || var9.field2495 >= 0 && !arg2) {
						var7 = var9;
					}
					if (var9.field2489 == 0) {
						IfType var12 = method607(arg0, arg1, arg2, var9.field2502 - var9.field2537, var8, var9.field2462 - var9.field2552, arg6);
						if (var12 != null) {
							var7 = var12;
						}
						if (arg2 && var9.field2519 != null) {
							IfType var13 = method607(var9.field2519, arg1, arg2, var9.field2502 - var9.field2537, var9.field2495, var9.field2462 - var9.field2552, arg6);
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
	public static Pix8 method609(Js5 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method467() : null;
	}

	@ObfuscatedName("kc.a(BZ)V")
	public static void method610(boolean arg0) {
		MidiStream.field1179++;
		if (MidiStream.field1179 < 50 && !arg0) {
			return;
		}
		MidiStream.field1179 = 0;
		if (class78.field1919 || field1450 == null) {
			return;
		}
		field1726.method415(13);
		try {
			field1450.method1016(field1726.field267, field1726.field284);
			field1726.field267 = 0;
		} catch (IOException var1) {
			class78.field1919 = true;
		}
	}

	@ObfuscatedName("kc.d(I)V")
	public static void method611() {
		if (GameShell.field2402) {
			GameShell.field2402 = false;
			method943();
			field2364 = true;
			class105.field2637 = true;
			field1055 = true;
			field504 = true;
		}
		Client.method599();
		if (class6.field224 && field640 == 1) {
			field1055 = true;
		}
		if (class66.field1648 != -1) {
			boolean var0 = method1012(class66.field1648);
			if (var0) {
				field1055 = true;
			}
		}
		if (field656 == 2) {
			field1055 = true;
		}
		if (field857 == 2) {
			field1055 = true;
		}
		if (field1055) {
			field1055 = false;
			method755();
		}
		if (class86.field2166 == -1) {
			field704.field2537 = field3052 - field1340 - 77;
			if (class24.field741 > 448 && class24.field741 < 560 && class102.field2568 > 332) {
				method192(77, class102.field2568 - 357, class24.field741 + -17, field3052, field704, 463, -1, 0);
			}
			int var1 = field3052 - field704.field2537 - 77;
			if (var1 < 0) {
				var1 = 0;
			}
			if (var1 > field3052 - 77) {
				var1 = field3052 - 77;
			}
			if (field1340 != var1) {
				field1340 = var1;
				class105.field2637 = true;
			}
		}
		if (class86.field2166 == -1 && field2811 == 3) {
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
		if (field656 == 3) {
			class105.field2637 = true;
		}
		if (field857 == 3) {
			class105.field2637 = true;
		}
		if (field1605 != null) {
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
			field2364 = true;
		}
		if (field2364) {
			if (class103.field2607 != -1 && class9.field330 == class103.field2607) {
				class103.field2607 = -1;
				field1726.method415(44);
				field1726.method141(class9.field330);
			}
			field2364 = false;
			LocChange.field687 = true;
			method246(class9.field330, field2397, class66.field1648 == -1, field2063 % 20 >= 10 ? class103.field2607 : -1);
		}
		if (field504) {
			LocChange.field687 = true;
			field504 = false;
			method880(ObjType.field2828, Client.p12, class6.field236, field1864);
		}
		method866(field2621.field1972, field75, class9.field321, field2621.field1963);
		class9.field321 = 0;
	}

	@ObfuscatedName("kc.b(II)V")
	public static void method612(int arg0) {
		if (arg0 == -3) {
			method678(field2093, field2634, field865);
		} else if (arg0 == -2) {
			method678(field2071, field2106, field1219);
		} else if (arg0 == -1) {
			method678(field2086, field1778, field861);
		} else if (arg0 == 3) {
			method678(field2078, field2111, field1076);
		} else if (arg0 == 4) {
			method678(field2113, field3172, field497);
		} else if (arg0 == 5) {
			method678(field2103, field1174, field94);
		} else if (arg0 == 6) {
			method678(field2067, field1217, field3205);
		} else if (arg0 == 7) {
			method678(field2090, field2763, field3072);
		} else if (arg0 == 8) {
			method678(field2074, field2135, field183);
		} else if (arg0 == 9) {
			method678(field2079, field2012, field1482);
		} else if (arg0 == 10) {
			method678(field2089, field2140, field2382);
		} else if (arg0 == 11) {
			method678(field2080, field2139, field1463);
		} else if (arg0 == 12) {
			method678(field2068, field3127, field932);
		} else if (arg0 == 13) {
			method678(field2109, field1498, field850);
		} else if (arg0 == 14) {
			method678(field2066, field539, field1111);
		} else if (arg0 == 16) {
			method678(field2061, field303, field1043);
		} else if (arg0 == 17) {
			method678(field2096, field2580, field3001);
		} else if (arg0 == 18) {
			method678(field2100, Client.field602, field1807);
		} else if (arg0 == 20) {
			method678(field2081, field2714, field855);
		} else if (arg0 == 22) {
			method678(field2092, field900, field408);
		} else if (arg0 == 23) {
			method678(field2094, field1930, field1120);
		} else if (arg0 == 24) {
			method678(field2091, field2948, field315);
		} else if (arg0 == 25) {
			method678(field2110, field452, field858);
		} else if (arg0 == 26) {
			method678(field2097, field1024, field836);
		} else if (arg0 == 27) {
			method678(field2082, field2062, field3128);
		} else {
			method678(field2083, field1142, field862);
		}
		method399(10);
	}

	@ObfuscatedName("client.j(I)V")
	public static void method291() {
		class103.field2605 = 0L;
		field708.field2058 = 0;
		MidiPlayer.field3069 = 0;
		field1862 = true;
		GameShell.field1277 = true;
		method469();
		field498 = -1;
		class6.field224 = false;
		field36 = -1;
		Client.field2761 = -1;
		field2813 = 0;
		field1855 = 0;
		field96 = 0;
		field1726.field267 = 0;
		field1750 = 0;
		class99.field2434 = -1;
		field488.field267 = 0;
		field1104 = 0;
		method876(0);
		for (int var0 = 0; var0 < 100; var0++) {
			field2034[var0] = null;
		}
		class14.field475 = 0;
		class112.field2766 = (int) (Math.random() * 80.0D) - 40;
		field2409 = (int) (Math.random() * 110.0D) - 55;
		VarBitType.field941 = 0;
		class86.field2158 = (int) (Math.random() * 120.0D) - 60;
		field305 = -1;
		field1341 = 0;
		field965 = 0;
		Client.field594 = 0;
		class113.field2797 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		class103.field2589 = (int) (Math.random() * 30.0D) - 20;
		field1587 = 0;
		field296 = (int) (Math.random() * 100.0D) - 50;
		class118.field2939 = 0;
		class108.field2720 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			field2030[var1] = null;
			MidiStream.field1176[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			field2992[var2] = null;
		}
		field2621 = field2030[2047] = new ClientPlayer();
		class86.field2160.method806();
		class112.field2756.method806();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					class17.field552[var3][var4][var5] = null;
				}
			}
		}
		field2284 = new LinkList();
		field1492 = 0;
		class23.field701 = 0;
		method895(field2421);
		field2421 = -1;
		method895(class86.field2166);
		class86.field2166 = -1;
		method895(field3227);
		field3227 = -1;
		method895(field1143);
		field1143 = -1;
		method895(field1881);
		field1881 = -1;
		method895(class66.field1648);
		class66.field1648 = -1;
		method895(class113.field2800);
		field2811 = 0;
		field1001 = false;
		class6.field224 = false;
		class113.field2800 = -1;
		field1605 = null;
		field2998 = -1;
		class103.field2607 = -1;
		field1470 = 0;
		class9.field330 = 3;
		field2302.method640(null, false, new int[5], -1);
		for (int var6 = 0; var6 < 5; var6++) {
			Client.field599[var6] = null;
			class24.field735[var6] = false;
		}
		field1069 = true;
	}

	@ObfuscatedName("kc.a(BZZ)I")
	public static int method614() {
		return class31.field845 + field3285;
	}

	@ObfuscatedName("ad.c(I)V")
	public static void method116() {
		field220 = null;
		field213 = null;
		field218 = null;
		field221 = null;
		field215 = null;
		field222 = null;
		field217 = null;
	}

	@ObfuscatedName("ad.b(III)I")
	public static int method121(int arg0, int arg1) {
		int var2 = method747(arg0 - 1, arg1 + -1) + method747(arg0 + 1, arg1 - 1) + method747(arg0 + -1, arg1 + 1) + method747(arg0 + 1, arg1 - -1);
		int var3 = method747(arg0 - 1, arg1) + method747(arg0 + 1, arg1) + method747(arg0, arg1 - 1) + method747(arg0, arg1 + 1);
		int var4 = method747(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("p.b()V")
	public static void method765() {
		field2196 = null;
	}

	@ObfuscatedName("pa.b()V")
	public static void method768() {
		Model.field2211 = null;
		Model.field2233 = null;
		Model.field2236 = null;
		Model.field2255 = null;
		Model.field2242 = null;
		Model.field2265 = null;
		Model.field2250 = null;
		Model.field2245 = null;
		Model.field2253 = null;
		Model.field2266 = null;
		Model.field2244 = null;
		Model.field2264 = null;
		Model.field2241 = null;
		Model.field2251 = null;
		Model.field2267 = null;
		Model.field2249 = null;
		Model.field2260 = null;
		Model.field2257 = null;
		Model.field2262 = null;
		Model.field2268 = null;
		Model.field2246 = null;
		Model.field2263 = null;
		Model.field2252 = null;
		Model.field2256 = null;
		Model.field2258 = null;
		Model.field2243 = null;
		Model.field2269 = null;
		Model.field2240 = null;
	}

	@ObfuscatedName("ce.a()V")
	public static void method276() {
		Ground.field558 = null;
		Ground.field553 = null;
		Ground.field565 = null;
		Ground.field570 = null;
		Ground.field555 = null;
		Ground.field572 = null;
		Ground.field566 = null;
	}

	@ObfuscatedName("eb.e()V")
	public static void method358() {
		field770 = null;
		Pix3D.field764 = null;
		field771 = null;
		Pix3D.field772 = null;
		Pix3D.field761 = null;
		Pix3D.field775 = null;
		Pix3D.field778 = null;
	}

	@ObfuscatedName("sc.c()V")
	public static void method924() {
		field2747 = null;
	}

	@ObfuscatedName("ue.a()V")
	public static void method1004() {
		Tone.field3088 = null;
		Tone.field3097 = null;
		Tone.field3084 = null;
		Tone.field3105 = null;
		Tone.field3101 = null;
		Tone.field3098 = null;
		Tone.field3099 = null;
		Tone.field3102 = null;
	}

	@ObfuscatedName("ee.a()V")
	public static void method376() {
		Filter.field822 = null;
		Filter.field821 = null;
	}

	@ObfuscatedName("o.a()V")
	public static void method744() {
		AnimFrame.field2116 = null;
		AnimFrame.field2117 = null;
		AnimFrame.field2115 = null;
		AnimFrame.field2118 = null;
	}

	@ObfuscatedName("ge.a()V")
	public static void method438() {
		BZip2.field1081 = null;
	}

	@ObfuscatedName("pd.b()V")
	public static void method816() {
		PcmPlayer.field2347 = null;
	}

	@ObfuscatedName("gd.f()V")
	public static void method437() {
		JavaSafePcmPlayer.field1080 = null;
	}

	@ObfuscatedName("ea.h()V")
	public static void method351() {
		MidiParser.field758 = null;
	}

	@ObfuscatedName("ab.c()V")
	public static void method70() {
		World.field133 = null;
		World.field107 = null;
		World.field139 = null;
		World.field121 = null;
		World.field129 = null;
		World.field128 = null;
		World.field140 = null;
		World.field134 = null;
		World.field135 = null;
		World.field147 = null;
		World.field144 = null;
		World.field157 = null;
		World.field146 = null;
		World.field152 = null;
		World.field159 = null;
		World.field158 = null;
		World.field161 = null;
		field160 = null;
	}

	@ObfuscatedName("bc.d()V")
	public static void method199() {
		PixFont.field343 = null;
		PixFont.field344 = null;
		PixFont.field335 = null;
		PixFont.field357 = null;
		PixFont.field333 = null;
		PixFont.field336 = null;
		PixFont.field338 = null;
		PixFont.field346 = null;
		PixFont.field352 = null;
		PixFont.field353 = null;
		PixFont.field339 = null;
		PixFont.field334 = null;
		PixFont.field345 = null;
		PixFont.field349 = null;
		PixFont.field340 = null;
		PixFont.field341 = null;
		PixFont.field356 = null;
		PixFont.field348 = null;
		PixFont.field337 = null;
	}
}
