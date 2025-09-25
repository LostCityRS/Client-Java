package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.*;
import jagex2.config.Component;
import jagex2.dash3d.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.*;
import jagex2.io.*;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import sign.signlink;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

@ObfuscatedName("client")
public class Client extends GameShell {

	@ObfuscatedName("client.ab")
	public Pix32 imageMapdot0;

	@ObfuscatedName("client.bb")
	public Pix32 imageMapdot1;

	@ObfuscatedName("client.cb")
	public Pix32 imageMapdot2;

	@ObfuscatedName("client.db")
	public Pix32 imageMapdot3;

	@ObfuscatedName("client.eb")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.fb")
	public int[] skillLevel = new int[50];

	@ObfuscatedName("client.gb")
	public int menuSize;

	@ObfuscatedName("client.hb")
	public int chatHoveredInterfaceId;

	@ObfuscatedName("client.ib")
	public int field1215;

	@ObfuscatedName("client.jb")
	public static final int[][] DESIGN_BODY_COLOUR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.kb")
	public int viewportInterfaceId = -1;

	@ObfuscatedName("client.lb")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.mb")
	public int orbitCameraYaw;

	@ObfuscatedName("client.nb")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.ob")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.pb")
	public int titleLoginField;

	@ObfuscatedName("client.qb")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.rb")
	public int[] areaChatbackOffset;

	@ObfuscatedName("client.sb")
	public int[] areaSidebarOffset;

	@ObfuscatedName("client.tb")
	public int[] areaViewportOffset;

	@ObfuscatedName("client.ub")
	public byte[][] sceneMapLandData;

	@ObfuscatedName("client.vb")
	public int sceneCenterZoneX;

	@ObfuscatedName("client.wb")
	public int sceneCenterZoneZ;

	@ObfuscatedName("client.xb")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.yb")
	public int cutsceneDstLocalTileX;

	@ObfuscatedName("client.zb")
	public int cutsceneDstLocalTileZ;

	@ObfuscatedName("client.ac")
	public boolean showSocialInput = false;

	@ObfuscatedName("client.bc")
	public int stickyChatInterfaceId = -1;

	@ObfuscatedName("client.cc")
	public int[] varCache = new int[2000];

	@ObfuscatedName("client.dc")
	public int hintNpc;

	@ObfuscatedName("client.ec")
	public boolean flamesThread = false;

	@ObfuscatedName("client.hc")
	public int sceneBaseTileX;

	@ObfuscatedName("client.ic")
	public int sceneBaseTileZ;

	@ObfuscatedName("client.jc")
	public int mapLastBaseX;

	@ObfuscatedName("client.kc")
	public int mapLastBaseZ;

	@ObfuscatedName("client.lc")
	public int nextMusicDelay;

	@ObfuscatedName("client.mc")
	public int splitPrivateChat;

	@ObfuscatedName("client.nc")
	public int flagSceneTileX;

	@ObfuscatedName("client.oc")
	public int flagSceneTileZ;

	@ObfuscatedName("client.pc")
	public Pix32 imageMinimap;

	@ObfuscatedName("client.qc")
	public Pix32 imageFlamesLeft;

	@ObfuscatedName("client.K")
	public boolean awaitingSync = false;

	@ObfuscatedName("client.L")
	public int flashingTab = -1;

	@ObfuscatedName("client.O")
	public boolean chatbackInputOpen = false;

	@ObfuscatedName("client.R")
	public String username = "";

	@ObfuscatedName("client.S")
	public String password = "";

	@ObfuscatedName("client.V")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.W")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.X")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.Y")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.Z")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.Eb")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.Kb")
	public Component chatInterface = new Component();

	@ObfuscatedName("client.Nb")
	public int minimapLevel = -1;

	@ObfuscatedName("client.Pb")
	public int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("client.Sb")
	public int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.Wb")
	public int[] designKits = new int[7];

	@ObfuscatedName("client.Xb")
	public String socialMessage = "";

	@ObfuscatedName("client.Yb")
	public Pix32[] imageCross = new Pix32[8];

	@ObfuscatedName("client.Zb")
	public boolean flameThread = false;

	@ObfuscatedName("client.sc")
	public int[] cameraModifierWobbleScale = new int[5];

	@ObfuscatedName("client.vc")
	public boolean errorHost = false;

	@ObfuscatedName("client.Ec")
	public LinkList[][][] objStacks = new LinkList[4][104][104];

	@ObfuscatedName("client.Gc")
	public int[] cameraModifierJitter = new int[5];

	@ObfuscatedName("client.Jc")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Sc")
	public boolean[] cameraModifierEnabled = new boolean[5];

	@ObfuscatedName("client.Vc")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Wc")
	public Pix8[] imageMapscene = new Pix8[50];

	@ObfuscatedName("client.Xc")
	public String chatTyped = "";

	@ObfuscatedName("client.Yc")
	public boolean errorStarted = false;

	@ObfuscatedName("client.fd")
	public int[] cameraModifierCycle = new int[5];

	@ObfuscatedName("client.od")
	public Pix32[] imageHeadicon = new Pix32[20];

	@ObfuscatedName("client.qd")
	public Packet in = Packet.alloc(1);

	@ObfuscatedName("client.rd")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.wd")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.Ad")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.Bd")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.Ed")
	public boolean midiFading = false;

	@ObfuscatedName("client.Fd")
	public int projectX = -1;

	@ObfuscatedName("client.Gd")
	public int projectY = -1;

	@ObfuscatedName("client.Nd")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.Od")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.be")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.ee")
	public int lastWaveId = -1;

	@ObfuscatedName("client.ge")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.ie")
	public boolean ingame = false;

	@ObfuscatedName("client.je")
	public long[] friendName37 = new long[200];

	@ObfuscatedName("client.ke")
	public boolean cutscene = false;

	@ObfuscatedName("client.ne")
	public int[] messageIds = new int[100];

	@ObfuscatedName("client.ve")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.we")
	public boolean pressedContinueOption = false;

	@ObfuscatedName("client.xe")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.ye")
	public int[] messageType = new int[100];

	@ObfuscatedName("client.ze")
	public String[] messageSender = new String[100];

	@ObfuscatedName("client.Ae")
	public String[] messageText = new String[100];

	@ObfuscatedName("client.Be")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Ce")
	public String chatbackInput = "";

	@ObfuscatedName("client.He")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.Ie")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.Ke")
	public int[] designColours = new int[5];

	@ObfuscatedName("client.Le")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

	@ObfuscatedName("client.ff")
	public boolean menuVisible = false;

	@ObfuscatedName("client.jf")
	public boolean updateDesignModel = false;

	@ObfuscatedName("client.pf")
	public boolean designGender = true;

	@ObfuscatedName("client.qf")
	public String socialInput = "";

	@ObfuscatedName("client.Af")
	public int[] skillExperience = new int[50];

	@ObfuscatedName("client.Bf")
	public int[] cameraModifierWobbleSpeed = new int[5];

	@ObfuscatedName("client.Hf")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.If")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.Kf")
	public int selectedTab = 3;

	@ObfuscatedName("client.Lf")
	public int viewportOverlayInterfaceId = -1;

	@ObfuscatedName("client.Nf")
	public int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.Pf")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Qf")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.Tf")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.Uf")
	public int[] chatX = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Vf")
	public int[] chatY = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Wf")
	public int[] chatHeight = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Xf")
	public int[] chatWidth = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Yf")
	public int[] chatColour = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Zf")
	public int[] chatEffect = new int[this.MAX_CHATS];

	@ObfuscatedName("client.ag")
	public int[] chatTimer = new int[this.MAX_CHATS];

	@ObfuscatedName("client.bg")
	public String[] chatMessage = new String[this.MAX_CHATS];

	@ObfuscatedName("client.gg")
	public int[] varps = new int[2000];

	@ObfuscatedName("client.ig")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.lg")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.mg")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.og")
	public ClientNpc[] npcs = new ClientNpc[8192];

	@ObfuscatedName("client.qg")
	public int[] npcIds = new int[8192];

	@ObfuscatedName("client.yg")
	public int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("client.Ag")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Fg")
	public int[] skillBaseLevel = new int[50];

	@ObfuscatedName("client.Lg")
	public Pix32[] imageHitmark = new Pix32[20];

	@ObfuscatedName("client.Ng")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.Ug")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.Xg")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.Zg")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.bh")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.ch")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.dh")
	public ClientPlayer[] players = new ClientPlayer[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.fh")
	public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.hh")
	public int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.ih")
	public Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.lh")
	public boolean flameActive = false;

	@ObfuscatedName("client.mh")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.sh")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.th")
	public boolean field1537 = true;

	@ObfuscatedName("client.uh")
	public int[] CHAT_COLOURS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.vh")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.wh")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.xh")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.yh")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Bh")
	public Packet login = Packet.alloc(1);

	@ObfuscatedName("client.Gh")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.Jh")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Mh")
	public boolean midiActive = true;

	@ObfuscatedName("client.ai")
	public String loginMessage0 = "";

	@ObfuscatedName("client.bi")
	public String loginMessage1 = "";

	@ObfuscatedName("client.ci")
	public Pix32[] imageMapfunction = new Pix32[50];

	@ObfuscatedName("client.di")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.ei")
	public CollisionMap[] levelCollisionMap = new CollisionMap[4];

	@ObfuscatedName("client.fi")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.ii")
	public Pix8[] imageModIcons = new Pix8[2];

	@ObfuscatedName("client.ji")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.si")
	public int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("client.ti")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.ui")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.yi")
	public int localPid = -1;

	@ObfuscatedName("client.Ci")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.Ii")
	public int reportAbuseInterfaceId = -1;

	@ObfuscatedName("client.Qi")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.Ui")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.Wi")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.aj")
	public final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.bj")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.jj")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.sj")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.tj")
	public Pix8[] imageSideicons = new Pix8[13];

	@ObfuscatedName("client.Ub")
	public static int[] levelExperience = new int[99];

	@ObfuscatedName("client.Nc")
	public static final int[] DESIGN_HAIR_COLOUR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.gf")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.Rf")
	public static BigInteger LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.tg")
	public static int nodeId = 10;

	@ObfuscatedName("client.vg")
	public static boolean membersWorld = true;

	@ObfuscatedName("client.J")
	public static int oplogic3;

	@ObfuscatedName("client.M")
	public int lastAddress;

	@ObfuscatedName("client.N")
	public int inMultizone;

	@ObfuscatedName("client.U")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Ab")
	public int cutsceneDstHeight;

	@ObfuscatedName("client.Bb")
	public int cutsceneRotateSpeed;

	@ObfuscatedName("client.Cb")
	public int cutsceneRotateAcceleration;

	@ObfuscatedName("client.Fb")
	public int runweight;

	@ObfuscatedName("client.Lb")
	public int wildernessLevel;

	@ObfuscatedName("client.Mb")
	public static int cyclelogic4;

	@ObfuscatedName("client.Ob")
	public int flameCycle;

	@ObfuscatedName("client.Qb")
	public int chatEffects;

	@ObfuscatedName("client.Tb")
	public static int cyclelogic5;

	@ObfuscatedName("client.Vb")
	public int viewportHoveredInterfaceId;

	@ObfuscatedName("client.xc")
	public int hintTileX;

	@ObfuscatedName("client.yc")
	public int hintTileZ;

	@ObfuscatedName("client.zc")
	public int hintHeight;

	@ObfuscatedName("client.Ac")
	public int hintOffsetX;

	@ObfuscatedName("client.Bc")
	public int hintOffsetZ;

	@ObfuscatedName("client.Dc")
	public int worldLocationState;

	@ObfuscatedName("client.Fc")
	public int sceneDelta;

	@ObfuscatedName("client.Hc")
	public int warnMembersInNonMembers;

	@ObfuscatedName("client.Kc")
	public static int oplogic10;

	@ObfuscatedName("client.Zc")
	public int crossX;

	@ObfuscatedName("client.ad")
	public int crossY;

	@ObfuscatedName("client.bd")
	public int crossCycle;

	@ObfuscatedName("client.cd")
	public int crossMode;

	@ObfuscatedName("client.gd")
	public int cameraX;

	@ObfuscatedName("client.hd")
	public int cameraY;

	@ObfuscatedName("client.id")
	public int cameraZ;

	@ObfuscatedName("client.jd")
	public int cameraPitch;

	@ObfuscatedName("client.kd")
	public int cameraYaw;

	@ObfuscatedName("client.ld")
	public int chatScrollOffset;

	@ObfuscatedName("client.sd")
	public int spellSelected;

	@ObfuscatedName("client.td")
	public int activeSpellId;

	@ObfuscatedName("client.ud")
	public int activeSpellFlags;

	@ObfuscatedName("client.xd")
	public static int oplogic9;

	@ObfuscatedName("client.zd")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.Cd")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.Dd")
	public int midiSong;

	@ObfuscatedName("client.Hd")
	public static int oplogic7;

	@ObfuscatedName("client.Id")
	public int objDragInterfaceId;

	@ObfuscatedName("client.Jd")
	public int objDragSlot;

	@ObfuscatedName("client.Kd")
	public int objDragArea;

	@ObfuscatedName("client.Ld")
	public int objGrabX;

	@ObfuscatedName("client.Md")
	public int objGrabY;

	@ObfuscatedName("client.ae")
	public int friendCount;

	@ObfuscatedName("client.ce")
	public int ignoreCount;

	@ObfuscatedName("client.de")
	public int lastProgressPercent;

	@ObfuscatedName("client.le")
	public static int oplogic6;

	@ObfuscatedName("client.oe")
	public static int oplogic1;

	@ObfuscatedName("client.re")
	public int orbitCameraX;

	@ObfuscatedName("client.se")
	public int orbitCameraZ;

	@ObfuscatedName("client.ue")
	public int macroCameraAngle;

	@ObfuscatedName("client.De")
	public int daysSinceLogin;

	@ObfuscatedName("client.Ge")
	public int privateMessageCount;

	@ObfuscatedName("client.We")
	public int cutsceneSrcLocalTileX;

	@ObfuscatedName("client.Xe")
	public int cutsceneSrcLocalTileZ;

	@ObfuscatedName("client.Ye")
	public int cutsceneSrcHeight;

	@ObfuscatedName("client.Ze")
	public int cutsceneMoveSpeed;

	@ObfuscatedName("client.af")
	public int cutsceneMoveAcceleration;

	@ObfuscatedName("client.bf")
	public int oneMouseButton;

	@ObfuscatedName("client.cf")
	public int ptype0;

	@ObfuscatedName("client.df")
	public int ptype1;

	@ObfuscatedName("client.ef")
	public int ptype2;

	@ObfuscatedName("client.hf")
	public static int cyclelogic1;

	@ObfuscatedName("client.of")
	public int chatPublicMode;

	@ObfuscatedName("client.rf")
	public int objDragCycles;

	@ObfuscatedName("client.uf")
	public int tryMoveNearest;

	@ObfuscatedName("client.vf")
	public int objSelected;

	@ObfuscatedName("client.wf")
	public int objSelectedSlot;

	@ObfuscatedName("client.xf")
	public int objSelectedInterface;

	@ObfuscatedName("client.yf")
	public int objInterface;

	@ObfuscatedName("client.Cf")
	public int hoveredSlot;

	@ObfuscatedName("client.Df")
	public int hoveredSlotInterfaceId;

	@ObfuscatedName("client.Ef")
	public static int loopCycle;

	@ObfuscatedName("client.Ff")
	public static int oplogic4;

	@ObfuscatedName("client.Jf")
	public int sidebarHoveredInterfaceId;

	@ObfuscatedName("client.Mf")
	public int macroMinimapZoom;

	@ObfuscatedName("client.Sf")
	public int chatCount;

	@ObfuscatedName("client.hg")
	public int macroCameraX;

	@ObfuscatedName("client.jg")
	public int overrideChat;

	@ObfuscatedName("client.ng")
	public int scrollInputPadding;

	@ObfuscatedName("client.pg")
	public int npcCount;

	@ObfuscatedName("client.sg")
	public int unreadMessageCount;

	@ObfuscatedName("client.ug")
	public static int portOffset;

	@ObfuscatedName("client.xg")
	public int chatTradeMode;

	@ObfuscatedName("client.zg")
	public static int oplogic8;

	@ObfuscatedName("client.Gg")
	public int menuArea;

	@ObfuscatedName("client.Hg")
	public int menuX;

	@ObfuscatedName("client.Ig")
	public int menuY;

	@ObfuscatedName("client.Jg")
	public int menuWidth;

	@ObfuscatedName("client.Kg")
	public int menuHeight;

	@ObfuscatedName("client.Mg")
	public int field1504;

	@ObfuscatedName("client.Rg")
	public int sceneState;

	@ObfuscatedName("client.Sg")
	public int titleScreenState;

	@ObfuscatedName("client.Tg")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Vg")
	public int staffmodlevel;

	@ObfuscatedName("client.Yg")
	public int macroMinimapCycle;

	@ObfuscatedName("client.ah")
	public int dragCycles;

	@ObfuscatedName("client.eh")
	public int playerCount;

	@ObfuscatedName("client.gh")
	public int entityUpdateCount;

	@ObfuscatedName("client.nh")
	public int psize;

	@ObfuscatedName("client.oh")
	public int ptype;

	@ObfuscatedName("client.ph")
	public int idleNetCycles;

	@ObfuscatedName("client.qh")
	public int noTimeoutCycle;

	@ObfuscatedName("client.rh")
	public int idleTimeout;

	@ObfuscatedName("client.zh")
	public int runenergy;

	@ObfuscatedName("client.Ih")
	public int entityRemovalCount;

	@ObfuscatedName("client.hi")
	public int chatPrivateMode;

	@ObfuscatedName("client.ri")
	public int currentLevel;

	@ObfuscatedName("client.zi")
	public static int cyclelogic2;

	@ObfuscatedName("client.Ai")
	public int baseX;

	@ObfuscatedName("client.Bi")
	public int baseZ;

	@ObfuscatedName("client.Di")
	public static int oplogic2;

	@ObfuscatedName("client.Ei")
	public static int oplogic5;

	@ObfuscatedName("client.Fi")
	public int hintPlayer;

	@ObfuscatedName("client.Ki")
	public int flameGradientCycle0;

	@ObfuscatedName("client.Li")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Mi")
	public int waveCount;

	@ObfuscatedName("client.Pi")
	public int macroCameraZ;

	@ObfuscatedName("client.Ri")
	public int lastHoveredInterfaceId;

	@ObfuscatedName("client.Si")
	public int systemUpdateTimer;

	@ObfuscatedName("client.Vi")
	public int lastWaveLength;

	@ObfuscatedName("client.Xi")
	public int macroCameraCycle;

	@ObfuscatedName("client.Yi")
	public int hintType;

	@ObfuscatedName("client.cj")
	public int membersAccount;

	@ObfuscatedName("client.dj")
	public int socialInputType;

	@ObfuscatedName("client.ej")
	public int bankArrangeMode;

	@ObfuscatedName("client.gj")
	public int flameCycle0;

	@ObfuscatedName("client.hj")
	public static int drawCycle;

	@ObfuscatedName("client.ij")
	public int sceneCycle;

	@ObfuscatedName("client.kj")
	public static int cyclelogic3;

	@ObfuscatedName("client.nj")
	public int selectedCycle;

	@ObfuscatedName("client.oj")
	public int selectedInterface;

	@ObfuscatedName("client.pj")
	public int selectedItem;

	@ObfuscatedName("client.qj")
	public int selectedArea;

	@ObfuscatedName("client.rj")
	public static int cyclelogic6;

	@ObfuscatedName("client.eg")
	public long socialName37;

	@ObfuscatedName("client.rg")
	public long lastWaveStartTime;

	@ObfuscatedName("client.kh")
	public long field1528;

	@ObfuscatedName("client.Ni")
	public long serverSeed;

	@ObfuscatedName("client.Rb")
	public World3D scene;

	@ObfuscatedName("client.jh")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.T")
	public Pix32 imageMapedge;

	@ObfuscatedName("client.Hb")
	public Pix32 imageMapmarker0;

	@ObfuscatedName("client.Ib")
	public Pix32 imageMapmarker1;

	@ObfuscatedName("client.rc")
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.Ic")
	public Pix32 imageCompass;

	@ObfuscatedName("client.Ee")
	public Pix32 genderButtonImage0;

	@ObfuscatedName("client.Fe")
	public Pix32 genderButtonImage1;

	@ObfuscatedName("client.md")
	public Pix8 imageScrollbar0;

	@ObfuscatedName("client.nd")
	public Pix8 imageScrollbar1;

	@ObfuscatedName("client.Rd")
	public Pix8 imageRedstone1;

	@ObfuscatedName("client.Sd")
	public Pix8 imageRedstone2;

	@ObfuscatedName("client.Td")
	public Pix8 imageRedstone3;

	@ObfuscatedName("client.Ud")
	public Pix8 imageRedstone1h;

	@ObfuscatedName("client.Vd")
	public Pix8 imageRedstone2h;

	@ObfuscatedName("client.Cg")
	public Pix8 imageInvback;

	@ObfuscatedName("client.Dg")
	public Pix8 imageMapback;

	@ObfuscatedName("client.Eg")
	public Pix8 imageChatback;

	@ObfuscatedName("client.Og")
	public Pix8 imageBackbase1;

	@ObfuscatedName("client.Pg")
	public Pix8 imageBackbase2;

	@ObfuscatedName("client.Qg")
	public Pix8 imageBackhmid1;

	@ObfuscatedName("client.ki")
	public Pix8 imageRedstone1v;

	@ObfuscatedName("client.li")
	public Pix8 imageRedstone2v;

	@ObfuscatedName("client.mi")
	public Pix8 imageRedstone3v;

	@ObfuscatedName("client.ni")
	public Pix8 imageRedstone1hv;

	@ObfuscatedName("client.oi")
	public Pix8 imageRedstone2hv;

	@ObfuscatedName("client.lj")
	public Pix8 imageTitlebox;

	@ObfuscatedName("client.mj")
	public Pix8 imageTitlebutton;

	@ObfuscatedName("client.Oc")
	public PixFont fontPlain11;

	@ObfuscatedName("client.Pc")
	public PixFont fontPlain12;

	@ObfuscatedName("client.Qc")
	public PixFont fontBold12;

	@ObfuscatedName("client.Rc")
	public PixFont fontQuill8;

	@ObfuscatedName("client.Ne")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.Oe")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.Pe")
	public PixMap areaBackright1;

	@ObfuscatedName("client.Qe")
	public PixMap areaBackright2;

	@ObfuscatedName("client.Re")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.Se")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.Te")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.Ue")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.Ve")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.kf")
	public PixMap areaSidebar;

	@ObfuscatedName("client.lf")
	public PixMap areaMapback;

	@ObfuscatedName("client.mf")
	public PixMap areaViewport;

	@ObfuscatedName("client.nf")
	public PixMap areaChatback;

	@ObfuscatedName("client.Oh")
	public PixMap imageTitle2;

	@ObfuscatedName("client.Ph")
	public PixMap imageTitle3;

	@ObfuscatedName("client.Qh")
	public PixMap imageTitle4;

	@ObfuscatedName("client.Rh")
	public PixMap imageTitle0;

	@ObfuscatedName("client.Sh")
	public PixMap imageTitle1;

	@ObfuscatedName("client.Th")
	public PixMap imageTitle5;

	@ObfuscatedName("client.Uh")
	public PixMap imageTitle6;

	@ObfuscatedName("client.Vh")
	public PixMap imageTitle7;

	@ObfuscatedName("client.Wh")
	public PixMap imageTitle8;

	@ObfuscatedName("client.Xh")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.Yh")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.Zh")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.gi")
	public OnDemand onDemand;

	@ObfuscatedName("client.qe")
	public Isaac randomIn;

	@ObfuscatedName("client.tc")
	public Jagfile jagTitle;

	@ObfuscatedName("client.fe")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.Mc")
	public ClientStream stream;

	@ObfuscatedName("client.vd")
	public String spellCaption;

	@ObfuscatedName("client.zf")
	public String objSelectedName;

	@ObfuscatedName("client.Gf")
	public String modalMessage;

	@ObfuscatedName("client.Ji")
	public String lastProgressMessage;

	@ObfuscatedName("client.Gb")
	public static boolean alreadyStarted;

	@ObfuscatedName("client.wg")
	public static boolean lowMem;

	@ObfuscatedName("client.Wd")
	public int[] flameGradient;

	@ObfuscatedName("client.Xd")
	public int[] flameGradient0;

	@ObfuscatedName("client.Yd")
	public int[] flameGradient1;

	@ObfuscatedName("client.Zd")
	public int[] flameGradient2;

	@ObfuscatedName("client.sf")
	public int[] flameBuffer2;

	@ObfuscatedName("client.tf")
	public int[] flameBuffer3;

	@ObfuscatedName("client.Dh")
	public int[] sceneMapIndex;

	@ObfuscatedName("client.Eh")
	public int[] sceneMapLandFile;

	@ObfuscatedName("client.Fh")
	public int[] sceneMapLocFile;

	@ObfuscatedName("client.vi")
	public int[] flameBuffer0;

	@ObfuscatedName("client.wi")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Hh")
	public Pix8[] imageRunes;

	@ObfuscatedName("client.Kh")
	public byte[][] sceneMapLocData;

	@ObfuscatedName("client.Zi")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("client.Nh")
	public int[][][] levelHeightmap;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			levelExperience[var1] = var0 / 4;
		}
	}

	// ----

	public static void main(String[] args) {
		try {
			System.out.println("RS2 user client - release #" + signlink.clientversion);

			if (args.length == 5) {
				nodeId = Integer.parseInt(args[0]);
				portOffset = Integer.parseInt(args[1]);

				if (args[2].equals("lowmem")) {
					setLowMem();
				} else if (args[2].equals("highmem")) {
					setHighMem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				if (args[3].equals("free")) {
					membersWorld = false;
				} else if (args[3].equals("members")) {
					membersWorld = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}

				signlink.storeid = Integer.parseInt(args[4]);
				signlink.startpriv(InetAddress.getLocalHost());

				Client app = new Client();
				app.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception ignore) {
		}
	}

	public void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));

		String lowmem = this.getParameter("lowmem");
		if (lowmem != null && lowmem.equals("1")) {
			setLowMem();
		} else {
			setHighMem();
		}

		String free = this.getParameter("free");
		if (free != null && free.equals("1")) {
			membersWorld = false;
		} else {
			membersWorld = true;
		}

		this.initApplet(765, 503);
	}

	public void run() {
		if (this.flamesThread) {
			this.runFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.y(I)V")
	public static void setLowMem() {
		World3D.lowMem = true;
		Pix3D.lowMem = true;
		lowMem = true;
		World.lowMem = true;
	}

	@ObfuscatedName("client.q(I)V")
	public static void setHighMem() {
		World3D.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		World.lowMem = false;
	}

	// ----

	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}

		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception ignore) {
		}

		return super.getCodeBase();
	}

	public String getParameter(String name) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(name);
		}

		return super.getParameter(name);

	}

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public String getHost() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (super.frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public java.awt.Component getBaseComponent() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}

		return this;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream openUrl(String url) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.openurl(url);
		}

		return new DataInputStream((new URL(this.getCodeBase(), url)).openStream());
	}

	@ObfuscatedName("client.Y(I)Ljava/net/Socket;")
	public Socket openSocket(int port) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(port);
		}

		return new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable thread, int priority) {
		if (priority > 10) {
			priority = 10;
		}

		if (signlink.mainapp == null) {
			super.startThread(thread, priority);
		} else {
			signlink.startthread(thread, priority);
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public void saveMidi(boolean fade, byte[] src) {
		signlink.midifade = fade ? 1 : 0;
		signlink.midisave(src, src.length);
	}

	@ObfuscatedName("client.J(I)V")
	public void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ZII)V")
	public void setMidiVolume(boolean active, int volume) {
		signlink.midivol = volume;
		if (active) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(IB[B)Z")
	public boolean saveWave(int length, byte[] src) {
		if (src == null) {
			return true;
		}

		return signlink.wavesave(src, length);
	}

	@ObfuscatedName("client.i(B)Z")
	public boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.c(II)V")
	public void setWaveVolume(int volume) {
		signlink.wavevol = volume;
	}

	// ----

	@ObfuscatedName("client.a()V")
	public void load() {
		if (signlink.sunjava) {
			super.mindel = 5;
		}

		if (alreadyStarted) {
			this.errorStarted = true;
			return;
		}

		alreadyStarted = true;

		boolean validHost = false;
		String host = this.getHost();
		if (host.endsWith("jagex.com")) {
			validHost = true;
		} else if (host.endsWith("runescape.com")) {
			validHost = true;
		} else if (host.endsWith("192.168.1.2")) {
			validHost = true;
		} else if (host.endsWith("192.168.1.247")) {
			validHost = true;
		} else if (host.endsWith("192.168.1.249")) {
			validHost = true;
		} else if (host.endsWith("192.168.1.253")) {
			validHost = true;
		} else if (host.endsWith("192.168.1.254")) {
			validHost = true;
		} else if (host.endsWith("127.0.0.1")) {
			validHost = true;
		}

		if (!validHost) {
			this.errorHost = true;
			return;
		}

		if (signlink.cache_dat != null) {
			for (int i = 0; i < 5; i++) {
				this.fileStreams[i] = new FileStream(signlink.cache_dat, i + 1, 500000, signlink.cache_idx[i]);
			}
		}

		try {
			int retry = 5;

			this.jagChecksum[8] = 0;
			while (this.jagChecksum[8] == 0) {
				this.drawProgress("Connecting to web server", 20);

				try {
					DataInputStream req = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D));

					Packet crc = new Packet(new byte[36]);
					req.readFully(crc.data, 0, 36);

					for (int i = 0; i < 9; i++) {
						this.jagChecksum[i] = crc.g4();
					}

					req.close();
				} catch (IOException ignore) {
					for (int i = retry; i > 0; i--) {
						this.drawProgress("Error loading - Will retry in " + i + " secs.", 10);

						try {
							Thread.sleep(1000L);
						} catch (Exception ignore2) {
						}
					}

					retry *= 2;
					if (retry > 60) {
						retry = 60;
					}
				}
			}

			this.jagTitle = this.getJagFile("title screen", 1, this.jagChecksum[1], "title", 25);
			this.fontPlain11 = new PixFont("p11", this.jagTitle);
			this.fontPlain12 = new PixFont("p12", this.jagTitle);
			this.fontBold12 = new PixFont("b12", this.jagTitle);
			this.fontQuill8 = new PixFont("q8", this.jagTitle);

			this.loadTitleBackground();
			this.loadTitleImages();

			Jagfile jagConfig = this.getJagFile("config", 2, this.jagChecksum[2], "config", 30);
			Jagfile jagInterface = this.getJagFile("interface", 3, this.jagChecksum[3], "interface", 35);
			Jagfile jagMedia = this.getJagFile("2d graphics", 4, this.jagChecksum[4], "media", 40);
			Jagfile jagTextures = this.getJagFile("textures", 6, this.jagChecksum[6], "textures", 45);
			Jagfile jagWordenc = this.getJagFile("chat system", 7, this.jagChecksum[7], "wordenc", 50);
			Jagfile jagSounds = this.getJagFile("sound effects", 8, this.jagChecksum[8], "sounds", 55);

			this.levelTileFlags = new byte[4][104][104];
			this.levelHeightmap = new int[4][105][105];
			this.scene = new World3D(this.levelHeightmap, 104, 104, 4);
			for (int i = 0; i < 4; i++) {
				this.levelCollisionMap[i] = new CollisionMap(104, 104);
			}
			this.imageMinimap = new Pix32(512, 512);

			Jagfile jagVersionList = this.getJagFile("update list", 5, this.jagChecksum[5], "versionlist", 60);

			this.drawProgress("Connecting to update server", 60);

			this.onDemand = new OnDemand();
			this.onDemand.unpack(jagVersionList, this);
			AnimFrame.init(this.onDemand.getAnimCount());
			Model.init(this.onDemand.getFileCount(0), this.onDemand);

			if (!lowMem) {
				this.midiSong = 0;
				this.midiFading = false;
				this.onDemand.request(2, this.midiSong);

				while (this.onDemand.remaining() > 0) {
					this.updateOnDemand();

					try {
						Thread.sleep(100L);
					} catch (Exception ignore) {
					}
				}
			}

			this.drawProgress("Requesting animations", 65);

			int animCount = this.onDemand.getFileCount(1);
			for (int i = 0; i < animCount; i++) {
				this.onDemand.request(1, i);
			}

			while (this.onDemand.remaining() > 0) {
				int progress = animCount - this.onDemand.remaining();
				if (progress > 0) {
					this.drawProgress("Loading animations - " + progress * 100 / animCount + "%", 65);
				}

				this.updateOnDemand();

				try {
					Thread.sleep(100L);
				} catch (Exception ignore) {
				}
			}

			this.drawProgress("Requesting models", 70);

			int modelCount = this.onDemand.getFileCount(0);
			for (int i = 0; i < modelCount; i++) {
				int flags = this.onDemand.getModelFlags(i);
				if ((flags & 0x1) != 0) {
					this.onDemand.request(0, i);
				}
			}

			int modelPrefetch = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int progress = modelPrefetch - this.onDemand.remaining();
				if (progress > 0) {
					this.drawProgress("Loading models - " + progress * 100 / modelPrefetch + "%", 70);
				}

				this.updateOnDemand();

				try {
					Thread.sleep(100L);
				} catch (Exception ignore) {
				}
			}

			if (this.fileStreams[0] != null) {
				this.drawProgress("Requesting maps", 75);

				this.onDemand.request(3, this.onDemand.getMapFile(0, 47, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 47, 48));

				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 48));

				this.onDemand.request(3, this.onDemand.getMapFile(0, 49, 48));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 49, 48));

				this.onDemand.request(3, this.onDemand.getMapFile(0, 47, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 47, 47));

				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 47));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 47));

				this.onDemand.request(3, this.onDemand.getMapFile(0, 48, 148));
				this.onDemand.request(3, this.onDemand.getMapFile(1, 48, 148));

				int mapPrefetch = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int progress = mapPrefetch - this.onDemand.remaining();
					if (progress > 0) {
						this.drawProgress("Loading maps - " + progress * 100 / mapPrefetch + "%", 75);
					}

					this.updateOnDemand();

					try {
						Thread.sleep(100L);
					} catch (Exception ignore) {
					}
				}
			}

			int modelCount2 = this.onDemand.getFileCount(0);
			for (int i = 0; i < modelCount2; i++) {
				int flags = this.onDemand.getModelFlags(i);

				byte priority = 0;
				if ((flags & 0x8) != 0) {
					priority = 10;
				} else if ((flags & 0x20) != 0) {
					priority = 9;
				} else if ((flags & 0x10) != 0) {
					priority = 8;
				} else if ((flags & 0x40) != 0) {
					priority = 7;
				} else if ((flags & 0x80) != 0) {
					priority = 6;
				} else if ((flags & 0x2) != 0) {
					priority = 5;
				} else if ((flags & 0x4) != 0) {
					priority = 4;
				}

				if ((flags & 0x1) != 0) {
					priority = 3;
				}

				if (priority != 0) {
					this.onDemand.prefetchPriority(i, 0, priority);
				}
			}

			this.onDemand.prefetchMaps(membersWorld);

			if (!lowMem) {
				int midiCount = this.onDemand.getFileCount(2);
				for (int i = 1; i < midiCount; i++) {
					if (this.onDemand.shouldPrefetchMidi(i)) {
						this.onDemand.prefetchPriority(i, 2, (byte) 1);
					}
				}
			}

			this.drawProgress("Unpacking media", 80);

			this.imageInvback = new Pix8(jagMedia, "invback", 0);
			this.imageChatback = new Pix8(jagMedia, "chatback", 0);
			this.imageMapback = new Pix8(jagMedia, "mapback", 0);

			this.imageBackbase1 = new Pix8(jagMedia, "backbase1", 0);
			this.imageBackbase2 = new Pix8(jagMedia, "backbase2", 0);
			this.imageBackhmid1 = new Pix8(jagMedia, "backhmid1", 0);

			for (int i = 0; i < 13; i++) {
				this.imageSideicons[i] = new Pix8(jagMedia, "sideicons", i);
			}

			this.imageCompass = new Pix32(jagMedia, "compass", 0);

			this.imageMapedge = new Pix32(jagMedia, "mapedge", 0);
			this.imageMapedge.trim();

			try {
				for (int i = 0; i < 50; i++) {
					this.imageMapscene[i] = new Pix8(jagMedia, "mapscene", i);
				}
			} catch (Exception ignore) {
			}

			try {
				for (int i = 0; i < 50; i++) {
					this.imageMapfunction[i] = new Pix32(jagMedia, "mapfunction", i);
				}
			} catch (Exception ignore) {
			}

			try {
				for (int i = 0; i < 20; i++) {
					this.imageHitmark[i] = new Pix32(jagMedia, "hitmarks", i);
				}
			} catch (Exception ignore) {
			}
			try {
				for (int i = 0; i < 20; i++) {
					this.imageHeadicon[i] = new Pix32(jagMedia, "headicons", i);
				}
			} catch (Exception ignore) {
			}

			this.imageMapmarker0 = new Pix32(jagMedia, "mapmarker", 0);
			this.imageMapmarker1 = new Pix32(jagMedia, "mapmarker", 1);

			for (int i = 0; i < 8; i++) {
				this.imageCross[i] = new Pix32(jagMedia, "cross", i);
			}

			this.imageMapdot0 = new Pix32(jagMedia, "mapdots", 0);
			this.imageMapdot1 = new Pix32(jagMedia, "mapdots", 1);
			this.imageMapdot2 = new Pix32(jagMedia, "mapdots", 2);
			this.imageMapdot3 = new Pix32(jagMedia, "mapdots", 3);

			this.imageScrollbar0 = new Pix8(jagMedia, "scrollbar", 0);
			this.imageScrollbar1 = new Pix8(jagMedia, "scrollbar", 1);

			this.imageRedstone1 = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone2 = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone3 = new Pix8(jagMedia, "redstone3", 0);

			this.imageRedstone1h = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone1h.hflip();

			this.imageRedstone2h = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2h.hflip();

			this.imageRedstone1v = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone1v.vflip();

			this.imageRedstone2v = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2v.vflip();

			this.imageRedstone3v = new Pix8(jagMedia, "redstone3", 0);
			this.imageRedstone3v.vflip();

			this.imageRedstone1hv = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone1hv.hflip();
			this.imageRedstone1hv.vflip();

			this.imageRedstone2hv = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2hv.hflip();
			this.imageRedstone2hv.vflip();

			for (int i = 0; i < 2; i++) {
				this.imageModIcons[i] = new Pix8(jagMedia, "mod_icons", i);
			}

			Pix32 backleft1 = new Pix32(jagMedia, "backleft1", 0);
			this.areaBackleft1 = new PixMap(backleft1.hi, this.getBaseComponent(), backleft1.wi);
			backleft1.quickPlotSprite(0, 0);

			Pix32 backleft2 = new Pix32(jagMedia, "backleft2", 0);
			this.areaBackleft2 = new PixMap(backleft2.hi, this.getBaseComponent(), backleft2.wi);
			backleft2.quickPlotSprite(0, 0);

			Pix32 backright1 = new Pix32(jagMedia, "backright1", 0);
			this.areaBackright1 = new PixMap(backright1.hi, this.getBaseComponent(), backright1.wi);
			backright1.quickPlotSprite(0, 0);

			Pix32 backright2 = new Pix32(jagMedia, "backright2", 0);
			this.areaBackright2 = new PixMap(backright2.hi, this.getBaseComponent(), backright2.wi);
			backright2.quickPlotSprite(0, 0);

			Pix32 backtop1 = new Pix32(jagMedia, "backtop1", 0);
			this.areaBacktop1 = new PixMap(backtop1.hi, this.getBaseComponent(), backtop1.wi);
			backtop1.quickPlotSprite(0, 0);

			Pix32 backvmid1 = new Pix32(jagMedia, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(backvmid1.hi, this.getBaseComponent(), backvmid1.wi);
			backvmid1.quickPlotSprite(0, 0);

			Pix32 backvmid2 = new Pix32(jagMedia, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(backvmid2.hi, this.getBaseComponent(), backvmid2.wi);
			backvmid2.quickPlotSprite(0, 0);

			Pix32 backvmid3 = new Pix32(jagMedia, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(backvmid3.hi, this.getBaseComponent(), backvmid3.wi);
			backvmid3.quickPlotSprite(0, 0);

			Pix32 backhmid2 = new Pix32(jagMedia, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(backhmid2.hi, this.getBaseComponent(), backhmid2.wi);
			backhmid2.quickPlotSprite(0, 0);

			int randR = (int) (Math.random() * 21.0D) - 10;
			int randG = (int) (Math.random() * 21.0D) - 10;
			int randB = (int) (Math.random() * 21.0D) - 10;
			int rand = (int) (Math.random() * 41.0D) - 20;

			for (int i = 0; i < 50; i++) {
				if (this.imageMapfunction[i] != null) {
					this.imageMapfunction[i].rgbAdjust(randR + rand, randG + rand, randB + rand);
				}

				if (this.imageMapscene[i] != null) {
					this.imageMapscene[i].rgbAdjust(randR + rand, randG + rand, randB + rand);
				}
			}

			this.drawProgress("Unpacking textures", 83);

			Pix3D.unpackTextures(jagTextures);
			Pix3D.initColourTable(0.8D);
			Pix3D.initPool(20);

			this.drawProgress("Unpacking config", 86);

			SeqType.unpack(jagConfig);
			LocType.unpack(jagConfig);
			FloType.unpack(jagConfig);
			ObjType.unpack(jagConfig);
			NpcType.unpack(jagConfig);
			IdkType.unpack(jagConfig);
			SpotAnimType.unpack(jagConfig);
			VarpType.unpack(jagConfig);
			ObjType.membersWorld = membersWorld;

			if (!lowMem) {
				this.drawProgress("Unpacking sounds", 90);

				byte[] dat = jagSounds.read("sounds.dat", null);
				Packet sounds = new Packet(dat);
				Wave.unpack(sounds);
			}

			this.drawProgress("Unpacking interfaces", 95);

			PixFont[] fonts = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8 };
			Component.unpack(fonts, jagMedia, jagInterface);

			this.drawProgress("Preparing game engine", 100);

			for (int y = 0; y < 33; y++) {
				int left = 999;
				int right = 0;

				for (int x = 0; x < 34; x++) {
					if (this.imageMapback.pixels[x + y * this.imageMapback.wi] == 0) {
						if (left == 999) {
							left = x;
						}
					} else if (left != 999) {
						right = x;
						break;
					}
				}

				this.compassMaskLineOffsets[y] = left;
				this.compassMaskLineLengths[y] = right - left;
			}

			for (int y = 5; y < 156; y++) {
				int left = 999;
				int right = 0;

				for (int x = 25; x < 172; x++) {
					if (this.imageMapback.pixels[x + y * this.imageMapback.wi] == 0 && (x > 34 || y > 34)) {
						if (left == 999) {
							left = x;
						}
					} else if (left != 999) {
						right = x;
						break;
					}
				}

				this.minimapMaskLineOffsets[y - 5] = left - 25;
				this.minimapMaskLineLengths[y - 5] = right - left;
			}

			Pix3D.init3D(479, 96);
			this.areaChatbackOffset = Pix3D.lineOffset;

			Pix3D.init3D(190, 261);
			this.areaSidebarOffset = Pix3D.lineOffset;

			Pix3D.init3D(512, 334);
			this.areaViewportOffset = Pix3D.lineOffset;

			int[] distance = new int[9];
			for (int x = 0; x < 9; x++) {
				int angle = x * 32 + 128 + 15;
				int offset = angle * 3 + 600;
				int sin = Pix3D.sinTable[angle];
				distance[x] = offset * sin >> 16;
			}

			World3D.init(800, 512, distance, 334, 500);
			WordFilter.unpack(jagWordenc);

			this.mouseTracking = new MouseTracking(this);
		} catch (Exception ex) {
			signlink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.b(I)V")
	public void update() {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			return;
		}

		loopCycle++;

		if (this.ingame) {
			this.updateGame();
		} else {
			this.updateTitle();
		}

		this.updateOnDemand();
	}

	@ObfuscatedName("client.d(I)V")
	public void draw() {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			this.drawError();
			return;
		}

		drawCycle++;

		if (this.ingame) {
			this.drawGame();
		} else {
			this.drawTitle();
		}

		this.dragCycles = 0;
	}

	@ObfuscatedName("client.c(I)V")
	public void unload() {
		signlink.reporterror = false;

		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception ignore) {
		}

		this.stream = null;

		this.stopMidi();

		if (this.mouseTracking != null) {
			this.mouseTracking.active = false;
		}
		this.mouseTracking = null;

		this.onDemand.stop();
		this.onDemand = null;

		this.out = null;
		this.login = null;
		this.in = null;

		this.sceneMapIndex = null;
		this.sceneMapLandData = null;
		this.sceneMapLocData = null;
		this.sceneMapLandFile = null;
		this.sceneMapLocFile = null;

		this.levelHeightmap = null;
		this.levelTileFlags = null;

		this.scene = null;

		this.levelCollisionMap = null;

		this.bfsDirection = null;
		this.bfsCost = null;
		this.bfsStepX = null;
		this.bfsStepZ = null;

		this.textureBuffer = null;

		this.areaSidebar = null;
		this.areaMapback = null;
		this.areaViewport = null;
		this.areaChatback = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackhmid1 = null;
		this.areaBackleft1 = null;
		this.areaBackleft2 = null;
		this.areaBackright1 = null;
		this.areaBackright2 = null;
		this.areaBacktop1 = null;
		this.areaBackvmid1 = null;
		this.areaBackvmid2 = null;
		this.areaBackvmid3 = null;
		this.areaBackhmid2 = null;

		this.imageInvback = null;
		this.imageMapback = null;
		this.imageChatback = null;
		this.imageBackbase1 = null;
		this.imageBackbase2 = null;
		this.imageBackhmid1 = null;
		this.imageSideicons = null;
		this.imageRedstone1 = null;
		this.imageRedstone2 = null;
		this.imageRedstone3 = null;
		this.imageRedstone1h = null;
		this.imageRedstone2h = null;
		this.imageRedstone1v = null;
		this.imageRedstone2v = null;
		this.imageRedstone3v = null;
		this.imageRedstone1hv = null;
		this.imageRedstone2hv = null;
		this.imageCompass = null;
		this.imageHitmark = null;
		this.imageHeadicon = null;
		this.imageCross = null;
		this.imageMapdot0 = null;
		this.imageMapdot1 = null;
		this.imageMapdot2 = null;
		this.imageMapdot3 = null;
		this.imageMapscene = null;
		this.imageMapfunction = null;

		this.tileLastOccupiedCycle = null;

		this.players = null;
		this.playerIds = null;
		this.entityUpdateIds = null;
		this.playerAppearanceBuffer = null;
		this.entityRemovalIds = null;
		this.npcs = null;
		this.npcIds = null;

		this.objStacks = null;
		this.locChanges = null;
		this.projectiles = null;
		this.spotanims = null;

		this.menuParamB = null;
		this.menuParamC = null;
		this.menuAction = null;
		this.menuParamA = null;
		this.menuOption = null;

		this.varps = null;

		this.activeMapFunctionX = null;
		this.activeMapFunctionZ = null;
		this.activeMapFunctions = null;

		this.imageMinimap = null;

		this.friendName = null;
		this.friendName37 = null;
		this.friendWorld = null;

		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;

		this.unloadTitle();

		LocType.unload();
		NpcType.unload();
		ObjType.unload();
		FloType.types = null;
		IdkType.types = null;
		Component.types = null;
		UnkType.types = null;
		SeqType.types = null;
		SpotAnimType.types = null;
		SpotAnimType.modelCache = null;
		VarpType.types = null;
		super.drawArea = null;
		ClientPlayer.modelCache = null;

		Pix3D.unload();
		World3D.unload();
		Model.unload();
		AnimFrame.unload();

		System.gc();
	}

	@ObfuscatedName("client.e(I)V")
	public void refresh() {
		this.redrawFrame = true;
	}

	// ----

	@ObfuscatedName("client.a(BLjava/lang/String;I)V")
	public void drawProgress(String message, int percent) {
		this.lastProgressPercent = percent;
		this.lastProgressMessage = message;

		this.loadTitle();

		if (this.jagTitle == null) {
			super.drawProgress(message, percent);
			return;
		}

		this.imageTitle4.bind();

		short x = 360;
		short y = 200;

		int offsetY = 20;
		this.fontBold12.centreString(16777215, x / 2, y / 2 - 26 - offsetY, "RuneScape is loading - please wait...");

		int midY = y / 2 - 18 - offsetY;
		Pix2D.drawRect(x / 2 - 152, 34, midY, 304, 9179409);
		Pix2D.drawRect(x / 2 - 151, 32, midY + 1, 302, 0);
		Pix2D.fillRect(midY + 2, 30, x / 2 - 150, percent * 3, 9179409);
		Pix2D.fillRect(midY + 2, 30, x / 2 - 150 + percent * 3, 300 - percent * 3, 0);
		this.fontBold12.centreString(16777215, x / 2, y / 2 + 5 - offsetY, message);

		this.imageTitle4.draw(202, super.graphics, 171);

		if (this.redrawFrame) {
			this.redrawFrame = false;

			if (!this.flameActive) {
				this.imageTitle0.draw(0, super.graphics, 0);
				this.imageTitle1.draw(637, super.graphics, 0);
			}

			this.imageTitle2.draw(128, super.graphics, 0);
			this.imageTitle3.draw(202, super.graphics, 371);
			this.imageTitle5.draw(0, super.graphics, 265);
			this.imageTitle6.draw(562, super.graphics, 265);
			this.imageTitle7.draw(128, super.graphics, 171);
			this.imageTitle8.draw(562, super.graphics, 171);
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public void drawError() {
		Graphics g = this.getBaseComponent().getGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, 765, 503);

		this.setFramerate(1);

		if (this.errorLoading) {
			this.flameActive = false;

			g.setFont(new Font("Helvetica", 1, 16));
			g.setColor(Color.yellow);

			int y = 35;
			g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, y);

			y = y + 50;
			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, y);

			y = y + 50;
			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, y);

			y = y + 30;
			g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, y);

			y = y + 30;
			g.drawString("3: Try using a different game-world", 30, y);

			y = y + 30;
			g.drawString("4: Try rebooting your computer", 30, y);

			y = y + 30;
			g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, y);
		} else if (this.errorHost) {
			this.flameActive = false;

			g.setFont(new Font("Helvetica", 1, 20));
			g.setColor(Color.white);
			g.drawString("Error - unable to load game!", 50, 50);
			g.drawString("To play RuneScape make sure you play from", 50, 100);
			g.drawString("http://www.runescape.com", 50, 150);
		} else if (this.errorStarted) {
			this.flameActive = false;

			g.setColor(Color.yellow);

			int y = 35;
			g.drawString("Error a copy of RuneScape already appears to be loaded", 30, y);

			y = y + 50;
			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, y);

			y = y + 50;
			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, y);

			y = y + 30;
			g.drawString("2: Try rebooting your computer, and reloading", 30, y);

			y = y + 30;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIILjava/lang/String;I)Lyb;")
	public Jagfile getJagFile(String displayName, int arg2, int crc, String name, int progress) {
		byte[] data = null;
		int retry = 5;

		try {
			if (this.fileStreams[0] != null) {
				data = this.fileStreams[0].read(arg2);
			}
		} catch (Exception ignore) {
		}

		if (data != null) {
			this.crc32.reset();
			this.crc32.update(data);

			int checksum = (int) this.crc32.getValue();
			if (checksum != crc) {
				data = null;
			}
		}

		if (data != null) {
			return new Jagfile(data);
		}

		int loops = 0;
		while (data == null) {
			String errorMessage = "Unknown error";

			this.drawProgress("Requesting " + displayName, progress);

			try {
				int lastDownloaded = 0;

				DataInputStream stream = this.openUrl(name + crc);
				byte[] header = new byte[6];
				stream.readFully(header, 0, 6);

				Packet buf = new Packet(header);
				buf.pos = 3;
				int packedSize = buf.g3() + 6;
				int pos = 6;

				data = new byte[packedSize];
				for (int i = 0; i < 6; i++) {
					data[i] = header[i];
				}

				while (pos < packedSize) {
					int chunkSize = packedSize - pos;
					if (chunkSize > 1000) {
						chunkSize = 1000;
					}

					int n = stream.read(data, pos, chunkSize);
					if (n < 0) {
						(new StringBuffer("Length error: ")).append(pos).append("/").append(packedSize).toString();
						throw new IOException("EOF");
					}

					pos += n;

					int downloaded = pos * 100 / packedSize;
					if (downloaded != lastDownloaded) {
						this.drawProgress("Loading " + displayName + " - " + downloaded + "%", progress);
					}

					lastDownloaded = downloaded;
				}

				stream.close();

				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].write(data, arg2, data.length);
					}
				} catch (Exception ex) {
					this.fileStreams[0] = null;
				}

				if (data != null) {
					this.crc32.reset();
					this.crc32.update(data);

					int checksum = (int) this.crc32.getValue();
					if (checksum != crc) {
						data = null;
						loops++;
						errorMessage = "Checksum error: " + checksum;
					}
				}
			} catch (IOException ex) {
				if (errorMessage.equals("Unknown error")) {
					errorMessage = "Connection error";
				}

				data = null;
			} catch (NullPointerException ex) {
				errorMessage = "Null error";
				data = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				errorMessage = "Bounds error";
				data = null;

				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception ex) {
				errorMessage = "Unexpected error";
				data = null;

				if (!signlink.reporterror) {
					return null;
				}
			}

			if (data == null) {
				for (int i = retry; i > 0; i--) {
					if (loops >= 3) {
						this.drawProgress("Game updated - please reload page", progress);
						i = 10;
					} else {
						this.drawProgress(errorMessage + " - Retrying in " + i, progress);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception ignore) {
					}
				}

				retry *= 2;
				if (retry > 60) {
					retry = 60;
				}
			}
		}

		return new Jagfile(data);
	}

	@ObfuscatedName("client.r(I)V")
	public void updateOnDemand() {
		while (true) {
			OnDemandRequest req = this.onDemand.cycle();
			if (req == null) {
				return;
			}

			if (req.archive == 0) {
				Model.unpack(req.file, req.data);

				if ((this.onDemand.getModelFlags(req.file) & 0x62) != 0) {
					this.redrawSidebar = true;

					if (this.chatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
			} else if (req.archive == 1 && req.data != null) {
				AnimFrame.unpack(req.data);
			} else if (req.archive == 2 && req.file == this.midiSong && req.data != null) {
				this.saveMidi(this.midiFading, req.data);
			} else if (req.archive == 3 && this.sceneState == 1) {
				for (int i = 0; i < this.sceneMapLandData.length; i++) {
					if (this.sceneMapLandFile[i] == req.file) {
						this.sceneMapLandData[i] = req.data;

						if (req.data == null) {
							this.sceneMapLandFile[i] = -1;
						}

						break;
					}

					if (this.sceneMapLocFile[i] == req.file) {
						this.sceneMapLocData[i] = req.data;

						if (req.data == null) {
							this.sceneMapLocFile[i] = -1;
						}

						break;
					}
				}
			} else if (req.archive == 93 && this.onDemand.hasMapLocFile(req.file)) {
				World.prefetchLocations(new Packet(req.data), this.onDemand);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public void updateTitle() {
		if (this.titleScreenState == 0) {
			int x = super.canvasWidth / 2 - 80;
			int y = super.canvasHeight / 2 + 20;

			y = y + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.titleScreenState = 3;
				this.titleLoginField = 0;
			}

			x = super.canvasWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Enter your username & password.";
				this.titleScreenState = 2;
				this.titleLoginField = 0;
			}
		} else if (this.titleScreenState == 2) {
			int y = super.canvasHeight / 2 - 40;
			y = y + 30;

			y = y + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= y - 15 && super.mouseClickY < y) {
				this.titleLoginField = 0;
			}

			y = y + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= y - 15 && super.mouseClickY < y) {
				this.titleLoginField = 1;
			}

			y += 15;

			int x = super.canvasWidth / 2 - 80;
			y = super.canvasHeight / 2 + 50;

			y = y + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.login(this.username, this.password, false);
				if (this.ingame) {
					return;
				}
			}

			x = super.canvasWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.titleScreenState = 0;
				this.username = "";
				this.password = "";
			}

			while (true) {
				int key = this.pollKey();
				if (key == -1) {
					return;
				}

				boolean valid = false;
				for (int i = 0; i < CHARSET.length(); i++) {
					if (key == CHARSET.charAt(i)) {
						valid = true;
						break;
					}
				}

				if (this.titleLoginField == 0) {
					if (key == 8 && this.username.length() > 0) {
						this.username = this.username.substring(0, this.username.length() - 1);
					}

					if (key == 9 || key == 10 || key == 13) {
						this.titleLoginField = 1;
					}

					if (valid) {
						this.username = this.username + (char) key;
					}

					if (this.username.length() > 12) {
						this.username = this.username.substring(0, 12);
					}
				} else if (this.titleLoginField == 1) {
					if (key == 8 && this.password.length() > 0) {
						this.password = this.password.substring(0, this.password.length() - 1);
					}

					if (key == 9 || key == 10 || key == 13) {
						this.titleLoginField = 0;
					}

					if (valid) {
						this.password = this.password + (char) key;
					}

					if (this.password.length() > 20) {
						this.password = this.password.substring(0, 20);
					}
				}
			}
		} else if (this.titleScreenState == 3) {
			int x = super.canvasWidth / 2;
			int y = super.canvasHeight / 2 + 50;

			y = y + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.titleScreenState = 0;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void login(String username, String password, boolean reconnect) {
		signlink.errorname = username;

		try {
			if (!reconnect) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Connecting to server...";
				this.drawTitle();
			}

			this.stream = new ClientStream(this, this.openSocket(portOffset + 43594));

			long username37 = JString.toBase37(username);
			int loginServer = (int) (username37 >> 16 & 0x1FL);
			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(loginServer);

			this.stream.write(0, 2, this.out.data);

			for (int i = 0; i < 8; i++) {
				this.stream.read();
			}

			int reply = this.stream.read();
			if (reply == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;

				this.serverSeed = this.in.g8();
				int[] seed = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed };

				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(seed[0]);
				this.out.p4(seed[1]);
				this.out.p4(seed[2]);
				this.out.p4(seed[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(username);
				this.out.pjstr(password);
				this.out.rsaenc(LOGIN_RSAE, LOGIN_RSAN);

				this.login.pos = 0;
				if (reconnect) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}

				this.login.p1(this.out.pos + 36 + 1 + 1);
				this.login.p1(245);
				this.login.p1(lowMem ? 1 : 0);

				for (int i = 0; i < 9; i++) {
					this.login.p4(this.jagChecksum[i]);
				}

				this.login.pdata(this.out.data, this.out.pos, 0);

				this.out.random = new Isaac(seed);
				for (int i = 0; i < 4; i++) {
					seed[i] += 50;
				}
				this.randomIn = new Isaac(seed);

				this.stream.write(0, this.login.pos, this.login.data);

				reply = this.stream.read();
			}

			if (reply == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception ignore) {
				}

				this.login(username, password, reconnect);
			} else if (reply == 2 || reply == 18 || reply == 19) {
				this.staffmodlevel = 0;

				if (reply == 18) {
					this.staffmodlevel = 1;
				} else if (reply == 19) {
					this.staffmodlevel = 2;
				}

				InputTracking.setDisabled();
				this.field1528 = 0L;
				this.field1215 = 0;
				this.mouseTracking.length = 0;
				super.hasFocus = true;
				this.field1537 = true;
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.idleNetCycles = 0;
				this.systemUpdateTimer = 0;
				this.idleTimeout = 0;
				this.hintType = 0;
				this.field1504 = 0;
				this.menuSize = 0;
				this.menuVisible = false;
				super.idleCycles = 0;

				for (int i = 0; i < 100; i++) {
					this.messageText[i] = null;
				}

				this.objSelected = 0;
				this.spellSelected = 0;
				this.sceneState = 0;
				this.waveCount = 0;

				this.macroCameraX = (int) (Math.random() * 100.0D) - 50;
				this.macroCameraZ = (int) (Math.random() * 110.0D) - 55;
				this.macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
				this.macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
				this.macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
				this.orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;

				this.minimapLevel = -1;
				this.flagSceneTileX = 0;
				this.flagSceneTileZ = 0;

				this.playerCount = 0;
				this.npcCount = 0;

				for (int i = 0; i < this.MAX_PLAYER_COUNT; i++) {
					this.players[i] = null;
					this.playerAppearanceBuffer[i] = null;
				}

				for (int i = 0; i < 8192; i++) {
					this.npcs[i] = null;
				}

				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new ClientPlayer();

				this.projectiles.clear();
				this.spotanims.clear();

				for (int level = 0; level < 4; level++) {
					for (int x = 0; x < 104; x++) {
						for (int z = 0; z < 104; z++) {
							this.objStacks[level][x][z] = null;
						}
					}
				}

				this.locChanges = new LinkList();
				this.friendCount = 0;
				this.stickyChatInterfaceId = -1;
				this.chatInterfaceId = -1;
				this.viewportInterfaceId = -1;
				this.sidebarInterfaceId = -1;
				this.viewportOverlayInterfaceId = -1;
				this.pressedContinueOption = false;
				this.selectedTab = 3;
				this.chatbackInputOpen = false;
				this.menuVisible = false;
				this.showSocialInput = false;
				this.modalMessage = null;
				this.inMultizone = 0;
				this.flashingTab = -1;

				this.designGender = true;
				this.validateCharacterDesign();
				for (int i = 0; i < 5; i++) {
					this.designColours[i] = 0;
				}

				oplogic1 = 0;
				oplogic2 = 0;
				oplogic3 = 0;
				oplogic4 = 0;
				oplogic5 = 0;
				oplogic6 = 0;
				oplogic7 = 0;
				oplogic8 = 0;
				oplogic9 = 0;
				oplogic10 = 0;

				this.prepareGame();
			} else if (reply == 3) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Invalid username or password.";
			} else if (reply == 4) {
				this.loginMessage0 = "Your account has been disabled.";
				this.loginMessage1 = "Please check your message-centre for details.";
			} else if (reply == 5) {
				this.loginMessage0 = "Your account is already logged in.";
				this.loginMessage1 = "Try again in 60 secs...";
			} else if (reply == 6) {
				this.loginMessage0 = "RuneScape has been updated!";
				this.loginMessage1 = "Please reload this page.";
			} else if (reply == 7) {
				this.loginMessage0 = "This world is full.";
				this.loginMessage1 = "Please use a different world.";
			} else if (reply == 8) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Login server offline.";
			} else if (reply == 9) {
				this.loginMessage0 = "Login limit exceeded.";
				this.loginMessage1 = "Too many connections from your address.";
			} else if (reply == 10) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Bad session id.";
			} else if (reply == 11) {
				this.loginMessage1 = "Login server rejected session.";
				this.loginMessage1 = "Please try again.";
			} else if (reply == 12) {
				this.loginMessage0 = "You need a members account to login to this world.";
				this.loginMessage1 = "Please subscribe, or use a different world.";
			} else if (reply == 13) {
				this.loginMessage0 = "Could not complete login.";
				this.loginMessage1 = "Please try using a different world.";
			} else if (reply == 14) {
				this.loginMessage0 = "The server is being updated.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (reply == 15) {
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.idleNetCycles = 0;
				this.systemUpdateTimer = 0;
				this.menuSize = 0;
				this.menuVisible = false;
				this.sceneLoadStartTime = System.currentTimeMillis();
			} else if (reply == 16) {
				this.loginMessage0 = "Login attempts exceeded.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (reply == 17) {
				this.loginMessage0 = "You are standing in a members-only area.";
				this.loginMessage1 = "To play on this world move to a free area first";
			} else if (reply == 20) {
				this.loginMessage0 = "Invalid loginserver requested";
				this.loginMessage1 = "Please try using a different world.";
			} else {
				this.loginMessage0 = "Unexpected server response";
				this.loginMessage1 = "Please try using a different world.";
			}
		} catch (IOException ex) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.X(I)V")
	public void logout() {
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception ignore) {
		}

		this.stream = null;
		this.ingame = false;
		this.titleScreenState = 0;
		this.username = "";
		this.password = "";

		InputTracking.setDisabled();
		this.clearCache();
		this.scene.reset();

		for (int level = 0; level < 4; level++) {
			this.levelCollisionMap[level].reset();
		}

		System.gc();

		this.stopMidi();
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
	}

	@ObfuscatedName("client.c(B)V")
	public void clearCache() {
		LocType.modelCacheStatic.clear();
		LocType.modelCacheDynamic.clear();
		NpcType.modelCache.clear();
		ObjType.modelCache.clear();
		ObjType.iconCache.clear();
		ClientPlayer.modelCache.clear();
		SpotAnimType.modelCache.clear();
	}

	@ObfuscatedName("client.m(I)V")
	public void prepareGame() {
		if (this.areaChatback != null) {
			return;
		}

		this.unloadTitle();

		super.drawArea = null;
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;

		this.areaChatback = new PixMap(96, this.getBaseComponent(), 479);

		this.areaMapback = new PixMap(156, this.getBaseComponent(), 172);
		Pix2D.cls();
		this.imageMapback.plotSprite(0, 0);

		this.areaSidebar = new PixMap(261, this.getBaseComponent(), 190);

		this.areaViewport = new PixMap(334, this.getBaseComponent(), 512);
		Pix2D.cls();

		this.areaBackbase1 = new PixMap(50, this.getBaseComponent(), 496);
		this.areaBackbase2 = new PixMap(37, this.getBaseComponent(), 269);
		this.areaBackhmid1 = new PixMap(45, this.getBaseComponent(), 249);

		this.redrawFrame = true;
	}

	@ObfuscatedName("client.U(I)V")
	public void updateGame() {
		if (this.systemUpdateTimer > 1) {
			this.systemUpdateTimer--;
		}

		if (this.idleTimeout > 0) {
			this.idleTimeout--;
		}

		if (this.field1504 > 0) {
			this.field1504 -= 2;
		}

		for (int i = 0; i < 5 && this.readPacket(); i++) {
		}

		if (this.ingame) {
			this.updateSceneState();
			this.updateLocChanges();
			this.updateAudio();

			Packet input = InputTracking.flush();
			if (input != null) {
				// EVENT_TRACKING
				this.out.pIsaac(19);
				this.out.p2(input.pos);
				this.out.pdata(input.data, input.pos, 0);
				input.release();
			}

			this.idleNetCycles++;
			if (this.idleNetCycles > 750) {
				this.tryReconnect();
			}

			this.updatePlayers();
			this.updateNpcs();
			this.updateEntityChats();

			this.sceneDelta++;

			if (this.crossMode != 0) {
				this.crossCycle += 20;

				if (this.crossCycle >= 400) {
					this.crossMode = 0;
				}
			}

			if (this.selectedArea != 0) {
				this.selectedCycle++;

				if (this.selectedCycle >= 15) {
					if (this.selectedArea == 2) {
						this.redrawSidebar = true;
					} else if (this.selectedArea == 3) {
						this.redrawChatback = true;
					}

					this.selectedArea = 0;
				}
			}

			if (this.objDragArea != 0) {
				this.objDragCycles++;

				if (super.mouseX > this.objGrabX + 5 || super.mouseX < this.objGrabX - 5 || super.mouseY > this.objGrabY + 5 || super.mouseY < this.objGrabY - 5) {
					this.objGrabThreshold = true;
				}

				if (super.mouseButton == 0) {
					if (this.objDragArea == 2) {
						this.redrawSidebar = true;
					} else if (this.objDragArea == 3) {
						this.redrawChatback = true;
					}

					this.objDragArea = 0;

					if (this.objGrabThreshold && this.objDragCycles >= 5) {
						this.hoveredSlotInterfaceId = -1;
						this.handleInput();

						if (this.hoveredSlotInterfaceId == this.objDragInterfaceId && this.hoveredSlot != this.objDragSlot) {
							Component com = Component.types[this.objDragInterfaceId];

							byte mode = 0;
							if (this.bankArrangeMode == 1 && com.clientCode == 206) {
								mode = 1;
							}
							if (com.invSlotObjId[this.hoveredSlot] <= 0) {
								mode = 0;
							}

							if (com.swappable) {
								int var6 = this.objDragSlot;
								int var7 = this.hoveredSlot;
								com.invSlotObjId[var7] = com.invSlotObjId[var6];
								com.invSlotObjCount[var7] = com.invSlotObjCount[var6];
								com.invSlotObjId[var6] = -1;
								com.invSlotObjCount[var6] = 0;
							} else if (mode == 1) {
								int src = this.objDragSlot;
								int dst = this.hoveredSlot;

								while (src != dst) {
									if (src > dst) {
										com.swapObj(src, src - 1);
										src--;
									} else if (src < dst) {
										com.swapObj(src, src + 1);
										src++;
									}
								}
							} else {
								com.swapObj(this.objDragSlot, this.hoveredSlot);
							}

							// INV_BUTTOND
							this.out.pIsaac(7);
							this.out.p2(this.objDragInterfaceId);
							this.out.p2(this.objDragSlot);
							this.out.p2(this.hoveredSlot);
							this.out.p1(mode);
						}
					} else if ((this.oneMouseButton == 1 || this.isAddFriendOption(this.menuSize - 1)) && this.menuSize > 2) {
						this.showContextMenu();
					} else if (this.menuSize > 0) {
						this.useMenuOption(this.menuSize - 1);
					}

					this.selectedCycle = 10;
					super.mouseClickButton = 0;
				}
			}

			cyclelogic3++;
			if (cyclelogic3 > 127) {
				cyclelogic3 = 0;

				// ANTICHEAT_CYCLELOGIC3
				this.out.pIsaac(181);
				this.out.p3(4991788);
			}

			if (World3D.clickTileX != -1) {
				int x = World3D.clickTileX;
				int z = World3D.clickTileZ;
				boolean success = this.tryMove(0, 0, 0, 0, localPlayer.routeTileZ[0], 0, 0, x, true, z, localPlayer.routeTileX[0]);
				World3D.clickTileX = -1;

				if (success) {
					this.crossX = super.mouseClickX;
					this.crossY = super.mouseClickY;
					this.crossMode = 1;
					this.crossCycle = 0;
				}
			}

			if (super.mouseClickButton == 1 && this.modalMessage != null) {
				this.modalMessage = null;
				this.redrawChatback = true;
				super.mouseClickButton = 0;
			}

			this.handleMouseInput();
			this.handleMinimapInput();
			this.handleTabInput();
			this.handleChatModeInput();

			if (super.mouseButton == 1 || super.mouseClickButton == 1) {
				this.dragCycles++;
			}

			if (this.sceneState == 2) {
				this.updateOrbitCamera();
			}

			if (this.sceneState == 2 && this.cutscene) {
				this.applyCutscene();
			}

			for (int i = 0; i < 5; i++) {
				this.cameraModifierCycle[i]++;
			}

			this.handleInputKey();

			super.idleCycles++;
			if (super.idleCycles > 4500) {
				this.idleTimeout = 250;
				super.idleCycles -= 500;
				// IDLE_TIMER
				this.out.pIsaac(102);
			}

			this.macroCameraCycle++;
			if (this.macroCameraCycle > 500) {
				this.macroCameraCycle = 0;

				int rand = (int) (Math.random() * 8.0D);
				if ((rand & 0x1) == 1) {
					this.macroCameraX += this.macroCameraXModifier;
				}
				if ((rand & 0x2) == 2) {
					this.macroCameraZ += this.macroCameraZModifier;
				}
				if ((rand & 0x4) == 4) {
					this.macroCameraAngle += this.macroCameraAngleModifier;
				}
			}

			if (this.macroCameraX < -50) {
				this.macroCameraXModifier = 2;
			} else if (this.macroCameraX > 50) {
				this.macroCameraXModifier = -2;
			}

			if (this.macroCameraZ < -55) {
				this.macroCameraZModifier = 2;
			} else if (this.macroCameraZ > 55) {
				this.macroCameraZModifier = -2;
			}

			if (this.macroCameraAngle < -40) {
				this.macroCameraAngleModifier = 1;
			} else if (this.macroCameraAngle > 40) {
				this.macroCameraAngleModifier = -1;
			}

			this.macroMinimapCycle++;
			if (this.macroMinimapCycle > 500) {
				this.macroMinimapCycle = 0;

				int rand = (int) (Math.random() * 8.0D);
				if ((rand & 0x1) == 1) {
					this.macroMinimapAngle += this.macroMinimapAngleModifier;
				}
				if ((rand & 0x2) == 2) {
					this.macroMinimapZoom += this.macroMinimapZoomModifier;
				}
			}

			if (this.macroMinimapAngle < -60) {
				this.macroMinimapAngleModifier = 2;
			} else if (this.macroMinimapAngle > 60) {
				this.macroMinimapAngleModifier = -2;
			}

			if (this.macroMinimapZoom < -20) {
				this.macroMinimapZoomModifier = 1;
			} else if (this.macroMinimapZoom > 10) {
				this.macroMinimapZoomModifier = -1;
			}

			cyclelogic4++;
			if (cyclelogic4 > 110) {
				cyclelogic4 = 0;

				// ANTICHEAT_CYCLELOGIC4
				this.out.pIsaac(94);
				this.out.p4(0);
			}

			this.noTimeoutCycle++;
			if (this.noTimeoutCycle > 50) {
				// NO_TIMEOUT
				this.out.pIsaac(206);
			}

			try {
				if (this.stream != null && this.out.pos > 0) {
					this.stream.write(0, this.out.pos, this.out.data);
					this.out.pos = 0;
					this.noTimeoutCycle = 0;
				}
			} catch (IOException ex) {
				this.tryReconnect();
			} catch (Exception ex) {
				this.logout();
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public void tryReconnect() {
		if (this.idleTimeout > 0) {
			this.logout();
			return;
		}

		this.areaViewport.bind();
		this.fontPlain12.centreString(0, 257, 144, "Connection lost");
		this.fontPlain12.centreString(16777215, 256, 143, "Connection lost");
		this.fontPlain12.centreString(0, 257, 159, "Please wait - attempting to reestablish");
		this.fontPlain12.centreString(16777215, 256, 158, "Please wait - attempting to reestablish");
		this.areaViewport.draw(4, super.graphics, 4);

		this.flagSceneTileX = 0;

		ClientStream stream = this.stream;

		this.ingame = false;
		this.login(this.username, this.password, true);
		if (!this.ingame) {
			this.logout();
		}

		try {
			stream.close();
		} catch (Exception ignore) {
		}
	}

	@ObfuscatedName("client.s(I)V")
	public void updateSceneState() {
		if (lowMem && this.sceneState == 2 && World.levelBuilt != this.currentLevel) {
			this.areaViewport.bind();
			this.fontPlain12.centreString(0, 257, 151, "Loading - please wait.");
			this.fontPlain12.centreString(16777215, 256, 150, "Loading - please wait.");
			this.areaViewport.draw(4, super.graphics, 4);
			this.sceneState = 1;
			this.sceneLoadStartTime = System.currentTimeMillis();
		}

		if (this.sceneState == 1) {
			int status = this.checkScene();
			if (status != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + status + "," + lowMem + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
				this.sceneLoadStartTime = System.currentTimeMillis();
			}
		}

		if (this.sceneState == 2 && this.currentLevel != this.minimapLevel) {
			this.minimapLevel = this.currentLevel;
			this.createMinimap(this.currentLevel);
		}
	}

	@ObfuscatedName("client.t(I)I")
	public int checkScene() {
		for (int i = 0; i < this.sceneMapLandData.length; i++) {
			if (this.sceneMapLandData[i] == null && this.sceneMapLandFile[i] != -1) {
				return -1;
			}

			if (this.sceneMapLocData[i] == null && this.sceneMapLocFile[i] != -1) {
				return -2;
			}
		}

		boolean ready = true;
		for (int i = 0; i < this.sceneMapLandData.length; i++) {
			byte[] data = this.sceneMapLocData[i];
			if (data != null) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				ready &= World.checkLocations(data, z, x);
			}
		}

		if (!ready) {
			return -3;
		} else if (this.awaitingSync) {
			return -4;
		}

		this.sceneState = 2;
		World.levelBuilt = this.currentLevel;
		this.buildScene();
		return 0;
	}

	@ObfuscatedName("client.g(Z)V")
	public void buildScene() {
		try {
			this.minimapLevel = -1;
			this.spotanims.clear();
			this.projectiles.clear();
			Pix3D.clearTexels();
			this.clearCache();
			this.scene.reset();

			for (int i = 0; i < 4; i++) {
				this.levelCollisionMap[i].reset();
			}

			System.gc();

			World world = new World(this.levelTileFlags, this.levelHeightmap, 104, 104);
			int maps = this.sceneMapLandData.length;
			World.lowMem = World3D.lowMem;

			for (int i = 0; i < maps; i++) {
				int x = this.sceneMapIndex[i] >> 8;
				int z = this.sceneMapIndex[i] & 0xFF;

				if (x == 33 && z >= 71 && z <= 73) {
					World.lowMem = false;
				}
			}

			if (World.lowMem) {
				this.scene.setMinLevel(this.currentLevel);
			} else {
				this.scene.setMinLevel(0);
			}

			// NO_TIMEOUT
			this.out.pIsaac(206);

			for (int i = 0; i < maps; i++) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] data = this.sceneMapLandData[i];

				if (data != null) {
					world.loadGround(data, (this.sceneCenterZoneX - 6) * 8, z, x, (this.sceneCenterZoneZ - 6) * 8);
				}
			}

			for (int i = 0; i < maps; i++) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] data = this.sceneMapLandData[i];

				if (data == null && this.sceneCenterZoneZ < 800) {
					world.spreadHeight(64, z, x, 64);
				}
			}

			// NO_TIMEOUT
			this.out.pIsaac(206);

			for (int i = 0; i < maps; i++) {
				byte[] data = this.sceneMapLocData[i];

				if (data != null) {
					int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
					int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
					world.loadLocations(this.levelCollisionMap, z, data, x, this.scene);
				}
			}

			// NO_TIMEOUT
			this.out.pIsaac(206);

			world.build(this.levelCollisionMap, this.scene);
			this.areaViewport.bind();

			// NO_TIMEOUT
			this.out.pIsaac(206);

			for (int x = 0; x < 104; x++) {
				for (int z = 0; z < 104; z++) {
					this.sortObjStacks(x, z);
				}
			}

			this.clearLocChanges();
		} catch (Exception ignore) {
		}

		LocType.modelCacheStatic.clear();

		if (lowMem && signlink.cache_dat != null) {
			int modelCount = this.onDemand.getFileCount(0);

			for (int i = 0; i < modelCount; i++) {
				int flags = this.onDemand.getModelFlags(i);

				if ((flags & 0x79) == 0) {
					Model.unload(i);
				}
			}
		}

		System.gc();

		Pix3D.initPool(20);

		this.onDemand.clearPrefetches();

		int left = (this.sceneCenterZoneX - 6) / 8 - 1;
		int right = (this.sceneCenterZoneX + 6) / 8 + 1;
		int bottom = (this.sceneCenterZoneZ - 6) / 8 - 1;
		int top = (this.sceneCenterZoneZ + 6) / 8 + 1;

		if (this.withinTutorialIsland) {
			left = 49;
			right = 50;
			bottom = 49;
			top = 50;
		}

		for (int x = left; x <= right; x++) {
			for (int z = bottom; z <= top; z++) {
				if (x == left || x == right || z == bottom || z == top) {
					int land = this.onDemand.getMapFile(0, x, z);
					if (land != -1) {
						this.onDemand.prefetch(land, 3);
					}

					int loc = this.onDemand.getMapFile(1, x, z);
					if (loc != -1) {
						this.onDemand.prefetch(loc, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public void clearLocChanges() {
		LocChange loc = (LocChange) this.locChanges.head();
		while (loc != null) {
			if (loc.endTime == -1) {
				loc.startTime = 0;
				this.storeLoc(loc);
			} else {
				loc.unlink();
			}

			loc = (LocChange) this.locChanges.next();
		}
	}

	@ObfuscatedName("client.g(II)V")
	public void createMinimap(int level) {
		int[] pixels = this.imageMinimap.pixels;

		int length = pixels.length;
		for (int i = 0; i < length; i++) {
			pixels[i] = 0;
		}

		for (int z = 1; z < 103; z++) {
			int offset = (103 - z) * 512 * 4 + 24628;

			for (int x = 1; x < 103; x++) {
				if ((this.levelTileFlags[level][x][z] & 0x18) == 0) {
					this.scene.drawMinimapTile(pixels, offset, 512, level, x, z);
				}

				if (level < 3 && (this.levelTileFlags[level + 1][x][z] & 0x8) != 0) {
					this.scene.drawMinimapTile(pixels, offset, 512, level + 1, x, z);
				}

				offset += 4;
			}
		}

		int inactiveRgb = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int activeRgb = (int) (Math.random() * 20.0D) + 238 - 10 << 16;

		this.imageMinimap.bind();

		for (int z = 1; z < 103; z++) {
			for (int x = 1; x < 103; x++) {
				if ((this.levelTileFlags[level][x][z] & 0x18) == 0) {
					this.drawMinimapLoc(x, z, activeRgb, level, inactiveRgb);
				}

				if (level < 3 && (this.levelTileFlags[level + 1][x][z] & 0x8) != 0) {
					this.drawMinimapLoc(x, z, activeRgb, level + 1, inactiveRgb);
				}
			}
		}

		this.areaViewport.bind();

		this.activeMapFunctionCount = 0;

		for (int x = 0; x < 104; x++) {
			for (int z = 0; z < 104; z++) {
				int typecode = this.scene.getGroundDecorTypecode(this.currentLevel, x, z);
				if (typecode == 0) {
					continue;
				}

				int locId = typecode >> 14 & 0x7FFF;
				int func = LocType.get(locId).mapfunction;
				if (func < 0) {
					continue;
				}

				int stx = x;
				int stz = z;

				if (func != 22 && func != 29 && func != 34 && func != 36 && func != 46 && func != 47 && func != 48) {
					byte maxX = 104;
					byte maxZ = 104;
					int[][] flags = this.levelCollisionMap[this.currentLevel].flags;

					for (int i = 0; i < 10; i++) {
						int rand = (int) (Math.random() * 4.0D);

						if (rand == 0 && stx > 0 && stx > x - 3 && (flags[stx - 1][stz] & 0x280108) == 0) {
							stx--;
						}

						if (rand == 1 && stx < maxX - 1 && stx < x + 3 && (flags[stx + 1][stz] & 0x280180) == 0) {
							stx++;
						}

						if (rand == 2 && stz > 0 && stz > z - 3 && (flags[stx][stz - 1] & 0x280102) == 0) {
							stz--;
						}

						if (rand == 3 && stz < maxZ - 1 && stz < z + 3 && (flags[stx][stz + 1] & 0x280120) == 0) {
							stz++;
						}
					}
				}

				this.activeMapFunctions[this.activeMapFunctionCount] = this.imageMapfunction[func];
				this.activeMapFunctionX[this.activeMapFunctionCount] = stx;
				this.activeMapFunctionZ[this.activeMapFunctionCount] = stz;
				this.activeMapFunctionCount++;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void updateLocChanges() {
		if (this.sceneState != 2) {
			return;
		}

		for (LocChange loc = (LocChange) this.locChanges.head(); loc != null; loc = (LocChange) this.locChanges.next()) {
			if (loc.endTime > 0) {
				loc.endTime--;
			}

			if (loc.endTime != 0) {
				if (loc.startTime > 0) {
					loc.startTime--;
				}

				if (loc.startTime == 0 && loc.x >= 1 && loc.z >= 1 && loc.x <= 102 && loc.z <= 102 && (loc.newType < 0 || World.changeLocAvailable(loc.newShape, loc.newType))) {
					this.addLoc(loc.newShape, loc.z, loc.newAngle, loc.layer, loc.newType, loc.x, loc.level);
					loc.startTime = -1;

					if (loc.newType == loc.oldType && loc.oldType == -1) {
						loc.unlink();
					} else if (loc.newType == loc.oldType && loc.newAngle == loc.oldAngle && loc.newShape == loc.oldShape) {
						loc.unlink();
					}
				}
			} else if (loc.oldType < 0 || World.changeLocAvailable(loc.oldShape, loc.oldType)) {
				this.addLoc(loc.oldShape, loc.z, loc.oldAngle, loc.layer, loc.oldType, loc.x, loc.level);
				loc.unlink();
			}
		}

		cyclelogic5++;
		if (cyclelogic5 > 85) {
			cyclelogic5 = 0;

			// ANTICHEAT_CYCLELOGIC5
			this.out.pIsaac(63);
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void updateAudio() {
		for (int wave = 0; wave < this.waveCount; wave++) {
			if (this.waveDelay[wave] <= 0) {
				boolean replay = false;

				try {
					if (this.waveIds[wave] != this.lastWaveId || this.waveLoops[wave] != this.lastWaveLoops) {
						Packet buf = Wave.generate(this.waveIds[wave], this.waveLoops[wave]);

						if (System.currentTimeMillis() + (long) (buf.pos / 22) > this.lastWaveStartTime + (long) (this.lastWaveLength / 22)) {
							this.lastWaveLength = buf.pos;
							this.lastWaveStartTime = System.currentTimeMillis();

							if (this.saveWave(buf.pos, buf.data)) {
								this.lastWaveId = this.waveIds[wave];
								this.lastWaveLoops = this.waveLoops[wave];
							} else {
								replay = true;
							}
						}
					} else if (!this.replayWave()) {
						replay = true;
					}
				} catch (Exception ignore) {
				}

				if (replay && this.waveDelay[wave] != -5) {
					this.waveDelay[wave] = -5;
				} else {
					this.waveCount--;
					for (int i = wave; i < this.waveCount; i++) {
						this.waveIds[i] = this.waveIds[i + 1];
						this.waveLoops[i] = this.waveLoops[i + 1];
						this.waveDelay[i] = this.waveDelay[i + 1];
					}
					wave--;
				}
			} else {
				this.waveDelay[wave]--;
			}
		}

		if (this.nextMusicDelay > 0) {
			this.nextMusicDelay -= 20;

			if (this.nextMusicDelay < 0) {
				this.nextMusicDelay = 0;
			}

			if (this.nextMusicDelay == 0 && this.midiActive && !lowMem) {
				this.midiSong = this.nextMidiSong;
				this.midiFading = false;
				this.onDemand.request(2, this.midiSong);
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void handleInput() {
		if (this.objDragArea != 0) {
			return;
		}

		this.menuOption[0] = "Cancel";
		this.menuAction[0] = 1252;
		this.menuSize = 1;

		this.handlePrivateChatInput();

		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (this.viewportInterfaceId == -1) {
				this.handleViewportOptions();
			} else {
				this.handleInterfaceInput(4, super.mouseY, 0, Component.types[this.viewportInterfaceId], super.mouseX, 4);
			}
		}

		if (this.lastHoveredInterfaceId != this.viewportHoveredInterfaceId) {
			this.viewportHoveredInterfaceId = this.lastHoveredInterfaceId;
		}

		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.sidebarInterfaceId != -1) {
				this.handleInterfaceInput(553, super.mouseY, 0, Component.types[this.sidebarInterfaceId], super.mouseX, 205);
			} else if (this.tabInterfaceId[this.selectedTab] != -1) {
				this.handleInterfaceInput(553, super.mouseY, 0, Component.types[this.tabInterfaceId[this.selectedTab]], super.mouseX, 205);
			}
		}

		if (this.lastHoveredInterfaceId != this.sidebarHoveredInterfaceId) {
			this.redrawSidebar = true;
			this.sidebarHoveredInterfaceId = this.lastHoveredInterfaceId;
		}

		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (this.chatInterfaceId != -1) {
				this.handleInterfaceInput(17, super.mouseY, 0, Component.types[this.chatInterfaceId], super.mouseX, 357);
			} else if (super.mouseY < 434 && super.mouseX < 426) {
				this.handleChatMouseInput(super.mouseX - 17, super.mouseY - 357);
			}
		}

		if (this.chatInterfaceId != -1 && this.lastHoveredInterfaceId != this.chatHoveredInterfaceId) {
			this.redrawChatback = true;
			this.chatHoveredInterfaceId = this.lastHoveredInterfaceId;
		}

		boolean done = false;
		while (!done) {
			done = true;

			for (int i = 0; i < this.menuSize - 1; i++) {
				if (this.menuAction[i] < 1000 && this.menuAction[i + 1] > 1000) {
					String tmp0 = this.menuOption[i];
					this.menuOption[i] = this.menuOption[i + 1];
					this.menuOption[i + 1] = tmp0;

					int tmp1 = this.menuAction[i];
					this.menuAction[i] = this.menuAction[i + 1];
					this.menuAction[i + 1] = tmp1;

					int tmp2 = this.menuParamB[i];
					this.menuParamB[i] = this.menuParamB[i + 1];
					this.menuParamB[i + 1] = tmp2;

					int tmp3 = this.menuParamC[i];
					this.menuParamC[i] = this.menuParamC[i + 1];
					this.menuParamC[i + 1] = tmp3;

					int tmp4 = this.menuParamA[i];
					this.menuParamA[i] = this.menuParamA[i + 1];
					this.menuParamA[i + 1] = tmp4;

					done = false;
				}
			}
		}
	}

	@ObfuscatedName("client.j(B)V")
	public void handlePrivateChatInput() {
		if (this.splitPrivateChat == 0) {
			return;
		}

		int line = 0;
		if (this.systemUpdateTimer != 0) {
			line = 1;
		}

		for (int i = 0; i < 100; i++) {
			if (this.messageText[i] != null) {
				int type = this.messageType[i];
				String sender = this.messageSender[i];

				boolean mod = false;
				if (sender != null && sender.startsWith("@cr1@")) {
					sender = sender.substring(5);
					mod = true;
				} else if (sender != null && sender.startsWith("@cr2@")) {
					sender = sender.substring(5);
					mod = true;
				}

				if ((type == 3 || type == 7) && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
					int y = 329 - line * 13;

					if (super.mouseX > 4 && super.mouseY - 4 > y - 10 && super.mouseY - 4 <= y + 3) {
						int width = this.fontPlain12.stringWid("From:  " + sender + this.messageText[i]) + 25;
						if (width > 450) {
							width = 450;
						}

						if (super.mouseX < width + 4) {
							if (this.staffmodlevel >= 1) {
								this.menuOption[this.menuSize] = "Report abuse @whi@" + sender;
								this.menuAction[this.menuSize] = 2034;
								this.menuSize++;
							}

							this.menuOption[this.menuSize] = "Add ignore @whi@" + sender;
							this.menuAction[this.menuSize] = 2436;
							this.menuSize++;

							this.menuOption[this.menuSize] = "Add friend @whi@" + sender;
							this.menuAction[this.menuSize] = 2406;
							this.menuSize++;
						}
					}

					line++;
					if (line >= 5) {
						return;
					}
				} else if ((type == 5 || type == 6) && this.chatPrivateMode < 2) {
					line++;
					if (line >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIZ)V")
	public void handleChatMouseInput(int mouseX, int mouseY) {
		int line = 0;

		for (int i = 0; i < 100; i++) {
			if (this.messageText[i] != null) {
				int type = this.messageType[i];
				int y = 70 - line * 14 + this.chatScrollOffset + 4;
				if (y < -20) {
					break;
				}

				String sender = this.messageSender[i];
				boolean mod = false;
				if (sender != null && sender.startsWith("@cr1@")) {
					sender = sender.substring(5);
					mod = true;
				} else if (sender != null && sender.startsWith("@cr2@")) {
					sender = sender.substring(5);
					mod = true;
				}

				if (type == 0) {
					line++;
				} else if ((type == 1 || type == 2) && (type == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(sender))) {
					if (mouseY > y - 14 && mouseY <= y && !sender.equals(localPlayer.name)) {
						if (this.staffmodlevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + sender;
							this.menuAction[this.menuSize] = 34;
							this.menuSize++;
						}

						this.menuOption[this.menuSize] = "Add ignore @whi@" + sender;
						this.menuAction[this.menuSize] = 436;
						this.menuSize++;

						this.menuOption[this.menuSize] = "Add friend @whi@" + sender;
						this.menuAction[this.menuSize] = 406;
						this.menuSize++;
					}

					line++;
				} else if ((type == 3 || type == 7) && this.splitPrivateChat == 0 && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
					if (mouseY > y - 14 && mouseY <= y) {
						if (this.staffmodlevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + sender;
							this.menuAction[this.menuSize] = 34;
							this.menuSize++;
						}

						this.menuOption[this.menuSize] = "Add ignore @whi@" + sender;
						this.menuAction[this.menuSize] = 436;
						this.menuSize++;

						this.menuOption[this.menuSize] = "Add friend @whi@" + sender;
						this.menuAction[this.menuSize] = 406;
						this.menuSize++;
					}

					line++;
				} else if (type == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
					if (mouseY > y - 14 && mouseY <= y) {
						this.menuOption[this.menuSize] = "Accept trade @whi@" + sender;
						this.menuAction[this.menuSize] = 903;
						this.menuSize++;
					}

					line++;
				} else if ((type == 5 || type == 6) && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
					line++;
				} else if (type == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
					if (mouseY > y - 14 && mouseY <= y) {
						this.menuOption[this.menuSize] = "Accept duel @whi@" + sender;
						this.menuAction[this.menuSize] = 363;
						this.menuSize++;
					}

					line++;
				}
			}
		}
	}

	@ObfuscatedName("client.P(I)V")
	public void handleViewportOptions() {
		if (this.objSelected == 0 && this.spellSelected == 0) {
			this.menuOption[this.menuSize] = "Walk here";
			this.menuAction[this.menuSize] = 660;
			this.menuParamB[this.menuSize] = super.mouseX;
			this.menuParamC[this.menuSize] = super.mouseY;
			this.menuSize++;
		}

		int lastTypecode = -1;
		for (int picked = 0; picked < Model.pickedCount; picked++) {
			int typecode = Model.pickedBitsets[picked];
			int x = typecode & 0x7F;
			int z = typecode >> 7 & 0x7F;
			int entityType = typecode >> 29 & 0x3;
			int typeId = typecode >> 14 & 0x7FFF;

			if (typecode == lastTypecode) {
				continue;
			}

			lastTypecode = typecode;

			if (entityType == 2 && this.scene.getInfo(this.currentLevel, x, z, typecode) >= 0) {
				LocType loc = LocType.get(typeId);

				if (this.objSelected == 1) {
					this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @cya@" + loc.name;
					this.menuAction[this.menuSize] = 450;
					this.menuParamA[this.menuSize] = typecode;
					this.menuParamB[this.menuSize] = x;
					this.menuParamC[this.menuSize] = z;
					this.menuSize++;
				} else if (this.spellSelected != 1) {
					if (loc.op != null) {
						for (int i = 4; i >= 0; i--) {
							if (loc.op[i] != null) {
								this.menuOption[this.menuSize] = loc.op[i] + " @cya@" + loc.name;
								if (i == 0) {
									this.menuAction[this.menuSize] = 285;
								} else if (i == 1) {
									this.menuAction[this.menuSize] = 504;
								} else if (i == 2) {
									this.menuAction[this.menuSize] = 364;
								} else if (i == 3) {
									this.menuAction[this.menuSize] = 581;
								} else if (i == 4) {
									this.menuAction[this.menuSize] = 1501;
								}

								this.menuParamA[this.menuSize] = typecode;
								this.menuParamB[this.menuSize] = x;
								this.menuParamC[this.menuSize] = z;
								this.menuSize++;
							}
						}
					}

					this.menuOption[this.menuSize] = "Examine @cya@" + loc.name;
					this.menuAction[this.menuSize] = 1175;
					this.menuParamA[this.menuSize] = typecode;
					this.menuParamB[this.menuSize] = x;
					this.menuParamC[this.menuSize] = z;
					this.menuSize++;
				} else if ((this.activeSpellFlags & 0x4) == 4) {
					this.menuOption[this.menuSize] = this.spellCaption + " @cya@" + loc.name;
					this.menuAction[this.menuSize] = 55;
					this.menuParamA[this.menuSize] = typecode;
					this.menuParamB[this.menuSize] = x;
					this.menuParamC[this.menuSize] = z;
					this.menuSize++;
				}
			}

			if (entityType == 1) {
				ClientNpc npc = this.npcs[typeId];

				if (npc.type.size == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
					for (int i = 0; i < this.npcCount; i++) {
						ClientNpc other = this.npcs[this.npcIds[i]];
						if (other != null && other != npc && other.type.size == 1 && other.x == npc.x && other.z == npc.z) {
							this.addNpcOptions(x, this.npcIds[i], other.type, z);
						}
					}
				}

				this.addNpcOptions(x, typeId, npc.type, z);
			} else if (entityType == 0) {
				ClientPlayer player = this.players[typeId];

				if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
					for (int i = 0; i < this.npcCount; i++) {
						ClientNpc other = this.npcs[this.npcIds[i]];
						if (other != null && other.type.size == 1 && other.x == player.x && other.z == player.z) {
							this.addNpcOptions(x, this.npcIds[i], other.type, z);
						}
					}

					for (int i = 0; i < this.playerCount; i++) {
						ClientPlayer other = this.players[this.playerIds[i]];
						if (other != null && other != player && other.x == player.x && other.z == player.z) {
							this.addPlayerOptions(other, x, this.playerIds[i], z);
						}
					}
				}

				this.addPlayerOptions(player, x, typeId, z);
			} else if (entityType == 3) {
				LinkList objs = this.objStacks[this.currentLevel][x][z];
				if (objs == null) {
					continue;
				}

				for (ClientObj obj = (ClientObj) objs.tail(); obj != null; obj = (ClientObj) objs.prev()) {
					ObjType type = ObjType.get(obj.index);

					if (this.objSelected == 1) {
						this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + type.name;
						this.menuAction[this.menuSize] = 217;
						this.menuParamA[this.menuSize] = obj.index;
						this.menuParamB[this.menuSize] = x;
						this.menuParamC[this.menuSize] = z;
						this.menuSize++;
					} else if (this.spellSelected != 1) {
						for (int i = 4; i >= 0; i--) {
							if (type.op != null && type.op[i] != null) {
								this.menuOption[this.menuSize] = type.op[i] + " @lre@" + type.name;

								if (i == 0) {
									this.menuAction[this.menuSize] = 224;
								} else if (i == 1) {
									this.menuAction[this.menuSize] = 993;
								} else if (i == 2) {
									this.menuAction[this.menuSize] = 99;
								} else if (i == 3) {
									this.menuAction[this.menuSize] = 746;
								} else if (i == 4) {
									this.menuAction[this.menuSize] = 877;
								}

								this.menuParamA[this.menuSize] = obj.index;
								this.menuParamB[this.menuSize] = x;
								this.menuParamC[this.menuSize] = z;
								this.menuSize++;
							} else if (i == 2) {
								this.menuOption[this.menuSize] = "Take @lre@" + type.name;
								this.menuAction[this.menuSize] = 99;
								this.menuParamA[this.menuSize] = obj.index;
								this.menuParamB[this.menuSize] = x;
								this.menuParamC[this.menuSize] = z;
								this.menuSize++;
							}
						}

						this.menuOption[this.menuSize] = "Examine @lre@" + type.name;
						this.menuAction[this.menuSize] = 1102;
						this.menuParamA[this.menuSize] = obj.index;
						this.menuParamB[this.menuSize] = x;
						this.menuParamC[this.menuSize] = z;
						this.menuSize++;
					} else if ((this.activeSpellFlags & 0x1) == 1) {
						this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + type.name;
						this.menuAction[this.menuSize] = 965;
						this.menuParamA[this.menuSize] = obj.index;
						this.menuParamB[this.menuSize] = x;
						this.menuParamC[this.menuSize] = z;
						this.menuSize++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public void handleMouseInput() {
		if (this.objDragArea != 0) {
			return;
		}

		int button = super.mouseClickButton;
		if (this.spellSelected == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			button = 0;
		}

		if (!this.menuVisible) {
			if (button == 1 && this.menuSize > 0) {
				int action = this.menuAction[this.menuSize - 1];

				if (
					action == 602 || action == 596 || action == 22 || action == 892 || action == 415 || action == 405 ||
					action == 38 || action == 422 || action == 478 || action == 347 || action == 188
				) {
					int slot = this.menuParamB[this.menuSize - 1];
					int comId = this.menuParamC[this.menuSize - 1];
					Component com = Component.types[comId];

					if (com.draggable || com.swappable) {
						this.objGrabThreshold = false;
						this.objDragCycles = 0;
						this.objDragInterfaceId = comId;
						this.objDragSlot = slot;
						this.objDragArea = 2;
						this.objGrabX = super.mouseClickX;
						this.objGrabY = super.mouseClickY;

						if (Component.types[comId].layer == this.viewportInterfaceId) {
							this.objDragArea = 1;
						} else if (Component.types[comId].layer == this.chatInterfaceId) {
							this.objDragArea = 3;
						}

						return;
					}
				}
			}

			if (button == 1 && (this.oneMouseButton == 1 || this.isAddFriendOption(this.menuSize - 1)) && this.menuSize > 2) {
				button = 2;
			}

			if (button == 1 && this.menuSize > 0) {
				this.useMenuOption(this.menuSize - 1);
			} else if (button == 2 && this.menuSize > 0) {
				this.showContextMenu();
			}
		} else {
			if (button != 1) {
				int x = super.mouseX;
				int y = super.mouseY;

				if (this.menuArea == 0) {
					x -= 4;
					y -= 4;
				} else if (this.menuArea == 1) {
					x -= 553;
					y -= 205;
				} else if (this.menuArea == 2) {
					x -= 17;
					y -= 357;
				}

				if (x < this.menuX - 10 || x > this.menuX + this.menuWidth + 10 || y < this.menuY - 10 || y > this.menuY + this.menuHeight + 10) {
					this.menuVisible = false;

					if (this.menuArea == 1) {
						this.redrawSidebar = true;
					} else if (this.menuArea == 2) {
						this.redrawChatback = true;
					}
				}
			} else {
				int menuX = this.menuX;
				int menuY = this.menuY;
				int menuWidth = this.menuWidth;

				int x = super.mouseClickX;
				int y = super.mouseClickY;

				if (this.menuArea == 0) {
					x -= 4;
					y -= 4;
				} else if (this.menuArea == 1) {
					x -= 553;
					y -= 205;
				} else if (this.menuArea == 2) {
					x -= 17;
					y -= 357;
				}

				int option = -1;
				for (int i = 0; i < this.menuSize; i++) {
					int optionY = menuY + 31 + (this.menuSize - 1 - i) * 15;
					if (x > menuX && x < menuX + menuWidth && y > optionY - 13 && y < optionY + 3) {
						option = i;
					}
				}

				if (option != -1) {
					this.useMenuOption(option);
				}

				this.menuVisible = false;

				if (this.menuArea == 1) {
					this.redrawSidebar = true;
				} else if (this.menuArea == 2) {
					this.redrawChatback = true;
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public void handleMinimapInput() {
		if (super.mouseClickButton != 1) {
			return;
		}

		int x = super.mouseClickX - 25 - 550;
		int y = super.mouseClickY - 5 - 4;

		if (x < 0 || y < 0 || x >= 146 || y >= 151) {
			return;
		}

		x -= 73;
		y -= 75;

		int yaw = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int sinYaw = Pix3D.sinTable[yaw];
		int cosYaw = Pix3D.cosTable[yaw];

		sinYaw = sinYaw * (this.macroMinimapZoom + 256) >> 8;
		cosYaw = cosYaw * (this.macroMinimapZoom + 256) >> 8;

		int relX = y * sinYaw + x * cosYaw >> 11;
		int relY = y * cosYaw - x * sinYaw >> 11;

		int tileX = localPlayer.x + relX >> 7;
		int tileZ = localPlayer.z - relY >> 7;

		boolean success = this.tryMove(0, 0, 1, 0, localPlayer.routeTileZ[0], 0, 0, tileX, true, tileZ, localPlayer.routeTileX[0]);
		if (success) {
			this.out.p1(x);
			this.out.p1(y);
			this.out.p2(this.orbitCameraYaw);
			this.out.p1(57);
			this.out.p1(this.macroMinimapAngle);
			this.out.p1(this.macroMinimapZoom);
			this.out.p1(89);
			this.out.p2(localPlayer.x);
			this.out.p2(localPlayer.z);
			this.out.p1(this.tryMoveNearest);
			this.out.p1(63);
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public void handleTabInput() {
		if (super.mouseClickButton != 1) {
			return;
		}

		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[0] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 0;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[1] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 1;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[2] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 2;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.tabInterfaceId[3] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 3;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[4] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 4;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[5] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 5;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[6] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 6;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[7] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 7;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[8] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 8;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[9] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 9;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.tabInterfaceId[10] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 10;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[11] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 11;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[12] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 12;
			this.redrawSideicons = true;
		} else if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[13] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 13;
			this.redrawSideicons = true;
		}

		cyclelogic1++;
		if (cyclelogic1 > 150) {
			cyclelogic1 = 0;

			// ANTICHEAT_CYCLELOGIC1
			this.out.pIsaac(136);
			this.out.p1(43);
		}
	}

	@ObfuscatedName("client.g(B)V")
	public void handleChatModeInput() {
		if (super.mouseClickButton != 1) {
			return;
		}

		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPublicMode = (this.chatPublicMode + 1) % 4;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			// CHAT_SETMODE
			this.out.pIsaac(8);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPrivateMode = (this.chatPrivateMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			// CHAT_SETMODE
			this.out.pIsaac(8);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatTradeMode = (this.chatTradeMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			// CHAT_SETMODE
			this.out.pIsaac(8);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.closeInterfaces();

			this.reportAbuseInput = "";
			this.reportAbuseMuteOption = false;

			for (int i = 0; i < Component.types.length; i++) {
				if (Component.types[i] != null && Component.types[i].clientCode == 600) {
					this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.types[i].layer;
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public void closeInterfaces() {
		// CLOSE_MODAL
		this.out.pIsaac(245);

		if (this.sidebarInterfaceId != -1) {
			this.sidebarInterfaceId = -1;
			this.redrawSidebar = true;
			this.pressedContinueOption = false;
			this.redrawSideicons = true;
		}

		if (this.chatInterfaceId != -1) {
			this.chatInterfaceId = -1;
			this.redrawChatback = true;
			this.pressedContinueOption = false;
		}

		this.viewportInterfaceId = -1;
	}

	@ObfuscatedName("client.T(I)V")
	public void updateEntityChats() {
		for (int i = -1; i < this.playerCount; i++) {
			int index;
			if (i == -1) {
				index = this.LOCAL_PLAYER_INDEX;
			} else {
				index = this.playerIds[i];
			}

			ClientPlayer player = this.players[index];
			if (player != null && player.chatTimer > 0) {
				player.chatTimer--;

				if (player.chatTimer == 0) {
					player.chatMessage = null;
				}
			}
		}

		for (int i = 0; i < this.npcCount; i++) {
			int index = this.npcIds[i];

			ClientNpc npc = this.npcs[index];
			if (npc != null && npc.chatTimer > 0) {
				npc.chatTimer--;

				if (npc.chatTimer == 0) {
					npc.chatMessage = null;
				}
			}
		}
	}

	@ObfuscatedName("client.R(I)V")
	public void updateOrbitCamera() {
		try {
			int orbitX = localPlayer.x + this.macroCameraX;
			int orbitZ = localPlayer.z + this.macroCameraZ;

			if (this.orbitCameraX - orbitX < -500 || this.orbitCameraX - orbitX > 500 || this.orbitCameraZ - orbitZ < -500 || this.orbitCameraZ - orbitZ > 500) {
				this.orbitCameraX = orbitX;
				this.orbitCameraZ = orbitZ;
			}

			if (this.orbitCameraX != orbitX) {
				this.orbitCameraX += (orbitX - this.orbitCameraX) / 16;
			}

			if (this.orbitCameraZ != orbitZ) {
				this.orbitCameraZ += (orbitZ - this.orbitCameraZ) / 16;
			}

			if (super.actionKey[1] == 1) {
				this.orbitCameraYawVelocity += (-24 - this.orbitCameraYawVelocity) / 2;
			} else if (super.actionKey[2] == 1) {
				this.orbitCameraYawVelocity += (24 - this.orbitCameraYawVelocity) / 2;
			} else {
				this.orbitCameraYawVelocity /= 2;
			}

			if (super.actionKey[3] == 1) {
				this.orbitCameraPitchVelocity += (12 - this.orbitCameraPitchVelocity) / 2;
			} else if (super.actionKey[4] == 1) {
				this.orbitCameraPitchVelocity += (-12 - this.orbitCameraPitchVelocity) / 2;
			} else {
				this.orbitCameraPitchVelocity /= 2;
			}

			this.orbitCameraYaw = this.orbitCameraYaw + this.orbitCameraYawVelocity / 2 & 0x7FF;

			this.orbitCameraPitch += this.orbitCameraPitchVelocity / 2;
			if (this.orbitCameraPitch < 128) {
				this.orbitCameraPitch = 128;
			} else if (this.orbitCameraPitch > 383) {
				this.orbitCameraPitch = 383;
			}

			int orbitTileX = this.orbitCameraX >> 7;
			int orbitTileZ = this.orbitCameraZ >> 7;
			int orbitY = this.getHeightmapY(this.orbitCameraZ, this.currentLevel, this.orbitCameraX);
			int maxY = 0;

			if (orbitTileX > 3 && orbitTileZ > 3 && orbitTileX < 100 && orbitTileZ < 100) {
				for (int x = orbitTileX - 4; x <= orbitTileX + 4; x++) {
					for (int z = orbitTileZ - 4; z <= orbitTileZ + 4; z++) {
						int level = this.currentLevel;
						if (level < 3 && (this.levelTileFlags[1][x][z] & 0x2) == 2) {
							level++;
						}

						int y = orbitY - this.levelHeightmap[level][x][z];
						if (y > maxY) {
							maxY = y;
						}
					}
				}
			}

			int clamp = maxY * 192;
			if (clamp > 98048) {
				clamp = 98048;
			} else if (clamp < 32768) {
				clamp = 32768;
			}

			if (clamp > this.cameraPitchClamp) {
				this.cameraPitchClamp += (clamp - this.cameraPitchClamp) / 24;
			} else if (clamp < this.cameraPitchClamp) {
				this.cameraPitchClamp += (clamp - this.cameraPitchClamp) / 80;
			}
		} catch (Exception ex) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void applyCutscene() {
		int x = this.cutsceneSrcLocalTileX * 128 + 64;
		int z = this.cutsceneSrcLocalTileZ * 128 + 64;
		int y = this.getHeightmapY(z, this.currentLevel, x) - this.cutsceneSrcHeight;

		if (this.cameraX < x) {
			this.cameraX += this.cutsceneMoveSpeed + (x - this.cameraX) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraX > x) {
				this.cameraX = x;
			}
		} else if (this.cameraX > x) {
			this.cameraX -= this.cutsceneMoveSpeed + (this.cameraX - x) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraX < x) {
				this.cameraX = x;
			}
		}

		if (this.cameraY < y) {
			this.cameraY += this.cutsceneMoveSpeed + (y - this.cameraY) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraY > y) {
				this.cameraY = y;
			}
		} else if (this.cameraY > y) {
			this.cameraY -= this.cutsceneMoveSpeed + (this.cameraY - y) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraY < y) {
				this.cameraY = y;
			}
		}

		if (this.cameraZ < z) {
			this.cameraZ += this.cutsceneMoveSpeed + (z - this.cameraZ) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraZ > z) {
				this.cameraZ = z;
			}
		} else if (this.cameraZ > z) {
			this.cameraZ -= this.cutsceneMoveSpeed + (this.cameraZ - z) * this.cutsceneMoveAcceleration / 1000;
			if (this.cameraZ < z) {
				this.cameraZ = z;
			}
		}

		x = this.cutsceneDstLocalTileX * 128 + 64;
		z = this.cutsceneDstLocalTileZ * 128 + 64;
		y = this.getHeightmapY(z, this.currentLevel, x) - this.cutsceneDstHeight;

		int dx = x - this.cameraX;
		int dy = y - this.cameraY;
		int dz = z - this.cameraZ;

		int distance = (int) Math.sqrt(dx * dx + dz * dz);
		int pitch = (int) (Math.atan2(dy, distance) * 325.949D) & 0x7FF;
		int yaw = (int) (Math.atan2(dx, dz) * -325.949D) & 0x7FF;

		if (pitch < 128) {
			pitch = 128;
		} else if (pitch > 383) {
			pitch = 383;
		}

		if (this.cameraPitch < pitch) {
			this.cameraPitch += this.cutsceneRotateSpeed + (pitch - this.cameraPitch) * this.cutsceneRotateAcceleration / 1000;
			if (this.cameraPitch > pitch) {
				this.cameraPitch = pitch;
			}
		} else if (this.cameraPitch > pitch) {
			this.cameraPitch -= this.cutsceneRotateSpeed + (this.cameraPitch - pitch) * this.cutsceneRotateAcceleration / 1000;
			if (this.cameraPitch < pitch) {
				this.cameraPitch = pitch;
			}
		}

		int deltaYaw = yaw - this.cameraYaw;
		if (deltaYaw > 1024) {
			deltaYaw -= 2048;
		} else if (deltaYaw < -1024) {
			deltaYaw += 2048;
		}

		if (deltaYaw > 0) {
			this.cameraYaw += this.cutsceneRotateSpeed + deltaYaw * this.cutsceneRotateAcceleration / 1000;
			this.cameraYaw &= 0x7FF;
		} else if (deltaYaw < 0) {
			this.cameraYaw -= this.cutsceneRotateSpeed + -deltaYaw * this.cutsceneRotateAcceleration / 1000;
			this.cameraYaw &= 0x7FF;
		}

		int tmp = yaw - this.cameraYaw;
		if (tmp > 1024) {
			tmp -= 2048;
		} else if (tmp < -1024) {
			tmp += 2048;
		}

		if (tmp < 0 && deltaYaw > 0 || tmp > 0 && deltaYaw < 0) {
			this.cameraYaw = yaw;
		}
	}

	@ObfuscatedName("client.Z(I)V")
	public void handleInputKey() {
		while (true) {
			int key;
			do {
				while (true) {
					key = this.pollKey();
					if (key == -1) {
						return;
					}

					if (this.viewportInterfaceId != -1 && this.viewportInterfaceId == this.reportAbuseInterfaceId) {
						if (key == 8 && this.reportAbuseInput.length() > 0) {
							this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
						}

						break;
					}

					if (this.showSocialInput) {
						if (key >= 32 && key <= 122 && this.socialInput.length() < 80) {
							this.socialInput = this.socialInput + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.socialInput.length() > 0) {
							this.socialInput = this.socialInput.substring(0, this.socialInput.length() - 1);
							this.redrawChatback = true;
						}

						if (key == 13 || key == 10) {
							this.showSocialInput = false;
							this.redrawChatback = true;

							if (this.socialInputType == 1) {
								long username = JString.toBase37(this.socialInput);
								this.addFriend(username);
							} else if (this.socialInputType == 2 && this.friendCount > 0) {
								long username = JString.toBase37(this.socialInput);
								this.removeFriend(username);
							} else if (this.socialInputType == 3 && this.socialInput.length() > 0) {
								// MESSAGE_PRIVATE
								this.out.pIsaac(99);
								this.out.p1(0);
								int start = this.out.pos;

								this.out.p8(this.socialName37);
								WordPack.pack(this.out, this.socialInput);
								this.out.psize1(this.out.pos - start);

								this.socialInput = JString.toSentenceCase(this.socialInput);
								this.socialInput = WordFilter.filter(this.socialInput);
								this.addMessage(JString.formatDisplayName(JString.fromBase37(this.socialName37)), 6, this.socialInput);

								if (this.chatPrivateMode == 2) {
									this.chatPrivateMode = 1;
									this.redrawPrivacySettings = true;

									// CHAT_SETMODE
									this.out.pIsaac(8);
									this.out.p1(this.chatPublicMode);
									this.out.p1(this.chatPrivateMode);
									this.out.p1(this.chatTradeMode);
								}
							} else if (this.socialInputType == 4 && this.ignoreCount < 100) {
								long username = JString.toBase37(this.socialInput);
								this.addIgnore(username);
							} else if (this.socialInputType == 5 && this.ignoreCount > 0) {
								long username = JString.toBase37(this.socialInput);
								this.removeIgnore(username);
							}
						}
					} else if (this.chatbackInputOpen) {
						if (key >= 48 && key <= 57 && this.chatbackInput.length() < 10) {
							this.chatbackInput = this.chatbackInput + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}

						if (key == 13 || key == 10) {
							if (this.chatbackInput.length() > 0) {
								int value = 0;
								try {
									value = Integer.parseInt(this.chatbackInput);
								} catch (Exception ignore) {
								}

								// RESUME_P_COUNTDIALOG
								this.out.pIsaac(241);
								this.out.p4(value);
							}

							this.chatbackInputOpen = false;
							this.redrawChatback = true;
						}
					} else if (this.chatInterfaceId == -1) {
						if (key >= 32 && (key <= 122 || (this.chatTyped.startsWith("::") && key <= 126)) && this.chatTyped.length() < 80) {
							this.chatTyped = this.chatTyped + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.chatTyped.length() > 0) {
							this.chatTyped = this.chatTyped.substring(0, this.chatTyped.length() - 1);
							this.redrawChatback = true;
						}

						if ((key == 13 || key == 10) && this.chatTyped.length() > 0) {
							if (this.staffmodlevel == 2) {
								if (this.chatTyped.equals("::clientdrop")) {
									this.tryReconnect();
								} else if (this.chatTyped.equals("::lag")) {
									this.lag();
								} else if (this.chatTyped.equals("::prefetchmusic")) {
									for (int i = 0; i < this.onDemand.getFileCount(2); i++) {
										this.onDemand.prefetchPriority(i, 2, (byte) 1);
									}
								}
							}

							if (this.chatTyped.startsWith("::")) {
								// CLIENT_CHEAT
								this.out.pIsaac(11);
								this.out.p1(this.chatTyped.length() - 1);
								this.out.pjstr(this.chatTyped.substring(2));
							} else {
								byte colour = 0;
								if (this.chatTyped.startsWith("yellow:")) {
									colour = 0;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (this.chatTyped.startsWith("red:")) {
									colour = 1;
									this.chatTyped = this.chatTyped.substring(4);
								} else if (this.chatTyped.startsWith("green:")) {
									colour = 2;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (this.chatTyped.startsWith("cyan:")) {
									colour = 3;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (this.chatTyped.startsWith("purple:")) {
									colour = 4;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (this.chatTyped.startsWith("white:")) {
									colour = 5;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (this.chatTyped.startsWith("flash1:")) {
									colour = 6;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (this.chatTyped.startsWith("flash2:")) {
									colour = 7;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (this.chatTyped.startsWith("flash3:")) {
									colour = 8;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (this.chatTyped.startsWith("glow1:")) {
									colour = 9;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (this.chatTyped.startsWith("glow2:")) {
									colour = 10;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (this.chatTyped.startsWith("glow3:")) {
									colour = 11;
									this.chatTyped = this.chatTyped.substring(6);
								}

								byte effect = 0;
								if (this.chatTyped.startsWith("wave:")) {
									effect = 1;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (this.chatTyped.startsWith("scroll:")) {
									effect = 2;
									this.chatTyped = this.chatTyped.substring(7);
								}

								// MESSAGE_PUBLIC
								this.out.pIsaac(78);
								this.out.p1(0);
								int start = this.out.pos;

								this.out.p1(colour);
								this.out.p1(effect);
								WordPack.pack(this.out, this.chatTyped);
								this.out.psize1(this.out.pos - start);

								this.chatTyped = JString.toSentenceCase(this.chatTyped);
								this.chatTyped = WordFilter.filter(this.chatTyped);

								localPlayer.chatMessage = this.chatTyped;
								localPlayer.chatColour = colour;
								localPlayer.chatEffect = effect;
								localPlayer.chatTimer = 150;

								if (this.staffmodlevel == 2) {
									this.addMessage("@cr2@" + localPlayer.name, 2, localPlayer.chatMessage);
								} else if (this.staffmodlevel == 1) {
									this.addMessage("@cr1@" + localPlayer.name, 2, localPlayer.chatMessage);
								} else {
									this.addMessage(localPlayer.name, 2, localPlayer.chatMessage);
								}

								if (this.chatPublicMode == 2) {
									this.chatPublicMode = 3;
									this.redrawPrivacySettings = true;

									// CHAT_SETMODE
									this.out.pIsaac(8);
									this.out.p1(this.chatPublicMode);
									this.out.p1(this.chatPrivateMode);
									this.out.p1(this.chatTradeMode);
								}
							}
							this.chatTyped = "";
							this.redrawChatback = true;
						}
					}
				}
			} while ((key < 97 || key > 122) && (key < 65 || key > 90) && (key < 48 || key > 57) && key != 32);

			if (this.reportAbuseInput.length() < 12) {
				this.reportAbuseInput = this.reportAbuseInput + (char) key;
			}
		}
	}

	@ObfuscatedName("client.a(B)V")
	public void lag() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.flameCycle);
		if (this.onDemand != null) {
			System.out.println("Od-cycle:" + this.onDemand.cycle);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + this.ptype);
		System.out.println("psize:" + this.psize);
		if (this.stream != null) {
			this.stream.debug();
		}
		super.debug = true;
	}

	@ObfuscatedName("client.N(I)V")
	public void updatePlayers() {
		for (int i = -1; i < this.playerCount; i++) {
			int index;
			if (i == -1) {
				index = this.LOCAL_PLAYER_INDEX;
			} else {
				index = this.playerIds[i];
			}

			ClientPlayer player = this.players[index];
			if (player != null) {
				this.updateEntity(1, player);
			}
		}

		cyclelogic6++;
		if (cyclelogic6 > 1406) {
			cyclelogic6 = 0;

			// ANTICHEAT_CYCLELOGIC6
			this.out.pIsaac(112);
			this.out.p1(0);
			int var5 = this.out.pos;
			this.out.p1(162);
			this.out.p1(22);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(84);
			}
			this.out.p2(31824);
			this.out.p2(13490);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(123);
			}
			if ((int) (Math.random() * 2.0D) == 0) {
				this.out.p1(134);
			}
			this.out.p1(100);
			this.out.p1(94);
			this.out.p2(35521);
			this.out.psize1(this.out.pos - var5);
		}
	}

	@ObfuscatedName("client.j(I)V")
	public void updateNpcs() {
		for (int i = 0; i < this.npcCount; i++) {
			int index = this.npcIds[i];
			ClientNpc npc = this.npcs[index];

			if (npc != null) {
				this.updateEntity(npc.type.size, npc);
			}
		}
	}

	@ObfuscatedName("client.a(BILz;)V")
	public void updateEntity(int size, ClientEntity e) {
		if (e.x < 128 || e.z < 128 || e.x >= 13184 || e.z >= 13184) {
			e.primarySeqId = -1;
			e.spotanimId = -1;
			e.forceMoveEndCycle = 0;
			e.forceMoveStartCycle = 0;
			e.x = e.routeTileX[0] * 128 + e.size * 64;
			e.z = e.routeTileZ[0] * 128 + e.size * 64;
			e.clearRoute();
		}

		if (e == localPlayer && (e.x < 1536 || e.z < 1536 || e.x >= 11776 || e.z >= 11776)) {
			e.primarySeqId = -1;
			e.spotanimId = -1;
			e.forceMoveEndCycle = 0;
			e.forceMoveStartCycle = 0;
			e.x = e.routeTileX[0] * 128 + e.size * 64;
			e.z = e.routeTileZ[0] * 128 + e.size * 64;
			e.clearRoute();
		}

		if (e.forceMoveEndCycle > loopCycle) {
			this.updateForceMovement(e);
		} else if (e.forceMoveStartCycle >= loopCycle) {
			this.startForceMovement(e);
		} else {
			this.updateMovement(e);
		}

		this.updateFacingDirection(e);
		this.updateSequences(e);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public void updateForceMovement(ClientEntity e) {
		int delta = e.forceMoveEndCycle - loopCycle;
		int dstX = e.forceMoveStartSceneTileX * 128 + e.size * 64;
		int dstZ = e.forceMoveStartSceneTileZ * 128 + e.size * 64;

		e.x += (dstX - e.x) / delta;
		e.z += (dstZ - e.z) / delta;

		e.seqDelayMove = 0;

		if (e.forceMoveFaceDirection == 0) {
			e.dstYaw = 1024;
		} else if (e.forceMoveFaceDirection == 1) {
			e.dstYaw = 1536;
		} else if (e.forceMoveFaceDirection == 2) {
			e.dstYaw = 0;
		} else if (e.forceMoveFaceDirection == 3) {
			e.dstYaw = 512;
		}
	}

	@ObfuscatedName("client.a(BLz;)V")
	public void startForceMovement(ClientEntity e) {
		if (e.forceMoveStartCycle == loopCycle || e.primarySeqId == -1 || e.primarySeqDelay != 0 || e.primarySeqCycle + 1 > SeqType.types[e.primarySeqId].getFrameLength(e.primarySeqFrame)) {
			int duration = e.forceMoveStartCycle - e.forceMoveEndCycle;
			int delta = loopCycle - e.forceMoveEndCycle;
			int dx0 = e.forceMoveStartSceneTileX * 128 + e.size * 64;
			int dz0 = e.forceMoveStartSceneTileZ * 128 + e.size * 64;
			int dx1 = e.forceMoveEndSceneTileX * 128 + e.size * 64;
			int dz1 = e.forceMoveEndSceneTileZ * 128 + e.size * 64;
			e.x = (dx0 * (duration - delta) + dx1 * delta) / duration;
			e.z = (dz0 * (duration - delta) + dz1 * delta) / duration;
		}

		e.seqDelayMove = 0;

		if (e.forceMoveFaceDirection == 0) {
			e.dstYaw = 1024;
		} else if (e.forceMoveFaceDirection == 1) {
			e.dstYaw = 1536;
		} else if (e.forceMoveFaceDirection == 2) {
			e.dstYaw = 0;
		} else if (e.forceMoveFaceDirection == 3) {
			e.dstYaw = 512;
		}

		e.yaw = e.dstYaw;
	}

	@ObfuscatedName("client.b(ILz;)V")
	public void updateMovement(ClientEntity e) {
		e.secondarySeqId = e.readyanim;

		if (e.routeLength == 0) {
			e.seqDelayMove = 0;
			return;
		}

		if (e.primarySeqId != -1 && e.primarySeqDelay == 0) {
			SeqType seq = SeqType.types[e.primarySeqId];

			if (e.preanimRouteLength > 0 && seq.preanim_move == 0) {
				e.seqDelayMove++;
				return;
			}

			if (e.preanimRouteLength <= 0 && seq.postanim_move == 0) {
				e.seqDelayMove++;
				return;
			}
		}

		int x = e.x;
		int z = e.z;
		int dstX = e.routeTileX[e.routeLength - 1] * 128 + e.size * 64;
		int dstZ = e.routeTileZ[e.routeLength - 1] * 128 + e.size * 64;

		if (dstX - x > 256 || dstX - x < -256 || dstZ - z > 256 || dstZ - z < -256) {
			e.x = dstX;
			e.z = dstZ;
			return;
		}

		if (x < dstX) {
			if (z < dstZ) {
				e.dstYaw = 1280;
			} else if (z > dstZ) {
				e.dstYaw = 1792;
			} else {
				e.dstYaw = 1536;
			}
		} else if (x > dstX) {
			if (z < dstZ) {
				e.dstYaw = 768;
			} else if (z > dstZ) {
				e.dstYaw = 256;
			} else {
				e.dstYaw = 512;
			}
		} else if (z < dstZ) {
			e.dstYaw = 1024;
		} else {
			e.dstYaw = 0;
		}

		int deltaYaw = e.dstYaw - e.yaw & 0x7FF;
		if (deltaYaw > 1024) {
			deltaYaw -= 2048;
		}

		int seqId = e.walkanim_b;
		if (deltaYaw >= -256 && deltaYaw <= 256) {
			seqId = e.walkanim;
		} else if (deltaYaw >= 256 && deltaYaw < 768) {
			seqId = e.walkanim_r;
		} else if (deltaYaw >= -768 && deltaYaw <= -256) {
			seqId = e.walkanim_l;
		}

		if (seqId == -1) {
			seqId = e.walkanim;
		}

		e.secondarySeqId = seqId;

		int moveSpeed = 4;
		if (e.yaw != e.dstYaw && e.targetId == -1) {
			moveSpeed = 2;
		}
		if (e.routeLength > 2) {
			moveSpeed = 6;
		}
		if (e.routeLength > 3) {
			moveSpeed = 8;
		}
		if (e.seqDelayMove > 0 && e.routeLength > 1) {
			moveSpeed = 8;
			e.seqDelayMove--;
		}
		if (e.routeRun[e.routeLength - 1]) {
			moveSpeed <<= 0x1;
		}

		if (moveSpeed >= 8 && e.secondarySeqId == e.walkanim && e.runanim != -1) {
			e.secondarySeqId = e.runanim;
		}

		if (x < dstX) {
			e.x += moveSpeed;
			if (e.x > dstX) {
				e.x = dstX;
			}
		} else if (x > dstX) {
			e.x -= moveSpeed;
			if (e.x < dstX) {
				e.x = dstX;
			}
		}
		if (z < dstZ) {
			e.z += moveSpeed;
			if (e.z > dstZ) {
				e.z = dstZ;
			}
		} else if (z > dstZ) {
			e.z -= moveSpeed;
			if (e.z < dstZ) {
				e.z = dstZ;
			}
		}

		if (e.x == dstX && e.z == dstZ) {
			e.routeLength--;

			if (e.preanimRouteLength > 0) {
				e.preanimRouteLength--;
			}
		}
	}

	@ObfuscatedName("client.a(Lz;B)V")
	public void updateFacingDirection(ClientEntity e) {
		if (e.targetId != -1 && e.targetId < 32768) {
			ClientNpc npc = this.npcs[e.targetId];
			if (npc != null) {
				int dstX = e.x - npc.x;
				int dstZ = e.z - npc.z;

				if (dstX != 0 || dstZ != 0) {
					e.dstYaw = (int) (Math.atan2(dstX, dstZ) * 325.949D) & 0x7FF;
				}
			}
		}
		if (e.targetId >= 32768) {
			int index = e.targetId - 32768;
			if (index == this.localPid) {
				index = this.LOCAL_PLAYER_INDEX;
			}

			ClientPlayer player = this.players[index];
			if (player != null) {
				int dstX = e.x - player.x;
				int dstZ = e.z - player.z;

				if (dstX != 0 || dstZ != 0) {
					e.dstYaw = (int) (Math.atan2(dstX, dstZ) * 325.949D) & 0x7FF;
				}
			}
		}

		if ((e.targetTileX != 0 || e.targetTileZ != 0) && (e.routeLength == 0 || e.seqDelayMove > 0)) {
			int dstX = e.x - (e.targetTileX - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
			int dstZ = e.z - (e.targetTileZ - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;

			if (dstX != 0 || dstZ != 0) {
				e.dstYaw = (int) (Math.atan2(dstX, dstZ) * 325.949D) & 0x7FF;
			}

			e.targetTileX = 0;
			e.targetTileZ = 0;
		}

		int remainingYaw = e.dstYaw - e.yaw & 0x7FF;
		if (remainingYaw != 0) {
			if (remainingYaw < 32 || remainingYaw > 2016) {
				e.yaw = e.dstYaw;
			} else if (remainingYaw > 1024) {
				e.yaw -= 32;
			} else {
				e.yaw += 32;
			}
			e.yaw &= 0x7FF;

			if (e.secondarySeqId == e.readyanim && e.yaw != e.dstYaw) {
				if (e.turnanim != -1) {
					e.secondarySeqId = e.turnanim;
				} else {
					e.secondarySeqId = e.walkanim;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public void updateSequences(ClientEntity e) {
		e.needsForwardDrawPadding = false;

		if (e.secondarySeqId != -1) {
			SeqType seq = SeqType.types[e.secondarySeqId];
			e.secondarySeqCycle++;

			if (e.secondarySeqFrame < seq.frameCount && e.secondarySeqCycle > seq.getFrameLength(e.secondarySeqFrame)) {
				e.secondarySeqCycle = 0;
				e.secondarySeqFrame++;
			}

			if (e.secondarySeqFrame >= seq.frameCount) {
				e.secondarySeqCycle = 0;
				e.secondarySeqFrame = 0;
			}
		}

		if (e.spotanimId != -1 && loopCycle >= e.spotanimLastCycle) {
			if (e.spotanimFrame < 0) {
				e.spotanimFrame = 0;
			}

			SeqType seq = SpotAnimType.types[e.spotanimId].seq;
			e.spotanimCycle++;

			while (e.spotanimFrame < seq.frameCount && e.spotanimCycle > seq.getFrameLength(e.spotanimFrame)) {
				e.spotanimCycle -= seq.getFrameLength(e.spotanimFrame);
				e.spotanimFrame++;
			}

			if (e.spotanimFrame >= seq.frameCount && (e.spotanimFrame < 0 || e.spotanimFrame >= seq.frameCount)) {
				e.spotanimId = -1;
			}
		}

		if (e.primarySeqId != -1 && e.primarySeqDelay <= 1) {
			SeqType seq = SeqType.types[e.primarySeqId];
			if (seq.preanim_move == 1 && e.preanimRouteLength > 0 && e.forceMoveEndCycle <= loopCycle && e.forceMoveStartCycle < loopCycle) {
				e.primarySeqDelay = 1;
				return;
			}
		}

		if (e.primarySeqId != -1 && e.primarySeqDelay == 0) {
			SeqType seq = SeqType.types[e.primarySeqId];
			e.primarySeqCycle++;

			while (e.primarySeqFrame < seq.frameCount && e.primarySeqCycle > seq.getFrameLength(e.primarySeqFrame)) {
				e.primarySeqCycle -= seq.getFrameLength(e.primarySeqFrame);
				e.primarySeqFrame++;
			}

			if (e.primarySeqFrame >= seq.frameCount) {
				e.primarySeqFrame -= seq.loops;
				e.primarySeqLoop++;

				if (e.primarySeqLoop >= seq.maxloops) {
					e.primarySeqId = -1;
				}

				if (e.primarySeqFrame < 0 || e.primarySeqFrame >= seq.frameCount) {
					e.primarySeqId = -1;
				}
			}

			e.needsForwardDrawPadding = seq.stretches;
		}

		if (e.primarySeqDelay > 0) {
			e.primarySeqDelay--;
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void loadTitle() {
		if (this.imageTitle2 != null) {
			return;
		}

		super.drawArea = null;
		this.areaChatback = null;
		this.areaMapback = null;
		this.areaSidebar = null;
		this.areaViewport = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackhmid1 = null;

		this.imageTitle0 = new PixMap(265, this.getBaseComponent(), 128);
		Pix2D.cls();

		this.imageTitle1 = new PixMap(265, this.getBaseComponent(), 128);
		Pix2D.cls();

		this.imageTitle2 = new PixMap(171, this.getBaseComponent(), 509);
		Pix2D.cls();

		this.imageTitle3 = new PixMap(132, this.getBaseComponent(), 360);
		Pix2D.cls();

		this.imageTitle4 = new PixMap(200, this.getBaseComponent(), 360);
		Pix2D.cls();

		this.imageTitle5 = new PixMap(238, this.getBaseComponent(), 202);
		Pix2D.cls();

		this.imageTitle6 = new PixMap(238, this.getBaseComponent(), 203);
		Pix2D.cls();

		this.imageTitle7 = new PixMap(94, this.getBaseComponent(), 74);
		Pix2D.cls();

		this.imageTitle8 = new PixMap(94, this.getBaseComponent(), 75);
		Pix2D.cls();

		if (this.jagTitle != null) {
			this.loadTitleBackground();
			this.loadTitleImages();
		}

		this.redrawFrame = true;
	}

	@ObfuscatedName("client.h(B)V")
	public void loadTitleBackground() {
		byte[] src = this.jagTitle.read("title.dat", null);
		Pix32 background = new Pix32(src, this);

		this.imageTitle0.bind();
		background.quickPlotSprite(0, 0);

		this.imageTitle1.bind();
		background.quickPlotSprite(-637, 0);

		this.imageTitle2.bind();
		background.quickPlotSprite(-128, 0);

		this.imageTitle3.bind();
		background.quickPlotSprite(-202, -371);

		this.imageTitle4.bind();
		background.quickPlotSprite(-202, -171);

		this.imageTitle5.bind();
		background.quickPlotSprite(0, -265);

		this.imageTitle6.bind();
		background.quickPlotSprite(-562, -265);

		this.imageTitle7.bind();
		background.quickPlotSprite(-128, -171);

		this.imageTitle8.bind();
		background.quickPlotSprite(-562, -171);

		int[] pixels = new int[background.wi];
		for (int y = 0; y < background.hi; y++) {
			for (int x = 0; x < background.wi; x++) {
				pixels[x] = background.pixels[background.wi - x - 1 + background.wi * y];
			}

			for (int x = 0; x < background.wi; x++) {
				background.pixels[x + background.wi * y] = pixels[x];
			}
		}

		this.imageTitle0.bind();
		background.quickPlotSprite(382, 0);

		this.imageTitle1.bind();
		background.quickPlotSprite(-255, 0);

		this.imageTitle2.bind();
		background.quickPlotSprite(254, 0);

		this.imageTitle3.bind();
		background.quickPlotSprite(180, -371);

		this.imageTitle4.bind();
		background.quickPlotSprite(180, -171);

		this.imageTitle5.bind();
		background.quickPlotSprite(382, -265);

		this.imageTitle6.bind();
		background.quickPlotSprite(-180, -265);

		this.imageTitle7.bind();
		background.quickPlotSprite(254, -171);

		this.imageTitle8.bind();
		background.quickPlotSprite(-180, -171);

		Pix32 logo = new Pix32(this.jagTitle, "logo", 0);
		this.imageTitle2.bind();
		logo.plotSprite(382 - logo.wi / 2 - 128, 18);

		Object var9 = null;
		Object var10 = null;
		Object var11 = null;
		System.gc();
	}

	@ObfuscatedName("client.n(I)V")
	public void loadTitleImages() {
		this.imageTitlebox = new Pix8(this.jagTitle, "titlebox", 0);
		this.imageTitlebutton = new Pix8(this.jagTitle, "titlebutton", 0);

		this.imageRunes = new Pix8[12];
		for (int i = 0; i < 12; i++) {
			this.imageRunes[i] = new Pix8(this.jagTitle, "runes", i);
		}

		this.imageFlamesLeft = new Pix32(128, 265);
		this.imageFlamesRight = new Pix32(128, 265);
		for (int i = 0; i < 33920; i++) {
			this.imageFlamesLeft.pixels[i] = this.imageTitle0.data[i];
		}
		for (int i = 0; i < 33920; i++) {
			this.imageFlamesRight.pixels[i] = this.imageTitle1.data[i];
		}

		this.flameGradient0 = new int[256];
		for (int i = 0; i < 64; i++) {
			this.flameGradient0[i] = i * 262144;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient0[i + 64] = i * 1024 + 16711680;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient0[i + 128] = i * 4 + 16776960;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient0[i + 192] = 16777215;
		}

		this.flameGradient1 = new int[256];
		for (int i = 0; i < 64; i++) {
			this.flameGradient1[i] = i * 1024;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient1[i + 64] = i * 4 + 65280;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient1[i + 128] = i * 262144 + 65535;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient1[i + 192] = 16777215;
		}

		this.flameGradient2 = new int[256];
		for (int i = 0; i < 64; i++) {
			this.flameGradient2[i] = i * 4;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient2[i + 64] = i * 262144 + 255;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient2[i + 128] = i * 1024 + 16711935;
		}
		for (int i = 0; i < 64; i++) {
			this.flameGradient2[i + 192] = 16777215;
		}

		this.flameGradient = new int[256];
		this.flameBuffer0 = new int[32768];
		this.flameBuffer1 = new int[32768];
		this.updateFlameBuffer(null);
		this.flameBuffer2 = new int[32768];
		this.flameBuffer3 = new int[32768];

		this.drawProgress("Connecting to fileserver", 10);

		if (!this.flameActive) {
			this.flamesThread = true;
			this.flameActive = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void drawTitle() {
		this.loadTitle();

		this.imageTitle4.bind();
		this.imageTitlebox.plotSprite(0, 0);

		short w = 360;
		short h = 200;

		if (this.titleScreenState == 0) {
			int y = h / 2 + 80;
			this.fontPlain11.centreStringTag(true, y, 7711145, w / 2, this.onDemand.message);

			y = h / 2 - 20;
			this.fontBold12.centreStringTag(true, y, 16776960, w / 2, "Welcome to RuneScape");

			y = y + 30;

			int x = w / 2 - 80;
			y = h / 2 + 20;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(true, y + 5, 16777215, x, "New user");

			x = w / 2 + 80;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(true, y + 5, 16777215, x, "Existing User");
		} else if (this.titleScreenState == 2) {
			int y = h / 2 - 40;
			if (this.loginMessage0.length() > 0) {
				this.fontBold12.centreStringTag(true, y - 15, 16776960, w / 2, this.loginMessage0);
				this.fontBold12.centreStringTag(true, y, 16776960, w / 2, this.loginMessage1);
				y += 30;
			} else {
				this.fontBold12.centreStringTag(true, y - 7, 16776960, w / 2, this.loginMessage1);
				y += 30;
			}

			this.fontBold12.drawStringTag(16777215, w / 2 - 90, y, true, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));

			y += 15;
			this.fontBold12.drawStringTag(16777215, w / 2 - 88, y, true, "Password: " + JString.censor(this.password) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));

			y += 15;

			int x = w / 2 - 80;
			y = h / 2 + 50;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(true, y + 5, 16777215, x, "Login");

			x = w / 2 + 80;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(true, y + 5, 16777215, x, "Cancel");
		}
		if (this.titleScreenState == 3) {
			this.fontBold12.centreStringTag(true, h / 2 - 60, 16776960, w / 2, "Create a free account");

			int y = h / 2 - 35;
			this.fontBold12.centreStringTag(true, y, 16777215, w / 2, "To create a new account you need to");

			y = y + 15;
			this.fontBold12.centreStringTag(true, y, 16777215, w / 2, "go back to the main RuneScape webpage");

			y = y + 15;
			this.fontBold12.centreStringTag(true, y, 16777215, w / 2, "and choose the red 'create account'");

			y = y + 15;
			this.fontBold12.centreStringTag(true, y, 16777215, w / 2, "button at the top right of that page.");

			y = y + 15;

			int x = w / 2;
			y = h / 2 + 50;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(true, y + 5, 16777215, x, "Cancel");
		}

		this.imageTitle4.draw(202, super.graphics, 171);

		if (this.redrawFrame) {
			this.redrawFrame = false;
			this.imageTitle2.draw(128, super.graphics, 0);
			this.imageTitle3.draw(202, super.graphics, 371);
			this.imageTitle5.draw(0, super.graphics, 265);
			this.imageTitle6.draw(562, super.graphics, 265);
			this.imageTitle7.draw(128, super.graphics, 171);
			this.imageTitle8.draw(562, super.graphics, 171);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void drawGame() {
		if (this.redrawFrame) {
			this.redrawFrame = false;

			this.areaBackleft1.draw(0, super.graphics, 4);
			this.areaBackleft2.draw(0, super.graphics, 357);
			this.areaBackright1.draw(722, super.graphics, 4);
			this.areaBackright2.draw(743, super.graphics, 205);
			this.areaBacktop1.draw(0, super.graphics, 0);
			this.areaBackvmid1.draw(516, super.graphics, 4);
			this.areaBackvmid2.draw(516, super.graphics, 205);
			this.areaBackvmid3.draw(496, super.graphics, 357);
			this.areaBackhmid2.draw(0, super.graphics, 338);

			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;

			if (this.sceneState != 2) {
				this.areaViewport.draw(4, super.graphics, 4);
				this.areaMapback.draw(550, super.graphics, 4);
			}
		}

		if (this.sceneState == 2) {
			this.drawScene();
		}

		if (this.menuVisible && this.menuArea == 1) {
			this.redrawSidebar = true;
		}

		if (this.sidebarInterfaceId != -1) {
			boolean redraw = this.updateInterfaceAnimation(this.sidebarInterfaceId, this.sceneDelta);
			if (redraw) {
				this.redrawSidebar = true;
			}
		}

		if (this.selectedArea == 2) {
			this.redrawSidebar = true;
		}

		if (this.objDragArea == 2) {
			this.redrawSidebar = true;
		}

		if (this.redrawSidebar) {
			this.drawSidebar();
			this.redrawSidebar = false;
		}

		if (this.chatInterfaceId == -1) {
			this.chatInterface.scrollPosition = this.chatScrollHeight - this.chatScrollOffset - 77;

			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.handleScrollInput(0, 463, this.chatScrollHeight, 77, false, this.chatInterface, super.mouseY - 357, super.mouseX - 17);
			}

			int offset = this.chatScrollHeight - 77 - this.chatInterface.scrollPosition;
			if (offset < 0) {
				offset = 0;
			}

			if (offset > this.chatScrollHeight - 77) {
				offset = this.chatScrollHeight - 77;
			}

			if (this.chatScrollOffset != offset) {
				this.chatScrollOffset = offset;
				this.redrawChatback = true;
			}
		}

		if (this.chatInterfaceId != -1) {
			boolean redraw = this.updateInterfaceAnimation(this.chatInterfaceId, this.sceneDelta);
			if (redraw) {
				this.redrawChatback = true;
			}
		}

		if (this.selectedArea == 3) {
			this.redrawChatback = true;
		}

		if (this.objDragArea == 3) {
			this.redrawChatback = true;
		}

		if (this.modalMessage != null) {
			this.redrawChatback = true;
		}

		if (this.menuVisible && this.menuArea == 2) {
			this.redrawChatback = true;
		}

		if (this.redrawChatback) {
			this.drawChat();
			this.redrawChatback = false;
		}

		if (this.sceneState == 2) {
			this.drawMinimap();
			this.areaMapback.draw(550, super.graphics, 4);
		}

		if (this.flashingTab != -1) {
			this.redrawSideicons = true;
		}

		if (this.redrawSideicons) {
			if (this.flashingTab != -1 && this.flashingTab == this.selectedTab) {
				this.flashingTab = -1;
				// TUTORIAL_CLICKSIDE
				this.out.pIsaac(243);
				this.out.p1(this.selectedTab);
			}

			this.redrawSideicons = false;
			this.areaBackhmid1.bind();
			this.imageBackhmid1.plotSprite(0, 0);

			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 0) {
						this.imageRedstone1.plotSprite(22, 10);
					} else if (this.selectedTab == 1) {
						this.imageRedstone2.plotSprite(54, 8);
					} else if (this.selectedTab == 2) {
						this.imageRedstone2.plotSprite(82, 8);
					} else if (this.selectedTab == 3) {
						this.imageRedstone3.plotSprite(110, 8);
					} else if (this.selectedTab == 4) {
						this.imageRedstone2h.plotSprite(153, 8);
					} else if (this.selectedTab == 5) {
						this.imageRedstone2h.plotSprite(181, 8);
					} else if (this.selectedTab == 6) {
						this.imageRedstone1h.plotSprite(209, 9);
					}
				}

				if (this.tabInterfaceId[0] != -1 && (this.flashingTab != 0 || loopCycle % 20 < 10)) {
					this.imageSideicons[0].plotSprite(29, 13);
				}

				if (this.tabInterfaceId[1] != -1 && (this.flashingTab != 1 || loopCycle % 20 < 10)) {
					this.imageSideicons[1].plotSprite(53, 11);
				}

				if (this.tabInterfaceId[2] != -1 && (this.flashingTab != 2 || loopCycle % 20 < 10)) {
					this.imageSideicons[2].plotSprite(82, 11);
				}

				if (this.tabInterfaceId[3] != -1 && (this.flashingTab != 3 || loopCycle % 20 < 10)) {
					this.imageSideicons[3].plotSprite(115, 12);
				}

				if (this.tabInterfaceId[4] != -1 && (this.flashingTab != 4 || loopCycle % 20 < 10)) {
					this.imageSideicons[4].plotSprite(153, 13);
				}

				if (this.tabInterfaceId[5] != -1 && (this.flashingTab != 5 || loopCycle % 20 < 10)) {
					this.imageSideicons[5].plotSprite(180, 11);
				}

				if (this.tabInterfaceId[6] != -1 && (this.flashingTab != 6 || loopCycle % 20 < 10)) {
					this.imageSideicons[6].plotSprite(208, 13);
				}
			}

			this.areaBackhmid1.draw(516, super.graphics, 160);

			this.areaBackbase2.bind();
			this.imageBackbase2.plotSprite(0, 0);

			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 7) {
						this.imageRedstone1v.plotSprite(42, 0);
					} else if (this.selectedTab == 8) {
						this.imageRedstone2v.plotSprite(74, 0);
					} else if (this.selectedTab == 9) {
						this.imageRedstone2v.plotSprite(102, 0);
					} else if (this.selectedTab == 10) {
						this.imageRedstone3v.plotSprite(130, 1);
					} else if (this.selectedTab == 11) {
						this.imageRedstone2hv.plotSprite(173, 0);
					} else if (this.selectedTab == 12) {
						this.imageRedstone2hv.plotSprite(201, 0);
					} else if (this.selectedTab == 13) {
						this.imageRedstone1hv.plotSprite(229, 0);
					}
				}

				if (this.tabInterfaceId[8] != -1 && (this.flashingTab != 8 || loopCycle % 20 < 10)) {
					this.imageSideicons[7].plotSprite(74, 2);
				}

				if (this.tabInterfaceId[9] != -1 && (this.flashingTab != 9 || loopCycle % 20 < 10)) {
					this.imageSideicons[8].plotSprite(102, 3);
				}

				if (this.tabInterfaceId[10] != -1 && (this.flashingTab != 10 || loopCycle % 20 < 10)) {
					this.imageSideicons[9].plotSprite(137, 4);
				}

				if (this.tabInterfaceId[11] != -1 && (this.flashingTab != 11 || loopCycle % 20 < 10)) {
					this.imageSideicons[10].plotSprite(174, 2);
				}

				if (this.tabInterfaceId[12] != -1 && (this.flashingTab != 12 || loopCycle % 20 < 10)) {
					this.imageSideicons[11].plotSprite(201, 2);
				}

				if (this.tabInterfaceId[13] != -1 && (this.flashingTab != 13 || loopCycle % 20 < 10)) {
					this.imageSideicons[12].plotSprite(226, 2);
				}
			}

			this.areaBackbase2.draw(496, super.graphics, 466);
			this.areaViewport.bind();
		}

		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;

			this.areaBackbase1.bind();
			this.imageBackbase1.plotSprite(0, 0);

			this.fontPlain12.centreStringTag(true, 28, 16777215, 55, "Public chat");
			if (this.chatPublicMode == 0) {
				this.fontPlain12.centreStringTag(true, 41, 65280, 55, "On");
			} else if (this.chatPublicMode == 1) {
				this.fontPlain12.centreStringTag(true, 41, 16776960, 55, "Friends");
			} else if (this.chatPublicMode == 2) {
				this.fontPlain12.centreStringTag(true, 41, 16711680, 55, "Off");
			} else if (this.chatPublicMode == 3) {
				this.fontPlain12.centreStringTag(true, 41, 65535, 55, "Hide");
			}

			this.fontPlain12.centreStringTag(true, 28, 16777215, 184, "Private chat");
			if (this.chatPrivateMode == 0) {
				this.fontPlain12.centreStringTag(true, 41, 65280, 184, "On");
			} else if (this.chatPrivateMode == 1) {
				this.fontPlain12.centreStringTag(true, 41, 16776960, 184, "Friends");
			} else if (this.chatPrivateMode == 2) {
				this.fontPlain12.centreStringTag(true, 41, 16711680, 184, "Off");
			}

			this.fontPlain12.centreStringTag(true, 28, 16777215, 324, "Trade/duel");
			if (this.chatTradeMode == 0) {
				this.fontPlain12.centreStringTag(true, 41, 65280, 324, "On");
			} else if (this.chatTradeMode == 1) {
				this.fontPlain12.centreStringTag(true, 41, 16776960, 324, "Friends");
			} else if (this.chatTradeMode == 2) {
				this.fontPlain12.centreStringTag(true, 41, 16711680, 324, "Off");
			}

			this.fontPlain12.centreStringTag(true, 33, 16777215, 458, "Report abuse");

			this.areaBackbase1.draw(0, super.graphics, 453);

			this.areaViewport.bind();
		}

		this.sceneDelta = 0;
	}

	@ObfuscatedName("client.F(I)V")
	public void drawScene() {
		this.sceneCycle++;

		this.pushNpcs(true);
		this.pushPlayers();
		this.pushNpcs(false);
		this.pushProjectiles();
		this.pushSpotanims();

		if (!this.cutscene) {
			int pitch = this.orbitCameraPitch;
			if (this.cameraPitchClamp / 256 > pitch) {
				pitch = this.cameraPitchClamp / 256;
			}
			if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > pitch) {
				pitch = this.cameraModifierWobbleScale[4] + 128;
			}

			int yaw = this.orbitCameraYaw + this.macroCameraAngle & 0x7FF;
			this.orbitCamera(pitch, this.getHeightmapY(localPlayer.z, this.currentLevel, localPlayer.x) - 50, this.orbitCameraZ, this.orbitCameraX, yaw, pitch * 3 + 600);

			cyclelogic2++;
			if (cyclelogic2 > 1802) {
				cyclelogic2 = 0;

				// ANTICHEAT_CYCLELOGIC2
				this.out.pIsaac(223);
				this.out.p1(0);
				int var4 = this.out.pos;
				this.out.p2(29711);
				this.out.p1(70);
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.p1(242);
				this.out.p1(186);
				this.out.p1(39);
				this.out.p1(61);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p1(13);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(57856);
				}
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.psize1(this.out.pos - var4);
			}
		}

		int level;
		if (this.cutscene) {
			level = this.getTopLevelCutscene();
		} else {
			level = this.getTopLevel();
		}

		int cameraX = this.cameraX;
		int cameraY = this.cameraY;
		int cameraZ = this.cameraZ;
		int cameraPitch = this.cameraPitch;
		int cameraYaw = this.cameraYaw;

		for (int type = 0; type < 5; type++) {
			if (this.cameraModifierEnabled[type]) {
				int jitter = (int) (Math.random() * (double) (this.cameraModifierJitter[type] * 2 + 1) - (double) this.cameraModifierJitter[type] + Math.sin((double) this.cameraModifierCycle[type] * ((double) this.cameraModifierWobbleSpeed[type] / 100.0D)) * (double) this.cameraModifierWobbleScale[type]);

				if (type == 0) {
					this.cameraX += jitter;
				} else if (type == 1) {
					this.cameraY += jitter;
				} else if (type == 2) {
					this.cameraZ += jitter;
				} else if (type == 3) {
					this.cameraYaw = this.cameraYaw + jitter & 0x7FF;
				} else if (type == 4) {
					this.cameraPitch += jitter;

					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					} else if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
			}
		}

		int cycle = Pix3D.cycle;
		Model.checkHover = true;
		Model.pickedCount = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;

		Pix2D.cls();
		this.scene.draw(this.cameraPitch, this.cameraX, this.cameraY, this.cameraYaw, this.cameraZ, level);
		this.scene.clearLocChanges();
		this.draw2DEntityElements();
		this.drawTileHint();
		this.updateTextures(cycle);
		this.draw3DEntityElements();
		this.areaViewport.draw(4, super.graphics, 4);

		this.cameraX = cameraX;
		this.cameraY = cameraY;
		this.cameraZ = cameraZ;
		this.cameraPitch = cameraPitch;
		this.cameraYaw = cameraYaw;
	}

	@ObfuscatedName("client.O(I)V")
	public void pushPlayers() {
		if (localPlayer.x >> 7 == this.flagSceneTileX && localPlayer.z >> 7 == this.flagSceneTileZ) {
			this.flagSceneTileX = 0;
		}
		for (int i = -1; i < this.playerCount; i++) {
			ClientPlayer player;

			int index;
			if (i == -1) {
				player = localPlayer;
				index = this.LOCAL_PLAYER_INDEX << 14;
			} else {
				player = this.players[this.playerIds[i]];
				index = this.playerIds[i] << 14;
			}

			if (player == null || !player.isVisible()) {
				continue;
			}

			player.lowMemory = false;
			if ((lowMem && this.playerCount > 50 || this.playerCount > 200) && i != -1 && player.secondarySeqId == player.readyanim) {
				player.lowMemory = true;
			}

			int stx = player.x >> 7;
			int stz = player.z >> 7;
			if (stx < 0 || stx >= 104 || stz < 0 || stz >= 104) {
				continue;
			}

			if (player.locModel == null || loopCycle < player.locStartCycle || loopCycle >= player.locStopCycle) {
				if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
					if (this.tileLastOccupiedCycle[stx][stz] == this.sceneCycle && i != -1) {
						continue;
					}

					this.tileLastOccupiedCycle[stx][stz] = this.sceneCycle;
				}

				player.y = this.getHeightmapY(player.z, this.currentLevel, player.x);
				this.scene.addTemporary(60, player.z, player.yaw, player.x, index, this.currentLevel, player.needsForwardDrawPadding, player.y, player);
			} else {
				player.lowMemory = false;
				player.y = this.getHeightmapY(player.z, this.currentLevel, player.x);
				this.scene.addTemporary(player.x, player.minTileX, player.maxTileZ, player.minTileZ, player.yaw, player.maxTileX, player, this.currentLevel, player.y, index, player.z, 60);
			}
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public void pushNpcs(boolean alwaysontop) {
		for (int i = 0; i < this.npcCount; i++) {
			ClientNpc npc = this.npcs[this.npcIds[i]];
			int typecode = (this.npcIds[i] << 14) + 536870912;

			if (npc == null || !npc.isVisible() || npc.type.alwaysontop != alwaysontop) {
				continue;
			}

			int x = npc.x >> 7;
			int z = npc.z >> 7;

			if (x < 0 || x >= 104 || z < 0 || z >= 104) {
				continue;
			}

			if (npc.size == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
				if (this.tileLastOccupiedCycle[x][z] == this.sceneCycle) {
					continue;
				}

				this.tileLastOccupiedCycle[x][z] = this.sceneCycle;
			}

			this.scene.addTemporary((npc.size - 1) * 64 + 60, npc.z, npc.yaw, npc.x, typecode, this.currentLevel, npc.needsForwardDrawPadding, this.getHeightmapY(npc.z, this.currentLevel, npc.x), npc);
		}
	}

	@ObfuscatedName("client.V(I)V")
	public void pushProjectiles() {
		for (ClientProj proj = (ClientProj) this.projectiles.head(); proj != null; proj = (ClientProj) this.projectiles.next()) {
			if (proj.level != this.currentLevel || loopCycle > proj.endCycle) {
				proj.unlink();
			} else if (loopCycle >= proj.startCycle) {
				if (proj.target > 0) {
					ClientNpc npc = this.npcs[proj.target - 1];
					if (npc != null && npc.x >= 0 && npc.x < 13312 && npc.z >= 0 && npc.z < 13312) {
						proj.updateVelocity(npc.x, npc.z, loopCycle, this.getHeightmapY(npc.z, proj.level, npc.x) - proj.dstHeight);
					}
				}

				if (proj.target < 0) {
					int index = -proj.target - 1;

					ClientPlayer player;
					if (index == this.localPid) {
						player = localPlayer;
					} else {
						player = this.players[index];
					}

					if (player != null && player.x >= 0 && player.x < 13312 && player.z >= 0 && player.z < 13312) {
						proj.updateVelocity(player.x, player.z, loopCycle, this.getHeightmapY(player.z, proj.level, player.x) - proj.dstHeight);
					}
				}

				proj.update(this.sceneDelta);
				this.scene.addTemporary(60, (int) proj.z, proj.yaw, (int) proj.x, -1, this.currentLevel, false, (int) proj.y, proj);
			}
		}
	}

	@ObfuscatedName("client.W(I)V")
	public void pushSpotanims() {
		for (MapSpotAnim spot = (MapSpotAnim) this.spotanims.head(); spot != null; spot = (MapSpotAnim) this.spotanims.next()) {
			if (spot.level != this.currentLevel || spot.seqComplete) {
				spot.unlink();
			} else if (loopCycle >= spot.startCycle) {
				spot.update(this.sceneDelta);

				if (spot.seqComplete) {
					spot.unlink();
				} else {
					this.scene.addTemporary(60, spot.z, 0, spot.x, -1, spot.level, false, spot.y, spot);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public void orbitCamera(int pitch, int targetY, int targetZ, int targetX, int yaw, int distance) {
		int invPitch = 2048 - pitch & 0x7FF;
		int invYaw = 2048 - yaw & 0x7FF;

		int x = 0;
		int y = 0;
		int z = distance;

		if (invPitch != 0) {
			int sin = Model.sinTable[invPitch];
			int cos = Model.cosTable[invPitch];
			int tmp = y * cos - distance * sin >> 16;
			z = y * sin + distance * cos >> 16;
			y = tmp;
		}

		if (invYaw != 0) {
			int sin = Model.sinTable[invYaw];
			int cos = Model.cosTable[invYaw];
			int tmp = z * sin + x * cos >> 16;
			z = z * cos - x * sin >> 16;
			x = tmp;
		}

		this.cameraX = targetX - x;
		this.cameraY = targetY - y;
		this.cameraZ = targetZ - z;
		this.cameraPitch = pitch;
		this.cameraYaw = yaw;
	}

	@ObfuscatedName("client.f(Z)I")
	public int getTopLevelCutscene() {
		int y = this.getHeightmapY(this.cameraZ, this.currentLevel, this.cameraX);
		return y - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0 ? 3 : this.currentLevel;
	}

	@ObfuscatedName("client.L(I)I")
	public int getTopLevel() {
		int top = 3;

		if (this.cameraPitch < 310) {
			int cameraLocalTileX = this.cameraX >> 7;
			int cameraLocalTileZ = this.cameraZ >> 7;
			int playerLocalTileX = localPlayer.x >> 7;
			int playerLocalTileZ = localPlayer.z >> 7;

			if ((this.levelTileFlags[this.currentLevel][cameraLocalTileX][cameraLocalTileZ] & 0x4) != 0) {
				top = this.currentLevel;
			}

			int tileDeltaX;
			if (playerLocalTileX > cameraLocalTileX) {
				tileDeltaX = playerLocalTileX - cameraLocalTileX;
			} else {
				tileDeltaX = cameraLocalTileX - playerLocalTileX;
			}

			int tileDeltaZ;
			if (playerLocalTileZ > cameraLocalTileZ) {
				tileDeltaZ = playerLocalTileZ - cameraLocalTileZ;
			} else {
				tileDeltaZ = cameraLocalTileZ - playerLocalTileZ;
			}

			if (tileDeltaX > tileDeltaZ) {
				int delta = tileDeltaZ * 65536 / tileDeltaX;
				int accumulator = 32768;

				while (cameraLocalTileX != playerLocalTileX) {
					if (cameraLocalTileX < playerLocalTileX) {
						cameraLocalTileX++;
					} else if (cameraLocalTileX > playerLocalTileX) {
						cameraLocalTileX--;
					}

					if ((this.levelTileFlags[this.currentLevel][cameraLocalTileX][cameraLocalTileZ] & 0x4) != 0) {
						top = this.currentLevel;
					}

					accumulator += delta;
					if (accumulator >= 65536) {
						accumulator -= 65536;

						if (cameraLocalTileZ < playerLocalTileZ) {
							cameraLocalTileZ++;
						} else if (cameraLocalTileZ > playerLocalTileZ) {
							cameraLocalTileZ--;
						}

						if ((this.levelTileFlags[this.currentLevel][cameraLocalTileX][cameraLocalTileZ] & 0x4) != 0) {
							top = this.currentLevel;
						}
					}
				}
			} else {
				int delta = tileDeltaX * 65536 / tileDeltaZ;
				int accumulator = 32768;

				while (cameraLocalTileZ != playerLocalTileZ) {
					if (cameraLocalTileZ < playerLocalTileZ) {
						cameraLocalTileZ++;
					} else if (cameraLocalTileZ > playerLocalTileZ) {
						cameraLocalTileZ--;
					}

					if ((this.levelTileFlags[this.currentLevel][cameraLocalTileX][cameraLocalTileZ] & 0x4) != 0) {
						top = this.currentLevel;
					}

					accumulator += delta;
					if (accumulator >= 65536) {
						accumulator -= 65536;

						if (cameraLocalTileX < playerLocalTileX) {
							cameraLocalTileX++;
						} else if (cameraLocalTileX > playerLocalTileX) {
							cameraLocalTileX--;
						}

						if ((this.levelTileFlags[this.currentLevel][cameraLocalTileX][cameraLocalTileZ] & 0x4) != 0) {
							top = this.currentLevel;
						}
					}
				}
			}
		}

		if ((this.levelTileFlags[this.currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			top = this.currentLevel;
		}

		return top;
	}

	@ObfuscatedName("client.v(I)V")
	public void draw2DEntityElements() {
		this.chatCount = 0;

		for (int index = -1; index < this.playerCount + this.npcCount; index++) {
			ClientEntity e;
			if (index == -1) {
				e = localPlayer;
			} else if (index < this.playerCount) {
				e = this.players[this.playerIds[index]];
			} else {
				e = this.npcs[this.npcIds[index - this.playerCount]];
			}

			if (e == null || !e.isVisible()) {
				continue;
			}

			if (index >= this.playerCount) {
				NpcType npc = ((ClientNpc) e).type;

				if (npc.headicon >= 0 && npc.headicon < this.imageHeadicon.length) {
					this.projectFromEntity(e, e.height + 15);

					if (this.projectX > -1) {
						this.imageHeadicon[npc.headicon].plotSprite(this.projectX - 12, this.projectY - 30);
					}
				}

				if (this.hintType == 1 && this.hintNpc == this.npcIds[index - this.playerCount] && loopCycle % 20 < 10) {
					this.projectFromEntity(e, e.height + 15);

					if (this.projectX > -1) {
						this.imageHeadicon[2].plotSprite(this.projectX - 12, this.projectY - 28);
					}
				}
			} else {
				int y = 30;

				ClientPlayer player = (ClientPlayer) e;

				if (player.headicon != 0) {
					this.projectFromEntity(e, e.height + 15);

					if (this.projectX > -1) {
						for (int icon = 0; icon < 8; icon++) {
							if ((player.headicon & 0x1 << icon) != 0) {
								this.imageHeadicon[icon].plotSprite(this.projectX - 12, this.projectY - y);
								y -= 25;
							}
						}
					}
				}

				if (index >= 0 && this.hintType == 10 && this.hintPlayer == this.playerIds[index]) {
					this.projectFromEntity(e, e.height + 15);

					if (this.projectX > -1) {
						this.imageHeadicon[7].plotSprite(this.projectX - 12, this.projectY - y);
					}
				}
			}

			if (e.chatMessage != null && (index >= this.playerCount || this.chatPublicMode == 0 || this.chatPublicMode == 3 || this.chatPublicMode == 1 && this.isFriend(((ClientPlayer) e).name))) {
				this.projectFromEntity(e, e.height);

				if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
					this.chatWidth[this.chatCount] = this.fontBold12.stringWid(e.chatMessage) / 2;
					this.chatHeight[this.chatCount] = this.fontBold12.height;
					this.chatX[this.chatCount] = this.projectX;
					this.chatY[this.chatCount] = this.projectY;

					this.chatColour[this.chatCount] = e.chatColour;
					this.chatEffect[this.chatCount] = e.chatEffect;
					this.chatTimer[this.chatCount] = e.chatTimer;
					this.chatMessage[this.chatCount++] = e.chatMessage;

					if (this.chatEffects == 0 && e.chatEffect == 1) {
						this.chatHeight[this.chatCount] += 10;
						this.chatY[this.chatCount] += 5;
					}

					if (this.chatEffects == 0 && e.chatEffect == 2) {
						this.chatWidth[this.chatCount] = 60;
					}
				}
			}

			if (e.combatCycle > loopCycle) {
				this.projectFromEntity(e, e.height + 15);

				if (this.projectX > -1) {
					int w = e.health * 30 / e.totalHealth;
					if (w > 30) {
						w = 30;
					}

					Pix2D.fillRect(this.projectY - 3, 5, this.projectX - 15, w, 65280);
					Pix2D.fillRect(this.projectY - 3, 5, this.projectX - 15 + w, 30 - w, 16711680);
				}
			}

			for (int i = 0; i < 4; i++) {
				if (e.damageCycle[i] > loopCycle) {
					this.projectFromEntity(e, e.height / 2);

					if (this.projectX > -1) {
						if (i == 1) {
							this.projectY -= 20;
						} else if (i == 2) {
							this.projectX -= 15;
							this.projectY -= 10;
						} else if (i == 3) {
							this.projectX += 15;
							this.projectY -= 10;
						}

						this.imageHitmark[e.damageType[i]].plotSprite(this.projectX - 12, this.projectY - 12);
						this.fontPlain11.centreString(0, this.projectX, this.projectY + 4, String.valueOf(e.damage[i]));
						this.fontPlain11.centreString(16777215, this.projectX - 1, this.projectY + 3, String.valueOf(e.damage[i]));
					}
				}
			}
		}

		for (int i = 0; i < this.chatCount; i++) {
			int x = this.chatX[i];
			int y = this.chatY[i];
			int width = this.chatWidth[i];
			int height = this.chatHeight[i];

			boolean sorting = true;
			while (sorting) {
				sorting = false;

				for (int j = 0; j < i; j++) {
					if (y + 2 > this.chatY[j] - this.chatHeight[j] && y - height < this.chatY[j] + 2 && x - width < this.chatX[j] + this.chatWidth[j] && x + width > this.chatX[j] - this.chatWidth[j] && this.chatY[j] - this.chatHeight[j] < y) {
						y = this.chatY[j] - this.chatHeight[j];
						sorting = true;
					}
				}
			}

			this.projectX = this.chatX[i];
			this.projectY = this.chatY[i] = y;

			String message = this.chatMessage[i];
			if (this.chatEffects == 0) {
				int colour = 16776960;

				if (this.chatColour[i] < 6) {
					colour = this.CHAT_COLOURS[this.chatColour[i]];
				} else if (this.chatColour[i] == 6) {
					colour = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
				} else if (this.chatColour[i] == 7) {
					colour = this.sceneCycle % 20 < 10 ? 255 : 65535;
				} else if (this.chatColour[i] == 8) {
					colour = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
				} else if (this.chatColour[i] == 9) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						colour = delta * 1280 + 16711680;
					} else if (delta < 100) {
						colour = 16776960 - (delta - 50) * 327680;
					} else if (delta < 150) {
						colour = (delta - 100) * 5 + 65280;
					}
				} else if (this.chatColour[i] == 10) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						colour = delta * 5 + 16711680;
					} else if (delta < 100) {
						colour = 16711935 - (delta - 50) * 327680;
					} else if (delta < 150) {
						colour = (delta - 100) * 327680 + 255 - (delta - 100) * 5;
					}
				} else if (this.chatColour[i] == 11) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						colour = 16777215 - delta * 327685;
					} else if (delta < 100) {
						colour = (delta - 50) * 327685 + 65280;
					} else if (delta < 150) {
						colour = 16777215 - (delta - 100) * 327680;
					}
				}

				if (this.chatEffect[i] == 0) {
					this.fontBold12.centreString(0, this.projectX, this.projectY + 1, message);
					this.fontBold12.centreString(colour, this.projectX, this.projectY, message);
				} else if (this.chatEffect[i] == 1) {
					this.fontBold12.centreStringWave(this.projectX, 0, this.projectY + 1, message, this.sceneCycle);
					this.fontBold12.centreStringWave(this.projectX, colour, this.projectY, message, this.sceneCycle);
				} else if (this.chatEffect[i] == 2) {
					int w = this.fontBold12.stringWid(message);
					int offsetX = (150 - this.chatTimer[i]) * (w + 100) / 150;
					Pix2D.setClipping(0, this.projectX + 50, 334, this.projectX - 50);
					this.fontBold12.drawString(message, 0, this.projectX + 50 - offsetX, this.projectY + 1);
					this.fontBold12.drawString(message, colour, this.projectX + 50 - offsetX, this.projectY);
					Pix2D.resetClipping();
				}
			} else {
				this.fontBold12.centreString(0, this.projectX, this.projectY + 1, message);
				this.fontBold12.centreString(16776960, this.projectX, this.projectY, message);
			}
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public void drawTileHint() {
		if (this.hintType != 2) {
			return;
		}

		this.projectFromGround((this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ, this.hintHeight * 2, (this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX);

		if (this.projectX > -1 && loopCycle % 20 < 10) {
			this.imageHeadicon[2].plotSprite(this.projectX - 12, this.projectY - 28);
		}
	}

	@ObfuscatedName("client.a(ZLz;I)V")
	public void projectFromEntity(ClientEntity e, int height) {
		this.projectFromGround(e.z, height, e.x);
	}

	@ObfuscatedName("client.b(IIII)V")
	public void projectFromGround(int z, int height, int x) {
		if (x < 128 || z < 128 || x > 13056 || z > 13056) {
			this.projectX = -1;
			this.projectY = -1;
			return;
		}

		int y = this.getHeightmapY(z, this.currentLevel, x) - height;

		int dx = x - this.cameraX;
		int dy = y - this.cameraY;
		int dz = z - this.cameraZ;

		int sinPitch = Model.sinTable[this.cameraPitch];
		int cosPitch = Model.cosTable[this.cameraPitch];

		int sinYaw = Model.sinTable[this.cameraYaw];
		int cosYaw = Model.cosTable[this.cameraYaw];

		int tmp = (dz * sinYaw + dx * cosYaw) >> 16;
		dz = (dz * cosYaw - dx * sinYaw) >> 16;
		dx = tmp;

		tmp = (dy * cosPitch - dz * sinPitch) >> 16;
		dz = (dy * sinPitch + dz * cosPitch) >> 16;
		dy = tmp;

		if (dz >= 50) {
			this.projectX = (dx << 9) / dz + Pix3D.centerX;
			this.projectY = (dy << 9) / dz + Pix3D.centerY;
		} else {
			this.projectX = -1;
			this.projectY = -1;
		}
	}

	@ObfuscatedName("client.a(IIIB)I")
	public int getHeightmapY(int sceneZ, int level, int sceneX) {
		int tileX = sceneX >> 7;
		int tileZ = sceneZ >> 7;

		if (tileX < 0 || tileZ < 0 || tileX > 103 || tileZ > 103) {
			return 0;
		}

		int realLevel = level;
		if (level < 3 && (this.levelTileFlags[1][tileX][tileZ] & 0x2) == 2) {
			realLevel = level + 1;
		}

		int tileLocalX = sceneX & 0x7F;
		int tileLocalZ = sceneZ & 0x7F;
		int y00 = this.levelHeightmap[realLevel][tileX][tileZ] * (128 - tileLocalX) + this.levelHeightmap[realLevel][tileX + 1][tileZ] * tileLocalX >> 7;
		int y11 = this.levelHeightmap[realLevel][tileX][tileZ + 1] * (128 - tileLocalX) + this.levelHeightmap[realLevel][tileX + 1][tileZ + 1] * tileLocalX >> 7;
		return y00 * (128 - tileLocalZ) + y11 * tileLocalZ >> 7;
	}

	@ObfuscatedName("client.e(II)V")
	public void updateTextures(int cycle) {
		if (lowMem) {
			return;
		}

		if (Pix3D.textureCycle[17] >= cycle) {
			Pix8 texture = Pix3D.textures[17];
			int bottom = texture.wi * texture.hi - 1;
			int adjustment = texture.wi * this.sceneDelta * 2;
			byte[] src = texture.pixels;
			byte[] dst = this.textureBuffer;
			for (int i = 0; i <= bottom; i++) {
				dst[i] = src[i - adjustment & bottom];
			}
			texture.pixels = dst;
			this.textureBuffer = src;
			Pix3D.pushTexture(17);
		}

		if (Pix3D.textureCycle[24] >= cycle) {
			Pix8 texture = Pix3D.textures[24];
			int bottom = texture.wi * texture.hi - 1;
			int adjustment = texture.wi * this.sceneDelta * 2;
			byte[] src = texture.pixels;
			byte[] dst = this.textureBuffer;
			for (int i = 0; i <= bottom; i++) {
				dst[i] = src[i - adjustment & bottom];
			}
			texture.pixels = dst;
			this.textureBuffer = src;
			Pix3D.pushTexture(24);
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void draw3DEntityElements() {
		this.drawPrivateMessages();

		if (this.crossMode == 1) {
			this.imageCross[this.crossCycle / 100].plotSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
		} else if (this.crossMode == 2) {
			this.imageCross[this.crossCycle / 100 + 4].plotSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
		}

		if (this.viewportOverlayInterfaceId != -1) {
			this.updateInterfaceAnimation(this.viewportOverlayInterfaceId, this.sceneDelta);
			this.drawInterface(Component.types[this.viewportOverlayInterfaceId], 0, 0, 0);
		}

		if (this.field1504 > 0) {
			int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1504 / 10.0D) * 10.0D);
			for (int var3 = 0; var3 < 30; var3++) {
				int var4 = (30 - var3) * 16;
				Pix2D.hlineTrans(16776960, var3 + var2, this.field1504, var4, 256 - var4 / 2);
			}
		}

		if (this.viewportInterfaceId != -1) {
			this.updateInterfaceAnimation(this.viewportInterfaceId, this.sceneDelta);
			this.drawInterface(Component.types[this.viewportInterfaceId], 0, 0, 0);
		}

		this.updateWorldLocation();

		if (!this.menuVisible) {
			this.handleInput();
			this.drawTooltip();
		} else if (this.menuArea == 0) {
			this.drawMenu();
		}

		if (this.inMultizone == 1) {
			if (this.wildernessLevel > 0 || this.worldLocationState == 1) {
				this.imageHeadicon[1].plotSprite(472, 258);
			} else {
				this.imageHeadicon[1].plotSprite(472, 296);
			}
		}

		if (this.wildernessLevel > 0) {
			this.imageHeadicon[0].plotSprite(472, 296);
			this.fontPlain12.centreString(16776960, 484, 329, "Level: " + this.wildernessLevel);
		}

		if (this.worldLocationState == 1) {
			this.imageHeadicon[6].plotSprite(472, 296);
			this.fontPlain12.centreString(16776960, 484, 329, "Arena");
		}

		if (this.systemUpdateTimer != 0) {
			int seconds = this.systemUpdateTimer / 50;
			int minutes = seconds / 60;
			seconds = seconds % 60;

			if (seconds < 10) {
				this.fontPlain12.drawString("System update in: " + minutes + ":0" + seconds, 16776960, 4, 329);
			} else {
				this.fontPlain12.drawString("System update in: " + minutes + ":" + seconds, 16776960, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.x(I)V")
	public void drawPrivateMessages() {
		if (this.splitPrivateChat == 0) {
			return;
		}
		PixFont var3 = this.fontPlain12;
		int var4 = 0;
		if (this.systemUpdateTimer != 0) {
			var4 = 1;
		}
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.messageText[var5] != null) {
				int var6 = this.messageType[var5];
				String var7 = this.messageSender[var5];
				byte var8 = 0;
				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
					var8 = 1;
				}
				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
					var8 = 2;
				}
				if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var7))) {
					int var9 = 329 - var4 * 13;
					byte var10 = 4;
					var3.drawString("From", 0, var10, var9);
					var3.drawString("From", 65535, var10, var9 - 1);
					int var11 = var10 + var3.stringWid("From ");
					if (var8 == 1) {
						this.imageModIcons[0].plotSprite(var11, var9 - 12);
						var11 += 14;
					}
					if (var8 == 2) {
						this.imageModIcons[1].plotSprite(var11, var9 - 12);
						var11 += 14;
					}
					var3.drawString(var7 + ": " + this.messageText[var5], 0, var11, var9);
					var3.drawString(var7 + ": " + this.messageText[var5], 65535, var11, var9 - 1);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
				if (var6 == 5 && this.chatPrivateMode < 2) {
					int var12 = 329 - var4 * 13;
					var3.drawString(this.messageText[var5], 0, 4, var12);
					var3.drawString(this.messageText[var5], 65535, 4, var12 - 1);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
				if (var6 == 6 && this.chatPrivateMode < 2) {
					int var13 = 329 - var4 * 13;
					var3.drawString("To " + var7 + ": " + this.messageText[var5], 0, 4, var13);
					var3.drawString("To " + var7 + ": " + this.messageText[var5], 65535, 4, var13 - 1);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void updateWorldLocation() {
		int var2 = (localPlayer.x >> 7) + this.sceneBaseTileX;
		int var3 = (localPlayer.z >> 7) + this.sceneBaseTileZ;
		if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
			this.wildernessLevel = (var3 - 3520) / 8 + 1;
		} else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
			this.wildernessLevel = (var3 - 9920) / 8 + 1;
		} else {
			this.wildernessLevel = 0;
		}
		this.worldLocationState = 0;
		if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
			int var4 = var2 & 0x3F;
			int var5 = var3 & 0x3F;
			if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
				this.worldLocationState = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
				this.worldLocationState = 1;
			}
			if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
				this.worldLocationState = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
				this.worldLocationState = 1;
			}
			if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
				this.worldLocationState = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
				this.worldLocationState = 1;
			}
		}
		if (this.worldLocationState == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
			this.worldLocationState = 2;
		}
		this.overrideChat = 0;
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			this.overrideChat = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			this.overrideChat = 1;
		}
		if (this.overrideChat == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			this.overrideChat = 0;
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void drawTooltip() {
		if (this.menuSize < 2 && this.objSelected == 0 && this.spellSelected == 0) {
			return;
		}
		String var2;
		if (this.objSelected == 1 && this.menuSize < 2) {
			var2 = "Use " + this.objSelectedName + " with...";
		} else if (this.spellSelected == 1 && this.menuSize < 2) {
			var2 = this.spellCaption + "...";
		} else {
			var2 = this.menuOption[this.menuSize - 1];
		}
		if (this.menuSize > 2) {
			var2 = var2 + "@whi@ / " + (this.menuSize - 2) + " more options";
		}
		this.fontBold12.drawStringAntiMacro(loopCycle / 1000, 16777215, var2, 15, 4, true);
	}

	@ObfuscatedName("client.i(I)V")
	public void drawMenu() {
		int var2 = this.menuX;
		int var3 = this.menuY;
		int var4 = this.menuWidth;
		int var5 = this.menuHeight;
		int var6 = 6116423;
		Pix2D.fillRect(var3, var5, var2, var4, var6);
		Pix2D.fillRect(var3 + 1, 16, var2 + 1, var4 - 2, 0);
		Pix2D.drawRect(var2 + 1, var5 - 19, var3 + 18, var4 - 2, 0);
		this.fontBold12.drawString("Choose Option", var6, var2 + 3, var3 + 14);
		int var7 = super.mouseX;
		int var8 = super.mouseY;
		if (this.menuArea == 0) {
			var7 -= 4;
			var8 -= 4;
		}
		if (this.menuArea == 1) {
			var7 -= 553;
			var8 -= 205;
		}
		if (this.menuArea == 2) {
			var7 -= 17;
			var8 -= 357;
		}
		for (int var9 = 0; var9 < this.menuSize; var9++) {
			int var10 = var3 + 31 + (this.menuSize - 1 - var9) * 15;
			int var11 = 16777215;
			if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
				var11 = 16776960;
			}
			this.fontBold12.drawStringTag(var11, var2 + 3, var10, true, this.menuOption[var9]);
		}
	}

	@ObfuscatedName("client.a(IIIIIB)V")
	public void drawMinimapLoc(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var7 = this.scene.getWallTypecode(arg3, arg0, arg1);
		if (var7 != 0) {
			int var8 = this.scene.getInfo(arg3, arg0, arg1, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg4;
			if (var7 > 0) {
				var11 = arg2;
			}
			int[] var12 = this.imageMinimap.pixels;
			int var13 = arg0 * 4 + 24624 + (103 - arg1) * 512 * 4;
			int var14 = var7 >> 14 & 0x7FFF;
			LocType var15 = LocType.get(var14);
			if (var15.mapscene == -1) {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}
				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 3 + 512] = var11;
						var12[var13 + 3 + 1024] = var11;
						var12[var13 + 3 + 1536] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			} else {
				Pix8 var16 = this.imageMapscene[var15.mapscene];
				if (var16 != null) {
					int var17 = (var15.width * 4 - var16.wi) / 2;
					int var18 = (var15.length * 4 - var16.hi) / 2;
					var16.plotSprite(arg0 * 4 + 48 + var17, (104 - arg1 - var15.length) * 4 + 48 + var18);
				}
			}
		}
		int var19 = this.scene.getLocTypecode(arg3, arg0, arg1);
		if (var19 != 0) {
			int var21 = this.scene.getInfo(arg3, arg0, arg1, var19);
			int var22 = var21 >> 6 & 0x3;
			int var23 = var21 & 0x1F;
			int var24 = var19 >> 14 & 0x7FFF;
			LocType var25 = LocType.get(var24);
			if (var25.mapscene != -1) {
				Pix8 var26 = this.imageMapscene[var25.mapscene];
				if (var26 != null) {
					int var27 = (var25.width * 4 - var26.wi) / 2;
					int var28 = (var25.length * 4 - var26.hi) / 2;
					var26.plotSprite(arg0 * 4 + 48 + var27, (104 - arg1 - var25.length) * 4 + 48 + var28);
				}
			} else if (var23 == 9) {
				int var29 = 15658734;
				if (var19 > 0) {
					var29 = 15597568;
				}
				int[] var30 = this.imageMinimap.pixels;
				int var31 = arg0 * 4 + 24624 + (103 - arg1) * 512 * 4;
				if (var22 == 0 || var22 == 2) {
					var30[var31 + 1536] = var29;
					var30[var31 + 1024 + 1] = var29;
					var30[var31 + 512 + 2] = var29;
					var30[var31 + 3] = var29;
				} else {
					var30[var31] = var29;
					var30[var31 + 512 + 1] = var29;
					var30[var31 + 1024 + 2] = var29;
					var30[var31 + 1536 + 3] = var29;
				}
			}
		}
		int var32 = this.scene.getGroundDecorTypecode(arg3, arg0, arg1);
		if (var32 != 0) {
			int var33 = var32 >> 14 & 0x7FFF;
			LocType var34 = LocType.get(var33);
			if (var34.mapscene != -1) {
				Pix8 var35 = this.imageMapscene[var34.mapscene];
				if (var35 != null) {
					int var36 = (var34.width * 4 - var35.wi) / 2;
					int var37 = (var34.length * 4 - var35.hi) / 2;
					var35.plotSprite(arg0 * 4 + 48 + var36, (104 - arg1 - var34.length) * 4 + 48 + var37);
				}
			}
		}
	}

	@ObfuscatedName("client.a(BIIII)Z")
	public boolean interactWithLoc(int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1 >> 14 & 0x7FFF;
		int var7 = this.scene.getInfo(this.currentLevel, arg3, arg4, arg1);
		if (var7 == -1) {
			return false;
		}
		int var8 = var7 & 0x1F;
		int var9 = var7 >> 6 & 0x3;
		if (var8 == 10 || var8 == 11 || var8 == 22) {
			LocType var10 = LocType.get(var6);
			int var11;
			int var12;
			if (var9 == 0 || var9 == 2) {
				var11 = var10.width;
				var12 = var10.length;
			} else {
				var11 = var10.length;
				var12 = var10.width;
			}
			int var13 = var10.forceapproach;
			if (var9 != 0) {
				var13 = (var13 << var9 & 0xF) + (var13 >> 4 - var9);
			}
			this.tryMove(0, var12, 2, 0, localPlayer.routeTileZ[0], var11, var13, arg3, false, arg4, localPlayer.routeTileX[0]);
		} else {
			this.tryMove(var8 + 1, 0, 2, var9, localPlayer.routeTileZ[0], 0, 0, arg3, false, arg4, localPlayer.routeTileX[0]);
		}
		this.crossX = super.mouseClickX;
		this.crossY = super.mouseClickY;
		this.crossMode = 2;
		this.crossCycle = 0;
		this.out.pIsaac(arg2);
		this.out.p2(arg3 + this.sceneBaseTileX);
		this.out.p2(arg4 + this.sceneBaseTileZ);
		this.out.p2(var6);
		return true;
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public boolean tryMove(int arg0, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var16 = 0; var16 < var14; var16++) {
				this.bfsDirection[var15][var16] = 0;
				this.bfsCost[var15][var16] = 99999999;
			}
		}
		int var17 = arg11;
		int var18 = arg5;
		this.bfsDirection[arg11][arg5] = 99;
		this.bfsCost[arg11][arg5] = 0;
		byte var19 = 0;
		int var20 = 0;
		this.bfsStepX[var19] = arg11;
		int var36 = var19 + 1;
		this.bfsStepZ[var19] = arg5;
		boolean var21 = false;
		int var22 = this.bfsStepX.length;
		int[][] var23 = this.levelCollisionMap[this.currentLevel].flags;
		while (var20 != var36) {
			var17 = this.bfsStepX[var20];
			var18 = this.bfsStepZ[var20];
			var20 = (var20 + 1) % var22;
			if (var17 == arg8 && var18 == arg10) {
				var21 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && this.levelCollisionMap[this.currentLevel].testWall(arg0 - 1, var17, arg8, arg4, var18, arg10)) {
					var21 = true;
					break;
				}
				if (arg0 < 10 && this.levelCollisionMap[this.currentLevel].testWDecor(var17, var18, arg0 - 1, arg4, arg8, arg10)) {
					var21 = true;
					break;
				}
			}
			if (arg6 != 0 && arg2 != 0 && this.levelCollisionMap[this.currentLevel].testLoc(arg2, arg7, var18, arg10, arg6, var17, arg8)) {
				var21 = true;
				break;
			}
			int var24 = this.bfsCost[var17][var18] + 1;
			if (var17 > 0 && this.bfsDirection[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 0x280108) == 0) {
				this.bfsStepX[var36] = var17 - 1;
				this.bfsStepZ[var36] = var18;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 - 1][var18] = 2;
				this.bfsCost[var17 - 1][var18] = var24;
			}
			if (var17 < var13 - 1 && this.bfsDirection[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 0x280180) == 0) {
				this.bfsStepX[var36] = var17 + 1;
				this.bfsStepZ[var36] = var18;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 + 1][var18] = 8;
				this.bfsCost[var17 + 1][var18] = var24;
			}
			if (var18 > 0 && this.bfsDirection[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var17;
				this.bfsStepZ[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17][var18 - 1] = 1;
				this.bfsCost[var17][var18 - 1] = var24;
			}
			if (var18 < var14 - 1 && this.bfsDirection[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var17;
				this.bfsStepZ[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17][var18 + 1] = 4;
				this.bfsCost[var17][var18 + 1] = var24;
			}
			if (var17 > 0 && var18 > 0 && this.bfsDirection[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 0x28010E) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var17 - 1;
				this.bfsStepZ[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 - 1][var18 - 1] = 3;
				this.bfsCost[var17 - 1][var18 - 1] = var24;
			}
			if (var17 < var13 - 1 && var18 > 0 && this.bfsDirection[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 0x280183) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var17 + 1;
				this.bfsStepZ[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 + 1][var18 - 1] = 9;
				this.bfsCost[var17 + 1][var18 - 1] = var24;
			}
			if (var17 > 0 && var18 < var14 - 1 && this.bfsDirection[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 0x280138) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var17 - 1;
				this.bfsStepZ[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 - 1][var18 + 1] = 6;
				this.bfsCost[var17 - 1][var18 + 1] = var24;
			}
			if (var17 < var13 - 1 && var18 < var14 - 1 && this.bfsDirection[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 0x2801E0) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var17 + 1;
				this.bfsStepZ[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.bfsDirection[var17 + 1][var18 + 1] = 12;
				this.bfsCost[var17 + 1][var18 + 1] = var24;
			}
		}
		this.tryMoveNearest = 0;
		if (!var21) {
			if (arg9) {
				int var25 = 100;
				for (int var26 = 1; var26 < 2; var26++) {
					for (int var27 = arg8 - var26; var27 <= arg8 + var26; var27++) {
						for (int var28 = arg10 - var26; var28 <= arg10 + var26; var28++) {
							if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && this.bfsCost[var27][var28] < var25) {
								var25 = this.bfsCost[var27][var28];
								var17 = var27;
								var18 = var28;
								this.tryMoveNearest = 1;
								var21 = true;
							}
						}
					}
					if (var21) {
						break;
					}
				}
			}
			if (!var21) {
				return false;
			}
		}
		byte var29 = 0;
		this.bfsStepX[var29] = var17;
		int var37 = var29 + 1;
		this.bfsStepZ[var29] = var18;
		int var30;
		int var31 = var30 = this.bfsDirection[var17][var18];
		while (var17 != arg11 || var18 != arg5) {
			if (var31 != var30) {
				var30 = var31;
				this.bfsStepX[var37] = var17;
				this.bfsStepZ[var37++] = var18;
			}
			if ((var31 & 0x2) != 0) {
				var17++;
			} else if ((var31 & 0x8) != 0) {
				var17--;
			}
			if ((var31 & 0x1) != 0) {
				var18++;
			} else if ((var31 & 0x4) != 0) {
				var18--;
			}
			var31 = this.bfsDirection[var17][var18];
		}
		if (var37 > 0) {
			int var32 = var37;
			if (var37 > 25) {
				var32 = 25;
			}
			var37--;
			int var33 = this.bfsStepX[var37];
			int var34 = this.bfsStepZ[var37];
			if (arg3 == 0) {
				// MOVE_GAMECLICK
				this.out.pIsaac(182);
				this.out.p1(var32 + var32 + 3);
			}
			if (arg3 == 1) {
				// MOVE_MINIMAPCLICK
				this.out.pIsaac(198);
				this.out.p1(var32 + var32 + 3 + 14);
			}
			if (arg3 == 2) {
				// MOVE_OPCLICK
				this.out.pIsaac(216);
				this.out.p1(var32 + var32 + 3);
			}
			if (super.actionKey[5] == 1) {
				this.out.p1(1);
			} else {
				this.out.p1(0);
			}
			this.out.p2(var33 + this.sceneBaseTileX);
			this.out.p2(var34 + this.sceneBaseTileZ);
			this.flagSceneTileX = this.bfsStepX[0];
			this.flagSceneTileZ = this.bfsStepZ[0];
			for (int var35 = 1; var35 < var32; var35++) {
				var37--;
				this.out.p1(this.bfsStepX[var37] - var33);
				this.out.p1(this.bfsStepZ[var37] - var34);
			}
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.b(B)Z")
	public boolean readPacket() {
		if (this.stream == null) {
			return false;
		}
		try {
			int var2 = this.stream.available();
			if (var2 == 0) {
				return false;
			}
			if (this.ptype == -1) {
				this.stream.read(this.in.data, 0, 1);
				this.ptype = this.in.data[0] & 0xFF;
				if (this.randomIn != null) {
					this.ptype = this.ptype - this.randomIn.nextInt() & 0xFF;
				}
				this.psize = Protocol.SERVERPROT_LENGTH[this.ptype];
				var2--;
			}
			if (this.psize == -1) {
				if (var2 <= 0) {
					return false;
				}
				this.stream.read(this.in.data, 0, 1);
				this.psize = this.in.data[0] & 0xFF;
				var2--;
			}
			if (this.psize == -2) {
				if (var2 <= 1) {
					return false;
				}
				this.stream.read(this.in.data, 0, 2);
				this.in.pos = 0;
				this.psize = this.in.g2();
				var2 -= 2;
			}
			if (var2 < this.psize) {
				return false;
			}
			this.in.pos = 0;
			this.stream.read(this.in.data, 0, this.psize);
			this.idleNetCycles = 0;
			this.ptype2 = this.ptype1;
			this.ptype1 = this.ptype0;
			this.ptype0 = this.ptype;
			if (this.ptype == 203) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 69) {
				// IF_SETANIM
				int var3 = this.in.g2();
				int var4 = this.in.g2();
				Component.types[var3].anim = var4;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 236) {
				// IF_OPENSIDE
				int var5 = this.in.g2();
				this.resetInterfaceAnimation(var5);
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.sidebarInterfaceId = var5;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 177) {
				// IF_OPENMAIN
				int var6 = this.in.g2();
				this.resetInterfaceAnimation(var6);
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = var6;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 165) {
				// FINISH_TRACKING
				Packet var7 = InputTracking.stop();
				if (var7 != null) {
					// EVENT_TRACKING
					this.out.pIsaac(19);
					this.out.p2(var7.pos);
					this.out.pdata(var7.data, var7.pos, 0);
					var7.release();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 60) {
				// IF_SETMODEL
				int var8 = this.in.g2();
				int var9 = this.in.g2();
				Component.types[var8].modelType = 1;
				Component.types[var8].model = var9;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 105) {
				// NPC_INFO
				this.getNpcPos(this.psize, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 15) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();
				while (this.in.pos < this.psize) {
					int var10 = this.in.g1();
					this.readZonePacket(this.in, var10);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 8) {
				// IF_SETTAB_ACTIVE
				this.selectedTab = this.in.g1();
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 152) {
				// TUT_OPEN
				int var11 = this.in.g2b();
				this.stickyChatInterfaceId = var11;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 207) {
				// MESSAGE_PRIVATE
				long var12 = this.in.g8();
				int var14 = this.in.g4();
				int var15 = this.in.g1();
				boolean var16 = false;
				for (int var17 = 0; var17 < 100; var17++) {
					if (this.messageIds[var17] == var14) {
						var16 = true;
						break;
					}
				}
				if (var15 <= 1) {
					for (int var18 = 0; var18 < this.ignoreCount; var18++) {
						if (this.ignoreName37[var18] == var12) {
							var16 = true;
							break;
						}
					}
				}
				if (!var16 && this.overrideChat == 0) {
					try {
						this.messageIds[this.privateMessageCount] = var14;
						this.privateMessageCount = (this.privateMessageCount + 1) % 100;
						String var19 = WordPack.unpack(this.psize - 13, this.in);
						String var20 = WordFilter.filter(var19);
						if (var15 == 2 || var15 == 3) {
							this.addMessage("@cr2@" + JString.formatDisplayName(JString.fromBase37(var12)), 7, var20);
						} else if (var15 == 1) {
							this.addMessage("@cr1@" + JString.formatDisplayName(JString.fromBase37(var12)), 7, var20);
						} else {
							this.addMessage(JString.formatDisplayName(JString.fromBase37(var12)), 3, var20);
						}
					} catch (Exception var155) {
						signlink.reporterror("cde1");
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 175) {
				// MESSAGE_GAME
				String var22 = this.in.gjstr();
				if (var22.endsWith(":tradereq:")) {
					String var23 = var22.substring(0, var22.indexOf(":"));
					long var24 = JString.toBase37(var23);
					boolean var26 = false;
					for (int var27 = 0; var27 < this.ignoreCount; var27++) {
						if (this.ignoreName37[var27] == var24) {
							var26 = true;
							break;
						}
					}
					if (!var26 && this.overrideChat == 0) {
						this.addMessage(var23, 4, "wishes to trade with you.");
					}
				} else if (var22.endsWith(":duelreq:")) {
					String var28 = var22.substring(0, var22.indexOf(":"));
					long var29 = JString.toBase37(var28);
					boolean var31 = false;
					for (int var32 = 0; var32 < this.ignoreCount; var32++) {
						if (this.ignoreName37[var32] == var29) {
							var31 = true;
							break;
						}
					}
					if (!var31 && this.overrideChat == 0) {
						this.addMessage(var28, 8, "wishes to duel with you.");
					}
				} else {
					this.addMessage("", 0, var22);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 181) {
				// UPDATE_IGNORELIST
				this.ignoreCount = this.psize / 8;
				for (int var33 = 0; var33 < this.ignoreCount; var33++) {
					this.ignoreName37[var33] = this.in.g8();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 229) {
				// IF_OPENMAIN_SIDE
				int var34 = this.in.g2();
				int var35 = this.in.g2();
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = var34;
				this.sidebarInterfaceId = var35;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 238) {
				// LAST_LOGIN_INFO
				this.lastAddress = this.in.g4();
				this.daysSinceLogin = this.in.g2();
				this.daysSinceRecoveriesChanged = this.in.g1();
				this.unreadMessageCount = this.in.g2();
				this.warnMembersInNonMembers = this.in.g1();
				if (this.lastAddress != 0 && this.viewportInterfaceId == -1) {
					signlink.dnslookup(JString.formatIPv4(this.lastAddress));
					this.closeInterfaces();
					short var36 = 650;
					if (this.daysSinceRecoveriesChanged != 201 || this.warnMembersInNonMembers == 1) {
						var36 = 655;
					}
					this.reportAbuseInput = "";
					this.reportAbuseMuteOption = false;
					for (int var37 = 0; var37 < Component.types.length; var37++) {
						if (Component.types[var37] != null && Component.types[var37].clientCode == var36) {
							this.viewportInterfaceId = Component.types[var37].layer;
							break;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 161) {
				// PLAYER_INFO
				this.getPlayerPos(this.psize, this.in);
				this.awaitingSync = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 243) {
				// HINT_ARROW
				this.hintType = this.in.g1();
				if (this.hintType == 1) {
					this.hintNpc = this.in.g2();
				}
				if (this.hintType >= 2 && this.hintType <= 6) {
					if (this.hintType == 2) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 3) {
						this.hintOffsetX = 0;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 4) {
						this.hintOffsetX = 128;
						this.hintOffsetZ = 64;
					}
					if (this.hintType == 5) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 0;
					}
					if (this.hintType == 6) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 128;
					}
					this.hintType = 2;
					this.hintTileX = this.in.g2();
					this.hintTileZ = this.in.g2();
					this.hintHeight = this.in.g1();
				}
				if (this.hintType == 10) {
					this.hintPlayer = this.in.g2();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 135) {
				// IF_SETCOLOUR
				int var38 = this.in.g2();
				int var39 = this.in.g2();
				int var40 = var39 >> 10 & 0x1F;
				int var41 = var39 >> 5 & 0x1F;
				int var42 = var39 & 0x1F;
				Component.types[var38].colour = (var40 << 19) + (var41 << 11) + (var42 << 3);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 56) {
				// P_COUNTDIALOG
				this.showSocialInput = false;
				this.chatbackInputOpen = true;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 7) {
				// IF_OPENCHAT
				int var43 = this.in.g2();
				this.resetInterfaceAnimation(var43);
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				this.chatInterfaceId = var43;
				this.redrawChatback = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 151 || this.ptype == 188 || this.ptype == 190 || this.ptype == 141 || this.ptype == 187 || this.ptype == 13 || this.ptype == 94 || this.ptype == 71 || this.ptype == 198 || this.ptype == 119) {
				this.readZonePacket(this.in, this.ptype);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 96) {
				// MIDI_SONG
				int var44 = this.in.g2();
				if (var44 == 65535) {
					var44 = -1;
				}
				if (var44 != this.nextMidiSong && this.midiActive && !lowMem) {
					this.midiSong = var44;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				}
				this.nextMidiSong = var44;
				this.nextMusicDelay = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 39) {
				// MIDI_JINGLE
				int var45 = this.in.g2();
				int var46 = this.in.g2();
				if (this.midiActive && !lowMem) {
					this.midiSong = var45;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
					this.nextMusicDelay = var46;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 225) {
				// IF_SETHIDE
				int var47 = this.in.g2();
				boolean var48 = this.in.g1() == 1;
				Component.types[var47].hide = var48;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 143) {
				// UPDATE_INV_STOP_TRANSMIT
				int var49 = this.in.g2();
				Component var50 = Component.types[var49];
				for (int var51 = 0; var51 < var50.invSlotObjId.length; var51++) {
					var50.invSlotObjId[var51] = -1;
					var50.invSlotObjId[var51] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 26) {
				// UPDATE_REBOOT_TIMER
				this.systemUpdateTimer = this.in.g2() * 30;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 209) {
				// SYNTH_SOUND
				int var52 = this.in.g2();
				int var53 = this.in.g1();
				int var54 = this.in.g2();
				if (this.waveEnabled && !lowMem && this.waveCount < 50) {
					this.waveIds[this.waveCount] = var52;
					this.waveLoops[this.waveCount] = var53;
					this.waveDelay[this.waveCount] = var54 + Wave.delay[var52];
					this.waveCount++;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 109) {
				// UPDATE_FRIENDLIST
				long var55 = this.in.g8();
				int var57 = this.in.g1();
				String var58 = JString.formatDisplayName(JString.fromBase37(var55));
				for (int var59 = 0; var59 < this.friendCount; var59++) {
					if (var55 == this.friendName37[var59]) {
						if (this.friendWorld[var59] != var57) {
							this.friendWorld[var59] = var57;
							this.redrawSidebar = true;
							if (var57 > 0) {
								this.addMessage("", 5, var58 + " has logged in.");
							}
							if (var57 == 0) {
								this.addMessage("", 5, var58 + " has logged out.");
							}
						}
						var58 = null;
						break;
					}
				}
				if (var58 != null && this.friendCount < 200) {
					this.friendName37[this.friendCount] = var55;
					this.friendName[this.friendCount] = var58;
					this.friendWorld[this.friendCount] = var57;
					this.friendCount++;
					this.redrawSidebar = true;
				}
				boolean var60 = false;
				while (!var60) {
					var60 = true;
					for (int var61 = 0; var61 < this.friendCount - 1; var61++) {
						if (this.friendWorld[var61] != nodeId && this.friendWorld[var61 + 1] == nodeId || this.friendWorld[var61] == 0 && this.friendWorld[var61 + 1] != 0) {
							int var62 = this.friendWorld[var61];
							this.friendWorld[var61] = this.friendWorld[var61 + 1];
							this.friendWorld[var61 + 1] = var62;
							String var63 = this.friendName[var61];
							this.friendName[var61] = this.friendName[var61 + 1];
							this.friendName[var61 + 1] = var63;
							long var64 = this.friendName37[var61];
							this.friendName37[var61] = this.friendName37[var61 + 1];
							this.friendName37[var61 + 1] = var64;
							this.redrawSidebar = true;
							var60 = false;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 2) {
				// CHAT_FILTER_SETTINGS
				this.chatPublicMode = this.in.g1();
				this.chatPrivateMode = this.in.g1();
				this.chatTradeMode = this.in.g1();
				this.redrawPrivacySettings = true;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 36) {
				// LOGOUT
				this.logout();
				this.ptype = -1;
				return false;
			}
			if (this.ptype == 28) {
				// ENABLE_TRACKING
				InputTracking.setEnabled();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 174) {
				// IF_CLOSE
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 29) {
				// IF_SETTAB
				int var66 = this.in.g2();
				int var67 = this.in.g1();
				if (var66 == 65535) {
					var66 = -1;
				}
				this.tabInterfaceId[var67] = var66;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 132) {
				// TUT_FLASH
				this.flashingTab = this.in.g1();
				if (this.flashingTab == this.selectedTab) {
					if (this.flashingTab == 3) {
						this.selectedTab = 1;
					} else {
						this.selectedTab = 3;
					}
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 25) {
				// RESET_CLIENT_VARCACHE
				for (int var68 = 0; var68 < this.varps.length; var68++) {
					if (this.varps[var68] != this.varCache[var68]) {
						this.varps[var68] = this.varCache[var68];
						this.updateVarp(var68);
						this.redrawSidebar = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 156) {
				// UPDATE_INV_FULL
				this.redrawSidebar = true;
				int var69 = this.in.g2();
				Component var70 = Component.types[var69];
				int var71 = this.in.g1();
				for (int var72 = 0; var72 < var71; var72++) {
					var70.invSlotObjId[var72] = this.in.g2();
					int var73 = this.in.g1();
					if (var73 == 255) {
						var73 = this.in.g4();
					}
					var70.invSlotObjCount[var72] = var73;
				}
				for (int var74 = var71; var74 < var70.invSlotObjId.length; var74++) {
					var70.invSlotObjId[var74] = 0;
					var70.invSlotObjCount[var74] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 32) {
				// IF_SETTEXT
				int var75 = this.in.g2();
				String var76 = this.in.gjstr();
				Component.types[var75].text = var76;
				if (Component.types[var75].layer == this.tabInterfaceId[this.selectedTab]) {
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 140) {
				// UPDATE_ZONE_FULL_FOLLOWS
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();
				for (int var77 = this.baseX; var77 < this.baseX + 8; var77++) {
					for (int var78 = this.baseZ; var78 < this.baseZ + 8; var78++) {
						if (this.objStacks[this.currentLevel][var77][var78] != null) {
							this.objStacks[this.currentLevel][var77][var78] = null;
							this.sortObjStacks(var77, var78);
						}
					}
				}
				for (LocChange var79 = (LocChange) this.locChanges.head(); var79 != null; var79 = (LocChange) this.locChanges.next()) {
					if (var79.x >= this.baseX && var79.x < this.baseX + 8 && var79.z >= this.baseZ && var79.z < this.baseZ + 8 && var79.level == this.currentLevel) {
						var79.endTime = 0;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 76) {
				// IF_SETNPCHEAD
				int var80 = this.in.g2();
				int var81 = this.in.g2();
				Component.types[var80].modelType = 2;
				Component.types[var80].model = var81;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 75) {
				// VARP_LARGE
				int var82 = this.in.g2();
				int var83 = this.in.g4();
				this.varCache[var82] = var83;
				if (this.varps[var82] != var83) {
					this.varps[var82] = var83;
					this.updateVarp(var82);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 134) {
				// CAM_RESET
				this.cutscene = false;
				for (int var84 = 0; var84 < 5; var84++) {
					this.cameraModifierEnabled[var84] = false;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 226) {
				// IF_SETSCROLLPOS
				int var85 = this.in.g2();
				int var86 = this.in.g2();
				Component var87 = Component.types[var85];
				if (var87 != null && var87.type == 0) {
					if (var86 < 0) {
						var86 = 0;
					}
					if (var86 > var87.scroll - var87.height) {
						var86 = var87.scroll - var87.height;
					}
					var87.scrollPosition = var86;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 103) {
				// CAM_SHAKE
				int var88 = this.in.g1();
				int var89 = this.in.g1();
				int var90 = this.in.g1();
				int var91 = this.in.g1();
				this.cameraModifierEnabled[var88] = true;
				this.cameraModifierJitter[var88] = var89;
				this.cameraModifierWobbleScale[var88] = var90;
				this.cameraModifierWobbleSpeed[var88] = var91;
				this.cameraModifierCycle[var88] = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 123) {
				// CAM_LOOKAT
				this.cutscene = true;
				this.cutsceneDstLocalTileX = this.in.g1();
				this.cutsceneDstLocalTileZ = this.in.g1();
				this.cutsceneDstHeight = this.in.g2();
				this.cutsceneRotateSpeed = this.in.g1();
				this.cutsceneRotateAcceleration = this.in.g1();
				if (this.cutsceneRotateAcceleration >= 100) {
					int var92 = this.cutsceneDstLocalTileX * 128 + 64;
					int var93 = this.cutsceneDstLocalTileZ * 128 + 64;
					int var94 = this.getHeightmapY(var93, this.currentLevel, var92) - this.cutsceneDstHeight;
					int var95 = var92 - this.cameraX;
					int var96 = var94 - this.cameraY;
					int var97 = var93 - this.cameraZ;
					int var98 = (int) Math.sqrt((double) (var95 * var95 + var97 * var97));
					this.cameraPitch = (int) (Math.atan2((double) var96, (double) var98) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2((double) var95, (double) var97) * -325.949D) & 0x7FF;
					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					}
					if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 95) {
				// UPDATE_INV_PARTIAL
				this.redrawSidebar = true;
				int var99 = this.in.g2();
				Component var100 = Component.types[var99];
				while (this.in.pos < this.psize) {
					int var101 = this.in.g1();
					int var102 = this.in.g2();
					int var103 = this.in.g1();
					if (var103 == 255) {
						var103 = this.in.g4();
					}
					if (var101 >= 0 && var101 < var100.invSlotObjId.length) {
						var100.invSlotObjId[var101] = var102;
						var100.invSlotObjCount[var101] = var103;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 110) {
				// UPDATE_STAT
				this.redrawSidebar = true;
				int var104 = this.in.g1();
				int var105 = this.in.g4();
				int var106 = this.in.g1();
				this.skillExperience[var104] = var105;
				this.skillLevel[var104] = var106;
				this.skillBaseLevel[var104] = 1;
				for (int var107 = 0; var107 < 98; var107++) {
					if (var105 >= levelExperience[var107]) {
						this.skillBaseLevel[var104] = var107 + 2;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 66) {
				// REBUILD_NORMAL
				int var108 = this.in.g2();
				int var109 = this.in.g2();
				if (this.sceneCenterZoneX == var108 && this.sceneCenterZoneZ == var109 && this.sceneState == 2) {
					this.ptype = -1;
					return true;
				}
				this.sceneCenterZoneX = var108;
				this.sceneCenterZoneZ = var109;
				this.sceneBaseTileX = (this.sceneCenterZoneX - 6) * 8;
				this.sceneBaseTileZ = (this.sceneCenterZoneZ - 6) * 8;
				this.withinTutorialIsland = false;
				if ((this.sceneCenterZoneX / 8 == 48 || this.sceneCenterZoneX / 8 == 49) && this.sceneCenterZoneZ / 8 == 48) {
					this.withinTutorialIsland = true;
				}
				if (this.sceneCenterZoneX / 8 == 48 && this.sceneCenterZoneZ / 8 == 148) {
					this.withinTutorialIsland = true;
				}
				this.sceneState = 1;
				this.sceneLoadStartTime = System.currentTimeMillis();
				this.areaViewport.bind();
				this.fontPlain12.centreString(0, 257, 151, "Loading - please wait.");
				this.fontPlain12.centreString(16777215, 256, 150, "Loading - please wait.");
				this.areaViewport.draw(4, super.graphics, 4);
				int var110 = 0;
				for (int var111 = (this.sceneCenterZoneX - 6) / 8; var111 <= (this.sceneCenterZoneX + 6) / 8; var111++) {
					for (int var112 = (this.sceneCenterZoneZ - 6) / 8; var112 <= (this.sceneCenterZoneZ + 6) / 8; var112++) {
						var110++;
					}
				}
				this.sceneMapLandData = new byte[var110][];
				this.sceneMapLocData = new byte[var110][];
				this.sceneMapIndex = new int[var110];
				this.sceneMapLandFile = new int[var110];
				this.sceneMapLocFile = new int[var110];
				int var113 = 0;
				for (int var114 = (this.sceneCenterZoneX - 6) / 8; var114 <= (this.sceneCenterZoneX + 6) / 8; var114++) {
					for (int var115 = (this.sceneCenterZoneZ - 6) / 8; var115 <= (this.sceneCenterZoneZ + 6) / 8; var115++) {
						this.sceneMapIndex[var113] = (var114 << 8) + var115;
						if (this.withinTutorialIsland && (var115 == 49 || var115 == 149 || var115 == 147 || var114 == 50 || var114 == 49 && var115 == 47)) {
							this.sceneMapLandFile[var113] = -1;
							this.sceneMapLocFile[var113] = -1;
							var113++;
						} else {
							int var116 = this.sceneMapLandFile[var113] = this.onDemand.getMapFile(0, var114, var115);
							if (var116 != -1) {
								this.onDemand.request(3, var116);
							}
							int var117 = this.sceneMapLocFile[var113] = this.onDemand.getMapFile(1, var114, var115);
							if (var117 != -1) {
								this.onDemand.request(3, var117);
							}
							var113++;
						}
					}
				}
				int var118 = this.sceneBaseTileX - this.mapLastBaseX;
				int var119 = this.sceneBaseTileZ - this.mapLastBaseZ;
				this.mapLastBaseX = this.sceneBaseTileX;
				this.mapLastBaseZ = this.sceneBaseTileZ;
				for (int var120 = 0; var120 < 8192; var120++) {
					ClientNpc var121 = this.npcs[var120];
					if (var121 != null) {
						for (int var122 = 0; var122 < 10; var122++) {
							var121.routeTileX[var122] -= var118;
							var121.routeTileZ[var122] -= var119;
						}
						var121.x -= var118 * 128;
						var121.z -= var119 * 128;
					}
				}
				for (int var123 = 0; var123 < this.MAX_PLAYER_COUNT; var123++) {
					ClientPlayer var124 = this.players[var123];
					if (var124 != null) {
						for (int var125 = 0; var125 < 10; var125++) {
							var124.routeTileX[var125] -= var118;
							var124.routeTileZ[var125] -= var119;
						}
						var124.x -= var118 * 128;
						var124.z -= var119 * 128;
					}
				}
				this.awaitingSync = true;
				byte var126 = 0;
				byte var127 = 104;
				byte var128 = 1;
				if (var118 < 0) {
					var126 = 103;
					var127 = -1;
					var128 = -1;
				}
				byte var129 = 0;
				byte var130 = 104;
				byte var131 = 1;
				if (var119 < 0) {
					var129 = 103;
					var130 = -1;
					var131 = -1;
				}
				for (int var132 = var126; var132 != var127; var132 += var128) {
					for (int var133 = var129; var133 != var130; var133 += var131) {
						int var134 = var132 + var118;
						int var135 = var133 + var119;
						for (int var136 = 0; var136 < 4; var136++) {
							if (var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104) {
								this.objStacks[var136][var132][var133] = this.objStacks[var136][var134][var135];
							} else {
								this.objStacks[var136][var132][var133] = null;
							}
						}
					}
				}
				for (LocChange var137 = (LocChange) this.locChanges.head(); var137 != null; var137 = (LocChange) this.locChanges.next()) {
					var137.x -= var118;
					var137.z -= var119;
					if (var137.x < 0 || var137.z < 0 || var137.x >= 104 || var137.z >= 104) {
						var137.unlink();
					}
				}
				if (this.flagSceneTileX != 0) {
					this.flagSceneTileX -= var118;
					this.flagSceneTileZ -= var119;
				}
				this.cutscene = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 115) {
				// IF_OPENOVERLAY
				int var138 = this.in.g2b();
				this.viewportOverlayInterfaceId = var138;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 144) {
				// RESET_ANIMS
				for (int var139 = 0; var139 < this.players.length; var139++) {
					if (this.players[var139] != null) {
						this.players[var139].primarySeqId = -1;
					}
				}
				for (int var140 = 0; var140 < this.npcs.length; var140++) {
					if (this.npcs[var140] != null) {
						this.npcs[var140].primarySeqId = -1;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 108) {
				this.field1504 = 255;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 35) {
				// SET_MULTIWAY
				this.inMultizone = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 70) {
				// UPDATE_RUNWEIGHT
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runweight = this.in.g2b();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 83) {
				// IF_SETPLAYERHEAD
				int var141 = this.in.g2();
				Component.types[var141].modelType = 3;
				Component.types[var141].model = (localPlayer.colour[0] << 24) + (localPlayer.colour[4] << 18) + (localPlayer.appearance[0] << 12) + (localPlayer.appearance[8] << 6) + localPlayer.appearance[11];
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 153) {
				// IF_SETOBJECT
				int var142 = this.in.g2();
				int var143 = this.in.g2();
				int var144 = this.in.g2();
				ObjType var145 = ObjType.get(var143);
				Component.types[var142].modelType = 4;
				Component.types[var142].model = var143;
				Component.types[var142].xan = var145.xan2d;
				Component.types[var142].yan = var145.yan2d;
				Component.types[var142].zoom = var145.zoom2d * 100 / var144;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 86) {
				// CAM_MOVETO
				this.cutscene = true;
				this.cutsceneSrcLocalTileX = this.in.g1();
				this.cutsceneSrcLocalTileZ = this.in.g1();
				this.cutsceneSrcHeight = this.in.g2();
				this.cutsceneMoveSpeed = this.in.g1();
				this.cutsceneMoveAcceleration = this.in.g1();
				if (this.cutsceneMoveAcceleration >= 100) {
					this.cameraX = this.cutsceneSrcLocalTileX * 128 + 64;
					this.cameraZ = this.cutsceneSrcLocalTileZ * 128 + 64;
					this.cameraY = this.getHeightmapY(this.cameraZ, this.currentLevel, this.cameraX) - this.cutsceneSrcHeight;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 230) {
				// IF_SETPOSITION
				int var146 = this.in.g2();
				int var147 = this.in.g2b();
				int var148 = this.in.g2b();
				Component var149 = Component.types[var146];
				var149.x = var147;
				var149.y = var148;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 233) {
				// UNSET_MAP_FLAG
				this.flagSceneTileX = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 208) {
				// UPDATE_RUNENERGY
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runenergy = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 49) {
				// UPDATE_PID
				this.localPid = this.in.g2();
				this.membersAccount = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 192) {
				// VARP_SMALL
				int var150 = this.in.g2();
				byte var151 = this.in.g1b();
				this.varCache[var150] = var151;
				if (this.varps[var150] != var151) {
					this.varps[var150] = var151;
					this.updateVarp(var150);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
			this.logout();
		} catch (IOException var156) {
			this.tryReconnect();
		} catch (Exception var157) {
			String var153 = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (this.sceneBaseTileX + localPlayer.routeTileX[0]) + "," + (this.sceneBaseTileZ + localPlayer.routeTileZ[0]) + " - ";
			for (int var154 = 0; var154 < this.psize && var154 < 50; var154++) {
				var153 = var153 + this.in.data[var154] + ",";
			}
			signlink.reporterror(var153);
			this.logout();
		}
		return true;
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public void readZonePacket(Packet buf, int arg2) {
		if (arg2 == 119 || arg2 == 198) {
			// LOC_ADD_CHANGE || LOC_DEL
			int var4 = buf.g1();
			int var5 = this.baseX + (var4 >> 4 & 0x7);
			int var6 = this.baseZ + (var4 & 0x7);
			int var7 = buf.g1();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = this.LOC_SHAPE_TO_LAYER[var8];
			int var11;
			if (arg2 == 198) {
				var11 = -1;
			} else {
				var11 = buf.g2();
			}
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				this.appendLoc(var11, var10, this.currentLevel, var9, var6, 0, -1, var5, var8);
			}
		} else if (arg2 == 71) {
			// LOC_ANIM
			int var12 = buf.g1();
			int var13 = this.baseX + (var12 >> 4 & 0x7);
			int var14 = this.baseZ + (var12 & 0x7);
			int var15 = buf.g1();
			int var16 = var15 >> 2;
			int var17 = var15 & 0x3;
			int var18 = this.LOC_SHAPE_TO_LAYER[var16];
			int var19 = buf.g2();
			if (var13 >= 0 && var14 >= 0 && var13 < 103 && var14 < 103) {
				int var20 = this.levelHeightmap[this.currentLevel][var13][var14];
				int var21 = this.levelHeightmap[this.currentLevel][var13 + 1][var14];
				int var22 = this.levelHeightmap[this.currentLevel][var13 + 1][var14 + 1];
				int var23 = this.levelHeightmap[this.currentLevel][var13][var14 + 1];
				if (var18 == 0) {
					Wall var24 = this.scene.getWall(var14, this.currentLevel, var13);
					if (var24 != null) {
						int var25 = var24.typecode1 >> 14 & 0x7FFF;
						if (var16 == 2) {
							var24.model1 = new ClientLocAnim(var22, var25, false, var20, var23, 2, var17 + 4, var21, var19);
							var24.model2 = new ClientLocAnim(var22, var25, false, var20, var23, 2, var17 + 1 & 0x3, var21, var19);
						} else {
							var24.model1 = new ClientLocAnim(var22, var25, false, var20, var23, var16, var17, var21, var19);
						}
					}
				}
				if (var18 == 1) {
					Decor var26 = this.scene.getDecor(var14, this.currentLevel, var13);
					if (var26 != null) {
						var26.model = new ClientLocAnim(var22, var26.typecode >> 14 & 0x7FFF, false, var20, var23, 4, 0, var21, var19);
					}
				}
				if (var18 == 2) {
					Sprite var27 = this.scene.getSprite(var14, var13, this.currentLevel);
					if (var16 == 11) {
						var16 = 10;
					}
					if (var27 != null) {
						var27.model = new ClientLocAnim(var22, var27.typecode >> 14 & 0x7FFF, false, var20, var23, var16, var17, var21, var19);
					}
				}
				if (var18 == 3) {
					GroundDecor var28 = this.scene.getGroundDecor(var14, this.currentLevel, var13);
					if (var28 != null) {
						var28.model = new ClientLocAnim(var22, var28.typecode >> 14 & 0x7FFF, false, var20, var23, 22, var17, var21, var19);
					}
				}
			}
		} else if (arg2 == 94) {
			// OBJ_ADD
			int var29 = buf.g1();
			int var30 = this.baseX + (var29 >> 4 & 0x7);
			int var31 = this.baseZ + (var29 & 0x7);
			int var32 = buf.g2();
			int var33 = buf.g2();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				ClientObj var34 = new ClientObj();
				var34.index = var32;
				var34.count = var33;
				if (this.objStacks[this.currentLevel][var30][var31] == null) {
					this.objStacks[this.currentLevel][var30][var31] = new LinkList();
				}
				this.objStacks[this.currentLevel][var30][var31].push(var34);
				this.sortObjStacks(var30, var31);
			}
		} else if (arg2 == 13) {
			// OBJ_DEL
			int var35 = buf.g1();
			int var36 = this.baseX + (var35 >> 4 & 0x7);
			int var37 = this.baseZ + (var35 & 0x7);
			int var38 = buf.g2();
			if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
				LinkList var39 = this.objStacks[this.currentLevel][var36][var37];
				if (var39 != null) {
					for (ClientObj var40 = (ClientObj) var39.head(); var40 != null; var40 = (ClientObj) var39.next()) {
						if (var40.index == (var38 & 0x7FFF)) {
							var40.unlink();
							break;
						}
					}
					if (var39.head() == null) {
						this.objStacks[this.currentLevel][var36][var37] = null;
					}
					this.sortObjStacks(var36, var37);
				}
			}
		} else if (arg2 == 187) {
			// MAP_PROJANIM
			int coord = buf.g1();
			int srcX = this.baseX + (coord >> 4 & 0x7);
			int srcZ = this.baseZ + (coord & 0x7);
			int dstX = srcX + buf.g1b();
			int dstZ = srcZ + buf.g1b();
			int target = buf.g2b();
			int graphic = buf.g2();
			int srcHeight = buf.g1();
			int dstHeight = buf.g1();
			int startCycle = buf.g2();
			int endCycle = buf.g2();
			int peak = buf.g1();
			int arc = buf.g1();

			if (srcX >= 0 && srcZ >= 0 && srcX < 104 && srcZ < 104 && dstX >= 0 && dstZ >= 0 && dstX < 104 && dstZ < 104) {
				int var54 = srcX * 128 + 64;
				int var55 = srcZ * 128 + 64;
				int var56 = dstX * 128 + 64;
				int var57 = dstZ * 128 + 64;

				ClientProj proj = new ClientProj(this.getHeightmapY(var55, this.currentLevel, var54) - srcHeight, arc, this.currentLevel, var55, endCycle + loopCycle, dstHeight, graphic, peak, target, var54, startCycle + loopCycle);
				proj.updateVelocity(var56, var57, startCycle + loopCycle, this.getHeightmapY(var57, this.currentLevel, var56) - dstHeight);
				this.projectiles.push(proj);
			}
		} else if (arg2 == 141) {
			// MAP_ANIM
			int var59 = buf.g1();
			int var60 = this.baseX + (var59 >> 4 & 0x7);
			int var61 = this.baseZ + (var59 & 0x7);
			int var62 = buf.g2();
			int var63 = buf.g1();
			int var64 = buf.g2();
			if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
				int var65 = var60 * 128 + 64;
				int var66 = var61 * 128 + 64;
				MapSpotAnim var67 = new MapSpotAnim(this.currentLevel, var64, var66, this.getHeightmapY(var66, this.currentLevel, var65) - var63, var62, var65, loopCycle);
				this.spotanims.push(var67);
			}
		} else if (arg2 == 190) {
			// OBJ_REVEAL
			int var68 = buf.g1();
			int var69 = this.baseX + (var68 >> 4 & 0x7);
			int var70 = this.baseZ + (var68 & 0x7);
			int var71 = buf.g2();
			int var72 = buf.g2();
			int var73 = buf.g2();
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var73 != this.localPid) {
				ClientObj var74 = new ClientObj();
				var74.index = var71;
				var74.count = var72;
				if (this.objStacks[this.currentLevel][var69][var70] == null) {
					this.objStacks[this.currentLevel][var69][var70] = new LinkList();
				}
				this.objStacks[this.currentLevel][var69][var70].push(var74);
				this.sortObjStacks(var69, var70);
			}
		} else if (arg2 == 188) {
			// LOC_MERGE
			int var75 = buf.g1();
			int var76 = this.baseX + (var75 >> 4 & 0x7);
			int var77 = this.baseZ + (var75 & 0x7);
			int var78 = buf.g1();
			int var79 = var78 >> 2;
			int var80 = var78 & 0x3;
			int var81 = this.LOC_SHAPE_TO_LAYER[var79];
			int var82 = buf.g2();
			int var83 = buf.g2();
			int var84 = buf.g2();
			int var85 = buf.g2();
			byte var86 = buf.g1b();
			byte var87 = buf.g1b();
			byte var88 = buf.g1b();
			byte var89 = buf.g1b();
			ClientPlayer var90;
			if (var85 == this.localPid) {
				var90 = localPlayer;
			} else {
				var90 = this.players[var85];
			}
			if (var90 != null) {
				LocType var91 = LocType.get(var82);
				int var92 = this.levelHeightmap[this.currentLevel][var76][var77];
				int var93 = this.levelHeightmap[this.currentLevel][var76 + 1][var77];
				int var94 = this.levelHeightmap[this.currentLevel][var76 + 1][var77 + 1];
				int var95 = this.levelHeightmap[this.currentLevel][var76][var77 + 1];
				Model var96 = var91.getModel(var79, var80, var92, var93, var94, var95, -1);
				if (var96 != null) {
					this.appendLoc(-1, var81, this.currentLevel, 0, var77, var83 + 1, var84 + 1, var76, 0);
					var90.locStartCycle = var83 + loopCycle;
					var90.locStopCycle = var84 + loopCycle;
					var90.locModel = var96;
					int var97 = var91.width;
					int var98 = var91.length;
					if (var80 == 1 || var80 == 3) {
						var97 = var91.length;
						var98 = var91.width;
					}
					var90.locOffsetX = var76 * 128 + var97 * 64;
					var90.locOffsetZ = var77 * 128 + var98 * 64;
					var90.locOffsetY = this.getHeightmapY(var90.locOffsetZ, this.currentLevel, var90.locOffsetX);
					if (var86 > var88) {
						byte var99 = var86;
						var86 = var88;
						var88 = var99;
					}
					if (var87 > var89) {
						byte var100 = var87;
						var87 = var89;
						var89 = var100;
					}
					var90.minTileX = var76 + var86;
					var90.maxTileX = var76 + var88;
					var90.minTileZ = var77 + var87;
					var90.maxTileZ = var77 + var89;
				}
			}
		} else if (arg2 == 151) {
			// OBJ_COUNT
			int var101 = buf.g1();
			int var102 = this.baseX + (var101 >> 4 & 0x7);
			int var103 = this.baseZ + (var101 & 0x7);
			int var104 = buf.g2();
			int var105 = buf.g2();
			int var106 = buf.g2();
			if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
				LinkList var107 = this.objStacks[this.currentLevel][var102][var103];
				if (var107 != null) {
					for (ClientObj var108 = (ClientObj) var107.head(); var108 != null; var108 = (ClientObj) var107.next()) {
						if (var108.index == (var104 & 0x7FFF) && var108.count == var105) {
							var108.count = var106;
							break;
						}
					}
					this.sortObjStacks(var102, var103);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public void appendLoc(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) this.locChanges.head(); var12 != null; var12 = (LocChange) this.locChanges.next()) {
			if (var12.level == arg2 && var12.x == arg8 && var12.z == arg5 && var12.layer == arg1) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.level = arg2;
			var11.layer = arg1;
			var11.x = arg8;
			var11.z = arg5;
			this.storeLoc(var11);
			this.locChanges.push(var11);
		}
		var11.newType = arg0;
		var11.newShape = arg9;
		var11.newAngle = arg4;
		var11.startTime = arg6;
		var11.endTime = arg7;
	}

	@ObfuscatedName("client.a(BLob;)V")
	public void storeLoc(LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.layer == 0) {
			var3 = this.scene.getWallTypecode(arg1.level, arg1.x, arg1.z);
		}
		if (arg1.layer == 1) {
			var3 = this.scene.getDecorTypecode(arg1.level, arg1.x, arg1.z);
		}
		if (arg1.layer == 2) {
			var3 = this.scene.getLocTypecode(arg1.level, arg1.x, arg1.z);
		}
		if (arg1.layer == 3) {
			var3 = this.scene.getGroundDecorTypecode(arg1.level, arg1.x, arg1.z);
		}
		if (var3 != 0) {
			int var7 = this.scene.getInfo(arg1.level, arg1.x, arg1.z, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.oldType = var4;
		arg1.oldShape = var5;
		arg1.oldAngle = var6;
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6, int arg7) {
		if (arg6 < 1 || arg1 < 1 || arg6 > 102 || arg1 > 102) {
			return;
		}
		if (lowMem && arg7 != this.currentLevel) {
			return;
		}
		int var10 = 0;
		if (arg4 == 0) {
			var10 = this.scene.getWallTypecode(arg7, arg6, arg1);
		}
		if (arg4 == 1) {
			var10 = this.scene.getDecorTypecode(arg7, arg6, arg1);
		}
		if (arg4 == 2) {
			var10 = this.scene.getLocTypecode(arg7, arg6, arg1);
		}
		if (arg4 == 3) {
			var10 = this.scene.getGroundDecorTypecode(arg7, arg6, arg1);
		}
		if (var10 != 0) {
			int var14 = this.scene.getInfo(arg7, arg6, arg1, var10);
			int var15 = var10 >> 14 & 0x7FFF;
			int var16 = var14 & 0x1F;
			int var17 = var14 >> 6;
			if (arg4 == 0) {
				this.scene.removeWall(arg1, arg7, arg6);
				LocType var18 = LocType.get(var15);
				if (var18.blockwalk) {
					this.levelCollisionMap[arg7].delWall(arg1, var17, arg6, var16, var18.blockrange);
				}
			}
			if (arg4 == 1) {
				this.scene.removeDecor(arg6, arg7, arg1);
			}
			if (arg4 == 2) {
				this.scene.removeLoc(arg1, arg7, arg6);
				LocType var19 = LocType.get(var15);
				if (arg6 + var19.width > 103 || arg1 + var19.width > 103 || arg6 + var19.length > 103 || arg1 + var19.length > 103) {
					return;
				}
				if (var19.blockwalk) {
					this.levelCollisionMap[arg7].delLoc(arg6, var19.width, arg1, var19.blockrange, var17, var19.length);
				}
			}
			if (arg4 == 3) {
				this.scene.removeGroundDecor(arg6, arg7, arg1);
				LocType var20 = LocType.get(var15);
				if (var20.blockwalk && var20.active) {
					this.levelCollisionMap[arg7].removeBlocked(arg1, arg6);
				}
			}
		}
		if (arg5 >= 0) {
			int var21 = arg7;
			if (arg7 < 3 && (this.levelTileFlags[1][arg6][arg1] & 0x2) == 2) {
				var21 = arg7 + 1;
			}
			World.addLoc(this.levelHeightmap, this.scene, arg7, arg1, arg6, arg5, var21, arg0, this.levelCollisionMap[arg7], arg2);
		}
	}

	@ObfuscatedName("client.a(II)V")
	public void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = this.objStacks[this.currentLevel][arg0][arg1];
		if (var3 == null) {
			this.scene.removeGroundObj(this.currentLevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next()) {
			ObjType var7 = ObjType.get(var6.index);
			int var8 = var7.cost;
			if (var7.stackable) {
				var8 *= var6.count + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.addHead(var5);
		ClientObj var9 = null;
		ClientObj var10 = null;
		for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next()) {
			if (var11.index != var5.index && var9 == null) {
				var9 = var11;
			}
			if (var11.index != var5.index && var11.index != var9.index && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		this.scene.addGroundObject(var12, arg0, this.getHeightmapY(arg1 * 128 + 64, this.currentLevel, arg0 * 128 + 64), this.currentLevel, arg1, var9, var10, var5);
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public void getPlayerPos(int arg0, Packet arg1) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		this.getPlayerLocal(arg0, arg1);
		this.getPlayerOldVis(arg1, arg0);
		this.getPlayerNewVis(arg1, arg0);
		this.getPlayerExtended(arg1, arg0);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var5 = this.entityRemovalIds[var4];
			if (this.players[var5].cycle != loopCycle) {
				this.players[var5] = null;
			}
		}
		if (arg1.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.playerCount; var6++) {
			if (this.players[this.playerIds[var6]] == null) {
				signlink.reporterror(this.username + " null entry in pl list - pos:" + var6 + " size:" + this.playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.c(IILmb;)V")
	public void getPlayerLocal(int arg0, Packet arg2) {
		arg2.bits();
		int var4 = arg2.gBit(1);
		if (var4 != 0) {
			int var5 = arg2.gBit(2);
			if (var5 == 0) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			} else if (var5 == 1) {
				int var6 = arg2.gBit(3);
				localPlayer.step(false, var6);
				int var7 = arg2.gBit(1);
				if (var7 == 1) {
					this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
				}
			} else if (var5 == 2) {
				int var8 = arg2.gBit(3);
				localPlayer.step(true, var8);
				int var9 = arg2.gBit(3);
				localPlayer.step(true, var9);
				int var10 = arg2.gBit(1);
				if (var10 == 1) {
					this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
				}
			} else if (var5 == 3) {
				this.currentLevel = arg2.gBit(2);
				int var11 = arg2.gBit(7);
				int var12 = arg2.gBit(7);
				int var13 = arg2.gBit(1);
				localPlayer.move(var11, var12, var13 == 1);
				int var14 = arg2.gBit(1);
				if (var14 == 1) {
					this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public void getPlayerOldVis(Packet arg1, int arg2) {
		int var4 = arg1.gBit(8);
		if (var4 < this.playerCount) {
			for (int var5 = var4; var5 < this.playerCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[var5];
			}
		}
		if (var4 > this.playerCount) {
			signlink.reporterror(this.username + " Too many players");
			throw new RuntimeException("eek");
		}
		this.playerCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.playerIds[var6];
			ClientPlayer var8 = this.players[var7];
			int var9 = arg1.gBit(1);
			if (var9 == 0) {
				this.playerIds[this.playerCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg1.gBit(2);
				if (var10 == 0) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					this.entityUpdateIds[this.entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg1.gBit(3);
					var8.step(false, var11);
					int var12 = arg1.gBit(1);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg1.gBit(3);
					var8.step(true, var13);
					int var14 = arg1.gBit(3);
					var8.step(true, var14);
					int var15 = arg1.gBit(1);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.c(ILmb;I)V")
	public void getPlayerNewVis(Packet arg1, int arg2) {
		while (arg1.bitPos + 10 < arg2 * 8) {
			int var4 = arg1.gBit(11);
			if (var4 == 2047) {
				break;
			}
			if (this.players[var4] == null) {
				this.players[var4] = new ClientPlayer();
				if (this.playerAppearanceBuffer[var4] != null) {
					this.players[var4].read(this.playerAppearanceBuffer[var4]);
				}
			}
			this.playerIds[this.playerCount++] = var4;
			ClientPlayer var5 = this.players[var4];
			var5.cycle = loopCycle;
			int var6 = arg1.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg1.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg1.gBit(1);
			var5.move(localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7, var8 == 1);
			int var9 = arg1.gBit(1);
			if (var9 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var4;
			}
		}
		arg1.bytes();
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public void getPlayerExtended(Packet arg0, int arg1) {
		for (int var4 = 0; var4 < this.entityUpdateCount; var4++) {
			int var5 = this.entityUpdateIds[var4];
			ClientPlayer var6 = this.players[var5];
			int var7 = arg0.g1();
			if ((var7 & 0x80) == 128) {
				var7 += arg0.g1() << 8;
			}
			this.getPlayerExtendedInfo(var7, var5, var6, arg0);
		}
	}

	@ObfuscatedName("client.a(BIILbb;Lmb;)V")
	public void getPlayerExtendedInfo(int arg1, int arg2, ClientPlayer arg3, Packet arg4) {
		if ((arg1 & 0x1) == 1) {
			int var7 = arg4.g1();
			byte[] var8 = new byte[var7];
			Packet var9 = new Packet(var8);
			arg4.gdata(var7, var8, 0);
			this.playerAppearanceBuffer[arg2] = var9;
			arg3.read(var9);
		}
		if ((arg1 & 0x2) == 2) {
			int var10 = arg4.g2();
			if (var10 == 65535) {
				var10 = -1;
			}
			if (var10 == arg3.primarySeqId) {
				arg3.primarySeqLoop = 0;
			}
			int var11 = arg4.g1();
			if (var10 == arg3.primarySeqId && var10 != -1) {
				int var12 = SeqType.types[var10].duplicatebehavior;
				if (var12 == 1) {
					arg3.primarySeqFrame = 0;
					arg3.primarySeqCycle = 0;
					arg3.primarySeqDelay = var11;
					arg3.primarySeqLoop = 0;
				}
				if (var12 == 2) {
					arg3.primarySeqLoop = 0;
				}
			} else if (var10 == -1 || arg3.primarySeqId == -1 || SeqType.types[var10].priority >= SeqType.types[arg3.primarySeqId].priority) {
				arg3.primarySeqId = var10;
				arg3.primarySeqFrame = 0;
				arg3.primarySeqCycle = 0;
				arg3.primarySeqDelay = var11;
				arg3.primarySeqLoop = 0;
				arg3.preanimRouteLength = arg3.routeLength;
			}
		}
		if ((arg1 & 0x4) == 4) {
			arg3.targetId = arg4.g2();
			if (arg3.targetId == 65535) {
				arg3.targetId = -1;
			}
		}
		if ((arg1 & 0x8) == 8) {
			arg3.chatMessage = arg4.gjstr();
			arg3.chatColour = 0;
			arg3.chatEffect = 0;
			arg3.chatTimer = 150;
			this.addMessage(arg3.name, 2, arg3.chatMessage);
		}
		if ((arg1 & 0x10) == 16) {
			int var13 = arg4.g1();
			int var14 = arg4.g1();
			arg3.hit(var14, var13);
			arg3.combatCycle = loopCycle + 300;
			arg3.health = arg4.g1();
			arg3.totalHealth = arg4.g1();
		}
		if ((arg1 & 0x20) == 32) {
			arg3.targetTileX = arg4.g2();
			arg3.targetTileZ = arg4.g2();
		}
		if ((arg1 & 0x40) == 64) {
			int var15 = arg4.g2();
			int var16 = arg4.g1();
			int var17 = arg4.g1();
			int var18 = arg4.pos;
			if (arg3.name != null && arg3.visible) {
				long var19 = JString.toBase37(arg3.name);
				boolean var21 = false;
				if (var16 <= 1) {
					for (int var22 = 0; var22 < this.ignoreCount; var22++) {
						if (this.ignoreName37[var22] == var19) {
							var21 = true;
							break;
						}
					}
				}
				if (!var21 && this.overrideChat == 0) {
					try {
						String var23 = WordPack.unpack(var17, arg4);
						String var24 = WordFilter.filter(var23);
						arg3.chatMessage = var24;
						arg3.chatColour = var15 >> 8;
						arg3.chatEffect = var15 & 0xFF;
						arg3.chatTimer = 150;
						if (var16 == 2 || var16 == 3) {
							this.addMessage("@cr2@" + arg3.name, 1, var24);
						} else if (var16 == 1) {
							this.addMessage("@cr1@" + arg3.name, 1, var24);
						} else {
							this.addMessage(arg3.name, 2, var24);
						}
					} catch (Exception var29) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg4.pos = var18 + var17;
		}
		if ((arg1 & 0x100) == 256) {
			arg3.spotanimId = arg4.g2();
			int var26 = arg4.g4();
			arg3.spotanimHeight = var26 >> 16;
			arg3.spotanimLastCycle = loopCycle + (var26 & 0xFFFF);
			arg3.spotanimFrame = 0;
			arg3.spotanimCycle = 0;
			if (arg3.spotanimLastCycle > loopCycle) {
				arg3.spotanimFrame = -1;
			}
			if (arg3.spotanimId == 65535) {
				arg3.spotanimId = -1;
			}
		}
		if ((arg1 & 0x200) == 512) {
			arg3.forceMoveStartSceneTileX = arg4.g1();
			arg3.forceMoveStartSceneTileZ = arg4.g1();
			arg3.forceMoveEndSceneTileX = arg4.g1();
			arg3.forceMoveEndSceneTileZ = arg4.g1();
			arg3.forceMoveEndCycle = arg4.g2() + loopCycle;
			arg3.forceMoveStartCycle = arg4.g2() + loopCycle;
			arg3.forceMoveFaceDirection = arg4.g1();
			arg3.clearRoute();
		}
		if ((arg1 & 0x400) == 1024) {
			int var27 = arg4.g1();
			int var28 = arg4.g1();
			arg3.hit(var28, var27);
			arg3.combatCycle = loopCycle + 300;
			arg3.health = arg4.g1();
			arg3.totalHealth = arg4.g1();
		}
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public void getNpcPos(int arg0, Packet arg2) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		this.getNpcPosOldVis(arg2, arg0);
		this.getNpcPosNewVis(arg0, arg2);
		this.getNpcPosExtended(arg2, arg0);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var5 = this.entityRemovalIds[var4];
			if (this.npcs[var5].cycle != loopCycle) {
				this.npcs[var5].type = null;
				this.npcs[var5] = null;
			}
		}
		if (arg2.pos != arg0) {
			signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + arg2.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.npcCount; var6++) {
			if (this.npcs[this.npcIds[var6]] == null) {
				signlink.reporterror(this.username + " null entry in npc list - pos:" + var6 + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;IZ)V")
	public void getNpcPosOldVis(Packet arg0, int arg1) {
		arg0.bits();
		int var4 = arg0.gBit(8);
		if (var4 < this.npcCount) {
			for (int var5 = var4; var5 < this.npcCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var5];
			}
		}
		if (var4 > this.npcCount) {
			signlink.reporterror(this.username + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.npcCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.npcIds[var6];
			ClientNpc var8 = this.npcs[var7];
			int var9 = arg0.gBit(1);
			if (var9 == 0) {
				this.npcIds[this.npcCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg0.gBit(2);
				if (var10 == 0) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					this.entityUpdateIds[this.entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg0.gBit(3);
					var8.step(false, var11);
					int var12 = arg0.gBit(1);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg0.gBit(3);
					var8.step(true, var13);
					int var14 = arg0.gBit(3);
					var8.step(true, var14);
					int var15 = arg0.gBit(1);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public void getNpcPosNewVis(int arg0, Packet arg2) {
		while (arg2.bitPos + 21 < arg0 * 8) {
			int var4 = arg2.gBit(13);
			if (var4 == 8191) {
				break;
			}
			if (this.npcs[var4] == null) {
				this.npcs[var4] = new ClientNpc();
			}
			ClientNpc var5 = this.npcs[var4];
			this.npcIds[this.npcCount++] = var4;
			var5.cycle = loopCycle;
			var5.type = NpcType.get(arg2.gBit(11));
			var5.size = var5.type.size;
			var5.walkanim = var5.type.walkanim;
			var5.walkanim_b = var5.type.walkanim_b;
			var5.walkanim_l = var5.type.walkanim_l;
			var5.walkanim_r = var5.type.walkanim_r;
			var5.readyanim = var5.type.runanim;
			int var6 = arg2.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg2.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			var5.move(localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7, false);
			int var8 = arg2.gBit(1);
			if (var8 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var4;
			}
		}
		arg2.bytes();
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public void getNpcPosExtended(Packet arg1, int arg2) {
		for (int var4 = 0; var4 < this.entityUpdateCount; var4++) {
			int var5 = this.entityUpdateIds[var4];
			ClientNpc var6 = this.npcs[var5];
			int var7 = arg1.g1();
			if ((var7 & 0x1) == 1) {
				int var8 = arg1.g1();
				int var9 = arg1.g1();
				var6.hit(var9, var8);
				var6.combatCycle = loopCycle + 300;
				var6.health = arg1.g1();
				var6.totalHealth = arg1.g1();
			}
			if ((var7 & 0x2) == 2) {
				int var10 = arg1.g2();
				if (var10 == 65535) {
					var10 = -1;
				}
				if (var10 == var6.primarySeqId) {
					var6.primarySeqLoop = 0;
				}
				int var11 = arg1.g1();
				if (var10 == var6.primarySeqId && var10 != -1) {
					int var12 = SeqType.types[var10].duplicatebehavior;
					if (var12 == 1) {
						var6.primarySeqFrame = 0;
						var6.primarySeqCycle = 0;
						var6.primarySeqDelay = var11;
						var6.primarySeqLoop = 0;
					}
					if (var12 == 2) {
						var6.primarySeqLoop = 0;
					}
				} else if (var10 == -1 || var6.primarySeqId == -1 || SeqType.types[var10].priority >= SeqType.types[var6.primarySeqId].priority) {
					var6.primarySeqId = var10;
					var6.primarySeqFrame = 0;
					var6.primarySeqCycle = 0;
					var6.primarySeqDelay = var11;
					var6.primarySeqLoop = 0;
					var6.preanimRouteLength = var6.routeLength;
				}
			}
			if ((var7 & 0x4) == 4) {
				var6.targetId = arg1.g2();
				if (var6.targetId == 65535) {
					var6.targetId = -1;
				}
			}
			if ((var7 & 0x8) == 8) {
				var6.chatMessage = arg1.gjstr();
				var6.chatTimer = 100;
			}
			if ((var7 & 0x10) == 16) {
				int var13 = arg1.g1();
				int var14 = arg1.g1();
				var6.hit(var14, var13);
				var6.combatCycle = loopCycle + 300;
				var6.health = arg1.g1();
				var6.totalHealth = arg1.g1();
			}
			if ((var7 & 0x20) == 32) {
				var6.type = NpcType.get(arg1.g2());
				var6.walkanim = var6.type.walkanim;
				var6.walkanim_b = var6.type.walkanim_b;
				var6.walkanim_l = var6.type.walkanim_l;
				var6.walkanim_r = var6.type.walkanim_r;
				var6.readyanim = var6.type.runanim;
			}
			if ((var7 & 0x40) == 64) {
				var6.spotanimId = arg1.g2();
				int var15 = arg1.g4();
				var6.spotanimHeight = var15 >> 16;
				var6.spotanimLastCycle = loopCycle + (var15 & 0xFFFF);
				var6.spotanimFrame = 0;
				var6.spotanimCycle = 0;
				if (var6.spotanimLastCycle > loopCycle) {
					var6.spotanimFrame = -1;
				}
				if (var6.spotanimId == 65535) {
					var6.spotanimId = -1;
				}
			}
			if ((var7 & 0x80) == 128) {
				var6.targetTileX = arg1.g2();
				var6.targetTileZ = arg1.g2();
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public void showContextMenu() {
		int var2 = this.fontBold12.stringWid("Choose Option");
		for (int var3 = 0; var3 < this.menuSize; var3++) {
			int var4 = this.fontBold12.stringWid(this.menuOption[var3]);
			if (var4 > var2) {
				var2 = var4;
			}
		}
		var2 += 8;
		int var5 = this.menuSize * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var6 = super.mouseClickX - 4 - var2 / 2;
			if (var6 + var2 > 512) {
				var6 = 512 - var2;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			int var7 = super.mouseClickY - 4;
			if (var7 + var5 > 334) {
				var7 = 334 - var5;
			}
			if (var7 < 0) {
				var7 = 0;
			}
			this.menuVisible = true;
			this.menuArea = 0;
			this.menuX = var6;
			this.menuY = var7;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var8 = super.mouseClickX - 553 - var2 / 2;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 + var2 > 190) {
				var8 = 190 - var2;
			}
			int var9 = super.mouseClickY - 205;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 + var5 > 261) {
				var9 = 261 - var5;
			}
			this.menuVisible = true;
			this.menuArea = 1;
			this.menuX = var8;
			this.menuY = var9;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
			int var10 = super.mouseClickX - 17 - var2 / 2;
			if (var10 < 0) {
				var10 = 0;
			} else if (var10 + var2 > 479) {
				var10 = 479 - var2;
			}
			int var11 = super.mouseClickY - 357;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 + var5 > 96) {
				var11 = 96 - var5;
			}
			this.menuVisible = true;
			this.menuArea = 2;
			this.menuX = var10;
			this.menuY = var11;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
	}

	@ObfuscatedName("client.d(II)Z")
	public boolean isAddFriendOption(int arg1) {
		if (arg1 < 0) {
			return false;
		}
		int var3 = this.menuAction[arg1];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 406;
	}

	@ObfuscatedName("client.a(BI)V")
	public void useMenuOption(int arg1) {
		if (arg1 < 0) {
			return;
		}
		if (this.chatbackInputOpen) {
			this.chatbackInputOpen = false;
			this.redrawChatback = true;
		}
		int var3 = this.menuParamB[arg1];
		int var4 = this.menuParamC[arg1];
		int var5 = this.menuAction[arg1];
		int var6 = this.menuParamA[arg1];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 465) {
			// IF_BUTTON
			this.out.pIsaac(177);
			this.out.p2(var4);
			Component var7 = Component.types[var4];
			if (var7.scripts != null && var7.scripts[0][0] == 5) {
				int var8 = var7.scripts[0][1];
				this.varps[var8] = 1 - this.varps[var8];
				this.updateVarp(var8);
				this.redrawSidebar = true;
			}
		}
		if (var5 == 881) {
			// OPHELDU
			this.out.pIsaac(126);
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 1102) {
			ObjType var9 = ObjType.get(var6);
			String var10;
			if (var9.desc == null) {
				var10 = "It's a " + var9.name + ".";
			} else {
				var10 = new String(var9.desc);
			}
			this.addMessage("", 0, var10);
		}
		if (var5 == 581) {
			if ((var6 & 0x3) == 0) {
				oplogic1++;
			}
			if (oplogic1 >= 99) {
				// ANTICHEAT_OPLOGIC1
				this.out.pIsaac(87);
				this.out.p4(0);
			}
			// OPLOC4
			this.interactWithLoc(var6, 204, var3, var4);
		}
		if (var5 == 1607) {
			ClientNpc var11 = this.npcs[var6];
			if (var11 != null) {
				String var12;
				if (var11.type.desc == null) {
					var12 = "It's a " + var11.type.name + ".";
				} else {
					var12 = new String(var11.type.desc);
				}
				this.addMessage("", 0, var12);
			}
		}
		if (var5 == 1175) {
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.get(var13);
			String var15;
			if (var14.desc == null) {
				var15 = "It's a " + var14.name + ".";
			} else {
				var15 = new String(var14.desc);
			}
			this.addMessage("", 0, var15);
		}
		if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
			ClientNpc var16 = this.npcs[var6];
			if (var16 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var16.routeTileX[0], false, var16.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				if (var5 == 728) {
					// OPNPC1
					this.out.pIsaac(180);
				}
				if (var5 == 963) {
					// OPNPC4
					this.out.pIsaac(107);
				}
				if (var5 == 542) {
					// OPNPC2
					this.out.pIsaac(252);
				}
				if (var5 == 6) {
					if ((var6 & 0x3) == 0) {
						oplogic2++;
					}
					if (oplogic2 >= 124) {
						// ANTICHEAT_OPLOGIC2
						this.out.pIsaac(95);
						this.out.p4(0);
					}
					// OPNPC3
					this.out.pIsaac(196);
				}
				if (var5 == 245) {
					if ((var6 & 0x3) == 0) {
						oplogic4++;
					}
					if (oplogic4 >= 85) {
						// ANTICHEAT_OPLOGIC4
						this.out.pIsaac(186);
						this.out.p2(39596);
					}
					// OPNPC5
					this.out.pIsaac(43);
				}
				this.out.p2(var6);
			}
		}
		if (var5 == 1773) {
			ObjType var17 = ObjType.get(var6);
			String var18;
			if (var4 >= 100000) {
				var18 = var4 + " x " + var17.name;
			} else if (var17.desc == null) {
				var18 = "It's a " + var17.name + ".";
			} else {
				var18 = new String(var17.desc);
			}
			this.addMessage("", 0, var18);
		}
		if (var5 == 188) {
			this.objSelected = 1;
			this.objSelectedSlot = var3;
			this.objSelectedInterface = var4;
			this.objInterface = var6;
			this.objSelectedName = ObjType.get(var6).name;
			this.spellSelected = 0;
			this.redrawSidebar = true;
			return;
		}
		if (var5 == 900) {
			ClientNpc var19 = this.npcs[var6];
			if (var19 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var19.routeTileX[0], false, var19.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPCU
				this.out.pIsaac(14);
				this.out.p2(var6);
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
			}
		}
		if (var5 == 217) {
			boolean var20 = this.tryMove(0, 0, 2, 0, localPlayer.routeTileZ[0], 0, 0, var3, false, var4, localPlayer.routeTileX[0]);
			if (!var20) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var3, false, var4, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJU
			this.out.pIsaac(143);
			this.out.p2(var3 + this.sceneBaseTileX);
			this.out.p2(var4 + this.sceneBaseTileZ);
			this.out.p2(var6);
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
		}
		if (var5 == 651) {
			ClientPlayer var22 = this.players[var6];
			if (var22 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var22.routeTileX[0], false, var22.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYERT
				this.out.pIsaac(52);
				this.out.p2(var6);
				this.out.p2(this.activeSpellId);
			}
		}
		if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
			if (var5 == 22) {
				// INV_BUTTON3
				this.out.pIsaac(48);
			}
			if (var5 == 415) {
				if ((var4 & 0x3) == 0) {
					oplogic7++;
				}
				if (oplogic7 >= 55) {
					// ANTICHEAT_OPLOGIC7
					this.out.pIsaac(119);
					this.out.p4(0);
				}
				// INV_BUTTON5
				this.out.pIsaac(242);
			}
			if (var5 == 892) {
				if ((var3 & 0x3) == 0) {
					oplogic9++;
				}
				if (oplogic9 >= 130) {
					// ANTICHEAT_OPLOGIC9
					this.out.pIsaac(233);
					this.out.p1(177);
				}
				// INV_BUTTON4
				this.out.pIsaac(183);
			}
			if (var5 == 602) {
				// INV_BUTTON1
				this.out.pIsaac(13);
			}
			if (var5 == 596) {
				// INV_BUTTON2
				this.out.pIsaac(58);
			}
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 951) {
			Component var23 = Component.types[var4];
			boolean var24 = true;
			if (var23.clientCode > 0) {
				var24 = this.handleInterfaceAction(var23);
			}
			if (var24) {
				// IF_BUTTON
				this.out.pIsaac(177);
				this.out.p2(var4);
			}
		}
		if (var5 == 504) {
			// OPLOC2
			this.interactWithLoc(var6, 219, var3, var4);
		}
		if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
			if (var5 == 38) {
				// OPHELD2
				this.out.pIsaac(193);
			}
			if (var5 == 347) {
				// OPHELD5
				this.out.pIsaac(9);
			}
			if (var5 == 478) {
				if ((var3 & 0x3) == 0) {
					oplogic5++;
				}
				if (oplogic5 >= 90) {
					// ANTICHEAT_OPLOGIC5
					this.out.pIsaac(74);
				}
				// OPHELD4
				this.out.pIsaac(194);
			}
			if (var5 == 422) {
				// OPHELD3
				this.out.pIsaac(115);
			}
			if (var5 == 405) {
				oplogic3 += var6;
				if (oplogic3 >= 97) {
					// ANTICHEAT_OPLOGIC3
					this.out.pIsaac(146);
					this.out.p3(14953816);
				}
				// OPHELD1
				this.out.pIsaac(104);
			}
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 965) {
			boolean var25 = this.tryMove(0, 0, 2, 0, localPlayer.routeTileZ[0], 0, 0, var3, false, var4, localPlayer.routeTileX[0]);
			if (!var25) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var3, false, var4, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJT
			this.out.pIsaac(122);
			this.out.p2(var3 + this.sceneBaseTileX);
			this.out.p2(var4 + this.sceneBaseTileZ);
			this.out.p2(var6);
			this.out.p2(this.activeSpellId);
		}
		if (var5 == 367) {
			ClientPlayer var27 = this.players[var6];
			if (var27 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var27.routeTileX[0], false, var27.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYERU
				this.out.pIsaac(210);
				this.out.p2(var6);
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
			}
		}
		if (var5 == 947) {
			this.closeInterfaces();
		}
		if (var5 == 44 && !this.pressedContinueOption) {
			// RESUME_PAUSEBUTTON
			this.out.pIsaac(239);
			this.out.p2(var4);
			this.pressedContinueOption = true;
		}
		if (var5 == 1501) {
			oplogic6 += this.sceneBaseTileZ;
			if (oplogic6 >= 92) {
				// ANTICHEAT_OPLOGIC6
				this.out.pIsaac(250);
				this.out.p4(0);
			}
			// OPLOC5
			this.interactWithLoc(var6, 86, var3, var4);
		}
		if (var5 == 960) {
			// IF_BUTTON
			this.out.pIsaac(177);
			this.out.p2(var4);
			Component var28 = Component.types[var4];
			if (var28.scripts != null && var28.scripts[0][0] == 5) {
				int var29 = var28.scripts[0][1];
				if (this.varps[var29] != var28.scriptOperand[0]) {
					this.varps[var29] = var28.scriptOperand[0];
					this.updateVarp(var29);
					this.redrawSidebar = true;
				}
			}
		}
		if (var5 == 364) {
			// OPLOC3
			this.interactWithLoc(var6, 226, var3, var4);
		}
		if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
			ClientPlayer var30 = this.players[var6];
			if (var30 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var30.routeTileX[0], false, var30.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				if (var5 == 1101) {
					// OPPLAYER1
					this.out.pIsaac(135);
				}
				if (var5 == 1373) {
					// OPPLAYER4
					this.out.pIsaac(54);
				}
				if (var5 == 1544) {
					// OPPLAYER3
					this.out.pIsaac(172);
				}
				if (var5 == 151) {
					oplogic8++;
					if (oplogic8 >= 90) {
						// ANTICHEAT_OPLOGIC8
						this.out.pIsaac(171);
						this.out.p2(31114);
					}
					// OPPLAYER2
					this.out.pIsaac(165);
				}
				this.out.p2(var6);
			}
		}
		if (var5 == 285) {
			// OPLOC1
			this.interactWithLoc(var6, 1, var3, var4);
		}
		if (var5 == 55 && this.interactWithLoc(var6, 208, var3, var4)) {
			// OPLOCT
			this.out.p2(this.activeSpellId);
		}
		if (var5 == 903 || var5 == 363) {
			String var31 = this.menuOption[arg1];
			int var32 = var31.indexOf("@whi@");
			if (var32 != -1) {
				String var33 = var31.substring(var32 + 5).trim();
				String var34 = JString.formatDisplayName(JString.fromBase37(JString.toBase37(var33)));
				boolean var35 = false;
				for (int var36 = 0; var36 < this.playerCount; var36++) {
					ClientPlayer var37 = this.players[this.playerIds[var36]];
					if (var37 != null && var37.name != null && var37.name.equalsIgnoreCase(var34)) {
						this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var37.routeTileX[0], false, var37.routeTileZ[0], localPlayer.routeTileX[0]);
						if (var5 == 903) {
							// OPPLAYER4
							this.out.pIsaac(54);
						}
						if (var5 == 363) {
							// OPPLAYER1
							this.out.pIsaac(135);
						}
						this.out.p2(this.playerIds[var36]);
						var35 = true;
						break;
					}
				}
				if (!var35) {
					this.addMessage("", 0, "Unable to find " + var34);
				}
			}
		}
		if (var5 == 265) {
			ClientNpc var38 = this.npcs[var6];
			if (var38 != null) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var38.routeTileX[0], false, var38.routeTileZ[0], localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPCT
				this.out.pIsaac(141);
				this.out.p2(var6);
				this.out.p2(this.activeSpellId);
			}
		}
		if (var5 == 660) {
			if (this.menuVisible) {
				this.scene.click(var3 - 4, var4 - 4);
			} else {
				this.scene.click(super.mouseClickX - 4, super.mouseClickY - 4);
			}
		}
		if (var5 == 34) {
			String var39 = this.menuOption[arg1];
			int var40 = var39.indexOf("@whi@");
			if (var40 != -1) {
				this.closeInterfaces();
				this.reportAbuseInput = var39.substring(var40 + 5).trim();
				this.reportAbuseMuteOption = false;
				for (int var41 = 0; var41 < Component.types.length; var41++) {
					if (Component.types[var41] != null && Component.types[var41].clientCode == 600) {
						this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.types[var41].layer;
						break;
					}
				}
			}
		}
		if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
			String var42 = this.menuOption[arg1];
			int var43 = var42.indexOf("@whi@");
			if (var43 != -1) {
				long var44 = JString.toBase37(var42.substring(var43 + 5).trim());
				if (var5 == 406) {
					this.addFriend(var44);
				}
				if (var5 == 436) {
					this.addIgnore(var44);
				}
				if (var5 == 557) {
					this.removeFriend(var44);
				}
				if (var5 == 556) {
					this.removeIgnore(var44);
				}
			}
		}
		if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
			boolean var46 = this.tryMove(0, 0, 2, 0, localPlayer.routeTileZ[0], 0, 0, var3, false, var4, localPlayer.routeTileX[0]);
			if (!var46) {
				this.tryMove(0, 1, 2, 0, localPlayer.routeTileZ[0], 1, 0, var3, false, var4, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			if (var5 == 99) {
				// OPOBJ3
				this.out.pIsaac(55);
			}
			if (var5 == 993) {
				// OPOBJ2
				this.out.pIsaac(238);
			}
			if (var5 == 224) {
				// OPOBJ1
				this.out.pIsaac(113);
			}
			if (var5 == 877) {
				// OPOBJ5
				this.out.pIsaac(247);
			}
			if (var5 == 746) {
				// OPOBJ4
				this.out.pIsaac(17);
			}
			this.out.p2(var3 + this.sceneBaseTileX);
			this.out.p2(var4 + this.sceneBaseTileZ);
			this.out.p2(var6);
		}
		if (var5 == 930) {
			Component var48 = Component.types[var4];
			this.spellSelected = 1;
			this.activeSpellId = var4;
			this.activeSpellFlags = var48.targetMask;
			this.objSelected = 0;
			this.redrawSidebar = true;
			String var49 = var48.targetVerb;
			if (var49.indexOf(" ") != -1) {
				var49 = var49.substring(0, var49.indexOf(" "));
			}
			String var50 = var48.targetVerb;
			if (var50.indexOf(" ") != -1) {
				var50 = var50.substring(var50.indexOf(" ") + 1);
			}
			this.spellCaption = var49 + " " + var48.targetText + " " + var50;
			if (this.activeSpellFlags == 16) {
				this.redrawSidebar = true;
				this.selectedTab = 3;
				this.redrawSideicons = true;
			}
			return;
		}
		if (var5 == 679) {
			String var51 = this.menuOption[arg1];
			int var52 = var51.indexOf("@whi@");
			if (var52 != -1) {
				long var53 = JString.toBase37(var51.substring(var52 + 5).trim());
				int var55 = -1;
				for (int var56 = 0; var56 < this.friendCount; var56++) {
					if (this.friendName37[var56] == var53) {
						var55 = var56;
						break;
					}
				}
				if (var55 != -1 && this.friendWorld[var55] > 0) {
					this.redrawChatback = true;
					this.chatbackInputOpen = false;
					this.showSocialInput = true;
					this.socialInput = "";
					this.socialInputType = 3;
					this.socialName37 = this.friendName37[var55];
					this.socialMessage = "Enter message to send to " + this.friendName[var55];
				}
			}
		}
		if (var5 == 391) {
			// OPHELDT
			this.out.pIsaac(188);
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.out.p2(this.activeSpellId);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 450 && this.interactWithLoc(var6, 147, var3, var4)) {
			// OPLOCU
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
		}
		this.objSelected = 0;
		this.spellSelected = 0;
		this.redrawSidebar = true;
	}

	@ObfuscatedName("client.a(IIILgc;I)V")
	public void addNpcOptions(int arg0, int arg2, NpcType arg3, int arg4) {
		if (this.menuSize >= 400) {
			return;
		}
		String var6 = arg3.name;
		if (arg3.vislevel != 0) {
			var6 = var6 + getCombatLevelTag(localPlayer.vislevel, arg3.vislevel) + " (level-" + arg3.vislevel + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + var6;
			this.menuAction[this.menuSize] = 900;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg0;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			if (arg3.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg3.op[var7] != null && !arg3.op[var7].equalsIgnoreCase("attack")) {
						this.menuOption[this.menuSize] = arg3.op[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.menuAction[this.menuSize] = 728;
						}
						if (var7 == 1) {
							this.menuAction[this.menuSize] = 542;
						}
						if (var7 == 2) {
							this.menuAction[this.menuSize] = 6;
						}
						if (var7 == 3) {
							this.menuAction[this.menuSize] = 963;
						}
						if (var7 == 4) {
							this.menuAction[this.menuSize] = 245;
						}
						this.menuParamA[this.menuSize] = arg2;
						this.menuParamB[this.menuSize] = arg0;
						this.menuParamC[this.menuSize] = arg4;
						this.menuSize++;
					}
				}
			}
			if (arg3.op != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg3.op[var8] != null && arg3.op[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg3.vislevel > localPlayer.vislevel) {
							var9 = 2000;
						}
						this.menuOption[this.menuSize] = arg3.op[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.menuAction[this.menuSize] = var9 + 728;
						}
						if (var8 == 1) {
							this.menuAction[this.menuSize] = var9 + 542;
						}
						if (var8 == 2) {
							this.menuAction[this.menuSize] = var9 + 6;
						}
						if (var8 == 3) {
							this.menuAction[this.menuSize] = var9 + 963;
						}
						if (var8 == 4) {
							this.menuAction[this.menuSize] = var9 + 245;
						}
						this.menuParamA[this.menuSize] = arg2;
						this.menuParamB[this.menuSize] = arg0;
						this.menuParamC[this.menuSize] = arg4;
						this.menuSize++;
					}
				}
			}
			this.menuOption[this.menuSize] = "Examine @yel@" + var6;
			this.menuAction[this.menuSize] = 1607;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg0;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		} else if ((this.activeSpellFlags & 0x2) == 2) {
			this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + var6;
			this.menuAction[this.menuSize] = 265;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg0;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		}
	}

	@ObfuscatedName("client.a(ILbb;III)V")
	public void addPlayerOptions(ClientPlayer arg1, int arg2, int arg3, int arg4) {
		if (arg1 == localPlayer || this.menuSize >= 400) {
			return;
		}
		String var6 = arg1.name + getCombatLevelTag(localPlayer.vislevel, arg1.vislevel) + " (level-" + arg1.vislevel + ")";
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + var6;
			this.menuAction[this.menuSize] = 367;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			this.menuOption[this.menuSize] = "Follow @whi@" + var6;
			this.menuAction[this.menuSize] = 1544;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
			if (this.overrideChat == 0) {
				this.menuOption[this.menuSize] = "Trade with @whi@" + var6;
				this.menuAction[this.menuSize] = 1373;
				this.menuParamA[this.menuSize] = arg3;
				this.menuParamB[this.menuSize] = arg2;
				this.menuParamC[this.menuSize] = arg4;
				this.menuSize++;
			}
			if (this.wildernessLevel > 0) {
				this.menuOption[this.menuSize] = "Attack @whi@" + var6;
				if (localPlayer.vislevel >= arg1.vislevel) {
					this.menuAction[this.menuSize] = 151;
				} else {
					this.menuAction[this.menuSize] = 2151;
				}
				this.menuParamA[this.menuSize] = arg3;
				this.menuParamB[this.menuSize] = arg2;
				this.menuParamC[this.menuSize] = arg4;
				this.menuSize++;
			}
			if (this.worldLocationState == 1) {
				this.menuOption[this.menuSize] = "Fight @whi@" + var6;
				this.menuAction[this.menuSize] = 151;
				this.menuParamA[this.menuSize] = arg3;
				this.menuParamB[this.menuSize] = arg2;
				this.menuParamC[this.menuSize] = arg4;
				this.menuSize++;
			}
			if (this.worldLocationState == 2) {
				this.menuOption[this.menuSize] = "Duel-with @whi@" + var6;
				this.menuAction[this.menuSize] = 1101;
				this.menuParamA[this.menuSize] = arg3;
				this.menuParamB[this.menuSize] = arg2;
				this.menuParamC[this.menuSize] = arg4;
				this.menuSize++;
			}
		} else if ((this.activeSpellFlags & 0x8) == 8) {
			this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + var6;
			this.menuAction[this.menuSize] = 651;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg4;
			this.menuSize++;
		}
		for (int var7 = 0; var7 < this.menuSize; var7++) {
			if (this.menuAction[var7] == 660) {
				this.menuOption[var7] = "Walk here @whi@" + var6;
				return;
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static String getCombatLevelTag(int arg1, int arg2) {
		int var3 = arg1 - arg2;
		if (var3 < -9) {
			return "@red@";
		} else if (var3 < -6) {
			return "@or3@";
		} else if (var3 < -3) {
			return "@or2@";
		} else if (var3 < 0) {
			return "@or1@";
		} else if (var3 > 9) {
			return "@gre@";
		} else if (var3 > 6) {
			return "@gr3@";
		} else if (var3 > 3) {
			return "@gr2@";
		} else if (var3 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.a(Ld;IZII)V")
	public void drawInterface(Component arg0, int arg1, int arg3, int arg4) {
		if (arg0.type != 0 || arg0.children == null || arg0.hide && this.viewportHoveredInterfaceId != arg0.id && this.sidebarHoveredInterfaceId != arg0.id && this.chatHoveredInterfaceId != arg0.id) {
			return;
		}

		int var6 = Pix2D.left;
		int var7 = Pix2D.top;
		int var8 = Pix2D.right;
		int var9 = Pix2D.bottom;
		Pix2D.setClipping(arg4, arg1 + arg0.width, arg4 + arg0.height, arg1);
		int var10 = arg0.children.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg0.childX[var11] + arg1;
			int var13 = arg0.childY[var11] + arg4 - arg3;
			Component var14 = Component.types[arg0.children[var11]];
			int var15 = var12 + var14.x;
			int var16 = var13 + var14.y;
			if (var14.clientCode > 0) {
				this.updateInterfaceContent(var14);
			}

			if (var14.type == 0) {
				if (var14.scrollPosition > var14.scroll - var14.height) {
					var14.scrollPosition = var14.scroll - var14.height;
				}
				if (var14.scrollPosition < 0) {
					var14.scrollPosition = 0;
				}
				this.drawInterface(var14, var15, var14.scrollPosition, var16);
				if (var14.scroll > var14.height) {
					this.drawScrollbar(var16, var15 + var14.width, var14.scrollPosition, var14.scroll, var14.height);
				}
			} else if (var14.type == 1) {
			} else if (var14.type == 2) {
				int var17 = 0;
				for (int var18 = 0; var18 < var14.height; var18++) {
					for (int var19 = 0; var19 < var14.width; var19++) {
						int var20 = var15 + var19 * (var14.marginX + 32);
						int var21 = var16 + var18 * (var14.marginY + 32);
						if (var17 < 20) {
							var20 += var14.invSlotOffsetX[var17];
							var21 += var14.invSlotOffsetY[var17];
						}
						if (var14.invSlotObjId[var17] > 0) {
							int var22 = 0;
							int var23 = 0;
							int var24 = var14.invSlotObjId[var17] - 1;
							if (var20 > Pix2D.left - 32 && var20 < Pix2D.right && var21 > Pix2D.top - 32 && var21 < Pix2D.bottom || this.objDragArea != 0 && this.objDragSlot == var17) {
								int var25 = 0;
								if (this.objSelected == 1 && this.objSelectedSlot == var17 && this.objSelectedInterface == var14.id) {
									var25 = 16777215;
								}
								Pix32 var26 = ObjType.getIcon(var25, var14.invSlotObjCount[var17], var24);
								if (var26 != null) {
									if (this.objDragArea != 0 && this.objDragSlot == var17 && this.objDragInterfaceId == var14.id) {
										var22 = super.mouseX - this.objGrabX;
										var23 = super.mouseY - this.objGrabY;
										if (var22 < 5 && var22 > -5) {
											var22 = 0;
										}
										if (var23 < 5 && var23 > -5) {
											var23 = 0;
										}
										if (this.objDragCycles < 5) {
											var22 = 0;
											var23 = 0;
										}
										var26.transPlotSprite(128, var21 + var23, var20 + var22);
										if (var21 + var23 < Pix2D.top && arg0.scrollPosition > 0) {
											int var27 = this.sceneDelta * (Pix2D.top - var21 - var23) / 3;
											if (var27 > this.sceneDelta * 10) {
												var27 = this.sceneDelta * 10;
											}
											if (var27 > arg0.scrollPosition) {
												var27 = arg0.scrollPosition;
											}
											arg0.scrollPosition -= var27;
											this.objGrabY += var27;
										}
										if (var21 + var23 + 32 > Pix2D.bottom && arg0.scrollPosition < arg0.scroll - arg0.height) {
											int var28 = this.sceneDelta * (var21 + var23 + 32 - Pix2D.bottom) / 3;
											if (var28 > this.sceneDelta * 10) {
												var28 = this.sceneDelta * 10;
											}
											if (var28 > arg0.scroll - arg0.height - arg0.scrollPosition) {
												var28 = arg0.scroll - arg0.height - arg0.scrollPosition;
											}
											arg0.scrollPosition += var28;
											this.objGrabY -= var28;
										}
									} else if (this.selectedArea != 0 && this.selectedItem == var17 && this.selectedInterface == var14.id) {
										var26.transPlotSprite(128, var21, var20);
									} else {
										var26.plotSprite(var20, var21);
									}
									if (var26.owi == 33 || var14.invSlotObjCount[var17] != 1) {
										int var29 = var14.invSlotObjCount[var17];
										this.fontPlain11.drawString(formatObjCount(var29), 0, var20 + 1 + var22, var21 + 10 + var23);
										this.fontPlain11.drawString(formatObjCount(var29), 16776960, var20 + var22, var21 + 9 + var23);
									}
								}
							}
						} else if (var14.invSlotGraphic != null && var17 < 20) {
							Pix32 var30 = var14.invSlotGraphic[var17];
							if (var30 != null) {
								var30.plotSprite(var20, var21);
							}
						}
						var17++;
					}
				}
			} else if (var14.type == 3) {
				boolean var31 = false;
				if (this.chatHoveredInterfaceId == var14.id || this.sidebarHoveredInterfaceId == var14.id || this.viewportHoveredInterfaceId == var14.id) {
					var31 = true;
				}
				int var32;
				if (this.executeInterfaceScript(var14)) {
					var32 = var14.activeColour;
					if (var31 && var14.activeOverColour != 0) {
						var32 = var14.activeOverColour;
					}
				} else {
					var32 = var14.colour;
					if (var31 && var14.overColour != 0) {
						var32 = var14.overColour;
					}
				}
				if (var14.trans == 0) {
					if (var14.fill) {
						Pix2D.fillRect(var16, var14.height, var15, var14.width, var32);
					} else {
						Pix2D.drawRect(var15, var14.height, var16, var14.width, var32);
					}
				} else if (var14.fill) {
					Pix2D.fillRectTrans(var15, var14.height, var16, var32, 256 - (var14.trans & 0xFF), var14.width);
				} else {
					Pix2D.drawRectTrans(var14.width, var15, var16, 256 - (var14.trans & 0xFF), var32, var14.height);
				}
			} else if (var14.type == 4) {
				PixFont var33 = var14.font;
				String var34 = var14.text;
				boolean var35 = false;
				if (this.chatHoveredInterfaceId == var14.id || this.sidebarHoveredInterfaceId == var14.id || this.viewportHoveredInterfaceId == var14.id) {
					var35 = true;
				}
				int var36;
				if (this.executeInterfaceScript(var14)) {
					var36 = var14.activeColour;
					if (var35 && var14.activeOverColour != 0) {
						var36 = var14.activeOverColour;
					}
					if (var14.activeText.length() > 0) {
						var34 = var14.activeText;
					}
				} else {
					var36 = var14.colour;
					if (var35 && var14.overColour != 0) {
						var36 = var14.overColour;
					}
				}
				if (var14.buttonType == 6 && this.pressedContinueOption) {
					var34 = "Please wait...";
					var36 = var14.colour;
				}
				if (Pix2D.width2d == 479) {
					if (var36 == 16776960) {
						var36 = 255;
					}
					if (var36 == 49152) {
						var36 = 16777215;
					}
				}

				for (int var37 = var16 + var33.height; var34.length() > 0; var37 += var33.height) {
					if (var34.indexOf("%") != -1) {
						do {
							int var38 = var34.indexOf("%1");
							if (var38 == -1) {
								break;
							}

							var34 = var34.substring(0, var38) + this.getIntString(this.executeClientScript(var14, 0)) + var34.substring(var38 + 2);
						} while (true);

						do {
							int var39 = var34.indexOf("%2");
							if (var39 == -1) {
								break;
							}

							var34 = var34.substring(0, var39) + this.getIntString(this.executeClientScript(var14, 1)) + var34.substring(var39 + 2);
						} while (true);

						do {
							int var40 = var34.indexOf("%3");
							if (var40 == -1) {
								break;
							}

							var34 = var34.substring(0, var40) + this.getIntString(this.executeClientScript(var14, 2)) + var34.substring(var40 + 2);
						} while (true);

						do {
							int var41 = var34.indexOf("%4");
							if (var41 == -1) {
								break;
							}

							var34 = var34.substring(0, var41) + this.getIntString(this.executeClientScript(var14, 3)) + var34.substring(var41 + 2);
						} while (true);

						do {
							int var42 = var34.indexOf("%5");
							if (var42 == -1) {
								break;
							}

							var34 = var34.substring(0, var42) + this.getIntString(this.executeClientScript(var14, 4)) + var34.substring(var42 + 2);
						} while (true);
					}

					int var43 = var34.indexOf("\\n");
					String var44;
					if (var43 == -1) {
						var44 = var34;
						var34 = "";
					} else {
						var44 = var34.substring(0, var43);
						var34 = var34.substring(var43 + 2);
					}
					if (var14.center) {
						var33.centreStringTag(var14.shadowed, var37, var36, var15 + var14.width / 2, var44);
					} else {
						var33.drawStringTag(var36, var15, var37, var14.shadowed, var44);
					}
				}
			} else if (var14.type == 5) {
				Pix32 var45;
				if (this.executeInterfaceScript(var14)) {
					var45 = var14.activeGraphic;
				} else {
					var45 = var14.graphic;
				}
				if (var45 != null) {
					var45.plotSprite(var15, var16);
				}
			} else if (var14.type == 6) {
				int var46 = Pix3D.centerX;
				int var47 = Pix3D.centerY;
				Pix3D.centerX = var15 + var14.width / 2;
				Pix3D.centerY = var16 + var14.height / 2;
				int var48 = Pix3D.sinTable[var14.xan] * var14.zoom >> 16;
				int var49 = Pix3D.cosTable[var14.xan] * var14.zoom >> 16;
				boolean var50 = this.executeInterfaceScript(var14);
				int var51;
				if (var50) {
					var51 = var14.activeAnim;
				} else {
					var51 = var14.anim;
				}
				Model var52;
				if (var51 == -1) {
					var52 = var14.getModel(-1, var50, -1);
				} else {
					SeqType var53 = SeqType.types[var51];
					var52 = var14.getModel(var53.frames[var14.seqFrame], var50, var53.iframes[var14.seqFrame]);
				}
				if (var52 != null) {
					var52.drawSimple(0, var14.yan, 0, var14.xan, 0, var48, var49);
				}
				Pix3D.centerX = var46;
				Pix3D.centerY = var47;
			} else if (var14.type == 7) {
				PixFont var54 = var14.font;
				int var55 = 0;
				for (int var56 = 0; var56 < var14.height; var56++) {
					for (int var57 = 0; var57 < var14.width; var57++) {
						if (var14.invSlotObjId[var55] > 0) {
							ObjType var58 = ObjType.get(var14.invSlotObjId[var55] - 1);
							String var59 = var58.name;
							if (var58.stackable || var14.invSlotObjCount[var55] != 1) {
								var59 = var59 + " x" + formatObjCountTagged(var14.invSlotObjCount[var55]);
							}
							int var60 = var15 + var57 * (var14.marginX + 115);
							int var61 = var16 + var56 * (var14.marginY + 12);
							if (var14.center) {
								var54.centreStringTag(var14.shadowed, var61, var14.colour, var60 + var14.width / 2, var59);
							} else {
								var54.drawStringTag(var14.colour, var60, var61, var14.shadowed, var59);
							}
						}
						var55++;
					}
				}
			}
		}
		Pix2D.setClipping(var7, var8, var9, var6);
	}

	@ObfuscatedName("client.a(IIIIIZ)V")
	public void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.imageScrollbar0.plotSprite(arg1, arg0);
		this.imageScrollbar1.plotSprite(arg1, arg0 + arg4 - 16);
		Pix2D.fillRect(arg0 + 16, arg4 - 32, arg1, 16, this.SCROLLBAR_TRACK);
		int var7 = (arg4 - 32) * arg4 / arg3;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg4 - 32 - var7) * arg2 / (arg3 - arg4);
		Pix2D.fillRect(arg0 + 16 + var8, var7, arg1, 16, this.SCROLLBAR_GRIP_FOREGROUND);
		Pix2D.vline(this.SCROLLBAR_GRIP_HIGHLIGHT, arg1, var7, arg0 + 16 + var8);
		Pix2D.vline(this.SCROLLBAR_GRIP_HIGHLIGHT, arg1 + 1, var7, arg0 + 16 + var8);
		Pix2D.hline(arg0 + 16 + var8, 16, arg1, this.SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.hline(arg0 + 17 + var8, 16, arg1, this.SCROLLBAR_GRIP_HIGHLIGHT);
		Pix2D.vline(this.SCROLLBAR_GRIP_LOWLIGHT, arg1 + 15, var7, arg0 + 16 + var8);
		Pix2D.vline(this.SCROLLBAR_GRIP_LOWLIGHT, arg1 + 14, var7 - 1, arg0 + 17 + var8);
		Pix2D.hline(arg0 + 15 + var8 + var7, 16, arg1, this.SCROLLBAR_GRIP_LOWLIGHT);
		Pix2D.hline(arg0 + 14 + var8 + var7, 15, arg1 + 1, this.SCROLLBAR_GRIP_LOWLIGHT);
	}

	@ObfuscatedName("client.b(ZI)Ljava/lang/String;")
	public static String formatObjCount(int arg1) {
		if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.a(ZI)Ljava/lang/String;")
	public static String formatObjCountTagged(int arg1) {
		String var2 = String.valueOf(arg1);
		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + "," + var2.substring(var3);
		}
		if (var2.length() > 8) {
			var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
		} else if (var2.length() > 4) {
			var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
		}
		return " " + var2;
	}

	@ObfuscatedName("client.a(IIIIZLd;IIB)V")
	public void handleScrollInput(int arg0, int arg1, int arg2, int arg3, boolean arg4, Component arg5, int arg6, int arg7) {
		if (this.scrollGrabbed) {
			this.scrollInputPadding = 32;
		} else {
			this.scrollInputPadding = 0;
		}
		this.scrollGrabbed = false;
		if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 && arg6 < arg0 + 16) {
			arg5.scrollPosition -= this.dragCycles * 4;
			if (arg4) {
				this.redrawSidebar = true;
			}
		} else if (arg7 >= arg1 && arg7 < arg1 + 16 && arg6 >= arg0 + arg3 - 16 && arg6 < arg0 + arg3) {
			arg5.scrollPosition += this.dragCycles * 4;
			if (arg4) {
				this.redrawSidebar = true;
			}
		} else if (arg7 >= arg1 - this.scrollInputPadding && arg7 < arg1 + 16 + this.scrollInputPadding && arg6 >= arg0 + 16 && arg6 < arg0 + arg3 - 16 && this.dragCycles > 0) {
			int var10 = (arg3 - 32) * arg3 / arg2;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg6 - arg0 - 16 - var10 / 2;
			int var12 = arg3 - 32 - var10;
			arg5.scrollPosition = (arg2 - arg3) * var11 / var12;
			if (arg4) {
				this.redrawSidebar = true;
			}
			this.scrollGrabbed = true;
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public String getIntString(int arg1) {
		return arg1 < 999999999 ? String.valueOf(arg1) : "*";
	}

	@ObfuscatedName("client.a(Ld;B)Z")
	public boolean executeInterfaceScript(Component arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg0.scriptComparator.length; var3++) {
			int var4 = this.executeClientScript(arg0, var3);
			int var5 = arg0.scriptOperand[var3];
			if (arg0.scriptComparator[var3] == 2) {
				if (var4 >= var5) {
					return false;
				}
			} else if (arg0.scriptComparator[var3] == 3) {
				if (var4 <= var5) {
					return false;
				}
			} else if (arg0.scriptComparator[var3] == 4) {
				if (var4 == var5) {
					return false;
				}
			} else if (var4 != var5) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.a(ILd;I)I")
	public int executeClientScript(Component arg1, int arg2) {
		if (arg1.scripts == null || arg2 >= arg1.scripts.length) {
			return -2;
		}
		try {
			int[] var5 = arg1.scripts[arg2];
			int var6 = 0;
			int var7 = 0;
			while (true) {
				int var8 = var5[var7++];
				if (var8 == 0) {
					return var6;
				}
				if (var8 == 1) {
					var6 += this.skillLevel[var5[var7++]];
				}
				if (var8 == 2) {
					var6 += this.skillBaseLevel[var5[var7++]];
				}
				if (var8 == 3) {
					var6 += this.skillExperience[var5[var7++]];
				}
				if (var8 == 4) {
					Component var9 = Component.types[var5[var7++]];
					int var10 = var5[var7++] + 1;
					for (int var11 = 0; var11 < var9.invSlotObjId.length; var11++) {
						if (var9.invSlotObjId[var11] == var10) {
							var6 += var9.invSlotObjCount[var11];
						}
					}
				}
				if (var8 == 5) {
					var6 += this.varps[var5[var7++]];
				}
				if (var8 == 6) {
					var6 += levelExperience[this.skillBaseLevel[var5[var7++]] - 1];
				}
				if (var8 == 7) {
					var6 += this.varps[var5[var7++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var6 += localPlayer.vislevel;
				}
				if (var8 == 9) {
					for (int var12 = 0; var12 < 19; var12++) {
						if (var12 == 18) {
							var12 = 20;
						}
						var6 += this.skillBaseLevel[var12];
					}
				}
				if (var8 == 10) {
					Component var13 = Component.types[var5[var7++]];
					int var14 = var5[var7++] + 1;
					for (int var15 = 0; var15 < var13.invSlotObjId.length; var15++) {
						if (var13.invSlotObjId[var15] == var14) {
							var6 += 999999999;
							break;
						}
					}
				}
				if (var8 == 11) {
					var6 += this.runenergy;
				}
				if (var8 == 12) {
					var6 += this.runweight;
				}
				if (var8 == 13) {
					int var16 = this.varps[var5[var7++]];
					int var17 = var5[var7++];
					var6 += (var16 & 0x1 << var17) == 0 ? 0 : 1;
				}
			}
		} catch (Exception var18) {
			return -1;
		}
	}

	@ObfuscatedName("client.a(IZIILd;II)V")
	public void handleInterfaceInput(int arg0, int arg2, int arg3, Component arg4, int arg5, int arg6) {
		if (arg4.type != 0 || arg4.children == null || arg4.hide || (arg5 < arg0 || arg2 < arg6 || arg5 > arg0 + arg4.width || arg2 > arg6 + arg4.height)) {
			return;
		}
		int var8 = arg4.children.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg4.childX[var9] + arg0;
			int var11 = arg4.childY[var9] + arg6 - arg3;
			Component var12 = Component.types[arg4.children[var9]];
			int var13 = var10 + var12.x;
			int var14 = var11 + var12.y;
			if ((var12.overlayer >= 0 || var12.overColour != 0) && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
				if (var12.overlayer >= 0) {
					this.lastHoveredInterfaceId = var12.overlayer;
				} else {
					this.lastHoveredInterfaceId = var12.id;
				}
			}
			if (var12.type == 0) {
				this.handleInterfaceInput(var13, arg2, var12.scrollPosition, var12, arg5, var14);
				if (var12.scroll > var12.height) {
					this.handleScrollInput(var14, var13 + var12.width, var12.scroll, var12.height, true, var12, arg2, arg5);
				}
			} else {
				if (var12.buttonType == 1 && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					boolean var15 = false;
					if (var12.clientCode != 0) {
						var15 = this.handleSocialMenuOption(var12);
					}
					if (!var15) {
						this.menuOption[this.menuSize] = var12.option;
						this.menuAction[this.menuSize] = 951;
						this.menuParamC[this.menuSize] = var12.id;
						this.menuSize++;
					}
				}
				if (var12.buttonType == 2 && this.spellSelected == 0 && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					String var16 = var12.targetVerb;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					this.menuOption[this.menuSize] = var16 + " @gre@" + var12.targetText;
					this.menuAction[this.menuSize] = 930;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 3 && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					this.menuOption[this.menuSize] = "Close";
					this.menuAction[this.menuSize] = 947;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 4 && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 465;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 5 && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 960;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 6 && !this.pressedContinueOption && arg5 >= var13 && arg2 >= var14 && arg5 < var13 + var12.width && arg2 < var14 + var12.height) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 44;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.height; var18++) {
						for (int var19 = 0; var19 < var12.width; var19++) {
							int var20 = var13 + var19 * (var12.marginX + 32);
							int var21 = var14 + var18 * (var12.marginY + 32);
							if (var17 < 20) {
								var20 += var12.invSlotOffsetX[var17];
								var21 += var12.invSlotOffsetY[var17];
							}
							if (arg5 >= var20 && arg2 >= var21 && arg5 < var20 + 32 && arg2 < var21 + 32) {
								this.hoveredSlot = var17;
								this.hoveredSlotInterfaceId = var12.id;
								if (var12.invSlotObjId[var17] > 0) {
									ObjType var22 = ObjType.get(var12.invSlotObjId[var17] - 1);
									if (this.objSelected == 1 && var12.interactable) {
										if (var12.id != this.objSelectedInterface || var17 != this.objSelectedSlot) {
											this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var22.name;
											this.menuAction[this.menuSize] = 881;
											this.menuParamA[this.menuSize] = var22.id;
											this.menuParamB[this.menuSize] = var17;
											this.menuParamC[this.menuSize] = var12.id;
											this.menuSize++;
										}
									} else if (this.spellSelected != 1 || !var12.interactable) {
										if (var12.interactable) {
											for (int var23 = 4; var23 >= 3; var23--) {
												if (var22.iop != null && var22.iop[var23] != null) {
													this.menuOption[this.menuSize] = var22.iop[var23] + " @lre@" + var22.name;
													if (var23 == 3) {
														this.menuAction[this.menuSize] = 478;
													}
													if (var23 == 4) {
														this.menuAction[this.menuSize] = 347;
													}
													this.menuParamA[this.menuSize] = var22.id;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												} else if (var23 == 4) {
													this.menuOption[this.menuSize] = "Drop @lre@" + var22.name;
													this.menuAction[this.menuSize] = 347;
													this.menuParamA[this.menuSize] = var22.id;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										if (var12.usable) {
											this.menuOption[this.menuSize] = "Use @lre@" + var22.name;
											this.menuAction[this.menuSize] = 188;
											this.menuParamA[this.menuSize] = var22.id;
											this.menuParamB[this.menuSize] = var17;
											this.menuParamC[this.menuSize] = var12.id;
											this.menuSize++;
										}
										if (var12.interactable && var22.iop != null) {
											for (int var24 = 2; var24 >= 0; var24--) {
												if (var22.iop[var24] != null) {
													this.menuOption[this.menuSize] = var22.iop[var24] + " @lre@" + var22.name;
													if (var24 == 0) {
														this.menuAction[this.menuSize] = 405;
													}
													if (var24 == 1) {
														this.menuAction[this.menuSize] = 38;
													}
													if (var24 == 2) {
														this.menuAction[this.menuSize] = 422;
													}
													this.menuParamA[this.menuSize] = var22.id;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										if (var12.iop != null) {
											for (int var25 = 4; var25 >= 0; var25--) {
												if (var12.iop[var25] != null) {
													this.menuOption[this.menuSize] = var12.iop[var25] + " @lre@" + var22.name;
													if (var25 == 0) {
														this.menuAction[this.menuSize] = 602;
													}
													if (var25 == 1) {
														this.menuAction[this.menuSize] = 596;
													}
													if (var25 == 2) {
														this.menuAction[this.menuSize] = 22;
													}
													if (var25 == 3) {
														this.menuAction[this.menuSize] = 892;
													}
													if (var25 == 4) {
														this.menuAction[this.menuSize] = 415;
													}
													this.menuParamA[this.menuSize] = var22.id;
													this.menuParamB[this.menuSize] = var17;
													this.menuParamC[this.menuSize] = var12.id;
													this.menuSize++;
												}
											}
										}
										this.menuOption[this.menuSize] = "Examine @lre@" + var22.name;
										this.menuAction[this.menuSize] = 1773;
										this.menuParamA[this.menuSize] = var22.id;
										this.menuParamC[this.menuSize] = var12.invSlotObjCount[var17];
										this.menuSize++;
									} else if ((this.activeSpellFlags & 0x10) == 16) {
										this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var22.name;
										this.menuAction[this.menuSize] = 391;
										this.menuParamA[this.menuSize] = var22.id;
										this.menuParamB[this.menuSize] = var17;
										this.menuParamC[this.menuSize] = var12.id;
										this.menuSize++;
									}
								}
							}
							var17++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public boolean handleSocialMenuOption(Component arg0) {
		int var3 = arg0.clientCode;
		if (var3 >= 1 && var3 <= 200 || !(var3 < 701 || var3 > 900)) {
			if (var3 >= 801) {
				var3 -= 701;
			} else if (var3 >= 701) {
				var3 -= 601;
			} else if (var3 >= 101) {
				var3 -= 101;
			} else {
				var3--;
			}
			this.menuOption[this.menuSize] = "Remove @whi@" + this.friendName[var3];
			this.menuAction[this.menuSize] = 557;
			this.menuSize++;
			this.menuOption[this.menuSize] = "Message @whi@" + this.friendName[var3];
			this.menuAction[this.menuSize] = 679;
			this.menuSize++;
			return true;
		} else if (var3 >= 401 && var3 <= 500) {
			this.menuOption[this.menuSize] = "Remove @whi@" + arg0.text;
			this.menuAction[this.menuSize] = 556;
			this.menuSize++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public void resetInterfaceAnimation(int arg1) {
		Component var3 = Component.types[arg1];
		for (int var4 = 0; var4 < var3.children.length && var3.children[var4] != -1; var4++) {
			Component var5 = Component.types[var3.children[var4]];
			if (var5.type == 1) {
				this.resetInterfaceAnimation(var5.id);
			}
			var5.seqFrame = 0;
			var5.seqCycle = 0;
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public boolean updateInterfaceAnimation(int arg0, int arg1) {
		boolean var4 = false;
		Component var5 = Component.types[arg0];
		for (int var6 = 0; var6 < var5.children.length && var5.children[var6] != -1; var6++) {
			Component var7 = Component.types[var5.children[var6]];
			if (var7.type == 1) {
				var4 |= this.updateInterfaceAnimation(var7.id, arg1);
			}
			if (var7.type == 6 && (var7.anim != -1 || var7.activeAnim != -1)) {
				boolean var8 = this.executeInterfaceScript(var7);
				int var9;
				if (var8) {
					var9 = var7.activeAnim;
				} else {
					var9 = var7.anim;
				}
				if (var9 != -1) {
					SeqType var10 = SeqType.types[var9];
					var7.seqCycle += arg1;
					while (var7.seqCycle > var10.getFrameLength(var7.seqFrame)) {
						var7.seqCycle -= var10.getFrameLength(var7.seqFrame) + 1;
						var7.seqFrame++;
						if (var7.seqFrame >= var10.frameCount) {
							var7.seqFrame -= var10.loops;
							if (var7.seqFrame < 0 || var7.seqFrame >= var10.frameCount) {
								var7.seqFrame = 0;
							}
						}
						var4 = true;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("client.b(II)V")
	public void updateVarp(int arg1) {
		int var4 = VarpType.types[arg1].clientcode;
		if (var4 == 0) {
			return;
		}
		int var5 = this.varps[arg1];
		if (var4 == 1) {
			if (var5 == 1) {
				Pix3D.initColourTable(0.9D);
			}
			if (var5 == 2) {
				Pix3D.initColourTable(0.8D);
			}
			if (var5 == 3) {
				Pix3D.initColourTable(0.7D);
			}
			if (var5 == 4) {
				Pix3D.initColourTable(0.6D);
			}
			ObjType.iconCache.clear();
			this.redrawFrame = true;
		}
		if (var4 == 3) {
			boolean var6 = this.midiActive;
			if (var5 == 0) {
				this.setMidiVolume(this.midiActive, 0);
				this.midiActive = true;
			}
			if (var5 == 1) {
				this.setMidiVolume(this.midiActive, -400);
				this.midiActive = true;
			}
			if (var5 == 2) {
				this.setMidiVolume(this.midiActive, -800);
				this.midiActive = true;
			}
			if (var5 == 3) {
				this.setMidiVolume(this.midiActive, -1200);
				this.midiActive = true;
			}
			if (var5 == 4) {
				this.midiActive = false;
			}
			if (this.midiActive != var6 && !lowMem) {
				if (this.midiActive) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
				} else {
					this.stopMidi();
				}
				this.nextMusicDelay = 0;
			}
		}
		if (var4 == 4) {
			if (var5 == 0) {
				this.waveEnabled = true;
				this.setWaveVolume(0);
			}
			if (var5 == 1) {
				this.waveEnabled = true;
				this.setWaveVolume(-400);
			}
			if (var5 == 2) {
				this.waveEnabled = true;
				this.setWaveVolume(-800);
			}
			if (var5 == 3) {
				this.waveEnabled = true;
				this.setWaveVolume(-1200);
			}
			if (var5 == 4) {
				this.waveEnabled = false;
			}
		}
		if (var4 == 5) {
			this.oneMouseButton = var5;
		}
		if (var4 == 6) {
			this.chatEffects = var5;
		}
		if (var4 == 8) {
			this.splitPrivateChat = var5;
			this.redrawChatback = true;
		}
		if (var4 == 9) {
			this.bankArrangeMode = var5;
		}
	}

	@ObfuscatedName("client.a(ILd;)V")
	public void updateInterfaceContent(Component arg1) {
		int var3 = arg1.clientCode;
		if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= this.friendCount) {
				arg1.text = "";
				arg1.buttonType = 0;
			} else {
				arg1.text = this.friendName[var3];
				arg1.buttonType = 1;
			}
		} else if (var3 >= 101 && var3 <= 200 || !(var3 < 801 || var3 > 900)) {
			if (var3 > 800) {
				var3 -= 701;
			} else {
				var3 -= 101;
			}
			if (var3 >= this.friendCount) {
				arg1.text = "";
				arg1.buttonType = 0;
			} else {
				if (this.friendWorld[var3] == 0) {
					arg1.text = "@red@Offline";
				} else if (this.friendWorld[var3] == nodeId) {
					arg1.text = "@gre@World-" + (this.friendWorld[var3] - 9);
				} else {
					arg1.text = "@yel@World-" + (this.friendWorld[var3] - 9);
				}
				arg1.buttonType = 1;
			}
		} else if (var3 == 203) {
			arg1.scroll = this.friendCount * 15 + 20;
			if (arg1.scroll <= arg1.height) {
				arg1.scroll = arg1.height + 1;
			}
		} else if (var3 >= 401 && var3 <= 500) {
			var3 -= 401;
			if (var3 >= this.ignoreCount) {
				arg1.text = "";
				arg1.buttonType = 0;
			} else {
				arg1.text = JString.formatDisplayName(JString.fromBase37(this.ignoreName37[var3]));
				arg1.buttonType = 1;
			}
		} else if (var3 == 503) {
			arg1.scroll = this.ignoreCount * 15 + 20;
			if (arg1.scroll <= arg1.height) {
				arg1.scroll = arg1.height + 1;
			}
		} else if (var3 == 327) {
			arg1.xan = 150;
			arg1.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			if (this.updateDesignModel) {
				for (int var4 = 0; var4 < 7; var4++) {
					int var5 = this.designKits[var4];
					if (var5 >= 0 && !IdkType.types[var5].checkModel()) {
						return;
					}
				}
				this.updateDesignModel = false;
				Model[] var6 = new Model[7];
				int var7 = 0;
				for (int var8 = 0; var8 < 7; var8++) {
					int var9 = this.designKits[var8];
					if (var9 >= 0) {
						var6[var7++] = IdkType.types[var9].getModel();
					}
				}
				Model var10 = new Model(var6, var7);
				for (int var11 = 0; var11 < 5; var11++) {
					if (this.designColours[var11] != 0) {
						var10.recolour(DESIGN_BODY_COLOUR[var11][0], DESIGN_BODY_COLOUR[var11][this.designColours[var11]]);
						if (var11 == 1) {
							var10.recolour(DESIGN_HAIR_COLOUR[0], DESIGN_HAIR_COLOUR[this.designColours[var11]]);
						}
					}
				}
				var10.createLabelReferences();
				var10.applyFrame(SeqType.types[localPlayer.readyanim].frames[0]);
				var10.calculateNormals(64, 850, -30, -50, -30, true);
				arg1.modelType = 5;
				arg1.model = 0;
				Component.cacheModel(var10, 0, 5);
			}
		} else if (var3 == 324) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = arg1.graphic;
				this.genderButtonImage1 = arg1.activeGraphic;
			}
			if (this.designGender) {
				arg1.graphic = this.genderButtonImage1;
			} else {
				arg1.graphic = this.genderButtonImage0;
			}
		} else if (var3 == 325) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = arg1.graphic;
				this.genderButtonImage1 = arg1.activeGraphic;
			}
			if (this.designGender) {
				arg1.graphic = this.genderButtonImage0;
			} else {
				arg1.graphic = this.genderButtonImage1;
			}
		} else if (var3 == 600) {
			arg1.text = this.reportAbuseInput;
			if (loopCycle % 20 < 10) {
				arg1.text = arg1.text + "|";
			} else {
				arg1.text = arg1.text + " ";
			}
		} else {
			if (var3 == 613) {
				if (this.staffmodlevel < 1) {
					arg1.text = "";
				} else if (this.reportAbuseMuteOption) {
					arg1.colour = 16711680;
					arg1.text = "Moderator option: Mute player for 48 hours: <ON>";
				} else {
					arg1.colour = 16777215;
					arg1.text = "Moderator option: Mute player for 48 hours: <OFF>";
				}
			}
			if (var3 == 650 || var3 == 655) {
				if (this.lastAddress == 0) {
					arg1.text = "";
				} else {
					String var12;
					if (this.daysSinceLogin == 0) {
						var12 = "earlier today";
					} else if (this.daysSinceLogin == 1) {
						var12 = "yesterday";
					} else {
						var12 = this.daysSinceLogin + " days ago";
					}
					arg1.text = "You last logged in " + var12 + " from: " + signlink.dns;
				}
			}
			if (var3 == 651) {
				if (this.unreadMessageCount == 0) {
					arg1.text = "0 unread messages";
					arg1.colour = 16776960;
				}
				if (this.unreadMessageCount == 1) {
					arg1.text = "1 unread message";
					arg1.colour = 65280;
				}
				if (this.unreadMessageCount > 1) {
					arg1.text = this.unreadMessageCount + " unread messages";
					arg1.colour = 65280;
				}
			}
			if (var3 == 652) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg1.text = "@yel@This is a non-members world: @whi@Since you are a member we";
					} else {
						arg1.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg1.text = "You have not yet set any password recovery questions.";
				} else {
					String var13;
					if (this.daysSinceRecoveriesChanged == 0) {
						var13 = "Earlier today";
					} else if (this.daysSinceRecoveriesChanged == 1) {
						var13 = "Yesterday";
					} else {
						var13 = this.daysSinceRecoveriesChanged + " days ago";
					}
					arg1.text = var13 + " you changed your recovery questions";
				}
			}
			if (var3 == 653) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg1.text = "@whi@recommend you use a members world instead. You may use";
					} else {
						arg1.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg1.text = "We strongly recommend you do so now to secure your account.";
				} else {
					arg1.text = "If you do not remember making this change then cancel it immediately";
				}
			}
			if (var3 == 654) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg1.text = "@whi@this world but member benefits are unavailabe whilst here.";
					} else {
						arg1.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg1.text = "Do this from the 'account management' area on our front webpage";
				} else {
					arg1.text = "Do this from the 'account management' area on our front webpage";
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public boolean handleInterfaceAction(Component arg1) {
		int var3 = arg1.clientCode;
		if (var3 == 201) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 1;
			this.socialMessage = "Enter name of friend to add to list";
		}
		if (var3 == 202) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 2;
			this.socialMessage = "Enter name of friend to delete from list";
		}
		if (var3 == 205) {
			this.idleTimeout = 250;
			return true;
		}
		if (var3 == 501) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 4;
			this.socialMessage = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 5;
			this.socialMessage = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.designKits[var4];
			if (var6 != -1) {
				while (true) {
					if (var5 == 0) {
						var6--;
						if (var6 < 0) {
							var6 = IdkType.count - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.count) {
							var6 = 0;
						}
					}
					if (!IdkType.types[var6].disable && IdkType.types[var6].type == var4 + (this.designGender ? 0 : 7)) {
						this.designKits[var4] = var6;
						this.updateDesignModel = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.designColours[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = DESIGN_BODY_COLOUR[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= DESIGN_BODY_COLOUR[var7].length) {
					var9 = 0;
				}
			}
			this.designColours[var7] = var9;
			this.updateDesignModel = true;
		}
		if (var3 == 324 && !this.designGender) {
			this.designGender = true;
			this.validateCharacterDesign();
		}
		if (var3 == 325 && this.designGender) {
			this.designGender = false;
			this.validateCharacterDesign();
		}
		if (var3 == 326) {
			// IF_PLAYERDESIGN
			this.out.pIsaac(150);
			this.out.p1(this.designGender ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.out.p1(this.designKits[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.out.p1(this.designColours[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
		}
		if (var3 >= 601 && var3 <= 612) {
			this.closeInterfaces();
			if (this.reportAbuseInput.length() > 0) {
				// REPORT_ABUSE
				this.out.pIsaac(205);
				this.out.p8(JString.toBase37(this.reportAbuseInput));
				this.out.p1(var3 - 601);
				this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.A(I)V")
	public void validateCharacterDesign() {
		this.updateDesignModel = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.designKits[var2] = -1;
			for (int var3 = 0; var3 < IdkType.count; var3++) {
				if (!IdkType.types[var3].disable && IdkType.types[var3].type == var2 + (this.designGender ? 0 : 7)) {
					this.designKits[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.ab(I)V")
	public void drawSidebar() {
		this.areaSidebar.bind();
		Pix3D.lineOffset = this.areaSidebarOffset;
		this.imageInvback.plotSprite(0, 0);
		if (this.sidebarInterfaceId != -1) {
			this.drawInterface(Component.types[this.sidebarInterfaceId], 0, 0, 0);
		} else if (this.tabInterfaceId[this.selectedTab] != -1) {
			this.drawInterface(Component.types[this.tabInterfaceId[this.selectedTab]], 0, 0, 0);
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.drawMenu();
		}
		this.areaSidebar.draw(553, super.graphics, 205);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.S(I)V")
	public void drawChat() {
		this.areaChatback.bind();
		Pix3D.lineOffset = this.areaChatbackOffset;
		this.imageChatback.plotSprite(0, 0);
		if (this.showSocialInput) {
			this.fontBold12.centreString(0, 239, 40, this.socialMessage);
			this.fontBold12.centreString(128, 239, 60, this.socialInput + "*");
		} else if (this.chatbackInputOpen) {
			this.fontBold12.centreString(0, 239, 40, "Enter amount:");
			this.fontBold12.centreString(128, 239, 60, this.chatbackInput + "*");
		} else if (this.modalMessage != null) {
			this.fontBold12.centreString(0, 239, 40, this.modalMessage);
			this.fontBold12.centreString(128, 239, 60, "Click to continue");
		} else if (this.chatInterfaceId != -1) {
			this.drawInterface(Component.types[this.chatInterfaceId], 0, 0, 0);
		} else if (this.stickyChatInterfaceId == -1) {
			PixFont var2 = this.fontPlain12;
			int var3 = 0;
			Pix2D.setClipping(0, 463, 77, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.messageText[var4] != null) {
					int var5 = this.messageType[var4];
					int var6 = 70 - var3 * 14 + this.chatScrollOffset;
					String var7 = this.messageSender[var4];
					byte var8 = 0;
					if (var7 != null && var7.startsWith("@cr1@")) {
						var7 = var7.substring(5);
						var8 = 1;
					}
					if (var7 != null && var7.startsWith("@cr2@")) {
						var7 = var7.substring(5);
						var8 = 2;
					}
					if (var5 == 0) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(this.messageText[var4], 0, 4, var6);
						}
						var3++;
					}
					if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var7))) {
						if (var6 > 0 && var6 < 110) {
							int var9 = 4;
							if (var8 == 1) {
								this.imageModIcons[0].plotSprite(var9, var6 - 12);
								var9 += 14;
							}
							if (var8 == 2) {
								this.imageModIcons[1].plotSprite(var9, var6 - 12);
								var9 += 14;
							}
							var2.drawString(var7 + ":", 0, var9, var6);
							int var10 = var9 + var2.stringWid(var7) + 8;
							var2.drawString(this.messageText[var4], 255, var10, var6);
						}
						var3++;
					}
					if ((var5 == 3 || var5 == 7) && this.splitPrivateChat == 0 && (var5 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var7))) {
						if (var6 > 0 && var6 < 110) {
							byte var11 = 4;
							var2.drawString("From", 0, var11, var6);
							int var12 = var11 + var2.stringWid("From ");
							if (var8 == 1) {
								this.imageModIcons[0].plotSprite(var12, var6 - 12);
								var12 += 14;
							}
							if (var8 == 2) {
								this.imageModIcons[1].plotSprite(var12, var6 - 12);
								var12 += 14;
							}
							var2.drawString(var7 + ":", 0, var12, var6);
							int var13 = var12 + var2.stringWid(var7) + 8;
							var2.drawString(this.messageText[var4], 8388608, var13, var6);
						}
						var3++;
					}
					if (var5 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(var7 + " " + this.messageText[var4], 8388736, 4, var6);
						}
						var3++;
					}
					if (var5 == 5 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(this.messageText[var4], 8388608, 4, var6);
						}
						var3++;
					}
					if (var5 == 6 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString("To " + var7 + ":", 0, 4, var6);
							var2.drawString(this.messageText[var4], 8388608, var2.stringWid("To " + var7) + 12, var6);
						}
						var3++;
					}
					if (var5 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.drawString(var7 + " " + this.messageText[var4], 8270336, 4, var6);
						}
						var3++;
					}
				}
			}
			Pix2D.resetClipping();
			this.chatScrollHeight = var3 * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}
			this.drawScrollbar(0, 463, this.chatScrollHeight - this.chatScrollOffset - 77, this.chatScrollHeight, 77);
			String var14;
			if (localPlayer == null || localPlayer.name == null) {
				var14 = JString.formatDisplayName(this.username);
			} else {
				var14 = localPlayer.name;
			}
			var2.drawString(var14 + ":", 0, 4, 90);
			var2.drawString(this.chatTyped + "*", 255, var2.stringWid(var14 + ": ") + 6, 90);
			Pix2D.hline(77, 479, 0, 0);
		} else {
			this.drawInterface(Component.types[this.stickyChatInterfaceId], 0, 0, 0);
		}
		if (this.menuVisible && this.menuArea == 2) {
			this.drawMenu();
		}
		this.areaChatback.draw(17, super.graphics, 357);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.I(I)V")
	public void drawMinimap() {
		this.areaMapback.bind();
		int var2 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var3 = localPlayer.x / 32 + 48;
		int var4 = 464 - localPlayer.z / 32;
		this.imageMinimap.drawRotatedMasked(this.minimapMaskLineOffsets, this.minimapMaskLineLengths, this.macroMinimapZoom + 256, 5, var3, 151, var4, 146, var2, 25);
		this.imageCompass.drawRotatedMasked(this.compassMaskLineOffsets, this.compassMaskLineLengths, 256, 0, 25, 33, 25, 33, this.orbitCameraYaw, 0);
		for (int var5 = 0; var5 < this.activeMapFunctionCount; var5++) {
			int var6 = this.activeMapFunctionX[var5] * 4 + 2 - localPlayer.x / 32;
			int var7 = this.activeMapFunctionZ[var5] * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(var6, this.activeMapFunctions[var5], var7);
		}
		for (int var8 = 0; var8 < 104; var8++) {
			for (int var9 = 0; var9 < 104; var9++) {
				LinkList var10 = this.objStacks[this.currentLevel][var8][var9];
				if (var10 != null) {
					int var11 = var8 * 4 + 2 - localPlayer.x / 32;
					int var12 = var9 * 4 + 2 - localPlayer.z / 32;
					this.drawOnMinimap(var11, this.imageMapdot0, var12);
				}
			}
		}
		for (int var13 = 0; var13 < this.npcCount; var13++) {
			ClientNpc var14 = this.npcs[this.npcIds[var13]];
			if (var14 != null && var14.isVisible() && var14.type.minimap) {
				int var15 = var14.x / 32 - localPlayer.x / 32;
				int var16 = var14.z / 32 - localPlayer.z / 32;
				this.drawOnMinimap(var15, this.imageMapdot1, var16);
			}
		}
		for (int var17 = 0; var17 < this.playerCount; var17++) {
			ClientPlayer var18 = this.players[this.playerIds[var17]];
			if (var18 != null && var18.isVisible()) {
				int var19 = var18.x / 32 - localPlayer.x / 32;
				int var20 = var18.z / 32 - localPlayer.z / 32;
				boolean var21 = false;
				long var22 = JString.toBase37(var18.name);
				for (int var24 = 0; var24 < this.friendCount; var24++) {
					if (var22 == this.friendName37[var24] && this.friendWorld[var24] != 0) {
						var21 = true;
						break;
					}
				}
				if (var21) {
					this.drawOnMinimap(var19, this.imageMapdot3, var20);
				} else {
					this.drawOnMinimap(var19, this.imageMapdot2, var20);
				}
			}
		}
		if (this.hintType != 0 && loopCycle % 20 < 10) {
			if (this.hintType == 1 && this.hintNpc >= 0 && this.hintNpc < this.npcs.length) {
				ClientNpc var25 = this.npcs[this.hintNpc];
				if (var25 != null) {
					int var26 = var25.x / 32 - localPlayer.x / 32;
					int var27 = var25.z / 32 - localPlayer.z / 32;
					this.drawMinimapArrow(var27, this.imageMapmarker1, var26);
				}
			}
			if (this.hintType == 2) {
				int var28 = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
				int var29 = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
				this.drawMinimapArrow(var29, this.imageMapmarker1, var28);
			}
			if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
				ClientPlayer var30 = this.players[this.hintPlayer];
				if (var30 != null) {
					int var31 = var30.x / 32 - localPlayer.x / 32;
					int var32 = var30.z / 32 - localPlayer.z / 32;
					this.drawMinimapArrow(var32, this.imageMapmarker1, var31);
				}
			}
		}
		if (this.flagSceneTileX != 0) {
			int var33 = this.flagSceneTileX * 4 + 2 - localPlayer.x / 32;
			int var34 = this.flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(var33, this.imageMapmarker0, var34);
		}
		Pix2D.fillRect(78, 3, 97, 3, 16777215);
		this.areaViewport.bind();
	}

	@ObfuscatedName("client.a(ILjb;II)V")
	public void drawMinimapArrow(int arg0, Pix32 arg1, int arg2) {
		int var5 = arg2 * arg2 + arg0 * arg0;
		if (var5 <= 4225 || var5 >= 90000) {
			this.drawOnMinimap(arg2, arg1, arg0);
			return;
		}
		int var6 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var7 = Model.sinTable[var6];
		int var8 = Model.cosTable[var6];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var11 = arg0 * var9 + arg2 * var10 >> 16;
		int var12 = arg0 * var10 - arg2 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.imageMapedge.drawRotated(15, 256, 15, var15 + 94 + 4 - 10, 20, 83 - var16 - 20, var13, 20);
	}

	@ObfuscatedName("client.b(ILjb;II)V")
	public void drawOnMinimap(int arg0, Pix32 arg1, int arg2) {
		int var5 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var6 = arg0 * arg0 + arg2 * arg2;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.sinTable[var5];
		int var8 = Model.cosTable[var5];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var11 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var12 = arg2 * var9 + arg0 * var11 >> 16;
		int var13 = arg2 * var11 - arg0 * var9 >> 16;
		if (var6 > 2500) {
			arg1.drawMasked(var12 + 94 - arg1.owi / 2 + 4, this.imageMapback, 83 - var13 - arg1.ohi / 2 - 4);
		} else {
			arg1.plotSprite(var12 + 94 - arg1.owi / 2 + 4, 83 - var13 - arg1.ohi / 2 - 4);
		}
	}

	@ObfuscatedName("client.a(ZLjava/lang/String;ILjava/lang/String;)V")
	public void addMessage(String arg1, int arg2, String arg3) {
		if (arg2 == 0 && this.stickyChatInterfaceId != -1) {
			this.modalMessage = arg3;
			super.mouseClickButton = 0;
		}
		if (this.chatInterfaceId == -1) {
			this.redrawChatback = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			this.messageType[var5] = this.messageType[var5 - 1];
			this.messageSender[var5] = this.messageSender[var5 - 1];
			this.messageText[var5] = this.messageText[var5 - 1];
		}
		this.messageType[0] = arg2;
		this.messageSender[0] = arg1;
		this.messageText[0] = arg3;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;)Z")
	public boolean isFriend(String arg1) {
		if (arg1 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.friendCount; var3++) {
			if (arg1.equalsIgnoreCase(this.friendName[var3])) {
				return true;
			}
		}
		return arg1.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("client.a(IJ)V")
	public void addFriend(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.friendCount >= 100 && this.membersAccount != 1) {
			this.addMessage("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else if (this.friendCount >= 200) {
			this.addMessage("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else {
			String var4 = JString.formatDisplayName(JString.fromBase37(arg1));
			for (int var5 = 0; var5 < this.friendCount; var5++) {
				if (this.friendName37[var5] == arg1) {
					this.addMessage("", 0, var4 + " is already on your friend list");
					return;
				}
			}
			for (int var6 = 0; var6 < this.ignoreCount; var6++) {
				if (this.ignoreName37[var6] == arg1) {
					this.addMessage("", 0, "Please remove " + var4 + " from your ignore list first");
					return;
				}
			}
			if (!var4.equals(localPlayer.name)) {
				this.friendName[this.friendCount] = var4;
				this.friendName37[this.friendCount] = arg1;
				this.friendWorld[this.friendCount] = 0;
				this.friendCount++;
				this.redrawSidebar = true;
				// FRIENDLIST_ADD
				this.out.pIsaac(116);
				this.out.p8(arg1);
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public void removeFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.friendCount; var4++) {
			if (this.friendName37[var4] == arg0) {
				this.friendCount--;
				this.redrawSidebar = true;
				for (int var5 = var4; var5 < this.friendCount; var5++) {
					this.friendName[var5] = this.friendName[var5 + 1];
					this.friendWorld[var5] = this.friendWorld[var5 + 1];
					this.friendName37[var5] = this.friendName37[var5 + 1];
				}
				// FRIENDLIST_DEL
				this.out.pIsaac(61);
				this.out.p8(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.ignoreCount >= 100) {
			this.addMessage("", 0, "Your ignore list is full. Max of 100 hit");
			return;
		}
		String var4 = JString.formatDisplayName(JString.fromBase37(arg0));
		for (int var5 = 0; var5 < this.ignoreCount; var5++) {
			if (this.ignoreName37[var5] == arg0) {
				this.addMessage("", 0, var4 + " is already on your ignore list");
				return;
			}
		}
		for (int var6 = 0; var6 < this.friendCount; var6++) {
			if (this.friendName37[var6] == arg0) {
				this.addMessage("", 0, "Please remove " + var4 + " from your friend list first");
				return;
			}
		}
		this.ignoreName37[this.ignoreCount++] = arg0;
		this.redrawSidebar = true;
		// IGNORELIST_ADD
		this.out.pIsaac(20);
		this.out.p8(arg0);
	}

	@ObfuscatedName("client.a(ZJ)V")
	public void removeIgnore(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.ignoreCount; var4++) {
			if (this.ignoreName37[var4] == arg1) {
				this.ignoreCount--;
				this.redrawSidebar = true;
				for (int var5 = var4; var5 < this.ignoreCount; var5++) {
					this.ignoreName37[var5] = this.ignoreName37[var5 + 1];
				}
				// IGNORELIST_DEL
				this.out.pIsaac(4);
				this.out.p8(arg1);
				return;
			}
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public void unloadTitle() {
		this.flameActive = false;
		while (this.flameThread) {
			this.flameActive = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
		this.imageTitlebox = null;
		this.imageTitlebutton = null;
		this.imageRunes = null;
		this.flameGradient = null;
		this.flameGradient0 = null;
		this.flameGradient1 = null;
		this.flameGradient2 = null;
		this.flameBuffer0 = null;
		this.flameBuffer1 = null;
		this.flameBuffer2 = null;
		this.flameBuffer3 = null;
		this.imageFlamesLeft = null;
		this.imageFlamesRight = null;
	}

	// ----

	@ObfuscatedName("client.o(I)V")
	public void runFlames() {
		this.flameThread = true;
		try {
			long var2 = System.currentTimeMillis();
			int var4 = 0;
			int var5 = 20;
			while (this.flameActive) {
				this.flameCycle++;
				this.updateFlames();
				this.updateFlames();
				this.drawFlames();
				var4++;
				if (var4 > 10) {
					long var6 = System.currentTimeMillis();
					int var8 = (int) (var6 - var2) / 10 - var5;
					var5 = 40 - var8;
					if (var5 < 5) {
						var5 = 5;
					}
					var4 = 0;
					var2 = var6;
				}
				try {
					Thread.sleep((long) var5);
				} catch (Exception var9) {
				}
			}
		} catch (Exception var10) {
		}
		this.flameThread = false;
	}

	@ObfuscatedName("client.z(I)V")
	public void updateFlames() {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var4 = (int) (Math.random() * 100.0D);
			if (var4 < 50) {
				this.flameBuffer2[var3 + (var2 - 2 << 7)] = 255;
			}
		}
		for (int var5 = 0; var5 < 100; var5++) {
			int var6 = (int) (Math.random() * 124.0D) + 2;
			int var7 = (int) (Math.random() * 128.0D) + 128;
			int var8 = var6 + (var7 << 7);
			this.flameBuffer2[var8] = 192;
		}
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			for (int var10 = 1; var10 < 127; var10++) {
				int var11 = var10 + (var9 << 7);
				this.flameBuffer3[var11] = (this.flameBuffer2[var11 - 1] + this.flameBuffer2[var11 + 1] + this.flameBuffer2[var11 - 128] + this.flameBuffer2[var11 + 128]) / 4;
			}
		}
		this.flameCycle0 += 128;
		if (this.flameCycle0 > this.flameBuffer0.length) {
			this.flameCycle0 -= this.flameBuffer0.length;
			int var12 = (int) (Math.random() * 12.0D);
			this.updateFlameBuffer(this.imageRunes[var12]);
		}
		for (int var13 = 1; var13 < var2 - 1; var13++) {
			for (int var14 = 1; var14 < 127; var14++) {
				int var15 = var14 + (var13 << 7);
				int var16 = this.flameBuffer3[var15 + 128] - this.flameBuffer0[var15 + this.flameCycle0 & this.flameBuffer0.length - 1] / 5;
				if (var16 < 0) {
					var16 = 0;
				}
				this.flameBuffer2[var15] = var16;
			}
		}
		for (int var17 = 0; var17 < var2 - 1; var17++) {
			this.flameLineOffset[var17] = this.flameLineOffset[var17 + 1];
		}
		this.flameLineOffset[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (this.flameGradientCycle0 > 0) {
			this.flameGradientCycle0 -= 4;
		}
		if (this.flameGradientCycle1 > 0) {
			this.flameGradientCycle1 -= 4;
		}
		if (this.flameGradientCycle0 == 0 && this.flameGradientCycle1 == 0) {
			int var18 = (int) (Math.random() * 2000.0D);
			if (var18 == 0) {
				this.flameGradientCycle0 = 1024;
			}
			if (var18 == 1) {
				this.flameGradientCycle1 = 1024;
			}
		}
	}

	@ObfuscatedName("client.a(ILkb;)V")
	public void updateFlameBuffer(Pix8 arg1) {
		short var3 = 256;
		for (int var5 = 0; var5 < this.flameBuffer0.length; var5++) {
			this.flameBuffer0[var5] = 0;
		}
		for (int var6 = 0; var6 < 5000; var6++) {
			int var7 = (int) (Math.random() * 128.0D * (double) var3);
			this.flameBuffer0[var7] = (int) (Math.random() * 256.0D);
		}
		for (int var8 = 0; var8 < 20; var8++) {
			for (int var9 = 1; var9 < var3 - 1; var9++) {
				for (int var10 = 1; var10 < 127; var10++) {
					int var11 = var10 + (var9 << 7);
					this.flameBuffer1[var11] = (this.flameBuffer0[var11 - 1] + this.flameBuffer0[var11 + 1] + this.flameBuffer0[var11 - 128] + this.flameBuffer0[var11 + 128]) / 4;
				}
			}
			int[] var12 = this.flameBuffer0;
			this.flameBuffer0 = this.flameBuffer1;
			this.flameBuffer1 = var12;
		}
		if (arg1 != null) {
			int var13 = 0;
			for (int var14 = 0; var14 < arg1.hi; var14++) {
				for (int var15 = 0; var15 < arg1.wi; var15++) {
					if (arg1.pixels[var13++] != 0) {
						int var16 = var15 + 16 + arg1.xof;
						int var17 = var14 + 16 + arg1.yof;
						int var18 = var16 + (var17 << 7);
						this.flameBuffer0[var18] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public void drawFlames() {
		short var2 = 256;
		if (this.flameGradientCycle0 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.flameGradientCycle0 > 768) {
					this.flameGradient[var3] = this.mix(1024 - this.flameGradientCycle0, this.flameGradient0[var3], this.flameGradient1[var3]);
				} else if (this.flameGradientCycle0 > 256) {
					this.flameGradient[var3] = this.flameGradient1[var3];
				} else {
					this.flameGradient[var3] = this.mix(256 - this.flameGradientCycle0, this.flameGradient1[var3], this.flameGradient0[var3]);
				}
			}
		} else if (this.flameGradientCycle1 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.flameGradientCycle1 > 768) {
					this.flameGradient[var4] = this.mix(1024 - this.flameGradientCycle1, this.flameGradient0[var4], this.flameGradient2[var4]);
				} else if (this.flameGradientCycle1 > 256) {
					this.flameGradient[var4] = this.flameGradient2[var4];
				} else {
					this.flameGradient[var4] = this.mix(256 - this.flameGradientCycle1, this.flameGradient2[var4], this.flameGradient0[var4]);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				this.flameGradient[var5] = this.flameGradient0[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.imageTitle0.data[var6] = this.imageFlamesLeft.pixels[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var10 = this.flameLineOffset[var9] * (var2 - var9) / var2;
			int var11 = var10 + 22;
			if (var11 < 0) {
				var11 = 0;
			}
			var7 += var11;
			for (int var12 = var11; var12 < 128; var12++) {
				int var13 = this.flameBuffer2[var7++];
				if (var13 == 0) {
					var8++;
				} else {
					int var15 = 256 - var13;
					int var16 = this.flameGradient[var13];
					int var17 = this.imageTitle0.data[var8];
					this.imageTitle0.data[var8++] = ((var16 & 0xFF00FF) * var13 + (var17 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 + (var17 & 0xFF00) * var15 & 0xFF0000) >> 8;
				}
			}
			var8 += var11;
		}
		this.imageTitle0.draw(0, super.graphics, 0);
		for (int var18 = 0; var18 < 33920; var18++) {
			this.imageTitle1.data[var18] = this.imageFlamesRight.pixels[var18];
		}
		int var19 = 0;
		int var20 = 1176;
		for (int var21 = 1; var21 < var2 - 1; var21++) {
			int var22 = this.flameLineOffset[var21] * (var2 - var21) / var2;
			int var23 = 103 - var22;
			int var24 = var20 + var22;
			for (int var25 = 0; var25 < var23; var25++) {
				int var26 = this.flameBuffer2[var19++];
				if (var26 == 0) {
					var24++;
				} else {
					int var28 = 256 - var26;
					int var29 = this.flameGradient[var26];
					int var30 = this.imageTitle1.data[var24];
					this.imageTitle1.data[var24++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var19 += 128 - var23;
			var20 = var24 + (128 - var23 - var22);
		}
		this.imageTitle1.draw(637, super.graphics, 0);
	}

	@ObfuscatedName("client.a(IIII)I")
	public int mix(int arg0, int arg2, int arg3) {
		int var5 = 256 - arg0;
		return ((arg2 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg2 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg0 & 0xFF0000) >> 8;
	}
}
