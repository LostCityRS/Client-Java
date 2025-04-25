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
import jagex2.client.sign.SignLink;
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

public class Client extends GameShell {

	@ObfuscatedName("client.Pe")
	public static int nodeId = 10;

	@ObfuscatedName("client.Qe")
	public static int portOffset;

	@ObfuscatedName("client.Re")
	public static boolean membersWorld = true;

	@ObfuscatedName("client.Se")
	public static boolean lowMemory;

	@ObfuscatedName("client.Ti")
	public static boolean alreadyStarted;

	@ObfuscatedName("client.yi")
	public static int loopCycle;

	@ObfuscatedName("client.hj")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.Ci")
	public int systemUpdateTimer;

	@ObfuscatedName("client.ri")
	public int hintType;

	@ObfuscatedName("client.yc")
	public int hintNpc;

	@ObfuscatedName("client.gf")
	public int hintPlayer;

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

	@ObfuscatedName("client.ff")
	public int titleScreenState;

	@ObfuscatedName("client.Ef")
	public NpcEntity[] npcs = new NpcEntity[8192];

	@ObfuscatedName("client.Ff")
	public int npcCount;

	@ObfuscatedName("client.Gf")
	public int[] npcIds = new int[8192];

	@ObfuscatedName("client.vc")
	public ClientStream stream;

	@ObfuscatedName("client.Ve")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.jh")
	public Packet login = Packet.alloc(1);

	@ObfuscatedName("client.yg")
	public Packet in = Packet.alloc(1);

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

	@ObfuscatedName("client.xe")
	public int ptype0;

	@ObfuscatedName("client.ye")
	public int ptype1;

	@ObfuscatedName("client.ze")
	public int ptype2;

	@ObfuscatedName("client.Jd")
	public int sceneBaseTileX;

	@ObfuscatedName("client.Kd")
	public int sceneBaseTileZ;

	@ObfuscatedName("client.fc")
	public World3D scene;

	@ObfuscatedName("client.gd")
	public byte[][] sceneMapLocData;

	@ObfuscatedName("client.Cc")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("client.af")
	public int[][][] levelHeightmap;

	@ObfuscatedName("client.Qh")
	public CollisionMap[] levelCollisionMap = new CollisionMap[4];

	@ObfuscatedName("client.ad")
	public final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Gd")
	public int baseX;

	@ObfuscatedName("client.Hd")
	public int baseZ;

	@ObfuscatedName("client.Gh")
	public int tryMoveNearest;

	@ObfuscatedName("client.zg")
	public int macroCameraX;

	@ObfuscatedName("client.Ag")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.nc")
	public int macroCameraZ;

	@ObfuscatedName("client.oc")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.Ab")
	public int macroCameraAngle;

	@ObfuscatedName("client.Bb")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.Ae")
	public int macroCameraCycle;

	@ObfuscatedName("client.vh")
	public int macroMinimapAngle;

	@ObfuscatedName("client.wh")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.zd")
	public int macroMinimapZoom;

	@ObfuscatedName("client.Ad")
	public int minimapZoomModifier = 1;

	@ObfuscatedName("client.wg")
	public int macroMinimapCycle;

	@ObfuscatedName("client.Cg")
	public int sceneDelta;

	@ObfuscatedName("client.sg")
	public Pix32 imageCompass;

	@ObfuscatedName("client.Oh")
	public Pix32 imageMapedge;

	@ObfuscatedName("client.ki")
	public Pix8[] imageMapscene = new Pix8[50];

	@ObfuscatedName("client.ci")
	public Pix32[] imageMapfunction = new Pix32[50];

	@ObfuscatedName("client.ch")
	public Pix32[] imageHitmark = new Pix32[20];

	@ObfuscatedName("client.Ge")
	public Pix32[] imageHeadicon = new Pix32[20];

	@ObfuscatedName("client.ng")
	public Pix32 imageMapmarker0;

	@ObfuscatedName("client.og")
	public Pix32 imageMapmarker1;

	@ObfuscatedName("client.Ji")
	public Pix32[] imageCross = new Pix32[8];

	@ObfuscatedName("client.Fg")
	public Pix32 imageMapdot0;

	@ObfuscatedName("client.Gg")
	public Pix32 imageMapdot1;

	@ObfuscatedName("client.Hg")
	public Pix32 imageMapdot2;

	@ObfuscatedName("client.Ig")
	public Pix32 imageMapdot3;

	@ObfuscatedName("client.W")
	public Pix8 imageScrollbar0;

	@ObfuscatedName("client.X")
	public Pix8 imageScrollbar1;

	@ObfuscatedName("client.Bd")
	public Pix8[] imageModIcons = new Pix8[2];

	@ObfuscatedName("client.Mf")
	public Pix8 imageMapback;

	@ObfuscatedName("client.tf")
	public int[] comapssMaskLineOffsets = new int[33];

