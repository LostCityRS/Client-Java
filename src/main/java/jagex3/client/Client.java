package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Skills;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.datastruct.IntNode;
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
import jagex3.worldmap.WorldMap;

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.*;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("fa.S")
	public static boolean mouseTracked = false;

	@ObfuscatedName("ce.Y")
	public static int worldid = 1;

	@ObfuscatedName("mh.cb")
	public static int modewhat = 0;

	@ObfuscatedName("kf.a")
	public static int modewhere = 0;

	@ObfuscatedName("eb.R")
	public static int modegame = 0;

	@ObfuscatedName("g.m")
	public static boolean memServer = false;

	@ObfuscatedName("wf.b")
	public static boolean lowMem = false;

	@ObfuscatedName("lf.nb")
	public static int lang = 0;

	@ObfuscatedName("gd.A")
	public static int js = 1;

	@ObfuscatedName("na.Z")
	public static int plug = 0;

	@ObfuscatedName("ac.D")
	public static int affid = 0;

	@ObfuscatedName("v.E")
	public static int state = 0;

	@ObfuscatedName("ob.q")
	public static boolean js5Loading = true;

	@ObfuscatedName("kh.I")
	public static int loopCycle = 0;

	@ObfuscatedName("ja.c")
	public static long prevMouseClickTime = 0L;

	@ObfuscatedName("ua.m")
	public static MouseTracking mouseTracking;

	@ObfuscatedName("af.U")
	public static int mouseTrackedX = 0;

	@ObfuscatedName("td.bb")
	public static int mouseTrackedY = 0;

	@ObfuscatedName("ne.n")
	public static int mouseTrackedDelta = 0;

	@ObfuscatedName("bj.Bb")
	public static boolean focusIn = true;

	@ObfuscatedName("nf.E")
	public static boolean showFps = false;

	@ObfuscatedName("ke.K")
	public static int rebootTimer = 0;

	@ObfuscatedName("fh.o")
	public static final HintArrow[] field1171 = new HintArrow[4];

	@ObfuscatedName("ei.e")
	public static final Packet tempP = new Packet(new byte[5000]);

	@ObfuscatedName("ed.b")
	public static PrivilegedRequest lastAddress;

	@ObfuscatedName("ci.s")
	public static int loadingStep = 0;

	@ObfuscatedName("ff.fb")
	public static PrivilegedRequest js5SocketReq;

	@ObfuscatedName("re.n")
	public static ClientStream js5Stream;

	@ObfuscatedName("we.D")
	public static int js5ConnectState = 0;

	@ObfuscatedName("pa.d")
	public static int js5ConnectCooldown = 0;

	@ObfuscatedName("jc.P")
	public static long js5ConnectTime;

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

	@ObfuscatedName("kj.h")
	public static int js5Errors = 0;

	@ObfuscatedName("pd.lb")
	public static DataFile masterIndex;

	@ObfuscatedName("kh.M")
	public static int loginStep = 0;

	@ObfuscatedName("ae.Kb")
	public static int loginWaitingTime = 0;

	@ObfuscatedName("s.Y")
	public static int loginFailCount = 0;

	@ObfuscatedName("vh.U")
	public static int loginHopTimer = 0;

	@ObfuscatedName("ih.b")
	public static String loginHost;

	@ObfuscatedName("ub.Y")
	public static int loginGamePort;

	@ObfuscatedName("ed.a")
	public static int loginJs5Port;

	@ObfuscatedName("pe.L")
	public static int loginPort;

	@ObfuscatedName("ug.f")
	public static final ClientNpc[] npc = new ClientNpc[32768];

	@ObfuscatedName("ej.B")
	public static int npcCount = 0;

	@ObfuscatedName("cb.g")
	public static final int[] npcIds = new int[32768];

	@ObfuscatedName("j.h")
	public static PrivilegedRequest loginSocketReq;

	@ObfuscatedName("cj.hb")
	public static ClientStream stream;

	@ObfuscatedName("ia.e")
	public static ClientStream prevStream;

	@ObfuscatedName("nd.u")
	public static final PacketBit out = new PacketBit(5000);

	@ObfuscatedName("ch.g")
	public static final PacketBit loginout = new PacketBit(5000);

	@ObfuscatedName("va.v")
	public static final PacketBit in = new PacketBit(5000);

	@ObfuscatedName("uj.d")
	public static int psize = 0;

	@ObfuscatedName("vi.f")
	public static int ptype = 0;

	@ObfuscatedName("rg.F")
	public static int timeoutTimer = 0;

	@ObfuscatedName("nb.V")
	public static int noTimeoutTimer = 0;

	@ObfuscatedName("jg.J")
	public static int logoutTimer = 0;

	@ObfuscatedName("jc.Q")
	public static int ptype0 = 0;

	@ObfuscatedName("ea.N")
	public static int ptype1 = 0;

	@ObfuscatedName("i.J")
	public static int ptype2 = 0;

	@ObfuscatedName("fb.gb")
	public static boolean networkError = false;

	@ObfuscatedName("ed.g")
	public static PixfontGeneric p11;

	@ObfuscatedName("ab.e")
	public static PixfontGeneric p12;

	@ObfuscatedName("ei.j")
	public static PixfontGeneric b12;

	@ObfuscatedName("ue.t")
	public static int mapBuildBaseX;

	@ObfuscatedName("re.m")
	public static int mapBuildBaseZ;

	@ObfuscatedName("oe.j")
	public static int lastBuiltLevel = 0;

	@ObfuscatedName("mi.X")
	public static int mapBuildCentreZoneX;

	@ObfuscatedName("ka.j")
	public static int mapBuildCentreZoneZ;

	@ObfuscatedName("pc.n")
	public static final CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("j.a")
	public static final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("la.i")
	public static int zoneUpdateX;

	@ObfuscatedName("nh.b")
	public static int zoneUpdateZ;

	@ObfuscatedName("re.g")
	public static final int[][] dirMap = new int[104][104];

	@ObfuscatedName("uj.a")
	public static final int[][] distMap = new int[104][104];

	@ObfuscatedName("l.kb")
	public static final int[] routeX = new int[4096];

	@ObfuscatedName("ij.E")
	public static final int[] routeZ = new int[4096];

	@ObfuscatedName("ue.g")
	public static int macroCameraX = 0;

	@ObfuscatedName("me.B")
	public static int macroCameraXModifier = 2;

	@ObfuscatedName("cj.N")
	public static int macroCameraZ = 0;

	@ObfuscatedName("vc.cb")
	public static int macroCameraZModifier = 2;

	@ObfuscatedName("j.d")
	public static int macroCameraAngle = 0;

	@ObfuscatedName("cf.e")
	public static int macroCameraAngleModifier = 1;

	@ObfuscatedName("kb.u")
	public static int macroCameraCycle = 0;

	@ObfuscatedName("eg.y")
	public static int macroMinimapAngle = 0;

	@ObfuscatedName("i.U")
	public static int macroMinimapAngleModifier = 2;

	@ObfuscatedName("fi.F")
	public static int macroMinimapZoom = 0;

	@ObfuscatedName("oi.m")
	public static int macroMinimapZoomModifier = 1;

	@ObfuscatedName("h.F")
	public static int macroMinimapCycle = 0;

	@ObfuscatedName("be.l")
	public static int worldUpdateNum = 0;

	@ObfuscatedName("eb.U")
	public static Pix32 compass;

	@ObfuscatedName("kd.V")
	public static Pix32[] hintMapedge;

	@ObfuscatedName("wa.h")
	public static SoftwarePix8[] mapscene;

	@ObfuscatedName("ch.k")
	public static SoftwarePix32[] mapfunction;

	@ObfuscatedName("nc.e")
	public static Pix32[] hitmarks;

	@ObfuscatedName("vi.a")
	public static Pix32[] headiconsPk;

	@ObfuscatedName("lj.a")
	public static Pix32[] headiconsPrayer;

	@ObfuscatedName("qb.P")
	public static Pix32[] headiconsHint;

	@ObfuscatedName("ui.K")
	public static Pix32[] hintMapmarkers;

	@ObfuscatedName("ob.s")
	public static Pix32[] cross;

	@ObfuscatedName("da.S")
	public static Pix32[] mapdots;

	@ObfuscatedName("af.P")
	public static Pix8[] scrollbar;

	@ObfuscatedName("d.ab")
	public static Pix8[] modIcons;

	@ObfuscatedName("vi.h")
	public static final int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("ab.a")
	public static final int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("eg.u")
	public static final int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("va.z")
	public static final int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

	@ObfuscatedName("a.i")
	public static boolean scrollGrabbed = false;

	@ObfuscatedName("lf.X")
	public static int scrollInputPadding = 0;

	@ObfuscatedName("hb.U")
	public static int camX;

	@ObfuscatedName("jj.v")
	public static int camY;

	@ObfuscatedName("qj.Y")
	public static int camZ;

	@ObfuscatedName("t.v")
	public static int camPitch;

	@ObfuscatedName("pg.G")
	public static int camYaw;

	@ObfuscatedName("fh.q")
	public static int orbitCameraPitch = 128;

	@ObfuscatedName("t.r")
	public static int orbitCameraYaw = 0;

	@ObfuscatedName("ej.i")
	public static int orbitCameraPitchVelocity = 0;

	@ObfuscatedName("hh.R")
	public static int orbitCameraYawVelocity = 0;

	@ObfuscatedName("dc.e")
	public static int orbitCameraX;

	@ObfuscatedName("vd.b")
	public static int orbitCameraZ;

	@ObfuscatedName("i.N")
	public static int sendCameraDelay = 0;

	@ObfuscatedName("qb.S")
	public static boolean sendCamera = true;

	@ObfuscatedName("ge.O")
	public static int cameraPitchClamp = 0;

	@ObfuscatedName("jg.R")
	public static int chatCount = 0;

	@ObfuscatedName("t.m")
	public static final int MAX_CHATS = 50;

	@ObfuscatedName("t.z")
	public static final int[] chatX = new int[MAX_CHATS];

	@ObfuscatedName("t.B")
	public static final int[] chatY = new int[MAX_CHATS];

	@ObfuscatedName("t.q")
	public static final int[] chatHeight = new int[MAX_CHATS];

	@ObfuscatedName("t.s")
	public static final int[] chatWidth = new int[MAX_CHATS];

	@ObfuscatedName("t.y")
	public static final int[] chatColour = new int[MAX_CHATS];

	@ObfuscatedName("t.t")
	public static final int[] chatEffect = new int[MAX_CHATS];

	@ObfuscatedName("t.n")
	public static final int[] chatTimer = new int[MAX_CHATS];

	@ObfuscatedName("t.u")
	public static final JagString[] chats = new JagString[MAX_CHATS];

	@ObfuscatedName("o.W")
	public static final int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("tc.K")
	public static int sceneCycle = 0;

	@ObfuscatedName("cb.f")
	public static int projectX = -1;

	@ObfuscatedName("cj.S")
	public static int projectY = -1;

	@ObfuscatedName("ne.f")
	public static int crossX = 0;

	@ObfuscatedName("oc.z")
	public static int crossY = 0;

	@ObfuscatedName("e.mb")
	public static int crossCycle = 0;

	@ObfuscatedName("oe.a")
	public static int crossMode = 0;

	@ObfuscatedName("fa.gb")
	public static IfType selectedCom;

	@ObfuscatedName("mh.R")
	public static int selectedCycle = 0;

	@ObfuscatedName("ie.h")
	public static int selectedItem = 0;

	@ObfuscatedName("md.ab")
	public static IfType objDragCom;

	@ObfuscatedName("ug.l")
	public static IfType hoveredSlotCom;

	@ObfuscatedName("bf.P")
	public static int objDragSlot = 0;

	@ObfuscatedName("ua.p")
	public static int objGrabX = 0;

	@ObfuscatedName("ec.F")
	public static int objGrabY = 0;

	@ObfuscatedName("di.hb")
	public static boolean objGrabThreshold = false;

	@ObfuscatedName("wi.e")
	public static int objDragCycles = 0;

	@ObfuscatedName("pi.R")
	public static int hoveredSlot = 0;

	@ObfuscatedName("client.V")
	public static int chatDisabled = 0;

	@ObfuscatedName("we.B")
	public static final ClientPlayer[] players = new ClientPlayer[2048];

	@ObfuscatedName("ej.n")
	public static int playerCount = 0;

	@ObfuscatedName("q.lb")
	public static final int[] playerIds = new int[2048];

	@ObfuscatedName("rg.H")
	public static int entityUpdateCount = 0;

	@ObfuscatedName("mh.X")
	public static final int[] entityUpdateIds = new int[2048];

	@ObfuscatedName("h.S")
	public static final Packet[] playerAppearanceBuffer = new Packet[2048];

	@ObfuscatedName("ng.Yb")
	public static int minusedlevel;

	@ObfuscatedName("ub.gb")
	public static int selfSlot = -1;

	@ObfuscatedName("wa.d")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("ae.Lb")
	public static int membersAccount = 0;

	@ObfuscatedName("ue.d")
	public static int entityRemovalCount = 0;

	@ObfuscatedName("eh.G")
	public static final int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("lj.i")
	public static final JagString[] playerOp = new JagString[8];

	@ObfuscatedName("sg.B")
	public static final boolean[] playerOpPriority = new boolean[8];

	@ObfuscatedName("ae.Ob")
	public static final int[] ANGLE_TO_DIR = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@ObfuscatedName("mc.f")
	public static final LinkList[][][] groundObj = new LinkList[4][104][104];

	@ObfuscatedName("ff.U")
	public static LinkList locChanges = new LinkList();

	@ObfuscatedName("pd.ib")
	public static final LinkList projectiles = new LinkList();

	@ObfuscatedName("dh.f")
	public static final LinkList spotanims = new LinkList();

	@ObfuscatedName("jg.G")
	public static final int[] statEffectiveLevel = new int[25];

	@ObfuscatedName("tj.l")
	public static final int[] statBaseLevel = new int[25];

	@ObfuscatedName("qe.h")
	public static final int[] statXP = new int[25];

	@ObfuscatedName("sg.l")
	public static int oneMouseButton = 0;

	@ObfuscatedName("jj.z")
	public static boolean isMenuOpen = false;

	@ObfuscatedName("sg.o")
	public static int menuNumEntries = 0;

	@ObfuscatedName("mb.X")
	public static int menuMouseX = -1;

	@ObfuscatedName("fb.kb")
	public static int menuMouseY = -1;

	@ObfuscatedName("db.D")
	public static IfType tooltipCom;

	@ObfuscatedName("ea.zb")
	public static int tooltipNum = 0;

	@ObfuscatedName("mg.Cb")
	public static final int tooltipRedraw = 50;

	@ObfuscatedName("ce.db")
	public static int useMode = 0;

	@ObfuscatedName("ec.Q")
	public static int objComId;

	@ObfuscatedName("tb.j")
	public static int objSelectedComId;

	@ObfuscatedName("fb.ob")
	public static int objSelectedSlot;

	@ObfuscatedName("ai.e")
	public static boolean targetMode = false;

	@ObfuscatedName("client.bb")
	public static int targetCom = -1;

	@ObfuscatedName("kf.n")
	public static int targetMask;

	@ObfuscatedName("bd.n")
	public static int targetSub;

	@ObfuscatedName("se.d")
	public static JagString targetVerb = null;

	@ObfuscatedName("ce.S")
	public static JagString targetOp = null;

	@ObfuscatedName("di.R")
	public static int toplevelinterface = -1;

	@ObfuscatedName("lh.Q")
	public static HashTable subinterfaces = new HashTable(8);

	@ObfuscatedName("fi.w")
	public static IfType overCom;

	@ObfuscatedName("mf.p")
	public static int chatEffects = 0;

	@ObfuscatedName("oc.t")
	public static int bankArrangeMode = 0;

	@ObfuscatedName("eh.a")
	public static IfType resumePauseCom = null;

	@ObfuscatedName("wa.f")
	public static int runenergy = 0;

	@ObfuscatedName("sc.F")
	public static int runweight = 0;

	@ObfuscatedName("g.f")
	public static int staffmodlevel = 0;

	@ObfuscatedName("ja.f")
	public static final boolean showOpIndex = false;

	@ObfuscatedName("qe.n")
	public static IfType dragCom = null;

	@ObfuscatedName("ed.m")
	public static IfType dragLayer = null;

	@ObfuscatedName("qe.j")
	public static IfType[] dragChildren;

	@ObfuscatedName("ig.U")
	public static int dragChildX;

	@ObfuscatedName("ae.Qb")
	public static int dragChildY;

	@ObfuscatedName("nf.bb")
	public static int dragPickupX = 0;

	@ObfuscatedName("t.C")
	public static int dragPickupY = 0;

	@ObfuscatedName("lb.j")
	public static IfType dropCom = null;

	@ObfuscatedName("ng.Wb")
	public static boolean dragParentFound = false;

	@ObfuscatedName("lg.x")
	public static int dragParentX = -1;

	@ObfuscatedName("ce.U")
	public static int dragParentY = -1;

	@ObfuscatedName("cf.k")
	public static boolean dragging = false;

	@ObfuscatedName("bb.b")
	public static int dragCurrentX = -1;

	@ObfuscatedName("md.S")
	public static int dragCurrentY = -1;

	@ObfuscatedName("sg.t")
	public static boolean dragAlive = false;

	@ObfuscatedName("ui.J")
	public static int dragTime;

	@ObfuscatedName("g.i")
	public static int transmitNum = 1;

	@ObfuscatedName("we.F")
	public static final int[] varTransmit = new int[32];

	@ObfuscatedName("uh.P")
	public static int varTransmitNum = 0;

	@ObfuscatedName("vb.K")
	public static final int[] invTransmit = new int[32];

	@ObfuscatedName("ue.f")
	public static int invTransmitNum = 0;

	@ObfuscatedName("na.K")
	public static final int[] statTransmit = new int[32];

	@ObfuscatedName("ki.a")
	public static int statTransmitNum = 0;

	@ObfuscatedName("af.I")
	public static int chatTransmitNum = 0;

	@ObfuscatedName("bh.F")
	public static int friendTransmitNum = 0;

	@ObfuscatedName("h.P")
	public static int clanTransmitNum = 0;

	@ObfuscatedName("ta.ab")
	public static int miscTransmitNum = 0;

	@ObfuscatedName("pd.kb")
	public static MouseWheelInterface mouseWheel;

	@ObfuscatedName("ib.C")
	public static int mouseWheelRotation = 0;

	@ObfuscatedName("gh.t")
	public static final LinkList hookRequests = new LinkList();

	@ObfuscatedName("da.ob")
	public static final LinkList hookRequestsTimer = new LinkList();

	@ObfuscatedName("sc.bb")
	public static final LinkList hookRequestsMouseStop = new LinkList();

	@ObfuscatedName("ch.a")
	public static HashTable serverActive = new HashTable(512);

	@ObfuscatedName("sj.f")
	public static int componentDrawCount = 0;

	@ObfuscatedName("ka.n")
	public static int componentDrawTime = -2;

	@ObfuscatedName("ug.k")
	public static final boolean[] componentDirtyArea = new boolean[100];

	@ObfuscatedName("td.cb")
	public static final boolean[] componentBlitArea = new boolean[100];

	@ObfuscatedName("kd.X")
	public static final boolean[] componentRedraw = new boolean[100];

	@ObfuscatedName("hd.o")
	public static final int[] componentDrawX = new int[100];

	@ObfuscatedName("ma.ab")
	public static final int[] componentDrawY = new int[100];

	@ObfuscatedName("mb.V")
	public static final int[] componentDrawWidth = new int[100];

	@ObfuscatedName("hc.Z")
	public static final int[] componentDrawHeight = new int[100];

	@ObfuscatedName("mc.l")
	public static int componentRectDebug = 0;

	@ObfuscatedName("ri.S")
	public static final int[] chatType = new int[100];

	@ObfuscatedName("la.b")
	public static final JagString[] chatUsername = new JagString[100];

	@ObfuscatedName("uj.n")
	public static final JagString[] chatScreenName = new JagString[100];

	@ObfuscatedName("te.ab")
	public static final JagString[] chatText = new JagString[100];

	@ObfuscatedName("d.V")
	public static int chatHistoryLength = 0;

	@ObfuscatedName("sd.a")
	public static final int[] CHAT_COLOURS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("g.d")
	public static int chatPublicMode = 0;

	@ObfuscatedName("ai.b")
	public static int chatPrivateMode = 0;

	@ObfuscatedName("lh.db")
	public static int chatTradeMode = 0;

	@ObfuscatedName("ih.f")
	public static final long[] messageIds = new long[100];

	@ObfuscatedName("g.s")
	public static int privateMessageCount = 0;

	@ObfuscatedName("pg.yb")
	public static byte chatMinKick;

	@ObfuscatedName("na.y")
	public static byte chatRank;

	@ObfuscatedName("i.X")
	public static ClanChannelUser[] friendChatList;

	@ObfuscatedName("eb.S")
	public static int friendChatCount;

	@ObfuscatedName("hd.A")
	public static int keypresses = 0;

	@ObfuscatedName("rf.Kb")
	public static final int[] keypressKeychars = new int[128];

	@ObfuscatedName("wc.L")
	public static final int[] keypressKeycodes = new int[128];

	@ObfuscatedName("ud.d")
	public static JagString chatDisplayName = null;

	@ObfuscatedName("ug.b")
	public static JagString chatOwnerName = null;

	@ObfuscatedName("pi.U")
	public static int minimapLevel = -1;

	@ObfuscatedName("kg.eb")
	public static int minimapFlagX = 0;

	@ObfuscatedName("mi.W")
	public static int minimapFlagZ = 0;

	@ObfuscatedName("wh.E")
	public static int minimapState = 0;

	@ObfuscatedName("q.Cb")
	public static int waveCount = 0;

	@ObfuscatedName("cb.b")
	public static final int[] waveSoundIds = new int[50];

	@ObfuscatedName("ka.l")
	public static final int[] waveLoops = new int[50];

	@ObfuscatedName("ag.b")
	public static final int[] waveDelay = new int[50];

	@ObfuscatedName("nc.m")
	public static final int[] waveAmbient = new int[50];

	@ObfuscatedName("vh.N")
	public static final JagFX[] waveSounds = new JagFX[50];

	@ObfuscatedName("qe.m")
	public static boolean cinemaCam = false;

	@ObfuscatedName("vd.d")
	public static final boolean[] camShake = new boolean[5];

	@ObfuscatedName("se.c")
	public static final int[] camShakeAxis = new int[5];

	@ObfuscatedName("fj.h")
	public static final int[] camShakeRan = new int[5];

	@ObfuscatedName("ri.Y")
	public static final int[] camShakeAmp = new int[5];

	@ObfuscatedName("re.h")
	public static final int[] camShakeCycle = new int[5];

	@ObfuscatedName("md.Y")
	public static int camMoveToLx;

	@ObfuscatedName("ph.X")
	public static int camMoveToLz;

	@ObfuscatedName("gd.j")
	public static int camMoveToHei;

	@ObfuscatedName("wg.u")
	public static int camMoveToRate;

	@ObfuscatedName("oh.q")
	public static int camMoveToRate2;

	@ObfuscatedName("ea.ob")
	public static int camLookAtLx;

	@ObfuscatedName("c.C")
	public static int camLookAtLz;

	@ObfuscatedName("fj.n")
	public static int camLookAtHei;

	@ObfuscatedName("ah.z")
	public static int camLookAtRate;

	@ObfuscatedName("nd.p")
	public static int camLookAtRate2;

	@ObfuscatedName("uh.T")
	public static Mixer mixer;

	@ObfuscatedName("kh.U")
	public static Decimator decimator;

	@ObfuscatedName("ke.F")
	public static PcmPlayer synthPlayer;

	@ObfuscatedName("cd.h")
	public static PcmPlayer midiPlayer;

	@ObfuscatedName("nd.c")
	public static int friendCount = 0;

	@ObfuscatedName("kf.h")
	public static int friendServerStatus = 0;

	// ---- todo: sort fields

	@ObfuscatedName("eh.B")
	public static final short[] menuAction = new short[500];
	@ObfuscatedName("fj.e")
	public static final JagString[] menuVerb = new JagString[500];
	@ObfuscatedName("se.e")
	public static final JagString[] menuSubject = new JagString[500];
	@ObfuscatedName("q.Kb")
	public static final JagString AUTO_EMPTY = JagString.wrap("");
	@ObfuscatedName("fb.hb")
	public static final BigInteger field1098 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("ci.o")
	public static final BigInteger field515 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("mb.T")
	public static final int[] field2483 = new int[100];
	@ObfuscatedName("ng.Mb")
	public static final JagString SUB_PCT = JagString.wrap("(U");
	@ObfuscatedName("kf.j")
	public static final JagString SUB_PCT1 = JagString.wrap("(U1");
	@ObfuscatedName("pc.c")
	public static final JagString SUB_PCT2 = JagString.wrap("(U2");
	@ObfuscatedName("bf.y")
	public static final JagString SUB_PCT3 = JagString.wrap("(U3");
	@ObfuscatedName("jd.e")
	public static final JagString SUB_PCT4 = JagString.wrap("(U4");
	@ObfuscatedName("mc.h")
	public static final JagString SUB_PCT5 = JagString.wrap("(U5");
	@ObfuscatedName("rc.G")
	public static final JagString SUB_PCTDNS = JagString.wrap("(Udns");
	@ObfuscatedName("nd.o")
	public static final JagString[] field2741 = new JagString[100];
	@ObfuscatedName("fc.m")
	public static final JagString zap = JagString.wrap("zap");
	@ObfuscatedName("qf.Y")
	public static final JagString unzap = JagString.wrap("unzap");
	@ObfuscatedName("pb.F")
	public static final int[] menuParamB = new int[500];
	@ObfuscatedName("tj.f")
	public static final int[] menuParamC = new int[500];
	@ObfuscatedName("gh.w")
	public static final long[] menuParamA = new long[500];
	@ObfuscatedName("ah.L")
	public static final StockMarketSlot[] field140 = new StockMarketSlot[6];
	@ObfuscatedName("kf.p")
	public static final long[] field2086 = new long[200];
	@ObfuscatedName("ha.G")
	public static final JagString AUTO_GC = JagString.wrap("::gc");
	@ObfuscatedName("aj.V")
	public static final JagString AUTO_CLIENTDROP = JagString.wrap("::clientdrop");
	@ObfuscatedName("wi.q")
	public static final JagString AUTO_FPSON = JagString.wrap("::fpson");
	@ObfuscatedName("d.W")
	public static final JagString AUTO_FPSOFF = JagString.wrap("::fpsoff");
	@ObfuscatedName("dj.Rb")
	public static final JagString AUTO_AUTOSHADOW_ON = JagString.wrap("::autoshadow on");
	@ObfuscatedName("a.f")
	public static final JagString AUTO_AUTOSHADOW_OFF = JagString.wrap("::autoshadow off");
	@ObfuscatedName("pi.V")
	public static final JagString AUTO_NOCLIP = JagString.wrap("::noclip");
	@ObfuscatedName("uh.U")
	public static final JagString AUTO_FPS = JagString.wrap("::fps ");
	@ObfuscatedName("bj.qb")
	public static final JagString AUTO_ERRORTEST = JagString.wrap("::errortest");
	@ObfuscatedName("fb.mb")
	public static final JagString AUTO_RECT_DEBUG = JagString.wrap("::rect_debug");
	@ObfuscatedName("jh.j")
	public static final JagString AUTO_QA_OP_TEST = JagString.wrap("::qa_op_test");
	@ObfuscatedName("ca.i")
	public static final short[] MENUACTION_PLAYER = new short[] { 30, 58, 29, 45, 37, 16, 1, 50 };
	@ObfuscatedName("c.E")
	public static final JagString[] field370 = new JagString[200];
	@ObfuscatedName("oh.p")
	public static final int[] field3092 = new int[200];
	@ObfuscatedName("pe.D")
	public static final JagString[] field3238 = new JagString[200];
	@ObfuscatedName("ea.lb")
	public static final int[] field845 = new int[200];
	@ObfuscatedName("fc.o")
	public static final boolean[] field1120 = new boolean[200];
	@ObfuscatedName("mc.j")
	public static final int[] field2501 = new int[1000];
	@ObfuscatedName("pd.Q")
	public static final long[] field3203 = new long[100];
	@ObfuscatedName("mh.V")
	public static final int[] field2577 = new int[1000];
	@ObfuscatedName("gd.e")
	public static final Random feedbackRand = new Random();
	@ObfuscatedName("a.g")
	public static final JagString AUTO_MAPFUNCTION = JagString.wrap("mapfunction");
	@ObfuscatedName("be.k")
	public static final JagString AUTO_MAPSCENE = JagString.wrap("mapscene");
	@ObfuscatedName("fc.a")
	public static final JagString AUTO_COMPASS = JagString.wrap("compass");
	@ObfuscatedName("nb.e")
	public static final JagString AUTO_HITMARKS = JagString.wrap("hitmarks");
	@ObfuscatedName("j.e")
	public static final JagString AUTO_HEADICONSPK = JagString.wrap("headicons_pk");
	@ObfuscatedName("jh.a")
	public static final JagString AUTO_HEADICONSPRAYER = JagString.wrap("headicons_prayer");
	@ObfuscatedName("vd.c")
	public static final JagString AUTO_HEADICONSHINT = JagString.wrap("hint_headicons");
	@ObfuscatedName("n.j")
	public static final JagString AUTO_HINTMAPMARKERS = JagString.wrap("hint_mapmarkers");
	@ObfuscatedName("de.H")
	public static final JagString AUTO_HINTMAPEDGE = JagString.wrap("hint_mapedge");
	@ObfuscatedName("vh.H")
	public static final JagString AUTO_MAPFLAG = JagString.wrap("mapflag");
	@ObfuscatedName("ui.E")
	public static final JagString AUTO_CROSS = JagString.wrap("cross");
	@ObfuscatedName("kf.e")
	public static final JagString AUTO_MAPDOTS = JagString.wrap("mapdots");
	@ObfuscatedName("n.i")
	public static final JagString AUTO_SCROLLBAR = JagString.wrap("scrollbar");
	@ObfuscatedName("wa.g")
	public static final JagString AUTO_MODICONS = JagString.wrap("mod_icons");
	@ObfuscatedName("wi.r")
	public static final JagString AUTO_TARGET_COM = JagString.wrap(" )2> ");
	@ObfuscatedName("b.o")
	public static final JagString AUTO_TAG_COL_00FF00 = JagString.wrap("<col=00ff00>");
	@ObfuscatedName("pe.J")
	public static final JagString field3244 = JagString.wrap("<col=ff0000>");
	@ObfuscatedName("ra.eb")
	public static final JagString field3636 = JagString.wrap("<col=ff3000>");
	@ObfuscatedName("aa.W")
	public static final JagString field18 = JagString.wrap("<col=ff7000>");
	@ObfuscatedName("ch.h")
	public static final JagString field502 = JagString.wrap("<col=ffb000>");
	@ObfuscatedName("cj.eb")
	public static final JagString field553 = JagString.wrap("<col=40ff00>");
	@ObfuscatedName("vb.U")
	public static final JagString field4338 = JagString.wrap("<col=80ff00>");
	@ObfuscatedName("me.w")
	public static final JagString field2526 = JagString.wrap("<col=c0ff00>");
	@ObfuscatedName("ag.f")
	public static final JagString AUTO_TAG_COL_FFFF00 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("dh.b")
	public static final JagString AUTO_NULL = JagString.wrap("Null");
	@ObfuscatedName("i.M")
	public static final JagString AUTO_TAG_COL_FFFFFF = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("qf.Q")
	public static final JagString field3569 = JagString.wrap("Fps:");
	@ObfuscatedName("sj.d")
	public static final JagString field3921 = JagString.wrap("Mem:");
	@ObfuscatedName("ka.c")
	public static final JagString field2007 = JagString.wrap("k");
	@ObfuscatedName("n.f")
	public static final JagString AUTO_TAG_BR = JagString.wrap("<br>");
	@ObfuscatedName("bb.j")
	public static final JagString field216 = JagString.wrap("(U(Y");
	@ObfuscatedName("ch.o")
	public static final JagString field509 = JagString.wrap("<br>(X");
	@ObfuscatedName("ce.ab")
	public static final JagString field472 = JagString.wrap("<img=1>");
	@ObfuscatedName("uj.i")
	public static final JagString field4275 = JagString.wrap(":duelfriend:");
	@ObfuscatedName("pc.o")
	public static final JagString field3201 = JagString.wrap("<img=0>");
	@ObfuscatedName("di.Z")
	public static final JagString field731 = JagString.wrap(":trade:");
	@ObfuscatedName("be.j")
	public static final JagString AUTO_TAG_COL_00FFFF = JagString.wrap("<col=00ffff>");
	@ObfuscatedName("k.nb")
	public static final JagString AUTO_SETTINGS = JagString.wrap("settings");
	@ObfuscatedName("ed.d")
	public static final JagString AUTO_TAG_COL_FFFFFF_USE = JagString.wrap(" )2> <col=ffffff>");
	@ObfuscatedName("ci.w")
	public static final JagString AUTO_TAG_COL_CLOSE_X = JagString.wrap("<)4col> x");
	@ObfuscatedName("g.l")
	public static final JagString field1214 = JagString.wrap("<)4col>");
	@ObfuscatedName("qf.T")
	public static final JagString AUTO_NULL_LOWER = JagString.wrap("null");
	@ObfuscatedName("ja.a")
	public static final JagString field1802 = JagString.wrap("Hidden)2");
	@ObfuscatedName("l.bb")
	public static final JagString field2194 = JagString.wrap("::");
	@ObfuscatedName("pi.S")
	public static final JagString field3334 = JagString.wrap(":clan:");
	@ObfuscatedName("jf.U")
	public static final JagString AUTO_TAG_NPCOP_CLOSE = JagString.wrap("(Y");
	@ObfuscatedName("o.Y")
	public static final JagString field2950 = JagString.wrap("mem=");
	@ObfuscatedName("d.U")
	public static final JagString AUTO_TAG_COL_FF9040_USE = JagString.wrap(" )2> <col=ff9040>");
	@ObfuscatedName("ab.o")
	public static final JagString AUTO_ASTERISK = JagString.wrap("(Z");
	@ObfuscatedName("cb.d")
	public static final JagString field399 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("od.y")
	public static final JagString field3009 = JagString.wrap(":tradereq:");
	@ObfuscatedName("dc.d")
	public static final JagString field665 = JagString.wrap(":clanreq:");
	@ObfuscatedName("ee.i")
	public static final JagString field933 = JagString.wrap("_");
	@ObfuscatedName("qa.h")
	public static final JagString AUTO_TAG_COL_00FFFF_USE = JagString.wrap(" )2> <col=00ffff>");
	@ObfuscatedName("ie.p")
	public static final JagString field1750 = JagString.wrap("rect_debug=");
	@ObfuscatedName("ga.q")
	public static final JagString AUTO_TAG_NPCOP = JagString.wrap(" (X");
	@ObfuscatedName("ma.R")
	public static final JagString field2462 = JagString.wrap("<col=00ff80>");
	@ObfuscatedName("bd.f")
	public static final JagString field241 = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("ob.j")
	public static final JagString AUTO_HUFFMAN = JagString.wrap("huffman");
	@ObfuscatedName("te.Q")
	public static final JagString field4009 = JagString.wrap("::tele 0)1");
	@ObfuscatedName("lh.V")
	public static final JagString field2400 = JagString.wrap(":assist:");
	@ObfuscatedName("of.j")
	public static final JagString AUTO_P12_FULL = JagString.wrap("p12_full");
	@ObfuscatedName("jj.y")
	public static final JagString AUTO_B12_FULL = JagString.wrap("b12_full");
	@ObfuscatedName("ud.l")
	public static final JagString field4190 = JagString.wrap("<br>(X100(U(Y");
	@ObfuscatedName("pg.Db")
	public static final JagString field3306 = JagString.wrap(": ");
	@ObfuscatedName("sd.c")
	public static final JagString field3814 = JagString.wrap("0(U");
	@ObfuscatedName("oe.i")
	public static final JagString field3025 = JagString.wrap(":duelstake:");
	@ObfuscatedName("sc.M")
	public static final JagString AUTO_P11_FULL = JagString.wrap("p11_full");
	@ObfuscatedName("oh.m")
	public static final JagString field3089 = JagString.wrap(" )2>");
	@ObfuscatedName("nd.s")
	public static final int[] field2745 = new int[1000];
	@ObfuscatedName("me.z")
	public static final JagString AUTO_TAG_COL_FF9040 = JagString.wrap("<col=ff9040>");
	@ObfuscatedName("hi.h")
	public static final JagString field1556 = JagString.wrap(":assistreq:");
	@ObfuscatedName("t.o")
	public static final JagString field3927 = JagString.wrap(":chalreq:");
	@ObfuscatedName("lj.n")
	public static final PlayerModel idkDesign = new PlayerModel();
	@ObfuscatedName("jh.h")
	public static final JagString field1928 = JagString.wrap("l");
	@ObfuscatedName("eb.Y")
	public static final JagString field891 = JagString.wrap("<col=ffffff> )4 ");
	@ObfuscatedName("eh.m")
	public static final JagString AUTO_TAG_UNK1 = JagString.wrap(")1");
	@ObfuscatedName("lf.L")
	public static final JagString field2321 = JagString.wrap("Hidden)2use");
	@ObfuscatedName("mc.b")
	public static final JagString AUTO_TAG_COL_FFFF00_USE = JagString.wrap(" )2> <col=ffff00>");
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
	@ObfuscatedName("cj.F")
	public static long loginSeed = 0L;
	@ObfuscatedName("ue.s")
	public static int ambientVolume = 127;
	@ObfuscatedName("l.T")
	public static int field2186 = 0;
	@ObfuscatedName("ka.h")
	public static boolean playingJingle = false;
	@ObfuscatedName("af.D")
	public static short[][] field96;
	@ObfuscatedName("hj.M")
	public static short[][] field1596;
	@ObfuscatedName("nd.x")
	public static short[] field2750;
	@ObfuscatedName("bb.m")
	public static short[] field219;
	@ObfuscatedName("db.z")
	public static long userhash;
	@ObfuscatedName("ob.c")
	public static SoftwarePixFont field2966;
	@ObfuscatedName("kg.fb")
	public static boolean qaOpTest = false;
	@ObfuscatedName("cf.c")
	public static int blackmarks = 0;
	@ObfuscatedName("vi.d")
	public static int underage = 0;
	@ObfuscatedName("qb.F")
	public static int mapQuickchat = 0;
	@ObfuscatedName("ha.z")
	public static JagString objSelectedName = null;
	@ObfuscatedName("kh.X")
	public static int field2127 = 0;
	@ObfuscatedName("kj.u")
	public static int waveVolume = 127;
	@ObfuscatedName("qa.j")
	public static int brightness = 3;
	@ObfuscatedName("sd.o")
	public static Pix32 mapflag;
	@ObfuscatedName("wh.T")
	public static Pix32[] field4525;
	@ObfuscatedName("hi.a")
	public static int menuX;
	@ObfuscatedName("eb.W")
	public static int menuHeight;
	@ObfuscatedName("vh.R")
	public static int menuWidth;
	@ObfuscatedName("ve.Z")
	public static int menuY;
	@ObfuscatedName("qa.n")
	public static boolean field3532 = false;
	@ObfuscatedName("kh.D")
	public static short[] clientpalette;
	@ObfuscatedName("ej.t")
	public static int idkDesignButton1 = -1;
	@ObfuscatedName("cd.c")
	public static int[] field453;
	@ObfuscatedName("cd.d")
	public static int feedbackSeed;
	@ObfuscatedName("pc.f")
	public static int idkDesignButton2 = -1;
	@ObfuscatedName("be.s")
	public static int[][] field268;
	@ObfuscatedName("d.T")
	public static short field580 = 256;
	@ObfuscatedName("a.j")
	public static long field10 = 0L;
	@ObfuscatedName("lh.X")
	public static int[] field2402;
	@ObfuscatedName("ed.k")
	public static short field921 = 205;
	@ObfuscatedName("ee.b")
	public static short field926 = 32767;
	@ObfuscatedName("ee.f")
	public static int field930 = 0;
	@ObfuscatedName("me.x")
	public static short field2527 = 1;
	@ObfuscatedName("j.j")
	public static int field1801;
	@ObfuscatedName("eb.X")
	public static int field890;
	@ObfuscatedName("u.yb")
	public static JagString settings = null;
	@ObfuscatedName("ka.f")
	public static Pix32 field2010;
	@ObfuscatedName("ac.L")
	public static JagString moveAction;
	@ObfuscatedName("mf.w")
	public static boolean regionmode = false;
	@ObfuscatedName("oh.g")
	public static short field3083 = 320;
	@ObfuscatedName("uc.i")
	public static short field4175 = 256;
	@ObfuscatedName("qa.a")
	public static long field3519 = 0L;
	@ObfuscatedName("aa.db")
	public static int nextMidiSong = -1;
	@ObfuscatedName("ff.eb")
	public static int field1150 = 0;
	@ObfuscatedName("fi.D")
	public static int midiVolume = 255;
	@ObfuscatedName("eg.w")
	public static int field941;
	@ObfuscatedName("ud.a")
	public static short field4179 = 32767;
	@ObfuscatedName("nf.Mb")
	public static final JagString AUTO_TAG_COL_00FF80_SPACE = JagString.wrap(" <col=00ff80>");
	@ObfuscatedName("db.M")
	public static final JagString AUTO_TAG_COL_FFFFFF_SPACE = JagString.wrap(" <col=ffffff>");
	@ObfuscatedName("h.r")
	public static final JagString AUTO_TAG_COL_FFFF00_SPACE = JagString.wrap(" <col=ffff00>");
	@ObfuscatedName("tb.A")
	public static final JagString AUTO_TAG_COL_CLOSE2 = JagString.wrap("(Y<)4col>");
	@ObfuscatedName("l.gb")
	public static final JagString AUTO_TAG_COL_CLOSE = JagString.wrap("<)4col>");
	@ObfuscatedName("te.Z")
	public static final JagString field4018 = JagString.wrap("m");
	@ObfuscatedName("k.S")
	public static final JagString AUTO_X = JagString.wrap(" x ");

	@ObfuscatedName("ke.b(Z)V")
	public static void errorUsage(boolean arg0) {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
		if (arg0) {
			JagString.method782(-33);
		}
	}

	@ObfuscatedName("fh.a(B)V")
	public static void setLowMem() {
		lowMem = true;
		World.lowMem = true;
	}

	@ObfuscatedName("fh.b(I)V")
	public static void setHighMem() {
		lowMem = false;
		World.lowMem = false;
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
				modegame = 0;
			} else if (arg0[6].equals("game1")) {
				modegame = 1;
			} else {
				errorUsage(false);
			}
			affid = 0;
			settings = AUTO_EMPTY;
			loginHost = "127.0.0.1";
			Client var1 = new Client();
			var1.startApplication(27, 503, 765, 500, modewhat + 32, "runescape");
			GameShell.frame.setLocation(40, 40);
		} catch (Exception var3) {
			JagException.report(null, var3);
		}
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void onKilled() {
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
			affid = Integer.parseInt(this.getParameter("affid"));
		} catch (Exception var5) {
		}
		settings = AUTO_SETTINGS.method608(this);
		if (settings == null) {
			settings = AUTO_EMPTY;
		}
		loginHost = this.getCodeBase().getHost();
		this.startCommon(modewhat + 32);
	}

	@ObfuscatedName("client.b(I)V")
	@Override
	public void maininit() {
		clientpalette = LocType.clientpalette = NpcType.clientpalette = ObjType.clientpalette = new short[256];
		if (modegame == 1) {
			field96 = RecolsStellardawn.field1810;
			field1596 = RecolsStellardawn.field3850;
			field2750 = RecolsStellardawn.field1265;
			field219 = RecolsStellardawn.field3853;
		} else {
			field219 = RecolsRunescape.field3955;
			field2750 = RecolsRunescape.field1601;
			field96 = RecolsRunescape.field4062;
			field1596 = RecolsRunescape.field2611;
		}
		loginGamePort = modewhere == 0 ? 43594 : worldid + 40000;
		loginJs5Port = modewhere == 0 ? 443 : worldid + 50000;
		loginPort = loginGamePort;
		ClientKeyboardListener.setupKeyCodeMap();
		ClientKeyboardListener.addListeners(GameShell.canvas);
		ClientMouseListener.addListeners(GameShell.canvas);
		mouseWheel = MouseWheelInterface.create();
		if (mouseWheel != null) {
			mouseWheel.addListeners(GameShell.canvas);
		}
		field941 = SignLink.field3579;
		try {
			if (GameShell.signlink.cacheDat != null) {
				GameShell.cacheDat = new BufferedRandomAccessFile(GameShell.signlink.cacheDat, 5200, 0);
				for (int var1 = 0; var1 < 27; var1++) {
					GameShell.cacheIndex[var1] = new BufferedRandomAccessFile(GameShell.signlink.cacheIndex[var1], 6000, 0);
				}
				GameShell.masterIndexFile = new BufferedRandomAccessFile(GameShell.signlink.masterIndex, 6000, 0);
				masterIndex = new DataFile(255, GameShell.cacheDat, GameShell.masterIndexFile, 500000);
				GameShell.randomDat = new BufferedRandomAccessFile(GameShell.signlink.randomDat, 24, 0);
				GameShell.signlink.cacheIndex = null;
				GameShell.signlink.masterIndex = null;
				GameShell.signlink.randomDat = null;
				GameShell.signlink.cacheDat = null;
			}
		} catch (IOException var2) {
			GameShell.masterIndexFile = null;
			GameShell.cacheDat = null;
			GameShell.randomDat = null;
			masterIndex = null;
		}
		GameShell.field2752 = Text.LOADING_TITLE;
		if (modewhere != 0) {
			showFps = true;
		}
	}

	@ObfuscatedName("client.c(B)V")
	@Override
	public void mainloop() {
		loopCycle++;
		if (loopCycle % 1000 == 1) {
			GregorianCalendar var1 = new GregorianCalendar();
			feedbackSeed = var1.get(Calendar.HOUR_OF_DAY) * 600 + var1.get(Calendar.MINUTE) * 10 + var1.get(Calendar.SECOND) / 6;
			feedbackRand.setSeed((long) feedbackSeed);
		}
		this.serviceNetClient();
		Js5NetThread.processCompleted();
		MidiManager.updateFadeOut();
		doAudio();
		ClientKeyboardListener.cycle();
		ClientMouseListener.cycle();
		if (mouseWheel != null) {
			int var2 = mouseWheel.getRotation();
			mouseWheelRotation = var2;
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

	@ObfuscatedName("client.e(I)V")
	@Override
	public void mainredraw() {
		boolean var1 = false;
		boolean var2 = MidiManager.updateLoading();
		if (var2 && playingJingle && midiPlayer != null) {
			midiPlayer.play();
		}
		if (GameShell.fullredraw) {
			var1 = true;
			GameShell.fullredraw = false;
		}
		if (state == 0) {
			GameShell.drawProgress(null, TitleScreen.loadString, var1, TitleScreen.loadPos);
		} else if (state == 5 || state == 10 || state == 20) {
			TitleScreen.draw(p11, b12);
		} else if (state == 25) {
			if (field3861 == 1) {
				if (field3754 > field2751) {
					field2751 = field3754;
				}
				int var4 = (field2751 - field3754) * 50 / field2751;
				messageBox(JagString.join(new JagString[] { Text.LOADING, field509, JagString.parseInt(var4), field216 }), false);
			} else if (field3861 == 2) {
				if (field2045 > field2652) {
					field2652 = field2045;
				}
				int var3 = (field2652 - field2045) * 50 / field2652 + 50;
				messageBox(JagString.join(new JagString[] { Text.LOADING, field509, JagString.parseInt(var3), field216 }), false);
			} else {
				messageBox(Text.LOADING, false);
			}
		} else if (state == 30) {
			gameDraw();
		} else if (state == 40) {
			messageBox(JagString.join(new JagString[] { Text.CONLOST, AUTO_TAG_BR, Text.ATTEMPT_TO_REESTABLISH }), false);
		}
		Canvas var5 = GameShell.canvas;
		if (state == 30 && componentRectDebug == 0 && !var1) {
			try {
				Graphics var8 = var5.getGraphics();
				for (int var9 = 0; var9 < componentDrawCount; var9++) {
					if (componentBlitArea[var9]) {
						GameShell.drawArea.draw(componentDrawHeight[var9], componentDrawWidth[var9], componentDrawY[var9], componentDrawX[var9], var8);
						componentBlitArea[var9] = false;
					}
				}
			} catch (Exception var10) {
				var5.repaint();
			}
		} else if (state > 0) {
			try {
				Graphics var6 = var5.getGraphics();
				GameShell.drawArea.draw(var6);
				for (int var7 = 0; var7 < componentDrawCount; var7++) {
					componentBlitArea[var7] = false;
				}
			} catch (Exception var11) {
				var5.repaint();
			}
		}
	}

	@ObfuscatedName("client.d(I)V")
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
		ClientKeyboardListener.removeListeners(GameShell.canvas);
		ClientMouseListener.removeListeners(GameShell.canvas);
		if (mouseWheel != null) {
			mouseWheel.removeListeners(GameShell.canvas);
		}
		ClientKeyboardListener.shutdown();
		ClientMouseListener.shutdown();
		mouseWheel = null;
		if (midiPlayer != null) {
			midiPlayer.shutdown();
		}
		if (synthPlayer != null) {
			synthPlayer.shutdown();
		}
		Js5Net.close();
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
			if (GameShell.masterIndexFile != null) {
				GameShell.masterIndexFile.close();
			}
			if (GameShell.randomDat != null) {
				GameShell.randomDat.close();
			}
		} catch (IOException var2) {
		}
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

	@ObfuscatedName("client.a(Z)V")
	public void serviceNetClient() {
		if (state != 1000) {
			boolean var1 = Js5Net.loop();
			if (!var1) {
				this.js5connect();
			}
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
			Js5Net.ioErrorCount = 3;
			js5ConnectCooldown = 3000;
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
				var1.p4(500);
				js5Stream.write(5, var1.data);
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
				Js5Net.init(state > 20, js5Stream);
				js5ConnectState = 0;
				js5Errors = 0;
				js5SocketReq = null;
				js5Stream = null;
			}
		} catch (IOException var3) {
			this.js5error(-3);
		}
	}

	@ObfuscatedName("client.b(II)V")
	public void js5error(int arg0) {
		js5SocketReq = null;
		js5ConnectState = 0;
		js5Stream = null;
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

	@ObfuscatedName("client.d(B)V")
	public void mainLoad() {
		if (loadingStep == 0) {
			Runtime var1 = Runtime.getRuntime();
			int var2 = (int) ((var1.totalMemory() - var1.freeMemory()) / 1024L);
			long var3 = MonotonicTime.currentTime();
			if (field10 == 0L) {
				field10 = var3;
			}
			if (var2 > 16384 && var3 - field10 < 5000L) {
				if (var3 - field3519 > 1000L) {
					System.gc();
					field3519 = var3;
				}
				TitleScreen.loadPos = 5;
				TitleScreen.loadString = Text.field1093;
			} else {
				loadingStep = 10;
				TitleScreen.loadPos = 5;
				TitleScreen.loadString = Text.field3549;
			}
		} else if (loadingStep == 10) {
			World.init();
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
			TitleScreen.loadString = Text.MAINLOAD30;
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
				TitleScreen.loadString = Text.MAINLOAD40B;
				TitleScreen.getGroupIds(songs, binary, sprites);
				loadingStep = 45;
			} else {
				if (var32 != 0) {
					TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD40, JagString.parseInt(var32), SUB_PCT});
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
			TitleScreen.loadString = Text.MAINLOAD45;
			TitleScreen.loadPos = 30;
		} else if (loadingStep == 50) {
			int var34 = 0;
			if (sprites.requestDownload(AUTO_P11_FULL)) {
				var34++;
			}
			if (sprites.requestDownload(AUTO_P12_FULL)) {
				var34++;
			}
			if (sprites.requestDownload(AUTO_B12_FULL)) {
				var34++;
			}
			if (fontmetrics.requestDownload(AUTO_P11_FULL)) {
				var34++;
			}
			if (fontmetrics.requestDownload(AUTO_P12_FULL)) {
				var34++;
			}
			if (fontmetrics.requestDownload(AUTO_B12_FULL)) {
				var34++;
			}
			if (var34 < 6) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD50, JagString.parseInt(var34 * 100 / 6), SUB_PCT});
				TitleScreen.loadPos = 35;
			} else {
				TitleScreen.loadPos = 35;
				loadingStep = 60;
				TitleScreen.loadString = Text.MAINLOAD50B;
			}
		} else if (loadingStep == 60) {
			int var35 = TitleScreen.ready(binary, sprites);
			int var36 = TitleScreen.readyMax();
			if (var35 < var36) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD60, JagString.parseInt(var35 * 100 / var36), SUB_PCT});
				TitleScreen.loadPos = 40;
			} else {
				TitleScreen.loadPos = 40;
				TitleScreen.loadString = Text.MAINLOAD60B;
				loadingStep = 65;
			}
		} else if (loadingStep == 65) {
			p11 = PixLoader.makePixFont(fontmetrics, sprites, AUTO_EMPTY, AUTO_P11_FULL);
			field2966 = (SoftwarePixFont) p11;
			p12 = PixLoader.makePixFont(fontmetrics, sprites, AUTO_EMPTY, AUTO_P12_FULL);
			b12 = PixLoader.makePixFont(fontmetrics, sprites, AUTO_EMPTY, AUTO_B12_FULL);
			TitleScreen.loadPos = 45;
			TitleScreen.loadString = Text.field24;
			setMainState(5);
			loadingStep = 70;
		} else if (loadingStep == 70) {
			configs.requestFullDownload();
			int var37 = configs.getTotalLoadProgress();
			configLoc.requestFullDownload();
			int var38 = var37 + configLoc.getTotalLoadProgress();
			configEnum.requestFullDownload();
			int var39 = var38 + configEnum.getTotalLoadProgress();
			configNpc.requestFullDownload();
			int var40 = var39 + configNpc.getTotalLoadProgress();
			configObj.requestFullDownload();
			int var41 = var40 + configObj.getTotalLoadProgress();
			configSeq.requestFullDownload();
			int var42 = var41 + configSeq.getTotalLoadProgress();
			configSpot.requestFullDownload();
			int var43 = var42 + configSpot.getTotalLoadProgress();
			configVarbit.requestFullDownload();
			int var44 = var43 + configVarbit.getTotalLoadProgress();
			quickchat.requestFullDownload();
			int var45 = var44 + quickchat.getTotalLoadProgress();
			quickchatGlobal.requestFullDownload();
			int var46 = var45 + quickchatGlobal.getTotalLoadProgress();
			if (var46 < 1000) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD70, JagString.parseInt(var46 / 10), SUB_PCT});
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
				TitleScreen.loadString = Text.MAINLOAD70B;
				TitleScreen.loadPos = 50;
				ObjType.method1416();
				loadingStep = 80;
			}
		} else if (loadingStep == 80) {
			int var47 = 0;
			if (compass == null) {
				SoftwarePix32 var48 = PixLoader.makeSoftwarePix32(AUTO_COMPASS, sprites, AUTO_EMPTY);
				if (var48 != null) {
					var48.trim();
					compass = var48;
				}
			} else {
				var47++;
			}
			if (mapscene == null) {
				mapscene = PixLoader.makeSoftwarePix8Array(AUTO_MAPSCENE, AUTO_EMPTY, sprites);
			} else {
				var47++;
			}
			if (mapfunction == null) {
				mapfunction = PixLoader.makeSoftwarePix32Array(AUTO_MAPFUNCTION, AUTO_EMPTY, sprites);
			} else {
				var47++;
			}
			if (hitmarks == null) {
				hitmarks = PixLoader.makePix32Array(AUTO_HITMARKS, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (headiconsPk == null) {
				headiconsPk = PixLoader.makePix32Array(AUTO_HEADICONSPK, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (headiconsPrayer == null) {
				headiconsPrayer = PixLoader.makePix32Array(AUTO_HEADICONSPRAYER, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (headiconsHint == null) {
				headiconsHint = PixLoader.makePix32Array(AUTO_HEADICONSHINT, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (hintMapmarkers == null) {
				hintMapmarkers = PixLoader.makePix32Array(AUTO_HINTMAPMARKERS, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (hintMapedge == null) {
				SoftwarePix32[] var49 = PixLoader.makeSoftwarePix32Array(AUTO_HINTMAPEDGE, AUTO_EMPTY, sprites);
				if (var49 != null) {
					for (int var50 = 0; var50 < var49.length; var50++) {
						var49[var50].trim();
					}
					hintMapedge = var49;
				}
			} else {
				var47++;
			}
			if (mapflag == null) {
				mapflag = PixLoader.makePix32(AUTO_MAPFLAG, AUTO_EMPTY, sprites);
			} else {
				var47++;
			}
			if (cross == null) {
				cross = PixLoader.makePix32Array(AUTO_CROSS, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (mapdots == null) {
				mapdots = PixLoader.makePix32Array(AUTO_MAPDOTS, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (scrollbar == null) {
				scrollbar = PixLoader.makePix8Array(AUTO_SCROLLBAR, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			if (modIcons == null) {
				modIcons = PixLoader.makePix8Array(AUTO_MODICONS, sprites, AUTO_EMPTY);
			} else {
				var47++;
			}
			var47++;
			if (var47 < 15) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD80, JagString.parseInt(var47 * 100 / 15), SUB_PCT});
				TitleScreen.loadPos = 60;
			} else {
				int var51 = (int) (Math.random() * 21.0D) - 10;
				int var52 = (int) (Math.random() * 21.0D) - 10;
				int var53 = (int) (Math.random() * 21.0D) - 10;
				p11.setIcons(modIcons, null);
				p12.setIcons(modIcons, null);
				int var54 = (int) (Math.random() * 41.0D) - 20;
				b12.setIcons(modIcons, null);
				for (int var55 = 0; var55 < mapfunction.length; var55++) {
					mapfunction[var55].rgbAdjust(var54 + var51, var54 + var53, var54 + var52);
				}
				mapscene[0].rgbAdjust(var51 + var54, var54 + var53, var54 + var52);
				TitleScreen.loadPos = 60;
				loadingStep = 90;
				field4525 = mapfunction;
				TitleScreen.loadString = Text.MAINLOAD80B;
			}
		} else if (loadingStep == 90) {
			if (materials.requestFullDownload()) {
				TextureManager var56 = new TextureManager(textures, materials, sprites, 20, lowMem);
				Pix3D.setTextures(var56);
				Pix3D.initColourTable(0.7F);
				TitleScreen.loadString = Text.MAINLOAD90B;
				loadingStep = 110;
				TitleScreen.loadPos = 70;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD90, JagString.parseInt(materials.getTotalLoadProgress()), SUB_PCT});
				TitleScreen.loadPos = 70;
			}
		} else if (loadingStep == 110) {
			mouseTracking = new MouseTracking();
			GameShell.signlink.threadreq(mouseTracking, 10);
			TitleScreen.loadString = Text.MAINLOAD110;
			TitleScreen.loadPos = 75;
			loadingStep = 120;
		} else if (loadingStep == 120) {
			if (binary.requestDownload(AUTO_HUFFMAN, AUTO_EMPTY)) {
				Huffman var57 = new Huffman(binary.getFile(AUTO_HUFFMAN, AUTO_EMPTY));
				WordPack.setHuffman(var57);
				loadingStep = 130;
				TitleScreen.loadString = Text.MAINLOAD120B;
				TitleScreen.loadPos = 80;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD120, field3814 });
				TitleScreen.loadPos = 80;
			}
		} else if (loadingStep == 130) {
			if (!interfaces.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(interfaces.getTotalLoadProgress() * 4 / 5), SUB_PCT});
				TitleScreen.loadPos = 85;
			} else if (!scripts.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(scripts.getTotalLoadProgress() / 6 + 80), SUB_PCT});
				TitleScreen.loadPos = 85;
			} else if (fontmetrics.requestFullDownload()) {
				TitleScreen.loadPos = 100;
				loadingStep = 140;
				TitleScreen.loadString = Text.MAINLOAD130B;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[] { Text.MAINLOAD130, JagString.parseInt(fontmetrics.getTotalLoadProgress() / 20 + 96), SUB_PCT});
				TitleScreen.loadPos = 85;
			}
		} else if (loadingStep == 140) {
			maps.discardNames(false);
			songs.discardNames(true);
			sprites.discardNames(true);
			fontmetrics.discardNames(true);
			binary.discardNames(true);
			interfaces.discardNames(true);
			setMainState(10);
		}
	}

	@ObfuscatedName("j.a(BIZZZ)Lbj;")
	public static Js5Loader openJs5(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (GameShell.cacheDat != null) {
			var4 = new DataFile(arg0, GameShell.cacheDat, GameShell.cacheIndex[arg0], 1000000);
		}
		return new Js5Loader(var4, masterIndex, arg0, arg3, arg2, arg1);
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
					loginSocketReq = signlink.socketreq(loginHost, loginPort);
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
				long var0 = userhash = TitleScreen.loginUser.toUserhash();
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
					midiPlayer.skipNextAcceptedCheck();
				}
				if (synthPlayer != null) {
					synthPlayer.skipNextAcceptedCheck();
				}
				int var3 = stream.read();
				if (midiPlayer != null) {
					midiPlayer.skipNextAcceptedCheck();
				}
				if (synthPlayer != null) {
					synthPlayer.skipNextAcceptedCheck();
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
				loginout.p1(out.pos + Packet.pjstrlen(settings) + 141);
				loginout.p4(500);
				loginout.p1(lowMem ? 1 : 0);
				GameShell.pushUID192(loginout);
				loginout.pjstr(settings);
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
				TitleScreen.loginMes(JagString.join(new JagString[] { JagString.parseInt(loginHopTimer / 60), Text.LOGINHOP_C }), Text.LOGINHOP_A, Text.LOGINHOP_B);
				if (--loginHopTimer <= 0) {
					loginStep = 0;
				}
			} else {
				if (loginStep == 9 && stream.available() >= 9) {
					staffmodlevel = stream.read();
					blackmarks = stream.read();
					underage = stream.read();
					if (underage == 1) {
						try {
							zap.browserCall(signlink.applet);
						} catch (Throwable var9) {
						}
					} else {
						try {
							unzap.browserCall(signlink.applet);
						} catch (Throwable var8) {
						}
					}
					mapQuickchat = stream.read();
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

	@ObfuscatedName("kg.f(I)V")
	public static void gameLoop() {
		if (rebootTimer > 1) {
			rebootTimer--;
			miscTransmitNum = transmitNum;
		}
		if (logoutTimer > 0) {
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
		synchronized (mouseTracking.lock) {
			if (!mouseTracked) {
				mouseTracking.length = 0;
			} else if (ClientMouseListener.mouseClickButton != 0 || mouseTracking.length >= 40) {
				// EVENT_MOUSE_MOVE
				out.p1Enc(111);
				out.p1(0);
				int var2 = out.pos;
				int var3 = 0;
				for (int var4 = 0; var4 < mouseTracking.length && out.pos - var2 < 240; var4++) {
					var3++;
					int var5 = mouseTracking.y[var4];
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 502) {
						var5 = 502;
					}
					int var6 = mouseTracking.x[var4];
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
					if (var6 != mouseTrackedX || mouseTrackedY != var5) {
						int var8 = var5 - mouseTrackedY;
						mouseTrackedY = var5;
						int var9 = var6 - mouseTrackedX;
						mouseTrackedX = var6;
						if (mouseTrackedDelta < 8 && var9 >= -32 && var9 <= 31 && var8 >= -32 && var8 <= 31) {
							var8 += 32;
							var9 += 32;
							out.p2(var8 + (mouseTrackedDelta << 12) + (var9 << 6));
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
				out.method341(out.pos - var2);
				if (var3 < mouseTracking.length) {
					mouseTracking.length -= var3;
					for (int var10 = 0; var10 < mouseTracking.length; var10++) {
						mouseTracking.x[var10] = mouseTracking.x[var10 + var3];
						mouseTracking.y[var10] = mouseTracking.y[var10 + var3];
					}
				} else {
					mouseTracking.length = 0;
				}
			}
		}
		if (ClientMouseListener.mouseClickButton != 0) {
			long var11 = (ClientMouseListener.mouseClickTime - prevMouseClickTime) / 50L;
			prevMouseClickTime = ClientMouseListener.mouseClickTime;
			int var13 = ClientMouseListener.mouseClickY;
			int var14 = ClientMouseListener.mouseClickX;
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
			if (ClientMouseListener.mouseClickButton == 2) {
				var15 = 1;
			}
			// EVENT_MOUSE_CLICK
			out.p1Enc(63);
			int var17 = (int) var11;
			out.p4_alt2((var15 << 19) + ((var17 << 20) + var16));
		}
		if (ClientKeyboardListener.keyHeld[96] || ClientKeyboardListener.keyHeld[97] || ClientKeyboardListener.keyHeld[98] || ClientKeyboardListener.keyHeld[99]) {
			sendCamera = true;
		}
		if (sendCameraDelay > 0) {
			sendCameraDelay--;
		}
		if (sendCamera && sendCameraDelay <= 0) {
			sendCamera = false;
			sendCameraDelay = 20;
			// EVENT_CAMERA_POSITION
			out.p1Enc(173);
			out.p2_alt2(orbitCameraYaw);
			out.p2(orbitCameraPitch);
		}
		if (GameShell.focus && !focusIn) {
			focusIn = true;
			// EVENT_APPLET_FOCUS
			out.p1Enc(130);
			out.p1(1);
		}
		if (!GameShell.focus && focusIn) {
			focusIn = false;
			// EVENT_APPLET_FOCUS
			out.p1Enc(130);
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
		if (WorldMap.mapCom != null) {
			WorldMap.loop();
		}
		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		worldUpdateNum++;
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
			if (ClientMouseListener.mouseX > objGrabX + 5 || objGrabX - 5 > ClientMouseListener.mouseX || ClientMouseListener.mouseY > objGrabY + 5 || objGrabY - 5 > ClientMouseListener.mouseY) {
				objGrabThreshold = true;
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (objGrabThreshold && objDragCycles >= 5) {
					if (objDragCom == hoveredSlotCom && objDragSlot != hoveredSlot) {
						IfType var18 = objDragCom;
						byte var19 = 0;
						if (bankArrangeMode == 1 && var18.clientCode == 206) {
							var19 = 1;
						}
						if (var18.linkObjType[hoveredSlot] <= 0) {
							var19 = 0;
						}
						if (ServerActive.isObjReplaceEnabled(getActive(var18))) {
							int var20 = objDragSlot;
							int var21 = hoveredSlot;
							var18.linkObjType[var21] = var18.linkObjType[var20];
							var18.linkObjNumber[var21] = var18.linkObjNumber[var20];
							var18.linkObjType[var20] = -1;
							var18.linkObjNumber[var20] = 0;
						} else if (var19 == 1) {
							int var22 = objDragSlot;
							int var23 = hoveredSlot;
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
							var18.swapSlots(hoveredSlot, objDragSlot);
						}
						// INV_BUTTOND
						out.p1Enc(207);
						out.p4_alt1(objDragCom.parentId);
						out.p2_alt1(objDragSlot);
						out.p1_alt3(var19);
						out.p2_alt3(hoveredSlot);
					}
				} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					openMenu();
				} else if (menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}
				ClientMouseListener.mouseClickButton = 0;
				selectedCycle = 10;
				objDragCom = null;
			}
		}
		keypresses = 0;
		dragParentFound = false;
		dropCom = null;
		IfType var24 = tooltipCom;
		IfType var25 = overCom;
		overCom = null;
		dragging = false;
		tooltipCom = null;
		while (ClientKeyboardListener.pollKey() && keypresses < 128) {
			keypressKeycodes[keypresses] = ClientKeyboardListener.code;
			keypressKeychars[keypresses] = ClientKeyboardListener.ch;
			keypresses++;
		}
		WorldMap.mapCom = null;
		if (toplevelinterface != -1) {
			loopInterface(0, sHei, 0, 0, sWid, toplevelinterface, 0);
		}
		transmitNum++;
		while (true) {
			HookReq var26;
			IfType var27;
			IfType var28;
			do {
				var26 = (HookReq) hookRequestsTimer.popFront();
				if (var26 == null) {
					while (true) {
						HookReq var29;
						IfType var30;
						IfType var31;
						do {
							var29 = (HookReq) hookRequestsMouseStop.popFront();
							if (var29 == null) {
								while (true) {
									HookReq var32;
									IfType var33;
									IfType var34;
									do {
										var32 = (HookReq) hookRequests.popFront();
										if (var32 == null) {
											if (field3532 && WorldMap.mapCom == null) {
												field3532 = false;
											}
											if (dragCom != null) {
												loopIf3Drag();
											}
											if (World.groundX != -1) {
												int var35 = World.groundX;
												int var36 = World.groundZ;
												boolean var37 = tryMove(0, 0, var36, var35, localPlayer.routeX[0], 0, 0, 0, true, 0, localPlayer.routeZ[0]);
												World.groundX = -1;
												if (var37) {
													crossX = ClientMouseListener.mouseClickX;
													crossCycle = 0;
													crossY = ClientMouseListener.mouseClickY;
													crossMode = 1;
												}
											}
											mouseLoop();
											if (var25 != overCom) {
												if (var25 != null) {
													componentUpdated(var25);
												}
												if (overCom != null) {
													componentUpdated(overCom);
												}
											}
											if (var24 != tooltipCom && tooltipRedraw == tooltipNum) {
												if (var24 != null) {
													componentUpdated(var24);
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
												if (tooltipRedraw == tooltipNum) {
													componentUpdated(tooltipCom);
												}
											}
											followCamera();
											if (cinemaCam) {
												cinemaCamera();
											}
											for (int var38 = 0; var38 < 5; var38++) {
												int var10002 = camShakeCycle[var38]++;
											}
											int var39 = ClientMouseListener.getIdleTimer();
											int var40 = ClientKeyboardListener.getIdleTimer();
											if (var39 > 4500 && var40 > 4500) {
												logoutTimer = 250;
												ClientMouseListener.setIdleTimer(4000);
												// IDLE_TIMER
												out.p1Enc(226);
											}
											macroCameraCycle++;
											macroMinimapCycle++;
											noTimeoutTimer++;
											if (macroCameraCycle > 500) {
												macroCameraCycle = 0;
												int var41 = (int) (Math.random() * 8.0D);
												if ((var41 & 0x4) == 4) {
													macroCameraAngle += macroCameraAngleModifier;
												}
												if ((var41 & 0x2) == 2) {
													macroCameraZ += macroCameraZModifier;
												}
												if ((var41 & 0x1) == 1) {
													macroCameraX += macroCameraXModifier;
												}
											}
											if (macroMinimapCycle > 500) {
												macroMinimapCycle = 0;
												int var42 = (int) (Math.random() * 8.0D);
												if ((var42 & 0x2) == 2) {
													macroMinimapZoom += macroMinimapZoomModifier;
												}
												if ((var42 & 0x1) == 1) {
													macroMinimapAngle += macroMinimapAngleModifier;
												}
											}
											if (macroMinimapZoom < -20) {
												macroMinimapZoomModifier = 1;
											}
											if (macroMinimapZoom > 10) {
												macroMinimapZoomModifier = -1;
											}
											if (macroCameraZ < -55) {
												macroCameraZModifier = 2;
											}
											if (macroMinimapAngle < -60) {
												macroMinimapAngleModifier = 2;
											}
											if (macroCameraAngle < -40) {
												macroCameraAngleModifier = 1;
											}
											if (macroCameraZ > 55) {
												macroCameraZModifier = -2;
											}
											if (macroCameraAngle > 40) {
												macroCameraAngleModifier = -1;
											}
											if (macroMinimapAngle > 60) {
												macroMinimapAngleModifier = -2;
											}
											if (macroCameraX < -50) {
												macroCameraXModifier = 2;
											}
											if (macroCameraX > 50) {
												macroCameraXModifier = -2;
											}
											if (noTimeoutTimer > 50) {
												// NO_TIMEOUT
												out.p1Enc(19);
											}
											try {
												if (stream != null && out.pos > 0) {
													stream.write(out.pos, out.data);
													out.pos = 0;
													noTimeoutTimer = 0;
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
										var34 = IfType.get(var33.layerId);
									} while (var34 == null || var34.subcomponents == null || var33.subId >= var34.subcomponents.length || var34.subcomponents[var33.subId] != var33);
									ScriptRunner.executeScript(var32);
								}
							}
							var30 = var29.component;
							if (var30.subId < 0) {
								break;
							}
							var31 = IfType.get(var30.layerId);
						} while (var31 == null || var31.subcomponents == null || var31.subcomponents.length <= var30.subId || var31.subcomponents[var30.subId] != var30);
						ScriptRunner.executeScript(var29);
					}
				}
				var27 = var26.component;
				if (var27.subId < 0) {
					break;
				}
				var28 = IfType.get(var27.layerId);
			} while (var28 == null || var28.subcomponents == null || var28.subcomponents.length <= var27.subId || var27 != var28.subcomponents[var27.subId]);
			ScriptRunner.executeScript(var26);
		}
	}

	@ObfuscatedName("wf.b(I)V")
	public static void gameDraw() {
		if (!isMenuOpen) {
			menuAction[0] = 1007;
			menuVerb[0] = Text.CANCEL;
			menuNumEntries = 1;
			menuSubject[0] = AUTO_EMPTY;
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
		hoveredSlotCom = null;
		menuMouseY = -1;
		componentDrawTime = loopCycle;
		menuMouseX = -1;
		if (toplevelinterface != -1) {
			componentDrawCount = 0;
			drawInterface(sHei, toplevelinterface, 0, -1, 0, 0, 0, sWid);
		}
		Pix2D.resetClipping();
		sortMinimenu();
		if (isMenuOpen) {
			drawMinimenu();
		} else if (menuMouseY != -1) {
			drawFeedback(menuMouseX, menuMouseY);
		}
		if (componentRectDebug == 3) {
			for (int var1 = 0; var1 < componentDrawCount; var1++) {
				if (componentRedraw[var1]) {
					Pix2D.fillRectTrans(componentDrawX[var1], componentDrawY[var1], componentDrawWidth[var1], componentDrawHeight[var1], 16711935, 128);
				} else if (componentBlitArea[var1]) {
					Pix2D.fillRectTrans(componentDrawX[var1], componentDrawY[var1], componentDrawWidth[var1], componentDrawHeight[var1], 16711680, 128);
				}
			}
		}
		BgSound.doMix(localPlayer.z, worldUpdateNum, localPlayer.x, minusedlevel);
		worldUpdateNum = 0;
	}

	@ObfuscatedName("jh.a(I)V")
	public static void loginDone() {
		prevMouseClickTime = 0L;
		mouseTracking.length = 0;
		mouseTrackedDelta = 0;
		focusIn = true;
		GameShell.focus = true;
		ReflectionChecker.reset();
		ptype2 = -1;
		out.pos = 0;
		ptype1 = -1;
		logoutTimer = 0;
		ptype0 = -1;
		rebootTimer = 0;
		timeoutTimer = 0;
		ptype = -1;
		in.pos = 0;
		for (int var0 = 0; var0 < field1171.length; var0++) {
			field1171[var0] = null;
		}
		menuNumEntries = 0;
		isMenuOpen = false;
		ClientMouseListener.setIdleTimer(0);
		for (int var1 = 0; var1 < 100; var1++) {
			chatText[var1] = null;
		}
		chatHistoryLength = 0;
		minimapFlagZ = 0;
		macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
		minimapFlagX = 0;
		macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
		playerCount = 0;
		macroCameraZ = (int) (Math.random() * 110.0D) - 55;
		orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		waveCount = 0;
		minimapState = 0;
		macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
		macroCameraX = (int) (Math.random() * 100.0D) - 50;
		targetMode = false;
		minimapLevel = -1;
		npcCount = 0;
		useMode = 0;
		for (int var2 = 0; var2 < 2048; var2++) {
			players[var2] = null;
			playerAppearanceBuffer[var2] = null;
		}
		for (int var3 = 0; var3 < 32768; var3++) {
			npc[var3] = null;
		}
		localPlayer = players[2047] = new ClientPlayer();
		projectiles.clear();
		spotanims.clear();
		for (int var4 = 0; var4 < 4; var4++) {
			for (int var5 = 0; var5 < 104; var5++) {
				for (int var6 = 0; var6 < 104; var6++) {
					groundObj[var4][var5][var6] = null;
				}
			}
		}
		locChanges = new LinkList();
		friendCount = 0;
		friendServerStatus = 0;
		for (int var7 = 0; var7 < VarpType.numDefinitions; var7++) {
			VarpType var8 = VarpType.list(var7);
			if (var8 != null && var8.clientcode == 0) {
				VarCache.varServ[var7] = 0;
				VarCache.var[var7] = 0;
			}
		}
		for (int var9 = 0; var9 < VarCache.varcInt.length; var9++) {
			VarCache.varcInt[var9] = -1;
		}
		if (toplevelinterface != -1) {
			IfType.unloadInterface(toplevelinterface);
		}
		for (SubInterface var10 = (SubInterface) subinterfaces.search(); var10 != null; var10 = (SubInterface) subinterfaces.findnext()) {
			closeSubInterface(var10, true);
		}
		toplevelinterface = -1;
		subinterfaces = new HashTable(8);
		menuNumEntries = 0;
		resumePauseCom = null;
		isMenuOpen = false;
		idkDesign.setAppearance(-1, null, new int[5], false);
		for (int var11 = 0; var11 < 8; var11++) {
			playerOp[var11] = null;
			playerOpPriority[var11] = false;
		}
		ClientInvCache.deleteAll();
		js5Loading = true;
		for (int var12 = 0; var12 < 100; var12++) {
			componentDirtyArea[var12] = true;
		}
		friendChatCount = 0;
		chatDisplayName = null;
		friendChatList = null;
		for (int var13 = 0; var13 < 6; var13++) {
			field140[var13] = new StockMarketSlot();
		}
		for (int var14 = 0; var14 < 25; var14++) {
			statEffectiveLevel[var14] = 0;
			statBaseLevel[var14] = 0;
			statXP[var14] = 0;
		}
		clientpalette = LocType.clientpalette = NpcType.clientpalette = ObjType.clientpalette = new short[256];
		sendCamera = true;
		moveAction = Text.WALKHERE;
	}

	@ObfuscatedName("fa.b(II)V")
	public static void loginError(int arg0) {
		if (arg0 == -3) {
			TitleScreen.loginMes(Text.field1273, Text.LOGINM3_A, Text.LOGINM3_B);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.field1274, Text.field1294, Text.LOGINM2_B);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.field1271, Text.LOGINM1_A, Text.LOGINM1_B);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.field1297, Text.field1268, Text.LOGIN3_B);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.field1291, Text.LOGIN4_A, Text.LOGIN4_B);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.field1305, Text.LOGIN5_A, Text.LOGIN5_B);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.field1266, Text.LOGIN6_A, Text.LOGIN6_B);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.field1302, Text.LOGIN7_A, Text.LOGIN7_B);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.field1267, Text.LOGIN8_A, Text.LOGIN8_B);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.field1293, Text.LOGIN9_A, Text.LOGIN9_B);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.field1280, Text.LOGIN10_A, Text.LOGIN10_B);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.field1286, Text.LOGIN11_A, Text.LOGIN11_B);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.field1282, Text.LOGIN12_A, Text.LOGIN12_B);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.field1299, Text.LOGIN13_A, Text.LOGIN13_B);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.field1300, Text.LOGIN14_A, Text.LOGIN14_B);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.field1278, Text.LOGIN16_A, Text.LOGIN16_B);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.field1272, Text.LOGIN17_A, Text.LOGIN17_B);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.field1287, Text.LOGIN18_A, Text.LOGIN18_B);
		} else if (arg0 == 19) {
			TitleScreen.loginMes(Text.field4317, Text.LOGIN19_A, Text.LOGIN19_B);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.field1289, Text.LOGIN20_A, Text.LOGIN20_B);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.field1284, Text.LOGIN22_A, Text.LOGIN22_B);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.field1269, Text.LOGIN23_A, Text.LOGIN23_B);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.field1303, Text.LOGIN24_A, Text.LOGIN24_B);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.field1283, Text.LOGIN25_A, Text.LOGIN25_B);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.field1301, Text.LOGIN26_A, Text.LOGIN26_B);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.field1279, Text.field1296, Text.field3112);
		} else {
			TitleScreen.loginMes(Text.field1304, Text.LOGINMIS_A, Text.LOGINMIS_B);
		}
		setMainState(10);
	}

	@ObfuscatedName("mg.b(Z)V")
	public static void reconnectDone() {
		ptype2 = -1;
		rebootTimer = 0;
		ptype = -1;
		out.pos = 0;
		timeoutTimer = 0;
		menuNumEntries = 0;
		minimapState = 0;
		ptype0 = -1;
		in.pos = 0;
		psize = 0;
		ptype1 = -1;
		minimapFlagX = 0;
		isMenuOpen = false;
		for (int var0 = 0; var0 < players.length; var0++) {
			if (players[var0] != null) {
				players[var0].targetId = -1;
			}
		}
		for (int var1 = 0; var1 < npc.length; var1++) {
			if (npc[var1] != null) {
				npc[var1].targetId = -1;
			}
		}
		ClientInvCache.deleteAll();
		setMainState(30);
		for (int var2 = 0; var2 < 100; var2++) {
			componentDirtyArea[var2] = true;
		}
	}

	@ObfuscatedName("kf.a(B)V")
	public static void logout() {
		if (stream != null) {
			stream.close();
			stream = null;
		}
		clearCaches();
		World.resetMap();
		for (int var0 = 0; var0 < 4; var0++) {
			collision[var0].reset();
		}
		WorldMap.reset();
		System.gc();
		MidiManager.stop2();
		playingJingle = false;
		nextMidiSong = -1;
		BgSound.reset();
		setMainState(10);
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
		binary.discardAllFiles();
		jingles.discardAllFiles();
		scripts.discardAllFiles();
	}

	@ObfuscatedName("se.b(I)V")
	public static void lostCon() {
		if (logoutTimer > 0) {
			logout();
		} else {
			setMainState(40);
			prevStream = stream;
			stream = null;
		}
	}

	@ObfuscatedName("ua.a(I)V")
	public static void doAudio() {
		if (synthPlayer != null) {
			synthPlayer.cycle();
		}
		if (midiPlayer != null) {
			midiPlayer.cycle();
		}
	}

	@ObfuscatedName("fd.a(IZIIILk;)V")
	public static void triggerSeqSound(boolean arg0, int arg1, int arg2, int arg3, SeqType arg4) {
		if (waveCount >= 50 || (arg4.sound == null || arg4.sound.length < 1 || arg2 >= arg4.sound.length || arg4.sound[arg2] == null)) {
			return;
		}
		int var5 = arg4.sound[arg2][0];
		int var6 = var5 >> 8;
		int var7 = var5 >> 4 & 0x7;
		int var8 = var5 & 0xF;
		if (arg4.sound[arg2].length > 1) {
			int var9 = (int) (Math.random() * (double) arg4.sound[arg2].length);
			if (var9 > 0) {
				var6 = arg4.sound[arg2][var9];
			}
		}
		if (var8 == 0) {
			if (arg0) {
				playSynth(var7, 0, var6);
			}
		} else if (ambientVolume != 0) {
			waveSoundIds[waveCount] = var6;
			waveLoops[waveCount] = var7;
			waveDelay[waveCount] = 0;
			int var10 = (arg3 - 64) / 128;
			waveSounds[waveCount] = null;
			int var11 = (arg1 - 64) / 128;
			waveAmbient[waveCount] = (var10 << 16) + (var11 << 8) + var8;
			waveCount++;
		}
	}

	@ObfuscatedName("kg.a(BI)V")
	public static void playSongs(int arg0) {
		if (arg0 == -1 && !playingJingle) {
			MidiManager.stop();
		} else if (arg0 != -1 && (arg0 != nextMidiSong || !MidiManager.isInitialised()) && midiVolume != 0 && !playingJingle) {
			MidiManager.method730(midiVolume, arg0, songs);
		}
		nextMidiSong = arg0;
	}

	@ObfuscatedName("ac.a(ZII)V")
	public static void playJingle(int arg0, int arg1) {
		if (midiVolume != 0 && arg0 != -1) {
			MidiManager.play(jingles, arg0, midiVolume);
			playingJingle = true;
		}
	}

	@ObfuscatedName("id.a(IIII)V")
	public static void playSynth(int arg0, int arg1, int arg2) {
		if (waveVolume == 0 || arg0 == 0 || waveCount >= 50 || arg2 == -1) {
			return;
		}
		waveSoundIds[waveCount] = arg2;
		waveLoops[waveCount] = arg0;
		waveDelay[waveCount] = arg1;
		waveSounds[waveCount] = null;
		waveAmbient[waveCount] = 0;
		waveCount++;
	}

	@ObfuscatedName("ac.a(IIILq;)V")
	public static void minimapLoop(int arg0, int arg1, IfType arg2) {
		if (minimapState != 0 && minimapState != 3) {
			return;
		}
		int var3 = arg1 - arg2.renderHeight / 2;
		int var4 = arg0 - arg2.renderWidth / 2;
		int var5 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var6 = Pix3D.cosTable[var5];
		int var7 = Pix3D.sinTable[var5];
		int var8 = (macroMinimapZoom + 256) * var6 >> 8;
		int var9 = (macroMinimapZoom + 256) * var7 >> 8;
		int var10 = var4 * var8 + var9 * var3 >> 11;
		int var11 = var10 + localPlayer.x >> 7;
		int var12 = var8 * var3 - var4 * var9 >> 11;
		int var13 = localPlayer.z - var12 >> 7;
		boolean var14 = tryMove(0, 0, var13, var11, localPlayer.routeX[0], 0, 0, 1, true, 0, localPlayer.routeZ[0]);
		if (!var14) {
			return;
		}
		out.p1(var4);
		out.p1(var3);
		out.p2(orbitCameraYaw);
		out.p1(57);
		out.p1(macroMinimapAngle);
		out.p1(macroMinimapZoom);
		out.p1(89);
		out.p2(localPlayer.x);
		out.p2(localPlayer.z);
		out.p1(field2186);
		out.p1(63);
	}

	@ObfuscatedName("oa.b(Z)V")
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
			ClientNpc var5 = npc[var4];
			if (var5 != null && var5.chatTimer > 0) {
				var5.chatTimer--;
				if (var5.chatTimer == 0) {
					var5.chat = null;
				}
			}
		}
	}

	@ObfuscatedName("ij.a(Li;I)V")
	public static void doCheat(JagString arg0) {
		if (staffmodlevel >= 2) {
			if (arg0.equalsIgnoreCase(AUTO_GC)) {
				for (int var1 = 0; var1 < 10; var1++) {
					System.gc();
				}
				Runtime var2 = Runtime.getRuntime();
				int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
				addChat(JagString.join(new JagString[] { field2950, JagString.parseInt(var3), field2007 }), 0, null);
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
			arg0.equalsIgnoreCase(AUTO_AUTOSHADOW_ON);
			arg0.equalsIgnoreCase(AUTO_AUTOSHADOW_OFF);
			if (arg0.equalsIgnoreCase(AUTO_NOCLIP)) {
				for (int var4 = 0; var4 < 4; var4++) {
					for (int var5 = 1; var5 < 103; var5++) {
						for (int var6 = 1; var6 < 103; var6++) {
							collision[var4].flags[var5][var6] = 0;
						}
					}
				}
			}
			if (arg0.startsWith(AUTO_FPS) && modewhere != 0) {
				GameShell.setFramerate(arg0.substring(6).method603());
			}
			if (arg0.equalsIgnoreCase(AUTO_ERRORTEST) && modewhere == 2) {
				throw new RuntimeException();
			}
			if (arg0.startsWith(AUTO_RECT_DEBUG)) {
				componentRectDebug = arg0.substring(12).method602().method603();
				addChat(JagString.join(new JagString[] { field1750, JagString.parseInt(componentRectDebug) }), 0, null);
			}
			if (arg0.equalsIgnoreCase(AUTO_QA_OP_TEST)) {
				qaOpTest = true;
			}
		}
		// CLIENT_CHEAT
		out.p1Enc(175);
		out.p1(arg0.length() - 1);
		out.pjstr(arg0.substring(2));
	}

	@ObfuscatedName("qf.c(Z)V")
	public static void followCamera() {
		int var0 = localPlayer.z + macroCameraZ;
		if (ClientKeyboardListener.keyHeld[96]) {
			orbitCameraYawVelocity += (-orbitCameraYawVelocity - 24) / 2;
		} else if (ClientKeyboardListener.keyHeld[97]) {
			orbitCameraYawVelocity += (24 - orbitCameraYawVelocity) / 2;
		} else {
			orbitCameraYawVelocity /= 2;
		}
		if (ClientKeyboardListener.keyHeld[98]) {
			orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
		} else if (ClientKeyboardListener.keyHeld[99]) {
			orbitCameraPitchVelocity += (-orbitCameraPitchVelocity - 12) / 2;
		} else {
			orbitCameraPitchVelocity /= 2;
		}
		int var1 = localPlayer.x + macroCameraX;
		if (orbitCameraX - var1 < -500 || orbitCameraX - var1 > 500 || orbitCameraZ - var0 < -500 || orbitCameraZ - var0 > 500) {
			orbitCameraX = var1;
			orbitCameraZ = var0;
		}
		if (var1 != orbitCameraX) {
			orbitCameraX += (var1 - orbitCameraX) / 16;
		}
		orbitCameraYaw += orbitCameraYawVelocity / 2;
		orbitCameraPitch += orbitCameraPitchVelocity / 2;
		if (orbitCameraZ != var0) {
			orbitCameraZ += (var0 - orbitCameraZ) / 16;
		}
		clampCameraAngle();
	}

	// guessing placement and name
	@ObfuscatedName("me.c(B)V")
	public static void clampCameraAngle() {
		int var0 = orbitCameraX >> 7;
		orbitCameraYaw &= 0x7FF;
		int var1 = orbitCameraZ >> 7;
		int var2 = 0;
		if (orbitCameraPitch < 128) {
			orbitCameraPitch = 128;
		}
		if (orbitCameraPitch > 383) {
			orbitCameraPitch = 383;
		}
		int var3 = getAvH(orbitCameraX, orbitCameraZ, minusedlevel);
		if (var0 > 3 && var1 > 3 && var0 < 100 && var1 < 100) {
			for (int var4 = var0 - 4; var4 <= var0 + 4; var4++) {
				for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
					int var6 = minusedlevel;
					if (var6 < 3 && (ClientBuild.mapl[1][var4][var5] & 0x2) == 2) {
						var6++;
					}
					int var7 = var3 - ClientBuild.groundh[var6][var4][var5];
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
		if (cameraPitchClamp < var8) {
			cameraPitchClamp += (var8 - cameraPitchClamp) / 24;
		} else if (var8 < cameraPitchClamp) {
			cameraPitchClamp += (var8 - cameraPitchClamp) / 80;
		}
	}

	@ObfuscatedName("w.a(B)V")
	public static void cinemaCamera() {
		int var0 = camMoveToLx * 128 + 64;
		int var1 = camMoveToLz * 128 + 64;
		int var2 = getAvH(var0, var1, minusedlevel) - camMoveToHei;
		if (camX < var0) {
			camX += camMoveToRate2 * (var0 - camX) / 1000 + camMoveToRate;
			if (var0 < camX) {
				camX = var0;
			}
		}
		if (var1 > camZ) {
			camZ += (var1 - camZ) * camMoveToRate2 / 1000 + camMoveToRate;
			if (var1 < camZ) {
				camZ = var1;
			}
		}
		if (var0 < camX) {
			camX -= (camX - var0) * camMoveToRate2 / 1000 + camMoveToRate;
			if (var0 > camX) {
				camX = var0;
			}
		}
		int var3 = camLookAtLx * 128 + 64;
		if (camZ > var1) {
			camZ -= camMoveToRate + camMoveToRate2 * (camZ - var1) / 1000;
			if (camZ < var1) {
				camZ = var1;
			}
		}
		if (camY < var2) {
			camY += camMoveToRate2 * (var2 - camY) / 1000 + camMoveToRate;
			if (camY > var2) {
				camY = var2;
			}
		}
		int var4 = camLookAtLz * 128 + 64;
		if (var2 < camY) {
			camY -= camMoveToRate + (camY - var2) * camMoveToRate2 / 1000;
			if (camY < var2) {
				camY = var2;
			}
		}
		int var5 = getAvH(var3, var4, minusedlevel) - camLookAtHei;
		int var6 = var3 - camX;
		int var7 = var5 - camY;
		int var8 = var4 - camZ;
		int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
		int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
		int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
		if (var10 < 128) {
			var10 = 128;
		}
		int var12 = var11 - camYaw;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var10 > 383) {
			var10 = 383;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (camPitch < var10) {
			camPitch += (var10 - camPitch) * camLookAtRate2 / 1000 + camLookAtRate;
			if (camPitch > var10) {
				camPitch = var10;
			}
		}
		if (var12 > 0) {
			camYaw += camLookAtRate2 * var12 / 1000 + camLookAtRate;
			camYaw &= 0x7FF;
		}
		if (var12 < 0) {
			camYaw -= camLookAtRate + camLookAtRate2 * -var12 / 1000;
			camYaw &= 0x7FF;
		}
		if (camPitch > var10) {
			camPitch -= (camPitch - var10) * camLookAtRate2 / 1000 + camLookAtRate;
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

	@ObfuscatedName("ec.c(I)V")
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
					if (waveAmbient[var0] == 0) {
						var3 = waveVolume;
					} else {
						int var4 = (waveAmbient[var0] & 0xFF) * 128;
						int var5 = waveAmbient[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - localPlayer.x;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = waveAmbient[var0] >> 8 & 0xFF;
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
						var3 = (var4 - var9) * ambientVolume / var4;
					}
					if (var3 > 0) {
						Wave var10 = var2.toWave().decimate(decimator);
						WaveStream var11 = WaveStream.newRatePercent(var10, var3);
						var11.setLoopCount(waveLoops[var0] - 1);
						mixer.playStream(var11);
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
					waveAmbient[var1] = waveAmbient[var1 + 1];
				}
				var0--;
			}
		}
		if (playingJingle && !MidiManager.isInitialised()) {
			if (midiVolume != 0 && nextMidiSong != -1) {
				MidiManager.play(songs, nextMidiSong, midiVolume);
			}
			playingJingle = false;
		} else if (midiVolume != 0 && nextMidiSong != -1 && !MidiManager.isInitialised()) {
			out.p1Enc(133);
			out.p4(nextMidiSong);
			nextMidiSong = -1;
		}
	}

	@ObfuscatedName("ph.e(I)V")
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
				moveEntity(var2.size, var2);
			}
		}
	}

	@ObfuscatedName("pd.c(B)V")
	public static void moveNpcs() {
		for (int var0 = 0; var0 < npcCount; var0++) {
			int var1 = npcIds[var0];
			ClientNpc var2 = npc[var1];
			if (var2 != null) {
				moveEntity(var2.type.size, var2);
			}
		}
	}

	@ObfuscatedName("h.a(ILu;I)V")
	public static void moveEntity(int arg0, ClientEntity arg1) {
		if (arg1.exactMoveEnd > loopCycle) {
			exactMove1(arg1);
		} else if (arg1.exactMoveStart < loopCycle) {
			routeMove(arg1);
		} else {
			exactMove2(arg1);
		}
		if (arg1.x < 128 || arg1.z < 128 || arg1.x >= 13184 || arg1.z >= 13184) {
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.x = arg1.routeX[0] * 128 + arg1.size * 64;
			arg1.exactMoveStart = 0;
			arg1.spotanimId = -1;
			arg1.exactMoveEnd = 0;
			arg1.primarySeqId = -1;
			arg1.abortRoute();
		}
		if (arg1 == localPlayer && (arg1.x < 1536 || arg1.z < 1536 || arg1.x >= 11776 || arg1.z >= 11776)) {
			arg1.spotanimId = -1;
			arg1.exactMoveStart = 0;
			arg1.exactMoveEnd = 0;
			arg1.z = arg1.size * 64 + arg1.routeZ[0] * 128;
			arg1.primarySeqId = -1;
			arg1.x = arg1.size * 64 + arg1.routeX[0] * 128;
			arg1.abortRoute();
		}
		entityFace(arg1);
		entityAnim(arg1);
	}

	@ObfuscatedName("k.a(Lu;B)V")
	public static void exactMove1(ClientEntity arg0) {
		int var1 = arg0.exactMoveEnd - loopCycle;
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
		int var2 = arg0.exactStartZ * 128 + arg0.size * 64;
		arg0.z += (var2 - arg0.z) / var1;
		int var3 = arg0.size * 64 + arg0.exactStartX * 128;
		arg0.x += (var3 - arg0.x) / var1;
	}

	@ObfuscatedName("td.a(Lu;I)V")
	public static void exactMove2(ClientEntity arg0) {
		if (arg0.exactMoveStart == loopCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.list(arg0.primarySeqId).delay[arg0.primarySeqFrame]) {
			int var1 = loopCycle - arg0.exactMoveEnd;
			int var2 = arg0.exactStartX * 128 + arg0.size * 64;
			int var3 = arg0.exactMoveStart - arg0.exactMoveEnd;
			int var4 = arg0.exactStartZ * 128 + arg0.size * 64;
			int var5 = arg0.exactEndX * 128 + arg0.size * 64;
			int var6 = arg0.exactEndZ * 128 + arg0.size * 64;
			arg0.z = ((var3 - var1) * var4 + var6 * var1) / var3;
			arg0.x = ((var3 - var1) * var2 + var5 * var1) / var3;
		}
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
		arg0.yaw = arg0.dstYaw;
	}

	@ObfuscatedName("we.a(Lu;I)V")
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
		int var3 = arg0.size * 64 + arg0.routeX[arg0.routeLength - 1] * 128;
		int var4 = arg0.z;
		int var5 = arg0.routeZ[arg0.routeLength - 1] * 128 + arg0.size * 64;
		if (var3 - var2 > 256 || var3 - var2 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
			arg0.x = var3;
			arg0.z = var5;
			return;
		}
		if (var2 >= var3) {
			if (var3 >= var2) {
				if (var5 > var4) {
					arg0.dstYaw = 1024;
				} else if (var5 < var4) {
					arg0.dstYaw = 0;
				}
			} else if (var4 < var5) {
				arg0.dstYaw = 768;
			} else if (var5 >= var4) {
				arg0.dstYaw = 512;
			} else {
				arg0.dstYaw = 256;
			}
		} else if (var4 < var5) {
			arg0.dstYaw = 1280;
		} else if (var5 < var4) {
			arg0.dstYaw = 1792;
		} else {
			arg0.dstYaw = 1536;
		}
		int var6 = arg0.walkanim_b;
		int var7 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var7 > 1024) {
			var7 -= 2048;
		}
		if (var7 >= -256 && var7 <= 256) {
			var6 = arg0.walkanim;
		} else if (var7 >= 256 && var7 < 768) {
			var6 = arg0.walkanim_r;
		} else if (var7 >= -768 && var7 <= -256) {
			var6 = arg0.walkanim_l;
		}
		if (var6 == -1) {
			var6 = arg0.walkanim;
		}
		int var8 = 4;
		boolean var9 = true;
		arg0.secondarySeqId = var6;
		if (arg0 instanceof ClientNpc) {
			var9 = ((ClientNpc) arg0).type.walksmoothing;
		}
		if (var9) {
			if (arg0.dstYaw != arg0.yaw && arg0.targetId == -1 && arg0.turnspeed != 0) {
				var8 = 2;
			}
			if (arg0.routeLength > 2) {
				var8 = 6;
			}
			if (arg0.routeLength > 3) {
				var8 = 8;
			}
			if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
				var8 = 8;
				arg0.animDelayMove--;
			}
		} else {
			if (arg0.routeLength > 1) {
				var8 = 6;
			}
			if (arg0.routeLength > 2) {
				var8 = 8;
			}
			if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
				var8 = 8;
				arg0.animDelayMove--;
			}
		}
		if (arg0.routeRun[arg0.routeLength - 1]) {
			var8 <<= 0x1;
		}
		if (var3 > var2) {
			arg0.x += var8;
			if (arg0.x > var3) {
				arg0.x = var3;
			}
		} else if (var3 < var2) {
			arg0.x -= var8;
			if (var3 > arg0.x) {
				arg0.x = var3;
			}
		}
		if (var8 >= 8 && arg0.walkanim == arg0.secondarySeqId && arg0.runanim != -1) {
			arg0.secondarySeqId = arg0.runanim;
		}
		if (var5 > var4) {
			arg0.z += var8;
			if (var5 < arg0.z) {
				arg0.z = var5;
			}
		} else if (var5 < var4) {
			arg0.z -= var8;
			if (var5 > arg0.z) {
				arg0.z = var5;
			}
		}
		if (var3 != arg0.x || arg0.z != var5) {
			return;
		}
		arg0.routeLength--;
		if (arg0.preanimRouteLength > 0) {
			arg0.preanimRouteLength--;
			return;
		}
	}

	@ObfuscatedName("bf.a(Lu;Z)V")
	public static void entityFace(ClientEntity arg0) {
		if (arg0.turnspeed == 0) {
			return;
		}
		if (arg0.targetId != -1 && arg0.targetId < 32768) {
			ClientNpc var1 = npc[arg0.targetId];
			if (var1 != null) {
				int var2 = arg0.z - var1.z;
				int var3 = arg0.x - var1.x;
				if (var3 != 0 || var2 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var3, (double) var2) * 325.949D) & 0x7FF;
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
				int var6 = arg0.x - var5.x;
				int var7 = arg0.z - var5.z;
				if (var6 != 0 || var7 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.targetTileX != 0 || arg0.targetTileZ != 0) && (arg0.routeLength == 0 || arg0.animDelayMove > 0)) {
			int var8 = arg0.size * 64 + arg0.z - (-mapBuildBaseZ + arg0.targetTileZ + -mapBuildBaseZ) * 64 - 64;
			int var9 = arg0.x + (arg0.size - 1) * 64 - (arg0.targetTileX - mapBuildBaseX - mapBuildBaseX) * 64;
			if (var9 != 0 || var8 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
			}
			arg0.targetTileZ = 0;
			arg0.targetTileX = 0;
		}
		int var10 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var10 == 0) {
			arg0.turnCycle = 0;
			return;
		}
		arg0.turnCycle++;
		if (var10 > 1024) {
			arg0.yaw -= arg0.turnspeed;
			boolean var11 = true;
			if (var10 < arg0.turnspeed || 2048 - arg0.turnspeed < var10) {
				arg0.yaw = arg0.dstYaw;
				var11 = false;
			}
			if (arg0.readyanim == arg0.secondarySeqId && (arg0.turnCycle > 25 || var11)) {
				if (arg0.turnleftanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnleftanim;
				}
			}
		} else {
			arg0.yaw += arg0.turnspeed;
			boolean var12 = true;
			if (arg0.turnspeed > var10 || 2048 - arg0.turnspeed < var10) {
				arg0.yaw = arg0.dstYaw;
				var12 = false;
			}
			if (arg0.secondarySeqId == arg0.readyanim && (arg0.turnCycle > 25 || var12)) {
				if (arg0.turnrightanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnrightanim;
				}
			}
		}
		arg0.yaw &= 0x7FF;
	}

	@ObfuscatedName("jf.a(Lu;I)V")
	public static void entityAnim(ClientEntity arg0) {
		arg0.needsForwardDrawPadding = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var1 = SeqType.list(arg0.secondarySeqId);
			if (var1 == null || var1.frames == null) {
				arg0.secondarySeqId = -1;
			} else {
				arg0.secondarySeqCycle++;
				if (arg0.secondarySeqFrame < var1.frames.length && var1.delay[arg0.secondarySeqFrame] < arg0.secondarySeqCycle) {
					arg0.secondarySeqCycle = 1;
					arg0.secondarySeqFrame++;
					triggerSeqSound(arg0 == localPlayer, arg0.z, arg0.secondarySeqFrame, arg0.x, var1);
				}
				if (arg0.secondarySeqFrame >= var1.frames.length) {
					arg0.secondarySeqFrame = 0;
					arg0.secondarySeqCycle = 0;
					triggerSeqSound(arg0 == localPlayer, arg0.z, arg0.secondarySeqFrame, arg0.x, var1);
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
					if (var3.frames.length > arg0.spotanimFrame && var3.delay[arg0.spotanimFrame] < arg0.spotanimCycle) {
						arg0.spotanimFrame++;
						arg0.spotanimCycle = 1;
						triggerSeqSound(localPlayer == arg0, arg0.z, arg0.spotanimFrame, arg0.x, var3);
					}
					if (arg0.spotanimFrame >= var3.frames.length) {
						arg0.spotanimId = -1;
					}
				}
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var4 = SeqType.list(arg0.primarySeqId);
			if (var4.preanim_move == 1 && arg0.preanimRouteLength > 0 && arg0.exactMoveEnd <= loopCycle && loopCycle > arg0.exactMoveStart) {
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
				if (arg0.primarySeqFrame < var5.frames.length && var5.delay[arg0.primarySeqFrame] < arg0.primarySeqCycle) {
					arg0.primarySeqCycle = 1;
					arg0.primarySeqFrame++;
					triggerSeqSound(arg0 == localPlayer, arg0.z, arg0.primarySeqFrame, arg0.x, var5);
				}
				if (arg0.primarySeqFrame >= var5.frames.length) {
					arg0.primarySeqLoop++;
					arg0.primarySeqFrame -= var5.loops;
					if (arg0.primarySeqLoop >= var5.maxloops) {
						arg0.primarySeqId = -1;
					} else if (arg0.primarySeqFrame >= 0 && arg0.primarySeqFrame < var5.frames.length) {
						triggerSeqSound(arg0 == localPlayer, arg0.z, arg0.primarySeqFrame, arg0.x, var5);
					} else {
						arg0.primarySeqId = -1;
					}
				}
				arg0.needsForwardDrawPadding = var5.reachforward;
			}
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("uh.a(BIILdj;)V")
	public static void triggerPlayerAnim(int arg0, int arg1, ClientPlayer arg2) {
		if (arg0 == arg2.primarySeqId && arg0 != -1) {
			SeqType var3 = SeqType.list(arg0);
			int var4 = var3.duplicatebehaviour;
			if (var4 == 1) {
				arg2.primarySeqCycle = 0;
				arg2.primarySeqLoop = 0;
				arg2.primarySeqFrame = 0;
				arg2.primarySeqDelay = arg1;
				triggerSeqSound(arg2 == localPlayer, arg2.z, arg2.primarySeqFrame, arg2.x, var3);
			}
			if (var4 == 2) {
				arg2.primarySeqLoop = 0;
			}
		} else if (arg0 == -1 || arg2.primarySeqId == -1 || SeqType.list(arg0).priority >= SeqType.list(arg2.primarySeqId).priority) {
			arg2.primarySeqFrame = 0;
			arg2.primarySeqDelay = arg1;
			arg2.preanimRouteLength = arg2.routeLength;
			arg2.primarySeqId = arg0;
			arg2.primarySeqLoop = 0;
			arg2.primarySeqCycle = 0;
			if (arg2.primarySeqId != -1) {
				triggerSeqSound(localPlayer == arg2, arg2.z, arg2.primarySeqFrame, arg2.x, SeqType.list(arg2.primarySeqId));
			}
		}
	}

	// guessing placement
	@ObfuscatedName("mj.a(IZILrf;)V")
	public static void triggerNpcAnim(int arg0, int arg1, ClientNpc arg2) {
		if (arg0 == arg2.primarySeqId && arg0 != -1) {
			SeqType var3 = SeqType.list(arg0);
			int var4 = var3.duplicatebehaviour;
			if (var4 == 1) {
				arg2.primarySeqLoop = 0;
				arg2.primarySeqCycle = 0;
				arg2.primarySeqDelay = arg1;
				arg2.primarySeqFrame = 0;
				triggerSeqSound(false, arg2.z, arg2.primarySeqFrame, arg2.x, var3);
			}
			if (var4 == 2) {
				arg2.primarySeqLoop = 0;
			}
		} else if (arg0 == -1 || arg2.primarySeqId == -1 || SeqType.list(arg0).priority >= SeqType.list(arg2.primarySeqId).priority) {
			arg2.primarySeqCycle = 0;
			arg2.primarySeqDelay = arg1;
			arg2.preanimRouteLength = arg2.routeLength;
			arg2.primarySeqFrame = 0;
			arg2.primarySeqLoop = 0;
			arg2.primarySeqId = arg0;
			if (arg2.primarySeqId != -1) {
				triggerSeqSound(false, arg2.z, arg2.primarySeqFrame, arg2.x, SeqType.list(arg2.primarySeqId));
			}
		}
	}

	// guessing placement and name
	@ObfuscatedName("kd.c(IIIIIIII)V")
	public static void animateLocation(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		if (arg2 == 0) {
			Wall var7 = World.getWall(arg4, arg1, arg5);
			if (var7 != null) {
				int var8 = Integer.MAX_VALUE & (int) (var7.typecode >>> 32);
				if (arg0 == 2) {
					var7.modelA = new ClientLocAnim(var8, 2, arg3 + 4, arg4, arg1, arg5, arg6, false, var7.modelA);
					var7.modelB = new ClientLocAnim(var8, 2, arg3 + 1 & 0x3, arg4, arg1, arg5, arg6, false, var7.modelB);
				} else {
					var7.modelA = new ClientLocAnim(var8, arg0, arg3, arg4, arg1, arg5, arg6, false, var7.modelA);
				}
			}
		}
		if (arg2 == 1) {
			Decor var9 = World.getDecor(arg4, arg1, arg5);
			if (var9 != null) {
				int var10 = (int) (var9.typecode >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 4 || arg0 == 5) {
					var9.model = new ClientLocAnim(var10, 4, arg3, arg4, arg1, arg5, arg6, false, var9.model);
				} else if (arg0 == 6) {
					var9.model = new ClientLocAnim(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.model);
				} else if (arg0 == 7) {
					var9.model = new ClientLocAnim(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.model);
				} else if (arg0 == 8) {
					var9.model = new ClientLocAnim(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.model);
					var9.model2 = new ClientLocAnim(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.model2);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			Sprite var11 = World.getScene(arg4, arg1, arg5);
			if (var11 != null) {
				var11.model = new ClientLocAnim((int) (var11.typecode >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg1, arg5, arg6, false, var11.model);
			}
		}
		if (arg2 == 3) {
			GroundDecor var12 = World.getGd(arg4, arg1, arg5);
			if (var12 != null) {
				var12.model = new ClientLocAnim((int) (var12.typecode >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg1, arg5, arg6, false, var12.model);
			}
		}
	}

	@ObfuscatedName("client.a(Li;ZI)V")
	public static void messageBox(JagString arg0, boolean arg1) {
		int var2 = p12.predictWidthMultiline(arg0, 250);
		int var3 = p12.predictLinesMultiline(arg0, 250) * 13;
		Pix2D.fillRect(6, 6, var2 + 4 + 4, 4 + 4 + var3, 0);
		Pix2D.drawRect(6, 6, var2 + 4 + 4, 4 + 4 + var3, 16777215);
		p12.drawStringMultiline(arg0, 10, 10, var2, var3, 16777215, -1, 1, 1, 0);
		dirtyArea(var3 + 4 + 4, var2 - -4 + 4, 6, 6);
		if (!arg1) {
			blitArea(10, var3, var2, 10);
			return;
		}
		Canvas var4 = GameShell.canvas;
		try {
			Graphics var5 = var4.getGraphics();
			GameShell.drawArea.draw(var5);
		} catch (Exception var6) {
			var4.repaint();
		}
	}

	@ObfuscatedName("dc.a(IIIBI)V")
	public static void gameDrawMain(int arg0, int arg1, int arg2, int arg3) {
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
			if (cameraPitchClamp / 256 > var4) {
				var4 = cameraPitchClamp / 256;
			}
			if (camShake[4] && camShakeRan[4] + 128 > var4) {
				var4 = camShakeRan[4] + 128;
			}
			camFollow(orbitCameraX, getAvH(localPlayer.x, localPlayer.z, minusedlevel) - 50, var5, var4, var4 * 3 + 600, arg2, orbitCameraZ);
		}
		int var6;
		if (cinemaCam) {
			var6 = roofCheck2();
		} else {
			var6 = roofCheck();
		}
		int var7 = camY;
		int var8 = camPitch;
		int var9 = camX;
		int var10 = camZ;
		int var11 = camYaw;
		for (int var12 = 0; var12 < 5; var12++) {
			if (camShake[var12]) {
				int var13 = (int) (Math.random() * (double) (camShakeAxis[var12] * 2 + 1) + Math.sin((double) camShakeCycle[var12] * ((double) camShakeAmp[var12] / 100.0D)) * (double) camShakeRan[var12] - (double) camShakeAxis[var12]);
				if (var12 == 3) {
					camYaw = camYaw + var13 & 0x7FF;
				}
				if (var12 == 4) {
					camPitch += var13;
					if (camPitch < 128) {
						camPitch = 128;
					}
					if (camPitch > 383) {
						camPitch = 383;
					}
				}
				if (var12 == 2) {
					camZ += var13;
				}
				if (var12 == 1) {
					camY += var13;
				}
				if (var12 == 0) {
					camX += var13;
				}
			}
		}
		Pix2D.setClipping(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Pix3D.setRenderClipping();
		int var14 = ClientMouseListener.mouseX;
		int var15 = ClientMouseListener.mouseY;
		if (var14 >= arg1 && arg1 + arg0 > var14 && arg3 <= var15 && var15 < arg3 + arg2) {
			ModelLit.mouseCheck = true;
			SoftwareModelLit.pickedCount = 0;
			int var16 = Pix3D.minX;
			int var17 = Pix3D.maxX;
			int var18 = Pix3D.minY;
			ModelLit.mouseX = var16 + (var17 - var16) * (ClientMouseListener.mouseX - arg1) / arg0;
			int var19 = Pix3D.maxY;
			ModelLit.mouseY = (ClientMouseListener.mouseY - arg3) * (var19 - var18) / arg2 + var18;
		} else {
			ModelLit.mouseCheck = false;
			SoftwareModelLit.pickedCount = 0;
		}
		doAudio();
		Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
		World.renderAll(camX, camY, camZ, camPitch, camYaw, var6, null, null, null, null, null, null, localPlayer.x >> 7, localPlayer.z >> 7);
		doAudio();
		World.removeSprites();
		entityOverlays(arg1, arg3, arg2, arg0);
		coordArrow(arg1, arg3, arg2, arg0);
		((TextureManager) Pix3D.textureManager).runAnims(worldUpdateNum);
		otherOverlays(arg1, arg2, arg3, arg0);
		camYaw = var11;
		camPitch = var8;
		camX = var9;
		camY = var7;
		camZ = var10;
		if (js5Loading && Js5Net.urgentQueueSize() == 0) {
			js5Loading = false;
		}
		if (js5Loading) {
			Pix2D.fillRect(arg1, arg3, arg0, arg2, 0);
			messageBox(Text.LOADING, false);
		}
		if (!js5Loading && !isMenuOpen && arg1 <= var14 && var14 < arg0 + arg1 && arg3 <= var15 && var15 < arg2 + arg3) {
			minimenuBuildSceneActions(var15, arg1, arg2, arg0, arg3, var14);
		}
	}

	@ObfuscatedName("pa.a(ZB)V")
	public static void addPlayers(boolean arg0) {
		if (localPlayer.x >> 7 == minimapFlagX && minimapFlagZ == localPlayer.z >> 7) {
			minimapFlagX = 0;
		}
		int var1 = playerCount;
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
				var3 = players[playerIds[var2]];
				var4 = (long) playerIds[var2] << 32;
			}
			if (var3 != null && var3.ready()) {
				int var6 = var3.x >> 7;
				var3.lowMem = false;
				if ((lowMem && playerCount > 50 || playerCount > 200) && !arg0 && var3.readyanim == var3.secondarySeqId) {
					var3.lowMem = true;
				}
				int var7 = var3.z >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var3.locModel == null || loopCycle < var3.locStartCycle || loopCycle >= var3.locEndCycle) {
						if ((var3.x & 0x7F) == 64 && (var3.z & 0x7F) == 64) {
							if (sceneCycle == tileLastOccupiedCycle[var6][var7]) {
								continue;
							}
							tileLastOccupiedCycle[var6][var7] = sceneCycle;
						}
						var3.y = getAvH(var3.x, var3.z, minusedlevel);
						World.addDynamic(minusedlevel, var3.x, var3.z, var3.y, 60, var3, var3.yaw, var4, var3.needsForwardDrawPadding);
					} else {
						var3.lowMem = false;
						var3.y = getAvH(var3.x, var3.z, minusedlevel);
						World.addDynamic(minusedlevel, var3.x, var3.z, var3.y, var3, var3.yaw, var4, var3.minTileX, var3.minTileZ, var3.maxTileX, var3.maxTileZ);
					}
				}
			}
		}
	}

	@ObfuscatedName("ng.c(ZI)V")
	public static void addNpcs(boolean arg0) {
		for (int var1 = 0; var1 < npcCount; var1++) {
			ClientNpc var2 = npc[npcIds[var1]];
			long var3 = (long) npcIds[var1] << 32 | 0x20000000L;
			if (var2 != null && var2.ready() && arg0 == var2.type.alwaysontop && var2.type.isMultiNpcVisible()) {
				int var5 = var2.x >> 7;
				int var6 = var2.z >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var2.size == 1 && (var2.x & 0x7F) == 64 && (var2.z & 0x7F) == 64) {
						if (sceneCycle == tileLastOccupiedCycle[var5][var6]) {
							continue;
						}
						tileLastOccupiedCycle[var5][var6] = sceneCycle;
					}
					if (!var2.type.active) {
						var3 |= Long.MIN_VALUE;
					}
					var2.y = getAvH(var2.x + (var2.size - 1) * 64, var2.z - (-(var2.size * 64) + 64), minusedlevel);
					World.addDynamic(minusedlevel, var2.x, var2.z, var2.y, (var2.size - 1) * 64 + 60, var2, var2.yaw, var3, var2.needsForwardDrawPadding);
				}
			}
		}
	}

	@ObfuscatedName("de.b(I)V")
	public static void addProjectiles() {
		for (ClientProjNode2 var0 = (ClientProjNode2) projectiles.head(); var0 != null; var0 = (ClientProjNode2) projectiles.next()) {
			ClientProj var1 = var0.field315;
			if (var1.level != minusedlevel || loopCycle > var1.t2) {
				var0.unlink();
			} else if (var1.t1 <= loopCycle) {
				if (var1.target > 0) {
					ClientNpc var2 = npc[var1.target - 1];
					if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.z >= 0 && var2.z < 13312) {
						var1.setTarget(var2.x, loopCycle, getAvH(var2.x, var2.z, var1.level) - var1.h2, var2.z);
					}
				}
				if (var1.target < 0) {
					int var3 = -var1.target - 1;
					ClientPlayer var4;
					if (var3 == selfSlot) {
						var4 = localPlayer;
					} else {
						var4 = players[var3];
					}
					if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.z >= 0 && var4.z < 13312) {
						var1.setTarget(var4.x, loopCycle, getAvH(var4.x, var4.z, var1.level) - var1.h2, var4.z);
					}
				}
				var1.move(worldUpdateNum);
				World.addDynamic(minusedlevel, (int) var1.x, (int) var1.z, (int) var1.y, 60, var1, var1.yaw, -1L, false);
			}
		}
	}

	@ObfuscatedName("sc.d(I)V")
	public static void addMapAnim() {
		for (MapSpotAnimNode var0 = (MapSpotAnimNode) spotanims.head(); var0 != null; var0 = (MapSpotAnimNode) spotanims.next()) {
			MapSpotAnim var1 = var0.field4474;
			if (var1.level != minusedlevel || var1.animComplete) {
				var0.unlink();
			} else if (var1.startCycle <= loopCycle) {
				var1.doAnim(worldUpdateNum);
				if (var1.animComplete) {
					var0.unlink();
				} else {
					World.addDynamic(var1.level, var1.x, var1.z, var1.y, 60, var1, 0, -1L, false);
				}
			}
		}
	}

	@ObfuscatedName("eb.a(IIIIIIII)V")
	public static void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 0;
		int var9 = 0;
		int var10 = arg4;
		int var11 = 2048 - arg3 & 0x7FF;
		if (var11 != 0) {
			int var12 = Pix3D.sinTable[var11];
			int var13 = Pix3D.cosTable[var11];
			var9 = var12 * -arg4 >> 16;
			var10 = var13 * arg4 >> 16;
		}
		if (var7 != 0) {
			int var14 = Pix3D.sinTable[var7];
			int var15 = Pix3D.cosTable[var7];
			var8 = var10 * var14 >> 16;
			var10 = var15 * var10 >> 16;
		}
		camY = arg1 - var9;
		camX = arg0 - var8;
		camZ = arg6 - var10;
		camYaw = arg2;
		camPitch = arg3;
	}

	@ObfuscatedName("o.f(I)I")
	public static int roofCheck2() {
		int var0 = getAvH(camX, camZ, minusedlevel);
		return var0 - camY >= 800 || (ClientBuild.mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("m.a(B)I")
	public static int roofCheck() {
		int var0 = 3;
		if (camPitch < 310) {
			int var1 = camX >> 7;
			int var2 = camZ >> 7;
			int var3 = localPlayer.x >> 7;
			if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
				var0 = minusedlevel;
			}
			int var4;
			if (var1 < var3) {
				var4 = var3 - var1;
			} else {
				var4 = var1 - var3;
			}
			int var5 = localPlayer.z >> 7;
			int var6;
			if (var5 > var2) {
				var6 = var5 - var2;
			} else {
				var6 = var2 - var5;
			}
			if (var6 >= var4) {
				int var7 = var4 * 65536 / var6;
				int var8 = 32768;
				while (var5 != var2) {
					if (var5 > var2) {
						var2++;
					} else if (var2 > var5) {
						var2--;
					}
					var8 += var7;
					if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					if (var8 >= 65536) {
						var8 -= 65536;
						if (var3 > var1) {
							var1++;
						} else if (var3 < var1) {
							var1--;
						}
						if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
							var0 = minusedlevel;
						}
					}
				}
			} else {
				int var9 = var6 * 65536 / var4;
				int var10 = 32768;
				while (var1 != var3) {
					if (var1 < var3) {
						var1++;
					} else if (var1 > var3) {
						var1--;
					}
					var10 += var9;
					if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
						var0 = minusedlevel;
					}
					if (var10 >= 65536) {
						if (var2 < var5) {
							var2++;
						} else if (var2 > var5) {
							var2--;
						}
						if ((ClientBuild.mapl[minusedlevel][var1][var2] & 0x4) != 0) {
							var0 = minusedlevel;
						}
						var10 -= 65536;
					}
				}
			}
		}
		if ((ClientBuild.mapl[minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var0 = minusedlevel;
		}
		return var0;
	}

	@ObfuscatedName("eh.a(IIIIIII)V")
	public static void entityOverlays(int arg0, int arg1, int arg2, int arg3) {
		chatCount = 0;
		for (int var4 = -1; var4 < npcCount + playerCount; var4++) {
			ClientEntity var5;
			if (var4 == -1) {
				var5 = localPlayer;
			} else if (var4 >= playerCount) {
				var5 = npc[npcIds[var4 - playerCount]];
			} else {
				var5 = players[playerIds[var4]];
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
				if (var4 >= playerCount) {
					NpcType var12 = ((ClientNpc) var5).type;
					if (var12.multinpc != null) {
						var12 = var12.getMultiNpc();
					}
					if (var12.headicon >= 0 && headiconsPrayer.length > var12.headicon) {
						getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() + 15, var5);
						if (projectX > -1) {
							headiconsPrayer[var12.headicon].plotSprite(projectX + arg0 - 12, projectY + -30 + arg1);
						}
					}
					HintArrow[] var13 = field1171;
					for (int var14 = 0; var14 < var13.length; var14++) {
						HintArrow var15 = var13[var14];
						if (var15 != null && var15.hintType == 1 && var15.hintTarget == npcIds[var4 - playerCount] && loopCycle % 20 < 10) {
							getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() + 15, var5);
							if (projectX > -1) {
								headiconsHint[var15.field2137].plotSprite(projectX + arg0 - 12, projectY + arg1 - 28);
							}
						}
					}
				} else {
					int var7 = 30;
					ClientPlayer var8 = (ClientPlayer) var5;
					if (var8.headiconPk != -1 || var8.headiconPrayer != -1) {
						getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() + 15, var5);
						if (projectX > -1) {
							if (var8.headiconPk != -1) {
								headiconsPk[var8.headiconPk].plotSprite(projectX + arg0 - 12, projectY + -30 + arg1);
								var7 += 25;
							}
							if (var8.headiconPrayer != -1) {
								headiconsPrayer[var8.headiconPrayer].plotSprite(arg0 + projectX - 12, arg1 - -projectY + -var7);
								var7 += 25;
							}
						}
					}
					if (var4 >= 0) {
						HintArrow[] var9 = field1171;
						for (int var10 = 0; var10 < var9.length; var10++) {
							HintArrow var11 = var9[var10];
							if (var11 != null && var11.hintType == 10 && playerIds[var4] == var11.hintTarget) {
								getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() + 15, var5);
								if (projectX > -1) {
									headiconsHint[var11.field2137].plotSprite(arg0 + projectX - 12, arg1 - (-projectY + var7));
								}
							}
						}
					}
				}
				if (var5.chat != null && (playerCount <= var4 || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var5).name))) {
					getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight(), var5);
					if (projectX > -1 && MAX_CHATS > chatCount) {
						chatWidth[chatCount] = b12.stringWid(var5.chat) / 2;
						chatHeight[chatCount] = b12.ascent;
						chatX[chatCount] = projectX;
						chatY[chatCount] = projectY;
						chatColour[chatCount] = var5.chatColour;
						chatEffect[chatCount] = var5.chatEffect;
						chatTimer[chatCount] = var5.chatTimer;
						chats[chatCount] = var5.chat;
						chatCount++;
					}
				}
				if (var5.combatCycle > loopCycle) {
					getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() + 15, var5);
					if (projectX > -1) {
						Pix2D.fillRect(arg0 + projectX - 15, projectY + -3 + arg1, var5.field4109, 5, 65280);
						Pix2D.fillRect(var5.field4109 + arg0 + projectX - 15, arg1 + -3 + projectY, 30 - var5.field4109, 5, 16711680);
					}
				}
				for (int var16 = 0; var16 < 4; var16++) {
					if (loopCycle < var5.damageCycles[var16]) {
						getOverlayPos(arg3 >> 1, arg2 >> 1, var5.getHeight() / 2, var5);
						if (projectX > -1) {
							if (var16 == 1) {
								projectY -= 20;
							}
							if (var16 == 2) {
								projectY -= 10;
								projectX -= 15;
							}
							if (var16 == 3) {
								projectY -= 10;
								projectX += 15;
							}
							hitmarks[var5.damageTypes[var16]].plotSprite(arg0 + projectX - 12, arg1 + -12 + projectY);
							p11.centreString(JagString.parseInt(var5.damageValues[var16]), arg0 + projectX - 1, projectY + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var17 = 0; var17 < chatCount; var17++) {
			int var18 = chatX[var17];
			int var19 = chatY[var17];
			int var20 = chatWidth[var17];
			boolean var21 = true;
			int var22 = chatHeight[var17];
			while (var21) {
				var21 = false;
				for (int var23 = 0; var23 < var17; var23++) {
					if (chatY[var23] - chatHeight[var23] < var19 + 2 && var19 - var22 < chatY[var23] + 2 && var18 - var20 < chatX[var23] - -chatWidth[var23] && chatX[var23] - chatWidth[var23] < var20 + var18 && var19 > chatY[var23] - chatHeight[var23]) {
						var19 = chatY[var23] - chatHeight[var23];
						var21 = true;
					}
				}
			}
			projectX = chatX[var17];
			projectY = chatY[var17] = var19;
			JagString var24 = chats[var17];
			if (chatEffects == 0) {
				int var25 = 16776960;
				if (chatColour[var17] < 6) {
					var25 = CHAT_COLOURS[chatColour[var17]];
				}
				if (chatColour[var17] == 6) {
					var25 = sceneCycle % 20 >= 10 ? 16776960 : 16711680;
				}
				if (chatColour[var17] == 7) {
					var25 = sceneCycle % 20 >= 10 ? 65535 : 255;
				}
				if (chatColour[var17] == 8) {
					var25 = sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (chatColour[var17] == 9) {
					int var26 = 150 - chatTimer[var17];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16384000 + 16776960 - var26 * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}
				if (chatColour[var17] == 10) {
					int var27 = 150 - chatTimer[var17];
					if (var27 < 50) {
						var25 = var27 * 5 + 16711680;
					} else if (var27 < 100) {
						var25 = 16711935 - (var27 - 50) * 327680;
					} else if (var27 < 150) {
						var25 = var27 * 327680 + 500 + 255 - var27 * 5 - 32768000;
					}
				}
				if (chatColour[var17] == 11) {
					int var28 = 150 - chatTimer[var17];
					if (var28 < 50) {
						var25 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var25 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var25 = 16777215 - (var28 - 100) * 327680;
					}
				}
				if (chatEffect[var17] == 0) {
					b12.centreString(var24, arg0 + projectX, projectY + arg1, var25, 0);
				}
				if (chatEffect[var17] == 1) {
					b12.centreStringWave(var24, projectX + arg0, projectY + arg1, var25, sceneCycle);
				}
				if (chatEffect[var17] == 2) {
					b12.centreStringWave2(var24, arg0 + projectX, arg1 - -projectY, var25, sceneCycle);
				}
				if (chatEffect[var17] == 3) {
					b12.centreStringWave3(var24, projectX + arg0, arg1 + projectY, var25, sceneCycle, 150 - chatTimer[var17]);
				}
				if (chatEffect[var17] == 4) {
					int var29 = (150 - chatTimer[var17]) * (b12.stringWid(var24) + 100) / 150;
					Pix2D.setSubClipping(arg0 + projectX - 50, arg1, arg0 + projectX + 50, arg1 + arg2);
					b12.drawString(var24, arg0 + projectX + 50 - var29, arg1 - -projectY, var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (chatEffect[var17] == 5) {
					int var30 = 0;
					int var31 = 150 - chatTimer[var17];
					if (var31 < 25) {
						var30 = var31 - 25;
					} else if (var31 > 125) {
						var30 = var31 - 125;
					}
					Pix2D.setSubClipping(arg0, projectY + arg1 - b12.ascent - 1, arg3 + arg0, projectY + arg1 + 5);
					b12.centreString(var24, arg0 + projectX, arg1 + (projectY - -var30), var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				b12.centreString(var24, arg0 + projectX, arg1 + projectY, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("nf.a(IIIIIII)V")
	public static void coordArrow(int arg0, int arg1, int arg2, int arg3) {
		HintArrow[] var4 = field1171;
		for (int var5 = 0; var5 < var4.length; var5++) {
			HintArrow var6 = var4[var5];
			if (var6 != null && var6.hintType == 2) {
				getOverlayPos(arg2 >> 1, var6.hintHeight * 2, (var6.hintTileX - mapBuildBaseX << 7) + var6.hintOffsetX, arg3 >> 1, var6.hintOffsetZ + (var6.hintTileZ - mapBuildBaseZ << 7));
				if (projectX > -1 && loopCycle % 20 < 10) {
					headiconsHint[var6.field2137].plotSprite(arg0 + projectX - 12, projectY + (arg1 - 28));
				}
			}
		}
	}

	@ObfuscatedName("aj.a(IIIIB)V")
	public static void otherOverlays(int arg0, int arg1, int arg2, int arg3) {
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossX - 8, crossY + -8);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossX - 8, crossY + -8);
		}
		getSpecialArea();
		if (showFps) {
			int var4 = arg0 + 512 - 5;
			int var5 = arg2 + 20;
			p12.rightString(JagString.join(new JagString[]{field3569, JagString.parseInt(GameShell.fps)}), var4, var5, 16776960, -1);
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
			p12.rightString(JagString.join(new JagString[]{field3921, JagString.parseInt(var8), field2007}), var4, var9, var6, -1);
			var5 = var9 + 15;
		}
	}

	@ObfuscatedName("nh.a(IIIIILu;I)V")
	public static void getOverlayPos(int arg0, int arg1, int arg2, ClientEntity arg3) {
		getOverlayPos(arg1, arg2, arg3.x, arg0, arg3.z);
	}

	@ObfuscatedName("ij.a(IIIIIBII)V")
	public static void getOverlayPos(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < 128 || arg4 < 128 || arg2 > 13056 || arg4 > 13056) {
			projectX = -1;
			projectY = -1;
			return;
		}
		int var5 = getAvH(arg2, arg4, minusedlevel) - arg1;
		int var6 = arg4 - camZ;
		int var7 = arg2 - camX;
		int var8 = var5 - camY;
		int var9 = Pix3D.sinTable[camPitch];
		int var10 = Pix3D.cosTable[camPitch];
		int var11 = Pix3D.cosTable[camYaw];
		int var12 = Pix3D.sinTable[camYaw];
		int var13 = var11 * var7 + var6 * var12 >> 16;
		int var14 = var11 * var6 - var12 * var7 >> 16;
		int var16 = var10 * var8 - var9 * var14 >> 16;
		int var17 = var8 * var9 + var10 * var14 >> 16;
		if (var17 < 50) {
			projectX = -1;
			projectY = -1;
		} else {
			projectY = (var16 << 9) / var17 + arg0;
			projectX = arg3 + (var13 << 9) / var17;
		}
	}

	@ObfuscatedName("w.a(IIII)I")
	public static int getAvH(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 7;
		int var4 = arg0 >> 7;
		if (var4 < 0 || var3 < 0 || var4 > 103 || var3 > 103) {
			return 0;
		}
		int var5 = arg1 & 0x7F;
		int var6 = arg2;
		int var7 = arg0 & 0x7F;
		if (arg2 < 3 && (ClientBuild.mapl[1][var4][var3] & 0x2) == 2) {
			var6 = arg2 + 1;
		}
		int var8 = ClientBuild.groundh[var6][var4 + 1][var3] * var7 + (128 - var7) * ClientBuild.groundh[var6][var4][var3] >> 7;
		int var9 = ClientBuild.groundh[var6][var4 + 1][var3 + 1] * var7 + ClientBuild.groundh[var6][var4][var3 + 1] * (128 - var7) >> 7;
		return var5 * var9 + (128 - var5) * var8 >> 7;
	}

	@ObfuscatedName("di.a(ZB)V")
	public static void rebuildPacket(boolean arg0) {
		regionmode = arg0;
		if (!regionmode) {
			int var1 = (psize - in.pos) / 16;
			field268 = new int[var1][4];
			for (int var2 = 0; var2 < var1; var2++) {
				for (int var3 = 0; var3 < 4; var3++) {
					field268[var2][var3] = in.g4_alt1();
				}
			}
			int var4 = in.g2_alt2();
			boolean var5 = false;
			int var6 = in.g2_alt3();
			int var7 = in.g2();
			int var8 = in.g1_alt3();
			int var9 = in.g2();
			field2402 = new int[var1];
			ClientBuild.field2731 = new int[var1];
			ClientBuild.field774 = new byte[var1][];
			field453 = new int[var1];
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
						field453[var10] = -1;
						field2402[var10] = -1;
					} else {
						ClientBuild.field2731[var10] = var13;
						field453[var10] = maps.getGroupId(JagString.join(new JagString[] { field4018, JagString.parseInt(var11), field933, JagString.parseInt(var12) }));
						field2402[var10] = maps.getGroupId(JagString.join(new JagString[] { field1928, JagString.parseInt(var11), field933, JagString.parseInt(var12) }));
					}
					var10++;
				}
			}
			startRebuild(var8, var9, var7, var4, var6);
			return;
		}
		int var14 = in.g1();
		int var15 = in.g2_alt1();
		int var16 = in.g2_alt3();
		in.gBitStart();
		for (int var17 = 0; var17 < 4; var17++) {
			for (int var18 = 0; var18 < 13; var18++) {
				for (int var19 = 0; var19 < 13; var19++) {
					int var20 = in.gBit(1);
					if (var20 == 1) {
						ClientBuild.zoneMapArchiveIds[var17][var18][var19] = in.gBit(26);
					} else {
						ClientBuild.zoneMapArchiveIds[var17][var18][var19] = -1;
					}
				}
			}
		}
		in.gBitEnd();
		int var21 = (psize - in.pos) / 16;
		field268 = new int[var21][4];
		for (int var22 = 0; var22 < var21; var22++) {
			for (int var23 = 0; var23 < 4; var23++) {
				field268[var22][var23] = in.g4();
			}
		}
		int var24 = in.g2_alt1();
		int var25 = in.g2();
		field453 = new int[var21];
		field2402 = new int[var21];
		ClientBuild.field3221 = new byte[var21][];
		ClientBuild.field2731 = new int[var21];
		ClientBuild.field774 = new byte[var21][];
		int var26 = 0;
		for (int var27 = 0; var27 < 4; var27++) {
			for (int var28 = 0; var28 < 13; var28++) {
				for (int var29 = 0; var29 < 13; var29++) {
					int var30 = ClientBuild.zoneMapArchiveIds[var27][var28][var29];
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
							field453[var26] = maps.getGroupId(JagString.join(new JagString[] { field4018, JagString.parseInt(var35), field933, JagString.parseInt(var36) }));
							field2402[var26] = maps.getGroupId(JagString.join(new JagString[] { field1928, JagString.parseInt(var35), field933, JagString.parseInt(var36) }));
							var26++;
						}
					}
				}
			}
		}
		startRebuild(var14, var16, var15, var25, var24);
	}

	@ObfuscatedName("l.a(IIIIBI)V")
	public static void startRebuild(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 == mapBuildCentreZoneX && mapBuildCentreZoneZ == arg3 && (arg0 == lastBuiltLevel || !lowMem)) {
			return;
		}
		lastBuiltLevel = arg0;
		if (!lowMem) {
			lastBuiltLevel = 0;
		}
		mapBuildCentreZoneZ = arg3;
		mapBuildCentreZoneX = arg2;
		setMainState(25);
		messageBox(Text.LOADING, true);
		int var5 = mapBuildBaseX;
		int var6 = mapBuildBaseZ;
		mapBuildBaseZ = arg3 * 8 - 48;
		int var7 = mapBuildBaseZ - var6;
		mapBuildBaseX = (arg2 - 6) * 8;
		int var8 = mapBuildBaseX - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			ClientNpc var10 = npc[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < 10; var11++) {
					var10.routeX[var11] -= var8;
					var10.routeZ[var11] -= var7;
				}
				var10.z -= var7 * 128;
				var10.x -= var8 * 128;
			}
		}
		for (int var12 = 0; var12 < 2048; var12++) {
			ClientPlayer var13 = players[var12];
			if (var13 != null) {
				for (int var14 = 0; var14 < 10; var14++) {
					var13.routeX[var14] -= var8;
					var13.routeZ[var14] -= var7;
				}
				var13.x -= var8 * 128;
				var13.z -= var7 * 128;
			}
		}
		minusedlevel = arg0;
		byte var15 = 0;
		byte var16 = 104;
		localPlayer.teleport(false, arg4, arg1);
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
						groundObj[var25][var21][var22] = groundObj[var25][var23][var24];
					} else {
						groundObj[var25][var21][var22] = null;
					}
				}
			}
		}
		for (LocChange var26 = (LocChange) locChanges.head(); var26 != null; var26 = (LocChange) locChanges.next()) {
			var26.field3059 -= var8;
			var26.field3052 -= var7;
			if (var26.field3059 < 0 || var26.field3052 < 0 || var26.field3059 >= 104 || var26.field3052 >= 104) {
				var26.unlink();
			}
		}
		if (minimapFlagX != 0) {
			minimapFlagX -= var8;
			minimapFlagZ -= var7;
		}
		minimapLevel = -1;
		cinemaCam = false;
		waveCount = 0;
		spotanims.clear();
		projectiles.clear();
	}

	@ObfuscatedName("mc.a(ZB)V")
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
		out.p1Enc(19);
		try {
			stream.write(out.pos, out.data);
			out.pos = 0;
		} catch (IOException var1) {
			networkError = true;
		}
	}

	@ObfuscatedName("wc.b(II)V")
	public static void minimapBuildBuffer(int arg0) {
		SoftwarePix32 var1;
		if (field2010 == null) {
			var1 = new SoftwarePix32(512, 512);
		} else {
			var1 = (SoftwarePix32) field2010;
		}
		int[] var2 = var1.data;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 1;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 2048 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((ClientBuild.mapl[arg0][var7][var5] & 0x18) == 0) {
					World.render2DGround(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var7][var5] & 0x8) != 0) {
					World.render2DGround(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		var1.setPixels();
		int var8 = (int) (Math.random() * 20.0D) + 228 << 16;
		int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) + 228 << 8) - (-((int) (Math.random() * 20.0D)) - 238)) - 10;
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((ClientBuild.mapl[arg0][var11][var10] & 0x18) == 0) {
					drawDetail(var10, var8, arg0, var9, var11);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var11][var10] & 0x8) != 0) {
					drawDetail(var10, var8, arg0 + 1, var9, var11);
				}
			}
		}
		field930 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				long var14 = World.gdType(minusedlevel, var12, var13);
				if (var14 != 0L) {
					LocType var16 = LocType.list(Integer.MAX_VALUE & (int) (var14 >>> 32));
					int var17 = var16.mapfunction;
					if (var17 >= 0) {
						int var18 = var12;
						int var19 = var13;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							int[][] var20 = collision[minusedlevel].flags;
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
						field2745[field930] = var16.id;
						field2577[field930] = var18;
						field2501[field930] = var19;
						field930++;
					}
				}
			}
		}
		field2010 = var1;
		drawArea.bind();
	}

	@ObfuscatedName("re.b(I)V")
	public static void checkMinimap() {
		if (lowMem && minusedlevel != lastBuiltLevel) {
			startRebuild(minusedlevel, localPlayer.routeZ[0], mapBuildCentreZoneX, mapBuildCentreZoneZ, localPlayer.routeX[0]);
		} else if (minusedlevel != minimapLevel) {
			minimapLevel = minusedlevel;
			minimapBuildBuffer(minusedlevel);
		}
	}

	@ObfuscatedName("qj.c(Z)V")
	public static void mapBuildLoop() {
		preventTimeout(false);
		boolean var0 = true;
		field3754 = 0;
		for (int var1 = 0; var1 < ClientBuild.field3221.length; var1++) {
			if (field453[var1] != -1 && ClientBuild.field3221[var1] == null) {
				ClientBuild.field3221[var1] = maps.getFile(0, field453[var1]);
				if (ClientBuild.field3221[var1] == null) {
					var0 = false;
					field3754++;
				}
			}
			if (field2402[var1] != -1 && ClientBuild.field774[var1] == null) {
				ClientBuild.field774[var1] = maps.fetchFile(field268[var1], field2402[var1], 0);
				if (ClientBuild.field774[var1] == null) {
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
			byte[] var4 = ClientBuild.field774[var3];
			if (var4 != null) {
				int var5 = (ClientBuild.field2731[var3] >> 8) * 64 - mapBuildBaseX;
				int var6 = (ClientBuild.field2731[var3] & 0xFF) * 64 - mapBuildBaseZ;
				if (regionmode) {
					var5 = 10;
					var6 = 10;
				}
				var2 &= ClientBuild.checkLocations(var4, var6, var5);
			}
		}
		if (!var2) {
			field3861 = 2;
			return;
		}
		if (field3861 != 0) {
			messageBox(JagString.join(new JagString[] { Text.LOADING, field4190 }), true);
		}
		doAudio();
		clearCaches();
		World.resetMap();
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
		BgSound.reset();
		doAudio();
		System.gc();
		doAudio();
		preventTimeout(true);
		ClientBuild.init();
		if (!regionmode) {
			ClientBuild.loadGround();
			preventTimeout(true);
			ClientBuild.loadLocations();
		}
		if (regionmode) {
			ClientBuild.loadGroundRegion();
			preventTimeout(true);
			ClientBuild.loadLocationsRegion();
		}
		clearCaches();
		preventTimeout(true);
		doAudio();
		ClientBuild.finishBuild(collision);
		preventTimeout(true);
		doAudio();
		int var11 = ClientBuild.minusedlevel;
		if (minusedlevel < var11) {
			var11 = minusedlevel;
		}
		if (var11 < minusedlevel - 1) {
		}
		if (lowMem) {
			World.fillBaseLevel(ClientBuild.minusedlevel);
		} else {
			World.fillBaseLevel(0);
		}
		ClientBuild.quit();
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				showObject(var12, var13);
			}
		}
		doAudio();
		locChangePostBuildCorrect();
		clearCaches();
		if (frame != null) {
			// WINDOW_STATUS
			out.p1Enc(198);
			out.p4(1057001181);
		}
		if (!regionmode) {
			int var14 = (mapBuildCentreZoneX - 6) / 8;
			int var15 = (mapBuildCentreZoneZ - 6) / 8;
			int var16 = (mapBuildCentreZoneX + 6) / 8;
			int var17 = (mapBuildCentreZoneZ + 6) / 8;
			for (int var18 = var14 - 1; var18 <= var16 + 1; var18++) {
				for (int var19 = var15 - 1; var19 <= var17 + 1; var19++) {
					if (var14 > var18 || var16 < var18 || var19 < var15 || var19 > var17) {
						maps.updateCacheHint(JagString.join(new JagString[] { field4018, JagString.parseInt(var18), field933, JagString.parseInt(var19) }));
						maps.updateCacheHint(JagString.join(new JagString[] { field1928, JagString.parseInt(var18), field933, JagString.parseInt(var19) }));
					}
				}
			}
		}
		setMainState(30);
		doAudio();
		// MAP_BUILD_COMPLETE
		out.p1Enc(213);
		doneslowupdate();
	}

	@ObfuscatedName("lh.a(IIZIII)V")
	public static void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		long var5 = World.wallType(arg2, arg4, arg0);
		if (var5 != 0L) {
			int var7 = (int) var5 >> 20 & 0x3;
			int var8 = (int) var5 >> 14 & 0x1F;
			int var9 = arg3;
			int[] var10 = Pix2D.pixels;
			int var11 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			int var12 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
			if (var5 > 0L) {
				var9 = arg1;
			}
			LocType var13 = LocType.list(var12);
			if (var13.mapscene == -1) {
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
				SoftwarePix8 var14 = mapscene[var13.mapscene];
				if (var14 != null) {
					int var15 = (var13.width * 4 - var14.wi) / 2;
					int var16 = (var13.length * 4 - var14.hi) / 2;
					var14.plotSprite(arg4 * 4 + var15 + 48, 48 - -((104 - (arg0 - -var13.length)) * 4) + var16);
				}
			}
		}
		long var17 = World.sceneType(arg2, arg4, arg0);
		if (var17 != 0L) {
			int var19 = (int) var17 >> 20 & 0x3;
			int var20 = (int) var17 >> 14 & 0x1F;
			int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
			LocType var22 = LocType.list(var21);
			if (var22.mapscene != -1) {
				SoftwarePix8 var23 = mapscene[var22.mapscene];
				if (var23 != null) {
					int var24 = (var22.width * 4 - var23.wi) / 2;
					int var25 = (var22.length * 4 - var23.hi) / 2;
					var23.plotSprite(arg4 * 4 + var24 + 48, var25 + (-var22.length + -arg0 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = Pix2D.pixels;
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
		long var29 = World.gdType(arg2, arg4, arg0);
		if (var29 == 0L) {
			return;
		}
		int var31 = Integer.MAX_VALUE & (int) (var29 >>> 32);
		LocType var32 = LocType.list(var31);
		if (var32.mapscene != -1) {
			SoftwarePix8 var33 = mapscene[var32.mapscene];
			if (var33 != null) {
				int var34 = (var32.width * 4 - var33.wi) / 2;
				int var35 = (var32.length * 4 - var33.hi) / 2;
				var33.plotSprite(var34 + arg4 * 4 + 48, (-arg0 + 104 + -var32.length) * 4 + 48 - -var35);
			}
		}
	}

	@ObfuscatedName("jc.a(IIJI)Z")
	public static boolean interactWithLoc(int arg0, long arg1, int arg2) {
		int var4 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		int var5 = (int) arg1 >> 14 & 0x1F;
		int var6 = (int) arg1 >> 20 & 0x3;
		if (var5 == 10 || var5 == 11 || var5 == 22) {
			LocType var7 = LocType.list(var4);
			int var8;
			int var9;
			if (var6 == 0 || var6 == 2) {
				var8 = var7.length;
				var9 = var7.width;
			} else {
				var9 = var7.length;
				var8 = var7.width;
			}
			int var10 = var7.forceapproach;
			if (var6 != 0) {
				var10 = (var10 << var6 & 0xF) + (var10 >> 4 - var6);
			}
			tryMove(var8, 0, arg0, arg2, localPlayer.routeX[0], var9, 0, 2, true, var10, localPlayer.routeZ[0]);
		} else {
			tryMove(0, var6, arg0, arg2, localPlayer.routeX[0], 0, var5 + 1, 2, true, 0, localPlayer.routeZ[0]);
		}
		crossY = ClientMouseListener.mouseClickY;
		crossMode = 2;
		crossX = ClientMouseListener.mouseClickX;
		crossCycle = 0;
		return true;
	}

	@ObfuscatedName("t.a(IIIIIIIIIZII)Z")
	public static boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
		if (localPlayer.size == 2) {
			return tryMove2(arg8, arg10, arg5, arg0, arg4, arg6, arg1, arg3, arg9, arg7, arg2);
		} else if (localPlayer.size > 2) {
			return tryMove2P(arg5, arg3, localPlayer.size, arg6, arg2, arg4, arg1, arg8, arg10, arg7, arg9, arg0);
		} else {
			return tryMoveN(arg2, arg6, arg10, arg4, arg3, arg0, arg1, arg5, arg7, arg9, arg8);
		}
	}

	@ObfuscatedName("jj.a(ZIIIIIIIIIII)Z")
	public static boolean tryMove2(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				dirMap[var11][var12] = 0;
				distMap[var11][var12] = 99999999;
			}
		}
		dirMap[arg4][arg1] = 99;
		distMap[arg4][arg1] = 0;
		int var13 = arg4;
		int var14 = arg1;
		byte var15 = 0;
		routeX[0] = arg4;
		int var30 = var15 + 1;
		routeZ[0] = arg1;
		boolean var16 = false;
		int var17 = 0;
		int[][] var18 = collision[minusedlevel].flags;
		while (var30 != var17) {
			var13 = routeX[var17];
			var14 = routeZ[var17];
			var17 = var17 + 1 & 0xFFF;
			if (var13 == arg7 && arg10 == var14) {
				var16 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && collision[minusedlevel].testWall(var14, arg5 - 1, arg7, arg10, 2, arg6, var13)) {
					var16 = true;
					break;
				}
				if (arg5 < 10 && collision[minusedlevel].testWDecor(arg6, var13, arg5 - 1, arg10, 2, var14, arg7)) {
					var16 = true;
					break;
				}
			}
			if (arg2 != 0 && arg3 != 0 && collision[minusedlevel].testLoc(2, arg10, arg2, var14, arg3, var13, arg7, arg8)) {
				var16 = true;
				break;
			}
			int var19 = distMap[var13][var14] + 1;
			if (var13 > 0 && dirMap[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14;
				dirMap[var13 - 1][var14] = 2;
				var30 = var30 + 1 & 0xFFF;
				distMap[var13 - 1][var14] = var19;
			}
			if (var13 < 102 && dirMap[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14;
				dirMap[var13 + 1][var14] = 8;
				var30 = var30 + 1 & 0xFFF;
				distMap[var13 + 1][var14] = var19;
			}
			if (var14 > 0 && dirMap[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
				routeX[var30] = var13;
				routeZ[var30] = var14 - 1;
				dirMap[var13][var14 - 1] = 1;
				var30 = var30 + 1 & 0xFFF;
				distMap[var13][var14 - 1] = var19;
			}
			if (var14 < 102 && dirMap[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
				routeX[var30] = var13;
				routeZ[var30] = var14 + 1;
				dirMap[var13][var14 + 1] = 4;
				distMap[var13][var14 + 1] = var19;
				var30 = var30 + 1 & 0xFFF;
			}
			if (var13 > 0 && var14 > 0 && dirMap[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14 - 1;
				dirMap[var13 - 1][var14 - 1] = 3;
				var30 = var30 + 1 & 0xFFF;
				distMap[var13 - 1][var14 - 1] = var19;
			}
			if (var13 < 102 && var14 > 0 && dirMap[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 + 1][var14 - 1] = 9;
				distMap[var13 + 1][var14 - 1] = var19;
			}
			if (var13 > 0 && var14 < 102 && dirMap[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 - 1][var14 + 1] = 6;
				distMap[var13 - 1][var14 + 1] = var19;
			}
			if (var13 < 102 && var14 < 102 && dirMap[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 + 1][var14 + 1] = 12;
				distMap[var13 + 1][var14 + 1] = var19;
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
					if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && distMap[var22][var23] < 100) {
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
						if (var20 > var26 || var20 == var26 && var21 > distMap[var22][var23]) {
							var21 = distMap[var22][var23];
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
		routeX[0] = var13;
		int var31 = var27 + 1;
		routeZ[0] = var14;
		int var28;
		int var29 = var28 = dirMap[var13][var14];
		while (var13 != arg4 || var14 != arg1) {
			if (var29 != var28) {
				var28 = var29;
				routeX[var31] = var13;
				routeZ[var31++] = var14;
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
			var29 = dirMap[var13][var14];
		}
		if (var31 > 0) {
			moveClick(arg9, routeX, routeZ, var31);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("wb.a(IIIIIIIZIIIII)Z")
	public static boolean tryMove2P(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				dirMap[var12][var13] = 0;
				distMap[var12][var13] = 99999999;
			}
		}
		dirMap[arg5][arg8] = 99;
		distMap[arg5][arg8] = 0;
		int var14 = arg5;
		int var15 = arg8;
		int var16 = 0;
		boolean var17 = false;
		byte var18 = 0;
		routeX[0] = arg5;
		int var39 = var18 + 1;
		routeZ[0] = arg8;
		int[][] var19 = collision[minusedlevel].flags;
		label367: while (var16 != var39) {
			var15 = routeZ[var16];
			var14 = routeX[var16];
			var16 = var16 + 1 & 0xFFF;
			if (var14 == arg1 && arg4 == var15) {
				var17 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && collision[minusedlevel].testWall(var15, arg3 - 1, arg1, arg4, arg2, arg6, var14)) {
					var17 = true;
					break;
				}
				if (arg3 < 10 && collision[minusedlevel].testWDecor(arg6, var14, arg3 - 1, arg4, arg2, var15, arg1)) {
					var17 = true;
					break;
				}
			}
			if (arg0 != 0 && arg11 != 0 && collision[minusedlevel].testLoc(arg2, arg4, arg0, var15, arg11, var14, arg1, arg10)) {
				var17 = true;
				break;
			}
			int var20 = distMap[var14][var15] + 1;
			if (var14 > 0 && dirMap[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg2 - 1] & 0x12C0138) == 0) {
				int var21 = 1;
				while (true) {
					if (arg2 - 1 <= var21) {
						routeX[var39] = var14 - 1;
						routeZ[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14 - 1][var15] = 2;
						distMap[var14 - 1][var15] = var20;
						break;
					}
					if ((var19[var14 - 1][var21 + var15] & 0x12C013E) != 0) {
						break;
					}
					var21++;
				}
			}
			if (var14 < 102 && dirMap[var14 + 1][var15] == 0 && (var19[var14 + arg2][var15] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1] & 0x12C01E0) == 0) {
				int var22 = 1;
				while (true) {
					if (var22 >= arg2 - 1) {
						routeX[var39] = var14 + 1;
						routeZ[var39] = var15;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14 + 1][var15] = 8;
						distMap[var14 + 1][var15] = var20;
						break;
					}
					if ((var19[var14 + arg2][var22 + var15] & 0x12C01E3) != 0) {
						break;
					}
					var22++;
				}
			}
			if (var15 > 0 && dirMap[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var23 = 1;
				while (true) {
					if (arg2 - 1 <= var23) {
						routeX[var39] = var14;
						routeZ[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14][var15 - 1] = 1;
						distMap[var14][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 + var23][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var23++;
				}
			}
			if (var15 < 102 && dirMap[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14 - 1][var15 + arg2] & 0x12C01E0) == 0) {
				int var24 = 1;
				while (true) {
					if (var24 >= arg2 - 1) {
						routeX[var39] = var14;
						routeZ[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14][var15 + 1] = 4;
						distMap[var14][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 + var24][arg2 + var15] & 0x12C01F8) != 0) {
						break;
					}
					var24++;
				}
			}
			if (var14 > 0 && var15 > 0 && dirMap[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
				int var25 = 1;
				while (true) {
					if (var25 >= arg2 - 1) {
						routeX[var39] = var14 - 1;
						routeZ[var39] = var15 - 1;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14 - 1][var15 - 1] = 3;
						distMap[var14 - 1][var15 - 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var15 + var25 - 1] & 0x12C013E) != 0 || (var19[var14 + var25 - 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var25++;
				}
			}
			if (var14 < 102 && var15 > 0 && dirMap[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 + arg2 - 1 - 1] & 0x12C01E0) == 0) {
				int var26 = 1;
				while (true) {
					if (arg2 - 1 <= var26) {
						routeX[var39] = var14 + 1;
						routeZ[var39] = var15 - 1;
						dirMap[var14 + 1][var15 - 1] = 9;
						distMap[var14 + 1][var15 - 1] = var20;
						var39 = var39 + 1 & 0xFFF;
						break;
					}
					if ((var19[var14 + arg2][var26 + var15 - 1] & 0x12C01E3) != 0 || (var19[var14 + var26 + 1][var15 - 1] & 0x12C018F) != 0) {
						break;
					}
					var26++;
				}
			}
			if (var14 > 0 && var15 < 102 && dirMap[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg2] & 0x12C01E0) == 0) {
				int var27 = 1;
				while (true) {
					if (var27 >= arg2 - 1) {
						routeX[var39] = var14 - 1;
						routeZ[var39] = var15 + 1;
						var39 = var39 + 1 & 0xFFF;
						dirMap[var14 - 1][var15 + 1] = 6;
						distMap[var14 - 1][var15 + 1] = var20;
						break;
					}
					if ((var19[var14 - 1][var27 + var15 + 1] & 0x12C013E) != 0 || (var19[var14 + var27 - 1][var15 + arg2] & 0x12C01F8) != 0) {
						break;
					}
					var27++;
				}
			}
			if (var14 < 102 && var15 < 102 && dirMap[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg2 + var15] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[arg2 + var14][var15 + 1] & 0x12C0183) == 0) {
				for (int var28 = 1; var28 < arg2 - 1; var28++) {
					if ((var19[var28 + var14 + 1][var15 + arg2] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var28 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				routeX[var39] = var14 + 1;
				routeZ[var39] = var15 + 1;
				var39 = var39 + 1 & 0xFFF;
				dirMap[var14 + 1][var15 + 1] = 12;
				distMap[var14 + 1][var15 + 1] = var20;
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
					if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && distMap[var31][var32] < 100) {
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
						if (var29 > var35 || var29 == var35 && var30 > distMap[var31][var32]) {
							var14 = var31;
							var29 = var35;
							var30 = distMap[var31][var32];
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
		routeX[0] = var14;
		int var40 = var36 + 1;
		routeZ[0] = var15;
		int var37;
		int var38 = var37 = dirMap[var14][var15];
		while (var14 != arg5 || var15 != arg8) {
			if (var38 != var37) {
				var37 = var38;
				routeX[var40] = var14;
				routeZ[var40++] = var15;
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
			var38 = dirMap[var14][var15];
		}
		if (var40 > 0) {
			moveClick(arg9, routeX, routeZ, var40);
			return true;
		} else if (arg9 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ja.a(IIIIIIIIIIIZ)Z")
	public static boolean tryMoveN(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				dirMap[var11][var12] = 0;
				distMap[var11][var12] = 99999999;
			}
		}
		dirMap[arg3][arg2] = 99;
		int var13 = arg3;
		distMap[arg3][arg2] = 0;
		int var14 = arg2;
		byte var15 = 0;
		routeX[0] = arg3;
		int var16 = 0;
		int var30 = var15 + 1;
		routeZ[0] = arg2;
		int[][] var17 = collision[minusedlevel].flags;
		boolean var18 = false;
		while (var16 != var30) {
			var14 = routeZ[var16];
			var13 = routeX[var16];
			var16 = var16 + 1 & 0xFFF;
			if (var13 == arg4 && arg0 == var14) {
				var18 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && collision[minusedlevel].testWall(var14, arg1 - 1, arg4, arg0, 1, arg6, var13)) {
					var18 = true;
					break;
				}
				if (arg1 < 10 && collision[minusedlevel].testWDecor(arg6, var13, arg1 - 1, arg0, 1, var14, arg4)) {
					var18 = true;
					break;
				}
			}
			if (arg7 != 0 && arg5 != 0 && collision[minusedlevel].testLoc(1, arg0, arg7, var14, arg5, var13, arg4, arg9)) {
				var18 = true;
				break;
			}
			int var19 = distMap[var13][var14] + 1;
			if (var13 > 0 && dirMap[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 - 1][var14] = 2;
				distMap[var13 - 1][var14] = var19;
			}
			if (var13 < 103 && dirMap[var13 + 1][var14] == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 + 1][var14] = 8;
				distMap[var13 + 1][var14] = var19;
			}
			if (var14 > 0 && dirMap[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var30] = var13;
				routeZ[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13][var14 - 1] = 1;
				distMap[var13][var14 - 1] = var19;
			}
			if (var14 < 103 && dirMap[var13][var14 + 1] == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var30] = var13;
				routeZ[var30] = var14 + 1;
				dirMap[var13][var14 + 1] = 4;
				var30 = var30 + 1 & 0xFFF;
				distMap[var13][var14 + 1] = var19;
			}
			if (var13 > 0 && var14 > 0 && dirMap[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 - 1][var14 - 1] = 3;
				distMap[var13 - 1][var14 - 1] = var19;
			}
			if (var13 < 103 && var14 > 0 && dirMap[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14 - 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 + 1][var14 - 1] = 9;
				distMap[var13 + 1][var14 - 1] = var19;
			}
			if (var13 > 0 && var14 < 103 && dirMap[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var30] = var13 - 1;
				routeZ[var30] = var14 + 1;
				var30 = var30 + 1 & 0xFFF;
				dirMap[var13 - 1][var14 + 1] = 6;
				distMap[var13 - 1][var14 + 1] = var19;
			}
			if (var13 < 103 && var14 < 103 && dirMap[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
				routeX[var30] = var13 + 1;
				routeZ[var30] = var14 + 1;
				dirMap[var13 + 1][var14 + 1] = 12;
				distMap[var13 + 1][var14 + 1] = var19;
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
					if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && distMap[var22][var23] < 100) {
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
						if (var20 > var26 || var20 == var26 && var21 > distMap[var22][var23]) {
							var21 = distMap[var22][var23];
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
		routeX[0] = var13;
		int var31 = var27 + 1;
		routeZ[0] = var14;
		int var28;
		int var29 = var28 = dirMap[var13][var14];
		while (arg3 != var13 || var14 != arg2) {
			if (var28 != var29) {
				routeX[var31] = var13;
				var28 = var29;
				routeZ[var31++] = var14;
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
			var29 = dirMap[var13][var14];
		}
		if (var31 > 0) {
			moveClick(arg8, routeX, routeZ, var31);
			return true;
		} else if (arg8 == 1) {
			return false;
		} else {
			return true;
		}
	}

	// guessing placement and name
	@ObfuscatedName("wi.a(I[I[III)V")
	public static void moveClick(int arg0, int[] arg1, int[] arg2, int arg3) {
		int var4 = arg3;
		if (arg3 > 25) {
			var4 = 25;
		}
		arg3--;
		int var5 = arg2[arg3];
		int var6 = arg1[arg3];
		if (arg0 == 0) {
			// MOVE_GAMECLICK
			out.p1Enc(200);
			out.p1(var4 + var4 + 3);
		}
		if (arg0 == 1) {
			// MOVE_MINIMAPCLICK
			out.p1Enc(199);
			out.p1(var4 + var4 + 17);
		}
		if (arg0 == 2) {
			// MOVE_OPCLICK
			out.p1Enc(159);
			out.p1(var4 + var4 + 3);
		}
		out.p2(var5 + mapBuildBaseZ);
		out.p1_alt2(ClientKeyboardListener.keyHeld[82] ? 1 : 0);
		minimapFlagX = arg1[0];
		minimapFlagZ = arg2[0];
		for (int var7 = 1; var7 < var4; var7++) {
			arg3--;
			out.p1_alt3(arg1[arg3] - var6);
			out.p1_alt2(arg2[arg3] - var5);
		}
		out.p2_alt2(var6 + mapBuildBaseX);
	}

	@ObfuscatedName("b.a(I)Z")
	public static boolean tcpIn() {
		try {
			return tcpInInner();
		} catch (IOException var3) {
			lostCon();
			return true;
		} catch (Exception var4) {
			String var1 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (localPlayer.routeX[0] + mapBuildBaseX) + "," + (localPlayer.routeZ[0] + mapBuildBaseZ) + " - ";
			for (int var2 = 0; psize > var2 && var2 < 50; var2++) {
				var1 = var1 + in.data[var2] + ",";
			}
			JagException.report(var1, var4);
			logout();
			return true;
		}
	}

	@ObfuscatedName("vg.b(Z)Z")
	public static boolean tcpInInner() throws IOException {
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
		timeoutTimer = 0;
		ptype2 = ptype1;
		ptype1 = ptype0;
		ptype0 = ptype;
		if (ptype == 239) {
			// IF_MOVESUB
			int var1 = in.g4();
			int var2 = in.g4();
			SubInterface var3 = (SubInterface) subinterfaces.find((long) var1);
			SubInterface var4 = (SubInterface) subinterfaces.find((long) var2);
			if (var4 != null) {
				closeSubInterface(var4, var3 == null || var3.id != var4.id);
			}
			if (var3 != null) {
				var3.unlink();
				subinterfaces.put((long) var2, var3);
			}
			IfType var5 = IfType.get(var1);
			if (var5 != null) {
				componentUpdated(var5);
			}
			IfType var6 = IfType.get(var2);
			if (var6 != null) {
				componentUpdated(var6);
				computeLayerLayout(true, var6);
			}
			if (toplevelinterface != -1) {
				runHookImmediate(toplevelinterface, 1);
			}
			ptype = -1;
			return true;
		} else if (ptype == 244) {
			// IF_SETPOSITION
			int var7 = in.g4_alt2();
			int var8 = in.g2b_alt2();
			int var9 = in.g2b_alt3();
			IfType var10 = IfType.get(var7);
			var10.yAlignment = 0;
			var10.renderY = var10.y = var9;
			var10.xAlignment = 0;
			var10.renderX = var10.x = var8;
			componentUpdated(var10);
			ptype = -1;
			return true;
		} else if (ptype == 79) {
			// REBUILD_NORMAL
			rebuildPacket(false);
			ptype = -1;
			return true;
		} else if (ptype == 12) {
			// IF_RESYNC
			int var11 = psize + in.pos;
			int var12 = in.g2();
			int var13 = in.g2();
			if (var12 != toplevelinterface) {
				toplevelinterface = var12;
				ifAnimReset(toplevelinterface);
				computeTopLevelInterfaceLayout();
				ScriptRunner.executeOnLoad(toplevelinterface);
				for (int var14 = 0; var14 < 100; var14++) {
					componentDirtyArea[var14] = true;
				}
			}
			while (var13-- > 0) {
				int var15 = in.g4();
				int var16 = in.g2();
				int var17 = in.g1();
				SubInterface var18 = (SubInterface) subinterfaces.find((long) var15);
				if (var18 != null && var16 != var18.id) {
					closeSubInterface(var18, true);
					var18 = null;
				}
				if (var18 == null) {
					var18 = openSubInterface(var17, var15, var16);
				}
				var18.field3235 = true;
			}
			for (SubInterface var19 = (SubInterface) subinterfaces.search(); var19 != null; var19 = (SubInterface) subinterfaces.findnext()) {
				if (var19.field3235) {
					var19.field3235 = false;
				} else {
					closeSubInterface(var19, true);
				}
			}
			serverActive = new HashTable(512);
			while (in.pos < var11) {
				int var20 = in.g4();
				int var21 = in.g2();
				int var22 = in.g2();
				int var23 = in.g4();
				for (int var24 = var21; var24 <= var22; var24++) {
					long var25 = ((long) var20 << 32) + (long) var24;
					serverActive.put(var25, new IntNode(var23));
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 192) {
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
				camY = getAvH(camX, camZ, minusedlevel) - camMoveToHei;
			}
			ptype = -1;
			return true;
		} else if (ptype == 186) {
			// UPDATE_INV_FULL
			int var27 = in.g4();
			int var28 = in.g2();
			IfType var29;
			if (var27 < 0) {
				var29 = null;
			} else {
				var29 = IfType.get(var27);
			}
			if (var29 != null) {
				for (int var30 = 0; var30 < var29.linkObjType.length; var30++) {
					var29.linkObjType[var30] = 0;
					var29.linkObjNumber[var30] = 0;
				}
			}
			if (var27 < -70000) {
				var28 += 32768;
			}
			ClientInvCache.clear(var28);
			int var31 = in.g2();
			for (int var32 = 0; var32 < var31; var32++) {
				int var33 = in.g2_alt2();
				int var34 = in.g1_alt3();
				if (var34 == 255) {
					var34 = in.g4_alt1();
				}
				if (var29 != null && var29.linkObjType.length > var32) {
					var29.linkObjType[var32] = var33;
					var29.linkObjNumber[var32] = var34;
				}
				ClientInvCache.set(var28, var34, var32, var33 - 1);
			}
			if (var29 != null) {
				componentUpdated(var29);
			}
			legacyUpdated();
			invTransmit[invTransmitNum++ & 0x1F] = var28 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 117) {
			// MESSAGE_GAME
			JagString var35 = in.gjstr();
			if (var35.endsWith(field3009)) {
				boolean var36 = false;
				JagString var37 = var35.substring(0, var35.indexOf(field1959));
				long var38 = var37.toUserhash();
				for (int var40 = 0; var40 < privateMessageCount; var40++) {
					if (messageIds[var40] == var38) {
						var36 = true;
						break;
					}
				}
				if (!var36 && chatDisabled == 0) {
					addChat(Text.TRADEREQ, 4, var37);
				}
			} else if (var35.endsWith(field3927)) {
				JagString var64 = var35.substring(0, var35.indexOf(field1959));
				boolean var65 = false;
				long var66 = var64.toUserhash();
				for (int var68 = 0; var68 < privateMessageCount; var68++) {
					if (var66 == messageIds[var68]) {
						var65 = true;
						break;
					}
				}
				if (!var65 && chatDisabled == 0) {
					JagString var69 = var35.substring(var35.indexOf(field1959) + 1, var35.length() + -9);
					addChat(var69, 8, var64);
				}
			} else if (var35.endsWith(field1556)) {
				boolean var41 = false;
				JagString var42 = var35.substring(0, var35.indexOf(field1959));
				long var43 = var42.toUserhash();
				for (int var45 = 0; var45 < privateMessageCount; var45++) {
					if (messageIds[var45] == var43) {
						var41 = true;
						break;
					}
				}
				if (!var41 && chatDisabled == 0) {
					addChat(AUTO_EMPTY, 10, var42);
				}
			} else if (var35.endsWith(field3334)) {
				JagString var63 = var35.substring(0, var35.indexOf(field3334));
				addChat(var63, 11, AUTO_EMPTY);
			} else if (var35.endsWith(field731)) {
				JagString var62 = var35.substring(0, var35.indexOf(field731));
				if (chatDisabled == 0) {
					addChat(var62, 12, AUTO_EMPTY);
				}
			} else if (var35.endsWith(field2400)) {
				JagString var46 = var35.substring(0, var35.indexOf(field2400));
				if (chatDisabled == 0) {
					addChat(var46, 13, AUTO_EMPTY);
				}
			} else if (var35.endsWith(field3025)) {
				JagString var47 = var35.substring(0, var35.indexOf(field1959));
				long var48 = var47.toUserhash();
				boolean var50 = false;
				for (int var51 = 0; var51 < privateMessageCount; var51++) {
					if (var48 == messageIds[var51]) {
						var50 = true;
						break;
					}
				}
				if (!var50 && chatDisabled == 0) {
					addChat(AUTO_EMPTY, 14, var47);
				}
			} else if (var35.endsWith(field4275)) {
				JagString var52 = var35.substring(0, var35.indexOf(field1959));
				long var53 = var52.toUserhash();
				boolean var55 = false;
				for (int var56 = 0; var56 < privateMessageCount; var56++) {
					if (messageIds[var56] == var53) {
						var55 = true;
						break;
					}
				}
				if (!var55 && chatDisabled == 0) {
					addChat(AUTO_EMPTY, 15, var52);
				}
			} else if (var35.endsWith(field665)) {
				JagString var57 = var35.substring(0, var35.indexOf(field1959));
				long var58 = var57.toUserhash();
				boolean var60 = false;
				for (int var61 = 0; var61 < privateMessageCount; var61++) {
					if (messageIds[var61] == var58) {
						var60 = true;
						break;
					}
				}
				if (!var60 && chatDisabled == 0) {
					addChat(AUTO_EMPTY, 16, var57);
				}
			} else {
				addChat(var35, 0, AUTO_EMPTY);
			}
			ptype = -1;
			return true;
		} else if (ptype == 108) {
			// UPDATE_STOCKMARKET_SLOT
			int var70 = in.g1();
			if (in.g1() == 0) {
				field140[var70] = new StockMarketSlot();
			} else {
				in.pos--;
				field140[var70] = new StockMarketSlot(in);
			}
			ptype = -1;
			field2127 = transmitNum;
			return true;
		} else if (ptype == 213) {
			// HINT_ARROW
			int var71 = in.g1();
			HintArrow var72 = new HintArrow();
			int var73 = var71 >> 6;
			var72.hintType = var71 & 0x3F;
			var72.field2137 = in.g1();
			if (var72.field2137 >= 0 && var72.field2137 < headiconsHint.length) {
				if (var72.hintType == 1 || var72.hintType == 10) {
					var72.hintTarget = in.g2();
					in.pos += 3;
				} else if (var72.hintType >= 2 && var72.hintType <= 6) {
					if (var72.hintType == 2) {
						var72.hintOffsetX = 64;
						var72.hintOffsetZ = 64;
					}
					if (var72.hintType == 3) {
						var72.hintOffsetX = 0;
						var72.hintOffsetZ = 64;
					}
					if (var72.hintType == 4) {
						var72.hintOffsetX = 128;
						var72.hintOffsetZ = 64;
					}
					if (var72.hintType == 5) {
						var72.hintOffsetX = 64;
						var72.hintOffsetZ = 0;
					}
					if (var72.hintType == 6) {
						var72.hintOffsetZ = 128;
						var72.hintOffsetX = 64;
					}
					var72.hintType = 2;
					var72.hintTileX = in.g2();
					var72.hintTileZ = in.g2();
					var72.hintHeight = in.g1();
				}
				var72.field2136 = in.g2();
				if (var72.field2136 == 65535) {
					var72.field2136 = -1;
				}
				field1171[var73] = var72;
			}
			ptype = -1;
			return true;
		} else if (ptype == 146) {
			// IF_SETEVENTS
			int var74 = in.g4_alt1();
			int var75 = in.g4_alt2();
			int var76 = in.g2();
			if (var76 == 65535) {
				var76 = -1;
			}
			int var77 = in.g2_alt3();
			if (var77 == 65535) {
				var77 = -1;
			}
			for (int var78 = var76; var78 <= var77; var78++) {
				long var79 = ((long) var75 << 32) + (long) var78;
				Linkable var81 = serverActive.find(var79);
				if (var81 != null) {
					var81.unlink();
				}
				serverActive.put(var79, new IntNode(var74));
			}
			ptype = -1;
			return true;
		} else if (ptype == 253) {
			// CAM_RESET
			cinemaCam = false;
			for (int var82 = 0; var82 < 5; var82++) {
				camShake[var82] = false;
			}
			ptype = -1;
			return true;
		} else if (ptype == 214) {
			// IF_SETTEXT
			int var83 = in.g4_alt3();
			JagString var84 = in.gjstr();
			IfType var85 = IfType.get(var83);
			if (!var84.strEquals(var85.text)) {
				var85.text = var84;
				componentUpdated(var85);
			}
			ptype = -1;
			return true;
		} else if (ptype == 19) {
			// NPC_INFO
			getNpcPos();
			ptype = -1;
			return true;
		} else if (ptype == 205) {
			// UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER
			long var86 = in.g8();
			int var88 = in.g2();
			boolean var89 = false;
			byte var90 = in.g1b();
			if ((Long.MIN_VALUE & var86) != 0L) {
				var89 = true;
			}
			if (var89) {
				if (friendChatCount == 0) {
					ptype = -1;
					return true;
				}
				long var91 = var86 & Long.MAX_VALUE;
				int var93;
				for (var93 = 0; friendChatCount > var93 && (var91 != friendChatList[var93].key || var88 != friendChatList[var93].world); var93++) {
				}
				if (var93 < friendChatCount) {
					while (var93 < friendChatCount - 1) {
						friendChatList[var93] = friendChatList[var93 + 1];
						var93++;
					}
					friendChatCount--;
					friendChatList[friendChatCount] = null;
				}
			} else {
				JagString var94 = in.gjstr();
				ClanChannelUser var95 = new ClanChannelUser();
				var95.key = var86;
				var95.name = JagString.toRawUsername(var95.key);
				var95.displayName = var94;
				var95.world = var88;
				var95.rank = var90;
				int var96;
				for (var96 = friendChatCount - 1; var96 >= 0; var96--) {
					int var97 = friendChatList[var96].name.compare(var95.name);
					if (var97 == 0) {
						friendChatList[var96].world = var88;
						friendChatList[var96].rank = var90;
						friendChatList[var96].displayName = var94;
						if (userhash == var86) {
							chatRank = var90;
						}
						ptype = -1;
						clanTransmitNum = transmitNum;
						return true;
					}
					if (var97 < 0) {
						break;
					}
				}
				if (friendChatList.length <= friendChatCount) {
					ptype = -1;
					return true;
				}
				for (int var98 = friendChatCount - 1; var98 > var96; var98--) {
					friendChatList[var98 + 1] = friendChatList[var98];
				}
				if (friendChatCount == 0) {
					friendChatList = new ClanChannelUser[100];
				}
				friendChatList[var96 + 1] = var95;
				friendChatCount++;
				if (var86 == userhash) {
					chatRank = var90;
				}
			}
			ptype = -1;
			clanTransmitNum = transmitNum;
			return true;
		} else if (ptype == 235) {
			// UPDATE_SITESETTINGS
			settings = in.gjstr();
			GameShell.method1132(settings);
			ptype = -1;
			return true;
		} else if (ptype == 26) {
			// IF_SETNPCHEAD
			int var99 = in.g4_alt2();
			int var100 = in.g2_alt3();
			if (var100 == 65535) {
				var100 = -1;
			}
			IfType var101 = IfType.get(var99);
			if (var101.model1Type != 2 || var101.model1Id != var100) {
				var101.model1Id = var100;
				var101.model1Type = 2;
				componentUpdated(var101);
			}
			ptype = -1;
			return true;
		} else if (ptype == 101) {
			// SET_MOVEACTION
			if (psize == 0) {
				moveAction = Text.WALKHERE;
			} else {
				moveAction = in.gjstr();
			}
			ptype = -1;
			return true;
		} else if (ptype == 191) {
			// IF_SETHIDE
			boolean var102 = in.g1_alt2() == 1;
			int var103 = in.g4_alt3();
			IfType var104 = IfType.get(var103);
			if (var102 != var104.hide) {
				var104.hide = var102;
				componentUpdated(var104);
			}
			ptype = -1;
			return true;
		} else if (ptype == 200) {
			// UPDATE_INV_STOP_TRANSMIT
			int var105 = in.g4_alt3();
			IfType var106 = IfType.get(var105);
			for (int var107 = 0; var107 < var106.linkObjType.length; var107++) {
				var106.linkObjType[var107] = -1;
				var106.linkObjType[var107] = 0;
			}
			componentUpdated(var106);
			ptype = -1;
			return true;
		} else if (ptype == 139) {
			// IF_SETOBJECT
			int var108 = in.g4_alt3();
			int var109 = in.g4_alt3();
			int var110 = in.g2_alt2();
			if (var110 == 65535) {
				var110 = -1;
			}
			IfType var111 = IfType.get(var108);
			if (var111.v3) {
				var111.invobject = var110;
				var111.invcount = var109;
				ObjType var112 = ObjType.list(var110);
				var111.field3498 = var112.yof2d;
				var111.modelZoom = var112.zoom2d;
				var111.modelYAn = var112.yan2d;
				var111.modelXAn = var112.xan2d;
				var111.field3365 = var112.xof2d;
				var111.modelZAn = var112.zan2d;
				if (var111.modelBaseWidth > 0) {
					var111.modelZoom = var111.modelZoom * 32 / var111.modelBaseWidth;
				} else if (var111.width > 0) {
					var111.modelZoom = var111.modelZoom * 32 / var111.width;
				}
				componentUpdated(var111);
			} else if (var110 == -1) {
				ptype = -1;
				var111.model1Type = 0;
				return true;
			} else {
				ObjType var113 = ObjType.list(var110);
				var111.modelZoom = var113.zoom2d * 100 / var109;
				var111.modelYAn = var113.yan2d;
				var111.model1Type = 4;
				var111.modelXAn = var113.xan2d;
				var111.model1Id = var110;
				componentUpdated(var111);
			}
			ptype = -1;
			return true;
		} else if (ptype == 230) {
			// LOC_ANIM_SPECIFIC (guessing)
			int var114 = in.g1_alt2();
			int var115 = var114 >> 2;
			int var116 = var114 & 0x3;
			int var117 = LOC_SHAPE_TO_LAYER[var115];
			int var118 = in.g2();
			if (var118 == 65535) {
				var118 = -1;
			}
			int var119 = in.g4_alt2();
			int var120 = var119 >> 28 & 0x3;
			int var121 = var119 & 0x3FFF;
			int var122 = var119 >> 14 & 0x3FFF;
			int var123 = var122 - mapBuildBaseX;
			int var124 = var121 - mapBuildBaseZ;
			animateLocation(var115, var123, var117, var116, var120, var124, var118);
			ptype = -1;
			return true;
		} else if (ptype == 77) {
			// SPOTANIM_SPECIFIC
			int var125 = in.g4_alt3();
			int var126 = in.g2_alt3();
			int var127 = in.g2();
			int var128 = in.g2();
			if (var125 >> 30 != 0) {
				int var133 = var125 >> 28 & 0x3;
				int var134 = (var125 >> 14 & 0x3FFF) - mapBuildBaseX;
				int var135 = (var125 & 0x3FFF) - mapBuildBaseZ;
				if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
					int var136 = var135 * 128 + 64;
					int var137 = var134 * 128 + 64;
					MapSpotAnim var138 = new MapSpotAnim(var126, var133, var137, var136, getAvH(var137, var136, var133) - var128, var127, loopCycle);
					spotanims.push(new MapSpotAnimNode(var138));
				}
			} else if (var125 >> 29 != 0) {
				int var129 = var125 & 0xFFFF;
				ClientNpc var130 = npc[var129];
				if (var130 != null) {
					var130.spotanimId = var126;
					if (var130.spotanimId == 65535) {
						var130.spotanimId = -1;
					}
					var130.spotanimFrame = 0;
					var130.spotanimLastCycle = loopCycle + var127;
					var130.spotanimHeight = var128;
					if (loopCycle < var130.spotanimLastCycle) {
						var130.spotanimFrame = -1;
					}
					var130.spotanimCycle = 0;
				}
			} else if (var125 >> 28 != 0) {
				int var131 = var125 & 0xFFFF;
				ClientPlayer var132;
				if (selfSlot == var131) {
					var132 = localPlayer;
				} else {
					var132 = players[var131];
				}
				if (var132 != null) {
					var132.spotanimCycle = 0;
					var132.spotanimHeight = var128;
					var132.spotanimFrame = 0;
					var132.spotanimId = var126;
					if (var132.spotanimId == 65535) {
						var132.spotanimId = -1;
					}
					var132.spotanimLastCycle = loopCycle + var127;
					if (loopCycle < var132.spotanimLastCycle) {
						var132.spotanimFrame = -1;
					}
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 188) {
			// UPDATE_IGNORELIST
			privateMessageCount = psize / 8;
			for (int var139 = 0; var139 < privateMessageCount; var139++) {
				messageIds[var139] = in.g8();
				field2741[var139] = JagString.toRawUsername(messageIds[var139]);
			}
			friendTransmitNum = transmitNum;
			ptype = -1;
			return true;
		} else if (ptype == 22) {
			// UPDATE_UID192
			GameShell.updateUID192(in);
			ptype = -1;
			return true;
		} else if (ptype == 221) {
			// CAM_SHAKE
			int var140 = in.g1();
			int var141 = in.g1();
			int var142 = in.g1();
			int var143 = in.g1();
			int var144 = in.g2();
			camShake[var140] = true;
			camShakeAxis[var140] = var141;
			camShakeRan[var140] = var142;
			camShakeAmp[var140] = var143;
			camShakeCycle[var140] = var144;
			ptype = -1;
			return true;
		} else if (ptype == 86) {
			// IF_OPENTOP
			int var145 = in.g1();
			int var146 = in.g2_alt3();
			if (var145 == 1) {
				World.resetMap();
				for (int var147 = 0; var147 < 4; var147++) {
					collision[var147].reset();
				}
				System.gc();
			} else if (var145 == 2) {
				WorldMap.reset();
				System.gc();
				setMainState(25);
			}
			toplevelinterface = var146;
			ifAnimReset(var146);
			computeTopLevelInterfaceLayout();
			ScriptRunner.executeOnLoad(toplevelinterface);
			for (int var148 = 0; var148 < 100; var148++) {
				componentDirtyArea[var148] = true;
			}
			ptype = -1;
			return true;
		} else if (ptype == 16) {
			// UPDATE_FRIENDLIST
			long var149 = in.g8();
			boolean var151 = true;
			int var152 = in.g2();
			int var153 = in.g1();
			if (var149 < 0L) {
				var151 = false;
				var149 &= Long.MAX_VALUE;
			}
			JagString var154 = AUTO_EMPTY;
			if (var152 > 0) {
				var154 = in.gjstr();
			}
			JagString var155 = JagString.toRawUsername(var149).toScreenName();
			for (int var156 = 0; var156 < friendCount; var156++) {
				if (field2086[var156] == var149) {
					if (var152 != field3092[var156]) {
						field3092[var156] = var152;
						if (var152 > 0) {
							addChat(JagString.join(new JagString[] { var155, Text.field3321 }), 5, AUTO_EMPTY);
						}
						if (var152 == 0) {
							addChat(JagString.join(new JagString[] { var155, Text.field2123 }), 5, AUTO_EMPTY);
						}
					}
					var155 = null;
					field3238[var156] = var154;
					field845[var156] = var153;
					field1120[var156] = var151;
					break;
				}
			}
			if (var155 != null && friendCount < 200) {
				field2086[friendCount] = var149;
				field370[friendCount] = var155;
				field3092[friendCount] = var152;
				field3238[friendCount] = var154;
				field845[friendCount] = var153;
				field1120[friendCount] = var151;
				friendCount++;
			}
			friendTransmitNum = transmitNum;
			int var157 = friendCount;
			while (var157 > 0) {
				boolean var158 = true;
				var157--;
				for (int var159 = 0; var159 < var157; var159++) {
					if (worldid != field3092[var159] && worldid == field3092[var159 + 1] || field3092[var159] == 0 && field3092[var159 + 1] != 0) {
						var158 = false;
						int var160 = field3092[var159];
						field3092[var159] = field3092[var159 + 1];
						field3092[var159 + 1] = var160;
						JagString var161 = field3238[var159];
						field3238[var159] = field3238[var159 + 1];
						field3238[var159 + 1] = var161;
						JagString var162 = field370[var159];
						field370[var159] = field370[var159 + 1];
						field370[var159 + 1] = var162;
						long var163 = field2086[var159];
						field2086[var159] = field2086[var159 + 1];
						field2086[var159 + 1] = var163;
						int var165 = field845[var159];
						field845[var159] = field845[var159 + 1];
						field845[var159 + 1] = var165;
						boolean var166 = field1120[var159];
						field1120[var159] = field1120[var159 + 1];
						field1120[var159 + 1] = var166;
					}
				}
				if (var158) {
					break;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 249) {
			// IF_SETCOLOUR
			int var167 = in.g2_alt3();
			int var168 = in.g4();
			int var169 = var167 >> 10 & 0x1F;
			int var170 = var167 >> 5 & 0x1F;
			int var171 = var167 & 0x1F;
			int var172 = (var171 << 3) + (var169 << 19) + (var170 << 11);
			IfType var173 = IfType.get(var168);
			if (var172 != var173.colour) {
				var173.colour = var172;
				componentUpdated(var173);
			}
			ptype = -1;
			return true;
		} else if (ptype == 68) {
			// UPDATE_RUNENERGY
			legacyUpdated();
			runenergy = in.g1();
			ptype = -1;
			miscTransmitNum = transmitNum;
			return true;
		} else if (ptype == 24) {
			// VARP_SYNC
			for (int var174 = 0; var174 < VarCache.var.length; var174++) {
				if (VarCache.var[var174] != VarCache.varServ[var174]) {
					VarCache.var[var174] = VarCache.varServ[var174];
					clientVar(var174);
					varTransmit[varTransmitNum++ & 0x1F] = var174;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 74) {
			// MESSAGE_FRIENDCHANNEL
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
						if (underage == 1 || mapQuickchat == 1) {
							var186 = true;
						} else {
							for (int var188 = 0; var188 < privateMessageCount; var188++) {
								if (messageIds[var188] == var175) {
									var186 = true;
									break label1332;
								}
							}
						}
					}
					break;
				}
				if (field3203[var187] == var184) {
					var186 = true;
					break;
				}
				var187++;
			}
			if (!var186 && chatDisabled == 0) {
				field3203[field1150] = var184;
				field1150 = (field1150 + 1) % 100;
				JagString var189 = PixfontGeneric.escape(WordPack.unpack2(in).method622());
				if (var183 == 2 || var183 == 3) {
					friendAddChat(JagString.join(new JagString[] { field472, JagString.toRawUsername(var175).toScreenName() }), var189, JagString.toRawUsername(var177).toScreenName());
				} else if (var183 == 1) {
					friendAddChat(JagString.join(new JagString[] { field3201, JagString.toRawUsername(var175).toScreenName() }), var189, JagString.toRawUsername(var177).toScreenName());
				} else {
					friendAddChat(JagString.toRawUsername(var175).toScreenName(), var189, JagString.toRawUsername(var177).toScreenName());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 134) {
			// UPDATE_ZONE_PARTIAL_ENCLOSED
			zoneUpdateZ = in.g1_alt1();
			zoneUpdateX = in.g1();
			while (psize > in.pos) {
				ptype = in.g1();
				zonePacket();
			}
			ptype = -1;
			return true;
		} else if (ptype == 84) {
			// FRIENDLIST_LOADED
			friendServerStatus = in.g1();
			ptype = -1;
			friendTransmitNum = transmitNum;
			return true;
		} else if (ptype == 6) {
			// MESSAGE_PRIVATE
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
						if (underage == 1 || mapQuickchat == 1) {
							var199 = true;
						} else {
							for (int var201 = 0; var201 < privateMessageCount; var201++) {
								if (var190 == messageIds[var201]) {
									var199 = true;
									break label1367;
								}
							}
						}
					}
					break;
				}
				if (field3203[var200] == var197) {
					var199 = true;
					break;
				}
				var200++;
			}
			if (!var199 && chatDisabled == 0) {
				field3203[field1150] = var197;
				field1150 = (field1150 + 1) % 100;
				JagString var202 = PixfontGeneric.escape(WordPack.unpack2(in).method622());
				if (var196 == 2 || var196 == 3) {
					addChat(var202, 7, JagString.join(new JagString[] { field472, JagString.toRawUsername(var190).toScreenName() }));
				} else if (var196 == 1) {
					addChat(var202, 7, JagString.join(new JagString[] { field3201, JagString.toRawUsername(var190).toScreenName() }));
				} else {
					addChat(var202, 3, JagString.toRawUsername(var190).toScreenName());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 237) {
			// CHAT_FILTER_SETTINGS
			chatPublicMode = in.g1();
			chatPrivateMode = in.g1();
			chatTradeMode = in.g1();
			ptype = -1;
			return true;
		} else if (ptype == 96) {
			// IF_SETMODEL
			int var203 = in.g2_alt1();
			if (var203 == 65535) {
				var203 = -1;
			}
			int var204 = in.g4_alt1();
			IfType var205 = IfType.get(var204);
			if (var205.model1Type != 1 || var203 != var205.model1Id) {
				var205.model1Type = 1;
				var205.model1Id = var203;
				componentUpdated(var205);
			}
			ptype = -1;
			return true;
		} else if (ptype == 149) {
			// NPC_ANIM_SPECIFIC
			int var206 = in.g2_alt3();
			int var207 = in.g1_alt1();
			int var208 = in.g2();
			ClientNpc var209 = npc[var208];
			if (var209 != null) {
				triggerNpcAnim(var206, var207, var209);
			}
			ptype = -1;
			return true;
		} else if (ptype == 248) {
			// RESET_ANIMS
			for (int var210 = 0; var210 < players.length; var210++) {
				if (players[var210] != null) {
					players[var210].primarySeqId = -1;
				}
			}
			for (int var211 = 0; var211 < npc.length; var211++) {
				if (npc[var211] != null) {
					npc[var211].primarySeqId = -1;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 187) {
			// MESSAGE_QUICKCHAT_PRIVATE_ECHO
			long var212 = in.g8();
			int var214 = in.g2();
			JagString var215 = QuickChatPhraseType.list(var214).decodeMessage(in);
			addChat(var215, var214, JagString.toRawUsername(var212).toScreenName(), 19, null);
			ptype = -1;
			return true;
		} else if (ptype == 177) {
			// LAST_LOGIN_INFO
			int var216 = in.g4_alt2();
			lastAddress = signlink.dnsreq(var216);
			ptype = -1;
			return true;
		} else if (ptype == 88) {
			// UPDATE_ZONE_FULL_FOLLOWS
			zoneUpdateX = in.g1_alt1();
			zoneUpdateZ = in.g1_alt2();
			for (int var217 = zoneUpdateX; var217 < zoneUpdateX + 8; var217++) {
				for (int var218 = zoneUpdateZ; var218 < zoneUpdateZ + 8; var218++) {
					if (groundObj[minusedlevel][var217][var218] != null) {
						groundObj[minusedlevel][var217][var218] = null;
						showObject(var217, var218);
					}
				}
			}
			for (LocChange var219 = (LocChange) locChanges.head(); var219 != null; var219 = (LocChange) locChanges.next()) {
				if (zoneUpdateX <= var219.field3059 && var219.field3059 < zoneUpdateX + 8 && zoneUpdateZ <= var219.field3052 && var219.field3052 < zoneUpdateZ + 8 && var219.field3055 == minusedlevel) {
					var219.field3061 = 0;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 203) {
			// MESSAGE_QUICKCHAT_PRIVATE
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
						for (int var232 = 0; var232 < privateMessageCount; var232++) {
							if (var220 == messageIds[var232]) {
								var230 = true;
								break label1401;
							}
						}
					}
					break;
				}
				if (var228 == field3203[var231]) {
					var230 = true;
					break;
				}
				var231++;
			}
			if (!var230 && chatDisabled == 0) {
				field3203[field1150] = var228;
				field1150 = (field1150 + 1) % 100;
				JagString var233 = QuickChatPhraseType.list(var227).decodeMessage(in);
				if (var226 == 2) {
					addChat(var233, var227, JagString.join(new JagString[] { field472, JagString.toRawUsername(var220).toScreenName() }), 18, null);
				} else if (var226 == 1) {
					addChat(var233, var227, JagString.join(new JagString[] { field3201, JagString.toRawUsername(var220).toScreenName() }), 18, null);
				} else {
					addChat(var233, var227, JagString.toRawUsername(var220).toScreenName(), 18, null);
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 17) {
			// UPDATE_INV_PARTIAL
			int var234 = in.g4();
			int var235 = in.g2();
			if (var234 < -70000) {
				var235 += 32768;
			}
			IfType var236;
			if (var234 < 0) {
				var236 = null;
			} else {
				var236 = IfType.get(var234);
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
				if (var236 != null && var237 >= 0 && var237 < var236.linkObjType.length) {
					var236.linkObjType[var237] = var238;
					var236.linkObjNumber[var237] = var239;
				}
				ClientInvCache.set(var235, var239, var237, var238 - 1);
			}
			if (var236 != null) {
				componentUpdated(var236);
			}
			legacyUpdated();
			invTransmit[invTransmitNum++ & 0x1F] = var235 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 11) {
			// VARP_SMALL
			byte var240 = in.g1b_alt2();
			int var241 = in.g2_alt3();
			VarCache.varServ[var241] = var240;
			if (var240 != VarCache.var[var241]) {
				VarCache.var[var241] = var240;
				clientVar(var241);
			}
			varTransmit[varTransmitNum++ & 0x1F] = var241;
			ptype = -1;
			return true;
		} else if (ptype == 100) {
			// IF_SETPLAYERHEAD
			int var242 = in.g4();
			IfType var243 = IfType.get(var242);
			var243.model1Type = 3;
			var243.model1Id = localPlayer.model.method1427();
			componentUpdated(var243);
			ptype = -1;
			return true;
		} else if (ptype == 25) {
			// IF_OPENSUB
			int var244 = in.g4();
			int var245 = in.g2();
			int var246 = in.g1();
			SubInterface var247 = (SubInterface) subinterfaces.find((long) var244);
			if (var247 != null) {
				closeSubInterface(var247, var247.id != var245);
			}
			openSubInterface(var246, var244, var245);
			ptype = -1;
			return true;
		} else if (ptype == 10) {
			// MIDI_SONG
			int var248 = in.g2_alt1();
			if (var248 == 65535) {
				var248 = -1;
			}
			playSongs(var248);
			ptype = -1;
			return true;
		} else if (ptype == 89) {
			// MIDI_JINGLE
			int var249 = in.g2_alt3();
			if (var249 == 65535) {
				var249 = -1;
			}
			int var250 = in.method340();
			playJingle(var249, var250);
			ptype = -1;
			return true;
		} else if (ptype == 66) {
			// OPEN_URL
			byte[] var251 = new byte[psize];
			in.gIsaacArrayBuffer(psize, var251);
			GameShell.method1138(JagString.fromBytes(0, var251, psize));
			ptype = -1;
			return true;
		} else if (ptype == 53) {
			// RUNCLIENTSCRIPT
			JagString var252 = in.gjstr();
			Object[] var253 = new Object[var252.length() + 1];
			for (int var254 = var252.length() - 1; var254 >= 0; var254--) {
				if (var252.charAt(var254) == 115) {
					var253[var254 + 1] = in.gjstr();
				} else {
					var253[var254 + 1] = Integer.valueOf(in.g4());
				}
			}
			var253[0] = Integer.valueOf(in.g4());
			HookReq var255 = new HookReq();
			var255.onop = var253;
			ScriptRunner.executeScript(var255);
			ptype = -1;
			return true;
		} else if (ptype == 229) {
			// UPDATE_FRIENDCHAT_CHANNEL_FULL
			clanTransmitNum = transmitNum;
			long var256 = in.g8();
			if (var256 == 0L) {
				friendChatCount = 0;
				chatDisplayName = null;
				chatOwnerName = null;
				ptype = -1;
				friendChatList = null;
				return true;
			}
			long var258 = in.g8();
			chatDisplayName = JagString.toRawUsername(var258);
			chatOwnerName = JagString.toRawUsername(var256);
			chatMinKick = in.g1b();
			int var260 = in.g1();
			if (var260 == 255) {
				ptype = -1;
				return true;
			}
			friendChatCount = var260;
			ClanChannelUser[] var261 = new ClanChannelUser[100];
			for (int var262 = 0; var262 < friendChatCount; var262++) {
				var261[var262] = new ClanChannelUser();
				var261[var262].key = in.g8();
				var261[var262].name = JagString.toRawUsername(var261[var262].key);
				var261[var262].world = in.g2();
				var261[var262].rank = in.g1b();
				var261[var262].displayName = in.gjstr();
				if (userhash == var261[var262].key) {
					chatRank = var261[var262].rank;
				}
			}
			int var263 = friendChatCount;
			while (var263 > 0) {
				var263--;
				boolean var264 = true;
				for (int var265 = 0; var265 < var263; var265++) {
					if (var261[var265].name.compare(var261[var265 + 1].name) > 0) {
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
			friendChatList = var261;
			ptype = -1;
			return true;
		} else if (ptype == 129) {
			// MESSAGE_QUICKCHAT_FRIENDCHAT
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
						for (int var281 = 0; var281 < privateMessageCount; var281++) {
							if (var267 == messageIds[var281]) {
								var279 = true;
								break label1447;
							}
						}
					}
					break;
				}
				if (var275 == field3203[var280]) {
					var279 = true;
					break;
				}
				var280++;
			}
			if (!var279 && chatDisabled == 0) {
				field3203[field1150] = var275;
				field1150 = (field1150 + 1) % 100;
				JagString var282 = QuickChatPhraseType.list(var278).decodeMessage(in);
				if (var277 == 2 || var277 == 3) {
					addChat(var282, var278, JagString.join(new JagString[] { field472, JagString.toRawUsername(var267).toScreenName() }), 20, JagString.toRawUsername(var269).toScreenName());
				} else if (var277 == 1) {
					addChat(var282, var278, JagString.join(new JagString[] { field3201, JagString.toRawUsername(var267).toScreenName() }), 20, JagString.toRawUsername(var269).toScreenName());
				} else {
					addChat(var282, var278, JagString.toRawUsername(var267).toScreenName(), 20, JagString.toRawUsername(var269).toScreenName());
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 166) {
			// TRIGGER_ONDIALOGABORT
			if (toplevelinterface != -1) {
				runHookImmediate(toplevelinterface, 0);
			}
			ptype = -1;
			return true;
		} else if (ptype == 21) {
			// REBUILD_REGION
			rebuildPacket(true);
			ptype = -1;
			return true;
		} else if (ptype == 233) {
			// SET_PLAYER_OP
			JagString var283 = in.gjstr();
			int var284 = in.g1();
			int var285 = in.g1();
			if (var284 >= 1 && var284 <= 8) {
				if (var283.equalsIgnoreCase(AUTO_NULL_LOWER)) {
					var283 = null;
				}
				playerOp[var284 - 1] = var283;
				playerOpPriority[var284 - 1] = var285 == 0;
			}
			ptype = -1;
			return true;
		} else if (ptype == 70) {
			// VARP_RESET
			for (int var286 = 0; var286 < VarpType.numDefinitions; var286++) {
				VarpType var287 = VarpType.list(var286);
				if (var287 != null && var287.clientcode == 0) {
					VarCache.varServ[var286] = 0;
					VarCache.var[var286] = 0;
				}
			}
			legacyUpdated();
			varTransmitNum += 32;
			ptype = -1;
			return true;
		} else if (ptype == 123 || ptype == 52 || ptype == 232 || ptype == 61 || ptype == 135 || ptype == 173 || ptype == 150 || ptype == 198 || ptype == 99 || ptype == 171 || ptype == 75 || ptype == 44) {
			zonePacket();
			ptype = -1;
			return true;
		} else if (ptype == 120) {
			// IF_SETANGLE
			int var288 = in.g2_alt2();
			int var289 = in.g2_alt2();
			int var290 = in.g4_alt3();
			int var291 = in.g2_alt1();
			IfType var292 = IfType.get(var290);
			if (var291 != var292.modelXAn || var292.modelYAn != var289 || var288 != var292.modelZoom) {
				var292.modelYAn = var289;
				var292.modelZoom = var288;
				var292.modelXAn = var291;
				componentUpdated(var292);
			}
			ptype = -1;
			return true;
		} else if (ptype == 54) {
			// UPDATE_RUNWEIGHT
			legacyUpdated();
			runweight = in.g2b();
			miscTransmitNum = transmitNum;
			ptype = -1;
			return true;
		} else if (ptype == 114) {
			// TELEPORT
			int var293 = in.g1();
			int var294 = in.g1_alt3();
			int var295 = in.g1_alt2();
			minusedlevel = var293 >> 1;
			localPlayer.teleport((var293 & 0x1) == 1, var295, var294);
			ptype = -1;
			return true;
		} else if (ptype == 162) {
			// IF_SETANIM
			int var296 = in.g4_alt1();
			int var297 = in.g2b_alt2();
			IfType var298 = IfType.get(var296);
			if (var297 != var298.modelAnim || var297 == -1) {
				var298.modelAnim = var297;
				var298.animCycle = 0;
				var298.animFrame = 0;
				componentUpdated(var298);
			}
			ptype = -1;
			return true;
		} else if (ptype == 163) {
			// UPDATE_ZONE_PARTIAL_FOLLOWS
			zoneUpdateX = in.g1();
			zoneUpdateZ = in.g1_alt1();
			ptype = -1;
			return true;
		} else if (ptype == 116) {
			// PLAYER_INFO
			getPlayerPos();
			ptype = -1;
			return true;
		} else if (ptype == 223) {
			// CAM_LOOKAT
			cinemaCam = true;
			camLookAtLx = in.g1();
			camLookAtLz = in.g1();
			camLookAtHei = in.g2();
			camLookAtRate = in.g1();
			camLookAtRate2 = in.g1();
			if (camLookAtRate2 >= 100) {
				int var299 = camLookAtLx * 128 + 64;
				int var300 = camLookAtLz * 128 + 64;
				int var301 = getAvH(var299, var300, minusedlevel) - camLookAtHei;
				int var302 = var299 - camX;
				int var303 = var300 - camZ;
				int var304 = var301 - camY;
				int var305 = (int) Math.sqrt((double) (var302 * var302 + var303 * var303));
				camPitch = (int) (Math.atan2((double) var304, (double) var305) * 325.949D) & 0x7FF;
				camYaw = (int) (-325.949D * Math.atan2((double) var302, (double) var303)) & 0x7FF;
				if (camPitch < 128) {
					camPitch = 128;
				}
				if (camPitch > 383) {
					camPitch = 383;
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 241) {
			// UPDATE_INV_STOPTRANSMIT
			int var306 = in.g2();
			ClientInvCache.delete(var306);
			invTransmit[invTransmitNum++ & 0x1F] = var306 & 0x7FFF;
			ptype = -1;
			return true;
		} else if (ptype == 147) {
			// MINIMAP_TOGGLE
			minimapState = in.g1();
			ptype = -1;
			return true;
		} else if (ptype == 243) {
			// CAM_FORCEANGLE
			int var307 = in.g2_alt1();
			int var308 = in.g2_alt2();
			orbitCameraPitch = var307;
			orbitCameraYaw = var308;
			clampCameraAngle();
			ptype = -1;
			return true;
		} else if (ptype == 189) {
			field580 = (short) in.g2();
			if (field580 <= 0) {
				field580 = 256;
			}
			field921 = (short) in.g2_alt2();
			ptype = -1;
			if (field921 <= 0) {
				field921 = 205;
			}
			return true;
		} else if (ptype == 220) {
			// IF_SETSCROLLPOS
			int var309 = in.g4_alt3();
			int var310 = in.g2_alt2();
			IfType var311 = IfType.get(var309);
			if (var311 != null && var311.type == 0) {
				if (var311.scrollHeight - var311.renderHeight < var310) {
					var310 = var311.scrollHeight - var311.renderHeight;
				}
				if (var310 < 0) {
					var310 = 0;
				}
				if (var311.scrollPosY != var310) {
					var311.scrollPosY = var310;
					componentUpdated(var311);
				}
			}
			ptype = -1;
			return true;
		} else if (ptype == 4) {
			// IF_SETROTATESPEED
			int var312 = in.g2_alt3();
			int var313 = in.g2();
			int var314 = in.g4_alt2();
			IfType var315 = IfType.get(var314);
			ptype = -1;
			var315.modelSpin = (var313 << 16) + var312;
			return true;
		} else if (ptype == 197) {
			field3083 = (short) in.g2_alt3();
			if (field3083 <= 0) {
				field3083 = 320;
			}
			field4175 = (short) in.g2_alt2();
			ptype = -1;
			if (field4175 <= 0) {
				field4175 = 256;
			}
			return true;
		} else if (ptype == 113) {
			// SYNTH_SOUND
			int var316 = in.g2();
			int var317 = in.g1();
			int var318 = in.g2();
			if (var316 == 65535) {
				var316 = -1;
			}
			playSynth(var317, var318, var316);
			ptype = -1;
			return true;
		} else if (ptype == 242) {
			// IF_CLOSESUB
			int var319 = in.g4();
			SubInterface var320 = (SubInterface) subinterfaces.find((long) var319);
			if (var320 != null) {
				closeSubInterface(var320, true);
			}
			if (resumePauseCom != null) {
				componentUpdated(resumePauseCom);
				resumePauseCom = null;
			}
			ptype = -1;
			return true;
		} else if (ptype == 72) {
			// VARP_LARGE
			int var321 = in.g2_alt2();
			int var322 = in.g4_alt1();
			VarCache.varServ[var321] = var322;
			if (VarCache.var[var321] != var322) {
				VarCache.var[var321] = var322;
				clientVar(var321);
			}
			varTransmit[varTransmitNum++ & 0x1F] = var321;
			ptype = -1;
			return true;
		} else if (ptype == 65) {
			field926 = (short) in.g2();
			if (field926 <= 0) {
				field926 = 32767;
			} else if (field926 < field2527) {
				field926 = field2527;
			}
			field1578 = (short) in.g2_alt1();
			if (field1578 <= 0) {
				field1578 = 1;
			}
			field4179 = (short) in.g2_alt1();
			if (field4179 <= 0) {
				field4179 = 32767;
			} else if (field4179 < field1578) {
				field4179 = field1578;
			}
			field2527 = (short) in.g2_alt3();
			if (field2527 <= 0) {
				field2527 = 1;
			}
			ptype = -1;
			return true;
		} else if (ptype == 240) {
			// LOGOUT
			logout();
			ptype = -1;
			return false;
		} else if (ptype == 204) {
			// UPDATE_STAT
			legacyUpdated();
			int var323 = in.g1_alt2();
			int var324 = in.g1_alt1();
			int var325 = in.g4_alt3();
			statXP[var323] = var325;
			statEffectiveLevel[var323] = var324;
			statBaseLevel[var323] = 1;
			for (int var326 = 0; var326 < 98; var326++) {
				if (var325 >= Skills.skillxp[var326]) {
					statBaseLevel[var323] = var326 + 2;
				}
			}
			statTransmit[statTransmitNum++ & 0x1F] = var323;
			ptype = -1;
			return true;
		} else if (ptype == 255) {
			// UNSET_MAP_FLAG
			minimapFlagX = 0;
			ptype = -1;
			return true;
		} else if (ptype == 172) {
			// MESSAGE_PRIVATE_ECHO
			long var327 = in.g8();
			JagString var329 = PixfontGeneric.escape(WordPack.unpack2(in).method622());
			addChat(var329, 6, JagString.toRawUsername(var327).toScreenName());
			ptype = -1;
			return true;
		} else if (ptype == 110) {
			// REFLECTION_CHECKER
			ReflectionChecker.addCheck(signlink, psize, in);
			ptype = -1;
			return true;
		} else if (ptype == 184) {
			// UPDATE_REBOOT_TIMER
			rebootTimer = in.g2_alt1() * 30;
			ptype = -1;
			miscTransmitNum = transmitNum;
			return true;
		} else {
			JagException.report("T1 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize, null);
			logout();
			return true;
		}
	}

	@ObfuscatedName("we.b(I)V")
	public static void zonePacket() {
		if (ptype == 123) {
			// MAP_PROJANIM
			int var0 = in.g1();
			int var1 = zoneUpdateZ * 2 + (var0 & 0xF);
			int var2 = (var0 >> 4 & 0xF) + zoneUpdateX * 2;
			int var3 = in.g1b() + var2;
			int var4 = var1 + in.g1b();
			int var5 = in.g2b();
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
				ClientProj var16 = new ClientProj(var6, minusedlevel, var14, var13, getAvH(var14, var13, minusedlevel) - var7, var9 - -loopCycle, loopCycle + var10, var11, var12, var5, var8);
				int var17 = var3 * 64;
				var16.setTarget(var17, var9 + loopCycle, getAvH(var17, var15, minusedlevel) + -var8, var15);
				projectiles.push(new ClientProjNode2(var16));
			}
		} else if (ptype == 135) {
			// OBJ_REVEAL
			int var18 = in.g1_alt1();
			int var19 = (var18 & 0x7) + zoneUpdateZ;
			int var20 = zoneUpdateX + (var18 >> 4 & 0x7);
			int var21 = in.g2_alt3();
			int var22 = in.g2_alt2();
			int var23 = in.g2_alt2();
			if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104 && var22 != selfSlot) {
				ClientObj var24 = new ClientObj();
				var24.count = var23;
				var24.id = var21;
				if (groundObj[minusedlevel][var20][var19] == null) {
					groundObj[minusedlevel][var20][var19] = new LinkList();
				}
				groundObj[minusedlevel][var20][var19].push(new ClientObjNode(var24));
				showObject(var20, var19);
			}
		} else if (ptype == 173) {
			// MAP_ANIM
			int var25 = in.g1();
			int var26 = zoneUpdateZ + (var25 & 0x7);
			int var27 = (var25 >> 4 & 0x7) + zoneUpdateX;
			int var28 = in.g2();
			int var29 = in.g1();
			int var30 = in.g2();
			if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
				int var31 = var27 * 128 + 64;
				int var32 = var26 * 128 + 64;
				MapSpotAnim var33 = new MapSpotAnim(var28, minusedlevel, var31, var32, getAvH(var31, var32, minusedlevel) - var29, var30, loopCycle);
				spotanims.push(new MapSpotAnimNode(var33));
			}
		} else if (ptype == 232) {
			// OBJ_COUNT
			int var34 = in.g1();
			int var35 = (var34 & 0x7) + zoneUpdateZ;
			int var36 = (var34 >> 4 & 0x7) + zoneUpdateX;
			int var37 = in.g2();
			int var38 = in.g2();
			int var39 = in.g2();
			if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
				LinkList var40 = groundObj[minusedlevel][var36][var35];
				if (var40 != null) {
					for (ClientObjNode var41 = (ClientObjNode) var40.head(); var41 != null; var41 = (ClientObjNode) var40.next()) {
						ClientObj var42 = var41.obj;
						if ((var37 & 0x7FFF) == var42.id && var42.count == var38) {
							var42.count = var39;
							break;
						}
					}
					showObject(var36, var35);
				}
			}
		} else if (ptype == 44) {
			// LOC_ADD_CHANGE
			int var43 = in.g1();
			int var44 = var43 >> 2;
			int var45 = var43 & 0x3;
			int var46 = LOC_SHAPE_TO_LAYER[var44];
			int var47 = in.g2_alt3();
			int var48 = in.g1_alt1();
			int var49 = zoneUpdateX + (var48 >> 4 & 0x7);
			int var50 = zoneUpdateZ + (var48 & 0x7);
			if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
				locChangeCreate(0, var50, var46, var45, -1, var44, minusedlevel, var49, var47);
			}
		} else if (ptype == 171) {
			// LOC_ANIM
			int var51 = in.g1_alt1();
			int var52 = var51 & 0x3;
			int var53 = var51 >> 2;
			int var54 = LOC_SHAPE_TO_LAYER[var53];
			int var55 = in.g2_alt1();
			if (var55 == 65535) {
				var55 = -1;
			}
			int var56 = in.g1_alt3();
			int var57 = (var56 >> 4 & 0x7) + zoneUpdateX;
			int var58 = zoneUpdateZ + (var56 & 0x7);
			animateLocation(var53, var57, var54, var52, minusedlevel, var58, var55);
		} else {
			if (ptype == 61) {
				// LOC_MERGE
				int var59 = in.g2();
				int var60 = in.g1_alt2();
				int var61 = var60 >> 2;
				int var62 = var60 & 0x3;
				int var63 = LOC_SHAPE_TO_LAYER[var61];
				int var64 = in.g2();
				byte var65 = in.g1b_alt1();
				byte var66 = in.g1b_alt2();
				byte var67 = in.g1b();
				byte var68 = in.g1b_alt2();
				int var69 = in.g2();
				int var70 = in.g1();
				int var71 = zoneUpdateZ + (var70 & 0x7);
				int var72 = (var70 >> 4 & 0x7) + zoneUpdateX;
				int var73 = in.g2_alt2();
				ClientPlayer var74;
				if (selfSlot == var59) {
					var74 = localPlayer;
				} else {
					var74 = players[var59];
				}
				if (var74 != null) {
					LocType var75 = LocType.list(var64);
					int var76;
					int var77;
					if (var62 == 1 || var62 == 3) {
						var76 = var75.width;
						var77 = var75.length;
					} else {
						var77 = var75.width;
						var76 = var75.length;
					}
					int var78 = (var77 >> 1) + var72;
					int var79 = var72 + (var77 + 1 >> 1);
					int var80 = (var76 >> 1) + var71;
					int var81 = (var76 + 1 >> 1) + var71;
					int[][] var82 = ClientBuild.groundh[minusedlevel];
					int var83 = (var77 << 6) + (var72 << 7);
					int var84 = var82[var79][var81] + var82[var79][var80] + var82[var78][var80] + var82[var78][var81] >> 2;
					int var85 = (var76 << 6) + (var71 << 7);
					int[][] var86 = null;
					if (minusedlevel < 3) {
						var86 = ClientBuild.groundh[minusedlevel + 1];
					}
					ModelCacheLit var87 = var75.getModel(var61, var86, var82, var83, false, var85, var62, var84);
					if (var87 != null) {
						locChangeCreate(var69 + 1, var71, var63, 0, var73 + 1, 0, minusedlevel, var72, -1);
						var74.locOffsetY = var84;
						var74.locStartCycle = loopCycle + var69;
						var74.locOffsetZ = var76 * 64 + var71 * 128;
						var74.locModel = (ModelLit) var87.field3984;
						var74.locOffsetX = var72 * 128 + var77 * 64;
						if (var66 > var67) {
							byte var88 = var66;
							var66 = var67;
							var67 = var88;
						}
						var74.minTileX = var66 + var72;
						var74.maxTileX = var67 + var72;
						if (var65 < var68) {
							byte var89 = var68;
							var68 = var65;
							var65 = var89;
						}
						var74.minTileZ = var71 + var68;
						var74.maxTileZ = var71 + var65;
						var74.locEndCycle = loopCycle + var73;
					}
				}
			}
			if (ptype == 99) {
				// OBJ_ADD
				int var90 = in.g1();
				int var91 = (var90 & 0x7) + zoneUpdateZ;
				int var92 = (var90 >> 4 & 0x7) + zoneUpdateX;
				int var93 = in.g2_alt2();
				int var94 = in.g2_alt3();
				if (var92 >= 0 && var91 >= 0 && var92 < 104 && var91 < 104) {
					ClientObj var95 = new ClientObj();
					var95.count = var94;
					var95.id = var93;
					if (groundObj[minusedlevel][var92][var91] == null) {
						groundObj[minusedlevel][var92][var91] = new LinkList();
					}
					groundObj[minusedlevel][var92][var91].push(new ClientObjNode(var95));
					showObject(var92, var91);
				}
			} else if (ptype == 150) {
				// MAP_PROJANIM
				int var96 = in.g1();
				int var97 = zoneUpdateX + (var96 >> 4 & 0x7);
				int var98 = (var96 & 0x7) + zoneUpdateZ;
				int var99 = var97 + in.g1b();
				int var100 = in.g1b() + var98;
				int var101 = in.g2b();
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
					ClientProj var113 = new ClientProj(var102, minusedlevel, var109, var112, getAvH(var109, var112, minusedlevel) - var103, loopCycle + var105, var106 + loopCycle, var107, var108, var101, var104);
					var113.setTarget(var111, var105 + loopCycle, getAvH(var111, var110, minusedlevel) + -var104, var110);
					projectiles.push(new ClientProjNode2(var113));
				}
			} else if (ptype == 198) {
				// OBJ_DEL
				int var114 = in.g1_alt1();
				int var115 = zoneUpdateX + (var114 >> 4 & 0x7);
				int var116 = (var114 & 0x7) + zoneUpdateZ;
				int var117 = in.g2_alt3();
				if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
					LinkList var118 = groundObj[minusedlevel][var115][var116];
					if (var118 != null) {
						for (ClientObjNode var119 = (ClientObjNode) var118.head(); var119 != null; var119 = (ClientObjNode) var118.next()) {
							if ((var117 & 0x7FFF) == var119.obj.id) {
								var119.unlink();
								break;
							}
						}
						if (var118.head() == null) {
							groundObj[minusedlevel][var115][var116] = null;
						}
						showObject(var115, var116);
					}
				}
			} else if (ptype == 75) {
				// LOC_DEL
				int var120 = in.g1();
				int var121 = var120 >> 2;
				int var122 = LOC_SHAPE_TO_LAYER[var121];
				int var123 = var120 & 0x3;
				int var124 = in.g1_alt2();
				int var125 = zoneUpdateZ + (var124 & 0x7);
				int var126 = zoneUpdateX + (var124 >> 4 & 0x7);
				if (var126 >= 0 && var125 >= 0 && var126 < 104 && var125 < 104) {
					locChangeCreate(0, var125, var122, var123, -1, var121, minusedlevel, var126, -1);
				}
			} else if (ptype == 52) {
				// SOUND_AREA
				int var127 = in.g1();
				int var128 = zoneUpdateZ + (var127 & 0x7);
				int var129 = zoneUpdateX + (var127 >> 4 & 0x7);
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
					if (localPlayer.routeX[0] >= var129 - var135 && var129 + var135 >= localPlayer.routeX[0] && var128 - var135 <= localPlayer.routeZ[0] && localPlayer.routeZ[0] <= var128 + var135 && ambientVolume != 0 && var132 > 0 && waveCount < 50 && var130 != -1) {
						waveSoundIds[waveCount] = var130;
						waveLoops[waveCount] = var132;
						waveDelay[waveCount] = var133;
						waveSounds[waveCount] = null;
						waveAmbient[waveCount] = (var129 << 16) + (var128 << 8) + var134;
						waveCount++;
					}
				}
			}
		}
	}

	@ObfuscatedName("ub.a(IIIIIIIIII)V")
	public static void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) locChanges.head(); var10 != null; var10 = (LocChange) locChanges.next()) {
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
			locChangeSetOld(var9);
			locChanges.push(var9);
		}
		var9.field3062 = arg5;
		var9.field3068 = arg3;
		var9.field3061 = arg4;
		var9.field3051 = arg8;
		var9.field3054 = arg0;
	}

	@ObfuscatedName("tc.e(I)V")
	public static void locChangePostBuildCorrect() {
		for (LocChange var0 = (LocChange) locChanges.head(); var0 != null; var0 = (LocChange) locChanges.next()) {
			if (var0.field3061 == -1) {
				var0.field3054 = 0;
				locChangeSetOld(var0);
			} else {
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("pi.a(ILog;)V")
	public static void locChangeSetOld(LocChange arg0) {
		long var1 = 0L;
		if (arg0.field3063 == 0) {
			var1 = World.wallType(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		int var3 = 0;
		int var4 = 0;
		int var5 = -1;
		if (arg0.field3063 == 1) {
			var1 = World.decorType(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 2) {
			var1 = World.sceneType(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 3) {
			var1 = World.gdType(arg0.field3055, arg0.field3059, arg0.field3052);
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

	@ObfuscatedName("kd.f(I)V")
	public static void locChangeDoQueue() {
		for (LocChange var0 = (LocChange) locChanges.head(); var0 != null; var0 = (LocChange) locChanges.next()) {
			if (var0.field3061 > 0) {
				var0.field3061--;
			}
			if (var0.field3061 != 0) {
				if (var0.field3054 > 0) {
					var0.field3054--;
				}
				if (var0.field3054 == 0 && var0.field3059 >= 1 && var0.field3052 >= 1 && var0.field3059 <= 102 && var0.field3052 <= 102 && (var0.field3051 < 0 || ClientBuild.changeLocAvailable(var0.field3062, var0.field3051))) {
					ClientBuild.changeLocUnchecked(var0.field3055, var0.field3063, var0.field3052, var0.field3062, var0.field3051, var0.field3068, var0.field3059);
					var0.field3054 = -1;
					if (var0.field3051 == var0.field3053 && var0.field3053 == -1) {
						var0.unlink();
					} else if (var0.field3051 == var0.field3053 && var0.field3064 == var0.field3068 && var0.field3060 == var0.field3062) {
						var0.unlink();
					}
				}
			} else if (var0.field3053 < 0 || ClientBuild.changeLocAvailable(var0.field3060, var0.field3053)) {
				ClientBuild.changeLocUnchecked(var0.field3055, var0.field3063, var0.field3052, var0.field3060, var0.field3053, var0.field3064, var0.field3059);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("nf.a(Lia;IIIIII)V")
	public static void locChangeUnchecked(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = 0L;
		if (arg3 == 0) {
			var6 = World.wallType(arg4, arg1, arg5);
		}
		if (arg3 == 1) {
			var6 = World.decorType(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			var6 = World.sceneType(arg4, arg1, arg5);
		}
		if (arg3 == 3) {
			var6 = World.gdType(arg4, arg1, arg5);
		}
		if ((long) 0 != var6) {
			int var8 = (int) var6 >> 14 & 0x1F;
			int var9 = (int) var6 >> 20 & 0x3;
			int var10 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
			LocType var11 = LocType.list(var10);
			if (arg3 == 0) {
				World.delWall(arg4, arg1, arg5);
				if (var11.blockwalk != 0) {
					arg0.delWall(var11.blockrange, var8, var9, arg5, arg1);
				}
			}
			if (arg3 == 1) {
				World.delDecor(arg4, arg1, arg5);
			}
			if (arg3 == 2) {
				World.delLoc(arg4, arg1, arg5);
				if (var11.blockwalk != 0 && var11.width + arg1 < 104 && var11.width + arg5 < 104 && var11.length + arg1 < 104 && arg5 + var11.length < 104) {
					arg0.delLoc(arg1, var11.blockrange, var9, arg5, var11.length, var11.width);
				}
			}
			if (arg3 == 3) {
				World.delGroundDecor(arg4, arg1, arg5);
				if (var11.blockwalk == 1) {
					arg0.unblockGroundDecor(arg1, arg5);
				}
			}
		}
	}

	@ObfuscatedName("cf.a(III)V")
	public static void showObject(int arg0, int arg1) {
		LinkList var2 = groundObj[minusedlevel][arg0][arg1];
		if (var2 == null) {
			World.delObj(minusedlevel, arg0, arg1);
			return;
		}
		int var3 = -99999999;
		ClientObjNode var4 = null;
		for (ClientObjNode var5 = (ClientObjNode) var2.head(); var5 != null; var5 = (ClientObjNode) var2.next()) {
			ObjType var6 = ObjType.list(var5.obj.id);
			int var7 = var6.cost;
			if (var6.stackable == 1) {
				var7 *= var5.obj.count + 1;
			}
			if (var7 > var3) {
				var4 = var5;
				var3 = var7;
			}
		}
		if (var4 == null) {
			World.delObj(minusedlevel, arg0, arg1);
			return;
		}
		ClientObj var8 = null;
		var2.pushFront(var4);
		ClientObj var9 = null;
		for (ClientObjNode var10 = (ClientObjNode) var2.head(); var10 != null; var10 = (ClientObjNode) var2.next()) {
			ClientObj var11 = var10.obj;
			if (var4.obj.id != var11.id) {
				if (var8 == null) {
					var8 = var11;
				}
				if (var11.id != var8.id && var9 == null) {
					var9 = var11;
				}
			}
		}
		long var12 = (long) (arg0 + (arg1 << 7) + 1610612736);
		World.setObj(minusedlevel, arg0, arg1, getAvH(arg0 * 128 + 64, arg1 * 128 - -64, minusedlevel), var4.obj, var12, var8, var9);
	}

	@ObfuscatedName("cj.d(I)V")
	public static void getPlayerPos() {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getPlayerPosLocal();
		getPlayerPosOldVis();
		getPlayerPosNewVis();
		getPlayerPosExtended();
		for (int var0 = 0; var0 < entityRemovalCount; var0++) {
			int var1 = entityRemovalIds[var0];
			if (loopCycle != players[var1].cycle) {
				players[var1] = null;
			}
		}
		if (in.pos != psize) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < playerCount; var2++) {
			if (players[playerIds[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + playerCount);
			}
		}
	}

	@ObfuscatedName("pe.c(B)V")
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
			localPlayer.moveCode(false, var2);
			int var3 = in.gBit(1);
			if (var3 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
		} else if (var1 == 2) {
			int var4 = in.gBit(3);
			localPlayer.moveCode(true, var4);
			int var5 = in.gBit(3);
			localPlayer.moveCode(true, var5);
			int var6 = in.gBit(1);
			if (var6 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
		} else if (var1 == 3) {
			int var7 = in.gBit(1);
			minusedlevel = in.gBit(2);
			int var8 = in.gBit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
			int var9 = in.gBit(7);
			int var10 = in.gBit(7);
			localPlayer.teleport(var7 == 1, var9, var10);
		}
	}

	@ObfuscatedName("bd.b(B)V")
	public static void getPlayerPosOldVis() {
		int var0 = in.gBit(8);
		if (var0 < playerCount) {
			for (int var1 = var0; var1 < playerCount; var1++) {
				entityRemovalIds[entityRemovalCount++] = playerIds[var1];
			}
		}
		if (var0 > playerCount) {
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
					var4.moveCode(false, var7);
					int var8 = in.gBit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 2) {
					playerIds[playerCount++] = var3;
					var4.cycle = loopCycle;
					int var9 = in.gBit(3);
					var4.moveCode(true, var9);
					int var10 = in.gBit(3);
					var4.moveCode(true, var10);
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

	@ObfuscatedName("ih.a(Z)V")
	public static void getPlayerPosNewVis() {
		while (true) {
			if (in.bitsLeft(psize) >= 11) {
				int var0 = in.gBit(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (players[var0] == null) {
						var1 = true;
						players[var0] = new ClientPlayer();
						if (playerAppearanceBuffer[var0] != null) {
							players[var0].setAppearance(playerAppearanceBuffer[var0]);
						}
					}
					playerIds[playerCount++] = var0;
					ClientPlayer var2 = players[var0];
					var2.cycle = loopCycle;
					int var3 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.dstYaw = var2.yaw = var3;
					}
					int var4 = in.gBit(1);
					if (var4 == 1) {
						entityUpdateIds[entityUpdateCount++] = var0;
					}
					int var5 = in.gBit(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = in.gBit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = in.gBit(1);
					var2.teleport(var7 == 1, localPlayer.routeX[0] + var6, localPlayer.routeZ[0] - -var5);
					continue;
				}
			}
			in.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("pi.c(B)V")
	public static void getPlayerPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
			ClientPlayer var2 = players[var1];
			int var3 = in.g1();
			if ((var3 & 0x2) != 0) {
				var3 += in.g1() << 8;
			}
			getPlayerPosExtended(var3, var2, var1);
		}
	}

	@ObfuscatedName("sg.a(ILdj;II)V")
	public static void getPlayerPosExtended(int arg0, ClientPlayer arg1, int arg2) {
		if ((arg0 & 0x4) != 0) {
			arg1.chat = in.gjstr();
			if (arg1.chat.charAt(0) == 126) {
				arg1.chat = arg1.chat.substring(1);
				addChat(arg1.chat, 2, arg1.name);
			} else if (arg1 == localPlayer) {
				addChat(arg1.chat, 2, arg1.name);
			}
			arg1.chatEffect = 0;
			arg1.chatColour = 0;
			arg1.chatTimer = 150;
		}
		if ((arg0 & 0x400) != 0) {
			arg1.exactStartX = in.g1_alt3();
			arg1.exactStartZ = in.g1_alt2();
			arg1.exactEndX = in.g1_alt2();
			arg1.exactEndZ = in.g1_alt1();
			arg1.exactMoveEnd = in.g2_alt1() + loopCycle;
			arg1.exactMoveStart = in.g2_alt1() + loopCycle;
			arg1.exactMoveFacing = in.g1_alt1();
			arg1.preanimRouteLength = 0;
			arg1.routeLength = 1;
		}
		if ((arg0 & 0x10) != 0) {
			arg1.targetTileX = in.g2_alt2();
			arg1.targetTileZ = in.g2_alt3();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.spotanimId = in.g2();
			int var3 = in.g4_alt3();
			if (arg1.spotanimId == 65535) {
				arg1.spotanimId = -1;
			}
			arg1.spotanimHeight = var3 >> 16;
			arg1.spotanimLastCycle = (var3 & 0xFFFF) + loopCycle;
			arg1.spotanimFrame = 0;
			arg1.spotanimCycle = 0;
			if (loopCycle < arg1.spotanimLastCycle) {
				arg1.spotanimFrame = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			int var4 = in.g2();
			if (var4 == 65535) {
				var4 = -1;
			}
			int var5 = in.g1();
			triggerPlayerAnim(var4, var5, arg1);
		}
		if ((arg0 & 0x40) != 0) {
			int var6 = in.g1();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet(var7);
			in.gdata(var6, var7);
			playerAppearanceBuffer[arg2] = var8;
			arg1.setAppearance(var8);
		}
		if ((arg0 & 0x80) != 0) {
			int var9 = in.g1_alt3();
			int var10 = in.g1();
			arg1.addHitmark(loopCycle, var10, var9);
			arg1.combatCycle = loopCycle + 300;
			arg1.field4109 = in.g1_alt2();
		}
		if ((arg0 & 0x100) != 0) {
			int var11 = in.g1_alt3();
			int var12 = in.g1_alt3();
			arg1.addHitmark(loopCycle, var12, var11);
		}
		if ((arg0 & 0x1) != 0) {
			int var13 = in.g2_alt2();
			boolean var14 = (var13 & 0x8000) != 0;
			int var15 = in.g1_alt3();
			int var16 = in.g1();
			int var17 = in.pos;
			if (arg1.name != null && arg1.model != null) {
				long var18 = arg1.name.toUserhash();
				boolean var20 = false;
				if (var15 <= 1) {
					if (!var14 && (underage == 1 || mapQuickchat == 1)) {
						var20 = true;
					} else {
						for (int var21 = 0; var21 < privateMessageCount; var21++) {
							if (messageIds[var21] == var18) {
								var20 = true;
								break;
							}
						}
					}
				}
				if (!var20 && chatDisabled == 0) {
					tempP.pos = 0;
					int var22 = -1;
					in.gdata_alt1(tempP.data, var16);
					tempP.pos = 0;
					JagString var23;
					if (var14) {
						QuickChatPhrase var24 = QuickChatPhrase.create(tempP);
						var22 = var24.id;
						var13 &= 0x7FFF;
						var23 = var24.type.decodeMessage(tempP);
					} else {
						var23 = PixfontGeneric.escape(WordPack.unpack2(tempP).method622());
					}
					arg1.chat = var23.method602();
					arg1.chatTimer = 150;
					arg1.chatColour = var13 >> 8;
					arg1.chatEffect = var13 & 0xFF;
					if (var15 == 2) {
						addChat(var23, var22, JagString.join(new JagString[] { field472, arg1.name }), var14 ? 17 : 1, null);
					} else if (var15 == 1) {
						addChat(var23, var22, JagString.join(new JagString[] { field3201, arg1.name }), var14 ? 17 : 1, null);
					} else {
						addChat(var23, var22, arg1.name, var14 ? 17 : 2, null);
					}
				}
			}
			in.pos = var16 + var17;
		}
		if ((arg0 & 0x20) == 0) {
			return;
		}
		arg1.targetId = in.g2();
		if (arg1.targetId == 65535) {
			arg1.targetId = -1;
			return;
		}
	}

	@ObfuscatedName("fd.f(I)V")
	public static void getNpcPos() {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getNpcPosOldVis();
		getNpcPosNewVis();
		getNpcPosExtended();
		for (int var0 = 0; var0 < entityRemovalCount; var0++) {
			int var1 = entityRemovalIds[var0];
			if (npc[var1].cycle != loopCycle) {
				npc[var1].type = null;
				npc[var1] = null;
			}
		}
		if (psize != in.pos) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < npcCount; var2++) {
			if (npc[npcIds[var2]] == null) {
				throw new RuntimeException("gnp2 pos:" + var2 + " size:" + npcCount);
			}
		}
	}

	@ObfuscatedName("aa.d(B)V")
	public static void getNpcPosOldVis() {
		in.gBitStart();
		int var0 = in.gBit(8);
		if (npcCount > var0) {
			for (int var1 = var0; var1 < npcCount; var1++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var1];
			}
		}
		if (var0 > npcCount) {
			throw new RuntimeException("gnpov1");
		}
		npcCount = 0;
		for (int var2 = 0; var2 < var0; var2++) {
			int var3 = npcIds[var2];
			ClientNpc var4 = npc[var3];
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
					var4.moveCode(false, var7);
					int var8 = in.gBit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
				} else if (var6 == 2) {
					npcIds[npcCount++] = var3;
					var4.cycle = loopCycle;
					int var9 = in.gBit(3);
					var4.moveCode(true, var9);
					int var10 = in.gBit(3);
					var4.moveCode(true, var10);
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

	@ObfuscatedName("i.h(I)V")
	public static void getNpcPosNewVis() {
		while (true) {
			if (in.bitsLeft(psize) >= 27) {
				int var0 = in.gBit(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (npc[var0] == null) {
						var1 = true;
						npc[var0] = new ClientNpc();
					}
					ClientNpc var2 = npc[var0];
					npcIds[npcCount++] = var0;
					var2.cycle = loopCycle;
					int var3 = in.gBit(1);
					int var4 = in.gBit(5);
					int var5 = in.gBit(1);
					if (var5 == 1) {
						entityUpdateIds[entityUpdateCount++] = var0;
					}
					int var6 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.dstYaw = var2.yaw = var6;
					}
					var2.type = NpcType.list(in.gBit(14));
					int var7 = in.gBit(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					var2.size = var2.type.size;
					if (var4 > 15) {
						var4 -= 32;
					}
					var2.walkanim_l = var2.type.walkanim_r;
					var2.readyanim = var2.type.readyanim;
					var2.walkanim_r = var2.type.walkanim_l;
					var2.turnleftanim = var2.type.turnleftanim;
					var2.turnspeed = var2.type.turnspeed;
					if (var2.turnspeed == 0) {
						var2.yaw = 0;
					}
					var2.walkanim_b = var2.type.walkanim_b;
					var2.walkanim = var2.type.walkanim;
					var2.turnrightanim = var2.type.turnrightanim;
					var2.teleport(var3 == 1, localPlayer.routeX[0] + var4, localPlayer.routeZ[0] - -var7);
					continue;
				}
			}
			in.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("s.d(Z)V")
	public static void getNpcPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
			ClientNpc var2 = npc[var1];
			int var3 = in.g1();
			if ((var3 & 0x8) != 0) {
				int var4 = in.g2_alt3();
				int var5 = in.g1_alt3();
				if (var4 == 65535) {
					var4 = -1;
				}
				triggerNpcAnim(var4, var5, var2);
			}
			if ((var3 & 0x1) != 0) {
				var2.chat = in.gjstr();
				var2.chatTimer = 100;
			}
			if ((var3 & 0x20) != 0) {
				var2.targetTileX = in.g2_alt3();
				var2.targetTileZ = in.g2();
			}
			if ((var3 & 0x80) != 0) {
				var2.spotanimId = in.g2_alt1();
				int var6 = in.g4_alt3();
				if (var2.spotanimId == 65535) {
					var2.spotanimId = -1;
				}
				var2.spotanimHeight = var6 >> 16;
				var2.spotanimFrame = 0;
				var2.spotanimCycle = 0;
				var2.spotanimLastCycle = (var6 & 0xFFFF) + loopCycle;
				if (loopCycle < var2.spotanimLastCycle) {
					var2.spotanimFrame = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				var2.targetId = in.g2_alt2();
				if (var2.targetId == 65535) {
					var2.targetId = -1;
				}
			}
			if ((var3 & 0x10) != 0) {
				var2.type = NpcType.list(in.g2_alt2());
				var2.turnspeed = var2.type.turnspeed;
				var2.size = var2.type.size;
				var2.turnleftanim = var2.type.turnleftanim;
				var2.turnrightanim = var2.type.turnrightanim;
				var2.readyanim = var2.type.readyanim;
				var2.walkanim_r = var2.type.walkanim_l;
				var2.walkanim_b = var2.type.walkanim_b;
				var2.walkanim_l = var2.type.walkanim_r;
				var2.walkanim = var2.type.walkanim;
			}
			if ((var3 & 0x40) != 0) {
				int var7 = in.g1_alt1();
				int var8 = in.g1_alt1();
				var2.addHitmark(loopCycle, var8, var7);
			}
			if ((var3 & 0x4) != 0) {
				int var9 = in.g1_alt2();
				int var10 = in.g1();
				var2.addHitmark(loopCycle, var10, var9);
				var2.combatCycle = loopCycle + 300;
				var2.field4109 = in.g1_alt1();
			}
		}
	}

	@ObfuscatedName("lf.a(IIIIB)V")
	public static void dirtyArea(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (arg3 < componentDrawX[var4] + componentDrawWidth[var4] && arg3 + arg1 > componentDrawX[var4] && arg2 < componentDrawY[var4] + componentDrawHeight[var4] && componentDrawY[var4] < arg0 + arg2) {
				componentDirtyArea[var4] = true;
			}
		}
	}

	// guessing placement
	@ObfuscatedName("li.a(IIIII)V")
	public static void blitArea(int arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < componentDrawCount; var4++) {
			if (componentDrawWidth[var4] + componentDrawX[var4] > arg0 && componentDrawX[var4] < arg2 + arg0 && componentDrawY[var4] + componentDrawHeight[var4] > arg3 && arg1 + arg3 > componentDrawY[var4]) {
				componentBlitArea[var4] = true;
			}
		}
	}

	@ObfuscatedName("ee.a(B)V")
	public static void mouseLoop() {
		if (objDragCom != null || dragCom != null) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickButton;
		if (isMenuOpen) {
			if (var0 != 1) {
				int var5 = ClientMouseListener.mouseX;
				int var6 = ClientMouseListener.mouseY;
				if (menuX - 10 > var5 || menuX + menuWidth + 10 < var5 || var6 < menuY - 10 || menuHeight + menuY + 10 < var6) {
					isMenuOpen = false;
					dirtyArea(menuHeight, menuWidth, menuY, menuX);
				}
			}
			if (var0 != 1) {
				return;
			}
			int var7 = menuX;
			int var8 = menuY;
			int var9 = menuWidth;
			int var10 = ClientMouseListener.mouseClickX;
			int var11 = ClientMouseListener.mouseClickY;
			int var12 = -1;
			for (int var13 = 0; var13 < menuNumEntries; var13++) {
				int var14 = var8 + (-var13 + menuNumEntries + -1) * 15 + 31;
				if (var10 > var7 && var10 < var7 + var9 && var11 > var14 - 13 && var11 < var14 + 3) {
					var12 = var13;
				}
			}
			if (var12 != -1) {
				doAction(var12);
			}
			isMenuOpen = false;
			dirtyArea(menuHeight, menuWidth, menuY, menuX);
			return;
		}
		if (var0 == 1 && menuNumEntries > 0) {
			short var1 = menuAction[menuNumEntries - 1];
			if (var1 == 6 || var1 == 8 || var1 == 49 || var1 == 44 || var1 == 13 || var1 == 28 || var1 == 9 || var1 == 2 || var1 == 21 || var1 == 18 || var1 == 12 || var1 == 1001) {
				int var2 = menuParamB[menuNumEntries - 1];
				int var3 = menuParamC[menuNumEntries - 1];
				IfType var4 = IfType.get(var3);
				if (ServerActive.isObjSwapEnabled(getActive(var4)) || ServerActive.isObjReplaceEnabled(getActive(var4))) {
					objDragCycles = 0;
					objGrabThreshold = false;
					if (objDragCom != null) {
						componentUpdated(objDragCom);
					}
					objDragCom = IfType.get(var3);
					objDragSlot = var2;
					objGrabX = ClientMouseListener.mouseClickX;
					objGrabY = ClientMouseListener.mouseClickY;
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
		if (var0 == 2 && menuNumEntries > 0) {
			openMenu();
			return;
		}
	}

	@ObfuscatedName("bj.d(I)V")
	public static void sortMinimenu() {
		boolean var0 = false;
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < menuNumEntries - 1; var1++) {
				if (menuAction[var1] < 1000 && menuAction[var1 + 1] > 1000) {
					var0 = false;
					JagString var2 = menuSubject[var1];
					menuSubject[var1] = menuSubject[var1 + 1];
					menuSubject[var1 + 1] = var2;
					JagString var3 = menuVerb[var1];
					menuVerb[var1] = menuVerb[var1 + 1];
					menuVerb[var1 + 1] = var3;
					int var4 = menuParamB[var1];
					menuParamB[var1] = menuParamB[var1 + 1];
					menuParamB[var1 + 1] = var4;
					int var5 = menuParamC[var1];
					menuParamC[var1] = menuParamC[var1 + 1];
					menuParamC[var1 + 1] = var5;
					short var6 = menuAction[var1];
					menuAction[var1] = menuAction[var1 + 1];
					menuAction[var1 + 1] = var6;
					long var7 = menuParamA[var1];
					menuParamA[var1] = menuParamA[var1 + 1];
					menuParamA[var1 + 1] = var7;
				}
			}
		}
	}

	@ObfuscatedName("de.d(I)V")
	public static void drawMinimenu() {
		int var0 = menuY;
		int var1 = menuX;
		int var2 = menuWidth;
		int var3 = menuHeight;
		Pix2D.fillRect(var1, var0, var2, var3, 6116423);
		Pix2D.fillRect(var1 + 1, var0 + 1, var2 - 2, 16, 0);
		Pix2D.drawRect(var1 + 1, var0 + 18, var2 - 2, var3 - 19, 0);
		b12.drawString(Text.CHOOSEOPTION, var1 + 3, var0 + 14, 6116423, -1);
		int var4 = ClientMouseListener.mouseX;
		int var5 = ClientMouseListener.mouseY;
		for (int var6 = 0; var6 < menuNumEntries; var6++) {
			int var7 = var0 + (menuNumEntries - var6 - 1) * 15 + 31;
			int var8 = 16777215;
			if (var1 < var4 && var4 < var2 + var1 && var5 > var7 - 13 && var5 < var7 + 3) {
				var8 = 16776960;
			}
			b12.drawString(getLine(var6), var1 + 3, var7, var8, 0);
		}
		blitArea(menuX, menuHeight, menuWidth, menuY);
	}

	@ObfuscatedName("ij.a(III)V")
	public static void drawFeedback(int arg0, int arg1) {
		if (menuNumEntries < 2 && useMode == 0 && !targetMode) {
			return;
		}
		JagString var2;
		if (useMode == 1 && menuNumEntries < 2) {
			var2 = JagString.join(new JagString[] { Text.USE, Text.MINISEPARATOR, objSelectedName, field3089 });
		} else if (targetMode && menuNumEntries < 2) {
			var2 = JagString.join(new JagString[] { targetVerb, Text.MINISEPARATOR, targetOp, field3089 });
		} else {
			var2 = getLine(menuNumEntries - 1);
		}
		if (menuNumEntries > 2) {
			var2 = JagString.join(new JagString[] { var2, field891, JagString.parseInt(menuNumEntries - 2), Text.MOREOPTIONS });
		}
		int var3 = b12.drawStringAntiMacro(var2, arg1 + 4, arg0 + 15, feedbackRand, feedbackSeed);
		dirtyArea(15, var3 + b12.stringWid(var2), arg0, arg1 + 4);
	}

	@ObfuscatedName("me.b(I)V")
	public static void openMenu() {
		int var0 = b12.stringWid(Text.CHOOSEOPTION);
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			int var2 = b12.stringWid(getLine(var1));
			if (var2 > var0) {
				var0 = var2;
			}
		}
		var0 += 8;
		menuWidth = var0;
		isMenuOpen = true;
		menuHeight = menuNumEntries * 15 + 22;
		int var3 = menuNumEntries * 15 + 21;
		int var4 = ClientMouseListener.mouseClickY;
		if (var3 + var4 > sHei) {
			var4 = sHei - var3;
		}
		if (var4 < 0) {
			var4 = 0;
		}
		int var5 = ClientMouseListener.mouseClickX - var0 / 2;
		if (var0 + var5 > sWid) {
			var5 = sWid - var0;
		}
		menuY = var4;
		if (var5 < 0) {
			var5 = 0;
		}
		menuX = var5;
	}

	@ObfuscatedName("ve.b(II)Z")
	public static boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = menuAction[arg0];
		if (var1 >= 2000) {
			var1 -= 2000;
		}
		return var1 == 1003;
	}

	@ObfuscatedName("qa.a(II)V")
	public static void doAction(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = menuParamB[arg0];
		int var2 = menuParamC[arg0];
		int var3 = menuAction[arg0];
		long var4 = menuParamA[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var6 = (int) menuParamA[arg0];
		if (var3 == 31) {
			ClientPlayer var7 = players[var6];
			if (var7 != null) {
				tryMove(1, 0, var7.routeZ[0], var7.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(192);
				out.p2_alt2(objComId);
				out.p4_alt1(objSelectedComId);
				out.p2(objSelectedSlot);
				out.p2(var6);
			}
		}
		if (var3 == 1006) {
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			out.p1Enc(191);
			out.p2(var6);
		}
		if (var3 == 7) {
			interactWithLoc(var2, var4, var1);
			out.p1Enc(53);
			out.p2((int) (var4 >>> 32) & Integer.MAX_VALUE);
			out.p2_alt3(mapBuildBaseZ + var2);
			out.p2_alt3(var1 + mapBuildBaseX);
		}
		if (var3 == 15) {
			IfType var8 = IfType.get(var1, var2);
			if (var8 != null) {
				endTargetMode();
				enterTargetMode(var2, ServerActive.targetMask(getActive(var8)), var1);
				useMode = 0;
				targetVerb = targetVerb(var8);
				if (targetVerb == null) {
					targetVerb = AUTO_NULL;
				}
				if (var8.v3) {
					targetOp = JagString.join(new JagString[] { var8.baseOpName, AUTO_TAG_COL_FFFFFF});
				} else {
					targetOp = JagString.join(new JagString[]{AUTO_TAG_COL_00FF00, var8.targetBase, AUTO_TAG_COL_FFFFFF});
				}
			}
			return;
		}
		if (var3 == 30) {
			ClientPlayer var9 = players[var6];
			if (var9 != null) {
				tryMove(1, 0, var9.routeZ[0], var9.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(65);
				out.p2_alt1(var6);
			}
		}
		if (var3 == 40) {
			out.p1Enc(196);
			out.p2_alt3(targetCom);
			out.p4(targetSub);
			out.p4_alt2(var2);
			out.p2_alt2(var1);
		}
		if (var3 == 34) {
			ClientNpc var10 = npc[var6];
			if (var10 != null) {
				tryMove(1, 0, var10.routeZ[0], var10.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(78);
				out.p2_alt2(var6);
			}
		}
		if (var3 == 58) {
			ClientPlayer var11 = players[var6];
			if (var11 != null) {
				tryMove(1, 0, var11.routeZ[0], var11.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(151);
				out.p2(var6);
			}
		}
		if (var3 == 4) {
			ClientNpc var12 = npc[var6];
			if (var12 != null) {
				tryMove(1, 0, var12.routeZ[0], var12.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(71);
				out.p2(var6);
			}
		}
		if (var3 == 39) {
			out.p1Enc(35);
			out.p2_alt3(var6);
			out.p2(targetCom);
			out.p4_alt3(targetSub);
			out.p2_alt2(var1);
			out.p4_alt3(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 36) {
			out.p1Enc(109);
			out.p4(var2);
			IfType var13 = IfType.get(var2);
			if (var13.scripts != null && var13.scripts[0][0] == 5) {
				int var14 = var13.scripts[0][1];
				VarCache.var[var14] = 1 - VarCache.var[var14];
				clientVar(var14);
			}
		}
		if (var3 == 1001) {
			IfType var15 = IfType.get(var2);
			if (var15 == null || var15.linkObjNumber[var1] < 100000) {
				out.p1Enc(191);
				out.p2(var6);
			} else {
				addChat(JagString.join(new JagString[] { JagString.parseInt(var15.linkObjNumber[var1]), AUTO_X, ObjType.list(var6).name}), 0, AUTO_EMPTY);
			}
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 1) {
			ClientPlayer var16 = players[var6];
			if (var16 != null) {
				tryMove(1, 0, var16.routeZ[0], var16.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				out.p1Enc(47);
				out.p2_alt3(var6);
			}
		}
		if (var3 == 21) {
			out.p1Enc(160);
			out.p2_alt3(var1);
			out.p4_alt1(var2);
			out.p2_alt2(var6);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 2) {
			out.p1Enc(216);
			out.p4_alt3(var2);
			out.p2_alt1(var1);
			out.p2_alt3(var6);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 35) {
			interactWithLoc(var2, var4, var1);
			out.p1Enc(13);
			out.p2_alt3(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.p2_alt1(mapBuildBaseX + var1);
			out.p2_alt1(var2 + mapBuildBaseZ);
		}
		if (var3 == 51) {
			interactWithLoc(var2, var4, var1);
			out.p1Enc(94);
			out.p2_alt2(var1 + mapBuildBaseX);
			out.p2(var2 + mapBuildBaseZ);
			out.p2_alt3(Integer.MAX_VALUE & (int) (var4 >>> 32));
		}
		if (var3 == 29) {
			ClientPlayer var17 = players[var6];
			if (var17 != null) {
				tryMove(1, 0, var17.routeZ[0], var17.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(118);
				out.p2_alt2(var6);
			}
		}
		if (var3 == 48) {
			ClientNpc var18 = npc[var6];
			if (var18 != null) {
				tryMove(1, 0, var18.routeZ[0], var18.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossMode = 2;
				out.p1Enc(30);
				out.p2_alt1(objSelectedSlot);
				out.p4_alt2(objSelectedComId);
				out.p2_alt1(var6);
				out.p2_alt3(objComId);
			}
		}
		if (var3 == 44) {
			out.p1Enc(112);
			out.p2(var1);
			out.p4_alt2(var2);
			out.p2_alt3(var6);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 14) {
			closeModal();
		}
		if (var3 == 17) {
			ClientNpc var19 = npc[var6];
			if (var19 != null) {
				tryMove(1, 0, var19.routeZ[0], var19.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossMode = 2;
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(164);
				out.p2(var6);
			}
		}
		if (var3 == 57) {
			boolean var20 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var20) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossCycle = 0;
			out.p1Enc(107);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p2_alt1(var6);
			out.p2_alt3(var1 + mapBuildBaseX);
		}
		if (var3 == 12) {
			endTargetMode();
			IfType var22 = IfType.get(var2);
			useMode = 1;
			objSelectedSlot = var1;
			objSelectedComId = var2;
			objComId = var6;
			componentUpdated(var22);
			objSelectedName = JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, ObjType.list(var6).name, AUTO_TAG_COL_FFFFFF});
			if (objSelectedName == null) {
				objSelectedName = AUTO_NULL_LOWER;
			}
			return;
		}
		if (var3 == 23) {
			ClientPlayer var23 = players[var6];
			if (var23 != null) {
				tryMove(1, 0, var23.routeZ[0], var23.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(6);
				out.p2_alt3(var6);
				out.p2_alt2(targetCom);
				out.p4_alt2(targetSub);
			}
		}
		if (var3 == 6) {
			out.p1Enc(150);
			out.p4_alt3(var2);
			out.p2_alt3(var1);
			out.p2(var6);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 10) {
			World.updateMousePicking(minusedlevel, var1, var2);
		}
		if (var3 == 1004) {
			interactWithLoc(var2, var4, var1);
			out.p1Enc(97);
			out.p2_alt3(var2 + mapBuildBaseZ);
			out.p2_alt3((int) (var4 >>> 32) & Integer.MAX_VALUE);
			out.p2_alt1(var1 + mapBuildBaseX);
		}
		if (var3 == 43 || var3 == 1003) {
			ifButtonX(var6, menuSubject[arg0], var1, var2);
		}
		if (var3 == 3) {
			boolean var24 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var24) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossCycle = 0;
			out.p1Enc(138);
			out.p2_alt2(var2 + mapBuildBaseZ);
			out.p2(var6);
			out.p2_alt2(mapBuildBaseX + var1);
		}
		if (var3 == 8) {
			out.p1Enc(205);
			out.p2_alt1(var6);
			out.p2_alt2(var1);
			out.p4_alt3(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 13) {
			out.p1Enc(26);
			out.p2(var1);
			out.p2(var6);
			out.p4(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 41) {
			boolean var26 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var26) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			out.p1Enc(77);
			out.p2_alt3(var6);
			out.p2_alt3(var2 + mapBuildBaseZ);
			out.p2(var1 + mapBuildBaseX);
		}
		if (var3 == 1002) {
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			ClientNpc var28 = npc[var6];
			if (var28 != null) {
				NpcType var29 = var28.type;
				if (var29.multinpc != null) {
					var29 = var29.getMultiNpc();
				}
				if (var29 != null) {
					out.p1Enc(127);
					out.p2_alt1(var29.id);
				}
			}
		}
		if (var3 == 49) {
			out.p1Enc(32);
			out.p2_alt3(var6);
			out.p4(var2);
			out.p2_alt3(var1);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 26 && interactWithLoc(var2, var4, var1)) {
			out.p1Enc(170);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p4(objSelectedComId);
			out.p2_alt3(var1 + mapBuildBaseX);
			out.p2_alt1(objSelectedSlot);
			out.p2_alt2(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.p2_alt3(objComId);
		}
		if (var3 == 45) {
			ClientPlayer var30 = players[var6];
			if (var30 != null) {
				tryMove(1, 0, var30.routeZ[0], var30.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				out.p1Enc(214);
				out.p2_alt2(var6);
			}
		}
		if (var3 == 25) {
			boolean var31 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var31) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			out.p1Enc(84);
			out.p2(var1 + mapBuildBaseX);
			out.p2(var6);
			out.p2_alt1(var2 + mapBuildBaseZ);
			out.p4_alt1(targetSub);
			out.p2_alt1(targetCom);
		}
		if (var3 == 22) {
			boolean var33 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var33) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			out.p1Enc(39);
			out.p2_alt1(var1 + mapBuildBaseX);
			out.p2_alt2(var6);
			out.p2_alt3(mapBuildBaseZ + var2);
		}
		if (var3 == 38) {
			ClientNpc var35 = npc[var6];
			if (var35 != null) {
				tryMove(1, 0, var35.routeZ[0], var35.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1Enc(33);
				out.p2_alt1(var6);
			}
		}
		if (var3 == 24 && interactWithLoc(var2, var4, var1)) {
			out.p1Enc(234);
			out.p2_alt1(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.p2_alt1(targetCom);
			out.p4_alt3(targetSub);
			out.p2_alt1(var1 + mapBuildBaseX);
			out.p2(mapBuildBaseZ + var2);
		}
		if (var3 == 28) {
			out.p1Enc(154);
			out.p4(var2);
			out.p2_alt3(var6);
			out.p2_alt3(var1);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 20) {
			out.p1Enc(109);
			out.p4(var2);
			IfType var36 = IfType.get(var2);
			if (var36.scripts != null && var36.scripts[0][0] == 5) {
				int var37 = var36.scripts[0][1];
				if (var36.scriptOperand[0] != VarCache.var[var37]) {
					VarCache.var[var37] = var36.scriptOperand[0];
					clientVar(var37);
				}
			}
		}
		if (var3 == 18) {
			out.p1Enc(251);
			out.p2(var1);
			out.p2_alt2(var6);
			out.p4(var2);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 47 && resumePauseCom == null) {
			resumePauseButton(var1, var2);
			resumePauseCom = IfType.get(var1, var2);
			componentUpdated(resumePauseCom);
		}
		if (var3 == 32) {
			ClientNpc var38 = npc[var6];
			if (var38 != null) {
				tryMove(1, 0, var38.routeZ[0], var38.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(195);
				out.p2(var6);
			}
		}
		if (var3 == 33) {
			interactWithLoc(var2, var4, var1);
			out.p1Enc(169);
			out.p2(var2 + mapBuildBaseZ);
			out.p2_alt1(Integer.MAX_VALUE & (int) (var4 >>> 32));
			out.p2_alt3(mapBuildBaseX + var1);
		}
		if (var3 == 11) {
			IfType var39 = IfType.get(var2);
			boolean var40 = true;
			if (var39.clientCode > 0) {
				var40 = clientButton(var39);
			}
			if (var40) {
				out.p1Enc(109);
				out.p4(var2);
			}
		}
		if (var3 == 9) {
			out.p1Enc(55);
			out.p2_alt1(var1);
			out.p4_alt1(var2);
			out.p2_alt2(var6);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 5) {
			boolean var41 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var41) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossCycle = 0;
			crossMode = 2;
			crossX = ClientMouseListener.mouseClickX;
			crossY = ClientMouseListener.mouseClickY;
			out.p1Enc(211);
			out.p2_alt3(mapBuildBaseX + var1);
			out.p2_alt1(var2 + mapBuildBaseZ);
			out.p2_alt3(var6);
		}
		if (var3 == 42) {
			out.p1Enc(4);
			out.p2(objComId);
			out.p2_alt2(var6);
			out.p2_alt2(objSelectedSlot);
			out.p4_alt2(var2);
			out.p2_alt2(var1);
			out.p4(objSelectedComId);
			selectedCycle = 0;
			selectedCom = IfType.get(var2);
			selectedItem = var1;
		}
		if (var3 == 37) {
			ClientPlayer var43 = players[var6];
			if (var43 != null) {
				tryMove(1, 0, var43.routeZ[0], var43.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				out.p1Enc(114);
				out.p2(var6);
			}
		}
		if (var3 == 16) {
			ClientPlayer var44 = players[var6];
			if (var44 != null) {
				tryMove(1, 0, var44.routeZ[0], var44.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				out.p1Enc(161);
				out.p2_alt2(var6);
			}
		}
		if (var3 == 1005) {
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			out.p1Enc(166);
			out.p2_alt2(var6);
		}
		if (var3 == 50) {
			ClientPlayer var45 = players[var6];
			if (var45 != null) {
				tryMove(1, 0, var45.routeZ[0], var45.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossMode = 2;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				out.p1Enc(204);
				out.p2_alt3(var6);
			}
		}
		if (var3 == 19) {
			ClientNpc var46 = npc[var6];
			if (var46 != null) {
				tryMove(1, 0, var46.routeZ[0], var46.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				out.p1Enc(145);
				out.p4_alt1(targetSub);
				out.p2_alt1(var6);
				out.p2(targetCom);
			}
		}
		if (var3 == 46) {
			boolean var47 = tryMove(0, 0, var2, var1, localPlayer.routeX[0], 0, 0, 2, false, 0, localPlayer.routeZ[0]);
			if (!var47) {
				tryMove(1, 0, var2, var1, localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
			}
			crossMode = 2;
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			out.p1Enc(176);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p4_alt3(objSelectedComId);
			out.p2_alt1(objSelectedSlot);
			out.p2_alt3(mapBuildBaseX + var1);
			out.p2_alt3(objComId);
			out.p2_alt1(var6);
		}
		if (useMode != 0) {
			useMode = 0;
			componentUpdated(IfType.get(objSelectedComId));
		}
		if (targetMode) {
			endTargetMode();
		}
		if (selectedCom != null && selectedCycle == 0) {
			componentUpdated(selectedCom);
		}
	}

	@ObfuscatedName("be.a(ILi;I)V")
	public static void opPlayer(JagString arg0, int arg1) {
		JagString var2 = arg0.method611().toScreenName();
		boolean var3 = false;
		for (int var4 = 0; var4 < playerCount; var4++) {
			ClientPlayer var5 = players[playerIds[var4]];
			if (var5 != null && var5.name != null && var5.name.equalsIgnoreCase(var2)) {
				tryMove(1, 0, var5.routeZ[0], var5.routeX[0], localPlayer.routeX[0], 1, 0, 2, false, 0, localPlayer.routeZ[0]);
				var3 = true;
				if (arg1 == 1) {
					// OPPLAYER1
					out.p1Enc(65);
					out.p2_alt1(playerIds[var4]);
				} else if (arg1 == 4) {
					// OPPLAYER4
					out.p1Enc(214);
					out.p2_alt2(playerIds[var4]);
				} else if (arg1 == 6) {
					// OPPLAYER6
					out.p1Enc(161);
					out.p2_alt2(playerIds[var4]);
				} else if (arg1 == 7) {
					// OPPLAYER7
					out.p1Enc(47);
					out.p2_alt3(playerIds[var4]);
				}
				break;
			}
		}
		if (!var3) {
			addChat(JagString.join(new JagString[] { Text.UNABLETOFIND, var2 }), 0, AUTO_EMPTY);
		}
	}

	@ObfuscatedName("of.a(ZIII)V")
	public static void enterTargetMode(int arg0, int arg1, int arg2) {
		IfType var3 = IfType.get(arg2, arg0);
		if (var3 != null && var3.ontargetenter != null) {
			HookReq var4 = new HookReq();
			var4.component = var3;
			var4.onop = var3.ontargetenter;
			ScriptRunner.executeScript(var4);
		}
		targetMode = true;
		targetCom = arg2;
		targetMask = arg1;
		targetSub = arg0;
		componentUpdated(var3);
	}

	@ObfuscatedName("eb.e(I)V")
	public static void endTargetMode() {
		if (!targetMode) {
			return;
		}
		IfType var0 = IfType.get(targetCom, targetSub);
		if (var0 != null && var0.ontargetleave != null) {
			HookReq var1 = new HookReq();
			var1.component = var0;
			var1.onop = var0.ontargetleave;
			ScriptRunner.executeScript(var1);
		}
		targetMode = false;
		componentUpdated(var0);
	}

	@ObfuscatedName("sg.a(ILi;III)V")
	public static void ifButtonX(int arg0, JagString arg1, int arg2, int arg3) {
		IfType var4 = IfType.get(arg2, arg3);
		if (var4 == null) {
			return;
		}
		if (var4.onop != null) {
			HookReq var5 = new HookReq();
			var5.opindex = arg0;
			var5.component = var4;
			var5.onop = var4.onop;
			var5.opbase = arg1;
			ScriptRunner.executeScript(var5);
		}
		boolean var6 = true;
		if (var4.clientCode > 0) {
			var6 = clientButton(var4);
		}
		if (!var6 || !ServerActive.hasOp(arg0 - 1, getActive(var4))) {
			return;
		}
		if (arg0 == 1) {
			// IF_BUTTON1
			out.p1Enc(44);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 2) {
			// IF_BUTTON2
			out.p1Enc(50);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 3) {
			// IF_BUTTON3
			out.p1Enc(103);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 4) {
			// IF_BUTTON4
			out.p1Enc(64);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 5) {
			// IF_BUTTON5
			out.p1Enc(178);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 6) {
			// IF_BUTTON6
			out.p1Enc(81);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 7) {
			// IF_BUTTON7
			out.p1Enc(236);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 8) {
			// IF_BUTTON8
			out.p1Enc(188);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 9) {
			// IF_BUTTON9
			out.p1Enc(128);
			out.p4(arg3);
			out.p2(arg2);
		}
		if (arg0 == 10) {
			// IF_BUTTON10
			out.p1Enc(254);
			out.p4(arg3);
			out.p2(arg2);
		}
	}

	@ObfuscatedName("j.a(IILi;SJLi;I)V")
	public static void addMenuOption(int arg0, JagString arg1, short arg2, long arg3, JagString arg4, int arg5) {
		if (isMenuOpen || menuNumEntries >= 500) {
			return;
		}
		menuVerb[menuNumEntries] = arg1;
		menuSubject[menuNumEntries] = arg4;
		menuAction[menuNumEntries] = arg2;
		menuParamA[menuNumEntries] = arg3;
		menuParamB[menuNumEntries] = arg0;
		menuParamC[menuNumEntries] = arg5;
		menuNumEntries++;
	}

	@ObfuscatedName("ha.a(IZ)Li;")
	public static JagString getLine(int arg0) {
		return menuSubject[arg0].length() <= 0 ? menuVerb[arg0] : JagString.join(new JagString[] { menuVerb[arg0], Text.MINISEPARATOR, menuSubject[arg0] });
	}

	@ObfuscatedName("sh.a(IIIIIII)V")
	public static void minimenuBuildSceneActions(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (useMode == 0 && !targetMode) {
			int var6 = Pix3D.minX;
			int var7 = Pix3D.maxX;
			int var8 = Pix3D.minY;
			int var9 = Pix3D.maxY;
			int var10 = var8 + (var9 - var8) * (arg0 - arg4) / arg2;
			int var11 = var6 + (var7 - var6) * (arg5 - arg1) / arg3;
			addMenuOption(var11, moveAction, (short) 10, 0L, AUTO_EMPTY, var10);
		}
		long var12 = -1L;
		for (int var14 = 0; var14 < SoftwareModelLit.pickedCount; var14++) {
			long var15 = SoftwareModelLit.pickedEntityTypecode[var14];
			int var17 = (int) var15 & 0x7F;
			int var18 = (int) var15 >> 7 & 0x7F;
			int var19 = (int) var15 >> 29 & 0x3;
			int var20 = Integer.MAX_VALUE & (int) (var15 >>> 32);
			if (var15 != var12) {
				var12 = var15;
				if (var19 == 2 && World.method1386(minusedlevel, var17, var18, var15)) {
					LocType var21 = LocType.list(var20);
					if (var21.multiloc != null) {
						var21 = var21.getMultiLoc();
					}
					if (var21 == null) {
						continue;
					}
					if (useMode == 1) {
						addMenuOption(var17, Text.USE, (short) 26, var15, JagString.join(new JagString[] {objSelectedName, AUTO_TAG_COL_00FFFF_USE, var21.name }), var18);
					} else if (!targetMode) {
						JagString[] var22 = var21.op;
						if (showOpIndex) {
							var22 = prependOpIndex(var22);
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
									addMenuOption(var17, var22[var23], var24, var15, JagString.join(new JagString[] {AUTO_TAG_COL_00FFFF, var21.name }), var18);
								}
							}
						}
						addMenuOption(var17, Text.EXAMINE, (short) 1005, (long) var21.id, JagString.join(new JagString[] {AUTO_TAG_COL_00FFFF, var21.name }), var18);
					} else if ((targetMask & 0x4) == 4) {
						addMenuOption(var17, targetVerb, (short) 24, var15, JagString.join(new JagString[] {targetOp, AUTO_TAG_COL_00FFFF_USE, var21.name }), var18);
					}
				}
				if (var19 == 1) {
					ClientNpc var25 = npc[var20];
					if (var25.type.size == 1 && (var25.x & 0x7F) == 64 && (var25.z & 0x7F) == 64) {
						for (int var26 = 0; var26 < npcCount; var26++) {
							ClientNpc var27 = npc[npcIds[var26]];
							if (var27 != null && var25 != var27 && var27.type.size == 1 && var25.x == var27.x && var25.z == var27.z) {
								addNpcOptions(var27.type, npcIds[var26], var18, var17);
							}
						}
						for (int var28 = 0; var28 < playerCount; var28++) {
							ClientPlayer var29 = players[playerIds[var28]];
							if (var29 != null && var25.x == var29.x && var29.z == var25.z) {
								addPlayerOptions(playerIds[var28], var17, var18, var29);
							}
						}
					}
					addNpcOptions(var25.type, var20, var18, var17);
				}
				if (var19 == 0) {
					ClientPlayer var30 = players[var20];
					if ((var30.x & 0x7F) == 64 && (var30.z & 0x7F) == 64) {
						for (int var31 = 0; var31 < npcCount; var31++) {
							ClientNpc var32 = npc[npcIds[var31]];
							if (var32 != null && var32.type.size == 1 && var32.x == var30.x && var32.z == var30.z) {
								addNpcOptions(var32.type, npcIds[var31], var18, var17);
							}
						}
						for (int var33 = 0; var33 < playerCount; var33++) {
							ClientPlayer var34 = players[playerIds[var33]];
							if (var34 != null && var34 != var30 && var34.x == var30.x && var34.z == var30.z) {
								addPlayerOptions(playerIds[var33], var17, var18, var34);
							}
						}
					}
					addPlayerOptions(var20, var17, var18, var30);
				}
				if (var19 == 3) {
					LinkList var35 = groundObj[minusedlevel][var17][var18];
					if (var35 != null) {
						for (ClientObjNode var36 = (ClientObjNode) var35.tail(); var36 != null; var36 = (ClientObjNode) var35.prev()) {
							int var37 = var36.obj.id;
							ObjType var38 = ObjType.list(var37);
							if (useMode == 1) {
								addMenuOption(var17, Text.USE, (short) 46, (long) var37, JagString.join(new JagString[] {objSelectedName, AUTO_TAG_COL_FF9040_USE, var38.name}), var18);
							} else if (!targetMode) {
								JagString[] var39 = var38.op;
								if (showOpIndex) {
									var39 = prependOpIndex(var39);
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
										addMenuOption(var17, var39[var40], var41, (long) var37, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var38.name}), var18);
									} else if (var40 == 2) {
										addMenuOption(var17, Text.TAKE, (short) 41, (long) var37, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var38.name}), var18);
									}
								}
								addMenuOption(var17, Text.EXAMINE, (short) 1006, (long) var37, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var38.name}), var18);
							} else if ((targetMask & 0x1) == 1) {
								addMenuOption(var17, targetVerb, (short) 25, (long) var37, JagString.join(new JagString[] {targetOp, AUTO_TAG_COL_FF9040_USE, var38.name}), var18);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ug.a(Llf;IIII)V")
	public static void addNpcOptions(NpcType arg0, int arg1, int arg2, int arg3) {
		if (menuNumEntries >= 400) {
			return;
		}
		if (arg0.multinpc != null) {
			arg0 = arg0.getMultiNpc();
		}
		if (arg0 == null || !arg0.active) {
			return;
		}
		JagString var4 = arg0.name;
		if (arg0.vislevel != 0) {
			var4 = JagString.join(new JagString[] { var4, combatColourCode(arg0.vislevel, localPlayer.combatLevel), AUTO_TAG_NPCOP, Text.LEVEL, JagString.parseInt(arg0.vislevel), AUTO_TAG_NPCOP_CLOSE});
		}
		if (useMode == 1) {
			addMenuOption(arg3, Text.USE, (short) 48, (long) arg1, JagString.join(new JagString[] { objSelectedName, AUTO_TAG_COL_FFFF00_USE, var4 }), arg2);
		} else if (!targetMode) {
			JagString[] var5 = arg0.op;
			if (showOpIndex) {
				var5 = prependOpIndex(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && (modegame != 0 || !var5[var6].equalsIgnoreCase(Text.ATTACK))) {
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
						addMenuOption(arg3, var5[var6], var7, (long) arg1, JagString.join(new JagString[] {AUTO_TAG_COL_FFFF00, var4 }), arg2);
					}
				}
			}
			if (modegame == 0 && var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].equalsIgnoreCase(Text.ATTACK)) {
						short var9 = 0;
						if (arg0.vislevel > localPlayer.combatLevel) {
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
						addMenuOption(arg3, var5[var8], var10, (long) arg1, JagString.join(new JagString[] {AUTO_TAG_COL_FFFF00, var4 }), arg2);
					}
				}
			}
			addMenuOption(arg3, Text.EXAMINE, (short) 1002, (long) arg1, JagString.join(new JagString[] {AUTO_TAG_COL_FFFF00, var4 }), arg2);
		} else if ((targetMask & 0x2) == 2) {
			addMenuOption(arg3, targetVerb, (short) 19, (long) arg1, JagString.join(new JagString[] { targetOp, AUTO_TAG_COL_FFFF00_USE, var4 }), arg2);
		}
	}

	@ObfuscatedName("mh.a(IIIILdj;)V")
	public static void addPlayerOptions(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (arg3 == localPlayer || menuNumEntries >= 400) {
			return;
		}
		JagString var4;
		if (arg3.skillLevel == 0) {
			var4 = JagString.join(new JagString[] { arg3.name, combatColourCode(arg3.combatLevel, localPlayer.combatLevel), AUTO_TAG_NPCOP, Text.LEVEL, JagString.parseInt(arg3.combatLevel), AUTO_TAG_NPCOP_CLOSE});
		} else {
			var4 = JagString.join(new JagString[] { arg3.name, AUTO_TAG_NPCOP, Text.SKILL, JagString.parseInt(arg3.skillLevel), AUTO_TAG_NPCOP_CLOSE});
		}
		if (useMode == 1) {
			addMenuOption(arg1, Text.USE, (short) 31, (long) arg0, JagString.join(new JagString[] {objSelectedName, AUTO_TAG_COL_FFFFFF_USE, var4 }), arg2);
		} else if (!targetMode) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (playerOp[var5] != null) {
					short var6 = 0;
					if (modegame == 0 && playerOp[var5].equalsIgnoreCase(Text.ATTACK)) {
						if (arg3.combatLevel > localPlayer.combatLevel) {
							var6 = 2000;
						}
						if (localPlayer.team != 0 && arg3.team != 0) {
							if (arg3.team == localPlayer.team) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (playerOpPriority[var5]) {
						var6 = 2000;
					}
					short var7 = MENUACTION_PLAYER[var5];
					short var8 = (short) (var7 + var6);
					addMenuOption(arg1, playerOp[var5], var8, (long) arg0, JagString.join(new JagString[] {AUTO_TAG_COL_FFFFFF, var4 }), arg2);
				}
			}
		} else if ((targetMask & 0x8) == 8) {
			addMenuOption(arg1, targetVerb, (short) 23, (long) arg0, JagString.join(new JagString[] {targetOp, AUTO_TAG_COL_FFFFFF_USE, var4 }), arg2);
		}
		for (int var9 = 0; var9 < menuNumEntries; var9++) {
			if (menuAction[var9] == 10) {
				menuSubject[var9] = JagString.join(new JagString[] {AUTO_TAG_COL_FFFFFF, var4 });
				return;
			}
		}
	}

	@ObfuscatedName("b.a(IILq;B)V")
	public static void addComponentOptions(int arg0, int arg1, IfType arg2) {
		if (arg2.buttonType == 1) {
			addMenuOption(0, arg2.buttonText, (short) 11, 0L, AUTO_EMPTY, arg2.parentId);
		}
		if (arg2.buttonType == 2 && !targetMode) {
			JagString var3 = targetVerb(arg2);
			if (var3 != null) {
				addMenuOption(-1, var3, (short) 15, 0L, JagString.join(new JagString[] {AUTO_TAG_COL_00FF00, arg2.targetBase }), arg2.parentId);
			}
		}
		if (arg2.buttonType == 3) {
			addMenuOption(0, Text.CLOSE, (short) 14, 0L, AUTO_EMPTY, arg2.parentId);
		}
		if (arg2.buttonType == 4) {
			addMenuOption(0, arg2.buttonText, (short) 36, 0L, AUTO_EMPTY, arg2.parentId);
		}
		if (arg2.buttonType == 5) {
			addMenuOption(0, arg2.buttonText, (short) 20, 0L, AUTO_EMPTY, arg2.parentId);
		}
		if (arg2.buttonType == 6 && resumePauseCom == null) {
			addMenuOption(-1, arg2.buttonText, (short) 47, 0L, AUTO_EMPTY, arg2.parentId);
		}
		if (arg2.type == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg2.height; var5++) {
				for (int var6 = 0; var6 < arg2.width; var6++) {
					int var7 = (arg2.marginY + 32) * var5;
					int var8 = (arg2.marginX + 32) * var6;
					if (var4 < 20) {
						var7 += arg2.invBackgroundY[var4];
						var8 += arg2.invBackgroundX[var4];
					}
					if (arg1 >= var8 && arg0 >= var7 && var8 + 32 > arg1 && var7 + 32 > arg0) {
						hoveredSlotCom = arg2;
						hoveredSlot = var4;
						if (arg2.linkObjType[var4] > 0) {
							ObjType var9 = ObjType.list(arg2.linkObjType[var4] - 1);
							if (useMode == 1 && ServerActive.isObjOpsEnabled(getActive(arg2))) {
								if (objSelectedComId != arg2.parentId || var4 != objSelectedSlot) {
									addMenuOption(var4, Text.USE, (short) 42, (long) var9.id, JagString.join(new JagString[] {objSelectedName, AUTO_TAG_COL_FF9040_USE, var9.name}), arg2.parentId);
								}
							} else if (!targetMode || !ServerActive.isObjOpsEnabled(getActive(arg2))) {
								JagString[] var10 = var9.iop;
								if (showOpIndex) {
									var10 = prependOpIndex(var10);
								}
								if (ServerActive.isObjOpsEnabled(getActive(arg2))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 21;
											} else {
												var12 = 18;
											}
											addMenuOption(var4, var10[var11], var12, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
										} else if (var11 == 4) {
											addMenuOption(var4, Text.DROP, (short) 18, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
										}
									}
								}
								if (ServerActive.isObjUseEnabled(getActive(arg2))) {
									addMenuOption(var4, Text.USE, (short) 12, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
								}
								if (ServerActive.isObjOpsEnabled(getActive(arg2)) && var10 != null) {
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
											addMenuOption(var4, var10[var13], var14, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
										}
									}
								}
								JagString[] var15 = arg2.iop;
								if (showOpIndex) {
									var15 = prependOpIndex(var15);
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
											addMenuOption(var4, var15[var16], var17, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
										}
									}
								}
								addMenuOption(var4, Text.EXAMINE, (short) 1001, (long) var9.id, JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var9.name}), arg2.parentId);
							} else if ((targetMask & 0x10) == 16) {
								addMenuOption(var4, targetVerb, (short) 39, (long) var9.id, JagString.join(new JagString[] {targetOp, AUTO_TAG_COL_FF9040_USE, var9.name}), arg2.parentId);
							}
						}
					}
					var4++;
				}
			}
		}
		if (arg2.v3) {
			if (!targetMode) {
				for (int var18 = 9; var18 >= 5; var18--) {
					JagString var19 = getIfTypeOpName(arg2, var18);
					if (var19 != null) {
						addMenuOption(arg2.subId, var19, (short) 1003, (long) (var18 + 1), arg2.baseOpName, arg2.parentId);
					}
				}
				JagString var20 = targetVerb(arg2);
				if (var20 != null) {
					addMenuOption(arg2.subId, var20, (short) 15, 0L, arg2.baseOpName, arg2.parentId);
				}
				for (int var21 = 4; var21 >= 0; var21--) {
					JagString var22 = getIfTypeOpName(arg2, var21);
					if (var22 != null) {
						addMenuOption(arg2.subId, var22, (short) 43, (long) (var21 + 1), arg2.baseOpName, arg2.parentId);
					}
				}
				if (ServerActive.pauseButton(getActive(arg2))) {
					addMenuOption(arg2.subId, Text.CONTINUE, (short) 47, 0L, AUTO_EMPTY, arg2.parentId);
				}
			} else if (ServerActive.isUseTarget(getActive(arg2)) && (targetMask & 0x20) == 32) {
				addMenuOption(arg2.subId, targetVerb, (short) 40, 0L, JagString.join(new JagString[]{targetOp, AUTO_TARGET_COM, arg2.baseOpName}), arg2.parentId);
			}
		}
	}

	@ObfuscatedName("eh.a(IIBIIIIII)V")
	public static void drawInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.openInterface(arg1)) {
			dragChildren = null;
			drawLayer(IfType.list[arg1], arg5, arg2, arg3, arg0, arg6, arg4, -1, arg7);
			if (dragChildren != null) {
				drawLayer(dragChildren, arg5, arg2, arg3, arg0, dragChildX, dragChildY, -1412584499, arg7);
				dragChildren = null;
			}
		} else if (arg3 == -1) {
			for (int var8 = 0; var8 < 100; var8++) {
				componentDirtyArea[var8] = true;
			}
		} else {
			componentDirtyArea[arg3] = true;
		}
	}

	@ObfuscatedName("pb.a([Lq;IIZIIIIII)V")
	public static void drawLayer(IfType[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Pix2D.setClipping(arg1, arg2, arg8, arg4);
		Pix3D.setRenderClipping();
		for (int var9 = 0; var9 < arg0.length; var9++) {
			IfType var10 = arg0[var9];
			if (var10 != null && (arg7 == var10.layerId || arg7 == 0xabcdabcd && var10 == dragCom)) {
				int var11;
				if (arg3 == -1) {
					componentDrawX[componentDrawCount] = arg5 + var10.renderX;
					componentDrawY[componentDrawCount] = var10.renderY + arg6;
					componentDrawWidth[componentDrawCount] = var10.renderWidth;
					componentDrawHeight[componentDrawCount] = var10.renderHeight;
					var11 = componentDrawCount++;
				} else {
					var11 = arg3;
				}
				var10.drawTime = loopCycle;
				var10.drawCount = var11;
				if (!var10.v3 || !hide(var10)) {
					if (var10.clientCode > 0) {
						clientComponent(var10);
					}
					int var12 = var10.renderX + arg5;
					int var13 = var10.renderY + arg6;
					int var14 = var10.trans;
					if (qaOpTest && (getActive(var10) != 0 || var10.type == 0) && var14 > 127) {
						var14 = 127;
					}
					if (var10 == dragCom) {
						if (arg7 != 0xabcdabcd && !var10.draggablebehavior) {
							dragChildY = arg6;
							dragChildren = arg0;
							dragChildX = arg5;
							continue;
						}
						if (!var10.draggablebehavior) {
							var14 = 128;
						}
						if (dragAlive && dragging) {
							int var15 = ClientMouseListener.mouseX;
							int var16 = var15 - dragPickupX;
							if (dragParentX > var16) {
								var16 = dragParentX;
							}
							if (dragLayer.renderWidth + dragParentX < var10.renderWidth + var16) {
								var16 = dragParentX + dragLayer.renderWidth - var10.renderWidth;
							}
							var12 = var16;
							int var17 = ClientMouseListener.mouseY;
							int var18 = var17 - dragPickupY;
							if (dragParentY > var18) {
								var18 = dragParentY;
							}
							if (var18 + var10.renderHeight > dragParentY - -dragLayer.renderHeight) {
								var18 = dragLayer.renderHeight + dragParentY - var10.renderHeight;
							}
							var13 = var18;
						}
					}
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var19 = arg2;
						var20 = arg8;
						var21 = arg4;
						var22 = arg1;
					} else {
						var19 = var13 <= arg2 ? arg2 : var13;
						var22 = arg1 >= var12 ? arg1 : var12;
						int var23 = var10.renderWidth + var12;
						int var24 = var13 + var10.renderHeight;
						if (var10.type == 9) {
							var24++;
							var23++;
						}
						var21 = var24 >= arg4 ? arg4 : var24;
						var20 = arg8 <= var23 ? arg8 : var23;
					}
					if (!var10.v3 || var22 < var20 && var19 < var21) {
						if (var10.clientCode != 0) {
							if (var10.clientCode == 1337) {
								menuMouseY = var12;
								menuMouseX = var13;
								gameDrawMain(var10.renderWidth, var12, var10.renderHeight, var13);
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.clientCode == 1338) {
								if (var10.calculateGraphicMask()) {
									minimapDraw(var10, var11, var12, var13);
									Pix2D.setClipping(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.clientCode == 1339) {
								if (var10.calculateGraphicMask()) {
									drawCompass(var11, var12, var13, var10);
									Pix2D.setClipping(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (var10.clientCode == 1400) {
								WorldMap.draw(var10.renderWidth, var10.renderHeight, var12, var13);
								componentDirtyArea[var11] = true;
								componentBlitArea[var11] = true;
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
							if (var10.clientCode == 1401) {
								WorldMap.drawOverview(var13, var12, var10.renderWidth, var10.renderHeight);
								componentDirtyArea[var11] = true;
								componentBlitArea[var11] = true;
								Pix2D.setClipping(arg1, arg2, arg8, arg4);
								continue;
							}
						}
						int var25 = ClientMouseListener.mouseX;
						if (var10.type == 0 && var10.noClickThrough && var22 <= ClientMouseListener.mouseX && ClientMouseListener.mouseY >= var19 && var20 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var21 && !isMenuOpen && !qaOpTest) {
							menuNumEntries = 1;
							menuVerb[0] = Text.CANCEL;
							menuSubject[0] = AUTO_EMPTY;
							menuAction[0] = 1007;
						}
						int var26 = ClientMouseListener.mouseY;
						if (!isMenuOpen && var25 >= var22 && var26 >= var19 && var25 < var20 && var21 > var26) {
							addComponentOptions(var26 - var13, -var12 + var25, var10);
						}
						if (var10.type == 0) {
							if (!var10.v3 && hide(var10) && var10 != overCom) {
								continue;
							}
							if (!var10.v3) {
								if (var10.scrollPosY > var10.scrollHeight - var10.renderHeight) {
									var10.scrollPosY = var10.scrollHeight - var10.renderHeight;
								}
								if (var10.scrollPosY < 0) {
									var10.scrollPosY = 0;
								}
							}
							drawLayer(arg0, var22, var19, var11, var21, var12 - var10.scrollPosX, -var10.scrollPosY + var13, var10.parentId, var20);
							if (var10.subcomponents != null) {
								drawLayer(var10.subcomponents, var22, var19, var11, var21, var12 - var10.scrollPosX, -var10.scrollPosY + var13, var10.parentId, var20);
							}
							SubInterface var27 = (SubInterface) subinterfaces.find((long) var10.parentId);
							if (var27 != null) {
								if (var27.type == 0 && var22 <= ClientMouseListener.mouseX && var19 <= ClientMouseListener.mouseY && ClientMouseListener.mouseX < var20 && ClientMouseListener.mouseY < var21 && !isMenuOpen && !qaOpTest) {
									menuAction[0] = 1007;
									menuNumEntries = 1;
									menuVerb[0] = Text.CANCEL;
									menuSubject[0] = AUTO_EMPTY;
								}
								drawInterface(var21, var27.id, var19, var11, var13, var22, var12, var20);
							}
							Pix2D.setClipping(arg1, arg2, arg8, arg4);
							Pix3D.setRenderClipping();
						}
						if (componentRedraw[var11] || componentRectDebug > 1) {
							if (var10.type == 0 && !var10.v3 && var10.renderHeight < var10.scrollHeight) {
								drawScrollbar(var10.scrollPosY, var10.renderHeight, var13, var10.scrollHeight, var12 + var10.renderWidth);
							}
							if (var10.type != 1) {
								if (var10.type == 2) {
									int var28 = 0;
									for (int var29 = 0; var29 < var10.height; var29++) {
										for (int var30 = 0; var30 < var10.width; var30++) {
											int var31 = var13 + (var10.marginY + 32) * var29;
											int var32 = var12 + var30 * (var10.marginX + 32);
											if (var28 < 20) {
												var32 += var10.invBackgroundX[var28];
												var31 += var10.invBackgroundY[var28];
											}
											if (var10.linkObjType[var28] > 0) {
												int var34 = var10.linkObjType[var28] - 1;
												if (var32 + 32 > arg1 && var32 < arg8 && arg2 < var31 + 32 && var31 < arg4 || objDragCom == var10 && var28 == objDragSlot) {
													Pix32 var35;
													if (useMode == 1 && var28 == objSelectedSlot && var10.parentId == objSelectedComId) {
														var35 = ObjType.getSprite(2, var34, var10.linkObjNumber[var28], var10.showCount, 0);
													} else {
														var35 = ObjType.getSprite(1, var34, var10.linkObjNumber[var28], var10.showCount, 3153952);
													}
													if (Pix3D.textureFallback) {
														componentDirtyArea[var11] = true;
													}
													if (var35 == null) {
														componentUpdated(var10);
													} else if (var10 == objDragCom && objDragSlot == var28) {
														int var36 = ClientMouseListener.mouseX - objGrabX;
														int var37 = ClientMouseListener.mouseY - objGrabY;
														if (var36 < 5 && var36 > -5) {
															var36 = 0;
														}
														if (var37 < 5 && var37 > -5) {
															var37 = 0;
														}
														if (objDragCycles < 5) {
															var36 = 0;
															var37 = 0;
														}
														var35.transPlotSprite(var36 + var32, var37 + var31, 128);
														if (arg7 != -1) {
															IfType var38 = arg0[arg7 & 0xFFFF];
															int var39 = Pix2D.clipMaxY;
															int var40 = Pix2D.clipMinY;
															if (var31 + var37 < var40 && var38.scrollPosY > 0) {
																int var41 = worldUpdateNum * (var40 - var37 - var31) / 3;
																if (worldUpdateNum * 10 < var41) {
																	var41 = worldUpdateNum * 10;
																}
																if (var38.scrollPosY < var41) {
																	var41 = var38.scrollPosY;
																}
																var38.scrollPosY -= var41;
																objGrabY += var41;
																componentUpdated(var38);
															}
															if (var37 + var31 + 32 > var39 && var38.scrollHeight - var38.renderHeight > var38.scrollPosY) {
																int var42 = worldUpdateNum * (var31 + var37 + 32 - var39) / 3;
																if (worldUpdateNum * 10 < var42) {
																	var42 = worldUpdateNum * 10;
																}
																if (var38.scrollHeight - var38.scrollPosY - var38.renderHeight < var42) {
																	var42 = var38.scrollHeight - var38.scrollPosY - var38.renderHeight;
																}
																var38.scrollPosY += var42;
																objGrabY -= var42;
																componentUpdated(var38);
															}
														}
													} else if (selectedCom == var10 && var28 == selectedItem) {
														var35.transPlotSprite(var32, var31, 128);
													} else {
														var35.plotSprite(var32, var31);
													}
												}
											} else if (var10.invBackground != null && var28 < 20) {
												Pix32 var33 = var10.getInvBackground(var28);
												if (var33 != null) {
													var33.plotSprite(var32, var31);
												} else if (IfType.loadingAsset) {
													componentUpdated(var10);
												}
											}
											var28++;
										}
									}
								} else if (var10.type == 3) {
									int var43;
									if (getIfActive(var10)) {
										var43 = var10.colour2;
										if (var10 == overCom && var10.colour2Over != 0) {
											var43 = var10.colour2Over;
										}
									} else {
										var43 = var10.colour;
										if (overCom == var10 && var10.colourOver != 0) {
											var43 = var10.colourOver;
										}
									}
									if (var14 == 0) {
										if (var10.fill) {
											Pix2D.fillRect(var12, var13, var10.renderWidth, var10.renderHeight, var43);
										} else {
											Pix2D.drawRect(var12, var13, var10.renderWidth, var10.renderHeight, var43);
										}
									} else if (var10.fill) {
										Pix2D.fillRectTrans(var12, var13, var10.renderWidth, var10.renderHeight, var43, 256 - (var14 & 0xFF));
									} else {
										Pix2D.drawRectTrans(var12, var13, var10.renderWidth, var10.renderHeight, var43, 256 - (var14 & 0xFF));
									}
								} else if (var10.type == 4) {
									PixfontGeneric var44 = var10.getFont(modIcons);
									if (var44 != null) {
										JagString var45 = var10.text;
										int var46;
										if (getIfActive(var10)) {
											var46 = var10.colour2;
											if (overCom == var10 && var10.colour2Over != 0) {
												var46 = var10.colour2Over;
											}
											if (var10.text2.length() > 0) {
												var45 = var10.text2;
											}
										} else {
											var46 = var10.colour;
											if (overCom == var10 && var10.colourOver != 0) {
												var46 = var10.colourOver;
											}
										}
										if (var10.v3 && var10.invobject != -1) {
											ObjType var47 = ObjType.list(var10.invobject);
											var45 = var47.name;
											if (var45 == null) {
												var45 = AUTO_NULL_LOWER;
											}
											if ((var47.stackable == 1 || var10.invcount != 1) && var10.invcount != -1) {
												var45 = JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var45, AUTO_TAG_COL_CLOSE_X, niceNumber(var10.invcount) });
											}
										}
										if (resumePauseCom == var10) {
											var45 = Text.PLEASEWAIT;
											var46 = var10.colour;
										}
										if (!var10.v3) {
											var45 = substituteVars(var45, var10);
										}
										var44.drawStringMultiline(var45, var12, var13, var10.renderWidth, var10.renderHeight, var46, var10.shadow ? 0 : -1, var10.hAlign, var10.vAlign, var10.lineHeight);
									} else if (IfType.loadingAsset) {
										componentUpdated(var10);
									}
								} else if (var10.type == 5) {
									if (var10.v3) {
										Pix32 var48;
										if (var10.invobject == -1) {
											var48 = var10.getGraphic(false);
										} else {
											var48 = ObjType.getSprite(var10.outline, var10.invobject, var10.invcount, var10.showCount, var10.shadowColour);
										}
										if (var48 != null) {
											int var49 = var48.owi;
											int var50 = var48.ohi;
											if (var10.tiling) {
												int var52 = (var49 + var10.renderWidth - 1) / var49;
												int var53 = (var10.renderHeight + var50 - 1) / var50;
												Pix2D.setSubClipping(var12, var13, var10.renderWidth + var12, var10.renderHeight + var13);
												for (int var54 = 0; var54 < var52; var54++) {
													for (int var55 = 0; var55 < var53; var55++) {
														if (var10.rotate != 0) {
															var48.pixelPerfectRotateScalePlotSprite(var50 / 2 + var55 * var50 + var13, var12 + var49 * var54 - -(var49 / 2), 4096, var10.rotate);
														} else if (var14 == 0) {
															var48.plotSprite(var12 + var54 * var49, var13 + var55 * var50);
														} else {
															var48.transPlotSprite(var54 * var49 + var12, var55 * var50 + var13, 256 - (var14 & 0xFF));
														}
													}
												}
												Pix2D.setClipping(arg1, arg2, arg8, arg4);
											} else {
												int var51 = var10.renderWidth * 4096 / var49;
												if (var10.rotate != 0) {
													var48.pixelPerfectRotateScalePlotSprite(var13 + var10.renderHeight / 2, var12 - -(var10.renderWidth / 2), var51, var10.rotate);
												} else if (var14 != 0) {
													var48.transScalePlotSprite(var12, var13, var10.renderWidth, var10.renderHeight, 256 - (var14 & 0xFF));
												} else if (var10.renderWidth == var49 && var10.renderHeight == var50) {
													var48.plotSprite(var12, var13);
												} else {
													var48.scalePlotSprite(var12, var13, var10.renderWidth, var10.renderHeight);
												}
											}
										} else if (IfType.loadingAsset) {
											componentUpdated(var10);
										}
									} else {
										Pix32 var56 = var10.getGraphic(getIfActive(var10));
										if (var56 != null) {
											var56.plotSprite(var12, var13);
										} else if (IfType.loadingAsset) {
											componentUpdated(var10);
										}
									}
								} else if (var10.type == 6) {
									boolean var57 = getIfActive(var10);
									int var58 = 0;
									ModelLit var59 = null;
									int var60;
									if (var57) {
										var60 = var10.modelAnim2;
									} else {
										var60 = var10.modelAnim;
									}
									if (var10.invobject != -1) {
										ObjType var65 = ObjType.list(var10.invobject);
										if (var65 != null) {
											ObjType var66 = var65.getStackSizeAlt(var10.invcount);
											var59 = var66.getModelLit(1, 0, null);
											if (var59 == null) {
												componentUpdated(var10);
											} else {
												var58 = -var59.method88() / 2;
											}
										}
									} else if (var10.model1Type == 5) {
										if (var10.model1Id == -1) {
											var59 = idkDesign.getTempModel(null, -1, -1, null);
										} else {
											int var62 = var10.model1Id & 0x7FF;
											if (selfSlot == var62) {
												var62 = 2047;
											}
											ClientPlayer var63 = players[var62];
											SeqType var64 = var60 == -1 ? null : SeqType.list(var60);
											if (var63 != null && (int) var63.name.toUserhash() << 11 == (var10.model1Id & 0xFFFFF800)) {
												var59 = var63.model.getTempModel(null, var10.animFrame, 0, var64);
											}
										}
									} else if (var60 == -1) {
										var59 = var10.getTempModel(null, localPlayer.model, -1, var57);
										if (var59 == null && IfType.loadingAsset) {
											componentUpdated(var10);
										}
									} else {
										SeqType var61 = SeqType.list(var60);
										var59 = var10.getTempModel(var61, localPlayer.model, var10.animFrame, var57);
										if (var59 == null && IfType.loadingAsset) {
											componentUpdated(var10);
										}
									}
									if (var59 != null) {
										int var67;
										if (var10.modelBaseHeight <= 0) {
											var67 = 256;
										} else {
											var67 = (var10.renderHeight << 8) / var10.modelBaseHeight;
										}
										int var68;
										if (var10.modelBaseWidth <= 0) {
											var68 = 256;
										} else {
											var68 = (var10.renderWidth << 8) / var10.modelBaseWidth;
										}
										int var69 = var10.renderWidth / 2 + var12 + (var68 * var10.modelXOf >> 8);
										int var70 = (var67 * var10.modelYOf >> 8) + var10.renderHeight / 2 + var13;
										Pix3D.setOrigin(var69, var70);
										int var71 = var10.modelZoom * Pix3D.cosTable[var10.modelXAn] >> 16;
										int var72 = Pix3D.sinTable[var10.modelXAn] * var10.modelZoom >> 16;
										if (!var10.v3) {
											var59.method193(var10.modelYAn, 0, var10.modelXAn, 0, var72, var71);
										} else if (var10.orthog) {
											((SoftwareModelLit) var59).objRender(var10.modelYAn, var10.modelZAn, var10.modelXAn, var10.field3365, var58 + var72 + var10.field3498, var71 + var10.field3498, var10.modelZoom);
										} else {
											var59.method193(var10.modelYAn, var10.modelZAn, var10.modelXAn, var10.field3365, var10.field3498 + var72 + var58, var10.field3498 + var71);
										}
										Pix3D.resetOrigin();
									}
								} else {
									if (var10.type == 7) {
										PixfontGeneric var73 = var10.getFont(modIcons);
										if (var73 == null) {
											if (IfType.loadingAsset) {
												componentUpdated(var10);
											}
											continue;
										}
										int var74 = 0;
										for (int var75 = 0; var75 < var10.height; var75++) {
											for (int var76 = 0; var76 < var10.width; var76++) {
												if (var10.linkObjType[var74] > 0) {
													ObjType var77 = ObjType.list(var10.linkObjType[var74] - 1);
													JagString var78;
													if (var77.stackable != 1 && var10.linkObjNumber[var74] == 1) {
														var78 = JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var77.name, AUTO_TAG_COL_CLOSE});
													} else {
														var78 = JagString.join(new JagString[] {AUTO_TAG_COL_FF9040, var77.name, AUTO_TAG_COL_CLOSE_X, niceNumber(var10.linkObjNumber[var74]) });
													}
													int var79 = (var10.marginX + 115) * var76 + var12;
													int var80 = var13 + var75 * (var10.marginY + 12);
													if (var10.hAlign == 0) {
														var73.drawString(var78, var79, var80, var10.colour, var10.shadow ? 0 : -1);
													} else if (var10.hAlign == 1) {
														var73.centreString(var78, var79 + 57, var80, var10.colour, var10.shadow ? 0 : -1);
													} else {
														var73.rightString(var78, var79 + 115 - 1, var80, var10.colour, var10.shadow ? 0 : -1);
													}
												}
												var74++;
											}
										}
									}
									if (var10.type == 8 && tooltipCom == var10 && tooltipRedraw == tooltipNum) {
										int var81 = 0;
										JagString var82 = var10.text;
										PixfontGeneric var83 = p12;
										JagString var84 = substituteVars(var82, var10);
										int var85 = 0;
										while (var84.length() > 0) {
											int var86 = var84.indexOf(AUTO_TAG_BR);
											JagString var87;
											if (var86 == -1) {
												var87 = var84;
												var84 = AUTO_EMPTY;
											} else {
												var87 = var84.substring(0, var86);
												var84 = var84.substring(var86 + 4);
											}
											int var88 = var83.stringWid(var87);
											if (var88 > var81) {
												var81 = var88;
											}
											var85 += var83.ascent + 1;
										}
										var81 += 6;
										var85 += 7;
										int var89 = var10.renderWidth + var12 - var81 - 5;
										if (var89 < var12 + 5) {
											var89 = var12 + 5;
										}
										if (var89 + var81 > arg8) {
											var89 = arg8 - var81;
										}
										int var90 = var10.renderHeight + var13 + 5;
										if (arg4 < var90 + var85) {
											var90 = arg4 - var85;
										}
										Pix2D.fillRect(var89, var90, var81, var85, 16777120);
										Pix2D.drawRect(var89, var90, var81, var85, 0);
										int var91 = var83.ascent + var90 + 2;
										JagString var92 = var10.text;
										JagString var93 = substituteVars(var92, var10);
										while (var93.length() > 0) {
											int var94 = var93.indexOf(AUTO_TAG_BR);
											JagString var95;
											if (var94 == -1) {
												var95 = var93;
												var93 = AUTO_EMPTY;
											} else {
												var95 = var93.substring(0, var94);
												var93 = var93.substring(var94 + 4);
											}
											var83.drawString(var95, var89 + 3, var91, 0, -1);
											var91 += var83.ascent + 1;
										}
									}
									if (var10.type == 9) {
										int var96;
										int var97;
										int var98;
										if (var10.lineDirection) {
											var96 = var10.renderHeight + var13;
											var97 = var13;
											var98 = var12 + var10.renderWidth;
										} else {
											var97 = var13 + var10.renderHeight;
											var98 = var10.renderWidth + var12;
											var96 = var13;
										}
										if (var10.lineWidth == 1) {
											Pix2D.line(var12, var96, var98, var97, var10.colour);
										} else {
											Pix2D.method485(var12, var96, var98, var97, var10.colour, var10.lineWidth);
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

	@ObfuscatedName("oi.a(Li;Lq;I)Li;")
	public static JagString substituteVars(JagString arg0, IfType arg1) {
		if (arg0.indexOf(SUB_PCT) == -1) {
			return arg0;
		}

		do {
			int var2 = arg0.indexOf(SUB_PCT1);
			if (var2 == -1) {
				break;
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var2), inf(getIfVar(0, arg1)), arg0.substring(var2 + 2) });
		} while (true);

		do {
			int var3 = arg0.indexOf(SUB_PCT2);
			if (var3 == -1) {
				break;
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var3), inf(getIfVar(1, arg1)), arg0.substring(var3 + 2) });
		} while (true);

		do {
			int var4 = arg0.indexOf(SUB_PCT3);
			if (var4 == -1) {
				break;
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var4), inf(getIfVar(2, arg1)), arg0.substring(var4 + 2) });
		} while (true);

		do {
			int var5 = arg0.indexOf(SUB_PCT4);
			if (var5 == -1) {
				break;
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var5), inf(getIfVar(3, arg1)), arg0.substring(var5 + 2) });
		} while (true);

		do {
			int var6 = arg0.indexOf(SUB_PCT5);
			if (var6 == -1) {
				break;
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var6), inf(getIfVar(4, arg1)), arg0.substring(var6 + 2) });
		} while (true);

		do {
			int var7 = arg0.indexOf(SUB_PCTDNS);
			if (var7 == -1) {
				break;
			}

			JagString var8 = AUTO_EMPTY;
			if (lastAddress != null) {
				var8 = JagString.formatIPv4(lastAddress.intArg);
				try {
					if (lastAddress.result != null) {
						byte[] var9 = ((String) lastAddress.result).getBytes("ISO-8859-1");
						var8 = JagString.fromBytes(0, var9, var9.length);
					}
				} catch (UnsupportedEncodingException var10) {
				}
			}

			arg0 = JagString.join(new JagString[] { arg0.substring(0, var7), var8, arg0.substring(var7 + 4) });
		} while (true);

		return arg0;
	}

	@ObfuscatedName("nb.f(II)Li;")
	public static JagString niceNumber(int arg0) {
		JagString var1 = JagString.parseInt(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[] { var1.substring(0, var2), AUTO_TAG_UNK1, var1.substring(var2) });
		}
		if (var1.length() > 9) {
			return JagString.join(new JagString[] {AUTO_TAG_COL_00FF80_SPACE, var1.substring(0, var1.length() - 8), Text.MILLION, AUTO_TAG_NPCOP, var1, AUTO_TAG_COL_CLOSE2});
		} else if (var1.length() > 6) {
			return JagString.join(new JagString[] {AUTO_TAG_COL_FFFFFF_SPACE, var1.substring(0, var1.length() - 4), Text.THOUSAND, AUTO_TAG_NPCOP, var1, AUTO_TAG_COL_CLOSE2});
		} else {
			return JagString.join(new JagString[] {AUTO_TAG_COL_FFFF00_SPACE, var1, AUTO_TAG_COL_CLOSE});
		}
	}

	@ObfuscatedName("ki.a(IIIIIILq;I)V")
	public static void doScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4, IfType arg5, int arg6) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}
		scrollGrabbed = false;
		if (ClientMouseListener.mouseButton != 0) {
			if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 <= arg4 && arg4 < arg6 + 16) {
				arg5.scrollPosY -= 4;
				componentUpdated(arg5);
			} else if (arg0 <= arg2 && arg2 < arg0 + 16 && arg4 >= arg6 + arg3 - 16 && arg6 + arg3 > arg4) {
				arg5.scrollPosY += 4;
				componentUpdated(arg5);
			} else if (arg2 >= arg0 - scrollInputPadding && arg2 < scrollInputPadding + arg0 + 16 && arg6 + 16 <= arg4 && arg4 < arg6 + arg3 - 16) {
				int var7 = arg3 * (arg3 - 32) / arg1;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = arg3 - var7 - 32;
				int var9 = arg4 - var7 / 2 - arg6 - 16;
				arg5.scrollPosY = var9 * (arg1 - arg3) / var8;
				componentUpdated(arg5);
				scrollGrabbed = true;
			}
		}
		if (mouseWheelRotation != 0) {
			int var10 = arg5.renderWidth;
			if (arg2 >= arg0 - var10 && arg6 <= arg4 && arg2 < arg0 + 16 && arg4 <= arg6 + arg3) {
				arg5.scrollPosY += mouseWheelRotation * 45;
				componentUpdated(arg5);
			}
		}
	}

	@ObfuscatedName("wb.a(IIIIII)V")
	public static void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg1 - 32) * arg1 / arg3;
		if (var5 < 8) {
			var5 = 8;
		}
		scrollbar[0].plotSprite(arg4, arg2);
		int var6 = arg0 * (arg1 - var5 - 32) / (arg3 - arg1);
		scrollbar[1].plotSprite(arg4, arg1 + arg2 - 16);
		Pix2D.fillRect(arg4, arg2 + 16, 16, arg1 - 32, SCROLLBAR_TRACK);
		Pix2D.fillRect(arg4, var6 + arg2 + 16, 16, var5, SCROLLBAR_GRIP_FOREGROUND);
		Pix2D.vline(arg4, var6 + arg2 + 16, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg4 + 1, var6 + 16 + arg2, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg4, arg2 + var6 + 16, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg4, var6 + arg2 + 17, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg4 + 15, arg2 + 16 + var6, var5, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.vline(arg4 + 14, arg2 - -var6 + 17, var5 - 1, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg4, var6 + arg2 + var5 + 15, 16, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg4 + 1, var6 + 14 + arg2 + var5, 15, SCROLLBAR_GRIP_LOWLIGHT);
	}

	@ObfuscatedName("td.b(II)Li;")
	public static JagString inf(int arg0) {
		return arg0 < 999999999 ? JagString.parseInt(arg0) : AUTO_ASTERISK;
	}

	@ObfuscatedName("hc.b(ILq;)Z")
	public static boolean getIfActive(IfType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var1 = 0; var1 < arg0.scriptComparator.length; var1++) {
			int var2 = getIfVar(var1, arg0);
			int var3 = arg0.scriptOperand[var1];
			if (arg0.scriptComparator[var1] == 2) {
				if (var3 <= var2) {
					return false;
				}
			} else if (arg0.scriptComparator[var1] == 3) {
				if (var2 <= var3) {
					return false;
				}
			} else if (arg0.scriptComparator[var1] == 4) {
				if (var2 == var3) {
					return false;
				}
			} else if (var2 != var3) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("ka.a(BILq;)I")
	public static int getIfVar(int arg0, IfType arg1) {
		if (arg1.scripts == null || arg0 >= arg1.scripts.length) {
			return -2;
		}
		try {
			int[] var2 = arg1.scripts[arg0];
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
					var8 = statEffectiveLevel[var2[var4++]];
				}
				if (var6 == 2) {
					var8 = statBaseLevel[var2[var4++]];
				}
				if (var6 == 3) {
					var8 = statXP[var2[var4++]];
				}
				if (var6 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					IfType var11 = IfType.get(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!ObjType.list(var12).members || memServer)) {
						for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
							if (var11.linkObjType[var13] == var12 + 1) {
								var8 += var11.linkObjNumber[var13];
							}
						}
					}
				}
				if (var6 == 5) {
					var8 = VarCache.var[var2[var4++]];
				}
				if (var6 == 6) {
					var8 = Skills.skillxp[statBaseLevel[var2[var4++]] - 1];
				}
				if (var6 == 7) {
					var8 = VarCache.var[var2[var4++]] * 100 / 46875;
				}
				if (var6 == 8) {
					var8 = localPlayer.combatLevel;
				}
				if (var6 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Skills.used[var14]) {
							var8 += statBaseLevel[var14];
						}
					}
				}
				if (var6 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					IfType var17 = IfType.get(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!ObjType.list(var18).members || memServer)) {
						for (int var19 = 0; var19 < var17.linkObjType.length; var19++) {
							if (var18 + 1 == var17.linkObjType[var19]) {
								var8 = 999999999;
								break;
							}
						}
					}
				}
				if (var6 == 11) {
					var8 = runenergy;
				}
				if (var6 == 15) {
					var7 = 1;
				}
				if (var6 == 12) {
					var8 = runweight;
				}
				if (var6 == 13) {
					int var20 = VarCache.var[var2[var4++]];
					int var21 = var2[var4++];
					var8 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var6 == 16) {
					var7 = 2;
				}
				if (var6 == 14) {
					int var22 = var2[var4++];
					var8 = VarCache.getVarbit(var22);
				}
				if (var6 == 17) {
					var7 = 3;
				}
				if (var6 == 18) {
					var8 = (localPlayer.x >> 7) + mapBuildBaseX;
				}
				if (var6 == 19) {
					var8 = (localPlayer.z >> 7) + mapBuildBaseZ;
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

	// guessing placement and name
	@ObfuscatedName("si.a(BLq;)Lq;")
	public static IfType getParentLayer(IfType arg0) {
		if (arg0.layerId != -1) {
			return IfType.get(arg0.layerId);
		}
		int var1 = arg0.parentId >>> 16;
		for (SubInterface var2 = (SubInterface) subinterfaces.search(); var2 != null; var2 = (SubInterface) subinterfaces.findnext()) {
			if (var1 == var2.id) {
				return IfType.get((int) var2.key);
			}
		}
		return null;
	}

	// guessing placement and name
	@ObfuscatedName("rg.a(IZ)V")
	public static void computeTopLevelInterfaceLayout() {
		computeInterfaceLayout(sWid, toplevelinterface, sHei, false);
	}

	// guessing placement and name
	@ObfuscatedName("aa.a(Lq;B)V")
	public static void computeComponentLayout(IfType arg0) {
		IfType var1 = getParentLayer(arg0);
		int var2;
		int var3;
		if (var1 == null) {
			var2 = sWid;
			var3 = sHei;
		} else {
			var3 = var1.renderHeight;
			var2 = var1.renderWidth;
		}
		computeComponentPosition(arg0, var2, var3);
	}

	// guessing placement and name
	@ObfuscatedName("ka.a(ZLq;B)V")
	public static void computeLayerLayout(boolean arg0, IfType arg1) {
		int var2 = arg1.scrollWidth == 0 ? arg1.renderWidth : arg1.scrollWidth;
		int var3 = arg1.scrollHeight == 0 ? arg1.renderHeight : arg1.scrollHeight;
		computeLayerLayout(var2, arg0, arg1.parentId, var3, IfType.list[arg1.parentId >> 16]);
		if (arg1.subcomponents != null) {
			computeLayerLayout(var2, arg0, arg1.parentId, var3, arg1.subcomponents);
		}
		SubInterface var4 = (SubInterface) subinterfaces.find((long) arg1.parentId);
		if (var4 != null) {
			computeInterfaceLayout(var2, var4.id, var3, arg0);
		}
	}

	// guessing placement and name
	@ObfuscatedName("te.a(IIBIZ)V")
	public static void computeInterfaceLayout(int arg0, int arg1, int arg2, boolean arg3) {
		if (IfType.openInterface(arg1)) {
			computeLayerLayout(arg0, arg3, -1, arg2, IfType.list[arg1]);
		}
	}

	// guessing placement and name
	@ObfuscatedName("oc.a(IBZII[Lq;)V")
	public static void computeLayerLayout(int arg0, boolean arg1, int arg2, int arg3, IfType[] arg4) {
		for (int var5 = 0; var5 < arg4.length; var5++) {
			IfType var6 = arg4[var5];
			if (var6 != null && arg2 == var6.layerId) {
				computeComponentSize(arg1, arg3, arg0, var6);
				computeComponentPosition(var6, arg0, arg3);
				if (var6.scrollPosY > var6.scrollHeight - var6.renderHeight) {
					var6.scrollPosY = var6.scrollHeight - var6.renderHeight;
				}
				if (var6.scrollWidth - var6.renderWidth < var6.scrollPosX) {
					var6.scrollPosX = var6.scrollWidth - var6.renderWidth;
				}
				if (var6.scrollPosX < 0) {
					var6.scrollPosX = 0;
				}
				if (var6.scrollPosY < 0) {
					var6.scrollPosY = 0;
				}
				if (var6.type == 0) {
					computeLayerLayout(arg1, var6);
				}
			}
		}
	}

	// guessing placement and name
	@ObfuscatedName("fa.a(ZIILq;I)V")
	public static void computeComponentSize(boolean arg0, int arg1, int arg2, IfType arg3) {
		int var4 = arg3.renderWidth;
		if (arg3.widthAlignment == 0) {
			arg3.renderWidth = arg3.width;
		} else if (arg3.widthAlignment == 1) {
			arg3.renderWidth = arg2 - arg3.width;
		} else if (arg3.widthAlignment == 2) {
			arg3.renderWidth = arg2 * arg3.width >> 14;
		} else if (arg3.widthAlignment == 3) {
			if (arg3.type == 2) {
				arg3.renderWidth = arg3.width * 32 + arg3.marginX * (arg3.width - 1);
			} else if (arg3.type == 7) {
				arg3.renderWidth = (arg3.width - 1) * arg3.marginX + arg3.width * 115;
			}
		}
		int var5 = arg3.renderHeight;
		if (arg3.heightAlignment == 0) {
			arg3.renderHeight = arg3.height;
		} else if (arg3.heightAlignment == 1) {
			arg3.renderHeight = arg1 - arg3.height;
		} else if (arg3.heightAlignment == 2) {
			arg3.renderHeight = arg3.height * arg1 >> 14;
		} else if (arg3.heightAlignment == 3) {
			if (arg3.type == 2) {
				arg3.renderHeight = arg3.marginY * (arg3.height - 1) + arg3.height * 32;
			} else if (arg3.type == 7) {
				arg3.renderHeight = arg3.marginY * (arg3.height - 1) + arg3.height * 12;
			}
		}
		if (qaOpTest && (getActive(arg3) != 0 || arg3.type == 0)) {
			if (arg3.renderHeight < 5 && arg3.renderWidth < 5) {
				arg3.renderWidth = 5;
				arg3.renderHeight = 5;
			} else {
				if (arg3.renderHeight <= 0) {
					arg3.renderHeight = 5;
				}
				if (arg3.renderWidth <= 0) {
					arg3.renderWidth = 5;
				}
			}
		}
		if (arg0 && arg3.onresize != null && (arg3.renderWidth != var4 || arg3.renderHeight != var5)) {
			HookReq var6 = new HookReq();
			var6.onop = arg3.onresize;
			var6.component = arg3;
			ScriptRunner.executeScript(var6);
		}
	}

	// guessing placement and name
	@ObfuscatedName("sd.a(Lq;IBI)V")
	public static void computeComponentPosition(IfType arg0, int arg1, int arg2) {
		if (arg0.yAlignment == 0) {
			arg0.renderY = arg0.y;
		} else if (arg0.yAlignment == 1) {
			arg0.renderY = arg0.y + (arg2 - arg0.renderHeight) / 2;
		} else if (arg0.yAlignment == 2) {
			arg0.renderY = arg2 - arg0.renderHeight - arg0.y;
		} else if (arg0.yAlignment == 3) {
			arg0.renderY = arg0.y * arg2 >> 14;
		} else if (arg0.yAlignment == 4) {
			arg0.renderY = (arg2 - arg0.renderHeight) / 2 + (arg0.y * arg2 >> 14);
		} else {
			arg0.renderY = arg2 - (arg0.y * arg2 >> 14) - arg0.renderHeight;
		}
		if (arg0.xAlignment == 0) {
			arg0.renderX = arg0.x;
		} else if (arg0.xAlignment == 1) {
			arg0.renderX = (arg1 - arg0.renderWidth) / 2 + arg0.x;
		} else if (arg0.xAlignment == 2) {
			arg0.renderX = arg1 - arg0.x - arg0.renderWidth;
		} else if (arg0.xAlignment == 3) {
			arg0.renderX = arg1 * arg0.x >> 14;
		} else if (arg0.xAlignment == 4) {
			arg0.renderX = (arg1 * arg0.x >> 14) + (arg1 - arg0.renderWidth) / 2;
		} else {
			arg0.renderX = arg1 - arg0.renderWidth - (arg0.x * arg1 >> 14);
		}
		if (qaOpTest) {
			if (getActive(arg0) == 0 && arg0.type != 0) {
				return;
			}
			if (arg0.renderY < 0) {
				arg0.renderY = 0;
			} else if (arg2 < arg0.renderHeight + arg0.renderY) {
				arg0.renderY = arg2 - arg0.renderHeight;
			}
			if (arg0.renderX < 0) {
				arg0.renderX = 0;
			} else if (arg0.renderX + arg0.renderWidth > arg1) {
				arg0.renderX = arg1 - arg0.renderWidth;
			}
		}
	}

	@ObfuscatedName("va.a(IIIIIIII)V")
	public static void loopInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (IfType.openInterface(arg5)) {
			loopLayer(arg2, arg4, arg6, -1, arg1, IfType.list[arg5], arg3, arg0);
		}
	}

	@ObfuscatedName("na.a(IIIIII[Lq;II)V")
	public static void loopLayer(int arg0, int arg1, int arg2, int arg3, int arg4, IfType[] arg5, int arg6, int arg7) {
		for (int var8 = 0; var8 < arg5.length; var8++) {
			IfType var9 = arg5[var8];
			if (var9 != null && (!var9.v3 || var9.type == 0 || var9.hashook || getActive(var9) != 0 || dragLayer == var9 || var9.clientCode == 1338) && arg3 == var9.layerId && (!var9.v3 || !hide(var9))) {
				int var10 = arg2 + var9.renderX;
				int var11 = arg7 + var9.renderY;
				int var12;
				int var15;
				int var16;
				int var17;
				if (var9.type == 2) {
					var16 = arg4;
					var17 = arg1;
					var12 = arg0;
					var15 = arg6;
				} else {
					var12 = arg0 >= var11 ? arg0 : var11;
					int var13 = var11 + var9.renderHeight;
					int var14 = var9.renderWidth + var10;
					var15 = arg6 >= var10 ? arg6 : var10;
					if (var9.type == 9) {
						var13++;
						var14++;
					}
					var16 = arg4 <= var13 ? arg4 : var13;
					var17 = var14 < arg1 ? var14 : arg1;
				}
				if (dragCom == var9) {
					dragCurrentX = var10;
					dragParentFound = true;
					dragCurrentY = var11;
				}
				if (!var9.v3 || var15 < var17 && var12 < var16) {
					if (var9.type == 0) {
						if (!var9.v3 && hide(var9) && overCom != var9) {
							continue;
						}
						if (var9.noClickThrough && var15 <= ClientMouseListener.mouseX && ClientMouseListener.mouseY >= var12 && var17 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var16) {
							for (HookReq var18 = (HookReq) hookRequests.head(); var18 != null; var18 = (HookReq) hookRequests.next()) {
								if (var18.field686) {
									var18.unlink();
								}
							}
							for (HookReq var19 = (HookReq) hookRequestsMouseStop.head(); var19 != null; var19 = (HookReq) hookRequestsMouseStop.next()) {
								if (var19.field686) {
									var19.unlink();
								}
							}
							if (dragTime == 0) {
								dragCom = null;
								dragLayer = null;
							}
							field3532 = false;
						}
					}
					if (var9.v3) {
						boolean var20 = false;
						boolean var21 = false;
						boolean var22;
						if (ClientMouseListener.mouseX >= var15 && var12 <= ClientMouseListener.mouseY && var17 > ClientMouseListener.mouseX && var16 > ClientMouseListener.mouseY) {
							var22 = true;
						} else {
							var22 = false;
						}
						if (ClientMouseListener.mouseClickButton == 1 && var15 <= ClientMouseListener.mouseClickX && ClientMouseListener.mouseClickY >= var12 && ClientMouseListener.mouseClickX < var17 && var16 > ClientMouseListener.mouseClickY) {
							var21 = true;
						}
						if (ClientMouseListener.mouseButton == 1 && var22) {
							var20 = true;
						}
						if (keypresses > 0 && var9.hotkeys != null) {
							for (int var23 = 0; var23 < var9.hotkeys.length; var23++) {
								for (int var24 = 0; var24 < keypresses; var24++) {
									int var25 = var9.hotkeys[var23] & 0xFF;
									if (keypressKeycodes[var24] == var25) {
										ifButtonX(var23 + 1, AUTO_EMPTY, -1, var9.parentId);
									}
								}
							}
						}
						if (var21) {
							dragTryPickup(ClientMouseListener.mouseClickX - var10, ClientMouseListener.mouseClickY + -var11, var9);
						}
						if (dragCom != null && var9 != dragCom && var22 && ServerActive.isDragTarget(getActive(var9))) {
							dropCom = var9;
						}
						if (var9 == dragLayer) {
							dragging = true;
							dragParentY = var11;
							dragParentX = var10;
						}
						if (var9.hashook || var9.clientCode != 0) {
							if (var22 && mouseWheelRotation != 0 && var9.onscrollwheel != null) {
								HookReq var26 = new HookReq();
								var26.field686 = true;
								var26.onop = var9.onscrollwheel;
								var26.component = var9;
								var26.mouseY = mouseWheelRotation;
								hookRequests.push(var26);
							}
							if (dragCom != null || objDragCom != null || isMenuOpen || var9.clientCode != 1400 && field3532) {
								var22 = false;
								var21 = false;
								var20 = false;
							}
							if (var9.clientCode == 1337) {
								componentUpdated(var9);
								continue;
							}
							if (var9.clientCode == 1338) {
								if (var21) {
									minimapLoop(ClientMouseListener.mouseClickX - var10, -var11 + ClientMouseListener.mouseClickY, var9);
								}
								continue;
							}
							if (var9.clientCode == 1400) {
								WorldMap.mapCom = var9;
								if (var21) {
									if (ClientKeyboardListener.keyHeld[82] && staffmodlevel > 0) {
										int var27 = WorldMap.mapHeight + WorldMap.baseY - WorldMap.centreY - (int) ((double) (-(var9.renderHeight / 2) + -var11 + ClientMouseListener.mouseClickY) * 2.0D / WorldMap.zoom);
										int var28 = WorldMap.centreX + (int) ((double) (ClientMouseListener.mouseClickX - var9.renderWidth / 2 - var10) * 2.0D / WorldMap.zoom) + WorldMap.baseX;
										JagString var29 = JagString.join(new JagString[] {field4009, JagString.parseInt(var28 >> 6), AUTO_TAG_UNK1, JagString.parseInt(var27 >> 6), AUTO_TAG_UNK1, JagString.parseInt(var28 & 0x3F), AUTO_TAG_UNK1, JagString.parseInt(var27 & 0x3F) });
										var29.method610();
										doCheat(var29);
										closeModal();
										continue;
									}
									dragPickupX = ClientMouseListener.mouseX;
									field1801 = WorldMap.centreY;
									dragPickupY = ClientMouseListener.mouseY;
									field3532 = true;
									field890 = WorldMap.centreX;
									continue;
								}
								if (var20 && field3532) {
									WorldMap.setCentreX(field890 + (int) ((double) (dragPickupX - ClientMouseListener.mouseX) * 2.0D / WorldMap.targetZoom));
									WorldMap.setCentreY((int) ((double) (dragPickupY - ClientMouseListener.mouseY) * 2.0D / WorldMap.targetZoom) + field1801);
									continue;
								}
								field3532 = false;
								continue;
							}
							if (var9.clientCode == 1401) {
								if (var20) {
									WorldMap.clickOverview(var9.renderWidth, ClientMouseListener.mouseY - var11, ClientMouseListener.mouseX - var10, var9.renderHeight);
								}
								continue;
							}
							if (!var9.clickTrigger && var21) {
								var9.clickTrigger = true;
								if (var9.onclick != null) {
									HookReq var30 = new HookReq();
									var30.mouseY = ClientMouseListener.mouseClickY - var11;
									var30.onop = var9.onclick;
									var30.component = var9;
									var30.field686 = true;
									var30.mouseX = ClientMouseListener.mouseClickX - var10;
									hookRequests.push(var30);
								}
							}
							if (var9.clickTrigger && var20 && var9.onclickrepeat != null) {
								HookReq var31 = new HookReq();
								var31.field686 = true;
								var31.onop = var9.onclickrepeat;
								var31.component = var9;
								var31.mouseX = ClientMouseListener.mouseX - var10;
								var31.mouseY = ClientMouseListener.mouseY - var11;
								hookRequests.push(var31);
							}
							if (var9.clickTrigger && !var20) {
								var9.clickTrigger = false;
								if (var9.onrelease != null) {
									HookReq var32 = new HookReq();
									var32.component = var9;
									var32.mouseY = ClientMouseListener.mouseY - var11;
									var32.onop = var9.onrelease;
									var32.mouseX = ClientMouseListener.mouseX - var10;
									var32.field686 = true;
									hookRequestsMouseStop.push(var32);
								}
							}
							if (var20 && var9.onhold != null) {
								HookReq var33 = new HookReq();
								var33.onop = var9.onhold;
								var33.field686 = true;
								var33.mouseY = ClientMouseListener.mouseY - var11;
								var33.component = var9;
								var33.mouseX = ClientMouseListener.mouseX - var10;
								hookRequests.push(var33);
							}
							if (!var9.mouseTrigger && var22) {
								var9.mouseTrigger = true;
								if (var9.onmouseover != null) {
									HookReq var34 = new HookReq();
									var34.mouseX = ClientMouseListener.mouseX - var10;
									var34.mouseY = ClientMouseListener.mouseY - var11;
									var34.field686 = true;
									var34.component = var9;
									var34.onop = var9.onmouseover;
									hookRequests.push(var34);
								}
							}
							if (var9.mouseTrigger && var22 && var9.onmouserepeat != null) {
								HookReq var35 = new HookReq();
								var35.component = var9;
								var35.mouseY = ClientMouseListener.mouseY - var11;
								var35.onop = var9.onmouserepeat;
								var35.mouseX = ClientMouseListener.mouseX - var10;
								var35.field686 = true;
								hookRequests.push(var35);
							}
							if (var9.mouseTrigger && !var22) {
								var9.mouseTrigger = false;
								if (var9.onmouseleave != null) {
									HookReq var36 = new HookReq();
									var36.onop = var9.onmouseleave;
									var36.component = var9;
									var36.field686 = true;
									var36.mouseX = ClientMouseListener.mouseX - var10;
									var36.mouseY = ClientMouseListener.mouseY - var11;
									hookRequestsMouseStop.push(var36);
								}
							}
							if (var9.ontimer != null) {
								HookReq var37 = new HookReq();
								var37.component = var9;
								var37.onop = var9.ontimer;
								hookRequestsTimer.push(var37);
							}
							if (var9.onvartransmit != null && varTransmitNum > var9.varTransmitNum) {
								if (var9.onvartransmitlist == null || varTransmitNum - var9.varTransmitNum > 32) {
									HookReq var42 = new HookReq();
									var42.component = var9;
									var42.onop = var9.onvartransmit;
									hookRequests.push(var42);
								} else {
									label439: for (int var38 = var9.varTransmitNum; var38 < varTransmitNum; var38++) {
										int var39 = varTransmit[var38 & 0x1F];
										for (int var40 = 0; var40 < var9.onvartransmitlist.length; var40++) {
											if (var9.onvartransmitlist[var40] == var39) {
												HookReq var41 = new HookReq();
												var41.onop = var9.onvartransmit;
												var41.component = var9;
												hookRequests.push(var41);
												break label439;
											}
										}
									}
								}
								var9.varTransmitNum = varTransmitNum;
							}
							if (var9.oninvtransmit != null && invTransmitNum > var9.invTransmitNum) {
								if (var9.oninvtransmitlist == null || invTransmitNum - var9.invTransmitNum > 32) {
									HookReq var47 = new HookReq();
									var47.onop = var9.oninvtransmit;
									var47.component = var9;
									hookRequests.push(var47);
								} else {
									label415: for (int var43 = var9.invTransmitNum; var43 < invTransmitNum; var43++) {
										int var44 = invTransmit[var43 & 0x1F];
										for (int var45 = 0; var45 < var9.oninvtransmitlist.length; var45++) {
											if (var44 == var9.oninvtransmitlist[var45]) {
												HookReq var46 = new HookReq();
												var46.onop = var9.oninvtransmit;
												var46.component = var9;
												hookRequests.push(var46);
												break label415;
											}
										}
									}
								}
								var9.invTransmitNum = invTransmitNum;
							}
							if (var9.onstattransmit != null && var9.statTransmitNum < statTransmitNum) {
								if (var9.onstattransmitlist == null || statTransmitNum - var9.statTransmitNum > 32) {
									HookReq var48 = new HookReq();
									var48.onop = var9.onstattransmit;
									var48.component = var9;
									hookRequests.push(var48);
								} else {
									label391: for (int var49 = var9.statTransmitNum; var49 < statTransmitNum; var49++) {
										int var50 = statTransmit[var49 & 0x1F];
										for (int var51 = 0; var51 < var9.onstattransmitlist.length; var51++) {
											if (var9.onstattransmitlist[var51] == var50) {
												HookReq var52 = new HookReq();
												var52.component = var9;
												var52.onop = var9.onstattransmit;
												hookRequests.push(var52);
												break label391;
											}
										}
									}
								}
								var9.statTransmitNum = statTransmitNum;
							}
							if (var9.transmitNum < chatTransmitNum && var9.onchattransmit != null) {
								HookReq var53 = new HookReq();
								var53.component = var9;
								var53.onop = var9.onchattransmit;
								hookRequests.push(var53);
							}
							if (var9.transmitNum < friendTransmitNum && var9.onfriendtransmit != null) {
								HookReq var54 = new HookReq();
								var54.component = var9;
								var54.onop = var9.onfriendtransmit;
								hookRequests.push(var54);
							}
							if (var9.transmitNum < clanTransmitNum && var9.onclantransmit != null) {
								HookReq var55 = new HookReq();
								var55.component = var9;
								var55.onop = var9.onclantransmit;
								hookRequests.push(var55);
							}
							if (field2127 > var9.transmitNum && var9.field3505 != null) {
								HookReq var56 = new HookReq();
								var56.component = var9;
								var56.onop = var9.field3505;
								hookRequests.push(var56);
							}
							if (var9.transmitNum < miscTransmitNum && var9.onmisctransmit != null) {
								HookReq var57 = new HookReq();
								var57.component = var9;
								var57.onop = var9.onmisctransmit;
								hookRequests.push(var57);
							}
							var9.transmitNum = transmitNum;
							if (var9.onkey != null) {
								for (int var58 = 0; var58 < keypresses; var58++) {
									HookReq var59 = new HookReq();
									var59.component = var9;
									var59.keyCode = keypressKeycodes[var58];
									var59.keyChar = keypressKeychars[var58];
									var59.onop = var9.onkey;
									hookRequests.push(var59);
								}
							}
						}
					}
					if (!var9.v3 && dragCom == null && objDragCom == null && !isMenuOpen) {
						if ((var9.overLayerId >= 0 || var9.colourOver != 0) && var15 <= ClientMouseListener.mouseX && ClientMouseListener.mouseY >= var12 && ClientMouseListener.mouseX < var17 && var16 > ClientMouseListener.mouseY) {
							if (var9.overLayerId < 0) {
								overCom = var9;
							} else {
								overCom = arg5[var9.overLayerId];
							}
						}
						if (var9.type == 8 && var15 <= ClientMouseListener.mouseX && var12 <= ClientMouseListener.mouseY && var17 > ClientMouseListener.mouseX && ClientMouseListener.mouseY < var16) {
							tooltipCom = var9;
						}
						if (var9.renderHeight < var9.scrollHeight) {
							doScrollbar(var10 + var9.renderWidth, var9.scrollHeight, ClientMouseListener.mouseX, var9.renderHeight, ClientMouseListener.mouseY, var9, var11);
						}
					}
					if (var9.type == 0) {
						loopLayer(var12, var17, var10 - var9.scrollPosX, var9.parentId, var16, arg5, var15, var11 - var9.scrollPosY);
						if (var9.subcomponents != null) {
							loopLayer(var12, var17, var10 - var9.scrollPosX, var9.parentId, var16, var9.subcomponents, var15, var11 - var9.scrollPosY);
						}
						SubInterface var60 = (SubInterface) subinterfaces.find((long) var9.parentId);
						if (var60 != null) {
							loopInterface(var11, var16, var12, var15, var17, var60.id, var10);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("mf.a(III)V")
	public static void runHookImmediate(int arg0, int arg1) {
		if (IfType.openInterface(arg0)) {
			runHookLayer(arg1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("va.a(IZ[Lq;)V")
	public static void runHookLayer(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.subcomponents != null) {
						runHookLayer(arg0, var3.subcomponents);
					}
					SubInterface var4 = (SubInterface) subinterfaces.find((long) var3.parentId);
					if (var4 != null) {
						runHookImmediate(var4.id, arg0);
					}
				}
				if (arg0 == 0 && var3.ondialogabort != null) {
					HookReq var5 = new HookReq();
					var5.component = var3;
					var5.onop = var3.ondialogabort;
					ScriptRunner.executeScript(var5);
				}
				if (arg0 == 1 && var3.onsubchange != null) {
					if (var3.subId >= 0) {
						IfType var6 = IfType.get(var3.parentId);
						if (var6 == null || var6.subcomponents == null || var3.subId >= var6.subcomponents.length || var3 != var6.subcomponents[var3.subId]) {
							continue;
						}
					}
					HookReq var7 = new HookReq();
					var7.component = var3;
					var7.onop = var3.onsubchange;
					ScriptRunner.executeScript(var7);
				}
			}
		}
	}

	@ObfuscatedName("hc.a(IIILq;)V")
	public static void dragTryPickup(int arg0, int arg1, IfType arg2) {
		if (dragCom != null || isMenuOpen || (arg2 == null || getDragLayer(arg2) == null)) {
			return;
		}
		dragCom = arg2;
		dragLayer = getDragLayer(arg2);
		dragTime = 0;
		dragPickupX = arg0;
		dragAlive = false;
		dragPickupY = arg1;
	}

	@ObfuscatedName("ja.a(B)V")
	public static void loopIf3Drag() {
		componentUpdated(dragCom);
		dragTime++;
		if (dragParentFound && dragging) {
			int var0 = ClientMouseListener.mouseX;
			int var1 = var0 - dragPickupX;
			if (dragParentX > var1) {
				var1 = dragParentX;
			}
			int var2 = ClientMouseListener.mouseY;
			int var3 = var2 - dragPickupY;
			if (dragParentY > var3) {
				var3 = dragParentY;
			}
			if (var3 + dragCom.renderHeight > dragLayer.renderHeight + dragParentY) {
				var3 = dragParentY + dragLayer.renderHeight - dragCom.renderHeight;
			}
			int var4 = var3 - dragCurrentY;
			int var5 = dragCom.dragdeadzone;
			if (dragCom.renderWidth + var1 > dragParentX - -dragLayer.renderWidth) {
				var1 = dragLayer.renderWidth + dragParentX - dragCom.renderWidth;
			}
			int var6 = var3 + dragLayer.scrollPosY - dragParentY;
			int var7 = dragLayer.scrollPosX + var1 - dragParentX;
			int var8 = var1 - dragCurrentX;
			if (dragTime > dragCom.dragdeadtime && (var8 > var5 || var8 < -var5 || var4 > var5 || -var5 > var4)) {
				dragAlive = true;
			}
			if (dragCom.ondrag != null && dragAlive) {
				HookReq var9 = new HookReq();
				var9.onop = dragCom.ondrag;
				var9.mouseY = var6;
				var9.mouseX = var7;
				var9.component = dragCom;
				ScriptRunner.executeScript(var9);
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (dragAlive) {
					if (dragCom.ondragcomplete != null) {
						HookReq var10 = new HookReq();
						var10.onop = dragCom.ondragcomplete;
						var10.component = dragCom;
						var10.mouseX = var7;
						var10.mouseY = var6;
						var10.drop = dropCom;
						ScriptRunner.executeScript(var10);
					}
					if (dropCom != null && serverDraggable(dragCom) != null) {
						// IF_BUTTOND
						out.p1Enc(135);
						out.p2_alt1(dragCom.subId);
						out.p4_alt3(dragCom.parentId);
						out.p4_alt3(dropCom.parentId);
						out.p2_alt3(dropCom.subId);
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

	@ObfuscatedName("sd.a(ILq;)V")
	public static void componentUpdated(IfType arg0) {
		if (componentDrawTime == arg0.drawTime) {
			componentDirtyArea[arg0.drawCount] = true;
		}
	}

	@ObfuscatedName("jh.b(I)V")
	public static void redrawAllComponents() {
		for (int var0 = 0; var0 < 100; var0++) {
			componentDirtyArea[var0] = true;
		}
	}

	@ObfuscatedName("lg.b(B)V")
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

	@ObfuscatedName("ug.a(ILq;)Lq;")
	public static IfType getDragLayer(IfType arg0) {
		IfType var1 = serverDraggable(arg0);
		if (var1 == null) {
			var1 = arg0.draggable;
		}
		return var1;
	}

	@ObfuscatedName("mg.a([Li;B)[Li;")
	public static JagString[] prependOpIndex(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[] { JagString.parseInt(var2), field3306});
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("ng.b(II)V")
	public static void ifAnimReset(int arg0) {
		if (!IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3 != null) {
				var3.animCycle = 0;
				var3.animFrame = 0;
			}
		}
	}

	@ObfuscatedName("tj.a(II)V")
	public static void animateInterface(int arg0) {
		if (IfType.openInterface(arg0)) {
			animateLayer(-1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("je.a(IB[Lq;)V")
	public static void animateLayer(int arg0, IfType[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			IfType var3 = arg1[var2];
			if (var3 != null && arg0 == var3.layerId && (!var3.v3 || !hide(var3))) {
				if (var3.type == 0) {
					if (!var3.v3 && hide(var3) && var3 != overCom) {
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
							if (var7 != null) {
								var3.animCycle += worldUpdateNum;
								while (var3.animCycle > var7.delay[var3.animFrame]) {
									var3.animCycle -= var7.delay[var3.animFrame];
									var3.animFrame++;
									if (var3.animFrame >= var7.frames.length) {
										var3.animFrame -= var7.loops;
										if (var3.animFrame < 0 || var3.animFrame >= var7.frames.length) {
											var3.animFrame = 0;
										}
									}
									componentUpdated(var3);
								}
							}
						}
					}
					if (var3.modelSpin != 0 && !var3.v3) {
						int var8 = var3.modelSpin << 16 >> 16;
						int var9 = var3.modelSpin >> 16;
						int var10 = var9 * worldUpdateNum;
						var3.modelXAn = var10 + var3.modelXAn & 0x7FF;
						int var11 = var8 * worldUpdateNum;
						var3.modelYAn = var11 + var3.modelYAn & 0x7FF;
						componentUpdated(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("of.a(II)V")
	public static void clientVar(int arg0) {
		legacyUpdated();
		BgSound.recalculateMultilocs();
		int var1 = VarpType.list(arg0).clientcode;
		if (var1 == 0) {
			return;
		}
		int var2 = VarCache.var[arg0];
		if (var1 == 1) {
			brightness = var2;
			if (brightness == 1) {
				Pix3D.initColourTable(0.9F);
			}
			if (brightness == 2) {
				Pix3D.initColourTable(0.8F);
			}
			if (brightness == 3) {
				Pix3D.initColourTable(0.7F);
			}
			if (brightness == 4) {
				Pix3D.initColourTable(0.6F);
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
					MidiManager.play(songs, nextMidiSong, var3);
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
		if (var1 == 6) {
			chatEffects = var2;
		}
		if (var1 == 9) {
			bankArrangeMode = var2;
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
		if (var1 == 5) {
			oneMouseButton = var2;
		}
	}

	@ObfuscatedName("bd.a(ILq;)V")
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
				idkDesignButton2 = arg0.graphic2;
				idkDesignButton1 = arg0.graphic;
			}
			if (idkDesign.gender) {
				arg0.graphic = idkDesignButton2;
			} else {
				arg0.graphic = idkDesignButton1;
			}
		} else if (var1 == 327) {
			arg0.modelXAn = 150;
			arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.model1Id = -1;
			arg0.model1Type = 5;
		} else if (var1 == 328) {
			if (localPlayer.name == null) {
				arg0.model1Id = 0;
			} else {
				arg0.modelXAn = 150;
				arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
				arg0.model1Type = 5;
				arg0.model1Id = ((int) localPlayer.name.toUserhash() << 11) + 2047;
				arg0.modelAnim = localPlayer.secondarySeqId;
				arg0.animFrame = localPlayer.secondarySeqFrame;
			}
		}
	}

	@ObfuscatedName("cf.a(I)V")
	public static void closeModal() {
		out.p1Enc(24);
		for (SubInterface var0 = (SubInterface) subinterfaces.search(); var0 != null; var0 = (SubInterface) subinterfaces.findnext()) {
			if (var0.type == 0) {
				closeSubInterface(var0, true);
			}
		}
		if (resumePauseCom != null) {
			componentUpdated(resumePauseCom);
			resumePauseCom = null;
		}
	}

	@ObfuscatedName("jf.a(IIIB)Lpe;")
	public static SubInterface openSubInterface(int arg0, int arg1, int arg2) {
		SubInterface var3 = new SubInterface();
		var3.type = arg0;
		var3.id = arg2;
		subinterfaces.put((long) arg1, var3);
		ifAnimReset(arg2);
		IfType var4 = IfType.get(arg1);
		if (var4 != null) {
			componentUpdated(var4);
		}
		if (resumePauseCom != null) {
			componentUpdated(resumePauseCom);
			resumePauseCom = null;
		}
		isMenuOpen = false;
		menuNumEntries = 0;
		dirtyArea(menuHeight, menuWidth, menuY, menuX);
		if (var4 != null) {
			computeLayerLayout(false, var4);
		}
		ScriptRunner.executeOnLoad(arg2);
		if (toplevelinterface != -1) {
			runHookImmediate(toplevelinterface, 1);
		}
		return var3;
	}

	@ObfuscatedName("ie.a(BLpe;Z)V")
	public static void closeSubInterface(SubInterface arg0, boolean arg1) {
		int var2 = arg0.id;
		int var3 = (int) arg0.key;
		arg0.unlink();
		if (arg1) {
			IfType.unloadInterface(var2);
		}
		purgeServerActive(var2);
		IfType var4 = IfType.get(var3);
		if (var4 != null) {
			componentUpdated(var4);
		}
		menuNumEntries = 0;
		isMenuOpen = false;
		dirtyArea(menuHeight, menuWidth, menuY, menuX);
		if (toplevelinterface != -1) {
			runHookImmediate(toplevelinterface, 1);
		}
	}

	@ObfuscatedName("eh.a(ILq;)Z")
	public static boolean clientButton(IfType arg0) {
		if (arg0.clientCode == 205) {
			logoutTimer = 250;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("la.a(Lq;IIBI)V")
	public static void minimapDraw(IfType arg0, int arg1, int arg2, int arg3) {
		doAudio();
		Pix2D.setClipping(arg2, arg3, arg2 + arg0.renderWidth, arg0.renderHeight + arg3);
		if (minimapState == 2 || minimapState == 5) {
			Pix2D.fillScanLine(arg2, arg3, arg0.graphicMaskLineOffsets, arg0.graphicMaskLineLengths);
		} else {
			int var4 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
			int var5 = 464 - localPlayer.z / 32;
			int var6 = localPlayer.x / 32 + 48;
			((SoftwarePix32) field2010).scanlineRotatePlotSprite(arg2, arg3, arg0.renderWidth, arg0.renderHeight, var6, var5, var4, macroMinimapZoom + 256, arg0.graphicMaskLineOffsets, arg0.graphicMaskLineLengths);
			for (int var7 = 0; var7 < field930; var7++) {
				int var8 = field2577[var7] * 4 + 2 - localPlayer.x / 32;
				int var9 = field2501[var7] * 4 + 2 - localPlayer.z / 32;
				LocType var10 = LocType.list(field2745[var7]);
				if (var10.multiloc != null) {
					var10 = var10.getMultiLoc();
					if (var10 == null || var10.mapfunction == -1) {
						continue;
					}
				}
				minimapDrawDot(arg3, arg2, var9, arg0, field4525[var10.mapfunction], var8);
			}
			for (int var11 = 0; var11 < 104; var11++) {
				for (int var12 = 0; var12 < 104; var12++) {
					LinkList var13 = groundObj[minusedlevel][var11][var12];
					if (var13 != null) {
						int var14 = var11 * 4 + 2 - localPlayer.x / 32;
						int var15 = var12 * 4 + 2 - localPlayer.z / 32;
						minimapDrawDot(arg3, arg2, var15, arg0, mapdots[0], var14);
					}
				}
			}
			for (int var16 = 0; var16 < npcCount; var16++) {
				ClientNpc var17 = npc[npcIds[var16]];
				if (var17 != null && var17.ready()) {
					NpcType var18 = var17.type;
					if (var18 != null && var18.multinpc != null) {
						var18 = var18.getMultiNpc();
					}
					if (var18 != null && var18.minimap && var18.active) {
						int var19 = var17.z / 32 - localPlayer.z / 32;
						int var20 = var17.x / 32 - localPlayer.x / 32;
						minimapDrawDot(arg3, arg2, var19, arg0, mapdots[1], var20);
					}
				}
			}
			for (int var21 = 0; var21 < playerCount; var21++) {
				ClientPlayer var22 = players[playerIds[var21]];
				if (var22 != null && var22.ready()) {
					int var23 = var22.x / 32 - localPlayer.x / 32;
					int var24 = var22.z / 32 - localPlayer.z / 32;
					boolean var25 = false;
					long var26 = var22.name.toUserhash();
					for (int var28 = 0; var28 < friendCount; var28++) {
						if (var26 == field2086[var28] && field3092[var28] != 0) {
							var25 = true;
							break;
						}
					}
					boolean var29 = false;
					if (localPlayer.team != 0 && var22.team != 0 && localPlayer.team == var22.team) {
						var29 = true;
					}
					if (var25) {
						minimapDrawDot(arg3, arg2, var24, arg0, mapdots[3], var23);
					} else if (var29) {
						minimapDrawDot(arg3, arg2, var24, arg0, mapdots[4], var23);
					} else {
						minimapDrawDot(arg3, arg2, var24, arg0, mapdots[2], var23);
					}
				}
			}
			HintArrow[] var30 = field1171;
			for (int var31 = 0; var31 < var30.length; var31++) {
				HintArrow var32 = var30[var31];
				if (var32 != null && var32.hintType != 0 && loopCycle % 20 < 10) {
					if (var32.hintType == 1 && var32.hintTarget >= 0 && var32.hintTarget < npc.length) {
						ClientNpc var33 = npc[var32.hintTarget];
						if (var33 != null) {
							int var34 = var33.x / 32 - localPlayer.x / 32;
							int var35 = var33.z / 32 - localPlayer.z / 32;
							minimapDrawArrow(arg0, var34, arg3, var35, var32.field2137, arg2);
						}
					}
					if (var32.hintType == 2) {
						int var36 = (var32.hintTileX + -mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
						int var37 = (var32.hintTileZ - mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
						minimapDrawArrow(arg0, var36, arg3, var37, var32.field2137, arg2);
					}
					if (var32.hintType == 10 && var32.hintTarget >= 0 && var32.hintTarget < players.length) {
						ClientPlayer var38 = players[var32.hintTarget];
						if (var38 != null) {
							int var39 = var38.x / 32 - localPlayer.x / 32;
							int var40 = var38.z / 32 - localPlayer.z / 32;
							minimapDrawArrow(arg0, var39, arg3, var40, var32.field2137, arg2);
						}
					}
				}
			}
			if (minimapFlagX != 0) {
				int var41 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
				int var42 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
				minimapDrawDot(arg3, arg2, var41, arg0, mapflag, var42);
			}
			Pix2D.fillRect(arg0.renderWidth / 2 + arg2 - 1, arg3 - -(arg0.renderHeight / 2) + -1, 3, 3, 16777215);
		}
		componentBlitArea[arg1] = true;
	}

	@ObfuscatedName("wb.a(Lq;IIIIBI)V")
	public static void minimapDrawArrow(IfType arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg3 * arg3 + arg1 * arg1;
		if (var6 > 360000) {
			return;
		}
		int var7 = Math.min(arg0.renderWidth / 2, arg0.renderHeight / 2);
		if (var7 * var7 >= var6) {
			minimapDrawDot(arg2, arg5, arg3, arg0, hintMapmarkers[arg4], arg1);
			return;
		}
		var7 -= 10;
		int var8 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var9 = Pix3D.cosTable[var8];
		int var10 = var9 * 256 / (macroMinimapZoom + 256);
		int var11 = Pix3D.sinTable[var8];
		int var12 = var11 * 256 / (macroMinimapZoom + 256);
		int var13 = var10 * arg3 - arg1 * var12 >> 16;
		int var14 = arg3 * var12 + arg1 * var10 >> 16;
		double var15 = Math.atan2((double) var14, (double) var13);
		int var17 = (int) ((double) var7 * Math.sin(var15));
		int var18 = (int) (Math.cos(var15) * (double) var7);
		((SoftwarePix32) hintMapedge[arg4]).rotateTransPlotSprite(arg5 + arg0.renderWidth / 2 + var17 - 10, arg0.renderHeight / 2 + -10 + arg2 - var18, var15);
	}

	@ObfuscatedName("fa.a(IIIILq;Lrc;I)V")
	public static void minimapDrawDot(int arg0, int arg1, int arg2, IfType arg3, Pix32 arg4, int arg5) {
		if (arg4 == null) {
			return;
		}
		int var6 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var7 = arg5 * arg5 + arg2 * arg2;
		int var8 = Math.max(arg3.renderWidth / 2, arg3.renderHeight / 2) + 10;
		if (var7 > var8 * var8) {
			return;
		}
		int var9 = Pix3D.cosTable[var6];
		int var10 = var9 * 256 / (macroMinimapZoom + 256);
		int var11 = Pix3D.sinTable[var6];
		int var12 = var11 * 256 / (macroMinimapZoom + 256);
		int var13 = var10 * arg2 - arg5 * var12 >> 16;
		int var14 = arg5 * var10 + arg2 * var12 >> 16;
		((SoftwarePix32) arg4).scanlinePlotSprite(arg3.renderWidth / 2 + arg1 + var14 - arg4.owi / 2, -(arg4.ohi / 2) + arg3.renderHeight / 2 + arg0 + -var13, arg3.graphicMaskLineOffsets, arg3.graphicMaskLineLengths);
	}

	@ObfuscatedName("ue.a(Li;IILi;)V")
	public static void addChat(JagString arg0, int arg1, JagString arg2) {
		addChat(arg0, -1, arg2, arg1, null);
	}

	@ObfuscatedName("ki.a(Li;BILi;ILi;)V")
	public static void addChat(JagString arg0, int arg1, JagString arg2, int arg3, JagString arg4) {
		for (int var5 = 99; var5 > 0; var5--) {
			chatType[var5] = chatType[var5 - 1];
			chatUsername[var5] = chatUsername[var5 - 1];
			chatText[var5] = chatText[var5 - 1];
			chatScreenName[var5] = chatScreenName[var5 - 1];
			field2483[var5] = field2483[var5 - 1];
		}
		chatHistoryLength++;
		chatUsername[0] = arg2;
		chatText[0] = arg0;
		chatType[0] = arg3;
		field2483[0] = arg1;
		chatScreenName[0] = arg4;
		chatTransmitNum = transmitNum;
	}

	@ObfuscatedName("md.a(BLi;)Z")
	public static boolean isFriend(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < friendCount; var1++) {
			if (arg0.equalsIgnoreCase(field370[var1])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("pa.a(BLi;)Z")
	public static boolean isIgnored(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < privateMessageCount; var1++) {
			if (arg0.equalsIgnoreCase(field2741[var1])) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("b.a(IJ)V")
	public static void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (friendCount >= 100 && membersAccount != 1 || friendCount >= 200) {
			addChat(Text.FRIENDLISTFULL, 0, AUTO_EMPTY);
			return;
		}
		JagString var2 = JagString.toRawUsername(arg0).toScreenName();
		for (int var3 = 0; var3 < friendCount; var3++) {
			if (field2086[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.FRIENDLISTDUPE }), 0, AUTO_EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < privateMessageCount; var4++) {
			if (messageIds[var4] == arg0) {
				addChat(JagString.join(new JagString[] { Text.REMOVEIGNORE1, var2, Text.REMOVEIGNORE2 }), 0, AUTO_EMPTY);
				return;
			}
		}
		if (var2.strEquals(localPlayer.name)) {
			addChat(Text.FRIENDCANTADDSELF, 0, AUTO_EMPTY);
			return;
		}
		field370[friendCount] = var2;
		field2086[friendCount] = arg0;
		field3092[friendCount] = 0;
		field3238[friendCount] = AUTO_EMPTY;
		field845[friendCount] = 0;
		field1120[friendCount] = false;
		friendTransmitNum = transmitNum;
		friendCount++;
		// FRIENDLIST_ADD
		out.p1Enc(82);
		out.p8(arg0);
	}

	@ObfuscatedName("aj.a(IJ)V")
	public static void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (privateMessageCount >= 100) {
			addChat(Text.IGNORELISTFULL, 0, AUTO_EMPTY);
			return;
		}
		JagString var2 = JagString.toRawUsername(arg0).toScreenName();
		for (int var3 = 0; var3 < privateMessageCount; var3++) {
			if (messageIds[var3] == arg0) {
				addChat(JagString.join(new JagString[] { var2, Text.IGNORELISTDUPE }), 0, AUTO_EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < friendCount; var4++) {
			if (arg0 == field2086[var4]) {
				addChat(JagString.join(new JagString[] {Text.REMOVEFRIEND1, var2, Text.REMOVEFRIEND2 }), 0, AUTO_EMPTY);
				return;
			}
		}
		if (var2.strEquals(localPlayer.name)) {
			addChat(Text.IGNORECANTADDSELF, 0, AUTO_EMPTY);
			return;
		}
		messageIds[privateMessageCount] = arg0;
		field2741[privateMessageCount++] = JagString.toRawUsername(arg0);
		friendTransmitNum = transmitNum;
		out.p1Enc(28);
		out.p8(arg0);
	}

	@ObfuscatedName("ke.a(IJ)V")
	public static void delFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < friendCount; var2++) {
			if (field2086[var2] == arg0) {
				friendCount--;
				for (int var3 = var2; var3 < friendCount; var3++) {
					field370[var3] = field370[var3 + 1];
					field3092[var3] = field3092[var3 + 1];
					field3238[var3] = field3238[var3 + 1];
					field2086[var3] = field2086[var3 + 1];
					field845[var3] = field845[var3 + 1];
					field1120[var3] = field1120[var3 + 1];
				}
				friendTransmitNum = transmitNum;
				// FRIENDLIST_DEL
				out.p1Enc(121);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("nd.a(IJ)V")
	public static void delIgnore(long arg0) {
		if (arg0 == (long) 0) {
			return;
		}
		for (int var2 = 0; var2 < privateMessageCount; var2++) {
			if (messageIds[var2] == arg0) {
				privateMessageCount--;
				for (int var3 = var2; var3 < privateMessageCount; var3++) {
					messageIds[var3] = messageIds[var3 + 1];
					field2741[var3] = field2741[var3 + 1];
				}
				friendTransmitNum = transmitNum;
				out.p1Enc(126);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("ph.a(Li;II)V")
	public static void setFriendRank(JagString arg0, int arg1) {
		out.p1Enc(40);
		out.method296(arg0.toUserhash());
		out.p1(arg1);
	}

	@ObfuscatedName("jc.a(Li;B)V")
	public static void friendsChatKickUser(JagString arg0) {
		if (friendChatList == null) {
			return;
		}
		int var1 = 0;
		long var2 = arg0.toUserhash();
		if (var2 == 0L) {
			return;
		}
		while (var1 < friendChatList.length && var2 != friendChatList[var1].key) {
			var1++;
		}
		if (friendChatList.length > var1 && friendChatList[var1] != null) {
			out.p1Enc(49);
			out.p8(friendChatList[var1].key);
		}
	}

	@ObfuscatedName("md.a(IJ)V")
	public static void friendsChatJoinChat(long arg0) {
		if (arg0 != 0L) {
			out.p1Enc(58);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("wi.e(B)V")
	public static void friendsChatLeaveChat() {
		// FRIENDCHAT_LEAVE
		out.p1Enc(58);
		out.p8(0L);
	}

	@ObfuscatedName("bb.a(II)V")
	public static void purgeServerActive(int arg0) {
		for (IntNode var1 = (IntNode) serverActive.search(); var1 != null; var1 = (IntNode) serverActive.findnext()) {
			if ((long) arg0 == (var1.key >> 48 & 0xFFFFL)) {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("hc.a(ILq;)I")
	public static int getActive(IfType arg0) {
		IntNode var1 = (IntNode) serverActive.find(((long) arg0.parentId << 32) + ((long) arg0.subId));
		return var1 == null ? arg0.eventCode : var1.value;
	}

	// guessing placement
	@ObfuscatedName("hj.a(ILq;)Lq;")
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

	@ObfuscatedName("ge.a(ILq;)Z")
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

	@ObfuscatedName("ud.a(Lq;BI)Li;")
	public static JagString getIfTypeOpName(IfType arg0, int arg1) {
		if (!ServerActive.hasOp(arg1, getActive(arg0)) && arg0.onop == null) {
			return null;
		} else if (arg0.opNames == null || arg1 >= arg0.opNames.length || arg0.opNames[arg1] == null || arg0.opNames[arg1].method602().length() == 0) {
			return qaOpTest ? JagString.join(new JagString[] {field1802, JagString.parseInt(arg1) }) : null;
		} else {
			return arg0.opNames[arg1];
		}
	}

	@ObfuscatedName("ri.a(Lq;I)Li;")
	public static JagString targetVerb(IfType arg0) {
		if (ServerActive.targetMask(getActive(arg0)) == 0) {
			return null;
		} else if (arg0.targetVerb == null || arg0.targetVerb.method602().length() == 0) {
			return qaOpTest ? field2321 : null;
		} else {
			return arg0.targetVerb;
		}
	}

	// ---- todo: placement and identification

	@ObfuscatedName("sg.a(IZI)V")
	public static void resumePauseButton(int arg0, int arg1) {
		// RESUME_PAUSEBUTTON
		out.p1Enc(95);
		out.p4_alt3(arg1);
		out.p2_alt1(arg0);
	}

	// guessing name
	@ObfuscatedName("sf.d(I)V")
	public static void getSpecialArea() {
		chatDisabled = 0;
		int var0 = mapBuildBaseX + (localPlayer.x >> 7);
		int var1 = mapBuildBaseZ + (localPlayer.z >> 7);
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

	// guessing name
	@ObfuscatedName("k.a(IIILq;B)V")
	public static void drawCompass(int arg0, int arg1, int arg2, IfType arg3) {
		if (minimapState < 3) {
			((SoftwarePix32) compass).scanlineRotatePlotSprite(arg1, arg2, arg3.renderWidth, arg3.renderHeight, compass.wi / 2, compass.hi / 2, orbitCameraYaw, arg3.graphicMaskLineOffsets, arg3.graphicMaskLineLengths);
		} else {
			Pix2D.fillScanLine(arg1, arg2, arg3.graphicMaskLineOffsets, arg3.graphicMaskLineLengths);
		}
		componentBlitArea[arg0] = true;
	}

	@ObfuscatedName("pe.a(III)Li;")
	public static JagString combatColourCode(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return field3244;
		} else if (var2 < -6) {
			return field3636;
		} else if (var2 < -3) {
			return field18;
		} else if (var2 < 0) {
			return field502;
		} else if (var2 > 9) {
			return AUTO_TAG_COL_00FF00;
		} else if (var2 > 6) {
			return field553;
		} else if (var2 > 3) {
			return field4338;
		} else if (var2 > 0) {
			return field2526;
		} else {
			return AUTO_TAG_COL_FFFF00;
		}
	}

	// guessing name
	@ObfuscatedName("fd.a(Li;IBLi;Li;)V")
	public static void friendAddChat(JagString arg0, JagString arg1, JagString arg2) {
		addChat(arg1, -1, arg0, 9, arg2);
	}

	// guessing name
	@ObfuscatedName("l.a(Li;I)I")
	public static int getFriendIndex(JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < friendCount; var1++) {
			if (arg0.equalsIgnoreCase(field370[var1])) {
				return var1;
			}
		}
		return -1;
	}

}
