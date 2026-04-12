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
import jagex3.js5.*;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.wordfilter2.Huffman;

import java.applet.Applet;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
// import netscape.javascript.JSObject;

public class Statics {

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

	@ObfuscatedName("ab.u")
	public static int field122;

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

	@ObfuscatedName("ab.L")
	public static int field138;

	@ObfuscatedName("id.v")
	public static PcmStream field1381;

	@ObfuscatedName("ie.i")
	public static Image field1397;

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

	@ObfuscatedName("kb.p")
	public static int[] field1556;

	@ObfuscatedName("kb.r")
	public static PixMap field1558;

	@ObfuscatedName("kb.t")
	public static int[] field1560;

	@ObfuscatedName("kd.a")
	public static Pix8 field1598;

	@ObfuscatedName("ab.hb")
	public static boolean[][] field160;

	@ObfuscatedName("kd.E")
	public static int field1628;

	@ObfuscatedName("la.h")
	public static boolean field1662;

	@ObfuscatedName("la.n")
	public static BufferedRandomAccessFile field1668;

	@ObfuscatedName("la.I")
	public static PixMap field1689;

	@ObfuscatedName("ld.z")
	public static int field1746;

	@ObfuscatedName("ma.db")
	public static PixMap field1780;

	@ObfuscatedName("mb.f")
	public static HashTable field1795;

	@ObfuscatedName("mb.ab")
	public static int[] field1842;

	@ObfuscatedName("mb.db")
	public static Pix8 field1845;

	@ObfuscatedName("mc.z")
	public static Pix8 field1871;

	@ObfuscatedName("md.Gb")
	public static int field1895;

	@ObfuscatedName("md.Lb")
	public static int field1900;

	@ObfuscatedName("md.Mb")
	public static Js5 field1901;

	@ObfuscatedName("na.g")
	public static PixMap field1935;

	@ObfuscatedName("na.l")
	public static int field1940;

	@ObfuscatedName("nb.wc")
	public static int[] field1985;

	@ObfuscatedName("nc.j")
	public static PixMap field2044;

	@ObfuscatedName("nc.k")
	public static PixMap field2045;

	@ObfuscatedName("nc.u")
	public static Pix32 field2055;

	@ObfuscatedName("oa.z")
	public static int[] field2151;

	@ObfuscatedName("ad.D")
	public static class14 field217;

	@ObfuscatedName("oe.s")
	public static Pix8 field2187;

	@ObfuscatedName("p.hb")
	public static int[] field2196;

	@ObfuscatedName("pa.Cc")
	public static int field2247;

	@ObfuscatedName("pa.Jc")
	public static int field2254;

	@ObfuscatedName("pa.Oc")
	public static int field2259;

	@ObfuscatedName("pb.a")
	public static long field2271;

	@ObfuscatedName("pb.k")
	public static int field2281;

	@ObfuscatedName("ae.f")
	public static int[] field229;

	@ObfuscatedName("pe.xb")
	public static Huffman field2357;

	@ObfuscatedName("ae.p")
	public static int field239;

	@ObfuscatedName("qb.k")
	public static Packet field2415;

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

	@ObfuscatedName("ra.r")
	public static JagString[] field2606;

	@ObfuscatedName("ra.t")
	public static PixMap field2608;

	@ObfuscatedName("rb.sb")
	public static Packet field2613;

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
	public static ClientStream field2769;

	@ObfuscatedName("sd.q")
	public static Pix8 field2770;

	@ObfuscatedName("sd.r")
	public static int[] field2771;

	@ObfuscatedName("ba.Jb")
	public static Pix8 field279;

	@ObfuscatedName("se.v")
	public static byte[][] field2794;

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

	@ObfuscatedName("tb.gc")
	public static int[] field2909;

	@ObfuscatedName("tb.ic")
	public static int[] field2911;

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

	@ObfuscatedName("td.n")
	public static int field2945;

	@ObfuscatedName("td.r")
	public static int field2949;

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

	@ObfuscatedName("vd.yd")
	public static boolean field3180;

	@ObfuscatedName("vd.Md")
	public static int[] field3194;

	@ObfuscatedName("bb.j")
	public static int[] field320;

	@ObfuscatedName("wa.b")
	public static PixMap field3208;

	@ObfuscatedName("wc.o")
	public static boolean[] field3296;

	@ObfuscatedName("wc.q")
	public static PixMap field3298;

	@ObfuscatedName("bd.S")
	public static int field405;

	@ObfuscatedName("ca.n")
	public static long field462;

	@ObfuscatedName("ca.o")
	public static int field463;

	@ObfuscatedName("ca.u")
	public static FontMetrics field469;

	@ObfuscatedName("ca.x")
	public static PixMap field472;

	@ObfuscatedName("cb.x")
	public static Js5 field503;

	@ObfuscatedName("cc.Gb")
	public static PixMap field522;

	@ObfuscatedName("client.Eb")
	public static boolean field611;

	@ObfuscatedName("d.Fc")
	public static int field661;

	@ObfuscatedName("dd.d")
	public static IfType field704;

	@ObfuscatedName("dd.o")
	public static PrivilegedRequest field715;

	@ObfuscatedName("de.s")
	public static Pix8 field739;

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