	@ObfuscatedName("client.Ri")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.Tg")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.gb")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Zc")
	public int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("client.Bc")
	public int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("client.xc")
	public int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("client.xh")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

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

	@ObfuscatedName("client.pg")
	public int orbitCameraX;

	@ObfuscatedName("client.qg")
	public int orbitCameraZ;

	@ObfuscatedName("client.Vh")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Yh")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.Wh")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Xh")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.zb")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Z")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.qi")
	public int sceneCycle;

	@ObfuscatedName("client.Pc")
	public int projectX = -1;

	@ObfuscatedName("client.Qc")
	public int projectY = -1;

	@ObfuscatedName("client.Ki")
	public int crossX;

	@ObfuscatedName("client.Li")
	public int crossY;

	@ObfuscatedName("client.Mi")
	public int crossCycle;

	@ObfuscatedName("client.Ni")
	public int crossMode;

	@ObfuscatedName("client.ic")
	public int objDragArea;

	@ObfuscatedName("client.jc")
	public int objGrabX;

	@ObfuscatedName("client.kc")
	public int objGrabY;

	@ObfuscatedName("client.hc")
	public int objDragSlot;

	@ObfuscatedName("client.Fb")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.de")
	public int overrideChat;

	@ObfuscatedName("client.Gc")
	public PlayerEntity[] players = new PlayerEntity[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Hc")
	public int playerCount;

	@ObfuscatedName("client.Ic")
	public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Jc")
	public int entityUpdateCount;

	@ObfuscatedName("client.Kc")
	public int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Lc")
	public Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.rd")
	public int entityRemovalCount;

	@ObfuscatedName("client.sd")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.ji")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.Bi")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.yf")
	public LinkList[][][] levelObjStacks = new LinkList[4][104][104];

	@ObfuscatedName("client.P")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.hh")
	public int[] skillLevel = new int[50];

	@ObfuscatedName("client.vb")
	public int[] skillBaseLevel = new int[50];

	@ObfuscatedName("client.Hb")
	public int[] skillExperience = new int[50];

	@ObfuscatedName("client.kh")
	public int oneMouseButton;

	@ObfuscatedName("client.Zd")
	public boolean menuVisible = false;

	@ObfuscatedName("client.ai")
	public int menuSize;

	@ObfuscatedName("client.ab")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.bb")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.cb")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.db")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Cd")
	public int chatEffects;

	@ObfuscatedName("client.Nh")
	public int bankArrangeMode;

	@ObfuscatedName("client.Gb")
	public int runenergy;

	@ObfuscatedName("client.Fe")
	public int runweight;

	@ObfuscatedName("client.ve")
	public int staffmodlevel;

	@ObfuscatedName("client.vf")
	public int[] messageType = new int[100];

	@ObfuscatedName("client.wf")
	public String[] messageSender = new String[100];

	@ObfuscatedName("client.xf")
	public String[] messageText = new String[100];

	@ObfuscatedName("client.eg")
	public int[] CHAT_COLOURS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.Ze")
	public int chatPublicMode;

	@ObfuscatedName("client.mi")
	public int chatPrivateMode;

	@ObfuscatedName("client.wc")
	public int chatTradeMode;

	@ObfuscatedName("client.mc")
	public int minimapLevel = -1;

	@ObfuscatedName("client.jb")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.kb")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.lb")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.Of")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.bg")
	public int flagSceneTileX;

	@ObfuscatedName("client.cg")
	public int flagSceneTileZ;

	@ObfuscatedName("client.ef")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.Dd")
	public int waveCount;

	@ObfuscatedName("client.lg")
	public boolean cutscene = false;

	@ObfuscatedName("client.Vd")
	public boolean[] cameraModifierEnabled = new boolean[5];

	@ObfuscatedName("client.Ac")
	public int[] cameraModifierJitter = new int[5];

	@ObfuscatedName("client.Pb")
	public int[] cameraModifierWobbleScale = new int[5];

	@ObfuscatedName("client.Kb")
	public int[] cameraModifierWobbleSpeed = new int[5];

	@ObfuscatedName("client.ec")
	public int[] cameraModifierCycle = new int[5];

	// ---- unsorted:

	@ObfuscatedName("client.zi")
	public int sceneCenterZoneX;

	@ObfuscatedName("client.Ai")
	public int sceneCenterZoneZ;

	@ObfuscatedName("client.eb")
	public int nextMusicDelay;

	@ObfuscatedName("client.hb")
	public long[] friendName37 = new long[200];

	@ObfuscatedName("client.ib")
	public static int field1209;

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

	@ObfuscatedName("client.ub")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.xb")
	public static String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yb")
	public int selectedTab = 3;

	@ObfuscatedName("client.ac")
	public int flashingTab = -1;

	@ObfuscatedName("client.bc")
	public int objDragCycles;

	@ObfuscatedName("client.cc")
	public int membersAccount;

	@ObfuscatedName("client.dc")
	public int socialAction;

	@ObfuscatedName("client.gc")
	public int objDragInterfaceId;

	@ObfuscatedName("client.lc")
	public int field1264;

	@ObfuscatedName("client.pc")
	public byte[][] sceneMapLandData;

	@ObfuscatedName("client.qc")
	public Pix32 imageFlamesLeft;

	@ObfuscatedName("client.L")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.R")
	public int reportAbuseInterfaceId = -1;

	@ObfuscatedName("client.V")
	public boolean updateDesignModel = false;

	@ObfuscatedName("client.Cb")
	public int viewportOverlayInterfaceId = -1;

	@ObfuscatedName("client.Db")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.Eb")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Jb")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Mb")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.Ob")
	public int[] messageIds = new int[100];

	@ObfuscatedName("client.Wb")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.Yb")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.Zb")
	public boolean field1252 = true;

	@ObfuscatedName("client.sc")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.uc")
	public int viewportInterfaceId = -1;

	@ObfuscatedName("client.zc")
	public int[] varps = new int[2000];

	@ObfuscatedName("client.Ec")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Fc")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Mc")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.td")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public CRC32 field1329 = new CRC32();

	@ObfuscatedName("client.Fd")
	public String chatbackInput = "";

	@ObfuscatedName("client.Id")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.Od")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.be")
	public boolean flameThread = false;

	@ObfuscatedName("client.ee")
	public boolean ingame = false;

	@ObfuscatedName("client.te")
	public boolean chatbackInputOpen = false;

	@ObfuscatedName("client.Be")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.Ne")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.Oe")
	public int localPid = -1;

	@ObfuscatedName("client.Df")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Qf")
	public boolean errorStarted = false;

	@ObfuscatedName("client.Pf")
	public String socialInput = "";

	@ObfuscatedName("client.Rf")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.Sf")
	public boolean flameActive = false;

	@ObfuscatedName("client.ag")
	public boolean midiActive = true;

	@ObfuscatedName("client.kg")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.mg")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.xg")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.Rg")
	public boolean errorHost = false;

	@ObfuscatedName("client.Vg")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Wg")
	public String loginMessage0 = "";

	@ObfuscatedName("client.Xg")
	public String loginMessage1 = "";

	@ObfuscatedName("client.Yg")
	public int[] varCache = new int[2000];

	@ObfuscatedName("client.Zg")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.ah")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.sh")
	public int lastWaveId = -1;

	@ObfuscatedName("client.Ah")
	public boolean field1538 = false;

	@ObfuscatedName("client.Ch")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.Sh")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.Th")
	public int[] designColours = new int[5];

	@ObfuscatedName("client.Zh")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.bi")
	public int stickyChatInterfaceId = -1;

	@ObfuscatedName("client.di")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.fi")
	public boolean midiFading = false;

	@ObfuscatedName("client.gi")
	public boolean designGender = true;

	@ObfuscatedName("client.ni")
	public String username = "";

	@ObfuscatedName("client.oi")
	public String password = "";

	@ObfuscatedName("client.pi")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Di")
	public Pix8[] imageSideicons = new Pix8[13];

	@ObfuscatedName("client.Gi")
	public String chatTyped = "";

	@ObfuscatedName("client.Hi")
	public int[] designKits = new int[7];

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

	@ObfuscatedName("client.M")
	public int worldLocationState;

	@ObfuscatedName("client.O")
	public int unreadMessageCount;

	@ObfuscatedName("client.T")
	public static int cyclelogic1;

	@ObfuscatedName("client.Lb")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.Vb")
	public int chatScrollOffset;

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

	@ObfuscatedName("client.xd")
	public int lastWaveLength;

	@ObfuscatedName("client.Ed")
	public int flameCycle0;

	@ObfuscatedName("client.Ld")
	public int mapLastBaseX;

	@ObfuscatedName("client.Md")
	public int mapLastBaseZ;

	@ObfuscatedName("client.Nd")
	public static int drawCycle;

	@ObfuscatedName("client.Pd")
	public int splitPrivateChat;

	@ObfuscatedName("client.ce")
	public int ignoreCount;

	@ObfuscatedName("client.Ce")
	public int flameCycle;

	@ObfuscatedName("client.Ue")
	public int field1403;

	@ObfuscatedName("client.bf")
	public int wildernessLevel;

	@ObfuscatedName("client.cf")
	public int privateMessageCount;

	@ObfuscatedName("client.hf")
	public int inMultizone;

	@ObfuscatedName("client.kf")
	public int friendCount;

	@ObfuscatedName("client.rf")
	public int warnMembersInNonMembers;

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

	@ObfuscatedName("client.tg")
	public int currentLevel;

	@ObfuscatedName("client.Bg")
	public int lastAddress;

	@ObfuscatedName("client.Eg")
	public int chatHoveredInterfaceId;

	@ObfuscatedName("client.Lg")
	public int objSelected;

	@ObfuscatedName("client.Mg")
	public int objSelectedSlot;

	@ObfuscatedName("client.Ng")
	public int objSelectedInterface;

	@ObfuscatedName("client.Og")
	public int objInterface;

	@ObfuscatedName("client.bh")
	public static int field1513;

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

	@ObfuscatedName("client.Dh")
	public int viewportHoveredInterfaceId;

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

	@ObfuscatedName("client.ei")
	public int midiSong;

	@ObfuscatedName("client.si")
	public int dragCycles;

	@ObfuscatedName("client.Ei")
	public int scrollInputPadding;

	@ObfuscatedName("client.Ii")
	public static int field1598;

	@ObfuscatedName("client.Ui")
	public static int field1610;

	@ObfuscatedName("client.bj")
	public int lastProgressPercent;

	@ObfuscatedName("client.cj")
	public int sidebarHoveredInterfaceId;

	@ObfuscatedName("client.lj")
	public int chatCount;

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
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.Bf")
	public Pix32 genderButtonImage0;

	@ObfuscatedName("client.Cf")
	public Pix32 genderButtonImage1;

	@ObfuscatedName("client.dg")
	public Pix32 imageMinimap;

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

	@ObfuscatedName("client.Y")
	public String modalMessage;

	@ObfuscatedName("client.fd")
	public String spellCaption;

	@ObfuscatedName("client.Pg")
	public String objSelectedName;

	@ObfuscatedName("client.ij")
	public String lastProgressMessage;

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
	public int[] flameBuffer3;

	@ObfuscatedName("client.ii")
	public int[] flameBuffer2;

	@ObfuscatedName("client.Qg")
	public Pix8[] imageRunes;

	// ----

	@ObfuscatedName("client.N")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.Si")
	public static BigInteger LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.we")
	public static final int[][] DESIGN_BODY_COLOUR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.qh")
	public static final int[] DESIGN_HAIR_COLOUR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.Ug")
	public static int oplogic1;

	@ObfuscatedName("client.Wi")
	public static int oplogic2;

	@ObfuscatedName("client.Qi")
	public static int oplogic3;

	@ObfuscatedName("client.Ph")
	public static int oplogic4;

	@ObfuscatedName("client.sb")
	public static int oplogic5;

	@ObfuscatedName("client.Eh")
	public static int oplogic6;

	@ObfuscatedName("client.gj")
	public static int oplogic7;

	@ObfuscatedName("client.De")
	public static int oplogic8;

	@ObfuscatedName("client.Uh")
	public static int oplogic9;

	@ObfuscatedName("client.mh")
	public static int oplogic10;

	@ObfuscatedName("client.vg")
	public static int[] levelExperience = new int[99];

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

	// note: placement confirmed by referencing OS1
	public static final void main(String[] args) {
		try {
			System.out.println("RS2 user client - release #" + 244);

			if (args.length == 5) {
				nodeId = Integer.parseInt(args[0]);
				portOffset = Integer.parseInt(args[1]);

				if (args[2].equals("lowmem")) {
					setLowMemory();
				} else if (args[2].equals("highmem")) {
					setHighMemory();
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

				SignLink.storeid = Integer.parseInt(args[4]);
				SignLink.startpriv(InetAddress.getLocalHost());

				Client app = new Client();
				app.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	public final void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));

		String lowmem = this.getParameter("lowmem");
		if (lowmem != null && lowmem.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}

		String free = this.getParameter("free");
		if (free != null && free.equals("1")) {
			membersWorld = false;
		} else {
			membersWorld = true;
		}

		this.initApplet(503, 765);
	}

	public final void run() {
		if (this.flamesThread) {
			this.runFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void setLowMemory() {
		World3D.lowMemory = true;
		Pix3D.lowMemory = true;
		lowMemory = true;
		World.lowMemory = true;
	}

	@ObfuscatedName("client.h(B)V")
	public static final void setHighMemory() {
		World3D.lowMemory = false;
		Pix3D.lowMemory = false;
		lowMemory = false;
		World.lowMemory = false;
	}

	// ----

	// note: placement confirmed by referencing OS1
	public final URL getCodeBase() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getCodeBase();
		}

		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception var1) {
		}

		return super.getCodeBase();
	}

	// note: placement confirmed by referencing OS1
	public final String getParameter(String name) {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getParameter(name);
		}

		return super.getParameter(name);
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String getHost() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp.getDocumentBase().getHost().toLowerCase();
		}

		if (super.frame != null) {
			return "runescape.com";
		}

		return super.getDocumentBase().getHost().toLowerCase();
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent() {
		if (SignLink.mainapp != null) {
			return SignLink.mainapp;
		}

		if (super.frame != null) {
			return super.frame;
		}

		return this;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream openUrl(String url) throws IOException {
		if (SignLink.mainapp != null) {
			return SignLink.openurl(url);
		}

		return new DataInputStream((new URL(this.getCodeBase(), url)).openStream());
	}

	@ObfuscatedName("client.C(I)Ljava/net/Socket;")
	public final Socket openSocket(int port) throws IOException {
		if (SignLink.mainapp != null) {
			return SignLink.opensocket(port);
		}

		return new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void startThread(Runnable thread, int priority) {
		if (priority > 10) {
			priority = 10;
		}

		if (SignLink.mainapp == null) {
			super.startThread(thread, priority);
		} else {
			SignLink.startthread(thread, priority);
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void saveMidi(boolean fade, byte[] src) {
		SignLink.midifade = fade ? 1 : 0;
		SignLink.midisave(src, src.length);
	}

	@ObfuscatedName("client.A(I)V")
	public final void stopMidi() {
		SignLink.midifade = 0;
		SignLink.midi = "stop";
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void setMidiVolume(int volume, boolean active) {
		SignLink.midivol = volume;
		if (active) {
			SignLink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean saveWave(byte[] src, int length) {
		if (src == null) {
			return true;
		}

		return SignLink.wavesave(src, length);
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean replayWave() {
		return SignLink.wavereplay();
	}

	@ObfuscatedName("client.c(II)V")
	public final void setWaveVolume(int volume) {
		SignLink.wavevol = volume;
	}

	// ----

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a()V")
	public final void load() {
		if (SignLink.sunjava) {
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

		if (SignLink.cache_dat != null) {
			for (int i = 0; i < 5; i++) {
				this.fileStreams[i] = new FileStream(i + 1, SignLink.cache_idx[i], SignLink.cache_dat, 500000);
			}
		}

		try {
			int retry = 5;

			this.jagChecksum[8] = 0;
			while (this.jagChecksum[8] == 0) {
				this.drawProgress(20, "Connecting to web server");

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
						this.drawProgress(10, "Error loading - Will retry in " + i + " secs.");

						try {
							Thread.sleep(1000L);
						} catch (Exception var75) {
						}
					}

					retry *= 2;
					if (retry > 60) {
						retry = 60;
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

			Jagfile jagConfig = this.getJagFile(this.jagChecksum[2], "config", 2, "config", 30);
			Jagfile jagInterface = this.getJagFile(this.jagChecksum[3], "interface", 3, "interface", 35);
			Jagfile jagMedia = this.getJagFile(this.jagChecksum[4], "media", 4, "2d graphics", 40);
			Jagfile jagTextures = this.getJagFile(this.jagChecksum[6], "textures", 6, "textures", 45);
			Jagfile jagWordenc = this.getJagFile(this.jagChecksum[7], "wordenc", 7, "chat system", 50);
			Jagfile jagSounds = this.getJagFile(this.jagChecksum[8], "sounds", 8, "sound effects", 55);

			this.levelTileFlags = new byte[4][104][104];
			this.levelHeightmap = new int[4][105][105];
			this.scene = new World3D(104, this.levelHeightmap, 104, 4);
			for (int i = 0; i < 4; i++) {
				this.levelCollisionMap[i] = new CollisionMap(104, 104);
			}
			this.imageMinimap = new Pix32(512, 512);

			Jagfile jagVersionList = this.getJagFile(this.jagChecksum[5], "versionlist", 5, "update list", 60);

			this.drawProgress(60, "Connecting to update server");

			this.onDemand = new OnDemand();
			this.onDemand.unpack(jagVersionList, this);

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

			int animCount = this.onDemand.getFileCount(1);
			for (int i = 0; i < animCount; i++) {
				this.onDemand.request(1, i);
			}

			while (this.onDemand.remaining() > 0) {
				int progress = animCount - this.onDemand.remaining();
				if (progress > 0) {
					this.drawProgress(65, "Loading animations - " + progress * 100 / animCount + "%");
				}

				this.updateOnDemand();

				try {
					Thread.sleep(100L);
				} catch (Exception var73) {
				}
			}

			this.drawProgress(70, "Requesting models");
			int modelCount = this.onDemand.getFileCount(0);
			for (int i = 0; i < modelCount; i++) {
				int flags = this.onDemand.getModelFlags(i);
				if ((flags & 0x1) != 0) {
					this.onDemand.request(0, i);
				}
			}

			int modelRemaining = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int progress = modelRemaining - this.onDemand.remaining();
				if (progress > 0) {
					this.drawProgress(70, "Loading models - " + progress * 100 / modelRemaining + "%");
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

				int mapCount = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int progress = mapCount - this.onDemand.remaining();
					if (progress > 0) {
						this.drawProgress(75, "Loading maps - " + progress * 100 / mapCount + "%");
					}

					this.updateOnDemand();

					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
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
					this.onDemand.prefetch(0, i, priority);
				}
			}

			this.onDemand.prefetchMaps(membersWorld);

			if (!lowMemory) {
				int midiCount = this.onDemand.getFileCount(2);
				for (int i = 1; i < midiCount; i++) {
					if (this.onDemand.shouldPrefetchMidi(i)) {
						this.onDemand.prefetch(2, i, (byte) 1);
					}
				}
			}

			this.drawProgress(80, "Unpacking media");

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
			this.imageMapedge.crop();

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
			this.imageRedstone1h.flipHorizontally();

			this.imageRedstone2h = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2h.flipHorizontally();

			this.imageRedstone1v = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone1v.flipVertically();

			this.imageRedstone2v = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2v.flipVertically();

			this.imageRedstone3v = new Pix8(jagMedia, "redstone3", 0);
			this.imageRedstone3v.flipVertically();

			this.imageRedstone1hv = new Pix8(jagMedia, "redstone1", 0);
			this.imageRedstone1hv.flipHorizontally();
			this.imageRedstone1hv.flipVertically();

			this.imageRedstone2hv = new Pix8(jagMedia, "redstone2", 0);
			this.imageRedstone2hv.flipHorizontally();
			this.imageRedstone2hv.flipVertically();

			for (int i = 0; i < 2; i++) {
				this.imageModIcons[i] = new Pix8(jagMedia, "mod_icons", i);
			}

			Pix32 backleft1 = new Pix32(jagMedia, "backleft1", 0);
			this.areaBackleft1 = new PixMap(this.getBaseComponent(), backleft1.cropBottom, backleft1.cropRight);
			backleft1.blitOpaque(0, 0);

			Pix32 backleft2 = new Pix32(jagMedia, "backleft2", 0);
			this.areaBackleft2 = new PixMap(this.getBaseComponent(), backleft2.cropBottom, backleft2.cropRight);
			backleft2.blitOpaque(0, 0);

			Pix32 backright1 = new Pix32(jagMedia, "backright1", 0);
			this.areaBackright1 = new PixMap(this.getBaseComponent(), backright1.cropBottom, backright1.cropRight);
			backright1.blitOpaque(0, 0);

			Pix32 backright2 = new Pix32(jagMedia, "backright2", 0);
			this.areaBackright2 = new PixMap(this.getBaseComponent(), backright2.cropBottom, backright2.cropRight);
			backright2.blitOpaque(0, 0);

			Pix32 backtop1 = new Pix32(jagMedia, "backtop1", 0);
			this.areaBacktop1 = new PixMap(this.getBaseComponent(), backtop1.cropBottom, backtop1.cropRight);
			backtop1.blitOpaque(0, 0);

			Pix32 backvmid1 = new Pix32(jagMedia, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(this.getBaseComponent(), backvmid1.cropBottom, backvmid1.cropRight);
			backvmid1.blitOpaque(0, 0);

			Pix32 backvmid2 = new Pix32(jagMedia, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(this.getBaseComponent(), backvmid2.cropBottom, backvmid2.cropRight);
			backvmid2.blitOpaque(0, 0);

			Pix32 backvmid3 = new Pix32(jagMedia, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(this.getBaseComponent(), backvmid3.cropBottom, backvmid3.cropRight);
			backvmid3.blitOpaque(0, 0);

			Pix32 backhmid2 = new Pix32(jagMedia, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(this.getBaseComponent(), backhmid2.cropBottom, backhmid2.cropRight);
			backhmid2.blitOpaque(0, 0);

			int var49 = (int) (Math.random() * 21.0D) - 10;
			int var50 = (int) (Math.random() * 21.0D) - 10;
			int var51 = (int) (Math.random() * 21.0D) - 10;
			int var52 = (int) (Math.random() * 41.0D) - 20;
			for (int i = 0; i < 50; i++) {
				if (this.imageMapfunction[i] != null) {
					this.imageMapfunction[i].translate(var49 + var52, var51 + var52, var50 + var52);
				}

				if (this.imageMapscene[i] != null) {
					this.imageMapscene[i].translate(var49 + var52, var51 + var52, var50 + var52);
				}
			}

			this.drawProgress(83, "Unpacking textures");

			Pix3D.unpackTextures(jagTextures);
			Pix3D.setBrightness(0.8D);
			Pix3D.initPool(20);

			this.drawProgress(86, "Unpacking config");

			SeqType.unpack(jagConfig);
			LocType.unpack(jagConfig);
			FloType.unpack(jagConfig);
			ObjType.unpack(jagConfig);
			NpcType.unpack(jagConfig);
			IdkType.unpack(jagConfig);
			SpotAnimType.unpack(jagConfig);
			VarpType.unpack(jagConfig);
			ObjType.membersWorld = membersWorld;

			if (!lowMemory) {
				this.drawProgress(90, "Unpacking sounds");

				byte[] dat = jagSounds.read("sounds.dat", null);
				Packet sounds = new Packet(dat);
				Wave.unpack(sounds);
			}

			this.drawProgress(95, "Unpacking interfaces");

			PixFont[] fonts = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8 };
			Component.unpack(jagInterface, jagMedia, fonts);

			this.drawProgress(100, "Preparing game engine");

			for (int y = 0; y < 33; y++) {
				int var58 = 999;
				int var59 = 0;

				for (int x = 0; x < 34; x++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * y + x] == 0) {
						if (var58 == 999) {
							var58 = x;
						}
					} else if (var58 != 999) {
						var59 = x;
						break;
					}
				}

				this.comapssMaskLineOffsets[y] = var58;
				this.compassMaskLineLengths[y] = var59 - var58;
			}

			for (int y = 5; y < 156; y++) {
				int var62 = 999;
				int var63 = 0;

				for (int x = 25; x < 172; x++) {
					if (this.imageMapback.pixels[this.imageMapback.cropRight * y + x] == 0 && (x > 34 || y > 34)) {
						if (var62 == 999) {
							var62 = x;
						}
					} else if (var62 != 999) {
						var63 = x;
						break;
					}
				}

				this.minimapMaskLineOffsets[y - 5] = var62 - 25;
				this.minimapMaskLineLengths[y - 5] = var63 - var62;
			}

			Pix3D.init3D(96, 479);
			this.areaChatbackOffset = Pix3D.lineOffset;

			Pix3D.init3D(261, 190);
			this.areaSidebarOffset = Pix3D.lineOffset;

			Pix3D.init3D(334, 512);
			this.areaViewportOffset = Pix3D.lineOffset;

			int[] var65 = new int[9];
			for (int i = 0; i < 9; i++) {
				int var67 = i * 32 + 128 + 15;
				int var68 = var67 * 3 + 600;
				int var69 = Pix3D.sinTable[var67];
				var65[i] = var68 * var69 >> 16;
			}
			World3D.init(800, 334, 500, 512, var65);

			WordFilter.unpack(jagWordenc);

			this.mouseTracking = new MouseTracking(this);
		} catch (Exception ignore) {
			SignLink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
			this.errorLoading = true;
		}
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.d(I)V")
	public final void unload() {
		SignLink.reporterror = false;

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

		this.levelObjStacks = null;
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
		PlayerEntity.modelCache = null;

		Pix3D.unload();
		World3D.unload();
		Model.unload();
		AnimFrame.unload();

		System.gc();
	}

	@ObfuscatedName("client.e(I)V")
	public final void refresh() {
		this.redrawFrame = true;
	}

	// ----

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void drawProgress(int percent, String message) {
		this.lastProgressPercent = percent;
		this.lastProgressMessage = message;

		this.loadTitle();
		if (this.jagTitle == null) {
			super.drawProgress(percent, message);
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
		Pix2D.fillRect(9179409, percent * 3, 30, var4 / 2 - 150, var7 + 2);
		Pix2D.fillRect(0, 300 - percent * 3, 30, percent * 3 + (var4 / 2 - 150), var7 + 2);
		this.fontBold12.drawStringCenter(var4 / 2, 16777215, message, var5 / 2 + 5 - var6);
		this.imageTitle4.draw(super.graphics, 171, 202);

		if (this.redrawFrame) {
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
	}

	@ObfuscatedName("client.l(B)V")
	public final void drawError() {
		Graphics g = this.getBaseComponent().getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, 765, 503);

		this.setFramerate(1);

		if (this.errorLoading) {
			this.flameActive = false;

			g.setFont(new Font("Helvetica", 1, 16));
			g.setColor(Color.yellow);
			byte var4 = 35;
			g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
			int var6 = var4 + 50;
			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, var6);
			int var7 = var6 + 50;
			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
			int var8 = var7 + 30;
			g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
			int var9 = var8 + 30;
			g.drawString("3: Try using a different game-world", 30, var9);
			int var11 = var9 + 30;
			g.drawString("4: Try rebooting your computer", 30, var11);
			int var13 = var11 + 30;
			g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
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
			byte var5 = 35;
			g.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
			int var10 = var5 + 50;
			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, var10);
			int var12 = var10 + 50;
			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
			int var14 = var12 + 30;
			g.drawString("2: Try rebooting your computer, and reloading", 30, var14);
			int var15 = var14 + 30;
		}
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
				if (!SignLink.reporterror) {
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String username, String arg1, boolean reconnect) {
		SignLink.errorname = username;

		try {
			if (!reconnect) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Connecting to server...";
				this.drawTitle();
			}

			this.stream = new ClientStream(this.openSocket(portOffset + 43594), this);

			long username37 = JString.toBase37(username);
			int loginServer = (int) (username37 >> 16 & 0x1FL);

			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(loginServer);

			this.stream.write(2, 0, this.out.data);
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
				this.out.p4(SignLink.uid);
				this.out.pjstr(username);
				this.out.pjstr(arg1);
				this.out.rsaenc(LOGIN_RSAE, LOGIN_RSAN);

				this.login.pos = 0;
				if (reconnect) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}

				this.login.p1(this.out.pos + 36 + 1 + 1);
				this.login.p1(244);
				this.login.p1(lowMemory ? 1 : 0);

				for (int i = 0; i < 9; i++) {
					this.login.p4(this.jagChecksum[i]);
				}

				this.login.pdata(this.out.pos, 0, this.out.data);
				this.out.random = new Isaac(seed);
				for (int i = 0; i < 4; i++) {
					seed[i] += 50;
				}
				this.randomIn = new Isaac(seed);
				this.stream.write(this.login.pos, 0, this.login.data);

				reply = this.stream.read();
			}

			if (reply == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception ignore) {
				}

				this.login(username, arg1, reconnect);
			} else if (reply == 2 || reply == 18 || reply == 19) {
				this.staffmodlevel = 0;
				if (reply == 18) {
					this.staffmodlevel = 1;
				} else if (reply == 19) {
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
				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new PlayerEntity();
				this.projectiles.clear();
				this.spotanims.clear();
				for (int level = 0; level < 4; level++) {
					for (int x = 0; x < 104; x++) {
						for (int z = 0; z < 104; z++) {
							this.levelObjStacks[level][x][z] = null;
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
		} catch (IOException ignore) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	// note: placement confirmed by referencing OS1
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
		for (int level = 0; level < 4; level++) {
			this.levelCollisionMap[level].reset();
		}
		System.gc();
		this.stopMidi();
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
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

		for (int i = 0; i < 5 && this.readPacket(); i++) {
		}

		if (this.ingame) {
			this.updateSceneState();
			this.updateLocChanges();
			this.updateAudio();

			Packet input = InputTracking.flush();
			if (input != null) {
				this.out.pIsaac(217);
				this.out.p2(input.pos);
				this.out.pdata(input.pos, 0, input.data);
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

			for (int i = 0; i < 5; i++) {
				int var10002 = this.cameraModifierCycle[i]++;
			}

			this.handleInputKey();

			super.idleCycles++;
			if (super.idleCycles > 4500) {
				this.idleTimeout = 250;
				super.idleCycles -= 500;
				this.out.pIsaac(146);
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
					this.macroMinimapZoom += this.minimapZoomModifier;
				}
			}

			if (this.macroMinimapAngle < -60) {
				this.macroMinimapAngleModifier = 2;
			} else if (this.macroMinimapAngle > 60) {
				this.macroMinimapAngleModifier = -2;
			}

			if (this.macroMinimapZoom < -20) {
				this.minimapZoomModifier = 1;
			} else if (this.macroMinimapZoom > 10) {
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
			} catch (IOException ignore) {
				this.tryReconnect();
			} catch (Exception ignore) {
				this.logout();
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
			int status = this.checkScene();
			if (status != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				SignLink.reporterror(this.username + " glcfb " + this.serverSeed + "," + status + "," + lowMemory + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
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
		for (int i = 0; i < this.sceneMapLandData.length; i++) {
			if (this.sceneMapLandData[i] == null && this.sceneMapLandFile[i] != -1) {
				return -1;
			}

			if (this.sceneMapLocData[i] == null && this.sceneMapLocFile[i] != -1) {
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
		}

		this.sceneState = 2;
		World.levelBuilt = this.currentLevel;
		this.buildScene();
		return 0;
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
		if (lowMemory && SignLink.cache_dat != null) {
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
		this.activeMapFunctionCount = 0;
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
						this.activeMapFunctions[this.activeMapFunctionCount] = this.imageMapfunction[var14];
						this.activeMapFunctionX[this.activeMapFunctionCount] = var15;
						this.activeMapFunctionZ[this.activeMapFunctionCount] = var16;
						this.activeMapFunctionCount++;
					}
				}
			}
		}
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
		}
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

		if (this.nextMusicDelay > 0) {
			this.nextMusicDelay -= 20;

			if (this.nextMusicDelay < 0) {
				this.nextMusicDelay = 0;
			}

			if (this.nextMusicDelay == 0 && this.midiActive && !lowMemory) {
				this.midiSong = this.nextMidiSong;
				this.midiFading = false;
				this.onDemand.request(2, this.midiSong);
			}
		}
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
		for (int var3 = 0; var3 < Model.pickedCount; var3++) {
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
					LinkList var19 = this.levelObjStacks[this.currentLevel][var5][var6];
					if (var19 != null) {
						for (ObjStackEntity var20 = (ObjStackEntity) var19.tail(); var20 != null; var20 = (ObjStackEntity) var19.prev()) {
							ObjType var21 = ObjType.get(var20.index);
							if (this.objSelected == 1) {
								this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var21.name;
								this.menuAction[this.menuSize] = 217;
								this.menuParamA[this.menuSize] = var20.index;
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
										this.menuParamA[this.menuSize] = var20.index;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									} else if (var22 == 2) {
										this.menuOption[this.menuSize] = "Take @lre@" + var21.name;
										this.menuAction[this.menuSize] = 99;
										this.menuParamA[this.menuSize] = var20.index;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									}
								}
								this.menuOption[this.menuSize] = "Examine @lre@" + var21.name;
								this.menuAction[this.menuSize] = 1102;
								this.menuParamA[this.menuSize] = var20.index;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if ((this.activeSpellFlags & 0x1) == 1) {
								this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var21.name;
								this.menuAction[this.menuSize] = 965;
								this.menuParamA[this.menuSize] = var20.index;
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
			} else if (this.menuArea == 1) {
				var3 -= 553;
				var4 -= 205;
			} else if (this.menuArea == 2) {
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

		if (var2 == 1) {
			int var5 = this.menuX;
			int var6 = this.menuY;
			int var7 = this.menuWidth;
			int var8 = super.mouseClickX;
			int var9 = super.mouseClickY;

			if (this.menuArea == 0) {
				var8 -= 4;
				var9 -= 4;
			} else if (this.menuArea == 1) {
				var8 -= 553;
				var9 -= 205;
			} else if (this.menuArea == 2) {
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
			} else if (this.menuArea == 2) {
				this.redrawChatback = true;
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.x(I)V")
	public final void handleMinimapInput() {
		if (super.mouseClickButton != 1) {
			return;
		}

		int x = super.mouseClickX - 25 - 550;
		int y = super.mouseClickY - 5 - 4;

		if (x < 0 || y < 0 || x >= 146 || y >= 151) {
			return;
		}

		x-= 73;
		y -= 75;

		int yaw = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int sinYaw = Pix3D.sinTable[yaw];
		int cosYaw = Pix3D.cosTable[yaw];

		sinYaw = (this.macroMinimapZoom + 256) * sinYaw >> 8;
		cosYaw = (this.macroMinimapZoom + 256) * cosYaw >> 8;

		int relX = x * cosYaw + y * sinYaw >> 11;
		int relY = y * cosYaw - x * sinYaw >> 11;

		int tileX = localPlayer.x + relX >> 7;
		int tileZ = localPlayer.z - relY >> 7;

		boolean success = this.tryMove(0, localPlayer.routeTileZ[0], 0, 1, true, 0, tileX, 0, tileZ, 0, localPlayer.routeTileX[0]);
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

	@ObfuscatedName("client.h(I)V")
	public final void handleTabInput() {
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

		field1513++;
		if (field1513 > 150) {
			field1513 = 0;
			this.out.pIsaac(46);
			this.out.p1(43);
		}
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
		} else if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPrivateMode = (this.chatPrivateMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatTradeMode = (this.chatTradeMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			this.out.pIsaac(98);
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

	// note: placement confirmed by referencing OS1
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

	@ObfuscatedName("client.F(I)V")
	public final void updateOrbitCamera() {
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

			this.orbitCameraYaw = this.orbitCameraYawVelocity / 2 + this.orbitCameraYaw & 0x7FF;
			this.orbitCameraPitch += this.orbitCameraPitchVelocity / 2;

			if (this.orbitCameraPitch < 128) {
				this.orbitCameraPitch = 128;
			}

			if (this.orbitCameraPitch > 383) {
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
		} catch (Exception ignore) {
			SignLink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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
			if (this.localPid == var6) {
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
		if (var12 != 0) {
			if (var12 < 32 || var12 > 2016) {
				arg0.yaw = arg0.dstYaw;
			} else if (var12 > 1024) {
				arg0.yaw -= 32;
			} else {
				arg0.yaw += 32;
			}

			arg0.yaw &= 0x7FF;

			if (arg0.secondarySeqId == arg0.seqStandId && arg0.dstYaw != arg0.yaw) {
				if (arg0.seqTurnId != -1) {
					arg0.secondarySeqId = arg0.seqTurnId;
				} else {
					arg0.secondarySeqId = arg0.seqWalkId;
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
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

	@ObfuscatedName("client.w(I)V")
	public final void loadTitleImages() {
		this.imageTitlebox = new Pix8(this.jagTitle, "titlebox", 0);
		this.imageTitlebutton = new Pix8(this.jagTitle, "titlebutton", 0);
		this.imageRunes = new Pix8[12];
		for (int var2 = 0; var2 < 12; var2++) {
			this.imageRunes[var2] = new Pix8(this.jagTitle, "runes", var2);
		}
		this.imageFlamesLeft = new Pix32(128, 265);
		this.imageFlamesRight = new Pix32(128, 265);
		for (int var3 = 0; var3 < 33920; var3++) {
			this.imageFlamesLeft.pixels[var3] = this.imageTitle0.data[var3];
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.imageFlamesRight.pixels[var4] = this.imageTitle1.data[var4];
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
		this.flameBuffer3 = new int[32768];
		this.flameBuffer2 = new int[32768];
		this.drawProgress(10, "Connecting to fileserver");
		if (!this.flameActive) {
			this.flamesThread = true;
			this.flameActive = true;
			this.startThread(this, 2);
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

		if (this.redrawFrame) {
			this.redrawFrame = false;
			this.imageTitle2.draw(super.graphics, 0, 128);
			this.imageTitle3.draw(super.graphics, 371, 202);
			this.imageTitle5.draw(super.graphics, 265, 0);
			this.imageTitle6.draw(super.graphics, 265, 562);
			this.imageTitle7.draw(super.graphics, 171, 128);
			this.imageTitle8.draw(super.graphics, 171, 562);
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

	@ObfuscatedName("client.b(Z)V")
	public final void drawScene() {
		this.sceneCycle++;
		this.pushNpcs(true);
		this.pushPlayers();
		this.pushNpcs(false);
		this.pushProjectiles();
		this.pushSpotanims();
		if (!this.cutscene) {
			int var2 = this.orbitCameraPitch;
			if (this.cameraPitchClamp / 256 > var2) {
				var2 = this.cameraPitchClamp / 256;
			}
			if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > var2) {
				var2 = this.cameraModifierWobbleScale[4] + 128;
			}
			int var3 = this.orbitCameraYaw + this.macroCameraAngle & 0x7FF;
			this.orbitCamera(var3, this.getHeightmapY(localPlayer.z, this.currentLevel, localPlayer.x) - 50, var2, this.orbitCameraZ, var2 * 3 + 600, this.orbitCameraX);
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
			if (this.cameraModifierEnabled[var11]) {
				int var13 = (int) (Math.random() * (double) (this.cameraModifierJitter[var11] * 2 + 1) - (double) this.cameraModifierJitter[var11] + Math.sin((double) this.cameraModifierWobbleSpeed[var11] / 100.0D * (double) this.cameraModifierCycle[var11]) * (double) this.cameraModifierWobbleScale[var11]);
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
		Model.pickedCount = 0;
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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
					if (this.localPid == var4) {
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

	// note: placement confirmed by referencing OS1
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

	@ObfuscatedName("client.I(I)I")
	public final int getTopLevelCutscene() {
		int var2 = this.getHeightmapY(this.cameraZ, this.currentLevel, this.cameraX);
		return var2 - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0 ? 3 : this.currentLevel;
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
					if (this.hintType == 1 && this.npcIds[var2 - this.playerCount] == this.hintNpc && loopCycle % 20 < 10) {
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
					if (var2 >= 0 && this.hintType == 10 && this.playerIds[var2] == this.hintPlayer) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.D(I)V")
	public final void drawTileHint() {
		if (this.hintType == 2) {
			this.projectFromGround((this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ, this.hintHeight * 2, (this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX);
			if (this.projectX > -1 && loopCycle % 20 < 10) {
				this.imageHeadicon[2].draw(this.projectX - 12, this.projectY - 28);
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IILz;)V")
	public final void projectFromGround(int arg1, PathingEntity arg2) {
		this.projectFromGround(arg2.z, arg1, arg2.x);
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

		if (Pix3D.textureCycle[24] >= arg0) {
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
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void draw3DEntityElements() {
		this.drawPrivateMessages();

		if (this.crossMode == 1) {
			this.imageCross[this.crossCycle / 100].draw(this.crossX - 8 - 4, this.crossY - 8 - 4);
		} else if (this.crossMode == 2) {
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

		if (this.systemUpdateTimer != 0) {
			int var6 = this.systemUpdateTimer / 50;
			int var7 = var6 / 60;
			int var8 = var6 % 60;
			if (var8 < 10) {
				this.fontPlain12.drawString("System update in: " + var7 + ":0" + var8, 16776960, 329, 4);
			} else {
				this.fontPlain12.drawString("System update in: " + var7 + ":" + var8, 16776960, 329, 4);
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

	@ObfuscatedName("client.c(B)V")
	public final void drawTooltip() {
		if (this.menuSize < 2 && this.objSelected == 0 && this.spellSelected == 0) {
			return;
		}

		String tooltip;
		if (this.objSelected == 1 && this.menuSize < 2) {
			tooltip = "Use " + this.objSelectedName + " with...";
		} else if (this.spellSelected == 1 && this.menuSize < 2) {
			tooltip = this.spellCaption + "...";
		} else {
			tooltip = this.menuOption[this.menuSize - 1];
		}

		if (this.menuSize > 2) {
			tooltip = tooltip + "@whi@ / " + (this.menuSize - 2) + " more options";
		}

		this.fontBold12.drawStringTooltip(true, loopCycle / 1000, 4, 15, 16777215, tooltip);
	}

	@ObfuscatedName("client.g(B)V")
	public final void drawMenu() {
		int x = this.menuX;
		int y = this.menuY;
		int w = this.menuWidth;
		int h = this.menuHeight;
		int background = 6116423;

		Pix2D.fillRect(background, w, h, x, y);
		Pix2D.fillRect(0, w - 2, 16, x + 1, y + 1);
		Pix2D.drawRect(h - 19, w - 2, 0, x + 1, y + 18);

		this.fontBold12.drawString("Choose Option", background, y + 14, x + 3);

		int mouseX = super.mouseX;
		int mouseY = super.mouseY;
		if (this.menuArea == 0) {
			mouseX -= 4;
			mouseY -= 4;
		} else if (this.menuArea == 1) {
			mouseX -= 553;
			mouseY -= 205;
		} else if (this.menuArea == 2) {
			mouseX -= 17;
			mouseY -= 357;
		}

		for (int i = 0; i < this.menuSize; i++) {
			int optionY = (this.menuSize - 1 - i) * 15 + y + 31;

			int rgb = 16777215;
			if (mouseX > x && mouseX < x + w && mouseY > optionY - 13 && mouseY < optionY + 3) {
				rgb = 16776960;
			}

			this.fontBold12.drawStringTaggable(rgb, x + 3, true, optionY, this.menuOption[i]);
		}
	}

	// note: placement confirmed by referencing OS1
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
		if (var31 != 0) {
			int var33 = var31 >> 14 & 0x7FFF;

			LocType var34 = LocType.get(var33);
			if (var34.mapscene != -1) {
				Pix8 var35 = this.imageMapscene[var34.mapscene];
				if (var35 != null) {
					int var36 = (var34.width * 4 - var35.cropRight) / 2;
					int var37 = (var34.length * 4 - var35.cropBottom) / 2;
					var35.draw(arg5 * 4 + 48 + var36, (104 - arg0 - var34.length) * 4 + 48 + var37);
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	@ObfuscatedName("client.J(I)Z")
	public final boolean readPacket() {
		if (this.stream == null) {
			return false;
		}

		try {
			int available = this.stream.available();
			if (available == 0) {
				return false;
			}

			if (this.ptype == -1) {
				this.stream.read(this.in.data, 0, 1);
				this.ptype = this.in.data[0] & 0xFF;
				if (this.randomIn != null) {
					this.ptype = this.ptype - this.randomIn.nextInt() & 0xFF;
				}
				this.psize = Protocol.CLIENTPROT_LENGTH[this.ptype];
				available--;
			}

			if (this.psize == -1) {
				if (available <= 0) {
					return false;
				}
				this.stream.read(this.in.data, 0, 1);
				this.psize = this.in.data[0] & 0xFF;
				available--;
			}

			if (this.psize == -2) {
				if (available <= 1) {
					return false;
				}
				this.stream.read(this.in.data, 0, 2);
				this.in.pos = 0;
				this.psize = this.in.g2();
				available -= 2;
			}

			if (available < this.psize) {
				return false;
			}

			this.in.pos = 0;
			this.stream.read(this.in.data, 0, this.psize);

			this.idleNetCycles = 0;
			this.ptype2 = this.ptype1;
			this.ptype1 = this.ptype0;
			this.ptype0 = this.ptype;

			if (this.ptype == 44) {
				// LAST_LOGIN_INFO
				this.lastAddress = this.in.g4();
				this.daysSinceLogin = this.in.g2();
				this.daysSinceRecoveriesChanged = this.in.g1();
				this.unreadMessageCount = this.in.g2();
				this.warnMembersInNonMembers = this.in.g1();

				if (this.lastAddress != 0 && this.viewportInterfaceId == -1) {
					SignLink.dnslookup(JString.formatIPv4(this.lastAddress));
					this.closeInterfaces();

					short clientCode = 650;
					if (this.daysSinceRecoveriesChanged != 201 || this.warnMembersInNonMembers == 1) {
						clientCode = 655;
					}

					this.reportAbuseInput = "";
					this.reportAbuseMuteOption = false;

					for (int i = 0; i < Component.types.length; i++) {
						if (Component.types[i] != null && Component.types[i].clientCode == clientCode) {
							this.viewportInterfaceId = Component.types[i].layer;
							break;
						}
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 72) {
				// UPDATE_INV_FULL
				this.redrawSidebar = true;

				int comId = this.in.g2();
				Component inv = Component.types[comId];
				int size = this.in.g1();

				for (int i = 0; i < size; i++) {
					inv.invSlotObjId[i] = this.in.g2();

					int count = this.in.g1();
					if (count == 255) {
						count = this.in.g4();
					}

					inv.invSlotObjCount[i] = count;
				}

				for (int i = size; i < inv.invSlotObjId.length; i++) {
					inv.invSlotObjId[i] = 0;
					inv.invSlotObjCount[i] = 0;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 164) {
				// IF_SETOBJECT
				int com = this.in.g2();
				int objId = this.in.g2();
				int zoom = this.in.g2();

				ObjType obj = ObjType.get(objId);
				Component.types[com].modelType = 4;
				Component.types[com].model = objId;
				Component.types[com].xan = obj.xan2d;
				Component.types[com].yan = obj.yan2d;
				Component.types[com].zoom = obj.zoom2d * 100 / zoom;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 207) {
				// IF_OPENMAIN_SIDE
				int main = this.in.g2();
				int side = this.in.g2();

				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}

				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}

				this.viewportInterfaceId = main;
				this.sidebarInterfaceId = side;
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
				// UPDATE_FRIENDLIST
				long username = this.in.g8();
				int world = this.in.g1();

				String displayName = JString.formatName(JString.fromBase37(username));
				for (int i = 0; i < this.friendCount; i++) {
					if (this.friendName37[i] == username) {
						if (this.friendWorld[i] != world) {
							this.friendWorld[i] = world;
							this.redrawSidebar = true;

							if (world > 0) {
								this.addMessage(displayName + " has logged in.", "", 5);
							} else if (world == 0) {
								this.addMessage(displayName + " has logged out.", "", 5);
							}
						}
						displayName = null;
						break;
					}
				}

				if (displayName != null && this.friendCount < 200) {
					this.friendName37[this.friendCount] = username;
					this.friendName[this.friendCount] = displayName;
					this.friendWorld[this.friendCount] = world;
					this.friendCount++;
					this.redrawSidebar = true;
				}

				boolean sorted = false;
				while (!sorted) {
					sorted = true;

					for (int i = 0; i < this.friendCount - 1; i++) {
						if (this.friendWorld[i] != nodeId && this.friendWorld[i + 1] == nodeId || this.friendWorld[i] == 0 && this.friendWorld[i + 1] != 0) {
							int oldWorld = this.friendWorld[i];
							this.friendWorld[i] = this.friendWorld[i + 1];
							this.friendWorld[i + 1] = oldWorld;

							String oldName = this.friendName[i];
							this.friendName[i] = this.friendName[i + 1];
							this.friendName[i + 1] = oldName;

							long oldName37 = this.friendName37[i];
							this.friendName37[i] = this.friendName37[i + 1];
							this.friendName37[i + 1] = oldName37;

							this.redrawSidebar = true;
							sorted = false;
						}
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 17) {
				// LOGOUT
				this.logout();
				this.ptype = -1;
				return false;
			}

			if (this.ptype == 50) {
				// CAM_SHAKE
				int type = this.in.g1();
				int jitter = this.in.g1();
				int wobbleScale = this.in.g1();
				int wobbleSpeed = this.in.g1();

				this.cameraModifierEnabled[type] = true;
				this.cameraModifierJitter[type] = jitter;
				this.cameraModifierWobbleScale[type] = wobbleScale;
				this.cameraModifierWobbleSpeed[type] = wobbleSpeed;
				this.cameraModifierCycle[type] = 0;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 22) {
				// ENABLE_TRACKING
				InputTracking.setEnabled();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 160) {
				// UPDATE_RUNWEIGHT
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}

				this.runweight = this.in.g2b();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 94) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 78) {
				// IF_SETCOLOUR
				int com = this.in.g2();
				int colour = this.in.g2();

				int r = colour >> 10 & 0x1F;
				int g = colour >> 5 & 0x1F;
				int b = colour & 0x1F;
				Component.types[com].colour = (b << 3) + (r << 19) + (g << 11);

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 152) {
				// P_COUNTDIALOG
				this.showSocialInput = false;
				this.chatbackInputOpen = true;
				this.chatbackInput = "";
				this.redrawChatback = true;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 53) {
				// CAM_RESET
				this.cutscene = false;
				for (int i = 0; i < 5; i++) {
					this.cameraModifierEnabled[i] = false;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 240) {
				// MIDI_SONG
				int id = this.in.g2();
				if (id == 65535) {
					id = -1;
				}

				if (this.nextMidiSong != id && this.midiActive && !lowMemory) {
					this.midiSong = id;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				}

				this.nextMidiSong = id;
				this.nextMusicDelay = 0;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 173) {
				// MIDI_JINGLE
				int id = this.in.g2();
				int delay = this.in.g2();

				if (this.midiActive && !lowMemory) {
					this.midiSong = id;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
					this.nextMusicDelay = delay;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 158) {
				// IF_OPENOVERLAY
				int com = this.in.g2b();
				this.viewportOverlayInterfaceId = com;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 9) {
				// CHAT_FILTER_SETTINGS
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
				// IF_SETPOSITION
				int comId = this.in.g2();
				int x = this.in.g2b();
				int y = this.in.g2b();

				Component com = Component.types[comId];
				com.x = x;
				com.y = y;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 226) {
				// VARP_LARGE
				int varp = this.in.g2();
				int value = this.in.g4();

				this.varCache[varp] = value;

				if (this.varps[varp] != value) {
					this.varps[varp] = value;
					this.updateVarp(varp);

					this.redrawSidebar = true;

					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 210) {
				// UPDATE_PID
				this.localPid = this.in.g2();
				this.membersAccount = this.in.g1();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 97) {
				// SET_MULTIWAY
				this.inMultizone = this.in.g1();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 85) {
				// UPDATE_REBOOT_TIMER
				this.systemUpdateTimer = this.in.g2() * 30;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 245) {
				// IF_SETMODEL
				int comId = this.in.g2();
				int model = this.in.g2();

				Component.types[comId].modelType = 1;
				Component.types[comId].model = model;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 151) {
				// SYNTH_SOUND
				int id = this.in.g2();
				int loop = this.in.g1();
				int delay = this.in.g2();

				if (this.waveEnabled && !lowMemory && this.waveCount < 50) {
					this.waveIds[this.waveCount] = id;
					this.waveLoops[this.waveCount] = loop;
					this.waveDelay[this.waveCount] = Wave.delays[id] + delay;
					this.waveCount++;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 87) {
				// RESET_CLIENT_VARCACHE
				for (int i = 0; i < this.varps.length; i++) {
					if (this.varCache[i] != this.varps[i]) {
						this.varps[i] = this.varCache[i];
						this.updateVarp(i);

						this.redrawSidebar = true;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 165) {
				// REBUILD_NORMAL
				int zoneX = this.in.g2();
				int zoneZ = this.in.g2();

				if (this.sceneCenterZoneX == zoneX && this.sceneCenterZoneZ == zoneZ && this.sceneState == 2) {
					this.ptype = -1;
					return true;
				}

				this.sceneCenterZoneX = zoneX;
				this.sceneCenterZoneZ = zoneZ;
				this.sceneBaseTileX = (this.sceneCenterZoneX - 6) * 8;
				this.sceneBaseTileZ = (this.sceneCenterZoneZ - 6) * 8;

				this.withinTutorialIsland = false;
				if ((this.sceneCenterZoneX / 8 == 48 || this.sceneCenterZoneX / 8 == 49) && this.sceneCenterZoneZ / 8 == 48) {
					this.withinTutorialIsland = true;
				} else if (this.sceneCenterZoneX / 8 == 48 && this.sceneCenterZoneZ / 8 == 148) {
					this.withinTutorialIsland = true;
				}

				this.sceneState = 1;
				this.sceneLoadStartTime = System.currentTimeMillis();

				this.areaViewport.bind();
				this.fontPlain12.drawStringCenter(257, 0, "Loading - please wait.", 151);
				this.fontPlain12.drawStringCenter(256, 16777215, "Loading - please wait.", 150);
				this.areaViewport.draw(super.graphics, 4, 4);

				int regions = 0;
				for (int x = (this.sceneCenterZoneX - 6) / 8; x <= (this.sceneCenterZoneX + 6) / 8; x++) {
					for (int z = (this.sceneCenterZoneZ - 6) / 8; z <= (this.sceneCenterZoneZ + 6) / 8; z++) {
						regions++;
					}
				}

				this.sceneMapLandData = new byte[regions][];
				this.sceneMapLocData = new byte[regions][];
				this.sceneMapIndex = new int[regions];
				this.sceneMapLandFile = new int[regions];
				this.sceneMapLocFile = new int[regions];

				int mapCount = 0;
				for (int x = (this.sceneCenterZoneX - 6) / 8; x <= (this.sceneCenterZoneX + 6) / 8; x++) {
					for (int z = (this.sceneCenterZoneZ - 6) / 8; z <= (this.sceneCenterZoneZ + 6) / 8; z++) {
						this.sceneMapIndex[mapCount] = (x << 8) + z;

						if (this.withinTutorialIsland && (z == 49 || z == 149 || z == 147 || x == 50 || x == 49 && z == 47)) {
							this.sceneMapLandFile[mapCount] = -1;
							this.sceneMapLocFile[mapCount] = -1;
							mapCount++;
						} else {
							int landFile = this.sceneMapLandFile[mapCount] = this.onDemand.getMapFile(z, x, 0);
							if (landFile != -1) {
								this.onDemand.request(3, landFile);
							}

							int locFile = this.sceneMapLocFile[mapCount] = this.onDemand.getMapFile(z, x, 1);
							if (locFile != -1) {
								this.onDemand.request(3, locFile);
							}

							mapCount++;
						}
					}
				}

				int dx = this.sceneBaseTileX - this.mapLastBaseX;
				int dz = this.sceneBaseTileZ - this.mapLastBaseZ;
				this.mapLastBaseX = this.sceneBaseTileX;
				this.mapLastBaseZ = this.sceneBaseTileZ;

				for (int i = 0; i < 8192; i++) {
					NpcEntity npc = this.npcs[i];

					if (npc != null) {
						for (int j = 0; j < 10; j++) {
							npc.routeTileX[j] -= dx;
							npc.routeTileZ[j] -= dz;
						}

						npc.x -= dx * 128;
						npc.z -= dz * 128;
					}
				}

				for (int i = 0; i < this.MAX_PLAYER_COUNT; i++) {
					PlayerEntity player = this.players[i];

					if (player != null) {
						for (int j = 0; j < 10; j++) {
							player.routeTileX[j] -= dx;
							player.routeTileZ[j] -= dz;
						}

						player.x -= dx * 128;
						player.z -= dz * 128;
					}
				}

				this.awaitingSync = true;

				byte startTileX = 0;
				byte endTileX = 104;
				byte dirX = 1;
				if (dx < 0) {
					startTileX = 103;
					endTileX = -1;
					dirX = -1;
				}

				byte startTileZ = 0;
				byte endTileZ = 104;
				byte dirZ = 1;
				if (dz < 0) {
					startTileZ = 103;
					endTileZ = -1;
					dirZ = -1;
				}

				for (int x = startTileX; x != endTileX; x += dirX) {
					for (int z = startTileZ; z != endTileZ; z += dirZ) {
						int lastX = dx + x;
						int lastZ = dz + z;

						for (int level = 0; level < 4; level++) {
							if (lastX >= 0 && lastZ >= 0 && lastX < 104 && lastZ < 104) {
								this.levelObjStacks[level][x][z] = this.levelObjStacks[level][lastX][lastZ];
							} else {
								this.levelObjStacks[level][x][z] = null;
							}
						}
					}
				}

				for (LocChange loc = (LocChange) this.locChanges.head(); loc != null; loc = (LocChange) this.locChanges.next()) {
					loc.localX -= dx;
					loc.localZ -= dz;

					if (loc.localX < 0 || loc.localZ < 0 || loc.localX >= 104 || loc.localZ >= 104) {
						loc.unlink();
					}
				}

				if (this.flagSceneTileX != 0) {
					this.flagSceneTileX -= dx;
					this.flagSceneTileZ -= dz;
				}

				this.cutscene = false;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 214) {
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

			if (this.ptype == 219) {
				// IF_SETANIM
				int comId = this.in.g2();
				int seqId = this.in.g2();
				Component.types[comId].anim = seqId;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 95) {
				// MESSAGE_GAME
				String message = this.in.gjstr();

				if (message.endsWith(":tradereq:")) {
					String player = message.substring(0, message.indexOf(":"));
					long username37 = JString.toBase37(player);

					boolean ignored = false;
					for (int i = 0; i < this.ignoreCount; i++) {
						if (this.ignoreName37[i] == username37) {
							ignored = true;
							break;
						}
					}

					if (!ignored && this.overrideChat == 0) {
						this.addMessage("wishes to trade with you.", player, 4);
					}
				} else if (message.endsWith(":duelreq:")) {
					String player = message.substring(0, message.indexOf(":"));
					long username37 = JString.toBase37(player);

					boolean ignored = false;
					for (int i = 0; i < this.ignoreCount; i++) {
						if (this.ignoreName37[i] == username37) {
							ignored = true;
							break;
						}
					}

					if (!ignored && this.overrideChat == 0) {
						this.addMessage("wishes to duel with you.", player, 8);
					}
				} else {
					this.addMessage(message, "", 0);
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 24) {
				// UPDATE_STAT
				this.redrawSidebar = true;

				int stat = this.in.g1();
				int xp = this.in.g4();
				int level = this.in.g1();

				this.skillExperience[stat] = xp;
				this.skillLevel[stat] = level;
				this.skillBaseLevel[stat] = 1;

				for (int i = 0; i < 98; i++) {
					if (xp >= levelExperience[i]) {
						this.skillBaseLevel[stat] = i + 2;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 60) {
				// FINISH_TRACKING
				Packet buf = InputTracking.stop();
				if (buf != null) {
					this.out.pIsaac(217);
					this.out.p2(buf.pos);
					this.out.pdata(buf.pos, 0, buf.data);
					buf.release();
				}

				this.ptype = -1;
				return true;
			}
			if (this.ptype == 242) {
				// RESET_ANIMS
				for (int i = 0; i < this.players.length; i++) {
					if (this.players[i] != null) {
						this.players[i].primarySeqId = -1;
					}
				}

				for (int i = 0; i < this.npcs.length; i++) {
					if (this.npcs[i] != null) {
						this.npcs[i].primarySeqId = -1;
					}
				}

				this.ptype = -1;
				return true;
			}
			if (this.ptype == 108) {
				// IF_SETPLAYERHEAD
				int comId = this.in.g2();
				Component.types[comId].modelType = 3;
				Component.types[comId].model = (localPlayer.appearances[8] << 6) + (localPlayer.appearances[0] << 12) + (localPlayer.colours[0] << 24) + (localPlayer.colours[4] << 18) + localPlayer.appearances[11];

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 86) {
				// PLAYER_INFO
				this.getPlayerPos(this.psize, this.in);
				this.awaitingSync = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 176) {
				// IF_OPENSIDE
				int comId = this.in.g2();
				this.resetInterfaceAnimation(comId);

				if (this.chatInterfaceId != -1) {
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}

				if (this.chatbackInputOpen) {
					this.chatbackInputOpen = false;
					this.redrawChatback = true;
				}

				this.sidebarInterfaceId = comId;
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 168) {
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

			if (this.ptype == 174) {
				// TUT_OPEN
				int comId = this.in.g2b();
				this.stickyChatInterfaceId = comId;
				this.redrawChatback = true;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 154) {
				// IF_SETTEXT
				int comId = this.in.g2();
				String text = this.in.gjstr();

				Component.types[comId].text = text;

				if (this.tabInterfaceId[this.selectedTab] == Component.types[comId].layer) {
					this.redrawSidebar = true;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 200) {
				// IF_SETTAB
				int comId = this.in.g2();
				int tab = this.in.g1();
				if (comId == 65535) {
					comId = -1;
				}

				this.tabInterfaceId[tab] = comId;
				this.redrawSidebar = true;
				this.redrawSideicons = true;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 56) {
				// IF_SETTAB_ACTIVE
				this.selectedTab = this.in.g1();
				this.redrawSidebar = true;
				this.redrawSideicons = true;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 129) {
				// IF_SETNPCHEAD
				int comId = this.in.g2();
				int npcId = this.in.g2();

				Component.types[comId].modelType = 2;
				Component.types[comId].model = npcId;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 222) {
				// CAM_LOOKAT
				this.cutscene = true;
				this.cutsceneDstLocalTileX = this.in.g1();
				this.cutsceneDstLocalTileZ = this.in.g1();
				this.cutsceneDstHeight = this.in.g2();
				this.cutsceneRotateSpeed = this.in.g1();
				this.cutsceneRotateAcceleration = this.in.g1();

				if (this.cutsceneRotateAcceleration >= 100) {
					int sceneX = this.cutsceneDstLocalTileX * 128 + 64;
					int sceneZ = this.cutsceneDstLocalTileZ * 128 + 64;
					int sceneY = this.getHeightmapY(sceneZ, this.currentLevel, sceneX) - this.cutsceneDstHeight;

					int dx = sceneX - this.cameraX;
					int dy = sceneY - this.cameraY;
					int dz = sceneZ - this.cameraZ;

					int distance = (int) Math.sqrt((double) (dx * dx + dz * dz));

					this.cameraPitch = (int) (Math.atan2((double) dy, (double) distance) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2((double) dx, (double) dz) * -325.949D) & 0x7FF;

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
				// UPDATE_RUNENERGY
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}

				this.runenergy = this.in.g1();

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 62) {
				// UNSET_MAP_FLAG
				this.flagSceneTileX = 0;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 162) {
				// UPDATE_INV_STOP_TRANSMIT
				int comId = this.in.g2();
				Component inv = Component.types[comId];

				for (int i = 0; i < inv.invSlotObjId.length; i++) {
					inv.invSlotObjId[i] = -1;
					inv.invSlotObjId[i] = 0;
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 49) {
				// HINT_ARROW
				this.hintType = this.in.g1();

				if (this.hintType == 1) {
					this.hintNpc = this.in.g2();
				} else if (this.hintType >= 2 && this.hintType <= 6) {
					if (this.hintType == 2) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 64;
					} else if (this.hintType == 3) {
						this.hintOffsetX = 0;
						this.hintOffsetZ = 64;
					} else if (this.hintType == 4) {
						this.hintOffsetX = 128;
						this.hintOffsetZ = 64;
					} else if (this.hintType == 5) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 0;
					} else if (this.hintType == 6) {
						this.hintOffsetX = 64;
						this.hintOffsetZ = 128;
					}

					this.hintType = 2;
					this.hintTileX = this.in.g2();
					this.hintTileZ = this.in.g2();
					this.hintHeight = this.in.g1();
				} else if (this.hintType == 10) {
					this.hintPlayer = this.in.g2();
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 10) {
				// IF_OPENMAIN
				int comId = this.in.g2();
				this.resetInterfaceAnimation(comId);

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

				this.viewportInterfaceId = comId;
				this.pressedContinueOption = false;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 189) {
				// IF_OPENCHAT
				int comId = this.in.g2();
				this.resetInterfaceAnimation(comId);

				if (this.sidebarInterfaceId != -1) {
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}

				this.chatInterfaceId = comId;
				this.redrawChatback = true;
				this.viewportInterfaceId = -1;
				this.pressedContinueOption = false;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 244) {
				// NPC_INFO
				this.getNpcPos(this.psize, this.in);

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 132) {
				// UPDATE_INV_PARTIAL
				this.redrawSidebar = true;

				int comId = this.in.g2();
				Component inv = Component.types[comId];

				while (this.in.pos < this.psize) {
					int slot = this.in.g1();
					int id = this.in.g2();

					int count = this.in.g1();
					if (count == 255) {
						count = this.in.g4();
					}

					if (slot >= 0 && slot < inv.invSlotObjId.length) {
						inv.invSlotObjId[slot] = id;
						inv.invSlotObjCount[slot] = count;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 12) {
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

			if (this.ptype == 233) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();

				while (this.in.pos < this.psize) {
					int ptype = this.in.g1();
					this.readZonePacket(ptype, this.in);
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 131) {
				// UPDATE_ZONE_FULL_FOLLOWS
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1();

				for (int x = this.baseX; x < this.baseX + 8; x++) {
					for (int z = this.baseZ; z < this.baseZ + 8; z++) {
						if (this.levelObjStacks[this.currentLevel][x][z] != null) {
							this.levelObjStacks[this.currentLevel][x][z] = null;
							this.sortObjStacks(x, z);
						}
					}
				}

				for (LocChange loc = (LocChange) this.locChanges.head(); loc != null; loc = (LocChange) this.locChanges.next()) {
					if (loc.localX >= this.baseX && loc.localX < this.baseX + 8 && loc.localZ >= this.baseZ && loc.localZ < this.baseZ + 8 && this.currentLevel == loc.level) {
						loc.duration = 0;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 30) {
				// MESSAGE_PRIVATE
				long from = this.in.g8();
				int messageId = this.in.g4();
				int staffModLevel = this.in.g1();

				boolean ignored = false;
				for (int i = 0; i < 100; i++) {
					if (this.messageIds[i] == messageId) {
						ignored = true;
						break;
					}
				}

				if (staffModLevel <= 1) {
					for (int i = 0; i < this.ignoreCount; i++) {
						if (this.ignoreName37[i] == from) {
							ignored = true;
							break;
						}
					}
				}

				if (!ignored && this.overrideChat == 0) {
					try {
						this.messageIds[this.privateMessageCount] = messageId;
						this.privateMessageCount = (this.privateMessageCount + 1) % 100;

						String uncompressed = WordPack.unpack(this.psize - 13, this.in);
						String filtered = WordFilter.filter(uncompressed);

						if (staffModLevel == 2 || staffModLevel == 3) {
							this.addMessage(filtered, "@cr2@" + JString.formatName(JString.fromBase37(from)), 7);
						} else if (staffModLevel == 1) {
							this.addMessage(filtered, "@cr1@" + JString.formatName(JString.fromBase37(from)), 7);
						} else {
							this.addMessage(filtered, JString.formatName(JString.fromBase37(from)), 3);
						}
					} catch (Exception ignore) {
						SignLink.reporterror("cde1");
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 123) {
				// IF_SETHIDE
				int com = this.in.g2();
				boolean hide = this.in.g1() == 1;
				Component.types[com].hide = hide;

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 236) {
				// VARP_SMALL
				int varp = this.in.g2();
				byte value = this.in.g1b();

				this.varCache[varp] = value;

				if (this.varps[varp] != value) {
					this.varps[varp] = value;
					this.updateVarp(varp);

					this.redrawSidebar = true;

					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}

				this.ptype = -1;
				return true;
			}

			if (this.ptype == 7) {
				// UPDATE_IGNORELIST
				this.ignoreCount = this.psize / 8;
				for (int i = 0; i < this.ignoreCount; i++) {
					this.ignoreName37[i] = this.in.g8();
				}

				this.ptype = -1;
				return true;
			}

			SignLink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
			this.logout();
		} catch (IOException ignore) {
			this.tryReconnect();
		} catch (Exception ignore) {
			String str = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (localPlayer.routeTileX[0] + this.sceneBaseTileX) + "," + (localPlayer.routeTileZ[0] + this.sceneBaseTileZ) + " - ";
			for (int i = 0; i < this.psize && i < 50; i++) {
				str = str + this.in.data[i] + ",";
			}
			SignLink.reporterror(str);

			this.logout();
		}
		return true;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(IILmb;)V")
	public final void readZonePacket(int ptype, Packet buf) {
		if (ptype == 232 || ptype == 125) {
			// LOC_ADD_CHANGE || LOC_DEL
			int var101 = buf.g1();
			int var102 = (var101 >> 4 & 0x7) + this.baseX;
			int var103 = (var101 & 0x7) + this.baseZ;
			int var104 = buf.g1();
			int var105 = var104 >> 2;
			int var106 = var104 & 0x3;
			int var107 = this.LOC_SHAPE_TO_LAYER[var105];
			int var108;
			if (ptype == 125) {
				var108 = -1;
			} else {
				var108 = buf.g2();
			}
			if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
				this.appendLoc(var102, var105, -1, var108, var106, var107, var103, this.currentLevel, 0);
			}
		} else if (ptype == 155) {
			// LOC_ANIM
			int var4 = buf.g1();
			int var5 = (var4 >> 4 & 0x7) + this.baseX;
			int var6 = (var4 & 0x7) + this.baseZ;
			int var7 = buf.g1();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = this.LOC_SHAPE_TO_LAYER[var8];
			int var11 = buf.g2();
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
		} else if (ptype == 234) {
			// OB_ADD
			int var21 = buf.g1();
			int var22 = (var21 >> 4 & 0x7) + this.baseX;
			int var23 = (var21 & 0x7) + this.baseZ;
			int var24 = buf.g2();
			int var25 = buf.g2();
			if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
				ObjStackEntity var26 = new ObjStackEntity();
				var26.index = var24;
				var26.count = var25;
				if (this.levelObjStacks[this.currentLevel][var22][var23] == null) {
					this.levelObjStacks[this.currentLevel][var22][var23] = new LinkList();
				}
				this.levelObjStacks[this.currentLevel][var22][var23].addTail(var26);
				this.sortObjStacks(var22, var23);
			}
		} else if (ptype == 39) {
			// OBJ_DEL
			int var27 = buf.g1();
			int var28 = (var27 >> 4 & 0x7) + this.baseX;
			int var29 = (var27 & 0x7) + this.baseZ;
			int var30 = buf.g2();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				LinkList var31 = this.levelObjStacks[this.currentLevel][var28][var29];
				if (var31 != null) {
					for (ObjStackEntity var32 = (ObjStackEntity) var31.head(); var32 != null; var32 = (ObjStackEntity) var31.next()) {
						if ((var30 & 0x7FFF) == var32.index) {
							var32.unlink();
							break;
						}
					}
					if (var31.head() == null) {
						this.levelObjStacks[this.currentLevel][var28][var29] = null;
					}
					this.sortObjStacks(var28, var29);
				}
			}
		} else if (ptype == 137) {
			// MAP_PROJANIM
			int var33 = buf.g1();
			int var34 = (var33 >> 4 & 0x7) + this.baseX;
			int var35 = (var33 & 0x7) + this.baseZ;
			int var36 = var34 + buf.g1b();
			int var37 = var35 + buf.g1b();
			int var38 = buf.g2b();
			int var39 = buf.g2();
			int var40 = buf.g1();
			int var41 = buf.g1();
			int var42 = buf.g2();
			int var43 = buf.g2();
			int var44 = buf.g1();
			int var45 = buf.g1();
			if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
				int var46 = var34 * 128 + 64;
				int var47 = var35 * 128 + 64;
				int var48 = var36 * 128 + 64;
				int var49 = var37 * 128 + 64;
				ProjectileEntity var50 = new ProjectileEntity(var46, var39, var44, var41, this.currentLevel, var47, this.getHeightmapY(var47, this.currentLevel, var46) - var40, var45, loopCycle + var42, var38, loopCycle + var43);
				var50.updateVelocity(var49, this.getHeightmapY(var49, this.currentLevel, var48) - var41, var48, loopCycle + var42);
				this.projectiles.addTail(var50);
			}
		} else if (ptype == 198) {
			// MAP_ANIM
			int var51 = buf.g1();
			int var52 = (var51 >> 4 & 0x7) + this.baseX;
			int var53 = (var51 & 0x7) + this.baseZ;
			int var54 = buf.g2();
			int var55 = buf.g1();
			int var56 = buf.g2();
			if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
				int var57 = var52 * 128 + 64;
				int var58 = var53 * 128 + 64;
				SpotAnimEntity var59 = new SpotAnimEntity(var58, var57, this.currentLevel, var54, this.getHeightmapY(var58, this.currentLevel, var57) - var55, loopCycle, var56);
				this.spotanims.addTail(var59);
			}
		} else if (ptype == 69) {
			// OBJ_REVEAL
			int var60 = buf.g1();
			int var61 = (var60 >> 4 & 0x7) + this.baseX;
			int var62 = (var60 & 0x7) + this.baseZ;
			int var63 = buf.g2();
			int var64 = buf.g2();
			int var65 = buf.g2();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.localPid != var65) {
				ObjStackEntity var66 = new ObjStackEntity();
				var66.index = var63;
				var66.count = var64;
				if (this.levelObjStacks[this.currentLevel][var61][var62] == null) {
					this.levelObjStacks[this.currentLevel][var61][var62] = new LinkList();
				}
				this.levelObjStacks[this.currentLevel][var61][var62].addTail(var66);
				this.sortObjStacks(var61, var62);
			}
		} else if (ptype == 29) {
			// LOC_MERGE
			int var67 = buf.g1();
			int var68 = (var67 >> 4 & 0x7) + this.baseX;
			int var69 = (var67 & 0x7) + this.baseZ;
			int var70 = buf.g1();
			int var71 = var70 >> 2;
			int var72 = var70 & 0x3;
			int var73 = this.LOC_SHAPE_TO_LAYER[var71];
			int var74 = buf.g2();
			int var75 = buf.g2();
			int var76 = buf.g2();
			int var77 = buf.g2();
			byte var78 = buf.g1b();
			byte var79 = buf.g1b();
			byte var80 = buf.g1b();
			byte var81 = buf.g1b();
			PlayerEntity var82;
			if (this.localPid == var77) {
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
		} else if (ptype == 209) {
			// OBJ_COUNT
			int var93 = buf.g1();
			int var94 = (var93 >> 4 & 0x7) + this.baseX;
			int var95 = (var93 & 0x7) + this.baseZ;
			int var96 = buf.g2();
			int var97 = buf.g2();
			int var98 = buf.g2();
			if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
				LinkList var99 = this.levelObjStacks[this.currentLevel][var94][var95];
				if (var99 != null) {
					for (ObjStackEntity var100 = (ObjStackEntity) var99.head(); var100 != null; var100 = (ObjStackEntity) var99.next()) {
						if ((var96 & 0x7FFF) == var100.index && var100.count == var97) {
							var100.count = var98;
							break;
						}
					}
					this.sortObjStacks(var94, var95);
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(BLob;)V")
	public final void storeLoc(LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.layer == 0) {
			var3 = this.scene.getWallTypecode(arg1.level, arg1.localX, arg1.localZ);
		} else if (arg1.layer == 1) {
			var3 = this.scene.getDecorTypecode(arg1.localZ, arg1.level, arg1.localX);
		} else if (arg1.layer == 2) {
			var3 = this.scene.getLocTypecode(arg1.level, arg1.localX, arg1.localZ);
		} else if (arg1.layer == 3) {
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

	// note: placement confirmed by referencing OS1
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
		} else if (arg7 == 1) {
			var9 = this.scene.getDecorTypecode(arg6, arg4, arg1);
		} else if (arg7 == 2) {
			var9 = this.scene.getLocTypecode(arg4, arg1, arg6);
		} else if (arg7 == 3) {
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
			} else if (arg7 == 1) {
				this.scene.removeDecor(arg6, arg1, arg4);
			} else if (arg7 == 2) {
				this.scene.removeLoc(arg1, arg6, arg4);
				LocType var18 = LocType.get(var14);
				if (var18.width + arg1 > 103 || var18.width + arg6 > 103 || var18.length + arg1 > 103 || var18.length + arg6 > 103) {
					return;
				}
				if (var18.blockwalk) {
					this.levelCollisionMap[arg4].delLoc(var18.width, arg6, arg1, var18.blockrange, var18.length, var16);
				}
			} else if (arg7 == 3) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.i(II)V")
	public final void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = this.levelObjStacks[this.currentLevel][arg0][arg1];
		if (var3 == null) {
			this.scene.removeGroundObj(this.currentLevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ObjStackEntity var5 = null;
		for (ObjStackEntity var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next()) {
			ObjType var11 = ObjType.get(var6.index);
			int var12 = var11.cost;
			if (var11.stackable) {
				var12 = (var6.count + 1) * var12;
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
			if (var5.index != var9.index && var7 == null) {
				var7 = var9;
			}
			if (var5.index != var9.index && var7.index != var9.index && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.scene.addGroundObject(var10, this.getHeightmapY(arg1 * 128 + 64, this.currentLevel, arg0 * 128 + 64), arg0, arg1, var8, var5, this.currentLevel, var7);
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.c(IILmb;)V")
	public final void getPlayerPos(int size, Packet buf) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;

		this.getPlayerLocal(size, buf);
		this.getPlayerOldVis(size, buf);
		this.getPlayerNewVis(buf, size);
		this.getPlayerExtended(buf, size);

		for (int i = 0; i < this.entityRemovalCount; i++) {
			int index = this.entityRemovalIds[i];
			if (loopCycle != this.players[index].cycle) {
				this.players[index] = null;
			}
		}

		if (buf.pos != size) {
			SignLink.reporterror("Error packet size mismatch in getplayer pos:" + buf.pos + " psize:" + size);
			throw new RuntimeException("eek");
		}

		for (int i = 0; i < this.playerCount; i++) {
			if (this.players[this.playerIds[i]] == null) {
				SignLink.reporterror(this.username + " null entry in pl list - pos:" + i + " size:" + this.playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ILmb;I)V")
	public final void getPlayerLocal(int size, Packet buf) {
		buf.bits();

		int info = buf.gBit(1);
		if (info == 0) {
			return;
		}

		int op = buf.gBit(2);
		if (op == 0) {
			this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
		} else if (op == 1) {
			int walkDir = buf.gBit(3);
			localPlayer.move(walkDir, false);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (op == 2) {
			int walkDir = buf.gBit(3);
			localPlayer.move(walkDir, true);

			int runDir = buf.gBit(3);
			localPlayer.move(runDir, true);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (op == 3) {
			this.currentLevel = buf.gBit(2);

			int localX = buf.gBit(7);
			int localZ = buf.gBit(7);
			int jump = buf.gBit(1);
			localPlayer.move(jump == 1, localX, localZ);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(ILmb;I)V")
	public final void getPlayerOldVis(int size, Packet buf) {
		int count = buf.gBit(8);

		if (count < this.playerCount) {
			for (int i = count; i < this.playerCount; i++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[i];
			}
		}

		if (count > this.playerCount) {
			SignLink.reporterror(this.username + " Too many players");
			throw new RuntimeException("eek");
		}

		this.playerCount = 0;

		for (int i = 0; i < count; i++) {
			int index = this.playerIds[i];
			PlayerEntity player = this.players[index];

			int info = buf.gBit(1);
			if (info == 0) {
				this.playerIds[this.playerCount++] = index;
				player.cycle = loopCycle;
			} else {
				int op = buf.gBit(2);
				if (op == 0) {
					this.playerIds[this.playerCount++] = index;
					player.cycle = loopCycle;

					this.entityUpdateIds[this.entityUpdateCount++] = index;
				} else if (op == 1) {
					this.playerIds[this.playerCount++] = index;
					player.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					player.move(walkDir, false);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 2) {
					this.playerIds[this.playerCount++] = index;
					player.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					player.move(walkDir, true);

					int runDir = buf.gBit(3);
					player.move(runDir, true);

					int var15 = buf.gBit(1);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = index;
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Lmb;II)V")
	public final void getPlayerNewVis(Packet buf, int size) {
		while (buf.bitPos + 10 < size * 8) {
			int index = buf.gBit(11);
			if (index == 2047) {
				break;
			}

			if (this.players[index] == null) {
				this.players[index] = new PlayerEntity();

				if (this.playerAppearanceBuffer[index] != null) {
					this.players[index].read(this.playerAppearanceBuffer[index]);
				}
			}

			this.playerIds[this.playerCount++] = index;
			PlayerEntity player = this.players[index];

			player.cycle = loopCycle;

			int dx = buf.gBit(5);
			if (dx > 15) {
				dx -= 32;
			}

			int dz = buf.gBit(5);
			if (dz > 15) {
				dz -= 32;
			}

			int jump = buf.gBit(1);
			player.move(jump == 1, localPlayer.routeTileX[0] + dx, localPlayer.routeTileZ[0] + dz);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = index;
			}
		}

		buf.bytes();
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void getPlayerExtended(Packet buf, int size) {
		for (int i = 0; i < this.entityUpdateCount; i++) {
			int index = this.entityUpdateIds[i];
			PlayerEntity player = this.players[index];

			int mask = buf.g1();
			if ((mask & 0x80) == 128) {
				mask += buf.g1() << 8;
			}

			this.getPlayerExtended(mask, buf, index, player);
		}
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void getPlayerExtended(int mask, Packet buf, int index, PlayerEntity player) {
		if ((mask & 0x1) == 1) {
			// APPEARANCE
			int length = buf.g1();
			byte[] data = new byte[length];
			Packet appearance = new Packet(data);
			buf.gdata(data, 0, length);
			this.playerAppearanceBuffer[index] = appearance;
			player.read(appearance);
		}

		if ((mask & 0x2) == 2) {
			// ANIM
			int seqId = buf.g2();
			if (seqId == 65535) {
				seqId = -1;
			}

			if (player.primarySeqId == seqId) {
				player.primarySeqLoop = 0;
			}

			int delay = buf.g1();
			if (player.primarySeqId == seqId && seqId != -1) {
				int replaceMode = SeqType.types[seqId].replacemode;

				if (replaceMode == 1) {
					player.primarySeqFrame = 0;
					player.primarySeqCycle = 0;
					player.primarySeqDelay = delay;
					player.primarySeqLoop = 0;
				} else if (replaceMode == 2) {
					player.primarySeqLoop = 0;
				}
			} else if (seqId == -1 || player.primarySeqId == -1 || SeqType.types[seqId].priority >= SeqType.types[player.primarySeqId].priority) {
				player.primarySeqId = seqId;
				player.primarySeqFrame = 0;
				player.primarySeqCycle = 0;
				player.primarySeqDelay = delay;
				player.primarySeqLoop = 0;
				player.seqPathLength = player.pathLength;
			}
		}

		if ((mask & 0x4) == 4) {
			// FACE_ENTITY
			player.targetId = buf.g2();
			if (player.targetId == 65535) {
				player.targetId = -1;
			}
		}

		if ((mask & 0x8) == 8) {
			// SAY
			player.chatMessage = buf.gjstr();
			player.chatColour = 0;
			player.chatEffect = 0;
			player.chatTimer = 150;
			this.addMessage(player.chatMessage, player.name, 2);
		}

		if ((mask & 0x10) == 16) {
			// DAMAGE
			int damage = buf.g1();
			int damageType = buf.g1();
			player.hit(damageType, damage);
			player.combatCycle = loopCycle + 300;
			player.health = buf.g1();
			player.totalHealth = buf.g1();
		}

		if ((mask & 0x20) == 32) {
			// FACE_COORD
			player.targetTileX = buf.g2();
			player.targetTileZ = buf.g2();
		}

		if ((mask & 0x40) == 64) {
			// CHAT
			int colourEffect = buf.g2();
			int type = buf.g1();
			int length = buf.g1();
			int start = buf.pos;

			if (player.name != null && player.visible) {
				long username37 = JString.toBase37(player.name);
				boolean ignored = false;

				if (type <= 1) {
					for (int i = 0; i < this.ignoreCount; i++) {
						if (this.ignoreName37[i] == username37) {
							ignored = true;
							break;
						}
					}
				}

				if (!ignored && this.overrideChat == 0) {
					try {
						String uncompressed = WordPack.unpack(length, buf);
						String filtered = WordFilter.filter(uncompressed);
						player.chatMessage = filtered;
						player.chatColour = colourEffect >> 8;
						player.chatEffect = colourEffect & 0xFF;
						player.chatTimer = 150;

						if (type == 2 || type == 3) {
							this.addMessage(filtered, "@cr2@" + player.name, 1);
						} else if (type == 1) {
							this.addMessage(filtered, "@cr1@" + player.name, 1);
						} else {
							this.addMessage(filtered, player.name, 2);
						}
					} catch (Exception ignore) {
						SignLink.reporterror("cde2");
					}
				}
			}

			buf.pos = length + start;
		}

		if ((mask & 0x100) == 256) {
			// SPOTANIM
			player.spotanimId = buf.g2();
			int heightDelay = buf.g4();
			player.spotanimHeight = heightDelay >> 16;
			player.spotanimLastCycle = (heightDelay & 0xFFFF) + loopCycle;
			player.spotanimFrame = 0;
			player.spotanimCycle = 0;
			if (player.spotanimLastCycle > loopCycle) {
				player.spotanimFrame = -1;
			}
			if (player.spotanimId == 65535) {
				player.spotanimId = -1;
			}
		}

		if ((mask & 0x200) == 512) {
			// EXACTMOVE
			player.forceMoveStartSceneTileX = buf.g1();
			player.forceMoveStartSceneTileZ = buf.g1();
			player.forceMoveEndSceneTileX = buf.g1();
			player.forceMoveEndSceneTileZ = buf.g1();
			player.forceMoveEndCycle = buf.g2() + loopCycle;
			player.forceMoveStartCycle = buf.g2() + loopCycle;
			player.forceMoveFaceDirection = buf.g1();
			player.resetPath();
		}

		if ((mask & 0x400) == 1024) {
			// DAMAGE_STACK
			int damage = buf.g1();
			int damageType = buf.g1();
			player.hit(damageType, damage);
			player.combatCycle = loopCycle + 300;
			player.health = buf.g1();
			player.totalHealth = buf.g1();
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IILmb;)V")
	public final void getNpcPos(int size, Packet buf) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;

		this.getNpcPosOldVis(buf, size);
		this.getNpcPosNewVis(size, buf);
		this.getNpcPosExtended(buf, size);

		for (int i = 0; i < this.entityRemovalCount; i++) {
			int id = this.entityRemovalIds[i];
			if (loopCycle != this.npcs[id].cycle) {
				this.npcs[id].type = null;
				this.npcs[id] = null;
			}
		}

		if (buf.pos != size) {
			SignLink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + buf.pos + " psize:" + size);
			throw new RuntimeException("eek");
		}

		for (int i = 0; i < this.npcCount; i++) {
			if (this.npcs[this.npcIds[i]] == null) {
				SignLink.reporterror(this.username + " null entry in npc list - pos:" + i + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void getNpcPosOldVis(Packet buf, int size) {
		buf.bits();

		int count = buf.gBit(8);
		if (count < this.npcCount) {
			for (int var5 = count; var5 < this.npcCount; var5++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var5];
			}
		}

		if (count > this.npcCount) {
			SignLink.reporterror(this.username + " Too many npcs");
			throw new RuntimeException("eek");
		}

		this.npcCount = 0;

		for (int i = 0; i < count; i++) {
			int index = this.npcIds[i];
			NpcEntity npc = this.npcs[index];

			int info = buf.gBit(1);
			if (info == 0) {
				this.npcIds[this.npcCount++] = index;
				npc.cycle = loopCycle;
			} else {
				int op = buf.gBit(2);

				if (op == 0) {
					this.npcIds[this.npcCount++] = index;
					npc.cycle = loopCycle;

					this.entityUpdateIds[this.entityUpdateCount++] = index;
				} else if (op == 1) {
					this.npcIds[this.npcCount++] = index;
					npc.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					npc.move(walkDir, false);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 2) {
					this.npcIds[this.npcCount++] = index;
					npc.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					npc.move(walkDir, true);

					int runDir = buf.gBit(3);
					npc.move(runDir, true);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = index;
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IZLmb;)V")
	public final void getNpcPosNewVis(int size, Packet buf) {
		while (buf.bitPos + 21 < size * 8) {
			int index = buf.gBit(13);
			if (index == 8191) {
				break;
			}

			if (this.npcs[index] == null) {
				this.npcs[index] = new NpcEntity();
			}

			NpcEntity npc = this.npcs[index];
			this.npcIds[this.npcCount++] = index;

			npc.cycle = loopCycle;
			npc.type = NpcType.get(buf.gBit(11));
			npc.size = npc.type.size;
			npc.seqWalkId = npc.type.walkanim;
			npc.seqTurnAroundId = npc.type.walkanim_b;
			npc.seqTurnLeftId = npc.type.walkanim_r;
			npc.seqTurnRightId = npc.type.walkanim_l;
			npc.seqStandId = npc.type.readyanim;

			int dx = buf.gBit(5);
			if (dx > 15) {
				dx -= 32;
			}

			int dz = buf.gBit(5);
			if (dz > 15) {
				dz -= 32;
			}

			npc.move(false, localPlayer.routeTileX[0] + dx, localPlayer.routeTileZ[0] + dz);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = index;
			}
		}

		buf.bytes();
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void getNpcPosExtended(Packet buf, int size) {
		for (int i = 0; i < this.entityUpdateCount; i++) {
			int id = this.entityUpdateIds[i];
			NpcEntity npc = this.npcs[id];

			int mask = buf.g1();

			if ((mask & 0x1) == 1) {
				// DAMAGE_STACK
				int damage = buf.g1();
				int damageType = buf.g1();
				npc.hit(damageType, damage);
				npc.combatCycle = loopCycle + 300;
				npc.health = buf.g1();
				npc.totalHealth = buf.g1();
			}

			if ((mask & 0x2) == 2) {
				// ANIM
				int seqId = buf.g2();
				if (seqId == 65535) {
					seqId = -1;
				}
				if (npc.primarySeqId == seqId) {
					npc.primarySeqLoop = 0;
				}

				int delay = buf.g1();

				if (npc.primarySeqId == seqId && seqId != -1) {
					int var13 = SeqType.types[seqId].replacemode;

					if (var13 == 1) {
						npc.primarySeqFrame = 0;
						npc.primarySeqCycle = 0;
						npc.primarySeqDelay = delay;
						npc.primarySeqLoop = 0;
					}
					if (var13 == 2) {
						npc.primarySeqLoop = 0;
					}
				} else if (seqId == -1 || npc.primarySeqId == -1 || SeqType.types[seqId].priority >= SeqType.types[npc.primarySeqId].priority) {
					npc.primarySeqId = seqId;
					npc.primarySeqFrame = 0;
					npc.primarySeqCycle = 0;
					npc.primarySeqDelay = delay;
					npc.primarySeqLoop = 0;
					npc.seqPathLength = npc.pathLength;
				}
			}

			if ((mask & 0x4) == 4) {
				// FACE_ENTITY
				npc.targetId = buf.g2();
				if (npc.targetId == 65535) {
					npc.targetId = -1;
				}
			}

			if ((mask & 0x8) == 8) {
				// SAY
				npc.chatMessage = buf.gjstr();
				npc.chatTimer = 100;
			}

			if ((mask & 0x10) == 16) {
				// DAMAGE
				int damage = buf.g1();
				int damageType = buf.g1();
				npc.hit(damageType, damage);
				npc.combatCycle = loopCycle + 300;
				npc.health = buf.g1();
				npc.totalHealth = buf.g1();
			}

			if ((mask & 0x20) == 32) {
				// CHANGETYPE
				npc.type = NpcType.get(buf.g2());
				npc.seqWalkId = npc.type.walkanim;
				npc.seqTurnAroundId = npc.type.walkanim_b;
				npc.seqTurnLeftId = npc.type.walkanim_r;
				npc.seqTurnRightId = npc.type.walkanim_l;
				npc.seqStandId = npc.type.readyanim;
			}

			if ((mask & 0x40) == 64) {
				// SPOTANIM
				npc.spotanimId = buf.g2();
				int var16 = buf.g4();
				npc.spotanimHeight = var16 >> 16;
				npc.spotanimLastCycle = (var16 & 0xFFFF) + loopCycle;
				npc.spotanimFrame = 0;
				npc.spotanimCycle = 0;
				if (npc.spotanimLastCycle > loopCycle) {
					npc.spotanimFrame = -1;
				}
				if (npc.spotanimId == 65535) {
					npc.spotanimId = -1;
				}
			}

			if ((mask & 0x80) == 128) {
				// FACE_COORD
				npc.targetTileX = buf.g2();
				npc.targetTileZ = buf.g2();
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.k(B)V")
	public final void showContextMenu() {
		int width = this.fontBold12.stringWidth("Choose Option");

		for (int i = 0; i < this.menuSize; i++) {
			int maxWidth = this.fontBold12.stringWidth(this.menuOption[i]);
			if (maxWidth > width) {
				width = maxWidth;
			}
		}

		width += 8;
		int height = this.menuSize * 15 + 21;

		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int x = super.mouseClickX - 4 - width / 2;
			if (width + x > 512) {
				x = 512 - width;
			} else if (x < 0) {
				x = 0;
			}

			int y = super.mouseClickY - 4;
			if (height + y > 334) {
				y = 334 - height;
			} else if (y < 0) {
				y = 0;
			}

			this.menuVisible = true;
			this.menuArea = 0;
			this.menuX = x;
			this.menuY = y;
			this.menuWidth = width;
			this.menuHeight = this.menuSize * 15 + 22;
		}

		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int x = super.mouseClickX - 553 - width / 2;
			if (x < 0) {
				x = 0;
			} else if (width + x > 190) {
				x = 190 - width;
			}

			int y = super.mouseClickY - 205;
			if (y < 0) {
				y = 0;
			} else if (height + y > 261) {
				y = 261 - height;
			}

			this.menuVisible = true;
			this.menuArea = 1;
			this.menuX = x;
			this.menuY = y;
			this.menuWidth = width;
			this.menuHeight = this.menuSize * 15 + 22;
		}

		if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
			int x = super.mouseClickX - 17 - width / 2;
			if (x < 0) {
				x = 0;
			} else if (width + x > 479) {
				x = 479 - width;
			}

			int y = super.mouseClickY - 357;
			if (y < 0) {
				y = 0;
			} else if (height + y > 96) {
				y = 96 - height;
			}

			this.menuVisible = true;
			this.menuArea = 2;
			this.menuX = x;
			this.menuY = y;
			this.menuWidth = width;
			this.menuHeight = this.menuSize * 15 + 22;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(IZ)Z")
	public final boolean isAddFriendOption(int option) {
		if (option < 0) {
			return false;
		}

		int action = this.menuAction[option];
		if (action >= 2000) {
			action -= 2000;
		}

		return action == 406;
	}

	// note: placement confirmed by referencing OS1
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
			oplogic6 += this.sceneBaseTileZ;
			if (oplogic6 >= 92) {
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
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
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
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
		}
		if (var5 == 450 && this.interactWithLoc(106, var3, var6, var4)) {
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
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
				oplogic1++;
			}
			if (oplogic1 >= 99) {
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
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
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
					oplogic5++;
				}
				if (oplogic5 >= 90) {
					this.out.pIsaac(7);
				}
				this.out.pIsaac(6);
			}
			if (var5 == 405) {
				oplogic3 += var6;
				if (oplogic3 >= 97) {
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
					oplogic7++;
				}
				if (oplogic7 >= 55) {
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
					oplogic9++;
				}
				if (oplogic9 >= 130) {
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
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
			}
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
						oplogic2++;
					}
					if (oplogic2 >= 124) {
						this.out.pIsaac(218);
						this.out.p4(0);
					}
					this.out.pIsaac(132);
				}
				if (var5 == 245) {
					if ((var6 & 0x3) == 0) {
						oplogic4++;
					}
					if (oplogic4 >= 85) {
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
					oplogic8++;
					if (oplogic8 >= 90) {
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

	// note: placement confirmed by referencing OS1
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
		}
	}

	// note: placement confirmed by referencing OS1
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

	// note: placement confirmed by referencing OS1
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

	@ObfuscatedName("client.a(IIIIBI)V")
	public final void drawScrollbar(int x, int scrollHeight, int y, int scrollY, int height) {
		this.imageScrollbar0.draw(x, y);
		this.imageScrollbar1.draw(x, y + height - 16);
		Pix2D.fillRect(this.SCROLLBAR_TRACK, 16, height - 32, x, y + 16);

		int gripSize = (height - 32) * height / scrollHeight;
		if (gripSize < 8) {
			gripSize = 8;
		}

		int gripY = (height - 32 - gripSize) * scrollY / (scrollHeight - height);

		Pix2D.fillRect(this.SCROLLBAR_GRIP_FOREGROUND, 16, gripSize, x, y + 16 + gripY);

		Pix2D.drawVerticalLine(x, this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, gripSize);
		Pix2D.drawVerticalLine(x + 1, this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, gripSize);

		Pix2D.drawHorizontalLine(this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, 16, x);
		Pix2D.drawHorizontalLine(this.SCROLLBAR_GRIP_HIGHLIGHT, y + 17 + gripY, 16, x);

		Pix2D.drawVerticalLine(x + 15, this.SCROLLBAR_GRIP_LOWLIGHT, y + 16 + gripY, gripSize);
		Pix2D.drawVerticalLine(x + 14, this.SCROLLBAR_GRIP_LOWLIGHT, y + 17 + gripY, gripSize - 1);

		Pix2D.drawHorizontalLine(this.SCROLLBAR_GRIP_LOWLIGHT, y + 15 + gripY + gripSize, 16, x);
		Pix2D.drawHorizontalLine(this.SCROLLBAR_GRIP_LOWLIGHT, y + 14 + gripY + gripSize, 15, x + 1);
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String formatObjCount(int amount) {
		if (amount < 100000) {
			return String.valueOf(amount);
		} else if (amount < 10000000) {
			return amount / 1000 + "K";
		} else {
			return amount / 1000000 + "M";
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String formatObjCountTagged(int amount) {
		String s = String.valueOf(amount);
		for (int var3 = s.length() - 3; var3 > 0; var3 -= 3) {
			s = s.substring(0, var3) + "," + s.substring(var3);
		}

		if (s.length() > 8) {
			s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
		} else if (s.length() > 4) {
			s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
		}

		return " " + s;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ld;IZIIIIII)V")
	public final void handleScrollInput(Component com, int top, boolean redraw, int mouseY, int height, int scrollHeight, int mouseX, int left) {
		if (this.scrollGrabbed) {
			this.scrollInputPadding = 32;
		} else {
			this.scrollInputPadding = 0;
		}

		this.scrollGrabbed = false;

		if (mouseX >= left && mouseX < left + 16 && mouseY >= top && mouseY < top + 16) {
			com.scrollPosition -= this.dragCycles * 4;

			if (redraw) {
				this.redrawSidebar = true;
			}
		} else if (mouseX >= left && mouseX < left + 16 && mouseY >= top + height - 16 && mouseY < top + height) {
			com.scrollPosition += this.dragCycles * 4;

			if (redraw) {
				this.redrawSidebar = true;
			}
		} else if (mouseX >= left - this.scrollInputPadding && mouseX < left + 16 + this.scrollInputPadding && mouseY >= top + 16 && mouseY < top + height - 16 && this.dragCycles > 0) {
			int gripSize = (height - 32) * height / scrollHeight;
			if (gripSize < 8) {
				gripSize = 8;
			}

			int gripY = mouseY - top - 16 - gripSize / 2;
			int maxY = height - 32 - gripSize;

			com.scrollPosition = (scrollHeight - height) * gripY / maxY;

			if (redraw) {
				this.redrawSidebar = true;
			}

			this.scrollGrabbed = true;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String getIntString(int amount) {
		if (amount < 999999999) {
			return String.valueOf(amount);
		} else {
			return "*";
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean executeInterfaceScript(Component com) {
		if (com.scriptComparator == null) {
			return false;
		}

		for (int i = 0; i < com.scriptComparator.length; i++) {
			int value = this.executeClientScript(com, i);
			int operand = com.scriptOperand[i];

			if (com.scriptComparator[i] == 2) {
				if (value >= operand) {
					return false;
				}
			} else if (com.scriptComparator[i] == 3) {
				if (value <= operand) {
					return false;
				}
			} else if (com.scriptComparator[i] == 4) {
				if (value == operand) {
					return false;
				}
			} else if (value != operand) {
				return false;
			}
		}

		return true;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ld;II)I")
	public final int executeClientScript(Component com, int scriptId) {
		if (com.scripts == null || scriptId >= com.scripts.length) {
			return -2;
		}

		try {
			int[] script = com.scripts[scriptId];
			int register = 0;
			int pc = 0;

			while (true) {
				int opcode = script[pc++];
				if (opcode == 0) {
					return register;
				}

				if (opcode == 1) {
					register += this.skillLevel[script[pc++]];
				} else if (opcode == 2) {
					register += this.skillBaseLevel[script[pc++]];
				} else if (opcode == 3) {
					register += this.skillExperience[script[pc++]];
				} else if (opcode == 4) {
					Component inv = Component.types[script[pc++]];
					int obj = script[pc++] + 1;

					for (int i = 0; i < inv.invSlotObjId.length; i++) {
						if (inv.invSlotObjId[i] == obj) {
							register += inv.invSlotObjCount[i];
						}
					}
				} else if (opcode == 5) {
					register += this.varps[script[pc++]];
				} else if (opcode == 6) {
					register += levelExperience[this.skillBaseLevel[script[pc++]] - 1];
				} else if (opcode == 7) {
					register += this.varps[script[pc++]] * 100 / 46875;
				} else if (opcode == 8) {
					register += localPlayer.combatLevel;
				} else if (opcode == 9) {
					for (int i = 0; i < 19; i++) {
						if (i == 18) {
							i = 20;
						}

						register += this.skillBaseLevel[i];
					}
				} else if (opcode == 10) {
					Component inv = Component.types[script[pc++]];
					int obj = script[pc++] + 1;

					for (int i = 0; i < inv.invSlotObjId.length; i++) {
						if (inv.invSlotObjId[i] == obj) {
							register += 999999999;
							break;
						}
					}
				} else if (opcode == 11) {
					register += this.runenergy;
				} else if (opcode == 12) {
					register += this.runweight;
				} else if (opcode == 13) {
					int varp = this.varps[script[pc++]];
					int lsb = script[pc++];

					register += (varp & 0x1 << lsb) == 0 ? 0 : 1;
				}
			}
		} catch (Exception ignore) {
			return -1;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIIILd;I)V")
	public final void handleInterfaceInput(int mouseX, int y, int mouseY, int x, Component com, int scrollY) {
		if (com.type != 0 || com.children == null || com.hide || (mouseX < x || mouseY < y || mouseX > com.width + x || mouseY > com.height + y)) {
			return;
		}

		int children = com.children.length;
		for (int i = 0; i < children; i++) {
			int childX = com.childX[i] + x;
			int childY = com.childY[i] + y - scrollY;
			Component child = Component.types[com.children[i]];

			childX += child.x;
			childY += child.y;

			if ((child.overlayer >= 0 || child.overColour != 0) && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				if (child.overlayer >= 0) {
					this.lastHoveredInterfaceId = child.overlayer;
				} else {
					this.lastHoveredInterfaceId = child.id;
				}
			}

			if (child.type == 0) {
				this.handleInterfaceInput(mouseX, childY, mouseY, childX, child, child.scrollPosition);

				if (child.scroll > child.height) {
					this.handleScrollInput(child, childY, true, mouseY, child.height, child.scroll, mouseX, child.width + childX);
				}
			} else if (child.buttonType == 1 && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				boolean override = false;
				if (child.clientCode != 0) {
					override = this.handleSocialMenuOption(child);
				}

				if (!override) {
					this.menuOption[this.menuSize] = child.option;
					this.menuAction[this.menuSize] = 951;
					this.menuParamC[this.menuSize] = child.id;
					this.menuSize++;
				}
			} else if (child.buttonType == 2 && this.spellSelected == 0 && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				String prefix = child.targetVerb;
				if (prefix.indexOf(" ") != -1) {
					prefix = prefix.substring(0, prefix.indexOf(" "));
				}

				this.menuOption[this.menuSize] = prefix + " @gre@" + child.targetText;
				this.menuAction[this.menuSize] = 930;
				this.menuParamC[this.menuSize] = child.id;
				this.menuSize++;
			} else if (child.buttonType == 3 && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				this.menuOption[this.menuSize] = "Close";
				this.menuAction[this.menuSize] = 947;
				this.menuParamC[this.menuSize] = child.id;
				this.menuSize++;
			} else if (child.buttonType == 4 && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				this.menuOption[this.menuSize] = child.option;
				this.menuAction[this.menuSize] = 465;
				this.menuParamC[this.menuSize] = child.id;
				this.menuSize++;
			} else if (child.buttonType == 5 && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				this.menuOption[this.menuSize] = child.option;
				this.menuAction[this.menuSize] = 960;
				this.menuParamC[this.menuSize] = child.id;
				this.menuSize++;
			} else if (child.buttonType == 6 && !this.pressedContinueOption && mouseX >= childX && mouseY >= childY && mouseX < child.width + childX && mouseY < child.height + childY) {
				this.menuOption[this.menuSize] = child.option;
				this.menuAction[this.menuSize] = 44;
				this.menuParamC[this.menuSize] = child.id;
				this.menuSize++;
			} else if (child.type == 2) {
				int slot = 0;

				for (int row = 0; row < child.height; row++) {
					for (int col = 0; col < child.width; col++) {
						int slotX = (child.marginX + 32) * col + childX;
						int slotY = (child.marginY + 32) * row + childY;

						if (slot < 20) {
							slotX += child.invSlotOffsetX[slot];
							slotY += child.invSlotOffsetY[slot];
						}

						if (mouseX < slotX || mouseY < slotY || mouseX >= slotX + 32 || mouseY >= slotY + 32) {
							slot++;
							continue;
						}

						this.hoveredSlot = slot;
						this.hoveredSlotInterfaceId = child.id;

						if (child.invSlotObjId[slot] <= 0) {
							slot++;
							continue;
						}

						ObjType obj = ObjType.get(child.invSlotObjId[slot] - 1);

						if (this.objSelected == 1 && child.interactable) {
							if (this.objSelectedInterface != child.id || this.objSelectedSlot != slot) {
								this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + obj.name;
								this.menuAction[this.menuSize] = 881;
								this.menuParamA[this.menuSize] = obj.id;
								this.menuParamB[this.menuSize] = slot;
								this.menuParamC[this.menuSize] = child.id;
								this.menuSize++;
							}
						} else if (this.spellSelected != 1 || !child.interactable) {
							if (child.interactable) {
								for (int op = 4; op >= 3; op--) {
									if (obj.iop != null && obj.iop[op] != null) {
										this.menuOption[this.menuSize] = obj.iop[op] + " @lre@" + obj.name;

										if (op == 3) {
											this.menuAction[this.menuSize] = 478;
										} else if (op == 4) {
											this.menuAction[this.menuSize] = 347;
										}

										this.menuParamA[this.menuSize] = obj.id;
										this.menuParamB[this.menuSize] = slot;
										this.menuParamC[this.menuSize] = child.id;
										this.menuSize++;
									} else if (op == 4) {
										this.menuOption[this.menuSize] = "Drop @lre@" + obj.name;
										this.menuAction[this.menuSize] = 347;
										this.menuParamA[this.menuSize] = obj.id;
										this.menuParamB[this.menuSize] = slot;
										this.menuParamC[this.menuSize] = child.id;
										this.menuSize++;
									}
								}
							}

							if (child.usable) {
								this.menuOption[this.menuSize] = "Use @lre@" + obj.name;
								this.menuAction[this.menuSize] = 188;
								this.menuParamA[this.menuSize] = obj.id;
								this.menuParamB[this.menuSize] = slot;
								this.menuParamC[this.menuSize] = child.id;
								this.menuSize++;
							}

							if (child.interactable && obj.iop != null) {
								for (int op = 2; op >= 0; op--) {
									if (obj.iop[op] != null) {
										this.menuOption[this.menuSize] = obj.iop[op] + " @lre@" + obj.name;

										if (op == 0) {
											this.menuAction[this.menuSize] = 405;
										} else if (op == 1) {
											this.menuAction[this.menuSize] = 38;
										} else if (op == 2) {
											this.menuAction[this.menuSize] = 422;
										}

										this.menuParamA[this.menuSize] = obj.id;
										this.menuParamB[this.menuSize] = slot;
										this.menuParamC[this.menuSize] = child.id;
										this.menuSize++;
									}
								}
							}

							if (child.iop != null) {
								for (int op = 4; op >= 0; op--) {
									if (child.iop[op] != null) {
										this.menuOption[this.menuSize] = child.iop[op] + " @lre@" + obj.name;

										if (op == 0) {
											this.menuAction[this.menuSize] = 602;
										} else if (op == 1) {
											this.menuAction[this.menuSize] = 596;
										} else if (op == 2) {
											this.menuAction[this.menuSize] = 22;
										} else if (op == 3) {
											this.menuAction[this.menuSize] = 892;
										} else if (op == 4) {
											this.menuAction[this.menuSize] = 415;
										}

										this.menuParamA[this.menuSize] = obj.id;
										this.menuParamB[this.menuSize] = slot;
										this.menuParamC[this.menuSize] = child.id;
										this.menuSize++;
									}
								}
							}

							this.menuOption[this.menuSize] = "Examine @lre@" + obj.name;
							this.menuAction[this.menuSize] = 1773;
							this.menuParamA[this.menuSize] = obj.id;
							this.menuParamC[this.menuSize] = child.invSlotObjCount[slot];
							this.menuSize++;
						} else if ((this.activeSpellFlags & 0x10) == 16) {
							this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + obj.name;
							this.menuAction[this.menuSize] = 391;
							this.menuParamA[this.menuSize] = obj.id;
							this.menuParamB[this.menuSize] = slot;
							this.menuParamC[this.menuSize] = child.id;
							this.menuSize++;
						}

						slot++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean handleSocialMenuOption(Component com) {
		int clientCode = com.clientCode;

		if (clientCode >= 1 && clientCode <= 200 || !(clientCode < 701 || clientCode > 900)) {
			if (clientCode >= 801) {
				clientCode -= 701;
			} else if (clientCode >= 701) {
				clientCode -= 601;
			} else if (clientCode >= 101) {
				clientCode -= 101;
			} else {
				clientCode--;
			}

			this.menuOption[this.menuSize] = "Remove @whi@" + this.friendName[clientCode];
			this.menuAction[this.menuSize] = 557;
			this.menuSize++;

			this.menuOption[this.menuSize] = "Message @whi@" + this.friendName[clientCode];
			this.menuAction[this.menuSize] = 679;
			this.menuSize++;
			return true;
		} else if (clientCode >= 401 && clientCode <= 500) {
			this.menuOption[this.menuSize] = "Remove @whi@" + com.text;
			this.menuAction[this.menuSize] = 556;
			this.menuSize++;
			return true;
		} else {
			return false;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.d(II)V")
	public final void resetInterfaceAnimation(int id) {
		Component com = Component.types[id];

		for (int i = 0; i < com.children.length && com.children[i] != -1; i++) {
			Component child = Component.types[com.children[i]];

			if (child.type == 1) {
				this.resetInterfaceAnimation(child.id);
			}

			child.seqFrame = 0;
			child.seqCycle = 0;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.c(III)Z")
	public final boolean updateInterfaceAnimation(int delta, int arg2) {
		boolean updated = false;
		Component com = Component.types[arg2];

		for (int i = 0; i < com.children.length && com.children[i] != -1; i++) {
			Component child = Component.types[com.children[i]];

			if (child.type == 1) {
				updated |= this.updateInterfaceAnimation(delta, child.id);
			}

			if (child.type == 6 && (child.anim != -1 || child.activeAnim != -1)) {
				boolean active = this.executeInterfaceScript(child);

				int seqId;
				if (active) {
					seqId = child.activeAnim;
				} else {
					seqId = child.anim;
				}

				if (seqId != -1) {
					SeqType seq = SeqType.types[seqId];
					child.seqCycle += delta;

					while (child.seqCycle > seq.getFrameDuration(child.seqFrame)) {
						child.seqCycle -= seq.getFrameDuration(child.seqFrame) + 1;
						child.seqFrame++;

						if (child.seqFrame >= seq.frameCount) {
							child.seqFrame -= seq.replayoff;

							if (child.seqFrame < 0 || child.seqFrame >= seq.frameCount) {
								child.seqFrame = 0;
							}
						}

						updated = true;
					}
				}
			}
		}

		return updated;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.e(II)V")
	public final void updateVarp(int varp) {
		int clientCode = VarpType.types[varp].clientcode;
		if (clientCode == 0) {
			return;
		}

		int value = this.varps[varp];
		if (clientCode == 1) {
			if (value == 1) {
				Pix3D.setBrightness(0.9D);
			} else if (value == 2) {
				Pix3D.setBrightness(0.8D);
			} else if (value == 3) {
				Pix3D.setBrightness(0.7D);
			} else if (value == 4) {
				Pix3D.setBrightness(0.6D);
			}

			ObjType.iconCache.clear();
			this.redrawFrame = true;
		} else if (clientCode == 3) {
			boolean lastMidiActive = this.midiActive;

			if (value == 0) {
				this.setMidiVolume(0, this.midiActive);
				this.midiActive = true;
			} else if (value == 1) {
				this.setMidiVolume(-400, this.midiActive);
				this.midiActive = true;
			} else if (value == 2) {
				this.setMidiVolume(-800, this.midiActive);
				this.midiActive = true;
			} else if (value == 3) {
				this.setMidiVolume(-1200, this.midiActive);
				this.midiActive = true;
			} else if (value == 4) {
				this.midiActive = false;
			}

			if (this.midiActive != lastMidiActive && !lowMemory) {
				if (this.midiActive) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
				} else {
					this.stopMidi();
				}

				this.nextMusicDelay = 0;
			}
		} else if (clientCode == 4) {
			if (value == 0) {
				this.waveEnabled = true;
				this.setWaveVolume(0);
			} else if (value == 1) {
				this.waveEnabled = true;
				this.setWaveVolume(-400);
			} else if (value == 2) {
				this.waveEnabled = true;
				this.setWaveVolume(-800);
			} else if (value == 3) {
				this.waveEnabled = true;
				this.setWaveVolume(-1200);
			} else if (value == 4) {
				this.waveEnabled = false;
			}
		} else if (clientCode == 5) {
			this.oneMouseButton = value;
		} else if (clientCode == 6) {
			this.chatEffects = value;
		} else if (clientCode == 8) {
			this.splitPrivateChat = value;
			this.redrawChatback = true;
		} else if (clientCode == 9) {
			this.bankArrangeMode = value;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ld;B)V")
	public final void updateInterfaceContent(Component com) {
		int clientCode = com.clientCode;

		if (clientCode >= 1 && clientCode <= 100 || !(clientCode < 701 || clientCode > 800)) {
			if (clientCode > 700) {
				clientCode -= 601;
			} else {
				clientCode--;
			}

			if (clientCode >= this.friendCount) {
				com.text = "";
				com.buttonType = 0;
			} else {
				com.text = this.friendName[clientCode];
				com.buttonType = 1;
			}
		} else if (clientCode >= 101 && clientCode <= 200 || !(clientCode < 801 || clientCode > 900)) {
			if (clientCode > 800) {
				clientCode -= 701;
			} else {
				clientCode -= 101;
			}

			if (clientCode >= this.friendCount) {
				com.text = "";
				com.buttonType = 0;
			} else {
				if (this.friendWorld[clientCode] == 0) {
					com.text = "@red@Offline";
				} else if (this.friendWorld[clientCode] == nodeId) {
					com.text = "@gre@World-" + (this.friendWorld[clientCode] - 9);
				} else {
					com.text = "@yel@World-" + (this.friendWorld[clientCode] - 9);
				}

				com.buttonType = 1;
			}
		} else if (clientCode == 203) {
			com.scroll = this.friendCount * 15 + 20;

			if (com.scroll <= com.height) {
				com.scroll = com.height + 1;
			}
		} else if (clientCode >= 401 && clientCode <= 500) {
			clientCode -= 401;

			if (clientCode >= this.ignoreCount) {
				com.text = "";
				com.buttonType = 0;
			} else {
				com.text = JString.formatName(JString.fromBase37(this.ignoreName37[clientCode]));
				com.buttonType = 1;
			}
		} else if (clientCode == 503) {
			com.scroll = this.ignoreCount * 15 + 20;

			if (com.scroll <= com.height) {
				com.scroll = com.height + 1;
			}
		} else if (clientCode == 327) {
			com.xan = 150;
			com.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;

			if (this.updateDesignModel) {
				for (int i = 0; i < 7; i++) {
					int kit = this.designKits[i];
					if (kit >= 0 && !IdkType.types[kit].validate()) {
						return;
					}
				}

				this.updateDesignModel = false;

				Model[] models = new Model[7];
				int modelCount = 0;
				for (int i = 0; i < 7; i++) {
					int kit = this.designKits[i];
					if (kit >= 0) {
						models[modelCount++] = IdkType.types[kit].getModel();
					}
				}

				Model model = new Model(modelCount, models);
				for (int i = 0; i < 5; i++) {
					if (this.designColours[i] != 0) {
						model.recolour(DESIGN_BODY_COLOUR[i][0], DESIGN_BODY_COLOUR[i][this.designColours[i]]);

						if (i == 1) {
							model.recolour(DESIGN_HAIR_COLOUR[0], DESIGN_HAIR_COLOUR[this.designColours[i]]);
						}
					}
				}

				model.createLabelReferences();
				model.applyTransform(SeqType.types[localPlayer.seqStandId].frames[0]);
				model.calculateNormals(64, 850, -30, -50, -30, true);

				com.modelType = 5;
				com.model = 0;
				Component.cacheModel(model, 0, 5);
			}
		} else if (clientCode == 324) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = com.graphic;
				this.genderButtonImage1 = com.activeGraphic;
			}

			if (this.designGender) {
				com.graphic = this.genderButtonImage1;
			} else {
				com.graphic = this.genderButtonImage0;
			}
		} else if (clientCode == 325) {
			if (this.genderButtonImage0 == null) {
				this.genderButtonImage0 = com.graphic;
				this.genderButtonImage1 = com.activeGraphic;
			}

			if (this.designGender) {
				com.graphic = this.genderButtonImage0;
			} else {
				com.graphic = this.genderButtonImage1;
			}
		} else if (clientCode == 600) {
			com.text = this.reportAbuseInput;

			if (loopCycle % 20 < 10) {
				com.text = com.text + "|";
			} else {
				com.text = com.text + " ";
			}
		} else if (clientCode == 613) {
			if (this.staffmodlevel < 1) {
				com.text = "";
			} else if (this.reportAbuseMuteOption) {
				com.colour = 16711680;
				com.text = "Moderator option: Mute player for 48 hours: <ON>";
			} else {
				com.colour = 16777215;
				com.text = "Moderator option: Mute player for 48 hours: <OFF>";
			}
		} else if (clientCode == 650 || clientCode == 655) {
			if (this.lastAddress == 0) {
				com.text = "";
			} else {
				String text;
				if (this.daysSinceLogin == 0) {
					text = "earlier today";
				} else if (this.daysSinceLogin == 1) {
					text = "yesterday";
				} else {
					text = this.daysSinceLogin + " days ago";
				}

				com.text = "You last logged in " + text + " from: " + SignLink.dns;
			}
		} else if (clientCode == 651) {
			if (this.unreadMessageCount == 0) {
				com.text = "0 unread messages";
				com.colour = 16776960;
			} else if (this.unreadMessageCount == 1) {
				com.text = "1 unread message";
				com.colour = 65280;
			} else if (this.unreadMessageCount > 1) {
				com.text = this.unreadMessageCount + " unread messages";
				com.colour = 65280;
			}
		} else if (clientCode == 652) {
			if (this.daysSinceRecoveriesChanged == 201) {
				if (this.warnMembersInNonMembers == 1) {
					com.text = "@yel@This is a non-members world: @whi@Since you are a member we";
				} else {
					com.text = "";
				}
			} else if (this.daysSinceRecoveriesChanged == 200) {
				com.text = "You have not yet set any password recovery questions.";
			} else {
				String text;
				if (this.daysSinceRecoveriesChanged == 0) {
					text = "Earlier today";
				} else if (this.daysSinceRecoveriesChanged == 1) {
					text = "Yesterday";
				} else {
					text = this.daysSinceRecoveriesChanged + " days ago";
				}

				com.text = text + " you changed your recovery questions";
			}
		} else if (clientCode == 653) {
			if (this.daysSinceRecoveriesChanged == 201) {
				if (this.warnMembersInNonMembers == 1) {
					com.text = "@whi@recommend you use a members world instead. You may use";
				} else {
					com.text = "";
				}
			} else if (this.daysSinceRecoveriesChanged == 200) {
				com.text = "We strongly recommend you do so now to secure your account.";
			} else {
				com.text = "If you do not remember making this change then cancel it immediately";
			}
		} else if (clientCode == 654) {
			if (this.daysSinceRecoveriesChanged == 201) {
				if (this.warnMembersInNonMembers == 1) {
					com.text = "@whi@this world but member benefits are unavailabe whilst here.";
				} else {
					com.text = "";
				}
			} else if (this.daysSinceRecoveriesChanged == 200) {
				com.text = "Do this from the 'account management' area on our front webpage";
			} else {
				com.text = "Do this from the 'account management' area on our front webpage";
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(Ld;B)Z")
	public final boolean handleInterfaceAction(Component arg0) {
		int clientCode = arg0.clientCode;

		if (clientCode == 201) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 1;
			this.socialMessage = "Enter name of friend to add to list";
		} else if (clientCode == 202) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 2;
			this.socialMessage = "Enter name of friend to delete from list";
		} else if (clientCode == 205) {
			this.idleTimeout = 250;
			return true;
		} else if (clientCode == 501) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 4;
			this.socialMessage = "Enter name of player to add to list";
		} else if (clientCode == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialAction = 5;
			this.socialMessage = "Enter name of player to delete from list";
		} else if (clientCode >= 300 && clientCode <= 313) {
			int part = (clientCode - 300) / 2;
			int direction = clientCode & 0x1;
			int kit = this.designKits[part];

			if (kit != -1) {
				while (true) {
					if (direction == 0) {
						kit--;
						if (kit < 0) {
							kit = IdkType.count - 1;
						}
					}

					if (direction == 1) {
						kit++;
						if (kit >= IdkType.count) {
							kit = 0;
						}
					}

					if (!IdkType.types[kit].disable && IdkType.types[kit].type == part + (this.designGender ? 0 : 7)) {
						this.designKits[part] = kit;
						this.updateDesignModel = true;
						break;
					}
				}
			}
		} else if (clientCode >= 314 && clientCode <= 323) {
			int part = (clientCode - 314) / 2;
			int direction = clientCode & 0x1;
			int colour = this.designColours[part];

			if (direction == 0) {
				colour--;

				if (colour < 0) {
					colour = DESIGN_BODY_COLOUR[part].length - 1;
				}
			} else if (direction == 1) {
				colour++;

				if (colour >= DESIGN_BODY_COLOUR[part].length) {
					colour = 0;
				}
			}

			this.designColours[part] = colour;
			this.updateDesignModel = true;
		} else if (clientCode == 324 && !this.designGender) {
			this.designGender = true;
			this.validateCharacterDesign();
		} else if (clientCode == 325 && this.designGender) {
			this.designGender = false;
			this.validateCharacterDesign();
		} else if (clientCode == 326) {
			this.out.pIsaac(8);
			this.out.p1(this.designGender ? 0 : 1);

			for (int i = 0; i < 7; i++) {
				this.out.p1(this.designKits[i]);
			}

			for (int i = 0; i < 5; i++) {
				this.out.p1(this.designColours[i]);
			}

			return true;
		} else if (clientCode == 613) {
			this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
		} else if (clientCode >= 601 && clientCode <= 612) {
			this.closeInterfaces();

			if (this.reportAbuseInput.length() > 0) {
				this.out.pIsaac(251);
				this.out.p8(JString.toBase37(this.reportAbuseInput));
				this.out.p1(clientCode - 601);
				this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
			}
		}

		return false;
	}

	@ObfuscatedName("client.z(I)V")
	public final void validateCharacterDesign() {
		this.updateDesignModel = true;

		for (int i = 0; i < 7; i++) {
			this.designKits[i] = -1;

			for (int j = 0; j < IdkType.count; j++) {
				if (!IdkType.types[j].disable && IdkType.types[j].type == i + (this.designGender ? 0 : 7)) {
					this.designKits[i] = j;
					break;
				}
			}
		}
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
			PixFont font = this.fontPlain12;
			int line = 0;

			Pix2D.setBounds(463, 77, 0, 0);

			for (int i = 0; i < 100; i++) {
				if (this.messageText[i] != null) {
					int type = this.messageType[i];
					int y = 70 - line * 14 + this.chatScrollOffset;

					String sender = this.messageSender[i];
					byte modicon = 0;

					if (sender != null && sender.startsWith("@cr1@")) {
						sender = sender.substring(5);
						modicon = 1;
					} else if (sender != null && sender.startsWith("@cr2@")) {
						sender = sender.substring(5);
						modicon = 2;
					}

					if (type == 0) {
						if (y > 0 && y < 110) {
							font.drawString(this.messageText[i], 0, y, 4);
						}

						line++;
					} else if ((type == 1 || type == 2) && (type == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							int x = 4;
							if (modicon == 1) {
								this.imageModIcons[0].draw(x, y - 12);
								x += 14;
							} else if (modicon == 2) {
								this.imageModIcons[1].draw(x, y - 12);
								x += 14;
							}
							font.drawString(sender + ":", 0, y, x);

							x += font.stringWidth(sender) + 8;
							font.drawString(this.messageText[i], 255, y, x);
						}

						line++;
					} else if ((type == 3 || type == 7) && this.splitPrivateChat == 0 && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							int x = 4;
							font.drawString("From", 0, y, x);

							x += font.stringWidth("From ");
							if (modicon == 1) {
								this.imageModIcons[0].draw(x, y - 12);
								x += 14;
							} else if (modicon == 2) {
								this.imageModIcons[1].draw(x, y - 12);
								x += 14;
							}
							font.drawString(sender + ":", 0, y, x);

							x += font.stringWidth(sender) + 8;
							font.drawString(this.messageText[i], 8388608, y, x);
						}

						line++;
					} else if (type == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							font.drawString(sender + " " + this.messageText[i], 8388736, y, 4);
						}

						line++;
					} else if (type == 5 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (y > 0 && y < 110) {
							font.drawString(this.messageText[i], 8388608, y, 4);
						}

						line++;
					} else if (type == 6 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (y > 0 && y < 110) {
							font.drawString("To " + sender + ":", 0, y, 4);
							font.drawString(this.messageText[i], 8388608, y, font.stringWidth("To " + sender) + 12);
						}

						line++;
					} else if (type == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							font.drawString(sender + " " + this.messageText[i], 8270336, y, 4);
						}

						line++;
					}
				}
			}

			Pix2D.resetBounds();

			this.chatScrollHeight = line * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}

			this.drawScrollbar(463, this.chatScrollHeight, 0, this.chatScrollHeight - this.chatScrollOffset - 77, 77);

			String username;
			if (localPlayer == null || localPlayer.name == null) {
				username = JString.formatName(this.username);
			} else {
				username = localPlayer.name;
			}
			font.drawString(username + ":", 0, 90, 4);
			font.drawString(this.chatTyped + "*", 255, 90, font.stringWidth(username + ": ") + 6);

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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.f(Z)V")
	public final void drawMinimap() {
		this.areaMapback.bind();

		int angle = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int anchorX = localPlayer.x / 32 + 48;
		int anchorY = 464 - localPlayer.z / 32;

		this.imageMinimap.drawRotatedMasked(25, anchorY, 146, this.macroMinimapZoom + 256, 5, angle, this.field1538, this.minimapMaskLineLengths, this.minimapMaskLineOffsets, anchorX, 151);
		this.imageCompass.drawRotatedMasked(0, 25, 33, 256, 0, this.orbitCameraYaw, this.field1538, this.compassMaskLineLengths, this.comapssMaskLineOffsets, 25, 33);

		for (int i = 0; i < this.activeMapFunctionCount; i++) {
			int x = this.activeMapFunctionX[i] * 4 + 2 - localPlayer.x / 32;
			int y = this.activeMapFunctionZ[i] * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(x, this.activeMapFunctions[i], y);
		}

		for (int ltx = 0; ltx < 104; ltx++) {
			for (int ltz = 0; ltz < 104; ltz++) {
				LinkList objs = this.levelObjStacks[this.currentLevel][ltx][ltz];

				if (objs != null) {
					int x = ltx * 4 + 2 - localPlayer.x / 32;
					int y = ltz * 4 + 2 - localPlayer.z / 32;
					this.drawOnMinimap(x, this.imageMapdot0, y);
				}
			}
		}

		for (int i = 0; i < this.npcCount; i++) {
			NpcEntity npc = this.npcs[this.npcIds[i]];

			if (npc != null && npc.isVisible() && npc.type.minimap) {
				int x = npc.x / 32 - localPlayer.x / 32;
				int y = npc.z / 32 - localPlayer.z / 32;
				this.drawOnMinimap(x, this.imageMapdot1, y);
			}
		}

		for (int i = 0; i < this.playerCount; i++) {
			PlayerEntity player = this.players[this.playerIds[i]];

			if (player != null && player.isVisible()) {
				int x = player.x / 32 - localPlayer.x / 32;
				int y = player.z / 32 - localPlayer.z / 32;

				boolean friend = false;
				long name37 = JString.toBase37(player.name);
				for (int j = 0; j < this.friendCount; j++) {
					if (this.friendName37[j] == name37 && this.friendWorld[j] != 0) {
						friend = true;
						break;
					}
				}

				if (friend) {
					this.drawOnMinimap(x, this.imageMapdot3, y);
				} else {
					this.drawOnMinimap(x, this.imageMapdot2, y);
				}
			}
		}

		if (this.hintType != 0 && loopCycle % 20 < 10) {
			if (this.hintType == 1 && this.hintNpc >= 0 && this.hintNpc < this.npcs.length) {
				NpcEntity npc = this.npcs[this.hintNpc];

				if (npc != null) {
					int x = npc.x / 32 - localPlayer.x / 32;
					int y = npc.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(x, y, this.imageMapmarker1);
				}
			} else if (this.hintType == 2) {
				int x = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
				int y = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
				this.drawMinimapHint(x, y, this.imageMapmarker1);
			} else if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
				PlayerEntity player = this.players[this.hintPlayer];

				if (player != null) {
					int x = player.x / 32 - localPlayer.x / 32;
					int y = player.z / 32 - localPlayer.z / 32;
					this.drawMinimapHint(x, y, this.imageMapmarker1);
				}
			}
		}

		if (this.flagSceneTileX != 0) {
			int x = this.flagSceneTileX * 4 + 2 - localPlayer.x / 32;
			int y = this.flagSceneTileZ * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(x, this.imageMapmarker0, y);
		}

		Pix2D.fillRect(16777215, 3, 3, 97, 78);

		this.areaViewport.bind();
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IBILjb;)V")
	public final void drawMinimapHint(int dx, int dy, Pix32 image) {
		int distance = dx * dx + dy * dy;
		if (distance <= 4225 || distance >= 90000) {
			this.drawOnMinimap(dx, image, dy);
			return;
		}

		int angle = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;

		int sinAngle = Model.sinTable[angle];
		int cosAngle = Model.cosTable[angle];

		sinAngle = sinAngle * 256 / (this.macroMinimapZoom + 256);
		cosAngle = cosAngle * 256 / (this.macroMinimapZoom + 256);

		int var11 = dx * cosAngle + dy * sinAngle >> 16;
		int var12 = dy * cosAngle - dx * sinAngle >> 16;

		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);

		this.imageMapedge.drawRotated(83 - var16 - 20, var13, 256, 15, 15, 20, 20, var15 + 94 + 4 - 10);
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IZLjb;I)V")
	public final void drawOnMinimap(int dx, Pix32 image, int dy) {
		int angle = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;

		int distance = dx * dx + dy * dy;
		if (distance > 6400) {
			return;
		}

		int sinAngle = Model.sinTable[angle];
		int cosAngle = Model.cosTable[angle];

		sinAngle = sinAngle * 256 / (this.macroMinimapZoom + 256);
		cosAngle = cosAngle * 256 / (this.macroMinimapZoom + 256);

		int x = dx * cosAngle + dy * sinAngle >> 16;
		int y = dy * cosAngle - dx * sinAngle >> 16;

		if (distance > 2500) {
			image.drawMasked(this.imageMapback, x + 94 - image.width / 2 + 4, 83 - y - image.height / 2 - 4);
		} else {
			image.draw(x + 94 - image.width / 2 + 4, 83 - y - image.height / 2 - 4);
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void addMessage(String text, String sender, int type) {
		if (type == 0 && this.stickyChatInterfaceId != -1) {
			this.modalMessage = text;
			super.mouseClickButton = 0;
		}

		if (this.chatInterfaceId == -1) {
			this.redrawChatback = true;
		}

		for (int i = 99; i > 0; i--) {
			this.messageType[i] = this.messageType[i - 1];
			this.messageSender[i] = this.messageSender[i - 1];
			this.messageText[i] = this.messageText[i - 1];
		}

		this.messageType[0] = type;
		this.messageSender[0] = sender;
		this.messageText[0] = text;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean isFriend(String username) {
		if (username == null) {
			return false;
		}

		for (int i = 0; i < this.friendCount; i++) {
			if (username.equalsIgnoreCase(this.friendName[i])) {
				return true;
			}
		}

		return username.equalsIgnoreCase(localPlayer.name);
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ZJ)V")
	public final void addFriend(long username37) {
		if (username37 == 0L) {
			return;

		}
		if (this.friendCount >= 100 && this.membersAccount != 1) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
		} else if (this.friendCount >= 200) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
		} else {
			String username = JString.formatName(JString.fromBase37(username37));
			for (int i = 0; i < this.friendCount; i++) {
				if (this.friendName37[i] == username37) {
					this.addMessage(username + " is already on your friend list", "", 0);
					return;
				}
			}

			for (int i = 0; i < this.ignoreCount; i++) {
				if (this.ignoreName37[i] == username37) {
					this.addMessage("Please remove " + username + " from your ignore list first", "", 0);
					return;
				}
			}

			if (!username.equals(localPlayer.name)) {
				this.friendName[this.friendCount] = username;
				this.friendName37[this.friendCount] = username37;
				this.friendWorld[this.friendCount] = 0;
				this.friendCount++;

				this.redrawSidebar = true;

				this.out.pIsaac(9);
				this.out.p8(username37);
			}
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void removeFriend(long username37) {
		if (username37 == 0L) {
			return;
		}

		for (int i = 0; i < this.friendCount; i++) {
			if (this.friendName37[i] == username37) {
				this.friendCount--;
				this.redrawSidebar = true;

				for (int j = i; j < this.friendCount; j++) {
					this.friendName[j] = this.friendName[j + 1];
					this.friendWorld[j] = this.friendWorld[j + 1];
					this.friendName37[j] = this.friendName37[j + 1];
				}

				this.out.pIsaac(69);
				this.out.p8(username37);
				return;
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(BJ)V")
	public final void addIgnore(long username37) {
		if (username37 == 0L) {
			return;
		}

		if (this.ignoreCount >= 100) {
			this.addMessage("Your ignore list is full. Max of 100 hit", "", 0);
			return;
		}

		String name = JString.formatName(JString.fromBase37(username37));
		for (int i = 0; i < this.ignoreCount; i++) {
			if (this.ignoreName37[i] == username37) {
				this.addMessage(name + " is already on your ignore list", "", 0);
				return;
			}
		}

		for (int i = 0; i < this.friendCount; i++) {
			if (this.friendName37[i] == username37) {
				this.addMessage("Please remove " + name + " from your friend list first", "", 0);
				return;
			}
		}

		this.ignoreName37[this.ignoreCount++] = username37;
		this.redrawSidebar = true;

		this.out.pIsaac(203);
		this.out.p8(username37);
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void removeIgnore(long username37) {
		if (username37 == 0L) {
			return;
		}

		for (int i = 0; i < this.ignoreCount; i++) {
			if (this.ignoreName37[i] == username37) {
				this.ignoreCount--;
				this.redrawSidebar = true;

				for (int j = i; j < this.ignoreCount; j++) {
					this.ignoreName37[j] = this.ignoreName37[j + 1];
				}

				this.out.pIsaac(207);
				this.out.p8(username37);
				break;
			}
		}
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
		this.flameBuffer3 = null;
		this.flameBuffer2 = null;

		this.imageFlamesLeft = null;
		this.imageFlamesRight = null;
	}

	// ----

	@ObfuscatedName("client.R(I)V")
	public final void runFlames() {
		this.flameThread = true;

		try {
			long last = System.currentTimeMillis();
			int cycle = 0;
			int interval = 20;

			while (this.flameActive) {
				this.flameCycle++;

				this.updateFlames();
				this.updateFlames();
				this.drawFlames();

				cycle++;
				if (cycle > 10) {
					long now = System.currentTimeMillis();
					int delay = (int) (now - last) / 10 - interval;

					interval = 40 - delay;
					if (interval < 5) {
						interval = 5;
					}

					cycle = 0;
					last = now;
				}

				try {
					Thread.sleep(interval);
				} catch (Exception ignore) {
				}
			}
		} catch (Exception ignore) {
		}

		this.flameThread = false;
	}

	@ObfuscatedName("client.m(Z)V")
	public final void updateFlames() {
		short height = 256;

		for (int x = 10; x < 117; x++) {
			int rand = (int) (Math.random() * 100.0D);
			if (rand < 50) {
				this.flameBuffer3[(height - 2 << 7) + x] = 255;
			}
		}

		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * 124.0D) + 2;
			int y = (int) (Math.random() * 128.0D) + 128;
			int index = (y << 7) + x;

			this.flameBuffer3[index] = 192;
		}

		for (int y = 1; y < height - 1; y++) {
			for (int x = 1; x < 127; x++) {
				int index = (y << 7) + x;
				this.flameBuffer2[index] = (this.flameBuffer3[index - 1] + this.flameBuffer3[index + 1] + this.flameBuffer3[index - 128] + this.flameBuffer3[index + 128]) / 4;
			}
		}

		this.flameCycle0 += 128;

		if (this.flameCycle0 > this.flameBuffer0.length) {
			this.flameCycle0 -= this.flameBuffer0.length;

			int rand = (int) (Math.random() * 12.0D);
			this.updateFlameBuffer(this.imageRunes[rand]);
		}

		for (int y = 1; y < height - 1; y++) {
			for (int x = 1; x < 127; x++) {
				int index = (y << 7) + x;
				int intensity = this.flameBuffer2[index + 128] - this.flameBuffer0[this.flameCycle0 + index & this.flameBuffer0.length - 1] / 5;
				if (intensity < 0) {
					intensity = 0;
				}

				this.flameBuffer3[index] = intensity;
			}
		}

		for (int y = 0; y < height - 1; y++) {
			this.flameLineOffset[y] = this.flameLineOffset[y + 1];
		}

		this.flameLineOffset[height - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);

		if (this.flameGradientCycle0 > 0) {
			this.flameGradientCycle0 -= 4;
		}

		if (this.flameGradientCycle1 > 0) {
			this.flameGradientCycle1 -= 4;
		}

		if (this.flameGradientCycle0 == 0 && this.flameGradientCycle1 == 0) {
			int rand = (int) (Math.random() * 2000.0D);

			if (rand == 0) {
				this.flameGradientCycle0 = 1024;
			} else if (rand == 1) {
				this.flameGradientCycle1 = 1024;
			}
		}
	}

	@ObfuscatedName("client.a(Lkb;B)V")
	public final void updateFlameBuffer(Pix8 image) {
		short height = 256;

		for (int i = 0; i < this.flameBuffer0.length; i++) {
			this.flameBuffer0[i] = 0;
		}

		for (int i = 0; i < 5000; i++) {
			int rand = (int) (Math.random() * 128.0D * (double) height);
			this.flameBuffer0[rand] = (int) (Math.random() * 256.0D);
		}

		for (int i = 0; i < 20; i++) {
			for (int y = 1; y < height - 1; y++) {
				for (int x = 1; x < 127; x++) {
					int index = (y << 7) + x;
					this.flameBuffer1[index] = (this.flameBuffer0[index - 1] + this.flameBuffer0[index + 1] + this.flameBuffer0[index - 128] + this.flameBuffer0[index + 128]) / 4;
				}
			}

			int[] last = this.flameBuffer0;
			this.flameBuffer0 = this.flameBuffer1;
			this.flameBuffer1 = last;
		}

		if (image != null) {
			int off = 0;

			for (int y = 0; y < image.cropBottom; y++) {
				for (int x = 0; x < image.cropRight; x++) {
					if (image.pixels[off++] != 0) {
						int x0 = x + 16 + image.cropLeft;
						int y0 = y + 16 + image.cropTop;
						int index = (y0 << 7) + x0;

						this.flameBuffer0[index] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void drawFlames() {
		short height = 256;

		if (this.flameGradientCycle0 > 0) {
			for (int i = 0; i < 256; i++) {
				if (this.flameGradientCycle0 > 768) {
					this.flameGradient[i] = this.mix(1024 - this.flameGradientCycle0, this.flameGradient0[i], this.flameGradient1[i]);
				} else if (this.flameGradientCycle0 > 256) {
					this.flameGradient[i] = this.flameGradient1[i];
				} else {
					this.flameGradient[i] = this.mix(256 - this.flameGradientCycle0, this.flameGradient1[i], this.flameGradient0[i]);
				}
			}
		} else if (this.flameGradientCycle1 > 0) {
			for (int i = 0; i < 256; i++) {
				if (this.flameGradientCycle1 > 768) {
					this.flameGradient[i] = this.mix(1024 - this.flameGradientCycle1, this.flameGradient0[i], this.flameGradient2[i]);
				} else if (this.flameGradientCycle1 > 256) {
					this.flameGradient[i] = this.flameGradient2[i];
				} else {
					this.flameGradient[i] = this.mix(256 - this.flameGradientCycle1, this.flameGradient2[i], this.flameGradient0[i]);
				}
			}
		} else {
			for (int i = 0; i < 256; i++) {
				this.flameGradient[i] = this.flameGradient0[i];
			}
		}

		for (int i = 0; i < 33920; i++) {
			this.imageTitle0.data[i] = this.imageFlamesLeft.pixels[i];
		}

		int srcOffset = 0;
		int dstOffset = 1152;

		for (int y = 1; y < height - 1; y++) {
			int offset = (height - y) * this.flameLineOffset[y] / height;

			int step = offset + 22;
			if (step < 0) {
				step = 0;
			}

			srcOffset += step;

			for (int x = step; x < 128; x++) {
				int value = this.flameBuffer3[srcOffset++];

				if (value == 0) {
					dstOffset++;
				} else {
					int invAlpha = 256 - value;
					value = this.flameGradient[value];
					int background = this.imageTitle0.data[dstOffset];

					this.imageTitle0.data[dstOffset++] = ((value & 0xFF00FF) * value + (background & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((value & 0xFF00) * value + (background & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
			}

			dstOffset += step;
		}

		this.imageTitle0.draw(super.graphics, 0, 0);

		for (int i = 0; i < 33920; i++) {
			this.imageTitle1.data[i] = this.imageFlamesRight.pixels[i];
		}

		srcOffset = 0;
		dstOffset = 1176;

		for (int y = 1; y < height - 1; y++) {
			int offset = (height - y) * this.flameLineOffset[y] / height;

			int step = 103 - offset;
			dstOffset += offset;

			for (int x = 0; x < step; x++) {
				int value = this.flameBuffer3[srcOffset++];

				if (value == 0) {
					dstOffset++;
				} else {
					int invAlpha = 256 - value;
					value = this.flameGradient[value];
					int background = this.imageTitle1.data[dstOffset];

					this.imageTitle1.data[dstOffset++] = ((value & 0xFF00FF) * value + (background & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((value & 0xFF00) * value + (background & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
			}

			srcOffset += 128 - step;
			dstOffset = 128 - step - offset + dstOffset;
		}

		this.imageTitle1.draw(super.graphics, 0, 637);
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int mix(int alpha, int src, int dst) {
		int invAlpha = 256 - alpha;
		return ((src & 0xFF00FF) * invAlpha + (dst & 0xFF00FF) * alpha & 0xFF00FF00) + ((src & 0xFF00) * invAlpha + (dst & 0xFF00) * alpha & 0xFF0000) >> 8;
	}
}
