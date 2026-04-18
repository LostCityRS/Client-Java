package deob;

import jagex3.callstack.JagException;
import jagex3.client.*;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.ClientEntity;
import jagex3.dash3d.Pix3D;
import jagex3.dash3d.PlayerModel;
import jagex3.datastruct.LinkList;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.*;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;
import jagex3.var.VarCache;
import jagex3.wordfilter2.Huffman;

import java.applet.Applet;
import java.awt.*;
// import netscape.javascript.JSObject;

public class Statics {

	@ObfuscatedName("ga.y")
	public static long field1014;

	@ObfuscatedName("ga.N")
	public static int field1029;

	@ObfuscatedName("ab.b")
	public static int field103;

	@ObfuscatedName("ab.e")
	public static int field106;

	@ObfuscatedName("gb.p")
	public static boolean field1062;

	@ObfuscatedName("gb.C")
	public static int field1075;

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

	@ObfuscatedName("hc.e")
	public static Pix8[] field1177;

	@ObfuscatedName("ab.u")
	public static int field122;

	@ObfuscatedName("ab.x")
	public static int field125;

	@ObfuscatedName("ab.z")
	public static int field127;

	@ObfuscatedName("i.p")
	public static int field1270;

	@ObfuscatedName("ia.Sb")
	public static PixMap field1307;

	@ObfuscatedName("ab.L")
	public static int field138;

	@ObfuscatedName("id.v")
	public static PcmStream field1381;

	@ObfuscatedName("ie.i")
	public static Image field1397;

	@ObfuscatedName("j.jc")
	public static PixMap field1435;

	@ObfuscatedName("ja.S")
	public static boolean field1443;

	@ObfuscatedName("ja.W")
	public static boolean field1447;

	@ObfuscatedName("kb.k")
	public static int field1551;

	@ObfuscatedName("ab.hb")
	public static boolean[][] field160;

	@ObfuscatedName("la.n")
	public static BufferedRandomAccessFile field1668;

	@ObfuscatedName("md.Gb")
	public static int field1895;

	@ObfuscatedName("na.g")
	public static PixMap field1935;

	@ObfuscatedName("na.l")
	public static int field1940;

	@ObfuscatedName("nc.j")
	public static PixMap field2044;

	@ObfuscatedName("nc.u")
	public static Pix32 field2055;

	@ObfuscatedName("oa.z")
	public static int[] field2151;

	@ObfuscatedName("ad.D")
	public static PcmPlayerBase field217;

	@ObfuscatedName("p.hb")
	public static int[] field2196;

	@ObfuscatedName("pa.Cc")
	public static int field2247;

	@ObfuscatedName("pa.Jc")
	public static int field2254;

	@ObfuscatedName("pa.Oc")
	public static int field2259;

	@ObfuscatedName("pb.k")
	public static int field2281;

	@ObfuscatedName("ae.f")
	public static int[] field229;

	@ObfuscatedName("pe.xb")
	public static Huffman field2357;

	@ObfuscatedName("qc.m")
	public static int field2437;

	@ObfuscatedName("r.l")
	public static int[] field2570;

	@ObfuscatedName("ra.l")
	public static int[] field2600;

	@ObfuscatedName("ra.t")
	public static PixMap field2608;

	@ObfuscatedName("re.o")
	public static PixMap field2701;

	@ObfuscatedName("t.ub")
	public static Pix8 field2806;

	@ObfuscatedName("ta.Mb")
	public static int field2846;

	@ObfuscatedName("tb.bc")
	public static int[] field2904;

	@ObfuscatedName("tb.ic")
	public static int[] field2911;

	@ObfuscatedName("tc.h")
	public static Pix8 field2919;

	@ObfuscatedName("td.n")
	public static int field2945;

	@ObfuscatedName("td.r")
	public static int field2949;

	@ObfuscatedName("ua.A")
	public static int[] field3025;

	@ObfuscatedName("ub.j")
	public static long field3036;

	@ObfuscatedName("ub.u")
	public static long field3047;

	@ObfuscatedName("vb.Cb")
	public static int[] field3139;

	@ObfuscatedName("vb.Db")
	public static int field3140;

	@ObfuscatedName("wc.q")
	public static PixMap field3298;

	@ObfuscatedName("ca.u")
	public static FontMetrics field469;

	@ObfuscatedName("ca.x")
	public static PixMap field472;

	@ObfuscatedName("dd.o")
	public static PrivilegedRequest field715;

	@ObfuscatedName("ec.Ib")
	public static BufferedRandomAccessFile field797;

	@ObfuscatedName("ee.a")
	public static float field819;

	@ObfuscatedName("ee.e")
	public static int field823;

	@ObfuscatedName("f.p")
	public static Font field842;

	@ObfuscatedName("f.r")
	public static PixMap field844;

	@ObfuscatedName("fa.fb")
	public static Pix32 field851;

	@ObfuscatedName("fc.Cb")
	public static int[] field899;

	@ObfuscatedName("fd.zb")
	public static DataFile field931;

