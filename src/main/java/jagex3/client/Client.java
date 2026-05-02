package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.config.*;
import jagex3.constants.Skills;
import jagex3.constants.Text;
import jagex3.constants.TextGerman;
import jagex3.dash3d.*;
import jagex3.datastruct.LinkList;
import jagex3.graphics.*;
import jagex3.io.*;
import jagex3.js5.Js5;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5Net;
import jagex3.js5.Js5NetThread;
import jagex3.jstring.JString;
import jagex3.jstring.StringTools;
import jagex3.reflectionchecker.ReflectionChecker;
import jagex3.sound.*;
import jagex3.util.JagString;
import jagex3.util.MonotonicTime;
import jagex3.var.VarCache;
import jagex3.wordfilter2.Huffman;
import jagex3.wordfilter2.WordPack;

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
// import netscape.javascript.JSObject;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("a.eb")
	public static final int tooltipRedraw = 50;
	@ObfuscatedName("cb.p")
	public static final int SCROLLBAR_GRIP_FOREGROUND = 5063219;
	@ObfuscatedName("sa.j")
	public static final int SCROLLBAR_GRIP_LOWLIGHT = 3353893;
	@ObfuscatedName("wa.t")
	public static final int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;
	@ObfuscatedName("la.D")
	public static final int MAX_CHATS = 50;
	@ObfuscatedName("s.n")
	public static final int SCROLLBAR_TRACK = 2301979;
	@ObfuscatedName("td.c")
	public static final boolean showOpIndex = false;
	@ObfuscatedName("la.r")
	public static JagString[] chat = new JagString[MAX_CHATS];
	@ObfuscatedName("la.p")
	public static int[] chatEffect = new int[MAX_CHATS];
	@ObfuscatedName("la.i")
	public static int[] chatHeight = new int[MAX_CHATS];
	@ObfuscatedName("la.e")
	public static int[] chatTimer = new int[MAX_CHATS];
	@ObfuscatedName("la.f")
	public static int[] chatY = new int[MAX_CHATS];
	@ObfuscatedName("la.a")
	public static int[] chatWidth = new int[MAX_CHATS];
	@ObfuscatedName("la.G")
	public static int[] chatColour = new int[MAX_CHATS];
	@ObfuscatedName("la.J")
	public static int[] chatX = new int[MAX_CHATS];

	@ObfuscatedName("client.gb")
	public static int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.jb")
	public static int idkDesignButton2 = -1;

	@ObfuscatedName("client.nb")
	public static int targetMode = 0;

	@ObfuscatedName("client.sb")
	public static JagString[] playerOp = new JagString[5];

	@ObfuscatedName("client.W")
	public static int loginWaitingTime = 0;

	@ObfuscatedName("client.Cb")
	public static JagString field609 = JagString.wrap("backtop1");
	@ObfuscatedName("hd.Jb")
	public static int loadingStep = 0;
	@ObfuscatedName("vd.Bd")
	public static World world;
	@ObfuscatedName("r.k")
	public static CollisionMap[] collision = new CollisionMap[4];
	@ObfuscatedName("rb.Fb")
	public static Pix32 minimap;
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
	public static Pix32 compass;
	@ObfuscatedName("ec.vb")
	public static Pix32 mapedge;
	@ObfuscatedName("ec.Lb")
	public static Pix8[] mapscene;
	@ObfuscatedName("ca.v")
	public static Pix32[] mapfunction;
	@ObfuscatedName("he.Cb")
	public static Pix32[] hitmarks;
	@ObfuscatedName("id.q")
	public static Pix32[] headiconsPk;
	@ObfuscatedName("ac.P")
	public static Pix32[] headiconsPrayer;
	@ObfuscatedName("md.xb")
	public static Pix32[] headiconsHint;
	@ObfuscatedName("pb.g")
	public static Pix32 overlayMultiway;
	@ObfuscatedName("dc.gb")
	public static Pix32[] mapmarker;
	@ObfuscatedName("n.t")
	public static Pix32[] cross;
	@ObfuscatedName("kc.n")
	public static Pix32[] mapdots;
	@ObfuscatedName("bd.e")
	public static Pix8[] scrollbar;
	@ObfuscatedName("rb.tb")
	public static Pix8[] modIcons;
	@ObfuscatedName("dd.h")
	public static MouseTracking mouseTracking;
	@ObfuscatedName("cb.i")
	public static PacketBit in = new PacketBit(5000);
	@ObfuscatedName("ia.Ac")
	public static int npcCount = 0;
	@ObfuscatedName("bd.o")
	public static int[] entityRemovalIds = new int[1000];
	@ObfuscatedName("dc.db")
	public static int[] npcIds = new int[32768];
	@ObfuscatedName("u.wb")
	public static ClientNpc[] npc = new ClientNpc[32768];
	@ObfuscatedName("nd.d")
	public static int loopCycle = 0;
	@ObfuscatedName("ib.d")
	public static int[] entityUpdateIds = new int[2048];
	@ObfuscatedName("nb.md")
	public static int entityUpdateCount = 0;
	@ObfuscatedName("nb.pd")
	public static ClientPlayer[] players = new ClientPlayer[2048];
	@ObfuscatedName("nb.Ec")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@ObfuscatedName("fe.Gc")
	public static BigInteger LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@ObfuscatedName("qa.Cb")
	public static int sceneCycle = 0;
	@ObfuscatedName("nc.i")
	public static boolean cinemaCam = false;
	@ObfuscatedName("w.h")
	public static int orbitCameraPitch = 128;
	@ObfuscatedName("jc.mb")
	public static int cameraPitchClamp = 0;
	@ObfuscatedName("se.y")
	public static int orbitCameraYaw = 0;
	@ObfuscatedName("sd.m")
	public static int macroCameraAngle = 0;
	@ObfuscatedName("d.cc")
	public static boolean[] camShake = new boolean[5];
	@ObfuscatedName("hd.vb")
	public static int orbitCameraX;
	@ObfuscatedName("aa.Fd")
	public static int minusedlevel;
	@ObfuscatedName("rb.Ab")
	public static ClientPlayer localPlayer;
	@ObfuscatedName("mb.X")
	public static int orbitCameraZ;
	@ObfuscatedName("dd.i")
	public static int camX;
	@ObfuscatedName("ac.V")
	public static int camYaw;
	@ObfuscatedName("ld.B")
	public static int camY;
	@ObfuscatedName("ie.l")
	public static int camPitch;
	@ObfuscatedName("hd.Bb")
	public static int camZ;
	@ObfuscatedName("ca.w")
	public static int[] camShakeAxis = new int[5];
	@ObfuscatedName("se.j")
	public static int[] camShakeAmp = new int[5];
	@ObfuscatedName("ga.D")
	public static int[] camShakeCycle = new int[5];
	@ObfuscatedName("bb.k")
	public static int worldUpdateNum = 0;
	@ObfuscatedName("gb.w")
	public static boolean js5Loading = true;
	@ObfuscatedName("ra.k")
	public static int state = 0;
	@ObfuscatedName("vd.ud")
	public static int scrollCycle = 0;
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
	public static ClientStream js5Stream;
	@ObfuscatedName("ca.r")
	public static int js5Errors = 0;
	@ObfuscatedName("wc.r")
	public static PrivilegedRequest js5SocketReq;
	@ObfuscatedName("ca.p")
	public static int js5ConnectState = 0;
	@ObfuscatedName("gb.m")
	public static int js5ConnectCooldown = 0;
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
	public static int mapBuildCentreZoneX;
	@ObfuscatedName("id.u")
	public static PrivilegedRequest loginSocketReq;
	@ObfuscatedName("n.m")
	public static boolean networkError = false;
	@ObfuscatedName("mb.bb")
	public static long field1843;
	@ObfuscatedName("vb.vb")
	public static long field3132 = 0L;
	@ObfuscatedName("g.i")
	public static int menuX;
	@ObfuscatedName("pc.a")
	public static int menuWidth;
	@ObfuscatedName("client.Y")
	public static int menuY;
	@ObfuscatedName("ad.F")
	public static int menuHeight;
	@ObfuscatedName("h.Ob")
	public static int menuNumEntries = 0;
	@ObfuscatedName("r.B")
	public static JagString[] menuOption = new JagString[500];
	@ObfuscatedName("pc.C")
	public static JagString field2334 = JagString.wrap("@lre@");
	@ObfuscatedName("f.o")
	public static int entityRemovalCount = 0;
	@ObfuscatedName("kb.s")
	public static int ambientVolume = 127;
	@ObfuscatedName("rc.k")
	public static boolean redrawChat = false;
	@ObfuscatedName("ad.C")
	public static int splitPrivateChat = 0;
	@ObfuscatedName("bb.l")
	public static int waveVolume = 127;
	@ObfuscatedName("cc.Lb")
	public static int chatEffects = 0;
	@ObfuscatedName("wc.p")
	public static int oneMouseButton = 0;
	@ObfuscatedName("kb.n")
	public static int midiVolume = 255;
	@ObfuscatedName("ub.k")
	public static int nextMidiSong = -1;
	@ObfuscatedName("mc.o")
	public static int nextMusicDelay = 0;
	@ObfuscatedName("t.Bb")
	public static int rebootTimer = 0;
	@ObfuscatedName("ta.ub")
	public static int chatTradeMode = 0;
	@ObfuscatedName("ae.m")
	public static int chatPrivateMode = 0;
	@ObfuscatedName("mc.s")
	public static int chatPublicMode = 0;
	@ObfuscatedName("cb.y")
	public static boolean redrawChatMode = false;
	@ObfuscatedName("d.kc")
	public static int menuArea;
	@ObfuscatedName("ae.a")
	public static boolean isMenuOpen = false;
	@ObfuscatedName("ld.D")
	public static int logoutTimer = 0;
	@ObfuscatedName("fe.Pc")
	public static int mouseTrackX = 0;
	@ObfuscatedName("ia.Bc")
	public static int mouseTrackY = 0;
	@ObfuscatedName("uc.G")
	public static int mouseTrackDelta = 0;
	@ObfuscatedName("ra.q")
	public static long prevMouseClickTime = 0L;
	@ObfuscatedName("g.u")
	public static int sendCameraDelay = 0;
	@ObfuscatedName("i.q")
	public static boolean sendCamera = false;
	@ObfuscatedName("mc.q")
	public static boolean focusIn = true;
	@ObfuscatedName("mc.j")
	public static int timeoutTimer = 0;
	@ObfuscatedName("pb.y")
	public static int crossMode = 0;
	@ObfuscatedName("fc.xb")
	public static int crossCycle = 0;
	@ObfuscatedName("d.Ac")
	public static int selectedArea = 0;
	@ObfuscatedName("ha.k")
	public static int selectedCycle = 0;
	@ObfuscatedName("gb.i")
	public static boolean redrawSide = false;
	@ObfuscatedName("fa.lb")
	public static int objDragArea = 0;
	@ObfuscatedName("ba.cc")
	public static int objDragCycles = 0;
	@ObfuscatedName("vb.Gb")
	public static int objGrabX = 0;
	@ObfuscatedName("ta.vb")
	public static int objGrabY = 0;
	@ObfuscatedName("t.Db")
	public static boolean objGrabThreshold = false;
	@ObfuscatedName("ha.b")
	public static int hoveredSlotComId = 0;
	@ObfuscatedName("qb.f")
	public static int objDragComId = 0;
	@ObfuscatedName("se.d")
	public static int objDragSlot = 0;
	@ObfuscatedName("s.c")
	public static int hoveredSlot = 0;
	@ObfuscatedName("kd.h")
	public static JagString tutComMessage = null;
	@ObfuscatedName("h.Bc")
	public static int fullModalId1 = -1;
	@ObfuscatedName("wa.u")
	public static int mainModalId = -1;
	@ObfuscatedName("l.e")
	public static int sideModalId = -1;
	@ObfuscatedName("qa.Ab")
	public static int[] sideIcon = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	@ObfuscatedName("bb.t")
	public static int activeIcon = 3;
	@ObfuscatedName("ob.o")
	public static int chatModalId = -1;
	@ObfuscatedName("qb.q")
	public static int tutComId = -1;
	@ObfuscatedName("wb.m")
	public static int field3253 = -1;
	@ObfuscatedName("id.B")
	public static int field1387 = -1;
	@ObfuscatedName("i.y")
	public static int field1279 = -1;
	@ObfuscatedName("rd.p")
	public static int tooltipNum = 0;
	@ObfuscatedName("aa.Cd")
	public static int macroMinimapCycle = 0;
	@ObfuscatedName("k.Q")
	public static int macroCameraCycle = 0;
	@ObfuscatedName("qb.e")
	public static int macroCameraZ = 0;
	@ObfuscatedName("ac.W")
	public static int macroCameraZModifier = 2;
	@ObfuscatedName("ba.ac")
	public static int macroCameraX = 0;
	@ObfuscatedName("oa.w")
	public static int macroCameraXModifier = 2;
	@ObfuscatedName("bb.g")
	public static int macroCameraAngleModifier = 1;
	@ObfuscatedName("ob.g")
	public static int macroMinimapAngle = 0;
	@ObfuscatedName("de.t")
	public static int macroMinimapAngleModifier = 2;
	@ObfuscatedName("ra.a")
	public static int macroMinimapZoom = 0;
	@ObfuscatedName("hc.g")
	public static int noTimeoutTimer = 0;
	@ObfuscatedName("a.ib")
	public static byte[][] mapBuildGroundData;
	@ObfuscatedName("pb.u")
	public static int[] mapBuildGroundFile;
	@ObfuscatedName("de.v")
	public static int[] mapBuildLocationFile;
	@ObfuscatedName("rc.g")
	public static byte[][] mapBuildLocationData;
	@ObfuscatedName("oe.b")
	public static int[][] mapKeys;
	@ObfuscatedName("gb.F")
	public static int[] mapBuildIndex;
	@ObfuscatedName("ie.t")
	public static int mapBuildBaseZ;
	@ObfuscatedName("ec.Rb")
	public static int mapBuildBaseX;
	@ObfuscatedName("se.a")
	public static boolean regionmode = false;
	@ObfuscatedName("ob.i")
	public static LinkList projectiles = new LinkList();
	@ObfuscatedName("pb.n")
	public static LinkList locChanges = new LinkList();
	@ObfuscatedName("f.c")
	public static int mapBuildCentreZoneZ;
	@ObfuscatedName("td.h")
	public static int playerCount = 0;
	@ObfuscatedName("sd.e")
	public static int[] playerIds = new int[2048];
	@ObfuscatedName("sd.f")
	public static int[][] dirMap = new int[104][104];
	@ObfuscatedName("r.s")
	public static int[][] distMap = new int[104][104];
	@ObfuscatedName("ib.g")
	public static int[] routeX = new int[4000];
	@ObfuscatedName("cd.r")
	public static int[] routeZ = new int[4000];
	@ObfuscatedName("la.L")
	public static ClientStream prevStream;
	@ObfuscatedName("oe.t")
	public static int projectY = -1;
	@ObfuscatedName("gb.z")
	public static int projectX = -1;
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
	@ObfuscatedName("qc.j")
	public static int ptype2 = 0;
	@ObfuscatedName("r.n")
	public static int field2572 = 0;
	@ObfuscatedName("r.o")
	public static int scrollInputPadding = 0;
	@ObfuscatedName("ra.s")
	public static int tutFlashIcon = -1;
	@ObfuscatedName("rc.l")
	public static int runweight = 0;
	@ObfuscatedName("rc.w")
	public static int selectedItem = 0;
	@ObfuscatedName("rd.z")
	public static long[] ignoreUserhash = new long[100];
	@ObfuscatedName("s.k")
	public static int overChatComId = -1;
	@ObfuscatedName("s.s")
	public static int minimapFlagZ = 0;
	@ObfuscatedName("sd.c")
	public static LinkList spotanims = new LinkList();
	@ObfuscatedName("tc.f")
	public static Packet tempP = new Packet(new byte[5000]);
	@ObfuscatedName("tc.n")
	public static int[] menuParamC = new int[500];
	@ObfuscatedName("tc.r")
	public static long[] friendUserhash = new long[200];
	@ObfuscatedName("td.p")
	public static int orbitCameraPitchVelocity = 0;
	@ObfuscatedName("pc.y")
	public static int field2330 = 0;
	@ObfuscatedName("ob.l")
	public static int bankArrangeMode = 0;
	@ObfuscatedName("n.r")
	public static int socialInputType = 0;
	@ObfuscatedName("ma.lb")
	public static int[] friendWorld = new int[200];
	@ObfuscatedName("m.q")
	public static int[] menuParamA = new int[500];
	@ObfuscatedName("ie.b")
	public static int field1390 = 0;
	@ObfuscatedName("ib.i")
	public static int[] SERVERPROT_SIZES = new int[]{0, 15, 6, 8, 0, 0, 1, 0, 0, 5, 0, 0, -2, 0, 0, 0, 0, 0, 1, 7, 0, 0, 0, -2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 4, 0, -1, 0, 0, 0, 0, 2, 0, 4, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 1, -1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 4, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 5, 2, 8, 2, 0, 8, 0, 0, 0, 0, 0, 0, 0, -2, 3, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 0, 6, 4, 3, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 2, 0, 4, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 3, -1, 0, 0, 0, 0, 0, 14, 0, 6, 0, 0, 6, 1, 0, 2, 0, 0, -2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 2, 4};
	@ObfuscatedName("de.d")
	public static int[] statEffectiveLevel = new int[25];
	@ObfuscatedName("de.o")
	public static boolean[] playerOpPriority = new boolean[5];
	@ObfuscatedName("dd.a")
	public static int friendServerStatus = 0;
	@ObfuscatedName("ca.A")
	public static int useMode = 0;
	@ObfuscatedName("ae.c")
	public static int hintTileZ = 0;
	@ObfuscatedName("ae.j")
	public static int chatDisabled = 0;
	@ObfuscatedName("rb.xb")
	public static long[] messageIds = new long[100];
	@ObfuscatedName("fd.Jb")
	public static int minimapFlagX = 0;
	@ObfuscatedName("ba.jc")
	public static int minimapLevel = -1;
	@ObfuscatedName("fe.Hc")
	public static int waveCount = 0;
	@ObfuscatedName("kc.w")
	public static int minimapState = 0;
	@ObfuscatedName("aa.ae")
	public static int hintType = 0;
	@ObfuscatedName("a.J")
	public static int ptype0 = 0;
	@ObfuscatedName("cb.s")
	public static int ptype1 = 0;
	@ObfuscatedName("hc.d")
	public static Packet[] playerAppearanceBuffer = new Packet[2048];
	@ObfuscatedName("je.Ub")
	public static int friendCount = 0;
	@ObfuscatedName("wa.b")
	public static PixMap areaBackbase1;
	@ObfuscatedName("sd.q")
	public static Pix8 backbase1;
	@ObfuscatedName("mb.db")
	public static Pix8 mapback;
	@ObfuscatedName("g.p")
	public static PixMap areaBackhmid1;
	@ObfuscatedName("kb.m")
	public static PixMap areaBackbase2;
	@ObfuscatedName("t.vb")
	public static Pix8[] sideicons;
	@ObfuscatedName("de.s")
	public static Pix8 redstone2hv;
	@ObfuscatedName("i.a")
	public static Pix8 redstone2v;
	@ObfuscatedName("vb.xb")
	public static Pix8 redstone1v;
	@ObfuscatedName("k.M")
	public static Pix8 redstone3v;
	@ObfuscatedName("gb.B")
	public static Pix8 redstone1hv;
	@ObfuscatedName("sa.u")
	public static Pix8 backbase2;
	@ObfuscatedName("jc.kb")
	public static Pix8 redstone1h;
	@ObfuscatedName("rd.C")
	public static Pix8 redstone2h;
	@ObfuscatedName("mc.z")
	public static Pix8 redstone3;
	@ObfuscatedName("kd.a")
	public static Pix8 redstone2;
	@ObfuscatedName("sa.g")
	public static Pix8 redstone1;
	@ObfuscatedName("ba.Jb")
	public static Pix8 backhmid1;
	@ObfuscatedName("u.Cb")
	public static int resumePauseComId = -1;
	@ObfuscatedName("pe.Eb")
	public static boolean redrawIcons = false;
	@ObfuscatedName("md.sb")
	public static int fullModalId2 = -1;
	@ObfuscatedName("na.d")
	public static int[] menuAction = new int[500];
	@ObfuscatedName("g.q")
	public static int[] menuParamB = new int[500];
	@ObfuscatedName("na.m")
	public static boolean debugRedrawSide = false;
	@ObfuscatedName("te.cb")
	public static JagString[] friendUsername = new JagString[200];
	@ObfuscatedName("ua.z")
	public static boolean scrollGrabbed = false;
	@ObfuscatedName("r.D")
	public static int[] minimapMaskLineOffsets;
	@ObfuscatedName("kb.t")
	public static int[] compassMaskLineLengths;
	@ObfuscatedName("kb.p")
	public static int[] compassMaskLineOffsets;
	@ObfuscatedName("mb.ab")
	public static int[] minimapMaskLineLengths;
	@ObfuscatedName("hb.eb")
	public static boolean field1159 = false;
	@ObfuscatedName("r.C")
	public static PixMap areaBackleft1;
	@ObfuscatedName("cc.Gb")
	public static PixMap areaBackleft2;
	@ObfuscatedName("nc.k")
	public static PixMap areaBackright1;
	@ObfuscatedName("j.mc")
	public static PixMap areaBackright2;
	@ObfuscatedName("tb.Wb")
	public static PixMap areaBacktop1;
	@ObfuscatedName("ma.db")
	public static PixMap areaBackvmid1;
	@ObfuscatedName("ua.w")
	public static PixMap areaBackvmid2;
	@ObfuscatedName("la.I")
	public static PixMap areaBackvmid3;
	@ObfuscatedName("f.q")
	public static PixMap areaBackhmid2;
	@ObfuscatedName("fd.tb")
	public static PixMap areaGame;
	@ObfuscatedName("id.g")
	public static Pix8 invback;
	@ObfuscatedName("hb.mb")
	public static PixMap areaSide;
	@ObfuscatedName("a.k")
	public static PixMap areaMap;
	@ObfuscatedName("oe.s")
	public static Pix8 chatback;
	@ObfuscatedName("kb.r")
	public static PixMap areaChat;
	@ObfuscatedName("bb.j")
	public static int[] chatScanline;
	@ObfuscatedName("h.Gb")
	public static int[] sideScanline;
	@ObfuscatedName("ib.c")
	public static int[] gameScanline;
	@ObfuscatedName("t.zb")
	public static int dialogInputType = 0;
	@ObfuscatedName("cd.t")
	public static IfType field548 = null;
	@ObfuscatedName("qa.vb")
	public static int field2392 = 0;
	@ObfuscatedName("be.hb")
	public static int field419 = 0;
	@ObfuscatedName("jc.yb")
	public static int zoneUpdateX;
	@ObfuscatedName("fc.wb")
	public static int zoneUpdateZ;
	@ObfuscatedName("hc.o")
	public static int camMoveToLx;
	@ObfuscatedName("ld.z")
	public static int camMoveToLz;
	@ObfuscatedName("bb.f")
	public static int camMoveToHei;
	@ObfuscatedName("ae.p")
	public static int camMoveToRate;
	@ObfuscatedName("tc.g")
	public static int camMoveToRate2;
	@ObfuscatedName("te.nb")
	public static int runenergy = 0;
	@ObfuscatedName("cd.x")
	public static LinkList[][][] groundObj = new LinkList[4][104][104];
	@ObfuscatedName("se.B")
	public static int mainOverlayId = -1;
	@ObfuscatedName("nb.td")
	public static JagString[] chatText = new JagString[100];
	@ObfuscatedName("g.x")
	public static boolean socialInputOpen = false;
	@ObfuscatedName("jc.xb")
	public static int inMultizone = 0;
	@ObfuscatedName("pb.F")
	public static PlayerModel idkDesign = new PlayerModel();
	@ObfuscatedName("g.D")
	public static boolean showFps = false;
	@ObfuscatedName("te.sb")
	public static int crossX = 0;
	@ObfuscatedName("cc.Hb")
	public static int crossY = 0;
	@ObfuscatedName("dd.d")
	public static IfType chatInterface;
	@ObfuscatedName("ub.z")
	public static int chatScrollHeight = 78;
	@ObfuscatedName("ia.zc")
	public static int chatScrollPos = 0;
	@ObfuscatedName("dc.nb")
	public static boolean debugRedrawIcons = false;
	@ObfuscatedName("aa.Wd")
	public static int[] field92;
	@ObfuscatedName("pb.I")
	public static JagString field2305 = JagString.wrap("m");
	@ObfuscatedName("i.e")
	public static JagString field1259 = JagString.wrap("l");
	@ObfuscatedName("ca.C")
	public static JagString field477 = JagString.wrap("_");
	@ObfuscatedName("fc.Lb")
	public static int[][][] mapBuildRegionSrc = new int[4][13][13];
	@ObfuscatedName("dc.kb")
	public static int[] waveDelay = new int[50];
	@ObfuscatedName("fe.xc")
	public static JagFX[] waveSounds = new JagFX[50];
	@ObfuscatedName("pe.Jb")
	public static int[] waveSoundIds = new int[50];
	@ObfuscatedName("ta.Lb")
	public static int[] waveLoops = new int[50];
	@ObfuscatedName("k.J")
	public static int[] waveAmbient = new int[50];
	@ObfuscatedName("t.xb")
	public static int tryMoveNearest = 0;
    @ObfuscatedName("ub.t")
    public static Pix32[] activeMapFunctions = new Pix32[1000];
	@ObfuscatedName("nb.id")
	public static int[] activeMapFunctionX = new int[1000];
	@ObfuscatedName("vb.tb")
	public static JagString[] chatUsername = new JagString[100];
	@ObfuscatedName("pb.G")
	public static int[] activeMapFunctionZ = new int[1000];
	@ObfuscatedName("jc.lb")
	public static int[] CHAT_COLOURS = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
	@ObfuscatedName("ua.q")
	public static int[][] tileLastOccupiedCycle = new int[104][104];
	@ObfuscatedName("cd.u")
	public static int[] statBaseLevel = new int[25];
	@ObfuscatedName("bb.c")
	public static int[] field313 = new int[100];
	@ObfuscatedName("vd.Ed")
	public static int[] LOC_SHAPE_TO_LAYER = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
	@ObfuscatedName("vc.l")
	public static int idkDesignButton1 = -1;
	@ObfuscatedName("j.hc")
	public static int activeMapFunctionCount = 0;
	@ObfuscatedName("ld.C")
	public static int chatCount = 0;
	@ObfuscatedName("ga.y")
	public static long js5ConnectTime;
	@ObfuscatedName("kb.k")
	public static int field1551;
	@ObfuscatedName("pb.k")
	public static int objSelectedSlot;
	@ObfuscatedName("d.oc")
	public static int[] ANGLE_TO_DIR = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	@ObfuscatedName("je.Lb")
	public static int[] statXP = new int[25];
	@ObfuscatedName("wa.D")
	public static int[] chatType = new int[100];
	@ObfuscatedName("dc.ib")
	public static int privateMessageCount = 0;
	@ObfuscatedName("ta.vc")
	public static int field2881 = -1;
	@ObfuscatedName("cd.p")
	public static int orbitCameraYawVelocity = 0;
	@ObfuscatedName("wa.i")
	public static int reportAbuseComId = -1;
	@ObfuscatedName("wa.f")
	public static int hintNpc = 0;
	@ObfuscatedName("bd.X")
	public static boolean debugRedrawChat = false;
	@ObfuscatedName("fe.Ac")
	public static long socialUserhash = 0L;
	@ObfuscatedName("fe.vc")
	public static boolean hiddenButtonTest = false;
	@ObfuscatedName("wb.B")
	public static boolean reportAbuseMuteOption = false;
	@ObfuscatedName("wc.w")
	public static int hintTileX = 0;
	@ObfuscatedName("wc.i")
	public static int hintPlayer = 0;
	@ObfuscatedName("oa.u")
	public static int ignoreCount = 0;
	@ObfuscatedName("mc.l")
	public static int field1857 = 0;
	@ObfuscatedName("la.y")
	public static int selectedComId = 0;
	@ObfuscatedName("ad.A")
	public static int overSideComId = -1;
	@ObfuscatedName("je.Zb")
	public static int field1497 = -1;
	@ObfuscatedName("he.Ib")
	public static int field1237 = 0;
	@ObfuscatedName("h.Yb")
	public static int hintHeight = 0;
	@ObfuscatedName("fc.Gb")
	public static int lastOverComId = -1;
	@ObfuscatedName("dd.o")
	public static PrivilegedRequest lastAddress;
	@ObfuscatedName("ga.N")
	public static int camLookAtRate2;
	@ObfuscatedName("gb.C")
	public static int useSelectedComId;
	@ObfuscatedName("i.p")
	public static int camLookAtLx;
	@ObfuscatedName("md.Gb")
	public static int camLookAtLz;
	@ObfuscatedName("na.l")
	public static int camLookAtHei;
	@ObfuscatedName("qc.m")
	public static int objComId;
	@ObfuscatedName("ta.Mb")
	public static int targetMask;
	@ObfuscatedName("td.n")
	public static int camLookAtRate;
	@ObfuscatedName("td.r")
	public static int field2949;
	@ObfuscatedName("ga.B")
	public static JagString[] chatScreenName = new JagString[100];
	@ObfuscatedName("a.jb")
	public static JagString field62 = JagString.wrap("chatback");
	@ObfuscatedName("re.n")
	public static JagString field2700 = JagString.wrap("compass");
	@ObfuscatedName("wa.B")
	public static JagString EMPTY = JagString.wrap("");
	@ObfuscatedName("wa.c")
	public static JagString field3209 = EMPTY;
	@ObfuscatedName("wa.d")
	public static JagString dialogInput = EMPTY;
	@ObfuscatedName("wa.k")
	public static JagString reportAbuseInput = EMPTY;
	@ObfuscatedName("wa.q")
	public static JagString chatInput = EMPTY;
	@ObfuscatedName("wa.x")
	public static JagString socialInputHeader = EMPTY;
	@ObfuscatedName("wa.z")
	public static JagString socialInput = EMPTY;
	@ObfuscatedName("ua.i")
	public static JagString field3007 = JagString.wrap("mapedge");
	@ObfuscatedName("l.c")
	public static JagString field1646 = JagString.wrap("mapscene");
	@ObfuscatedName("j.oc")
	public static JagString field1440 = JagString.wrap("mapfunction");
	@ObfuscatedName("jc.tb")
	public static JagString field1466 = JagString.wrap("hitmarks");
	@ObfuscatedName("te.qb")
	public static JagString field2965 = JagString.wrap("headicons_pk");
	@ObfuscatedName("ga.S")
	public static JagString field1034 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("rc.t")
	public static JagString field2646 = JagString.wrap("headicons_hint");
	@ObfuscatedName("jc.ob")
	public static JagString field1461 = JagString.wrap("overlay_multiway");
	@ObfuscatedName("bb.o")
	public static JagString field325 = JagString.wrap("mapmarker");
	@ObfuscatedName("va.nb")
	public static JagString field3118 = JagString.wrap("cross");
	@ObfuscatedName("ae.k")
	public static JagString field234 = JagString.wrap("mapdots");
	@ObfuscatedName("a.w")
	public static JagString field23 = JagString.wrap("scrollbar");
	@ObfuscatedName("na.a")
	public static JagString field1929 = JagString.wrap("mod_icons");
	@ObfuscatedName("m.l")
	public static JagString AUTO_CHEATPREFIX = JagString.wrap("::");
	@ObfuscatedName("m.u")
	public static JagString field1774 = JagString.wrap(")1");
	@ObfuscatedName("ma.jb")
	public static JagString AUTO_MEM = JagString.wrap("Mem:");
	@ObfuscatedName("kb.v")
	public static JagString AUTO_MEM_KB = JagString.wrap("k");
	@ObfuscatedName("kc.c")
	public static JagString field1567 = JagString.wrap("invback");
	@ObfuscatedName("kd.H")
	public static JagString NULL = JagString.wrap("null");
	@ObfuscatedName("id.x")
	public static JagString field1383 = JagString.wrap("@red@");
	@ObfuscatedName("l.b")
	public static JagString field1645 = JagString.wrap("@or3@");
	@ObfuscatedName("wc.y")
	public static JagString field3306 = JagString.wrap("@or2@");
	@ObfuscatedName("cb.v")
	public static JagString field501 = JagString.wrap("@or1@");
	@ObfuscatedName("r.f")
	public static JagString field2564 = JagString.wrap("@gre@");
	@ObfuscatedName("g.B")
	public static JagString field1005 = JagString.wrap("@gr3@");
	@ObfuscatedName("nd.j")
	public static JagString field2069 = JagString.wrap("@gr2@");
	@ObfuscatedName("n.s")
	public static JagString field1925 = JagString.wrap("@gr1@");
	@ObfuscatedName("re.m")
	public static JagString field2699 = JagString.wrap("@yel@");
	@ObfuscatedName("rd.y")
	public static JagString field2682 = JagString.wrap("backright2");
	@ObfuscatedName("qd.xc")
	public static JagString AUTO_ERRORTEST = JagString.wrap("::errortest");
	@ObfuscatedName("ec.Ab")
	public static JagString AUTO_NOCLIP = JagString.wrap("::noclip");
	@ObfuscatedName("te.tb")
	public static JagString AUTO_FPSOFF = JagString.wrap("::fpsoff");
	@ObfuscatedName("dc.cb")
	public static JagString AUTO_FPSON = JagString.wrap("::fpson");
	@ObfuscatedName("se.k")
	public static JagString AUTO_CLIENTDROP = JagString.wrap("::clientdrop");
	@ObfuscatedName("bd.T")
	public static JagString field406 = JagString.wrap("backbase2");
	@ObfuscatedName("nd.z")
	public static JagString AUTO_CHALREQ = JagString.wrap(":chalreq:");
	@ObfuscatedName("hd.sb")
	public static JagString AUTO_DUELREQ = JagString.wrap(":duelreq:");
	@ObfuscatedName("ob.n")
	public static JagString AUTO_COLON = JagString.wrap(":");
	@ObfuscatedName("he.Ab")
	public static JagString AUTO_TRADEREQ = JagString.wrap(":tradereq:");
	@ObfuscatedName("i.u")
	public static JagString field1275 = JagString.wrap(" (X");
	@ObfuscatedName("ia.Ub")
	public static JagString field1309 = JagString.wrap("(Udns");
	@ObfuscatedName("hb.lb")
	public static JagString field1166 = JagString.wrap("(U5");
	@ObfuscatedName("s.o")
	public static JagString field2716 = JagString.wrap("(U4");
	@ObfuscatedName("wb.K")
	public static JagString field3277 = JagString.wrap("(U3");
	@ObfuscatedName("pb.A")
	public static JagString field2297 = JagString.wrap("(U2");
	@ObfuscatedName("na.j")
	public static JagString field1938 = JagString.wrap("(U1");
	@ObfuscatedName("oe.m")
	public static JagString AUTO_PCT = JagString.wrap("(U");
	@ObfuscatedName("ob.k")
	public static JagString field2162 = JagString.wrap("backleft2");
	@ObfuscatedName("pc.B")
	public static JagString field2333 = JagString.wrap("mapback");
	@ObfuscatedName("pe.vb")
	public static JagString field2355 = JagString.wrap("backvmid2");
	@ObfuscatedName("qd.jd")
	public static JagString field2535 = JagString.wrap("@cr2@");
	@ObfuscatedName("ra.x")
	public static JagString field2612 = JagString.wrap("@cr1@");
	@ObfuscatedName("rc.c")
	public static JagString field2629 = JagString.wrap(" @whi@(X");
	@ObfuscatedName("rd.b")
	public static JagString field2659 = JagString.wrap("@whi@ )4 ");
	@ObfuscatedName("sd.s")
	public static JagString field2772 = JagString.wrap("0(U");
	@ObfuscatedName("se.z")
	public static JagString field2798 = JagString.wrap("backvmid1");
	@ObfuscatedName("se.D")
	public static JagString field2802 = JagString.wrap("Chat panel redrawn");
	@ObfuscatedName("wa.e")
	public static JagString field3211 = JagString.wrap("Side panel redrawn");
	@ObfuscatedName("wa.g")
	public static JagString field3213 = JagString.wrap("Icons redrawn");
	@ObfuscatedName("vb.zb")
	public static JagString field3136 = JagString.wrap("@cya@");
	@ObfuscatedName("vc.r")
	public static JagString field3163 = JagString.wrap("redstone3");
	@ObfuscatedName("w.g")
	public static JagString field3203 = JagString.wrap(" x ");
	@ObfuscatedName("jc.gb")
	public static JagString field1453 = JagString.wrap("p11_full");
	@ObfuscatedName("wb.g")
	public static JagString field3247 = JagString.wrap("p12_full");
	@ObfuscatedName("k.O")
	public static JagString field1526 = JagString.wrap("b12_full");
	@ObfuscatedName("t.Gb")
	public static JagString field2818 = JagString.wrap("sideicons");
	@ObfuscatedName("tb.hc")
	public static JagString field2910 = JagString.wrap("redstone2");
	@ObfuscatedName("tc.p")
	public static JagString field2927 = JagString.wrap("backbase1");
	@ObfuscatedName("ua.v")
	public static JagString field3020 = JagString.wrap("backleft1");
	@ObfuscatedName("ua.B")
	public static JagString AUTO_FPS = JagString.wrap("Fps:");
	@ObfuscatedName("uc.w")
	public static JagString field3059 = JagString.wrap("@yel@*V");
	@ObfuscatedName("vd.vd")
	public static JagString field3177 = null;
	@ObfuscatedName("k.L")
	public static JagString targetVerb = null;
	@ObfuscatedName("id.y")
	public static JagString field1384 = null;
	@ObfuscatedName("ra.m")
	public static JagString field2601 = JagString.wrap("(Y");
	@ObfuscatedName("qb.b")
	public static JagString field2406 = JagString.wrap(" ");
	@ObfuscatedName("na.n")
	public static JagString field1942 = JagString.wrap(" )2>");
	@ObfuscatedName("la.s")
	public static JagString AUTO_PCTCLOSE = JagString.wrap("(U(Y");
	@ObfuscatedName("l.f")
	public static JagString field1649 = JagString.wrap(" x");
	@ObfuscatedName("je.cc")
	public static JagString field1500 = JagString.wrap(" )2> @whi@");
	@ObfuscatedName("ie.e")
	public static JagString field1393 = JagString.wrap("@whi@");
	@ObfuscatedName("id.C")
	public static JagString field1388 = JagString.wrap("huffman");
	@ObfuscatedName("hb.ob")
	public static JagString field1169 = JagString.wrap("redstone1");
	@ObfuscatedName("h.rc")
	public static JagString field1133 = JagString.wrap("(X100(U(Y");
	@ObfuscatedName("gb.s")
	public static JagString AUTO_MINISEPARATOR = JagString.wrap(": ");
	@ObfuscatedName("f.t")
	public static JagString field846 = JagString.wrap(":0");
	@ObfuscatedName("ec.Qb")
	public static JagString field805 = JagString.wrap(" )2> @yel@");
	@ObfuscatedName("dd.m")
	public static JagString field713 = JagString.wrap(":  ");
	@ObfuscatedName("cd.e")
	public static JagString field533 = JagString.wrap("backhmid1");
	@ObfuscatedName("cc.Ib")
	public static JagString field524 = JagString.wrap(" )2> @cya@");
	@ObfuscatedName("ca.D")
	public static JagString field478 = JagString.wrap("backhmid2");
	@ObfuscatedName("ca.E")
	public static JagString field479 = JagString.wrap("");
	@ObfuscatedName("ca.g")
	public static JagString field455 = JagString.wrap("backright1");
	@ObfuscatedName("bb.r")
	public static JagString field328 = JagString.wrap(" )2> @lre@");
	@ObfuscatedName("bb.h")
	public static JagString field318 = JagString.wrap("backvmid3");
	@ObfuscatedName("ae.e")
	public static JagString AUTO_HIDDENBUTTONTEST = JagString.wrap("::hiddenbuttontest");
	@ObfuscatedName("ad.H")
	public static JagString field221 = JagString.wrap("(X");
	@ObfuscatedName("g.l")
	public static JagString AUTO_ASTERISK = JagString.wrap("(Z");
	@ObfuscatedName("kd.b")
	public static int[] camShakeRan = new int[5];

	@ObfuscatedName("dc.c(I)V")
	public static void mainLoad() {
		if (loadingStep == 0) {
			world = new World(4, 104, 104, ClientBuild.groundh);
			for (int var0 = 0; var0 < 4; var0++) {
				collision[var0] = new CollisionMap(104, 104);
			}
			minimap = new Pix32(512, 512);
			TitleScreen.loadPos = 5;
			loadingStep = 20;
			TitleScreen.loadString = Text.MAINLOAD0;
		} else if (loadingStep == 20) {
			int[] var1 = new int[9];
			for (int var2 = 0; var2 < 9; var2++) {
				int var3 = var2 * 32 + 128 + 15;
				int var4 = var3 * 3 + 600;
				int var5 = Pix3D.sinTable[var3];
				var1[var2] = var4 * var5 >> 16;
			}
			World.resetVisCalc(var1);
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
			loadingStep = 40;
			TitleScreen.loadString = Text.MAINLOAD30;
			TitleScreen.loadPos = 20;
		} else if (loadingStep == 40) {
			int var6 = anims.getIndexPercentage() * 5 / 100;
			int var7 = var6 + bases.getIndexPercentage() * 5 / 100;
			int var8 = var7 + configs.getIndexPercentage() * 5 / 100;
			int var9 = var8 + interfaces.getIndexPercentage() * 5 / 100;
			int var10 = var9 + jagFX.getIndexPercentage() * 5 / 100;
			int var11 = var10 + maps.getIndexPercentage() * 5 / 100;
			int var12 = var11 + songs.getIndexPercentage() * 5 / 100;
			int var13 = var12 + models.getIndexPercentage() * 40 / 100;
			int var14 = var13 + sprites.getIndexPercentage() * 5 / 100;
			int var15 = var14 + textures.getIndexPercentage() * 5 / 100;
			int var16 = var15 + binary.getIndexPercentage() * 5 / 100;
			int var17 = var16 + jingles.getIndexPercentage() * 5 / 100;
			int var18 = var17 + scripts.getIndexPercentage() * 5 / 100;
			if (var18 == 100) {
				loadingStep = 45;
				TitleScreen.loadString = Text.MAINLOAD40B;
				TitleScreen.loadPos = 30;
			} else {
				if (var18 != 0) {
					TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD40, JagString.parseInt(var18), AUTO_PCT});
				}
				TitleScreen.loadPos = 30;
			}
		} else if (loadingStep == 45) {
			PcmPlayer.init(GameShell.signlink, !lowMem);
			soundMixer = Mixer.method993(GameShell.signlink, GameShell.canvas);
			soundDecimator = new Decimator(22050, PcmPlayer.frequency);
			loadingStep = 50;
			TitleScreen.loadString = Text.MAINLOAD45;
			TitleScreen.loadPos = 35;
		} else if (loadingStep == 50) {
			int var19 = 0;
			if (p11 == null) {
				p11 = PixLoader.makePixFont(sprites, EMPTY, field1453);
			} else {
				var19++;
			}
			if (p12 == null) {
				p12 = PixLoader.makePixFont(sprites, EMPTY, field3247);
			} else {
				var19++;
			}
			if (b12 == null) {
				b12 = PixLoader.makePixFont(sprites, EMPTY, field1526);
			} else {
				var19++;
			}
			if (var19 < 3) {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD50, JagString.parseInt(var19 * 100 / 3), AUTO_PCT});
				TitleScreen.loadPos = 40;
			} else {
				loadingStep = 60;
				TitleScreen.loadPos = 40;
				TitleScreen.loadString = Text.MAINLOAD50B;
			}
		} else if (loadingStep == 60) {
			int var20 = TitleScreen.ready(binary, sprites);
			int var21 = TitleScreen.readyMax();
			if (var20 < var21) {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD60, JagString.parseInt(var20 * 100 / var21), AUTO_PCT});
				TitleScreen.loadPos = 50;
			} else {
				TitleScreen.loadString = Text.MAINLOAD60B;
				TitleScreen.loadPos = 50;
				setMainState(5);
				loadingStep = 70;
			}
		} else if (loadingStep == 70) {
			if (configs.requestFullDownload()) {
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
				loadingStep = 80;
				TitleScreen.loadPos = 60;
				TitleScreen.loadString = Text.MAINLOAD70B;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD70, JagString.parseInt(configs.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 60;
			}
		} else if (loadingStep == 80) {
			int var22 = 0;
			if (compass == null) {
				compass = PixLoader.makePix32(sprites, field2700, EMPTY);
			} else {
				var22++;
			}
			if (mapedge == null) {
				mapedge = PixLoader.makePix32(sprites, field3007, EMPTY);
			} else {
				var22++;
			}
			if (mapscene == null) {
				mapscene = PixLoader.makePix8Array(sprites, field1646, EMPTY);
			} else {
				var22++;
			}
			if (mapfunction == null) {
				mapfunction = PixLoader.makePix32Array(sprites, field1440, EMPTY);
			} else {
				var22++;
			}
			if (hitmarks == null) {
				hitmarks = PixLoader.makePix32Array(sprites, field1466, EMPTY);
			} else {
				var22++;
			}
			if (headiconsPk == null) {
				headiconsPk = PixLoader.makePix32Array(sprites, field2965, EMPTY);
			} else {
				var22++;
			}
			if (headiconsPrayer == null) {
				headiconsPrayer = PixLoader.makePix32Array(sprites, field1034, EMPTY);
			} else {
				var22++;
			}
			if (headiconsHint == null) {
				headiconsHint = PixLoader.makePix32Array(sprites, field2646, EMPTY);
			} else {
				var22++;
			}
			if (overlayMultiway == null) {
				overlayMultiway = PixLoader.makePix32(sprites, field1461, EMPTY);
			} else {
				var22++;
			}
			if (mapmarker == null) {
				mapmarker = PixLoader.makePix32Array(sprites, field325, EMPTY);
			} else {
				var22++;
			}
			if (cross == null) {
				cross = PixLoader.makePix32Array(sprites, field3118, EMPTY);
			} else {
				var22++;
			}
			if (mapdots == null) {
				mapdots = PixLoader.makePix32Array(sprites, field234, EMPTY);
			} else {
				var22++;
			}
			if (scrollbar == null) {
				scrollbar = PixLoader.makePix8Array(sprites, field23, EMPTY);
			} else {
				var22++;
			}
			if (modIcons == null) {
				modIcons = PixLoader.makePix8Array(sprites, field1929, EMPTY);
			} else {
				var22++;
			}
			if (var22 < 14) {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD80, JagString.parseInt(var22 * 100 / 14), AUTO_PCT});
				TitleScreen.loadPos = 70;
			} else {
				mapedge.trim();
				int var23 = (int) (Math.random() * 21.0D) - 10;
				int var24 = (int) (Math.random() * 21.0D) - 10;
				int var25 = (int) (Math.random() * 41.0D) - 20;
				int var26 = (int) (Math.random() * 21.0D) - 10;
				for (int var27 = 0; var27 < mapfunction.length; var27++) {
					mapfunction[var27].rgbAdjust(var23 + var25, var24 - -var25, var26 + var25);
				}
				mapscene[0].rgbAdjust(var23 + var25, var24 + var25, var25 + var26);
				TitleScreen.loadString = Text.MAINLOAD80B;
				TitleScreen.loadPos = 70;
				loadingStep = 85;
			}
		} else if (loadingStep == 85) {
			int var28 = prefetchFrame(sprites);
			int var29 = frameCount();
			if (var28 < var29) {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.field1597, JagString.parseInt(var28 * 100 / var29), AUTO_PCT});
				TitleScreen.loadPos = 80;
			} else {
				TitleScreen.loadString = Text.field1431;
				loadingStep = 90;
				TitleScreen.loadPos = 80;
			}
		} else if (loadingStep == 90) {
			if (textures.requestFullDownload()) {
				TextureManager var30 = new TextureManager(textures, sprites, 20, 0.8D, lowMem ? 64 : 128);
				Pix3D.setTextures(var30);
				Pix3D.initColourTable(0.8D);
				loadingStep = 110;
				TitleScreen.loadPos = 90;
				TitleScreen.loadString = Text.MAINLOAD90B;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD90, JagString.parseInt(textures.getIndexLoadProgress()), AUTO_PCT});
				TitleScreen.loadPos = 90;
			}
		} else if (loadingStep == 110) {
			mouseTracking = new MouseTracking();
			GameShell.signlink.threadreq(10, mouseTracking);
			TitleScreen.loadString = Text.MAINLOAD110;
			loadingStep = 120;
			TitleScreen.loadPos = 94;
		} else if (loadingStep == 120) {
			if (binary.requestDownload(field1388, EMPTY)) {
				Huffman var31 = new Huffman(binary.getFile(EMPTY, field1388));
				WordPack.setHuffman(var31);
				loadingStep = 130;
				TitleScreen.loadString = Text.MAINLOAD120B;
				TitleScreen.loadPos = 96;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD120, field2772});
				TitleScreen.loadPos = 96;
			}
		} else if (loadingStep == 130) {
			if (!interfaces.requestFullDownload()) {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD130, JagString.parseInt(interfaces.getIndexLoadProgress() * 4 / 5), AUTO_PCT});
				TitleScreen.loadPos = 100;
			} else if (scripts.requestFullDownload()) {
				TitleScreen.loadString = Text.MAINLOAD130B;
				loadingStep = 140;
				TitleScreen.loadPos = 100;
			} else {
				TitleScreen.loadString = JagString.join(new JagString[]{Text.MAINLOAD130, JagString.parseInt(scripts.getIndexLoadProgress() / 5 + 80), AUTO_PCT});
				TitleScreen.loadPos = 100;
			}
		} else if (loadingStep == 140) {
			setMainState(10);
		}
	}

	@ObfuscatedName("d.b(Z)V")
	public static void getNpcPosOldVis() {
		in.gBitStart();
		int var0 = in.gBit(8);
		if (var0 < npcCount) {
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

	@ObfuscatedName("kc.a(B)V")
	public static void gameDrawMain() {
		sceneCycle++;
		addPlayers(true);
		addNpcs(true);
		addPlayers(false);
		addNpcs(false);
		addProjectiles();
		addMapAnim();
		if (!cinemaCam) {
			int var0 = orbitCameraPitch;
			if (cameraPitchClamp / 256 > var0) {
				var0 = cameraPitchClamp / 256;
			}
			int var1 = orbitCameraYaw + macroCameraAngle & 0x7FF;
			if (camShake[4] && camShakeRan[4] + 128 > var0) {
				var0 = camShakeRan[4] + 128;
			}
			camFollow(var0, orbitCameraX, getAvH(minusedlevel, localPlayer.x, localPlayer.z) - 50, var1, orbitCameraZ, var0 * 3 + 600);
		}
		int var2;
		if (cinemaCam) {
			var2 = roofCheck2();
		} else {
			var2 = roofCheck();
		}
		int var3 = camX;
		int var4 = camYaw;
		int var5 = camY;
		int var6 = camPitch;
		int var7 = camZ;
		for (int var8 = 0; var8 < 5; var8++) {
			if (camShake[var8]) {
				int var9 = (int) ((double) (camShakeAxis[var8] * 2 + 1) * Math.random() + Math.sin((double) camShakeAmp[var8] / 100.0D * (double) camShakeCycle[var8]) * (double) camShakeRan[var8] - (double) camShakeAxis[var8]);
				if (var8 == 1) {
					camY += var9;
				}
				if (var8 == 0) {
					camX += var9;
				}
				if (var8 == 2) {
					camZ += var9;
				}
				if (var8 == 4) {
					camPitch += var9;
					if (camPitch < 128) {
						camPitch = 128;
					}
					if (camPitch > 383) {
						camPitch = 383;
					}
				}
				if (var8 == 3) {
					camYaw = camYaw + var9 & 0x7FF;
				}
			}
		}
		bindGame();
		Model.mouseX = ClientMouseListener.mouseY - 4;
		Model.mouseCheck = true;
		Model.mouseY = ClientMouseListener.mouseX - 4;
		Model.pickedCount = 0;
		Pix2D.cls();
		world.renderAll(camX, camY, camZ, camPitch, camYaw, var2);
		world.removeSprites();
		entityOverlays();
		coordArrow();
		((TextureManager) Pix3D.textureManager).runAnims(worldUpdateNum);
		otherOverlays();
		if (js5Loading && Js5Net.urgentQueueSize() == 0) {
			js5Loading = false;
		}
		if (js5Loading) {
			bindGame();
			Pix2D.cls();
			messageBox(Text.LOADING, false, null);
		}
		canvasDrawGame();
		camX = var3;
		camZ = var7;
		camYaw = var4;
		camPitch = var6;
		camY = var5;
	}

	@ObfuscatedName("re.a(IZZBZ)Lu;")
	public static Js5Loader openJs5(int arg0, boolean arg1, boolean arg2, boolean arg3) {
		DataFile var4 = null;
		if (GameShell.cacheDat != null) {
			var4 = new DataFile(arg0, GameShell.cacheDat, GameShell.cacheIndex[arg0], 1000000);
		}
		return new Js5Loader(var4, GameShell.masterIndex, arg0, arg2, arg3, arg1);
	}

	@ObfuscatedName("i.a(B)V")
	public static void addProjectiles() {
		for (ClientProj var0 = (ClientProj) projectiles.head(); var0 != null; var0 = (ClientProj) projectiles.next()) {
			if (minusedlevel != var0.level || loopCycle > var0.t2) {
				var0.unlink();
			} else if (var0.t1 <= loopCycle) {
				if (var0.target > 0) {
					ClientNpc var1 = npc[var0.target - 1];
					if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.z >= 0 && var1.z < 13312) {
						var0.setTarget(loopCycle, var1.z, getAvH(var0.level, var1.x, var1.z) - var0.field617, var1.x);
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
						var0.setTarget(loopCycle, var3.z, getAvH(var0.level, var3.x, var3.z) - var0.field617, var3.x);
					}
				}
				var0.move(worldUpdateNum);
				world.addDynamic(minusedlevel, (int) var0.x, (int) var0.z, (int) var0.y, 60, var0, var0.yaw, -1, false);
			}
		}
	}

	@ObfuscatedName("fa.a(III)La;")
	public static JagString combatColourCode(int arg0, int arg1) {
		int var2 = arg0 - arg1;
		if (var2 < -9) {
			return field1383;
		} else if (var2 < -6) {
			return field1645;
		} else if (var2 < -3) {
			return field3306;
		} else if (var2 < 0) {
			return field501;
		} else if (var2 > 9) {
			return field2564;
		} else if (var2 > 6) {
			return field1005;
		} else if (var2 > 3) {
			return field2069;
		} else if (var2 > 0) {
			return field1925;
		} else {
			return field2699;
		}
	}

	@ObfuscatedName("ga.e(I)V")
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

	@ObfuscatedName("ua.a(Z)V")
	public static void addMapAnim() {
		for (MapSpotAnim var0 = (MapSpotAnim) spotanims.head(); var0 != null; var0 = (MapSpotAnim) spotanims.next()) {
			if (minusedlevel != var0.level || var0.animComplete) {
				var0.unlink();
			} else if (loopCycle >= var0.startCycle) {
				var0.doAnim(worldUpdateNum);
				if (var0.animComplete) {
					var0.unlink();
				} else {
					world.addDynamic(var0.level, var0.x, var0.z, var0.y, 60, var0, 0, -1, false);
				}
			}
		}
	}

	@ObfuscatedName("kc.b(B)V")
	public static void getPlayerPos() {
		entityUpdateCount = 0;
		entityRemovalCount = 0;
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
		if (psize != in.pos) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + psize);
		}
		for (int var2 = 0; var2 < playerCount; var2++) {
			if (players[playerIds[var2]] == null) {
				throw new RuntimeException("gpp2 pos:" + var2 + " size:" + playerCount);
			}
		}
	}

	@ObfuscatedName("fa.c(I)V")
	public static void drawFeedback() {
		if (menuNumEntries < 2 && useMode == 0 && targetMode == 0) {
			return;
		}
		JagString var0;
		if (useMode == 1 && menuNumEntries < 2) {
			var0 = JagString.join(new JagString[]{Text.USE, Text.MINISEPARATOR, field3177, field1942});
		} else if (targetMode == 1 && menuNumEntries < 2) {
			var0 = JagString.join(new JagString[]{targetVerb, Text.MINISEPARATOR, field1384, field1942});
		} else {
			var0 = menuOption[menuNumEntries - 1];
		}
		if (menuNumEntries > 2) {
			var0 = JagString.join(new JagString[]{var0, field2659, JagString.parseInt(menuNumEntries - 2), Text.MOREOPTIONS});
		}
		b12.drawStringAntiMacro(var0, 4, 16777215, loopCycle / 1000);
	}

	@ObfuscatedName("hc.b(II)V")
	public static void clientVar(int arg0) {
		field1237 = loopCycle;
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
			fullredraw = true;
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
					MidiManager.play(0, nextMidiSong, var3, songs);
					nextMusicDelay = 0;
				} else if (var3 == 0) {
					MidiManager.stop();
					nextMusicDelay = 0;
				} else {
					MidiManager.setVolume(var3);
				}
				midiVolume = var3;
			}
		}
		if (var1 == 9) {
			bankArrangeMode = var2;
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
		if (var1 == 8) {
			redrawChat = true;
			splitPrivateChat = var2;
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
		if (var1 == 6) {
			chatEffects = var2;
		}
		if (var1 == 5) {
			oneMouseButton = var2;
		}
	}

	@ObfuscatedName("rd.a(B)V")
	public static void zonePacket() {
		if (ptype == 49) {
			// LOC_ANIM
			int var0 = in.g1_alt1();
			int var1 = (var0 & 0x7) + zoneUpdateZ;
			int var2 = (var0 >> 4 & 0x7) + zoneUpdateX;
			int var3 = in.g1_alt1();
			int var4 = var3 >> 2;
			int var5 = var3 & 0x3;
			int var6 = LOC_SHAPE_TO_LAYER[var4];
			int var7 = in.g2_alt3();
			if (var2 >= 0 && var1 >= 0 && var2 < 103 && var1 < 103) {
				int var8 = ClientBuild.groundh[minusedlevel][var2][var1];
				int var9 = ClientBuild.groundh[minusedlevel][var2 + 1][var1];
				int var10 = ClientBuild.groundh[minusedlevel][var2 + 1][var1 + 1];
				int var11 = ClientBuild.groundh[minusedlevel][var2][var1 + 1];
				if (var6 == 0) {
					Wall var12 = world.getWall(minusedlevel, var2, var1);
					if (var12 != null) {
						int var13 = var12.typecode >> 14 & 0x7FFF;
						if (var4 == 2) {
							var12.modelA = new ClientLocAnim(var13, 2, var5 + 4, var8, var9, var10, var11, var7, false);
							var12.modelB = new ClientLocAnim(var13, 2, var5 + 1 & 0x3, var8, var9, var10, var11, var7, false);
						} else {
							var12.modelA = new ClientLocAnim(var13, var4, var5, var8, var9, var10, var11, var7, false);
						}
					}
				}
				if (var6 == 1) {
					Decor var14 = world.getDecor(minusedlevel, var2, var1);
					if (var14 != null) {
						var14.model = new ClientLocAnim(var14.typecode >> 14 & 0x7FFF, 4, 0, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 2) {
					Sprite var15 = world.getScene(minusedlevel, var2, var1);
					if (var4 == 11) {
						var4 = 10;
					}
					if (var15 != null) {
						var15.model = new ClientLocAnim(var15.typecode >> 14 & 0x7FFF, var4, var5, var8, var9, var10, var11, var7, false);
					}
				}
				if (var6 == 3) {
					GroundDecor var16 = world.getGd(minusedlevel, var2, var1);
					if (var16 != null) {
						var16.model = new ClientLocAnim(var16.typecode >> 14 & 0x7FFF, 22, var5, var8, var9, var10, var11, var7, false);
					}
				}
			}
		} else if (ptype == 241) {
			// LOC_ADD_CHANGE
			int var17 = in.g1_alt2();
			int var18 = var17 & 0x3;
			int var19 = var17 >> 2;
			int var20 = LOC_SHAPE_TO_LAYER[var19];
			int var21 = in.g2();
			int var22 = in.g1_alt1();
			int var23 = (var22 & 0x7) + zoneUpdateZ;
			int var24 = (var22 >> 4 & 0x7) + zoneUpdateX;
			if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
				locChangeCreate(var21, var24, var18, -1, minusedlevel, var23, var20, var19, 0);
			}
		} else if (ptype == 9) {
			// SOUND_AREA
			int var25 = in.g1();
			int var26 = (var25 & 0x7) + zoneUpdateZ;
			int var27 = (var25 >> 4 & 0x7) + zoneUpdateX;
			int var28 = in.g2();
			int var29 = in.g1();
			int var30 = var29 >> 4 & 0xF;
			int var31 = var29 & 0x7;
			int var32 = in.g1();
			if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
				int var33 = var30 + 1;
				if (var27 - var33 <= localPlayer.routeX[0] && var27 + var33 >= localPlayer.routeX[0] && var26 - var33 <= localPlayer.routeZ[0] && var26 + var33 >= localPlayer.routeZ[0] && ambientVolume != 0 && var31 > 0 && waveCount < 50) {
					waveSoundIds[waveCount] = var28;
					waveLoops[waveCount] = var31;
					waveDelay[waveCount] = var32;
					waveSounds[waveCount] = null;
					waveAmbient[waveCount] = (var26 << 8) + (var27 << 16) + var30;
					waveCount++;
				}
			}
		} else if (ptype == 202) {
			// MAP_ANIM
			int var34 = in.g1();
			int var35 = (var34 >> 4 & 0x7) + zoneUpdateX;
			int var36 = zoneUpdateZ + (var34 & 0x7);
			int var37 = in.g2();
			int var38 = in.g1();
			int var39 = in.g2();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				int var40 = var36 * 128 + 64;
				int var41 = var35 * 128 + 64;
				MapSpotAnim var42 = new MapSpotAnim(var37, minusedlevel, var41, var40, getAvH(minusedlevel, var41, var40) - var38, var39, loopCycle);
				spotanims.push(var42);
			}
		} else if (ptype == 99) {
			// OBJ_COUNT
			int var43 = in.g1();
			int var44 = (var43 >> 4 & 0x7) + zoneUpdateX;
			int var45 = (var43 & 0x7) + zoneUpdateZ;
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
			// LOC_DEL
			int var51 = in.g1_alt1();
			int var52 = zoneUpdateZ + (var51 & 0x7);
			int var53 = zoneUpdateX + (var51 >> 4 & 0x7);
			int var54 = in.g1_alt2();
			int var55 = var54 & 0x3;
			int var56 = var54 >> 2;
			int var57 = LOC_SHAPE_TO_LAYER[var56];
			if (var53 >= 0 && var52 >= 0 && var53 < 104 && var52 < 104) {
				locChangeCreate(-1, var53, var55, -1, minusedlevel, var52, var57, var56, 0);
			}
		} else if (ptype == 229) {
			// P_LOCMERGE
			byte var58 = in.g1b_alt1();
			int var59 = in.g2_alt2();
			byte var60 = in.g1b();
			byte var61 = in.g1b();
			int var62 = in.g1_alt1();
			int var63 = var62 & 0x3;
			int var64 = var62 >> 2;
			int var65 = LOC_SHAPE_TO_LAYER[var64];
			int var66 = in.g1_alt3();
			int var67 = (var66 & 0x7) + zoneUpdateZ;
			int var68 = zoneUpdateX + (var66 >> 4 & 0x7);
			int var69 = in.g2();
			byte var70 = in.g1b_alt2();
			int var71 = in.g2_alt1();
			int var72 = in.g2_alt3();
			ClientPlayer var73;
			if (selfSlot == var59) {
				var73 = localPlayer;
			} else {
				var73 = players[var59];
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
					locChangeCreate(-1, var68, 0, var72 + 1, minusedlevel, var67, var65, 0, var69 + 1);
					var73.locEndCycle = loopCycle + var72;
					int var82 = var74.width;
					var73.field73 = var79;
					var73.locStartCycle = loopCycle + var69;
					int var83 = var74.length;
					if (var63 == 1 || var63 == 3) {
						var83 = var74.width;
						var82 = var74.length;
					}
					var73.field79 = var68 * 128 + var82 * 64;
					var73.locOffsetZ = var67 * 128 + var83 * 64;
					var73.field80 = getAvH(minusedlevel, var73.field79, var73.locOffsetZ);
					var73.field89 = var61 + var67;
					var73.field66 = var68 + var70;
					var73.field70 = var68 + var58;
					var73.field97 = var60 + var67;
				}
			}
		} else if (ptype == 74) {
			// OBJ_DEL
			int var84 = in.g1();
			int var85 = (var84 >> 4 & 0x7) + zoneUpdateX;
			int var86 = (var84 & 0x7) + zoneUpdateZ;
			int var87 = in.g2_alt2();
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
			// MAP_PROJANIM
			int var90 = in.g1();
			int var91 = (var90 & 0x7) + zoneUpdateZ;
			int var92 = zoneUpdateX + (var90 >> 4 & 0x7);
			int var93 = var92 + in.g1b();
			int var94 = var91 + in.g1b();
			int var95 = in.g2b();
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
				ClientProj var106 = new ClientProj(var96, minusedlevel, var104, var105, getAvH(minusedlevel, var104, var105) - var97, var99 - -loopCycle, var100 + loopCycle, var101, var102, var95, var98);
				int var107 = var94 * 128 + 64;
				var106.setTarget(loopCycle + var99, var107, getAvH(minusedlevel, var103, var107) - var98, var103);
				projectiles.push(var106);
			}
		} else if (ptype == 19) {
			// OBJ_REVEAL
			int var108 = in.g2_alt3();
			int var109 = in.g2_alt3();
			int var110 = in.g2();
			int var111 = in.g1_alt1();
			int var112 = (var111 >> 4 & 0x7) + zoneUpdateX;
			int var113 = (var111 & 0x7) + zoneUpdateZ;
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
			// OBJ_ADD
			int var115 = in.g2_alt1();
			int var116 = in.g2();
			int var117 = in.g1();
			int var118 = (var117 & 0x7) + zoneUpdateZ;
			int var119 = (var117 >> 4 & 0x7) + zoneUpdateX;
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

	@ObfuscatedName("ca.a(I)V")
	public static void moveNpcs() {
		for (int var0 = 0; var0 < npcCount; var0++) {
			int var1 = npcIds[var0];
			ClientNpc var2 = npc[var1];
			if (var2 != null) {
				moveEntity(var2, var2.type.size);
			}
		}
	}

	@ObfuscatedName("nc.a(Ldc;I)V")
	public static void locChangeSetOld(LocChange arg0) {
		int var1 = 0;
		int var2 = -1;
		int var3 = 0;
		if (arg0.layer == 0) {
			var1 = world.wallType(arg0.level, arg0.x, arg0.z);
		}
		int var4 = 0;
		if (arg0.layer == 1) {
			var1 = world.decorType(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 2) {
			var1 = world.sceneType(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 3) {
			var1 = world.gdType(arg0.level, arg0.x, arg0.z);
		}
		if (var1 != 0) {
			int var5 = world.typecode2(arg0.level, arg0.x, arg0.z, var1);
			var2 = var1 >> 14 & 0x7FFF;
			var4 = var5 >> 6 & 0x3;
			var3 = var5 & 0x1F;
		}
		arg0.field686 = var4;
		arg0.field689 = var2;
		arg0.field697 = var3;
	}

	@ObfuscatedName("j.g(I)V")
	public static void getNpcPos() {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getNpcPosOldVis();
		getNpcPosNewVis();
		getNpcPosExtended();
		for (int var0 = 0; var0 < entityRemovalCount; var0++) {
			int var1 = entityRemovalIds[var0];
			if (loopCycle != npc[var1].cycle) {
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

	@ObfuscatedName("ld.a(I)V")
	public static void drawMinimenuGerman() {
		JagString var0 = null;
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			if (menuOption[var1].indexOf(field2334) != -1) {
				var0 = menuOption[var1].substring(menuOption[var1].indexOf(field2334));
				break;
			}
		}
		if (var0 == null) {
			drawMinimenu();
			return;
		}
		int var2 = menuWidth;
		int var3 = menuX;
		if (var2 > 190) {
			var2 = 190;
		}
		int var4 = menuHeight;
		int var5 = menuY;
		if (var3 < 0) {
			var3 = 0;
		}
		Pix2D.fillRect(var3, var5, var2, var4, 6116423);
		Pix2D.fillRect(var3 + 1, var5 - -1, var2 - 2, 16, 0);
		Pix2D.drawRect(var3 + 1, var5 + 18, var2 - 2, var4 + -19, 0);
		b12.drawString(var0, var3 + 3, var5 + 14, 6116423, false);
		int var6 = ClientMouseListener.mouseX;
		int var7 = ClientMouseListener.mouseY;
		if (menuArea == 0) {
			var6 -= 4;
			var7 -= 4;
		}
		if (menuArea == 1) {
			var6 -= 553;
			var7 -= 205;
		}
		if (menuArea == 2) {
			var7 -= 357;
			var6 -= 17;
		}
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			int var9 = (menuNumEntries - var8 - 1) * 15 + var5 + 31;
			JagString var10 = menuOption[var8];
			int var11 = 16777215;
			if (var10.endsWith(var0)) {
				var10 = var10.substring(0, var10.length() - var0.length());
				if (var10.endsWith(Text.MINISEPARATOR)) {
					var10 = var10.substring(0, var10.length() - Text.MINISEPARATOR.length());
				}
			}
			if (var3 < var6 && var6 < var2 + var3 && var9 - 13 < var7 && var9 + 3 > var7) {
				var11 = 16776960;
			}
			b12.drawString(var10, var3 + 3, var9, var11, true);
		}
	}

	@ObfuscatedName("nb.a(IIIIII)V")
	public static void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = world.wallType(arg0, arg1, arg4);
		if (var5 != 0) {
			int var6 = world.typecode2(arg0, arg1, arg4, var5);
			int var7 = var6 & 0x1F;
			int var8 = var6 >> 6 & 0x3;
			int var9 = arg2;
			if (var5 > 0) {
				var9 = arg3;
			}
			int var10 = (103 - arg4) * 4 * 512 + arg1 * 4 + 24624;
			int var11 = var5 >> 14 & 0x7FFF;
			int[] var12 = minimap.data;
			LocType var13 = LocType.list(var11);
			if (var13.mapscene == -1) {
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
				Pix8 var14 = mapscene[var13.mapscene];
				if (var14 != null) {
					int var15 = (var13.width * 4 - var14.wi) / 2;
					int var16 = (var13.length * 4 - var14.hi) / 2;
					var14.plotSprite(arg1 * 4 + var15 + 48, 48 - -((-arg4 + 104 - var13.length) * 4) + var16);
				}
			}
		}
		int var17 = world.sceneType(arg0, arg1, arg4);
		if (var17 != 0) {
			int var18 = world.typecode2(arg0, arg1, arg4, var17);
			int var19 = var17 >> 14 & 0x7FFF;
			int var20 = var18 >> 6 & 0x3;
			LocType var21 = LocType.list(var19);
			int var22 = var18 & 0x1F;
			if (var21.mapscene != -1) {
				Pix8 var23 = mapscene[var21.mapscene];
				if (var23 != null) {
					int var24 = (var21.length * 4 - var23.hi) / 2;
					int var25 = (var21.width * 4 - var23.wi) / 2;
					var23.plotSprite(arg1 * 4 + var25 + 48, 48 - (-((-var21.length + 104 + -arg4) * 4) + -var24));
				}
			} else if (var22 == 9) {
				int[] var26 = minimap.data;
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
		int var29 = world.gdType(arg0, arg1, arg4);
		if (var29 != 0) {
			int var30 = var29 >> 14 & 0x7FFF;
			LocType var31 = LocType.list(var30);
			if (var31.mapscene != -1) {
				Pix8 var32 = mapscene[var31.mapscene];
				if (var32 != null) {
					int var33 = (var31.width * 4 - var32.wi) / 2;
					int var34 = (var31.length * 4 - var32.hi) / 2;
					var32.plotSprite(arg1 * 4 + var33 + 48, (104 - (arg4 - -var31.length)) * 4 + var34 + 48);
				}
			}
		}
	}

	@ObfuscatedName("se.a(BLqd;)V")
	public static void clientComponent(IfType arg0) {
		int var1 = arg0.clientCode;
		if (var1 >= 1 && var1 <= 100 || var1 >= 701 && var1 <= 800) {
			if (var1 == 1 && friendServerStatus == 0) {
				arg0.text = Text.field726;
				arg0.buttonType = 0;
			} else if (var1 == 1 && friendServerStatus == 1) {
				arg0.text = Text.field3219;
				arg0.buttonType = 0;
			} else if (var1 == 2 && friendServerStatus != 2) {
				arg0.buttonType = 0;
				arg0.text = Text.PLEASEWAIT;
			} else {
				int var2 = friendCount;
				if (var1 > 700) {
					var1 -= 601;
				} else {
					var1--;
				}
				if (friendServerStatus != 2) {
					var2 = 0;
				}
				if (var2 <= var1) {
					arg0.text = EMPTY;
					arg0.buttonType = 0;
				} else {
					arg0.text = friendUsername[var1];
					arg0.buttonType = 1;
				}
			}
		} else if (var1 >= 101 && var1 <= 200 || var1 >= 801 && var1 <= 900) {
			if (var1 <= 800) {
				var1 -= 101;
			} else {
				var1 -= 701;
			}
			int var3 = friendCount;
			if (friendServerStatus != 2) {
				var3 = 0;
			}
			if (var1 >= var3) {
				arg0.text = EMPTY;
				arg0.buttonType = 0;
			} else {
				if (friendWorld[var1] == 0) {
					arg0.text = JagString.join(new JagString[]{field1383, Text.field1593});
				} else if (friendWorld[var1] < 5000) {
					if (friendWorld[var1] == worldid) {
						arg0.text = JagString.join(new JagString[]{field2564, Text.field1407, JagString.parseInt(friendWorld[var1])});
					} else {
						arg0.text = JagString.join(new JagString[]{field2699, Text.field1407, JagString.parseInt(friendWorld[var1])});
					}
				} else if (friendWorld[var1] == worldid) {
					arg0.text = JagString.join(new JagString[]{field2564, Text.field507, JagString.parseInt(friendWorld[var1] - 5000)});
				} else {
					arg0.text = JagString.join(new JagString[]{field2699, Text.field507, JagString.parseInt(friendWorld[var1] - 5000)});
				}
				arg0.buttonType = 1;
			}
		} else if (var1 == 203) {
			int var4 = friendCount;
			if (friendServerStatus != 2) {
				var4 = 0;
			}
			arg0.scrollPos = var4 * 15 + 20;
			if (arg0.height >= arg0.scrollPos) {
				arg0.scrollPos = arg0.height + 1;
			}
		} else if (var1 >= 401 && var1 <= 500) {
			var1 -= 401;
			if (var1 == 0 && friendServerStatus == 0) {
				arg0.text = Text.field2431;
				arg0.buttonType = 0;
			} else if (var1 == 1 && friendServerStatus == 0) {
				arg0.text = Text.PLEASEWAIT;
				arg0.buttonType = 0;
			} else {
				int var5 = ignoreCount;
				if (friendServerStatus == 0) {
					var5 = 0;
				}
				if (var5 <= var1) {
					arg0.buttonType = 0;
					arg0.text = EMPTY;
				} else {
					arg0.text = JString.toScreenName(ignoreUserhash[var1]).toRawUsername();
					arg0.buttonType = 1;
				}
			}
		} else if (var1 == 503) {
			arg0.scrollPos = ignoreCount * 15 + 20;
			if (arg0.height >= arg0.scrollPos) {
				arg0.scrollPos = arg0.height + 1;
			}
		} else if (var1 == 324) {
			if (idkDesignButton1 == -1) {
				idkDesignButton1 = arg0.graphic;
				idkDesignButton2 = arg0.graphic2;
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
			arg0.model1Id = 0;
			arg0.model1Type = 5;
		} else if (var1 == 328) {
			arg0.modelXAn = 150;
			arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			arg0.model1Id = 1;
			arg0.model1Type = 5;
		} else if (var1 == 600) {
			arg0.text = JagString.join(new JagString[]{reportAbuseInput, field3059});
		} else if (var1 == 620) {
			if (staffmodlevel < 1) {
				arg0.text = EMPTY;
			} else if (reportAbuseMuteOption) {
				arg0.colour = 16711680;
				arg0.text = Text.field1094;
			} else {
				arg0.colour = 16777215;
				arg0.text = Text.field2308;
			}
		}
	}

	@ObfuscatedName("hc.a(BI)V")
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
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var10 = 1; var10 < 103; var10++) {
				if ((ClientBuild.mapl[arg0][var10][var9] & 0x18) == 0) {
					drawDetail(arg0, var10, var7, var8, var9);
				}
				if (arg0 < 3 && (ClientBuild.mapl[arg0 + 1][var10][var9] & 0x8) != 0) {
					drawDetail(arg0 + 1, var10, var7, var8, var9);
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
					if (var15 >= 0) {
						int var16 = var12;
						int var17 = var11;
						if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
							int[][] var18 = collision[minusedlevel].flags;
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
						activeMapFunctions[activeMapFunctionCount] = mapfunction[var15];
						activeMapFunctionX[activeMapFunctionCount] = var17;
						activeMapFunctionZ[activeMapFunctionCount] = var16;
						activeMapFunctionCount++;
					}
				}
			}
		}
	}

	@ObfuscatedName("m.a(B)V")
	public static void entityOverlays() {
		chatCount = 0;
		for (int var0 = -1; var0 < playerCount + npcCount; var0++) {
			ClientEntity var1;
			if (var0 == -1) {
				var1 = localPlayer;
			} else if (playerCount > var0) {
				var1 = players[playerIds[var0]];
			} else {
				var1 = npc[npcIds[var0 - playerCount]];
			}
			if (var1 != null && var1.ready()) {
				if (var1 instanceof ClientNpc) {
					NpcType var2 = ((ClientNpc) var1).type;
					if (var2.multinpc != null) {
						var2 = var2.getMultiNpc();
					}
					if (var2 == null) {
						continue;
					}
				}
				if (var0 >= playerCount) {
					NpcType var3 = ((ClientNpc) var1).type;
					if (var3.headicon >= 0 && var3.headicon < headiconsPrayer.length) {
						getOverlayPos(var1.height + 15, var1);
						if (projectX > -1) {
							headiconsPrayer[var3.headicon].plotSprite(projectX - 12, projectY + -30);
						}
					}
					if (hintType == 1 && npcIds[var0 - playerCount] == hintNpc && loopCycle % 20 < 10) {
						getOverlayPos(var1.height + 15, var1);
						if (projectX > -1) {
							headiconsHint[0].plotSprite(projectX - 12, projectY + -28);
						}
					}
				} else {
					ClientPlayer var4 = (ClientPlayer) var1;
					int var5 = 30;
					if (var4.headiconPk != -1 || var4.headiconPrayer != -1) {
						getOverlayPos(var1.height + 15, var1);
						if (projectX > -1) {
							if (var4.headiconPk != -1) {
								headiconsPk[var4.headiconPk].plotSprite(projectX - 12, projectY - 30);
								var5 += 25;
							}
							if (var4.headiconPrayer != -1) {
								headiconsPrayer[var4.headiconPrayer].plotSprite(projectX - 12, -var5 + projectY);
								var5 += 25;
							}
						}
					}
					if (var0 >= 0 && hintType == 10 && playerIds[var0] == hintPlayer) {
						getOverlayPos(var1.height + 15, var1);
						if (projectX > -1) {
							headiconsHint[1].plotSprite(projectX - 12, -var5 + projectY);
						}
					}
				}
				if (var1.chat != null && (var0 >= playerCount || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var1).name))) {
					getOverlayPos(var1.height, var1);
					if (projectX > -1 && MAX_CHATS > chatCount) {
						chatWidth[chatCount] = b12.stringWid(var1.chat) / 2;
						chatHeight[chatCount] = b12.ascent;
						chatX[chatCount] = projectX;
						chatY[chatCount] = projectY;
						chatColour[chatCount] = var1.chatColour;
						chatEffect[chatCount] = var1.chatEffect;
						chatTimer[chatCount] = var1.chatTimer;
						chat[chatCount] = var1.chat;
						chatCount++;
					}
				}
				if (loopCycle < var1.combatCycle) {
					getOverlayPos(var1.height + 15, var1);
					if (projectX > -1) {
						int var6 = var1.field2004 * 30 / var1.field1975;
						if (var6 > 30) {
							var6 = 30;
						}
						Pix2D.fillRect(projectX - 15, projectY + -3, var6, 5, 65280);
						Pix2D.fillRect(projectX + var6 - 15, projectY + -3, 30 - var6, 5, 16711680);
					}
				}
				for (int var7 = 0; var7 < 4; var7++) {
					if (loopCycle < var1.damageCycles[var7]) {
						getOverlayPos(var1.height / 2, var1);
						if (projectX > -1) {
							if (var7 == 1) {
								projectY -= 20;
							}
							if (var7 == 2) {
								projectX -= 15;
								projectY -= 10;
							}
							if (var7 == 3) {
								projectX += 15;
								projectY -= 10;
							}
							hitmarks[var1.damageTypes[var7]].plotSprite(projectX - 12, projectY + -12);
							p11.centreString(JagString.parseInt(var1.damageValues[var7]), projectX, projectY + 4, 0);
							p11.centreString(JagString.parseInt(var1.damageValues[var7]), projectX - 1, projectY + 3, 16777215);
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < chatCount; var8++) {
			int var9 = chatX[var8];
			int var10 = chatY[var8];
			int var11 = chatWidth[var8];
			int var12 = chatHeight[var8];
			boolean var13 = true;
			while (var13) {
				var13 = false;
				for (int var14 = 0; var14 < var8; var14++) {
					if (chatY[var14] - chatHeight[var14] < var10 + 2 && var10 - var12 < chatY[var14] + 2 && var9 - var11 < chatX[var14] + chatWidth[var14] && var9 + var11 > chatX[var14] + -chatWidth[var14] && var10 > chatY[var14] - chatHeight[var14]) {
						var13 = true;
						var10 = chatY[var14] - chatHeight[var14];
					}
				}
			}
			projectX = chatX[var8];
			projectY = chatY[var8] = var10;
			JagString var15 = chat[var8];
			if (chatEffects == 0) {
				int var16 = 16776960;
				if (chatColour[var8] < 6) {
					var16 = CHAT_COLOURS[chatColour[var8]];
				}
				if (chatColour[var8] == 6) {
					var16 = sceneCycle % 20 >= 10 ? 16776960 : 16711680;
				}
				if (chatColour[var8] == 7) {
					var16 = sceneCycle % 20 < 10 ? 255 : 65535;
				}
				if (chatColour[var8] == 8) {
					var16 = sceneCycle % 20 >= 10 ? 8454016 : 45056;
				}
				if (chatColour[var8] == 9) {
					int var17 = 150 - chatTimer[var8];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}
				if (chatColour[var8] == 10) {
					int var18 = 150 - chatTimer[var8];
					if (var18 < 50) {
						var16 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var16 = 16711935 + 16384000 - var18 * 327680;
					} else if (var18 < 150) {
						var16 = (var18 - 100) * 327680 + 255 + 500 - var18 * 5;
					}
				}
				if (chatColour[var8] == 11) {
					int var19 = 150 - chatTimer[var8];
					if (var19 < 50) {
						var16 = 16777215 - var19 * 327685;
					} else if (var19 < 100) {
						var16 = (var19 - 50) * 327685 + 65280;
					} else if (var19 < 150) {
						var16 = 16777215 - (var19 - 100) * 327680;
					}
				}
				if (chatEffect[var8] == 0) {
					b12.centreString(var15, projectX, projectY + 1, 0);
					b12.centreString(var15, projectX, projectY, var16);
				}
				if (chatEffect[var8] == 1) {
					b12.centreStringWave(var15, projectX, projectY + 1, 0, sceneCycle);
					b12.centreStringWave(var15, projectX, projectY, var16, sceneCycle);
				}
				if (chatEffect[var8] == 2) {
					b12.centreStringWave2(var15, projectX, projectY + 1, 0, sceneCycle);
					b12.centreStringWave2(var15, projectX, projectY, var16, sceneCycle);
				}
				if (chatEffect[var8] == 3) {
					b12.centreStringWave3(var15, projectX, projectY + 1, 0, sceneCycle, 150 - chatTimer[var8]);
					b12.centreStringWave3(var15, projectX, projectY, var16, sceneCycle, 150 - chatTimer[var8]);
				}
				if (chatEffect[var8] == 4) {
					int var20 = b12.stringWid(var15);
					int var21 = (150 - chatTimer[var8]) * (var20 + 100) / 150;
					Pix2D.setSubClipping(projectX - 50, 0, projectX + 50, 334);
					b12.drawString(var15, projectX + 50 - var21, projectY + 1, 0);
					b12.drawString(var15, projectX + 50 - var21, projectY, var16);
					Pix2D.setClipping();
				}
				if (chatEffect[var8] == 5) {
					int var22 = 0;
					int var23 = 150 - chatTimer[var8];
					Pix2D.setSubClipping(0, projectY - b12.ascent - 1, 512, projectY + 5);
					if (var23 < 25) {
						var22 = var23 - 25;
					} else if (var23 > 125) {
						var22 = var23 - 125;
					}
					b12.centreString(var15, projectX, projectY + var22 + 1, 0);
					b12.centreString(var15, projectX, projectY + var22, var16);
					Pix2D.setClipping();
				}
			} else {
				b12.centreString(var15, projectX, projectY + 1, 0);
				b12.centreString(var15, projectX, projectY, 16776960);
			}
		}
	}

	@ObfuscatedName("qa.g(I)V")
	public static void getPlayerPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
			ClientPlayer var2 = players[var1];
			int var3 = in.g1();
			if ((var3 & 0x2) != 0) {
				var3 += in.g1() << 8;
			}
			getPlayerPosExtended(var2, var3, var1);
		}
	}

	@ObfuscatedName("ac.a(Laa;BII)V")
	public static void getPlayerPosExtended(ClientPlayer arg0, int arg1, int arg2) {
		if ((arg1 & 0x100) != 0) {
			// DAMAGE
			int var3 = in.g1_alt3();
			int var4 = in.g1_alt1();
			arg0.addHitmark(var4, loopCycle, var3);
			arg0.combatCycle = loopCycle + 300;
			arg0.field2004 = in.g1_alt3();
			arg0.field1975 = in.g1_alt1();
		}
		if ((arg1 & 0x10) != 0) {
			// FACESQUARE
			arg0.targetTileX = in.g2();
			arg0.targetTileZ = in.g2_alt1();
		}
		if ((arg1 & 0x1) != 0) {
			// ANIM
			int var5 = in.g2_alt1();
			if (var5 == 65535) {
				var5 = -1;
			}
			int var6 = in.g1_alt2();
			triggerPlayerAnim(var5, var6, arg0);
		}
		if ((arg1 & 0x4) != 0) {
			// FACEENTITY
			arg0.targetId = in.g2_alt2();
			if (arg0.targetId == 65535) {
				arg0.targetId = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			// HITMARK2
			int var7 = in.g1();
			int var8 = in.g1_alt1();
			arg0.addHitmark(var8, loopCycle, var7);
			arg0.combatCycle = loopCycle + 300;
			arg0.field2004 = in.g1_alt1();
			arg0.field1975 = in.g1_alt1();
		}
		if ((arg1 & 0x400) != 0) {
			// EXACTMOVE
			arg0.exactStartX = in.g1_alt3();
			arg0.exactStartZ = in.g1_alt3();
			arg0.field1973 = in.g1();
			arg0.field2001 = in.g1();
			arg0.exactMoveEnd = in.g2_alt2() + loopCycle;
			arg0.exactMoveStart = in.g2_alt3() + loopCycle;
			arg0.exactMoveFacing = in.g1_alt1();
			arg0.abortRoute();
		}
		if ((arg1 & 0x8) != 0) {
			// CHAT
			int var9 = in.g2();
			int var10 = in.g1_alt1();
			int var11 = in.g1_alt2();
			int var12 = in.pos;
			if (arg0.name != null && arg0.model != null) {
				long var13 = arg0.name.toUserhash();
				boolean var15 = false;
				if (var10 <= 1) {
					for (int var16 = 0; var16 < ignoreCount; var16++) {
						if (ignoreUserhash[var16] == var13) {
							var15 = true;
							break;
						}
					}
				}
				if (!var15 && chatDisabled == 0) {
					tempP.pos = 0;
					in.gdata_alt2(tempP.data, var11);
					tempP.pos = 0;
					JagString var17 = WordPack.method893(tempP).forceCapitalisationOfWords();
					arg0.chat = var17.trim();
					arg0.chatTimer = 150;
					arg0.chatEffect = var9 & 0xFF;
					arg0.chatColour = var9 >> 8;
					if (var10 == 2 || var10 == 3) {
						addChat(1, var17, JagString.join(new JagString[]{field2535, arg0.name}));
					} else if (var10 == 1) {
						addChat(1, var17, JagString.join(new JagString[]{field2612, arg0.name}));
					} else {
						addChat(2, var17, arg0.name);
					}
				}
			}
			in.pos = var11 + var12;
		}
		if ((arg1 & 0x20) != 0) {
			// APPEARANCE
			int var18 = in.g1();
			byte[] var19 = new byte[var18];
			Packet var20 = new Packet(var19);
			in.gdata(var19, var18);
			playerAppearanceBuffer[arg2] = var20;
			arg0.setAppearance(var20);
		}
		if ((arg1 & 0x200) != 0) {
			// SPOTANIM
			arg0.spotanimId = in.g2_alt1();
			int var21 = in.g4_alt3();
			arg0.spotanimCycle = 0;
			arg0.spotanimLastCycle = (var21 & 0xFFFF) + loopCycle;
			if (arg0.spotanimId == 65535) {
				arg0.spotanimId = -1;
			}
			arg0.spotanimFrame = 0;
			arg0.field1984 = var21 >> 16;
			if (arg0.spotanimLastCycle > loopCycle) {
				arg0.spotanimFrame = -1;
			}
		}
		if ((arg1 & 0x80) != 0) {
			// SAY
			arg0.chat = in.gjstr();
			if (arg0.chat.charAt(0) == 126) {
				arg0.chat = arg0.chat.substring(1);
				addChat(2, arg0.chat, arg0.name);
			} else if (localPlayer == arg0) {
				addChat(2, arg0.chat, arg0.name);
			}
			arg0.chatTimer = 150;
			arg0.chatColour = 0;
			arg0.chatEffect = 0;
		}
	}

	@ObfuscatedName("l.a(B)V")
	public static void getPlayerPosOldVis() {
		int var0 = in.gBit(8);
		if (playerCount > var0) {
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

	@ObfuscatedName("client.a(IIIIIIII[Lqd;Z)Z")
	public static boolean drawLayer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, IfType[] arg8) {
		Pix2D.setSubClipping(arg2, arg1, arg6, arg5);
		boolean var9 = true;
		for (int var10 = 0; var10 < arg8.length; var10++) {
			IfType var11 = arg8[var10];
			if (var11 != null && var11.layerId == arg4) {
				if (var11.clientCode > 0) {
					clientComponent(var11);
				}
				int var12 = var11.x + arg2;
				if (!var11.field2500) {
					var12 -= arg3;
				}
				int var13 = var11.y + arg1;
				if (!var11.field2500) {
					var13 -= arg7;
				}
				int var14 = var11.trans;
				if (field548 == var11) {
					var14 = 128;
					IfType var15 = getDragLayer(var11);
					int[] var16 = getComponentPosition(var15);
					int[] var17 = getComponentPosition(var11);
					int var18 = var17[1] + ClientMouseListener.mouseY - var16[1] - field2392;
					if (var18 < 0) {
						var18 = 0;
					}
					if (var18 + var11.height > var15.height) {
						var18 = var15.height - var11.height;
					}
					var13 = var16[1] + var18;
					int var19 = ClientMouseListener.mouseX + var17[0] - var16[0] - field419;
					if (var19 < 0) {
						var19 = 0;
					}
					if (var19 + var11.width > var15.width) {
						var19 = var15.width - var11.width;
					}
					var12 = var16[0] + var19;
				}
				if (!var11.v3 || Pix2D.clipMaxX >= var12 && Pix2D.clipMaxY >= var13 && Pix2D.clipMinX <= var11.width + var12 && var13 + var11.height >= Pix2D.clipMinY) {
					if (var11.type == 0) {
						if (var11.hide && !overComVisible(arg0, var10)) {
							continue;
						}
						if (!var11.v3) {
							if (var11.scrollPos - var11.height < var11.scrollPosY) {
								var11.scrollPosY = var11.scrollPos - var11.height;
							}
							if (var11.scrollPosY < 0) {
								var11.scrollPosY = 0;
							}
						}
						var9 &= drawLayer(arg0, var13, var12, var11.scrollPosX, var10, var11.height + var13, var11.width + var12, var11.scrollPosY, arg8);
						if (var11.subcomponents != null) {
							var9 &= drawLayer(arg0, var13, var12, var11.scrollPosX, var11.parentId, var13 + var11.height, var11.width + var12, var11.scrollPosY, var11.subcomponents);
						}
						Pix2D.setSubClipping(arg2, arg1, arg6, arg5);
						if (var11.height < var11.scrollPos) {
							drawScrollbar(var11.scrollPosY, var11.scrollPos, var11.width + var12, var11.height, var13);
						}
					}
					if (var11.type == 1) {
						continue;
					}
					if (var11.type == 2) {
						int var20 = 0;
						for (int var21 = 0; var21 < var11.height; var21++) {
							for (int var22 = 0; var22 < var11.width; var22++) {
								int var23 = (var11.marginX + 32) * var22 + var12;
								int var24 = (var11.marginY + 32) * var21 + var13;
								if (var20 < 20) {
									var23 += var11.invBackgroundX[var20];
									var24 += var11.invBackgroundY[var20];
								}
								if (var11.linkObjType[var20] > 0) {
									int var26 = 0;
									int var27 = var11.linkObjType[var20] - 1;
									int var28 = 0;
									if (Pix2D.clipMinX - 32 < var23 && var23 < Pix2D.clipMaxX && Pix2D.clipMinY - 32 < var24 && Pix2D.clipMaxY > var24 || objDragArea != 0 && objDragSlot == var20) {
										int var29 = 0;
										if (useMode == 1 && objSelectedSlot == var20 && useSelectedComId == var11.parentId) {
											var29 = 16777215;
										}
										Pix32 var30 = ObjType.getSprite(var11.linkObjNumber[var20], var27, var29);
										if (var30 == null) {
											var9 = false;
										} else {
											if (objDragArea != 0 && objDragSlot == var20 && objDragComId == var11.parentId) {
												var28 = ClientMouseListener.mouseY - objGrabY;
												var26 = ClientMouseListener.mouseX - objGrabX;
												if (var26 < 5 && var26 > -5) {
													var26 = 0;
												}
												if (var28 < 5 && var28 > -5) {
													var28 = 0;
												}
												if (objDragCycles < 5) {
													var28 = 0;
													var26 = 0;
												}
												var30.transPlotSprite(var23 + var26, var24 + var28, 128);
												if (arg4 != -1) {
													IfType var31 = arg8[arg4];
													if (var24 + var28 < Pix2D.clipMinY && var31.scrollPosY > 0) {
														int var32 = (Pix2D.clipMinY - var24 - var28) * worldUpdateNum / 3;
														if (worldUpdateNum * 10 < var32) {
															var32 = worldUpdateNum * 10;
														}
														if (var32 > var31.scrollPosY) {
															var32 = var31.scrollPosY;
														}
														var31.scrollPosY -= var32;
														objGrabY += var32;
													}
													if (Pix2D.clipMaxY < var24 + var28 + 32 && var31.scrollPosY < var31.scrollPos - var31.height) {
														int var33 = (var24 + var28 + 32 - Pix2D.clipMaxY) * worldUpdateNum / 3;
														if (worldUpdateNum * 10 < var33) {
															var33 = worldUpdateNum * 10;
														}
														if (var31.scrollPos - var31.scrollPosY - var31.height < var33) {
															var33 = var31.scrollPos - var31.height - var31.scrollPosY;
														}
														objGrabY -= var33;
														var31.scrollPosY += var33;
													}
												}
											} else if (selectedArea != 0 && selectedItem == var20 && selectedComId == var11.parentId) {
												var30.transPlotSprite(var23, var24, 128);
											} else {
												var30.plotSprite(var23, var24);
											}
											if (var30.owi == 33 || var11.linkObjNumber[var20] != 1) {
												int var34 = var11.linkObjNumber[var20];
												p11.drawString(ObjType.invNumber(var34), var23 + var26 + 1, var24 + 10 - -var28, 0);
												p11.drawString(ObjType.invNumber(var34), var23 + var26, var24 - -9 + var28, 16776960);
											}
										}
									}
								} else if (var11.invBackground != null && var20 < 20) {
									Pix32 var25 = var11.getInvBackground(var20);
									if (var25 != null) {
										var25.plotSprite(var23, var24);
									} else if (IfType.loadingAsset) {
										var9 = false;
									}
								}
								var20++;
							}
						}
					} else if (var11.type == 3) {
						int var35;
						if (getIfActive(var11)) {
							var35 = var11.colour2;
							if (overComVisible(arg0, var10) && var11.colour2Over != 0) {
								var35 = var11.colour2Over;
							}
						} else {
							var35 = var11.colour;
							if (overComVisible(arg0, var10) && var11.colourOver != 0) {
								var35 = var11.colourOver;
							}
						}
						if (var14 == 0) {
							if (var11.fill) {
								Pix2D.fillRect(var12, var13, var11.width, var11.height, var35);
							} else {
								Pix2D.drawRect(var12, var13, var11.width, var11.height, var35);
							}
						} else if (var11.fill) {
							Pix2D.fillRectTrans(var12, var13, var11.width, var11.height, var35, 256 - (var14 & 0xFF));
						} else {
							Pix2D.drawRectTrans(var12, var13, var11.width, var11.height, var35, 256 - (var14 & 0xFF));
						}
					} else if (var11.type == 4) {
						PixFont var36 = var11.getFont();
						if (var36 != null) {
							JagString var37 = var11.text;
							int var38;
							if (getIfActive(var11)) {
								var38 = var11.colour2;
								if (overComVisible(arg0, var10) && var11.colour2Over != 0) {
									var38 = var11.colour2Over;
								}
								if (var11.text2.length() > 0) {
									var37 = var11.text2;
								}
							} else {
								var38 = var11.colour;
								if (overComVisible(arg0, var10) && var11.colourOver != 0) {
									var38 = var11.colourOver;
								}
							}
							if (var11.v3 && var11.invobject != -1) {
								ObjType var39 = ObjType.list(var11.invobject);
								var37 = var39.name;
								if (var37 == null) {
									var37 = NULL;
								}
								if (var39.stackable == 1 || var11.invcount != 1) {
									var37 = JagString.join(new JagString[]{var37, field1649, niceNumber(var11.invcount)});
								}
							}
							if (var11.buttonType == 6 && resumePauseComId == var11.parentId) {
								var38 = var11.colour;
								var37 = Text.PLEASEWAIT;
							}
							if (Pix2D.width == 479) {
								if (var38 == 16776960) {
									var38 = 255;
								}
								if (var38 == 49152) {
									var38 = 16777215;
								}
							}
							JagString var40 = substituteVars(var11, var37);
							var36.drawStringMultiline(var40, var12, var13, var11.width, var11.height, var38, var11.shadow, var11.hAlign, var11.vAlign, var11.lineHeight);
						} else if (IfType.loadingAsset) {
							var9 = false;
						}
					} else if (var11.type == 5) {
						if (var11.v3) {
							int var42 = 0;
							int var43 = 0;
							Pix32 var44;
							if (var11.invobject == -1) {
								var44 = var11.getGraphic(false);
							} else {
								var44 = ObjType.getSprite(var11.invcount, var11.invobject, 0);
								var42 = var44.owi;
								var43 = var44.ohi;
								var44.ohi = 32;
								var44.owi = 32;
							}
							if (var44 != null) {
								int var45 = var44.hi;
								int var46 = var44.wi;
								if (var11.tiling) {
									int[] var48 = new int[4];
									Pix2D.saveClipping(var48);
									int var49 = var12;
									if (var48[0] > var12) {
										var49 = var48[0];
									}
									int var50 = var13;
									if (var48[1] > var13) {
										var50 = var48[1];
									}
									int var51 = var11.width + var12;
									if (var48[2] < var51) {
										var51 = var48[2];
									}
									int var52 = var11.height + var13;
									if (var52 > var48[3]) {
										var52 = var48[3];
									}
									Pix2D.setSubClipping(var49, var50, var51, var52);
									int var53 = (var11.width + var46 - 1) / var46;
									int var54 = (var11.height + var45 - 1) / var45;
									for (int var55 = 0; var55 < var53; var55++) {
										for (int var56 = 0; var56 < var54; var56++) {
											if (var11.rotate != 0) {
												var44.pixelPerfectRotateScalePlotSprite(var46 / 2 + var46 * var55 + var12, var45 / 2 + (var13 - -(var45 * var56)), var11.rotate, 4096);
											} else if (var14 == 0) {
												var44.plotSprite(var46 * var55 + var12, var45 * var56 + var13);
											} else {
												var44.transPlotSprite(var12 + var46 * var55, var13 - -(var45 * var56), 256 - (var14 & 0xFF));
											}
										}
									}
									Pix2D.method914(var48);
								} else {
									int var47 = var11.width * 4096 / var46;
									if (var11.rotate != 0) {
										var44.pixelPerfectRotateScalePlotSprite(var11.width / 2 + var12, var11.height / 2 + var13, var11.rotate, var47);
									} else if (var14 != 0) {
										var44.transScalePlotSprite(var12, var13, var11.width, var11.height, 256 - (var14 & 0xFF));
									} else if (var11.width == var46 && var11.height == var45) {
										var44.plotSprite(var12, var13);
									} else {
										var44.scalePlotSprite(var12, var13, var11.width, var11.height);
									}
								}
							} else if (IfType.loadingAsset) {
								var9 = false;
							}
							if (var11.invobject != -1) {
								if (var11.invcount != 1 || var42 == 33) {
									p11.drawString(JagString.parseInt(var11.invcount), var12 + 1, var13 + 10, 0);
									p11.drawString(JagString.parseInt(var11.invcount), var12, var13 + 9, 16776960);
								}
								var44.owi = var42;
								var44.ohi = var43;
							}
						} else {
							Pix32 var41 = var11.getGraphic(getIfActive(var11));
							if (var41 != null) {
								var41.plotSprite(var12, var13);
							} else if (IfType.loadingAsset) {
								var9 = false;
							}
						}
					} else if (var11.type == 6) {
						boolean var57 = getIfActive(var11);
						int var58;
						if (var57) {
							var58 = var11.modelAnim2;
						} else {
							var58 = var11.modelAnim;
						}
						Model var59;
						if (var11.model1Type == 5) {
							if (var11.model1Id == 0) {
								var59 = idkDesign.getTempModel(null, null, -1, -1);
							} else {
								var59 = localPlayer.getTempModel();
							}
						} else if (var58 == -1) {
							var59 = var11.getTempModel(null, -1, var57, localPlayer.model);
							if (var59 == null && IfType.loadingAsset) {
								var9 = false;
							}
						} else {
							SeqType var60 = SeqType.list(var58);
							var59 = var11.getTempModel(var60, var11.animFrame, var57, localPlayer.model);
							if (var59 == null && IfType.loadingAsset) {
								var9 = false;
							}
						}
						int var61 = var11.modelXAn;
						int var62 = var11.modelZAn;
						int var63 = var11.modelYOf;
						int var64 = var11.modelYAn;
						int var65 = var11.modelXOf;
						int var66 = var11.modelZoom;
						if (var11.invobject != -1) {
							ObjType var67 = ObjType.list(var11.invobject);
							if (var67 != null) {
								ObjType var68 = var67.getStackSizeAlt(var11.invcount);
								var59 = var68.getModelLit(true, 1);
								var62 = var68.zan2d;
								var63 = var68.yof2d;
								var65 = var68.xof2d;
								var61 = var68.xan2d;
								var66 = var68.zoom2d;
								var64 = var68.yan2d;
								if (var11.width > 0) {
									var66 = var66 * 32 / var11.width;
								}
							}
						}
						Pix3D.setOrigin(var11.width / 2 + var12, var11.height / 2 + var13);
						int var69 = Pix3D.sinTable[var61] * var66 >> 16;
						int var70 = Pix3D.cosTable[var61] * var66 >> 16;
						if (var59 != null) {
							if (var11.v3) {
								var59.calcBoundingCylinder();
								if (var11.orthog) {
									var59.objRenderOrthog(var64, var62, var61, var65, var59.minY / 2 + var63 + var69, var70 - -var63, var66);
								} else {
									var59.objRender(var64, var62, var61, var65, var59.minY / 2 + var69 + var63, var63 + var70);
								}
							} else {
								var59.objRender(var64, 0, var61, 0, var69, var70);
							}
						}
						Pix3D.setRenderClipping();
					} else {
						if (var11.type == 7) {
							PixFont var71 = var11.getFont();
							if (var71 == null) {
								if (IfType.loadingAsset) {
									var9 = false;
								}
								continue;
							}
							int var72 = 0;
							for (int var73 = 0; var73 < var11.height; var73++) {
								for (int var74 = 0; var74 < var11.width; var74++) {
									if (var11.linkObjType[var72] > 0) {
										ObjType var75 = ObjType.list(var11.linkObjType[var72] - 1);
										JagString var76 = var75.name;
										if (var76 == null) {
											var76 = NULL;
										}
										if (var75.stackable == 1 || var11.linkObjNumber[var72] != 1) {
											var76 = JagString.join(new JagString[]{var76, field1649, niceNumber(var11.linkObjNumber[var72])});
										}
										int var77 = (var11.marginX + 115) * var74 + var12;
										int var78 = (var11.marginY + 12) * var73 + var13;
										if (var11.hAlign == 0) {
											var71.drawString(var76, var77, var78, var11.colour, var11.shadow);
										} else if (var11.hAlign == 1) {
											var71.centreString(var76, var11.width / 2 + var77, var78, var11.colour, var11.shadow);
										} else {
											var71.rightString(var76, var11.width + var77 - 1, var78, var11.colour, var11.shadow);
										}
									}
									var72++;
								}
							}
						}
						if (var11.type == 8 && tooltipComVisible(arg0, var10) && tooltipNum == tooltipRedraw) {
							int var79 = 0;
							int var80 = 0;
							PixFont var81 = p12;
							JagString var82 = var11.text;
							JagString var83 = substituteVars(var11, var82);
							while (var83.length() > 0) {
								int var84 = var83.indexOf(StringConstants.TAG_BREAK);
								JagString var85;
								if (var84 == -1) {
									var85 = var83;
									var83 = EMPTY;
								} else {
									var85 = var83.substring(0, var84);
									var83 = var83.substring(var84 + 2);
								}
								int var86 = var81.stringWidTag(var85);
								var80 += var81.ascent + 1;
								if (var79 < var86) {
									var79 = var86;
								}
							}
							var80 += 7;
							int var87 = var11.height + var13 + 5;
							if (var80 + var87 > arg5) {
								var87 = arg5 - var80;
							}
							var79 += 6;
							int var88 = var11.width + var12 - var79 - 5;
							if (var88 < var12 + 5) {
								var88 = var12 + 5;
							}
							if (var79 + var88 > arg6) {
								var88 = arg6 - var79;
							}
							Pix2D.fillRect(var88, var87, var79, var80, 16777120);
							Pix2D.drawRect(var88, var87, var79, var80, 0);
							JagString var89 = var11.text;
							int var90 = var87 + var81.ascent + 2;
							JagString var91 = substituteVars(var11, var89);
							while (var91.length() > 0) {
								int var92 = var91.indexOf(StringConstants.TAG_BREAK);
								JagString var93;
								if (var92 == -1) {
									var93 = var91;
									var91 = EMPTY;
								} else {
									var93 = var91.substring(0, var92);
									var91 = var91.substring(var92 + 2);
								}
								var81.drawString(var93, var88 + 3, var90, 0, false);
								var90 += var81.ascent + 1;
							}
						}
						if (var11.type == 9) {
							Pix2D.line(var12, var13, var11.width + var12, var11.height + var13, var11.colour);
						}
					}
				}
			}
		}
		return var9;
	}

	@ObfuscatedName("t.a(ZLnb;)V")
	public static void entityAnim(ClientEntity arg0) {
		arg0.needsForwardDrawPadding = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var1 = SeqType.list(arg0.secondarySeqId);
			if (var1 == null || var1.frames == null) {
				arg0.secondarySeqId = -1;
			} else {
				arg0.secondarySeqCycle++;
				if (arg0.secondarySeqFrame < var1.frames.length && var1.delay[arg0.secondarySeqFrame] < arg0.secondarySeqCycle) {
					arg0.secondarySeqFrame++;
					arg0.secondarySeqCycle = 1;
				}
				if (var1.frames.length <= arg0.secondarySeqFrame) {
					arg0.secondarySeqFrame = 0;
					arg0.secondarySeqCycle = 0;
				}
			}
		}
		if (arg0.spotanimId != -1 && arg0.spotanimLastCycle <= loopCycle) {
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
						arg0.spotanimCycle = 1;
						arg0.spotanimFrame++;
					}
					if (var3.frames.length <= arg0.spotanimFrame && (arg0.spotanimFrame < 0 || var3.frames.length <= arg0.spotanimFrame)) {
						arg0.spotanimId = -1;
					}
				}
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var4 = SeqType.list(arg0.primarySeqId);
			if (var4.postanim_move == 1 && arg0.preanimRouteLength > 0 && arg0.exactMoveEnd <= loopCycle && arg0.exactMoveStart < loopCycle) {
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
				}
				if (var5.frames.length <= arg0.primarySeqFrame) {
					arg0.primarySeqFrame -= var5.loops;
					arg0.primarySeqLoop++;
					if (var5.maxloops <= arg0.primarySeqLoop) {
						arg0.primarySeqId = -1;
					}
					if (arg0.primarySeqFrame < 0 || arg0.primarySeqFrame >= var5.frames.length) {
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
				psize = SERVERPROT_SIZES[ptype];
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
			ptype2 = ptype1;
			timeoutTimer = 0;
			ptype1 = ptype0;
			ptype0 = ptype;
			if (ptype == 71) {
				// MESSAGE_PRIVATE_ECHO
				long var1 = in.g8();
				JagString var3 = WordPack.method893(in).forceCapitalisationOfWords();
				addChat(6, var3, JString.toScreenName(var1).toRawUsername());
				ptype = -1;
				return true;
			}
			if (ptype == 156) {
				// UPDATE_FRIENDLIST
				long var4 = in.g8();
				int var6 = in.g2();
				JagString var7 = JString.toScreenName(var4).toRawUsername();
				for (int var8 = 0; var8 < friendCount; var8++) {
					if (friendUserhash[var8] == var4) {
						if (friendWorld[var8] != var6) {
							friendWorld[var8] = var6;
							redrawSide = true;
							if (var6 > 0) {
								addChat(5, JagString.join(new JagString[]{var7, Text.field2126}), EMPTY);
							}
							if (var6 == 0) {
								addChat(5, JagString.join(new JagString[]{var7, Text.field1510}), EMPTY);
							}
						}
						var7 = null;
						break;
					}
				}
				boolean var9 = false;
				if (var7 != null && friendCount < 200) {
					friendUserhash[friendCount] = var4;
					friendUsername[friendCount] = var7;
					friendWorld[friendCount] = var6;
					friendCount++;
					redrawSide = true;
				}
				while (!var9) {
					var9 = true;
					for (int var10 = 0; var10 < friendCount - 1; var10++) {
						if (friendWorld[var10] != worldid && friendWorld[var10 + 1] == worldid || friendWorld[var10] == 0 && friendWorld[var10 + 1] != 0) {
							var9 = false;
							int var11 = friendWorld[var10];
							friendWorld[var10] = friendWorld[var10 + 1];
							friendWorld[var10 + 1] = var11;
							JagString var12 = friendUsername[var10];
							friendUsername[var10] = friendUsername[var10 + 1];
							friendUsername[var10 + 1] = var12;
							long var13 = friendUserhash[var10];
							friendUserhash[var10] = friendUserhash[var10 + 1];
							friendUserhash[var10 + 1] = var13;
							redrawSide = true;
						}
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 233) {
				// UNSET_MAP_FLAG (unofficial name)
				ptype = -1;
				minimapFlagX = 0;
				return true;
			}
			if (ptype == 7) {
				// CAM_RESET
				cinemaCam = false;
				for (int var15 = 0; var15 < 5; var15++) {
					camShake[var15] = false;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 23) {
				// REBUILD_REGION
				rebuildPacket(true);
				ptype = -1;
				return true;
			}
			if (ptype == 222) {
				// VARP_SMALL
				byte var16 = in.g1b_alt3();
				int var17 = in.g2_alt2();
				VarCache.varServ[var17] = var16;
				if (VarCache.var[var17] != var16) {
					VarCache.var[var17] = var16;
					clientVar(var17);
					redrawSide = true;
					if (tutComId != -1) {
						redrawChat = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 115) {
				// IF_SETHIDE
				boolean var18 = in.g1() == 1;
				int var19 = in.g4_alt3();
				IfType var20 = IfType.get(var19);
				var20.hide = var18;
				ptype = -1;
				return true;
			}
			if (ptype == 12) {
				// UPDATE_INV_FULL
				redrawSide = true;
				int var21 = in.g4();
				IfType var22 = IfType.get(var21);
				if (var22.v3) {
					IfType[] var24 = IfType.list[var21 >> 16];
					for (int var25 = 0; var25 < var24.length; var25++) {
						IfType var26 = var24[var25];
						if ((var22.parentId & 0xFFFF) == (var26.layerId & 0xFFFF) && var26.field2542 > 0) {
							var26.invcount = 0;
							var26.invobject = -1;
						}
					}
				} else {
					for (int var23 = 0; var23 < var22.linkObjType.length; var23++) {
						var22.linkObjType[var23] = 0;
						var22.linkObjNumber[var23] = 0;
					}
				}
				int var27 = in.g2();
				for (int var28 = 0; var28 < var27; var28++) {
					int var29 = in.g1_alt1();
					if (var29 == 255) {
						var29 = in.g4();
					}
					int var30 = in.g2_alt2();
					if (var22.v3) {
						IfType[] var31 = IfType.list[var21 >> 16];
						for (int var32 = 0; var32 < var31.length; var32++) {
							IfType var33 = var31[var32];
							if ((var22.parentId & 0xFFFF) == (var33.layerId & 0xFFFF) && var28 + 1 == var33.field2542) {
								var33.invcount = var29;
								var33.invobject = var30 - 1;
							}
						}
					} else if (var22.linkObjType.length > var28) {
						var22.linkObjType[var28] = var30;
						var22.linkObjNumber[var28] = var29;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 250) {
				// IF_SETMODEL
				int var34 = in.g2_alt1();
				int var35 = in.g4_alt3();
				IfType var36 = IfType.get(var35);
				var36.model1Id = var34;
				var36.model1Type = 1;
				ptype = -1;
				return true;
			}
			if (ptype == 255) {
				// CAM_SHAKE
				int var37 = in.g1();
				int var38 = in.g1();
				int var39 = in.g1();
				int var40 = in.g1();
				camShake[var37] = true;
				camShakeAxis[var37] = var38;
				camShakeRan[var37] = var39;
				camShakeAmp[var37] = var40;
				camShakeCycle[var37] = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 235) {
				// MINIMAP_TOGGLE
				minimapState = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 48) {
				// SET_MULTIWAY
				inMultizone = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 82) {
				// MESSAGE_GAME
				JagString var41 = in.gjstr();
				if (var41.endsWith(AUTO_TRADEREQ)) {
					JagString var53 = var41.substring(0, var41.indexOf(AUTO_COLON));
					long var54 = var53.toUserhash();
					boolean var56 = false;
					for (int var57 = 0; var57 < ignoreCount; var57++) {
						if (ignoreUserhash[var57] == var54) {
							var56 = true;
							break;
						}
					}
					if (!var56 && chatDisabled == 0) {
						addChat(4, Text.TRADEREQ, var53);
					}
				} else if (var41.endsWith(AUTO_DUELREQ)) {
					JagString var48 = var41.substring(0, var41.indexOf(AUTO_COLON));
					long var49 = var48.toUserhash();
					boolean var51 = false;
					for (int var52 = 0; var52 < ignoreCount; var52++) {
						if (ignoreUserhash[var52] == var49) {
							var51 = true;
							break;
						}
					}
					if (!var51 && chatDisabled == 0) {
						addChat(8, Text.DUELREQ, var48);
					}
				} else if (var41.endsWith(AUTO_CHALREQ)) {
					JagString var42 = var41.substring(0, var41.indexOf(AUTO_COLON));
					long var43 = var42.toUserhash();
					boolean var45 = false;
					for (int var46 = 0; var46 < ignoreCount; var46++) {
						if (ignoreUserhash[var46] == var43) {
							var45 = true;
							break;
						}
					}
					if (!var45 && chatDisabled == 0) {
						JagString var47 = var41.substring(var41.indexOf(AUTO_COLON) + 1, var41.length() + -9);
						addChat(8, var47, var42);
					}
				} else {
					addChat(0, var41, EMPTY);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 182) {
				// IF_SETSCROLLPOS
				int var58 = in.g2();
				int var59 = in.g4_alt1();
				IfType var60 = IfType.get(var59);
				ptype = -1;
				if (var60 != null && var60.type == 0) {
					if (var58 < 0) {
						var58 = 0;
					}
					if (var60.scrollPos - var60.height < var58) {
						var58 = var60.scrollPos - var60.height;
					}
					var60.scrollPosY = var58;
				}
				return true;
			}
			if (ptype == 174) {
				// UPDATE_INV_STOP_TRANSMIT
				int var61 = in.g4_alt3();
				IfType var62 = IfType.get(var61);
				if (var62.v3) {
					IfType[] var63 = IfType.list[var61 >> 16];
					for (int var64 = 0; var64 < var63.length; var64++) {
						IfType var65 = var63[var64];
						if ((var62.parentId & 0xFFFF) == (var65.layerId & 0xFFFF) && var65.field2542 > 0) {
							var65.invobject = -1;
							var65.invcount = 0;
						}
					}
				} else {
					for (int var66 = 0; var66 < var62.linkObjType.length; var66++) {
						var62.linkObjType[var66] = -1;
						var62.linkObjType[var66] = 0;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 130) {
				// todo (weird, this was done client-side by reading clientCode in 377)
				IfType.reportAbuseComId = in.g2_alt1();
				ptype = -1;
				return true;
			}
			if (ptype == 129) {
				// TELEPORT (unofficial name)
				int var67 = in.g1_alt2();
				int var68 = in.g1_alt1();
				int var69 = in.g1_alt2();
				minusedlevel = var67 >> 1;
				localPlayer.teleport(var69, (var67 & 0x1) == 1, var68);
				ptype = -1;
				return true;
			}
			if (ptype == 181) {
				// LOGOUT
				logout();
				ptype = -1;
				return false;
			}
			if (ptype == 24) {
				// IF_SETANIM
				int var70 = in.g2b();
				int var71 = in.g4();
				IfType var72 = IfType.get(var71);
				if (var72.modelAnim != var70 || var70 == -1) {
					var72.animCycle = 0;
					var72.animFrame = 0;
					var72.modelAnim = var70;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 56) {
				// IF_OPENOVERLAY (unofficial name)
				int var73 = in.g2s_alt2();
				if (var73 >= 0) {
					ifAnimReset(var73);
				}
				if (mainOverlayId != var73) {
					closeInterface(mainOverlayId);
					mainOverlayId = var73;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 117) {
				// IF_SETROTATESPEED (unofficial name)
				int var74 = in.g2();
				int var75 = in.g2_alt3();
				int var76 = in.g4_alt1();
				IfType var77 = IfType.get(var76);
				ptype = -1;
				var77.modelSpin = (var74 << 16) + var75;
				return true;
			}
			if (ptype == 84) {
				// IF_OPENMAIN_SIDE (unofficial name)
				int var78 = in.g2();
				int var79 = in.g2_alt3();
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					redrawChat = true;
					chatModalId = -1;
				}
				if (fullModalId1 != -1) {
					closeInterface(fullModalId1);
					fullModalId1 = -1;
					setMainState(30);
				}
				if (fullModalId2 != -1) {
					closeInterface(fullModalId2);
					fullModalId2 = -1;
				}
				if (mainModalId != var79) {
					closeInterface(mainModalId);
					mainModalId = var79;
				}
				if (sideModalId != var78) {
					closeInterface(sideModalId);
					sideModalId = var78;
				}
				resumePauseComId = -1;
				if (dialogInputType != 0) {
					redrawChat = true;
					dialogInputType = 0;
				}
				redrawSide = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}
			if (ptype == 64) {
				// UPDATE_ZONE_FULL_FOLLOWS
				zoneUpdateZ = in.g1();
				zoneUpdateX = in.g1_alt1();
				for (int var80 = zoneUpdateX; var80 < zoneUpdateX + 8; var80++) {
					for (int var81 = zoneUpdateZ; var81 < zoneUpdateZ + 8; var81++) {
						if (groundObj[minusedlevel][var80][var81] != null) {
							groundObj[minusedlevel][var80][var81] = null;
							showObject(var81, var80);
						}
					}
				}
				for (LocChange var82 = (LocChange) locChanges.head(); var82 != null; var82 = (LocChange) locChanges.next()) {
					if (var82.x >= zoneUpdateX && zoneUpdateX + 8 > var82.x && var82.z >= zoneUpdateZ && zoneUpdateZ + 8 > var82.z && minusedlevel == var82.level) {
						var82.endTime = 0;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 223) {
				// SET_PLAYER_OP
				JagString var83 = in.gjstr();
				int var84 = in.g1_alt3();
				int var85 = in.g1();
				if (var85 >= 1 && var85 <= 5) {
					if (var83.equalsIgnoreCase(NULL)) {
						var83 = null;
					}
					playerOp[var85 - 1] = var83;
					playerOpPriority[var85 - 1] = var84 == 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 118) {
				// IF_OPENMAIN (unofficial name)
				int var86 = in.g2();
				ifAnimReset(var86);
				if (sideModalId != -1) {
					closeInterface(sideModalId);
					redrawIcons = true;
					sideModalId = -1;
					redrawSide = true;
				}
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					redrawChat = true;
					chatModalId = -1;
				}
				if (fullModalId1 != -1) {
					closeInterface(fullModalId1);
					fullModalId1 = -1;
					setMainState(30);
				}
				if (fullModalId2 != -1) {
					closeInterface(fullModalId2);
					fullModalId2 = -1;
				}
				if (mainModalId != var86) {
					closeInterface(mainModalId);
					mainModalId = var86;
				}
				resumePauseComId = -1;
				if (dialogInputType != 0) {
					redrawChat = true;
					dialogInputType = 0;
				}
				method1018(mainModalId);
				ptype = -1;
				return true;
			}
			if (ptype == 18) {
				// UPDATE_RUNENERGY
				if (activeIcon == 12) {
					redrawSide = true;
				}
				runenergy = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 253) {
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
			if (ptype == 185) {
				// TUT_OPEN (unofficial name)
				int var87 = in.g2s_alt2();
				if (tutComId != var87) {
					closeInterface(tutComId);
					tutComId = var87;
				}
				ptype = -1;
				redrawChat = true;
				return true;
			}
			if (ptype == 195) {
				// IF_OPENFULL (unofficial name)
				int var88 = in.g2_alt2();
				int var89 = in.g2();
				ifAnimReset(var89);
				if (var88 != -1) {
					ifAnimReset(var88);
				}
				if (mainModalId != -1) {
					closeInterface(mainModalId);
					mainModalId = -1;
				}
				if (sideModalId != -1) {
					closeInterface(sideModalId);
					sideModalId = -1;
				}
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					chatModalId = -1;
				}
				if (fullModalId1 != var89) {
					closeInterface(fullModalId1);
					fullModalId1 = var89;
					setMainState(35);
				}
				if (fullModalId2 != var89) {
					closeInterface(fullModalId2);
					fullModalId2 = var88;
				}
				resumePauseComId = -1;
				dialogInputType = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 180) {
				// IF_CLOSE
				if (sideModalId != -1) {
					closeInterface(sideModalId);
					redrawSide = true;
					redrawIcons = true;
					sideModalId = -1;
				}
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					redrawChat = true;
					chatModalId = -1;
				}
				if (fullModalId1 != -1) {
					closeInterface(fullModalId1);
					fullModalId1 = -1;
					setMainState(30);
				}
				if (fullModalId2 != -1) {
					closeInterface(fullModalId2);
					fullModalId2 = -1;
				}
				if (mainModalId != -1) {
					closeInterface(mainModalId);
					mainModalId = -1;
				}
				ptype = -1;
				resumePauseComId = -1;
				if (dialogInputType != 0) {
					redrawChat = true;
					dialogInputType = 0;
				}
				return true;
			}
			if (ptype == 208) {
				// IF_OPENCHAT (unofficial name)
				int var90 = in.g2_alt2();
				ifAnimReset(var90);
				if (sideModalId != -1) {
					closeInterface(sideModalId);
					redrawIcons = true;
					sideModalId = -1;
					redrawSide = true;
				}
				if (fullModalId1 != -1) {
					closeInterface(fullModalId1);
					fullModalId1 = -1;
					setMainState(30);
				}
				if (fullModalId2 != -1) {
					closeInterface(fullModalId2);
					fullModalId2 = -1;
				}
				if (mainModalId != -1) {
					closeInterface(mainModalId);
					mainModalId = -1;
				}
				if (chatModalId != var90) {
					closeInterface(chatModalId);
					chatModalId = var90;
				}
				redrawChat = true;
				ptype = -1;
				resumePauseComId = -1;
				return true;
			}
			if (ptype == 217) {
				// MIDI_SONG
				int var91 = in.g2_alt1();
				if (var91 == 65535) {
					var91 = -1;
				}
				playSongs(var91);
				ptype = -1;
				return true;
			}
			if (ptype == 40) {
				// MIDI_JINGLE
				int var92 = in.g3();
				int var93 = in.g2_alt2();
				if (var93 == 65535) {
					var93 = -1;
				}
				playJingle(var92, var93);
				ptype = -1;
				return true;
			}
			if (ptype == 254) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				zoneUpdateZ = in.g1_alt3();
				zoneUpdateX = in.g1_alt2();
				ptype = -1;
				return true;
			}
			if (ptype == 88) {
				// TUT_FLASH (unofficial name)
				tutFlashIcon = in.g1_alt1();
				if (activeIcon == tutFlashIcon) {
					if (tutFlashIcon == 3) {
						activeIcon = 1;
					} else {
						activeIcon = 3;
					}
					redrawSide = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 63) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				zoneUpdateX = in.g1_alt2();
				zoneUpdateZ = in.g1_alt3();
				while (in.pos < psize) {
					ptype = in.g1();
					zonePacket();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 196) {
				// CHAT_FILTER_SETTINGS
				chatPublicMode = in.g1();
				chatPrivateMode = in.g1();
				chatTradeMode = in.g1();
				redrawChat = true;
				redrawChatMode = true;
				ptype = -1;
				return true;
			}
			if (ptype == 116) {
				// UPDATE_REBOOT_TIMER
				rebootTimer = in.g2_alt1() * 30;
				ptype = -1;
				return true;
			}
			if (ptype == 92) {
				// PLAYER_INFO
				getPlayerPos();
				ptype = -1;
				return true;
			}
			if (ptype == 2) {
				// VARP_LARGE
				int var94 = in.g4_alt3();
				int var95 = in.g2();
				VarCache.varServ[var95] = var94;
				if (VarCache.var[var95] != var94) {
					VarCache.var[var95] = var94;
					clientVar(var95);
					if (tutComId != -1) {
						redrawChat = true;
					}
					redrawSide = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 128) {
				// NPC_INFO
				getNpcPos();
				ptype = -1;
				return true;
			}
			if (ptype == 131) {
				// SYNTH_SOUND
				int var96 = in.g2();
				int var97 = in.g1();
				int var98 = in.g2();
				playSynth(var96, var97, var98);
				ptype = -1;
				return true;
			}
			if (ptype == 237) {
				// IF_OPENSIDE (unofficial name)
				int var99 = in.g2();
				ifAnimReset(var99);
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					chatModalId = -1;
					redrawChat = true;
				}
				if (fullModalId1 != -1) {
					closeInterface(fullModalId1);
					fullModalId1 = -1;
					setMainState(30);
				}
				if (fullModalId2 != -1) {
					closeInterface(fullModalId2);
					fullModalId2 = -1;
				}
				if (mainModalId != -1) {
					closeInterface(mainModalId);
					mainModalId = -1;
				}
				if (sideModalId != var99) {
					closeInterface(sideModalId);
					sideModalId = var99;
				}
				redrawIcons = true;
				if (dialogInputType != 0) {
					redrawChat = true;
					dialogInputType = 0;
				}
				resumePauseComId = -1;
				ptype = -1;
				redrawSide = true;
				return true;
			}
			if (ptype == 234) {
				// CAM_LOOKAT
				cinemaCam = true;
				camLookAtLx = in.g1();
				camLookAtLz = in.g1();
				camLookAtHei = in.g2();
				camLookAtRate = in.g1();
				camLookAtRate2 = in.g1();
				if (camLookAtRate2 >= 100) {
					int var100 = camLookAtLx * 128 + 64;
					int var101 = camLookAtLz * 128 + 64;
					int var102 = getAvH(minusedlevel, var100, var101) - camLookAtHei;
					int var103 = var100 - camX;
					int var104 = var101 - camZ;
					int var105 = var102 - camY;
					int var106 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104));
					camPitch = (int) (Math.atan2((double) var105, (double) var106) * 325.949D) & 0x7FF;
					camYaw = (int) (Math.atan2((double) var103, (double) var104) * -325.949D) & 0x7FF;
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
			if (ptype == 142) {
				// IF_SETANGLE
				int var107 = in.g2();
				int var108 = in.g2_alt1();
				int var109 = in.g2();
				int var110 = in.g4_alt1();
				IfType var111 = IfType.get(var110);
				ptype = -1;
				var111.modelYAn = var107;
				var111.modelZoom = var108;
				var111.modelXAn = var109;
				return true;
			}
			if (ptype == 6) {
				// IF_SHOWICON (unofficial name)
				activeIcon = in.g1();
				redrawIcons = true;
				redrawSide = true;
				ptype = -1;
				return true;
			}
			if (ptype == 171) {
				// UPDATE_RUNWEIGHT
				if (activeIcon == 12) {
					redrawSide = true;
				}
				runweight = in.g2b();
				ptype = -1;
				return true;
			}
			if (ptype == 9 || ptype == 99 || ptype == 229 || ptype == 19 || ptype == 202 || ptype == 1 || ptype == 74 || ptype == 175 || ptype == 49 || ptype == 143 || ptype == 241) {
				zonePacket();
				ptype = -1;
				return true;
			}
			if (ptype == 14) {
				// VARP_RESET (unofficial name)
				for (int var112 = 0; var112 < VarpType.numDefinitions; var112++) {
					VarpType var113 = VarpType.list(var112);
					if (var113 != null && var113.clientcode == 0) {
						VarCache.varServ[var112] = 0;
						VarCache.var[var112] = 0;
					}
				}
				if (tutComId != -1) {
					redrawChat = true;
				}
				redrawSide = true;
				ptype = -1;
				return true;
			}
			if (ptype == 160) {
				// IF_SETNPCHEAD
				int var114 = in.g2_alt1();
				int var115 = in.g4_alt1();
				IfType var116 = IfType.get(var115);
				var116.model1Type = 2;
				ptype = -1;
				var116.model1Id = var114;
				return true;
			}
			if (ptype == 132) {
				// P_COUNTDIALOG
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					chatModalId = -1;
				}
				ptype = -1;
				dialogInput = EMPTY;
				dialogInputType = 1;
				redrawChat = true;
				socialInputOpen = false;
				return true;
			}
			if (ptype == 186) {
				// HINT_ARROW
				hintType = in.g1();
				if (hintType == 1) {
					hintNpc = in.g2();
				}
				if (hintType >= 2 && hintType <= 6) {
					if (hintType == 2) {
						field1857 = 64;
						field2572 = 64;
					}
					if (hintType == 3) {
						field1857 = 64;
						field2572 = 0;
					}
					if (hintType == 4) {
						field1857 = 64;
						field2572 = 128;
					}
					if (hintType == 5) {
						field2572 = 64;
						field1857 = 0;
					}
					if (hintType == 6) {
						field2572 = 64;
						field1857 = 128;
					}
					hintType = 2;
					hintTileX = in.g2();
					hintTileZ = in.g2();
					hintHeight = in.g1();
				}
				if (hintType == 10) {
					hintPlayer = in.g2();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 210) {
				// IF_SETPLAYERHEAD
				int var117 = in.g4_alt1();
				IfType var118 = IfType.get(var117);
				var118.model1Type = 3;
				var118.model1Id = localPlayer.model.method634();
				ptype = -1;
				return true;
			}
			if (ptype == 110) {
				// IF_SETTEXT
				int var119 = in.g4_alt1();
				JagString var120 = in.gjstr();
				IfType var121 = IfType.get(var119);
				var121.text = var120;
				if (var119 >> 16 == sideIcon[activeIcon]) {
					redrawSide = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 70) {
				// FRIENDLIST_LOADED
				friendServerStatus = in.g1();
				redrawSide = true;
				ptype = -1;
				return true;
			}
			if (ptype == 120) {
				// IF_SETOBJECT
				int var122 = in.g2();
				int var123 = in.g2_alt1();
				int var124 = in.g4_alt1();
				if (var123 == 65535) {
					var123 = -1;
				}
				IfType var125 = IfType.get(var124);
				if (var125.v3) {
					var125.invcount = 1;
					var125.invobject = var123;
				} else if (var123 == -1) {
					ptype = -1;
					var125.model1Type = 0;
					return true;
				} else {
					ObjType var126 = ObjType.list(var123);
					var125.modelXAn = var126.xan2d;
					var125.model1Id = var123;
					var125.model1Type = 4;
					var125.modelZoom = var126.zoom2d * 100 / var122;
					var125.modelYAn = var126.yan2d;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 51) {
				// MESSAGE_PRIVATE
				long var127 = in.g8();
				long var129 = (long) in.g2();
				long var131 = (long) in.g3();
				int var133 = in.g1();
				boolean var134 = false;
				long var135 = (var129 << 32) + var131;
				for (int var137 = 0; var137 < 100; var137++) {
					if (messageIds[var137] == var135) {
						var134 = true;
						break;
					}
				}
				if (var133 <= 1) {
					for (int var138 = 0; var138 < ignoreCount; var138++) {
						if (ignoreUserhash[var138] == var127) {
							var134 = true;
							break;
						}
					}
				}
				if (!var134 && chatDisabled == 0) {
					messageIds[privateMessageCount] = var135;
					privateMessageCount = (privateMessageCount + 1) % 100;
					JagString var139 = WordPack.method893(in).forceCapitalisationOfWords();
					if (var133 == 2 || var133 == 3) {
						addChat(7, var139, JagString.join(new JagString[]{field2535, JString.toScreenName(var127).toRawUsername()}));
					} else if (var133 == 1) {
						addChat(7, var139, JagString.join(new JagString[]{field2612, JString.toScreenName(var127).toRawUsername()}));
					} else {
						addChat(3, var139, JString.toScreenName(var127).toRawUsername());
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 27) {
				// RESET_ANIMS
				for (int var140 = 0; var140 < players.length; var140++) {
					if (players[var140] != null) {
						players[var140].primarySeqId = -1;
					}
				}
				for (int var141 = 0; var141 < npc.length; var141++) {
					if (npc[var141] != null) {
						npc[var141].primarySeqId = -1;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 140) {
				// IF_SETICON (unofficial name)
				int var142 = in.g2();
				int var143 = in.g1();
				if (var142 == 65535) {
					var142 = -1;
				}
				if (sideIcon[var143] != var142) {
					closeInterface(sideIcon[var143]);
					sideIcon[var143] = var142;
				}
				redrawIcons = true;
				ptype = -1;
				redrawSide = true;
				return true;
			}
			if (ptype == 34) {
				// UPDATE_STAT
				redrawSide = true;
				int var144 = in.g1_alt1();
				int var145 = in.g1();
				int var146 = in.g4_alt3();
				statXP[var145] = var146;
				statEffectiveLevel[var145] = var144;
				statBaseLevel[var145] = 1;
				for (int var147 = 0; var147 < 98; var147++) {
					if (Skills.skillxp[var147] <= var146) {
						statBaseLevel[var145] = var147 + 2;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 3) {
				// IF_SETPOSITION
				int var148 = in.g4();
				int var149 = in.g2s_alt3();
				int var150 = in.g2s_alt3();
				IfType var151 = IfType.get(var148);
				var151.x = var151.dataX + var150;
				ptype = -1;
				var151.y = var151.dataY + var149;
				return true;
			}
			if (ptype == 72) {
				// VARP_SYNC (unofficial name)
				for (int var152 = 0; var152 < VarCache.var.length; var152++) {
					if (VarCache.varServ[var152] != VarCache.var[var152]) {
						VarCache.var[var152] = VarCache.varServ[var152];
						clientVar(var152);
						redrawSide = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 240) {
				// REFLECTION_CHECKER
				ReflectionChecker.addCheck(signlink, in, psize);
				ptype = -1;
				return true;
			}
			if (ptype == 58) {
				// LAST_LOGIN_INFO
				int var153 = in.g4_alt2();
				lastAddress = signlink.dnsreq(var153);
				ptype = -1;
				return true;
			}
			if (ptype == 214) {
				// UPDATE_INV_PARTIAL
				redrawSide = true;
				int var154 = in.g4();
				IfType var155 = IfType.get(var154);
				while (true) {
					while (psize > in.pos) {
						int var156 = in.gsmart();
						int var157 = in.g2();
						int var158 = 0;
						if (var157 != 0) {
							var158 = in.g1();
							if (var158 == 255) {
								var158 = in.g4();
							}
						}
						if (var155.v3) {
							IfType[] var159 = IfType.list[var154 >> 16];
							for (int var160 = 0; var160 < var159.length; var160++) {
								IfType var161 = var159[var160];
								if ((var155.parentId & 0xFFFF) == (var161.layerId & 0xFFFF) && var156 + 1 == var161.field2542) {
									var161.invcount = var158;
									var161.invobject = var157 - 1;
								}
							}
						} else if (var156 >= 0 && var155.linkObjType.length > var156) {
							var155.linkObjType[var156] = var157;
							var155.linkObjNumber[var156] = var158;
						}
					}
					ptype = -1;
					return true;
				}
			}
			if (ptype == 166) {
				// REBUILD_NORMAL
				rebuildPacket(false);
				ptype = -1;
				return true;
			}
			if (ptype == 231) {
				// IF_SETCOLOUR
				int var162 = in.g2_alt2();
				int var163 = in.g4_alt1();
				int var164 = var162 >> 10 & 0x1F;
				int var165 = var162 >> 5 & 0x1F;
				IfType var166 = IfType.get(var163);
				ptype = -1;
				int var167 = var162 & 0x1F;
				var166.colour = (var167 << 3) + (var164 << 19) + (var165 << 11);
				return true;
			}
			if (ptype == 211) {
				// UPDATE_IGNORELIST
				ignoreCount = psize / 8;
				for (int var168 = 0; var168 < ignoreCount; var168++) {
					ignoreUserhash[var168] = in.g8();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 124) {
				// P_NAMEDIALOG
				if (chatModalId != -1) {
					closeInterface(chatModalId);
					chatModalId = -1;
				}
				redrawChat = true;
				dialogInput = EMPTY;
				dialogInputType = 2;
				ptype = -1;
				socialInputOpen = false;
				return true;
			}
			JagException.report("T1 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize, null);
			logout();
		} catch (IOException var172) {
			lostCon();
		} catch (Exception var173) {
			String var170 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (localPlayer.routeX[0] + mapBuildBaseX) + "," + (localPlayer.routeZ[0] + mapBuildBaseZ) + " - ";
			for (int var171 = 0; psize > var171 && var171 < 50; var171++) {
				var170 = var170 + in.data[var171] + ",";
			}
			JagException.report(var170, var173);
			logout();
		}
		return true;
	}

	@ObfuscatedName("n.a(B)V")
	public static void errorUsage() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@ObfuscatedName("td.b(I)V")
	public static void openMenu() {
		int var0 = b12.stringWid(Text.CHOOSEOPTION);
		for (int var1 = 0; var1 < menuNumEntries; var1++) {
			int var2 = b12.stringWidTag(menuOption[var1]);
			if (var0 < var2) {
				var0 = var2;
			}
		}
		var0 += 8;
		int var3 = menuNumEntries * 15 + 21;
		if (ClientMouseListener.mouseClickX > 4 && ClientMouseListener.mouseClickY > 4 && ClientMouseListener.mouseClickX < 516 && ClientMouseListener.mouseClickY < 338) {
			menuArea = 0;
			menuHeight = menuNumEntries * 15 + 22;
			isMenuOpen = true;
			int var4 = ClientMouseListener.mouseClickX - var0 / 2 - 4;
			menuWidth = var0;
			if (var0 + var4 > 512) {
				var4 = 512 - var0;
			}
			if (var4 < 0) {
				var4 = 0;
			}
			menuX = var4;
			int var5 = ClientMouseListener.mouseClickY - 4;
			if (var5 + var3 > 334) {
				var5 = 334 - var3;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			menuY = var5;
		}
		if (ClientMouseListener.mouseClickX > 553 && ClientMouseListener.mouseClickY > 205 && ClientMouseListener.mouseClickX < 743 && ClientMouseListener.mouseClickY < 466) {
			menuHeight = menuNumEntries * 15 + 22;
			menuArea = 1;
			int var6 = ClientMouseListener.mouseClickY - 205;
			int var7 = ClientMouseListener.mouseClickX - var0 / 2 - 553;
			if (var7 < 0) {
				var7 = 0;
			} else if (var0 + var7 > 190) {
				var7 = 190 - var0;
			}
			isMenuOpen = true;
			menuX = var7;
			if (var6 < 0) {
				var6 = 0;
			} else if (var3 + var6 > 261) {
				var6 = 261 - var3;
			}
			menuWidth = var0;
			menuY = var6;
		}
		if (ClientMouseListener.mouseClickX > 17 && ClientMouseListener.mouseClickY > 357 && ClientMouseListener.mouseClickX < 496 && ClientMouseListener.mouseClickY < 453) {
			menuWidth = var0;
			menuArea = 2;
			menuHeight = menuNumEntries * 15 + 22;
			int var8 = ClientMouseListener.mouseClickY - 357;
			if (var8 < 0) {
				var8 = 0;
			} else if (var3 + var8 > 96) {
				var8 = 96 - var3;
			}
			int var9 = ClientMouseListener.mouseClickX - var0 / 2 - 17;
			isMenuOpen = true;
			menuY = var8;
			if (var9 < 0) {
				var9 = 0;
			} else if (var0 + var9 > 479) {
				var9 = 479 - var0;
			}
			menuX = var9;
		}
	}

	@ObfuscatedName("vd.c(B)V")
	public static void gameLoop() {
		if (rebootTimer > 1) {
			rebootTimer--;
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
		if (state != 30 && state != 35) {
			return;
		}
		if (js5Loading && state == 30) {
			ClientMouseListener.mouseButton = 0;
			ClientMouseListener.mouseClickButton = 0;
			while (ClientKeyboardListener.pollKey()) {
			}
			for (int var1 = 0; var1 < ClientKeyboardListener.keyHeld.length; var1++) {
				ClientKeyboardListener.keyHeld[var1] = false;
			}
		}
		ReflectionChecker.performCheck(out);
		Object var2 = mouseTracking.lock;
		synchronized (mouseTracking.lock) {
			if (!mouseTracked) {
				mouseTracking.length = 0;
			} else if (ClientMouseListener.mouseClickButton != 0 || mouseTracking.length >= 40) {
				int var3 = 0;
				// EVENT_MOUSE_MOVE
				out.p1Enc(210);
				out.p1(0);
				int var4 = out.pos;
				for (int var5 = 0; var5 < mouseTracking.length && out.pos - var4 < 240; var5++) {
					var3++;
					int var6 = mouseTracking.y[var5];
					if (var6 < 0) {
						var6 = 0;
					} else if (var6 > 502) {
						var6 = 502;
					}
					int var7 = mouseTracking.x[var5];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 764) {
						var7 = 764;
					}
					int var8 = var6 * 765 + var7;
					if (mouseTracking.y[var5] == -1 && mouseTracking.x[var5] == -1) {
						var7 = -1;
						var8 = 524287;
						var6 = -1;
					}
					if (mouseTrackX != var7 || mouseTrackY != var6) {
						int var9 = var7 - mouseTrackX;
						mouseTrackX = var7;
						int var10 = var6 - mouseTrackY;
						mouseTrackY = var6;
						if (mouseTrackDelta < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							out.p2((mouseTrackDelta << 12) + (var9 << 6) + var10);
							mouseTrackDelta = 0;
						} else if (mouseTrackDelta < 8) {
							out.p3(var8 + (mouseTrackDelta << 19) + 8388608);
							mouseTrackDelta = 0;
						} else {
							out.p4((mouseTrackDelta << 19) + var8 - 1073741824);
							mouseTrackDelta = 0;
						}
					} else if (mouseTrackDelta < 2047) {
						mouseTrackDelta++;
					}
				}
				out.psize1(out.pos - var4);
				if (var3 < mouseTracking.length) {
					mouseTracking.length -= var3;
					for (int var11 = 0; var11 < mouseTracking.length; var11++) {
						mouseTracking.x[var11] = mouseTracking.x[var3 + var11];
						mouseTracking.y[var11] = mouseTracking.y[var3 + var11];
					}
				} else {
					mouseTracking.length = 0;
				}
			}
		}
		if (ClientMouseListener.mouseClickButton != 0) {
			long var12 = (ClientMouseListener.mouseClickTime - prevMouseClickTime) / 50L;
			int var14 = ClientMouseListener.mouseClickX;
			int var15 = ClientMouseListener.mouseClickY;
			prevMouseClickTime = ClientMouseListener.mouseClickTime;
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
			if (ClientMouseListener.mouseClickButton == 2) {
				var16 = 1;
			}
			if (var12 > 4095L) {
				var12 = 4095L;
			}
			int var17 = (int) var12;
			// EVENT_MOUSE_CLICK
			out.p1Enc(234);
			int var18 = var15 * 765 + var14;
			out.p4_alt1((var16 << 19) + ((var17 << 20) + var18));
		}
		if (sendCameraDelay > 0) {
			sendCameraDelay--;
		}
		if (ClientKeyboardListener.keyHeld[96] || ClientKeyboardListener.keyHeld[97] || ClientKeyboardListener.keyHeld[98] || ClientKeyboardListener.keyHeld[99]) {
			sendCamera = true;
		}
		if (sendCamera && sendCameraDelay <= 0) {
			sendCameraDelay = 20;
			sendCamera = false;
			// EVENT_CAMERA_POSITION
			out.p1Enc(58);
			out.p2(orbitCameraYaw);
			out.p2(orbitCameraPitch);
		}
		if (focus && !focusIn) {
			focusIn = true;
			// EVENT_APPLET_FOCUS
			out.p1Enc(160);
			out.p1(1);
		}
		if (!focus && focusIn) {
			focusIn = false;
			// EVENT_APPLET_FOCUS
			out.p1Enc(160);
			out.p1(0);
		}
		checkMinimap();
		if (state != 30 && state != 35) {
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
		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		if (selectedArea != 0) {
			selectedCycle++;
			if (selectedCycle >= 15) {
				if (selectedArea == 2) {
					redrawSide = true;
				}
				if (selectedArea == 3) {
					redrawChat = true;
				}
				selectedArea = 0;
			}
		}
		worldUpdateNum++;
		if (objDragArea != 0) {
			objDragCycles++;
			if (ClientMouseListener.mouseX > objGrabX + 5 || objGrabX - 5 > ClientMouseListener.mouseX || objGrabY + 5 < ClientMouseListener.mouseY || objGrabY - 5 > ClientMouseListener.mouseY) {
				objGrabThreshold = true;
			}
			if (ClientMouseListener.mouseButton == 0) {
				if (objDragArea == 3) {
					redrawChat = true;
				}
				if (objDragArea == 2) {
					redrawSide = true;
				}
				objDragArea = 0;
				if (objGrabThreshold && objDragCycles >= 5) {
					hoveredSlotComId = -1;
					buildMinimenu();
					if (objDragComId == hoveredSlotComId && objDragSlot != hoveredSlot) {
						IfType var19 = IfType.get(objDragComId);
						byte var20 = 0;
						if (bankArrangeMode == 1 && var19.clientCode == 206) {
							var20 = 1;
						}
						if (var19.linkObjType[hoveredSlot] <= 0) {
							var20 = 0;
						}
						if (var19.objReplace) {
							int var23 = hoveredSlot;
							int var24 = objDragSlot;
							var19.linkObjType[var23] = var19.linkObjType[var24];
							var19.linkObjNumber[var23] = var19.linkObjNumber[var24];
							var19.linkObjType[var24] = -1;
							var19.linkObjNumber[var24] = 0;
						} else if (var20 == 1) {
							int var21 = objDragSlot;
							int var22 = hoveredSlot;
							while (var21 != var22) {
								if (var21 > var22) {
									var19.swapSlots(var21 - 1, var21);
									var21--;
								} else if (var21 < var22) {
									var19.swapSlots(var21 + 1, var21);
									var21++;
								}
							}
						} else {
							var19.swapSlots(hoveredSlot, objDragSlot);
						}
						// INV_BUTTOND
						out.p1Enc(83);
						out.p1_alt1(var20);
						out.p2_alt2(objDragSlot);
						out.p2_alt3(hoveredSlot);
						out.p4_alt2(objDragComId);
					}
				} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
					openMenu();
				} else if (menuNumEntries > 0) {
					doAction(menuNumEntries - 1);
				}
				selectedCycle = 10;
				ClientMouseListener.mouseClickButton = 0;
			}
		}
		if (World.groundX != -1) {
			int var25 = World.groundX;
			int var26 = World.groundZ;
			boolean var27 = tryMove(0, 0, localPlayer.routeX[0], var25, 0, true, 0, 0, localPlayer.routeZ[0], var26, 0);
			if (var27) {
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 1;
			}
			World.groundX = -1;
		}
		if (ClientMouseListener.mouseClickButton == 1 && tutComMessage != null) {
			ClientMouseListener.mouseClickButton = 0;
			redrawChat = true;
			tutComMessage = null;
		}
		mouseLoop();
		if (fullModalId1 == -1) {
			minimapLoop();
			iconLoop();
			chatModeLoop();
		}
		if (ClientMouseListener.mouseButton == 1 || ClientMouseListener.mouseClickButton == 1) {
			scrollCycle++;
		}
		if (mainModalId != -1) {
			loopInterface(516, 34, 338, mainModalId, 4, 4);
		}
		if (sideModalId != -1) {
			loopInterface(743, 34, 466, sideModalId, 205, 553);
		} else if (sideIcon[activeIcon] != -1) {
			loopInterface(743, 34, 466, sideIcon[activeIcon], 205, 553);
		}
		if (chatModalId != -1) {
			loopInterface(496, 34, 453, chatModalId, 357, 17);
		} else if (tutComId != -1) {
			loopInterface(496, 34, 453, tutComId, 357, 17);
		}
		if (mainModalId != -1) {
			loopInterface(516, -35, 338, mainModalId, 4, 4);
		}
		if (sideModalId != -1) {
			loopInterface(743, -35, 466, sideModalId, 205, 553);
		} else if (sideIcon[activeIcon] != -1) {
			loopInterface(743, -35, 466, sideIcon[activeIcon], 205, 553);
		}
		if (chatModalId != -1) {
			loopInterface(496, -35, 453, chatModalId, 357, 17);
		} else if (tutComId != -1) {
			loopInterface(496, -35, 453, tutComId, 357, 17);
		}
		if (field3253 == -1 && field1387 == -1 && field1279 == -1) {
			if (tooltipNum > 0) {
				tooltipNum--;
			}
		} else if (tooltipRedraw > tooltipNum) {
			tooltipNum++;
			if (tooltipNum == tooltipRedraw) {
				if (field3253 != -1) {
					redrawChat = true;
				}
				if (field1387 != -1) {
					redrawSide = true;
				}
			}
		}
		followCamera();
		if (cinemaCam) {
			cinemaCamera();
		}
		for (int var28 = 0; var28 < 5; var28++) {
			int var10002 = camShakeCycle[var28]++;
		}
		handleInputKey();
		int var29 = ClientMouseListener.getIdleTimer();
		int var30 = ClientKeyboardListener.getIdleTimer();
		if (var29 > 4500 && var30 > 4500) {
			logoutTimer = 250;
			ClientMouseListener.setIdleTimer(4000);
			// IDLE_TIMER
			out.p1Enc(216);
		}
		macroMinimapCycle++;
		macroCameraCycle++;
		if (macroCameraCycle > 500) {
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x2) == 2) {
				macroCameraZ += macroCameraZModifier;
			}
			if ((var31 & 0x1) == 1) {
				macroCameraX += macroCameraXModifier;
			}
			macroCameraCycle = 0;
			if ((var31 & 0x4) == 4) {
				macroCameraAngle += macroCameraAngleModifier;
			}
		}
		if (macroCameraZ < -55) {
			macroCameraZModifier = 2;
		}
		if (macroMinimapCycle > 500) {
			int var32 = (int) (Math.random() * 8.0D);
			if ((var32 & 0x1) == 1) {
				macroMinimapAngle += macroMinimapAngleModifier;
			}
			if ((var32 & 0x2) == 2) {
				macroMinimapZoom += macroMinimapZoomModifier;
			}
			macroMinimapCycle = 0;
		}
		if (macroCameraZ > 55) {
			macroCameraZModifier = -2;
		}
		if (macroCameraX < -50) {
			macroCameraXModifier = 2;
		}
		if (macroMinimapAngle < -60) {
			macroMinimapAngleModifier = 2;
		}
		noTimeoutTimer++;
		if (macroCameraX > 50) {
			macroCameraXModifier = -2;
		}
		if (macroMinimapAngle > 60) {
			macroMinimapAngleModifier = -2;
		}
		if (macroCameraAngle < -40) {
			macroCameraAngleModifier = 1;
		}
		if (macroCameraAngle > 40) {
			macroCameraAngleModifier = -1;
		}
		if (macroMinimapZoom < -20) {
			macroMinimapZoomModifier = 1;
		}
		if (macroMinimapZoom > 10) {
			macroMinimapZoomModifier = -1;
		}
		if (noTimeoutTimer > 50) {
			// NO_TIMEOUT
			out.p1Enc(13);
		}
		try {
			if (stream != null && out.pos > 0) {
				stream.write(out.pos, out.data);
				noTimeoutTimer = 0;
				out.pos = 0;
			}
		} catch (IOException var33) {
			lostCon();
		}
	}

	@ObfuscatedName("r.a(I)V")
	public static void mapBuildLoop() {
		preventTimeout(false);
		mapLoadCount = 0;
		boolean var0 = true;
		for (int var1 = 0; var1 < mapBuildGroundData.length; var1++) {
			if (mapBuildGroundFile[var1] != -1 && mapBuildGroundData[var1] == null) {
				mapBuildGroundData[var1] = maps.getFile(0, mapBuildGroundFile[var1]);
				if (mapBuildGroundData[var1] == null) {
					mapLoadCount++;
					var0 = false;
				}
			}
			if (mapBuildLocationFile[var1] != -1 && mapBuildLocationData[var1] == null) {
				mapBuildLocationData[var1] = maps.fetchFile(mapBuildLocationFile[var1], 0, mapKeys[var1]);
				if (mapBuildLocationData[var1] == null) {
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
		for (int var3 = 0; var3 < mapBuildGroundData.length; var3++) {
			byte[] var4 = mapBuildLocationData[var3];
			if (var4 != null) {
				int var5 = (mapBuildIndex[var3] & 0xFF) * 64 - mapBuildBaseZ;
				int var6 = (mapBuildIndex[var3] >> 8) * 64 - mapBuildBaseX;
				if (regionmode) {
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
			messageBox(Text.LOADING, true, field1133);
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
		int var11 = mapBuildGroundData.length;
		BgSound.reset();
		preventTimeout(true);
		if (!regionmode) {
			for (int var12 = 0; var12 < var11; var12++) {
				int var13 = (mapBuildIndex[var12] & 0xFF) * 64 - mapBuildBaseZ;
				int var14 = (mapBuildIndex[var12] >> 8) * 64 - mapBuildBaseX;
				byte[] var15 = mapBuildGroundData[var12];
				if (var15 != null) {
					ClientBuild.loadGround(collision, (mapBuildCentreZoneX - 6) * 8, var15, var14, var13, (mapBuildCentreZoneZ - 6) * 8);
				}
			}
			for (int var16 = 0; var16 < var11; var16++) {
				int var17 = (mapBuildIndex[var16] >> 8) * 64 - mapBuildBaseX;
				byte[] var18 = mapBuildGroundData[var16];
				int var19 = (mapBuildIndex[var16] & 0xFF) * 64 - mapBuildBaseZ;
				if (var18 == null && mapBuildCentreZoneZ < 800) {
					ClientBuild.fadeAdjacent(var19, 64, 64, var17);
				}
			}
			preventTimeout(true);
			for (int var20 = 0; var20 < var11; var20++) {
				byte[] var21 = mapBuildLocationData[var20];
				if (var21 != null) {
					int var22 = (mapBuildIndex[var20] >> 8) * 64 - mapBuildBaseX;
					int var23 = (mapBuildIndex[var20] & 0xFF) * 64 - mapBuildBaseZ;
					ClientBuild.loadLocations(var22, world, collision, var21, var23);
				}
			}
		}
		if (regionmode) {
			for (int var24 = 0; var24 < 4; var24++) {
				for (int var25 = 0; var25 < 13; var25++) {
					for (int var26 = 0; var26 < 13; var26++) {
						int var27 = mapBuildRegionSrc[var24][var25][var26];
						boolean var28 = false;
						if (var27 != -1) {
							int var29 = var27 >> 1 & 0x3;
							int var30 = var27 >> 14 & 0x3FF;
							int var31 = var27 >> 24 & 0x3;
							int var32 = var27 >> 3 & 0x7FF;
							int var33 = (var30 / 8 << 8) + (var32 / 8);
							for (int var34 = 0; var34 < mapBuildIndex.length; var34++) {
								if (mapBuildIndex[var34] == var33 && mapBuildGroundData[var34] != null) {
									ClientBuild.loadGroundRegion(var26 * 8, (var30 & 0x7) * 8, var31, var24, var25 * 8, (var32 & 0x7) * 8, var29, mapBuildGroundData[var34], collision);
									var28 = true;
									break;
								}
							}
						}
						if (!var28) {
							ClientBuild.autoGroundRegion(var26 * 8, var24, var25 * 8);
						}
					}
				}
			}
			for (int var35 = 0; var35 < 13; var35++) {
				for (int var36 = 0; var36 < 13; var36++) {
					int var37 = mapBuildRegionSrc[0][var35][var36];
					if (var37 == -1) {
						ClientBuild.fadeAdjacent(var36 * 8, 8, 8, var35 * 8);
					}
				}
			}
			preventTimeout(true);
			for (int var38 = 0; var38 < 4; var38++) {
				for (int var39 = 0; var39 < 13; var39++) {
					for (int var40 = 0; var40 < 13; var40++) {
						int var41 = mapBuildRegionSrc[var38][var39][var40];
						if (var41 != -1) {
							int var42 = var41 >> 24 & 0x3;
							int var43 = var41 >> 14 & 0x3FF;
							int var44 = var41 >> 1 & 0x3;
							int var45 = var41 >> 3 & 0x7FF;
							int var46 = (var43 / 8 << 8) + (var45 / 8);
							for (int var47 = 0; var47 < mapBuildIndex.length; var47++) {
								if (mapBuildIndex[var47] == var46 && mapBuildLocationData[var47] != null) {
									ClientBuild.loadLocationsRegion((var43 & 0x7) * 8, world, var38, var44, var42, mapBuildLocationData[var47], var40 * 8, collision, (var45 & 0x7) * 8, var39 * 8);
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
		LocType.mc1.clear();
		if (frame != null) {
			// WINDOW_STATUS
			out.p1Enc(121);
			out.p4(1057001181);
		}
		if (!regionmode) {
			int var51 = (mapBuildCentreZoneX - 6) / 8;
			int var52 = (mapBuildCentreZoneZ - 6) / 8;
			int var53 = (mapBuildCentreZoneZ + 6) / 8;
			int var54 = (mapBuildCentreZoneX + 6) / 8;
			for (int var55 = var51 - 1; var55 <= var54 + 1; var55++) {
				for (int var56 = var52 - 1; var56 <= var53 + 1; var56++) {
					if (var51 > var55 || var55 > var54 || var56 < var52 || var56 > var53) {
						maps.updateCacheHint(JagString.join(new JagString[]{field2305, JagString.parseInt(var55), field477, JagString.parseInt(var56)}));
						maps.updateCacheHint(JagString.join(new JagString[]{field1259, JagString.parseInt(var55), field477, JagString.parseInt(var56)}));
					}
				}
			}
		}
		if (fullModalId1 == -1) {
			setMainState(30);
		} else {
			setMainState(35);
		}
		ClientBuild.quit();
		// MAP_BUILD_COMPLETE
		out.p1Enc(178);
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
				if (var0.startTime == 0 && var0.x >= 1 && var0.z >= 1 && var0.x <= 102 && var0.z <= 102 && (var0.field678 < 0 || ClientBuild.changeLocAvailable(var0.field691, var0.field678))) {
					locChangeUnchecked(var0.z, var0.field678, var0.x, var0.field691, var0.field696, var0.layer, var0.level);
					var0.startTime = -1;
					if (var0.field689 == var0.field678 && var0.field689 == -1) {
						var0.unlink();
					} else if (var0.field689 == var0.field678 && var0.field696 == var0.field686 && var0.field697 == var0.field691) {
						var0.unlink();
					}
				}
			} else if (var0.field689 < 0 || ClientBuild.changeLocAvailable(var0.field697, var0.field689)) {
				locChangeUnchecked(var0.z, var0.field689, var0.x, var0.field697, var0.field686, var0.layer, var0.level);
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("ra.a(ILa;ZLa;)V")
	public static void messageBox(JagString arg0, boolean arg1, JagString arg2) {
		if (fullredraw) {
			fullredraw = false;
			canvasDrawBack();
			canvasDrawChat();
			canvasDrawSide();
			canvasDrawMap();
			canvasDrawChatMode(chatTradeMode, p12, chatPrivateMode, chatPublicMode);
			canvasDrawIcons(activeIcon, sideIcon, sideModalId == -1, -1);
			debugRedrawSide = true;
			debugRedrawIcons = true;
			debugRedrawChat = true;
		}
		short var3 = 151;
		bindGame();
		int var5 = var3 - 3;
		p12.centreString(arg0, 257, 148, 0);
		p12.centreString(arg0, 256, 147, 16777215);
		if (arg2 != null) {
			var5 += 15;
			if (arg1) {
				int var4 = p12.stringWid(arg2) + 4;
				Pix2D.fillRect(257 - var4 / 2, 152, var4, 11, 0);
			}
			p12.centreString(arg2, 257, 163, 0);
			p12.centreString(arg2, 256, 162, 16777215);
		}
		canvasDrawGame();
	}

	@ObfuscatedName("je.c(B)V")
	public static void minimapLoop() {
		if (minimapState != 0 || ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickX - 575;
		int var1 = ClientMouseListener.mouseClickY - 4 - 5;
		if (var0 < 0 || var1 < 0 || var0 >= 146 || var1 >= 151) {
			return;
		}
		var1 -= 75;
		var0 -= 73;
		int var2 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var3 = Pix3D.sinTable[var2];
		int var4 = Pix3D.cosTable[var2];
		int var5 = (macroMinimapZoom + 256) * var4 >> 8;
		int var6 = (macroMinimapZoom + 256) * var3 >> 8;
		int var7 = var1 * var6 + var0 * var5 >> 11;
		int var8 = var1 * var5 - var0 * var6 >> 11;
		int var9 = localPlayer.x + var7 >> 7;
		int var10 = localPlayer.z - var8 >> 7;
		boolean var11 = tryMove(0, 0, localPlayer.routeX[0], var9, 0, true, 0, 0, localPlayer.routeZ[0], var10, 1);
		if (var11) {
			out.p1(var0);
			out.p1(var1);
			out.p2(orbitCameraYaw);
			out.p1(57);
			out.p1(macroMinimapAngle);
			out.p1(macroMinimapZoom);
			out.p1(89);
			out.p2(localPlayer.x);
			out.p2(localPlayer.z);
			out.p1(tryMoveNearest);
			out.p1(63);
		}
	}

	@ObfuscatedName("mb.b(B)V")
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
					int var4 = in.gBit(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.yaw = var5;
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

	@ObfuscatedName("tb.a(IZ)V")
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
				int var5 = var4.x >> 7;
				int var6 = var4.z >> 7;
				if ((lowMem && playerCount > 50 || playerCount > 200) && !arg0 && var4.readyanim == var4.secondarySeqId) {
					var4.lowMem = true;
				}
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var4.field73 == null || var4.locStartCycle > loopCycle || loopCycle >= var4.locEndCycle) {
						if ((var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
							if (tileLastOccupiedCycle[var5][var6] == sceneCycle) {
								continue;
							}
							tileLastOccupiedCycle[var5][var6] = sceneCycle;
						}
						var4.field84 = getAvH(minusedlevel, var4.x, var4.z);
						world.addDynamic(minusedlevel, var4.x, var4.z, var4.field84, 60, var4, var4.yaw, var3, var4.needsForwardDrawPadding);
					} else {
						var4.lowMem = false;
						var4.field84 = getAvH(minusedlevel, var4.x, var4.z);
						world.addScenery(minusedlevel, var4.x, var4.z, var4.field84, var4, var4.yaw, var3, var4.field66, var4.field89, var4.field70, var4.field97);
					}
				}
			}
		}
	}

	@ObfuscatedName("de.a(I)V")
	public static void getNpcPosExtended() {
		for (int var0 = 0; var0 < entityUpdateCount; var0++) {
			int var1 = entityUpdateIds[var0];
			ClientNpc var2 = npc[var1];
			int var3 = in.g1();
			if ((var3 & 0x1) != 0) {
				// HITMARK
				int var4 = in.g1_alt1();
				int var5 = in.g1_alt3();
				var2.addHitmark(var5, loopCycle, var4);
				var2.combatCycle = loopCycle + 300;
				var2.field2004 = in.g1_alt1();
				var2.field1975 = in.g1();
			}
			if ((var3 & 0x20) != 0) {
				// SPOTANIM
				var2.spotanimId = in.g2_alt3();
				int var6 = in.g4();
				var2.spotanimCycle = 0;
				var2.spotanimLastCycle = (var6 & 0xFFFF) + loopCycle;
				var2.field1984 = var6 >> 16;
				var2.spotanimFrame = 0;
				if (var2.spotanimLastCycle > loopCycle) {
					var2.spotanimFrame = -1;
				}
				if (var2.spotanimId == 65535) {
					var2.spotanimId = -1;
				}
			}
			if ((var3 & 0x4) != 0) {
				// FACEENTITY
				var2.targetId = in.g2_alt2();
				if (var2.targetId == 65535) {
					var2.targetId = -1;
				}
			}
			if ((var3 & 0x2) != 0) {
				// HITMARK2
				int var7 = in.g1_alt1();
				int var8 = in.g1();
				var2.addHitmark(var8, loopCycle, var7);
				var2.combatCycle = loopCycle + 300;
				var2.field2004 = in.g1_alt3();
				var2.field1975 = in.g1_alt3();
			}
			if ((var3 & 0x40) != 0) {
				// SAY
				var2.chat = in.gjstr();
				var2.chatTimer = 100;
			}
			if ((var3 & 0x80) != 0) {
				// CHANGETYPE
				var2.type = NpcType.list(in.g2_alt2());
				var2.turnrightanim = var2.type.turnrightanim;
				var2.turnspeed = var2.type.turnspeed;
				var2.walkanim_r = var2.type.walkanim_r;
				var2.readyanim = var2.type.readyanim;
				var2.walkanim = var2.type.walkanim;
				var2.turnleftanim = var2.type.turnleftanim;
				var2.size = var2.type.size;
				var2.walkanim_l = var2.type.walkanim_l;
				var2.walkanim_b = var2.type.walkanim_b;
			}
			if ((var3 & 0x8) != 0) {
				// FACESQUARE
				var2.targetTileX = in.g2_alt2();
				var2.targetTileZ = in.g2_alt1();
			}
			if ((var3 & 0x10) != 0) {
				// ANIM
				int var9 = in.g2_alt2();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = in.g1_alt2();
				if (var2.primarySeqId == var9 && var9 != -1) {
					int var11 = SeqType.list(var9).duplicatebehaviour;
					if (var11 == 1) {
						var2.primarySeqCycle = 0;
						var2.primarySeqLoop = 0;
						var2.primarySeqFrame = 0;
						var2.primarySeqDelay = var10;
					}
					if (var11 == 2) {
						var2.primarySeqLoop = 0;
					}
				} else if (var9 == -1 || var2.primarySeqId == -1 || SeqType.list(var9).priority >= SeqType.list(var2.primarySeqId).priority) {
					var2.primarySeqId = var9;
					var2.primarySeqCycle = 0;
					var2.primarySeqDelay = var10;
					var2.primarySeqFrame = 0;
					var2.primarySeqLoop = 0;
					var2.preanimRouteLength = var2.routeLength;
				}
			}
		}
	}

	@ObfuscatedName("de.a(Lnb;IB)V")
	public static void moveEntity(ClientEntity arg0, int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.primarySeqId = -1;
			arg0.exactMoveEnd = 0;
			arg0.exactMoveStart = 0;
			arg0.spotanimId = -1;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
		}
		if (localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.spotanimId = -1;
			arg0.exactMoveStart = 0;
			arg0.exactMoveEnd = 0;
			arg0.primarySeqId = -1;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
		}
		if (loopCycle < arg0.exactMoveEnd) {
			exactMove1(arg0);
		} else if (arg0.exactMoveStart < loopCycle) {
			routeMove(arg0);
		} else {
			exactMove2(arg0);
		}
		entityFace(arg0);
		entityAnim(arg0);
	}

	@ObfuscatedName("oe.a(ILnb;)V")
	public static void routeMove(ClientEntity arg0) {
		arg0.secondarySeqId = arg0.readyanim;
		if (arg0.routeLength == 0) {
			arg0.animDelayMove = 0;
			return;
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var1 = SeqType.list(arg0.primarySeqId);
			if (arg0.preanimRouteLength > 0 && var1.postanim_move == 0) {
				arg0.animDelayMove++;
				return;
			}
			if (arg0.preanimRouteLength <= 0 && var1.preanim_move == 0) {
				arg0.animDelayMove++;
				return;
			}
		}
		int var2 = arg0.x;
		int var3 = arg0.routeX[arg0.routeLength - 1] * 128 + arg0.size * 64;
		int var4 = arg0.z;
		int var5 = arg0.routeZ[arg0.routeLength - 1] * 128 + arg0.size * 64;
		if (var3 - var2 > 256 || var3 - var2 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
			arg0.x = var3;
			arg0.z = var5;
			return;
		}
		if (var2 < var3) {
			if (var4 < var5) {
				arg0.dstYaw = 1280;
			} else if (var5 < var4) {
				arg0.dstYaw = 1792;
			} else {
				arg0.dstYaw = 1536;
			}
		} else if (var2 <= var3) {
			if (var5 > var4) {
				arg0.dstYaw = 1024;
			} else if (var5 < var4) {
				arg0.dstYaw = 0;
			}
		} else if (var4 < var5) {
			arg0.dstYaw = 768;
		} else if (var5 < var4) {
			arg0.dstYaw = 256;
		} else {
			arg0.dstYaw = 512;
		}
		int var6 = arg0.walkanim_b;
		int var7 = 4;
		if (arg0.yaw != arg0.dstYaw && arg0.targetId == -1 && arg0.turnspeed != 0) {
			var7 = 2;
		}
		if (arg0.routeLength > 2) {
			var7 = 6;
		}
		if (arg0.routeLength > 3) {
			var7 = 8;
		}
		int var8 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		if (var8 >= -256 && var8 <= 256) {
			var6 = arg0.walkanim;
		} else if (var8 >= 256 && var8 < 768) {
			var6 = arg0.walkanim_l;
		} else if (var8 >= -768 && var8 <= -256) {
			var6 = arg0.walkanim_r;
		}
		if (var6 == -1) {
			var6 = arg0.walkanim;
		}
		arg0.secondarySeqId = var6;
		if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
			arg0.animDelayMove--;
			var7 = 8;
		}
		if (arg0.routeRun[arg0.routeLength - 1]) {
			var7 <<= 0x1;
		}
		if (var4 < var5) {
			arg0.z += var7;
			if (arg0.z > var5) {
				arg0.z = var5;
			}
		} else if (var4 > var5) {
			arg0.z -= var7;
			if (arg0.z < var5) {
				arg0.z = var5;
			}
		}
		if (var7 >= 8 && arg0.walkanim == arg0.secondarySeqId && arg0.runanim != -1) {
			arg0.secondarySeqId = arg0.runanim;
		}
		if (var2 < var3) {
			arg0.x += var7;
			if (var3 < arg0.x) {
				arg0.x = var3;
			}
		} else if (var3 < var2) {
			arg0.x -= var7;
			if (var3 > arg0.x) {
				arg0.x = var3;
			}
		}
		if (arg0.x == var3 && arg0.z == var5) {
			if (arg0.preanimRouteLength > 0) {
				arg0.preanimRouteLength--;
			}
			arg0.routeLength--;
		}
	}

	@ObfuscatedName("fc.b(II)V")
	public static void setMainState(int arg0) {
		if (state == arg0) {
			return;
		}
		if (state == 0) {
			resetProgress();
		}
		if (arg0 == 20 || arg0 == 40) {
			loginWaitingTime = 0;
			loginFailCount = 0;
			loginStep = 0;
		}
		if (arg0 != 20 && arg0 != 40 && prevStream != null) {
			prevStream.close();
			prevStream = null;
		}
		if (state == 25 || state == 40) {
			bindGame();
			Pix2D.cls();
		}
		if (state == 25) {
			mapLoadCount = 0;
			mapLoadPrevCount = 1;
			locModelLoadCount = 0;
			locModelLoadPrevCount = 1;
			mapLoadState = 0;
		}
		if (arg0 == 35) {
			unloadFrame();
			TitleScreen.close();
			if (drawArea == null) {
				drawArea = PixMap.createSafe(503, 765, canvas);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			drawArea = null;
			unloadFrame();
			TitleScreen.open(canvas, binary, sprites);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			drawArea = null;
			TitleScreen.close();
			loadFrame(canvas, sprites);
		}
		state = arg0;
		fullredraw = true;
	}

	@ObfuscatedName("ga.a(IIII)V")
	public static void getOverlayPos(int arg0, int arg1, int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			projectY = -1;
			projectX = -1;
			return;
		}
		int var3 = getAvH(minusedlevel, arg2, arg1) - arg0;
		int var4 = arg1 - camZ;
		int var5 = var3 - camY;
		int var6 = Model.cosTable[camPitch];
		int var7 = Model.sinTable[camPitch];
		int var8 = arg2 - camX;
		int var9 = Model.sinTable[camYaw];
		int var10 = Model.cosTable[camYaw];
		int var11 = var4 * var9 + var8 * var10 >> 16;
		int var12 = var4 * var10 - var8 * var9 >> 16;
		int var14 = var5 * var6 - var7 * var12 >> 16;
		int var15 = var5 * var7 + var6 * var12 >> 16;
		if (var15 < 50) {
			projectY = -1;
			projectX = -1;
		} else {
			projectX = (var11 << 9) / var15 + 256;
			projectY = (var14 << 9) / var15 + 167;
		}
	}

	@ObfuscatedName("kc.a(IIIIII)V")
	public static void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = (arg3 - 32) * arg3 / arg1;
		scrollbar[0].plotSprite(arg2, arg4);
		scrollbar[1].plotSprite(arg2, arg4 + arg3 - 16);
		Pix2D.fillRect(arg2, arg4 + 16, 16, arg3 - 32, SCROLLBAR_TRACK);
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (arg3 - var5 - 32) * arg0 / (arg1 - arg3);
		Pix2D.fillRect(arg2, arg4 + var6 + 16, 16, var5, SCROLLBAR_GRIP_FOREGROUND);
		Pix2D.vline(arg2, arg4 + var6 + 16, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg2 + 1, arg4 + var6 + 16, var5, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg2, arg4 + var6 + 16, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg2, arg4 + var6 + 17, 16, SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(arg2 + 15, arg4 - -16 - -var6, var5, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.vline(arg2 + 14, var6 + 17 + arg4, var5 - 1, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg2, arg4 + var6 + var5 + 15, 16, SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg2 + 1, arg4 - -var6 + var5 + 14, 15, SCROLLBAR_GRIP_LOWLIGHT);
	}

	@ObfuscatedName("wa.a(IIIILh;)V")
	public static void addNpcOptions(int arg0, int arg1, int arg2, NpcType arg3) {
		if (menuNumEntries >= 400) {
			return;
		}
		if (arg3.multinpc != null) {
			arg3 = arg3.getMultiNpc();
		}
		if (arg3 == null || !arg3.active) {
			return;
		}
		JagString var4 = arg3.name;
		if (arg3.vislevel != 0) {
			var4 = JagString.join(new JagString[]{var4, combatColourCode(localPlayer.combatLevel, arg3.vislevel), field1275, Text.LEVEL, JagString.parseInt(arg3.vislevel), field2601});
		}
		if (useMode == 1) {
			addMenuOption(arg2, Text.USE, arg1, arg0, 49, JagString.join(new JagString[]{field3177, field805, var4}));
		} else if (targetMode == 1) {
			if ((targetMask & 0x2) == 2) {
				addMenuOption(arg2, targetVerb, arg1, arg0, 21, JagString.join(new JagString[]{field1384, field805, var4}));
			}
		} else {
			JagString[] var5 = arg3.op;
			if (showOpIndex) {
				var5 = prependOpIndex(var5);
			}
			if (var5 != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (var5[var6] != null && !var5[var6].equalsIgnoreCase(Text.ATTACK)) {
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
						addMenuOption(arg2, var5[var6], arg1, arg0, var7, JagString.join(new JagString[]{field2699, var4}));
					}
				}
			}
			if (var5 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (var5[var8] != null && var5[var8].equalsIgnoreCase(Text.ATTACK)) {
						short var9 = 0;
						if (localPlayer.combatLevel < arg3.vislevel) {
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
						addMenuOption(arg2, var5[var8], arg1, arg0, var10, JagString.join(new JagString[]{field2699, var4}));
					}
				}
			}
			addMenuOption(arg2, Text.EXAMINE, arg1, arg0, 1001, JagString.join(new JagString[]{field2699, var4}));
		}
	}

	@ObfuscatedName("oa.a(I)V")
	public static void getNpcPosNewVis() {
		while (true) {
			if (in.bitsLeft(psize) >= 27) {
				int var0 = in.gBit(15);
				if (var0 != 32767) {
					boolean var1 = false;
					if (npc[var0] == null) {
						npc[var0] = new ClientNpc();
						var1 = true;
					}
					ClientNpc var2 = npc[var0];
					npcIds[npcCount++] = var0;
					var2.cycle = loopCycle;
					int var3 = ANGLE_TO_DIR[in.gBit(3)];
					if (var1) {
						var2.yaw = var3;
					}
					int var4 = in.gBit(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = in.gBit(5);
					int var6 = in.gBit(1);
					if (var5 > 15) {
						var5 -= 32;
					}
					if (var6 == 1) {
						entityUpdateIds[entityUpdateCount++] = var0;
					}
					int var7 = in.gBit(1);
					var2.type = NpcType.list(in.gBit(13));
					var2.walkanim_l = var2.type.walkanim_l;
					var2.readyanim = var2.type.readyanim;
					var2.turnrightanim = var2.type.turnrightanim;
					var2.walkanim = var2.type.walkanim;
					var2.size = var2.type.size;
					var2.walkanim_b = var2.type.walkanim_b;
					var2.turnleftanim = var2.type.turnleftanim;
					var2.turnspeed = var2.type.turnspeed;
					if (var2.turnspeed == 0) {
						var2.yaw = 0;
					}
					var2.walkanim_r = var2.type.walkanim_r;
					var2.teleport(localPlayer.routeZ[0] + var5, var7 == 1, localPlayer.routeX[0] + var4);
					continue;
				}
			}
			in.gBitEnd();
			return;
		}
	}

	@ObfuscatedName("d.a(ILnb;)V")
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
			if (selfSlot == var4) {
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
			int var8 = arg0.z - (arg0.targetTileZ - mapBuildBaseZ - mapBuildBaseZ) * 64;
			int var9 = arg0.x - (arg0.targetTileX - mapBuildBaseX - mapBuildBaseX) * 64;
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
			if (arg0.turnspeed > var10 || 2048 - arg0.turnspeed < var10) {
				var11 = false;
				arg0.yaw = arg0.dstYaw;
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
			if (var10 < arg0.turnspeed || var10 > 2048 - arg0.turnspeed) {
				arg0.yaw = arg0.dstYaw;
				var12 = false;
			}
			if (arg0.readyanim == arg0.secondarySeqId && (arg0.turnCycle > 25 || var12)) {
				if (arg0.turnrightanim == -1) {
					arg0.secondarySeqId = arg0.walkanim;
				} else {
					arg0.secondarySeqId = arg0.turnrightanim;
				}
			}
		}
		arg0.yaw &= 0x7FF;
	}

	@ObfuscatedName("ta.c(ZI)V")
	public static void addNpcs(boolean arg0) {
		for (int var1 = 0; var1 < npcCount; var1++) {
			ClientNpc var2 = npc[npcIds[var1]];
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
					world.addDynamic(minusedlevel, var2.x, var2.z, getAvH(minusedlevel, (var2.size - 1) * 64 + var2.x, var2.size * 64 + var2.z + -64), var2.size * 64 + 60 - 64, var2, var2.yaw, var3, var2.needsForwardDrawPadding);
				}
			}
		}
	}

	@ObfuscatedName("nb.b(Z)V")
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
			int var7 = in.gBit(1);
			minusedlevel = in.gBit(2);
			int var8 = in.gBit(1);
			if (var8 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
			int var9 = in.gBit(7);
			int var10 = in.gBit(7);
			localPlayer.teleport(var10, var7 == 1, var9);
		}
	}

	@ObfuscatedName("m.a(BI)Z")
	public static boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var1 = menuAction[arg0];
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
		world.setObj(minusedlevel, arg1, arg0, getAvH(minusedlevel, arg1 * 128 + 64, arg0 * 128 + 64), var4, var11, var9, var8);
	}

	@ObfuscatedName("la.a(ILnb;)V")
	public static void exactMove2(ClientEntity arg0) {
		if (loopCycle == arg0.exactMoveStart || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.list(arg0.primarySeqId).delay[arg0.primarySeqFrame]) {
			int var1 = arg0.exactMoveStart - arg0.exactMoveEnd;
			int var2 = loopCycle - arg0.exactMoveEnd;
			int var3 = arg0.exactStartX * 128 + arg0.size * 64;
			int var4 = arg0.size * 64 + arg0.exactStartZ * 128;
			int var5 = arg0.field1973 * 128 + arg0.size * 64;
			int var6 = arg0.field2001 * 128 + arg0.size * 64;
			arg0.x = ((var1 - var2) * var3 + var2 * var5) / var1;
			arg0.z = ((var1 - var2) * var4 + var2 * var6) / var1;
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

	@ObfuscatedName("m.a(IIII)V")
	public static void ifButtonX(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			// IF_BUTTON1
			out.p1Enc(111);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 2) {
			// IF_BUTTON2
			out.p1Enc(9);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 3) {
			// IF_BUTTON3
			out.p1Enc(193);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 4) {
			// IF_BUTTON4
			out.p1Enc(53);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 5) {
			// IF_BUTTON5
			out.p1Enc(94);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 6) {
			// IF_BUTTON6
			out.p1Enc(213);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 7) {
			// IF_BUTTON7
			out.p1Enc(46);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 8) {
			// IF_BUTTON8
			out.p1Enc(130);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 9) {
			// IF_BUTTON9
			out.p1Enc(157);
			out.p4(arg2);
			out.p2(arg0);
		}
		if (arg1 == 10) {
			// IF_BUTTON10
			out.p1Enc(84);
			out.p4(arg2);
			out.p2(arg0);
		}
	}

	@ObfuscatedName("k.a(IIIIBIZIIIII)Z")
	public static boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				dirMap[var11][var12] = 0;
				distMap[var11][var12] = 99999999;
			}
		}
		dirMap[arg2][arg8] = 99;
		byte var13 = 0;
		int var14 = arg8;
		boolean var15 = false;
		int var16 = 0;
		distMap[arg2][arg8] = 0;
		int var17 = arg2;
		routeX[0] = arg2;
		int var35 = var13 + 1;
		routeZ[0] = arg8;
		int var18 = routeX.length;
		int[][] var19 = collision[minusedlevel].flags;
		while (var35 != var16) {
			var14 = routeZ[var16];
			var17 = routeX[var16];
			var16 = (var16 + 1) % var18;
			if (arg3 == var17 && arg9 == var14) {
				var15 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && collision[minusedlevel].testWall(var17, arg4 - 1, arg9, var14, arg6, arg3)) {
					var15 = true;
					break;
				}
				if (arg4 < 10 && collision[minusedlevel].tesWDecor(arg9, arg6, var14, arg3, var17, arg4 - 1)) {
					var15 = true;
					break;
				}
			}
			if (arg0 != 0 && arg7 != 0 && collision[minusedlevel].testLoc(arg7, arg3, arg0, arg9, arg1, var14, var17)) {
				var15 = true;
				break;
			}
			int var20 = distMap[var17][var14] + 1;
			if (var17 > 0 && dirMap[var17 - 1][var14] == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0) {
				routeX[var35] = var17 - 1;
				routeZ[var35] = var14;
				var35 = (var35 + 1) % var18;
				dirMap[var17 - 1][var14] = 2;
				distMap[var17 - 1][var14] = var20;
			}
			if (var17 < 103 && dirMap[var17 + 1][var14] == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0) {
				routeX[var35] = var17 + 1;
				routeZ[var35] = var14;
				var35 = (var35 + 1) % var18;
				dirMap[var17 + 1][var14] = 8;
				distMap[var17 + 1][var14] = var20;
			}
			if (var14 > 0 && dirMap[var17][var14 - 1] == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				routeX[var35] = var17;
				routeZ[var35] = var14 - 1;
				dirMap[var17][var14 - 1] = 1;
				var35 = (var35 + 1) % var18;
				distMap[var17][var14 - 1] = var20;
			}
			if (var14 < 103 && dirMap[var17][var14 + 1] == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				routeX[var35] = var17;
				routeZ[var35] = var14 + 1;
				dirMap[var17][var14 + 1] = 4;
				distMap[var17][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 > 0 && var14 > 0 && dirMap[var17 - 1][var14 - 1] == 0 && (var19[var17 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				routeX[var35] = var17 - 1;
				routeZ[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				dirMap[var17 - 1][var14 - 1] = 3;
				distMap[var17 - 1][var14 - 1] = var20;
			}
			if (var17 < 103 && var14 > 0 && dirMap[var17 + 1][var14 - 1] == 0 && (var19[var17 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
				routeX[var35] = var17 + 1;
				routeZ[var35] = var14 - 1;
				var35 = (var35 + 1) % var18;
				dirMap[var17 + 1][var14 - 1] = 9;
				distMap[var17 + 1][var14 - 1] = var20;
			}
			if (var17 > 0 && var14 < 103 && dirMap[var17 - 1][var14 + 1] == 0 && (var19[var17 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				routeX[var35] = var17 - 1;
				routeZ[var35] = var14 + 1;
				dirMap[var17 - 1][var14 + 1] = 6;
				distMap[var17 - 1][var14 + 1] = var20;
				var35 = (var35 + 1) % var18;
			}
			if (var17 < 103 && var14 < 103 && dirMap[var17 + 1][var14 + 1] == 0 && (var19[var17 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
				routeX[var35] = var17 + 1;
				routeZ[var35] = var14 + 1;
				var35 = (var35 + 1) % var18;
				dirMap[var17 + 1][var14 + 1] = 12;
				distMap[var17 + 1][var14 + 1] = var20;
			}
		}
		tryMoveNearest = 0;
		if (!var15) {
			if (!arg5) {
				return false;
			}
			int var21 = 1000;
			int var22 = 100;
			for (int var23 = arg3 - 10; var23 <= arg3 + 10; var23++) {
				for (int var24 = arg9 - 10; var24 <= arg9 + 10; var24++) {
					if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && distMap[var23][var24] < 100) {
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
						if (var21 > var27 || var21 == var27 && distMap[var23][var24] < var22) {
							var14 = var24;
							var21 = var27;
							var17 = var23;
							var22 = distMap[var23][var24];
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
			tryMoveNearest = 1;
		}
		byte var28 = 0;
		routeX[0] = var17;
		int var36 = var28 + 1;
		routeZ[0] = var14;
		int var29;
		int var30 = var29 = dirMap[var17][var14];
		while (arg2 != var17 || arg8 != var14) {
			if (var29 != var30) {
				var29 = var30;
				routeX[var36] = var17;
				routeZ[var36++] = var14;
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
			var30 = dirMap[var17][var14];
		}
		if (var36 > 0) {
			int var31 = var36;
			if (var36 > 25) {
				var31 = 25;
			}
			var36--;
			int var32 = routeZ[var36];
			int var33 = routeX[var36];
			if (arg10 == 0) {
				// MOVE_GAMECLICK
				out.p1Enc(73);
				out.p1(var31 + var31 + 3);
			}
			if (arg10 == 1) {
				// MOVE_MINIMAPCLICK
				out.p1Enc(236);
				out.p1(var31 + var31 + 14 + 3);
			}
			if (arg10 == 2) {
				// MOVE_OPCLICK
				out.p1Enc(89);
				out.p1(var31 + var31 + 3);
			}
			out.p2_alt1(var32 + mapBuildBaseZ);
			out.p1_alt2(ClientKeyboardListener.keyHeld[82] ? 1 : 0);
			out.p2_alt1(mapBuildBaseX + var33);
			minimapFlagX = routeX[0];
			minimapFlagZ = routeZ[0];
			for (int var34 = 1; var34 < var31; var34++) {
				var36--;
				out.p1_alt1(routeX[var36] - var33);
				out.p1_alt2(routeZ[var36] - var32);
			}
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("he.a(IIBI)Z")
	public static boolean interactWithLoc(int arg0, int arg1, int arg2) {
		int var3 = arg1 >> 14 & 0x7FFF;
		int var4 = world.typecode2(minusedlevel, arg0, arg2, arg1);
		if (var4 == -1) {
			return false;
		}
		int var5 = var4 >> 6 & 0x3;
		int var6 = var4 & 0x1F;
		if (var6 == 10 || var6 == 11 || var6 == 22) {
			LocType var7 = LocType.list(var3);
			int var8 = var7.forceapproach;
			if (var5 != 0) {
				var8 = (var8 >> 4 - var5) + (var8 << var5 & 0xF);
			}
			int var9;
			int var10;
			if (var5 == 0 || var5 == 2) {
				var9 = var7.length;
				var10 = var7.width;
			} else {
				var10 = var7.length;
				var9 = var7.width;
			}
			tryMove(var10, var8, localPlayer.routeX[0], arg0, 0, true, 0, var9, localPlayer.routeZ[0], arg2, 2);
		} else {
			tryMove(0, 0, localPlayer.routeX[0], arg0, var6 + 1, true, var5, 0, localPlayer.routeZ[0], arg2, 2);
		}
		crossX = ClientMouseListener.mouseClickX;
		crossMode = 2;
		crossY = ClientMouseListener.mouseClickY;
		crossCycle = 0;
		return true;
	}

	@ObfuscatedName("cc.a(IZILaa;I)V")
	public static void addPlayerOptions(int arg0, int arg1, ClientPlayer arg2, int arg3) {
		if (localPlayer == arg2 || menuNumEntries >= 400) {
			return;
		}
		JagString var4;
		if (arg2.skillLevel == 0) {
			var4 = JagString.join(new JagString[]{arg2.name, combatColourCode(localPlayer.combatLevel, arg2.combatLevel), field1275, Text.LEVEL, JagString.parseInt(arg2.combatLevel), field2601});
		} else {
			var4 = JagString.join(new JagString[]{arg2.name, field1275, Text.SKILL, JagString.parseInt(arg2.skillLevel), field2601});
		}
		if (useMode == 1) {
			addMenuOption(arg3, Text.USE, arg0, arg1, 22, JagString.join(new JagString[]{field3177, field1500, var4}));
		} else if (targetMode != 1) {
			for (int var5 = 4; var5 >= 0; var5--) {
				if (playerOp[var5] != null) {
					int var6 = 0;
					short var7 = 0;
					if (playerOp[var5].equalsIgnoreCase(Text.ATTACK)) {
						if (localPlayer.combatLevel < arg2.combatLevel) {
							var7 = 2000;
						}
						if (localPlayer.team != 0 && arg2.team != 0) {
							if (localPlayer.team == arg2.team) {
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
					addMenuOption(arg3, playerOp[var5], arg0, arg1, var6, JagString.join(new JagString[]{field1393, var4}));
				}
			}
		} else if ((targetMask & 0x8) == 8) {
			addMenuOption(arg3, targetVerb, arg0, arg1, 1, JagString.join(new JagString[]{field1384, field1500, var4}));
		}
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			if (menuAction[var8] == 7) {
				menuOption[var8] = JagString.join(new JagString[]{Text.WALKHERE, Text.MINISEPARATOR, field1393, var4});
				return;
			}
		}
	}

	@ObfuscatedName("wa.a(IZLqd;)I")
	public static int getIfVar(int arg0, IfType arg1) {
		if (arg1.scripts == null || arg1.scripts.length <= arg0) {
			return -2;
		}
		try {
			int[] var2 = arg1.scripts[arg0];
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
					var6 = statEffectiveLevel[var2[var4++]];
				}
				if (var8 == 2) {
					var6 = statBaseLevel[var2[var4++]];
				}
				if (var8 == 3) {
					var6 = statXP[var2[var4++]];
				}
				if (var8 == 17) {
					var7 = 3;
				}
				if (var8 == 4) {
					int var9 = var2[var4++] << 16;
					int var10 = var9 + var2[var4++];
					IfType var11 = IfType.get(var10);
					int var12 = var2[var4++];
					if (var12 != -1 && (!ObjType.list(var12).members || memServer)) {
						for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
							if (var12 + 1 == var11.linkObjType[var13]) {
								var6 += var11.linkObjNumber[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var6 = VarCache.var[var2[var4++]];
				}
				if (var8 == 6) {
					var6 = Skills.skillxp[statBaseLevel[var2[var4++]] - 1];
				}
				if (var8 == 7) {
					var6 = VarCache.var[var2[var4++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var6 = localPlayer.combatLevel;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < 25; var14++) {
						if (Skills.used[var14]) {
							var6 += statBaseLevel[var14];
						}
					}
				}
				if (var8 == 10) {
					int var15 = var2[var4++] << 16;
					int var16 = var15 + var2[var4++];
					IfType var17 = IfType.get(var16);
					int var18 = var2[var4++];
					if (var18 != -1 && (!ObjType.list(var18).members || memServer)) {
						for (int var19 = 0; var19 < var17.linkObjType.length; var19++) {
							if (var18 + 1 == var17.linkObjType[var19]) {
								var6 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var6 = runenergy;
				}
				if (var8 == 12) {
					var6 = runweight;
				}
				if (var8 == 13) {
					int var20 = VarCache.var[var2[var4++]];
					int var21 = var2[var4++];
					var6 = (0x1 << var21 & var20) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var22 = var2[var4++];
					var6 = VarCache.getVarbit(var22);
				}
				if (var8 == 18) {
					var6 = (localPlayer.x >> 7) + mapBuildBaseX;
				}
				if (var8 == 19) {
					var6 = (localPlayer.z >> 7) + mapBuildBaseZ;
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
	public static void startRebuild(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (mapBuildCentreZoneX == arg2 && mapBuildCentreZoneZ == arg1 && (ClientBuild.lastBuiltLevel == arg4 || !lowMem)) {
			return;
		}
		ClientBuild.lastBuiltLevel = arg4;
		mapBuildCentreZoneX = arg2;
		if (!lowMem) {
			ClientBuild.lastBuiltLevel = 0;
		}
		mapBuildCentreZoneZ = arg1;
		setMainState(25);
		messageBox(Text.LOADING, false, null);
		int var5 = mapBuildBaseZ;
		int var6 = mapBuildBaseX;
		mapBuildBaseX = (arg2 - 6) * 8;
		int var7 = mapBuildBaseX - var6;
		mapBuildBaseZ = (arg1 - 6) * 8;
		int var8 = mapBuildBaseZ - var5;
		for (int var9 = 0; var9 < 32768; var9++) {
			ClientNpc var10 = npc[var9];
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
				var13.z -= var8 * 128;
				var13.x -= var7 * 128;
			}
		}
		minusedlevel = arg4;
		byte var15 = 0;
		localPlayer.teleport(arg3, false, arg0);
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
			var26.z -= var8;
			var26.x -= var7;
			if (var26.x < 0 || var26.z < 0 || var26.x >= 104 || var26.z >= 104) {
				var26.unlink();
			}
		}
		minimapLevel = -1;
		if (minimapFlagX != 0) {
			minimapFlagX -= var7;
			minimapFlagZ -= var8;
		}
		cinemaCam = false;
		waveCount = 0;
		spotanims.clear();
		projectiles.clear();
	}

	@ObfuscatedName("cc.g(I)I")
	public static int roofCheck2() {
		int var0 = getAvH(minusedlevel, camX, camZ);
		return var0 - camY >= 800 || (ClientBuild.mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("d.d(B)I")
	public static int roofCheck() {
		int var0 = 3;
		if (camPitch < 310) {
			int var1 = camZ >> 7;
			int var2 = camX >> 7;
			if ((ClientBuild.mapl[minusedlevel][var2][var1] & 0x4) != 0) {
				var0 = minusedlevel;
			}
			int var3 = localPlayer.x >> 7;
			int var4 = localPlayer.z >> 7;
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
		if ((ClientBuild.mapl[minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var0 = minusedlevel;
		}
		return var0;
	}

	@ObfuscatedName("qc.a(IIIIIII)V")
	public static void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 0;
		int var7 = 2048 - arg3 & 0x7FF;
		int var8 = 0;
		int var9 = 2048 - arg0 & 0x7FF;
		int var10 = arg5;
		if (var9 != 0) {
			int var11 = Model.cosTable[var9];
			int var12 = Model.sinTable[var9];
			int var13 = var11 * 0 - arg5 * var12 >> 16;
			var10 = arg5 * var11 + var12 * 0 >> 16;
			var8 = var13;
		}
		if (var7 != 0) {
			int var14 = Model.cosTable[var7];
			int var15 = Model.sinTable[var7];
			int var16 = var10 * var15 + var14 * 0 >> 16;
			var10 = var10 * var14 - var15 * 0 >> 16;
			var6 = var16;
		}
		camYaw = arg3;
		camY = arg2 - var8;
		camX = arg1 - var6;
		camPitch = arg0;
		camZ = arg4 - var10;
	}

	@ObfuscatedName("n.a(BIII)I")
	public static int getAvH(int arg0, int arg1, int arg2) {
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
	public static void coordArrow() {
		if (hintType == 2) {
			getOverlayPos(hintHeight * 2, (hintTileZ - mapBuildBaseZ << 7) + field1857, (-mapBuildBaseX + hintTileX << 7) - -field2572);
			if (projectX > -1 && loopCycle % 20 < 10) {
				headiconsHint[0].plotSprite(projectX - 12, projectY + -28);
			}
		}
	}

	@ObfuscatedName("qb.a(I)V")
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
		MidiManager.method672();
		nextMusicDelay = 0;
		nextMidiSong = -1;
		BgSound.reset();
		setMainState(10);
	}

	@ObfuscatedName("ia.a(IZIIIIIIII)V")
	public static void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var9 = null;
		for (LocChange var10 = (LocChange) locChanges.head(); var10 != null; var10 = (LocChange) locChanges.next()) {
			if (var10.level == arg4 && var10.x == arg1 && var10.z == arg5 && var10.layer == arg6) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new LocChange();
			var9.x = arg1;
			var9.layer = arg6;
			var9.level = arg4;
			var9.z = arg5;
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
	public static void drawChat() {
		debugRedrawChat = true;
		bindChat();
		if (socialInputOpen) {
			b12.centreString(socialInputHeader, 239, 40, 0);
			b12.centreString(JagString.join(new JagString[]{socialInput, AUTO_ASTERISK}), 239, 60, 128);
		} else if (dialogInputType == 1) {
			b12.centreString(Text.field2576, 239, 40, 0);
			b12.centreString(JagString.join(new JagString[]{dialogInput, AUTO_ASTERISK}), 239, 60, 128);
		} else if (dialogInputType == 2) {
			b12.centreString(Text.field1203, 239, 40, 0);
			b12.centreString(JagString.join(new JagString[]{dialogInput, AUTO_ASTERISK}), 239, 60, 128);
		} else if (dialogInputType == 3) {
			if (dialogInput != field3209) {
				findObjs(dialogInput);
				field3209 = dialogInput;
			}
			PixFont var15 = p12;
			Pix2D.setSubClipping(0, 0, 463, 77);
			for (int var16 = 0; var16 < field2330; var16++) {
				int var17 = var16 * 14 + 18 - field1390;
				if (var17 > 0 && var17 < 110) {
					var15.centreString(chatScreenName[var16], 239, var17, 0);
				}
			}
			Pix2D.setClipping();
			if (field2330 > 5) {
				drawScrollbar(field1390, field2330 * 14 + 7, 463, 77, 0);
			}
			if (dialogInput.length() == 0) {
				b12.centreString(Text.field1874, 239, 40, 255);
			} else if (field2330 == 0) {
				b12.centreString(Text.field1449, 239, 40, 0);
			}
			var15.centreString(JagString.join(new JagString[]{dialogInput, AUTO_ASTERISK}), 239, 90, 0);
			Pix2D.hline(0, 77, 479, 0);
		} else if (tutComMessage != null) {
			b12.centreString(tutComMessage, 239, 40, 0);
			b12.centreString(Text.field1819, 239, 60, 128);
		} else if (chatModalId != -1) {
			boolean var14 = drawInterface(chatModalId, 96, 2, 479);
			if (!var14) {
				redrawChat = true;
			}
		} else if (tutComId != -1) {
			boolean var0 = drawInterface(tutComId, 96, 3, 479);
			if (!var0) {
				redrawChat = true;
			}
		} else {
			int var1 = 0;
			PixFont var2 = p12;
			Pix2D.setSubClipping(0, 0, 463, 77);
			for (int var3 = 0; var3 < 100; var3++) {
				if (chatText[var3] != null) {
					int var4 = chatType[var3];
					JagString var5 = chatUsername[var3];
					int var6 = chatScrollPos + 70 - var1 * 14;
					byte var7 = 0;
					if (var5 != null && var5.startsWith(field2612)) {
						var5 = var5.substring(5);
						var7 = 1;
					}
					if (var5 != null && var5.startsWith(field2535)) {
						var5 = var5.substring(5);
						var7 = 2;
					}
					if (var4 == 0) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(chatText[var3], 4, var6, 0);
						}
					}
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var5))) {
						if (var6 > 0 && var6 < 110) {
							int var8 = 4;
							if (var7 == 1) {
								modIcons[0].plotSprite(4, var6 - 12);
								var8 += 14;
							}
							if (var7 == 2) {
								modIcons[1].plotSprite(var8, var6 - 12);
								var8 += 14;
							}
							var2.drawString(JagString.join(new JagString[]{var5, AUTO_COLON}), var8, var6, 0);
							int var9 = var8 + var2.stringWid(var5) + 8;
							var2.drawString(chatText[var3], var9, var6, 255);
						}
						var1++;
					}
					if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(Text.field1215, 4, var6, 0);
							int var10 = var2.stringWid(Text.field1215) + 4;
							int var11 = var10 + var2.charWid(32);
							if (var7 == 1) {
								modIcons[0].plotSprite(var11, var6 - 12);
								var11 += 14;
							}
							if (var7 == 2) {
								modIcons[1].plotSprite(var11, var6 - 12);
								var11 += 14;
							}
							var2.drawString(JagString.join(new JagString[]{var5, AUTO_COLON}), var11, var6, 0);
							int var12 = var11 + var2.stringWid(var5) + 8;
							var2.drawString(chatText[var3], var12, var6, 8388608);
						}
					}
					if (var4 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{var5, field2406, chatText[var3]}), 4, var6, 8388736);
						}
					}
					if (var4 == 5 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(chatText[var3], 4, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 6 && splitPrivateChat == 0 && chatPrivateMode < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{Text.field521, field2406, var5, AUTO_COLON}), 4, var6, 0);
							var2.drawString(chatText[var3], var2.stringWid(JagString.join(new JagString[]{Text.field521, field2406, var5})) + 12, var6, 8388608);
						}
						var1++;
					}
					if (var4 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var5))) {
						var1++;
						if (var6 > 0 && var6 < 110) {
							var2.drawString(JagString.join(new JagString[]{var5, field2406, chatText[var3]}), 4, var6, 8270336);
						}
					}
				}
			}
			Pix2D.setClipping();
			chatScrollHeight = var1 * 14 + 7;
			if (chatScrollHeight < 78) {
				chatScrollHeight = 78;
			}
			drawScrollbar(chatScrollHeight - chatScrollPos - 77, chatScrollHeight, 463, 77, 0);
			JagString var13;
			if (localPlayer == null || localPlayer.name == null) {
				var13 = TitleScreen.loginUser;
			} else {
				var13 = localPlayer.name;
			}
			var2.drawString(JagString.join(new JagString[]{var13, AUTO_COLON}), 4, 90, 0);
			var2.drawString(JagString.join(new JagString[]{chatInput, AUTO_ASTERISK}), var2.stringWid(JagString.join(new JagString[]{var13, AUTO_MINISEPARATOR})) + 6, 90, 255);
			Pix2D.hline(0, 77, 479, 0);
		}
		if (isMenuOpen && menuArea == 2) {
			drawMinimenu();
		}
		canvasDrawChat();
	}

	@ObfuscatedName("bb.a(BLqd;)Z")
	public static boolean clientButton(IfType arg0) {
		int var1 = arg0.clientCode;
		if (friendServerStatus == 2) {
			if (var1 == 201) {
				socialInputType = 1;
				socialInputHeader = Text.field2546;
				socialInputOpen = true;
				dialogInputType = 0;
				socialInput = EMPTY;
				redrawChat = true;
			}
			if (var1 == 202) {
				socialInputType = 2;
				socialInputHeader = Text.field738;
				redrawChat = true;
				dialogInputType = 0;
				socialInputOpen = true;
				socialInput = EMPTY;
			}
		}
		if (var1 == 205) {
			logoutTimer = 250;
			return true;
		}
		if (var1 == 501) {
			dialogInputType = 0;
			socialInputType = 4;
			redrawChat = true;
			socialInputHeader = Text.field2602;
			socialInput = EMPTY;
			socialInputOpen = true;
		}
		if (var1 == 502) {
			redrawChat = true;
			dialogInputType = 0;
			socialInputType = 5;
			socialInputOpen = true;
			socialInput = EMPTY;
			socialInputHeader = Text.field720;
		}
		if (var1 >= 300 && var1 <= 313) {
			int var2 = (var1 - 300) / 2;
			int var3 = var1 & 0x1;
			idkDesign.idkChangePart(var2, var3 == 1);
		}
		if (var1 >= 314 && var1 <= 323) {
			int var4 = (var1 - 314) / 2;
			int var5 = var1 & 0x1;
			idkDesign.idkChangeColour(var5 == 1, var4);
		}
		if (var1 == 324) {
			idkDesign.idkChangeGender(false);
		}
		if (var1 == 325) {
			idkDesign.idkChangeGender(true);
		}
		if (var1 == 326) {
			// IDK_SAVEDESIGN
			out.p1Enc(231);
			idkDesign.idkSaveDesign(out);
			return true;
		}
		if (var1 == 620) {
			reportAbuseMuteOption = !reportAbuseMuteOption;
		}
		if (var1 >= 601 && var1 <= 613) {
			closeModal();
			if (reportAbuseInput.length() > 0) {
				// REPORT_ABUSE
				out.p1Enc(202);
				out.p8(reportAbuseInput.toUserhash());
				out.p1(var1 - 601);
				out.p1(reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("vc.b(Z)V")
	public static void addWorldOptions() {
		int var0 = -1;
		if (useMode == 0 && targetMode == 0) {
			addMenuOption(0, Text.WALKHERE, ClientMouseListener.mouseY, ClientMouseListener.mouseX, 7, EMPTY);
		}
		for (int var1 = 0; var1 < Model.pickedCount; var1++) {
			int var2 = Model.pickedEntityTypecode[var1];
			int var3 = var2 & 0x7F;
			int var4 = var2 >> 7 & 0x7F;
			int var5 = var2 >> 29 & 0x3;
			int var6 = var2 >> 14 & 0x7FFF;
			if (var0 != var2) {
				var0 = var2;
				if (var5 == 2 && world.typecode2(minusedlevel, var3, var4, var2) >= 0) {
					LocType var7 = LocType.list(var6);
					if (var7.multiloc != null) {
						var7 = var7.getMultiLoc();
					}
					if (var7 == null) {
						continue;
					}
					if (useMode == 1) {
						addMenuOption(var2, Text.USE, var4, var3, 5, JagString.join(new JagString[]{field3177, field524, var7.name}));
					} else if (targetMode != 1) {
						JagString[] var8 = var7.op;
						if (showOpIndex) {
							var8 = prependOpIndex(var8);
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
									addMenuOption(var2, var8[var9], var4, var3, var10, JagString.join(new JagString[]{field3136, var7.name}));
								}
							}
						}
						addMenuOption(var7.id << 14, Text.EXAMINE, var4, var3, 1004, JagString.join(new JagString[]{field3136, var7.name}));
					} else if ((targetMask & 0x4) == 4) {
						addMenuOption(var2, targetVerb, var4, var3, 32, JagString.join(new JagString[]{field1384, field524, var7.name}));
					}
				}
				if (var5 == 1) {
					ClientNpc var11 = npc[var6];
					if (var11.type.size == 1 && (var11.x & 0x7F) == 64 && (var11.z & 0x7F) == 64) {
						for (int var12 = 0; var12 < npcCount; var12++) {
							ClientNpc var13 = npc[npcIds[var12]];
							if (var13 != null && var11 != var13 && var13.type.size == 1 && var11.x == var13.x && var11.z == var13.z) {
								addNpcOptions(var3, var4, npcIds[var12], var13.type);
							}
						}
						for (int var14 = 0; var14 < playerCount; var14++) {
							ClientPlayer var15 = players[playerIds[var14]];
							if (var15 != null && var11.x == var15.x && var11.z == var15.z) {
								addPlayerOptions(var4, var3, var15, playerIds[var14]);
							}
						}
					}
					addNpcOptions(var3, var4, var6, var11.type);
				}
				if (var5 == 0) {
					ClientPlayer var16 = players[var6];
					if ((var16.x & 0x7F) == 64 && (var16.z & 0x7F) == 64) {
						for (int var17 = 0; var17 < npcCount; var17++) {
							ClientNpc var18 = npc[npcIds[var17]];
							if (var18 != null && var18.type.size == 1 && var16.x == var18.x && var16.z == var18.z) {
								addNpcOptions(var3, var4, npcIds[var17], var18.type);
							}
						}
						for (int var19 = 0; var19 < playerCount; var19++) {
							ClientPlayer var20 = players[playerIds[var19]];
							if (var20 != null && var16 != var20 && var16.x == var20.x && var16.z == var20.z) {
								addPlayerOptions(var4, var3, var20, playerIds[var19]);
							}
						}
					}
					addPlayerOptions(var4, var3, var16, var6);
				}
				if (var5 == 3) {
					LinkList var21 = groundObj[minusedlevel][var3][var4];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.tail(); var22 != null; var22 = (ClientObj) var21.prev()) {
							ObjType var23 = ObjType.list(var22.id);
							if (useMode == 1) {
								addMenuOption(var22.id, Text.USE, var4, var3, 47, JagString.join(new JagString[]{field3177, field328, var23.name}));
							} else if (targetMode != 1) {
								JagString[] var24 = var23.op;
								if (showOpIndex) {
									var24 = prependOpIndex(var24);
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
										addMenuOption(var22.id, var24[var25], var4, var3, var26, JagString.join(new JagString[]{field2334, var23.name}));
									} else if (var25 == 2) {
										addMenuOption(var22.id, Text.TAKE, var4, var3, 3, JagString.join(new JagString[]{field2334, var23.name}));
									}
								}
								addMenuOption(var22.id, Text.EXAMINE, var4, var3, 1003, JagString.join(new JagString[]{field2334, var23.name}));
							} else if ((targetMask & 0x1) == 1) {
								addMenuOption(var22.id, targetVerb, var4, var3, 15, JagString.join(new JagString[]{field1384, field328, var23.name}));
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pb.e(I)V")
	public static void checkMinimap() {
		if (lowMem && ClientBuild.lastBuiltLevel != minusedlevel) {
			startRebuild(localPlayer.routeX[0], mapBuildCentreZoneZ, mapBuildCentreZoneX, localPlayer.routeZ[0], minusedlevel);
		} else if (minimapLevel != minusedlevel) {
			minimapLevel = minusedlevel;
			minimapBuildBuffer(minusedlevel);
		}
	}

	@ObfuscatedName("fc.a(ILjd;II)V")
	public static void minimapDrawArrow(int arg0, Pix32 arg1, int arg2) {
		int var3 = arg0 * arg0 + arg2 * arg2;
		if (var3 <= 4225 || var3 >= 90000) {
			minimapDrawDot(arg2, arg0, arg1);
			return;
		}
		int var4 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var5 = Model.sinTable[var4];
		int var6 = Model.cosTable[var4];
		int var7 = var5 * 256 / (macroMinimapZoom + 256);
		int var8 = var6 * 256 / (macroMinimapZoom + 256);
		int var9 = arg2 * var8 - arg0 * var7 >> 16;
		int var10 = arg0 * var8 + arg2 * var7 >> 16;
		double var11 = Math.atan2((double) var10, (double) var9);
		int var13 = (int) (Math.sin(var11) * 63.0D);
		int var14 = (int) (Math.cos(var11) * 57.0D);
		mapedge.rotatePlotSprite(var13 + 4 + 94 - 10, -var14 + 83 + -20, var11);
	}

	@ObfuscatedName("kc.a(II)V")
	public static void doAction(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var1 = menuParamB[arg0];
		int var2 = menuParamC[arg0];
		int var3 = menuAction[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		int var4 = menuParamA[arg0];
		if (dialogInputType != 0 && var3 != 1005) {
			dialogInputType = 0;
			redrawChat = true;
		}
		if (var3 == 37) {
			// OPHELDT
			out.p1Enc(21);
			out.p4_alt1(field2949);
			out.p4_alt2(var2);
			out.p2(var4);
			out.p2(var1);
			selectedArea = 2;
			selectedItem = var1;
			selectedCycle = 0;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			selectedComId = var2;
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 38) {
			boolean var5 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var5) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossCycle = 0;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			// OPOBJ2
			out.p1Enc(190);
			out.p2_alt3(var1 + mapBuildBaseX);
			out.p2(var4);
			out.p2(mapBuildBaseZ + var2);
		}
		if (var3 == 1004) {
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossCycle = 0;
			// OPLOCE
			out.p1Enc(148);
			out.p2_alt1(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 27) {
			interactWithLoc(var1, var4, var2);
			// OPLOC4
			out.p1Enc(229);
			out.p2_alt1(mapBuildBaseX + var1);
			out.p2_alt1(var4 >> 14 & 0x7FFF);
			out.p2_alt1(mapBuildBaseZ + var2);
		}
		if (var3 == 1) {
			ClientPlayer var7 = players[var4];
			if (var7 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var7.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var7.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				// OPPLAYERT
				out.p1Enc(221);
				out.p4_alt3(field2949);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 26 || var3 == 46) {
			JagString var8 = menuOption[arg0];
			int var9 = var8.indexOf(field1393);
			if (var9 != -1) {
				JagString var10 = var8.substring(var9 + 5).trim();
				JagString var11 = var10.getRepeatedCharacter().toRawUsername();
				boolean var12 = false;
				for (int var13 = 0; var13 < playerCount; var13++) {
					ClientPlayer var14 = players[playerIds[var13]];
					if (var14 != null && var14.name != null && var14.name.equalsIgnoreCase(var11)) {
						var12 = true;
						tryMove(1, 0, localPlayer.routeX[0], var14.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var14.routeZ[0], 2);
						if (var3 == 26) {
							// OPPLAYER4
							out.p1Enc(96);
							out.p2_alt2(playerIds[var13]);
						}
						if (var3 == 46) {
							// OPPLAYER1
							out.p1Enc(68);
							out.p2_alt1(playerIds[var13]);
						}
						break;
					}
				}
				if (!var12) {
					addChat(0, JagString.join(new JagString[]{Text.UNABLETOFIND, var11}), EMPTY);
				}
			}
		}
		if (var3 == 55) {
			// INV_BUTTON3
			out.p1Enc(26);
			out.p2_alt2(var1);
			out.p4_alt1(var2);
			out.p2_alt2(var4);
			selectedComId = var2;
			selectedCycle = 0;
			selectedItem = var1;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 53) {
			// INV_BUTTON1
			out.p1Enc(38);
			out.p2_alt2(var4);
			out.p2_alt1(var1);
			out.p4_alt3(var2);
			selectedItem = var1;
			selectedArea = 2;
			selectedCycle = 0;
			selectedComId = var2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 57) {
			// IF_BUTTON
			out.p1Enc(64);
			out.p4(var2);
			IfType var15 = IfType.get(var2);
			if (var15.scripts != null && var15.scripts[0][0] == 5) {
				int var16 = var15.scripts[0][1];
				if (VarCache.var[var16] != var15.scriptOperand[0]) {
					VarCache.var[var16] = var15.scriptOperand[0];
					clientVar(var16);
					redrawSide = true;
				}
			}
		}
		if (var3 == 52) {
			// OPHELD1
			out.p1Enc(240);
			out.p2_alt3(var1);
			out.p2_alt1(var4);
			out.p4_alt2(var2);
			selectedItem = var1;
			selectedComId = var2;
			selectedCycle = 0;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 10) {
			ClientPlayer var17 = players[var4];
			if (var17 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var17.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var17.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				// OPPLAYER1
				out.p1Enc(68);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 14) {
			ClientPlayer var18 = players[var4];
			if (var18 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var18.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var18.routeZ[0], 2);
				crossCycle = 0;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				// OPPLAYER4
				out.p1Enc(96);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 1001) {
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossCycle = 0;
			ClientNpc var19 = npc[var4];
			if (var19 != null) {
				NpcType var20 = var19.type;
				if (var20.multinpc != null) {
					var20 = var20.getMultiNpc();
				}
				if (var20 != null) {
					// OPNPCE
					out.p1Enc(247);
					out.p2_alt3(var20.id);
				}
			}
		}
		if (var3 == 22) {
			ClientPlayer var21 = players[var4];
			if (var21 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var21.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var21.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				// OPPLAYERU
				out.p1Enc(110);
				out.p2_alt3(var4);
				out.p4_alt3(useSelectedComId);
				out.p2(objComId);
				out.p2(objSelectedSlot);
			}
		}
		if (var3 == 19) {
			objComId = var4;
			objSelectedSlot = var1;
			useSelectedComId = var2;
			useMode = 1;
			field3177 = JagString.join(new JagString[]{field2334, ObjType.list(var4).name, field1393});
			targetMode = 0;
			if (field3177 == null) {
				field3177 = NULL;
			}
			redrawSide = true;
			return;
		}
		if (var3 == 15) {
			boolean var22 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var22) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossCycle = 0;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			// OPOBJU
			out.p1Enc(168);
			out.p2_alt1(var4);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p4_alt3(field2949);
			out.p2(mapBuildBaseZ + var2);
		}
		if (var3 == 23) {
			// IF_BUTTON
			out.p1Enc(64);
			out.p4(var2);
			IfType var24 = IfType.get(var2);
			if (var24.scripts != null && var24.scripts[0][0] == 5) {
				int var25 = var24.scripts[0][1];
				VarCache.var[var25] = 1 - VarCache.var[var25];
				clientVar(var25);
				redrawSide = true;
			}
		}
		if (var3 == 48) {
			// INV_BUTTON4
			out.p1Enc(147);
			out.p2_alt2(var4);
			out.p2_alt1(var1);
			out.p4_alt1(var2);
			selectedArea = 2;
			selectedItem = var1;
			selectedComId = var2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
			selectedCycle = 0;
		}
		if (var3 == 18) {
			JagString var26 = menuOption[arg0];
			int var27 = var26.indexOf(field1393);
			if (var27 != -1) {
				long var28 = var26.substring(var27 + 5).trim().toUserhash();
				int var30 = -1;
				for (int var31 = 0; var31 < friendCount; var31++) {
					if (friendUserhash[var31] == var28) {
						var30 = var31;
						break;
					}
				}
				if (var30 != -1 && friendWorld[var30] > 0) {
					socialInputType = 3;
					redrawChat = true;
					dialogInputType = 0;
					socialInput = EMPTY;
					socialInputOpen = true;
					socialUserhash = friendUserhash[var30];
					socialInputHeader = JagString.join(new JagString[]{Text.field1873, friendUsername[var30]});
				}
			}
		}
		if (var3 == 1003) {
			crossCycle = 0;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			crossX = ClientMouseListener.mouseClickX;
			// OPOBJE
			out.p1Enc(151);
			out.p2_alt3(var4);
		}
		if (var3 == 1002) {
			interactWithLoc(var1, var4, var2);
			// OPLOC5
			out.p1Enc(62);
			out.p2(var4 >> 14 & 0x7FFF);
			out.p2_alt1(var2 + mapBuildBaseZ);
			out.p2_alt3(mapBuildBaseX + var1);
		}
		if (var3 == 30) {
			ClientNpc var32 = npc[var4];
			if (var32 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var32.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var32.routeZ[0], 2);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossMode = 2;
				// OPNPC2
				out.p1Enc(57);
				out.p2(var4);
			}
		}
		if (var3 == 49) {
			ClientNpc var33 = npc[var4];
			if (var33 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var33.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var33.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossMode = 2;
				// OPNPCU
				out.p1Enc(208);
				out.p2_alt2(var4);
				out.p2_alt2(objComId);
				out.p2_alt3(objSelectedSlot);
				out.p4(useSelectedComId);
			}
		}
		if (var3 == 29) {
			interactWithLoc(var1, var4, var2);
			// OPLOC2
			out.p1Enc(164);
			out.p2_alt3(mapBuildBaseX + var1);
			out.p2_alt3(mapBuildBaseZ + var2);
			out.p2_alt3(var4 >> 14 & 0x7FFF);
		}
		if (var3 == 5 && interactWithLoc(var1, var4, var2)) {
			// OPLOCU
			out.p1Enc(24);
			out.p2_alt3(mapBuildBaseZ + var2);
			out.p2_alt2(objComId);
			out.p2_alt1(var4 >> 14 & 0x7FFF);
			out.p2_alt3(objSelectedSlot);
			out.p4_alt3(useSelectedComId);
			out.p2_alt3(mapBuildBaseX + var1);
		}
		if (var3 == 34) {
			ClientNpc var34 = npc[var4];
			if (var34 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var34.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var34.routeZ[0], 2);
				crossCycle = 0;
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				// OPNPC4
				out.p1Enc(0);
				out.p2_alt2(var4);
			}
		}
		if (var3 == 56) {
			// OPHELDU
			out.p1Enc(40);
			out.p2_alt3(var4);
			out.p2_alt3(var1);
			out.p4_alt1(var2);
			out.p4_alt1(useSelectedComId);
			out.p2_alt1(objComId);
			out.p2_alt2(objSelectedSlot);
			selectedComId = var2;
			selectedCycle = 0;
			selectedItem = var1;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 33) {
			IfType var35 = IfType.get(var2);
			redrawSide = true;
			targetMode = 1;
			targetVerb = var35.targetVerb;
			targetMask = var35.targetMask;
			useMode = 0;
			field2949 = var2;
			field1384 = JagString.join(new JagString[]{field2564, var35.targetBase, field1393});
			if (targetMask == 16) {
				redrawIcons = true;
				activeIcon = 3;
				redrawSide = true;
			}
			return;
		}
		if (var3 == 1007) {
			IfType var36 = IfType.get(var2);
			if (var36 != null && var36.subcomponents != null && var1 != -1) {
				var36 = var36.subcomponents[var1];
			}
			if (var36 == null || var36.invcount < 100000) {
				// OPOBJE
				out.p1Enc(151);
				out.p2_alt3(var4);
			} else {
				addChat(0, JagString.join(new JagString[]{JagString.parseInt(var36.invcount), field3203, ObjType.list(var4).name}), EMPTY);
			}
		}
		if (var3 == 42) {
			IfType var37 = IfType.get(var2);
			boolean var38 = true;
			if (var37.clientCode > 0) {
				var38 = clientButton(var37);
			}
			if (var38) {
				// IF_BUTTON
				out.p1Enc(64);
				out.p4(var2);
			}
		}
		if (var3 == 31) {
			// OPHELD3
			out.p1Enc(163);
			out.p2_alt3(var1);
			out.p2_alt3(var4);
			out.p4(var2);
			selectedItem = var1;
			selectedArea = 2;
			selectedComId = var2;
			selectedCycle = 0;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 12) {
			ClientNpc var39 = npc[var4];
			if (var39 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var39.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var39.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossMode = 2;
				// OPNPC1
				out.p1Enc(63);
				out.p2_alt3(var4);
			}
		}
		if (var3 == 2) {
			boolean var40 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var40) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossMode = 2;
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossY = ClientMouseListener.mouseClickY;
			// OPOBJ1
			out.p1Enc(244);
			out.p2_alt1(var1 + mapBuildBaseX);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p2(var4);
		}
		if (var3 == 3) {
			boolean var42 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var42) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			// OPOBJ3
			out.p1Enc(85);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p2_alt2(var4);
			out.p2_alt1(mapBuildBaseX + var1);
		}
		if (var3 == 21) {
			ClientNpc var44 = npc[var4];
			if (var44 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var44.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var44.routeZ[0], 2);
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				crossMode = 2;
				// OPNPCT
				out.p1Enc(253);
				out.p2(var4);
				out.p4_alt3(field2949);
			}
		}
		if (var3 == 45 || var3 == 51 || var3 == 13 || var3 == 35) {
			JagString var45 = menuOption[arg0];
			int var46 = var45.indexOf(field1393);
			if (var46 != -1) {
				long var47 = var45.substring(var46 + 5).trim().toUserhash();
				if (var3 == 45) {
					addFriend(var47);
				}
				if (var3 == 51) {
					addIgnore(var47);
				}
				if (var3 == 13) {
					delFriend(var47);
				}
				if (var3 == 35) {
					delIgnore(var47);
				}
			}
		}
		if (var3 == 44) {
			ClientPlayer var49 = players[var4];
			if (var49 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var49.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var49.routeZ[0], 2);
				crossMode = 2;
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				// OPPLAYER3
				out.p1Enc(220);
				out.p2(var4);
			}
		}
		if (var3 == 7) {
			if (isMenuOpen) {
				world.updateMousePicking(var1 - 4, var2 + -4);
			} else {
				world.updateMousePicking(ClientMouseListener.mouseClickX - 4, ClientMouseListener.mouseClickY + -4);
			}
		}
		if (var3 == 1006) {
			IfType var50 = IfType.get(var2);
			if (var50 == null || var50.linkObjNumber[var1] < 100000) {
				// OPOBJE
				out.p1Enc(151);
				out.p2_alt3(var4);
			} else {
				addChat(0, JagString.join(new JagString[]{JagString.parseInt(var50.linkObjNumber[var1]), field3203, ObjType.list(var4).name}), EMPTY);
			}
			selectedItem = var1;
			selectedCycle = 0;
			selectedComId = var2;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 17) {
			interactWithLoc(var1, var4, var2);
			// OPLOC3
			out.p1Enc(183);
			out.p2_alt2(var2 + mapBuildBaseZ);
			out.p2(var4 >> 14 & 0x7FFF);
			out.p2_alt2(var1 + mapBuildBaseX);
		}
		if (var3 == 50) {
			ifButtonX(var1, var4, var2);
		}
		if (var3 == 40) {
			closeInterface(tutComId);
			tutComId = -1;
			redrawChat = true;
		}
		if (var3 == 32 && interactWithLoc(var1, var4, var2)) {
			// OPLOCT
			out.p1Enc(225);
			out.p2(var4 >> 14 & 0x7FFF);
			out.p2_alt3(var2 + mapBuildBaseZ);
			out.p4_alt3(field2949);
			out.p2_alt1(mapBuildBaseX + var1);
		}
		if (var3 == 25) {
			// INV_BUTTON2
			out.p1Enc(228);
			out.p2_alt1(var4);
			out.p4_alt1(var2);
			out.p2_alt1(var1);
			selectedCycle = 0;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
			selectedComId = var2;
			selectedItem = var1;
		}
		if (var3 == 11) {
			// OPHELD5
			out.p1Enc(29);
			out.p4_alt3(var2);
			out.p2_alt2(var1);
			out.p2_alt1(var4);
			selectedItem = var1;
			selectedComId = var2;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
			selectedCycle = 0;
		}
		if (var3 == 41) {
			ClientPlayer var51 = players[var4];
			if (var51 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var51.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var51.routeZ[0], 2);
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				// OPPLAYER5
				out.p1Enc(187);
				out.p2_alt3(var4);
			}
		}
		if (var3 == 28) {
			JagString var52 = menuOption[arg0];
			int var53 = var52.indexOf(field1393);
			if (var53 != -1) {
				if (mainModalId == -1) {
					closeModal();
					if (IfType.reportAbuseComId != -1) {
						reportAbuseInput = var52.substring(var53 + 5).trim();
						reportAbuseComId = mainModalId = IfType.reportAbuseComId;
						reportAbuseMuteOption = false;
					}
				} else {
					addChat(0, Text.field1921, EMPTY);
				}
			}
		}
		if (var3 == 8) {
			boolean var54 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var54) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossX = ClientMouseListener.mouseClickX;
			crossCycle = 0;
			crossMode = 2;
			crossY = ClientMouseListener.mouseClickY;
			// OPOBJ4
			out.p1Enc(65);
			out.p2_alt2(var4);
			out.p2_alt2(var2 + mapBuildBaseZ);
			out.p2_alt1(mapBuildBaseX + var1);
		}
		if (var3 == 9) {
			closeModal();
		}
		if (var3 == 54 && resumePauseComId == -1) {
			resumePauseButton(0, var2);
			resumePauseComId = var2;
		}
		if (var3 == 43) {
			// OPHELD4
			out.p1Enc(98);
			out.p2(var1);
			out.p4_alt3(var2);
			out.p2(var4);
			selectedCycle = 0;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			selectedItem = var1;
			selectedComId = var2;
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 36) {
			boolean var56 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var56) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossY = ClientMouseListener.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			crossX = ClientMouseListener.mouseClickX;
			// OPOBJ5
			out.p1Enc(27);
			out.p2(mapBuildBaseX + var1);
			out.p2_alt2(var4);
			out.p2_alt2(mapBuildBaseZ + var2);
		}
		if (var3 == 39) {
			ClientPlayer var58 = players[var4];
			if (var58 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var58.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var58.routeZ[0], 2);
				crossCycle = 0;
				crossX = ClientMouseListener.mouseClickX;
				crossMode = 2;
				crossY = ClientMouseListener.mouseClickY;
				// OPPLAYER2
				out.p1Enc(211);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 24) {
			// INV_BUTTON5
			out.p1Enc(124);
			out.p2(var1);
			out.p4_alt1(var2);
			out.p2(var4);
			selectedComId = var2;
			selectedCycle = 0;
			selectedItem = var1;
			selectedArea = 2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 16) {
			interactWithLoc(var1, var4, var2);
			// OPLOC1
			out.p1Enc(30);
			out.p2_alt2(var4 >> 14 & 0x7FFF);
			out.p2_alt2(mapBuildBaseZ + var2);
			out.p2_alt3(mapBuildBaseX + var1);
		}
		if (var3 == 20) {
			ClientNpc var59 = npc[var4];
			if (var59 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var59.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var59.routeZ[0], 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossY = ClientMouseListener.mouseClickY;
				crossCycle = 0;
				// OPNPC5
				out.p1Enc(153);
				out.p2_alt1(var4);
			}
		}
		if (var3 == 47) {
			boolean var60 = tryMove(0, 0, localPlayer.routeX[0], var1, 0, false, 0, 0, localPlayer.routeZ[0], var2, 2);
			if (!var60) {
				tryMove(1, 0, localPlayer.routeX[0], var1, 0, false, 0, 1, localPlayer.routeZ[0], var2, 2);
			}
			crossX = ClientMouseListener.mouseClickX;
			crossY = ClientMouseListener.mouseClickY;
			crossCycle = 0;
			crossMode = 2;
			// OPOBJU
			out.p1Enc(172);
			out.p2_alt2(mapBuildBaseX + var1);
			out.p2(objSelectedSlot);
			out.p2_alt2(var4);
			out.p4_alt2(useSelectedComId);
			out.p2_alt1(mapBuildBaseZ + var2);
			out.p2_alt1(objComId);
		}
		if (var3 == 6) {
			// OPHELD2
			out.p1Enc(102);
			out.p4_alt1(var2);
			out.p2_alt3(var1);
			out.p2(var4);
			selectedItem = var1;
			selectedCycle = 0;
			selectedArea = 2;
			selectedComId = var2;
			if (var2 >> 16 == mainModalId) {
				selectedArea = 1;
			}
			if (var2 >> 16 == chatModalId) {
				selectedArea = 3;
			}
		}
		if (var3 == 4) {
			ClientNpc var62 = npc[var4];
			if (var62 != null) {
				tryMove(1, 0, localPlayer.routeX[0], var62.routeX[0], 0, false, 0, 1, localPlayer.routeZ[0], var62.routeZ[0], 2);
				crossMode = 2;
				crossX = ClientMouseListener.mouseClickX;
				crossCycle = 0;
				crossY = ClientMouseListener.mouseClickY;
				// OPNPC3
				out.p1Enc(116);
				out.p2_alt1(var4);
			}
		}
		if (useMode != 0) {
			useMode = 0;
			redrawSide = true;
		}
		if (targetMode != 0) {
			redrawSide = true;
			targetMode = 0;
		}
	}

	@ObfuscatedName("re.a(I)V")
	public static void otherOverlays() {
		drawPrivateMessages();
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossX - 4 - 8, crossY - 4 + -8);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossX - 8 - 4, crossY + -4 - 8);
		}
		if (mainOverlayId != -1) {
			animateInterface(mainOverlayId);
			drawInterface(mainOverlayId, 334, 4, 512);
		}
		if (mainModalId != -1) {
			animateInterface(mainModalId);
			drawInterface(mainModalId, 334, 0, 512);
		}
		getSpecialArea();
		if (!isMenuOpen) {
			buildMinimenu();
			drawFeedback();
		} else if (menuArea == 0) {
			drawMinimenu();
		}
		if (inMultizone == 1) {
			overlayMultiway.plotSprite(472, 296);
		}
		if (showFps) {
			byte var0 = 20;
			int var1 = 16776960;
			if (fps < 30 && lowMem) {
				var1 = 16711680;
			}
			if (fps < 20 && !lowMem) {
				var1 = 16711680;
			}
			p12.method210(JagString.join(new JagString[]{AUTO_FPS, JagString.parseInt(fps)}), 20, var1);
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
			p12.method210(JagString.join(new JagString[]{AUTO_MEM, JagString.parseInt(var4), AUTO_MEM_KB}), 35, var2);
			var8 += 15;
			if (debugRedrawSide) {
				p12.method210(field3211, 50, 16711680);
				var8 += 15;
				debugRedrawSide = false;
			}
			if (debugRedrawChat) {
				p12.method210(field2802, var8, 16711680);
				var8 += 15;
				debugRedrawChat = false;
			}
			if (debugRedrawIcons) {
				p12.method210(field3213, var8, 16711680);
				debugRedrawIcons = false;
				var8 += 15;
			}
		}
		if (rebootTimer != 0) {
			int var5 = rebootTimer / 50;
			int var6 = var5 / 60;
			int var7 = var5 % 60;
			if (var7 < 10) {
				p12.drawString(JagString.join(new JagString[]{Text.field3012, JagString.parseInt(var6), field846, JagString.parseInt(var7)}), 4, 329, 16776960);
			} else {
				p12.drawString(JagString.join(new JagString[]{Text.field3012, JagString.parseInt(var6), AUTO_COLON, JagString.parseInt(var7)}), 4, 329, 16776960);
			}
		}
	}

	@ObfuscatedName("kc.d(I)V")
	public static void gameDraw() {
		if (fullredraw) {
			fullredraw = false;
			canvasDrawBack();
			redrawIcons = true;
			redrawChat = true;
			redrawSide = true;
			redrawChatMode = true;
		}
		gameDrawMain();
		if (isMenuOpen && menuArea == 1) {
			redrawSide = true;
		}
		if (sideModalId != -1) {
			boolean var0 = animateInterface(sideModalId);
			if (var0) {
				redrawSide = true;
			}
		}
		if (selectedArea == 2) {
			redrawSide = true;
		}
		if (objDragArea == 2) {
			redrawSide = true;
		}
		if (redrawSide) {
			redrawSide = false;
			drawSide();
		}
		if (chatModalId == -1) {
			chatInterface.scrollPosY = chatScrollHeight - chatScrollPos - 77;
			if (ClientMouseListener.mouseX > 448 && ClientMouseListener.mouseX < 560 && ClientMouseListener.mouseY > 332) {
				doScrollbar(77, ClientMouseListener.mouseY - 357, ClientMouseListener.mouseX + -17, chatScrollHeight, chatInterface, 463, -1, 0);
			}
			int var1 = chatScrollHeight - chatInterface.scrollPosY - 77;
			if (var1 < 0) {
				var1 = 0;
			}
			if (var1 > chatScrollHeight - 77) {
				var1 = chatScrollHeight - 77;
			}
			if (chatScrollPos != var1) {
				chatScrollPos = var1;
				redrawChat = true;
			}
		}
		if (chatModalId == -1 && dialogInputType == 3) {
			chatInterface.scrollPosY = field1390;
			int var2 = field2330 * 14 + 7;
			if (ClientMouseListener.mouseX > 448 && ClientMouseListener.mouseX < 560 && ClientMouseListener.mouseY > 332) {
				doScrollbar(77, ClientMouseListener.mouseY - 357, ClientMouseListener.mouseX + -17, var2, chatInterface, 463, -1, 0);
			}
			int var3 = chatInterface.scrollPosY;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > var2 - 77) {
				var3 = var2 - 77;
			}
			if (field1390 != var3) {
				field1390 = var3;
				redrawChat = true;
			}
		}
		if (chatModalId != -1) {
			boolean var4 = animateInterface(chatModalId);
			if (var4) {
				redrawChat = true;
			}
		}
		if (selectedArea == 3) {
			redrawChat = true;
		}
		if (objDragArea == 3) {
			redrawChat = true;
		}
		if (tutComMessage != null) {
			redrawChat = true;
		}
		if (isMenuOpen && menuArea == 2) {
			redrawChat = true;
		}
		if (redrawChat) {
			redrawChat = false;
			drawChat();
		}
		minimapDraw();
		if (tutFlashIcon != -1) {
			redrawIcons = true;
		}
		if (redrawIcons) {
			if (tutFlashIcon != -1 && activeIcon == tutFlashIcon) {
				tutFlashIcon = -1;
				// TUT_CLICKSIDE (unofficial name)
				out.p1Enc(44);
				out.p1(activeIcon);
			}
			redrawIcons = false;
			debugRedrawIcons = true;
			canvasDrawIcons(activeIcon, sideIcon, sideModalId == -1, loopCycle % 20 >= 10 ? tutFlashIcon : -1);
		}
		if (redrawChatMode) {
			debugRedrawIcons = true;
			redrawChatMode = false;
			canvasDrawChatMode(chatTradeMode, p12, chatPrivateMode, chatPublicMode);
		}
		BgSound.doMix(localPlayer.x, minusedlevel, worldUpdateNum, localPlayer.z);
		worldUpdateNum = 0;
	}

	@ObfuscatedName("bb.a(I)V")
	public static void drawFullscreen() {
		animateInterface(fullModalId1);
		if (fullModalId2 != -1) {
			animateInterface(fullModalId2);
		}
		worldUpdateNum = 0;
		drawArea.bind();
		field92 = Pix2D.restoreClipping(field92);
		Pix2D.cls();
		drawInterface(fullModalId1, 503, 0, 765);
		if (fullModalId2 != -1) {
			drawInterface(fullModalId2, 503, 0, 765);
		}
		if (isMenuOpen) {
			drawMinimenu();
		} else {
			buildMinimenu();
			drawFeedback();
		}
		try {
			Graphics var0 = canvas.getGraphics();
			drawArea.draw(0, var0, 0);
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
					field3132 = in.g8();
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
				out.rsaenc(LOGIN_RSAN, LOGIN_RSAE);
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
				TitleScreen.loginMes(JagString.join(new JagString[]{JagString.parseInt(loginHopTimer / 60), Text.LOGINHOP_C}), Text.LOGINHOP_A, Text.LOGINHOP_B);
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
					mapBuildCentreZoneX = -1;
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
			TitleScreen.loginMes(Text.LOGINM3_C, Text.LOGINM3_A, Text.LOGINM3_B);
		} else if (arg0 == -2) {
			TitleScreen.loginMes(Text.LOGINM2_C, Text.LOGINM2_A, Text.LOGINM2_B);
		} else if (arg0 == -1) {
			TitleScreen.loginMes(Text.LOGINM1_C, Text.LOGINM1_A, Text.LOGINM1_B);
		} else if (arg0 == 3) {
			TitleScreen.loginMes(Text.LOGIN3_C, Text.LOGIN3_A, Text.LOGIN3_B);
		} else if (arg0 == 4) {
			TitleScreen.loginMes(Text.LOGIN4_C, Text.LOGIN4_A, Text.LOGIN4_B);
		} else if (arg0 == 5) {
			TitleScreen.loginMes(Text.LOGIN5_C, Text.LOGIN5_A, Text.LOGIN5_B);
		} else if (arg0 == 6) {
			TitleScreen.loginMes(Text.LOGIN6_C, Text.LOGIN6_A, Text.LOGIN6_B);
		} else if (arg0 == 7) {
			TitleScreen.loginMes(Text.LOGIN7_C, Text.LOGIN7_A, Text.LOGIN7_B);
		} else if (arg0 == 8) {
			TitleScreen.loginMes(Text.LOGIN8_C, Text.LOGIN8_A, Text.LOGIN8_B);
		} else if (arg0 == 9) {
			TitleScreen.loginMes(Text.LOGIN9_C, Text.LOGIN9_A, Text.LOGIN9_B);
		} else if (arg0 == 10) {
			TitleScreen.loginMes(Text.LOGIN10_C, Text.LOGIN10_A, Text.LOGIN10_B);
		} else if (arg0 == 11) {
			TitleScreen.loginMes(Text.LOGIN11_C, Text.LOGIN11_A, Text.LOGIN11_B);
		} else if (arg0 == 12) {
			TitleScreen.loginMes(Text.LOGIN12_C, Text.LOGIN12_A, Text.LOGIN12_B);
		} else if (arg0 == 13) {
			TitleScreen.loginMes(Text.LOGIN13_C, Text.LOGIN13_A, Text.LOGIN13_B);
		} else if (arg0 == 14) {
			TitleScreen.loginMes(Text.LOGIN14_C, Text.LOGIN14_A, Text.LOGIN14_B);
		} else if (arg0 == 16) {
			TitleScreen.loginMes(Text.LOGIN16_C, Text.LOGIN16_A, Text.LOGIN16_B);
		} else if (arg0 == 17) {
			TitleScreen.loginMes(Text.LOGIN17_C, Text.LOGIN17_A, Text.LOGIN17_B);
		} else if (arg0 == 18) {
			TitleScreen.loginMes(Text.LOGIN18_C, Text.LOGIN18_A, Text.LOGIN18_B);
		} else if (arg0 == 20) {
			TitleScreen.loginMes(Text.LOGIN20_C, Text.LOGIN20_A, Text.LOGIN20_B);
		} else if (arg0 == 22) {
			TitleScreen.loginMes(Text.LOGIN22_C, Text.LOGIN22_A, Text.LOGIN22_B);
		} else if (arg0 == 23) {
			TitleScreen.loginMes(Text.LOGIN23_C, Text.LOGIN23_A, Text.LOGIN23_B);
		} else if (arg0 == 24) {
			TitleScreen.loginMes(Text.LOGIN24_C, Text.LOGIN24_A, Text.LOGIN24_B);
		} else if (arg0 == 25) {
			TitleScreen.loginMes(Text.LOGIN25_C, Text.LOGIN25_A, Text.LOGIN25_B);
		} else if (arg0 == 26) {
			TitleScreen.loginMes(Text.LOGIN26_C, Text.LOGIN26_A, Text.LOGIN26_B);
		} else if (arg0 == 27) {
			TitleScreen.loginMes(Text.LOGIN27_C, Text.LOGIN27_A, Text.LOGIN27_B);
		} else {
			TitleScreen.loginMes(Text.LOGINMIS_C, Text.LOGINMIS_A, Text.LOGINMIS_B);
		}
		setMainState(10);
	}

	@ObfuscatedName("client.j(I)V")
	public static void loginDone() {
		prevMouseClickTime = 0L;
		mouseTracking.length = 0;
		mouseTrackDelta = 0;
		focusIn = true;
		focus = true;
		ReflectionChecker.method469();
		ptype1 = -1;
		isMenuOpen = false;
		ptype0 = -1;
		ptype = -1;
		rebootTimer = 0;
		timeoutTimer = 0;
		hintType = 0;
		out.pos = 0;
		logoutTimer = 0;
		ptype2 = -1;
		in.pos = 0;
		menuNumEntries = 0;
		ClientMouseListener.setIdleTimer(0);
		for (int var0 = 0; var0 < 100; var0++) {
			chatText[var0] = null;
		}
		useMode = 0;
		macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
		macroCameraZ = (int) (Math.random() * 110.0D) - 55;
		minimapFlagX = 0;
		macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
		minimapLevel = -1;
		npcCount = 0;
		waveCount = 0;
		targetMode = 0;
		orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
		minimapState = 0;
		macroCameraX = (int) (Math.random() * 100.0D) - 50;
		playerCount = 0;
		minimapFlagZ = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			players[var1] = null;
			playerAppearanceBuffer[var1] = null;
		}
		for (int var2 = 0; var2 < 32768; var2++) {
			npc[var2] = null;
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
		closeInterface(tutComId);
		tutComId = -1;
		closeInterface(chatModalId);
		chatModalId = -1;
		closeInterface(mainModalId);
		mainModalId = -1;
		closeInterface(fullModalId1);
		fullModalId1 = -1;
		closeInterface(fullModalId2);
		fullModalId2 = -1;
		closeInterface(sideModalId);
		sideModalId = -1;
		closeInterface(mainOverlayId);
		dialogInputType = 0;
		socialInputOpen = false;
		isMenuOpen = false;
		mainOverlayId = -1;
		tutComMessage = null;
		resumePauseComId = -1;
		tutFlashIcon = -1;
		inMultizone = 0;
		activeIcon = 3;
		idkDesign.setAppearance(null, false, new int[5], -1);
		for (int var6 = 0; var6 < 5; var6++) {
			playerOp[var6] = null;
			playerOpPriority[var6] = false;
		}
		js5Loading = true;
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
		int var0 = menuX;
		int var1 = menuHeight;
		int var2 = menuY;
		int var3 = menuWidth;
		Pix2D.fillRect(var0, var2, var3, var1, 6116423);
		Pix2D.fillRect(var0 + 1, var2 + 1, var3 - 2, 16, 0);
		Pix2D.drawRect(var0 + 1, var2 + 18, var3 - 2, var1 + -19, 0);
		b12.drawString(Text.CHOOSEOPTION, var0 + 3, var2 + 14, 6116423);
		int var4 = ClientMouseListener.mouseX;
		int var5 = ClientMouseListener.mouseY;
		if (menuArea == 0) {
			var4 -= 4;
			var5 -= 4;
		}
		if (menuArea == 1) {
			var5 -= 205;
			var4 -= 553;
		}
		if (menuArea == 2) {
			var5 -= 357;
			var4 -= 17;
		}
		for (int var6 = 0; var6 < menuNumEntries; var6++) {
			int var7 = (menuNumEntries - var6 - 1) * 15 + var2 + 31;
			int var8 = 16777215;
			if (var4 > var0 && var0 + var3 > var4 && var5 > var7 - 13 && var7 + 3 > var5) {
				var8 = 16776960;
			}
			b12.drawString(menuOption[var6], var0 + 3, var7, var8, true);
		}
	}

	@ObfuscatedName("a.e(I)V")
	public static void getSpecialArea() {
		chatDisabled = 0;
		int var0 = (localPlayer.x >> 7) + mapBuildBaseX;
		int var1 = (localPlayer.z >> 7) + mapBuildBaseZ;
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
	public static void cinemaCamera() {
		int var0 = camMoveToLz * 128 + 64;
		int var1 = camMoveToLx * 128 + 64;
		int var2 = getAvH(minusedlevel, var1, var0) - camMoveToHei;
		if (var1 > camX) {
			camX += (var1 - camX) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camX > var1) {
				camX = var1;
			}
		}
		if (var2 > camY) {
			camY += (var2 - camY) * camMoveToRate2 / 1000 + camMoveToRate;
			if (var2 < camY) {
				camY = var2;
			}
		}
		if (camX > var1) {
			camX -= camMoveToRate + (camX - var1) * camMoveToRate2 / 1000;
			if (var1 > camX) {
				camX = var1;
			}
		}
		if (camZ < var0) {
			camZ += camMoveToRate + (var0 - camZ) * camMoveToRate2 / 1000;
			if (camZ > var0) {
				camZ = var0;
			}
		}
		if (camY > var2) {
			camY -= (camY - var2) * camMoveToRate2 / 1000 + camMoveToRate;
			if (var2 > camY) {
				camY = var2;
			}
		}
		int var3 = camLookAtLx * 128 + 64;
		if (camZ > var0) {
			camZ -= (camZ - var0) * camMoveToRate2 / 1000 + camMoveToRate;
			if (camZ < var0) {
				camZ = var0;
			}
		}
		int var4 = camLookAtLz * 128 + 64;
		int var5 = getAvH(minusedlevel, var3, var4) - camLookAtHei;
		int var6 = var5 - camY;
		int var7 = var4 - camZ;
		int var8 = var3 - camX;
		int var9 = (int) Math.sqrt((double) (var8 * var8 + var7 * var7));
		int var10 = (int) (Math.atan2((double) var6, (double) var9) * 325.949D) & 0x7FF;
		if (var10 < 128) {
			var10 = 128;
		}
		int var11 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
		if (var10 > 383) {
			var10 = 383;
		}
		int var12 = var11 - camYaw;
		if (var12 > 1024) {
			var12 -= 2048;
		}
		if (var12 < -1024) {
			var12 += 2048;
		}
		if (var12 > 0) {
			camYaw += camLookAtRate2 * var12 / 1000 + camLookAtRate;
			camYaw &= 0x7FF;
		}
		if (var12 < 0) {
			camYaw -= camLookAtRate + -var12 * camLookAtRate2 / 1000;
			camYaw &= 0x7FF;
		}
		if (var10 > camPitch) {
			camPitch += (var10 - camPitch) * camLookAtRate2 / 1000 + camLookAtRate;
			if (camPitch > var10) {
				camPitch = var10;
			}
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

	@ObfuscatedName("n.b(I)V")
	public static void reconnectDone() {
		isMenuOpen = false;
		ptype = -1;
		menuNumEntries = 0;
		psize = 0;
		out.pos = 0;
		ptype0 = -1;
		ptype1 = -1;
		timeoutTimer = 0;
		ptype2 = -1;
		minimapFlagX = 0;
		minimapState = 0;
		rebootTimer = 0;
		in.pos = 0;
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
		setMainState(30);
	}

	@ObfuscatedName("cd.b(I)V")
	public static void drawPrivateMessages() {
		if (splitPrivateChat == 0) {
			return;
		}
		PixFont var0 = p12;
		int var1 = 0;
		if (rebootTimer != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (chatText[var2] != null) {
				JagString var3 = chatUsername[var2];
				byte var4 = 0;
				int var5 = chatType[var2];
				if (var3 != null && var3.startsWith(field2612)) {
					var3 = var3.substring(5);
					var4 = 1;
				}
				if (var3 != null && var3.startsWith(field2535)) {
					var3 = var3.substring(5);
					var4 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var3))) {
					int var6 = 329 - var1 * 13;
					var1++;
					var0.drawString(Text.field1215, 4, var6, 0);
					var0.drawString(Text.field1215, 4, var6 - 1, 65535);
					int var7 = var0.stringWid(Text.field1215) + 4;
					int var8 = var7 + var0.charWid(32);
					if (var4 == 1) {
						modIcons[0].plotSprite(var8, var6 - 12);
						var8 += 14;
					}
					if (var4 == 2) {
						modIcons[1].plotSprite(var8, var6 - 12);
						var8 += 14;
					}
					var0.drawString(JagString.join(new JagString[]{var3, AUTO_MINISEPARATOR, chatText[var2]}), var8, var6, 0);
					var0.drawString(JagString.join(new JagString[]{var3, AUTO_MINISEPARATOR, chatText[var2]}), var8, var6 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 5 && chatPrivateMode < 2) {
					int var9 = 329 - var1 * 13;
					var1++;
					var0.drawString(chatText[var2], 4, var9, 0);
					var0.drawString(chatText[var2], 4, var9 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
				if (var5 == 6 && chatPrivateMode < 2) {
					int var10 = 329 - var1 * 13;
					var1++;
					var0.drawString(JagString.join(new JagString[]{Text.field521, field2406, var3, AUTO_MINISEPARATOR, chatText[var2]}), 4, var10, 0);
					var0.drawString(JagString.join(new JagString[]{Text.field521, field2406, var3, AUTO_MINISEPARATOR, chatText[var2]}), 4, var10 - 1, 65535);
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("k.c(I)V")
	public static void addPrivateChatOptions() {
		if (splitPrivateChat == 0) {
			return;
		}
		int var0 = 0;
		if (rebootTimer != 0) {
			var0 = 1;
		}
		for (int var1 = 0; var1 < 100; var1++) {
			if (chatText[var1] != null) {
				int var2 = chatType[var1];
				JagString var3 = chatUsername[var1];
				if (var3 != null && var3.startsWith(field2612)) {
					var3 = var3.substring(5);
				}
				if (var3 != null && var3.startsWith(field2535)) {
					var3 = var3.substring(5);
				}
				if ((var2 == 3 || var2 == 7) && (var2 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var3))) {
					int var4 = 329 - var0 * 13;
					var0++;
					if (ClientMouseListener.mouseX > 4 && var4 - 10 < ClientMouseListener.mouseY + -4 && ClientMouseListener.mouseY - 4 <= var4 + 3) {
						int var5 = p12.stringWid(JagString.join(new JagString[]{Text.field1215, field713, var3, chatText[var1]})) + 25;
						if (var5 > 450) {
							var5 = 450;
						}
						if (ClientMouseListener.mouseX < var5 + 4) {
							if (staffmodlevel >= 1) {
								addMenuOption(0, Text.field1038, 0, 0, 2028, JagString.join(new JagString[]{field1393, var3}));
							}
							addMenuOption(0, Text.field1933, 0, 0, 2051, JagString.join(new JagString[]{field1393, var3}));
							addMenuOption(0, Text.field1364, 0, 0, 2045, JagString.join(new JagString[]{field1393, var3}));
						}
					}
					if (var0 >= 5) {
						return;
					}
				}
				if ((var2 == 5 || var2 == 6) && chatPrivateMode < 2) {
					var0++;
					if (var0 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("je.b(Z)V")
	public static void followCamera() {
		int var0 = macroCameraZ + localPlayer.z;
		int var1 = macroCameraX + localPlayer.x;
		if (orbitCameraX - var1 < -500 || orbitCameraX - var1 > 500 || orbitCameraZ - var0 < -500 || orbitCameraZ - var0 > 500) {
			orbitCameraZ = var0;
			orbitCameraX = var1;
		}
		if (orbitCameraX != var1) {
			orbitCameraX += (var1 - orbitCameraX) / 16;
		}
		if (orbitCameraZ != var0) {
			orbitCameraZ += (var0 - orbitCameraZ) / 16;
		}
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
		int var2 = orbitCameraZ >> 7;
		orbitCameraYaw = orbitCameraYawVelocity / 2 + orbitCameraYaw & 0x7FF;
		int var3 = orbitCameraX >> 7;
		orbitCameraPitch += orbitCameraPitchVelocity / 2;
		int var4 = 0;
		if (orbitCameraPitch < 128) {
			orbitCameraPitch = 128;
		}
		if (orbitCameraPitch > 383) {
			orbitCameraPitch = 383;
		}
		int var5 = getAvH(minusedlevel, orbitCameraX, orbitCameraZ);
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
		if (cameraPitchClamp < var10) {
			cameraPitchClamp += (var10 - cameraPitchClamp) / 24;
		} else if (cameraPitchClamp > var10) {
			cameraPitchClamp += (var10 - cameraPitchClamp) / 80;
			return;
		}
	}

	@ObfuscatedName("id.a(ZI)V")
	public static void rebuildPacket(boolean arg0) {
		regionmode = arg0;
		if (!regionmode) {
			int var24 = in.g2();
			int var25 = in.g2_alt1();
			int var26 = in.g2_alt2();
			int var27 = in.g2_alt3();
			int var28 = in.g1_alt2();
			int var29 = (psize - in.pos) / 16;
			mapKeys = new int[var29][4];
			for (int var30 = 0; var30 < var29; var30++) {
				for (int var31 = 0; var31 < 4; var31++) {
					mapKeys[var30][var31] = in.g4_alt3();
				}
			}
			mapBuildIndex = new int[var29];
			mapBuildGroundData = new byte[var29][];
			boolean var32 = false;
			mapBuildLocationData = new byte[var29][];
			if ((var25 / 8 == 48 || var25 / 8 == 49) && var27 / 8 == 48) {
				var32 = true;
			}
			mapBuildGroundFile = new int[var29];
			if (var25 / 8 == 48 && var27 / 8 == 148) {
				var32 = true;
			}
			mapBuildLocationFile = new int[var29];
			int var33 = 0;
			for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
				for (int var35 = (var27 - 6) / 8; var35 <= (var27 + 6) / 8; var35++) {
					int var36 = (var34 << 8) + var35;
					if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
						mapBuildIndex[var33] = var36;
						mapBuildGroundFile[var33] = maps.getGroupId(JagString.join(new JagString[]{field2305, JagString.parseInt(var34), field477, JagString.parseInt(var35)}));
						mapBuildLocationFile[var33] = maps.getGroupId(JagString.join(new JagString[]{field1259, JagString.parseInt(var34), field477, JagString.parseInt(var35)}));
						var33++;
					}
				}
			}
			startRebuild(var26, var27, var25, var24, var28);
		} else {
			int var1 = in.g2();
			int var2 = in.g2_alt3();
			int var3 = in.g2();
			int var4 = in.g1_alt3();
			int var5 = in.g2();
			in.gBitStart();
			for (int var6 = 0; var6 < 4; var6++) {
				for (int var7 = 0; var7 < 13; var7++) {
					for (int var8 = 0; var8 < 13; var8++) {
						int var9 = in.gBit(1);
						if (var9 == 1) {
							mapBuildRegionSrc[var6][var7][var8] = in.gBit(26);
						} else {
							mapBuildRegionSrc[var6][var7][var8] = -1;
						}
					}
				}
			}
			in.gBitEnd();
			int var10 = (psize - in.pos) / 16;
			mapKeys = new int[var10][4];
			for (int var11 = 0; var11 < var10; var11++) {
				for (int var12 = 0; var12 < 4; var12++) {
					mapKeys[var11][var12] = in.g4_alt2();
				}
			}
			mapBuildGroundFile = new int[var10];
			mapBuildGroundData = new byte[var10][];
			mapBuildLocationFile = new int[var10];
			mapBuildLocationData = new byte[var10][];
			mapBuildIndex = new int[var10];
			int var13 = 0;
			for (int var14 = 0; var14 < 4; var14++) {
				for (int var15 = 0; var15 < 13; var15++) {
					for (int var16 = 0; var16 < 13; var16++) {
						int var17 = mapBuildRegionSrc[var14][var15][var16];
						if (var17 != -1) {
							int var18 = var17 >> 14 & 0x3FF;
							int var19 = var17 >> 3 & 0x7FF;
							int var20 = (var18 / 8 << 8) + var19 / 8;
							for (int var21 = 0; var21 < var13; var21++) {
								if (mapBuildIndex[var21] == var20) {
									var20 = -1;
									break;
								}
							}
							if (var20 != -1) {
								mapBuildIndex[var13] = var20;
								int var22 = var20 & 0xFF;
								int var23 = var20 >> 8 & 0xFF;
								mapBuildGroundFile[var13] = maps.getGroupId(JagString.join(new JagString[]{field2305, JagString.parseInt(var23), field477, JagString.parseInt(var22)}));
								mapBuildLocationFile[var13] = maps.getGroupId(JagString.join(new JagString[]{field1259, JagString.parseInt(var23), field477, JagString.parseInt(var22)}));
								var13++;
							}
						}
					}
				}
			}
			startRebuild(var2, var5, var3, var1, var4);
		}
	}

	@ObfuscatedName("tc.a(I)V")
	public static void lostCon() {
		if (logoutTimer > 0) {
			logout();
		} else {
			setMainState(40);
			prevStream = stream;
			stream = null;
		}
	}

	@ObfuscatedName("ae.a(I)V")
	public static void soundsDoQueue() {
		for (int var0 = 0; var0 < waveCount; var0++) {
			int var10002 = waveDelay[var0]--;
			if (waveDelay[var0] >= -10) {
				JagFX var2 = waveSounds[var0];
				if (var2 == null) {
					var2 = JagFX.load(jagFX, waveSoundIds[var0]);
					if (var2 == null) {
						continue;
					}
					waveDelay[var0] += var2.optimiseStart();
					waveSounds[var0] = var2;
				}
				if (waveDelay[var0] < 0) {
					int var9;
					if (waveAmbient[var0] == 0) {
						var9 = waveVolume;
					} else {
						int var3 = (waveAmbient[var0] & 0xFF) * 128;
						int var4 = waveAmbient[var0] >> 16 & 0xFF;
						int var5 = waveAmbient[var0] >> 8 & 0xFF;
						int var6 = var5 * 128 + 64 - localPlayer.z;
						int var7 = var4 * 128 + 64 - localPlayer.x;
						if (var7 < 0) {
							var7 = -var7;
						}
						if (var6 < 0) {
							var6 = -var6;
						}
						int var8 = var6 + var7 - 128;
						if (var8 > var3) {
							waveDelay[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var9 = (var3 - var8) * ambientVolume / var3;
					}
					Wave var10 = var2.toWave().decimate(soundDecimator);
					WaveStream var11 = WaveStream.newRatePercent(var10, var9);
					var11.setLoopCount(waveLoops[var0] - 1);
					soundMixer.playStream(var11);
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
		if (nextMusicDelay > 0) {
			nextMusicDelay -= 20;
			if (nextMusicDelay < 0) {
				nextMusicDelay = 0;
			}
			if (nextMusicDelay == 0 && midiVolume != 0 && nextMidiSong != -1) {
				MidiManager.play(0, nextMidiSong, midiVolume, songs);
			}
		}
	}

	@ObfuscatedName("f.a(I)V")
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
				moveEntity(var2, 1);
			}
		}
	}

	@ObfuscatedName("ob.a(Z)V")
	public static void buildMinimenu() {
		if (objDragArea != 0) {
			return;
		}
		menuOption[0] = Text.CANCEL;
		menuAction[0] = 1005;
		menuNumEntries = 1;
		if (fullModalId1 != -1) {
			field1497 = -1;
			lastOverComId = -1;
			addComponentOptions(0, 765, 503, fullModalId1, 0, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 0);
			field2881 = lastOverComId;
			field1279 = field1497;
			return;
		}
		addPrivateChatOptions();
		field1497 = -1;
		lastOverComId = -1;
		boolean var0 = false;
		if (ClientMouseListener.mouseX > 4 && ClientMouseListener.mouseY > 4 && ClientMouseListener.mouseX < 516 && ClientMouseListener.mouseY < 338) {
			if (mainModalId == -1) {
				addWorldOptions();
			} else {
				addComponentOptions(4, 516, 338, mainModalId, 4, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 0);
			}
		}
		field1279 = field1497;
		field2881 = lastOverComId;
		field1497 = -1;
		lastOverComId = -1;
		if (ClientMouseListener.mouseX > 553 && ClientMouseListener.mouseY > 205 && ClientMouseListener.mouseX < 743 && ClientMouseListener.mouseY < 466) {
			if (sideModalId != -1) {
				addComponentOptions(205, 743, 466, sideModalId, 553, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 1);
			} else if (sideIcon[activeIcon] != -1) {
				addComponentOptions(205, 743, 466, sideIcon[activeIcon], 553, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 1);
			}
		}
		if (overSideComId != lastOverComId) {
			redrawSide = true;
			overSideComId = lastOverComId;
		}
		lastOverComId = -1;
		if (field1497 != field1387) {
			field1387 = field1497;
			redrawSide = true;
		}
		field1497 = -1;
		if (ClientMouseListener.mouseX > 17 && ClientMouseListener.mouseY > 357 && ClientMouseListener.mouseX < 496 && ClientMouseListener.mouseY < 453) {
			if (chatModalId != -1) {
				addComponentOptions(357, 496, 453, chatModalId, 17, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 2);
			} else if (tutComId != -1) {
				addComponentOptions(357, 496, 453, tutComId, 17, ClientMouseListener.mouseX, ClientMouseListener.mouseY, 3);
			} else if (ClientMouseListener.mouseY < 434 && ClientMouseListener.mouseX < 426) {
				drawChat(ClientMouseListener.mouseX - 17, ClientMouseListener.mouseY + -357);
			}
		}
		if ((chatModalId != -1 || tutComId != -1) && lastOverComId != overChatComId) {
			redrawChat = true;
			overChatComId = lastOverComId;
		}
		if ((chatModalId != -1 || tutComId != -1) && field1497 != field3253) {
			redrawChat = true;
			field3253 = field1497;
		}
		while (!var0) {
			var0 = true;
			for (int var1 = 0; var1 < menuNumEntries - 1; var1++) {
				if (menuAction[var1] < 1000 && menuAction[var1 + 1] > 1000) {
					var0 = false;
					JagString var2 = menuOption[var1];
					menuOption[var1] = menuOption[var1 + 1];
					menuOption[var1 + 1] = var2;
					int var3 = menuAction[var1];
					menuAction[var1] = menuAction[var1 + 1];
					menuAction[var1 + 1] = var3;
					int var4 = menuParamB[var1];
					menuParamB[var1] = menuParamB[var1 + 1];
					menuParamB[var1 + 1] = var4;
					int var5 = menuParamC[var1];
					menuParamC[var1] = menuParamC[var1 + 1];
					menuParamC[var1 + 1] = var5;
					int var6 = menuParamA[var1];
					menuParamA[var1] = menuParamA[var1 + 1];
					menuParamA[var1 + 1] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ub.a(I)V")
	public static void mouseLoop() {
		if (objDragArea != 0) {
			return;
		}
		int var0 = ClientMouseListener.mouseClickButton;
		if (targetMode == 1 && ClientMouseListener.mouseClickX >= 516 && ClientMouseListener.mouseClickY >= 160 && ClientMouseListener.mouseClickX <= 765 && ClientMouseListener.mouseClickY <= 205) {
			var0 = 0;
		}
		if (!isMenuOpen) {
			if (var0 == 1 && menuNumEntries > 0) {
				int var1 = menuAction[menuNumEntries - 1];
				if (var1 == 53 || var1 == 25 || var1 == 55 || var1 == 48 || var1 == 24 || var1 == 52 || var1 == 6 || var1 == 31 || var1 == 43 || var1 == 11 || var1 == 19 || var1 == 1006) {
					int var2 = menuParamB[menuNumEntries - 1];
					int var3 = menuParamC[menuNumEntries - 1];
					IfType var4 = IfType.get(var3);
					if (var4.objSwap || var4.objReplace) {
						objGrabX = ClientMouseListener.mouseClickX;
						objGrabThreshold = false;
						objDragArea = 2;
						objDragComId = var3;
						objGrabY = ClientMouseListener.mouseClickY;
						objDragSlot = var2;
						if (var3 >> 16 == mainModalId) {
							objDragArea = 1;
						}
						if (var3 >> 16 == chatModalId) {
							objDragArea = 3;
						}
						objDragCycles = 0;
						return;
					}
				}
			}
			if (var0 == 1 && (oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
				var0 = 2;
			}
			if (var0 == 1 && menuNumEntries > 0) {
				doAction(menuNumEntries - 1);
			}
			if (var0 == 2 && menuNumEntries > 0) {
				openMenu();
			}
			return;
		}
		if (var0 != 1) {
			int var5 = ClientMouseListener.mouseX;
			int var6 = ClientMouseListener.mouseY;
			if (menuArea == 0) {
				var5 -= 4;
				var6 -= 4;
			}
			if (menuArea == 1) {
				var6 -= 205;
				var5 -= 553;
			}
			if (menuArea == 2) {
				var6 -= 357;
				var5 -= 17;
			}
			if (menuX - 10 > var5 || menuWidth + menuX + 10 < var5 || var6 < menuY - 10 || var6 > menuY + menuHeight + 10) {
				if (menuArea == 1) {
					redrawSide = true;
				}
				isMenuOpen = false;
				if (menuArea == 2) {
					redrawChat = true;
				}
			}
		}
		if (var0 == 1) {
			int var7 = menuX;
			int var8 = menuY;
			int var9 = menuWidth;
			int var10 = ClientMouseListener.mouseClickX;
			int var11 = -1;
			int var12 = ClientMouseListener.mouseClickY;
			if (menuArea == 0) {
				var10 -= 4;
				var12 -= 4;
			}
			if (menuArea == 1) {
				var10 -= 553;
				var12 -= 205;
			}
			if (menuArea == 2) {
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
				doAction(var11);
			}
			if (menuArea == 1) {
				redrawSide = true;
			}
			isMenuOpen = false;
			if (menuArea == 2) {
				redrawChat = true;
			}
		}
	}

	@ObfuscatedName("k.c(B)V")
	public static void iconLoop() {
		if (ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		if (ClientMouseListener.mouseClickX >= 539 && ClientMouseListener.mouseClickX <= 573 && ClientMouseListener.mouseClickY >= 169 && ClientMouseListener.mouseClickY < 205 && sideIcon[0] != -1) {
			redrawIcons = true;
			redrawSide = true;
			activeIcon = 0;
		}
		if (ClientMouseListener.mouseClickX >= 569 && ClientMouseListener.mouseClickX <= 599 && ClientMouseListener.mouseClickY >= 168 && ClientMouseListener.mouseClickY < 205 && sideIcon[1] != -1) {
			activeIcon = 1;
			redrawSide = true;
			redrawIcons = true;
		}
		if (ClientMouseListener.mouseClickX >= 597 && ClientMouseListener.mouseClickX <= 627 && ClientMouseListener.mouseClickY >= 168 && ClientMouseListener.mouseClickY < 205 && sideIcon[2] != -1) {
			redrawIcons = true;
			activeIcon = 2;
			redrawSide = true;
		}
		if (ClientMouseListener.mouseClickX >= 625 && ClientMouseListener.mouseClickX <= 669 && ClientMouseListener.mouseClickY >= 168 && ClientMouseListener.mouseClickY < 203 && sideIcon[3] != -1) {
			redrawIcons = true;
			redrawSide = true;
			activeIcon = 3;
		}
		if (ClientMouseListener.mouseClickX >= 666 && ClientMouseListener.mouseClickX <= 696 && ClientMouseListener.mouseClickY >= 168 && ClientMouseListener.mouseClickY < 205 && sideIcon[4] != -1) {
			activeIcon = 4;
			redrawSide = true;
			redrawIcons = true;
		}
		if (ClientMouseListener.mouseClickX >= 694 && ClientMouseListener.mouseClickX <= 724 && ClientMouseListener.mouseClickY >= 168 && ClientMouseListener.mouseClickY < 205 && sideIcon[5] != -1) {
			redrawIcons = true;
			redrawSide = true;
			activeIcon = 5;
		}
		if (ClientMouseListener.mouseClickX >= 722 && ClientMouseListener.mouseClickX <= 756 && ClientMouseListener.mouseClickY >= 169 && ClientMouseListener.mouseClickY < 205 && sideIcon[6] != -1) {
			redrawSide = true;
			activeIcon = 6;
			redrawIcons = true;
		}
		if (ClientMouseListener.mouseClickX >= 540 && ClientMouseListener.mouseClickX <= 574 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 502 && sideIcon[7] != -1) {
			activeIcon = 7;
			redrawIcons = true;
			redrawSide = true;
		}
		if (ClientMouseListener.mouseClickX >= 572 && ClientMouseListener.mouseClickX <= 602 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 503 && sideIcon[8] != -1) {
			redrawSide = true;
			redrawIcons = true;
			activeIcon = 8;
		}
		if (ClientMouseListener.mouseClickX >= 599 && ClientMouseListener.mouseClickX <= 629 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 503 && sideIcon[9] != -1) {
			redrawIcons = true;
			activeIcon = 9;
			redrawSide = true;
		}
		if (ClientMouseListener.mouseClickX >= 627 && ClientMouseListener.mouseClickX <= 671 && ClientMouseListener.mouseClickY >= 467 && ClientMouseListener.mouseClickY < 502 && sideIcon[10] != -1) {
			activeIcon = 10;
			redrawIcons = true;
			redrawSide = true;
		}
		if (ClientMouseListener.mouseClickX >= 669 && ClientMouseListener.mouseClickX <= 699 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 503 && sideIcon[11] != -1) {
			activeIcon = 11;
			redrawSide = true;
			redrawIcons = true;
		}
		if (ClientMouseListener.mouseClickX >= 696 && ClientMouseListener.mouseClickX <= 726 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 503 && sideIcon[12] != -1) {
			redrawSide = true;
			redrawIcons = true;
			activeIcon = 12;
		}
		if (ClientMouseListener.mouseClickX >= 724 && ClientMouseListener.mouseClickX <= 758 && ClientMouseListener.mouseClickY >= 466 && ClientMouseListener.mouseClickY < 502 && sideIcon[13] != -1) {
			activeIcon = 13;
			redrawSide = true;
			redrawIcons = true;
		}
	}

	@ObfuscatedName("cc.b(B)V")
	public static void chatModeLoop() {
		if (ClientMouseListener.mouseClickButton != 1) {
			return;
		}
		if (ClientMouseListener.mouseClickX >= 6 && ClientMouseListener.mouseClickX <= 106 && ClientMouseListener.mouseClickY >= 467 && ClientMouseListener.mouseClickY <= 499) {
			redrawChatMode = true;
			chatPublicMode = (chatPublicMode + 1) % 4;
			redrawChat = true;
			// SET_CHATFILTERSETTINGS
			out.p1Enc(32);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (ClientMouseListener.mouseClickX >= 135 && ClientMouseListener.mouseClickX <= 235 && ClientMouseListener.mouseClickY >= 467 && ClientMouseListener.mouseClickY <= 499) {
			redrawChat = true;
			chatPrivateMode = (chatPrivateMode + 1) % 3;
			redrawChatMode = true;
			// SET_CHATFILTERSETTINGS
			out.p1Enc(32);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (ClientMouseListener.mouseClickX >= 273 && ClientMouseListener.mouseClickX <= 373 && ClientMouseListener.mouseClickY >= 467 && ClientMouseListener.mouseClickY <= 499) {
			chatTradeMode = (chatTradeMode + 1) % 3;
			redrawChatMode = true;
			redrawChat = true;
			// SET_CHATFILTERSETTINGS
			out.p1Enc(32);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (ClientMouseListener.mouseClickX >= 412 && ClientMouseListener.mouseClickX <= 512 && ClientMouseListener.mouseClickY >= 467 && ClientMouseListener.mouseClickY <= 499) {
			if (mainModalId == -1) {
				closeModal();
				if (IfType.reportAbuseComId != -1) {
					reportAbuseMuteOption = false;
					reportAbuseComId = mainModalId = IfType.reportAbuseComId;
					reportAbuseInput = EMPTY;
				}
			} else {
				addChat(0, Text.field1921, EMPTY);
			}
		}
	}

	@ObfuscatedName("kc.a(BIIIIII)V")
	public static void loopInterface(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (!IfType.openInterface(arg3)) {
			return;
		}
		loopLayer(arg4, arg2, 0, arg1, arg5, -1, IfType.list[arg3], arg0, 0);
		if (field548 == null) {
			return;
		}
		IfType var6 = field548;
		IfType var7 = getDragLayer(var6);
		if (var7 == null) {
			return;
		}
		int[] var8 = getComponentPosition(var7);
		int[] var9 = getComponentPosition(var6);
		int var10 = var9[1] + ClientMouseListener.mouseY - var8[1] - field2392;
		int var11 = var9[0] + ClientMouseListener.mouseX - var8[0] - field419;
		if (var10 < 0) {
			var10 = 0;
		}
		if (var7.height < var6.height + var10) {
			var10 = var7.height - var6.height;
		}
		if (var11 < 0) {
			var11 = 0;
		}
		if (var7.width < var6.width + var11) {
			var11 = var7.width - var6.width;
		}
		if (field548.field2475 != null && (arg1 & 0x200) != 0) {
			ScriptRunner.executeScript(var6.field2475, var10, var6, var11);
		}
		if (ClientMouseListener.mouseButton == 0 && (arg1 & 0x400) != 0) {
			if (field548.field2501 != null) {
				ScriptRunner.executeScript(var6.field2501, var10, var6, var11);
			}
			field548 = null;
		}
	}

	@ObfuscatedName("hd.g(I)V")
	public static void handleInputKey() {
		while (ClientKeyboardListener.pollKey()) {
			if (mainModalId != -1 && mainModalId == reportAbuseComId) {
				if (ClientKeyboardListener.code == 85 && reportAbuseInput.length() > 0) {
					reportAbuseInput = reportAbuseInput.substring(0, reportAbuseInput.length() - 1);
				}
				if ((StringTools.method936(ClientKeyboardListener.ch) || ClientKeyboardListener.ch == 32) && reportAbuseInput.length() < 12) {
					reportAbuseInput = reportAbuseInput.valueOf(ClientKeyboardListener.ch);
				}
			} else if (socialInputOpen) {
				if (ClientKeyboardListener.code == 85 && socialInput.length() > 0) {
					socialInput = socialInput.substring(0, socialInput.length() - 1);
					redrawChat = true;
				}
				if (StringTools.method45(ClientKeyboardListener.ch) && socialInput.length() < 80) {
					socialInput = socialInput.valueOf(ClientKeyboardListener.ch);
					redrawChat = true;
				}
				if (ClientKeyboardListener.code == 84) {
					socialInputOpen = false;
					redrawChat = true;
					if (socialInputType == 1) {
						long var9 = socialInput.toUserhash();
						addFriend(var9);
					}
					if (socialInputType == 2 && friendCount > 0) {
						long var11 = socialInput.toUserhash();
						delFriend(var11);
					}
					if (socialInputType == 3 && socialInput.length() > 0) {
						// MESSAGE_PRIVATE
						out.p1Enc(207);
						out.p1(0);
						int var13 = out.pos;
						out.p8(socialUserhash);
						WordPack.pack(socialInput, out);
						out.psize1(out.pos - var13);
						if (chatPrivateMode == 2) {
							chatPrivateMode = 1;
							redrawChatMode = true;
							// SET_CHATFILTERSETTINGS
							out.p1Enc(32);
							out.p1(chatPublicMode);
							out.p1(chatPrivateMode);
							out.p1(chatTradeMode);
						}
					}
					if (socialInputType == 4 && ignoreCount < 100) {
						long var14 = socialInput.toUserhash();
						addIgnore(var14);
					}
					if (socialInputType == 5 && ignoreCount > 0) {
						long var16 = socialInput.toUserhash();
						delIgnore(var16);
					}
				}
			} else if (dialogInputType == 1) {
				if (ClientKeyboardListener.code == 85 && dialogInput.length() > 0) {
					dialogInput = dialogInput.substring(0, dialogInput.length() - 1);
					redrawChat = true;
				}
				if (StringTools.method1037(ClientKeyboardListener.ch) && dialogInput.length() < 10) {
					dialogInput = dialogInput.valueOf(ClientKeyboardListener.ch);
					redrawChat = true;
				}
				if (ClientKeyboardListener.code == 84) {
					if (dialogInput.length() > 0) {
						int var0 = 0;
						if (dialogInput.method33()) {
							var0 = dialogInput.method3();
						}
						// RESUME_P_COUNTDIALOG
						out.p1Enc(238);
						out.p4(var0);
					}
					redrawChat = true;
					dialogInputType = 0;
				}
			} else if (dialogInputType == 2) {
				if (ClientKeyboardListener.code == 85 && dialogInput.length() > 0) {
					dialogInput = dialogInput.substring(0, dialogInput.length() - 1);
					redrawChat = true;
				}
				if ((StringTools.method936(ClientKeyboardListener.ch) || ClientKeyboardListener.ch == 32) && dialogInput.length() < 12) {
					dialogInput = dialogInput.valueOf(ClientKeyboardListener.ch);
					redrawChat = true;
				}
				if (ClientKeyboardListener.code == 84) {
					if (dialogInput.length() > 0) {
						// RESUME_P_NAMEDIALOG
						out.p1Enc(86);
						out.p8(dialogInput.toUserhash());
					}
					dialogInputType = 0;
					redrawChat = true;
				}
			} else if (dialogInputType == 3) {
				if (ClientKeyboardListener.code == 85 && dialogInput.length() > 0) {
					dialogInput = dialogInput.substring(0, dialogInput.length() - 1);
					redrawChat = true;
				}
				if (StringTools.method45(ClientKeyboardListener.ch) && dialogInput.length() < 40) {
					dialogInput = dialogInput.valueOf(ClientKeyboardListener.ch);
					redrawChat = true;
				}
			} else if (chatModalId == -1 && fullModalId1 == -1) {
				if (ClientKeyboardListener.code == 85 && chatInput.length() > 0) {
					chatInput = chatInput.substring(0, chatInput.length() - 1);
					redrawChat = true;
				}
				if (StringTools.method45(ClientKeyboardListener.ch) && chatInput.length() < 80) {
					chatInput = chatInput.valueOf(ClientKeyboardListener.ch);
					redrawChat = true;
				}
				if (ClientKeyboardListener.code == 84 && chatInput.length() > 0) {
					if (staffmodlevel == 2) {
						if (chatInput.strEquals(AUTO_CLIENTDROP)) {
							lostCon();
						}
						if (chatInput.strEquals(AUTO_FPSON)) {
							showFps = true;
						}
						if (chatInput.strEquals(AUTO_FPSOFF)) {
							showFps = false;
						}
						if (chatInput.strEquals(AUTO_NOCLIP)) {
							for (int var1 = 0; var1 < 4; var1++) {
								for (int var2 = 1; var2 < 103; var2++) {
									for (int var3 = 1; var3 < 103; var3++) {
										collision[var1].flags[var2][var3] = 0;
									}
								}
							}
						}
						if (chatInput.strEquals(AUTO_ERRORTEST) && modewhere == 2) {
							throw new RuntimeException();
						}
						if (chatInput.strEquals(AUTO_HIDDENBUTTONTEST)) {
							hiddenButtonTest = true;
						}
					}
					if (chatInput.startsWith(AUTO_CHEATPREFIX)) {
						// CLIENT_CHEAT
						out.p1Enc(248);
						out.p1(chatInput.length() - 1);
						out.pjstr(chatInput.substring(2));
					} else {
						byte var4 = 0;
						JagString var5 = chatInput.toLowerCase();
						byte var6 = 0;
						if (var5.startsWith(Text.field2391)) {
							var6 = 0;
							chatInput = chatInput.substring(Text.field2391.length());
						} else if (var5.startsWith(Text.field326)) {
							chatInput = chatInput.substring(Text.field326.length());
							var6 = 1;
						} else if (var5.startsWith(Text.field64)) {
							var6 = 2;
							chatInput = chatInput.substring(Text.field64.length());
						} else if (var5.startsWith(Text.field2296)) {
							var6 = 3;
							chatInput = chatInput.substring(Text.field2296.length());
						} else if (var5.startsWith(Text.field63)) {
							var6 = 4;
							chatInput = chatInput.substring(Text.field63.length());
						} else if (var5.startsWith(Text.field2077)) {
							chatInput = chatInput.substring(Text.field2077.length());
							var6 = 5;
						} else if (var5.startsWith(Text.field2157)) {
							var6 = 6;
							chatInput = chatInput.substring(Text.field2157.length());
						} else if (var5.startsWith(Text.field1885)) {
							var6 = 7;
							chatInput = chatInput.substring(Text.field1885.length());
						} else if (var5.startsWith(Text.field2767)) {
							var6 = 8;
							chatInput = chatInput.substring(Text.field2767.length());
						} else if (var5.startsWith(Text.field2583)) {
							var6 = 9;
							chatInput = chatInput.substring(Text.field2583.length());
						} else if (var5.startsWith(Text.field2477)) {
							chatInput = chatInput.substring(Text.field2477.length());
							var6 = 10;
						} else if (var5.startsWith(Text.field2598)) {
							chatInput = chatInput.substring(Text.field2598.length());
							var6 = 11;
						}
						JagString var7 = chatInput.toLowerCase();
						if (var7.startsWith(Text.field2317)) {
							var4 = 1;
							chatInput = chatInput.substring(Text.field2317.length());
						} else if (var7.startsWith(Text.field3054)) {
							var4 = 2;
							chatInput = chatInput.substring(Text.field3054.length());
						} else if (var7.startsWith(Text.field1545)) {
							chatInput = chatInput.substring(Text.field1545.length());
							var4 = 3;
						} else if (var7.startsWith(Text.field1195)) {
							var4 = 4;
							chatInput = chatInput.substring(Text.field1195.length());
						} else if (var7.startsWith(Text.field2707)) {
							var4 = 5;
							chatInput = chatInput.substring(Text.field2707.length());
						}
						// MESSAGE_PUBLIC
						out.p1Enc(75);
						out.p1(0);
						int var8 = out.pos;
						out.p1(var6);
						out.p1(var4);
						WordPack.pack(chatInput, out);
						out.psize1(out.pos - var8);
						if (chatPublicMode == 2) {
							redrawChatMode = true;
							chatPublicMode = 3;
							// SET_CHATFILTERSETTINGS
							out.p1Enc(32);
							out.p1(chatPublicMode);
							out.p1(chatPrivateMode);
							out.p1(chatTradeMode);
						}
					}
					redrawChat = true;
					chatInput = EMPTY;
				}
			}
		}
	}

	@ObfuscatedName("ta.a(ZLqd;)Z")
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
				if (var3 >= var2) {
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

	@ObfuscatedName("kd.a(IIIIIII[Lqd;II)V")
	public static void loopLayer(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, IfType[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < arg6.length; var9++) {
			IfType var10 = arg6[var9];
			if (var10 != null && (var10.type == 0 || var10.hashook) && var10 != null && var10.layerId == arg5 && (!var10.hide || hiddenButtonTest)) {
				int var11 = var10.x + arg4;
				int var12 = var10.y + arg0;
				if (!var10.field2500) {
					var12 -= arg8;
				}
				int var13 = var10.height + var12;
				int var14 = arg0 >= var12 ? arg0 : var12;
				if (!var10.field2500) {
					var11 -= arg2;
				}
				int var15 = var11 + var10.width;
				int var16 = arg4 < var11 ? var11 : arg4;
				int var17 = arg1 > var13 ? var13 : arg1;
				int var18 = var15 < arg7 ? var15 : arg7;
				if (var10.type == 0) {
					loopLayer(var14, var17, var10.scrollPosX, arg3, var16, var9, arg6, var18, var10.scrollPosY);
					if (var10.subcomponents != null) {
						loopLayer(var14, var17, var10.scrollPosX, arg3, var16, var10.parentId, var10.subcomponents, var18, var10.scrollPosY);
					}
				}
				if (var10.hashook) {
					boolean var19;
					if (ClientMouseListener.mouseX >= var16 && var14 <= ClientMouseListener.mouseY && var18 > ClientMouseListener.mouseX && var17 > ClientMouseListener.mouseY) {
						var19 = true;
					} else {
						var19 = false;
					}
					boolean var20 = false;
					if (ClientMouseListener.mouseButton == 1 && var19) {
						var20 = true;
					}
					boolean var21 = false;
					if (var10.field2544 != -1 && var20 && field548 == null) {
						field419 = ClientMouseListener.mouseX;
						field548 = var10;
						field2392 = ClientMouseListener.mouseY;
					}
					if (ClientMouseListener.mouseClickButton == 1 && var16 <= ClientMouseListener.mouseClickX && ClientMouseListener.mouseClickY >= var14 && ClientMouseListener.mouseClickX < var18 && ClientMouseListener.mouseClickY < var17) {
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
							ScriptRunner.executeScript(var10.field2487, ClientMouseListener.mouseClickY - var12, var10, ClientMouseListener.mouseClickX - var11);
						}
					}
					if (var10.field2536 && var20 && (arg3 & 0x4) != 0 && var10.field2553 != null) {
						ScriptRunner.executeScript(var10.field2553, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
					}
					if (var10.field2536 && !var20 && (arg3 & 0x2) != 0) {
						var10.field2536 = false;
						if (var10.field2513 != null) {
							ScriptRunner.executeScript(var10.field2513, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
						}
					}
					if (var20 && (arg3 & 0x8) != 0 && var10.field2450 != null) {
						ScriptRunner.executeScript(var10.field2450, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
					}
					if (!var10.field2488 && var19 && (arg3 & 0x10) != 0) {
						var10.field2488 = true;
						if (var10.field2464 != null) {
							ScriptRunner.executeScript(var10.field2464, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
						}
					}
					if (var10.field2488 && var19 && (arg3 & 0x40) != 0 && var10.field2486 != null) {
						ScriptRunner.executeScript(var10.field2486, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
					}
					if (var10.field2488 && !var19 && (arg3 & 0x20) != 0) {
						var10.field2488 = false;
						if (var10.field2478 != null) {
							ScriptRunner.executeScript(var10.field2478, ClientMouseListener.mouseY - var12, var10, ClientMouseListener.mouseX - var11);
						}
					}
					if (var10.field2518 != null && (arg3 & 0x80) != 0) {
						ScriptRunner.executeScript(var10.field2518, 0, var10, 0);
					}
					if (loopCycle == field1237 && var10.field2456 != null && (arg3 & 0x100) != 0) {
						ScriptRunner.executeScript(var10.field2456, 0, var10, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("qb.a(I[Lqd;IIIIIIIIII)V")
	public static void addComponentOptions(int arg0, IfType[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg2 > arg7 || arg4 < arg8 || arg7 >= arg10 || arg4 >= arg0) {
			return;
		}
		for (int var11 = 0; var11 < arg1.length; var11++) {
			IfType var12 = arg1[var11];
			if (var12 != null && var12.layerId == arg5) {
				int var13 = var12.y + arg8 - arg3;
				int var14 = var12.x + arg2 - arg9;
				if (var12.type == 8 && var14 <= arg7 && var13 <= arg4 && arg7 < var12.width + var14 && arg4 < var12.height + var13) {
					field1497 = var11;
				}
				if ((var12.overLayerId >= 0 || var12.colourOver != 0) && var14 <= arg7 && var13 <= arg4 && arg7 < var12.width + var14 && arg4 < var12.height + var13) {
					if (var12.overLayerId >= 0) {
						lastOverComId = var12.overLayerId;
					} else {
						lastOverComId = var11;
					}
				}
				if (var12.type != 0) {
					if (var12.buttonType == 1 && var14 <= arg7 && var13 <= arg4 && var12.width + var14 > arg7 && var12.height + var13 > arg4) {
						boolean var15 = false;
						if (var12.clientCode != 0) {
							var15 = addSocialOptions(var12);
						}
						if (!var15) {
							addMenuOption(0, var12.buttonText, var12.parentId, 0, 42, EMPTY);
						}
					}
					if (var12.buttonType == 2 && targetMode == 0 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.width + var14 && arg4 < var13 + var12.height) {
						addMenuOption(0, var12.targetVerb, var12.parentId, 0, 33, JagString.join(new JagString[]{field2564, var12.targetBase}));
					}
					if (var12.buttonType == 3 && arg7 >= var14 && arg4 >= var13 && var12.width + var14 > arg7 && arg4 < var12.height + var13) {
						byte var16;
						if (arg6 == 3) {
							var16 = 40;
						} else {
							var16 = 9;
						}
						addMenuOption(0, Text.CLOSE, var12.parentId, 0, var16, EMPTY);
					}
					if (var12.buttonType == 4 && arg7 >= var14 && var13 <= arg4 && arg7 < var12.width + var14 && var12.height + var13 > arg4) {
						addMenuOption(0, var12.buttonText, var12.parentId, 0, 23, EMPTY);
					}
					if (var12.buttonType == 5 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.width && var12.height + var13 > arg4) {
						addMenuOption(0, var12.buttonText, var12.parentId, 0, 57, EMPTY);
					}
					if (var12.buttonType == 6 && resumePauseComId == -1 && var14 <= arg7 && var13 <= arg4 && arg7 < var14 + var12.width && arg4 < var12.height + var13) {
						addMenuOption(0, var12.buttonText, var12.parentId, 0, 54, EMPTY);
					}
					if (var12.type == 2) {
						int var17 = 0;
						for (int var18 = 0; var18 < var12.height; var18++) {
							for (int var19 = 0; var19 < var12.width; var19++) {
								int var20 = (var12.marginX + 32) * var19 + var14;
								int var21 = var13 + (var12.marginY + 32) * var18;
								if (var17 < 20) {
									var20 += var12.invBackgroundX[var17];
									var21 += var12.invBackgroundY[var17];
								}
								if (arg7 >= var20 && var21 <= arg4 && var20 + 32 > arg7 && arg4 < var21 + 32) {
									hoveredSlotComId = var12.parentId;
									hoveredSlot = var17;
									if (var12.linkObjType[var17] > 0) {
										ObjType var22 = ObjType.list(var12.linkObjType[var17] - 1);
										if (useMode == 1 && var12.objOps) {
											if (useSelectedComId != var12.parentId || objSelectedSlot != var17) {
												addMenuOption(var22.id, Text.USE, var12.parentId, var17, 56, JagString.join(new JagString[]{field3177, field328, var22.name}));
											}
										} else if (targetMode != 1 || !var12.objOps) {
											JagString[] var23 = var22.iop;
											if (showOpIndex) {
												var23 = prependOpIndex(var23);
											}
											if (var12.objOps) {
												for (int var24 = 4; var24 >= 3; var24--) {
													if (var23 != null && var23[var24] != null) {
														byte var25;
														if (var24 == 3) {
															var25 = 43;
														} else {
															var25 = 11;
														}
														addMenuOption(var22.id, var23[var24], var12.parentId, var17, var25, JagString.join(new JagString[]{field2334, var22.name}));
													} else if (var24 == 4) {
														addMenuOption(var22.id, Text.DROP, var12.parentId, var17, 11, JagString.join(new JagString[]{field2334, var22.name}));
													}
												}
											}
											if (var12.objUse) {
												addMenuOption(var22.id, Text.USE, var12.parentId, var17, 19, JagString.join(new JagString[]{field2334, var22.name}));
											}
											if (var12.objOps && var23 != null) {
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
														addMenuOption(var22.id, var23[var26], var12.parentId, var17, var27, JagString.join(new JagString[]{field2334, var22.name}));
													}
												}
											}
											JagString[] var28 = var12.iop;
											if (showOpIndex) {
												var28 = prependOpIndex(var28);
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
														addMenuOption(var22.id, var28[var29], var12.parentId, var17, var30, JagString.join(new JagString[]{field2334, var22.name}));
													}
												}
											}
											addMenuOption(var22.id, Text.EXAMINE, var12.parentId, var17, 1006, JagString.join(new JagString[]{field2334, var22.name}));
										} else if ((targetMask & 0x10) == 16) {
											addMenuOption(var22.id, targetVerb, var12.parentId, var17, 37, JagString.join(new JagString[]{field1384, field328, var22.name}));
										}
									}
								}
								var17++;
							}
						}
					}
					if (var12.v3 && var12.invobject != -1 && arg7 >= var14 && arg4 >= var13 && arg7 < var12.width + var14 && arg4 < var12.height + var13) {
						ObjType var31 = ObjType.list(var12.invobject);
						if (var12.objOps) {
							JagString[] var32 = var31.iop;
							if (showOpIndex) {
								var32 = prependOpIndex(var32);
							}
							if (var32 == null || var32[4] == null) {
								addMenuOption(var31.id, Text.DROP, var12.parentId, var12.field2542 - 1, 11, JagString.join(new JagString[]{field2334, var31.name}));
							} else {
								addMenuOption(var31.id, var32[4], var12.parentId, var12.field2542 - 1, 11, JagString.join(new JagString[]{field2334, var31.name}));
							}
							if (var32 != null && var32[3] != null) {
								addMenuOption(var31.id, var32[3], var12.parentId, var12.field2542 - 1, 43, JagString.join(new JagString[]{field2334, var31.name}));
							}
							if (var32 != null && var32[2] != null) {
								addMenuOption(var31.id, var32[2], var12.parentId, var12.field2542 - 1, 31, JagString.join(new JagString[]{field2334, var31.name}));
							}
							if (var32 != null && var32[1] != null) {
								addMenuOption(var31.id, var32[1], var12.parentId, var12.field2542 - 1, 6, JagString.join(new JagString[]{field2334, var31.name}));
							}
							if (var32 != null && var32[0] != null) {
								addMenuOption(var31.id, var32[0], var12.parentId, var12.field2542 - 1, 52, JagString.join(new JagString[]{field2334, var31.name}));
							}
						}
						if (var12.parentId >= 0) {
							addMenuOption(var31.id, Text.EXAMINE, var12.parentId, -1, 1007, JagString.join(new JagString[]{field2334, var31.name}));
						} else {
							addMenuOption(var31.id, Text.EXAMINE, var12.layerId, var12.parentId & 0x7FFF, 1007, JagString.join(new JagString[]{field2334, var31.name}));
						}
					}
					if (var12.hashook && var12.opNames != null && var14 <= arg7 && var13 <= arg4 && var12.width + var14 > arg7 && arg4 < var12.height + var13) {
						JagString var33 = EMPTY;
						if (var12.invobject != -1) {
							ObjType var34 = ObjType.list(var12.invobject);
							var33 = JagString.join(new JagString[]{field2334, var34.name});
						}
						for (int var35 = var12.opNames.length - 1; var35 >= 0; var35--) {
							if (var12.opNames[var35] != null) {
								if (var12.parentId < 0) {
									addMenuOption(var35 + 1, var12.opNames[var35], var12.layerId, var12.parentId & 0x7FFF, 50, var33);
								} else {
									addMenuOption(var35 + 1, var12.opNames[var35], var12.parentId, 0, 50, var33);
								}
							}
						}
					}
				} else if (!var12.hide || overComVisible(arg6, var11) || hiddenButtonTest) {
					addComponentOptions(var12.height + var13, arg1, var14, var12.scrollPosY, arg4, var11, arg6, arg7, var13, var12.scrollPosX, var14 + var12.width);
					if (var12.subcomponents != null) {
						addComponentOptions(var13 + var12.height, var12.subcomponents, var14, var12.scrollPosY, arg4, var12.parentId, arg6, arg7, var13, var12.scrollPosX, var12.width + var14);
					}
					if (var12.height < var12.scrollPos) {
						doScrollbar(var12.height, arg4, arg7, var12.scrollPos, var12, var12.width + var14, arg6, var13);
					}
				}
			}
		}
	}

	@ObfuscatedName("fe.a(III)V")
	public static void resumePauseButton(int arg0, int arg1) {
		// RESUME_PAUSEBUTTON
		out.p1Enc(132);
		out.p4_alt2(arg1);
		out.p2_alt1(arg0);
	}

	@ObfuscatedName("n.a(Z)V")
	public static void minimapDraw() {
		bindMap();
		if (minimapState == 2) {
			int[] var0 = Pix2D.pixels;
			byte[] var1 = mapback.data;
			int var2 = var1.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (var1[var3] == 0) {
					var0[var3] = 0;
				}
			}
			compass.scanlineRotatePlotSprite(0, 0, 33, 33, 25, 25, orbitCameraYaw, 256, compassMaskLineOffsets, compassMaskLineLengths);
			canvasDrawMap();
			return;
		}
		int var4 = localPlayer.x / 32 + 48;
		int var5 = 464 - localPlayer.z / 32;
		int var6 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		minimap.scanlineRotatePlotSprite(25, 5, 146, 151, var4, var5, var6, macroMinimapZoom + 256, minimapMaskLineOffsets, minimapMaskLineLengths);
		for (int var7 = 0; var7 < activeMapFunctionCount; var7++) {
			int var8 = activeMapFunctionX[var7] * 4 + 2 - localPlayer.x / 32;
			int var9 = activeMapFunctionZ[var7] * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var9, var8, activeMapFunctions[var7]);
		}
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				LinkList var12 = groundObj[minusedlevel][var10][var11];
				if (var12 != null) {
					int var13 = var11 * 4 + 2 - localPlayer.z / 32;
					int var14 = var10 * 4 + 2 - localPlayer.x / 32;
					minimapDrawDot(var13, var14, mapdots[0]);
				}
			}
		}
		for (int var15 = 0; var15 < npcCount; var15++) {
			ClientNpc var16 = npc[npcIds[var15]];
			if (var16 != null && var16.ready()) {
				NpcType var17 = var16.type;
				if (var17.multinpc != null) {
					var17 = var17.getMultiNpc();
				}
				if (var17 != null && var17.minimap && var17.active) {
					int var18 = var16.x / 32 - localPlayer.x / 32;
					int var19 = var16.z / 32 - localPlayer.z / 32;
					minimapDrawDot(var19, var18, mapdots[1]);
				}
			}
		}
		for (int var20 = 0; var20 < playerCount; var20++) {
			ClientPlayer var21 = players[playerIds[var20]];
			if (var21 != null && var21.ready()) {
				int var22 = var21.x / 32 - localPlayer.x / 32;
				int var23 = var21.z / 32 - localPlayer.z / 32;
				boolean var24 = false;
				long var25 = var21.name.toUserhash();
				for (int var27 = 0; var27 < friendCount; var27++) {
					if (friendUserhash[var27] == var25 && friendWorld[var27] != 0) {
						var24 = true;
						break;
					}
				}
				boolean var28 = false;
				if (localPlayer.team != 0 && var21.team != 0 && localPlayer.team == var21.team) {
					var28 = true;
				}
				if (var24) {
					minimapDrawDot(var23, var22, mapdots[3]);
				} else if (var28) {
					minimapDrawDot(var23, var22, mapdots[4]);
				} else {
					minimapDrawDot(var23, var22, mapdots[2]);
				}
			}
		}
		if (hintType != 0 && loopCycle % 20 < 10) {
			if (hintType == 1 && hintNpc >= 0 && npc.length > hintNpc) {
				ClientNpc var29 = npc[hintNpc];
				if (var29 != null) {
					int var30 = var29.x / 32 - localPlayer.x / 32;
					int var31 = var29.z / 32 - localPlayer.z / 32;
					minimapDrawArrow(var30, mapmarker[1], var31);
				}
			}
			if (hintType == 2) {
				int var32 = (hintTileZ - mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
				int var33 = (hintTileX - mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
				minimapDrawArrow(var33, mapmarker[1], var32);
			}
			if (hintType == 10 && hintPlayer >= 0 && players.length > hintPlayer) {
				ClientPlayer var34 = players[hintPlayer];
				if (var34 != null) {
					int var35 = var34.z / 32 - localPlayer.z / 32;
					int var36 = var34.x / 32 - localPlayer.x / 32;
					minimapDrawArrow(var36, mapmarker[1], var35);
				}
			}
		}
		if (minimapFlagX != 0) {
			int var37 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
			int var38 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var38, var37, mapmarker[0]);
		}
		Pix2D.fillRect(97, 78, 3, 3, 16777215);
		compass.scanlineRotatePlotSprite(0, 0, 33, 33, 25, 25, orbitCameraYaw, 256, compassMaskLineOffsets, compassMaskLineLengths);
		canvasDrawMap();
	}

	@ObfuscatedName("kc.a(BZ)V")
	public static void preventTimeout(boolean arg0) {
		noTimeoutTimer++;
		if (noTimeoutTimer < 50 && !arg0) {
			return;
		}
		noTimeoutTimer = 0;
		if (networkError || stream == null) {
			return;
		}
		// NO_TIMEOUT
		out.p1Enc(13);
		try {
			stream.write(out.pos, out.data);
			out.pos = 0;
		} catch (IOException var1) {
			networkError = true;
		}
	}

	@ObfuscatedName("kb.a(I)V")
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
			var7 = world.decorType(arg6, arg2, arg0);
		}
		if (arg5 == 2) {
			var7 = world.sceneType(arg6, arg2, arg0);
		}
		if (arg5 == 3) {
			var7 = world.gdType(arg6, arg2, arg0);
		}
		if (var7 != 0) {
			int var8 = var7 >> 14 & 0x7FFF;
			int var9 = world.typecode2(arg6, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			if (arg5 == 0) {
				world.delWall(arg6, arg2, arg0);
				LocType var12 = LocType.list(var8);
				if (var12.blockwalk) {
					collision[arg6].delWall(arg2, var10, var12.blockrange, arg0, var11);
				}
			}
			if (arg5 == 1) {
				world.delDecor(arg6, arg2, arg0);
			}
			if (arg5 == 2) {
				world.delLoc(arg6, arg2, arg0);
				LocType var13 = LocType.list(var8);
				if (arg2 + var13.width > 103 || var13.width + arg0 > 103 || var13.length + arg2 > 103 || var13.length + arg0 > 103) {
					return;
				}
				if (var13.blockwalk) {
					collision[arg6].delLoc(var13.blockrange, arg0, arg2, var10, var13.width, var13.length);
				}
			}
			if (arg5 == 3) {
				world.delGroundDecor(arg6, arg2, arg0);
				LocType var14 = LocType.list(var8);
				if (var14.blockwalk && var14.active == 1) {
					collision[arg6].unblockGround(arg0, arg2);
				}
			}
		}
		if (arg1 >= 0) {
			int var15 = arg6;
			if (arg6 < 3 && (ClientBuild.mapl[1][arg2][arg0] & 0x2) == 2) {
				var15 = arg6 + 1;
			}
			ClientBuild.changeLocUnchecked(collision[arg6], arg1, var15, arg6, arg3, world, arg4, arg0, arg2);
		}
	}

	@ObfuscatedName("id.a(I)V")
	public static void unloadFrame() {
		if (!field1159) {
			return;
		}
		chatScanline = null;
		field1159 = false;
		compassMaskLineLengths = null;
		mapback = null;
		minimapMaskLineOffsets = null;
		areaBackhmid2 = null;
		areaBackbase2 = null;
		areaBackright2 = null;
		backbase1 = null;
		invback = null;
		redstone2h = null;
		sideicons = null;
		redstone2hv = null;
		areaMap = null;
		compassMaskLineOffsets = null;
		sideScanline = null;
		areaBackright1 = null;
		redstone3v = null;
		backbase2 = null;
		areaBackleft1 = null;
		redstone2 = null;
		redstone1h = null;
		minimapMaskLineLengths = null;
		areaBackbase1 = null;
		backhmid1 = null;
		areaSide = null;
		redstone1 = null;
		areaGame = null;
		redstone1hv = null;
		areaChat = null;
		areaBackvmid1 = null;
		areaBackhmid1 = null;
		areaBackleft2 = null;
		areaBackvmid2 = null;
		redstone3 = null;
		redstone2v = null;
		redstone1v = null;
		gameScanline = null;
		areaBackvmid3 = null;
		areaBacktop1 = null;
		chatback = null;
	}

	@ObfuscatedName("d.a(Ljava/awt/Component;BLbd;)V")
	public static void loadFrame(Component arg0, Js5 arg1) {
		if (field1159) {
			return;
		}
		invback = PixLoader.makePix8(field1567, field479, arg1);
		chatback = PixLoader.makePix8(field62, field479, arg1);
		mapback = PixLoader.makePix8(field2333, field479, arg1);
		backbase1 = PixLoader.makePix8(field2927, field479, arg1);
		backbase2 = PixLoader.makePix8(field406, field479, arg1);
		backhmid1 = PixLoader.makePix8(field533, field479, arg1);
		areaChat = PixMap.createSafe(96, 479, arg0);
		chatback.plotSprite(0, 0);
		areaMap = PixMap.createSafe(156, 172, arg0);
		Pix2D.cls();
		mapback.plotSprite(0, 0);
		areaSide = PixMap.createSafe(261, 190, arg0);
		invback.plotSprite(0, 0);
		areaGame = PixMap.createSafe(334, 512, arg0);
		Pix2D.cls();
		areaBackbase1 = PixMap.createSafe(50, 496, arg0);
		areaBackbase2 = PixMap.createSafe(37, 269, arg0);
		areaBackhmid1 = PixMap.createSafe(45, 249, arg0);
		Pix32 var2 = PixLoader.makePix32(arg1, field3020, field479);
		areaBackleft1 = PixMap.createSafe(var2.hi, var2.wi, arg0);
		var2.quickPlotSprite(0, 0);
		Pix32 var3 = PixLoader.makePix32(arg1, field2162, field479);
		areaBackleft2 = PixMap.createSafe(var3.hi, var3.wi, arg0);
		var3.quickPlotSprite(0, 0);
		Pix32 var4 = PixLoader.makePix32(arg1, field455, field479);
		areaBackright1 = PixMap.createSafe(var4.hi, var4.wi, arg0);
		var4.quickPlotSprite(0, 0);
		Pix32 var5 = PixLoader.makePix32(arg1, field2682, field479);
		areaBackright2 = PixMap.createSafe(var5.hi, var5.wi, arg0);
		var5.quickPlotSprite(0, 0);
		Pix32 var6 = PixLoader.makePix32(arg1, field609, field479);
		areaBacktop1 = PixMap.createSafe(var6.hi, var6.wi, arg0);
		var6.quickPlotSprite(0, 0);
		Pix32 var7 = PixLoader.makePix32(arg1, field2798, field479);
		areaBackvmid1 = PixMap.createSafe(var7.hi, var7.wi, arg0);
		var7.quickPlotSprite(0, 0);
		Pix32 var8 = PixLoader.makePix32(arg1, field2355, field479);
		areaBackvmid2 = PixMap.createSafe(var8.hi, var8.wi, arg0);
		var8.quickPlotSprite(0, 0);
		Pix32 var9 = PixLoader.makePix32(arg1, field318, field479);
		areaBackvmid3 = PixMap.createSafe(var9.hi, var9.wi, arg0);
		var9.quickPlotSprite(0, 0);
		Pix32 var10 = PixLoader.makePix32(arg1, field478, field479);
		areaBackhmid2 = PixMap.createSafe(var10.hi, var10.wi, arg0);
		var10.quickPlotSprite(0, 0);
		redstone1 = PixLoader.makePix8(field1169, field479, arg1);
		redstone2 = PixLoader.makePix8(field2910, field479, arg1);
		redstone3 = PixLoader.makePix8(field3163, field479, arg1);
		redstone1h = redstone1.copy();
		redstone1h.hflip();
		redstone2h = redstone2.copy();
		redstone2h.hflip();
		redstone1v = redstone1.copy();
		redstone1v.vflip();
		redstone2v = redstone2.copy();
		redstone2v.vflip();
		redstone3v = redstone3.copy();
		redstone3v.vflip();
		redstone1hv = redstone1.copy();
		redstone1hv.hflip();
		redstone1hv.vflip();
		redstone2hv = redstone2.copy();
		redstone2hv.hflip();
		redstone2hv.vflip();
		sideicons = PixLoader.makePix8Array(arg1, field2818, field479);
		minimapMaskLineOffsets = new int[151];
		compassMaskLineLengths = new int[33];
		compassMaskLineOffsets = new int[33];
		minimapMaskLineLengths = new int[151];
		for (int var11 = 0; var11 < 33; var11++) {
			int var12 = 0;
			int var13 = 999;
			for (int var14 = 0; var14 < 34; var14++) {
				if (mapback.data[mapback.wi * var11 + var14] == 0) {
					if (var13 == 999) {
						var13 = var14;
					}
				} else if (var13 != 999) {
					var12 = var14;
					break;
				}
			}
			compassMaskLineOffsets[var11] = var13;
			compassMaskLineLengths[var11] = var12 - var13;
		}
		for (int var15 = 5; var15 < 156; var15++) {
			int var16 = 0;
			int var17 = 999;
			for (int var18 = 25; var18 < 172; var18++) {
				if (mapback.data[mapback.wi * var15 + var18] == 0 && (var18 > 34 || var15 > 34)) {
					if (var17 == 999) {
						var17 = var18;
					}
				} else if (var17 != 999) {
					var16 = var18;
					break;
				}
			}
			minimapMaskLineOffsets[var15 - 5] = var17 - 25;
			minimapMaskLineLengths[var15 - 5] = var16 - var17;
		}
		field1159 = true;
	}

	@ObfuscatedName("h.a(IILaa;I)V")
	public static void triggerPlayerAnim(int arg0, int arg1, ClientPlayer arg2) {
		if (arg2.primarySeqId == arg0 && arg0 != -1) {
			int var3 = SeqType.list(arg0).duplicatebehaviour;
			if (var3 == 1) {
				arg2.primarySeqFrame = 0;
				arg2.primarySeqLoop = 0;
				arg2.primarySeqDelay = arg1;
				arg2.primarySeqCycle = 0;
			}
			if (var3 == 2) {
				arg2.primarySeqLoop = 0;
				return;
			}
		} else if (arg0 == -1 || arg2.primarySeqId == -1 || SeqType.list(arg0).priority >= SeqType.list(arg2.primarySeqId).priority) {
			arg2.preanimRouteLength = arg2.routeLength;
			arg2.primarySeqFrame = 0;
			arg2.primarySeqCycle = 0;
			arg2.primarySeqLoop = 0;
			arg2.primarySeqDelay = arg1;
			arg2.primarySeqId = arg0;
		}
	}

	@ObfuscatedName("te.a(II)La;")
	public static JagString inf(int arg0) {
		return arg0 < 999999999 ? JagString.parseInt(arg0) : AUTO_ASTERISK;
	}

	@ObfuscatedName("te.a(III)V")
	public static void drawChat(int arg0, int arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < 100; var3++) {
			if (chatText[var3] != null) {
				int var4 = chatType[var3];
				int var5 = chatScrollPos + 4 + 70 - var2 * 14;
				if (var5 < -20) {
					break;
				}
				if (var4 == 0) {
					var2++;
				}
				JagString var6 = chatUsername[var3];
				if (var6 != null && var6.startsWith(field2612)) {
					var6 = var6.substring(5);
				}
				if (var6 != null && var6.startsWith(field2535)) {
					var6 = var6.substring(5);
				}
				if ((var4 == 1 || var4 == 2) && (var4 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5 && !var6.strEquals(localPlayer.name)) {
						if (staffmodlevel >= 1) {
							addMenuOption(0, Text.field1038, 0, 0, 28, JagString.join(new JagString[]{field1393, var6}));
						}
						addMenuOption(0, Text.field1933, 0, 0, 51, JagString.join(new JagString[]{field1393, var6}));
						addMenuOption(0, Text.field1364, 0, 0, 45, JagString.join(new JagString[]{field1393, var6}));
					}
					var2++;
				}
				if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var6))) {
					var2++;
					if (arg1 > var5 - 14 && arg1 <= var5) {
						if (staffmodlevel >= 1) {
							addMenuOption(0, Text.field1038, 0, 0, 28, JagString.join(new JagString[]{field1393, var6}));
						}
						addMenuOption(0, Text.field1933, 0, 0, 51, JagString.join(new JagString[]{field1393, var6}));
						addMenuOption(0, Text.field1364, 0, 0, 45, JagString.join(new JagString[]{field1393, var6}));
					}
				}
				if (var4 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
					if (arg1 > var5 - 14 && arg1 <= var5) {
						addMenuOption(0, Text.field2610, 0, 0, 26, JagString.join(new JagString[]{field1393, var6}));
					}
					var2++;
				}
				if ((var4 == 5 || var4 == 6) && splitPrivateChat == 0 && chatPrivateMode < 2) {
					var2++;
				}
				if (var4 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
					if (var5 - 14 < arg1 && arg1 <= var5) {
						addMenuOption(0, Text.field1432, 0, 0, 46, JagString.join(new JagString[]{field1393, var6}));
					}
					var2++;
				}
			}
		}
	}

	@ObfuscatedName("tc.b(I)V")
	public static void setLowMem() {
		World.lowMem = true;
		lowMem = true;
	}

	@ObfuscatedName("ca.b(I)V")
	public static void setHighMem() {
		lowMem = false;
		World.lowMem = false;
	}

	@ObfuscatedName("bb.a(IIIIBLqd;III)V")
	public static void doScrollbar(int arg0, int arg1, int arg2, int arg3, IfType arg4, int arg5, int arg6, int arg7) {
		if (scrollGrabbed) {
			scrollInputPadding = 32;
		} else {
			scrollInputPadding = 0;
		}
		scrollGrabbed = false;
		if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 >= arg7 && arg7 + 16 > arg1) {
			arg4.scrollPosY -= scrollCycle * 4;
			if (arg6 == 1) {
				redrawSide = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				redrawChat = true;
			}
		} else if (arg2 >= arg5 && arg5 + 16 > arg2 && arg1 >= arg7 + arg0 - 16 && arg1 < arg7 + arg0) {
			arg4.scrollPosY += scrollCycle * 4;
			if (arg6 == 2 || arg6 == 3) {
				redrawChat = true;
			}
			if (arg6 == 1) {
				redrawSide = true;
			}
		} else if (arg5 - scrollInputPadding <= arg2 && arg2 < scrollInputPadding + arg5 + 16 && arg7 + 16 <= arg1 && arg1 < arg7 + arg0 - 16 && scrollCycle > 0) {
			scrollGrabbed = true;
			int var8 = (arg0 - 32) * arg0 / arg3;
			if (arg6 == 2 || arg6 == 3) {
				redrawChat = true;
			}
			if (arg6 == 1) {
				redrawSide = true;
			}
			if (var8 < 8) {
				var8 = 8;
			}
			int var9 = arg0 - var8 - 32;
			int var10 = arg1 - arg7 - var8 / 2 - 16;
			arg4.scrollPosY = (arg3 - arg0) * var10 / var9;
		}
	}

	@ObfuscatedName("kd.a(JI)V")
	public static void delFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < friendCount; var2++) {
			if (friendUserhash[var2] == arg0) {
				friendCount--;
				redrawSide = true;
				for (int var3 = var2; var3 < friendCount; var3++) {
					friendUsername[var3] = friendUsername[var3 + 1];
					friendWorld[var3] = friendWorld[var3 + 1];
					friendUserhash[var3] = friendUserhash[var3 + 1];
				}
				// FRIENDLIST_DEL
				out.p1Enc(255);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("ob.a(I)V")
	public static void drawSide() {
		debugRedrawSide = true;
		bindSide();
		if (sideModalId != -1) {
			boolean var0 = drawInterface(sideModalId, 261, 1, 190);
			if (!var0) {
				redrawSide = true;
			}
		} else if (sideIcon[activeIcon] != -1) {
			boolean var1 = drawInterface(sideIcon[activeIcon], 261, 1, 190);
			if (!var1) {
				redrawSide = true;
			}
		}
		if (isMenuOpen && menuArea == 1) {
			if (lang == 1) {
				drawMinimenuGerman();
			} else {
				drawMinimenu();
			}
		}
		canvasDrawSide();
	}

	@ObfuscatedName("fc.a(ILa;IIIILa;)V")
	public static void addMenuOption(int arg0, JagString arg1, int arg2, int arg3, int arg4, JagString arg5) {
		if (menuNumEntries >= 500) {
			return;
		}
		if (arg5.length() <= 0) {
			menuOption[menuNumEntries] = arg1;
		} else {
			menuOption[menuNumEntries] = JagString.join(new JagString[]{arg1, Text.MINISEPARATOR, arg5});
		}
		menuAction[menuNumEntries] = arg4;
		menuParamA[menuNumEntries] = arg0;
		menuParamB[menuNumEntries] = arg3;
		menuParamC[menuNumEntries] = arg2;
		menuNumEntries++;
	}

	@ObfuscatedName("fe.o(I)V")
	public static void closeModal() {
		// CLOSE_MODAL
		out.p1Enc(176);
		if (sideModalId != -1) {
			closeInterface(sideModalId);
			resumePauseComId = -1;
			redrawIcons = true;
			redrawSide = true;
			sideModalId = -1;
		}
		if (chatModalId != -1) {
			closeInterface(chatModalId);
			resumePauseComId = -1;
			redrawChat = true;
			chatModalId = -1;
		}
		if (fullModalId1 != -1) {
			closeInterface(fullModalId1);
			fullModalId1 = -1;
			setMainState(30);
		}
		if (fullModalId2 != -1) {
			closeInterface(fullModalId2);
			fullModalId2 = -1;
		}
		if (mainModalId != -1) {
			closeInterface(mainModalId);
			mainModalId = -1;
			resumePauseComId = -1;
		}
	}

	@ObfuscatedName("be.a(II[IZI)V")
	public static void canvasDrawIcons(int arg0, int[] arg1, boolean arg2, int arg3) {
		areaBackhmid1.bind();
		backhmid1.plotSprite(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 0) {
					redstone1.plotSprite(22, 10);
				}
				if (arg0 == 1) {
					redstone2.plotSprite(54, 8);
				}
				if (arg0 == 2) {
					redstone2.plotSprite(82, 8);
				}
				if (arg0 == 3) {
					redstone3.plotSprite(110, 8);
				}
				if (arg0 == 4) {
					redstone2h.plotSprite(153, 8);
				}
				if (arg0 == 5) {
					redstone2h.plotSprite(181, 8);
				}
				if (arg0 == 6) {
					redstone1h.plotSprite(209, 9);
				}
			}
			if (arg1[0] != -1 && arg3 != 0) {
				sideicons[0].plotSprite(29, 13);
			}
			if (arg1[1] != -1 && arg3 != 1) {
				sideicons[1].plotSprite(53, 11);
			}
			if (arg1[2] != -1 && arg3 != 2) {
				sideicons[2].plotSprite(82, 11);
			}
			if (arg1[3] != -1 && arg3 != 3) {
				sideicons[3].plotSprite(115, 12);
			}
			if (arg1[4] != -1 && arg3 != 4) {
				sideicons[4].plotSprite(153, 13);
			}
			if (arg1[5] != -1 && arg3 != 5) {
				sideicons[5].plotSprite(180, 11);
			}
			if (arg1[6] != -1 && arg3 != 6) {
				sideicons[6].plotSprite(208, 13);
			}
		}
		areaBackbase2.bind();
		backbase2.plotSprite(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 7) {
					redstone1v.plotSprite(42, 0);
				}
				if (arg0 == 8) {
					redstone2v.plotSprite(74, 0);
				}
				if (arg0 == 9) {
					redstone2v.plotSprite(102, 0);
				}
				if (arg0 == 10) {
					redstone3v.plotSprite(130, 1);
				}
				if (arg0 == 11) {
					redstone2hv.plotSprite(173, 0);
				}
				if (arg0 == 12) {
					redstone2hv.plotSprite(201, 0);
				}
				if (arg0 == 13) {
					redstone1hv.plotSprite(229, 0);
				}
			}
			if (arg1[8] != -1 && arg3 != 8) {
				sideicons[7].plotSprite(74, 2);
			}
			if (arg1[9] != -1 && arg3 != 9) {
				sideicons[8].plotSprite(102, 3);
			}
			if (arg1[10] != -1 && arg3 != 10) {
				sideicons[9].plotSprite(137, 4);
			}
			if (arg1[11] != -1 && arg3 != 11) {
				sideicons[10].plotSprite(174, 2);
			}
			if (arg1[12] != -1 && arg3 != 12) {
				sideicons[11].plotSprite(201, 2);
			}
			if (arg1[13] != -1 && arg3 != 13) {
				sideicons[12].plotSprite(226, 2);
			}
		}
		try {
			Graphics var4 = canvas.getGraphics();
			areaBackhmid1.draw(516, var4, 160);
			areaBackbase2.draw(496, var4, 466);
		} catch (Exception var5) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("f.a(IJ)V")
	public static void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (ignoreCount >= 100) {
			addChat(0, Text.field2582, EMPTY);
			return;
		}
		JagString var2 = JString.toScreenName(arg0).toRawUsername();
		for (int var3 = 0; var3 < ignoreCount; var3++) {
			if (ignoreUserhash[var3] == arg0) {
				addChat(0, JagString.join(new JagString[]{var2, Text.IGNORELISTDUPE}), EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < friendCount; var4++) {
			if (friendUserhash[var4] == arg0) {
				addChat(0, JagString.join(new JagString[]{Text.field2172, var2, Text.REMOVEFRIEND2}), EMPTY);
				return;
			}
		}
		if (!var2.strEquals(localPlayer.name)) {
			ignoreUserhash[ignoreCount++] = arg0;
			redrawSide = true;
			// IGNORELIST_ADD
			out.p1Enc(251);
			out.p8(arg0);
		}
	}

	@ObfuscatedName("fa.a(IILjd;B)V")
	public static void minimapDrawDot(int arg0, int arg1, Pix32 arg2) {
		if (arg2 == null) {
			return;
		}
		int var3 = macroMinimapAngle + orbitCameraYaw & 0x7FF;
		int var4 = arg0 * arg0 + arg1 * arg1;
		if (var4 > 6400) {
			return;
		}
		int var5 = Model.sinTable[var3];
		int var6 = var5 * 256 / (macroMinimapZoom + 256);
		int var7 = Model.cosTable[var3];
		int var8 = var7 * 256 / (macroMinimapZoom + 256);
		int var9 = arg0 * var6 + arg1 * var8 >> 16;
		int var10 = arg0 * var8 - arg1 * var6 >> 16;
		if (var4 > 2500) {
			arg2.scanlinePlotSprite(mapback, var9 + 98 - arg2.owi / 2, -var10 + 79 + -(arg2.ohi / 2));
		} else {
			arg2.plotSprite(var9 + 4 + 94 - arg2.owi / 2, -(arg2.ohi / 2) + 83 + -var10 + -4);
		}
	}

	@ObfuscatedName("de.a(BIIIIIIII)V")
	public static void addComponentOptions(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (IfType.openInterface(arg3)) {
			addComponentOptions(arg2, IfType.list[arg3], arg4, 0, arg6, -1, arg7, arg5, arg0, 0, arg1);
		}
	}

	@ObfuscatedName("sd.a(IBI)V")
	public static void playJingle(int arg0, int arg1) {
		if (midiVolume != 0 && arg1 != -1) {
			MidiManager.play(1, arg1, midiVolume, jingles);
			nextMusicDelay = arg0;
		}
	}

	@ObfuscatedName("ac.a(ILqd;)Z")
	public static boolean addSocialOptions(IfType arg0) {
		int var1 = arg0.clientCode;
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
			addMenuOption(0, Text.field3239, 0, 0, 13, JagString.join(new JagString[]{field1393, friendUsername[var1]}));
			addMenuOption(0, Text.field2778, 0, 0, 18, JagString.join(new JagString[]{field1393, friendUsername[var1]}));
			return true;
		} else if (var1 >= 401 && var1 <= 500) {
			addMenuOption(0, Text.field3239, 0, 0, 35, JagString.join(new JagString[]{field1393, arg0.text}));
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("hd.a(IIIBIII)Z")
	public static boolean drawInterface(int arg0, int arg1, int arg2, int arg3) {
		if (!IfType.openInterface(arg0)) {
			return false;
		}

		return drawLayer(arg2, 0, 0, 0, -1, arg1, arg3, 0, IfType.list[arg0]);
	}

	@ObfuscatedName("l.a(III)Z")
	public static boolean overComVisible(int arg0, int arg1) {
		if (arg0 == 0 && field2881 == arg1) {
			return true;
		} else if (arg0 == 1 && overSideComId == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && overChatComId == arg1;
		}
	}

	@ObfuscatedName("qa.a(Lnb;Z)V")
	public static void exactMove1(ClientEntity arg0) {
		int var1 = arg0.exactStartX * 128 + arg0.size * 64;
		int var2 = arg0.exactMoveEnd - loopCycle;
		if (arg0.exactMoveFacing == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.exactMoveFacing == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.exactMoveFacing == 2) {
			arg0.dstYaw = 0;
		}
		int var3 = arg0.size * 64 + arg0.exactStartZ * 128;
		arg0.x += (var1 - arg0.x) / var2;
		if (arg0.exactMoveFacing == 3) {
			arg0.dstYaw = 512;
		}
		arg0.animDelayMove = 0;
		arg0.z += (var3 - arg0.z) / var2;
	}

	@ObfuscatedName("rc.a(IILbc;II)V")
	public static void canvasDrawChatMode(int arg0, PixFont arg1, int arg2, int arg3) {
		areaBackbase1.bind();
		backbase1.plotSprite(0, 0);
		arg1.centreString(Text.field1006, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.centreString(Text.field3193, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.centreString(Text.field2817, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.centreString(Text.field1657, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg1.centreString(Text.field2393, 55, 41, 65535, true);
		}
		arg1.centreString(Text.field49, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.centreString(Text.field3193, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.centreString(Text.field2817, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.centreString(Text.field1657, 184, 41, 16711680, true);
		}
		arg1.centreString(Text.field1676, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.centreString(Text.field3193, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.centreString(Text.field2817, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.centreString(Text.field1657, 324, 41, 16711680, true);
		}
		arg1.drawStringMultiline(Text.field1038, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			Graphics var4 = canvas.getGraphics();
			areaBackbase1.draw(0, var4, 453);
		} catch (Exception var5) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("fa.a(BLqd;La;)La;")
	public static JagString substituteVars(IfType arg0, JagString arg1) {
		if (arg1.indexOf(AUTO_PCT) == -1) {
			return arg1;
		}
		while (true) {
			int var2 = arg1.indexOf(field1938);
			if (var2 == -1) {
				while (true) {
					int var3 = arg1.indexOf(field2297);
					if (var3 == -1) {
						while (true) {
							int var4 = arg1.indexOf(field3277);
							if (var4 == -1) {
								while (true) {
									int var5 = arg1.indexOf(field2716);
									if (var5 == -1) {
										while (true) {
											int var6 = arg1.indexOf(field1166);
											if (var6 == -1) {
												while (true) {
													int var7 = arg1.indexOf(field1309);
													if (var7 == -1) {
														return arg1;
													}
													JagString var8 = EMPTY;
													if (lastAddress != null) {
														var8 = JagString.formatIPv4(lastAddress.intArg);
														try {
															if (lastAddress.result != null) {
																byte[] var9 = ((String) lastAddress.result).getBytes("ISO-8859-1");
																var8 = JagString.copy(var9, 0, var9.length);
															}
														} catch (UnsupportedEncodingException var10) {
														}
													}
													arg1 = JagString.join(new JagString[]{arg1.substring(0, var7), var8, arg1.substring(var7 + 4)});
												}
											}
											arg1 = JagString.join(new JagString[]{arg1.substring(0, var6), inf(getIfVar(4, arg0)), arg1.substring(var6 + 2)});
										}
									}
									arg1 = JagString.join(new JagString[]{arg1.substring(0, var5), inf(getIfVar(3, arg0)), arg1.substring(var5 + 2)});
								}
							}
							arg1 = JagString.join(new JagString[]{arg1.substring(0, var4), inf(getIfVar(2, arg0)), arg1.substring(var4 + 2)});
						}
					}
					arg1 = JagString.join(new JagString[]{arg1.substring(0, var3), inf(getIfVar(1, arg0)), arg1.substring(var3 + 2)});
				}
			}
			arg1 = JagString.join(new JagString[]{arg1.substring(0, var2), inf(getIfVar(0, arg0)), arg1.substring(var2 + 2)});
		}
	}

	@ObfuscatedName("oe.a(IILa;La;)V")
	public static void addChat(int arg0, JagString arg1, JagString arg2) {
		if (chatModalId == -1) {
			redrawChat = true;
		}
		if (arg0 == 0 && tutComId != -1) {
			ClientMouseListener.mouseClickButton = 0;
			tutComMessage = arg1;
		}
		for (int var3 = 99; var3 > 0; var3--) {
			chatType[var3] = chatType[var3 - 1];
			chatUsername[var3] = chatUsername[var3 - 1];
			chatText[var3] = chatText[var3 - 1];
		}
		chatType[0] = arg0;
		chatUsername[0] = arg2;
		chatText[0] = arg1;
	}

	@ObfuscatedName("s.c(I)V")
	public static void canvasDrawSide() {
		try {
			Graphics var0 = canvas.getGraphics();
			areaSide.draw(553, var0, 205);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("rd.a(IBII)V")
	public static void playSynth(int arg0, int arg1, int arg2) {
		if (waveVolume == 0 || arg1 == 0 || waveCount >= 50) {
			return;
		}
		waveSoundIds[waveCount] = arg0;
		waveLoops[waveCount] = arg1;
		waveDelay[waveCount] = arg2;
		waveSounds[waveCount] = null;
		waveAmbient[waveCount] = 0;
		waveCount++;
	}

	@ObfuscatedName("ua.a(I)V")
	public static void bindSide() {
		areaSide.bind();
		invback.plotSprite(0, 0);
		sideScanline = Pix2D.restoreClipping(sideScanline);
	}

	@ObfuscatedName("j.a(BLa;)V")
	public static void findObjs(JagString arg0) {
		if (arg0 == null || arg0.length() == 0) {
			field2330 = 0;
			return;
		}
		JagString var1 = arg0;
		JagString[] var2 = new JagString[100];
		int var3 = 0;
		while (true) {
			int var4 = var1.method8();
			if (var4 == -1) {
				JagString var5 = var1.trim();
				if (var5.length() > 0) {
					var2[var3++] = var5.toLowerCase();
				}
				field2330 = 0;
				label46:
				for (int var7 = 0; var7 < ObjType.numDefinitions; var7++) {
					ObjType var8 = ObjType.list(var7);
					if (var8.certtemplate == -1 && var8.name != null) {
						JagString var9 = var8.name.toLowerCase();
						for (int var10 = 0; var10 < var3; var10++) {
							if (var9.indexOf(var2[var10]) == -1) {
								continue label46;
							}
						}
						chatScreenName[field2330] = var9;
						field313[field2330] = var7;
						field2330++;
						if (field2330 >= chatScreenName.length) {
							return;
						}
					}
				}
				return;
			}
			JagString var6 = var1.substring(0, var4).trim();
			if (var6.length() > 0) {
				var2[var3++] = var6.toLowerCase();
			}
			var1 = var1.substring(var4 + 1);
		}
	}

	@ObfuscatedName("ra.a(II)V")
	public static void playSongs(int arg0) {
		if (arg0 == -1 && nextMusicDelay == 0) {
			MidiManager.stop();
		} else if (arg0 != -1 && nextMidiSong != arg0 && midiVolume != 0 && nextMusicDelay == 0) {
			MidiManager.method670(midiVolume, arg0, songs, 0);
		}
		nextMidiSong = arg0;
	}

	@ObfuscatedName("oa.a(BI)V")
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

	@ObfuscatedName("vc.a(II)V")
	public static void method1018(int arg0) {
		if (!IfType.openInterface(arg0)) {
			return;
		}
		IfType[] var1 = IfType.list[arg0];
		for (int var2 = 0; var2 < var1.length; var2++) {
			IfType var3 = var1[var2];
			if (var3.field2483 != null) {
				ScriptRunner.executeScript(var3.field2483, 0, var3, 0);
			}
		}
	}

	@ObfuscatedName("jc.a(IJ)V")
	public static void delIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var2 = 0; var2 < ignoreCount; var2++) {
			if (ignoreUserhash[var2] == arg0) {
				redrawSide = true;
				ignoreCount--;
				for (int var3 = var2; var3 < ignoreCount; var3++) {
					ignoreUserhash[var3] = ignoreUserhash[var3 + 1];
				}
				// IGNORELIST_DEL
				out.p1Enc(28);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("vb.a(II)Z")
	public static boolean animateInterface(int arg0) {
		if (!IfType.openInterface(arg0)) {
			return false;
		}
		IfType[] var1 = IfType.list[arg0];
		boolean var2 = false;
		for (int var3 = 0; var3 < var1.length; var3++) {
			IfType var4 = var1[var3];
			if (var4 != null && var4.type == 6) {
				if (var4.modelAnim != -1 || var4.modelAnim2 != -1) {
					boolean var5 = getIfActive(var4);
					int var6;
					if (var5) {
						var6 = var4.modelAnim2;
					} else {
						var6 = var4.modelAnim;
					}
					if (var6 != -1) {
						SeqType var7 = SeqType.list(var6);
						var4.animCycle += worldUpdateNum;
						label50:
						while (true) {
							do {
								do {
									if (var7.delay[var4.animFrame] >= var4.animCycle) {
										break label50;
									}
									var2 = true;
									var4.animCycle -= var7.delay[var4.animFrame];
									var4.animFrame++;
								} while (var4.animFrame < var7.frames.length);
								var4.animFrame -= var7.loops;
							} while (var4.animFrame >= 0 && var4.animFrame < var7.frames.length);
							var4.animFrame = 0;
						}
					}
				}
				if (var4.modelSpin != 0) {
					var2 = true;
					int var8 = var4.modelSpin >> 16;
					int var9 = var4.modelSpin << 16 >> 16;
					int var10 = worldUpdateNum * var8;
					var4.modelXAn = var4.modelXAn + var10 & 0x7FF;
					int var11 = worldUpdateNum * var9;
					var4.modelYAn = var4.modelYAn + var11 & 0x7FF;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("kb.a(B)V")
	public static void bindMap() {
		areaMap.bind();
	}

	@ObfuscatedName("ta.g(I)V")
	public static void canvasDrawBack() {
		try {
			Graphics var0 = canvas.getGraphics();
			areaBackleft1.draw(0, var0, 4);
			areaBackleft2.draw(0, var0, 357);
			areaBackright1.draw(722, var0, 4);
			areaBackright2.draw(743, var0, 205);
			areaBacktop1.draw(0, var0, 0);
			areaBackvmid1.draw(516, var0, 4);
			areaBackvmid2.draw(516, var0, 205);
			areaBackvmid3.draw(496, var0, 357);
			areaBackhmid2.draw(0, var0, 338);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("hc.b(B)V")
	public static void bindChat() {
		areaChat.bind();
		chatback.plotSprite(0, 0);
		chatScanline = Pix2D.restoreClipping(chatScanline);
	}

	@ObfuscatedName("be.a(La;I)Z")
	public static boolean isFriend(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < friendCount; var1++) {
			if (arg0.equalsIgnoreCase(friendUsername[var1])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("pb.d(B)V")
	public static void canvasDrawChat() {
		try {
			Graphics var0 = canvas.getGraphics();
			areaChat.draw(17, var0, 357);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("h.h(I)V")
	public static void canvasDrawMap() {
		try {
			Graphics var0 = canvas.getGraphics();
			areaMap.draw(550, var0, 4);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("w.b(B)V")
	public static void bindGame() {
		areaGame.bind();
		gameScanline = Pix2D.restoreClipping(gameScanline);
	}

	@ObfuscatedName("s.a(II)V")
	public static void closeInterface(int arg0) {
		IfType.closeInterface(arg0);
	}

	@ObfuscatedName("va.a(ILqd;)Lqd;")
	public static IfType getDragLayer(IfType arg0) {
		int var1;
		if (arg0.parentId < 0) {
			var1 = arg0.layerId >> 16;
		} else {
			var1 = arg0.parentId >> 16;
		}
		if (!IfType.openInterface(var1)) {
			return null;
		} else if (arg0.field2544 >= 0) {
			return IfType.list[var1][arg0.field2544 & 0xFFFF];
		} else {
			IfType var2 = IfType.list[var1][arg0.field2544 >> 15 & 0xFFFF];
			return var2.subcomponents[arg0.field2544 & 0x7FFF];
		}
	}

	@ObfuscatedName("de.a(Lqd;B)[I")
	public static int[] getComponentPosition(IfType arg0) {
		int var1;
		if (arg0.parentId < 0) {
			var1 = arg0.layerId >> 16;
		} else {
			var1 = arg0.parentId >> 16;
		}
		if (!IfType.openInterface(var1)) {
			return null;
		}
		int var2 = arg0.x;
		int var3 = arg0.y;
		int var4 = arg0.layerId;
		while (var4 != -1) {
			IfType var5 = IfType.list[var1][var4 & 0xFFFF];
			var2 += var5.x;
			if (!arg0.field2500) {
				var2 -= var5.scrollPosX;
			}
			var3 += var5.y;
			var4 = var5.layerId;
			if (!arg0.field2500) {
				var3 -= var5.scrollPosY;
			}
		}
		return new int[]{var2, var3};
	}

	@ObfuscatedName("id.a(IILnb;)V")
	public static void getOverlayPos(int arg0, ClientEntity arg1) {
		getOverlayPos(arg0, arg1.z, arg1.x);
	}

	@ObfuscatedName("md.a(JB)V")
	public static void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (friendCount >= 100 && membersAccount != 1 || friendCount >= 200) {
			addChat(0, Text.field2931, EMPTY);
			return;
		}
		JagString var2 = JString.toScreenName(arg0).toRawUsername();
		for (int var3 = 0; var3 < friendCount; var3++) {
			if (friendUserhash[var3] == arg0) {
				addChat(0, JagString.join(new JagString[]{var2, Text.FRIENDLISTDUPE}), EMPTY);
				return;
			}
		}
		for (int var4 = 0; var4 < ignoreCount; var4++) {
			if (ignoreUserhash[var4] == arg0) {
				addChat(0, JagString.join(new JagString[]{Text.field2178, var2, Text.REMOVEIGNORE2}), EMPTY);
				return;
			}
		}
		if (var2.strEquals(localPlayer.name)) {
			return;
		}
		friendUsername[friendCount] = var2;
		friendUserhash[friendCount] = arg0;
		friendWorld[friendCount] = 0;
		friendCount++;
		redrawSide = true;
		// FRIENDLIST_ADD
		out.p1Enc(114);
		out.p8(arg0);
	}

	@ObfuscatedName("re.a(Lbd;B)I")
	public static int prefetchFrame(Js5 arg0) {
		int var1 = 0;
		if (arg0.requestDownload(field1567, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field62, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2333, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2927, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field406, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field533, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field3020, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2162, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field455, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2682, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field609, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2798, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2355, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field318, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field478, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field1169, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2910, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field3163, field479)) {
			var1++;
		}
		if (arg0.requestDownload(field2818, field479)) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("aa.k(I)V")
	public static void canvasDrawGame() {
		try {
			Graphics var0 = canvas.getGraphics();
			areaGame.draw(4, var0, 4);
		} catch (Exception var1) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("kc.a([Lqd;IZIIIII)Lqd;")
	public static IfType getTopComponent(IfType[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 == null) {
			return null;
		}
		IfType var7 = null;
		for (int var8 = 0; var8 < arg0.length; var8++) {
			IfType var9 = arg0[var8];
			if (var9 != null && var9.layerId == arg4) {
				int var10 = var9.y + arg3;
				int var11 = var9.x + arg5;
				if (var11 <= arg6 && var10 <= arg1 && var9.width + var11 > arg6 && arg1 < var10 + var9.height && !var9.hide) {
					if (var9.parentId < 0 && arg2 || var9.parentId >= 0 && !arg2) {
						var7 = var9;
					}
					if (var9.type == 0) {
						IfType var12 = getTopComponent(arg0, arg1, arg2, var9.y - var9.scrollPosY, var8, var9.x - var9.scrollPosX, arg6);
						if (var12 != null) {
							var7 = var12;
						}
						if (arg2 && var9.subcomponents != null) {
							IfType var13 = getTopComponent(var9.subcomponents, arg1, arg2, var9.y - var9.scrollPosY, var9.parentId, var9.x - var9.scrollPosX, arg6);
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

	@ObfuscatedName("h.c(Z)I")
	public static int frameCount() {
		return 19;
	}

	@ObfuscatedName("n.a(IIB)Z")
	public static boolean tooltipComVisible(int arg0, int arg1) {
		if (arg0 == 0 && field1279 == arg1) {
			return true;
		} else if (arg0 == 1 && field1387 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && field3253 == arg1;
		}
	}

	@ObfuscatedName("ke.a(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object evalJavaScript(Applet arg0, String arg1) throws Throwable {
		return null; // JSObject.getWindow(arg0).eval(arg1);
	}

	@ObfuscatedName("pb.a(IB)La;")
	public static JagString niceNumber(int arg0) {
		JagString var1 = JagString.parseInt(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[]{var1.substring(0, var2), field1774, var1.substring(var2)});
		}
		if (var1.length() > 8) {
			var1 = JagString.join(new JagString[]{field2564, var1.substring(0, var1.length() - 8), Text.field1896, field2629, var1, field2601});
		} else if (var1.length() > 4) {
			var1 = JagString.join(new JagString[]{field3136, var1.substring(0, var1.length() - 4), Text.field2360, field2629, var1, field2601});
		}
		return JagString.join(new JagString[]{field2406, var1});
	}

	@ObfuscatedName("sa.a([La;Z)[La;")
	public static JagString[] prependOpIndex(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[]{JagString.parseInt(var2), AUTO_MINISEPARATOR});
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[]{var1[var2], arg0[var2]});
			}
		}
		return var1;
	}

	@ObfuscatedName("client.b(II)V")
	public void js5error(int arg0) {
		if (loginGamePort == loginPort) {
			loginPort = loginJs5Port;
		} else {
			loginPort = loginGamePort;
		}
		js5Stream = null;
		js5SocketReq = null;
		js5Errors++;
		js5ConnectState = 0;
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
	public void mainloop() {
		loopCycle++;
		this.serviceNetClient();
		Js5NetThread.method320();
		MidiManager.method680();
		PcmPlayer.shutdown();
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
	public void mainredraw() {
		if (GameShell.canvasReplaceRecommended) {
			ClientKeyboardListener.removeListeners(GameShell.canvas);
			ClientMouseListener.removeListeners(GameShell.canvas);
			this.addCanvas();
			ClientKeyboardListener.addListeners(GameShell.canvas);
			ClientMouseListener.addListeners(GameShell.canvas);
		}
		if (state == 0) {
			GameShell.drawProgress(TitleScreen.loadPos, null, TitleScreen.loadString);
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
				messageBox(Text.LOADING, true, JagString.join(new JagString[]{field221, JagString.parseInt(var1), AUTO_PCTCLOSE}));
			} else if (mapLoadState == 2) {
				if (locModelLoadCount > locModelLoadPrevCount) {
					locModelLoadPrevCount = locModelLoadCount;
				}
				int var2 = (locModelLoadPrevCount - locModelLoadCount) * 50 / locModelLoadPrevCount + 50;
				messageBox(Text.LOADING, true, JagString.join(new JagString[]{field221, JagString.parseInt(var2), AUTO_PCTCLOSE}));
			} else {
				messageBox(Text.LOADING, false, null);
			}
		} else if (state == 30) {
			gameDraw();
		} else if (state == 35) {
			drawFullscreen();
		} else if (state == 40) {
			messageBox(Text.CONLOST, false, Text.ATTEMPT_TO_REESTABLISH);
		}
		scrollCycle = 0;
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
				js5SocketReq = GameShell.signlink.socketreq(loginPort);
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
				var1.p4(435);
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
				Js5Net.init(js5Stream, state > 20);
				js5SocketReq = null;
				js5ConnectState = 0;
				js5Stream = null;
				js5Errors = 0;
			}
		} catch (IOException var3) {
			this.js5error(-3);
		}
	}

	@ObfuscatedName("client.e(I)V")
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
		MidiManager.method674();
		PcmPlayer.method967();
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
			if (GameShell.field1668 != null) {
				GameShell.field1668.close();
			}
		} catch (IOException var2) {
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
		}
		this.startCommon(modewhat + 32);
	}

	@ObfuscatedName("client.a(I)V")
	@Override
	public void unload() {
		PixFont.unload();
		World.unload();
		Model.unload();
		Ground.unload();
		Pix3D.unload();
		Tone.unload();
		Filter.unload();
		AnimFrame.unload();
		BZip2.unload();
		PcmPlayer.unload();
		JavaSafePcmPlayer.unload();
		MidiParser.unload();
	}

	@ObfuscatedName("client.c(Z)V")
	@Override
	public void maininit() {
		loginJs5Port = modewhere == 0 ? 443 : worldid + 50000;
		loginGamePort = modewhere == 0 ? 43594 : worldid + 40000;
		loginPort = loginGamePort;
		ClientKeyboardListener.setupKeyCodeMap();
		ClientKeyboardListener.addListeners(GameShell.canvas);
		ClientMouseListener.addListeners(GameShell.canvas);
		field1551 = SignLink.field1716;
		try {
			if (GameShell.signlink.field1715 != null) {
				GameShell.cacheDat = new BufferedRandomAccessFile(GameShell.signlink.field1715, 5200, 0);
				for (int var1 = 0; var1 < 13; var1++) {
					GameShell.cacheIndex[var1] = new BufferedRandomAccessFile(GameShell.signlink.field1702[var1], 6000, 0);
				}
				GameShell.field1668 = new BufferedRandomAccessFile(GameShell.signlink.field1707, 6000, 0);
				GameShell.masterIndex = new DataFile(255, GameShell.cacheDat, GameShell.field1668, 500000);
				GameShell.signlink.field1702 = null;
				GameShell.signlink.field1707 = null;
				GameShell.signlink.field1715 = null;
			}
		} catch (IOException var2) {
			GameShell.masterIndex = null;
			GameShell.cacheDat = null;
			GameShell.field1668 = null;
		}
		if (modewhere != 0) {
			showFps = true;
		}
		chatInterface = new IfType();
	}
}
