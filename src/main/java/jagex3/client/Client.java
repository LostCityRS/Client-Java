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
	public static final int SCROLLBAR_GRIP_FOREGROUND = 5063219;
	@ObfuscatedName("ud.Z")
	public static final int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;
	@ObfuscatedName("pe.r")
	public static final int SCROLLBAR_GRIP_LOWLIGHT = 3353893;
	@ObfuscatedName("qa.c")
	public static final int SCROLLBAR_TRACK = 2301979;
	@ObfuscatedName("nd.e")
	public static final boolean showOpIndex = false;
	@ObfuscatedName("nb.K")
	public static final int tooltipRedraw = 50;
	@ObfuscatedName("client.gb")
	public static PixFontGeneric p11;

	@ObfuscatedName("client.R")
	public static int hintOffsetZ = 0;

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
	public static int componentRectDebug = 0;
	@ObfuscatedName("le.s")
	public static boolean[] componentBlitArea = new boolean[100];
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
	public static int noTimeoutTimer = 0;
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
	public static Pix32[] hitmarks;
	@ObfuscatedName("ea.O")
	public static Pix32[] headiconsPk;
	@ObfuscatedName("ba.j")
	public static Pix32[] headiconsPrayer;
	@ObfuscatedName("sf.k")
	public static Pix32[] headiconsHint;
	@ObfuscatedName("o.Db")
	public static Pix32[] mapmarker;
	@ObfuscatedName("a.b")
	public static Pix32[] cross;
	@ObfuscatedName("df.k")
	public static Pix32[] mapdots;
	@ObfuscatedName("oa.z")
	public static Pix8[] scrollbar;
	@ObfuscatedName("t.q")
	public static Pix8[] modicons;
	@ObfuscatedName("ce.f")
	public static Pix8 mapback;
	@ObfuscatedName("oc.c")
	public static int[][] dirMap = new int[104][104];
	@ObfuscatedName("hd.Eb")
	public static int[][] distMap = new int[104][104];
	@ObfuscatedName("jf.k")
	public static int[] routeX = new int[4000];
	@ObfuscatedName("kf.e")
	public static int[] routeZ = new int[4000];
	@ObfuscatedName("da.K")
	public static boolean scrollGrabbed = false;
	@ObfuscatedName("kc.r")
	public static int scrollInputPadding = 0;
	@ObfuscatedName("wf.o")
	public static World world;
	@ObfuscatedName("cb.hb")
	public static int[] field347 = new int[100];
	@ObfuscatedName("bf.s")
	public static JagString[] field245 = new JagString[100];
	@ObfuscatedName("f.kc")
	public static JagString[] chatText = new JagString[100];
	@ObfuscatedName("q.Wc")
	public static JagString[] field2610 = new JagString[100];
	@ObfuscatedName("c.Pb")
	public static int chatTransmitNum = 0;
	@ObfuscatedName("da.S")
	public static int chatHistoryLength = 0;
	@ObfuscatedName("qd.xc")
	public static int transmitNum = 1;
	@ObfuscatedName("we.e")
	public static PacketBit in = new PacketBit(5000);
	@ObfuscatedName("ce.j")
	public static ClientPlayer localPlayer;
	@ObfuscatedName("pa.b")
	public static CollisionMap[] collision = new CollisionMap[4];
	@ObfuscatedName("uc.B")
	public static Pix32 minimap;
	@ObfuscatedName("u.H")
	public static PacketBit field3202 = new PacketBit(5000);
	@ObfuscatedName("ed.o")
	public static long[] field694 = new long[200];
	@ObfuscatedName("la.t")
	public static JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("la.r")
	public static JagString ACTIVE_LANG = AUTO_EMPTY;
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
	public static Packet[] playerAppearanceBuffer = new Packet[2048];
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
	public static boolean mouseTracked = false;
	@ObfuscatedName("fa.G")
	public static int selfSlot = -1;
	@ObfuscatedName("we.a")
	public static int membersAccount = 0;
	@ObfuscatedName("qd.ib")
	public static int psize = 0;
	@ObfuscatedName("j.Lb")
	public static int field1422;
	@ObfuscatedName("uc.G")
	public static byte[][] mapBuildGroundData;
	@ObfuscatedName("ra.d")
	public static int[] field2841;
	@ObfuscatedName("ke.l")
	public static int[] field1747;
	@ObfuscatedName("de.c")
	public static byte[][] mapBuildLocationData;
	@ObfuscatedName("fc.y")
	public static int[] mapBuildIndex;
	@ObfuscatedName("kc.l")
	public static int mapBuildBaseX;
	@ObfuscatedName("r.u")
	public static int mapBuildBaseZ;
	@ObfuscatedName("i.h")
	public static boolean regionmode = false;
	@ObfuscatedName("uc.A")
	public static int field3251;
	@ObfuscatedName("ec.x")
	public static int[][][] field641 = new int[4][13][13];
	@ObfuscatedName("ac.X")
	public static int rebootTimer = 0;
	@ObfuscatedName("i.c")
	public static int logoutTimer = 0;
	@ObfuscatedName("bc.l")
	public static long prevMouseClickTime = 0L;
	@ObfuscatedName("vf.x")
	public static int mouseTrackedDelta = 0;
	@ObfuscatedName("dd.O")
	public static boolean isMenuOpen = false;
	@ObfuscatedName("ra.l")
	public static int menuNumEntries = 0;
	@ObfuscatedName("ac.bb")
	public static int minimapState = 0;
	@ObfuscatedName("hd.L")
	public static int[] waveSoundIds = new int[50];
	@ObfuscatedName("sa.i")
	public static int[] waveLoops = new int[50];
	@ObfuscatedName("qa.n")
	public static int[] waveDelay = new int[50];
	@ObfuscatedName("ud.bb")
	public static int waveCount = 0;
	@ObfuscatedName("jc.V")
	public static JagFX[] waveSounds = new JagFX[50];
	@ObfuscatedName("qc.D")
	public static int[] wameAmbient = new int[50];
	@ObfuscatedName("ka.Hc")
	public static int waveVolume = 127;
	@ObfuscatedName("ee.R")
	public static int ptype2 = 0;
	@ObfuscatedName("ee.K")
	public static int timeoutTimer = 0;
	@ObfuscatedName("bd.x")
	public static int ptype0 = 0;
	@ObfuscatedName("we.i")
	public static int ptype1 = 0;
	@ObfuscatedName("gb.t")
	public static int minimapFlagX = 0;
	@ObfuscatedName("bf.d")
	public static ClientNpc[] npcs = new ClientNpc[32768];
	@ObfuscatedName("uf.d")
	public static boolean[] componentDirtyArea = new boolean[100];
	@ObfuscatedName("pe.w")
	public static HashTable subinterfaces = new HashTable(8);
	@ObfuscatedName("ha.E")
	public static IfType resumePauseCom = null;
	@ObfuscatedName("f.Pc")
	public static int menuWidth;
	@ObfuscatedName("rc.I")
	public static int menuY;
	@ObfuscatedName("gb.y")
	public static int menuX;
	@ObfuscatedName("pf.Q")
	public static int menuHeight;
	@ObfuscatedName("be.A")
	public static int toplevelinterface = -1;
	@ObfuscatedName("v.l")
	public static int field3319 = -1;
	@ObfuscatedName("me.r")
	public static int targetMask;
	@ObfuscatedName("g.N")
	public static int field1002;
	@ObfuscatedName("ve.q")
	public static boolean targetMode = false;
	@ObfuscatedName("se.Z")
	public static int projectY = -1;
	@ObfuscatedName("aa.n")
	public static JagString AUTO_GC = JagString.wrap("::gc");
	@ObfuscatedName("mc.n")
	public static JagString AUTO_CLIENTDROP = JagString.wrap("::clientdrop");
	@ObfuscatedName("ma.b")
	public static JagString AUTO_FPSON = JagString.wrap("::fpson");
	@ObfuscatedName("jf.d")
	public static JagString AUTO_FPSOFF = JagString.wrap("::fpsoff");
	@ObfuscatedName("ce.i")
	public static JagString AUTO_NOCLIP = JagString.wrap("::noclip");
	@ObfuscatedName("g.L")
	public static JagString AUTO_ERRORTEST = JagString.wrap("::errortest");
	@ObfuscatedName("ua.k")
	public static JagString AUTO_RECT_DEBUG = JagString.wrap("::rect_debug");
	@ObfuscatedName("ud.ab")
	public static JagString AUTO_QA_OP_TEST = JagString.wrap("::qa_op_test");
	@ObfuscatedName("v.k")
	public static boolean qaOpTest = false;
	@ObfuscatedName("ge.Zb")
	public static int privateMessageCount = 0;
	@ObfuscatedName("o.Ab")
	public static int chatDisabled = 0;
	@ObfuscatedName("uf.k")
	public static JagString TAG_IMG_1 = JagString.wrap("<img=1>");
	@ObfuscatedName("ud.cb")
	public static JagString TAG_IMG_0 = JagString.wrap("<img=0>");
	@ObfuscatedName("ke.d")
	public static long[] messageIds = new long[100];
	@ObfuscatedName("of.f")
	public static long[] ignoreUserhash = new long[100];
	@ObfuscatedName("pb.W")
	public static int ignoreCount = 0;
	@ObfuscatedName("pb.gb")
	public static int miscTransmitNum = 0;
	@ObfuscatedName("ie.S")
	public static int friendServerStatus = 0;
	@ObfuscatedName("aa.l")
	public static int friendTransmitNum = 0;
	@ObfuscatedName("mb.p")
	public static int varTransmitNum = 0;
	@ObfuscatedName("da.M")
	public static boolean cinemaCam = false;
	@ObfuscatedName("m.a")
	public static int camMoveToLx;
	@ObfuscatedName("pb.ub")
	public static int camMoveToLz;
	@ObfuscatedName("uc.D")
	public static int camMoveToHei;
	@ObfuscatedName("ld.a")
	public static int camMoveToRate;
	@ObfuscatedName("mf.j")
	public static int camMoveToRate2;
	@ObfuscatedName("gf.h")
	public static int camZ;
	@ObfuscatedName("pa.n")
	public static int camX;
	@ObfuscatedName("kd.z")
	public static int camY;
	@ObfuscatedName("g.z")
	public static int minusedlevel;
	@ObfuscatedName("of.b")
	public static int hintTileZ = 0;
	@ObfuscatedName("of.c")
	public static long field2404 = 0L;
	@ObfuscatedName("sa.m")
	public static JagString field2927 = JagString.wrap("huffman");
	@ObfuscatedName("pe.A")
	public static JagString[] menuVerb = new JagString[500];
	@ObfuscatedName("i.d")
	public static JagString[] menuSubject = new JagString[500];
	@ObfuscatedName("ga.ub")
	public static int[] menuAction = new int[500];
	@ObfuscatedName("tc.e")
	public static int[] field3135 = new int[500];
	@ObfuscatedName("rc.M")
	public static int[] field2868 = new int[500];
	@ObfuscatedName("we.m")
	public static int[] field3620 = new int[500];
	@ObfuscatedName("ra.k")
	public static int chatCount = 0;
	@ObfuscatedName("j.tb")
	public static int playerCount = 0;
	@ObfuscatedName("oe.o")
	public static int npcCount = 0;
	@ObfuscatedName("te.o")
	public static int[] playerIds = new int[2048];
	@ObfuscatedName("c.Jb")
	public static int[] npcIds = new int[32768];
	@ObfuscatedName("mf.g")
	public static int projectX = -1;
	@ObfuscatedName("s.n")
	public static int hintType = 0;
	@ObfuscatedName("ld.s")
	public static int hintNpc = 0;
	@ObfuscatedName("ld.e")
	public static ClientStream prevStream;
	@ObfuscatedName("ja.u")
	public static final int MAX_CHATS = 50;
	@ObfuscatedName("ja.E")
	public static int[] chatWidth = new int[MAX_CHATS];
	@ObfuscatedName("ja.g")
	public static int[] chatHeight = new int[MAX_CHATS];
	@ObfuscatedName("ja.B")
	public static int[] chatX = new int[MAX_CHATS];
	@ObfuscatedName("ja.G")
	public static int[] chatY = new int[MAX_CHATS];
	@ObfuscatedName("ja.y")
	public static int[] chatColour = new int[MAX_CHATS];
	@ObfuscatedName("ja.r")
	public static int[] chatEffect = new int[MAX_CHATS];
	@ObfuscatedName("ja.a")
	public static int[] chatTimer = new int[MAX_CHATS];
	@ObfuscatedName("ja.m")
	public static JagString[] chats = new JagString[MAX_CHATS];
	@ObfuscatedName("qa.j")
	public static boolean dragging = false;
	@ObfuscatedName("de.t")
	public static boolean dragParentFound = false;
	@ObfuscatedName("ba.e")
	public static int dragTime;
	@ObfuscatedName("we.v")
	public static IfType dragCom = null;
	@ObfuscatedName("gb.v")
	public static int dragPickupX = 0;
	@ObfuscatedName("q.Sc")
	public static int dragParentX = -1;
	@ObfuscatedName("me.b")
	public static int dragPickupY = 0;
	@ObfuscatedName("qf.E")
	public static IfType dragLayer = null;
	@ObfuscatedName("sa.p")
	public static int dragCurrentX = -1;
	@ObfuscatedName("te.h")
	public static int dragParentY = -1;
	@ObfuscatedName("ja.z")
	public static int dragCurrentY = -1;
	@ObfuscatedName("la.w")
	public static boolean dragAlive = false;
	@ObfuscatedName("rf.e")
	public static IfType dropCom = null;
	@ObfuscatedName("s.a")
	public static int oneMouseButton = 0;
	@ObfuscatedName("gb.D")
	public static LinkList locChanges = new LinkList();
	@ObfuscatedName("bf.m")
	public static JagString[] field239 = new JagString[200];
	@ObfuscatedName("aa.f")
	public static int friendCount = 0;
	@ObfuscatedName("na.t")
	public static int[] field2094 = new int[200];
	@ObfuscatedName("ad.u")
	public static int[] field103 = new int[200];
	@ObfuscatedName("q.Vc")
	public static FriendChatUser[] friendChatList;
	@ObfuscatedName("ta.Y")
	public static int orbitCameraYaw = 0;
	@ObfuscatedName("de.m")
	public static int macroMinimapAngle = 0;
	@ObfuscatedName("e.A")
	public static int macroMinimapZoom = 0;
	@ObfuscatedName("tc.q")
	public static int crossMode = 0;
	@ObfuscatedName("wa.Z")
	public static int crossCycle = 0;
	@ObfuscatedName("de.s")
	public static int crossX = 0;
	@ObfuscatedName("wa.bb")
	public static int crossY = 0;
	@ObfuscatedName("lc.j")
	public static JagString AUTO_FPS = JagString.wrap("Fps:");
	@ObfuscatedName("be.C")
	public static JagString AUTO_MEM = JagString.wrap("Mem:");
	@ObfuscatedName("qa.p")
	public static JagString AUTO_MEM_KB = JagString.wrap("k");
	@ObfuscatedName("bd.C")
	public static int nextMidiSong = -1;
	@ObfuscatedName("we.E")
	public static int midiVolume = 255;
	@ObfuscatedName("sf.c")
	public static JagString AUTO_HIDDEN_USE = JagString.wrap("Hidden)2use");
	@ObfuscatedName("s.p")
	public static int useMode = 0;
	@ObfuscatedName("fb.H")
	public static JagString[] playerOp = new JagString[8];
	@ObfuscatedName("ga.Cb")
	public static boolean[] playerOpPriority = new boolean[8];
	@ObfuscatedName("oa.N")
	public static int[] MENUACTION_PLAYER = new int[] { 45, 23, 50, 29, 44, 48, 16, 6 };
	@ObfuscatedName("va.C")
	public static JagString targetVerb = null;
	@ObfuscatedName("bf.h")
	public static JagString targetOp = null;
	@ObfuscatedName("tb.t")
	public static JagString field3127 = JagString.wrap(" )2> <col=ffffff>");
	@ObfuscatedName("se.V")
	public static JagString AUTO_TAG_COLOUR_WHITE = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("ue.y")
	public static int[] componentDrawX = new int[100];
	@ObfuscatedName("te.j")
	public static JagString AUTO_TAG_COLOUR9 = JagString.wrap("<col=ffff00>");
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
	public static boolean js5Loading = true;
	@ObfuscatedName("sf.b")
	public static JagString chatDisplayName = null;
	@ObfuscatedName("we.C")
	public static int friendChatCount;
	@ObfuscatedName("ie.W")
	public static PlayerModel idkDesign = new PlayerModel();
	@ObfuscatedName("da.r")
	public static LinkList[][][] groundObj = new LinkList[4][104][104];
	@ObfuscatedName("me.k")
	public static LinkList projectiles = new LinkList();
	@ObfuscatedName("wd.q")
	public static LinkList spotanims = new LinkList();
	@ObfuscatedName("lc.h")
	public static int[] field1831 = new int[2000];
	@ObfuscatedName("bc.c")
	public static int macroCameraAngle = 0;
	@ObfuscatedName("be.F")
	public static int macroCameraZ = 0;
	@ObfuscatedName("ta.lb")
	public static int macroCameraX = 0;
	@ObfuscatedName("eb.B")
	public static int minimapFlagZ = 0;
	@ObfuscatedName("la.T")
	public static boolean focusIn = true;
	@ObfuscatedName("ad.g")
	public static IfType selectedCom;
	@ObfuscatedName("td.bb")
	public static int selectedCycle = 0;
	@ObfuscatedName("de.j")
	public static JagString AUTO_LANG_DE = JagString.wrap(")4lang)4de");
	@ObfuscatedName("ha.B")
	public static JagString field1155 = JagString.wrap("p11_full");
	@ObfuscatedName("jb.k")
	public static JagString field1487 = JagString.wrap("p12_full");
	@ObfuscatedName("ve.j")
	public static JagString field3461 = JagString.wrap("b12_full");
	@ObfuscatedName("eb.A")
	public static int[] ANGLE_TO_DIR = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	@ObfuscatedName("ie.O")
	public static int entityUpdateCount = 0;
	@ObfuscatedName("j.Hb")
	public static int[] entityUpdateIds = new int[2048];
	@ObfuscatedName("df.h")
	public static int[] componentDrawWidth = new int[100];
	@ObfuscatedName("rf.k")
	public static int[] componentDrawY = new int[100];
	@ObfuscatedName("ce.c")
	public static int[] componentDrawHeight = new int[100];
	@ObfuscatedName("wf.p")
	public static int sceneCycle = 0;
	@ObfuscatedName("f.tb")
	public static int[][] tileLastOccupiedCycle = new int[104][104];
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
	public static int mouseTrackX = 0;
	@ObfuscatedName("df.b")
	public static int mouseTrackY = 0;
	@ObfuscatedName("nb.C")
	public static boolean sendCamera = false;
	@ObfuscatedName("ea.y")
	public static int sendCameraDelay = 0;
	@ObfuscatedName("he.s")
	public static int worldUpdateNum = 0;
	@ObfuscatedName("ee.eb")
	public static IfType objDragCom;
	@ObfuscatedName("pe.u")
	public static int objDragCycles = 0;
	@ObfuscatedName("qb.d")
	public static int objGrabX = 0;
	@ObfuscatedName("kc.e")
	public static boolean objGrabThreshold = false;
	@ObfuscatedName("gf.e")
	public static IfType hoveredSlotParent;
	@ObfuscatedName("pc.B")
	public static int objDragSlot = 0;
	@ObfuscatedName("le.l")
	public static int hoveredSlot = 0;
	@ObfuscatedName("ha.K")
	public static IfType overCom;
	@ObfuscatedName("kb.d")
	public static IfType tooltipCom;
	@ObfuscatedName("hd.Ob")
	public static int keypresses = 0;
	@ObfuscatedName("kd.O")
	public static int[] keypressKeycodes = new int[128];
	@ObfuscatedName("bc.r")
	public static int[] keypressKeychars = new int[128];
	@ObfuscatedName("q.Kc")
	public static LinkList hookRequestsTimer = new LinkList();
	@ObfuscatedName("ld.c")
	public static LinkList hookRequestsMouseStop = new LinkList();
	@ObfuscatedName("bc.f")
	public static LinkList hookRequests = new LinkList();
	@ObfuscatedName("fb.R")
	public static int tooltipNum = 0;
	@ObfuscatedName("cb.lb")
	public static int[] camShakeCycle = new int[5];
	@ObfuscatedName("ja.D")
	public static int macroMinimapCycle = 0;
	@ObfuscatedName("m.l")
	public static int macroCameraCycle = 0;
	@ObfuscatedName("ea.p")
	public static int macroCameraXModifier = 2;
	@ObfuscatedName("bc.x")
	public static int macroCameraZModifier = 1;
	@ObfuscatedName("jc.N")
	public static int macroCameraAngleModifier = 2;
	@ObfuscatedName("ee.I")
	public static int macroMinimapAngleModifier = 2;
	@ObfuscatedName("ad.t")
	public static int macroMinimapZoomModifier = 1;
	@ObfuscatedName("wa.u")
	public static int minimenuMouseOverY = -1;
	@ObfuscatedName("ea.z")
	public static int componentDrawTime = -2;
	@ObfuscatedName("ec.ib")
	public static int minimenuMouseOverX = -1;
	@ObfuscatedName("ia.N")
	public static boolean[] componentRedraw = new boolean[100];
	@ObfuscatedName("ia.W")
	public static int field1327 = 0;
	@ObfuscatedName("tc.a")
	public static int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	@ObfuscatedName("g.I")
	public static int zoneUpdateX;
	@ObfuscatedName("ce.e")
	public static int zoneUpdateZ;
	@ObfuscatedName("de.o")
	public static int[] entityRemovalIds = new int[1000];
	@ObfuscatedName("oe.i")
	public static int entityRemovalCount = 0;
	@ObfuscatedName("tb.n")
	public static int orbitCameraPitchVelocity = 0;
	@ObfuscatedName("ta.Ab")
	public static int orbitCameraPitch = 128;
	@ObfuscatedName("pf.I")
	public static int orbitCameraYawVelocity = 0;
	@ObfuscatedName("ia.O")
	public static int orbitCameraX;
	@ObfuscatedName("pc.v")
	public static int orbitCameraZ;
	@ObfuscatedName("dd.H")
	public static int cameraPitchClamp = 0;
	@ObfuscatedName("aa.g")
	public static int chatPublicMode = 0;
	@ObfuscatedName("t.o")
	public static int[] compassMaskLineLengths;
	@ObfuscatedName("f.Gc")
	public static int[] compassMaskLineOffsets;
	@ObfuscatedName("aa.m")
	public static int[] minimapMaskLineLengths;
	@ObfuscatedName("oa.U")
	public static int[] minimapMaskLineOffsets;
	@ObfuscatedName("qd.yc")
	public static HashTable serverActive = new HashTable(512);
	@ObfuscatedName("lf.D")
	public static int activeMapFunctionCount = 0;
	@ObfuscatedName("we.q")
	public static Pix32[] activeMapFunctions = new Pix32[1000];
	@ObfuscatedName("ra.m")
	public static int[] activeMapFunctionX = new int[1000];
	@ObfuscatedName("m.J")
	public static int[] activeMapFunctionZ = new int[1000];
	@ObfuscatedName("gb.c")
	public static int camPitch;
	@ObfuscatedName("mc.v")
	public static int camLookAtLx;
	@ObfuscatedName("fa.N")
	public static int camLookAtLz;
	@ObfuscatedName("nd.o")
	public static int camLookAtRate;
	@ObfuscatedName("lc.a")
	public static int camLookAtRate2;
	@ObfuscatedName("qd.Ab")
	public static int camYaw;
	@ObfuscatedName("te.a")
	public static int[] statEffectiveLevel = new int[25];
	@ObfuscatedName("ha.F")
	public static int[] statBaseLevel = new int[25];
	@ObfuscatedName("cb.db")
	public static int[] statXP = new int[25];
	@ObfuscatedName("td.Y")
	public static int runenergy = 0;
	@ObfuscatedName("ab.u")
	public static int runweight = 0;
	@ObfuscatedName("kb.x")
	public static JagString[] ignoreUsername = new JagString[100];
	@ObfuscatedName("of.q")
	public static JagString AUTO_TAG_COLOUR1 = JagString.wrap("<col=ff0000>");
	@ObfuscatedName("tc.n")
	public static JagString AUTO_TAG_COLOUR2 = JagString.wrap("<col=ff3000>");
	@ObfuscatedName("gb.x")
	public static JagString AUTO_TAG_COLOUR3 = JagString.wrap("<col=ff7000>");
	@ObfuscatedName("da.w")
	public static JagString AUTO_TAG_COLOUR4 = JagString.wrap("<col=ffb000>");
	@ObfuscatedName("tb.u")
	public static JagString AUTO_TAG_COLOUR5 = JagString.wrap("<col=00ff00>");
	@ObfuscatedName("i.o")
	public static JagString AUTO_TAG_COLOUR6 = JagString.wrap("<col=40ff00>");
	@ObfuscatedName("ad.e")
	public static JagString AUTO_TAG_COLOUR7 = JagString.wrap("<col=80ff00>");
	@ObfuscatedName("jb.q")
	public static JagString AUTO_TAG_COLOUR8 = JagString.wrap("<col=c0ff00>");
	@ObfuscatedName("ed.t")
	public static boolean[] camShake = new boolean[5];
	@ObfuscatedName("rf.b")
	public static int[] camShakeRan = new int[5];
	@ObfuscatedName("uf.a")
	public static int[] field3294 = new int[5];
	@ObfuscatedName("oa.A")
	public static IfType[] dragChildren;
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
	public static JagString AUTO_COLON = JagString.wrap(":");
	@ObfuscatedName("qc.f")
	public static JagString AUTO_TRADEREQ = JagString.wrap(":tradereq:");
	@ObfuscatedName("pa.p")
	public static JagString AUTO_DUELREQ = JagString.wrap(":duelreq:");
	@ObfuscatedName("cb.kb")
	public static JagString AUTO_CHALREQ = JagString.wrap(":chalreq:");
	@ObfuscatedName("nd.x")
	public static JagString AUTO_ASSISTREQ = JagString.wrap(":assistreq:");
	@ObfuscatedName("de.v")
	public static JagString AUTO_CLAN = JagString.wrap(":clan:");
	@ObfuscatedName("jc.gb")
	public static JagString AUTO_TRADE = JagString.wrap(":trade:");
	@ObfuscatedName("uf.n")
	public static JagString AUTO_ASSIST = JagString.wrap(":assist:");
	@ObfuscatedName("nb.L")
	public static PrivilegedRequest lastAddress;
	@ObfuscatedName("aa.i")
	public static int chatPrivateMode = 0;
	@ObfuscatedName("g.B")
	public static int chatTradeMode = 0;
	@ObfuscatedName("ke.f")
	public static int[] statTransmit = new int[32];
	@ObfuscatedName("mc.l")
	public static int statTransmitNum = 0;
	@ObfuscatedName("r.f")
	public static int[] varTransmit = new int[32];
	@ObfuscatedName("te.v")
	public static int hintOffsetX = 0;
	@ObfuscatedName("uf.f")
	public static int hintTileX = 0;
	@ObfuscatedName("pf.L")
	public static int hintHeight = 0;
	@ObfuscatedName("lc.g")
	public static int hintPlayer = 0;
	@ObfuscatedName("na.A")
	public static JagString AUTO_NULL2 = JagString.wrap("null");
	@ObfuscatedName("a.k")
	public static int clanTransmitNum = 0;
	@ObfuscatedName("sa.j")
	public static JagString field2924 = null;
	@ObfuscatedName("oe.g")
	public static byte chatMinKick;
	@ObfuscatedName("oa.G")
	public static long field2259;
	@ObfuscatedName("vc.Y")
	public static byte chatRank;
	@ObfuscatedName("na.m")
	public static JagString field2087 = JagString.wrap(" )2> <col=00ffff>");
	@ObfuscatedName("ta.W")
	public static JagString field3052 = JagString.wrap("<col=00ffff>");
	@ObfuscatedName("gf.n")
	public static JagString field1132 = JagString.wrap(" )2> <col=ff9040>");
	@ObfuscatedName("fb.v")
	public static JagString AUTO_TAG_COLOUR_ff9040 = JagString.wrap("<col=ff9040>");
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
	public static int bankArrangeMode = 0;
	@ObfuscatedName("nd.a")
	public static int objGrabY = 0;
	@ObfuscatedName("ee.kb")
	public static int field729 = 0;
	@ObfuscatedName("qd.Bb")
	public static JagString AUTO_TAG_COLOURCLOSE_X = JagString.wrap("<)4col> x");
	@ObfuscatedName("wa.T")
	public static JagString field3538 = JagString.wrap("<br>");
	@ObfuscatedName("se.O")
	public static Packet tempP = new Packet(new byte[5000]);
	@ObfuscatedName("a.a")
	public static JagString TAG_ARROW = JagString.wrap(" )2> ");
	@ObfuscatedName("na.p")
	public static JagString AUTO_NULL = JagString.wrap("Null");
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
	public static JagString AUTO_HIDDEN = JagString.wrap("Hidden)2");
	@ObfuscatedName("ja.b")
	public static JagString AUTO_SET_RECT_DEBUG = JagString.wrap("rect_debug=");
	@ObfuscatedName("we.s")
	public static JagString[] field3626 = new JagString[1000];
	@ObfuscatedName("we.H")
	public static JagString AUTO_ASTERISK = JagString.wrap("(Z");
	@ObfuscatedName("ka.Zc")
	public static int field1647;
	@ObfuscatedName("j.fb")
	public static int[] field1390 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	@ObfuscatedName("ie.U")
	public static int idkDesignButton2 = -1;
	@ObfuscatedName("ie.V")
	public static int camLookAtHei;
	@ObfuscatedName("f.X")
	public static JagString field767 = JagString.wrap("m");
	@ObfuscatedName("qc.c")
	public static int ambientVolume = 127;
	@ObfuscatedName("ka.Lc")
	public static int idkDesignButton1 = -1;
	@ObfuscatedName("qc.j")
	public static int[] field2653 = new int[5];

	@ObfuscatedName("client.a(IIIBIIII)V")
	public static void locChangeUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (lowMem && minusedlevel != arg5) {
			return;
		}
		int var7 = 0;
		if (arg1 == 0) {
			var7 = world.wallType(arg5, arg2, arg6);
		}
		if (arg1 == 1) {
			var7 = world.decorType(arg5, arg2, arg6);
		}
		if (arg1 == 2) {
			var7 = world.sceneType(arg5, arg2, arg6);
		}
		if (arg1 == 3) {
			var7 = world.gdType(arg5, arg2, arg6);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = world.typecode2(arg5, arg2, arg6, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg1 == 0) {
				world.delWall(arg5, arg2, arg6);
				LocType var12 = LocType.list(var8);
				if (var12.blockwalk != 0) {
					collision[arg5].delWall(arg2, var10, var11, arg6, var12.blockrange);
				}
			}
			if (arg1 == 1) {
				world.delDecor(arg5, arg2, arg6);
			}
			if (arg1 == 2) {
				world.delLoc(arg5, arg2, arg6);
				LocType var13 = LocType.list(var8);
				if (var13.width + arg2 > 103 || arg6 + var13.width > 103 || var13.length + arg2 > 103 || arg6 + var13.length > 103) {
					return;
				}
				if (var13.blockwalk != 0) {
					collision[arg5].delLoc(arg2, var13.width, arg6, var13.blockrange, var10, var13.length);
				}
			}
			if (arg1 == 3) {
				world.delGroundDecor(arg5, arg2, arg6);
				LocType var14 = LocType.list(var8);
				if (var14.blockwalk == 1) {
					collision[arg5].unblockGroundDecor(arg6, arg2);
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
		ClientBuild.changeLocUnchecked(arg3, arg0, world, arg6, var15, arg2, collision[arg5], arg5, arg4);
	}

	@ObfuscatedName("client.a(ILf;)Z")
	public static boolean clientButton(IfType arg0) {
		int var1 = arg0.clientCode;
		if (var1 == 205) {
			rebootTimer = 250;
			return true;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = var1 & 0x1;
			int var3 = (var1 - 300) / 2;
			idkDesign.idkChangePart(var3, var2 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = var1 & 0x1;
			int var5 = (var1 - 314) / 2;
			idkDesign.idkChangeColour(var4 == 1, var5);
		}
		if (var1 == 324) {
			idkDesign.idkChangeGender(false);
		}
		if (var1 == 325) {
			idkDesign.idkChangeGender(true);
		}
		if (var1 == 326) {
			// IDK_SAVEDESIGN
			out.p1Enc(78);
			idkDesign.idkSaveDesign(out);
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] arg0) {
		try {
			if (arg0.length != 7) {
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
				ACTIVE_LANG = AUTO_LANG_DE;
			} else {
				errorUsage();
			}

			if (arg0[6].equals("game0")) {
				modegame = 0;
			} else if (arg0[6].equals("game1")) {
				modegame = 1;
			} else {
				errorUsage();
			}

			loginHost = "127.0.0.1";

			Client app = new Client();
			app.startApplication(16, 1, 468, "runescape", 765, 503, modewhat + 32);
		} catch (Exception ignore) {
			JagException.report(null, ignore);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public static void ifAnimReset(int arg0) {
		if (!IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
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
				collision[var0] = new CollisionMap(104, 104);
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
			TitleScreen.loadString = Text.MAINLOAD30;
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
			if (var21 != 100) {
				if (var21 != 0) {
					TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD40, JagString.parseInt(var21), AUTO_PCT});
				}
				TitleScreen.loadPos = 30;
			} else {
				TitleScreen.loadString = Text.MAINLOAD40B;
				loadingStep = 45;
				TitleScreen.loadPos = 30;
			}
		} else if (loadingStep == 45) {
			PcmPlayer.init(!lowMem);
			MidiPlayer var22 = new MidiPlayer();
			var22.setChannelDefaultPatch();
			midiPcmPlayer = PcmPlayer.getPlayer(signlink, 0, 22050, GameShell.canvas);
			midiPcmPlayer.playStream(var22);
			MidiManager.init(jagFX, vorbis, var22, patches);
			soundPcmPlayer = PcmPlayer.getPlayer(signlink, 1, 2048, GameShell.canvas);
			soundMixer = new Mixer();
			soundPcmPlayer.playStream(soundMixer);
			soundDecimator = new Decimator(22050, PcmPlayer.frequency);
			loadingStep = 50;
			TitleScreen.loadPos = 35;
			TitleScreen.loadString = Text.MAINLOAD45;
		} else if (loadingStep == 50) {
			int var23 = 0;
			if (p11 == null) {
				p11 = PixLoader.makePixFont(sprites, fontMetrics, AUTO_EMPTY, field1155);
			} else {
				var23++;
			}
			if (p12 == null) {
				p12 = PixLoader.makePixFont(sprites, fontMetrics, AUTO_EMPTY, field1487);
			} else {
				var23++;
			}
			if (b12 == null) {
				b12 = PixLoader.makePixFont(sprites, fontMetrics, AUTO_EMPTY, field3461);
			} else {
				var23++;
			}
			if (var23 < 3) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD50, JagString.parseInt(var23 * 100 / 3), AUTO_PCT});
				TitleScreen.loadPos = 40;
			} else {
				TitleScreen.loadString = Text.MAINLOAD50B;
				TitleScreen.loadPos = 40;
				loadingStep = 60;
			}
		} else if (loadingStep == 60) {
			int var24 = TitleScreen.ready(sprites, binary);
			int var25 = TitleScreen.readyMax();
			if (var25 > var24) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD60, JagString.parseInt(var24 * 100 / var25), AUTO_PCT});
				TitleScreen.loadPos = 50;
			} else {
				TitleScreen.loadPos = 50;
				TitleScreen.loadString = Text.MAINLOAD60B;
				setMainState(5);
				loadingStep = 70;
			}
		} else if (loadingStep == 70) {
			if (!configs.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD70, JagString.parseInt(configs.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 60;
			} else {
				FloType.init(configs);
				FluType.init(configs);
				IdkType.init(models, configs);
				LocType.init(models, lowMem, configs);
				NpcType.init(configs, models);
				ObjType.init(models, configs, memServer, p11);
				SeqType.init(bases, configs, anims);
				SpotType.init(models, configs);
				VarBitType.init(configs);
				VarpType.init(configs);
				IfType.init(sprites, models, fontMetrics, interfaces);
				InvType.init(configs);
				EnumType.init(configs);
				TitleScreen.loadString = Text.MAINLOAD70B;
				TitleScreen.loadPos = 60;
				loadingStep = 80;
			}
		} else if (loadingStep == 80) {
			int var26 = 0;
			if (compass == null) {
				compass = PixLoader.makePix32(sprites, AUTO_EMPTY, field536);
			} else {
				var26++;
			}
			if (mapedge == null) {
				mapedge = PixLoader.makePix32(sprites, AUTO_EMPTY, field51);
			} else {
				var26++;
			}
			if (mapscene == null) {
				mapscene = PixLoader.makePix8Array(AUTO_EMPTY, field422, sprites);
			} else {
				var26++;
			}
			if (mapfunction == null) {
				mapfunction = PixLoader.makePix32Array(field3122, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (hitmarks == null) {
				hitmarks = PixLoader.makePix32Array(field595, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (headiconsPk == null) {
				headiconsPk = PixLoader.makePix32Array(field2315, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (headiconsPrayer == null) {
				headiconsPrayer = PixLoader.makePix32Array(field64, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (headiconsHint == null) {
				headiconsHint = PixLoader.makePix32Array(field69, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (mapmarker == null) {
				mapmarker = PixLoader.makePix32Array(field1162, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (cross == null) {
				cross = PixLoader.makePix32Array(field1178, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (mapdots == null) {
				mapdots = PixLoader.makePix32Array(field3283, sprites, AUTO_EMPTY);
			} else {
				var26++;
			}
			if (scrollbar == null) {
				scrollbar = PixLoader.makePix8Array(AUTO_EMPTY, field3274, sprites);
			} else {
				var26++;
			}
			if (modicons == null) {
				modicons = PixLoader.makePix8Array(AUTO_EMPTY, field937, sprites);
			} else {
				var26++;
			}
			if (mapback == null) {
				mapback = PixLoader.makePix8(AUTO_EMPTY, sprites, field3184);
			} else {
				var26++;
			}
			if (var26 < 14) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD80, JagString.parseInt(var26 * 100 / 14), AUTO_PCT});
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
				TitleScreen.loadString = Text.MAINLOAD80B;
				TitleScreen.loadPos = 70;
				loadingStep = 90;
			}
		} else if (loadingStep == 90) {
			if (!textures.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD90, JagString.parseInt(textures.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 90;
			} else {
				TextureManager var32 = new TextureManager(textures, sprites, 20, 0.8D, lowMem ? 64 : 128);
				Pix3D.setTextures(var32);
				Pix3D.initColourTable(0.8D);
				loadingStep = 110;
				TitleScreen.loadString = Text.MAINLOAD90B;
				TitleScreen.loadPos = 90;
			}
		} else if (loadingStep == 110) {
			mouseTracking = new MouseTracking();
			signlink.threadreq(10, mouseTracking, 105);
			TitleScreen.loadPos = 94;
			loadingStep = 120;
			TitleScreen.loadString = Text.MAINLOAD110;
		} else if (loadingStep == 120) {
			if (!binary.requestDownload(field2927, AUTO_EMPTY)) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD120, field922 });
				TitleScreen.loadPos = 96;
			} else {
				Huffman var33 = new Huffman(binary.getFile(field2927, AUTO_EMPTY));
				WordPack.setHuffman(var33);
				TitleScreen.loadString = Text.MAINLOAD120B;
				TitleScreen.loadPos = 96;
				loadingStep = 130;
			}
		} else if (loadingStep == 130) {
			if (!interfaces.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(interfaces.getIndexLoadProgress() * 4 / 5), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else if (!scripts.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(scripts.getIndexLoadProgress() / 6 + 80), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else if (!fontMetrics.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(fontMetrics.getIndexLoadProgress() / 20 + 96), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else {
				loadingStep = 140;
				TitleScreen.loadString = Text.MAINLOAD130B;
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
				long var0 = field2259 = TitleScreen.loginUser.toUserhash();
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
				out.p8(TitleScreen.loginUser.toUserhash());
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
				field3202.pdata(out.pos, out.data);
				stream.write(field3202.data, field3202.pos);
				out.seed(var5);
				for (int var6 = 0; var6 < 4; var6++) {
					var5[var6] += 50;
				}
				in.seed(var5);
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
				TitleScreen.loginMes(Text.LOGINHOP_A, Text.LOGINHOP_B, JagString.join(new JagString[] { JagString.parseInt(loginHopTimer / 60), Text.LOGINHOP_C}));
				if (--loginHopTimer <= 0) {
					loginFailCount = 0;
				}
			} else {
				if (loginFailCount == 9 && stream.available() >= 8) {
					staffmodlevel = stream.read();
					mouseTracked = stream.read() == 1;
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
					rebuildPacket(false);
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
		for (int var1 = 0; var1 < mapBuildGroundData.length; var1++) {
			if (field2841[var1] != -1 && mapBuildGroundData[var1] == null) {
				mapBuildGroundData[var1] = maps.getFile(field2841[var1], 0);
				if (mapBuildGroundData[var1] == null) {
					mapLoadCount++;
					var0 = false;
				}
			}
			if (field1747[var1] != -1 && mapBuildLocationData[var1] == null) {
				mapBuildLocationData[var1] = maps.fetchFile(field1747[var1], field1454[var1], 0);
				if (mapBuildLocationData[var1] == null) {
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
		for (int var3 = 0; var3 < mapBuildGroundData.length; var3++) {
			byte[] var4 = mapBuildLocationData[var3];
			if (var4 != null) {
				int var5 = (mapBuildIndex[var3] >> 8) * 64 - mapBuildBaseX;
				int var6 = (mapBuildIndex[var3] & 0xFF) * 64 - mapBuildBaseZ;
				if (regionmode) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= ClientBuild.checkLocations(var5, var4, var6);
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
			collision[var7].reset();
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
		int var11 = mapBuildGroundData.length;
		BgSound.reset();
		preventTimeout(true);
		if (!regionmode) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (mapBuildIndex[var12] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var14 = mapBuildGroundData[var12];
				int var15 = (mapBuildIndex[var12] >> 8) * 64 - mapBuildBaseX;
				if (var14 != null) {
					doAudio();
					ClientBuild.loadGround(var14, (field3251 - 6) * 8, var13, field1422 * 8 - 48, collision, var15);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (mapBuildIndex[var16] >> 8) * 64 - mapBuildBaseX;
				int var18 = (mapBuildIndex[var16] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var19 = mapBuildGroundData[var16];
				if (var19 == null && field3251 < 800) {
					doAudio();
					ClientBuild.fadeAdjacent(var18, var17, 64, 64);
				}
			}
			preventTimeout(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = mapBuildLocationData[var20];
				if (var21 != null) {
					int var22 = (mapBuildIndex[var20] >> 8) * 64 - mapBuildBaseX;
					int var23 = (mapBuildIndex[var20] & 0xFF) * 64 - mapBuildBaseZ;
					doAudio();
					ClientBuild.loadLocations(var22, world, var21, collision, var23);
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
							for (int var34 = 0; var34 < mapBuildIndex.length; var34++) {
								if (mapBuildIndex[var34] == var33 && mapBuildGroundData[var34] != null) {
									var27 = true;
									ClientBuild.loadGroundRegion((var31 & 0x7) * 8, var26 * 8, var25 * 8, (var32 & 0x7) * 8, var29, collision, mapBuildGroundData[var34], var30, var24);
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
							for (int var47 = 0; var47 < mapBuildIndex.length; var47++) {
								if (mapBuildIndex[var47] == var46 && mapBuildLocationData[var47] != null) {
									ClientBuild.loadLocationsRegion(var38, mapBuildLocationData[var47], var42, (var45 & 0x7) * 8, var40 * 8, var39 * 8, world, var43, collision, (var44 & 0x7) * 8);
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
		ClientBuild.finishBuild(collision, world);
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
			// WINDOW_STATUS
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
						maps.updateCacheHint(JagString.join(new JagString[] { field767, JagString.parseInt(var55), field361, JagString.parseInt(var56) }));
						maps.updateCacheHint(JagString.join(new JagString[] { PcmPlayer.field2669, JagString.parseInt(var55), field361, JagString.parseInt(var56) }));
					}
				}
			}
		}

		setMainState(30);

		doAudio();
		ClientBuild.quit();

		// MAP_BUILD_COMPLETE
		out.p1Enc(39);

		doneslowupdate();
	}

	@ObfuscatedName("ke.a(B)V")
	public static void gameLoop() {
		if (rebootTimer > 0) {
			rebootTimer--;
		}

		if (logoutTimer > 1) {
			logoutTimer--;
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
		synchronized (var1) {
			if (!mouseTracked) {
				mouseTracking.length = 0;
			} else if (ClientMouseListener.mouseClickButton != 0 || mouseTracking.length >= 40) {
				// EVENT_MOUSE_MOVE
				out.p1Enc(119);
				out.p1(0);
				int var3 = out.pos;
				int var2 = 0;
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
					if (mouseTrackX != var6 || var5 != mouseTrackY) {
						int var8 = var6 - mouseTrackX;
						mouseTrackX = var6;
						int var9 = var5 - mouseTrackY;
						mouseTrackY = var5;
						if (mouseTrackedDelta < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
							var8 += 32;
							var9 += 32;
							out.p2(var9 + (mouseTrackedDelta << 12) + (var8 << 6));
							mouseTrackedDelta = 0;
						} else if (mouseTrackedDelta < 8) {
							out.p3((mouseTrackedDelta << 19) + var7 + 8388608);
							mouseTrackedDelta = 0;
						} else {
							out.p4(var7 + (mouseTrackedDelta << 19) - 1073741824);
							mouseTrackedDelta = 0;
						}
					} else if (mouseTrackedDelta < 2047) {
						mouseTrackedDelta++;
					}
				}
				out.psize1(out.pos - var3);
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
			long var11 = (ClientMouseListener.mouseClickTime - prevMouseClickTime) / 50L;
			if (var11 > 4095L) {
				var11 = 4095L;
			}
			prevMouseClickTime = ClientMouseListener.mouseClickTime;
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
			int var16 = (int) var11;
			if (var14 < 0) {
				var14 = 0;
			} else if (var14 > 502) {
				var14 = 502;
			}
			int var17 = var14 * 765 + var13;

			// EVENT_MOUSE_CLICK
			out.p1Enc(242);
			out.p4((var16 << 20) + ((var15 << 19) + var17));
		}

		if (sendCameraDelay > 0) {
			sendCameraDelay--;
		}

		if (ClientKeyboardListener.keyHeld[96] || ClientKeyboardListener.keyHeld[97] || ClientKeyboardListener.keyHeld[98] || ClientKeyboardListener.keyHeld[99]) {
			sendCamera = true;
		}

		if (sendCamera && sendCameraDelay <= 0) {
			sendCamera = false;
			sendCameraDelay = 20;
			out.p1Enc(211);
			out.p2_alt3(orbitCameraYaw);
			out.p2_alt3(orbitCameraPitch);
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

		locChangeDoQueue();
		soundsDoQueue();

		timeoutTimer++;
		if (timeoutTimer > 750) {
			lostCon();
			return;
		}

		movePlayers();
		moveNpcs();
		timeoutChat();

		worldUpdateNum++;

		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}

		if (selectedCom != null) {
			selectedCycle++;
			if (selectedCycle >= 15) {
				componentUpdated(selectedCom);
				selectedCom = null;
			}
		}

		if (objDragCom != null) {
			componentUpdated(objDragCom);
			objDragCycles++;

			if (objGrabX + 5 < ClientMouseListener.mouseX || objGrabX - 5 > ClientMouseListener.mouseX || ClientMouseListener.mouseY > objGrabY + 5 || ClientMouseListener.mouseY < objGrabY - 5) {
				objGrabThreshold = true;
			}

			if (ClientMouseListener.mouseButton == 0) {
				if (objGrabThreshold && objDragCycles >= 5) {
					if (objDragCom == hoveredSlotParent && objDragSlot != hoveredSlot) {
						IfType var18 = objDragCom;
						byte var19 = 0;
						if (bankArrangeMode == 1 && var18.clientCode == 206) {
							var19 = 1;
						}
						if (var18.linkObjType[hoveredSlot] <= 0) {
							var19 = 0;
						}
						if (ServerActive.isObjReplaceEnabled(getActive(var18))) {
							int var22 = hoveredSlot;
							int var23 = objDragSlot;
							var18.linkObjType[var22] = var18.linkObjType[var23];
							var18.linkObjNumber[var22] = var18.linkObjNumber[var23];
							var18.linkObjType[var23] = -1;
							var18.linkObjNumber[var23] = 0;
						} else if (var19 == 1) {
							int var20 = hoveredSlot;
							int var21 = objDragSlot;
							while (var20 != var21) {
								if (var21 > var20) {
									var18.swapSlots(var21 - 1, var21);
									var21--;
								} else if (var21 < var20) {
									var18.swapSlots(var21 + 1, var21);
									var21++;
								}
							}
						} else {
							var18.swapSlots(hoveredSlot, objDragSlot);
						}

						// INV_BUTTOND
						out.p1Enc(56);
						out.p2_alt2(hoveredSlot);
						out.p1_alt2(var19);
						out.p4_alt3(objDragCom.parentId);
						out.p2_alt1(objDragSlot);
					}
				} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					openMenu();
				} else if (menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}
				objDragCom = null;
				selectedCycle = 10;
				ClientMouseListener.mouseClickButton = 0;
			}
		}

		IfType var24 = overCom;
		IfType var25 = tooltipCom;
		overCom = null;
		tooltipCom = null;
		dropCom = null;
		dragging = false;
		dragParentFound = false;

		keypresses = 0;
		while (ClientKeyboardListener.pollKey() && keypresses < 128) {
			keypressKeycodes[keypresses] = ClientKeyboardListener.code;
			keypressKeychars[keypresses] = ClientKeyboardListener.ch;
			keypresses++;
		}

		loopInterface(toplevelinterface, 0, 0, 503, 0, 765, 0);
		transmitNum++;

		// todo: revisit this code if something is broken -- tried to flatten the do { } while () blocks
		while (true) {
			HookReq req;
			IfType child;
			IfType com;

			do {
				req = (HookReq) hookRequestsTimer.popFront();
				if (req == null) {
					break;
				}

				child = req.component;
				if (child.subId < 0) {
					break;
				}

				com = IfType.get(child.layerId);
			} while (com == null || com.subcomponents == null || child.subId >= com.subcomponents.length || child != com.subcomponents[child.subId]);
			if (req != null) {
				ScriptRunner.executeScript(req);
				continue;
			}

			do {
				req = (HookReq) hookRequestsMouseStop.popFront();
				if (req == null) {
					break;
				}

				child = req.component;
				if (child.subId < 0) {
					break;
				}

				com = IfType.get(child.layerId);
			} while (com == null || com.subcomponents == null || com.subcomponents.length <= child.subId || com.subcomponents[child.subId] != child);
			if (req != null) {
				ScriptRunner.executeScript(req);
				continue;
			}

			do {
				req = (HookReq) hookRequests.popFront();
				if (req == null) {
					break;
				}

				child = req.component;
				if (child.subId < 0) {
					break;
				}

				com = IfType.get(child.layerId);
			} while (com == null || com.subcomponents == null || com.subcomponents.length <= child.subId || child != com.subcomponents[child.subId]);
			if (req != null) {
				ScriptRunner.executeScript(req);
				continue;
			}

			break;
		}

		if (dragCom != null) {
			loopIf3Drag();
		}

		if (World.groundX != -1) {
			int var35 = World.groundX;
			int var36 = World.groundZ;
			boolean var37 = tryMove(true, 0, localPlayer.routeZ[0], 0, 0, var35, localPlayer.routeX[0], 0, var36, 0, 0);
			World.groundX = -1;
			if (var37) {
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 1;
				crossX = ClientMouseListener.mouseClickX;
			}
		}

		mouseLoop();

		if (var24 != overCom) {
			if (var24 != null) {
				componentUpdated(var24);
			}
			if (overCom != null) {
				componentUpdated(overCom);
			}
		}

		if (tooltipCom != var25 && tooltipNum == tooltipRedraw) {
			if (var25 != null) {
				componentUpdated(var25);
			}
			if (tooltipCom != null) {
				componentUpdated(tooltipCom);
			}
		}

		if (tooltipCom == null) {
			if (tooltipNum > 0) {
				tooltipNum--;
			}
		} else if (tooltipRedraw > tooltipNum) {
			tooltipNum++;
			if (tooltipNum == tooltipRedraw) {
				componentUpdated(tooltipCom);
			}
		}

		followCamera();

		if (cinemaCam) {
			cinemaCamera();
		}

		for (int var38 = 0; var38 < 5; var38++) {
			camShakeCycle[var38]++;
		}

		int var39 = ClientMouseListener.getIdleTimer();
		int var40 = ClientKeyboardListener.getIdleTimer();
		if (var39 > 4500 && var40 > 4500) {
			rebootTimer = 250;
			ClientMouseListener.setIdleTimer(4000);

			// IDLE_TIMER
			out.p1Enc(13);
		}

		macroCameraCycle++;
		if (macroCameraCycle > 500) {
			macroCameraCycle = 0;

			int var41 = (int) (Math.random() * 8.0D);
			if ((var41 & 0x2) == 2) {
				macroCameraZ += macroCameraXModifier;
			}
			if ((var41 & 0x4) == 4) {
				macroCameraAngle += macroCameraZModifier;
			}
			if ((var41 & 0x1) == 1) {
				macroCameraX += macroCameraAngleModifier;
			}
		}

		if (macroCameraX < -50) {
			macroCameraAngleModifier = 2;
		}
		if (macroCameraX > 50) {
			macroCameraAngleModifier = -2;
		}

		if (macroCameraZ < -55) {
			macroCameraXModifier = 2;
		}
		if (macroCameraZ > 55) {
			macroCameraXModifier = -2;
		}

		if (macroCameraAngle < -40) {
			macroCameraZModifier = 1;
		}
		if (macroCameraAngle > 40) {
			macroCameraZModifier = -1;
		}

		macroMinimapCycle++;
		if (macroMinimapCycle > 500) {
			macroMinimapCycle = 0;
			int var42 = (int) (Math.random() * 8.0D);
			if ((var42 & 0x1) == 1) {
				macroMinimapAngle += macroMinimapAngleModifier;
			}
			if ((var42 & 0x2) == 2) {
				macroMinimapZoom += macroMinimapZoomModifier;
			}
		}

		if (macroMinimapAngle < -60) {
			macroMinimapAngleModifier = 2;
		}
		if (macroMinimapAngle > 60) {
			macroMinimapAngleModifier = -2;
		}

		if (macroMinimapZoom < -20) {
			macroMinimapZoomModifier = 1;
		}
		if (macroMinimapZoom > 10) {
			macroMinimapZoomModifier = -1;
		}

		noTimeoutTimer++;
		if (noTimeoutTimer > 50) {
			// NO_TIMEOUT
			out.p1Enc(232);
		}

		try {
			if (stream != null && out.pos > 0) {
				stream.write(out.data, out.pos);
				out.pos = 0;
				noTimeoutTimer = 0;
			}
		} catch (IOException var43) {
			lostCon();
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
			blitArea(var2, 10, 10, var3);
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
		if (!isMenuOpen) {
			menuVerb[0] = Text.CANCEL;
			menuSubject[0] = AUTO_EMPTY;
			menuNumEntries = 1;
			menuAction[0] = 1007;
		}

		if (toplevelinterface != -1) {
			animateInterface(toplevelinterface);
		}

		for (int var0 = 0; var0 < componentDrawCount; var0++) {
			if (componentDirtyArea[var0]) {
				componentBlitArea[var0] = true;
			}

			componentRedraw[var0] = componentDirtyArea[var0];
			componentDirtyArea[var0] = false;
		}

		hoveredSlotParent = null;
		minimenuMouseOverY = -1;
		componentDrawTime = loopCycle;
		minimenuMouseOverX = -1;
		if (toplevelinterface != -1) {
			componentDrawCount = 0;
			drawInterface(0, 0, toplevelinterface, 0, -1, 765, 503, 0);
		}
		Pix2D.resetClipping();
		sortMinimenu();
		if (isMenuOpen) {
			drawMinimenu();
		} else if (minimenuMouseOverX != -1) {
			drawFeedback(minimenuMouseOverY, minimenuMouseOverX);
		}
		if (componentRectDebug == 3) {
			for (int var1 = 0; var1 < componentDrawCount; var1++) {
				if (componentRedraw[var1]) {
					Pix2D.fillRectTrans(componentDrawX[var1], componentDrawY[var1], componentDrawWidth[var1], componentDrawHeight[var1], 0xff00ff, 128);
				} else if (componentBlitArea[var1]) {
					Pix2D.fillRectTrans(componentDrawX[var1], componentDrawY[var1], componentDrawWidth[var1], componentDrawHeight[var1], 0xff0000, 128);
				}
			}
		}
		BgSound.doMix(localPlayer.z, localPlayer.x, worldUpdateNum, minusedlevel);
		worldUpdateNum = 0;
	}

	@ObfuscatedName("ue.d(I)V")
	public static void setLowMem() {
		World.lowMem = true;
		lowMem = true;
	}

	@ObfuscatedName("ta.a(B)V")
	public static void setHighMem() {
		lowMem = false;
		World.lowMem = false;
	}

	@ObfuscatedName("r.a(ZB)V")
	public static void preventTimeout(boolean arg0) {
		doAudio();

		noTimeoutTimer++;
		if (noTimeoutTimer < 50 && !arg0) {
			return;
		}

		noTimeoutTimer = 0;

		if (networkError || stream == null) {
			return;
		}

		// NO_TIMEOUT
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
			// LOC_MERGE
			int var0 = in.g2_alt1();
			byte var1 = in.g1b_alt2();
			int var2 = in.g2_alt1();
			int var3 = in.g1_alt3();
			int var4 = var3 >> 2;
			int var5 = LOC_SHAPE_TO_LAYER[var4];
			int var6 = var3 & 0x3;
			byte var7 = in.g1b_alt1();
			int var8 = in.g2_alt2();
			byte var9 = in.g1b_alt3();
			int var10 = in.g2();
			byte var11 = in.g1b_alt1();
			int var12 = in.g1_alt3();
			int var13 = (var12 >> 4 & 0x7) + zoneUpdateX;
			int var14 = zoneUpdateZ + (var12 & 0x7);
			ClientPlayer var15;
			if (var8 == selfSlot) {
				var15 = localPlayer;
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
				ModelLit var27 = var16.getModelLit(var25, var4, var26, var23, var6, var24);
				if (var27 != null) {
					if (var9 > var7) {
						byte var28 = var9;
						var9 = var7;
						var7 = var28;
					}
					locChangeCreate(var14, var2 + 1, var13, var5, 0, minusedlevel, var0 + 1, 0, -1);
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
		} else if (ptype == 26) {
			int var30 = in.g2_alt1();
			int var31 = in.g1();
			int var32 = zoneUpdateX + (var31 >> 4 & 0x7);
			int var33 = zoneUpdateZ + (var31 & 0x7);
			int var34 = in.g2_alt3();
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
			int var39 = LOC_SHAPE_TO_LAYER[var38];
			int var40 = in.g1_alt2();
			int var41 = (var40 & 0x7) + zoneUpdateZ;
			int var42 = (var40 >> 4 & 0x7) + zoneUpdateX;
			int var43 = in.g2_alt2();
			if (var42 >= 0 && var41 >= 0 && var42 < 103 && var41 < 103) {
				if (var39 == 0) {
					Wall var44 = world.getWall(minusedlevel, var42, var41);
					if (var44 != null) {
						int var45 = var44.typecode >> 14 & 0x7FFF;
						if (var38 == 2) {
							var44.modelA = new ClientLocAnim(var45, 2, var37 + 4, minusedlevel, var42, var41, var43, false, var44.modelA);
							var44.modelB = new ClientLocAnim(var45, 2, var37 + 1 & 0x3, minusedlevel, var42, var41, var43, false, var44.modelB);
						} else {
							var44.modelA = new ClientLocAnim(var45, var38, var37, minusedlevel, var42, var41, var43, false, var44.modelA);
						}
					}
				}
				if (var39 == 1) {
					Decor var46 = world.getDecor(minusedlevel, var42, var41);
					if (var46 != null) {
						int var47 = var46.typecode >> 14 & 0x7FFF;
						if (var38 == 4 || var38 == 5) {
							var46.model = new ClientLocAnim(var47, 4, var37, minusedlevel, var42, var41, var43, false, var46.model);
						} else if (var38 == 6) {
							var46.model = new ClientLocAnim(var47, 4, var37 + 4, minusedlevel, var42, var41, var43, false, var46.model);
						} else if (var38 == 7) {
							var46.model = new ClientLocAnim(var47, 4, (var37 + 2 & 0x3) + 4, minusedlevel, var42, var41, var43, false, var46.model);
						} else if (var38 == 8) {
							var46.model = new ClientLocAnim(var47, 4, var37 + 4, minusedlevel, var42, var41, var43, false, var46.model);
							var46.model2 = new ClientLocAnim(var47, 4, (var37 + 2 & 0x3) + 4, minusedlevel, var42, var41, var43, false, var46.model2);
						}
					}
				}
				if (var39 == 2) {
					Sprite var48 = world.getScene(minusedlevel, var42, var41);
					if (var38 == 11) {
						var38 = 10;
					}
					if (var48 != null) {
						var48.model = new ClientLocAnim(var48.typecode >> 14 & 0x7FFF, var38, var37, minusedlevel, var42, var41, var43, false, var48.model);
					}
				}
				if (var39 == 3) {
					GroundDecor var49 = world.getGd(minusedlevel, var42, var41);
					if (var49 != null) {
						var49.model = new ClientLocAnim(var49.typecode >> 14 & 0x7FFF, 22, var37, minusedlevel, var42, var41, var43, false, var49.model);
					}
				}
			}
		} else if (ptype == 32) {
			int var50 = in.g1_alt2();
			int var51 = (var50 >> 4 & 0x7) + zoneUpdateX;
			int var52 = (var50 & 0x7) + zoneUpdateZ;
			int var53 = in.g2_alt1();
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
			int var57 = (var56 >> 4 & 0x7) + zoneUpdateX;
			int var58 = (var56 & 0x7) + zoneUpdateZ;
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
			int var64 = in.g1_alt1();
			int var65 = var64 >> 2;
			int var66 = var64 & 0x3;
			int var67 = LOC_SHAPE_TO_LAYER[var65];
			int var68 = in.g1_alt2();
			int var69 = zoneUpdateX + (var68 >> 4 & 0x7);
			int var70 = zoneUpdateZ + (var68 & 0x7);
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
				locChangeCreate(var70, 0, var69, var67, var66, minusedlevel, -1, var65, -1);
			}
		} else if (ptype == 120) {
			int var71 = in.g1();
			int var72 = zoneUpdateZ + (var71 & 0x7);
			int var73 = (var71 >> 4 & 0x7) + zoneUpdateX;
			int var74 = in.g2();
			int var75 = in.g1();
			int var76 = in.g2();
			if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
				int var77 = var72 * 128 + 64;
				int var78 = var73 * 128 + 64;
				MapSpotAnim var79 = new MapSpotAnim(var74, minusedlevel, var78, var77, getAvH(minusedlevel, var78, var77) - var75, var76, loopCycle);
				spotanims.push(var79);
			}
		} else if (ptype == 103) {
			int var80 = in.g2_alt1();
			int var81 = in.g2_alt2();
			int var82 = in.g1_alt3();
			int var83 = zoneUpdateX + (var82 >> 4 & 0x7);
			int var84 = zoneUpdateZ + (var82 & 0x7);
			int var85 = in.g2_alt3();
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
			int var87 = in.g1_alt2();
			int var88 = var87 >> 2;
			int var89 = var87 & 0x3;
			int var90 = LOC_SHAPE_TO_LAYER[var88];
			int var91 = in.g2_alt2();
			int var92 = in.g1_alt1();
			int var93 = (var92 >> 4 & 0x7) + zoneUpdateX;
			int var94 = (var92 & 0x7) + zoneUpdateZ;
			if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
				locChangeCreate(var94, 0, var93, var90, var89, minusedlevel, -1, var88, var91);
			}
		} else if (ptype == 195) {
			int var95 = in.g1();
			int var96 = zoneUpdateX + (var95 >> 4 & 0x7);
			int var97 = (var95 & 0x7) + zoneUpdateZ;
			int var98 = in.g2();
			int var99 = in.g1();
			int var100 = in.g1();
			int var101 = var99 & 0x7;
			int var102 = var99 >> 4 & 0xF;
			if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
				int var103 = var102 + 1;
				if (var96 - var103 <= localPlayer.routeX[0] && localPlayer.routeX[0] <= var103 + var96 && var97 - var103 <= localPlayer.routeZ[0] && localPlayer.routeZ[0] <= var97 + var103 && ambientVolume != 0 && var101 > 0 && waveCount < 50) {
					waveSoundIds[waveCount] = var98;
					waveLoops[waveCount] = var101;
					waveDelay[waveCount] = var100;
					waveSounds[waveCount] = null;
					wameAmbient[waveCount] = var102 + (var97 << 8) + (var96 << 16);
					waveCount++;
				}
			}
		} else if (ptype == 82) {
			int var104 = in.g1();
			int var105 = (var104 >> 4 & 0x7) + zoneUpdateX;
			int var106 = zoneUpdateZ + (var104 & 0x7);
			int var107 = var105 + in.g1b();
			int var108 = in.g1b() + var106;
			int var109 = in.g2b();
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
				projectiles.push(var120);
			}
		}
	}

	@ObfuscatedName("na.a(I)V")
	public static void errorUsage() {
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
		int[][] var19 = collision[minusedlevel].flags;
		while (var35 != var15) {
			var14 = routeZ[var15];
			var13 = routeX[var15];
			var15 = (var15 + 1) % var18;
			if (arg5 == var13 && arg8 == var14) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && collision[minusedlevel].testWall(arg1, arg8, var14, arg5, arg3 - 1, var13)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && collision[minusedlevel].testWDecor(arg5, arg3 - 1, arg1, var13, var14, arg8)) {
					var17 = true;
					break;
				}
			}
			if (arg9 != 0 && arg4 != 0 && collision[minusedlevel].testLoc(var14, arg9, arg4, var13, arg8, arg5, arg7)) {
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
				// MOVE_GAMECLICK
				out.p1Enc(184);
				out.p1(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				// MOVE_MINIMAPCLICK
				out.p1Enc(24);
				out.p1(var31 + var31 + 17);
			}
			if (arg10 == 2) {
				// MOVE_OPCLICK (custom name)
				out.p1Enc(110);
				out.p1(var31 + var31 + 3);
			}
			out.p2_alt3(var33 + mapBuildBaseX);
			minimapFlagX = routeX[0];
			minimapFlagZ = routeZ[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				out.p1_alt2(routeX[var36] - var33);
				out.p1_alt1(routeZ[var36] - var32);
			}
			out.p1_alt2(ClientKeyboardListener.keyHeld[82] ? 1 : 0);
			out.p2(var32 + mapBuildBaseZ);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("vc.a(IILec;)V")
	public static void opPlayer(int arg0, JagString arg1) {
		JagString var2 = arg1.method244().toScreenName();

		boolean found = false;
		for (int i = 0; i < playerCount; i++) {
			ClientPlayer player = players[playerIds[i]];
			if (player != null && player.name != null && player.name.equalsIgnoreCase(var2)) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, player.routeX[0], localPlayer.routeX[0], 0, player.routeZ[0], 1, 2);

				if (arg0 == 1) {
					// OPPLAYER1
					out.p1Enc(35);
					out.p2_alt1(playerIds[i]);
				} else if (arg0 == 4) {
					// OPPLAYER4
					out.p1Enc(81);
					out.p2_alt3(playerIds[i]);
				} else if (arg0 == 6) {
					// OPPLAYER6
					out.p1Enc(193);
					out.p2(playerIds[i]);
				} else if (arg0 == 7) {
					// OPPLAYER7
					out.p1Enc(138);
					out.p2_alt2(playerIds[i]);
				}

				found = true;
				break;
			}
		}
		if (!found) {
			addChat(JagString.join(new JagString[] { Text.UNABLETOFIND, var2 }), 0, AUTO_EMPTY);
		}
	}

	@ObfuscatedName("vc.a(JI)V")
	public static void friendsChatJoinChat(long arg0) {
		if (arg0 != 0L) {
			// CLAN_JOINCHAT_LEAVECHAT
			out.p1Enc(23);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("ba.a(B)V")
	public static void getPlayerPosOldVis() {
		int var0 = in.gBit(8);
		if (playerCount > var0) {
			for (int var1 = var0; var1 < playerCount; var1++) {
				entityRemovalIds[entityRemovalCount++] = playerIds[var1];
			}
		}
		if (playerCount < var0) {
			throw new RuntimeException("gppov1");
		}
		playerCount = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = playerIds[var2];
			ClientPlayer var4 = players[var3];
			int var5 = in.gBit(1);
			if (var5 == 0) {
				playerIds[playerCount++] = var3;
				var4.cycle = loopCycle;
			} else {
				int var6 = in.gBit(2);
				if (var6 == 0) {
					playerIds[playerCount++] = var3;
					var4.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var3;
				} else if (var6 == 1) {
					playerIds[playerCount++] = var3;
					var4.cycle = loopCycle;
					int var7 = in.gBit(3);
					var4.moveCode(var7, false);
					int var8 = in.gBit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 2) {
					playerIds[playerCount++] = var3;
					var4.cycle = loopCycle;
					int var9 = in.gBit(3);
					var4.moveCode(var9, true);
					int var10 = in.gBit(3);
					var4.moveCode(var10, true);
					int var11 = in.gBit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 3) {
					entityRemovalIds[entityRemovalCount++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("nd.a(ILec;B)V")
	public static void setFriendRank(int arg0, JagString arg1) {
		// FRIEND_SETRANK
		out.p1Enc(205);
		out.p1_alt3(arg0);
		out.p8_alt1(arg1.toUserhash());
	}

	@ObfuscatedName("nd.b(I)V")
	public static void getNpcPosOldVis() {
		in.gBitStart();
		int var0 = in.gBit(8);
		if (var0 < npcCount) {
			for (int var1 = var0; var1 < npcCount; var1++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var1];
			}
		}
		if (npcCount < var0) {
			throw new RuntimeException("gnpov1");
		}
		npcCount = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = npcIds[var2];
			ClientNpc var4 = npcs[var3];
			int var5 = in.gBit(1);
			if (var5 == 0) {
				npcIds[npcCount++] = var3;
				var4.cycle = loopCycle;
			} else {
				int var6 = in.gBit(2);
				if (var6 == 0) {
					npcIds[npcCount++] = var3;
					var4.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var3;
				} else if (var6 == 1) {
					npcIds[npcCount++] = var3;
					var4.cycle = loopCycle;
					int var7 = in.gBit(3);
					var4.moveCode(var7, false);
					int var8 = in.gBit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 2) {
					npcIds[npcCount++] = var3;
					var4.cycle = loopCycle;
					int var9 = in.gBit(3);
					var4.moveCode(var9, true);
					int var10 = in.gBit(3);
					var4.moveCode(var10, true);
					int var11 = in.gBit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 3) {
					entityRemovalIds[entityRemovalCount++] = var3;
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
		int var5 = mapBuildBaseX;
		mapBuildBaseX = arg3 * 8 - 48;
		int var6 = mapBuildBaseZ;
		mapBuildBaseZ = (arg2 - 6) * 8;
		int var7 = mapBuildBaseX - var5;
		int var8 = mapBuildBaseZ - var6;
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
		localPlayer.teleport(arg1, false, arg4);
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
		for (LocChange var26 = (LocChange) locChanges.head(); var26 != null; var26 = (LocChange) locChanges.next()) {
			var26.x -= var7;
			var26.z -= var8;
			if (var26.x < 0 || var26.z < 0 || var26.x >= 104 || var26.z >= 104) {
				var26.unlink();
			}
		}
		if (minimapFlagX != 0) {
			minimapFlagX -= var7;
			minimapFlagZ -= var8;
		}
		cinemaCam = false;
		waveCount = 0;
		minimapLevel = -1;
		spotanims.clear();
		projectiles.clear();
	}

	@ObfuscatedName("fb.a(III)V")
	public static void playJingle(int arg0, int arg1) {
		if (midiVolume != 0 && arg0 != -1) {
			MidiManager.play(jingles, arg0, midiVolume, 0);
			playingJingle = true;
		}
	}

	@ObfuscatedName("te.a(Z)V")
	public static void followCamera() {
		if (ClientKeyboardListener.keyHeld[98]) {
			orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
		} else if (ClientKeyboardListener.keyHeld[99]) {
			orbitCameraPitchVelocity += (-orbitCameraPitchVelocity - 12) / 2;
		} else {
			orbitCameraPitchVelocity /= 2;
		}
		orbitCameraPitch += orbitCameraPitchVelocity / 2;
		if (orbitCameraPitch < 128) {
			orbitCameraPitch = 128;
		}
		if (orbitCameraPitch > 383) {
			orbitCameraPitch = 383;
		}
		if (ClientKeyboardListener.keyHeld[96]) {
			orbitCameraYawVelocity += (-orbitCameraYawVelocity - 24) / 2;
		} else if (ClientKeyboardListener.keyHeld[97]) {
			orbitCameraYawVelocity += (24 - orbitCameraYawVelocity) / 2;
		} else {
			orbitCameraYawVelocity /= 2;
		}
		orbitCameraYaw = orbitCameraYaw + orbitCameraYawVelocity / 2 & 0x7FF;
		int var0 = macroCameraX + localPlayer.x;
		int var1 = macroCameraZ + localPlayer.z;
		if (orbitCameraX - var0 < -500 || orbitCameraX - var0 > 500 || orbitCameraZ - var1 < -500 || orbitCameraZ - var1 > 500) {
			orbitCameraZ = var1;
			orbitCameraX = var0;
		}
		if (orbitCameraX != var0) {
			orbitCameraX += (var0 - orbitCameraX) / 16;
		}
		if (var1 != orbitCameraZ) {
			orbitCameraZ += (var1 - orbitCameraZ) / 16;
		}
		int var2 = orbitCameraX >> 7;
		int var3 = 0;
		int var4 = orbitCameraZ >> 7;
		int var5 = getAvH(minusedlevel, orbitCameraX, orbitCameraZ);
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
		if (var10 > cameraPitchClamp) {
			cameraPitchClamp += (var10 - cameraPitchClamp) / 24;
		} else if (cameraPitchClamp > var10) {
			cameraPitchClamp += (var10 - cameraPitchClamp) / 80;
		}
	}

	@ObfuscatedName("te.a(B)V")
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

	@ObfuscatedName("i.a(ILec;IIILec;I)V")
	public static void addMenuOption(int arg0, JagString arg1, int arg2, int arg3, JagString arg4, int arg5) {
		if (isMenuOpen || menuNumEntries >= 500) {
			return;
		}
		menuVerb[menuNumEntries] = arg1;
		menuSubject[menuNumEntries] = arg4;
		menuAction[menuNumEntries] = arg3;
		field3135[menuNumEntries] = arg0;
		field2868[menuNumEntries] = arg5;
		field3620[menuNumEntries] = arg2;
		menuNumEntries++;
	}

	@ObfuscatedName("i.a(BIIII)V")
	public static void entityOverlays(int arg0, int arg1, int arg2, int arg3) {
		chatCount = 0;
		for (int var4 = -1; var4 < playerCount + npcCount; var4++) {
			ClientEntity var5;
			if (var4 == -1) {
				var5 = localPlayer;
			} else if (var4 < playerCount) {
				var5 = players[playerIds[var4]];
			} else {
				var5 = npcs[npcIds[var4 - playerCount]];
			}
			if (var5 != null && var5.ready()) {
				if (var5 instanceof ClientNpc) {
					NpcType var6 = ((ClientNpc) var5).type;
					if (var6.multinpc != null) {
						var6 = var6.getMultiNpc();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (playerCount <= var4) {
					NpcType var7 = ((ClientNpc) var5).type;
					if (var7.multinpc != null) {
						var7 = var7.getMultiNpc();
					}
					if (var7.headicon >= 0 && var7.headicon < headiconsPrayer.length) {
						getOverlayPos(var5, var5.height + 15);
						if (projectX > -1) {
							headiconsPrayer[var7.headicon].plotSprite(arg2 + projectX - 12, projectY + arg1 - 30);
						}
					}
					if (hintType == 1 && hintNpc == npcIds[var4 - playerCount] && loopCycle % 20 < 10) {
						getOverlayPos(var5, var5.height + 15);
						if (projectX > -1) {
							headiconsHint[0].plotSprite(arg2 + projectX - 12, arg1 + projectY + -28);
						}
					}
				} else {
					int var8 = 30;
					ClientPlayer var9 = (ClientPlayer) var5;
					if (var9.headiconPk != -1 || var9.headiconPrayer != -1) {
						getOverlayPos(var5, var5.height + 15);
						if (projectX > -1) {
							if (var9.headiconPk != -1) {
								headiconsPk[var9.headiconPk].plotSprite(arg2 + projectX - 12, projectY + -30 + arg1);
								var8 += 25;
							}
							if (var9.headiconPrayer != -1) {
								headiconsPrayer[var9.headiconPrayer].plotSprite(arg2 + projectX - 12, -var8 + projectY + arg1);
								var8 += 25;
							}
						}
					}
					if (var4 >= 0 && hintType == 10 && playerIds[var4] == hintPlayer) {
						getOverlayPos(var5, var5.height + 15);
						if (projectX > -1) {
							headiconsHint[1].plotSprite(arg2 + projectX - 12, -var8 + arg1 + projectY);
						}
					}
				}
				if (var5.chat != null && (var4 >= playerCount || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var5).name))) {
					getOverlayPos(var5, var5.height);
					if (projectX > -1 && MAX_CHATS > chatCount) {
						chatWidth[chatCount] = b12.stringWid(var5.chat) / 2;
						chatHeight[chatCount] = b12.ascent;
						chatX[chatCount] = projectX;
						chatY[chatCount] = projectY;
						chatColour[chatCount] = var5.field2753;
						chatEffect[chatCount] = var5.field2749;
						chatTimer[chatCount] = var5.chatTimer;
						chats[chatCount] = var5.chat;
						chatCount++;
					}
				}
				if (loopCycle < var5.combatCycle) {
					getOverlayPos(var5, var5.height + 15);
					if (projectX > -1) {
						int var10 = var5.field2755 * 30 / var5.field2738;
						if (var10 > 30) {
							var10 = 30;
						}
						Pix2D.fillRect(arg2 + projectX - 15, arg1 - -projectY + -3, var10, 5, 65280);
						Pix2D.fillRect(var10 + projectX + arg2 - 15, arg1 - -projectY + -3, 30 - var10, 5, 16711680);
					}
				}
				for (int var11 = 0; var11 < 4; var11++) {
					if (loopCycle < var5.damageCycles[var11]) {
						getOverlayPos(var5, var5.height / 2);
						if (projectX > -1) {
							if (var11 == 1) {
								projectY -= 20;
							}
							if (var11 == 2) {
								projectX -= 15;
								projectY -= 10;
							}
							if (var11 == 3) {
								projectX += 15;
								projectY -= 10;
							}
							hitmarks[var5.danageTypes[var11]].plotSprite(projectX + arg2 - 12, projectY + (arg1 - 12));
							p11.centreString(JagString.parseInt(var5.damageValues[var11]), arg2 + projectX - 1, arg1 - -projectY + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var12 = 0; var12 < chatCount; var12++) {
			int var13 = chatX[var12];
			int var14 = chatY[var12];
			int var15 = chatWidth[var12];
			int var16 = chatHeight[var12];
			boolean var17 = true;
			while (var17) {
				var17 = false;
				for (int var18 = 0; var18 < var12; var18++) {
					if (chatY[var18] - chatHeight[var18] < var14 + 2 && chatY[var18] + 2 > var14 + -var16 && var13 - var15 < chatWidth[var18] + chatX[var18] && var13 + var15 > -chatWidth[var18] + chatX[var18] && chatY[var18] - chatHeight[var18] < var14) {
						var14 = chatY[var18] - chatHeight[var18];
						var17 = true;
					}
				}
			}
			projectX = chatX[var12];
			projectY = chatY[var12] = var14;
			JagString var19 = chats[var12];
			if (field1035 == 0) {
				int var20 = 16776960;
				if (chatColour[var12] < 6) {
					var20 = field1390[chatColour[var12]];
				}
				if (chatColour[var12] == 6) {
					var20 = sceneCycle % 20 < 10 ? 16711680 : 16776960;
				}
				if (chatColour[var12] == 7) {
					var20 = sceneCycle % 20 >= 10 ? 65535 : 255;
				}
				if (chatColour[var12] == 8) {
					var20 = sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (chatColour[var12] == 9) {
					int var21 = 150 - chatTimer[var12];
					if (var21 < 50) {
						var20 = var21 * 1280 + 16711680;
					} else if (var21 < 100) {
						var20 = 16384000 + 16776960 - var21 * 327680;
					} else if (var21 < 150) {
						var20 = (var21 - 100) * 5 + 65280;
					}
				}
				if (chatColour[var12] == 10) {
					int var22 = 150 - chatTimer[var12];
					if (var22 < 50) {
						var20 = var22 * 5 + 16711680;
					} else if (var22 < 100) {
						var20 = 16711935 - (var22 - 50) * 327680;
					} else if (var22 < 150) {
						var20 = var22 * 327680 + 255 + 500 - var22 * 5 - 32768000;
					}
				}
				if (chatColour[var12] == 11) {
					int var23 = 150 - chatTimer[var12];
					if (var23 < 50) {
						var20 = 16777215 - var23 * 327685;
					} else if (var23 < 100) {
						var20 = (var23 - 50) * 327685 + 65280;
					} else if (var23 < 150) {
						var20 = 16777215 - (var23 - 100) * 327680;
					}
				}
				if (chatEffect[var12] == 0) {
					b12.centreString(var19, projectX + arg2, projectY + arg1, var20, 0);
				}
				if (chatEffect[var12] == 1) {
					b12.centreStringWave(var19, arg2 + projectX, projectY + arg1, var20, sceneCycle);
				}
				if (chatEffect[var12] == 2) {
					b12.centreStringWave2(var19, projectX + arg2, projectY + arg1, var20, sceneCycle);
				}
				if (chatEffect[var12] == 3) {
					b12.centreStringWave3(var19, arg2 + projectX, arg1 + projectY, var20, sceneCycle, 150 - chatTimer[var12]);
				}
				if (chatEffect[var12] == 4) {
					int var24 = (150 - chatTimer[var12]) * (b12.stringWid(var19) + 100) / 150;
					Pix2D.setSubClipping(projectX + arg2 - 50, arg1, projectX + arg2 + 50, arg1 + arg0);
					b12.drawString(var19, arg2 + projectX + 50 - var24, arg1 - -projectY, var20, 0);
					Pix2D.setClipping(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
				if (chatEffect[var12] == 5) {
					int var25 = 150 - chatTimer[var12];
					Pix2D.setSubClipping(arg2, arg1 + projectY - b12.ascent - 1, arg2 - -arg3, projectY + arg1 + 5);
					int var26 = 0;
					if (var25 < 25) {
						var26 = var25 - 25;
					} else if (var25 > 125) {
						var26 = var25 - 125;
					}
					b12.centreString(var19, arg2 + projectX, arg1 + projectY + var26, var20, 0);
					Pix2D.setClipping(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
			} else {
				b12.centreString(var19, projectX + arg2, projectY + arg1, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("na.e(I)V")
	public static void logout() {
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
		MidiManager.stop2();
		playingJingle = false;
		nextMidiSong = -1;
		BgSound.reset();
		setMainState(10);
	}

	@ObfuscatedName("na.a(B)V")
	public static void getPlayerPos() {
		entityUpdateCount = 0;
		entityRemovalCount = 0;
		getPlayerPosLocal();
		getPlayerPosOldVis();
		getPlayerPosNewVis();
		getPlayerPosExtended();
		for (int var0 = 0; var0 < entityRemovalCount; var0++) {
			int var1 = entityRemovalIds[var0];
			if (players[var1].cycle != loopCycle) {
				players[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < playerCount; var2++) {
			if (players[playerIds[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + playerCount);
			}
		}
	}

	@ObfuscatedName("na.d(I)V")
	public static void loopIf3Drag() {
		componentUpdated(dragCom);
		dragTime++;
		if (dragging && dragParentFound) {
			int var0 = ClientMouseListener.mouseX;
			int var1 = ClientMouseListener.mouseY;
			int var2 = var0 - dragPickupX;
			if (var2 < dragParentX) {
				var2 = dragParentX;
			}
			int var3 = dragCom.dragdeadzone;
			int var4 = var1 - dragPickupY;
			if (dragParentX + dragLayer.width < dragCom.width + var2) {
				var2 = dragLayer.width + dragParentX - dragCom.width;
			}
			int var5 = var2 - dragCurrentX;
			if (dragParentY > var4) {
				var4 = dragParentY;
			}
			int var6 = dragLayer.field843 + var2 - dragParentX;
			if (dragLayer.height + dragParentY < dragCom.height + var4) {
				var4 = dragLayer.height + dragParentY - dragCom.height;
			}
			int var7 = var4 - dragCurrentY;
			if (dragTime > dragCom.dragdeadtime && (var3 < var5 || -var3 > var5 || var3 < var7 || -var3 > var7)) {
				dragAlive = true;
			}
			int var8 = dragLayer.scrollPosY + var4 - dragParentY;
			if (dragCom.ondrag != null && dragAlive) {
				HookReq var9 = new HookReq();
				var9.mouseX = var6;
				var9.onop = dragCom.ondrag;
				var9.component = dragCom;
				var9.mouseY = var8;
				ScriptRunner.executeScript(var9);
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (dragAlive) {
					if (dragCom.ondragcomplete != null) {
						HookReq var10 = new HookReq();
						var10.mouseX = var6;
						var10.mouseY = var8;
						var10.component = dragCom;
						var10.drop = dropCom;
						var10.onop = dragCom.ondragcomplete;
						ScriptRunner.executeScript(var10);
					}
					if (dropCom != null && serverDraggable(dragCom) != null) {
						// IF_BUTTOND
						out.p1Enc(178);
						out.p4_alt3(dropCom.parentId);
						out.p2_alt2(dropCom.subId);
						out.p4_alt1(dragCom.parentId);
						out.p2_alt1(dragCom.subId);
					}
				} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					openMenu();
				} else if (menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}
				dragCom = null;
			}
		} else if (dragTime > 1) {
			dragCom = null;
		}
	}

	@ObfuscatedName("na.c(I)V")
	public static void locChangeDoQueue() {
		for (LocChange var0 = (LocChange) locChanges.head(); var0 != null; var0 = (LocChange) locChanges.next()) {
			if (var0.endTime > 0) {
				var0.endTime--;
			}
			if (var0.endTime != 0) {
				if (var0.startTime > 0) {
					var0.startTime--;
				}
				if (var0.startTime == 0 && var0.x >= 1 && var0.z >= 1 && var0.x <= 102 && var0.z <= 102 && (var0.field414 < 0 || ClientBuild.changeLocAvailable(var0.field414, var0.field404))) {
					locChangeUnchecked(var0.field404, var0.layer, var0.x, var0.field414, var0.field413, var0.level, var0.z);
					var0.startTime = -1;
					if (var0.field406 == var0.field414 && var0.field406 == -1) {
						var0.unlink();
					} else if (var0.field406 == var0.field414 && var0.field410 == var0.field413 && var0.field404 == var0.field408) {
						var0.unlink();
					}
				}
			} else if (var0.field406 < 0 || ClientBuild.changeLocAvailable(var0.field406, var0.field408)) {
				locChangeUnchecked(var0.field408, var0.layer, var0.x, var0.field406, var0.field410, var0.level, var0.z);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("na.a(IJ)V")
	public static void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (friendCount >= 100 && membersAccount != 1 || friendCount >= 200) {
			addChat(Text.FRIENDLISTFULL, 0, AUTO_EMPTY);
			return;
		}
		JagString var2 = JString.toRawUsername(arg0).toScreenName();
		for (int var3 = 0; var3 < friendCount; var3++) {
			if (field694[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.FRIENDLISTDUPE}), 0, AUTO_EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < ignoreCount; var4++) {
			if (ignoreUserhash[var4] == arg0) {
				addChat(JagString.join(new JagString[] { Text.field97, var2, Text.REMOVEIGNORE2}), 0, AUTO_EMPTY);
				return;
			}
		}
		if (var2.strEquals(localPlayer.name)) {
			addChat(Text.FRIENDCANTADDSELF, 0, AUTO_EMPTY);
			return;
		}
		field239[friendCount] = var2;
		field694[friendCount] = arg0;
		field2094[friendCount] = 0;
		field103[friendCount] = 0;
		friendTransmitNum = transmitNum;
		friendCount++;

		// FRIENDLIST_ADD
		out.p1Enc(28);
		out.p8(arg0);
	}

	@ObfuscatedName("na.a(Lec;B)V")
	public static void friendsChatKickUser(JagString arg0) {
		if (friendChatList == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.toUserhash();
		if (var2 == 0L) {
			return;
		}
		while (var1 < friendChatList.length && friendChatList[var1].key != var2) {
			var1++;
		}
		if (friendChatList.length > var1 && friendChatList[var1] != null) {
			// CLAN_KICKUSER
			out.p1Enc(194);
			out.p8(friendChatList[var1].key);
		}
	}

	@ObfuscatedName("sf.a(IIIILh;Z)V")
	public static void minimapDrawArrow(int arg0, int arg1, int arg2, int arg3, Pix32 arg4) {
		int var5 = arg0 * arg0 + arg3 * arg3;
		if (var5 <= 4225 || var5 >= 90000) {
			minimapDrawDot(arg2, arg1, arg3, arg4, arg0);
			return;
		}
		int var6 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var7 = Pix3D.cosTable[var6];
		int var8 = var7 * 256 / (macroMinimapZoom + 256);
		int var9 = Pix3D.sinTable[var6];
		int var10 = var9 * 256 / (macroMinimapZoom + 256);
		int var11 = arg0 * var8 + arg3 * var10 >> 16;
		int var12 = arg3 * var8 - arg0 * var10 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		mapedge.rotateTransPlotSprite(arg2 + var15 + 94 - 6, -20 + 83 + arg1 + -var16, var13);
	}

	@ObfuscatedName("a.a(III)V")
	public static void minimapLoop(int arg0, int arg1) {
		if (minimapState != 0 && minimapState != 3 || ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		int var2 = ClientMouseListener.mouseClickX - arg0 - 25;
		int var3 = ClientMouseListener.mouseClickY - arg1 - 5;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var5 = Pix3D.sinTable[var4];
		int var6 = (macroMinimapZoom + 256) * var5 >> 8;
		int var7 = Pix3D.cosTable[var4];
		int var8 = (macroMinimapZoom + 256) * var7 >> 8;
		int var9 = var3 * var8 - var2 * var6 >> 11;
		int var10 = var6 * var3 + var2 * var8 >> 11;
		int var11 = localPlayer.z - var9 >> 7;
		int var12 = localPlayer.x + var10 >> 7;
		boolean var13 = tryMove(true, 0, localPlayer.routeZ[0], 0, 0, var12, localPlayer.routeX[0], 0, var11, 0, 1);
		if (var13) {
			out.p1(var2);
			out.p1(var3);
			out.p2(orbitCameraYaw);
			out.p1(57);
			out.p1(macroMinimapAngle);
			out.p1(macroMinimapZoom);
			out.p1(89);
			out.p2(localPlayer.x);
			out.p2(localPlayer.z);
			out.p1(field1327);
			out.p1(63);
		}
	}

	@ObfuscatedName("t.a(Lf;B)V")
	public static void componentUpdated(IfType arg0) {
		if (arg0.drawTime == componentDrawTime) {
			componentDirtyArea[arg0.drawCount] = true;
		}
	}

	@ObfuscatedName("pc.a(B)V")
	public static void prepareMinimap() {
		compassMaskLineLengths = new int[33];
		compassMaskLineOffsets = new int[33];
		minimapMaskLineLengths = new int[151];
		minimapMaskLineOffsets = new int[151];
		for (int var0 = 0; var0 < 33; var0++) {
			int var1 = 999;
			int var2 = 0;
			for (int var3 = 0; var3 < 34; var3++) {
				if (mapback.data[mapback.wi * var0 + var3] == 0) {
					if (var1 == 999) {
						var1 = var3;
					}
				} else if (var1 != 999) {
					var2 = var3;
					break;
				}
			}
			compassMaskLineOffsets[var0] = var1;
			compassMaskLineLengths[var0] = var2 - var1;
		}
		for (int var4 = 5; var4 < 156; var4++) {
			int var5 = 999;
			int var6 = 0;
			for (int var7 = 25; var7 < 172; var7++) {
				if (mapback.data[var7 + mapback.wi * var4] == 0 && (var7 > 34 || var4 > 34)) {
					if (var5 == 999) {
						var5 = var7;
					}
				} else if (var5 != 999) {
					var6 = var7;
					break;
				}
			}
			minimapMaskLineOffsets[var4 - 5] = var5 - 25;
			minimapMaskLineLengths[var4 - 5] = var6 - var5;
		}
	}

	@ObfuscatedName("pc.c(II)V")
	public static void purgeServerActive(int arg0) {
		for (ServerActive var1 = (ServerActive) serverActive.search(); var1 != null; var1 = (ServerActive) serverActive.findnext()) {
			if ((long) arg0 == (var1.key >> 48 & 0xFFFFL)) {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("oe.b(I)V")
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
		((TextureManager) Pix3D.textureManager).reset();
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
	public static void closeModal() {
		// CLOSE_MODAL
		out.p1Enc(113);

		for (SubInterface sub = (SubInterface) subinterfaces.search(); sub != null; sub = (SubInterface) subinterfaces.findnext()) {
			if (sub.type == 0 || sub.type == 3) {
				closeSubInterface(true, sub);
			}
		}

		if (resumePauseCom != null) {
			componentUpdated(resumePauseCom);
			resumePauseCom = null;
		}
	}

	@ObfuscatedName("pf.b(Z)V")
	public static void getSpecialArea() {
		chatDisabled = 0;

		int x = (localPlayer.x >> 7) + mapBuildBaseX;
		int z = (localPlayer.z >> 7) + mapBuildBaseZ;

		if (x >= 3053 && x <= 3156 && z >= 3056 && z <= 3136) {
			chatDisabled = 1;
		} else if (x >= 3072 && x <= 3118 && z >= 9492 && z <= 9535) {
			chatDisabled = 1;
		}

		if (chatDisabled == 1 && x >= 3139 && x <= 3199 && z >= 3008 && z <= 3062) {
			chatDisabled = 0;
		}
	}

	@ObfuscatedName("aa.a(BI)V")
	public static void minimapBuildBuffer(int arg0) {
		int[] var1 = minimap.data;
		int var2 = var1.length;
		for (int var3 = 0; var3 < var2; var3++) {
			var1[var3] = 0;
		}
		for (int var4 = 1; var4 < 103; var4++) {
			int var5 = (52736 - var4 * 512) * 4 + 24628;
			for (int var6 = 1; var6 < 103; var6++) {
				if ((ClientBuild.mapl[arg0][var6][var4] & 0x18) == 0) {
					world.render2DGround(var1, var5, arg0, var6, var4);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var6][var4] & 0x8) != 0) {
					world.render2DGround(var1, var5, arg0 + 1, var6, var4);
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
					drawDetail(var7, arg0, var10, var9, var8);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var10][var9] & 0x8) != 0) {
					drawDetail(var7, arg0 + 1, var10, var9, var8);
				}
			}
		}
		activeMapFunctionCount = 0;
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				int var13 = world.gdType(minusedlevel, var11, var12);
				if (var13 != 0) {
					int var14 = var13 >> 14 & 0x7FFF;
					int var15 = LocType.list(var14).mapfunction;
					if (var15 < 0) {
						continue;
					}
					int var16 = var11;
					int var17 = var12;
					if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
						int[][] var18 = collision[minusedlevel].flags;
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
					activeMapFunctions[activeMapFunctionCount] = mapfunction[var15];
					activeMapFunctionX[activeMapFunctionCount] = var16;
					activeMapFunctionZ[activeMapFunctionCount] = var17;
					activeMapFunctionCount++;
				}
			}
		}
		drawArea.bind();
	}

	@ObfuscatedName("ad.a(I)I")
	public static int roofCheck() {
		int var0 = 3;
		if (camPitch < 310) {
			int var1 = camX >> 7;
			int var2 = camZ >> 7;
			if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
				var0 = minusedlevel;
			}
			int var3 = localPlayer.x >> 7;
			int var4 = localPlayer.z >> 7;
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
		if ((ClientBuild.mapl[minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var0 = minusedlevel;
		}
		return var0;
	}

	@ObfuscatedName("wa.a(IIB)V")
	public static void runHookImmediate(int arg0, int arg1) {
		if (IfType.openInterface(arg0)) {
			runHookLayer(IfType.list[arg0], arg1);
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
			int var7 = var6.cost;
			if (var6.stackable == 1) {
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
		int var11 = arg1 + (arg0 << 7) + 0x60000000;
		world.setObj(minusedlevel, arg1, arg0, getAvH(minusedlevel, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var8, var10);
	}

	@ObfuscatedName("wd.a(Z)V")
	public static void cinemaCamera() {
		int var0 = camMoveToLx * 128 + 64;
		int var1 = camMoveToLz * 128 + 64;
		int var2 = getAvH(minusedlevel, var0, var1) - camMoveToHei;
		if (camX < var0) {
			camX += camMoveToRate + camMoveToRate2 * (var0 - camX) / 1000;
			if (var0 < camX) {
				camX = var0;
			}
		}
		if (var2 > camY) {
			camY += (var2 - camY) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camY > var2) {
				camY = var2;
			}
		}
		if (var2 < camY) {
			camY -= (camY - var2) * camMoveToRate2 / 1000 + camMoveToRate;
			if (var2 > camY) {
				camY = var2;
			}
		}
		if (camZ < var1) {
			camZ += camMoveToRate + (var1 - camZ) * camMoveToRate2 / 1000;
			if (var1 < camZ) {
				camZ = var1;
			}
		}
		if (var0 < camX) {
			camX -= camMoveToRate + (camX - var0) * camMoveToRate2 / 1000;
			if (camX < var0) {
				camX = var0;
			}
		}
		int var3 = camLookAtLx * 128 + 64;
		if (camZ > var1) {
			camZ -= camMoveToRate2 * (camZ - var1) / 1000 + camMoveToRate;
			if (var1 > camZ) {
				camZ = var1;
			}
		}
		int var4 = camLookAtLz * 128 + 64;
		int var5 = getAvH(minusedlevel, var3, var4) - camLookAtHei;
		int var6 = var4 - camZ;
		int var7 = var3 - camX;
		int var8 = var5 - camY;
		int var9 = (int) Math.sqrt((double) (var7 * var7 + var6 * var6));
		int var10 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var7, (double) var6) * -325.949D) & 0x7FF;
		int var12 = var11 - camYaw;
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
		if (camPitch < var10) {
			camPitch += camLookAtRate + camLookAtRate2 * (var10 - camPitch) / 1000;
			if (camPitch > var10) {
				camPitch = var10;
			}
		}
		if (var12 > 0) {
			camYaw += camLookAtRate2 * var12 / 1000 + camLookAtRate;
			camYaw &= 0x7FF;
		}
		if (var12 < 0) {
			camYaw -= camLookAtRate + -var12 * camLookAtRate2 / 1000;
			camYaw &= 0x7FF;
		}
		if (var10 < camPitch) {
			camPitch -= camLookAtRate2 * (camPitch - var10) / 1000 + camLookAtRate;
			if (camPitch < var10) {
				camPitch = var10;
			}
		}
		int var13 = var11 - camYaw;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
			camYaw = var11;
		}
	}

	@ObfuscatedName("wd.a(BLf;I)I")
	public static int getIfVar(IfType arg0, int arg1) {
		if (arg0.scripts == null || arg1 >= arg0.scripts.length) {
			return -2;
		}
		try {
			int[] var2 = arg0.scripts[arg1];
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
					var7 = statEffectiveLevel[var2[var5++]];
				}
				if (var6 == 15) {
					var8 = 1;
				}
				if (var6 == 2) {
					var7 = statBaseLevel[var2[var5++]];
				}
				if (var6 == 3) {
					var7 = statXP[var2[var5++]];
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
					if (var12 != -1 && (!ObjType.list(var12).members || memServer)) {
						for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
							if (var11.linkObjType[var13] == var12 + 1) {
								var7 += var11.linkObjNumber[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var7 = VarCache.var[var2[var5++]];
				}
				if (var6 == 6) {
					var7 = Skills.skillxp[statBaseLevel[var2[var5++]] - 1];
				}
				if (var6 == 7) {
					var7 = VarCache.var[var2[var5++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var7 = localPlayer.combatLevel;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Skills.used[var14]) {
							var7 += statBaseLevel[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var5++] << 16;
					int var16 = var15 + var2[var5++];
					IfType var17 = IfType.get(var16);
					int var18 = var2[var5++];
					if (var18 != -1 && (!ObjType.list(var18).members || memServer)) {
						for (int var19 = 0; var19 < var17.linkObjType.length; var19++) {
							if (var18 + 1 == var17.linkObjType[var19]) {
								var7 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var7 = runenergy;
				}
				if (var6 == 12) {
					var7 = runweight;
				}
				if (var6 == 13) {
					int var20 = VarCache.var[var2[var5++]];
					int var21 = var2[var5++];
					var7 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 14) {
					int var22 = var2[var5++];
					var7 = VarCache.getVarbit(var22);
				}
				if (var6 == 18) {
					var7 = mapBuildBaseX + (localPlayer.x >> 7);
				}
				if (var6 == 19) {
					var7 = mapBuildBaseZ + (localPlayer.z >> 7);
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
	public static void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) locChanges.head(); var10 != null; var10 = (LocChange) locChanges.next()) {
			if (var10.level == arg5 && arg2 == var10.x && arg0 == var10.z && var10.layer == arg3) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new LocChange();
			var9.z = arg0;
			var9.layer = arg3;
			var9.level = arg5;
			var9.x = arg2;
			locChangeSetOld(var9);
			locChanges.push(var9);
		}
		var9.field413 = arg4;
		var9.field414 = arg8;
		var9.endTime = arg6;
		var9.startTime = arg1;
		var9.field404 = arg7;
	}

	@ObfuscatedName("ue.a(BLqd;)V")
	public static void entityAnim(ClientEntity arg0) {
		arg0.needsForwardDrawPadding = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var1 = SeqType.list(arg0.secondarySeqId);
			if (var1 == null || var1.frames == null) {
				arg0.secondarySeqId = -1;
			} else {
				arg0.secondarySeqCycle++;
				if (var1.frames.length > arg0.secondarySeqFrame && arg0.secondarySeqCycle > var1.delay[arg0.secondarySeqFrame]) {
					arg0.secondarySeqFrame++;
					arg0.secondarySeqCycle = 1;
					triggerSeqSound(arg0.z, arg0.x, arg0.secondarySeqFrame, var1);
				}
				if (var1.frames.length <= arg0.secondarySeqFrame) {
					arg0.secondarySeqCycle = 0;
					arg0.secondarySeqFrame = 0;
					triggerSeqSound(arg0.z, arg0.x, arg0.secondarySeqFrame, var1);
				}
			}
		}
		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
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
					arg0.spotanimCycle++;
					if (var3.frames.length > arg0.spotanimFrame && arg0.spotanimCycle > var3.delay[arg0.spotanimFrame]) {
						arg0.spotanimFrame++;
						arg0.spotanimCycle = 1;
						triggerSeqSound(arg0.z, arg0.x, arg0.spotanimFrame, var3);
					}
					if (arg0.spotanimFrame >= var3.frames.length && (arg0.spotanimFrame < 0 || var3.frames.length <= arg0.spotanimFrame)) {
						arg0.spotanimId = -1;
					}
				}
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var4 = SeqType.list(arg0.primarySeqId);
			if (var4.preanim_move == 1 && arg0.preanimRouteLength > 0 && loopCycle >= arg0.exactMoveEnd && loopCycle > arg0.exactMoveStart) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var5 = SeqType.list(arg0.primarySeqId);
			if (var5 == null || var5.frames == null) {
				arg0.primarySeqId = -1;
			} else {
				arg0.primarySeqCycle++;
				if (var5.frames.length > arg0.primarySeqFrame && var5.delay[arg0.primarySeqFrame] < arg0.primarySeqCycle) {
					arg0.primarySeqFrame++;
					arg0.primarySeqCycle = 1;
					triggerSeqSound(arg0.z, arg0.x, arg0.primarySeqFrame, var5);
				}
				if (arg0.primarySeqFrame >= var5.frames.length) {
					arg0.primarySeqLoop++;
					arg0.primarySeqFrame -= var5.loops;
					if (var5.maxloops <= arg0.primarySeqLoop) {
						arg0.primarySeqId = -1;
					} else if (arg0.primarySeqFrame >= 0 && var5.frames.length > arg0.primarySeqFrame) {
						triggerSeqSound(arg0.z, arg0.x, arg0.primarySeqFrame, var5);
					} else {
						arg0.primarySeqId = -1;
					}
				}
				arg0.needsForwardDrawPadding = var5.stretches;
			}
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("de.a(IJ)V")
	public static void delIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < ignoreCount; var2++) {
			if (arg0 == ignoreUserhash[var2]) {
				ignoreCount--;
				for (int var3 = var2; var3 < ignoreCount; var3++) {
					ignoreUserhash[var3] = ignoreUserhash[var3 + 1];
					ignoreUsername[var3] = ignoreUsername[var3 + 1];
				}
				friendTransmitNum = transmitNum;

				// IGNORELIST_DEL
				out.p1Enc(239);
				out.p8(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("de.a(III)Lec;")
	public static JagString combatColourCode(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return AUTO_TAG_COLOUR1;
		} else if (var2 < -6) {
			return AUTO_TAG_COLOUR2;
		} else if (var2 < -3) {
			return AUTO_TAG_COLOUR3;
		} else if (var2 < 0) {
			return AUTO_TAG_COLOUR4;
		} else if (var2 > 9) {
			return AUTO_TAG_COLOUR5;
		} else if (var2 > 6) {
			return AUTO_TAG_COLOUR6;
		} else if (var2 > 3) {
			return AUTO_TAG_COLOUR7;
		} else if (var2 > 0) {
			return AUTO_TAG_COLOUR8;
		} else {
			return AUTO_TAG_COLOUR9;
		}
	}

	@ObfuscatedName("uc.a(IZI)V")
	public static void resumePauseButton(int arg0, int arg1) {
		// RESUME_PAUSEBUTTON
		out.p1Enc(172);
		out.p4_alt1(arg1);
		out.p2_alt2(arg0);
	}

	@ObfuscatedName("uc.d(I)V")
	public static void drawMinimenu() {
		int var0 = menuY;
		int var1 = menuX;
		int var2 = menuHeight;
		int var3 = menuWidth;
		Pix2D.fillRect(var3, var0, var1, var2, 6116423);
		Pix2D.fillRect(var3 + 1, var0 + 1, var1 - 2, 16, 0);
		Pix2D.drawRect(var3 + 1, var0 - -18, var1 - 2, var2 - 19, 0);
		b12.drawString(Text.CHOOSEOPTION, var3 + 3, var0 + 14, 6116423, -1);
		int var4 = ClientMouseListener.mouseY;
		int var5 = ClientMouseListener.mouseX;
		for (int var6 = 0; var6 < menuNumEntries; var6++) {
			int var7 = 16777215;
			int var8 = (menuNumEntries - var6 - 1) * 15 + var0 + 31;
			if (var3 < var5 && var3 + var1 > var5 && var4 > var8 - 13 && var4 < var8 + 3) {
				var7 = 16776960;
			}
			b12.drawString(getLine(var6), var3 + 3, var8, var7, 0);
		}
		blitArea(menuX, menuY, menuWidth, menuHeight);
	}

	@ObfuscatedName("uc.b(Z)V")
	public static void getNpcPosNewVis() {
		while (true) {
			if (in.bitsLeft(psize) >= 27) {
				int var0 = in.gBit(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (npcs[var0] == null) {
						var1 = true;
						npcs[var0] = new ClientNpc();
					}
					ClientNpc var2 = npcs[var0];
					npcIds[npcCount++] = var0;
					var2.cycle = loopCycle;
					int var3 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.dstYaw = var2.yaw = var3;
					}
					int var4 = in.gBit(5);
					int var5 = in.gBit(1);
					if (var4 > 15) {
						var4 -= 32;
					}
					if (var5 == 1) {
						entityUpdateIds[entityUpdateCount++] = var0;
					}
					var2.type = NpcType.list(in.gBit(14));
					int var6 = in.gBit(1);
					int var7 = in.gBit(5);
					var2.turnspeed = var2.type.turnspeed;
					var2.walkanim_l = var2.type.walkanim_l;
					var2.size = var2.type.size;
					var2.walkanim_r = var2.type.walkanim_r;
					var2.turnrightanim = var2.type.turnrightanim;
					if (var2.turnspeed == 0) {
						var2.yaw = 0;
					}
					var2.turnleftanim = var2.type.turnleftanim;
					var2.walkanim_b = var2.type.walkanim_b;
					var2.walkanim = var2.type.walkanim;
					var2.readyanim = var2.type.readyanim;
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.teleport(var7 + localPlayer.routeZ[0], var6 == 1, var4 + localPlayer.routeX[0]);
					continue;
				}
			}
			in.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("uc.a(B)V")
	public static void addProjectiles() {
		for (ClientProj var0 = (ClientProj) projectiles.head(); var0 != null; var0 = (ClientProj) projectiles.next()) {
			if (var0.level != minusedlevel || var0.t2 < loopCycle) {
				var0.unlink();
			} else if (loopCycle >= var0.t1) {
				if (var0.target > 0) {
					ClientNpc var1 = npcs[var0.target - 1];
					if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.z >= 0 && var1.z < 13312) {
						var0.setTarget(var1.z, var1.x, loopCycle, getAvH(var0.level, var1.x, var1.z) - var0.field2932);
					}
				}
				if (var0.target < 0) {
					int var2 = -var0.target - 1;
					ClientPlayer var3;
					if (selfSlot == var2) {
						var3 = localPlayer;
					} else {
						var3 = players[var2];
					}
					if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
						var0.setTarget(var3.z, var3.x, loopCycle, getAvH(var0.level, var3.x, var3.z) - var0.field2932);
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
		if (arg0.exactMoveFacing == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.exactMoveFacing == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.exactMoveFacing == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.exactMoveFacing == 3) {
			arg0.dstYaw = 512;
		}
		int var1 = arg0.exactMoveEnd - loopCycle;
		int var2 = arg0.exactStartX * 128 + arg0.size * 64;
		int var3 = arg0.exactStartZ * 128 + arg0.size * 64;
		arg0.z += (var3 - arg0.z) / var1;
		arg0.x += (var2 - arg0.x) / var1;
	}

	@ObfuscatedName("c.a(Lqd;B)V")
	public static void exactMove2(ClientEntity arg0) {
		if (arg0.exactMoveStart == loopCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.list(arg0.primarySeqId).delay[arg0.primarySeqFrame]) {
			int var1 = arg0.exactMoveStart - arg0.exactMoveEnd;
			int var2 = loopCycle - arg0.exactMoveEnd;
			int var3 = arg0.size * 64 + arg0.exactStartZ * 128;
			int var4 = arg0.size * 64 + arg0.exactStartX * 128;
			int var5 = arg0.size * 64 + arg0.exactEndX * 128;
			arg0.x = ((var1 - var2) * var4 + var5 * var2) / var1;
			int var6 = arg0.exactEndZ * 128 + arg0.size * 64;
			arg0.z = (var6 * var2 + var3 * (var1 - var2)) / var1;
		}
		if (arg0.exactMoveFacing == 0) {
			arg0.dstYaw = 1024;
		}
		arg0.animDelayMove = 0;
		if (arg0.exactMoveFacing == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.exactMoveFacing == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.exactMoveFacing == 3) {
			arg0.dstYaw = 512;
		}
		arg0.yaw = arg0.dstYaw;
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
			if (arg0.preanimRouteLength > 0 && var1.preanim_move == 0) {
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
		int var8 = arg0.dstYaw - arg0.yaw & 0x7FF;
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
			var7 = ((ClientNpc) arg0).type.walksmoothing;
		}
		if (var7) {
			if (arg0.yaw != arg0.dstYaw && arg0.targetId == -1 && arg0.turnspeed != 0) {
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
	public static void moveEntity(int arg0, ClientEntity arg1) {
		if (arg1.exactMoveEnd > loopCycle) {
			exactMove1(arg1);
		} else if (arg1.exactMoveStart >= loopCycle) {
			exactMove2(arg1);
		} else {
			routeMove(arg1);
		}
		if (arg1.x < 128 || arg1.z < 128 || arg1.x >= 13184 || arg1.z >= 13184) {
			arg1.x = arg1.routeX[0] * 128 + arg1.size * 64;
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.primarySeqId = -1;
			arg1.exactMoveStart = 0;
			arg1.spotanimId = -1;
			arg1.exactMoveEnd = 0;
			arg1.abortRoute();
		}
		if (arg1 == localPlayer && (arg1.x < 1536 || arg1.z < 1536 || arg1.x >= 11776 || arg1.z >= 11776)) {
			arg1.exactMoveStart = 0;
			arg1.x = arg1.routeX[0] * 128 + arg1.size * 64;
			arg1.spotanimId = -1;
			arg1.exactMoveEnd = 0;
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.primarySeqId = -1;
			arg1.abortRoute();
		}
		entityFace(arg1);
		entityAnim(arg1);
	}

	@ObfuscatedName("kf.a(IIIBI)V")
	public static void gameDrawMain(int arg0, int arg1, int arg2, int arg3) {
		Pix2D.setClipping(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Pix3D.setRenderClipping();
		sceneCycle++;
		addPlayers(true);
		addNpcs(true);
		addPlayers(false);
		addNpcs(false);
		addProjectiles();
		addMapAnim();
		if (!cinemaCam) {
			int var4 = orbitCameraPitch;
			int var5 = orbitCameraYaw + macroCameraAngle & 0x7FF;
			if (var4 < cameraPitchClamp / 256) {
				var4 = cameraPitchClamp / 256;
			}
			if (camShake[4] && var4 < camShakeRan[4] + 128) {
				var4 = camShakeRan[4] + 128;
			}
			camFollow(var5, getAvH(minusedlevel, localPlayer.x, localPlayer.z) - 50, var4 * 3 + 600, orbitCameraX, var4, orbitCameraZ);
		}
		int var6;
		if (cinemaCam) {
			var6 = roofCheck2();
		} else {
			var6 = roofCheck();
		}
		int var7 = camX;
		int var8 = camZ;
		int var9 = camPitch;
		int var10 = camY;
		int var11 = camYaw;
		for (int var12 = 0; var12 < 5; var12++) {
			if (camShake[var12]) {
				int var13 = (int) ((double) -field2653[var12] + (double) (field2653[var12] * 2 + 1) * Math.random() + Math.sin((double) camShakeCycle[var12] * ((double) field3294[var12] / 100.0D)) * (double) camShakeRan[var12]);
				if (var12 == 4) {
					camPitch += var13;
					if (camPitch < 128) {
						camPitch = 128;
					}
					if (camPitch > 383) {
						camPitch = 383;
					}
				}
				if (var12 == 3) {
					camYaw = camYaw + var13 & 0x7FF;
				}
				if (var12 == 1) {
					camY += var13;
				}
				if (var12 == 2) {
					camZ += var13;
				}
				if (var12 == 0) {
					camX += var13;
				}
			}
		}
		int var14 = ClientMouseListener.mouseX;
		int var15 = ClientMouseListener.mouseY;
		if (var14 >= arg1 && arg0 + arg1 > var14 && var15 >= arg3 && arg3 + arg2 > var15) {
			ModelLit.pickedCount = 0;
			ModelLit.mouseX = ClientMouseListener.mouseX - arg1;
			ModelLit.mouseY = ClientMouseListener.mouseY - arg3;
			ModelLit.checkHover = true;
		} else {
			ModelLit.checkHover = false;
			ModelLit.pickedCount = 0;
		}
		doAudio();
		Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
		doAudio();
		world.renderAll(camX, camY, camZ, camPitch, camYaw, var6);
		doAudio();
		world.removeSprites();
		entityOverlays(arg2, arg3, arg1, arg0);
		coordArrow(arg1, arg3);
		((TextureManager) Pix3D.textureManager).runAnims(worldUpdateNum);
		otherOverlays(arg3, arg2, arg1, arg0);
		camX = var7;
		camZ = var8;
		camY = var10;
		camPitch = var9;
		camYaw = var11;
		if (js5Loading && Js5Net.urgentQueueSize() == 0) {
			js5Loading = false;
		}
		if (js5Loading) {
			Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
			messageBox(Text.LOADING, false);
		}
		if (!js5Loading && !isMenuOpen && var14 >= arg1 && var14 < arg0 + arg1 && arg3 <= var15 && arg3 + arg2 > var15) {
			minimenuBuildSceneActions(var14, arg3, arg1, var15);
		}
	}

	@ObfuscatedName("ma.a(IIIIIIIII)V")
	public static void drawInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.openInterface(arg2)) {
			dragChildren = null;
			drawLayer(arg5, arg3, IfType.list[arg2], -1, arg1, arg7, arg4, arg0, arg6);
			if (dragChildren != null) {
				drawLayer(arg5, arg3, dragChildren, 0xabcdabcd, field1603, field1968, arg4, arg0, arg6);
				dragChildren = null;
			}
		} else if (arg4 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				componentDirtyArea[var8] = true;
			}
		} else {
			componentDirtyArea[arg4] = true;
		}
	}

	@ObfuscatedName("ma.a(Lf;I)Z")
	public static boolean getIfActive(IfType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.scriptComparator.length; var1++) {
			int var2 = getIfVar(arg0, var1);
			int var3 = arg0.scriptOperand[var1];
			if (arg0.scriptComparator[var1] == 2) {
				if (var2 >= var3) {
					return false;
				}
			} else if (arg0.scriptComparator[var1] == 3) {
				if (var3 >= var2) {
					return false;
				}
			} else if (arg0.scriptComparator[var1] == 4) {
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
			timeoutTimer = 0;
			ptype2 = ptype1;
			ptype1 = ptype0;
			ptype0 = ptype;

			if (ptype == 27) {
				// IF_OPENTOP
				int var1 = in.g2_alt2();
				toplevelinterface = var1;
				ifAnimReset(var1);
				ScriptRunner.executeOnLoad(toplevelinterface);
				for (int var2 = 0; var2 < 100; var2++) {
					componentDirtyArea[var2] = true;
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
					for (int var6 = 0; var6 < var5.linkObjType.length; var6++) {
						var5.linkObjType[var6] = 0;
						var5.linkObjNumber[var6] = 0;
					}
				}
				ClientInvCache.clear(var4);
				int var7 = in.g2();
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = in.g1_alt2();
					if (var9 == 255) {
						var9 = in.g4_alt3();
					}
					int var10 = in.g2_alt1();
					if (var5 != null && var5.linkObjType.length > var8) {
						var5.linkObjType[var8] = var10;
						var5.linkObjNumber[var8] = var9;
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
				// UPDATE_IGNORELIST
				ignoreCount = psize / 8;
				for (int var11 = 0; var11 < ignoreCount; var11++) {
					ignoreUserhash[var11] = in.g8();
					ignoreUsername[var11] = JString.toRawUsername(ignoreUserhash[var11]);
				}
				friendTransmitNum = transmitNum;

				ptype = -1;
				return true;
			}

			if (ptype == 210) {
				// IF_SETNPCHEAD
				int var12 = in.g4_alt3();
				int var13 = in.g2_alt1();
				IfType var14 = IfType.get(var12);
				if (var14.model1Type != 2 || var14.model1Id != var13) {
					var14.model1Type = 2;
					var14.model1Id = var13;
					componentUpdated(var14);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 92) {
				// IF_SETOBJECT
				int var15 = in.g2();
				if (var15 == 65535) {
					var15 = -1;
				}
				int var16 = in.g4();
				int var17 = in.g4_alt1();
				IfType var18 = IfType.get(var16);
				if (var18.v3) {
					var18.invcount = var17;
					var18.invobject = var15;
					ObjType var20 = ObjType.list(var15);
					var18.modelYAn = var20.yan2d;
					var18.modelZoom = var20.zoom2d;
					var18.modelXOf = var20.xof2d;
					var18.modelZAn = var20.zan2d;
					var18.modelXAn = var20.xan2d;
					if (var18.width > 0) {
						var18.modelZoom = var18.modelZoom * 32 / var18.width;
					}
					var18.modelYOf = var20.yof2d;
					componentUpdated(var18);
				} else {
					if (var15 == -1) {
						ptype = -1;
						var18.model1Type = 0;
						return true;
					}
					ObjType var19 = ObjType.list(var15);
					var18.modelZoom = var19.zoom2d * 100 / var17;
					var18.modelYAn = var19.yan2d;
					var18.model1Type = 4;
					var18.modelXAn = var19.xan2d;
					var18.model1Id = var15;
					componentUpdated(var18);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 175) {
				// RESET_ANIMS
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
				// RUNCLIENTSCRIPT
				JagString stackDesc = in.gjstr();
				Object[] stack = new Object[stackDesc.length() + 1];
				for (int var25 = stackDesc.length() - 1; var25 >= 0; var25--) {
					if (stackDesc.charAt(var25) == 115) {
						stack[var25 + 1] = in.gjstr();
					} else {
						stack[var25 + 1] = Integer.valueOf(in.g4());
					}
				}
				stack[0] = Integer.valueOf(in.g4());

				HookReq var26 = new HookReq();
				var26.onop = stack;
				ScriptRunner.executeScript(var26);

				ptype = -1;
				return true;
			}

			if (ptype == 238) {
				// MESSAGE_GAME
				JagString var27 = in.gjstr();
				if (var27.endsWith(AUTO_TRADEREQ)) {
					JagString var28 = var27.substring(0, var27.indexOf(AUTO_COLON));
					boolean var29 = false;
					long var30 = var28.toUserhash();
					for (int var32 = 0; var32 < ignoreCount; var32++) {
						if (var30 == ignoreUserhash[var32]) {
							var29 = true;
							break;
						}
					}
					if (!var29 && chatDisabled == 0) {
						addChat(Text.TRADEREQ, 4, var28);
					}
				} else if (var27.endsWith(AUTO_DUELREQ)) {
					boolean var33 = false;
					JagString var34 = var27.substring(0, var27.indexOf(AUTO_COLON));
					long var35 = var34.toUserhash();
					for (int var37 = 0; var37 < ignoreCount; var37++) {
						if (ignoreUserhash[var37] == var35) {
							var33 = true;
							break;
						}
					}
					if (!var33 && chatDisabled == 0) {
						addChat(Text.DUELREQ, 8, var34);
					}
				} else if (var27.endsWith(AUTO_CHALREQ)) {
					JagString var46 = var27.substring(0, var27.indexOf(AUTO_COLON));
					boolean var47 = false;
					long var48 = var46.toUserhash();
					for (int var50 = 0; var50 < ignoreCount; var50++) {
						if (ignoreUserhash[var50] == var48) {
							var47 = true;
							break;
						}
					}
					if (!var47 && chatDisabled == 0) {
						JagString var51 = var27.substring(var27.indexOf(AUTO_COLON) + 1, var27.length() + -9);
						addChat(var51, 8, var46);
					}
				} else if (var27.endsWith(AUTO_ASSISTREQ)) {
					JagString var41 = var27.substring(0, var27.indexOf(AUTO_COLON));
					long var42 = var41.toUserhash();
					boolean var44 = false;
					for (int var45 = 0; var45 < ignoreCount; var45++) {
						if (var42 == ignoreUserhash[var45]) {
							var44 = true;
							break;
						}
					}
					if (!var44 && chatDisabled == 0) {
						addChat(AUTO_EMPTY, 10, var41);
					}
				} else if (var27.endsWith(AUTO_CLAN)) {
					JagString var40 = var27.substring(0, var27.indexOf(AUTO_CLAN));
					addChat(var40, 11, AUTO_EMPTY);
				} else if (var27.endsWith(AUTO_TRADE)) {
					JagString var38 = var27.substring(0, var27.indexOf(AUTO_TRADE));
					if (chatDisabled == 0) {
						addChat(var38, 12, AUTO_EMPTY);
					}
				} else if (var27.endsWith(AUTO_ASSIST)) {
					JagString var39 = var27.substring(0, var27.indexOf(AUTO_ASSIST));
					if (chatDisabled == 0) {
						addChat(var39, 13, AUTO_EMPTY);
					}
				} else {
					addChat(var27, 0, AUTO_EMPTY);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 188) {
				// LOGOUT
				logout();

				ptype = -1;
				return false;
			}

			if (ptype == 184) {
				long var52 = in.g8();
				int var54 = in.g2();
				int var55 = in.g1();
				JagString var56 = JString.toRawUsername(var52).toScreenName();
				for (int var57 = 0; var57 < friendCount; var57++) {
					if (var52 == field694[var57]) {
						if (var54 != field2094[var57]) {
							field2094[var57] = var54;
							if (var54 > 0) {
								addChat(JagString.join(new JagString[] { var56, Text.field963 }), 5, AUTO_EMPTY);
							}
							if (var54 == 0) {
								addChat(JagString.join(new JagString[] { var56, Text.field2226 }), 5, AUTO_EMPTY);
							}
						}
						field103[var57] = var55;
						var56 = null;
						break;
					}
				}
				if (var56 != null && friendCount < 200) {
					field694[friendCount] = var52;
					field239[friendCount] = var56;
					field2094[friendCount] = var54;
					field103[friendCount] = var55;
					friendCount++;
				}

				friendTransmitNum = transmitNum;

				int var58 = friendCount;
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
				int var66 = in.g4_alt3();
				lastAddress = signlink.dnsreq(var66);

				ptype = -1;
				return true;
			}

			if (ptype == 68) {
				// MESSAGE_FRIENDCHANNEL
				long var67 = in.g8();
				in.g1b();
				long var69 = in.g8();
				boolean var71 = false;
				long var72 = (long) in.g2();
				long var74 = (long) in.g3();
				int var76 = in.g1();
				long var77 = (var72 << 32) + var74;
				for (int var79 = 0; var79 < 100; var79++) {
					if (messageIds[var79] == var77) {
						var71 = true;
						break;
					}
				}
				if (var76 <= 1) {
					for (int var80 = 0; var80 < ignoreCount; var80++) {
						if (var67 == ignoreUserhash[var80]) {
							var71 = true;
							break;
						}
					}
				}
				if (!var71 && chatDisabled == 0) {
					messageIds[privateMessageCount] = var77;
					privateMessageCount = (privateMessageCount + 1) % 100;
					JagString var81 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
					if (var76 == 2 || var76 == 3) {
						addChat(JagString.join(new JagString[] { TAG_IMG_1, JString.toRawUsername(var67).toScreenName() }), 9, var81, JString.toRawUsername(var69).toScreenName());
					} else if (var76 == 1) {
						addChat(JagString.join(new JagString[] { TAG_IMG_0, JString.toRawUsername(var67).toScreenName() }), 9, var81, JString.toRawUsername(var69).toScreenName());
					} else {
						addChat(JString.toRawUsername(var67).toScreenName(), 9, var81, JString.toRawUsername(var69).toScreenName());
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 111) {
				// IF_OPENSUB
				int var82 = in.g1_alt1();
				int var83 = in.g2_alt2();
				int var84 = in.g4_alt2();
				SubInterface var85 = (SubInterface) subinterfaces.find((long) var84);
				if (var85 != null) {
					closeSubInterface(var85.id != var83, var85);
				}
				openSubInterface(var82, var83, var84);

				ptype = -1;
				return true;
			}

			if (ptype == 38) {
				int var86 = in.g2b();
				int var87 = in.g4();
				int var88 = in.g2b();
				IfType var89 = IfType.get(var87);
				int var90 = var86 + var89.dataX;
				int var91 = var89.dataY + var88;
				if (var90 != var89.x || var91 != var89.y) {
					var89.y = var91;
					var89.x = var90;
					componentUpdated(var89);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 73) {
				// CHAT_FILTER_SETTINGS
				chatPublicMode = in.g1();
				chatPrivateMode = in.g1();
				chatTradeMode = in.g1();

				ptype = -1;
				return true;
			}

			if (ptype == 41) {
				// IF_SETTEXT
				int var92 = in.g4();
				JagString var93 = in.gjstr();
				IfType var94 = IfType.get(var92);
				if (!var93.strEquals(var94.text)) {
					var94.text = var93;
					componentUpdated(var94);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 59) {
				// IF_SETPLAYERHEAD
				int var95 = in.g4();
				IfType var96 = IfType.get(var95);
				var96.model1Type = 3;
				var96.model1Id = localPlayer.model.method234();
				componentUpdated(var96);

				ptype = -1;
				return true;
			}

			if (
				ptype == 195 ||
				ptype == 138 ||
				ptype == 164 ||
				ptype == 103 ||
				ptype == 120 ||
				ptype == 82 ||
				ptype == 32 ||
				ptype == 26 ||
				ptype == 147 ||
				ptype == 150 ||
				ptype == 105
			) {
				zonePacket();

				ptype = -1;
				return true;
			}

			if (ptype == 77) {
				long var97 = in.g8();
				JagString var99 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
				addChat(var99, 6, JString.toRawUsername(var97).toScreenName());
				ptype = -1;
				return true;
			}

			if (ptype == 142) {
				// IF_SETANIM
				int var100 = in.g2b_alt2();
				int var101 = in.g4_alt3();
				IfType var102 = IfType.get(var101);
				if (var102.modelAnim != var100 || var100 == -1) {
					var102.field839 = 0;
					var102.modelAnim = var100;
					var102.field762 = 0;
					componentUpdated(var102);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 108) {
				// UPDATE_RUNWEIGHT
				legacyUpdated();
				runweight = in.g2b();
				miscTransmitNum = transmitNum;

				ptype = -1;
				return true;
			}

			if (ptype == 137) {
				// UPDATE_REBOOT_TIMER
				logoutTimer = in.g2_alt1() * 30;
				miscTransmitNum = transmitNum;

				ptype = -1;
				return true;
			}

			if (ptype == 110) {
				friendServerStatus = in.g1();
				friendTransmitNum = transmitNum;

				ptype = -1;
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
				int var103 = in.g4_alt3();
				IfType var104 = IfType.get(var103);
				for (int var105 = 0; var105 < var104.linkObjType.length; var105++) {
					var104.linkObjType[var105] = -1;
					var104.linkObjType[var105] = 0;
				}
				componentUpdated(var104);
				ptype = -1;
				return true;
			}

			if (ptype == 122) {
				// MINIMAP_TOGGLE
				minimapState = in.g1();

				ptype = -1;
				return true;
			}

			if (ptype == 134) {
				// UNSET_MAP_FLAG (unofficial name)
				minimapFlagX = 0;

				ptype = -1;
				return true;
			}

			if (ptype == 171) {
				int var106 = in.g2();
				int var107 = in.g2_alt2();
				int var108 = in.g2_alt2();
				int var109 = in.g4();
				IfType var110 = IfType.get(var109);
				if (var110.modelXAn != var107 || var110.modelYAn != var106 || var110.modelZoom != var108) {
					var110.modelYAn = var106;
					var110.modelZoom = var108;
					var110.modelXAn = var107;
					componentUpdated(var110);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 169) {
				// REBUILD_REGION
				rebuildPacket(true);

				ptype = -1;
				return true;
			}

			if (ptype == 213) {
				// VARP_RESET (unofficial name)
				for (int var111 = 0; var111 < VarpType.numDefinitions; var111++) {
					VarpType var112 = VarpType.list(var111);
					if (var112 != null && var112.clientcode == 0) {
						VarCache.varServ[var111] = 0;
						VarCache.var[var111] = 0;
					}
				}
				legacyUpdated();
				varTransmitNum += 32;

				ptype = -1;
				return true;
			}

			if (ptype == 208) {
				// UPDATE_STAT
				legacyUpdated();

				int var113 = in.g1_alt3();
				int var114 = in.g4();
				int var115 = in.g1_alt3();

				statXP[var113] = var114;
				statEffectiveLevel[var113] = var115;
				statBaseLevel[var113] = 1;

				for (int var116 = 0; var116 < 98; var116++) {
					if (var114 >= Skills.skillxp[var116]) {
						statBaseLevel[var113] = var116 + 2;
					}
				}

				statTransmit[statTransmitNum++ & 0x1F] = var113;

				ptype = -1;
				return true;
			}

			if (ptype == 55) {
				// CAM_MOVETO
				cinemaCam = true;
				camMoveToLx = in.g1();
				camMoveToLz = in.g1();
				camMoveToHei = in.g2();
				camMoveToRate = in.g1();
				camMoveToRate2 = in.g1();
				if (camMoveToRate2 >= 100) {
					camZ = camMoveToLz * 128 + 64;
					camX = camMoveToLx * 128 + 64;
					camY = getAvH(minusedlevel, camX, camZ) - camMoveToHei;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 190) {
				// VARP_SYNC (unofficial name)
				for (int i = 0; i < VarCache.var.length; i++) {
					if (VarCache.var[i] != VarCache.varServ[i]) {
						VarCache.var[i] = VarCache.varServ[i];
						clientVar(i);
						varTransmit[varTransmitNum++ & 0x1F] = i;
					}
				}

				ptype = -1;
				return true;
			}

			if (ptype == 161) {
				int var118 = in.g4_alt3();
				int var119 = in.g2();
				if (var119 == 65535) {
					var119 = -1;
				}
				int var120 = in.g4_alt1();
				int var121 = in.g2();
				if (var121 == 65535) {
					var121 = -1;
				}
				for (int var122 = var119; var122 <= var121; var122++) {
					long var123 = ((long) var118 << 32) + ((long) var122);
					Linkable var125 = serverActive.find(var123);
					if (var125 != null) {
						var125.unlink();
					}
					serverActive.put(var123, new ServerActive(var120));
				}
				ptype = -1;
				return true;
			}

			if (ptype == 124) {
				// TRIGGER_ONDIALOGABORT
				if (toplevelinterface != -1) {
					runHookImmediate(toplevelinterface, 0);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 39) {
				// UPDATE_ZONE_FULL_FOLLOWS
				zoneUpdateZ = in.g1_alt2();
				zoneUpdateX = in.g1();

				for (int x = zoneUpdateX; x < zoneUpdateX + 8; x++) {
					for (int z = zoneUpdateZ; z < zoneUpdateZ + 8; z++) {
						if (groundObj[minusedlevel][x][z] != null) {
							groundObj[minusedlevel][x][z] = null;
							showObject(z, x);
						}
					}
				}

				for (LocChange var128 = (LocChange) locChanges.head(); var128 != null; var128 = (LocChange) locChanges.next()) {
					if (var128.x >= zoneUpdateX && zoneUpdateX + 8 > var128.x && zoneUpdateZ <= var128.z && var128.z < zoneUpdateZ + 8 && var128.level == minusedlevel) {
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
					if (messageIds[var139] == var135) {
						var137 = true;
						break;
					}
				}
				if (var138 <= 1) {
					for (int var140 = 0; var140 < ignoreCount; var140++) {
						if (var129 == ignoreUserhash[var140]) {
							var137 = true;
							break;
						}
					}
				}
				if (!var137 && chatDisabled == 0) {
					messageIds[privateMessageCount] = var135;
					privateMessageCount = (privateMessageCount + 1) % 100;
					JagString var141 = PixFont.escape(JagString.unpack2(in).forceCapitalisationOfWords());
					if (var138 == 2 || var138 == 3) {
						addChat(var141, 7, JagString.join(new JagString[] { TAG_IMG_1, JString.toRawUsername(var129).toScreenName() }));
					} else if (var138 == 1) {
						addChat(var141, 7, JagString.join(new JagString[] { TAG_IMG_0, JString.toRawUsername(var129).toScreenName() }));
					} else {
						addChat(var141, 3, JString.toRawUsername(var129).toScreenName());
					}
				}
				ptype = -1;
				return true;
			}

			if (ptype == 207) {
				// UPDATE_INV_STOP_TRANSMIT
				int var142 = in.g2_alt2();

				ClientInvCache.delete(var142);
				invTransmit[invTransmitNum++ & 0x1F] = var142 & 0x7FFF;

				ptype = -1;
				return true;
			}

			if (ptype == 99) {
				// SYNTH_SOUND
				int var143 = in.g2();
				int var144 = in.g1();
				int var145 = in.g2();
				playSynth(var143, var145, var144);

				ptype = -1;
				return true;
			}

			if (ptype == 244) {
				// VARP_LARGE
				int var146 = in.g2_alt1();
				int var147 = in.g4();
				VarCache.varServ[var146] = var147;
				if (VarCache.var[var146] != var147) {
					VarCache.var[var146] = var147;
					clientVar(var146);
				}
				varTransmit[varTransmitNum++ & 0x1F] = var146;

				ptype = -1;
				return true;
			}

			if (ptype == 209) {
				// IF_SETSCROLLPOS
				int var148 = in.g2_alt2();
				int var149 = in.g4();
				IfType var150 = IfType.get(var149);
				if (var150 != null && var150.type == 0) {
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
				// VARP_SMALL
				int var151 = in.g2_alt2();
				byte var152 = in.g1b();
				VarCache.varServ[var151] = var152;
				if (var152 != VarCache.var[var151]) {
					VarCache.var[var151] = var152;
					clientVar(var151);
				}
				varTransmit[varTransmitNum++ & 0x1F] = var151;

				ptype = -1;
				return true;
			}

			if (ptype == 232) {
				// HINT_ARROW
				hintType = in.g1();

				if (hintType == 1) {
					hintNpc = in.g2();
				} else if (hintType >= 2 && hintType <= 6) {
					if (hintType == 2) {
						hintOffsetZ = 64;
						hintOffsetX = 64;
					} else if (hintType == 3) {
						hintOffsetX = 0;
						hintOffsetZ = 64;
					} else if (hintType == 4) {
						hintOffsetX = 128;
						hintOffsetZ = 64;
					} else if (hintType == 5) {
						hintOffsetX = 64;
						hintOffsetZ = 0;
					} else if (hintType == 6) {
						hintOffsetZ = 128;
						hintOffsetX = 64;
					}

					hintType = 2;
					hintTileX = in.g2();
					hintTileZ = in.g2();
					hintHeight = in.g1();
				} else if (hintType == 10) {
					hintPlayer = in.g2();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 160) {
				// CAM_RESET
				cinemaCam = false;
				for (int var153 = 0; var153 < 5; var153++) {
					camShake[var153] = false;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 2) {
				// UPDATE_INV_PARTIAL
				int comId = in.g4();
				int invId = in.g2();

				IfType com;
				if (comId >= 0) {
					com = IfType.get(comId);
				} else {
					com = null;
				}

				if (comId < -70000) {
					invId += 32768;
				}

				while (in.pos < psize) {
					int slot = in.gsmart();
					int id = in.g2();

					int count = 0;
					if (id != 0) {
						count = in.g1();
						if (count == 255) {
							count = in.g4();
						}
					}

					if (com != null && slot >= 0 && com.linkObjType.length > slot) {
						com.linkObjType[slot] = id;
						com.linkObjNumber[slot] = count;
					}

					ClientInvCache.set(invId, slot, count, id - 1);
				}

				if (com != null) {
					componentUpdated(com);
				}

				legacyUpdated();
				invTransmit[invTransmitNum++ & 0x1F] = invId & 0x7FFF;

				ptype = -1;
				return true;
			}

			if (ptype == 239) {
				int var160 = in.g4_alt1();
				int var161 = in.g2_alt3();
				int var162 = in.g2();
				IfType var163 = IfType.get(var160);
				var163.field749 = var161 + (var162 << 16);

				ptype = -1;
				return true;
			}

			if (ptype == 74) {
				// PLAYER_INFO
				getPlayerPos();

				ptype = -1;
				return true;
			}

			if (ptype == 51) {
				// REFLECTION_CHECKER
				ReflectionChecker.addCheck(psize, in, signlink);

				ptype = -1;
				return true;
			}

			if (ptype == 10) {
				// MIDI_SONG
				int var164 = in.g2_alt3();
				if (var164 == 65535) {
					var164 = -1;
				}
				playSongs(var164);
				ptype = -1;

				return true;
			}

			if (ptype == 112) {
				// MIDI_JINGLE
				int var165 = in.g2_alt2();
				if (var165 == 65535) {
					var165 = -1;
				}
				int var166 = in.g3();
				playJingle(var165, var166);

				ptype = -1;
				return true;
			}

			if (ptype == 94) {
				int var167 = in.g1_alt3();
				int var168 = in.g1_alt3();
				JagString var169 = in.gjstr();
				if (var167 >= 1 && var167 <= 8) {
					if (var169.equalsIgnoreCase(AUTO_NULL2)) {
						var169 = null;
					}
					playerOp[var167 - 1] = var169;
					playerOpPriority[var167 - 1] = var168 == 0;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 25) {
				// IF_SETMODEL
				int var170 = in.g2();
				int var171 = in.g4();
				IfType var172 = IfType.get(var171);
				if (var172.model1Type != 1 || var170 != var172.model1Id) {
					var172.model1Id = var170;
					var172.model1Type = 1;
					componentUpdated(var172);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 224) {
				// IF_RESYNC (unofficial name)
				int var173 = psize + in.pos;
				int var174 = in.g2();
				int var175 = in.g2();
				if (var174 != toplevelinterface) {
					toplevelinterface = var174;
					ifAnimReset(toplevelinterface);
					ScriptRunner.executeOnLoad(toplevelinterface);
					for (int var176 = 0; var176 < 100; var176++) {
						componentDirtyArea[var176] = true;
					}
				}
				while (var175-- > 0) {
					int var177 = in.g4();
					int var178 = in.g2();
					int var179 = in.g1();
					SubInterface var180 = (SubInterface) subinterfaces.find((long) var177);
					if (var180 != null && var180.id != var178) {
						closeSubInterface(true, var180);
						var180 = null;
					}
					if (var180 == null) {
						var180 = openSubInterface(var179, var178, var177);
					}
					var180.field3284 = true;
				}
				for (SubInterface var181 = (SubInterface) subinterfaces.search(); var181 != null; var181 = (SubInterface) subinterfaces.findnext()) {
					if (var181.field3284) {
						var181.field3284 = false;
					} else {
						closeSubInterface(true, var181);
					}
				}
				serverActive = new HashTable(512);
				while (var173 > in.pos) {
					int var182 = in.g4();
					int var183 = in.g2();
					int var184 = in.g2();
					int var185 = in.g4();
					for (int var186 = var183; var186 <= var184; var186++) {
						long var187 = ((long) var182 << 32) + (long) var186;
						serverActive.put(var187, new ServerActive(var185));
					}
				}
				ptype = -1;
				return true;
			}

			if (ptype == 4) {
				// UPDATE_FRIENDCHAT_CHANNEL_FULL
				clanTransmitNum = transmitNum;
				long var189 = in.g8();
				if (var189 == 0L) {
					field2924 = null;
					friendChatList = null;
					ptype = -1;
					chatDisplayName = null;
					friendChatCount = 0;
					return true;
				}
				long var191 = in.g8();
				chatDisplayName = JString.toRawUsername(var191);
				field2924 = JString.toRawUsername(var189);
				chatMinKick = in.g1b();
				int var193 = in.g1();
				if (var193 == 255) {
					ptype = -1;
					return true;
				}
				FriendChatUser[] var194 = new FriendChatUser[100];
				friendChatCount = var193;
				for (int var195 = 0; var195 < friendChatCount; var195++) {
					var194[var195] = new FriendChatUser();
					var194[var195].key = in.g8();
					var194[var195].username = JString.toRawUsername(var194[var195].key);
					var194[var195].world = in.g2();
					var194[var195].rank = in.g1b();
					if (field2259 == var194[var195].key) {
						chatRank = var194[var195].rank;
					}
				}
				int var196 = friendChatCount;
				while (var196 > 0) {
					var196--;
					boolean var197 = true;
					for (int var198 = 0; var198 < var196; var198++) {
						if (var194[var198].username.compare(var194[var198 + 1].username) > 0) {
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
				friendChatList = var194;

				ptype = -1;
				return true;
			}

			if (ptype == 247) {
				// CAM_SHAKE
				int var200 = in.g1();
				int var201 = in.g1();
				int var202 = in.g1();
				int var203 = in.g1();

				camShake[var200] = true;
				field2653[var200] = var201;
				camShakeRan[var200] = var202;
				field3294[var200] = var203;
				camShakeCycle[var200] = 0;

				ptype = -1;
				return true;
			}

			if (ptype == 33) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				zoneUpdateX = in.g1_alt1();
				zoneUpdateZ = in.g1_alt2();

				while (in.pos < psize) {
					ptype = in.g1();
					zonePacket();
				}

				ptype = -1;
				return true;
			}

			if (ptype == 197) {
				// UPDATE_RUNENERGY
				legacyUpdated();
				runenergy = in.g1();
				miscTransmitNum = transmitNum;

				ptype = -1;
				return true;
			}

			if (ptype == 76) {
				// CAM_LOOKAT
				cinemaCam = true;
				camLookAtLx = in.g1();
				camLookAtLz = in.g1();
				camLookAtHei = in.g2();
				camLookAtRate = in.g1();
				camLookAtRate2 = in.g1();
				if (camLookAtRate2 >= 100) {
					int var204 = camLookAtLx * 128 + 64;
					int var205 = camLookAtLz * 128 + 64;
					int var206 = getAvH(minusedlevel, var204, var205) - camLookAtHei;
					int var207 = var206 - camY;
					int var208 = var205 - camZ;
					int var209 = var204 - camX;
					int var210 = (int) Math.sqrt((double) (var209 * var209 + var208 * var208));
					camPitch = (int) (Math.atan2((double) var207, (double) var210) * 325.949D) & 0x7FF;
					camYaw = (int) (-325.949D * Math.atan2((double) var209, (double) var208)) & 0x7FF;
					if (camPitch < 128) {
						camPitch = 128;
					}
					if (camPitch > 383) {
						camPitch = 383;
					}
				}
				ptype = -1;
				return true;
			}

			if (ptype == 237) {
				// IF_CLOSESUB
				int var211 = in.g4();
				SubInterface var212 = (SubInterface) subinterfaces.find((long) var211);
				if (var212 != null) {
					closeSubInterface(true, var212);
				}
				if (resumePauseCom != null) {
					componentUpdated(resumePauseCom);
					resumePauseCom = null;
				}

				ptype = -1;
				return true;
			}

			if (ptype == 130) {
				// IF_SETHIDE
				boolean var213 = in.g1() == 1;
				int var214 = in.g4_alt2();
				IfType var215 = IfType.get(var214);
				if (var215.hide != var213) {
					var215.hide = var213;
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
					if (friendChatCount == 0) {
						ptype = -1;
						return true;
					}
					long var225 = var216 & Long.MAX_VALUE;
					int var227;
					for (var227 = 0; friendChatCount > var227 && (friendChatList[var227].key != var225 || var218 != friendChatList[var227].world); var227++) {
					}
					if (friendChatCount > var227) {
						while (var227 < friendChatCount - 1) {
							friendChatList[var227] = friendChatList[var227 + 1];
							var227++;
						}
						friendChatCount--;
						friendChatList[friendChatCount] = null;
					}
				} else {
					FriendChatUser var221 = new FriendChatUser();
					var221.key = var216;
					var221.username = JString.toRawUsername(var221.key);
					var221.world = var218;
					var221.rank = var219;
					int var222;
					for (var222 = friendChatCount - 1; var222 >= 0; var222--) {
						int var223 = friendChatList[var222].username.compare(var221.username);
						if (var223 == 0) {
							friendChatList[var222].world = var218;
							friendChatList[var222].rank = var219;
							if (var216 == field2259) {
								chatRank = var219;
							}
							clanTransmitNum = transmitNum;
							ptype = -1;
							return true;
						}
						if (var223 < 0) {
							break;
						}
					}
					if (friendChatCount >= friendChatList.length) {
						ptype = -1;
						return true;
					}
					for (int var224 = friendChatCount - 1; var224 > var222; var224--) {
						friendChatList[var224 + 1] = friendChatList[var224];
					}
					if (friendChatCount == 0) {
						friendChatList = new FriendChatUser[100];
					}
					friendChatList[var222 + 1] = var221;
					if (var216 == field2259) {
						chatRank = var219;
					}
					friendChatCount++;
				}
				clanTransmitNum = transmitNum;

				ptype = -1;
				return true;
			}

			if (ptype == 45) {
				// TELEPORT (unofficial name)
				int var228 = in.g1_alt3();
				int var229 = in.g1_alt2();
				int var230 = in.g1_alt1();
				minusedlevel = var228 >> 1;
				localPlayer.teleport(var230, (var228 & 0x1) == 1, var229);

				ptype = -1;
				return true;
			}

			if (ptype == 5) {
				// IF_SETCOLOUR
				int var231 = in.g2();
				int var232 = var231 >> 10 & 0x1F;
				int var233 = in.g4_alt3();
				int var234 = var231 & 0x1F;
				int var235 = var231 >> 5 & 0x1F;
				IfType var236 = IfType.get(var233);
				int var237 = (var235 << 11) + (var232 << 19) + (var234 << 3);
				if (var236.colour != var237) {
					var236.colour = var237;
					componentUpdated(var236);
				}

				ptype = -1;
				return true;
			}

			if (ptype == 231) {
				// REBUILD_NORMAL
				rebuildPacket(false);

				ptype = -1;
				return true;
			}

			if (ptype == 115) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				zoneUpdateZ = in.g1_alt2();
				zoneUpdateX = in.g1_alt1();

				ptype = -1;
				return true;
			}

			JagException.report("T1 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize, null);
			logout();
		} catch (IOException var241) {
			lostCon();
		} catch (Exception var242) {
			String var239 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (mapBuildBaseX + localPlayer.routeX[0]) + "," + (mapBuildBaseZ + localPlayer.routeZ[0]) + " - ";
			for (int var240 = 0; psize > var240 && var240 < 50; var240++) {
				var239 = var239 + in.data[var240] + ",";
			}
			JagException.report(var239, var242);
			logout();
		}

		return true;
	}

	@ObfuscatedName("mb.a([Lf;IIIIIIII)V")
	public static void loopLayer(IfType[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg0.length; var8++) {
			IfType var9 = arg0[var8];
			if (var9 == null || (var9.v3 && var9.type != 0 && !var9.hashook && getActive(var9) == 0 && var9 != dragLayer) || var9.layerId != arg7 || (var9.v3 && hide(var9))) {
				continue;
			}

			int var10 = arg1 + var9.x;
			int var11 = var9.y + arg5;
			if (var9 == dragCom) {
				dragging = true;
				dragCurrentX = var10;
				dragCurrentY = var11;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			if (var9.type == 2) {
				var12 = arg2;
				var13 = arg4;
				var14 = arg6;
				var15 = arg3;
			} else if (var9.type == 9) {
				int var16 = var9.width + var10;
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
				int var22 = var9.width + var10;
				var13 = var22 >= arg4 ? arg4 : var22;
				int var23 = var9.height + var11;
				var14 = var23 >= arg6 ? arg6 : var23;
			}

			if (var9.v3 && (var13 <= var12 || var14 <= var15)) {
				continue;
			}

			if (var9.clientCode == 1337) {
				componentUpdated(var9);
			} else if (var9.clientCode == 1338) {
				minimapLoop(var10, var11);
			} else {
				if (var9.type == 0) {
					if (!var9.v3 && hide(var9) && overCom != var9) {
						continue;
					}

					loopLayer(arg0, var10 - var9.field843, var12, var15, var13, var11 - var9.scrollPosY, var14, var9.parentId);

					if (var9.subcomponents != null) {
						loopLayer(var9.subcomponents, var10 - var9.field843, var12, var15, var13, var11 - var9.scrollPosY, var14, var9.parentId);
					}

					SubInterface var24 = (SubInterface) subinterfaces.find((long) var9.parentId);
					if (var24 != null) {
						loopInterface(var24.id, var12, var15, var14, var11, var13, var10);
					}
				}

				if (var9.v3) {
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
						dragTryPickup(var9, ClientMouseListener.mouseClickY - var11, ClientMouseListener.mouseClickX + -var10);
					}
					if (dragCom != null && dragCom != var9 && var26 && ServerActive.isDragTarget(getActive(var9))) {
						dropCom = var9;
					}
					if (var9 == dragLayer) {
						dragParentX = var10;
						dragParentFound = true;
						dragParentY = var11;
					}
					if (var9.hashook) {
						if (var26 && mouseWheelRotation != 0 && var9.onscrollwheel != null) {
							HookReq var28 = new HookReq();
							var28.onop = var9.onscrollwheel;
							var28.mouseY = mouseWheelRotation;
							var28.component = var9;
							hookRequests.push(var28);
						}
						if (dragCom != null || objDragCom != null || isMenuOpen) {
							var26 = false;
							var27 = false;
							var25 = false;
						}
						if (!var9.clickTrigger && var27) {
							var9.clickTrigger = true;
							if (var9.onclick != null) {
								HookReq var29 = new HookReq();
								var29.mouseX = ClientMouseListener.mouseClickX - var10;
								var29.component = var9;
								var29.onop = var9.onclick;
								var29.mouseY = ClientMouseListener.mouseClickY - var11;
								hookRequests.push(var29);
							}
						}
						if (var9.clickTrigger && var25 && var9.onclickrepeat != null) {
							HookReq var30 = new HookReq();
							var30.component = var9;
							var30.onop = var9.onclickrepeat;
							var30.mouseY = ClientMouseListener.mouseY - var11;
							var30.mouseX = ClientMouseListener.mouseX - var10;
							hookRequests.push(var30);
						}
						if (var9.clickTrigger && !var25) {
							var9.clickTrigger = false;
							if (var9.onrelease != null) {
								HookReq var31 = new HookReq();
								var31.mouseX = ClientMouseListener.mouseX - var10;
								var31.mouseY = ClientMouseListener.mouseY - var11;
								var31.component = var9;
								var31.onop = var9.onrelease;
								hookRequestsMouseStop.push(var31);
							}
						}
						if (var25 && var9.onhold != null) {
							HookReq var32 = new HookReq();
							var32.mouseX = ClientMouseListener.mouseX - var10;
							var32.onop = var9.onhold;
							var32.component = var9;
							var32.mouseY = ClientMouseListener.mouseY - var11;
							hookRequests.push(var32);
						}
						if (!var9.mouseTrigger && var26) {
							var9.mouseTrigger = true;
							if (var9.onmouseover != null) {
								HookReq var33 = new HookReq();
								var33.onop = var9.onmouseover;
								var33.component = var9;
								var33.mouseX = ClientMouseListener.mouseX - var10;
								var33.mouseY = ClientMouseListener.mouseY - var11;
								hookRequests.push(var33);
							}
						}
						if (var9.mouseTrigger && var26 && var9.onmouserepeat != null) {
							HookReq var34 = new HookReq();
							var34.onop = var9.onmouserepeat;
							var34.mouseY = ClientMouseListener.mouseY - var11;
							var34.mouseX = ClientMouseListener.mouseX - var10;
							var34.component = var9;
							hookRequests.push(var34);
						}
						if (var9.mouseTrigger && !var26) {
							var9.mouseTrigger = false;
							if (var9.onmouseleave != null) {
								HookReq var35 = new HookReq();
								var35.onop = var9.onmouseleave;
								var35.component = var9;
								var35.mouseX = ClientMouseListener.mouseX - var10;
								var35.mouseY = ClientMouseListener.mouseY - var11;
								hookRequestsMouseStop.push(var35);
							}
						}
						if (var9.ontimer != null) {
							HookReq var36 = new HookReq();
							var36.component = var9;
							var36.onop = var9.ontimer;
							hookRequestsTimer.push(var36);
						}
						if (var9.onvartransmit != null && varTransmitNum > var9.varTransmitNum) {
							if (var9.onvartransmitlist == null || varTransmitNum - var9.varTransmitNum > 32) {
								HookReq var37 = new HookReq();
								var37.onop = var9.onvartransmit;
								var37.component = var9;
								hookRequests.push(var37);
							} else {
								label368: for (int var38 = var9.varTransmitNum; var38 < varTransmitNum; var38++) {
									int var39 = varTransmit[var38 & 0x1F];
									for (int var40 = 0; var40 < var9.onvartransmitlist.length; var40++) {
										if (var39 == var9.onvartransmitlist[var40]) {
											HookReq var41 = new HookReq();
											var41.component = var9;
											var41.onop = var9.onvartransmit;
											hookRequests.push(var41);
											break label368;
										}
									}
								}
							}
							var9.varTransmitNum = varTransmitNum;
						}
						if (var9.oninvtransmit != null && var9.invTransmitNum < invTransmitNum) {
							if (var9.oninvtransmitlist == null || invTransmitNum - var9.invTransmitNum > 32) {
								HookReq var46 = new HookReq();
								var46.component = var9;
								var46.onop = var9.oninvtransmit;
								hookRequests.push(var46);
							} else {
								label348: for (int var42 = var9.invTransmitNum; var42 < invTransmitNum; var42++) {
									int var43 = invTransmit[var42 & 0x1F];
									for (int var44 = 0; var44 < var9.oninvtransmitlist.length; var44++) {
										if (var9.oninvtransmitlist[var44] == var43) {
											HookReq var45 = new HookReq();
											var45.onop = var9.oninvtransmit;
											var45.component = var9;
											hookRequests.push(var45);
											break label348;
										}
									}
								}
							}
							var9.invTransmitNum = invTransmitNum;
						}
						if (var9.onstattransmit != null && statTransmitNum > var9.statTransmitNum) {
							if (var9.onstattransmitlist == null || statTransmitNum - var9.statTransmitNum > 32) {
								HookReq var47 = new HookReq();
								var47.component = var9;
								var47.onop = var9.onstattransmit;
								hookRequests.push(var47);
							} else {
								label328: for (int var48 = var9.statTransmitNum; var48 < statTransmitNum; var48++) {
									int var49 = statTransmit[var48 & 0x1F];
									for (int var50 = 0; var50 < var9.onstattransmitlist.length; var50++) {
										if (var49 == var9.onstattransmitlist[var50]) {
											HookReq var51 = new HookReq();
											var51.onop = var9.onstattransmit;
											var51.component = var9;
											hookRequests.push(var51);
											break label328;
										}
									}
								}
							}
							var9.statTransmitNum = statTransmitNum;
						}
						if (chatTransmitNum > var9.transmitNum && var9.onchattransmit != null) {
							HookReq var52 = new HookReq();
							var52.component = var9;
							var52.onop = var9.onchattransmit;
							hookRequests.push(var52);
						}
						if (var9.transmitNum < friendTransmitNum && var9.onfriendtransmit != null) {
							HookReq var53 = new HookReq();
							var53.component = var9;
							var53.onop = var9.onfriendtransmit;
							hookRequests.push(var53);
						}
						if (clanTransmitNum > var9.transmitNum && var9.onclantransmit != null) {
							HookReq var54 = new HookReq();
							var54.onop = var9.onclantransmit;
							var54.component = var9;
							hookRequests.push(var54);
						}
						if (var9.transmitNum < miscTransmitNum && var9.onmisctransmit != null) {
							HookReq var55 = new HookReq();
							var55.onop = var9.onmisctransmit;
							var55.component = var9;
							hookRequests.push(var55);
						}
						var9.transmitNum = transmitNum;
						if (var9.onkey != null) {
							for (int var56 = 0; var56 < keypresses; var56++) {
								HookReq var57 = new HookReq();
								var57.component = var9;
								var57.keyCode = keypressKeycodes[var56];
								var57.keyChar = keypressKeychars[var56];
								var57.onop = var9.onkey;
								hookRequests.push(var57);
							}
						}
					}
				}
				if (!var9.v3) {
					if (dragCom != null || objDragCom != null || isMenuOpen) {
						return;
					}
					if ((var9.overLayerId >= 0 || var9.colourOver != 0) && ClientMouseListener.mouseX >= var12 && var15 <= ClientMouseListener.mouseY && var13 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var14) {
						if (var9.overLayerId < 0) {
							overCom = var9;
						} else {
							overCom = arg0[var9.overLayerId];
						}
					}
					if (var9.type == 8 && ClientMouseListener.mouseX >= var12 && var15 <= ClientMouseListener.mouseY && ClientMouseListener.mouseX < var13 && var14 > ClientMouseListener.mouseY) {
						tooltipCom = var9;
					}
					if (var9.scrollHeight > var9.height) {
						doScrollbar(var11, var9, ClientMouseListener.mouseY, var9.width + var10, var9.height, ClientMouseListener.mouseX, var9.scrollHeight);
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(IIIII)V")
	public static void minimenuBuildSceneActions(int arg0, int arg1, int arg2, int arg3) {
		if (useMode == 0 && !targetMode) {
			addMenuOption(0, Text.WALKHERE, arg3 - arg1, 3, AUTO_EMPTY, arg0 - arg2);
		}
		int var4 = -1;
		for (int var5 = 0; var5 < ModelLit.pickedCount; var5++) {
			int var6 = ModelLit.pickedEntityTypecode[var5];
			int var7 = var6 >> 29 & 0x3;
			int var8 = var6 & 0x7F;
			int var9 = var6 >> 14 & 0x7FFF;
			int var10 = var6 >> 7 & 0x7F;
			if (var6 != var4) {
				var4 = var6;
				if (var7 == 2 && world.typecode2(minusedlevel, var8, var10, var6) >= 0) {
					LocType var11 = LocType.list(var9);
					if (var11.multiloc != null) {
						var11 = var11.getMultiLoc();
					}
					if (var11 == null) {
						continue;
					}
					if (useMode == 1) {
						addMenuOption(var6, Text.USE, var10, 49, JagString.join(new JagString[] { field1148, field2087, var11.name}), var8);
					} else if (!targetMode) {
						JagString[] var12 = var11.op;
						if (showOpIndex) {
							var12 = JagString.prependOpIndex(var12);
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
									addMenuOption(var6, var12[var13], var10, var14, JagString.join(new JagString[] { field3052, var11.name}), var8);
								}
							}
						}
						addMenuOption(var11.id << 14, Text.EXAMINE, var10, 1002, JagString.join(new JagString[] { field3052, var11.name}), var8);
					} else if ((targetMask & 0x4) == 4) {
						addMenuOption(var6, targetVerb, var10, 2, JagString.join(new JagString[] {targetOp, field2087, var11.name}), var8);
					}
				}
				if (var7 == 1) {
					ClientNpc var15 = npcs[var9];
					if (var15.type.size == 1 && (var15.x & 0x7F) == 64 && (var15.z & 0x7F) == 64) {
						for (int var16 = 0; var16 < npcCount; var16++) {
							ClientNpc var17 = npcs[npcIds[var16]];
							if (var17 != null && var17 != var15 && var17.type.size == 1 && var15.x == var17.x && var15.z == var17.z) {
								addNpcOptions(var8, var17.type, npcIds[var16], var10);
							}
						}
						for (int var18 = 0; var18 < playerCount; var18++) {
							ClientPlayer var19 = players[playerIds[var18]];
							if (var19 != null && var15.x == var19.x && var15.z == var19.z) {
								addPlayerOptions(playerIds[var18], var10, var19, var8);
							}
						}
					}
					addNpcOptions(var8, var15.type, var9, var10);
				}
				if (var7 == 0) {
					ClientPlayer var20 = players[var9];
					if ((var20.x & 0x7F) == 64 && (var20.z & 0x7F) == 64) {
						for (int var21 = 0; var21 < npcCount; var21++) {
							ClientNpc var22 = npcs[npcIds[var21]];
							if (var22 != null && var22.type.size == 1 && var22.x == var20.x && var20.z == var22.z) {
								addNpcOptions(var8, var22.type, npcIds[var21], var10);
							}
						}
						for (int var23 = 0; var23 < playerCount; var23++) {
							ClientPlayer var24 = players[playerIds[var23]];
							if (var24 != null && var20 != var24 && var24.x == var20.x && var20.z == var24.z) {
								addPlayerOptions(playerIds[var23], var10, var24, var8);
							}
						}
					}
					addPlayerOptions(var9, var10, var20, var8);
				}
				if (var7 == 3) {
					LinkList var25 = groundObj[minusedlevel][var8][var10];
					if (var25 != null) {
						for (ClientObj var26 = (ClientObj) var25.tail(); var26 != null; var26 = (ClientObj) var25.prev()) {
							ObjType var27 = ObjType.list(var26.id);
							if (useMode == 1) {
								addMenuOption(var26.id, Text.USE, var10, 20, JagString.join(new JagString[] { field1148, field1132, var27.name}), var8);
							} else if (!targetMode) {
								JagString[] var28 = var27.op;
								if (showOpIndex) {
									var28 = JagString.prependOpIndex(var28);
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
										addMenuOption(var26.id, var28[var29], var10, var30, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var27.name}), var8);
									} else if (var29 == 2) {
										addMenuOption(var26.id, Text.TAKE, var10, 31, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var27.name}), var8);
									}
								}
								addMenuOption(var26.id, Text.EXAMINE, var10, 1001, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var27.name}), var8);
							} else if ((targetMask & 0x1) == 1) {
								addMenuOption(var26.id, targetVerb, var10, 33, JagString.join(new JagString[] {targetOp, field1132, var27.name}), var8);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mc.a(ILf;IIIIII)V")
	public static void doScrollbar(int arg0, IfType arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}
		scrollGrabbed = false;
		if (ClientMouseListener.mouseButton != 0) {
			if (arg5 >= arg3 && arg3 + 16 > arg5 && arg2 >= arg0 && arg0 + 16 > arg2) {
				arg1.scrollPosY -= 4;
				componentUpdated(arg1);
			} else if (arg3 <= arg5 && arg5 < arg3 + 16 && arg2 >= arg0 + arg4 - 16 && arg0 + arg4 > arg2) {
				arg1.scrollPosY += 4;
				componentUpdated(arg1);
			} else if (arg5 >= arg3 - scrollInputPadding && arg5 < scrollInputPadding + arg3 + 16 && arg0 + 16 <= arg2 && arg2 < arg0 + arg4 - 16) {
				int var7 = (arg4 - 32) * arg4 / arg6;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg2 - arg0 - var7 / 2 - 16;
				int var9 = arg4 - var7 - 32;
				arg1.scrollPosY = (arg6 - arg4) * var8 / var9;
				componentUpdated(arg1);
				scrollGrabbed = true;
			}
		}
		if (mouseWheelRotation != 0) {
			int var10 = arg1.width;
			if (arg5 >= arg3 - var10 && arg0 <= arg2 && arg3 + 16 > arg5 && arg0 + arg4 >= arg2) {
				arg1.scrollPosY += mouseWheelRotation * 45;
				componentUpdated(arg1);
			}
		}
	}

	@ObfuscatedName("me.a(IIII)V")
	public static void minimapDraw(int arg0, int arg1, int arg2) {
		doAudio();
		Pix2D.setClipping(arg1, arg0, mapback.wi + arg1, arg0 - -mapback.hi);
		if (minimapState == 2 || minimapState == 5) {
			Pix2D.fillScanLine(arg1 + 25, arg0 + 5, minimapMaskLineOffsets, minimapMaskLineLengths);
		} else {
			int var3 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
			int var4 = localPlayer.x / 32 + 48;
			int var5 = 464 - localPlayer.z / 32;
			minimap.scanlineRotatePlotSprite(arg1 + 25, arg0 + 5, 146, 151, var4, var5, var3, macroMinimapZoom + 256, minimapMaskLineOffsets, minimapMaskLineLengths);
			for (int var6 = 0; var6 < activeMapFunctionCount; var6++) {
				int var7 = activeMapFunctionX[var6] * 4 + 2 - localPlayer.x / 32;
				int var8 = activeMapFunctionZ[var6] * 4 + 2 - localPlayer.z / 32;
				minimapDrawDot(arg1, arg0, var8, activeMapFunctions[var6], var7);
			}
			for (int var9 = 0; var9 < 104; var9++) {
				for (int var10 = 0; var10 < 104; var10++) {
					LinkList var11 = groundObj[minusedlevel][var9][var10];
					if (var11 != null) {
						int var12 = var10 * 4 + 2 - localPlayer.z / 32;
						int var13 = var9 * 4 + 2 - localPlayer.x / 32;
						minimapDrawDot(arg1, arg0, var12, mapdots[0], var13);
					}
				}
			}
			for (int var14 = 0; var14 < npcCount; var14++) {
				ClientNpc var15 = npcs[npcIds[var14]];
				if (var15 != null && var15.ready()) {
					NpcType var16 = var15.type;
					if (var16 != null && var16.multinpc != null) {
						var16 = var16.getMultiNpc();
					}
					if (var16 != null && var16.minimap && var16.active) {
						int var17 = var15.z / 32 - localPlayer.z / 32;
						int var18 = var15.x / 32 - localPlayer.x / 32;
						minimapDrawDot(arg1, arg0, var17, mapdots[1], var18);
					}
				}
			}
			for (int var19 = 0; var19 < playerCount; var19++) {
				ClientPlayer var20 = players[playerIds[var19]];
				if (var20 != null && var20.ready()) {
					int var21 = var20.x / 32 - localPlayer.x / 32;
					int var22 = var20.z / 32 - localPlayer.z / 32;
					long var23 = var20.name.toUserhash();
					boolean var25 = false;
					for (int var26 = 0; var26 < friendCount; var26++) {
						if (field694[var26] == var23 && field2094[var26] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var27 = false;
					if (localPlayer.team != 0 && var20.team != 0 && var20.team == localPlayer.team) {
						var27 = true;
					}
					if (var25) {
						minimapDrawDot(arg1, arg0, var22, mapdots[3], var21);
					} else if (var27) {
						minimapDrawDot(arg1, arg0, var22, mapdots[4], var21);
					} else {
						minimapDrawDot(arg1, arg0, var22, mapdots[2], var21);
					}
				}
			}
			if (hintType != 0 && loopCycle % 20 < 10) {
				if (hintType == 1 && hintNpc >= 0 && hintNpc < npcs.length) {
					ClientNpc var28 = npcs[hintNpc];
					if (var28 != null) {
						int var29 = var28.x / 32 - localPlayer.x / 32;
						int var30 = var28.z / 32 - localPlayer.z / 32;
						minimapDrawArrow(var29, arg0, arg1, var30, mapmarker[1]);
					}
				}
				if (hintType == 2) {
					int var31 = (hintTileX - mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
					int var32 = (hintTileZ - mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
					minimapDrawArrow(var31, arg0, arg1, var32, mapmarker[1]);
				}
				if (hintType == 10 && hintPlayer >= 0 && players.length > hintPlayer) {
					ClientPlayer var33 = players[hintPlayer];
					if (var33 != null) {
						int var34 = var33.x / 32 - localPlayer.x / 32;
						int var35 = var33.z / 32 - localPlayer.z / 32;
						minimapDrawArrow(var34, arg0, arg1, var35, mapmarker[1]);
					}
				}
			}
			if (minimapFlagX != 0) {
				int var36 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
				int var37 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
				minimapDrawDot(arg1, arg0, var37, mapmarker[0], var36);
			}
			Pix2D.fillRect(arg1 + 4 + 93, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (minimapState < 3) {
			compass.scanlineRotatePlotSprite(arg1, arg0, 33, 33, 25, 25, orbitCameraYaw, 256, compassMaskLineOffsets, compassMaskLineLengths);
		} else {
			Pix2D.fillScanLine(arg1, arg0, compassMaskLineOffsets, compassMaskLineLengths);
		}
		if (componentRedraw[arg2]) {
			mapback.plotSprite(arg1, arg0);
		}
		componentBlitArea[arg2] = true;
	}

	@ObfuscatedName("mf.a(Lf;Lec;Z)Lec;")
	public static JagString substituteVars(IfType arg0, JagString arg1) {
		if (arg1.indexOf(AUTO_PCT) == -1) {
			return arg1;
		}

		// text "optimization" did this: `"%" + i` was unrolled and evaluated to const
		while (true) {
			int var2 = arg1.indexOf(field1308);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.indexOf(field912);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.indexOf(field1664);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.indexOf(field920);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.indexOf(field3145);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.indexOf(field2617);
													if (var7 == -1) {
														return arg1;
													}
													JagString var8 = AUTO_EMPTY;
													if (lastAddress != null) {
														var8 = JagString.formatIPv4(lastAddress.intArg);
														try {
															if (lastAddress.result != null) {
																byte[] var9 = ((String) lastAddress.result).getBytes("ISO-8859-1");
																var8 = JagString.fromBytes(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = JagString.join(new JagString[] { arg1.substring(0, var7), var8, arg1.substring(var7 + 4) });
												}
											}
											arg1 = JagString.join(new JagString[] { arg1.substring(0, var6), inf(getIfVar(arg0, 4)), arg1.substring(var6 + 2) });
										}
									}
									arg1 = JagString.join(new JagString[] { arg1.substring(0, var5), inf(getIfVar(arg0, 3)), arg1.substring(var5 + 2) });
								}
							}
							arg1 = JagString.join(new JagString[] { arg1.substring(0, var4), inf(getIfVar(arg0, 2)), arg1.substring(var4 + 2) });
						}
					}
					arg1 = JagString.join(new JagString[] { arg1.substring(0, var3), inf(getIfVar(arg0, 1)), arg1.substring(var3 + 2) });
				}
			}
			arg1 = JagString.join(new JagString[] { arg1.substring(0, var2), inf(getIfVar(arg0, 0)), arg1.substring(var2 + 2) });
		}
	}

	@ObfuscatedName("oe.c(I)V")
	public static void addMapAnim() {
		for (MapSpotAnim var0 = (MapSpotAnim) spotanims.head(); var0 != null; var0 = (MapSpotAnim) spotanims.next()) {
			if (var0.level != minusedlevel || var0.animComplete) {
				var0.unlink();
			} else if (var0.startCycle <= loopCycle) {
				var0.doAnim(worldUpdateNum);
				if (var0.animComplete) {
					var0.unlink();
				} else {
					world.addDynamic(var0.level, var0.field3164, var0.field3171, var0.field3167, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("tc.a(I)V")
	public static void openMenu() {
		int var0 = b12.stringWid(Text.CHOOSEOPTION);
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			int var2 = b12.stringWid(getLine(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		menuHeight = menuNumEntries * 15 + 22;
		var0 += 8;
		isMenuOpen = true;
		int var3 = menuNumEntries * 15 + 21;
		int var4 = ClientMouseListener.mouseClickX - var0 / 2;
		menuX = var0;
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
		menuY = var5;
		menuWidth = var4;
	}

	@ObfuscatedName("la.a(IILec;II)V")
	public static void ifButtonX(int arg0, int arg1, JagString arg2, int arg3) {
		IfType var4 = IfType.get(arg3, arg1);
		if (var4 == null) {
			return;
		}

		if (var4.onop != null) {
			HookReq var5 = new HookReq();
			var5.component = var4;
			var5.opbase = arg2;
			var5.opindex = arg0;
			var5.onop = var4.onop;
			ScriptRunner.executeScript(var5);
		}

		boolean var6 = true;
		if (var4.clientCode > 0) {
			var6 = clientButton(var4);
		}

		if (var6 && ServerActive.hasOp(getActive(var4), arg0 - 1)) {
			if (arg0 == 1) {
				// IF_BUTTON1
				out.p1Enc(221);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 2) {
				// IF_BUTTON2
				out.p1Enc(108);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 3) {
				// IF_BUTTON3
				out.p1Enc(181);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 4) {
				// IF_BUTTON4
				out.p1Enc(143);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 5) {
				// IF_BUTTON5
				out.p1Enc(167);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 6) {
				// IF_BUTTON6
				out.p1Enc(175);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 7) {
				// IF_BUTTON7
				out.p1Enc(162);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 8) {
				// IF_BUTTON8
				out.p1Enc(98);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 9) {
				// IF_BUTTON9
				out.p1Enc(103);
				out.p4(arg1);
				out.p2(arg3);
			} else if (arg0 == 10) {
				// IF_BUTTON10
				out.p1Enc(150);
				out.p4(arg1);
				out.p2(arg3);
			}
		}
	}

	@ObfuscatedName("rf.a(III)V")
	public static void drawFeedback(int arg0, int arg1) {
		if (menuNumEntries < 2 && useMode == 0 && !targetMode) {
			return;
		}
		JagString var2;
		if (useMode == 1 && menuNumEntries < 2) {
			var2 = JagString.join(new JagString[] { Text.USE, Text.MINISEPARATOR, field1148, field1300 });
		} else if (targetMode && menuNumEntries < 2) {
			var2 = JagString.join(new JagString[] {targetVerb, Text.MINISEPARATOR, targetOp, field1300 });
		} else {
			var2 = getLine(menuNumEntries - 1);
		}
		if (menuNumEntries > 2) {
			var2 = JagString.join(new JagString[] { var2, field711, JagString.parseInt(menuNumEntries - 2), Text.MOREOPTIONS});
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
		camY = arg1 - var9;
		camX = arg3 - var10;
		camZ = arg5 - var7;
		camYaw = arg0;
		camPitch = arg4;
	}

	@ObfuscatedName("fe.e(I)V")
	public static void getNpcPos() {
		entityUpdateCount = 0;
		entityRemovalCount = 0;
		getNpcPosOldVis();
		getNpcPosNewVis();
		getNpcPosExtended();
		for (int var0 = 0; var0 < entityRemovalCount; var0++) {
			int var1 = entityRemovalIds[var0];
			if (npcs[var1].cycle != loopCycle) {
				npcs[var1].type = null;
				npcs[var1] = null;
			}
		}
		if (in.pos != psize) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < npcCount; var2++) {
			if (npcs[npcIds[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + npcCount);
			}
		}
	}

	@ObfuscatedName("ha.d(I)I")
	public static int roofCheck2() {
		int var0 = getAvH(minusedlevel, camX, camZ);
		return var0 - camY >= 800 || (ClientBuild.mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("ha.e(I)V")
	public static void timeoutChat() {
		for (int var0 = -1; var0 < playerCount; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = playerIds[var0];
			}
			ClientPlayer var2 = players[var1];
			if (var2 != null && var2.chatTimer > 0) {
				var2.chatTimer--;
				if (var2.chatTimer == 0) {
					var2.chat = null;
				}
			}
		}
		for (int var3 = 0; var3 < npcCount; var3++) {
			int var4 = npcIds[var3];
			ClientNpc var5 = npcs[var4];
			if (var5 != null && var5.chatTimer > 0) {
				var5.chatTimer--;
				if (var5.chatTimer == 0) {
					var5.chat = null;
				}
			}
		}
	}

	@ObfuscatedName("ja.a(III)V")
	public static void coordArrow(int arg0, int arg1) {
		if (hintType == 2) {
			getOverlayPos((hintTileZ - mapBuildBaseZ << 7) + hintOffsetZ, (-mapBuildBaseX + hintTileX << 7) + hintOffsetX, hintHeight * 2);
			if (projectX > -1 && loopCycle % 20 < 10) {
				headiconsHint[0].plotSprite(arg0 + projectX - 12, arg1 - (-projectY + 28));
			}
		}
	}

	@ObfuscatedName("pa.a(I)V")
	public static void endTargetMode() {
		if (!targetMode) {
			return;
		}

		IfType var0 = IfType.get(field3319, field1002);
		if (var0 != null && var0.ontargetleave != null) {
			HookReq req = new HookReq();
			req.component = var0;
			req.onop = var0.ontargetleave;
			ScriptRunner.executeScript(req);
		}

		targetMode = false;
		componentUpdated(var0);
	}

	@ObfuscatedName("qa.a(II)V")
	public static void clientVar(int arg0) {
		legacyUpdated();
		BgSound.recalculateMultilocs();
		int var1 = VarpType.list(arg0).clientcode;
		if (var1 == 0) {
			return;
		}
		int var2 = VarCache.var[arg0];
		if (var1 == 1) {
			if (var2 == 1) {
				Pix3D.initColourTable(0.9D);
				((TextureManager) Pix3D.textureManager).setBrightness(0.9D);
			}
			if (var2 == 2) {
				Pix3D.initColourTable(0.8D);
				((TextureManager) Pix3D.textureManager).setBrightness(0.8D);
			}
			if (var2 == 3) {
				Pix3D.initColourTable(0.7D);
				((TextureManager) Pix3D.textureManager).setBrightness(0.7D);
			}
			if (var2 == 4) {
				Pix3D.initColourTable(0.6D);
				((TextureManager) Pix3D.textureManager).setBrightness(0.6D);
			}
			ObjType.resetSpriteCache();
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
			if (midiVolume != var3) {
				if (midiVolume == 0 && nextMidiSong != -1) {
					MidiManager.play(songs, nextMidiSong, var3, 0);
					playingJingle = false;
				} else if (var3 == 0) {
					MidiManager.stop();
					playingJingle = false;
				} else {
					MidiManager.setVolume(var3);
				}
				midiVolume = var3;
			}
		}
		if (var1 == 10) {
			if (var2 == 0) {
				ambientVolume = 127;
			}
			if (var2 == 1) {
				ambientVolume = 96;
			}
			if (var2 == 2) {
				ambientVolume = 64;
			}
			if (var2 == 3) {
				ambientVolume = 32;
			}
			if (var2 == 4) {
				ambientVolume = 0;
			}
		}
		if (var1 == 6) {
			field1035 = var2;
		}
		if (var1 == 4) {
			if (var2 == 0) {
				waveVolume = 127;
			}
			if (var2 == 1) {
				waveVolume = 96;
			}
			if (var2 == 2) {
				waveVolume = 64;
			}
			if (var2 == 3) {
				waveVolume = 32;
			}
			if (var2 == 4) {
				waveVolume = 0;
			}
		}
		if (var1 == 5) {
			oneMouseButton = var2;
		}
		if (var1 == 9) {
			bankArrangeMode = var2;
		}
	}

	@ObfuscatedName("pb.a(I[Lf;I)V")
	public static void animateLayer(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null && var3.layerId == arg0 && (!var3.v3 || !hide(var3))) {
				if (var3.type == 0) {
					if (!var3.v3 && hide(var3) && overCom != var3) {
						continue;
					}
					animateLayer(var3.parentId, arg1);
					if (var3.subcomponents != null) {
						animateLayer(var3.parentId, var3.subcomponents);
					}
					SubInterface var4 = (SubInterface) subinterfaces.find((long) var3.parentId);
					if (var4 != null) {
						animateInterface(var4.id);
					}
				}
				if (var3.type == 6) {
					if (var3.modelAnim != -1 || var3.modelAnim2 != -1) {
						boolean var5 = getIfActive(var3);
						int var6;
						if (var5) {
							var6 = var3.modelAnim2;
						} else {
							var6 = var3.modelAnim;
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
					if (var3.field749 != 0 && !var3.v3) {
						int var8 = var3.field749 >> 16;
						int var9 = var3.field749 << 16 >> 16;
						int var10 = var8 * worldUpdateNum;
						var3.modelXAn = var10 + var3.modelXAn & 0x7FF;
						int var11 = var9 * worldUpdateNum;
						var3.modelYAn = var3.modelYAn + var11 & 0x7FF;
						componentUpdated(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(III[Lf;IIIIII)V")
	public static void drawLayer(int arg0, int arg1, IfType[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Pix2D.setClipping(arg1, arg7, arg0, arg8);
		Pix3D.setRenderClipping();
		for (int var9 = 0; var9 < arg2.length; var9++) {
			IfType var10 = arg2[var9];
			if (var10 != null && (arg3 == var10.layerId || arg3 == 0xabcdabcd && dragCom == var10)) {
				int var11;
				if (arg6 == -1) {
					componentDrawX[componentDrawCount] = arg4 + var10.x;
					componentDrawY[componentDrawCount] = arg5 + var10.y;
					componentDrawWidth[componentDrawCount] = var10.width;
					componentDrawHeight[componentDrawCount] = var10.height;
					var11 = componentDrawCount++;
				} else {
					var11 = arg6;
				}
				var10.drawCount = var11;
				var10.drawTime = loopCycle;
				if (!var10.v3 || !hide(var10)) {
					if (var10.clientCode > 0) {
						clientComponent(var10);
					}
					int var12 = arg4 + var10.x;
					int var13 = var10.trans;
					int var14 = var10.y + arg5;
					if (dragCom == var10) {
						if (arg3 != 0xabcdabcd && !var10.draggablebehavior) {
							field1968 = arg5;
							field1603 = arg4;
							dragChildren = arg2;
							continue;
						}
						if (!var10.draggablebehavior) {
							var13 = 128;
						}
						if (dragAlive && dragParentFound) {
							int var15 = ClientMouseListener.mouseY;
							int var16 = var15 - dragPickupY;
							if (dragParentY > var16) {
								var16 = dragParentY;
							}
							if (dragLayer.height + dragParentY < var16 + var10.height) {
								var16 = dragLayer.height + dragParentY - var10.height;
							}
							int var17 = ClientMouseListener.mouseX;
							int var18 = var17 - dragPickupX;
							var14 = var16;
							if (dragParentX > var18) {
								var18 = dragParentX;
							}
							if (dragLayer.width + dragParentX < var18 + var10.width) {
								var18 = dragParentX + dragLayer.width - var10.width;
							}
							var12 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var19 = arg8;
						var20 = arg1;
						var21 = arg7;
						var22 = arg0;
					} else if (var10.type == 9) {
						int var25 = var14;
						int var26 = var12;
						int var27 = var10.height + var14;
						int var28 = var10.width + var12;
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
						int var23 = var12 + var10.width;
						int var24 = var14 + var10.height;
						var22 = var23 < arg0 ? var23 : arg0;
						var19 = var24 >= arg8 ? arg8 : var24;
					}
					if (!var10.v3 || var22 > var20 && var21 < var19) {
						if (var10.clientCode != 0) {
							if (var10.clientCode == 1337) {
								minimenuMouseOverY = var14;
								minimenuMouseOverX = var12;
								gameDrawMain(var10.width, var12, var10.height, var14);
								Pix2D.setClipping(arg1, arg7, arg0, arg8);
								continue;
							}
							if (var10.clientCode == 1338) {
								minimapDraw(var14, var12, var11);
								Pix2D.setClipping(arg1, arg7, arg0, arg8);
								continue;
							}
						}
						int var31 = ClientMouseListener.mouseX;
						int var32 = ClientMouseListener.mouseY;
						if (!isMenuOpen && var20 <= var31 && var21 <= var32 && var22 > var31 && var19 > var32) {
							addComponentOptions(var32 - var14, var10, var31 - var12);
						}
						if (var10.type == 0) {
							if (!var10.v3 && hide(var10) && var10 != overCom) {
								continue;
							}
							if (!var10.v3) {
								if (var10.scrollHeight - var10.height < var10.scrollPosY) {
									var10.scrollPosY = var10.scrollHeight - var10.height;
								}
								if (var10.scrollPosY < 0) {
									var10.scrollPosY = 0;
								}
							}

							drawLayer(var22, var20, arg2, var10.parentId, var12 - var10.field843, -var10.scrollPosY + var14, var11, var21, var19);

							if (var10.subcomponents != null) {
								drawLayer(var22, var20, var10.subcomponents, var10.parentId, var12 - var10.field843, -var10.scrollPosY + var14, var11, var21, var19);
							}

							SubInterface var33 = (SubInterface) subinterfaces.find((long) var10.parentId);
							if (var33 != null) {
								if (var33.type == 0 && ClientMouseListener.mouseX >= var20 && ClientMouseListener.mouseY >= var21 && ClientMouseListener.mouseX < var22 && var19 > ClientMouseListener.mouseY && !isMenuOpen && !qaOpTest) {
									menuNumEntries = 1;
									menuAction[0] = 1007;
									menuVerb[0] = Text.CANCEL;
									menuSubject[0] = AUTO_EMPTY;
								}

								drawInterface(var21, var12, var33.id, var20, var11, var22, var19, var14);
							}

							Pix2D.setClipping(arg1, arg7, arg0, arg8);
							Pix3D.setRenderClipping();
						}

						if (!componentRedraw[var11] && componentRectDebug <= 1) {
							continue;
						}

						if (var10.type == 0 && !var10.v3 && var10.height < var10.scrollHeight) {
							drawScrollbar(var10.scrollPosY, var14, var10.width + var12, var10.scrollHeight, var10.height);
						} else if (var10.type == 1) {
						} else if (var10.type == 2) {
							int var34 = 0;
							for (int var35 = 0; var35 < var10.height; var35++) {
								for (int var36 = 0; var36 < var10.width; var36++) {
									int var37 = var12 + (var10.marginX + 32) * var36;
									int var38 = var14 + var35 * (var10.marginY + 32);
									if (var34 < 20) {
										var38 += var10.invBackgroundY[var34];
										var37 += var10.invBackgroundX[var34];
									}
									if (var10.linkObjType[var34] > 0) {
										int var39 = var10.linkObjType[var34] - 1;
										if (arg1 < var37 + 32 && var37 < arg0 && arg7 < var38 + 32 && var38 < arg8 || objDragCom == var10 && var34 == objDragSlot) {
											Pix32 var40;
											if (useMode == 1 && var34 == field966 && field1038 == var10.parentId) {
												var40 = ObjType.getSprite(2, var39, false, 0, var10.linkObjNumber[var34]);
											} else {
												var40 = ObjType.getSprite(1, var39, false, 3153952, var10.linkObjNumber[var34]);
											}
											if (var40 == null) {
												componentUpdated(var10);
											} else if (var10 == objDragCom && objDragSlot == var34) {
												int var41 = ClientMouseListener.mouseX - objGrabX;
												int var42 = ClientMouseListener.mouseY - objGrabY;
												if (var41 < 5 && var41 > -5) {
													var41 = 0;
												}
												if (var42 < 5 && var42 > -5) {
													var42 = 0;
												}
												if (objDragCycles < 5) {
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
											} else if (var10 == selectedCom && field729 == var34) {
												var40.transPlotSprite(var37, var38, 128);
											} else {
												var40.plotSprite(var37, var38);
											}
										}
									} else if (var10.invBackground != null && var34 < 20) {
										Pix32 var46 = var10.getInvBackground(var34);
										if (var46 != null) {
											var46.plotSprite(var37, var38);
										} else if (IfType.loadingAsset) {
											componentUpdated(var10);
										}
									}
									var34++;
								}
							}
						} else if (var10.type == 3) {
							int var47;
							if (getIfActive(var10)) {
								var47 = var10.colour2;
								if (var10 == overCom && var10.colour2Over != 0) {
									var47 = var10.colour2Over;
								}
							} else {
								var47 = var10.colour;
								if (var10 == overCom && var10.colourOver != 0) {
									var47 = var10.colourOver;
								}
							}
							if (var13 == 0) {
								if (var10.fill) {
									Pix2D.fillRect(var12, var14, var10.width, var10.height, var47);
								} else {
									Pix2D.drawRect(var12, var14, var10.width, var10.height, var47);
								}
							} else if (var10.fill) {
								Pix2D.fillRectTrans(var12, var14, var10.width, var10.height, var47, 256 - (var13 & 0xFF));
							} else {
								Pix2D.drawRectTrans(var12, var14, var10.width, var10.height, var47, 256 - (var13 & 0xFF));
							}
						} else if (var10.type == 4) {
							PixFontGeneric var48 = var10.getFont();
							if (var48 != null) {
								JagString var49 = var10.text;
								int var50;
								if (getIfActive(var10)) {
									var50 = var10.colour2;
									if (overCom == var10 && var10.colour2Over != 0) {
										var50 = var10.colour2Over;
									}
									if (var10.text2.length() > 0) {
										var49 = var10.text2;
									}
								} else {
									var50 = var10.colour;
									if (var10 == overCom && var10.colourOver != 0) {
										var50 = var10.colourOver;
									}
								}
								if (var10.v3 && var10.invobject != -1) {
									ObjType var51 = ObjType.list(var10.invobject);
									var49 = var51.name;
									if (var49 == null) {
										var49 = AUTO_NULL2;
									}
									if ((var51.stackable == 1 || var10.invcount != 1) && var10.invcount != -1) {
										var49 = JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var49, AUTO_TAG_COLOURCLOSE_X, JagString.niceNumber(var10.invcount) });
									}
								}
								if (resumePauseCom == var10) {
									var49 = Text.PLEASEWAIT;
									var50 = var10.colour;
								}
								if (!var10.v3) {
									var49 = substituteVars(var10, var49);
								}
								var48.drawStringMultiline(var49, var12, var14, var10.width, var10.height, var50, var10.shadow ? 0 : -1, var10.hAlign, var10.vAlign, var10.lineHeight);
							} else if (IfType.loadingAsset) {
								componentUpdated(var10);
							}
						} else if (var10.type == 5) {
							if (var10.v3) {
								Pix32 var53;
								if (var10.invobject == -1) {
									var53 = var10.getGraphic(false);
								} else {
									var53 = ObjType.getSprite(var10.outline, var10.invobject, false, var10.shadowColour, var10.invcount);
								}
								if (var53 != null) {
									int var54 = var53.owi;
									int var55 = var53.ohi;
									if (var10.tiling) {
										Pix2D.setSubClipping(var12, var14, var12 + var10.width, var10.height + var14);
										int var57 = (var54 + var10.width - 1) / var54;
										int var58 = (var55 + var10.height - 1) / var55;
										for (int var59 = 0; var59 < var57; var59++) {
											for (int var60 = 0; var60 < var58; var60++) {
												if (var10.rotate != 0) {
													var53.pixelPerfectRotateScalePlotSprite(var12 + var54 * var59 + var54 / 2, var55 * var60 + var14 + var55 / 2, var10.rotate, 4096);
												} else if (var13 == 0) {
													var53.plotSprite(var12 + var54 * var59, var14 - -(var60 * var55));
												} else {
													var53.transPlotSprite(var59 * var54 + var12, var60 * var55 + var14, 256 - (var13 & 0xFF));
												}
											}
										}
										Pix2D.setClipping(arg1, arg7, arg0, arg8);
									} else {
										int var56 = var10.width * 4096 / var54;
										if (var10.rotate != 0) {
											var53.pixelPerfectRotateScalePlotSprite(var10.width / 2 + var12, var14 + var10.height / 2, var10.rotate, var56);
										} else if (var13 != 0) {
											var53.transScalePlotSprite(var12, var14, var10.width, var10.height, 256 - (var13 & 0xFF));
										} else if (var10.width == var54 && var10.height == var55) {
											var53.plotSprite(var12, var14);
										} else {
											var53.scalePlotSprite(var12, var14, var10.width, var10.height);
										}
									}
								} else if (IfType.loadingAsset) {
									componentUpdated(var10);
								}
							} else {
								Pix32 var52 = var10.getGraphic(getIfActive(var10));
								if (var52 != null) {
									var52.plotSprite(var12, var14);
								} else if (IfType.loadingAsset) {
									componentUpdated(var10);
								}
							}
						} else if (var10.type == 6) {
							boolean var61 = getIfActive(var10);
							int var62;
							if (var61) {
								var62 = var10.modelAnim2;
							} else {
								var62 = var10.modelAnim;
							}
							ModelLit var63 = null;
							int var64 = 0;
							if (var10.invobject != -1) {
								ObjType var66 = ObjType.list(var10.invobject);
								if (var66 != null) {
									ObjType var67 = var66.getStackSizeAlt(var10.invcount);
									var63 = var67.getModelLit(1);
									if (var63 == null) {
										componentUpdated(var10);
									} else {
										var63.calcBoundingCylinder();
										var64 = var63.minY / 2;
									}
								}
							} else if (var10.model1Type == 5) {
								if (var10.model1Id == 0) {
									var63 = idkDesign.getTempModel(null, -1, null, -1);
								} else {
									var63 = localPlayer.getTempModel();
								}
							} else if (var62 == -1) {
								var63 = var10.getTempModel(null, localPlayer.model, -1, var61);
								if (var63 == null && IfType.loadingAsset) {
									componentUpdated(var10);
								}
							} else {
								SeqType var65 = SeqType.list(var62);
								var63 = var10.getTempModel(var65, localPlayer.model, var10.field762, var61);
								if (var63 == null && IfType.loadingAsset) {
									componentUpdated(var10);
								}
							}
							Pix3D.setOrigin(var10.width / 2 + var12, var10.height / 2 + var14);
							int var68 = Pix3D.sinTable[var10.modelXAn] * var10.modelZoom >> 16;
							int var69 = var10.modelZoom * Pix3D.cosTable[var10.modelXAn] >> 16;
							if (var63 != null) {
								if (var10.v3) {
									var63.calcBoundingCylinder();
									if (var10.orthog) {
										var63.objRenderOrthog(var10.modelYAn, var10.modelZAn, var10.modelXAn, var10.modelXOf, var64 + var68 + var10.modelYOf, var10.modelYOf + var69, var10.modelZoom);
									} else {
										var63.objRender(var10.modelYAn, var10.modelZAn, var10.modelXAn, var10.modelXOf, var10.modelYOf + var64 + var68, var69 + var10.modelYOf);
									}
								} else {
									var63.objRender(var10.modelYAn, 0, var10.modelXAn, 0, var68, var69);
								}
							}
							Pix3D.resetOrigin();
						} else if (var10.type == 7) {
							PixFontGeneric var70 = var10.getFont();
							if (var70 == null) {
								if (IfType.loadingAsset) {
									componentUpdated(var10);
								}
								continue;
							}
							int var71 = 0;
							for (int var72 = 0; var72 < var10.height; var72++) {
								for (int var73 = 0; var73 < var10.width; var73++) {
									if (var10.linkObjType[var71] > 0) {
										ObjType var74 = ObjType.list(var10.linkObjType[var71] - 1);
										JagString var75;
										if (var74.stackable != 1 && var10.linkObjNumber[var71] == 1) {
											var75 = JagString.join(new JagString[]{AUTO_TAG_COLOUR_ff9040, var74.name, JagString.field1508});
										} else {
											var75 = JagString.join(new JagString[]{AUTO_TAG_COLOUR_ff9040, var74.name, AUTO_TAG_COLOURCLOSE_X, JagString.niceNumber(var10.linkObjNumber[var71])});
										}
										int var76 = var12 + var73 * (var10.marginX + 115);
										int var77 = var72 * (var10.marginY + 12) + var14;
										if (var10.hAlign == 0) {
											var70.drawString(var75, var76, var77, var10.colour, var10.shadow ? 0 : -1);
										} else if (var10.hAlign == 1) {
											var70.centreString(var75, var76 + var10.width / 2, var77, var10.colour, var10.shadow ? 0 : -1);
										} else {
											var70.rightString(var75, var10.width + var76 - 1, var77, var10.colour, var10.shadow ? 0 : -1);
										}
									}
									var71++;
								}
							}
						} else if (var10.type == 8 && tooltipCom == var10 && tooltipNum == tooltipRedraw) {
							int var78 = 0;
							PixFontGeneric var79 = p12;
							JagString var80 = var10.text;
							JagString var81 = substituteVars(var10, var80);
							int var82 = 0;
							while (var81.length() > 0) {
								int var83 = var81.indexOf(field3538);
								JagString var84;
								if (var83 == -1) {
									var84 = var81;
									var81 = AUTO_EMPTY;
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
							int var86 = var10.width + var12 - var78 - 5;
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
							JagString var89 = var10.text;
							JagString var90 = substituteVars(var10, var89);
							while (var90.length() > 0) {
								int var91 = var90.indexOf(field3538);
								JagString var92;
								if (var91 == -1) {
									var92 = var90;
									var90 = AUTO_EMPTY;
								} else {
									var92 = var90.substring(0, var91);
									var90 = var90.substring(var91 + 4);
								}
								var79.drawString(var92, var86 + 3, var88, 0, -1);
								var88 += var79.ascent + 1;
							}
						} else if (var10.type == 9) {
							if (var10.lineWidth == 1) {
								Pix2D.line(var12, var14, var12 + var10.width, var14 - -var10.height, var10.colour);
							} else {
								int var93 = var10.height >= 0 ? var10.height : -var10.height;
								int var94 = var10.width >= 0 ? var10.width : -var10.width;
								int var95 = var94;
								if (var93 > var94) {
									var95 = var93;
								}
								if (var95 != 0) {
									int var96 = (var10.width << 16) / var95;
									int var97 = (var10.height << 16) / var95;
									if (var97 > var96) {
										var97 = -var97;
									} else {
										var96 = -var96;
									}
									int var98 = var10.lineWidth * var97 >> 17;
									int var99 = var10.lineWidth * var97 + 1 >> 17;
									int var100 = var10.lineWidth * var96 + 1 >> 17;
									int var101 = var96 * var10.lineWidth >> 17;
									int var102 = var12 - var99;
									int var103 = var12 + var98;
									int var104 = var12 + var10.width - var99;
									int var105 = var98 + var12 + var10.width;
									int var106 = var101 + var14;
									int var107 = var14 - var100;
									int var108 = var10.height + var14 - var100;
									int var109 = var10.height + var14 + var101;
									Pix3D.setHClip(var103, var102, var104);
									Pix3D.flatTriangle(var106, var107, var108, var103, var102, var104, var10.colour);
									Pix3D.setHClip(var103, var104, var105);
									Pix3D.flatTriangle(var106, var108, var109, var103, var104, var105, var10.colour);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ad.a(Lda;B)V")
	public static void locChangeSetOld(LocChange arg0) {
		int var1 = 0;
		if (arg0.layer == 0) {
			var1 = world.wallType(arg0.level, arg0.x, arg0.z);
		}
		int var2 = 0;
		if (arg0.layer == 1) {
			var1 = world.decorType(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 2) {
			var1 = world.sceneType(arg0.level, arg0.x, arg0.z);
		}
		int var3 = -1;
		if (arg0.layer == 3) {
			var1 = world.gdType(arg0.level, arg0.x, arg0.z);
		}
		int var4 = 0;
		if (var1 != 0) {
			var3 = var1 >> 14 & 0x7FFF;
			int var5 = world.typecode2(arg0.level, arg0.x, arg0.z, var1);
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
			chatText[var4] = chatText[var4 - 1];
			field2610[var4] = field2610[var4 - 1];
		}
		chatTransmitNum = transmitNum;
		field245[0] = arg0;
		chatHistoryLength++;
		field347[0] = arg1;
		chatText[0] = arg2;
		field2610[0] = arg3;
	}

	@ObfuscatedName("kb.a(IIIILvc;)V")
	public static void triggerSeqSound(int arg0, int arg1, int arg2, SeqType arg3) {
		if (waveCount >= 50 || ambientVolume == 0 || (arg3.sound == null || arg2 >= arg3.sound.length)) {
			return;
		}
		int var4 = arg3.sound[arg2];
		if (var4 == 0) {
			return;
		}
		int var5 = var4 >> 8;
		waveSoundIds[waveCount] = var5;
		int var6 = var4 >> 4 & 0x7;
		int var7 = var4 & 0xF;
		int var8 = (arg0 - 64) / 128;
		int var9 = (arg1 - 64) / 128;
		waveLoops[waveCount] = var6;
		waveDelay[waveCount] = 0;
		waveSounds[waveCount] = null;
		wameAmbient[waveCount] = var7 + (var9 << 16) + (var8 << 8);
		waveCount++;
	}

	@ObfuscatedName("he.a(B[Lf;I)V")
	public static void runHookLayer(IfType[] arg0, int arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			IfType var3 = arg0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.subcomponents != null) {
						runHookLayer(var3.subcomponents, arg1);
					}
					SubInterface var4 = (SubInterface) subinterfaces.find((long) var3.parentId);
					if (var4 != null) {
						runHookImmediate(var4.id, arg1);
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
						if (var6 == null || var6.subcomponents == null || var6.subcomponents.length <= var3.subId || var6.subcomponents[var3.subId] != var3) {
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
		for (SubInterface var0 = (SubInterface) subinterfaces.search(); var0 != null; var0 = (SubInterface) subinterfaces.findnext()) {
			int var1 = var0.id;
			if (IfType.openInterface(var1)) {
				boolean var2 = true;
				IfType[] var3 = IfType.list[var1];
				for (int var4 = 0; var4 < var3.length; var4++) {
					if (var3[var4] != null) {
						var2 = var3[var4].v3;
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
	public static void animateInterface(int arg0) {
		if (IfType.openInterface(arg0)) {
			animateLayer(-1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("g.c(I)V")
	public static void getPlayerPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
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
			arg0.spotanimId = in.g2_alt3();
			int var3 = in.g4_alt1();
			arg0.spotanimLastCycle = loopCycle + (var3 & 0xFFFF);
			arg0.spotanimHeight = var3 >> 16;
			if (arg0.spotanimId == 65535) {
				arg0.spotanimId = -1;
			}
			arg0.spotanimCycle = 0;
			arg0.spotanimFrame = 0;
			if (loopCycle < arg0.spotanimLastCycle) {
				arg0.spotanimFrame = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			int var4 = in.g1_alt2();
			int var5 = in.g1();
			arg0.addHitmark(loopCycle, var5, var4);
			arg0.combatCycle = loopCycle + 300;
			arg0.field2755 = in.g1_alt3();
			arg0.field2738 = in.g1_alt2();
		}
		if ((arg2 & 0x4) != 0) {
			int var6 = in.g2();
			int var7 = in.g1_alt1();
			if (var6 == 65535) {
				var6 = -1;
			}
			triggerPlayerAnim(var7, arg0, var6);
		}
		if ((arg2 & 0x10) != 0) {
			int var8 = in.g2_alt3();
			int var9 = in.g1();
			int var10 = in.g1_alt3();
			int var11 = in.pos;
			if (arg0.name != null && arg0.model != null) {
				boolean var12 = false;
				long var13 = arg0.name.toUserhash();
				if (var9 <= 1) {
					for (int var15 = 0; var15 < ignoreCount; var15++) {
						if (var13 == ignoreUserhash[var15]) {
							var12 = true;
							break;
						}
					}
				}
				if (!var12 && chatDisabled == 0) {
					tempP.pos = 0;
					in.gdata(var10, tempP.data);
					tempP.pos = 0;
					JagString var16 = PixFont.escape(JagString.unpack2(tempP).forceCapitalisationOfWords());
					arg0.chat = var16.trim();
					arg0.chatTimer = 150;
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
			arg0.exactStartX = in.g1_alt1();
			arg0.exactStartZ = in.g1_alt1();
			arg0.exactEndX = in.g1();
			arg0.exactEndZ = in.g1_alt1();
			arg0.exactMoveEnd = in.g2_alt3() + loopCycle;
			arg0.exactMoveStart = in.g2() + loopCycle;
			arg0.exactMoveFacing = in.g1();
			arg0.routeLength = 1;
			arg0.preanimRouteLength = 0;
		}
		if ((arg2 & 0x100) != 0) {
			int var17 = in.g1_alt3();
			int var18 = in.g1_alt1();
			arg0.addHitmark(loopCycle, var18, var17);
			arg0.combatCycle = loopCycle + 300;
			arg0.field2755 = in.g1();
			arg0.field2738 = in.g1_alt2();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.chat = in.gjstr();
			if (arg0.chat.charAt(0) == 126) {
				arg0.chat = arg0.chat.substring(1);
				addChat(arg0.chat, 2, arg0.name);
			} else if (arg0 == localPlayer) {
				addChat(arg0.chat, 2, arg0.name);
			}
			arg0.chatTimer = 150;
			arg0.field2749 = 0;
			arg0.field2753 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			arg0.targetId = in.g2_alt3();
			if (arg0.targetId == 65535) {
				arg0.targetId = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			int var19 = in.g1_alt3();
			byte[] var20 = new byte[var19];
			Packet var21 = new Packet(var20);
			in.gdata_alt1(var20, var19);
			playerAppearanceBuffer[arg1] = var21;
			arg0.setAppearance(var21);
		}
		if ((arg2 & 0x1) != 0) {
			arg0.field2741 = in.g2_alt3();
			arg0.field2697 = in.g2_alt1();
		}
	}

	@ObfuscatedName("va.a(ILf;)I")
	public static int getActive(IfType arg0) {
		ServerActive var1 = (ServerActive) serverActive.find(((long) arg0.parentId << 32) + ((long) arg0.subId));
		return var1 == null ? arg0.eventCode : var1.eventCode;
	}

	@ObfuscatedName("wf.a(ZILf;I)V")
	public static void addComponentOptions(int arg0, IfType arg1, int arg2) {
		if (arg1.buttonType == 1) {
			addMenuOption(0, arg1.buttonText, arg1.parentId, 26, AUTO_EMPTY, 0);
		}
		if (arg1.buttonType == 2 && !targetMode) {
			JagString var3 = getComponentTargetVerb(arg1);
			if (var3 != null) {
				addMenuOption(0, var3, arg1.parentId, 8, JagString.join(new JagString[] {AUTO_TAG_COLOUR5, arg1.targetBase}), -1);
			}
		}
		if (arg1.buttonType == 3) {
			addMenuOption(0, Text.CLOSE, arg1.parentId, 4, AUTO_EMPTY, 0);
		}
		if (arg1.buttonType == 4) {
			addMenuOption(0, arg1.buttonText, arg1.parentId, 40, AUTO_EMPTY, 0);
		}
		if (arg1.buttonType == 5) {
			addMenuOption(0, arg1.buttonText, arg1.parentId, 34, AUTO_EMPTY, 0);
		}
		if (arg1.buttonType == 6 && resumePauseCom == null) {
			addMenuOption(0, arg1.buttonText, arg1.parentId, 39, AUTO_EMPTY, -1);
		}
		if (arg1.type == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg1.height; var5++) {
				for (int var6 = 0; var6 < arg1.width; var6++) {
					int var7 = var6 * (arg1.marginX + 32);
					int var8 = (arg1.marginY + 32) * var5;
					if (var4 < 20) {
						var7 += arg1.invBackgroundX[var4];
						var8 += arg1.invBackgroundY[var4];
					}
					if (var7 <= arg2 && var8 <= arg0 && var7 + 32 > arg2 && arg0 < var8 + 32) {
						hoveredSlotParent = arg1;
						hoveredSlot = var4;
						if (arg1.linkObjType[var4] > 0) {
							ObjType var9 = ObjType.list(arg1.linkObjType[var4] - 1);
							if (useMode == 1 && ServerActive.isObjOpsEnabled(getActive(arg1))) {
								if (field1038 != arg1.parentId || field966 != var4) {
									addMenuOption(var9.id, Text.USE, arg1.parentId, 25, JagString.join(new JagString[] { field1148, field1132, var9.name}), var4);
								}
							} else if (!targetMode || !ServerActive.isObjOpsEnabled(getActive(arg1))) {
								JagString[] var10 = var9.iop;
								if (showOpIndex) {
									var10 = JagString.prependOpIndex(var10);
								}
								if (ServerActive.isObjOpsEnabled(getActive(arg1))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 19;
											} else {
												var12 = 35;
											}
											addMenuOption(var9.id, var10[var11], arg1.parentId, var12, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
										} else if (var11 == 4) {
											addMenuOption(var9.id, Text.DROP, arg1.parentId, 35, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
										}
									}
								}
								if (ServerActive.isObjUseEnabled(getActive(arg1))) {
									addMenuOption(var9.id, Text.USE, arg1.parentId, 21, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
								}
								if (ServerActive.isObjOpsEnabled(getActive(arg1)) && var10 != null) {
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
											addMenuOption(var9.id, var10[var13], arg1.parentId, var14, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
										}
									}
								}
								JagString[] var15 = arg1.iop;
								if (showOpIndex) {
									var15 = JagString.prependOpIndex(var15);
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
											addMenuOption(var9.id, var15[var16], arg1.parentId, var17, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
										}
									}
								}
								addMenuOption(var9.id, Text.EXAMINE, arg1.parentId, 1004, JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, var9.name}), var4);
							} else if ((targetMask & 0x10) == 16) {
								addMenuOption(var9.id, targetVerb, arg1.parentId, 43, JagString.join(new JagString[] {targetOp, field1132, var9.name}), var4);
							}
						}
					}
					var4++;
				}
			}
		}

		if (arg1.v3) {
			if (targetMode) {
				if (ServerActive.isUseTarget(getActive(arg1)) && (targetMask & 0x20) == 32) {
					addMenuOption(0, targetVerb, arg1.parentId, 42, JagString.join(new JagString[]{targetOp, TAG_ARROW, arg1.baseOpName}), arg1.subId);
				}
			} else {
				for (int var18 = 9; var18 >= 5; var18--) {
					JagString var19 = getIfTypeOpName(arg1, var18);
					if (var19 != null) {
						addMenuOption(var18 + 1, var19, arg1.parentId, 1005, arg1.baseOpName, arg1.subId);
					}
				}

				JagString var20 = getComponentTargetVerb(arg1);
				if (var20 != null) {
					addMenuOption(0, var20, arg1.parentId, 8, arg1.baseOpName, arg1.subId);
				}

				for (int var21 = 4; var21 >= 0; var21--) {
					JagString var22 = getIfTypeOpName(arg1, var21);
					if (var22 != null) {
						addMenuOption(var21 + 1, var22, arg1.parentId, 46, arg1.baseOpName, arg1.subId);
					}
				}

				if (ServerActive.pauseButton(getActive(arg1))) {
					addMenuOption(0, Text.CONTINUE, arg1.parentId, 39, AUTO_EMPTY, arg1.subId);
				}
			}
		}
	}

	@ObfuscatedName("ce.a(Z)V")
	public static void soundsDoQueue() {
		for (int var0 = 0; var0 < waveCount; var0++) {
			int var10002 = waveDelay[var0]--;
			if (waveDelay[var0] >= -10) {
				JagFX var2 = waveSounds[var0];
				if (var2 == null) {
					var2 = JagFX.load(jagFX, waveSoundIds[var0], 0);
					if (var2 == null) {
						continue;
					}
					waveDelay[var0] += var2.optimiseStart();
					waveSounds[var0] = var2;
				}
				if (waveDelay[var0] < 0) {
					int var3;
					if (wameAmbient[var0] == 0) {
						var3 = waveVolume;
					} else {
						int var4 = (wameAmbient[var0] & 0xFF) * 128;
						int var5 = wameAmbient[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - localPlayer.x;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = wameAmbient[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - localPlayer.z;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							waveDelay[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = ambientVolume * (var4 - var9) / var4;
					}
					if (var3 > 0) {
						Wave var10 = var2.toWave().decimate(soundDecimator);
						WaveStream var11 = WaveStream.newRatePercent(var10, var3);
						var11.setLoopCount(waveLoops[var0] - 1);
						soundMixer.playStream(var11);
					}
					waveDelay[var0] = -100;
				}
			} else {
				waveCount--;
				for (int var1 = var0; var1 < waveCount; var1++) {
					waveSoundIds[var1] = waveSoundIds[var1 + 1];
					waveSounds[var1] = waveSounds[var1 + 1];
					waveLoops[var1] = waveLoops[var1 + 1];
					waveDelay[var1] = waveDelay[var1 + 1];
					wameAmbient[var1] = wameAmbient[var1 + 1];
				}
				var0--;
			}
		}
		if (playingJingle && !MidiManager.isInitialised()) {
			if (midiVolume != 0 && nextMidiSong != -1) {
				MidiManager.play(songs, nextMidiSong, midiVolume, 0);
			}
			playingJingle = false;
		}
	}

	@ObfuscatedName("r.a(ZLf;)Z")
	public static boolean hide(IfType arg0) {
		if (qaOpTest) {
			if (getActive(arg0) != 0) {
				return false;
			}
			if (arg0.type == 0) {
				return false;
			}
		}
		return arg0.hide;
	}

	@ObfuscatedName("jd.d(II)V")
	public static void loginError(int arg0) {
		if (arg0 == -3) {
			TitleScreen.loginMes(Text.LOGINM3_A, Text.LOGINM3_B, Text.LOGINM3_C);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.LOGINM2_A, Text.LOGINM2_B, Text.LOGINM2_C);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.LOGINM1_A, Text.LOGINM1_B, Text.LOGINM1_C);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.LOGIN3_A, Text.LOGIN3_B, Text.LOGIN3_C);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.LOGIN4_A, Text.LOGIN4_B, Text.LOGIN4_C);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.LOGIN5_A, Text.LOGIN5_B, Text.LOGIN5_C);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.LOGIN6_A, Text.LOGIN6_B, Text.LOGIN6_C);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.LOGIN7_A, Text.LOGIN7_B, Text.LOGIN7_C);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.LOGIN8_A, Text.LOGIN8_B, Text.LOGIN8_C);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.LOGIN9_A, Text.LOGIN9_B, Text.LOGIN9_C);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.LOGIN10_A, Text.LOGIN10_B, Text.LOGIN10_C);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.LOGIN11_A, Text.LOGIN11_B, Text.LOGIN11_C);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.LOGIN12_A, Text.LOGIN12_B, Text.LOGIN12_C);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.LOGIN13_A, Text.LOGIN13_B, Text.LOGIN13_C);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.LOGIN14_A, Text.LOGIN14_B, Text.LOGIN14_C);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.LOGIN16_A, Text.LOGIN16_B, Text.LOGIN16_C);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.LOGIN17_A, Text.LOGIN17_B, Text.LOGIN17_C);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.LOGIN18_A, Text.LOGIN18_B, Text.LOGIN18_C);
		} else if (arg0 == 19) {
			TitleScreen.loginMes(Text.LOGIN19_A, Text.LOGIN19_B, Text.LOGIN19_C);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.LOGIN20_A, Text.LOGIN20_B, Text.LOGIN20_C);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.LOGIN22_A, Text.LOGIN22_B, Text.LOGIN22_C);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.LOGIN23_A, Text.LOGIN23_B, Text.LOGIN23_C);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.LOGIN24_A, Text.LOGIN24_B, Text.LOGIN24_C);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.LOGIN25_A, Text.LOGIN25_B, Text.LOGIN25_C);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.LOGIN26_A, Text.LOGIN26_B, Text.LOGIN26_C);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.LOGIN27_A, Text.LOGIN27_B, Text.LOGIN27_C);
		} else {
			TitleScreen.loginMes(Text.LOGINMIS_A, Text.LOGINMIS_B, Text.LOGINMIS_C);
		}
		setMainState(10);
	}

	@ObfuscatedName("wc.a(Z)V")
	public static void getPlayerPosLocal() {
		in.gBitStart();
		int var0 = in.gBit(1);
		if (var0 == 0) {
			return;
		}
		int var1 = in.gBit(2);
		if (var1 == 0) {
			entityUpdateIds[entityUpdateCount++] = 2047;
		} else if (var1 == 1) {
			int var2 = in.gBit(3);
			localPlayer.moveCode(var2, false);
			int var3 = in.gBit(1);
			if (var3 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = in.gBit(3);
			localPlayer.moveCode(var4, true);
			int var5 = in.gBit(3);
			localPlayer.moveCode(var5, true);
			int var6 = in.gBit(1);
			if (var6 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = in.gBit(7);
			int var8 = in.gBit(7);
			int var9 = in.gBit(1);
			if (var9 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
			minusedlevel = in.gBit(2);
			int var10 = in.gBit(1);
			localPlayer.teleport(var7, var10 == 1, var8);
		}
	}

	@ObfuscatedName("wc.a(IBII)Z")
	public static boolean interactWithLoc(int arg0, int arg1, int arg2) {
		int var3 = arg2 >> 14 & 0x7FFF;
		int var4 = world.typecode2(minusedlevel, arg1, arg0, arg2);
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
			int var10 = var7.forceapproach;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			tryMove(true, 0, localPlayer.routeZ[0], 0, var8, arg1, localPlayer.routeX[0], var10, arg0, var9, 2);
		} else {
			tryMove(true, var6, localPlayer.routeZ[0], var5 + 1, 0, arg1, localPlayer.routeX[0], 0, arg0, 0, 2);
		}
		crossX = ClientMouseListener.mouseClickX;
		crossY = ClientMouseListener.mouseClickY;
		crossCycle = 0;
		crossMode = 2;
		return true;
	}

	@ObfuscatedName("bf.a(II)V")
	public static void doAction(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = field2868[arg0];
		int var2 = field3620[arg0];
		int var3 = menuAction[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = field3135[arg0];
		if (var3 == 7) {
			out.p1Enc(252);
			out.p4_alt2(var2);
			out.p2(var1);
			out.p2_alt1(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 50) {
			ClientPlayer var5 = players[var4];
			if (var5 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var5.routeX[0], localPlayer.routeX[0], 0, var5.routeZ[0], 1, 2);
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				out.p1Enc(31);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 10) {
			ClientNpc var6 = npcs[var4];
			if (var6 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var6.routeX[0], localPlayer.routeX[0], 0, var6.routeZ[0], 1, 2);
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(185);
				out.p2(var4);
			}
		}
		if (var3 == 22) {
			ClientPlayer var7 = players[var4];
			if (var7 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var7.routeX[0], localPlayer.routeX[0], 0, var7.routeZ[0], 1, 2);
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(29);
				out.p4_alt2(field1002);
				out.p2_alt3(field3319);
				out.p2_alt2(var4);
			}
		}

		if (var3 == 8) {
			IfType var8 = IfType.get(var1, var2);
			if (var8 != null) {
				endTargetMode();
				enterTargetMode(var1, var2, ServerActive.targetMask(getActive(var8)));
				useMode = 0;

				targetVerb = getComponentTargetVerb(var8);
				if (targetVerb == null) {
					targetVerb = AUTO_NULL;
				}

				if (var8.v3) {
					targetOp = JagString.join(new JagString[] {var8.baseOpName, AUTO_TAG_COLOUR_WHITE});
				} else {
					targetOp = JagString.join(new JagString[] {AUTO_TAG_COLOUR5, var8.targetBase, AUTO_TAG_COLOUR_WHITE});
				}
			}

			return;
		}

		if (var3 == 15) {
			out.p1Enc(44);
			out.p2_alt1(var1);
			out.p4_alt2(var2);
			out.p2(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 36) {
			boolean var9 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var9) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			out.p1Enc(80);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p2_alt1(var4);
		}
		if (var3 == 43) {
			out.p1Enc(204);
			out.p4(field1002);
			out.p4_alt1(var2);
			out.p2_alt2(var4);
			out.p2_alt3(field3319);
			out.p2_alt3(var1);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 16) {
			ClientPlayer var11 = players[var4];
			if (var11 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var11.routeX[0], localPlayer.routeX[0], 0, var11.routeZ[0], 1, 2);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(138);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 45) {
			ClientPlayer var12 = players[var4];
			if (var12 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var12.routeX[0], localPlayer.routeX[0], 0, var12.routeZ[0], 1, 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(35);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 1002) {
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			out.p1Enc(32);
			out.p2_alt2(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 24) {
			ClientNpc var13 = npcs[var4];
			if (var13 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var13.routeX[0], localPlayer.routeX[0], 0, var13.routeZ[0], 1, 2);
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(37);
				out.p2_alt3(var4);
			}
		}
		if (var3 == 58) {
			ClientNpc var14 = npcs[var4];
			if (var14 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var14.routeX[0], localPlayer.routeX[0], 0, var14.routeZ[0], 1, 2);
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossMode = 2;
				out.p1Enc(238);
				out.p4_alt3(field1038);
				out.p2_alt3(field966);
				out.p2_alt3(var4);
				out.p2_alt3(field2978);
			}
		}
		if (var3 == 3) {
			world.updateMousePicking(minusedlevel, var1, var2);
		}
		if (var3 == 40) {
			out.p1Enc(218);
			out.p4(var2);
			IfType var15 = IfType.get(var2);
			if (var15.scripts != null && var15.scripts[0][0] == 5) {
				int var16 = var15.scripts[0][1];
				VarCache.var[var16] = 1 - VarCache.var[var16];
				clientVar(var16);
			}
		}
		if (var3 == 25) {
			out.p1Enc(231);
			out.p2_alt3(field2978);
			out.p4_alt3(field1038);
			out.p2_alt1(var4);
			out.p2_alt1(var1);
			out.p2(field966);
			out.p4_alt1(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 1001) {
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			out.p1Enc(43);
			out.p2_alt3(var4);
		}
		if (var3 == 41) {
			out.p1Enc(9);
			out.p2_alt2(var4);
			out.p4_alt2(var2);
			out.p2_alt3(var1);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 44) {
			ClientPlayer var17 = players[var4];
			if (var17 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var17.routeX[0], localPlayer.routeX[0], 0, var17.routeZ[0], 1, 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(10);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 21) {
			endTargetMode();
			IfType var18 = IfType.get(var2);
			field2978 = var4;
			field966 = var1;
			field1038 = var2;
			useMode = 1;
			componentUpdated(var18);
			field1148 = JagString.join(new JagString[] {AUTO_TAG_COLOUR_ff9040, ObjType.list(var4).name, AUTO_TAG_COLOUR_WHITE});
			if (field1148 == null) {
				field1148 = AUTO_NULL2;
			}
			return;
		}
		if (var3 == 4) {
			closeModal();
		}
		if (var3 == 38) {
			out.p1Enc(215);
			out.p2_alt1(var1);
			out.p4(var2);
			out.p2_alt3(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 13) {
			boolean var19 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var19) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossMode = 2;
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			out.p1Enc(120);
			out.p2_alt2(var4);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p2_alt2(var2 + mapBuildBaseZ);
		}
		if (var3 == 18) {
			out.p1Enc(241);
			out.p2(var4);
			out.p2_alt3(var1);
			out.p4_alt1(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 6) {
			ClientPlayer var21 = players[var4];
			if (var21 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var21.routeX[0], localPlayer.routeX[0], 0, var21.routeZ[0], 1, 2);
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				out.p1Enc(73);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 39 && resumePauseCom == null) {
			resumePauseButton(var1, var2);
			resumePauseCom = IfType.get(var1, var2);
			componentUpdated(resumePauseCom);
		}
		if (var3 == 1) {
			interactWithLoc(var2, var1, var4);
			out.p1Enc(174);
			out.p2_alt1(var4 >> 14 & 0x7FFF);
			out.p2_alt3(var1 + mapBuildBaseX);
			out.p2_alt2(mapBuildBaseZ + var2);
		}
		if (var3 == 1006) {
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossCycle = 0;
			ClientNpc var22 = npcs[var4];
			if (var22 != null) {
				NpcType var23 = var22.type;
				if (var23.multinpc != null) {
					var23 = var23.getMultiNpc();
				}
				if (var23 != null) {
					out.p1Enc(50);
					out.p2_alt3(var23.id);
				}
			}
		}
		if (var3 == 42) {
			out.p1Enc(96);
			out.p4(var2);
			out.p2_alt1(var1);
			out.p4_alt1(field1002);
			out.p2_alt2(field3319);
		}
		if (var3 == 19) {
			out.p1Enc(117);
			out.p2(var4);
			out.p2(var1);
			out.p4(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 49 && interactWithLoc(var2, var1, var4)) {
			out.p1Enc(75);
			out.p2_alt3(field2978);
			out.p2(var4 >> 14 & 0x7FFF);
			out.p2_alt3(field966);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p4(field1038);
		}
		if (var3 == 2 && interactWithLoc(var2, var1, var4)) {
			out.p1Enc(208);
			out.p2_alt2(var4 >> 14 & 0x7FFF);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p4_alt3(field1002);
			out.p2_alt3(mapBuildBaseX + var1);
			out.p2_alt3(field3319);
		}
		if (var3 == 1003) {
			interactWithLoc(var2, var1, var4);
			out.p1Enc(182);
			out.p2(mapBuildBaseX + var1);
			out.p2(mapBuildBaseZ + var2);
			out.p2_alt2(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 34) {
			out.p1Enc(218);
			out.p4(var2);
			IfType var24 = IfType.get(var2);
			if (var24.scripts != null && var24.scripts[0][0] == 5) {
				int var25 = var24.scripts[0][1];
				if (var24.scriptOperand[0] != VarCache.var[var25]) {
					VarCache.var[var25] = var24.scriptOperand[0];
					clientVar(var25);
				}
			}
		}
		if (var3 == 29) {
			ClientPlayer var26 = players[var4];
			if (var26 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var26.routeX[0], localPlayer.routeX[0], 0, var26.routeZ[0], 1, 2);
				crossMode = 2;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(81);
				out.p2_alt3(var4);
			}
		}
		if (var3 == 20) {
			boolean var27 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var27) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossCycle = 0;
			out.p1Enc(97);
			out.p2_alt3(field966);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p4_alt2(field1038);
			out.p2_alt3(field2978);
			out.p2(var4);
			out.p2_alt2(mapBuildBaseX + var1);
		}
		if (var3 == 26) {
			IfType var29 = IfType.get(var2);
			boolean var30 = true;
			if (var29.clientCode > 0) {
				var30 = clientButton(var29);
			}
			if (var30) {
				out.p1Enc(218);
				out.p4(var2);
			}
		}
		if (var3 == 46 || var3 == 1005) {
			ifButtonX(var4, var2, menuSubject[arg0], var1);
		}
		if (var3 == 48) {
			ClientPlayer var31 = players[var4];
			if (var31 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var31.routeX[0], localPlayer.routeX[0], 0, var31.routeZ[0], 1, 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				out.p1Enc(193);
				out.p2(var4);
			}
		}
		if (var3 == 51) {
			out.p1Enc(195);
			out.p2_alt2(var4);
			out.p4_alt2(var2);
			out.p2_alt3(var1);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 28) {
			ClientNpc var32 = npcs[var4];
			if (var32 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var32.routeX[0], localPlayer.routeX[0], 0, var32.routeZ[0], 1, 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				out.p1Enc(45);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 30) {
			out.p1Enc(130);
			out.p2(var1);
			out.p4_alt1(var2);
			out.p2_alt2(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 57) {
			boolean var33 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var33) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			out.p1Enc(250);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p2_alt2(var4);
			out.p2_alt2(mapBuildBaseZ + var2);
		}
		if (var3 == 11) {
			interactWithLoc(var2, var1, var4);
			out.p1Enc(144);
			out.p2_alt3(mapBuildBaseX + var1);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p2(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 14) {
			ClientNpc var35 = npcs[var4];
			if (var35 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var35.routeX[0], localPlayer.routeX[0], 0, var35.routeZ[0], 1, 2);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				out.p1Enc(6);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 23) {
			ClientPlayer var36 = players[var4];
			if (var36 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var36.routeX[0], localPlayer.routeX[0], 0, var36.routeZ[0], 1, 2);
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(158);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 1004) {
			IfType var37 = IfType.get(var2);
			if (var37 == null || var37.linkObjNumber[var1] < 100000) {
				out.p1Enc(43);
				out.p2_alt3(var4);
			} else {
				addChat(JagString.join(new JagString[] { JagString.parseInt(var37.linkObjNumber[var1]), field1667, ObjType.list(var4).name}), 0, AUTO_EMPTY);
			}
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 5) {
			ClientPlayer var38 = players[var4];
			if (var38 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var38.routeX[0], localPlayer.routeX[0], 0, var38.routeZ[0], 1, 2);
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				out.p1Enc(67);
				out.p4_alt3(field1038);
				out.p2_alt3(field966);
				out.p2_alt1(var4);
				out.p2(field2978);
			}
		}
		if (var3 == 31) {
			boolean var39 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var39) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossCycle = 0;
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			crossY = ClientMouseListener.mouseClickY;
			out.p1Enc(137);
			out.p2(mapBuildBaseX + var1);
			out.p2_alt1(var4);
			out.p2(mapBuildBaseZ + var2);
		}
		if (var3 == 35) {
			out.p1Enc(115);
			out.p4(var2);
			out.p2_alt1(var1);
			out.p2_alt2(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 33) {
			boolean var41 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var41) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			out.p1Enc(122);
			out.p2(var2 + mapBuildBaseZ);
			out.p2_alt3(var1 + mapBuildBaseX);
			out.p4_alt3(field1002);
			out.p2(field3319);
			out.p2_alt1(var4);
		}
		if (var3 == 47) {
			boolean var43 = tryMove(false, 0, localPlayer.routeZ[0], 0, 0, var1, localPlayer.routeX[0], 0, var2, 0, 2);
			if (!var43) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var1, localPlayer.routeX[0], 0, var2, 1, 2);
			}
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			out.p1Enc(112);
			out.p2(var2 + mapBuildBaseZ);
			out.p2(var4);
			out.p2(var1 + mapBuildBaseX);
		}
		if (var3 == 32) {
			interactWithLoc(var2, var1, var4);
			out.p1Enc(170);
			out.p2_alt1(var2 + mapBuildBaseZ);
			out.p2_alt3(var4 >> 14 & 0x7FFF);
			out.p2_alt3(var1 + mapBuildBaseX);
		}
		if (var3 == 12) {
			ClientNpc var45 = npcs[var4];
			if (var45 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var45.routeX[0], localPlayer.routeX[0], 0, var45.routeZ[0], 1, 2);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(253);
				out.p2(field3319);
				out.p4_alt3(field1002);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 17) {
			out.p1Enc(214);
			out.p2_alt1(var1);
			out.p4(var2);
			out.p2(var4);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			field729 = var1;
		}
		if (var3 == 9) {
			ClientNpc var46 = npcs[var4];
			if (var46 != null) {
				tryMove(false, 0, localPlayer.routeZ[0], 0, 1, var46.routeX[0], localPlayer.routeX[0], 0, var46.routeZ[0], 1, 2);
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				out.p1Enc(149);
				out.p2(var4);
			}
		}
		if (var3 == 37) {
			interactWithLoc(var2, var1, var4);
			out.p1Enc(229);
			out.p2(var2 + mapBuildBaseZ);
			out.p2(mapBuildBaseX + var1);
			out.p2(var4 >> 14 & 0x7FFF);
		}
		if (useMode != 0) {
			useMode = 0;
			componentUpdated(IfType.get(field1038));
		}
		if (targetMode) {
			endTargetMode();
		}
		if (selectedCom != null && selectedCycle == 0) {
			componentUpdated(selectedCom);
		}
	}

	@ObfuscatedName("da.a(IJ)V")
	public static void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (ignoreCount >= 100) {
			addChat(Text.IGNORELISTFULL, 0, AUTO_EMPTY);
			return;
		}
		JagString var2 = JString.toRawUsername(arg0).toScreenName();
		for (int var3 = 0; var3 < ignoreCount; var3++) {
			if (ignoreUserhash[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.IGNORELISTDUPE}), 0, AUTO_EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < friendCount; var4++) {
			if (field694[var4] == arg0) {
				addChat(JagString.join(new JagString[] { Text.field95, var2, Text.REMOVEFRIEND2}), 0, AUTO_EMPTY);
				return;
			}
		}
		if (var2.strEquals(localPlayer.name)) {
			addChat(Text.IGNORECANTADDSELF, 0, AUTO_EMPTY);
			return;
		}

		ignoreUserhash[ignoreCount] = arg0;
		ignoreUsername[ignoreCount++] = JString.toRawUsername(arg0);

		friendTransmitNum = transmitNum;

		// IGNORELIST_ADD
		out.p1Enc(38);
		out.p8(arg0);
	}

	@ObfuscatedName("sc.e(I)V")
	public static void loginDone() {
		prevMouseClickTime = 0L;
		focus = true;
		mouseTrackedDelta = 0;
		focusIn = true;
		mouseTracking.length = 0;
		ReflectionChecker.method650();
		ptype1 = -1;
		menuNumEntries = 0;
		ptype2 = -1;
		timeoutTimer = 0;
		logoutTimer = 0;
		hintType = 0;
		out.pos = 0;
		isMenuOpen = false;
		rebootTimer = 0;
		in.pos = 0;
		ptype0 = -1;
		ptype = -1;
		ClientMouseListener.setIdleTimer(0);
		for (int var0 = 0; var0 < 100; var0++) {
			chatText[var0] = null;
		}
		macroCameraZ = (int) (Math.random() * 110.0D) - 55;
		npcCount = 0;
		playerCount = 0;
		minimapFlagX = 0;
		macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
		macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
		macroCameraX = (int) (Math.random() * 100.0D) - 50;
		minimapLevel = -1;
		waveCount = 0;
		useMode = 0;
		orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		minimapFlagZ = 0;
		minimapState = 0;
		macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
		targetMode = false;
		chatHistoryLength = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			players[var1] = null;
			playerAppearanceBuffer[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			npcs[var2] = null;
		}
		localPlayer = players[2047] = new ClientPlayer();
		projectiles.clear();
		spotanims.clear();
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					groundObj[var3][var4][var5] = null;
				}
			}
		}
		locChanges = new LinkList();
		friendCount = 0;
		friendServerStatus = 0;
		for (int var6 = 0; var6 < VarpType.numDefinitions; var6++) {
			VarpType var7 = VarpType.list(var6);
			if (var7 != null && var7.clientcode == 0) {
				VarCache.varServ[var6] = 0;
				VarCache.var[var6] = 0;
			}
		}
		for (int var8 = 0; var8 < field1831.length; var8++) {
			field1831[var8] = -1;
		}
		if (toplevelinterface != -1) {
			IfType.closeInterface(toplevelinterface);
		}
		for (SubInterface var9 = (SubInterface) subinterfaces.search(); var9 != null; var9 = (SubInterface) subinterfaces.findnext()) {
			closeSubInterface(true, var9);
		}
		toplevelinterface = -1;
		subinterfaces = new HashTable(8);
		resumePauseCom = null;
		menuNumEntries = 0;
		isMenuOpen = false;
		idkDesign.setAppearance(new int[5], -1, null, false);
		for (int var10 = 0; var10 < 8; var10++) {
			playerOp[var10] = null;
			playerOpPriority[var10] = false;
		}
		ClientInvCache.deleteAll();
		js5Loading = true;
		for (int var11 = 0; var11 < 100; var11++) {
			componentDirtyArea[var11] = true;
		}
		chatDisplayName = null;
		friendChatCount = 0;
		friendChatList = null;
	}

	@ObfuscatedName("sc.a(IIIIIIII)V")
	public static void loopInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (IfType.openInterface(arg0)) {
			loopLayer(IfType.list[arg0], arg6, arg1, arg2, arg5, arg4, arg3, -1);
		}
	}

	@ObfuscatedName("b.a(I)V")
	public static void getPlayerPosNewVis() {
		while (true) {
			if (in.bitsLeft(psize) >= 11) {
				int var0 = in.gBit(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (players[var0] == null) {
						players[var0] = new ClientPlayer();
						if (playerAppearanceBuffer[var0] != null) {
							players[var0].setAppearance(playerAppearanceBuffer[var0]);
						}
						var1 = true;
					}
					playerIds[playerCount++] = var0;
					ClientPlayer var2 = players[var0];
					var2.cycle = loopCycle;
					int var3 = in.gBit(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					int var4 = in.gBit(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.dstYaw = var2.yaw = var5;
					}
					int var6 = in.gBit(1);
					int var7 = in.gBit(1);
					if (var7 == 1) {
						entityUpdateIds[entityUpdateCount++] = var0;
					}
					var2.teleport(localPlayer.routeZ[0] + var4, var6 == 1, localPlayer.routeX[0] + var3);
					continue;
				}
			}
			in.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("qf.a(ILec;)Z")
	public static boolean isFriend(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < friendCount; var1++) {
			if (arg0.equalsIgnoreCase(field239[var1])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("ia.a(ZLqd;)V")
	public static void entityFace(ClientEntity arg0) {
		if (arg0.turnspeed == 0) {
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
			int var8 = arg0.x - (arg0.field2741 - mapBuildBaseX - mapBuildBaseX) * 64;
			int var9 = arg0.z - (arg0.field2697 - mapBuildBaseZ - mapBuildBaseZ) * 64;
			if (var8 != 0 || var9 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
			}
			arg0.field2741 = 0;
			arg0.field2697 = 0;
		}
		int var10 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var10 == 0) {
			arg0.field2752 = 0;
			return;
		}
		arg0.field2752++;
		if (var10 <= 1024) {
			arg0.yaw += arg0.turnspeed;
			boolean var11 = true;
			if (arg0.turnspeed > var10 || 2048 - arg0.turnspeed < var10) {
				var11 = false;
				arg0.yaw = arg0.dstYaw;
			}
			if (arg0.readyanim == arg0.secondarySeqId && (arg0.field2752 > 25 || var11)) {
				if (arg0.turnrightanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnrightanim;
				}
			}
		} else {
			arg0.yaw -= arg0.turnspeed;
			boolean var12 = true;
			if (arg0.turnspeed > var10 || var10 > 2048 - arg0.turnspeed) {
				arg0.yaw = arg0.dstYaw;
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
		arg0.yaw &= 0x7FF;
	}

	@ObfuscatedName("ec.a(ILo;III)V")
	public static void addNpcOptions(int arg0, NpcType arg1, int arg2, int arg3) {
		if (menuNumEntries >= 400) {
			return;
		}
		if (arg1.multinpc != null) {
			arg1 = arg1.getMultiNpc();
		}
		if (arg1 == null || !arg1.active) {
			return;
		}
		JagString var4 = arg1.name;
		if (arg1.vislevel != 0) {
			var4 = JagString.join(new JagString[] { var4, combatColourCode(arg1.vislevel, localPlayer.combatLevel), field954, Text.LEVEL, JagString.parseInt(arg1.vislevel), field403 });
		}
		if (useMode == 1) {
			addMenuOption(arg2, Text.USE, arg3, 58, JagString.join(new JagString[] { field1148, field1755, var4 }), arg0);
		} else if (targetMode) {
			if ((targetMask & 0x2) == 2) {
				addMenuOption(arg2, targetVerb, arg3, 12, JagString.join(new JagString[] {targetOp, field1755, var4 }), arg0);
			}
		} else {
			JagString[] var5 = arg1.op;
			if (showOpIndex) {
				var5 = JagString.prependOpIndex(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].equalsIgnoreCase(Text.ATTACK)) {
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
						addMenuOption(arg2, var5[var6], arg3, var7, JagString.join(new JagString[] {AUTO_TAG_COLOUR9, var4 }), arg0);
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].equalsIgnoreCase(Text.ATTACK)) {
						short var9 = 0;
						if (arg1.vislevel > localPlayer.combatLevel) {
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
						addMenuOption(arg2, var5[var8], arg3, var10, JagString.join(new JagString[] {AUTO_TAG_COLOUR9, var4 }), arg0);
					}
				}
			}
			addMenuOption(arg2, Text.EXAMINE, arg3, 1006, JagString.join(new JagString[] {AUTO_TAG_COLOUR9, var4 }), arg0);
		}
	}

	@ObfuscatedName("ec.a(BIIIII)V")
	public static void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		scrollbar[0].plotSprite(arg2, arg1);
		scrollbar[1].plotSprite(arg2, arg1 + arg4 - 16);
		Pix2D.fillRect(arg2, arg1 + 16, 16, arg4 - 32, SCROLLBAR_TRACK);
		int var5 = arg4 * (arg4 - 32) / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = arg0 * (arg4 - var5 - 32) / (arg3 - arg4);
		Pix2D.fillRect(arg2, var6 + arg1 + 16, 16, var5, SCROLLBAR_GRIP_FOREGROUND);
		Pix2D.vline(arg2, arg1 + var6 + 16, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg2 + 1, var6 + 16 + arg1, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg2, arg1 + var6 + 16, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg2, var6 + arg1 + 17, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg2 + 15, arg1 + 16 + var6, var5, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.vline(arg2 + 14, arg1 - -var6 + 17, var5 - 1, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg2, arg1 + var6 + var5 + 15, 16, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg2 + 1, var5 + 14 + arg1 - -var6, 15, SCROLLBAR_GRIP_LOWLIGHT);
	}

	@ObfuscatedName("ec.a(IIIIB)V")
	public static void blitArea(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (arg2 < componentDrawX[var4] + componentDrawWidth[var4] && componentDrawX[var4] < arg2 + arg0 && componentDrawY[var4] + componentDrawHeight[var4] > arg1 && componentDrawY[var4] < arg3 + arg1) {
				componentBlitArea[var4] = true;
			}
		}
	}

	@ObfuscatedName("ec.b(B)V")
	public static void getNpcPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
			ClientNpc var2 = npcs[var1];
			int var3 = in.g1();
			if ((var3 & 0x1) != 0) {
				var2.type = NpcType.list(in.g2_alt1());
				var2.walkanim_r = var2.type.walkanim_r;
				var2.size = var2.type.size;
				var2.turnrightanim = var2.type.turnrightanim;
				var2.walkanim_l = var2.type.walkanim_l;
				var2.readyanim = var2.type.readyanim;
				var2.walkanim = var2.type.walkanim;
				var2.turnspeed = var2.type.turnspeed;
				var2.walkanim_b = var2.type.walkanim_b;
				var2.turnleftanim = var2.type.turnleftanim;
			}
			if ((var3 & 0x8) != 0) {
				var2.spotanimId = in.g2_alt3();
				int var4 = in.g4_alt3();
				var2.spotanimLastCycle = (var4 & 0xFFFF) + loopCycle;
				if (var2.spotanimId == 65535) {
					var2.spotanimId = -1;
				}
				var2.spotanimHeight = var4 >> 16;
				var2.spotanimCycle = 0;
				var2.spotanimFrame = 0;
				if (var2.spotanimLastCycle > loopCycle) {
					var2.spotanimFrame = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				int var5 = in.g1_alt2();
				int var6 = in.g1_alt2();
				var2.addHitmark(loopCycle, var6, var5);
				var2.combatCycle = loopCycle + 300;
				var2.field2755 = in.g1_alt1();
				var2.field2738 = in.g1_alt3();
			}
			if ((var3 & 0x40) != 0) {
				var2.chat = in.gjstr();
				var2.chatTimer = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.targetId = in.g2_alt1();
				if (var2.targetId == 65535) {
					var2.targetId = -1;
				}
			}
			if ((var3 & 0x80) != 0) {
				int var7 = in.g1();
				int var8 = in.g1_alt1();
				var2.addHitmark(loopCycle, var8, var7);
				var2.combatCycle = loopCycle + 300;
				var2.field2755 = in.g1_alt1();
				var2.field2738 = in.g1();
			}
			if ((var3 & 0x10) != 0) {
				int var9 = in.g2_alt3();
				int var10 = in.g1_alt1();
				if (var9 == 65535) {
					var9 = -1;
				}
				if (var9 == var2.primarySeqId && var9 != -1) {
					int var11 = SeqType.list(var9).duplicatebehavior;
					if (var11 == 1) {
						var2.primarySeqCycle = 0;
						var2.primarySeqLoop = 0;
						var2.primarySeqDelay = var10;
						var2.primarySeqFrame = 0;
					}
					if (var11 == 2) {
						var2.primarySeqLoop = 0;
					}
				} else if (var9 == -1 || var2.primarySeqId == -1 || SeqType.list(var9).priority >= SeqType.list(var2.primarySeqId).priority) {
					var2.preanimRouteLength = var2.routeLength;
					var2.primarySeqLoop = 0;
					var2.primarySeqId = var9;
					var2.primarySeqFrame = 0;
					var2.primarySeqDelay = var10;
					var2.primarySeqCycle = 0;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.field2741 = in.g2_alt1();
				var2.field2697 = in.g2_alt3();
			}
		}
	}

	@ObfuscatedName("ec.a(BI)Z")
	public static boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = menuAction[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1005;
	}

	@ObfuscatedName("c.a(ZB)V")
	public static void addPlayers(boolean arg0) {
		if (localPlayer.x >> 7 == minimapFlagX && localPlayer.z >> 7 == minimapFlagZ) {
			minimapFlagX = 0;
		}
		int var1 = playerCount;
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
				var3 = playerIds[var2] << 14;
				var4 = players[playerIds[var2]];
			}
			if (var4 != null && var4.ready()) {
				var4.lowMem = false;
				if ((lowMem && playerCount > 50 || playerCount > 200) && !arg0 && var4.secondarySeqId == var4.readyanim) {
					var4.lowMem = true;
				}
				int var5 = var4.z >> 7;
				int var6 = var4.x >> 7;
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					if (var4.locModel == null || var4.locStartCycle > loopCycle || loopCycle >= var4.locEndCycle) {
						if ((var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
							if (sceneCycle == tileLastOccupiedCycle[var6][var5]) {
								continue;
							}
							tileLastOccupiedCycle[var6][var5] = sceneCycle;
						}
						var4.y = getAvH(minusedlevel, var4.x, var4.z);
						world.addDynamic(minusedlevel, var4.x, var4.z, var4.y, 60, var4, var4.yaw, var3, var4.needsForwardDrawPadding);
					} else {
						var4.lowMem = false;
						var4.y = getAvH(minusedlevel, var4.x, var4.z);
						world.addDynamic(minusedlevel, var4.x, var4.z, var4.y, var4, var4.yaw, var3, var4.field1632, var4.field1645, var4.field1642, var4.field1636);
					}
				}
			}
		}
	}

	@ObfuscatedName("ie.a(IILka;BI)V")
	public static void addPlayerOptions(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (localPlayer == arg2 || menuNumEntries >= 400) {
			return;
		}
		JagString var4;
		if (arg2.skillLevel == 0) {
			var4 = JagString.join(new JagString[] { arg2.name, combatColourCode(arg2.combatLevel, localPlayer.combatLevel), field954, Text.LEVEL, JagString.parseInt(arg2.combatLevel), field403 });
		} else {
			var4 = JagString.join(new JagString[] { arg2.name, field954, Text.SKILL, JagString.parseInt(arg2.skillLevel), field403 });
		}
		if (useMode == 1) {
			addMenuOption(arg0, Text.USE, arg1, 5, JagString.join(new JagString[] { field1148, field3127, var4 }), arg3);
		} else if (targetMode) {
			if ((targetMask & 0x8) == 8) {
				addMenuOption(arg0, targetVerb, arg1, 22, JagString.join(new JagString[] {targetOp, field3127, var4 }), arg3);
			}
		} else {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (playerOp[var5] != null) {
					short var6 = 0;
					if (playerOp[var5].equalsIgnoreCase(Text.ATTACK)) {
						if (localPlayer.combatLevel < arg2.combatLevel) {
							var6 = 2000;
						}
						if (localPlayer.team != 0 && arg2.team != 0) {
							if (arg2.team == localPlayer.team) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (playerOpPriority[var5]) {
						var6 = 2000;
					}
					int var7 = MENUACTION_PLAYER[var5] + var6;
					addMenuOption(arg0, playerOp[var5], arg1, var7, JagString.join(new JagString[] {AUTO_TAG_COLOUR_WHITE, var4 }), arg3);
				}
			}
		}
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			if (menuAction[var8] == 3) {
				menuSubject[var8] = JagString.join(new JagString[] {AUTO_TAG_COLOUR_WHITE, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("ie.a(BLf;)Lec;")
	public static JagString getComponentTargetVerb(IfType arg0) {
		if (ServerActive.targetMask(getActive(arg0)) == 0) {
			return null;
		} else if (arg0.targetVerb == null || arg0.targetVerb.trim().length() == 0) {
			return qaOpTest ? AUTO_HIDDEN_USE : null;
		} else {
			return arg0.targetVerb;
		}
	}

	@ObfuscatedName("oe.b(II)V")
	public static void playSongs(int arg0) {
		if (arg0 == -1 && !playingJingle) {
			MidiManager.stop();
		} else if (arg0 != -1 && nextMidiSong != arg0 && midiVolume != 0 && !playingJingle) {
			MidiManager.swapSongs(songs, midiVolume, 0, arg0);
		}
		nextMidiSong = arg0;
	}

	@ObfuscatedName("qd.g(I)V")
	public static void friendsChatLeaveChat() {
		// CLAN_JOINCHAT_LEAVECHAT
		out.p1Enc(23);
		out.p8((long) 0);
	}

	@ObfuscatedName("cb.a(IIIII)V")
	public static void otherOverlays(int arg0, int arg1, int arg2, int arg3) {
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossX - 8, crossY + -8);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossX - 8, crossY + -8);
		}

		getSpecialArea();

		if (showFps) {
			int var4 = arg2 + 507;
			int var5 = arg0 + 20;
			int var6 = 16776960;
			p12.rightString(JagString.join(new JagString[]{AUTO_FPS, JagString.parseInt(fps)}), var4, var5, 16776960, -1);
			Runtime var7 = Runtime.getRuntime();
			int var9 = var5 + 15;
			int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
			if (var8 > 32768 && lowMem) {
				var6 = 16711680;
			}
			if (var8 > 65536 && !lowMem) {
				var6 = 16711680;
			}
			p12.rightString(JagString.join(new JagString[]{AUTO_MEM, JagString.parseInt(var8), AUTO_MEM_KB}), var4, var9, var6, -1);
			var5 = var9 + 15;
		}
	}

	@ObfuscatedName("f.a(JI)V")
	public static void delFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < friendCount; var2++) {
			if (field694[var2] == arg0) {
				friendCount--;
				for (int var3 = var2; var3 < friendCount; var3++) {
					field239[var3] = field239[var3 + 1];
					field2094[var3] = field2094[var3 + 1];
					field694[var3] = field694[var3 + 1];
					field103[var3] = field103[var3 + 1];
				}
				friendTransmitNum = transmitNum;

				// FRIENDLIST_DEL
				out.p1Enc(135);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("c.a(ILf;)Lf;")
	public static IfType serverDraggable(IfType arg0) {
		int var1 = ServerActive.serverDraggable(getActive(arg0));
		if (var1 == 0) {
			return null;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			arg0 = IfType.get(arg0.layerId);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@ObfuscatedName("kb.a(Lf;II)Lec;")
	public static JagString getIfTypeOpName(IfType arg0, int arg1) {
		if (!ServerActive.hasOp(getActive(arg0), arg1) && arg0.onop == null) {
			return null;
		} else if (arg0.opNames == null || arg0.opNames.length <= arg1 || arg0.opNames[arg1] == null || arg0.opNames[arg1].trim().length() == 0) {
			return qaOpTest ? JagString.join(new JagString[] {AUTO_HIDDEN, JagString.parseInt(arg1) }) : null;
		} else {
			return arg0.opNames[arg1];
		}
	}

	@ObfuscatedName("j.a(IIIII)V")
	public static void dirtyArea(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (componentDrawX[var4] + componentDrawWidth[var4] > arg0 && arg2 + arg0 > componentDrawX[var4] && componentDrawY[var4] + componentDrawHeight[var4] > arg1 && componentDrawY[var4] < arg1 + arg3) {
				componentDirtyArea[var4] = true;
			}
		}
	}

	@ObfuscatedName("j.a(IZ)V")
	public static void addNpcs(boolean arg0) {
		for (int var1 = 0; var1 < npcCount; var1++) {
			ClientNpc var2 = npcs[npcIds[var1]];
			int var3 = (npcIds[var1] << 14) + 536870912;
			if (var2 != null && var2.ready() && arg0 == var2.type.alwaysontop && var2.type.isMultiNpcVisible()) {
				int var4 = var2.x >> 7;
				int var5 = var2.z >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (var2.size == 1 && (var2.x & 0x7F) == 64 && (var2.z & 0x7F) == 64) {
						if (tileLastOccupiedCycle[var4][var5] == sceneCycle) {
							continue;
						}
						tileLastOccupiedCycle[var4][var5] = sceneCycle;
					}
					if (!var2.type.active) {
						var3 += Integer.MIN_VALUE;
					}
					world.addDynamic(minusedlevel, var2.x, var2.z, getAvH(minusedlevel, var2.size * 64 + var2.x - 64, (var2.size - 1) * 64 + var2.z), (var2.size - 1) * 64 + 60, var2, var2.yaw, var3, var2.needsForwardDrawPadding);
				}
			}
		}
	}

	@ObfuscatedName("ac.a(ZB)V")
	public static void rebuildPacket(boolean arg0) {
		regionmode = arg0;
		if (!regionmode) {
			int var1 = in.g1_alt2();
			int var2 = in.g2_alt2();
			int var3 = in.g2();
			int var4 = (psize - in.pos) / 16;
			field1454 = new int[var4][4];
			for (int var5 = 0; var5 < var4; var5++) {
				for (int var6 = 0; var6 < 4; var6++) {
					field1454[var5][var6] = in.g4_alt2();
				}
			}
			int var7 = in.g2_alt1();
			boolean var8 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && (var2 / 8) == 48) {
				var8 = true;
			}
			int var9 = in.g2();
			field1747 = new int[var4];
			mapBuildGroundData = new byte[var4][];
			mapBuildLocationData = new byte[var4][];
			mapBuildIndex = new int[var4];
			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var8 = true;
			}
			field2841 = new int[var4];
			int var10 = 0;
			for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
				for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
					int var13 = var12 + (var11 << 8);
					if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
						mapBuildIndex[var10] = var13;
						field2841[var10] = maps.getGroupId(JagString.join(new JagString[] { field767, JagString.parseInt(var11), field361, JagString.parseInt(var12) }));
						field1747[var10] = maps.getGroupId(JagString.join(new JagString[] { PcmPlayer.field2669, JagString.parseInt(var11), field361, JagString.parseInt(var12) }));
						var10++;
					}
				}
			}
			startRebuild(var1, var9, var2, var3, var7);
			return;
		}
		int var14 = in.g2();
		int var15 = in.g1_alt1();
		int var16 = in.g2();
		int var17 = in.g2_alt2();
		in.gBitStart();
		for (int var18 = 0; var18 < 4; var18++) {
			for (int var19 = 0; var19 < 13; var19++) {
				for (int var20 = 0; var20 < 13; var20++) {
					int var21 = in.gBit(1);
					if (var21 == 1) {
						field641[var18][var19][var20] = in.gBit(26);
					} else {
						field641[var18][var19][var20] = -1;
					}
				}
			}
		}
		in.gBitEnd();
		int var22 = (psize - in.pos) / 16;
		field1454 = new int[var22][4];
		for (int var23 = 0; var23 < var22; var23++) {
			for (int var24 = 0; var24 < 4; var24++) {
				field1454[var23][var24] = in.g4_alt3();
			}
		}
		int var25 = in.g2_alt1();
		field1747 = new int[var22];
		mapBuildLocationData = new byte[var22][];
		mapBuildIndex = new int[var22];
		field2841 = new int[var22];
		mapBuildGroundData = new byte[var22][];
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
							if (var33 == mapBuildIndex[var34]) {
								var33 = -1;
								break;
							}
						}
						if (var33 != -1) {
							mapBuildIndex[var26] = var33;
							int var35 = var33 & 0xFF;
							int var36 = var33 >> 8 & 0xFF;
							field2841[var26] = maps.getGroupId(JagString.join(new JagString[] { field767, JagString.parseInt(var36), field361, JagString.parseInt(var35) }));
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
	public static void playSynth(int arg0, int arg1, int arg2) {
		if (waveVolume == 0 || arg2 == 0 || waveCount >= 50) {
			return;
		}
		waveSoundIds[waveCount] = arg0;
		waveLoops[waveCount] = arg2;
		waveDelay[waveCount] = arg1;
		waveSounds[waveCount] = null;
		wameAmbient[waveCount] = 0;
		waveCount++;
	}

	@ObfuscatedName("hd.c(B)V")
	public static void reconnectDone() {
		isMenuOpen = false;
		menuNumEntries = 0;
		minimapState = 0;
		ptype = -1;
		psize = 0;
		out.pos = 0;
		ptype2 = -1;
		timeoutTimer = 0;
		ptype0 = -1;
		logoutTimer = 0;
		ptype1 = -1;
		in.pos = 0;
		minimapFlagX = 0;
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
			componentDirtyArea[var2] = true;
		}
	}

	@ObfuscatedName("ld.a(IIII)Lue;")
	public static SubInterface openSubInterface(int arg0, int arg1, int arg2) {
		SubInterface sub = new SubInterface();
		sub.type = arg0;
		sub.id = arg1;
		subinterfaces.put(arg2, sub);

		ifAnimReset(arg1);
		ScriptRunner.executeOnLoad(arg1);

		IfType var4 = IfType.get(arg2);
		if (var4 != null) {
			componentUpdated(var4);
		}

		if (resumePauseCom != null) {
			componentUpdated(resumePauseCom);
			resumePauseCom = null;
		}

		isMenuOpen = false;
		menuNumEntries = 0;
		dirtyArea(menuWidth, menuY, menuX, menuHeight);

		if (toplevelinterface != -1) {
			runHookImmediate(toplevelinterface, 1);
		}

		return sub;
	}

	@ObfuscatedName("ld.a(BIII)V")
	public static void enterTargetMode(int arg0, int arg1, int arg2) {
		IfType var3 = IfType.get(arg0, arg1);
		if (var3 != null && var3.ontargetenter != null) {
			HookReq var4 = new HookReq();
			var4.component = var3;
			var4.onop = var3.ontargetenter;
			ScriptRunner.executeScript(var4);
		}
		field3319 = arg0;
		targetMask = arg2;
		field1002 = arg1;
		targetMode = true;
		componentUpdated(var3);
	}

	@ObfuscatedName("jc.h(I)V")
	public static void lostCon() {
		if (rebootTimer > 0) {
			logout();
		} else {
			setMainState(40);
			prevStream = stream;
			stream = null;
		}
	}

	@ObfuscatedName("vf.a(Lec;I)V")
	public static void doCheat(JagString arg0) {
		if (staffmodlevel >= 2) {
			if (arg0.equalsIgnoreCase(AUTO_GC)) {
				System.gc();
			}
			if (arg0.equalsIgnoreCase(AUTO_CLIENTDROP)) {
				lostCon();
			}
			if (arg0.equalsIgnoreCase(AUTO_FPSON)) {
				showFps = true;
			}
			if (arg0.equalsIgnoreCase(AUTO_FPSOFF)) {
				showFps = false;
			}
			if (arg0.equalsIgnoreCase(AUTO_NOCLIP)) {
				for (int var1 = 0; var1 < 4; var1++) {
					for (int var2 = 1; var2 < 103; var2++) {
						for (int var3 = 1; var3 < 103; var3++) {
							collision[var1].flags[var2][var3] = 0;
						}
					}
				}
			}
			if (arg0.equalsIgnoreCase(AUTO_ERRORTEST) && modewhere == 2) {
				throw new RuntimeException();
			}
			if (arg0.startsWith(AUTO_RECT_DEBUG)) {
				componentRectDebug = arg0.substring(12).trim().checkedParseInt();
				addChat(JagString.join(new JagString[] {AUTO_SET_RECT_DEBUG, JagString.parseInt(componentRectDebug) }), 0, null);
			}
			if (arg0.equalsIgnoreCase(AUTO_QA_OP_TEST)) {
				qaOpTest = true;
			}
		}

		// CLIENT_CHEAT
		out.p1Enc(89);
		out.p1(arg0.length() - 1);
		out.pjstr(arg0.substring(2));
	}

	@ObfuscatedName("vf.f(I)V")
	public static void sortMinimenu() {
		boolean var0 = false;
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < menuNumEntries - 1; var1++) {
				if (menuAction[var1] < 1000 && menuAction[var1 + 1] > 1000) {
					JagString var2 = menuSubject[var1];
					var0 = false;
					menuSubject[var1] = menuSubject[var1 + 1];
					menuSubject[var1 + 1] = var2;
					JagString var3 = menuVerb[var1];
					menuVerb[var1] = menuVerb[var1 + 1];
					menuVerb[var1 + 1] = var3;
					int var4 = menuAction[var1];
					menuAction[var1] = menuAction[var1 + 1];
					menuAction[var1 + 1] = var4;
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
	public static void clientComponent(IfType arg0) {
		int var1 = arg0.clientCode;
		if (var1 == 324) {
			if (idkDesignButton1 == -1) {
				idkDesignButton2 = arg0.graphic2;
				idkDesignButton1 = arg0.graphic;
			}
			if (idkDesign.gender) {
				arg0.graphic = idkDesignButton1;
			} else {
				arg0.graphic = idkDesignButton2;
			}
		} else if (var1 == 325) {
			if (idkDesignButton1 == -1) {
				idkDesignButton1 = arg0.graphic;
				idkDesignButton2 = arg0.graphic2;
			}
			if (idkDesign.gender) {
				arg0.graphic = idkDesignButton2;
			} else {
				arg0.graphic = idkDesignButton1;
			}
		} else if (var1 == 327) {
			arg0.modelXAn = 150;
			arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.model1Type = 5;
			arg0.model1Id = 0;
		} else if (var1 == 328) {
			arg0.modelXAn = 150;
			arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.model1Type = 5;
			arg0.model1Id = 1;
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
	public static void getOverlayPos(int arg0, int arg1, int arg2) {
		if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
			projectY = -1;
			projectX = -1;
			return;
		}
		int var3 = getAvH(minusedlevel, arg1, arg0) - arg2;
		int var4 = arg0 - camZ;
		int var5 = Pix3D.sinTable[camPitch];
		int var6 = var3 - camY;
		int var7 = Pix3D.cosTable[camPitch];
		int var8 = Pix3D.sinTable[camYaw];
		int var9 = Pix3D.cosTable[camYaw];
		int var10 = arg1 - camX;
		int var11 = var10 * var9 + var4 * var8 >> 16;
		int var12 = var4 * var9 - var10 * var8 >> 16;
		int var14 = var7 * var6 - var5 * var12 >> 16;
		int var15 = var12 * var7 + var6 * var5 >> 16;
		if (var15 < 50) {
			projectX = -1;
			projectY = -1;
		} else {
			projectY = (var14 << 9) / var15 + 167;
			projectX = (var11 << 9) / var15 + 256;
		}
	}

	@ObfuscatedName("na.a(Lqd;IB)V")
	public static void getOverlayPos(ClientEntity arg0, int arg1) {
		getOverlayPos(arg0.z, arg0.x, arg1);
	}

	@ObfuscatedName("lc.a(BLec;ILec;)V")
	public static void addChat(JagString arg0, int arg1, JagString arg2) {
		addChat(arg2, arg1, arg0, null);
	}

	@ObfuscatedName("jf.b(B)V")
	public static void movePlayers() {
		for (int var0 = -1; var0 < playerCount; var0++) {
			int var1;
			if (var0 == -1) {
				var1 = 2047;
			} else {
				var1 = playerIds[var0];
			}
			ClientPlayer var2 = players[var1];
			if (var2 != null) {
				moveEntity(1, var2);
			}
		}
	}

	@ObfuscatedName("ia.a(B)V")
	public static void checkMinimap() {
		if (lowMem && lastBuiltLevel != minusedlevel) {
			startRebuild(minusedlevel, localPlayer.routeZ[0], field3251, field1422, localPlayer.routeX[0]);
		} else if (minusedlevel != minimapLevel) {
			minimapLevel = minusedlevel;
			minimapBuildBuffer(minusedlevel);
		}
	}

	@ObfuscatedName("cb.a(BLf;II)V")
	public static void dragTryPickup(IfType arg0, int arg1, int arg2) {
		if (dragCom != null || isMenuOpen || (arg0 == null || getDragLayer(arg0) == null)) {
			return;
		}
		dragCom = arg0;
		dragLayer = getDragLayer(arg0);
		dragPickupX = arg2;
		dragPickupY = arg1;
		dragAlive = false;
		dragTime = 0;
	}

	@ObfuscatedName("q.a(ZI)Lec;")
	public static JagString getLine(int arg0) {
		return menuSubject[arg0].length() > 0 ? JagString.join(new JagString[] { menuVerb[arg0], Text.MINISEPARATOR, menuSubject[arg0] }) : menuVerb[arg0];
	}

	@ObfuscatedName("q.a(BLec;)Z")
	public static boolean isIgnored(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < ignoreCount; var1++) {
			if (arg0.equalsIgnoreCase(ignoreUsername[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("uf.a(Lf;B)Lf;")
	public static IfType getDragLayer(IfType arg0) {
		IfType var1 = serverDraggable(arg0);
		if (var1 == null) {
			var1 = arg0.draggable;
		}
		return var1;
	}

	@ObfuscatedName("tb.a(ZBLue;)V")
	public static void closeSubInterface(boolean arg0, SubInterface arg1) {
		int var2 = (int) arg1.key;
		int var3 = arg1.id;
		arg1.unlink();
		if (arg0) {
			IfType.closeInterface(var3);
		}
		purgeServerActive(var3);
		IfType var4 = IfType.get(var2);
		if (var4 != null) {
			componentUpdated(var4);
		}
		isMenuOpen = false;
		menuNumEntries = 0;
		dirtyArea(menuWidth, menuY, menuX, menuHeight);
		if (toplevelinterface != -1) {
			runHookImmediate(toplevelinterface, 1);
		}
	}

	@ObfuscatedName("tb.a(BILka;I)V")
	public static void triggerPlayerAnim(int arg0, ClientPlayer arg1, int arg2) {
		if (arg2 == arg1.primarySeqId && arg2 != -1) {
			int var3 = SeqType.list(arg2).duplicatebehavior;
			if (var3 == 1) {
				arg1.primarySeqCycle = 0;
				arg1.primarySeqLoop = 0;
				arg1.primarySeqFrame = 0;
				arg1.primarySeqDelay = arg0;
			}
			if (var3 == 2) {
				arg1.primarySeqLoop = 0;
			}
		} else if (arg2 == -1 || arg1.primarySeqId == -1 || SeqType.list(arg2).priority >= SeqType.list(arg1.primarySeqId).priority) {
			arg1.preanimRouteLength = arg1.routeLength;
			arg1.primarySeqDelay = arg0;
			arg1.primarySeqFrame = 0;
			arg1.primarySeqLoop = 0;
			arg1.primarySeqCycle = 0;
			arg1.primarySeqId = arg2;
		}
	}

	@ObfuscatedName("wa.a(B)V")
	public static void mouseLoop() {
		if (objDragCom != null || dragCom != null) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickButton;
		if (isMenuOpen) {
			if (var0 != 1) {
				int var1 = ClientMouseListener.mouseX;
				int var2 = ClientMouseListener.mouseY;
				if (menuWidth - 10 > var1 || var1 > menuWidth + menuX + 10 || menuY - 10 > var2 || var2 > menuY + menuHeight + 10) {
					isMenuOpen = false;
					dirtyArea(menuWidth, menuY, menuX, menuHeight);
				}
			}
			if (var0 == 1) {
				int var3 = menuWidth;
				int var4 = menuY;
				int var5 = menuX;
				int var6 = ClientMouseListener.mouseClickX;
				int var7 = ClientMouseListener.mouseClickY;
				int var8 = -1;
				for (int var9 = 0; var9 < menuNumEntries; var9++) {
					int var10 = var4 + (menuNumEntries - var9 - 1) * 15 + 31;
					if (var3 < var6 && var3 + var5 > var6 && var7 > var10 - 13 && var10 + 3 > var7) {
						var8 = var9;
					}
				}
				if (var8 != -1) {
					doAction(var8);
				}
				isMenuOpen = false;
				dirtyArea(menuWidth, menuY, menuX, menuHeight);
				return;
			}
			return;
		}
		if (var0 == 1 && menuNumEntries > 0) {
			int var11 = menuAction[menuNumEntries - 1];
			if (var11 == 38 || var11 == 15 || var11 == 51 || var11 == 18 || var11 == 41 || var11 == 17 || var11 == 30 || var11 == 7 || var11 == 19 || var11 == 35 || var11 == 21 || var11 == 1004) {
				int var12 = field2868[menuNumEntries - 1];
				int var13 = field3620[menuNumEntries - 1];
				IfType var14 = IfType.get(var13);
				if (ServerActive.isObjSwapEnabled(getActive(var14)) || ServerActive.isObjReplaceEnabled(getActive(var14))) {
					objDragCycles = 0;
					objGrabThreshold = false;
					if (objDragCom != null) {
						componentUpdated(objDragCom);
					}
					objDragCom = IfType.get(var13);
					objGrabY = ClientMouseListener.mouseClickY;
					objGrabX = ClientMouseListener.mouseClickX;
					objDragSlot = var12;
					componentUpdated(objDragCom);
					return;
				}
			}
		}
		if (var0 == 1 && (oneMouseButton == 1 && menuNumEntries > 2 || isAddFriendOption(menuNumEntries - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && menuNumEntries > 0) {
			doAction(menuNumEntries - 1);
		}
		if (var0 != 2 || menuNumEntries <= 0) {
			return;
		}
		openMenu();
	}

	@ObfuscatedName("td.a(IIIILh;I)V")
	public static void minimapDrawDot(int arg0, int arg1, int arg2, Pix32 arg3, int arg4) {
		if (arg3 == null) {
			return;
		}
		int var5 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var6 = arg4 * arg4 + arg2 * arg2;
		if (var6 > 6400) {
			return;
		}
		int var7 = Pix3D.sinTable[var5];
		int var8 = var7 * 256 / (macroMinimapZoom + 256);
		int var9 = Pix3D.cosTable[var5];
		int var10 = var9 * 256 / (macroMinimapZoom + 256);
		int var11 = var10 * arg2 - arg4 * var8 >> 16;
		int var12 = arg2 * var8 + var10 * arg4 >> 16;
		if (var6 <= 2500) {
			arg3.plotSprite(var12 + arg0 + 94 + 4 - arg3.owi / 2, arg1 + 83 + -var11 + (-(arg3.ohi / 2) - 4));
		} else {
			arg3.scanlinePlotSprite(mapback, arg0 + var12 + 94 + 4 - arg3.owi / 2, -(arg3.ohi / 2) + 83 + (arg1 - var11) + -4);
		}
	}

	@ObfuscatedName("bd.d(I)V")
	public static void moveNpcs() {
		for (int var0 = 0; var0 < npcCount; var0++) {
			int var1 = npcIds[var0];
			ClientNpc var2 = npcs[var1];
			if (var2 != null) {
				moveEntity(var2.type.size, var2);
			}
		}
	}

	@ObfuscatedName("hd.a(ZI)Lec;")
	public static JagString inf(int arg0) {
		return arg0 < 999999999 ? JagString.parseInt(arg0) : AUTO_ASTERISK;
	}

	@ObfuscatedName("ea.a(IIIIII)V")
	public static void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = world.wallType(arg1, arg2, arg3);
		if (var5 != 0) {
			int var6 = world.typecode2(arg1, arg2, arg3, var5);
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
			if (var13.mapscene == -1) {
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
				Pix8 var14 = mapscene[var13.mapscene];
				if (var14 != null) {
					int var15 = (var13.width * 4 - var14.wi) / 2;
					int var16 = (var13.length * 4 - var14.hi) / 2;
					var14.plotSprite(var15 + arg2 * 4 + 48, var16 + (-var13.length + -arg3 + 104) * 4 + 48);
				}
			}
		}
		int var17 = world.sceneType(arg1, arg2, arg3);
		if (var17 != 0) {
			int var18 = world.typecode2(arg1, arg2, arg3, var17);
			int var19 = var18 >> 6 & 0x3;
			int var20 = var18 & 0x1F;
			int var21 = var17 >> 14 & 0x7FFF;
			LocType var22 = LocType.list(var21);
			if (var22.mapscene != -1) {
				Pix8 var23 = mapscene[var22.mapscene];
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
		int var29 = world.gdType(arg1, arg2, arg3);
		if (var29 != 0) {
			int var30 = var29 >> 14 & 0x7FFF;
			LocType var31 = LocType.list(var30);
			if (var31.mapscene == -1) {
				return;
			}
			Pix8 var32 = mapscene[var31.mapscene];
			if (var32 != null) {
				int var33 = (var31.width * 4 - var32.wi) / 2;
				int var34 = (var31.length * 4 - var32.hi) / 2;
				var32.plotSprite(var33 + arg2 * 4 + 48, var34 + (-arg3 - var31.length + 104) * 4 + 48);
			}
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
		if (state == 30 && componentRectDebug == 0 && !fullredraw) {
			try {
				Graphics var4 = GameShell.canvas.getGraphics();
				for (int var5 = 0; var5 < componentDrawCount; var5++) {
					if (componentBlitArea[var5]) {
						GameShell.drawArea.draw(var4, componentDrawWidth[var5], componentDrawHeight[var5], componentDrawX[var5], componentDrawY[var5]);
						componentBlitArea[var5] = false;
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
					componentBlitArea[var7] = false;
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
			ACTIVE_LANG = AUTO_LANG_DE;
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