	@ObfuscatedName("a.jb")
	public static JagString field62 = JagString.wrap("chatback");
	@ObfuscatedName("a.w")
	public static JagString field23 = JagString.wrap("scrollbar");
	@ObfuscatedName("bd.T")
	public static JagString field406 = JagString.wrap("backbase2");
	@ObfuscatedName("nd.ab")
	public static JagString field2112 = JagString.wrap(")3");
	@ObfuscatedName("nd.j")
	public static JagString field2069 = JagString.wrap("@gr2@");
	@ObfuscatedName("nd.z")
	public static JagString field2085 = JagString.wrap(":chalreq:");
	@ObfuscatedName("pb.A")
	public static JagString field2297 = JagString.wrap("(U2");
	@ObfuscatedName("ld.E")
	public static JagString field1751 = JagString.wrap("title)3jpg");
	@ObfuscatedName("wc.y")
	public static JagString field3306 = JagString.wrap("@or2@");
	@ObfuscatedName("g.l")
	public static JagString field989 = JagString.wrap("(Z");
	@ObfuscatedName("g.B")
	public static JagString field1005 = JagString.wrap("@gr3@");
	@ObfuscatedName("ad.H")
	public static JagString field221 = JagString.wrap("(X");
	@ObfuscatedName("ae.e")
	public static JagString field228 = JagString.wrap("::hiddenbuttontest");
	@ObfuscatedName("ae.k")
	public static JagString field234 = JagString.wrap("mapdots");
	@ObfuscatedName("bb.h")
	public static JagString field318 = JagString.wrap("backvmid3");
	@ObfuscatedName("bb.o")
	public static JagString field325 = JagString.wrap("mapmarker");
	@ObfuscatedName("bb.r")
	public static JagString field328 = JagString.wrap(" )2> @lre@");
	@ObfuscatedName("ca.g")
	public static JagString field455 = JagString.wrap("backright1");
	@ObfuscatedName("ca.y")
	public static JagString field473 = JagString.wrap("runes");
	@ObfuscatedName("ca.E")
	public static JagString field479 = JagString.wrap("");
	@ObfuscatedName("ca.D")
	public static JagString field478 = JagString.wrap("backhmid2");
	@ObfuscatedName("cb.v")
	public static JagString field501 = JagString.wrap("@or1@");
	@ObfuscatedName("cc.Ib")
	public static JagString field524 = JagString.wrap(" )2> @cya@");
	@ObfuscatedName("cd.e")
	public static JagString field533 = JagString.wrap("backhmid1");
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
	@ObfuscatedName("d.Sb")
	public static JagString field622 = JagString.wrap("Oct");
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
	@ObfuscatedName("dd.m")
	public static JagString field713 = JagString.wrap(":  ");
	@ObfuscatedName("ec.Ab")
	public static JagString field789 = JagString.wrap("::noclip");
	@ObfuscatedName("ec.Qb")
	public static JagString field805 = JagString.wrap(" )2> @yel@");
	@ObfuscatedName("f.t")
	public static JagString field846 = JagString.wrap(":0");
	@ObfuscatedName("ga.B")
	public static JagString[] field1017 = new JagString[100];
	@ObfuscatedName("ga.S")
	public static JagString field1034 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("gb.j")
	public static JagString field1056 = JagString.wrap("titlebutton");
	@ObfuscatedName("gb.s")
	public static JagString field1065 = JagString.wrap(": ");
	@ObfuscatedName("h.rc")
	public static JagString field1133 = JagString.wrap("(X100(U(Y");
	@ObfuscatedName("hb.fb")
	public static JagString field1160 = JagString.wrap(")1");
	@ObfuscatedName("hb.lb")
	public static JagString field1166 = JagString.wrap("(U5");
	@ObfuscatedName("hb.ob")
	public static JagString field1169 = JagString.wrap("redstone1");
	@ObfuscatedName("hd.sb")
	public static JagString field1191 = JagString.wrap(":duelreq:");
	@ObfuscatedName("hd.Fb")
	public static JagString field1204 = JagString.wrap("@yel@*V");
	@ObfuscatedName("he.Ab")
	public static JagString field1229 = JagString.wrap(":tradereq:");
	@ObfuscatedName("he.Qb")
	public static JagString field1245 = JagString.wrap("titlebox");
	@ObfuscatedName("i.u")
	public static JagString field1275 = JagString.wrap(" (X");
	@ObfuscatedName("ia.Ub")
	public static JagString field1309 = JagString.wrap("(Udns");
	@ObfuscatedName("id.x")
	public static JagString field1383 = JagString.wrap("@red@");
	@ObfuscatedName("id.y")
	public static JagString field1384 = null;
	@ObfuscatedName("id.C")
	public static JagString field1388 = JagString.wrap("huffman");
	@ObfuscatedName("ie.e")
	public static JagString field1393 = JagString.wrap("@whi@");
	@ObfuscatedName("j.lc")
	public static JagString field1437 = JagString.wrap("");
	@ObfuscatedName("j.oc")
	public static JagString field1440 = JagString.wrap("mapfunction");
	@ObfuscatedName("jc.gb")
	public static JagString field1453 = JagString.wrap("p11_full");
	@ObfuscatedName("jc.ob")
	public static JagString field1461 = JagString.wrap("overlay_multiway");
	@ObfuscatedName("jc.tb")
	public static JagString field1466 = JagString.wrap("hitmarks");
	@ObfuscatedName("je.cc")
	public static JagString field1500 = JagString.wrap(" )2> @whi@");
	@ObfuscatedName("k.L")
	public static JagString field1523 = null;
	@ObfuscatedName("k.O")
	public static JagString field1526 = JagString.wrap("b12_full");
	@ObfuscatedName("kb.v")
	public static JagString field1562 = JagString.wrap("k");
	@ObfuscatedName("kc.c")
	public static JagString field1567 = JagString.wrap("invback");
	@ObfuscatedName("kc.h")
	public static JagString field1572 = JagString.wrap(")2");
	@ObfuscatedName("kd.H")
	public static JagString field1631 = JagString.wrap("null");
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
	@ObfuscatedName("la.K")
	public static JagString field1691 = JagString.wrap("scape main");
	@ObfuscatedName("m.c")
	public static JagString field1756 = JagString.wrap("Cabbage");
	@ObfuscatedName("m.l")
	public static JagString field1765 = JagString.wrap("::");
	@ObfuscatedName("m.u")
	public static JagString field1774 = JagString.wrap(")1");
	@ObfuscatedName("ma.jb")
	public static JagString field1786 = JagString.wrap("Mem:");
	@ObfuscatedName("mc.g")
	public static JagString field1852 = JagString.wrap("null");
	@ObfuscatedName("n.s")
	public static JagString field1925 = JagString.wrap("@gr1@");
	@ObfuscatedName("na.a")
	public static JagString field1929 = JagString.wrap("mod_icons");
	@ObfuscatedName("na.j")
	public static JagString field1938 = JagString.wrap("(U1");
	@ObfuscatedName("na.n")
	public static JagString field1942 = JagString.wrap(" )2>");
	@ObfuscatedName("ob.k")
	public static JagString field2162 = JagString.wrap("backleft2");
	@ObfuscatedName("ob.n")
	public static JagString field2165 = JagString.wrap(":");
	@ObfuscatedName("oe.m")
	public static JagString field2181 = JagString.wrap("(U");
	@ObfuscatedName("oe.o")
	public static JagString field2183 = JagString.wrap("null");
	@ObfuscatedName("pc.B")
	public static JagString field2333 = JagString.wrap("mapback");
	@ObfuscatedName("pe.vb")
	public static JagString field2355 = JagString.wrap("backvmid2");
	@ObfuscatedName("qb.b")
	public static JagString field2406 = JagString.wrap(" ");
	@ObfuscatedName("qd.jd")
	public static JagString field2535 = JagString.wrap("@cr2@");
	@ObfuscatedName("qd.xc")
	public static JagString field2497 = JagString.wrap("::errortest");
	@ObfuscatedName("r.f")
	public static JagString field2564 = JagString.wrap("@gre@");
	@ObfuscatedName("r.A")
	public static JagString field2585 = JagString.wrap("");
	@ObfuscatedName("ra.m")
	public static JagString field2601 = JagString.wrap("(Y");
	@ObfuscatedName("ra.x")
	public static JagString field2612 = JagString.wrap("@cr1@");
	@ObfuscatedName("rc.c")
	public static JagString field2629 = JagString.wrap(" @whi@(X");
	@ObfuscatedName("rc.t")
	public static JagString field2646 = JagString.wrap("headicons_hint");
	@ObfuscatedName("rd.b")
	public static JagString field2659 = JagString.wrap("@whi@ )4 ");
	@ObfuscatedName("rd.y")
	public static JagString field2682 = JagString.wrap("backright2");
	@ObfuscatedName("re.m")
	public static JagString field2699 = JagString.wrap("@yel@");
	@ObfuscatedName("re.n")
	public static JagString field2700 = JagString.wrap("compass");
	@ObfuscatedName("s.o")
	public static JagString field2716 = JagString.wrap("(U4");
	@ObfuscatedName("sd.s")
	public static JagString field2772 = JagString.wrap("0(U");
	@ObfuscatedName("se.k")
	public static JagString field2783 = JagString.wrap("::clientdrop");
	@ObfuscatedName("se.z")
	public static JagString field2798 = JagString.wrap("backvmid1");
	@ObfuscatedName("se.D")
	public static JagString field2802 = JagString.wrap("Chat panel redrawn");
	@ObfuscatedName("t.Gb")
	public static JagString field2818 = JagString.wrap("sideicons");
	@ObfuscatedName("tb.hc")
	public static JagString field2910 = JagString.wrap("redstone2");
	@ObfuscatedName("tc.p")
	public static JagString field2927 = JagString.wrap("backbase1");
	@ObfuscatedName("te.qb")
	public static JagString field2965 = JagString.wrap("headicons_pk");
	@ObfuscatedName("te.tb")
	public static JagString field2968 = JagString.wrap("::fpsoff");
	@ObfuscatedName("ua.i")
	public static JagString field3007 = JagString.wrap("mapedge");
	@ObfuscatedName("ua.s")
	public static JagString field3017 = JagString.wrap("null");
	@ObfuscatedName("ua.v")
	public static JagString field3020 = JagString.wrap("backleft1");
	@ObfuscatedName("ua.B")
	public static JagString field3026 = JagString.wrap("Fps:");
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
	@ObfuscatedName("uc.D")
	public static JagString field3066 = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("uc.L")
	public static JagString field3074 = field3066;
	@ObfuscatedName("va.gb")
	public static JagString field3111 = JagString.wrap("Service unavailable)3");
	@ObfuscatedName("va.xb")
	public static JagString field3128 = field3111;
	@ObfuscatedName("va.nb")
	public static JagString field3118 = JagString.wrap("cross");
	@ObfuscatedName("vb.zb")
	public static JagString field3136 = JagString.wrap("@cya@");
	@ObfuscatedName("vc.r")
	public static JagString field3163 = JagString.wrap("redstone3");
	@ObfuscatedName("vd.vd")
	public static JagString field3177 = null;
	@ObfuscatedName("w.g")
	public static JagString field3203 = JagString.wrap(" x ");
	@ObfuscatedName("wa.e")
	public static JagString field3211 = JagString.wrap("Side panel redrawn");
	@ObfuscatedName("wa.g")
	public static JagString field3213 = JagString.wrap("Icons redrawn");
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
	@ObfuscatedName("wb.K")
	public static JagString field3277 = JagString.wrap("(U3");
	@ObfuscatedName("kb.g")
	public static LinkList field1547 = new LinkList();
	@ObfuscatedName("ha.a")
	public static int field1144 = 0;
	@ObfuscatedName("fc.Gb")
	public static int field903 = -1;
	@ObfuscatedName("pe.Lb")
	public static LinkList field2371 = new LinkList();
	@ObfuscatedName("pe.Ub")
	public static int field2380 = 0;
	@ObfuscatedName("h.Yb")
	public static int field1114 = 0;
	@ObfuscatedName("he.Ib")
	public static int field1237 = 0;
	@ObfuscatedName("va.lb")
	public static boolean field3116 = false;
	@ObfuscatedName("j.hc")
	public static int field1433 = 0;
	@ObfuscatedName("je.Lb")
	public static int[] field1483 = new int[25];
	@ObfuscatedName("je.Zb")
	public static int field1497 = -1;
	@ObfuscatedName("d.oc")
	public static int[] field644 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	@ObfuscatedName("ad.z")
	public static Object field213 = new Object();
	@ObfuscatedName("ad.A")
	public static int field214 = -1;
	@ObfuscatedName("ad.G")
	public static byte[] field220 = new byte[]{95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
	@ObfuscatedName("ld.C")
	public static int field1749 = 0;
	@ObfuscatedName("la.y")
	public static int field1679 = 0;
	@ObfuscatedName("mc.l")
	public static int field1857 = 0;
	@ObfuscatedName("oa.u")
	public static int field2146 = 0;
	@ObfuscatedName("nd.y")
	public static int field2084 = 0;
	@ObfuscatedName("wc.i")
	public static int field3290 = 0;
	@ObfuscatedName("wc.w")
	public static int field3304 = 0;
	@ObfuscatedName("wb.B")
	public static boolean field3268 = false;
	@ObfuscatedName("ba.lc")
	public static int field307 = 0;
	@ObfuscatedName("fe.vc")
	public static boolean field953 = false;
	@ObfuscatedName("fe.Ac")
	public static long field958 = 0L;
	@ObfuscatedName("bd.X")
	public static boolean field410 = false;
	@ObfuscatedName("oe.l")
	public static int field2180 = 256;
	@ObfuscatedName("k.C")
	public static int[] field1514 = new int[99];
	@ObfuscatedName("wa.f")
	public static int field3212 = 0;
	@ObfuscatedName("wa.i")
	public static int field3215 = -1;
	@ObfuscatedName("wa.D")
	public static int[] field3236 = new int[100];
	@ObfuscatedName("dc.ib")
	public static int field682 = 0;
	@ObfuscatedName("ta.vc")
	public static int field2881 = -1;
	@ObfuscatedName("hc.r")
	public static boolean[] field1190 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false};
	@ObfuscatedName("cd.p")
	public static int field544 = 0;
	@ObfuscatedName("cd.w")
	public static int field551 = 0;

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
		TextGerman.field547 = null;
		Text.field539 = null;
		field533 = null;
		Client.field549 = null;
		Client.groundObj = null;
		TextGerman.field538 = null;
		Text.field541 = null;
		Client.routeZ = null;
		Client.field548 = null;
	}

	@ObfuscatedName("cc.f(I)V")
	public static void method269() {
		TextGerman.field526 = null;
		field524 = null;
		Text.field520 = null;
		Text.field521 = null;
		Client.field522 = null;
		BgSound.field515 = null;
	}

	@ObfuscatedName("hd.b(Z)V")
	public static void method477() {
		Text.field1218 = null;
		Text.field1203 = null;
		field1191 = null;
		Text.field1216 = null;
		Text.field1220 = null;
		field1204 = null;
		Text.field1195 = null;
		Client.field1193 = null;
		Text.field1215 = null;
		Text.field1199 = null;
		Text.field1219 = null;
		SeqType.recentUse = null;
		TextGerman.field1214 = null;
		Text.field1217 = null;
		Text.field1197 = null;
	}

	@ObfuscatedName("na.a(B)V")
	public static void method721() {
		Text.field1930 = null;
		Text.field1943 = null;
		field1938 = null;
		field1929 = null;
		Text.field1933 = null;
		Client.field1932 = null;
		MidiPlayer.field1937 = null;
		TextGerman.field1944 = null;
		Text.field1931 = null;
		field1942 = null;
		field1935 = null;
		Text.field1934 = null;
		Text.field1936 = null;
	}

	@ObfuscatedName("sa.a(I)V")
	public static void method904() {
		TextGerman.field2730 = null;
		ScriptRunner.field2736 = null;
		Client.field2731 = null;
		Client.scripts = null;
		TextGerman.field2732 = null;
		Client.field2745 = null;
	}

	@ObfuscatedName("hc.a(I)V")
	public static void method471() {
		Text.field1188 = null;
		Text.field1174 = null;
		TextGerman.field1180 = null;
		field1177 = null;
		Client.field1176 = null;
		Text.field1184 = null;
		Text.field1175 = null;
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

	@ObfuscatedName("he.f(I)V")
	public static void method484() {
		field1245 = null;
		SeqType.configClient = null;
		TextGerman.field1232 = null;
		Client.field1239 = null;
		field1229 = null;
		Client.field1231 = null;
		TextGerman.field1238 = null;
		TextGerman.field1244 = null;
		ClientBuild.field1247 = null;
	}

	@ObfuscatedName("pc.a(I)V")
	public static void method814() {
		TextGerman.field2335 = null;
		Client.field2334 = null;
		TextGerman.field2329 = null;
		Text.field2337 = null;
		Text.field2310 = null;
		Text.field2313 = null;
		TextGerman.field2336 = null;
		Text.field2308 = null;
		Text.field2318 = null;
		Text.field2319 = null;
		Text.field2320 = null;
		Text.field2325 = null;
		LocType.mc1 = null;
		Text.field2315 = null;
		field2333 = null;
		Text.field2317 = null;
		Text.field2309 = null;
		Client.jingles = null;
		Text.field2331 = null;
	}

	@ObfuscatedName("dc.b(I)V")
	public static void method315() {
		Client.waveDelay = null;
		LocType.configClient = null;
		Client.npcIds = null;
		field676 = null;
		Client.field680 = null;
	}

	@ObfuscatedName("dd.a(B)V")
	public static void method318() {
		TextGerman.field712 = null;
		TextGerman.field707 = null;
		field715 = null;
		Client.field704 = null;
		TextGerman.field703 = null;
		TextGerman.field719 = null;
		TextGerman.field706 = null;
		TextGerman.field717 = null;
		TextGerman.field702 = null;
		TextGerman.field716 = null;
		Text.field705 = null;
		Text.field720 = null;
		Client.field708 = null;
		Text.field714 = null;
		field713 = null;
		Text.field718 = null;
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

	@ObfuscatedName("ra.a(I)J")
	public static synchronized long currentTime() {
		long var0 = System.currentTimeMillis();
		if (field3036 > var0) {
			field3047 += field3036 - var0;
		}
		field3036 = var0;
		return field3047 + var0;
	}

	@ObfuscatedName("sd.a(I)V")
	public static void method927() {
		Client.spotanims = null;
		field2772 = null;
		Client.field2770 = null;
		Client.dirMap = null;
		VarBitType.recentUse = null;
		Text.field2760 = null;
		Text.field2768 = null;
		Js5Net.field2769 = null;
		Text.field2763 = null;
		TextGerman.field2764 = null;
		Text.field2767 = null;
		PixLoader.xof = null;
		Client.playerIds = null;
		Text.field2765 = null;
		Text.field2757 = null;
	}

	@ObfuscatedName("ae.a(B)V")
	public static void method123() {
		field228 = null;
		Text.field231 = null;
		field234 = null;
		field229 = null;
		Text.field227 = null;
		TextGerman.field232 = null;
	}

	@ObfuscatedName("w.a(B)V")
	public static void method1027() {
		Client.interfaces = null;
		Js5Loader.field3198 = null;
		TextGerman.field3197 = null;
		Text.field3205 = null;
		field3203 = null;
		Text.field3202 = null;
	}

	@ObfuscatedName("ac.b(I)V")
	public static void method99() {
		GameShell.field187 = null;
		Client.field178 = null;
		Text.field183 = null;
		TextGerman.field172 = null;
		Text.field186 = null;
		VarCache.field173 = null;
		ClientBuild.field181 = null;
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
		Text.field1151 = null;
		TextGerman.field1147 = null;
		TextGerman.field1150 = null;
		Text.field1152 = null;
	}

	@ObfuscatedName("wa.a(I)V")
	public static void method1032() {
		field3232 = null;
		Client.field3208 = null;
		TextGerman.field3225 = null;
		Text.field3222 = null;
		field3230 = null;
		field3211 = null;
		field3209 = null;
		field3210 = null;
		field3236 = null;
		field3213 = null;
		Text.field3221 = null;
		field3217 = null;
		Text.field3219 = null;
		TextGerman.field3216 = null;
		Text.field3239 = null;
		ClientKeyboardListener.KEY_CODE_MAP = null;
		field3234 = null;
		field3223 = null;
	}

	@ObfuscatedName("t.f(I)V")
	public static void method935() {
		Text.field2823 = null;
		field2806 = null;
		Text.field2821 = null;
		Client.field2807 = null;
		PlayerModel.field2808 = null;
		field2818 = null;
		TextGerman.field2804 = null;
		IfType.field2810 = null;
		ClientBuild.field2819 = null;
		TextGerman.field2824 = null;
		Text.field2817 = null;
		TextGerman.field2812 = null;
		Text.field2805 = null;
	}

	@ObfuscatedName("pb.a(I)V")
	public static void method800() {
		Text.field2300 = null;
		Client.field2303 = null;
		Client.locChanges = null;
		Client.idkDesign = null;
		field2297 = null;
		Client.field2277 = null;
		Client.field2305 = null;
		Js5Net.field2301 = null;
		Client.mapBuildGroundFile = null;
		TextGerman.field2304 = null;
		TextGerman.field2299 = null;
		Text.field2296 = null;
		TextGerman.field2279 = null;
		TextGerman.field2298 = null;
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

	@ObfuscatedName("ma.b(I)V")
	public static void method682() {
		Client.field1780 = null;
		Text.field1789 = null;
		Client.field1788 = null;
		TextGerman.field1785 = null;
		field1786 = null;
		Text.field1784 = null;
		Text.field1787 = null;
		Text.field1782 = null;
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
		TextGerman.field2687 = null;
		field2699 = null;
		field2701 = null;
		ReflectionChecker.field2694 = null;
		Packet.field2698 = null;
		field2700 = null;
	}

	@ObfuscatedName("wc.a(I)V")
	public static void method1051() {
		Text.field3305 = null;
		field3306 = null;
		IfType.field3296 = null;
		field3298 = null;
		Client.field3299 = null;
		Text.field3303 = null;
		IdkType.recentUse = null;
		Text.field3307 = null;
		Text.field3302 = null;
		Text.field3295 = null;
		Text.field3300 = null;
	}

	@ObfuscatedName("qa.f(I)V")
	public static void method836() {
		Text.field2398 = null;
		Text.field2394 = null;
		Text.field2401 = null;
		Text.field2400 = null;
		Text.field2391 = null;
		Client.field2397 = null;
		Text.field2393 = null;
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

	@ObfuscatedName("fe.n(I)V")
	public static void method411() {
		Js5Net.field967 = null;
		TextGerman.field977 = null;
		Text.field971 = null;
		Client.field964 = null;
		Client.waveSounds = null;
		TextGerman.field962 = null;
		Text.field957 = null;
		TextGerman.field976 = null;
	}

	@ObfuscatedName("ra.b(I)V")
	public static void method871() {
		Text.field2609 = null;
		Text.field2602 = null;
		Text.field2598 = null;
		field2612 = null;
		Text.field2603 = null;
		Text.field2610 = null;
		field2600 = null;
		Js5Net.field2596 = null;
		ScriptRunner.field2606 = null;
		field2608 = null;
		field2601 = null;
		Text.field2611 = null;
	}

	@ObfuscatedName("de.a(B)V")
	public static void method320() {
		while (true) {
			LinkList var0 = field1547;
			Js5WorkerRequest var1;
			synchronized (field1547) {
				var1 = (Js5WorkerRequest) field2371.popFront();
			}
			if (var1 == null) {
				return;
			}
			var1.field1456.method978(false, var1.field1454, (int) var1.key, var1.field1469);
		}
	}

	@ObfuscatedName("ga.d(I)V")
	public static void method421() {
		Text.field1031 = null;
		field1034 = null;
		Text.field1021 = null;
		Client.camShakeCycle = null;
		Text.field1041 = null;
		Text.field1036 = null;
		VarCache.field1020 = null;
		Text.field1024 = null;
		Text.field1043 = null;
		Text.field1037 = null;
		TextGerman.field1044 = null;
		Text.field1040 = null;
		Text.field1046 = null;
		TextGerman.field1011 = null;
		Text.field1030 = null;
		Text.field1038 = null;
		Text.field1018 = null;
		field1017 = null;
		TextGerman.field1022 = null;
		MidiManager.field1028 = null;
	}

	@ObfuscatedName("ib.a(B)V")
	public static void method520() {
		Client.field1347 = null;
		Client.field1353 = null;
		Client.field1348 = null;
		Js5Net.field1350 = null;
		Client.routeX = null;
		TextGerman.field1345 = null;
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
		Client.field1255 = null;
		Client.field1259 = null;
		TextGerman.field1264 = null;
		TextGerman.field1269 = null;
		field1275 = null;
	}

	@ObfuscatedName("ec.f(I)V")
	public static void method370() {
		TextGerman.field790 = null;
		field797 = null;
		Text.field796 = null;
		Text.field782 = null;
		Client.field800 = null;
		Client.field784 = null;
		Text.field798 = null;
		field805 = null;
		Text.field793 = null;
		TextGerman.field810 = null;
		field789 = null;
		Text.field785 = null;
		Text.field802 = null;
		TextGerman.field795 = null;
		TextGerman.field791 = null;
	}

	@ObfuscatedName("qc.a(I)V")
	public static void method849() {
		TextGerman.field2436 = null;
		LocType.mc3 = null;
		Client.soundMixer = null;
		TextGerman.field2438 = null;
		TextGerman.field2432 = null;
		Text.field2431 = null;
		TextGerman.field2429 = null;
		TextGerman.field2426 = null;
		Text.field2439 = null;
		IdkType.configClient = null;
	}

	@ObfuscatedName("bb.a(B)V")
	public static void method187() {
		field318 = null;
		Text.field326 = null;
		Text.field324 = null;
		field328 = null;
		Client.field313 = null;
		MidiManager.field311 = null;
		field325 = null;
		Text.field315 = null;
		Text.field332 = null;
		Client.field320 = null;
	}

	@ObfuscatedName("be.b(I)V")
	public static void method243() {
		TextGerman.field418 = null;
		TextGerman.field431 = null;
		TextGerman.field414 = null;
	}

	@ObfuscatedName("pe.f(I)V")
	public static void method823() {
		Text.field2362 = null;
		Text.field2382 = null;
		TextGerman.field2378 = null;
		field2355 = null;
		Client.configs = null;
		field2357 = null;
		Text.field2383 = null;
		TextGerman.field2381 = null;
		TextGerman.field2359 = null;
		Text.field2354 = null;
		field2371 = null;
		Client.waveSoundIds = null;
		Text.field2360 = null;
	}

	@ObfuscatedName("j.c(B)V")
	public static void method534() {
		TextGerman.field1430 = null;
		field1440 = null;
		field1435 = null;
		TextGerman.field1439 = null;
		Text.field1434 = null;
		field1437 = null;
		Client.field1438 = null;
		ClientMouseListener.field1412 = null;
		Text.field1431 = null;
		Text.field1429 = null;
		Text.field1432 = null;
		TextGerman.field1436 = null;
	}

	@ObfuscatedName("ub.a(Z)V")
	public static void method991() {
		TextGerman.field3051 = null;
		Client.field3046 = null;
		Text.field3045 = null;
		Text.field3043 = null;
		ObjType.modelCache = null;
		GameShell.canvas = null;
		Text.field3044 = null;
		Text.field3054 = null;
		ClientBuild.field3053 = null;
	}

	@ObfuscatedName("be.a([BIB)I")
	public static int method244(byte[] arg0, int arg1) {
		return Packet.method1044(0, arg1, arg0);
	}

	@ObfuscatedName("kb.b(B)V")
	public static void method596() {
		field1562 = null;
		Text.field1564 = null;
		ByteArrayPool.field1541 = null;
		Client.binary = null;
		Text.field1557 = null;
		Text.field1549 = null;
		Client.field1556 = null;
		field1547 = null;
		Text.field1545 = null;
		Text.field1563 = null;
		VarBitType.configClient = null;
		Client.field1558 = null;
		Client.field1560 = null;
		Text.field1561 = null;
		Client.field1553 = null;
	}

	@ObfuscatedName("g.a(Z)V")
	public static void method420() {
		Text.field1006 = null;
		field1005 = null;
		Client.field993 = null;
		Text.field1000 = null;
		Js5Net.field996 = null;
		ClientBuild.field1003 = null;
		LocType.mc2 = null;
		field989 = null;
		Client.field994 = null;
		SpotType.configClient = null;
	}

	@ObfuscatedName("hb.e(I)V")
	public static void method470() {
		field1166 = null;
		TextGerman.field1171 = null;
		field1160 = null;
		field1169 = null;
		Client.field1167 = null;
		ScriptRunner.field1162 = null;
	}

	@ObfuscatedName("pb.a(IB)La;")
	public static JagString method803(int arg0) {
		JagString var1 = method502(arg0);
		for (int var2 = var1.method10() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[]{var1.method19(0, var2), field1774, var1.method1(var2)});
		}
		if (var1.method10() > 8) {
			var1 = JagString.join(new JagString[]{field2564, var1.method19(0, var1.method10() - 8), Text.field1896, field2629, var1, field2601});
		} else if (var1.method10() > 4) {
			var1 = JagString.join(new JagString[]{field3136, var1.method19(0, var1.method10() - 4), Text.field2360, field2629, var1, field2601});
		}
		return JagString.join(new JagString[]{field2406, var1});
	}

	@ObfuscatedName("ca.c(I)V")
	public static void method257() {
		Text.field460 = null;
		Text.field452 = null;
		Client.field471 = null;
		field469 = null;
		field479 = null;
		ObjType.models = null;
		Text.field465 = null;
		Client.field477 = null;
		ScriptRunner.field453 = null;
		field473 = null;
		field472 = null;
		field478 = null;
		Client.field470 = null;
		TextGerman.field474 = null;
		TextGerman.field467 = null;
		Text.field468 = null;
		field455 = null;
	}

	@ObfuscatedName("n.a(I)V")
	public static void method715() {
		TextGerman.field1920 = null;
		Js5Net.field1917 = null;
		Text.field1923 = null;
		TextGerman.field1908 = null;
		Client.cross = null;
		TextGerman.field1927 = null;
		TextGerman.field1928 = null;
		Text.field1921 = null;
		TextGerman.field1915 = null;
		field1925 = null;
	}

	@ObfuscatedName("md.a(BIII)I")
	public static int method700(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("mb.a(I)V")
	public static void method687() {
		Text.field1816 = null;
		Text.field1807 = null;
		TextGerman.field1794 = null;
		Text.field1834 = null;
		SpotType.modelCache = null;
		Js5Net.field1831 = null;
		Text.field1819 = null;
		Client.field1842 = null;
		JagString.cache = null;
		TextGerman.field1840 = null;
		Client.field1845 = null;
	}

	@ObfuscatedName("fd.f(I)V")
	public static void method405() {
		Text.field926 = null;
		SeqType.anims = null;
		Client.field925 = null;
		IfType.field924 = null;
		Text.field932 = null;
		PacketBit.field936 = null;
		field931 = null;
		TextGerman.field929 = null;
		Text.field942 = null;
		Text.field927 = null;
	}

	@ObfuscatedName("cb.a(I)V")
	public static void method266() {
		Text.field487 = null;
		Text.field507 = null;
		Text.field486 = null;
		Text.field506 = null;
		Text.field502 = null;
		TextGerman.field505 = null;
		Client.in = null;
		TextGerman.field499 = null;
		IfType.field500 = null;
		IfType.field503 = null;
		field501 = null;
		Text.field497 = null;
	}

	@ObfuscatedName("ie.a(I)V")
	public static void method531() {
		TextGerman.field1404 = null;
		TextGerman.field1403 = null;
		TextGerman.field1402 = null;
		field1397 = null;
		Text.field1407 = null;
		Text.field1394 = null;
		field1393 = null;
		TextGerman.field1406 = null;
		ObjType.configClient = null;
		Text.field1392 = null;
		Text.field1396 = null;
	}

	@ObfuscatedName("tc.a(B)V")
	public static void method963() {
		Client.field2917 = null;
		IfType.field2922 = null;
		ClientBuild.field2930 = null;
		Text.field2926 = null;
		field2919 = null;
		Text.field2931 = null;
		Client.field2929 = null;
		field2927 = null;
		ClientKeyboardListener.instance = null;
		Text.field2923 = null;
		Text.field2928 = null;
		Client.field2925 = null;
	}

	@ObfuscatedName("vc.a(Z)V")
	public static void method1017() {
		TextGerman.field3151 = null;
		Text.field3172 = null;
		TextGerman.field3169 = null;
		TextGerman.field3148 = null;
		VarpType.configClient = null;
		TextGerman.field3170 = null;
		Text.field3146 = null;
		field3163 = null;
	}

	@ObfuscatedName("s.a(I)V")
	public static void method898() {
		TextGerman.field2708 = null;
		Text.field2710 = null;
		field2716 = null;
		Text.field2707 = null;
		Client.songs = null;
		Text.field2717 = null;
		Client.soundDecimator = null;
		Text.field2714 = null;
	}

	@ObfuscatedName("jc.b(B)V")
	public static void method543() {
		Text.field1463 = null;
		ClientBuild.groundh = null;
		field1466 = null;
		Text.field1473 = null;
		ScriptRunner.field1468 = null;
		Text.field1455 = null;
		field1461 = null;
		Client.stream = null;
		Text.field1449 = null;
		field1453 = null;
		Client.field1458 = null;
		Client.field1457 = null;
		ClientKeyboardListener.keyCodeBuffer = null;
	}

	@ObfuscatedName("qb.a(B)V")
	public static void method843() {
		TextGerman.field2420 = null;
		Js5Net.field2415 = null;
		field2406 = null;
		Text.field2412 = null;
		Text.field2405 = null;
		Text.field2407 = null;
		Text.field2408 = null;
	}

	@ObfuscatedName("oe.a(I)V")
	public static void method759() {
		TextGerman.field2174 = null;
		Client.field2187 = null;
		Text.field2173 = null;
		ByteArrayPool.field2179 = null;
		field2181 = null;
		Text.field2172 = null;
		Text.field2178 = null;
		Client.mapKeys = null;
		field2183 = null;
	}

	@ObfuscatedName("kd.a(Z)V")
	public static void method616() {
		TextGerman.field1632 = null;
		Client.field1605 = null;
		field1631 = null;
		field1625 = null;
		GameShell.field1601 = null;
		TextGerman.field1611 = null;
		Client.field1598 = null;
		TextGerman.field1618 = null;
		GameShell.field1599 = null;
		TextGerman.field1622 = null;
	}

	@ObfuscatedName("fa.b(I)V")
	public static void method388() {
		Text.field850 = null;
		Text.field863 = null;
		Text.field858 = null;
		Text.field855 = null;
		TextGerman.field852 = null;
		TextGerman.field859 = null;
		Text.field865 = null;
		Text.field861 = null;
		ClientBuild.field856 = null;
		Text.field862 = null;
		TextGerman.field854 = null;
		field851 = null;
	}

	@ObfuscatedName("nc.a(B)V")
	public static void method735() {
		Text.field2037 = null;
		field2044 = null;
		TextGerman.field2036 = null;
		Text.field2054 = null;
		TextGerman.field2048 = null;
		field2055 = null;
		Text.field2041 = null;
		Text.field2056 = null;
		TextGerman.field2051 = null;
		TextGerman.field2035 = null;
		Client.field2045 = null;
		Text.field2047 = null;
		Text.field2052 = null;
	}

	@ObfuscatedName("oa.a(B)V")
	public static void method750() {
		Text.field2126 = null;
		TextGerman.field2141 = null;
		Text.field2139 = null;
		Text.field2127 = null;
		Text.field2150 = null;
		SeqType.framesetCache = null;
		field2151 = null;
		ClientBuild.field2131 = null;
		Text.field2133 = null;
		Text.field2128 = null;
		Text.field2143 = null;
		Text.field2135 = null;
		Text.field2149 = null;
		Text.field2140 = null;
		Text.field2138 = null;
	}

	@ObfuscatedName("ld.c(I)V")
	public static void method663() {
		MidiPlayer.field1753 = null;
		GameShell.field1747 = null;
		TextGerman.field1745 = null;
		field1751 = null;
		ClientBuild.field1740 = null;
		Client.out = null;
		Client.textures = null;
	}

	@ObfuscatedName("ua.c(I)V")
	public static void method988() {
		Client.field3015 = null;
		field3026 = null;
		field3025 = null;
		Client.field3021 = null;
		Client.loginout = null;
		Text.field3002 = null;
		Text.field3009 = null;
		TextGerman.field3006 = null;
		Text.field3019 = null;
		field3017 = null;
		Text.field3018 = null;
		Text.field3005 = null;
		Text.field3001 = null;
		Text.field3012 = null;
		Text.field3008 = null;
		field3020 = null;
		field3007 = null;
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
			ArrayUtil.copy(var8.field38, 0, var5, var6, var8.field26);
			var6 += var8.field26;
		}
		JagString var9 = new JagString();
		var9.field26 = var3;
		var9.field38 = var5;
		return var9;
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
		Text.field1847 = null;
		ClientBuild.field1872 = null;
		field1852 = null;
		Text.field1873 = null;
		GameShell.frame = null;
		PlayerModel.field1865 = null;
		TextGerman.field1870 = null;
		Text.field1863 = null;
		Client.field1871 = null;
		Text.field1874 = null;
		TextGerman.field1853 = null;
		TextGerman.field1858 = null;
	}

	@ObfuscatedName("md.a(JB)V")
	public static void method703(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Client.field1492 >= 100 && Client.membersAccount != 1 || Client.field1492 >= 200) {
			Client.method758(0, Text.field2931, field3234);
			return;
		}
		JagString var2 = method969(arg0).method36();
		for (int var3 = 0; var3 < Client.field1492; var3++) {
			if (Client.field2929[var3] == arg0) {
				Client.method758(0, JagString.join(new JagString[]{var2, Text.field3045}), field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field2146; var4++) {
			if (Client.field2683[var4] == arg0) {
				Client.method758(0, JagString.join(new JagString[]{Text.field2178, var2, Text.field2054}), field3234);
				return;
			}
		}
		if (var2.strEquals(Client.localPlayer.field86)) {
			return;
		}
		Client.field2951[Client.field1492] = var2;
		Client.field2929[Client.field1492] = arg0;
		Client.field1788[Client.field1492] = 0;
		Client.field1492++;
		Client.field1055 = true;
		Client.out.p1Enc(114);
		Client.out.p8(arg0);
	}

	@ObfuscatedName("rb.f(I)V")
	public static void method879() {
		ClientKeyboardListener.keyChBuffer = null;
		Js5Net.field2613 = null;
		Client.localPlayer = null;
		LocType.temp = null;
		Client.field2626 = null;
		Client.field2618 = null;
		Client.field2614 = null;
	}

	@ObfuscatedName("ia.b(Z)V")
	public static void method509() {
		Js5Net.field1328 = null;
		TextGerman.field1339 = null;
		TextGerman.field1343 = null;
		field1309 = null;
		field1307 = null;
	}

	@ObfuscatedName("vb.b(B)V")
	public static void method1013() {
		TextGerman.field3145 = null;
		Client.field3130 = null;
		Client.field3134 = null;
		Client.maps = null;
		Text.field3144 = null;
		field3139 = null;
		field3136 = null;
		Text.field3138 = null;
	}

	@ObfuscatedName("uc.f(I)V")
	public static void method999() {
		field3058 = null;
		field3066 = null;
		Client.field3079 = null;
		field3067 = null;
		field3062 = null;
		ScriptRunner.field3068 = null;
		field3060 = null;
		field3059 = null;
		TitleScreen.loginUser = null;
		field3074 = null;
		Text.field3072 = null;
		Text.field3057 = null;
		Text.field3056 = null;
		TextGerman.field3070 = null;
		field3077 = null;
		TitleScreen.loginPass = null;
		TextGerman.field3064 = null;
		Text.field3076 = null;
	}

	@ObfuscatedName("d.c(B)V")
	public static void method295() {
		field621 = null;
		field623 = null;
		field620 = null;
		Client.bases = null;
		Client.field632 = null;
		field647 = null;
		TextGerman.field634 = null;
		field648 = null;
		Text.field659 = null;
		field669 = null;
		field642 = null;
		field626 = null;
		field622 = null;
		Text.field671 = null;
		field644 = null;
		field672 = null;
		field624 = null;
		field655 = null;
		field645 = null;
		Text.field667 = null;
		Text.field666 = null;
	}

	@ObfuscatedName("ca.a(Loc;I)V")
	public static synchronized void method261(PcmStream arg0) {
		field1381 = arg0;
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method740() {
		Text.field2089 = null;
		Text.field2076 = null;
		Text.field2101 = null;
		TextGerman.field2102 = null;
		Text.field2077 = null;
		Text.field2110 = null;
		Text.field2061 = null;
		Text.field2071 = null;
		Text.field2104 = null;
		Text.field2091 = null;
		Text.field2109 = null;
		Text.field2113 = null;
		Text.field2081 = null;
		Text.field2096 = null;
		Text.field2080 = null;
		TextGerman.field2070 = null;
		field2112 = null;
		Text.field2086 = null;
		Text.field2088 = null;
		Text.field2111 = null;
		Text.field2100 = null;
		Text.field2079 = null;
		Text.field2083 = null;
		Text.field2066 = null;
		Text.field2092 = null;
		Text.field2068 = null;
		Text.field2078 = null;
		Text.field2082 = null;
		Text.field2067 = null;
		Text.field2093 = null;
		field2085 = null;
		Text.field2103 = null;
		Text.field2097 = null;
		Text.field2106 = null;
		field2069 = null;
		Text.field2060 = null;
		Text.field2090 = null;
		Text.field2094 = null;
		Text.field2074 = null;
		Text.field2062 = null;
		Text.field2095 = null;
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
		Text.field831 = null;
		Client.field843 = null;
		ClientScript.field830 = null;
		field846 = null;
		Text.field833 = null;
		Text.field836 = null;
		field844 = null;
		TextGerman.field838 = null;
		PixLoader.wi = null;
		Text.field832 = null;
		field842 = null;
		TitleScreen.field847 = null;
	}

	@ObfuscatedName("i.a(II)La;")
	public static JagString method502(int arg0) {
		return method418(false, arg0);
	}

	@ObfuscatedName("te.b(B)V")
	public static void method975() {
		ScriptRunner.field2957 = null;
		SeqType.bases = null;
		field2968 = null;
		field2965 = null;
		Client.field2951 = null;
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
		TextGerman.field2657 = null;
		TextGerman.field2644 = null;
		TextGerman.field2654 = null;
		Text.field2639 = null;
		Text.field2650 = null;
		Client.mapBuildLocationData = null;
		Text.field2634 = null;
		Text.field2632 = null;
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
			arg0.pos += field2357.method1033(arg0.data, var1.field26, 0, var1.field38, arg0.pos);
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

	@ObfuscatedName("kc.b(I)V")
	public static void method602() {
		TextGerman.field1576 = null;
		Client.field1578 = null;
		Text.field1591 = null;
		IdkType.models = null;
		field1567 = null;
		Text.field1582 = null;
		TextGerman.field1581 = null;
		Text.field1597 = null;
		Text.field1594 = null;
		ClientBuild.field1595 = null;
		Text.field1593 = null;
		field1572 = null;
		Text.field1566 = null;
	}

	@ObfuscatedName("tb.c(B)V")
	public static void method959() {
		TextGerman.field2903 = null;
		Client.field2899 = null;
		ClientBuild.field2906 = null;
		PlayerModel.field2894 = null;
		Client.b12 = null;
		Pix3D.field2909 = null;
		TextGerman.field2901 = null;
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

	@ObfuscatedName("va.b(I)V")
	public static void method1008() {
		Text.field3127 = null;
		TextGerman.field3120 = null;
		field3118 = null;
		TextGerman.field3125 = null;
		TextGerman.field3124 = null;
		TextGerman.field3115 = null;
		field3111 = null;
		TextGerman.field3113 = null;
		field3128 = null;
		Text.field3126 = null;
	}

	@ObfuscatedName("aa.k(I)V")
	public static void method44() {
		try {
			Graphics var0 = GameShell.canvas.getGraphics();
			Client.field925.method101(4, var0, 4);
		} catch (Exception var1) {
			GameShell.canvas.repaint();
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
		int var1 = arg0.g1();
		if (var1 == 0) {
			return null;
		}
		Object[] var2 = new Object[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				var2[var3] = Integer.valueOf(arg0.g4());
			} else if (var4 == 1) {
				var2[var3] = arg0.gjstr();
			}
		}
		return var2;
	}

	@ObfuscatedName("md.f(I)V")
	public static void method707() {
		Text.field1902 = null;
		Text.field1885 = null;
		Client.field1886 = null;
		TextGerman.field1883 = null;
		SpotType.models = null;
		Text.field1896 = null;
		Text.field1889 = null;
		Client.models = null;
	}

	@ObfuscatedName("re.a(ILba;)La;")
	public static JagString method893(Packet arg0) {
		return method474(arg0);
	}

	@ObfuscatedName("ta.h(I)V")
	public static void method946() {
		Client.waveLoops = null;
	}

	@ObfuscatedName("aa.c(Z)V")
	public static void method46() {
		TextGerman.field83 = null;
		TextGerman.field77 = null;
		MidiManager.field78 = null;
		TextGerman.field93 = null;
		Client.field92 = null;
		Text.field67 = null;
		Text.field101 = null;
		Text.field94 = null;
		TextGerman.field98 = null;
		Text.field64 = null;
	}

	@ObfuscatedName("ac.a(ILa;Lba;)I")
	public static int method105(JagString arg0, Packet arg1) {
		int var2 = arg1.pos;
		arg1.method185(arg0.field26);
		arg1.pos += field2357.method1036(0, arg1.pos, arg0.field26, arg0.field38, arg1.data);
		return arg1.pos - var2;
	}

	@ObfuscatedName("bd.b(I)V")
	public static void method225() {
		TextGerman.field409 = null;
		Client.field365 = null;
		field406 = null;
		PlayerModel.field379 = null;
		Text.field407 = null;
		Client.field375 = null;
		ClientBuild.field412 = null;
		Text.field408 = null;
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
		TextGerman.field2978 = null;
		Client.npc = null;
		TextGerman.field2980 = null;
		TextGerman.field2977 = null;
		TextGerman.field2995 = null;
		TextGerman.field2993 = null;
	}

	@ObfuscatedName("j.d(B)V")
	public static void method538() {
		ObjType.spriteCache.clear();
	}

	@ObfuscatedName("u.f(II)La;")
	public static JagString method984(int arg0) {
		return JagString.join(new JagString[]{method502(arg0 >> 24 & 0xFF), field2112, method502(arg0 >> 16 & 0xFF), field2112, method502(arg0 >> 8 & 0xFF), field2112, method502(arg0 & 0xFF)});
	}

	@ObfuscatedName("de.b(I)V")
	public static void method326() {
		Client.mapBuildLocationFile = null;
		TextGerman.field743 = null;
		Text.field725 = null;
		Client.field739 = null;
		Text.field726 = null;
		TextGerman.field732 = null;
		Text.field738 = null;
		Client.field724 = null;
		Client.playerOpPriority = null;
		VarpType.recentUse = null;
		Text.field733 = null;
	}

	@ObfuscatedName("wb.a(Z)V")
	public static void method1047() {
		ClientBuild.field3246 = null;
		Text.field3265 = null;
		GameShell.field3281 = null;
		TextGerman.field3279 = null;
		field3247 = null;
		TextGerman.field3280 = null;
		IfType.field3249 = null;
		TextGerman.field3258 = null;
		Text.field3272 = null;
		field3277 = null;
		NpcType.modelCache = null;
		ScriptRunner.field3255 = null;
		Text.field3257 = null;
		Text.field3252 = null;
		TextGerman.field3276 = null;
		NpcType.models = null;
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

	@ObfuscatedName("wa.b(II)Z")
	public static boolean method1037(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("qd.g(I)V")
	public static void method855() {
		TextGerman.field2522 = null;
		Text.field2477 = null;
		Text.field2484 = null;
		Text.field2512 = null;
		Text.field2492 = null;
		field2497 = null;
		field2535 = null;
		Text.field2443 = null;
		Text.field2480 = null;
		Text.field2546 = null;
		Text.field2490 = null;
	}

	@ObfuscatedName("td.b(Z)V")
	public static void method972() {
		TextGerman.field2933 = null;
		TextGerman.field2940 = null;
		TextGerman.field2941 = null;
		Text.field2943 = null;
		Text.field2948 = null;
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
		ClientKeyboardListener.keyHeld = null;
		Text.field1486 = null;
		Text.field1482 = null;
		Text.field1491 = null;
		Text.field1501 = null;
		TextGerman.field1494 = null;
		Text.field1498 = null;
		field1500 = null;
		field1483 = null;
		TextGerman.field1487 = null;
		Text.field1481 = null;
		TextGerman.field1503 = null;
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

	@ObfuscatedName("m.a(I)V")
	public static void method675() {
		TextGerman.field1758 = null;
		Text.field1778 = null;
		field1765 = null;
		Client.field1770 = null;
		Text.field1775 = null;
		field1774 = null;
		field1756 = null;
		TextGerman.field1776 = null;
		FloType.recentUse = null;
		Text.field1762 = null;
		Text.field1777 = null;
	}

	@ObfuscatedName("h.c(Z)I")
	public static int method456() {
		return 19;
	}

	@ObfuscatedName("ba.d(Z)V")
	public static void method175() {
		TextGerman.field310 = null;
		VarCache.field304 = null;
		Client.field279 = null;
		Text.field308 = null;
		Text.field303 = null;
		ObjType.spriteCache = null;
		PixLoader.bpal = null;
	}

	@ObfuscatedName("id.b(I)V")
	public static void method529() {
		Text.field1367 = null;
		Client.field1366 = null;
		Js5Net.field1363 = null;
		field1383 = null;
		field1384 = null;
		TextGerman.field1386 = null;
		Text.field1379 = null;
		ClientBuild.field1385 = null;
		Text.field1364 = null;
		Client.field1376 = null;
		Client.anims = null;
		Text.field1362 = null;
		field1388 = null;
		TextGerman.field1382 = null;
		Client.loginSocketReq = null;
		field1381 = null;
	}

	@ObfuscatedName("nb.i(I)V")
	public static void method730() {
		TextGerman.field2032 = null;
		Client.jagFX = null;
		Text.field1966 = null;
		TextGerman.field2028 = null;
		Text.field2012 = null;
		Text.field1988 = null;
		Client.field2034 = null;
		Client.players = null;
		FluType.configClient = null;
		Text.field2029 = null;
		FloType.configClient = null;
		JagException.signlink = null;
		PixLoader.yof = null;
		Text.field1998 = null;
		Client.field2023 = null;
		Client.field1993 = null;
		Text.field2033 = null;
	}

	@ObfuscatedName("se.a(B)V")
	public static void method934() {
		Text.field2778 = null;
		VarCache.var = null;
		ByteArrayPool.field2801 = null;
		Text.field2789 = null;
		field2798 = null;
		LocType.recentUse = null;
		Client.field2782 = null;
		PixLoader.bspr = null;
		field2802 = null;
		field2783 = null;
		NpcType.configClient = null;
	}

	@ObfuscatedName("vd.k(I)V")
	public static void method1025() {
		TextGerman.field3189 = null;
		Client.field3186 = null;
		Text.field3196 = null;
		Text.field3187 = null;
		Text.field3179 = null;
		field3177 = null;
		Text.field3193 = null;
		TextGerman.field3190 = null;
		PixLoader.hi = null;
		TextGerman.field3184 = null;
		Client.world = null;
		TextGerman.field3191 = null;
	}

	@ObfuscatedName("rd.a(I)V")
	public static void method889() {
		Client.field2686 = null;
		Client.p12 = null;
		FluType.recentUse = null;
		field2659 = null;
		Text.field2667 = null;
		TextGerman.field2662 = null;
		TextGerman.field2681 = null;
		TextGerman.field2685 = null;
		field2682 = null;
		Text.field2671 = null;
		IfType.field2680 = null;
		Text.field2675 = null;
		Client.field2683 = null;
		TextGerman.field2679 = null;
		Text.field2676 = null;
	}

	@ObfuscatedName("k.d(I)V")
	public static void method577() {
		Text.field1511 = null;
		Client.waveAmbient = null;
		Text.field1525 = null;
		field1523 = null;
		Text.field1522 = null;
		field1514 = null;
		Client.field1524 = null;
		Text.field1510 = null;
		Text.field1527 = null;
		Text.field1529 = null;
		field1526 = null;
	}

	@ObfuscatedName("r.b(I)V")
	public static void method867() {
		Client.distMap = null;
		Text.field2565 = null;
		TextGerman.field2562 = null;
		Text.field2560 = null;
		field2564 = null;
		Client.collision = null;
		Text.field2583 = null;
		Text.field2578 = null;
		field2570 = null;
		Text.field2580 = null;
		field2585 = null;
		TextGerman.field2563 = null;
		Text.field2574 = null;
		Text.field2582 = null;
		Client.field2587 = null;
		Text.field2575 = null;
		Client.field2588 = null;
		Client.field2586 = null;
		Text.field2571 = null;
		Text.field2576 = null;
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method426() {
		TextGerman.field1079 = null;
		field1065 = null;
		Text.field1068 = null;
		Text.field1076 = null;
		Client.field1074 = null;
		field1056 = null;
		NpcType.recentUse = null;
		TextGerman.field1077 = null;
		ObjType.recentUse = null;
		TextGerman.field1073 = null;
		GameShell.signlink = null;
		Client.mapBuildIndex = null;
		TextGerman.field1067 = null;
	}

	@ObfuscatedName("h.k(I)V")
	public static void method461() {
		Client.field1096 = null;
		Client.sprites = null;
		Text.field1098 = null;
		Text.field1109 = null;
		Text.field1142 = null;
		Text.field1090 = null;
		Text.field1106 = null;
		field1133 = null;
		TextGerman.field1127 = null;
		Text.field1120 = null;
		Text.field1093 = null;
		DataFile.field1126 = null;
		Text.field1111 = null;
		Text.field1102 = null;
		Text.field1118 = null;
		Text.field1094 = null;
	}

	@ObfuscatedName("gb.c(B)I")
	public static int method432() {
		return 5;
	}

	@ObfuscatedName("a.e(B)V")
	public static void method34() {
		MidiManager.field30 = null;
		TextGerman.field59 = null;
		Client.mapBuildGroundData = null;
		field23 = null;
		LocType.models = null;
		TextGerman.field48 = null;
		Text.field63 = null;
		Client.field11 = null;
		Text.field45 = null;
		field62 = null;
		Text.field37 = null;
		Text.field49 = null;
		ClientKeyboardListener.keyHeldBuffer = null;
	}

	@ObfuscatedName("ob.a(B)V")
	public static void method756() {
		SpotType.recentUse = null;
		TextGerman.field2164 = null;
		Text.field2159 = null;
		Client.field2160 = null;
		field2162 = null;
		Text.field2157 = null;
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

	@ObfuscatedName("ad.c(I)V")
	public static void method116() {
		field220 = null;
		field213 = null;
		Text.field218 = null;
		field221 = null;
		TextGerman.field215 = null;
		Text.field222 = null;
		field217 = null;
	}

	@ObfuscatedName("p.b()V")
	public static void method765() {
		field2196 = null;
	}

	@ObfuscatedName("sc.c()V")
	public static void method924() {
		Pix2D.pixels = null;
	}

}
