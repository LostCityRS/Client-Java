package jagex3.client;

import deob.*;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.datastruct.LinkList;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.Js5;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5Net;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.var.VarCache;
import jagex3.wordfilter2.Huffman;

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("a.eb")
	public static final int field57 = 50;
	@ObfuscatedName("cb.p")
	public static final int field495 = 5063219;
	@ObfuscatedName("sa.j")
	public static final int field2734 = 3353893;
	@ObfuscatedName("wa.t")
	public static final int field3226 = 7759444;
	@ObfuscatedName("la.D")
	public static final int field1684 = 50;
	@ObfuscatedName("s.n")
	public static final int field2715 = 2301979;
	@ObfuscatedName("td.c")
	public static final boolean field2934 = false;
	@ObfuscatedName("la.r")
	public static JagString[] field1672 = new JagString[field1684];
	@ObfuscatedName("la.p")
	public static int[] field1670 = new int[field1684];
	@ObfuscatedName("la.i")
	public static int[] field1663 = new int[field1684];
	@ObfuscatedName("la.e")
	public static int[] field1659 = new int[field1684];
	@ObfuscatedName("la.f")
	public static int[] field1660 = new int[field1684];
	@ObfuscatedName("la.a")
	public static int[] field1655 = new int[field1684];
	@ObfuscatedName("la.G")
	public static int[] field1687 = new int[field1684];
	@ObfuscatedName("la.J")
	public static int[] field1690 = new int[field1684];
	@ObfuscatedName("client.cb")
	public static JagString field583 = JagString.wrap("logo");

	@ObfuscatedName("client.eb")
	public static int field585 = 0;

	@ObfuscatedName("client.gb")
	public static int field587 = 1;

	@ObfuscatedName("client.jb")
	public static int field590 = -1;

	@ObfuscatedName("client.nb")
	public static int field594 = 0;

	@ObfuscatedName("client.sb")
	public static JagString[] playerOp = new JagString[5];

	@ObfuscatedName("client.W")
	public static int loginWaitingTime = 0;

	@ObfuscatedName("client.Cb")
	public static JagString field609 = JagString.wrap("backtop1");
	@ObfuscatedName("hd.Jb")
	public static int field1208 = 0;
	@ObfuscatedName("vd.Bd")
	public static World world;
	@ObfuscatedName("r.k")
	public static CollisionMap[] collision = new CollisionMap[4];
	@ObfuscatedName("rb.Fb")
	public static Pix32 field2626;
	@ObfuscatedName("wb.H")
	public static int field3274 = 10;
	@ObfuscatedName("uc.Q")
	public static JagString field3079 = Statics.field3067;
	@ObfuscatedName("id.s")
	public static Js5Loader anims;
	@ObfuscatedName("d.Bc")
	public static Js5Loader bases;
	@ObfuscatedName("pe.Qb")
	public static Js5Loader configs;
	@ObfuscatedName("w.d")
	public static Js5Loader interfaces;
	@ObfuscatedName("nb.qd")
	public static Js5Loader jagFX;
	@ObfuscatedName("vb.ub")
	public static Js5Loader maps;
	@ObfuscatedName("s.a")
	public static Js5Loader songs;
	@ObfuscatedName("md.Bb")
	public static Js5Loader models;
	@ObfuscatedName("h.xb")
	public static Js5Loader sprites;
	@ObfuscatedName("ld.F")
	public static Js5Loader textures;
	@ObfuscatedName("kb.b")
	public static Js5Loader binary;
	@ObfuscatedName("pc.s")
	public static Js5Loader jingles;
	@ObfuscatedName("sa.o")
	public static Js5Loader scripts;
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
	public static int ptype = 0;
	@ObfuscatedName("he.Kb")
	public static Pix32 field1239;
	@ObfuscatedName("ec.vb")
	public static Pix32 field784;
	@ObfuscatedName("ec.Lb")
	public static Pix8[] field800;
	@ObfuscatedName("ca.v")
	public static Pix32[] field470;
	@ObfuscatedName("he.Cb")
	public static Pix32[] field1231;
	@ObfuscatedName("id.q")
	public static Pix32[] field1376;
	@ObfuscatedName("ac.P")
	public static Pix32[] field178;
	@ObfuscatedName("md.xb")
	public static Pix32[] field1886;
	@ObfuscatedName("pb.g")
	public static Pix32 field2277;
	@ObfuscatedName("dc.gb")
	public static Pix32[] field680;
	@ObfuscatedName("n.t")
	public static Pix32[] cross;
	@ObfuscatedName("kc.n")
	public static Pix32[] field1578;
	@ObfuscatedName("bd.e")
	public static Pix8[] field365;
	@ObfuscatedName("rb.tb")
	public static Pix8[] field2614;
	@ObfuscatedName("dd.h")
	public static MouseTracking field708;
	@ObfuscatedName("cb.i")
	public static PacketBit in = new PacketBit(5000);
	@ObfuscatedName("ia.Ac")
	public static int field1341 = 0;
	@ObfuscatedName("bd.o")
	public static int[] field375 = new int[1000];
	@ObfuscatedName("dc.db")
	public static int[] field677 = new int[32768];
	@ObfuscatedName("u.wb")
	public static ClientNpc[] field2992 = new ClientNpc[32768];
	@ObfuscatedName("nd.d")
	public static int loopCycle = 0;
	@ObfuscatedName("ib.d")
	public static int[] field1348 = new int[2048];
	@ObfuscatedName("nb.md")
	public static int field2027 = 0;
	@ObfuscatedName("nb.pd")
	public static ClientPlayer[] field2030 = new ClientPlayer[2048];
	@ObfuscatedName("nb.Ec")
	public static BigInteger field1993 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("fe.Gc")
	public static BigInteger field964 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("qa.Cb")
	public static int field2399 = 0;
	@ObfuscatedName("nc.i")
	public static boolean cinemaCam = false;
	@ObfuscatedName("w.h")
	public static int field3204 = 128;
	@ObfuscatedName("jc.mb")
	public static int field1459 = 0;
	@ObfuscatedName("se.y")
	public static int field2797 = 0;
	@ObfuscatedName("sd.m")
	public static int field2766 = 0;
	@ObfuscatedName("d.cc")
	public static boolean[] field632 = new boolean[5];
	@ObfuscatedName("hd.vb")
	public static int field1194;
	@ObfuscatedName("aa.Fd")
	public static int minusedlevel;
	@ObfuscatedName("rb.Ab")
	public static ClientPlayer localPlayer;
	@ObfuscatedName("mb.X")
	public static int field1839;
	@ObfuscatedName("dd.i")
	public static int field709;
	@ObfuscatedName("ac.V")
	public static int field184;
	@ObfuscatedName("ld.B")
	public static int field1748;
	@ObfuscatedName("ie.l")
	public static int field1400;
	@ObfuscatedName("hd.Bb")
	public static int field1200;
	@ObfuscatedName("ca.w")
	public static int[] field471 = new int[5];
	@ObfuscatedName("se.j")
	public static int[] field2782 = new int[5];
	@ObfuscatedName("ga.D")
	public static int[] field1019 = new int[5];
	@ObfuscatedName("bb.k")
	public static int field321 = 0;
	@ObfuscatedName("gb.w")
	public static boolean field1069 = true;
	@ObfuscatedName("ra.k")
	public static int state = 0;
	@ObfuscatedName("vd.ud")
	public static int field3176 = 0;
	@ObfuscatedName("n.p")
	public static int mapLoadCount = 0;
	@ObfuscatedName("fe.qc")
	public static int mapLoadPrevCount = 1;
	@ObfuscatedName("wc.t")
	public static int mapLoadState = 0;
	@ObfuscatedName("pe.yb")
	public static int locModelLoadCount = 0;
	@ObfuscatedName("j.pc")
	public static int locModelLoadPrevCount = 1;
	@ObfuscatedName("fc.Sb")
	public static int loginGamePort;
	@ObfuscatedName("cd.q")
	public static int loginPort;
	@ObfuscatedName("ad.J")
	public static int loginJs5Port;
	@ObfuscatedName("l.h")
	public static ClientStream field1651;
	@ObfuscatedName("ca.r")
	public static int field466 = 0;
	@ObfuscatedName("wc.r")
	public static PrivilegedRequest field3299;
	@ObfuscatedName("ca.p")
	public static int field464 = 0;
	@ObfuscatedName("gb.m")
	public static int field1059 = 0;
	@ObfuscatedName("fc.zb")
	public static int loginFailCount = 0;
	@ObfuscatedName("dc.tb")
	public static int loginStep = 0;
	@ObfuscatedName("ld.f")
	public static PacketBit out = new PacketBit(5000);
	@ObfuscatedName("ua.e")
	public static PacketBit loginout = new PacketBit(5000);
	@ObfuscatedName("jc.db")
	public static ClientStream stream;
	@ObfuscatedName("m.j")
	public static int loginHopTimer = 0;
	@ObfuscatedName("g.A")
	public static int staffmodlevel = 0;
	@ObfuscatedName("hc.n")
	public static boolean mouseTracked = false;
	@ObfuscatedName("la.C")
	public static int selfSlot = -1;
	@ObfuscatedName("oe.u")
	public static int membersAccount = 0;
	@ObfuscatedName("qd.vd")
	public static int psize = 0;
	@ObfuscatedName("ra.p")
	public static int field2604;
	@ObfuscatedName("id.u")
	public static PrivilegedRequest loginSocketReq;
	@ObfuscatedName("n.m")
	public static boolean networkError = false;
	@ObfuscatedName("mb.bb")
	public static long field1843;
	@ObfuscatedName("vb.vb")
	public static long field3132 = 0L;
	@ObfuscatedName("g.i")
	public static int field986;
	@ObfuscatedName("pc.a")
	public static int field2306;
	@ObfuscatedName("client.Y")
	public static int field579;
	@ObfuscatedName("ad.F")
	public static int field219;
	@ObfuscatedName("h.Ob")
	public static int menuNumEntries = 0;
	@ObfuscatedName("r.B")
	public static JagString[] field2586 = new JagString[500];
	@ObfuscatedName("pc.C")
	public static JagString field2334 = JagString.wrap("@lre@");
	@ObfuscatedName("f.o")
	public static int field841 = 0;
	@ObfuscatedName("kb.s")
	public static int field1559 = 127;
	@ObfuscatedName("rc.k")
	public static boolean field2637 = false;
	@ObfuscatedName("ad.C")
	public static int field216 = 0;
	@ObfuscatedName("bb.l")
	public static int field322 = 127;
	@ObfuscatedName("cc.Lb")
	public static int field527 = 0;
	@ObfuscatedName("wc.p")
	public static int field3297 = 0;
	@ObfuscatedName("kb.n")
	public static int field1554 = 255;
	@ObfuscatedName("ub.k")
	public static int field3037 = -1;
	@ObfuscatedName("mc.o")
	public static int field1860 = 0;
	@ObfuscatedName("t.Bb")
	public static int field2813 = 0;
	@ObfuscatedName("ta.ub")
	public static int field2828 = 0;
	@ObfuscatedName("ae.m")
	public static int field236 = 0;
	@ObfuscatedName("mc.s")
	public static int field1864 = 0;
	@ObfuscatedName("cb.y")
	public static boolean field504 = false;
	@ObfuscatedName("d.kc")
	public static int field640;
	@ObfuscatedName("a.n")
	public static int field14 = 0;
	@ObfuscatedName("sd.i")
	public static int field2762 = 0;
	@ObfuscatedName("ae.a")
	public static boolean isMenuOpen = false;
	@ObfuscatedName("ld.D")
	public static int field1750 = 0;
	@ObfuscatedName("ec.Mb")
	public static int field801 = 0;
	@ObfuscatedName("ub.x")
	public static int field3050 = 0;
	@ObfuscatedName("je.Qb")
	public static boolean[] field1488 = new boolean[112];
	@ObfuscatedName("fe.Pc")
	public static int field973 = 0;
	@ObfuscatedName("ia.Bc")
	public static int field1342 = 0;
	@ObfuscatedName("uc.G")
	public static int field3069 = 0;
	@ObfuscatedName("ra.q")
	public static long field2605 = 0L;
	@ObfuscatedName("ia.Dc")
	public static long field1344 = 0L;
	@ObfuscatedName("g.u")
	public static int field998 = 0;
	@ObfuscatedName("i.q")
	public static boolean field1271 = false;
	@ObfuscatedName("mc.q")
	public static boolean field1862 = true;
	@ObfuscatedName("mc.j")
	public static int field1855 = 0;
	@ObfuscatedName("pb.y")
	public static int crossMode = 0;
	@ObfuscatedName("fc.xb")
	public static int crossCycle = 0;
	@ObfuscatedName("d.Ac")
	public static int field656 = 0;
	@ObfuscatedName("ha.k")
	public static int field1154 = 0;
	@ObfuscatedName("gb.i")
	public static boolean field1055 = false;
	@ObfuscatedName("fa.lb")
	public static int field857 = 0;
	@ObfuscatedName("ba.cc")
	public static int field298 = 0;
	@ObfuscatedName("vb.Gb")
	public static int field3143 = 0;
	@ObfuscatedName("ta.vb")
	public static int field2829 = 0;
	@ObfuscatedName("t.Db")
	public static boolean field2815 = false;
	@ObfuscatedName("ha.b")
	public static int field1145 = 0;
	@ObfuscatedName("qb.f")
	public static int field2410 = 0;
	@ObfuscatedName("se.d")
	public static int field2776 = 0;
	@ObfuscatedName("s.c")
	public static int field2704 = 0;
	@ObfuscatedName("kd.h")
	public static JagString field1605 = null;
	@ObfuscatedName("h.Bc")
	public static int field1143 = -1;
	@ObfuscatedName("wa.u")
	public static int field3227 = -1;
	@ObfuscatedName("l.e")
	public static int field1648 = -1;
	@ObfuscatedName("qa.Ab")
	public static int[] field2397 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	@ObfuscatedName("bb.t")
	public static int field330 = 3;
	@ObfuscatedName("ob.o")
	public static int field2166 = -1;
	@ObfuscatedName("qb.q")
	public static int field2421 = -1;
	@ObfuscatedName("wb.m")
	public static int field3253 = -1;
	@ObfuscatedName("id.B")
	public static int field1387 = -1;
	@ObfuscatedName("i.y")
	public static int field1279 = -1;
	@ObfuscatedName("rd.p")
	public static int field2673 = 0;
	@ObfuscatedName("aa.Cd")
	public static int field72 = 0;
	@ObfuscatedName("k.Q")
	public static int field1528 = 0;
	@ObfuscatedName("qb.e")
	public static int field2409 = 0;
	@ObfuscatedName("ac.W")
	public static int field185 = 2;
	@ObfuscatedName("ba.ac")
	public static int field296 = 0;
	@ObfuscatedName("oa.w")
	public static int field2148 = 2;
	@ObfuscatedName("bb.g")
	public static int field317 = 1;
	@ObfuscatedName("ob.g")
	public static int field2158 = 0;
	@ObfuscatedName("de.t")
	public static int field740 = 2;
	@ObfuscatedName("ra.a")
	public static int field2589 = 0;
	@ObfuscatedName("hc.g")
	public static int field1179 = 0;
	@ObfuscatedName("a.ib")
	public static byte[][] field61;
	@ObfuscatedName("pb.u")
	public static int[] field2291;
	@ObfuscatedName("de.v")
	public static int[] field742;
	@ObfuscatedName("rc.g")
	public static byte[][] field2633;
	@ObfuscatedName("oe.b")
	public static int[][] field2170;
	@ObfuscatedName("gb.F")
	public static int[] field1078;
	@ObfuscatedName("ie.t")
	public static int field1408;
	@ObfuscatedName("ec.Rb")
	public static int field806;
	@ObfuscatedName("se.a")
	public static boolean field2773 = false;
	@ObfuscatedName("ob.i")
	public static LinkList field2160 = new LinkList();
	@ObfuscatedName("pb.n")
	public static LinkList locChanges = new LinkList();
	@ObfuscatedName("f.c")
	public static int field829;
	@ObfuscatedName("td.h")
	public static int field2939 = 0;
	@ObfuscatedName("sd.e")
	public static int[] field2758 = new int[2048];
	@ObfuscatedName("sd.f")
	public static int[][] field2759 = new int[104][104];
	@ObfuscatedName("r.s")
	public static int[][] field2577 = new int[104][104];
	@ObfuscatedName("ib.g")
	public static int[] field1351 = new int[4000];
	@ObfuscatedName("cd.r")
	public static int[] field546 = new int[4000];
	@ObfuscatedName("la.L")
	public static ClientStream field1692;
	@ObfuscatedName("oe.t")
	public static int field2188 = -1;
	@ObfuscatedName("gb.z")
	public static int field1072 = -1;
	@ObfuscatedName("de.c")
	public static int worldid = 1;
	@ObfuscatedName("oe.g")
	public static int modewhat = 0;
	@ObfuscatedName("oe.n")
	public static int modewhere = 0;
	@ObfuscatedName("hc.k")
	public static boolean memServer = false;
	@ObfuscatedName("mb.W")
	public static int lang = 0;
	@ObfuscatedName("mb.cb")
	public static int field1844 = -1;
	@ObfuscatedName("qc.j")
	public static int field2434 = 0;
	@ObfuscatedName("r.n")
	public static int field2572 = 0;
	@ObfuscatedName("r.o")
	public static int field2573 = 0;
	@ObfuscatedName("ra.s")
	public static int field2607 = -1;
	@ObfuscatedName("rc.l")
	public static int field2638 = 0;
	@ObfuscatedName("rc.w")
	public static int field2649 = 0;
	@ObfuscatedName("rd.z")
	public static long[] field2683 = new long[100];
	@ObfuscatedName("s.k")
	public static int field2712 = -1;
	@ObfuscatedName("s.s")
	public static int field2720 = 0;
	@ObfuscatedName("sd.c")
	public static LinkList field2756 = new LinkList();
	@ObfuscatedName("tc.f")
	public static Packet field2917 = new Packet(new byte[5000]);
	@ObfuscatedName("tc.n")
	public static int[] field2925 = new int[500];
	@ObfuscatedName("tc.r")
	public static long[] field2929 = new long[200];
	@ObfuscatedName("td.p")
	public static int field2947 = 0;
	@ObfuscatedName("pc.y")
	public static int field2330 = 0;
	@ObfuscatedName("ob.l")
	public static int field2163 = 0;
	@ObfuscatedName("n.r")
	public static int field1924 = 0;
	@ObfuscatedName("ma.lb")
	public static int[] field1788 = new int[200];
	@ObfuscatedName("m.q")
	public static int[] field1770 = new int[500];
	@ObfuscatedName("ie.b")
	public static int field1390 = 0;
	@ObfuscatedName("ib.i")
	public static int[] field1353 = new int[]{0, 15, 6, 8, 0, 0, 1, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 1, 7, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, -1, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1, -1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 5, 2, 8, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 6, 4, 3, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2, 0, 4, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 14, 0, 6, 0, 0, 6, 1, 0, 2, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 4};
	@ObfuscatedName("hd.ub")
	public static BufferedRandomAccessFile[] field1193 = new BufferedRandomAccessFile[13];
	@ObfuscatedName("de.d")
	public static int[] field724 = new int[25];
	@ObfuscatedName("de.o")
	public static boolean[] playerOpPriority = new boolean[5];
	@ObfuscatedName("dd.a")
	public static int field701 = 0;
	@ObfuscatedName("ca.A")
	public static int field475 = 0;
	@ObfuscatedName("ae.c")
	public static int field226 = 0;
	@ObfuscatedName("ae.j")
	public static int chatDisabled = 0;
	@ObfuscatedName("rb.xb")
	public static long[] field2618 = new long[100];
	@ObfuscatedName("fd.Jb")
	public static int field941 = 0;
	@ObfuscatedName("ba.jc")
	public static int field305 = -1;
	@ObfuscatedName("fe.Hc")
	public static int field965 = 0;
	@ObfuscatedName("kc.w")
	public static int field1587 = 0;
	@ObfuscatedName("aa.ae")
	public static int field96 = 0;
	@ObfuscatedName("a.J")
	public static int field36 = 0;
	@ObfuscatedName("cb.s")
	public static int field498 = 0;
	@ObfuscatedName("hc.d")
	public static Packet[] field1176 = new Packet[2048];
	@ObfuscatedName("je.Ub")
	public static int field1492 = 0;
	@ObfuscatedName("wa.b")
	public static PixMap field3208;
	@ObfuscatedName("sd.q")
	public static Pix8 field2770;
	@ObfuscatedName("mb.db")
	public static Pix8 field1845;
	@ObfuscatedName("g.p")
	public static PixMap field993;
	@ObfuscatedName("kb.m")
	public static PixMap field1553;
	@ObfuscatedName("t.vb")
	public static Pix8[] field2807;
	@ObfuscatedName("de.s")
	public static Pix8 field739;
	@ObfuscatedName("i.a")
	public static Pix8 field1255;
	@ObfuscatedName("vb.xb")
	public static Pix8 field3134;
	@ObfuscatedName("k.M")
	public static Pix8 field1524;
	@ObfuscatedName("gb.B")
	public static Pix8 field1074;
	@ObfuscatedName("sa.u")
	public static Pix8 field2745;
	@ObfuscatedName("jc.kb")
	public static Pix8 field1457;
	@ObfuscatedName("rd.C")
	public static Pix8 field2686;
	@ObfuscatedName("mc.z")
	public static Pix8 field1871;
	@ObfuscatedName("kd.a")
	public static Pix8 field1598;
	@ObfuscatedName("sa.g")
	public static Pix8 field2731;
	@ObfuscatedName("ba.Jb")
	public static Pix8 field279;
	@ObfuscatedName("u.Cb")
	public static int field2998 = -1;
	@ObfuscatedName("pe.Eb")
	public static boolean field2364 = false;
	@ObfuscatedName("md.sb")
	public static int field1881 = -1;
	@ObfuscatedName("na.d")
	public static int[] field1932 = new int[500];
	@ObfuscatedName("g.q")
	public static int[] field994 = new int[500];
	@ObfuscatedName("na.m")
	public static boolean field1941 = false;
	@ObfuscatedName("te.cb")
	public static JagString[] field2951 = new JagString[200];
	@ObfuscatedName("ua.z")
	public static boolean field3024 = false;
	@ObfuscatedName("r.D")
	public static int[] field2588;
	@ObfuscatedName("kb.t")
	public static int[] field1560;
	@ObfuscatedName("kb.p")
	public static int[] field1556;
	@ObfuscatedName("mb.ab")
	public static int[] field1842;
	@ObfuscatedName("hb.eb")
	public static boolean field1159 = false;
	@ObfuscatedName("r.C")
	public static PixMap field2587;
	@ObfuscatedName("cc.Gb")
	public static PixMap field522;
	@ObfuscatedName("nc.k")
	public static PixMap field2045;
	@ObfuscatedName("j.mc")
	public static PixMap field1438;
	@ObfuscatedName("tb.Wb")
	public static PixMap field2899;
	@ObfuscatedName("ma.db")
	public static PixMap field1780;
	@ObfuscatedName("ua.w")
	public static PixMap field3021;
	@ObfuscatedName("la.I")
	public static PixMap field1689;
	@ObfuscatedName("f.q")
	public static PixMap field843;
	@ObfuscatedName("fd.tb")
	public static PixMap field925;
	@ObfuscatedName("id.g")
	public static Pix8 field1366;
	@ObfuscatedName("hb.mb")
	public static PixMap field1167;
	@ObfuscatedName("a.k")
	public static PixMap field11;
	@ObfuscatedName("oe.s")
	public static Pix8 field2187;
	@ObfuscatedName("kb.r")
	public static PixMap field1558;
	@ObfuscatedName("bb.j")
	public static int[] field320;
	@ObfuscatedName("h.Gb")
	public static int[] field1096;
	@ObfuscatedName("ib.c")
	public static int[] field1347;
	@ObfuscatedName("ta.zc")
	public static int field2885;
	@ObfuscatedName("t.zb")
	public static int field2811 = 0;
	@ObfuscatedName("cd.t")
	public static IfType field548 = null;
	@ObfuscatedName("qa.vb")
	public static int field2392 = 0;
	@ObfuscatedName("be.hb")
	public static int field419 = 0;
	@ObfuscatedName("jc.yb")
	public static int field1471;
	@ObfuscatedName("fc.wb")
	public static int field893;
	@ObfuscatedName("hc.o")
	public static int field1187;
	@ObfuscatedName("ld.z")
	public static int field1746;
	@ObfuscatedName("bb.f")
	public static int field316;
	@ObfuscatedName("ae.p")
	public static int field239;
	@ObfuscatedName("tc.g")
	public static int field2918;
	@ObfuscatedName("te.nb")
	public static int field2962 = 0;
	@ObfuscatedName("cd.x")
	public static LinkList[][][] groundObj = new LinkList[4][104][104];
	@ObfuscatedName("se.B")
	public static int field2800 = -1;
	@ObfuscatedName("nb.td")
	public static JagString[] field2034 = new JagString[100];
	@ObfuscatedName("g.x")
	public static boolean field1001 = false;
	@ObfuscatedName("jc.xb")
	public static int field1470 = 0;
	@ObfuscatedName("pb.F")
	public static PlayerModel idkDesign = new PlayerModel();
	@ObfuscatedName("g.D")
	public static boolean showFps = false;
	@ObfuscatedName("te.sb")
	public static int field2967 = 0;
	@ObfuscatedName("cc.Hb")
	public static int field523 = 0;
	@ObfuscatedName("dd.d")
	public static IfType field704;
	@ObfuscatedName("ub.z")
	public static int field3052 = 78;
	@ObfuscatedName("ia.zc")
	public static int field1340 = 0;
	@ObfuscatedName("dc.nb")
	public static boolean field687 = false;
	@ObfuscatedName("aa.Wd")
	public static int[] field92;

	@ObfuscatedName("dc.c(I)V")
	public static void mainLoad() {
		if (field1208 == 0) {
			world = new World(4, 104, 104, ClientBuild.groundh);
			for (int var0 = 0; var0 < 4; var0++) {
				collision[var0] = new CollisionMap(104, 104);
			}
			field2626 = new Pix32(512, 512);
			field3274 = 5;
			field1208 = 20;
			field3079 = Text.field2480;
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
			field3079 = Text.field1557;
			field1208 = 30;
		} else if (field1208 == 30) {
			anims = method894(0, true, false, true);
			bases = method894(1, true, false, true);
			configs = method894(2, true, true, false);
			interfaces = method894(3, true, false, true);
			jagFX = method894(4, true, false, true);
			maps = method894(5, true, true, true);
			songs = method894(6, false, true, true);
			models = method894(7, true, false, true);
			sprites = method894(8, true, false, true);
			textures = method894(9, true, false, true);
			binary = method894(10, true, false, true);
			jingles = method894(11, true, false, true);
			scripts = method894(12, true, false, true);
			field1208 = 40;
			field3079 = Text.field1362;
			field3274 = 20;
		} else if (field1208 == 40) {
			int var6 = anims.method977() * 5 / 100;
			int var7 = var6 + bases.method977() * 5 / 100;
			int var8 = var7 + configs.method977() * 5 / 100;
			int var9 = var8 + interfaces.method977() * 5 / 100;
			int var10 = var9 + jagFX.method977() * 5 / 100;
			int var11 = var10 + maps.method977() * 5 / 100;
			int var12 = var11 + songs.method977() * 5 / 100;
			int var13 = var12 + models.method977() * 40 / 100;
			int var14 = var13 + sprites.method977() * 5 / 100;
			int var15 = var14 + textures.method977() * 5 / 100;
			int var16 = var15 + binary.method977() * 5 / 100;
			int var17 = var16 + jingles.method977() * 5 / 100;
			int var18 = var17 + scripts.method977() * 5 / 100;
			if (var18 == 100) {
				field1208 = 45;
				field3079 = Text.field1782;
				field3274 = 30;
			} else {
				if (var18 != 0) {
					field3079 = JagString.join(new JagString[]{Text.field1106, Statics.method502(var18), Statics.field2181});
				}
				field3274 = 30;
			}
		} else if (field1208 == 45) {
			PcmPlayer.init(GameShell.signlink, !lowMem);
			soundMixer = Statics.method993(GameShell.signlink, GameShell.canvas);
			soundDecimator = new Decimator(22050, PcmPlayer.frequency);
			field1208 = 50;
			field3079 = Text.field2325;
			field3274 = 35;
		} else if (field1208 == 50) {
			int var19 = 0;
			if (p11 == null) {
				p11 = PixLoader.method528(sprites, Statics.field3234, Statics.field1453);
			} else {
				var19++;
			}
			if (p12 == null) {
				p12 = PixLoader.method528(sprites, Statics.field3234, Statics.field3247);
			} else {
				var19++;
			}
			if (b12 == null) {
				b12 = PixLoader.method528(sprites, Statics.field3234, Statics.field1526);
			} else {
				var19++;
			}
			if (var19 < 3) {
				field3079 = JagString.join(new JagString[]{Text.field2319, Statics.method502(var19 * 100 / 3), Statics.field2181});
				field3274 = 40;
			} else {
				field1208 = 60;
				field3274 = 40;
				field3079 = Text.field1102;
			}
		} else if (field1208 == 60) {
			int var20 = Statics.method966(binary, sprites);
			int var21 = Statics.method432();
			if (var20 < var21) {
				field3079 = JagString.join(new JagString[]{Text.field2407, Statics.method502(var20 * 100 / var21), Statics.field2181});
				field3274 = 50;
			} else {
				field3079 = Text.field3305;
				field3274 = 50;
				setMainState(5);
				field1208 = 70;
			}
		} else if (field1208 == 70) {
			if (configs.method230()) {
				FloType.init(configs);
				FluType.init(configs);
				IdkType.init(configs, models);
				LocType.init(models, lowMem, configs);
				NpcType.init(models, configs);
				ObjType.init(configs, memServer, models);
				SeqType.init(bases, configs, anims);
				SpotType.init(models, configs);
				VarBitType.init(configs);
				VarpType.init(configs);
				IfType.init(interfaces, sprites, models);
				field1208 = 80;
				field3274 = 60;
				field3079 = Text.field2138;
			} else {
				field3079 = JagString.join(new JagString[]{Text.field1762, Statics.method502(configs.method982()), Statics.field2181});
				field3274 = 60;
			}
		} else if (field1208 == 80) {
			int var22 = 0;
			if (field1239 == null) {
				field1239 = PixLoader.method1038(sprites, Statics.field2700, Statics.field3234);
			} else {
				var22++;
			}
			if (field784 == null) {
				field784 = PixLoader.method1038(sprites, Statics.field3007, Statics.field3234);
			} else {
				var22++;
			}
			if (field800 == null) {
				field800 = PixLoader.method372(sprites, Statics.field1646, Statics.field3234);
			} else {
				var22++;
			}
			if (field470 == null) {
				field470 = PixLoader.method245(sprites, Statics.field1440, Statics.field3234);
			} else {
				var22++;
			}
			if (field1231 == null) {
				field1231 = PixLoader.method245(sprites, Statics.field1466, Statics.field3234);
			} else {
				var22++;
			}
			if (field1376 == null) {
				field1376 = PixLoader.method245(sprites, Statics.field2965, Statics.field3234);
			} else {
				var22++;
			}
			if (field178 == null) {
				field178 = PixLoader.method245(sprites, Statics.field1034, Statics.field3234);
			} else {
				var22++;
			}
			if (field1886 == null) {
				field1886 = PixLoader.method245(sprites, Statics.field2646, Statics.field3234);
			} else {
				var22++;
			}
			if (field2277 == null) {
				field2277 = PixLoader.method1038(sprites, Statics.field1461, Statics.field3234);
			} else {
				var22++;
			}
			if (field680 == null) {
				field680 = PixLoader.method245(sprites, Statics.field325, Statics.field3234);
			} else {
				var22++;
			}
			if (cross == null) {
				cross = PixLoader.method245(sprites, Statics.field3118, Statics.field3234);
			} else {
				var22++;
			}
			if (field1578 == null) {
				field1578 = PixLoader.method245(sprites, Statics.field234, Statics.field3234);
			} else {
				var22++;
			}
			if (field365 == null) {
				field365 = PixLoader.method372(sprites, Statics.field23, Statics.field3234);
			} else {
				var22++;
			}
			if (field2614 == null) {
				field2614 = PixLoader.method372(sprites, Statics.field1929, Statics.field3234);
			} else {
				var22++;
			}
			if (var22 < 14) {
				field3079 = JagString.join(new JagString[]{Text.field833, Statics.method502(var22 * 100 / 14), Statics.field2181});
				field3274 = 70;
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
				field3079 = Text.field1527;
				field3274 = 70;
				field1208 = 85;
			}
		} else if (field1208 == 85) {
			int var28 = Statics.method892(sprites);
			int var29 = Statics.method456();
			if (var28 < var29) {
				field3079 = JagString.join(new JagString[]{Text.field1597, Statics.method502(var28 * 100 / var29), Statics.field2181});
				field3274 = 80;
			} else {
				field3079 = Text.field1431;
				field1208 = 90;
				field3274 = 80;
			}
		} else if (field1208 == 90) {
			if (textures.method230()) {
				TextureManager var30 = new TextureManager(textures, sprites, 20, 0.8D, lowMem ? 64 : 128);
				Pix3D.method357(var30);
				Pix3D.method365(0.8D);
				field1208 = 110;
				field3274 = 90;
				field3079 = Text.field1998;
			} else {
				field3079 = JagString.join(new JagString[]{Text.field793, Statics.method502(textures.method982()), Statics.field2181});
				field3274 = 90;
			}
		} else if (field1208 == 110) {
			field708 = new MouseTracking();
			GameShell.signlink.method656(10, field708);
			field3079 = Text.field796;
			field1208 = 120;
			field3274 = 94;
		} else if (field1208 == 120) {
			if (binary.method239(Statics.field1388, Statics.field3234)) {
				Huffman var31 = new Huffman(binary.method215(Statics.field3234, Statics.field1388));
				Statics.setHuffman(var31);
				field1208 = 130;
				field3079 = Text.field2575;
				field3274 = 96;
			} else {
				field3079 = JagString.join(new JagString[]{Text.field671, Statics.field2772});
				field3274 = 96;
			}
		} else if (field1208 == 130) {
			if (!interfaces.method230()) {
				field3079 = JagString.join(new JagString[]{Text.field1789, Statics.method502(interfaces.method982() * 4 / 5), Statics.field2181});
				field3274 = 100;
			} else if (scripts.method230()) {
				field3079 = Text.field1031;
				field1208 = 140;
				field3274 = 100;
			} else {
				field3079 = JagString.join(new JagString[]{Text.field1789, Statics.method502(scripts.method982() / 5 + 80), Statics.field2181});
				field3274 = 100;
			}
		} else if (field1208 == 140) {
			setMainState(10);
		}
	}

	@ObfuscatedName("d.b(Z)V")
	public static void method293() {
		in.method417();
		int var0 = in.method412(8);
		if (var0 < field1341) {
			for (int var1 = var0; var1 < field1341; var1++) {
				field375[field841++] = field677[var1];
			}
		}
		if (var0 > field1341) {
			throw new RuntimeException("gnpov1");
		}
		field1341 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = field677[var2];
			ClientNpc var4 = field2992[var3];
			int var5 = in.method412(1);
			if (var5 == 0) {
				field677[field1341++] = var3;
				var4.field2008 = loopCycle;
			} else {
				int var6 = in.method412(2);
				if (var6 == 0) {
					field677[field1341++] = var3;
					var4.field2008 = loopCycle;
					field1348[field2027++] = var3;
				} else if (var6 == 1) {
					field677[field1341++] = var3;
					var4.field2008 = loopCycle;
					int var7 = in.method412(3);
					var4.method725(var7, false);
					int var8 = in.method412(1);
					if (var8 == 1) {
						field1348[field2027++] = var3;
					}
				} else if (var6 == 2) {
					field677[field1341++] = var3;
					var4.field2008 = loopCycle;
					int var9 = in.method412(3);
					var4.method725(var9, true);
					int var10 = in.method412(3);
					var4.method725(var10, true);
					int var11 = in.method412(1);
					if (var11 == 1) {
						field1348[field2027++] = var3;
					}
				} else if (var6 == 3) {
					field375[field841++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("kc.a(B)V")
	public static void gameDrawMain() {
		field2399++;
		addPlayers(true);
		addNpcs(true);
		addPlayers(false);
		addNpcs(false);
		addProjectiles();
		addMapAnim();
		if (!cinemaCam) {
			int var0 = field3204;
			if (field1459 / 256 > var0) {
				var0 = field1459 / 256;
			}
			int var1 = field2797 + field2766 & 0x7FF;
			if (field632[4] && field1599[4] + 128 > var0) {
				var0 = field1599[4] + 128;
			}
			method848(var0, field1194, method712(minusedlevel, localPlayer.field1972, localPlayer.field1963) - 50, var1, field1839, var0 * 3 + 600);
		}
		int var2;
		if (cinemaCam) {
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
			if (field632[var8]) {
				int var9 = (int) ((double) (field471[var8] * 2 + 1) * Math.random() + Math.sin((double) field2782[var8] / 100.0D * (double) field1019[var8]) * (double) field1599[var8] - (double) field471[var8]);
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
		Statics.method1028();
		Model.field2239 = ClientMouseListener.field2568 - 4;
		Model.field2248 = true;
		Model.field2270 = ClientMouseListener.field741 - 4;
		Model.field2261 = 0;
		Pix2D.method920();
		world.renderAll(field709, field1748, field1200, field1400, field184, var2);
		world.removeSprites();
		method671();
		method578();
		((TextureManager) Pix3D.field771).method697(field321);
		otherOverlays();
		if (field1069 && Js5Net.method614() == 0) {
			field1069 = false;
		}
		if (field1069) {
			Statics.method1028();
			Pix2D.method920();
			messageBox(Text.field3252, false, null);
		}
		Statics.method44();
		field709 = var3;
		field1200 = var7;
		field184 = var4;
		field1400 = var6;
		field1748 = var5;
	}

	@ObfuscatedName("re.a(IZZBZ)Lu;")
	public static Js5Loader method894(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (Statics.field797 != null) {
			var4 = new DataFile(arg0, Statics.field797, field1193[arg0], 1000000);
		}
		return new Js5Loader(var4, Statics.field931, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("i.a(B)V")
	public static void addProjectiles() {
		for (ClientProj var0 = (ClientProj) field2160.head(); var0 != null; var0 = (ClientProj) field2160.next()) {
			if (minusedlevel != var0.field638 || loopCycle > var0.field628) {
				var0.unlink();
			} else if (var0.field631 <= loopCycle) {
				if (var0.field618 > 0) {
					ClientNpc var1 = field2992[var0.field618 - 1];
					if (var1 != null && var1.field1972 >= 0 && var1.field1972 < 13312 && var1.field1963 >= 0 && var1.field1963 < 13312) {
						var0.method300(loopCycle, var1.field1963, method712(var0.field638, var1.field1972, var1.field1963) - var0.field617, var1.field1972);
					}
				}
				if (var0.field618 < 0) {
					int var2 = -var0.field618 - 1;
					ClientPlayer var3;
					if (selfSlot == var2) {
						var3 = localPlayer;
					} else {
						var3 = field2030[var2];
					}
					if (var3 != null && var3.field1972 >= 0 && var3.field1972 < 13312 && var3.field1963 >= 0 && var3.field1963 < 13312) {
						var0.method300(loopCycle, var3.field1963, method712(var0.field638, var3.field1972, var3.field1963) - var0.field617, var3.field1972);
					}
				}
				var0.method299(field321);
				world.method90(minusedlevel, (int) var0.field637, (int) var0.field650, (int) var0.field649, 60, var0, var0.field670, -1, false);
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
		for (int var0 = -1; var0 < field2939; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field2758[var0];
			}
			ClientPlayer var2 = field2030[var1];
			if (var2 != null && var2.field1952 > 0) {
				var2.field1952--;
				if (var2.field1952 == 0) {
					var2.field1964 = null;
				}
			}
		}
		for (int var3 = 0; var3 < field1341; var3++) {
			int var4 = field677[var3];
			ClientNpc var5 = field2992[var4];
			if (var5 != null && var5.field1952 > 0) {
				var5.field1952--;
				if (var5.field1952 == 0) {
					var5.field1964 = null;
				}
			}
		}
	}

	@ObfuscatedName("ua.a(Z)V")
	public static void addMapAnim() {
		for (MapSpotAnim var0 = (MapSpotAnim) field2756.head(); var0 != null; var0 = (MapSpotAnim) field2756.next()) {
			if (minusedlevel != var0.field2895 || var0.field2893) {
				var0.unlink();
			} else if (loopCycle >= var0.field2886) {
				var0.method958(field321);
				if (var0.field2893) {
					var0.unlink();
				} else {
					world.method90(var0.field2895, var0.field2900, var0.field2891, var0.field2887, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("kc.b(B)V")
	public static void method600() {
		field2027 = 0;
		field841 = 0;
		method728();
		method633();
		method688();
		method837();
		for (int var0 = 0; var0 < field841; var0++) {
			int var1 = field375[var0];
			if (loopCycle != field2030[var1].field2008) {
				field2030[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < field2939; var2++) {
			if (field2030[field2758[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + field2939);
			}
		}
	}

	@ObfuscatedName("fa.c(I)V")
	public static void method391() {
		if (menuNumEntries < 2 && field475 == 0 && field594 == 0) {
			return;
		}
		JagString var0;
		if (field475 == 1 && menuNumEntries < 2) {
			var0 = JagString.join(new JagString[]{Text.field584, Text.field2337, Statics.field3177, Statics.field1942});
		} else if (field594 == 1 && menuNumEntries < 2) {
			var0 = JagString.join(new JagString[]{Statics.field1523, Text.field2337, Statics.field1384, Statics.field1942});
		} else {
			var0 = field2586[menuNumEntries - 1];
		}
		if (menuNumEntries > 2) {
			var0 = JagString.join(new JagString[]{var0, Statics.field2659, Statics.method502(menuNumEntries - 2), Text.field2041});
		}
		b12.method207(var0, 4, 16777215, loopCycle / 1000);
	}

	@ObfuscatedName("hc.b(II)V")
	public static void method476(int arg0) {
		Statics.field1237 = loopCycle;
		BgSound.method1040();
		int var1 = VarpType.method1023(arg0).field2404;
		if (var1 == 0) {
			return;
		}
		int var2 = VarCache.field2803[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				Pix3D.method365(0.9D);
				((TextureManager) Pix3D.field771).method696(0.9D);
			}
			if (var2 == 2) {
				Pix3D.method365(0.8D);
				((TextureManager) Pix3D.field771).method696(0.8D);
			}
			if (var2 == 3) {
				Pix3D.method365(0.7D);
				((TextureManager) Pix3D.field771).method696(0.7D);
			}
			if (var2 == 4) {
				Pix3D.method365(0.6D);
				((TextureManager) Pix3D.field771).method696(0.6D);
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
			if (field1554 != var3) {
				if (field1554 == 0 && field3037 != -1) {
					Statics.method681(0, field3037, var3, songs);
					field1860 = 0;
				} else if (var3 == 0) {
					Statics.method669();
					field1860 = 0;
				} else {
					Statics.method738(var3);
				}
				field1554 = var3;
			}
		}
		if (var1 == 9) {
			field2163 = var2;
		}
		if (var1 == 10) {
			if (var2 == 0) {
				field1559 = 127;
			}
			if (var2 == 1) {
				field1559 = 96;
			}
			if (var2 == 2) {
				field1559 = 64;
			}
			if (var2 == 3) {
				field1559 = 32;
			}
			if (var2 == 4) {
				field1559 = 0;
			}
		}
		if (var1 == 8) {
			field2637 = true;
			field216 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				field322 = 127;
			}
			if (var2 == 1) {
				field322 = 96;
			}
			if (var2 == 2) {
				field322 = 64;
			}
			if (var2 == 3) {
				field322 = 32;
			}
			if (var2 == 4) {
				field322 = 0;
			}
		}
		if (var1 == 6) {
			field527 = var2;
		}
		if (var1 == 5) {
			field3297 = var2;
		}
	}

	@ObfuscatedName("rd.a(B)V")
	public static void zonePacket() {
		if (ptype == 49) {
			int var0 = in.method152();
			int var1 = (var0 & 0x7) + field893;
			int var2 = (var0 >> 4 & 0x7) + field1471;
			int var3 = in.method152();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = Statics.field3186[var4];
			int var7 = in.method180();
			if (var2 >= 0 && var1 >= 0 && var2 < 103 && var1 < 103) {
				int var8 = ClientBuild.groundh[minusedlevel][var2][var1];
				int var9 = ClientBuild.groundh[minusedlevel][var2 + 1][var1];
				int var10 = ClientBuild.groundh[minusedlevel][var2 + 1][var1 + 1];
				int var11 = ClientBuild.groundh[minusedlevel][var2][var1 + 1];
				if (var6 == 0) {
					Wall var12 = world.method82(minusedlevel, var2, var1);
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
					Decor var14 = world.method56(minusedlevel, var2, var1);
					if (var14 != null) {
						var14.field2665 = new ClientLocAnim(var14.field2678 >> 14 & 0x7FFF, 4, 0, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 2) {
					Sprite var15 = world.method63(minusedlevel, var2, var1);
					if (var4 == 11) {
						var4 = 10;
					}
					if (var15 != null) {
						var15.field985 = new ClientLocAnim(var15.field980 >> 14 & 0x7FFF, var4, var5, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 3) {
					GroundDecor var16 = world.method89(minusedlevel, var2, var1);
					if (var16 != null) {
						var16.field1373 = new ClientLocAnim(var16.field1361 >> 14 & 0x7FFF, 22, var5, var8, var9, var10, var11, var7, false);
					}
				}
			}
		} else if (ptype == 241) {
			int var17 = in.method147();
			int var18 = var17 & 0x3;
			int var19 = var17 >> 2;
			int var20 = Statics.field3186[var19];
			int var21 = in.g2();
			int var22 = in.method152();
			int var23 = (var22 & 0x7) + field893;
			int var24 = (var22 >> 4 & 0x7) + field1471;
			if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
				method514(var21, var24, var18, -1, minusedlevel, var23, var20, var19, 0);
			}
		} else {
			if (ptype == 9) {
				int var25 = in.g1();
				int var26 = (var25 & 0x7) + field893;
				int var27 = (var25 >> 4 & 0x7) + field1471;
				int var28 = in.g2();
				int var29 = in.g1();
				int var30 = var29 >> 4 & 0xF;
				int var31 = var29 & 0x7;
				int var32 = in.g1();
				if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
					int var33 = var30 + 1;
					if (var27 - var33 <= localPlayer.field1962[0] && var27 + var33 >= localPlayer.field1962[0] && var26 - var33 <= localPlayer.field2009[0] && var26 + var33 >= localPlayer.field2009[0] && field1559 != 0 && var31 > 0 && field965 < 50) {
						Statics.field2369[field965] = var28;
						Statics.field2845[field965] = var31;
						Statics.field684[field965] = var32;
						Statics.field955[field965] = null;
						Statics.field1521[field965] = (var26 << 8) + (var27 << 16) + var30;
						field965++;
					}
				}
			}
			if (ptype == 202) {
				int var34 = in.g1();
				int var35 = (var34 >> 4 & 0x7) + field1471;
				int var36 = field893 + (var34 & 0x7);
				int var37 = in.g2();
				int var38 = in.g1();
				int var39 = in.g2();
				if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
					int var40 = var36 * 128 + 64;
					int var41 = var35 * 128 + 64;
					MapSpotAnim var42 = new MapSpotAnim(var37, minusedlevel, var41, var40, method712(minusedlevel, var41, var40) - var38, var39, loopCycle);
					field2756.push(var42);
				}
			} else if (ptype == 99) {
				int var43 = in.g1();
				int var44 = (var43 >> 4 & 0x7) + field1471;
				int var45 = (var43 & 0x7) + field893;
				int var46 = in.g2();
				int var47 = in.g2();
				int var48 = in.g2();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
					LinkList var49 = groundObj[minusedlevel][var44][var45];
					if (var49 != null) {
						for (ClientObj var50 = (ClientObj) var49.head(); var50 != null; var50 = (ClientObj) var49.next()) {
							if ((var46 & 0x7FFF) == var50.id && var50.count == var47) {
								var50.count = var48;
								break;
							}
						}
						showObject(var45, var44);
					}
				}
			} else if (ptype == 143) {
				int var51 = in.method152();
				int var52 = field893 + (var51 & 0x7);
				int var53 = field1471 + (var51 >> 4 & 0x7);
				int var54 = in.method147();
				int var55 = var54 & 0x3;
				int var56 = var54 >> 2;
				int var57 = Statics.field3186[var56];
				if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
					method514(-1, var53, var55, -1, minusedlevel, var52, var57, var56, 0);
				}
			} else {
				if (ptype == 229) {
					byte var58 = in.method171();
					int var59 = in.method137();
					byte var60 = in.g1b();
					byte var61 = in.g1b();
					int var62 = in.method152();
					int var63 = var62 & 0x3;
					int var64 = var62 >> 2;
					int var65 = Statics.field3186[var64];
					int var66 = in.method156();
					int var67 = (var66 & 0x7) + field893;
					int var68 = field1471 + (var66 >> 4 & 0x7);
					int var69 = in.g2();
					byte var70 = in.method143();
					int var71 = in.method166();
					int var72 = in.method180();
					ClientPlayer var73;
					if (selfSlot == var59) {
						var73 = localPlayer;
					} else {
						var73 = field2030[var59];
					}
					if (var73 != null) {
						LocType var74 = LocType.list(var71);
						int var75 = ClientBuild.groundh[minusedlevel][var68][var67];
						int var76 = ClientBuild.groundh[minusedlevel][var68][var67 + 1];
						int var77 = ClientBuild.groundh[minusedlevel][var68 + 1][var67 + 1];
						int var78 = ClientBuild.groundh[minusedlevel][var68 + 1][var67];
						Model var79 = var74.getModel(var77, var76, var63, var75, var64, var78);
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
							method514(-1, var68, 0, var72 + 1, minusedlevel, var67, var65, 0, var69 + 1);
							var73.field82 = loopCycle + var72;
							int var82 = var74.field1286;
							var73.field73 = var79;
							var73.field91 = loopCycle + var69;
							int var83 = var74.field1298;
							if (var63 == 1 || var63 == 3) {
								var83 = var74.field1286;
								var82 = var74.field1298;
							}
							var73.field79 = var68 * 128 + var82 * 64;
							var73.field99 = var67 * 128 + var83 * 64;
							var73.field80 = method712(minusedlevel, var73.field79, var73.field99);
							var73.field89 = var61 + var67;
							var73.field66 = var68 + var70;
							var73.field70 = var68 + var58;
							var73.field97 = var60 + var67;
						}
					}
				}
				if (ptype == 74) {
					int var84 = in.g1();
					int var85 = (var84 >> 4 & 0x7) + field1471;
					int var86 = (var84 & 0x7) + field893;
					int var87 = in.method137();
					if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
						LinkList var88 = groundObj[minusedlevel][var85][var86];
						if (var88 != null) {
							for (ClientObj var89 = (ClientObj) var88.head(); var89 != null; var89 = (ClientObj) var88.next()) {
								if ((var87 & 0x7FFF) == var89.id) {
									var89.unlink();
									break;
								}
							}
							if (var88.head() == null) {
								groundObj[minusedlevel][var85][var86] = null;
							}
							showObject(var86, var85);
						}
					}
				} else if (ptype == 1) {
					int var90 = in.g1();
					int var91 = (var90 & 0x7) + field893;
					int var92 = field1471 + (var90 >> 4 & 0x7);
					int var93 = var92 + in.g1b();
					int var94 = var91 + in.g1b();
					int var95 = in.method139();
					int var96 = in.g2();
					int var97 = in.g1() * 4;
					int var98 = in.g1() * 4;
					int var99 = in.g2();
					int var100 = in.g2();
					int var101 = in.g1();
					int var102 = in.g1();
					if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104 && var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var96 != 65535) {
						int var103 = var93 * 128 + 64;
						int var104 = var92 * 128 + 64;
						int var105 = var91 * 128 + 64;
						ClientProj var106 = new ClientProj(var96, minusedlevel, var104, var105, method712(minusedlevel, var104, var105) - var97, var99 - -loopCycle, var100 + loopCycle, var101, var102, var95, var98);
						int var107 = var94 * 128 + 64;
						var106.method300(loopCycle + var99, var107, method712(minusedlevel, var103, var107) - var98, var103);
						field2160.push(var106);
					}
				} else if (ptype == 19) {
					int var108 = in.method180();
					int var109 = in.method180();
					int var110 = in.g2();
					int var111 = in.method152();
					int var112 = (var111 >> 4 & 0x7) + field1471;
					int var113 = (var111 & 0x7) + field893;
					if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && selfSlot != var109) {
						ClientObj var114 = new ClientObj();
						var114.id = var110;
						var114.count = var108;
						if (groundObj[minusedlevel][var112][var113] == null) {
							groundObj[minusedlevel][var112][var113] = new LinkList();
						}
						groundObj[minusedlevel][var112][var113].push(var114);
						showObject(var113, var112);
					}
				} else if (ptype == 175) {
					int var115 = in.method166();
					int var116 = in.g2();
					int var117 = in.g1();
					int var118 = (var117 & 0x7) + field893;
					int var119 = (var117 >> 4 & 0x7) + field1471;
					if (var119 >= 0 && var118 >= 0 && var119 < 104 && var118 < 104) {
						ClientObj var120 = new ClientObj();
						var120.count = var116;
						var120.id = var115;
						if (groundObj[minusedlevel][var119][var118] == null) {
							groundObj[minusedlevel][var119][var118] = new LinkList();
						}
						groundObj[minusedlevel][var119][var118].push(var120);
						showObject(var118, var119);
					}
				}
			}
		}
	}

	@ObfuscatedName("ca.a(I)V")
	public static void method252() {
		for (int var0 = 0; var0 < field1341; var0++) {
			int var1 = field677[var0];
			ClientNpc var2 = field2992[var1];
			if (var2 != null) {
				method319(var2, var2.field3182.field1084);
			}
		}
	}

	@ObfuscatedName("nc.a(Ldc;I)V")
	public static void locChangeSetOld(LocChange arg0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		if (arg0.field688 == 0) {
			var1 = world.wallType(arg0.field679, arg0.field700, arg0.field699);
		}
		int var4 = 0;
		if (arg0.field688 == 1) {
			var1 = world.method47(arg0.field679, arg0.field700, arg0.field699);
		}
		if (arg0.field688 == 2) {
			var1 = world.method66(arg0.field679, arg0.field700, arg0.field699);
		}
		if (arg0.field688 == 3) {
			var1 = world.method49(arg0.field679, arg0.field700, arg0.field699);
		}
		if (var1 != 0) {
			int var5 = world.method97(arg0.field679, arg0.field700, arg0.field699, var1);
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
		field841 = 0;
		field2027 = 0;
		method293();
		method752();
		method323();
		for (int var0 = 0; var0 < field841; var0++) {
			int var1 = field375[var0];
			if (loopCycle != field2992[var1].field2008) {
				field2992[var1].field3182 = null;
				field2992[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < field1341; var2++) {
			if (field2992[field677[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + field1341);
			}
		}
	}

	@ObfuscatedName("ld.a(I)V")
	public static void method660() {
		JagString var0 = null;
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			if (field2586[var1].method11(field2334) != -1) {
				var0 = field2586[var1].method1(field2586[var1].method11(field2334));
				break;
			}
		}
		if (var0 == null) {
			drawMinimenu();
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
		Pix2D.fillRect(var3, var5, var2, var4, 6116423);
		Pix2D.fillRect(var3 + 1, var5 - -1, var2 - 2, 16, 0);
		Pix2D.drawRect(var3 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
		b12.drawString(var0, var3 + 3, var5 + 14, 6116423, false);
		int var6 = ClientMouseListener.field741;
		int var7 = ClientMouseListener.field2568;
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
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			int var9 = (menuNumEntries - var8 - 1) * 15 + var5 + 31;
			JagString var10 = field2586[var8];
			int var11 = 16777215;
			if (var10.method38(var0)) {
				var10 = var10.method19(0, var10.method10() - var0.method10());
				if (var10.method38(Text.field2337)) {
					var10 = var10.method19(0, var10.method10() - Text.field2337.method10());
				}
			}
			if (var3 < var6 && var6 < var2 + var3 && var9 - 13 < var7 && var9 + 3 > var7) {
				var11 = 16776960;
			}
			b12.drawString(var10, var3 + 3, var9, var11, true);
		}
	}

	@ObfuscatedName("nb.a(IIIIII)V")
	public static void method724(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = world.wallType(arg0, arg1, arg4);
		if (var5 != 0) {
			int var6 = world.method97(arg0, arg1, arg4, var5);
			int var7 = var6 & 0x1F;
			int var8 = var6 >> 6 & 0x3;
			int var9 = arg2;
			if (var5 > 0) {
				var9 = arg3;
			}
			int var10 = (103 - arg4) * 4 * 512 + arg1 * 4 + 24624;
			int var11 = var5 >> 14 & 0x7FFF;
			int[] var12 = field2626.data;
			LocType var13 = LocType.list(var11);
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
				Pix8 var14 = field800[var13.field1320];
				if (var14 != null) {
					int var15 = (var13.field1286 * 4 - var14.wi) / 2;
					int var16 = (var13.field1298 * 4 - var14.hi) / 2;
					var14.method329(arg1 * 4 + var15 + 48, 48 - -((-arg4 + 104 - var13.field1298) * 4) + var16);
				}
			}
		}
		int var17 = world.method66(arg0, arg1, arg4);
		if (var17 != 0) {
			int var18 = world.method97(arg0, arg1, arg4, var17);
			int var19 = var17 >> 14 & 0x7FFF;
			int var20 = var18 >> 6 & 0x3;
			LocType var21 = LocType.list(var19);
			int var22 = var18 & 0x1F;
			if (var21.field1320 != -1) {
				Pix8 var23 = field800[var21.field1320];
				if (var23 != null) {
					int var24 = (var21.field1298 * 4 - var23.hi) / 2;
					int var25 = (var21.field1286 * 4 - var23.wi) / 2;
					var23.method329(arg1 * 4 + var25 + 48, 48 - (-((-var21.field1298 + 104 + -arg4) * 4) + -var24));
				}
			} else if (var22 == 9) {
				int[] var26 = field2626.data;
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
		int var29 = world.method49(arg0, arg1, arg4);
		if (var29 == 0) {
			return;
		}
		int var30 = var29 >> 14 & 0x7FFF;
		LocType var31 = LocType.list(var30);
		if (var31.field1320 == -1) {
			return;
		}
		Pix8 var32 = field800[var31.field1320];
		if (var32 != null) {
			int var33 = (var31.field1286 * 4 - var32.wi) / 2;
			int var34 = (var31.field1298 * 4 - var32.hi) / 2;
			var32.method329(arg1 * 4 + var33 + 48, (104 - (arg4 - -var31.field1298)) * 4 + var34 + 48);
			return;
		}
	}

	@ObfuscatedName("se.a(BLqd;)V")
	public static void method929(IfType arg0) {
		int var1 = arg0.field2445;
		if (var1 >= 1 && var1 <= 100 || var1 >= 701 && var1 <= 800) {
			if (var1 == 1 && field701 == 0) {
				arg0.field2474 = Text.field726;
				arg0.field2520 = 0;
			} else if (var1 == 1 && field701 == 1) {
				arg0.field2474 = Text.field3219;
				arg0.field2520 = 0;
			} else if (var1 == 2 && field701 != 2) {
				arg0.field2520 = 0;
				arg0.field2474 = Text.field957;
			} else {
				int var2 = field1492;
				if (var1 > 700) {
					var1 -= 601;
				} else {
					var1--;
				}
				if (field701 != 2) {
					var2 = 0;
				}
				if (var2 <= var1) {
					arg0.field2474 = Statics.field3234;
					arg0.field2520 = 0;
				} else {
					arg0.field2474 = field2951[var1];
					arg0.field2520 = 1;
				}
			}
		} else if (var1 >= 101 && var1 <= 200 || var1 >= 801 && var1 <= 900) {
			if (var1 <= 800) {
				var1 -= 101;
			} else {
				var1 -= 701;
			}
			int var3 = field1492;
			if (field701 != 2) {
				var3 = 0;
			}
			if (var1 >= var3) {
				arg0.field2474 = Statics.field3234;
				arg0.field2520 = 0;
			} else {
				if (field1788[var1] == 0) {
					arg0.field2474 = JagString.join(new JagString[]{Statics.field1383, Text.field1593});
				} else if (field1788[var1] < 5000) {
					if (field1788[var1] == worldid) {
						arg0.field2474 = JagString.join(new JagString[]{Statics.field2564, Text.field1407, Statics.method502(field1788[var1])});
					} else {
						arg0.field2474 = JagString.join(new JagString[]{Statics.field2699, Text.field1407, Statics.method502(field1788[var1])});
					}
				} else if (field1788[var1] == worldid) {
					arg0.field2474 = JagString.join(new JagString[]{Statics.field2564, Text.field507, Statics.method502(field1788[var1] - 5000)});
				} else {
					arg0.field2474 = JagString.join(new JagString[]{Statics.field2699, Text.field507, Statics.method502(field1788[var1] - 5000)});
				}
				arg0.field2520 = 1;
			}
		} else if (var1 == 203) {
			int var4 = field1492;
			if (field701 != 2) {
				var4 = 0;
			}
			arg0.field2526 = var4 * 15 + 20;
			if (arg0.field2449 >= arg0.field2526) {
				arg0.field2526 = arg0.field2449 + 1;
			}
		} else if (var1 >= 401 && var1 <= 500) {
			var1 -= 401;
			if (var1 == 0 && field701 == 0) {
				arg0.field2474 = Text.field2431;
				arg0.field2520 = 0;
			} else if (var1 == 1 && field701 == 0) {
				arg0.field2474 = Text.field957;
				arg0.field2520 = 0;
			} else {
				int var5 = Statics.field2146;
				if (field701 == 0) {
					var5 = 0;
				}
				if (var5 <= var1) {
					arg0.field2520 = 0;
					arg0.field2474 = Statics.field3234;
				} else {
					arg0.field2474 = Statics.method969(field2683[var1]).method36();
					arg0.field2520 = 1;
				}
			}
		} else if (var1 == 503) {
			arg0.field2526 = Statics.field2146 * 15 + 20;
			if (arg0.field2449 >= arg0.field2526) {
				arg0.field2526 = arg0.field2449 + 1;
			}
		} else if (var1 == 324) {
			if (ClientStream.field3157 == -1) {
				ClientStream.field3157 = arg0.field2550;
				field590 = arg0.field2476;
			}
			if (idkDesign.field1658) {
				arg0.field2550 = ClientStream.field3157;
			} else {
				arg0.field2550 = field590;
			}
		} else if (var1 == 325) {
			if (ClientStream.field3157 == -1) {
				field590 = arg0.field2476;
				ClientStream.field3157 = arg0.field2550;
			}
			if (idkDesign.field1658) {
				arg0.field2550 = field590;
			} else {
				arg0.field2550 = ClientStream.field3157;
			}
		} else if (var1 == 327) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 0;
			arg0.field2493 = 5;
		} else if (var1 == 328) {
			arg0.field2496 = 150;
			arg0.field2463 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.field2479 = 1;
			arg0.field2493 = 5;
		} else if (var1 == 600) {
			arg0.field2474 = JagString.join(new JagString[]{Statics.field3217, Statics.field3059});
		} else if (var1 == 620) {
			if (staffmodlevel < 1) {
				arg0.field2474 = Statics.field3234;
			} else if (Statics.field3268) {
				arg0.field2453 = 16711680;
				arg0.field2474 = Text.field1094;
			} else {
				arg0.field2453 = 16777215;
				arg0.field2474 = Text.field2308;
			}
		}
	}

	@ObfuscatedName("hc.a(BI)V")
	public static void method472(int arg0) {
		int[] var1 = field2626.data;
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 0;
		}
		for (int var4 = 1; var4 < 103; var4++) {
			int var5 = (52736 - var4 * 512) * 4 + 24628;
			for (int var6 = 1; var6 < 103; var6++) {
				if ((ClientBuild.mapl[arg0][var6][var4] & 0x18) == 0) {
					world.method52(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var6][var4] & 0x8) != 0) {
					world.method52(var1, var5, arg0 + 1, var6, var4);
				}
				var5 += 4;
			}
		}
		field2626.method553();
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var10 = 1; var10 < 103; var10++) {
				if ((ClientBuild.mapl[arg0][var10][var9] & 0x18) == 0) {
					method724(arg0, var10, var7, var8, var9);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var10][var9] & 0x8) != 0) {
					method724(arg0 + 1, var10, var7, var8, var9);
				}
			}
		}
		Statics.field1433 = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = world.method49(minusedlevel, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = LocType.list(var14).field1294;
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var11;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = collision[minusedlevel].field201;
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
						Statics.field3046[Statics.field1433] = field470[var15];
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
		for (int var0 = -1; var0 < field2939 + field1341; var0++) {
			ClientEntity var1;
			if (var0 == -1) {
				var1 = localPlayer;
			} else if (field2939 > var0) {
				var1 = field2030[field2758[var0]];
			} else {
				var1 = field2992[field677[var0 - field2939]];
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
				if (var0 >= field2939) {
					NpcType var3 = ((ClientNpc) var1).field3182;
					if (var3.field1091 >= 0 && var3.field1091 < field178.length) {
						Statics.method523(var1.field1991 + 15, var1);
						if (field1072 > -1) {
							field178[var3.field1091].plotSprite(field1072 - 12, field2188 + -30);
						}
					}
					if (field96 == 1 && field677[var0 - field2939] == Statics.field3212 && loopCycle % 20 < 10) {
						Statics.method523(var1.field1991 + 15, var1);
						if (field1072 > -1) {
							field1886[0].plotSprite(field1072 - 12, field2188 + -28);
						}
					}
				} else {
					ClientPlayer var4 = (ClientPlayer) var1;
					int var5 = 30;
					if (var4.field76 != -1 || var4.field81 != -1) {
						Statics.method523(var1.field1991 + 15, var1);
						if (field1072 > -1) {
							if (var4.field76 != -1) {
								field1376[var4.field76].plotSprite(field1072 - 12, field2188 - 30);
								var5 += 25;
							}
							if (var4.field81 != -1) {
								field178[var4.field81].plotSprite(field1072 - 12, -var5 + field2188);
								var5 += 25;
							}
						}
					}
					if (var0 >= 0 && field96 == 10 && field2758[var0] == Statics.field3290) {
						Statics.method523(var1.field1991 + 15, var1);
						if (field1072 > -1) {
							field1886[1].plotSprite(field1072 - 12, -var5 + field2188);
						}
					}
				}
				if (var1.field1964 != null && (var0 >= field2939 || field1864 == 0 || field1864 == 3 || field1864 == 1 && Statics.method242(((ClientPlayer) var1).field86))) {
					Statics.method523(var1.field1991, var1);
					if (field1072 > -1 && field1684 > Statics.field1749) {
						field1655[Statics.field1749] = b12.method208(var1.field1964) / 2;
						field1663[Statics.field1749] = b12.field350;
						field1690[Statics.field1749] = field1072;
						field1660[Statics.field1749] = field2188;
						field1687[Statics.field1749] = var1.field1976;
						field1670[Statics.field1749] = var1.field1997;
						field1659[Statics.field1749] = var1.field1952;
						field1672[Statics.field1749] = var1.field1964;
						Statics.field1749++;
					}
				}
				if (loopCycle < var1.field2013) {
					Statics.method523(var1.field1991 + 15, var1);
					if (field1072 > -1) {
						int var6 = var1.field2004 * 30 / var1.field1975;
						if (var6 > 30) {
							var6 = 30;
						}
						Pix2D.fillRect(field1072 - 15, field2188 + -3, var6, 5, 65280);
						Pix2D.fillRect(field1072 + var6 - 15, field2188 + -3, 30 - var6, 5, 16711680);
					}
				}
				for (int var7 = 0; var7 < 4; var7++) {
					if (loopCycle < var1.field2010[var7]) {
						Statics.method523(var1.field1991 / 2, var1);
						if (field1072 > -1) {
							if (var7 == 1) {
								field2188 -= 20;
							}
							if (var7 == 2) {
								field1072 -= 15;
								field2188 -= 10;
							}
							if (var7 == 3) {
								field1072 += 15;
								field2188 -= 10;
							}
							field1231[var1.field1960[var7]].plotSprite(field1072 - 12, field2188 + -12);
							p11.method209(Statics.method502(var1.field1961[var7]), field1072, field2188 + 4, 0);
							p11.method209(Statics.method502(var1.field1961[var7]), field1072 - 1, field2188 + 3, 16777215);
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < Statics.field1749; var8++) {
			int var9 = field1690[var8];
			int var10 = field1660[var8];
			int var11 = field1655[var8];
			int var12 = field1663[var8];
			boolean var13 = true;
			while (var13) {
				var13 = false;
				for (int var14 = 0; var14 < var8; var14++) {
					if (field1660[var14] - field1663[var14] < var10 + 2 && var10 - var12 < field1660[var14] + 2 && var9 - var11 < field1690[var14] + field1655[var14] && var9 + var11 > field1690[var14] + -field1655[var14] && var10 > field1660[var14] - field1663[var14]) {
						var13 = true;
						var10 = field1660[var14] - field1663[var14];
					}
				}
			}
			field1072 = field1690[var8];
			field2188 = field1660[var8] = var10;
			JagString var15 = field1672[var8];
			if (field527 == 0) {
				int var16 = 16776960;
				if (field1687[var8] < 6) {
					var16 = Statics.field1458[field1687[var8]];
				}
				if (field1687[var8] == 6) {
					var16 = field2399 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (field1687[var8] == 7) {
					var16 = field2399 % 20 < 10 ? 255 : 65535;
				}
				if (field1687[var8] == 8) {
					var16 = field2399 % 20 >= 10 ? 8454016 : 45056;
				}
				if (field1687[var8] == 9) {
					int var17 = 150 - field1659[var8];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}
				if (field1687[var8] == 10) {
					int var18 = 150 - field1659[var8];
					if (var18 < 50) {
						var16 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var16 = 16711935 + 16384000 - var18 * 327680;
					} else if (var18 < 150) {
						var16 = (var18 - 100) * 327680 + 255 + 500 - var18 * 5;
					}
				}
				if (field1687[var8] == 11) {
					int var19 = 150 - field1659[var8];
					if (var19 < 50) {
						var16 = 16777215 - var19 * 327685;
					} else if (var19 < 100) {
						var16 = (var19 - 50) * 327685 + 65280;
					} else if (var19 < 150) {
						var16 = 16777215 - (var19 - 100) * 327680;
					}
				}
				if (field1670[var8] == 0) {
					b12.method209(var15, field1072, field2188 + 1, 0);
					b12.method209(var15, field1072, field2188, var16);
				}
				if (field1670[var8] == 1) {
					b12.method196(var15, field1072, field2188 + 1, 0, field2399);
					b12.method196(var15, field1072, field2188, var16, field2399);
				}
				if (field1670[var8] == 2) {
					b12.method198(var15, field1072, field2188 + 1, 0, field2399);
					b12.method198(var15, field1072, field2188, var16, field2399);
				}
				if (field1670[var8] == 3) {
					b12.method201(var15, field1072, field2188 + 1, 0, field2399, 150 - field1659[var8]);
					b12.method201(var15, field1072, field2188, var16, field2399, 150 - field1659[var8]);
				}
				if (field1670[var8] == 4) {
					int var20 = b12.method208(var15);
					int var21 = (150 - field1659[var8]) * (var20 + 100) / 150;
					Pix2D.method912(field1072 - 50, 0, field1072 + 50, 334);
					b12.drawString(var15, field1072 + 50 - var21, field2188 + 1, 0);
					b12.drawString(var15, field1072 + 50 - var21, field2188, var16);
					Pix2D.method919();
				}
				if (field1670[var8] == 5) {
					int var22 = 0;
					int var23 = 150 - field1659[var8];
					Pix2D.method912(0, field2188 - b12.field350 - 1, 512, field2188 + 5);
					if (var23 < 25) {
						var22 = var23 - 25;
					} else if (var23 > 125) {
						var22 = var23 - 125;
					}
					b12.method209(var15, field1072, field2188 + var22 + 1, 0);
					b12.method209(var15, field1072, field2188 + var22, var16);
					Pix2D.method919();
				}
			} else {
				b12.method209(var15, field1072, field2188 + 1, 0);
				b12.method209(var15, field1072, field2188, 16776960);
			}
		}
	}

	@ObfuscatedName("qa.g(I)V")
	public static void method837() {
		for (int var0 = 0; var0 < field2027; var0++) {
			int var1 = field1348[var0];
			ClientPlayer var2 = field2030[var1];
			int var3 = in.g1();
			if ((var3 & 0x2) != 0) {
				var3 += in.g1() << 8;
			}
			method102(var2, var3, var1);
		}
	}

	@ObfuscatedName("ac.a(Laa;BII)V")
	public static void method102(ClientPlayer arg0, int arg1, int arg2) {
		if ((arg1 & 0x100) != 0) {
			int var3 = in.method156();
			int var4 = in.method152();
			arg0.method727(var4, loopCycle, var3);
			arg0.field2013 = loopCycle + 300;
			arg0.field2004 = in.method156();
			arg0.field1975 = in.method152();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.field2022 = in.g2();
			arg0.field1974 = in.method166();
		}
		if ((arg1 & 0x1) != 0) {
			int var5 = in.method166();
			if (var5 == 65535) {
				var5 = -1;
			}
			int var6 = in.method147();
			method450(var5, var6, arg0);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.field2011 = in.method137();
			if (arg0.field2011 == 65535) {
				arg0.field2011 = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			int var7 = in.g1();
			int var8 = in.method152();
			arg0.method727(var8, loopCycle, var7);
			arg0.field2013 = loopCycle + 300;
			arg0.field2004 = in.method152();
			arg0.field1975 = in.method152();
		}
		if ((arg1 & 0x400) != 0) {
			arg0.field1999 = in.method156();
			arg0.field1955 = in.method156();
			arg0.field1973 = in.g1();
			arg0.field2001 = in.g1();
			arg0.field1986 = in.method137() + loopCycle;
			arg0.field1981 = in.method180() + loopCycle;
			arg0.field1947 = in.method152();
			arg0.method732();
		}
		if ((arg1 & 0x8) != 0) {
			int var9 = in.g2();
			int var10 = in.method152();
			int var11 = in.method147();
			int var12 = in.pos;
			if (arg0.field86 != null && arg0.field90 != null) {
				long var13 = arg0.field86.toUserhash();
				boolean var15 = false;
				if (var10 <= 1) {
					for (int var16 = 0; var16 < Statics.field2146; var16++) {
						if (field2683[var16] == var13) {
							var15 = true;
							break;
						}
					}
				}
				if (!var15 && chatDisabled == 0) {
					field2917.pos = 0;
					in.method138(field2917.data, var11);
					field2917.pos = 0;
					JagString var17 = Statics.method893(field2917).method4();
					arg0.field1964 = var17.method40();
					arg0.field1952 = 150;
					arg0.field1997 = var9 & 0xFF;
					arg0.field1976 = var9 >> 8;
					if (var10 == 2 || var10 == 3) {
						method758(1, var17, JagString.join(new JagString[]{Statics.field2535, arg0.field86}));
					} else if (var10 == 1) {
						method758(1, var17, JagString.join(new JagString[]{Statics.field2612, arg0.field86}));
					} else {
						method758(2, var17, arg0.field86);
					}
				}
			}
			in.pos = var11 + var12;
		}
		if ((arg1 & 0x20) != 0) {
			int var18 = in.g1();
			byte[] var19 = new byte[var18];
			Packet var20 = new Packet(var19);
			in.method173(var19, var18);
			field1176[arg2] = var20;
			arg0.method43(var20);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.field1965 = in.method166();
			int var21 = in.method146();
			arg0.field2003 = 0;
			arg0.field1967 = (var21 & 0xFFFF) + loopCycle;
			if (arg0.field1965 == 65535) {
				arg0.field1965 = -1;
			}
			arg0.field2014 = 0;
			arg0.field1984 = var21 >> 16;
			if (arg0.field1967 > loopCycle) {
				arg0.field2014 = -1;
			}
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		arg0.field1964 = in.method140();
		if (arg0.field1964.method6(0) == 126) {
			arg0.field1964 = arg0.field1964.method1(1);
			method758(2, arg0.field1964, arg0.field86);
		} else if (localPlayer == arg0) {
			method758(2, arg0.field1964, arg0.field86);
		}
		arg0.field1952 = 150;
		arg0.field1976 = 0;
		arg0.field1997 = 0;
	}

	@ObfuscatedName("l.a(B)V")
	public static void method633() {
		int var0 = in.method412(8);
		if (field2939 > var0) {
			for (int var1 = var0; var1 < field2939; var1++) {
				field375[field841++] = field2758[var1];
			}
		}
		if (var0 > field2939) {
			throw new RuntimeException("gppov1");
		}
		field2939 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = field2758[var2];
			ClientPlayer var4 = field2030[var3];
			int var5 = in.method412(1);
			if (var5 == 0) {
				field2758[field2939++] = var3;
				var4.field2008 = loopCycle;
			} else {
				int var6 = in.method412(2);
				if (var6 == 0) {
					field2758[field2939++] = var3;
					var4.field2008 = loopCycle;
					field1348[field2027++] = var3;
				} else if (var6 == 1) {
					field2758[field2939++] = var3;
					var4.field2008 = loopCycle;
					int var7 = in.method412(3);
					var4.method725(var7, false);
					int var8 = in.method412(1);
					if (var8 == 1) {
						field1348[field2027++] = var3;
					}
				} else if (var6 == 2) {
					field2758[field2939++] = var3;
					var4.field2008 = loopCycle;
					int var9 = in.method412(3);
					var4.method725(var9, true);
					int var10 = in.method412(3);
					var4.method725(var10, true);
					int var11 = in.method412(1);
					if (var11 == 1) {
						field1348[field2027++] = var3;
					}
				} else if (var6 == 3) {
					field375[field841++] = var3;
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
				if (field548 == var11) {
					var14 = 128;
					IfType var15 = IfType.method1009(var11);
					int[] var16 = IfType.method325(var15);
					int[] var17 = IfType.method325(var11);
					int var18 = var17[1] + ClientMouseListener.field2568 - var16[1] - field2392;
					if (var18 < 0) {
						var18 = 0;
					}
					if (var18 + var11.field2449 > var15.field2449) {
						var18 = var15.field2449 - var11.field2449;
					}
					var13 = var16[1] + var18;
					int var19 = ClientMouseListener.field741 + var17[0] - var16[0] - field419;
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
						Pix2D.method912(arg2, arg1, arg6, arg5);
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
										if (Pix2D.field2752 - 32 < var23 && var23 < Pix2D.field2753 && Pix2D.field2748 - 32 < var24 && Pix2D.field2751 > var24 || field857 != 0 && field2776 == var20) {
											int var29 = 0;
											if (field475 == 1 && Statics.field2281 == var20 && Statics.field1075 == var11.field2495) {
												var29 = 16777215;
											}
											Pix32 var30 = ObjType.method1007(var11.field2516[var20], var27, var29);
											if (var30 == null) {
												var9 = false;
											} else {
												if (field857 != 0 && field2776 == var20 && field2410 == var11.field2495) {
													var28 = ClientMouseListener.field2568 - field2829;
													var26 = ClientMouseListener.field741 - field3143;
													if (var26 < 5 && var26 > -5) {
														var26 = 0;
													}
													if (var28 < 5 && var28 > -5) {
														var28 = 0;
													}
													if (field298 < 5) {
														var28 = 0;
														var26 = 0;
													}
													var30.method558(var23 + var26, var24 + var28, 128);
													if (arg4 != -1) {
														IfType var31 = arg8[arg4];
														if (var24 + var28 < Pix2D.field2748 && var31.field2537 > 0) {
															int var32 = (Pix2D.field2748 - var24 - var28) * field321 / 3;
															if (field321 * 10 < var32) {
																var32 = field321 * 10;
															}
															if (var32 > var31.field2537) {
																var32 = var31.field2537;
															}
															var31.field2537 -= var32;
															field2829 += var32;
														}
														if (Pix2D.field2751 < var24 + var28 + 32 && var31.field2537 < var31.field2526 - var31.field2449) {
															int var33 = (var24 + var28 + 32 - Pix2D.field2751) * field321 / 3;
															if (field321 * 10 < var33) {
																var33 = field321 * 10;
															}
															if (var31.field2526 - var31.field2537 - var31.field2449 < var33) {
																var33 = var31.field2526 - var31.field2449 - var31.field2537;
															}
															field2829 -= var33;
															var31.field2537 += var33;
														}
													}
												} else if (field656 != 0 && field2649 == var20 && Statics.field1679 == var11.field2495) {
													var30.method558(var23, var24, 128);
												} else {
													var30.plotSprite(var23, var24);
												}
												if (var30.owi == 33 || var11.field2516[var20] != 1) {
													int var34 = var11.field2516[var20];
													p11.drawString(ObjType.method862(var34), var23 + var26 + 1, var24 + 10 - -var28, 0);
													p11.drawString(ObjType.method862(var34), var23 + var26, var24 - -9 + var28, 16776960);
												}
											}
										}
									} else if (var11.field2510 != null && var20 < 20) {
										Pix32 var25 = var11.method852(var20);
										if (var25 != null) {
											var25.plotSprite(var23, var24);
										} else if (Statics.field3116) {
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
									Pix2D.fillRect(var12, var13, var11.field2498, var11.field2449, var35);
								} else {
									Pix2D.drawRect(var12, var13, var11.field2498, var11.field2449, var35);
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
									ObjType var39 = ObjType.list(var11.field2524);
									var37 = var39.field2827;
									if (var37 == null) {
										var37 = Statics.field1631;
									}
									if (var39.stackable == 1 || var11.field2540 != 1) {
										var37 = JagString.join(new JagString[]{var37, Statics.field1649, Statics.method803(var11.field2540)});
									}
								}
								if (var11.field2520 == 6 && field2998 == var11.field2495) {
									var38 = var11.field2453;
									var37 = Text.field957;
								}
								if (Statics.field2749 == 479) {
									if (var38 == 16776960) {
										var38 = 255;
									}
									if (var38 == 49152) {
										var38 = 16777215;
									}
								}
								JagString var40 = method386(var11, var37);
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
									var44 = ObjType.method1007(var11.field2540, var11.field2524, 0);
									var42 = var44.owi;
									var43 = var44.ohi;
									var44.ohi = 32;
									var44.owi = 32;
								}
								if (var44 != null) {
									int var45 = var44.hi;
									int var46 = var44.wi;
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
													var44.plotSprite(var46 * var55 + var12, var45 * var56 + var13);
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
											var44.plotSprite(var12, var13);
										} else {
											var44.method562(var12, var13, var11.field2498, var11.field2449);
										}
									}
								} else if (Statics.field3116) {
									var9 = false;
								}
								if (var11.field2524 != -1) {
									if (var11.field2540 != 1 || var42 == 33) {
										p11.drawString(Statics.method502(var11.field2540), var12 + 1, var13 + 10, 0);
										p11.drawString(Statics.method502(var11.field2540), var12, var13 + 9, 16776960);
									}
									var44.owi = var42;
									var44.ohi = var43;
								}
							} else {
								Pix32 var41 = var11.method857(method947(var11));
								if (var41 != null) {
									var41.plotSprite(var12, var13);
								} else if (Statics.field3116) {
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
							Model var59;
							if (var11.field2493 == 5) {
								if (var11.field2479 == 0) {
									var59 = idkDesign.method637(null, null, -1, -1);
								} else {
									var59 = localPlayer.method41();
								}
							} else if (var58 == -1) {
								var59 = var11.method860(null, -1, var57, localPlayer.field90);
								if (var59 == null && Statics.field3116) {
									var9 = false;
								}
							} else {
								SeqType var60 = SeqType.method103(var58);
								var59 = var11.method860(var60, var11.field2460, var57, localPlayer.field90);
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
								ObjType var67 = ObjType.list(var11.field2524);
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
											ObjType var75 = ObjType.list(var11.field2491[var72] - 1);
											JagString var76 = var75.field2827;
											if (var76 == null) {
												var76 = Statics.field1631;
											}
											if (var75.stackable == 1 || var11.field2516[var72] != 1) {
												var76 = JagString.join(new JagString[]{var76, Statics.field1649, Statics.method803(var11.field2516[var72])});
											}
											int var77 = (var11.field2555 + 115) * var74 + var12;
											int var78 = (var11.field2473 + 12) * var73 + var13;
											if (var11.field2539 == 0) {
												var71.drawString(var76, var77, var78, var11.field2453, var11.field2471);
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
							if (var11.field2489 == 8 && Statics.method720(arg0, var10) && field2673 == field57) {
								int var79 = 0;
								int var80 = 0;
								PixFont var81 = p12;
								JagString var82 = var11.field2474;
								JagString var83 = method386(var11, var82);
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
								Pix2D.fillRect(var88, var87, var79, var80, 16777120);
								Pix2D.drawRect(var88, var87, var79, var80, 0);
								JagString var89 = var11.field2474;
								int var90 = var87 + var81.field350 + 2;
								JagString var91 = method386(var11, var89);
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
									var81.drawString(var93, var88 + 3, var90, 0, false);
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
		if (arg0.field1965 != -1 && arg0.field1967 <= loopCycle) {
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
			if (var4.field1227 == 1 && arg0.field1968 > 0 && arg0.field1986 <= loopCycle && arg0.field1981 < loopCycle) {
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
	public static boolean tcpIn() {
		if (stream == null) {
			return false;
		}
		try {
			int var0 = stream.available();
			if (var0 == 0) {
				return false;
			}
			if (ptype == -1) {
				stream.read(0, 1, in.data);
				in.pos = 0;
				var0--;
				ptype = in.g1Enc();
				psize = field1353[ptype];
			}
			if (psize == -1) {
				if (var0 <= 0) {
					return false;
				}
				stream.read(0, 1, in.data);
				psize = in.data[0] & 0xFF;
				var0--;
			}
			if (psize == -2) {
				if (var0 <= 1) {
					return false;
				}
				var0 -= 2;
				stream.read(0, 2, in.data);
				in.pos = 0;
				psize = in.g2();
			}
			if (psize > var0) {
				return false;
			}
			in.pos = 0;
			stream.read(0, psize, in.data);
			field2434 = field498;
			field1855 = 0;
			field498 = field36;
			field36 = ptype;
			if (ptype == 71) {
				long var1 = in.method174();
				JagString var3 = Statics.method893(in).method4();
				method758(6, var3, Statics.method969(var1).method36());
				ptype = -1;
				return true;
			}
			if (ptype == 156) {
				long var4 = in.method174();
				int var6 = in.g2();
				JagString var7 = Statics.method969(var4).method36();
				for (int var8 = 0; var8 < field1492; var8++) {
					if (field2929[var8] == var4) {
						if (field1788[var8] != var6) {
							field1788[var8] = var6;
							field1055 = true;
							if (var6 > 0) {
								method758(5, JagString.join(new JagString[]{var7, Text.field2126}), Statics.field3234);
							}
							if (var6 == 0) {
								method758(5, JagString.join(new JagString[]{var7, Text.field1510}), Statics.field3234);
							}
						}
						var7 = null;
						break;
					}
				}
				boolean var9 = false;
				if (var7 != null && field1492 < 200) {
					field2929[field1492] = var4;
					field2951[field1492] = var7;
					field1788[field1492] = var6;
					field1492++;
					field1055 = true;
				}
				while (!var9) {
					var9 = true;
					for (int var10 = 0; var10 < field1492 - 1; var10++) {
						if (field1788[var10] != worldid && field1788[var10 + 1] == worldid || field1788[var10] == 0 && field1788[var10 + 1] != 0) {
							var9 = false;
							int var11 = field1788[var10];
							field1788[var10] = field1788[var10 + 1];
							field1788[var10 + 1] = var11;
							JagString var12 = field2951[var10];
							field2951[var10] = field2951[var10 + 1];
							field2951[var10 + 1] = var12;
							long var13 = field2929[var10];
							field2929[var10] = field2929[var10 + 1];
							field2929[var10 + 1] = var13;
							field1055 = true;
						}
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 233) {
				ptype = -1;
				field941 = 0;
				return true;
			}
			if (ptype == 7) {
				cinemaCam = false;
				for (int var15 = 0; var15 < 5; var15++) {
					field632[var15] = false;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 23) {
				rebuildPacket(true);
				ptype = -1;
				return true;
			}
			if (ptype == 222) {
				byte var16 = in.method168();
				int var17 = in.method137();
				VarCache.field304[var17] = var16;
				if (VarCache.field2803[var17] != var16) {
					VarCache.field2803[var17] = var16;
					method476(var17);
					field1055 = true;
					if (field2421 != -1) {
						field2637 = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 115) {
				boolean var18 = in.g1() == 1;
				int var19 = in.method146();
				IfType var20 = IfType.method1053(var19);
				var20.field2556 = var18;
				ptype = -1;
				return true;
			}
			if (ptype == 12) {
				field1055 = true;
				int var21 = in.method167();
				IfType var22 = IfType.method1053(var21);
				if (var22.field2442) {
					IfType[] var24 = IfType.field2922[var21 >> 16];
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
				int var27 = in.g2();
				for (int var28 = 0; var28 < var27; var28++) {
					int var29 = in.method152();
					if (var29 == 255) {
						var29 = in.method167();
					}
					int var30 = in.method137();
					if (var22.field2442) {
						IfType[] var31 = IfType.field2922[var21 >> 16];
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
				ptype = -1;
				return true;
			}
			if (ptype == 250) {
				int var34 = in.method166();
				int var35 = in.method146();
				IfType var36 = IfType.method1053(var35);
				var36.field2479 = var34;
				var36.field2493 = 1;
				ptype = -1;
				return true;
			}
			if (ptype == 255) {
				int var37 = in.g1();
				int var38 = in.g1();
				int var39 = in.g1();
				int var40 = in.g1();
				field632[var37] = true;
				field471[var37] = var38;
				field1599[var37] = var39;
				field2782[var37] = var40;
				field1019[var37] = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 235) {
				field1587 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 48) {
				field1470 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 82) {
				JagString var41 = in.method140();
				if (var41.method38(Statics.field1229)) {
					JagString var53 = var41.method19(0, var41.method11(Statics.field2165));
					long var54 = var53.toUserhash();
					boolean var56 = false;
					for (int var57 = 0; var57 < Statics.field2146; var57++) {
						if (field2683[var57] == var54) {
							var56 = true;
							break;
						}
					}
					if (!var56 && chatDisabled == 0) {
						method758(4, Text.field231, var53);
					}
				} else if (var41.method38(Statics.field1191)) {
					JagString var48 = var41.method19(0, var41.method11(Statics.field2165));
					long var49 = var48.toUserhash();
					boolean var51 = false;
					for (int var52 = 0; var52 < Statics.field2146; var52++) {
						if (field2683[var52] == var49) {
							var51 = true;
							break;
						}
					}
					if (!var51 && chatDisabled == 0) {
						method758(8, Text.field3008, var48);
					}
				} else if (var41.method38(Statics.field2085)) {
					JagString var42 = var41.method19(0, var41.method11(Statics.field2165));
					long var43 = var42.toUserhash();
					boolean var45 = false;
					for (int var46 = 0; var46 < Statics.field2146; var46++) {
						if (field2683[var46] == var43) {
							var45 = true;
							break;
						}
					}
					if (!var45 && chatDisabled == 0) {
						JagString var47 = var41.method19(var41.method11(Statics.field2165) + 1, var41.method10() + -9);
						method758(8, var47, var42);
					}
				} else {
					method758(0, var41, Statics.field3234);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 182) {
				int var58 = in.g2();
				int var59 = in.method161();
				IfType var60 = IfType.method1053(var59);
				ptype = -1;
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
			if (ptype == 174) {
				int var61 = in.method146();
				IfType var62 = IfType.method1053(var61);
				if (var62.field2442) {
					IfType[] var63 = IfType.field2922[var61 >> 16];
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
				ptype = -1;
				return true;
			}
			if (ptype == 130) {
				field1844 = in.method166();
				ptype = -1;
				return true;
			}
			if (ptype == 129) {
				int var67 = in.method147();
				int var68 = in.method152();
				int var69 = in.method147();
				minusedlevel = var67 >> 1;
				localPlayer.method729(var69, (var67 & 0x1) == 1, var68);
				ptype = -1;
				return true;
			}
			if (ptype == 181) {
				method847();
				ptype = -1;
				return false;
			}
			if (ptype == 24) {
				int var70 = in.method139();
				int var71 = in.method167();
				IfType var72 = IfType.method1053(var71);
				if (var72.field2465 != var70 || var70 == -1) {
					var72.field2466 = 0;
					var72.field2460 = 0;
					var72.field2465 = var70;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 56) {
				int var73 = in.method136();
				if (var73 >= 0) {
					method746(var73);
				}
				if (field2800 != var73) {
					IfType.method895(field2800);
					field2800 = var73;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 117) {
				int var74 = in.g2();
				int var75 = in.method180();
				int var76 = in.method161();
				IfType var77 = IfType.method1053(var76);
				ptype = -1;
				var77.field2528 = (var74 << 16) + var75;
				return true;
			}
			if (ptype == 84) {
				int var78 = in.g2();
				int var79 = in.method180();
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2637 = true;
					field2166 = -1;
				}
				if (field1143 != -1) {
					IfType.method895(field1143);
					field1143 = -1;
					setMainState(30);
				}
				if (field1881 != -1) {
					IfType.method895(field1881);
					field1881 = -1;
				}
				if (field3227 != var79) {
					IfType.method895(field3227);
					field3227 = var79;
				}
				if (field1648 != var78) {
					IfType.method895(field1648);
					field1648 = var78;
				}
				field2998 = -1;
				if (field2811 != 0) {
					field2637 = true;
					field2811 = 0;
				}
				field1055 = true;
				field2364 = true;
				ptype = -1;
				return true;
			}
			if (ptype == 64) {
				field893 = in.g1();
				field1471 = in.method152();
				for (int var80 = field1471; var80 < field1471 + 8; var80++) {
					for (int var81 = field893; var81 < field893 + 8; var81++) {
						if (groundObj[minusedlevel][var80][var81] != null) {
							groundObj[minusedlevel][var80][var81] = null;
							showObject(var81, var80);
						}
					}
				}
				for (LocChange var82 = (LocChange) locChanges.head(); var82 != null; var82 = (LocChange) locChanges.next()) {
					if (var82.field700 >= field1471 && field1471 + 8 > var82.field700 && var82.field699 >= field893 && field893 + 8 > var82.field699 && minusedlevel == var82.field679) {
						var82.endTime = 0;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 223) {
				JagString var83 = in.method140();
				int var84 = in.method156();
				int var85 = in.g1();
				if (var85 >= 1 && var85 <= 5) {
					if (var83.method14(Statics.field1631)) {
						var83 = null;
					}
					playerOp[var85 - 1] = var83;
					playerOpPriority[var85 - 1] = var84 == 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 118) {
				int var86 = in.g2();
				method746(var86);
				if (field1648 != -1) {
					IfType.method895(field1648);
					field2364 = true;
					field1648 = -1;
					field1055 = true;
				}
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2637 = true;
					field2166 = -1;
				}
				if (field1143 != -1) {
					IfType.method895(field1143);
					field1143 = -1;
					setMainState(30);
				}
				if (field1881 != -1) {
					IfType.method895(field1881);
					field1881 = -1;
				}
				if (field3227 != var86) {
					IfType.method895(field3227);
					field3227 = var86;
				}
				field2998 = -1;
				if (field2811 != 0) {
					field2637 = true;
					field2811 = 0;
				}
				method1018(field3227);
				ptype = -1;
				return true;
			}
			if (ptype == 18) {
				if (field330 == 12) {
					field1055 = true;
				}
				field2962 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 253) {
				cinemaCam = true;
				field1187 = in.g1();
				field1746 = in.g1();
				field316 = in.g2();
				field239 = in.g1();
				field2918 = in.g1();
				if (field2918 >= 100) {
					field1200 = field1746 * 128 + 64;
					field709 = field1187 * 128 + 64;
					field1748 = method712(minusedlevel, field709, field1200) - field316;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 185) {
				int var87 = in.method136();
				if (field2421 != var87) {
					IfType.method895(field2421);
					field2421 = var87;
				}
				ptype = -1;
				field2637 = true;
				return true;
			}
			if (ptype == 195) {
				int var88 = in.method137();
				int var89 = in.g2();
				method746(var89);
				if (var88 != -1) {
					method746(var88);
				}
				if (field3227 != -1) {
					IfType.method895(field3227);
					field3227 = -1;
				}
				if (field1648 != -1) {
					IfType.method895(field1648);
					field1648 = -1;
				}
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2166 = -1;
				}
				if (field1143 != var89) {
					IfType.method895(field1143);
					field1143 = var89;
					setMainState(35);
				}
				if (field1881 != var89) {
					IfType.method895(field1881);
					field1881 = var88;
				}
				field2998 = -1;
				field2811 = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 180) {
				if (field1648 != -1) {
					IfType.method895(field1648);
					field1055 = true;
					field2364 = true;
					field1648 = -1;
				}
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2637 = true;
					field2166 = -1;
				}
				if (field1143 != -1) {
					IfType.method895(field1143);
					field1143 = -1;
					setMainState(30);
				}
				if (field1881 != -1) {
					IfType.method895(field1881);
					field1881 = -1;
				}
				if (field3227 != -1) {
					IfType.method895(field3227);
					field3227 = -1;
				}
				ptype = -1;
				field2998 = -1;
				if (field2811 != 0) {
					field2637 = true;
					field2811 = 0;
				}
				return true;
			}
			if (ptype == 208) {
				int var90 = in.method137();
				method746(var90);
				if (field1648 != -1) {
					IfType.method895(field1648);
					field2364 = true;
					field1648 = -1;
					field1055 = true;
				}
				if (field1143 != -1) {
					IfType.method895(field1143);
					field1143 = -1;
					setMainState(30);
				}
				if (field1881 != -1) {
					IfType.method895(field1881);
					field1881 = -1;
				}
				if (field3227 != -1) {
					IfType.method895(field3227);
					field3227 = -1;
				}
				if (field2166 != var90) {
					IfType.method895(field2166);
					field2166 = var90;
				}
				field2637 = true;
				ptype = -1;
				field2998 = -1;
				return true;
			}
			if (ptype == 217) {
				int var91 = in.method166();
				if (var91 == 65535) {
					var91 = -1;
				}
				method874(var91);
				ptype = -1;
				return true;
			}
			if (ptype == 40) {
				int var92 = in.g3();
				int var93 = in.method137();
				if (var93 == 65535) {
					var93 = -1;
				}
				method928(var92, var93);
				ptype = -1;
				return true;
			}
			if (ptype == 254) {
				field893 = in.method156();
				field1471 = in.method147();
				ptype = -1;
				return true;
			}
			if (ptype == 88) {
				field2607 = in.method152();
				if (field330 == field2607) {
					if (field2607 == 3) {
						field330 = 1;
					} else {
						field330 = 3;
					}
					field1055 = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 63) {
				field1471 = in.method147();
				field893 = in.method156();
				while (in.pos < psize) {
					ptype = in.g1();
					zonePacket();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 196) {
				field1864 = in.g1();
				field236 = in.g1();
				field2828 = in.g1();
				field2637 = true;
				field504 = true;
				ptype = -1;
				return true;
			}
			if (ptype == 116) {
				field2813 = in.method166() * 30;
				ptype = -1;
				return true;
			}
			if (ptype == 92) {
				method600();
				ptype = -1;
				return true;
			}
			if (ptype == 2) {
				int var94 = in.method146();
				int var95 = in.g2();
				VarCache.field304[var95] = var94;
				if (VarCache.field2803[var95] != var94) {
					VarCache.field2803[var95] = var94;
					method476(var95);
					if (field2421 != -1) {
						field2637 = true;
					}
					field1055 = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 128) {
				method532();
				ptype = -1;
				return true;
			}
			if (ptype == 131) {
				int var96 = in.g2();
				int var97 = in.g1();
				int var98 = in.g2();
				method887(var96, var97, var98);
				ptype = -1;
				return true;
			}
			if (ptype == 237) {
				int var99 = in.g2();
				method746(var99);
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2166 = -1;
					field2637 = true;
				}
				if (field1143 != -1) {
					IfType.method895(field1143);
					field1143 = -1;
					setMainState(30);
				}
				if (field1881 != -1) {
					IfType.method895(field1881);
					field1881 = -1;
				}
				if (field3227 != -1) {
					IfType.method895(field3227);
					field3227 = -1;
				}
				if (field1648 != var99) {
					IfType.method895(field1648);
					field1648 = var99;
				}
				field2364 = true;
				if (field2811 != 0) {
					field2637 = true;
					field2811 = 0;
				}
				field2998 = -1;
				ptype = -1;
				field1055 = true;
				return true;
			}
			if (ptype == 234) {
				cinemaCam = true;
				Statics.field1270 = in.g1();
				Statics.field1895 = in.g1();
				Statics.field1940 = in.g2();
				Statics.field2945 = in.g1();
				Statics.field1029 = in.g1();
				if (Statics.field1029 >= 100) {
					int var100 = Statics.field1270 * 128 + 64;
					int var101 = Statics.field1895 * 128 + 64;
					int var102 = method712(minusedlevel, var100, var101) - Statics.field1940;
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
				ptype = -1;
				return true;
			}
			if (ptype == 142) {
				int var107 = in.g2();
				int var108 = in.method166();
				int var109 = in.g2();
				int var110 = in.method161();
				IfType var111 = IfType.method1053(var110);
				ptype = -1;
				var111.field2463 = var107;
				var111.field2534 = var108;
				var111.field2496 = var109;
				return true;
			}
			if (ptype == 6) {
				field330 = in.g1();
				field2364 = true;
				field1055 = true;
				ptype = -1;
				return true;
			}
			if (ptype == 171) {
				if (field330 == 12) {
					field1055 = true;
				}
				field2638 = in.method139();
				ptype = -1;
				return true;
			}
			if (ptype == 9 || ptype == 99 || ptype == 229 || ptype == 19 || ptype == 202 || ptype == 1 || ptype == 74 || ptype == 175 || ptype == 49 || ptype == 143 || ptype == 241) {
				zonePacket();
				ptype = -1;
				return true;
			}
			if (ptype == 14) {
				for (int var112 = 0; var112 < VarpType.field2915; var112++) {
					VarpType var113 = VarpType.method1023(var112);
					if (var113 != null && var113.field2404 == 0) {
						VarCache.field304[var112] = 0;
						VarCache.field2803[var112] = 0;
					}
				}
				if (field2421 != -1) {
					field2637 = true;
				}
				field1055 = true;
				ptype = -1;
				return true;
			}
			if (ptype == 160) {
				int var114 = in.method166();
				int var115 = in.method161();
				IfType var116 = IfType.method1053(var115);
				var116.field2493 = 2;
				ptype = -1;
				var116.field2479 = var114;
				return true;
			}
			if (ptype == 132) {
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2166 = -1;
				}
				ptype = -1;
				Statics.field3210 = Statics.field3234;
				field2811 = 1;
				field2637 = true;
				field1001 = false;
				return true;
			}
			if (ptype == 186) {
				field96 = in.g1();
				if (field96 == 1) {
					Statics.field3212 = in.g2();
				}
				if (field96 >= 2 && field96 <= 6) {
					if (field96 == 2) {
						Statics.field1857 = 64;
						field2572 = 64;
					}
					if (field96 == 3) {
						Statics.field1857 = 64;
						field2572 = 0;
					}
					if (field96 == 4) {
						Statics.field1857 = 64;
						field2572 = 128;
					}
					if (field96 == 5) {
						field2572 = 64;
						Statics.field1857 = 0;
					}
					if (field96 == 6) {
						field2572 = 64;
						Statics.field1857 = 128;
					}
					field96 = 2;
					Statics.field3304 = in.g2();
					field226 = in.g2();
					Statics.field1114 = in.g1();
				}
				if (field96 == 10) {
					Statics.field3290 = in.g2();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 210) {
				int var117 = in.method161();
				IfType var118 = IfType.method1053(var117);
				var118.field2493 = 3;
				var118.field2479 = localPlayer.field90.method634();
				ptype = -1;
				return true;
			}
			if (ptype == 110) {
				int var119 = in.method161();
				JagString var120 = in.method140();
				IfType var121 = IfType.method1053(var119);
				var121.field2474 = var120;
				if (var119 >> 16 == field2397[field330]) {
					field1055 = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 70) {
				field701 = in.g1();
				field1055 = true;
				ptype = -1;
				return true;
			}
			if (ptype == 120) {
				int var122 = in.g2();
				int var123 = in.method166();
				int var124 = in.method161();
				if (var123 == 65535) {
					var123 = -1;
				}
				IfType var125 = IfType.method1053(var124);
				if (var125.field2442) {
					var125.field2540 = 1;
					var125.field2524 = var123;
				} else if (var123 == -1) {
					ptype = -1;
					var125.field2493 = 0;
					return true;
				} else {
					ObjType var126 = ObjType.list(var123);
					var125.field2496 = var126.field2875;
					var125.field2479 = var123;
					var125.field2493 = 4;
					var125.field2534 = var126.field2848 * 100 / var122;
					var125.field2463 = var126.field2861;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 51) {
				long var127 = in.method174();
				long var129 = (long) in.g2();
				long var131 = (long) in.g3();
				int var133 = in.g1();
				boolean var134 = false;
				long var135 = (var129 << 32) + var131;
				for (int var137 = 0; var137 < 100; var137++) {
					if (field2618[var137] == var135) {
						var134 = true;
						break;
					}
				}
				if (var133 <= 1) {
					for (int var138 = 0; var138 < Statics.field2146; var138++) {
						if (field2683[var138] == var127) {
							var134 = true;
							break;
						}
					}
				}
				if (!var134 && chatDisabled == 0) {
					field2618[Statics.field682] = var135;
					Statics.field682 = (Statics.field682 + 1) % 100;
					JagString var139 = Statics.method893(in).method4();
					if (var133 == 2 || var133 == 3) {
						method758(7, var139, JagString.join(new JagString[]{Statics.field2535, Statics.method969(var127).method36()}));
					} else if (var133 == 1) {
						method758(7, var139, JagString.join(new JagString[]{Statics.field2612, Statics.method969(var127).method36()}));
					} else {
						method758(3, var139, Statics.method969(var127).method36());
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 27) {
				for (int var140 = 0; var140 < field2030.length; var140++) {
					if (field2030[var140] != null) {
						field2030[var140].field2015 = -1;
					}
				}
				for (int var141 = 0; var141 < field2992.length; var141++) {
					if (field2992[var141] != null) {
						field2992[var141].field2015 = -1;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 140) {
				int var142 = in.g2();
				int var143 = in.g1();
				if (var142 == 65535) {
					var142 = -1;
				}
				if (field2397[var143] != var142) {
					IfType.method895(field2397[var143]);
					field2397[var143] = var142;
				}
				field2364 = true;
				ptype = -1;
				field1055 = true;
				return true;
			}
			if (ptype == 34) {
				field1055 = true;
				int var144 = in.method152();
				int var145 = in.g1();
				int var146 = in.method146();
				Statics.field1483[var145] = var146;
				field724[var145] = var144;
				Statics.field549[var145] = 1;
				for (int var147 = 0; var147 < 98; var147++) {
					if (Statics.field1514[var147] <= var146) {
						Statics.field549[var145] = var147 + 2;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 3) {
				int var148 = in.method167();
				int var149 = in.method160();
				int var150 = in.method160();
				IfType var151 = IfType.method1053(var148);
				var151.field2462 = var151.field2455 + var150;
				ptype = -1;
				var151.field2502 = var151.field2549 + var149;
				return true;
			}
			if (ptype == 72) {
				for (int var152 = 0; var152 < VarCache.field2803.length; var152++) {
					if (VarCache.field304[var152] != VarCache.field2803[var152]) {
						VarCache.field2803[var152] = VarCache.field304[var152];
						method476(var152);
						field1055 = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 240) {
				ReflectionChecker.method460(signlink, in, psize);
				ptype = -1;
				return true;
			}
			if (ptype == 58) {
				int var153 = in.method183();
				Statics.field715 = signlink.method655(var153);
				ptype = -1;
				return true;
			}
			if (ptype == 214) {
				field1055 = true;
				int var154 = in.method167();
				IfType var155 = IfType.method1053(var154);
				while (true) {
					while (psize > in.pos) {
						int var156 = in.method178();
						int var157 = in.g2();
						int var158 = 0;
						if (var157 != 0) {
							var158 = in.g1();
							if (var158 == 255) {
								var158 = in.method167();
							}
						}
						if (var155.field2442) {
							IfType[] var159 = IfType.field2922[var154 >> 16];
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
					ptype = -1;
					return true;
				}
			}
			if (ptype == 166) {
				rebuildPacket(false);
				ptype = -1;
				return true;
			}
			if (ptype == 231) {
				int var162 = in.method137();
				int var163 = in.method161();
				int var164 = var162 >> 10 & 0x1F;
				int var165 = var162 >> 5 & 0x1F;
				IfType var166 = IfType.method1053(var163);
				ptype = -1;
				int var167 = var162 & 0x1F;
				var166.field2453 = (var167 << 3) + (var164 << 19) + (var165 << 11);
				return true;
			}
			if (ptype == 211) {
				Statics.field2146 = psize / 8;
				for (int var168 = 0; var168 < Statics.field2146; var168++) {
					field2683[var168] = in.method174();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 124) {
				if (field2166 != -1) {
					IfType.method895(field2166);
					field2166 = -1;
				}
				field2637 = true;
				Statics.field3210 = Statics.field3234;
				field2811 = 2;
				ptype = -1;
				field1001 = false;
				return true;
			}
			JagException.report("T1 - " + ptype + "," + field498 + "," + field2434 + " - " + psize, null);
			method847();
		} catch (IOException var172) {
			method960();
		} catch (Exception var173) {
			String var170 = "T2 - " + ptype + "," + field498 + "," + field2434 + " - " + psize + "," + (localPlayer.field1962[0] + field806) + "," + (localPlayer.field2009[0] + field1408) + " - ";
			for (int var171 = 0; psize > var171 && var171 < 50; var171++) {
				var170 = var170 + in.data[var171] + ",";
			}
			JagException.report(var170, var173);
			method847();
		}
		return true;
	}

	@ObfuscatedName("n.a(B)V")
	public static void errorUsage() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@ObfuscatedName("td.b(I)V")
	public static void method968() {
		int var0 = b12.method208(Text.field2490);
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			int var2 = b12.method204(field2586[var1]);
			if (var0 < var2) {
				var0 = var2;
			}
		}
		var0 += 8;
		int var3 = menuNumEntries * 15 + 21;
		if (field2762 > 4 && field14 > 4 && field2762 < 516 && field14 < 338) {
			field640 = 0;
			field219 = menuNumEntries * 15 + 22;
			isMenuOpen = true;
			int var4 = field2762 - var0 / 2 - 4;
			field2306 = var0;
			if (var0 + var4 > 512) {
				var4 = 512 - var0;
			}
			if (var4 < 0) {
				var4 = 0;
			}
			field986 = var4;
			int var5 = field14 - 4;
			if (var5 + var3 > 334) {
				var5 = 334 - var3;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			field579 = var5;
		}
		if (field2762 > 553 && field14 > 205 && field2762 < 743 && field14 < 466) {
			field219 = menuNumEntries * 15 + 22;
			field640 = 1;
			int var6 = field14 - 205;
			int var7 = field2762 - var0 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var0 + var7 > 190) {
				var7 = 190 - var0;
			}
			isMenuOpen = true;
			field986 = var7;
			if (var6 < 0) {
				var6 = 0;
			} else if (var3 + var6 > 261) {
				var6 = 261 - var3;
			}
			field2306 = var0;
			field579 = var6;
		}
		if (field2762 <= 17 || field14 <= 357 || field2762 >= 496 || field14 >= 453) {
			return;
		}
		field2306 = var0;
		field640 = 2;
		field219 = menuNumEntries * 15 + 22;
		int var8 = field14 - 357;
		if (var8 < 0) {
			var8 = 0;
		} else if (var3 + var8 > 96) {
			var8 = 96 - var3;
		}
		int var9 = field2762 - var0 / 2 - 17;
		isMenuOpen = true;
		field579 = var8;
		if (var9 < 0) {
			var9 = 0;
		} else if (var0 + var9 > 479) {
			var9 = 479 - var0;
		}
		field986 = var9;
	}

	@ObfuscatedName("vd.c(B)V")
	public static void gameLoop() {
		if (field2813 > 1) {
			field2813--;
		}
		if (field1750 > 0) {
			field1750--;
		}
		if (networkError) {
			networkError = false;
			method960();
			return;
		}
		for (int var0 = 0; var0 < 100 && tcpIn(); var0++) {
		}
		if (state != 30 && state != 35) {
			return;
		}
		if (field1069 && state == 30) {
			field801 = 0;
			field3050 = 0;
			while (ClientKeyboardListener.method685()) {
			}
			for (int var1 = 0; var1 < field1488.length; var1++) {
				field1488[var1] = false;
			}
		}
		ReflectionChecker.method479(out);
		Object var2 = field708.lock;
		synchronized (field708.lock) {
			if (!mouseTracked) {
				field708.field2058 = 0;
			} else if (field3050 != 0 || field708.field2058 >= 40) {
				int var3 = 0;
				out.method415(210);
				out.p1(0);
				int var4 = out.pos;
				for (int var5 = 0; var5 < field708.field2058 && out.pos - var4 < 240; var5++) {
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
					if (field973 != var7 || field1342 != var6) {
						int var9 = var7 - field973;
						field973 = var7;
						int var10 = var6 - field1342;
						field1342 = var6;
						if (field3069 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							out.method150((field3069 << 12) + (var9 << 6) + var10);
							field3069 = 0;
						} else if (field3069 < 8) {
							out.method153(var8 + (field3069 << 19) + 8388608);
							field3069 = 0;
						} else {
							out.p4((field3069 << 19) + var8 - 1073741824);
							field3069 = 0;
						}
					} else if (field3069 < 2047) {
						field3069++;
					}
				}
				out.method155(out.pos - var4);
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
		if (field3050 != 0) {
			long var12 = (field1344 - field2605) / 50L;
			int var14 = field2762;
			int var15 = field14;
			field2605 = field1344;
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
			if (field3050 == 2) {
				var16 = 1;
			}
			if (var12 > 4095L) {
				var12 = 4095L;
			}
			int var17 = (int) var12;
			out.method415(234);
			int var18 = var15 * 765 + var14;
			out.method170((var16 << 19) + ((var17 << 20) + var18));
		}
		if (field998 > 0) {
			field998--;
		}
		if (field1488[96] || field1488[97] || field1488[98] || field1488[99]) {
			field1271 = true;
		}
		if (field1271 && field998 <= 0) {
			field998 = 20;
			field1271 = false;
			out.method415(58);
			out.method150(field2797);
			out.method150(field3204);
		}
		if (field1277 && !field1862) {
			field1862 = true;
			out.method415(160);
			out.p1(1);
		}
		if (!field1277 && field1862) {
			field1862 = false;
			out.method415(160);
			out.p1(0);
		}
		method810();
		if (state != 30 && state != 35) {
			return;
		}
		locChangeDoQueue();
		method125();
		field1855++;
		if (field1855 > 750) {
			method960();
			return;
		}
		method384();
		method252();
		method424();
		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		if (field656 != 0) {
			field1154++;
			if (field1154 >= 15) {
				if (field656 == 2) {
					field1055 = true;
				}
				if (field656 == 3) {
					field2637 = true;
				}
				field656 = 0;
			}
		}
		field321++;
		if (field857 != 0) {
			field298++;
			if (ClientMouseListener.field741 > field3143 + 5 || field3143 - 5 > ClientMouseListener.field741 || field2829 + 5 < ClientMouseListener.field2568 || field2829 - 5 > ClientMouseListener.field2568) {
				field2815 = true;
			}
			if (field801 == 0) {
				if (field857 == 3) {
					field2637 = true;
				}
				if (field857 == 2) {
					field1055 = true;
				}
				field857 = 0;
				if (field2815 && field298 >= 5) {
					field1145 = -1;
					method757();
					if (field2410 == field1145 && field2776 != field2704) {
						IfType var19 = IfType.method1053(field2410);
						byte var20 = 0;
						if (field2163 == 1 && var19.field2445 == 206) {
							var20 = 1;
						}
						if (var19.field2491[field2704] <= 0) {
							var20 = 0;
						}
						if (var19.field2529) {
							int var23 = field2704;
							int var24 = field2776;
							var19.field2491[var23] = var19.field2491[var24];
							var19.field2516[var23] = var19.field2516[var24];
							var19.field2491[var24] = -1;
							var19.field2516[var24] = 0;
						} else if (var20 == 1) {
							int var21 = field2776;
							int var22 = field2704;
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
							var19.method850(field2704, field2776);
						}
						out.method415(83);
						out.method165(var20);
						out.method169(field2776);
						out.method154(field2704);
						out.method179(field2410);
					}
				} else if ((field3297 == 1 || method676(menuNumEntries - 1)) && menuNumEntries > 2) {
					method968();
				} else if (menuNumEntries > 0) {
					method604(menuNumEntries - 1);
				}
				field1154 = 10;
				field3050 = 0;
			}
		}
		if (World.field105 != -1) {
			int var25 = World.field105;
			int var26 = World.field108;
			boolean var27 = method576(0, 0, localPlayer.field1962[0], var25, 0, true, 0, 0, localPlayer.field2009[0], var26, 0);
			if (var27) {
				field523 = field14;
				crossCycle = 0;
				field2967 = field2762;
				crossMode = 1;
			}
			World.field105 = -1;
		}
		if (field3050 == 1 && field1605 != null) {
			field3050 = 0;
			field2637 = true;
			field1605 = null;
		}
		method992();
		if (field1143 == -1) {
			method565();
			method575();
			method271();
		}
		if (field801 == 1 || field3050 == 1) {
			field3176++;
		}
		if (field3227 != -1) {
			method606(516, 34, 338, field3227, 4, 4);
		}
		if (field1648 != -1) {
			method606(743, 34, 466, field1648, 205, 553);
		} else if (field2397[field330] != -1) {
			method606(743, 34, 466, field2397[field330], 205, 553);
		}
		if (field2166 != -1) {
			method606(496, 34, 453, field2166, 357, 17);
		} else if (field2421 != -1) {
			method606(496, 34, 453, field2421, 357, 17);
		}
		if (field3227 != -1) {
			method606(516, -35, 338, field3227, 4, 4);
		}
		if (field1648 != -1) {
			method606(743, -35, 466, field1648, 205, 553);
		} else if (field2397[field330] != -1) {
			method606(743, -35, 466, field2397[field330], 205, 553);
		}
		if (field2166 != -1) {
			method606(496, -35, 453, field2166, 357, 17);
		} else if (field2421 != -1) {
			method606(496, -35, 453, field2421, 357, 17);
		}
		if (field3253 == -1 && field1387 == -1 && field1279 == -1) {
			if (field2673 > 0) {
				field2673--;
			}
		} else if (field57 > field2673) {
			field2673++;
			if (field2673 == field57) {
				if (field3253 != -1) {
					field2637 = true;
				}
				if (field1387 != -1) {
					field1055 = true;
				}
			}
		}
		method564();
		if (cinemaCam) {
			method189();
		}
		for (int var28 = 0; var28 < 5; var28++) {
			int var10002 = field1019[var28]++;
		}
		method482();
		int var29 = ClientMouseListener.method662();
		int var30 = ClientKeyboardListener.method382();
		if (var29 > 4500 && var30 > 4500) {
			field1750 = 250;
			ClientMouseListener.setIdleTimer(4000);
			out.method415(216);
		}
		field72++;
		field1528++;
		if (field1528 > 500) {
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x2) == 2) {
				field2409 += field185;
			}
			if ((var31 & 0x1) == 1) {
				field296 += field2148;
			}
			field1528 = 0;
			if ((var31 & 0x4) == 4) {
				field2766 += field317;
			}
		}
		if (field2409 < -55) {
			field185 = 2;
		}
		if (field72 > 500) {
			int var32 = (int) (Math.random() * 8.0D);
			if ((var32 & 0x1) == 1) {
				field2158 += field740;
			}
			if ((var32 & 0x2) == 2) {
				field2589 += field587;
			}
			field72 = 0;
		}
		if (field2409 > 55) {
			field185 = -2;
		}
		if (field296 < -50) {
			field2148 = 2;
		}
		if (field2158 < -60) {
			field740 = 2;
		}
		field1179++;
		if (field296 > 50) {
			field2148 = -2;
		}
		if (field2158 > 60) {
			field740 = -2;
		}
		if (field2766 < -40) {
			field317 = 1;
		}
		if (field2766 > 40) {
			field317 = -1;
		}
		if (field2589 < -20) {
			field587 = 1;
		}
		if (field2589 > 10) {
			field587 = -1;
		}
		if (field1179 > 50) {
			out.method415(13);
		}
		try {
			if (stream != null && out.pos > 0) {
				stream.write(out.pos, out.data);
				field1179 = 0;
				out.pos = 0;
			}
		} catch (IOException var33) {
			method960();
		}
	}

	@ObfuscatedName("r.a(I)V")
	public static void mapBuildLoop() {
		preventTimeout(false);
		mapLoadCount = 0;
		boolean var0 = true;
		for (int var1 = 0; var1 < field61.length; var1++) {
			if (field2291[var1] != -1 && field61[var1] == null) {
				field61[var1] = maps.method217(0, field2291[var1]);
				if (field61[var1] == null) {
					mapLoadCount++;
					var0 = false;
				}
			}
			if (field742[var1] != -1 && field2633[var1] == null) {
				field2633[var1] = maps.method221(field742[var1], 0, field2170[var1]);
				if (field2633[var1] == null) {
					mapLoadCount++;
					var0 = false;
				}
			}
		}
		if (!var0) {
			mapLoadState = 1;
			return;
		}
		boolean var2 = true;
		locModelLoadCount = 0;
		for (int var3 = 0; var3 < field61.length; var3++) {
			byte[] var4 = field2633[var3];
			if (var4 != null) {
				int var5 = (field1078[var3] & 0xFF) * 64 - field1408;
				int var6 = (field1078[var3] >> 8) * 64 - field806;
				if (field2773) {
					var6 = 10;
					var5 = 10;
				}
				var2 &= ClientBuild.checkLocations(var4, var6, var5);
			}
		}
		if (!var2) {
			mapLoadState = 2;
			return;
		}
		if (mapLoadState != 0) {
			messageBox(Text.field3252, true, Statics.field1133);
		}
		clearCaches();
		world.resetMap();
		System.gc();
		for (int var7 = 0; var7 < 4; var7++) {
			collision[var7].reset();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					ClientBuild.mapl[var8][var9][var10] = 0;
				}
			}
		}
		ClientBuild.init();
		int var11 = field61.length;
		BgSound.reset();
		preventTimeout(true);
		if (!field2773) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (field1078[var12] & 0xFF) * 64 - field1408;
				int var14 = (field1078[var12] >> 8) * 64 - field806;
				byte[] var15 = field61[var12];
				if (var15 != null) {
					ClientBuild.method487(collision, (field2604 - 6) * 8, var15, var14, var13, (field829 - 6) * 8);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (field1078[var16] >> 8) * 64 - field806;
				byte[] var18 = field61[var16];
				int var19 = (field1078[var16] & 0xFF) * 64 - field1408;
				if (var18 == null && field829 < 800) {
					ClientBuild.method989(var19, 64, 64, var17);
				}
			}
			preventTimeout(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = field2633[var20];
				if (var21 != null) {
					int var22 = (field1078[var20] >> 8) * 64 - field806;
					int var23 = (field1078[var20] & 0xFF) * 64 - field1408;
					ClientBuild.method535(var22, world, collision, var21, var23);
				}
			}
		}
		if (field2773) {
			for (int var24 = 0; var24 < 4; var24++) {
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						int var27 = ClientBuild.field908[var24][var25][var26];
						boolean var28 = false;
						if (var27 != -1) {
							int var29 = var27 >> 1 & 0x3;
							int var30 = var27 >> 14 & 0x3FF;
							int var31 = var27 >> 24 & 0x3;
							int var32 = var27 >> 3 & 0x7FF;
							int var33 = (var30 / 8 << 8) + (var32 / 8);
							for (int var34 = 0; var34 < field1078.length; var34++) {
								if (field1078[var34] == var33 && field61[var34] != null) {
									ClientBuild.method186(var26 * 8, (var30 & 0x7) * 8, var31, var24, var25 * 8, (var32 & 0x7) * 8, var29, field61[var34], collision);
									var28 = true;
									break;
								}
							}
						}
						if (!var28) {
							ClientBuild.method737(var26 * 8, var24, var25 * 8);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = ClientBuild.field908[0][var35][var36];
					if (var37 == -1) {
						ClientBuild.method989(var36 * 8, 8, 8, var35 * 8);
					}
				}
			}
			preventTimeout(true);
			for (int var38 = 0; var38 < 4; var38++) {
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = ClientBuild.field908[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 14 & 0x3FF;
							int var44 = var41 >> 1 & 0x3;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = (var43 / 8 << 8) + (var45 / 8);
							for (int var47 = 0; var47 < field1078.length; var47++) {
								if (field1078[var47] == var46 && field2633[var47] != null) {
									ClientBuild.method522((var43 & 0x7) * 8, world, var38, var44, var42, field2633[var47], var40 * 8, collision, (var45 & 0x7) * 8, var39 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		preventTimeout(true);
		clearCaches();
		ClientBuild.finishBuild(world, collision);
		preventTimeout(true);
		int var48 = ClientBuild.minusedlevel;
		if (minusedlevel < var48) {
			var48 = minusedlevel;
		}
		if (var48 < minusedlevel - 1) {
		}
		if (lowMem) {
			world.fillBaseLevel(ClientBuild.minusedlevel);
		} else {
			world.fillBaseLevel(0);
		}
		for (int var49 = 0; var49 < 104; var49++) {
			for (int var50 = 0; var50 < 104; var50++) {
				showObject(var50, var49);
			}
		}
		locChangePostBuildCorrect();
		LocType.field2322.clear();
		if (frame != null) {
			out.method415(121);
			out.p4(1057001181);
		}
		if (!field2773) {
			int var51 = (field2604 - 6) / 8;
			int var52 = (field829 - 6) / 8;
			int var53 = (field829 + 6) / 8;
			int var54 = (field2604 + 6) / 8;
			for (int var55 = var51 - 1; var55 <= var54 + 1; var55++) {
				for (int var56 = var52 - 1; var56 <= var53 + 1; var56++) {
					if (var51 > var55 || var55 > var54 || var56 < var52 || var56 > var53) {
						maps.updateCacheHint(JagString.join(new JagString[]{Statics.field2305, Statics.method502(var55), Statics.field477, Statics.method502(var56)}));
						maps.updateCacheHint(JagString.join(new JagString[]{Statics.field1259, Statics.method502(var55), Statics.field477, Statics.method502(var56)}));
					}
				}
			}
		}
		if (field1143 == -1) {
			setMainState(30);
		} else {
			setMainState(35);
		}
		ClientBuild.quit();
		out.method415(178);
		GameShell.doneslowupdate2();
	}

	@ObfuscatedName("rb.b(B)V")
	public static void locChangeDoQueue() {
		for (LocChange var0 = (LocChange) locChanges.head(); var0 != null; var0 = (LocChange) locChanges.next()) {
			if (var0.endTime > 0) {
				var0.endTime--;
			}
			if (var0.endTime != 0) {
				if (var0.startTime > 0) {
					var0.startTime--;
				}
				if (var0.startTime == 0 && var0.field700 >= 1 && var0.field699 >= 1 && var0.field700 <= 102 && var0.field699 <= 102 && (var0.field678 < 0 || ClientBuild.method741(var0.field691, var0.field678))) {
					locChangeUnchecked(var0.field699, var0.field678, var0.field700, var0.field691, var0.field696, var0.field688, var0.field679);
					var0.startTime = -1;
					if (var0.field689 == var0.field678 && var0.field689 == -1) {
						var0.unlink();
					} else if (var0.field689 == var0.field678 && var0.field696 == var0.field686 && var0.field697 == var0.field691) {
						var0.unlink();
					}
				}
			} else if (var0.field689 < 0 || ClientBuild.method741(var0.field697, var0.field689)) {
				locChangeUnchecked(var0.field699, var0.field689, var0.field700, var0.field697, var0.field686, var0.field688, var0.field679);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("ra.a(ILa;ZLa;)V")
	public static void messageBox(JagString arg0, boolean arg1, JagString arg2) {
		if (field2402) {
			field2402 = false;
			method943();
			Statics.method808();
			method901();
			Statics.method454();
			method880(field2828, p12, field236, field1864);
			method246(field330, field2397, field1648 == -1, -1);
			field1941 = true;
			field687 = true;
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
				Pix2D.fillRect(257 - var4 / 2, 152, var4, 11, 0);
			}
			p12.method209(arg2, 257, 163, 0);
			p12.method209(arg2, 256, 162, 16777215);
		}
		Statics.method44();
	}

	@ObfuscatedName("je.c(B)V")
	public static void method565() {
		if (field1587 != 0 || field3050 != 1) {
			return;
		}
		int var0 = field2762 - 575;
		int var1 = field14 - 4 - 5;
		if (var0 < 0 || var1 < 0 || var0 >= 146 || var1 >= 151) {
			return;
		}
		var1 -= 75;
		var0 -= 73;
		int var2 = field2158 + field2797 & 0x7FF;
		int var3 = Pix3D.field775[var2];
		int var4 = Pix3D.field778[var2];
		int var5 = (field2589 + 256) * var4 >> 8;
		int var6 = (field2589 + 256) * var3 >> 8;
		int var7 = var1 * var6 + var0 * var5 >> 11;
		int var8 = var1 * var5 - var0 * var6 >> 11;
		int var9 = localPlayer.field1972 + var7 >> 7;
		int var10 = localPlayer.field1963 - var8 >> 7;
		boolean var11 = method576(0, 0, localPlayer.field1962[0], var9, 0, true, 0, 0, localPlayer.field2009[0], var10, 1);
		if (!var11) {
			return;
		}
		out.p1(var0);
		out.p1(var1);
		out.method150(field2797);
		out.p1(57);
		out.p1(field2158);
		out.p1(field2589);
		out.p1(89);
		out.method150(localPlayer.field1972);
		out.method150(localPlayer.field1963);
		out.p1(Statics.field2809);
		out.p1(63);
		return;
	}

	@ObfuscatedName("mb.b(B)V")
	public static void method688() {
		while (true) {
			if (in.method407(psize) >= 11) {
				int var0 = in.method412(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (field2030[var0] == null) {
						field2030[var0] = new ClientPlayer();
						if (field1176[var0] != null) {
							field2030[var0].method43(field1176[var0]);
						}
						var1 = true;
					}
					field2758[field2939++] = var0;
					ClientPlayer var2 = field2030[var0];
					var2.field2008 = loopCycle;
					int var3 = in.method412(5);
					int var4 = in.method412(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = Statics.field644[in.method412(3)];
					if (var1) {
						var2.field1992 = var5;
					}
					int var6 = in.method412(1);
					int var7 = in.method412(1);
					if (var7 == 1) {
						field1348[field2027++] = var0;
					}
					var2.method729(localPlayer.field2009[0] + var4, var6 == 1, localPlayer.field1962[0] + var3);
					continue;
				}
			}
			in.method408();
			return;
		}
	}

	@ObfuscatedName("tb.a(IZ)V")
	public static void addPlayers(boolean arg0) {
		if (localPlayer.field1972 >> 7 == field941 && localPlayer.field1963 >> 7 == field2720) {
			field941 = 0;
		}
		int var1 = field2939;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3;
			ClientPlayer var4;
			if (arg0) {
				var3 = 33538048;
				var4 = localPlayer;
			} else {
				var3 = field2758[var2] << 14;
				var4 = field2030[field2758[var2]];
			}
			if (var4 != null && var4.method42()) {
				var4.field95 = false;
				int var5 = var4.field1972 >> 7;
				int var6 = var4.field1963 >> 7;
				if ((lowMem && field2939 > 50 || field2939 > 200) && !arg0 && var4.field2000 == var4.field1951) {
					var4.field95 = true;
				}
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var4.field73 == null || var4.field91 > loopCycle || loopCycle >= var4.field82) {
						if ((var4.field1972 & 0x7F) == 64 && (var4.field1963 & 0x7F) == 64) {
							if (Statics.field3015[var5][var6] == field2399) {
								continue;
							}
							Statics.field3015[var5][var6] = field2399;
						}
						var4.field84 = method712(minusedlevel, var4.field1972, var4.field1963);
						world.method90(minusedlevel, var4.field1972, var4.field1963, var4.field84, 60, var4, var4.field1992, var3, var4.field1979);
					} else {
						var4.field95 = false;
						var4.field84 = method712(minusedlevel, var4.field1972, var4.field1963);
						world.method68(minusedlevel, var4.field1972, var4.field1963, var4.field84, var4, var4.field1992, var3, var4.field66, var4.field89, var4.field70, var4.field97);
					}
				}
			}
		}
	}

	@ObfuscatedName("de.a(I)V")
	public static void method323() {
		for (int var0 = 0; var0 < field2027; var0++) {
			int var1 = field1348[var0];
			ClientNpc var2 = field2992[var1];
			int var3 = in.g1();
			if ((var3 & 0x1) != 0) {
				int var4 = in.method152();
				int var5 = in.method156();
				var2.method727(var5, loopCycle, var4);
				var2.field2013 = loopCycle + 300;
				var2.field2004 = in.method152();
				var2.field1975 = in.g1();
			}
			if ((var3 & 0x20) != 0) {
				var2.field1965 = in.method180();
				int var6 = in.method167();
				var2.field2003 = 0;
				var2.field1967 = (var6 & 0xFFFF) + loopCycle;
				var2.field1984 = var6 >> 16;
				var2.field2014 = 0;
				if (var2.field1967 > loopCycle) {
					var2.field2014 = -1;
				}
				if (var2.field1965 == 65535) {
					var2.field1965 = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				var2.field2011 = in.method137();
				if (var2.field2011 == 65535) {
					var2.field2011 = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				int var7 = in.method152();
				int var8 = in.g1();
				var2.method727(var8, loopCycle, var7);
				var2.field2013 = loopCycle + 300;
				var2.field2004 = in.method156();
				var2.field1975 = in.method156();
			}
			if ((var3 & 0x40) != 0) {
				var2.field1964 = in.method140();
				var2.field1952 = 100;
			}
			if ((var3 & 0x80) != 0) {
				var2.field3182 = NpcType.method864(in.method137());
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
				var2.field2022 = in.method137();
				var2.field1974 = in.method166();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = in.method137();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = in.method147();
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
		if (localPlayer == arg0 && (arg0.field1972 < 1536 || arg0.field1963 < 1536 || arg0.field1972 >= 11776 || arg0.field1963 >= 11776)) {
			arg0.field1965 = -1;
			arg0.field1981 = 0;
			arg0.field1986 = 0;
			arg0.field2015 = -1;
			arg0.field1972 = arg0.field1962[0] * 128 + arg0.field1970 * 64;
			arg0.field1963 = arg0.field2009[0] * 128 + arg0.field1970 * 64;
			arg0.method732();
		}
		if (loopCycle < arg0.field1986) {
			method835(arg0);
		} else if (arg0.field1981 < loopCycle) {
			method761(arg0);
		} else {
			method641(arg0);
		}
		method296(arg0);
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

	@ObfuscatedName("fc.b(II)V")
	public static void setMainState(int arg0) {
		if (state == arg0) {
			return;
		}
		if (state == 0) {
			method108();
		}
		if (arg0 == 20 || arg0 == 40) {
			loginWaitingTime = 0;
			loginFailCount = 0;
			loginStep = 0;
		}
		if (arg0 != 20 && arg0 != 40 && field1692 != null) {
			field1692.close();
			field1692 = null;
		}
		if (state == 25 || state == 40) {
			Statics.method1028();
			Pix2D.method920();
		}
		if (state == 25) {
			mapLoadCount = 0;
			mapLoadPrevCount = 1;
			locModelLoadCount = 0;
			locModelLoadPrevCount = 1;
			mapLoadState = 0;
		}
		if (arg0 == 35) {
			method525();
			TitleScreen.close();
			if (field187 == null) {
				field187 = PixMap.method875(503, 765, canvas);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			field187 = null;
			method525();
			TitleScreen.open(canvas, binary, sprites);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			field187 = null;
			TitleScreen.close();
			method297(canvas, sprites);
		}
		state = arg0;
		field2402 = true;
	}

	@ObfuscatedName("ga.a(IIII)V")
	public static void method423(int arg0, int arg1, int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			field2188 = -1;
			field1072 = -1;
			return;
		}
		int var3 = method712(minusedlevel, arg2, arg1) - arg0;
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

	@ObfuscatedName("kc.a(IIIIII)V")
	public static void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg3 - 32) * arg3 / arg1;
		field365[0].method329(arg2, arg4);
		field365[1].method329(arg2, arg4 + arg3 - 16);
		Pix2D.fillRect(arg2, arg4 + 16, 16, arg3 - 32, field2715);
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (arg3 - var5 - 32) * arg0 / (arg1 - arg3);
		Pix2D.fillRect(arg2, arg4 + var6 + 16, 16, var5, field495);
		Pix2D.method925(arg2, arg4 + var6 + 16, var5, field3226);
		Pix2D.method925(arg2 + 1, arg4 + var6 + 16, var5, field3226);
		Pix2D.method916(arg2, arg4 + var6 + 16, 16, field3226);
		Pix2D.method916(arg2, arg4 + var6 + 17, 16, field3226);
		Pix2D.method925(arg2 + 15, arg4 - -16 - -var6, var5, field2734);
		Pix2D.method925(arg2 + 14, var6 + 17 + arg4, var5 - 1, field2734);
		Pix2D.method916(arg2, arg4 + var6 + var5 + 15, 16, field2734);
		Pix2D.method916(arg2 + 1, arg4 - -var6 + var5 + 14, 15, field2734);
	}

	@ObfuscatedName("wa.a(IIIILh;)V")
	public static void method1035(int arg0, int arg1, int arg2, NpcType arg3) {
		if (menuNumEntries >= 400) {
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
			var4 = JagString.join(new JagString[]{var4, method390(localPlayer.field68, arg3.field1103), Statics.field1275, Text.field785, Statics.method502(arg3.field1103), Statics.field2601});
		}
		if (field475 == 1) {
			method398(arg2, Text.field584, arg1, arg0, 49, JagString.join(new JagString[]{Statics.field3177, Statics.field805, var4}));
		} else if (field594 != 1) {
			JagString[] var5 = arg3.field1086;
			if (field2934) {
				var5 = Statics.method905(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].method14(Text.field1522)) {
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
						method398(arg2, var5[var6], arg1, arg0, var7, JagString.join(new JagString[]{Statics.field2699, var4}));
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method14(Text.field1522)) {
						short var9 = 0;
						if (localPlayer.field68 < arg3.field1103) {
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
						method398(arg2, var5[var8], arg1, arg0, var10, JagString.join(new JagString[]{Statics.field2699, var4}));
					}
				}
			}
			method398(arg2, Text.field2805, arg1, arg0, 1001, JagString.join(new JagString[]{Statics.field2699, var4}));
		} else if ((Statics.field2846 & 0x2) == 2) {
			method398(arg2, Statics.field1523, arg1, arg0, 21, JagString.join(new JagString[]{Statics.field1384, Statics.field805, var4}));
			return;
		}
	}

	@ObfuscatedName("oa.a(I)V")
	public static void method752() {
		while (true) {
			if (in.method407(psize) >= 27) {
				int var0 = in.method412(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (field2992[var0] == null) {
						field2992[var0] = new ClientNpc();
						var1 = true;
					}
					ClientNpc var2 = field2992[var0];
					field677[field1341++] = var0;
					var2.field2008 = loopCycle;
					int var3 = Statics.field644[in.method412(3)];
					if (var1) {
						var2.field1992 = var3;
					}
					int var4 = in.method412(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = in.method412(5);
					int var6 = in.method412(1);
					if (var5 > 15) {
						var5 -= 32;
					}
					if (var6 == 1) {
						field1348[field2027++] = var0;
					}
					int var7 = in.method412(1);
					var2.field3182 = NpcType.method864(in.method412(13));
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
					var2.method729(localPlayer.field2009[0] + var5, var7 == 1, localPlayer.field1962[0] + var4);
					continue;
				}
			}
			in.method408();
			return;
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
			if (selfSlot == var4) {
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

	@ObfuscatedName("ta.c(ZI)V")
	public static void addNpcs(boolean arg0) {
		for (int var1 = 0; var1 < field1341; var1++) {
			ClientNpc var2 = field2992[field677[var1]];
			int var3 = (field677[var1] << 14) + 536870912;
			if (var2 != null && var2.method42() && arg0 == var2.field3182.field1107 && var2.field3182.method451()) {
				int var4 = var2.field1972 >> 7;
				int var5 = var2.field1963 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.field1970 == 1 && (var2.field1972 & 0x7F) == 64 && (var2.field1963 & 0x7F) == 64) {
						if (Statics.field3015[var4][var5] == field2399) {
							continue;
						}
						Statics.field3015[var4][var5] = field2399;
					}
					if (!var2.field3182.field1082) {
						var3 += Integer.MIN_VALUE;
					}
					world.method90(minusedlevel, var2.field1972, var2.field1963, method712(minusedlevel, (var2.field1970 - 1) * 64 + var2.field1972, var2.field1970 * 64 + var2.field1963 + -64), var2.field1970 * 64 + 60 - 64, var2, var2.field1992, var3, var2.field1979);
				}
			}
		}
	}

	@ObfuscatedName("nb.b(Z)V")
	public static void method728() {
		in.method417();
		int var0 = in.method412(1);
		if (var0 == 0) {
			return;
		}
		int var1 = in.method412(2);
		if (var1 == 0) {
			field1348[field2027++] = 2047;
		} else if (var1 == 1) {
			int var2 = in.method412(3);
			localPlayer.method725(var2, false);
			int var3 = in.method412(1);
			if (var3 == 1) {
				field1348[field2027++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = in.method412(3);
			localPlayer.method725(var4, true);
			int var5 = in.method412(3);
			localPlayer.method725(var5, true);
			int var6 = in.method412(1);
			if (var6 == 1) {
				field1348[field2027++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = in.method412(1);
			minusedlevel = in.method412(2);
			int var8 = in.method412(1);
			if (var8 == 1) {
				field1348[field2027++] = 2047;
			}
			int var9 = in.method412(7);
			int var10 = in.method412(7);
			localPlayer.method729(var10, var7 == 1, var9);
		}
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

	@ObfuscatedName("va.a(BII)V")
	public static void showObject(int arg0, int arg1) {
		LinkList var2 = groundObj[minusedlevel][arg1][arg0];
		if (var2 == null) {
			world.delObj(minusedlevel, arg1, arg0);
			return;
		}
		int var3 = -99999999;
		ClientObj var4 = null;
		for (ClientObj var5 = (ClientObj) var2.head(); var5 != null; var5 = (ClientObj) var2.next()) {
			ObjType var6 = ObjType.list(var5.id);
			int var7 = var6.cost;
			if (var6.stackable == 1) {
				var7 = (var5.count + 1) * var7;
			}
			if (var7 > var3) {
				var3 = var7;
				var4 = var5;
			}
		}
		if (var4 == null) {
			world.delObj(minusedlevel, arg1, arg0);
			return;
		}
		ClientObj var8 = null;
		ClientObj var9 = null;
		var2.pushFront(var4);
		for (ClientObj var10 = (ClientObj) var2.head(); var10 != null; var10 = (ClientObj) var2.next()) {
			if (var4.id != var10.id) {
				if (var9 == null) {
					var9 = var10;
				}
				if (var9.id != var10.id && var8 == null) {
					var8 = var10;
				}
			}
		}
		int var11 = (arg0 << 7) + arg1 + 1610612736;
		world.setObj(minusedlevel, arg1, arg0, method712(minusedlevel, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var9, var8);
	}

	@ObfuscatedName("la.a(ILnb;)V")
	public static void method641(ClientEntity arg0) {
		if (loopCycle == arg0.field1981 || arg0.field2015 == -1 || arg0.field1996 != 0 || arg0.field1989 + 1 > SeqType.method103(arg0.field2015).field1223[arg0.field1978]) {
			int var1 = arg0.field1981 - arg0.field1986;
			int var2 = loopCycle - arg0.field1986;
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

	@ObfuscatedName("m.a(IIII)V")
	public static void method673(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			out.method415(111);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 2) {
			out.method415(9);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 3) {
			out.method415(193);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 4) {
			out.method415(53);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 5) {
			out.method415(94);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 6) {
			out.method415(213);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 7) {
			out.method415(46);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 8) {
			out.method415(130);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 9) {
			out.method415(157);
			out.p4(arg2);
			out.method150(arg0);
		}
		if (arg1 == 10) {
			out.method415(84);
			out.p4(arg2);
			out.method150(arg0);
		}
	}

	@ObfuscatedName("k.a(IIIIBIZIIIII)Z")
	public static boolean method576(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				field2759[var11][var12] = 0;
				field2577[var11][var12] = 99999999;
			}
		}
		field2759[arg2][arg8] = 99;
		byte var13 = 0;
		int var14 = arg8;
		boolean var15 = false;
		int var16 = 0;
		field2577[arg2][arg8] = 0;
		int var17 = arg2;
		field1351[0] = arg2;
		int var35 = var13 + 1;
		field546[0] = arg8;
		int var18 = field1351.length;
		int[][] var19 = collision[minusedlevel].field201;
		while (var35 != var16) {
			var14 = field546[var16];
			var17 = field1351[var16];
			var16 = (var16 + 1) % var18;
			if (arg3 == var17 && arg9 == var14) {
				var15 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && collision[minusedlevel].method119(var17, arg4 - 1, arg9, var14, arg6, arg3)) {
					var15 = true;
					break;
				}
				if (arg4 < 10 && collision[minusedlevel].method122(arg9, arg6, var14, arg3, var17, arg4 - 1)) {
					var15 = true;
					break;
				}
			}
			if (arg0 != 0 && arg7 != 0 && collision[minusedlevel].method117(arg7, arg3, arg0, arg9, arg1, var14, var17)) {
				var15 = true;
				break;
			}
			int var20 = field2577[var17][var14] + 1;
			if (var17 > 0 && field2759[var17 - 1][var14] == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0) {
				field1351[var35] = var17 - 1;
				field546[var35] = var14;
				var35 = (var35 + 1) % var18;
				field2759[var17 - 1][var14] = 2;
				field2577[var17 - 1][var14] = var20;
			}
			if (var17 < 103 && field2759[var17 + 1][var14] == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0) {
				field1351[var35] = var17 + 1;
				field546[var35] = var14;
				var35 = (var35 + 1) % var18;
				field2759[var17 + 1][var14] = 8;
				field2577[var17 + 1][var14] = var20;
			}
			if (var14 > 0 && field2759[var17][var14 - 1] == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				field1351[var35] = var17;
				field546[var35] = var14 - 1;
				field2759[var17][var14 - 1] = 1;
				var35 = (var35 + 1) % var18;
				field2577[var17][var14 - 1] = var20;
			}
			if (var14 < 103 && field2759[var17][var14 + 1] == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				field1351[var35] = var17;
				field546[var35] = var14 + 1;
				field2759[var17][var14 + 1] = 4;
				field2577[var17][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 > 0 && var14 > 0 && field2759[var17 - 1][var14 - 1] == 0 && (var19[var17 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				field1351[var35] = var17 - 1;
				field546[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				field2759[var17 - 1][var14 - 1] = 3;
				field2577[var17 - 1][var14 - 1] = var20;
			}
			if (var17 < 103 && var14 > 0 && field2759[var17 + 1][var14 - 1] == 0 && (var19[var17 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				field1351[var35] = var17 + 1;
				field546[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				field2759[var17 + 1][var14 - 1] = 9;
				field2577[var17 + 1][var14 - 1] = var20;
			}
			if (var17 > 0 && var14 < 103 && field2759[var17 - 1][var14 + 1] == 0 && (var19[var17 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				field1351[var35] = var17 - 1;
				field546[var35] = var14 + 1;
				field2759[var17 - 1][var14 + 1] = 6;
				field2577[var17 - 1][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 < 103 && var14 < 103 && field2759[var17 + 1][var14 + 1] == 0 && (var19[var17 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				field1351[var35] = var17 + 1;
				field546[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				field2759[var17 + 1][var14 + 1] = 12;
				field2577[var17 + 1][var14 + 1] = var20;
			}
		}
		Statics.field2809 = 0;
		if (!var15) {
			if (!arg5) {
				return false;
			}
			int var21 = 1000;
			int var22 = 100;
			for (int var23 = arg3 - 10; var23 <= arg3 + 10; var23++) {
				for (int var24 = arg9 - 10; var24 <= arg9 + 10; var24++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && field2577[var23][var24] < 100) {
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
						if (var21 > var27 || var21 == var27 && field2577[var23][var24] < var22) {
							var14 = var24;
							var21 = var27;
							var17 = var23;
							var22 = field2577[var23][var24];
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
			Statics.field2809 = 1;
		}
		byte var28 = 0;
		field1351[0] = var17;
		int var36 = var28 + 1;
		field546[0] = var14;
		int var29;
		int var30 = var29 = field2759[var17][var14];
		while (arg2 != var17 || arg8 != var14) {
			if (var29 != var30) {
				var29 = var30;
				field1351[var36] = var17;
				field546[var36++] = var14;
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
			var30 = field2759[var17][var14];
		}
		if (var36 > 0) {
			int var31 = var36;
			if (var36 > 25) {
				var31 = 25;
			}
			var36--;
			int var32 = field546[var36];
			int var33 = field1351[var36];
			if (arg10 == 0) {
				out.method415(73);
				out.p1(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				out.method415(236);
				out.p1(var31 + var31 + 14 + 3);
			}
			if (arg10 == 2) {
				out.method415(89);
				out.p1(var31 + var31 + 3);
			}
			out.method162(var32 + field1408);
			out.method172(field1488[82] ? 1 : 0);
			out.method162(field806 + var33);
			field941 = field1351[0];
			field2720 = field546[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				out.method165(field1351[var36] - var33);
				out.method172(field546[var36] - var32);
			}
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("he.a(IIBI)Z")
	public static boolean method491(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 14 & 0x7FFF;
		int var4 = world.method97(minusedlevel, arg0, arg2, arg1);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 >> 6 & 0x3;
		int var6 = var4 & 0x1F;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LocType var7 = LocType.list(var3);
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
			method576(var10, var8, localPlayer.field1962[0], arg0, 0, true, 0, var9, localPlayer.field2009[0], arg2, 2);
		} else {
			method576(0, 0, localPlayer.field1962[0], arg0, var6 + 1, true, var5, 0, localPlayer.field2009[0], arg2, 2);
		}
		field2967 = field2762;
		crossMode = 2;
		field523 = field14;
		crossCycle = 0;
		return true;
	}

	@ObfuscatedName("cc.a(IZILaa;I)V")
	public static void method272(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (localPlayer == arg2 || menuNumEntries >= 400) {
			return;
		}
		JagString var4;
		if (arg2.field65 == 0) {
			var4 = JagString.join(new JagString[]{arg2.field86, method390(localPlayer.field68, arg2.field68), Statics.field1275, Text.field785, Statics.method502(arg2.field68), Statics.field2601});
		} else {
			var4 = JagString.join(new JagString[]{arg2.field86, Statics.field1275, Text.field1392, Statics.method502(arg2.field65), Statics.field2601});
		}
		if (field475 == 1) {
			method398(arg3, Text.field584, arg0, arg1, 22, JagString.join(new JagString[]{Statics.field3177, Statics.field1500, var4}));
		} else if (field594 != 1) {
			for (int var5 = 4; var5 >= 0; var5--) {
				if (playerOp[var5] != null) {
					int var6 = 0;
					short var7 = 0;
					if (playerOp[var5].method14(Text.field1522)) {
						if (localPlayer.field68 < arg2.field68) {
							var7 = 2000;
						}
						if (localPlayer.field74 != 0 && arg2.field74 != 0) {
							if (localPlayer.field74 == arg2.field74) {
								var7 = 2000;
							} else {
								var7 = 0;
							}
						}
					} else if (playerOpPriority[var5]) {
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
					method398(arg3, playerOp[var5], arg0, arg1, var6, JagString.join(new JagString[]{Statics.field1393, var4}));
				}
			}
		} else if ((Statics.field2846 & 0x8) == 8) {
			method398(arg3, Statics.field1523, arg0, arg1, 1, JagString.join(new JagString[]{Statics.field1384, Statics.field1500, var4}));
		}
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			if (field1932[var8] == 7) {
				field2586[var8] = JagString.join(new JagString[]{Text.field3057, Text.field2337, Statics.field1393, var4});
				return;
			}
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
					var6 = field724[var2[var4++]];
				}
				if (var8 == 2) {
					var6 = Statics.field549[var2[var4++]];
				}
				if (var8 == 3) {
					var6 = Statics.field1483[var2[var4++]];
				}
				if (var8 == 17) {
					var7 = 3;
				}
				if (var8 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					IfType var11 = IfType.method1053(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!ObjType.list(var12).field2880 || memServer)) {
						for (int var13 = 0; var13 < var11.field2491.length; var13++) {
							if (var12 + 1 == var11.field2491[var13]) {
								var6 += var11.field2516[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var6 = VarCache.field2803[var2[var4++]];
				}
				if (var8 == 6) {
					var6 = Statics.field1514[Statics.field549[var2[var4++]] - 1];
				}
				if (var8 == 7) {
					var6 = VarCache.field2803[var2[var4++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var6 = localPlayer.field68;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Statics.field1190[var14]) {
							var6 += Statics.field549[var14];
						}
					}
				}
				if (var8 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					IfType var17 = IfType.method1053(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!ObjType.list(var18).field2880 || memServer)) {
						for (int var19 = 0; var19 < var17.field2491.length; var19++) {
							if (var18 + 1 == var17.field2491[var19]) {
								var6 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var6 = field2962;
				}
				if (var8 == 12) {
					var6 = field2638;
				}
				if (var8 == 13) {
					int var20 = VarCache.field2803[var2[var4++]];
					int var21 = var2[var4++];
					var6 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var22 = var2[var4++];
					var6 = VarCache.method480(var22);
				}
				if (var8 == 18) {
					var6 = (localPlayer.field1972 >> 7) + field806;
				}
				if (var8 == 19) {
					var6 = (localPlayer.field1963 >> 7) + field1408;
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

	@ObfuscatedName("nb.b(IIIIII)V")
	public static void method731(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (field2604 == arg2 && field829 == arg1 && (ClientBuild.field1472 == arg4 || !lowMem)) {
			return;
		}
		ClientBuild.field1472 = arg4;
		field2604 = arg2;
		if (!lowMem) {
			ClientBuild.field1472 = 0;
		}
		field829 = arg1;
		setMainState(25);
		messageBox(Text.field3252, false, null);
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
		minusedlevel = arg4;
		byte var15 = 0;
		localPlayer.method729(arg3, false, arg0);
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
						groundObj[var25][var21][var22] = groundObj[var25][var23][var24];
					} else {
						groundObj[var25][var21][var22] = null;
					}
				}
			}
		}
		for (LocChange var26 = (LocChange) locChanges.head(); var26 != null; var26 = (LocChange) locChanges.next()) {
			var26.field699 -= var8;
			var26.field700 -= var7;
			if (var26.field700 < 0 || var26.field699 < 0 || var26.field700 >= 104 || var26.field699 >= 104) {
				var26.unlink();
			}
		}
		field305 = -1;
		if (field941 != 0) {
			field941 -= var7;
			field2720 -= var8;
		}
		cinemaCam = false;
		field965 = 0;
		field2756.clear();
		field2160.clear();
	}

	@ObfuscatedName("cc.g(I)I")
	public static int method273() {
		int var0 = method712(minusedlevel, field709, field1200);
		return var0 - field1748 >= 800 || (ClientBuild.mapl[minusedlevel][field709 >> 7][field1200 >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("d.d(B)I")
	public static int method298() {
		int var0 = 3;
		if (field1400 < 310) {
			int var1 = field1200 >> 7;
			int var2 = field709 >> 7;
			if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
				var0 = minusedlevel;
			}
			int var3 = localPlayer.field1972 >> 7;
			int var4 = localPlayer.field1963 >> 7;
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
					if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					if (var8 >= 65536) {
						if (var2 < var3) {
							var2++;
						} else if (var3 < var2) {
							var2--;
						}
						var8 -= 65536;
						if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
							var0 = minusedlevel;
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
					if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var4 > var1) {
							var1++;
						} else if (var1 > var4) {
							var1--;
						}
						if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
							var0 = minusedlevel;
						}
					}
				}
			}
		}
		if ((ClientBuild.mapl[minusedlevel][localPlayer.field1972 >> 7][localPlayer.field1963 >> 7] & 0x4) != 0) {
			var0 = minusedlevel;
		}
		return var0;
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

	@ObfuscatedName("n.a(BIII)I")
	public static int method712(int arg0, int arg1, int arg2) {
		int var3 = arg2 >> 7;
		int var4 = arg1 >> 7;
		if (var4 < 0 || var3 < 0 || var4 > 103 || var3 > 103) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg0;
		if (arg0 < 3 && (ClientBuild.mapl[1][var4][var3] & 0x2) == 2) {
			var6 = arg0 + 1;
		}
		int var7 = (128 - var5) * ClientBuild.groundh[var6][var4][var3] + ClientBuild.groundh[var6][var4 + 1][var3] * var5 >> 7;
		int var8 = arg2 & 0x7F;
		int var9 = (128 - var5) * ClientBuild.groundh[var6][var4][var3 + 1] + ClientBuild.groundh[var6][var4 + 1][var3 + 1] * var5 >> 7;
		return (128 - var8) * var7 + var8 * var9 >> 7;
	}

	@ObfuscatedName("k.d(B)V")
	public static void method578() {
		if (field96 == 2) {
			method423(Statics.field1114 * 2, (field226 - field1408 << 7) + Statics.field1857, (-field806 + Statics.field3304 << 7) - -field2572);
			if (field1072 > -1 && loopCycle % 20 < 10) {
				field1886[0].plotSprite(field1072 - 12, field2188 + -28);
			}
		}
	}

	@ObfuscatedName("qb.a(I)V")
	public static void method847() {
		if (stream != null) {
			stream.close();
			stream = null;
		}
		clearCaches();
		world.resetMap();
		for (int var0 = 0; var0 < 4; var0++) {
			collision[var0].reset();
		}
		System.gc();
		Statics.method672();
		field1860 = 0;
		field3037 = -1;
		BgSound.reset();
		setMainState(10);
	}

	@ObfuscatedName("ia.a(IZIIIIIIII)V")
	public static void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) locChanges.head(); var10 != null; var10 = (LocChange) locChanges.next()) {
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
			locChangeSetOld(var9);
			locChanges.push(var9);
		}
		var9.field678 = arg0;
		var9.endTime = arg3;
		var9.startTime = arg8;
		var9.field696 = arg2;
		var9.field691 = arg7;
	}

	@ObfuscatedName("se.a(Z)V")
	public static void method932() {
		Statics.field410 = true;
		method473();
		if (field1001) {
			b12.method209(Statics.field3230, 239, 40, 0);
			b12.method209(JagString.join(new JagString[]{Statics.field3232, Statics.field989}), 239, 60, 128);
		} else if (field2811 == 1) {
			b12.method209(Text.field2576, 239, 40, 0);
			b12.method209(JagString.join(new JagString[]{Statics.field3210, Statics.field989}), 239, 60, 128);
		} else if (field2811 == 2) {
			b12.method209(Text.field1203, 239, 40, 0);
			b12.method209(JagString.join(new JagString[]{Statics.field3210, Statics.field989}), 239, 60, 128);
		} else if (field2811 == 3) {
			if (Statics.field3210 != Statics.field3209) {
				method537(Statics.field3210);
				Statics.field3209 = Statics.field3210;
			}
			PixFont var15 = p12;
			Pix2D.method912(0, 0, 463, 77);
			for (int var16 = 0; var16 < field2330; var16++) {
				int var17 = var16 * 14 + 18 - field1390;
				if (var17 > 0 && var17 < 110) {
					var15.method209(Statics.field1017[var16], 239, var17, 0);
				}
			}
			Pix2D.method919();
			if (field2330 > 5) {
				method601(field1390, field2330 * 14 + 7, 463, 77, 0);
			}
			if (Statics.field3210.method10() == 0) {
				b12.method209(Text.field1874, 239, 40, 255);
			} else if (field2330 == 0) {
				b12.method209(Text.field1449, 239, 40, 0);
			}
			var15.method209(JagString.join(new JagString[]{Statics.field3210, Statics.field989}), 239, 90, 0);
			Pix2D.method916(0, 77, 479, 0);
		} else if (field1605 != null) {
			b12.method209(field1605, 239, 40, 0);
			b12.method209(Text.field1819, 239, 60, 128);
		} else if (field2166 != -1) {
			boolean var14 = method478(field2166, 96, 2, 479);
			if (!var14) {
				field2637 = true;
			}
		} else if (field2421 == -1) {
			int var1 = 0;
			PixFont var2 = p12;
			Pix2D.method912(0, 0, 463, 77);
			for (int var3 = 0; var3 < 100; var3++) {
				if (field2034[var3] != null) {
					int var4 = Statics.field3236[var3];
					JagString var5 = Statics.field3130[var3];
					int var6 = field1340 + 70 - var1 * 14;
					byte var7 = 0;
					if (var5 != null && var5.method26(Statics.field2612)) {
						var5 = var5.method1(5);
						var7 = 1;
					}
					if (var5 != null && var5.method26(Statics.field2535)) {
						var5 = var5.method1(5);
						var7 = 2;
					}
					if (var4 == 0) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(field2034[var3], 4, var6, 0);
						}
					}
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1864 == 0 || field1864 == 1 && Statics.method242(var5))) {
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
							var2.drawString(JagString.join(new JagString[]{var5, Statics.field2165}), var8, var6, 0);
							int var9 = var8 + var2.method208(var5) + 8;
							var2.drawString(field2034[var3], var9, var6, 255);
						}
						var1++;
					}
					if ((var4 == 3 || var4 == 7) && field216 == 0 && (var4 == 7 || field236 == 0 || field236 == 1 && Statics.method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(Text.field1215, 4, var6, 0);
							int var10 = var2.method208(Text.field1215) + 4;
							int var11 = var10 + var2.method212(32);
							if (var7 == 1) {
								field2614[0].method329(var11, var6 - 12);
								var11 += 14;
							}
							if (var7 == 2) {
								field2614[1].method329(var11, var6 - 12);
								var11 += 14;
							}
							var2.drawString(JagString.join(new JagString[]{var5, Statics.field2165}), var11, var6, 0);
							int var12 = var11 + var2.method208(var5) + 8;
							var2.drawString(field2034[var3], var12, var6, 8388608);
						}
					}
					if (var4 == 4 && (field2828 == 0 || field2828 == 1 && Statics.method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{var5, Statics.field2406, field2034[var3]}), 4, var6, 8388736);
						}
					}
					if (var4 == 5 && field216 == 0 && field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(field2034[var3], 4, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 6 && field216 == 0 && field236 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{Text.field521, Statics.field2406, var5, Statics.field2165}), 4, var6, 0);
							var2.drawString(field2034[var3], var2.method208(JagString.join(new JagString[]{Text.field521, Statics.field2406, var5})) + 12, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 8 && (field2828 == 0 || field2828 == 1 && Statics.method242(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{var5, Statics.field2406, field2034[var3]}), 4, var6, 8270336);
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
			if (localPlayer == null || localPlayer.field86 == null) {
				var13 = TitleScreen.loginUser;
			} else {
				var13 = localPlayer.field86;
			}
			var2.drawString(JagString.join(new JagString[]{var13, Statics.field2165}), 4, 90, 0);
			var2.drawString(JagString.join(new JagString[]{Statics.field3223, Statics.field989}), var2.method208(JagString.join(new JagString[]{var13, Statics.field1065})) + 6, 90, 255);
			Pix2D.method916(0, 77, 479, 0);
		} else {
			boolean var0 = method478(field2421, 96, 3, 479);
			if (!var0) {
				field2637 = true;
			}
		}
		if (isMenuOpen && field640 == 2) {
			drawMinimenu();
		}
		Statics.method808();
	}

	@ObfuscatedName("bb.a(BLqd;)Z")
	public static boolean method190(IfType arg0) {
		int var1 = arg0.field2445;
		if (field701 == 2) {
			if (var1 == 201) {
				field1924 = 1;
				Statics.field3230 = Text.field2546;
				field1001 = true;
				field2811 = 0;
				Statics.field3232 = Statics.field3234;
				field2637 = true;
			}
			if (var1 == 202) {
				field1924 = 2;
				Statics.field3230 = Text.field738;
				field2637 = true;
				field2811 = 0;
				field1001 = true;
				Statics.field3232 = Statics.field3234;
			}
		}
		if (var1 == 205) {
			field1750 = 250;
			return true;
		}
		if (var1 == 501) {
			field2811 = 0;
			field1924 = 4;
			field2637 = true;
			Statics.field3230 = Text.field2602;
			Statics.field3232 = Statics.field3234;
			field1001 = true;
		}
		if (var1 == 502) {
			field2637 = true;
			field2811 = 0;
			field1924 = 5;
			field1001 = true;
			Statics.field3232 = Statics.field3234;
			Statics.field3230 = Text.field720;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = (var1 - 300) / 2;
			int var3 = var1 & 0x1;
			idkDesign.method642(var2, var3 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = (var1 - 314) / 2;
			int var5 = var1 & 0x1;
			idkDesign.method644(var5 == 1, var4);
		}
		if (var1 == 324) {
			idkDesign.method643(false);
		}
		if (var1 == 325) {
			idkDesign.method643(true);
		}
		if (var1 == 326) {
			out.method415(231);
			idkDesign.method635(out);
			return true;
		}
		if (var1 == 620) {
			Statics.field3268 = !Statics.field3268;
		}
		if (var1 >= 601 && var1 <= 613) {
			method413();
			if (Statics.field3217.method10() > 0) {
				out.method415(202);
				out.p8(Statics.field3217.toUserhash());
				out.p1(var1 - 601);
				out.p1(Statics.field3268 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("vc.b(Z)V")
	public static void method1019() {
		int var0 = -1;
		if (field475 == 0 && field594 == 0) {
			method398(0, Text.field3057, ClientMouseListener.field2568, ClientMouseListener.field741, 7, Statics.field3234);
		}
		for (int var1 = 0; var1 < Model.field2261; var1++) {
			int var2 = Model.field2252[var1];
			int var3 = var2 & 0x7F;
			int var4 = var2 >> 7 & 0x7F;
			int var5 = var2 >> 29 & 0x3;
			int var6 = var2 >> 14 & 0x7FFF;
			if (var0 != var2) {
				var0 = var2;
				if (var5 == 2 && world.method97(minusedlevel, var3, var4, var2) >= 0) {
					LocType var7 = LocType.list(var6);
					if (var7.multiloc != null) {
						var7 = var7.method516();
					}
					if (var7 == null) {
						continue;
					}
					if (field475 == 1) {
						method398(var2, Text.field584, var4, var3, 5, JagString.join(new JagString[]{Statics.field3177, Statics.field524, var7.field1332}));
					} else if (field594 != 1) {
						JagString[] var8 = var7.field1291;
						if (field2934) {
							var8 = Statics.method905(var8);
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
									method398(var2, var8[var9], var4, var3, var10, JagString.join(new JagString[]{Statics.field3136, var7.field1332}));
								}
							}
						}
						method398(var7.field1321 << 14, Text.field2805, var4, var3, 1004, JagString.join(new JagString[]{Statics.field3136, var7.field1332}));
					} else if ((Statics.field2846 & 0x4) == 4) {
						method398(var2, Statics.field1523, var4, var3, 32, JagString.join(new JagString[]{Statics.field1384, Statics.field524, var7.field1332}));
					}
				}
				if (var5 == 1) {
					ClientNpc var11 = field2992[var6];
					if (var11.field3182.field1084 == 1 && (var11.field1972 & 0x7F) == 64 && (var11.field1963 & 0x7F) == 64) {
						for (int var12 = 0; var12 < field1341; var12++) {
							ClientNpc var13 = field2992[field677[var12]];
							if (var13 != null && var11 != var13 && var13.field3182.field1084 == 1 && var11.field1972 == var13.field1972 && var11.field1963 == var13.field1963) {
								method1035(var3, var4, field677[var12], var13.field3182);
							}
						}
						for (int var14 = 0; var14 < field2939; var14++) {
							ClientPlayer var15 = field2030[field2758[var14]];
							if (var15 != null && var11.field1972 == var15.field1972 && var11.field1963 == var15.field1963) {
								method272(var4, var3, var15, field2758[var14]);
							}
						}
					}
					method1035(var3, var4, var6, var11.field3182);
				}
				if (var5 == 0) {
					ClientPlayer var16 = field2030[var6];
					if ((var16.field1972 & 0x7F) == 64 && (var16.field1963 & 0x7F) == 64) {
						for (int var17 = 0; var17 < field1341; var17++) {
							ClientNpc var18 = field2992[field677[var17]];
							if (var18 != null && var18.field3182.field1084 == 1 && var16.field1972 == var18.field1972 && var16.field1963 == var18.field1963) {
								method1035(var3, var4, field677[var17], var18.field3182);
							}
						}
						for (int var19 = 0; var19 < field2939; var19++) {
							ClientPlayer var20 = field2030[field2758[var19]];
							if (var20 != null && var16 != var20 && var16.field1972 == var20.field1972 && var16.field1963 == var20.field1963) {
								method272(var4, var3, var20, field2758[var19]);
							}
						}
					}
					method272(var4, var3, var16, var6);
				}
				if (var5 == 3) {
					LinkList var21 = groundObj[minusedlevel][var3][var4];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.tail(); var22 != null; var22 = (ClientObj) var21.prev()) {
							ObjType var23 = ObjType.list(var22.id);
							if (field475 == 1) {
								method398(var22.id, Text.field584, var4, var3, 47, JagString.join(new JagString[]{Statics.field3177, Statics.field328, var23.field2827}));
							} else if (field594 != 1) {
								JagString[] var24 = var23.field2835;
								if (field2934) {
									var24 = Statics.method905(var24);
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
										method398(var22.id, var24[var25], var4, var3, var26, JagString.join(new JagString[]{field2334, var23.field2827}));
									} else if (var25 == 2) {
										method398(var22.id, Text.field1594, var4, var3, 3, JagString.join(new JagString[]{field2334, var23.field2827}));
									}
								}
								method398(var22.id, Text.field2805, var4, var3, 1003, JagString.join(new JagString[]{field2334, var23.field2827}));
							} else if ((Statics.field2846 & 0x1) == 1) {
								method398(var22.id, Statics.field1523, var4, var3, 15, JagString.join(new JagString[]{Statics.field1384, Statics.field328, var23.field2827}));
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pb.e(I)V")
	public static void method810() {
		if (lowMem && ClientBuild.field1472 != minusedlevel) {
			method731(localPlayer.field1962[0], field829, field2604, localPlayer.field2009[0], minusedlevel);
		} else if (field305 != minusedlevel) {
			field305 = minusedlevel;
			method472(minusedlevel);
		}
	}

	@ObfuscatedName("fc.a(ILjd;II)V")
	public static void method400(int arg0, Pix32 arg1, int arg2) {
		int var3 = arg0 * arg0 + arg2 * arg2;
		if (var3 <= 4225 || var3 >= 90000) {
			method387(arg2, arg0, arg1);
			return;
		}
		int var4 = field2158 + field2797 & 0x7FF;
		int var5 = Model.field2256[var4];
		int var6 = Model.field2258[var4];
		int var7 = var5 * 256 / (field2589 + 256);
		int var8 = var6 * 256 / (field2589 + 256);
		int var9 = arg2 * var8 - arg0 * var7 >> 16;
		int var10 = arg0 * var8 + arg2 * var7 >> 16;
		double var11 = Math.atan2((double) var10, (double) var9);
		int var13 = (int) (Math.sin(var11) * 63.0D);
		int var14 = (int) (Math.cos(var11) * 57.0D);
		field784.method559(var13 + 4 + 94 - 10, -var14 + 83 + -20, var11);
	}

	@ObfuscatedName("kc.a(II)V")
	public static void method604(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = field994[arg0];
		int var2 = field2925[arg0];
		int var3 = field1932[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = field1770[arg0];
		if (field2811 != 0 && var3 != 1005) {
			field2811 = 0;
			field2637 = true;
		}
		if (var3 == 37) {
			out.method415(21);
			out.method170(Statics.field2949);
			out.method179(var2);
			out.method150(var4);
			out.method150(var1);
			field656 = 2;
			field2649 = var1;
			field1154 = 0;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			Statics.field1679 = var2;
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 38) {
			boolean var5 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var5) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			crossCycle = 0;
			field523 = field14;
			field2967 = field2762;
			crossMode = 2;
			out.method415(190);
			out.method154(var1 + field806);
			out.method150(var4);
			out.method150(field1408 + var2);
		}
		if (var3 == 1004) {
			field523 = field14;
			field2967 = field2762;
			crossMode = 2;
			crossCycle = 0;
			out.method415(148);
			out.method162(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 27) {
			method491(var1, var4, var2);
			out.method415(229);
			out.method162(field806 + var1);
			out.method162(var4 >> 14 & 0x7FFF);
			out.method162(field1408 + var2);
		}
		if (var3 == 1) {
			ClientPlayer var7 = field2030[var4];
			if (var7 != null) {
				method576(1, 0, localPlayer.field1962[0], var7.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var7.field2009[0], 2);
				field2967 = field2762;
				crossCycle = 0;
				crossMode = 2;
				field523 = field14;
				out.method415(221);
				out.method163(Statics.field2949);
				out.method162(var4);
			}
		}
		if (var3 == 26 || var3 == 46) {
			JagString var8 = field2586[arg0];
			int var9 = var8.method11(Statics.field1393);
			if (var9 != -1) {
				JagString var10 = var8.method1(var9 + 5).method40();
				JagString var11 = var10.method13().method36();
				boolean var12 = false;
				for (int var13 = 0; var13 < field2939; var13++) {
					ClientPlayer var14 = field2030[field2758[var13]];
					if (var14 != null && var14.field86 != null && var14.field86.method14(var11)) {
						var12 = true;
						method576(1, 0, localPlayer.field1962[0], var14.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var14.field2009[0], 2);
						if (var3 == 26) {
							out.method415(96);
							out.method169(field2758[var13]);
						}
						if (var3 == 46) {
							out.method415(68);
							out.method162(field2758[var13]);
						}
						break;
					}
				}
				if (!var12) {
					method758(0, JagString.join(new JagString[]{Text.field718, var11}), Statics.field3234);
				}
			}
		}
		if (var3 == 55) {
			out.method415(26);
			out.method169(var1);
			out.method170(var2);
			out.method169(var4);
			Statics.field1679 = var2;
			field1154 = 0;
			field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 53) {
			out.method415(38);
			out.method169(var4);
			out.method162(var1);
			out.method163(var2);
			field2649 = var1;
			field656 = 2;
			field1154 = 0;
			Statics.field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 57) {
			out.method415(64);
			out.p4(var2);
			IfType var15 = IfType.method1053(var2);
			if (var15.field2554 != null && var15.field2554[0][0] == 5) {
				int var16 = var15.field2554[0][1];
				if (VarCache.field2803[var16] != var15.field2499[0]) {
					VarCache.field2803[var16] = var15.field2499[0];
					method476(var16);
					field1055 = true;
				}
			}
		}
		if (var3 == 52) {
			out.method415(240);
			out.method154(var1);
			out.method162(var4);
			out.method179(var2);
			field2649 = var1;
			Statics.field1679 = var2;
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 10) {
			ClientPlayer var17 = field2030[var4];
			if (var17 != null) {
				method576(1, 0, localPlayer.field1962[0], var17.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var17.field2009[0], 2);
				field2967 = field2762;
				crossMode = 2;
				field523 = field14;
				crossCycle = 0;
				out.method415(68);
				out.method162(var4);
			}
		}
		if (var3 == 14) {
			ClientPlayer var18 = field2030[var4];
			if (var18 != null) {
				method576(1, 0, localPlayer.field1962[0], var18.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var18.field2009[0], 2);
				crossCycle = 0;
				crossMode = 2;
				field523 = field14;
				field2967 = field2762;
				out.method415(96);
				out.method169(var4);
			}
		}
		if (var3 == 1001) {
			field2967 = field2762;
			crossMode = 2;
			field523 = field14;
			crossCycle = 0;
			ClientNpc var19 = field2992[var4];
			if (var19 != null) {
				NpcType var20 = var19.field3182;
				if (var20.field1136 != null) {
					var20 = var20.method457();
				}
				if (var20 != null) {
					out.method415(247);
					out.method154(var20.field1137);
				}
			}
		}
		if (var3 == 22) {
			ClientPlayer var21 = field2030[var4];
			if (var21 != null) {
				method576(1, 0, localPlayer.field1962[0], var21.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var21.field2009[0], 2);
				field2967 = field2762;
				crossMode = 2;
				field523 = field14;
				crossCycle = 0;
				out.method415(110);
				out.method154(var4);
				out.method163(Statics.field1075);
				out.method150(Statics.field2437);
				out.method150(Statics.field2281);
			}
		}
		if (var3 == 19) {
			Statics.field2437 = var4;
			Statics.field2281 = var1;
			Statics.field1075 = var2;
			field475 = 1;
			Statics.field3177 = JagString.join(new JagString[]{field2334, ObjType.list(var4).field2827, Statics.field1393});
			field594 = 0;
			if (Statics.field3177 == null) {
				Statics.field3177 = Statics.field1631;
			}
			field1055 = true;
			return;
		}
		if (var3 == 15) {
			boolean var22 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var22) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			crossCycle = 0;
			crossMode = 2;
			field523 = field14;
			field2967 = field2762;
			out.method415(168);
			out.method162(var4);
			out.method169(field806 + var1);
			out.method163(Statics.field2949);
			out.method150(field1408 + var2);
		}
		if (var3 == 23) {
			out.method415(64);
			out.p4(var2);
			IfType var24 = IfType.method1053(var2);
			if (var24.field2554 != null && var24.field2554[0][0] == 5) {
				int var25 = var24.field2554[0][1];
				VarCache.field2803[var25] = 1 - VarCache.field2803[var25];
				method476(var25);
				field1055 = true;
			}
		}
		if (var3 == 48) {
			out.method415(147);
			out.method169(var4);
			out.method162(var1);
			out.method170(var2);
			field656 = 2;
			field2649 = var1;
			Statics.field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
			field1154 = 0;
		}
		if (var3 == 18) {
			JagString var26 = field2586[arg0];
			int var27 = var26.method11(Statics.field1393);
			if (var27 != -1) {
				long var28 = var26.method1(var27 + 5).method40().toUserhash();
				int var30 = -1;
				for (int var31 = 0; var31 < field1492; var31++) {
					if (field2929[var31] == var28) {
						var30 = var31;
						break;
					}
				}
				if (var30 != -1 && field1788[var30] > 0) {
					field1924 = 3;
					field2637 = true;
					field2811 = 0;
					Statics.field3232 = Statics.field3234;
					field1001 = true;
					Statics.field958 = field2929[var30];
					Statics.field3230 = JagString.join(new JagString[]{Text.field1873, field2951[var30]});
				}
			}
		}
		if (var3 == 1003) {
			crossCycle = 0;
			crossMode = 2;
			field523 = field14;
			field2967 = field2762;
			out.method415(151);
			out.method154(var4);
		}
		if (var3 == 1002) {
			method491(var1, var4, var2);
			out.method415(62);
			out.method150(var4 >> 14 & 0x7FFF);
			out.method162(var2 + field1408);
			out.method154(field806 + var1);
		}
		if (var3 == 30) {
			ClientNpc var32 = field2992[var4];
			if (var32 != null) {
				method576(1, 0, localPlayer.field1962[0], var32.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var32.field2009[0], 2);
				crossCycle = 0;
				field2967 = field2762;
				field523 = field14;
				crossMode = 2;
				out.method415(57);
				out.method150(var4);
			}
		}
		if (var3 == 49) {
			ClientNpc var33 = field2992[var4];
			if (var33 != null) {
				method576(1, 0, localPlayer.field1962[0], var33.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var33.field2009[0], 2);
				field2967 = field2762;
				field523 = field14;
				crossCycle = 0;
				crossMode = 2;
				out.method415(208);
				out.method169(var4);
				out.method169(Statics.field2437);
				out.method154(Statics.field2281);
				out.p4(Statics.field1075);
			}
		}
		if (var3 == 29) {
			method491(var1, var4, var2);
			out.method415(164);
			out.method154(field806 + var1);
			out.method154(field1408 + var2);
			out.method154(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 5 && method491(var1, var4, var2)) {
			out.method415(24);
			out.method154(field1408 + var2);
			out.method169(Statics.field2437);
			out.method162(var4 >> 14 & 0x7FFF);
			out.method154(Statics.field2281);
			out.method163(Statics.field1075);
			out.method154(field806 + var1);
		}
		if (var3 == 34) {
			ClientNpc var34 = field2992[var4];
			if (var34 != null) {
				method576(1, 0, localPlayer.field1962[0], var34.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var34.field2009[0], 2);
				crossCycle = 0;
				crossMode = 2;
				field2967 = field2762;
				field523 = field14;
				out.method415(0);
				out.method169(var4);
			}
		}
		if (var3 == 56) {
			out.method415(40);
			out.method154(var4);
			out.method154(var1);
			out.method170(var2);
			out.method170(Statics.field1075);
			out.method162(Statics.field2437);
			out.method169(Statics.field2281);
			Statics.field1679 = var2;
			field1154 = 0;
			field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 33) {
			IfType var35 = IfType.method1053(var2);
			field1055 = true;
			field594 = 1;
			Statics.field1523 = var35.field2470;
			Statics.field2846 = var35.field2508;
			field475 = 0;
			Statics.field2949 = var2;
			Statics.field1384 = JagString.join(new JagString[]{Statics.field2564, var35.field2515, Statics.field1393});
			if (Statics.field2846 == 16) {
				field2364 = true;
				field330 = 3;
				field1055 = true;
			}
			return;
		}
		if (var3 == 1007) {
			IfType var36 = IfType.method1053(var2);
			if (var36 != null && var36.field2519 != null && var1 != -1) {
				var36 = var36.field2519[var1];
			}
			if (var36 == null || var36.field2540 < 100000) {
				out.method415(151);
				out.method154(var4);
			} else {
				method758(0, JagString.join(new JagString[]{Statics.method502(var36.field2540), Statics.field3203, ObjType.list(var4).field2827}), Statics.field3234);
			}
		}
		if (var3 == 42) {
			IfType var37 = IfType.method1053(var2);
			boolean var38 = true;
			if (var37.field2445 > 0) {
				var38 = method190(var37);
			}
			if (var38) {
				out.method415(64);
				out.p4(var2);
			}
		}
		if (var3 == 31) {
			out.method415(163);
			out.method154(var1);
			out.method154(var4);
			out.p4(var2);
			field2649 = var1;
			field656 = 2;
			Statics.field1679 = var2;
			field1154 = 0;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 12) {
			ClientNpc var39 = field2992[var4];
			if (var39 != null) {
				method576(1, 0, localPlayer.field1962[0], var39.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var39.field2009[0], 2);
				field2967 = field2762;
				field523 = field14;
				crossCycle = 0;
				crossMode = 2;
				out.method415(63);
				out.method154(var4);
			}
		}
		if (var3 == 2) {
			boolean var40 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var40) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			crossMode = 2;
			crossCycle = 0;
			field2967 = field2762;
			field523 = field14;
			out.method415(244);
			out.method162(var1 + field806);
			out.method169(field1408 + var2);
			out.method150(var4);
		}
		if (var3 == 3) {
			boolean var42 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var42) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			crossCycle = 0;
			field2967 = field2762;
			crossMode = 2;
			field523 = field14;
			out.method415(85);
			out.method169(field1408 + var2);
			out.method169(var4);
			out.method162(field806 + var1);
		}
		if (var3 == 21) {
			ClientNpc var44 = field2992[var4];
			if (var44 != null) {
				method576(1, 0, localPlayer.field1962[0], var44.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var44.field2009[0], 2);
				field2967 = field2762;
				field523 = field14;
				crossCycle = 0;
				crossMode = 2;
				out.method415(253);
				out.method150(var4);
				out.method163(Statics.field2949);
			}
		}
		if (var3 == 45 || var3 == 51 || var3 == 13 || var3 == 35) {
			JagString var45 = field2586[arg0];
			int var46 = var45.method11(Statics.field1393);
			if (var46 != -1) {
				long var47 = var45.method1(var46 + 5).method40().toUserhash();
				if (var3 == 45) {
					Statics.method703(var47);
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
				method576(1, 0, localPlayer.field1962[0], var49.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var49.field2009[0], 2);
				crossMode = 2;
				crossCycle = 0;
				field2967 = field2762;
				field523 = field14;
				out.method415(220);
				out.method150(var4);
			}
		}
		if (var3 == 7) {
			if (isMenuOpen) {
				world.method76(var1 - 4, var2 + -4);
			} else {
				world.method76(field2762 - 4, field14 + -4);
			}
		}
		if (var3 == 1006) {
			IfType var50 = IfType.method1053(var2);
			if (var50 == null || var50.field2516[var1] < 100000) {
				out.method415(151);
				out.method154(var4);
			} else {
				method758(0, JagString.join(new JagString[]{Statics.method502(var50.field2516[var1]), Statics.field3203, ObjType.list(var4).field2827}), Statics.field3234);
			}
			field2649 = var1;
			field1154 = 0;
			Statics.field1679 = var2;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 17) {
			method491(var1, var4, var2);
			out.method415(183);
			out.method169(var2 + field1408);
			out.method150(var4 >> 14 & 0x7FFF);
			out.method169(var1 + field806);
		}
		if (var3 == 50) {
			method673(var1, var4, var2);
		}
		if (var3 == 40) {
			IfType.method895(field2421);
			field2421 = -1;
			field2637 = true;
		}
		if (var3 == 32 && method491(var1, var4, var2)) {
			out.method415(225);
			out.method150(var4 >> 14 & 0x7FFF);
			out.method154(var2 + field1408);
			out.method163(Statics.field2949);
			out.method162(field806 + var1);
		}
		if (var3 == 25) {
			out.method415(228);
			out.method162(var4);
			out.method170(var2);
			out.method162(var1);
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
			Statics.field1679 = var2;
			field2649 = var1;
		}
		if (var3 == 11) {
			out.method415(29);
			out.method163(var2);
			out.method169(var1);
			out.method162(var4);
			field2649 = var1;
			Statics.field1679 = var2;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
			field1154 = 0;
		}
		if (var3 == 41) {
			ClientPlayer var51 = field2030[var4];
			if (var51 != null) {
				method576(1, 0, localPlayer.field1962[0], var51.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var51.field2009[0], 2);
				crossMode = 2;
				field523 = field14;
				field2967 = field2762;
				crossCycle = 0;
				out.method415(187);
				out.method154(var4);
			}
		}
		if (var3 == 28) {
			JagString var52 = field2586[arg0];
			int var53 = var52.method11(Statics.field1393);
			if (var53 != -1) {
				if (field3227 == -1) {
					method413();
					if (field1844 != -1) {
						Statics.field3217 = var52.method1(var53 + 5).method40();
						Statics.field3215 = field3227 = field1844;
						Statics.field3268 = false;
					}
				} else {
					method758(0, Text.field1921, Statics.field3234);
				}
			}
		}
		if (var3 == 8) {
			boolean var54 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var54) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			field2967 = field2762;
			crossCycle = 0;
			crossMode = 2;
			field523 = field14;
			out.method415(65);
			out.method169(var4);
			out.method169(var2 + field1408);
			out.method162(field806 + var1);
		}
		if (var3 == 9) {
			method413();
		}
		if (var3 == 54 && field2998 == -1) {
			method414(0, var2);
			field2998 = var2;
		}
		if (var3 == 43) {
			out.method415(98);
			out.method150(var1);
			out.method163(var2);
			out.method150(var4);
			field1154 = 0;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			field2649 = var1;
			Statics.field1679 = var2;
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 36) {
			boolean var56 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var56) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			field523 = field14;
			crossMode = 2;
			crossCycle = 0;
			field2967 = field2762;
			out.method415(27);
			out.method150(field806 + var1);
			out.method169(var4);
			out.method169(field1408 + var2);
		}
		if (var3 == 39) {
			ClientPlayer var58 = field2030[var4];
			if (var58 != null) {
				method576(1, 0, localPlayer.field1962[0], var58.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var58.field2009[0], 2);
				crossCycle = 0;
				field2967 = field2762;
				crossMode = 2;
				field523 = field14;
				out.method415(211);
				out.method162(var4);
			}
		}
		if (var3 == 24) {
			out.method415(124);
			out.method150(var1);
			out.method170(var2);
			out.method150(var4);
			Statics.field1679 = var2;
			field1154 = 0;
			field2649 = var1;
			field656 = 2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 16) {
			method491(var1, var4, var2);
			out.method415(30);
			out.method169(var4 >> 14 & 0x7FFF);
			out.method169(field1408 + var2);
			out.method154(field806 + var1);
		}
		if (var3 == 20) {
			ClientNpc var59 = field2992[var4];
			if (var59 != null) {
				method576(1, 0, localPlayer.field1962[0], var59.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var59.field2009[0], 2);
				crossMode = 2;
				field2967 = field2762;
				field523 = field14;
				crossCycle = 0;
				out.method415(153);
				out.method162(var4);
			}
		}
		if (var3 == 47) {
			boolean var60 = method576(0, 0, localPlayer.field1962[0], var1, 0, false, 0, 0, localPlayer.field2009[0], var2, 2);
			if (!var60) {
				method576(1, 0, localPlayer.field1962[0], var1, 0, false, 0, 1, localPlayer.field2009[0], var2, 2);
			}
			field2967 = field2762;
			field523 = field14;
			crossCycle = 0;
			crossMode = 2;
			out.method415(172);
			out.method169(field806 + var1);
			out.method150(Statics.field2281);
			out.method169(var4);
			out.method179(Statics.field1075);
			out.method162(field1408 + var2);
			out.method162(Statics.field2437);
		}
		if (var3 == 6) {
			out.method415(102);
			out.method170(var2);
			out.method154(var1);
			out.method150(var4);
			field2649 = var1;
			field1154 = 0;
			field656 = 2;
			Statics.field1679 = var2;
			if (var2 >> 16 == field3227) {
				field656 = 1;
			}
			if (var2 >> 16 == field2166) {
				field656 = 3;
			}
		}
		if (var3 == 4) {
			ClientNpc var62 = field2992[var4];
			if (var62 != null) {
				method576(1, 0, localPlayer.field1962[0], var62.field1962[0], 0, false, 0, 1, localPlayer.field2009[0], var62.field2009[0], 2);
				crossMode = 2;
				field2967 = field2762;
				crossCycle = 0;
				field523 = field14;
				out.method415(116);
				out.method162(var4);
			}
		}
		if (field475 != 0) {
			field475 = 0;
			field1055 = true;
		}
		if (field594 != 0) {
			field1055 = true;
			field594 = 0;
		}
	}

	@ObfuscatedName("re.a(I)V")
	public static void otherOverlays() {
		method275();
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(field2967 - 4 - 8, field523 - 4 + -8);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(field2967 - 8 - 4, field523 + -4 - 8);
		}
		if (field2800 != -1) {
			method1012(field2800);
			method478(field2800, 334, 4, 512);
		}
		if (field3227 != -1) {
			method1012(field3227);
			method478(field3227, 334, 0, 512);
		}
		getSpecialArea();
		if (!isMenuOpen) {
			method757();
			method391();
		} else if (field640 == 0) {
			drawMinimenu();
		}
		if (field1470 == 1) {
			field2277.plotSprite(472, 296);
		}
		if (showFps) {
			byte var0 = 20;
			int var1 = 16776960;
			if (field2635 < 30 && lowMem) {
				var1 = 16711680;
			}
			if (field2635 < 20 && !lowMem) {
				var1 = 16711680;
			}
			p12.method210(JagString.join(new JagString[]{Statics.field3026, Statics.method502(field2635)}), 20, var1);
			int var2 = 16776960;
			int var8 = var0 + 15;
			Runtime var3 = Runtime.getRuntime();
			int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
			if (var4 > 32768 && lowMem) {
				var2 = 16711680;
			}
			if (var4 > 65536 && !lowMem) {
				var2 = 16711680;
			}
			p12.method210(JagString.join(new JagString[]{Statics.field1786, Statics.method502(var4), Statics.field1562}), 35, var2);
			var8 += 15;
			if (field1941) {
				p12.method210(Statics.field3211, 50, 16711680);
				var8 += 15;
				field1941 = false;
			}
			if (Statics.field410) {
				p12.method210(Statics.field2802, var8, 16711680);
				var8 += 15;
				Statics.field410 = false;
			}
			if (field687) {
				p12.method210(Statics.field3213, var8, 16711680);
				field687 = false;
				var8 += 15;
			}
		}
		if (field2813 != 0) {
			int var5 = field2813 / 50;
			int var6 = var5 / 60;
			int var7 = var5 % 60;
			if (var7 < 10) {
				p12.drawString(JagString.join(new JagString[]{Text.field3012, Statics.method502(var6), Statics.field846, Statics.method502(var7)}), 4, 329, 16776960);
			} else {
				p12.drawString(JagString.join(new JagString[]{Text.field3012, Statics.method502(var6), Statics.field2165, Statics.method502(var7)}), 4, 329, 16776960);
			}
		}
	}

	@ObfuscatedName("kc.d(I)V")
	public static void gameDraw() {
		if (field2402) {
			field2402 = false;
			method943();
			field2364 = true;
			field2637 = true;
			field1055 = true;
			field504 = true;
		}
		gameDrawMain();
		if (isMenuOpen && field640 == 1) {
			field1055 = true;
		}
		if (field1648 != -1) {
			boolean var0 = method1012(field1648);
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
		if (field2166 == -1) {
			field704.field2537 = field3052 - field1340 - 77;
			if (ClientMouseListener.field741 > 448 && ClientMouseListener.field741 < 560 && ClientMouseListener.field2568 > 332) {
				method192(77, ClientMouseListener.field2568 - 357, ClientMouseListener.field741 + -17, field3052, field704, 463, -1, 0);
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
				field2637 = true;
			}
		}
		if (field2166 == -1 && field2811 == 3) {
			field704.field2537 = field1390;
			int var2 = field2330 * 14 + 7;
			if (ClientMouseListener.field741 > 448 && ClientMouseListener.field741 < 560 && ClientMouseListener.field2568 > 332) {
				method192(77, ClientMouseListener.field2568 - 357, ClientMouseListener.field741 + -17, var2, field704, 463, -1, 0);
			}
			int var3 = field704.field2537;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > var2 - 77) {
				var3 = var2 - 77;
			}
			if (field1390 != var3) {
				field1390 = var3;
				field2637 = true;
			}
		}
		if (field2166 != -1) {
			boolean var4 = method1012(field2166);
			if (var4) {
				field2637 = true;
			}
		}
		if (field656 == 3) {
			field2637 = true;
		}
		if (field857 == 3) {
			field2637 = true;
		}
		if (field1605 != null) {
			field2637 = true;
		}
		if (isMenuOpen && field640 == 2) {
			field2637 = true;
		}
		if (field2637) {
			field2637 = false;
			method932();
		}
		method717();
		if (field2607 != -1) {
			field2364 = true;
		}
		if (field2364) {
			if (field2607 != -1 && field330 == field2607) {
				field2607 = -1;
				out.method415(44);
				out.p1(field330);
			}
			field2364 = false;
			field687 = true;
			method246(field330, field2397, field1648 == -1, loopCycle % 20 >= 10 ? field2607 : -1);
		}
		if (field504) {
			field687 = true;
			field504 = false;
			method880(field2828, p12, field236, field1864);
		}
		BgSound.doMix(localPlayer.field1972, minusedlevel, field321, localPlayer.field1963);
		field321 = 0;
	}

	@ObfuscatedName("bb.a(I)V")
	public static void method188() {
		method1012(field1143);
		if (field1881 != -1) {
			method1012(field1881);
		}
		field321 = 0;
		field187.method1054();
		field92 = Pix3D.method362(field92);
		Pix2D.method920();
		method478(field1143, 503, 0, 765);
		if (field1881 != -1) {
			method478(field1881, 503, 0, 765);
		}
		if (isMenuOpen) {
			drawMinimenu();
		} else {
			method757();
			method391();
		}
		try {
			Graphics var0 = canvas.getGraphics();
			field187.method101(0, var0, 0);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("ec.b(Z)V")
	public static void loginPoll() {
		try {
			if (loginStep == 0) {
				if (stream != null) {
					stream.close();
					stream = null;
				}
				networkError = false;
				loginStep = 1;
				loginWaitingTime = 0;
				loginSocketReq = null;
			}
			if (loginStep == 1) {
				if (loginSocketReq == null) {
					loginSocketReq = signlink.socketreq(loginPort);
				}
				if (loginSocketReq.status == 2) {
					throw new IOException();
				}
				if (loginSocketReq.status == 1) {
					stream = new ClientStream((Socket) loginSocketReq.result, signlink);
					loginStep = 2;
					loginSocketReq = null;
				}
			}
			if (loginStep == 2) {
				long var0 = field1843 = TitleScreen.loginUser.toUserhash();
				out.pos = 0;
				out.p1(14);
				int var2 = (int) (var0 >> 16 & 0x1FL);
				out.p1(var2);
				stream.write(2, out.data);
				loginStep = 3;
				in.pos = 0;
			}
			if (loginStep == 3) {
				int var3 = stream.read();
				if (var3 != 0) {
					loginError(var3);
					return;
				}
				in.pos = 0;
				loginStep = 4;
			}
			if (loginStep == 4) {
				if (in.pos < 8) {
					int var4 = stream.available();
					if (var4 > 8 - in.pos) {
						var4 = 8 - in.pos;
					}
					if (var4 > 0) {
						stream.read(in.pos, var4, in.data);
						in.pos += var4;
					}
				}
				if (in.pos == 8) {
					in.pos = 0;
					field3132 = in.method174();
					loginStep = 5;
				}
			}
			if (loginStep == 5) {
				int[] var5 = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field3132 >> 32), (int) field3132};
				out.pos = 0;
				out.p1(10);
				out.p4(var5[0]);
				out.p4(var5[1]);
				out.p4(var5[2]);
				out.p4(var5[3]);
				out.p4(signlink.uid);
				out.p8(TitleScreen.loginUser.toUserhash());
				out.pjstr(TitleScreen.loginPass);
				out.rsaenc(field1993, field964);
				loginout.pos = 0;
				if (state == 40) {
					loginout.p1(18);
				} else {
					loginout.p1(16);
				}
				loginout.p1(out.pos + 57);
				loginout.p4(435);
				loginout.p1(lowMem ? 1 : 0);
				loginout.p4(anims.crc);
				loginout.p4(bases.crc);
				loginout.p4(configs.crc);
				loginout.p4(interfaces.crc);
				loginout.p4(jagFX.crc);
				loginout.p4(maps.crc);
				loginout.p4(songs.crc);
				loginout.p4(models.crc);
				loginout.p4(sprites.crc);
				loginout.p4(textures.crc);
				loginout.p4(binary.crc);
				loginout.p4(jingles.crc);
				loginout.p4(scripts.crc);
				loginout.pdata(out.pos, out.data);
				stream.write(loginout.pos, loginout.data);
				out.seed(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				in.seed(var5);
				loginStep = 6;
			}
			if (loginStep == 6 && stream.available() > 0) {
				int var7 = stream.read();
				if (var7 == 21 && state == 20) {
					loginStep = 7;
				} else if (var7 == 2) {
					loginStep = 9;
				} else if (var7 == 15 && state == 40) {
					reconnectDone();
					return;
				} else if (var7 == 23 && loginFailCount < 1) {
					loginFailCount++;
					loginStep = 0;
				} else {
					loginError(var7);
					return;
				}
			}
			if (loginStep == 7 && stream.available() > 0) {
				loginHopTimer = stream.read() * 60 + 180;
				loginStep = 8;
			}
			if (loginStep == 8) {
				loginWaitingTime = 0;
				TitleScreen.loginMes(JagString.join(new JagString[]{Statics.method502(loginHopTimer / 60), Text.field1931}), Text.field468, Text.field1561);
				if (--loginHopTimer <= 0) {
					loginStep = 0;
				}
			} else {
				if (loginStep == 9 && stream.available() >= 8) {
					staffmodlevel = stream.read();
					mouseTracked = stream.read() == 1;
					selfSlot = stream.read();
					selfSlot <<= 0x8;
					selfSlot += stream.read();
					membersAccount = stream.read();
					stream.read(0, 1, in.data);
					in.pos = 0;
					ptype = in.g1Enc();
					stream.read(0, 2, in.data);
					in.pos = 0;
					psize = in.g2();
					loginStep = 10;
				}
				if (loginStep != 10) {
					loginWaitingTime++;
					if (loginWaitingTime > 2000) {
						if (loginFailCount < 1) {
							loginFailCount++;
							if (loginGamePort == loginPort) {
								loginPort = loginJs5Port;
							} else {
								loginPort = loginGamePort;
							}
							loginStep = 0;
						} else {
							loginError(-3);
						}
					}
				} else if (stream.available() >= psize) {
					in.pos = 0;
					stream.read(0, psize, in.data);
					loginDone();
					field2604 = -1;
					rebuildPacket(false);
					ptype = -1;
				}
			}
		} catch (IOException var8) {
			if (loginFailCount < 1) {
				if (loginGamePort == loginPort) {
					loginPort = loginJs5Port;
				} else {
					loginPort = loginGamePort;
				}
				loginFailCount++;
				loginStep = 0;
			} else {
				loginError(-2);
			}
		}
	}

	@ObfuscatedName("kc.b(II)V")
	public static void loginError(int arg0) {
		if (arg0 == -3) {
			TitleScreen.loginMes(Text.field2093, Text.field2634, Text.field865);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.field2071, Text.field2106, Text.field1219);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.field2086, Text.field1778, Text.field861);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.field2078, Text.field2111, Text.field1076);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.field2113, Text.field3172, Text.field497);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.field2103, Text.field1174, Text.field94);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.field2067, Text.field1217, Text.field3205);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.field2090, Text.field2763, Text.field3072);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.field2074, Text.field2135, Text.field183);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.field2079, Text.field2012, Text.field1482);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.field2089, Text.field2140, Text.field2382);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.field2080, Text.field2139, Text.field1463);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.field2068, Text.field3127, Text.field932);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.field2109, Text.field1498, Text.field850);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.field2066, Text.field539, Text.field1111);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.field2061, Text.field303, Text.field1043);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.field2096, Text.field2580, Text.field3001);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.field2100, Text.field602, Text.field1807);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.field2081, Text.field2714, Text.field855);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.field2092, Text.field900, Text.field408);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.field2094, Text.field1930, Text.field1120);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.field2091, Text.field2948, Text.field315);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.field2110, Text.field452, Text.field858);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.field2097, Text.field1024, Text.field836);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.field2082, Text.field2062, Statics.field3128);
		} else {
			TitleScreen.loginMes(Text.field2083, Text.field1142, Text.field862);
		}
		setMainState(10);
	}

	@ObfuscatedName("client.j(I)V")
	public static void loginDone() {
		field2605 = 0L;
		field708.field2058 = 0;
		field3069 = 0;
		field1862 = true;
		field1277 = true;
		ReflectionChecker.method469();
		field498 = -1;
		isMenuOpen = false;
		field36 = -1;
		ptype = -1;
		field2813 = 0;
		field1855 = 0;
		field96 = 0;
		out.pos = 0;
		field1750 = 0;
		field2434 = -1;
		in.pos = 0;
		menuNumEntries = 0;
		ClientMouseListener.setIdleTimer(0);
		for (int var0 = 0; var0 < 100; var0++) {
			field2034[var0] = null;
		}
		field475 = 0;
		field2766 = (int) (Math.random() * 80.0D) - 40;
		field2409 = (int) (Math.random() * 110.0D) - 55;
		field941 = 0;
		field2158 = (int) (Math.random() * 120.0D) - 60;
		field305 = -1;
		field1341 = 0;
		field965 = 0;
		field594 = 0;
		field2797 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		field2589 = (int) (Math.random() * 30.0D) - 20;
		field1587 = 0;
		field296 = (int) (Math.random() * 100.0D) - 50;
		field2939 = 0;
		field2720 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			field2030[var1] = null;
			field1176[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			field2992[var2] = null;
		}
		localPlayer = field2030[2047] = new ClientPlayer();
		field2160.clear();
		field2756.clear();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					groundObj[var3][var4][var5] = null;
				}
			}
		}
		locChanges = new LinkList();
		field1492 = 0;
		field701 = 0;
		IfType.method895(field2421);
		field2421 = -1;
		IfType.method895(field2166);
		field2166 = -1;
		IfType.method895(field3227);
		field3227 = -1;
		IfType.method895(field1143);
		field1143 = -1;
		IfType.method895(field1881);
		field1881 = -1;
		IfType.method895(field1648);
		field1648 = -1;
		IfType.method895(field2800);
		field2811 = 0;
		field1001 = false;
		isMenuOpen = false;
		field2800 = -1;
		field1605 = null;
		field2998 = -1;
		field2607 = -1;
		field1470 = 0;
		field330 = 3;
		idkDesign.setAppearance(null, false, new int[5], -1);
		for (int var6 = 0; var6 < 5; var6++) {
			playerOp[var6] = null;
			playerOpPriority[var6] = false;
		}
		field1069 = true;
	}

	@ObfuscatedName("client.d(Z)V")
	public static void method285() {
		field583 = null;
		Text.field602 = null;
		playerOp = null;
		Text.field584 = null;
		Text.field596 = null;
		Text.field604 = null;
		TextGerman.field598 = null;
		field609 = null;
		Text.field588 = null;
		Text.field582 = null;
		TextGerman.field578 = null;
	}

	@ObfuscatedName("gb.b(B)V")
	public static void locChangePostBuildCorrect() {
		for (LocChange var0 = (LocChange) locChanges.head(); var0 != null; var0 = (LocChange) locChanges.next()) {
			if (var0.endTime == -1) {
				var0.startTime = 0;
				locChangeSetOld(var0);
			} else {
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("hd.h(I)V")
	public static void drawMinimenu() {
		int var0 = field986;
		int var1 = field219;
		int var2 = field579;
		int var3 = field2306;
		Pix2D.fillRect(var0, var2, var3, var1, 6116423);
		Pix2D.fillRect(var0 + 1, var2 + 1, var3 - 2, 16, 0);
		Pix2D.drawRect(var0 + 1, var2 + 18, var3 - 2, var1 + -19, 0);
		b12.drawString(Text.field2490, var0 + 3, var2 + 14, 6116423);
		int var4 = ClientMouseListener.field741;
		int var5 = ClientMouseListener.field2568;
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
		for (int var6 = 0; var6 < menuNumEntries; var6++) {
			int var7 = (menuNumEntries - var6 - 1) * 15 + var2 + 31;
			int var8 = 16777215;
			if (var4 > var0 && var0 + var3 > var4 && var5 > var7 - 13 && var7 + 3 > var5) {
				var8 = 16776960;
			}
			b12.drawString(field2586[var6], var0 + 3, var7, var8, true);
		}
	}

	@ObfuscatedName("a.e(I)V")
	public static void getSpecialArea() {
		chatDisabled = 0;
		int var0 = (localPlayer.field1972 >> 7) + field806;
		int var1 = (localPlayer.field1963 >> 7) + field1408;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			chatDisabled = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			chatDisabled = 1;
		}
		if (chatDisabled == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			chatDisabled = 0;
		}
	}

	@ObfuscatedName("bb.b(I)V")
	public static void method189() {
		int var0 = field1746 * 128 + 64;
		int var1 = field1187 * 128 + 64;
		int var2 = method712(minusedlevel, var1, var0) - field316;
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
		int var3 = Statics.field1270 * 128 + 64;
		if (field1200 > var0) {
			field1200 -= (field1200 - var0) * field2918 / 1000 + field239;
			if (field1200 < var0) {
				field1200 = var0;
			}
		}
		int var4 = Statics.field1895 * 128 + 64;
		int var5 = method712(minusedlevel, var3, var4) - Statics.field1940;
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
			field184 += Statics.field1029 * var12 / 1000 + Statics.field2945;
			field184 &= 0x7FF;
		}
		if (var12 < 0) {
			field184 -= Statics.field2945 + -var12 * Statics.field1029 / 1000;
			field184 &= 0x7FF;
		}
		if (var10 > field1400) {
			field1400 += (var10 - field1400) * Statics.field1029 / 1000 + Statics.field2945;
			if (field1400 > var10) {
				field1400 = var10;
			}
		}
		if (field1400 > var10) {
			field1400 -= (field1400 - var10) * Statics.field1029 / 1000 + Statics.field2945;
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

	@ObfuscatedName("n.b(I)V")
	public static void reconnectDone() {
		isMenuOpen = false;
		ptype = -1;
		menuNumEntries = 0;
		psize = 0;
		out.pos = 0;
		field36 = -1;
		field498 = -1;
		field1855 = 0;
		field2434 = -1;
		field941 = 0;
		field1587 = 0;
		field2813 = 0;
		in.pos = 0;
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
		setMainState(30);
	}

	@ObfuscatedName("cd.b(I)V")
	public static void method275() {
		if (field216 == 0) {
			return;
		}
		PixFont var0 = p12;
		int var1 = 0;
		if (field2813 != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (field2034[var2] != null) {
				JagString var3 = Statics.field3130[var2];
				byte var4 = 0;
				int var5 = Statics.field3236[var2];
				if (var3 != null && var3.method26(Statics.field2612)) {
					var3 = var3.method1(5);
					var4 = 1;
				}
				if (var3 != null && var3.method26(Statics.field2535)) {
					var3 = var3.method1(5);
					var4 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || field236 == 0 || field236 == 1 && Statics.method242(var3))) {
					int var6 = 329 - var1 * 13;
					var1++;
					var0.drawString(Text.field1215, 4, var6, 0);
					var0.drawString(Text.field1215, 4, var6 - 1, 65535);
					int var7 = var0.method208(Text.field1215) + 4;
					int var8 = var7 + var0.method212(32);
					if (var4 == 1) {
						field2614[0].method329(var8, var6 - 12);
						var8 += 14;
					}
					if (var4 == 2) {
						field2614[1].method329(var8, var6 - 12);
						var8 += 14;
					}
					var0.drawString(JagString.join(new JagString[]{var3, Statics.field1065, field2034[var2]}), var8, var6, 0);
					var0.drawString(JagString.join(new JagString[]{var3, Statics.field1065, field2034[var2]}), var8, var6 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 5 && field236 < 2) {
					int var9 = 329 - var1 * 13;
					var1++;
					var0.drawString(field2034[var2], 4, var9, 0);
					var0.drawString(field2034[var2], 4, var9 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 6 && field236 < 2) {
					int var10 = 329 - var1 * 13;
					var1++;
					var0.drawString(JagString.join(new JagString[]{Text.field521, Statics.field2406, var3, Statics.field1065, field2034[var2]}), 4, var10, 0);
					var0.drawString(JagString.join(new JagString[]{Text.field521, Statics.field2406, var3, Statics.field1065, field2034[var2]}), 4, var10 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
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
				int var2 = Statics.field3236[var1];
				JagString var3 = Statics.field3130[var1];
				if (var3 != null && var3.method26(Statics.field2612)) {
					var3 = var3.method1(5);
				}
				if (var3 != null && var3.method26(Statics.field2535)) {
					var3 = var3.method1(5);
				}
				if ((var2 == 3 || var2 == 7) && (var2 == 7 || field236 == 0 || field236 == 1 && Statics.method242(var3))) {
					int var4 = 329 - var0 * 13;
					var0++;
					if (ClientMouseListener.field741 > 4 && var4 - 10 < ClientMouseListener.field2568 + -4 && ClientMouseListener.field2568 - 4 <= var4 + 3) {
						int var5 = p12.method208(JagString.join(new JagString[]{Text.field1215, Statics.field713, var3, field2034[var1]})) + 25;
						if (var5 > 450) {
							var5 = 450;
						}
						if (ClientMouseListener.field741 < var5 + 4) {
							if (staffmodlevel >= 1) {
								method398(0, Text.field1038, 0, 0, 2028, JagString.join(new JagString[]{Statics.field1393, var3}));
							}
							method398(0, Text.field1933, 0, 0, 2051, JagString.join(new JagString[]{Statics.field1393, var3}));
							method398(0, Text.field1364, 0, 0, 2045, JagString.join(new JagString[]{Statics.field1393, var3}));
						}
					}
					if (var0 >= 5) {
						return;
					}
				}
				if ((var2 == 5 || var2 == 6) && field236 < 2) {
					var0++;
					if (var0 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("je.b(Z)V")
	public static void method564() {
		int var0 = field2409 + localPlayer.field1963;
		int var1 = field296 + localPlayer.field1972;
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
			Statics.field544 += (-Statics.field544 - 24) / 2;
		} else if (field1488[97]) {
			Statics.field544 += (24 - Statics.field544) / 2;
		} else {
			Statics.field544 /= 2;
		}
		if (field1488[98]) {
			field2947 += (12 - field2947) / 2;
		} else if (field1488[99]) {
			field2947 += (-field2947 - 12) / 2;
		} else {
			field2947 /= 2;
		}
		int var2 = field1839 >> 7;
		field2797 = Statics.field544 / 2 + field2797 & 0x7FF;
		int var3 = field1194 >> 7;
		field3204 += field2947 / 2;
		int var4 = 0;
		if (field3204 < 128) {
			field3204 = 128;
		}
		if (field3204 > 383) {
			field3204 = 383;
		}
		int var5 = method712(minusedlevel, field1194, field1839);
		if (var3 > 3 && var2 > 3 && var3 < 100 && var2 < 100) {
			for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
				for (int var7 = var2 - 4; var7 <= var2 + 4; var7++) {
					int var8 = minusedlevel;
					if (var8 < 3 && (ClientBuild.mapl[1][var6][var7] & 0x2) == 2) {
						var8++;
					}
					int var9 = var5 - ClientBuild.groundh[var8][var6][var7];
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

	@ObfuscatedName("id.a(ZI)V")
	public static void rebuildPacket(boolean arg0) {
		field2773 = arg0;
		if (!field2773) {
			int var24 = in.g2();
			int var25 = in.method166();
			int var26 = in.method137();
			int var27 = in.method180();
			int var28 = in.method147();
			int var29 = (psize - in.pos) / 16;
			field2170 = new int[var29][4];
			for (int var30 = 0; var30 < var29; var30++) {
				for (int var31 = 0; var31 < 4; var31++) {
					field2170[var30][var31] = in.method146();
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
						field2291[var33] = maps.method228(JagString.join(new JagString[]{Statics.field2305, Statics.method502(var34), Statics.field477, Statics.method502(var35)}));
						field742[var33] = maps.method228(JagString.join(new JagString[]{Statics.field1259, Statics.method502(var34), Statics.field477, Statics.method502(var35)}));
						var33++;
					}
				}
			}
			method731(var26, var27, var25, var24, var28);
			return;
		}
		int var1 = in.g2();
		int var2 = in.method180();
		int var3 = in.g2();
		int var4 = in.method156();
		int var5 = in.g2();
		in.method417();
		for (int var6 = 0; var6 < 4; var6++) {
			for (int var7 = 0; var7 < 13; var7++) {
				for (int var8 = 0; var8 < 13; var8++) {
					int var9 = in.method412(1);
					if (var9 == 1) {
						ClientBuild.field908[var6][var7][var8] = in.method412(26);
					} else {
						ClientBuild.field908[var6][var7][var8] = -1;
					}
				}
			}
		}
		in.method408();
		int var10 = (psize - in.pos) / 16;
		field2170 = new int[var10][4];
		for (int var11 = 0; var11 < var10; var11++) {
			for (int var12 = 0; var12 < 4; var12++) {
				field2170[var11][var12] = in.method183();
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
					int var17 = ClientBuild.field908[var14][var15][var16];
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
							field2291[var13] = maps.method228(JagString.join(new JagString[]{Statics.field2305, Statics.method502(var23), Statics.field477, Statics.method502(var22)}));
							field742[var13] = maps.method228(JagString.join(new JagString[]{Statics.field1259, Statics.method502(var23), Statics.field477, Statics.method502(var22)}));
							var13++;
						}
					}
				}
			}
		}
		method731(var2, var5, var3, var1, var4);
	}

	@ObfuscatedName("tc.a(I)V")
	public static void method960() {
		if (field1750 > 0) {
			method847();
		} else {
			setMainState(40);
			field1692 = stream;
			stream = null;
		}
	}

	@ObfuscatedName("ae.a(I)V")
	public static void method125() {
		for (int var0 = 0; var0 < field965; var0++) {
			int var10002 = Statics.field684[var0]--;
			if (Statics.field684[var0] >= -10) {
				JagFX var2 = Statics.field955[var0];
				if (var2 == null) {
					var2 = JagFX.method711(jagFX, Statics.field2369[var0]);
					if (var2 == null) {
						continue;
					}
					Statics.field684[var0] += var2.method709();
					Statics.field955[var0] = var2;
				}
				if (Statics.field684[var0] < 0) {
					int var9;
					if (Statics.field1521[var0] == 0) {
						var9 = field322;
					} else {
						int var3 = (Statics.field1521[var0] & 0xFF) * 128;
						int var4 = Statics.field1521[var0] >> 16 & 0xFF;
						int var5 = Statics.field1521[var0] >> 8 & 0xFF;
						int var6 = var5 * 128 + 64 - localPlayer.field1963;
						int var7 = var4 * 128 + 64 - localPlayer.field1972;
						if (var7 < 0) {
							var7 = -var7;
						}
						if (var6 < 0) {
							var6 = -var6;
						}
						int var8 = var6 + var7 - 128;
						if (var8 > var3) {
							Statics.field684[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var9 = (var3 - var8) * field1559 / var3;
					}
					Wave var10 = var2.method710().method1055(soundDecimator);
					WaveStream var11 = WaveStream.method590(var10, var9);
					var11.method585(Statics.field2845[var0] - 1);
					soundMixer.method126(var11);
					Statics.field684[var0] = -100;
				}
			} else {
				field965--;
				for (int var1 = var0; var1 < field965; var1++) {
					Statics.field2369[var1] = Statics.field2369[var1 + 1];
					Statics.field955[var1] = Statics.field955[var1 + 1];
					Statics.field2845[var1] = Statics.field2845[var1 + 1];
					Statics.field684[var1] = Statics.field684[var1 + 1];
					Statics.field1521[var1] = Statics.field1521[var1 + 1];
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
			Statics.method681(0, field3037, field1554, songs);
			return;
		}
	}

	@ObfuscatedName("f.a(I)V")
	public static void method384() {
		for (int var0 = -1; var0 < field2939; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field2758[var0];
			}
			ClientPlayer var2 = field2030[var1];
			if (var2 != null) {
				method319(var2, 1);
			}
		}
	}

	@ObfuscatedName("ob.a(Z)V")
	public static void method757() {
		if (field857 != 0) {
			return;
		}
		field2586[0] = Text.field3302;
		field1932[0] = 1005;
		menuNumEntries = 1;
		if (field1143 != -1) {
			Statics.field1497 = -1;
			Statics.field903 = -1;
			method321(0, 765, 503, field1143, 0, ClientMouseListener.field741, ClientMouseListener.field2568, 0);
			Statics.field2881 = Statics.field903;
			field1279 = Statics.field1497;
			return;
		}
		method572();
		Statics.field1497 = -1;
		Statics.field903 = -1;
		boolean var0 = false;
		if (ClientMouseListener.field741 > 4 && ClientMouseListener.field2568 > 4 && ClientMouseListener.field741 < 516 && ClientMouseListener.field2568 < 338) {
			if (field3227 == -1) {
				method1019();
			} else {
				method321(4, 516, 338, field3227, 4, ClientMouseListener.field741, ClientMouseListener.field2568, 0);
			}
		}
		field1279 = Statics.field1497;
		Statics.field2881 = Statics.field903;
		Statics.field1497 = -1;
		Statics.field903 = -1;
		if (ClientMouseListener.field741 > 553 && ClientMouseListener.field2568 > 205 && ClientMouseListener.field741 < 743 && ClientMouseListener.field2568 < 466) {
			if (field1648 != -1) {
				method321(205, 743, 466, field1648, 553, ClientMouseListener.field741, ClientMouseListener.field2568, 1);
			} else if (field2397[field330] != -1) {
				method321(205, 743, 466, field2397[field330], 553, ClientMouseListener.field741, ClientMouseListener.field2568, 1);
			}
		}
		if (Statics.field214 != Statics.field903) {
			field1055 = true;
			Statics.field214 = Statics.field903;
		}
		Statics.field903 = -1;
		if (Statics.field1497 != field1387) {
			field1387 = Statics.field1497;
			field1055 = true;
		}
		Statics.field1497 = -1;
		if (ClientMouseListener.field741 > 17 && ClientMouseListener.field2568 > 357 && ClientMouseListener.field741 < 496 && ClientMouseListener.field2568 < 453) {
			if (field2166 != -1) {
				method321(357, 496, 453, field2166, 17, ClientMouseListener.field741, ClientMouseListener.field2568, 2);
			} else if (field2421 != -1) {
				method321(357, 496, 453, field2421, 17, ClientMouseListener.field741, ClientMouseListener.field2568, 3);
			} else if (ClientMouseListener.field2568 < 434 && ClientMouseListener.field741 < 426) {
				method974(ClientMouseListener.field741 - 17, ClientMouseListener.field2568 + -357);
			}
		}
		if ((field2166 != -1 || field2421 != -1) && Statics.field903 != field2712) {
			field2637 = true;
			field2712 = Statics.field903;
		}
		if ((field2166 != -1 || field2421 != -1) && Statics.field1497 != field3253) {
			field2637 = true;
			field3253 = Statics.field1497;
		}
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < menuNumEntries - 1; var1++) {
				if (field1932[var1] < 1000 && field1932[var1 + 1] > 1000) {
					var0 = false;
					JagString var2 = field2586[var1];
					field2586[var1] = field2586[var1 + 1];
					field2586[var1 + 1] = var2;
					int var3 = field1932[var1];
					field1932[var1] = field1932[var1 + 1];
					field1932[var1 + 1] = var3;
					int var4 = field994[var1];
					field994[var1] = field994[var1 + 1];
					field994[var1 + 1] = var4;
					int var5 = field2925[var1];
					field2925[var1] = field2925[var1 + 1];
					field2925[var1 + 1] = var5;
					int var6 = field1770[var1];
					field1770[var1] = field1770[var1 + 1];
					field1770[var1 + 1] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ub.a(I)V")
	public static void method992() {
		if (field857 != 0) {
			return;
		}
		int var0 = field3050;
		if (field594 == 1 && field2762 >= 516 && field14 >= 160 && field2762 <= 765 && field14 <= 205) {
			var0 = 0;
		}
		if (!isMenuOpen) {
			if (var0 == 1 && menuNumEntries > 0) {
				int var1 = field1932[menuNumEntries - 1];
				if (var1 == 53 || var1 == 25 || var1 == 55 || var1 == 48 || var1 == 24 || var1 == 52 || var1 == 6 || var1 == 31 || var1 == 43 || var1 == 11 || var1 == 19 || var1 == 1006) {
					int var2 = field994[menuNumEntries - 1];
					int var3 = field2925[menuNumEntries - 1];
					IfType var4 = IfType.method1053(var3);
					if (var4.field2509 || var4.field2529) {
						field3143 = field2762;
						field2815 = false;
						field857 = 2;
						field2410 = var3;
						field2829 = field14;
						field2776 = var2;
						if (var3 >> 16 == field3227) {
							field857 = 1;
						}
						if (var3 >> 16 == field2166) {
							field857 = 3;
						}
						field298 = 0;
						return;
					}
				}
			}
			if (var0 == 1 && (field3297 == 1 || method676(menuNumEntries - 1)) && menuNumEntries > 2) {
				var0 = 2;
			}
			if (var0 == 1 && menuNumEntries > 0) {
				method604(menuNumEntries - 1);
			}
			if (var0 == 2 && menuNumEntries > 0) {
				method968();
			}
			return;
		}
		if (var0 != 1) {
			int var5 = ClientMouseListener.field741;
			int var6 = ClientMouseListener.field2568;
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
				isMenuOpen = false;
				if (field640 == 2) {
					field2637 = true;
				}
			}
		}
		if (var0 != 1) {
			return;
		}
		int var7 = field986;
		int var8 = field579;
		int var9 = field2306;
		int var10 = field2762;
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
		for (int var13 = 0; var13 < menuNumEntries; var13++) {
			int var14 = (menuNumEntries - var13 - 1) * 15 + var8 + 31;
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
		isMenuOpen = false;
		if (field640 == 2) {
			field2637 = true;
			return;
		}
	}

	@ObfuscatedName("k.c(B)V")
	public static void method575() {
		if (field3050 != 1) {
			return;
		}
		if (field2762 >= 539 && field2762 <= 573 && field14 >= 169 && field14 < 205 && field2397[0] != -1) {
			field2364 = true;
			field1055 = true;
			field330 = 0;
		}
		if (field2762 >= 569 && field2762 <= 599 && field14 >= 168 && field14 < 205 && field2397[1] != -1) {
			field330 = 1;
			field1055 = true;
			field2364 = true;
		}
		if (field2762 >= 597 && field2762 <= 627 && field14 >= 168 && field14 < 205 && field2397[2] != -1) {
			field2364 = true;
			field330 = 2;
			field1055 = true;
		}
		if (field2762 >= 625 && field2762 <= 669 && field14 >= 168 && field14 < 203 && field2397[3] != -1) {
			field2364 = true;
			field1055 = true;
			field330 = 3;
		}
		if (field2762 >= 666 && field2762 <= 696 && field14 >= 168 && field14 < 205 && field2397[4] != -1) {
			field330 = 4;
			field1055 = true;
			field2364 = true;
		}
		if (field2762 >= 694 && field2762 <= 724 && field14 >= 168 && field14 < 205 && field2397[5] != -1) {
			field2364 = true;
			field1055 = true;
			field330 = 5;
		}
		if (field2762 >= 722 && field2762 <= 756 && field14 >= 169 && field14 < 205 && field2397[6] != -1) {
			field1055 = true;
			field330 = 6;
			field2364 = true;
		}
		if (field2762 >= 540 && field2762 <= 574 && field14 >= 466 && field14 < 502 && field2397[7] != -1) {
			field330 = 7;
			field2364 = true;
			field1055 = true;
		}
		if (field2762 >= 572 && field2762 <= 602 && field14 >= 466 && field14 < 503 && field2397[8] != -1) {
			field1055 = true;
			field2364 = true;
			field330 = 8;
		}
		if (field2762 >= 599 && field2762 <= 629 && field14 >= 466 && field14 < 503 && field2397[9] != -1) {
			field2364 = true;
			field330 = 9;
			field1055 = true;
		}
		if (field2762 >= 627 && field2762 <= 671 && field14 >= 467 && field14 < 502 && field2397[10] != -1) {
			field330 = 10;
			field2364 = true;
			field1055 = true;
		}
		if (field2762 >= 669 && field2762 <= 699 && field14 >= 466 && field14 < 503 && field2397[11] != -1) {
			field330 = 11;
			field1055 = true;
			field2364 = true;
		}
		if (field2762 >= 696 && field2762 <= 726 && field14 >= 466 && field14 < 503 && field2397[12] != -1) {
			field1055 = true;
			field2364 = true;
			field330 = 12;
		}
		if (field2762 >= 724 && field2762 <= 758 && field14 >= 466 && field14 < 502 && field2397[13] != -1) {
			field330 = 13;
			field1055 = true;
			field2364 = true;
			return;
		}
	}

	@ObfuscatedName("cc.b(B)V")
	public static void method271() {
		if (field3050 != 1) {
			return;
		}
		if (field2762 >= 6 && field2762 <= 106 && field14 >= 467 && field14 <= 499) {
			field504 = true;
			field1864 = (field1864 + 1) % 4;
			field2637 = true;
			out.method415(32);
			out.p1(field1864);
			out.p1(field236);
			out.p1(field2828);
		}
		if (field2762 >= 135 && field2762 <= 235 && field14 >= 467 && field14 <= 499) {
			field2637 = true;
			field236 = (field236 + 1) % 3;
			field504 = true;
			out.method415(32);
			out.p1(field1864);
			out.p1(field236);
			out.p1(field2828);
		}
		if (field2762 >= 273 && field2762 <= 373 && field14 >= 467 && field14 <= 499) {
			field2828 = (field2828 + 1) % 3;
			field504 = true;
			field2637 = true;
			out.method415(32);
			out.p1(field1864);
			out.p1(field236);
			out.p1(field2828);
		}
		if (field2762 < 412 || field2762 > 512 || field14 < 467 || field14 > 499) {
			return;
		}
		if (field3227 == -1) {
			method413();
			if (field1844 != -1) {
				Statics.field3268 = false;
				Statics.field3215 = field3227 = field1844;
				Statics.field3217 = Statics.field3234;
				return;
			}
		} else {
			method758(0, Text.field1921, Statics.field3234);
		}
		return;
	}

	@ObfuscatedName("kc.a(BIIIIII)V")
	public static void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!IfType.method1052(arg3)) {
			return;
		}
		method618(arg4, arg2, 0, arg1, arg5, -1, IfType.field2922[arg3], arg0, 0);
		if (field548 == null) {
			return;
		}
		IfType var6 = field548;
		IfType var7 = IfType.method1009(var6);
		if (var7 == null) {
			return;
		}
		int[] var8 = IfType.method325(var7);
		int[] var9 = IfType.method325(var6);
		int var10 = var9[1] + ClientMouseListener.field2568 - var8[1] - field2392;
		int var11 = var9[0] + ClientMouseListener.field741 - var8[0] - field419;
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
		if (field548.field2475 != null && (arg1 & 0x200) != 0) {
			ScriptRunner.method754(var6.field2475, var10, var6, var11);
		}
		if (field801 != 0 || (arg1 & 0x400) == 0) {
			return;
		}
		if (field548.field2501 != null) {
			ScriptRunner.method754(var6.field2501, var10, var6, var11);
		}
		field548 = null;
		return;
	}

	@ObfuscatedName("hd.g(I)V")
	public static void method482() {
		while (ClientKeyboardListener.method685()) {
			if (field3227 != -1 && field3227 == Statics.field3215) {
				if (field2885 == 85 && Statics.field3217.method10() > 0) {
					Statics.field3217 = Statics.field3217.method19(0, Statics.field3217.method10() - 1);
				}
				if ((Statics.method936(Statics.field2920) || Statics.field2920 == 32) && Statics.field3217.method10() < 12) {
					Statics.field3217 = Statics.field3217.method21(Statics.field2920);
				}
			} else if (field1001) {
				if (field2885 == 85 && Statics.field3232.method10() > 0) {
					Statics.field3232 = Statics.field3232.method19(0, Statics.field3232.method10() - 1);
					field2637 = true;
				}
				if (Statics.method45(Statics.field2920) && Statics.field3232.method10() < 80) {
					Statics.field3232 = Statics.field3232.method21(Statics.field2920);
					field2637 = true;
				}
				if (field2885 == 84) {
					field1001 = false;
					field2637 = true;
					if (field1924 == 1) {
						long var9 = Statics.field3232.toUserhash();
						Statics.method703(var9);
					}
					if (field1924 == 2 && field1492 > 0) {
						long var11 = Statics.field3232.toUserhash();
						method624(var11);
					}
					if (field1924 == 3 && Statics.field3232.method10() > 0) {
						out.method415(207);
						out.p1(0);
						int var13 = out.pos;
						out.p8(Statics.field958);
						Statics.method105(Statics.field3232, out);
						out.method155(out.pos - var13);
						if (field236 == 2) {
							field236 = 1;
							field504 = true;
							out.method415(32);
							out.p1(field1864);
							out.p1(field236);
							out.p1(field2828);
						}
					}
					if (field1924 == 4 && Statics.field2146 < 100) {
						long var14 = Statics.field3232.toUserhash();
						method383(var14);
					}
					if (field1924 == 5 && Statics.field2146 > 0) {
						long var16 = Statics.field3232.toUserhash();
						method544(var16);
					}
				}
			} else if (field2811 == 1) {
				if (field2885 == 85 && Statics.field3210.method10() > 0) {
					Statics.field3210 = Statics.field3210.method19(0, Statics.field3210.method10() - 1);
					field2637 = true;
				}
				if (Statics.method1037(Statics.field2920) && Statics.field3210.method10() < 10) {
					Statics.field3210 = Statics.field3210.method21(Statics.field2920);
					field2637 = true;
				}
				if (field2885 == 84) {
					if (Statics.field3210.method10() > 0) {
						int var0 = 0;
						if (Statics.field3210.method33()) {
							var0 = Statics.field3210.method3();
						}
						out.method415(238);
						out.p4(var0);
					}
					field2637 = true;
					field2811 = 0;
				}
			} else if (field2811 == 2) {
				if (field2885 == 85 && Statics.field3210.method10() > 0) {
					Statics.field3210 = Statics.field3210.method19(0, Statics.field3210.method10() - 1);
					field2637 = true;
				}
				if ((Statics.method936(Statics.field2920) || Statics.field2920 == 32) && Statics.field3210.method10() < 12) {
					Statics.field3210 = Statics.field3210.method21(Statics.field2920);
					field2637 = true;
				}
				if (field2885 == 84) {
					if (Statics.field3210.method10() > 0) {
						out.method415(86);
						out.p8(Statics.field3210.toUserhash());
					}
					field2811 = 0;
					field2637 = true;
				}
			} else if (field2811 == 3) {
				if (field2885 == 85 && Statics.field3210.method10() > 0) {
					Statics.field3210 = Statics.field3210.method19(0, Statics.field3210.method10() - 1);
					field2637 = true;
				}
				if (Statics.method45(Statics.field2920) && Statics.field3210.method10() < 40) {
					Statics.field3210 = Statics.field3210.method21(Statics.field2920);
					field2637 = true;
				}
			} else if (field2166 == -1 && field1143 == -1) {
				if (field2885 == 85 && Statics.field3223.method10() > 0) {
					Statics.field3223 = Statics.field3223.method19(0, Statics.field3223.method10() - 1);
					field2637 = true;
				}
				if (Statics.method45(Statics.field2920) && Statics.field3223.method10() < 80) {
					Statics.field3223 = Statics.field3223.method21(Statics.field2920);
					field2637 = true;
				}
				if (field2885 == 84 && Statics.field3223.method10() > 0) {
					if (staffmodlevel == 2) {
						if (Statics.field3223.strEquals(Statics.field2783)) {
							method960();
						}
						if (Statics.field3223.strEquals(Statics.field676)) {
							showFps = true;
						}
						if (Statics.field3223.strEquals(Statics.field2968)) {
							showFps = false;
						}
						if (Statics.field3223.strEquals(Statics.field789)) {
							for (int var1 = 0; var1 < 4; var1++) {
								for (int var2 = 1; var2 < 103; var2++) {
									for (int var3 = 1; var3 < 103; var3++) {
										collision[var1].field201[var2][var3] = 0;
									}
								}
							}
						}
						if (Statics.field3223.strEquals(Statics.field2497) && modewhere == 2) {
							throw new RuntimeException();
						}
						if (Statics.field3223.strEquals(Statics.field228)) {
							Statics.field953 = true;
						}
					}
					if (Statics.field3223.method26(Statics.field1765)) {
						out.method415(248);
						out.p1(Statics.field3223.method10() - 1);
						out.pjstr(Statics.field3223.method1(2));
					} else {
						byte var4 = 0;
						JagString var5 = Statics.field3223.method30();
						byte var6 = 0;
						if (var5.method26(Text.field2391)) {
							var6 = 0;
							Statics.field3223 = Statics.field3223.method1(Text.field2391.method10());
						} else if (var5.method26(Text.field326)) {
							Statics.field3223 = Statics.field3223.method1(Text.field326.method10());
							var6 = 1;
						} else if (var5.method26(Text.field64)) {
							var6 = 2;
							Statics.field3223 = Statics.field3223.method1(Text.field64.method10());
						} else if (var5.method26(Text.field2296)) {
							var6 = 3;
							Statics.field3223 = Statics.field3223.method1(Text.field2296.method10());
						} else if (var5.method26(Text.field63)) {
							var6 = 4;
							Statics.field3223 = Statics.field3223.method1(Text.field63.method10());
						} else if (var5.method26(Text.field2077)) {
							Statics.field3223 = Statics.field3223.method1(Text.field2077.method10());
							var6 = 5;
						} else if (var5.method26(Text.field2157)) {
							var6 = 6;
							Statics.field3223 = Statics.field3223.method1(Text.field2157.method10());
						} else if (var5.method26(Text.field1885)) {
							var6 = 7;
							Statics.field3223 = Statics.field3223.method1(Text.field1885.method10());
						} else if (var5.method26(Text.field2767)) {
							var6 = 8;
							Statics.field3223 = Statics.field3223.method1(Text.field2767.method10());
						} else if (var5.method26(Text.field2583)) {
							var6 = 9;
							Statics.field3223 = Statics.field3223.method1(Text.field2583.method10());
						} else if (var5.method26(Text.field2477)) {
							Statics.field3223 = Statics.field3223.method1(Text.field2477.method10());
							var6 = 10;
						} else if (var5.method26(Text.field2598)) {
							Statics.field3223 = Statics.field3223.method1(Text.field2598.method10());
							var6 = 11;
						}
						JagString var7 = Statics.field3223.method30();
						if (var7.method26(Text.field2317)) {
							var4 = 1;
							Statics.field3223 = Statics.field3223.method1(Text.field2317.method10());
						} else if (var7.method26(Text.field3054)) {
							var4 = 2;
							Statics.field3223 = Statics.field3223.method1(Text.field3054.method10());
						} else if (var7.method26(Text.field1545)) {
							Statics.field3223 = Statics.field3223.method1(Text.field1545.method10());
							var4 = 3;
						} else if (var7.method26(Text.field1195)) {
							var4 = 4;
							Statics.field3223 = Statics.field3223.method1(Text.field1195.method10());
						} else if (var7.method26(Text.field2707)) {
							var4 = 5;
							Statics.field3223 = Statics.field3223.method1(Text.field2707.method10());
						}
						out.method415(75);
						out.p1(0);
						int var8 = out.pos;
						out.p1(var6);
						out.p1(var4);
						Statics.method105(Statics.field3223, out);
						out.method155(out.pos - var8);
						if (field1864 == 2) {
							field504 = true;
							field1864 = 3;
							out.method415(32);
							out.p1(field1864);
							out.p1(field236);
							out.p1(field2828);
						}
					}
					field2637 = true;
					Statics.field3223 = Statics.field3234;
				}
			}
		}
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

	@ObfuscatedName("kd.a(IIIIIII[Lqd;II)V")
	public static void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IfType[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < arg6.length; var9++) {
			IfType var10 = arg6[var9];
			if (var10 != null && (var10.field2489 == 0 || var10.field2494) && var10 != null && var10.field2454 == arg5 && (!var10.field2556 || Statics.field953)) {
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
					if (ClientMouseListener.field741 >= var16 && var14 <= ClientMouseListener.field2568 && var18 > ClientMouseListener.field741 && var17 > ClientMouseListener.field2568) {
						var19 = true;
					} else {
						var19 = false;
					}
					boolean var20 = false;
					if (field801 == 1 && var19) {
						var20 = true;
					}
					boolean var21 = false;
					if (var10.field2544 != -1 && var20 && field548 == null) {
						field419 = ClientMouseListener.field741;
						field548 = var10;
						field2392 = ClientMouseListener.field2568;
					}
					if (field3050 == 1 && var16 <= field2762 && field14 >= var14 && field2762 < var18 && field14 < var17) {
						var21 = true;
					}
					if (field548 != null) {
						var20 = false;
						var19 = false;
						var21 = false;
					}
					if (!var10.field2536 && var21 && (arg3 & 0x1) != 0) {
						var10.field2536 = true;
						if (var10.field2487 != null) {
							ScriptRunner.method754(var10.field2487, field14 - var12, var10, field2762 - var11);
						}
					}
					if (var10.field2536 && var20 && (arg3 & 0x4) != 0 && var10.field2553 != null) {
						ScriptRunner.method754(var10.field2553, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
					}
					if (var10.field2536 && !var20 && (arg3 & 0x2) != 0) {
						var10.field2536 = false;
						if (var10.field2513 != null) {
							ScriptRunner.method754(var10.field2513, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
						}
					}
					if (var20 && (arg3 & 0x8) != 0 && var10.field2450 != null) {
						ScriptRunner.method754(var10.field2450, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
					}
					if (!var10.field2488 && var19 && (arg3 & 0x10) != 0) {
						var10.field2488 = true;
						if (var10.field2464 != null) {
							ScriptRunner.method754(var10.field2464, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
						}
					}
					if (var10.field2488 && var19 && (arg3 & 0x40) != 0 && var10.field2486 != null) {
						ScriptRunner.method754(var10.field2486, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
					}
					if (var10.field2488 && !var19 && (arg3 & 0x20) != 0) {
						var10.field2488 = false;
						if (var10.field2478 != null) {
							ScriptRunner.method754(var10.field2478, ClientMouseListener.field2568 - var12, var10, ClientMouseListener.field741 - var11);
						}
					}
					if (var10.field2518 != null && (arg3 & 0x80) != 0) {
						ScriptRunner.method754(var10.field2518, 0, var10, 0);
					}
					if (loopCycle == Statics.field1237 && var10.field2456 != null && (arg3 & 0x100) != 0) {
						ScriptRunner.method754(var10.field2456, 0, var10, 0);
					}
				}
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
					Statics.field1497 = var11;
				}
				if ((var12.field2527 >= 0 || var12.field2525 != 0) && var14 <= arg7 && var13 <= arg4 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
					if (var12.field2527 >= 0) {
						Statics.field903 = var12.field2527;
					} else {
						Statics.field903 = var11;
					}
				}
				if (var12.field2489 != 0) {
					if (var12.field2520 == 1 && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && var12.field2449 + var13 > arg4) {
						boolean var15 = false;
						if (var12.field2445 != 0) {
							var15 = method104(var12);
						}
						if (!var15) {
							method398(0, var12.field2482, var12.field2495, 0, 42, Statics.field3234);
						}
					}
					if (var12.field2520 == 2 && field594 == 0 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var13 + var12.field2449) {
						method398(0, var12.field2470, var12.field2495, 0, 33, JagString.join(new JagString[]{Statics.field2564, var12.field2515}));
					}
					if (var12.field2520 == 3 && arg7 >= var14 && arg4 >= var13 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						byte var16;
						if (arg6 == 3) {
							var16 = 40;
						} else {
							var16 = 9;
						}
						method398(0, Text.field2310, var12.field2495, 0, var16, Statics.field3234);
					}
					if (var12.field2520 == 4 && arg7 >= var14 && var13 <= arg4 && arg7 < var12.field2498 + var14 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 23, Statics.field3234);
					}
					if (var12.field2520 == 5 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && var12.field2449 + var13 > arg4) {
						method398(0, var12.field2482, var12.field2495, 0, 57, Statics.field3234);
					}
					if (var12.field2520 == 6 && field2998 == -1 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.field2498 && arg4 < var12.field2449 + var13) {
						method398(0, var12.field2482, var12.field2495, 0, 54, Statics.field3234);
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
									field2704 = var17;
									if (var12.field2491[var17] > 0) {
										ObjType var22 = ObjType.list(var12.field2491[var17] - 1);
										if (field475 == 1 && var12.field2533) {
											if (Statics.field1075 != var12.field2495 || Statics.field2281 != var17) {
												method398(var22.field2883, Text.field584, var12.field2495, var17, 56, JagString.join(new JagString[]{Statics.field3177, Statics.field328, var22.field2827}));
											}
										} else if (field594 != 1 || !var12.field2533) {
											JagString[] var23 = var22.field2830;
											if (field2934) {
												var23 = Statics.method905(var23);
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
														method398(var22.field2883, var23[var24], var12.field2495, var17, var25, JagString.join(new JagString[]{field2334, var22.field2827}));
													} else if (var24 == 4) {
														method398(var22.field2883, Text.field487, var12.field2495, var17, 11, JagString.join(new JagString[]{field2334, var22.field2827}));
													}
												}
											}
											if (var12.field2461) {
												method398(var22.field2883, Text.field584, var12.field2495, var17, 19, JagString.join(new JagString[]{field2334, var22.field2827}));
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
														method398(var22.field2883, var23[var26], var12.field2495, var17, var27, JagString.join(new JagString[]{field2334, var22.field2827}));
													}
												}
											}
											JagString[] var28 = var12.field2504;
											if (field2934) {
												var28 = Statics.method905(var28);
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
														method398(var22.field2883, var28[var29], var12.field2495, var17, var30, JagString.join(new JagString[]{field2334, var22.field2827}));
													}
												}
											}
											method398(var22.field2883, Text.field2805, var12.field2495, var17, 1006, JagString.join(new JagString[]{field2334, var22.field2827}));
										} else if ((Statics.field2846 & 0x10) == 16) {
											method398(var22.field2883, Statics.field1523, var12.field2495, var17, 37, JagString.join(new JagString[]{Statics.field1384, Statics.field328, var22.field2827}));
										}
									}
								}
								var17++;
							}
						}
					}
					if (var12.field2442 && var12.field2524 != -1 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.field2498 + var14 && arg4 < var12.field2449 + var13) {
						ObjType var31 = ObjType.list(var12.field2524);
						if (var12.field2533) {
							JagString[] var32 = var31.field2830;
							if (field2934) {
								var32 = Statics.method905(var32);
							}
							if (var32 == null || var32[4] == null) {
								method398(var31.field2883, Text.field487, var12.field2495, var12.field2542 - 1, 11, JagString.join(new JagString[]{field2334, var31.field2827}));
							} else {
								method398(var31.field2883, var32[4], var12.field2495, var12.field2542 - 1, 11, JagString.join(new JagString[]{field2334, var31.field2827}));
							}
							if (var32 != null && var32[3] != null) {
								method398(var31.field2883, var32[3], var12.field2495, var12.field2542 - 1, 43, JagString.join(new JagString[]{field2334, var31.field2827}));
							}
							if (var32 != null && var32[2] != null) {
								method398(var31.field2883, var32[2], var12.field2495, var12.field2542 - 1, 31, JagString.join(new JagString[]{field2334, var31.field2827}));
							}
							if (var32 != null && var32[1] != null) {
								method398(var31.field2883, var32[1], var12.field2495, var12.field2542 - 1, 6, JagString.join(new JagString[]{field2334, var31.field2827}));
							}
							if (var32 != null && var32[0] != null) {
								method398(var31.field2883, var32[0], var12.field2495, var12.field2542 - 1, 52, JagString.join(new JagString[]{field2334, var31.field2827}));
							}
						}
						if (var12.field2495 >= 0) {
							method398(var31.field2883, Text.field2805, var12.field2495, -1, 1007, JagString.join(new JagString[]{field2334, var31.field2827}));
						} else {
							method398(var31.field2883, Text.field2805, var12.field2454, var12.field2495 & 0x7FFF, 1007, JagString.join(new JagString[]{field2334, var31.field2827}));
						}
					}
					if (var12.field2494 && var12.field2467 != null && var14 <= arg7 && var13 <= arg4 && var12.field2498 + var14 > arg7 && arg4 < var12.field2449 + var13) {
						JagString var33 = Statics.field3234;
						if (var12.field2524 != -1) {
							ObjType var34 = ObjType.list(var12.field2524);
							var33 = JagString.join(new JagString[]{field2334, var34.field2827});
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
				} else if (!var12.field2556 || method631(arg6, var11) || Statics.field953) {
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

	@ObfuscatedName("fe.a(III)V")
	public static void method414(int arg0, int arg1) {
		out.method415(132);
		out.method179(arg1);
		out.method162(arg0);
	}

	@ObfuscatedName("n.a(Z)V")
	public static void method717() {
		method594();
		if (field1587 == 2) {
			int[] var0 = Statics.field2747;
			byte[] var1 = field1845.data;
			int var2 = var1.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (var1[var3] == 0) {
					var0[var3] = 0;
				}
			}
			field1239.method554(0, 0, 33, 33, 25, 25, field2797, 256, field1556, field1560);
			Statics.method454();
			return;
		}
		int var4 = localPlayer.field1972 / 32 + 48;
		int var5 = 464 - localPlayer.field1963 / 32;
		int var6 = field2158 + field2797 & 0x7FF;
		field2626.method554(25, 5, 146, 151, var4, var5, var6, field2589 + 256, field2588, field1842);
		for (int var7 = 0; var7 < Statics.field1433; var7++) {
			int var8 = Statics.field2023[var7] * 4 + 2 - localPlayer.field1972 / 32;
			int var9 = Statics.field2303[var7] * 4 + 2 - localPlayer.field1963 / 32;
			method387(var9, var8, Statics.field3046[var7]);
		}
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				LinkList var12 = groundObj[minusedlevel][var10][var11];
				if (var12 != null) {
					int var13 = var11 * 4 + 2 - localPlayer.field1963 / 32;
					int var14 = var10 * 4 + 2 - localPlayer.field1972 / 32;
					method387(var13, var14, field1578[0]);
				}
			}
		}
		for (int var15 = 0; var15 < field1341; var15++) {
			ClientNpc var16 = field2992[field677[var15]];
			if (var16 != null && var16.method42()) {
				NpcType var17 = var16.field3182;
				if (var17.field1136 != null) {
					var17 = var17.method457();
				}
				if (var17 != null && var17.field1140 && var17.field1082) {
					int var18 = var16.field1972 / 32 - localPlayer.field1972 / 32;
					int var19 = var16.field1963 / 32 - localPlayer.field1963 / 32;
					method387(var19, var18, field1578[1]);
				}
			}
		}
		for (int var20 = 0; var20 < field2939; var20++) {
			ClientPlayer var21 = field2030[field2758[var20]];
			if (var21 != null && var21.method42()) {
				int var22 = var21.field1972 / 32 - localPlayer.field1972 / 32;
				int var23 = var21.field1963 / 32 - localPlayer.field1963 / 32;
				boolean var24 = false;
				long var25 = var21.field86.toUserhash();
				for (int var27 = 0; var27 < field1492; var27++) {
					if (field2929[var27] == var25 && field1788[var27] != 0) {
						var24 = true;
						break;
					}
				}
				boolean var28 = false;
				if (localPlayer.field74 != 0 && var21.field74 != 0 && localPlayer.field74 == var21.field74) {
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
		if (field96 != 0 && loopCycle % 20 < 10) {
			if (field96 == 1 && Statics.field3212 >= 0 && field2992.length > Statics.field3212) {
				ClientNpc var29 = field2992[Statics.field3212];
				if (var29 != null) {
					int var30 = var29.field1972 / 32 - localPlayer.field1972 / 32;
					int var31 = var29.field1963 / 32 - localPlayer.field1963 / 32;
					method400(var30, field680[1], var31);
				}
			}
			if (field96 == 2) {
				int var32 = (field226 - field1408) * 4 + 2 - localPlayer.field1963 / 32;
				int var33 = (Statics.field3304 - field806) * 4 + 2 - localPlayer.field1972 / 32;
				method400(var33, field680[1], var32);
			}
			if (field96 == 10 && Statics.field3290 >= 0 && field2030.length > Statics.field3290) {
				ClientPlayer var34 = field2030[Statics.field3290];
				if (var34 != null) {
					int var35 = var34.field1963 / 32 - localPlayer.field1963 / 32;
					int var36 = var34.field1972 / 32 - localPlayer.field1972 / 32;
					method400(var36, field680[1], var35);
				}
			}
		}
		if (field941 != 0) {
			int var37 = field941 * 4 + 2 - localPlayer.field1972 / 32;
			int var38 = field2720 * 4 + 2 - localPlayer.field1963 / 32;
			method387(var38, var37, field680[0]);
		}
		Pix2D.fillRect(97, 78, 3, 3, 16777215);
		field1239.method554(0, 0, 33, 33, 25, 25, field2797, 256, field1556, field1560);
		Statics.method454();
	}

	@ObfuscatedName("kc.a(BZ)V")
	public static void preventTimeout(boolean arg0) {
		field1179++;
		if (field1179 < 50 && !arg0) {
			return;
		}
		field1179 = 0;
		if (networkError || stream == null) {
			return;
		}
		out.method415(13);
		try {
			stream.write(out.pos, out.data);
			out.pos = 0;
		} catch (IOException var1) {
			networkError = true;
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public static void clearCaches() {
		FloType.method265();
		FluType.method234();
		IdkType.method854();
		LocType.method859();
		NpcType.method481();
		ObjType.method254();
		SeqType.method233();
		SpotType.method995();
		VarBitType.method807();
		VarpType.method191();
		PlayerModel.method873();
		IfType.method726();
		((TextureManager) Pix3D.field771).method691();
		ClientScript.field830.clear();
		anims.method236();
		bases.method236();
		interfaces.method236();
		jagFX.method236();
		maps.method236();
		songs.method236();
		models.method236();
		sprites.method236();
		textures.method236();
		binary.method236();
		jingles.method236();
		scripts.method236();
	}

	@ObfuscatedName("rc.a(IIIIIIII)V")
	public static void locChangeUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg0 < 1 || arg2 > 102 || arg0 > 102) {
			return;
		}
		if (lowMem && minusedlevel != arg6) {
			return;
		}
		int var7 = 0;
		if (arg5 == 0) {
			var7 = world.wallType(arg6, arg2, arg0);
		}
		if (arg5 == 1) {
			var7 = world.method47(arg6, arg2, arg0);
		}
		if (arg5 == 2) {
			var7 = world.method66(arg6, arg2, arg0);
		}
		if (arg5 == 3) {
			var7 = world.method49(arg6, arg2, arg0);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = world.method97(arg6, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg5 == 0) {
				world.method80(arg6, arg2, arg0);
				LocType var12 = LocType.list(var8);
				if (var12.field1284) {
					collision[arg6].method112(arg2, var10, var12.field1311, arg0, var11);
				}
			}
			if (arg5 == 1) {
				world.method83(arg6, arg2, arg0);
			}
			if (arg5 == 2) {
				world.method91(arg6, arg2, arg0);
				LocType var13 = LocType.list(var8);
				if (arg2 + var13.field1286 > 103 || var13.field1286 + arg0 > 103 || var13.field1298 + arg2 > 103 || var13.field1298 + arg0 > 103) {
					return;
				}
				if (var13.field1284) {
					collision[arg6].method113(var13.field1311, arg0, arg2, var10, var13.field1286, var13.field1298);
				}
			}
			if (arg5 == 3) {
				world.method87(arg6, arg2, arg0);
				LocType var14 = LocType.list(var8);
				if (var14.field1284 && var14.field1329 == 1) {
					collision[arg6].method109(arg0, arg2);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		int var15 = arg6;
		if (arg6 < 3 && (ClientBuild.mapl[1][arg2][arg0] & 0x2) == 2) {
			var15 = arg6 + 1;
		}
		ClientBuild.method270(collision[arg6], arg1, var15, arg6, arg3, world, arg4, arg0, arg2);
		return;
	}

	@ObfuscatedName("ad.a(I)V")
	public static void method108() {
		Statics.field469 = null;
		Statics.field842 = null;
		Statics.field1397 = null;
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

	@ObfuscatedName("d.a(Ljava/awt/Component;BLbd;)V")
	public static void method297(Component arg0, Js5 arg1) {
		if (field1159) {
			return;
		}
		field1366 = PixLoader.method605(Statics.field1567, Statics.field479, arg1);
		field2187 = PixLoader.method605(Statics.field62, Statics.field479, arg1);
		field1845 = PixLoader.method605(Statics.field2333, Statics.field479, arg1);
		field2770 = PixLoader.method605(Statics.field2927, Statics.field479, arg1);
		field2745 = PixLoader.method605(Statics.field406, Statics.field479, arg1);
		field279 = PixLoader.method605(Statics.field533, Statics.field479, arg1);
		field1558 = PixMap.method875(96, 479, arg0);
		field2187.method329(0, 0);
		field11 = PixMap.method875(156, 172, arg0);
		Pix2D.method920();
		field1845.method329(0, 0);
		field1167 = PixMap.method875(261, 190, arg0);
		field1366.method329(0, 0);
		field925 = PixMap.method875(334, 512, arg0);
		Pix2D.method920();
		field3208 = PixMap.method875(50, 496, arg0);
		field1553 = PixMap.method875(37, 269, arg0);
		field993 = PixMap.method875(45, 249, arg0);
		Pix32 var2 = PixLoader.method1038(arg1, Statics.field3020, Statics.field479);
		field2587 = PixMap.method875(var2.hi, var2.wi, arg0);
		var2.method557(0, 0);
		Pix32 var3 = PixLoader.method1038(arg1, Statics.field2162, Statics.field479);
		field522 = PixMap.method875(var3.hi, var3.wi, arg0);
		var3.method557(0, 0);
		Pix32 var4 = PixLoader.method1038(arg1, Statics.field455, Statics.field479);
		field2045 = PixMap.method875(var4.hi, var4.wi, arg0);
		var4.method557(0, 0);
		Pix32 var5 = PixLoader.method1038(arg1, Statics.field2682, Statics.field479);
		field1438 = PixMap.method875(var5.hi, var5.wi, arg0);
		var5.method557(0, 0);
		Pix32 var6 = PixLoader.method1038(arg1, field609, Statics.field479);
		field2899 = PixMap.method875(var6.hi, var6.wi, arg0);
		var6.method557(0, 0);
		Pix32 var7 = PixLoader.method1038(arg1, Statics.field2798, Statics.field479);
		field1780 = PixMap.method875(var7.hi, var7.wi, arg0);
		var7.method557(0, 0);
		Pix32 var8 = PixLoader.method1038(arg1, Statics.field2355, Statics.field479);
		field3021 = PixMap.method875(var8.hi, var8.wi, arg0);
		var8.method557(0, 0);
		Pix32 var9 = PixLoader.method1038(arg1, Statics.field318, Statics.field479);
		field1689 = PixMap.method875(var9.hi, var9.wi, arg0);
		var9.method557(0, 0);
		Pix32 var10 = PixLoader.method1038(arg1, Statics.field478, Statics.field479);
		field843 = PixMap.method875(var10.hi, var10.wi, arg0);
		var10.method557(0, 0);
		field2731 = PixLoader.method605(Statics.field1169, Statics.field479, arg1);
		field1598 = PixLoader.method605(Statics.field2910, Statics.field479, arg1);
		field1871 = PixLoader.method605(Statics.field3163, Statics.field479, arg1);
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
		field2807 = PixLoader.method372(arg1, Statics.field2818, Statics.field479);
		field2588 = new int[151];
		field1560 = new int[33];
		field1556 = new int[33];
		field1842 = new int[151];
		for (int var11 = 0; var11 < 33; var11++) {
			int var12 = 0;
			int var13 = 999;
			for (int var14 = 0; var14 < 34; var14++) {
				if (field1845.data[field1845.wi * var11 + var14] == 0) {
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
				if (field1845.data[field1845.wi * var15 + var18] == 0 && (var18 > 34 || var15 > 34)) {
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

	@ObfuscatedName("te.a(II)La;")
	public static JagString method973(int arg0) {
		return arg0 < 999999999 ? Statics.method502(arg0) : Statics.field989;
	}

	@ObfuscatedName("te.a(III)V")
	public static void method974(int arg0, int arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < 100; var3++) {
			if (field2034[var3] != null) {
				int var4 = Statics.field3236[var3];
				int var5 = field1340 + 4 + 70 - var2 * 14;
				if (var5 < -20) {
					break;
				}
				if (var4 == 0) {
					var2++;
				}
				JagString var6 = Statics.field3130[var3];
				if (var6 != null && var6.method26(Statics.field2612)) {
					var6 = var6.method1(5);
				}
				if (var6 != null && var6.method26(Statics.field2535)) {
					var6 = var6.method1(5);
				}
				if ((var4 == 1 || var4 == 2) && (var4 == 1 || field1864 == 0 || field1864 == 1 && Statics.method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5 && !var6.strEquals(localPlayer.field86)) {
						if (staffmodlevel >= 1) {
							method398(0, Text.field1038, 0, 0, 28, JagString.join(new JagString[]{Statics.field1393, var6}));
						}
						method398(0, Text.field1933, 0, 0, 51, JagString.join(new JagString[]{Statics.field1393, var6}));
						method398(0, Text.field1364, 0, 0, 45, JagString.join(new JagString[]{Statics.field1393, var6}));
					}
					var2++;
				}
				if ((var4 == 3 || var4 == 7) && field216 == 0 && (var4 == 7 || field236 == 0 || field236 == 1 && Statics.method242(var6))) {
					var2++;
					if (arg1 > var5 - 14 && arg1 <= var5) {
						if (staffmodlevel >= 1) {
							method398(0, Text.field1038, 0, 0, 28, JagString.join(new JagString[]{Statics.field1393, var6}));
						}
						method398(0, Text.field1933, 0, 0, 51, JagString.join(new JagString[]{Statics.field1393, var6}));
						method398(0, Text.field1364, 0, 0, 45, JagString.join(new JagString[]{Statics.field1393, var6}));
					}
				}
				if (var4 == 4 && (field2828 == 0 || field2828 == 1 && Statics.method242(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5) {
						method398(0, Text.field2610, 0, 0, 26, JagString.join(new JagString[]{Statics.field1393, var6}));
					}
					var2++;
				}
				if ((var4 == 5 || var4 == 6) && field216 == 0 && field236 < 2) {
					var2++;
				}
				if (var4 == 8 && (field2828 == 0 || field2828 == 1 && Statics.method242(var6))) {
					if (var5 - 14 < arg1 && arg1 <= var5) {
						method398(0, Text.field1432, 0, 0, 46, JagString.join(new JagString[]{Statics.field1393, var6}));
					}
					var2++;
				}
			}
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
		Statics.field1661 = null;
		Text.field1685 = null;
		field1672 = null;
		Statics.field1668 = null;
		Text.field1674 = null;
		field1659 = null;
		field1655 = null;
		field1689 = null;
		Text.field1676 = null;
		Text.field1657 = null;
		Statics.field1673 = null;
		Statics.field1691 = null;
	}

	@ObfuscatedName("tc.b(I)V")
	public static void setLowMem() {
		World.field115 = true;
		lowMem = true;
	}

	@ObfuscatedName("ca.b(I)V")
	public static void setHighMem() {
		lowMem = false;
		World.field115 = false;
	}

	@ObfuscatedName("bb.a(IIIIBLqd;III)V")
	public static void method192(int arg0, int arg1, int arg2, int arg3, IfType arg4, int arg5, int arg6, int arg7) {
		if (field3024) {
			field2573 = 32;
		} else {
			field2573 = 0;
		}
		field3024 = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.field2537 -= field3176 * 4;
			if (arg6 == 1) {
				field1055 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				field2637 = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.field2537 += field3176 * 4;
			if (arg6 == 2 || arg6 == 3) {
				field2637 = true;
			}
			if (arg6 == 1) {
				field1055 = true;
			}
		} else if (arg5 - field2573 <= arg2 && arg2 < field2573 + arg5 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && field3176 > 0) {
			field3024 = true;
			int var8 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				field2637 = true;
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

	@ObfuscatedName("kd.a(JI)V")
	public static void method624(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field1492; var2++) {
			if (field2929[var2] == arg0) {
				field1492--;
				field1055 = true;
				for (int var3 = var2; var3 < field1492; var3++) {
					field2951[var3] = field2951[var3 + 1];
					field1788[var3] = field1788[var3 + 1];
					field2929[var3] = field2929[var3 + 1];
				}
				out.method415(255);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("ob.a(I)V")
	public static void method755() {
		field1941 = true;
		method986();
		if (field1648 != -1) {
			boolean var0 = method478(field1648, 261, 1, 190);
			if (!var0) {
				field1055 = true;
			}
		} else if (field2397[field330] != -1) {
			boolean var1 = method478(field2397[field330], 261, 1, 190);
			if (!var1) {
				field1055 = true;
			}
		}
		if (isMenuOpen && field640 == 1) {
			if (lang == 1) {
				method660();
			} else {
				drawMinimenu();
			}
		}
		method901();
	}

	@ObfuscatedName("fc.a(ILa;IIIILa;)V")
	public static void method398(int arg0, JagString arg1, int arg2, int arg3, int arg4, JagString arg5) {
		if (menuNumEntries >= 500) {
			return;
		}
		if (arg5.method10() <= 0) {
			field2586[menuNumEntries] = arg1;
		} else {
			field2586[menuNumEntries] = JagString.join(new JagString[]{arg1, Text.field2337, arg5});
		}
		field1932[menuNumEntries] = arg4;
		field1770[menuNumEntries] = arg0;
		field994[menuNumEntries] = arg3;
		field2925[menuNumEntries] = arg2;
		menuNumEntries++;
	}

	@ObfuscatedName("fe.o(I)V")
	public static void method413() {
		out.method415(176);
		if (field1648 != -1) {
			IfType.method895(field1648);
			field2998 = -1;
			field2364 = true;
			field1055 = true;
			field1648 = -1;
		}
		if (field2166 != -1) {
			IfType.method895(field2166);
			field2998 = -1;
			field2637 = true;
			field2166 = -1;
		}
		if (field1143 != -1) {
			IfType.method895(field1143);
			field1143 = -1;
			setMainState(30);
		}
		if (field1881 != -1) {
			IfType.method895(field1881);
			field1881 = -1;
		}
		if (field3227 != -1) {
			IfType.method895(field3227);
			field3227 = -1;
			field2998 = -1;
		}
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
			Graphics var4 = canvas.getGraphics();
			field993.method101(516, var4, 160);
			field1553.method101(496, var4, 466);
		} catch (Exception var5) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("f.a(IJ)V")
	public static void method383(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Statics.field2146 >= 100) {
			method758(0, Text.field2582, Statics.field3234);
			return;
		}
		JagString var2 = Statics.method969(arg0).method36();
		for (int var3 = 0; var3 < Statics.field2146; var3++) {
			if (field2683[var3] == arg0) {
				method758(0, JagString.join(new JagString[]{var2, Text.field3295}), Statics.field3234);
				return;
			}
		}
		for (int var4 = 0; var4 < field1492; var4++) {
			if (field2929[var4] == arg0) {
				method758(0, JagString.join(new JagString[]{Text.field2172, var2, Text.field3138}), Statics.field3234);
				return;
			}
		}
		if (!var2.strEquals(localPlayer.field86)) {
			field2683[Statics.field2146++] = arg0;
			field1055 = true;
			out.method415(251);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("fa.a(IILjd;B)V")
	public static void method387(int arg0, int arg1, Pix32 arg2) {
		if (arg2 == null) {
			return;
		}
		int var3 = field2158 + field2797 & 0x7FF;
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 6400) {
			return;
		}
		int var5 = Model.field2256[var3];
		int var6 = var5 * 256 / (field2589 + 256);
		int var7 = Model.field2258[var3];
		int var8 = var7 * 256 / (field2589 + 256);
		int var9 = arg0 * var6 + arg1 * var8 >> 16;
		int var10 = arg0 * var8 - arg1 * var6 >> 16;
		if (var4 > 2500) {
			arg2.method555(field1845, var9 + 98 - arg2.owi / 2, -var10 + 79 + -(arg2.ohi / 2));
		} else {
			arg2.plotSprite(var9 + 4 + 94 - arg2.owi / 2, -(arg2.ohi / 2) + 83 + -var10 + -4);
		}
	}

	@ObfuscatedName("de.a(BIIIIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.method1052(arg3)) {
			method844(arg2, IfType.field2922[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@ObfuscatedName("sd.a(IBI)V")
	public static void method928(int arg0, int arg1) {
		if (field1554 != 0 && arg1 != -1) {
			Statics.method681(1, arg1, field1554, jingles);
			field1860 = arg0;
		}
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
			method398(0, Text.field3239, 0, 0, 13, JagString.join(new JagString[]{Statics.field1393, field2951[var1]}));
			method398(0, Text.field2778, 0, 0, 18, JagString.join(new JagString[]{Statics.field1393, field2951[var1]}));
			return true;
		} else if (var1 >= 401 && var1 <= 500) {
			method398(0, Text.field3239, 0, 0, 35, JagString.join(new JagString[]{Statics.field1393, arg0.field2474}));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hd.a(IIIBIII)Z")
	public static boolean method478(int arg0, int arg1, int arg2, int arg3) {
		return IfType.method1052(arg0) ? method278(arg2, 0, 0, 0, -1, arg1, arg3, 0, IfType.field2922[arg0]) : false;
	}

	@ObfuscatedName("l.a(III)Z")
	public static boolean method631(int arg0, int arg1) {
		if (arg0 == 0 && Statics.field2881 == arg1) {
			return true;
		} else if (arg0 == 1 && Statics.field214 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && field2712 == arg1;
		}
	}

	@ObfuscatedName("qa.a(Lnb;Z)V")
	public static void method835(ClientEntity arg0) {
		int var1 = arg0.field1999 * 128 + arg0.field1970 * 64;
		int var2 = arg0.field1986 - loopCycle;
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
		arg1.method211(Text.field1006, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method211(Text.field3193, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method211(Text.field2817, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method211(Text.field1657, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg1.method211(Text.field2393, 55, 41, 65535, true);
		}
		arg1.method211(Text.field49, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method211(Text.field3193, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method211(Text.field2817, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method211(Text.field1657, 184, 41, 16711680, true);
		}
		arg1.method211(Text.field1676, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method211(Text.field3193, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method211(Text.field2817, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method211(Text.field1657, 324, 41, 16711680, true);
		}
		arg1.method195(Text.field1038, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			Graphics var4 = canvas.getGraphics();
			field3208.method101(0, var4, 453);
		} catch (Exception var5) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("fa.a(BLqd;La;)La;")
	public static JagString method386(IfType arg0, JagString arg1) {
		if (arg1.method11(Statics.field2181) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.method11(Statics.field1938);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.method11(Statics.field2297);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.method11(Statics.field3277);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.method11(Statics.field2716);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.method11(Statics.field1166);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.method11(Statics.field1309);
													if (var7 == -1) {
														return arg1;
													}
													JagString var8 = Statics.field3234;
													if (Statics.field715 != null) {
														var8 = Statics.method984(Statics.field715.field813);
														try {
															if (Statics.field715.result != null) {
																byte[] var9 = ((String) Statics.field715.result).getBytes("ISO-8859-1");
																var8 = Statics.method419(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = JagString.join(new JagString[]{arg1.method19(0, var7), var8, arg1.method1(var7 + 4)});
												}
											}
											arg1 = JagString.join(new JagString[]{arg1.method19(0, var6), method973(method1039(4, arg0)), arg1.method1(var6 + 2)});
										}
									}
									arg1 = JagString.join(new JagString[]{arg1.method19(0, var5), method973(method1039(3, arg0)), arg1.method1(var5 + 2)});
								}
							}
							arg1 = JagString.join(new JagString[]{arg1.method19(0, var4), method973(method1039(2, arg0)), arg1.method1(var4 + 2)});
						}
					}
					arg1 = JagString.join(new JagString[]{arg1.method19(0, var3), method973(method1039(1, arg0)), arg1.method1(var3 + 2)});
				}
			}
			arg1 = JagString.join(new JagString[]{arg1.method19(0, var2), method973(method1039(0, arg0)), arg1.method1(var2 + 2)});
		}
	}

	@ObfuscatedName("oe.a(IILa;La;)V")
	public static void method758(int arg0, JagString arg1, JagString arg2) {
		if (field2166 == -1) {
			field2637 = true;
		}
		if (arg0 == 0 && field2421 != -1) {
			field3050 = 0;
			field1605 = arg1;
		}
		for (int var3 = 99; var3 > 0; var3--) {
			Statics.field3236[var3] = Statics.field3236[var3 - 1];
			Statics.field3130[var3] = Statics.field3130[var3 - 1];
			field2034[var3] = field2034[var3 - 1];
		}
		Statics.field3236[0] = arg0;
		Statics.field3130[0] = arg2;
		field2034[0] = arg1;
	}

	@ObfuscatedName("s.c(I)V")
	public static void method901() {
		try {
			Graphics var0 = canvas.getGraphics();
			field1167.method101(553, var0, 205);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("rd.a(IBII)V")
	public static void method887(int arg0, int arg1, int arg2) {
		if (field322 == 0 || arg1 == 0 || field965 >= 50) {
			return;
		}
		Statics.field2369[field965] = arg0;
		Statics.field2845[field965] = arg1;
		Statics.field684[field965] = arg2;
		Statics.field955[field965] = null;
		Statics.field1521[field965] = 0;
		field965++;
	}

	@ObfuscatedName("ua.a(I)V")
	public static void method986() {
		field1167.method1054();
		field1366.method329(0, 0);
		field1096 = Pix3D.method362(field1096);
	}

	@ObfuscatedName("j.a(BLa;)V")
	public static void method537(JagString arg0) {
		if (arg0 == null || arg0.method10() == 0) {
			field2330 = 0;
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
				field2330 = 0;
				label46:
				for (int var7 = 0; var7 < ObjType.field1590; var7++) {
					ObjType var8 = ObjType.list(var7);
					if (var8.field2838 == -1 && var8.field2827 != null) {
						JagString var9 = var8.field2827.method30();
						for (int var10 = 0; var10 < var3; var10++) {
							if (var9.method11(var2[var10]) == -1) {
								continue label46;
							}
						}
						Statics.field1017[field2330] = var9;
						Statics.field313[field2330] = var7;
						field2330++;
						if (field2330 >= Statics.field1017.length) {
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

	@ObfuscatedName("ra.a(II)V")
	public static void method874(int arg0) {
		if (arg0 == -1 && field1860 == 0) {
			Statics.method669();
		} else if (arg0 != -1 && field3037 != arg0 && field1554 != 0 && field1860 == 0) {
			Statics.method670(field1554, arg0, songs, 0);
		}
		field3037 = arg0;
	}

	@ObfuscatedName("oa.a(BI)V")
	public static void method746(int arg0) {
		if (!IfType.method1052(arg0)) {
			return;
		}
		IfType[] var1 = IfType.field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3 != null) {
				var3.field2466 = 0;
				var3.field2460 = 0;
			}
		}
	}

	@ObfuscatedName("vc.a(II)V")
	public static void method1018(int arg0) {
		if (!IfType.method1052(arg0)) {
			return;
		}
		IfType[] var1 = IfType.field2922[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.field2483 != null) {
				ScriptRunner.method754(var3.field2483, 0, var3, 0);
			}
		}
	}

	@ObfuscatedName("jc.a(IJ)V")
	public static void method544(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < Statics.field2146; var2++) {
			if (field2683[var2] == arg0) {
				field1055 = true;
				Statics.field2146--;
				for (int var3 = var2; var3 < Statics.field2146; var3++) {
					field2683[var3] = field2683[var3 + 1];
				}
				out.method415(28);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("vb.a(II)Z")
	public static boolean method1012(int arg0) {
		if (!IfType.method1052(arg0)) {
			return false;
		}
		IfType[] var1 = IfType.field2922[arg0];
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
						var4.field2466 += field321;
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
					int var10 = field321 * var8;
					var4.field2496 = var4.field2496 + var10 & 0x7FF;
					int var11 = field321 * var9;
					var4.field2463 = var4.field2463 + var11 & 0x7FF;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.a(B)V")
	public static void method594() {
		field11.method1054();
	}

	@ObfuscatedName("ta.g(I)V")
	public static void method943() {
		try {
			Graphics var0 = canvas.getGraphics();
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
			canvas.repaint();
		}
	}

	@ObfuscatedName("hc.b(B)V")
	public static void method473() {
		field1558.method1054();
		field2187.method329(0, 0);
		field320 = Pix3D.method362(field320);
	}

	@ObfuscatedName("client.b(II)V")
	public void js5error(int arg0) {
		if (loginGamePort == loginPort) {
			loginPort = loginJs5Port;
		} else {
			loginPort = loginGamePort;
		}
		field1651 = null;
		field3299 = null;
		field466++;
		field464 = 0;
		if (field466 >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (state > 5) {
				field1059 = 3000;
			} else {
				this.error("js5connect_full");
				state = 1000;
			}
		} else if (field466 >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			state = 1000;
		} else if (field466 >= 4) {
			if (state <= 5) {
				this.error("js5connect");
				state = 1000;
			} else {
				field1059 = 3000;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void mainloop() {
		loopCycle++;
		this.serviceNetClient();
		Statics.method320();
		Statics.method680();
		Statics.method463();
		ClientKeyboardListener.cycle();
		ClientMouseListener.cycle();
		if (state == 0) {
			mainLoad();
			GameShell.doneslowupdate();
		} else if (state == 5) {
			mainLoad();
			GameShell.doneslowupdate();
		} else if (state == 10) {
			TitleScreen.loop();
		} else if (state == 20) {
			TitleScreen.loop();
			loginPoll();
		} else if (state == 25) {
			mapBuildLoop();
		}
		if (state == 30) {
			gameLoop();
		} else if (state == 35) {
			gameLoop();
		} else if (state == 40) {
			loginPoll();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void serviceNetClient() {
		if (state != 1000) {
			boolean var1 = Js5Net.loop();
			if (!var1) {
				this.js5connect();
			}
		}
	}

	@ObfuscatedName("client.f(I)V")
	@Override
	public void method283() {
		if (GameShell.canvasReplaceRecommended) {
			ClientKeyboardListener.removeListeners(GameShell.canvas);
			ClientMouseListener.removeListeners(GameShell.canvas);
			this.addCanvas();
			ClientKeyboardListener.addListeners(GameShell.canvas);
			ClientMouseListener.addListeners(GameShell.canvas);
		}
		if (state == 0) {
			GameShell.drawProgress(field3274, null, field3079);
		} else if (state == 5) {
			TitleScreen.draw(b12, p11);
		} else if (state == 10) {
			TitleScreen.draw(b12, p11);
		} else if (state == 20) {
			TitleScreen.draw(b12, p11);
		} else if (state == 25) {
			if (mapLoadState == 1) {
				if (mapLoadCount > mapLoadPrevCount) {
					mapLoadPrevCount = mapLoadCount;
				}
				int var1 = (mapLoadPrevCount - mapLoadCount) * 50 / mapLoadPrevCount;
				messageBox(Text.field3252, true, JagString.join(new JagString[]{Statics.field221, Statics.method502(var1), Statics.field1673}));
			} else if (mapLoadState == 2) {
				if (locModelLoadCount > locModelLoadPrevCount) {
					locModelLoadPrevCount = locModelLoadCount;
				}
				int var2 = (locModelLoadPrevCount - locModelLoadCount) * 50 / locModelLoadPrevCount + 50;
				messageBox(Text.field3252, true, JagString.join(new JagString[]{Statics.field221, Statics.method502(var2), Statics.field1673}));
			} else {
				messageBox(Text.field3252, false, null);
			}
		} else if (state == 30) {
			gameDraw();
		} else if (state == 35) {
			method188();
		} else if (state == 40) {
			messageBox(Text.field3187, false, Text.field2033);
		}
		field3176 = 0;
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 6) {
				errorUsage();
			}
			worldid = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				modewhere = 0;
			} else if (arg0[1].equals("office")) {
				modewhere = 1;
			} else if (arg0[1].equals("local")) {
				modewhere = 2;
			} else {
				errorUsage();
			}
			if (arg0[2].equals("live")) {
				modewhat = 0;
			} else if (arg0[2].equals("rc")) {
				modewhat = 1;
			} else if (arg0[2].equals("wip")) {
				modewhat = 2;
			} else {
				errorUsage();
			}
			if (arg0[3].equals("lowmem")) {
				setLowMem();
			} else if (arg0[3].equals("highmem")) {
				setHighMem();
			} else {
				errorUsage();
			}
			if (arg0[4].equals("free")) {
				memServer = false;
			} else if (arg0[4].equals("members")) {
				memServer = true;
			} else {
				errorUsage();
			}
			if (arg0[5].equals("english")) {
				lang = 0;
			} else if (arg0[5].equals("german")) {
				TextGerman.swapGerman();
				lang = 1;
			} else {
				errorUsage();
			}
			Client var1 = new Client();
			var1.startApplication("runescape", 13, 503, modewhat + 32, InetAddress.getLocalHost(), 435, 765);
		} catch (Exception var3) {
			JagException.report(null, var3);
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void js5connect() {
		if (Js5Net.field1803 >= 4) {
			this.error("js5crc");
			state = 1000;
			return;
		}
		if (Js5Net.field525 >= 4) {
			if (state <= 5) {
				this.error("js5io");
				state = 1000;
				return;
			}
			Js5Net.field525 = 3;
			field1059 = 3000;
		}
		if (field1059-- > 0) {
			return;
		}
		try {
			if (field464 == 0) {
				field3299 = GameShell.signlink.socketreq(loginPort);
				field464++;
			}
			if (field464 == 1) {
				if (field3299.status == 2) {
					this.js5error(-1);
					return;
				}
				if (field3299.status == 1) {
					field464++;
				}
			}
			if (field464 == 2) {
				field1651 = new ClientStream((Socket) field3299.result, GameShell.signlink);
				Packet var1 = new Packet(5);
				var1.p1(15);
				var1.p4(435);
				field1651.write(5, var1.data);
				field464++;
				Statics.field1014 = Statics.currentTime();
			}
			if (field464 == 3) {
				if (state <= 5 || field1651.available() > 0) {
					int var2 = field1651.read();
					if (var2 != 0) {
						this.js5error(var2);
						return;
					}
					field464++;
				} else if (Statics.currentTime() - Statics.field1014 > 30000L) {
					this.js5error(-2);
					return;
				}
			}
			if (field464 == 4) {
				Js5Net.method381(field1651, state > 20);
				field3299 = null;
				field464 = 0;
				field1651 = null;
				field466 = 0;
			}
		} catch (IOException var3) {
			this.js5error(-3);
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void method286() {
		if (field708 != null) {
			field708.field2050 = false;
		}
		field708 = null;
		if (stream != null) {
			stream.close();
			stream = null;
		}
		ClientKeyboardListener.method945();
		ClientMouseListener.method327();
		Statics.method674();
		Statics.method967();
		Js5Net.method447();
		Statics.method884();
		try {
			if (Statics.field797 != null) {
				Statics.field797.method1046();
			}
			if (field1193 != null) {
				for (int var1 = 0; var1 < field1193.length; var1++) {
					if (field1193[var1] != null) {
						field1193[var1].method1046();
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
		worldid = Integer.parseInt(this.getParameter("worldid"));
		modewhat = Integer.parseInt(this.getParameter("modewhat"));
		modewhere = Integer.parseInt(this.getParameter("modewhere"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem();
		} else {
			setHighMem();
		}
		String var2 = this.getParameter("members");
		if (var2 != null && var2.equals("1")) {
			memServer = true;
		} else {
			memServer = false;
		}
		String var3 = this.getParameter("lang");
		if (var3 != null && var3.equals("1")) {
			TextGerman.swapGerman();
			lang = 1;
		}
		this.method621(modewhat + 32);
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void method288() {
		method285();
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
		method636();
		Statics.method730();
		Statics.method315();
		Statics.method461();
		Statics.method496();
		Statics.method740();
		Statics.method426();
		Statics.method849();
		Statics.method266();
		Statics.method484();
		Model.method768();
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
		Statics.method924();
		Statics.method750();
		Statics.method520();
		Statics.method385();
		ClientBuild.method394();
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
		loginJs5Port = modewhere == 0 ? 443 : worldid + 50000;
		loginGamePort = modewhere == 0 ? 43594 : worldid + 40000;
		loginPort = loginGamePort;
		ClientKeyboardListener.method987();
		ClientKeyboardListener.addListeners(GameShell.canvas);
		ClientMouseListener.addListeners(GameShell.canvas);
		Statics.field1551 = SignLink.field1716;
		try {
			if (GameShell.signlink.field1715 != null) {
				Statics.field797 = new BufferedRandomAccessFile(GameShell.signlink.field1715, 5200, 0);
				for (int var1 = 0; var1 < 13; var1++) {
					field1193[var1] = new BufferedRandomAccessFile(GameShell.signlink.field1702[var1], 6000, 0);
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
		if (modewhere != 0) {
			showFps = true;
		}
		field704 = new IfType();
	}
}