	@ObfuscatedName("eb.Lb")
	public static int field773;

	@ObfuscatedName("eb.Mb")
	public static int field774;

	@ObfuscatedName("eb.Pb")
	public static int field777;

	@ObfuscatedName("aa.Id")
	public static byte[] field78;

	@ObfuscatedName("ec.Ib")
	public static BufferedRandomAccessFile field797;

	@ObfuscatedName("ee.a")
	public static float field819;

	@ObfuscatedName("ee.e")
	public static int field823;

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

	@ObfuscatedName("fc.wb")
	public static int field893;

	@ObfuscatedName("fc.Cb")
	public static int[] field899;

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

	@ObfuscatedName("fe.Jc")
	public static class104 field967;

	@ObfuscatedName("fe.Rc")
	public static int field975;

	@ObfuscatedName("g.p")
	public static PixMap field993;

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
	public static JagString[] field621 = new JagString[]{field669, field620, field647, field672, field655, field642, field648, field626, field623, field622, field645, field624};
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
	@ObfuscatedName("ha.a")
	public static int field1144 = 0;
	@ObfuscatedName("re.h")
	public static LinkList field2694 = new LinkList();
	@ObfuscatedName("ub.d")
	public static int field3030 = -1;
	@ObfuscatedName("ub.i")
	public static LruCache field3035 = new LruCache(50);
	@ObfuscatedName("ub.t")
	public static Pix32[] field3046 = new Pix32[1000];
	@ObfuscatedName("ub.z")
	public static int field3052 = 78;
	@ObfuscatedName("nc.l")
	public static int field2046 = 0;
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
	@ObfuscatedName("pe.Lb")
	public static LinkList field2371 = new LinkList();
	@ObfuscatedName("pe.Ub")
	public static int field2380 = 0;
	@ObfuscatedName("ia.nc")
	public static HashTable field1328 = new HashTable(4096);
	@ObfuscatedName("ia.zc")
	public static int field1340 = 0;
	@ObfuscatedName("h.kc")
	public static byte[] field1126 = new byte[520];
	@ObfuscatedName("h.Yb")
	public static int field1114 = 0;
	@ObfuscatedName("he.Ib")
	public static int field1237 = 0;
	@ObfuscatedName("qa.vb")
	public static int field2392 = 0;
	@ObfuscatedName("va.lb")
	public static boolean field3116 = false;
	@ObfuscatedName("t.wb")
	public static int[] field2808 = new int[]{8, 11, 4, 6, 9, 7, 10};
	@ObfuscatedName("t.zb")
	public static int field2811 = 0;
	@ObfuscatedName("t.xb")
	public static int field2809 = 0;
	@ObfuscatedName("t.Hb")
	public static int[] field2819 = new int[]{16, 32, 64, 128};
	@ObfuscatedName("nb.id")
	public static int[] field2023 = new int[1000];
	@ObfuscatedName("nb.td")
	public static JagString[] field2034 = new JagString[100];
	@ObfuscatedName("j.hc")
	public static int field1433 = 0;
	@ObfuscatedName("vd.Ed")
	public static int[] field3186 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
	@ObfuscatedName("je.Lb")
	public static int[] field1483 = new int[25];
	@ObfuscatedName("je.Ub")
	public static int field1492 = 0;
	@ObfuscatedName("je.Zb")
	public static int field1497 = -1;
	@ObfuscatedName("aa.ae")
	public static int field96 = 0;
	@ObfuscatedName("d.oc")
	public static int[] field644 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	@ObfuscatedName("ad.z")
	public static Object field213 = new Object();
	@ObfuscatedName("ad.A")
	public static int field214 = -1;
	@ObfuscatedName("ad.G")
	public static byte[] field220 = new byte[]{95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
	@ObfuscatedName("tb.Rb")
	public static int[][] field2894 = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
	@ObfuscatedName("vb.tb")
	public static JagString[] field3130 = new JagString[100];
	@ObfuscatedName("ld.t")
	public static int[] field1740 = new int[]{1, 2, 4, 8};
	@ObfuscatedName("ld.C")
	public static int field1749 = 0;
	@ObfuscatedName("ld.G")
	public static int[] field1753 = new int[]{12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800};
	@ObfuscatedName("la.y")
	public static int field1679 = 0;
	@ObfuscatedName("g.d")
	public static LruCache field981 = new LruCache(10);
	@ObfuscatedName("g.q")
	public static int[] field994 = new int[500];
	@ObfuscatedName("g.s")
	public static LinkList2 field996 = new LinkList2();
	@ObfuscatedName("g.x")
	public static boolean field1001 = false;
	@ObfuscatedName("g.D")
	public static boolean field1007 = false;
	@ObfuscatedName("mc.l")
	public static int field1857 = 0;
	@ObfuscatedName("mc.t")
	public static int[] field1865 = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
	@ObfuscatedName("i.f")
	public static int field1260 = 0;
	@ObfuscatedName("oa.k")
	public static LruCache field2136 = new LruCache(100);
	@ObfuscatedName("oa.s")
	public static int field2144 = 0;
	@ObfuscatedName("oa.u")
	public static int field2146 = 0;
	@ObfuscatedName("nd.y")
	public static int field2084 = 0;
	@ObfuscatedName("hb.eb")
	public static boolean field1159 = false;
	@ObfuscatedName("pb.E")
	public static Packet field2301 = new Packet(8);
	@ObfuscatedName("pb.G")
	public static int[] field2303 = new int[1000];
	@ObfuscatedName("pb.F")
	public static PlayerModel field2302 = new PlayerModel();
	@ObfuscatedName("kc.w")
	public static int field1587 = 0;
	@ObfuscatedName("kc.E")
	public static int[] field1595 = new int[]{1, 0, -1, 0};
	@ObfuscatedName("cb.s")
	public static int field498 = 0;
	@ObfuscatedName("cb.u")
	public static LruCache field500 = new LruCache(200);
	@ObfuscatedName("ac.J")
	public static int[] field173 = new int[32];
	@ObfuscatedName("ac.S")
	public static int[] field181 = new int[]{0, -1, 0, 1};
	@ObfuscatedName("wc.d")
	public static int field3285 = 0;
	@ObfuscatedName("wc.i")
	public static int field3290 = 0;
	@ObfuscatedName("wc.w")
	public static int field3304 = 0;
	@ObfuscatedName("wb.i")
	public static LruCache field3249 = new LruCache(20);
	@ObfuscatedName("wb.o")
	public static int[] field3255 = new int[1000];
	@ObfuscatedName("wb.B")
	public static boolean field3268 = false;
	@ObfuscatedName("wb.L")
	public static LruCache field3278 = new LruCache(50);
	@ObfuscatedName("sa.l")
	public static ClientGosubFrame[] field2736 = new ClientGosubFrame[50];
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
	@ObfuscatedName("fe.vc")
	public static boolean field953 = false;
	@ObfuscatedName("fe.Ac")
	public static long field958 = 0L;
	@ObfuscatedName("fe.xc")
	public static JagFX[] field955 = new JagFX[50];
	@ObfuscatedName("fe.Hc")
	public static int field965 = 0;
	@ObfuscatedName("bd.s")
	public static LruCache field379 = new LruCache(260);
	@ObfuscatedName("bd.X")
	public static boolean field410 = false;
	@ObfuscatedName("u.Cb")
	public static int field2998 = -1;
	@ObfuscatedName("oe.k")
	public static byte[][] field2179 = new byte[250][];
	@ObfuscatedName("oe.l")
	public static int field2180 = 256;
	@ObfuscatedName("jc.lb")
	public static int[] field1458 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
	@ObfuscatedName("jc.xb")
	public static int field1470 = 0;
	@ObfuscatedName("jc.zb")
	public static int field1472 = 0;
	@ObfuscatedName("ga.E")
	public static int[] field1020 = new int[2000];
	@ObfuscatedName("a.J")
	public static int field36 = 0;
	@ObfuscatedName("k.C")
	public static int[] field1514 = new int[99];
	@ObfuscatedName("k.J")
	public static int[] field1521 = new int[50];
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
	@ObfuscatedName("wa.D")
	public static int[] field3236 = new int[100];
	@ObfuscatedName("dc.ib")
	public static int field682 = 0;
	@ObfuscatedName("dc.kb")
	public static int[] field684 = new int[50];
	@ObfuscatedName("dc.nb")
	public static boolean field687 = false;
	@ObfuscatedName("cc.Hb")
	public static int field523 = 0;
	@ObfuscatedName("cc.Jb")
	public static int field525 = 0;
	@ObfuscatedName("ta.vc")
	public static int field2881 = -1;
	@ObfuscatedName("ta.Lb")
	public static int[] field2845 = new int[50];
	@ObfuscatedName("hc.d")
	public static Packet[] field1176 = new Packet[2048];
	@ObfuscatedName("hc.q")
	public static int field1189 = 0;
	@ObfuscatedName("hc.r")
	public static boolean[] field1190 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false};
	@ObfuscatedName("ua.q")
	public static int[][] field3015 = new int[104][104];
	@ObfuscatedName("ua.z")
	public static boolean field3024 = false;
	@ObfuscatedName("se.B")
	public static int field2800 = -1;
	@ObfuscatedName("se.C")
	public static byte[][] field2801 = new byte[1000][];
	@ObfuscatedName("se.E")
	public static int[] field2803 = new int[2000];

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
		Client.field546 = null;
		class17.field548 = null;
	}

	@ObfuscatedName("cc.f(I)V")
	public static void method269() {
		field526 = null;
		field524 = null;
		field520 = null;
		field521 = null;
		field522 = null;
		BgSound.field515 = null;
	}

	@ObfuscatedName("f.a(Lvc;IZ)V")
	public static void method381(ClientStream arg0, boolean arg1) {
		if (field2769 != null) {
			try {
				field2769.method1015();
			} catch (Exception var7) {
			}
			field2769 = null;
		}
		field2769 = arg0;
		method617(arg1);
		field2301.pos = 0;
		field2613 = null;
		class102.field2559 = 0;
		field967 = null;
		while (true) {
			class104 var2 = (class104) class78.field1917.method497();
			if (var2 == null) {
				while (true) {
					class104 var3 = (class104) Js5Net.field1831.method497();
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
								field525++;
							}
						}
						field1189 = 0;
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
													arg1 = JagString.join(new JagString[]{arg1.method19(0, var7), var8, arg1.method1(var7 + 4)});
												}
											}
											arg1 = JagString.join(new JagString[]{arg1.method19(0, var6), Client.method973(Client.method1039(4, arg0)), arg1.method1(var6 + 2)});
										}
									}
									arg1 = JagString.join(new JagString[]{arg1.method19(0, var5), Client.method973(Client.method1039(3, arg0)), arg1.method1(var5 + 2)});
								}
							}
							arg1 = JagString.join(new JagString[]{arg1.method19(0, var4), Client.method973(Client.method1039(2, arg0)), arg1.method1(var4 + 2)});
						}
					}
					arg1 = JagString.join(new JagString[]{arg1.method19(0, var3), Client.method973(Client.method1039(1, arg0)), arg1.method1(var3 + 2)});
				}
			}
			arg1 = JagString.join(new JagString[]{arg1.method19(0, var2), Client.method973(Client.method1039(0, arg0)), arg1.method1(var2 + 2)});
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
		SeqType.field1196 = null;
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
		int var2 = arg0.field1986 - Client.loopCycle;
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
				class104 var11 = (class104) Js5Net.field1831.method499(var6);
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
		field1176 = null;
		field1184 = null;
		field1175 = null;
		field1190 = null;
	}

	@ObfuscatedName("id.a(IILnb;)V")
	public static void method523(int arg0, ClientEntity arg1) {
		Client.method423(arg0, arg1.field1963, arg1.field1972);
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
		if (Client.field2166 == -1) {
			Client.field2637 = true;
		}
		if (arg0 == 0 && Client.field2421 != -1) {
			Client.field3050 = 0;
			Client.field1605 = arg1;
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
		SeqType.field1241 = null;
		field1232 = null;
		Client.field1239 = null;
		field1229 = null;
		Client.field1231 = null;
		field1238 = null;
		field1244 = null;
		ClientBuild.field1247 = null;
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
		Client.field2334 = null;
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
		LocType.field2322 = null;
		field2315 = null;
		field2333 = null;
		field2317 = null;
		field2309 = null;
		Client.field2324 = null;
		field2331 = null;
	}

	@ObfuscatedName("dc.b(I)V")
	public static void method315() {
		field684 = null;
		LocType.field698 = null;
		Client.field677 = null;
		field676 = null;
		Client.field680 = null;
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
		Client.field708 = null;
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
		field2803[var4] = field2803[var4] & ~var7 | var7 & arg0 << var3;
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
		return field967 != null && field967.field2073 == var2 ? field2613.pos * 99 / (field2613.field284.length - field967.field2619) + 1 : 0;
	}

	@ObfuscatedName("sd.a(I)V")
	public static void method927() {
		class112.field2756 = null;
		field2772 = null;
		field2770 = null;
		Client.field2759 = null;
		VarBitType.field2755 = null;
		field2760 = null;
		field2768 = null;
		field2769 = null;
		field2763 = null;
		field2764 = null;
		field2767 = null;
		field2771 = null;
		Client.field2758 = null;
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

	@ObfuscatedName("w.a(B)V")
	public static void method1027() {
		Client.field3200 = null;
		Js5Loader.field3198 = null;
		field3197 = null;
		field3205 = null;
		field3203 = null;
		field3202 = null;
	}

	@ObfuscatedName("ac.b(I)V")
	public static void method99() {
		GameShell.field187 = null;
		Client.field178 = null;
		field183 = null;
		field172 = null;
		field186 = null;
		field173 = null;
		field181 = null;
	}

	@ObfuscatedName("l.a(I)V")
	public static void method630() {
		field1649 = null;
		field1645 = null;
		field1646 = null;
		Client.field1651 = null;
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
					boolean var5 = Client.method947(var4);
					int var6;
					if (var5) {
						var6 = var4.field2459;
					} else {
						var6 = var4.field2465;
					}
					if (var6 != -1) {
						SeqType var7 = SeqType.method103(var6);
						var4.field2466 += Client.field321;
						label50:
						while (true) {
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
					int var10 = Client.field321 * var8;
					var4.field2496 = var4.field2496 + var10 & 0x7FF;
					int var11 = Client.field321 * var9;
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

	@ObfuscatedName("pb.a(I)V")
	public static void method800() {
		field2300 = null;
		field2303 = null;
		Client.field2284 = null;
		field2302 = null;
		field2297 = null;
		Client.field2277 = null;
		field2305 = null;
		field2301 = null;
		Client.field2291 = null;
		field2304 = null;
		field2299 = null;
		field2296 = null;
		field2279 = null;
		field2298 = null;
	}

	@ObfuscatedName("ib.a(ILbd;II)[Le;")
	public static Pix8[] method518(Js5 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method994() : null;
	}

	@ObfuscatedName("sa.a([La;Z)[La;")
	public static JagString[] method905(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[]{method502(var2), field1065});
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[]{var1[var2], arg0[var2]});
			}
		}
		return var1;
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

	@ObfuscatedName("l.a(III)Z")
	public static boolean method631(int arg0, int arg1) {
		if (arg0 == 0 && field2881 == arg1) {
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
		Js5NetThread.method500();
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
		if (Client.field1554 != 0 && arg1 != -1) {
			method681(1, arg1, Client.field1554, Client.field2324);
			Client.field1860 = arg0;
		}
	}

	@ObfuscatedName("wc.a(I)V")
	public static void method1051() {
		field3305 = null;
		field3306 = null;
		field3296 = null;
		field3298 = null;
		Client.field3299 = null;
		field3303 = null;
		IdkType.field3282 = null;
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
		Client.field2397 = null;
		field2393 = null;
	}

	@ObfuscatedName("be.a(La;I)Z")
	public static boolean method242(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field1492; var1++) {
			if (arg0.method14(ReflectionCheck.field2951[var1])) {
				return true;
			}
		}
		return arg0.method14(Client.field2621.field86);
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
		Client.field964 = null;
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
		Client.field1019 = null;
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
		Client.field1348 = null;
		class50.field1350 = null;
		Client.field1351 = null;
		field1345 = null;
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
		Client.field800 = null;
		Client.field784 = null;
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
		IdkType.field2433 = null;
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
		ClientBuild.field3053 = null;
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
		VarBitType.field1555 = null;
		field1558 = null;
		field1560 = null;
		field1561 = null;
		field1553 = null;
	}

	@ObfuscatedName("de.a(BIIIIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (method1052(arg3)) {
			Client.method844(arg2, field2922[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@ObfuscatedName("hd.a(IILfe;)V")
	public static void method479(PacketBit arg0) {
		while (true) {
			ReflectionCheck var1 = (ReflectionCheck) field2694.method802();
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
			int var4 = arg0.pos;
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
			arg0.method155(arg0.pos - var4);
			var1.unlink();
		}
	}

	@ObfuscatedName("g.a(Z)V")
	public static void method420() {
		field1006 = null;
		field1005 = null;
		field993 = null;
		field1000 = null;
		field996 = null;
		ClientBuild.field1003 = null;
		field981 = null;
		field989 = null;
		field994 = null;
		SpotType.field999 = null;
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

	@ObfuscatedName("pb.a(IB)La;")
	public static JagString method803(int arg0) {
		JagString var1 = method502(arg0);
		for (int var2 = var1.method10() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[]{var1.method19(0, var2), field1774, var1.method1(var2)});
		}
		if (var1.method10() > 8) {
			var1 = JagString.join(new JagString[]{field2564, var1.method19(0, var1.method10() - 8), field1896, field2629, var1, field2601});
		} else if (var1.method10() > 4) {
			var1 = JagString.join(new JagString[]{field3136, var1.method19(0, var1.method10() - 4), field2360, field2629, var1, field2601});
		}
		return JagString.join(new JagString[]{field2406, var1});
	}

	@ObfuscatedName("ca.c(I)V")
	public static void method257() {
		field460 = null;
		field452 = null;
		Client.field471 = null;
		field469 = null;
		field479 = null;
		ObjType.field458 = null;
		field465 = null;
		field477 = null;
		class14.field453 = null;
		field473 = null;
		field472 = null;
		field478 = null;
		Client.field470 = null;
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
		int var3 = Client.field2158 + Client.field2797 & 0x7FF;
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 6400) {
			return;
		}
		int var5 = Model.field2256[var3];
		int var6 = var5 * 256 / (Client.field2589 + 256);
		int var7 = Model.field2258[var3];
		int var8 = var7 * 256 / (Client.field2589 + 256);
		int var9 = arg0 * var6 + arg1 * var8 >> 16;
		int var10 = arg0 * var8 - arg1 * var6 >> 16;
		if (var4 > 2500) {
			arg2.method555(field1845, var9 + 98 - arg2.field1479 / 2, -var10 + 79 + -(arg2.field1477 / 2));
		} else {
			arg2.method551(var9 + 4 + 94 - arg2.field1479 / 2, -(arg2.field1477 / 2) + 83 + -var10 + -4);
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
		Client.field1926 = null;
		field1927 = null;
		field1928 = null;
		field1921 = null;
		field1915 = null;
		field1925 = null;
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
				method758(0, JagString.join(new JagString[]{var2, field3295}), field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field1492; var4++) {
			if (class117.field2929[var4] == arg0) {
				method758(0, JagString.join(new JagString[]{field2172, var2, field3138}), field3234);
				return;
			}
		}
		if (!var2.method5(Client.field2621.field86)) {
			class106.field2683[field2146++] = arg0;
			Client.field1055 = true;
			Client.out.method415(251);
			Client.out.method157(arg0);
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

	@ObfuscatedName("mb.a(I)V")
	public static void method687() {
		field1816 = null;
		field1807 = null;
		field1794 = null;
		field1834 = null;
		SpotType.field1841 = null;
		Js5Net.field1831 = null;
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
		SeqType.field939 = null;
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
		Client.in = null;
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
		ObjType.field1405 = null;
		field1392 = null;
		field1396 = null;
	}

	@ObfuscatedName("tc.a(B)V")
	public static void method963() {
		class117.field2917 = null;
		field2922 = null;
		ClientBuild.field2930 = null;
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
		VarpType.field3167 = null;
		field3170 = null;
		field3146 = null;
		field3163 = null;
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
		Client.out.method415(176);
		if (Client.field1648 != -1) {
			method895(Client.field1648);
			field2998 = -1;
			field2364 = true;
			Client.field1055 = true;
			Client.field1648 = -1;
		}
		if (Client.field2166 != -1) {
			method895(Client.field2166);
			field2998 = -1;
			Client.field2637 = true;
			Client.field2166 = -1;
		}
		if (Client.field1143 != -1) {
			method895(Client.field1143);
			Client.field1143 = -1;
			Client.setMainState(30);
		}
		if (field1881 != -1) {
			method895(field1881);
			field1881 = -1;
		}
		if (Client.field3227 != -1) {
			method895(Client.field3227);
			Client.field3227 = -1;
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

	@ObfuscatedName("jc.b(B)V")
	public static void method543() {
		field1463 = null;
		ClientBuild.groundh = null;
		field1466 = null;
		field1473 = null;
		field1468 = null;
		field1455 = null;
		field1461 = null;
		Client.stream = null;
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
		Client.field2170 = null;
		field2183 = null;
	}

	@ObfuscatedName("kd.a(Z)V")
	public static void method616() {
		field1632 = null;
		Client.field1605 = null;
		field1631 = null;
		field1625 = null;
		GameShell.field1601 = null;
		field1611 = null;
		field1598 = null;
		field1618 = null;
		GameShell.field1599 = null;
		field1622 = null;
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
		ClientBuild.field856 = null;
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
		Client.field2490 = field790;
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
		ClientBuild.field2131 = null;
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
				Client.field1055 = true;
				field2146--;
				for (int var3 = var2; var3 < field2146; var3++) {
					class106.field2683[var3] = class106.field2683[var3 + 1];
				}
				Client.out.method415(28);
				Client.out.method157(arg0);
				return;
			}
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
				ScriptRunner.method754(var3.field2483, 0, var3, 0);
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
		Client.out = null;
		Client.field1752 = null;
	}

	@ObfuscatedName("ra.a(II)V")
	public static void method874(int arg0) {
		if (arg0 == -1 && Client.field1860 == 0) {
			method669();
		} else if (arg0 != -1 && Client.field3037 != arg0 && Client.field1554 != 0 && Client.field1860 == 0) {
			method670(Client.field1554, arg0, Client.field2702, 0);
		}
		Client.field3037 = arg0;
	}

	@ObfuscatedName("ua.c(I)V")
	public static void method988() {
		field3015 = null;
		field3026 = null;
		field3025 = null;
		field3021 = null;
		Client.loginout = null;
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
		if (Client.field1104 >= 500) {
			return;
		}
		if (arg5.method10() <= 0) {
			Client.field2586[Client.field1104] = arg1;
		} else {
			Client.field2586[Client.field1104] = JagString.join(new JagString[]{arg1, field2337, arg5});
		}
		field1932[Client.field1104] = arg4;
		class72.field1770[Client.field1104] = arg0;
		field994[Client.field1104] = arg3;
		class117.field2925[Client.field1104] = arg2;
		Client.field1104++;
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
			field525++;
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
		ClientBuild.field1872 = null;
		field1852 = null;
		field1873 = null;
		GameShell.frame = null;
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
		if (field1492 >= 100 && Client.field2189 != 1 || field1492 >= 200) {
			method758(0, field2931, field3234);
			return;
		}
		JagString var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < field1492; var3++) {
			if (class117.field2929[var3] == arg0) {
				method758(0, JagString.join(new JagString[]{var2, field3045}), field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field2146; var4++) {
			if (class106.field2683[var4] == arg0) {
				method758(0, JagString.join(new JagString[]{field2178, var2, field2054}), field3234);
				return;
			}
		}
		if (var2.method5(Client.field2621.field86)) {
			return;
		}
		ReflectionCheck.field2951[field1492] = var2;
		class117.field2929[field1492] = arg0;
		class73.field1788[field1492] = 0;
		field1492++;
		Client.field1055 = true;
		Client.out.method415(114);
		Client.out.method157(arg0);
	}

	@ObfuscatedName("rb.f(I)V")
	public static void method879() {
		ClientKeyboardListener.field2625 = null;
		field2613 = null;
		Client.field2621 = null;
		class104.field2623 = null;
		Client.field2626 = null;
		class104.field2618 = null;
		Client.field2614 = null;
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
		Client.maps = null;
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
		TitleScreen.field3071 = null;
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

	@ObfuscatedName("d.c(B)V")
	public static void method295() {
		field621 = null;
		field623 = null;
		field620 = null;
		Client.field657 = null;
		Client.field632 = null;
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

	@ObfuscatedName("i.a(II)La;")
	public static JagString method502(int arg0) {
		return method418(false, arg0);
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
		ReflectionCheck.field2957 = null;
		SeqType.field2966 = null;
		field2968 = null;
		field2965 = null;
		ReflectionCheck.field2951 = null;
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

	@ObfuscatedName("rc.a(Z)V")
	public static void method883() {
		field2629 = null;
		field2657 = null;
		field2644 = null;
		field2654 = null;
		field2639 = null;
		field2650 = null;
		Client.field2633 = null;
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
			arg0.pos += field2357.method1033(arg0.field284, var1.field26, 0, var1.field38, arg0.pos);
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
	public static void setHuffman(Huffman arg0) {
		field2357 = arg0;
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

	@ObfuscatedName("kc.b(I)V")
	public static void method602() {
		field1576 = null;
		Client.field1578 = null;
		field1591 = null;
		IdkType.field1583 = null;
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
				label46:
				for (int var7 = 0; var7 < ObjType.field1590; var7++) {
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
		ClientBuild.field2906 = null;
		field2894 = null;
		Client.b12 = null;
		field2909 = null;
		field2901 = null;
		field2910 = null;
		field2904 = null;
		field2911 = null;
		Client.p11 = null;
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

	@ObfuscatedName("hd.a(II)I")
	public static int method480(int arg0) {
		VarBitType var1 = VarBitType.method686(arg0);
		int var2 = var1.field945;
		int var3 = var1.field933;
		int var4 = var1.field943;
		int var5 = field173[var2 - var4];
		return field2803[var3] >> var4 & var5;
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

	@ObfuscatedName("md.f(I)V")
	public static void method707() {
		field1902 = null;
		field1885 = null;
		Client.field1886 = null;
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
			method398(0, field3239, 0, 0, 13, JagString.join(new JagString[]{field1393, ReflectionCheck.field2951[var1]}));
			method398(0, field2778, 0, 0, 18, JagString.join(new JagString[]{field1393, ReflectionCheck.field2951[var1]}));
			return true;
		} else if (var1 >= 401 && var1 <= 500) {
			method398(0, field3239, 0, 0, 35, JagString.join(new JagString[]{field1393, arg0.field2474}));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("de.a(II)[B")
	public static synchronized byte[] method324(int arg0) {
		if (arg0 == 100 && class17.field551 > 0) {
			byte[] var1 = field2801[--class17.field551];
			field2801[class17.field551] = null;
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

	@ObfuscatedName("ta.h(I)V")
	public static void method946() {
		field2845 = null;
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
		return new int[]{var2, var3};
	}

	@ObfuscatedName("ac.a(ILa;Lba;)I")
	public static int method105(JagString arg0, Packet arg1) {
		int var2 = arg1.pos;
		arg1.method185(arg0.field26);
		arg1.pos += field2357.method1036(0, arg1.pos, arg0.field26, arg0.field38, arg1.field284);
		return arg1.pos - var2;
	}

	@ObfuscatedName("bd.b(I)V")
	public static void method225() {
		field409 = null;
		Client.field365 = null;
		field406 = null;
		field379 = null;
		field407 = null;
		Client.field375 = null;
		ClientBuild.field412 = null;
		field408 = null;
	}

	@ObfuscatedName("ub.a(Llc;Ljava/awt/Component;I)Lb;")
	public static Mixer method993(SignLink arg0, Component arg1) {
		PcmPlayer.method1050(arg1, arg0);
		Mixer var2 = new Mixer();
		method261(var2);
		return var2;
	}

	@ObfuscatedName("u.f(I)V")
	public static void method983() {
		field2978 = null;
		Client.field2992 = null;
		field2980 = null;
		field2977 = null;
		field2995 = null;
		field2993 = null;
	}

	@ObfuscatedName("j.d(B)V")
	public static void method538() {
		field253.method267();
	}

	@ObfuscatedName("u.f(II)La;")
	public static JagString method984(int arg0) {
		return JagString.join(new JagString[]{method502(arg0 >> 24 & 0xFF), field2112, method502(arg0 >> 16 & 0xFF), field2112, method502(arg0 >> 8 & 0xFF), field2112, method502(arg0 & 0xFF)});
	}

	@ObfuscatedName("de.b(I)V")
	public static void method326() {
		Client.field742 = null;
		field743 = null;
		field725 = null;
		field739 = null;
		field726 = null;
		field732 = null;
		field738 = null;
		class24.field724 = null;
		class24.field735 = null;
		VarpType.field727 = null;
		field733 = null;
	}

	@ObfuscatedName("wb.a(Z)V")
	public static void method1047() {
		ClientBuild.field3246 = null;
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
		NpcType.field3244 = null;
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
		Client.field2490 = null;
	}

	@ObfuscatedName("wa.a(Lbd;La;BLa;)Ljd;")
	public static Pix32 method1038(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method846(var4, arg0, var3);
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
		if (field3024) {
			class102.field2573 = 32;
		} else {
			class102.field2573 = 0;
		}
		field3024 = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.field2537 -= Client.field3176 * 4;
			if (arg6 == 1) {
				Client.field1055 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Client.field2637 = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.field2537 += Client.field3176 * 4;
			if (arg6 == 2 || arg6 == 3) {
				Client.field2637 = true;
			}
			if (arg6 == 1) {
				Client.field1055 = true;
			}
		} else if (arg5 - class102.field2573 <= arg2 && arg2 < class102.field2573 + arg5 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && Client.field3176 > 0) {
			field3024 = true;
			int var8 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				Client.field2637 = true;
			}
			if (arg6 == 1) {
				Client.field1055 = true;
			}
			if (var8 < 8) {
				var8 = 8;
			}
			int var9 = arg0 - var8 - 32;
			int var10 = arg1 - arg7 - var8 / 2 - 16;
			arg4.field2537 = (arg3 - arg0) * var10 / var9;
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
		Client.field1488 = null;
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
		if (arg0 == 0 && Client.field1279 == arg1) {
			return true;
		} else if (arg0 == 1 && Client.field1387 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Client.field3253 == arg1;
		}
	}

	@ObfuscatedName("rd.a(IBII)V")
	public static void method887(int arg0, int arg1, int arg2) {
		if (Client.field322 == 0 || arg1 == 0 || field965 >= 50) {
			return;
		}
		field2369[field965] = arg0;
		field2845[field965] = arg1;
		field684[field965] = arg2;
		field955[field965] = null;
		field1521[field965] = 0;
		field965++;
	}

	@ObfuscatedName("m.b(Z)V")
	public static synchronized void method674() {
		method1029();
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
		FloType.field1757 = null;
		field1762 = null;
		field1777 = null;
	}

	@ObfuscatedName("bd.a([BI)V")
	public static void method229(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		field1900 = var1.method145();
		field1985 = new int[field1900];
		field2794 = new byte[field1900][];
		field837 = new int[field1900];
		field3194 = new int[field1900];
		field2771 = new int[field1900];
		var1.pos = arg0.length - field1900 * 8 - 7;
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
		var1.pos = arg0.length + 3 - field1900 * 8 - var2 * 3 - 7;
		field292 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			field292[var7] = var1.method164();
			if (field292[var7] == 0) {
				field292[var7] = 1;
			}
		}
		var1.pos = 0;
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
		ClientBuild.field1385 = null;
		field1364 = null;
		Client.field1376 = null;
		Client.field1378 = null;
		field1362 = null;
		field1388 = null;
		field1382 = null;
		Client.field1380 = null;
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
		Client.field2030 = null;
		FluType.field2024 = null;
		field2029 = null;
		FloType.field2018 = null;
		JagException.signlink = null;
		field1985 = null;
		field1998 = null;
		field2023 = null;
		Client.field1993 = null;
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
				Client.field1055 = true;
				for (int var3 = var2; var3 < field1492; var3++) {
					ReflectionCheck.field2951[var3] = ReflectionCheck.field2951[var3 + 1];
					class73.field1788[var3] = class73.field1788[var3 + 1];
					class117.field2929[var3] = class117.field2929[var3 + 1];
				}
				Client.out.method415(255);
				Client.out.method157(arg0);
				return;
			}
		}
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
		field2803 = null;
		field2801 = null;
		field2789 = null;
		field2798 = null;
		LocType.field2788 = null;
		Client.field2782 = null;
		field2794 = null;
		field2802 = null;
		field2783 = null;
		NpcType.field2799 = null;
	}

	@ObfuscatedName("h.a(Llc;BLba;I)V")
	public static void method460(SignLink arg0, Packet arg1, int arg2) {
		ReflectionCheck var3 = new ReflectionCheck();
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
					var3.field2961[var4] = arg0.method654(ReflectionChecker.method530(var17), var18);
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
						var14[var15] = ReflectionChecker.method530(var9[var15]);
					}
					var3.field2960[var4] = arg0.method648(var14, var7, ReflectionChecker.method530(var6));
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
		Client.world = null;
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
		FluType.field2663 = null;
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
		Client.field2577 = null;
		field2565 = null;
		field2562 = null;
		field2560 = null;
		field2564 = null;
		Client.collision = null;
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
		Client.field2586 = null;
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
		NpcType.field1060 = null;
		field1077 = null;
		ObjType.field1066 = null;
		field1073 = null;
		GameShell.signlink = null;
		Client.field1078 = null;
		field1067 = null;
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

	@ObfuscatedName("kd.a(IIIZI)I")
	public static int method627(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.field778[arg3 * 1024 / arg1] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg2 * var4 >> 16);
	}

	@ObfuscatedName("client.a(Lu;BI)V")
	public static void method280(Js5Loader arg0, int arg1) {
		if (field2415 == null) {
			method495(true, null, 255, 255, (byte) 0, 0);
			class50.field1350[arg1] = arg0;
		} else {
			field2415.pos = arg1 * 4 + 5;
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
			return JagString.join(new JagString[]{method502(arg0 / 1000), field2354});
		} else {
			return JagString.join(new JagString[]{method502(arg0 / 1000000), field1184});
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
		Client.field61 = null;
		field23 = null;
		LocType.field51 = null;
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
		if (Client.field1648 != -1) {
			boolean var0 = method478(Client.field1648, 261, 1, 190);
			if (!var0) {
				Client.field1055 = true;
			}
		} else if (Client.field2397[Client.field330] != -1) {
			boolean var1 = method478(Client.field2397[Client.field330], 261, 1, 190);
			if (!var1) {
				Client.field1055 = true;
			}
		}
		if (Client.field224 && Client.field640 == 1) {
			if (Client.field1838 == 1) {
				Client.method660();
			} else {
				Client.method483();
			}
		}
		method901();
	}

	@ObfuscatedName("ob.a(B)V")
	public static void method756() {
		SpotType.field2152 = null;
		field2164 = null;
		field2159 = null;
		Client.field2160 = null;
		field2162 = null;
		field2157 = null;
		field2165 = null;
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

	@ObfuscatedName("sc.c()V")
	public static void method924() {
		field2747 = null;
	}

}
