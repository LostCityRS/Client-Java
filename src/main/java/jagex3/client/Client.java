package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.applet.PrivilegedRequest;
import jagex3.client.applet.SignLink;
import jagex3.client.input.keyboard.ClientKeyboardListener;
import jagex3.client.input.mouse.ClientMouseListener;
import jagex3.client.input.mouse.MouseWheelInterface;
import jagex3.config.*;
import jagex3.config.iftype.IfType;
import jagex3.config.iftype.ServerActive;
import jagex3.constants.Skills;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable;
import jagex3.friends.FriendChatUser;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5Net;
import jagex3.js5.Js5NetThread;
import jagex3.jstring.JString;
import jagex3.midi2.MidiManager;
import jagex3.midi2.MidiPlayer;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.util.MonotonicTime;
import jagex3.var.VarCache;
import jagex3.wordfilter2.Huffman;
import jagex3.wordfilter2.WordPack;

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Socket;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("kd.H")
	public static final int field1727 = 5063219;
	@ObfuscatedName("ud.Z")
	public static final int field3275 = 7759444;
	@ObfuscatedName("pe.r")
	public static final int field2566 = 3353893;
	@ObfuscatedName("qa.c")
	public static final int field2615 = 2301979;
	@ObfuscatedName("nd.e")
	public static final boolean field2164 = false;
	@ObfuscatedName("nb.K")
	public static final int field2121 = 50;
	@ObfuscatedName("client.gb")
	public static PixFontGeneric p11;

	@ObfuscatedName("client.R")
	public static int field377 = 0;

	@ObfuscatedName("tb.g")
	public static int state = 0;
	@ObfuscatedName("qa.r")
	public static int js5ConnectCooldown = 0;
	@ObfuscatedName("te.f")
	public static int js5ConnectState = 0;
	@ObfuscatedName("hd.fb")
	public static PrivilegedRequest js5SocketReq;
	@ObfuscatedName("ve.n")
	public static String loginHost;
	@ObfuscatedName("fc.E")
	public static int loginPort;
	@ObfuscatedName("jc.X")
	public static ClientStream js5Stream;
	@ObfuscatedName("jd.mb")
	public static long js5ConnectTime;
	@ObfuscatedName("gf.m")
	public static int js5Errors = 0;
	@ObfuscatedName("ua.e")
	public static int loopCycle = 0;
	@ObfuscatedName("oe.s")
	public static MouseWheelInterface mouseWheel;
	@ObfuscatedName("kc.g")
	public static int mouseWheelRotation = 0;
	@ObfuscatedName("qa.i")
	public static boolean playingJingle = false;
	@ObfuscatedName("f.z")
	public static PcmPlayer midiPcmPlayer;
	@ObfuscatedName("hd.Z")
	public static int mapLoadPrevCount = 1;
	@ObfuscatedName("ra.b")
	public static int mapLoadState = 0;
	@ObfuscatedName("fa.u")
	public static int mapLoadCount = 0;
	@ObfuscatedName("vf.n")
	public static int locModelLoadCount = 0;
	@ObfuscatedName("fa.y")
	public static int locModelLoadPrevCount = 1;
	@ObfuscatedName("nb.F")
	public static int componentDrawMode = 0;
	@ObfuscatedName("le.s")
	public static boolean[] componentRedrawRequested2 = new boolean[100];
	@ObfuscatedName("ta.zb")
	public static int componentDrawCount = 0;
	@ObfuscatedName("dd.L")
	public static int loginGamePort;
	@ObfuscatedName("be.D")
	public static int loginJs5Port;
	@ObfuscatedName("te.b")
	public static MouseTracking mouseTracking;
	@ObfuscatedName("ud.X")
	public static ClientStream stream;
	@ObfuscatedName("e.y")
	public static PcmPlayer soundPcmPlayer;
	@ObfuscatedName("ka.Yc")
	public static int modewhere = 0;
	@ObfuscatedName("wd.B")
	public static boolean showFps = false;
	@ObfuscatedName("mc.o")
	public static int worldid = 1;
	@ObfuscatedName("hd.ib")
	public static int modewhat = 0;
	@ObfuscatedName("v.h")
	public static boolean memServer = false;
	@ObfuscatedName("ce.h")
	public static int lang = 0;
	@ObfuscatedName("wa.H")
	public static int modegame = 0;
	@ObfuscatedName("se.cb")
	public static int js = 1;
	@ObfuscatedName("pc.r")
	public static int plug = 0;
	@ObfuscatedName("we.D")
	public static int alreadyloaded = 0;
	@ObfuscatedName("lf.N")
	public static boolean networkError = false;
	@ObfuscatedName("ga.mb")
	public static PacketBit out = new PacketBit(5000);
	@ObfuscatedName("ka.kd")
	public static int noTimeoutCycle = 0;
	@ObfuscatedName("mc.e")
	public static int ptype = 0;
	@ObfuscatedName("a.n")
	public static JagString AUTO_PCTCLOSE = JagString.wrap("(U(Y");
	@ObfuscatedName("be.B")
	public static int loadingStep = 0;
	@ObfuscatedName("nb.N")
	public static Js5Loader anims;
	@ObfuscatedName("fb.Q")
	public static Js5Loader bases;
	@ObfuscatedName("jb.l")
	public static Js5Loader configs;
	@ObfuscatedName("jd.B")
	public static Js5Loader interfaces;
	@ObfuscatedName("a.f")
	public static Js5Loader jagFX;
	@ObfuscatedName("tb.h")
	public static Js5Loader maps;
	@ObfuscatedName("rf.f")
	public static Js5Loader songs;
	@ObfuscatedName("va.v")
	public static Js5Loader models;
	@ObfuscatedName("ea.I")
	public static Js5Loader sprites;
	@ObfuscatedName("lf.P")
	public static Js5Loader textures;
	@ObfuscatedName("kc.m")
	public static Js5Loader binary;
	@ObfuscatedName("oa.P")
	public static Js5Loader jingles;
	@ObfuscatedName("oa.t")
	public static Js5Loader scripts;
	@ObfuscatedName("wd.s")
	public static Js5Loader fontMetrics;
	@ObfuscatedName("of.w")
	public static Js5Loader vorbis;
	@ObfuscatedName("v.j")
	public static Js5Loader patches;
	@ObfuscatedName("sc.Y")
	public static JagString AUTO_PCT = JagString.wrap("(U");
	@ObfuscatedName("fa.w")
	public static Mixer soundMixer;
	@ObfuscatedName("se.fb")
	public static Decimator soundDecimator;
	@ObfuscatedName("wa.K")
	public static boolean lowMem = false;
	@ObfuscatedName("rc.V")
	public static PixFontGeneric p12;
	@ObfuscatedName("fb.G")
	public static PixFontGeneric b12;
	@ObfuscatedName("ab.r")
	public static Pix32 compass;
	@ObfuscatedName("gf.s")
	public static Pix32 mapedge;
	@ObfuscatedName("j.Xb")
	public static Pix8[] mapscene;
	@ObfuscatedName("q.Nc")
	public static Pix32[] mapfunction;
	@ObfuscatedName("ea.X")
	public static Pix32[] field587;
	@ObfuscatedName("ea.O")
	public static Pix32[] field578;
	@ObfuscatedName("ba.j")
	public static Pix32[] field168;
	@ObfuscatedName("sf.k")
	public static Pix32[] field3019;
	@ObfuscatedName("o.Db")
	public static Pix32[] field2233;
	@ObfuscatedName("a.b")
	public static Pix32[] field2;
	@ObfuscatedName("df.k")
	public static Pix32[] field515;
	@ObfuscatedName("oa.z")
	public static Pix8[] field2252;
	@ObfuscatedName("t.q")
	public static Pix8[] modicons;
	@ObfuscatedName("ce.f")
	public static Pix8 field369;
	@ObfuscatedName("oc.c")
	public static int[][] dirMap = new int[104][104];
	@ObfuscatedName("hd.Eb")
	public static int[][] distMap = new int[104][104];
	@ObfuscatedName("jf.k")
	public static int[] routeX = new int[4000];
	@ObfuscatedName("kf.e")
	public static int[] routeZ = new int[4000];
	@ObfuscatedName("da.K")
	public static boolean field416 = false;
	@ObfuscatedName("kc.r")
	public static int field1706 = 0;
	@ObfuscatedName("wf.o")
	public static World world;
	@ObfuscatedName("cb.hb")
	public static int[] field347 = new int[100];
	@ObfuscatedName("bf.s")
	public static JagString[] field245 = new JagString[100];
	@ObfuscatedName("f.kc")
	public static JagString[] field832 = new JagString[100];
	@ObfuscatedName("q.Wc")
	public static JagString[] field2610 = new JagString[100];
	@ObfuscatedName("c.Pb")
	public static int field319 = 0;
	@ObfuscatedName("da.S")
	public static int field423 = 0;
	@ObfuscatedName("qd.xc")
	public static int field2767 = 1;
	@ObfuscatedName("we.e")
	public static PacketBit in = new PacketBit(5000);
	@ObfuscatedName("ce.j")
	public static ClientPlayer field373;
	@ObfuscatedName("pa.b")
	public static CollisionMap[] levelCollisionMap = new CollisionMap[4];
	@ObfuscatedName("uc.B")
	public static Pix32 minimap;
	@ObfuscatedName("u.H")
	public static PacketBit field3202 = new PacketBit(5000);
	@ObfuscatedName("ed.o")
	public static long[] field694 = new long[200];
	@ObfuscatedName("la.t")
	public static JagString field1786 = JagString.wrap("");
	@ObfuscatedName("la.r")
	public static JagString field1784 = field1786;
	@ObfuscatedName("e.J")
	public static JagString field536 = JagString.wrap("compass");
	@ObfuscatedName("ab.w")
	public static JagString field51 = JagString.wrap("mapedge");
	@ObfuscatedName("da.R")
	public static JagString field422 = JagString.wrap("mapscene");
	@ObfuscatedName("tb.o")
	public static JagString field3122 = JagString.wrap("mapfunction");
	@ObfuscatedName("eb.h")
	public static JagString field595 = JagString.wrap("hitmarks");
	@ObfuscatedName("oc.a")
	public static JagString field2315 = JagString.wrap("headicons_pk");
	@ObfuscatedName("ac.T")
	public static JagString field64 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("ac.Y")
	public static JagString field69 = JagString.wrap("headicons_hint");
	@ObfuscatedName("ha.I")
	public static JagString field1162 = JagString.wrap("mapmarker");
	@ObfuscatedName("hc.g")
	public static JagString field1178 = JagString.wrap("cross");
	@ObfuscatedName("hc.d")
	public static ClientPlayer[] players = new ClientPlayer[2048];
	@ObfuscatedName("hc.f")
	public static int loginFailCount = 0;
	@ObfuscatedName("ue.u")
	public static JagString field3283 = JagString.wrap("mapdots");
	@ObfuscatedName("ud.Y")
	public static JagString field3274 = JagString.wrap("scrollbar");
	@ObfuscatedName("fc.A")
	public static JagString field937 = JagString.wrap("mod_icons");
	@ObfuscatedName("ud.L")
	public static Packet[] field3262 = new Packet[2048];
	@ObfuscatedName("te.l")
	public static JagString field3184 = JagString.wrap("mapback");
	@ObfuscatedName("fc.B")
	public static int loginWaitingTime = 0;
	@ObfuscatedName("bc.d")
	public static PrivilegedRequest loginSocketReq;
	@ObfuscatedName("t.n")
	public static int loginStep = 0;
	@ObfuscatedName("qf.s")
	public static int loginHopTimer = 0;
	@ObfuscatedName("uf.h")
	public static int staffmodlevel = 0;
	@ObfuscatedName("pe.e")
	public static boolean playermod = false;
	@ObfuscatedName("fa.G")
	public static int selfSlot = -1;
	@ObfuscatedName("we.a")
	public static int membersAccount = 0;
	@ObfuscatedName("qd.ib")
	public static int psize = 0;
	@ObfuscatedName("j.Lb")
	public static int field1422;
	@ObfuscatedName("uc.G")
	public static byte[][] field3256;
	@ObfuscatedName("ra.d")
	public static int[] field2841;
	@ObfuscatedName("ke.l")
	public static int[] field1747;
	@ObfuscatedName("de.c")
	public static byte[][] field483;
	@ObfuscatedName("fc.y")
	public static int[] field935;
	@ObfuscatedName("kc.l")
	public static int field1700;
	@ObfuscatedName("r.u")
	public static int field2836;
	@ObfuscatedName("i.h")
	public static boolean regionmode = false;
	@ObfuscatedName("uc.A")
	public static int field3251;
	@ObfuscatedName("ec.x")
	public static int[][][] field641 = new int[4][13][13];
	@ObfuscatedName("ac.X")
	public static int field68 = 0;
	@ObfuscatedName("i.c")
	public static int field1294 = 0;
	@ObfuscatedName("bc.l")
	public static long field182 = 0L;
	@ObfuscatedName("vf.x")
	public static int field3497 = 0;
	@ObfuscatedName("dd.O")
	public static boolean field476 = false;
	@ObfuscatedName("ra.l")
	public static int field2849 = 0;
	@ObfuscatedName("ac.bb")
	public static int field72 = 0;
	@ObfuscatedName("hd.L")
	public static int[] field1195 = new int[50];
	@ObfuscatedName("sa.i")
	public static int[] field2923 = new int[50];
	@ObfuscatedName("qa.n")
	public static int[] field2626 = new int[50];
	@ObfuscatedName("ud.bb")
	public static int field3277 = 0;
	@ObfuscatedName("jc.V")
	public static JagFX[] field1509 = new JagFX[50];
	@ObfuscatedName("qc.D")
	public static int[] field2672 = new int[50];
	@ObfuscatedName("ka.Hc")
	public static int field1629 = 127;
	@ObfuscatedName("ee.R")
	public static int field710 = 0;
	@ObfuscatedName("ee.K")
	public static int field703 = 0;
	@ObfuscatedName("bd.x")
	public static int field201 = 0;
	@ObfuscatedName("we.i")
	public static int field3616 = 0;
	@ObfuscatedName("gb.t")
	public static int field1066 = 0;
	@ObfuscatedName("bf.d")
	public static ClientNpc[] npcs = new ClientNpc[32768];
	@ObfuscatedName("uf.d")
	public static boolean[] field3297 = new boolean[100];
	@ObfuscatedName("pe.w")
	public static HashTable field2571 = new HashTable(8);
	@ObfuscatedName("ha.E")
	public static IfType field1158 = null;
	@ObfuscatedName("f.Pc")
	public static int field863;
	@ObfuscatedName("rc.I")
	public static int field2864;
	@ObfuscatedName("gb.y")
	public static int field1071;
	@ObfuscatedName("pf.Q")
	public static int field2585;
	@ObfuscatedName("be.A")
	public static int field220 = -1;
	@ObfuscatedName("v.l")
	public static int field3319 = -1;
	@ObfuscatedName("me.r")
	public static int field2045;
	@ObfuscatedName("g.N")
	public static int field1002;
	@ObfuscatedName("ve.q")
	public static boolean field3468 = false;
	@ObfuscatedName("se.Z")
	public static int field3001 = -1;
	@ObfuscatedName("aa.n")
	public static JagString field28 = JagString.wrap("::gc");
	@ObfuscatedName("mc.n")
	public static JagString field2013 = JagString.wrap("::clientdrop");
	@ObfuscatedName("ma.b")
	public static JagString field1969 = JagString.wrap("::fpson");
	@ObfuscatedName("jf.d")
	public static JagString field1593 = JagString.wrap("::fpsoff");
	@ObfuscatedName("ce.i")
	public static JagString field372 = JagString.wrap("::noclip");
	@ObfuscatedName("g.L")
	public static JagString field1000 = JagString.wrap("::errortest");
	@ObfuscatedName("ua.k")
	public static JagString field3223 = JagString.wrap("::rect_debug");
	@ObfuscatedName("ud.ab")
	public static JagString field3276 = JagString.wrap("::qa_op_test");
	@ObfuscatedName("v.k")
	public static boolean qaOpTest = false;
	@ObfuscatedName("ge.Zb")
	public static int field1118 = 0;
	@ObfuscatedName("o.Ab")
	public static int overrideChat = 0;
	@ObfuscatedName("uf.k")
	public static JagString TAG_IMG_1 = JagString.wrap("<img=1>");
	@ObfuscatedName("ud.cb")
	public static JagString TAG_IMG_0 = JagString.wrap("<img=0>");
	@ObfuscatedName("ke.d")
	public static long[] field1739 = new long[100];
	@ObfuscatedName("of.f")
	public static long[] field2407 = new long[100];
	@ObfuscatedName("pb.W")
	public static int field2504 = 0;
	@ObfuscatedName("pb.gb")
	public static int field2514 = 0;
	@ObfuscatedName("ie.S")
	public static int field1356 = 0;
	@ObfuscatedName("aa.l")
	public static int field26 = 0;
	@ObfuscatedName("mb.p")
	public static int field1993 = 0;
	@ObfuscatedName("da.M")
	public static boolean field418 = false;
	@ObfuscatedName("m.a")
	public static int field1922;
	@ObfuscatedName("pb.ub")
	public static int field2528;
	@ObfuscatedName("uc.D")
	public static int field3253;
	@ObfuscatedName("ld.a")
	public static int field1836;
	@ObfuscatedName("mf.j")
	public static int field2058;
	@ObfuscatedName("gf.h")
	public static int field1126;
	@ObfuscatedName("pa.n")
	public static int field2494;
	@ObfuscatedName("kd.z")
	public static int field1719;
	@ObfuscatedName("g.z")
	public static int minusedlevel;
	@ObfuscatedName("of.b")
	public static int field2403 = 0;
	@ObfuscatedName("of.c")
	public static long field2404 = 0L;
	@ObfuscatedName("sa.m")
	public static JagString field2927 = JagString.wrap("huffman");
	@ObfuscatedName("pe.A")
	public static JagString[] field2575 = new JagString[500];
	@ObfuscatedName("i.d")
	public static JagString[] field1295 = new JagString[500];
	@ObfuscatedName("ga.ub")
	public static int[] field1034 = new int[500];
	@ObfuscatedName("tc.e")
	public static int[] field3135 = new int[500];
	@ObfuscatedName("rc.M")
	public static int[] field2868 = new int[500];
	@ObfuscatedName("we.m")
	public static int[] field3620 = new int[500];
	@ObfuscatedName("ra.k")
	public static int field2848 = 0;
	@ObfuscatedName("j.tb")
	public static int field1404 = 0;
	@ObfuscatedName("oe.o")
	public static int field2397 = 0;
	@ObfuscatedName("te.o")
	public static int[] field3187 = new int[2048];
	@ObfuscatedName("c.Jb")
	public static int[] field313 = new int[32768];
	@ObfuscatedName("mf.g")
	public static int field2055 = -1;
	@ObfuscatedName("s.n")
	public static int field2911 = 0;
	@ObfuscatedName("ld.s")
	public static int field1854 = 0;
	@ObfuscatedName("ld.e")
	public static ClientStream prevStream;
	@ObfuscatedName("ja.u")
	public static final int field1460 = 50;
	@ObfuscatedName("ja.E")
	public static int[] field1470 = new int[field1460];
	@ObfuscatedName("ja.g")
	public static int[] field1446 = new int[field1460];
	@ObfuscatedName("ja.B")
	public static int[] field1467 = new int[field1460];
	@ObfuscatedName("ja.G")
	public static int[] field1472 = new int[field1460];
	@ObfuscatedName("ja.y")
	public static int[] field1464 = new int[field1460];
	@ObfuscatedName("ja.r")
	public static int[] field1457 = new int[field1460];
	@ObfuscatedName("ja.a")
	public static int[] field1440 = new int[field1460];
	@ObfuscatedName("ja.m")
	public static JagString[] field1452 = new JagString[field1460];
	@ObfuscatedName("qa.j")
	public static boolean field2622 = false;
	@ObfuscatedName("de.t")
	public static boolean field500 = false;
	@ObfuscatedName("ba.e")
	public static int field163;
	@ObfuscatedName("we.v")
	public static IfType field3629 = null;
	@ObfuscatedName("gb.v")
	public static int field1068 = 0;
	@ObfuscatedName("q.Sc")
	public static int field2606 = -1;
	@ObfuscatedName("me.b")
	public static int field2029 = 0;
	@ObfuscatedName("qf.E")
	public static IfType field2807 = null;
	@ObfuscatedName("sa.p")
	public static int field2930 = -1;
	@ObfuscatedName("te.h")
	public static int field3180 = -1;
	@ObfuscatedName("ja.z")
	public static int field1465 = -1;
	@ObfuscatedName("la.w")
	public static boolean field1789 = false;
	@ObfuscatedName("rf.e")
	public static IfType field2886 = null;
	@ObfuscatedName("s.a")
	public static int field2898 = 0;
	@ObfuscatedName("gb.D")
	public static LinkList field1076 = new LinkList();
	@ObfuscatedName("bf.m")
	public static JagString[] field239 = new JagString[200];
	@ObfuscatedName("aa.f")
	public static int field20 = 0;
	@ObfuscatedName("na.t")
	public static int[] field2094 = new int[200];
	@ObfuscatedName("ad.u")
	public static int[] field103 = new int[200];
	@ObfuscatedName("q.Vc")
	public static FriendChatUser[] field2609;
	@ObfuscatedName("ta.Y")
	public static int field3054 = 0;
	@ObfuscatedName("de.m")
	public static int field493 = 0;
	@ObfuscatedName("e.A")
	public static int field527 = 0;
	@ObfuscatedName("tc.q")
	public static int field3147 = 0;
	@ObfuscatedName("wa.Z")
	public static int field3543 = 0;
	@ObfuscatedName("de.s")
	public static int field499 = 0;
	@ObfuscatedName("wa.bb")
	public static int field3545 = 0;
	@ObfuscatedName("lc.j")
	public static JagString field1833 = JagString.wrap("Fps:");
	@ObfuscatedName("be.C")
	public static JagString field222 = JagString.wrap("Mem:");
	@ObfuscatedName("qa.p")
	public static JagString field2628 = JagString.wrap("k");
	@ObfuscatedName("bd.C")
	public static int field206 = -1;
	@ObfuscatedName("we.E")
	public static int field3638 = 255;
	@ObfuscatedName("sf.c")
	public static JagString field3011 = JagString.wrap("Hidden)2use");
	@ObfuscatedName("s.p")
	public static int field2913 = 0;
	@ObfuscatedName("fb.H")
	public static JagString[] field914 = new JagString[8];
	@ObfuscatedName("ga.Cb")
	public static boolean[] field1042 = new boolean[8];
	@ObfuscatedName("oa.N")
	public static int[] field2266 = new int[] { 45, 23, 50, 29, 44, 48, 16, 6 };
	@ObfuscatedName("va.C")
	public static JagString field3353 = null;
	@ObfuscatedName("bf.h")
	public static JagString field234 = null;
	@ObfuscatedName("tb.t")
	public static JagString field3127 = JagString.wrap(" )2> <col=ffffff>");
	@ObfuscatedName("se.V")
	public static JagString field2997 = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("ue.y")
	public static int[] field3287 = new int[100];
	@ObfuscatedName("te.j")
	public static JagString field3182 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("kf.a")
	public static JagString field1755 = JagString.wrap(" )2> <col=ffff00>");
	@ObfuscatedName("ha.u")
	public static JagString field1148 = null;
	@ObfuscatedName("fe.B")
	public static JagString field954 = JagString.wrap(" (X");
	@ObfuscatedName("da.x")
	public static JagString field403 = JagString.wrap("(Y");
	@ObfuscatedName("qd.Zb")
	public static int lastBuiltLevel = 0;
	@ObfuscatedName("ad.j")
	public static int minimapLevel = -1;
	@ObfuscatedName("me.e")
	public static boolean field2032 = true;
	@ObfuscatedName("sf.b")
	public static JagString field3010 = null;
	@ObfuscatedName("we.C")
	public static int field3636;
	@ObfuscatedName("ie.W")
	public static PlayerModel field1360 = new PlayerModel();
	@ObfuscatedName("da.r")
	public static LinkList[][][] groundObj = new LinkList[4][104][104];
	@ObfuscatedName("me.k")
	public static LinkList field2038 = new LinkList();
	@ObfuscatedName("wd.q")
	public static LinkList field3594 = new LinkList();
	@ObfuscatedName("lc.h")
	public static int[] field1831 = new int[2000];
	@ObfuscatedName("bc.c")
	public static int field173 = 0;
	@ObfuscatedName("be.F")
	public static int field225 = 0;
	@ObfuscatedName("ta.lb")
	public static int field3067 = 0;
	@ObfuscatedName("eb.B")
	public static int field615 = 0;
	@ObfuscatedName("la.T")
	public static boolean focusIn = true;
	@ObfuscatedName("ad.g")
	public static IfType field89;
	@ObfuscatedName("td.bb")
	public static int field3156 = 0;
	@ObfuscatedName("de.j")
	public static JagString field490 = JagString.wrap(")4lang)4de");
	@ObfuscatedName("ha.B")
	public static JagString field1155 = JagString.wrap("p11_full");
	@ObfuscatedName("jb.k")
	public static JagString field1487 = JagString.wrap("p12_full");
	@ObfuscatedName("ve.j")
	public static JagString field3461 = JagString.wrap("b12_full");
	@ObfuscatedName("eb.A")
	public static int[] field614 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	@ObfuscatedName("ie.O")
	public static int field1352 = 0;
	@ObfuscatedName("j.Hb")
	public static int[] field1418 = new int[2048];
	@ObfuscatedName("df.h")
	public static int[] field512 = new int[100];
	@ObfuscatedName("rf.k")
	public static int[] field2892 = new int[100];
	@ObfuscatedName("ce.c")
	public static int[] field366 = new int[100];
	@ObfuscatedName("wf.p")
	public static int field3658 = 0;
	@ObfuscatedName("f.tb")
	public static int[][] field789 = new int[104][104];
	@ObfuscatedName("fb.P")
	public static JagString field922 = JagString.wrap("0(U");
	@ObfuscatedName("ve.b")
	public static BigInteger field3453 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("jb.j")
	public static BigInteger field1486 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("ja.o")
	public static int[][] field1454;
	@ObfuscatedName("pf.R")
	public static JagString field2586 = JagString.wrap("<br>(X100(U(Y");
	@ObfuscatedName("cd.d")
	public static JagString field361 = JagString.wrap("_");
	@ObfuscatedName("kf.k")
	public static int field1765 = 0;
	@ObfuscatedName("df.b")
	public static int field506 = 0;
	@ObfuscatedName("nb.C")
	public static boolean field2113 = false;
	@ObfuscatedName("ea.y")
	public static int field562 = 0;
	@ObfuscatedName("he.s")
	public static int worldUpdateNum = 0;
	@ObfuscatedName("ee.eb")
	public static IfType field723;
	@ObfuscatedName("pe.u")
	public static int field2569 = 0;
	@ObfuscatedName("qb.d")
	public static int field2637 = 0;
	@ObfuscatedName("kc.e")
	public static boolean field1693 = false;
	@ObfuscatedName("gf.e")
	public static IfType field1123;
	@ObfuscatedName("pc.B")
	public static int field2542 = 0;
	@ObfuscatedName("le.l")
	public static int field1856 = 0;
	@ObfuscatedName("ha.K")
	public static IfType field1163;
	@ObfuscatedName("kb.d")
	public static IfType field1665;
	@ObfuscatedName("hd.Ob")
	public static int keypresses = 0;
	@ObfuscatedName("kd.O")
	public static int[] field1733 = new int[128];
	@ObfuscatedName("bc.r")
	public static int[] field188 = new int[128];
	@ObfuscatedName("q.Kc")
	public static LinkList field2598 = new LinkList();
	@ObfuscatedName("ld.c")
	public static LinkList field1838 = new LinkList();
	@ObfuscatedName("bc.f")
	public static LinkList field176 = new LinkList();
	@ObfuscatedName("fb.R")
	public static int field924 = 0;
	@ObfuscatedName("cb.lb")
	public static int[] field351 = new int[5];
	@ObfuscatedName("ja.D")
	public static int field1469 = 0;
	@ObfuscatedName("m.l")
	public static int field1933 = 0;
	@ObfuscatedName("ea.p")
	public static int field553 = 2;
	@ObfuscatedName("bc.x")
	public static int field194 = 1;
	@ObfuscatedName("jc.N")
	public static int field1501 = 2;
	@ObfuscatedName("ee.I")
	public static int field701 = 2;
	@ObfuscatedName("ad.t")
	public static int field102 = 1;
	@ObfuscatedName("wa.u")
	public static int field3513 = -1;
	@ObfuscatedName("ea.z")
	public static int field563 = -2;
	@ObfuscatedName("ec.ib")
	public static int field677 = -1;
	@ObfuscatedName("ia.N")
	public static boolean[] field1318 = new boolean[100];
	@ObfuscatedName("ia.W")
	public static int field1327 = 0;
	@ObfuscatedName("tc.a")
	public static int[] field3131 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	@ObfuscatedName("g.I")
	public static int field997;
	@ObfuscatedName("ce.e")
	public static int field368;
	@ObfuscatedName("de.o")
	public static int[] field495 = new int[1000];
	@ObfuscatedName("oe.i")
	public static int field2391 = 0;
	@ObfuscatedName("tb.n")
	public static int field3121 = 0;
	@ObfuscatedName("ta.Ab")
	public static int field3082 = 128;
	@ObfuscatedName("pf.I")
	public static int field2577 = 0;
	@ObfuscatedName("ia.O")
	public static int field1319;
	@ObfuscatedName("pc.v")
	public static int field2536;
	@ObfuscatedName("dd.H")
	public static int field469 = 0;
	@ObfuscatedName("aa.g")
	public static int field21 = 0;
	@ObfuscatedName("t.o")
	public static int[] field3034;
	@ObfuscatedName("f.Gc")
	public static int[] field854;
	@ObfuscatedName("aa.m")
	public static int[] field27;
	@ObfuscatedName("oa.U")
	public static int[] field2273;
	@ObfuscatedName("qd.yc")
	public static HashTable field2768 = new HashTable(512);
	@ObfuscatedName("lf.D")
	public static int field1908 = 0;
	@ObfuscatedName("we.q")
	public static Pix32[] field3624 = new Pix32[1000];
	@ObfuscatedName("ra.m")
	public static int[] field2850 = new int[1000];
	@ObfuscatedName("m.J")
	public static int[] field1957 = new int[1000];
	@ObfuscatedName("gb.c")
	public static int field1049;
	@ObfuscatedName("mc.v")
	public static int field2021;
	@ObfuscatedName("fa.N")
	public static int field896;
	@ObfuscatedName("nd.o")
	public static int field2174;
	@ObfuscatedName("lc.a")
	public static int field1824;
	@ObfuscatedName("qd.Ab")
	public static int field2718;
	@ObfuscatedName("te.a")
	public static int[] field3173 = new int[25];
	@ObfuscatedName("ha.F")
	public static int[] field1159 = new int[25];
	@ObfuscatedName("cb.db")
	public static int[] field343 = new int[25];
	@ObfuscatedName("td.Y")
	public static int field3153 = 0;
	@ObfuscatedName("ab.u")
	public static int field49 = 0;
	@ObfuscatedName("kb.x")
	public static JagString[] field1685 = new JagString[100];
	@ObfuscatedName("of.q")
	public static JagString field2418 = JagString.wrap("<col=ff0000>");
	@ObfuscatedName("tc.n")
	public static JagString field3144 = JagString.wrap("<col=ff3000>");
	@ObfuscatedName("gb.x")
	public static JagString field1070 = JagString.wrap("<col=ff7000>");
	@ObfuscatedName("da.w")
	public static JagString field402 = JagString.wrap("<col=ffb000>");
	@ObfuscatedName("tb.u")
	public static JagString field3128 = JagString.wrap("<col=00ff00>");
	@ObfuscatedName("i.o")
	public static JagString field1306 = JagString.wrap("<col=40ff00>");
	@ObfuscatedName("ad.e")
	public static JagString field87 = JagString.wrap("<col=80ff00>");
	@ObfuscatedName("jb.q")
	public static JagString field1493 = JagString.wrap("<col=c0ff00>");
	@ObfuscatedName("ed.t")
	public static boolean[] field699 = new boolean[5];
	@ObfuscatedName("rf.b")
	public static int[] field2883 = new int[5];
	@ObfuscatedName("uf.a")
	public static int[] field3294 = new int[5];
	@ObfuscatedName("oa.A")
	public static IfType[] field2253;
	@ObfuscatedName("jf.n")
	public static int field1603;
	@ObfuscatedName("ma.a")
	public static int field1968;
	@ObfuscatedName("gb.z")
	public static int[] SERVERPROT_SIZES = new int[] { 0, 0, -2, 0, -2, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 5, 2, 0, 0, 0, 0, 3, -2, 0, 0, -2, 0, 8, 2, 0, -2, -2, 0, 0, 3, 11, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 3, -2, 0, 6, -1, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 0, 10, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 7, 0, 4, -2, 0, 2, 0, 1, 7, 5, 0, 0, 2, 0, 0, 0, 24, 6, 0, 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 6, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 14, 0, 0, 0, 0, -2, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 6, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 4, -1, 8, 0, 0, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 0, 4, 0 };
	@ObfuscatedName("bc.u")
	public static int[] invTransmit = new int[32];
	@ObfuscatedName("kd.y")
	public static int invTransmitNum = 0;
	@ObfuscatedName("vf.I")
	public static JagString field3508 = JagString.wrap(":");
	@ObfuscatedName("qc.f")
	public static JagString field2649 = JagString.wrap(":tradereq:");
	@ObfuscatedName("pa.p")
	public static JagString field2496 = JagString.wrap(":duelreq:");
	@ObfuscatedName("cb.kb")
	public static JagString field350 = JagString.wrap(":chalreq:");
	@ObfuscatedName("nd.x")
	public static JagString field2183 = JagString.wrap(":assistreq:");
	@ObfuscatedName("de.v")
	public static JagString field502 = JagString.wrap(":clan:");
	@ObfuscatedName("jc.gb")
	public static JagString field1520 = JagString.wrap(":trade:");
	@ObfuscatedName("uf.n")
	public static JagString field3307 = JagString.wrap(":assist:");
	@ObfuscatedName("nb.L")
	public static PrivilegedRequest field2122;
	@ObfuscatedName("aa.i")
	public static int field23 = 0;
	@ObfuscatedName("g.B")
	public static int field990 = 0;
	@ObfuscatedName("ke.f")
	public static int[] field1741 = new int[32];
	@ObfuscatedName("mc.l")
	public static int field2011 = 0;
	@ObfuscatedName("r.f")
	public static int[] field2821 = new int[32];
	@ObfuscatedName("te.v")
	public static int field3194 = 0;
	@ObfuscatedName("uf.f")
	public static int field3299 = 0;
	@ObfuscatedName("pf.L")
	public static int field2580 = 0;
	@ObfuscatedName("lc.g")
	public static int field1830 = 0;
	@ObfuscatedName("na.A")
	public static JagString field2101 = JagString.wrap("null");
	@ObfuscatedName("a.k")
	public static int field11 = 0;
	@ObfuscatedName("sa.j")
	public static JagString field2924 = null;
	@ObfuscatedName("oe.g")
	public static byte field2389;
	@ObfuscatedName("oa.G")
	public static long field2259;
	@ObfuscatedName("vc.Y")
	public static byte field3383;
	@ObfuscatedName("na.m")
	public static JagString field2087 = JagString.wrap(" )2> <col=00ffff>");
	@ObfuscatedName("ta.W")
	public static JagString field3052 = JagString.wrap("<col=00ffff>");
	@ObfuscatedName("gf.n")
	public static JagString field1132 = JagString.wrap(" )2> <col=ff9040>");
	@ObfuscatedName("fb.v")
	public static JagString field902 = JagString.wrap("<col=ff9040>");
	@ObfuscatedName("i.q")
	public static JagString field1308 = JagString.wrap("(U1");
	@ObfuscatedName("fb.F")
	public static JagString field912 = JagString.wrap("(U2");
	@ObfuscatedName("kb.c")
	public static JagString field1664 = JagString.wrap("(U3");
	@ObfuscatedName("fb.N")
	public static JagString field920 = JagString.wrap("(U4");
	@ObfuscatedName("tc.o")
	public static JagString field3145 = JagString.wrap("(U5");
	@ObfuscatedName("qa.e")
	public static JagString field2617 = JagString.wrap("(Udns");
	@ObfuscatedName("i.i")
	public static JagString field1300 = JagString.wrap(" )2>");
	@ObfuscatedName("ee.S")
	public static JagString field711 = JagString.wrap("<col=ffffff> )4 ");
	@ObfuscatedName("rf.d")
	public static int field2885 = 0;
	@ObfuscatedName("nd.a")
	public static int objGrabY = 0;
	@ObfuscatedName("ee.kb")
	public static int field729 = 0;
	@ObfuscatedName("qd.Bb")
	public static JagString field2719 = JagString.wrap("<)4col> x");
	@ObfuscatedName("wa.T")
	public static JagString field3538 = JagString.wrap("<br>");
	@ObfuscatedName("se.O")
	public static Packet tempP = new Packet(new byte[5000]);
	@ObfuscatedName("a.a")
	public static JagString field1 = JagString.wrap(" )2> ");
	@ObfuscatedName("na.p")
	public static JagString field2090 = JagString.wrap("Null");
	@ObfuscatedName("sd.i")
	public static int field2978;
	@ObfuscatedName("ga.yb")
	public static int field1038;
	@ObfuscatedName("ga.vb")
	public static int field1035 = 0;
	@ObfuscatedName("fe.N")
	public static int field966;
	@ObfuscatedName("kb.f")
	public static JagString field1667 = JagString.wrap(" x ");
	@ObfuscatedName("q.Pc")
	public static JagString field2603 = JagString.wrap("Hidden)2");
	@ObfuscatedName("ja.b")
	public static JagString field1441 = JagString.wrap("rect_debug=");
	@ObfuscatedName("we.s")
	public static JagString[] field3626 = new JagString[1000];
	@ObfuscatedName("we.H")
	public static JagString field3640 = JagString.wrap("(Z");
	@ObfuscatedName("ka.Zc")
	public static int field1647;

	@ObfuscatedName("client.a(IIIBIIII)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (lowMem && minusedlevel != arg5) {
			return;
		}
		int var7 = 0;
		if (arg1 == 0) {
			var7 = world.method1153(arg5, arg2, arg6);
		}
		if (arg1 == 1) {
			var7 = world.method1131(arg5, arg2, arg6);
		}
		if (arg1 == 2) {
			var7 = world.method1133(arg5, arg2, arg6);
		}
		if (arg1 == 3) {
			var7 = world.method1134(arg5, arg2, arg6);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = world.method1121(arg5, arg2, arg6, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg1 == 0) {
				world.method1148(arg5, arg2, arg6);
				LocType var12 = LocType.list(var8);
				if (var12.field1235 != 0) {
					levelCollisionMap[arg5].delWall(arg2, var10, var11, arg6, var12.field1219);
				}
			}
			if (arg1 == 1) {
				world.method1124(arg5, arg2, arg6);
			}
			if (arg1 == 2) {
				world.method1128(arg5, arg2, arg6);
				LocType var13 = LocType.list(var8);
				if (var13.width + arg2 > 103 || arg6 + var13.width > 103 || var13.length + arg2 > 103 || arg6 + var13.length > 103) {
					return;
				}
				if (var13.field1235 != 0) {
					levelCollisionMap[arg5].delLoc(arg2, var13.width, arg6, var13.field1219, var10, var13.length);
				}
			}
			if (arg1 == 3) {
				world.method1136(arg5, arg2, arg6);
				LocType var14 = LocType.list(var8);
				if (var14.field1235 == 1) {
					levelCollisionMap[arg5].unblockGroundDecor(arg6, arg2);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		int var15 = arg5;
		if (arg5 < 3 && (ClientBuild.mapl[1][arg2][arg6] & 0x2) == 2) {
			var15 = arg5 + 1;
		}
		ClientBuild.method537(arg3, arg0, world, arg6, var15, arg2, levelCollisionMap[arg5], arg5, arg4);
	}

	@ObfuscatedName("client.a(ILf;)Z")
	public static boolean method152(IfType arg0) {
		int var1 = arg0.field845;
		if (var1 == 205) {
			field68 = 250;
			return true;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = var1 & 0x1;
			int var3 = (var1 - 300) / 2;
			field1360.idkChangePart(var3, var2 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = var1 & 0x1;
			int var5 = (var1 - 314) / 2;
			field1360.idkChangeColour(var4 == 1, var5);
		}
		if (var1 == 324) {
			field1360.idkChangeGender(false);
		}
		if (var1 == 325) {
			field1360.idkChangeGender(true);
		}
		if (var1 == 326) {
			out.p1Enc(78);
			field1360.idkSaveDesign(out);
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 7) {
				method717();
			}
			worldid = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				modewhere = 0;
			} else if (arg0[1].equals("office")) {
				modewhere = 1;
			} else if (arg0[1].equals("local")) {
				modewhere = 2;
			} else {
				method717();
			}
			if (arg0[2].equals("live")) {
				modewhat = 0;
			} else if (arg0[2].equals("rc")) {
				modewhat = 1;
			} else if (arg0[2].equals("wip")) {
				modewhat = 2;
			} else {
				method717();
			}
			if (arg0[3].equals("lowmem")) {
				setLowMem();
			} else if (arg0[3].equals("highmem")) {
				setHighMem();
			} else {
				method717();
			}
			if (arg0[4].equals("free")) {
				memServer = false;
			} else if (arg0[4].equals("members")) {
				memServer = true;
			} else {
				method717();
			}
			if (arg0[5].equals("english")) {
				lang = 0;
			} else if (arg0[5].equals("german")) {
				TextGerman.swapGerman();
				lang = 1;
				field1784 = field490;
			} else {
				method717();
			}
			if (arg0[6].equals("game0")) {
				modegame = 0;
			} else if (arg0[6].equals("game1")) {
				modegame = 1;
			} else {
				method717();
			}
			loginHost = "127.0.0.1";
			Client var1 = new Client();
			var1.startApplication(16, 1, 468, "runescape", 765, 503, modewhat + 32);
		} catch (Exception var3) {
			JagException.report(null, var3);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public static void ifAnimReset(int arg0) {
		if (!IfType.method192(arg0)) {
			return;
		}
		IfType[] var1 = IfType.field1825[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3 != null) {
				var3.field762 = 0;
				var3.field839 = 0;
			}
		}
	}

	@ObfuscatedName("ve.b(B)V")
	public static void mainLoad() {
		if (loadingStep == 0) {
			world = new World(4, 104, 104, ClientBuild.groundh);
			for (int var0 = 0; var0 < 4; var0++) {
				levelCollisionMap[var0] = new CollisionMap(104, 104);
			}
			minimap = new Pix32(512, 512);
			loadingStep = 20;
			TitleScreen.loadString = Text.MAINLOAD0;
			TitleScreen.loadPos = 5;
		} else if (loadingStep == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 15 + 128;
				int var4 = var3 * 3 + 600;
				int var5 = Pix3D.sinTable[var3];
				var1[var2] = var5 * var4 >> 16;
			}
			World.init(var1);
			TitleScreen.loadPos = 10;
			TitleScreen.loadString = Text.MAINLOAD20;
			loadingStep = 30;
		} else if (loadingStep == 30) {
			anims = openJs5(0, true, false, true);
			bases = openJs5(1, true, false, true);
			configs = openJs5(2, true, true, false);
			interfaces = openJs5(3, true, false, true);
			jagFX = openJs5(4, true, false, true);
			maps = openJs5(5, true, true, true);
			songs = openJs5(6, false, true, true);
			models = openJs5(7, true, false, true);
			sprites = openJs5(8, true, false, true);
			textures = openJs5(9, true, false, true);
			binary = openJs5(10, true, false, true);
			jingles = openJs5(11, true, false, true);
			scripts = openJs5(12, true, false, true);
			fontMetrics = openJs5(13, true, true, false);
			vorbis = openJs5(14, false, false, true);
			patches = openJs5(15, true, false, true);
			TitleScreen.loadPos = 20;
			TitleScreen.loadString = Text.field1626;
			loadingStep = 40;
		} else if (loadingStep == 40) {
			int var6 = anims.getIndexPercentage() * 4 / 100;
			int var7 = var6 + bases.getIndexPercentage() * 4 / 100;
			int var8 = var7 + configs.getIndexPercentage() * 2 / 100;
			int var9 = var8 + interfaces.getIndexPercentage() * 2 / 100;
			int var10 = var9 + jagFX.getIndexPercentage() * 6 / 100;
			int var11 = var10 + maps.getIndexPercentage() * 4 / 100;
			int var12 = var11 + songs.getIndexPercentage() * 2 / 100;
			int var13 = var12 + models.getIndexPercentage() * 60 / 100;
			int var14 = var13 + sprites.getIndexPercentage() * 2 / 100;
			int var15 = var14 + textures.getIndexPercentage() * 2 / 100;
			int var16 = var15 + binary.getIndexPercentage() * 2 / 100;
			int var17 = var16 + jingles.getIndexPercentage() * 2 / 100;
			int var18 = var17 + scripts.getIndexPercentage() * 2 / 100;
			int var19 = var18 + fontMetrics.getIndexPercentage() * 2 / 100;
			int var20 = var19 + vorbis.getIndexPercentage() * 2 / 100;
			int var21 = var20 + patches.getIndexPercentage() * 2 / 100;
			if (var21 == 100) {
				TitleScreen.loadString = Text.field2485;
				loadingStep = 45;
				TitleScreen.loadPos = 30;
			} else {
				if (var21 != 0) {
					TitleScreen.loadString = JagString.join(new JagString[] { Text.field1274, JagString.parseInt(var21), AUTO_PCT});
				}
				TitleScreen.loadPos = 30;
			}
		} else if (loadingStep == 45) {
			PcmPlayer.init(!lowMem);
			MidiPlayer var22 = new MidiPlayer();
			var22.method86();
			midiPcmPlayer = PcmPlayer.getPlayer(signlink, 0, 22050, GameShell.canvas);
			midiPcmPlayer.playStream(var22);
			MidiManager.init(jagFX, vorbis, var22, patches);
			soundPcmPlayer = PcmPlayer.getPlayer(signlink, 1, 2048, GameShell.canvas);
			soundMixer = new Mixer();
			soundPcmPlayer.playStream(soundMixer);
			soundDecimator = new Decimator(22050, PcmPlayer.frequency);
			loadingStep = 50;
			TitleScreen.loadPos = 35;
			TitleScreen.loadString = Text.field1326;
		} else if (loadingStep == 50) {
			int var23 = 0;
			if (p11 == null) {
				p11 = PixLoader.makePixFont(sprites, fontMetrics, field1786, field1155);
			} else {
				var23++;
			}
			if (p12 == null) {
				p12 = PixLoader.makePixFont(sprites, fontMetrics, field1786, field1487);
			} else {
				var23++;
			}
			if (b12 == null) {
				b12 = PixLoader.makePixFont(sprites, fontMetrics, field1786, field3461);
			} else {
				var23++;
			}
			if (var23 < 3) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1729, JagString.parseInt(var23 * 100 / 3), AUTO_PCT});
				TitleScreen.loadPos = 40;
			} else {
				TitleScreen.loadString = Text.field528;
				TitleScreen.loadPos = 40;
				loadingStep = 60;
			}
		} else if (loadingStep == 60) {
			int var24 = TitleScreen.ready(sprites, binary);
			int var25 = TitleScreen.readyMax();
			if (var25 > var24) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1986, JagString.parseInt(var24 * 100 / var25), AUTO_PCT});
				TitleScreen.loadPos = 50;
			} else {
				TitleScreen.loadPos = 50;
				TitleScreen.loadString = Text.field1182;
				setMainState(5);
				loadingStep = 70;
			}
		} else if (loadingStep == 70) {
			if (configs.requestFullDownload()) {
				FloType.init(configs);
				FluType.init(configs);
				IdkType.init(models, configs);
				LocType.init(models, lowMem, configs);
				NPCType.init(configs, models);
				ObjType.init(models, configs, memServer, p11);
				SeqType.init(bases, configs, anims);
				SpotType.init(models, configs);
				VarBitType.init(configs);
				VarpType.init(configs);
				IfType.init(sprites, models, fontMetrics, interfaces);
				InvType.init(configs);
				EnumType.init(configs);
				TitleScreen.loadString = Text.field1004;
				TitleScreen.loadPos = 60;
				loadingStep = 80;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1552, JagString.parseInt(configs.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 60;
			}
		} else if (loadingStep == 80) {
			int var26 = 0;
			if (compass == null) {
				compass = PixLoader.makePix32(sprites, field1786, field536);
			} else {
				var26++;
			}
			if (mapedge == null) {
				mapedge = PixLoader.makePix32(sprites, field1786, field51);
			} else {
				var26++;
			}
			if (mapscene == null) {
				mapscene = PixLoader.makePix8Array(field1786, field422, sprites);
			} else {
				var26++;
			}
			if (mapfunction == null) {
				mapfunction = PixLoader.makePix32Array(field3122, sprites, field1786);
			} else {
				var26++;
			}
			if (field587 == null) {
				field587 = PixLoader.makePix32Array(field595, sprites, field1786);
			} else {
				var26++;
			}
			if (field578 == null) {
				field578 = PixLoader.makePix32Array(field2315, sprites, field1786);
			} else {
				var26++;
			}
			if (field168 == null) {
				field168 = PixLoader.makePix32Array(field64, sprites, field1786);
			} else {
				var26++;
			}
			if (field3019 == null) {
				field3019 = PixLoader.makePix32Array(field69, sprites, field1786);
			} else {
				var26++;
			}
			if (field2233 == null) {
				field2233 = PixLoader.makePix32Array(field1162, sprites, field1786);
			} else {
				var26++;
			}
			if (field2 == null) {
				field2 = PixLoader.makePix32Array(field1178, sprites, field1786);
			} else {
				var26++;
			}
			if (field515 == null) {
				field515 = PixLoader.makePix32Array(field3283, sprites, field1786);
			} else {
				var26++;
			}
			if (field2252 == null) {
				field2252 = PixLoader.makePix8Array(field1786, field3274, sprites);
			} else {
				var26++;
			}
			if (modicons == null) {
				modicons = PixLoader.makePix8Array(field1786, field937, sprites);
			} else {
				var26++;
			}
			if (field369 == null) {
				field369 = PixLoader.makePix8(field1786, sprites, field3184);
			} else {
				var26++;
			}
			if (var26 < 14) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1459, JagString.parseInt(var26 * 100 / 14), AUTO_PCT});
				TitleScreen.loadPos = 70;
			} else {
				PixFont.modicons = modicons;
				int var27 = (int) (Math.random() * 21.0D) - 10;
				mapedge.trim();
				int var28 = (int) (Math.random() * 21.0D) - 10;
				int var29 = (int) (Math.random() * 21.0D) - 10;
				int var30 = (int) (Math.random() * 41.0D) - 20;
				for (int var31 = 0; var31 < mapfunction.length; var31++) {
					mapfunction[var31].rgbAdjust(var30 + var27, var30 + var28, var29 + var30);
				}
				mapscene[0].rgbAdjust(var30 + var27, var30 + var28, var29 + var30);
				prepareMinimap();
				TitleScreen.loadString = Text.field2781;
				TitleScreen.loadPos = 70;
				loadingStep = 90;
			}
		} else if (loadingStep == 90) {
			if (textures.requestFullDownload()) {
				WorldTextureProvider var32 = new WorldTextureProvider(textures, sprites, 20, 0.8D, lowMem ? 64 : 128);
				Pix3D.setTextures(var32);
				Pix3D.initColourTable(0.8D);
				loadingStep = 110;
				TitleScreen.loadString = Text.field2980;
				TitleScreen.loadPos = 90;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field3464, JagString.parseInt(textures.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 90;
			}
		} else if (loadingStep == 110) {
			mouseTracking = new MouseTracking();
			signlink.threadreq(10, mouseTracking, 105);
			TitleScreen.loadPos = 94;
			loadingStep = 120;
			TitleScreen.loadString = Text.field2568;
		} else if (loadingStep == 120) {
			if (binary.requestDownload(field2927, field1786)) {
				Huffman var33 = new Huffman(binary.getFile(field2927, field1786));
				WordPack.method997(var33);
				TitleScreen.loadString = Text.field1988;
				TitleScreen.loadPos = 96;
				loadingStep = 130;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field3602, field922 });
				TitleScreen.loadPos = 96;
			}
		} else if (loadingStep == 130) {
			if (!interfaces.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field167, JagString.parseInt(interfaces.getIndexLoadProgress() * 4 / 5), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else if (!scripts.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field167, JagString.parseInt(scripts.getIndexLoadProgress() / 6 + 80), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else if (fontMetrics.requestFullDownload()) {
				loadingStep = 140;
				TitleScreen.loadString = Text.field1989;
				TitleScreen.loadPos = 100;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field167, JagString.parseInt(fontMetrics.getIndexLoadProgress() / 20 + 96), AUTO_PCT});
				TitleScreen.loadPos = 100;
			}
		} else if (loadingStep == 140) {
			setMainState(10);
		}
	}

	@ObfuscatedName("s.a(I)V")
	public static void doAudio() {
		if (soundPcmPlayer != null) {
			soundPcmPlayer.cycle();
		}
		if (midiPcmPlayer != null) {
			midiPcmPlayer.cycle();
		}
	}

	@ObfuscatedName("g.b(I)V")
	public static void loginPoll() {
		try {
			if (loginFailCount == 0) {
				if (stream != null) {
					stream.close();
					stream = null;
				}
				loginWaitingTime = 0;
				loginSocketReq = null;
				networkError = false;
				loginFailCount = 1;
			}
			if (loginFailCount == 1) {
				if (loginSocketReq == null) {
					loginSocketReq = signlink.socketreq(loginHost, loginPort);
				}
				if (loginSocketReq.status == 2) {
					throw new IOException();
				}
				if (loginSocketReq.status == 1) {
					stream = new ClientStream((Socket) loginSocketReq.result, signlink);
					loginSocketReq = null;
					loginFailCount = 2;
				}
			}
			if (loginFailCount == 2) {
				long var0 = field2259 = TitleScreen.loginUser.method259();
				int var2 = (int) (var0 >> 16 & 0x1FL);
				out.pos = 0;
				out.p1(14);
				out.p1(var2);
				stream.write(out.data, 2);
				loginFailCount = 3;
				in.pos = 0;
			}
			if (loginFailCount == 3) {
				if (midiPcmPlayer != null) {
					midiPcmPlayer.skipNextAcceptedCheck();
				}
				if (soundPcmPlayer != null) {
					soundPcmPlayer.skipNextAcceptedCheck();
				}
				int var3 = stream.read();
				if (midiPcmPlayer != null) {
					midiPcmPlayer.skipNextAcceptedCheck();
				}
				if (soundPcmPlayer != null) {
					soundPcmPlayer.skipNextAcceptedCheck();
				}
				if (var3 != 0) {
					loginError(var3);
					return;
				}
				in.pos = 0;
				loginFailCount = 4;
			}
			if (loginFailCount == 4) {
				if (in.pos < 8) {
					int var4 = stream.available();
					if (var4 > 8 - in.pos) {
						var4 = 8 - in.pos;
					}
					if (var4 > 0) {
						stream.read(in.pos, in.data, var4);
						in.pos += var4;
					}
				}
				if (in.pos == 8) {
					in.pos = 0;
					field2404 = in.g8();
					loginFailCount = 5;
				}
			}
			if (loginFailCount == 5) {
				out.pos = 0;
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (field2404 >> 32), (int) field2404 };
				out.p1(10);
				out.p4(var5[0]);
				out.p4(var5[1]);
				out.p4(var5[2]);
				out.p4(var5[3]);
				out.p8(TitleScreen.loginUser.method259());
				out.pjstr(TitleScreen.loginPass);
				out.rsaenc(field3453, field1486);
				field3202.pos = 0;
				if (state == 40) {
					field3202.p1(18);
				} else {
					field3202.p1(16);
				}
				field3202.p1(out.pos + 93);
				field3202.p4(468);
				field3202.p1(lowMem ? 1 : 0);
				GameShell.pushUID192(field3202);
				field3202.p4(anims.crc);
				field3202.p4(bases.crc);
				field3202.p4(configs.crc);
				field3202.p4(interfaces.crc);
				field3202.p4(jagFX.crc);
				field3202.p4(maps.crc);
				field3202.p4(songs.crc);
				field3202.p4(models.crc);
				field3202.p4(sprites.crc);
				field3202.p4(textures.crc);
				field3202.p4(binary.crc);
				field3202.p4(jingles.crc);
				field3202.p4(scripts.crc);
				field3202.p4(fontMetrics.crc);
				field3202.p4(vorbis.crc);
				field3202.p4(patches.crc);
				field3202.method543(out.pos, out.data);
				stream.write(field3202.data, field3202.pos);
				out.method359(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				in.method359(var5);
				loginFailCount = 6;
			}
			if (loginFailCount == 6 && stream.available() > 0) {
				int var7 = stream.read();
				if (var7 == 21 && state == 20) {
					loginFailCount = 7;
				} else if (var7 == 2) {
					loginFailCount = 9;
				} else if (var7 == 15 && state == 40) {
					reconnectDone();
					return;
				} else if (var7 == 23 && loginStep < 1) {
					loginFailCount = 0;
					loginStep++;
				} else {
					loginError(var7);
					return;
				}
			}
			if (loginFailCount == 7 && stream.available() > 0) {
				loginHopTimer = stream.read() * 60 + 180;
				loginFailCount = 8;
			}
			if (loginFailCount == 8) {
				loginWaitingTime = 0;
				TitleScreen.loginMes(Text.field1873, JagString.join(new JagString[] { JagString.parseInt(loginHopTimer / 60), Text.field481 }), Text.field309);
				if (--loginHopTimer <= 0) {
					loginFailCount = 0;
				}
			} else {
				if (loginFailCount == 9 && stream.available() >= 8) {
					staffmodlevel = stream.read();
					playermod = stream.read() == 1;
					selfSlot = stream.read();
					selfSlot <<= 0x8;
					selfSlot += stream.read();
					membersAccount = stream.read();
					stream.read(0, in.data, 1);
					in.pos = 0;
					ptype = in.g1Enc();
					stream.read(0, in.data, 2);
					in.pos = 0;
					psize = in.g2();
					loginFailCount = 10;
				}
				if (loginFailCount != 10) {
					loginWaitingTime++;
					if (loginWaitingTime > 2000) {
						if (loginStep < 1) {
							if (loginPort == loginGamePort) {
								loginPort = loginJs5Port;
							} else {
								loginPort = loginGamePort;
							}
							loginFailCount = 0;
							loginStep++;
						} else {
							loginError(-3);
						}
					}
				} else if (stream.available() >= psize) {
					in.pos = 0;
					stream.read(0, in.data, psize);
					loginDone();
					field1422 = -1;
					method16(false);
					ptype = -1;
				}
			}
		} catch (IOException var8) {
			if (loginStep < 1) {
				loginStep++;
				if (loginGamePort == loginPort) {
					loginPort = loginJs5Port;
				} else {
					loginPort = loginGamePort;
				}
				loginFailCount = 0;
			} else {
				loginError(-2);
			}
		}
	}

	@ObfuscatedName("r.a(B)V")
	public static void mapBuildLoop() {
		boolean var0 = true;
		preventTimeout(false);
		mapLoadCount = 0;
		for (int var1 = 0; var1 < field3256.length; var1++) {
			if (field2841[var1] != -1 && field3256[var1] == null) {
				field3256[var1] = maps.getFile(field2841[var1], 0);
				if (field3256[var1] == null) {
					mapLoadCount++;
					var0 = false;
				}
			}
			if (field1747[var1] != -1 && field483[var1] == null) {
				field483[var1] = maps.fetchFile(field1747[var1], field1454[var1], 0);
				if (field483[var1] == null) {
					var0 = false;
					mapLoadCount++;
				}
			}
		}
		if (!var0) {
			mapLoadState = 1;
			return;
		}
		locModelLoadCount = 0;
		boolean var2 = true;
		for (int var3 = 0; var3 < field3256.length; var3++) {
			byte[] var4 = field483[var3];
			if (var4 != null) {
				int var5 = (field935[var3] >> 8) * 64 - field1700;
				int var6 = (field935[var3] & 0xFF) * 64 - field2836;
				if (regionmode) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= ClientBuild.method76(var5, var4, var6);
			}
		}
		if (!var2) {
			mapLoadState = 2;
			return;
		}
		if (mapLoadState != 0) {
			messageBox(JagString.join(new JagString[] {Text.LOADING, field2586 }), true);
		}
		doAudio();
		clearCaches();
		doAudio();
		world.resetMap();
		doAudio();
		System.gc();
		for (int var7 = 0; var7 < 4; var7++) {
			levelCollisionMap[var7].reset();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					ClientBuild.mapl[var8][var9][var10] = 0;
				}
			}
		}
		doAudio();
		ClientBuild.init();
		int var11 = field3256.length;
		BgSound.reset();
		preventTimeout(true);
		if (!regionmode) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (field935[var12] & 0xFF) * 64 - field2836;
				byte[] var14 = field3256[var12];
				int var15 = (field935[var12] >> 8) * 64 - field1700;
				if (var14 != null) {
					doAudio();
					ClientBuild.loadGround(var14, (field3251 - 6) * 8, var13, field1422 * 8 - 48, levelCollisionMap, var15);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (field935[var16] >> 8) * 64 - field1700;
				int var18 = (field935[var16] & 0xFF) * 64 - field2836;
				byte[] var19 = field3256[var16];
				if (var19 == null && field3251 < 800) {
					doAudio();
					ClientBuild.fadeAdjacent(var18, var17, 64, 64);
				}
			}
			preventTimeout(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = field483[var20];
				if (var21 != null) {
					int var22 = (field935[var20] >> 8) * 64 - field1700;
					int var23 = (field935[var20] & 0xFF) * 64 - field2836;
					doAudio();
					ClientBuild.method634(var22, world, var21, levelCollisionMap, var23);
				}
			}
		}
		if (regionmode) {
			for (int var24 = 0; var24 < 4; var24++) {
				doAudio();
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						boolean var27 = false;
						int var28 = field641[var24][var25][var26];
						if (var28 != -1) {
							int var29 = var28 >> 24 & 0x3;
							int var30 = var28 >> 1 & 0x3;
							int var31 = var28 >> 14 & 0x3FF;
							int var32 = var28 >> 3 & 0x7FF;
							int var33 = var32 / 8 + (var31 / 8 << 8);
							for (int var34 = 0; var34 < field935.length; var34++) {
								if (field935[var34] == var33 && field3256[var34] != null) {
									var27 = true;
									ClientBuild.loadGroundRegion((var31 & 0x7) * 8, var26 * 8, var25 * 8, (var32 & 0x7) * 8, var29, levelCollisionMap, field3256[var34], var30, var24);
									break;
								}
							}
						}
						if (!var27) {
							ClientBuild.autoGroundRegion(var25 * 8, var26 * 8, var24);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = field641[0][var35][var36];
					if (var37 == -1) {
						ClientBuild.fadeAdjacent(var36 * 8, var35 * 8, 8, 8);
					}
				}
			}
			preventTimeout(true);
			for (int var38 = 0; var38 < 4; var38++) {
				doAudio();
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = field641[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 1 & 0x3;
							int var44 = var41 >> 14 & 0x3FF;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = var45 / 8 + (var44 / 8 << 8);
							for (int var47 = 0; var47 < field935.length; var47++) {
								if (field935[var47] == var46 && field483[var47] != null) {
									ClientBuild.loadLocationsRegion(var38, field483[var47], var42, (var45 & 0x7) * 8, var40 * 8, var39 * 8, world, var43, levelCollisionMap, (var44 & 0x7) * 8);
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
		doAudio();
		ClientBuild.finishBuild(levelCollisionMap, world);
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
		doAudio();
		locChangePostBuildCorrect();
		LocType.mc1.clear();
		if (GameShell.frame != null) {
			out.p1Enc(153);
			out.p4(1057001181);
		}
		if (!regionmode) {
			int var51 = (field1422 + 6) / 8;
			int var52 = (field3251 + 6) / 8;
			int var53 = (field1422 - 6) / 8;
			int var54 = (field3251 - 6) / 8;
			for (int var55 = var53 - 1; var55 <= var51 + 1; var55++) {
				for (int var56 = var54 - 1; var56 <= var52 + 1; var56++) {
					if (var55 < var53 || var55 > var51 || var56 < var54 || var52 < var56) {
						maps.updateCacheHint(JagString.join(new JagString[] { IfType.field767, JagString.parseInt(var55), field361, JagString.parseInt(var56) }));
						maps.updateCacheHint(JagString.join(new JagString[] { PcmPlayer.field2669, JagString.parseInt(var55), field361, JagString.parseInt(var56) }));
					}
				}
			}
		}
		setMainState(30);
		doAudio();
		ClientBuild.quit();
		out.p1Enc(39);
		doneslowupdate();
	}

	@ObfuscatedName("ke.a(B)V")
	public static void gameLoop() {
		if (field68 > 0) {
			field68--;
		}
		if (field1294 > 1) {
			field1294--;
		}
		if (networkError) {
			networkError = false;
			lostCon();
			return;
		}
		for (int var0 = 0; var0 < 100 && tcpIn(); var0++) {
		}
		if (state != 30) {
			return;
		}
		ReflectionChecker.performCheck(out);
		Object var1 = mouseTracking.lock;
		synchronized (mouseTracking.lock) {
			if (!playermod) {
				mouseTracking.length = 0;
			} else if (ClientMouseListener.mouseClickButton != 0 || mouseTracking.length >= 40) {
				int var2 = 0;
				out.p1Enc(119);
				out.p1(0);
				int var3 = out.pos;
				for (int var4 = 0; var4 < mouseTracking.length && out.pos - var3 < 240; var4++) {
					var2++;
					int var5 = mouseTracking.y[var4];
					int var6 = mouseTracking.x[var4];
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 502) {
						var5 = 502;
					}
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 764) {
						var6 = 764;
					}
					int var7 = var5 * 765 + var6;
					if (mouseTracking.y[var4] == -1 && mouseTracking.x[var4] == -1) {
						var7 = 524287;
						var6 = -1;
						var5 = -1;
					}
					if (field1765 != var6 || var5 != field506) {
						int var8 = var6 - field1765;
						field1765 = var6;
						int var9 = var5 - field506;
						field506 = var5;
						if (field3497 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
							var8 += 32;
							var9 += 32;
							out.p2(var9 + (field3497 << 12) + (var8 << 6));
							field3497 = 0;
						} else if (field3497 < 8) {
							out.p3((field3497 << 19) + var7 + 8388608);
							field3497 = 0;
						} else {
							out.p4(var7 + (field3497 << 19) - 1073741824);
							field3497 = 0;
						}
					} else if (field3497 < 2047) {
						field3497++;
					}
				}
				out.method515(out.pos - var3);
				if (mouseTracking.length <= var2) {
					mouseTracking.length = 0;
				} else {
					mouseTracking.length -= var2;
					for (int var10 = 0; var10 < mouseTracking.length; var10++) {
						mouseTracking.x[var10] = mouseTracking.x[var10 + var2];
						mouseTracking.y[var10] = mouseTracking.y[var2 + var10];
					}
				}
			}
		}
		if (ClientMouseListener.mouseClickButton != 0) {
			long var11 = (ClientMouseListener.mouseClickTime - field182) / 50L;
			if (var11 > 4095L) {
				var11 = 4095L;
			}
			field182 = ClientMouseListener.mouseClickTime;
			int var13 = ClientMouseListener.mouseClickX;
			int var14 = ClientMouseListener.mouseClickY;
			if (var13 < 0) {
				var13 = 0;
			} else if (var13 > 764) {
				var13 = 764;
			}
			byte var15 = 0;
			if (ClientMouseListener.mouseClickButton == 2) {
				var15 = 1;
			}
			out.p1Enc(242);
			int var16 = (int) var11;
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 502) {
				var14 = 502;
			}
			int var17 = var14 * 765 + var13;
			out.p4((var16 << 20) + ((var15 << 19) + var17));
		}
		if (field562 > 0) {
			field562--;
		}
		if (ClientKeyboardListener.keyHeld[96] || ClientKeyboardListener.keyHeld[97] || ClientKeyboardListener.keyHeld[98] || ClientKeyboardListener.keyHeld[99]) {
			field2113 = true;
		}
		if (field2113 && field562 <= 0) {
			field2113 = false;
			field562 = 20;
			out.p1Enc(211);
			out.method504(field3054);
			out.method504(field3082);
		}
		if (GameShell.focus && !focusIn) {
			focusIn = true;
			out.p1Enc(177);
			out.p1(1);
		}
		if (!GameShell.focus && focusIn) {
			focusIn = false;
			out.p1Enc(177);
			out.p1(0);
		}
		checkMinimap();
		if (state != 30) {
			return;
		}
		method721();
		method137();
		field703++;
		if (field703 > 750) {
			lostCon();
			return;
		}
		method569();
		method65();
		method397();
		if (field3147 != 0) {
			field3543 += 20;
			if (field3543 >= 400) {
				field3147 = 0;
			}
		}
		worldUpdateNum++;
		if (field89 != null) {
			field3156++;
			if (field3156 >= 15) {
				componentUpdated(field89);
				field89 = null;
			}
		}
		if (field723 != null) {
			componentUpdated(field723);
			field2569++;
			if (field2637 + 5 < ClientMouseListener.mouseX || field2637 - 5 > ClientMouseListener.mouseX || ClientMouseListener.mouseY > objGrabY + 5 || ClientMouseListener.mouseY < objGrabY - 5) {
				field1693 = true;
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (field1693 && field2569 >= 5) {
					if (field723 == field1123 && field2542 != field1856) {
						IfType var18 = field723;
						byte var19 = 0;
						if (field2885 == 1 && var18.field845 == 206) {
							var19 = 1;
						}
						if (var18.field834[field1856] <= 0) {
							var19 = 0;
						}
						if (ServerActive.method436(method1100(var18))) {
							int var22 = field1856;
							int var23 = field2542;
							var18.field834[var22] = var18.field834[var23];
							var18.field753[var22] = var18.field753[var23];
							var18.field834[var23] = -1;
							var18.field753[var23] = 0;
						} else if (var19 == 1) {
							int var20 = field1856;
							int var21 = field2542;
							while (var20 != var21) {
								if (var21 > var20) {
									var18.method309(var21 - 1, var21);
									var21--;
								} else if (var21 < var20) {
									var18.method309(var21 + 1, var21);
									var21++;
								}
							}
						} else {
							var18.method309(field1856, field2542);
						}
						out.p1Enc(56);
						out.method548(field1856);
						out.method533(var19);
						out.method553(field723.parentId);
						out.method546(field2542);
					}
				} else if ((field2898 == 1 || method237(field2849 - 1)) && field2849 > 2) {
					method1030();
				} else if (field2849 > 0) {
					method79(field2849 - 1);
				}
				field723 = null;
				field3156 = 10;
				ClientMouseListener.mouseClickButton = 0;
			}
		}
		field500 = false;
		keypresses = 0;
		field2886 = null;
		field2622 = false;
		IfType var24 = field1163;
		field1163 = null;
		IfType var25 = field1665;
		field1665 = null;
		while (ClientKeyboardListener.method1089() && keypresses < 128) {
			field1733[keypresses] = ClientKeyboardListener.code;
			field188[keypresses] = ClientKeyboardListener.field2562;
			keypresses++;
		}
		method992(field220, 0, 0, 503, 0, 765, 0);
		field2767++;
		while (true) {
			HookReq var26;
			IfType var27;
			IfType var28;
			do {
				var26 = (HookReq) field2598.popFront();
				if (var26 == null) {
					while (true) {
						HookReq var29;
						IfType var30;
						IfType var31;
						do {
							var29 = (HookReq) field1838.popFront();
							if (var29 == null) {
								while (true) {
									HookReq var32;
									IfType var33;
									IfType var34;
									do {
										var32 = (HookReq) field176.popFront();
										if (var32 == null) {
											if (field3629 != null) {
												method722();
											}
											if (World.field3412 != -1) {
												int var35 = World.field3412;
												int var36 = World.field3432;
												boolean var37 = tryMove(true, 0, field373.routeZ[0], 0, 0, var35, field373.routeX[0], 0, var36, 0, 0);
												World.field3412 = -1;
												if (var37) {
													field3543 = 0;
													field3545 = ClientMouseListener.mouseClickY;
													field3147 = 1;
													field499 = ClientMouseListener.mouseClickX;
												}
											}
											method1190();
											if (var24 != field1163) {
												if (var24 != null) {
													componentUpdated(var24);
												}
												if (field1163 != null) {
													componentUpdated(field1163);
												}
											}
											if (field1665 != var25 && field924 == field2121) {
												if (var25 != null) {
													componentUpdated(var25);
												}
												if (field1665 != null) {
													componentUpdated(field1665);
												}
											}
											if (field1665 == null) {
												if (field924 > 0) {
													field924--;
												}
											} else if (field2121 > field924) {
												field924++;
												if (field924 == field2121) {
													componentUpdated(field1665);
												}
											}
											method1037();
											if (field418) {
												method1213();
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = field351[var38]++;
											}
											int var39 = ClientMouseListener.getIdleTimer();
											int var40 = ClientKeyboardListener.getIdleTimer();
											if (var39 > 4500 && var40 > 4500) {
												field68 = 250;
												ClientMouseListener.setIdleTimer(4000);

												// IDLE_TIMER
												out.p1Enc(13);
											}
											field1469++;
											field1933++;
											noTimeoutCycle++;
											if (field1933 > 500) {
												field1933 = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x2) == 2) {
													field225 += field553;
												}
												if ((var41 & 0x4) == 4) {
													field173 += field194;
												}
												if ((var41 & 0x1) == 1) {
													field3067 += field1501;
												}
											}
											if (field173 < -40) {
												field194 = 1;
											}
											if (field1469 > 500) {
												field1469 = 0;
												int var42 = (int) (Math.random() * 8.0D);
												if ((var42 & 0x1) == 1) {
													field493 += field701;
												}
												if ((var42 & 0x2) == 2) {
													field527 += field102;
												}
											}
											if (field3067 < -50) {
												field1501 = 2;
											}
											if (field527 < -20) {
												field102 = 1;
											}
											if (field527 > 10) {
												field102 = -1;
											}
											if (field3067 > 50) {
												field1501 = -2;
											}
											if (field173 > 40) {
												field194 = -1;
											}
											if (field225 < -55) {
												field553 = 2;
											}
											if (field225 > 55) {
												field553 = -2;
											}
											if (field493 < -60) {
												field701 = 2;
											}
											if (field493 > 60) {
												field701 = -2;
											}
											if (noTimeoutCycle > 50) {
												out.p1Enc(232);
											}
											try {
												if (stream != null && out.pos > 0) {
													stream.write(out.data, out.pos);
													out.pos = 0;
													noTimeoutCycle = 0;
													return;
												}
												return;
											} catch (IOException var43) {
												lostCon();
												return;
											}
										}
										var33 = var32.component;
										if (var33.subId < 0) {
											break;
										}
										var34 = IfType.get(var33.field864);
									} while (var34 == null || var34.field754 == null || var34.field754.length <= var33.subId || var33 != var34.field754[var33.subId]);
									ScriptRunner.executeScript(var32);
								}
							}
							var30 = var29.component;
							if (var30.subId < 0) {
								break;
							}
							var31 = IfType.get(var30.field864);
						} while (var31 == null || var31.field754 == null || var31.field754.length <= var30.subId || var31.field754[var30.subId] != var30);
						ScriptRunner.executeScript(var29);
					}
				}
				var27 = var26.component;
				if (var27.subId < 0) {
					break;
				}
				var28 = IfType.get(var27.field864);
			} while (var28 == null || var28.field754 == null || var27.subId >= var28.field754.length || var27 != var28.field754[var27.subId]);
			ScriptRunner.executeScript(var26);
		}
	}

	@ObfuscatedName("bf.a(Lec;IZ)V")
	public static void messageBox(JagString arg0, boolean arg1) {
		int var2 = p12.predictWidthMultiline(arg0, 250);
		int var3 = p12.predictLinesMultiline(arg0, 250) * 13;
		Pix2D.fillRect(6, 6, var2 + 4 + 4, var3 - -4 + 4, 0);
		Pix2D.drawRect(6, 6, var2 + 8, var3 - -4 + 4, 16777215);
		p12.drawStringMultiline(arg0, 10, 10, var2, var3, 16777215, -1, 1, 1, 0);
		dirtyArea(6, 6, var2 + 4 + 4, 4 + 4 + var3);
		if (!arg1) {
			method265(var2, 10, 10, var3);
			return;
		}
		try {
			Graphics var4 = canvas.getGraphics();
			GameShell.drawArea.draw(var4);
		} catch (Exception var5) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("ie.a(B)V")
	public static void gameDraw() {
		if (!field476) {
			field2575[0] = Text.CANCEL;
			field1295[0] = field1786;
			field2849 = 1;
			field1034[0] = 1007;
		}
		if (field220 != -1) {
			method869(field220);
		}
		for (int var0 = 0; var0 < componentDrawCount; var0++) {
			if (field3297[var0]) {
				componentRedrawRequested2[var0] = true;
			}
			field1318[var0] = field3297[var0];
			field3297[var0] = false;
		}
		field1123 = null;
		field3513 = -1;
		field563 = loopCycle;
		field677 = -1;
		if (field220 != -1) {
			componentDrawCount = 0;
			method656(0, 0, field220, 0, -1, 765, 503, 0);
		}
		Pix2D.resetClipping();
		method1187();
		if (field476) {
			method1072();
		} else if (field677 != -1) {
			method974(field3513, field677);
		}
		if (componentDrawMode == 3) {
			for (int var1 = 0; var1 < componentDrawCount; var1++) {
				if (field1318[var1]) {
					Pix2D.fillRectTrans(field3287[var1], field2892[var1], field512[var1], field366[var1], 16711935, 128);
				} else if (componentRedrawRequested2[var1]) {
					Pix2D.fillRectTrans(field3287[var1], field2892[var1], field512[var1], field366[var1], 16711680, 128);
				}
			}
		}
		doMix(field373.z, field373.x, worldUpdateNum, minusedlevel);
		worldUpdateNum = 0;
	}

	@ObfuscatedName("ue.d(I)V")
	public static void setLowMem() {
		World.field3427 = true;
		lowMem = true;
	}

	@ObfuscatedName("ta.a(B)V")
	public static void setHighMem() {
		lowMem = false;
		World.field3427 = false;
	}

	@ObfuscatedName("r.a(ZB)V")
	public static void preventTimeout(boolean arg0) {
		doAudio();
		noTimeoutCycle++;
		if (noTimeoutCycle < 50 && !arg0) {
			return;
		}
		noTimeoutCycle = 0;
		if (networkError || stream == null) {
			return;
		}
		out.p1Enc(232);
		try {
			stream.write(out.data, out.pos);
			out.pos = 0;
		} catch (IOException var1) {
			networkError = true;
		}
	}

	@ObfuscatedName("ld.b(I)V")
	public static void zonePacket() {
		if (ptype == 164) {
			int var0 = in.method524();
			byte var1 = in.method534();
			int var2 = in.method524();
			int var3 = in.method535();
			int var4 = var3 >> 2;
			int var5 = field3131[var4];
			int var6 = var3 & 0x3;
			byte var7 = in.method536();
			int var8 = in.method518();
			byte var9 = in.method511();
			int var10 = in.g2();
			byte var11 = in.method536();
			int var12 = in.method535();
			int var13 = (var12 >> 4 & 0x7) + field997;
			int var14 = field368 + (var12 & 0x7);
			ClientPlayer var15;
			if (var8 == selfSlot) {
				var15 = field373;
			} else {
				var15 = players[var8];
			}
			if (var15 != null) {
				LocType var16 = LocType.list(var10);
				int var17;
				int var18;
				if (var6 == 1 || var6 == 3) {
					var17 = var16.width;
					var18 = var16.length;
				} else {
					var17 = var16.length;
					var18 = var16.width;
				}
				int var19 = var13 + (var18 >> 1);
				int var20 = var13 + (var18 + 1 >> 1);
				int var21 = (var17 >> 1) + var14;
				int var22 = (var17 + 1 >> 1) + var14;
				int[][] var23 = ClientBuild.groundh[minusedlevel];
				int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
				int var25 = (var18 << 6) + (var13 << 7);
				int var26 = (var14 << 7) + (var17 << 6);
				ModelLit var27 = var16.method412(var25, var4, var26, var23, var6, var24);
				if (var27 != null) {
					if (var9 > var7) {
						byte var28 = var9;
						var9 = var7;
						var7 = var28;
					}
					method1081(var14, var2 + 1, var13, var5, 0, minusedlevel, var0 + 1, 0, -1);
					var15.locEndCycle = loopCycle + var0;
					var15.locStartCycle = loopCycle + var2;
					if (var1 > var11) {
						byte var29 = var1;
						var1 = var11;
						var11 = var29;
					}
					var15.locOffsetX = var13 * 128 + var18 * 64;
					var15.field1644 = var24;
					var15.field1645 = var1 + var14;
					var15.field1632 = var9 + var13;
					var15.field1642 = var7 + var13;
					var15.locModel = var27;
					var15.field1636 = var11 + var14;
					var15.locOffsetZ = var17 * 64 + var14 * 128;
				}
			}
		}
		if (ptype == 26) {
			int var30 = in.method524();
			int var31 = in.g1();
			int var32 = field997 + (var31 >> 4 & 0x7);
			int var33 = field368 + (var31 & 0x7);
			int var34 = in.method519();
			if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
				ClientObj var35 = new ClientObj();
				var35.count = var30;
				var35.id = var34;
				if (groundObj[minusedlevel][var32][var33] == null) {
					groundObj[minusedlevel][var32][var33] = new LinkList();
				}
				groundObj[minusedlevel][var32][var33].push(var35);
				showObject(var33, var32);
			}
		} else if (ptype == 147) {
			int var36 = in.g1();
			int var37 = var36 & 0x3;
			int var38 = var36 >> 2;
			int var39 = field3131[var38];
			int var40 = in.method529();
			int var41 = (var40 & 0x7) + field368;
			int var42 = (var40 >> 4 & 0x7) + field997;
			int var43 = in.method518();
			if (var42 >= 0 && var41 >= 0 && var42 < 103 && var41 < 103) {
				if (var39 == 0) {
					Wall var44 = world.method1123(minusedlevel, var42, var41);
					if (var44 != null) {
						int var45 = var44.field42 >> 14 & 0x7FFF;
						if (var38 == 2) {
							var44.field29 = new ClientLocAnim(var45, 2, var37 + 4, minusedlevel, var42, var41, var43, false, var44.field29);
							var44.field32 = new ClientLocAnim(var45, 2, var37 + 1 & 0x3, minusedlevel, var42, var41, var43, false, var44.field32);
						} else {
							var44.field29 = new ClientLocAnim(var45, var38, var37, minusedlevel, var42, var41, var43, false, var44.field29);
						}
					}
				}
				if (var39 == 1) {
					Decor var46 = world.method1150(minusedlevel, var42, var41);
					if (var46 != null) {
						int var47 = var46.field2825 >> 14 & 0x7FFF;
						if (var38 == 4 || var38 == 5) {
							var46.field2831 = new ClientLocAnim(var47, 4, var37, minusedlevel, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 6) {
							var46.field2831 = new ClientLocAnim(var47, 4, var37 + 4, minusedlevel, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 7) {
							var46.field2831 = new ClientLocAnim(var47, 4, (var37 + 2 & 0x3) + 4, minusedlevel, var42, var41, var43, false, var46.field2831);
						} else if (var38 == 8) {
							var46.field2831 = new ClientLocAnim(var47, 4, var37 + 4, minusedlevel, var42, var41, var43, false, var46.field2831);
							var46.field2817 = new ClientLocAnim(var47, 4, (var37 + 2 & 0x3) + 4, minusedlevel, var42, var41, var43, false, var46.field2817);
						}
					}
				}
				if (var39 == 2) {
					Sprite var48 = world.method1119(minusedlevel, var42, var41);
					if (var38 == 11) {
						var38 = 10;
					}
					if (var48 != null) {
						var48.model = new ClientLocAnim(var48.field1067 >> 14 & 0x7FFF, var38, var37, minusedlevel, var42, var41, var43, false, var48.model);
					}
				}
				if (var39 == 3) {
					GroundDecor var49 = world.method1160(minusedlevel, var42, var41);
					if (var49 != null) {
						var49.field1770 = new ClientLocAnim(var49.field1766 >> 14 & 0x7FFF, 22, var37, minusedlevel, var42, var41, var43, false, var49.field1770);
					}
				}
			}
		} else if (ptype == 32) {
			int var50 = in.method529();
			int var51 = (var50 >> 4 & 0x7) + field997;
			int var52 = (var50 & 0x7) + field368;
			int var53 = in.method524();
			if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
				LinkList var54 = groundObj[minusedlevel][var51][var52];
				if (var54 != null) {
					for (ClientObj var55 = (ClientObj) var54.head(); var55 != null; var55 = (ClientObj) var54.next()) {
						if ((var53 & 0x7FFF) == var55.id) {
							var55.unlink();
							break;
						}
					}
					if (var54.head() == null) {
						groundObj[minusedlevel][var51][var52] = null;
					}
					showObject(var52, var51);
				}
			}
		} else if (ptype == 138) {
			int var56 = in.g1();
			int var57 = (var56 >> 4 & 0x7) + field997;
			int var58 = (var56 & 0x7) + field368;
			int var59 = in.g2();
			int var60 = in.g2();
			int var61 = in.g2();
			if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
				LinkList var62 = groundObj[minusedlevel][var57][var58];
				if (var62 != null) {
					for (ClientObj var63 = (ClientObj) var62.head(); var63 != null; var63 = (ClientObj) var62.next()) {
						if ((var59 & 0x7FFF) == var63.id && var60 == var63.count) {
							var63.count = var61;
							break;
						}
					}
					showObject(var58, var57);
				}
			}
		} else if (ptype == 150) {
			int var64 = in.method520();
			int var65 = var64 >> 2;
			int var66 = var64 & 0x3;
			int var67 = field3131[var65];
			int var68 = in.method529();
			int var69 = field997 + (var68 >> 4 & 0x7);
			int var70 = field368 + (var68 & 0x7);
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
				method1081(var70, 0, var69, var67, var66, minusedlevel, -1, var65, -1);
			}
		} else if (ptype == 120) {
			int var71 = in.g1();
			int var72 = field368 + (var71 & 0x7);
			int var73 = (var71 >> 4 & 0x7) + field997;
			int var74 = in.g2();
			int var75 = in.g1();
			int var76 = in.g2();
			if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
				int var77 = var72 * 128 + 64;
				int var78 = var73 * 128 + 64;
				MapSpotAnim var79 = new MapSpotAnim(var74, minusedlevel, var78, var77, getAvH(minusedlevel, var78, var77) - var75, var76, loopCycle);
				field3594.push(var79);
			}
		} else if (ptype == 103) {
			int var80 = in.method524();
			int var81 = in.method518();
			int var82 = in.method535();
			int var83 = field997 + (var82 >> 4 & 0x7);
			int var84 = field368 + (var82 & 0x7);
			int var85 = in.method519();
			if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && selfSlot != var81) {
				ClientObj var86 = new ClientObj();
				var86.id = var85;
				var86.count = var80;
				if (groundObj[minusedlevel][var83][var84] == null) {
					groundObj[minusedlevel][var83][var84] = new LinkList();
				}
				groundObj[minusedlevel][var83][var84].push(var86);
				showObject(var84, var83);
			}
		} else if (ptype == 105) {
			int var87 = in.method529();
			int var88 = var87 >> 2;
			int var89 = var87 & 0x3;
			int var90 = field3131[var88];
			int var91 = in.method518();
			int var92 = in.method520();
			int var93 = (var92 >> 4 & 0x7) + field997;
			int var94 = (var92 & 0x7) + field368;
			if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
				method1081(var94, 0, var93, var90, var89, minusedlevel, -1, var88, var91);
			}
		} else {
			if (ptype == 195) {
				int var95 = in.g1();
				int var96 = field997 + (var95 >> 4 & 0x7);
				int var97 = (var95 & 0x7) + field368;
				int var98 = in.g2();
				int var99 = in.g1();
				int var100 = in.g1();
				int var101 = var99 & 0x7;
				int var102 = var99 >> 4 & 0xF;
				if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
					int var103 = var102 + 1;
					if (var96 - var103 <= field373.routeX[0] && field373.routeX[0] <= var103 + var96 && var97 - var103 <= field373.routeZ[0] && field373.routeZ[0] <= var97 + var103 && PcmPlayer.field2646 != 0 && var101 > 0 && field3277 < 50) {
						field1195[field3277] = var98;
						field2923[field3277] = var101;
						field2626[field3277] = var100;
						field1509[field3277] = null;
						field2672[field3277] = var102 + (var97 << 8) + (var96 << 16);
						field3277++;
					}
				}
			}
			if (ptype == 82) {
				int var104 = in.g1();
				int var105 = (var104 >> 4 & 0x7) + field997;
				int var106 = field368 + (var104 & 0x7);
				int var107 = var105 + in.g1b();
				int var108 = in.g1b() + var106;
				int var109 = in.method551();
				int var110 = in.g2();
				int var111 = in.g1() * 4;
				int var112 = in.g1() * 4;
				int var113 = in.g2();
				int var114 = in.g2();
				int var115 = in.g1();
				int var116 = in.g1();
				if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
					int var117 = var106 * 128 + 64;
					int var118 = var105 * 128 + 64;
					int var119 = var108 * 128 + 64;
					ClientProj var120 = new ClientProj(var110, minusedlevel, var118, var117, getAvH(minusedlevel, var118, var117) - var111, loopCycle + var113, loopCycle + var114, var115, var116, var109, var112);
					int var121 = var107 * 128 + 64;
					var120.setTarget(var119, var121, var113 + loopCycle, -var112 + getAvH(minusedlevel, var121, var119));
					field2038.push(var120);
				}
			}
		}
	}

	@ObfuscatedName("na.a(I)V")
	public static void method717() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@ObfuscatedName("nd.a(ZIIIIIIIIIII)Z")
	public static boolean tryMove(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				dirMap[var11][var12] = 0;
				distMap[var11][var12] = 99999999;
			}
		}
		dirMap[arg6][arg2] = 99;
		distMap[arg6][arg2] = 0;
		int var13 = arg6;
		int var14 = arg2;
		int var15 = 0;
		byte var16 = 0;
		routeX[0] = arg6;
		boolean var17 = false;
		int var35 = var16 + 1;
		routeZ[0] = arg2;
		int var18 = routeX.length;
		int[][] var19 = levelCollisionMap[minusedlevel].flags;
		while (var35 != var15) {
			var14 = routeZ[var15];
			var13 = routeX[var15];
			var15 = (var15 + 1) % var18;
			if (arg5 == var13 && arg8 == var14) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && levelCollisionMap[minusedlevel].testWall(arg1, arg8, var14, arg5, arg3 - 1, var13)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && levelCollisionMap[minusedlevel].testWDecor(arg5, arg3 - 1, arg1, var13, var14, arg8)) {
					var17 = true;
					break;
				}
			}
			if (arg9 != 0 && arg4 != 0 && levelCollisionMap[minusedlevel].testLoc(var14, arg9, arg4, var13, arg8, arg5, arg7)) {
				var17 = true;
				break;
			}
			int var20 = distMap[var13][var14] + 1;
			if (var13 > 0 && dirMap[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
				routeX[var35] = var13 - 1;
				routeZ[var35] = var14;
				var35 = (var35 + 1) % var18;
				dirMap[var13 - 1][var14] = 2;
				distMap[var13 - 1][var14] = var20;
			}
			if (var13 < 103 && dirMap[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
				routeX[var35] = var13 + 1;
				routeZ[var35] = var14;
				var35 = (var35 + 1) % var18;
				dirMap[var13 + 1][var14] = 8;
				distMap[var13 + 1][var14] = var20;
			}
			if (var14 > 0 && dirMap[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var35] = var13;
				routeZ[var35] = var14 - 1;
				dirMap[var13][var14 - 1] = 1;
				distMap[var13][var14 - 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var14 < 103 && dirMap[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var35] = var13;
				routeZ[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				dirMap[var13][var14 + 1] = 4;
				distMap[var13][var14 + 1] = var20;
			}
			if (var13 > 0 && var14 > 0 && dirMap[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var35] = var13 - 1;
				routeZ[var35] = var14 - 1;
				dirMap[var13 - 1][var14 - 1] = 3;
				var35 = (var35 + 1) % var18;
				distMap[var13 - 1][var14 - 1] = var20;
			}
			if (var13 < 103 && var14 > 0 && dirMap[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var35] = var13 + 1;
				routeZ[var35] = var14 - 1;
				dirMap[var13 + 1][var14 - 1] = 9;
				distMap[var13 + 1][var14 - 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var13 > 0 && var14 < 103 && dirMap[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var35] = var13 - 1;
				routeZ[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				dirMap[var13 - 1][var14 + 1] = 6;
				distMap[var13 - 1][var14 + 1] = var20;
			}
			if (var13 < 103 && var14 < 103 && dirMap[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var35] = var13 + 1;
				routeZ[var35] = var14 + 1;
				dirMap[var13 + 1][var14 + 1] = 12;
				var35 = (var35 + 1) % var18;
				distMap[var13 + 1][var14 + 1] = var20;
			}
		}
		field1327 = 0;
		if (!var17) {
			if (!arg0) {
				return false;
			}
			int var21 = 1000;
			int var22 = 100;
			for (int var23 = arg5 - 10; var23 <= arg5 + 10; var23++) {
				for (int var24 = arg8 - 10; var24 <= arg8 + 10; var24++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && distMap[var23][var24] < 100) {
						int var25 = 0;
						if (var24 < arg8) {
							var25 = arg8 - var24;
						} else if (var24 > arg4 + arg8 - 1) {
							var25 = var24 + 1 - arg8 - arg4;
						}
						int var26 = 0;
						if (var23 < arg5) {
							var26 = arg5 - var23;
						} else if (var23 > arg5 + arg9 - 1) {
							var26 = var23 + 1 - arg9 - arg5;
						}
						int var27 = var25 * var25 + var26 * var26;
						if (var21 > var27 || var27 == var21 && var22 > distMap[var23][var24]) {
							var13 = var23;
							var14 = var24;
							var21 = var27;
							var22 = distMap[var23][var24];
						}
					}
				}
			}
			if (var21 == 1000) {
				return false;
			}
			if (var13 == arg6 && var14 == arg2) {
				return false;
			}
			field1327 = 1;
		}
		byte var28 = 0;
		routeX[0] = var13;
		int var36 = var28 + 1;
		routeZ[0] = var14;
		int var29;
		int var30 = var29 = dirMap[var13][var14];
		while (var13 != arg6 || var14 != arg2) {
			if (var29 != var30) {
				var29 = var30;
				routeX[var36] = var13;
				routeZ[var36++] = var14;
			}
			if ((var30 & 0x2) != 0) {
				var13++;
			} else if ((var30 & 0x8) != 0) {
				var13--;
			}
			if ((var30 & 0x1) != 0) {
				var14++;
			} else if ((var30 & 0x4) != 0) {
				var14--;
			}
			var30 = dirMap[var13][var14];
		}
		if (var36 > 0) {
			int var31 = var36--;
			int var32 = routeZ[var36];
			int var33 = routeX[var36];
			if (var31 > 25) {
				var31 = 25;
			}
			if (arg10 == 0) {
				out.p1Enc(184);
				out.p1(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				out.p1Enc(24);
				out.p1(var31 + var31 + 17);
			}
			if (arg10 == 2) {
				out.p1Enc(110);
				out.p1(var31 + var31 + 3);
			}
			out.method504(var33 + field1700);
			field1066 = routeX[0];
			field615 = routeZ[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				out.method533(routeX[var36] - var33);
				out.method506(routeZ[var36] - var32);
			}
			out.method533(ClientKeyboardListener.keyHeld[82] ? 1 : 0);
			out.p2(var32 + field2836);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("vc.a(IILec;)V")
	public static void opPlayer(int arg0, JagString arg1) {
		JagString var2 = arg1.method244().method264();
		boolean var3 = false;
		for (int var4 = 0; var4 < field1404; var4++) {
			ClientPlayer var5 = players[field3187[var4]];
			if (var5 != null && var5.name != null && var5.name.method271(var2)) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var5.routeX[0], field373.routeX[0], 0, var5.routeZ[0], 1, 2);
				var3 = true;
				if (arg0 == 1) {
					out.p1Enc(35);
					out.method546(field3187[var4]);
				} else if (arg0 == 4) {
					out.p1Enc(81);
					out.method504(field3187[var4]);
				} else if (arg0 == 6) {
					out.p1Enc(193);
					out.p2(field3187[var4]);
				} else if (arg0 == 7) {
					out.p1Enc(138);
					out.method548(field3187[var4]);
				}
				break;
			}
		}
		if (!var3) {
			addChat(JagString.join(new JagString[] { Text.field2238, var2 }), 0, field1786);
		}
	}

	@ObfuscatedName("vc.a(JI)V")
	public static void method1112(long arg0) {
		if (arg0 != 0L) {
			out.p1Enc(23);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("ba.a(B)V")
	public static void getPlayerPosOldVis() {
		int var0 = in.method352(8);
		if (field1404 > var0) {
			for (int var1 = var0; var1 < field1404; var1++) {
				field495[field2391++] = field3187[var1];
			}
		}
		if (field1404 < var0) {
			throw new RuntimeException("gppov1");
		}
		field1404 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = field3187[var2];
			ClientPlayer var4 = players[var3];
			int var5 = in.method352(1);
			if (var5 == 0) {
				field3187[field1404++] = var3;
				var4.field2713 = loopCycle;
			} else {
				int var6 = in.method352(2);
				if (var6 == 0) {
					field3187[field1404++] = var3;
					var4.field2713 = loopCycle;
					field1418[field1352++] = var3;
				} else if (var6 == 1) {
					field3187[field1404++] = var3;
					var4.field2713 = loopCycle;
					int var7 = in.method352(3);
					var4.moveCode(var7, false);
					int var8 = in.method352(1);
					if (var8 == 1) {
						field1418[field1352++] = var3;
					}
				} else if (var6 == 2) {
					field3187[field1404++] = var3;
					var4.field2713 = loopCycle;
					int var9 = in.method352(3);
					var4.moveCode(var9, true);
					int var10 = in.method352(3);
					var4.moveCode(var10, true);
					int var11 = in.method352(1);
					if (var11 == 1) {
						field1418[field1352++] = var3;
					}
				} else if (var6 == 3) {
					field495[field2391++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("nd.a(ILec;B)V")
	public static void method744(int arg0, JagString arg1) {
		out.p1Enc(205);
		out.method547(arg0);
		out.method512(arg1.method259());
	}

	@ObfuscatedName("nd.b(I)V")
	public static void getNpcPosOldVis() {
		in.method351();
		int var0 = in.method352(8);
		if (var0 < field2397) {
			for (int var1 = var0; var1 < field2397; var1++) {
				field495[field2391++] = field313[var1];
			}
		}
		if (field2397 < var0) {
			throw new RuntimeException("gnpov1");
		}
		field2397 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = field313[var2];
			ClientNpc var4 = npcs[var3];
			int var5 = in.method352(1);
			if (var5 == 0) {
				field313[field2397++] = var3;
				var4.field2713 = loopCycle;
			} else {
				int var6 = in.method352(2);
				if (var6 == 0) {
					field313[field2397++] = var3;
					var4.field2713 = loopCycle;
					field1418[field1352++] = var3;
				} else if (var6 == 1) {
					field313[field2397++] = var3;
					var4.field2713 = loopCycle;
					int var7 = in.method352(3);
					var4.moveCode(var7, false);
					int var8 = in.method352(1);
					if (var8 == 1) {
						field1418[field1352++] = var3;
					}
				} else if (var6 == 2) {
					field313[field2397++] = var3;
					var4.field2713 = loopCycle;
					int var9 = in.method352(3);
					var4.moveCode(var9, true);
					int var10 = in.method352(3);
					var4.moveCode(var10, true);
					int var11 = in.method352(1);
					if (var11 == 1) {
						field1418[field1352++] = var3;
					}
				} else if (var6 == 3) {
					field495[field2391++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("he.a(II)V")
	public static void setMainState(int arg0) {
		if (state == arg0) {
			return;
		}
		if (state == 0) {
			resetProgress();
		}
		if (arg0 == 20 || arg0 == 40) {
			loginStep = 0;
			loginWaitingTime = 0;
			loginFailCount = 0;
		}
		if (arg0 != 20 && arg0 != 40 && prevStream != null) {
			prevStream.close();
			prevStream = null;
		}
		if (state == 25) {
			mapLoadPrevCount = 1;
			locModelLoadPrevCount = 1;
			mapLoadState = 0;
			mapLoadCount = 0;
			locModelLoadCount = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			TitleScreen.open(binary, sprites, canvas);
		} else {
			TitleScreen.close();
		}
		state = arg0;
	}

	@ObfuscatedName("t.a(IBZZZ)Lga;")
	public static Js5Loader openJs5(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (cacheDat != null) {
			var4 = new DataFile(arg0, cacheDat, cacheIndex[arg0], 1000000);
		}
		return new Js5Loader(var4, field3032, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("rc.a(IIIIBI)V")
	public static void startRebuild(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 == field1422 && arg2 == field3251 && (lastBuiltLevel == arg0 || !lowMem)) {
			return;
		}
		lastBuiltLevel = arg0;
		if (!lowMem) {
			lastBuiltLevel = 0;
		}
		field1422 = arg3;
		field3251 = arg2;
		setMainState(25);
		messageBox(Text.LOADING, true);
		int var5 = field1700;
		field1700 = arg3 * 8 - 48;
		int var6 = field2836;
		field2836 = (arg2 - 6) * 8;
		int var7 = field1700 - var5;
		int var8 = field2836 - var6;
		for (int var9 = 0; var9 < 32768; var9++) {
			ClientNpc var10 = npcs[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.routeX[var11] -= var7;
					var10.routeZ[var11] -= var8;
				}
				var10.x -= var7 * 128;
				var10.z -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			ClientPlayer var13 = players[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.routeX[var14] -= var7;
					var13.routeZ[var14] -= var8;
				}
				var13.x -= var7 * 128;
				var13.z -= var8 * 128;
			}
		}
		minusedlevel = arg0;
		field373.teleport(arg1, false, arg4);
		byte var15 = 0;
		byte var16 = 104;
		byte var17 = 1;
		byte var18 = 0;
		if (var7 < 0) {
			var15 = 103;
			var17 = -1;
			var16 = -1;
		}
		byte var19 = 1;
		byte var20 = 104;
		if (var8 < 0) {
			var18 = 103;
			var20 = -1;
			var19 = -1;
		}
		for (int var21 = var15; var21 != var16; var21 += var17) {
			for (int var22 = var18; var22 != var20; var22 += var19) {
				int var23 = var8 + var22;
				int var24 = var7 + var21;
				for (int var25 = 0; var25 < 4; var25++) {
					if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
						groundObj[var25][var21][var22] = groundObj[var25][var24][var23];
					} else {
						groundObj[var25][var21][var22] = null;
					}
				}
			}
		}
		for (LocChange var26 = (LocChange) field1076.head(); var26 != null; var26 = (LocChange) field1076.next()) {
			var26.field405 -= var7;
			var26.field420 -= var8;
			if (var26.field405 < 0 || var26.field420 < 0 || var26.field405 >= 104 || var26.field420 >= 104) {
				var26.unlink();
			}
		}
		if (field1066 != 0) {
			field1066 -= var7;
			field615 -= var8;
		}
		field418 = false;
		field3277 = 0;
		minimapLevel = -1;
		field3594.clear();
		field2038.clear();
	}

	@ObfuscatedName("fb.a(III)V")
	public static void method315(int arg0, int arg1) {
		if (field3638 != 0 && arg0 != -1) {
			MidiManager.play(jingles, arg0, field3638, 0);
			playingJingle = true;
		}
	}

	@ObfuscatedName("te.a(Z)V")
	public static void method1037() {
		if (ClientKeyboardListener.keyHeld[98]) {
			field3121 += (12 - field3121) / 2;
		} else if (ClientKeyboardListener.keyHeld[99]) {
			field3121 += (-field3121 - 12) / 2;
		} else {
			field3121 /= 2;
		}
		field3082 += field3121 / 2;
		if (field3082 < 128) {
			field3082 = 128;
		}
		if (field3082 > 383) {
			field3082 = 383;
		}
		if (ClientKeyboardListener.keyHeld[96]) {
			field2577 += (-field2577 - 24) / 2;
		} else if (ClientKeyboardListener.keyHeld[97]) {
			field2577 += (24 - field2577) / 2;
		} else {
			field2577 /= 2;
		}
		field3054 = field3054 + field2577 / 2 & 0x7FF;
		int var0 = field3067 + field373.x;
		int var1 = field225 + field373.z;
		if (field1319 - var0 < -500 || field1319 - var0 > 500 || field2536 - var1 < -500 || field2536 - var1 > 500) {
			field2536 = var1;
			field1319 = var0;
		}
		if (field1319 != var0) {
			field1319 += (var0 - field1319) / 16;
		}
		if (var1 != field2536) {
			field2536 += (var1 - field2536) / 16;
		}
		int var2 = field1319 >> 7;
		int var3 = 0;
		int var4 = field2536 >> 7;
		int var5 = getAvH(minusedlevel, field1319, field2536);
		if (var2 > 3 && var4 > 3 && var2 < 100 && var4 < 100) {
			for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
				for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
					int var8 = minusedlevel;
					if (var8 < 3 && (ClientBuild.mapl[1][var6][var7] & 0x2) == 2) {
						var8++;
					}
					int var9 = var5 - ClientBuild.groundh[var8][var6][var7];
					if (var9 > var3) {
						var3 = var9;
					}
				}
			}
		}
		int var10 = var3 * 192;
		if (var10 > 98048) {
			var10 = 98048;
		}
		if (var10 < 32768) {
			var10 = 32768;
		}
		if (var10 > field469) {
			field469 += (var10 - field469) / 24;
		} else if (field469 > var10) {
			field469 += (var10 - field469) / 80;
		}
	}

	@ObfuscatedName("te.a(B)V")
	public static void locChangePostBuildCorrect() {
		for (LocChange var0 = (LocChange) field1076.head(); var0 != null; var0 = (LocChange) field1076.next()) {
			if (var0.endTime == -1) {
				var0.startTime = 0;
				method20(var0);
			} else {
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("i.a(ILec;IIILec;I)V")
	public static void method442(int arg0, JagString arg1, int arg2, int arg3, JagString arg4, int arg5) {
		if (field476 || field2849 >= 500) {
			return;
		}
		field2575[field2849] = arg1;
		field1295[field2849] = arg4;
		field1034[field2849] = arg3;
		field3135[field2849] = arg0;
		field2868[field2849] = arg5;
		field3620[field2849] = arg2;
		field2849++;
	}

	@ObfuscatedName("i.a(BIIII)V")
	public static void method439(int arg0, int arg1, int arg2, int arg3) {
		field2848 = 0;
		for (int var4 = -1; var4 < field1404 + field2397; var4++) {
			ClientEntity var5;
			if (var4 == -1) {
				var5 = field373;
			} else if (var4 < field1404) {
				var5 = players[field3187[var4]];
			} else {
				var5 = npcs[field313[var4 - field1404]];
			}
			if (var5 != null && var5.ready()) {
				if (var5 instanceof ClientNpc) {
					NPCType var6 = ((ClientNpc) var5).type;
					if (var6.field2214 != null) {
						var6 = var6.method757();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (field1404 <= var4) {
					NPCType var7 = ((ClientNpc) var5).type;
					if (var7.field2214 != null) {
						var7 = var7.method757();
					}
					if (var7.field2217 >= 0 && var7.field2217 < field168.length) {
						method720(var5, var5.height + 15);
						if (field2055 > -1) {
							field168[var7.field2217].plotSprite(arg2 + field2055 - 12, field3001 + arg1 - 30);
						}
					}
					if (field2911 == 1 && field1854 == field313[var4 - field1404] && loopCycle % 20 < 10) {
						method720(var5, var5.height + 15);
						if (field2055 > -1) {
							field3019[0].plotSprite(arg2 + field2055 - 12, arg1 + field3001 + -28);
						}
					}
				} else {
					int var8 = 30;
					ClientPlayer var9 = (ClientPlayer) var5;
					if (var9.headiconPk != -1 || var9.headiconPrayer != -1) {
						method720(var5, var5.height + 15);
						if (field2055 > -1) {
							if (var9.headiconPk != -1) {
								field578[var9.headiconPk].plotSprite(arg2 + field2055 - 12, field3001 + -30 + arg1);
								var8 += 25;
							}
							if (var9.headiconPrayer != -1) {
								field168[var9.headiconPrayer].plotSprite(arg2 + field2055 - 12, -var8 + field3001 + arg1);
								var8 += 25;
							}
						}
					}
					if (var4 >= 0 && field2911 == 10 && field3187[var4] == field1830) {
						method720(var5, var5.height + 15);
						if (field2055 > -1) {
							field3019[1].plotSprite(arg2 + field2055 - 12, -var8 + arg1 + field3001);
						}
					}
				}
				if (var5.field2721 != null && (var4 >= field1404 || field21 == 0 || field21 == 3 || field21 == 1 && method922(((ClientPlayer) var5).name))) {
					method720(var5, var5.height);
					if (field2055 > -1 && field1460 > field2848) {
						field1470[field2848] = b12.stringWid(var5.field2721) / 2;
						field1446[field2848] = b12.ascent;
						field1467[field2848] = field2055;
						field1472[field2848] = field3001;
						field1464[field2848] = var5.field2753;
						field1457[field2848] = var5.field2749;
						field1440[field2848] = var5.field2706;
						field1452[field2848] = var5.field2721;
						field2848++;
					}
				}
				if (loopCycle < var5.field2691) {
					method720(var5, var5.height + 15);
					if (field2055 > -1) {
						int var10 = var5.field2755 * 30 / var5.field2738;
						if (var10 > 30) {
							var10 = 30;
						}
						Pix2D.fillRect(arg2 + field2055 - 15, arg1 - -field3001 + -3, var10, 5, 65280);
						Pix2D.fillRect(var10 + field2055 + arg2 - 15, arg1 - -field3001 + -3, 30 - var10, 5, 16711680);
					}
				}
				for (int var11 = 0; var11 < 4; var11++) {
					if (loopCycle < var5.damageCycles[var11]) {
						method720(var5, var5.height / 2);
						if (field2055 > -1) {
							if (var11 == 1) {
								field3001 -= 20;
							}
							if (var11 == 2) {
								field2055 -= 15;
								field3001 -= 10;
							}
							if (var11 == 3) {
								field2055 += 15;
								field3001 -= 10;
							}
							field587[var5.field2746[var11]].plotSprite(field2055 + arg2 - 12, field3001 + (arg1 - 12));
							p11.centreString(JagString.parseInt(var5.field2758[var11]), arg2 + field2055 - 1, arg1 - -field3001 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var12 = 0; var12 < field2848; var12++) {
			int var13 = field1467[var12];
			int var14 = field1472[var12];
			int var15 = field1470[var12];
			int var16 = field1446[var12];
			boolean var17 = true;
			while (var17) {
				var17 = false;
				for (int var18 = 0; var18 < var12; var18++) {
					if (field1472[var18] - field1446[var18] < var14 + 2 && field1472[var18] + 2 > var14 + -var16 && var13 - var15 < field1470[var18] + field1467[var18] && var13 + var15 > -field1470[var18] + field1467[var18] && field1472[var18] - field1446[var18] < var14) {
						var14 = field1472[var18] - field1446[var18];
						var17 = true;
					}
				}
			}
			field2055 = field1467[var12];
			field3001 = field1472[var12] = var14;
			JagString var19 = field1452[var12];
			if (field1035 == 0) {
				int var20 = 16776960;
				if (field1464[var12] < 6) {
					var20 = ObjType.field1390[field1464[var12]];
				}
				if (field1464[var12] == 6) {
					var20 = field3658 % 20 < 10 ? 16711680 : 16776960;
				}
				if (field1464[var12] == 7) {
					var20 = field3658 % 20 >= 10 ? 65535 : 255;
				}
				if (field1464[var12] == 8) {
					var20 = field3658 % 20 < 10 ? 45056 : 8454016;
				}
				if (field1464[var12] == 9) {
					int var21 = 150 - field1440[var12];
					if (var21 < 50) {
						var20 = var21 * 1280 + 16711680;
					} else if (var21 < 100) {
						var20 = 16384000 + 16776960 - var21 * 327680;
					} else if (var21 < 150) {
						var20 = (var21 - 100) * 5 + 65280;
					}
				}
				if (field1464[var12] == 10) {
					int var22 = 150 - field1440[var12];
					if (var22 < 50) {
						var20 = var22 * 5 + 16711680;
					} else if (var22 < 100) {
						var20 = 16711935 - (var22 - 50) * 327680;
					} else if (var22 < 150) {
						var20 = var22 * 327680 + 255 + 500 - var22 * 5 - 32768000;
					}
				}
				if (field1464[var12] == 11) {
					int var23 = 150 - field1440[var12];
					if (var23 < 50) {
						var20 = 16777215 - var23 * 327685;
					} else if (var23 < 100) {
						var20 = (var23 - 50) * 327685 + 65280;
					} else if (var23 < 150) {
						var20 = 16777215 - (var23 - 100) * 327680;
					}
				}
				if (field1457[var12] == 0) {
					b12.centreString(var19, field2055 + arg2, field3001 + arg1, var20, 0);
				}
				if (field1457[var12] == 1) {
					b12.centreStringWave(var19, arg2 + field2055, field3001 + arg1, var20, field3658);
				}
				if (field1457[var12] == 2) {
					b12.centreStringWave2(var19, field2055 + arg2, field3001 + arg1, var20, field3658);
				}
				if (field1457[var12] == 3) {
					b12.centreStringWave3(var19, arg2 + field2055, arg1 + field3001, var20, field3658, 150 - field1440[var12]);
				}
				if (field1457[var12] == 4) {
					int var24 = (150 - field1440[var12]) * (b12.stringWid(var19) + 100) / 150;
					Pix2D.setSubClipping(field2055 + arg2 - 50, arg1, field2055 + arg2 + 50, arg1 + arg0);
					b12.drawString(var19, arg2 + field2055 + 50 - var24, arg1 - -field3001, var20, 0);
					Pix2D.setClipping(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
				if (field1457[var12] == 5) {
					int var25 = 150 - field1440[var12];
					Pix2D.setSubClipping(arg2, arg1 + field3001 - b12.ascent - 1, arg2 - -arg3, field3001 + arg1 + 5);
					int var26 = 0;
					if (var25 < 25) {
						var26 = var25 - 25;
					} else if (var25 > 125) {
						var26 = var25 - 125;
					}
					b12.centreString(var19, arg2 + field2055, arg1 + field3001 + var26, var20, 0);
					Pix2D.setClipping(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
			} else {
				b12.centreString(var19, field2055 + arg2, field3001 + arg1, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("na.e(I)V")
	public static void method723() {
		if (stream != null) {
			stream.close();
			stream = null;
		}
		clearCaches();
		world.resetMap();
		for (int var0 = 0; var0 < 4; var0++) {
			levelCollisionMap[var0].reset();
		}
		System.gc();
		MidiManager.method1176();
		playingJingle = false;
		field206 = -1;
		BgSound.reset();
		setMainState(10);
	}

	@ObfuscatedName("na.a(B)V")
	public static void getPlayerPos() {
		field1352 = 0;
		field2391 = 0;
		method1197();
		getPlayerPosOldVis();
		method45();
		getPlayerPosExtended();
		for (int var0 = 0; var0 < field2391; var0++) {
			int var1 = field495[var0];
			if (players[var1].field2713 != loopCycle) {
				players[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < field1404; var2++) {
			if (players[field3187[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + field1404);
			}
		}
	}

	@ObfuscatedName("na.d(I)V")
	public static void method722() {
		componentUpdated(field3629);
		field163++;
		if (field2622 && field500) {
			int var0 = ClientMouseListener.mouseX;
			int var1 = ClientMouseListener.mouseY;
			int var2 = var0 - field1068;
			if (var2 < field2606) {
				var2 = field2606;
			}
			int var3 = field3629.field760;
			int var4 = var1 - field2029;
			if (field2606 + field2807.field810 < field3629.field810 + var2) {
				var2 = field2807.field810 + field2606 - field3629.field810;
			}
			int var5 = var2 - field2930;
			if (field3180 > var4) {
				var4 = field3180;
			}
			int var6 = field2807.field843 + var2 - field2606;
			if (field2807.height + field3180 < field3629.height + var4) {
				var4 = field2807.height + field3180 - field3629.height;
			}
			int var7 = var4 - field1465;
			if (field163 > field3629.field746 && (var3 < var5 || -var3 > var5 || var3 < var7 || -var3 > var7)) {
				field1789 = true;
			}
			int var8 = field2807.scrollPosY + var4 - field3180;
			if (field3629.field852 != null && field1789) {
				HookReq var9 = new HookReq();
				var9.mouseX = var6;
				var9.onop = field3629.field852;
				var9.component = field3629;
				var9.mouseY = var8;
				ScriptRunner.executeScript(var9);
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (field1789) {
					if (field3629.field871 != null) {
						HookReq var10 = new HookReq();
						var10.mouseX = var6;
						var10.mouseY = var8;
						var10.component = field3629;
						var10.drop = field2886;
						var10.onop = field3629.field871;
						ScriptRunner.executeScript(var10);
					}
					if (field2886 != null && method111(field3629) != null) {
						out.p1Enc(178);
						out.method553(field2886.parentId);
						out.method548(field2886.subId);
						out.method526(field3629.parentId);
						out.method546(field3629.subId);
					}
				} else if ((field2898 == 1 || method237(field2849 - 1)) && field2849 > 2) {
					method1030();
				} else if (field2849 > 0) {
					method79(field2849 - 1);
				}
				field3629 = null;
			}
		} else if (field163 > 1) {
			field3629 = null;
		}
	}

	@ObfuscatedName("na.c(I)V")
	public static void method721() {
		for (LocChange var0 = (LocChange) field1076.head(); var0 != null; var0 = (LocChange) field1076.next()) {
			if (var0.endTime > 0) {
				var0.endTime--;
			}
			if (var0.endTime != 0) {
				if (var0.startTime > 0) {
					var0.startTime--;
				}
				if (var0.startTime == 0 && var0.field405 >= 1 && var0.field420 >= 1 && var0.field405 <= 102 && var0.field420 <= 102 && (var0.field414 < 0 || changeLocAvailable(var0.field414, var0.field404))) {
					method149(var0.field404, var0.field398, var0.field405, var0.field414, var0.field413, var0.field401, var0.field420);
					var0.startTime = -1;
					if (var0.field406 == var0.field414 && var0.field406 == -1) {
						var0.unlink();
					} else if (var0.field406 == var0.field414 && var0.field410 == var0.field413 && var0.field404 == var0.field408) {
						var0.unlink();
					}
				}
			} else if (var0.field406 < 0 || changeLocAvailable(var0.field406, var0.field408)) {
				method149(var0.field408, var0.field398, var0.field405, var0.field406, var0.field410, var0.field401, var0.field420);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("na.a(IJ)V")
	public static void method719(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field20 >= 100 && membersAccount != 1 || field20 >= 200) {
			addChat(Text.field1413, 0, field1786);
			return;
		}
		JagString var2 = JString.method59(arg0).method264();
		for (int var3 = 0; var3 < field20; var3++) {
			if (field694[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.field3076 }), 0, field1786);
				return;
			}
		}
		for (int var4 = 0; var4 < field2504; var4++) {
			if (field2407[var4] == arg0) {
				addChat(JagString.join(new JagString[] { Text.field97, var2, Text.field3486 }), 0, field1786);
				return;
			}
		}
		if (var2.strEquals(field373.name)) {
			addChat(Text.field96, 0, field1786);
			return;
		}
		field239[field20] = var2;
		field694[field20] = arg0;
		field2094[field20] = 0;
		field103[field20] = 0;
		field26 = field2767;
		field20++;
		out.p1Enc(28);
		out.p8(arg0);
	}

	@ObfuscatedName("na.a(Lec;B)V")
	public static void method725(JagString arg0) {
		if (field2609 == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.method259();
		if (var2 == 0L) {
			return;
		}
		while (var1 < field2609.length && field2609[var1].key != var2) {
			var1++;
		}
		if (field2609.length > var1 && field2609[var1] != null) {
			out.p1Enc(194);
			out.p8(field2609[var1].key);
		}
	}

	@ObfuscatedName("sf.a(IIIILh;Z)V")
	public static void minimapDrawArrow(int arg0, int arg1, int arg2, int arg3, Pix32 arg4) {
		int var5 = arg0 * arg0 + arg3 * arg3;
		if (var5 <= 4225 || var5 >= 90000) {
			minimapDrawDot(arg2, arg1, arg3, arg4, arg0);
			return;
		}
		int var6 = field3054 + field493 & 0x7FF;
		int var7 = Pix3D.cosTable[var6];
		int var8 = var7 * 256 / (field527 + 256);
		int var9 = Pix3D.sinTable[var6];
		int var10 = var9 * 256 / (field527 + 256);
		int var11 = arg0 * var8 + arg3 * var10 >> 16;
		int var12 = arg3 * var8 - arg0 * var10 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		mapedge.rotateTransPlotSprite(arg2 + var15 + 94 - 6, -20 + 83 + arg1 + -var16, var13);
	}

	@ObfuscatedName("a.a(III)V")
	public static void method2(int arg0, int arg1) {
		if (field72 != 0 && field72 != 3 || ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		int var2 = ClientMouseListener.mouseClickX - arg0 - 25;
		int var3 = ClientMouseListener.mouseClickY - arg1 - 5;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = field3054 + field493 & 0x7FF;
		int var5 = Pix3D.sinTable[var4];
		int var6 = (field527 + 256) * var5 >> 8;
		int var7 = Pix3D.cosTable[var4];
		int var8 = (field527 + 256) * var7 >> 8;
		int var9 = var3 * var8 - var2 * var6 >> 11;
		int var10 = var6 * var3 + var2 * var8 >> 11;
		int var11 = field373.z - var9 >> 7;
		int var12 = field373.x + var10 >> 7;
		boolean var13 = tryMove(true, 0, field373.routeZ[0], 0, 0, var12, field373.routeX[0], 0, var11, 0, 1);
		if (!var13) {
			return;
		}
		out.p1(var2);
		out.p1(var3);
		out.p2(field3054);
		out.p1(57);
		out.p1(field493);
		out.p1(field527);
		out.p1(89);
		out.p2(field373.x);
		out.p2(field373.z);
		out.p1(field1327);
		out.p1(63);
		return;
	}

	@ObfuscatedName("t.a(Lf;B)V")
	public static void componentUpdated(IfType arg0) {
		if (arg0.field840 == field563) {
			field3297[arg0.field823] = true;
		}
	}

	@ObfuscatedName("pc.a(B)V")
	public static void prepareMinimap() {
		field3034 = new int[33];
		field854 = new int[33];
		field27 = new int[151];
		field2273 = new int[151];
		for (int var0 = 0; var0 < 33; var0++) {
			int var1 = 999;
			int var2 = 0;
			for (int var3 = 0; var3 < 34; var3++) {
				if (field369.bspr[field369.wi * var0 + var3] == 0) {
					if (var1 == 999) {
						var1 = var3;
					}
				} else if (var1 != 999) {
					var2 = var3;
					break;
				}
			}
			field854[var0] = var1;
			field3034[var0] = var2 - var1;
		}
		for (int var4 = 5; var4 < 156; var4++) {
			int var5 = 999;
			int var6 = 0;
			for (int var7 = 25; var7 < 172; var7++) {
				if (field369.bspr[var7 + field369.wi * var4] == 0 && (var7 > 34 || var4 > 34)) {
					if (var5 == 999) {
						var5 = var7;
					}
				} else if (var5 != 999) {
					var6 = var7;
					break;
				}
			}
			field2273[var4 - 5] = var5 - 25;
			field27[var4 - 5] = var6 - var5;
		}
	}

	@ObfuscatedName("pc.c(II)V")
	public static void method863(int arg0) {
		for (ServerActive var1 = (ServerActive) field2768.search(); var1 != null; var1 = (ServerActive) field2768.findnext()) {
			if ((long) arg0 == (var1.key >> 48 & 0xFFFFL)) {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("oe.b(I)V")
	public static void clearCaches() {
		FloType.resetCache();
		FluType.resetCache();
		IdkType.method363();
		LocType.method357();
		NPCType.method630();
		ObjType.method487();
		SeqType.method899();
		SpotType.method821();
		VarBitType.method128();
		VarpType.method410();
		PlayerModel.resetCache();
		IfType.method48();
		((WorldTextureProvider) Pix3D.field126).reset();
		ClientScript.cache.clear();
		anims.discardAllFiles();
		bases.discardAllFiles();
		interfaces.discardAllFiles();
		jagFX.discardAllFiles();
		maps.discardAllFiles();
		songs.discardAllFiles();
		models.discardAllFiles();
		sprites.discardAllFiles();
		textures.discardAllFiles();
		binary.discardAllFiles();
		jingles.discardAllFiles();
		scripts.discardAllFiles();
	}

	@ObfuscatedName("pf.e(I)V")
	public static void method871() {
		out.p1Enc(113);
		for (SubInterface var0 = (SubInterface) field2571.search(); var0 != null; var0 = (SubInterface) field2571.findnext()) {
			if (var0.field3291 == 0 || var0.field3291 == 3) {
				closeSubInterface(true, var0);
			}
		}
		if (field1158 != null) {
			componentUpdated(field1158);
			field1158 = null;
		}
	}

	@ObfuscatedName("pf.b(Z)V")
	public static void method872() {
		overrideChat = 0;
		int var0 = (field373.x >> 7) + field1700;
		int var1 = (field373.z >> 7) + field2836;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			overrideChat = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			overrideChat = 1;
		}
		if (overrideChat == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			overrideChat = 0;
		}
	}

	@ObfuscatedName("aa.a(BI)V")
	public static void method7(int arg0) {
		int[] var1 = minimap.data;
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 0;
		}
		for (int var4 = 1; var4 < 103; var4++) {
			int var5 = (52736 - var4 * 512) * 4 + 24628;
			for (int var6 = 1; var6 < 103; var6++) {
				if ((ClientBuild.mapl[arg0][var6][var4] & 0x18) == 0) {
					world.method1149(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var6][var4] & 0x8) != 0) {
					world.method1149(var1, var5, arg0 + 1, var6, var4);
				}
				var5 += 4;
			}
		}
		minimap.setPixels();
		int var7 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 228;
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var10 = 1; var10 < 103; var10++) {
				if ((ClientBuild.mapl[arg0][var10][var9] & 0x18) == 0) {
					method211(var7, arg0, var10, var9, var8);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var10][var9] & 0x8) != 0) {
					method211(var7, arg0 + 1, var10, var9, var8);
				}
			}
		}
		field1908 = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = world.method1134(minusedlevel, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = LocType.list(var14).field1209;
					if (var15 >= 0) {
						int var16 = var11;
						int var17 = var12;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = levelCollisionMap[minusedlevel].flags;
							for (int var19 = 0; var19 < 10; var19++) {
								int var20 = (int) (Math.random() * 4.0D);
								if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
									var16--;
								}
								if (var20 == 1 && var16 < 103 && var11 + 3 > var16 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
									var16++;
								}
								if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
									var17--;
								}
								if (var20 == 3 && var17 < 103 && var12 + 3 > var17 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
									var17++;
								}
							}
						}
						field3624[field1908] = mapfunction[var15];
						field2850[field1908] = var16;
						field1957[field1908] = var17;
						field1908++;
					}
				}
			}
		}
		drawArea.bind();
	}

	@ObfuscatedName("ad.a(I)I")
	public static int roofCheck() {
		int var0 = 3;
		if (field1049 < 310) {
			int var1 = field2494 >> 7;
			int var2 = field1126 >> 7;
			if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
				var0 = minusedlevel;
			}
			int var3 = field373.x >> 7;
			int var4 = field373.z >> 7;
			int var5;
			if (var1 < var3) {
				var5 = var3 - var1;
			} else {
				var5 = var1 - var3;
			}
			int var6;
			if (var2 < var4) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}
			if (var5 > var6) {
				int var7 = var6 * 65536 / var5;
				int var8 = 32768;
				while (var1 != var3) {
					if (var3 > var1) {
						var1++;
					} else if (var3 < var1) {
						var1--;
					}
					if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					var8 += var7;
					if (var8 >= 65536) {
						if (var4 > var2) {
							var2++;
						} else if (var4 < var2) {
							var2--;
						}
						if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
							var0 = minusedlevel;
						}
						var8 -= 65536;
					}
				}
			} else {
				int var9 = var5 * 65536 / var6;
				int var10 = 32768;
				while (var4 != var2) {
					if (var4 > var2) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}
					var10 += var9;
					if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					if (var10 >= 65536) {
						if (var1 < var3) {
							var1++;
						} else if (var1 > var3) {
							var1--;
						}
						var10 -= 65536;
						if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
							var0 = minusedlevel;
						}
					}
				}
			}
		}
		if ((ClientBuild.mapl[minusedlevel][field373.x >> 7][field373.z >> 7] & 0x4) != 0) {
			var0 = minusedlevel;
		}
		return var0;
	}

	@ObfuscatedName("wa.a(IIB)V")
	public static void runHookImmediate(int arg0, int arg1) {
		if (IfType.method192(arg0)) {
			method428(IfType.field1825[arg0], arg1);
		}
	}

	@ObfuscatedName("wd.a(III)V")
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
			int var7 = var6.field1375;
			if (var6.field1409 == 1) {
				var7 *= var5.count + 1;
			}
			if (var7 > var3) {
				var4 = var5;
				var3 = var7;
			}
		}
		if (var4 == null) {
			world.delObj(minusedlevel, arg1, arg0);
			return;
		}
		var2.pushFront(var4);
		ClientObj var8 = null;
		ClientObj var9 = (ClientObj) var2.head();
		ClientObj var10 = null;
		while (var9 != null) {
			if (var4.id != var9.id) {
				if (var8 == null) {
					var8 = var9;
				}
				if (var9.id != var8.id && var10 == null) {
					var10 = var9;
				}
			}
			var9 = (ClientObj) var2.next();
		}
		int var11 = arg1 + (arg0 << 7) + 1610612736;
		world.method1165(minusedlevel, arg1, arg0, getAvH(minusedlevel, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var8, var10);
	}

	@ObfuscatedName("wd.a(Z)V")
	public static void method1213() {
		int var0 = field1922 * 128 + 64;
		int var1 = field2528 * 128 + 64;
		int var2 = getAvH(minusedlevel, var0, var1) - field3253;
		if (field2494 < var0) {
			field2494 += field1836 + field2058 * (var0 - field2494) / 1000;
			if (var0 < field2494) {
				field2494 = var0;
			}
		}
		if (var2 > field1719) {
			field1719 += (var2 - field1719) * field2058 / 1000 + field1836;
			if (field1719 > var2) {
				field1719 = var2;
			}
		}
		if (var2 < field1719) {
			field1719 -= (field1719 - var2) * field2058 / 1000 + field1836;
			if (var2 > field1719) {
				field1719 = var2;
			}
		}
		if (field1126 < var1) {
			field1126 += field1836 + (var1 - field1126) * field2058 / 1000;
			if (var1 < field1126) {
				field1126 = var1;
			}
		}
		if (var0 < field2494) {
			field2494 -= field1836 + (field2494 - var0) * field2058 / 1000;
			if (field2494 < var0) {
				field2494 = var0;
			}
		}
		int var3 = field2021 * 128 + 64;
		if (field1126 > var1) {
			field1126 -= field2058 * (field1126 - var1) / 1000 + field1836;
			if (var1 > field1126) {
				field1126 = var1;
			}
		}
		int var4 = field896 * 128 + 64;
		int var5 = getAvH(minusedlevel, var3, var4) - VarpType.field1359;
		int var6 = var4 - field1126;
		int var7 = var3 - field2494;
		int var8 = var5 - field1719;
		int var9 = (int) Math.sqrt((double) (var7 * var7 + var6 * var6));
		int var10 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var7, (double) var6) * -325.949D) & 0x7FF;
		int var12 = var11 - field2718;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var10 < 128) {
			var10 = 128;
		}
		if (var10 > 383) {
			var10 = 383;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (field1049 < var10) {
			field1049 += field2174 + field1824 * (var10 - field1049) / 1000;
			if (field1049 > var10) {
				field1049 = var10;
			}
		}
		if (var12 > 0) {
			field2718 += field1824 * var12 / 1000 + field2174;
			field2718 &= 0x7FF;
		}
		if (var12 < 0) {
			field2718 -= field2174 + -var12 * field1824 / 1000;
			field2718 &= 0x7FF;
		}
		if (var10 < field1049) {
			field1049 -= field1824 * (field1049 - var10) / 1000 + field2174;
			if (field1049 < var10) {
				field1049 = var10;
			}
		}
		int var13 = var11 - field2718;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			field2718 = var11;
		}
	}

	@ObfuscatedName("wd.a(BLf;I)I")
	public static int getIfVar(IfType arg0, int arg1) {
		if (arg0.field842 == null || arg1 >= arg0.field842.length) {
			return -2;
		}
		try {
			int[] var2 = arg0.field842[arg1];
			byte var3 = 0;
			int var4 = 0;
			int var5 = 0;
			while (true) {
				int var6 = var2[var5++];
				int var7 = 0;
				byte var8 = 0;
				if (var6 == 0) {
					return var4;
				}
				if (var6 == 1) {
					var7 = field3173[var2[var5++]];
				}
				if (var6 == 15) {
					var8 = 1;
				}
				if (var6 == 2) {
					var7 = field1159[var2[var5++]];
				}
				if (var6 == 3) {
					var7 = field343[var2[var5++]];
				}
				if (var6 == 16) {
					var8 = 2;
				}
				if (var6 == 17) {
					var8 = 3;
				}
				if (var6 == 4) {
					int var9 = var2[var5++] << 16;
					int var10 = var9 + var2[var5++];
					IfType var11 = IfType.get(var10);
					int var12 = var2[var5++];
					if (var12 != -1 && (!ObjType.list(var12).field1392 || memServer)) {
						for (int var13 = 0; var13 < var11.field834.length; var13++) {
							if (var11.field834[var13] == var12 + 1) {
								var7 += var11.field753[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var7 = VarCache.field504[var2[var5++]];
				}
				if (var6 == 6) {
					var7 = Skills.field3142[field1159[var2[var5++]] - 1];
				}
				if (var6 == 7) {
					var7 = VarCache.field504[var2[var5++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var7 = field373.combatLevel;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Skills.field1069[var14]) {
							var7 += field1159[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var5++] << 16;
					int var16 = var15 + var2[var5++];
					IfType var17 = IfType.get(var16);
					int var18 = var2[var5++];
					if (var18 != -1 && (!ObjType.list(var18).field1392 || memServer)) {
						for (int var19 = 0; var19 < var17.field834.length; var19++) {
							if (var18 + 1 == var17.field834[var19]) {
								var7 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var7 = field3153;
				}
				if (var6 == 12) {
					var7 = field49;
				}
				if (var6 == 13) {
					int var20 = VarCache.field504[var2[var5++]];
					int var21 = var2[var5++];
					var7 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 14) {
					int var22 = var2[var5++];
					var7 = VarCache.getVarbit(var22);
				}
				if (var6 == 18) {
					var7 = field1700 + (field373.x >> 7);
				}
				if (var6 == 19) {
					var7 = field2836 + (field373.z >> 7);
				}
				if (var6 == 20) {
					var7 = var2[var5++];
				}
				if (var8 == 0) {
					if (var3 == 0) {
						var4 += var7;
					}
					if (var3 == 1) {
						var4 -= var7;
					}
					if (var3 == 2 && var7 != 0) {
						var4 /= var7;
					}
					if (var3 == 3) {
						var4 *= var7;
					}
					var3 = 0;
				} else {
					var3 = var8;
				}
			}
		} catch (Exception var23) {
			return -1;
		}
	}

	@ObfuscatedName("ue.a(IIIIIIIIII)V")
	public static void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) field1076.head(); var10 != null; var10 = (LocChange) field1076.next()) {
			if (var10.field401 == arg5 && arg2 == var10.field405 && arg0 == var10.field420 && var10.field398 == arg3) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new LocChange();
			var9.field420 = arg0;
			var9.field398 = arg3;
			var9.field401 = arg5;
			var9.field405 = arg2;
			method20(var9);
			field1076.push(var9);
		}
		var9.field413 = arg4;
		var9.field414 = arg8;
		var9.endTime = arg6;
		var9.startTime = arg1;
		var9.field404 = arg7;
	}

	@ObfuscatedName("ue.a(BLqd;)V")
	public static void entityAnim(ClientEntity arg0) {
		arg0.field2735 = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var1 = SeqType.list(arg0.secondarySeqId);
			if (var1 == null || var1.frames == null) {
				arg0.secondarySeqId = -1;
			} else {
				arg0.field2757++;
				if (var1.frames.length > arg0.field2728 && arg0.field2757 > var1.delay[arg0.field2728]) {
					arg0.field2728++;
					arg0.field2757 = 1;
					method585(arg0.z, arg0.x, arg0.field2728, var1);
				}
				if (var1.frames.length <= arg0.field2728) {
					arg0.field2757 = 0;
					arg0.field2728 = 0;
					method585(arg0.z, arg0.x, arg0.field2728, var1);
				}
			}
		}
		if (arg0.spotanimId != -1 && loopCycle >= arg0.field2704) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}
			int var2 = SpotType.list(arg0.spotanimId).anim;
			if (var2 == -1) {
				arg0.spotanimId = -1;
			} else {
				SeqType var3 = SeqType.list(var2);
				if (var3 == null || var3.frames == null) {
					arg0.spotanimId = -1;
				} else {
					arg0.field2701++;
					if (var3.frames.length > arg0.spotanimFrame && arg0.field2701 > var3.delay[arg0.spotanimFrame]) {
						arg0.spotanimFrame++;
						arg0.field2701 = 1;
						method585(arg0.z, arg0.x, arg0.spotanimFrame, var3);
					}
					if (arg0.spotanimFrame >= var3.frames.length && (arg0.spotanimFrame < 0 || var3.frames.length <= arg0.spotanimFrame)) {
						arg0.spotanimId = -1;
					}
				}
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var4 = SeqType.list(arg0.primarySeqId);
			if (var4.field3382 == 1 && arg0.preanimRouteLength > 0 && loopCycle >= arg0.field2730 && loopCycle > arg0.field2724) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var5 = SeqType.list(arg0.primarySeqId);
			if (var5 == null || var5.frames == null) {
				arg0.primarySeqId = -1;
			} else {
				arg0.field2737++;
				if (var5.frames.length > arg0.field2725 && var5.delay[arg0.field2725] < arg0.field2737) {
					arg0.field2725++;
					arg0.field2737 = 1;
					method585(arg0.z, arg0.x, arg0.field2725, var5);
				}
				if (arg0.field2725 >= var5.frames.length) {
					arg0.field2714++;
					arg0.field2725 -= var5.loops;
					if (var5.field3389 <= arg0.field2714) {
						arg0.primarySeqId = -1;
					} else if (arg0.field2725 >= 0 && var5.frames.length > arg0.field2725) {
						method585(arg0.z, arg0.x, arg0.field2725, var5);
					} else {
						arg0.primarySeqId = -1;
					}
				}
				arg0.field2735 = var5.field3371;
			}
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("de.a(IJ)V")
	public static void method189(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field2504; var2++) {
			if (arg0 == field2407[var2]) {
				field2504--;
				for (int var3 = var2; var3 < field2504; var3++) {
					field2407[var3] = field2407[var3 + 1];
					field1685[var3] = field1685[var3 + 1];
				}
				field26 = field2767;
				out.p1Enc(239);
				out.p8(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("de.a(III)Lec;")
	public static JagString method187(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return field2418;
		} else if (var2 < -6) {
			return field3144;
		} else if (var2 < -3) {
			return field1070;
		} else if (var2 < 0) {
			return field402;
		} else if (var2 > 9) {
			return field3128;
		} else if (var2 > 6) {
			return field1306;
		} else if (var2 > 3) {
			return field87;
		} else if (var2 > 0) {
			return field1493;
		} else {
			return field3182;
		}
	}

	@ObfuscatedName("uc.a(IZI)V")
	public static void method1071(int arg0, int arg1) {
		out.p1Enc(172);
		out.method526(arg1);
		out.method548(arg0);
	}

	@ObfuscatedName("uc.d(I)V")
	public static void method1072() {
		int var0 = field2864;
		int var1 = field1071;
		int var2 = field2585;
		int var3 = field863;
		Pix2D.fillRect(var3, var0, var1, var2, 6116423);
		Pix2D.fillRect(var3 + 1, var0 + 1, var1 - 2, 16, 0);
		Pix2D.drawRect(var3 + 1, var0 - -18, var1 - 2, var2 - 19, 0);
		b12.drawString(Text.field94, var3 + 3, var0 + 14, 6116423, -1);
		int var4 = ClientMouseListener.mouseY;
		int var5 = ClientMouseListener.mouseX;
		for (int var6 = 0; var6 < field2849; var6++) {
			int var7 = 16777215;
			int var8 = (field2849 - var6 - 1) * 15 + var0 + 31;
			if (var3 < var5 && var3 + var1 > var5 && var4 > var8 - 13 && var4 < var8 + 3) {
				var7 = 16776960;
			}
			b12.drawString(method878(var6), var3 + 3, var8, var7, 0);
		}
		method265(field1071, field2864, field863, field2585);
	}

	@ObfuscatedName("uc.b(Z)V")
	public static void method1075() {
		while (true) {
			if (in.method354(psize) >= 27) {
				int var0 = in.method352(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (npcs[var0] == null) {
						var1 = true;
						npcs[var0] = new ClientNpc();
					}
					ClientNpc var2 = npcs[var0];
					field313[field2397++] = var0;
					var2.field2713 = loopCycle;
					int var3 = field614[in.method352(3)];
					if (var1) {
						var2.dstYaw = var2.field2745 = var3;
					}
					int var4 = in.method352(5);
					int var5 = in.method352(1);
					if (var4 > 15) {
						var4 -= 32;
					}
					if (var5 == 1) {
						field1418[field1352++] = var0;
					}
					var2.type = NPCType.list(in.method352(14));
					int var6 = in.method352(1);
					int var7 = in.method352(5);
					var2.field2693 = var2.type.field2218;
					var2.walkanim_l = var2.type.field2219;
					var2.size = var2.type.size;
					var2.walkanim_r = var2.type.field2211;
					var2.turnrightanim = var2.type.field2185;
					if (var2.field2693 == 0) {
						var2.field2745 = 0;
					}
					var2.turnleftanim = var2.type.field2209;
					var2.walkanim_b = var2.type.field2201;
					var2.walkanim = var2.type.field2202;
					var2.readyanim = var2.type.field2195;
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.teleport(var7 + field373.routeZ[0], var6 == 1, var4 + field373.routeX[0]);
					continue;
				}
			}
			in.method355();
			return;
		}
	}

	@ObfuscatedName("uc.a(B)V")
	public static void addProjectiles() {
		for (ClientProj var0 = (ClientProj) field2038.head(); var0 != null; var0 = (ClientProj) field2038.next()) {
			if (var0.field2935 != minusedlevel || var0.t2 < loopCycle) {
				var0.unlink();
			} else if (loopCycle >= var0.field2963) {
				if (var0.field2960 > 0) {
					ClientNpc var1 = npcs[var0.field2960 - 1];
					if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.z >= 0 && var1.z < 13312) {
						var0.setTarget(var1.z, var1.x, loopCycle, getAvH(var0.field2935, var1.x, var1.z) - var0.field2932);
					}
				}
				if (var0.field2960 < 0) {
					int var2 = -var0.field2960 - 1;
					ClientPlayer var3;
					if (selfSlot == var2) {
						var3 = field373;
					} else {
						var3 = players[var2];
					}
					if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
						var0.setTarget(var3.z, var3.x, loopCycle, getAvH(var0.field2935, var3.x, var3.z) - var0.field2932);
					}
				}
				var0.move(worldUpdateNum);
				world.addDynamic(minusedlevel, (int) var0.x, (int) var0.z, (int) var0.y, 60, var0, var0.yaw, -1, false);
			}
		}
	}

	@ObfuscatedName("mf.a(ILqd;)V")
	public static void exactMove1(ClientEntity arg0) {
		arg0.animDelayMove = 0;
		if (arg0.field2751 == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.field2751 == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.field2751 == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.field2751 == 3) {
			arg0.dstYaw = 512;
		}
		int var1 = arg0.field2730 - loopCycle;
		int var2 = arg0.field2710 * 128 + arg0.size * 64;
		int var3 = arg0.field2717 * 128 + arg0.size * 64;
		arg0.z += (var3 - arg0.z) / var1;
		arg0.x += (var2 - arg0.x) / var1;
	}

	@ObfuscatedName("c.a(Lqd;B)V")
	public static void exactMove2(ClientEntity arg0) {
		if (arg0.field2724 == loopCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.field2737 + 1 > SeqType.list(arg0.primarySeqId).delay[arg0.field2725]) {
			int var1 = arg0.field2724 - arg0.field2730;
			int var2 = loopCycle - arg0.field2730;
			int var3 = arg0.size * 64 + arg0.field2717 * 128;
			int var4 = arg0.size * 64 + arg0.field2710 * 128;
			int var5 = arg0.size * 64 + arg0.field2690 * 128;
			arg0.x = ((var1 - var2) * var4 + var5 * var2) / var1;
			int var6 = arg0.field2740 * 128 + arg0.size * 64;
			arg0.z = (var6 * var2 + var3 * (var1 - var2)) / var1;
		}
		if (arg0.field2751 == 0) {
			arg0.dstYaw = 1024;
		}
		arg0.animDelayMove = 0;
		if (arg0.field2751 == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.field2751 == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.field2751 == 3) {
			arg0.dstYaw = 512;
		}
		arg0.field2745 = arg0.dstYaw;
	}

	@ObfuscatedName("uf.a(Lqd;I)V")
	public static void routeMove(ClientEntity arg0) {
		arg0.secondarySeqId = arg0.readyanim;
		if (arg0.routeLength == 0) {
			arg0.animDelayMove = 0;
			return;
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var1 = SeqType.list(arg0.primarySeqId);
			if (arg0.preanimRouteLength > 0 && var1.field3382 == 0) {
				arg0.animDelayMove++;
				return;
			}
			if (arg0.preanimRouteLength <= 0 && var1.postanim_move == 0) {
				arg0.animDelayMove++;
				return;
			}
		}
		int var2 = arg0.x;
		int var3 = arg0.z;
		int var4 = arg0.size * 64 + arg0.routeZ[arg0.routeLength - 1] * 128;
		int var5 = arg0.size * 64 + arg0.routeX[arg0.routeLength - 1] * 128;
		if (var5 - var2 > 256 || var5 - var2 < -256 || var4 - var3 > 256 || var4 - var3 < -256) {
			arg0.x = var5;
			arg0.z = var4;
			return;
		}
		if (var5 <= var2) {
			if (var5 >= var2) {
				if (var4 > var3) {
					arg0.dstYaw = 1024;
				} else if (var4 < var3) {
					arg0.dstYaw = 0;
				}
			} else if (var4 > var3) {
				arg0.dstYaw = 768;
			} else if (var4 < var3) {
				arg0.dstYaw = 256;
			} else {
				arg0.dstYaw = 512;
			}
		} else if (var3 < var4) {
			arg0.dstYaw = 1280;
		} else if (var3 <= var4) {
			arg0.dstYaw = 1536;
		} else {
			arg0.dstYaw = 1792;
		}
		int var6 = 4;
		boolean var7 = true;
		int var8 = arg0.dstYaw - arg0.field2745 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.walkanim_b;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.walkanim;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.walkanim_r;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.walkanim_l;
		}
		if (var9 == -1) {
			var9 = arg0.walkanim;
		}
		arg0.secondarySeqId = var9;
		if (arg0 instanceof ClientNpc) {
			var7 = ((ClientNpc) arg0).type.field2241;
		}
		if (var7) {
			if (arg0.field2745 != arg0.dstYaw && arg0.targetId == -1 && arg0.field2693 != 0) {
				var6 = 2;
			}
			if (arg0.routeLength > 2) {
				var6 = 6;
			}
			if (arg0.routeLength > 3) {
				var6 = 8;
			}
			if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
				var6 = 8;
				arg0.animDelayMove--;
			}
		} else {
			if (arg0.routeLength > 1) {
				var6 = 6;
			}
			if (arg0.routeLength > 2) {
				var6 = 8;
			}
			if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
				var6 = 8;
				arg0.animDelayMove--;
			}
		}
		if (arg0.routeRun[arg0.routeLength - 1]) {
			var6 <<= 0x1;
		}
		if (var2 < var5) {
			arg0.x += var6;
			if (arg0.x > var5) {
				arg0.x = var5;
			}
		} else if (var2 > var5) {
			arg0.x -= var6;
			if (arg0.x < var5) {
				arg0.x = var5;
			}
		}
		if (var6 >= 8 && arg0.walkanim == arg0.secondarySeqId && arg0.runanim != -1) {
			arg0.secondarySeqId = arg0.runanim;
		}
		if (var4 > var3) {
			arg0.z += var6;
			if (var4 < arg0.z) {
				arg0.z = var4;
			}
		} else if (var4 < var3) {
			arg0.z -= var6;
			if (var4 > arg0.z) {
				arg0.z = var4;
			}
		}
		if (arg0.x == var5 && arg0.z == var4) {
			if (arg0.preanimRouteLength > 0) {
				arg0.preanimRouteLength--;
			}
			arg0.routeLength--;
		}
	}

	@ObfuscatedName("eb.a(BILqd;)V")
	public static void method227(int arg0, ClientEntity arg1) {
		if (arg1.field2730 > loopCycle) {
			exactMove1(arg1);
		} else if (arg1.field2724 >= loopCycle) {
			exactMove2(arg1);
		} else {
			routeMove(arg1);
		}
		if (arg1.x < 128 || arg1.z < 128 || arg1.x >= 13184 || arg1.z >= 13184) {
			arg1.x = arg1.routeX[0] * 128 + arg1.size * 64;
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.primarySeqId = -1;
			arg1.field2724 = 0;
			arg1.spotanimId = -1;
			arg1.field2730 = 0;
			arg1.abortRoute();
		}
		if (arg1 == field373 && (arg1.x < 1536 || arg1.z < 1536 || arg1.x >= 11776 || arg1.z >= 11776)) {
			arg1.field2724 = 0;
			arg1.x = arg1.routeX[0] * 128 + arg1.size * 64;
			arg1.spotanimId = -1;
			arg1.field2730 = 0;
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.primarySeqId = -1;
			arg1.abortRoute();
		}
		method444(arg1);
		entityAnim(arg1);
	}

	@ObfuscatedName("kf.a(IIIBI)V")
	public static void method602(int arg0, int arg1, int arg2, int arg3) {
		Pix2D.setClipping(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Pix3D.setRenderClipping();
		field3658++;
		method103(true);
		method468(true);
		method103(false);
		method468(false);
		addProjectiles();
		method827();
		if (!field418) {
			int var4 = field3082;
			int var5 = field3054 + field173 & 0x7FF;
			if (var4 < field469 / 256) {
				var4 = field469 / 256;
			}
			if (field699[4] && var4 < field2883[4] + 128) {
				var4 = field2883[4] + 128;
			}
			camFollow(var5, getAvH(minusedlevel, field373.x, field373.z) - 50, var4 * 3 + 600, field1319, var4, field2536);
		}
		int var6;
		if (field418) {
			var6 = method392();
		} else {
			var6 = roofCheck();
		}
		int var7 = field2494;
		int var8 = field1126;
		int var9 = field1049;
		int var10 = field1719;
		int var11 = field2718;
		for (int var12 = 0; var12 < 5; var12++) {
			if (field699[var12]) {
				int var13 = (int) ((double) -PcmPlayer.field2653[var12] + (double) (PcmPlayer.field2653[var12] * 2 + 1) * Math.random() + Math.sin((double) field351[var12] * ((double) field3294[var12] / 100.0D)) * (double) field2883[var12]);
				if (var12 == 4) {
					field1049 += var13;
					if (field1049 < 128) {
						field1049 = 128;
					}
					if (field1049 > 383) {
						field1049 = 383;
					}
				}
				if (var12 == 3) {
					field2718 = field2718 + var13 & 0x7FF;
				}
				if (var12 == 1) {
					field1719 += var13;
				}
				if (var12 == 2) {
					field1126 += var13;
				}
				if (var12 == 0) {
					field2494 += var13;
				}
			}
		}
		int var14 = ClientMouseListener.mouseX;
		int var15 = ClientMouseListener.mouseY;
		if (var14 >= arg1 && arg0 + arg1 > var14 && var15 >= arg3 && arg3 + arg2 > var15) {
			ModelLit.field2382 = 0;
			ModelLit.field2362 = ClientMouseListener.mouseX - arg1;
			ModelLit.field2363 = ClientMouseListener.mouseY - arg3;
			ModelLit.field2373 = true;
		} else {
			ModelLit.field2373 = false;
			ModelLit.field2382 = 0;
		}
		doAudio();
		Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
		doAudio();
		world.method1167(field2494, field1719, field1126, field1049, field2718, var6);
		doAudio();
		world.method1135();
		method439(arg2, arg3, arg1, arg0);
		coordArrow(arg1, arg3);
		((WorldTextureProvider) Pix3D.field126).runAnims(worldUpdateNum);
		method129(arg3, arg2, arg1, arg0);
		field2494 = var7;
		field1126 = var8;
		field1719 = var10;
		field1049 = var9;
		field2718 = var11;
		if (field2032 && Js5Net.urgentQueueSize() == 0) {
			field2032 = false;
		}
		if (field2032) {
			Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
			messageBox(Text.LOADING, false);
		}
		if (!field2032 && !field476 && var14 >= arg1 && var14 < arg0 + arg1 && arg3 <= var15 && arg3 + arg2 > var15) {
			method663(var14, arg3, arg1, var15);
		}
	}

	@ObfuscatedName("ma.a(IIIIIIIII)V")
	public static void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.method192(arg2)) {
			field2253 = null;
			method979(arg5, arg3, IfType.field1825[arg2], -1, arg1, arg7, arg4, arg0, arg6);
			if (field2253 != null) {
				method979(arg5, arg3, field2253, 0xabcdabcd, field1603, field1968, arg4, arg0, arg6);
				field2253 = null;
			}
		} else if (arg4 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				field3297[var8] = true;
			}
		} else {
			field3297[arg4] = true;
		}
	}

	@ObfuscatedName("ma.a(Lf;I)Z")
	public static boolean method657(IfType arg0) {
		if (arg0.field778 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field778.length; var1++) {
			int var2 = getIfVar(arg0, var1);
			int var3 = arg0.field785[var1];
			if (arg0.field778[var1] == 2) {
				if (var2 >= var3) {
					return false;
				}
			} else if (arg0.field778[var1] == 3) {
				if (var3 >= var2) {
					return false;
				}
			} else if (arg0.field778[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var3 != var2) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("mb.a(I)Z")
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
				stream.read(0, in.data, 1);
				in.pos = 0;
				ptype = in.g1Enc();
				psize = SERVERPROT_SIZES[ptype];
				var0--;
			}
			if (psize == -1) {
				if (var0 <= 0) {
					return false;
				}
				var0--;
				stream.read(0, in.data, 1);
				psize = in.data[0] & 0xFF;
			}
			if (psize == -2) {
				if (var0 <= 1) {
					return false;
				}
				var0 -= 2;
				stream.read(0, in.data, 2);
				in.pos = 0;
				psize = in.g2();
			}
			if (var0 < psize) {
				return false;
			}
			in.pos = 0;
			stream.read(0, in.data, psize);
			field703 = 0;
			field710 = field3616;
			field3616 = field201;
			field201 = ptype;
			if (ptype == 27) {
				int var1 = in.method518();
				field220 = var1;
				ifAnimReset(var1);
				ScriptRunner.executeOnLoad(field220);
				for (int var2 = 0; var2 < 100; var2++) {
					field3297[var2] = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 106) {
				// UPDATE_INV_FULL
				int var3 = in.g4();
				int var4 = in.g2();
				IfType var5;
				if (var3 >= 0) {
					var5 = IfType.get(var3);
				} else {
					var5 = null;
				}
				if (var3 < -70000) {
					var4 += 32768;
				}
				if (var5 != null) {
					for (int var6 = 0; var6 < var5.field834.length; var6++) {
						var5.field834[var6] = 0;
						var5.field753[var6] = 0;
					}
				}
				ClientInvCache.clear(var4);
				int var7 = in.g2();
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = in.method529();
					if (var9 == 255) {
						var9 = in.method509();
					}
					int var10 = in.method524();
					if (var5 != null && var5.field834.length > var8) {
						var5.field834[var8] = var10;
						var5.field753[var8] = var9;
					}
					ClientInvCache.set(var4, var8, var9, var10 - 1);
				}
				if (var5 != null) {
					componentUpdated(var5);
				}
				legacyUpdated();
				invTransmit[invTransmitNum++ & 0x1F] = var4 & 0x7FFF;
				ptype = -1;
				return true;
			}
			if (ptype == 42) {
				field2504 = psize / 8;
				for (int var11 = 0; var11 < field2504; var11++) {
					field2407[var11] = in.g8();
					field1685[var11] = JString.method59(field2407[var11]);
				}
				ptype = -1;
				field26 = field2767;
				return true;
			}
			if (ptype == 210) {
				int var12 = in.method509();
				int var13 = in.method524();
				IfType var14 = IfType.get(var12);
				if (var14.field770 != 2 || var14.field849 != var13) {
					var14.field770 = 2;
					var14.field849 = var13;
					componentUpdated(var14);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 92) {
				int var15 = in.g2();
				if (var15 == 65535) {
					var15 = -1;
				}
				int var16 = in.g4();
				int var17 = in.method525();
				IfType var18 = IfType.get(var16);
				if (var18.field848) {
					var18.field786 = var17;
					var18.field804 = var15;
					ObjType var20 = ObjType.list(var15);
					var18.field874 = var20.field1416;
					var18.field808 = var20.field1391;
					var18.field816 = var20.field1384;
					var18.field750 = var20.field1374;
					var18.field812 = var20.field1426;
					if (var18.field810 > 0) {
						var18.field808 = var18.field808 * 32 / var18.field810;
					}
					var18.field851 = var20.field1376;
					componentUpdated(var18);
				} else if (var15 == -1) {
					ptype = -1;
					var18.field770 = 0;
					return true;
				} else {
					ObjType var19 = ObjType.list(var15);
					var18.field808 = var19.field1391 * 100 / var17;
					var18.field874 = var19.field1416;
					var18.field770 = 4;
					var18.field812 = var19.field1426;
					var18.field849 = var15;
					componentUpdated(var18);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 175) {
				for (int var21 = 0; var21 < players.length; var21++) {
					if (players[var21] != null) {
						players[var21].primarySeqId = -1;
					}
				}
				for (int var22 = 0; var22 < npcs.length; var22++) {
					if (npcs[var22] != null) {
						npcs[var22].primarySeqId = -1;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 89) {
				JagString var23 = in.gjstr();
				Object[] var24 = new Object[var23.length() + 1];
				for (int var25 = var23.length() - 1; var25 >= 0; var25--) {
					if (var23.charAt(var25) == 115) {
						var24[var25 + 1] = in.gjstr();
					} else {
						var24[var25 + 1] = Integer.valueOf(in.g4());
					}
				}
				var24[0] = Integer.valueOf(in.g4());
				HookReq var26 = new HookReq();
				var26.onop = var24;
				ScriptRunner.executeScript(var26);
				ptype = -1;
				return true;
			}
			if (ptype == 238) {
				JagString var27 = in.gjstr();
				if (var27.method266(field2649)) {
					JagString var28 = var27.substring(0, var27.method267(field3508));
					boolean var29 = false;
					long var30 = var28.method259();
					for (int var32 = 0; var32 < field2504; var32++) {
						if (var30 == field2407[var32]) {
							var29 = true;
							break;
						}
					}
					if (!var29 && overrideChat == 0) {
						addChat(Text.field1853, 4, var28);
					}
				} else if (var27.method266(field2496)) {
					boolean var33 = false;
					JagString var34 = var27.substring(0, var27.method267(field3508));
					long var35 = var34.method259();
					for (int var37 = 0; var37 < field2504; var37++) {
						if (field2407[var37] == var35) {
							var33 = true;
							break;
						}
					}
					if (!var33 && overrideChat == 0) {
						addChat(Text.field2852, 8, var34);
					}
				} else if (var27.method266(field350)) {
					JagString var46 = var27.substring(0, var27.method267(field3508));
					boolean var47 = false;
					long var48 = var46.method259();
					for (int var50 = 0; var50 < field2504; var50++) {
						if (field2407[var50] == var48) {
							var47 = true;
							break;
						}
					}
					if (!var47 && overrideChat == 0) {
						JagString var51 = var27.substring(var27.method267(field3508) + 1, var27.length() + -9);
						addChat(var51, 8, var46);
					}
				} else if (var27.method266(field2183)) {
					JagString var41 = var27.substring(0, var27.method267(field3508));
					long var42 = var41.method259();
					boolean var44 = false;
					for (int var45 = 0; var45 < field2504; var45++) {
						if (var42 == field2407[var45]) {
							var44 = true;
							break;
						}
					}
					if (!var44 && overrideChat == 0) {
						addChat(field1786, 10, var41);
					}
				} else if (var27.method266(field502)) {
					JagString var40 = var27.substring(0, var27.method267(field502));
					addChat(var40, 11, field1786);
				} else if (var27.method266(field1520)) {
					JagString var38 = var27.substring(0, var27.method267(field1520));
					if (overrideChat == 0) {
						addChat(var38, 12, field1786);
					}
				} else if (var27.method266(field3307)) {
					JagString var39 = var27.substring(0, var27.method267(field3307));
					if (overrideChat == 0) {
						addChat(var39, 13, field1786);
					}
				} else {
					addChat(var27, 0, field1786);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 188) {
				method723();
				ptype = -1;
				return false;
			}
			if (ptype == 184) {
				long var52 = in.g8();
				int var54 = in.g2();
				int var55 = in.g1();
				JagString var56 = JString.method59(var52).method264();
				for (int var57 = 0; var57 < field20; var57++) {
					if (var52 == field694[var57]) {
						if (var54 != field2094[var57]) {
							field2094[var57] = var54;
							if (var54 > 0) {
								addChat(JagString.join(new JagString[] { var56, Text.field963 }), 5, field1786);
							}
							if (var54 == 0) {
								addChat(JagString.join(new JagString[] { var56, Text.field2226 }), 5, field1786);
							}
						}
						field103[var57] = var55;
						var56 = null;
						break;
					}
				}
				if (var56 != null && field20 < 200) {
					field694[field20] = var52;
					field239[field20] = var56;
					field2094[field20] = var54;
					field103[field20] = var55;
					field20++;
				}
				field26 = field2767;
				int var58 = field20;
				while (var58 > 0) {
					var58--;
					boolean var59 = true;
					for (int var60 = 0; var60 < var58; var60++) {
						if (field2094[var60] != worldid && field2094[var60 + 1] == worldid || field2094[var60] == 0 && field2094[var60 + 1] != 0) {
							var59 = false;
							int var61 = field2094[var60];
							field2094[var60] = field2094[var60 + 1];
							field2094[var60 + 1] = var61;
							JagString var62 = field239[var60];
							field239[var60] = field239[var60 + 1];
							field239[var60 + 1] = var62;
							long var63 = field694[var60];
							field694[var60] = field694[var60 + 1];
							field694[var60 + 1] = var63;
							int var65 = field103[var60];
							field103[var60] = field103[var60 + 1];
							field103[var60 + 1] = var65;
						}
					}
					if (var59) {
						break;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 212) {
				// LAST_LOGIN_INFO
				int var66 = in.method509();
				field2122 = signlink.dnsreq(var66);
				ptype = -1;
				return true;
			}
			if (ptype == 68) {
				long var67 = in.g8();
				in.g1b();
				long var69 = in.g8();
				boolean var71 = false;
				long var72 = (long) in.g2();
				long var74 = (long) in.g3();
				int var76 = in.g1();
				long var77 = (var72 << 32) + var74;
				for (int var79 = 0; var79 < 100; var79++) {
					if (field1739[var79] == var77) {
						var71 = true;
						break;
					}
				}
				if (var76 <= 1) {
					for (int var80 = 0; var80 < field2504; var80++) {
						if (var67 == field2407[var80]) {
							var71 = true;
							break;
						}
					}
				}
				if (!var71 && overrideChat == 0) {
					field1739[field1118] = var77;
					field1118 = (field1118 + 1) % 100;
					JagString var81 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
					if (var76 == 2 || var76 == 3) {
						addChat(JagString.join(new JagString[] { TAG_IMG_1, JString.method59(var67).method264() }), 9, var81, JString.method59(var69).method264());
					} else if (var76 == 1) {
						addChat(JagString.join(new JagString[] { TAG_IMG_0, JString.method59(var67).method264() }), 9, var81, JString.method59(var69).method264());
					} else {
						addChat(JString.method59(var67).method264(), 9, var81, JString.method59(var69).method264());
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 111) {
				int var82 = in.method520();
				int var83 = in.method518();
				int var84 = in.method549();
				SubInterface var85 = (SubInterface) field2571.find((long) var84);
				if (var85 != null) {
					closeSubInterface(var85.field3280 != var83, var85);
				}
				openSubInterface(var82, var83, var84);
				ptype = -1;
				return true;
			}
			if (ptype == 38) {
				int var86 = in.method551();
				int var87 = in.g4();
				int var88 = in.method551();
				IfType var89 = IfType.get(var87);
				int var90 = var86 + var89.field797;
				int var91 = var89.field769 + var88;
				if (var90 != var89.field829 || var91 != var89.field855) {
					var89.field855 = var91;
					var89.field829 = var90;
					componentUpdated(var89);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 73) {
				field21 = in.g1();
				field23 = in.g1();
				field990 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 41) {
				int var92 = in.g4();
				JagString var93 = in.gjstr();
				IfType var94 = IfType.get(var92);
				if (!var93.strEquals(var94.field763)) {
					var94.field763 = var93;
					componentUpdated(var94);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 59) {
				int var95 = in.g4();
				IfType var96 = IfType.get(var95);
				var96.field770 = 3;
				var96.field849 = field373.model.method234();
				componentUpdated(var96);
				ptype = -1;
				return true;
			}
			if (ptype == 195 || ptype == 138 || ptype == 164 || ptype == 103 || ptype == 120 || ptype == 82 || ptype == 32 || ptype == 26 || ptype == 147 || ptype == 150 || ptype == 105) {
				zonePacket();
				ptype = -1;
				return true;
			}
			if (ptype == 77) {
				long var97 = in.g8();
				JagString var99 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
				addChat(var99, 6, JString.method59(var97).method264());
				ptype = -1;
				return true;
			}
			if (ptype == 142) {
				int var100 = in.method528();
				int var101 = in.method509();
				IfType var102 = IfType.get(var101);
				if (var102.field765 != var100 || var100 == -1) {
					var102.field839 = 0;
					var102.field765 = var100;
					var102.field762 = 0;
					componentUpdated(var102);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 108) {
				legacyUpdated();
				field49 = in.method551();
				ptype = -1;
				field2514 = field2767;
				return true;
			}
			if (ptype == 137) {
				// UPDATE_REBOOT_TIMER
				field1294 = in.method524() * 30;
				field2514 = field2767;
				ptype = -1;
				return true;
			}
			if (ptype == 110) {
				field1356 = in.g1();
				ptype = -1;
				field26 = field2767;
				return true;
			}
			if (ptype == 36) {
				// NPC_INFO
				getNpcPos();
				ptype = -1;
				return true;
			}
			if (ptype == 119) {
				// UPDATE_UID192
				GameShell.storeUID192(in);
				ptype = -1;
				return true;
			}
			if (ptype == 254) {
				int var103 = in.method509();
				IfType var104 = IfType.get(var103);
				for (int var105 = 0; var105 < var104.field834.length; var105++) {
					var104.field834[var105] = -1;
					var104.field834[var105] = 0;
				}
				componentUpdated(var104);
				ptype = -1;
				return true;
			}
			if (ptype == 122) {
				field72 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 134) {
				field1066 = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 171) {
				int var106 = in.g2();
				int var107 = in.method518();
				int var108 = in.method518();
				int var109 = in.g4();
				IfType var110 = IfType.get(var109);
				if (var110.field812 != var107 || var110.field874 != var106 || var110.field808 != var108) {
					var110.field874 = var106;
					var110.field808 = var108;
					var110.field812 = var107;
					componentUpdated(var110);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 169) {
				method16(true);
				ptype = -1;
				return true;
			}
			if (ptype == 213) {
				for (int var111 = 0; var111 < VarpType.field1361; var111++) {
					VarpType var112 = VarpType.method440(var111);
					if (var112 != null && var112.field1351 == 0) {
						VarCache.field238[var111] = 0;
						VarCache.field504[var111] = 0;
					}
				}
				legacyUpdated();
				field1993 += 32;
				ptype = -1;
				return true;
			}
			if (ptype == 208) {
				legacyUpdated();
				int var113 = in.method535();
				int var114 = in.g4();
				int var115 = in.method535();
				field343[var113] = var114;
				field3173[var113] = var115;
				field1159[var113] = 1;
				for (int var116 = 0; var116 < 98; var116++) {
					if (var114 >= Skills.field3142[var116]) {
						field1159[var113] = var116 + 2;
					}
				}
				field1741[field2011++ & 0x1F] = var113;
				ptype = -1;
				return true;
			}
			if (ptype == 55) {
				field418 = true;
				field1922 = in.g1();
				field2528 = in.g1();
				field3253 = in.g2();
				field1836 = in.g1();
				field2058 = in.g1();
				if (field2058 >= 100) {
					field1126 = field2528 * 128 + 64;
					field2494 = field1922 * 128 + 64;
					field1719 = getAvH(minusedlevel, field2494, field1126) - field3253;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 190) {
				for (int var117 = 0; var117 < VarCache.field504.length; var117++) {
					if (VarCache.field504[var117] != VarCache.field238[var117]) {
						VarCache.field504[var117] = VarCache.field238[var117];
						method882(var117);
						field2821[field1993++ & 0x1F] = var117;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 161) {
				int var118 = in.method509();
				int var119 = in.g2();
				if (var119 == 65535) {
					var119 = -1;
				}
				int var120 = in.method525();
				int var121 = in.g2();
				if (var121 == 65535) {
					var121 = -1;
				}
				for (int var122 = var119; var122 <= var121; var122++) {
					long var123 = ((long) var118 << 32) + ((long) var122);
					Linkable var125 = field2768.find(var123);
					if (var125 != null) {
						var125.unlink();
					}
					field2768.put(var123, new ServerActive(var120));
				}
				ptype = -1;
				return true;
			}
			if (ptype == 124) {
				if (field220 != -1) {
					runHookImmediate(field220, 0);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 39) {
				field368 = in.method529();
				field997 = in.g1();
				for (int var126 = field997; var126 < field997 + 8; var126++) {
					for (int var127 = field368; var127 < field368 + 8; var127++) {
						if (groundObj[minusedlevel][var126][var127] != null) {
							groundObj[minusedlevel][var126][var127] = null;
							showObject(var127, var126);
						}
					}
				}
				for (LocChange var128 = (LocChange) field1076.head(); var128 != null; var128 = (LocChange) field1076.next()) {
					if (var128.field405 >= field997 && field997 + 8 > var128.field405 && field368 <= var128.field420 && var128.field420 < field368 + 8 && var128.field401 == minusedlevel) {
						var128.endTime = 0;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 222) {
				long var129 = in.g8();
				long var131 = (long) in.g2();
				long var133 = (long) in.g3();
				long var135 = (var131 << 32) + var133;
				boolean var137 = false;
				int var138 = in.g1();
				for (int var139 = 0; var139 < 100; var139++) {
					if (field1739[var139] == var135) {
						var137 = true;
						break;
					}
				}
				if (var138 <= 1) {
					for (int var140 = 0; var140 < field2504; var140++) {
						if (var129 == field2407[var140]) {
							var137 = true;
							break;
						}
					}
				}
				if (!var137 && overrideChat == 0) {
					field1739[field1118] = var135;
					field1118 = (field1118 + 1) % 100;
					JagString var141 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
					if (var138 == 2 || var138 == 3) {
						addChat(var141, 7, JagString.join(new JagString[] { TAG_IMG_1, JString.method59(var129).method264() }));
					} else if (var138 == 1) {
						addChat(var141, 7, JagString.join(new JagString[] { TAG_IMG_0, JString.method59(var129).method264() }));
					} else {
						addChat(var141, 3, JString.method59(var129).method264());
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 207) {
				int var142 = in.method518();
				ClientInvCache.delete(var142);
				invTransmit[invTransmitNum++ & 0x1F] = var142 & 0x7FFF;
				ptype = -1;
				return true;
			}
			if (ptype == 99) {
				int var143 = in.g2();
				int var144 = in.g1();
				int var145 = in.g2();
				method17(var143, var145, var144);
				ptype = -1;
				return true;
			}
			if (ptype == 244) {
				int var146 = in.method524();
				int var147 = in.g4();
				VarCache.field238[var146] = var147;
				if (VarCache.field504[var146] != var147) {
					VarCache.field504[var146] = var147;
					method882(var146);
				}
				field2821[field1993++ & 0x1F] = var146;
				ptype = -1;
				return true;
			}
			if (ptype == 209) {
				int var148 = in.method518();
				int var149 = in.g4();
				IfType var150 = IfType.get(var149);
				if (var150 != null && var150.field755 == 0) {
					if (var148 > var150.scrollHeight - var150.height) {
						var148 = var150.scrollHeight - var150.height;
					}
					if (var148 < 0) {
						var148 = 0;
					}
					if (var148 != var150.scrollPosY) {
						var150.scrollPosY = var148;
						componentUpdated(var150);
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 201) {
				int var151 = in.method518();
				byte var152 = in.g1b();
				VarCache.field238[var151] = var152;
				if (var152 != VarCache.field504[var151]) {
					VarCache.field504[var151] = var152;
					method882(var151);
				}
				field2821[field1993++ & 0x1F] = var151;
				ptype = -1;
				return true;
			}
			if (ptype == 232) {
				field2911 = in.g1();
				if (field2911 == 1) {
					field1854 = in.g2();
				}
				if (field2911 >= 2 && field2911 <= 6) {
					if (field2911 == 2) {
						field377 = 64;
						field3194 = 64;
					}
					if (field2911 == 3) {
						field3194 = 0;
						field377 = 64;
					}
					if (field2911 == 4) {
						field3194 = 128;
						field377 = 64;
					}
					if (field2911 == 5) {
						field3194 = 64;
						field377 = 0;
					}
					if (field2911 == 6) {
						field377 = 128;
						field3194 = 64;
					}
					field2911 = 2;
					field3299 = in.g2();
					field2403 = in.g2();
					field2580 = in.g1();
				}
				if (field2911 == 10) {
					field1830 = in.g2();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 160) {
				field418 = false;
				for (int var153 = 0; var153 < 5; var153++) {
					field699[var153] = false;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 2) {
				int var154 = in.g4();
				int var155 = in.g2();
				IfType var156;
				if (var154 >= 0) {
					var156 = IfType.get(var154);
				} else {
					var156 = null;
				}
				if (var154 < -70000) {
					var155 += 32768;
				}
				while (in.pos < psize) {
					int var157 = in.gsmart();
					int var158 = in.g2();
					int var159 = 0;
					if (var158 != 0) {
						var159 = in.g1();
						if (var159 == 255) {
							var159 = in.g4();
						}
					}
					if (var156 != null && var157 >= 0 && var156.field834.length > var157) {
						var156.field834[var157] = var158;
						var156.field753[var157] = var159;
					}
					ClientInvCache.set(var155, var157, var159, var158 - 1);
				}
				if (var156 != null) {
					componentUpdated(var156);
				}
				legacyUpdated();
				invTransmit[invTransmitNum++ & 0x1F] = var155 & 0x7FFF;
				ptype = -1;
				return true;
			}
			if (ptype == 239) {
				int var160 = in.method525();
				int var161 = in.method519();
				int var162 = in.g2();
				IfType var163 = IfType.get(var160);
				ptype = -1;
				var163.field749 = var161 + (var162 << 16);
				return true;
			}
			if (ptype == 74) {
				getPlayerPos();
				ptype = -1;
				return true;
			}
			if (ptype == 51) {
				ReflectionChecker.method874(psize, in, signlink);
				ptype = -1;
				return true;
			}
			if (ptype == 10) {
				int var164 = in.method519();
				if (var164 == 65535) {
					var164 = -1;
				}
				method825(var164);
				ptype = -1;
				return true;
			}
			if (ptype == 112) {
				int var165 = in.method518();
				if (var165 == 65535) {
					var165 = -1;
				}
				int var166 = in.g3();
				method315(var165, var166);
				ptype = -1;
				return true;
			}
			if (ptype == 94) {
				int var167 = in.method535();
				int var168 = in.method535();
				JagString var169 = in.gjstr();
				if (var167 >= 1 && var167 <= 8) {
					if (var169.method271(field2101)) {
						var169 = null;
					}
					field914[var167 - 1] = var169;
					field1042[var167 - 1] = var168 == 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 25) {
				int var170 = in.g2();
				int var171 = in.g4();
				IfType var172 = IfType.get(var171);
				if (var172.field770 != 1 || var170 != var172.field849) {
					var172.field849 = var170;
					var172.field770 = 1;
					componentUpdated(var172);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 224) {
				int var173 = psize + in.pos;
				int var174 = in.g2();
				int var175 = in.g2();
				if (var174 != field220) {
					field220 = var174;
					ifAnimReset(field220);
					ScriptRunner.executeOnLoad(field220);
					for (int var176 = 0; var176 < 100; var176++) {
						field3297[var176] = true;
					}
				}
				while (var175-- > 0) {
					int var177 = in.g4();
					int var178 = in.g2();
					int var179 = in.g1();
					SubInterface var180 = (SubInterface) field2571.find((long) var177);
					if (var180 != null && var180.field3280 != var178) {
						closeSubInterface(true, var180);
						var180 = null;
					}
					if (var180 == null) {
						var180 = openSubInterface(var179, var178, var177);
					}
					var180.field3284 = true;
				}
				for (SubInterface var181 = (SubInterface) field2571.search(); var181 != null; var181 = (SubInterface) field2571.findnext()) {
					if (var181.field3284) {
						var181.field3284 = false;
					} else {
						closeSubInterface(true, var181);
					}
				}
				field2768 = new HashTable(512);
				while (var173 > in.pos) {
					int var182 = in.g4();
					int var183 = in.g2();
					int var184 = in.g2();
					int var185 = in.g4();
					for (int var186 = var183; var186 <= var184; var186++) {
						long var187 = ((long) var182 << 32) + (long) var186;
						field2768.put(var187, new ServerActive(var185));
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 4) {
				field11 = field2767;
				long var189 = in.g8();
				if (var189 == 0L) {
					field2924 = null;
					field2609 = null;
					ptype = -1;
					field3010 = null;
					field3636 = 0;
					return true;
				}
				long var191 = in.g8();
				field3010 = JString.method59(var191);
				field2924 = JString.method59(var189);
				field2389 = in.g1b();
				int var193 = in.g1();
				if (var193 == 255) {
					ptype = -1;
					return true;
				}
				FriendChatUser[] var194 = new FriendChatUser[100];
				field3636 = var193;
				for (int var195 = 0; var195 < field3636; var195++) {
					var194[var195] = new FriendChatUser();
					var194[var195].key = in.g8();
					var194[var195].username = JString.method59(var194[var195].key);
					var194[var195].world = in.g2();
					var194[var195].rank = in.g1b();
					if (field2259 == var194[var195].key) {
						field3383 = var194[var195].rank;
					}
				}
				int var196 = field3636;
				while (var196 > 0) {
					var196--;
					boolean var197 = true;
					for (int var198 = 0; var198 < var196; var198++) {
						if (var194[var198].username.method238(var194[var198 + 1].username) > 0) {
							var197 = false;
							FriendChatUser var199 = var194[var198];
							var194[var198] = var194[var198 + 1];
							var194[var198 + 1] = var199;
						}
					}
					if (var197) {
						break;
					}
				}
				field2609 = var194;
				ptype = -1;
				return true;
			}
			if (ptype == 247) {
				int var200 = in.g1();
				int var201 = in.g1();
				int var202 = in.g1();
				int var203 = in.g1();
				field699[var200] = true;
				PcmPlayer.field2653[var200] = var201;
				field2883[var200] = var202;
				field3294[var200] = var203;
				field351[var200] = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 33) {
				field997 = in.method520();
				field368 = in.method529();
				while (in.pos < psize) {
					ptype = in.g1();
					zonePacket();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 197) {
				legacyUpdated();
				field3153 = in.g1();
				ptype = -1;
				field2514 = field2767;
				return true;
			}
			if (ptype == 76) {
				field418 = true;
				field2021 = in.g1();
				field896 = in.g1();
				VarpType.field1359 = in.g2();
				field2174 = in.g1();
				field1824 = in.g1();
				if (field1824 >= 100) {
					int var204 = field2021 * 128 + 64;
					int var205 = field896 * 128 + 64;
					int var206 = getAvH(minusedlevel, var204, var205) - VarpType.field1359;
					int var207 = var206 - field1719;
					int var208 = var205 - field1126;
					int var209 = var204 - field2494;
					int var210 = (int) Math.sqrt((double) (var209 * var209 + var208 * var208));
					field1049 = (int) (Math.atan2((double) var207, (double) var210) * 325.949D) & 0x7FF;
					field2718 = (int) (-325.949D * Math.atan2((double) var209, (double) var208)) & 0x7FF;
					if (field1049 < 128) {
						field1049 = 128;
					}
					if (field1049 > 383) {
						field1049 = 383;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 237) {
				int var211 = in.g4();
				SubInterface var212 = (SubInterface) field2571.find((long) var211);
				if (var212 != null) {
					closeSubInterface(true, var212);
				}
				if (field1158 != null) {
					componentUpdated(field1158);
					field1158 = null;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 130) {
				boolean var213 = in.g1() == 1;
				int var214 = in.method549();
				IfType var215 = IfType.get(var214);
				if (var215.field740 != var213) {
					var215.field740 = var213;
					componentUpdated(var215);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 46) {
				long var216 = in.g8();
				int var218 = in.g2();
				byte var219 = in.g1b();
				boolean var220 = false;
				if ((var216 & Long.MIN_VALUE) != 0L) {
					var220 = true;
				}
				if (var220) {
					if (field3636 == 0) {
						ptype = -1;
						return true;
					}
					long var225 = var216 & Long.MAX_VALUE;
					int var227;
					for (var227 = 0; field3636 > var227 && (field2609[var227].key != var225 || var218 != field2609[var227].world); var227++) {
					}
					if (field3636 > var227) {
						while (var227 < field3636 - 1) {
							field2609[var227] = field2609[var227 + 1];
							var227++;
						}
						field3636--;
						field2609[field3636] = null;
					}
				} else {
					FriendChatUser var221 = new FriendChatUser();
					var221.key = var216;
					var221.username = JString.method59(var221.key);
					var221.world = var218;
					var221.rank = var219;
					int var222;
					for (var222 = field3636 - 1; var222 >= 0; var222--) {
						int var223 = field2609[var222].username.method238(var221.username);
						if (var223 == 0) {
							field2609[var222].world = var218;
							field2609[var222].rank = var219;
							if (var216 == field2259) {
								field3383 = var219;
							}
							field11 = field2767;
							ptype = -1;
							return true;
						}
						if (var223 < 0) {
							break;
						}
					}
					if (field3636 >= field2609.length) {
						ptype = -1;
						return true;
					}
					for (int var224 = field3636 - 1; var224 > var222; var224--) {
						field2609[var224 + 1] = field2609[var224];
					}
					if (field3636 == 0) {
						field2609 = new FriendChatUser[100];
					}
					field2609[var222 + 1] = var221;
					if (var216 == field2259) {
						field3383 = var219;
					}
					field3636++;
				}
				field11 = field2767;
				ptype = -1;
				return true;
			}
			if (ptype == 45) {
				int var228 = in.method535();
				int var229 = in.method529();
				int var230 = in.method520();
				minusedlevel = var228 >> 1;
				field373.teleport(var230, (var228 & 0x1) == 1, var229);
				ptype = -1;
				return true;
			}
			if (ptype == 5) {
				int var231 = in.g2();
				int var232 = var231 >> 10 & 0x1F;
				int var233 = in.method509();
				int var234 = var231 & 0x1F;
				int var235 = var231 >> 5 & 0x1F;
				IfType var236 = IfType.get(var233);
				int var237 = (var235 << 11) + (var232 << 19) + (var234 << 3);
				if (var236.field776 != var237) {
					var236.field776 = var237;
					componentUpdated(var236);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 231) {
				method16(false);
				ptype = -1;
				return true;
			}
			if (ptype == 115) {
				field368 = in.method529();
				field997 = in.method520();
				ptype = -1;
				return true;
			}
			JagException.report("T1 - " + ptype + "," + field3616 + "," + field710 + " - " + psize, null);
			method723();
		} catch (IOException var241) {
			lostCon();
		} catch (Exception var242) {
			String var239 = "T2 - " + ptype + "," + field3616 + "," + field710 + " - " + psize + "," + (field1700 + field373.routeX[0]) + "," + (field2836 + field373.routeZ[0]) + " - ";
			for (int var240 = 0; psize > var240 && var240 < 50; var240++) {
				var239 = var239 + in.data[var240] + ",";
			}
			JagException.report(var239, var242);
			method723();
		}
		return true;
	}

	@ObfuscatedName("mb.a([Lf;IIIIIIII)V")
	public static void loopLayer(IfType[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg0.length; var8++) {
			IfType var9 = arg0[var8];
			if (var9 != null && (!var9.field848 || var9.field755 == 0 || var9.field847 || method1100(var9) != 0 || var9 == field2807) && var9.field864 == arg7 && (!var9.field848 || !hide(var9))) {
				int var10 = arg1 + var9.field829;
				int var11 = var9.field855 + arg5;
				if (var9 == field3629) {
					field2622 = true;
					field2930 = var10;
					field1465 = var11;
				}
				int var12;
				int var13;
				int var14;
				int var15;
				if (var9.field755 == 2) {
					var12 = arg2;
					var13 = arg4;
					var14 = arg6;
					var15 = arg3;
				} else if (var9.field755 == 9) {
					int var16 = var9.field810 + var10;
					int var17 = var10;
					if (var16 < var10) {
						var17 = var16;
						var16 = var10;
					}
					var12 = arg2 >= var17 ? arg2 : var17;
					int var19 = var9.height + var11;
					int var20 = var11;
					var16++;
					var13 = arg4 > var16 ? var16 : arg4;
					if (var11 > var19) {
						var20 = var19;
						var19 = var11;
					}
					var19++;
					var14 = var19 >= arg6 ? arg6 : var19;
					var15 = arg3 >= var20 ? arg3 : var20;
				} else {
					var15 = arg3 >= var11 ? arg3 : var11;
					var12 = arg2 < var10 ? var10 : arg2;
					int var22 = var9.field810 + var10;
					var13 = var22 >= arg4 ? arg4 : var22;
					int var23 = var9.height + var11;
					var14 = var23 >= arg6 ? arg6 : var23;
				}
				if (!var9.field848 || var13 > var12 && var14 > var15) {
					if (var9.field845 == 1337) {
						componentUpdated(var9);
					} else if (var9.field845 == 1338) {
						method2(var10, var11);
					} else {
						if (var9.field755 == 0) {
							if (!var9.field848 && hide(var9) && field1163 != var9) {
								continue;
							}
							loopLayer(arg0, var10 - var9.field843, var12, var15, var13, var11 - var9.scrollPosY, var14, var9.parentId);
							if (var9.field754 != null) {
								loopLayer(var9.field754, var10 - var9.field843, var12, var15, var13, var11 - var9.scrollPosY, var14, var9.parentId);
							}
							SubInterface var24 = (SubInterface) field2571.find((long) var9.parentId);
							if (var24 != null) {
								method992(var24.field3280, var12, var15, var14, var11, var13, var10);
							}
						}
						if (var9.field848) {
							boolean var25 = false;
							boolean var26;
							if (var12 <= ClientMouseListener.mouseX && var15 <= ClientMouseListener.mouseY && ClientMouseListener.mouseX < var13 && ClientMouseListener.mouseY < var14) {
								var26 = true;
							} else {
								var26 = false;
							}
							if (ClientMouseListener.mouseButton == 1 && var26) {
								var25 = true;
							}
							boolean var27 = false;
							if (ClientMouseListener.mouseClickButton == 1 && var12 <= ClientMouseListener.mouseClickX && var15 <= ClientMouseListener.mouseClickY && ClientMouseListener.mouseClickX < var13 && ClientMouseListener.mouseClickY < var14) {
								var27 = true;
							}
							if (var27) {
								method127(var9, ClientMouseListener.mouseClickY - var11, ClientMouseListener.mouseClickX + -var10);
							}
							if (field3629 != null && field3629 != var9 && var26 && ServerActive.method924(method1100(var9))) {
								field2886 = var9;
							}
							if (var9 == field2807) {
								field2606 = var10;
								field500 = true;
								field3180 = var11;
							}
							if (var9.field847) {
								if (var26 && mouseWheelRotation != 0 && var9.field866 != null) {
									HookReq var28 = new HookReq();
									var28.onop = var9.field866;
									var28.mouseY = mouseWheelRotation;
									var28.component = var9;
									field176.push(var28);
								}
								if (field3629 != null || field723 != null || field476) {
									var26 = false;
									var27 = false;
									var25 = false;
								}
								if (!var9.field806 && var27) {
									var9.field806 = true;
									if (var9.field865 != null) {
										HookReq var29 = new HookReq();
										var29.mouseX = ClientMouseListener.mouseClickX - var10;
										var29.component = var9;
										var29.onop = var9.field865;
										var29.mouseY = ClientMouseListener.mouseClickY - var11;
										field176.push(var29);
									}
								}
								if (var9.field806 && var25 && var9.field846 != null) {
									HookReq var30 = new HookReq();
									var30.component = var9;
									var30.onop = var9.field846;
									var30.mouseY = ClientMouseListener.mouseY - var11;
									var30.mouseX = ClientMouseListener.mouseX - var10;
									field176.push(var30);
								}
								if (var9.field806 && !var25) {
									var9.field806 = false;
									if (var9.field835 != null) {
										HookReq var31 = new HookReq();
										var31.mouseX = ClientMouseListener.mouseX - var10;
										var31.mouseY = ClientMouseListener.mouseY - var11;
										var31.component = var9;
										var31.onop = var9.field835;
										field1838.push(var31);
									}
								}
								if (var25 && var9.field779 != null) {
									HookReq var32 = new HookReq();
									var32.mouseX = ClientMouseListener.mouseX - var10;
									var32.onop = var9.field779;
									var32.component = var9;
									var32.mouseY = ClientMouseListener.mouseY - var11;
									field176.push(var32);
								}
								if (!var9.field831 && var26) {
									var9.field831 = true;
									if (var9.field850 != null) {
										HookReq var33 = new HookReq();
										var33.onop = var9.field850;
										var33.component = var9;
										var33.mouseX = ClientMouseListener.mouseX - var10;
										var33.mouseY = ClientMouseListener.mouseY - var11;
										field176.push(var33);
									}
								}
								if (var9.field831 && var26 && var9.field836 != null) {
									HookReq var34 = new HookReq();
									var34.onop = var9.field836;
									var34.mouseY = ClientMouseListener.mouseY - var11;
									var34.mouseX = ClientMouseListener.mouseX - var10;
									var34.component = var9;
									field176.push(var34);
								}
								if (var9.field831 && !var26) {
									var9.field831 = false;
									if (var9.field775 != null) {
										HookReq var35 = new HookReq();
										var35.onop = var9.field775;
										var35.component = var9;
										var35.mouseX = ClientMouseListener.mouseX - var10;
										var35.mouseY = ClientMouseListener.mouseY - var11;
										field1838.push(var35);
									}
								}
								if (var9.field766 != null) {
									HookReq var36 = new HookReq();
									var36.component = var9;
									var36.onop = var9.field766;
									field2598.push(var36);
								}
								if (var9.field800 != null && field1993 > var9.field792) {
									if (var9.field821 == null || field1993 - var9.field792 > 32) {
										HookReq var37 = new HookReq();
										var37.onop = var9.field800;
										var37.component = var9;
										field176.push(var37);
									} else {
										label368: for (int var38 = var9.field792; var38 < field1993; var38++) {
											int var39 = field2821[var38 & 0x1F];
											for (int var40 = 0; var40 < var9.field821.length; var40++) {
												if (var39 == var9.field821[var40]) {
													HookReq var41 = new HookReq();
													var41.component = var9;
													var41.onop = var9.field800;
													field176.push(var41);
													break label368;
												}
											}
										}
									}
									var9.field792 = field1993;
								}
								if (var9.field751 != null && var9.field737 < invTransmitNum) {
									if (var9.field747 == null || invTransmitNum - var9.field737 > 32) {
										HookReq var46 = new HookReq();
										var46.component = var9;
										var46.onop = var9.field751;
										field176.push(var46);
									} else {
										label348: for (int var42 = var9.field737; var42 < invTransmitNum; var42++) {
											int var43 = invTransmit[var42 & 0x1F];
											for (int var44 = 0; var44 < var9.field747.length; var44++) {
												if (var9.field747[var44] == var43) {
													HookReq var45 = new HookReq();
													var45.onop = var9.field751;
													var45.component = var9;
													field176.push(var45);
													break label348;
												}
											}
										}
									}
									var9.field737 = invTransmitNum;
								}
								if (var9.field771 != null && field2011 > var9.field815) {
									if (var9.field875 == null || field2011 - var9.field815 > 32) {
										HookReq var47 = new HookReq();
										var47.component = var9;
										var47.onop = var9.field771;
										field176.push(var47);
									} else {
										label328: for (int var48 = var9.field815; var48 < field2011; var48++) {
											int var49 = field1741[var48 & 0x1F];
											for (int var50 = 0; var50 < var9.field875.length; var50++) {
												if (var49 == var9.field875[var50]) {
													HookReq var51 = new HookReq();
													var51.onop = var9.field771;
													var51.component = var9;
													field176.push(var51);
													break label328;
												}
											}
										}
									}
									var9.field815 = field2011;
								}
								if (field319 > var9.field873 && var9.field782 != null) {
									HookReq var52 = new HookReq();
									var52.component = var9;
									var52.onop = var9.field782;
									field176.push(var52);
								}
								if (var9.field873 < field26 && var9.field780 != null) {
									HookReq var53 = new HookReq();
									var53.component = var9;
									var53.onop = var9.field780;
									field176.push(var53);
								}
								if (field11 > var9.field873 && var9.field793 != null) {
									HookReq var54 = new HookReq();
									var54.onop = var9.field793;
									var54.component = var9;
									field176.push(var54);
								}
								if (var9.field873 < field2514 && var9.field822 != null) {
									HookReq var55 = new HookReq();
									var55.onop = var9.field822;
									var55.component = var9;
									field176.push(var55);
								}
								var9.field873 = field2767;
								if (var9.field741 != null) {
									for (int var56 = 0; var56 < keypresses; var56++) {
										HookReq var57 = new HookReq();
										var57.component = var9;
										var57.keyCode = field1733[var56];
										var57.keyChar = field188[var56];
										var57.onop = var9.field741;
										field176.push(var57);
									}
								}
							}
						}
						if (!var9.field848) {
							if (field3629 != null || field723 != null || field476) {
								return;
							}
							if ((var9.field752 >= 0 || var9.field830 != 0) && ClientMouseListener.mouseX >= var12 && var15 <= ClientMouseListener.mouseY && var13 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var14) {
								if (var9.field752 < 0) {
									field1163 = var9;
								} else {
									field1163 = arg0[var9.field752];
								}
							}
							if (var9.field755 == 8 && ClientMouseListener.mouseX >= var12 && var15 <= ClientMouseListener.mouseY && ClientMouseListener.mouseX < var13 && var14 > ClientMouseListener.mouseY) {
								field1665 = var9;
							}
							if (var9.scrollHeight > var9.height) {
								method664(var11, var9, ClientMouseListener.mouseY, var9.field810 + var10, var9.height, ClientMouseListener.mouseX, var9.scrollHeight);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(IIIII)V")
	public static void method663(int arg0, int arg1, int arg2, int arg3) {
		if (field2913 == 0 && !field3468) {
			method442(0, Text.field1116, arg3 - arg1, 3, field1786, arg0 - arg2);
		}
		int var4 = -1;
		for (int var5 = 0; var5 < ModelLit.field2382; var5++) {
			int var6 = ModelLit.field2367[var5];
			int var7 = var6 >> 29 & 0x3;
			int var8 = var6 & 0x7F;
			int var9 = var6 >> 14 & 0x7FFF;
			int var10 = var6 >> 7 & 0x7F;
			if (var6 != var4) {
				var4 = var6;
				if (var7 == 2 && world.method1121(minusedlevel, var8, var10, var6) >= 0) {
					LocType var11 = LocType.list(var9);
					if (var11.multiloc != null) {
						var11 = var11.getMultiLoc();
					}
					if (var11 == null) {
						continue;
					}
					if (field2913 == 1) {
						method442(var6, Text.field965, var10, 49, JagString.join(new JagString[] { field1148, field2087, var11.field1213 }), var8);
					} else if (!field3468) {
						JagString[] var12 = var11.field1255;
						if (field2164) {
							var12 = JagString.method984(var12);
						}
						if (var12 != null) {
							for (int var13 = 4; var13 >= 0; var13--) {
								if (var12[var13] != null) {
									short var14 = 0;
									if (var13 == 0) {
										var14 = 37;
									}
									if (var13 == 1) {
										var14 = 11;
									}
									if (var13 == 2) {
										var14 = 32;
									}
									if (var13 == 3) {
										var14 = 1;
									}
									if (var13 == 4) {
										var14 = 1003;
									}
									method442(var6, var12[var13], var10, var14, JagString.join(new JagString[] { field3052, var11.field1213 }), var8);
								}
							}
						}
						method442(var11.field1221 << 14, Text.field3140, var10, 1002, JagString.join(new JagString[] { field3052, var11.field1213 }), var8);
					} else if ((field2045 & 0x4) == 4) {
						method442(var6, field3353, var10, 2, JagString.join(new JagString[] { field234, field2087, var11.field1213 }), var8);
					}
				}
				if (var7 == 1) {
					ClientNpc var15 = npcs[var9];
					if (var15.type.size == 1 && (var15.x & 0x7F) == 64 && (var15.z & 0x7F) == 64) {
						for (int var16 = 0; var16 < field2397; var16++) {
							ClientNpc var17 = npcs[field313[var16]];
							if (var17 != null && var17 != var15 && var17.type.size == 1 && var15.x == var17.x && var15.z == var17.z) {
								method251(var8, var17.type, field313[var16], var10);
							}
						}
						for (int var18 = 0; var18 < field1404; var18++) {
							ClientPlayer var19 = players[field3187[var18]];
							if (var19 != null && var15.x == var19.x && var15.z == var19.z) {
								method464(field3187[var18], var10, var19, var8);
							}
						}
					}
					method251(var8, var15.type, var9, var10);
				}
				if (var7 == 0) {
					ClientPlayer var20 = players[var9];
					if ((var20.x & 0x7F) == 64 && (var20.z & 0x7F) == 64) {
						for (int var21 = 0; var21 < field2397; var21++) {
							ClientNpc var22 = npcs[field313[var21]];
							if (var22 != null && var22.type.size == 1 && var22.x == var20.x && var20.z == var22.z) {
								method251(var8, var22.type, field313[var21], var10);
							}
						}
						for (int var23 = 0; var23 < field1404; var23++) {
							ClientPlayer var24 = players[field3187[var23]];
							if (var24 != null && var20 != var24 && var24.x == var20.x && var20.z == var24.z) {
								method464(field3187[var23], var10, var24, var8);
							}
						}
					}
					method464(var9, var10, var20, var8);
				}
				if (var7 == 3) {
					LinkList var25 = groundObj[minusedlevel][var8][var10];
					if (var25 != null) {
						for (ClientObj var26 = (ClientObj) var25.tail(); var26 != null; var26 = (ClientObj) var25.prev()) {
							ObjType var27 = ObjType.list(var26.id);
							if (field2913 == 1) {
								method442(var26.id, Text.field965, var10, 20, JagString.join(new JagString[] { field1148, field1132, var27.field1429 }), var8);
							} else if (!field3468) {
								JagString[] var28 = var27.field1410;
								if (field2164) {
									var28 = JagString.method984(var28);
								}
								for (int var29 = 4; var29 >= 0; var29--) {
									if (var28 != null && var28[var29] != null) {
										byte var30 = 0;
										if (var29 == 0) {
											var30 = 57;
										}
										if (var29 == 1) {
											var30 = 47;
										}
										if (var29 == 2) {
											var30 = 31;
										}
										if (var29 == 3) {
											var30 = 13;
										}
										if (var29 == 4) {
											var30 = 36;
										}
										method442(var26.id, var28[var29], var10, var30, JagString.join(new JagString[] { field902, var27.field1429 }), var8);
									} else if (var29 == 2) {
										method442(var26.id, Text.TAKE, var10, 31, JagString.join(new JagString[] { field902, var27.field1429 }), var8);
									}
								}
								method442(var26.id, Text.field3140, var10, 1001, JagString.join(new JagString[] { field902, var27.field1429 }), var8);
							} else if ((field2045 & 0x1) == 1) {
								method442(var26.id, field3353, var10, 33, JagString.join(new JagString[] { field234, field1132, var27.field1429 }), var8);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(ILf;IIIIII)V")
	public static void method664(int arg0, IfType arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field416) {
			field1706 = 32;
		} else {
			field1706 = 0;
		}
		field416 = false;
		if (ClientMouseListener.mouseButton != 0) {
			if (arg5 >= arg3 && arg3 + 16 > arg5 && arg2 >= arg0 && arg0 + 16 > arg2) {
				arg1.scrollPosY -= 4;
				componentUpdated(arg1);
			} else if (arg3 <= arg5 && arg5 < arg3 + 16 && arg2 >= arg0 + arg4 - 16 && arg0 + arg4 > arg2) {
				arg1.scrollPosY += 4;
				componentUpdated(arg1);
			} else if (arg5 >= arg3 - field1706 && arg5 < field1706 + arg3 + 16 && arg0 + 16 <= arg2 && arg2 < arg0 + arg4 - 16) {
				int var7 = (arg4 - 32) * arg4 / arg6;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg2 - arg0 - var7 / 2 - 16;
				int var9 = arg4 - var7 - 32;
				arg1.scrollPosY = (arg6 - arg4) * var8 / var9;
				componentUpdated(arg1);
				field416 = true;
			}
		}
		if (mouseWheelRotation == 0) {
			return;
		}
		int var10 = arg1.field810;
		if (arg5 >= arg3 - var10 && arg0 <= arg2 && arg3 + 16 > arg5 && arg0 + arg4 >= arg2) {
			arg1.scrollPosY += mouseWheelRotation * 45;
			componentUpdated(arg1);
			return;
		}
	}

	@ObfuscatedName("me.a(IIII)V")
	public static void method671(int arg0, int arg1, int arg2) {
		doAudio();
		Pix2D.setClipping(arg1, arg0, field369.wi + arg1, arg0 - -field369.hi);
		if (field72 == 2 || field72 == 5) {
			Pix2D.fillScanLine(arg1 + 25, arg0 + 5, field2273, field27);
		} else {
			int var3 = field493 + field3054 & 0x7FF;
			int var4 = field373.x / 32 + 48;
			int var5 = 464 - field373.z / 32;
			minimap.scanlineRotatePlotSprite(arg1 + 25, arg0 + 5, 146, 151, var4, var5, var3, field527 + 256, field2273, field27);
			for (int var6 = 0; var6 < field1908; var6++) {
				int var7 = field2850[var6] * 4 + 2 - field373.x / 32;
				int var8 = field1957[var6] * 4 + 2 - field373.z / 32;
				minimapDrawDot(arg1, arg0, var8, field3624[var6], var7);
			}
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					LinkList var11 = groundObj[minusedlevel][var9][var10];
					if (var11 != null) {
						int var12 = var10 * 4 + 2 - field373.z / 32;
						int var13 = var9 * 4 + 2 - field373.x / 32;
						minimapDrawDot(arg1, arg0, var12, field515[0], var13);
					}
				}
			}
			for (int var14 = 0; var14 < field2397; var14++) {
				ClientNpc var15 = npcs[field313[var14]];
				if (var15 != null && var15.ready()) {
					NPCType var16 = var15.type;
					if (var16 != null && var16.field2214 != null) {
						var16 = var16.method757();
					}
					if (var16 != null && var16.field2221 && var16.field2188) {
						int var17 = var15.z / 32 - field373.z / 32;
						int var18 = var15.x / 32 - field373.x / 32;
						minimapDrawDot(arg1, arg0, var17, field515[1], var18);
					}
				}
			}
			for (int var19 = 0; var19 < field1404; var19++) {
				ClientPlayer var20 = players[field3187[var19]];
				if (var20 != null && var20.ready()) {
					int var21 = var20.x / 32 - field373.x / 32;
					int var22 = var20.z / 32 - field373.z / 32;
					long var23 = var20.name.method259();
					boolean var25 = false;
					for (int var26 = 0; var26 < field20; var26++) {
						if (field694[var26] == var23 && field2094[var26] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var27 = false;
					if (field373.team != 0 && var20.team != 0 && var20.team == field373.team) {
						var27 = true;
					}
					if (var25) {
						minimapDrawDot(arg1, arg0, var22, field515[3], var21);
					} else if (var27) {
						minimapDrawDot(arg1, arg0, var22, field515[4], var21);
					} else {
						minimapDrawDot(arg1, arg0, var22, field515[2], var21);
					}
				}
			}
			if (field2911 != 0 && loopCycle % 20 < 10) {
				if (field2911 == 1 && field1854 >= 0 && field1854 < npcs.length) {
					ClientNpc var28 = npcs[field1854];
					if (var28 != null) {
						int var29 = var28.x / 32 - field373.x / 32;
						int var30 = var28.z / 32 - field373.z / 32;
						minimapDrawArrow(var29, arg0, arg1, var30, field2233[1]);
					}
				}
				if (field2911 == 2) {
					int var31 = (field3299 - field1700) * 4 + 2 - field373.x / 32;
					int var32 = (field2403 - field2836) * 4 + 2 - field373.z / 32;
					minimapDrawArrow(var31, arg0, arg1, var32, field2233[1]);
				}
				if (field2911 == 10 && field1830 >= 0 && players.length > field1830) {
					ClientPlayer var33 = players[field1830];
					if (var33 != null) {
						int var34 = var33.x / 32 - field373.x / 32;
						int var35 = var33.z / 32 - field373.z / 32;
						minimapDrawArrow(var34, arg0, arg1, var35, field2233[1]);
					}
				}
			}
			if (field1066 != 0) {
				int var36 = field1066 * 4 + 2 - field373.x / 32;
				int var37 = field615 * 4 + 2 - field373.z / 32;
				minimapDrawDot(arg1, arg0, var37, field2233[0], var36);
			}
			Pix2D.fillRect(arg1 + 4 + 93, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (field72 < 3) {
			compass.scanlineRotatePlotSprite(arg1, arg0, 33, 33, 25, 25, field3054, 256, field854, field3034);
		} else {
			Pix2D.fillScanLine(arg1, arg0, field854, field3034);
		}
		if (field1318[arg2]) {
			field369.plotSprite(arg1, arg0);
		}
		componentRedrawRequested2[arg2] = true;
	}

	@ObfuscatedName("mf.a(Lf;Lec;Z)Lec;")
	public static JagString method674(IfType arg0, JagString arg1) {
		if (arg1.method267(AUTO_PCT) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.method267(field1308);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.method267(field912);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.method267(field1664);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.method267(field920);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.method267(field3145);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.method267(field2617);
													if (var7 == -1) {
														return arg1;
													}
													JagString var8 = field1786;
													if (field2122 != null) {
														var8 = JagString.method191(field2122.intArg);
														try {
															if (field2122.result != null) {
																byte[] var9 = ((String) field2122.result).getBytes("ISO-8859-1");
																var8 = JagString.method186(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = JagString.join(new JagString[] { arg1.substring(0, var7), var8, arg1.substring(var7 + 4) });
												}
											}
											arg1 = JagString.join(new JagString[] { arg1.substring(0, var6), method420(getIfVar(arg0, 4)), arg1.substring(var6 + 2) });
										}
									}
									arg1 = JagString.join(new JagString[] { arg1.substring(0, var5), method420(getIfVar(arg0, 3)), arg1.substring(var5 + 2) });
								}
							}
							arg1 = JagString.join(new JagString[] { arg1.substring(0, var4), method420(getIfVar(arg0, 2)), arg1.substring(var4 + 2) });
						}
					}
					arg1 = JagString.join(new JagString[] { arg1.substring(0, var3), method420(getIfVar(arg0, 1)), arg1.substring(var3 + 2) });
				}
			}
			arg1 = JagString.join(new JagString[] { arg1.substring(0, var2), method420(getIfVar(arg0, 0)), arg1.substring(var2 + 2) });
		}
	}

	@ObfuscatedName("oe.c(I)V")
	public static void method827() {
		for (MapSpotAnim var0 = (MapSpotAnim) field3594.head(); var0 != null; var0 = (MapSpotAnim) field3594.next()) {
			if (var0.field3149 != minusedlevel || var0.animComplete) {
				var0.unlink();
			} else if (var0.field3151 <= loopCycle) {
				var0.doAnim(worldUpdateNum);
				if (var0.animComplete) {
					var0.unlink();
				} else {
					world.addDynamic(var0.field3149, var0.field3164, var0.field3171, var0.field3167, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("tc.a(I)V")
	public static void method1030() {
		int var0 = b12.stringWid(Text.field94);
		for (int var1 = 0; var1 < field2849; var1++) {
			int var2 = b12.stringWid(method878(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		field2585 = field2849 * 15 + 22;
		var0 += 8;
		field476 = true;
		int var3 = field2849 * 15 + 21;
		int var4 = ClientMouseListener.mouseClickX - var0 / 2;
		field1071 = var0;
		int var5 = ClientMouseListener.mouseClickY;
		if (var0 + var4 > 765) {
			var4 = 765 - var0;
		}
		if (var5 + var3 > 503) {
			var5 = 503 - var3;
		}
		if (var5 < 0) {
			var5 = 0;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		field2864 = var5;
		field863 = var4;
	}

	@ObfuscatedName("la.a(IILec;II)V")
	public static void method616(int arg0, int arg1, JagString arg2, int arg3) {
		IfType var4 = IfType.get(arg3, arg1);
		if (var4 == null) {
			return;
		}
		if (var4.field794 != null) {
			HookReq var5 = new HookReq();
			var5.component = var4;
			var5.opbase = arg2;
			var5.opindex = arg0;
			var5.onop = var4.field794;
			ScriptRunner.executeScript(var5);
		}
		boolean var6 = true;
		if (var4.field845 > 0) {
			var6 = method152(var4);
		}
		if (!var6 || !method69(method1100(var4), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			out.p1Enc(221);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 2) {
			out.p1Enc(108);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 3) {
			out.p1Enc(181);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 4) {
			out.p1Enc(143);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 5) {
			out.p1Enc(167);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 6) {
			out.p1Enc(175);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 7) {
			out.p1Enc(162);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 8) {
			out.p1Enc(98);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 9) {
			out.p1Enc(103);
			out.p4(arg1);
			out.p2(arg3);
		}
		if (arg0 == 10) {
			out.p1Enc(150);
			out.p4(arg1);
			out.p2(arg3);
		}
	}

	@ObfuscatedName("rf.a(III)V")
	public static void method974(int arg0, int arg1) {
		if (field2849 < 2 && field2913 == 0 && !field3468) {
			return;
		}
		JagString var2;
		if (field2913 == 1 && field2849 < 2) {
			var2 = JagString.join(new JagString[] { Text.field965, Text.field2651, field1148, field1300 });
		} else if (field3468 && field2849 < 2) {
			var2 = JagString.join(new JagString[] { field3353, Text.field2651, field234, field1300 });
		} else {
			var2 = method878(field2849 - 1);
		}
		if (field2849 > 2) {
			var2 = JagString.join(new JagString[] { var2, field711, JagString.parseInt(field2849 - 2), Text.field2797 });
		}
		b12.drawStringAntiMacro(var2, arg1 + 4, arg0 + 15, loopCycle / 1000);
	}

	@ObfuscatedName("ud.a(IIIIIII)V")
	public static void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 2048 - arg4 & 0x7FF;
		int var7 = arg2;
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		if (var6 != 0) {
			int var11 = Pix3D.sinTable[var6];
			int var12 = Pix3D.cosTable[var6];
			int var13 = var12 * 0 - arg2 * var11 >> 16;
			var7 = var11 * 0 + arg2 * var12 >> 16;
			var9 = var13;
		}
		if (var8 != 0) {
			int var14 = Pix3D.sinTable[var8];
			int var15 = Pix3D.cosTable[var8];
			int var16 = var15 * 0 + var14 * var7 >> 16;
			var7 = var15 * var7 - var14 * 0 >> 16;
			var10 = var16;
		}
		field1719 = arg1 - var9;
		field2494 = arg3 - var10;
		field1126 = arg5 - var7;
		field2718 = arg0;
		field1049 = arg4;
	}

	@ObfuscatedName("fe.e(I)V")
	public static void getNpcPos() {
		field1352 = 0;
		field2391 = 0;
		getNpcPosOldVis();
		method1075();
		method242();
		for (int var0 = 0; var0 < field2391; var0++) {
			int var1 = field495[var0];
			if (npcs[var1].field2713 != loopCycle) {
				npcs[var1].type = null;
				npcs[var1] = null;
			}
		}
		if (in.pos != psize) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < field2397; var2++) {
			if (npcs[field313[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + field2397);
			}
		}
	}

	@ObfuscatedName("ha.d(I)I")
	public static int method392() {
		int var0 = getAvH(minusedlevel, field2494, field1126);
		return var0 - field1719 >= 800 || (ClientBuild.mapl[minusedlevel][field2494 >> 7][field1126 >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("ha.e(I)V")
	public static void method397() {
		for (int var0 = -1; var0 < field1404; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field3187[var0];
			}
			ClientPlayer var2 = players[var1];
			if (var2 != null && var2.field2706 > 0) {
				var2.field2706--;
				if (var2.field2706 == 0) {
					var2.field2721 = null;
				}
			}
		}
		for (int var3 = 0; var3 < field2397; var3++) {
			int var4 = field313[var3];
			ClientNpc var5 = npcs[var4];
			if (var5 != null && var5.field2706 > 0) {
				var5.field2706--;
				if (var5.field2706 == 0) {
					var5.field2721 = null;
				}
			}
		}
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void doMix(int arg0, int arg1, int arg2, int arg3) {
		for (BgSound var4 = (BgSound) BgSound.field1466.head(); var4 != null; var4 = (BgSound) BgSound.field1466.next()) {
			if (var4.field2275 != -1 || var4.field2245 != null) {
				int var5 = 0;
				if (arg1 > var4.field2255) {
					var5 = arg1 - var4.field2255;
				} else if (arg1 < var4.field2256) {
					var5 = var4.field2256 - arg1;
				}
				if (var4.field2248 < arg0) {
					var5 += arg0 - var4.field2248;
				} else if (var4.field2276 > arg0) {
					var5 += var4.field2276 - arg0;
				}
				if (var4.field2260 < var5 - 64 || PcmPlayer.field2646 == 0 || arg3 != var4.field2251) {
					if (var4.field2247 != null) {
						soundMixer.method907(var4.field2247);
						var4.field2247 = null;
					}
					if (var4.field2271 != null) {
						soundMixer.method907(var4.field2271);
						var4.field2271 = null;
					}
				} else {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}
					int var6 = (var4.field2260 - var5) * PcmPlayer.field2646 / var4.field2260;
					if (var4.field2247 != null) {
						var4.field2247.method690(var6);
					} else if (var4.field2275 >= 0) {
						JagFX var7 = JagFX.method972(jagFX, var4.field2275, 0);
						if (var7 != null) {
							Wave var8 = var7.method971().method453(soundDecimator);
							WaveStream var9 = WaveStream.method686(var8, var6);
							var9.method684(-1);
							soundMixer.method912(var9);
							var4.field2247 = var9;
						}
					}
					if (var4.field2271 != null) {
						var4.field2271.method690(var6);
						if (!var4.field2271.isLinked()) {
							var4.field2271 = null;
						}
					} else if (var4.field2245 != null && (var4.field2269 -= arg2) <= 0) {
						int var10 = (int) (Math.random() * (double) var4.field2245.length);
						JagFX var11 = JagFX.method972(jagFX, var4.field2245[var10], 0);
						if (var11 != null) {
							Wave var12 = var11.method971().method453(soundDecimator);
							WaveStream var13 = WaveStream.method686(var12, var6);
							var13.method684(0);
							soundMixer.method912(var13);
							var4.field2269 = (int) (Math.random() * (double) (var4.field2249 - var4.field2244)) + var4.field2244;
							var4.field2271 = var13;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ja.a(III)V")
	public static void coordArrow(int arg0, int arg1) {
		if (field2911 == 2) {
			method1031((field2403 - field2836 << 7) + field377, (-field1700 + field3299 << 7) + field3194, field2580 * 2);
			if (field2055 > -1 && loopCycle % 20 < 10) {
				field3019[0].plotSprite(arg0 + field2055 - 12, arg1 - (-field3001 + 28));
			}
		}
	}

	@ObfuscatedName("pa.a(I)V")
	public static void method856() {
		if (!field3468) {
			return;
		}
		IfType var0 = IfType.get(field3319, field1002);
		if (var0 != null && var0.field802 != null) {
			HookReq var1 = new HookReq();
			var1.component = var0;
			var1.onop = var0.field802;
			ScriptRunner.executeScript(var1);
		}
		field3468 = false;
		componentUpdated(var0);
	}

	@ObfuscatedName("qa.a(II)V")
	public static void method882(int arg0) {
		legacyUpdated();
		BgSound.method981();
		int var1 = VarpType.method440(arg0).field1351;
		if (var1 == 0) {
			return;
		}
		int var2 = VarCache.field504[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				Pix3D.initColourTable(0.9D);
				((WorldTextureProvider) Pix3D.field126).setBrightness(0.9D);
			}
			if (var2 == 2) {
				Pix3D.initColourTable(0.8D);
				((WorldTextureProvider) Pix3D.field126).setBrightness(0.8D);
			}
			if (var2 == 3) {
				Pix3D.initColourTable(0.7D);
				((WorldTextureProvider) Pix3D.field126).setBrightness(0.7D);
			}
			if (var2 == 4) {
				Pix3D.initColourTable(0.6D);
				((WorldTextureProvider) Pix3D.field126).setBrightness(0.6D);
			}
			ObjType.method857();
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
			if (field3638 != var3) {
				if (field3638 == 0 && field206 != -1) {
					MidiManager.play(songs, field206, var3, 0);
					playingJingle = false;
				} else if (var3 == 0) {
					MidiManager.stop();
					playingJingle = false;
				} else {
					MidiManager.method568(var3);
				}
				field3638 = var3;
			}
		}
		if (var1 == 10) {
			if (var2 == 0) {
				PcmPlayer.field2646 = 127;
			}
			if (var2 == 1) {
				PcmPlayer.field2646 = 96;
			}
			if (var2 == 2) {
				PcmPlayer.field2646 = 64;
			}
			if (var2 == 3) {
				PcmPlayer.field2646 = 32;
			}
			if (var2 == 4) {
				PcmPlayer.field2646 = 0;
			}
		}
		if (var1 == 6) {
			field1035 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				field1629 = 127;
			}
			if (var2 == 1) {
				field1629 = 96;
			}
			if (var2 == 2) {
				field1629 = 64;
			}
			if (var2 == 3) {
				field1629 = 32;
			}
			if (var2 == 4) {
				field1629 = 0;
			}
		}
		if (var1 == 5) {
			field2898 = var2;
		}
		if (var1 == 9) {
			field2885 = var2;
		}
	}

	@ObfuscatedName("pb.a(I[Lf;I)V")
	public static void animateLayer(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null && var3.field864 == arg0 && (!var3.field848 || !hide(var3))) {
				if (var3.field755 == 0) {
					if (!var3.field848 && hide(var3) && field1163 != var3) {
						continue;
					}
					animateLayer(var3.parentId, arg1);
					if (var3.field754 != null) {
						animateLayer(var3.parentId, var3.field754);
					}
					SubInterface var4 = (SubInterface) field2571.find((long) var3.parentId);
					if (var4 != null) {
						method869(var4.field3280);
					}
				}
				if (var3.field755 == 6) {
					if (var3.field765 != -1 || var3.field787 != -1) {
						boolean var5 = method657(var3);
						int var6;
						if (var5) {
							var6 = var3.field787;
						} else {
							var6 = var3.field765;
						}
						if (var6 != -1) {
							SeqType var7 = SeqType.list(var6);
							var3.field839 += worldUpdateNum;
							while (var7.delay[var3.field762] < var3.field839) {
								var3.field839 -= var7.delay[var3.field762];
								var3.field762++;
								if (var7.frames.length <= var3.field762) {
									var3.field762 -= var7.loops;
									if (var3.field762 < 0 || var7.frames.length <= var3.field762) {
										var3.field762 = 0;
									}
								}
								componentUpdated(var3);
							}
						}
					}
					if (var3.field749 != 0 && !var3.field848) {
						int var8 = var3.field749 >> 16;
						int var9 = var3.field749 << 16 >> 16;
						int var10 = var8 * worldUpdateNum;
						var3.field812 = var10 + var3.field812 & 0x7FF;
						int var11 = var9 * worldUpdateNum;
						var3.field874 = var3.field874 + var11 & 0x7FF;
						componentUpdated(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(III[Lf;IIIIII)V")
	public static void method979(int arg0, int arg1, IfType[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Pix2D.setClipping(arg1, arg7, arg0, arg8);
		Pix3D.setRenderClipping();
		for (int var9 = 0; var9 < arg2.length; var9++) {
			IfType var10 = arg2[var9];
			if (var10 != null && (arg3 == var10.field864 || arg3 == -1412584499 && field3629 == var10)) {
				int var11;
				if (arg6 == -1) {
					field3287[componentDrawCount] = arg4 + var10.field829;
					field2892[componentDrawCount] = arg5 + var10.field855;
					field512[componentDrawCount] = var10.field810;
					field366[componentDrawCount] = var10.height;
					var11 = componentDrawCount++;
				} else {
					var11 = arg6;
				}
				var10.field823 = var11;
				var10.field840 = loopCycle;
				if (!var10.field848 || !hide(var10)) {
					if (var10.field845 > 0) {
						method289(var10);
					}
					int var12 = arg4 + var10.field829;
					int var13 = var10.field861;
					int var14 = var10.field855 + arg5;
					if (field3629 == var10) {
						if (arg3 != -1412584499 && !var10.field862) {
							field1968 = arg5;
							field1603 = arg4;
							field2253 = arg2;
							continue;
						}
						if (!var10.field862) {
							var13 = 128;
						}
						if (field1789 && field500) {
							int var15 = ClientMouseListener.mouseY;
							int var16 = var15 - field2029;
							if (field3180 > var16) {
								var16 = field3180;
							}
							if (field2807.height + field3180 < var16 + var10.height) {
								var16 = field2807.height + field3180 - var10.height;
							}
							int var17 = ClientMouseListener.mouseX;
							int var18 = var17 - field1068;
							var14 = var16;
							if (field2606 > var18) {
								var18 = field2606;
							}
							if (field2807.field810 + field2606 < var18 + var10.field810) {
								var18 = field2606 + field2807.field810 - var10.field810;
							}
							var12 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.field755 == 2) {
						var19 = arg8;
						var20 = arg1;
						var21 = arg7;
						var22 = arg0;
					} else if (var10.field755 == 9) {
						int var25 = var14;
						int var26 = var12;
						int var27 = var10.height + var14;
						int var28 = var10.field810 + var12;
						if (var12 > var28) {
							var26 = var28;
							var28 = var12;
						}
						var20 = arg1 >= var26 ? arg1 : var26;
						if (var14 > var27) {
							var25 = var27;
							var27 = var14;
						}
						var21 = var25 <= arg7 ? arg7 : var25;
						var27++;
						var19 = var27 < arg8 ? var27 : arg8;
						var28++;
						var22 = arg0 <= var28 ? arg0 : var28;
					} else {
						var21 = arg7 < var14 ? var14 : arg7;
						var20 = var12 > arg1 ? var12 : arg1;
						int var23 = var12 + var10.field810;
						int var24 = var14 + var10.height;
						var22 = var23 < arg0 ? var23 : arg0;
						var19 = var24 >= arg8 ? arg8 : var24;
					}
					if (!var10.field848 || var22 > var20 && var21 < var19) {
						if (var10.field845 != 0) {
							if (var10.field845 == 1337) {
								field3513 = var14;
								field677 = var12;
								method602(var10.field810, var12, var10.height, var14);
								Pix2D.setClipping(arg1, arg7, arg0, arg8);
								continue;
							}
							if (var10.field845 == 1338) {
								method671(var14, var12, var11);
								Pix2D.setClipping(arg1, arg7, arg0, arg8);
								continue;
							}
						}
						int var31 = ClientMouseListener.mouseX;
						int var32 = ClientMouseListener.mouseY;
						if (!field476 && var20 <= var31 && var21 <= var32 && var22 > var31 && var19 > var32) {
							method1229(var32 - var14, var10, var31 - var12);
						}
						if (var10.field755 == 0) {
							if (!var10.field848 && hide(var10) && var10 != field1163) {
								continue;
							}
							if (!var10.field848) {
								if (var10.scrollHeight - var10.height < var10.scrollPosY) {
									var10.scrollPosY = var10.scrollHeight - var10.height;
								}
								if (var10.scrollPosY < 0) {
									var10.scrollPosY = 0;
								}
							}
							method979(var22, var20, arg2, var10.parentId, var12 - var10.field843, -var10.scrollPosY + var14, var11, var21, var19);
							if (var10.field754 != null) {
								method979(var22, var20, var10.field754, var10.parentId, var12 - var10.field843, -var10.scrollPosY + var14, var11, var21, var19);
							}
							SubInterface var33 = (SubInterface) field2571.find((long) var10.parentId);
							if (var33 != null) {
								if (var33.field3291 == 0 && ClientMouseListener.mouseX >= var20 && ClientMouseListener.mouseY >= var21 && ClientMouseListener.mouseX < var22 && var19 > ClientMouseListener.mouseY && !field476 && !qaOpTest) {
									field2849 = 1;
									field1034[0] = 1007;
									field2575[0] = Text.CANCEL;
									field1295[0] = field1786;
								}
								method656(var21, var12, var33.field3280, var20, var11, var22, var19, var14);
							}
							Pix2D.setClipping(arg1, arg7, arg0, arg8);
							Pix3D.setRenderClipping();
						}
						if (field1318[var11] || componentDrawMode > 1) {
							if (var10.field755 == 0 && !var10.field848 && var10.height < var10.scrollHeight) {
								method257(var10.scrollPosY, var14, var10.field810 + var12, var10.scrollHeight, var10.height);
							}
							if (var10.field755 != 1) {
								if (var10.field755 == 2) {
									int var34 = 0;
									for (int var35 = 0; var35 < var10.height; var35++) {
										for (int var36 = 0; var36 < var10.field810; var36++) {
											int var37 = var12 + (var10.field818 + 32) * var36;
											int var38 = var14 + var35 * (var10.field784 + 32);
											if (var34 < 20) {
												var38 += var10.field745[var34];
												var37 += var10.field809[var34];
											}
											if (var10.field834[var34] > 0) {
												int var39 = var10.field834[var34] - 1;
												if (arg1 < var37 + 32 && var37 < arg0 && arg7 < var38 + 32 && var38 < arg8 || field723 == var10 && var34 == field2542) {
													Pix32 var40;
													if (field2913 == 1 && var34 == field966 && field1038 == var10.parentId) {
														var40 = ObjType.method1016(2, var39, false, 0, var10.field753[var34]);
													} else {
														var40 = ObjType.method1016(1, var39, false, 3153952, var10.field753[var34]);
													}
													if (var40 == null) {
														componentUpdated(var10);
													} else if (var10 == field723 && field2542 == var34) {
														int var41 = ClientMouseListener.mouseX - field2637;
														int var42 = ClientMouseListener.mouseY - objGrabY;
														if (var41 < 5 && var41 > -5) {
															var41 = 0;
														}
														if (var42 < 5 && var42 > -5) {
															var42 = 0;
														}
														if (field2569 < 5) {
															var42 = 0;
															var41 = 0;
														}
														var40.transPlotSprite(var37 + var41, var38 - -var42, 128);
														if (arg3 != -1) {
															IfType var43 = arg2[arg3 & 0xFFFF];
															if (Pix2D.clipMinY > var42 + var38 && var43.scrollPosY > 0) {
																int var44 = (Pix2D.clipMinY - var38 - var42) * worldUpdateNum / 3;
																if (var44 > worldUpdateNum * 10) {
																	var44 = worldUpdateNum * 10;
																}
																if (var44 > var43.scrollPosY) {
																	var44 = var43.scrollPosY;
																}
																var43.scrollPosY -= var44;
																objGrabY += var44;
																componentUpdated(var43);
															}
															if (var42 + var38 + 32 > Pix2D.clipMaxY && var43.scrollHeight - var43.height > var43.scrollPosY) {
																int var45 = worldUpdateNum * (var38 + var42 + 32 - Pix2D.clipMaxY) / 3;
																if (worldUpdateNum * 10 < var45) {
																	var45 = worldUpdateNum * 10;
																}
																if (var45 > var43.scrollHeight - var43.scrollPosY - var43.height) {
																	var45 = var43.scrollHeight - var43.height - var43.scrollPosY;
																}
																var43.scrollPosY += var45;
																objGrabY -= var45;
																componentUpdated(var43);
															}
														}
													} else if (var10 == field89 && field729 == var34) {
														var40.transPlotSprite(var37, var38, 128);
													} else {
														var40.plotSprite(var37, var38);
													}
												}
											} else if (var10.field761 != null && var34 < 20) {
												Pix32 var46 = var10.method307(var34);
												if (var46 != null) {
													var46.plotSprite(var37, var38);
												} else if (IfType.field2914) {
													componentUpdated(var10);
												}
											}
											var34++;
										}
									}
								} else if (var10.field755 == 3) {
									int var47;
									if (method657(var10)) {
										var47 = var10.field869;
										if (var10 == field1163 && var10.field783 != 0) {
											var47 = var10.field783;
										}
									} else {
										var47 = var10.field776;
										if (var10 == field1163 && var10.field830 != 0) {
											var47 = var10.field830;
										}
									}
									if (var13 == 0) {
										if (var10.field803) {
											Pix2D.fillRect(var12, var14, var10.field810, var10.height, var47);
										} else {
											Pix2D.drawRect(var12, var14, var10.field810, var10.height, var47);
										}
									} else if (var10.field803) {
										Pix2D.fillRectTrans(var12, var14, var10.field810, var10.height, var47, 256 - (var13 & 0xFF));
									} else {
										Pix2D.drawRectTrans(var12, var14, var10.field810, var10.height, var47, 256 - (var13 & 0xFF));
									}
								} else if (var10.field755 == 4) {
									PixFontGeneric var48 = var10.method302();
									if (var48 != null) {
										JagString var49 = var10.field763;
										int var50;
										if (method657(var10)) {
											var50 = var10.field869;
											if (field1163 == var10 && var10.field783 != 0) {
												var50 = var10.field783;
											}
											if (var10.field774.length() > 0) {
												var49 = var10.field774;
											}
										} else {
											var50 = var10.field776;
											if (var10 == field1163 && var10.field830 != 0) {
												var50 = var10.field830;
											}
										}
										if (var10.field848 && var10.field804 != -1) {
											ObjType var51 = ObjType.list(var10.field804);
											var49 = var51.field1429;
											if (var49 == null) {
												var49 = field2101;
											}
											if ((var51.field1409 == 1 || var10.field786 != 1) && var10.field786 != -1) {
												var49 = JagString.join(new JagString[] { field902, var49, field2719, JagString.method978(var10.field786) });
											}
										}
										if (field1158 == var10) {
											var49 = Text.field3015;
											var50 = var10.field776;
										}
										if (!var10.field848) {
											var49 = method674(var10, var49);
										}
										var48.drawStringMultiline(var49, var12, var14, var10.field810, var10.height, var50, var10.field856 ? 0 : -1, var10.field841, var10.field799, var10.field838);
									} else if (IfType.field2914) {
										componentUpdated(var10);
									}
								} else if (var10.field755 == 5) {
									if (var10.field848) {
										Pix32 var53;
										if (var10.field804 == -1) {
											var53 = var10.method299(false);
										} else {
											var53 = ObjType.method1016(var10.field796, var10.field804, false, var10.field817, var10.field786);
										}
										if (var53 != null) {
											int var54 = var53.owi;
											int var55 = var53.ohi;
											if (var10.field748) {
												Pix2D.setSubClipping(var12, var14, var12 + var10.field810, var10.height + var14);
												int var57 = (var54 + var10.field810 - 1) / var54;
												int var58 = (var55 + var10.height - 1) / var55;
												for (int var59 = 0; var59 < var57; var59++) {
													for (int var60 = 0; var60 < var58; var60++) {
														if (var10.field777 != 0) {
															var53.pixelPerfectRotateScalePlotSprite(var12 + var54 * var59 + var54 / 2, var55 * var60 + var14 + var55 / 2, var10.field777, 4096);
														} else if (var13 == 0) {
															var53.plotSprite(var12 + var54 * var59, var14 - -(var60 * var55));
														} else {
															var53.transPlotSprite(var59 * var54 + var12, var60 * var55 + var14, 256 - (var13 & 0xFF));
														}
													}
												}
												Pix2D.setClipping(arg1, arg7, arg0, arg8);
											} else {
												int var56 = var10.field810 * 4096 / var54;
												if (var10.field777 != 0) {
													var53.pixelPerfectRotateScalePlotSprite(var10.field810 / 2 + var12, var14 + var10.height / 2, var10.field777, var56);
												} else if (var13 != 0) {
													var53.transScalePlotSprite(var12, var14, var10.field810, var10.height, 256 - (var13 & 0xFF));
												} else if (var10.field810 == var54 && var10.height == var55) {
													var53.plotSprite(var12, var14);
												} else {
													var53.scalePlotSprite(var12, var14, var10.field810, var10.height);
												}
											}
										} else if (IfType.field2914) {
											componentUpdated(var10);
										}
									} else {
										Pix32 var52 = var10.method299(method657(var10));
										if (var52 != null) {
											var52.plotSprite(var12, var14);
										} else if (IfType.field2914) {
											componentUpdated(var10);
										}
									}
								} else if (var10.field755 == 6) {
									boolean var61 = method657(var10);
									int var62;
									if (var61) {
										var62 = var10.field787;
									} else {
										var62 = var10.field765;
									}
									ModelLit var63 = null;
									int var64 = 0;
									if (var10.field804 != -1) {
										ObjType var66 = ObjType.list(var10.field804);
										if (var66 != null) {
											ObjType var67 = var66.method471(var10.field786);
											var63 = var67.getModelLit(1);
											if (var63 == null) {
												componentUpdated(var10);
											} else {
												var63.calcBoundingCylinder();
												var64 = var63.minY / 2;
											}
										}
									} else if (var10.field770 == 5) {
										if (var10.field849 == 0) {
											var63 = field1360.getTempModel(null, -1, null, -1);
										} else {
											var63 = field373.getTempModel();
										}
									} else if (var62 == -1) {
										var63 = var10.method306(null, field373.model, -1, var61);
										if (var63 == null && IfType.field2914) {
											componentUpdated(var10);
										}
									} else {
										SeqType var65 = SeqType.list(var62);
										var63 = var10.method306(var65, field373.model, var10.field762, var61);
										if (var63 == null && IfType.field2914) {
											componentUpdated(var10);
										}
									}
									Pix3D.setOrigin(var10.field810 / 2 + var12, var10.height / 2 + var14);
									int var68 = Pix3D.sinTable[var10.field812] * var10.field808 >> 16;
									int var69 = var10.field808 * Pix3D.cosTable[var10.field812] >> 16;
									if (var63 != null) {
										if (var10.field848) {
											var63.calcBoundingCylinder();
											if (var10.field853) {
												var63.method809(var10.field874, var10.field750, var10.field812, var10.field816, var64 + var68 + var10.field851, var10.field851 + var69, var10.field808);
											} else {
												var63.method813(var10.field874, var10.field750, var10.field812, var10.field816, var10.field851 + var64 + var68, var69 + var10.field851);
											}
										} else {
											var63.method813(var10.field874, 0, var10.field812, 0, var68, var69);
										}
									}
									Pix3D.resetOrigin();
								} else {
									if (var10.field755 == 7) {
										PixFontGeneric var70 = var10.method302();
										if (var70 == null) {
											if (IfType.field2914) {
												componentUpdated(var10);
											}
											continue;
										}
										int var71 = 0;
										for (int var72 = 0; var72 < var10.height; var72++) {
											for (int var73 = 0; var73 < var10.field810; var73++) {
												if (var10.field834[var71] > 0) {
													ObjType var74 = ObjType.list(var10.field834[var71] - 1);
													JagString var75;
													if (var74.field1409 != 1 && var10.field753[var71] == 1) {
														var75 = JagString.join(new JagString[] { field902, var74.field1429, JagString.field1508 });
													} else {
														var75 = JagString.join(new JagString[] { field902, var74.field1429, field2719, JagString.method978(var10.field753[var71]) });
													}
													int var76 = var12 + var73 * (var10.field818 + 115);
													int var77 = var72 * (var10.field784 + 12) + var14;
													if (var10.field841 == 0) {
														var70.drawString(var75, var76, var77, var10.field776, var10.field856 ? 0 : -1);
													} else if (var10.field841 == 1) {
														var70.centreString(var75, var76 + var10.field810 / 2, var77, var10.field776, var10.field856 ? 0 : -1);
													} else {
														var70.rightString(var75, var10.field810 + var76 - 1, var77, var10.field776, var10.field856 ? 0 : -1);
													}
												}
												var71++;
											}
										}
									}
									if (var10.field755 == 8 && field1665 == var10 && field924 == field2121) {
										int var78 = 0;
										PixFontGeneric var79 = p12;
										JagString var80 = var10.field763;
										JagString var81 = method674(var10, var80);
										int var82 = 0;
										while (var81.length() > 0) {
											int var83 = var81.method267(field3538);
											JagString var84;
											if (var83 == -1) {
												var84 = var81;
												var81 = field1786;
											} else {
												var84 = var81.substring(0, var83);
												var81 = var81.substring(var83 + 4);
											}
											int var85 = var79.stringWid(var84);
											var82 += var79.ascent + 1;
											if (var85 > var78) {
												var78 = var85;
											}
										}
										var78 += 6;
										var82 += 7;
										int var86 = var10.field810 + var12 - var78 - 5;
										if (var12 + 5 > var86) {
											var86 = var12 + 5;
										}
										if (arg0 < var86 + var78) {
											var86 = arg0 - var78;
										}
										int var87 = var14 + var10.height + 5;
										if (arg8 < var82 + var87) {
											var87 = arg8 - var82;
										}
										Pix2D.fillRect(var86, var87, var78, var82, 16777120);
										Pix2D.drawRect(var86, var87, var78, var82, 0);
										int var88 = var87 + var79.ascent + 2;
										JagString var89 = var10.field763;
										JagString var90 = method674(var10, var89);
										while (var90.length() > 0) {
											int var91 = var90.method267(field3538);
											JagString var92;
											if (var91 == -1) {
												var92 = var90;
												var90 = field1786;
											} else {
												var92 = var90.substring(0, var91);
												var90 = var90.substring(var91 + 4);
											}
											var79.drawString(var92, var86 + 3, var88, 0, -1);
											var88 += var79.ascent + 1;
										}
									}
									if (var10.field755 == 9) {
										if (var10.field788 == 1) {
											Pix2D.line(var12, var14, var12 + var10.field810, var14 - -var10.height, var10.field776);
										} else {
											int var93 = var10.height >= 0 ? var10.height : -var10.height;
											int var94 = var10.field810 >= 0 ? var10.field810 : -var10.field810;
											int var95 = var94;
											if (var93 > var94) {
												var95 = var93;
											}
											if (var95 != 0) {
												int var96 = (var10.field810 << 16) / var95;
												int var97 = (var10.height << 16) / var95;
												if (var97 > var96) {
													var97 = -var97;
												} else {
													var96 = -var96;
												}
												int var98 = var10.field788 * var97 >> 17;
												int var99 = var10.field788 * var97 + 1 >> 17;
												int var100 = var10.field788 * var96 + 1 >> 17;
												int var101 = var96 * var10.field788 >> 17;
												int var102 = var12 - var99;
												int var103 = var12 + var98;
												int var104 = var12 + var10.field810 - var99;
												int var105 = var98 + var12 + var10.field810;
												int var106 = var101 + var14;
												int var107 = var14 - var100;
												int var108 = var10.height + var14 - var100;
												int var109 = var10.height + var14 + var101;
												Pix3D.setHClip(var103, var102, var104);
												Pix3D.method38(var106, var107, var108, var103, var102, var104, var10.field776);
												Pix3D.setHClip(var103, var104, var105);
												Pix3D.method38(var106, var108, var109, var103, var104, var105, var10.field776);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.a(Lda;B)V")
	public static void method20(LocChange arg0) {
		int var1 = 0;
		if (arg0.field398 == 0) {
			var1 = world.method1153(arg0.field401, arg0.field405, arg0.field420);
		}
		int var2 = 0;
		if (arg0.field398 == 1) {
			var1 = world.method1131(arg0.field401, arg0.field405, arg0.field420);
		}
		if (arg0.field398 == 2) {
			var1 = world.method1133(arg0.field401, arg0.field405, arg0.field420);
		}
		int var3 = -1;
		if (arg0.field398 == 3) {
			var1 = world.method1134(arg0.field401, arg0.field405, arg0.field420);
		}
		int var4 = 0;
		if (var1 != 0) {
			var3 = var1 >> 14 & 0x7FFF;
			int var5 = world.method1121(arg0.field401, arg0.field405, arg0.field420, var1);
			var2 = var5 & 0x1F;
			var4 = var5 >> 6 & 0x3;
		}
		arg0.field408 = var2;
		arg0.field410 = var4;
		arg0.field406 = var3;
	}

	@ObfuscatedName("o.a(Lec;ZILec;Lec;)V")
	public static void addChat(JagString arg0, int arg1, JagString arg2, JagString arg3) {
		for (int var4 = 99; var4 > 0; var4--) {
			field347[var4] = field347[var4 - 1];
			field245[var4] = field245[var4 - 1];
			field832[var4] = field832[var4 - 1];
			field2610[var4] = field2610[var4 - 1];
		}
		field319 = field2767;
		field245[0] = arg0;
		field423++;
		field347[0] = arg1;
		field832[0] = arg2;
		field2610[0] = arg3;
	}

	@ObfuscatedName("kb.a(IIIILvc;)V")
	public static void method585(int arg0, int arg1, int arg2, SeqType arg3) {
		if (field3277 >= 50 || PcmPlayer.field2646 == 0 || (arg3.field3368 == null || arg2 >= arg3.field3368.length)) {
			return;
		}
		int var4 = arg3.field3368[arg2];
		if (var4 == 0) {
			return;
		}
		int var5 = var4 >> 8;
		field1195[field3277] = var5;
		int var6 = var4 >> 4 & 0x7;
		int var7 = var4 & 0xF;
		int var8 = (arg0 - 64) / 128;
		int var9 = (arg1 - 64) / 128;
		field2923[field3277] = var6;
		field2626[field3277] = 0;
		field1509[field3277] = null;
		field2672[field3277] = var7 + (var9 << 16) + (var8 << 8);
		field3277++;
	}

	@ObfuscatedName("he.a(B[Lf;I)V")
	public static void method428(IfType[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			IfType var3 = arg0[var2];
			if (var3 != null) {
				if (var3.field755 == 0) {
					if (var3.field754 != null) {
						method428(var3.field754, arg1);
					}
					SubInterface var4 = (SubInterface) field2571.find((long) var3.parentId);
					if (var4 != null) {
						runHookImmediate(var4.field3280, arg1);
					}
				}
				if (arg1 == 0 && var3.field758 != null) {
					HookReq var5 = new HookReq();
					var5.onop = var3.field758;
					var5.component = var3;
					ScriptRunner.executeScript(var5);
				}
				if (arg1 == 1 && var3.field795 != null) {
					if (var3.subId >= 0) {
						IfType var6 = IfType.get(var3.parentId);
						if (var6 == null || var6.field754 == null || var6.field754.length <= var3.subId || var6.field754[var3.subId] != var3) {
							continue;
						}
					}
					HookReq var7 = new HookReq();
					var7.onop = var3.field795;
					var7.component = var3;
					ScriptRunner.executeScript(var7);
				}
			}
		}
	}

	@ObfuscatedName("lf.d(B)V")
	public static void legacyUpdated() {
		for (SubInterface var0 = (SubInterface) field2571.search(); var0 != null; var0 = (SubInterface) field2571.findnext()) {
			int var1 = var0.field3280;
			if (IfType.method192(var1)) {
				boolean var2 = true;
				IfType[] var3 = IfType.field1825[var1];
				for (int var4 = 0; var4 < var3.length; var4++) {
					if (var3[var4] != null) {
						var2 = var3[var4].field848;
						break;
					}
				}
				if (!var2) {
					int var5 = (int) var0.key;
					IfType var6 = IfType.get(var5);
					if (var6 != null) {
						componentUpdated(var6);
					}
				}
			}
		}
	}

	@ObfuscatedName("pe.a(II)V")
	public static void method869(int arg0) {
		if (IfType.method192(arg0)) {
			animateLayer(-1, IfType.field1825[arg0]);
		}
	}

	@ObfuscatedName("g.c(I)V")
	public static void getPlayerPosExtended() {
		for (int var0 = 0; var0 < field1352; var0++) {
			int var1 = field1418[var0];
			ClientPlayer var2 = players[var1];
			int var3 = in.g1();
			if ((var3 & 0x80) != 0) {
				var3 += in.g1() << 8;
			}
			getPlayerPosExtended(var2, var1, var3);
		}
	}

	@ObfuscatedName("g.a(BLka;II)V")
	public static void getPlayerPosExtended(ClientPlayer arg0, int arg1, int arg2) {
		if ((arg2 & 0x400) != 0) {
			arg0.spotanimId = in.method519();
			int var3 = in.method525();
			arg0.field2704 = loopCycle + (var3 & 0xFFFF);
			arg0.spotanimHeight = var3 >> 16;
			if (arg0.spotanimId == 65535) {
				arg0.spotanimId = -1;
			}
			arg0.field2701 = 0;
			arg0.spotanimFrame = 0;
			if (loopCycle < arg0.field2704) {
				arg0.spotanimFrame = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			int var4 = in.method529();
			int var5 = in.g1();
			arg0.addHitmark(loopCycle, var5, var4);
			arg0.field2691 = loopCycle + 300;
			arg0.field2755 = in.method535();
			arg0.field2738 = in.method529();
		}
		if ((arg2 & 0x4) != 0) {
			int var6 = in.g2();
			int var7 = in.method520();
			if (var6 == 65535) {
				var6 = -1;
			}
			method1023(var7, arg0, var6);
		}
		if ((arg2 & 0x10) != 0) {
			int var8 = in.method519();
			int var9 = in.g1();
			int var10 = in.method535();
			int var11 = in.pos;
			if (arg0.name != null && arg0.model != null) {
				boolean var12 = false;
				long var13 = arg0.name.method259();
				if (var9 <= 1) {
					for (int var15 = 0; var15 < field2504; var15++) {
						if (var13 == field2407[var15]) {
							var12 = true;
							break;
						}
					}
				}
				if (!var12 && overrideChat == 0) {
					tempP.pos = 0;
					in.gdata(var10, tempP.data);
					tempP.pos = 0;
					JagString var16 = PixFont.escape(JagString.unpack2(tempP).forceCapitalisationOfWords());
					arg0.field2721 = var16.trim();
					arg0.field2706 = 150;
					arg0.field2753 = var8 >> 8;
					arg0.field2749 = var8 & 0xFF;
					if (var9 == 2 || var9 == 3) {
						addChat(var16, 1, JagString.join(new JagString[] {TAG_IMG_1, arg0.name}));
					} else if (var9 == 1) {
						addChat(var16, 1, JagString.join(new JagString[] { TAG_IMG_0, arg0.name}));
					} else {
						addChat(var16, 2, arg0.name);
					}
				}
			}
			in.pos = var10 + var11;
		}
		if ((arg2 & 0x200) != 0) {
			arg0.field2710 = in.method520();
			arg0.field2717 = in.method520();
			arg0.field2690 = in.g1();
			arg0.field2740 = in.method520();
			arg0.field2730 = in.method519() + loopCycle;
			arg0.field2724 = in.g2() + loopCycle;
			arg0.field2751 = in.g1();
			arg0.routeLength = 1;
			arg0.preanimRouteLength = 0;
		}
		if ((arg2 & 0x100) != 0) {
			int var17 = in.method535();
			int var18 = in.method520();
			arg0.addHitmark(loopCycle, var18, var17);
			arg0.field2691 = loopCycle + 300;
			arg0.field2755 = in.g1();
			arg0.field2738 = in.method529();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.field2721 = in.gjstr();
			if (arg0.field2721.charAt(0) == 126) {
				arg0.field2721 = arg0.field2721.substring(1);
				addChat(arg0.field2721, 2, arg0.name);
			} else if (arg0 == field373) {
				addChat(arg0.field2721, 2, arg0.name);
			}
			arg0.field2706 = 150;
			arg0.field2749 = 0;
			arg0.field2753 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			arg0.targetId = in.method519();
			if (arg0.targetId == 65535) {
				arg0.targetId = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			int var19 = in.method535();
			byte[] var20 = new byte[var19];
			Packet var21 = new Packet(var20);
			in.method539(var20, var19);
			field3262[arg1] = var21;
			arg0.setAppearance(var21);
		}
		if ((arg2 & 0x1) != 0) {
			arg0.field2741 = in.method519();
			arg0.field2697 = in.method524();
		}
	}

	@ObfuscatedName("va.a(ILf;)I")
	public static int method1100(IfType arg0) {
		ServerActive var1 = (ServerActive) field2768.find(((long) arg0.parentId << 32) + ((long) arg0.subId));
		return var1 == null ? arg0.field768 : var1.field900;
	}

	@ObfuscatedName("wf.a(ZILf;I)V")
	public static void method1229(int arg0, IfType arg1, int arg2) {
		if (arg1.field790 == 1) {
			method442(0, arg1.field791, arg1.parentId, 26, field1786, 0);
		}
		if (arg1.field790 == 2 && !field3468) {
			JagString var3 = method459(arg1);
			if (var3 != null) {
				method442(0, var3, arg1.parentId, 8, JagString.join(new JagString[] { field3128, arg1.field833 }), -1);
			}
		}
		if (arg1.field790 == 3) {
			method442(0, Text.field1656, arg1.parentId, 4, field1786, 0);
		}
		if (arg1.field790 == 4) {
			method442(0, arg1.field791, arg1.parentId, 40, field1786, 0);
		}
		if (arg1.field790 == 5) {
			method442(0, arg1.field791, arg1.parentId, 34, field1786, 0);
		}
		if (arg1.field790 == 6 && field1158 == null) {
			method442(0, arg1.field791, arg1.parentId, 39, field1786, -1);
		}
		if (arg1.field755 == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg1.height; var5++) {
				for (int var6 = 0; var6 < arg1.field810; var6++) {
					int var7 = var6 * (arg1.field818 + 32);
					int var8 = (arg1.field784 + 32) * var5;
					if (var4 < 20) {
						var7 += arg1.field809[var4];
						var8 += arg1.field745[var4];
					}
					if (var7 <= arg2 && var8 <= arg0 && var7 + 32 > arg2 && arg0 < var8 + 32) {
						field1123 = arg1;
						field1856 = var4;
						if (arg1.field834[var4] > 0) {
							ObjType var9 = ObjType.list(arg1.field834[var4] - 1);
							if (field2913 == 1 && ServerActive.method830(method1100(arg1))) {
								if (field1038 != arg1.parentId || field966 != var4) {
									method442(var9.field1399, Text.field965, arg1.parentId, 25, JagString.join(new JagString[] { field1148, field1132, var9.field1429 }), var4);
								}
							} else if (!field3468 || !ServerActive.method830(method1100(arg1))) {
								JagString[] var10 = var9.field1428;
								if (field2164) {
									var10 = JagString.method984(var10);
								}
								if (ServerActive.method830(method1100(arg1))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 19;
											} else {
												var12 = 35;
											}
											method442(var9.field1399, var10[var11], arg1.parentId, var12, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
										} else if (var11 == 4) {
											method442(var9.field1399, Text.DROP, arg1.parentId, 35, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
										}
									}
								}
								if (ServerActive.method1210(method1100(arg1))) {
									method442(var9.field1399, Text.field965, arg1.parentId, 21, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
								}
								if (ServerActive.method830(method1100(arg1)) && var10 != null) {
									for (int var13 = 2; var13 >= 0; var13--) {
										if (var10[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 17;
											}
											if (var13 == 1) {
												var14 = 30;
											}
											if (var13 == 2) {
												var14 = 7;
											}
											method442(var9.field1399, var10[var13], arg1.parentId, var14, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
										}
									}
								}
								JagString[] var15 = arg1.field756;
								if (field2164) {
									var15 = JagString.method984(var15);
								}
								if (var15 != null) {
									for (int var16 = 4; var16 >= 0; var16--) {
										if (var15[var16] != null) {
											byte var17 = 0;
											if (var16 == 0) {
												var17 = 38;
											}
											if (var16 == 1) {
												var17 = 15;
											}
											if (var16 == 2) {
												var17 = 51;
											}
											if (var16 == 3) {
												var17 = 18;
											}
											if (var16 == 4) {
												var17 = 41;
											}
											method442(var9.field1399, var15[var16], arg1.parentId, var17, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
										}
									}
								}
								method442(var9.field1399, Text.field3140, arg1.parentId, 1004, JagString.join(new JagString[] { field902, var9.field1429 }), var4);
							} else if ((field2045 & 0x10) == 16) {
								method442(var9.field1399, field3353, arg1.parentId, 43, JagString.join(new JagString[] { field234, field1132, var9.field1429 }), var4);
							}
						}
					}
					var4++;
				}
			}
		}
		if (!arg1.field848) {
			return;
		}
		if (!field3468) {
			for (int var18 = 9; var18 >= 5; var18--) {
				JagString var19 = method584(arg1, var18);
				if (var19 != null) {
					method442(var18 + 1, var19, arg1.parentId, 1005, arg1.field813, arg1.subId);
				}
			}
			JagString var20 = method459(arg1);
			if (var20 != null) {
				method442(0, var20, arg1.parentId, 8, arg1.field813, arg1.subId);
			}
			for (int var21 = 4; var21 >= 0; var21--) {
				JagString var22 = method584(arg1, var21);
				if (var22 != null) {
					method442(var21 + 1, var22, arg1.parentId, 46, arg1.field813, arg1.subId);
				}
			}
			if (ServerActive.method583(method1100(arg1))) {
				method442(0, Text.CONTINUE, arg1.parentId, 39, field1786, arg1.subId);
			}
		} else if (ServerActive.method742(method1100(arg1)) && (field2045 & 0x20) == 32) {
			method442(0, field3353, arg1.parentId, 42, JagString.join(new JagString[] { field234, field1, arg1.field813 }), arg1.subId);
		}
	}

	@ObfuscatedName("ce.a(Z)V")
	public static void method137() {
		for (int var0 = 0; var0 < field3277; var0++) {
			int var10002 = field2626[var0]--;
			if (field2626[var0] >= -10) {
				JagFX var2 = field1509[var0];
				if (var2 == null) {
					var2 = JagFX.method972(jagFX, field1195[var0], 0);
					if (var2 == null) {
						continue;
					}
					field2626[var0] += var2.method969();
					field1509[var0] = var2;
				}
				if (field2626[var0] < 0) {
					int var3;
					if (field2672[var0] == 0) {
						var3 = field1629;
					} else {
						int var4 = (field2672[var0] & 0xFF) * 128;
						int var5 = field2672[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - field373.x;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = field2672[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - field373.z;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							field2626[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = PcmPlayer.field2646 * (var4 - var9) / var4;
					}
					if (var3 > 0) {
						Wave var10 = var2.method971().method453(soundDecimator);
						WaveStream var11 = WaveStream.method686(var10, var3);
						var11.method684(field2923[var0] - 1);
						soundMixer.method912(var11);
					}
					field2626[var0] = -100;
				}
			} else {
				field3277--;
				for (int var1 = var0; var1 < field3277; var1++) {
					field1195[var1] = field1195[var1 + 1];
					field1509[var1] = field1509[var1 + 1];
					field2923[var1] = field2923[var1 + 1];
					field2626[var1] = field2626[var1 + 1];
					field2672[var1] = field2672[var1 + 1];
				}
				var0--;
			}
		}
		if (playingJingle && !MidiManager.method197()) {
			if (field3638 != 0 && field206 != -1) {
				MidiManager.play(songs, field206, field3638, 0);
			}
			playingJingle = false;
		}
	}

	@ObfuscatedName("r.a(ZLf;)Z")
	public static boolean hide(IfType arg0) {
		if (qaOpTest) {
			if (method1100(arg0) != 0) {
				return false;
			}
			if (arg0.field755 == 0) {
				return false;
			}
		}
		return arg0.field740;
	}

	@ObfuscatedName("jd.d(II)V")
	public static void loginError(int arg0) {
		if (arg0 == -3) {
			TitleScreen.loginMes(Text.field2556, Text.field3056, Text.field2763);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.field3063, Text.field3044, Text.field1857);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.field1490, Text.field3058, Text.field2772);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.field3078, Text.field3084, Text.field539);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.field58, Text.field3093, Text.field359);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.field3369, Text.field3038, Text.field3088);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.field1364, Text.field3100, Text.field857);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.field3048, Text.field3101, Text.field63);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.field3302, Text.field3092, Text.field1176);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.field1234, Text.field3066, Text.field2906);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.field3296, Text.field3097, Text.field3075);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.field531, Text.field3098, Text.field1876);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.field915, Text.field3069, Text.field1916);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.field3561, Text.field3042, Text.field2771);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.field1809, Text.field3107, Text.field509);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.field1514, Text.field3057, Text.field12);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.field2239, Text.field3106, Text.field3563);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.field1998, Text.field3080, Text.field1484);
		} else if (arg0 == 19) {
			TitleScreen.loginMes(Text.field1595, Text.field62, Text.field3215);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.field3348, Text.field3085, Text.field2766);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.field1753, Text.field3099, Text.field2236);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.field1598, Text.field3091, Text.field508);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.field2043, Text.field3050, Text.field2402);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.field2115, Text.field3043, Text.field2769);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.field1275, Text.field3068, Text.field3003);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.field3041, Text.field3049, Text.field2015);
		} else {
			TitleScreen.loginMes(Text.field2570, Text.field3046, Text.field2770);
		}
		setMainState(10);
	}

	@ObfuscatedName("wc.a(Z)V")
	public static void method1197() {
		in.method351();
		int var0 = in.method352(1);
		if (var0 == 0) {
			return;
		}
		int var1 = in.method352(2);
		if (var1 == 0) {
			field1418[field1352++] = 2047;
		} else if (var1 == 1) {
			int var2 = in.method352(3);
			field373.moveCode(var2, false);
			int var3 = in.method352(1);
			if (var3 == 1) {
				field1418[field1352++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = in.method352(3);
			field373.moveCode(var4, true);
			int var5 = in.method352(3);
			field373.moveCode(var5, true);
			int var6 = in.method352(1);
			if (var6 == 1) {
				field1418[field1352++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = in.method352(7);
			int var8 = in.method352(7);
			int var9 = in.method352(1);
			if (var9 == 1) {
				field1418[field1352++] = 2047;
			}
			minusedlevel = in.method352(2);
			int var10 = in.method352(1);
			field373.teleport(var7, var10 == 1, var8);
		}
	}

	@ObfuscatedName("wc.a(IBII)Z")
	public static boolean method1200(int arg0, int arg1, int arg2) {
		int var3 = arg2 >> 14 & 0x7FFF;
		int var4 = world.method1121(minusedlevel, arg1, arg0, arg2);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 & 0x1F;
		int var6 = var4 >> 6 & 0x3;
		if (var5 == 10 || var5 == 11 || var5 == 22) {
			LocType var7 = LocType.list(var3);
			int var8;
			int var9;
			if (var6 == 0 || var6 == 2) {
				var8 = var7.length;
				var9 = var7.width;
			} else {
				var8 = var7.width;
				var9 = var7.length;
			}
			int var10 = var7.field1192;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			tryMove(true, 0, field373.routeZ[0], 0, var8, arg1, field373.routeX[0], var10, arg0, var9, 2);
		} else {
			tryMove(true, var6, field373.routeZ[0], var5 + 1, 0, arg1, field373.routeX[0], 0, arg0, 0, 2);
		}
		field499 = ClientMouseListener.mouseClickX;
		field3545 = ClientMouseListener.mouseClickY;
		field3543 = 0;
		field3147 = 2;
		return true;
	}

	@ObfuscatedName("bf.a(II)V")
	public static void method79(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = field2868[arg0];
		int var2 = field3620[arg0];
		int var3 = field1034[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = field3135[arg0];
		if (var3 == 7) {
			out.p1Enc(252);
			out.method556(var2);
			out.p2(var1);
			out.method546(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 50) {
			ClientPlayer var5 = players[var4];
			if (var5 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var5.routeX[0], field373.routeX[0], 0, var5.routeZ[0], 1, 2);
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				field3543 = 0;
				out.p1Enc(31);
				out.method548(var4);
			}
		}
		if (var3 == 10) {
			ClientNpc var6 = npcs[var4];
			if (var6 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var6.routeX[0], field373.routeX[0], 0, var6.routeZ[0], 1, 2);
				field499 = ClientMouseListener.mouseClickX;
				field3543 = 0;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				out.p1Enc(185);
				out.p2(var4);
			}
		}
		if (var3 == 22) {
			ClientPlayer var7 = players[var4];
			if (var7 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var7.routeX[0], field373.routeX[0], 0, var7.routeZ[0], 1, 2);
				field3545 = ClientMouseListener.mouseClickY;
				field3147 = 2;
				field3543 = 0;
				field499 = ClientMouseListener.mouseClickX;
				out.p1Enc(29);
				out.method556(field1002);
				out.method504(field3319);
				out.method548(var4);
			}
		}
		if (var3 == 8) {
			IfType var8 = IfType.get(var1, var2);
			if (var8 != null) {
				method856();
				method632(var1, var2, ServerActive.method768(method1100(var8)));
				field2913 = 0;
				field3353 = method459(var8);
				if (field3353 == null) {
					field3353 = field2090;
				}
				if (!var8.field848) {
					field234 = JagString.join(new JagString[] { field3128, var8.field833, field2997 });
					return;
				}
				field234 = JagString.join(new JagString[] { var8.field813, field2997 });
			}
			return;
		}
		if (var3 == 15) {
			out.p1Enc(44);
			out.method546(var1);
			out.method556(var2);
			out.p2(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 36) {
			boolean var9 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var9) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3147 = 2;
			field499 = ClientMouseListener.mouseClickX;
			field3543 = 0;
			field3545 = ClientMouseListener.mouseClickY;
			out.p1Enc(80);
			out.method548(field1700 + var1);
			out.method548(field2836 + var2);
			out.method546(var4);
		}
		if (var3 == 43) {
			out.p1Enc(204);
			out.p4(field1002);
			out.method526(var2);
			out.method548(var4);
			out.method504(field3319);
			out.method504(var1);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 16) {
			ClientPlayer var11 = players[var4];
			if (var11 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var11.routeX[0], field373.routeX[0], 0, var11.routeZ[0], 1, 2);
				field3543 = 0;
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				out.p1Enc(138);
				out.method548(var4);
			}
		}
		if (var3 == 45) {
			ClientPlayer var12 = players[var4];
			if (var12 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var12.routeX[0], field373.routeX[0], 0, var12.routeZ[0], 1, 2);
				field3147 = 2;
				field499 = ClientMouseListener.mouseClickX;
				field3543 = 0;
				field3545 = ClientMouseListener.mouseClickY;
				out.p1Enc(35);
				out.method546(var4);
			}
		}
		if (var3 == 1002) {
			field3545 = ClientMouseListener.mouseClickY;
			field3147 = 2;
			field499 = ClientMouseListener.mouseClickX;
			field3543 = 0;
			out.p1Enc(32);
			out.method548(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 24) {
			ClientNpc var13 = npcs[var4];
			if (var13 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var13.routeX[0], field373.routeX[0], 0, var13.routeZ[0], 1, 2);
				field3543 = 0;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				out.p1Enc(37);
				out.method504(var4);
			}
		}
		if (var3 == 58) {
			ClientNpc var14 = npcs[var4];
			if (var14 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var14.routeX[0], field373.routeX[0], 0, var14.routeZ[0], 1, 2);
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				field3543 = 0;
				field3147 = 2;
				out.p1Enc(238);
				out.method553(field1038);
				out.method504(field966);
				out.method504(var4);
				out.method504(field2978);
			}
		}
		if (var3 == 3) {
			world.method1130(minusedlevel, var1, var2);
		}
		if (var3 == 40) {
			out.p1Enc(218);
			out.p4(var2);
			IfType var15 = IfType.get(var2);
			if (var15.field842 != null && var15.field842[0][0] == 5) {
				int var16 = var15.field842[0][1];
				VarCache.field504[var16] = 1 - VarCache.field504[var16];
				method882(var16);
			}
		}
		if (var3 == 25) {
			out.p1Enc(231);
			out.method504(field2978);
			out.method553(field1038);
			out.method546(var4);
			out.method546(var1);
			out.p2(field966);
			out.method526(var2);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 1001) {
			field3543 = 0;
			field3545 = ClientMouseListener.mouseClickY;
			field3147 = 2;
			field499 = ClientMouseListener.mouseClickX;
			out.p1Enc(43);
			out.method504(var4);
		}
		if (var3 == 41) {
			out.p1Enc(9);
			out.method548(var4);
			out.method556(var2);
			out.method504(var1);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 44) {
			ClientPlayer var17 = players[var4];
			if (var17 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var17.routeX[0], field373.routeX[0], 0, var17.routeZ[0], 1, 2);
				field3147 = 2;
				field499 = ClientMouseListener.mouseClickX;
				field3543 = 0;
				field3545 = ClientMouseListener.mouseClickY;
				out.p1Enc(10);
				out.method548(var4);
			}
		}
		if (var3 == 21) {
			method856();
			IfType var18 = IfType.get(var2);
			field2978 = var4;
			field966 = var1;
			field1038 = var2;
			field2913 = 1;
			componentUpdated(var18);
			field1148 = JagString.join(new JagString[] { field902, ObjType.list(var4).field1429, field2997 });
			if (field1148 == null) {
				field1148 = field2101;
			}
			return;
		}
		if (var3 == 4) {
			method871();
		}
		if (var3 == 38) {
			out.p1Enc(215);
			out.method546(var1);
			out.p4(var2);
			out.method504(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 13) {
			boolean var19 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var19) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3147 = 2;
			field3543 = 0;
			field3545 = ClientMouseListener.mouseClickY;
			field499 = ClientMouseListener.mouseClickX;
			out.p1Enc(120);
			out.method548(var4);
			out.method548(field1700 + var1);
			out.method548(var2 + field2836);
		}
		if (var3 == 18) {
			out.p1Enc(241);
			out.p2(var4);
			out.method504(var1);
			out.method526(var2);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 6) {
			ClientPlayer var21 = players[var4];
			if (var21 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var21.routeX[0], field373.routeX[0], 0, var21.routeZ[0], 1, 2);
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				field3543 = 0;
				out.p1Enc(73);
				out.method546(var4);
			}
		}
		if (var3 == 39 && field1158 == null) {
			method1071(var1, var2);
			field1158 = IfType.get(var1, var2);
			componentUpdated(field1158);
		}
		if (var3 == 1) {
			method1200(var2, var1, var4);
			out.p1Enc(174);
			out.method546(var4 >> 14 & 0x7FFF);
			out.method504(var1 + field1700);
			out.method548(field2836 + var2);
		}
		if (var3 == 1006) {
			field3545 = ClientMouseListener.mouseClickY;
			field499 = ClientMouseListener.mouseClickX;
			field3147 = 2;
			field3543 = 0;
			ClientNpc var22 = npcs[var4];
			if (var22 != null) {
				NPCType var23 = var22.type;
				if (var23.field2214 != null) {
					var23 = var23.method757();
				}
				if (var23 != null) {
					out.p1Enc(50);
					out.method504(var23.field2224);
				}
			}
		}
		if (var3 == 42) {
			out.p1Enc(96);
			out.p4(var2);
			out.method546(var1);
			out.method526(field1002);
			out.method548(field3319);
		}
		if (var3 == 19) {
			out.p1Enc(117);
			out.p2(var4);
			out.p2(var1);
			out.p4(var2);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 49 && method1200(var2, var1, var4)) {
			out.p1Enc(75);
			out.method504(field2978);
			out.p2(var4 >> 14 & 0x7FFF);
			out.method504(field966);
			out.method548(field1700 + var1);
			out.method546(field2836 + var2);
			out.p4(field1038);
		}
		if (var3 == 2 && method1200(var2, var1, var4)) {
			out.p1Enc(208);
			out.method548(var4 >> 14 & 0x7FFF);
			out.method546(field2836 + var2);
			out.method553(field1002);
			out.method504(field1700 + var1);
			out.method504(field3319);
		}
		if (var3 == 1003) {
			method1200(var2, var1, var4);
			out.p1Enc(182);
			out.p2(field1700 + var1);
			out.p2(field2836 + var2);
			out.method548(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 34) {
			out.p1Enc(218);
			out.p4(var2);
			IfType var24 = IfType.get(var2);
			if (var24.field842 != null && var24.field842[0][0] == 5) {
				int var25 = var24.field842[0][1];
				if (var24.field785[0] != VarCache.field504[var25]) {
					VarCache.field504[var25] = var24.field785[0];
					method882(var25);
				}
			}
		}
		if (var3 == 29) {
			ClientPlayer var26 = players[var4];
			if (var26 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var26.routeX[0], field373.routeX[0], 0, var26.routeZ[0], 1, 2);
				field3147 = 2;
				field3543 = 0;
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				out.p1Enc(81);
				out.method504(var4);
			}
		}
		if (var3 == 20) {
			boolean var27 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var27) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3545 = ClientMouseListener.mouseClickY;
			field499 = ClientMouseListener.mouseClickX;
			field3147 = 2;
			field3543 = 0;
			out.p1Enc(97);
			out.method504(field966);
			out.method548(field2836 + var2);
			out.method556(field1038);
			out.method504(field2978);
			out.p2(var4);
			out.method548(field1700 + var1);
		}
		if (var3 == 26) {
			IfType var29 = IfType.get(var2);
			boolean var30 = true;
			if (var29.field845 > 0) {
				var30 = method152(var29);
			}
			if (var30) {
				out.p1Enc(218);
				out.p4(var2);
			}
		}
		if (var3 == 46 || var3 == 1005) {
			method616(var4, var2, field1295[arg0], var1);
		}
		if (var3 == 48) {
			ClientPlayer var31 = players[var4];
			if (var31 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var31.routeX[0], field373.routeX[0], 0, var31.routeZ[0], 1, 2);
				field3147 = 2;
				field499 = ClientMouseListener.mouseClickX;
				field3545 = ClientMouseListener.mouseClickY;
				field3543 = 0;
				out.p1Enc(193);
				out.p2(var4);
			}
		}
		if (var3 == 51) {
			out.p1Enc(195);
			out.method548(var4);
			out.method556(var2);
			out.method504(var1);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 28) {
			ClientNpc var32 = npcs[var4];
			if (var32 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var32.routeX[0], field373.routeX[0], 0, var32.routeZ[0], 1, 2);
				field3147 = 2;
				field499 = ClientMouseListener.mouseClickX;
				field3545 = ClientMouseListener.mouseClickY;
				field3543 = 0;
				out.p1Enc(45);
				out.method546(var4);
			}
		}
		if (var3 == 30) {
			out.p1Enc(130);
			out.p2(var1);
			out.method526(var2);
			out.method548(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 57) {
			boolean var33 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var33) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3545 = ClientMouseListener.mouseClickY;
			field3147 = 2;
			field499 = ClientMouseListener.mouseClickX;
			field3543 = 0;
			out.p1Enc(250);
			out.method548(field1700 + var1);
			out.method548(var4);
			out.method548(field2836 + var2);
		}
		if (var3 == 11) {
			method1200(var2, var1, var4);
			out.p1Enc(144);
			out.method504(field1700 + var1);
			out.method546(field2836 + var2);
			out.p2(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 14) {
			ClientNpc var35 = npcs[var4];
			if (var35 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var35.routeX[0], field373.routeX[0], 0, var35.routeZ[0], 1, 2);
				field3543 = 0;
				field499 = ClientMouseListener.mouseClickX;
				field3545 = ClientMouseListener.mouseClickY;
				field3147 = 2;
				out.p1Enc(6);
				out.method548(var4);
			}
		}
		if (var3 == 23) {
			ClientPlayer var36 = players[var4];
			if (var36 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var36.routeX[0], field373.routeX[0], 0, var36.routeZ[0], 1, 2);
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				field3543 = 0;
				out.p1Enc(158);
				out.method548(var4);
			}
		}
		if (var3 == 1004) {
			IfType var37 = IfType.get(var2);
			if (var37 == null || var37.field753[var1] < 100000) {
				out.p1Enc(43);
				out.method504(var4);
			} else {
				addChat(JagString.join(new JagString[] { JagString.parseInt(var37.field753[var1]), field1667, ObjType.list(var4).field1429 }), 0, field1786);
			}
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 5) {
			ClientPlayer var38 = players[var4];
			if (var38 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var38.routeX[0], field373.routeX[0], 0, var38.routeZ[0], 1, 2);
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				field3543 = 0;
				out.p1Enc(67);
				out.method553(field1038);
				out.method504(field966);
				out.method546(var4);
				out.p2(field2978);
			}
		}
		if (var3 == 31) {
			boolean var39 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var39) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3543 = 0;
			field3147 = 2;
			field499 = ClientMouseListener.mouseClickX;
			field3545 = ClientMouseListener.mouseClickY;
			out.p1Enc(137);
			out.p2(field1700 + var1);
			out.method546(var4);
			out.p2(field2836 + var2);
		}
		if (var3 == 35) {
			out.p1Enc(115);
			out.p4(var2);
			out.method546(var1);
			out.method548(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 33) {
			boolean var41 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var41) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3545 = ClientMouseListener.mouseClickY;
			field3543 = 0;
			field499 = ClientMouseListener.mouseClickX;
			field3147 = 2;
			out.p1Enc(122);
			out.p2(var2 + field2836);
			out.method504(var1 + field1700);
			out.method553(field1002);
			out.p2(field3319);
			out.method546(var4);
		}
		if (var3 == 47) {
			boolean var43 = tryMove(false, 0, field373.routeZ[0], 0, 0, var1, field373.routeX[0], 0, var2, 0, 2);
			if (!var43) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var1, field373.routeX[0], 0, var2, 1, 2);
			}
			field3543 = 0;
			field499 = ClientMouseListener.mouseClickX;
			field3147 = 2;
			field3545 = ClientMouseListener.mouseClickY;
			out.p1Enc(112);
			out.p2(var2 + field2836);
			out.p2(var4);
			out.p2(var1 + field1700);
		}
		if (var3 == 32) {
			method1200(var2, var1, var4);
			out.p1Enc(170);
			out.method546(var2 + field2836);
			out.method504(var4 >> 14 & 0x7FFF);
			out.method504(var1 + field1700);
		}
		if (var3 == 12) {
			ClientNpc var45 = npcs[var4];
			if (var45 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var45.routeX[0], field373.routeX[0], 0, var45.routeZ[0], 1, 2);
				field3543 = 0;
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				field3545 = ClientMouseListener.mouseClickY;
				out.p1Enc(253);
				out.p2(field3319);
				out.method553(field1002);
				out.method548(var4);
			}
		}
		if (var3 == 17) {
			out.p1Enc(214);
			out.method546(var1);
			out.p4(var2);
			out.p2(var4);
			field3156 = 0;
			field89 = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 9) {
			ClientNpc var46 = npcs[var4];
			if (var46 != null) {
				tryMove(false, 0, field373.routeZ[0], 0, 1, var46.routeX[0], field373.routeX[0], 0, var46.routeZ[0], 1, 2);
				field3543 = 0;
				field3545 = ClientMouseListener.mouseClickY;
				field499 = ClientMouseListener.mouseClickX;
				field3147 = 2;
				out.p1Enc(149);
				out.p2(var4);
			}
		}
		if (var3 == 37) {
			method1200(var2, var1, var4);
			out.p1Enc(229);
			out.p2(var2 + field2836);
			out.p2(field1700 + var1);
			out.p2(var4 >> 14 & 0x7FFF);
		}
		if (field2913 != 0) {
			field2913 = 0;
			componentUpdated(IfType.get(field1038));
		}
		if (field3468) {
			method856();
		}
		if (field89 != null && field3156 == 0) {
			componentUpdated(field89);
		}
	}

	@ObfuscatedName("da.a(IJ)V")
	public static void method164(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field2504 >= 100) {
			addChat(Text.field2545, 0, field1786);
			return;
		}
		JagString var2 = JString.method59(arg0).method264();
		for (int var3 = 0; var3 < field2504; var3++) {
			if (field2407[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.field59 }), 0, field1786);
				return;
			}
		}
		for (int var4 = 0; var4 < field20; var4++) {
			if (field694[var4] == arg0) {
				addChat(JagString.join(new JagString[] { Text.field95, var2, Text.field2178 }), 0, field1786);
				return;
			}
		}
		if (var2.strEquals(field373.name)) {
			addChat(Text.field1009, 0, field1786);
			return;
		}
		field2407[field2504] = arg0;
		field1685[field2504++] = JString.method59(arg0);
		field26 = field2767;
		out.p1Enc(38);
		out.p8(arg0);
	}

	@ObfuscatedName("sc.e(I)V")
	public static void loginDone() {
		field182 = 0L;
		focus = true;
		field3497 = 0;
		focusIn = true;
		mouseTracking.length = 0;
		ReflectionChecker.method650();
		field3616 = -1;
		field2849 = 0;
		field710 = -1;
		field703 = 0;
		field1294 = 0;
		field2911 = 0;
		out.pos = 0;
		field476 = false;
		field68 = 0;
		in.pos = 0;
		field201 = -1;
		ptype = -1;
		ClientMouseListener.setIdleTimer(0);
		for (int var0 = 0; var0 < 100; var0++) {
			field832[var0] = null;
		}
		field225 = (int) (Math.random() * 110.0D) - 55;
		field2397 = 0;
		field1404 = 0;
		field1066 = 0;
		field493 = (int) (Math.random() * 120.0D) - 60;
		field173 = (int) (Math.random() * 80.0D) - 40;
		field3067 = (int) (Math.random() * 100.0D) - 50;
		minimapLevel = -1;
		field3277 = 0;
		field2913 = 0;
		field3054 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		field615 = 0;
		field72 = 0;
		field527 = (int) (Math.random() * 30.0D) - 20;
		field3468 = false;
		field423 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			players[var1] = null;
			field3262[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			npcs[var2] = null;
		}
		field373 = players[2047] = new ClientPlayer();
		field2038.clear();
		field3594.clear();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					groundObj[var3][var4][var5] = null;
				}
			}
		}
		field1076 = new LinkList();
		field20 = 0;
		field1356 = 0;
		for (int var6 = 0; var6 < VarpType.field1361; var6++) {
			VarpType var7 = VarpType.method440(var6);
			if (var7 != null && var7.field1351 == 0) {
				VarCache.field238[var6] = 0;
				VarCache.field504[var6] = 0;
			}
		}
		for (int var8 = 0; var8 < field1831.length; var8++) {
			field1831[var8] = -1;
		}
		if (field220 != -1) {
			IfType.method926(field220);
		}
		for (SubInterface var9 = (SubInterface) field2571.search(); var9 != null; var9 = (SubInterface) field2571.findnext()) {
			closeSubInterface(true, var9);
		}
		field220 = -1;
		field2571 = new HashTable(8);
		field1158 = null;
		field2849 = 0;
		field476 = false;
		field1360.setAppearance(new int[5], -1, null, false);
		for (int var10 = 0; var10 < 8; var10++) {
			field914[var10] = null;
			field1042[var10] = false;
		}
		ClientInvCache.deleteAll();
		field2032 = true;
		for (int var11 = 0; var11 < 100; var11++) {
			field3297[var11] = true;
		}
		field3010 = null;
		field3636 = 0;
		field2609 = null;
	}

	@ObfuscatedName("sc.a(IIIIIIII)V")
	public static void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (IfType.method192(arg0)) {
			loopLayer(IfType.field1825[arg0], arg6, arg1, arg2, arg5, arg4, arg3, -1);
		}
	}

	@ObfuscatedName("b.a(I)V")
	public static void method45() {
		while (true) {
			if (in.method354(psize) >= 11) {
				int var0 = in.method352(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (players[var0] == null) {
						players[var0] = new ClientPlayer();
						if (field3262[var0] != null) {
							players[var0].setAppearance(field3262[var0]);
						}
						var1 = true;
					}
					field3187[field1404++] = var0;
					ClientPlayer var2 = players[var0];
					var2.field2713 = loopCycle;
					int var3 = in.method352(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					int var4 = in.method352(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = field614[in.method352(3)];
					if (var1) {
						var2.dstYaw = var2.field2745 = var5;
					}
					int var6 = in.method352(1);
					int var7 = in.method352(1);
					if (var7 == 1) {
						field1418[field1352++] = var0;
					}
					var2.teleport(field373.routeZ[0] + var4, var6 == 1, field373.routeX[0] + var3);
					continue;
				}
			}
			in.method355();
			return;
		}
	}

	@ObfuscatedName("qf.a(ILec;)Z")
	public static boolean method922(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field20; var1++) {
			if (arg0.method271(field239[var1])) {
				return true;
			}
		}
		return arg0.method271(field373.name);
	}

	@ObfuscatedName("ia.a(ZLqd;)V")
	public static void method444(ClientEntity arg0) {
		if (arg0.field2693 == 0) {
			return;
		}
		if (arg0.targetId != -1 && arg0.targetId < 32768) {
			ClientNpc var1 = npcs[arg0.targetId];
			if (var1 != null) {
				int var2 = arg0.x - var1.x;
				int var3 = arg0.z - var1.z;
				if (var2 != 0 || var3 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.targetId >= 32768) {
			int var4 = arg0.targetId - 32768;
			if (var4 == selfSlot) {
				var4 = 2047;
			}
			ClientPlayer var5 = players[var4];
			if (var5 != null) {
				int var6 = arg0.z - var5.z;
				int var7 = arg0.x - var5.x;
				if (var7 != 0 || var6 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var7, (double) var6) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field2741 != 0 || arg0.field2697 != 0) && (arg0.routeLength == 0 || arg0.animDelayMove > 0)) {
			int var8 = arg0.x - (arg0.field2741 - field1700 - field1700) * 64;
			int var9 = arg0.z - (arg0.field2697 - field2836 - field2836) * 64;
			if (var8 != 0 || var9 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
			}
			arg0.field2741 = 0;
			arg0.field2697 = 0;
		}
		int var10 = arg0.dstYaw - arg0.field2745 & 0x7FF;
		if (var10 == 0) {
			arg0.field2752 = 0;
			return;
		}
		arg0.field2752++;
		if (var10 <= 1024) {
			arg0.field2745 += arg0.field2693;
			boolean var11 = true;
			if (arg0.field2693 > var10 || 2048 - arg0.field2693 < var10) {
				var11 = false;
				arg0.field2745 = arg0.dstYaw;
			}
			if (arg0.readyanim == arg0.secondarySeqId && (arg0.field2752 > 25 || var11)) {
				if (arg0.turnrightanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnrightanim;
				}
			}
		} else {
			arg0.field2745 -= arg0.field2693;
			boolean var12 = true;
			if (arg0.field2693 > var10 || var10 > 2048 - arg0.field2693) {
				arg0.field2745 = arg0.dstYaw;
				var12 = false;
			}
			if (arg0.secondarySeqId == arg0.readyanim && (arg0.field2752 > 25 || var12)) {
				if (arg0.turnleftanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnleftanim;
				}
			}
		}
		arg0.field2745 &= 0x7FF;
	}

	@ObfuscatedName("ec.a(ILo;III)V")
	public static void method251(int arg0, NPCType arg1, int arg2, int arg3) {
		if (field2849 >= 400) {
			return;
		}
		if (arg1.field2214 != null) {
			arg1 = arg1.method757();
		}
		if (arg1 == null || !arg1.field2188) {
			return;
		}
		JagString var4 = arg1.field2204;
		if (arg1.field2198 != 0) {
			var4 = JagString.join(new JagString[] { var4, method187(arg1.field2198, field373.combatLevel), field954, Text.field1437, JagString.parseInt(arg1.field2198), field403 });
		}
		if (field2913 == 1) {
			method442(arg2, Text.field965, arg3, 58, JagString.join(new JagString[] { field1148, field1755, var4 }), arg0);
		} else if (!field3468) {
			JagString[] var5 = arg1.field2189;
			if (field2164) {
				var5 = JagString.method984(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].method271(Text.field1704)) {
						byte var7 = 0;
						if (var6 == 0) {
							var7 = 14;
						}
						if (var6 == 1) {
							var7 = 28;
						}
						if (var6 == 2) {
							var7 = 10;
						}
						if (var6 == 3) {
							var7 = 9;
						}
						if (var6 == 4) {
							var7 = 24;
						}
						method442(arg2, var5[var6], arg3, var7, JagString.join(new JagString[] { field3182, var4 }), arg0);
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method271(Text.field1704)) {
						short var9 = 0;
						if (arg1.field2198 > field373.combatLevel) {
							var9 = 2000;
						}
						int var10 = 0;
						if (var8 == 0) {
							var10 = var9 + 14;
						}
						if (var8 == 1) {
							var10 = var9 + 28;
						}
						if (var8 == 2) {
							var10 = var9 + 10;
						}
						if (var8 == 3) {
							var10 = var9 + 9;
						}
						if (var8 == 4) {
							var10 = var9 + 24;
						}
						method442(arg2, var5[var8], arg3, var10, JagString.join(new JagString[] { field3182, var4 }), arg0);
					}
				}
			}
			method442(arg2, Text.field3140, arg3, 1006, JagString.join(new JagString[] { field3182, var4 }), arg0);
		} else if ((field2045 & 0x2) == 2) {
			method442(arg2, field3353, arg3, 12, JagString.join(new JagString[] { field234, field1755, var4 }), arg0);
			return;
		}
	}

	@ObfuscatedName("ec.a(BIIIII)V")
	public static void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
		field2252[0].plotSprite(arg2, arg1);
		field2252[1].plotSprite(arg2, arg1 + arg4 - 16);
		Pix2D.fillRect(arg2, arg1 + 16, 16, arg4 - 32, field2615);
		int var5 = arg4 * (arg4 - 32) / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = arg0 * (arg4 - var5 - 32) / (arg3 - arg4);
		Pix2D.fillRect(arg2, var6 + arg1 + 16, 16, var5, field1727);
		Pix2D.vline(arg2, arg1 + var6 + 16, var5, field3275);
		Pix2D.vline(arg2 + 1, var6 + 16 + arg1, var5, field3275);
		Pix2D.hline(arg2, arg1 + var6 + 16, 16, field3275);
		Pix2D.hline(arg2, var6 + arg1 + 17, 16, field3275);
		Pix2D.vline(arg2 + 15, arg1 + 16 + var6, var5, field2566);
		Pix2D.vline(arg2 + 14, arg1 - -var6 + 17, var5 - 1, field2566);
		Pix2D.hline(arg2, arg1 + var6 + var5 + 15, 16, field2566);
		Pix2D.hline(arg2 + 1, var5 + 14 + arg1 - -var6, 15, field2566);
	}

	@ObfuscatedName("ec.a(IIIIB)V")
	public static void method265(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (arg2 < field3287[var4] + field512[var4] && field3287[var4] < arg2 + arg0 && field2892[var4] + field366[var4] > arg1 && field2892[var4] < arg3 + arg1) {
				componentRedrawRequested2[var4] = true;
			}
		}
	}

	@ObfuscatedName("ec.b(B)V")
	public static void method242() {
		for (int var0 = 0; var0 < field1352; var0++) {
			int var1 = field1418[var0];
			ClientNpc var2 = npcs[var1];
			int var3 = in.g1();
			if ((var3 & 0x1) != 0) {
				var2.type = NPCType.list(in.method524());
				var2.walkanim_r = var2.type.field2211;
				var2.size = var2.type.size;
				var2.turnrightanim = var2.type.field2185;
				var2.walkanim_l = var2.type.field2219;
				var2.readyanim = var2.type.field2195;
				var2.walkanim = var2.type.field2202;
				var2.field2693 = var2.type.field2218;
				var2.walkanim_b = var2.type.field2201;
				var2.turnleftanim = var2.type.field2209;
			}
			if ((var3 & 0x8) != 0) {
				var2.spotanimId = in.method519();
				int var4 = in.method509();
				var2.field2704 = (var4 & 0xFFFF) + loopCycle;
				if (var2.spotanimId == 65535) {
					var2.spotanimId = -1;
				}
				var2.spotanimHeight = var4 >> 16;
				var2.field2701 = 0;
				var2.spotanimFrame = 0;
				if (var2.field2704 > loopCycle) {
					var2.spotanimFrame = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				int var5 = in.method529();
				int var6 = in.method529();
				var2.addHitmark(loopCycle, var6, var5);
				var2.field2691 = loopCycle + 300;
				var2.field2755 = in.method520();
				var2.field2738 = in.method535();
			}
			if ((var3 & 0x40) != 0) {
				var2.field2721 = in.gjstr();
				var2.field2706 = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.targetId = in.method524();
				if (var2.targetId == 65535) {
					var2.targetId = -1;
				}
			}
			if ((var3 & 0x80) != 0) {
				int var7 = in.g1();
				int var8 = in.method520();
				var2.addHitmark(loopCycle, var8, var7);
				var2.field2691 = loopCycle + 300;
				var2.field2755 = in.method520();
				var2.field2738 = in.g1();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = in.method519();
				int var10 = in.method520();
				if (var9 == 65535) {
					var9 = -1;
				}
				if (var9 == var2.primarySeqId && var9 != -1) {
					int var11 = SeqType.list(var9).duplicatebehavior;
					if (var11 == 1) {
						var2.field2737 = 0;
						var2.field2714 = 0;
						var2.primarySeqDelay = var10;
						var2.field2725 = 0;
					}
					if (var11 == 2) {
						var2.field2714 = 0;
					}
				} else if (var9 == -1 || var2.primarySeqId == -1 || SeqType.list(var9).field3384 >= SeqType.list(var2.primarySeqId).field3384) {
					var2.preanimRouteLength = var2.routeLength;
					var2.field2714 = 0;
					var2.primarySeqId = var9;
					var2.field2725 = 0;
					var2.primarySeqDelay = var10;
					var2.field2737 = 0;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.field2741 = in.method524();
				var2.field2697 = in.method519();
			}
		}
	}

	@ObfuscatedName("ec.a(BI)Z")
	public static boolean method237(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = field1034[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1005;
	}

	@ObfuscatedName("c.a(ZB)V")
	public static void method103(boolean arg0) {
		if (field373.x >> 7 == field1066 && field373.z >> 7 == field615) {
			field1066 = 0;
		}
		int var1 = field1404;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			int var3;
			ClientPlayer var4;
			if (arg0) {
				var3 = 33538048;
				var4 = field373;
			} else {
				var3 = field3187[var2] << 14;
				var4 = players[field3187[var2]];
			}
			if (var4 != null && var4.ready()) {
				var4.lowMem = false;
				if ((lowMem && field1404 > 50 || field1404 > 200) && !arg0 && var4.secondarySeqId == var4.readyanim) {
					var4.lowMem = true;
				}
				int var5 = var4.z >> 7;
				int var6 = var4.x >> 7;
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					if (var4.locModel == null || var4.locStartCycle > loopCycle || loopCycle >= var4.locEndCycle) {
						if ((var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
							if (field3658 == field789[var6][var5]) {
								continue;
							}
							field789[var6][var5] = field3658;
						}
						var4.field1643 = getAvH(minusedlevel, var4.x, var4.z);
						world.addDynamic(minusedlevel, var4.x, var4.z, var4.field1643, 60, var4, var4.field2745, var3, var4.field2735);
					} else {
						var4.lowMem = false;
						var4.field1643 = getAvH(minusedlevel, var4.x, var4.z);
						world.method1143(minusedlevel, var4.x, var4.z, var4.field1643, var4, var4.field2745, var3, var4.field1632, var4.field1645, var4.field1642, var4.field1636);
					}
				}
			}
		}
	}

	@ObfuscatedName("ie.a(IILka;BI)V")
	public static void method464(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (field373 == arg2 || field2849 >= 400) {
			return;
		}
		JagString var4;
		if (arg2.skillLevel == 0) {
			var4 = JagString.join(new JagString[] { arg2.name, method187(arg2.combatLevel, field373.combatLevel), field954, Text.field1437, JagString.parseInt(arg2.combatLevel), field403 });
		} else {
			var4 = JagString.join(new JagString[] { arg2.name, field954, Text.field2813, JagString.parseInt(arg2.skillLevel), field403 });
		}
		if (field2913 == 1) {
			method442(arg0, Text.field965, arg1, 5, JagString.join(new JagString[] { field1148, field3127, var4 }), arg3);
		} else if (!field3468) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (field914[var5] != null) {
					short var6 = 0;
					if (field914[var5].method271(Text.field1704)) {
						if (field373.combatLevel < arg2.combatLevel) {
							var6 = 2000;
						}
						if (field373.team != 0 && arg2.team != 0) {
							if (arg2.team == field373.team) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (field1042[var5]) {
						var6 = 2000;
					}
					int var7 = field2266[var5] + var6;
					method442(arg0, field914[var5], arg1, var7, JagString.join(new JagString[] { field2997, var4 }), arg3);
				}
			}
		} else if ((field2045 & 0x8) == 8) {
			method442(arg0, field3353, arg1, 22, JagString.join(new JagString[] { field234, field3127, var4 }), arg3);
		}
		for (int var8 = 0; var8 < field2849; var8++) {
			if (field1034[var8] == 3) {
				field1295[var8] = JagString.join(new JagString[] { field2997, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("ie.a(BLf;)Lec;")
	public static JagString method459(IfType arg0) {
		if (ServerActive.method768(method1100(arg0)) == 0) {
			return null;
		} else if (arg0.field825 == null || arg0.field825.trim().length() == 0) {
			return qaOpTest ? field3011 : null;
		} else {
			return arg0.field825;
		}
	}

	@ObfuscatedName("oe.b(II)V")
	public static void method825(int arg0) {
		if (arg0 == -1 && !playingJingle) {
			MidiManager.stop();
		} else if (arg0 != -1 && field206 != arg0 && field3638 != 0 && !playingJingle) {
			MidiManager.method667(songs, field3638, 0, arg0);
		}
		field206 = arg0;
	}

	@ObfuscatedName("qd.g(I)V")
	public static void method903() {
		out.p1Enc(23);
		out.p8((long) 0);
	}

	@ObfuscatedName("ed.a(BII)Z")
	public static boolean changeLocAvailable(int arg0, int arg1) {
		LocType var2 = LocType.list(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return var2.checkModel(arg1);
	}

	@ObfuscatedName("cb.a(IIIII)V")
	public static void method129(int arg0, int arg1, int arg2, int arg3) {
		if (field3147 == 1) {
			field2[field3543 / 100].plotSprite(field499 - 8, field3545 + -8);
		}
		if (field3147 == 2) {
			field2[field3543 / 100 + 4].plotSprite(field499 - 8, field3545 + -8);
		}
		method872();
		if (!showFps) {
			return;
		}
		int var4 = arg2 + 507;
		int var5 = arg0 + 20;
		int var6 = 16776960;
		p12.rightString(JagString.join(new JagString[] {field1833, JagString.parseInt(fps) }), var4, var5, 16776960, -1);
		Runtime var7 = Runtime.getRuntime();
		int var9 = var5 + 15;
		int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
		if (var8 > 32768 && lowMem) {
			var6 = 16711680;
		}
		if (var8 > 65536 && !lowMem) {
			var6 = 16711680;
		}
		p12.rightString(JagString.join(new JagString[] { field222, JagString.parseInt(var8), field2628 }), var4, var9, var6, -1);
		var5 = var9 + 15;
	}

	@ObfuscatedName("f.a(JI)V")
	public static void method305(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field20; var2++) {
			if (field694[var2] == arg0) {
				field20--;
				for (int var3 = var2; var3 < field20; var3++) {
					field239[var3] = field239[var3 + 1];
					field2094[var3] = field2094[var3 + 1];
					field694[var3] = field694[var3 + 1];
					field103[var3] = field103[var3 + 1];
				}
				field26 = field2767;
				out.p1Enc(135);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("c.a(ILf;)Lf;")
	public static IfType method111(IfType arg0) {
		int var1 = ServerActive.method395(method1100(arg0));
		if (var1 == 0) {
			return null;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			arg0 = IfType.get(arg0.field864);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@ObfuscatedName("kb.a(Lf;II)Lec;")
	public static JagString method584(IfType arg0, int arg1) {
		if (!method69(method1100(arg0), arg1) && arg0.field794 == null) {
			return null;
		} else if (arg0.field738 == null || arg0.field738.length <= arg1 || arg0.field738[arg1] == null || arg0.field738[arg1].trim().length() == 0) {
			return qaOpTest ? JagString.join(new JagString[] {field2603, JagString.parseInt(arg1) }) : null;
		} else {
			return arg0.field738[arg1];
		}
	}

	@ObfuscatedName("j.a(IIIII)V")
	public static void dirtyArea(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (field3287[var4] + field512[var4] > arg0 && arg2 + arg0 > field3287[var4] && field2892[var4] + field366[var4] > arg1 && field2892[var4] < arg1 + arg3) {
				field3297[var4] = true;
			}
		}
	}

	@ObfuscatedName("j.a(IZ)V")
	public static void method468(boolean arg0) {
		for (int var1 = 0; var1 < field2397; var1++) {
			ClientNpc var2 = npcs[field313[var1]];
			int var3 = (field313[var1] << 14) + 536870912;
			if (var2 != null && var2.ready() && arg0 == var2.type.field2243 && var2.type.method755()) {
				int var4 = var2.x >> 7;
				int var5 = var2.z >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.size == 1 && (var2.x & 0x7F) == 64 && (var2.z & 0x7F) == 64) {
						if (field789[var4][var5] == field3658) {
							continue;
						}
						field789[var4][var5] = field3658;
					}
					if (!var2.type.field2188) {
						var3 += Integer.MIN_VALUE;
					}
					world.addDynamic(minusedlevel, var2.x, var2.z, getAvH(minusedlevel, var2.size * 64 + var2.x - 64, (var2.size - 1) * 64 + var2.z), (var2.size - 1) * 64 + 60, var2, var2.field2745, var3, var2.field2735);
				}
			}
		}
	}

	@ObfuscatedName("ac.a(ZB)V")
	public static void method16(boolean arg0) {
		regionmode = arg0;
		if (!regionmode) {
			int var1 = in.method529();
			int var2 = in.method518();
			int var3 = in.g2();
			int var4 = (psize - in.pos) / 16;
			field1454 = new int[var4][4];
			for (int var5 = 0; var5 < var4; var5++) {
				for (int var6 = 0; var6 < 4; var6++) {
					field1454[var5][var6] = in.method549();
				}
			}
			int var7 = in.method524();
			boolean var8 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && (var2 / 8) == 48) {
				var8 = true;
			}
			int var9 = in.g2();
			field1747 = new int[var4];
			field3256 = new byte[var4][];
			field483 = new byte[var4][];
			field935 = new int[var4];
			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var8 = true;
			}
			field2841 = new int[var4];
			int var10 = 0;
			for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
				for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
					int var13 = var12 + (var11 << 8);
					if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
						field935[var10] = var13;
						field2841[var10] = maps.getGroupId(JagString.join(new JagString[] { IfType.field767, JagString.parseInt(var11), field361, JagString.parseInt(var12) }));
						field1747[var10] = maps.getGroupId(JagString.join(new JagString[] { PcmPlayer.field2669, JagString.parseInt(var11), field361, JagString.parseInt(var12) }));
						var10++;
					}
				}
			}
			startRebuild(var1, var9, var2, var3, var7);
			return;
		}
		int var14 = in.g2();
		int var15 = in.method520();
		int var16 = in.g2();
		int var17 = in.method518();
		in.method351();
		for (int var18 = 0; var18 < 4; var18++) {
			for (int var19 = 0; var19 < 13; var19++) {
				for (int var20 = 0; var20 < 13; var20++) {
					int var21 = in.method352(1);
					if (var21 == 1) {
						field641[var18][var19][var20] = in.method352(26);
					} else {
						field641[var18][var19][var20] = -1;
					}
				}
			}
		}
		in.method355();
		int var22 = (psize - in.pos) / 16;
		field1454 = new int[var22][4];
		for (int var23 = 0; var23 < var22; var23++) {
			for (int var24 = 0; var24 < 4; var24++) {
				field1454[var23][var24] = in.method509();
			}
		}
		int var25 = in.method524();
		field1747 = new int[var22];
		field483 = new byte[var22][];
		field935 = new int[var22];
		field2841 = new int[var22];
		field3256 = new byte[var22][];
		int var26 = 0;
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < 13; var28++) {
				for (int var29 = 0; var29 < 13; var29++) {
					int var30 = field641[var27][var28][var29];
					if (var30 != -1) {
						int var31 = var30 >> 14 & 0x3FF;
						int var32 = var30 >> 3 & 0x7FF;
						int var33 = var32 / 8 + (var31 / 8 << 8);
						for (int var34 = 0; var34 < var26; var34++) {
							if (var33 == field935[var34]) {
								var33 = -1;
								break;
							}
						}
						if (var33 != -1) {
							field935[var26] = var33;
							int var35 = var33 & 0xFF;
							int var36 = var33 >> 8 & 0xFF;
							field2841[var26] = maps.getGroupId(JagString.join(new JagString[] { IfType.field767, JagString.parseInt(var36), field361, JagString.parseInt(var35) }));
							field1747[var26] = maps.getGroupId(JagString.join(new JagString[] { PcmPlayer.field2669, JagString.parseInt(var36), field361, JagString.parseInt(var35) }));
							var26++;
						}
					}
				}
			}
		}
		startRebuild(var15, var14, var25, var16, var17);
	}

	@ObfuscatedName("ac.a(IBII)V")
	public static void method17(int arg0, int arg1, int arg2) {
		if (field1629 == 0 || arg2 == 0 || field3277 >= 50) {
			return;
		}
		field1195[field3277] = arg0;
		field2923[field3277] = arg2;
		field2626[field3277] = arg1;
		field1509[field3277] = null;
		field2672[field3277] = 0;
		field3277++;
	}

	@ObfuscatedName("hd.c(B)V")
	public static void reconnectDone() {
		field476 = false;
		field2849 = 0;
		field72 = 0;
		ptype = -1;
		psize = 0;
		out.pos = 0;
		field710 = -1;
		field703 = 0;
		field201 = -1;
		field1294 = 0;
		field3616 = -1;
		in.pos = 0;
		field1066 = 0;
		for (int var0 = 0; var0 < players.length; var0++) {
			if (players[var0] != null) {
				players[var0].targetId = -1;
			}
		}
		for (int var1 = 0; var1 < npcs.length; var1++) {
			if (npcs[var1] != null) {
				npcs[var1].targetId = -1;
			}
		}
		ClientInvCache.deleteAll();
		setMainState(30);
		for (int var2 = 0; var2 < 100; var2++) {
			field3297[var2] = true;
		}
	}

	@ObfuscatedName("ld.a(IIII)Lue;")
	public static SubInterface openSubInterface(int arg0, int arg1, int arg2) {
		SubInterface var3 = new SubInterface();
		var3.field3291 = arg0;
		var3.field3280 = arg1;
		field2571.put((long) arg2, var3);
		ifAnimReset(arg1);
		ScriptRunner.executeOnLoad(arg1);
		IfType var4 = IfType.get(arg2);
		if (var4 != null) {
			componentUpdated(var4);
		}
		if (field1158 != null) {
			componentUpdated(field1158);
			field1158 = null;
		}
		field476 = false;
		field2849 = 0;
		dirtyArea(field863, field2864, field1071, field2585);
		if (field220 != -1) {
			runHookImmediate(field220, 1);
		}
		return var3;
	}

	@ObfuscatedName("ld.a(BIII)V")
	public static void method632(int arg0, int arg1, int arg2) {
		IfType var3 = IfType.get(arg0, arg1);
		if (var3 != null && var3.field837 != null) {
			HookReq var4 = new HookReq();
			var4.component = var3;
			var4.onop = var3.field837;
			ScriptRunner.executeScript(var4);
		}
		field3319 = arg0;
		field2045 = arg2;
		field1002 = arg1;
		field3468 = true;
		componentUpdated(var3);
	}

	@ObfuscatedName("jc.h(I)V")
	public static void lostCon() {
		if (field68 > 0) {
			method723();
		} else {
			setMainState(40);
			prevStream = stream;
			stream = null;
		}
	}

	@ObfuscatedName("vf.a(Lec;I)V")
	public static void doCheat(JagString arg0) {
		if (staffmodlevel >= 2) {
			if (arg0.method271(field28)) {
				System.gc();
			}
			if (arg0.method271(field2013)) {
				lostCon();
			}
			if (arg0.method271(field1969)) {
				showFps = true;
			}
			if (arg0.method271(field1593)) {
				showFps = false;
			}
			if (arg0.method271(field372)) {
				for (int var1 = 0; var1 < 4; var1++) {
					for (int var2 = 1; var2 < 103; var2++) {
						for (int var3 = 1; var3 < 103; var3++) {
							levelCollisionMap[var1].flags[var2][var3] = 0;
						}
					}
				}
			}
			if (arg0.method271(field1000) && modewhere == 2) {
				throw new RuntimeException();
			}
			if (arg0.startsWith(field3223)) {
				componentDrawMode = arg0.substring(12).trim().checkedParseInt();
				addChat(JagString.join(new JagString[] { field1441, JagString.parseInt(componentDrawMode) }), 0, null);
			}
			if (arg0.method271(field3276)) {
				qaOpTest = true;
			}
		}
		out.p1Enc(89);
		out.p1(arg0.length() - 1);
		out.pjstr(arg0.substring(2));
	}

	@ObfuscatedName("vf.f(I)V")
	public static void method1187() {
		boolean var0 = false;
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < field2849 - 1; var1++) {
				if (field1034[var1] < 1000 && field1034[var1 + 1] > 1000) {
					JagString var2 = field1295[var1];
					var0 = false;
					field1295[var1] = field1295[var1 + 1];
					field1295[var1 + 1] = var2;
					JagString var3 = field2575[var1];
					field2575[var1] = field2575[var1 + 1];
					field2575[var1 + 1] = var3;
					int var4 = field1034[var1];
					field1034[var1] = field1034[var1 + 1];
					field1034[var1 + 1] = var4;
					int var5 = field2868[var1];
					field2868[var1] = field2868[var1 + 1];
					field2868[var1 + 1] = var5;
					int var6 = field3620[var1];
					field3620[var1] = field3620[var1 + 1];
					field3620[var1 + 1] = var6;
					int var7 = field3135[var1];
					field3135[var1] = field3135[var1 + 1];
					field3135[var1 + 1] = var7;
				}
			}
		}
	}

	@ObfuscatedName("ee.a(ILf;)V")
	public static void method289(IfType arg0) {
		int var1 = arg0.field845;
		if (var1 == 324) {
			if (ClientPlayer.field1633 == -1) {
				VarpType.field1358 = arg0.field844;
				ClientPlayer.field1633 = arg0.field819;
			}
			if (field1360.gender) {
				arg0.field819 = ClientPlayer.field1633;
			} else {
				arg0.field819 = VarpType.field1358;
			}
		} else if (var1 == 325) {
			if (ClientPlayer.field1633 == -1) {
				ClientPlayer.field1633 = arg0.field819;
				VarpType.field1358 = arg0.field844;
			}
			if (field1360.gender) {
				arg0.field819 = VarpType.field1358;
			} else {
				arg0.field819 = ClientPlayer.field1633;
			}
		} else if (var1 == 327) {
			arg0.field812 = 150;
			arg0.field874 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.field770 = 5;
			arg0.field849 = 0;
		} else if (var1 == 328) {
			arg0.field812 = 150;
			arg0.field874 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.field770 = 5;
			arg0.field849 = 1;
		}
	}

	@ObfuscatedName("m.a(IIII)I")
	public static int getAvH(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg2 >> 7;
		if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
			return 0;
		}
		int var5 = arg0;
		int var6 = arg1 & 0x7F;
		if (arg0 < 3 && (ClientBuild.mapl[1][var3][var4] & 0x2) == 2) {
			var5 = arg0 + 1;
		}
		int var7 = arg2 & 0x7F;
		int var8 = var6 * ClientBuild.groundh[var5][var3 + 1][var4] + ClientBuild.groundh[var5][var3][var4] * (128 - var6) >> 7;
		int var9 = ClientBuild.groundh[var5][var3][var4 + 1] * (128 - var6) + ClientBuild.groundh[var5][var3 + 1][var4 + 1] * var6 >> 7;
		return var8 * (128 - var7) + var9 * var7 >> 7;
	}

	@ObfuscatedName("td.a(IBII)V")
	public static void method1031(int arg0, int arg1, int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			field3001 = -1;
			field2055 = -1;
			return;
		}
		int var3 = getAvH(minusedlevel, arg1, arg0) - arg2;
		int var4 = arg0 - field1126;
		int var5 = Pix3D.sinTable[field1049];
		int var6 = var3 - field1719;
		int var7 = Pix3D.cosTable[field1049];
		int var8 = Pix3D.sinTable[field2718];
		int var9 = Pix3D.cosTable[field2718];
		int var10 = arg1 - field2494;
		int var11 = var10 * var9 + var4 * var8 >> 16;
		int var12 = var4 * var9 - var10 * var8 >> 16;
		int var14 = var7 * var6 - var5 * var12 >> 16;
		int var15 = var12 * var7 + var6 * var5 >> 16;
		if (var15 < 50) {
			field2055 = -1;
			field3001 = -1;
		} else {
			field3001 = (var14 << 9) / var15 + 167;
			field2055 = (var11 << 9) / var15 + 256;
		}
	}

	@ObfuscatedName("na.a(Lqd;IB)V")
	public static void method720(ClientEntity arg0, int arg1) {
		method1031(arg0.z, arg0.x, arg1);
	}

	@ObfuscatedName("lc.a(BLec;ILec;)V")
	public static void addChat(JagString arg0, int arg1, JagString arg2) {
		addChat(arg2, arg1, arg0, null);
	}

	@ObfuscatedName("jf.b(B)V")
	public static void method569() {
		for (int var0 = -1; var0 < field1404; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field3187[var0];
			}
			ClientPlayer var2 = players[var1];
			if (var2 != null) {
				method227(1, var2);
			}
		}
	}

	@ObfuscatedName("ia.a(B)V")
	public static void checkMinimap() {
		if (lowMem && lastBuiltLevel != minusedlevel) {
			startRebuild(minusedlevel, field373.routeZ[0], field3251, field1422, field373.routeX[0]);
		} else if (minusedlevel != minimapLevel) {
			minimapLevel = minusedlevel;
			method7(minusedlevel);
		}
	}

	@ObfuscatedName("cb.a(BLf;II)V")
	public static void method127(IfType arg0, int arg1, int arg2) {
		if (field3629 != null || field476 || (arg0 == null || method1088(arg0) == null)) {
			return;
		}
		field3629 = arg0;
		field2807 = method1088(arg0);
		field1068 = arg2;
		field2029 = arg1;
		field1789 = false;
		field163 = 0;
	}

	@ObfuscatedName("q.a(ZI)Lec;")
	public static JagString method878(int arg0) {
		return field1295[arg0].length() > 0 ? JagString.join(new JagString[] { field2575[arg0], Text.field2651, field1295[arg0] }) : field2575[arg0];
	}

	@ObfuscatedName("q.a(BLec;)Z")
	public static boolean method876(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field2504; var1++) {
			if (arg0.method271(field1685[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("uf.a(Lf;B)Lf;")
	public static IfType method1088(IfType arg0) {
		IfType var1 = method111(arg0);
		if (var1 == null) {
			var1 = arg0.field824;
		}
		return var1;
	}

	@ObfuscatedName("tb.a(ZBLue;)V")
	public static void closeSubInterface(boolean arg0, SubInterface arg1) {
		int var2 = (int) arg1.key;
		int var3 = arg1.field3280;
		arg1.unlink();
		if (arg0) {
			IfType.method926(var3);
		}
		method863(var3);
		IfType var4 = IfType.get(var2);
		if (var4 != null) {
			componentUpdated(var4);
		}
		field476 = false;
		field2849 = 0;
		dirtyArea(field863, field2864, field1071, field2585);
		if (field220 != -1) {
			runHookImmediate(field220, 1);
		}
	}

	@ObfuscatedName("tb.a(BILka;I)V")
	public static void method1023(int arg0, ClientPlayer arg1, int arg2) {
		if (arg2 == arg1.primarySeqId && arg2 != -1) {
			int var3 = SeqType.list(arg2).duplicatebehavior;
			if (var3 == 1) {
				arg1.field2737 = 0;
				arg1.field2714 = 0;
				arg1.field2725 = 0;
				arg1.primarySeqDelay = arg0;
			}
			if (var3 == 2) {
				arg1.field2714 = 0;
			}
		} else if (arg2 == -1 || arg1.primarySeqId == -1 || SeqType.list(arg2).field3384 >= SeqType.list(arg1.primarySeqId).field3384) {
			arg1.preanimRouteLength = arg1.routeLength;
			arg1.primarySeqDelay = arg0;
			arg1.field2725 = 0;
			arg1.field2714 = 0;
			arg1.field2737 = 0;
			arg1.primarySeqId = arg2;
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void method1190() {
		if (field723 != null || field3629 != null) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickButton;
		if (field476) {
			if (var0 != 1) {
				int var1 = ClientMouseListener.mouseX;
				int var2 = ClientMouseListener.mouseY;
				if (field863 - 10 > var1 || var1 > field863 + field1071 + 10 || field2864 - 10 > var2 || var2 > field2864 + field2585 + 10) {
					field476 = false;
					dirtyArea(field863, field2864, field1071, field2585);
				}
			}
			if (var0 == 1) {
				int var3 = field863;
				int var4 = field2864;
				int var5 = field1071;
				int var6 = ClientMouseListener.mouseClickX;
				int var7 = ClientMouseListener.mouseClickY;
				int var8 = -1;
				for (int var9 = 0; var9 < field2849; var9++) {
					int var10 = var4 + (field2849 - var9 - 1) * 15 + 31;
					if (var3 < var6 && var3 + var5 > var6 && var7 > var10 - 13 && var10 + 3 > var7) {
						var8 = var9;
					}
				}
				if (var8 != -1) {
					method79(var8);
				}
				field476 = false;
				dirtyArea(field863, field2864, field1071, field2585);
				return;
			}
			return;
		}
		if (var0 == 1 && field2849 > 0) {
			int var11 = field1034[field2849 - 1];
			if (var11 == 38 || var11 == 15 || var11 == 51 || var11 == 18 || var11 == 41 || var11 == 17 || var11 == 30 || var11 == 7 || var11 == 19 || var11 == 35 || var11 == 21 || var11 == 1004) {
				int var12 = field2868[field2849 - 1];
				int var13 = field3620[field2849 - 1];
				IfType var14 = IfType.get(var13);
				if (ServerActive.method78(method1100(var14)) || ServerActive.method436(method1100(var14))) {
					field2569 = 0;
					field1693 = false;
					if (field723 != null) {
						componentUpdated(field723);
					}
					field723 = IfType.get(var13);
					objGrabY = ClientMouseListener.mouseClickY;
					field2637 = ClientMouseListener.mouseClickX;
					field2542 = var12;
					componentUpdated(field723);
					return;
				}
			}
		}
		if (var0 == 1 && (field2898 == 1 && field2849 > 2 || method237(field2849 - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && field2849 > 0) {
			method79(field2849 - 1);
		}
		if (var0 != 2 || field2849 <= 0) {
			return;
		}
		method1030();
	}

	@ObfuscatedName("td.a(IIIILh;I)V")
	public static void minimapDrawDot(int arg0, int arg1, int arg2, Pix32 arg3, int arg4) {
		if (arg3 == null) {
			return;
		}
		int var5 = field493 + field3054 & 0x7FF;
		int var6 = arg4 * arg4 + arg2 * arg2;
		if (var6 > 6400) {
			return;
		}
		int var7 = Pix3D.sinTable[var5];
		int var8 = var7 * 256 / (field527 + 256);
		int var9 = Pix3D.cosTable[var5];
		int var10 = var9 * 256 / (field527 + 256);
		int var11 = var10 * arg2 - arg4 * var8 >> 16;
		int var12 = arg2 * var8 + var10 * arg4 >> 16;
		if (var6 <= 2500) {
			arg3.plotSprite(var12 + arg0 + 94 + 4 - arg3.owi / 2, arg1 + 83 + -var11 + (-(arg3.ohi / 2) - 4));
		} else {
			arg3.scanlinePlotSprite(field369, arg0 + var12 + 94 + 4 - arg3.owi / 2, -(arg3.ohi / 2) + 83 + (arg1 - var11) + -4);
		}
	}

	@ObfuscatedName("bd.d(I)V")
	public static void method65() {
		for (int var0 = 0; var0 < field2397; var0++) {
			int var1 = field313[var0];
			ClientNpc var2 = npcs[var1];
			if (var2 != null) {
				method227(var2.type.size, var2);
			}
		}
	}

	@ObfuscatedName("hd.a(ZI)Lec;")
	public static JagString method420(int arg0) {
		return arg0 < 999999999 ? JagString.parseInt(arg0) : field3640;
	}

	@ObfuscatedName("be.a(III)Z")
	public static boolean method69(int arg0, int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("ea.a(IIIIII)V")
	public static void method211(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = world.method1153(arg1, arg2, arg3);
		if (var5 != 0) {
			int var6 = world.method1121(arg1, arg2, arg3, var5);
			int var7 = var6 >> 6 & 0x3;
			int var8 = arg0;
			int var9 = var6 & 0x1F;
			if (var5 > 0) {
				var8 = arg4;
			}
			int[] var10 = minimap.data;
			int var11 = var5 >> 14 & 0x7FFF;
			int var12 = (52736 - arg3 * 512) * 4 + arg2 * 4 + 24624;
			LocType var13 = LocType.list(var11);
			if (var13.field1226 == -1) {
				if (var9 == 0 || var9 == 2) {
					if (var7 == 0) {
						var10[var12] = var8;
						var10[var12 + 512] = var8;
						var10[var12 + 1024] = var8;
						var10[var12 + 1536] = var8;
					} else if (var7 == 1) {
						var10[var12] = var8;
						var10[var12 + 1] = var8;
						var10[var12 + 2] = var8;
						var10[var12 + 3] = var8;
					} else if (var7 == 2) {
						var10[var12 + 3] = var8;
						var10[var12 + 512 + 3] = var8;
						var10[var12 + 1024 + 3] = var8;
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 3) {
						var10[var12 + 1536] = var8;
						var10[var12 + 1537] = var8;
						var10[var12 + 1536 + 2] = var8;
						var10[var12 + 3 + 1536] = var8;
					}
				}
				if (var9 == 3) {
					if (var7 == 0) {
						var10[var12] = var8;
					} else if (var7 == 1) {
						var10[var12 + 3] = var8;
					} else if (var7 == 2) {
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 3) {
						var10[var12 + 1536] = var8;
					}
				}
				if (var9 == 2) {
					if (var7 == 3) {
						var10[var12] = var8;
						var10[var12 + 512] = var8;
						var10[var12 + 1024] = var8;
						var10[var12 + 1536] = var8;
					} else if (var7 == 0) {
						var10[var12] = var8;
						var10[var12 + 1] = var8;
						var10[var12 + 2] = var8;
						var10[var12 + 3] = var8;
					} else if (var7 == 1) {
						var10[var12 + 3] = var8;
						var10[var12 + 515] = var8;
						var10[var12 + 1027] = var8;
						var10[var12 + 3 + 1536] = var8;
					} else if (var7 == 2) {
						var10[var12 + 1536] = var8;
						var10[var12 + 1 + 1536] = var8;
						var10[var12 + 1538] = var8;
						var10[var12 + 1539] = var8;
					}
				}
			} else {
				Pix8 var14 = mapscene[var13.field1226];
				if (var14 != null) {
					int var15 = (var13.width * 4 - var14.wi) / 2;
					int var16 = (var13.length * 4 - var14.hi) / 2;
					var14.plotSprite(var15 + arg2 * 4 + 48, var16 + (-var13.length + -arg3 + 104) * 4 + 48);
				}
			}
		}
		int var17 = world.method1133(arg1, arg2, arg3);
		if (var17 != 0) {
			int var18 = world.method1121(arg1, arg2, arg3, var17);
			int var19 = var18 >> 6 & 0x3;
			int var20 = var18 & 0x1F;
			int var21 = var17 >> 14 & 0x7FFF;
			LocType var22 = LocType.list(var21);
			if (var22.field1226 != -1) {
				Pix8 var23 = mapscene[var22.field1226];
				if (var23 != null) {
					int var24 = (var22.width * 4 - var23.wi) / 2;
					int var25 = (var22.length * 4 - var23.hi) / 2;
					var23.plotSprite(arg2 * 4 + var24 + 48, var25 + (-var22.length + -arg3 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = minimap.data;
				int var28 = arg2 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
				if (var17 > 0) {
					var26 = 15597568;
				}
				if (var19 == 0 || var19 == 2) {
					var27[var28 + 1536] = var26;
					var27[var28 + 1024 + 1] = var26;
					var27[var28 + 512 + 2] = var26;
					var27[var28 + 3] = var26;
				} else {
					var27[var28] = var26;
					var27[var28 + 1 + 512] = var26;
					var27[var28 + 2 + 1024] = var26;
					var27[var28 + 1539] = var26;
				}
			}
		}
		int var29 = world.method1134(arg1, arg2, arg3);
		if (var29 == 0) {
			return;
		}
		int var30 = var29 >> 14 & 0x7FFF;
		LocType var31 = LocType.list(var30);
		if (var31.field1226 == -1) {
			return;
		}
		Pix8 var32 = mapscene[var31.field1226];
		if (var32 != null) {
			int var33 = (var31.width * 4 - var32.wi) / 2;
			int var34 = (var31.length * 4 - var32.hi) / 2;
			var32.plotSprite(var33 + arg2 * 4 + 48, var34 + (-arg3 - var31.length + 104) * 4 + 48);
			return;
		}
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void mainloop() {
		loopCycle++;
		this.serviceNetClient();
		Js5NetThread.method466();
		MidiManager.updateFadeOut();
		doAudio();
		ClientKeyboardListener.cycle();
		ClientMouseListener.cycle();
		if (mouseWheel != null) {
			int var1 = mouseWheel.getRotation();
			mouseWheelRotation = var1;
		}
		if (state == 0) {
			mainLoad();
			GameShell.doneslowupdate();
		} else if (state == 5) {
			TitleScreen.loop(this);
			mainLoad();
			GameShell.doneslowupdate();
		} else if (state == 10) {
			TitleScreen.loop(this);
		} else if (state == 20) {
			TitleScreen.loop(this);
			loginPoll();
		} else if (state == 25) {
			mapBuildLoop();
		} else if (state == 30) {
			gameLoop();
		} else if (state == 40) {
			loginPoll();
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void js5connect() {
		if (Js5Net.crcErrorCount >= 4) {
			this.error("js5crc");
			state = 1000;
			return;
		}
		if (Js5Net.ioErrorCount >= 4) {
			if (state <= 5) {
				this.error("js5io");
				state = 1000;
				return;
			}
			js5ConnectCooldown = 3000;
			Js5Net.ioErrorCount = 3;
		}
		if (js5ConnectCooldown-- > 0) {
			return;
		}
		try {
			if (js5ConnectState == 0) {
				js5SocketReq = GameShell.signlink.socketreq(loginHost, loginPort);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (js5SocketReq.status == 2) {
					this.js5error(-1);
					return;
				}
				if (js5SocketReq.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				js5Stream = new ClientStream((Socket) js5SocketReq.result, GameShell.signlink);
				Packet var1 = new Packet(5);
				var1.p1(15);
				var1.p4(468);
				js5Stream.write(var1.data, 5);
				js5ConnectState++;
				js5ConnectTime = MonotonicTime.currentTime();
			}
			if (js5ConnectState == 3) {
				if (state <= 5 || js5Stream.available() > 0) {
					int var2 = js5Stream.read();
					if (var2 != 0) {
						this.js5error(var2);
						return;
					}
					js5ConnectState++;
				} else if (MonotonicTime.currentTime() - js5ConnectTime > 30000L) {
					this.js5error(-2);
					return;
				}
			}
			if (js5ConnectState == 4) {
				Js5Net.init(js5Stream, state > 20);
				js5ConnectState = 0;
				js5Stream = null;
				js5Errors = 0;
				js5SocketReq = null;
			}
		} catch (IOException var3) {
			this.js5error(-3);
		}
	}

	@ObfuscatedName("client.g(I)V")
	@Override
	public void mainredraw() {
		boolean var1 = MidiManager.updateLoading();
		if (var1 && playingJingle && midiPcmPlayer != null) {
			midiPcmPlayer.play();
		}
		if (canvasReplaceRecommended) {
			ClientKeyboardListener.removeListeners(GameShell.canvas);
			ClientMouseListener.removeListeners(GameShell.canvas);
			if (mouseWheel != null) {
				mouseWheel.removeListeners(GameShell.canvas);
			}
			this.addCanvas();
			ClientKeyboardListener.addListeners(GameShell.canvas);
			ClientMouseListener.addListeners(GameShell.canvas);
			if (mouseWheel != null) {
				mouseWheel.addListeners(GameShell.canvas);
			}
		}
		if (state == 0) {
			GameShell.drawProgress(TitleScreen.loadString, null, TitleScreen.loadPos);
		} else if (state == 5) {
			TitleScreen.draw(p11, b12);
		} else if (state == 10) {
			TitleScreen.draw(p11, b12);
		} else if (state == 20) {
			TitleScreen.draw(p11, b12);
		} else if (state == 25) {
			if (mapLoadState == 1) {
				if (mapLoadPrevCount < mapLoadCount) {
					mapLoadPrevCount = mapLoadCount;
				}
				int var3 = (mapLoadPrevCount - mapLoadCount) * 50 / mapLoadPrevCount;
				messageBox(JagString.join(new JagString[] {Text.LOADING, StringConstants.TAG_BREAK, JagString.parseInt(var3), AUTO_PCTCLOSE}), false);
			} else if (mapLoadState == 2) {
				if (locModelLoadCount > locModelLoadPrevCount) {
					locModelLoadPrevCount = locModelLoadCount;
				}
				int var2 = (locModelLoadPrevCount - locModelLoadCount) * 50 / locModelLoadPrevCount + 50;
				messageBox(JagString.join(new JagString[] {Text.LOADING, StringConstants.TAG_BREAK, JagString.parseInt(var2), AUTO_PCTCLOSE}), false);
			} else {
				messageBox(Text.LOADING, false);
			}
		} else if (state == 30) {
			gameDraw();
		} else if (state == 40) {
			messageBox(JagString.join(new JagString[] { Text.CONLOST, field3538, Text.ATTEMPT_TO_REESTABLISH}), false);
		}
		if (state == 30 && componentDrawMode == 0 && !fullredraw) {
			try {
				Graphics var4 = GameShell.canvas.getGraphics();
				for (int var5 = 0; var5 < componentDrawCount; var5++) {
					if (componentRedrawRequested2[var5]) {
						GameShell.drawArea.draw(var4, field512[var5], field366[var5], field3287[var5], field2892[var5]);
						componentRedrawRequested2[var5] = false;
					}
				}
			} catch (Exception var8) {
				GameShell.canvas.repaint();
			}
		} else if (state > 0) {
			try {
				Graphics var6 = GameShell.canvas.getGraphics();
				GameShell.drawArea.draw(var6);
				fullredraw = false;
				for (int var7 = 0; var7 < componentDrawCount; var7++) {
					componentRedrawRequested2[var7] = false;
				}
			} catch (Exception var9) {
				GameShell.canvas.repaint();
			}
		}
	}

	@ObfuscatedName("client.a(II)V")
	public void js5error(int arg0) {
		if (loginGamePort == loginPort) {
			loginPort = loginJs5Port;
		} else {
			loginPort = loginGamePort;
		}
		js5Errors++;
		js5ConnectState = 0;
		js5SocketReq = null;
		js5Stream = null;
		if (js5Errors >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (state <= 5) {
				this.error("js5connect_full");
				state = 1000;
			} else {
				js5ConnectCooldown = 3000;
			}
		} else if (js5Errors >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			state = 1000;
		} else if (js5Errors >= 4) {
			if (state > 5) {
				js5ConnectCooldown = 3000;
			} else {
				this.error("js5connect");
				state = 1000;
			}
		}
	}

	@ObfuscatedName("client.a(Z)V")
	@Override
	public void mainquit() {
		if (mouseTracking != null) {
			mouseTracking.active = false;
		}
		mouseTracking = null;
		if (stream != null) {
			stream.close();
			stream = null;
		}
		ClientKeyboardListener.shutdown();
		ClientMouseListener.shutdown();
		mouseWheel = null;
		if (midiPcmPlayer != null) {
			midiPcmPlayer.shutdown();
		}
		if (soundPcmPlayer != null) {
			soundPcmPlayer.shutdown();
		}
		Js5Net.closeStream();
		Js5NetThread.shutdown();
		try {
			if (GameShell.cacheDat != null) {
				GameShell.cacheDat.close();
			}
			if (GameShell.cacheIndex != null) {
				for (int var1 = 0; var1 < GameShell.cacheIndex.length; var1++) {
					if (GameShell.cacheIndex[var1] != null) {
						GameShell.cacheIndex[var1].close();
					}
				}
			}
			if (GameShell.masterIndex != null) {
				GameShell.masterIndex.close();
			}
			if (GameShell.uidDat != null) {
				GameShell.uidDat.close();
			}
		} catch (IOException var2) {
		}
	}

	@ObfuscatedName("client.a(B)V")
	@Override
	public void maininit() {
		loginJs5Port = modewhere == 0 ? 443 : worldid + 50000;
		if (modegame == 1) {
			PlayerModel.recol2d = RecolsStellardawn.recol2d;
			PlayerModel.recol1d = RecolsStellardawn.recol1d;
			PlayerModel.recol2s = RecolsStellardawn.recol2s;
			PlayerModel.recol1s = RecolsStellardawn.recol1s;
		} else {
			PlayerModel.recol2d = RecolsRunescape.recol2d;
			PlayerModel.recol2s = RecolsRunescape.recol2s;
			PlayerModel.recol1d = RecolsRunescape.recol1d;
			PlayerModel.recol1s = RecolsRunescape.recol1s;
		}
		loginGamePort = modewhere == 0 ? 43594 : worldid + 40000;
		loginPort = loginGamePort;
		ClientKeyboardListener.setupKeyCodeMap();
		ClientKeyboardListener.addListeners(GameShell.canvas);
		ClientMouseListener.addListeners(GameShell.canvas);
		mouseWheel = MouseWheelInterface.getProvider();
		if (mouseWheel != null) {
			mouseWheel.addListeners(GameShell.canvas);
		}
		field1647 = SignLink.field465;
		try {
			if (GameShell.signlink.field454 != null) {
				GameShell.cacheDat = new BufferedRandomAccessFile(GameShell.signlink.field454, 5200, 0);
				for (int var1 = 0; var1 < 16; var1++) {
					GameShell.cacheIndex[var1] = new BufferedRandomAccessFile(GameShell.signlink.field455[var1], 6000, 0);
				}
				GameShell.masterIndex = new BufferedRandomAccessFile(GameShell.signlink.field460, 6000, 0);
				GameShell.field3032 = new DataFile(255, GameShell.cacheDat, GameShell.masterIndex, 500000);
				GameShell.uidDat = new BufferedRandomAccessFile(GameShell.signlink.field468, 24, 0);
				GameShell.signlink.field460 = null;
				GameShell.signlink.field454 = null;
				GameShell.signlink.field455 = null;
				GameShell.signlink.field468 = null;
			}
		} catch (IOException var2) {
			GameShell.cacheDat = null;
			GameShell.field3032 = null;
			GameShell.masterIndex = null;
			GameShell.uidDat = null;
		}
		if (modewhere != 0) {
			showFps = true;
		}
	}

	@Override
	public void init() {
		if (!this.checkhost()) {
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
			field1784 = field490;
		}
		String var4 = this.getParameter("game");
		if (var4 != null && var4.equals("1")) {
			modegame = 1;
		} else {
			modegame = 0;
		}
		try {
			js = Integer.parseInt(this.getParameter("js"));
			plug = Integer.parseInt(this.getParameter("plug"));
		} catch (Exception var5) {
		}
		loginHost = this.getCodeBase().getHost();
		this.startCommon(modewhat + 32);
	}

	@ObfuscatedName("client.d(Z)V")
	public void serviceNetClient() {
		if (state != 1000) {
			boolean var1 = Js5Net.loop();
			if (!var1) {
				this.js5connect();
			}
		}
	}
}
