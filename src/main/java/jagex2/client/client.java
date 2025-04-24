package jagex2.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.zip.CRC32;

import deob.*;
import jagex2.client.sign.signlink;
import jagex2.config.*;
import jagex2.dash3d.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.*;
import jagex2.io.*;
import jagex2.dash3d.CollisionMap;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;

public class client extends GameShell {

	@ObfuscatedName("client.ab")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.bb")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.cb")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.db")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.eb")
	public int nextMusicDelay;

	@ObfuscatedName("client.gb")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.hb")
	public long[] friendName37 = new long[200];

	@ObfuscatedName("client.ib")
	public static int field1209;

	@ObfuscatedName("client.jb")
	public int field1210;

	@ObfuscatedName("client.kb")
	public int[] field1211 = new int[1000];

	@ObfuscatedName("client.lb")
	public int[] field1212 = new int[1000];

	@ObfuscatedName("client.mb")
	public String socialMessage = "";

	@ObfuscatedName("client.nb")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.ob")
	public int[] flameGradient;

	@ObfuscatedName("client.pb")
	public int[] flameGradient0;

	@ObfuscatedName("client.qb")
	public int[] flameGradient1;

	@ObfuscatedName("client.rb")
	public int[] flameGradient2;

	@ObfuscatedName("client.sb")
	public static int field1219;

	@ObfuscatedName("client.ub")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.vb")
	public int[] skillBaseLevel = new int[50];

	@ObfuscatedName("client.xb")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yb")
	public int selectedTab = 3;

	@ObfuscatedName("client.zb")
	public int field1226;

	@ObfuscatedName("client.ac")
	public int flashingTab = -1;

	@ObfuscatedName("client.bc")
	public int objDragCycles;

	@ObfuscatedName("client.cc")
	public int field1255;

	@ObfuscatedName("client.dc")
	public int socialAction;

	@ObfuscatedName("client.ec")
	public int[] cameraModifierCycle = new int[5];

	@ObfuscatedName("client.fc")
	public World3D scene;

	@ObfuscatedName("client.gc")
	public int objDragInterfaceId;

	@ObfuscatedName("client.hc")
	public int objDragSlot;

	@ObfuscatedName("client.ic")
	public int objDragArea;

	@ObfuscatedName("client.jc")
	public int objGrabX;

	@ObfuscatedName("client.kc")
	public int objGrabY;

	@ObfuscatedName("client.lc")
	public int field1264;

	@ObfuscatedName("client.mc")
	public int minimapLevel = -1;

	@ObfuscatedName("client.nc")
	public int macroCameraOffsetY;

	@ObfuscatedName("client.oc")
	public int cameraYModifier = 2;

	@ObfuscatedName("client.pc")
	public byte[][] sceneMapLandData;

	@ObfuscatedName("client.qc")
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.L")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.P")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.R")
	public int reportAbuseInterfaceId = -1;

	@ObfuscatedName("client.V")
	public boolean updateDesignModel = false;

	@ObfuscatedName("client.Z")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.Bb")
	public int cameraYawModifier = 1;

	@ObfuscatedName("client.Cb")
	public int viewportOverlayInterfaceId = -1;

	@ObfuscatedName("client.Db")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.Eb")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Fb")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.Hb")
	public int[] skillExperience = new int[50];

	@ObfuscatedName("client.Jb")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Kb")
	public int[] field1237 = new int[5];

	@ObfuscatedName("client.Mb")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.Ob")
	public int[] field1241 = new int[100];

	@ObfuscatedName("client.Pb")
	public int[] field1242 = new int[5];

	@ObfuscatedName("client.Wb")
	public boolean field1249 = false;

	@ObfuscatedName("client.Yb")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.Zb")
	public boolean field1252 = true;

	@ObfuscatedName("client.sc")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.uc")
	public int viewportInterfaceId = -1;

	@ObfuscatedName("client.xc")
	public int field1276 = 3353893;

	@ObfuscatedName("client.zc")
	public int[] varps = new int[2000];

	@ObfuscatedName("client.Ac")
	public int[] field1279 = new int[5];

	@ObfuscatedName("client.Bc")
	public int field1280 = 5063219;

	@ObfuscatedName("client.Ec")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Fc")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Gc")
	public PlayerEntity[] players = new PlayerEntity[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Ic")
	public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Kc")
	public int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Lc")
	public Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Mc")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.Pc")
	public int projectX = -1;

	@ObfuscatedName("client.Qc")
	public int projectY = -1;

	@ObfuscatedName("client.Zc")
	public int field1304 = 2301979;

	@ObfuscatedName("client.ad")
	public final int[] field1305 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.sd")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.td")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public CRC32 field1329 = new CRC32();

	@ObfuscatedName("client.Ad")
	public int minimapZoomModifier = 1;

	@ObfuscatedName("client.Bd")
	public Pix8[] imageModIcons = new Pix8[2];

	@ObfuscatedName("client.Fd")
	public String chatbackInput = "";

	@ObfuscatedName("client.Id")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.Od")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.Vd")
	public boolean[] field1352 = new boolean[5];

	@ObfuscatedName("client.Zd")
	public boolean menuVisible = false;

	@ObfuscatedName("client.be")
	public boolean flameThread = false;

	@ObfuscatedName("client.ee")
	public boolean ingame = false;

	@ObfuscatedName("client.te")
	public boolean chatbackInputOpen = false;

	@ObfuscatedName("client.Be")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.Ge")
	public Pix32[] imageHeadicon = new Pix32[20];

	@ObfuscatedName("client.Ne")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.Oe")
	public int field1397 = -1;

	@ObfuscatedName("client.Ve")
	public Packet out = Packet.alloc(5, 1);

	@ObfuscatedName("client.ef")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.tf")
	public int[] comapssMaskLineOffsets = new int[33];

	@ObfuscatedName("client.vf")
	public int[] messageType = new int[100];

	@ObfuscatedName("client.wf")
	public String[] messageSender = new String[100];

	@ObfuscatedName("client.xf")
	public String[] messageText = new String[100];

	@ObfuscatedName("client.yf")
	public LinkList[][][] field1432 = new LinkList[4][104][104];

	@ObfuscatedName("client.Df")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Ef")
	public NpcEntity[] npcs = new NpcEntity[8192];

	@ObfuscatedName("client.Gf")
	public int[] npcIds = new int[8192];

	@ObfuscatedName("client.Of")
	public Pix32[] field1448 = new Pix32[1000];

	@ObfuscatedName("client.Pf")
	public String socialInput = "";

	@ObfuscatedName("client.Qf")
	public boolean errorStarted = false;

	@ObfuscatedName("client.Rf")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.Sf")
	public boolean flameActive = false;

	@ObfuscatedName("client.ag")
	public boolean midiActive = true;

	@ObfuscatedName("client.eg")
	public int[] CHAT_COLOURS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.kg")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.lg")
	public boolean cutscene = false;

	@ObfuscatedName("client.mg")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.xg")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.yg")
	public Packet in = Packet.alloc(5, 1);

	@ObfuscatedName("client.Ag")
	public int cameraOffsetXModifier = 2;

	@ObfuscatedName("client.Rg")
	public boolean errorHost = false;

	@ObfuscatedName("client.Tg")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.Vg")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Wg")
	public String loginMessage0 = "";

	@ObfuscatedName("client.Xg")
	public String loginMessage1 = "";

	@ObfuscatedName("client.Yg")
	public int[] field1510 = new int[2000];

	@ObfuscatedName("client.Zg")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.ah")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.ch")
	public Pix32[] imageHitmark = new Pix32[20];

	@ObfuscatedName("client.hh")
	public int[] skillLevel = new int[50];

	@ObfuscatedName("client.jh")
	public Packet login = Packet.alloc(5, 1);

	@ObfuscatedName("client.sh")
	public int lastWaveId = -1;

	@ObfuscatedName("client.wh")
	public int minimapAngleModifier = 2;

	@ObfuscatedName("client.xh")
	public int field1535 = 7759444;

	@ObfuscatedName("client.Ah")
	public boolean field1538 = false;

	@ObfuscatedName("client.Ch")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.Qh")
	public CollisionMap[] levelCollisionMap = new CollisionMap[4];

	@ObfuscatedName("client.Sh")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.Th")
	public int[] designColours = new int[5];

	@ObfuscatedName("client.Vh")
	public int field1559 = 128;

	@ObfuscatedName("client.Zh")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.bi")
	public int stickyChatInterfaceId = -1;

	@ObfuscatedName("client.ci")
	public Pix32[] imageMapfunction = new Pix32[50];

	@ObfuscatedName("client.di")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.fi")
	public boolean midiFading = false;

	@ObfuscatedName("client.gi")
	public boolean designGender = true;

	@ObfuscatedName("client.ji")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.ki")
	public Pix8[] imageMapscene = new Pix8[50];

	@ObfuscatedName("client.ni")
	public String username = "";

	@ObfuscatedName("client.oi")
	public String password = "";

	@ObfuscatedName("client.pi")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Bi")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.Di")
	public Pix8[] imageSideicons = new Pix8[13];

	@ObfuscatedName("client.Gi")
	public String chatTyped = "";

	@ObfuscatedName("client.Hi")
	public int[] designKits = new int[7];

	@ObfuscatedName("client.Ji")
	public Pix32[] imageCross = new Pix32[8];

	@ObfuscatedName("client.Ri")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.Xi")
	public boolean pressedContinueOption = false;

	@ObfuscatedName("client.Yi")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.Zi")
	public boolean awaitingSync = false;

	@ObfuscatedName("client.aj")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.dj")
	public Component chatInterface = new Component();

	@ObfuscatedName("client.fj")
	public boolean flamesThread = false;

	@ObfuscatedName("client.kj")
	public boolean showSocialInput = false;

	@ObfuscatedName("client.mj")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.nj")
	public int[] chatX = new int[this.MAX_CHATS];

	@ObfuscatedName("client.oj")
	public int[] chatY = new int[this.MAX_CHATS];

	@ObfuscatedName("client.pj")
	public int[] chatHeight = new int[this.MAX_CHATS];

	@ObfuscatedName("client.qj")
	public int[] chatWidth = new int[this.MAX_CHATS];

	@ObfuscatedName("client.rj")
	public int[] chatColour = new int[this.MAX_CHATS];

	@ObfuscatedName("client.sj")
	public int[] chatEffect = new int[this.MAX_CHATS];

	@ObfuscatedName("client.tj")
	public int[] chatTimer = new int[this.MAX_CHATS];

	@ObfuscatedName("client.uj")
	public String[] chatMessage = new String[this.MAX_CHATS];

	@ObfuscatedName("client.N")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.we")
	public static final int[][] DESIGN_BODY_COLOUR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Pe")
	public static int nodeId = 10;

	@ObfuscatedName("client.Re")
	public static boolean membersWorld = true;

	@ObfuscatedName("client.vg")
	public static int[] levelExperience = new int[99];

	@ObfuscatedName("client.qh")
	public static final int[] DESIGN_HAIR_COLOUR;

	@ObfuscatedName("client.Si")
	public static BigInteger LOGIN_RSAE;

	@ObfuscatedName("client.M")
	public int worldLocationState;

	@ObfuscatedName("client.O")
	public int unreadMessageCount;

	@ObfuscatedName("client.T")
	public static int cyclelogic1;

	@ObfuscatedName("client.Ab")
	public int macroCameraOffsetZ;

	@ObfuscatedName("client.Gb")
	public int runenergy;

	@ObfuscatedName("client.Lb")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.Qb")
	public int psize;

	@ObfuscatedName("client.Rb")
	public int ptype;

	@ObfuscatedName("client.Sb")
	public int idleNetCycles;

	@ObfuscatedName("client.Tb")
	public int noTimeoutCycle;

	@ObfuscatedName("client.Ub")
	public int idleTimeout;

	@ObfuscatedName("client.Vb")
	public int chatScrollOffset;

	@ObfuscatedName("client.wc")
	public int chatTradeMode;

	@ObfuscatedName("client.yc")
	public int field1277;

	@ObfuscatedName("client.Hc")
	public int playerCount;

	@ObfuscatedName("client.Jc")
	public int entityUpdateCount;

	@ObfuscatedName("client.Nc")
	public int flameGradientCycle0;

	@ObfuscatedName("client.Oc")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Rc")
	public int lastHoveredInterfaceId;

	@ObfuscatedName("client.Sc")
	public int selectedCycle;

	@ObfuscatedName("client.Tc")
	public int field1298;

	@ObfuscatedName("client.Uc")
	public int field1299;

	@ObfuscatedName("client.Vc")
	public int selectedArea;

	@ObfuscatedName("client.cd")
	public int spellSelected;

	@ObfuscatedName("client.dd")
	public int field1308;

	@ObfuscatedName("client.ed")
	public int activeSpellFlags;

	@ObfuscatedName("client.rd")
	public int entityRemovalCount;

	@ObfuscatedName("client.xd")
	public int lastWaveLength;

	@ObfuscatedName("client.zd")
	public int macroMinimapZoom;

	@ObfuscatedName("client.Cd")
	public int chatEffects;

	@ObfuscatedName("client.Dd")
	public int waveCount;

	@ObfuscatedName("client.Ed")
	public int flameCycle0;

	@ObfuscatedName("client.Gd")
	public int field1337;

	@ObfuscatedName("client.Hd")
	public int field1338;

	@ObfuscatedName("client.Jd")
	public int sceneBaseTileX;

	@ObfuscatedName("client.Kd")
	public int sceneBaseTileZ;

	@ObfuscatedName("client.Ld")
	public int field1342;

	@ObfuscatedName("client.Md")
	public int field1343;

	@ObfuscatedName("client.Nd")
	public static int drawCycle;

	@ObfuscatedName("client.Pd")
	public int splitPrivateChat;

	@ObfuscatedName("client.Qd")
	public int hintTileX;

	@ObfuscatedName("client.Rd")
	public int hintTileZ;

	@ObfuscatedName("client.Sd")
	public int hintHeight;

	@ObfuscatedName("client.Td")
	public int hintOffsetX;

	@ObfuscatedName("client.Ud")
	public int hintOffsetZ;

	@ObfuscatedName("client.ce")
	public int ignoreCount;

	@ObfuscatedName("client.de")
	public int overrideChat;

	@ObfuscatedName("client.ve")
	public int staffmodlevel;

	@ObfuscatedName("client.xe")
	public int ptype0;

	@ObfuscatedName("client.ye")
	public int ptype1;

	@ObfuscatedName("client.ze")
	public int ptype2;

	@ObfuscatedName("client.Ae")
	public int cameraOffsetCycle;

	@ObfuscatedName("client.Ce")
	public int flameCycle;

	@ObfuscatedName("client.De")
	public static int field1386;

	@ObfuscatedName("client.Fe")
	public int runweight;

	@ObfuscatedName("client.Qe")
	public static int portOffset;

	@ObfuscatedName("client.Ue")
	public int field1403;

	@ObfuscatedName("client.Ze")
	public int chatPublicMode;

	@ObfuscatedName("client.bf")
	public int wildernessLevel;

	@ObfuscatedName("client.cf")
	public int field1411;

	@ObfuscatedName("client.ff")
	public int titleScreenState;

	@ObfuscatedName("client.gf")
	public int field1415;

	@ObfuscatedName("client.hf")
	public int inMultizone;

	@ObfuscatedName("client.kf")
	public int friendCount;

	@ObfuscatedName("client.rf")
	public int warnMembersInNonMembers;

	@ObfuscatedName("client.Ff")
	public int npcCount;

	@ObfuscatedName("client.Tf")
	public static int field1453;

	@ObfuscatedName("client.Vf")
	public int menuArea;

	@ObfuscatedName("client.Wf")
	public int menuX;

	@ObfuscatedName("client.Xf")
	public int menuY;

	@ObfuscatedName("client.Yf")
	public int menuWidth;

	@ObfuscatedName("client.Zf")
	public int menuHeight;

	@ObfuscatedName("client.bg")
	public int flagSceneTileX;

	@ObfuscatedName("client.cg")
	public int flagSceneTileZ;

	@ObfuscatedName("client.fg")
	public int cutsceneDstLocalTileX;

	@ObfuscatedName("client.gg")
	public int cutsceneDstLocalTileZ;

	@ObfuscatedName("client.hg")
	public int cutsceneDstHeight;

	@ObfuscatedName("client.ig")
	public int cutsceneRotateSpeed;

	@ObfuscatedName("client.jg")
	public int cutsceneRotateAcceleration;

	@ObfuscatedName("client.pg")
	public int field1475;

	@ObfuscatedName("client.qg")
	public int field1476;

	@ObfuscatedName("client.tg")
	public int currentLevel;

	@ObfuscatedName("client.wg")
	public int minimapOffsetCycle;

	@ObfuscatedName("client.zg")
	public int macroCameraOffsetX;

	@ObfuscatedName("client.Bg")
	public int lastAddress;

	@ObfuscatedName("client.Cg")
	public int sceneDelta;

	@ObfuscatedName("client.Eg")
	public int chatHoveredInterfaceId;

	@ObfuscatedName("client.Lg")
	public int objSelected;

	@ObfuscatedName("client.Mg")
	public int field1498;

	@ObfuscatedName("client.Ng")
	public int field1499;

	@ObfuscatedName("client.Og")
	public int field1500;

	@ObfuscatedName("client.Ug")
	public static int field1506;

	@ObfuscatedName("client.bh")
	public static int field1513;

	@ObfuscatedName("client.kh")
	public int oneMouseButton;

	@ObfuscatedName("client.mh")
	public static int field1524;

	@ObfuscatedName("client.oh")
	public int titleLoginField;

	@ObfuscatedName("client.ph")
	public int sceneState;

	@ObfuscatedName("client.rh")
	public int daysSinceLogin;

	@ObfuscatedName("client.th")
	public int hoveredSlot;

	@ObfuscatedName("client.uh")
	public int hoveredSlotInterfaceId;

	@ObfuscatedName("client.vh")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Dh")
	public int viewportHoveredInterfaceId;

	@ObfuscatedName("client.Eh")
	public static int field1542;

	@ObfuscatedName("client.Gh")
	public int tryMoveNearest;

	@ObfuscatedName("client.Ih")
	public int cutsceneSrcLocalTileX;

	@ObfuscatedName("client.Jh")
	public int cutsceneSrcLocalTileZ;

	@ObfuscatedName("client.Kh")
	public int cutsceneSrcHeight;

	@ObfuscatedName("client.Lh")
	public int cutsceneMoveSpeed;

	@ObfuscatedName("client.Mh")
	public int cutsceneMoveAcceleration;

	@ObfuscatedName("client.Nh")
	public int bankArrangeMode;

	@ObfuscatedName("client.Ph")
	public static int field1553;

	@ObfuscatedName("client.Uh")
	public static int field1558;

	@ObfuscatedName("client.Wh")
	public int macroCameraOrbitYaw;

	@ObfuscatedName("client.Xh")
	public int field1561;

	@ObfuscatedName("client.Yh")
	public int field1562;

	@ObfuscatedName("client.ai")
	public int menuSize;

	@ObfuscatedName("client.ei")
	public int midiSong;

	@ObfuscatedName("client.mi")
	public int chatPrivateMode;

	@ObfuscatedName("client.qi")
	public int sceneCycle;

	@ObfuscatedName("client.ri")
	public int hintType;

	@ObfuscatedName("client.si")
	public int dragCycles;

	@ObfuscatedName("client.yi")
	public static int loopCycle;

	@ObfuscatedName("client.zi")
	public int sceneCenterZoneX;

	@ObfuscatedName("client.Ai")
	public int sceneCenterZoneZ;

	@ObfuscatedName("client.Ci")
	public int systemUpdateTimer;

	@ObfuscatedName("client.Ei")
	public int field1594;

	@ObfuscatedName("client.Ii")
	public static int field1598;

	@ObfuscatedName("client.Ki")
	public int crossX;

	@ObfuscatedName("client.Li")
	public int crossY;

	@ObfuscatedName("client.Mi")
	public int crossCycle;

	@ObfuscatedName("client.Ni")
	public int crossMode;

	@ObfuscatedName("client.Qi")
	public static int field1606;

	@ObfuscatedName("client.Ui")
	public static int field1610;

	@ObfuscatedName("client.Wi")
	public static int field1612;

	@ObfuscatedName("client.bj")
	public int lastProgressPercent;

	@ObfuscatedName("client.cj")
	public int sidebarHoveredInterfaceId;

	@ObfuscatedName("client.gj")
	public static int field1622;

	@ObfuscatedName("client.lj")
	public int chatCount;

	@ObfuscatedName("client.vj")
	public int cameraX;

	@ObfuscatedName("client.wj")
	public int cameraY;

	@ObfuscatedName("client.xj")
	public int cameraZ;

	@ObfuscatedName("client.yj")
	public int cameraPitch;

	@ObfuscatedName("client.zj")
	public int cameraYaw;

	@ObfuscatedName("client.Ee")
	public long serverSeed;

	@ObfuscatedName("client.Te")
	public long field1402;

	@ObfuscatedName("client.mf")
	public long lastWaveStartTime;

	@ObfuscatedName("client.Dg")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.jj")
	public long socialName37;

	@ObfuscatedName("client.uf")
	public static PlayerEntity localPlayer;

	@ObfuscatedName("client.rc")
	public Pix32 levelObjStacks;

	@ObfuscatedName("client.Bf")
	public Pix32 genderButtonImage0;

	@ObfuscatedName("client.Cf")
	public Pix32 genderButtonImage1;

	@ObfuscatedName("client.dg")
	public Pix32 imageMinimap;

	@ObfuscatedName("client.ng")
	public Pix32 imageMapmarker0;

	@ObfuscatedName("client.og")
	public Pix32 imageMapmarker1;

	@ObfuscatedName("client.sg")
	public Pix32 imageCompass;

	@ObfuscatedName("client.Fg")
	public Pix32 imageMapdot0;

	@ObfuscatedName("client.Gg")
	public Pix32 imageMapdot1;

	@ObfuscatedName("client.Hg")
	public Pix32 imageMapdot2;

	@ObfuscatedName("client.Ig")
	public Pix32 imageMapdot3;

	@ObfuscatedName("client.Oh")
	public Pix32 imageMapedge;

	@ObfuscatedName("client.W")
	public Pix8 imageScrollbar0;

	@ObfuscatedName("client.X")
	public Pix8 imageScrollbar1;

	@ObfuscatedName("client.fe")
	public Pix8 imageTitlebox;

	@ObfuscatedName("client.ge")
	public Pix8 imageTitlebutton;

	@ObfuscatedName("client.Ie")
	public Pix8 imageRedstone1;

	@ObfuscatedName("client.Je")
	public Pix8 imageRedstone2;

	@ObfuscatedName("client.Ke")
	public Pix8 imageRedstone3;

	@ObfuscatedName("client.Le")
	public Pix8 imageRedstone1h;

	@ObfuscatedName("client.Me")
	public Pix8 imageRedstone2h;

	@ObfuscatedName("client.of")
	public Pix8 imageBackbase1;

	@ObfuscatedName("client.pf")
	public Pix8 imageBackbase2;

	@ObfuscatedName("client.qf")
	public Pix8 imageBackhmid1;

	@ObfuscatedName("client.Lf")
	public Pix8 imageInvback;

	@ObfuscatedName("client.Mf")
	public Pix8 imageMapback;

	@ObfuscatedName("client.Nf")
	public Pix8 imageChatback;

	@ObfuscatedName("client.ti")
	public Pix8 imageRedstone1v;

	@ObfuscatedName("client.ui")
	public Pix8 imageRedstone2v;

	@ObfuscatedName("client.vi")
	public Pix8 imageRedstone3v;

	@ObfuscatedName("client.wi")
	public Pix8 imageRedstone1hv;

	@ObfuscatedName("client.xi")
	public Pix8 imageRedstone2hv;

	@ObfuscatedName("client.Hf")
	public PixFont fontPlain11;

	@ObfuscatedName("client.If")
	public PixFont fontPlain12;

	@ObfuscatedName("client.Jf")
	public PixFont fontBold12;

	@ObfuscatedName("client.Kf")
	public PixFont fontQuill8;

	@ObfuscatedName("client.id")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.jd")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.kd")
	public PixMap areaBackright1;

	@ObfuscatedName("client.ld")
	public PixMap areaBackright2;

	@ObfuscatedName("client.md")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.nd")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.od")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.pd")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.qd")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.ud")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.vd")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.wd")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.he")
	public PixMap imageTitle2;

	@ObfuscatedName("client.ie")
	public PixMap imageTitle3;

	@ObfuscatedName("client.je")
	public PixMap imageTitle4;

	@ObfuscatedName("client.ke")
	public PixMap imageTitle0;

	@ObfuscatedName("client.le")
	public PixMap imageTitle1;

	@ObfuscatedName("client.me")
	public PixMap imageTitle5;

	@ObfuscatedName("client.ne")
	public PixMap imageTitle6;

	@ObfuscatedName("client.oe")
	public PixMap imageTitle7;

	@ObfuscatedName("client.pe")
	public PixMap imageTitle8;

	@ObfuscatedName("client.dh")
	public PixMap areaSidebar;

	@ObfuscatedName("client.eh")
	public PixMap areaMapback;

	@ObfuscatedName("client.fh")
	public PixMap areaViewport;

	@ObfuscatedName("client.gh")
	public PixMap areaChatback;

	@ObfuscatedName("client.nh")
	public OnDemand onDemand;

	@ObfuscatedName("client.zh")
	public Isaac randomIn;

	@ObfuscatedName("client.He")
	public Jagfile jagTitle;

	@ObfuscatedName("client.hj")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.vc")
	public ClientStream stream;

	@ObfuscatedName("client.Y")
	public String modalMessage;

	@ObfuscatedName("client.fd")
	public String spellCaption;

	@ObfuscatedName("client.Pg")
	public String objSelectedName;

	@ObfuscatedName("client.ij")
	public String lastProgressMessage;

	@ObfuscatedName("client.Se")
	public static boolean lowMemory;

	@ObfuscatedName("client.Ti")
	public static boolean alreadyStarted;

	@ObfuscatedName("client.Wc")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Xc")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Wd")
	public int[] areaChatbackOffset;

	@ObfuscatedName("client.Xd")
	public int[] areaSidebarOffset;

	@ObfuscatedName("client.Yd")
	public int[] areaViewportOffset;

	@ObfuscatedName("client.We")
	public int[] sceneMapIndex;

	@ObfuscatedName("client.Xe")
	public int[] sceneMapLandFile;

	@ObfuscatedName("client.Ye")
	public int[] sceneMapLocFile;

	@ObfuscatedName("client.hi")
	public int[] flameBuffer2;

	@ObfuscatedName("client.ii")
	public int[] imageFlamesLeft;

	@ObfuscatedName("client.Qg")
	public Pix8[] imageRunes;

	@ObfuscatedName("client.gd")
	public byte[][] sceneMapLocData;

	@ObfuscatedName("client.Cc")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("client.af")
	public int[][][] levelHeightmap;

	@ObfuscatedName("client.b(Z)V")
	public final void drawScene() {
		this.sceneCycle++;
		this.pushNpcs(true);
		this.pushPlayers();
		this.pushNpcs(false);
		this.pushProjectiles();
		this.pushSpotanims();
		if (!this.cutscene) {
			int var2 = this.field1559;
			if (this.field1226 / 256 > var2) {
				var2 = this.field1226 / 256;
			}
			if (this.field1352[4] && this.field1242[4] + 128 > var2) {
				var2 = this.field1242[4] + 128;
			}
			int var3 = this.macroCameraOrbitYaw + this.macroCameraOffsetZ & 0x7FF;
			this.orbitCamera(var3, this.getHeightmapY(localPlayer.z, this.currentLevel, localPlayer.x) - 50, var2, this.field1476, var2 * 3 + 600, this.field1475);
			field1209++;
			if (field1209 > 1802) {
				field1209 = 0;
				this.out.pIsaac(148);
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
		int var5;
		if (this.cutscene) {
			var5 = this.getTopLevelCutscene();
		} else {
			var5 = this.getTopLevel();
		}
		int var6 = this.cameraX;
		int var7 = this.cameraY;
		int var8 = this.cameraZ;
		int var9 = this.cameraPitch;
		int var10 = this.cameraYaw;
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field1352[var11]) {
				int var13 = (int) (Math.random() * (double) (this.field1279[var11] * 2 + 1) - (double) this.field1279[var11] + Math.sin((double) this.field1237[var11] / 100.0D * (double) this.cameraModifierCycle[var11]) * (double) this.field1242[var11]);
				if (var11 == 0) {
					this.cameraX += var13;
				}
				if (var11 == 1) {
					this.cameraY += var13;
				}
				if (var11 == 2) {
					this.cameraZ += var13;
				}
				if (var11 == 3) {
					this.cameraYaw = this.cameraYaw + var13 & 0x7FF;
				}
				if (var11 == 4) {
					this.cameraPitch += var13;
					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					}
					if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
			}
		}
		int var12 = Pix3D.cycle;
		Model.checkHover = true;
		Model.field604 = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;
		Pix2D.clear();
		this.scene.draw(this.cameraX, var5, this.cameraYaw, this.cameraPitch, this.cameraZ, this.cameraY);
		this.scene.clearLocChanges();
		this.draw2DEntityElements();
		this.drawTileHint();
		this.updateTextures(var12);
		this.draw3DEntityElements();
		this.areaViewport.draw(super.graphics, 4, 4);
		this.cameraX = var6;
		this.cameraY = var7;
		this.cameraZ = var8;
		this.cameraPitch = var9;
		this.cameraYaw = var10;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void getNpcPos(int arg1, Packet arg2) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		this.getNpcPosOldVis(arg2, arg1);
		this.getNpcPosNewVis(arg1, arg2);
		this.getNpcPosExtended(arg2, arg1);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var6 = this.entityRemovalIds[var4];
			if (loopCycle != this.npcs[var6].cycle) {
				this.npcs[var6].type = null;
				this.npcs[var6] = null;
			}
		}
		if (arg2.pos != arg1) {
			signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + arg2.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.npcCount; var5++) {
			if (this.npcs[this.npcIds[var5]] == null) {
				signlink.reporterror(this.username + " null entry in npc list - pos:" + var5 + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void tryReconnect() {
		if (this.idleTimeout > 0) {
			this.logout();
			return;
		}
		this.areaViewport.bind();
		this.fontPlain12.drawStringCenter(257, 0, "Connection lost", 144);
		this.fontPlain12.drawStringCenter(256, 16777215, "Connection lost", 143);
		this.fontPlain12.drawStringCenter(257, 0, "Please wait - attempting to reestablish", 159);
		this.fontPlain12.drawStringCenter(256, 16777215, "Please wait - attempting to reestablish", 158);
		this.areaViewport.draw(super.graphics, 4, 4);
		this.flagSceneTileX = 0;
		ClientStream var2 = this.stream;
		this.ingame = false;
		this.login(this.username, this.password, true);
		if (!this.ingame) {
			this.logout();
		}
		try {
			var2.close();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void handleTabInput() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[0] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 0;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[1] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 1;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[2] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 2;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.tabInterfaceId[3] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 3;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[4] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 4;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.tabInterfaceId[5] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 5;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.tabInterfaceId[6] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 6;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[7] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 7;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[8] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 8;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[9] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 9;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.tabInterfaceId[10] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 10;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[11] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 11;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.tabInterfaceId[12] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 12;
			this.redrawSideicons = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.tabInterfaceId[13] != -1) {
			this.redrawSidebar = true;
			this.selectedTab = 13;
			this.redrawSideicons = true;
		}
		field1513++;
		if (field1513 > 150) {
			field1513 = 0;
			this.out.pIsaac(46);
			this.out.p1(43);
			return;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void addMessage(String arg0, String arg1, int arg2) {
		if (arg2 == 0 && this.stickyChatInterfaceId != -1) {
			this.modalMessage = arg0;
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
		this.messageText[0] = arg0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void handleChatModeInput() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPublicMode = (this.chatPublicMode + 1) % 4;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPrivateMode = (this.chatPrivateMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatTradeMode = (this.chatTradeMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX < 412 || super.mouseClickX > 512 || super.mouseClickY < 467 || super.mouseClickY > 499) {
			return;
		}
		this.closeInterfaces();
		this.reportAbuseInput = "";
		this.reportAbuseMuteOption = false;
		for (int var3 = 0; var3 < Component.types.length; var3++) {
			if (Component.types[var3] != null && Component.types[var3].clientCode == 600) {
				this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.types[var3].layer;
				return;
			}
		}
		return;
	}

	@ObfuscatedName("client.a(Ld;B)V")
	public final void updateInterfaceContent(Component arg0) {
		int var3 = arg0.clientCode;
		if (var3 >= 1 && var3 <= 100 || !(var3 < 701 || var3 > 800)) {
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= this.friendCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				arg0.text = this.friendName[var3];
				arg0.buttonType = 1;
			}
		} else if (var3 >= 101 && var3 <= 200 || !(var3 < 801 || var3 > 900)) {
			if (var3 > 800) {
				var3 -= 701;
			} else {
				var3 -= 101;
			}
			if (var3 >= this.friendCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				if (this.friendWorld[var3] == 0) {
					arg0.text = "@red@Offline";
				} else if (this.friendWorld[var3] == nodeId) {
					arg0.text = "@gre@World-" + (this.friendWorld[var3] - 9);
				} else {
					arg0.text = "@yel@World-" + (this.friendWorld[var3] - 9);
				}
				arg0.buttonType = 1;
			}
		} else if (var3 == 203) {
			arg0.scroll = this.friendCount * 15 + 20;
			if (arg0.scroll <= arg0.height) {
				arg0.scroll = arg0.height + 1;
			}
		} else if (var3 >= 401 && var3 <= 500) {
			var3 -= 401;
			if (var3 >= this.ignoreCount) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				arg0.text = JString.formatName(JString.fromBase37(this.ignoreName37[var3]));
				arg0.buttonType = 1;
			}
		} else if (var3 == 503) {
			arg0.scroll = this.ignoreCount * 15 + 20;
			if (arg0.scroll <= arg0.height) {
				arg0.scroll = arg0.height + 1;
			}
		} else if (var3 == 327) {
			arg0.xan = 150;
			arg0.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			if (this.updateDesignModel) {
				for (int var4 = 0; var4 < 7; var4++) {
					int var11 = this.designKits[var4];
					if (var11 >= 0 && !IdkType.types[var11].validate()) {
						return;
					}
				}
				this.updateDesignModel = false;
				Model[] var5 = new Model[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var10 = this.designKits[var7];
					if (var10 >= 0) {
						var5[var6++] = IdkType.types[var10].getModel();
					}
				}
				Model var8 = new Model(var6, var5);
				for (int var9 = 0; var9 < 5; var9++) {
					if (this.designColours[var9] != 0) {
						var8.recolour(DESIGN_BODY_COLOUR[var9][0], DESIGN_BODY_COLOUR[var9][this.designColours[var9]]);
						if (var9 == 1) {
							var8.recolour(DESIGN_HAIR_COLOUR[0], DESIGN_HAIR_COLOUR[this.designColours[var9]]);
						}
					}
				}
				var8.createLabelReferences(-591);
				var8.applyTransform(SeqType.types[localPlayer.seqStandId].frames[0]);
				var8.calculateNormals(64, 850, -30, -50, -30, true);
				arg0.modelType = 5;
				arg0.model = 0;
				Component.cacheModel(var8, 0, 5);
			}
		} else if (var3 == 324) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = arg0.graphic;
				this.genderButtonImage1 = arg0.activeGraphic;
			}
			if (this.designGender) {
				arg0.graphic = this.genderButtonImage1;
			} else {
				arg0.graphic = this.genderButtonImage0;
			}
		} else if (var3 == 325) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = arg0.graphic;
				this.genderButtonImage1 = arg0.activeGraphic;
			}
			if (this.designGender) {
				arg0.graphic = this.genderButtonImage0;
			} else {
				arg0.graphic = this.genderButtonImage1;
			}
		} else if (var3 == 600) {
			arg0.text = this.reportAbuseInput;
			if (loopCycle % 20 < 10) {
				arg0.text = arg0.text + "|";
			} else {
				arg0.text = arg0.text + " ";
			}
		} else {
			if (var3 == 613) {
				if (this.staffmodlevel < 1) {
					arg0.text = "";
				} else if (this.reportAbuseMuteOption) {
					arg0.colour = 16711680;
					arg0.text = "Moderator option: Mute player for 48 hours: <ON>";
				} else {
					arg0.colour = 16777215;
					arg0.text = "Moderator option: Mute player for 48 hours: <OFF>";
				}
			}
			if (var3 == 650 || var3 == 655) {
				if (this.lastAddress == 0) {
					arg0.text = "";
				} else {
					String var12;
					if (this.daysSinceLogin == 0) {
						var12 = "earlier today";
					} else if (this.daysSinceLogin == 1) {
						var12 = "yesterday";
					} else {
						var12 = this.daysSinceLogin + " days ago";
					}
					arg0.text = "You last logged in " + var12 + " from: " + signlink.dns;
				}
			}
			if (var3 == 651) {
				if (this.unreadMessageCount == 0) {
					arg0.text = "0 unread messages";
					arg0.colour = 16776960;
				}
				if (this.unreadMessageCount == 1) {
					arg0.text = "1 unread message";
					arg0.colour = 65280;
				}
				if (this.unreadMessageCount > 1) {
					arg0.text = this.unreadMessageCount + " unread messages";
					arg0.colour = 65280;
				}
			}
			if (var3 == 652) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg0.text = "@yel@This is a non-members world: @whi@Since you are a member we";
					} else {
						arg0.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg0.text = "You have not yet set any password recovery questions.";
				} else {
					String var13;
					if (this.daysSinceRecoveriesChanged == 0) {
						var13 = "Earlier today";
					} else if (this.daysSinceRecoveriesChanged == 1) {
						var13 = "Yesterday";
					} else {
						var13 = this.daysSinceRecoveriesChanged + " days ago";
					}
					arg0.text = var13 + " you changed your recovery questions";
				}
			}
			if (var3 == 653) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg0.text = "@whi@recommend you use a members world instead. You may use";
					} else {
						arg0.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg0.text = "We strongly recommend you do so now to secure your account.";
				} else {
					arg0.text = "If you do not remember making this change then cancel it immediately";
				}
			}
			if (var3 == 654) {
				if (this.daysSinceRecoveriesChanged == 201) {
					if (this.warnMembersInNonMembers == 1) {
						arg0.text = "@whi@this world but member benefits are unavailabe whilst here.";
					} else {
						arg0.text = "";
					}
				} else if (this.daysSinceRecoveriesChanged == 200) {
					arg0.text = "Do this from the 'account management' area on our front webpage";
				} else {
					arg0.text = "Do this from the 'account management' area on our front webpage";
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void handleMouseInput() {
		if (this.objDragArea != 0) {
			return;
		}
		int var2 = super.mouseClickButton;
		if (this.spellSelected == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var2 = 0;
		}
		if (!this.menuVisible) {
			if (var2 == 1 && this.menuSize > 0) {
				int var13 = this.menuAction[this.menuSize - 1];
				if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
					int var14 = this.menuParamB[this.menuSize - 1];
					int var15 = this.menuParamC[this.menuSize - 1];
					Component var16 = Component.types[var15];
					if (var16.draggable) {
						this.objGrabThreshold = false;
						this.objDragCycles = 0;
						this.objDragInterfaceId = var15;
						this.objDragSlot = var14;
						this.objDragArea = 2;
						this.objGrabX = super.mouseClickX;
						this.objGrabY = super.mouseClickY;
						if (Component.types[var15].layer == this.viewportInterfaceId) {
							this.objDragArea = 1;
						}
						if (Component.types[var15].layer == this.chatInterfaceId) {
							this.objDragArea = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (this.oneMouseButton == 1 || this.isAddFriendOption(this.menuSize - 1)) && this.menuSize > 2) {
				var2 = 2;
			}
			if (var2 == 1 && this.menuSize > 0) {
				this.useMenuOption(this.menuSize - 1, 0);
			}
			if (var2 != 2 || this.menuSize <= 0) {
				return;
			}
			this.showContextMenu();
			return;
		}
		if (var2 != 1) {
			int var3 = super.mouseX;
			int var4 = super.mouseY;
			if (this.menuArea == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (this.menuArea == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (this.menuArea == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < this.menuX - 10 || var3 > this.menuWidth + this.menuX + 10 || var4 < this.menuY - 10 || var4 > this.menuHeight + this.menuY + 10) {
				this.menuVisible = false;
				if (this.menuArea == 1) {
					this.redrawSidebar = true;
				}
				if (this.menuArea == 2) {
					this.redrawChatback = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = this.menuX;
		int var6 = this.menuY;
		int var7 = this.menuWidth;
		int var8 = super.mouseClickX;
		int var9 = super.mouseClickY;
		if (this.menuArea == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.menuArea == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.menuArea == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < this.menuSize; var11++) {
			int var12 = (this.menuSize - 1 - var11) * 15 + var6 + 31;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			this.useMenuOption(var10, 0);
		}
		this.menuVisible = false;
		if (this.menuArea == 1) {
			this.redrawSidebar = true;
		}
		if (this.menuArea == 2) {
			this.redrawChatback = true;
			return;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void loadTitleBackground() {
		byte[] var2 = this.jagTitle.read("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.imageTitle0.bind();
		var3.blitOpaque(0, 0);
		this.imageTitle1.bind();
		var3.blitOpaque(-637, 0);
		this.imageTitle2.bind();
		var3.blitOpaque(-128, 0);
		this.imageTitle3.bind();
		var3.blitOpaque(-202, -371);
		this.imageTitle4.bind();
		var3.blitOpaque(-202, -171);
		this.imageTitle5.bind();
		var3.blitOpaque(0, -265);
		this.imageTitle6.bind();
		var3.blitOpaque(-562, -265);
		this.imageTitle7.bind();
		var3.blitOpaque(-128, -171);
		this.imageTitle8.bind();
		var3.blitOpaque(-562, -171);
		int[] var4 = new int[var3.cropRight];
		for (int var5 = 0; var5 < var3.cropBottom; var5++) {
			for (int var10 = 0; var10 < var3.cropRight; var10++) {
				var4[var10] = var3.pixels[var3.cropRight * var5 + (var3.cropRight - var10 - 1)];
			}
			for (int var11 = 0; var11 < var3.cropRight; var11++) {
				var3.pixels[var3.cropRight * var5 + var11] = var4[var11];
			}
		}
		this.imageTitle0.bind();
		var3.blitOpaque(382, 0);
		this.imageTitle1.bind();
		var3.blitOpaque(-255, 0);
		this.imageTitle2.bind();
		var3.blitOpaque(254, 0);
		this.imageTitle3.bind();
		var3.blitOpaque(180, -371);
		this.imageTitle4.bind();
		var3.blitOpaque(180, -171);
		this.imageTitle5.bind();
		var3.blitOpaque(382, -265);
		this.imageTitle6.bind();
		var3.blitOpaque(-180, -265);
		this.imageTitle7.bind();
		var3.blitOpaque(254, -171);
		this.imageTitle8.bind();
		var3.blitOpaque(-180, -171);
		Pix32 var6 = new Pix32(this.jagTitle, "logo", 0);
		this.imageTitle2.bind();
		var6.draw(382 - var6.cropRight / 2 - 128, 18);
		Object var7 = null;
		Object var8 = null;
		Object var9 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean interactWithLoc(int arg0, int arg1, int arg2, int arg4) {
		int var6 = arg2 >> 14 & 0x7FFF;
		int var7 = this.scene.getInfo(this.currentLevel, arg1, arg4, arg2);
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
				var13 = (var13 >> 4 - var9) + (var13 << var9 & 0xF);
			}
			this.tryMove(var11, localPlayer.routeTileZ[0], var13, 2, false, 0, arg1, 0, arg4, var12, localPlayer.routeTileX[0]);
		} else {
			this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, var9, arg1, var8 + 1, arg4, 0, localPlayer.routeTileX[0]);
		}
		this.crossX = super.mouseClickX;
		this.crossY = super.mouseClickY;
		this.crossMode = 2;
		this.crossCycle = 0;
		this.out.pIsaac(arg0);
		this.out.p2(this.sceneBaseTileX + arg1);
		this.out.p2(this.sceneBaseTileZ + arg4);
		this.out.p2(var6);
		return true;
	}

	@ObfuscatedName("client.j(I)V")
	public final void updateNpcs() {
		for (int var2 = 0; var2 < this.npcCount; var2++) {
			int var3 = this.npcIds[var2];
			NpcEntity var4 = this.npcs[var3];
			if (var4 != null) {
				this.updateEntity(var4, var4.type.size);
			}
		}
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void updateEntity(PathingEntity arg0, int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.primarySeqId = -1;
			arg0.spotanimId = -1;
			arg0.forceMoveEndCycle = 0;
			arg0.forceMoveStartCycle = 0;
			arg0.x = arg0.routeTileX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeTileZ[0] * 128 + arg0.size * 64;
			arg0.resetPath();
		}
		if (localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.primarySeqId = -1;
			arg0.spotanimId = -1;
			arg0.forceMoveEndCycle = 0;
			arg0.forceMoveStartCycle = 0;
			arg0.x = arg0.routeTileX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeTileZ[0] * 128 + arg0.size * 64;
			arg0.resetPath();
		}
		if (arg0.forceMoveEndCycle > loopCycle) {
			this.updateForceMovement(arg0);
		} else if (arg0.forceMoveStartCycle >= loopCycle) {
			this.startForceMovement(arg0);
		} else {
			this.updateMovement(arg0);
		}
		this.updateFacingDirection(arg0);
		this.updateSequences(arg0);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void updateForceMovement(PathingEntity arg1) {
		int var3 = arg1.forceMoveEndCycle - loopCycle;
		int var4 = arg1.forceMoveStartSceneTileX * 128 + arg1.size * 64;
		int var5 = arg1.forceMoveStartSceneTileZ * 128 + arg1.size * 64;
		arg1.x += (var4 - arg1.x) / var3;
		arg1.z += (var5 - arg1.z) / var3;
		arg1.seqTrigger = 0;
		if (arg1.forceMoveFaceDirection == 0) {
			arg1.dstYaw = 1024;
		}
		if (arg1.forceMoveFaceDirection == 1) {
			arg1.dstYaw = 1536;
		}
		if (arg1.forceMoveFaceDirection == 2) {
			arg1.dstYaw = 0;
		}
		if (arg1.forceMoveFaceDirection == 3) {
			arg1.dstYaw = 512;
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void startForceMovement(PathingEntity arg0) {
		if (loopCycle == arg0.forceMoveStartCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.primarySeqCycle + 1 > SeqType.types[arg0.primarySeqId].getFrameDuration(arg0.primarySeqFrame)) {
			int var3 = arg0.forceMoveStartCycle - arg0.forceMoveEndCycle;
			int var4 = loopCycle - arg0.forceMoveEndCycle;
			int var5 = arg0.forceMoveStartSceneTileX * 128 + arg0.size * 64;
			int var6 = arg0.forceMoveStartSceneTileZ * 128 + arg0.size * 64;
			int var7 = arg0.forceMoveEndSceneTileX * 128 + arg0.size * 64;
			int var8 = arg0.forceMoveEndSceneTileZ * 128 + arg0.size * 64;
			arg0.x = ((var3 - var4) * var5 + var4 * var7) / var3;
			arg0.z = ((var3 - var4) * var6 + var4 * var8) / var3;
		}
		arg0.seqTrigger = 0;
		if (arg0.forceMoveFaceDirection == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.forceMoveFaceDirection == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.forceMoveFaceDirection == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.forceMoveFaceDirection == 3) {
			arg0.dstYaw = 512;
		}
		arg0.yaw = arg0.dstYaw;
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void updateMovement(PathingEntity arg0) {
		arg0.secondarySeqId = arg0.seqStandId;
		if (arg0.pathLength == 0) {
			arg0.seqTrigger = 0;
			return;
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var3 = SeqType.types[arg0.primarySeqId];
			if (arg0.seqPathLength > 0 && var3.preanim_move == 0) {
				arg0.seqTrigger++;
				return;
			}
			if (arg0.seqPathLength <= 0 && var3.postanim_mode == 0) {
				arg0.seqTrigger++;
				return;
			}
		}
		int var4 = arg0.x;
		int var5 = arg0.z;
		int var6 = arg0.routeTileX[arg0.pathLength - 1] * 128 + arg0.size * 64;
		int var7 = arg0.routeTileZ[arg0.pathLength - 1] * 128 + arg0.size * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg0.x = var6;
			arg0.z = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg0.dstYaw = 1280;
			} else if (var5 > var7) {
				arg0.dstYaw = 1792;
			} else {
				arg0.dstYaw = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg0.dstYaw = 768;
			} else if (var5 > var7) {
				arg0.dstYaw = 256;
			} else {
				arg0.dstYaw = 512;
			}
		} else if (var5 < var7) {
			arg0.dstYaw = 1024;
		} else {
			arg0.dstYaw = 0;
		}
		int var8 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.seqTurnAroundId;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.seqWalkId;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.seqTurnRightId;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.seqTurnLeftId;
		}
		if (var9 == -1) {
			var9 = arg0.seqWalkId;
		}
		arg0.secondarySeqId = var9;
		int var10 = 4;
		if (arg0.dstYaw != arg0.yaw && arg0.targetId == -1) {
			var10 = 2;
		}
		if (arg0.pathLength > 2) {
			var10 = 6;
		}
		if (arg0.pathLength > 3) {
			var10 = 8;
		}
		if (arg0.seqTrigger > 0 && arg0.pathLength > 1) {
			var10 = 8;
			arg0.seqTrigger--;
		}
		if (arg0.pathRunning[arg0.pathLength - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg0.secondarySeqId == arg0.seqWalkId && arg0.seqRunId != -1) {
			arg0.secondarySeqId = arg0.seqRunId;
		}
		if (var4 < var6) {
			arg0.x += var10;
			if (arg0.x > var6) {
				arg0.x = var6;
			}
		} else if (var4 > var6) {
			arg0.x -= var10;
			if (arg0.x < var6) {
				arg0.x = var6;
			}
		}
		if (var5 < var7) {
			arg0.z += var10;
			if (arg0.z > var7) {
				arg0.z = var7;
			}
		} else if (var5 > var7) {
			arg0.z -= var10;
			if (arg0.z < var7) {
				arg0.z = var7;
			}
		}
		if (arg0.x != var6 || arg0.z != var7) {
			return;
		}
		arg0.pathLength--;
		if (arg0.seqPathLength > 0) {
			arg0.seqPathLength--;
			return;
		}
	}

	@ObfuscatedName("client.c(Lz;I)V")
	public final void updateFacingDirection(PathingEntity arg0) {
		if (arg0.targetId != -1 && arg0.targetId < 32768) {
			NpcEntity var3 = this.npcs[arg0.targetId];
			if (var3 != null) {
				int var4 = arg0.x - var3.x;
				int var5 = arg0.z - var3.z;
				if (var4 != 0 || var5 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.targetId >= 32768) {
			int var6 = arg0.targetId - 32768;
			if (this.field1397 == var6) {
				var6 = this.LOCAL_PLAYER_INDEX;
			}
			PlayerEntity var7 = this.players[var6];
			if (var7 != null) {
				int var8 = arg0.x - var7.x;
				int var9 = arg0.z - var7.z;
				if (var8 != 0 || var9 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.targetTileX != 0 || arg0.targetTileZ != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
			int var10 = arg0.x - (arg0.targetTileX - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
			int var11 = arg0.z - (arg0.targetTileZ - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
			if (var10 != 0 || var11 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg0.targetTileX = 0;
			arg0.targetTileZ = 0;
		}
		int var12 = arg0.dstYaw - arg0.yaw & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < 32 || var12 > 2016) {
			arg0.yaw = arg0.dstYaw;
		} else if (var12 > 1024) {
			arg0.yaw -= 32;
		} else {
			arg0.yaw += 32;
		}
		arg0.yaw &= 0x7FF;
		if (arg0.secondarySeqId != arg0.seqStandId || arg0.dstYaw == arg0.yaw) {
			return;
		}
		if (arg0.seqTurnId != -1) {
			arg0.secondarySeqId = arg0.seqTurnId;
			return;
		}
		arg0.secondarySeqId = arg0.seqWalkId;
		return;
	}

	@ObfuscatedName("client.d(Lz;I)V")
	public final void updateSequences(PathingEntity arg0) {
		arg0.needsForwardDrawPadding = false;
		if (arg0.secondarySeqId != -1) {
			SeqType var3 = SeqType.types[arg0.secondarySeqId];
			arg0.secondarySeqCycle++;
			if (arg0.secondarySeqFrame < var3.frameCount && arg0.secondarySeqCycle > var3.getFrameDuration(arg0.secondarySeqFrame)) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame++;
			}
			if (arg0.secondarySeqFrame >= var3.frameCount) {
				arg0.secondarySeqCycle = 0;
				arg0.secondarySeqFrame = 0;
			}
		}
		if (arg0.spotanimId != -1 && loopCycle >= arg0.spotanimLastCycle) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}
			SeqType var4 = SpotAnimType.types[arg0.spotanimId].seq;
			arg0.spotanimCycle++;
			while (arg0.spotanimFrame < var4.frameCount && arg0.spotanimCycle > var4.getFrameDuration(arg0.spotanimFrame)) {
				arg0.spotanimCycle -= var4.getFrameDuration(arg0.spotanimFrame);
				arg0.spotanimFrame++;
			}
			if (arg0.spotanimFrame >= var4.frameCount && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var4.frameCount)) {
				arg0.spotanimId = -1;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			SeqType var5 = SeqType.types[arg0.primarySeqId];
			if (var5.preanim_move == 1 && arg0.seqPathLength > 0 && arg0.forceMoveEndCycle <= loopCycle && arg0.forceMoveStartCycle < loopCycle) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			SeqType var6 = SeqType.types[arg0.primarySeqId];
			arg0.primarySeqCycle++;
			while (arg0.primarySeqFrame < var6.frameCount && arg0.primarySeqCycle > var6.getFrameDuration(arg0.primarySeqFrame)) {
				arg0.primarySeqCycle -= var6.getFrameDuration(arg0.primarySeqFrame);
				arg0.primarySeqFrame++;
			}
			if (arg0.primarySeqFrame >= var6.frameCount) {
				arg0.primarySeqFrame -= var6.replayoff;
				arg0.primarySeqLoop++;
				if (arg0.primarySeqLoop >= var6.replaycount) {
					arg0.primarySeqId = -1;
				}
				if (arg0.primarySeqFrame < 0 || arg0.primarySeqFrame >= var6.frameCount) {
					arg0.primarySeqId = -1;
				}
			}
			arg0.needsForwardDrawPadding = var6.stretches;
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void drawGame() {
		if (this.redrawFrame) {
			this.redrawFrame = false;
			this.areaBackleft1.draw(super.graphics, 4, 0);
			this.areaBackleft2.draw(super.graphics, 357, 0);
			this.areaBackright1.draw(super.graphics, 4, 722);
			this.areaBackright2.draw(super.graphics, 205, 743);
			this.areaBacktop1.draw(super.graphics, 0, 0);
			this.areaBackvmid1.draw(super.graphics, 4, 516);
			this.areaBackvmid2.draw(super.graphics, 205, 516);
			this.areaBackvmid3.draw(super.graphics, 357, 496);
			this.areaBackhmid2.draw(super.graphics, 338, 0);
			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;
			if (this.sceneState != 2) {
				this.areaViewport.draw(super.graphics, 4, 4);
				this.areaMapback.draw(super.graphics, 4, 550);
			}
		}
		if (this.sceneState == 2) {
			this.drawScene();
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.redrawSidebar = true;
		}
		if (this.sidebarInterfaceId != -1) {
			boolean var2 = this.updateInterfaceAnimation(this.sceneDelta, this.sidebarInterfaceId);
			if (var2) {
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
				this.handleScrollInput(this.chatInterface, 0, false, super.mouseY - 357, 77, this.chatScrollHeight, super.mouseX - 17, 463);
			}
			int var3 = this.chatScrollHeight - 77 - this.chatInterface.scrollPosition;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > this.chatScrollHeight - 77) {
				var3 = this.chatScrollHeight - 77;
			}
			if (this.chatScrollOffset != var3) {
				this.chatScrollOffset = var3;
				this.redrawChatback = true;
			}
		}
		if (this.chatInterfaceId != -1) {
			boolean var4 = this.updateInterfaceAnimation(this.sceneDelta, this.chatInterfaceId);
			if (var4) {
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
			this.areaMapback.draw(super.graphics, 4, 550);
		}
		if (this.flashingTab != -1) {
			this.redrawSideicons = true;
		}
		if (this.redrawSideicons) {
			if (this.flashingTab != -1 && this.flashingTab == this.selectedTab) {
				this.flashingTab = -1;
				this.out.pIsaac(233);
				this.out.p1(this.selectedTab);
			}
			this.redrawSideicons = false;
			this.areaBackhmid1.bind();
			this.imageBackhmid1.draw(0, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 0) {
						this.imageRedstone1.draw(22, 10);
					}
					if (this.selectedTab == 1) {
						this.imageRedstone2.draw(54, 8);
					}
					if (this.selectedTab == 2) {
						this.imageRedstone2.draw(82, 8);
					}
					if (this.selectedTab == 3) {
						this.imageRedstone3.draw(110, 8);
					}
					if (this.selectedTab == 4) {
						this.imageRedstone2h.draw(153, 8);
					}
					if (this.selectedTab == 5) {
						this.imageRedstone2h.draw(181, 8);
					}
					if (this.selectedTab == 6) {
						this.imageRedstone1h.draw(209, 9);
					}
				}
				if (this.tabInterfaceId[0] != -1 && (this.flashingTab != 0 || loopCycle % 20 < 10)) {
					this.imageSideicons[0].draw(29, 13);
				}
				if (this.tabInterfaceId[1] != -1 && (this.flashingTab != 1 || loopCycle % 20 < 10)) {
					this.imageSideicons[1].draw(53, 11);
				}
				if (this.tabInterfaceId[2] != -1 && (this.flashingTab != 2 || loopCycle % 20 < 10)) {
					this.imageSideicons[2].draw(82, 11);
				}
				if (this.tabInterfaceId[3] != -1 && (this.flashingTab != 3 || loopCycle % 20 < 10)) {
					this.imageSideicons[3].draw(115, 12);
				}
				if (this.tabInterfaceId[4] != -1 && (this.flashingTab != 4 || loopCycle % 20 < 10)) {
					this.imageSideicons[4].draw(153, 13);
				}
				if (this.tabInterfaceId[5] != -1 && (this.flashingTab != 5 || loopCycle % 20 < 10)) {
					this.imageSideicons[5].draw(180, 11);
				}
				if (this.tabInterfaceId[6] != -1 && (this.flashingTab != 6 || loopCycle % 20 < 10)) {
					this.imageSideicons[6].draw(208, 13);
				}
			}
			this.areaBackhmid1.draw(super.graphics, 160, 516);
			this.areaBackbase2.bind();
			this.imageBackbase2.draw(0, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 7) {
						this.imageRedstone1v.draw(42, 0);
					}
					if (this.selectedTab == 8) {
						this.imageRedstone2v.draw(74, 0);
					}
					if (this.selectedTab == 9) {
						this.imageRedstone2v.draw(102, 0);
					}
					if (this.selectedTab == 10) {
						this.imageRedstone3v.draw(130, 1);
					}
					if (this.selectedTab == 11) {
						this.imageRedstone2hv.draw(173, 0);
					}
					if (this.selectedTab == 12) {
						this.imageRedstone2hv.draw(201, 0);
					}
					if (this.selectedTab == 13) {
						this.imageRedstone1hv.draw(229, 0);
					}
				}
				if (this.tabInterfaceId[8] != -1 && (this.flashingTab != 8 || loopCycle % 20 < 10)) {
					this.imageSideicons[7].draw(74, 2);
				}
				if (this.tabInterfaceId[9] != -1 && (this.flashingTab != 9 || loopCycle % 20 < 10)) {
					this.imageSideicons[8].draw(102, 3);
				}
				if (this.tabInterfaceId[10] != -1 && (this.flashingTab != 10 || loopCycle % 20 < 10)) {
					this.imageSideicons[9].draw(137, 4);
				}
				if (this.tabInterfaceId[11] != -1 && (this.flashingTab != 11 || loopCycle % 20 < 10)) {
					this.imageSideicons[10].draw(174, 2);
				}
				if (this.tabInterfaceId[12] != -1 && (this.flashingTab != 12 || loopCycle % 20 < 10)) {
					this.imageSideicons[11].draw(201, 2);
				}
				if (this.tabInterfaceId[13] != -1 && (this.flashingTab != 13 || loopCycle % 20 < 10)) {
					this.imageSideicons[12].draw(226, 2);
				}
			}
			this.areaBackbase2.draw(super.graphics, 466, 496);
			this.areaViewport.bind();
		}
		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;
			this.areaBackbase1.bind();
			this.imageBackbase1.draw(0, 0);
			this.fontPlain12.drawStringTaggableCenter(55, true, "Public chat", 28, 16777215);
			if (this.chatPublicMode == 0) {
				this.fontPlain12.drawStringTaggableCenter(55, true, "On", 41, 65280);
			}
			if (this.chatPublicMode == 1) {
				this.fontPlain12.drawStringTaggableCenter(55, true, "Friends", 41, 16776960);
			}
			if (this.chatPublicMode == 2) {
				this.fontPlain12.drawStringTaggableCenter(55, true, "Off", 41, 16711680);
			}
			if (this.chatPublicMode == 3) {
				this.fontPlain12.drawStringTaggableCenter(55, true, "Hide", 41, 65535);
			}
			this.fontPlain12.drawStringTaggableCenter(184, true, "Private chat", 28, 16777215);
			if (this.chatPrivateMode == 0) {
				this.fontPlain12.drawStringTaggableCenter(184, true, "On", 41, 65280);
			}
			if (this.chatPrivateMode == 1) {
				this.fontPlain12.drawStringTaggableCenter(184, true, "Friends", 41, 16776960);
			}
			if (this.chatPrivateMode == 2) {
				this.fontPlain12.drawStringTaggableCenter(184, true, "Off", 41, 16711680);
			}
			this.fontPlain12.drawStringTaggableCenter(324, true, "Trade/duel", 28, 16777215);
			if (this.chatTradeMode == 0) {
				this.fontPlain12.drawStringTaggableCenter(324, true, "On", 41, 65280);
			}
			if (this.chatTradeMode == 1) {
				this.fontPlain12.drawStringTaggableCenter(324, true, "Friends", 41, 16776960);
			}
			if (this.chatTradeMode == 2) {
				this.fontPlain12.drawStringTaggableCenter(324, true, "Off", 41, 16711680);
			}
			this.fontPlain12.drawStringTaggableCenter(458, true, "Report abuse", 33, 16777215);
			this.areaBackbase1.draw(super.graphics, 453, 0);
			this.areaViewport.bind();
		}
		this.sceneDelta = 0;
	}

	@ObfuscatedName("client.d(Z)V")
	public final void handleViewportOptions() {
		if (this.objSelected == 0 && this.spellSelected == 0) {
			this.menuOption[this.menuSize] = "Walk here";
			this.menuAction[this.menuSize] = 660;
			this.menuParamB[this.menuSize] = super.mouseX;
			this.menuParamC[this.menuSize] = super.mouseY;
			this.menuSize++;
		}
		int var2 = -1;
		for (int var3 = 0; var3 < Model.field604; var3++) {
			int var4 = Model.pickedBitsets[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var2 != var4) {
				var2 = var4;
				if (var7 == 2 && this.scene.getInfo(this.currentLevel, var5, var6, var4) >= 0) {
					LocType var9 = LocType.get(var8);
					if (this.objSelected == 1) {
						this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @cya@" + var9.name;
						this.menuAction[this.menuSize] = 450;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if (this.spellSelected != 1) {
						if (var9.op != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.op[var10] != null) {
									this.menuOption[this.menuSize] = var9.op[var10] + " @cya@" + var9.name;
									if (var10 == 0) {
										this.menuAction[this.menuSize] = 285;
									}
									if (var10 == 1) {
										this.menuAction[this.menuSize] = 504;
									}
									if (var10 == 2) {
										this.menuAction[this.menuSize] = 364;
									}
									if (var10 == 3) {
										this.menuAction[this.menuSize] = 581;
									}
									if (var10 == 4) {
										this.menuAction[this.menuSize] = 1501;
									}
									this.menuParamA[this.menuSize] = var4;
									this.menuParamB[this.menuSize] = var5;
									this.menuParamC[this.menuSize] = var6;
									this.menuSize++;
								}
							}
						}
						this.menuOption[this.menuSize] = "Examine @cya@" + var9.name;
						this.menuAction[this.menuSize] = 1175;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if ((this.activeSpellFlags & 0x4) == 4) {
						this.menuOption[this.menuSize] = this.spellCaption + " @cya@" + var9.name;
						this.menuAction[this.menuSize] = 55;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					}
				}
				if (var7 == 1) {
					NpcEntity var11 = this.npcs[var8];
					if (var11.type.size == 1 && (var11.x & 0x7F) == 64 && (var11.z & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.npcCount; var12++) {
							NpcEntity var13 = this.npcs[this.npcIds[var12]];
							if (var13 != null && var11 != var13 && var13.type.size == 1 && var11.x == var13.x && var11.z == var13.z) {
								this.addNpcOptions(var6, var5, this.npcIds[var12], var13.type);
							}
						}
					}
					this.addNpcOptions(var6, var5, var8, var11.type);
				}
				if (var7 == 0) {
					PlayerEntity var14 = this.players[var8];
					if ((var14.x & 0x7F) == 64 && (var14.z & 0x7F) == 64) {
						for (int var15 = 0; var15 < this.npcCount; var15++) {
							NpcEntity var18 = this.npcs[this.npcIds[var15]];
							if (var18 != null && var18.type.size == 1 && var14.x == var18.x && var14.z == var18.z) {
								this.addNpcOptions(var6, var5, this.npcIds[var15], var18.type);
							}
						}
						for (int var16 = 0; var16 < this.playerCount; var16++) {
							PlayerEntity var17 = this.players[this.playerIds[var16]];
							if (var17 != null && var14 != var17 && var14.x == var17.x && var14.z == var17.z) {
								this.addPlayerOptions(this.playerIds[var16], var5, var6, var17);
							}
						}
					}
					this.addPlayerOptions(var8, var5, var6, var14);
				}
				if (var7 == 3) {
					LinkList var19 = this.field1432[this.currentLevel][var5][var6];
					if (var19 != null) {
						for (ObjStackEntity var20 = (ObjStackEntity) var19.tail(); var20 != null; var20 = (ObjStackEntity) var19.prev()) {
							ObjType var21 = ObjType.get(var20.field500);
							if (this.objSelected == 1) {
								this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var21.name;
								this.menuAction[this.menuSize] = 217;
								this.menuParamA[this.menuSize] = var20.field500;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if (this.spellSelected != 1) {
								for (int var22 = 4; var22 >= 0; var22--) {
									if (var21.op != null && var21.op[var22] != null) {
										this.menuOption[this.menuSize] = var21.op[var22] + " @lre@" + var21.name;
										if (var22 == 0) {
											this.menuAction[this.menuSize] = 224;
										}
										if (var22 == 1) {
											this.menuAction[this.menuSize] = 993;
										}
										if (var22 == 2) {
											this.menuAction[this.menuSize] = 99;
										}
										if (var22 == 3) {
											this.menuAction[this.menuSize] = 746;
										}
										if (var22 == 4) {
											this.menuAction[this.menuSize] = 877;
										}
										this.menuParamA[this.menuSize] = var20.field500;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									} else if (var22 == 2) {
										this.menuOption[this.menuSize] = "Take @lre@" + var21.name;
										this.menuAction[this.menuSize] = 99;
										this.menuParamA[this.menuSize] = var20.field500;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									}
								}
								this.menuOption[this.menuSize] = "Examine @lre@" + var21.name;
								this.menuAction[this.menuSize] = 1102;
								this.menuParamA[this.menuSize] = var20.field500;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if ((this.activeSpellFlags & 0x1) == 1) {
								this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var21.name;
								this.menuAction[this.menuSize] = 965;
								this.menuParamA[this.menuSize] = var20.field500;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void addIgnore(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.ignoreCount >= 100) {
			this.addMessage("Your ignore list is full. Max of 100 hit", "", 0);
			return;
		}
		String var4 = JString.formatName(JString.fromBase37(arg1));
		for (int var5 = 0; var5 < this.ignoreCount; var5++) {
			if (this.ignoreName37[var5] == arg1) {
				this.addMessage(var4 + " is already on your ignore list", "", 0);
				return;
			}
		}
		for (int var6 = 0; var6 < this.friendCount; var6++) {
			if (this.friendName37[var6] == arg1) {
				this.addMessage("Please remove " + var4 + " from your friend list first", "", 0);
				return;
			}
		}
		this.ignoreName37[this.ignoreCount++] = arg1;
		this.redrawSidebar = true;
		this.out.pIsaac(203);
		this.out.p8(arg1);
	}

	@ObfuscatedName("client.a(IBILjb;)V")
	public final void drawMinimapHint(int arg0, int arg2, Pix32 arg3) {
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 4225 || var5 >= 90000) {
			this.drawOnMinimap(arg0, arg3, arg2);
			return;
		}
		int var6 = this.macroCameraOrbitYaw + this.macroMinimapAngle & 0x7FF;
		int var7 = Model.sinTable[var6];
		int var8 = Model.cosTable[var6];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var11 = arg0 * var10 + arg2 * var9 >> 16;
		int var12 = arg2 * var10 - arg0 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.imageMapedge.drawRotated(83 - var16 - 20, var13, 256, 15, 15, 20, 20, var15 + 94 + 4 - 10);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Connecting to server...";
				this.drawTitle();
			}
			this.stream = new ClientStream(this.openSocket(portOffset + 43594), this);
			long var4 = JString.toBase37(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(var6);
			this.stream.write(2, 0, this.out.data);
			for (int var7 = 0; var7 < 8; var7++) {
				this.stream.read();
			}
			int var8 = this.stream.read();
			if (var8 == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.serverSeed = this.in.g8();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed };
				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(var9[0]);
				this.out.p4(var9[1]);
				this.out.p4(var9[2]);
				this.out.p4(var9[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(arg0);
				this.out.pjstr(arg1);
				this.out.rsaenc(LOGIN_RSAE, LOGIN_RSAN);
				this.login.pos = 0;
				if (arg2) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}
				this.login.p1(this.out.pos + 36 + 1 + 1);
				this.login.p1(244);
				this.login.p1(lowMemory ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					this.login.p4(this.jagChecksum[var10]);
				}
				this.login.pdata(this.out.pos, 0, this.out.data);
				this.out.random = new Isaac(var9);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				this.randomIn = new Isaac(var9);
				this.stream.write(this.login.pos, 0, this.login.data);
				var8 = this.stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				this.staffmodlevel = 0;
				if (var8 == 18) {
					this.staffmodlevel = 1;
				}
				if (var8 == 19) {
					this.staffmodlevel = 2;
				}
				InputTracking.setDisabled();
				this.field1402 = 0L;
				this.field1403 = 0;
				this.mouseTracking.length = 0;
				super.hasFocus = true;
				this.field1252 = true;
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
				this.field1264 = 0;
				this.menuSize = 0;
				this.menuVisible = false;
				super.idleCycles = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					this.messageText[var12] = null;
				}
				this.objSelected = 0;
				this.spellSelected = 0;
				this.sceneState = 0;
				this.waveCount = 0;
				this.macroCameraOffsetX = (int) (Math.random() * 100.0D) - 50;
				this.macroCameraOffsetY = (int) (Math.random() * 110.0D) - 55;
				this.macroCameraOffsetZ = (int) (Math.random() * 80.0D) - 40;
				this.macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
				this.macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
				this.macroCameraOrbitYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.minimapLevel = -1;
				this.flagSceneTileX = 0;
				this.flagSceneTileZ = 0;
				this.playerCount = 0;
				this.npcCount = 0;
				for (int var13 = 0; var13 < this.MAX_PLAYER_COUNT; var13++) {
					this.players[var13] = null;
					this.playerAppearanceBuffer[var13] = null;
				}
				for (int var14 = 0; var14 < 8192; var14++) {
					this.npcs[var14] = null;
				}
				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new PlayerEntity();
				this.projectiles.clear();
				this.spotanims.clear();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							this.field1432[var15][var16][var17] = null;
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
				for (int var18 = 0; var18 < 5; var18++) {
					this.designColours[var18] = 0;
				}
				field1506 = 0;
				field1612 = 0;
				field1606 = 0;
				field1553 = 0;
				field1219 = 0;
				field1542 = 0;
				field1622 = 0;
				field1386 = 0;
				field1558 = 0;
				field1524 = 0;
				this.prepareGame();
			} else if (var8 == 3) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.loginMessage0 = "Your account has been disabled.";
				this.loginMessage1 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.loginMessage0 = "Your account is already logged in.";
				this.loginMessage1 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.loginMessage0 = "RuneScape has been updated!";
				this.loginMessage1 = "Please reload this page.";
			} else if (var8 == 7) {
				this.loginMessage0 = "This world is full.";
				this.loginMessage1 = "Please use a different world.";
			} else if (var8 == 8) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Login server offline.";
			} else if (var8 == 9) {
				this.loginMessage0 = "Login limit exceeded.";
				this.loginMessage1 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.loginMessage0 = "Unable to connect.";
				this.loginMessage1 = "Bad session id.";
			} else if (var8 == 11) {
				this.loginMessage1 = "Login server rejected session.";
				this.loginMessage1 = "Please try again.";
			} else if (var8 == 12) {
				this.loginMessage0 = "You need a members account to login to this world.";
				this.loginMessage1 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.loginMessage0 = "Could not complete login.";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.loginMessage0 = "The server is being updated.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
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
			} else if (var8 == 16) {
				this.loginMessage0 = "Login attempts exceeded.";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.loginMessage0 = "You are standing in a members-only area.";
				this.loginMessage1 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.loginMessage0 = "Invalid loginserver requested";
				this.loginMessage1 = "Please try using a different world.";
			} else {
				this.loginMessage0 = "Unexpected server response";
				this.loginMessage1 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void pushProjectiles() {
		ProjectileEntity var2 = (ProjectileEntity) this.projectiles.head();
		while (var2 != null) {
			if (this.currentLevel != var2.level || loopCycle > var2.endCycle) {
				var2.unlink();
			} else if (loopCycle >= var2.startCycle) {
				if (var2.target > 0) {
					NpcEntity var3 = this.npcs[var2.target - 1];
					if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
						var2.updateVelocity(var3.z, this.getHeightmapY(var3.z, var2.level, var3.x) - var2.offsetY, var3.x, loopCycle);
					}
				}
				if (var2.target < 0) {
					int var4 = -var2.target - 1;
					PlayerEntity var5;
					if (this.field1397 == var4) {
						var5 = localPlayer;
					} else {
						var5 = this.players[var4];
					}
					if (var5 != null && var5.x >= 0 && var5.x < 13312 && var5.z >= 0 && var5.z < 13312) {
						var2.updateVelocity(var5.z, this.getHeightmapY(var5.z, var2.level, var5.x) - var2.offsetY, var5.x, loopCycle);
					}
				}
				var2.update(this.sceneDelta);
				this.scene.addTemporary(60, false, (int) var2.field518, var2.field524, (int) var2.field517, var2, (int) var2.field516, -1, this.currentLevel);
			}
			var2 = (ProjectileEntity) this.projectiles.next();
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void closeInterfaces() {
		this.out.pIsaac(187);
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

	@ObfuscatedName("client.m(I)V")
	public final void handleInput() {
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
				this.handleInterfaceInput(super.mouseX, 4, super.mouseY, 4, Component.types[this.viewportInterfaceId], 0);
			}
		}
		if (this.viewportHoveredInterfaceId != this.lastHoveredInterfaceId) {
			this.viewportHoveredInterfaceId = this.lastHoveredInterfaceId;
		}
		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.sidebarInterfaceId != -1) {
				this.handleInterfaceInput(super.mouseX, 205, super.mouseY, 553, Component.types[this.sidebarInterfaceId], 0);
			} else if (this.tabInterfaceId[this.selectedTab] != -1) {
				this.handleInterfaceInput(super.mouseX, 205, super.mouseY, 553, Component.types[this.tabInterfaceId[this.selectedTab]], 0);
			}
		}
		if (this.sidebarHoveredInterfaceId != this.lastHoveredInterfaceId) {
			this.redrawSidebar = true;
			this.sidebarHoveredInterfaceId = this.lastHoveredInterfaceId;
		}
		this.lastHoveredInterfaceId = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 426 && super.mouseY < 453) {
			if (this.chatInterfaceId != -1) {
				this.handleInterfaceInput(super.mouseX, 357, super.mouseY, 17, Component.types[this.chatInterfaceId], 0);
			} else if (super.mouseY < 434) {
				this.handlePrivateChatInput(super.mouseX - 17, super.mouseY - 357);
			}
		}
		if (this.chatInterfaceId != -1 && this.chatHoveredInterfaceId != this.lastHoveredInterfaceId) {
			this.redrawChatback = true;
			this.chatHoveredInterfaceId = this.lastHoveredInterfaceId;
		}
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < this.menuSize - 1; var3++) {
				if (this.menuAction[var3] < 1000 && this.menuAction[var3 + 1] > 1000) {
					String var4 = this.menuOption[var3];
					this.menuOption[var3] = this.menuOption[var3 + 1];
					this.menuOption[var3 + 1] = var4;
					int var5 = this.menuAction[var3];
					this.menuAction[var3] = this.menuAction[var3 + 1];
					this.menuAction[var3 + 1] = var5;
					int var6 = this.menuParamB[var3];
					this.menuParamB[var3] = this.menuParamB[var3 + 1];
					this.menuParamB[var3 + 1] = var6;
					int var7 = this.menuParamC[var3];
					this.menuParamC[var3] = this.menuParamC[var3 + 1];
					this.menuParamC[var3 + 1] = var7;
					int var8 = this.menuParamA[var3];
					this.menuParamA[var3] = this.menuParamA[var3 + 1];
					this.menuParamA[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLob;)V")
	public final void storeLoc(LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.layer == 0) {
			var3 = this.scene.getWallTypecode(arg1.level, arg1.localX, arg1.localZ);
		}
		if (arg1.layer == 1) {
			var3 = this.scene.getDecorTypecode(arg1.localZ, arg1.level, arg1.localX);
		}
		if (arg1.layer == 2) {
			var3 = this.scene.getLocTypecode(arg1.level, arg1.localX, arg1.localZ);
		}
		if (arg1.layer == 3) {
			var3 = this.scene.getGroundDecorTypecode(arg1.level, arg1.localX, arg1.localZ);
		}
		if (var3 != 0) {
			int var7 = this.scene.getInfo(arg1.level, arg1.localX, arg1.localZ, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.previousType = var4;
		arg1.previousShape = var5;
		arg1.previousAngle = var6;
	}

	public final void run() {
		if (this.flamesThread) {
			this.runFlames();
		} else {
			super.run();
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 244);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMemory();
				} else if (arg0[2].equals("highmem")) {
					setHighMemory();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					membersWorld = false;
				} else if (arg0[3].equals("members")) {
					membersWorld = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void pushNpcs(boolean arg1) {
		for (int var3 = 0; var3 < this.npcCount; var3++) {
			NpcEntity var4 = this.npcs[this.npcIds[var3]];
			int var5 = (this.npcIds[var3] << 14) + 536870912;
			if (var4 != null && var4.isVisible() && var4.type.alwaysontop == arg1) {
				int var6 = var4.x >> 7;
				int var7 = var4.z >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.size == 1 && (var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
						if (this.tileLastOccupiedCycle[var6][var7] == this.sceneCycle) {
							continue;
						}
						this.tileLastOccupiedCycle[var6][var7] = this.sceneCycle;
					}
					this.scene.addTemporary((var4.size - 1) * 64 + 60, var4.needsForwardDrawPadding, this.getHeightmapY(var4.z, this.currentLevel, var4.x), var4.yaw, var4.z, var4, var4.x, var5, this.currentLevel);
				}
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void drawPrivateMessages() {
		if (this.splitPrivateChat == 0) {
			return;
		}
		PixFont var2 = this.fontPlain12;
		int var3 = 0;
		if (this.systemUpdateTimer != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.messageText[var4] != null) {
				int var5 = this.messageType[var4];
				String var6 = this.messageSender[var4];
				byte var7 = 0;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					var7 = 1;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					var7 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var6))) {
					int var8 = 329 - var3 * 13;
					byte var9 = 4;
					var2.drawString("From", 0, var8, var9);
					var2.drawString("From", 65535, var8 - 1, var9);
					int var10 = var9 + var2.stringWidth("From ");
					if (var7 == 1) {
						this.imageModIcons[0].draw(var10, var8 - 12);
						var10 += 14;
					}
					if (var7 == 2) {
						this.imageModIcons[1].draw(var10, var8 - 12);
						var10 += 14;
					}
					var2.drawString(var6 + ": " + this.messageText[var4], 0, var8, var10);
					var2.drawString(var6 + ": " + this.messageText[var4], 65535, var8 - 1, var10);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && this.chatPrivateMode < 2) {
					int var11 = 329 - var3 * 13;
					var2.drawString(this.messageText[var4], 0, var11, 4);
					var2.drawString(this.messageText[var4], 65535, var11 - 1, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && this.chatPrivateMode < 2) {
					int var12 = 329 - var3 * 13;
					var2.drawString("To " + var6 + ": " + this.messageText[var4], 0, var12, 4);
					var2.drawString("To " + var6 + ": " + this.messageText[var4], 65535, var12 - 1, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void drawTooltip() {
		if (this.menuSize < 2 && this.objSelected == 0 && this.spellSelected == 0) {
			return;
		}
		String var3;
		if (this.objSelected == 1 && this.menuSize < 2) {
			var3 = "Use " + this.objSelectedName + " with...";
		} else if (this.spellSelected == 1 && this.menuSize < 2) {
			var3 = this.spellCaption + "...";
		} else {
			var3 = this.menuOption[this.menuSize - 1];
		}
		if (this.menuSize > 2) {
			var3 = var3 + "@whi@ / " + (this.menuSize - 2) + " more options";
		}
		this.fontBold12.drawStringTooltip(true, loopCycle / 1000, 4, 15, 16777215, var3);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void drawMinimap() {
		this.areaMapback.bind();
		int var2 = this.macroCameraOrbitYaw + this.macroMinimapAngle & 0x7FF;
		int var3 = localPlayer.x / 32 + 48;
		int var4 = 464 - localPlayer.z / 32;
		this.imageMinimap.drawRotatedMasked(25, var4, 146, this.macroMinimapZoom + 256, 5, var2, this.field1538, this.minimapMaskLineLengths, this.minimapMaskLineOffsets, var3, 151);
		this.imageCompass.drawRotatedMasked(0, 25, 33, 256, 0, this.macroCameraOrbitYaw, this.field1538, this.compassMaskLineLengths, this.comapssMaskLineOffsets, 25, 33);
		for (int var5 = 0; var5 < this.field1210; var5++) {
			int var33 = this.field1211[var5] * 4 + 2 - localPlayer.x / 32;
			int var34 = this.field1212[var5] * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(var33, this.field1448[var5], var34);
		}
		for (int var6 = 0; var6 < 104; var6++) {
			for (int var29 = 0; var29 < 104; var29++) {
				LinkList var30 = this.field1432[this.currentLevel][var6][var29];
				if (var30 != null) {
					int var31 = var6 * 4 + 2 - localPlayer.x / 32;
					int var32 = var29 * 4 + 2 - localPlayer.z / 32;
					this.drawOnMinimap(var31, this.imageMapdot0, var32);
				}
			}
		}
		for (int var7 = 0; var7 < this.npcCount; var7++) {
			NpcEntity var26 = this.npcs[this.npcIds[var7]];
			if (var26 != null && var26.isVisible() && var26.type.minimap) {
				int var27 = var26.x / 32 - localPlayer.x / 32;
				int var28 = var26.z / 32 - localPlayer.z / 32;
				this.drawOnMinimap(var27, this.imageMapdot1, var28);
			}
		}
		for (int var8 = 0; var8 < this.playerCount; var8++) {
			PlayerEntity var19 = this.players[this.playerIds[var8]];
			if (var19 != null && var19.isVisible()) {
				int var20 = var19.x / 32 - localPlayer.x / 32;
				int var21 = var19.z / 32 - localPlayer.z / 32;
				boolean var22 = false;
				long var23 = JString.toBase37(var19.name);
				for (int var25 = 0; var25 < this.friendCount; var25++) {
					if (this.friendName37[var25] == var23 && this.friendWorld[var25] != 0) {
						var22 = true;
						break;
					}
				}
				if (var22) {
					this.drawOnMinimap(var20, this.imageMapdot3, var21);
				} else {
					this.drawOnMinimap(var20, this.imageMapdot2, var21);
				}
			}
		}
		if (this.hintType != 0 && loopCycle % 20 < 10) {
			if (this.hintType == 1 && this.field1277 >= 0 && this.field1277 < this.npcs.length) {
				NpcEntity var9 = this.npcs[this.field1277];
				if (var9 != null) {
					int var10 = var9.x / 32 - localPlayer.x / 32;
					int var11 = var9.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(var10, var11, this.imageMapmarker1);
				}
			}
			if (this.hintType == 2) {
				int var12 = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
				int var13 = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
				this.drawMinimapHint(var12, var13, this.imageMapmarker1);
			}
			if (this.hintType == 10 && this.field1415 >= 0 && this.field1415 < this.players.length) {
				PlayerEntity var14 = this.players[this.field1415];
				if (var14 != null) {
					int var15 = var14.x / 32 - localPlayer.x / 32;
					int var16 = var14.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(var15, var16, this.imageMapmarker1);
				}
			}
		}
		if (this.flagSceneTileX != 0) {
			int var17 = this.flagSceneTileX * 4 + 2 - localPlayer.x / 32;
			int var18 = this.flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(var17, this.imageMapmarker0, var18);
		}
		Pix2D.fillRect(16777215, 3, 3, 97, 78);
		this.areaViewport.bind();
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)Lyb;")
	public final Jagfile getJagFile(int arg0, String arg1, int arg2, String arg3, int arg4) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (this.fileStreams[0] != null) {
				var7 = this.fileStreams[0].read(arg2);
			}
		} catch (Exception var28) {
		}
		if (var7 != null) {
			this.field1329.reset();
			this.field1329.update(var7);
			int var9 = (int) this.field1329.getValue();
			if (arg0 != var9) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new Jagfile(var7);
		}
		int var11 = 0;
		while (var7 == null) {
			this.drawProgress(arg4, "Requesting " + arg3);
			Object var12 = null;
			try {
				int var13 = 0;
				DataInputStream var14 = this.openUrl(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				Packet var16 = new Packet(var15);
				var16.pos = 3;
				int var17 = var16.g3() + 6;
				int var18 = 6;
				var7 = new byte[var17];
				for (int var19 = 0; var19 < 6; var19++) {
					var7[var19] = var15[var19];
				}
				while (var18 < var17) {
					int var20 = var17 - var18;
					if (var20 > 1000) {
						var20 = 1000;
					}
					int var21 = var14.read(var7, var18, var20);
					if (var21 < 0) {
						throw new IOException("EOF");
					}
					var18 += var21;
					int var22 = var18 * 100 / var17;
					if (var13 != var22) {
						this.drawProgress(arg4, "Loading " + arg3 + " - " + var22 + "%");
					}
					var13 = var22;
				}
				var14.close();
				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].write(var7, arg2, var7.length);
					}
				} catch (Exception var27) {
					this.fileStreams[0] = null;
				}
				if (var7 != null) {
					this.field1329.reset();
					this.field1329.update(var7);
					int var23 = (int) this.field1329.getValue();
					if (arg0 != var23) {
						var7 = null;
						var11++;
					}
				}
			} catch (IOException var29) {
				var7 = null;
			} catch (Exception var30) {
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var24 = var8; var24 > 0; var24--) {
					if (var11 >= 3) {
						this.drawProgress(arg4, "Game updated - please reload page");
						var24 = 10;
					} else {
						this.drawProgress(arg4, "Error loading - Will retry in " + var24 + " secs.");
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var26) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
			}
		}
		return new Jagfile(var7);
	}

	@ObfuscatedName("client.a()V")
	public final void load() {
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (alreadyStarted) {
			this.errorStarted = true;
			return;
		}
		alreadyStarted = true;
		boolean var1 = false;
		String var2 = this.getHost();
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.247")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.249")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.253")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.254")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.errorHost = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.fileStreams[var3] = new FileStream(var3 + 1, signlink.cache_idx[var3], signlink.cache_dat, 500000);
			}
		}
		try {
			int var4 = 5;
			this.jagChecksum[8] = 0;
			while (this.jagChecksum[8] == 0) {
				this.drawProgress(20, "Connecting to web server");
				try {
					DataInputStream var5 = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D));
					Packet var6 = new Packet(new byte[36]);
					var5.readFully(var6.data, 0, 36);
					for (int var7 = 0; var7 < 9; var7++) {
						this.jagChecksum[var7] = var6.g4();
					}
					var5.close();
				} catch (IOException var80) {
					for (int var8 = var4; var8 > 0; var8--) {
						this.drawProgress(10, "Error loading - Will retry in " + var8 + " secs.");
						try {
							Thread.sleep(1000L);
						} catch (Exception var75) {
						}
					}
					var4 *= 2;
					if (var4 > 60) {
						var4 = 60;
					}
				}
			}
			this.jagTitle = this.getJagFile(this.jagChecksum[1], "title", 1, "title screen", 25);
			this.fontPlain11 = new PixFont(this.jagTitle, "p11");
			this.fontPlain12 = new PixFont(this.jagTitle, "p12");
			this.fontBold12 = new PixFont(this.jagTitle, "b12");
			this.fontQuill8 = new PixFont(this.jagTitle, "q8");
			this.loadTitleBackground();
			this.loadTitleImages();
			Jagfile var9 = this.getJagFile(this.jagChecksum[2], "config", 2, "config", 30);
			Jagfile var10 = this.getJagFile(this.jagChecksum[3], "interface", 3, "interface", 35);
			Jagfile var11 = this.getJagFile(this.jagChecksum[4], "media", 4, "2d graphics", 40);
			Jagfile var12 = this.getJagFile(this.jagChecksum[6], "textures", 6, "textures", 45);
			Jagfile var13 = this.getJagFile(this.jagChecksum[7], "wordenc", 7, "chat system", 50);
			Jagfile var14 = this.getJagFile(this.jagChecksum[8], "sounds", 8, "sound effects", 55);
			this.levelTileFlags = new byte[4][104][104];
			this.levelHeightmap = new int[4][105][105];
			this.scene = new World3D(104, this.levelHeightmap, 104, 4);
			for (int var15 = 0; var15 < 4; var15++) {
				this.levelCollisionMap[var15] = new CollisionMap(104, 104);
			}
			this.imageMinimap = new Pix32(512, 512);
			Jagfile var16 = this.getJagFile(this.jagChecksum[5], "versionlist", 5, "update list", 60);
			this.drawProgress(60, "Connecting to update server");
			this.onDemand = new OnDemand();
			this.onDemand.unpack(var16, this);
			AnimFrame.init(this.onDemand.getAnimCount());
			Model.init(this.onDemand.getFileCount(0), this.onDemand);
			if (!lowMemory) {
				this.midiSong = 0;
				this.midiFading = false;
				this.onDemand.request(2, this.midiSong);
				while (this.onDemand.remaining() > 0) {
					this.updateOnDemand();
					try {
						Thread.sleep(100L);
					} catch (Exception var74) {
					}
				}
			}
			this.drawProgress(65, "Requesting animations");
			int var17 = this.onDemand.getFileCount(1);
			for (int var18 = 0; var18 < var17; var18++) {
				this.onDemand.request(1, var18);
			}
			while (this.onDemand.remaining() > 0) {
				int var19 = var17 - this.onDemand.remaining();
				if (var19 > 0) {
					this.drawProgress(65, "Loading animations - " + var19 * 100 / var17 + "%");
				}
				this.updateOnDemand();
				try {
					Thread.sleep(100L);
				} catch (Exception var73) {
				}
			}
			this.drawProgress(70, "Requesting models");
			int var20 = this.onDemand.getFileCount(0);
			for (int var21 = 0; var21 < var20; var21++) {
				int var22 = this.onDemand.getModelFlags(var21);
				if ((var22 & 0x1) != 0) {
					this.onDemand.request(0, var21);
				}
			}
			int var23 = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int var24 = var23 - this.onDemand.remaining();
				if (var24 > 0) {
					this.drawProgress(70, "Loading models - " + var24 * 100 / var23 + "%");
				}
				this.updateOnDemand();
				try {
					Thread.sleep(100L);
				} catch (Exception var72) {
				}
			}
			if (this.fileStreams[0] != null) {
				this.drawProgress(75, "Requesting maps");
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 1));
				int var25 = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int var26 = var25 - this.onDemand.remaining();
					if (var26 > 0) {
						this.drawProgress(75, "Loading maps - " + var26 * 100 / var25 + "%");
					}
					this.updateOnDemand();
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
				}
			}
			int var27 = this.onDemand.getFileCount(0);
			for (int var28 = 0; var28 < var27; var28++) {
				int var29 = this.onDemand.getModelFlags(var28);
				byte var30 = 0;
				if ((var29 & 0x8) != 0) {
					var30 = 10;
				} else if ((var29 & 0x20) != 0) {
					var30 = 9;
				} else if ((var29 & 0x10) != 0) {
					var30 = 8;
				} else if ((var29 & 0x40) != 0) {
					var30 = 7;
				} else if ((var29 & 0x80) != 0) {
					var30 = 6;
				} else if ((var29 & 0x2) != 0) {
					var30 = 5;
				} else if ((var29 & 0x4) != 0) {
					var30 = 4;
				}
				if ((var29 & 0x1) != 0) {
					var30 = 3;
				}
				if (var30 != 0) {
					this.onDemand.prefetch(0, var28, var30);
				}
			}
			this.onDemand.prefetchMaps(membersWorld);
			if (!lowMemory) {
				int var31 = this.onDemand.getFileCount(2);
				for (int var32 = 1; var32 < var31; var32++) {
					if (this.onDemand.shouldPrefetchMidi(var32)) {
						this.onDemand.prefetch(2, var32, (byte) 1);
					}
				}
			}
			this.drawProgress(80, "Unpacking media");
			this.imageInvback = new Pix8(var11, "invback", 0);
			this.imageChatback = new Pix8(var11, "chatback", 0);
			this.imageMapback = new Pix8(var11, "mapback", 0);
			this.imageBackbase1 = new Pix8(var11, "backbase1", 0);
			this.imageBackbase2 = new Pix8(var11, "backbase2", 0);
			this.imageBackhmid1 = new Pix8(var11, "backhmid1", 0);
			for (int var33 = 0; var33 < 13; var33++) {
				this.imageSideicons[var33] = new Pix8(var11, "sideicons", var33);
			}
			this.imageCompass = new Pix32(var11, "compass", 0);
			this.imageMapedge = new Pix32(var11, "mapedge", 0);
			this.imageMapedge.crop();
			try {
				for (int var34 = 0; var34 < 50; var34++) {
					this.imageMapscene[var34] = new Pix8(var11, "mapscene", var34);
				}
			} catch (Exception var79) {
			}
			try {
				for (int var35 = 0; var35 < 50; var35++) {
					this.imageMapfunction[var35] = new Pix32(var11, "mapfunction", var35);
				}
			} catch (Exception var78) {
			}
			try {
				for (int var36 = 0; var36 < 20; var36++) {
					this.imageHitmark[var36] = new Pix32(var11, "hitmarks", var36);
				}
			} catch (Exception var77) {
			}
			try {
				for (int var37 = 0; var37 < 20; var37++) {
					this.imageHeadicon[var37] = new Pix32(var11, "headicons", var37);
				}
			} catch (Exception var76) {
			}
			this.imageMapmarker0 = new Pix32(var11, "mapmarker", 0);
			this.imageMapmarker1 = new Pix32(var11, "mapmarker", 1);
			for (int var38 = 0; var38 < 8; var38++) {
				this.imageCross[var38] = new Pix32(var11, "cross", var38);
			}
			this.imageMapdot0 = new Pix32(var11, "mapdots", 0);
			this.imageMapdot1 = new Pix32(var11, "mapdots", 1);
			this.imageMapdot2 = new Pix32(var11, "mapdots", 2);
			this.imageMapdot3 = new Pix32(var11, "mapdots", 3);
			this.imageScrollbar0 = new Pix8(var11, "scrollbar", 0);
			this.imageScrollbar1 = new Pix8(var11, "scrollbar", 1);
			this.imageRedstone1 = new Pix8(var11, "redstone1", 0);
			this.imageRedstone2 = new Pix8(var11, "redstone2", 0);
			this.imageRedstone3 = new Pix8(var11, "redstone3", 0);
			this.imageRedstone1h = new Pix8(var11, "redstone1", 0);
			this.imageRedstone1h.flipHorizontally();
			this.imageRedstone2h = new Pix8(var11, "redstone2", 0);
			this.imageRedstone2h.flipHorizontally();
			this.imageRedstone1v = new Pix8(var11, "redstone1", 0);
			this.imageRedstone1v.flipVertically();
			this.imageRedstone2v = new Pix8(var11, "redstone2", 0);
			this.imageRedstone2v.flipVertically();
			this.imageRedstone3v = new Pix8(var11, "redstone3", 0);
			this.imageRedstone3v.flipVertically();
			this.imageRedstone1hv = new Pix8(var11, "redstone1", 0);
			this.imageRedstone1hv.flipHorizontally();
			this.imageRedstone1hv.flipVertically();
			this.imageRedstone2hv = new Pix8(var11, "redstone2", 0);
			this.imageRedstone2hv.flipHorizontally();
			this.imageRedstone2hv.flipVertically();
			for (int var39 = 0; var39 < 2; var39++) {
				this.imageModIcons[var39] = new Pix8(var11, "mod_icons", var39);
			}
			Pix32 var40 = new Pix32(var11, "backleft1", 0);
			this.areaBackleft1 = new PixMap(this.getBaseComponent(), var40.cropBottom, var40.cropRight);
			var40.blitOpaque(0, 0);
			Pix32 var41 = new Pix32(var11, "backleft2", 0);
			this.areaBackleft2 = new PixMap(this.getBaseComponent(), var41.cropBottom, var41.cropRight);
			var41.blitOpaque(0, 0);
			Pix32 var42 = new Pix32(var11, "backright1", 0);
			this.areaBackright1 = new PixMap(this.getBaseComponent(), var42.cropBottom, var42.cropRight);
			var42.blitOpaque(0, 0);
			Pix32 var43 = new Pix32(var11, "backright2", 0);
			this.areaBackright2 = new PixMap(this.getBaseComponent(), var43.cropBottom, var43.cropRight);
			var43.blitOpaque(0, 0);
			Pix32 var44 = new Pix32(var11, "backtop1", 0);
			this.areaBacktop1 = new PixMap(this.getBaseComponent(), var44.cropBottom, var44.cropRight);
			var44.blitOpaque(0, 0);
			Pix32 var45 = new Pix32(var11, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(this.getBaseComponent(), var45.cropBottom, var45.cropRight);
			var45.blitOpaque(0, 0);
			Pix32 var46 = new Pix32(var11, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(this.getBaseComponent(), var46.cropBottom, var46.cropRight);
			var46.blitOpaque(0, 0);
			Pix32 var47 = new Pix32(var11, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(this.getBaseComponent(), var47.cropBottom, var47.cropRight);
			var47.blitOpaque(0, 0);
			Pix32 var48 = new Pix32(var11, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(this.getBaseComponent(), var48.cropBottom, var48.cropRight);
			var48.blitOpaque(0, 0);
			int var49 = (int) (Math.random() * 21.0D) - 10;
			int var50 = (int) (Math.random() * 21.0D) - 10;
			int var51 = (int) (Math.random() * 21.0D) - 10;
			int var52 = (int) (Math.random() * 41.0D) - 20;
			for (int var53 = 0; var53 < 50; var53++) {
				if (this.imageMapfunction[var53] != null) {
					this.imageMapfunction[var53].translate(var49 + var52, var51 + var52, var50 + var52);
				}
				if (this.imageMapscene[var53] != null) {
					this.imageMapscene[var53].translate(var49 + var52, var51 + var52, var50 + var52);
				}
			}
			this.drawProgress(83, "Unpacking textures");
			Pix3D.unpackTextures(var12);
			Pix3D.setBrightness(0.8D);
			Pix3D.initPool(20);
			this.drawProgress(86, "Unpacking config");
			SeqType.unpack(var9);
			LocType.unpack(var9);
			FloType.unpack(var9);
			ObjType.unpack(var9);
			NpcType.unpack(var9);
			IdkType.unpack(var9);
			SpotAnimType.unpack(var9);
			VarpType.unpack(var9);
			ObjType.membersWorld = membersWorld;
			if (!lowMemory) {
				this.drawProgress(90, "Unpacking sounds");
				byte[] var54 = var14.read("sounds.dat", null);
				Packet var55 = new Packet(var54);
				Wave.unpack(var55);
			}
			this.drawProgress(95, "Unpacking interfaces");
			PixFont[] var56 = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8 };
			Component.unpack(var10, var11, var56);
			this.drawProgress(100, "Preparing game engine");
			for (int var57 = 0; var57 < 33; var57++) {
				int var58 = 999;
				int var59 = 0;
				for (int var60 = 0; var60 < 34; var60++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * var57 + var60] == 0) {
						if (var58 == 999) {
							var58 = var60;
						}
					} else if (var58 != 999) {
						var59 = var60;
						break;
					}
				}
				this.comapssMaskLineOffsets[var57] = var58;
				this.compassMaskLineLengths[var57] = var59 - var58;
			}
			for (int var61 = 5; var61 < 156; var61++) {
				int var62 = 999;
				int var63 = 0;
				for (int var64 = 25; var64 < 172; var64++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
						if (var62 == 999) {
							var62 = var64;
						}
					} else if (var62 != 999) {
						var63 = var64;
						break;
					}
				}
				this.minimapMaskLineOffsets[var61 - 5] = var62 - 25;
				this.minimapMaskLineLengths[var61 - 5] = var63 - var62;
			}
			Pix3D.init3D(96, 479);
			this.areaChatbackOffset = Pix3D.lineOffset;
			Pix3D.init3D(261, 190);
			this.areaSidebarOffset = Pix3D.lineOffset;
			Pix3D.init3D(334, 512);
			this.areaViewportOffset = Pix3D.lineOffset;
			int[] var65 = new int[9];
			for (int var66 = 0; var66 < 9; var66++) {
				int var67 = var66 * 32 + 128 + 15;
				int var68 = var67 * 3 + 600;
				int var69 = Pix3D.sinTable[var67];
				var65[var66] = var68 * var69 >> 16;
			}
			World3D.init(800, 334, 500, 512, var65);
			WordFilter.unpack(var13);
			this.mouseTracking = new MouseTracking(this);
		} catch (Exception var81) {
			signlink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void getPlayerLocal(int arg0, Packet arg1) {
		arg1.bits();
		int var4 = arg1.gBit(1);
		if (var4 == 0) {
			return;
		}
		int var5 = arg1.gBit(2);
		if (var5 == 0) {
			this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
		} else if (var5 == 1) {
			int var7 = arg1.gBit(3);
			localPlayer.move(var7, false);
			int var8 = arg1.gBit(1);
			if (var8 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (var5 == 2) {
			int var9 = arg1.gBit(3);
			localPlayer.move(var9, true);
			int var10 = arg1.gBit(3);
			localPlayer.move(var10, true);
			int var11 = arg1.gBit(1);
			if (var11 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (var5 == 3) {
			this.currentLevel = arg1.gBit(2);
			int var12 = arg1.gBit(7);
			int var13 = arg1.gBit(7);
			int var14 = arg1.gBit(1);
			localPlayer.move(var14 == 1, var12, var13);
			int var15 = arg1.gBit(1);
			if (var15 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		}
	}

	public final void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			membersWorld = false;
		} else {
			membersWorld = true;
		}
		this.initApplet(503, 765);
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String formatObjCountTagged(int arg1) {
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

	@ObfuscatedName("client.d(B)V")
	public final void updateOnDemand() {
		while (true) {
			OnDemandRequest var2 = this.onDemand.cycle();
			if (var2 == null) {
				return;
			}
			if (var2.archive == 0) {
				Model.unpack(var2.file, var2.data);
				if ((this.onDemand.getModelFlags(var2.file) & 0x62) != 0) {
					this.redrawSidebar = true;
					if (this.chatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
			}
			if (var2.archive == 1 && var2.data != null) {
				AnimFrame.unpack(300, var2.data);
			}
			if (var2.archive == 2 && this.midiSong == var2.file && var2.data != null) {
				this.saveMidi(this.midiFading, var2.data);
			}
			if (var2.archive == 3 && this.sceneState == 1) {
				for (int var3 = 0; var3 < this.sceneMapLandData.length; var3++) {
					if (this.sceneMapLandFile[var3] == var2.file) {
						this.sceneMapLandData[var3] = var2.data;
						if (var2.data == null) {
							this.sceneMapLandFile[var3] = -1;
						}
						break;
					}
					if (this.sceneMapLocFile[var3] == var2.file) {
						this.sceneMapLocData[var3] = var2.data;
						if (var2.data == null) {
							this.sceneMapLocFile[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.archive == 93 && this.onDemand.hasMapLocFile(var2.file)) {
				World.prefetchLocs(new Packet(var2.data), this.onDemand);
			}
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int mix(int arg1, int arg2, int arg3) {
		int var5 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.n(I)V")
	public final void draw2DEntityElements() {
		this.chatCount = 0;
		for (int var2 = -1; var2 < this.npcCount + this.playerCount; var2++) {
			PathingEntity var17;
			if (var2 == -1) {
				var17 = localPlayer;
			} else if (var2 < this.playerCount) {
				var17 = this.players[this.playerIds[var2]];
			} else {
				var17 = this.npcs[this.npcIds[var2 - this.playerCount]];
			}
			if (var17 != null && var17.isVisible()) {
				if (var2 >= this.playerCount) {
					NpcType var21 = ((NpcEntity) var17).type;
					if (var21.headicon >= 0 && var21.headicon < this.imageHeadicon.length) {
						this.projectFromGround(var17.height + 15, var17);
						if (this.projectX > -1) {
							this.imageHeadicon[var21.headicon].draw(this.projectX - 12, this.projectY - 30);
						}
					}
					if (this.hintType == 1 && this.npcIds[var2 - this.playerCount] == this.field1277 && loopCycle % 20 < 10) {
						this.projectFromGround(var17.height + 15, var17);
						if (this.projectX > -1) {
							this.imageHeadicon[2].draw(this.projectX - 12, this.projectY - 28);
						}
					}
				} else {
					int var18 = 30;
					PlayerEntity var19 = (PlayerEntity) var17;
					if (var19.headicon != 0) {
						this.projectFromGround(var17.height + 15, var17);
						if (this.projectX > -1) {
							for (int var20 = 0; var20 < 8; var20++) {
								if ((var19.headicon & 0x1 << var20) != 0) {
									this.imageHeadicon[var20].draw(this.projectX - 12, this.projectY - var18);
									var18 -= 25;
								}
							}
						}
					}
					if (var2 >= 0 && this.hintType == 10 && this.playerIds[var2] == this.field1415) {
						this.projectFromGround(var17.height + 15, var17);
						if (this.projectX > -1) {
							this.imageHeadicon[7].draw(this.projectX - 12, this.projectY - var18);
						}
					}
				}
				if (var17.chatMessage != null && (var2 >= this.playerCount || this.chatPublicMode == 0 || this.chatPublicMode == 3 || this.chatPublicMode == 1 && this.isFriend(((PlayerEntity) var17).name))) {
					this.projectFromGround(var17.height, var17);
					if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
						this.chatWidth[this.chatCount] = this.fontBold12.stringWidth(var17.chatMessage) / 2;
						this.chatHeight[this.chatCount] = this.fontBold12.height;
						this.chatX[this.chatCount] = this.projectX;
						this.chatY[this.chatCount] = this.projectY;
						this.chatColour[this.chatCount] = var17.chatColour;
						this.chatEffect[this.chatCount] = var17.chatEffect;
						this.chatTimer[this.chatCount] = var17.chatTimer;
						this.chatMessage[this.chatCount++] = var17.chatMessage;
						if (this.chatEffects == 0 && var17.chatEffect == 1) {
							this.chatHeight[this.chatCount] += 10;
							this.chatY[this.chatCount] += 5;
						}
						if (this.chatEffects == 0 && var17.chatEffect == 2) {
							this.chatWidth[this.chatCount] = 60;
						}
					}
				}
				if (var17.combatCycle > loopCycle) {
					this.projectFromGround(var17.height + 15, var17);
					if (this.projectX > -1) {
						int var22 = var17.health * 30 / var17.totalHealth;
						if (var22 > 30) {
							var22 = 30;
						}
						Pix2D.fillRect(65280, var22, 5, this.projectX - 15, this.projectY - 3);
						Pix2D.fillRect(16711680, 30 - var22, 5, this.projectX - 15 + var22, this.projectY - 3);
					}
				}
				for (int var23 = 0; var23 < 4; var23++) {
					if (var17.damageCycle[var23] > loopCycle) {
						this.projectFromGround(var17.height / 2, var17);
						if (this.projectX > -1) {
							if (var23 == 1) {
								this.projectY -= 20;
							}
							if (var23 == 2) {
								this.projectX -= 15;
								this.projectY -= 10;
							}
							if (var23 == 3) {
								this.projectX += 15;
								this.projectY -= 10;
							}
							this.imageHitmark[var17.damageType[var23]].draw(this.projectX - 12, this.projectY - 12);
							this.fontPlain11.drawStringCenter(this.projectX, 0, String.valueOf(var17.damage[var23]), this.projectY + 4);
							this.fontPlain11.drawStringCenter(this.projectX - 1, 16777215, String.valueOf(var17.damage[var23]), this.projectY + 3);
						}
					}
				}
			}
		}
		for (int var3 = 0; var3 < this.chatCount; var3++) {
			int var4 = this.chatX[var3];
			int var5 = this.chatY[var3];
			int var6 = this.chatWidth[var3];
			int var7 = this.chatHeight[var3];
			boolean var8 = true;
			while (var8) {
				var8 = false;
				for (int var16 = 0; var16 < var3; var16++) {
					if (var5 + 2 > this.chatY[var16] - this.chatHeight[var16] && var5 - var7 < this.chatY[var16] + 2 && var4 - var6 < this.chatWidth[var16] + this.chatX[var16] && var4 + var6 > this.chatX[var16] - this.chatWidth[var16] && this.chatY[var16] - this.chatHeight[var16] < var5) {
						var5 = this.chatY[var16] - this.chatHeight[var16];
						var8 = true;
					}
				}
			}
			this.projectX = this.chatX[var3];
			this.projectY = this.chatY[var3] = var5;
			String var9 = this.chatMessage[var3];
			if (this.chatEffects == 0) {
				int var10 = 16776960;
				if (this.chatColour[var3] < 6) {
					var10 = this.CHAT_COLOURS[this.chatColour[var3]];
				}
				if (this.chatColour[var3] == 6) {
					var10 = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.chatColour[var3] == 7) {
					var10 = this.sceneCycle % 20 < 10 ? 255 : 65535;
				}
				if (this.chatColour[var3] == 8) {
					var10 = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (this.chatColour[var3] == 9) {
					int var11 = 150 - this.chatTimer[var3];
					if (var11 < 50) {
						var10 = var11 * 1280 + 16711680;
					} else if (var11 < 100) {
						var10 = 16776960 - (var11 - 50) * 327680;
					} else if (var11 < 150) {
						var10 = (var11 - 100) * 5 + 65280;
					}
				}
				if (this.chatColour[var3] == 10) {
					int var12 = 150 - this.chatTimer[var3];
					if (var12 < 50) {
						var10 = var12 * 5 + 16711680;
					} else if (var12 < 100) {
						var10 = 16711935 - (var12 - 50) * 327680;
					} else if (var12 < 150) {
						var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
					}
				}
				if (this.chatColour[var3] == 11) {
					int var13 = 150 - this.chatTimer[var3];
					if (var13 < 50) {
						var10 = 16777215 - var13 * 327685;
					} else if (var13 < 100) {
						var10 = (var13 - 50) * 327685 + 65280;
					} else if (var13 < 150) {
						var10 = 16777215 - (var13 - 100) * 327680;
					}
				}
				if (this.chatEffect[var3] == 0) {
					this.fontBold12.drawStringCenter(this.projectX, 0, var9, this.projectY + 1);
					this.fontBold12.drawStringCenter(this.projectX, var10, var9, this.projectY);
				}
				if (this.chatEffect[var3] == 1) {
					this.fontBold12.drawStringCenterWave(this.projectY + 1, this.sceneCycle, var9, this.projectX, 0);
					this.fontBold12.drawStringCenterWave(this.projectY, this.sceneCycle, var9, this.projectX, var10);
				}
				if (this.chatEffect[var3] == 2) {
					int var14 = this.fontBold12.stringWidth(var9);
					int var15 = (150 - this.chatTimer[var3]) * (var14 + 100) / 150;
					Pix2D.setBounds(this.projectX + 50, 334, 0, this.projectX - 50);
					this.fontBold12.drawString(var9, 0, this.projectY + 1, this.projectX + 50 - var15);
					this.fontBold12.drawString(var9, var10, this.projectY, this.projectX + 50 - var15);
					Pix2D.resetBounds();
				}
			} else {
				this.fontBold12.drawStringCenter(this.projectX, 0, var9, this.projectY + 1);
				this.fontBold12.drawStringCenter(this.projectX, 16776960, var9, this.projectY);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void setWaveVolume(int arg0) {
		signlink.wavevol = arg0;
	}

	@ObfuscatedName("client.e(B)V")
	public final void drawSidebar() {
		this.areaSidebar.bind();
		Pix3D.lineOffset = this.areaSidebarOffset;
		this.imageInvback.draw(0, 0);
		if (this.sidebarInterfaceId != -1) {
			this.drawInterface(0, 0, Component.types[this.sidebarInterfaceId], 0);
		} else if (this.tabInterfaceId[this.selectedTab] != -1) {
			this.drawInterface(0, 0, Component.types[this.tabInterfaceId[this.selectedTab]], 0);
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.drawMenu();
		}
		this.areaSidebar.draw(super.graphics, 205, 553);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.o(I)V")
	public final void pushSpotanims() {
		for (SpotAnimEntity var2 = (SpotAnimEntity) this.spotanims.head(); var2 != null; var2 = (SpotAnimEntity) this.spotanims.next()) {
			if (this.currentLevel != var2.level || var2.seqComplete) {
				var2.unlink();
			} else if (loopCycle >= var2.startCycle) {
				var2.update(this.sceneDelta);
				if (var2.seqComplete) {
					var2.unlink();
				} else {
					this.scene.addTemporary(60, false, var2.y, 0, var2.z, var2, var2.x, -1, var2.level);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void saveMidi(boolean arg0, byte[] arg1) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
	}

	@ObfuscatedName("client.p(I)V")
	public final void prepareGame() {
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
		this.areaChatback = new PixMap(this.getBaseComponent(), 96, 479);
		this.areaMapback = new PixMap(this.getBaseComponent(), 156, 172);
		Pix2D.clear();
		this.imageMapback.draw(0, 0);
		this.areaSidebar = new PixMap(this.getBaseComponent(), 261, 190);
		this.areaViewport = new PixMap(this.getBaseComponent(), 334, 512);
		Pix2D.clear();
		this.areaBackbase1 = new PixMap(this.getBaseComponent(), 50, 496);
		this.areaBackbase2 = new PixMap(this.getBaseComponent(), 37, 269);
		this.areaBackhmid1 = new PixMap(this.getBaseComponent(), 45, 249);
		this.redrawFrame = true;
	}

	@ObfuscatedName("client.q(I)V")
	public final void updateWorldLocation() {
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

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String getCombatLevelTag(int arg0, int arg2) {
		int var3 = arg2 - arg0;
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

	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg6, int arg7) {
		if (arg1 < 1 || arg6 < 1 || arg1 > 102 || arg6 > 102) {
			return;
		}
		if (lowMemory && this.currentLevel != arg4) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg7 == 0) {
			var9 = this.scene.getWallTypecode(arg4, arg1, arg6);
		}
		if (arg7 == 1) {
			var9 = this.scene.getDecorTypecode(arg6, arg4, arg1);
		}
		if (arg7 == 2) {
			var9 = this.scene.getLocTypecode(arg4, arg1, arg6);
		}
		if (arg7 == 3) {
			var9 = this.scene.getGroundDecorTypecode(arg4, arg1, arg6);
		}
		if (var9 != 0) {
			int var13 = this.scene.getInfo(arg4, arg1, arg6, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg7 == 0) {
				this.scene.removeWall(arg1, arg4, arg6);
				LocType var17 = LocType.get(var14);
				if (var17.blockwalk) {
					this.levelCollisionMap[arg4].delWall(var17.blockrange, arg6, var16, var15, arg1);
				}
			}
			if (arg7 == 1) {
				this.scene.removeDecor(arg6, arg1, arg4);
			}
			if (arg7 == 2) {
				this.scene.removeLoc(arg1, arg6, arg4);
				LocType var18 = LocType.get(var14);
				if (var18.width + arg1 > 103 || var18.width + arg6 > 103 || var18.length + arg1 > 103 || var18.length + arg6 > 103) {
					return;
				}
				if (var18.blockwalk) {
					this.levelCollisionMap[arg4].delLoc(var18.width, arg6, arg1, var18.blockrange, var18.length, var16);
				}
			}
			if (arg7 == 3) {
				this.scene.removeGroundDecor(arg6, arg4, arg1);
				LocType var19 = LocType.get(var14);
				if (var19.blockwalk && var19.active) {
					this.levelCollisionMap[arg4].removeBlocked(arg6, arg1);
				}
			}
		}
		if (arg0 >= 0) {
			int var20 = arg4;
			if (arg4 < 3 && (this.levelTileFlags[1][arg1][arg6] & 0x2) == 2) {
				var20 = arg4 + 1;
			}
			World.addLoc(arg1, arg3, arg0, arg6, this.scene, arg2, this.levelHeightmap, this.levelCollisionMap[arg4], var20, arg4);
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void resetInterfaceAnimation(int arg0) {
		Component var3 = Component.types[arg0];
		for (int var4 = 0; var4 < var3.children.length && var3.children[var4] != -1; var4++) {
			Component var5 = Component.types[var3.children[var4]];
			if (var5.type == 1) {
				this.resetInterfaceAnimation(var5.id);
			}
			var5.seqFrame = 0;
			var5.seqCycle = 0;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void addFriend(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.friendCount >= 100 && this.field1255 != 1) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
		} else if (this.friendCount >= 200) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
		} else {
			String var4 = JString.formatName(JString.fromBase37(arg1));
			for (int var5 = 0; var5 < this.friendCount; var5++) {
				if (this.friendName37[var5] == arg1) {
					this.addMessage(var4 + " is already on your friend list", "", 0);
					return;
				}
			}
			for (int var6 = 0; var6 < this.ignoreCount; var6++) {
				if (this.ignoreName37[var6] == arg1) {
					this.addMessage("Please remove " + var4 + " from your ignore list first", "", 0);
					return;
				}
			}
			if (!var4.equals(localPlayer.name)) {
				this.friendName[this.friendCount] = var4;
				this.friendName37[this.friendCount] = arg1;
				this.friendWorld[this.friendCount] = 0;
				this.friendCount++;
				this.redrawSidebar = true;
				this.out.pIsaac(9);
				this.out.p8(arg1);
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int getHeightmapY(int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 7;
		int var6 = arg1 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg2;
		if (arg2 < 3 && (this.levelTileFlags[1][var5][var6] & 0x2) == 2) {
			var7 = arg2 + 1;
		}
		int var8 = arg3 & 0x7F;
		int var9 = arg1 & 0x7F;
		int var10 = (128 - var8) * this.levelHeightmap[var7][var5][var6] + this.levelHeightmap[var7][var5 + 1][var6] * var8 >> 7;
		int var11 = (128 - var8) * this.levelHeightmap[var7][var5][var6 + 1] + this.levelHeightmap[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return (128 - var9) * var10 + var9 * var11 >> 7;
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void removeIgnore(long arg1) {
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
				this.out.pIsaac(207);
				this.out.p8(arg1);
				break;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void draw3DEntityElements() {
		this.drawPrivateMessages();
		if (this.crossMode == 1) {
			this.imageCross[this.crossCycle / 100].draw(this.crossX - 8 - 4, this.crossY - 8 - 4);
		}
		if (this.crossMode == 2) {
			this.imageCross[this.crossCycle / 100 + 4].draw(this.crossX - 8 - 4, this.crossY - 8 - 4);
		}
		if (this.viewportOverlayInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, this.viewportOverlayInterfaceId);
			this.drawInterface(0, 0, Component.types[this.viewportOverlayInterfaceId], 0);
		}
		if (this.field1264 > 0) {
			int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1264 / 10.0D) * 10.0D);
			for (int var3 = 0; var3 < 30; var3++) {
				int var4 = (30 - var3) * 16;
				Pix2D.drawHorizontalLine(var2 + var3, var4, 16776960, 256 - var4 / 2, this.field1264);
			}
		}
		if (this.viewportInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, this.viewportInterfaceId);
			this.drawInterface(0, 0, Component.types[this.viewportInterfaceId], 0);
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
				this.imageHeadicon[1].draw(472, 258);
			} else {
				this.imageHeadicon[1].draw(472, 296);
			}
		}
		if (this.wildernessLevel > 0) {
			this.imageHeadicon[0].draw(472, 296);
			this.fontPlain12.drawStringCenter(484, 16776960, "Level: " + this.wildernessLevel, 329);
		}
		if (this.worldLocationState == 1) {
			this.imageHeadicon[6].draw(472, 296);
			this.fontPlain12.drawStringCenter(484, 16776960, "Arena", 329);
		}
		if (this.systemUpdateTimer == 0) {
			return;
		}
		int var6 = this.systemUpdateTimer / 50;
		int var7 = var6 / 60;
		int var8 = var6 % 60;
		if (var8 < 10) {
			this.fontPlain12.drawString("System update in: " + var7 + ":0" + var8, 16776960, 329, 4);
		} else {
			this.fontPlain12.drawString("System update in: " + var7 + ":" + var8, 16776960, 329, 4);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void logout() {
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var3) {
		}
		this.stream = null;
		this.ingame = false;
		this.titleScreenState = 0;
		this.username = "";
		this.password = "";
		InputTracking.setDisabled();
		this.clearCache();
		this.scene.reset();
		for (int var2 = 0; var2 < 4; var2++) {
			this.levelCollisionMap[var2].reset();
		}
		System.gc();
		this.stopMidi();
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
	}

	@ObfuscatedName("client.g(B)V")
	public final void drawMenu() {
		int var2 = this.menuX;
		int var3 = this.menuY;
		int var4 = this.menuWidth;
		int var5 = this.menuHeight;
		int var6 = 6116423;
		Pix2D.fillRect(var6, var4, var5, var2, var3);
		Pix2D.fillRect(0, var4 - 2, 16, var2 + 1, var3 + 1);
		Pix2D.drawRect(var5 - 19, var4 - 2, 0, var2 + 1, var3 + 18);
		this.fontBold12.drawString("Choose Option", var6, var3 + 14, var2 + 3);
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
			int var10 = (this.menuSize - 1 - var9) * 15 + var3 + 31;
			int var11 = 16777215;
			if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
				var11 = 16776960;
			}
			this.fontBold12.drawStringTaggable(var11, var2 + 3, true, var10, this.menuOption[var9]);
		}
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void getPlayerExtended(Packet arg0, int arg1) {
		for (int var5 = 0; var5 < this.entityUpdateCount; var5++) {
			int var6 = this.entityUpdateIds[var5];
			PlayerEntity var7 = this.players[var6];
			int var8 = arg0.g1();
			if ((var8 & 0x80) == 128) {
				var8 += arg0.g1() << 8;
			}
			this.getPlayerExtended(var8, arg0, var6, var7);
		}
	}

	@ObfuscatedName("client.a(IILz;)V")
	public final void projectFromGround(int arg1, PathingEntity arg2) {
		this.projectFromGround(arg2.z, arg1, arg2.x);
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void projectFromGround(int arg1, int arg2, int arg3) {
		if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
			this.projectX = -1;
			this.projectY = -1;
			return;
		}
		int var5 = this.getHeightmapY(arg1, this.currentLevel, arg3) - arg2;
		int var6 = arg3 - this.cameraX;
		int var7 = var5 - this.cameraY;
		int var8 = arg1 - this.cameraZ;
		int var9 = Model.sinTable[this.cameraPitch];
		int var10 = Model.cosTable[this.cameraPitch];
		int var11 = Model.sinTable[this.cameraYaw];
		int var12 = Model.cosTable[this.cameraYaw];
		int var13 = var6 * var12 + var8 * var11 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		int var16 = var7 * var10 - var9 * var14 >> 16;
		int var17 = var7 * var9 + var10 * var14 >> 16;
		if (var17 >= 50) {
			this.projectX = (var13 << 9) / var17 + Pix3D.centerX;
			this.projectY = (var16 << 9) / var17 + Pix3D.centerY;
		} else {
			this.projectX = -1;
			this.projectY = -1;
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.h(Z)V")
	public final void clearCache() {
		LocType.modelCacheStatic.clear();
		LocType.modelCacheDynamic.clear();
		NpcType.modelCacheStatic.clear();
		ObjType.modelCache.clear();
		ObjType.iconCache.clear();
		PlayerEntity.modelCache.clear();
		SpotAnimType.modelCache.clear();
	}

	@ObfuscatedName("client.r(I)V")
	public final void updateAudio() {
		for (int var2 = 0; var2 < this.waveCount; var2++) {
			if (this.waveDelay[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.waveIds[var2] != this.lastWaveId || this.waveLoops[var2] != this.lastWaveLoops) {
						Packet var4 = Wave.generate(this.waveLoops[var2], this.waveIds[var2]);
						if (System.currentTimeMillis() + (long) (var4.pos / 22) > (long) (this.lastWaveLength / 22) + this.lastWaveStartTime) {
							this.lastWaveLength = var4.pos;
							this.lastWaveStartTime = System.currentTimeMillis();
							if (this.saveWave(var4.data, var4.pos)) {
								this.lastWaveId = this.waveIds[var2];
								this.lastWaveLoops = this.waveLoops[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!this.replayWave()) {
						var3 = true;
					}
				} catch (Exception var7) {
				}
				if (var3 && this.waveDelay[var2] != -5) {
					this.waveDelay[var2] = -5;
				} else {
					this.waveCount--;
					for (int var6 = var2; var6 < this.waveCount; var6++) {
						this.waveIds[var6] = this.waveIds[var6 + 1];
						this.waveLoops[var6] = this.waveLoops[var6 + 1];
						this.waveDelay[var6] = this.waveDelay[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = this.waveDelay[var2]--;
			}
		}
		if (this.nextMusicDelay <= 0) {
			return;
		}
		this.nextMusicDelay -= 20;
		if (this.nextMusicDelay < 0) {
			this.nextMusicDelay = 0;
		}
		if (this.nextMusicDelay == 0 && this.midiActive && !lowMemory) {
			this.midiSong = this.nextMidiSong;
			this.midiFading = false;
			this.onDemand.request(2, this.midiSong);
			return;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void setLowMemory() {
		World3D.lowMemory = true;
		Pix3D.lowMemory = true;
		lowMemory = true;
		World.lowMemory = true;
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void readZonePacket(int arg1, Packet arg2) {
		if (arg1 == 232 || arg1 == 125) {
			int var101 = arg2.g1();
			int var102 = (var101 >> 4 & 0x7) + this.field1337;
			int var103 = (var101 & 0x7) + this.field1338;
			int var104 = arg2.g1();
			int var105 = var104 >> 2;
			int var106 = var104 & 0x3;
			int var107 = this.field1305[var105];
			int var108;
			if (arg1 == 125) {
				var108 = -1;
			} else {
				var108 = arg2.g2();
			}
			if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
				this.appendLoc(var102, var105, -1, var108, var106, var107, var103, this.currentLevel, 0);
			}
		} else if (arg1 == 155) {
			int var4 = arg2.g1();
			int var5 = (var4 >> 4 & 0x7) + this.field1337;
			int var6 = (var4 & 0x7) + this.field1338;
			int var7 = arg2.g1();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = this.field1305[var8];
			int var11 = arg2.g2();
			if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
				int var12 = this.levelHeightmap[this.currentLevel][var5][var6];
				int var13 = this.levelHeightmap[this.currentLevel][var5 + 1][var6];
				int var14 = this.levelHeightmap[this.currentLevel][var5 + 1][var6 + 1];
				int var15 = this.levelHeightmap[this.currentLevel][var5][var6 + 1];
				if (var10 == 0) {
					Wall var16 = this.scene.getWall(var5, var6, this.currentLevel);
					if (var16 != null) {
						int var17 = var16.typecode >> 14 & 0x7FFF;
						if (var8 == 2) {
							var16.modelA = new LocEntity(var15, var14, var12, 2, var9 + 4, false, var13, var17, var11);
							var16.modelB = new LocEntity(var15, var14, var12, 2, var9 + 1 & 0x3, false, var13, var17, var11);
						} else {
							var16.modelA = new LocEntity(var15, var14, var12, var8, var9, false, var13, var17, var11);
						}
					}
				}
				if (var10 == 1) {
					Decor var18 = this.scene.getDecor(var5, this.currentLevel, var6);
					if (var18 != null) {
						var18.model = new LocEntity(var15, var14, var12, 4, 0, false, var13, var18.typecode >> 14 & 0x7FFF, var11);
					}
				}
				if (var10 == 2) {
					Location var19 = this.scene.getLoc(this.currentLevel, var6, var5);
					if (var8 == 11) {
						var8 = 10;
					}
					if (var19 != null) {
						var19.model = new LocEntity(var15, var14, var12, var8, var9, false, var13, var19.typecode >> 14 & 0x7FFF, var11);
					}
				}
				if (var10 == 3) {
					GroundDecor var20 = this.scene.getGroundDecor(var5, var6, this.currentLevel);
					if (var20 != null) {
						var20.model = new LocEntity(var15, var14, var12, 22, var9, false, var13, var20.typecode >> 14 & 0x7FFF, var11);
					}
				}
			}
		} else if (arg1 == 234) {
			int var21 = arg2.g1();
			int var22 = (var21 >> 4 & 0x7) + this.field1337;
			int var23 = (var21 & 0x7) + this.field1338;
			int var24 = arg2.g2();
			int var25 = arg2.g2();
			if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
				ObjStackEntity var26 = new ObjStackEntity();
				var26.field500 = var24;
				var26.field501 = var25;
				if (this.field1432[this.currentLevel][var22][var23] == null) {
					this.field1432[this.currentLevel][var22][var23] = new LinkList();
				}
				this.field1432[this.currentLevel][var22][var23].addTail(var26);
				this.sortObjStacks(var22, var23);
			}
		} else if (arg1 == 39) {
			int var27 = arg2.g1();
			int var28 = (var27 >> 4 & 0x7) + this.field1337;
			int var29 = (var27 & 0x7) + this.field1338;
			int var30 = arg2.g2();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				LinkList var31 = this.field1432[this.currentLevel][var28][var29];
				if (var31 != null) {
					for (ObjStackEntity var32 = (ObjStackEntity) var31.head(); var32 != null; var32 = (ObjStackEntity) var31.next()) {
						if ((var30 & 0x7FFF) == var32.field500) {
							var32.unlink();
							break;
						}
					}
					if (var31.head() == null) {
						this.field1432[this.currentLevel][var28][var29] = null;
					}
					this.sortObjStacks(var28, var29);
				}
			}
		} else if (arg1 == 137) {
			int var33 = arg2.g1();
			int var34 = (var33 >> 4 & 0x7) + this.field1337;
			int var35 = (var33 & 0x7) + this.field1338;
			int var36 = var34 + arg2.g1b();
			int var37 = var35 + arg2.g1b();
			int var38 = arg2.g2b();
			int var39 = arg2.g2();
			int var40 = arg2.g1();
			int var41 = arg2.g1();
			int var42 = arg2.g2();
			int var43 = arg2.g2();
			int var44 = arg2.g1();
			int var45 = arg2.g1();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
				int var46 = var34 * 128 + 64;
				int var47 = var35 * 128 + 64;
				int var48 = var36 * 128 + 64;
				int var49 = var37 * 128 + 64;
				ProjectileEntity var50 = new ProjectileEntity(var46, var39, var44, var41, this.currentLevel, var47, this.getHeightmapY(var47, this.currentLevel, var46) - var40, var45, loopCycle + var42, var38, loopCycle + var43);
				var50.updateVelocity(var49, this.getHeightmapY(var49, this.currentLevel, var48) - var41, var48, loopCycle + var42);
				this.projectiles.addTail(var50);
			}
		} else if (arg1 == 198) {
			int var51 = arg2.g1();
			int var52 = (var51 >> 4 & 0x7) + this.field1337;
			int var53 = (var51 & 0x7) + this.field1338;
			int var54 = arg2.g2();
			int var55 = arg2.g1();
			int var56 = arg2.g2();
			if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
				int var57 = var52 * 128 + 64;
				int var58 = var53 * 128 + 64;
				SpotAnimEntity var59 = new SpotAnimEntity(var58, var57, this.currentLevel, var54, this.getHeightmapY(var58, this.currentLevel, var57) - var55, loopCycle, var56);
				this.spotanims.addTail(var59);
			}
		} else if (arg1 == 69) {
			int var60 = arg2.g1();
			int var61 = (var60 >> 4 & 0x7) + this.field1337;
			int var62 = (var60 & 0x7) + this.field1338;
			int var63 = arg2.g2();
			int var64 = arg2.g2();
			int var65 = arg2.g2();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1397 != var65) {
				ObjStackEntity var66 = new ObjStackEntity();
				var66.field500 = var63;
				var66.field501 = var64;
				if (this.field1432[this.currentLevel][var61][var62] == null) {
					this.field1432[this.currentLevel][var61][var62] = new LinkList();
				}
				this.field1432[this.currentLevel][var61][var62].addTail(var66);
				this.sortObjStacks(var61, var62);
			}
		} else {
			if (arg1 == 29) {
				int var67 = arg2.g1();
				int var68 = (var67 >> 4 & 0x7) + this.field1337;
				int var69 = (var67 & 0x7) + this.field1338;
				int var70 = arg2.g1();
				int var71 = var70 >> 2;
				int var72 = var70 & 0x3;
				int var73 = this.field1305[var71];
				int var74 = arg2.g2();
				int var75 = arg2.g2();
				int var76 = arg2.g2();
				int var77 = arg2.g2();
				byte var78 = arg2.g1b();
				byte var79 = arg2.g1b();
				byte var80 = arg2.g1b();
				byte var81 = arg2.g1b();
				PlayerEntity var82;
				if (this.field1397 == var77) {
					var82 = localPlayer;
				} else {
					var82 = this.players[var77];
				}
				if (var82 != null) {
					LocType var83 = LocType.get(var74);
					int var84 = this.levelHeightmap[this.currentLevel][var68][var69];
					int var85 = this.levelHeightmap[this.currentLevel][var68 + 1][var69];
					int var86 = this.levelHeightmap[this.currentLevel][var68 + 1][var69 + 1];
					int var87 = this.levelHeightmap[this.currentLevel][var68][var69 + 1];
					Model var88 = var83.getModel(var71, var72, var84, var85, var86, var87, -1);
					if (var88 != null) {
						this.appendLoc(var68, 0, var76 + 1, -1, 0, var73, var69, this.currentLevel, var75 + 1);
						var82.locStartCycle = loopCycle + var75;
						var82.locStopCycle = loopCycle + var76;
						var82.locModel = var88;
						int var89 = var83.width;
						int var90 = var83.length;
						if (var72 == 1 || var72 == 3) {
							var89 = var83.length;
							var90 = var83.width;
						}
						var82.locOffsetX = var68 * 128 + var89 * 64;
						var82.locOffsetZ = var69 * 128 + var90 * 64;
						var82.locOffsetY = this.getHeightmapY(var82.locOffsetZ, this.currentLevel, var82.locOffsetX);
						if (var78 > var80) {
							byte var91 = var78;
							var78 = var80;
							var80 = var91;
						}
						if (var79 > var81) {
							byte var92 = var79;
							var79 = var81;
							var81 = var92;
						}
						var82.minTileX = var68 + var78;
						var82.maxTileX = var68 + var80;
						var82.minTileZ = var69 + var79;
						var82.maxTileZ = var69 + var81;
					}
				}
			}
			if (arg1 == 209) {
				int var93 = arg2.g1();
				int var94 = (var93 >> 4 & 0x7) + this.field1337;
				int var95 = (var93 & 0x7) + this.field1338;
				int var96 = arg2.g2();
				int var97 = arg2.g2();
				int var98 = arg2.g2();
				if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
					LinkList var99 = this.field1432[this.currentLevel][var94][var95];
					if (var99 != null) {
						for (ObjStackEntity var100 = (ObjStackEntity) var99.head(); var100 != null; var100 = (ObjStackEntity) var99.next()) {
							if ((var96 & 0x7FFF) == var100.field500 && var100.field501 == var97) {
								var100.field501 = var98;
								break;
							}
						}
						this.sortObjStacks(var94, var95);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void getNpcPosOldVis(Packet arg0, int arg2) {
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
			NpcEntity var8 = this.npcs[var7];
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
					var8.move(var11, false);
					int var12 = arg0.gBit(1);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg0.gBit(3);
					var8.move(var13, true);
					int var14 = arg0.gBit(3);
					var8.move(var14, true);
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

	@ObfuscatedName("client.t(I)V")
	public final void pushPlayers() {
		if (localPlayer.x >> 7 == this.flagSceneTileX && localPlayer.z >> 7 == this.flagSceneTileZ) {
			this.flagSceneTileX = 0;
		}
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			PlayerEntity var3;
			int var4;
			if (var2 == -1) {
				var3 = localPlayer;
				var4 = this.LOCAL_PLAYER_INDEX << 14;
			} else {
				var3 = this.players[this.playerIds[var2]];
				var4 = this.playerIds[var2] << 14;
			}
			if (var3 != null && var3.isVisible()) {
				var3.lowMemory = false;
				if ((lowMemory && this.playerCount > 50 || this.playerCount > 200) && var2 != -1 && var3.secondarySeqId == var3.seqStandId) {
					var3.lowMemory = true;
				}
				int var5 = var3.x >> 7;
				int var6 = var3.z >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.locModel == null || loopCycle < var3.locStartCycle || loopCycle >= var3.locStopCycle) {
						if ((var3.x & 0x7F) == 64 && (var3.z & 0x7F) == 64) {
							if (this.tileLastOccupiedCycle[var5][var6] == this.sceneCycle && var2 != -1) {
								continue;
							}
							this.tileLastOccupiedCycle[var5][var6] = this.sceneCycle;
						}
						var3.y = this.getHeightmapY(var3.z, this.currentLevel, var3.x);
						this.scene.addTemporary(60, var3.needsForwardDrawPadding, var3.y, var3.yaw, var3.z, var3, var3.x, var4, this.currentLevel);
					} else {
						var3.lowMemory = false;
						var3.y = this.getHeightmapY(var3.z, this.currentLevel, var3.x);
						this.scene.addTemporary(this.currentLevel, var3, var3.z, var3.maxTileX, var3.maxTileZ, var3.y, var3.yaw, var3.x, var3.minTileX, 60, var4, var3.minTileZ);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = this.menuAction[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 406;
	}

	@ObfuscatedName("client.h(B)V")
	public static final void setHighMemory() {
		World3D.lowMemory = false;
		Pix3D.lowMemory = false;
		lowMemory = false;
		World.lowMemory = false;
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean updateInterfaceAnimation(int arg0, int arg2) {
		boolean var4 = false;
		Component var5 = Component.types[arg2];
		for (int var6 = 0; var6 < var5.children.length && var5.children[var6] != -1; var6++) {
			Component var7 = Component.types[var5.children[var6]];
			if (var7.type == 1) {
				var4 |= this.updateInterfaceAnimation(arg0, var7.id);
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
					var7.seqCycle += arg0;
					while (var7.seqCycle > var10.getFrameDuration(var7.seqFrame)) {
						var7.seqCycle -= var10.getFrameDuration(var7.seqFrame) + 1;
						var7.seqFrame++;
						if (var7.seqFrame >= var10.frameCount) {
							var7.seqFrame -= var10.replayoff;
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

	@ObfuscatedName("client.u(I)V")
	public final void updatePlayers() {
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var4;
			if (var2 == -1) {
				var4 = this.LOCAL_PLAYER_INDEX;
			} else {
				var4 = this.playerIds[var2];
			}
			PlayerEntity var5 = this.players[var4];
			if (var5 != null) {
				this.updateEntity(var5, 1);
			}
		}
		field1610++;
		if (field1610 <= 1406) {
			return;
		}
		field1610 = 0;
		this.out.pIsaac(215);
		this.out.p1(0);
		int var3 = this.out.pos;
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
		this.out.psize1(this.out.pos - var3);
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void orbitCamera(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 2048 - arg1 & 0x7FF;
		int var10 = 0;
		int var11 = 0;
		int var12 = arg5;
		if (var8 != 0) {
			int var13 = Model.sinTable[var8];
			int var14 = Model.cosTable[var8];
			int var15 = var11 * var14 - arg5 * var13 >> 16;
			var12 = var11 * var13 + arg5 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.sinTable[var9];
			int var17 = Model.cosTable[var9];
			int var18 = var10 * var17 + var12 * var16 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		this.cameraX = arg6 - var10;
		this.cameraY = arg2 - var11;
		this.cameraZ = arg4 - var12;
		this.cameraPitch = arg3;
		this.cameraYaw = arg1;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void drawProgress(int arg1, String arg2) {
		this.lastProgressPercent = arg1;
		this.lastProgressMessage = arg2;
		this.loadTitle();
		if (this.jagTitle == null) {
			super.drawProgress(arg1, arg2);
			return;
		}
		this.imageTitle4.bind();
		short var4 = 360;
		short var5 = 200;
		byte var6 = 20;
		this.fontBold12.drawStringCenter(var4 / 2, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
		int var7 = var5 / 2 - 18 - var6;
		Pix2D.drawRect(34, 304, 9179409, var4 / 2 - 152, var7);
		Pix2D.drawRect(32, 302, 0, var4 / 2 - 151, var7 + 1);
		Pix2D.fillRect(9179409, arg1 * 3, 30, var4 / 2 - 150, var7 + 2);
		Pix2D.fillRect(0, 300 - arg1 * 3, 30, arg1 * 3 + (var4 / 2 - 150), var7 + 2);
		this.fontBold12.drawStringCenter(var4 / 2, 16777215, arg2, var5 / 2 + 5 - var6);
		this.imageTitle4.draw(super.graphics, 171, 202);
		if (!this.redrawFrame) {
			return;
		}
		this.redrawFrame = false;
		if (!this.flameActive) {
			this.imageTitle0.draw(super.graphics, 0, 0);
			this.imageTitle1.draw(super.graphics, 0, 637);
		}
		this.imageTitle2.draw(super.graphics, 0, 128);
		this.imageTitle3.draw(super.graphics, 371, 202);
		this.imageTitle5.draw(super.graphics, 265, 0);
		this.imageTitle6.draw(super.graphics, 265, 562);
		this.imageTitle7.draw(super.graphics, 171, 128);
		this.imageTitle8.draw(super.graphics, 171, 562);
	}

	@ObfuscatedName("client.i(B)V")
	public final void drawChat() {
		this.areaChatback.bind();
		Pix3D.lineOffset = this.areaChatbackOffset;
		this.imageChatback.draw(0, 0);
		if (this.showSocialInput) {
			this.fontBold12.drawStringCenter(239, 0, this.socialMessage, 40);
			this.fontBold12.drawStringCenter(239, 128, this.socialInput + "*", 60);
		} else if (this.chatbackInputOpen) {
			this.fontBold12.drawStringCenter(239, 0, "Enter amount:", 40);
			this.fontBold12.drawStringCenter(239, 128, this.chatbackInput + "*", 60);
		} else if (this.modalMessage != null) {
			this.fontBold12.drawStringCenter(239, 0, this.modalMessage, 40);
			this.fontBold12.drawStringCenter(239, 128, "Click to continue", 60);
		} else if (this.chatInterfaceId != -1) {
			this.drawInterface(0, 0, Component.types[this.chatInterfaceId], 0);
		} else if (this.stickyChatInterfaceId == -1) {
			PixFont var2 = this.fontPlain12;
			int var3 = 0;
			Pix2D.setBounds(463, 77, 0, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.messageText[var4] != null) {
					int var6 = this.messageType[var4];
					int var7 = 70 - var3 * 14 + this.chatScrollOffset;
					String var8 = this.messageSender[var4];
					byte var9 = 0;
					if (var8 != null && var8.startsWith("@cr1@")) {
						var8 = var8.substring(5);
						var9 = 1;
					}
					if (var8 != null && var8.startsWith("@cr2@")) {
						var8 = var8.substring(5);
						var9 = 2;
					}
					if (var6 == 0) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(this.messageText[var4], 0, var7, 4);
						}
						var3++;
					}
					if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var8))) {
						if (var7 > 0 && var7 < 110) {
							int var10 = 4;
							if (var9 == 1) {
								this.imageModIcons[0].draw(var10, var7 - 12);
								var10 += 14;
							}
							if (var9 == 2) {
								this.imageModIcons[1].draw(var10, var7 - 12);
								var10 += 14;
							}
							var2.drawString(var8 + ":", 0, var7, var10);
							int var11 = var10 + var2.stringWidth(var8) + 8;
							var2.drawString(this.messageText[var4], 255, var7, var11);
						}
						var3++;
					}
					if ((var6 == 3 || var6 == 7) && this.splitPrivateChat == 0 && (var6 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var8))) {
						if (var7 > 0 && var7 < 110) {
							byte var12 = 4;
							var2.drawString("From", 0, var7, var12);
							int var13 = var12 + var2.stringWidth("From ");
							if (var9 == 1) {
								this.imageModIcons[0].draw(var13, var7 - 12);
								var13 += 14;
							}
							if (var9 == 2) {
								this.imageModIcons[1].draw(var13, var7 - 12);
								var13 += 14;
							}
							var2.drawString(var8 + ":", 0, var7, var13);
							int var14 = var13 + var2.stringWidth(var8) + 8;
							var2.drawString(this.messageText[var4], 8388608, var7, var14);
						}
						var3++;
					}
					if (var6 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var8))) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(var8 + " " + this.messageText[var4], 8388736, var7, 4);
						}
						var3++;
					}
					if (var6 == 5 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(this.messageText[var4], 8388608, var7, 4);
						}
						var3++;
					}
					if (var6 == 6 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString("To " + var8 + ":", 0, var7, 4);
							var2.drawString(this.messageText[var4], 8388608, var7, var2.stringWidth("To " + var8) + 12);
						}
						var3++;
					}
					if (var6 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var8))) {
						if (var7 > 0 && var7 < 110) {
							var2.drawString(var8 + " " + this.messageText[var4], 8270336, var7, 4);
						}
						var3++;
					}
				}
			}
			Pix2D.resetBounds();
			this.chatScrollHeight = var3 * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}
			this.drawScrollbar(463, this.chatScrollHeight, 0, this.chatScrollHeight - this.chatScrollOffset - 77, 77);
			String var5;
			if (localPlayer == null || localPlayer.name == null) {
				var5 = JString.formatName(this.username);
			} else {
				var5 = localPlayer.name;
			}
			var2.drawString(var5 + ":", 0, 90, 4);
			var2.drawString(this.chatTyped + "*", 255, 90, var2.stringWidth(var5 + ": ") + 6);
			Pix2D.drawHorizontalLine(0, 77, 479, 0);
		} else {
			this.drawInterface(0, 0, Component.types[this.stickyChatInterfaceId], 0);
		}
		if (this.menuVisible && this.menuArea == 2) {
			this.drawMenu();
		}
		this.areaChatback.draw(super.graphics, 357, 17);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.j(B)V")
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

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent() {
		if (signlink.mainapp == null) {
			return super.frame == null ? this : super.frame;
		} else {
			return signlink.mainapp;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void updateEntityChats() {
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var6;
			if (var2 == -1) {
				var6 = this.LOCAL_PLAYER_INDEX;
			} else {
				var6 = this.playerIds[var2];
			}
			PlayerEntity var7 = this.players[var6];
			if (var7 != null && var7.chatTimer > 0) {
				var7.chatTimer--;
				if (var7.chatTimer == 0) {
					var7.chatMessage = null;
				}
			}
		}
		for (int var3 = 0; var3 < this.npcCount; var3++) {
			int var4 = this.npcIds[var3];
			NpcEntity var5 = this.npcs[var4];
			if (var5 != null && var5.chatTimer > 0) {
				var5.chatTimer--;
				if (var5.chatTimer == 0) {
					var5.chatMessage = null;
				}
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void loadTitleImages() {
		this.imageTitlebox = new Pix8(this.jagTitle, "titlebox", 0);
		this.imageTitlebutton = new Pix8(this.jagTitle, "titlebutton", 0);
		this.imageRunes = new Pix8[12];
		for (int var2 = 0; var2 < 12; var2++) {
			this.imageRunes[var2] = new Pix8(this.jagTitle, "runes", var2);
		}
		this.imageFlamesRight = new Pix32(128, 265);
		this.levelObjStacks = new Pix32(128, 265);
		for (int var3 = 0; var3 < 33920; var3++) {
			this.imageFlamesRight.pixels[var3] = this.imageTitle0.data[var3];
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.levelObjStacks.pixels[var4] = this.imageTitle1.data[var4];
		}
		this.flameGradient0 = new int[256];
		for (int var5 = 0; var5 < 64; var5++) {
			this.flameGradient0[var5] = var5 * 262144;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			this.flameGradient0[var6 + 64] = var6 * 1024 + 16711680;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			this.flameGradient0[var7 + 128] = var7 * 4 + 16776960;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			this.flameGradient0[var8 + 192] = 16777215;
		}
		this.flameGradient1 = new int[256];
		for (int var9 = 0; var9 < 64; var9++) {
			this.flameGradient1[var9] = var9 * 1024;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			this.flameGradient1[var10 + 64] = var10 * 4 + 65280;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			this.flameGradient1[var11 + 128] = var11 * 262144 + 65535;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			this.flameGradient1[var12 + 192] = 16777215;
		}
		this.flameGradient2 = new int[256];
		for (int var13 = 0; var13 < 64; var13++) {
			this.flameGradient2[var13] = var13 * 4;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			this.flameGradient2[var14 + 64] = var14 * 262144 + 255;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			this.flameGradient2[var15 + 128] = var15 * 1024 + 16711935;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			this.flameGradient2[var16 + 192] = 16777215;
		}
		this.flameGradient = new int[256];
		this.flameBuffer0 = new int[32768];
		this.flameBuffer1 = new int[32768];
		this.updateFlameBuffer(null);
		this.flameBuffer2 = new int[32768];
		this.imageFlamesLeft = new int[32768];
		this.drawProgress(10, "Connecting to fileserver");
		if (!this.flameActive) {
			this.flamesThread = true;
			this.flameActive = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void handleMinimapInput() {
		if (super.mouseClickButton != 1) {
			return;
		}
		int var3 = super.mouseClickX - 25 - 550;
		int var4 = super.mouseClickY - 5 - 4;
		if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
			return;
		}
		var3 -= 73;
		var4 -= 75;
		int var5 = this.macroCameraOrbitYaw + this.macroMinimapAngle & 0x7FF;
		int var6 = Pix3D.sinTable[var5];
		int var7 = Pix3D.cosTable[var5];
		int var8 = (this.macroMinimapZoom + 256) * var6 >> 8;
		int var9 = (this.macroMinimapZoom + 256) * var7 >> 8;
		int var10 = var3 * var9 + var4 * var8 >> 11;
		int var11 = var4 * var9 - var3 * var8 >> 11;
		int var12 = localPlayer.x + var10 >> 7;
		int var13 = localPlayer.z - var11 >> 7;
		boolean var14 = this.tryMove(0, localPlayer.routeTileZ[0], 0, 1, true, 0, var12, 0, var13, 0, localPlayer.routeTileX[0]);
		if (!var14) {
			return;
		}
		this.out.p1(var3);
		this.out.p1(var4);
		this.out.p2(this.macroCameraOrbitYaw);
		this.out.p1(57);
		this.out.p1(this.macroMinimapAngle);
		this.out.p1(this.macroMinimapZoom);
		this.out.p1(89);
		this.out.p2(localPlayer.x);
		this.out.p2(localPlayer.z);
		this.out.p1(this.tryMoveNearest);
		this.out.p1(63);
		return;
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void getNpcPosExtended(Packet arg1, int arg2) {
		for (int var5 = 0; var5 < this.entityUpdateCount; var5++) {
			int var6 = this.entityUpdateIds[var5];
			NpcEntity var7 = this.npcs[var6];
			int var8 = arg1.g1();
			if ((var8 & 0x1) == 1) {
				int var9 = arg1.g1();
				int var10 = arg1.g1();
				var7.hit(var10, var9);
				var7.combatCycle = loopCycle + 300;
				var7.health = arg1.g1();
				var7.totalHealth = arg1.g1();
			}
			if ((var8 & 0x2) == 2) {
				int var11 = arg1.g2();
				if (var11 == 65535) {
					var11 = -1;
				}
				if (var7.primarySeqId == var11) {
					var7.primarySeqLoop = 0;
				}
				int var12 = arg1.g1();
				if (var7.primarySeqId == var11 && var11 != -1) {
					int var13 = SeqType.types[var11].replacemode;
					if (var13 == 1) {
						var7.primarySeqFrame = 0;
						var7.primarySeqCycle = 0;
						var7.primarySeqDelay = var12;
						var7.primarySeqLoop = 0;
					}
					if (var13 == 2) {
						var7.primarySeqLoop = 0;
					}
				} else if (var11 == -1 || var7.primarySeqId == -1 || SeqType.types[var11].priority >= SeqType.types[var7.primarySeqId].priority) {
					var7.primarySeqId = var11;
					var7.primarySeqFrame = 0;
					var7.primarySeqCycle = 0;
					var7.primarySeqDelay = var12;
					var7.primarySeqLoop = 0;
					var7.seqPathLength = var7.pathLength;
				}
			}
			if ((var8 & 0x4) == 4) {
				var7.targetId = arg1.g2();
				if (var7.targetId == 65535) {
					var7.targetId = -1;
				}
			}
			if ((var8 & 0x8) == 8) {
				var7.chatMessage = arg1.gjstr();
				var7.chatTimer = 100;
			}
			if ((var8 & 0x10) == 16) {
				int var14 = arg1.g1();
				int var15 = arg1.g1();
				var7.hit(var15, var14);
				var7.combatCycle = loopCycle + 300;
				var7.health = arg1.g1();
				var7.totalHealth = arg1.g1();
			}
			if ((var8 & 0x20) == 32) {
				var7.type = NpcType.get(arg1.g2());
				var7.seqWalkId = var7.type.walkanim;
				var7.seqTurnAroundId = var7.type.walkanim_b;
				var7.seqTurnLeftId = var7.type.walkanim_r;
				var7.seqTurnRightId = var7.type.walkanim_l;
				var7.seqStandId = var7.type.readyanim;
			}
			if ((var8 & 0x40) == 64) {
				var7.spotanimId = arg1.g2();
				int var16 = arg1.g4();
				var7.spotanimHeight = var16 >> 16;
				var7.spotanimLastCycle = (var16 & 0xFFFF) + loopCycle;
				var7.spotanimFrame = 0;
				var7.spotanimCycle = 0;
				if (var7.spotanimLastCycle > loopCycle) {
					var7.spotanimFrame = -1;
				}
				if (var7.spotanimId == 65535) {
					var7.spotanimId = -1;
				}
			}
			if ((var8 & 0x80) == 128) {
				var7.targetTileX = arg1.g2();
				var7.targetTileZ = arg1.g2();
			}
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void getPlayerOldVis(int arg0, Packet arg1) {
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
			PlayerEntity var8 = this.players[var7];
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
					var8.move(var11, false);
					int var12 = arg1.gBit(1);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.playerIds[this.playerCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg1.gBit(3);
					var8.move(var13, true);
					int var14 = arg1.gBit(3);
					var8.move(var14, true);
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

	@ObfuscatedName("client.e(I)V")
	public final void refresh() {
		this.redrawFrame = true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void appendLoc(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) this.locChanges.head(); var12 != null; var12 = (LocChange) this.locChanges.next()) {
			if (var12.level == arg8 && var12.localX == arg0 && var12.localZ == arg7 && var12.layer == arg6) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.level = arg8;
			var11.layer = arg6;
			var11.localX = arg0;
			var11.localZ = arg7;
			this.storeLoc(var11);
			this.locChanges.addTail(var11);
		}
		var11.type = arg4;
		var11.shape = arg1;
		var11.angle = arg5;
		var11.delay = arg9;
		var11.duration = arg2;
	}

	@ObfuscatedName("client.z(I)V")
	public final void validateCharacterDesign() {
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

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean isFriend(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.friendCount; var3++) {
			if (arg0.equalsIgnoreCase(this.friendName[var3])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("client.A(I)V")
	public final void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void removeFriend(long arg0) {
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
				this.out.pIsaac(69);
				this.out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void applyCutscene() {
		int var2 = this.cutsceneSrcLocalTileX * 128 + 64;
		int var3 = this.cutsceneSrcLocalTileZ * 128 + 64;
		int var4 = this.getHeightmapY(var3, this.currentLevel, var2) - this.cutsceneSrcHeight;
		if (this.cameraX < var2) {
			this.cameraX += (var2 - this.cameraX) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX > var2) {
				this.cameraX = var2;
			}
		}
		if (this.cameraX > var2) {
			this.cameraX -= (this.cameraX - var2) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX < var2) {
				this.cameraX = var2;
			}
		}
		if (this.cameraY < var4) {
			this.cameraY += (var4 - this.cameraY) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY > var4) {
				this.cameraY = var4;
			}
		}
		if (this.cameraY > var4) {
			this.cameraY -= (this.cameraY - var4) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY < var4) {
				this.cameraY = var4;
			}
		}
		if (this.cameraZ < var3) {
			this.cameraZ += (var3 - this.cameraZ) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraZ > var3) {
				this.cameraZ = var3;
			}
		}
		if (this.cameraZ > var3) {
			this.cameraZ -= (this.cameraZ - var3) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraZ < var3) {
				this.cameraZ = var3;
			}
		}
		int var5 = this.cutsceneDstLocalTileX * 128 + 64;
		int var6 = this.cutsceneDstLocalTileZ * 128 + 64;
		int var7 = this.getHeightmapY(var6, this.currentLevel, var5) - this.cutsceneDstHeight;
		int var8 = var5 - this.cameraX;
		int var9 = var7 - this.cameraY;
		int var10 = var6 - this.cameraZ;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.cameraPitch < var12) {
			this.cameraPitch += (var12 - this.cameraPitch) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			if (this.cameraPitch > var12) {
				this.cameraPitch = var12;
			}
		}
		if (this.cameraPitch > var12) {
			this.cameraPitch -= (this.cameraPitch - var12) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			if (this.cameraPitch < var12) {
				this.cameraPitch = var12;
			}
		}
		int var14 = var13 - this.cameraYaw;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 > 0) {
			this.cameraYaw += this.cutsceneRotateAcceleration * var14 / 1000 + this.cutsceneRotateSpeed;
			this.cameraYaw &= 0x7FF;
		}
		if (var14 < 0) {
			this.cameraYaw -= -var14 * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			this.cameraYaw &= 0x7FF;
		}
		int var15 = var13 - this.cameraYaw;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
			this.cameraYaw = var13;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream openUrl(String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@ObfuscatedName("client.C(I)Ljava/net/Socket;")
	public final Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public final void handleInputKey() {
		while (true) {
			int var2;
			do {
				while (true) {
					var2 = this.pollKey();
					if (var2 == -1) {
						return;
					}
					if (this.viewportInterfaceId != -1 && this.viewportInterfaceId == this.reportAbuseInterfaceId) {
						if (var2 == 8 && this.reportAbuseInput.length() > 0) {
							this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
						}
						break;
					}
					if (this.showSocialInput) {
						if (var2 >= 32 && var2 <= 122 && this.socialInput.length() < 80) {
							this.socialInput = this.socialInput + (char) var2;
							this.redrawChatback = true;
						}
						if (var2 == 8 && this.socialInput.length() > 0) {
							this.socialInput = this.socialInput.substring(0, this.socialInput.length() - 1);
							this.redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							this.showSocialInput = false;
							this.redrawChatback = true;
							if (this.socialAction == 1) {
								long var3 = JString.toBase37(this.socialInput);
								this.addFriend(var3);
							}
							if (this.socialAction == 2 && this.friendCount > 0) {
								long var5 = JString.toBase37(this.socialInput);
								this.removeFriend(var5);
							}
							if (this.socialAction == 3 && this.socialInput.length() > 0) {
								this.out.pIsaac(170);
								this.out.p1(0);
								int var7 = this.out.pos;
								this.out.p8(this.socialName37);
								WordPack.pack(this.socialInput, this.out);
								this.out.psize1(this.out.pos - var7);
								this.socialInput = JString.toSentenceCase(this.socialInput);
								this.socialInput = WordFilter.filter(this.socialInput);
								this.addMessage(this.socialInput, JString.formatName(JString.fromBase37(this.socialName37)), 6);
								if (this.chatPrivateMode == 2) {
									this.chatPrivateMode = 1;
									this.redrawPrivacySettings = true;
									this.out.pIsaac(98);
									this.out.p1(this.chatPublicMode);
									this.out.p1(this.chatPrivateMode);
									this.out.p1(this.chatTradeMode);
								}
							}
							if (this.socialAction == 4 && this.ignoreCount < 100) {
								long var8 = JString.toBase37(this.socialInput);
								this.addIgnore(var8);
							}
							if (this.socialAction == 5 && this.ignoreCount > 0) {
								long var10 = JString.toBase37(this.socialInput);
								this.removeIgnore(var10);
							}
						}
					} else if (this.chatbackInputOpen) {
						if (var2 >= 48 && var2 <= 57 && this.chatbackInput.length() < 10) {
							this.chatbackInput = this.chatbackInput + (char) var2;
							this.redrawChatback = true;
						}
						if (var2 == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							if (this.chatbackInput.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(this.chatbackInput);
								} catch (Exception var17) {
								}
								this.out.pIsaac(190);
								this.out.p4(var12);
							}
							this.chatbackInputOpen = false;
							this.redrawChatback = true;
						}
					} else if (this.chatInterfaceId == -1) {
						if (var2 >= 32 && var2 <= 122 && this.chatTyped.length() < 80) {
							this.chatTyped = this.chatTyped + (char) var2;
							this.redrawChatback = true;
						}
						if (var2 == 8 && this.chatTyped.length() > 0) {
							this.chatTyped = this.chatTyped.substring(0, this.chatTyped.length() - 1);
							this.redrawChatback = true;
						}
						if ((var2 == 13 || var2 == 10) && this.chatTyped.length() > 0) {
							if (this.staffmodlevel == 2) {
								if (this.chatTyped.equals("::clientdrop")) {
									this.tryReconnect();
								}
								if (this.chatTyped.equals("::lag")) {
									this.lag();
								}
								if (this.chatTyped.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < this.onDemand.getFileCount(2); var13++) {
										this.onDemand.prefetch(2, var13, (byte) 1);
									}
								}
							}
							if (this.chatTyped.startsWith("::")) {
								this.out.pIsaac(76);
								this.out.p1(this.chatTyped.length() - 1);
								this.out.pjstr(this.chatTyped.substring(2));
							} else {
								byte var14 = 0;
								if (this.chatTyped.startsWith("yellow:")) {
									var14 = 0;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("red:")) {
									var14 = 1;
									this.chatTyped = this.chatTyped.substring(4);
								}
								if (this.chatTyped.startsWith("green:")) {
									var14 = 2;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("cyan:")) {
									var14 = 3;
									this.chatTyped = this.chatTyped.substring(5);
								}
								if (this.chatTyped.startsWith("purple:")) {
									var14 = 4;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("white:")) {
									var14 = 5;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("flash1:")) {
									var14 = 6;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("flash2:")) {
									var14 = 7;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("flash3:")) {
									var14 = 8;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("glow1:")) {
									var14 = 9;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("glow2:")) {
									var14 = 10;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("glow3:")) {
									var14 = 11;
									this.chatTyped = this.chatTyped.substring(6);
								}
								byte var15 = 0;
								if (this.chatTyped.startsWith("wave:")) {
									var15 = 1;
									this.chatTyped = this.chatTyped.substring(5);
								}
								if (this.chatTyped.startsWith("scroll:")) {
									var15 = 2;
									this.chatTyped = this.chatTyped.substring(7);
								}
								this.out.pIsaac(171);
								this.out.p1(0);
								int var16 = this.out.pos;
								this.out.p1(var14);
								this.out.p1(var15);
								WordPack.pack(this.chatTyped, this.out);
								this.out.psize1(this.out.pos - var16);
								this.chatTyped = JString.toSentenceCase(this.chatTyped);
								this.chatTyped = WordFilter.filter(this.chatTyped);
								localPlayer.chatMessage = this.chatTyped;
								localPlayer.chatColour = var14;
								localPlayer.chatEffect = var15;
								localPlayer.chatTimer = 150;
								if (this.staffmodlevel == 2) {
									this.addMessage(localPlayer.chatMessage, "@cr2@" + localPlayer.name, 2);
								} else if (this.staffmodlevel == 1) {
									this.addMessage(localPlayer.chatMessage, "@cr1@" + localPlayer.name, 2);
								} else {
									this.addMessage(localPlayer.chatMessage, localPlayer.name, 2);
								}
								if (this.chatPublicMode == 2) {
									this.chatPublicMode = 3;
									this.redrawPrivacySettings = true;
									this.out.pIsaac(98);
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
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
			if (this.reportAbuseInput.length() < 12) {
				this.reportAbuseInput = this.reportAbuseInput + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void drawTileHint() {
		if (this.hintType == 2) {
			this.projectFromGround((this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ, this.hintHeight * 2, (this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX);
			if (this.projectX > -1 && loopCycle % 20 < 10) {
				this.imageHeadicon[2].draw(this.projectX - 12, this.projectY - 28);
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void updateVarp(int arg0) {
		int var3 = VarpType.types[arg0].clientcode;
		if (var3 == 0) {
			return;
		}
		int var4 = this.varps[arg0];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.setBrightness(0.9D);
			}
			if (var4 == 2) {
				Pix3D.setBrightness(0.8D);
			}
			if (var4 == 3) {
				Pix3D.setBrightness(0.7D);
			}
			if (var4 == 4) {
				Pix3D.setBrightness(0.6D);
			}
			ObjType.iconCache.clear();
			this.redrawFrame = true;
		}
		if (var3 == 3) {
			boolean var5 = this.midiActive;
			if (var4 == 0) {
				this.setMidiVolume(0, this.midiActive);
				this.midiActive = true;
			}
			if (var4 == 1) {
				this.setMidiVolume(-400, this.midiActive);
				this.midiActive = true;
			}
			if (var4 == 2) {
				this.setMidiVolume(-800, this.midiActive);
				this.midiActive = true;
			}
			if (var4 == 3) {
				this.setMidiVolume(-1200, this.midiActive);
				this.midiActive = true;
			}
			if (var4 == 4) {
				this.midiActive = false;
			}
			if (this.midiActive != var5 && !lowMemory) {
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
		if (var3 == 4) {
			if (var4 == 0) {
				this.waveEnabled = true;
				this.setWaveVolume(0);
			}
			if (var4 == 1) {
				this.waveEnabled = true;
				this.setWaveVolume(-400);
			}
			if (var4 == 2) {
				this.waveEnabled = true;
				this.setWaveVolume(-800);
			}
			if (var4 == 3) {
				this.waveEnabled = true;
				this.setWaveVolume(-1200);
			}
			if (var4 == 4) {
				this.waveEnabled = false;
			}
		}
		if (var3 == 5) {
			this.oneMouseButton = var4;
		}
		if (var3 == 6) {
			this.chatEffects = var4;
		}
		if (var3 == 8) {
			this.splitPrivateChat = var4;
			this.redrawChatback = true;
		}
		if (var3 == 9) {
			this.bankArrangeMode = var4;
		}
	}

	@ObfuscatedName("client.a(IIIILgc;)V")
	public final void addNpcOptions(int arg0, int arg1, int arg2, NpcType arg4) {
		if (this.menuSize >= 400) {
			return;
		}
		String var6 = arg4.name;
		if (arg4.vislevel != 0) {
			var6 = var6 + getCombatLevelTag(arg4.vislevel, localPlayer.combatLevel) + " (level-" + arg4.vislevel + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + var6;
			this.menuAction[this.menuSize] = 900;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg0;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			if (arg4.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg4.op[var7] != null && !arg4.op[var7].equalsIgnoreCase("attack")) {
						this.menuOption[this.menuSize] = arg4.op[var7] + " @yel@" + var6;
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
						this.menuParamB[this.menuSize] = arg1;
						this.menuParamC[this.menuSize] = arg0;
						this.menuSize++;
					}
				}
			}
			if (arg4.op != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg4.op[var8] != null && arg4.op[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg4.vislevel > localPlayer.combatLevel) {
							var9 = 2000;
						}
						this.menuOption[this.menuSize] = arg4.op[var8] + " @yel@" + var6;
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
						this.menuParamB[this.menuSize] = arg1;
						this.menuParamC[this.menuSize] = arg0;
						this.menuSize++;
					}
				}
			}
			this.menuOption[this.menuSize] = "Examine @yel@" + var6;
			this.menuAction[this.menuSize] = 1607;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg0;
			this.menuSize++;
		} else if ((this.activeSpellFlags & 0x2) == 2) {
			this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + var6;
			this.menuAction[this.menuSize] = 265;
			this.menuParamA[this.menuSize] = arg2;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg0;
			this.menuSize++;
			return;
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void useMenuOption(int arg0, int arg1) {
		if (arg0 < 0) {
			return;
		}
		if (this.chatbackInputOpen) {
			this.chatbackInputOpen = false;
			this.redrawChatback = true;
		}
		int var3 = this.menuParamB[arg0];
		int var4 = this.menuParamC[arg0];
		int var5 = this.menuAction[arg0];
		int var6 = this.menuParamA[arg0];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 1501) {
			field1542 += this.sceneBaseTileZ;
			if (field1542 >= 92) {
				this.out.pIsaac(177);
				this.out.p4(0);
			}
			this.interactWithLoc(243, var3, var6, var4);
		}
		if (var5 == 34) {
			String var7 = this.menuOption[arg0];
			int var8 = var7.indexOf("@whi@");
			if (var8 != -1) {
				this.closeInterfaces();
				this.reportAbuseInput = var7.substring(var8 + 5).trim();
				this.reportAbuseMuteOption = false;
				for (int var9 = 0; var9 < Component.types.length; var9++) {
					if (Component.types[var9] != null && Component.types[var9].clientCode == 600) {
						this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.types[var9].layer;
						break;
					}
				}
			}
		}
		if (var5 == 367) {
			PlayerEntity var10 = this.players[var6];
			if (var10 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var10.routeTileX[0], 0, var10.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.pIsaac(48);
				this.out.p2(var6);
				this.out.p2(this.field1500);
				this.out.p2(this.field1498);
				this.out.p2(this.field1499);
			}
		}
		if (var5 == 951) {
			Component var11 = Component.types[var4];
			boolean var12 = true;
			if (var11.clientCode > 0) {
				var12 = this.handleInterfaceAction(var11);
			}
			if (var12) {
				this.out.pIsaac(39);
				this.out.p2(var4);
			}
		}
		if (var5 == 217) {
			boolean var13 = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var13) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.pIsaac(111);
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2(var6);
			this.out.p2(this.field1500);
			this.out.p2(this.field1498);
			this.out.p2(this.field1499);
		}
		if (var5 == 450 && this.interactWithLoc(106, var3, var6, var4)) {
			this.out.p2(this.field1500);
			this.out.p2(this.field1498);
			this.out.p2(this.field1499);
		}
		if (var5 == 265) {
			NpcEntity var15 = this.npcs[var6];
			if (var15 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var15.routeTileX[0], 0, var15.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.pIsaac(101);
				this.out.p2(var6);
				this.out.p2(this.field1308);
			}
		}
		if (var5 == 364) {
			this.interactWithLoc(19, var3, var6, var4);
		}
		if (var5 == 55 && this.interactWithLoc(182, var3, var6, var4)) {
			this.out.p2(this.field1308);
		}
		if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
			boolean var16 = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var16) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			if (var5 == 99) {
				this.out.pIsaac(27);
			}
			if (var5 == 993) {
				this.out.pIsaac(110);
			}
			if (var5 == 224) {
				this.out.pIsaac(231);
			}
			if (var5 == 877) {
				this.out.pIsaac(225);
			}
			if (var5 == 746) {
				this.out.pIsaac(17);
			}
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2(var6);
		}
		if (var5 == 581) {
			if ((var6 & 0x3) == 0) {
				field1506++;
			}
			if (field1506 >= 99) {
				this.out.pIsaac(47);
				this.out.p4(0);
			}
			this.interactWithLoc(55, var3, var6, var4);
		}
		if (var5 == 679) {
			String var18 = this.menuOption[arg0];
			int var19 = var18.indexOf("@whi@");
			if (var19 != -1) {
				long var20 = JString.toBase37(var18.substring(var19 + 5).trim());
				int var22 = -1;
				for (int var23 = 0; var23 < this.friendCount; var23++) {
					if (this.friendName37[var23] == var20) {
						var22 = var23;
						break;
					}
				}
				if (var22 != -1 && this.friendWorld[var22] > 0) {
					this.redrawChatback = true;
					this.chatbackInputOpen = false;
					this.showSocialInput = true;
					this.socialInput = "";
					this.socialAction = 3;
					this.socialName37 = this.friendName37[var22];
					this.socialMessage = "Enter message to send to " + this.friendName[var22];
				}
			}
		}
		if (var5 == 960) {
			this.out.pIsaac(39);
			this.out.p2(var4);
			Component var24 = Component.types[var4];
			if (var24.scripts != null && var24.scripts[0][0] == 5) {
				int var25 = var24.scripts[0][1];
				if (this.varps[var25] != var24.scriptOperand[0]) {
					this.varps[var25] = var24.scriptOperand[0];
					this.updateVarp(var25);
					this.redrawSidebar = true;
				}
			}
		}
		if (var5 == 1175) {
			int var26 = var6 >> 14 & 0x7FFF;
			LocType var27 = LocType.get(var26);
			String var28;
			if (var27.desc == null) {
				var28 = "It's a " + var27.name + ".";
			} else {
				var28 = new String(var27.desc);
			}
			this.addMessage(var28, "", 0);
		}
		if (var5 == 881) {
			this.out.pIsaac(58);
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.out.p2(this.field1500);
			this.out.p2(this.field1498);
			this.out.p2(this.field1499);
			this.selectedCycle = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 44 && !this.pressedContinueOption) {
			this.out.pIsaac(11);
			this.out.p2(var4);
			this.pressedContinueOption = true;
		}
		if (var5 == 285) {
			this.interactWithLoc(238, var3, var6, var4);
		}
		if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
			String var29 = this.menuOption[arg0];
			int var30 = var29.indexOf("@whi@");
			if (var30 != -1) {
				long var31 = JString.toBase37(var29.substring(var30 + 5).trim());
				if (var5 == 406) {
					this.addFriend(var31);
				}
				if (var5 == 436) {
					this.addIgnore(var31);
				}
				if (var5 == 557) {
					this.removeFriend(var31);
				}
				if (var5 == 556) {
					this.removeIgnore(var31);
				}
			}
		}
		if (var5 == 947) {
			this.closeInterfaces();
		}
		if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
			if (var5 == 347) {
				this.out.pIsaac(133);
			}
			if (var5 == 422) {
				this.out.pIsaac(221);
			}
			if (var5 == 478) {
				if ((var3 & 0x3) == 0) {
					field1219++;
				}
				if (field1219 >= 90) {
					this.out.pIsaac(7);
				}
				this.out.pIsaac(6);
			}
			if (var5 == 405) {
				field1606 += var6;
				if (field1606 >= 97) {
					this.out.pIsaac(37);
					this.out.p3(14953816);
				}
				this.out.pIsaac(228);
			}
			if (var5 == 38) {
				this.out.pIsaac(166);
			}
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 965) {
			boolean var33 = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var33) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			this.out.pIsaac(25);
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2(var6);
			this.out.p2(this.field1308);
		}
		if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
			if (var5 == 415) {
				if ((var4 & 0x3) == 0) {
					field1622++;
				}
				if (field1622 >= 55) {
					this.out.pIsaac(50);
					this.out.p4(0);
				}
				this.out.pIsaac(212);
			}
			if (var5 == 22) {
				this.out.pIsaac(158);
			}
			if (var5 == 596) {
				this.out.pIsaac(193);
			}
			if (var5 == 892) {
				if ((var3 & 0x3) == 0) {
					field1558++;
				}
				if (field1558 >= 130) {
					this.out.pIsaac(169);
					this.out.p1(177);
				}
				this.out.pIsaac(204);
			}
			if (var5 == 602) {
				this.out.pIsaac(153);
			}
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 465) {
			this.out.pIsaac(39);
			this.out.p2(var4);
			Component var35 = Component.types[var4];
			if (var35.scripts != null && var35.scripts[0][0] == 5) {
				int var36 = var35.scripts[0][1];
				this.varps[var36] = 1 - this.varps[var36];
				this.updateVarp(var36);
				this.redrawSidebar = true;
			}
		}
		if (var5 == 900) {
			NpcEntity var37 = this.npcs[var6];
			if (var37 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var37.routeTileX[0], 0, var37.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.pIsaac(52);
				this.out.p2(var6);
				this.out.p2(this.field1500);
				this.out.p2(this.field1498);
				this.out.p2(this.field1499);
			}
		}
		if (var5 == 188) {
			this.objSelected = 1;
			this.field1498 = var3;
			this.field1499 = var4;
			this.field1500 = var6;
			this.objSelectedName = ObjType.get(var6).name;
			this.spellSelected = 0;
			this.redrawSidebar = true;
			return;
		}
		if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
			NpcEntity var38 = this.npcs[var6];
			if (var38 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var38.routeTileX[0], 0, var38.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				if (var5 == 963) {
					this.out.pIsaac(229);
				}
				if (var5 == 6) {
					if ((var6 & 0x3) == 0) {
						field1612++;
					}
					if (field1612 >= 124) {
						this.out.pIsaac(218);
						this.out.p4(0);
					}
					this.out.pIsaac(132);
				}
				if (var5 == 245) {
					if ((var6 & 0x3) == 0) {
						field1553++;
					}
					if (field1553 >= 85) {
						this.out.pIsaac(34);
						this.out.p2(39596);
					}
					this.out.pIsaac(102);
				}
				if (var5 == 728) {
					this.out.pIsaac(222);
				}
				if (var5 == 542) {
					this.out.pIsaac(84);
				}
				this.out.p2(var6);
			}
		}
		if (var5 == 391) {
			this.out.pIsaac(143);
			this.out.p2(var6);
			this.out.p2(var3);
			this.out.p2(var4);
			this.out.p2(this.field1308);
			this.selectedCycle = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.selectedArea = 2;
			if (Component.types[var4].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.types[var4].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 930) {
			Component var39 = Component.types[var4];
			this.spellSelected = 1;
			this.field1308 = var4;
			this.activeSpellFlags = var39.targetMask;
			this.objSelected = 0;
			this.redrawSidebar = true;
			String var40 = var39.targetVerb;
			if (var40.indexOf(" ") != -1) {
				var40 = var40.substring(0, var40.indexOf(" "));
			}
			String var41 = var39.targetVerb;
			if (var41.indexOf(" ") != -1) {
				var41 = var41.substring(var41.indexOf(" ") + 1);
			}
			this.spellCaption = var40 + " " + var39.targetText + " " + var41;
			if (this.activeSpellFlags == 16) {
				this.redrawSidebar = true;
				this.selectedTab = 3;
				this.redrawSideicons = true;
			}
			return;
		}
		if (var5 == 660) {
			if (this.menuVisible) {
				this.scene.click(var4 - 4, var3 - 4);
			} else {
				this.scene.click(super.mouseClickY - 4, super.mouseClickX - 4);
			}
		}
		if (var5 == 903 || var5 == 363) {
			String var42 = this.menuOption[arg0];
			int var43 = var42.indexOf("@whi@");
			if (var43 != -1) {
				String var44 = var42.substring(var43 + 5).trim();
				String var45 = JString.formatName(JString.fromBase37(JString.toBase37(var44)));
				boolean var46 = false;
				for (int var47 = 0; var47 < this.playerCount; var47++) {
					PlayerEntity var48 = this.players[this.playerIds[var47]];
					if (var48 != null && var48.name != null && var48.name.equalsIgnoreCase(var45)) {
						this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var48.routeTileX[0], 0, var48.routeTileZ[0], 1, localPlayer.routeTileX[0]);
						if (var5 == 903) {
							this.out.pIsaac(43);
						}
						if (var5 == 363) {
							this.out.pIsaac(211);
						}
						this.out.p2(this.playerIds[var47]);
						var46 = true;
						break;
					}
				}
				if (!var46) {
					this.addMessage("Unable to find " + var45, "", 0);
				}
			}
		}
		if (var5 == 1607) {
			NpcEntity var49 = this.npcs[var6];
			if (var49 != null) {
				String var50;
				if (var49.type.desc == null) {
					var50 = "It's a " + var49.type.name + ".";
				} else {
					var50 = new String(var49.type.desc);
				}
				this.addMessage(var50, "", 0);
			}
		}
		if (var5 == 651) {
			PlayerEntity var51 = this.players[var6];
			if (var51 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var51.routeTileX[0], 0, var51.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				this.out.pIsaac(73);
				this.out.p2(var6);
				this.out.p2(this.field1308);
			}
		}
		if (var5 == 1102) {
			ObjType var52 = ObjType.get(var6);
			String var53;
			if (var52.desc == null) {
				var53 = "It's a " + var52.name + ".";
			} else {
				var53 = new String(var52.desc);
			}
			this.addMessage(var53, "", 0);
		}
		if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
			PlayerEntity var54 = this.players[var6];
			if (var54 != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, var54.routeTileX[0], 0, var54.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				if (var5 == 1544) {
					this.out.pIsaac(64);
				}
				if (var5 == 1373) {
					this.out.pIsaac(43);
				}
				if (var5 == 151) {
					field1386++;
					if (field1386 >= 90) {
						this.out.pIsaac(100);
						this.out.p2(31114);
					}
					this.out.pIsaac(219);
				}
				if (var5 == 1101) {
					this.out.pIsaac(211);
				}
				this.out.p2(var6);
			}
		}
		if (var5 == 504) {
			this.interactWithLoc(38, var3, var6, var4);
		}
		if (var5 == 1773) {
			ObjType var55 = ObjType.get(var6);
			String var56;
			if (var4 >= 100000) {
				var56 = var4 + " x " + var55.name;
			} else if (var55.desc == null) {
				var56 = "It's a " + var55.name + ".";
			} else {
				var56 = new String(var55.desc);
			}
			this.addMessage(var56, "", 0);
		}
		this.objSelected = 0;
		this.spellSelected = 0;
		if (arg1 == 0) {
			this.redrawSidebar = true;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void clearLocChanges() {
		LocChange var2 = (LocChange) this.locChanges.head();
		while (var2 != null) {
			if (var2.duration == -1) {
				var2.delay = 0;
				this.storeLoc(var2);
			} else {
				var2.unlink();
			}
			var2 = (LocChange) this.locChanges.next();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void updateOrbitCamera() {
		try {
			int var3 = localPlayer.x + this.macroCameraOffsetX;
			int var4 = localPlayer.z + this.macroCameraOffsetY;
			if (this.field1475 - var3 < -500 || this.field1475 - var3 > 500 || this.field1476 - var4 < -500 || this.field1476 - var4 > 500) {
				this.field1475 = var3;
				this.field1476 = var4;
			}
			if (this.field1475 != var3) {
				this.field1475 += (var3 - this.field1475) / 16;
			}
			if (this.field1476 != var4) {
				this.field1476 += (var4 - this.field1476) / 16;
			}
			if (super.actionKey[1] == 1) {
				this.field1561 += (-24 - this.field1561) / 2;
			} else if (super.actionKey[2] == 1) {
				this.field1561 += (24 - this.field1561) / 2;
			} else {
				this.field1561 /= 2;
			}
			if (super.actionKey[3] == 1) {
				this.field1562 += (12 - this.field1562) / 2;
			} else if (super.actionKey[4] == 1) {
				this.field1562 += (-12 - this.field1562) / 2;
			} else {
				this.field1562 /= 2;
			}
			this.macroCameraOrbitYaw = this.field1561 / 2 + this.macroCameraOrbitYaw & 0x7FF;
			this.field1559 += this.field1562 / 2;
			if (this.field1559 < 128) {
				this.field1559 = 128;
			}
			if (this.field1559 > 383) {
				this.field1559 = 383;
			}
			int var5 = this.field1475 >> 7;
			int var6 = this.field1476 >> 7;
			int var7 = this.getHeightmapY(this.field1476, this.currentLevel, this.field1475);
			int var8 = 0;
			if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
				for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
					for (int var10 = var6 - 4; var10 <= var6 + 4; var10++) {
						int var11 = this.currentLevel;
						if (var11 < 3 && (this.levelTileFlags[1][var9][var10] & 0x2) == 2) {
							var11++;
						}
						int var12 = var7 - this.levelHeightmap[var11][var9][var10];
						if (var12 > var8) {
							var8 = var12;
						}
					}
				}
			}
			int var13 = var8 * 192;
			if (var13 > 98048) {
				var13 = 98048;
			}
			if (var13 < 32768) {
				var13 = 32768;
			}
			if (var13 > this.field1226) {
				this.field1226 += (var13 - this.field1226) / 24;
			} else if (var13 < this.field1226) {
				this.field1226 += (var13 - this.field1226) / 80;
			}
		} catch (Exception var14) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.field1475 + "," + this.field1476 + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZIIIIZIIIIII)Z")
	public final boolean tryMove(int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var35 = 0; var35 < var14; var35++) {
				this.bfsDirection[var15][var35] = 0;
				this.bfsCost[var15][var35] = 99999999;
			}
		}
		int var16 = arg11;
		int var17 = arg2;
		this.bfsDirection[arg11][arg2] = 99;
		this.bfsCost[arg11][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		this.bfsStepX[var18] = arg11;
		int var36 = var18 + 1;
		this.bfsStepZ[var18] = arg2;
		boolean var20 = false;
		int var21 = this.bfsStepX.length;
		int[][] var22 = this.levelCollisionMap[this.currentLevel].flags;
		while (var36 != var19) {
			var16 = this.bfsStepX[var19];
			var17 = this.bfsStepZ[var19];
			var19 = (var19 + 1) % var21;
			if (arg7 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && this.levelCollisionMap[this.currentLevel].testWall(arg7, arg8 - 1, arg9, var17, var16, arg6)) {
					var20 = true;
					break;
				}
				if (arg8 < 10 && this.levelCollisionMap[this.currentLevel].testWDecor(var17, var16, arg7, true, arg8 - 1, arg6, arg9)) {
					var20 = true;
					break;
				}
			}
			if (arg1 != 0 && arg10 != 0 && this.levelCollisionMap[this.currentLevel].testLoc(arg1, var16, arg7, arg9, arg3, var17, arg10)) {
				var20 = true;
				break;
			}
			int var34 = this.bfsCost[var16][var17] + 1;
			if (var16 > 0 && this.bfsDirection[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				this.bfsStepX[var36] = var16 - 1;
				this.bfsStepZ[var36] = var17;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 - 1][var17] = 2;
				this.bfsCost[var16 - 1][var17] = var34;
			}
			if (var16 < var13 - 1 && this.bfsDirection[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				this.bfsStepX[var36] = var16 + 1;
				this.bfsStepZ[var36] = var17;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 + 1][var17] = 8;
				this.bfsCost[var16 + 1][var17] = var34;
			}
			if (var17 > 0 && this.bfsDirection[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var16;
				this.bfsStepZ[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16][var17 - 1] = 1;
				this.bfsCost[var16][var17 - 1] = var34;
			}
			if (var17 < var14 - 1 && this.bfsDirection[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var16;
				this.bfsStepZ[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16][var17 + 1] = 4;
				this.bfsCost[var16][var17 + 1] = var34;
			}
			if (var16 > 0 && var17 > 0 && this.bfsDirection[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var16 - 1;
				this.bfsStepZ[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 - 1] = 3;
				this.bfsCost[var16 - 1][var17 - 1] = var34;
			}
			if (var16 < var13 - 1 && var17 > 0 && this.bfsDirection[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.bfsStepX[var36] = var16 + 1;
				this.bfsStepZ[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 - 1] = 9;
				this.bfsCost[var16 + 1][var17 - 1] = var34;
			}
			if (var16 > 0 && var17 < var14 - 1 && this.bfsDirection[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var16 - 1;
				this.bfsStepZ[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 + 1] = 6;
				this.bfsCost[var16 - 1][var17 + 1] = var34;
			}
			if (var16 < var13 - 1 && var17 < var14 - 1 && this.bfsDirection[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.bfsStepX[var36] = var16 + 1;
				this.bfsStepZ[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 + 1] = 12;
				this.bfsCost[var16 + 1][var17 + 1] = var34;
			}
		}
		this.tryMoveNearest = 0;
		if (!var20) {
			if (arg5) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg7 - var24; var25 <= arg7 + var24; var25++) {
						for (int var26 = arg9 - var24; var26 <= arg9 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.bfsCost[var25][var26] < var23) {
								var23 = this.bfsCost[var25][var26];
								var16 = var25;
								var17 = var26;
								this.tryMoveNearest = 1;
								var20 = true;
							}
						}
					}
					if (var20) {
						break;
					}
				}
			}
			if (!var20) {
				return false;
			}
		}
		byte var27 = 0;
		this.bfsStepX[var27] = var16;
		int var37 = var27 + 1;
		this.bfsStepZ[var27] = var17;
		int var28;
		int var29 = var28 = this.bfsDirection[var16][var17];
		while (arg11 != var16 || arg2 != var17) {
			if (var28 != var29) {
				var28 = var29;
				this.bfsStepX[var37] = var16;
				this.bfsStepZ[var37++] = var17;
			}
			if ((var29 & 0x2) != 0) {
				var16++;
			} else if ((var29 & 0x8) != 0) {
				var16--;
			}
			if ((var29 & 0x1) != 0) {
				var17++;
			} else if ((var29 & 0x4) != 0) {
				var17--;
			}
			var29 = this.bfsDirection[var16][var17];
		}
		if (var37 > 0) {
			int var30 = var37;
			if (var37 > 25) {
				var30 = 25;
			}
			var37--;
			int var31 = this.bfsStepX[var37];
			int var32 = this.bfsStepZ[var37];
			if (arg4 == 0) {
				this.out.pIsaac(63);
				this.out.p1(var30 + var30 + 3);
			}
			if (arg4 == 1) {
				this.out.pIsaac(56);
				this.out.p1(var30 + var30 + 3 + 14);
			}
			if (arg4 == 2) {
				this.out.pIsaac(167);
				this.out.p1(var30 + var30 + 3);
			}
			if (super.actionKey[5] == 1) {
				this.out.p1(1);
			} else {
				this.out.p1(0);
			}
			this.out.p2(this.sceneBaseTileX + var31);
			this.out.p2(this.sceneBaseTileZ + var32);
			this.flagSceneTileX = this.bfsStepX[0];
			this.flagSceneTileZ = this.bfsStepZ[0];
			for (int var33 = 1; var33 < var30; var33++) {
				var37--;
				this.out.p1(this.bfsStepX[var37] - var31);
				this.out.p1(this.bfsStepZ[var37] - var32);
			}
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean executeInterfaceScript(Component arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		} else {
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
	}

	@ObfuscatedName("client.G(I)V")
	public final void drawTitle() {
		this.loadTitle();
		this.imageTitle4.bind();
		this.imageTitlebox.draw(0, 0);
		short var2 = 360;
		short var3 = 200;
		if (this.titleScreenState == 0) {
			int var4 = var3 / 2 + 80;
			this.fontPlain11.drawStringTaggableCenter(var2 / 2, true, this.onDemand.message, var4, 7711145);
			int var5 = var3 / 2 - 20;
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "Welcome to RuneScape", var5, 16776960);
			int var16 = var5 + 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			this.imageTitlebutton.draw(var6 - 73, var7 - 20);
			this.fontBold12.drawStringTaggableCenter(var6, true, "New user", var7 + 5, 16777215);
			int var8 = var2 / 2 + 80;
			this.imageTitlebutton.draw(var8 - 73, var7 - 20);
			this.fontBold12.drawStringTaggableCenter(var8, true, "Existing User", var7 + 5, 16777215);
		}
		if (this.titleScreenState == 2) {
			int var9 = var3 / 2 - 40;
			if (this.loginMessage0.length() > 0) {
				this.fontBold12.drawStringTaggableCenter(var2 / 2, true, this.loginMessage0, var9 - 15, 16776960);
				this.fontBold12.drawStringTaggableCenter(var2 / 2, true, this.loginMessage1, var9, 16776960);
				var9 += 30;
			} else {
				this.fontBold12.drawStringTaggableCenter(var2 / 2, true, this.loginMessage1, var9 - 7, 16776960);
				var9 += 30;
			}
			this.fontBold12.drawStringTaggable(16777215, var2 / 2 - 90, true, var9, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			this.fontBold12.drawStringTaggable(16777215, var2 / 2 - 88, true, var9, "Password: " + JString.censor(this.password) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			int var10 = var2 / 2 - 80;
			int var11 = var3 / 2 + 50;
			this.imageTitlebutton.draw(var10 - 73, var11 - 20);
			this.fontBold12.drawStringTaggableCenter(var10, true, "Login", var11 + 5, 16777215);
			int var12 = var2 / 2 + 80;
			this.imageTitlebutton.draw(var12 - 73, var11 - 20);
			this.fontBold12.drawStringTaggableCenter(var12, true, "Cancel", var11 + 5, 16777215);
		}
		if (this.titleScreenState == 3) {
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "Create a free account", var3 / 2 - 60, 16776960);
			int var13 = var3 / 2 - 35;
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "To create a new account you need to", var13, 16777215);
			int var17 = var13 + 15;
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "go back to the main RuneScape webpage", var17, 16777215);
			int var18 = var17 + 15;
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "and choose the red 'create account'", var18, 16777215);
			int var19 = var18 + 15;
			this.fontBold12.drawStringTaggableCenter(var2 / 2, true, "button at the top right of that page.", var19, 16777215);
			int var20 = var19 + 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			this.imageTitlebutton.draw(var14 - 73, var15 - 20);
			this.fontBold12.drawStringTaggableCenter(var14, true, "Cancel", var15 + 5, 16777215);
		}
		this.imageTitle4.draw(super.graphics, 171, 202);
		if (!this.redrawFrame) {
			return;
		}
		this.redrawFrame = false;
		this.imageTitle2.draw(super.graphics, 0, 128);
		this.imageTitle3.draw(super.graphics, 371, 202);
		this.imageTitle5.draw(super.graphics, 265, 0);
		this.imageTitle6.draw(super.graphics, 265, 562);
		this.imageTitle7.draw(super.graphics, 171, 128);
		this.imageTitle8.draw(super.graphics, 171, 562);
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void getNpcPosNewVis(int arg0, Packet arg2) {
		while (arg2.bitPos + 21 < arg0 * 8) {
			int var4 = arg2.gBit(13);
			if (var4 == 8191) {
				break;
			}
			if (this.npcs[var4] == null) {
				this.npcs[var4] = new NpcEntity();
			}
			NpcEntity var5 = this.npcs[var4];
			this.npcIds[this.npcCount++] = var4;
			var5.cycle = loopCycle;
			var5.type = NpcType.get(arg2.gBit(11));
			var5.size = var5.type.size;
			var5.seqWalkId = var5.type.walkanim;
			var5.seqTurnAroundId = var5.type.walkanim_b;
			var5.seqTurnLeftId = var5.type.walkanim_r;
			var5.seqTurnRightId = var5.type.walkanim_l;
			var5.seqStandId = var5.type.readyanim;
			int var6 = arg2.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg2.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			var5.move(false, localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7);
			int var8 = arg2.gBit(1);
			if (var8 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var4;
			}
		}
		arg2.bytes();
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String getIntString(int arg0) {
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		} else {
			return "*";
		}
	}

	@ObfuscatedName("client.H(I)I")
	public final int getTopLevel() {
		int var2 = 3;
		if (this.cameraPitch < 310) {
			int var4 = this.cameraX >> 7;
			int var5 = this.cameraZ >> 7;
			int var6 = localPlayer.x >> 7;
			int var7 = localPlayer.z >> 7;
			if ((this.levelTileFlags[this.currentLevel][var4][var5] & 0x4) != 0) {
				var2 = this.currentLevel;
			}
			int var8;
			if (var6 > var4) {
				var8 = var6 - var4;
			} else {
				var8 = var4 - var6;
			}
			int var9;
			if (var7 > var5) {
				var9 = var7 - var5;
			} else {
				var9 = var5 - var7;
			}
			if (var8 > var9) {
				int var10 = var9 * 65536 / var8;
				int var11 = 32768;
				while (var4 != var6) {
					if (var4 < var6) {
						var4++;
					} else if (var4 > var6) {
						var4--;
					}
					if ((this.levelTileFlags[this.currentLevel][var4][var5] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var11 += var10;
					if (var11 >= 65536) {
						var11 -= 65536;
						if (var5 < var7) {
							var5++;
						} else if (var5 > var7) {
							var5--;
						}
						if ((this.levelTileFlags[this.currentLevel][var4][var5] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			} else {
				int var12 = var8 * 65536 / var9;
				int var13 = 32768;
				while (var5 != var7) {
					if (var5 < var7) {
						var5++;
					} else if (var5 > var7) {
						var5--;
					}
					if ((this.levelTileFlags[this.currentLevel][var4][var5] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var13 += var12;
					if (var13 >= 65536) {
						var13 -= 65536;
						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}
						if ((this.levelTileFlags[this.currentLevel][var4][var5] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			}
		}
		if ((this.levelTileFlags[this.currentLevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var2 = this.currentLevel;
		}
		return var2;
	}

	@ObfuscatedName("client.I(I)I")
	public final int getTopLevelCutscene() {
		int var2 = this.getHeightmapY(this.cameraZ, this.currentLevel, this.cameraX);
		return var2 - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0 ? 3 : this.currentLevel;
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void getPlayerExtended(int arg0, Packet arg1, int arg3, PlayerEntity arg4) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1.g1();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet(var7);
			arg1.gdata(var7, 0, var6);
			this.playerAppearanceBuffer[arg3] = var8;
			arg4.read(var8);
		}
		if ((arg0 & 0x2) == 2) {
			int var9 = arg1.g2();
			if (var9 == 65535) {
				var9 = -1;
			}
			if (arg4.primarySeqId == var9) {
				arg4.primarySeqLoop = 0;
			}
			int var10 = arg1.g1();
			if (arg4.primarySeqId == var9 && var9 != -1) {
				int var11 = SeqType.types[var9].replacemode;
				if (var11 == 1) {
					arg4.primarySeqFrame = 0;
					arg4.primarySeqCycle = 0;
					arg4.primarySeqDelay = var10;
					arg4.primarySeqLoop = 0;
				}
				if (var11 == 2) {
					arg4.primarySeqLoop = 0;
				}
			} else if (var9 == -1 || arg4.primarySeqId == -1 || SeqType.types[var9].priority >= SeqType.types[arg4.primarySeqId].priority) {
				arg4.primarySeqId = var9;
				arg4.primarySeqFrame = 0;
				arg4.primarySeqCycle = 0;
				arg4.primarySeqDelay = var10;
				arg4.primarySeqLoop = 0;
				arg4.seqPathLength = arg4.pathLength;
			}
		}
		if ((arg0 & 0x4) == 4) {
			arg4.targetId = arg1.g2();
			if (arg4.targetId == 65535) {
				arg4.targetId = -1;
			}
		}
		if ((arg0 & 0x8) == 8) {
			arg4.chatMessage = arg1.gjstr();
			arg4.chatColour = 0;
			arg4.chatEffect = 0;
			arg4.chatTimer = 150;
			this.addMessage(arg4.chatMessage, arg4.name, 2);
		}
		if ((arg0 & 0x10) == 16) {
			int var12 = arg1.g1();
			int var13 = arg1.g1();
			arg4.hit(var13, var12);
			arg4.combatCycle = loopCycle + 300;
			arg4.health = arg1.g1();
			arg4.totalHealth = arg1.g1();
		}
		if ((arg0 & 0x20) == 32) {
			arg4.targetTileX = arg1.g2();
			arg4.targetTileZ = arg1.g2();
		}
		if ((arg0 & 0x40) == 64) {
			int var14 = arg1.g2();
			int var15 = arg1.g1();
			int var16 = arg1.g1();
			int var17 = arg1.pos;
			if (arg4.name != null && arg4.visible) {
				long var18 = JString.toBase37(arg4.name);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < this.ignoreCount; var21++) {
						if (this.ignoreName37[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}
				if (!var20 && this.overrideChat == 0) {
					try {
						String var22 = WordPack.unpack(var16, arg1);
						String var23 = WordFilter.filter(var22);
						arg4.chatMessage = var23;
						arg4.chatColour = var14 >> 8;
						arg4.chatEffect = var14 & 0xFF;
						arg4.chatTimer = 150;
						if (var15 == 2 || var15 == 3) {
							this.addMessage(var23, "@cr2@" + arg4.name, 1);
						} else if (var15 == 1) {
							this.addMessage(var23, "@cr1@" + arg4.name, 1);
						} else {
							this.addMessage(var23, arg4.name, 2);
						}
					} catch (Exception var28) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg1.pos = var16 + var17;
		}
		if ((arg0 & 0x100) == 256) {
			arg4.spotanimId = arg1.g2();
			int var25 = arg1.g4();
			arg4.spotanimHeight = var25 >> 16;
			arg4.spotanimLastCycle = (var25 & 0xFFFF) + loopCycle;
			arg4.spotanimFrame = 0;
			arg4.spotanimCycle = 0;
			if (arg4.spotanimLastCycle > loopCycle) {
				arg4.spotanimFrame = -1;
			}
			if (arg4.spotanimId == 65535) {
				arg4.spotanimId = -1;
			}
		}
		if ((arg0 & 0x200) == 512) {
			arg4.forceMoveStartSceneTileX = arg1.g1();
			arg4.forceMoveStartSceneTileZ = arg1.g1();
			arg4.forceMoveEndSceneTileX = arg1.g1();
			arg4.forceMoveEndSceneTileZ = arg1.g1();
			arg4.forceMoveEndCycle = arg1.g2() + loopCycle;
			arg4.forceMoveStartCycle = arg1.g2() + loopCycle;
			arg4.forceMoveFaceDirection = arg1.g1();
			arg4.resetPath();
		}
		if ((arg0 & 0x400) != 1024) {
			return;
		}
		int var26 = arg1.g1();
		int var27 = arg1.g1();
		arg4.hit(var27, var26);
		arg4.combatCycle = loopCycle + 300;
		arg4.health = arg1.g1();
		arg4.totalHealth = arg1.g1();
	}

	@ObfuscatedName("client.a(IIIIILd;I)V")
	public final void handleInterfaceInput(int arg0, int arg1, int arg2, int arg4, Component arg5, int arg6) {
		if (arg5.type != 0 || arg5.children == null || arg5.hide || (arg0 < arg4 || arg2 < arg1 || arg0 > arg5.width + arg4 || arg2 > arg5.height + arg1)) {
			return;
		}
		int var8 = arg5.children.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg5.childX[var9] + arg4;
			int var11 = arg5.childY[var9] + arg1 - arg6;
			Component var12 = Component.types[arg5.children[var9]];
			int var13 = var12.x + var10;
			int var14 = var12.y + var11;
			if ((var12.overlayer >= 0 || var12.overColour != 0) && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
				if (var12.overlayer >= 0) {
					this.lastHoveredInterfaceId = var12.overlayer;
				} else {
					this.lastHoveredInterfaceId = var12.id;
				}
			}
			if (var12.type == 0) {
				this.handleInterfaceInput(arg0, var14, arg2, var13, var12, var12.scrollPosition);
				if (var12.scroll > var12.height) {
					this.handleScrollInput(var12, var14, true, arg2, var12.height, var12.scroll, arg0, var12.width + var13);
				}
			} else {
				if (var12.buttonType == 1 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
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
				if (var12.buttonType == 2 && this.spellSelected == 0 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
					String var16 = var12.targetVerb;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					this.menuOption[this.menuSize] = var16 + " @gre@" + var12.targetText;
					this.menuAction[this.menuSize] = 930;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 3 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
					this.menuOption[this.menuSize] = "Close";
					this.menuAction[this.menuSize] = 947;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 4 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 465;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 5 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 960;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.buttonType == 6 && !this.pressedContinueOption && arg0 >= var13 && arg2 >= var14 && arg0 < var12.width + var13 && arg2 < var12.height + var14) {
					this.menuOption[this.menuSize] = var12.option;
					this.menuAction[this.menuSize] = 44;
					this.menuParamC[this.menuSize] = var12.id;
					this.menuSize++;
				}
				if (var12.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.height; var18++) {
						for (int var19 = 0; var19 < var12.width; var19++) {
							int var20 = (var12.marginX + 32) * var19 + var13;
							int var21 = (var12.marginY + 32) * var18 + var14;
							if (var17 < 20) {
								var20 += var12.invSlotOffsetX[var17];
								var21 += var12.invSlotOffsetY[var17];
							}
							if (arg0 >= var20 && arg2 >= var21 && arg0 < var20 + 32 && arg2 < var21 + 32) {
								this.hoveredSlot = var17;
								this.hoveredSlotInterfaceId = var12.id;
								if (var12.invSlotObjId[var17] > 0) {
									ObjType var22 = ObjType.get(var12.invSlotObjId[var17] - 1);
									if (this.objSelected == 1 && var12.interactable) {
										if (this.field1499 != var12.id || this.field1498 != var17) {
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

	@ObfuscatedName("client.J(I)Z")
	public final boolean readPacket() {
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
				this.psize = Protocol.CLIENTPROT_LENGTH[this.ptype];
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
			if (this.ptype == 44) {
				this.lastAddress = this.in.g4();
				this.daysSinceLogin = this.in.g2();
				this.daysSinceRecoveriesChanged = this.in.g1();
				this.unreadMessageCount = this.in.g2();
				this.warnMembersInNonMembers = this.in.g1();
				if (this.lastAddress != 0 && this.viewportInterfaceId == -1) {
					signlink.dnslookup(JString.formatIPv4(this.lastAddress));
					this.closeInterfaces();
					short var3 = 650;
					if (this.daysSinceRecoveriesChanged != 201 || this.warnMembersInNonMembers == 1) {
						var3 = 655;
					}
					this.reportAbuseInput = "";
					this.reportAbuseMuteOption = false;
					for (int var4 = 0; var4 < Component.types.length; var4++) {
						if (Component.types[var4] != null && Component.types[var4].clientCode == var3) {
							this.viewportInterfaceId = Component.types[var4].layer;
							break;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 72) {
				this.redrawSidebar = true;
				int var5 = this.in.g2();
				Component var6 = Component.types[var5];
				int var7 = this.in.g1();
				for (int var8 = 0; var8 < var7; var8++) {
					var6.invSlotObjId[var8] = this.in.g2();
					int var9 = this.in.g1();
					if (var9 == 255) {
						var9 = this.in.g4();
					}
					var6.invSlotObjCount[var8] = var9;
				}
				for (int var10 = var7; var10 < var6.invSlotObjId.length; var10++) {
					var6.invSlotObjId[var10] = 0;
					var6.invSlotObjCount[var10] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 164) {
				int var11 = this.in.g2();
				int var12 = this.in.g2();
				int var13 = this.in.g2();
				ObjType var14 = ObjType.get(var12);
				Component.types[var11].modelType = 4;
				Component.types[var11].model = var12;
				Component.types[var11].xan = var14.xan2d;
				Component.types[var11].yan = var14.yan2d;
				Component.types[var11].zoom = var14.zoom2d * 100 / var13;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 207) {
				int var15 = this.in.g2();
				int var16 = this.in.g2();
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.viewportInterfaceId = var15;
				this.sidebarInterfaceId = var16;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 192) {
				this.field1264 = 255;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 70) {
				long var17 = this.in.g8();
				int var19 = this.in.g1();
				String var20 = JString.formatName(JString.fromBase37(var17));
				for (int var21 = 0; var21 < this.friendCount; var21++) {
					if (this.friendName37[var21] == var17) {
						if (this.friendWorld[var21] != var19) {
							this.friendWorld[var21] = var19;
							this.redrawSidebar = true;
							if (var19 > 0) {
								this.addMessage(var20 + " has logged in.", "", 5);
							}
							if (var19 == 0) {
								this.addMessage(var20 + " has logged out.", "", 5);
							}
						}
						var20 = null;
						break;
					}
				}
				if (var20 != null && this.friendCount < 200) {
					this.friendName37[this.friendCount] = var17;
					this.friendName[this.friendCount] = var20;
					this.friendWorld[this.friendCount] = var19;
					this.friendCount++;
					this.redrawSidebar = true;
				}
				boolean var22 = false;
				while (!var22) {
					var22 = true;
					for (int var23 = 0; var23 < this.friendCount - 1; var23++) {
						if (this.friendWorld[var23] != nodeId && this.friendWorld[var23 + 1] == nodeId || this.friendWorld[var23] == 0 && this.friendWorld[var23 + 1] != 0) {
							int var24 = this.friendWorld[var23];
							this.friendWorld[var23] = this.friendWorld[var23 + 1];
							this.friendWorld[var23 + 1] = var24;
							String var25 = this.friendName[var23];
							this.friendName[var23] = this.friendName[var23 + 1];
							this.friendName[var23 + 1] = var25;
							long var26 = this.friendName37[var23];
							this.friendName37[var23] = this.friendName37[var23 + 1];
							this.friendName37[var23 + 1] = var26;
							this.redrawSidebar = true;
							var22 = false;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 17) {
				this.logout();
				this.ptype = -1;
				return false;
			}
			if (this.ptype == 50) {
				int var28 = this.in.g1();
				int var29 = this.in.g1();
				int var30 = this.in.g1();
				int var31 = this.in.g1();
				this.field1352[var28] = true;
				this.field1279[var28] = var29;
				this.field1242[var28] = var30;
				this.field1237[var28] = var31;
				this.cameraModifierCycle[var28] = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 22) {
				InputTracking.setEnabled();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 160) {
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runweight = this.in.g2b();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 94) {
				this.field1337 = this.in.g1();
				this.field1338 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 78) {
				int var32 = this.in.g2();
				int var33 = this.in.g2();
				int var34 = var33 >> 10 & 0x1F;
				int var35 = var33 >> 5 & 0x1F;
				int var36 = var33 & 0x1F;
				Component.types[var32].colour = (var36 << 3) + (var34 << 19) + (var35 << 11);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 152) {
				this.showSocialInput = false;
				this.chatbackInputOpen = true;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 53) {
				this.cutscene = false;
				for (int var37 = 0; var37 < 5; var37++) {
					this.field1352[var37] = false;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 240) {
				int var38 = this.in.g2();
				if (var38 == 65535) {
					var38 = -1;
				}
				if (this.nextMidiSong != var38 && this.midiActive && !lowMemory) {
					this.midiSong = var38;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				}
				this.nextMidiSong = var38;
				this.nextMusicDelay = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 173) {
				int var39 = this.in.g2();
				int var40 = this.in.g2();
				if (this.midiActive && !lowMemory) {
					this.midiSong = var39;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
					this.nextMusicDelay = var40;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 158) {
				int var41 = this.in.g2b();
				this.viewportOverlayInterfaceId = var41;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 9) {
				this.chatPublicMode = this.in.g1();
				this.chatPrivateMode = this.in.g1();
				this.chatTradeMode = this.in.g1();
				this.redrawPrivacySettings = true;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 209 || this.ptype == 29 || this.ptype == 69 || this.ptype == 198 || this.ptype == 137 || this.ptype == 39 || this.ptype == 234 || this.ptype == 155 || this.ptype == 125 || this.ptype == 232) {
				this.readZonePacket(this.ptype, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 241) {
				int var42 = this.in.g2();
				int var43 = this.in.g2b();
				int var44 = this.in.g2b();
				Component var45 = Component.types[var42];
				var45.x = var43;
				var45.y = var44;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 226) {
				int var46 = this.in.g2();
				int var47 = this.in.g4();
				this.field1510[var46] = var47;
				if (this.varps[var46] != var47) {
					this.varps[var46] = var47;
					this.updateVarp(var46);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 210) {
				this.field1397 = this.in.g2();
				this.field1255 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 97) {
				this.inMultizone = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 85) {
				this.systemUpdateTimer = this.in.g2() * 30;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 245) {
				int var48 = this.in.g2();
				int var49 = this.in.g2();
				Component.types[var48].modelType = 1;
				Component.types[var48].model = var49;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 151) {
				int var50 = this.in.g2();
				int var51 = this.in.g1();
				int var52 = this.in.g2();
				if (this.waveEnabled && !lowMemory && this.waveCount < 50) {
					this.waveIds[this.waveCount] = var50;
					this.waveLoops[this.waveCount] = var51;
					this.waveDelay[this.waveCount] = Wave.delays[var50] + var52;
					this.waveCount++;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 87) {
				for (int var53 = 0; var53 < this.varps.length; var53++) {
					if (this.field1510[var53] != this.varps[var53]) {
						this.varps[var53] = this.field1510[var53];
						this.updateVarp(var53);
						this.redrawSidebar = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 165) {
				int var54 = this.in.g2();
				int var55 = this.in.g2();
				if (this.sceneCenterZoneX == var54 && this.sceneCenterZoneZ == var55 && this.sceneState == 2) {
					this.ptype = -1;
					return true;
				}
				this.sceneCenterZoneX = var54;
				this.sceneCenterZoneZ = var55;
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
				this.fontPlain12.drawStringCenter(257, 0, "Loading - please wait.", 151);
				this.fontPlain12.drawStringCenter(256, 16777215, "Loading - please wait.", 150);
				this.areaViewport.draw(super.graphics, 4, 4);
				int var56 = 0;
				for (int var57 = (this.sceneCenterZoneX - 6) / 8; var57 <= (this.sceneCenterZoneX + 6) / 8; var57++) {
					for (int var58 = (this.sceneCenterZoneZ - 6) / 8; var58 <= (this.sceneCenterZoneZ + 6) / 8; var58++) {
						var56++;
					}
				}
				this.sceneMapLandData = new byte[var56][];
				this.sceneMapLocData = new byte[var56][];
				this.sceneMapIndex = new int[var56];
				this.sceneMapLandFile = new int[var56];
				this.sceneMapLocFile = new int[var56];
				int var59 = 0;
				for (int var60 = (this.sceneCenterZoneX - 6) / 8; var60 <= (this.sceneCenterZoneX + 6) / 8; var60++) {
					for (int var61 = (this.sceneCenterZoneZ - 6) / 8; var61 <= (this.sceneCenterZoneZ + 6) / 8; var61++) {
						this.sceneMapIndex[var59] = (var60 << 8) + var61;
						if (this.withinTutorialIsland && (var61 == 49 || var61 == 149 || var61 == 147 || var60 == 50 || var60 == 49 && var61 == 47)) {
							this.sceneMapLandFile[var59] = -1;
							this.sceneMapLocFile[var59] = -1;
							var59++;
						} else {
							int var62 = this.sceneMapLandFile[var59] = this.onDemand.getMapFile(var61, var60, 0);
							if (var62 != -1) {
								this.onDemand.request(3, var62);
							}
							int var63 = this.sceneMapLocFile[var59] = this.onDemand.getMapFile(var61, var60, 1);
							if (var63 != -1) {
								this.onDemand.request(3, var63);
							}
							var59++;
						}
					}
				}
				int var64 = this.sceneBaseTileX - this.field1342;
				int var65 = this.sceneBaseTileZ - this.field1343;
				this.field1342 = this.sceneBaseTileX;
				this.field1343 = this.sceneBaseTileZ;
				for (int var66 = 0; var66 < 8192; var66++) {
					NpcEntity var67 = this.npcs[var66];
					if (var67 != null) {
						for (int var68 = 0; var68 < 10; var68++) {
							var67.routeTileX[var68] -= var64;
							var67.routeTileZ[var68] -= var65;
						}
						var67.x -= var64 * 128;
						var67.z -= var65 * 128;
					}
				}
				for (int var69 = 0; var69 < this.MAX_PLAYER_COUNT; var69++) {
					PlayerEntity var70 = this.players[var69];
					if (var70 != null) {
						for (int var71 = 0; var71 < 10; var71++) {
							var70.routeTileX[var71] -= var64;
							var70.routeTileZ[var71] -= var65;
						}
						var70.x -= var64 * 128;
						var70.z -= var65 * 128;
					}
				}
				this.awaitingSync = true;
				byte var72 = 0;
				byte var73 = 104;
				byte var74 = 1;
				if (var64 < 0) {
					var72 = 103;
					var73 = -1;
					var74 = -1;
				}
				byte var75 = 0;
				byte var76 = 104;
				byte var77 = 1;
				if (var65 < 0) {
					var75 = 103;
					var76 = -1;
					var77 = -1;
				}
				for (int var78 = var72; var78 != var73; var78 += var74) {
					for (int var79 = var75; var79 != var76; var79 += var77) {
						int var80 = var64 + var78;
						int var81 = var65 + var79;
						for (int var82 = 0; var82 < 4; var82++) {
							if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
								this.field1432[var82][var78][var79] = this.field1432[var82][var80][var81];
							} else {
								this.field1432[var82][var78][var79] = null;
							}
						}
					}
				}
				for (LocChange var83 = (LocChange) this.locChanges.head(); var83 != null; var83 = (LocChange) this.locChanges.next()) {
					var83.localX -= var64;
					var83.localZ -= var65;
					if (var83.localX < 0 || var83.localZ < 0 || var83.localX >= 104 || var83.localZ >= 104) {
						var83.unlink();
					}
				}
				if (this.flagSceneTileX != 0) {
					this.flagSceneTileX -= var64;
					this.flagSceneTileZ -= var65;
				}
				this.cutscene = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 214) {
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
			if (this.ptype == 219) {
				int var84 = this.in.g2();
				int var85 = this.in.g2();
				Component.types[var84].anim = var85;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 95) {
				String var86 = this.in.gjstr();
				if (var86.endsWith(":tradereq:")) {
					String var87 = var86.substring(0, var86.indexOf(":"));
					long var88 = JString.toBase37(var87);
					boolean var90 = false;
					for (int var91 = 0; var91 < this.ignoreCount; var91++) {
						if (this.ignoreName37[var91] == var88) {
							var90 = true;
							break;
						}
					}
					if (!var90 && this.overrideChat == 0) {
						this.addMessage("wishes to trade with you.", var87, 4);
					}
				} else if (var86.endsWith(":duelreq:")) {
					String var92 = var86.substring(0, var86.indexOf(":"));
					long var93 = JString.toBase37(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < this.ignoreCount; var96++) {
						if (this.ignoreName37[var96] == var93) {
							var95 = true;
							break;
						}
					}
					if (!var95 && this.overrideChat == 0) {
						this.addMessage("wishes to duel with you.", var92, 8);
					}
				} else {
					this.addMessage(var86, "", 0);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 24) {
				this.redrawSidebar = true;
				int var97 = this.in.g1();
				int var98 = this.in.g4();
				int var99 = this.in.g1();
				this.skillExperience[var97] = var98;
				this.skillLevel[var97] = var99;
				this.skillBaseLevel[var97] = 1;
				for (int var100 = 0; var100 < 98; var100++) {
					if (var98 >= levelExperience[var100]) {
						this.skillBaseLevel[var97] = var100 + 2;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 60) {
				Packet var101 = InputTracking.stop();
				if (var101 != null) {
					this.out.pIsaac(217);
					this.out.p2(var101.pos);
					this.out.pdata(var101.pos, 0, var101.data);
					var101.release();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 242) {
				for (int var102 = 0; var102 < this.players.length; var102++) {
					if (this.players[var102] != null) {
						this.players[var102].primarySeqId = -1;
					}
				}
				for (int var103 = 0; var103 < this.npcs.length; var103++) {
					if (this.npcs[var103] != null) {
						this.npcs[var103].primarySeqId = -1;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 108) {
				int var104 = this.in.g2();
				Component.types[var104].modelType = 3;
				Component.types[var104].model = (localPlayer.appearances[8] << 6) + (localPlayer.appearances[0] << 12) + (localPlayer.colours[0] << 24) + (localPlayer.colours[4] << 18) + localPlayer.appearances[11];
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 86) {
				this.getPlayer(this.psize, this.in);
				this.awaitingSync = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 176) {
				int var105 = this.in.g2();
				this.resetInterfaceAnimation(var105);
				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}
				this.sidebarInterfaceId = var105;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 168) {
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
			if (this.ptype == 174) {
				int var106 = this.in.g2b();
				this.stickyChatInterfaceId = var106;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 154) {
				int var107 = this.in.g2();
				String var108 = this.in.gjstr();
				Component.types[var107].text = var108;
				if (this.tabInterfaceId[this.selectedTab] == Component.types[var107].layer) {
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 200) {
				int var109 = this.in.g2();
				int var110 = this.in.g1();
				if (var109 == 65535) {
					var109 = -1;
				}
				this.tabInterfaceId[var110] = var109;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 56) {
				this.selectedTab = this.in.g1();
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 129) {
				int var111 = this.in.g2();
				int var112 = this.in.g2();
				Component.types[var111].modelType = 2;
				Component.types[var111].model = var112;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 222) {
				this.cutscene = true;
				this.cutsceneDstLocalTileX = this.in.g1();
				this.cutsceneDstLocalTileZ = this.in.g1();
				this.cutsceneDstHeight = this.in.g2();
				this.cutsceneRotateSpeed = this.in.g1();
				this.cutsceneRotateAcceleration = this.in.g1();
				if (this.cutsceneRotateAcceleration >= 100) {
					int var113 = this.cutsceneDstLocalTileX * 128 + 64;
					int var114 = this.cutsceneDstLocalTileZ * 128 + 64;
					int var115 = this.getHeightmapY(var114, this.currentLevel, var113) - this.cutsceneDstHeight;
					int var116 = var113 - this.cameraX;
					int var117 = var115 - this.cameraY;
					int var118 = var114 - this.cameraZ;
					int var119 = (int) Math.sqrt((double) (var116 * var116 + var118 * var118));
					this.cameraPitch = (int) (Math.atan2((double) var117, (double) var119) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2((double) var116, (double) var118) * -325.949D) & 0x7FF;
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
			if (this.ptype == 177) {
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runenergy = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 62) {
				this.flagSceneTileX = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 162) {
				int var120 = this.in.g2();
				Component var121 = Component.types[var120];
				for (int var122 = 0; var122 < var121.invSlotObjId.length; var122++) {
					var121.invSlotObjId[var122] = -1;
					var121.invSlotObjId[var122] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 49) {
				this.hintType = this.in.g1();
				if (this.hintType == 1) {
					this.field1277 = this.in.g2();
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
					this.field1415 = this.in.g2();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 10) {
				int var123 = this.in.g2();
				this.resetInterfaceAnimation(var123);
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
				this.viewportInterfaceId = var123;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 189) {
				int var124 = this.in.g2();
				this.resetInterfaceAnimation(var124);
				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				this.chatInterfaceId = var124;
				this.redrawChatback = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 244) {
				this.getNpcPos(this.psize, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 132) {
				this.redrawSidebar = true;
				int var125 = this.in.g2();
				Component var126 = Component.types[var125];
				while (this.in.pos < this.psize) {
					int var127 = this.in.g1();
					int var128 = this.in.g2();
					int var129 = this.in.g1();
					if (var129 == 255) {
						var129 = this.in.g4();
					}
					if (var127 >= 0 && var127 < var126.invSlotObjId.length) {
						var126.invSlotObjId[var127] = var128;
						var126.invSlotObjCount[var127] = var129;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 12) {
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
			if (this.ptype == 233) {
				this.field1337 = this.in.g1();
				this.field1338 = this.in.g1();
				while (this.in.pos < this.psize) {
					int var130 = this.in.g1();
					this.readZonePacket(var130, this.in);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 131) {
				this.field1337 = this.in.g1();
				this.field1338 = this.in.g1();
				for (int var131 = this.field1337; var131 < this.field1337 + 8; var131++) {
					for (int var132 = this.field1338; var132 < this.field1338 + 8; var132++) {
						if (this.field1432[this.currentLevel][var131][var132] != null) {
							this.field1432[this.currentLevel][var131][var132] = null;
							this.sortObjStacks(var131, var132);
						}
					}
				}
				for (LocChange var133 = (LocChange) this.locChanges.head(); var133 != null; var133 = (LocChange) this.locChanges.next()) {
					if (var133.localX >= this.field1337 && var133.localX < this.field1337 + 8 && var133.localZ >= this.field1338 && var133.localZ < this.field1338 + 8 && this.currentLevel == var133.level) {
						var133.duration = 0;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 30) {
				long var134 = this.in.g8();
				int var136 = this.in.g4();
				int var137 = this.in.g1();
				boolean var138 = false;
				for (int var139 = 0; var139 < 100; var139++) {
					if (this.field1241[var139] == var136) {
						var138 = true;
						break;
					}
				}
				if (var137 <= 1) {
					for (int var140 = 0; var140 < this.ignoreCount; var140++) {
						if (this.ignoreName37[var140] == var134) {
							var138 = true;
							break;
						}
					}
				}
				if (!var138 && this.overrideChat == 0) {
					try {
						this.field1241[this.field1411] = var136;
						this.field1411 = (this.field1411 + 1) % 100;
						String var141 = WordPack.unpack(this.psize - 13, this.in);
						String var142 = WordFilter.filter(var141);
						if (var137 == 2 || var137 == 3) {
							this.addMessage(var142, "@cr2@" + JString.formatName(JString.fromBase37(var134)), 7);
						} else if (var137 == 1) {
							this.addMessage(var142, "@cr1@" + JString.formatName(JString.fromBase37(var134)), 7);
						} else {
							this.addMessage(var142, JString.formatName(JString.fromBase37(var134)), 3);
						}
					} catch (Exception var152) {
						signlink.reporterror("cde1");
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 123) {
				int var144 = this.in.g2();
				boolean var145 = this.in.g1() == 1;
				Component.types[var144].hide = var145;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 236) {
				int var146 = this.in.g2();
				byte var147 = this.in.g1b();
				this.field1510[var146] = var147;
				if (this.varps[var146] != var147) {
					this.varps[var146] = var147;
					this.updateVarp(var146);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 7) {
				this.ignoreCount = this.psize / 8;
				for (int var148 = 0; var148 < this.ignoreCount; var148++) {
					this.ignoreName37[var148] = this.in.g8();
				}
				this.ptype = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
			this.logout();
		} catch (IOException var153) {
			this.tryReconnect();
		} catch (Exception var154) {
			String var150 = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (localPlayer.routeTileX[0] + this.sceneBaseTileX) + "," + (localPlayer.routeTileZ[0] + this.sceneBaseTileZ) + " - ";
			for (int var151 = 0; var151 < this.psize && var151 < 50; var151++) {
				var150 = var150 + this.in.data[var151] + ",";
			}
			signlink.reporterror(var150);
			this.logout();
		}
		return true;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void draw() {
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

	@ObfuscatedName("client.K(I)V")
	public final void unloadTitle() {
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
		this.imageFlamesLeft = null;
		this.imageFlamesRight = null;
		this.levelObjStacks = null;
	}

	@ObfuscatedName("client.a(Ld;II)I")
	public final int executeClientScript(Component arg0, int arg2) {
		if (arg0.scripts == null || arg2 >= arg0.scripts.length) {
			return -2;
		} else {
			try {
				int[] var4 = arg0.scripts[arg2];
				int var5 = 0;
				int var6 = 0;
				while (true) {
					int var7 = var4[var6++];
					if (var7 == 0) {
						return var5;
					}
					if (var7 == 1) {
						var5 += this.skillLevel[var4[var6++]];
					}
					if (var7 == 2) {
						var5 += this.skillBaseLevel[var4[var6++]];
					}
					if (var7 == 3) {
						var5 += this.skillExperience[var4[var6++]];
					}
					if (var7 == 4) {
						Component var8 = Component.types[var4[var6++]];
						int var9 = var4[var6++] + 1;
						for (int var10 = 0; var10 < var8.invSlotObjId.length; var10++) {
							if (var8.invSlotObjId[var10] == var9) {
								var5 += var8.invSlotObjCount[var10];
							}
						}
					}
					if (var7 == 5) {
						var5 += this.varps[var4[var6++]];
					}
					if (var7 == 6) {
						var5 += levelExperience[this.skillBaseLevel[var4[var6++]] - 1];
					}
					if (var7 == 7) {
						var5 += this.varps[var4[var6++]] * 100 / 46875;
					}
					if (var7 == 8) {
						var5 += localPlayer.combatLevel;
					}
					if (var7 == 9) {
						for (int var11 = 0; var11 < 19; var11++) {
							if (var11 == 18) {
								var11 = 20;
							}
							var5 += this.skillBaseLevel[var11];
						}
					}
					if (var7 == 10) {
						Component var12 = Component.types[var4[var6++]];
						int var13 = var4[var6++] + 1;
						for (int var14 = 0; var14 < var12.invSlotObjId.length; var14++) {
							if (var12.invSlotObjId[var14] == var13) {
								var5 += 999999999;
								break;
							}
						}
					}
					if (var7 == 11) {
						var5 += this.runenergy;
					}
					if (var7 == 12) {
						var5 += this.runweight;
					}
					if (var7 == 13) {
						int var15 = this.varps[var4[var6++]];
						int var16 = var4[var6++];
						var5 += (var15 & 0x1 << var16) == 0 ? 0 : 1;
					}
				}
			} catch (Exception var17) {
				return -1;
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;B)V")
	public final void updateFlameBuffer(Pix8 arg0) {
		short var3 = 256;
		for (int var4 = 0; var4 < this.flameBuffer0.length; var4++) {
			this.flameBuffer0[var4] = 0;
		}
		for (int var5 = 0; var5 < 5000; var5++) {
			int var17 = (int) (Math.random() * 128.0D * (double) var3);
			this.flameBuffer0[var17] = (int) (Math.random() * 256.0D);
		}
		for (int var6 = 0; var6 < 20; var6++) {
			for (int var13 = 1; var13 < var3 - 1; var13++) {
				for (int var15 = 1; var15 < 127; var15++) {
					int var16 = (var13 << 7) + var15;
					this.flameBuffer1[var16] = (this.flameBuffer0[var16 - 1] + this.flameBuffer0[var16 + 1] + this.flameBuffer0[var16 - 128] + this.flameBuffer0[var16 + 128]) / 4;
				}
			}
			int[] var14 = this.flameBuffer0;
			this.flameBuffer0 = this.flameBuffer1;
			this.flameBuffer1 = var14;
		}
		if (arg0 == null) {
			return;
		}
		int var7 = 0;
		for (int var8 = 0; var8 < arg0.cropBottom; var8++) {
			for (int var9 = 0; var9 < arg0.cropRight; var9++) {
				if (arg0.pixels[var7++] != 0) {
					int var10 = var9 + 16 + arg0.cropLeft;
					int var11 = var8 + 16 + arg0.cropTop;
					int var12 = (var11 << 7) + var10;
					this.flameBuffer0[var12] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String formatObjCount(int arg1) {
		if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.a(IIBIII)V")
	public final void drawMinimapLoc(int arg0, int arg1, int arg3, int arg4, int arg5) {
		int var7 = this.scene.getWallTypecode(arg1, arg5, arg0);
		if (var7 != 0) {
			int var8 = this.scene.getInfo(arg1, arg5, arg0, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg4;
			if (var7 > 0) {
				var11 = arg3;
			}
			int[] var12 = this.imageMinimap.pixels;
			int var13 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
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
					int var17 = (var15.width * 4 - var16.cropRight) / 2;
					int var18 = (var15.length * 4 - var16.cropBottom) / 2;
					var16.draw(arg5 * 4 + 48 + var17, (104 - arg0 - var15.length) * 4 + 48 + var18);
				}
			}
		}
		int var19 = this.scene.getLocTypecode(arg1, arg5, arg0);
		if (var19 != 0) {
			int var20 = this.scene.getInfo(arg1, arg5, arg0, var19);
			int var21 = var20 >> 6 & 0x3;
			int var22 = var20 & 0x1F;
			int var23 = var19 >> 14 & 0x7FFF;
			LocType var24 = LocType.get(var23);
			if (var24.mapscene != -1) {
				Pix8 var25 = this.imageMapscene[var24.mapscene];
				if (var25 != null) {
					int var26 = (var24.width * 4 - var25.cropRight) / 2;
					int var27 = (var24.length * 4 - var25.cropBottom) / 2;
					var25.draw(arg5 * 4 + 48 + var26, (104 - arg0 - var24.length) * 4 + 48 + var27);
				}
			} else if (var22 == 9) {
				int var28 = 15658734;
				if (var19 > 0) {
					var28 = 15597568;
				}
				int[] var29 = this.imageMinimap.pixels;
				int var30 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
				if (var21 == 0 || var21 == 2) {
					var29[var30 + 1536] = var28;
					var29[var30 + 1024 + 1] = var28;
					var29[var30 + 512 + 2] = var28;
					var29[var30 + 3] = var28;
				} else {
					var29[var30] = var28;
					var29[var30 + 512 + 1] = var28;
					var29[var30 + 1024 + 2] = var28;
					var29[var30 + 1536 + 3] = var28;
				}
			}
		}
		int var31 = this.scene.getGroundDecorTypecode(arg1, arg5, arg0);
		if (var31 == 0) {
			return;
		}
		int var33 = var31 >> 14 & 0x7FFF;
		LocType var34 = LocType.get(var33);
		if (var34.mapscene == -1) {
			return;
		}
		Pix8 var35 = this.imageMapscene[var34.mapscene];
		if (var35 != null) {
			int var36 = (var34.width * 4 - var35.cropRight) / 2;
			int var37 = (var34.length * 4 - var35.cropBottom) / 2;
			var35.draw(arg5 * 4 + 48 + var36, (104 - arg0 - var34.length) * 4 + 48 + var37);
			return;
		}
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.L(I)V")
	public final void updateLocChanges() {
		if (this.sceneState != 2) {
			return;
		}
		for (LocChange var2 = (LocChange) this.locChanges.head(); var2 != null; var2 = (LocChange) this.locChanges.next()) {
			if (var2.duration > 0) {
				var2.duration--;
			}
			if (var2.duration != 0) {
				if (var2.delay > 0) {
					var2.delay--;
				}
				if (var2.delay == 0 && (var2.type < 0 || World.isLocReady(var2.type, var2.shape))) {
					this.addLoc(var2.type, var2.localX, var2.angle, var2.shape, var2.level, var2.localZ, var2.layer);
					var2.delay = -1;
					if (var2.type == var2.previousType && var2.previousType == -1) {
						var2.unlink();
					} else if (var2.type == var2.previousType && var2.angle == var2.previousAngle && var2.shape == var2.previousShape) {
						var2.unlink();
					}
				}
			} else if (var2.previousType < 0 || World.isLocReady(var2.previousType, var2.previousShape)) {
				this.addLoc(var2.previousType, var2.localX, var2.previousAngle, var2.previousShape, var2.level, var2.localZ, var2.layer);
				var2.unlink();
			}
		}
		field1453++;
		if (field1453 > 85) {
			field1453 = 0;
			this.out.pIsaac(232);
			return;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void unload() {
		signlink.reporterror = false;
		try {
			if (this.stream != null) {
				this.stream.close();
			}
		} catch (Exception var2) {
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
		this.field1432 = null;
		this.locChanges = null;
		this.projectiles = null;
		this.spotanims = null;
		this.menuParamB = null;
		this.menuParamC = null;
		this.menuAction = null;
		this.menuParamA = null;
		this.menuOption = null;
		this.varps = null;
		this.field1211 = null;
		this.field1212 = null;
		this.field1448 = null;
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
		PlayerEntity.modelCache = null;
		Pix3D.unload();
		World3D.unload();
		Model.unload();
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String getHost() {
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.b(Ld;B)Z")
	public final boolean handleInterfaceAction(Component arg0) {
		int var3 = arg0.clientCode;
		if (var3 == 201) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 1;
			this.socialMessage = "Enter name of friend to add to list";
		}
		if (var3 == 202) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 2;
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
			this.socialAction = 4;
			this.socialMessage = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 5;
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
			this.out.pIsaac(8);
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
				this.out.pIsaac(251);
				this.out.p8(JString.toBase37(this.reportAbuseInput));
				this.out.p1(var3 - 601);
				this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void handlePrivateChatInput(int arg1, int arg2) {
		int var4 = 0;
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.messageText[var5] != null) {
				int var6 = this.messageType[var5];
				int var7 = 70 - var4 * 14 + this.chatScrollOffset + 4;
				if (var7 < -20) {
					break;
				}
				String var8 = this.messageSender[var5];
				boolean var9 = false;
				if (var8 != null && var8.startsWith("@cr1@")) {
					var8 = var8.substring(5);
					boolean var10 = true;
				}
				if (var8 != null && var8.startsWith("@cr2@")) {
					var8 = var8.substring(5);
					boolean var11 = true;
				}
				if (var6 == 0) {
					var4++;
				}
				if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(localPlayer.name)) {
						if (this.staffmodlevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
							this.menuAction[this.menuSize] = 34;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
						this.menuAction[this.menuSize] = 436;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
						this.menuAction[this.menuSize] = 406;
						this.menuSize++;
					}
					var4++;
				}
				if ((var6 == 3 || var6 == 7) && this.splitPrivateChat == 0 && (var6 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						if (this.staffmodlevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var8;
							this.menuAction[this.menuSize] = 34;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var8;
						this.menuAction[this.menuSize] = 436;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var8;
						this.menuAction[this.menuSize] = 406;
						this.menuSize++;
					}
					var4++;
				}
				if (var6 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						this.menuOption[this.menuSize] = "Accept trade @whi@" + var8;
						this.menuAction[this.menuSize] = 903;
						this.menuSize++;
					}
					var4++;
				}
				if ((var6 == 5 || var6 == 6) && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
					var4++;
				}
				if (var6 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var8))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						this.menuOption[this.menuSize] = "Accept duel @whi@" + var8;
						this.menuAction[this.menuSize] = 363;
						this.menuSize++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void setMidiVolume(int arg0, boolean arg1) {
		signlink.midivol = arg0;
		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void updateTitle() {
		if (this.titleScreenState == 0) {
			int var2 = super.screenWidth / 2 - 80;
			int var3 = super.screenHeight / 2 + 20;
			int var14 = var3 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.titleScreenState = 3;
				this.titleLoginField = 0;
			}
			int var4 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Enter your username & password.";
				this.titleScreenState = 2;
				this.titleLoginField = 0;
			}
		} else if (this.titleScreenState == 2) {
			int var5 = super.screenHeight / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var16 - 15 && super.mouseClickY < var16) {
				this.titleLoginField = 0;
			}
			var5 = var16 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
				this.titleLoginField = 1;
			}
			var5 += 15;
			int var6 = super.screenWidth / 2 - 80;
			int var7 = super.screenHeight / 2 + 50;
			int var17 = var7 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.login(this.username, this.password, false);
				if (this.ingame) {
					return;
				}
			}
			int var8 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.titleScreenState = 0;
				this.username = "";
				this.password = "";
			}
			while (true) {
				while (true) {
					int var9 = this.pollKey();
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < CHARSET.length(); var11++) {
						if (var9 == CHARSET.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (this.titleLoginField == 0) {
						if (var9 == 8 && this.username.length() > 0) {
							this.username = this.username.substring(0, this.username.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.titleLoginField = 1;
						}
						if (var10) {
							this.username = this.username + (char) var9;
						}
						if (this.username.length() > 12) {
							this.username = this.username.substring(0, 12);
						}
					} else if (this.titleLoginField == 1) {
						if (var9 == 8 && this.password.length() > 0) {
							this.password = this.password.substring(0, this.password.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.titleLoginField = 0;
						}
						if (var10) {
							this.password = this.password + (char) var9;
						}
						if (this.password.length() > 20) {
							this.password = this.password.substring(0, 20);
						}
					}
				}
			}
		} else if (this.titleScreenState == 3) {
			int var12 = super.screenWidth / 2;
			int var13 = super.screenHeight / 2 + 50;
			int var18 = var13 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
				this.titleScreenState = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = this.field1432[this.currentLevel][arg0][arg1];
		if (var3 == null) {
			this.scene.removeGroundObj(this.currentLevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ObjStackEntity var5 = null;
		for (ObjStackEntity var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next()) {
			ObjType var11 = ObjType.get(var6.field500);
			int var12 = var11.cost;
			if (var11.stackable) {
				var12 = (var6.field501 + 1) * var12;
			}
			if (var12 > var4) {
				var4 = var12;
				var5 = var6;
			}
		}
		var3.addHead(var5);
		ObjStackEntity var7 = null;
		ObjStackEntity var8 = null;
		for (ObjStackEntity var9 = (ObjStackEntity) var3.head(); var9 != null; var9 = (ObjStackEntity) var3.next()) {
			if (var5.field500 != var9.field500 && var7 == null) {
				var7 = var9;
			}
			if (var5.field500 != var9.field500 && var7.field500 != var9.field500 && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.scene.addGroundObject(var10, this.getHeightmapY(arg1 * 128 + 64, this.currentLevel, arg0 * 128 + 64), arg0, arg1, var8, var5, this.currentLevel, var7);
	}

	@ObfuscatedName("client.N(I)V")
	public final void buildScene() {
		try {
			this.minimapLevel = -1;
			this.spotanims.clear();
			this.projectiles.clear();
			Pix3D.clearTexels();
			this.clearCache();
			this.scene.reset();
			for (int var2 = 0; var2 < 4; var2++) {
				this.levelCollisionMap[var2].reset();
			}
			System.gc();
			World var3 = new World(this.levelHeightmap, this.levelTileFlags, 104, 104);
			int var4 = this.sceneMapLandData.length;
			World.lowMemory = World3D.lowMemory;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = this.sceneMapIndex[var5] >> 8;
				int var7 = this.sceneMapIndex[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					World.lowMemory = false;
				}
			}
			if (World.lowMemory) {
				this.scene.setMinLevel(this.currentLevel);
			} else {
				this.scene.setMinLevel(0);
			}
			this.out.pIsaac(107);
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (this.sceneMapIndex[var8] >> 8) * 64 - this.sceneBaseTileX;
				int var10 = (this.sceneMapIndex[var8] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] var11 = this.sceneMapLandData[var8];
				if (var11 != null) {
					var3.loadGround(var11, var9, var10, (this.sceneCenterZoneX - 6) * 8, (this.sceneCenterZoneZ - 6) * 8);
				}
			}
			for (int var12 = 0; var12 < var4; var12++) {
				int var13 = (this.sceneMapIndex[var12] >> 8) * 64 - this.sceneBaseTileX;
				int var14 = (this.sceneMapIndex[var12] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] var15 = this.sceneMapLandData[var12];
				if (var15 == null && this.sceneCenterZoneZ < 800) {
					var3.stitchHeightmap(var13, var14, 64, 64);
				}
			}
			this.out.pIsaac(107);
			for (int var16 = 0; var16 < var4; var16++) {
				byte[] var17 = this.sceneMapLocData[var16];
				if (var17 != null) {
					int var18 = (this.sceneMapIndex[var16] >> 8) * 64 - this.sceneBaseTileX;
					int var19 = (this.sceneMapIndex[var16] & 0xFF) * 64 - this.sceneBaseTileZ;
					var3.loadLocations(var19, this.scene, this.levelCollisionMap, var18, var17);
				}
			}
			this.out.pIsaac(107);
			var3.build(this.scene, this.levelCollisionMap);
			this.areaViewport.bind();
			this.out.pIsaac(107);
			for (int var20 = 0; var20 < 104; var20++) {
				for (int var21 = 0; var21 < 104; var21++) {
					this.sortObjStacks(var20, var21);
				}
			}
			this.clearLocChanges();
		} catch (Exception var34) {
		}
		LocType.modelCacheStatic.clear();
		if (lowMemory && signlink.cache_dat != null) {
			int var23 = this.onDemand.getFileCount(0);
			for (int var24 = 0; var24 < var23; var24++) {
				int var25 = this.onDemand.getModelFlags(var24);
				if ((var25 & 0x79) == 0) {
					Model.unload(var24);
				}
			}
		}
		System.gc();
		Pix3D.initPool(20);
		this.onDemand.clearPrefetches();
		int var26 = (this.sceneCenterZoneX - 6) / 8 - 1;
		int var27 = (this.sceneCenterZoneX + 6) / 8 + 1;
		int var28 = (this.sceneCenterZoneZ - 6) / 8 - 1;
		int var29 = (this.sceneCenterZoneZ + 6) / 8 + 1;
		if (this.withinTutorialIsland) {
			var26 = 49;
			var27 = 50;
			var28 = 49;
			var29 = 50;
		}
		for (int var30 = var26; var30 <= var27; var30++) {
			for (int var31 = var28; var31 <= var29; var31++) {
				if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
					int var32 = this.onDemand.getMapFile(var31, var30, 0);
					if (var32 != -1) {
						this.onDemand.prefetch(3, var32);
					}
					int var33 = this.onDemand.getMapFile(var31, var30, 1);
					if (var33 != -1) {
						this.onDemand.prefetch(3, var33);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void drawFlames() {
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
			this.imageTitle0.data[var6] = this.imageFlamesRight.pixels[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var23 = (var2 - var9) * this.flameLineOffset[var9] / var2;
			int var24 = var23 + 22;
			if (var24 < 0) {
				var24 = 0;
			}
			var7 += var24;
			for (int var25 = var24; var25 < 128; var25++) {
				int var26 = this.flameBuffer2[var7++];
				if (var26 == 0) {
					var8++;
				} else {
					int var28 = 256 - var26;
					int var29 = this.flameGradient[var26];
					int var30 = this.imageTitle0.data[var8];
					this.imageTitle0.data[var8++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var8 += var24;
		}
		this.imageTitle0.draw(super.graphics, 0, 0);
		for (int var10 = 0; var10 < 33920; var10++) {
			this.imageTitle1.data[var10] = this.levelObjStacks.pixels[var10];
		}
		int var11 = 0;
		int var12 = 1176;
		for (int var13 = 1; var13 < var2 - 1; var13++) {
			int var14 = (var2 - var13) * this.flameLineOffset[var13] / var2;
			int var15 = 103 - var14;
			int var16 = var12 + var14;
			for (int var17 = 0; var17 < var15; var17++) {
				int var18 = this.flameBuffer2[var11++];
				if (var18 == 0) {
					var16++;
				} else {
					int var20 = 256 - var18;
					int var21 = this.flameGradient[var18];
					int var22 = this.imageTitle1.data[var16];
					this.imageTitle1.data[var16++] = ((var21 & 0xFF00FF) * var18 + (var22 & 0xFF00FF) * var20 & 0xFF00FF00) + ((var21 & 0xFF00) * var18 + (var22 & 0xFF00) * var20 & 0xFF0000) >> 8;
				}
			}
			var11 += 128 - var15;
			var12 = 128 - var15 - var14 + var16;
		}
		this.imageTitle1.draw(super.graphics, 0, 637);
	}

	@ObfuscatedName("client.a(BI)V")
	public final void createMinimap(int arg1) {
		int[] var3 = this.imageMinimap.pixels;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var23 = (103 - var6) * 512 * 4 + 24628;
			for (int var24 = 1; var24 < 103; var24++) {
				if ((this.levelTileFlags[arg1][var24][var6] & 0x18) == 0) {
					this.scene.drawMinimapTile(var3, var23, 512, arg1, var24, var6);
				}
				if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var24][var6] & 0x8) != 0) {
					this.scene.drawMinimapTile(var3, var23, 512, arg1 + 1, var24, var6);
				}
				var23 += 4;
			}
		}
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.imageMinimap.bind();
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var22 = 1; var22 < 103; var22++) {
				if ((this.levelTileFlags[arg1][var22][var9] & 0x18) == 0) {
					this.drawMinimapLoc(var9, arg1, var8, var7, var22);
				}
				if (arg1 < 3 && (this.levelTileFlags[arg1 + 1][var22][var9] & 0x8) != 0) {
					this.drawMinimapLoc(var9, arg1 + 1, var8, var7, var22);
				}
			}
		}
		this.areaViewport.bind();
		this.field1210 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = this.scene.getGroundDecorTypecode(this.currentLevel, var10, var11);
				if (var12 != 0) {
					int var13 = var12 >> 14 & 0x7FFF;
					int var14 = LocType.get(var13).mapfunction;
					if (var14 >= 0) {
						int var15 = var10;
						int var16 = var11;
						if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
							byte var17 = 104;
							byte var18 = 104;
							int[][] var19 = this.levelCollisionMap[this.currentLevel].flags;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 0x280108) == 0) {
									var15--;
								}
								if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 0x280180) == 0) {
									var15++;
								}
								if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 0x280102) == 0) {
									var16--;
								}
								if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 0x280120) == 0) {
									var16++;
								}
							}
						}
						this.field1448[this.field1210] = this.imageMapfunction[var14];
						this.field1211[this.field1210] = var15;
						this.field1212[this.field1210] = var16;
						this.field1210++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void loadTitle() {
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
		this.imageTitle0 = new PixMap(this.getBaseComponent(), 265, 128);
		Pix2D.clear();
		this.imageTitle1 = new PixMap(this.getBaseComponent(), 265, 128);
		Pix2D.clear();
		this.imageTitle2 = new PixMap(this.getBaseComponent(), 171, 509);
		Pix2D.clear();
		this.imageTitle3 = new PixMap(this.getBaseComponent(), 132, 360);
		Pix2D.clear();
		this.imageTitle4 = new PixMap(this.getBaseComponent(), 200, 360);
		Pix2D.clear();
		this.imageTitle5 = new PixMap(this.getBaseComponent(), 238, 202);
		Pix2D.clear();
		this.imageTitle6 = new PixMap(this.getBaseComponent(), 238, 203);
		Pix2D.clear();
		this.imageTitle7 = new PixMap(this.getBaseComponent(), 94, 74);
		Pix2D.clear();
		this.imageTitle8 = new PixMap(this.getBaseComponent(), 94, 75);
		Pix2D.clear();
		if (this.jagTitle != null) {
			this.loadTitleBackground();
			this.loadTitleImages();
		}
		this.redrawFrame = true;
	}

	@ObfuscatedName("client.k(B)V")
	public final void showContextMenu() {
		int var2 = this.fontBold12.stringWidth("Choose Option");
		for (int var3 = 0; var3 < this.menuSize; var3++) {
			int var11 = this.fontBold12.stringWidth(this.menuOption[var3]);
			if (var11 > var2) {
				var2 = var11;
			}
		}
		var2 += 8;
		int var4 = this.menuSize * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var5 = super.mouseClickX - 4 - var2 / 2;
			if (var2 + var5 > 512) {
				var5 = 512 - var2;
			}
			if (var5 < 0) {
				var5 = 0;
			}
			int var6 = super.mouseClickY - 4;
			if (var4 + var6 > 334) {
				var6 = 334 - var4;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			this.menuVisible = true;
			this.menuArea = 0;
			this.menuX = var5;
			this.menuY = var6;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var7 = super.mouseClickX - 553 - var2 / 2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var2 + var7 > 190) {
				var7 = 190 - var2;
			}
			int var8 = super.mouseClickY - 205;
			if (var8 < 0) {
				var8 = 0;
			} else if (var4 + var8 > 261) {
				var8 = 261 - var4;
			}
			this.menuVisible = true;
			this.menuArea = 1;
			this.menuX = var7;
			this.menuY = var8;
			this.menuWidth = var2;
			this.menuHeight = this.menuSize * 15 + 22;
		}
		if (super.mouseClickX <= 17 || super.mouseClickY <= 357 || super.mouseClickX >= 496 || super.mouseClickY >= 453) {
			return;
		}
		int var9 = super.mouseClickX - 17 - var2 / 2;
		if (var9 < 0) {
			var9 = 0;
		} else if (var2 + var9 > 479) {
			var9 = 479 - var2;
		}
		int var10 = super.mouseClickY - 357;
		if (var10 < 0) {
			var10 = 0;
		} else if (var4 + var10 > 96) {
			var10 = 96 - var4;
		}
		this.menuVisible = true;
		this.menuArea = 2;
		this.menuX = var9;
		this.menuY = var10;
		this.menuWidth = var2;
		this.menuHeight = this.menuSize * 15 + 22;
	}

	@ObfuscatedName("client.a(Ld;IZIIIIII)V")
	public final void handleScrollInput(Component arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (this.field1249) {
			this.field1594 = 32;
		} else {
			this.field1594 = 0;
		}
		this.field1249 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg0.scrollPosition -= this.dragCycles * 4;
			if (arg2) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 + arg4 - 16 && arg3 < arg1 + arg4) {
			arg0.scrollPosition += this.dragCycles * 4;
			if (arg2) {
				this.redrawSidebar = true;
				return;
			}
		} else if (arg6 >= arg7 - this.field1594 && arg6 < arg7 + 16 + this.field1594 && arg3 >= arg1 + 16 && arg3 < arg1 + arg4 - 16 && this.dragCycles > 0) {
			int var10 = (arg4 - 32) * arg4 / arg5;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg3 - arg1 - 16 - var10 / 2;
			int var12 = arg4 - 32 - var10;
			arg0.scrollPosition = (arg5 - arg4) * var11 / var12;
			if (arg2) {
				this.redrawSidebar = true;
			}
			this.field1249 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void getPlayerNewVis(Packet arg0, int arg1) {
		while (arg0.bitPos + 10 < arg1 * 8) {
			int var4 = arg0.gBit(11);
			if (var4 == 2047) {
				break;
			}
			if (this.players[var4] == null) {
				this.players[var4] = new PlayerEntity();
				if (this.playerAppearanceBuffer[var4] != null) {
					this.players[var4].read(this.playerAppearanceBuffer[var4]);
				}
			}
			this.playerIds[this.playerCount++] = var4;
			PlayerEntity var5 = this.players[var4];
			var5.cycle = loopCycle;
			int var6 = arg0.gBit(5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg0.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg0.gBit(1);
			var5.move(var8 == 1, localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7);
			int var9 = arg0.gBit(1);
			if (var9 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var4;
			}
		}
		arg0.bytes();
	}

	@ObfuscatedName("client.a(IIILd;I)V")
	public final void drawInterface(int arg0, int arg2, Component arg3, int arg4) {
		if (arg3.type != 0 || arg3.children == null || arg3.hide && this.viewportHoveredInterfaceId != arg3.id && this.sidebarHoveredInterfaceId != arg3.id && this.chatHoveredInterfaceId != arg3.id) {
			return;
		}
		int var6 = Pix2D.left;
		int var7 = Pix2D.top;
		int var8 = Pix2D.right;
		int var9 = Pix2D.bottom;
		Pix2D.setBounds(arg3.width + arg4, arg3.height + arg2, arg2, arg4);
		int var10 = arg3.children.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg3.childX[var11] + arg4;
			int var13 = arg3.childY[var11] + arg2 - arg0;
			Component var14 = Component.types[arg3.children[var11]];
			int var15 = var14.x + var12;
			int var16 = var14.y + var13;
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
				this.drawInterface(var14.scrollPosition, var16, var14, var15);
				if (var14.scroll > var14.height) {
					this.drawScrollbar(var14.width + var15, var14.scroll, var16, var14.scrollPosition, var14.height);
				}
			} else if (var14.type != 1) {
				if (var14.type == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.height; var18++) {
						for (int var19 = 0; var19 < var14.width; var19++) {
							int var20 = (var14.marginX + 32) * var19 + var15;
							int var21 = (var14.marginY + 32) * var18 + var16;
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
									if (this.objSelected == 1 && this.field1498 == var17 && this.field1499 == var14.id) {
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
											var26.drawAlpha(var20 + var22, 128, var21 + var23);
											if (var21 + var23 < Pix2D.top && arg3.scrollPosition > 0) {
												int var27 = (Pix2D.top - var21 - var23) * this.sceneDelta / 3;
												if (var27 > this.sceneDelta * 10) {
													var27 = this.sceneDelta * 10;
												}
												if (var27 > arg3.scrollPosition) {
													var27 = arg3.scrollPosition;
												}
												arg3.scrollPosition -= var27;
												this.objGrabY += var27;
											}
											if (var21 + var23 + 32 > Pix2D.bottom && arg3.scrollPosition < arg3.scroll - arg3.height) {
												int var28 = (var21 + var23 + 32 - Pix2D.bottom) * this.sceneDelta / 3;
												if (var28 > this.sceneDelta * 10) {
													var28 = this.sceneDelta * 10;
												}
												if (var28 > arg3.scroll - arg3.height - arg3.scrollPosition) {
													var28 = arg3.scroll - arg3.height - arg3.scrollPosition;
												}
												arg3.scrollPosition += var28;
												this.objGrabY -= var28;
											}
										} else if (this.selectedArea != 0 && this.field1299 == var17 && this.field1298 == var14.id) {
											var26.drawAlpha(var20, 128, var21);
										} else {
											var26.draw(var20, var21);
										}
										if (var26.width == 33 || var14.invSlotObjCount[var17] != 1) {
											int var29 = var14.invSlotObjCount[var17];
											this.fontPlain11.drawString(formatObjCount(var29), 0, var21 + 10 + var23, var20 + 1 + var22);
											this.fontPlain11.drawString(formatObjCount(var29), 16776960, var21 + 9 + var23, var20 + var22);
										}
									}
								}
							} else if (var14.invSlotGraphic != null && var17 < 20) {
								Pix32 var30 = var14.invSlotGraphic[var17];
								if (var30 != null) {
									var30.draw(var20, var21);
								}
							}
							var17++;
						}
					}
				} else if (var14.type == 3) {
					if (var14.alpha == 0) {
						if (var14.fill) {
							Pix2D.fillRect(var14.colour, var14.width, var14.height, var15, var16);
						} else {
							Pix2D.drawRect(var14.height, var14.width, var14.colour, var15, var16);
						}
					} else if (var14.fill) {
						Pix2D.fillRect(var16, 256 - (var14.alpha & 0xFF), var14.height, var14.width, var14.colour, var15);
					} else {
						Pix2D.drawRect(var14.height, var14.colour, var15, var16, var14.width, true, 256 - (var14.alpha & 0xFF));
					}
				} else if (var14.type == 4) {
					PixFont var31 = var14.font;
					int var32 = var14.colour;
					String var33 = var14.text;
					if ((this.chatHoveredInterfaceId == var14.id || this.sidebarHoveredInterfaceId == var14.id || this.viewportHoveredInterfaceId == var14.id) && var14.overColour != 0) {
						var32 = var14.overColour;
					}
					if (this.executeInterfaceScript(var14)) {
						var32 = var14.activeColour;
						if (var14.activeText.length() > 0) {
							var33 = var14.activeText;
						}
					}
					if (var14.buttonType == 6 && this.pressedContinueOption) {
						var33 = "Please wait...";
						var32 = var14.colour;
					}
					if (Pix2D.width2d == 479) {
						if (var32 == 16776960) {
							var32 = 255;
						}
						if (var32 == 49152) {
							var32 = 16777215;
						}
					}
					int var34 = var31.height + var16;
					while (var33.length() > 0) {
						if (var33.indexOf("%") != -1) {
							label311: while (true) {
								int var35 = var33.indexOf("%1");
								if (var35 == -1) {
									while (true) {
										int var36 = var33.indexOf("%2");
										if (var36 == -1) {
											while (true) {
												int var37 = var33.indexOf("%3");
												if (var37 == -1) {
													while (true) {
														int var38 = var33.indexOf("%4");
														if (var38 == -1) {
															while (true) {
																int var39 = var33.indexOf("%5");
																if (var39 == -1) {
																	break label311;
																}
																var33 = var33.substring(0, var39) + this.getIntString(this.executeClientScript(var14, 4)) + var33.substring(var39 + 2);
															}
														}
														var33 = var33.substring(0, var38) + this.getIntString(this.executeClientScript(var14, 3)) + var33.substring(var38 + 2);
													}
												}
												var33 = var33.substring(0, var37) + this.getIntString(this.executeClientScript(var14, 2)) + var33.substring(var37 + 2);
											}
										}
										var33 = var33.substring(0, var36) + this.getIntString(this.executeClientScript(var14, 1)) + var33.substring(var36 + 2);
									}
								}
								var33 = var33.substring(0, var35) + this.getIntString(this.executeClientScript(var14, 0)) + var33.substring(var35 + 2);
							}
						}
						int var40 = var33.indexOf("\\n");
						String var41;
						if (var40 == -1) {
							var41 = var33;
							var33 = "";
						} else {
							var41 = var33.substring(0, var40);
							var33 = var33.substring(var40 + 2);
						}
						if (var14.center) {
							var31.drawStringTaggableCenter(var14.width / 2 + var15, var14.shadowed, var41, var34, var32);
						} else {
							var31.drawStringTaggable(var32, var15, var14.shadowed, var34, var41);
						}
						var34 += var31.height;
					}
				} else if (var14.type == 5) {
					Pix32 var42;
					if (this.executeInterfaceScript(var14)) {
						var42 = var14.activeGraphic;
					} else {
						var42 = var14.graphic;
					}
					if (var42 != null) {
						var42.draw(var15, var16);
					}
				} else if (var14.type == 6) {
					int var43 = Pix3D.centerX;
					int var44 = Pix3D.centerY;
					Pix3D.centerX = var14.width / 2 + var15;
					Pix3D.centerY = var14.height / 2 + var16;
					int var45 = Pix3D.sinTable[var14.xan] * var14.zoom >> 16;
					int var46 = Pix3D.cosTable[var14.xan] * var14.zoom >> 16;
					boolean var47 = this.executeInterfaceScript(var14);
					int var48;
					if (var47) {
						var48 = var14.activeAnim;
					} else {
						var48 = var14.anim;
					}
					Model var49;
					if (var48 == -1) {
						var49 = var14.getModel(-1, -1, var47);
					} else {
						SeqType var50 = SeqType.types[var48];
						var49 = var14.getModel(var50.frames[var14.seqFrame], var50.iframes[var14.seqFrame], var47);
					}
					if (var49 != null) {
						var49.drawSimple(0, var14.yan, 0, var14.xan, 0, var45, var46);
					}
					Pix3D.centerX = var43;
					Pix3D.centerY = var44;
				} else if (var14.type == 7) {
					PixFont var51 = var14.font;
					int var52 = 0;
					for (int var53 = 0; var53 < var14.height; var53++) {
						for (int var54 = 0; var54 < var14.width; var54++) {
							if (var14.invSlotObjId[var52] > 0) {
								ObjType var55 = ObjType.get(var14.invSlotObjId[var52] - 1);
								String var56 = var55.name;
								if (var55.stackable || var14.invSlotObjCount[var52] != 1) {
									var56 = var56 + " x" + formatObjCountTagged(var14.invSlotObjCount[var52]);
								}
								int var57 = (var14.marginX + 115) * var54 + var15;
								int var58 = (var14.marginY + 12) * var53 + var16;
								if (var14.center) {
									var51.drawStringTaggableCenter(var14.width / 2 + var57, var14.shadowed, var56, var58, var14.colour);
								} else {
									var51.drawStringTaggable(var14.colour, var57, var14.shadowed, var58, var56);
								}
							}
							var52++;
						}
					}
				}
			}
		}
		Pix2D.setBounds(var8, var9, var7, var6);
	}

	@ObfuscatedName("client.l(B)V")
	public final void drawError() {
		Graphics var2 = this.getBaseComponent().getGraphics();
		var2.setColor(Color.black);
		var2.fillRect(0, 0, 765, 503);
		this.setFramerate(1);
		if (this.errorLoading) {
			this.flameActive = false;
			var2.setFont(new Font("Helvetica", 1, 16));
			var2.setColor(Color.yellow);
			byte var4 = 35;
			var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
			int var6 = var4 + 50;
			var2.setColor(Color.white);
			var2.drawString("To fix this try the following (in order):", 30, var6);
			int var7 = var6 + 50;
			var2.setColor(Color.white);
			var2.setFont(new Font("Helvetica", 1, 12));
			var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
			int var8 = var7 + 30;
			var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
			int var9 = var8 + 30;
			var2.drawString("3: Try using a different game-world", 30, var9);
			int var11 = var9 + 30;
			var2.drawString("4: Try rebooting your computer", 30, var11);
			int var13 = var11 + 30;
			var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
		}
		if (this.errorHost) {
			this.flameActive = false;
			var2.setFont(new Font("Helvetica", 1, 20));
			var2.setColor(Color.white);
			var2.drawString("Error - unable to load game!", 50, 50);
			var2.drawString("To play RuneScape make sure you play from", 50, 100);
			var2.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.errorStarted) {
			return;
		}
		this.flameActive = false;
		var2.setColor(Color.yellow);
		byte var5 = 35;
		var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
		int var10 = var5 + 50;
		var2.setColor(Color.white);
		var2.drawString("To fix this try the following (in order):", 30, var10);
		int var12 = var10 + 50;
		var2.setColor(Color.white);
		var2.setFont(new Font("Helvetica", 1, 12));
		var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
		int var14 = var12 + 30;
		var2.drawString("2: Try rebooting your computer, and reloading", 30, var14);
		int var15 = var14 + 30;
	}

	@ObfuscatedName("client.l(Z)V")
	public final void updateGame() {
		if (this.systemUpdateTimer > 1) {
			this.systemUpdateTimer--;
		}
		if (this.idleTimeout > 0) {
			this.idleTimeout--;
		}
		if (this.field1264 > 0) {
			this.field1264 -= 2;
		}
		for (int var2 = 0; var2 < 5 && this.readPacket(); var2++) {
		}
		if (!this.ingame) {
			return;
		}
		this.updateSceneState();
		this.updateLocChanges();
		this.updateAudio();
		Packet var3 = InputTracking.flush();
		if (var3 != null) {
			this.out.pIsaac(217);
			this.out.p2(var3.pos);
			this.out.pdata(var3.pos, 0, var3.data);
			var3.release();
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
				}
				if (this.selectedArea == 3) {
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
				}
				if (this.objDragArea == 3) {
					this.redrawChatback = true;
				}
				this.objDragArea = 0;
				if (this.objGrabThreshold && this.objDragCycles >= 5) {
					this.hoveredSlotInterfaceId = -1;
					this.handleInput();
					if (this.hoveredSlotInterfaceId == this.objDragInterfaceId && this.hoveredSlot != this.objDragSlot) {
						Component var4 = Component.types[this.objDragInterfaceId];
						byte var5 = 0;
						if (this.bankArrangeMode == 1 && var4.clientCode == 206) {
							var5 = 1;
						}
						if (var4.invSlotObjId[this.hoveredSlot] <= 0) {
							var5 = 0;
						}
						if (var5 == 1) {
							int var6 = this.objDragSlot;
							int var7 = this.hoveredSlot;
							while (var6 != var7) {
								if (var6 > var7) {
									var4.swapObj(var6, var6 - 1);
									var6--;
								} else if (var6 < var7) {
									var4.swapObj(var6, var6 + 1);
									var6++;
								}
							}
						} else {
							var4.swapObj(this.objDragSlot, this.hoveredSlot);
						}
						this.out.pIsaac(81);
						this.out.p2(this.objDragInterfaceId);
						this.out.p2(this.objDragSlot);
						this.out.p2(this.hoveredSlot);
						this.out.p1(var5);
					}
				} else if ((this.oneMouseButton == 1 || this.isAddFriendOption(this.menuSize - 1)) && this.menuSize > 2) {
					this.showContextMenu();
				} else if (this.menuSize > 0) {
					this.useMenuOption(this.menuSize - 1, 0);
				}
				this.selectedCycle = 10;
				super.mouseClickButton = 0;
			}
		}
		field1598++;
		if (field1598 > 127) {
			field1598 = 0;
			this.out.pIsaac(144);
			this.out.p3(4991788);
		}
		if (World3D.clickTileX != -1) {
			int var8 = World3D.clickTileX;
			int var9 = World3D.clickTileZ;
			boolean var10 = this.tryMove(0, localPlayer.routeTileZ[0], 0, 0, true, 0, var8, 0, var9, 0, localPlayer.routeTileX[0]);
			World3D.clickTileX = -1;
			if (var10) {
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
		for (int var11 = 0; var11 < 5; var11++) {
			int var10002 = this.cameraModifierCycle[var11]++;
		}
		this.handleInputKey();
		super.idleCycles++;
		if (super.idleCycles > 4500) {
			this.idleTimeout = 250;
			super.idleCycles -= 500;
			this.out.pIsaac(146);
		}
		this.cameraOffsetCycle++;
		if (this.cameraOffsetCycle > 500) {
			this.cameraOffsetCycle = 0;
			int var12 = (int) (Math.random() * 8.0D);
			if ((var12 & 0x1) == 1) {
				this.macroCameraOffsetX += this.cameraOffsetXModifier;
			}
			if ((var12 & 0x2) == 2) {
				this.macroCameraOffsetY += this.cameraYModifier;
			}
			if ((var12 & 0x4) == 4) {
				this.macroCameraOffsetZ += this.cameraYawModifier;
			}
		}
		if (this.macroCameraOffsetX < -50) {
			this.cameraOffsetXModifier = 2;
		}
		if (this.macroCameraOffsetX > 50) {
			this.cameraOffsetXModifier = -2;
		}
		if (this.macroCameraOffsetY < -55) {
			this.cameraYModifier = 2;
		}
		if (this.macroCameraOffsetY > 55) {
			this.cameraYModifier = -2;
		}
		if (this.macroCameraOffsetZ < -40) {
			this.cameraYawModifier = 1;
		}
		if (this.macroCameraOffsetZ > 40) {
			this.cameraYawModifier = -1;
		}
		this.minimapOffsetCycle++;
		if (this.minimapOffsetCycle > 500) {
			this.minimapOffsetCycle = 0;
			int var13 = (int) (Math.random() * 8.0D);
			if ((var13 & 0x1) == 1) {
				this.macroMinimapAngle += this.minimapAngleModifier;
			}
			if ((var13 & 0x2) == 2) {
				this.macroMinimapZoom += this.minimapZoomModifier;
			}
		}
		if (this.macroMinimapAngle < -60) {
			this.minimapAngleModifier = 2;
		}
		if (this.macroMinimapAngle > 60) {
			this.minimapAngleModifier = -2;
		}
		if (this.macroMinimapZoom < -20) {
			this.minimapZoomModifier = 1;
		}
		if (this.macroMinimapZoom > 10) {
			this.minimapZoomModifier = -1;
		}
		cyclelogic1++;
		if (cyclelogic1 > 110) {
			cyclelogic1 = 0;
			this.out.pIsaac(41);
			this.out.p4(0);
		}
		this.noTimeoutCycle++;
		if (this.noTimeoutCycle > 50) {
			this.out.pIsaac(107);
		}
		try {
			if (this.stream != null && this.out.pos > 0) {
				this.stream.write(this.out.pos, 0, this.out.data);
				this.out.pos = 0;
				this.noTimeoutCycle = 0;
			}
		} catch (IOException var15) {
			this.tryReconnect();
		} catch (Exception var16) {
			this.logout();
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void update() {
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

	@ObfuscatedName("client.c(IILmb;)V")
	public final void getPlayer(int arg1, Packet arg2) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		this.getPlayerLocal(arg1, arg2);
		this.getPlayerOldVis(arg1, arg2);
		this.getPlayerNewVis(arg2, arg1);
		this.getPlayerExtended(arg2, arg1);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var6 = this.entityRemovalIds[var4];
			if (loopCycle != this.players[var6].cycle) {
				this.players[var6] = null;
			}
		}
		if (arg2.pos != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.playerCount; var5++) {
			if (this.players[this.playerIds[var5]] == null) {
				signlink.reporterror(this.username + " null entry in pl list - pos:" + var5 + " size:" + this.playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void updateSceneState() {
		if (lowMemory && this.sceneState == 2 && World.levelBuilt != this.currentLevel) {
			this.areaViewport.bind();
			this.fontPlain12.drawStringCenter(257, 0, "Loading - please wait.", 151);
			this.fontPlain12.drawStringCenter(256, 16777215, "Loading - please wait.", 150);
			this.areaViewport.draw(super.graphics, 4, 4);
			this.sceneState = 1;
			this.sceneLoadStartTime = System.currentTimeMillis();
		}
		if (this.sceneState == 1) {
			int var2 = this.checkScene();
			if (var2 != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + var2 + "," + lowMemory + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
				this.sceneLoadStartTime = System.currentTimeMillis();
			}
		}
		if (this.sceneState == 2 && this.currentLevel != this.minimapLevel) {
			this.minimapLevel = this.currentLevel;
			this.createMinimap(this.currentLevel);
		}
	}

	@ObfuscatedName("client.P(I)I")
	public final int checkScene() {
		for (int var2 = 0; var2 < this.sceneMapLandData.length; var2++) {
			if (this.sceneMapLandData[var2] == null && this.sceneMapLandFile[var2] != -1) {
				return -1;
			}
			if (this.sceneMapLocData[var2] == null && this.sceneMapLocFile[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		for (int var4 = 0; var4 < this.sceneMapLandData.length; var4++) {
			byte[] var5 = this.sceneMapLocData[var4];
			if (var5 != null) {
				int var6 = (this.sceneMapIndex[var4] >> 8) * 64 - this.sceneBaseTileX;
				int var7 = (this.sceneMapIndex[var4] & 0xFF) * 64 - this.sceneBaseTileZ;
				var3 &= World.validateLocs(var6, var7, var5);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.awaitingSync) {
			return -4;
		} else {
			this.sceneState = 2;
			World.levelBuilt = this.currentLevel;
			this.buildScene();
			return 0;
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void handlePrivateChatInput() {
		if (this.splitPrivateChat == 0) {
			return;
		}
		int var2 = 0;
		if (this.systemUpdateTimer != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (this.messageText[var3] != null) {
				int var4 = this.messageType[var3];
				String var5 = this.messageSender[var3];
				boolean var6 = false;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					boolean var7 = true;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					boolean var8 = true;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var5))) {
					int var9 = 329 - var2 * 13;
					if (super.mouseX > 4 && super.mouseX < 516 && super.mouseY - 4 > var9 - 10 && super.mouseY - 4 <= var9 + 3) {
						if (this.staffmodlevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var5;
							this.menuAction[this.menuSize] = 2034;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var5;
						this.menuAction[this.menuSize] = 2436;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var5;
						this.menuAction[this.menuSize] = 2406;
						this.menuSize++;
					}
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if ((var4 == 5 || var4 == 6) && this.chatPrivateMode < 2) {
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBI)V")
	public final void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg5) {
		this.imageScrollbar0.draw(arg0, arg2);
		this.imageScrollbar1.draw(arg0, arg2 + arg5 - 16);
		Pix2D.fillRect(this.field1304, 16, arg5 - 32, arg0, arg2 + 16);
		int var7 = (arg5 - 32) * arg5 / arg1;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg5 - 32 - var7) * arg3 / (arg1 - arg5);
		Pix2D.fillRect(this.field1280, 16, var7, arg0, arg2 + 16 + var8);
		Pix2D.drawVerticalLine(arg0, this.field1535, arg2 + 16 + var8, var7);
		Pix2D.drawVerticalLine(arg0 + 1, this.field1535, arg2 + 16 + var8, var7);
		Pix2D.drawHorizontalLine(this.field1535, arg2 + 16 + var8, 16, arg0);
		Pix2D.drawHorizontalLine(this.field1535, arg2 + 17 + var8, 16, arg0);
		Pix2D.drawVerticalLine(arg0 + 15, this.field1276, arg2 + 16 + var8, var7);
		Pix2D.drawVerticalLine(arg0 + 14, this.field1276, arg2 + 17 + var8, var7 - 1);
		Pix2D.drawHorizontalLine(this.field1276, arg2 + 15 + var8 + var7, 16, arg0);
		Pix2D.drawHorizontalLine(this.field1276, arg2 + 14 + var8 + var7, 15, arg0 + 1);
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean saveWave(byte[] arg1, int arg2) {
		return arg1 == null ? true : signlink.wavesave(arg1, arg2);
	}

	@ObfuscatedName("client.a(IZLjb;I)V")
	public final void drawOnMinimap(int arg0, Pix32 arg2, int arg3) {
		int var5 = this.macroCameraOrbitYaw + this.macroMinimapAngle & 0x7FF;
		int var6 = arg0 * arg0 + arg3 * arg3;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.sinTable[var5];
		int var8 = Model.cosTable[var5];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var11 = arg0 * var10 + arg3 * var9 >> 16;
		int var12 = arg3 * var10 - arg0 * var9 >> 16;
		if (var6 > 2500) {
			arg2.drawMasked(this.imageMapback, false, var11 + 94 - arg2.width / 2 + 4, 83 - var12 - arg2.height / 2 - 4);
		} else {
			arg2.draw(var11 + 94 - arg2.width / 2 + 4, 83 - var12 - arg2.height / 2 - 4);
		}
	}

	@ObfuscatedName("client.a(IIIILbb;)V")
	public final void addPlayerOptions(int arg0, int arg1, int arg3, PlayerEntity arg4) {
		if (localPlayer == arg4 || this.menuSize >= 400) {
			return;
		}
		String var6 = arg4.name + getCombatLevelTag(arg4.combatLevel, localPlayer.combatLevel) + " (level-" + arg4.combatLevel + ")";
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + var6;
			this.menuAction[this.menuSize] = 367;
			this.menuParamA[this.menuSize] = arg0;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			this.menuOption[this.menuSize] = "Follow @whi@" + var6;
			this.menuAction[this.menuSize] = 1544;
			this.menuParamA[this.menuSize] = arg0;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
			if (this.overrideChat == 0) {
				this.menuOption[this.menuSize] = "Trade with @whi@" + var6;
				this.menuAction[this.menuSize] = 1373;
				this.menuParamA[this.menuSize] = arg0;
				this.menuParamB[this.menuSize] = arg1;
				this.menuParamC[this.menuSize] = arg3;
				this.menuSize++;
			}
			if (this.wildernessLevel > 0) {
				this.menuOption[this.menuSize] = "Attack @whi@" + var6;
				if (localPlayer.combatLevel >= arg4.combatLevel) {
					this.menuAction[this.menuSize] = 151;
				} else {
					this.menuAction[this.menuSize] = 2151;
				}
				this.menuParamA[this.menuSize] = arg0;
				this.menuParamB[this.menuSize] = arg1;
				this.menuParamC[this.menuSize] = arg3;
				this.menuSize++;
			}
			if (this.worldLocationState == 1) {
				this.menuOption[this.menuSize] = "Fight @whi@" + var6;
				this.menuAction[this.menuSize] = 151;
				this.menuParamA[this.menuSize] = arg0;
				this.menuParamB[this.menuSize] = arg1;
				this.menuParamC[this.menuSize] = arg3;
				this.menuSize++;
			}
			if (this.worldLocationState == 2) {
				this.menuOption[this.menuSize] = "Duel-with @whi@" + var6;
				this.menuAction[this.menuSize] = 1101;
				this.menuParamA[this.menuSize] = arg0;
				this.menuParamB[this.menuSize] = arg1;
				this.menuParamC[this.menuSize] = arg3;
				this.menuSize++;
			}
		} else if ((this.activeSpellFlags & 0x8) == 8) {
			this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + var6;
			this.menuAction[this.menuSize] = 651;
			this.menuParamA[this.menuSize] = arg0;
			this.menuParamB[this.menuSize] = arg1;
			this.menuParamC[this.menuSize] = arg3;
			this.menuSize++;
		}
		for (int var7 = 0; var7 < this.menuSize; var7++) {
			if (this.menuAction[var7] == 660) {
				this.menuOption[var7] = "Walk here @whi@" + var6;
				break;
			}
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void updateTextures(int arg0) {
		if (lowMemory) {
			return;
		}
		if (Pix3D.textureCycle[17] >= arg0) {
			Pix8 var3 = Pix3D.textures[17];
			int var4 = var3.cropBottom * var3.cropRight - 1;
			int var5 = this.sceneDelta * var3.cropRight * 2;
			byte[] var6 = var3.pixels;
			byte[] var7 = this.textureBuffer;
			for (int var8 = 0; var8 <= var4; var8++) {
				var7[var8] = var6[var8 - var5 & var4];
			}
			var3.pixels = var7;
			this.textureBuffer = var6;
			Pix3D.pushTexture(17);
		}
		if (Pix3D.textureCycle[24] < arg0) {
			return;
		}
		Pix8 var9 = Pix3D.textures[24];
		int var10 = var9.cropBottom * var9.cropRight - 1;
		int var11 = this.sceneDelta * var9.cropRight * 2;
		byte[] var12 = var9.pixels;
		byte[] var13 = this.textureBuffer;
		for (int var14 = 0; var14 <= var10; var14++) {
			var13[var14] = var12[var14 - var11 & var10];
		}
		var9.pixels = var13;
		this.textureBuffer = var12;
		Pix3D.pushTexture(24);
		return;
	}

	@ObfuscatedName("client.R(I)V")
	public final void runFlames() {
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

	@ObfuscatedName("client.m(Z)V")
	public final void updateFlames() {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var18 = (int) (Math.random() * 100.0D);
			if (var18 < 50) {
				this.flameBuffer2[(var2 - 2 << 7) + var3] = 255;
			}
		}
		for (int var4 = 0; var4 < 100; var4++) {
			int var15 = (int) (Math.random() * 124.0D) + 2;
			int var16 = (int) (Math.random() * 128.0D) + 128;
			int var17 = (var16 << 7) + var15;
			this.flameBuffer2[var17] = 192;
		}
		for (int var5 = 1; var5 < var2 - 1; var5++) {
			for (int var13 = 1; var13 < 127; var13++) {
				int var14 = (var5 << 7) + var13;
				this.imageFlamesLeft[var14] = (this.flameBuffer2[var14 - 1] + this.flameBuffer2[var14 + 1] + this.flameBuffer2[var14 - 128] + this.flameBuffer2[var14 + 128]) / 4;
			}
		}
		this.flameCycle0 += 128;
		if (this.flameCycle0 > this.flameBuffer0.length) {
			this.flameCycle0 -= this.flameBuffer0.length;
			int var6 = (int) (Math.random() * 12.0D);
			this.updateFlameBuffer(this.imageRunes[var6]);
		}
		for (int var7 = 1; var7 < var2 - 1; var7++) {
			for (int var10 = 1; var10 < 127; var10++) {
				int var11 = (var7 << 7) + var10;
				int var12 = this.imageFlamesLeft[var11 + 128] - this.flameBuffer0[this.flameCycle0 + var11 & this.flameBuffer0.length - 1] / 5;
				if (var12 < 0) {
					var12 = 0;
				}
				this.flameBuffer2[var11] = var12;
			}
		}
		for (int var8 = 0; var8 < var2 - 1; var8++) {
			this.flameLineOffset[var8] = this.flameLineOffset[var8 + 1];
		}
		this.flameLineOffset[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (this.flameGradientCycle0 > 0) {
			this.flameGradientCycle0 -= 4;
		}
		if (this.flameGradientCycle1 > 0) {
			this.flameGradientCycle1 -= 4;
		}
		if (this.flameGradientCycle0 != 0 || this.flameGradientCycle1 != 0) {
			return;
		}
		int var9 = (int) (Math.random() * 2000.0D);
		if (var9 == 0) {
			this.flameGradientCycle0 = 1024;
		}
		if (var9 == 1) {
			this.flameGradientCycle1 = 1024;
			return;
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean handleSocialMenuOption(Component arg1) {
		int var3 = arg1.clientCode;
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
			this.menuOption[this.menuSize] = "Remove @whi@" + arg1.text;
			this.menuAction[this.menuSize] = 556;
			this.menuSize++;
			return true;
		} else {
			return false;
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			levelExperience[var1] = var0 / 4;
		}
		DESIGN_HAIR_COLOUR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}
}
