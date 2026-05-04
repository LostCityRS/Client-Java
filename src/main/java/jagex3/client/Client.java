package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5Net;
import jagex3.js5.Js5NetThread;
import jagex3.jstring.JagString;
import jagex3.midi2.MidiManager;
import jagex3.midi2.MidiPlayer;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.MonotonicTime;
import jagex3.var.VarCache;
import jagex3.wordfilter2.Huffman;
import jagex3.wordfilter2.WordPack;

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.GregorianCalendar;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("pc.n")
	public static final CollisionMap[] collision = new CollisionMap[4];
	@ObfuscatedName("nd.u")
	public static final PacketBit out = new PacketBit(5000);
	@ObfuscatedName("va.v")
	public static final PacketBit in = new PacketBit(5000);
	@ObfuscatedName("ch.g")
	public static final PacketBit loginout = new PacketBit(5000);
	@ObfuscatedName("ae.Ob")
	public static final int[] field75 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	@ObfuscatedName("hd.o")
	public static final int[] field1455 = new int[100];
	@ObfuscatedName("ma.ab")
	public static final int[] field2471 = new int[100];
	@ObfuscatedName("mb.V")
	public static final int[] field2485 = new int[100];
	@ObfuscatedName("hc.Z")
	public static final int[] field1447 = new int[100];
	@ObfuscatedName("td.cb")
	public static final boolean[] field4005 = new boolean[100];
	@ObfuscatedName("eh.B")
	public static final short[] field994 = new short[500];
	@ObfuscatedName("fj.e")
	public static final JagString[] field1191 = new JagString[500];
	@ObfuscatedName("se.e")
	public static final JagString[] field3836 = new JagString[500];
	@ObfuscatedName("q.Kb")
	public static final JagString field3453 = JagString.wrap("");
	@ObfuscatedName("ug.k")
	public static final boolean[] field4228 = new boolean[100];
	@ObfuscatedName("kd.X")
	public static final boolean[] field2043 = new boolean[100];
	@ObfuscatedName("fb.hb")
	public static final BigInteger field1098 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("re.g")
	public static final int[][] field3673 = new int[104][104];
	@ObfuscatedName("uj.a")
	public static final int[][] field4267 = new int[104][104];
	@ObfuscatedName("l.kb")
	public static final int[] field2203 = new int[4096];
	@ObfuscatedName("ij.E")
	public static final int[] field1781 = new int[4096];
	@ObfuscatedName("ei.e")
	public static final Packet field1006 = new Packet(new byte[5000]);
	@ObfuscatedName("ci.o")
	public static final BigInteger field515 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("ri.S")
	public static final int[] field3708 = new int[100];
	@ObfuscatedName("la.b")
	public static final JagString[] field2206 = new JagString[100];
	@ObfuscatedName("te.ab")
	public static final JagString[] field4019 = new JagString[100];
	@ObfuscatedName("uj.n")
	public static final JagString[] field4280 = new JagString[100];
	@ObfuscatedName("mb.T")
	public static final int[] field2483 = new int[100];
	@ObfuscatedName("ng.Mb")
	public static final JagString field2895 = JagString.wrap("(U");
	@ObfuscatedName("kf.j")
	public static final JagString field2080 = JagString.wrap("(U1");
	@ObfuscatedName("pc.c")
	public static final JagString field3189 = JagString.wrap("(U2");
	@ObfuscatedName("bf.y")
	public static final JagString field289 = JagString.wrap("(U3");
	@ObfuscatedName("jd.e")
	public static final JagString field1848 = JagString.wrap("(U4");
	@ObfuscatedName("mc.h")
	public static final JagString field2499 = JagString.wrap("(U5");
	@ObfuscatedName("rc.G")
	public static final JagString field3646 = JagString.wrap("(Udns");
	@ObfuscatedName("ih.f")
	public static final long[] field1764 = new long[100];
	@ObfuscatedName("nd.o")
	public static final JagString[] field2741 = new JagString[100];
	@ObfuscatedName("fc.m")
	public static final JagString field1118 = JagString.wrap("zap");
	@ObfuscatedName("qf.Y")
	public static final JagString field3577 = JagString.wrap("unzap");
	@ObfuscatedName("mh.X")
	public static final int[] field2579 = new int[2048];
	@ObfuscatedName("eh.G")
	public static final int[] field999 = new int[1000];
	@ObfuscatedName("we.B")
	public static final ClientPlayer[] field4491 = new ClientPlayer[2048];
	@ObfuscatedName("q.lb")
	public static final int[] field3428 = new int[2048];
	@ObfuscatedName("h.S")
	public static final Packet[] field1397 = new Packet[2048];
	@ObfuscatedName("ug.f")
	public static final ClientNpc[] field4223 = new ClientNpc[32768];
	@ObfuscatedName("mc.f")
	public static final LinkList[][][] field2497 = new LinkList[4][104][104];
	@ObfuscatedName("dh.f")
	public static final LinkList field714 = new LinkList();
	@ObfuscatedName("pd.ib")
	public static final LinkList field3220 = new LinkList();
	@ObfuscatedName("pb.F")
	public static final int[] field3176 = new int[500];
	@ObfuscatedName("tj.f")
	public static final int[] field4060 = new int[500];
	@ObfuscatedName("gh.w")
	public static final long[] field1352 = new long[500];
	@ObfuscatedName("ah.L")
	public static final StockMarketSlot[] field140 = new StockMarketSlot[6];
	@ObfuscatedName("cb.b")
	public static final int[] field397 = new int[50];
	@ObfuscatedName("ka.l")
	public static final int[] field2016 = new int[50];
	@ObfuscatedName("ag.b")
	public static final int[] field116 = new int[50];
	@ObfuscatedName("vh.N")
	public static final JagFX[] field4417 = new JagFX[50];
	@ObfuscatedName("nc.m")
	public static final int[] field2726 = new int[50];
	@ObfuscatedName("kf.p")
	public static final long[] field2086 = new long[200];
	@ObfuscatedName("ha.G")
	public static final JagString field1421 = JagString.wrap("::gc");
	@ObfuscatedName("aj.V")
	public static final JagString field156 = JagString.wrap("::clientdrop");
	@ObfuscatedName("wi.q")
	public static final JagString field4547 = JagString.wrap("::fpson");
	@ObfuscatedName("d.W")
	public static final JagString field583 = JagString.wrap("::fpsoff");
	@ObfuscatedName("dj.Rb")
	public static final JagString field751 = JagString.wrap("::autoshadow on");
	@ObfuscatedName("a.f")
	public static final JagString field6 = JagString.wrap("::autoshadow off");
	@ObfuscatedName("pi.V")
	public static final JagString field3337 = JagString.wrap("::noclip");
	@ObfuscatedName("uh.U")
	public static final JagString field4249 = JagString.wrap("::fps ");
	@ObfuscatedName("bj.qb")
	public static final JagString field344 = JagString.wrap("::errortest");
	@ObfuscatedName("fb.mb")
	public static final JagString field1103 = JagString.wrap("::rect_debug");
	@ObfuscatedName("jh.j")
	public static final JagString field1930 = JagString.wrap("::qa_op_test");
	@ObfuscatedName("client.bb")
	public static int field569 = -1;

	@ObfuscatedName("client.cb")
	public static final JagString field570 = JagString.wrap("underlay)3dat");

	@ObfuscatedName("client.T")
	public static final JagString field561 = JagString.wrap("titlebox");

	@ObfuscatedName("client.V")
	public static int field563 = 0;

	@ObfuscatedName("ce.Y")
	public static int worldid = 1;
	@ObfuscatedName("kf.a")
	public static int modewhere = 0;
	@ObfuscatedName("mh.cb")
	public static int modewhat = 0;
	@ObfuscatedName("g.m")
	public static boolean memServer = false;
	@ObfuscatedName("lf.nb")
	public static int lang = 0;
	@ObfuscatedName("eb.R")
	public static int game = 0;
	@ObfuscatedName("gd.A")
	public static int js = 1;
	@ObfuscatedName("na.Z")
	public static int plug = 0;
	@ObfuscatedName("ac.D")
	public static int affid = 0;
	@ObfuscatedName("ci.s")
	public static int loadingStep = 0;
	@ObfuscatedName("g.b")
	public static Js5Loader anims;
	@ObfuscatedName("ue.i")
	public static Js5Loader bases;
	@ObfuscatedName("hh.gb")
	public static Js5Loader configs;
	@ObfuscatedName("ia.j")
	public static Js5Loader interfaces;
	@ObfuscatedName("b.e")
	public static Js5Loader jagFX;
	@ObfuscatedName("cd.a")
	public static Js5Loader maps;
	@ObfuscatedName("ja.m")
	public static Js5Loader songs;
	@ObfuscatedName("vd.a")
	public static Js5Loader models;
	@ObfuscatedName("uh.O")
	public static Js5Loader sprites;
	@ObfuscatedName("fj.g")
	public static Js5Loader textures;
	@ObfuscatedName("ah.H")
	public static Js5Loader binary;
	@ObfuscatedName("mb.W")
	public static Js5Loader jingles;
	@ObfuscatedName("bf.K")
	public static Js5Loader scripts;
	@ObfuscatedName("j.b")
	public static Js5Loader fontmetrics;
	@ObfuscatedName("bf.p")
	public static Js5Loader vorbis;
	@ObfuscatedName("ne.i")
	public static Js5Loader patches;
	@ObfuscatedName("k.xb")
	public static Js5Loader configLoc;
	@ObfuscatedName("re.f")
	public static Js5Loader configEnum;
	@ObfuscatedName("oi.o")
	public static Js5Loader configNpc;
	@ObfuscatedName("wi.t")
	public static Js5Loader configObj;
	@ObfuscatedName("s.lb")
	public static Js5Loader configSeq;
	@ObfuscatedName("be.y")
	public static Js5Loader configSpot;
	@ObfuscatedName("vi.g")
	public static Js5Loader configVarbit;
	@ObfuscatedName("lj.m")
	public static Js5Loader worldmap;
	@ObfuscatedName("bh.O")
	public static Js5Loader quickchat;
	@ObfuscatedName("sg.w")
	public static Js5Loader quickchatGlobal;
	@ObfuscatedName("oc.w")
	public static Js5Loader materials;
	@ObfuscatedName("v.E")
	public static int state = 0;
	@ObfuscatedName("kh.M")
	public static int loginStep = 0;
	@ObfuscatedName("ae.Kb")
	public static int loginWaitingTime = 0;
	@ObfuscatedName("s.Y")
	public static int loginFailCount = 0;
	@ObfuscatedName("ia.e")
	public static ClientStream prevStream;
	@ObfuscatedName("kd.Z")
	public static int field2045 = 0;
	@ObfuscatedName("sg.n")
	public static int field3861 = 0;
	@ObfuscatedName("nd.y")
	public static int field2751 = 1;
	@ObfuscatedName("na.U")
	public static int field2652 = 1;
	@ObfuscatedName("s.U")
	public static int field3754 = 0;
	@ObfuscatedName("cj.hb")
	public static ClientStream stream;
	@ObfuscatedName("cj.F")
	public static long loginSeed = 0L;
	@ObfuscatedName("fb.gb")
	public static boolean networkError = false;
	@ObfuscatedName("j.h")
	public static PrivilegedRequest loginSocketReq;
	@ObfuscatedName("ub.Y")
	public static int loginGamePort;
	@ObfuscatedName("pe.L")
	public static int loginPort;
	@ObfuscatedName("ed.a")
	public static int loginJs5Port;
	@ObfuscatedName("cd.h")
	public static PcmPlayer midiPlayer;
	@ObfuscatedName("ke.F")
	public static PcmPlayer synthPlayer;
	@ObfuscatedName("uh.T")
	public static Mixer mixer;
	@ObfuscatedName("kh.U")
	public static Decimator decimator;
	@ObfuscatedName("wf.b")
	public static boolean lowMem = false;
	@ObfuscatedName("ae.Lb")
	public static int membersAccount = 0;
	@ObfuscatedName("sj.f")
	public static int field3923 = 0;
	@ObfuscatedName("kh.I")
	public static int field2113 = 0;
	@ObfuscatedName("qe.n")
	public static IfType field3568 = null;
	@ObfuscatedName("pa.d")
	public static int js5ConnectCooldown = 0;
	@ObfuscatedName("we.D")
	public static int js5ConnectState = 0;
	@ObfuscatedName("uj.d")
	public static int psize = 0;
	@ObfuscatedName("jj.z")
	public static boolean field1958 = false;
	@ObfuscatedName("sg.o")
	public static int field3862 = 0;
	@ObfuscatedName("di.R")
	public static int field723 = -1;
	@ObfuscatedName("ug.l")
	public static IfType field4229;
	@ObfuscatedName("fb.kb")
	public static int field1101 = -1;
	@ObfuscatedName("ka.n")
	public static int field2018 = -2;
	@ObfuscatedName("mb.X")
	public static int field2487 = -1;
	@ObfuscatedName("mc.l")
	public static int field2503 = 0;
	@ObfuscatedName("wa.d")
	public static ClientPlayer localPlayer;
	@ObfuscatedName("ue.s")
	public static int field4211 = 127;
	@ObfuscatedName("be.l")
	public static int field261 = 0;
	@ObfuscatedName("l.T")
	public static int field2186 = 0;
	@ObfuscatedName("ka.h")
	public static boolean field2012 = false;
	@ObfuscatedName("ed.g")
	public static PixfontGeneric field917;
	@ObfuscatedName("ei.j")
	public static PixfontGeneric field1011;
	@ObfuscatedName("g.f")
	public static int staffmodlevel = 0;
	@ObfuscatedName("vi.f")
	public static int ptype = 0;
	@ObfuscatedName("ua.m")
	public static MouseTracking field4143;
	@ObfuscatedName("pd.kb")
	public static MouseWheelInterface mouseWheel;
	@ObfuscatedName("ff.fb")
	public static PrivilegedRequest field1151;
	@ObfuscatedName("kj.h")
	public static int js5Errors = 0;
	@ObfuscatedName("re.n")
	public static ClientStream field3680;
	@ObfuscatedName("af.D")
	public static short[][] field96;
	@ObfuscatedName("hj.M")
	public static short[][] field1596;
	@ObfuscatedName("nd.x")
	public static short[] field2750;
	@ObfuscatedName("bb.m")
	public static short[] field219;
	@ObfuscatedName("ub.gb")
	public static int selfSlot = -1;
	@ObfuscatedName("mi.X")
	public static int mapBuildCentreZoneX;
	@ObfuscatedName("vh.U")
	public static int loginHopTimer = 0;
	@ObfuscatedName("af.I")
	public static int field100 = 0;
	@ObfuscatedName("g.i")
	public static int field1211 = 1;
	@ObfuscatedName("d.V")
	public static int field582 = 0;
	@ObfuscatedName("wh.E")
	public static int minimapState = 0;
	@ObfuscatedName("eg.y")
	public static int field943 = 0;
	@ObfuscatedName("t.r")
	public static int field3930 = 0;
	@ObfuscatedName("ed.b")
	public static PrivilegedRequest field912;
	@ObfuscatedName("kg.eb")
	public static int field2102 = 0;
	@ObfuscatedName("mi.W")
	public static int field2594 = 0;
	@ObfuscatedName("db.z")
	public static long field631;
	@ObfuscatedName("pd.lb")
	public static DataFile field3223;
	@ObfuscatedName("nf.E")
	public static boolean field2768 = false;
	@ObfuscatedName("cb.f")
	public static int field401 = -1;
	@ObfuscatedName("cj.S")
	public static int field541 = -1;
	@ObfuscatedName("qj.Y")
	public static int field3608;
	@ObfuscatedName("hb.U")
	public static int field1428;
	@ObfuscatedName("jj.v")
	public static int field1954;
	@ObfuscatedName("t.v")
	public static int field3934;
	@ObfuscatedName("pg.G")
	public static int field3257;
	@ObfuscatedName("ng.Yb")
	public static int field2907;
	@ObfuscatedName("ob.c")
	public static SoftwarePixFont field2966;
	@ObfuscatedName("ea.N")
	public static int field821 = 0;
	@ObfuscatedName("i.J")
	public static int field1634 = 0;
	@ObfuscatedName("g.s")
	public static int field1221 = 0;
	@ObfuscatedName("bh.F")
	public static int field313 = 0;
	@ObfuscatedName("kg.fb")
	public static boolean field2103 = false;
	@ObfuscatedName("ih.b")
	public static String field1760;
	@ObfuscatedName("jc.P")
	public static long field1840;
	@ObfuscatedName("cf.c")
	public static int mouseTracked = 0;
	@ObfuscatedName("vi.d")
	public static int field4428 = 0;
	@ObfuscatedName("qb.F")
	public static int field3535 = 0;
	@ObfuscatedName("fa.S")
	public static boolean field1077 = false;
	@ObfuscatedName("ue.d")
	public static int field4196 = 0;
	@ObfuscatedName("rg.H")
	public static int field3702 = 0;
	@ObfuscatedName("ej.n")
	public static int field1027 = 0;
	@ObfuscatedName("oe.j")
	public static int field3026 = 0;
	@ObfuscatedName("ka.j")
	public static int field2014;
	@ObfuscatedName("ue.t")
	public static int field4212;
	@ObfuscatedName("re.m")
	public static int field3679;
	@ObfuscatedName("ff.U")
	public static LinkList field1140 = new LinkList();
	@ObfuscatedName("pi.U")
	public static int field3336 = -1;
	@ObfuscatedName("qe.m")
	public static boolean field3567 = false;
	@ObfuscatedName("q.Cb")
	public static int field3445 = 0;
	@ObfuscatedName("ui.J")
	public static int field4256;
	@ObfuscatedName("cf.k")
	public static boolean field487 = false;
	@ObfuscatedName("ng.Wb")
	public static boolean field2905 = false;
	@ObfuscatedName("lg.x")
	public static int field2371 = -1;
	@ObfuscatedName("nf.bb")
	public static int field2791 = 0;
	@ObfuscatedName("t.C")
	public static int field3941 = 0;
	@ObfuscatedName("ce.U")
	public static int field466 = -1;
	@ObfuscatedName("ed.m")
	public static IfType field923 = null;
	@ObfuscatedName("md.S")
	public static int field2506 = -1;
	@ObfuscatedName("bb.b")
	public static int field208 = -1;
	@ObfuscatedName("sg.t")
	public static boolean field3867 = false;
	@ObfuscatedName("lb.j")
	public static IfType field2217 = null;
	@ObfuscatedName("sg.l")
	public static int field3859 = 0;
	@ObfuscatedName("ne.f")
	public static int field2757 = 0;
	@ObfuscatedName("oe.a")
	public static int field3017 = 0;
	@ObfuscatedName("e.mb")
	public static int field796 = 0;
	@ObfuscatedName("oc.z")
	public static int field2997 = 0;
	@ObfuscatedName("fa.gb")
	public static IfType field1091;
	@ObfuscatedName("mh.R")
	public static int field2573 = 0;
	@ObfuscatedName("ie.h")
	public static int field1742 = 0;
	@ObfuscatedName("ce.db")
	public static int field475 = 0;
	@ObfuscatedName("tb.j")
	public static int field3965;
	@ObfuscatedName("ec.Q")
	public static int field905;
	@ObfuscatedName("fb.ob")
	public static int field1105;
	@ObfuscatedName("ha.z")
	public static JagString field1414 = null;
	@ObfuscatedName("eb.S")
	public static int field885;
	@ObfuscatedName("i.X")
	public static ClanChannelUser[] field1647;
	@ObfuscatedName("na.y")
	public static byte field2631;
	@ObfuscatedName("kh.X")
	public static int field2127 = 0;
	@ObfuscatedName("kj.u")
	public static int field2172 = 127;
	@ObfuscatedName("a.i")
	public static boolean field9 = false;
	@ObfuscatedName("lf.X")
	public static int field2332 = 0;
	@ObfuscatedName("ib.C")
	public static int field1708 = 0;
	@ObfuscatedName("hh.R")
	public static int field1531 = 0;
	@ObfuscatedName("ej.i")
	public static int field1022 = 0;
	@ObfuscatedName("dc.e")
	public static int field666;
	@ObfuscatedName("ue.g")
	public static int field4199 = 0;
	@ObfuscatedName("fh.q")
	public static int field1173 = 128;
	@ObfuscatedName("vd.b")
	public static int field4366;
	@ObfuscatedName("cj.N")
	public static int field536 = 0;
	@ObfuscatedName("qa.j")
	public static int field3528 = 3;
	@ObfuscatedName("mf.p")
	public static int field2548 = 0;
	@ObfuscatedName("oc.t")
	public static int field2991 = 0;
	@ObfuscatedName("nd.c")
	public static int field2729 = 0;
	@ObfuscatedName("jg.J")
	public static int field1910 = 0;
	@ObfuscatedName("lh.Q")
	public static HashTable field2395 = new HashTable(8);
	@ObfuscatedName("eh.a")
	public static IfType field967 = null;
	@ObfuscatedName("eb.U")
	public static Pix32 field887;
	@ObfuscatedName("wa.h")
	public static SoftwarePix8[] field4460;
	@ObfuscatedName("ch.k")
	public static SoftwarePix32[] field505;
	@ObfuscatedName("nc.e")
	public static Pix32[] field2718;
	@ObfuscatedName("vi.a")
	public static Pix32[] field4425;
	@ObfuscatedName("lj.a")
	public static Pix32[] field2428;
	@ObfuscatedName("qb.P")
	public static Pix32[] field3543;
	@ObfuscatedName("ui.K")
	public static Pix32[] field4257;
	@ObfuscatedName("kd.V")
	public static Pix32[] field2041;
	@ObfuscatedName("sd.o")
	public static Pix32 field3826;
	@ObfuscatedName("ob.s")
	public static Pix32[] field2982;
	@ObfuscatedName("da.S")
	public static Pix32[] field597;
	@ObfuscatedName("af.P")
	public static Pix8[] field106;
	@ObfuscatedName("d.ab")
	public static Pix8[] field587;
	@ObfuscatedName("ab.e")
	public static PixfontGeneric field30;
	@ObfuscatedName("wh.T")
	public static Pix32[] field4525;
	@ObfuscatedName("nb.V")
	public static int field2707 = 0;
	@ObfuscatedName("hi.a")
	public static int field1549;
	@ObfuscatedName("eb.W")
	public static int field889;
	@ObfuscatedName("vh.R")
	public static int field4421;
	@ObfuscatedName("ve.Z")
	public static int field4383;

	@ObfuscatedName("client.a(IIIIIII)V")
	public static void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (Statics.field1207 <= arg5 - arg0 && Statics.field183 >= arg5 + arg0 && Statics.field919 <= arg3 - arg0 && Statics.field279 >= arg0 + arg3) {
			Statics.method46(arg1, arg5, arg2, arg0, arg3, arg4);
		} else {
			Statics.method827(arg1, arg3, arg2, arg0, arg5, arg4);
		}
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 7) {
				errorUsage(false);
			}
			worldid = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				modewhere = 0;
			} else if (arg0[1].equals("office")) {
				modewhere = 1;
			} else if (arg0[1].equals("local")) {
				modewhere = 2;
			} else {
				errorUsage(false);
			}
			if (arg0[2].equals("live")) {
				modewhat = 0;
			} else if (arg0[2].equals("rc")) {
				modewhat = 1;
			} else if (arg0[2].equals("wip")) {
				modewhat = 2;
			} else {
				errorUsage(false);
			}
			if (arg0[3].equals("lowmem")) {
				setLowMem();
			} else if (arg0[3].equals("highmem")) {
				setHighMem();
			} else {
				errorUsage(false);
			}
			if (arg0[4].equals("free")) {
				memServer = false;
			} else if (arg0[4].equals("members")) {
				memServer = true;
			} else {
				errorUsage(false);
			}
			if (arg0[5].equals("english")) {
				lang = 0;
			} else if (arg0[5].equals("german")) {
				TextGerman.swapGerman();
				lang = 1;
			} else {
				errorUsage(false);
			}
			if (arg0[6].equals("game0")) {
				game = 0;
			} else if (arg0[6].equals("game1")) {
				game = 1;
			} else {
				errorUsage(false);
			}
			affid = 0;
			Statics.field4134 = field3453;
			field1760 = "127.0.0.1";
			Client var1 = new Client();
			var1.startApplication(27, 503, 765, 500, modewhat + 32, "runescape");
			GameShell.frame.setLocation(40, 40);
		} catch (Exception var3) {
			JagException.report(null, var3);
		}
	}

	@ObfuscatedName("client.a(Li;ZI)V")
	public static void messageBox(JagString arg0, boolean arg1) {
		int var2 = field30.method156(arg0, 250);
		int var3 = field30.method163(arg0, 250) * 13;
		Pix2D.method478(6, 6, var2 + 4 + 4, 4 + 4 + var3, 0);
		Pix2D.method476(6, 6, var2 + 4 + 4, 4 + 4 + var3, 16777215);
		field30.method153(arg0, 10, 10, var2, var3, 16777215, -1, 1, 1, 0);
		method861(var3 + 4 + 4, var2 - -4 + 4, 6, 6);
		if (!arg1) {
			method874(10, var3, var2, 10);
			return;
		}
		Canvas var4 = GameShell.canvas;
		try {
			Graphics var5 = var4.getGraphics();
			GameShell.field3852.method246(var5);
		} catch (Exception var6) {
			var4.repaint();
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public static void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = Statics.method1058(Statics.field919, Statics.field279, arg1);
		int var6 = Statics.method1058(Statics.field919, Statics.field279, arg2);
		int var7 = Statics.method1058(Statics.field1207, Statics.field183, arg3);
		int var8 = Statics.method1058(Statics.field1207, Statics.field183, arg4);
		for (int var9 = var5; var9 <= var6; var9++) {
			Statics.method1534(var7, arg0, var8, Statics.field42[var9]);
		}
	}

	@ObfuscatedName("ke.b(Z)V")
	public static void errorUsage(boolean arg0) {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		if (arg0) {
			Statics.method782(-33);
		}
	}

	@ObfuscatedName("fh.a(B)V")
	public static void setLowMem() {
		lowMem = true;
		World.field1882 = true;
	}

	@ObfuscatedName("fh.b(I)V")
	public static void setHighMem() {
		lowMem = false;
		World.field1882 = false;
	}

	@ObfuscatedName("j.a(BIZZZ)Lbj;")
	public static Js5Loader openJs5(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (GameShell.field299 != null) {
			var4 = new DataFile(arg0, GameShell.field299, GameShell.field4504[arg0], 1000000);
		}
		return new Js5Loader(var4, field3223, arg0, arg3, arg2, arg1);
	}

	@ObfuscatedName("oi.a(Li;Lq;I)Li;")
	public static JagString method1084(JagString arg0, IfType arg1) {
		if (arg0.method617(field2895) == -1) {
			return arg0;
		}
		while (true) {
			int var2 = arg0.method617(field2080);
			if (var2 == -1) {
				while (true) {
					int var3 = arg0.method617(field3189);
					if (var3 == -1) {
						while (true) {
							int var4 = arg0.method617(field289);
							if (var4 == -1) {
								while (true) {
									int var5 = arg0.method617(field1848);
									if (var5 == -1) {
										while (true) {
											int var6 = arg0.method617(field2499);
											if (var6 == -1) {
												while (true) {
													int var7 = arg0.method617(field3646);
													if (var7 == -1) {
														return arg0;
													}
													JagString var8 = field3453;
													if (field912 != null) {
														var8 = JagString.method926(field912.field3132);
														try {
															if (field912.field3129 != null) {
																byte[] var9 = ((String) field912.field3129).getBytes("ISO-8859-1");
																var8 = JagString.method395(0, var9, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg0 = JagString.join(new JagString[] { arg0.method623(0, var7), var8, arg0.method635(var7 + 4) });
												}
											}
											arg0 = JagString.join(new JagString[] { arg0.method623(0, var6), method1442(method761(4, arg1)), arg0.method635(var6 + 2) });
										}
									}
									arg0 = JagString.join(new JagString[] { arg0.method623(0, var5), method1442(method761(3, arg1)), arg0.method635(var5 + 2) });
								}
							}
							arg0 = JagString.join(new JagString[] { arg0.method623(0, var4), method1442(method761(2, arg1)), arg0.method635(var4 + 2) });
						}
					}
					arg0 = JagString.join(new JagString[] { arg0.method623(0, var3), method1442(method761(1, arg1)), arg0.method635(var3 + 2) });
				}
			}
			arg0 = JagString.join(new JagString[] { arg0.method623(0, var2), method1442(method761(0, arg1)), arg0.method635(var2 + 2) });
		}
	}

	@ObfuscatedName("wi.a(I[I[III)V")
	public static void method1611(int arg0, int[] arg1, int[] arg2, int arg3) {
		int var4 = arg3;
		if (arg3 > 25) {
			var4 = 25;
		}
		arg3--;
		int var5 = arg2[arg3];
		int var6 = arg1[arg3];
		if (arg0 == 0) {
			out.method30(200);
			out.p1(var4 + var4 + 3);
		}
		if (arg0 == 1) {
			out.method30(199);
			out.p1(var4 + var4 + 17);
		}
		if (arg0 == 2) {
			out.method30(159);
			out.p1(var4 + var4 + 3);
		}
		out.method305(var5 + field3679);
		out.method297(ClientKeyboardListener.field4511[82] ? 1 : 0);
		field2102 = arg1[0];
		field2594 = arg2[0];
		for (int var7 = 1; var7 < var4; var7++) {
			arg3--;
			out.method327(arg1[arg3] - var6);
			out.method297(arg2[arg3] - var5);
		}
		out.method331(var6 + field4212);
	}

	@ObfuscatedName("wi.e(B)V")
	public static void method1621() {
		out.method30(58);
		out.p8(0L);
	}

	@ObfuscatedName("m.a(II)V")
	public static void setMainState(int arg0) {
		if (arg0 == state) {
			return;
		}
		if (state == 0) {
			GameShell.resetProgress();
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
			field2045 = 0;
			field3861 = 0;
			field2751 = 1;
			field2652 = 1;
			field3754 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			TitleScreen.open(binary, GameShell.canvas, sprites);
		} else {
			TitleScreen.close();
		}
		state = arg0;
	}

	@ObfuscatedName("qb.d(B)V")
	public static void loginPoll() {
		try {
			if (loginStep == 0) {
				if (stream != null) {
					stream.close();
					stream = null;
				}
				loginWaitingTime = 0;
				loginStep = 1;
				networkError = false;
				loginSocketReq = null;
			}
			if (loginStep == 1) {
				if (loginSocketReq == null) {
					loginSocketReq = signlink.socketreq(field1760, loginPort);
				}
				if (loginSocketReq.status == 2) {
					throw new IOException();
				}
				if (loginSocketReq.status == 1) {
					stream = new ClientStream((Socket) loginSocketReq.field3129, signlink);
					loginStep = 2;
					loginSocketReq = null;
				}
			}
			if (loginStep == 2) {
				long var0 = field631 = TitleScreen.loginUser.toUserhash();
				out.pos = 0;
				out.p1(14);
				int var2 = (int) (var0 >> 16 & 0x1FL);
				out.p1(var2);
				stream.write(2, out.data);
				loginStep = 3;
				in.pos = 0;
			}
			if (loginStep == 3) {
				if (midiPlayer != null) {
					midiPlayer.method403();
				}
				if (synthPlayer != null) {
					synthPlayer.method403();
				}
				int var3 = stream.read();
				if (midiPlayer != null) {
					midiPlayer.method403();
				}
				if (synthPlayer != null) {
					synthPlayer.method403();
				}
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
					if (8 - in.pos < var4) {
						var4 = 8 - in.pos;
					}
					if (var4 > 0) {
						stream.read(in.pos, in.data, var4);
						in.pos += var4;
					}
				}
				if (in.pos == 8) {
					in.pos = 0;
					loginSeed = in.g8();
					loginStep = 5;
				}
			}
			if (loginStep == 5) {
				out.pos = 0;
				int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (loginSeed >> 32), (int) loginSeed};
				out.p1(10);
				out.p4(var5[0]);
				out.p4(var5[1]);
				out.p4(var5[2]);
				out.p4(var5[3]);
				out.p8(TitleScreen.loginUser.toUserhash());
				out.pjstr(TitleScreen.loginPass);
				out.rsaenc(field515, field1098);
				loginout.pos = 0;
				if (state == 40) {
					loginout.p1(18);
				} else {
					loginout.p1(16);
				}
				loginout.p1(out.pos + Packet.pjstrlen(Statics.field4134) + 141);
				loginout.p4(500);
				loginout.p1(lowMem ? 1 : 0);
				GameShell.pushUID192(loginout);
				loginout.pjstr(Statics.field4134);
				loginout.p4(affid);
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
				loginout.p4(fontmetrics.crc);
				loginout.p4(vorbis.crc);
				loginout.p4(patches.crc);
				loginout.p4(configLoc.crc);
				loginout.p4(configEnum.crc);
				loginout.p4(configNpc.crc);
				loginout.p4(configObj.crc);
				loginout.p4(configSeq.crc);
				loginout.p4(configSpot.crc);
				loginout.p4(configVarbit.crc);
				loginout.p4(worldmap.crc);
				loginout.p4(quickchat.crc);
				loginout.p4(quickchatGlobal.crc);
				loginout.p4(materials.crc);
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
				loginHopTimer = (stream.read() + 3) * 60;
				loginStep = 8;
			}
			if (loginStep == 8) {
				loginWaitingTime = 0;
				TitleScreen.loginMes(JagString.join(new JagString[] { JagString.method1212(loginHopTimer / 60), Text.field2370 }), Text.field2015, Text.field2587);
				if (--loginHopTimer <= 0) {
					loginStep = 0;
				}
			} else {
				if (loginStep == 9 && stream.available() >= 9) {
					staffmodlevel = stream.read();
					mouseTracked = stream.read();
					field4428 = stream.read();
					if (field4428 == 1) {
						try {
							field1118.method628(signlink.field3597);
						} catch (Throwable var9) {
						}
					} else {
						try {
							field3577.method628(signlink.field3597);
						} catch (Throwable var8) {
						}
					}
					field3535 = stream.read();
					field1077 = stream.read() == 1;
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

					loginStep = 10;
				}
				if (loginStep != 10) {
					loginWaitingTime++;
					if (loginWaitingTime > 2000) {
						if (loginFailCount < 1) {
							loginFailCount++;
							loginStep = 0;
							if (loginGamePort == loginPort) {
								loginPort = loginJs5Port;
							} else {
								loginPort = loginGamePort;
							}
						} else {
							loginError(-3);
						}
					}
				} else if (stream.available() >= psize) {
					in.pos = 0;
					stream.read(0, in.data, psize);
					loginDone();
					mapBuildCentreZoneX = -1;
					rebuildPacket(false);
					ptype = -1;
				}
			}
		} catch (IOException var10) {
			if (loginFailCount < 1) {
				loginFailCount++;
				loginStep = 0;
				if (loginGamePort == loginPort) {
					loginPort = loginJs5Port;
				} else {
					loginPort = loginGamePort;
				}
			} else {
				loginError(-2);
			}
		}
	}

	@ObfuscatedName("cd.a(B)V")
	public static void clearCaches() {
		FloType.resetCache();
		FluType.resetCache();
		IdkType.resetCache();
		LocType.resetCache();
		NpcType.resetCache();
		ObjType.resetCache();
		SeqType.resetCache();
		SpotType.resetCache();
		VarBitType.resetCache();
		VarpType.resetCache();
		PlayerModel.resetCache();
		IfType.resetCache();
		((TextureManager) Pix3D.field3356).reset();
		ClientScript.cache.clear();
		anims.discardAllFiles();
		bases.discardAllFiles();
		interfaces.discardAllFiles();
		jagFX.discardAllFiles();
		maps.discardAllFiles();
		songs.discardAllFiles();
		models.discardAllFiles();
		sprites.discardAllFiles();
		binary.discardAllFiles();
		jingles.discardAllFiles();
		scripts.discardAllFiles();
	}

	@ObfuscatedName("b.a(I)Z")
	public static boolean method61() {
		try {
			return method1566();
		} catch (IOException var3) {
			method1380();
			return true;
		} catch (Exception var4) {
			String var1 = "T2 - " + ptype + "," + field821 + "," + field1634 + " - " + psize + "," + (localPlayer.field4087[0] + field4212) + "," + (localPlayer.field4141[0] + field3679) + " - ";
			for (int var2 = 0; psize > var2 && var2 < 50; var2++) {
				var1 = var1 + in.data[var2] + ",";
			}
			JagException.report(var1, var4);
			method785();
			return true;
		}
	}

	@ObfuscatedName("b.a(IJ)V")
	public static void method64(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field2729 >= 100 && membersAccount != 1 || field2729 >= 200) {
			method1499(Text.field4230, 0, field3453);
			return;
		}
		JagString var2 = JagString.method1375(arg0).method614();
		for (int var3 = 0; var3 < field2729; var3++) {
			if (field2086[var3] == arg0) {
				method1499(JagString.join(new JagString[] { var2, Text.field8 }), 0, field3453);
				return;
			}
		}
		for (int var4 = 0; var4 < field1221; var4++) {
			if (field1764[var4] == arg0) {
				method1499(JagString.join(new JagString[] { Text.field1978, var2, Text.field4245 }), 0, field3453);
				return;
			}
		}
		if (var2.method597(localPlayer.field766)) {
			method1499(Text.field395, 0, field3453);
			return;
		}
		Statics.field370[field2729] = var2;
		field2086[field2729] = arg0;
		Statics.field3092[field2729] = 0;
		Statics.field3238[field2729] = field3453;
		Statics.field845[field2729] = 0;
		Statics.field1120[field2729] = false;
		field313 = field1211;
		field2729++;
		out.method30(82);
		out.p8(arg0);
	}

	@ObfuscatedName("fa.b(II)V")
	public static void loginError(int arg0) {
		if (arg0 == -3) {
			TitleScreen.loginMes(Text.field1273, Text.field162, Text.field4209);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.field1274, Text.field1294, Text.field2926);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.field1271, Text.field478, Text.field4194);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.field1297, Text.field1268, Text.field4399);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.field1291, Text.field117, Text.field1016);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.field1305, Text.field4205, Text.field3525);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.field1266, Text.field2064, Text.field1186);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.field1302, Text.field1655, Text.field4319);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.field1267, Text.field4056, Text.field3074);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.field1293, Text.field4165, Text.field243);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.field1280, Text.field4057, Text.field3329);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.field1286, Text.field902, Text.field3823);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.field1282, Text.field2226, Text.field3991);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.field1299, Text.field1445, Text.field4197);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.field1300, Text.field3191, Text.field2968);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.field1278, Text.field4259, Text.field998);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.field1272, Text.field312, Text.field2951);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.field1287, Text.field480, Text.field1846);
		} else if (arg0 == 19) {
			TitleScreen.loginMes(Text.field4317, Text.field3002, Text.field2111);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.field1289, Text.field56, Text.field4200);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.field1284, Text.field896, Text.field4508);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.field1269, Text.field906, Text.field2988);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.field1303, Text.field2470, Text.field4348);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.field1283, Text.field143, Text.field4206);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.field1301, Text.field983, Text.field1998);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.field1279, Text.field1296, Statics.field3112);
		} else {
			TitleScreen.loginMes(Text.field1304, Text.field4524, Text.field4207);
		}
		setMainState(10);
	}

	@ObfuscatedName("ke.a(IJ)V")
	public static void method777(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < field2729; var2++) {
			if (field2086[var2] == arg0) {
				field2729--;
				for (int var3 = var2; var3 < field2729; var3++) {
					Statics.field370[var3] = Statics.field370[var3 + 1];
					Statics.field3092[var3] = Statics.field3092[var3 + 1];
					Statics.field3238[var3] = Statics.field3238[var3 + 1];
					field2086[var3] = field2086[var3 + 1];
					Statics.field845[var3] = Statics.field845[var3 + 1];
					Statics.field1120[var3] = Statics.field1120[var3 + 1];
				}
				field313 = field1211;
				out.method30(121);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("cj.d(I)V")
	public static void method210() {
		field4196 = 0;
		field3702 = 0;
		method1151();
		method79();
		method676();
		method1218();
		for (int var0 = 0; var0 < field4196; var0++) {
			int var1 = field999[var0];
			if (field2113 != field4491[var1].field4081) {
				field4491[var1] = null;
			}
		}
		if (in.pos != psize) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < field1027; var2++) {
			if (field4491[field3428[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + field1027);
			}
		}
	}

	@ObfuscatedName("fd.f(I)V")
	public static void method432() {
		field4196 = 0;
		field3702 = 0;
		method9();
		method633();
		method1359();
		for (int var0 = 0; var0 < field4196; var0++) {
			int var1 = field999[var0];
			if (field4223[var1].field4081 != field2113) {
				field4223[var1].field3682 = null;
				field4223[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < Statics.field1041; var2++) {
			if (field4223[Statics.field402[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + Statics.field1041);
			}
		}
	}

	@ObfuscatedName("jh.a(I)V")
	public static void loginDone() {
		Statics.field1804 = 0L;
		field4143.field718 = 0;
		Statics.field2765 = 0;
		Statics.field355 = true;
		GameShell.field3520 = true;
		Statics.method869();
		field1634 = -1;
		out.pos = 0;
		field821 = -1;
		field1910 = 0;
		Statics.field1841 = -1;
		Statics.field2061 = 0;
		Statics.field3700 = 0;
		ptype = -1;
		in.pos = 0;
		for (int var0 = 0; var0 < Statics.field1171.length; var0++) {
			Statics.field1171[var0] = null;
		}
		field3862 = 0;
		field1958 = false;
		ClientMouseListener.method1031(0);
		for (int var1 = 0; var1 < 100; var1++) {
			field4019[var1] = null;
		}
		field582 = 0;
		field2594 = 0;
		Statics.field1185 = (int) (Math.random() * 30.0D) - 20;
		field2102 = 0;
		field943 = (int) (Math.random() * 120.0D) - 60;
		field1027 = 0;
		field536 = (int) (Math.random() * 110.0D) - 55;
		field3930 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		field3445 = 0;
		minimapState = 0;
		Statics.field1795 = (int) (Math.random() * 80.0D) - 40;
		field4199 = (int) (Math.random() * 100.0D) - 50;
		Statics.field145 = false;
		field3336 = -1;
		Statics.field1041 = 0;
		field475 = 0;
		for (int var2 = 0; var2 < 2048; var2++) {
			field4491[var2] = null;
			field1397[var2] = null;
		}
		for (int var3 = 0; var3 < 32768; var3++) {
			field4223[var3] = null;
		}
		localPlayer = field4491[2047] = new ClientPlayer();
		field3220.method1616();
		field714.method1616();
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var5 = 0; var5 < 104; var5++) {
				for (int var6 = 0; var6 < 104; var6++) {
					field2497[var4][var5][var6] = null;
				}
			}
		}
		field1140 = new LinkList();
		field2729 = 0;
		Statics.field2078 = 0;
		for (int var7 = 0; var7 < VarpType.field465; var7++) {
			VarpType var8 = VarpType.method732(var7);
			if (var8 != null && var8.field4288 == 0) {
				Statics.field3245[var7] = 0;
				VarCache.field2050[var7] = 0;
			}
		}
		for (int var9 = 0; var9 < Statics.field2167.length; var9++) {
			Statics.field2167[var9] = -1;
		}
		if (field723 != -1) {
			IfType.method233(field723);
		}
		for (SubInterface var10 = (SubInterface) field2395.method1047(); var10 != null; var10 = (SubInterface) field2395.method1048()) {
			method672(var10, true);
		}
		field723 = -1;
		field2395 = new HashTable(8);
		field3862 = 0;
		field967 = null;
		field1958 = false;
		Statics.field2441.method1431(-1, null, new int[5], false);
		for (int var11 = 0; var11 < 8; var11++) {
			Statics.field2436[var11] = null;
			Statics.field3875[var11] = false;
		}
		ClientInvCache.method276();
		Statics.field2980 = true;
		for (int var12 = 0; var12 < 100; var12++) {
			field4228[var12] = true;
		}
		field885 = 0;
		Statics.field4182 = null;
		field1647 = null;
		for (int var13 = 0; var13 < 6; var13++) {
			field140[var13] = new StockMarketSlot();
		}
		for (int var14 = 0; var14 < 25; var14++) {
			Statics.field1907[var14] = 0;
			Statics.field4066[var14] = 0;
			Statics.field3562[var14] = 0;
		}
		Statics.field2108 = Statics.field2192 = Statics.field108 = ObjType.field1968 = new short[256];
		Statics.field3546 = true;
		ParamType.field54 = Text.field1741;
	}

	@ObfuscatedName("md.a(IJ)V")
	public static void method900(long arg0) {
		if (arg0 != 0L) {
			out.method30(58);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("pe.c(B)V")
	public static void method1151() {
		in.method34();
		int var0 = in.method28(1);
		if (var0 == 0) {
			return;
		}
		int var1 = in.method28(2);
		if (var1 == 0) {
			field2579[field3702++] = 2047;
		} else if (var1 == 1) {
			int var2 = in.method28(3);
			localPlayer.method1476(false, var2);
			int var3 = in.method28(1);
			if (var3 == 1) {
				field2579[field3702++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = in.method28(3);
			localPlayer.method1476(true, var4);
			int var5 = in.method28(3);
			localPlayer.method1476(true, var5);
			int var6 = in.method28(1);
			if (var6 == 1) {
				field2579[field3702++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = in.method28(1);
			field2907 = in.method28(2);
			int var8 = in.method28(1);
			if (var8 == 1) {
				field2579[field3702++] = 2047;
			}
			int var9 = in.method28(7);
			int var10 = in.method28(7);
			localPlayer.method1474(var7 == 1, var9, var10);
		}
	}

	@ObfuscatedName("oa.b(Z)V")
	public static void method1046() {
		for (int var0 = -1; var0 < field1027; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field3428[var0];
			}
			ClientPlayer var2 = field4491[var1];
			if (var2 != null && var2.field4112 > 0) {
				var2.field4112--;
				if (var2.field4112 == 0) {
					var2.field4071 = null;
				}
			}
		}
		for (int var3 = 0; var3 < Statics.field1041; var3++) {
			int var4 = Statics.field402[var3];
			ClientNpc var5 = field4223[var4];
			if (var5 != null && var5.field4112 > 0) {
				var5.field4112--;
				if (var5.field4112 == 0) {
					var5.field4071 = null;
				}
			}
		}
	}

	@ObfuscatedName("kf.a(B)V")
	public static void method785() {
		if (stream != null) {
			stream.close();
			stream = null;
		}
		clearCaches();
		World.method579();
		for (int var0 = 0; var0 < 4; var0++) {
			collision[var0].method643();
		}
		Statics.method1378();
		System.gc();
		MidiManager.method795();
		field2012 = false;
		Statics.field25 = -1;
		BgSound.method288();
		setMainState(10);
	}

	@ObfuscatedName("td.b(II)Li;")
	public static JagString method1442(int arg0) {
		return arg0 < 999999999 ? JagString.method1212(arg0) : Statics.field40;
	}

	@ObfuscatedName("uh.a(BIILdj;)V")
	public static void method1515(int arg0, int arg1, ClientPlayer arg2) {
		if (arg0 == arg2.field4077 && arg0 != -1) {
			SeqType var3 = SeqType.list(arg0);
			int var4 = var3.field1966;
			if (var4 == 1) {
				arg2.field4098 = 0;
				arg2.field4132 = 0;
				arg2.field4101 = 0;
				arg2.field4140 = arg1;
				method433(arg2 == localPlayer, arg2.field4121, arg2.field4101, arg2.field4136, var3);
			}
			if (var4 == 2) {
				arg2.field4132 = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.field4077 == -1 || SeqType.list(arg0).field1999 >= SeqType.list(arg2.field4077).field1999) {
			arg2.field4101 = 0;
			arg2.field4140 = arg1;
			arg2.field4137 = arg2.field4135;
			arg2.field4077 = arg0;
			arg2.field4132 = 0;
			arg2.field4098 = 0;
			if (arg2.field4077 == -1) {
				return;
			}
			method433(localPlayer == arg2, arg2.field4121, arg2.field4101, arg2.field4136, SeqType.list(arg2.field4077));
		}
	}

	@ObfuscatedName("kg.f(I)V")
	public static void gameLoop() {
		if (Statics.field2061 > 1) {
			Statics.field2061--;
			Statics.field3952 = field1211;
		}
		if (field1910 > 0) {
			field1910--;
		}
		if (networkError) {
			networkError = false;
			method1380();
			return;
		}
		for (int var0 = 0; var0 < 100 && method61(); var0++) {
		}
		if (state != 30) {
			return;
		}
		ReflectionChecker.method71(out);
		Object var1 = field4143.field715;
		synchronized (field4143.field715) {
			if (!field1077) {
				field4143.field718 = 0;
			} else if (ClientMouseListener.field625 != 0 || field4143.field718 >= 40) {
				out.method30(111);
				out.p1(0);
				int var2 = out.pos;
				int var3 = 0;
				for (int var4 = 0; var4 < field4143.field718 && out.pos - var2 < 240; var4++) {
					var3++;
					int var5 = field4143.field719[var4];
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 502) {
						var5 = 502;
					}
					int var6 = field4143.field720[var4];
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 764) {
						var6 = 764;
					}
					int var7 = var5 * 765 + var6;
					if (field4143.field719[var4] == -1 && field4143.field720[var4] == -1) {
						var7 = 524287;
						var6 = -1;
						var5 = -1;
					}
					if (var6 != Statics.field110 || Statics.field4004 != var5) {
						int var8 = var5 - Statics.field4004;
						Statics.field4004 = var5;
						int var9 = var6 - Statics.field110;
						Statics.field110 = var6;
						if (Statics.field2765 < 8 && var9 >= -32 && var9 <= 31 && var8 >= -32 && var8 <= 31) {
							var8 += 32;
							var9 += 32;
							out.method305(var8 + (Statics.field2765 << 12) + (var9 << 6));
							Statics.field2765 = 0;
						} else if (Statics.field2765 < 8) {
							out.method337((Statics.field2765 << 19) + var7 + 8388608);
							Statics.field2765 = 0;
						} else {
							out.p4(var7 + (Statics.field2765 << 19) - 1073741824);
							Statics.field2765 = 0;
						}
					} else if (Statics.field2765 < 2047) {
						Statics.field2765++;
					}
				}
				out.method341(out.pos - var2);
				if (var3 < field4143.field718) {
					field4143.field718 -= var3;
					for (int var10 = 0; var10 < field4143.field718; var10++) {
						field4143.field720[var10] = field4143.field720[var10 + var3];
						field4143.field719[var10] = field4143.field719[var10 + var3];
					}
				} else {
					field4143.field718 = 0;
				}
			}
		}
		if (ClientMouseListener.field625 != 0) {
			long var11 = (ClientMouseListener.field623 - Statics.field1804) / 50L;
			Statics.field1804 = ClientMouseListener.field623;
			int var13 = ClientMouseListener.field3339;
			int var14 = ClientMouseListener.field4239;
			if (var13 < 0) {
				var13 = 0;
			} else if (var13 > 502) {
				var13 = 502;
			}
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 764) {
				var14 = 764;
			}
			if (var11 > 4095L) {
				var11 = 4095L;
			}
			byte var15 = 0;
			int var16 = var13 * 765 + var14;
			if (ClientMouseListener.field625 == 2) {
				var15 = 1;
			}
			out.method30(63);
			int var17 = (int) var11;
			out.method326((var15 << 19) + ((var17 << 20) + var16));
		}
		if (ClientKeyboardListener.field4511[96] || ClientKeyboardListener.field4511[97] || ClientKeyboardListener.field4511[98] || ClientKeyboardListener.field4511[99]) {
			Statics.field3546 = true;
		}
		if (Statics.field1638 > 0) {
			Statics.field1638--;
		}
		if (Statics.field3546 && Statics.field1638 <= 0) {
			Statics.field3546 = false;
			Statics.field1638 = 20;
			out.method30(173);
			out.method331(field3930);
			out.method305(field1173);
		}
		if (GameShell.field3520 && !Statics.field355) {
			Statics.field355 = true;
			out.method30(130);
			out.p1(1);
		}
		if (!GameShell.field3520 && Statics.field355) {
			Statics.field355 = false;
			out.method30(130);
			out.p1(0);
		}
		method1328();
		if (state != 30) {
			return;
		}
		method773();
		method367();
		Statics.field3700++;
		if (Statics.field3700 > 750) {
			method1380();
			return;
		}
		method1214();
		method1144();
		method1046();
		if (Statics.field1706 != null) {
			Statics.method1315();
		}
		if (field3017 != 0) {
			field796 += 20;
			if (field796 >= 400) {
				field3017 = 0;
			}
		}
		field261++;
		if (field1091 != null) {
			field2573++;
			if (field2573 >= 15) {
				method1371(field1091);
				field1091 = null;
			}
		}
		if (Statics.field2514 != null) {
			method1371(Statics.field2514);
			Statics.field4535++;
			if (ClientMouseListener.field471 > Statics.field4146 + 5 || Statics.field4146 - 5 > ClientMouseListener.field471 || ClientMouseListener.field4449 > Statics.field894 + 5 || Statics.field894 - 5 > ClientMouseListener.field4449) {
				Statics.field739 = true;
			}
			if (ClientMouseListener.field3016 == 0) {
				if (Statics.field739 && Statics.field4535 >= 5) {
					if (Statics.field2514 == field4229 && Statics.field305 != Statics.field3333) {
						IfType var18 = Statics.field2514;
						byte var19 = 0;
						if (field2991 == 1 && var18.field3439 == 206) {
							var19 = 1;
						}
						if (var18.field3388[Statics.field3333] <= 0) {
							var19 = 0;
						}
						if (Statics.method1070(Statics.method530(var18))) {
							int var20 = Statics.field305;
							int var21 = Statics.field3333;
							var18.field3388[var21] = var18.field3388[var20];
							var18.field3474[var21] = var18.field3474[var20];
							var18.field3388[var20] = -1;
							var18.field3474[var20] = 0;
						} else if (var19 == 1) {
							int var22 = Statics.field305;
							int var23 = Statics.field3333;
							while (var23 != var22) {
								if (var23 < var22) {
									var18.swapSlots(var22 - 1, var22);
									var22--;
								} else if (var22 < var23) {
									var18.swapSlots(var22 + 1, var22);
									var22++;
								}
							}
						} else {
							var18.swapSlots(Statics.field3333, Statics.field305);
						}
						out.method30(207);
						out.method351(Statics.field2514.parentId);
						out.method314(Statics.field305);
						out.method327(var19);
						out.method344(Statics.field3333);
					}
				} else if ((field3859 == 1 || method1554(field3862 - 1)) && field3862 > 2) {
					method904();
				} else if (field3862 > 0) {
					method1257(field3862 - 1);
				}
				ClientMouseListener.field625 = 0;
				field2573 = 10;
				Statics.field2514 = null;
			}
		}
		Statics.field1467 = 0;
		field2905 = false;
		field2217 = null;
		IfType var24 = Statics.field635;
		IfType var25 = Statics.field1177;
		Statics.field1177 = null;
		field487 = false;
		Statics.field635 = null;
		while (ClientKeyboardListener.method279() && Statics.field1467 < 128) {
			Statics.field4479[Statics.field1467] = ClientKeyboardListener.field2556;
			Statics.field3685[Statics.field1467] = ClientKeyboardListener.field4148;
			Statics.field1467++;
		}
		Statics.field1706 = null;
		if (field723 != -1) {
			method1533(0, sHei, 0, 0, sWid, field723, 0);
		}
		field1211++;
		while (true) {
			HookReq var26;
			IfType var27;
			IfType var28;
			do {
				var26 = (HookReq) Statics.field619.method1613();
				if (var26 == null) {
					while (true) {
						HookReq var29;
						IfType var30;
						IfType var31;
						do {
							var29 = (HookReq) Statics.field3810.method1613();
							if (var29 == null) {
								while (true) {
									HookReq var32;
									IfType var33;
									IfType var34;
									do {
										var32 = (HookReq) Statics.field1349.method1613();
										if (var32 == null) {
											if (Statics.field3532 && Statics.field1706 == null) {
												Statics.field3532 = false;
											}
											if (field3568 != null) {
												method688();
											}
											if (World.field2057 != -1) {
												int var35 = World.field2057;
												int var36 = World.field1714;
												boolean var37 = method1421(0, 0, var36, var35, localPlayer.field4087[0], 0, 0, 0, true, 0, localPlayer.field4141[0]);
												World.field2057 = -1;
												if (var37) {
													field2757 = ClientMouseListener.field4239;
													field796 = 0;
													field2997 = ClientMouseListener.field3339;
													field3017 = 1;
												}
											}
											method372();
											if (var25 != Statics.field1177) {
												if (var25 != null) {
													method1371(var25);
												}
												if (Statics.field1177 != null) {
													method1371(Statics.field1177);
												}
											}
											if (var24 != Statics.field635 && Statics.field2563 == Statics.field859) {
												if (var24 != null) {
													method1371(var24);
												}
												if (Statics.field635 != null) {
													method1371(Statics.field635);
												}
											}
											if (Statics.field635 == null) {
												if (Statics.field859 > 0) {
													Statics.field859--;
												}
											} else if (Statics.field2563 > Statics.field859) {
												Statics.field859++;
												if (Statics.field2563 == Statics.field859) {
													method1371(Statics.field635);
												}
											}
											method1283();
											if (field3567) {
												method1577();
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = Statics.field3674[var38]++;
											}
											int var39 = Statics.method984();
											int var40 = ClientKeyboardListener.method729();
											if (var39 > 4500 && var40 > 4500) {
												field1910 = 250;
												ClientMouseListener.method1031(4000);
												out.method30(226);
											}
											Statics.field2027++;
											Statics.field1384++;
											field2707++;
											if (Statics.field2027 > 500) {
												Statics.field2027 = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x4) == 4) {
													Statics.field1795 += Statics.field481;
												}
												if ((var41 & 0x2) == 2) {
													field536 += Statics.field4357;
												}
												if ((var41 & 0x1) == 1) {
													field4199 += Statics.field2531;
												}
											}
											if (Statics.field1384 > 500) {
												Statics.field1384 = 0;
												int var42 = (int) (Math.random() * 8.0D);
												if ((var42 & 0x2) == 2) {
													Statics.field1185 += Statics.field3111;
												}
												if ((var42 & 0x1) == 1) {
													field943 += Statics.field1644;
												}
											}
											if (Statics.field1185 < -20) {
												Statics.field3111 = 1;
											}
											if (Statics.field1185 > 10) {
												Statics.field3111 = -1;
											}
											if (field536 < -55) {
												Statics.field4357 = 2;
											}
											if (field943 < -60) {
												Statics.field1644 = 2;
											}
											if (Statics.field1795 < -40) {
												Statics.field481 = 1;
											}
											if (field536 > 55) {
												Statics.field4357 = -2;
											}
											if (Statics.field1795 > 40) {
												Statics.field481 = -1;
											}
											if (field943 > 60) {
												Statics.field1644 = -2;
											}
											if (field4199 < -50) {
												Statics.field2531 = 2;
											}
											if (field4199 > 50) {
												Statics.field2531 = -2;
											}
											if (field2707 > 50) {
												out.method30(19);
											}
											try {
												if (stream != null && out.pos > 0) {
													stream.write(out.pos, out.data);
													out.pos = 0;
													field2707 = 0;
													return;
												}
												return;
											} catch (IOException var43) {
												method1380();
												return;
											}
										}
										var33 = var32.field678;
										if (var33.field3406 < 0) {
											break;
										}
										var34 = method1579(var33.field3504);
									} while (var34 == null || var34.field3465 == null || var33.field3406 >= var34.field3465.length || var34.field3465[var33.field3406] != var33);
									ScriptRunner.method1373(var32);
								}
							}
							var30 = var29.field678;
							if (var30.field3406 < 0) {
								break;
							}
							var31 = method1579(var30.field3504);
						} while (var31 == null || var31.field3465 == null || var31.field3465.length <= var30.field3406 || var31.field3465[var30.field3406] != var30);
						ScriptRunner.method1373(var29);
					}
				}
				var27 = var26.field678;
				if (var27.field3406 < 0) {
					break;
				}
				var28 = method1579(var27.field3504);
			} while (var28 == null || var28.field3465 == null || var28.field3465.length <= var27.field3406 || var27 != var28.field3465[var27.field3406]);
			ScriptRunner.method1373(var26);
		}
	}

	@ObfuscatedName("pb.a([Lq;IIZIIIIII)V")
	public static void drawLayer(IfType[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Pix2D.setClipping(arg1, arg2, arg8, arg4);
		Pix3D.setRenderClipping();
		for (int var9 = 0; var9 < arg0.length; var9++) {
			IfType var10 = arg0[var9];
			if (var10 != null && (arg7 == var10.field3504 || arg7 == 0xabcdabcd && var10 == field3568)) {
				int var11;
				if (arg3 == -1) {
					field1455[field3923] = arg5 + var10.field3366;
					field2471[field3923] = var10.field3441 + arg6;
					field2485[field3923] = var10.field3380;
					field1447[field3923] = var10.field3422;
					var11 = field3923++;
				} else {
					var11 = arg3;
				}
				var10.field3371 = field2113;
				var10.field3382 = var11;
				if (!var10.field3410 || !Statics.method475(var10)) {
					if (var10.field3439 > 0) {
						method78(var10);
					}
					int var12 = var10.field3366 + arg5;
					int var13 = var10.field3441 + arg6;
					int var14 = var10.field3480;
					if (field2103 && (Statics.method530(var10) != 0 || var10.field3390 == 0) && var14 > 127) {
						var14 = 127;
					}
					if (var10 == field3568) {
						if (arg7 != -1412584499 && !var10.field3427) {
							PacketBit.field77 = arg6;
							Statics.field3564 = arg0;
							ClientMouseListener.field1756 = arg5;
							continue;
						}
						if (!var10.field3427) {
							var14 = 128;
						}
						if (field3867 && field487) {
							int var15 = ClientMouseListener.field471;
							int var16 = var15 - field2791;
							if (field2371 > var16) {
								var16 = field2371;
							}
							if (field923.field3380 + field2371 < var10.field3380 + var16) {
								var16 = field2371 + field923.field3380 - var10.field3380;
							}
							var12 = var16;
							int var17 = ClientMouseListener.field4449;
							int var18 = var17 - field3941;
							if (field466 > var18) {
								var18 = field466;
							}
							if (var18 + var10.field3422 > field466 - -field923.field3422) {
								var18 = field923.field3422 + field466 - var10.field3422;
							}
							var13 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.field3390 == 2) {
						var19 = arg2;
						var20 = arg8;
						var21 = arg4;
						var22 = arg1;
					} else {
						var19 = var13 <= arg2 ? arg2 : var13;
						var22 = arg1 >= var12 ? arg1 : var12;
						int var23 = var10.field3380 + var12;
						int var24 = var13 + var10.field3422;
						if (var10.field3390 == 9) {
							var24++;
							var23++;
						}
						var21 = var24 >= arg4 ? arg4 : var24;
						var20 = arg8 <= var23 ? arg8 : var23;
					}
					if (!var10.field3410 || var22 < var20 && var19 < var21) {
						if (var10.field3439 != 0) {
							if (var10.field3439 == 1337) {
								field1101 = var12;
								field2487 = var13;
								method248(var10.field3380, var12, var10.field3422, var13);
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.field3439 == 1338) {
								if (var10.method1246()) {
									minimapDraw(var10, var11, var12, var13);
									Pix2D.setClipping(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.field3439 == 1339) {
								if (var10.method1246()) {
									method743(var11, var12, var13, var10);
									Pix2D.setClipping(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.field3439 == 1400) {
								method719(var10.field3380, var10.field3422, var12, var13);
								field4228[var11] = true;
								field4005[var11] = true;
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.field3439 == 1401) {
								Statics.method1590(var13, var12, var10.field3380, var10.field3422);
								field4228[var11] = true;
								field4005[var11] = true;
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
						}
						int var25 = ClientMouseListener.field471;
						if (var10.field3390 == 0 && var10.field3470 && var22 <= ClientMouseListener.field471 && ClientMouseListener.field4449 >= var19 && var20 > ClientMouseListener.field471 && ClientMouseListener.field4449 < var21 && !field1958 && !field2103) {
							field3862 = 1;
							field1191[0] = Text.field76;
							field3836[0] = field3453;
							field994[0] = 1007;
						}
						int var26 = ClientMouseListener.field4449;
						if (!field1958 && var25 >= var22 && var26 >= var19 && var25 < var20 && var21 > var26) {
							method65(var26 - var13, -var12 + var25, var10);
						}
						if (var10.field3390 == 0) {
							if (!var10.field3410 && Statics.method475(var10) && var10 != Statics.field1177) {
								continue;
							}
							if (!var10.field3410) {
								if (var10.field3415 > var10.field3375 - var10.field3422) {
									var10.field3415 = var10.field3375 - var10.field3422;
								}
								if (var10.field3415 < 0) {
									var10.field3415 = 0;
								}
							}
							drawLayer(arg0, var22, var19, var11, var21, var12 - var10.field3393, -var10.field3415 + var13, var10.parentId, var20);
							if (var10.field3465 != null) {
								drawLayer(var10.field3465, var22, var19, var11, var21, var12 - var10.field3393, -var10.field3415 + var13, var10.parentId, var20);
							}
							SubInterface var27 = (SubInterface) field2395.method1049((long) var10.parentId);
							if (var27 != null) {
								if (var27.field3233 == 0 && var22 <= ClientMouseListener.field471 && var19 <= ClientMouseListener.field4449 && ClientMouseListener.field471 < var20 && ClientMouseListener.field4449 < var21 && !field1958 && !field2103) {
									field994[0] = 1007;
									field3862 = 1;
									field1191[0] = Text.field76;
									field3836[0] = field3453;
								}
								drawInterface(var21, var27.field3229, var19, var11, var13, var22, var12, var20);
							}
							Pix2D.setClipping(arg1, arg2, arg8, arg4);
							Pix3D.setRenderClipping();
						}
						if (field2043[var11] || field2503 > 1) {
							if (var10.field3390 == 0 && !var10.field3410 && var10.field3422 < var10.field3375) {
								method1592(var10.field3415, var10.field3422, var13, var10.field3375, var12 + var10.field3380);
							}
							if (var10.field3390 != 1) {
								if (var10.field3390 == 2) {
									int var28 = 0;
									for (int var29 = 0; var29 < var10.field3418; var29++) {
										for (int var30 = 0; var30 < var10.field3501; var30++) {
											int var31 = var13 + (var10.field3508 + 32) * var29;
											int var32 = var12 + var30 * (var10.field3466 + 32);
											if (var28 < 20) {
												var32 += var10.field3472[var28];
												var31 += var10.field3397[var28];
											}
											if (var10.field3388[var28] > 0) {
												int var34 = var10.field3388[var28] - 1;
												if (var32 + 32 > arg1 && var32 < arg8 && arg2 < var31 + 32 && var31 < arg4 || Statics.field2514 == var10 && var28 == Statics.field305) {
													Pix32 var35;
													if (field475 == 1 && var28 == field1105 && var10.parentId == field3965) {
														var35 = ObjType.method117(2, var34, var10.field3474[var28], var10.field3464, 0);
													} else {
														var35 = ObjType.method117(1, var34, var10.field3474[var28], var10.field3464, 3153952);
													}
													if (Pix3D.field3364) {
														field4228[var11] = true;
													}
													if (var35 == null) {
														method1371(var10);
													} else if (var10 == Statics.field2514 && Statics.field305 == var28) {
														int var36 = ClientMouseListener.field471 - Statics.field4146;
														int var37 = ClientMouseListener.field4449 - Statics.field894;
														if (var36 < 5 && var36 > -5) {
															var36 = 0;
														}
														if (var37 < 5 && var37 > -5) {
															var37 = 0;
														}
														if (Statics.field4535 < 5) {
															var36 = 0;
															var37 = 0;
														}
														var35.method1164(var36 + var32, var37 + var31, 128);
														if (arg7 != -1) {
															IfType var38 = arg0[arg7 & 0xFFFF];
															int var39 = Pix2D.field1335;
															int var40 = Pix2D.field1334;
															if (var31 + var37 < var40 && var38.field3415 > 0) {
																int var41 = field261 * (var40 - var37 - var31) / 3;
																if (field261 * 10 < var41) {
																	var41 = field261 * 10;
																}
																if (var38.field3415 < var41) {
																	var41 = var38.field3415;
																}
																var38.field3415 -= var41;
																Statics.field894 += var41;
																method1371(var38);
															}
															if (var37 + var31 + 32 > var39 && var38.field3375 - var38.field3422 > var38.field3415) {
																int var42 = field261 * (var31 + var37 + 32 - var39) / 3;
																if (field261 * 10 < var42) {
																	var42 = field261 * 10;
																}
																if (var38.field3375 - var38.field3415 - var38.field3422 < var42) {
																	var42 = var38.field3375 - var38.field3415 - var38.field3422;
																}
																var38.field3415 += var42;
																Statics.field894 -= var42;
																method1371(var38);
															}
														}
													} else if (field1091 == var10 && var28 == field1742) {
														var35.method1164(var32, var31, 128);
													} else {
														var35.method1155(var32, var31);
													}
												}
											} else if (var10.field3389 != null && var28 < 20) {
												Pix32 var33 = var10.method1248(var28);
												if (var33 != null) {
													var33.method1155(var32, var31);
												} else if (IfType.loadingAsset) {
													method1371(var10);
												}
											}
											var28++;
										}
									}
								} else if (var10.field3390 == 3) {
									int var43;
									if (method533(var10)) {
										var43 = var10.field3513;
										if (var10 == Statics.field1177 && var10.field3374 != 0) {
											var43 = var10.field3374;
										}
									} else {
										var43 = var10.field3414;
										if (Statics.field1177 == var10 && var10.field3431 != 0) {
											var43 = var10.field3431;
										}
									}
									if (var14 == 0) {
										if (var10.field3496) {
											Pix2D.method478(var12, var13, var10.field3380, var10.field3422, var43);
										} else {
											Pix2D.method476(var12, var13, var10.field3380, var10.field3422, var43);
										}
									} else if (var10.field3496) {
										Pix2D.fillRectTrans(var12, var13, var10.field3380, var10.field3422, var43, 256 - (var14 & 0xFF));
									} else {
										Pix2D.method484(var12, var13, var10.field3380, var10.field3422, var43, 256 - (var14 & 0xFF));
									}
								} else if (var10.field3390 == 4) {
									PixfontGeneric var44 = var10.method1252(field587);
									if (var44 != null) {
										JagString var45 = var10.field3383;
										int var46;
										if (method533(var10)) {
											var46 = var10.field3513;
											if (Statics.field1177 == var10 && var10.field3374 != 0) {
												var46 = var10.field3374;
											}
											if (var10.field3446.method604() > 0) {
												var45 = var10.field3446;
											}
										} else {
											var46 = var10.field3414;
											if (Statics.field1177 == var10 && var10.field3431 != 0) {
												var46 = var10.field3431;
											}
										}
										if (var10.field3410 && var10.field3399 != -1) {
											ObjType var47 = ObjType.list(var10.field3399);
											var45 = var47.name;
											if (var45 == null) {
												var45 = Statics.field3572;
											}
											if ((var47.field2852 == 1 || var10.field3482 != 1) && var10.field3482 != -1) {
												var45 = JagString.join(new JagString[] { Statics.field2529, var45, Statics.field523, JagString.method958(var10.field3482) });
											}
										}
										if (field967 == var10) {
											var45 = Text.field2650;
											var46 = var10.field3414;
										}
										if (!var10.field3410) {
											var45 = method1084(var45, var10);
										}
										var44.method153(var45, var12, var13, var10.field3380, var10.field3422, var46, var10.field3435 ? 0 : -1, var10.field3479, var10.field3469, var10.field3396);
									} else if (IfType.loadingAsset) {
										method1371(var10);
									}
								} else if (var10.field3390 == 5) {
									if (var10.field3410) {
										Pix32 var48;
										if (var10.field3399 == -1) {
											var48 = var10.method1249(false);
										} else {
											var48 = ObjType.method117(var10.field3429, var10.field3399, var10.field3482, var10.field3464, var10.field3425);
										}
										if (var48 != null) {
											int var49 = var48.field3649;
											int var50 = var48.field3645;
											if (var10.field3420) {
												int var52 = (var49 + var10.field3380 - 1) / var49;
												int var53 = (var10.field3422 + var50 - 1) / var50;
												Pix2D.method493(var12, var13, var10.field3380 + var12, var10.field3422 + var13);
												for (int var54 = 0; var54 < var52; var54++) {
													for (int var55 = 0; var55 < var53; var55++) {
														if (var10.field3437 != 0) {
															var48.method1309(var50 / 2 + var55 * var50 + var13, var12 + var49 * var54 - -(var49 / 2), 4096, var10.field3437);
														} else if (var14 == 0) {
															var48.method1155(var12 + var54 * var49, var13 + var55 * var50);
														} else {
															var48.method1164(var54 * var49 + var12, var55 * var50 + var13, 256 - (var14 & 0xFF));
														}
													}
												}
												Pix2D.setClipping(arg1, arg2, arg8, arg4);
											} else {
												int var51 = var10.field3380 * 4096 / var49;
												if (var10.field3437 != 0) {
													var48.method1309(var13 + var10.field3422 / 2, var12 - -(var10.field3380 / 2), var51, var10.field3437);
												} else if (var14 != 0) {
													var48.method1174(var12, var13, var10.field3380, var10.field3422, 256 - (var14 & 0xFF));
												} else if (var10.field3380 == var49 && var10.field3422 == var50) {
													var48.method1155(var12, var13);
												} else {
													var48.method1162(var12, var13, var10.field3380, var10.field3422);
												}
											}
										} else if (IfType.loadingAsset) {
											method1371(var10);
										}
									} else {
										Pix32 var56 = var10.method1249(method533(var10));
										if (var56 != null) {
											var56.method1155(var12, var13);
										} else if (IfType.loadingAsset) {
											method1371(var10);
										}
									}
								} else if (var10.field3390 == 6) {
									boolean var57 = method533(var10);
									int var58 = 0;
									ModelLit var59 = null;
									int var60;
									if (var57) {
										var60 = var10.field3386;
									} else {
										var60 = var10.field3404;
									}
									if (var10.field3399 != -1) {
										ObjType var65 = ObjType.list(var10.field3399);
										if (var65 != null) {
											ObjType var66 = var65.method1021(var10.field3482);
											var59 = var66.method1025(1, 0, null);
											if (var59 == null) {
												method1371(var10);
											} else {
												var58 = -var59.method88() / 2;
											}
										}
									} else if (var10.field3430 == 5) {
										if (var10.field3409 == -1) {
											var59 = Statics.field2441.method1430(null, -1, -1, null);
										} else {
											int var62 = var10.field3409 & 0x7FF;
											if (selfSlot == var62) {
												var62 = 2047;
											}
											ClientPlayer var63 = field4491[var62];
											SeqType var64 = var60 == -1 ? null : SeqType.list(var60);
											if (var63 != null && (int) var63.field766.toUserhash() << 11 == (var10.field3409 & 0xFFFFF800)) {
												var59 = var63.field768.method1430(null, var10.field3379, 0, var64);
											}
										}
									} else if (var60 == -1) {
										var59 = var10.getTempModel(null, localPlayer.field768, -1, var57);
										if (var59 == null && IfType.loadingAsset) {
											method1371(var10);
										}
									} else {
										SeqType var61 = SeqType.list(var60);
										var59 = var10.getTempModel(var61, localPlayer.field768, var10.field3379, var57);
										if (var59 == null && IfType.loadingAsset) {
											method1371(var10);
										}
									}
									if (var59 != null) {
										int var67;
										if (var10.field3417 <= 0) {
											var67 = 256;
										} else {
											var67 = (var10.field3422 << 8) / var10.field3417;
										}
										int var68;
										if (var10.field3468 <= 0) {
											var68 = 256;
										} else {
											var68 = (var10.field3380 << 8) / var10.field3468;
										}
										int var69 = var10.field3380 / 2 + var12 + (var68 * var10.field3432 >> 8);
										int var70 = (var67 * var10.field3405 >> 8) + var10.field3422 / 2 + var13;
										Pix3D.method1228(var69, var70);
										int var71 = var10.field3485 * Pix3D.field3354[var10.field3455] >> 16;
										int var72 = Pix3D.field3359[var10.field3455] * var10.field3485 >> 16;
										if (!var10.field3410) {
											var59.method193(var10.field3509, 0, var10.field3455, 0, var72, var71);
										} else if (var10.field3403) {
											((SoftwareModelLit) var59).method849(var10.field3509, var10.field3517, var10.field3455, var10.field3365, var58 + var72 + var10.field3498, var71 + var10.field3498, var10.field3485);
										} else {
											var59.method193(var10.field3509, var10.field3517, var10.field3455, var10.field3365, var10.field3498 + var72 + var58, var10.field3498 + var71);
										}
										Pix3D.method1239();
									}
								} else {
									if (var10.field3390 == 7) {
										PixfontGeneric var73 = var10.method1252(field587);
										if (var73 == null) {
											if (IfType.loadingAsset) {
												method1371(var10);
											}
											continue;
										}
										int var74 = 0;
										for (int var75 = 0; var75 < var10.field3418; var75++) {
											for (int var76 = 0; var76 < var10.field3501; var76++) {
												if (var10.field3388[var74] > 0) {
													ObjType var77 = ObjType.list(var10.field3388[var74] - 1);
													JagString var78;
													if (var77.field2852 != 1 && var10.field3474[var74] == 1) {
														var78 = JagString.join(new JagString[] { Statics.field2529, var77.name, Statics.field2199 });
													} else {
														var78 = JagString.join(new JagString[] { Statics.field2529, var77.name, Statics.field523, JagString.method958(var10.field3474[var74]) });
													}
													int var79 = (var10.field3466 + 115) * var76 + var12;
													int var80 = var13 + var75 * (var10.field3508 + 12);
													if (var10.field3479 == 0) {
														var73.method154(var78, var79, var80, var10.field3414, var10.field3435 ? 0 : -1);
													} else if (var10.field3479 == 1) {
														var73.method141(var78, var79 + 57, var80, var10.field3414, var10.field3435 ? 0 : -1);
													} else {
														var73.method150(var78, var79 + 115 - 1, var80, var10.field3414, var10.field3435 ? 0 : -1);
													}
												}
												var74++;
											}
										}
									}
									if (var10.field3390 == 8 && Statics.field635 == var10 && Statics.field2563 == Statics.field859) {
										int var81 = 0;
										JagString var82 = var10.field3383;
										PixfontGeneric var83 = field30;
										JagString var84 = method1084(var82, var10);
										int var85 = 0;
										while (var84.method604() > 0) {
											int var86 = var84.method617(Statics.field2618);
											JagString var87;
											if (var86 == -1) {
												var87 = var84;
												var84 = field3453;
											} else {
												var87 = var84.method623(0, var86);
												var84 = var84.method635(var86 + 4);
											}
											int var88 = var83.method158(var87);
											if (var88 > var81) {
												var81 = var88;
											}
											var85 += var83.ascent + 1;
										}
										var81 += 6;
										var85 += 7;
										int var89 = var10.field3380 + var12 - var81 - 5;
										if (var89 < var12 + 5) {
											var89 = var12 + 5;
										}
										if (var89 + var81 > arg8) {
											var89 = arg8 - var81;
										}
										int var90 = var10.field3422 + var13 + 5;
										if (arg4 < var90 + var85) {
											var90 = arg4 - var85;
										}
										Pix2D.method478(var89, var90, var81, var85, 16777120);
										Pix2D.method476(var89, var90, var81, var85, 0);
										int var91 = var83.ascent + var90 + 2;
										JagString var92 = var10.field3383;
										JagString var93 = method1084(var92, var10);
										while (var93.method604() > 0) {
											int var94 = var93.method617(Statics.field2618);
											JagString var95;
											if (var94 == -1) {
												var95 = var93;
												var93 = field3453;
											} else {
												var95 = var93.method623(0, var94);
												var93 = var93.method635(var94 + 4);
											}
											var83.method154(var95, var89 + 3, var91, 0, -1);
											var91 += var83.ascent + 1;
										}
									}
									if (var10.field3390 == 9) {
										int var96;
										int var97;
										int var98;
										if (var10.field3492) {
											var96 = var10.field3422 + var13;
											var97 = var13;
											var98 = var12 + var10.field3380;
										} else {
											var97 = var13 + var10.field3422;
											var98 = var10.field3380 + var12;
											var96 = var13;
										}
										if (var10.field3497 == 1) {
											Pix2D.method477(var12, var96, var98, var97, var10.field3414);
										} else {
											Pix2D.method485(var12, var96, var98, var97, var10.field3414, var10.field3497);
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

	@ObfuscatedName("ve.b(II)Z")
	public static boolean method1554(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = field994[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1003;
	}

	@ObfuscatedName("s.d(Z)V")
	public static void method1359() {
		for (int var0 = 0; var0 < field3702; var0++) {
			int var1 = field2579[var0];
			ClientNpc var2 = field4223[var1];
			int var3 = in.g1();
			if ((var3 & 0x8) != 0) {
				int var4 = in.method302();
				int var5 = in.method352();
				if (var4 == 65535) {
					var4 = -1;
				}
				method925(var4, var5, var2);
			}
			if ((var3 & 0x1) != 0) {
				var2.field4071 = in.gjstr();
				var2.field4112 = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.field4096 = in.method302();
				var2.field4099 = in.g2();
			}
			if ((var3 & 0x80) != 0) {
				var2.field4080 = in.method343();
				int var6 = in.method313();
				if (var2.field4080 == 65535) {
					var2.field4080 = -1;
				}
				var2.field4125 = var6 >> 16;
				var2.field4075 = 0;
				var2.field4120 = 0;
				var2.field4082 = (var6 & 0xFFFF) + field2113;
				if (field2113 < var2.field4082) {
					var2.field4075 = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.field4114 = in.method349();
				if (var2.field4114 == 65535) {
					var2.field4114 = -1;
				}
			}
			if ((var3 & 0x10) != 0) {
				var2.field3682 = NpcType.list(in.method349());
				var2.field4102 = var2.field3682.field2339;
				var2.field4103 = var2.field3682.field2349;
				var2.field4091 = var2.field3682.field2317;
				var2.field4128 = var2.field3682.field2360;
				var2.field4105 = var2.field3682.field2325;
				var2.field4122 = var2.field3682.field2337;
				var2.field4123 = var2.field3682.field2343;
				var2.field4084 = var2.field3682.field2351;
				var2.field4092 = var2.field3682.field2322;
			}
			if ((var3 & 0x40) != 0) {
				int var7 = in.method319();
				int var8 = in.method319();
				var2.method1477(field2113, var8, var7);
			}
			if ((var3 & 0x4) != 0) {
				int var9 = in.method295();
				int var10 = in.g1();
				var2.method1477(field2113, var10, var9);
				var2.field4118 = field2113 + 300;
				var2.field4109 = in.method319();
			}
		}
	}

	@ObfuscatedName("vg.b(Z)Z")
	public static boolean method1566() throws IOException {
		if (stream == null) {
			return false;
		}
		int var0 = stream.available();
		if (var0 == 0) {
			return false;
		}
		if (ptype == -1) {
			var0--;
			stream.read(0, in.data, 1);
			in.pos = 0;
			ptype = in.g1Enc();
			psize = Statics.field224[ptype];
		}
		if (psize == -1) {
			if (var0 <= 0) {
				return false;
			}
			stream.read(0, in.data, 1);
			var0--;
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
		if (psize > var0) {
			return false;
		}
		in.pos = 0;
		stream.read(0, in.data, psize);
		Statics.field3700 = 0;
		field1634 = field821;
		field821 = Statics.field1841;
		Statics.field1841 = ptype;
		if (ptype == 239) {
			int var1 = in.g4();
			int var2 = in.g4();
			SubInterface var3 = (SubInterface) field2395.method1049((long) var1);
			SubInterface var4 = (SubInterface) field2395.method1049((long) var2);
			if (var4 != null) {
				method672(var4, var3 == null || var3.field3229 != var4.field3229);
			}
			if (var3 != null) {
				var3.unlink();
				field2395.put((long) var2, var3);
			}
			IfType var5 = method1579(var1);
			if (var5 != null) {
				method1371(var5);
			}
			IfType var6 = method1579(var2);
			if (var6 != null) {
				method1371(var6);
				method759(true, var6);
			}
			if (field723 != -1) {
				method912(field723, 1);
			}
			ptype = -1;
			return true;
		} else if (ptype == 244) {
			int var7 = in.method320();
			int var8 = in.method339();
			int var9 = in.method312();
			IfType var10 = method1579(var7);
			var10.field3451 = 0;
			var10.field3441 = var10.field3514 = var9;
			var10.field3367 = 0;
			var10.field3366 = var10.field3391 = var8;
			method1371(var10);
			ptype = -1;
			return true;
		} else if (ptype == 79) {
			rebuildPacket(false);
			ptype = -1;
			return true;
		} else if (ptype == 12) {
			int var11 = psize + in.pos;
			int var12 = in.g2();
			int var13 = in.g2();
			if (var12 != field723) {
				field723 = var12;
				method1005(field723);
				method1334();
				method972(field723);
				for (int var14 = 0; var14 < 100; var14++) {
					field4228[var14] = true;
				}
			}
			while (var13-- > 0) {
				int var15 = in.g4();
				int var16 = in.g2();
				int var17 = in.g1();
				SubInterface var18 = (SubInterface) field2395.method1049((long) var15);
				if (var18 != null && var16 != var18.field3229) {
					method672(var18, true);
					var18 = null;
				}
				if (var18 == null) {
					var18 = method720(var17, var15, var16);
				}
				var18.field3235 = true;
			}
			for (SubInterface var19 = (SubInterface) field2395.method1047(); var19 != null; var19 = (SubInterface) field2395.method1048()) {
				if (var19.field3235) {
					var19.field3235 = false;
				} else {
					method672(var19, true);
				}
			}
			Statics.field495 = new HashTable(512);
			while (in.pos < var11) {
				int var20 = in.g4();
				int var21 = in.g2();
				int var22 = in.g2();
				int var23 = in.g4();
				for (int var24 = var21; var24 <= var22; var24++) {
					long var25 = ((long) var20 << 32) + (long) var24;
					Statics.field495.put(var25, new IntNode(var23));
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 192) {
			field3567 = true;
			Statics.field2512 = in.g1();
			ClientMouseListener.field3327 = in.g1();
			Statics.field1264 = in.g2();
			Statics.field4506 = in.g1();
			Statics.field3093 = in.g1();
			if (Statics.field3093 >= 100) {
				field3608 = ClientMouseListener.field3327 * 128 + 64;
				field1428 = Statics.field2512 * 128 + 64;
				field1954 = method1584(field1428, field3608, field2907) - Statics.field1264;
			}
			ptype = -1;
			return true;
		} else if (ptype == 186) {
			int var27 = in.g4();
			int var28 = in.g2();
			IfType var29;
			if (var27 < 0) {
				var29 = null;
			} else {
				var29 = method1579(var27);
			}
			if (var29 != null) {
				for (int var30 = 0; var30 < var29.field3388.length; var30++) {
					var29.field3388[var30] = 0;
					var29.field3474[var30] = 0;
				}
			}
			if (var27 < -70000) {
				var28 += 32768;
			}
			ClientInvCache.method20(var28);
			int var31 = in.g2();
			for (int var32 = 0; var32 < var31; var32++) {
				int var33 = in.method349();
				int var34 = in.method352();
				if (var34 == 255) {
					var34 = in.method299();
				}
				if (var29 != null && var29.field3388.length > var32) {
					var29.field3388[var32] = var33;
					var29.field3474[var32] = var34;
				}
				ClientInvCache.method1268(var28, var34, var32, var33 - 1);
			}
			if (var29 != null) {
				method1371(var29);
			}
			method867();
			Statics.field4328[Statics.field4198++ & 0x1F] = var28 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 117) {
			JagString var35 = in.gjstr();
			if (var35.method631(Statics.field3009)) {
				boolean var36 = false;
				JagString var37 = var35.method623(0, var35.method617(Statics.field1959));
				long var38 = var37.toUserhash();
				for (int var40 = 0; var40 < field1221; var40++) {
					if (field1764[var40] == var38) {
						var36 = true;
						break;
					}
				}
				if (!var36 && field563 == 0) {
					method1499(Text.field1007, 4, var37);
				}
			} else if (var35.method631(Statics.field3927)) {
				JagString var64 = var35.method623(0, var35.method617(Statics.field1959));
				boolean var65 = false;
				long var66 = var64.toUserhash();
				for (int var68 = 0; var68 < field1221; var68++) {
					if (var66 == field1764[var68]) {
						var65 = true;
						break;
					}
				}
				if (!var65 && field563 == 0) {
					JagString var69 = var35.method623(var35.method617(Statics.field1959) + 1, var35.method604() + -9);
					method1499(var69, 8, var64);
				}
			} else if (var35.method631(Statics.field1556)) {
				boolean var41 = false;
				JagString var42 = var35.method623(0, var35.method617(Statics.field1959));
				long var43 = var42.toUserhash();
				for (int var45 = 0; var45 < field1221; var45++) {
					if (field1764[var45] == var43) {
						var41 = true;
						break;
					}
				}
				if (!var41 && field563 == 0) {
					method1499(field3453, 10, var42);
				}
			} else if (var35.method631(Statics.field3334)) {
				JagString var63 = var35.method623(0, var35.method617(Statics.field3334));
				method1499(var63, 11, field3453);
			} else if (var35.method631(Statics.field731)) {
				JagString var62 = var35.method623(0, var35.method617(Statics.field731));
				if (field563 == 0) {
					method1499(var62, 12, field3453);
				}
			} else if (var35.method631(Statics.field2400)) {
				JagString var46 = var35.method623(0, var35.method617(Statics.field2400));
				if (field563 == 0) {
					method1499(var46, 13, field3453);
				}
			} else if (var35.method631(Statics.field3025)) {
				JagString var47 = var35.method623(0, var35.method617(Statics.field1959));
				long var48 = var47.toUserhash();
				boolean var50 = false;
				for (int var51 = 0; var51 < field1221; var51++) {
					if (var48 == field1764[var51]) {
						var50 = true;
						break;
					}
				}
				if (!var50 && field563 == 0) {
					method1499(field3453, 14, var47);
				}
			} else if (var35.method631(Statics.field4275)) {
				JagString var52 = var35.method623(0, var35.method617(Statics.field1959));
				long var53 = var52.toUserhash();
				boolean var55 = false;
				for (int var56 = 0; var56 < field1221; var56++) {
					if (field1764[var56] == var53) {
						var55 = true;
						break;
					}
				}
				if (!var55 && field563 == 0) {
					method1499(field3453, 15, var52);
				}
			} else if (var35.method631(Statics.field665)) {
				JagString var57 = var35.method623(0, var35.method617(Statics.field1959));
				long var58 = var57.toUserhash();
				boolean var60 = false;
				for (int var61 = 0; var61 < field1221; var61++) {
					if (field1764[var61] == var58) {
						var60 = true;
						break;
					}
				}
				if (!var60 && field563 == 0) {
					method1499(field3453, 16, var57);
				}
			} else {
				method1499(var35, 0, field3453);
			}
			ptype = -1;
			return true;
		} else if (ptype == 108) {
			int var70 = in.g1();
			if (in.g1() == 0) {
				field140[var70] = new StockMarketSlot();
			} else {
				in.pos--;
				field140[var70] = new StockMarketSlot(in);
			}
			ptype = -1;
			field2127 = field1211;
			return true;
		} else if (ptype == 213) {
			int var71 = in.g1();
			HintArrow var72 = new HintArrow();
			int var73 = var71 >> 6;
			var72.field2139 = var71 & 0x3F;
			var72.field2137 = in.g1();
			if (var72.field2137 >= 0 && var72.field2137 < field3543.length) {
				if (var72.field2139 == 1 || var72.field2139 == 10) {
					var72.field2146 = in.g2();
					in.pos += 3;
				} else if (var72.field2139 >= 2 && var72.field2139 <= 6) {
					if (var72.field2139 == 2) {
						var72.field2134 = 64;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 3) {
						var72.field2134 = 0;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 4) {
						var72.field2134 = 128;
						var72.field2150 = 64;
					}
					if (var72.field2139 == 5) {
						var72.field2134 = 64;
						var72.field2150 = 0;
					}
					if (var72.field2139 == 6) {
						var72.field2150 = 128;
						var72.field2134 = 64;
					}
					var72.field2139 = 2;
					var72.field2138 = in.g2();
					var72.field2135 = in.g2();
					var72.field2151 = in.g1();
				}
				var72.field2136 = in.g2();
				if (var72.field2136 == 65535) {
					var72.field2136 = -1;
				}
				Statics.field1171[var73] = var72;
			}
			ptype = -1;
			return true;
		} else if (ptype == 146) {
			int var74 = in.method299();
			int var75 = in.method320();
			int var76 = in.g2();
			if (var76 == 65535) {
				var76 = -1;
			}
			int var77 = in.method302();
			if (var77 == 65535) {
				var77 = -1;
			}
			for (int var78 = var76; var78 <= var77; var78++) {
				long var79 = ((long) var75 << 32) + (long) var78;
				Linkable var81 = Statics.field495.method1049(var79);
				if (var81 != null) {
					var81.unlink();
				}
				Statics.field495.put(var79, new IntNode(var74));
			}
			ptype = -1;
			return true;
		} else if (ptype == 253) {
			field3567 = false;
			for (int var82 = 0; var82 < 5; var82++) {
				Statics.field4368[var82] = false;
			}
			ptype = -1;
			return true;
		} else if (ptype == 214) {
			int var83 = in.method313();
			JagString var84 = in.gjstr();
			IfType var85 = method1579(var83);
			if (!var84.method597(var85.field3383)) {
				var85.field3383 = var84;
				method1371(var85);
			}
			ptype = -1;
			return true;
		} else if (ptype == 19) {
			method432();
			ptype = -1;
			return true;
		} else if (ptype == 205) {
			long var86 = in.g8();
			int var88 = in.g2();
			boolean var89 = false;
			byte var90 = in.g1b();
			if ((Long.MIN_VALUE & var86) != 0L) {
				var89 = true;
			}
			if (var89) {
				if (field885 == 0) {
					ptype = -1;
					return true;
				}
				long var91 = var86 & Long.MAX_VALUE;
				int var93;
				for (var93 = 0; field885 > var93 && (var91 != field1647[var93].key || var88 != field1647[var93].field1317); var93++) {
				}
				if (var93 < field885) {
					while (var93 < field885 - 1) {
						field1647[var93] = field1647[var93 + 1];
						var93++;
					}
					field885--;
					field1647[field885] = null;
				}
			} else {
				JagString var94 = in.gjstr();
				ClanChannelUser var95 = new ClanChannelUser();
				var95.key = var86;
				var95.field1323 = JagString.method1375(var95.key);
				var95.field1321 = var94;
				var95.field1317 = var88;
				var95.field1315 = var90;
				int var96;
				for (var96 = field885 - 1; var96 >= 0; var96--) {
					int var97 = field1647[var96].field1323.method625(var95.field1323);
					if (var97 == 0) {
						field1647[var96].field1317 = var88;
						field1647[var96].field1315 = var90;
						field1647[var96].field1321 = var94;
						if (field631 == var86) {
							field2631 = var90;
						}
						ptype = -1;
						Statics.field1394 = field1211;
						return true;
					}
					if (var97 < 0) {
						break;
					}
				}
				if (field1647.length <= field885) {
					ptype = -1;
					return true;
				}
				for (int var98 = field885 - 1; var98 > var96; var98--) {
					field1647[var98 + 1] = field1647[var98];
				}
				if (field885 == 0) {
					field1647 = new ClanChannelUser[100];
				}
				field1647[var96 + 1] = var95;
				field885++;
				if (var86 == field631) {
					field2631 = var90;
				}
			}
			ptype = -1;
			Statics.field1394 = field1211;
			return true;
		} else if (ptype == 235) {
			Statics.field4134 = in.gjstr();
			BZip2State.method1132(Statics.field4134);
			ptype = -1;
			return true;
		} else if (ptype == 26) {
			int var99 = in.method320();
			int var100 = in.method302();
			if (var100 == 65535) {
				var100 = -1;
			}
			IfType var101 = method1579(var99);
			if (var101.field3430 != 2 || var101.field3409 != var100) {
				var101.field3409 = var100;
				var101.field3430 = 2;
				method1371(var101);
			}
			ptype = -1;
			return true;
		} else if (ptype == 101) {
			if (psize == 0) {
				ParamType.field54 = Text.field1741;
			} else {
				ParamType.field54 = in.gjstr();
			}
			ptype = -1;
			return true;
		} else if (ptype == 191) {
			boolean var102 = in.method295() == 1;
			int var103 = in.method313();
			IfType var104 = method1579(var103);
			if (var102 != var104.field3378) {
				var104.field3378 = var102;
				method1371(var104);
			}
			ptype = -1;
			return true;
		} else if (ptype == 200) {
			int var105 = in.method313();
			IfType var106 = method1579(var105);
			for (int var107 = 0; var107 < var106.field3388.length; var107++) {
				var106.field3388[var107] = -1;
				var106.field3388[var107] = 0;
			}
			method1371(var106);
			ptype = -1;
			return true;
		} else if (ptype == 139) {
			int var108 = in.method313();
			int var109 = in.method313();
			int var110 = in.method349();
			if (var110 == 65535) {
				var110 = -1;
			}
			IfType var111 = method1579(var108);
			if (var111.field3410) {
				var111.field3399 = var110;
				var111.field3482 = var109;
				ObjType var112 = ObjType.list(var110);
				var111.field3498 = var112.field2870;
				var111.field3485 = var112.field2889;
				var111.field3509 = var112.field2872;
				var111.field3455 = var112.field2873;
				var111.field3365 = var112.field2876;
				var111.field3517 = var112.field2847;
				if (var111.field3468 > 0) {
					var111.field3485 = var111.field3485 * 32 / var111.field3468;
				} else if (var111.field3501 > 0) {
					var111.field3485 = var111.field3485 * 32 / var111.field3501;
				}
				method1371(var111);
			} else if (var110 == -1) {
				ptype = -1;
				var111.field3430 = 0;
				return true;
			} else {
				ObjType var113 = ObjType.list(var110);
				var111.field3485 = var113.field2889 * 100 / var109;
				var111.field3509 = var113.field2872;
				var111.field3430 = 4;
				var111.field3455 = var113.field2873;
				var111.field3409 = var110;
				method1371(var111);
			}
			ptype = -1;
			return true;
		} else if (ptype == 230) {
			int var114 = in.method295();
			int var115 = var114 >> 2;
			int var116 = var114 & 0x3;
			int var117 = Statics.field1792[var115];
			int var118 = in.g2();
			if (var118 == 65535) {
				var118 = -1;
			}
			int var119 = in.method320();
			int var120 = var119 >> 28 & 0x3;
			int var121 = var119 & 0x3FFF;
			int var122 = var119 >> 14 & 0x3FFF;
			int var123 = var122 - field4212;
			int var124 = var121 - field3679;
			method774(var115, var123, var117, var116, var120, var124, var118);
			ptype = -1;
			return true;
		} else if (ptype == 77) {
			int var125 = in.method313();
			int var126 = in.method302();
			int var127 = in.g2();
			int var128 = in.g2();
			if (var125 >> 30 != 0) {
				int var133 = var125 >> 28 & 0x3;
				int var134 = (var125 >> 14 & 0x3FFF) - field4212;
				int var135 = (var125 & 0x3FFF) - field3679;
				if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
					int var136 = var135 * 128 + 64;
					int var137 = var134 * 128 + 64;
					MapSpotAnim var138 = new MapSpotAnim(var126, var133, var137, var136, method1584(var137, var136, var133) - var128, var127, field2113);
					field714.push(new MapSpotAnimNode(var138));
				}
			} else if (var125 >> 29 != 0) {
				int var129 = var125 & 0xFFFF;
				ClientNpc var130 = field4223[var129];
				if (var130 != null) {
					var130.field4080 = var126;
					if (var130.field4080 == 65535) {
						var130.field4080 = -1;
					}
					var130.field4075 = 0;
					var130.field4082 = field2113 + var127;
					var130.field4125 = var128;
					if (field2113 < var130.field4082) {
						var130.field4075 = -1;
					}
					var130.field4120 = 0;
				}
			} else if (var125 >> 28 != 0) {
				int var131 = var125 & 0xFFFF;
				ClientPlayer var132;
				if (selfSlot == var131) {
					var132 = localPlayer;
				} else {
					var132 = field4491[var131];
				}
				if (var132 != null) {
					var132.field4120 = 0;
					var132.field4125 = var128;
					var132.field4075 = 0;
					var132.field4080 = var126;
					if (var132.field4080 == 65535) {
						var132.field4080 = -1;
					}
					var132.field4082 = field2113 + var127;
					if (field2113 < var132.field4082) {
						var132.field4075 = -1;
					}
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 188) {
			field1221 = psize / 8;
			for (int var139 = 0; var139 < field1221; var139++) {
				field1764[var139] = in.g8();
				field2741[var139] = JagString.method1375(field1764[var139]);
			}
			field313 = field1211;
			ptype = -1;
			return true;
		} else if (ptype == 22) {
			GameShell.method725(in);
			ptype = -1;
			return true;
		} else if (ptype == 221) {
			int var140 = in.g1();
			int var141 = in.g1();
			int var142 = in.g1();
			int var143 = in.g1();
			int var144 = in.g2();
			Statics.field4368[var140] = true;
			Statics.field3834[var140] = var141;
			Statics.field1194[var140] = var142;
			Statics.field3714[var140] = var143;
			Statics.field3674[var140] = var144;
			ptype = -1;
			return true;
		} else if (ptype == 86) {
			int var145 = in.g1();
			int var146 = in.method302();
			if (var145 == 1) {
				World.method579();
				for (int var147 = 0; var147 < 4; var147++) {
					collision[var147].method643();
				}
				System.gc();
			} else if (var145 == 2) {
				Statics.method1378();
				System.gc();
				setMainState(25);
			}
			field723 = var146;
			method1005(var146);
			method1334();
			method972(field723);
			for (int var148 = 0; var148 < 100; var148++) {
				field4228[var148] = true;
			}
			ptype = -1;
			return true;
		} else if (ptype == 16) {
			long var149 = in.g8();
			boolean var151 = true;
			int var152 = in.g2();
			int var153 = in.g1();
			if (var149 < 0L) {
				var151 = false;
				var149 &= Long.MAX_VALUE;
			}
			JagString var154 = field3453;
			if (var152 > 0) {
				var154 = in.gjstr();
			}
			JagString var155 = JagString.method1375(var149).method614();
			for (int var156 = 0; var156 < field2729; var156++) {
				if (field2086[var156] == var149) {
					if (var152 != Statics.field3092[var156]) {
						Statics.field3092[var156] = var152;
						if (var152 > 0) {
							method1499(JagString.join(new JagString[] { var155, Text.field3321 }), 5, field3453);
						}
						if (var152 == 0) {
							method1499(JagString.join(new JagString[] { var155, Text.field2123 }), 5, field3453);
						}
					}
					var155 = null;
					Statics.field3238[var156] = var154;
					Statics.field845[var156] = var153;
					Statics.field1120[var156] = var151;
					break;
				}
			}
			if (var155 != null && field2729 < 200) {
				field2086[field2729] = var149;
				Statics.field370[field2729] = var155;
				Statics.field3092[field2729] = var152;
				Statics.field3238[field2729] = var154;
				Statics.field845[field2729] = var153;
				Statics.field1120[field2729] = var151;
				field2729++;
			}
			field313 = field1211;
			int var157 = field2729;
			while (var157 > 0) {
				boolean var158 = true;
				var157--;
				for (int var159 = 0; var159 < var157; var159++) {
					if (worldid != Statics.field3092[var159] && worldid == Statics.field3092[var159 + 1] || Statics.field3092[var159] == 0 && Statics.field3092[var159 + 1] != 0) {
						var158 = false;
						int var160 = Statics.field3092[var159];
						Statics.field3092[var159] = Statics.field3092[var159 + 1];
						Statics.field3092[var159 + 1] = var160;
						JagString var161 = Statics.field3238[var159];
						Statics.field3238[var159] = Statics.field3238[var159 + 1];
						Statics.field3238[var159 + 1] = var161;
						JagString var162 = Statics.field370[var159];
						Statics.field370[var159] = Statics.field370[var159 + 1];
						Statics.field370[var159 + 1] = var162;
						long var163 = field2086[var159];
						field2086[var159] = field2086[var159 + 1];
						field2086[var159 + 1] = var163;
						int var165 = Statics.field845[var159];
						Statics.field845[var159] = Statics.field845[var159 + 1];
						Statics.field845[var159 + 1] = var165;
						boolean var166 = Statics.field1120[var159];
						Statics.field1120[var159] = Statics.field1120[var159 + 1];
						Statics.field1120[var159 + 1] = var166;
					}
				}
				if (var158) {
					break;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 249) {
			int var167 = in.method302();
			int var168 = in.g4();
			int var169 = var167 >> 10 & 0x1F;
			int var170 = var167 >> 5 & 0x1F;
			int var171 = var167 & 0x1F;
			int var172 = (var171 << 3) + (var169 << 19) + (var170 << 11);
			IfType var173 = method1579(var168);
			if (var172 != var173.field3414) {
				var173.field3414 = var172;
				method1371(var173);
			}
			ptype = -1;
			return true;
		} else if (ptype == 68) {
			method867();
			Statics.field4458 = in.g1();
			ptype = -1;
			Statics.field3952 = field1211;
			return true;
		} else if (ptype == 24) {
			for (int var174 = 0; var174 < VarCache.field2050.length; var174++) {
				if (VarCache.field2050[var174] != Statics.field3245[var174]) {
					VarCache.field2050[var174] = Statics.field3245[var174];
					method1068(var174);
					Statics.field4495[Statics.field4244++ & 0x1F] = var174;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 74) {
			long var175 = in.g8();
			in.g1b();
			long var177 = in.g8();
			long var179 = (long) in.g2();
			long var181 = (long) in.g3();
			int var183 = in.g1();
			long var184 = (var179 << 32) + var181;
			boolean var186 = false;
			int var187 = 0;
			label1332: while (true) {
				if (var187 >= 100) {
					if (var183 <= 1) {
						if (field4428 == 1 || field3535 == 1) {
							var186 = true;
						} else {
							for (int var188 = 0; var188 < field1221; var188++) {
								if (field1764[var188] == var175) {
									var186 = true;
									break label1332;
								}
							}
						}
					}
					break;
				}
				if (Statics.field3203[var187] == var184) {
					var186 = true;
					break;
				}
				var187++;
			}
			if (!var186 && field563 == 0) {
				Statics.field3203[Statics.field1150] = var184;
				Statics.field1150 = (Statics.field1150 + 1) % 100;
				JagString var189 = PixfontGeneric.method162(Statics.method103(in).method622());
				if (var183 == 2 || var183 == 3) {
					method428(JagString.join(new JagString[] { Statics.field472, JagString.method1375(var175).method614() }), var189, JagString.method1375(var177).method614());
				} else if (var183 == 1) {
					method428(JagString.join(new JagString[] { Statics.field3201, JagString.method1375(var175).method614() }), var189, JagString.method1375(var177).method614());
				} else {
					method428(JagString.method1375(var175).method614(), var189, JagString.method1375(var177).method614());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 134) {
			Statics.field2910 = in.method319();
			Statics.field2213 = in.g1();
			while (psize > in.pos) {
				ptype = in.g1();
				method1598();
			}
			ptype = -1;
			return true;
		} else if (ptype == 84) {
			Statics.field2078 = in.g1();
			ptype = -1;
			field313 = field1211;
			return true;
		} else if (ptype == 6) {
			long var190 = in.g8();
			long var192 = (long) in.g2();
			long var194 = (long) in.g3();
			int var196 = in.g1();
			long var197 = (var192 << 32) + var194;
			boolean var199 = false;
			int var200 = 0;
			label1367: while (true) {
				if (var200 >= 100) {
					if (var196 <= 1) {
						if (field4428 == 1 || field3535 == 1) {
							var199 = true;
						} else {
							for (int var201 = 0; var201 < field1221; var201++) {
								if (var190 == field1764[var201]) {
									var199 = true;
									break label1367;
								}
							}
						}
					}
					break;
				}
				if (Statics.field3203[var200] == var197) {
					var199 = true;
					break;
				}
				var200++;
			}
			if (!var199 && field563 == 0) {
				Statics.field3203[Statics.field1150] = var197;
				Statics.field1150 = (Statics.field1150 + 1) % 100;
				JagString var202 = PixfontGeneric.method162(Statics.method103(in).method622());
				if (var196 == 2 || var196 == 3) {
					method1499(var202, 7, JagString.join(new JagString[] { Statics.field472, JagString.method1375(var190).method614() }));
				} else if (var196 == 1) {
					method1499(var202, 7, JagString.join(new JagString[] { Statics.field3201, JagString.method1375(var190).method614() }));
				} else {
					method1499(var202, 3, JagString.method1375(var190).method614());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 237) {
			Statics.field1206 = in.g1();
			Statics.field142 = in.g1();
			Statics.field2408 = in.g1();
			ptype = -1;
			return true;
		} else if (ptype == 96) {
			int var203 = in.method343();
			if (var203 == 65535) {
				var203 = -1;
			}
			int var204 = in.method299();
			IfType var205 = method1579(var204);
			if (var205.field3430 != 1 || var203 != var205.field3409) {
				var205.field3430 = 1;
				var205.field3409 = var203;
				method1371(var205);
			}
			ptype = -1;
			return true;
		} else if (ptype == 149) {
			int var206 = in.method302();
			int var207 = in.method319();
			int var208 = in.g2();
			ClientNpc var209 = field4223[var208];
			if (var209 != null) {
				method925(var206, var207, var209);
			}
			ptype = -1;
			return true;
		} else if (ptype == 248) {
			for (int var210 = 0; var210 < field4491.length; var210++) {
				if (field4491[var210] != null) {
					field4491[var210].field4077 = -1;
				}
			}
			for (int var211 = 0; var211 < field4223.length; var211++) {
				if (field4223[var211] != null) {
					field4223[var211].field4077 = -1;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 187) {
			long var212 = in.g8();
			int var214 = in.g2();
			JagString var215 = QuickChatPhraseType.method1150(var214).method1409(in);
			method801(var215, var214, JagString.method1375(var212).method614(), 19, null);
			ptype = -1;
			return true;
		} else if (ptype == 177) {
			int var216 = in.method320();
			field912 = signlink.method1292(var216);
			ptype = -1;
			return true;
		} else if (ptype == 88) {
			Statics.field2213 = in.method319();
			Statics.field2910 = in.method295();
			for (int var217 = Statics.field2213; var217 < Statics.field2213 + 8; var217++) {
				for (int var218 = Statics.field2910; var218 < Statics.field2910 + 8; var218++) {
					if (field2497[field2907][var217][var218] != null) {
						field2497[field2907][var217][var218] = null;
						method175(var217, var218);
					}
				}
			}
			for (LocChange var219 = (LocChange) field1140.head(); var219 != null; var219 = (LocChange) field1140.method1619()) {
				if (Statics.field2213 <= var219.field3059 && var219.field3059 < Statics.field2213 + 8 && Statics.field2910 <= var219.field3052 && var219.field3052 < Statics.field2910 + 8 && var219.field3055 == field2907) {
					var219.field3061 = 0;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 203) {
			long var220 = in.g8();
			long var222 = (long) in.g2();
			long var224 = (long) in.g3();
			int var226 = in.g1();
			int var227 = in.g2();
			long var228 = var224 + (var222 << 32);
			boolean var230 = false;
			int var231 = 0;
			label1401: while (true) {
				if (var231 >= 100) {
					if (var226 <= 1) {
						for (int var232 = 0; var232 < field1221; var232++) {
							if (var220 == field1764[var232]) {
								var230 = true;
								break label1401;
							}
						}
					}
					break;
				}
				if (var228 == Statics.field3203[var231]) {
					var230 = true;
					break;
				}
				var231++;
			}
			if (!var230 && field563 == 0) {
				Statics.field3203[Statics.field1150] = var228;
				Statics.field1150 = (Statics.field1150 + 1) % 100;
				JagString var233 = QuickChatPhraseType.method1150(var227).method1409(in);
				if (var226 == 2) {
					method801(var233, var227, JagString.join(new JagString[] { Statics.field472, JagString.method1375(var220).method614() }), 18, null);
				} else if (var226 == 1) {
					method801(var233, var227, JagString.join(new JagString[] { Statics.field3201, JagString.method1375(var220).method614() }), 18, null);
				} else {
					method801(var233, var227, JagString.method1375(var220).method614(), 18, null);
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 17) {
			int var234 = in.g4();
			int var235 = in.g2();
			if (var234 < -70000) {
				var235 += 32768;
			}
			IfType var236;
			if (var234 < 0) {
				var236 = null;
			} else {
				var236 = method1579(var234);
			}
			while (in.pos < psize) {
				int var237 = in.method350();
				int var238 = in.g2();
				int var239 = 0;
				if (var238 != 0) {
					var239 = in.g1();
					if (var239 == 255) {
						var239 = in.g4();
					}
				}
				if (var236 != null && var237 >= 0 && var237 < var236.field3388.length) {
					var236.field3388[var237] = var238;
					var236.field3474[var237] = var239;
				}
				ClientInvCache.method1268(var235, var239, var237, var238 - 1);
			}
			if (var236 != null) {
				method1371(var236);
			}
			method867();
			Statics.field4328[Statics.field4198++ & 0x1F] = var235 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 11) {
			byte var240 = in.method335();
			int var241 = in.method302();
			Statics.field3245[var241] = var240;
			if (var240 != VarCache.field2050[var241]) {
				VarCache.field2050[var241] = var240;
				method1068(var241);
			}
			Statics.field4495[Statics.field4244++ & 0x1F] = var241;
			ptype = -1;
			return true;
		} else if (ptype == 100) {
			int var242 = in.g4();
			IfType var243 = method1579(var242);
			var243.field3430 = 3;
			var243.field3409 = localPlayer.field768.method1427();
			method1371(var243);
			ptype = -1;
			return true;
		} else if (ptype == 25) {
			int var244 = in.g4();
			int var245 = in.g2();
			int var246 = in.g1();
			SubInterface var247 = (SubInterface) field2395.method1049((long) var244);
			if (var247 != null) {
				method672(var247, var247.field3229 != var245);
			}
			method720(var246, var244, var245);
			ptype = -1;
			return true;
		} else if (ptype == 10) {
			int var248 = in.method343();
			if (var248 == 65535) {
				var248 = -1;
			}
			method788(var248);
			ptype = -1;
			return true;
		} else if (ptype == 89) {
			int var249 = in.method302();
			if (var249 == 65535) {
				var249 = -1;
			}
			int var250 = in.method340();
			TitleScreen.method23(var249, var250);
			ptype = -1;
			return true;
		} else if (ptype == 66) {
			byte[] var251 = new byte[psize];
			in.method29(psize, var251);
			BZip2State.method1138(JagString.method395(0, var251, psize));
			ptype = -1;
			return true;
		} else if (ptype == 53) {
			JagString var252 = in.gjstr();
			Object[] var253 = new Object[var252.method604() + 1];
			for (int var254 = var252.method604() - 1; var254 >= 0; var254--) {
				if (var252.method599(var254) == 115) {
					var253[var254 + 1] = in.gjstr();
				} else {
					var253[var254 + 1] = Integer.valueOf(in.g4());
				}
			}
			var253[0] = Integer.valueOf(in.g4());
			HookReq var255 = new HookReq();
			var255.field681 = var253;
			ScriptRunner.method1373(var255);
			ptype = -1;
			return true;
		} else if (ptype == 229) {
			Statics.field1394 = field1211;
			long var256 = in.g8();
			if (var256 == 0L) {
				field885 = 0;
				Statics.field4182 = null;
				Statics.field4219 = null;
				ptype = -1;
				field1647 = null;
				return true;
			}
			long var258 = in.g8();
			Statics.field4182 = JagString.method1375(var258);
			Statics.field4219 = JagString.method1375(var256);
			Statics.field3301 = in.g1b();
			int var260 = in.g1();
			if (var260 == 255) {
				ptype = -1;
				return true;
			}
			field885 = var260;
			ClanChannelUser[] var261 = new ClanChannelUser[100];
			for (int var262 = 0; var262 < field885; var262++) {
				var261[var262] = new ClanChannelUser();
				var261[var262].key = in.g8();
				var261[var262].field1323 = JagString.method1375(var261[var262].key);
				var261[var262].field1317 = in.g2();
				var261[var262].field1315 = in.g1b();
				var261[var262].field1321 = in.gjstr();
				if (field631 == var261[var262].key) {
					field2631 = var261[var262].field1315;
				}
			}
			int var263 = field885;
			while (var263 > 0) {
				var263--;
				boolean var264 = true;
				for (int var265 = 0; var265 < var263; var265++) {
					if (var261[var265].field1323.method625(var261[var265 + 1].field1323) > 0) {
						ClanChannelUser var266 = var261[var265];
						var264 = false;
						var261[var265] = var261[var265 + 1];
						var261[var265 + 1] = var266;
					}
				}
				if (var264) {
					break;
				}
			}
			field1647 = var261;
			ptype = -1;
			return true;
		} else if (ptype == 129) {
			long var267 = in.g8();
			in.g1b();
			long var269 = in.g8();
			long var271 = (long) in.g2();
			long var273 = (long) in.g3();
			long var275 = var273 + (var271 << 32);
			int var277 = in.g1();
			int var278 = in.g2();
			boolean var279 = false;
			int var280 = 0;
			label1447: while (true) {
				if (var280 >= 100) {
					if (var277 <= 1) {
						for (int var281 = 0; var281 < field1221; var281++) {
							if (var267 == field1764[var281]) {
								var279 = true;
								break label1447;
							}
						}
					}
					break;
				}
				if (var275 == Statics.field3203[var280]) {
					var279 = true;
					break;
				}
				var280++;
			}
			if (!var279 && field563 == 0) {
				Statics.field3203[Statics.field1150] = var275;
				Statics.field1150 = (Statics.field1150 + 1) % 100;
				JagString var282 = QuickChatPhraseType.method1150(var278).method1409(in);
				if (var277 == 2 || var277 == 3) {
					method801(var282, var278, JagString.join(new JagString[] { Statics.field472, JagString.method1375(var267).method614() }), 20, JagString.method1375(var269).method614());
				} else if (var277 == 1) {
					method801(var282, var278, JagString.join(new JagString[] { Statics.field3201, JagString.method1375(var267).method614() }), 20, JagString.method1375(var269).method614());
				} else {
					method801(var282, var278, JagString.method1375(var267).method614(), 20, JagString.method1375(var269).method614());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 166) {
			if (field723 != -1) {
				method912(field723, 0);
			}
			ptype = -1;
			return true;
		} else if (ptype == 21) {
			rebuildPacket(true);
			ptype = -1;
			return true;
		} else if (ptype == 233) {
			JagString var283 = in.gjstr();
			int var284 = in.g1();
			int var285 = in.g1();
			if (var284 >= 1 && var284 <= 8) {
				if (var283.method624(Statics.field3572)) {
					var283 = null;
				}
				Statics.field2436[var284 - 1] = var283;
				Statics.field3875[var284 - 1] = var285 == 0;
			}
			ptype = -1;
			return true;
		} else if (ptype == 70) {
			for (int var286 = 0; var286 < VarpType.field465; var286++) {
				VarpType var287 = VarpType.method732(var286);
				if (var287 != null && var287.field4288 == 0) {
					Statics.field3245[var286] = 0;
					VarCache.field2050[var286] = 0;
				}
			}
			method867();
			Statics.field4244 += 32;
			ptype = -1;
			return true;
		} else if (ptype == 123 || ptype == 52 || ptype == 232 || ptype == 61 || ptype == 135 || ptype == 173 || ptype == 150 || ptype == 198 || ptype == 99 || ptype == 171 || ptype == 75 || ptype == 44) {
			method1598();
			ptype = -1;
			return true;
		} else if (ptype == 120) {
			int var288 = in.method349();
			int var289 = in.method349();
			int var290 = in.method313();
			int var291 = in.method343();
			IfType var292 = method1579(var290);
			if (var291 != var292.field3455 || var292.field3509 != var289 || var288 != var292.field3485) {
				var292.field3509 = var289;
				var292.field3485 = var288;
				var292.field3455 = var291;
				method1371(var292);
			}
			ptype = -1;
			return true;
		} else if (ptype == 54) {
			method867();
			Statics.field3788 = in.method334();
			Statics.field3952 = field1211;
			ptype = -1;
			return true;
		} else if (ptype == 114) {
			int var293 = in.g1();
			int var294 = in.method352();
			int var295 = in.method295();
			field2907 = var293 >> 1;
			localPlayer.method1474((var293 & 0x1) == 1, var295, var294);
			ptype = -1;
			return true;
		} else if (ptype == 162) {
			int var296 = in.method299();
			int var297 = in.method339();
			IfType var298 = method1579(var296);
			if (var297 != var298.field3404 || var297 == -1) {
				var298.field3404 = var297;
				var298.field3487 = 0;
				var298.field3379 = 0;
				method1371(var298);
			}
			ptype = -1;
			return true;
		} else if (ptype == 163) {
			Statics.field2213 = in.g1();
			Statics.field2910 = in.method319();
			ptype = -1;
			return true;
		} else if (ptype == 116) {
			method210();
			ptype = -1;
			return true;
		} else if (ptype == 223) {
			field3567 = true;
			Statics.field848 = in.g1();
			TextureOp.field368 = in.g1();
			Statics.field1200 = in.g2();
			Statics.field130 = in.g1();
			Statics.field2742 = in.g1();
			if (Statics.field2742 >= 100) {
				int var299 = Statics.field848 * 128 + 64;
				int var300 = TextureOp.field368 * 128 + 64;
				int var301 = method1584(var299, var300, field2907) - Statics.field1200;
				int var302 = var299 - field1428;
				int var303 = var300 - field3608;
				int var304 = var301 - field1954;
				int var305 = (int) Math.sqrt((double) (var302 * var302 + var303 * var303));
				field3934 = (int) (Math.atan2((double) var304, (double) var305) * 325.949D) & 0x7FF;
				field3257 = (int) (-325.949D * Math.atan2((double) var302, (double) var303)) & 0x7FF;
				if (field3934 < 128) {
					field3934 = 128;
				}
				if (field3934 > 383) {
					field3934 = 383;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 241) {
			int var306 = in.g2();
			ClientInvCache.method996(var306);
			Statics.field4328[Statics.field4198++ & 0x1F] = var306 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 147) {
			minimapState = in.g1();
			ptype = -1;
			return true;
		} else if (ptype == 243) {
			int var307 = in.method343();
			int var308 = in.method349();
			field1173 = var307;
			field3930 = var308;
			method905();
			ptype = -1;
			return true;
		} else if (ptype == 189) {
			Statics.field580 = (short) in.g2();
			if (Statics.field580 <= 0) {
				Statics.field580 = 256;
			}
			Statics.field921 = (short) in.method349();
			ptype = -1;
			if (Statics.field921 <= 0) {
				Statics.field921 = 205;
			}
			return true;
		} else if (ptype == 220) {
			int var309 = in.method313();
			int var310 = in.method349();
			IfType var311 = method1579(var309);
			if (var311 != null && var311.field3390 == 0) {
				if (var311.field3375 - var311.field3422 < var310) {
					var310 = var311.field3375 - var311.field3422;
				}
				if (var310 < 0) {
					var310 = 0;
				}
				if (var311.field3415 != var310) {
					var311.field3415 = var310;
					method1371(var311);
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 4) {
			int var312 = in.method302();
			int var313 = in.g2();
			int var314 = in.method320();
			IfType var315 = method1579(var314);
			ptype = -1;
			var315.field3385 = (var313 << 16) + var312;
			return true;
		} else if (ptype == 197) {
			Statics.field3083 = (short) in.method302();
			if (Statics.field3083 <= 0) {
				Statics.field3083 = 320;
			}
			Statics.field4175 = (short) in.method349();
			ptype = -1;
			if (Statics.field4175 <= 0) {
				Statics.field4175 = 256;
			}
			return true;
		} else if (ptype == 113) {
			int var316 = in.g2();
			int var317 = in.g1();
			int var318 = in.g2();
			if (var316 == 65535) {
				var316 = -1;
			}
			method668(var317, var318, var316);
			ptype = -1;
			return true;
		} else if (ptype == 242) {
			int var319 = in.g4();
			SubInterface var320 = (SubInterface) field2395.method1049((long) var319);
			if (var320 != null) {
				method672(var320, true);
			}
			if (field967 != null) {
				method1371(field967);
				field967 = null;
			}
			ptype = -1;
			return true;
		} else if (ptype == 72) {
			int var321 = in.method349();
			int var322 = in.method299();
			Statics.field3245[var321] = var322;
			if (VarCache.field2050[var321] != var322) {
				VarCache.field2050[var321] = var322;
				method1068(var321);
			}
			Statics.field4495[Statics.field4244++ & 0x1F] = var321;
			ptype = -1;
			return true;
		} else if (ptype == 65) {
			Statics.field926 = (short) in.g2();
			if (Statics.field926 <= 0) {
				Statics.field926 = 32767;
			} else if (Statics.field926 < Statics.field2527) {
				Statics.field926 = Statics.field2527;
			}
			field1578 = (short) in.method343();
			if (field1578 <= 0) {
				field1578 = 1;
			}
			Statics.field4179 = (short) in.method343();
			if (Statics.field4179 <= 0) {
				Statics.field4179 = 32767;
			} else if (Statics.field4179 < field1578) {
				Statics.field4179 = field1578;
			}
			Statics.field2527 = (short) in.method302();
			if (Statics.field2527 <= 0) {
				Statics.field2527 = 1;
			}
			ptype = -1;
			return true;
		} else if (ptype == 240) {
			method785();
			ptype = -1;
			return false;
		} else if (ptype == 204) {
			method867();
			int var323 = in.method295();
			int var324 = in.method319();
			int var325 = in.method313();
			Statics.field3562[var323] = var325;
			Statics.field1907[var323] = var324;
			Statics.field4066[var323] = 1;
			for (int var326 = 0; var326 < 98; var326++) {
				if (var325 >= Statics.field1710[var326]) {
					Statics.field4066[var323] = var326 + 2;
				}
			}
			Statics.field2642[Statics.field2131++ & 0x1F] = var323;
			ptype = -1;
			return true;
		} else if (ptype == 255) {
			field2102 = 0;
			ptype = -1;
			return true;
		} else if (ptype == 172) {
			long var327 = in.g8();
			JagString var329 = PixfontGeneric.method162(Statics.method103(in).method622());
			method1499(var329, 6, JagString.method1375(var327).method614());
			ptype = -1;
			return true;
		} else if (ptype == 110) {
			ReflectionChecker.method1535(signlink, psize, in);
			ptype = -1;
			return true;
		} else if (ptype == 184) {
			Statics.field2061 = in.method343() * 30;
			ptype = -1;
			Statics.field3952 = field1211;
			return true;
		} else {
			JagException.report("T1 - " + ptype + "," + field821 + "," + field1634 + " - " + psize, null);
			method785();
			return true;
		}
	}

	@ObfuscatedName("we.b(I)V")
	public static void method1598() {
		if (ptype == 123) {
			int var0 = in.g1();
			int var1 = Statics.field2910 * 2 + (var0 & 0xF);
			int var2 = (var0 >> 4 & 0xF) + Statics.field2213 * 2;
			int var3 = in.g1b() + var2;
			int var4 = var1 + in.g1b();
			int var5 = in.method334();
			int var6 = in.g2();
			int var7 = in.g1() * 4;
			int var8 = in.g1() * 4;
			int var9 = in.g2();
			int var10 = in.g2();
			int var11 = in.g1();
			int var12 = in.g1();
			if (var2 >= 0 && var1 >= 0 && var2 < 208 && var1 < 208 && var3 >= 0 && var4 >= 0 && var3 < 208 && var4 < 208 && var6 != 65535) {
				int var13 = var1 * 64;
				int var14 = var2 * 64;
				int var15 = var4 * 64;
				ClientProj var16 = new ClientProj(var6, field2907, var14, var13, method1584(var14, var13, field2907) - var7, var9 - -field2113, field2113 + var10, var11, var12, var5, var8);
				int var17 = var3 * 64;
				var16.method520(var17, var9 + field2113, method1584(var17, var15, field2907) + -var8, var15);
				field3220.push(new ClientProjNode2(var16));
			}
		} else if (ptype == 135) {
			int var18 = in.method319();
			int var19 = (var18 & 0x7) + Statics.field2910;
			int var20 = Statics.field2213 + (var18 >> 4 & 0x7);
			int var21 = in.method302();
			int var22 = in.method349();
			int var23 = in.method349();
			if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104 && var22 != selfSlot) {
				ClientObj var24 = new ClientObj();
				var24.field2029 = var23;
				var24.field2030 = var21;
				if (field2497[field2907][var20][var19] == null) {
					field2497[field2907][var20][var19] = new LinkList();
				}
				field2497[field2907][var20][var19].push(new ClientObjNode(var24));
				method175(var20, var19);
			}
		} else if (ptype == 173) {
			int var25 = in.g1();
			int var26 = Statics.field2910 + (var25 & 0x7);
			int var27 = (var25 >> 4 & 0x7) + Statics.field2213;
			int var28 = in.g2();
			int var29 = in.g1();
			int var30 = in.g2();
			if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
				int var31 = var27 * 128 + 64;
				int var32 = var26 * 128 + 64;
				MapSpotAnim var33 = new MapSpotAnim(var28, field2907, var31, var32, method1584(var31, var32, field2907) - var29, var30, field2113);
				field714.push(new MapSpotAnimNode(var33));
			}
		} else if (ptype == 232) {
			int var34 = in.g1();
			int var35 = (var34 & 0x7) + Statics.field2910;
			int var36 = (var34 >> 4 & 0x7) + Statics.field2213;
			int var37 = in.g2();
			int var38 = in.g2();
			int var39 = in.g2();
			if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
				LinkList var40 = field2497[field2907][var36][var35];
				if (var40 != null) {
					for (ClientObjNode var41 = (ClientObjNode) var40.head(); var41 != null; var41 = (ClientObjNode) var40.method1619()) {
						ClientObj var42 = var41.field4258;
						if ((var37 & 0x7FFF) == var42.field2030 && var42.field2029 == var38) {
							var42.field2029 = var39;
							break;
						}
					}
					method175(var36, var35);
				}
			}
		} else if (ptype == 44) {
			int var43 = in.g1();
			int var44 = var43 >> 2;
			int var45 = var43 & 0x3;
			int var46 = Statics.field1792[var44];
			int var47 = in.method302();
			int var48 = in.method319();
			int var49 = Statics.field2213 + (var48 >> 4 & 0x7);
			int var50 = Statics.field2910 + (var48 & 0x7);
			if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
				method1486(0, var50, var46, var45, -1, var44, field2907, var49, var47);
			}
		} else if (ptype == 171) {
			int var51 = in.method319();
			int var52 = var51 & 0x3;
			int var53 = var51 >> 2;
			int var54 = Statics.field1792[var53];
			int var55 = in.method343();
			if (var55 == 65535) {
				var55 = -1;
			}
			int var56 = in.method352();
			int var57 = (var56 >> 4 & 0x7) + Statics.field2213;
			int var58 = Statics.field2910 + (var56 & 0x7);
			method774(var53, var57, var54, var52, field2907, var58, var55);
		} else {
			if (ptype == 61) {
				int var59 = in.g2();
				int var60 = in.method295();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = Statics.field1792[var61];
				int var64 = in.g2();
				byte var65 = in.method303();
				byte var66 = in.method335();
				byte var67 = in.g1b();
				byte var68 = in.method335();
				int var69 = in.g2();
				int var70 = in.g1();
				int var71 = Statics.field2910 + (var70 & 0x7);
				int var72 = (var70 >> 4 & 0x7) + Statics.field2213;
				int var73 = in.method349();
				ClientPlayer var74;
				if (selfSlot == var59) {
					var74 = localPlayer;
				} else {
					var74 = field4491[var59];
				}
				if (var74 != null) {
					LocType var75 = LocType.list(var64);
					int var76;
					int var77;
					if (var62 == 1 || var62 == 3) {
						var76 = var75.field2774;
						var77 = var75.field2794;
					} else {
						var77 = var75.field2774;
						var76 = var75.field2794;
					}
					int var78 = (var77 >> 1) + var72;
					int var79 = var72 + (var77 + 1 >> 1);
					int var80 = (var76 >> 1) + var71;
					int var81 = (var76 + 1 >> 1) + var71;
					int[][] var82 = ClientBuild.field1137[field2907];
					int var83 = (var77 << 6) + (var72 << 7);
					int var84 = var82[var79][var81] + var82[var79][var80] + var82[var78][var80] + var82[var78][var81] >> 2;
					int var85 = (var76 << 6) + (var71 << 7);
					int[][] var86 = null;
					if (field2907 < 3) {
						var86 = ClientBuild.field1137[field2907 + 1];
					}
					ModelCacheLit var87 = var75.method997(var61, var86, var82, var83, false, var85, var62, var84);
					if (var87 != null) {
						method1486(var69 + 1, var71, var63, 0, var73 + 1, 0, field2907, var72, -1);
						var74.field759 = var84;
						var74.field755 = field2113 + var69;
						var74.field757 = var76 * 64 + var71 * 128;
						var74.field758 = (ModelLit) var87.field3984;
						var74.field773 = var72 * 128 + var77 * 64;
						if (var66 > var67) {
							byte var88 = var66;
							var66 = var67;
							var67 = var88;
						}
						var74.field764 = var66 + var72;
						var74.field744 = var67 + var72;
						if (var65 < var68) {
							byte var89 = var68;
							var68 = var65;
							var65 = var89;
						}
						var74.field741 = var71 + var68;
						var74.field745 = var71 + var65;
						var74.field762 = field2113 + var73;
					}
				}
			}
			if (ptype == 99) {
				int var90 = in.g1();
				int var91 = (var90 & 0x7) + Statics.field2910;
				int var92 = (var90 >> 4 & 0x7) + Statics.field2213;
				int var93 = in.method349();
				int var94 = in.method302();
				if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104) {
					ClientObj var95 = new ClientObj();
					var95.field2029 = var94;
					var95.field2030 = var93;
					if (field2497[field2907][var92][var91] == null) {
						field2497[field2907][var92][var91] = new LinkList();
					}
					field2497[field2907][var92][var91].push(new ClientObjNode(var95));
					method175(var92, var91);
				}
			} else if (ptype == 150) {
				int var96 = in.g1();
				int var97 = Statics.field2213 + (var96 >> 4 & 0x7);
				int var98 = (var96 & 0x7) + Statics.field2910;
				int var99 = var97 + in.g1b();
				int var100 = in.g1b() + var98;
				int var101 = in.method334();
				int var102 = in.g2();
				int var103 = in.g1() * 4;
				int var104 = in.g1() * 4;
				int var105 = in.g2();
				int var106 = in.g2();
				int var107 = in.g1();
				int var108 = in.g1();
				if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104 && var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var102 != 65535) {
					int var109 = var97 * 128 + 64;
					int var110 = var100 * 128 + 64;
					int var111 = var99 * 128 + 64;
					int var112 = var98 * 128 + 64;
					ClientProj var113 = new ClientProj(var102, field2907, var109, var112, method1584(var109, var112, field2907) - var103, field2113 + var105, var106 + field2113, var107, var108, var101, var104);
					var113.method520(var111, var105 + field2113, method1584(var111, var110, field2907) + -var104, var110);
					field3220.push(new ClientProjNode2(var113));
				}
			} else if (ptype == 198) {
				int var114 = in.method319();
				int var115 = Statics.field2213 + (var114 >> 4 & 0x7);
				int var116 = (var114 & 0x7) + Statics.field2910;
				int var117 = in.method302();
				if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
					LinkList var118 = field2497[field2907][var115][var116];
					if (var118 != null) {
						for (ClientObjNode var119 = (ClientObjNode) var118.head(); var119 != null; var119 = (ClientObjNode) var118.method1619()) {
							if ((var117 & 0x7FFF) == var119.field4258.field2030) {
								var119.unlink();
								break;
							}
						}
						if (var118.head() == null) {
							field2497[field2907][var115][var116] = null;
						}
						method175(var115, var116);
					}
				}
			} else if (ptype == 75) {
				int var120 = in.g1();
				int var121 = var120 >> 2;
				int var122 = Statics.field1792[var121];
				int var123 = var120 & 0x3;
				int var124 = in.method295();
				int var125 = Statics.field2910 + (var124 & 0x7);
				int var126 = Statics.field2213 + (var124 >> 4 & 0x7);
				if (var126 >= 0 && var125 >= 0 && var126 < 104 && var125 < 104) {
					method1486(0, var125, var122, var123, -1, var121, field2907, var126, -1);
				}
			} else if (ptype == 52) {
				int var127 = in.g1();
				int var128 = Statics.field2910 + (var127 & 0x7);
				int var129 = Statics.field2213 + (var127 >> 4 & 0x7);
				int var130 = in.g2();
				int var131 = in.g1();
				if (var130 == 65535) {
					var130 = -1;
				}
				int var132 = var131 & 0x7;
				int var133 = in.g1();
				int var134 = var131 >> 4 & 0xF;
				if (var129 >= 0 && var128 >= 0 && var129 < 104 && var128 < 104) {
					int var135 = var134 + 1;
					if (localPlayer.field4087[0] >= var129 - var135 && var129 + var135 >= localPlayer.field4087[0] && var128 - var135 <= localPlayer.field4141[0] && localPlayer.field4141[0] <= var128 + var135 && field4211 != 0 && var132 > 0 && field3445 < 50 && var130 != -1) {
						field397[field3445] = var130;
						field2016[field3445] = var132;
						field116[field3445] = var133;
						field4417[field3445] = null;
						field2726[field3445] = (var129 << 16) + (var128 << 8) + var134;
						field3445++;
					}
				}
			}
		}
	}

	@ObfuscatedName("we.a(Lu;I)V")
	public static void method1600(ClientEntity arg0) {
		arg0.field4106 = arg0.field4105;
		if (arg0.field4135 == 0) {
			arg0.field4108 = 0;
			return;
		}
		if (arg0.field4077 != -1 && arg0.field4140 == 0) {
			SeqType var1 = SeqType.list(arg0.field4077);
			if (arg0.field4137 > 0 && var1.field1983 == 0) {
				arg0.field4108++;
				return;
			}
			if (arg0.field4137 <= 0 && var1.field1980 == 0) {
				arg0.field4108++;
				return;
			}
		}
		int var2 = arg0.field4136;
		int var3 = arg0.field4103 * 64 + arg0.field4087[arg0.field4135 - 1] * 128;
		int var4 = arg0.field4121;
		int var5 = arg0.field4141[arg0.field4135 - 1] * 128 + arg0.field4103 * 64;
		if (var3 - var2 > 256 || var3 - var2 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
			arg0.field4136 = var3;
			arg0.field4121 = var5;
			return;
		}
		if (var2 >= var3) {
			if (var3 >= var2) {
				if (var5 > var4) {
					arg0.field4119 = 1024;
				} else if (var5 < var4) {
					arg0.field4119 = 0;
				}
			} else if (var4 < var5) {
				arg0.field4119 = 768;
			} else if (var5 >= var4) {
				arg0.field4119 = 512;
			} else {
				arg0.field4119 = 256;
			}
		} else if (var4 < var5) {
			arg0.field4119 = 1280;
		} else if (var5 < var4) {
			arg0.field4119 = 1792;
		} else {
			arg0.field4119 = 1536;
		}
		int var6 = arg0.field4123;
		int var7 = arg0.field4119 - arg0.field4085 & 0x7FF;
		if (var7 > 1024) {
			var7 -= 2048;
		}
		if (var7 >= -256 && var7 <= 256) {
			var6 = arg0.field4092;
		} else if (var7 >= 256 && var7 < 768) {
			var6 = arg0.field4122;
		} else if (var7 >= -768 && var7 <= -256) {
			var6 = arg0.field4084;
		}
		if (var6 == -1) {
			var6 = arg0.field4092;
		}
		int var8 = 4;
		boolean var9 = true;
		arg0.field4106 = var6;
		if (arg0 instanceof ClientNpc) {
			var9 = ((ClientNpc) arg0).field3682.field2354;
		}
		if (var9) {
			if (arg0.field4119 != arg0.field4085 && arg0.field4114 == -1 && arg0.field4102 != 0) {
				var8 = 2;
			}
			if (arg0.field4135 > 2) {
				var8 = 6;
			}
			if (arg0.field4135 > 3) {
				var8 = 8;
			}
			if (arg0.field4108 > 0 && arg0.field4135 > 1) {
				var8 = 8;
				arg0.field4108--;
			}
		} else {
			if (arg0.field4135 > 1) {
				var8 = 6;
			}
			if (arg0.field4135 > 2) {
				var8 = 8;
			}
			if (arg0.field4108 > 0 && arg0.field4135 > 1) {
				var8 = 8;
				arg0.field4108--;
			}
		}
		if (arg0.field4074[arg0.field4135 - 1]) {
			var8 <<= 0x1;
		}
		if (var3 > var2) {
			arg0.field4136 += var8;
			if (arg0.field4136 > var3) {
				arg0.field4136 = var3;
			}
		} else if (var3 < var2) {
			arg0.field4136 -= var8;
			if (var3 > arg0.field4136) {
				arg0.field4136 = var3;
			}
		}
		if (var8 >= 8 && arg0.field4092 == arg0.field4106 && arg0.field4104 != -1) {
			arg0.field4106 = arg0.field4104;
		}
		if (var5 > var4) {
			arg0.field4121 += var8;
			if (var5 < arg0.field4121) {
				arg0.field4121 = var5;
			}
		} else if (var5 < var4) {
			arg0.field4121 -= var8;
			if (var5 > arg0.field4121) {
				arg0.field4121 = var5;
			}
		}
		if (var3 != arg0.field4136 || arg0.field4121 != var5) {
			return;
		}
		arg0.field4135--;
		if (arg0.field4137 > 0) {
			arg0.field4137--;
			return;
		}
	}

	@ObfuscatedName("wf.b(I)V")
	public static void gameDraw() {
		if (!field1958) {
			field994[0] = 1007;
			field1191[0] = Text.field76;
			field3862 = 1;
			field3836[0] = field3453;
		}
		if (field723 != -1) {
			animateInterface(field723);
		}
		for (int var0 = 0; var0 < field3923; var0++) {
			if (field4228[var0]) {
				field4005[var0] = true;
			}
			field2043[var0] = field4228[var0];
			field4228[var0] = false;
		}
		field4229 = null;
		field1101 = -1;
		field2018 = field2113;
		field2487 = -1;
		if (field723 != -1) {
			field3923 = 0;
			drawInterface(sHei, field723, 0, -1, 0, 0, 0, sWid);
		}
		Pix2D.resetClipping();
		method118();
		if (field1958) {
			method258();
		} else if (field1101 != -1) {
			method679(field2487, field1101);
		}
		if (field2503 == 3) {
			for (int var1 = 0; var1 < field3923; var1++) {
				if (field2043[var1]) {
					Pix2D.fillRectTrans(field1455[var1], field2471[var1], field2485[var1], field1447[var1], 16711935, 128);
				} else if (field4005[var1]) {
					Pix2D.fillRectTrans(field1455[var1], field2471[var1], field2485[var1], field1447[var1], 16711680, 128);
				}
			}
		}
		BgSound.doMix(localPlayer.field4121, field261, localPlayer.field4136, field2907);
		field261 = 0;
	}

	@ObfuscatedName("jj.a(ZIIIIIIIIIII)Z")
	public static boolean method737(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				field3673[var11][var12] = 0;
				field4267[var11][var12] = 99999999;
			}
		}
		field3673[arg4][arg1] = 99;
		field4267[arg4][arg1] = 0;
		int var13 = arg4;
		int var14 = arg1;
		byte var15 = 0;
		field2203[0] = arg4;
		int var30 = var15 + 1;
		field1781[0] = arg1;
		boolean var16 = false;
		int var17 = 0;
		int[][] var18 = collision[field2907].field1667;
		while (var30 != var17) {
			var13 = field2203[var17];
			var14 = field1781[var17];
			var17 = var17 + 1 & 0xFFF;
			if (var13 == arg7 && arg10 == var14) {
				var16 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && collision[field2907].method640(var14, arg5 - 1, arg7, arg10, 2, arg6, var13)) {
					var16 = true;
					break;
				}
				if (arg5 < 10 && collision[field2907].method648(arg6, var13, arg5 - 1, arg10, 2, var14, arg7)) {
					var16 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && collision[field2907].method650(2, arg10, arg2, var14, arg3, var13, arg7, arg8)) {
				var16 = true;
				break;
			}
			int var19 = field4267[var13][var14] + 1;
			if (var13 > 0 && field3673[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14;
				field3673[var13 - 1][var14] = 2;
				var30 = var30 + 1 & 0xFFF;
				field4267[var13 - 1][var14] = var19;
			}
			if (var13 < 102 && field3673[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14;
				field3673[var13 + 1][var14] = 8;
				var30 = var30 + 1 & 0xFFF;
				field4267[var13 + 1][var14] = var19;
			}
			if (var14 > 0 && field3673[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
				field2203[var30] = var13;
				field1781[var30] = var14 - 1;
				field3673[var13][var14 - 1] = 1;
				var30 = var30 + 1 & 0xFFF;
				field4267[var13][var14 - 1] = var19;
			}
			if (var14 < 102 && field3673[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
				field2203[var30] = var13;
				field1781[var30] = var14 + 1;
				field3673[var13][var14 + 1] = 4;
				field4267[var13][var14 + 1] = var19;
				var30 = var30 + 1 & 0xFFF;
			}
			if (var13 > 0 && var14 > 0 && field3673[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14 - 1;
				field3673[var13 - 1][var14 - 1] = 3;
				var30 = var30 + 1 & 0xFFF;
				field4267[var13 - 1][var14 - 1] = var19;
			}
			if (var13 < 102 && var14 > 0 && field3673[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 + 1][var14 - 1] = 9;
				field4267[var13 + 1][var14 - 1] = var19;
			}
			if (var13 > 0 && var14 < 102 && field3673[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 - 1][var14 + 1] = 6;
				field4267[var13 - 1][var14 + 1] = var19;
			}
			if (var13 < 102 && var14 < 102 && field3673[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 + 1][var14 + 1] = 12;
				field4267[var13 + 1][var14 + 1] = var19;
			}
		}
		field2186 = 0;
		if (!var16) {
			if (!arg0) {
				return false;
			}
			int var20 = 1000;
			int var21 = 100;
			for (int var22 = arg7 - 10; var22 <= arg7 + 10; var22++) {
				for (int var23 = arg10 - 10; var23 <= arg10 + 10; var23++) {
					if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && field4267[var22][var23] < 100) {
						int var24 = 0;
						int var25 = 0;
						if (var23 < arg10) {
							var25 = arg10 - var23;
						} else if (var23 > arg10 + arg3 - 1) {
							var25 = var23 + 1 - arg10 - arg3;
						}
						if (var22 < arg7) {
							var24 = arg7 - var22;
						} else if (arg2 + arg7 - 1 < var22) {
							var24 = var22 + 1 - arg2 - arg7;
						}
						int var26 = var24 * var24 + var25 * var25;
						if (var20 > var26 || var20 == var26 && var21 > field4267[var22][var23]) {
							var21 = field4267[var22][var23];
							var13 = var22;
							var14 = var23;
							var20 = var26;
						}
					}
				}
			}
			if (var20 == 1000) {
				return false;
			}
			if (var13 == arg4 && var14 == arg1) {
				return false;
			}
			field2186 = 1;
		}
		byte var27 = 0;
		field2203[0] = var13;
		int var31 = var27 + 1;
		field1781[0] = var14;
		int var28;
		int var29 = var28 = field3673[var13][var14];
		while (var13 != arg4 || var14 != arg1) {
			if (var29 != var28) {
				var28 = var29;
				field2203[var31] = var13;
				field1781[var31++] = var14;
			}
			if ((var29 & 0x2) != 0) {
				var13++;
			} else if ((var29 & 0x8) != 0) {
				var13--;
			}
			if ((var29 & 0x1) != 0) {
				var14++;
			} else if ((var29 & 0x4) != 0) {
				var14--;
			}
			var29 = field3673[var13][var14];
		}
		if (var31 > 0) {
			method1611(arg9, field2203, field1781, var31);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("di.a(ZB)V")
	public static void rebuildPacket(boolean arg0) {
		Statics.field2555 = arg0;
		if (!Statics.field2555) {
			int var1 = (psize - in.pos) / 16;
			Statics.field268 = new int[var1][4];
			for (int var2 = 0; var2 < var1; var2++) {
				for (int var3 = 0; var3 < 4; var3++) {
					Statics.field268[var2][var3] = in.method299();
				}
			}
			int var4 = in.method349();
			boolean var5 = false;
			int var6 = in.method302();
			int var7 = in.g2();
			int var8 = in.method352();
			int var9 = in.g2();
			Statics.field2402 = new int[var1];
			ClientBuild.field2731 = new int[var1];
			Statics.field774 = new byte[var1][];
			Statics.field453 = new int[var1];
			ClientBuild.field3221 = new byte[var1][];
			int var10 = 0;
			if ((var7 / 8 == 48 || var7 / 8 == 49) && (var4 / 8) == 48) {
				var5 = true;
			}
			if (var7 / 8 == 48 && var4 / 8 == 148) {
				var5 = true;
			}
			for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
				for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
					int var13 = (var11 << 8) + var12;
					if (var5 && (var12 == 49 || var12 == 149 || var12 == 147 || var11 == 50 || var11 == 49 && var12 == 47)) {
						ClientBuild.field2731[var10] = var13;
						Statics.field453[var10] = -1;
						Statics.field2402[var10] = -1;
					} else {
						ClientBuild.field2731[var10] = var13;
						Statics.field453[var10] = maps.method964(JagString.join(new JagString[] { Statics.field4018, JagString.method1212(var11), Statics.field933, JagString.method1212(var12) }));
						Statics.field2402[var10] = maps.method964(JagString.join(new JagString[] { Statics.field1928, JagString.method1212(var11), Statics.field933, JagString.method1212(var12) }));
					}
					var10++;
				}
			}
			method820(var8, var9, var7, var4, var6);
			return;
		}
		int var14 = in.g1();
		int var15 = in.method343();
		int var16 = in.method302();
		in.method34();
		for (int var17 = 0; var17 < 4; var17++) {
			for (int var18 = 0; var18 < 13; var18++) {
				for (int var19 = 0; var19 < 13; var19++) {
					int var20 = in.method28(1);
					if (var20 == 1) {
						ClientBuild.field2024[var17][var18][var19] = in.method28(26);
					} else {
						ClientBuild.field2024[var17][var18][var19] = -1;
					}
				}
			}
		}
		in.method35();
		int var21 = (psize - in.pos) / 16;
		Statics.field268 = new int[var21][4];
		for (int var22 = 0; var22 < var21; var22++) {
			for (int var23 = 0; var23 < 4; var23++) {
				Statics.field268[var22][var23] = in.g4();
			}
		}
		int var24 = in.method343();
		int var25 = in.g2();
		Statics.field453 = new int[var21];
		Statics.field2402 = new int[var21];
		ClientBuild.field3221 = new byte[var21][];
		ClientBuild.field2731 = new int[var21];
		Statics.field774 = new byte[var21][];
		int var26 = 0;
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < 13; var28++) {
				for (int var29 = 0; var29 < 13; var29++) {
					int var30 = ClientBuild.field2024[var27][var28][var29];
					if (var30 != -1) {
						int var31 = var30 >> 3 & 0x7FF;
						int var32 = var30 >> 14 & 0x3FF;
						int var33 = var31 / 8 + (var32 / 8 << 8);
						for (int var34 = 0; var34 < var26; var34++) {
							if (var33 == ClientBuild.field2731[var34]) {
								var33 = -1;
								break;
							}
						}
						if (var33 != -1) {
							ClientBuild.field2731[var26] = var33;
							int var35 = var33 >> 8 & 0xFF;
							int var36 = var33 & 0xFF;
							Statics.field453[var26] = maps.method964(JagString.join(new JagString[] { Statics.field4018, JagString.method1212(var35), Statics.field933, JagString.method1212(var36) }));
							Statics.field2402[var26] = maps.method964(JagString.join(new JagString[] { Statics.field1928, JagString.method1212(var35), Statics.field933, JagString.method1212(var36) }));
							var26++;
						}
					}
				}
			}
		}
		method820(var14, var16, var15, var25, var24);
	}

	@ObfuscatedName("tj.a(II)V")
	public static void animateInterface(int arg0) {
		if (IfType.openInterface(arg0)) {
			method714(-1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("ug.a(Llf;IIII)V")
	public static void method1513(NpcType arg0, int arg1, int arg2, int arg3) {
		if (field3862 >= 400) {
			return;
		}
		if (arg0.field2327 != null) {
			arg0 = arg0.method862();
		}
		if (arg0 == null || !arg0.field2359) {
			return;
		}
		JagString var4 = arg0.field2341;
		if (arg0.field2331 != 0) {
			var4 = JagString.join(new JagString[] { var4, method1152(arg0.field2331, localPlayer.field747), Statics.field1238, Text.field2717, JagString.method1212(arg0.field2331), Statics.field1879 });
		}
		if (field475 == 1) {
			method685(arg3, Text.field608, (short) 48, (long) arg1, JagString.join(new JagString[] { field1414, Statics.field2493, var4 }), arg2);
		} else if (!Statics.field145) {
			JagString[] var5 = arg0.field2342;
			if (Statics.field1807) {
				var5 = method921(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && (game != 0 || !var5[var6].method624(Text.field3041))) {
						byte var7 = 0;
						if (var6 == 0) {
							var7 = 17;
						}
						if (var6 == 1) {
							var7 = 38;
						}
						if (var6 == 2) {
							var7 = 34;
						}
						if (var6 == 3) {
							var7 = 32;
						}
						if (var6 == 4) {
							var7 = 4;
						}
						method685(arg3, var5[var6], var7, (long) arg1, JagString.join(new JagString[] { Statics.field120, var4 }), arg2);
					}
				}
			}
			if (game == 0 && var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].method624(Text.field3041)) {
						short var9 = 0;
						if (arg0.field2331 > localPlayer.field747) {
							var9 = 2000;
						}
						short var10 = 0;
						if (var8 == 0) {
							var10 = 17;
						}
						if (var8 == 1) {
							var10 = 38;
						}
						if (var8 == 2) {
							var10 = 34;
						}
						if (var8 == 3) {
							var10 = 32;
						}
						if (var8 == 4) {
							var10 = 4;
						}
						if (var10 != 0) {
							var10 += var9;
						}
						method685(arg3, var5[var8], var10, (long) arg1, JagString.join(new JagString[] { Statics.field120, var4 }), arg2);
					}
				}
			}
			method685(arg3, Text.field1174, (short) 1002, (long) arg1, JagString.join(new JagString[] { Statics.field120, var4 }), arg2);
		} else if ((Statics.field2084 & 0x2) == 2) {
			method685(arg3, Statics.field3835, (short) 19, (long) arg1, JagString.join(new JagString[] { Statics.field464, Statics.field2493, var4 }), arg2);
		}
	}

	@ObfuscatedName("mb.b(II)Li;")
	public static JagString method889(int arg0) {
		if (arg0 < 100000) {
			return JagString.join(new JagString[] { Statics.field399, JagString.method1212(arg0), Statics.field1214 });
		} else if (arg0 < 10000000) {
			return JagString.join(new JagString[] { Statics.field241, JagString.method1212(arg0 / 1000), Text.field3069, Statics.field1214 });
		} else {
			return JagString.join(new JagString[] { Statics.field2462, JagString.method1212(arg0 / 1000000), Text.field2464, Statics.field1214 });
		}
	}

	@ObfuscatedName("eh.a(IIBIIIIII)V")
	public static void drawInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.openInterface(arg1)) {
			Statics.field3564 = null;
			drawLayer(IfType.list[arg1], arg5, arg2, arg3, arg0, arg6, arg4, -1, arg7);
			if (Statics.field3564 != null) {
				drawLayer(Statics.field3564, arg5, arg2, arg3, arg0, ClientMouseListener.field1756, PacketBit.field77, -1412584499, arg7);
				Statics.field3564 = null;
			}
		} else if (arg3 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				field4228[var8] = true;
			}
		} else {
			field4228[arg3] = true;
		}
	}

	@ObfuscatedName("bj.d(I)V")
	public static void method118() {
		boolean var0 = false;
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < field3862 - 1; var1++) {
				if (field994[var1] < 1000 && field994[var1 + 1] > 1000) {
					var0 = false;
					JagString var2 = field3836[var1];
					field3836[var1] = field3836[var1 + 1];
					field3836[var1 + 1] = var2;
					JagString var3 = field1191[var1];
					field1191[var1] = field1191[var1 + 1];
					field1191[var1 + 1] = var3;
					int var4 = field3176[var1];
					field3176[var1] = field3176[var1 + 1];
					field3176[var1 + 1] = var4;
					int var5 = field4060[var1];
					field4060[var1] = field4060[var1 + 1];
					field4060[var1 + 1] = var5;
					short var6 = field994[var1];
					field994[var1] = field994[var1 + 1];
					field994[var1 + 1] = var6;
					long var7 = field1352[var1];
					field1352[var1] = field1352[var1 + 1];
					field1352[var1 + 1] = var7;
				}
			}
		}
	}

	@ObfuscatedName("de.d(I)V")
	public static void method258() {
		int var0 = field4383;
		int var1 = field1549;
		int var2 = field4421;
		int var3 = field889;
		Pix2D.method478(var1, var0, var2, var3, 6116423);
		Pix2D.method478(var1 + 1, var0 + 1, var2 - 2, 16, 0);
		Pix2D.method476(var1 + 1, var0 + 18, var2 - 2, var3 - 19, 0);
		field1011.method154(Text.field398, var1 + 3, var0 + 14, 6116423, -1);
		int var4 = ClientMouseListener.field471;
		int var5 = ClientMouseListener.field4449;
		for (int var6 = 0; var6 < field3862; var6++) {
			int var7 = var0 + (field3862 - var6 - 1) * 15 + 31;
			int var8 = 16777215;
			if (var1 < var4 && var4 < var2 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}
			field1011.method154(method525(var6), var1 + 3, var7, var8, 0);
		}
		method874(field1549, field889, field4421, field4383);
	}

	@ObfuscatedName("ij.a(III)V")
	public static void method679(int arg0, int arg1) {
		if (field3862 < 2 && field475 == 0 && !Statics.field145) {
			return;
		}
		JagString var2;
		if (field475 == 1 && field3862 < 2) {
			var2 = JagString.join(new JagString[] { Text.field608, Text.field4398, field1414, Statics.field3089 });
		} else if (Statics.field145 && field3862 < 2) {
			var2 = JagString.join(new JagString[] { Statics.field3835, Text.field4398, Statics.field464, Statics.field3089 });
		} else {
			var2 = method525(field3862 - 1);
		}
		if (field3862 > 2) {
			var2 = JagString.join(new JagString[] { var2, Statics.field891, JagString.method1212(field3862 - 2), Text.field1862 });
		}
		int var3 = field1011.drawStringAntiMacro(var2, arg1 + 4, arg0 + 15, Statics.field1259, Statics.field454);
		method861(15, var3 + field1011.method158(var2), arg0, arg1 + 4);
	}

	@ObfuscatedName("ij.a(IIIIIBII)V")
	public static void method681(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < 128 || arg4 < 128 || arg2 > 13056 || arg4 > 13056) {
			field401 = -1;
			field541 = -1;
			return;
		}
		int var5 = method1584(arg2, arg4, field2907) - arg1;
		int var6 = arg4 - field3608;
		int var7 = arg2 - field1428;
		int var8 = var5 - field1954;
		int var9 = Pix3D.field3359[field3934];
		int var10 = Pix3D.field3354[field3934];
		int var11 = Pix3D.field3354[field3257];
		int var12 = Pix3D.field3359[field3257];
		int var13 = var11 * var7 + var6 * var12 >> 16;
		int var14 = var11 * var6 - var12 * var7 >> 16;
		int var16 = var10 * var8 - var9 * var14 >> 16;
		int var17 = var8 * var9 + var10 * var14 >> 16;
		if (var17 < 50) {
			field401 = -1;
			field541 = -1;
		} else {
			field541 = (var16 << 9) / var17 + arg0;
			field401 = arg3 + (var13 << 9) / var17;
		}
	}

	@ObfuscatedName("ij.a(Li;I)V")
	public static void method682(JagString arg0) {
		if (staffmodlevel >= 2) {
			if (arg0.method624(field1421)) {
				for (int var1 = 0; var1 < 10; var1++) {
					System.gc();
				}
				Runtime var2 = Runtime.getRuntime();
				int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
				method1499(JagString.join(new JagString[] { Statics.field2950, JagString.method1212(var3), Statics.field2007 }), 0, null);
			}
			if (arg0.method624(field156)) {
				method1380();
			}
			if (arg0.method624(field4547)) {
				field2768 = true;
			}
			if (arg0.method624(field583)) {
				field2768 = false;
			}
			arg0.method624(field751);
			arg0.method624(field6);
			if (arg0.method624(field3337)) {
				for (int var4 = 0; var4 < 4; var4++) {
					for (int var5 = 1; var5 < 103; var5++) {
						for (int var6 = 1; var6 < 103; var6++) {
							collision[var4].field1667[var5][var6] = 0;
						}
					}
				}
			}
			if (arg0.method619(field4249) && modewhere != 0) {
				GameShell.method1073(arg0.method635(6).method603());
			}
			if (arg0.method624(field344) && modewhere == 2) {
				throw new RuntimeException();
			}
			if (arg0.method619(field1103)) {
				field2503 = arg0.method635(12).method602().method603();
				method1499(JagString.join(new JagString[] { Statics.field1750, JagString.method1212(field2503) }), 0, null);
			}
			if (arg0.method624(field1930)) {
				field2103 = true;
			}
		}
		out.method30(175);
		out.p1(arg0.method604() - 1);
		out.pjstr(arg0.method635(2));
	}

	@ObfuscatedName("mc.a(ZB)V")
	public static void method893(boolean arg0) {
		doAudio();
		field2707++;
		if (field2707 < 50 && !arg0) {
			return;
		}
		field2707 = 0;
		if (networkError || stream == null) {
			return;
		}
		out.method30(19);
		try {
			stream.write(out.pos, out.data);
			out.pos = 0;
		} catch (IOException var1) {
			networkError = true;
		}
	}

	@ObfuscatedName("be.a(ILi;I)V")
	public static void method82(JagString arg0, int arg1) {
		JagString var2 = arg0.method611().method614();
		boolean var3 = false;
		for (int var4 = 0; var4 < field1027; var4++) {
			ClientPlayer var5 = field4491[field3428[var4]];
			if (var5 != null && var5.field766 != null && var5.field766.method624(var2)) {
				method1421(1, 0, var5.field4141[0], var5.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				var3 = true;
				if (arg1 == 1) {
					out.method30(65);
					out.method314(field3428[var4]);
				} else if (arg1 == 4) {
					out.method30(214);
					out.method331(field3428[var4]);
				} else if (arg1 == 6) {
					out.method30(161);
					out.method331(field3428[var4]);
				} else if (arg1 == 7) {
					out.method30(47);
					out.method344(field3428[var4]);
				}
				break;
			}
		}
		if (!var3) {
			method1499(JagString.join(new JagString[] { Text.field2063, var2 }), 0, field3453);
		}
	}

	@ObfuscatedName("ua.a(I)V")
	public static void doAudio() {
		if (synthPlayer != null) {
			synthPlayer.method406();
		}
		if (midiPlayer != null) {
			midiPlayer.method406();
		}
	}

	@ObfuscatedName("k.a(Lu;B)V")
	public static void method756(ClientEntity arg0) {
		int var1 = arg0.field4133 - field2113;
		if (arg0.field4139 == 0) {
			arg0.field4119 = 1024;
		}
		arg0.field4108 = 0;
		if (arg0.field4139 == 1) {
			arg0.field4119 = 1536;
		}
		if (arg0.field4139 == 2) {
			arg0.field4119 = 0;
		}
		if (arg0.field4139 == 3) {
			arg0.field4119 = 512;
		}
		int var2 = arg0.field4094 * 128 + arg0.field4103 * 64;
		arg0.field4121 += (var2 - arg0.field4121) / var1;
		int var3 = arg0.field4103 * 64 + arg0.field4113 * 128;
		arg0.field4136 += (var3 - arg0.field4136) / var1;
	}

	@ObfuscatedName("de.b(I)V")
	public static void method256() {
		for (ClientProjNode2 var0 = (ClientProjNode2) field3220.head(); var0 != null; var0 = (ClientProjNode2) field3220.method1619()) {
			ClientProj var1 = var0.field315;
			if (var1.field1390 != field2907 || field2113 > var1.field1407) {
				var0.unlink();
			} else if (var1.field1371 <= field2113) {
				if (var1.field1387 > 0) {
					ClientNpc var2 = field4223[var1.field1387 - 1];
					if (var2 != null && var2.field4136 >= 0 && var2.field4136 < 13312 && var2.field4121 >= 0 && var2.field4121 < 13312) {
						var1.method520(var2.field4136, field2113, method1584(var2.field4136, var2.field4121, var1.field1390) - var1.field1396, var2.field4121);
					}
				}
				if (var1.field1387 < 0) {
					int var3 = -var1.field1387 - 1;
					ClientPlayer var4;
					if (var3 == selfSlot) {
						var4 = localPlayer;
					} else {
						var4 = field4491[var3];
					}
					if (var4 != null && var4.field4136 >= 0 && var4.field4136 < 13312 && var4.field4121 >= 0 && var4.field4121 < 13312) {
						var1.method520(var4.field4136, field2113, method1584(var4.field4136, var4.field4121, var1.field1390) - var1.field1396, var4.field4121);
					}
				}
				var1.method517(field261);
				World.method859(field2907, (int) var1.field1406, (int) var1.field1391, (int) var1.field1375, 60, var1, var1.field1381, -1L, false);
			}
		}
	}

	@ObfuscatedName("mg.b(Z)V")
	public static void reconnectDone() {
		field1634 = -1;
		Statics.field2061 = 0;
		ptype = -1;
		out.pos = 0;
		Statics.field3700 = 0;
		field3862 = 0;
		minimapState = 0;
		Statics.field1841 = -1;
		in.pos = 0;
		psize = 0;
		field821 = -1;
		field2102 = 0;
		field1958 = false;
		for (int var0 = 0; var0 < field4491.length; var0++) {
			if (field4491[var0] != null) {
				field4491[var0].field4114 = -1;
			}
		}
		for (int var1 = 0; var1 < field4223.length; var1++) {
			if (field4223[var1] != null) {
				field4223[var1].field4114 = -1;
			}
		}
		ClientInvCache.method276();
		setMainState(30);
		for (int var2 = 0; var2 < 100; var2++) {
			field4228[var2] = true;
		}
	}

	@ObfuscatedName("bd.a(ILq;)V")
	public static void method78(IfType arg0) {
		int var1 = arg0.field3439;
		if (var1 == 324) {
			if (Statics.field1033 == -1) {
				Statics.field3192 = arg0.field3433;
				Statics.field1033 = arg0.field3473;
			}
			if (Statics.field2441.field3957) {
				arg0.field3473 = Statics.field1033;
			} else {
				arg0.field3473 = Statics.field3192;
			}
		} else if (var1 == 325) {
			if (Statics.field1033 == -1) {
				Statics.field3192 = arg0.field3433;
				Statics.field1033 = arg0.field3473;
			}
			if (Statics.field2441.field3957) {
				arg0.field3473 = Statics.field3192;
			} else {
				arg0.field3473 = Statics.field1033;
			}
		} else if (var1 == 327) {
			arg0.field3455 = 150;
			arg0.field3509 = (int) (Math.sin((double) field2113 / 40.0D) * 256.0D) & 0x7FF;
			arg0.field3409 = -1;
			arg0.field3430 = 5;
		} else if (var1 == 328) {
			if (localPlayer.field766 == null) {
				arg0.field3409 = 0;
			} else {
				arg0.field3455 = 150;
				arg0.field3509 = (int) (Math.sin((double) field2113 / 40.0D) * 256.0D) & 0x7FF;
				arg0.field3430 = 5;
				arg0.field3409 = ((int) localPlayer.field766.toUserhash() << 11) + 2047;
				arg0.field3404 = localPlayer.field4106;
				arg0.field3379 = localPlayer.field4127;
			}
		}
	}

	@ObfuscatedName("bd.b(B)V")
	public static void method79() {
		int var0 = in.method28(8);
		if (var0 < field1027) {
			for (int var1 = var0; var1 < field1027; var1++) {
				field999[field4196++] = field3428[var1];
			}
		}
		if (var0 > field1027) {
			throw new RuntimeException("gppov1");
		}
		field1027 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = field3428[var2];
			ClientPlayer var4 = field4491[var3];
			int var5 = in.method28(1);
			if (var5 == 0) {
				field3428[field1027++] = var3;
				var4.field4081 = field2113;
			} else {
				int var6 = in.method28(2);
				if (var6 == 0) {
					field3428[field1027++] = var3;
					var4.field4081 = field2113;
					field2579[field3702++] = var3;
				} else if (var6 == 1) {
					field3428[field1027++] = var3;
					var4.field4081 = field2113;
					int var7 = in.method28(3);
					var4.method1476(false, var7);
					int var8 = in.method28(1);
					if (var8 == 1) {
						field2579[field3702++] = var3;
					}
				} else if (var6 == 2) {
					field3428[field1027++] = var3;
					var4.field4081 = field2113;
					int var9 = in.method28(3);
					var4.method1476(true, var9);
					int var10 = in.method28(3);
					var4.method1476(true, var10);
					int var11 = in.method28(1);
					if (var11 == 1) {
						field2579[field3702++] = var3;
					}
				} else if (var6 == 3) {
					field999[field4196++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("sg.a(IZI)V")
	public static void method1391(int arg0, int arg1) {
		out.method30(95);
		out.method316(arg1);
		out.method314(arg0);
	}

	@ObfuscatedName("sg.a(ILi;III)V")
	public static void method1390(int arg0, JagString arg1, int arg2, int arg3) {
		IfType var4 = method238(arg2, arg3);
		if (var4 == null) {
			return;
		}
		if (var4.field3401 != null) {
			HookReq var5 = new HookReq();
			var5.field679 = arg0;
			var5.field678 = var4;
			var5.field681 = var4.field3401;
			var5.field677 = arg1;
			ScriptRunner.method1373(var5);
		}
		boolean var6 = true;
		if (var4.field3439 > 0) {
			var6 = method389(var4);
		}
		if (!var6 || !Statics.method726(arg0 - 1, Statics.method530(var4))) {
			return;
		}
		if (arg0 == 1) {
			out.method30(44);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 2) {
			out.method30(50);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 3) {
			out.method30(103);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 4) {
			out.method30(64);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 5) {
			out.method30(178);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 6) {
			out.method30(81);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 7) {
			out.method30(236);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 8) {
			out.method30(188);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 9) {
			out.method30(128);
			out.p4(arg3);
			out.method305(arg2);
		}
		if (arg0 == 10) {
			out.method30(254);
			out.p4(arg3);
			out.method305(arg2);
		}
	}

	@ObfuscatedName("sg.a(ILdj;II)V")
	public static void method1394(int arg0, ClientPlayer arg1, int arg2) {
		if ((arg0 & 0x4) != 0) {
			arg1.field4071 = in.gjstr();
			if (arg1.field4071.method599(0) == 126) {
				arg1.field4071 = arg1.field4071.method635(1);
				method1499(arg1.field4071, 2, arg1.field766);
			} else if (arg1 == localPlayer) {
				method1499(arg1.field4071, 2, arg1.field766);
			}
			arg1.field4138 = 0;
			arg1.field4083 = 0;
			arg1.field4112 = 150;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.field4113 = in.method352();
			arg1.field4094 = in.method295();
			arg1.field4100 = in.method295();
			arg1.field4072 = in.method319();
			arg1.field4133 = in.method343() + field2113;
			arg1.field4130 = in.method343() + field2113;
			arg1.field4139 = in.method319();
			arg1.field4137 = 0;
			arg1.field4135 = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.field4096 = in.method349();
			arg1.field4099 = in.method302();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.field4080 = in.g2();
			int var3 = in.method313();
			if (arg1.field4080 == 65535) {
				arg1.field4080 = -1;
			}
			arg1.field4125 = var3 >> 16;
			arg1.field4082 = (var3 & 0xFFFF) + field2113;
			arg1.field4075 = 0;
			arg1.field4120 = 0;
			if (field2113 < arg1.field4082) {
				arg1.field4075 = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			int var4 = in.g2();
			if (var4 == 65535) {
				var4 = -1;
			}
			int var5 = in.g1();
			method1515(var4, var5, arg1);
		}
		if ((arg0 & 0x40) != 0) {
			int var6 = in.g1();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet(var7);
			in.method307(var6, var7);
			field1397[arg2] = var8;
			arg1.method285(var8);
		}
		if ((arg0 & 0x80) != 0) {
			int var9 = in.method352();
			int var10 = in.g1();
			arg1.method1477(field2113, var10, var9);
			arg1.field4118 = field2113 + 300;
			arg1.field4109 = in.method295();
		}
		if ((arg0 & 0x100) != 0) {
			int var11 = in.method352();
			int var12 = in.method352();
			arg1.method1477(field2113, var12, var11);
		}
		if ((arg0 & 0x1) != 0) {
			int var13 = in.method349();
			boolean var14 = (var13 & 0x8000) != 0;
			int var15 = in.method352();
			int var16 = in.g1();
			int var17 = in.pos;
			if (arg1.field766 != null && arg1.field768 != null) {
				long var18 = arg1.field766.toUserhash();
				boolean var20 = false;
				if (var15 <= 1) {
					if (!var14 && (field4428 == 1 || field3535 == 1)) {
						var20 = true;
					} else {
						for (int var21 = 0; var21 < field1221; var21++) {
							if (field1764[var21] == var18) {
								var20 = true;
								break;
							}
						}
					}
				}
				if (!var20 && field563 == 0) {
					field1006.pos = 0;
					int var22 = -1;
					in.method315(field1006.data, var16);
					field1006.pos = 0;
					JagString var23;
					if (var14) {
						QuickChatPhrase var24 = QuickChatPhrase.method667(field1006);
						var22 = var24.field4058;
						var13 &= 0x7FFF;
						var23 = var24.field4065.method1409(field1006);
					} else {
						var23 = PixfontGeneric.method162(Statics.method103(field1006).method622());
					}
					arg1.field4071 = var23.method602();
					arg1.field4112 = 150;
					arg1.field4083 = var13 >> 8;
					arg1.field4138 = var13 & 0xFF;
					if (var15 == 2) {
						method801(var23, var22, JagString.join(new JagString[] { Statics.field472, arg1.field766 }), var14 ? 17 : 1, null);
					} else if (var15 == 1) {
						method801(var23, var22, JagString.join(new JagString[] { Statics.field3201, arg1.field766 }), var14 ? 17 : 1, null);
					} else {
						method801(var23, var22, arg1.field766, var14 ? 17 : 2, null);
					}
				}
			}
			in.pos = var16 + var17;
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.field4114 = in.g2();
		if (arg1.field4114 == 65535) {
			arg1.field4114 = -1;
			return;
		}
	}

	@ObfuscatedName("ka.a(BILq;)I")
	public static int method761(int arg0, IfType arg1) {
		if (arg1.field3392 == null || arg0 >= arg1.field3392.length) {
			return -2;
		}
		try {
			int[] var2 = arg1.field3392[arg0];
			int var3 = 0;
			int var4 = 0;
			byte var5 = 0;
			while (true) {
				int var6 = var2[var4++];
				byte var7 = 0;
				int var8 = 0;
				if (var6 == 0) {
					return var3;
				}
				if (var6 == 1) {
					var8 = Statics.field1907[var2[var4++]];
				}
				if (var6 == 2) {
					var8 = Statics.field4066[var2[var4++]];
				}
				if (var6 == 3) {
					var8 = Statics.field3562[var2[var4++]];
				}
				if (var6 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					IfType var11 = method1579(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!ObjType.list(var12).field2877 || memServer)) {
						for (int var13 = 0; var13 < var11.field3388.length; var13++) {
							if (var11.field3388[var13] == var12 + 1) {
								var8 += var11.field3474[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var8 = VarCache.field2050[var2[var4++]];
				}
				if (var6 == 6) {
					var8 = Statics.field1710[Statics.field4066[var2[var4++]] - 1];
				}
				if (var6 == 7) {
					var8 = VarCache.field2050[var2[var4++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var8 = localPlayer.field747;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Statics.field255[var14]) {
							var8 += Statics.field4066[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					IfType var17 = method1579(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!ObjType.list(var18).field2877 || memServer)) {
						for (int var19 = 0; var19 < var17.field3388.length; var19++) {
							if (var18 + 1 == var17.field3388[var19]) {
								var8 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var8 = Statics.field4458;
				}
				if (var6 == 15) {
					var7 = 1;
				}
				if (var6 == 12) {
					var8 = Statics.field3788;
				}
				if (var6 == 13) {
					int var20 = VarCache.field2050[var2[var4++]];
					int var21 = var2[var4++];
					var8 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 16) {
					var7 = 2;
				}
				if (var6 == 14) {
					int var22 = var2[var4++];
					var8 = VarCache.method930(var22);
				}
				if (var6 == 17) {
					var7 = 3;
				}
				if (var6 == 18) {
					var8 = (localPlayer.field4136 >> 7) + field4212;
				}
				if (var6 == 19) {
					var8 = (localPlayer.field4121 >> 7) + field3679;
				}
				if (var6 == 20) {
					var8 = var2[var4++];
				}
				if (var7 == 0) {
					if (var5 == 0) {
						var3 += var8;
					}
					if (var5 == 1) {
						var3 -= var8;
					}
					if (var5 == 2 && var8 != 0) {
						var3 /= var8;
					}
					if (var5 == 3) {
						var3 *= var8;
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

	@ObfuscatedName("qj.c(Z)V")
	public static void mapBuildLoop() {
		method893(false);
		boolean var0 = true;
		field3754 = 0;
		for (int var1 = 0; var1 < ClientBuild.field3221.length; var1++) {
			if (Statics.field453[var1] != -1 && ClientBuild.field3221[var1] == null) {
				ClientBuild.field3221[var1] = maps.getFile(0, Statics.field453[var1]);
				if (ClientBuild.field3221[var1] == null) {
					var0 = false;
					field3754++;
				}
			}
			if (Statics.field2402[var1] != -1 && Statics.field774[var1] == null) {
				Statics.field774[var1] = maps.method949(Statics.field268[var1], Statics.field2402[var1], 0);
				if (Statics.field774[var1] == null) {
					var0 = false;
					field3754++;
				}
			}
		}
		if (!var0) {
			field3861 = 1;
			return;
		}
		field2045 = 0;
		boolean var2 = true;
		for (int var3 = 0; var3 < ClientBuild.field3221.length; var3++) {
			byte[] var4 = Statics.field774[var3];
			if (var4 != null) {
				int var5 = (ClientBuild.field2731[var3] >> 8) * 64 - field4212;
				int var6 = (ClientBuild.field2731[var3] & 0xFF) * 64 - field3679;
				if (Statics.field2555) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= ClientBuild.method1311(var4, var6, var5);
			}
		}
		if (!var2) {
			field3861 = 2;
			return;
		}
		if (field3861 != 0) {
			messageBox(JagString.join(new JagString[] { Text.field4478, Statics.field4190 }), true);
		}
		doAudio();
		clearCaches();
		World.method579();
		for (int var7 = 0; var7 < 4; var7++) {
			collision[var7].method643();
		}
		for (int var8 = 0; var8 < 4; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					ClientBuild.field2098[var8][var9][var10] = 0;
				}
			}
		}
		BgSound.method288();
		doAudio();
		System.gc();
		doAudio();
		method893(true);
		ClientBuild.method1425();
		if (!Statics.field2555) {
			method934();
			method893(true);
			method1327();
		}
		if (Statics.field2555) {
			ClientBuild.method239();
			method893(true);
			ClientBuild.method576();
		}
		clearCaches();
		method893(true);
		doAudio();
		ClientBuild.method523(collision);
		method893(true);
		doAudio();
		int var11 = ClientBuild.field468;
		if (field2907 < var11) {
			var11 = field2907;
		}
		if (var11 < field2907 - 1) {
		}
		if (lowMem) {
			World.method281(ClientBuild.field468);
		} else {
			World.method281(0);
		}
		ClientBuild.method39();
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				method175(var12, var13);
			}
		}
		doAudio();
		Statics.method1437();
		clearCaches();
		if (frame != null) {
			out.method30(198);
			out.p4(1057001181);
		}
		if (!Statics.field2555) {
			int var14 = (mapBuildCentreZoneX - 6) / 8;
			int var15 = (field2014 - 6) / 8;
			int var16 = (mapBuildCentreZoneX + 6) / 8;
			int var17 = (field2014 + 6) / 8;
			for (int var18 = var14 - 1; var18 <= var16 + 1; var18++) {
				for (int var19 = var15 - 1; var19 <= var17 + 1; var19++) {
					if (var14 > var18 || var16 < var18 || var19 < var15 || var19 > var17) {
						maps.method969(JagString.join(new JagString[] { Statics.field4018, JagString.method1212(var18), Statics.field933, JagString.method1212(var19) }));
						maps.method969(JagString.join(new JagString[] { Statics.field1928, JagString.method1212(var18), Statics.field933, JagString.method1212(var19) }));
					}
				}
			}
		}
		setMainState(30);
		doAudio();
		out.method30(213);
		doneslowupdate();
	}

	@ObfuscatedName("sf.d(I)V")
	public static void method1385() {
		field563 = 0;
		int var0 = field4212 + (localPlayer.field4136 >> 7);
		int var1 = field3679 + (localPlayer.field4121 >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			field563 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			field563 = 1;
		}
		if (field563 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			field563 = 0;
		}
	}

	@ObfuscatedName("i.h(I)V")
	public static void method633() {
		while (true) {
			if (in.method31(psize) >= 27) {
				int var0 = in.method28(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (field4223[var0] == null) {
						var1 = true;
						field4223[var0] = new ClientNpc();
					}
					ClientNpc var2 = field4223[var0];
					Statics.field402[Statics.field1041++] = var0;
					var2.field4081 = field2113;
					int var3 = in.method28(1);
					int var4 = in.method28(5);
					int var5 = in.method28(1);
					if (var5 == 1) {
						field2579[field3702++] = var0;
					}
					int var6 = field75[in.method28(3)];
					if (var1) {
						var2.field4119 = var2.field4085 = var6;
					}
					var2.field3682 = NpcType.list(in.method28(14));
					int var7 = in.method28(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.field4103 = var2.field3682.field2349;
					if (var4 > 15) {
						var4 -= 32;
					}
					var2.field4084 = var2.field3682.field2351;
					var2.field4105 = var2.field3682.field2325;
					var2.field4122 = var2.field3682.field2337;
					var2.field4091 = var2.field3682.field2317;
					var2.field4102 = var2.field3682.field2339;
					if (var2.field4102 == 0) {
						var2.field4085 = 0;
					}
					var2.field4123 = var2.field3682.field2343;
					var2.field4092 = var2.field3682.field2322;
					var2.field4128 = var2.field3682.field2360;
					var2.method1474(var3 == 1, localPlayer.field4087[0] + var4, localPlayer.field4141[0] - -var7);
					continue;
				}
			}
			in.method35();
			return;
		}
	}

	@ObfuscatedName("ac.a(IIILq;)V")
	public static void method16(int arg0, int arg1, IfType arg2) {
		if (minimapState != 0 && minimapState != 3) {
			return;
		}
		int var3 = arg1 - arg2.field3422 / 2;
		int var4 = arg0 - arg2.field3380 / 2;
		int var5 = field3930 + field943 & 0x7FF;
		int var6 = Pix3D.field3354[var5];
		int var7 = Pix3D.field3359[var5];
		int var8 = (Statics.field1185 + 256) * var6 >> 8;
		int var9 = (Statics.field1185 + 256) * var7 >> 8;
		int var10 = var4 * var8 + var9 * var3 >> 11;
		int var11 = var10 + localPlayer.field4136 >> 7;
		int var12 = var8 * var3 - var4 * var9 >> 11;
		int var13 = localPlayer.field4121 - var12 >> 7;
		boolean var14 = method1421(0, 0, var13, var11, localPlayer.field4087[0], 0, 0, 1, true, 0, localPlayer.field4141[0]);
		if (!var14) {
			return;
		}
		out.p1(var4);
		out.p1(var3);
		out.method305(field3930);
		out.p1(57);
		out.p1(field943);
		out.p1(Statics.field1185);
		out.p1(89);
		out.method305(localPlayer.field4136);
		out.method305(localPlayer.field4121);
		out.p1(field2186);
		out.p1(63);
	}

	@ObfuscatedName("bb.a(II)V")
	public static void method70(int arg0) {
		for (IntNode var1 = (IntNode) Statics.field495.method1047(); var1 != null; var1 = (IntNode) Statics.field495.method1048()) {
			if ((long) arg0 == (var1.key >> 48 & 0xFFFFL)) {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("ja.a(B)V")
	public static void method688() {
		method1371(field3568);
		field4256++;
		if (field2905 && field487) {
			int var0 = ClientMouseListener.field471;
			int var1 = var0 - field2791;
			if (field2371 > var1) {
				var1 = field2371;
			}
			int var2 = ClientMouseListener.field4449;
			int var3 = var2 - field3941;
			if (field466 > var3) {
				var3 = field466;
			}
			if (var3 + field3568.field3422 > field923.field3422 + field466) {
				var3 = field466 + field923.field3422 - field3568.field3422;
			}
			int var4 = var3 - field2506;
			int var5 = field3568.field3413;
			if (field3568.field3380 + var1 > field2371 - -field923.field3380) {
				var1 = field923.field3380 + field2371 - field3568.field3380;
			}
			int var6 = var3 + field923.field3415 - field466;
			int var7 = field923.field3393 + var1 - field2371;
			int var8 = var1 - field208;
			if (field4256 > field3568.field3475 && (var8 > var5 || var8 < -var5 || var4 > var5 || -var5 > var4)) {
				field3867 = true;
			}
			if (field3568.field3456 != null && field3867) {
				HookReq var9 = new HookReq();
				var9.field681 = field3568.field3456;
				var9.field691 = var6;
				var9.field694 = var7;
				var9.field678 = field3568;
				ScriptRunner.method1373(var9);
			}
			if (ClientMouseListener.field3016 == 0) {
				if (field3867) {
					if (field3568.field3412 != null) {
						HookReq var10 = new HookReq();
						var10.field681 = field3568.field3412;
						var10.field678 = field3568;
						var10.field694 = var7;
						var10.field691 = var6;
						var10.field676 = field2217;
						ScriptRunner.method1373(var10);
					}
					if (field2217 != null && method583(field3568) != null) {
						out.method30(135);
						out.method314(field3568.field3406);
						out.method316(field3568.parentId);
						out.method316(field2217.parentId);
						out.method344(field2217.field3406);
					}
				} else if ((field3859 == 1 || method1554(field3862 - 1)) && field3862 > 2) {
					method904();
				} else if (field3862 > 0) {
					method1257(field3862 - 1);
				}
				field3568 = null;
			}
		} else if (field4256 > 1) {
			field3568 = null;
		}
	}

	@ObfuscatedName("ja.a(IIIIIIIIIIIZ)Z")
	public static boolean method690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				field3673[var11][var12] = 0;
				field4267[var11][var12] = 99999999;
			}
		}
		field3673[arg3][arg2] = 99;
		int var13 = arg3;
		field4267[arg3][arg2] = 0;
		int var14 = arg2;
		byte var15 = 0;
		field2203[0] = arg3;
		int var16 = 0;
		int var30 = var15 + 1;
		field1781[0] = arg2;
		int[][] var17 = collision[field2907].field1667;
		boolean var18 = false;
		while (var16 != var30) {
			var14 = field1781[var16];
			var13 = field2203[var16];
			var16 = var16 + 1 & 0xFFF;
			if (var13 == arg4 && arg0 == var14) {
				var18 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && collision[field2907].method640(var14, arg1 - 1, arg4, arg0, 1, arg6, var13)) {
					var18 = true;
					break;
				}
				if (arg1 < 10 && collision[field2907].method648(arg6, var13, arg1 - 1, arg0, 1, var14, arg4)) {
					var18 = true;
					break;
				}
			}
			if (arg7 != 0 && arg5 != 0 && collision[field2907].method650(1, arg0, arg7, var14, arg5, var13, arg4, arg9)) {
				var18 = true;
				break;
			}
			int var19 = field4267[var13][var14] + 1;
			if (var13 > 0 && field3673[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 - 1][var14] = 2;
				field4267[var13 - 1][var14] = var19;
			}
			if (var13 < 103 && field3673[var13 + 1][var14] == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 + 1][var14] = 8;
				field4267[var13 + 1][var14] = var19;
			}
			if (var14 > 0 && field3673[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				field2203[var30] = var13;
				field1781[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13][var14 - 1] = 1;
				field4267[var13][var14 - 1] = var19;
			}
			if (var14 < 103 && field3673[var13][var14 + 1] == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				field2203[var30] = var13;
				field1781[var30] = var14 + 1;
				field3673[var13][var14 + 1] = 4;
				var30 = var30 + 1 & 0xFFF;
				field4267[var13][var14 + 1] = var19;
			}
			if (var13 > 0 && var14 > 0 && field3673[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 - 1][var14 - 1] = 3;
				field4267[var13 - 1][var14 - 1] = var19;
			}
			if (var13 < 103 && var14 > 0 && field3673[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 + 1][var14 - 1] = 9;
				field4267[var13 + 1][var14 - 1] = var19;
			}
			if (var13 > 0 && var14 < 103 && field3673[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				field2203[var30] = var13 - 1;
				field1781[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				field3673[var13 - 1][var14 + 1] = 6;
				field4267[var13 - 1][var14 + 1] = var19;
			}
			if (var13 < 103 && var14 < 103 && field3673[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				field2203[var30] = var13 + 1;
				field1781[var30] = var14 + 1;
				field3673[var13 + 1][var14 + 1] = 12;
				field4267[var13 + 1][var14 + 1] = var19;
				var30 = var30 + 1 & 0xFFF;
			}
		}
		field2186 = 0;
		if (!var18) {
			if (!arg10) {
				return false;
			}
			int var20 = 1000;
			int var21 = 100;
			for (int var22 = arg4 - 10; var22 <= arg4 + 10; var22++) {
				for (int var23 = arg0 - 10; var23 <= arg0 + 10; var23++) {
					if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && field4267[var22][var23] < 100) {
						int var24 = 0;
						if (var22 < arg4) {
							var24 = arg4 - var22;
						} else if (arg7 + arg4 - 1 < var22) {
							var24 = var22 + 1 - arg7 - arg4;
						}
						int var25 = 0;
						if (var23 < arg0) {
							var25 = arg0 - var23;
						} else if (var23 > arg5 + arg0 - 1) {
							var25 = var23 + 1 - arg0 - arg5;
						}
						int var26 = var25 * var25 + var24 * var24;
						if (var20 > var26 || var20 == var26 && var21 > field4267[var22][var23]) {
							var21 = field4267[var22][var23];
							var20 = var26;
							var14 = var23;
							var13 = var22;
						}
					}
				}
			}
			if (var20 == 1000) {
				return false;
			}
			if (arg3 == var13 && var14 == arg2) {
				return false;
			}
			field2186 = 1;
		}
		byte var27 = 0;
		field2203[0] = var13;
		int var31 = var27 + 1;
		field1781[0] = var14;
		int var28;
		int var29 = var28 = field3673[var13][var14];
		while (arg3 != var13 || var14 != arg2) {
			if (var28 != var29) {
				field2203[var31] = var13;
				var28 = var29;
				field1781[var31++] = var14;
			}
			if ((var29 & 0x1) != 0) {
				var14++;
			} else if ((var29 & 0x4) != 0) {
				var14--;
			}
			if ((var29 & 0x2) != 0) {
				var13++;
			} else if ((var29 & 0x8) != 0) {
				var13--;
			}
			var29 = field3673[var13][var14];
		}
		if (var31 > 0) {
			method1611(arg8, field2203, field1781, var31);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("l.a(IIIIBI)V")
	public static void method820(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 == mapBuildCentreZoneX && field2014 == arg3 && (arg0 == field3026 || !lowMem)) {
			return;
		}
		field3026 = arg0;
		if (!lowMem) {
			field3026 = 0;
		}
		field2014 = arg3;
		mapBuildCentreZoneX = arg2;
		setMainState(25);
		messageBox(Text.field4478, true);
		int var5 = field4212;
		int var6 = field3679;
		field3679 = arg3 * 8 - 48;
		int var7 = field3679 - var6;
		field4212 = (arg2 - 6) * 8;
		int var8 = field4212 - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			ClientNpc var10 = field4223[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.field4087[var11] -= var8;
					var10.field4141[var11] -= var7;
				}
				var10.field4121 -= var7 * 128;
				var10.field4136 -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			ClientPlayer var13 = field4491[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.field4087[var14] -= var8;
					var13.field4141[var14] -= var7;
				}
				var13.field4136 -= var8 * 128;
				var13.field4121 -= var7 * 128;
			}
		}
		field2907 = arg0;
		byte var15 = 0;
		byte var16 = 104;
		localPlayer.method1474(false, arg4, arg1);
		byte var17 = 0;
		byte var18 = 1;
		if (var8 < 0) {
			var16 = -1;
			var18 = -1;
			var15 = 103;
		}
		byte var19 = 1;
		byte var20 = 104;
		if (var7 < 0) {
			var20 = -1;
			var19 = -1;
			var17 = 103;
		}
		for (int var21 = var15; var21 != var16; var21 += var18) {
			for (int var22 = var17; var22 != var20; var22 += var19) {
				int var23 = var8 + var21;
				int var24 = var22 + var7;
				for (int var25 = 0; var25 < 4; var25++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
						field2497[var25][var21][var22] = field2497[var25][var23][var24];
					} else {
						field2497[var25][var21][var22] = null;
					}
				}
			}
		}
		for (LocChange var26 = (LocChange) field1140.head(); var26 != null; var26 = (LocChange) field1140.method1619()) {
			var26.field3059 -= var8;
			var26.field3052 -= var7;
			if (var26.field3059 < 0 || var26.field3052 < 0 || var26.field3059 >= 104 || var26.field3052 >= 104) {
				var26.unlink();
			}
		}
		if (field2102 != 0) {
			field2102 -= var8;
			field2594 -= var7;
		}
		field3336 = -1;
		field3567 = false;
		field3445 = 0;
		field714.method1616();
		field3220.method1616();
	}

	@ObfuscatedName("pi.c(B)V")
	public static void method1218() {
		for (int var0 = 0; var0 < field3702; var0++) {
			int var1 = field2579[var0];
			ClientPlayer var2 = field4491[var1];
			int var3 = in.g1();
			if ((var3 & 0x2) != 0) {
				var3 += in.g1() << 8;
			}
			method1394(var3, var2, var1);
		}
	}

	@ObfuscatedName("dc.a(IIIBI)V")
	public static void method248(int arg0, int arg1, int arg2, int arg3) {
		Statics.field3990++;
		method1128(true);
		method1023(true);
		method1128(false);
		method1023(false);
		method256();
		method1370();
		if (!field3567) {
			int var4 = field1173;
			int var5 = field3930 + Statics.field1795 & 0x7FF;
			if (Statics.field1328 / 256 > var4) {
				var4 = Statics.field1328 / 256;
			}
			if (Statics.field4368[4] && Statics.field1194[4] + 128 > var4) {
				var4 = Statics.field1194[4] + 128;
			}
			method359(field666, method1584(localPlayer.field4136, localPlayer.field4121, field2907) - 50, var5, var4, var4 * 3 + 600, arg2, field4366);
		}
		int var6;
		if (field3567) {
			var6 = method1040();
		} else {
			var6 = Statics.method885();
		}
		int var7 = field1954;
		int var8 = field3934;
		int var9 = field1428;
		int var10 = field3608;
		int var11 = field3257;
		for (int var12 = 0; var12 < 5; var12++) {
			if (Statics.field4368[var12]) {
				int var13 = (int) (Math.random() * (double) (Statics.field3834[var12] * 2 + 1) + Math.sin((double) Statics.field3674[var12] * ((double) Statics.field3714[var12] / 100.0D)) * (double) Statics.field1194[var12] - (double) Statics.field3834[var12]);
				if (var12 == 3) {
					field3257 = field3257 + var13 & 0x7FF;
				}
				if (var12 == 4) {
					field3934 += var13;
					if (field3934 < 128) {
						field3934 = 128;
					}
					if (field3934 > 383) {
						field3934 = 383;
					}
				}
				if (var12 == 2) {
					field3608 += var13;
				}
				if (var12 == 1) {
					field1954 += var13;
				}
				if (var12 == 0) {
					field1428 += var13;
				}
			}
		}
		Pix2D.setClipping(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Pix3D.setRenderClipping();
		int var14 = ClientMouseListener.field471;
		int var15 = ClientMouseListener.field4449;
		if (var14 >= arg1 && arg1 + arg0 > var14 && arg3 <= var15 && var15 < arg3 + arg2) {
			Statics.field997 = true;
			SoftwareModelLit.field3101 = 0;
			int var16 = Statics.field2766;
			int var17 = Statics.field2931;
			int var18 = Statics.field1102;
			Statics.field2610 = var16 + (var17 - var16) * (ClientMouseListener.field471 - arg1) / arg0;
			int var19 = Statics.field4055;
			Statics.field3604 = (ClientMouseListener.field4449 - arg3) * (var19 - var18) / arg2 + var18;
		} else {
			Statics.field997 = false;
			SoftwareModelLit.field3101 = 0;
		}
		doAudio();
		Pix2D.method478(arg1, arg3, arg0, arg2, 0);
		World.method772(field1428, field1954, field3608, field3934, field3257, var6, null, null, null, null, null, null, localPlayer.field4136 >> 7, localPlayer.field4121 >> 7);
		doAudio();
		World.method763();
		method391(arg1, arg3, arg2, arg0);
		method993(arg1, arg3, arg2, arg0);
		((TextureManager) Pix3D.field3356).method466(field261);
		method53(arg1, arg2, arg3, arg0);
		field3257 = var11;
		field3934 = var8;
		field1428 = var9;
		field1954 = var7;
		field3608 = var10;
		if (Statics.field2980 && Js5Net.method1067() == 0) {
			Statics.field2980 = false;
		}
		if (Statics.field2980) {
			Pix2D.method478(arg1, arg3, arg0, arg2, 0);
			messageBox(Text.field4478, false);
		}
		if (!Statics.field2980 && !field1958 && arg1 <= var14 && var14 < arg0 + arg1 && arg3 <= var15 && var15 < arg2 + arg3) {
			method1398(var15, arg1, arg2, arg0, arg3, var14);
		}
	}

	@ObfuscatedName("qa.a(II)V")
	public static void method1257(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = field3176[arg0];
		int var2 = field4060[arg0];
		int var3 = field994[arg0];
		long var4 = field1352[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var6 = (int) field1352[arg0];
		if (var3 == 31) {
			ClientPlayer var7 = field4491[var6];
			if (var7 != null) {
				method1421(1, 0, var7.field4141[0], var7.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field3017 = 2;
				field2757 = ClientMouseListener.field4239;
				field796 = 0;
				field2997 = ClientMouseListener.field3339;
				out.method30(192);
				out.method331(field905);
				out.method351(field3965);
				out.method305(field1105);
				out.method305(var6);
			}
		}
		if (var3 == 1006) {
			field796 = 0;
			field2757 = ClientMouseListener.field4239;
			field2997 = ClientMouseListener.field3339;
			field3017 = 2;
			out.method30(191);
			out.method305(var6);
		}
		if (var3 == 7) {
			method705(var2, var4, var1);
			out.method30(53);
			out.method305((int) (var4 >>> 32) & Integer.MAX_VALUE);
			out.method344(field3679 + var2);
			out.method344(var1 + field4212);
		}
		if (var3 == 15) {
			IfType var8 = method238(var1, var2);
			if (var8 != null) {
				method363();
				method1064(var2, method592(Statics.method530(var8)), var1);
				field475 = 0;
				Statics.field3835 = Statics.method1345(var8);
				if (Statics.field3835 == null) {
					Statics.field3835 = Statics.field710;
				}
				if (var8.field3410) {
					Statics.field464 = JagString.join(new JagString[] { var8.field3457, Statics.field1637 });
					return;
				}
				Statics.field464 = JagString.join(new JagString[] { Statics.field182, var8.field3459, Statics.field1637 });
			}
			return;
		}
		if (var3 == 30) {
			ClientPlayer var9 = field4491[var6];
			if (var9 != null) {
				method1421(1, 0, var9.field4141[0], var9.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				field2757 = ClientMouseListener.field4239;
				out.method30(65);
				out.method314(var6);
			}
		}
		if (var3 == 40) {
			out.method30(196);
			out.method344(field569);
			out.p4(Statics.field249);
			out.method326(var2);
			out.method331(var1);
		}
		if (var3 == 34) {
			ClientNpc var10 = field4223[var6];
			if (var10 != null) {
				method1421(1, 0, var10.field4141[0], var10.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				field2757 = ClientMouseListener.field4239;
				out.method30(78);
				out.method331(var6);
			}
		}
		if (var3 == 58) {
			ClientPlayer var11 = field4491[var6];
			if (var11 != null) {
				method1421(1, 0, var11.field4141[0], var11.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field3017 = 2;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				out.method30(151);
				out.method305(var6);
			}
		}
		if (var3 == 4) {
			ClientNpc var12 = field4223[var6];
			if (var12 != null) {
				method1421(1, 0, var12.field4141[0], var12.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field2757 = ClientMouseListener.field4239;
				field796 = 0;
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				out.method30(71);
				out.method305(var6);
			}
		}
		if (var3 == 39) {
			out.method30(35);
			out.method344(var6);
			out.method305(field569);
			out.method316(Statics.field249);
			out.method331(var1);
			out.method316(var2);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 36) {
			out.method30(109);
			out.p4(var2);
			IfType var13 = method1579(var2);
			if (var13.field3392 != null && var13.field3392[0][0] == 5) {
				int var14 = var13.field3392[0][1];
				VarCache.field2050[var14] = 1 - VarCache.field2050[var14];
				method1068(var14);
			}
		}
		if (var3 == 1001) {
			IfType var15 = method1579(var2);
			if (var15 == null || var15.field3474[var1] < 100000) {
				out.method30(191);
				out.method305(var6);
			} else {
				method1499(JagString.join(new JagString[] { JagString.method1212(var15.field3474[var1]), Statics.field1973, ObjType.list(var6).name}), 0, field3453);
			}
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 1) {
			ClientPlayer var16 = field4491[var6];
			if (var16 != null) {
				method1421(1, 0, var16.field4141[0], var16.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				field2757 = ClientMouseListener.field4239;
				field796 = 0;
				out.method30(47);
				out.method344(var6);
			}
		}
		if (var3 == 21) {
			out.method30(160);
			out.method344(var1);
			out.method351(var2);
			out.method331(var6);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 2) {
			out.method30(216);
			out.method316(var2);
			out.method314(var1);
			out.method344(var6);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 35) {
			method705(var2, var4, var1);
			out.method30(13);
			out.method344(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.method314(field4212 + var1);
			out.method314(var2 + field3679);
		}
		if (var3 == 51) {
			method705(var2, var4, var1);
			out.method30(94);
			out.method331(var1 + field4212);
			out.method305(var2 + field3679);
			out.method344(Integer.MAX_VALUE & (int) (var4 >>> 32));
		}
		if (var3 == 29) {
			ClientPlayer var17 = field4491[var6];
			if (var17 != null) {
				method1421(1, 0, var17.field4141[0], var17.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field3017 = 2;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				out.method30(118);
				out.method331(var6);
			}
		}
		if (var3 == 48) {
			ClientNpc var18 = field4223[var6];
			if (var18 != null) {
				method1421(1, 0, var18.field4141[0], var18.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				field796 = 0;
				field3017 = 2;
				out.method30(30);
				out.method314(field1105);
				out.method326(field3965);
				out.method314(var6);
				out.method344(field905);
			}
		}
		if (var3 == 44) {
			out.method30(112);
			out.method305(var1);
			out.method326(var2);
			out.method344(var6);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 14) {
			method174();
		}
		if (var3 == 17) {
			ClientNpc var19 = field4223[var6];
			if (var19 != null) {
				method1421(1, 0, var19.field4141[0], var19.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field3017 = 2;
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				out.method30(164);
				out.method305(var6);
			}
		}
		if (var3 == 57) {
			boolean var20 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var20) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field2997 = ClientMouseListener.field3339;
			field2757 = ClientMouseListener.field4239;
			field3017 = 2;
			field796 = 0;
			out.method30(107);
			out.method314(field3679 + var2);
			out.method314(var6);
			out.method344(var1 + field4212);
		}
		if (var3 == 12) {
			method363();
			IfType var22 = method1579(var2);
			field475 = 1;
			field1105 = var1;
			field3965 = var2;
			field905 = var6;
			method1371(var22);
			field1414 = JagString.join(new JagString[] { Statics.field2529, ObjType.list(var6).name, Statics.field1637 });
			if (field1414 == null) {
				field1414 = Statics.field3572;
			}
			return;
		}
		if (var3 == 23) {
			ClientPlayer var23 = field4491[var6];
			if (var23 != null) {
				method1421(1, 0, var23.field4141[0], var23.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				out.method30(6);
				out.method344(var6);
				out.method331(field569);
				out.method326(Statics.field249);
			}
		}
		if (var3 == 6) {
			out.method30(150);
			out.method316(var2);
			out.method344(var1);
			out.method305(var6);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 10) {
			World.method374(field2907, var1, var2);
		}
		if (var3 == 1004) {
			method705(var2, var4, var1);
			out.method30(97);
			out.method344(var2 + field3679);
			out.method344((int) (var4 >>> 32) & Integer.MAX_VALUE);
			out.method314(var1 + field4212);
		}
		if (var3 == 43 || var3 == 1003) {
			method1390(var6, field3836[arg0], var1, var2);
		}
		if (var3 == 3) {
			boolean var24 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var24) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field2997 = ClientMouseListener.field3339;
			field2757 = ClientMouseListener.field4239;
			field3017 = 2;
			field796 = 0;
			out.method30(138);
			out.method331(var2 + field3679);
			out.method305(var6);
			out.method331(field4212 + var1);
		}
		if (var3 == 8) {
			out.method30(205);
			out.method314(var6);
			out.method331(var1);
			out.method316(var2);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 13) {
			out.method30(26);
			out.method305(var1);
			out.method305(var6);
			out.p4(var2);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 41) {
			boolean var26 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var26) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field2997 = ClientMouseListener.field3339;
			field796 = 0;
			field2757 = ClientMouseListener.field4239;
			field3017 = 2;
			out.method30(77);
			out.method344(var6);
			out.method344(var2 + field3679);
			out.method305(var1 + field4212);
		}
		if (var3 == 1002) {
			field2757 = ClientMouseListener.field4239;
			field796 = 0;
			field2997 = ClientMouseListener.field3339;
			field3017 = 2;
			ClientNpc var28 = field4223[var6];
			if (var28 != null) {
				NpcType var29 = var28.field3682;
				if (var29.field2327 != null) {
					var29 = var29.method862();
				}
				if (var29 != null) {
					out.method30(127);
					out.method314(var29.field2314);
				}
			}
		}
		if (var3 == 49) {
			out.method30(32);
			out.method344(var6);
			out.p4(var2);
			out.method344(var1);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 26 && method705(var2, var4, var1)) {
			out.method30(170);
			out.method331(field3679 + var2);
			out.p4(field3965);
			out.method344(var1 + field4212);
			out.method314(field1105);
			out.method331(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.method344(field905);
		}
		if (var3 == 45) {
			ClientPlayer var30 = field4491[var6];
			if (var30 != null) {
				method1421(1, 0, var30.field4141[0], var30.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				field3017 = 2;
				out.method30(214);
				out.method331(var6);
			}
		}
		if (var3 == 25) {
			boolean var31 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var31) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field3017 = 2;
			field2997 = ClientMouseListener.field3339;
			field2757 = ClientMouseListener.field4239;
			field796 = 0;
			out.method30(84);
			out.method305(var1 + field4212);
			out.method305(var6);
			out.method314(var2 + field3679);
			out.method351(Statics.field249);
			out.method314(field569);
		}
		if (var3 == 22) {
			boolean var33 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var33) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field3017 = 2;
			field2997 = ClientMouseListener.field3339;
			field2757 = ClientMouseListener.field4239;
			field796 = 0;
			out.method30(39);
			out.method314(var1 + field4212);
			out.method331(var6);
			out.method344(field3679 + var2);
		}
		if (var3 == 38) {
			ClientNpc var35 = field4223[var6];
			if (var35 != null) {
				method1421(1, 0, var35.field4141[0], var35.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				field3017 = 2;
				field796 = 0;
				out.method30(33);
				out.method314(var6);
			}
		}
		if (var3 == 24 && method705(var2, var4, var1)) {
			out.method30(234);
			out.method314(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.method314(field569);
			out.method316(Statics.field249);
			out.method314(var1 + field4212);
			out.method305(field3679 + var2);
		}
		if (var3 == 28) {
			out.method30(154);
			out.p4(var2);
			out.method344(var6);
			out.method344(var1);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 20) {
			out.method30(109);
			out.p4(var2);
			IfType var36 = method1579(var2);
			if (var36.field3392 != null && var36.field3392[0][0] == 5) {
				int var37 = var36.field3392[0][1];
				if (var36.field3486[0] != VarCache.field2050[var37]) {
					VarCache.field2050[var37] = var36.field3486[0];
					method1068(var37);
				}
			}
		}
		if (var3 == 18) {
			out.method30(251);
			out.method305(var1);
			out.method331(var6);
			out.p4(var2);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 47 && field967 == null) {
			method1391(var1, var2);
			field967 = method238(var1, var2);
			method1371(field967);
		}
		if (var3 == 32) {
			ClientNpc var38 = field4223[var6];
			if (var38 != null) {
				method1421(1, 0, var38.field4141[0], var38.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field2757 = ClientMouseListener.field4239;
				field3017 = 2;
				field796 = 0;
				field2997 = ClientMouseListener.field3339;
				out.method30(195);
				out.method305(var6);
			}
		}
		if (var3 == 33) {
			method705(var2, var4, var1);
			out.method30(169);
			out.method305(var2 + field3679);
			out.method314(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.method344(field4212 + var1);
		}
		if (var3 == 11) {
			IfType var39 = method1579(var2);
			boolean var40 = true;
			if (var39.field3439 > 0) {
				var40 = method389(var39);
			}
			if (var40) {
				out.method30(109);
				out.p4(var2);
			}
		}
		if (var3 == 9) {
			out.method30(55);
			out.method314(var1);
			out.method351(var2);
			out.method331(var6);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 5) {
			boolean var41 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var41) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field796 = 0;
			field3017 = 2;
			field2757 = ClientMouseListener.field4239;
			field2997 = ClientMouseListener.field3339;
			out.method30(211);
			out.method344(field4212 + var1);
			out.method314(var2 + field3679);
			out.method344(var6);
		}
		if (var3 == 42) {
			out.method30(4);
			out.method305(field905);
			out.method331(var6);
			out.method331(field1105);
			out.method326(var2);
			out.method331(var1);
			out.p4(field3965);
			field2573 = 0;
			field1091 = method1579(var2);
			field1742 = var1;
		}
		if (var3 == 37) {
			ClientPlayer var43 = field4491[var6];
			if (var43 != null) {
				method1421(1, 0, var43.field4141[0], var43.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				field3017 = 2;
				out.method30(114);
				out.method305(var6);
			}
		}
		if (var3 == 16) {
			ClientPlayer var44 = field4491[var6];
			if (var44 != null) {
				method1421(1, 0, var44.field4141[0], var44.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				field2997 = ClientMouseListener.field3339;
				field3017 = 2;
				out.method30(161);
				out.method331(var6);
			}
		}
		if (var3 == 1005) {
			field3017 = 2;
			field2997 = ClientMouseListener.field3339;
			field796 = 0;
			field2757 = ClientMouseListener.field4239;
			out.method30(166);
			out.method331(var6);
		}
		if (var3 == 50) {
			ClientPlayer var45 = field4491[var6];
			if (var45 != null) {
				method1421(1, 0, var45.field4141[0], var45.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field3017 = 2;
				field796 = 0;
				field2997 = ClientMouseListener.field3339;
				field2757 = ClientMouseListener.field4239;
				out.method30(204);
				out.method344(var6);
			}
		}
		if (var3 == 19) {
			ClientNpc var46 = field4223[var6];
			if (var46 != null) {
				method1421(1, 0, var46.field4141[0], var46.field4087[0], localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
				field796 = 0;
				field2757 = ClientMouseListener.field4239;
				field3017 = 2;
				field2997 = ClientMouseListener.field3339;
				out.method30(145);
				out.method351(Statics.field249);
				out.method314(var6);
				out.method305(field569);
			}
		}
		if (var3 == 46) {
			boolean var47 = method1421(0, 0, var2, var1, localPlayer.field4087[0], 0, 0, 2, false, 0, localPlayer.field4141[0]);
			if (!var47) {
				method1421(1, 0, var2, var1, localPlayer.field4087[0], 1, 0, 2, false, 0, localPlayer.field4141[0]);
			}
			field3017 = 2;
			field796 = 0;
			field2997 = ClientMouseListener.field3339;
			field2757 = ClientMouseListener.field4239;
			out.method30(176);
			out.method314(field3679 + var2);
			out.method316(field3965);
			out.method314(field1105);
			out.method344(field4212 + var1);
			out.method344(field905);
			out.method314(var6);
		}
		if (field475 != 0) {
			field475 = 0;
			method1371(method1579(field3965));
		}
		if (Statics.field145) {
			method363();
		}
		if (field1091 != null && field2573 == 0) {
			method1371(field1091);
		}
	}

	@ObfuscatedName("je.a(IB[Lq;)V")
	public static void method714(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null && arg0 == var3.field3504 && (!var3.field3410 || !Statics.method475(var3))) {
				if (var3.field3390 == 0) {
					if (!var3.field3410 && Statics.method475(var3) && var3 != Statics.field1177) {
						continue;
					}
					method714(var3.parentId, arg1);
					if (var3.field3465 != null) {
						method714(var3.parentId, var3.field3465);
					}
					SubInterface var4 = (SubInterface) field2395.method1049((long) var3.parentId);
					if (var4 != null) {
						animateInterface(var4.field3229);
					}
				}
				if (var3.field3390 == 6) {
					if (var3.field3404 != -1 || var3.field3386 != -1) {
						boolean var5 = method533(var3);
						int var6;
						if (var5) {
							var6 = var3.field3386;
						} else {
							var6 = var3.field3404;
						}
						if (var6 != -1) {
							SeqType var7 = SeqType.list(var6);
							if (var7 != null) {
								var3.field3487 += field261;
								while (var3.field3487 > var7.field1990[var3.field3379]) {
									var3.field3487 -= var7.field1990[var3.field3379];
									var3.field3379++;
									if (var3.field3379 >= var7.field1965.length) {
										var3.field3379 -= var7.field1972;
										if (var3.field3379 < 0 || var3.field3379 >= var7.field1965.length) {
											var3.field3379 = 0;
										}
									}
									method1371(var3);
								}
							}
						}
					}
					if (var3.field3385 != 0 && !var3.field3410) {
						int var8 = var3.field3385 << 16 >> 16;
						int var9 = var3.field3385 >> 16;
						int var10 = var9 * field261;
						var3.field3455 = var10 + var3.field3455 & 0x7FF;
						int var11 = var8 * field261;
						var3.field3509 = var11 + var3.field3509 & 0x7FF;
						method1371(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("lg.b(B)V")
	public static void method867() {
		for (SubInterface var0 = (SubInterface) field2395.method1047(); var0 != null; var0 = (SubInterface) field2395.method1048()) {
			int var1 = var0.field3229;
			if (IfType.openInterface(var1)) {
				boolean var2 = true;
				IfType[] var3 = IfType.list[var1];
				for (int var4 = 0; var4 < var3.length; var4++) {
					if (var3[var4] != null) {
						var2 = var3[var4].field3410;
						break;
					}
				}
				if (!var2) {
					int var5 = (int) var0.key;
					IfType var6 = method1579(var5);
					if (var6 != null) {
						method1371(var6);
					}
				}
			}
		}
	}

	@ObfuscatedName("lf.a(IIIIB)V")
	public static void method861(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field3923; var4++) {
			if (arg3 < field1455[var4] + field2485[var4] && arg3 + arg1 > field1455[var4] && arg2 < field2471[var4] + field1447[var4] && field2471[var4] < arg0 + arg2) {
				field4228[var4] = true;
			}
		}
	}

	@ObfuscatedName("se.b(I)V")
	public static void method1380() {
		if (field1910 > 0) {
			method785();
		} else {
			setMainState(40);
			prevStream = stream;
			stream = null;
		}
	}

	@ObfuscatedName("aj.a(IIIIB)V")
	public static void method53(int arg0, int arg1, int arg2, int arg3) {
		if (field3017 == 1) {
			field2982[field796 / 100].method1155(field2757 - 8, field2997 + -8);
		}
		if (field3017 == 2) {
			field2982[field796 / 100 + 4].method1155(field2757 - 8, field2997 + -8);
		}
		method1385();
		if (!field2768) {
			return;
		}
		int var4 = arg0 + 512 - 5;
		int var5 = arg2 + 20;
		field30.method150(JagString.join(new JagString[] {Statics.field3569, JagString.method1212(Statics.field192) }), var4, var5, 16776960, -1);
		int var9 = var5 + 15;
		int var6 = 16776960;
		Runtime var7 = Runtime.getRuntime();
		int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
		if (var8 > 32768 && lowMem) {
			var6 = 16711680;
		}
		if (var8 > 65536 && !lowMem) {
			var6 = 16711680;
		}
		field30.method150(JagString.join(new JagString[] {Statics.field3921, JagString.method1212(var8), Statics.field2007 }), var4, var9, var6, -1);
		var5 = var9 + 15;
	}

	@ObfuscatedName("aj.a(IJ)V")
	public static void method55(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (field1221 >= 100) {
			method1499(Text.field2142, 0, field3453);
			return;
		}
		JagString var2 = JagString.method1375(arg0).method614();
		for (int var3 = 0; var3 < field1221; var3++) {
			if (field1764[var3] == arg0) {
				method1499(JagString.join(new JagString[] { var2, Text.field2999 }), 0, field3453);
				return;
			}
		}
		for (int var4 = 0; var4 < field2729; var4++) {
			if (arg0 == field2086[var4]) {
				method1499(JagString.join(new JagString[] {Text.field1971, var2, Text.field2085 }), 0, field3453);
				return;
			}
		}
		if (var2.method597(localPlayer.field766)) {
			method1499(Text.field151, 0, field3453);
			return;
		}
		field1764[field1221] = arg0;
		field2741[field1221++] = JagString.method1375(arg0);
		field313 = field1211;
		out.method30(28);
		out.p8(arg0);
	}

	@ObfuscatedName("te.a(IIBIZ)V")
	public static void method1449(int arg0, int arg1, int arg2, boolean arg3) {
		if (IfType.openInterface(arg1)) {
			method1055(arg0, arg3, -1, arg2, IfType.list[arg1]);
		}
	}

	@ObfuscatedName("ph.e(I)V")
	public static void method1214() {
		for (int var0 = -1; var0 < field1027; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = field3428[var0];
			}
			ClientPlayer var2 = field4491[var1];
			if (var2 != null) {
				method514(var2.field4103, var2);
			}
		}
	}

	@ObfuscatedName("ph.a(Li;II)V")
	public static void method1213(JagString arg0, int arg1) {
		out.method30(40);
		out.method296(arg0.toUserhash());
		out.p1(arg1);
	}

	@ObfuscatedName("kg.a(BI)V")
	public static void method788(int arg0) {
		if (arg0 == -1 && !field2012) {
			MidiManager.method5();
		} else if (arg0 != -1 && (arg0 != Statics.field25 || !MidiManager.method707()) && TitleScreen.field1183 != 0 && !field2012) {
			MidiManager.method730(TitleScreen.field1183, arg0, songs);
		}
		Statics.field25 = arg0;
	}

	@ObfuscatedName("hc.b(ILq;)Z")
	public static boolean method533(IfType arg0) {
		if (arg0.field3516 == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.field3516.length; var1++) {
			int var2 = method761(var1, arg0);
			int var3 = arg0.field3486[var1];
			if (arg0.field3516[var1] == 2) {
				if (var3 <= var2) {
					return false;
				}
			} else if (arg0.field3516[var1] == 3) {
				if (var2 <= var3) {
					return false;
				}
			} else if (arg0.field3516[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var2 != var3) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ki.a(Li;BILi;ILi;)V")
	public static void method801(JagString arg0, int arg1, JagString arg2, int arg3, JagString arg4) {
		for (int var5 = 99; var5 > 0; var5--) {
			field3708[var5] = field3708[var5 - 1];
			field2206[var5] = field2206[var5 - 1];
			field4019[var5] = field4019[var5 - 1];
			field4280[var5] = field4280[var5 - 1];
			field2483[var5] = field2483[var5 - 1];
		}
		field582++;
		field2206[0] = arg2;
		field4019[0] = arg0;
		field3708[0] = arg3;
		field2483[0] = arg1;
		field4280[0] = arg4;
		field100 = field1211;
	}

	@ObfuscatedName("ki.a(IIIIIILq;I)V")
	public static void method805(int arg0, int arg1, int arg2, int arg3, int arg4, IfType arg5, int arg6) {
		if (field9) {
			field2332 = 32;
		} else {
			field2332 = 0;
		}
		field9 = false;
		if (ClientMouseListener.field3016 != 0) {
			if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 <= arg4 && arg4 < arg6 + 16) {
				arg5.field3415 -= 4;
				method1371(arg5);
			} else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg4 >= arg6 + arg3 - 16 && arg6 + arg3 > arg4) {
				arg5.field3415 += 4;
				method1371(arg5);
			} else if (arg2 >= arg0 - field2332 && arg2 < field2332 + arg0 + 16 && arg6 + 16 <= arg4 && arg4 < arg6 + arg3 - 16) {
				int var7 = arg3 * (arg3 - 32) / arg1;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg3 - var7 - 32;
				int var9 = arg4 - var7 / 2 - arg6 - 16;
				arg5.field3415 = var9 * (arg1 - arg3) / var8;
				method1371(arg5);
				field9 = true;
			}
		}
		if (field1708 != 0) {
			int var10 = arg5.field3380;
			if (arg2 >= arg0 - var10 && arg6 <= arg4 && arg2 < arg0 + 16 && arg4 <= arg6 + arg3) {
				arg5.field3415 += field1708 * 45;
				method1371(arg5);
			}
		}
	}

	@ObfuscatedName("la.a(Lq;IIBI)V")
	public static void minimapDraw(IfType arg0, int arg1, int arg2, int arg3) {
		doAudio();
		Pix2D.setClipping(arg2, arg3, arg2 + arg0.field3380, arg0.field3422 + arg3);
		if (minimapState == 2 || minimapState == 5) {
			Pix2D.method491(arg2, arg3, arg0.field3402, arg0.field3421);
		} else {
			int var4 = field943 + field3930 & 0x7FF;
			int var5 = 464 - localPlayer.field4121 / 32;
			int var6 = localPlayer.field4136 / 32 + 48;
			((SoftwarePix32) Statics.field2010).method1176(arg2, arg3, arg0.field3380, arg0.field3422, var6, var5, var4, Statics.field1185 + 256, arg0.field3402, arg0.field3421);
			for (int var7 = 0; var7 < Statics.field930; var7++) {
				int var8 = Statics.field2577[var7] * 4 + 2 - localPlayer.field4136 / 32;
				int var9 = Statics.field2501[var7] * 4 + 2 - localPlayer.field4121 / 32;
				LocType var10 = LocType.list(Statics.field2745[var7]);
				if (var10.field2770 != null) {
					var10 = var10.method998();
					if (var10 == null || var10.field2817 == -1) {
						continue;
					}
				}
				method418(arg3, arg2, var9, arg0, field4525[var10.field2817], var8);
			}
			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LinkList var13 = field2497[field2907][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - localPlayer.field4136 / 32;
						int var15 = var12 * 4 + 2 - localPlayer.field4121 / 32;
						method418(arg3, arg2, var15, arg0, field597[0], var14);
					}
				}
			}
			for (int var16 = 0; var16 < Statics.field1041; var16++) {
				ClientNpc var17 = field4223[Statics.field402[var16]];
				if (var17 != null && var17.method287()) {
					NpcType var18 = var17.field3682;
					if (var18 != null && var18.field2327 != null) {
						var18 = var18.method862();
					}
					if (var18 != null && var18.field2357 && var18.field2359) {
						int var19 = var17.field4121 / 32 - localPlayer.field4121 / 32;
						int var20 = var17.field4136 / 32 - localPlayer.field4136 / 32;
						method418(arg3, arg2, var19, arg0, field597[1], var20);
					}
				}
			}
			for (int var21 = 0; var21 < field1027; var21++) {
				ClientPlayer var22 = field4491[field3428[var21]];
				if (var22 != null && var22.method287()) {
					int var23 = var22.field4136 / 32 - localPlayer.field4136 / 32;
					int var24 = var22.field4121 / 32 - localPlayer.field4121 / 32;
					boolean var25 = false;
					long var26 = var22.field766.toUserhash();
					for (int var28 = 0; var28 < field2729; var28++) {
						if (var26 == field2086[var28] && Statics.field3092[var28] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var29 = false;
					if (localPlayer.field752 != 0 && var22.field752 != 0 && localPlayer.field752 == var22.field752) {
						var29 = true;
					}
					if (var25) {
						method418(arg3, arg2, var24, arg0, field597[3], var23);
					} else if (var29) {
						method418(arg3, arg2, var24, arg0, field597[4], var23);
					} else {
						method418(arg3, arg2, var24, arg0, field597[2], var23);
					}
				}
			}
			HintArrow[] var30 = Statics.field1171;
			for (int var31 = 0; var31 < var30.length; var31++) {
				HintArrow var32 = var30[var31];
				if (var32 != null && var32.field2139 != 0 && field2113 % 20 < 10) {
					if (var32.field2139 == 1 && var32.field2146 >= 0 && var32.field2146 < field4223.length) {
						ClientNpc var33 = field4223[var32.field2146];
						if (var33 != null) {
							int var34 = var33.field4136 / 32 - localPlayer.field4136 / 32;
							int var35 = var33.field4121 / 32 - localPlayer.field4121 / 32;
							method1588(arg0, var34, arg3, var35, var32.field2137, arg2);
						}
					}
					if (var32.field2139 == 2) {
						int var36 = (var32.field2138 + -field4212) * 4 + 2 - localPlayer.field4136 / 32;
						int var37 = (var32.field2135 - field3679) * 4 + 2 - localPlayer.field4121 / 32;
						method1588(arg0, var36, arg3, var37, var32.field2137, arg2);
					}
					if (var32.field2139 == 10 && var32.field2146 >= 0 && var32.field2146 < field4491.length) {
						ClientPlayer var38 = field4491[var32.field2146];
						if (var38 != null) {
							int var39 = var38.field4136 / 32 - localPlayer.field4136 / 32;
							int var40 = var38.field4121 / 32 - localPlayer.field4121 / 32;
							method1588(arg0, var39, arg3, var40, var32.field2137, arg2);
						}
					}
				}
			}
			if (field2102 != 0) {
				int var41 = field2594 * 4 + 2 - localPlayer.field4121 / 32;
				int var42 = field2102 * 4 + 2 - localPlayer.field4136 / 32;
				method418(arg3, arg2, var41, arg0, field3826, var42);
			}
			Pix2D.method478(arg0.field3380 / 2 + arg2 - 1, arg3 - -(arg0.field3422 / 2) + -1, 3, 3, 16777215);
		}
		field4005[arg1] = true;
	}

	@ObfuscatedName("li.a(IIIII)V")
	public static void method874(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < field3923; var4++) {
			if (field2485[var4] + field1455[var4] > arg0 && field1455[var4] < arg2 + arg0 && field2471[var4] + field1447[var4] > arg3 && arg1 + arg3 > field2471[var4]) {
				field4005[var4] = true;
			}
		}
	}

	@ObfuscatedName("w.a(IIII)I")
	public static int method1584(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg0 >> 7;
		if (var4 < 0 || var3 < 0 || var4 > 103 || var3 > 103) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2;
		int var7 = arg0 & 0x7F;
		if (arg2 < 3 && (ClientBuild.field2098[1][var4][var3] & 0x2) == 2) {
			var6 = arg2 + 1;
		}
		int var8 = ClientBuild.field1137[var6][var4 + 1][var3] * var7 + (128 - var7) * ClientBuild.field1137[var6][var4][var3] >> 7;
		int var9 = ClientBuild.field1137[var6][var4 + 1][var3 + 1] * var7 + ClientBuild.field1137[var6][var4][var3 + 1] * (128 - var7) >> 7;
		return var5 * var9 + (128 - var5) * var8 >> 7;
	}

	@ObfuscatedName("w.a(B)V")
	public static void method1577() {
		int var0 = Statics.field2512 * 128 + 64;
		int var1 = ClientMouseListener.field3327 * 128 + 64;
		int var2 = method1584(var0, var1, field2907) - Statics.field1264;
		if (field1428 < var0) {
			field1428 += Statics.field3093 * (var0 - field1428) / 1000 + Statics.field4506;
			if (var0 < field1428) {
				field1428 = var0;
			}
		}
		if (var1 > field3608) {
			field3608 += (var1 - field3608) * Statics.field3093 / 1000 + Statics.field4506;
			if (var1 < field3608) {
				field3608 = var1;
			}
		}
		if (var0 < field1428) {
			field1428 -= (field1428 - var0) * Statics.field3093 / 1000 + Statics.field4506;
			if (var0 > field1428) {
				field1428 = var0;
			}
		}
		int var3 = Statics.field848 * 128 + 64;
		if (field3608 > var1) {
			field3608 -= Statics.field4506 + Statics.field3093 * (field3608 - var1) / 1000;
			if (field3608 < var1) {
				field3608 = var1;
			}
		}
		if (field1954 < var2) {
			field1954 += Statics.field3093 * (var2 - field1954) / 1000 + Statics.field4506;
			if (field1954 > var2) {
				field1954 = var2;
			}
		}
		int var4 = TextureOp.field368 * 128 + 64;
		if (var2 < field1954) {
			field1954 -= Statics.field4506 + (field1954 - var2) * Statics.field3093 / 1000;
			if (field1954 < var2) {
				field1954 = var2;
			}
		}
		int var5 = method1584(var3, var4, field2907) - Statics.field1200;
		int var6 = var3 - field1428;
		int var7 = var5 - field1954;
		int var8 = var4 - field3608;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
		if (var10 < 128) {
			var10 = 128;
		}
		int var12 = var11 - field3257;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var10 > 383) {
			var10 = 383;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (field3934 < var10) {
			field3934 += (var10 - field3934) * Statics.field2742 / 1000 + Statics.field130;
			if (field3934 > var10) {
				field3934 = var10;
			}
		}
		if (var12 > 0) {
			field3257 += Statics.field2742 * var12 / 1000 + Statics.field130;
			field3257 &= 0x7FF;
		}
		if (var12 < 0) {
			field3257 -= Statics.field130 + Statics.field2742 * -var12 / 1000;
			field3257 &= 0x7FF;
		}
		if (field3934 > var10) {
			field3934 -= (field3934 - var10) * Statics.field2742 / 1000 + Statics.field130;
			if (field3934 < var10) {
				field3934 = var10;
			}
		}
		int var13 = var11 - field3257;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			field3257 = var11;
		}
	}

	@ObfuscatedName("h.a(ILu;I)V")
	public static void method514(int arg0, ClientEntity arg1) {
		if (arg1.field4133 > field2113) {
			method756(arg1);
		} else if (arg1.field4130 < field2113) {
			method1600(arg1);
		} else {
			method1444(arg1);
		}
		if (arg1.field4136 < 128 || arg1.field4121 < 128 || arg1.field4136 >= 13184 || arg1.field4121 >= 13184) {
			arg1.field4121 = arg1.field4103 * 64 + arg1.field4141[0] * 128;
			arg1.field4136 = arg1.field4087[0] * 128 + arg1.field4103 * 64;
			arg1.field4130 = 0;
			arg1.field4080 = -1;
			arg1.field4133 = 0;
			arg1.field4077 = -1;
			arg1.method1478();
		}
		if (arg1 == localPlayer && (arg1.field4136 < 1536 || arg1.field4121 < 1536 || arg1.field4136 >= 11776 || arg1.field4121 >= 11776)) {
			arg1.field4080 = -1;
			arg1.field4130 = 0;
			arg1.field4133 = 0;
			arg1.field4121 = arg1.field4103 * 64 + arg1.field4141[0] * 128;
			arg1.field4077 = -1;
			arg1.field4136 = arg1.field4103 * 64 + arg1.field4087[0] * 128;
			arg1.method1478();
		}
		method86(arg1);
		method721(arg1);
	}

	@ObfuscatedName("k.a(IIILq;B)V")
	public static void method743(int arg0, int arg1, int arg2, IfType arg3) {
		if (minimapState < 3) {
			((SoftwarePix32) field887).method1163(arg1, arg2, arg3.field3380, arg3.field3422, field887.field3654 / 2, field887.field3652 / 2, field3930, arg3.field3402, arg3.field3421);
		} else {
			Pix2D.method491(arg1, arg2, arg3.field3402, arg3.field3421);
		}
		field4005[arg0] = true;
	}

	@ObfuscatedName("cf.a(III)V")
	public static void method175(int arg0, int arg1) {
		LinkList var2 = field2497[field2907][arg0][arg1];
		if (var2 == null) {
			Statics.method168(field2907, arg0, arg1);
			return;
		}
		int var3 = -99999999;
		ClientObjNode var4 = null;
		for (ClientObjNode var5 = (ClientObjNode) var2.head(); var5 != null; var5 = (ClientObjNode) var2.method1619()) {
			ObjType var6 = ObjType.list(var5.field4258.field2030);
			int var7 = var6.field2854;
			if (var6.field2852 == 1) {
				var7 *= var5.field4258.field2029 + 1;
			}
			if (var7 > var3) {
				var4 = var5;
				var3 = var7;
			}
		}
		if (var4 == null) {
			Statics.method168(field2907, arg0, arg1);
			return;
		}
		ClientObj var8 = null;
		var2.method1615(var4);
		ClientObj var9 = null;
		for (ClientObjNode var10 = (ClientObjNode) var2.head(); var10 != null; var10 = (ClientObjNode) var2.method1619()) {
			ClientObj var11 = var10.field4258;
			if (var4.field4258.field2030 != var11.field2030) {
				if (var8 == null) {
					var8 = var11;
				}
				if (var11.field2030 != var8.field2030 && var9 == null) {
					var9 = var11;
				}
			}
		}
		long var12 = (long) (arg0 + (arg1 << 7) + 1610612736);
		World.method675(field2907, arg0, arg1, method1584(arg0 * 128 + 64, arg1 * 128 - -64, field2907), var4.field4258, var12, var8, var9);
	}

	@ObfuscatedName("qf.c(Z)V")
	public static void method1283() {
		int var0 = localPlayer.field4121 + field536;
		if (ClientKeyboardListener.field4511[96]) {
			field1531 += (-field1531 - 24) / 2;
		} else if (ClientKeyboardListener.field4511[97]) {
			field1531 += (24 - field1531) / 2;
		} else {
			field1531 /= 2;
		}
		if (ClientKeyboardListener.field4511[98]) {
			field1022 += (12 - field1022) / 2;
		} else if (ClientKeyboardListener.field4511[99]) {
			field1022 += (-field1022 - 12) / 2;
		} else {
			field1022 /= 2;
		}
		int var1 = localPlayer.field4136 + field4199;
		if (field666 - var1 < -500 || field666 - var1 > 500 || field4366 - var0 < -500 || field4366 - var0 > 500) {
			field666 = var1;
			field4366 = var0;
		}
		if (var1 != field666) {
			field666 += (var1 - field666) / 16;
		}
		field3930 += field1531 / 2;
		field1173 += field1022 / 2;
		if (field4366 != var0) {
			field4366 += (var0 - field4366) / 16;
		}
		method905();
	}

	@ObfuscatedName("pa.a(ZB)V")
	public static void method1128(boolean arg0) {
		if (localPlayer.field4136 >> 7 == field2102 && field2594 == localPlayer.field4121 >> 7) {
			field2102 = 0;
		}
		int var1 = field1027;
		if (arg0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			ClientPlayer var3;
			long var4;
			if (arg0) {
				var4 = 8791798054912L;
				var3 = localPlayer;
			} else {
				var3 = field4491[field3428[var2]];
				var4 = (long) field3428[var2] << 32;
			}
			if (var3 != null && var3.method287()) {
				int var6 = var3.field4136 >> 7;
				var3.field743 = false;
				if ((lowMem && field1027 > 50 || field1027 > 200) && !arg0 && var3.field4105 == var3.field4106) {
					var3.field743 = true;
				}
				int var7 = var3.field4121 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var3.field758 == null || field2113 < var3.field755 || field2113 >= var3.field762) {
						if ((var3.field4136 & 0x7F) == 64 && (var3.field4121 & 0x7F) == 64) {
							if (Statics.field3990 == Statics.field2948[var6][var7]) {
								continue;
							}
							Statics.field2948[var6][var7] = Statics.field3990;
						}
						var3.field4097 = method1584(var3.field4136, var3.field4121, field2907);
						World.method859(field2907, var3.field4136, var3.field4121, var3.field4097, 60, var3, var3.field4085, var4, var3.field4093);
					} else {
						var3.field743 = false;
						var3.field4097 = method1584(var3.field4136, var3.field4121, field2907);
						World.method855(field2907, var3.field4136, var3.field4121, var3.field4097, var3, var3.field4085, var4, var3.field764, var3.field741, var3.field744, var3.field745);
					}
				}
			}
		}
	}

	@ObfuscatedName("of.a(II)V")
	public static void method1068(int arg0) {
		method867();
		BgSound.method44();
		int var1 = VarpType.method732(arg0).field4288;
		if (var1 == 0) {
			return;
		}
		int var2 = VarCache.field2050[arg0];
		if (var1 == 1) {
			field3528 = var2;
			if (field3528 == 1) {
				Pix3D.method1224(0.9F);
			}
			if (field3528 == 2) {
				Pix3D.method1224(0.8F);
			}
			if (field3528 == 3) {
				Pix3D.method1224(0.7F);
			}
			if (field3528 == 4) {
				Pix3D.method1224(0.6F);
			}
			ObjType.method1399();
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
			if (TitleScreen.field1183 != var3) {
				if (TitleScreen.field1183 == 0 && Statics.field25 != -1) {
					MidiManager.method388(songs, Statics.field25, var3);
					field2012 = false;
				} else if (var3 == 0) {
					MidiManager.method5();
					field2012 = false;
				} else {
					MidiManager.method712(var3);
				}
				TitleScreen.field1183 = var3;
			}
		}
		if (var1 == 6) {
			field2548 = var2;
		}
		if (var1 == 9) {
			field2991 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				field2172 = 127;
			}
			if (var2 == 1) {
				field2172 = 96;
			}
			if (var2 == 2) {
				field2172 = 64;
			}
			if (var2 == 3) {
				field2172 = 32;
			}
			if (var2 == 4) {
				field2172 = 0;
			}
		}
		if (var1 == 10) {
			if (var2 == 0) {
				field4211 = 127;
			}
			if (var2 == 1) {
				field4211 = 96;
			}
			if (var2 == 2) {
				field4211 = 64;
			}
			if (var2 == 3) {
				field4211 = 32;
			}
			if (var2 == 4) {
				field4211 = 0;
			}
		}
		if (var1 == 5) {
			field3859 = var2;
		}
	}

	@ObfuscatedName("ih.a(Z)V")
	public static void method676() {
		while (true) {
			if (in.method31(psize) >= 11) {
				int var0 = in.method28(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (field4491[var0] == null) {
						var1 = true;
						field4491[var0] = new ClientPlayer();
						if (field1397[var0] != null) {
							field4491[var0].method285(field1397[var0]);
						}
					}
					field3428[field1027++] = var0;
					ClientPlayer var2 = field4491[var0];
					var2.field4081 = field2113;
					int var3 = field75[in.method28(3)];
					if (var1) {
						var2.field4119 = var2.field4085 = var3;
					}
					int var4 = in.method28(1);
					if (var4 == 1) {
						field2579[field3702++] = var0;
					}
					int var5 = in.method28(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = in.method28(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = in.method28(1);
					var2.method1474(var7 == 1, localPlayer.field4087[0] + var6, localPlayer.field4141[0] - -var5);
					continue;
				}
			}
			in.method35();
			return;
		}
	}

	@ObfuscatedName("jc.a(Li;B)V")
	public static void method701(JagString arg0) {
		if (field1647 == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.toUserhash();
		if (var2 == 0L) {
			return;
		}
		while (var1 < field1647.length && var2 != field1647[var1].key) {
			var1++;
		}
		if (field1647.length > var1 && field1647[var1] != null) {
			out.method30(49);
			out.p8(field1647[var1].key);
		}
	}

	@ObfuscatedName("na.a(IIIIII[Lq;II)V")
	public static void method933(int arg0, int arg1, int arg2, int arg3, int arg4, IfType[] arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg5.length; var8++) {
			IfType var9 = arg5[var8];
			if (var9 != null && (!var9.field3410 || var9.field3390 == 0 || var9.field3449 || Statics.method530(var9) != 0 || field923 == var9 || var9.field3439 == 1338) && arg3 == var9.field3504 && (!var9.field3410 || !Statics.method475(var9))) {
				int var10 = arg2 + var9.field3366;
				int var11 = arg7 + var9.field3441;
				int var12;
				int var15;
				int var16;
				int var17;
				if (var9.field3390 == 2) {
					var16 = arg4;
					var17 = arg1;
					var12 = arg0;
					var15 = arg6;
				} else {
					var12 = arg0 >= var11 ? arg0 : var11;
					int var13 = var11 + var9.field3422;
					int var14 = var9.field3380 + var10;
					var15 = arg6 >= var10 ? arg6 : var10;
					if (var9.field3390 == 9) {
						var13++;
						var14++;
					}
					var16 = arg4 <= var13 ? arg4 : var13;
					var17 = var14 < arg1 ? var14 : arg1;
				}
				if (field3568 == var9) {
					field208 = var10;
					field2905 = true;
					field2506 = var11;
				}
				if (!var9.field3410 || var15 < var17 && var12 < var16) {
					if (var9.field3390 == 0) {
						if (!var9.field3410 && Statics.method475(var9) && Statics.field1177 != var9) {
							continue;
						}
						if (var9.field3470 && var15 <= ClientMouseListener.field471 && ClientMouseListener.field4449 >= var12 && var17 > ClientMouseListener.field471 && ClientMouseListener.field4449 < var16) {
							for (HookReq var18 = (HookReq) Statics.field1349.head(); var18 != null; var18 = (HookReq) Statics.field1349.method1619()) {
								if (var18.field686) {
									var18.unlink();
								}
							}
							for (HookReq var19 = (HookReq) Statics.field3810.head(); var19 != null; var19 = (HookReq) Statics.field3810.method1619()) {
								if (var19.field686) {
									var19.unlink();
								}
							}
							if (field4256 == 0) {
								field3568 = null;
								field923 = null;
							}
							Statics.field3532 = false;
						}
					}
					if (var9.field3410) {
						boolean var20 = false;
						boolean var21 = false;
						boolean var22;
						if (ClientMouseListener.field471 >= var15 && var12 <= ClientMouseListener.field4449 && var17 > ClientMouseListener.field471 && var16 > ClientMouseListener.field4449) {
							var22 = true;
						} else {
							var22 = false;
						}
						if (ClientMouseListener.field625 == 1 && var15 <= ClientMouseListener.field4239 && ClientMouseListener.field3339 >= var12 && ClientMouseListener.field4239 < var17 && var16 > ClientMouseListener.field3339) {
							var21 = true;
						}
						if (ClientMouseListener.field3016 == 1 && var22) {
							var20 = true;
						}
						if (Statics.field1467 > 0 && var9.field3493 != null) {
							for (int var23 = 0; var23 < var9.field3493.length; var23++) {
								for (int var24 = 0; var24 < Statics.field1467; var24++) {
									int var25 = var9.field3493[var23] & 0xFF;
									if (Statics.field4479[var24] == var25) {
										method1390(var23 + 1, field3453, -1, var9.parentId);
									}
								}
							}
						}
						if (var21) {
							method532(ClientMouseListener.field4239 - var10, ClientMouseListener.field3339 + -var11, var9);
						}
						if (field3568 != null && var9 != field3568 && var22 && ServerActive.method423(Statics.method530(var9))) {
							field2217 = var9;
						}
						if (var9 == field923) {
							field487 = true;
							field466 = var11;
							field2371 = var10;
						}
						if (var9.field3449 || var9.field3439 != 0) {
							if (var22 && field1708 != 0 && var9.field3471 != null) {
								HookReq var26 = new HookReq();
								var26.field686 = true;
								var26.field681 = var9.field3471;
								var26.field678 = var9;
								var26.field691 = field1708;
								Statics.field1349.push(var26);
							}
							if (field3568 != null || Statics.field2514 != null || field1958 || var9.field3439 != 1400 && Statics.field3532) {
								var22 = false;
								var21 = false;
								var20 = false;
							}
							if (var9.field3439 == 1337) {
								method1371(var9);
								continue;
							}
							if (var9.field3439 == 1338) {
								if (var21) {
									method16(ClientMouseListener.field4239 - var10, -var11 + ClientMouseListener.field3339, var9);
								}
								continue;
							}
							if (var9.field3439 == 1400) {
								Statics.field1706 = var9;
								if (var21) {
									if (ClientKeyboardListener.field4511[82] && staffmodlevel > 0) {
										int var27 = ClientBuild.field760 + ClientBuild.field2181 - Statics.field3033 - (int) ((double) (-(var9.field3422 / 2) + -var11 + ClientMouseListener.field3339) * 2.0D / Statics.field1110);
										int var28 = Statics.field2330 + (int) ((double) (ClientMouseListener.field4239 - var9.field3380 / 2 - var10) * 2.0D / Statics.field1110) + ClientBuild.field239;
										JagString var29 = JagString.join(new JagString[] {Statics.field4009, JagString.method1212(var28 >> 6), Statics.field979, JagString.method1212(var27 >> 6), Statics.field979, JagString.method1212(var28 & 0x3F), Statics.field979, JagString.method1212(var27 & 0x3F) });
										var29.method610();
										method682(var29);
										method174();
										continue;
									}
									field2791 = ClientMouseListener.field471;
									Statics.field1801 = Statics.field3033;
									field3941 = ClientMouseListener.field4449;
									Statics.field3532 = true;
									EnumType.field890 = Statics.field2330;
									continue;
								}
								if (var20 && Statics.field3532) {
									Statics.method1551(EnumType.field890 + (int) ((double) (field2791 - ClientMouseListener.field471) * 2.0D / Statics.field2915));
									Statics.method1221((int) ((double) (field3941 - ClientMouseListener.field4449) * 2.0D / Statics.field2915) + Statics.field1801);
									continue;
								}
								Statics.field3532 = false;
								continue;
							}
							if (var9.field3439 == 1401) {
								if (var20) {
									BZip2State.method1137(var9.field3380, ClientMouseListener.field4449 - var11, ClientMouseListener.field471 - var10, var9.field3422);
								}
								continue;
							}
							if (!var9.field3478 && var21) {
								var9.field3478 = true;
								if (var9.field3490 != null) {
									HookReq var30 = new HookReq();
									var30.field691 = ClientMouseListener.field3339 - var11;
									var30.field681 = var9.field3490;
									var30.field678 = var9;
									var30.field686 = true;
									var30.field694 = ClientMouseListener.field4239 - var10;
									Statics.field1349.push(var30);
								}
							}
							if (var9.field3478 && var20 && var9.field3452 != null) {
								HookReq var31 = new HookReq();
								var31.field686 = true;
								var31.field681 = var9.field3452;
								var31.field678 = var9;
								var31.field694 = ClientMouseListener.field471 - var10;
								var31.field691 = ClientMouseListener.field4449 - var11;
								Statics.field1349.push(var31);
							}
							if (var9.field3478 && !var20) {
								var9.field3478 = false;
								if (var9.field3408 != null) {
									HookReq var32 = new HookReq();
									var32.field678 = var9;
									var32.field691 = ClientMouseListener.field4449 - var11;
									var32.field681 = var9.field3408;
									var32.field694 = ClientMouseListener.field471 - var10;
									var32.field686 = true;
									Statics.field3810.push(var32);
								}
							}
							if (var20 && var9.field3503 != null) {
								HookReq var33 = new HookReq();
								var33.field681 = var9.field3503;
								var33.field686 = true;
								var33.field691 = ClientMouseListener.field4449 - var11;
								var33.field678 = var9;
								var33.field694 = ClientMouseListener.field471 - var10;
								Statics.field1349.push(var33);
							}
							if (!var9.field3467 && var22) {
								var9.field3467 = true;
								if (var9.field3370 != null) {
									HookReq var34 = new HookReq();
									var34.field694 = ClientMouseListener.field471 - var10;
									var34.field691 = ClientMouseListener.field4449 - var11;
									var34.field686 = true;
									var34.field678 = var9;
									var34.field681 = var9.field3370;
									Statics.field1349.push(var34);
								}
							}
							if (var9.field3467 && var22 && var9.field3510 != null) {
								HookReq var35 = new HookReq();
								var35.field678 = var9;
								var35.field691 = ClientMouseListener.field4449 - var11;
								var35.field681 = var9.field3510;
								var35.field694 = ClientMouseListener.field471 - var10;
								var35.field686 = true;
								Statics.field1349.push(var35);
							}
							if (var9.field3467 && !var22) {
								var9.field3467 = false;
								if (var9.field3448 != null) {
									HookReq var36 = new HookReq();
									var36.field681 = var9.field3448;
									var36.field678 = var9;
									var36.field686 = true;
									var36.field694 = ClientMouseListener.field471 - var10;
									var36.field691 = ClientMouseListener.field4449 - var11;
									Statics.field3810.push(var36);
								}
							}
							if (var9.field3458 != null) {
								HookReq var37 = new HookReq();
								var37.field678 = var9;
								var37.field681 = var9.field3458;
								Statics.field619.push(var37);
							}
							if (var9.field3481 != null && Statics.field4244 > var9.field3372) {
								if (var9.field3450 == null || Statics.field4244 - var9.field3372 > 32) {
									HookReq var42 = new HookReq();
									var42.field678 = var9;
									var42.field681 = var9.field3481;
									Statics.field1349.push(var42);
								} else {
									label439: for (int var38 = var9.field3372; var38 < Statics.field4244; var38++) {
										int var39 = Statics.field4495[var38 & 0x1F];
										for (int var40 = 0; var40 < var9.field3450.length; var40++) {
											if (var9.field3450[var40] == var39) {
												HookReq var41 = new HookReq();
												var41.field681 = var9.field3481;
												var41.field678 = var9;
												Statics.field1349.push(var41);
												break label439;
											}
										}
									}
								}
								var9.field3372 = Statics.field4244;
							}
							if (var9.field3443 != null && Statics.field4198 > var9.field3407) {
								if (var9.field3369 == null || Statics.field4198 - var9.field3407 > 32) {
									HookReq var47 = new HookReq();
									var47.field681 = var9.field3443;
									var47.field678 = var9;
									Statics.field1349.push(var47);
								} else {
									label415: for (int var43 = var9.field3407; var43 < Statics.field4198; var43++) {
										int var44 = Statics.field4328[var43 & 0x1F];
										for (int var45 = 0; var45 < var9.field3369.length; var45++) {
											if (var44 == var9.field3369[var45]) {
												HookReq var46 = new HookReq();
												var46.field681 = var9.field3443;
												var46.field678 = var9;
												Statics.field1349.push(var46);
												break label415;
											}
										}
									}
								}
								var9.field3407 = Statics.field4198;
							}
							if (var9.field3454 != null && var9.field3499 < Statics.field2131) {
								if (var9.field3398 == null || Statics.field2131 - var9.field3499 > 32) {
									HookReq var48 = new HookReq();
									var48.field681 = var9.field3454;
									var48.field678 = var9;
									Statics.field1349.push(var48);
								} else {
									label391: for (int var49 = var9.field3499; var49 < Statics.field2131; var49++) {
										int var50 = Statics.field2642[var49 & 0x1F];
										for (int var51 = 0; var51 < var9.field3398.length; var51++) {
											if (var9.field3398[var51] == var50) {
												HookReq var52 = new HookReq();
												var52.field678 = var9;
												var52.field681 = var9.field3454;
												Statics.field1349.push(var52);
												break label391;
											}
										}
									}
								}
								var9.field3499 = Statics.field2131;
							}
							if (var9.field3462 < field100 && var9.field3518 != null) {
								HookReq var53 = new HookReq();
								var53.field678 = var9;
								var53.field681 = var9.field3518;
								Statics.field1349.push(var53);
							}
							if (var9.field3462 < field313 && var9.field3484 != null) {
								HookReq var54 = new HookReq();
								var54.field678 = var9;
								var54.field681 = var9.field3484;
								Statics.field1349.push(var54);
							}
							if (var9.field3462 < Statics.field1394 && var9.field3381 != null) {
								HookReq var55 = new HookReq();
								var55.field678 = var9;
								var55.field681 = var9.field3381;
								Statics.field1349.push(var55);
							}
							if (field2127 > var9.field3462 && var9.field3505 != null) {
								HookReq var56 = new HookReq();
								var56.field678 = var9;
								var56.field681 = var9.field3505;
								Statics.field1349.push(var56);
							}
							if (var9.field3462 < Statics.field3952 && var9.field3444 != null) {
								HookReq var57 = new HookReq();
								var57.field678 = var9;
								var57.field681 = var9.field3444;
								Statics.field1349.push(var57);
							}
							var9.field3462 = field1211;
							if (var9.field3377 != null) {
								for (int var58 = 0; var58 < Statics.field1467; var58++) {
									HookReq var59 = new HookReq();
									var59.field678 = var9;
									var59.field682 = Statics.field4479[var58];
									var59.field692 = Statics.field3685[var58];
									var59.field681 = var9.field3377;
									Statics.field1349.push(var59);
								}
							}
						}
					}
					if (!var9.field3410 && field3568 == null && Statics.field2514 == null && !field1958) {
						if ((var9.field3424 >= 0 || var9.field3431 != 0) && var15 <= ClientMouseListener.field471 && ClientMouseListener.field4449 >= var12 && ClientMouseListener.field471 < var17 && var16 > ClientMouseListener.field4449) {
							if (var9.field3424 < 0) {
								Statics.field1177 = var9;
							} else {
								Statics.field1177 = arg5[var9.field3424];
							}
						}
						if (var9.field3390 == 8 && var15 <= ClientMouseListener.field471 && var12 <= ClientMouseListener.field4449 && var17 > ClientMouseListener.field471 && ClientMouseListener.field4449 < var16) {
							Statics.field635 = var9;
						}
						if (var9.field3422 < var9.field3375) {
							method805(var10 + var9.field3380, var9.field3375, ClientMouseListener.field471, var9.field3422, ClientMouseListener.field4449, var9, var11);
						}
					}
					if (var9.field3390 == 0) {
						method933(var12, var17, var10 - var9.field3393, var9.parentId, var16, arg5, var15, var11 - var9.field3415);
						if (var9.field3465 != null) {
							method933(var12, var17, var10 - var9.field3393, var9.parentId, var16, var9.field3465, var15, var11 - var9.field3415);
						}
						SubInterface var60 = (SubInterface) field2395.method1049((long) var9.parentId);
						if (var60 != null) {
							method1533(var11, var16, var12, var15, var17, var60.field3229, var10);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("wb.a(IIIIIIIZIIIII)Z")
	public static boolean method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				field3673[var12][var13] = 0;
				field4267[var12][var13] = 99999999;
			}
		}
		field3673[arg5][arg8] = 99;
		field4267[arg5][arg8] = 0;
		int var14 = arg5;
		int var15 = arg8;
		int var16 = 0;
		boolean var17 = false;
		byte var18 = 0;
		field2203[0] = arg5;
		int var39 = var18 + 1;
		field1781[0] = arg8;
		int[][] var19 = collision[field2907].field1667;
		label367: while (var16 != var39) {
			var15 = field1781[var16];
			var14 = field2203[var16];
			var16 = var16 + 1 & 0xFFF;
			if (var14 == arg1 && arg4 == var15) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && collision[field2907].method640(var15, arg3 - 1, arg1, arg4, arg2, arg6, var14)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && collision[field2907].method648(arg6, var14, arg3 - 1, arg4, arg2, var15, arg1)) {
					var17 = true;
					break;
				}
			}
			if (arg0 != 0 && arg11 != 0 && collision[field2907].method650(arg2, arg4, arg0, var15, arg11, var14, arg1, arg10)) {
				var17 = true;
				break;
			}
			int var20 = field4267[var14][var15] + 1;
			if (var14 > 0 && field3673[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg2 - 1] & 0x12C0138) == 0) {
				int var21 = 1;
				while (true) {
					if (arg2 - 1 <= var21) {
						field2203[var39] = var14 - 1;
						field1781[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14 - 1][var15] = 2;
						field4267[var14 - 1][var15] = var20;
						break;
					}
					if ((var19[var14 - 1][var21 + var15] & 0x12C013E) != 0) {
						break;
					}
					var21++;
				}
			}
			if (var14 < 102 && field3673[var14 + 1][var15] == 0 && (var19[var14 + arg2][var15] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1] & 0x12C01E0) == 0) {
				int var22 = 1;
				while (true) {
					if (var22 >= arg2 - 1) {
						field2203[var39] = var14 + 1;
						field1781[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14 + 1][var15] = 8;
						field4267[var14 + 1][var15] = var20;
						break;
					}
					if ((var19[var14 + arg2][var22 + var15] & 0x12C01E3) != 0) {
						break;
					}
					var22++;
				}
			}
			if (var15 > 0 && field3673[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var23 = 1;
				while (true) {
					if (arg2 - 1 <= var23) {
						field2203[var39] = var14;
						field1781[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14][var15 - 1] = 1;
						field4267[var14][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 + var23][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var23++;
				}
			}
			if (var15 < 102 && field3673[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14 - 1][var15 + arg2] & 0x12C01E0) == 0) {
				int var24 = 1;
				while (true) {
					if (var24 >= arg2 - 1) {
						field2203[var39] = var14;
						field1781[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14][var15 + 1] = 4;
						field4267[var14][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 + var24][arg2 + var15] & 0x12C01F8) != 0) {
						break;
					}
					var24++;
				}
			}
			if (var14 > 0 && var15 > 0 && field3673[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var25 = 1;
				while (true) {
					if (var25 >= arg2 - 1) {
						field2203[var39] = var14 - 1;
						field1781[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14 - 1][var15 - 1] = 3;
						field4267[var14 - 1][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var15 + var25 - 1] & 0x12C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var25++;
				}
			}
			if (var14 < 102 && var15 > 0 && field3673[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 + arg2 - 1 - 1] & 0x12C01E0) == 0) {
				int var26 = 1;
				while (true) {
					if (arg2 - 1 <= var26) {
						field2203[var39] = var14 + 1;
						field1781[var39] = var15 - 1;
						field3673[var14 + 1][var15 - 1] = 9;
						field4267[var14 + 1][var15 - 1] = var20;
						var39 = var39 + 1 & 0xFFF;
						break;
					}
					if ((var19[var14 + arg2][var26 + var15 - 1] & 0x12C01E3) != 0 || (var19[var14 + var26 + 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var26++;
				}
			}
			if (var14 > 0 && var15 < 102 && field3673[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg2] & 0x12C01E0) == 0) {
				int var27 = 1;
				while (true) {
					if (var27 >= arg2 - 1) {
						field2203[var39] = var14 - 1;
						field1781[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						field3673[var14 - 1][var15 + 1] = 6;
						field4267[var14 - 1][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var27 + var15 + 1] & 0x12C013E) != 0 || (var19[var14 + var27 - 1][var15 + arg2] & 0x12C01F8) != 0) {
						break;
					}
					var27++;
				}
			}
			if (var14 < 102 && var15 < 102 && field3673[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[arg2 + var14][var15 + 1] & 0x12C0183) == 0) {
				for (int var28 = 1; var28 < arg2 - 1; var28++) {
					if ((var19[var28 + var14 + 1][var15 + arg2] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var28 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				field2203[var39] = var14 + 1;
				field1781[var39] = var15 + 1;
				var39 = var39 + 1 & 0xFFF;
				field3673[var14 + 1][var15 + 1] = 12;
				field4267[var14 + 1][var15 + 1] = var20;
			}
		}
		field2186 = 0;
		if (!var17) {
			if (!arg7) {
				return false;
			}
			int var29 = 1000;
			int var30 = 100;
			for (int var31 = arg1 - 10; var31 <= arg1 + 10; var31++) {
				for (int var32 = arg4 - 10; var32 <= arg4 + 10; var32++) {
					if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && field4267[var31][var32] < 100) {
						int var33 = 0;
						if (arg1 > var31) {
							var33 = arg1 - var31;
						} else if (arg0 + arg1 - 1 < var31) {
							var33 = var31 + 1 - arg1 - arg0;
						}
						int var34 = 0;
						if (arg4 > var32) {
							var34 = arg4 - var32;
						} else if (var32 > arg11 + arg4 - 1) {
							var34 = var32 + 1 - arg11 - arg4;
						}
						int var35 = var33 * var33 + var34 * var34;
						if (var29 > var35 || var29 == var35 && var30 > field4267[var31][var32]) {
							var14 = var31;
							var29 = var35;
							var30 = field4267[var31][var32];
							var15 = var32;
						}
					}
				}
			}
			if (var29 == 1000) {
				return false;
			}
			if (var14 == arg5 && var15 == arg8) {
				return false;
			}
			field2186 = 1;
		}
		byte var36 = 0;
		field2203[0] = var14;
		int var40 = var36 + 1;
		field1781[0] = var15;
		int var37;
		int var38 = var37 = field3673[var14][var15];
		while (var14 != arg5 || var15 != arg8) {
			if (var38 != var37) {
				var37 = var38;
				field2203[var40] = var14;
				field1781[var40++] = var15;
			}
			if ((var38 & 0x1) != 0) {
				var15++;
			} else if ((var38 & 0x4) != 0) {
				var15--;
			}
			if ((var38 & 0x2) != 0) {
				var14++;
			} else if ((var38 & 0x8) != 0) {
				var14--;
			}
			var38 = field3673[var14][var15];
		}
		if (var40 > 0) {
			method1611(arg9, field2203, field1781, var40);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("wb.a(IIIIII)V")
	public static void method1592(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg1 - 32) * arg1 / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		field106[0].method876(arg4, arg2);
		int var6 = arg0 * (arg1 - var5 - 32) / (arg3 - arg1);
		field106[1].method876(arg4, arg1 + arg2 - 16);
		Pix2D.method478(arg4, arg2 + 16, 16, arg1 - 32, Statics.field4432);
		Pix2D.method478(arg4, var6 + arg2 + 16, 16, var5, Statics.field26);
		Pix2D.method487(arg4, var6 + arg2 + 16, var5, Statics.field4316);
		Pix2D.method487(arg4 + 1, var6 + 16 + arg2, var5, Statics.field4316);
		Pix2D.method489(arg4, arg2 + var6 + 16, 16, Statics.field4316);
		Pix2D.method489(arg4, var6 + arg2 + 17, 16, Statics.field4316);
		Pix2D.method487(arg4 + 15, arg2 + 16 + var6, var5, Statics.field939);
		Pix2D.method487(arg4 + 14, arg2 - -var6 + 17, var5 - 1, Statics.field939);
		Pix2D.method489(arg4, var6 + arg2 + var5 + 15, 16, Statics.field939);
		Pix2D.method489(arg4 + 1, var6 + 14 + arg2 + var5, 15, Statics.field939);
	}

	@ObfuscatedName("nd.a(BI)V")
	public static void method972(int arg0) {
		if (arg0 == -1 || !IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.field3436 != null) {
				HookReq var4 = new HookReq();
				var4.field678 = var3;
				var4.field681 = var3.field3436;
				ScriptRunner.executeScript(var4, 2000000);
			}
		}
	}

	@ObfuscatedName("nd.a(IJ)V")
	public static void method973(long arg0) {
		if (arg0 == (long) 0) {
			return;
		}
		for (int var2 = 0; var2 < field1221; var2++) {
			if (field1764[var2] == arg0) {
				field1221--;
				for (int var3 = var2; var3 < field1221; var3++) {
					field1764[var3] = field1764[var3 + 1];
					field2741[var3] = field2741[var3 + 1];
				}
				field313 = field1211;
				out.method30(126);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("wb.a(Lq;IIIIBI)V")
	public static void method1588(IfType arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg3 * arg3 + arg1 * arg1;
		if (var6 > 360000) {
			return;
		}
		int var7 = Math.min(arg0.field3380 / 2, arg0.field3422 / 2);
		if (var7 * var7 >= var6) {
			method418(arg2, arg5, arg3, arg0, field4257[arg4], arg1);
			return;
		}
		var7 -= 10;
		int var8 = field943 + field3930 & 0x7FF;
		int var9 = Pix3D.field3354[var8];
		int var10 = var9 * 256 / (Statics.field1185 + 256);
		int var11 = Pix3D.field3359[var8];
		int var12 = var11 * 256 / (Statics.field1185 + 256);
		int var13 = var10 * arg3 - arg1 * var12 >> 16;
		int var14 = arg3 * var12 + arg1 * var10 >> 16;
		double var15 = Math.atan2((double) var14, (double) var13);
		int var17 = (int) ((double) var7 * Math.sin(var15));
		int var18 = (int) (Math.cos(var15) * (double) var7);
		((SoftwarePix32) field2041[arg4]).method1170(arg5 + arg0.field3380 / 2 + var17 - 10, arg0.field3422 / 2 + -10 + arg2 - var18, var15);
	}

	@ObfuscatedName("rg.a(IZ)V")
	public static void method1334() {
		method1449(sWid, field723, sHei, false);
	}

	@ObfuscatedName("va.a(IIIIIIII)V")
	public static void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (IfType.openInterface(arg5)) {
			method933(arg2, arg4, arg6, -1, arg1, IfType.list[arg5], arg3, arg0);
		}
	}

	@ObfuscatedName("sd.a(ILq;)V")
	public static void method1371(IfType arg0) {
		if (field2018 == arg0.field3371) {
			field4228[arg0.field3382] = true;
		}
	}

	@ObfuscatedName("jf.a(BIIII)V")
	public static void method719(int arg0, int arg1, int arg2, int arg3) {
		if (Statics.field4276 < 100) {
			Statics.method1319();
		}
		Pix2D.setClipping(arg2, arg3, arg0 + arg2, arg1 + arg3);
		if (Statics.field4276 < 100) {
			int var4 = arg0 / 2 + arg2;
			int var5 = arg1 / 2 + arg3 - 38;
			Pix2D.method478(arg2, arg3, arg0, arg1, 0);
			Pix2D.method476(var4 - 152, var5, 304, 34, 9179409);
			Pix2D.method476(var4 - 151, var5 + 1, 302, 32, 0);
			Pix2D.method478(var4 - 150, var5 + 2, Statics.field4276 * 3, 30, 9179409);
			Pix2D.method478(var4 + Statics.field4276 * 3 - 150, var5 - -2, 300 - Statics.field4276 * 3, 30, 0);
			field1011.method141(Text.field3763, var4, var5 + 20, 16777215, -1);
			return;
		}
		Statics.field693 = Statics.field2330 - (int) ((double) arg0 / Statics.field1110);
		int var6 = Statics.field2330 - (int) ((double) arg0 / Statics.field1110);
		Statics.field727 = Statics.field3033 - (int) ((double) arg1 / Statics.field1110);
		Statics.field3136 = (int) ((double) (arg1 * 2) / Statics.field1110);
		int var7 = Statics.field3033 - (int) ((double) arg1 / Statics.field1110);
		Statics.field1309 = (int) ((double) (arg0 * 2) / Statics.field1110);
		int var8 = (int) ((double) arg0 / Statics.field1110) + Statics.field2330;
		int var9 = (int) ((double) arg1 / Statics.field1110) + Statics.field3033;
		Statics.method348(arg1 + arg3, arg2 - -arg0, arg2, arg3, var9, var6, var8, var7);
		Statics.method1500(arg3, arg2, arg2 + arg0, arg1 + arg3, var7, var8, var6, var9);
		if (Statics.field1012 > 0) {
			Statics.field1012--;
		}
		if (!field2768) {
			return;
		}
		int var10 = arg2 + arg0 - 5;
		int var11 = arg1 + arg3 - 8;
		field30.method150(JagString.join(new JagString[] { Statics.field993, JagString.method1212(Statics.field192) }), var10, var11, 16776960, -1);
		int var15 = var11 - 15;
		Runtime var12 = Runtime.getRuntime();
		int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
		int var14 = 16776960;
		if (var13 > 65536) {
			var14 = 16711680;
		}
		field30.method150(JagString.join(new JagString[] { Statics.field1325, JagString.method1212(var13), Statics.field1385 }), var10, var15, var14, -1);
		var11 = var15 - 15;
	}

	@ObfuscatedName("va.a(IZ[Lq;)V")
	public static void method1536(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null) {
				if (var3.field3390 == 0) {
					if (var3.field3465 != null) {
						method1536(arg0, var3.field3465);
					}
					SubInterface var4 = (SubInterface) field2395.method1049((long) var3.parentId);
					if (var4 != null) {
						method912(var4.field3229, arg0);
					}
				}
				if (arg0 == 0 && var3.field3434 != null) {
					HookReq var5 = new HookReq();
					var5.field678 = var3;
					var5.field681 = var3.field3434;
					ScriptRunner.method1373(var5);
				}
				if (arg0 == 1 && var3.field3495 != null) {
					if (var3.field3406 >= 0) {
						IfType var6 = method1579(var3.parentId);
						if (var6 == null || var6.field3465 == null || var3.field3406 >= var6.field3465.length || var3 != var6.field3465[var3.field3406]) {
							continue;
						}
					}
					HookReq var7 = new HookReq();
					var7.field678 = var3;
					var7.field681 = var3.field3495;
					ScriptRunner.method1373(var7);
				}
			}
		}
	}

	@ObfuscatedName("ue.a(Li;IILi;)V")
	public static void method1499(JagString arg0, int arg1, JagString arg2) {
		method801(arg0, -1, arg2, arg1, null);
	}

	@ObfuscatedName("oc.a(IBZII[Lq;)V")
	public static void method1055(int arg0, boolean arg1, int arg2, int arg3, IfType[] arg4) {
		for (int var5 = 0; var5 < arg4.length; var5++) {
			IfType var6 = arg4[var5];
			if (var6 != null && arg2 == var6.field3504) {
				method416(arg1, arg3, arg0, var6);
				method1374(var6, arg0, arg3);
				if (var6.field3415 > var6.field3375 - var6.field3422) {
					var6.field3415 = var6.field3375 - var6.field3422;
				}
				if (var6.field3384 - var6.field3380 < var6.field3393) {
					var6.field3393 = var6.field3384 - var6.field3380;
				}
				if (var6.field3393 < 0) {
					var6.field3393 = 0;
				}
				if (var6.field3415 < 0) {
					var6.field3415 = 0;
				}
				if (var6.field3390 == 0) {
					method759(arg1, var6);
				}
			}
		}
	}

	@ObfuscatedName("fa.a(ZIILq;I)V")
	public static void method416(boolean arg0, int arg1, int arg2, IfType arg3) {
		int var4 = arg3.field3380;
		if (arg3.field3463 == 0) {
			arg3.field3380 = arg3.field3501;
		} else if (arg3.field3463 == 1) {
			arg3.field3380 = arg2 - arg3.field3501;
		} else if (arg3.field3463 == 2) {
			arg3.field3380 = arg2 * arg3.field3501 >> 14;
		} else if (arg3.field3463 == 3) {
			if (arg3.field3390 == 2) {
				arg3.field3380 = arg3.field3501 * 32 + arg3.field3466 * (arg3.field3501 - 1);
			} else if (arg3.field3390 == 7) {
				arg3.field3380 = (arg3.field3501 - 1) * arg3.field3466 + arg3.field3501 * 115;
			}
		}
		int var5 = arg3.field3422;
		if (arg3.field3394 == 0) {
			arg3.field3422 = arg3.field3418;
		} else if (arg3.field3394 == 1) {
			arg3.field3422 = arg1 - arg3.field3418;
		} else if (arg3.field3394 == 2) {
			arg3.field3422 = arg3.field3418 * arg1 >> 14;
		} else if (arg3.field3394 == 3) {
			if (arg3.field3390 == 2) {
				arg3.field3422 = arg3.field3508 * (arg3.field3418 - 1) + arg3.field3418 * 32;
			} else if (arg3.field3390 == 7) {
				arg3.field3422 = arg3.field3508 * (arg3.field3418 - 1) + arg3.field3418 * 12;
			}
		}
		if (field2103 && (Statics.method530(arg3) != 0 || arg3.field3390 == 0)) {
			if (arg3.field3422 < 5 && arg3.field3380 < 5) {
				arg3.field3380 = 5;
				arg3.field3422 = 5;
			} else {
				if (arg3.field3422 <= 0) {
					arg3.field3422 = 5;
				}
				if (arg3.field3380 <= 0) {
					arg3.field3380 = 5;
				}
			}
		}
		if (arg0 && arg3.field3426 != null && (arg3.field3380 != var4 || arg3.field3422 != var5)) {
			HookReq var6 = new HookReq();
			var6.field681 = arg3.field3426;
			var6.field678 = arg3;
			ScriptRunner.method1373(var6);
		}
	}

	@ObfuscatedName("sd.a(Lq;IBI)V")
	public static void method1374(IfType arg0, int arg1, int arg2) {
		if (arg0.field3451 == 0) {
			arg0.field3441 = arg0.field3514;
		} else if (arg0.field3451 == 1) {
			arg0.field3441 = arg0.field3514 + (arg2 - arg0.field3422) / 2;
		} else if (arg0.field3451 == 2) {
			arg0.field3441 = arg2 - arg0.field3422 - arg0.field3514;
		} else if (arg0.field3451 == 3) {
			arg0.field3441 = arg0.field3514 * arg2 >> 14;
		} else if (arg0.field3451 == 4) {
			arg0.field3441 = (arg2 - arg0.field3422) / 2 + (arg0.field3514 * arg2 >> 14);
		} else {
			arg0.field3441 = arg2 - (arg0.field3514 * arg2 >> 14) - arg0.field3422;
		}
		if (arg0.field3367 == 0) {
			arg0.field3366 = arg0.field3391;
		} else if (arg0.field3367 == 1) {
			arg0.field3366 = (arg1 - arg0.field3380) / 2 + arg0.field3391;
		} else if (arg0.field3367 == 2) {
			arg0.field3366 = arg1 - arg0.field3391 - arg0.field3380;
		} else if (arg0.field3367 == 3) {
			arg0.field3366 = arg1 * arg0.field3391 >> 14;
		} else if (arg0.field3367 == 4) {
			arg0.field3366 = (arg1 * arg0.field3391 >> 14) + (arg1 - arg0.field3380) / 2;
		} else {
			arg0.field3366 = arg1 - arg0.field3380 - (arg0.field3391 * arg1 >> 14);
		}
		if (field2103) {
			if (Statics.method530(arg0) == 0 && arg0.field3390 != 0) {
				return;
			}
			if (arg0.field3441 < 0) {
				arg0.field3441 = 0;
			} else if (arg2 < arg0.field3422 + arg0.field3441) {
				arg0.field3441 = arg2 - arg0.field3422;
			}
			if (arg0.field3366 < 0) {
				arg0.field3366 = 0;
			} else if (arg0.field3366 + arg0.field3380 > arg1) {
				arg0.field3366 = arg1 - arg0.field3380;
			}
		}
	}

	@ObfuscatedName("ka.a(ZLq;B)V")
	public static void method759(boolean arg0, IfType arg1) {
		int var2 = arg1.field3384 == 0 ? arg1.field3380 : arg1.field3384;
		int var3 = arg1.field3375 == 0 ? arg1.field3422 : arg1.field3375;
		method1055(var2, arg0, arg1.parentId, var3, IfType.list[arg1.parentId >> 16]);
		if (arg1.field3465 != null) {
			method1055(var2, arg0, arg1.parentId, var3, arg1.field3465);
		}
		SubInterface var4 = (SubInterface) field2395.method1049((long) arg1.parentId);
		if (var4 != null) {
			method1449(var2, var4.field3229, var3, arg0);
		}
	}

	@ObfuscatedName("me.b(I)V")
	public static void method904() {
		int var0 = field1011.method158(Text.field398);
		for (int var1 = 0; var1 < field3862; var1++) {
			int var2 = field1011.method158(method525(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		var0 += 8;
		field4421 = var0;
		field1958 = true;
		field889 = field3862 * 15 + 22;
		int var3 = field3862 * 15 + 21;
		int var4 = ClientMouseListener.field3339;
		if (var3 + var4 > sHei) {
			var4 = sHei - var3;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		int var5 = ClientMouseListener.field4239 - var0 / 2;
		if (var0 + var5 > sWid) {
			var5 = sWid - var0;
		}
		field4383 = var4;
		if (var5 < 0) {
			var5 = 0;
		}
		field1549 = var5;
	}

	@ObfuscatedName("t.a(IIIIIIIIIZII)Z")
	public static boolean method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		if (localPlayer.field4103 == 2) {
			return method737(arg8, arg10, arg5, arg0, arg4, arg6, arg1, arg3, arg9, arg7, arg2);
		} else if (localPlayer.field4103 > 2) {
			return method1591(arg5, arg3, localPlayer.field4103, arg6, arg2, arg4, arg1, arg8, arg10, arg7, arg9, arg0);
		} else {
			return method690(arg2, arg6, arg10, arg4, arg3, arg0, arg1, arg5, arg7, arg9, arg8);
		}
	}

	@ObfuscatedName("ng.b(II)V")
	public static void method1005(int arg0) {
		if (!IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3 != null) {
				var3.field3487 = 0;
				var3.field3379 = 0;
			}
		}
	}

	@ObfuscatedName("jc.a(IIJI)Z")
	public static boolean method705(int arg0, long arg1, int arg2) {
		int var4 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		int var5 = (int) arg1 >> 14 & 0x1F;
		int var6 = (int) arg1 >> 20 & 0x3;
		if (var5 == 10 || var5 == 11 || var5 == 22) {
			LocType var7 = LocType.list(var4);
			int var8;
			int var9;
			if (var6 == 0 || var6 == 2) {
				var8 = var7.field2794;
				var9 = var7.field2774;
			} else {
				var9 = var7.field2794;
				var8 = var7.field2774;
			}
			int var10 = var7.field2781;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			method1421(var8, 0, arg0, arg2, localPlayer.field4087[0], var9, 0, 2, true, var10, localPlayer.field4141[0]);
		} else {
			method1421(0, var6, arg0, arg2, localPlayer.field4087[0], 0, var5 + 1, 2, true, 0, localPlayer.field4141[0]);
		}
		field2997 = ClientMouseListener.field3339;
		field3017 = 2;
		field2757 = ClientMouseListener.field4239;
		field796 = 0;
		return true;
	}

	@ObfuscatedName("w.a(II)Lq;")
	public static IfType method1579(int arg0) {
		int var1 = arg0 >> 16;
		int var2 = arg0 & 0xFFFF;
		if (IfType.list[var1] == null || IfType.list[var1][var2] == null) {
			boolean var3 = IfType.openInterface(var1);
			if (!var3) {
				return null;
			}
		}
		return IfType.list[var1][var2];
	}

	@ObfuscatedName("jh.b(I)V")
	public static void method733() {
		for (int var0 = 0; var0 < 100; var0++) {
			field4228[var0] = true;
		}
	}

	@ObfuscatedName("fa.a(IIIILq;Lrc;I)V")
	public static void method418(int arg0, int arg1, int arg2, IfType arg3, Pix32 arg4, int arg5) {
		if (arg4 == null) {
			return;
		}
		int var6 = field943 + field3930 & 0x7FF;
		int var7 = arg5 * arg5 + arg2 * arg2;
		int var8 = Math.max(arg3.field3380 / 2, arg3.field3422 / 2) + 10;
		if (var7 > var8 * var8) {
			return;
		}
		int var9 = Pix3D.field3354[var6];
		int var10 = var9 * 256 / (Statics.field1185 + 256);
		int var11 = Pix3D.field3359[var6];
		int var12 = var11 * 256 / (Statics.field1185 + 256);
		int var13 = var10 * arg2 - arg5 * var12 >> 16;
		int var14 = arg5 * var10 + arg2 * var12 >> 16;
		((SoftwarePix32) arg4).method1165(arg3.field3380 / 2 + arg1 + var14 - arg4.field3649 / 2, -(arg4.field3645 / 2) + arg3.field3422 / 2 + arg0 + -var13, arg3.field3402, arg3.field3421);
	}

	@ObfuscatedName("hc.a(IIILq;)V")
	public static void method532(int arg0, int arg1, IfType arg2) {
		if (field3568 != null || field1958 || (arg2 == null || Statics.method1512(arg2) == null)) {
			return;
		}
		field3568 = arg2;
		field923 = Statics.method1512(arg2);
		field4256 = 0;
		field2791 = arg0;
		field3867 = false;
		field3941 = arg1;
	}

	@ObfuscatedName("aa.d(B)V")
	public static void method9() {
		in.method34();
		int var0 = in.method28(8);
		if (Statics.field1041 > var0) {
			for (int var1 = var0; var1 < Statics.field1041; var1++) {
				field999[field4196++] = Statics.field402[var1];
			}
		}
		if (var0 > Statics.field1041) {
			throw new RuntimeException("gnpov1");
		}
		Statics.field1041 = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = Statics.field402[var2];
			ClientNpc var4 = field4223[var3];
			int var5 = in.method28(1);
			if (var5 == 0) {
				Statics.field402[Statics.field1041++] = var3;
				var4.field4081 = field2113;
			} else {
				int var6 = in.method28(2);
				if (var6 == 0) {
					Statics.field402[Statics.field1041++] = var3;
					var4.field4081 = field2113;
					field2579[field3702++] = var3;
				} else if (var6 == 1) {
					Statics.field402[Statics.field1041++] = var3;
					var4.field4081 = field2113;
					int var7 = in.method28(3);
					var4.method1476(false, var7);
					int var8 = in.method28(1);
					if (var8 == 1) {
						field2579[field3702++] = var3;
					}
				} else if (var6 == 2) {
					Statics.field402[Statics.field1041++] = var3;
					var4.field4081 = field2113;
					int var9 = in.method28(3);
					var4.method1476(true, var9);
					int var10 = in.method28(3);
					var4.method1476(true, var10);
					int var11 = in.method28(1);
					if (var11 == 1) {
						field2579[field3702++] = var3;
					}
				} else if (var6 == 3) {
					field999[field4196++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("aa.a(Lq;B)V")
	public static void method10(IfType arg0) {
		IfType var1 = Statics.method1413(arg0);
		int var2;
		int var3;
		if (var1 == null) {
			var2 = sWid;
			var3 = sHei;
		} else {
			var3 = var1.field3422;
			var2 = var1.field3380;
		}
		method1374(arg0, var2, var3);
	}

	@ObfuscatedName("kd.f(I)V")
	public static void method773() {
		for (LocChange var0 = (LocChange) field1140.head(); var0 != null; var0 = (LocChange) field1140.method1619()) {
			if (var0.field3061 > 0) {
				var0.field3061--;
			}
			if (var0.field3061 != 0) {
				if (var0.field3054 > 0) {
					var0.field3054--;
				}
				if (var0.field3054 == 0 && var0.field3059 >= 1 && var0.field3052 >= 1 && var0.field3059 <= 102 && var0.field3052 <= 102 && (var0.field3051 < 0 || ClientBuild.method43(var0.field3062, var0.field3051))) {
					ClientBuild.method781(var0.field3055, var0.field3063, var0.field3052, var0.field3062, var0.field3051, var0.field3068, var0.field3059);
					var0.field3054 = -1;
					if (var0.field3051 == var0.field3053 && var0.field3053 == -1) {
						var0.unlink();
					} else if (var0.field3051 == var0.field3053 && var0.field3064 == var0.field3068 && var0.field3060 == var0.field3062) {
						var0.unlink();
					}
				}
			} else if (var0.field3053 < 0 || ClientBuild.method43(var0.field3060, var0.field3053)) {
				ClientBuild.method781(var0.field3055, var0.field3063, var0.field3052, var0.field3060, var0.field3053, var0.field3064, var0.field3059);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("pe.a(III)Li;")
	public static JagString method1152(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return Statics.field3244;
		} else if (var2 < -6) {
			return Statics.field3636;
		} else if (var2 < -3) {
			return Statics.field18;
		} else if (var2 < 0) {
			return Statics.field502;
		} else if (var2 > 9) {
			return Statics.field182;
		} else if (var2 > 6) {
			return Statics.field553;
		} else if (var2 > 3) {
			return Statics.field4338;
		} else if (var2 > 0) {
			return Statics.field2526;
		} else {
			return Statics.field120;
		}
	}

	@ObfuscatedName("mj.a(IZILrf;)V")
	public static void method925(int arg0, int arg1, ClientNpc arg2) {
		if (arg0 == arg2.field4077 && arg0 != -1) {
			SeqType var3 = SeqType.list(arg0);
			int var4 = var3.field1966;
			if (var4 == 1) {
				arg2.field4132 = 0;
				arg2.field4098 = 0;
				arg2.field4140 = arg1;
				arg2.field4101 = 0;
				method433(false, arg2.field4121, arg2.field4101, arg2.field4136, var3);
			}
			if (var4 == 2) {
				arg2.field4132 = 0;
			}
		} else if (arg0 == -1 || arg2.field4077 == -1 || SeqType.list(arg0).field1999 >= SeqType.list(arg2.field4077).field1999) {
			arg2.field4098 = 0;
			arg2.field4140 = arg1;
			arg2.field4137 = arg2.field4135;
			arg2.field4101 = 0;
			arg2.field4132 = 0;
			arg2.field4077 = arg0;
			if (arg2.field4077 != -1) {
				method433(false, arg2.field4121, arg2.field4101, arg2.field4136, SeqType.list(arg2.field4077));
			}
		}
	}

	@ObfuscatedName("j.a(IILi;SJLi;I)V")
	public static void method685(int arg0, JagString arg1, short arg2, long arg3, JagString arg4, int arg5) {
		if (field1958 || field3862 >= 500) {
			return;
		}
		field1191[field3862] = arg1;
		field3836[field3862] = arg4;
		field994[field3862] = arg2;
		field1352[field3862] = arg3;
		field3176[field3862] = arg0;
		field4060[field3862] = arg5;
		field3862++;
	}

	@ObfuscatedName("ie.a(BLpe;Z)V")
	public static void method672(SubInterface arg0, boolean arg1) {
		int var2 = arg0.field3229;
		int var3 = (int) arg0.key;
		arg0.unlink();
		if (arg1) {
			IfType.method233(var2);
		}
		method70(var2);
		IfType var4 = method1579(var3);
		if (var4 != null) {
			method1371(var4);
		}
		field3862 = 0;
		field1958 = false;
		method861(field889, field4421, field4383, field1549);
		if (field723 != -1) {
			method912(field723, 1);
		}
	}

	@ObfuscatedName("kd.c(IIIIIIII)V")
	public static void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		if (arg2 == 0) {
			Wall var7 = World.method1332(arg4, arg1, arg5);
			if (var7 != null) {
				int var8 = Integer.MAX_VALUE & (int) (var7.field3028 >>> 32);
				if (arg0 == 2) {
					var7.field3021 = new ClientLocAnim(var8, 2, arg3 + 4, arg4, arg1, arg5, arg6, false, var7.field3021);
					var7.field3032 = new ClientLocAnim(var8, 2, arg3 + 1 & 0x3, arg4, arg1, arg5, arg6, false, var7.field3032);
				} else {
					var7.field3021 = new ClientLocAnim(var8, arg0, arg3, arg4, arg1, arg5, arg6, false, var7.field3021);
				}
			}
		}
		if (arg2 == 1) {
			Decor var9 = World.method522(arg4, arg1, arg5);
			if (var9 != null) {
				int var10 = (int) (var9.field1158 >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 4 || arg0 == 5) {
					var9.field1159 = new ClientLocAnim(var10, 4, arg3, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 6) {
					var9.field1159 = new ClientLocAnim(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 7) {
					var9.field1159 = new ClientLocAnim(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 8) {
					var9.field1159 = new ClientLocAnim(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
					var9.field1160 = new ClientLocAnim(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1160);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			Sprite var11 = World.method1396(arg4, arg1, arg5);
			if (var11 != null) {
				var11.field1943 = new ClientLocAnim((int) (var11.field1948 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg1, arg5, arg6, false, var11.field1943);
			}
		}
		if (arg2 == 3) {
			GroundDecor var12 = World.method397(arg4, arg1, arg5);
			if (var12 != null) {
				var12.field3194 = new ClientLocAnim((int) (var12.field3202 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg1, arg5, arg6, false, var12.field3194);
			}
		}
	}

	@ObfuscatedName("mf.a(III)V")
	public static void method912(int arg0, int arg1) {
		if (IfType.openInterface(arg0)) {
			method1536(arg1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("sc.d(I)V")
	public static void method1370() {
		for (MapSpotAnimNode var0 = (MapSpotAnimNode) field714.head(); var0 != null; var0 = (MapSpotAnimNode) field714.method1619()) {
			MapSpotAnim var1 = var0.field4474;
			if (var1.field292 != field2907 || var1.field302) {
				var0.unlink();
			} else if (var1.field287 <= field2113) {
				var1.method90(field261);
				if (var1.field302) {
					var0.unlink();
				} else {
					World.method859(var1.field292, var1.field296, var1.field290, var1.field295, 60, var1, 0, -1L, false);
				}
			}
		}
	}

	@ObfuscatedName("pa.a(BLi;)Z")
	public static boolean method1130(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < field1221; var1++) {
			if (arg0.method624(field2741[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ha.a(IZ)Li;")
	public static JagString method525(int arg0) {
		return field3836[arg0].method604() <= 0 ? field1191[arg0] : JagString.join(new JagString[] { field1191[arg0], Text.field4398, field3836[arg0] });
	}

	@ObfuscatedName("nh.a(IIIIILu;I)V")
	public static void method1027(int arg0, int arg1, int arg2, ClientEntity arg3) {
		method681(arg1, arg2, arg3.field4136, arg0, arg3.field4121);
	}

	@ObfuscatedName("id.a(IIII)V")
	public static void method668(int arg0, int arg1, int arg2) {
		if (field2172 == 0 || arg0 == 0 || field3445 >= 50 || arg2 == -1) {
			return;
		}
		field397[field3445] = arg2;
		field2016[field3445] = arg0;
		field116[field3445] = arg1;
		field4417[field3445] = null;
		field2726[field3445] = 0;
		field3445++;
	}

	@ObfuscatedName("cf.a(I)V")
	public static void method174() {
		out.method30(24);
		for (SubInterface var0 = (SubInterface) field2395.method1047(); var0 != null; var0 = (SubInterface) field2395.method1048()) {
			if (var0.field3233 == 0) {
				method672(var0, true);
			}
		}
		if (field967 != null) {
			method1371(field967);
			field967 = null;
		}
	}

	@ObfuscatedName("ub.a(IIIIIIIIII)V")
	public static void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) field1140.head(); var10 != null; var10 = (LocChange) field1140.method1619()) {
			if (arg6 == var10.field3055 && arg7 == var10.field3059 && var10.field3052 == arg1 && var10.field3063 == arg2) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new LocChange();
			var9.field3052 = arg1;
			var9.field3063 = arg2;
			var9.field3059 = arg7;
			var9.field3055 = arg6;
			method1219(var9);
			field1140.push(var9);
		}
		var9.field3062 = arg5;
		var9.field3068 = arg3;
		var9.field3061 = arg4;
		var9.field3051 = arg8;
		var9.field3054 = arg0;
	}

	@ObfuscatedName("nf.a(IIIIIII)V")
	public static void method993(int arg0, int arg1, int arg2, int arg3) {
		HintArrow[] var4 = Statics.field1171;
		for (int var5 = 0; var5 < var4.length; var5++) {
			HintArrow var6 = var4[var5];
			if (var6 != null && var6.field2139 == 2) {
				method681(arg2 >> 1, var6.field2151 * 2, (var6.field2138 - field4212 << 7) + var6.field2134, arg3 >> 1, var6.field2150 + (var6.field2135 - field3679 << 7));
				if (field401 > -1 && field2113 % 20 < 10) {
					field3543[var6.field2137].method1155(arg0 + field401 - 12, field541 + (arg1 - 28));
				}
			}
		}
	}

	@ObfuscatedName("ng.c(ZI)V")
	public static void method1023(boolean arg0) {
		for (int var1 = 0; var1 < Statics.field1041; var1++) {
			ClientNpc var2 = field4223[Statics.field402[var1]];
			long var3 = (long) Statics.field402[var1] << 32 | 0x20000000L;
			if (var2 != null && var2.method287() && arg0 == var2.field3682.field2363 && var2.field3682.method852()) {
				int var5 = var2.field4136 >> 7;
				int var6 = var2.field4121 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var2.field4103 == 1 && (var2.field4136 & 0x7F) == 64 && (var2.field4121 & 0x7F) == 64) {
						if (Statics.field3990 == Statics.field2948[var5][var6]) {
							continue;
						}
						Statics.field2948[var5][var6] = Statics.field3990;
					}
					if (!var2.field3682.field2359) {
						var3 |= Long.MIN_VALUE;
					}
					var2.field4097 = method1584(var2.field4136 + (var2.field4103 - 1) * 64, var2.field4121 - (-(var2.field4103 * 64) + 64), field2907);
					World.method859(field2907, var2.field4136, var2.field4121, var2.field4097, (var2.field4103 - 1) * 64 + 60, var2, var2.field4085, var3, var2.field4093);
				}
			}
		}
	}

	@ObfuscatedName("me.c(B)V")
	public static void method905() {
		int var0 = field666 >> 7;
		field3930 &= 0x7FF;
		int var1 = field4366 >> 7;
		int var2 = 0;
		if (field1173 < 128) {
			field1173 = 128;
		}
		if (field1173 > 383) {
			field1173 = 383;
		}
		int var3 = method1584(field666, field4366, field2907);
		if (var0 > 3 && var1 > 3 && var0 < 100 && var1 < 100) {
			for (int var4 = var0 - 4; var4 <= var0 + 4; var4++) {
				for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
					int var6 = field2907;
					if (var6 < 3 && (ClientBuild.field2098[1][var4][var5] & 0x2) == 2) {
						var6++;
					}
					int var7 = var3 - ClientBuild.field1137[var6][var4][var5];
					if (var2 < var7) {
						var2 = var7;
					}
				}
			}
		}
		int var8 = var2 * 192;
		if (var8 > 98048) {
			var8 = 98048;
		}
		if (var8 < 32768) {
			var8 = 32768;
		}
		if (Statics.field1328 < var8) {
			Statics.field1328 += (var8 - Statics.field1328) / 24;
		} else if (var8 < Statics.field1328) {
			Statics.field1328 += (var8 - Statics.field1328) / 80;
		}
	}

	@ObfuscatedName("nf.a(Lia;IIIIII)V")
	public static void method989(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = 0L;
		if (arg3 == 0) {
			var6 = World.method1062(arg4, arg1, arg5);
		}
		if (arg3 == 1) {
			var6 = World.method1082(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			var6 = World.method770(arg4, arg1, arg5);
		}
		if (arg3 == 3) {
			var6 = World.method501(arg4, arg1, arg5);
		}
		if ((long) 0 != var6) {
			int var8 = (int) var6 >> 14 & 0x1F;
			int var9 = (int) var6 >> 20 & 0x3;
			int var10 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
			LocType var11 = LocType.list(var10);
			if (arg3 == 0) {
				World.method56(arg4, arg1, arg5);
				if (var11.field2819 != 0) {
					arg0.method655(var11.field2789, var8, var9, arg5, arg1);
				}
			}
			if (arg3 == 1) {
				World.method42(arg4, arg1, arg5);
			}
			if (arg3 == 2) {
				World.method974(arg4, arg1, arg5);
				if (var11.field2819 != 0 && var11.field2774 + arg1 < 104 && var11.field2774 + arg5 < 104 && var11.field2794 + arg1 < 104 && arg5 + var11.field2794 < 104) {
					arg0.method642(arg1, var11.field2789, var9, arg5, var11.field2794, var11.field2774);
				}
			}
			if (arg3 == 3) {
				World.method1419(arg4, arg1, arg5);
				if (var11.field2819 == 1) {
					arg0.method654(arg1, arg5);
				}
			}
		}
	}

	@ObfuscatedName("sh.a(IIIIIII)V")
	public static void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field475 == 0 && !Statics.field145) {
			int var6 = Statics.field2766;
			int var7 = Statics.field2931;
			int var8 = Statics.field1102;
			int var9 = Statics.field4055;
			int var10 = var8 + (var9 - var8) * (arg0 - arg4) / arg2;
			int var11 = var6 + (var7 - var6) * (arg5 - arg1) / arg3;
			method685(var11, ParamType.field54, (short) 10, 0L, field3453, var10);
		}
		long var12 = -1L;
		for (int var14 = 0; var14 < SoftwareModelLit.field3101; var14++) {
			long var15 = SoftwareModelLit.field476[var14];
			int var17 = (int) var15 & 0x7F;
			int var18 = (int) var15 >> 7 & 0x7F;
			int var19 = (int) var15 >> 29 & 0x3;
			int var20 = Integer.MAX_VALUE & (int) (var15 >>> 32);
			if (var15 != var12) {
				var12 = var15;
				if (var19 == 2 && World.method1386(field2907, var17, var18, var15)) {
					LocType var21 = LocType.list(var20);
					if (var21.field2770 != null) {
						var21 = var21.method998();
					}
					if (var21 == null) {
						continue;
					}
					if (field475 == 1) {
						method685(var17, Text.field608, (short) 26, var15, JagString.join(new JagString[] {field1414, Statics.field3526, var21.field2773 }), var18);
					} else if (!Statics.field145) {
						JagString[] var22 = var21.field2816;
						if (Statics.field1807) {
							var22 = method921(var22);
						}
						if (var22 != null) {
							for (int var23 = 4; var23 >= 0; var23--) {
								if (var22[var23] != null) {
									short var24 = 0;
									if (var23 == 0) {
										var24 = 7;
									}
									if (var23 == 1) {
										var24 = 35;
									}
									if (var23 == 2) {
										var24 = 51;
									}
									if (var23 == 3) {
										var24 = 33;
									}
									if (var23 == 4) {
										var24 = 1004;
									}
									method685(var17, var22[var23], var24, var15, JagString.join(new JagString[] {Statics.field259, var21.field2773 }), var18);
								}
							}
						}
						method685(var17, Text.field1174, (short) 1005, (long) var21.field2831, JagString.join(new JagString[] {Statics.field259, var21.field2773 }), var18);
					} else if ((Statics.field2084 & 0x4) == 4) {
						method685(var17, Statics.field3835, (short) 24, var15, JagString.join(new JagString[] {Statics.field464, Statics.field3526, var21.field2773 }), var18);
					}
				}
				if (var19 == 1) {
					ClientNpc var25 = field4223[var20];
					if (var25.field3682.field2349 == 1 && (var25.field4136 & 0x7F) == 64 && (var25.field4121 & 0x7F) == 64) {
						for (int var26 = 0; var26 < Statics.field1041; var26++) {
							ClientNpc var27 = field4223[Statics.field402[var26]];
							if (var27 != null && var25 != var27 && var27.field3682.field2349 == 1 && var25.field4136 == var27.field4136 && var25.field4121 == var27.field4121) {
								method1513(var27.field3682, Statics.field402[var26], var18, var17);
							}
						}
						for (int var28 = 0; var28 < field1027; var28++) {
							ClientPlayer var29 = field4491[field3428[var28]];
							if (var29 != null && var25.field4136 == var29.field4136 && var29.field4121 == var25.field4121) {
								method922(field3428[var28], var17, var18, var29);
							}
						}
					}
					method1513(var25.field3682, var20, var18, var17);
				}
				if (var19 == 0) {
					ClientPlayer var30 = field4491[var20];
					if ((var30.field4136 & 0x7F) == 64 && (var30.field4121 & 0x7F) == 64) {
						for (int var31 = 0; var31 < Statics.field1041; var31++) {
							ClientNpc var32 = field4223[Statics.field402[var31]];
							if (var32 != null && var32.field3682.field2349 == 1 && var32.field4136 == var30.field4136 && var32.field4121 == var30.field4121) {
								method1513(var32.field3682, Statics.field402[var31], var18, var17);
							}
						}
						for (int var33 = 0; var33 < field1027; var33++) {
							ClientPlayer var34 = field4491[field3428[var33]];
							if (var34 != null && var34 != var30 && var34.field4136 == var30.field4136 && var34.field4121 == var30.field4121) {
								method922(field3428[var33], var17, var18, var34);
							}
						}
					}
					method922(var20, var17, var18, var30);
				}
				if (var19 == 3) {
					LinkList var35 = field2497[field2907][var17][var18];
					if (var35 != null) {
						for (ClientObjNode var36 = (ClientObjNode) var35.method1612(); var36 != null; var36 = (ClientObjNode) var35.method1617()) {
							int var37 = var36.field4258.field2030;
							ObjType var38 = ObjType.list(var37);
							if (field475 == 1) {
								method685(var17, Text.field608, (short) 46, (long) var37, JagString.join(new JagString[] {field1414, Statics.field581, var38.name}), var18);
							} else if (!Statics.field145) {
								JagString[] var39 = var38.field2898;
								if (Statics.field1807) {
									var39 = method921(var39);
								}
								for (int var40 = 4; var40 >= 0; var40--) {
									if (var39 != null && var39[var40] != null) {
										byte var41 = 0;
										if (var40 == 0) {
											var41 = 5;
										}
										if (var40 == 1) {
											var41 = 22;
										}
										if (var40 == 2) {
											var41 = 41;
										}
										if (var40 == 3) {
											var41 = 57;
										}
										if (var40 == 4) {
											var41 = 3;
										}
										method685(var17, var39[var40], var41, (long) var37, JagString.join(new JagString[] { Statics.field2529, var38.name}), var18);
									} else if (var40 == 2) {
										method685(var17, Text.field4343, (short) 41, (long) var37, JagString.join(new JagString[] { Statics.field2529, var38.name}), var18);
									}
								}
								method685(var17, Text.field1174, (short) 1006, (long) var37, JagString.join(new JagString[] { Statics.field2529, var38.name}), var18);
							} else if ((Statics.field2084 & 0x1) == 1) {
								method685(var17, Statics.field3835, (short) 25, (long) var37, JagString.join(new JagString[] {Statics.field464, Statics.field581, var38.name}), var18);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("of.a(ZIII)V")
	public static void method1064(int arg0, int arg1, int arg2) {
		IfType var3 = method238(arg2, arg0);
		if (var3 != null && var3.field3447 != null) {
			HookReq var4 = new HookReq();
			var4.field678 = var3;
			var4.field681 = var3.field3447;
			ScriptRunner.method1373(var4);
		}
		Statics.field145 = true;
		field569 = arg2;
		Statics.field2084 = arg1;
		Statics.field249 = arg0;
		method1371(var3);
	}

	@ObfuscatedName("na.a(ZI)V")
	public static void method934() {
		byte[][] var0 = ClientBuild.field3221;
		int var1 = var0.length;
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = (ClientBuild.field2731[var2] >> 8) * 64 - field4212;
			byte[] var4 = var0[var2];
			int var5 = (ClientBuild.field2731[var2] & 0xFF) * 64 - field3679;
			if (var4 != null) {
				doAudio();
				ClientBuild.method963(field2014 * 8 - 48, var3, (mapBuildCentreZoneX - 6) * 8, collision, var5, var4);
			}
		}
		for (int var6 = 0; var6 < var1; var6++) {
			int var7 = (ClientBuild.field2731[var6] >> 8) * 64 - field4212;
			int var8 = (ClientBuild.field2731[var6] & 0xFF) * 64 - field3679;
			byte[] var9 = var0[var6];
			if (var9 == null && field2014 < 800) {
				doAudio();
				for (int var10 = 0; var10 < 4; var10++) {
					ClientBuild.method83(var10, 64, 64, var8, var7);
				}
			}
		}
	}

	@ObfuscatedName("ee.a(B)V")
	public static void method372() {
		if (Statics.field2514 != null || field3568 != null) {
			return;
		}
		int var0 = ClientMouseListener.field625;
		if (field1958) {
			if (var0 != 1) {
				int var5 = ClientMouseListener.field471;
				int var6 = ClientMouseListener.field4449;
				if (field1549 - 10 > var5 || field1549 + field4421 + 10 < var5 || var6 < field4383 - 10 || field889 + field4383 + 10 < var6) {
					field1958 = false;
					method861(field889, field4421, field4383, field1549);
				}
			}
			if (var0 != 1) {
				return;
			}
			int var7 = field1549;
			int var8 = field4383;
			int var9 = field4421;
			int var10 = ClientMouseListener.field4239;
			int var11 = ClientMouseListener.field3339;
			int var12 = -1;
			for (int var13 = 0; var13 < field3862; var13++) {
				int var14 = var8 + (-var13 + field3862 + -1) * 15 + 31;
				if (var10 > var7 && var10 < var7 + var9 && var11 > var14 - 13 && var11 < var14 + 3) {
					var12 = var13;
				}
			}
			if (var12 != -1) {
				method1257(var12);
			}
			field1958 = false;
			method861(field889, field4421, field4383, field1549);
			return;
		}
		if (var0 == 1 && field3862 > 0) {
			short var1 = field994[field3862 - 1];
			if (var1 == 6 || var1 == 8 || var1 == 49 || var1 == 44 || var1 == 13 || var1 == 28 || var1 == 9 || var1 == 2 || var1 == 21 || var1 == 18 || var1 == 12 || var1 == 1001) {
				int var2 = field3176[field3862 - 1];
				int var3 = field4060[field3862 - 1];
				IfType var4 = method1579(var3);
				if (Statics.method465(Statics.method530(var4)) || Statics.method1070(Statics.method530(var4))) {
					Statics.field4535 = 0;
					Statics.field739 = false;
					if (Statics.field2514 != null) {
						method1371(Statics.field2514);
					}
					Statics.field2514 = method1579(var3);
					Statics.field305 = var2;
					Statics.field4146 = ClientMouseListener.field4239;
					Statics.field894 = ClientMouseListener.field3339;
					method1371(Statics.field2514);
					return;
				}
			}
		}
		if (var0 == 1 && (field3859 == 1 && field3862 > 2 || method1554(field3862 - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && field3862 > 0) {
			method1257(field3862 - 1);
		}
		if (var0 == 2 && field3862 > 0) {
			method904();
			return;
		}
	}

	@ObfuscatedName("ec.c(I)V")
	public static void method367() {
		for (int var0 = 0; var0 < field3445; var0++) {
			int var10002 = field116[var0]--;
			if (field116[var0] >= -10) {
				JagFX var2 = field4417[var0];
				if (var2 == null) {
					var2 = JagFX.method252(jagFX, field397[var0], 0);
					if (var2 == null) {
						continue;
					}
					field116[var0] += var2.method251();
					field4417[var0] = var2;
				}
				if (field116[var0] < 0) {
					int var3;
					if (field2726[var0] == 0) {
						var3 = field2172;
					} else {
						int var4 = (field2726[var0] & 0xFF) * 128;
						int var5 = field2726[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - localPlayer.field4136;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = field2726[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - localPlayer.field4121;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							field116[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = (var4 - var9) * field4211 / var4;
					}
					if (var3 > 0) {
						Wave var10 = var2.method253().method1453(decimator);
						WaveStream var11 = WaveStream.method1124(var10, var3);
						var11.method1119(field2016[var0] - 1);
						mixer.method1506(var11);
					}
					field116[var0] = -100;
				}
			} else {
				field3445--;
				for (int var1 = var0; var1 < field3445; var1++) {
					field397[var1] = field397[var1 + 1];
					field4417[var1] = field4417[var1 + 1];
					field2016[var1] = field2016[var1 + 1];
					field116[var1] = field116[var1 + 1];
					field2726[var1] = field2726[var1 + 1];
				}
				var0--;
			}
		}
		if (field2012 && !MidiManager.method707()) {
			if (TitleScreen.field1183 != 0 && Statics.field25 != -1) {
				MidiManager.method388(songs, Statics.field25, TitleScreen.field1183);
			}
			field2012 = false;
		} else if (TitleScreen.field1183 != 0 && Statics.field25 != -1 && !MidiManager.method707()) {
			out.method30(133);
			out.p4(Statics.field25);
			Statics.field25 = -1;
		}
	}

	@ObfuscatedName("pd.c(B)V")
	public static void method1144() {
		for (int var0 = 0; var0 < Statics.field1041; var0++) {
			int var1 = Statics.field402[var0];
			ClientNpc var2 = field4223[var1];
			if (var2 != null) {
				method514(var2.field3682.field2349, var2);
			}
		}
	}

	@ObfuscatedName("td.a(Lu;I)V")
	public static void method1444(ClientEntity arg0) {
		if (arg0.field4130 == field2113 || arg0.field4077 == -1 || arg0.field4140 != 0 || arg0.field4098 + 1 > SeqType.list(arg0.field4077).field1990[arg0.field4101]) {
			int var1 = field2113 - arg0.field4133;
			int var2 = arg0.field4113 * 128 + arg0.field4103 * 64;
			int var3 = arg0.field4130 - arg0.field4133;
			int var4 = arg0.field4094 * 128 + arg0.field4103 * 64;
			int var5 = arg0.field4100 * 128 + arg0.field4103 * 64;
			int var6 = arg0.field4072 * 128 + arg0.field4103 * 64;
			arg0.field4121 = ((var3 - var1) * var4 + var6 * var1) / var3;
			arg0.field4136 = ((var3 - var1) * var2 + var5 * var1) / var3;
		}
		arg0.field4108 = 0;
		if (arg0.field4139 == 0) {
			arg0.field4119 = 1024;
		}
		if (arg0.field4139 == 1) {
			arg0.field4119 = 1536;
		}
		if (arg0.field4139 == 2) {
			arg0.field4119 = 0;
		}
		if (arg0.field4139 == 3) {
			arg0.field4119 = 512;
		}
		arg0.field4085 = arg0.field4119;
	}

	@ObfuscatedName("fd.a(IZIIILk;)V")
	public static void method433(boolean arg0, int arg1, int arg2, int arg3, SeqType arg4) {
		if (field3445 >= 50 || (arg4.field2001 == null || arg4.field2001.length < 1 || arg2 >= arg4.field2001.length || arg4.field2001[arg2] == null)) {
			return;
		}
		int var5 = arg4.field2001[arg2][0];
		int var6 = var5 >> 8;
		int var7 = var5 >> 4 & 0x7;
		int var8 = var5 & 0xF;
		if (arg4.field2001[arg2].length > 1) {
			int var9 = (int) (Math.random() * (double) arg4.field2001[arg2].length);
			if (var9 > 0) {
				var6 = arg4.field2001[arg2][var9];
			}
		}
		if (var8 == 0) {
			if (arg0) {
				method668(var7, 0, var6);
			}
		} else if (field4211 != 0) {
			field397[field3445] = var6;
			field2016[field3445] = var7;
			field116[field3445] = 0;
			int var10 = (arg3 - 64) / 128;
			field4417[field3445] = null;
			int var11 = (arg1 - 64) / 128;
			field2726[field3445] = (var10 << 16) + (var11 << 8) + var8;
			field3445++;
		}
	}

	@ObfuscatedName("fd.a(Li;IBLi;Li;)V")
	public static void method428(JagString arg0, JagString arg1, JagString arg2) {
		method801(arg1, -1, arg0, 9, arg2);
	}

	@ObfuscatedName("o.f(I)I")
	public static int method1040() {
		int var0 = method1584(field1428, field3608, field2907);
		return var0 - field1954 >= 800 || (ClientBuild.field2098[field2907][field1428 >> 7][field3608 >> 7] & 0x4) == 0 ? 3 : field2907;
	}

	@ObfuscatedName("lh.a(IIZIII)V")
	public static void method871(int arg0, int arg1, int arg2, int arg3, int arg4) {
		long var5 = World.method1062(arg2, arg4, arg0);
		if (var5 != 0L) {
			int var7 = (int) var5 >> 20 & 0x3;
			int var8 = (int) var5 >> 14 & 0x1F;
			int var9 = arg3;
			int[] var10 = Pix2D.field1331;
			int var11 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			int var12 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
			if (var5 > 0L) {
				var9 = arg1;
			}
			LocType var13 = LocType.list(var12);
			if (var13.field2832 == -1) {
				if (var8 == 0 || var8 == 2) {
					if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 1) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 3] = var9;
						var10[var11 + 515] = var9;
						var10[var11 + 1024 + 3] = var9;
						var10[var11 + 3 + 1536] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1 + 1536] = var9;
						var10[var11 + 2 + 1536] = var9;
						var10[var11 + 1536 + 3] = var9;
					}
				}
				if (var8 == 3) {
					if (var7 == 0) {
						var10[var11] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
					}
				}
				if (var8 == 2) {
					if (var7 == 3) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
						var10[var11 + 512 + 3] = var9;
						var10[var11 + 3 + 1024] = var9;
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1536 + 1] = var9;
						var10[var11 + 1538] = var9;
						var10[var11 + 3 + 1536] = var9;
					}
				}
			} else {
				SoftwarePix8 var14 = field4460[var13.field2832];
				if (var14 != null) {
					int var15 = (var13.field2774 * 4 - var14.field2434) / 2;
					int var16 = (var13.field2794 * 4 - var14.field2437) / 2;
					var14.method876(arg4 * 4 + var15 + 48, 48 - -((104 - (arg0 - -var13.field2794)) * 4) + var16);
				}
			}
		}
		long var17 = World.method770(arg2, arg4, arg0);
		if (var17 != 0L) {
			int var19 = (int) var17 >> 20 & 0x3;
			int var20 = (int) var17 >> 14 & 0x1F;
			int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
			LocType var22 = LocType.list(var21);
			if (var22.field2832 != -1) {
				SoftwarePix8 var23 = field4460[var22.field2832];
				if (var23 != null) {
					int var24 = (var22.field2774 * 4 - var23.field2434) / 2;
					int var25 = (var22.field2794 * 4 - var23.field2437) / 2;
					var23.method876(arg4 * 4 + var24 + 48, var25 + (-var22.field2794 + -arg0 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = Pix2D.field1331;
				if (var17 > 0L) {
					var26 = 15597568;
				}
				int var28 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				if (var19 == 0 || var19 == 2) {
					var27[var28 + 1536] = var26;
					var27[var28 + 1025] = var26;
					var27[var28 + 514] = var26;
					var27[var28 + 3] = var26;
				} else {
					var27[var28] = var26;
					var27[var28 + 1 + 512] = var26;
					var27[var28 + 1024 + 2] = var26;
					var27[var28 + 1539] = var26;
				}
			}
		}
		long var29 = World.method501(arg2, arg4, arg0);
		if (var29 == 0L) {
			return;
		}
		int var31 = Integer.MAX_VALUE & (int) (var29 >>> 32);
		LocType var32 = LocType.list(var31);
		if (var32.field2832 != -1) {
			SoftwarePix8 var33 = field4460[var32.field2832];
			if (var33 != null) {
				int var34 = (var32.field2774 * 4 - var33.field2434) / 2;
				int var35 = (var32.field2794 * 4 - var33.field2437) / 2;
				var33.method876(var34 + arg4 * 4 + 48, (-arg0 + 104 + -var32.field2794) * 4 + 48 - -var35);
			}
		}
	}

	@ObfuscatedName("jf.a(Lu;I)V")
	public static void method721(ClientEntity arg0) {
		arg0.field4093 = false;
		if (arg0.field4106 != -1) {
			SeqType var1 = SeqType.list(arg0.field4106);
			if (var1 == null || var1.field1965 == null) {
				arg0.field4106 = -1;
			} else {
				arg0.field4111++;
				if (arg0.field4127 < var1.field1965.length && var1.field1990[arg0.field4127] < arg0.field4111) {
					arg0.field4111 = 1;
					arg0.field4127++;
					method433(arg0 == localPlayer, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
				if (arg0.field4127 >= var1.field1965.length) {
					arg0.field4127 = 0;
					arg0.field4111 = 0;
					method433(arg0 == localPlayer, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
			}
		}
		if (arg0.field4080 != -1 && field2113 >= arg0.field4082) {
			if (arg0.field4075 < 0) {
				arg0.field4075 = 0;
			}
			int var2 = SpotType.list(arg0.field4080).field542;
			if (var2 == -1) {
				arg0.field4080 = -1;
			} else {
				SeqType var3 = SeqType.list(var2);
				if (var3 == null || var3.field1965 == null) {
					arg0.field4080 = -1;
				} else {
					arg0.field4120++;
					if (var3.field1965.length > arg0.field4075 && var3.field1990[arg0.field4075] < arg0.field4120) {
						arg0.field4075++;
						arg0.field4120 = 1;
						method433(localPlayer == arg0, arg0.field4121, arg0.field4075, arg0.field4136, var3);
					}
					if (arg0.field4075 >= var3.field1965.length) {
						arg0.field4080 = -1;
					}
				}
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 <= 1) {
			SeqType var4 = SeqType.list(arg0.field4077);
			if (var4.field1983 == 1 && arg0.field4137 > 0 && arg0.field4133 <= field2113 && field2113 > arg0.field4130) {
				arg0.field4140 = 1;
				return;
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 == 0) {
			SeqType var5 = SeqType.list(arg0.field4077);
			if (var5 == null || var5.field1965 == null) {
				arg0.field4077 = -1;
			} else {
				arg0.field4098++;
				if (arg0.field4101 < var5.field1965.length && var5.field1990[arg0.field4101] < arg0.field4098) {
					arg0.field4098 = 1;
					arg0.field4101++;
					method433(arg0 == localPlayer, arg0.field4121, arg0.field4101, arg0.field4136, var5);
				}
				if (arg0.field4101 >= var5.field1965.length) {
					arg0.field4132++;
					arg0.field4101 -= var5.field1972;
					if (arg0.field4132 >= var5.field1970) {
						arg0.field4077 = -1;
					} else if (arg0.field4101 >= 0 && arg0.field4101 < var5.field1965.length) {
						method433(arg0 == localPlayer, arg0.field4121, arg0.field4101, arg0.field4136, var5);
					} else {
						arg0.field4077 = -1;
					}
				}
				arg0.field4093 = var5.field1960;
			}
		}
		if (arg0.field4140 > 0) {
			arg0.field4140--;
		}
	}

	@ObfuscatedName("jf.a(IIIB)Lpe;")
	public static SubInterface method720(int arg0, int arg1, int arg2) {
		SubInterface var3 = new SubInterface();
		var3.field3233 = arg0;
		var3.field3229 = arg2;
		field2395.put((long) arg1, var3);
		method1005(arg2);
		IfType var4 = method1579(arg1);
		if (var4 != null) {
			method1371(var4);
		}
		if (field967 != null) {
			method1371(field967);
			field967 = null;
		}
		field1958 = false;
		field3862 = 0;
		method861(field889, field4421, field4383, field1549);
		if (var4 != null) {
			method759(false, var4);
		}
		method972(arg2);
		if (field723 != -1) {
			method912(field723, 1);
		}
		return var3;
	}

	@ObfuscatedName("pi.a(ILog;)V")
	public static void method1219(LocChange arg0) {
		long var1 = 0L;
		if (arg0.field3063 == 0) {
			var1 = World.method1062(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		int var3 = 0;
		int var4 = 0;
		int var5 = -1;
		if (arg0.field3063 == 1) {
			var1 = World.method1082(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 2) {
			var1 = World.method770(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 3) {
			var1 = World.method501(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (var1 != 0L) {
			var4 = (int) var1 >> 20 & 0x3;
			var5 = (int) (var1 >>> 32) & Integer.MAX_VALUE;
			var3 = (int) var1 >> 14 & 0x1F;
		}
		arg0.field3064 = var4;
		arg0.field3053 = var5;
		arg0.field3060 = var3;
	}

	@ObfuscatedName("b.a(IILq;B)V")
	public static void method65(int arg0, int arg1, IfType arg2) {
		if (arg2.field3368 == 1) {
			method685(0, arg2.field3460, (short) 11, 0L, field3453, arg2.parentId);
		}
		if (arg2.field3368 == 2 && !Statics.field145) {
			JagString var3 = Statics.method1345(arg2);
			if (var3 != null) {
				method685(-1, var3, (short) 15, 0L, JagString.join(new JagString[] { Statics.field182, arg2.field3459 }), arg2.parentId);
			}
		}
		if (arg2.field3368 == 3) {
			method685(0, Text.field530, (short) 14, 0L, field3453, arg2.parentId);
		}
		if (arg2.field3368 == 4) {
			method685(0, arg2.field3460, (short) 36, 0L, field3453, arg2.parentId);
		}
		if (arg2.field3368 == 5) {
			method685(0, arg2.field3460, (short) 20, 0L, field3453, arg2.parentId);
		}
		if (arg2.field3368 == 6 && field967 == null) {
			method685(-1, arg2.field3460, (short) 47, 0L, field3453, arg2.parentId);
		}
		if (arg2.field3390 == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg2.field3418; var5++) {
				for (int var6 = 0; var6 < arg2.field3501; var6++) {
					int var7 = (arg2.field3508 + 32) * var5;
					int var8 = (arg2.field3466 + 32) * var6;
					if (var4 < 20) {
						var7 += arg2.field3397[var4];
						var8 += arg2.field3472[var4];
					}
					if (arg1 >= var8 && arg0 >= var7 && var8 + 32 > arg1 && var7 + 32 > arg0) {
						field4229 = arg2;
						Statics.field3333 = var4;
						if (arg2.field3388[var4] > 0) {
							ObjType var9 = ObjType.list(arg2.field3388[var4] - 1);
							if (field475 == 1 && ServerActive.method431(Statics.method530(arg2))) {
								if (field3965 != arg2.parentId || var4 != field1105) {
									method685(var4, Text.field608, (short) 42, (long) var9.field2844, JagString.join(new JagString[] {field1414, Statics.field581, var9.name}), arg2.parentId);
								}
							} else if (!Statics.field145 || !ServerActive.method431(Statics.method530(arg2))) {
								JagString[] var10 = var9.field2904;
								if (Statics.field1807) {
									var10 = method921(var10);
								}
								if (ServerActive.method431(Statics.method530(arg2))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 21;
											} else {
												var12 = 18;
											}
											method685(var4, var10[var11], var12, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
										} else if (var11 == 4) {
											method685(var4, Text.field4171, (short) 18, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
										}
									}
								}
								if (PacketBit.method27(Statics.method530(arg2))) {
									method685(var4, Text.field608, (short) 12, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
								}
								if (ServerActive.method431(Statics.method530(arg2)) && var10 != null) {
									for (int var13 = 2; var13 >= 0; var13--) {
										if (var10[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 28;
											}
											if (var13 == 1) {
												var14 = 9;
											}
											if (var13 == 2) {
												var14 = 2;
											}
											method685(var4, var10[var13], var14, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
										}
									}
								}
								JagString[] var15 = arg2.field3511;
								if (Statics.field1807) {
									var15 = method921(var15);
								}
								if (var15 != null) {
									for (int var16 = 4; var16 >= 0; var16--) {
										if (var15[var16] != null) {
											byte var17 = 0;
											if (var16 == 0) {
												var17 = 6;
											}
											if (var16 == 1) {
												var17 = 8;
											}
											if (var16 == 2) {
												var17 = 49;
											}
											if (var16 == 3) {
												var17 = 44;
											}
											if (var16 == 4) {
												var17 = 13;
											}
											method685(var4, var15[var16], var17, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
										}
									}
								}
								method685(var4, Text.field1174, (short) 1001, (long) var9.field2844, JagString.join(new JagString[] { Statics.field2529, var9.name}), arg2.parentId);
							} else if ((Statics.field2084 & 0x10) == 16) {
								method685(var4, Statics.field3835, (short) 39, (long) var9.field2844, JagString.join(new JagString[] {Statics.field464, Statics.field581, var9.name}), arg2.parentId);
							}
						}
					}
					var4++;
				}
			}
		}
		if (!arg2.field3410) {
			return;
		}
		if (!Statics.field145) {
			for (int var18 = 9; var18 >= 5; var18--) {
				JagString var19 = Statics.method1494(arg2, var18);
				if (var19 != null) {
					method685(arg2.field3406, var19, (short) 1003, (long) (var18 + 1), arg2.field3457, arg2.parentId);
				}
			}
			JagString var20 = Statics.method1345(arg2);
			if (var20 != null) {
				method685(arg2.field3406, var20, (short) 15, 0L, arg2.field3457, arg2.parentId);
			}
			for (int var21 = 4; var21 >= 0; var21--) {
				JagString var22 = Statics.method1494(arg2, var21);
				if (var22 != null) {
					method685(arg2.field3406, var22, (short) 43, (long) (var21 + 1), arg2.field3457, arg2.parentId);
				}
			}
			if (Statics.method1526(Statics.method530(arg2))) {
				method685(arg2.field3406, Text.field3665, (short) 47, 0L, field3453, arg2.parentId);
				return;
			}
			return;
		}
		if (ServerActive.method201(Statics.method530(arg2)) && (Statics.field2084 & 0x20) == 32) {
			method685(arg2.field3406, Statics.field3835, (short) 40, 0L, JagString.join(new JagString[] {Statics.field464, Statics.field4548, arg2.field3457 }), arg2.parentId);
			return;
		}
	}

	@ObfuscatedName("eh.a(ILq;)Z")
	public static boolean method389(IfType arg0) {
		if (arg0.field3439 == 205) {
			field1910 = 250;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("l.a(Li;I)I")
	public static int method823(JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < field2729; var1++) {
			if (arg0.method624(Statics.field370[var1])) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("db.a(IIZ)Lq;")
	public static IfType method238(int arg0, int arg1) {
		IfType var2 = method1579(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.field3465 == null || var2.field3465.length <= arg0) {
			return null;
		} else {
			return var2.field3465[arg0];
		}
	}

	@ObfuscatedName("mg.a([Li;B)[Li;")
	public static JagString[] method921(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[] { JagString.method1212(var2), Statics.field3306});
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("re.b(I)V")
	public static void method1328() {
		if (lowMem && field2907 != field3026) {
			method820(field2907, localPlayer.field4141[0], mapBuildCentreZoneX, field2014, localPlayer.field4087[0]);
		} else if (field2907 != field3336) {
			field3336 = field2907;
			method1595(field2907);
		}
	}

	@ObfuscatedName("re.a(ZZ)V")
	public static void method1327() {
		byte[][] var0 = Statics.field774;
		int var1 = ClientBuild.field3221.length;
		for (int var2 = 0; var2 < var1; var2++) {
			byte[] var3 = var0[var2];
			if (var3 != null) {
				int var4 = (ClientBuild.field2731[var2] >> 8) * 64 - field4212;
				int var5 = (ClientBuild.field2731[var2] & 0xFF) * 64 - field3679;
				doAudio();
				ClientBuild.method85(collision, var3, var4, var5);
			}
		}
	}

	@ObfuscatedName("eb.a(IIIIIIII)V")
	public static void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 0;
		int var9 = 0;
		int var10 = arg4;
		int var11 = 2048 - arg3 & 0x7FF;
		if (var11 != 0) {
			int var12 = Pix3D.field3359[var11];
			int var13 = Pix3D.field3354[var11];
			var9 = var12 * -arg4 >> 16;
			var10 = var13 * arg4 >> 16;
		}
		if (var7 != 0) {
			int var14 = Pix3D.field3359[var7];
			int var15 = Pix3D.field3354[var7];
			var8 = var10 * var14 >> 16;
			var10 = var15 * var10 >> 16;
		}
		field1954 = arg1 - var9;
		field1428 = arg0 - var8;
		field3608 = arg6 - var10;
		field3257 = arg2;
		field3934 = arg3;
	}

	@ObfuscatedName("eb.e(I)V")
	public static void method363() {
		if (!Statics.field145) {
			return;
		}
		IfType var0 = method238(field569, Statics.field249);
		if (var0 != null && var0.field3440 != null) {
			HookReq var1 = new HookReq();
			var1.field678 = var0;
			var1.field681 = var0.field3440;
			ScriptRunner.method1373(var1);
		}
		Statics.field145 = false;
		method1371(var0);
	}

	@ObfuscatedName("wc.b(II)V")
	public static void method1595(int arg0) {
		SoftwarePix32 var1;
		if (Statics.field2010 == null) {
			var1 = new SoftwarePix32(512, 512);
		} else {
			var1 = (SoftwarePix32) Statics.field2010;
		}
		int[] var2 = var1.field3247;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 1;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 2048 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((ClientBuild.field2098[arg0][var7][var5] & 0x18) == 0) {
					World.method815(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (ClientBuild.field2098[arg0 + 1][var7][var5] & 0x8) != 0) {
					World.method815(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		var1.method1167();
		int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
		int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((ClientBuild.field2098[arg0][var11][var10] & 0x18) == 0) {
					method871(var10, var8, arg0, var9, var11);
				}
				if (arg0 < 3 && (ClientBuild.field2098[arg0 + 1][var11][var10] & 0x8) != 0) {
					method871(var10, var8, arg0 + 1, var9, var11);
				}
			}
		}
		Statics.field930 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				long var14 = World.method501(field2907, var12, var13);
				if (var14 != 0L) {
					LocType var16 = LocType.list(Integer.MAX_VALUE & (int) (var14 >>> 32));
					int var17 = var16.field2817;
					if (var17 >= 0) {
						int var18 = var12;
						int var19 = var13;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							int[][] var20 = collision[field2907].field1667;
							for (int var21 = 0; var21 < 10; var21++) {
								int var22 = (int) (Math.random() * 4.0D);
								if (var22 == 0 && var18 > 0 && var12 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
									var18--;
								}
								if (var22 == 1 && var18 < 103 && var12 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
									var18++;
								}
								if (var22 == 2 && var19 > 0 && var19 > var13 - 3 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
									var19--;
								}
								if (var22 == 3 && var19 < 103 && var19 < var13 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
									var19++;
								}
							}
						}
						Statics.field2745[Statics.field930] = var16.field2831;
						Statics.field2577[Statics.field930] = var18;
						Statics.field2501[Statics.field930] = var19;
						Statics.field930++;
					}
				}
			}
		}
		Statics.field2010 = var1;
		field3852.method1521();
	}

	@ObfuscatedName("eh.a(IIIIIII)V")
	public static void method391(int arg0, int arg1, int arg2, int arg3) {
		Statics.field1918 = 0;
		for (int var4 = -1; var4 < Statics.field1041 + field1027; var4++) {
			ClientEntity var5;
			if (var4 == -1) {
				var5 = localPlayer;
			} else if (var4 >= field1027) {
				var5 = field4223[Statics.field402[var4 - field1027]];
			} else {
				var5 = field4491[field3428[var4]];
			}
			if (var5 != null && var5.method287()) {
				if (var5 instanceof ClientNpc) {
					NpcType var6 = ((ClientNpc) var5).field3682;
					if (var6.field2327 != null) {
						var6 = var6.method862();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (var4 >= field1027) {
					NpcType var12 = ((ClientNpc) var5).field3682;
					if (var12.field2327 != null) {
						var12 = var12.method862();
					}
					if (var12.field2326 >= 0 && field2428.length > var12.field2326) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (field401 > -1) {
							field2428[var12.field2326].method1155(field401 + arg0 - 12, field541 + -30 + arg1);
						}
					}
					HintArrow[] var13 = Statics.field1171;
					for (int var14 = 0; var14 < var13.length; var14++) {
						HintArrow var15 = var13[var14];
						if (var15 != null && var15.field2139 == 1 && var15.field2146 == Statics.field402[var4 - field1027] && field2113 % 20 < 10) {
							method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
							if (field401 > -1) {
								field3543[var15.field2137].method1155(field401 + arg0 - 12, field541 + arg1 - 28);
							}
						}
					}
				} else {
					int var7 = 30;
					ClientPlayer var8 = (ClientPlayer) var5;
					if (var8.field756 != -1 || var8.field750 != -1) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (field401 > -1) {
							if (var8.field756 != -1) {
								field4425[var8.field756].method1155(field401 + arg0 - 12, field541 + -30 + arg1);
								var7 += 25;
							}
							if (var8.field750 != -1) {
								field2428[var8.field750].method1155(arg0 + field401 - 12, arg1 - -field541 + -var7);
								var7 += 25;
							}
						}
					}
					if (var4 >= 0) {
						HintArrow[] var9 = Statics.field1171;
						for (int var10 = 0; var10 < var9.length; var10++) {
							HintArrow var11 = var9[var10];
							if (var11 != null && var11.field2139 == 10 && field3428[var4] == var11.field2146) {
								method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
								if (field401 > -1) {
									field3543[var11.field2137].method1155(arg0 + field401 - 12, arg1 - (-field541 + var7));
								}
							}
						}
					}
				}
				if (var5.field4071 != null && (field1027 <= var4 || Statics.field1206 == 0 || Statics.field1206 == 3 || Statics.field1206 == 1 && ScriptRunner.method901(((ClientPlayer) var5).field766))) {
					method1027(arg3 >> 1, arg2 >> 1, var5.method1475(), var5);
					if (field401 > -1 && Statics.field3925 > Statics.field1918) {
						Statics.field3931[Statics.field1918] = field1011.method158(var5.field4071) / 2;
						Statics.field3929[Statics.field1918] = field1011.ascent;
						Statics.field3938[Statics.field1918] = field401;
						Statics.field3940[Statics.field1918] = field541;
						Statics.field3937[Statics.field1918] = var5.field4083;
						Statics.field3932[Statics.field1918] = var5.field4138;
						Statics.field3926[Statics.field1918] = var5.field4112;
						Statics.field3933[Statics.field1918] = var5.field4071;
						Statics.field1918++;
					}
				}
				if (var5.field4118 > field2113) {
					method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
					if (field401 > -1) {
						Pix2D.method478(arg0 + field401 - 15, field541 + -3 + arg1, var5.field4109, 5, 65280);
						Pix2D.method478(var5.field4109 + arg0 + field401 - 15, arg1 + -3 + field541, 30 - var5.field4109, 5, 16711680);
					}
				}
				for (int var16 = 0; var16 < 4; var16++) {
					if (field2113 < var5.field4073[var16]) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() / 2, var5);
						if (field401 > -1) {
							if (var16 == 1) {
								field541 -= 20;
							}
							if (var16 == 2) {
								field541 -= 10;
								field401 -= 15;
							}
							if (var16 == 3) {
								field541 -= 10;
								field401 += 15;
							}
							field2718[var5.field4078[var16]].method1155(arg0 + field401 - 12, arg1 + -12 + field541);
							field917.method141(JagString.method1212(var5.field4131[var16]), arg0 + field401 - 1, field541 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var17 = 0; var17 < Statics.field1918; var17++) {
			int var18 = Statics.field3938[var17];
			int var19 = Statics.field3940[var17];
			int var20 = Statics.field3931[var17];
			boolean var21 = true;
			int var22 = Statics.field3929[var17];
			while (var21) {
				var21 = false;
				for (int var23 = 0; var23 < var17; var23++) {
					if (Statics.field3940[var23] - Statics.field3929[var23] < var19 + 2 && var19 - var22 < Statics.field3940[var23] + 2 && var18 - var20 < Statics.field3938[var23] - -Statics.field3931[var23] && Statics.field3938[var23] - Statics.field3931[var23] < var20 + var18 && var19 > Statics.field3940[var23] - Statics.field3929[var23]) {
						var19 = Statics.field3940[var23] - Statics.field3929[var23];
						var21 = true;
					}
				}
			}
			field401 = Statics.field3938[var17];
			field541 = Statics.field3940[var17] = var19;
			JagString var24 = Statics.field3933[var17];
			if (field2548 == 0) {
				int var25 = 16776960;
				if (Statics.field3937[var17] < 6) {
					var25 = Statics.field3812[Statics.field3937[var17]];
				}
				if (Statics.field3937[var17] == 6) {
					var25 = Statics.field3990 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Statics.field3937[var17] == 7) {
					var25 = Statics.field3990 % 20 >= 10 ? 65535 : 255;
				}
				if (Statics.field3937[var17] == 8) {
					var25 = Statics.field3990 % 20 < 10 ? 45056 : 8454016;
				}
				if (Statics.field3937[var17] == 9) {
					int var26 = 150 - Statics.field3926[var17];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16384000 + 16776960 - var26 * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}
				if (Statics.field3937[var17] == 10) {
					int var27 = 150 - Statics.field3926[var17];
					if (var27 < 50) {
						var25 = var27 * 5 + 16711680;
					} else if (var27 < 100) {
						var25 = 16711935 - (var27 - 50) * 327680;
					} else if (var27 < 150) {
						var25 = var27 * 327680 + 500 + 255 - var27 * 5 - 32768000;
					}
				}
				if (Statics.field3937[var17] == 11) {
					int var28 = 150 - Statics.field3926[var17];
					if (var28 < 50) {
						var25 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var25 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var25 = 16777215 - (var28 - 100) * 327680;
					}
				}
				if (Statics.field3932[var17] == 0) {
					field1011.method141(var24, arg0 + field401, field541 + arg1, var25, 0);
				}
				if (Statics.field3932[var17] == 1) {
					field1011.method144(var24, field401 + arg0, field541 + arg1, var25, Statics.field3990);
				}
				if (Statics.field3932[var17] == 2) {
					field1011.method145(var24, arg0 + field401, arg1 - -field541, var25, Statics.field3990);
				}
				if (Statics.field3932[var17] == 3) {
					field1011.method164(var24, field401 + arg0, arg1 + field541, var25, Statics.field3990, 150 - Statics.field3926[var17]);
				}
				if (Statics.field3932[var17] == 4) {
					int var29 = (150 - Statics.field3926[var17]) * (field1011.method158(var24) + 100) / 150;
					Pix2D.method493(arg0 + field401 - 50, arg1, arg0 + field401 + 50, arg1 + arg2);
					field1011.method154(var24, arg0 + field401 + 50 - var29, arg1 - -field541, var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (Statics.field3932[var17] == 5) {
					int var30 = 0;
					int var31 = 150 - Statics.field3926[var17];
					if (var31 < 25) {
						var30 = var31 - 25;
					} else if (var31 > 125) {
						var30 = var31 - 125;
					}
					Pix2D.method493(arg0, field541 + arg1 - field1011.ascent - 1, arg3 + arg0, field541 + arg1 + 5);
					field1011.method141(var24, arg0 + field401, arg1 + (field541 - -var30), var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				field1011.method141(var24, arg0 + field401, arg1 + field541, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("mh.a(IIIILdj;)V")
	public static void method922(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (arg3 == localPlayer || field3862 >= 400) {
			return;
		}
		JagString var4;
		if (arg3.field749 == 0) {
			var4 = JagString.join(new JagString[] { arg3.field766, method1152(arg3.field747, localPlayer.field747), Statics.field1238, Text.field2717, JagString.method1212(arg3.field747), Statics.field1879});
		} else {
			var4 = JagString.join(new JagString[] { arg3.field766, Statics.field1238, Text.field2637, JagString.method1212(arg3.field749), Statics.field1879});
		}
		if (field475 == 1) {
			method685(arg1, Text.field608, (short) 31, (long) arg0, JagString.join(new JagString[] {field1414, Statics.field914, var4 }), arg2);
		} else if (!Statics.field145) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (Statics.field2436[var5] != null) {
					short var6 = 0;
					if (game == 0 && Statics.field2436[var5].method624(Text.field3041)) {
						if (arg3.field747 > localPlayer.field747) {
							var6 = 2000;
						}
						if (localPlayer.field752 != 0 && arg3.field752 != 0) {
							if (arg3.field752 == localPlayer.field752) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (Statics.field3875[var5]) {
						var6 = 2000;
					}
					short var7 = Statics.field390[var5];
					short var8 = (short) (var7 + var6);
					method685(arg1, Statics.field2436[var5], var8, (long) arg0, JagString.join(new JagString[] {Statics.field1637, var4 }), arg2);
				}
			}
		} else if ((Statics.field2084 & 0x8) == 8) {
			method685(arg1, Statics.field3835, (short) 23, (long) arg0, JagString.join(new JagString[] {Statics.field464, Statics.field914, var4 }), arg2);
		}
		for (int var9 = 0; var9 < field3862; var9++) {
			if (field994[var9] == 10) {
				field3836[var9] = JagString.join(new JagString[] {Statics.field1637, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("bf.a(Lu;Z)V")
	public static void method86(ClientEntity arg0) {
		if (arg0.field4102 == 0) {
			return;
		}
		if (arg0.field4114 != -1 && arg0.field4114 < 32768) {
			ClientNpc var1 = field4223[arg0.field4114];
			if (var1 != null) {
				int var2 = arg0.field4121 - var1.field4121;
				int var3 = arg0.field4136 - var1.field4136;
				if (var3 != 0 || var2 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var3, (double) var2) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field4114 >= 32768) {
			int var4 = arg0.field4114 - 32768;
			if (var4 == selfSlot) {
				var4 = 2047;
			}
			ClientPlayer var5 = field4491[var4];
			if (var5 != null) {
				int var6 = arg0.field4136 - var5.field4136;
				int var7 = arg0.field4121 - var5.field4121;
				if (var6 != 0 || var7 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field4096 != 0 || arg0.field4099 != 0) && (arg0.field4135 == 0 || arg0.field4108 > 0)) {
			int var8 = arg0.field4103 * 64 + arg0.field4121 - (-field3679 + arg0.field4099 + -field3679) * 64 - 64;
			int var9 = arg0.field4136 + (arg0.field4103 - 1) * 64 - (arg0.field4096 - field4212 - field4212) * 64;
			if (var9 != 0 || var8 != 0) {
				arg0.field4119 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
			}
			arg0.field4099 = 0;
			arg0.field4096 = 0;
		}
		int var10 = arg0.field4119 - arg0.field4085 & 0x7FF;
		if (var10 == 0) {
			arg0.field4089 = 0;
			return;
		}
		arg0.field4089++;
		if (var10 > 1024) {
			arg0.field4085 -= arg0.field4102;
			boolean var11 = true;
			if (var10 < arg0.field4102 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var11 = false;
			}
			if (arg0.field4105 == arg0.field4106 && (arg0.field4089 > 25 || var11)) {
				if (arg0.field4091 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4091;
				}
			}
		} else {
			arg0.field4085 += arg0.field4102;
			boolean var12 = true;
			if (arg0.field4102 > var10 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var12 = false;
			}
			if (arg0.field4106 == arg0.field4105 && (arg0.field4089 > 25 || var12)) {
				if (arg0.field4128 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4128;
				}
			}
		}
		arg0.field4085 &= 0x7FF;
	}

	@ObfuscatedName("client.h(I)V")
	public void method213() {
		if (Js5Net.field2938 >= 4) {
			this.error("js5crc");
			state = 1000;
			return;
		}
		if (Js5Net.field1389 >= 4) {
			if (state <= 5) {
				this.error("js5io");
				state = 1000;
				return;
			}
			Js5Net.field1389 = 3;
			js5ConnectCooldown = 3000;
		}
		if (js5ConnectCooldown-- > 0) {
			return;
		}
		try {
			if (js5ConnectState == 0) {
				field1151 = GameShell.signlink.socketreq(field1760, loginPort);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (field1151.status == 2) {
					this.js5error(-1);
					return;
				}
				if (field1151.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				field3680 = new ClientStream((Socket) field1151.field3129, GameShell.signlink);
				Packet var1 = new Packet(5);
				var1.p1(15);
				var1.p4(500);
				field3680.write(5, var1.data);
				js5ConnectState++;
				field1840 = MonotonicTime.currentTime();
			}
			if (js5ConnectState == 3) {
				if (state <= 5 || field3680.available() > 0) {
					int var2 = field3680.read();
					if (var2 != 0) {
						this.js5error(var2);
						return;
					}
					js5ConnectState++;
				} else if (MonotonicTime.currentTime() - field1840 > 30000L) {
					this.js5error(-2);
					return;
				}
			}
			if (js5ConnectState == 4) {
				Js5Net.method529(state > 20, field3680);
				js5ConnectState = 0;
				js5Errors = 0;
				field1151 = null;
				field3680 = null;
			}
		} catch (IOException var3) {
			this.js5error(-3);
		}
	}

	@ObfuscatedName("client.b(I)V")
	@Override
	public void method214() {
		Statics.field2108 = Statics.field2192 = Statics.field108 = ObjType.field1968 = new short[256];
		if (game == 1) {
			field96 = Statics.field1810;
			field1596 = Statics.field3850;
			field2750 = Statics.field1265;
			field219 = Statics.field3853;
		} else {
			field219 = Statics.field3955;
			field2750 = Statics.field1601;
			field96 = Statics.field4062;
			field1596 = Statics.field2611;
		}
		loginGamePort = modewhere == 0 ? 43594 : worldid + 40000;
		loginJs5Port = modewhere == 0 ? 443 : worldid + 50000;
		loginPort = loginGamePort;
		ClientKeyboardListener.method1401();
		ClientKeyboardListener.method935(GameShell.canvas);
		ClientMouseListener.method748(GameShell.canvas);
		mouseWheel = MouseWheelInterface.method235();
		if (mouseWheel != null) {
			mouseWheel.method173(GameShell.canvas);
		}
		Statics.field941 = SignLink.field3579;
		try {
			if (GameShell.signlink.field3590 != null) {
				GameShell.field299 = new BufferedRandomAccessFile(GameShell.signlink.field3590, 5200, 0);
				for (int var1 = 0; var1 < 27; var1++) {
					GameShell.field4504[var1] = new BufferedRandomAccessFile(GameShell.signlink.field3584[var1], 6000, 0);
				}
				GameShell.field1892 = new BufferedRandomAccessFile(GameShell.signlink.field3582, 6000, 0);
				field3223 = new DataFile(255, GameShell.field299, GameShell.field1892, 500000);
				GameShell.field3529 = new BufferedRandomAccessFile(GameShell.signlink.field3588, 24, 0);
				GameShell.signlink.field3584 = null;
				GameShell.signlink.field3582 = null;
				GameShell.signlink.field3588 = null;
				GameShell.signlink.field3590 = null;
			}
		} catch (IOException var2) {
			GameShell.field1892 = null;
			GameShell.field299 = null;
			GameShell.field3529 = null;
			field3223 = null;
		}
		Statics.field2752 = Text.field2466;
		if (modewhere != 0) {
			field2768 = true;
		}
	}

	@Override
	public void init() {
		if (!this.method590()) {
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
		String var4 = this.getParameter("game");
		if (var4 != null && var4.equals("1")) {
			game = 1;
		} else {
			game = 0;
		}
		try {
			js = Integer.parseInt(this.getParameter("js"));
			plug = Integer.parseInt(this.getParameter("plug"));
			affid = Integer.parseInt(this.getParameter("affid"));
		} catch (Exception var5) {
		}
		Statics.field4134 = Statics.field1994.method608(this);
		if (Statics.field4134 == null) {
			Statics.field4134 = field3453;
		}
		field1760 = this.getCodeBase().getHost();
		this.method593(modewhat + 32);
	}

	@ObfuscatedName("client.b(II)V")
	public void js5error(int arg0) {
		field1151 = null;
		js5ConnectState = 0;
		field3680 = null;
		js5Errors++;
		if (loginPort == loginGamePort) {
			loginPort = loginJs5Port;
		} else {
			loginPort = loginGamePort;
		}
		if (js5Errors >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (state > 5) {
				js5ConnectCooldown = 3000;
			} else {
				this.error("js5connect_full");
				state = 1000;
			}
		} else if (js5Errors >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			state = 1000;
		} else if (js5Errors >= 4) {
			if (state <= 5) {
				this.error("js5connect");
				state = 1000;
			} else {
				js5ConnectCooldown = 3000;
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void mainquit() {
		if (field4143 != null) {
			field4143.field717 = false;
		}
		field4143 = null;
		if (stream != null) {
			stream.close();
			stream = null;
		}
		ClientKeyboardListener.removeListeners(GameShell.canvas);
		ClientMouseListener.removeListeners(GameShell.canvas);
		if (mouseWheel != null) {
			mouseWheel.removeListeners(GameShell.canvas);
		}
		ClientKeyboardListener.method975();
		ClientMouseListener.method362();
		mouseWheel = null;
		if (midiPlayer != null) {
			midiPlayer.shutdown();
		}
		if (synthPlayer != null) {
			synthPlayer.shutdown();
		}
		Js5Net.method290();
		Js5NetThread.shutdown();
		try {
			if (GameShell.field299 != null) {
				GameShell.field299.method817();
			}
			if (GameShell.field4504 != null) {
				for (int var1 = 0; var1 < GameShell.field4504.length; var1++) {
					if (GameShell.field4504[var1] != null) {
						GameShell.field4504[var1].method817();
					}
				}
			}
			if (GameShell.field1892 != null) {
				GameShell.field1892.method817();
			}
			if (GameShell.field3529 != null) {
				GameShell.field3529.method817();
			}
		} catch (IOException var2) {
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void mainLoad() {
		if (loadingStep == 0) {
			Runtime var1 = Runtime.getRuntime();
			int var2 = (int) ((var1.totalMemory() - var1.freeMemory()) / 1024L);
			long var3 = MonotonicTime.currentTime();
			if (Statics.field10 == 0L) {
				Statics.field10 = var3;
			}
			if (var2 > 16384 && var3 - Statics.field10 < 5000L) {
				if (var3 - Statics.field3519 > 1000L) {
					System.gc();
					Statics.field3519 = var3;
				}
				TitleScreen.loadPos = 5;
				TitleScreen.loadString = Text.field1093;
			} else {
				loadingStep = 10;
				TitleScreen.loadPos = 5;
				TitleScreen.loadString = Text.field3549;
			}
		} else if (loadingStep == 10) {
			World.method1277();
			for (int var5 = 0; var5 < 4; var5++) {
				collision[var5] = new CollisionMap(104, 104);
			}
			TitleScreen.loadPos = 10;
			TitleScreen.loadString = Text.field144;
			loadingStep = 30;
		} else if (loadingStep == 30) {
			anims = openJs5(0, true, true, false);
			bases = openJs5(1, true, true, false);
			configs = openJs5(2, true, false, true);
			interfaces = openJs5(3, true, true, false);
			jagFX = openJs5(4, true, true, false);
			maps = openJs5(5, true, true, true);
			songs = openJs5(6, false, true, true);
			models = openJs5(7, true, true, false);
			sprites = openJs5(8, true, true, false);
			textures = openJs5(9, true, true, false);
			binary = openJs5(10, true, true, false);
			jingles = openJs5(11, true, true, false);
			scripts = openJs5(12, true, true, false);
			fontmetrics = openJs5(13, true, true, false);
			vorbis = openJs5(14, false, true, false);
			patches = openJs5(15, true, true, false);
			configLoc = openJs5(16, true, true, false);
			configEnum = openJs5(17, true, true, false);
			configNpc = openJs5(18, true, true, false);
			configObj = openJs5(19, true, true, false);
			configSeq = openJs5(20, true, true, false);
			configSpot = openJs5(21, true, true, false);
			configVarbit = openJs5(22, true, true, false);
			worldmap = openJs5(23, true, true, true);
			quickchat = openJs5(24, true, true, false);
			quickchatGlobal = openJs5(25, true, true, false);
			materials = openJs5(26, true, true, true);
			loadingStep = 40;
			TitleScreen.loadPos = 15;
			TitleScreen.loadString = Text.field1251;
		} else if (loadingStep == 40) {
			int var6 = anims.getIndexPercentage() * 4 / 100;
			int var7 = var6 + bases.getIndexPercentage() * 4 / 100;
			int var8 = var7 + configs.getIndexPercentage() / 100;
			int var9 = var8 + interfaces.getIndexPercentage() * 2 / 100;
			int var10 = var9 + jagFX.getIndexPercentage() * 6 / 100;
			int var11 = var10 + maps.getIndexPercentage() * 4 / 100;
			int var12 = var11 + songs.getIndexPercentage() * 2 / 100;
			int var13 = var12 + models.getIndexPercentage() * 50 / 100;
			int var14 = var13 + sprites.getIndexPercentage() * 2 / 100;
			int var15 = var14 + textures.getIndexPercentage() * 2 / 100;
			int var16 = var15 + binary.getIndexPercentage() * 2 / 100;
			int var17 = var16 + jingles.getIndexPercentage() * 2 / 100;
			int var18 = var17 + scripts.getIndexPercentage() * 2 / 100;
			int var19 = var18 + fontmetrics.getIndexPercentage() * 2 / 100;
			int var20 = var19 + vorbis.getIndexPercentage() * 2 / 100;
			int var21 = var20 + patches.getIndexPercentage() * 2 / 100;
			int var22 = var21 + configLoc.getIndexPercentage() / 100;
			int var23 = var22 + configEnum.getIndexPercentage() / 100;
			int var24 = var23 + configNpc.getIndexPercentage() / 100;
			int var25 = var24 + configObj.getIndexPercentage() / 100;
			int var26 = var25 + configSeq.getIndexPercentage() / 100;
			int var27 = var26 + configSpot.getIndexPercentage() / 100;
			int var28 = var27 + configVarbit.getIndexPercentage() / 100;
			int var29 = var28 + worldmap.getIndexPercentage() / 100;
			int var30 = var29 + quickchat.getIndexPercentage() / 100;
			int var31 = var30 + quickchatGlobal.getIndexPercentage() / 100;
			int var32 = var31 + materials.getIndexPercentage() / 100;
			if (var32 == 100) {
				TitleScreen.loadPos = 20;
				TitleScreen.loadString = Text.field4515;
				Statics.method1038(songs, binary, sprites);
				loadingStep = 45;
			} else {
				if (var32 != 0) {
					TitleScreen.loadString = JagString.join(new JagString[] { Text.field212, JagString.method1212(var32), field2895 });
				}
				TitleScreen.loadPos = 20;
			}
		} else if (loadingStep == 45) {
			PcmPlayer.init(!lowMem);
			MidiPlayer var33 = new MidiPlayer();
			var33.setChannelDefaultPatch();
			midiPlayer = PcmPlayer.getPlayer(0, GameShell.canvas, GameShell.signlink, 22050);
			midiPlayer.playStream(var33);
			MidiManager.init(vorbis, var33, jagFX, patches);
			synthPlayer = PcmPlayer.getPlayer(1, GameShell.canvas, GameShell.signlink, 2048);
			mixer = new Mixer();
			synthPlayer.playStream(mixer);
			decimator = new Decimator(22050, PcmPlayer.frequency);
			loadingStep = 50;
			TitleScreen.loadString = Text.field507;
			TitleScreen.loadPos = 30;
		} else if (loadingStep == 50) {
			int var34 = 0;
			if (sprites.method944(Statics.field3795)) {
				var34++;
			}
			if (sprites.method944(Statics.field3045)) {
				var34++;
			}
			if (sprites.method944(Statics.field1957)) {
				var34++;
			}
			if (fontmetrics.method944(Statics.field3795)) {
				var34++;
			}
			if (fontmetrics.method944(Statics.field3045)) {
				var34++;
			}
			if (fontmetrics.method944(Statics.field1957)) {
				var34++;
			}
			if (var34 < 6) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field2076, JagString.method1212(var34 * 100 / 6), field2895 });
				TitleScreen.loadPos = 35;
			} else {
				TitleScreen.loadPos = 35;
				loadingStep = 60;
				TitleScreen.loadString = Text.field2986;
			}
		} else if (loadingStep == 60) {
			int var35 = Statics.method330(binary, sprites);
			int var36 = TextureOp37.method717();
			if (var35 < var36) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field817, JagString.method1212(var35 * 100 / var36), field2895 });
				TitleScreen.loadPos = 40;
			} else {
				TitleScreen.loadPos = 40;
				TitleScreen.loadString = Text.field1812;
				loadingStep = 65;
			}
		} else if (loadingStep == 65) {
			field917 = PixLoader.method429(fontmetrics, sprites, field3453, Statics.field3795);
			field2966 = (SoftwarePixFont) field917;
			field30 = PixLoader.method429(fontmetrics, sprites, field3453, Statics.field3045);
			field1011 = PixLoader.method429(fontmetrics, sprites, field3453, Statics.field1957);
			TitleScreen.loadPos = 45;
			TitleScreen.loadString = Text.field24;
			setMainState(5);
			loadingStep = 70;
		} else if (loadingStep == 70) {
			configs.method962();
			int var37 = configs.method950();
			configLoc.method962();
			int var38 = var37 + configLoc.method950();
			configEnum.method962();
			int var39 = var38 + configEnum.method950();
			configNpc.method962();
			int var40 = var39 + configNpc.method950();
			configObj.method962();
			int var41 = var40 + configObj.method950();
			configSeq.method962();
			int var42 = var41 + configSeq.method950();
			configSpot.method962();
			int var43 = var42 + configSpot.method950();
			configVarbit.method962();
			int var44 = var43 + configVarbit.method950();
			quickchat.method962();
			int var45 = var44 + quickchat.method950();
			quickchatGlobal.method962();
			int var46 = var45 + quickchatGlobal.method950();
			if (var46 < 1000) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field918, JagString.method1212(var46 / 10), field2895 });
				TitleScreen.loadPos = 50;
			} else {
				ParamType.init(configs);
				FloType.init(configs);
				FluType.init(configs);
				IdkType.init(models, configs);
				LocType.init(configLoc, models, memServer, lowMem);
				NpcType.init(configNpc, models);
				ObjType.init(memServer, configObj, field2966, models);
				StructType.init(configs);
				SeqType.init(configSeq, anims, bases);
				SpotType.init(models, configSpot);
				VarBitType.init(configVarbit);
				VarpType.init(configs);
				IfType.init(sprites, interfaces, fontmetrics, models);
				InvType.init(configs);
				EnumType.init(configEnum);
				QuickChatPhraseType.init(quickchatGlobal, new ClientDynamicProvider(), quickchat);
				QuickChatCatTypeList.init(quickchat, quickchatGlobal);
				TitleScreen.loadString = Text.field4040;
				TitleScreen.loadPos = 50;
				Statics.method1416();
				loadingStep = 80;
			}
		} else if (loadingStep == 80) {
			int var47 = 0;
			if (field887 == null) {
				SoftwarePix32 var48 = PixLoader.method49(Statics.field1106, sprites, field3453);
				if (var48 != null) {
					var48.method1178();
					field887 = var48;
				}
			} else {
				var47++;
			}
			if (field4460 == null) {
				field4460 = PixLoader.method981(Statics.field260, field3453, sprites);
			} else {
				var47++;
			}
			if (field505 == null) {
				field505 = PixLoader.method15(Statics.field7, field3453, sprites);
			} else {
				var47++;
			}
			if (field2718 == null) {
				field2718 = PixLoader.method1582(Statics.field2664, sprites, field3453);
			} else {
				var47++;
			}
			if (field4425 == null) {
				field4425 = PixLoader.method1582(Statics.field1796, sprites, field3453);
			} else {
				var47++;
			}
			if (field2428 == null) {
				field2428 = PixLoader.method1582(Statics.field1921, sprites, field3453);
			} else {
				var47++;
			}
			if (field3543 == null) {
				field3543 = PixLoader.method1582(Statics.field4367, sprites, field3453);
			} else {
				var47++;
			}
			if (field4257 == null) {
				field4257 = PixLoader.method1582(Statics.field2622, sprites, field3453);
			} else {
				var47++;
			}
			if (field2041 == null) {
				SoftwarePix32[] var49 = PixLoader.method15(Statics.field690, field3453, sprites);
				if (var49 != null) {
					for (int var50 = 0; var50 < var49.length; var50++) {
						var49[var50].method1178();
					}
					field2041 = var49;
				}
			} else {
				var47++;
			}
			if (field3826 == null) {
				field3826 = PixLoader.method1490(Statics.field4411, field3453, sprites);
			} else {
				var47++;
			}
			if (field2982 == null) {
				field2982 = PixLoader.method1582(Statics.field4251, sprites, field3453);
			} else {
				var47++;
			}
			if (field597 == null) {
				field597 = PixLoader.method1582(Statics.field2075, sprites, field3453);
			} else {
				var47++;
			}
			if (field106 == null) {
				field106 = PixLoader.method2(Statics.field2621, sprites, field3453);
			} else {
				var47++;
			}
			if (field587 == null) {
				field587 = PixLoader.method2(Statics.field4459, sprites, field3453);
			} else {
				var47++;
			}
			var47++;
			if (var47 < 15) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field2939, JagString.method1212(var47 * 100 / 15), field2895 });
				TitleScreen.loadPos = 60;
			} else {
				int var51 = (int) (Math.random() * 21.0D) - 10;
				int var52 = (int) (Math.random() * 21.0D) - 10;
				int var53 = (int) (Math.random() * 21.0D) - 10;
				field917.method149(field587, null);
				field30.method149(field587, null);
				int var54 = (int) (Math.random() * 41.0D) - 20;
				field1011.method149(field587, null);
				for (int var55 = 0; var55 < field505.length; var55++) {
					field505[var55].method1158(var54 + var51, var54 + var53, var54 + var52);
				}
				field4460[0].method1336(var51 + var54, var54 + var53, var54 + var52);
				TitleScreen.loadPos = 60;
				loadingStep = 90;
				field4525 = field505;
				TitleScreen.loadString = Text.field2633;
			}
		} else if (loadingStep == 90) {
			if (materials.method962()) {
				TextureManager var56 = new TextureManager(textures, materials, sprites, 20, lowMem);
				Pix3D.method1236(var56);
				Pix3D.method1224(0.7F);
				TitleScreen.loadString = Text.field2569;
				loadingStep = 110;
				TitleScreen.loadPos = 70;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field4295, JagString.method1212(materials.method950()), field2895 });
				TitleScreen.loadPos = 70;
			}
		} else if (loadingStep == 110) {
			field4143 = new MouseTracking();
			GameShell.signlink.threadreq(field4143, 10);
			TitleScreen.loadString = Text.field3829;
			TitleScreen.loadPos = 75;
			loadingStep = 120;
		} else if (loadingStep == 120) {
			if (binary.method946(Statics.field2973, field3453)) {
				Huffman var57 = new Huffman(binary.method960(Statics.field2973, field3453));
				WordPack.method69(var57);
				loadingStep = 130;
				TitleScreen.loadString = Text.field1547;
				TitleScreen.loadPos = 80;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field4007, Statics.field3814 });
				TitleScreen.loadPos = 80;
			}
		} else if (loadingStep == 130) {
			if (!interfaces.method962()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1322, JagString.method1212(interfaces.method950() * 4 / 5), field2895 });
				TitleScreen.loadPos = 85;
			} else if (!scripts.method962()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1322, JagString.method1212(scripts.method950() / 6 + 80), field2895 });
				TitleScreen.loadPos = 85;
			} else if (fontmetrics.method962()) {
				TitleScreen.loadPos = 100;
				loadingStep = 140;
				TitleScreen.loadString = Text.field392;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.field1322, JagString.method1212(fontmetrics.method950() / 20 + 96), field2895 });
				TitleScreen.loadPos = 85;
			}
		} else if (loadingStep == 140) {
			maps.method965(false);
			songs.method965(true);
			sprites.method965(true);
			fontmetrics.method965(true);
			binary.method965(true);
			interfaces.method965(true);
			setMainState(10);
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void mainredraw() {
		boolean var1 = false;
		boolean var2 = MidiManager.updateLoading();
		if (var2 && field2012 && midiPlayer != null) {
			midiPlayer.method401();
		}
		if (GameShell.field971) {
			var1 = true;
			GameShell.field971 = false;
		}
		if (state == 0) {
			GameShell.drawProgress(null, TitleScreen.loadString, var1, TitleScreen.loadPos);
		} else if (state == 5 || state == 10 || state == 20) {
			TitleScreen.draw(field917, field1011);
		} else if (state == 25) {
			if (field3861 == 1) {
				if (field3754 > field2751) {
					field2751 = field3754;
				}
				int var4 = (field2751 - field3754) * 50 / field2751;
				messageBox(JagString.join(new JagString[] { Text.field4478, Statics.field509, JagString.method1212(var4), Statics.field216 }), false);
			} else if (field3861 == 2) {
				if (field2045 > field2652) {
					field2652 = field2045;
				}
				int var3 = (field2652 - field2045) * 50 / field2652 + 50;
				messageBox(JagString.join(new JagString[] { Text.field4478, Statics.field509, JagString.method1212(var3), Statics.field216 }), false);
			} else {
				messageBox(Text.field4478, false);
			}
		} else if (state == 30) {
			gameDraw();
		} else if (state == 40) {
			messageBox(JagString.join(new JagString[] { Text.field2040, Statics.field2618, Text.field1838 }), false);
		}
		Canvas var5 = GameShell.canvas;
		if (state == 30 && field2503 == 0 && !var1) {
			try {
				Graphics var8 = var5.getGraphics();
				for (int var9 = 0; var9 < field3923; var9++) {
					if (field4005[var9]) {
						GameShell.field3852.draw(field1447[var9], field2485[var9], field2471[var9], field1455[var9], var8);
						field4005[var9] = false;
					}
				}
			} catch (Exception var10) {
				var5.repaint();
			}
		} else if (state > 0) {
			try {
				Graphics var6 = var5.getGraphics();
				GameShell.field3852.method246(var6);
				for (int var7 = 0; var7 < field3923; var7++) {
					field4005[var7] = false;
				}
			} catch (Exception var11) {
				var5.repaint();
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	@Override
	public void mainloop() {
		field2113++;
		if (field2113 % 1000 == 1) {
			GregorianCalendar var1 = new GregorianCalendar();
			Statics.field454 = var1.get(11) * 600 + var1.get(12) * 10 + var1.get(13) / 6;
			Statics.field1259.setSeed((long) Statics.field454);
		}
		this.method223();
		Js5NetThread.method293();
		MidiManager.method107();
		doAudio();
		ClientKeyboardListener.method366();
		ClientMouseListener.method1397();
		if (mouseWheel != null) {
			int var2 = mouseWheel.method176();
			field1708 = var2;
		}
		if (state == 0) {
			this.mainLoad();
			doneslowupdate();
		} else if (state == 5) {
			TitleScreen.loop(this);
			this.mainLoad();
			doneslowupdate();
		} else if (state == 10) {
			TitleScreen.loop(this);
		} else if (state == 20) {
			TitleScreen.loop(this);
			loginPoll();
		} else if (state == 25) {
			mapBuildLoop();
		}
		if (state == 30) {
			gameLoop();
		} else if (state == 40) {
			loginPoll();
			return;
		}
	}

	@ObfuscatedName("client.a(Z)V")
	public void method223() {
		if (state != 1000) {
			boolean var1 = Js5Net.method687();
			if (!var1) {
				this.method213();
			}
		}
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void method225() {
	}
}
