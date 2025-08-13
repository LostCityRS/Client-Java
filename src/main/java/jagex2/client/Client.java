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
	public static boolean lowMem;

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
	public ClientNpc[] npcs = new ClientNpc[8192];

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
	public int macroMinimapZoomModifier = 1;

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
	public int[] compassMaskLineOffsets = new int[33];

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

	@ObfuscatedName("client.Ec")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Fc")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Gc")
	public ClientPlayer[] players = new ClientPlayer[this.MAX_PLAYER_COUNT];

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
	public LinkList[][][] objStacks = new LinkList[4][104][104];

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
	public static int cyclelogic2;

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
	public int socialInputType;

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

	@ObfuscatedName("client.Mc")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.td")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public CRC32 crc32 = new CRC32();

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
	public static int cyclelogic4;

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
	public int selectedInterface;

	@ObfuscatedName("client.Uc")
	public int selectedItem;

	@ObfuscatedName("client.Vc")
	public int selectedArea;

	@ObfuscatedName("client.cd")
	public int spellSelected;

	@ObfuscatedName("client.dd")
	public int activeSpellId;

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
	public static int cyclelogic5;

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
	public static int cyclelogic1;

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
	public static int cyclelogic3;

	@ObfuscatedName("client.Ui")
	public static int cyclelogic6;

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
	public static ClientPlayer localPlayer;

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
		int acc = 0;
		for (int i = 0; i < 99; i++) {
			int level = i + 1;
			int delta = (int) ((double) level + Math.pow(2.0D, (double) level / 7.0D) * 300.0D);
			acc += delta;
			levelExperience[i] = acc / 4;
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

				SignLink.storeid = Integer.parseInt(args[4]);
				SignLink.startpriv(InetAddress.getLocalHost());

				Client app = new Client();
				app.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception ignore) {
		}
	}

	public final void init() {
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
	public static final void setLowMem() {
		World3D.lowMem = true;
		Pix3D.lowMem = true;
		lowMem = true;
		World.lowMem = true;
	}

	@ObfuscatedName("client.h(B)V")
	public static final void setHighMem() {
		World3D.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		World.lowMem = false;
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
		} catch (Exception ignore) {
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
						} catch (Exception ignore2) {
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
				} catch (Exception ignore) {
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

			int modelPrefetch = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int progress = modelPrefetch - this.onDemand.remaining();
				if (progress > 0) {
					this.drawProgress(70, "Loading models - " + progress * 100 / modelPrefetch + "%");
				}

				this.updateOnDemand();

				try {
					Thread.sleep(100L);
				} catch (Exception ignore) {
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

				int mapPrefetch = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int progress = mapPrefetch - this.onDemand.remaining();
					if (progress > 0) {
						this.drawProgress(75, "Loading maps - " + progress * 100 / mapPrefetch + "%");
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
					this.onDemand.prefetchPriority(0, i, priority);
				}
			}

			this.onDemand.prefetchMaps(membersWorld);

			if (!lowMem) {
				int midiCount = this.onDemand.getFileCount(2);
				for (int i = 1; i < midiCount; i++) {
					if (this.onDemand.shouldPrefetchMidi(i)) {
						this.onDemand.prefetchPriority(2, i, (byte) 1);
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
			this.areaBackleft1 = new PixMap(backleft1.wi, backleft1.hi, this.getBaseComponent());
			backleft1.quickPlotSprite(0, 0);

			Pix32 backleft2 = new Pix32(jagMedia, "backleft2", 0);
			this.areaBackleft2 = new PixMap(backleft2.wi, backleft2.hi, this.getBaseComponent());
			backleft2.quickPlotSprite(0, 0);

			Pix32 backright1 = new Pix32(jagMedia, "backright1", 0);
			this.areaBackright1 = new PixMap(backright1.wi, backright1.hi, this.getBaseComponent());
			backright1.quickPlotSprite(0, 0);

			Pix32 backright2 = new Pix32(jagMedia, "backright2", 0);
			this.areaBackright2 = new PixMap(backright2.wi, backright2.hi, this.getBaseComponent());
			backright2.quickPlotSprite(0, 0);

			Pix32 backtop1 = new Pix32(jagMedia, "backtop1", 0);
			this.areaBacktop1 = new PixMap(backtop1.wi, backtop1.hi, this.getBaseComponent());
			backtop1.quickPlotSprite(0, 0);

			Pix32 backvmid1 = new Pix32(jagMedia, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(backvmid1.wi, backvmid1.hi, this.getBaseComponent());
			backvmid1.quickPlotSprite(0, 0);

			Pix32 backvmid2 = new Pix32(jagMedia, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(backvmid2.wi, backvmid2.hi, this.getBaseComponent());
			backvmid2.quickPlotSprite(0, 0);

			Pix32 backvmid3 = new Pix32(jagMedia, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(backvmid3.wi, backvmid3.hi, this.getBaseComponent());
			backvmid3.quickPlotSprite(0, 0);

			Pix32 backhmid2 = new Pix32(jagMedia, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(backhmid2.wi, backhmid2.hi, this.getBaseComponent());
			backhmid2.quickPlotSprite(0, 0);

			int randR = (int) (Math.random() * 21.0D) - 10;
			int randG = (int) (Math.random() * 21.0D) - 10;
			int randB = (int) (Math.random() * 21.0D) - 10;
			int rand = (int) (Math.random() * 41.0D) - 20;

			for (int i = 0; i < 50; i++) {
				if (this.imageMapfunction[i] != null) {
					this.imageMapfunction[i].rgbAdjust(randR + rand, randB + rand, randG + rand);
				}

				if (this.imageMapscene[i] != null) {
					this.imageMapscene[i].rgbAdjust(randR + rand, randB + rand, randG + rand);
				}
			}

			this.drawProgress(83, "Unpacking textures");

			Pix3D.unpackTextures(jagTextures);
			Pix3D.initColourTable(0.8D);
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

			if (!lowMem) {
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
				int left = 999;
				int right = 0;

				for (int x = 0; x < 34; x++) {
					if (this.imageMapback.pixels[this.imageMapback.wi * y + x] == 0) {
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
					if (this.imageMapback.pixels[this.imageMapback.wi * y + x] == 0 && (x > 34 || y > 34)) {
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

			Pix3D.init3D(96, 479);
			this.areaChatbackOffset = Pix3D.lineOffset;

			Pix3D.init3D(261, 190);
			this.areaSidebarOffset = Pix3D.lineOffset;

			Pix3D.init3D(334, 512);
			this.areaViewportOffset = Pix3D.lineOffset;

			int[] distance = new int[9];
			for (int x = 0; x < 9; x++) {
				int angle = x * 32 + 128 + 15;
				int offset = angle * 3 + 600;
				int sin = Pix3D.sinTable[angle];
				distance[x] = offset * sin >> 16;
			}

			World3D.init(800, 334, 500, 512, distance);
			WordFilter.unpack(jagWordenc);

			this.mouseTracking = new MouseTracking(this);
		} catch (Exception ignore) {
			ignore.printStackTrace();
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

		int x = 360;
		int y = 200;

		int offsetY = 20;
		this.fontBold12.centreString(x / 2, 0xffffff, "RuneScape is loading - please wait...", y / 2 - 26 - offsetY);

		int midY = y / 2 - 18 - offsetY;
		Pix2D.drawRect(34, 304, 0x8c1111, x / 2 - 152, midY);
		Pix2D.drawRect(32, 302, 0, x / 2 - 151, midY + 1);
		Pix2D.fillRect(0x8c1111, percent * 3, 30, x / 2 - 150, midY + 2);
		Pix2D.fillRect(0, 300 - percent * 3, 30, percent * 3 + (x / 2 - 150), midY + 2);
		this.fontBold12.centreString(x / 2, 0xffffff, message, y / 2 + 5 - offsetY);

		this.imageTitle4.draw(super.graphics, 202, 171);

		if (this.redrawFrame) {
			this.redrawFrame = false;

			if (!this.flameActive) {
				this.imageTitle0.draw(super.graphics, 0, 0);
				this.imageTitle1.draw(super.graphics, 637, 0);
			}

			this.imageTitle2.draw(super.graphics, 128, 0);
			this.imageTitle3.draw(super.graphics, 202, 371);
			this.imageTitle5.draw(super.graphics, 0, 265);
			this.imageTitle6.draw(super.graphics, 562, 265);
			this.imageTitle7.draw(super.graphics, 128, 171);
			this.imageTitle8.draw(super.graphics, 562, 171);
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

			g.setFont(new Font("Helvetica", Font.BOLD, 16));
			g.setColor(Color.yellow);
			int y = 35;
			g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, y);

			y += 50;
			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, y);

			y += 50;
			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, y);

			y += 30;
			g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, y);

			y += 30;
			g.drawString("3: Try using a different game-world", 30, y);

			y += 30;
			g.drawString("4: Try rebooting your computer", 30, y);

			y += 30;
			g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, y);
		} else if (this.errorHost) {
			this.flameActive = false;

			g.setFont(new Font("Helvetica", Font.BOLD, 20));
			g.setColor(Color.white);

			g.drawString("Error - unable to load game!", 50, 50);
			g.drawString("To play RuneScape make sure you play from", 50, 100);
			g.drawString("http://www.runescape.com", 50, 150);
		} else if (this.errorStarted) {
			this.flameActive = false;

			g.setColor(Color.yellow);
			int y = 35;

			g.drawString("Error a copy of RuneScape already appears to be loaded", 30, y);
			y += 50;

			g.setColor(Color.white);
			g.drawString("To fix this try the following (in order):", 30, y);
			y += 50;

			g.setColor(Color.white);
			g.setFont(new Font("Helvetica", 1, 12));
			g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, y);
			y += 30;

			g.drawString("2: Try rebooting your computer, and reloading", 30, y);
			y += 30;
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)Lyb;")
	public final Jagfile getJagFile(int crc, String name, int file, String displayName, int progress) {
		byte[] data = null;
		int retry = 5;

		try {
			if (this.fileStreams[0] != null) {
				data = this.fileStreams[0].read(file);
			}
		} catch (Exception ignore) {
		}

		if (data != null) {
			this.crc32.reset();
			this.crc32.update(data);

			int checksum = (int) this.crc32.getValue();
			if (crc != checksum) {
				data = null;
			}
		}

		if (data != null) {
			return new Jagfile(data);
		}

		int loops = 0;
		while (data == null) {
			this.drawProgress(progress, "Requesting " + displayName);

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
						throw new IOException("EOF");
					}

					pos += n;

					int downloaded = pos * 100 / packedSize;
					if (lastDownloaded != downloaded) {
						this.drawProgress(progress, "Loading " + displayName + " - " + downloaded + "%");
					}

					lastDownloaded = downloaded;
				}

				stream.close();

				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].write(data, file, data.length);
					}
				} catch (Exception ignore) {
					this.fileStreams[0] = null;
				}

				if (data != null) {
					this.crc32.reset();
					this.crc32.update(data);

					int checksum = (int) this.crc32.getValue();
					if (crc != checksum) {
						data = null;
						loops++;
					}
				}
			} catch (IOException ignore) {
				data = null;
			} catch (Exception ignore) {
				data = null;

				if (!SignLink.reporterror) {
					return null;
				}
			}

			if (data == null) {
				for (int i = retry; i > 0; i--) {
					if (loops >= 3) {
						this.drawProgress(progress, "Game updated - please reload page");
						i = 10;
					} else {
						this.drawProgress(progress, "Error loading - Will retry in " + i + " secs.");
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

	@ObfuscatedName("client.d(B)V")
	public final void updateOnDemand() {
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
			} else if (req.archive == 2 && this.midiSong == req.file && req.data != null) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.M(I)V")
	public final void updateTitle() {
		if (this.titleScreenState == 0) {
			int x = super.screenWidth / 2 - 80;
			int y = super.screenHeight / 2 + 20;

			y += 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.titleScreenState = 3;
				this.titleLoginField = 0;
			}

			x = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Enter your username & password.";
				this.titleScreenState = 2;
				this.titleLoginField = 0;
			}
		} else if (this.titleScreenState == 2) {
			int y = super.screenHeight / 2 - 40;
			y += 30;

			y += 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= y - 15 && super.mouseClickY < y) {
				this.titleLoginField = 0;
			}

			y += 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= y - 15 && super.mouseClickY < y) {
				this.titleLoginField = 1;
			}

			y += 15;

			int x = super.screenWidth / 2 - 80;
			y = super.screenHeight / 2 + 50;
			y += 20;

			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.login(this.username, this.password, false);

				if (this.ingame) {
					return;
				}
			}

			int buttonX = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= buttonX - 75 && super.mouseClickX <= buttonX + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
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
			int x = super.screenWidth / 2;
			int y = super.screenHeight / 2 + 50;

			y += 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= x - 75 && super.mouseClickX <= x + 75 && super.mouseClickY >= y - 20 && super.mouseClickY <= y + 20) {
				this.titleScreenState = 0;
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void login(String username, String password, boolean reconnect) {
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
				this.out.pjstr(password);
				this.out.rsaenc(LOGIN_RSAE, LOGIN_RSAN);

				this.login.pos = 0;
				if (reconnect) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}

				this.login.p1(this.out.pos + 36 + 1 + 1);
				this.login.p1(244);
				this.login.p1(lowMem ? 1 : 0);

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

				this.login(username, password, reconnect);
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

	@ObfuscatedName("client.h(Z)V")
	public final void clearCache() {
		LocType.modelCacheStatic.clear();
		LocType.modelCacheDynamic.clear();
		NpcType.modelCache.clear();
		ObjType.modelCache.clear();
		ObjType.iconCache.clear();
		ClientPlayer.modelCache.clear();
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

		this.areaChatback = new PixMap(479, 96, this.getBaseComponent());

		this.areaMapback = new PixMap(172, 156, this.getBaseComponent());
		Pix2D.cls();
		this.imageMapback.plotSprite(0, 0);

		this.areaSidebar = new PixMap(190, 261, this.getBaseComponent());

		this.areaViewport = new PixMap(512, 334, this.getBaseComponent());
		Pix2D.cls();

		this.areaBackbase1 = new PixMap(496, 50, this.getBaseComponent());
		this.areaBackbase2 = new PixMap(269, 37, this.getBaseComponent());
		this.areaBackhmid1 = new PixMap(249, 45, this.getBaseComponent());

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
				// EVENT_TRACKING
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
							Component com = Component.types[this.objDragInterfaceId];

							byte mode = 0;
							if (this.bankArrangeMode == 1 && com.clientCode == 206) {
								mode = 1;
							}
							if (com.invSlotObjId[this.hoveredSlot] <= 0) {
								mode = 0;
							}

							if (mode == 1) {
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
							this.out.pIsaac(81);
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
				this.out.pIsaac(144);
				this.out.p3(4991788);
			}

			if (World3D.clickTileX != -1) {
				int x = World3D.clickTileX;
				int z = World3D.clickTileZ;
				boolean success = this.tryMove(0, localPlayer.routeTileZ[0], 0, 0, true, 0, x, 0, z, 0, localPlayer.routeTileX[0]);
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
				int var10002 = this.cameraModifierCycle[i]++;
			}

			this.handleInputKey();

			super.idleCycles++;
			if (super.idleCycles > 4500) {
				this.idleTimeout = 250;
				super.idleCycles -= 500;

				// IDLE_TIMER
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
				this.out.pIsaac(41);
				this.out.p4(0);
			}

			this.noTimeoutCycle++;
			if (this.noTimeoutCycle > 50) {
				// NO_TIMEOUT
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
		this.fontPlain12.centreString(257, 0, "Connection lost", 144);
		this.fontPlain12.centreString(256, 16777215, "Connection lost", 143);
		this.fontPlain12.centreString(257, 0, "Please wait - attempting to reestablish", 159);
		this.fontPlain12.centreString(256, 16777215, "Please wait - attempting to reestablish", 158);
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
		if (lowMem && this.sceneState == 2 && World.levelBuilt != this.currentLevel) {
			this.areaViewport.bind();
			this.fontPlain12.centreString(257, 0, "Loading - please wait.", 151);
			this.fontPlain12.centreString(256, 16777215, "Loading - please wait.", 150);
			this.areaViewport.draw(super.graphics, 4, 4);
			this.sceneState = 1;
			this.sceneLoadStartTime = System.currentTimeMillis();
		}

		if (this.sceneState == 1) {
			int status = this.checkScene();
			if (status != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				SignLink.reporterror(this.username + " glcfb " + this.serverSeed + "," + status + "," + lowMem + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
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

		boolean ready = true;
		for (int i = 0; i < this.sceneMapLandData.length; i++) {
			byte[] data = this.sceneMapLocData[i];
			if (data != null) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				ready &= World.checkLocations(x, z, data);
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

	@ObfuscatedName("client.N(I)V")
	public final void buildScene() {
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

			World world = new World(this.levelHeightmap, this.levelTileFlags, 104, 104);
			World.lowMem = World3D.lowMem;

			int maps = this.sceneMapLandData.length;
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
			this.out.pIsaac(107);

			for (int i = 0; i < maps; i++) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] data = this.sceneMapLandData[i];

				if (data != null) {
					world.loadGround(data, x, z, (this.sceneCenterZoneX - 6) * 8, (this.sceneCenterZoneZ - 6) * 8);
				}
			}

			for (int i = 0; i < maps; i++) {
				int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
				int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] data = this.sceneMapLandData[i];

				if (data == null && this.sceneCenterZoneZ < 800) {
					world.spreadHeight(x, z, 64, 64);
				}
			}

			// NO_TIMEOUT
			this.out.pIsaac(107);

			for (int i = 0; i < maps; i++) {
				byte[] data = this.sceneMapLocData[i];

				if (data != null) {
					int x = (this.sceneMapIndex[i] >> 8) * 64 - this.sceneBaseTileX;
					int z = (this.sceneMapIndex[i] & 0xFF) * 64 - this.sceneBaseTileZ;
					world.loadLocations(z, this.scene, this.levelCollisionMap, x, data);
				}
			}

			// NO_TIMEOUT
			this.out.pIsaac(107);

			world.build(this.scene, this.levelCollisionMap);
			this.areaViewport.bind();

			// NO_TIMEOUT
			this.out.pIsaac(107);

			for (int x = 0; x < 104; x++) {
				for (int z = 0; z < 104; z++) {
					this.sortObjStacks(x, z);
				}
			}

			this.clearLocChanges();
		} catch (Exception ignore) {
		}

		LocType.modelCacheStatic.clear();

		if (lowMem && SignLink.cache_dat != null) {
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
				if (left == x || right == x || bottom == z || top == z) {
					int land = this.onDemand.getMapFile(z, x, 0);
					if (land != -1) {
						this.onDemand.prefetch(3, land);
					}

					int loc = this.onDemand.getMapFile(z, x, 1);
					if (loc != -1) {
						this.onDemand.prefetch(3, loc);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void clearLocChanges() {
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

	@ObfuscatedName("client.a(BI)V")
	public final void createMinimap(int level) {
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

		int wallRgb = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int doorRgb = (int) (Math.random() * 20.0D) + 238 - 10 << 16;

		this.imageMinimap.bind();

		for (int z = 1; z < 103; z++) {
			for (int x = 1; x < 103; x++) {
				if ((this.levelTileFlags[level][x][z] & 0x18) == 0) {
					this.drawMinimapLoc(z, level, doorRgb, wallRgb, x);
				}

				if (level < 3 && (this.levelTileFlags[level + 1][x][z] & 0x8) != 0) {
					this.drawMinimapLoc(z, level + 1, doorRgb, wallRgb, x);
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

	@ObfuscatedName("client.L(I)V")
	public final void updateLocChanges() {
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

				if (loc.startTime == 0 && (loc.newType < 0 || World.changeLocAvailable(loc.newType, loc.newShape))) {
					this.addLoc(loc.newType, loc.x, loc.newAngle, loc.newShape, loc.level, loc.z, loc.layer);
					loc.startTime = -1;

					if (loc.newType == loc.oldType && loc.oldType == -1) {
						loc.unlink();
					} else if (loc.newType == loc.oldType && loc.newAngle == loc.oldAngle && loc.newShape == loc.oldShape) {
						loc.unlink();
					}
				}
			} else if (loc.oldType < 0 || World.changeLocAvailable(loc.oldType, loc.oldShape)) {
				this.addLoc(loc.oldType, loc.x, loc.oldAngle, loc.oldShape, loc.level, loc.z, loc.layer);
				loc.unlink();
			}
		}

		cyclelogic5++;
		if (cyclelogic5 > 85) {
			cyclelogic5 = 0;

			// ANTICHEAT_CYCLELOGIC5
			this.out.pIsaac(232);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public final void updateAudio() {
		for (int wave = 0; wave < this.waveCount; wave++) {
			if (this.waveDelay[wave] <= 0) {
				boolean replay = false;
				try {
					if (this.waveIds[wave] != this.lastWaveId || this.waveLoops[wave] != this.lastWaveLoops) {
						Packet buf = Wave.generate(this.waveLoops[wave], this.waveIds[wave]);

						if (System.currentTimeMillis() + (long) (buf.pos / 22) > (long) (this.lastWaveLength / 22) + this.lastWaveStartTime) {
							this.lastWaveLength = buf.pos;
							this.lastWaveStartTime = System.currentTimeMillis();

							if (this.saveWave(buf.data, buf.pos)) {
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
				int var10002 = this.waveDelay[wave]--;
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
				this.handleChatMouseInput(super.mouseX - 17, super.mouseY - 357);
			}
		}

		if (this.chatInterfaceId != -1 && this.chatHoveredInterfaceId != this.lastHoveredInterfaceId) {
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

	@ObfuscatedName("client.Q(I)V")
	public final void handlePrivateChatInput() {
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
				}
				if (sender != null && sender.startsWith("@cr2@")) {
					sender = sender.substring(5);
					mod = true;
				}

				if ((type == 3 || type == 7) && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
					int y = 329 - line * 13;

					if (super.mouseX > 4 && super.mouseX < 516 && super.mouseY - 4 > y - 10 && super.mouseY - 4 <= y + 3) {
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

	@ObfuscatedName("client.a(ZII)V")
	public final void handleChatMouseInput(int mouseX, int mouseY) {
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
				}

				if (sender != null && sender.startsWith("@cr2@")) {
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

	@ObfuscatedName("client.d(Z)V")
	public final void handleViewportOptions() {
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

			if (lastTypecode == typecode) {
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
			} else if (entityType == 1) {
				ClientNpc npc = this.npcs[typeId];

				if (npc.type.size == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
					for (int i = 0; i < this.npcCount; i++) {
						ClientNpc other = this.npcs[this.npcIds[i]];

						if (other != null && npc != other && other.type.size == 1 && npc.x == other.x && npc.z == other.z) {
							this.addNpcOptions(z, x, this.npcIds[i], other.type);
						}
					}
				}

				this.addNpcOptions(z, x, typeId, npc.type);
			} else if (entityType == 0) {
				ClientPlayer player = this.players[typeId];

				if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
					for (int i = 0; i < this.npcCount; i++) {
						ClientNpc other = this.npcs[this.npcIds[i]];

						if (other != null && other.type.size == 1 && player.x == other.x && player.z == other.z) {
							this.addNpcOptions(z, x, this.npcIds[i], other.type);
						}
					}

					for (int i = 0; i < this.playerCount; i++) {
						ClientPlayer other = this.players[this.playerIds[i]];

						if (other != null && player != other && player.x == other.x && player.z == other.z) {
							this.addPlayerOptions(this.playerIds[i], x, z, other);
						}
					}
				}

				this.addPlayerOptions(typeId, x, z, player);
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

	@ObfuscatedName("client.i(I)V")
	public final void handleMouseInput() {
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

				if (action == 602 || action == 596 || action == 22 || action == 892 || action == 415 || action == 405 || action == 38 || action == 422 || action == 478 || action == 347 || action == 188) {
					int slot = this.menuParamB[this.menuSize - 1];
					int comId = this.menuParamC[this.menuSize - 1];
					Component com = Component.types[comId];

					if (com.draggable) {
						this.objGrabThreshold = false;
						this.objDragCycles = 0;
						this.objDragInterfaceId = comId;
						this.objDragSlot = slot;
						this.objDragArea = 2;
						this.objGrabX = super.mouseClickX;
						this.objGrabY = super.mouseClickY;

						if (Component.types[comId].layer == this.viewportInterfaceId) {
							this.objDragArea = 1;
						}

						if (Component.types[comId].layer == this.chatInterfaceId) {
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

			return;
		}

		if (button == 1) {
			int menuX = this.menuX;
			int menuY = this.menuY;
			int menuWidth = this.menuWidth;

			int clickX = super.mouseClickX;
			int clickY = super.mouseClickY;

			if (this.menuArea == 0) {
				clickX -= 4;
				clickY -= 4;
			} else if (this.menuArea == 1) {
				clickX -= 553;
				clickY -= 205;
			} else if (this.menuArea == 2) {
				clickX -= 17;
				clickY -= 357;
			}

			int option = -1;
			for (int i = 0; i < this.menuSize; i++) {
				int optionY = (this.menuSize - 1 - i) * 15 + menuY + 31;
				if (clickX > menuX && clickX < menuX + menuWidth && clickY > optionY - 13 && clickY < optionY + 3) {
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
		} else {
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

			if (x < this.menuX - 10 || x > this.menuWidth + this.menuX + 10 || y < this.menuY - 10 || y > this.menuHeight + this.menuY + 10) {
				this.menuVisible = false;

				if (this.menuArea == 1) {
					this.redrawSidebar = true;
				}

				if (this.menuArea == 2) {
					this.redrawChatback = true;
				}
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

		x -= 73;
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

		cyclelogic1++;
		if (cyclelogic1 > 150) {
			cyclelogic1 = 0;

			// ANTICHEAT_CYCLELOGIC1
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

			// CHAT_SETMODE
			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPrivateMode = (this.chatPrivateMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			// CHAT_SETMODE
			this.out.pIsaac(98);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		} else if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatTradeMode = (this.chatTradeMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;

			// CHAT_SETMODE
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
		// CLOSE_MODAL
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
		} catch (Exception ignore) {
			SignLink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.B(I)V")
	public final void applyCutscene() {
		int x = this.cutsceneSrcLocalTileX * 128 + 64;
		int z = this.cutsceneSrcLocalTileZ * 128 + 64;
		int y = this.getHeightmapY(z, this.currentLevel, x) - this.cutsceneSrcHeight;

		if (this.cameraX < x) {
			this.cameraX += (x - this.cameraX) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX > x) {
				this.cameraX = x;
			}
		}

		if (this.cameraX > x) {
			this.cameraX -= (this.cameraX - x) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraX < x) {
				this.cameraX = x;
			}
		}

		if (this.cameraY < y) {
			this.cameraY += (y - this.cameraY) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY > y) {
				this.cameraY = y;
			}
		}

		if (this.cameraY > y) {
			this.cameraY -= (this.cameraY - y) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraY < y) {
				this.cameraY = y;
			}
		}

		if (this.cameraZ < z) {
			this.cameraZ += (z - this.cameraZ) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
			if (this.cameraZ > z) {
				this.cameraZ = z;
			}
		}

		if (this.cameraZ > z) {
			this.cameraZ -= (this.cameraZ - z) * this.cutsceneMoveAcceleration / 1000 + this.cutsceneMoveSpeed;
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
			this.cameraPitch += (pitch - this.cameraPitch) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
			if (this.cameraPitch > pitch) {
				this.cameraPitch = pitch;
			}
		}

		if (this.cameraPitch > pitch) {
			this.cameraPitch -= (this.cameraPitch - pitch) * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
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
			this.cameraYaw += this.cutsceneRotateAcceleration * deltaYaw / 1000 + this.cutsceneRotateSpeed;
			this.cameraYaw &= 0x7FF;
		}

		if (deltaYaw < 0) {
			this.cameraYaw -= -deltaYaw * this.cutsceneRotateAcceleration / 1000 + this.cutsceneRotateSpeed;
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

	@ObfuscatedName("client.i(Z)V")
	public final void handleInputKey() {
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
							}

							if (this.socialInputType == 2 && this.friendCount > 0) {
								long username = JString.toBase37(this.socialInput);
								this.removeFriend(username);
							}

							if (this.socialInputType == 3 && this.socialInput.length() > 0) {
								// MESSAGE_PRIVATE
								this.out.pIsaac(170);
								this.out.p1(0);
								int start = this.out.pos;

								this.out.p8(this.socialName37);
								WordPack.pack(this.socialInput, this.out);
								this.out.psize1(this.out.pos - start);

								this.socialInput = JString.toSentenceCase(this.socialInput);
								this.socialInput = WordFilter.filter(this.socialInput);
								this.addMessage(this.socialInput, JString.formatDisplayName(JString.fromBase37(this.socialName37)), 6);

								if (this.chatPrivateMode == 2) {
									this.chatPrivateMode = 1;
									this.redrawPrivacySettings = true;

									// CHAT_SETMODE
									this.out.pIsaac(98);
									this.out.p1(this.chatPublicMode);
									this.out.p1(this.chatPrivateMode);
									this.out.p1(this.chatTradeMode);
								}
							}

							if (this.socialInputType == 4 && this.ignoreCount < 100) {
								long username = JString.toBase37(this.socialInput);
								this.addIgnore(username);
							}

							if (this.socialInputType == 5 && this.ignoreCount > 0) {
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
								this.out.pIsaac(190);
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
										this.onDemand.prefetchPriority(2, i, (byte) 1);
									}
								}
							}

							if (this.chatTyped.startsWith("::")) {
								// CLIENT_CHEAT
								this.out.pIsaac(76);
								this.out.p1(this.chatTyped.length() - 1);
								this.out.pjstr(this.chatTyped.substring(2));
							} else {
								byte color = 0;
								if (this.chatTyped.startsWith("yellow:")) {
									color = 0;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("red:")) {
									color = 1;
									this.chatTyped = this.chatTyped.substring(4);
								}
								if (this.chatTyped.startsWith("green:")) {
									color = 2;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("cyan:")) {
									color = 3;
									this.chatTyped = this.chatTyped.substring(5);
								}
								if (this.chatTyped.startsWith("purple:")) {
									color = 4;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("white:")) {
									color = 5;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("flash1:")) {
									color = 6;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("flash2:")) {
									color = 7;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("flash3:")) {
									color = 8;
									this.chatTyped = this.chatTyped.substring(7);
								}
								if (this.chatTyped.startsWith("glow1:")) {
									color = 9;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("glow2:")) {
									color = 10;
									this.chatTyped = this.chatTyped.substring(6);
								}
								if (this.chatTyped.startsWith("glow3:")) {
									color = 11;
									this.chatTyped = this.chatTyped.substring(6);
								}

								byte effect = 0;
								if (this.chatTyped.startsWith("wave:")) {
									effect = 1;
									this.chatTyped = this.chatTyped.substring(5);
								}
								if (this.chatTyped.startsWith("scroll:")) {
									effect = 2;
									this.chatTyped = this.chatTyped.substring(7);
								}

								// MESSAGE_PUBLIC
								this.out.pIsaac(171);
								this.out.p1(0);
								int start = this.out.pos;

								this.out.p1(color);
								this.out.p1(effect);
								WordPack.pack(this.chatTyped, this.out);
								this.out.psize1(this.out.pos - start);

								this.chatTyped = JString.toSentenceCase(this.chatTyped);
								this.chatTyped = WordFilter.filter(this.chatTyped);

								localPlayer.chatMessage = this.chatTyped;
								localPlayer.chatColour = color;
								localPlayer.chatEffect = effect;
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

									// CHAT_SETMODE
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
			} while ((key < 97 || key > 122) && (key < 65 || key > 90) && (key < 48 || key > 57) && key != 32);

			if (this.reportAbuseInput.length() < 12) {
				this.reportAbuseInput = this.reportAbuseInput + (char) key;
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
		for (int i = -1; i < this.playerCount; i++) {
			int index;
			if (i == -1) {
				index = this.LOCAL_PLAYER_INDEX;
			} else {
				index = this.playerIds[i];
			}

			ClientPlayer player = this.players[index];
			if (player != null) {
				this.updateEntity(player, 1);
			}
		}

		cyclelogic6++;
		if (cyclelogic6 > 1406) {
			cyclelogic6 = 0;

			// ANTICHEAT_CYCLELOGIC6
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
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.j(I)V")
	public final void updateNpcs() {
		for (int i = 0; i < this.npcCount; i++) {
			int index = this.npcIds[i];
			ClientNpc npc = this.npcs[index];

			if (npc != null) {
				this.updateEntity(npc, npc.type.size);
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Lz;II)V")
	public final void updateEntity(ClientEntity e, int size) {
		if (e.x < 128 || e.z < 128 || e.x >= 13184 || e.z >= 13184) {
			e.primarySeqId = -1;
			e.spotanimId = -1;
			e.forceMoveEndCycle = 0;
			e.forceMoveStartCycle = 0;
			e.x = e.routeTileX[0] * 128 + e.size * 64;
			e.z = e.routeTileZ[0] * 128 + e.size * 64;
			e.clearRoute();
		}

		if (localPlayer == e && (e.x < 1536 || e.z < 1536 || e.x >= 11776 || e.z >= 11776)) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ILz;)V")
	public final void updateForceMovement(ClientEntity e) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(Lz;I)V")
	public final void startForceMovement(ClientEntity e) {
		if (loopCycle == e.forceMoveStartCycle || e.primarySeqId == -1 || e.primarySeqDelay != 0 || e.primarySeqCycle + 1 > SeqType.types[e.primarySeqId].getFrameDuration(e.primarySeqFrame)) {
			int duration = e.forceMoveStartCycle - e.forceMoveEndCycle;
			int delta = loopCycle - e.forceMoveEndCycle;
			int dx0 = e.forceMoveStartSceneTileX * 128 + e.size * 64;
			int dz0 = e.forceMoveStartSceneTileZ * 128 + e.size * 64;
			int dx1 = e.forceMoveEndSceneTileX * 128 + e.size * 64;
			int dz1 = e.forceMoveEndSceneTileZ * 128 + e.size * 64;
			e.x = ((duration - delta) * dx0 + delta * dx1) / duration;
			e.z = ((duration - delta) * dz0 + delta * dz1) / duration;
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.b(Lz;I)V")
	public final void updateMovement(ClientEntity e) {
		e.secondarySeqId = e.readyanim;

		if (e.routeLength == 0) {
			e.seqDelayMove = 0;
			return;
		}

		if (e.primarySeqId != -1 && e.primarySeqDelay == 0) {
			SeqType var3 = SeqType.types[e.primarySeqId];
			if (e.preanimRouteLength > 0 && var3.preanim_move == 0) {
				e.seqDelayMove++;
				return;
			}

			if (e.preanimRouteLength <= 0 && var3.postanim_mode == 0) {
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
		if (e.dstYaw != e.yaw && e.targetId == -1) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.c(Lz;I)V")
	public final void updateFacingDirection(ClientEntity e) {
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
			if (this.localPid == index) {
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

			if (e.secondarySeqId == e.readyanim && e.dstYaw != e.yaw) {
				if (e.turnanim != -1) {
					e.secondarySeqId = e.turnanim;
				} else {
					e.secondarySeqId = e.walkanim;
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.d(Lz;I)V")
	public final void updateSequences(ClientEntity e) {
		e.needsForwardDrawPadding = false;

		if (e.secondarySeqId != -1) {
			SeqType seq = SeqType.types[e.secondarySeqId];
			e.secondarySeqCycle++;

			if (e.secondarySeqFrame < seq.numFrames && e.secondarySeqCycle > seq.getFrameDuration(e.secondarySeqFrame)) {
				e.secondarySeqCycle = 0;
				e.secondarySeqFrame++;
			}

			if (e.secondarySeqFrame >= seq.numFrames) {
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

			while (e.spotanimFrame < seq.numFrames && e.spotanimCycle > seq.getFrameDuration(e.spotanimFrame)) {
				e.spotanimCycle -= seq.getFrameDuration(e.spotanimFrame);
				e.spotanimFrame++;
			}

			if (e.spotanimFrame >= seq.numFrames && (e.spotanimFrame < 0 || e.spotanimFrame >= seq.numFrames)) {
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

			while (e.primarySeqFrame < seq.numFrames && e.primarySeqCycle > seq.getFrameDuration(e.primarySeqFrame)) {
				e.primarySeqCycle -= seq.getFrameDuration(e.primarySeqFrame);
				e.primarySeqFrame++;
			}

			if (e.primarySeqFrame >= seq.numFrames) {
				e.primarySeqFrame -= seq.loops;
				e.primarySeqLoop++;

				if (e.primarySeqLoop >= seq.maxloops) {
					e.primarySeqId = -1;
				}

				if (e.primarySeqFrame < 0 || e.primarySeqFrame >= seq.numFrames) {
					e.primarySeqId = -1;
				}
			}

			e.needsForwardDrawPadding = seq.stretches;
		}

		if (e.primarySeqDelay > 0) {
			e.primarySeqDelay--;
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

		this.imageTitle0 = new PixMap(128, 265, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle1 = new PixMap(128, 265, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle2 = new PixMap(509, 171, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle3 = new PixMap(360, 132, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle4 = new PixMap(360, 200, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle5 = new PixMap(202, 238, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle6 = new PixMap(203, 238, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle7 = new PixMap(74, 94, this.getBaseComponent());
		Pix2D.cls();

		this.imageTitle8 = new PixMap(75, 94, this.getBaseComponent());
		Pix2D.cls();

		if (this.jagTitle != null) {
			this.loadTitleBackground();
			this.loadTitleImages();
		}

		this.redrawFrame = true;
	}

	@ObfuscatedName("client.c(Z)V")
	public final void loadTitleBackground() {
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

		// draw right side (mirror image)
		int[] pixels = new int[background.wi];
		for (int y = 0; y < background.hi; y++) {
			for (int x = 0; x < background.wi; x++) {
				pixels[x] = background.pixels[background.wi * y + (background.wi - x - 1)];
			}

			for (int x = 0; x < background.wi; x++) {
				background.pixels[background.wi * y + x] = pixels[x];
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

		Pix32 var6 = new Pix32(this.jagTitle, "logo", 0);
		this.imageTitle2.bind();
		var6.plotSprite(382 - var6.wi / 2 - 128, 18);

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
		this.imageTitlebox.plotSprite(0, 0);

		short w = 360;
		short h = 200;

		if (this.titleScreenState == 0) {
			int x = h / 2 + 80;
			int y = h / 2 - 20;
			this.fontPlain11.centreStringTag(w / 2, true, this.onDemand.message, x, 0x75a9a9);
			this.fontBold12.centreStringTag(w / 2, true, "Welcome to RuneScape", y, 16776960);
			y += 30;

			x = w / 2 - 80;
			y = h / 2 + 20;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(x, true, "New user", y + 5, 16777215);

			x = w / 2 + 80;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(x, true, "Existing User", y + 5, 16777215);
		} else if (this.titleScreenState == 2) {
			int x = (w / 2) - 80;
			int y = (h / 2) - 40;
			if (this.loginMessage0.length() > 0) {
				this.fontBold12.centreStringTag(w / 2, true, this.loginMessage0, y - 15, 16776960);
				this.fontBold12.centreStringTag(w / 2, true, this.loginMessage1, y, 16776960);
				y += 30;
			} else {
				this.fontBold12.centreStringTag(w / 2, true, this.loginMessage1, y - 7, 16776960);
				y += 30;
			}

			this.fontBold12.drawStringTag(16777215, w / 2 - 90, true, y, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			y += 15;

			this.fontBold12.drawStringTag(16777215, w / 2 - 88, true, y, "Password: " + JString.censor(this.password) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			y += 15;

			x = w / 2 - 80;
			y = h / 2 + 50;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(x, true, "Login", y + 5, 16777215);

			x = w / 2 + 80;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(x, true, "Cancel", y + 5, 16777215);
		} else if (this.titleScreenState == 3) {
			int x = w / 2;
			int y = h / 2 - 60;
			this.fontBold12.centreStringTag(x, true, "Create a free account", y, 16776960);

			y = h / 2 - 35;
			this.fontBold12.centreStringTag(x, true, "To create a new account you need to", y, 16777215);
			y += 15;

			this.fontBold12.centreStringTag(x, true, "go back to the main RuneScape webpage", y, 16777215);
			y += 15;

			this.fontBold12.centreStringTag(x, true, "and choose the red 'create account'", y, 16777215);
			y += 15;

			this.fontBold12.centreStringTag(x, true, "button at the top right of that page.", y, 16777215);
			y += 15;

			x = w / 2;
			y = h / 2 + 50;
			this.imageTitlebutton.plotSprite(x - 73, y - 20);
			this.fontBold12.centreStringTag(x, true, "Cancel", y + 5, 16777215);
		}

		this.imageTitle4.draw(super.graphics, 202, 171);

		if (this.redrawFrame) {
			this.redrawFrame = false;
			this.imageTitle2.draw(super.graphics, 128, 0);
			this.imageTitle3.draw(super.graphics, 202, 371);
			this.imageTitle5.draw(super.graphics, 0, 265);
			this.imageTitle6.draw(super.graphics, 562, 265);
			this.imageTitle7.draw(super.graphics, 128, 171);
			this.imageTitle8.draw(super.graphics, 562, 171);
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void drawGame() {
		if (this.redrawFrame) {
			this.redrawFrame = false;

			this.areaBackleft1.draw(super.graphics, 0, 4);
			this.areaBackleft2.draw(super.graphics, 0, 357);
			this.areaBackright1.draw(super.graphics, 722, 4);
			this.areaBackright2.draw(super.graphics, 743, 205);
			this.areaBacktop1.draw(super.graphics, 0, 0);
			this.areaBackvmid1.draw(super.graphics, 516, 4);
			this.areaBackvmid2.draw(super.graphics, 516, 205);
			this.areaBackvmid3.draw(super.graphics, 496, 357);
			this.areaBackhmid2.draw(super.graphics, 0, 338);

			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;

			if (this.sceneState != 2) {
				this.areaViewport.draw(super.graphics, 4, 4);
				this.areaMapback.draw(super.graphics, 550, 4);
			}
		}

		if (this.sceneState == 2) {
			this.drawScene();
		}

		if (this.menuVisible && this.menuArea == 1) {
			this.redrawSidebar = true;
		}

		if (this.sidebarInterfaceId != -1) {
			boolean redraw = this.updateInterfaceAnimation(this.sceneDelta, this.sidebarInterfaceId);
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
				this.handleScrollInput(this.chatInterface, 0, false, super.mouseY - 357, 77, this.chatScrollHeight, super.mouseX - 17, 463);
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
			boolean redraw = this.updateInterfaceAnimation(this.sceneDelta, this.chatInterfaceId);
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
			this.areaMapback.draw(super.graphics, 550, 4);
		}

		if (this.flashingTab != -1) {
			this.redrawSideicons = true;
		}

		if (this.redrawSideicons) {
			if (this.flashingTab != -1 && this.flashingTab == this.selectedTab) {
				this.flashingTab = -1;
				// TUTORIAL_CLICKSIDE
				this.out.pIsaac(233);
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

			this.areaBackhmid1.draw(super.graphics, 516, 160);

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

			this.areaBackbase2.draw(super.graphics, 496, 466);
			this.areaViewport.bind();
		}

		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;

			this.areaBackbase1.bind();
			this.imageBackbase1.plotSprite(0, 0);

			this.fontPlain12.centreStringTag(55, true, "Public chat", 28, 16777215);
			if (this.chatPublicMode == 0) {
				this.fontPlain12.centreStringTag(55, true, "On", 41, 65280);
			}
			if (this.chatPublicMode == 1) {
				this.fontPlain12.centreStringTag(55, true, "Friends", 41, 16776960);
			}
			if (this.chatPublicMode == 2) {
				this.fontPlain12.centreStringTag(55, true, "Off", 41, 16711680);
			}
			if (this.chatPublicMode == 3) {
				this.fontPlain12.centreStringTag(55, true, "Hide", 41, 65535);
			}

			this.fontPlain12.centreStringTag(184, true, "Private chat", 28, 16777215);
			if (this.chatPrivateMode == 0) {
				this.fontPlain12.centreStringTag(184, true, "On", 41, 65280);
			}
			if (this.chatPrivateMode == 1) {
				this.fontPlain12.centreStringTag(184, true, "Friends", 41, 16776960);
			}
			if (this.chatPrivateMode == 2) {
				this.fontPlain12.centreStringTag(184, true, "Off", 41, 16711680);
			}

			this.fontPlain12.centreStringTag(324, true, "Trade/duel", 28, 16777215);
			if (this.chatTradeMode == 0) {
				this.fontPlain12.centreStringTag(324, true, "On", 41, 65280);
			}
			if (this.chatTradeMode == 1) {
				this.fontPlain12.centreStringTag(324, true, "Friends", 41, 16776960);
			}
			if (this.chatTradeMode == 2) {
				this.fontPlain12.centreStringTag(324, true, "Off", 41, 16711680);
			}

			this.fontPlain12.centreStringTag(458, true, "Report abuse", 33, 16777215);

			this.areaBackbase1.draw(super.graphics, 0, 453);

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
			int pitch = this.orbitCameraPitch;
			if (this.cameraPitchClamp / 256 > pitch) {
				pitch = this.cameraPitchClamp / 256;
			}
			if (this.cameraModifierEnabled[4] && this.cameraModifierWobbleScale[4] + 128 > pitch) {
				pitch = this.cameraModifierWobbleScale[4] + 128;
			}

			int yaw = this.orbitCameraYaw + this.macroCameraAngle & 0x7FF;
			this.orbitCamera(yaw, this.getHeightmapY(localPlayer.z, this.currentLevel, localPlayer.x) - 50, pitch, this.orbitCameraZ, pitch * 3 + 600, this.orbitCameraX);

			cyclelogic2++;
			if (cyclelogic2 > 1802) {
				cyclelogic2 = 0;

				// ANTICHEAT_CYCLELOGIC2
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
				int jitter = (int) (Math.random() * (double) (this.cameraModifierJitter[type] * 2 + 1) - (double) this.cameraModifierJitter[type] + Math.sin((double) this.cameraModifierWobbleSpeed[type] / 100.0D * (double) this.cameraModifierCycle[type]) * (double) this.cameraModifierWobbleScale[type]);

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
					}

					if (this.cameraPitch > 383) {
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
		this.scene.draw(this.cameraX, level, this.cameraYaw, this.cameraPitch, this.cameraZ, this.cameraY);
		this.scene.clearLocChanges();
		this.draw2DEntityElements();
		this.drawTileHint();
		this.updateTextures(cycle);
		this.draw3DEntityElements();
		this.areaViewport.draw(super.graphics, 4, 4);

		this.cameraX = cameraX;
		this.cameraY = cameraY;
		this.cameraZ = cameraZ;
		this.cameraPitch = cameraPitch;
		this.cameraYaw = cameraYaw;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.t(I)V")
	public final void pushPlayers() {
		if (localPlayer.x >> 7 == this.flagSceneTileX && localPlayer.z >> 7 == this.flagSceneTileZ) {
			this.flagSceneTileX = 0;
		}

		for (int i = -1; i < this.playerCount; i++) {
			ClientPlayer player;

			int id;
			if (i == -1) {
				player = localPlayer;
				id = this.LOCAL_PLAYER_INDEX << 14;
			} else {
				player = this.players[this.playerIds[i]];
				id = this.playerIds[i] << 14;
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
				this.scene.addTemporary(60, player.needsForwardDrawPadding, player.y, player.yaw, player.z, player, player.x, id, this.currentLevel);
			} else {
				player.lowMemory = false;
				player.y = this.getHeightmapY(player.z, this.currentLevel, player.x);
				this.scene.addTemporary(this.currentLevel, player, player.z, player.maxTileX, player.maxTileZ, player.y, player.yaw, player.x, player.minTileX, 60, id, player.minTileZ);
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IZ)V")
	public final void pushNpcs(boolean alwaysontop) {
		for (int i = 0; i < this.npcCount; i++) {
			ClientNpc npc = this.npcs[this.npcIds[i]];
			int typecode = (this.npcIds[i] << 14) + 0x20000000;

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

			this.scene.addTemporary((npc.size - 1) * 64 + 60, npc.needsForwardDrawPadding, this.getHeightmapY(npc.z, this.currentLevel, npc.x), npc.yaw, npc.z, npc, npc.x, typecode, this.currentLevel);
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.l(I)V")
	public final void pushProjectiles() {
		ClientProj proj = (ClientProj) this.projectiles.head();
		while (proj != null) {
			if (this.currentLevel != proj.level || loopCycle > proj.endCycle) {
				proj.unlink();
			} else if (loopCycle >= proj.startCycle) {
				if (proj.target > 0) {
					ClientNpc npc = this.npcs[proj.target - 1];
					if (npc != null && npc.x >= 0 && npc.x < 13312 && npc.z >= 0 && npc.z < 13312) {
						proj.updateVelocity(npc.z, this.getHeightmapY(npc.z, proj.level, npc.x) - proj.offsetY, npc.x, loopCycle);
					}
				}

				if (proj.target < 0) {
					int index = -proj.target - 1;
					ClientPlayer player;
					if (this.localPid == index) {
						player = localPlayer;
					} else {
						player = this.players[index];
					}

					if (player != null && player.x >= 0 && player.x < 13312 && player.z >= 0 && player.z < 13312) {
						proj.updateVelocity(player.z, this.getHeightmapY(player.z, proj.level, player.x) - proj.offsetY, player.x, loopCycle);
					}
				}

				proj.update(this.sceneDelta);
				this.scene.addTemporary(60, false, (int) proj.field518, proj.field524, (int) proj.field517, proj, (int) proj.field516, -1, this.currentLevel);
			}

			proj = (ClientProj) this.projectiles.next();
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.o(I)V")
	public final void pushSpotanims() {
		for (MapSpotAnim spot = (MapSpotAnim) this.spotanims.head(); spot != null; spot = (MapSpotAnim) this.spotanims.next()) {
			if (this.currentLevel != spot.level || spot.seqComplete) {
				spot.unlink();
			} else if (loopCycle >= spot.startCycle) {
				spot.update(this.sceneDelta);

				if (spot.seqComplete) {
					spot.unlink();
				} else {
					this.scene.addTemporary(60, false, spot.y, 0, spot.z, spot, spot.x, -1, spot.level);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void orbitCamera(int yaw, int targetY, int pitch, int targetZ, int distance, int targetX) {
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
			int tmp = x * cos + z * sin >> 16;
			z = z * cos - x * sin >> 16;
			x = tmp;
		}

		this.cameraX = targetX - x;
		this.cameraY = targetY - y;
		this.cameraZ = targetZ - z;
		this.cameraPitch = pitch;
		this.cameraYaw = yaw;
	}

	@ObfuscatedName("client.I(I)I")
	public final int getTopLevelCutscene() {
		int y = this.getHeightmapY(this.cameraZ, this.currentLevel, this.cameraX);
		return y - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0 ? 3 : this.currentLevel;
	}

	@ObfuscatedName("client.H(I)I")
	public final int getTopLevel() {
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

	@ObfuscatedName("client.n(I)V")
	public final void draw2DEntityElements() {
		this.chatCount = 0;

		for (int index = -1; index < this.npcCount + this.playerCount; index++) {
			ClientEntity entity;
			if (index == -1) {
				entity = localPlayer;
			} else if (index < this.playerCount) {
				entity = this.players[this.playerIds[index]];
			} else {
				entity = this.npcs[this.npcIds[index - this.playerCount]];
			}

			if (entity == null || !entity.isVisible()) {
				continue;
			}

			if (index >= this.playerCount) {
				NpcType npc = ((ClientNpc) entity).type;

				if (npc.headicon >= 0 && npc.headicon < this.imageHeadicon.length) {
					this.projectFromEntity(entity.height + 15, entity);

					if (this.projectX > -1) {
						this.imageHeadicon[npc.headicon].plotSprite(this.projectX - 12, this.projectY - 30);
					}
				}

				if (this.hintType == 1 && this.npcIds[index - this.playerCount] == this.hintNpc && loopCycle % 20 < 10) {
					this.projectFromEntity(entity.height + 15, entity);

					if (this.projectX > -1) {
						this.imageHeadicon[2].plotSprite(this.projectX - 12, this.projectY - 28);
					}
				}
			} else {
				int y = 30;

				ClientPlayer player = (ClientPlayer) entity;
				if (player.headicon != 0) {
					this.projectFromEntity(entity.height + 15, entity);

					if (this.projectX > -1) {
						for (int icon = 0; icon < 8; icon++) {
							if ((player.headicon & 0x1 << icon) != 0) {
								this.imageHeadicon[icon].plotSprite(this.projectX - 12, this.projectY - y);
								y -= 25;
							}
						}
					}
				}

				if (index >= 0 && this.hintType == 10 && this.playerIds[index] == this.hintPlayer) {
					this.projectFromEntity(entity.height + 15, entity);

					if (this.projectX > -1) {
						this.imageHeadicon[7].plotSprite(this.projectX - 12, this.projectY - y);
					}
				}
			}

			if (entity.chatMessage != null && (index >= this.playerCount || this.chatPublicMode == 0 || this.chatPublicMode == 3 || this.chatPublicMode == 1 && this.isFriend(((ClientPlayer) entity).name))) {
				this.projectFromEntity(entity.height, entity);

				if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
					this.chatWidth[this.chatCount] = this.fontBold12.stringWid(entity.chatMessage) / 2;
					this.chatHeight[this.chatCount] = this.fontBold12.height;
					this.chatX[this.chatCount] = this.projectX;
					this.chatY[this.chatCount] = this.projectY;

					this.chatColour[this.chatCount] = entity.chatColour;
					this.chatEffect[this.chatCount] = entity.chatEffect;
					this.chatTimer[this.chatCount] = entity.chatTimer;
					this.chatMessage[this.chatCount++] = entity.chatMessage;

					if (this.chatEffects == 0 && entity.chatEffect == 1) {
						this.chatHeight[this.chatCount] += 10;
						this.chatY[this.chatCount] += 5;
					}

					if (this.chatEffects == 0 && entity.chatEffect == 2) {
						this.chatWidth[this.chatCount] = 60;
					}
				}
			}

			if (entity.combatCycle > loopCycle) {
				this.projectFromEntity(entity.height + 15, entity);

				if (this.projectX > -1) {
					int w = entity.health * 30 / entity.totalHealth;
					if (w > 30) {
						w = 30;
					}
					Pix2D.fillRect(65280, w, 5, this.projectX - 15, this.projectY - 3);
					Pix2D.fillRect(16711680, 30 - w, 5, this.projectX - 15 + w, this.projectY - 3);
				}
			}

			for (int i = 0; i < 4; i++) {
				if (entity.damageCycle[i] > loopCycle) {
					this.projectFromEntity(entity.height / 2, entity);
					if (this.projectX <= -1) {
						continue;
					}

					if (i == 1) {
						this.projectY -= 20;
					} else if (i == 2) {
						this.projectX -= 15;
						this.projectY -= 10;
					} else if (i == 3) {
						this.projectX += 15;
						this.projectY -= 10;
					}

					this.imageHitmark[entity.damageType[i]].plotSprite(this.projectX - 12, this.projectY - 12);
					this.fontPlain11.centreString(this.projectX, 0, String.valueOf(entity.damage[i]), this.projectY + 4);
					this.fontPlain11.centreString(this.projectX - 1, 16777215, String.valueOf(entity.damage[i]), this.projectY + 3);
				}
			}
		}

		for (int i = 0; i < this.chatCount; i++) {
			int x = this.chatX[i];
			int y = this.chatY[i];
			int padding = this.chatWidth[i];
			int height = this.chatHeight[i];

			boolean sorting = true;
			while (sorting) {
				sorting = false;
				for (int j = 0; j < i; j++) {
					if (y + 2 > this.chatY[j] - this.chatHeight[j] && y - height < this.chatY[j] + 2 && x - padding < this.chatWidth[j] + this.chatX[j] && x + padding > this.chatX[j] - this.chatWidth[j] && this.chatY[j] - this.chatHeight[j] < y) {
						y = this.chatY[j] - this.chatHeight[j];
						sorting = true;
					}
				}
			}

			this.projectX = this.chatX[i];
			this.projectY = this.chatY[i] = y;

			String message = this.chatMessage[i];
			if (this.chatEffects == 0) {
				int color = 16776960;

				if (this.chatColour[i] < 6) {
					color = this.CHAT_COLOURS[this.chatColour[i]];
				} else if (this.chatColour[i] == 6) {
					color = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
				} else if (this.chatColour[i] == 7) {
					color = this.sceneCycle % 20 < 10 ? 255 : 65535;
				} else if (this.chatColour[i] == 8) {
					color = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
				} else if (this.chatColour[i] == 9) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						color = delta * 1280 + 16711680;
					} else if (delta < 100) {
						color = 16776960 - (delta - 50) * 327680;
					} else if (delta < 150) {
						color = (delta - 100) * 5 + 65280;
					}
				} else if (this.chatColour[i] == 10) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						color = delta * 5 + 16711680;
					} else if (delta < 100) {
						color = 16711935 - (delta - 50) * 327680;
					} else if (delta < 150) {
						color = (delta - 100) * 327680 + 255 - (delta - 100) * 5;
					}
				} else if (this.chatColour[i] == 11) {
					int delta = 150 - this.chatTimer[i];
					if (delta < 50) {
						color = 16777215 - delta * 327685;
					} else if (delta < 100) {
						color = (delta - 50) * 327685 + 65280;
					} else if (delta < 150) {
						color = 16777215 - (delta - 100) * 327680;
					}
				}

				if (this.chatEffect[i] == 0) {
					this.fontBold12.centreString(this.projectX, 0, message, this.projectY + 1);
					this.fontBold12.centreString(this.projectX, color, message, this.projectY);
				} else if (this.chatEffect[i] == 1) {
					this.fontBold12.centreStringWave(this.projectY + 1, this.sceneCycle, message, this.projectX, 0);
					this.fontBold12.centreStringWave(this.projectY, this.sceneCycle, message, this.projectX, color);
				} else if (this.chatEffect[i] == 2) {
					int w = this.fontBold12.stringWid(message);
					int offsetX = (150 - this.chatTimer[i]) * (w + 100) / 150;
					Pix2D.setClipping(this.projectX + 50, 334, 0, this.projectX - 50);
					this.fontBold12.drawString(message, 0, this.projectY + 1, this.projectX + 50 - offsetX);
					this.fontBold12.drawString(message, color, this.projectY, this.projectX + 50 - offsetX);
					Pix2D.resetClipping();
				}
			} else {
				this.fontBold12.centreString(this.projectX, 0, message, this.projectY + 1);
				this.fontBold12.centreString(this.projectX, 16776960, message, this.projectY);
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.D(I)V")
	public final void drawTileHint() {
		if (this.hintType != 2) {
			return;
		}

		this.projectFromGround((this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ, this.hintHeight * 2, (this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX);

		if (this.projectX > -1 && loopCycle % 20 < 10) {
			this.imageHeadicon[2].plotSprite(this.projectX - 12, this.projectY - 28);
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IILz;)V")
	public final void projectFromEntity(int height, ClientEntity e) {
		this.projectFromGround(e.z, height, e.x);
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIII)V")
	public final void projectFromGround(int z, int height, int x) {
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

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ZIII)I")
	public final int getHeightmapY(int sceneZ, int level, int sceneX) {
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
		int y00 = (128 - tileLocalX) * this.levelHeightmap[realLevel][tileX][tileZ] + this.levelHeightmap[realLevel][tileX + 1][tileZ] * tileLocalX >> 7;
		int y11 = (128 - tileLocalX) * this.levelHeightmap[realLevel][tileX][tileZ + 1] + this.levelHeightmap[realLevel][tileX + 1][tileZ + 1] * tileLocalX >> 7;
		return (128 - tileLocalZ) * y00 + tileLocalZ * y11 >> 7;
	}

	@ObfuscatedName("client.j(II)V")
	public final void updateTextures(int cycle) {
		if (lowMem) {
			return;
		}

		if (Pix3D.textureCycle[17] >= cycle) {
			Pix8 texture = Pix3D.textures[17];
			int bottom = texture.hi * texture.wi - 1;
			int adjustment = this.sceneDelta * texture.wi * 2;

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
			int bottom = texture.hi * texture.wi - 1;
			int adjustment = this.sceneDelta * texture.wi * 2;

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

	@ObfuscatedName("client.f(B)V")
	public final void draw3DEntityElements() {
		this.drawPrivateMessages();

		if (this.crossMode == 1) {
			this.imageCross[this.crossCycle / 100].plotSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
		} else if (this.crossMode == 2) {
			this.imageCross[this.crossCycle / 100 + 4].plotSprite(this.crossX - 8 - 4, this.crossY - 8 - 4);
		}

		if (this.viewportOverlayInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, this.viewportOverlayInterfaceId);
			this.drawInterface(0, 0, Component.types[this.viewportOverlayInterfaceId], 0);
		}

		if (this.field1264 > 0) {
			int offset = 302 - (int) Math.abs(Math.sin((double) this.field1264 / 10.0D) * 10.0D);

			for (int i = 0; i < 30; i++) {
				int w = (30 - i) * 16;
				Pix2D.hlineTrans(offset + i, w, 16776960, 256 - w / 2, this.field1264);
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
				this.imageHeadicon[1].plotSprite(472, 258);
			} else {
				this.imageHeadicon[1].plotSprite(472, 296);
			}
		}

		if (this.wildernessLevel > 0) {
			this.imageHeadicon[0].plotSprite(472, 296);
			this.fontPlain12.centreString(484, 16776960, "Level: " + this.wildernessLevel, 329);
		}

		if (this.worldLocationState == 1) {
			this.imageHeadicon[6].plotSprite(472, 296);
			this.fontPlain12.centreString(484, 16776960, "Arena", 329);
		}

		if (this.systemUpdateTimer != 0) {
			int seconds = this.systemUpdateTimer / 50;
			int minutes = seconds / 60;
			seconds %= 60;

			if (seconds < 10) {
				this.fontPlain12.drawString("System update in: " + minutes + ":0" + seconds, 16776960, 329, 4);
			} else {
				this.fontPlain12.drawString("System update in: " + minutes + ":" + seconds, 16776960, 329, 4);
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void drawPrivateMessages() {
		if (this.splitPrivateChat == 0) {
			return;
		}

		PixFont font = this.fontPlain12;
		int lineOffset = 0;
		if (this.systemUpdateTimer != 0) {
			lineOffset = 1;
		}

		for (int i = 0; i < 100; i++) {
			if (this.messageText[i] == null) {
				continue;
			}

			int type = this.messageType[i];
			String sender = this.messageSender[i];

			byte modlevel = 0;
			if (sender != null && sender.startsWith("@cr1@")) {
				sender = sender.substring(5);
				modlevel = 1;
			}
			if (sender != null && sender.startsWith("@cr2@")) {
				sender = sender.substring(5);
				modlevel = 2;
			}

			if ((type == 3 || type == 7) && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
				int y = 329 - lineOffset * 13;
				int x = 4;

				font.drawString("From", 0, y, x);
				font.drawString("From", 65535, y - 1, x);
				x += font.stringWid("From ");

				if (modlevel == 1) {
					this.imageModIcons[0].plotSprite(x, y - 12);
					x += 14;
				} else if (modlevel == 2) {
					this.imageModIcons[1].plotSprite(x, y - 12);
					x += 14;
				}

				font.drawString(sender + ": " + this.messageText[i], 0, y, x);
				font.drawString(sender + ": " + this.messageText[i], 65535, y - 1, x);

				lineOffset++;
				if (lineOffset >= 5) {
					return;
				}
			} else if (type == 5 && this.chatPrivateMode < 2) {
				int y = 329 - lineOffset * 13;

				font.drawString(this.messageText[i], 0, y, 4);
				font.drawString(this.messageText[i], 65535, y - 1, 4);

				lineOffset++;
				if (lineOffset >= 5) {
					return;
				}
			} else if (type == 6 && this.chatPrivateMode < 2) {
				int y = 329 - lineOffset * 13;

				font.drawString("To " + sender + ": " + this.messageText[i], 0, y, 4);
				font.drawString("To " + sender + ": " + this.messageText[i], 65535, y - 1, 4);

				lineOffset++;
				if (lineOffset >= 5) {
					return;
				}
			}
		}
	}

	@ObfuscatedName("client.q(I)V")
	public final void updateWorldLocation() {
		int x = (localPlayer.x >> 7) + this.sceneBaseTileX;
		int z = (localPlayer.z >> 7) + this.sceneBaseTileZ;

		if (x >= 2944 && x < 3392 && z >= 3520 && z < 6400) {
			this.wildernessLevel = (z - 3520) / 8 + 1;
		} else if (x >= 2944 && x < 3392 && z >= 9920 && z < 12800) {
			this.wildernessLevel = (z - 9920) / 8 + 1;
		} else {
			this.wildernessLevel = 0;
		}

		this.worldLocationState = 0;

		if (x >= 3328 && x < 3392 && z >= 3200 && z < 3264) {
			int localX = x & 0x3F;
			int localZ = z & 0x3F;

			if (localX >= 4 && localX <= 29 && localZ >= 44 && localZ <= 58) {
				this.worldLocationState = 1;
			} else if (localX >= 36 && localX <= 61 && localZ >= 44 && localZ <= 58) {
				this.worldLocationState = 1;
			} else if (localX >= 4 && localX <= 29 && localZ >= 25 && localZ <= 39) {
				this.worldLocationState = 1;
			} else if (localX >= 36 && localX <= 61 && localZ >= 25 && localZ <= 39) {
				this.worldLocationState = 1;
			} else if (localX >= 4 && localX <= 29 && localZ >= 6 && localZ <= 20) {
				this.worldLocationState = 1;
			} else if (localX >= 36 && localX <= 61 && localZ >= 6 && localZ <= 20) {
				this.worldLocationState = 1;
			}
		}

		if (this.worldLocationState == 0 && x >= 3328 && x <= 3393 && z >= 3203 && z <= 3325) {
			this.worldLocationState = 2;
		}

		this.overrideChat = 0;
		if (x >= 3053 && x <= 3156 && z >= 3056 && z <= 3136) {
			this.overrideChat = 1;
		} else if (x >= 3072 && x <= 3118 && z >= 9492 && z <= 9535) {
			this.overrideChat = 1;
		}

		if (this.overrideChat == 1 && x >= 3139 && x <= 3199 && z >= 3008 && z <= 3062) {
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

		this.fontBold12.drawStringAntiMacro(true, loopCycle / 1000, 4, 15, 16777215, tooltip);
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

			this.fontBold12.drawStringTag(rgb, x + 3, true, optionY, this.menuOption[i]);
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIBIII)V")
	public final void drawMinimapLoc(int tileZ, int level, int doorRgb, int wallRgb, int tileX) {
		int typecode = this.scene.getWallTypecode(level, tileX, tileZ);
		if (typecode != 0) {
			int info = this.scene.getInfo(level, tileX, tileZ, typecode);
			int angle = info >> 6 & 0x3;
			int shape = info & 0x1F;

			int rgb = wallRgb;
			if (typecode > 0) {
				rgb = doorRgb;
			}

			int[] dst = this.imageMinimap.pixels;
			int offset = (103 - tileZ) * 512 * 4 + tileX * 4 + 24624;
			int locId = typecode >> 14 & 0x7FFF;

			LocType loc = LocType.get(locId);
			if (loc.mapscene == -1) {
				if (shape == 0 || shape == 2) {
					if (angle == 0) {
						dst[offset] = rgb;
						dst[offset + 512] = rgb;
						dst[offset + 1024] = rgb;
						dst[offset + 1536] = rgb;
					} else if (angle == 1) {
						dst[offset] = rgb;
						dst[offset + 1] = rgb;
						dst[offset + 2] = rgb;
						dst[offset + 3] = rgb;
					} else if (angle == 2) {
						dst[offset + 3] = rgb;
						dst[offset + 3 + 512] = rgb;
						dst[offset + 3 + 1024] = rgb;
						dst[offset + 3 + 1536] = rgb;
					} else if (angle == 3) {
						dst[offset + 1536] = rgb;
						dst[offset + 1536 + 1] = rgb;
						dst[offset + 1536 + 2] = rgb;
						dst[offset + 1536 + 3] = rgb;
					}
				}

				if (shape == 3) {
					if (angle == 0) {
						dst[offset] = rgb;
					} else if (angle == 1) {
						dst[offset + 3] = rgb;
					} else if (angle == 2) {
						dst[offset + 3 + 1536] = rgb;
					} else if (angle == 3) {
						dst[offset + 1536] = rgb;
					}
				}

				if (shape == 2) {
					if (angle == 3) {
						dst[offset] = rgb;
						dst[offset + 512] = rgb;
						dst[offset + 1024] = rgb;
						dst[offset + 1536] = rgb;
					} else if (angle == 0) {
						dst[offset] = rgb;
						dst[offset + 1] = rgb;
						dst[offset + 2] = rgb;
						dst[offset + 3] = rgb;
					} else if (angle == 1) {
						dst[offset + 3] = rgb;
						dst[offset + 3 + 512] = rgb;
						dst[offset + 3 + 1024] = rgb;
						dst[offset + 3 + 1536] = rgb;
					} else if (angle == 2) {
						dst[offset + 1536] = rgb;
						dst[offset + 1536 + 1] = rgb;
						dst[offset + 1536 + 2] = rgb;
						dst[offset + 1536 + 3] = rgb;
					}
				}
			} else {
				Pix8 scene = this.imageMapscene[loc.mapscene];
				if (scene != null) {
					int offsetX = (loc.width * 4 - scene.wi) / 2;
					int offsetY = (loc.length * 4 - scene.hi) / 2;
					scene.plotSprite(tileX * 4 + 48 + offsetX, (104 - tileZ - loc.length) * 4 + 48 + offsetY);
				}
			}
		}

		typecode = this.scene.getLocTypecode(level, tileX, tileZ);
		if (typecode != 0) {
			int info = this.scene.getInfo(level, tileX, tileZ, typecode);
			int angle = info >> 6 & 0x3;
			int shape = info & 0x1F;
			int locId = typecode >> 14 & 0x7FFF;

			LocType loc = LocType.get(locId);
			if (loc.mapscene == -1) {
				if (shape == 9) {
					int rgb = 15658734;
					if (typecode > 0) {
						rgb = 15597568;
					}

					int[] dst = this.imageMinimap.pixels;
					int offset = (103 - tileZ) * 512 * 4 + tileX * 4 + 24624;

					if (angle == 0 || angle == 2) {
						dst[offset + 1536] = rgb;
						dst[offset + 1024 + 1] = rgb;
						dst[offset + 512 + 2] = rgb;
						dst[offset + 3] = rgb;
					} else {
						dst[offset] = rgb;
						dst[offset + 512 + 1] = rgb;
						dst[offset + 1024 + 2] = rgb;
						dst[offset + 1536 + 3] = rgb;
					}
				}
			} else {
				Pix8 scene = this.imageMapscene[loc.mapscene];
				if (scene != null) {
					int offsetX = (loc.width * 4 - scene.wi) / 2;
					int offsetY = (loc.length * 4 - scene.hi) / 2;
					scene.plotSprite(tileX * 4 + 48 + offsetX, (104 - tileZ - loc.length) * 4 + 48 + offsetY);
				}
			}
		}

		typecode = this.scene.getGroundDecorTypecode(level, tileX, tileZ);
		if (typecode != 0) {
			int locId = typecode >> 14 & 0x7FFF;

			LocType loc = LocType.get(locId);
			if (loc.mapscene != -1) {
				Pix8 scene = this.imageMapscene[loc.mapscene];
				if (scene != null) {
					int offsetX = (loc.width * 4 - scene.wi) / 2;
					int offsetY = (loc.length * 4 - scene.hi) / 2;
					scene.plotSprite(tileX * 4 + 48 + offsetX, (104 - tileZ - loc.length) * 4 + 48 + offsetY);
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean interactWithLoc(int opcode, int x, int typecode, int z) {
		int locId = typecode >> 14 & 0x7FFF;
		int info = this.scene.getInfo(this.currentLevel, x, z, typecode);
		if (info == -1) {
			return false;
		}

		int shape = info & 0x1F;
		int angle = info >> 6 & 0x3;

		if (shape == 10 || shape == 11 || shape == 22) {
			LocType loc = LocType.get(locId);

			int width;
			int length;
			if (angle == 0 || angle == 2) {
				width = loc.width;
				length = loc.length;
			} else {
				width = loc.length;
				length = loc.width;
			}

			int forceapproach = loc.forceapproach;
			if (angle != 0) {
				forceapproach = (forceapproach >> 4 - angle) + (forceapproach << angle & 0xF);
			}

			this.tryMove(width, localPlayer.routeTileZ[0], forceapproach, 2, false, 0, x, 0, z, length, localPlayer.routeTileX[0]);
		} else {
			this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, angle, x, shape + 1, z, 0, localPlayer.routeTileX[0]);
		}

		this.crossX = super.mouseClickX;
		this.crossY = super.mouseClickY;
		this.crossMode = 2;
		this.crossCycle = 0;

		this.out.pIsaac(opcode);
		this.out.p2(this.sceneBaseTileX + x);
		this.out.p2(this.sceneBaseTileZ + z);
		this.out.p2(locId);
		return true;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(ZIIIIZIIIIII)Z")
	public final boolean tryMove(int locWidth, int srcZ, int arg3, int type, boolean tryNearest, int arg6, int dstX, int locShape, int dstZ, int locLength, int srcX) {
		byte sceneWidth = 104;
		byte sceneHeight = 104;

		for (int x = 0; x < sceneWidth; x++) {
			for (int z = 0; z < sceneHeight; z++) {
				this.bfsDirection[x][z] = 0;
				this.bfsCost[x][z] = 99999999;
			}
		}

		int x = srcX;
		int z = srcZ;
		this.bfsDirection[srcX][srcZ] = 99;
		this.bfsCost[srcX][srcZ] = 0;

		int steps = 0;
		int length = 0;
		this.bfsStepX[steps] = srcX;
		this.bfsStepZ[steps++] = srcZ;

		boolean arrived = false;
		int bufferSize = this.bfsStepX.length;
		int[][] flags = this.levelCollisionMap[this.currentLevel].flags;

		while (steps != length) {
			x = this.bfsStepX[length];
			z = this.bfsStepZ[length];
			length = (length + 1) % bufferSize;

			if (dstX == x && dstZ == z) {
				arrived = true;
				break;
			}

			if (locShape != 0) {
				if ((locShape < 5 || locShape == 10) && this.levelCollisionMap[this.currentLevel].testWall(dstX, locShape - 1, dstZ, z, x, arg6)) {
					arrived = true;
					break;
				}

				if (locShape < 10 && this.levelCollisionMap[this.currentLevel].testWDecor(z, x, dstX, true, locShape - 1, arg6, dstZ)) {
					arrived = true;
					break;
				}
			}

			if (locWidth != 0 && locLength != 0 && this.levelCollisionMap[this.currentLevel].testLoc(locWidth, x, dstX, dstZ, arg3, z, locLength)) {
				arrived = true;
				break;
			}

			int nextCost = this.bfsCost[x][z] + 1;
			if (x > 0 && this.bfsDirection[x - 1][z] == 0 && (flags[x - 1][z] & 0x280108) == 0) {
				this.bfsStepX[steps] = x - 1;
				this.bfsStepZ[steps] = z;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x - 1][z] = 2;
				this.bfsCost[x - 1][z] = nextCost;
			}

			if (x < sceneWidth - 1 && this.bfsDirection[x + 1][z] == 0 && (flags[x + 1][z] & 0x280180) == 0) {
				this.bfsStepX[steps] = x + 1;
				this.bfsStepZ[steps] = z;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x + 1][z] = 8;
				this.bfsCost[x + 1][z] = nextCost;
			}

			if (z > 0 && this.bfsDirection[x][z - 1] == 0 && (flags[x][z - 1] & 0x280102) == 0) {
				this.bfsStepX[steps] = x;
				this.bfsStepZ[steps] = z - 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x][z - 1] = 1;
				this.bfsCost[x][z - 1] = nextCost;
			}

			if (z < sceneHeight - 1 && this.bfsDirection[x][z + 1] == 0 && (flags[x][z + 1] & 0x280120) == 0) {
				this.bfsStepX[steps] = x;
				this.bfsStepZ[steps] = z + 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x][z + 1] = 4;
				this.bfsCost[x][z + 1] = nextCost;
			}

			if (x > 0 && z > 0 && this.bfsDirection[x - 1][z - 1] == 0 && (flags[x - 1][z - 1] & 0x28010E) == 0 && (flags[x - 1][z] & 0x280108) == 0 && (flags[x][z - 1] & 0x280102) == 0) {
				this.bfsStepX[steps] = x - 1;
				this.bfsStepZ[steps] = z - 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x - 1][z - 1] = 3;
				this.bfsCost[x - 1][z - 1] = nextCost;
			}

			if (x < sceneWidth - 1 && z > 0 && this.bfsDirection[x + 1][z - 1] == 0 && (flags[x + 1][z - 1] & 0x280183) == 0 && (flags[x + 1][z] & 0x280180) == 0 && (flags[x][z - 1] & 0x280102) == 0) {
				this.bfsStepX[steps] = x + 1;
				this.bfsStepZ[steps] = z - 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x + 1][z - 1] = 9;
				this.bfsCost[x + 1][z - 1] = nextCost;
			}

			if (x > 0 && z < sceneHeight - 1 && this.bfsDirection[x - 1][z + 1] == 0 && (flags[x - 1][z + 1] & 0x280138) == 0 && (flags[x - 1][z] & 0x280108) == 0 && (flags[x][z + 1] & 0x280120) == 0) {
				this.bfsStepX[steps] = x - 1;
				this.bfsStepZ[steps] = z + 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x - 1][z + 1] = 6;
				this.bfsCost[x - 1][z + 1] = nextCost;
			}

			if (x < sceneWidth - 1 && z < sceneHeight - 1 && this.bfsDirection[x + 1][z + 1] == 0 && (flags[x + 1][z + 1] & 0x2801E0) == 0 && (flags[x + 1][z] & 0x280180) == 0 && (flags[x][z + 1] & 0x280120) == 0) {
				this.bfsStepX[steps] = x + 1;
				this.bfsStepZ[steps] = z + 1;
				steps = (steps + 1) % bufferSize;
				this.bfsDirection[x + 1][z + 1] = 12;
				this.bfsCost[x + 1][z + 1] = nextCost;
			}
		}

		this.tryMoveNearest = 0;

		if (!arrived) {
			if (tryNearest) {
				int min = 100;
				for (int padding = 1; padding < 2; padding++) {
					for (int px = dstX - padding; px <= dstX + padding; px++) {
						for (int pz = dstZ - padding; pz <= dstZ + padding; pz++) {
							if (px >= 0 && pz >= 0 && px < 104 && pz < 104 && this.bfsCost[px][pz] < min) {
								min = this.bfsCost[px][pz];
								x = px;
								z = pz;
								this.tryMoveNearest = 1;
								arrived = true;
							}
						}
					}

					if (arrived) {
						break;
					}
				}
			}

			if (!arrived) {
				return false;
			}
		}

		length = 0;
		this.bfsStepX[length] = x;
		this.bfsStepZ[length++] = z;

		int dir;
		int next = dir = this.bfsDirection[x][z];
		while (srcX != x || srcZ != z) {
			if (dir != next) {
				dir = next;
				this.bfsStepX[length] = x;
				this.bfsStepZ[length++] = z;
			}

			if ((next & 0x2) != 0) {
				x++;
			} else if ((next & 0x8) != 0) {
				x--;
			}

			if ((next & 0x1) != 0) {
				z++;
			} else if ((next & 0x4) != 0) {
				z--;
			}

			next = this.bfsDirection[x][z];
		}

		if (length > 0) {
			bufferSize = length;
			if (length > 25) {
				bufferSize = 25;
			}

			length--;

			int startX = this.bfsStepX[length];
			int startZ = this.bfsStepZ[length];

			if (type == 0) {
				// MOVE_GAMECLICK
				this.out.pIsaac(63);
				this.out.p1(bufferSize + bufferSize + 3);
			} else if (type == 1) {
				// MOVE_MINIMAPCLICK
				this.out.pIsaac(56);
				this.out.p1(bufferSize + bufferSize + 3 + 14);
			} else if (type == 2) {
				// MOVE_OPCLICK
				this.out.pIsaac(167);
				this.out.p1(bufferSize + bufferSize + 3);
			}

			if (super.actionKey[5] == 1) {
				this.out.p1(1);
			} else {
				this.out.p1(0);
			}

			this.out.p2(this.sceneBaseTileX + startX);
			this.out.p2(this.sceneBaseTileZ + startZ);

			this.flagSceneTileX = this.bfsStepX[0];
			this.flagSceneTileZ = this.bfsStepZ[0];

			for (int i = 1; i < bufferSize; i++) {
				length--;
				this.out.p1(this.bfsStepX[length] - startX);
				this.out.p1(this.bfsStepZ[length] - startZ);
			}

			return true;
		} else if (type == 1) {
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
				this.psize = Protocol.SERVERPROT_LENGTH[this.ptype];
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

				String displayName = JString.formatDisplayName(JString.fromBase37(username));
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

				if (this.nextMidiSong != id && this.midiActive && !lowMem) {
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

				if (this.midiActive && !lowMem) {
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

				if (this.waveEnabled && !lowMem && this.waveCount < 50) {
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
				this.fontPlain12.centreString(257, 0, "Loading - please wait.", 151);
				this.fontPlain12.centreString(256, 16777215, "Loading - please wait.", 150);
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
					ClientNpc npc = this.npcs[i];

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
					ClientPlayer player = this.players[i];

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
								this.objStacks[level][x][z] = this.objStacks[level][lastX][lastZ];
							} else {
								this.objStacks[level][x][z] = null;
							}
						}
					}
				}

				for (LocChange loc = (LocChange) this.locChanges.head(); loc != null; loc = (LocChange) this.locChanges.next()) {
					loc.x -= dx;
					loc.z -= dz;

					if (loc.x < 0 || loc.z < 0 || loc.x >= 104 || loc.z >= 104) {
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
					// EVENT_TRACKING
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
				Component.types[comId].model = (localPlayer.appearance[8] << 6) + (localPlayer.appearance[0] << 12) + (localPlayer.colour[0] << 24) + (localPlayer.colour[4] << 18) + localPlayer.appearance[11];

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

					int distance = (int) Math.sqrt((dx * dx + dz * dz));

					this.cameraPitch = (int) (Math.atan2(dy, distance) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2(dx, dz) * -325.949D) & 0x7FF;

					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					} else if (this.cameraPitch > 383) {
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
						if (this.objStacks[this.currentLevel][x][z] != null) {
							this.objStacks[this.currentLevel][x][z] = null;
							this.sortObjStacks(x, z);
						}
					}
				}

				for (LocChange loc = (LocChange) this.locChanges.head(); loc != null; loc = (LocChange) this.locChanges.next()) {
					if (loc.x >= this.baseX && loc.x < this.baseX + 8 && loc.z >= this.baseZ && loc.z < this.baseZ + 8 && this.currentLevel == loc.level) {
						loc.endTime = 0;
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
							this.addMessage(filtered, "@cr2@" + JString.formatDisplayName(JString.fromBase37(from)), 7);
						} else if (staffModLevel == 1) {
							this.addMessage(filtered, "@cr1@" + JString.formatDisplayName(JString.fromBase37(from)), 7);
						} else {
							this.addMessage(filtered, JString.formatDisplayName(JString.fromBase37(from)), 3);
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
				int comId = this.in.g2();
				boolean hide = this.in.g1() == 1;
				Component.types[comId].hide = hide;

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
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int info = buf.g1();
			int shape = info >> 2;
			int angle = info & 0x3;
			int layer = this.LOC_SHAPE_TO_LAYER[shape];

			int id;
			if (ptype == 125) {
				id = -1;
			} else {
				id = buf.g2();
			}

			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				this.appendLoc(x, shape, -1, id, angle, layer, z, this.currentLevel, 0);
			}
		} else if (ptype == 155) {
			// LOC_ANIM
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int info = buf.g1();
			int shape = info >> 2;
			int angle = info & 0x3;
			int layer = this.LOC_SHAPE_TO_LAYER[shape];

			int id = buf.g2();

			if (x >= 0 && z >= 0 && x < 103 && z < 103) {
				int heightSW = this.levelHeightmap[this.currentLevel][x][z];
				int heightSE = this.levelHeightmap[this.currentLevel][x + 1][z];
				int heightNE = this.levelHeightmap[this.currentLevel][x + 1][z + 1];
				int heightNW = this.levelHeightmap[this.currentLevel][x][z + 1];

				if (layer == 0) {
					Wall wall = this.scene.getWall(x, z, this.currentLevel);
					if (wall != null) {
						int locId = wall.typecode1 >> 14 & 0x7FFF;
						if (shape == 2) {
							wall.model1 = new ClientLocAnim(heightNW, heightNE, heightSW, 2, angle + 4, false, heightSE, locId, id);
							wall.model2 = new ClientLocAnim(heightNW, heightNE, heightSW, 2, angle + 1 & 0x3, false, heightSE, locId, id);
						} else {
							wall.model1 = new ClientLocAnim(heightNW, heightNE, heightSW, shape, angle, false, heightSE, locId, id);
						}
					}
				} else if (layer == 1) {
					Decor decor = this.scene.getDecor(x, this.currentLevel, z);
					if (decor != null) {
						decor.model = new ClientLocAnim(heightNW, heightNE, heightSW, 4, 0, false, heightSE, decor.typecode >> 14 & 0x7FFF, id);
					}
				} else if (layer == 2) {
					Sprite sprite = this.scene.getSprite(this.currentLevel, z, x);
					if (shape == 11) {
						shape = 10;
					}

					if (sprite != null) {
						sprite.model = new ClientLocAnim(heightNW, heightNE, heightSW, shape, angle, false, heightSE, sprite.typecode >> 14 & 0x7FFF, id);
					}
				} else if (layer == 3) {
					GroundDecor decor = this.scene.getGroundDecor(x, z, this.currentLevel);
					if (decor != null) {
						decor.model = new ClientLocAnim(heightNW, heightNE, heightSW, 22, angle, false, heightSE, decor.typecode >> 14 & 0x7FFF, id);
					}
				}
			}
		} else if (ptype == 234) {
			// OBJ_ADD
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int id = buf.g2();
			int count = buf.g2();

			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				ClientObj obj = new ClientObj();
				obj.index = id;
				obj.count = count;

				if (this.objStacks[this.currentLevel][x][z] == null) {
					this.objStacks[this.currentLevel][x][z] = new LinkList();
				}

				this.objStacks[this.currentLevel][x][z].push(obj);
				this.sortObjStacks(x, z);
			}
		} else if (ptype == 39) {
			// OBJ_DEL
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int id = buf.g2();

			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				LinkList list = this.objStacks[this.currentLevel][x][z];
				if (list != null) {
					for (ClientObj obj = (ClientObj) list.head(); obj != null; obj = (ClientObj) list.next()) {
						if ((id & 0x7FFF) == obj.index) {
							obj.unlink();
							break;
						}
					}

					if (list.head() == null) {
						this.objStacks[this.currentLevel][x][z] = null;
					}

					this.sortObjStacks(x, z);
				}
			}
		} else if (ptype == 137) {
			// MAP_PROJANIM
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int dx = x + buf.g1b();
			int dz = z + buf.g1b();
			int target = buf.g2b();
			int spotanim = buf.g2();
			int srcHeight = buf.g1();
			int dstHeight = buf.g1();
			int startDelay = buf.g2();
			int endDelay = buf.g2();
			int peak = buf.g1();
			int arc = buf.g1();

			if (x >= 0 && z >= 0 && x < 104 && z < 104 && dx >= 0 && dz >= 0 && dx < 104 && dz < 104) {
				x = x * 128 + 64;
				z = z * 128 + 64;
				dx = dx * 128 + 64;
				dz = dz * 128 + 64;

				ClientProj proj = new ClientProj(x, spotanim, peak, dstHeight, this.currentLevel, z, this.getHeightmapY(z, this.currentLevel, x) - srcHeight, arc, loopCycle + startDelay, target, loopCycle + endDelay);
				proj.updateVelocity(dz, this.getHeightmapY(dz, this.currentLevel, dx) - dstHeight, dx, loopCycle + startDelay);
				this.projectiles.push(proj);
			}
		} else if (ptype == 198) {
			// MAP_ANIM
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int id = buf.g2();
			int height = buf.g1();
			int delay = buf.g2();

			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				x = x * 128 + 64;
				z = z * 128 + 64;

				MapSpotAnim spot = new MapSpotAnim(z, x, this.currentLevel, id, this.getHeightmapY(z, this.currentLevel, x) - height, loopCycle, delay);
				this.spotanims.push(spot);
			}
		} else if (ptype == 69) {
			// OBJ_REVEAL
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int id = buf.g2();
			int count = buf.g2();
			int receiver = buf.g2();

			if (x >= 0 && z >= 0 && x < 104 && z < 104 && this.localPid != receiver) {
				ClientObj obj = new ClientObj();
				obj.index = id;
				obj.count = count;

				if (this.objStacks[this.currentLevel][x][z] == null) {
					this.objStacks[this.currentLevel][x][z] = new LinkList();
				}

				this.objStacks[this.currentLevel][x][z].push(obj);
				this.sortObjStacks(x, z);
			}
		} else if (ptype == 29) {
			// LOC_MERGE
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int info = buf.g1();
			int shape = info >> 2;
			int angle = info & 0x3;
			int layer = this.LOC_SHAPE_TO_LAYER[shape];

			int id = buf.g2();
			int start = buf.g2();
			int end = buf.g2();
			int pid = buf.g2();
			byte east = buf.g1b();
			byte south = buf.g1b();
			byte west = buf.g1b();
			byte north = buf.g1b();

			ClientPlayer player;
			if (this.localPid == pid) {
				player = localPlayer;
			} else {
				player = this.players[pid];
			}

			if (player != null) {
				LocType loc = LocType.get(id);

				int heightSW = this.levelHeightmap[this.currentLevel][x][z];
				int heightSE = this.levelHeightmap[this.currentLevel][x + 1][z];
				int heightNE = this.levelHeightmap[this.currentLevel][x + 1][z + 1];
				int heightNW = this.levelHeightmap[this.currentLevel][x][z + 1];

				Model model = loc.getModel(shape, angle, heightSW, heightSE, heightNE, heightNW, -1);
				if (model != null) {
					this.appendLoc(x, 0, end + 1, -1, 0, layer, z, this.currentLevel, start + 1);

					player.locStartCycle = loopCycle + start;
					player.locStopCycle = loopCycle + end;
					player.locModel = model;

					int width = loc.width;
					int length = loc.length;
					if (angle == 1 || angle == 3) {
						width = loc.length;
						length = loc.width;
					}

					player.locOffsetX = x * 128 + width * 64;
					player.locOffsetZ = z * 128 + length * 64;
					player.locOffsetY = this.getHeightmapY(player.locOffsetZ, this.currentLevel, player.locOffsetX);

					if (east > west) {
						byte temp = east;
						east = west;
						west = temp;
					}

					if (south > north) {
						byte temp = south;
						south = north;
						north = temp;
					}

					player.minTileX = x + east;
					player.maxTileX = x + west;
					player.minTileZ = z + south;
					player.maxTileZ = z + north;
				}
			}
		} else if (ptype == 209) {
			// OBJ_COUNT
			int pos = buf.g1();
			int x = (pos >> 4 & 0x7) + this.baseX;
			int z = (pos & 0x7) + this.baseZ;

			int id = buf.g2();
			int oldCount = buf.g2();
			int newCount = buf.g2();

			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				LinkList list = this.objStacks[this.currentLevel][x][z];
				if (list != null) {
					for (ClientObj obj = (ClientObj) list.head(); obj != null; obj = (ClientObj) list.next()) {
						if ((id & 0x7FFF) == obj.index && obj.count == oldCount) {
							obj.count = newCount;
							break;
						}
					}

					this.sortObjStacks(x, z);
				}
			}
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void appendLoc(int x, int shape, int endTime, int type, int angle, int layer, int z, int currentLevel, int startTime) {
		LocChange loc = null;
		for (LocChange next = (LocChange) this.locChanges.head(); next != null; next = (LocChange) this.locChanges.next()) {
			if (next.level == currentLevel && next.x == x && next.z == z && next.layer == layer) {
				loc = next;
				break;
			}
		}

		if (loc == null) {
			loc = new LocChange();
			loc.level = currentLevel;
			loc.layer = layer;
			loc.x = x;
			loc.z = z;
			this.storeLoc(loc);
			this.locChanges.push(loc);
		}

		loc.newType = type;
		loc.newShape = shape;
		loc.newAngle = angle;
		loc.startTime = startTime;
		loc.endTime = endTime;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(BLob;)V")
	public final void storeLoc(LocChange loc) {
		int typecode = 0;
		int otherId = -1;
		int otherShape = 0;
		int otherAngle = 0;

		if (loc.layer == 0) {
			typecode = this.scene.getWallTypecode(loc.level, loc.x, loc.z);
		} else if (loc.layer == 1) {
			typecode = this.scene.getDecorTypecode(loc.z, loc.level, loc.x);
		} else if (loc.layer == 2) {
			typecode = this.scene.getLocTypecode(loc.level, loc.x, loc.z);
		} else if (loc.layer == 3) {
			typecode = this.scene.getGroundDecorTypecode(loc.level, loc.x, loc.z);
		}

		if (typecode != 0) {
			int var7 = this.scene.getInfo(loc.level, loc.x, loc.z, typecode);
			otherId = typecode >> 14 & 0x7FFF;
			otherShape = var7 & 0x1F;
			otherAngle = var7 >> 6;
		}

		loc.oldType = otherId;
		loc.oldShape = otherShape;
		loc.oldAngle = otherAngle;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIIIIII)V")
	public final void addLoc(int id, int x, int angle, int shape, int level, int z, int layer) {
		if (x < 1 || z < 1 || x > 102 || z > 102) {
			return;
		}

		if (lowMem && this.currentLevel != level) {
			return;
		}

		int typecode = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (layer == 0) {
			typecode = this.scene.getWallTypecode(level, x, z);
		} else if (layer == 1) {
			typecode = this.scene.getDecorTypecode(z, level, x);
		} else if (layer == 2) {
			typecode = this.scene.getLocTypecode(level, x, z);
		} else if (layer == 3) {
			typecode = this.scene.getGroundDecorTypecode(level, x, z);
		}

		if (typecode != 0) {
			int otherInfo = this.scene.getInfo(level, x, z, typecode);
			int otherId = typecode >> 14 & 0x7FFF;
			int otherShape = otherInfo & 0x1F;
			int otherAngle = otherInfo >> 6;

			if (layer == 0) {
				this.scene.removeWall(x, level, z);

				LocType loc = LocType.get(otherId);
				if (loc.blockwalk) {
					this.levelCollisionMap[level].delWall(loc.blockrange, z, otherAngle, otherShape, x);
				}
			} else if (layer == 1) {
				this.scene.removeDecor(z, x, level);
			} else if (layer == 2) {
				this.scene.removeLoc(x, z, level);

				LocType loc = LocType.get(otherId);
				if (loc.width + x > 103 || loc.width + z > 103 || loc.length + x > 103 || loc.length + z > 103) {
					return;
				}

				if (loc.blockwalk) {
					this.levelCollisionMap[level].delLoc(loc.width, z, x, loc.blockrange, loc.length, otherAngle);
				}
			} else if (layer == 3) {
				this.scene.removeGroundDecor(z, level, x);

				LocType loc = LocType.get(otherId);
				if (loc.blockwalk && loc.active) {
					this.levelCollisionMap[level].removeBlocked(z, x);
				}
			}
		}

		if (id >= 0) {
			int tileLevel = level;
			if (level < 3 && (this.levelTileFlags[1][x][z] & 0x2) == 2) {
				tileLevel = level + 1;
			}

			World.addLoc(x, shape, id, z, this.scene, angle, this.levelHeightmap, this.levelCollisionMap[level], tileLevel, level);
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.i(II)V")
	public final void sortObjStacks(int x, int z) {
		LinkList objStacks = this.objStacks[this.currentLevel][x][z];
		if (objStacks == null) {
			this.scene.removeGroundObj(this.currentLevel, x, z);
			return;
		}

		int topCost = -99999999;
		ClientObj topObj = null;
		for (ClientObj obj = (ClientObj) objStacks.head(); obj != null; obj = (ClientObj) objStacks.next()) {
			ObjType type = ObjType.get(obj.index);

			int cost = type.cost;
			if (type.stackable) {
				cost = (obj.count + 1) * cost;
			}

			if (cost > topCost) {
				topCost = cost;
				topObj = obj;
			}
		}

		objStacks.addHead(topObj);

		ClientObj bottomObj = null;
		ClientObj middleObj = null;

		for (ClientObj obj = (ClientObj) objStacks.head(); obj != null; obj = (ClientObj) objStacks.next()) {
			if (topObj.index != obj.index && bottomObj == null) {
				bottomObj = obj;
			}

			if (topObj.index != obj.index && bottomObj.index != obj.index && middleObj == null) {
				middleObj = obj;
			}
		}

		int typecode = (z << 7) + x + 0x60000000;
		this.scene.addGroundObject(typecode, this.getHeightmapY(z * 128 + 64, this.currentLevel, x * 128 + 64), x, z, middleObj, topObj, this.currentLevel, bottomObj);
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
			localPlayer.step(walkDir, false);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (op == 2) {
			int walkDir = buf.gBit(3);
			localPlayer.step(walkDir, true);

			int runDir = buf.gBit(3);
			localPlayer.step(runDir, true);

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
			ClientPlayer player = this.players[index];

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
					player.step(walkDir, false);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 2) {
					this.playerIds[this.playerCount++] = index;
					player.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					player.step(walkDir, true);

					int runDir = buf.gBit(3);
					player.step(runDir, true);

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
				this.players[index] = new ClientPlayer();

				if (this.playerAppearanceBuffer[index] != null) {
					this.players[index].read(this.playerAppearanceBuffer[index]);
				}
			}

			this.playerIds[this.playerCount++] = index;
			ClientPlayer player = this.players[index];
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
			ClientPlayer player = this.players[index];

			int mask = buf.g1();
			if ((mask & 0x80) == 128) {
				mask += buf.g1() << 8;
			}

			this.getPlayerExtendedInfo(mask, buf, index, player);
		}
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void getPlayerExtendedInfo(int mask, Packet buf, int index, ClientPlayer player) {
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
				int replaceMode = SeqType.types[seqId].duplicatebehavior;

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
				player.preanimRouteLength = player.routeLength;
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

			player.clearRoute();
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
			for (int i = count; i < this.npcCount; i++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[i];
			}
		}

		if (count > this.npcCount) {
			SignLink.reporterror(this.username + " Too many npcs");
			throw new RuntimeException("eek");
		}

		this.npcCount = 0;

		for (int i = 0; i < count; i++) {
			int index = this.npcIds[i];
			ClientNpc npc = this.npcs[index];

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
					npc.step(walkDir, false);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 2) {
					this.npcIds[this.npcCount++] = index;
					npc.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					npc.step(walkDir, true);

					int runDir = buf.gBit(3);
					npc.step(runDir, true);

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
				this.npcs[index] = new ClientNpc();
			}

			ClientNpc npc = this.npcs[index];
			this.npcIds[this.npcCount++] = index;

			npc.cycle = loopCycle;
			npc.type = NpcType.get(buf.gBit(11));
			npc.size = npc.type.size;
			npc.walkanim = npc.type.walkanim;
			npc.walkanim_b = npc.type.walkanim_b;
			npc.walkanim_l = npc.type.walkanim_r;
			npc.walkanim_r = npc.type.walkanim_l;
			npc.readyanim = npc.type.readyanim;

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
			ClientNpc npc = this.npcs[id];

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
					int restartMode = SeqType.types[seqId].duplicatebehavior;

					if (restartMode == 1) {
						npc.primarySeqFrame = 0;
						npc.primarySeqCycle = 0;
						npc.primarySeqDelay = delay;
						npc.primarySeqLoop = 0;
					} else if (restartMode == 2) {
						npc.primarySeqLoop = 0;
					}
				} else if (seqId == -1 || npc.primarySeqId == -1 || SeqType.types[seqId].priority >= SeqType.types[npc.primarySeqId].priority) {
					npc.primarySeqId = seqId;
					npc.primarySeqFrame = 0;
					npc.primarySeqCycle = 0;
					npc.primarySeqDelay = delay;
					npc.primarySeqLoop = 0;
					npc.preanimRouteLength = npc.routeLength;
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

				npc.walkanim = npc.type.walkanim;
				npc.walkanim_b = npc.type.walkanim_b;
				npc.walkanim_l = npc.type.walkanim_r;
				npc.walkanim_r = npc.type.walkanim_l;
				npc.readyanim = npc.type.readyanim;
			}

			if ((mask & 0x40) == 64) {
				// SPOTANIM
				npc.spotanimId = buf.g2();
				int info = buf.g4();

				npc.spotanimHeight = info >> 16;
				npc.spotanimLastCycle = (info & 0xFFFF) + loopCycle;
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
		int width = this.fontBold12.stringWid("Choose Option");

		for (int i = 0; i < this.menuSize; i++) {
			int maxWidth = this.fontBold12.stringWid(this.menuOption[i]);
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
			}
			if (x < 0) {
				x = 0;
			}

			int y = super.mouseClickY - 4;
			if (height + y > 334) {
				y = 334 - height;
			}
			if (y < 0) {
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
	public final void useMenuOption(int optionId) {
		if (optionId < 0) {
			return;
		}

		if (this.chatbackInputOpen) {
			this.chatbackInputOpen = false;
			this.redrawChatback = true;
		}

		int action = this.menuAction[optionId];
		int a = this.menuParamA[optionId];
		int b = this.menuParamB[optionId];
		int c = this.menuParamC[optionId];

		if (action >= 2000) {
			action -= 2000;
		}

		if (action == 1501) {
			oplogic6 += this.sceneBaseTileZ;
			if (oplogic6 >= 92) {
				// ANTICHEAT_OPLOGIC6
				this.out.pIsaac(177);
				this.out.p4(0);
			}

			// OPLOC5
			this.interactWithLoc(243, b, a, c);
		} else if (action == 34) {
			String option = this.menuOption[optionId];
			int tag = option.indexOf("@whi@");

			if (tag != -1) {
				this.closeInterfaces();

				this.reportAbuseInput = option.substring(tag + 5).trim();
				this.reportAbuseMuteOption = false;

				for (int i = 0; i < Component.types.length; i++) {
					if (Component.types[i] != null && Component.types[i].clientCode == 600) {
						this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.types[i].layer;
						break;
					}
				}
			}
		} else if (action == 367) {
			ClientPlayer player = this.players[a];
			if (player != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, player.routeTileX[0], 0, player.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				// OPPLAYERU
				this.out.pIsaac(48);
				this.out.p2(a);
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
			}
		} else if (action == 951) {
			Component com = Component.types[c];
			boolean notify = true;

			if (com.clientCode > 0) {
				notify = this.handleInterfaceAction(com);
			}

			if (notify) {
				// IF_BUTTON
				this.out.pIsaac(39);
				this.out.p2(c);
			}
		} else if (action == 217) {
			boolean success = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 0, localPlayer.routeTileX[0]);
			if (!success) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 1, localPlayer.routeTileX[0]);
			}

			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;

			// OPOBJU
			this.out.pIsaac(111);
			this.out.p2(this.sceneBaseTileX + b);
			this.out.p2(this.sceneBaseTileZ + c);
			this.out.p2(a);
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
		} else if (action == 450 && this.interactWithLoc(106, b, a, c)) {
			// OPLOCU
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);
		} else if (action == 265) {
			ClientNpc npc = this.npcs[a];
			if (npc != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, npc.routeTileX[0], 0, npc.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				// OPNPCT
				this.out.pIsaac(101);
				this.out.p2(a);
				this.out.p2(this.activeSpellId);
			}
		} else if (action == 364) {
			// OPLOC3
			this.interactWithLoc(19, b, a, c);
		} else if (action == 55 && this.interactWithLoc(182, b, a, c)) {
			// OPLOCT
			this.out.p2(this.activeSpellId);
		} else if (action == 224 || action == 993 || action == 99 || action == 746 || action == 877) {
			boolean success = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 0, localPlayer.routeTileX[0]);
			if (!success) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 1, localPlayer.routeTileX[0]);
			}

			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;

			if (action == 99) {
				// OPOBJ3
				this.out.pIsaac(27);
			} else if (action == 993) {
				// OPOBJ2
				this.out.pIsaac(110);
			} else if (action == 224) {
				// OPOBJ1
				this.out.pIsaac(231);
			} else if (action == 877) {
				// OPOBJ5
				this.out.pIsaac(225);
			} else if (action == 746) {
				// OPOBJ4
				this.out.pIsaac(17);
			}

			this.out.p2(this.sceneBaseTileX + b);
			this.out.p2(this.sceneBaseTileZ + c);
			this.out.p2(a);
		} else if (action == 581) {
			if ((a & 0x3) == 0) {
				oplogic1++;
			}

			if (oplogic1 >= 99) {
				// ANTICHEAT_OPLOGIC1
				this.out.pIsaac(47);
				this.out.p4(0);
			}

			// OPLOC4
			this.interactWithLoc(55, b, a, c);
		} else if (action == 679) {
			String option = this.menuOption[optionId];
			int tag = option.indexOf("@whi@");

			if (tag != -1) {
				long name37 = JString.toBase37(option.substring(tag + 5).trim());
				int friend = -1;

				for (int i = 0; i < this.friendCount; i++) {
					if (this.friendName37[i] == name37) {
						friend = i;
						break;
					}
				}

				if (friend != -1 && this.friendWorld[friend] > 0) {
					this.redrawChatback = true;
					this.chatbackInputOpen = false;
					this.showSocialInput = true;
					this.socialInput = "";
					this.socialInputType = 3;
					this.socialName37 = this.friendName37[friend];
					this.socialMessage = "Enter message to send to " + this.friendName[friend];
				}
			}
		} else if (action == 960) {
			// IF_BUTTON
			this.out.pIsaac(39);
			this.out.p2(c);

			Component com = Component.types[c];
			if (com.scripts != null && com.scripts[0][0] == 5) {
				int varp = com.scripts[0][1];
				if (this.varps[varp] != com.scriptOperand[0]) {
					this.varps[varp] = com.scriptOperand[0];
					this.updateVarp(varp);
					this.redrawSidebar = true;
				}
			}
		} else if (action == 1175) {
			int locId = a >> 14 & 0x7FFF;
			LocType loc = LocType.get(locId);

			String desc;
			if (loc.desc == null) {
				desc = "It's a " + loc.name + ".";
			} else {
				desc = new String(loc.desc);
			}

			this.addMessage(desc, "", 0);
		} else if (action == 881) {
			// OPHELDU
			this.out.pIsaac(58);
			this.out.p2(a);
			this.out.p2(b);
			this.out.p2(c);
			this.out.p2(this.objInterface);
			this.out.p2(this.objSelectedSlot);
			this.out.p2(this.objSelectedInterface);

			this.selectedCycle = 0;
			this.selectedInterface = c;
			this.selectedItem = b;
			this.selectedArea = 2;

			if (Component.types[c].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}

			if (Component.types[c].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		} else if (action == 44 && !this.pressedContinueOption) {
			// RESUME_PAUSEBUTTON
			this.out.pIsaac(11);
			this.out.p2(c);
			this.pressedContinueOption = true;
		}
		if (action == 285) {
			// OPLOC1
			this.interactWithLoc(238, b, a, c);
		} else if (action == 406 || action == 436 || action == 557 || action == 556) {
			String option = this.menuOption[optionId];
			int tag = option.indexOf("@whi@");

			if (tag != -1) {
				long name37 = JString.toBase37(option.substring(tag + 5).trim());

				if (action == 406) {
					this.addFriend(name37);
				} else if (action == 436) {
					this.addIgnore(name37);
				} else if (action == 557) {
					this.removeFriend(name37);
				} else if (action == 556) {
					this.removeIgnore(name37);
				}
			}
		} else if (action == 947) {
			this.closeInterfaces();
		} else if (action == 405 || action == 38 || action == 422 || action == 478 || action == 347) {
			if (action == 347) {
				// OPHELD5
				this.out.pIsaac(133);
			} else if (action == 422) {
				// OPHELD3
				this.out.pIsaac(221);
			} else if (action == 478) {
				if ((b & 0x3) == 0) {
					oplogic5++;
				}

				if (oplogic5 >= 90) {
					// ANTICHEAT_OPLOGIC5
					this.out.pIsaac(7);
				}

				// OPHELD4
				this.out.pIsaac(6);
			} else if (action == 405) {
				oplogic3 += a;
				if (oplogic3 >= 97) {
					// ANTICHEAT_OPLOGIC3
					this.out.pIsaac(37);
					this.out.p3(14953816);
				}

				// OPHELD1
				this.out.pIsaac(228);
			} else if (action == 38) {
				// OPHELD2
				this.out.pIsaac(166);
			}

			this.out.p2(a);
			this.out.p2(b);
			this.out.p2(c);

			this.selectedCycle = 0;
			this.selectedInterface = c;
			this.selectedItem = b;
			this.selectedArea = 2;

			if (Component.types[c].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}

			if (Component.types[c].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		} else if (action == 965) {
			boolean success = this.tryMove(0, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 0, localPlayer.routeTileX[0]);
			if (!success) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, b, 0, c, 1, localPlayer.routeTileX[0]);
			}

			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;

			// OPOBJT
			this.out.pIsaac(25);
			this.out.p2(this.sceneBaseTileX + b);
			this.out.p2(this.sceneBaseTileZ + c);
			this.out.p2(a);
			this.out.p2(this.activeSpellId);
		}
		if (action == 602 || action == 596 || action == 22 || action == 892 || action == 415) {
			if (action == 415) {
				if ((c & 0x3) == 0) {
					oplogic7++;
				}
				if (oplogic7 >= 55) {
					// ANTICHEAT_OPLOGIC7
					this.out.pIsaac(50);
					this.out.p4(0);
				}

				// INV_BUTTON5
				this.out.pIsaac(212);
			} else if (action == 22) {
				// INV_BUTTON3
				this.out.pIsaac(158);
			} else if (action == 596) {
				// INV_BUTTON2
				this.out.pIsaac(193);
			} else if (action == 892) {
				if ((b & 0x3) == 0) {
					oplogic9++;
				}
				if (oplogic9 >= 130) {
					// ANTICHEAT_OPLOGIC9
					this.out.pIsaac(169);
					this.out.p1(177);
				}

				// INV_BUTTON4
				this.out.pIsaac(204);
			} else if (action == 602) {
				// INV_BUTTON1
				this.out.pIsaac(153);
			}

			this.out.p2(a);
			this.out.p2(b);
			this.out.p2(c);

			this.selectedCycle = 0;
			this.selectedInterface = c;
			this.selectedItem = b;
			this.selectedArea = 2;

			if (Component.types[c].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}

			if (Component.types[c].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		} else if (action == 465) {
			// IF_BUTTON
			this.out.pIsaac(39);
			this.out.p2(c);

			Component com = Component.types[c];
			if (com.scripts != null && com.scripts[0][0] == 5) {
				int varp = com.scripts[0][1];
				this.varps[varp] = 1 - this.varps[varp];
				this.updateVarp(varp);
				this.redrawSidebar = true;
			}
		} else if (action == 900) {
			ClientNpc npc = this.npcs[a];
			if (npc != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, npc.routeTileX[0], 0, npc.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				// OPNPCU
				this.out.pIsaac(52);
				this.out.p2(a);
				this.out.p2(this.objInterface);
				this.out.p2(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
			}
		} else if (action == 188) {
			this.objSelected = 1;
			this.objSelectedSlot = b;
			this.objSelectedInterface = c;
			this.objInterface = a;
			this.objSelectedName = ObjType.get(a).name;
			this.spellSelected = 0;
			this.redrawSidebar = true;
			return;
		} else if (action == 728 || action == 542 || action == 6 || action == 963 || action == 245) {
			ClientNpc npc = this.npcs[a];
			if (npc != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, npc.routeTileX[0], 0, npc.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				if (action == 963) {
					// OPNPC4
					this.out.pIsaac(229);
				} else if (action == 6) {
					if ((a & 0x3) == 0) {
						oplogic2++;
					}

					if (oplogic2 >= 124) {
						// ANTICHEAT_OPLOGIC2
						this.out.pIsaac(218);
						this.out.p4(0);
					}

					// OPNPC3
					this.out.pIsaac(132);
				} else if (action == 245) {
					if ((a & 0x3) == 0) {
						oplogic4++;
					}
					if (oplogic4 >= 85) {
						// ANTICHEAT_OPLOGIC4
						this.out.pIsaac(34);
						this.out.p2(39596);
					}

					// OPNPC5
					this.out.pIsaac(102);
				} else if (action == 728) {
					// OPNPC1
					this.out.pIsaac(222);
				} else if (action == 542) {
					// OPNPC2
					this.out.pIsaac(84);
				}

				this.out.p2(a);
			}
		} else if (action == 391) {
			// OPHELDT
			this.out.pIsaac(143);
			this.out.p2(a);
			this.out.p2(b);
			this.out.p2(c);
			this.out.p2(this.activeSpellId);

			this.selectedCycle = 0;
			this.selectedInterface = c;
			this.selectedItem = b;
			this.selectedArea = 2;

			if (Component.types[c].layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}

			if (Component.types[c].layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		} else if (action == 930) {
			Component com = Component.types[c];
			this.spellSelected = 1;
			this.activeSpellId = c;
			this.activeSpellFlags = com.targetMask;
			this.objSelected = 0;
			this.redrawSidebar = true;

			String prefix = com.targetVerb;
			if (prefix.indexOf(" ") != -1) {
				prefix = prefix.substring(0, prefix.indexOf(" "));
			}

			String suffix = com.targetVerb;
			if (suffix.indexOf(" ") != -1) {
				suffix = suffix.substring(suffix.indexOf(" ") + 1);
			}

			this.spellCaption = prefix + " " + com.targetText + " " + suffix;

			if (this.activeSpellFlags == 16) {
				this.redrawSidebar = true;
				this.selectedTab = 3;
				this.redrawSideicons = true;
			}

			return;
		} else if (action == 660) {
			if (this.menuVisible) {
				this.scene.click(c - 4, b - 4);
			} else {
				this.scene.click(super.mouseClickY - 4, super.mouseClickX - 4);
			}
		} else if (action == 903 || action == 363) {
			String option = this.menuOption[optionId];
			int tag = option.indexOf("@whi@");

			if (tag != -1) {
				option = option.substring(tag + 5).trim();
				String name = JString.formatDisplayName(JString.fromBase37(JString.toBase37(option)));
				boolean found = false;

				for (int i = 0; i < this.playerCount; i++) {
					ClientPlayer player = this.players[this.playerIds[i]];

					if (player != null && player.name != null && player.name.equalsIgnoreCase(name)) {
						this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, player.routeTileX[0], 0, player.routeTileZ[0], 1, localPlayer.routeTileX[0]);

						if (action == 903) {
							// OPPLAYER4
							this.out.pIsaac(43);
						} else if (action == 363) {
							// OPPLAYER1
							this.out.pIsaac(211);
						}

						this.out.p2(this.playerIds[i]);
						found = true;
						break;
					}
				}

				if (!found) {
					this.addMessage("Unable to find " + name, "", 0);
				}
			}
		} else if (action == 1607) {
			ClientNpc npc = this.npcs[a];
			if (npc != null) {
				String desc;
				if (npc.type.desc == null) {
					desc = "It's a " + npc.type.name + ".";
				} else {
					desc = new String(npc.type.desc);
				}

				this.addMessage(desc, "", 0);
			}
		} else if (action == 651) {
			ClientPlayer player = this.players[a];
			if (player != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, player.routeTileX[0], 0, player.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				// OPPLAYERT
				this.out.pIsaac(73);
				this.out.p2(a);
				this.out.p2(this.activeSpellId);
			}
		} else if (action == 1102) {
			ObjType obj = ObjType.get(a);
			String desc;

			if (obj.desc == null) {
				desc = "It's a " + obj.name + ".";
			} else {
				desc = new String(obj.desc);
			}

			this.addMessage(desc, "", 0);
		} else if (action == 1373 || action == 1544 || action == 151 || action == 1101) {
			ClientPlayer player = this.players[a];
			if (player != null) {
				this.tryMove(1, localPlayer.routeTileZ[0], 0, 2, false, 0, player.routeTileX[0], 0, player.routeTileZ[0], 1, localPlayer.routeTileX[0]);

				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;

				if (action == 1544) {
					// OPPLAYER3
					this.out.pIsaac(64);
				} else if (action == 1373) {
					// OPPLAYER4
					this.out.pIsaac(43);
				} else if (action == 151) {
					oplogic8++;
					if (oplogic8 >= 90) {
						// ANTICHEAT_OPLOGIC8
						this.out.pIsaac(100);
						this.out.p2(31114);
					}

					// OPPLAYER2
					this.out.pIsaac(219);
				} else if (action == 1101) {
					// OPPLAYER1
					this.out.pIsaac(211);
				}

				this.out.p2(a);
			}
		} else if (action == 504) {
			// OPLOC2
			this.interactWithLoc(38, b, a, c);
		} else if (action == 1773) {
			ObjType obj = ObjType.get(a);
			String desc;

			if (c >= 100000) {
				desc = c + " x " + obj.name;
			} else if (obj.desc == null) {
				desc = "It's a " + obj.name + ".";
			} else {
				desc = new String(obj.desc);
			}

			this.addMessage(desc, "", 0);
		}

		this.objSelected = 0;
		this.spellSelected = 0;
		this.redrawSidebar = true;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIILgc;)V")
	public final void addNpcOptions(int c, int b, int a, NpcType npc) {
		if (this.menuSize >= 400) {
			return;
		}

		String tooltip = npc.name;
		if (npc.vislevel != 0) {
			tooltip = tooltip + getCombatLevelTag(npc.vislevel, localPlayer.vislevel) + " (level-" + npc.vislevel + ")";
		}

		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + tooltip;
			this.menuAction[this.menuSize] = 900;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			if (npc.op != null) {
				for (int i = 4; i >= 0; i--) {
					if (npc.op[i] != null && !npc.op[i].equalsIgnoreCase("attack")) {
						this.menuOption[this.menuSize] = npc.op[i] + " @yel@" + tooltip;

						if (i == 0) {
							this.menuAction[this.menuSize] = 728;
						} else if (i == 1) {
							this.menuAction[this.menuSize] = 542;
						} else if (i == 2) {
							this.menuAction[this.menuSize] = 6;
						} else if (i == 3) {
							this.menuAction[this.menuSize] = 963;
						} else if (i == 4) {
							this.menuAction[this.menuSize] = 245;
						}

						this.menuParamA[this.menuSize] = a;
						this.menuParamB[this.menuSize] = b;
						this.menuParamC[this.menuSize] = c;
						this.menuSize++;
					}
				}
			}

			if (npc.op != null) {
				for (int i = 4; i >= 0; i--) {
					if (npc.op[i] != null && npc.op[i].equalsIgnoreCase("attack")) {
						short action = 0;
						if (npc.vislevel > localPlayer.vislevel) {
							action = 2000;
						}

						this.menuOption[this.menuSize] = npc.op[i] + " @yel@" + tooltip;

						if (i == 0) {
							this.menuAction[this.menuSize] = action + 728;
						} else if (i == 1) {
							this.menuAction[this.menuSize] = action + 542;
						} else if (i == 2) {
							this.menuAction[this.menuSize] = action + 6;
						} else if (i == 3) {
							this.menuAction[this.menuSize] = action + 963;
						} else if (i == 4) {
							this.menuAction[this.menuSize] = action + 245;
						}

						this.menuParamA[this.menuSize] = a;
						this.menuParamB[this.menuSize] = b;
						this.menuParamC[this.menuSize] = c;
						this.menuSize++;
					}
				}
			}

			this.menuOption[this.menuSize] = "Examine @yel@" + tooltip;
			this.menuAction[this.menuSize] = 1607;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;
		} else if ((this.activeSpellFlags & 0x2) == 2) {
			this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + tooltip;
			this.menuAction[this.menuSize] = 265;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIIILbb;)V")
	public final void addPlayerOptions(int a, int b, int c, ClientPlayer player) {
		if (localPlayer == player || this.menuSize >= 400) {
			return;
		}

		String tooltip = player.name + getCombatLevelTag(player.vislevel, localPlayer.vislevel) + " (level-" + player.vislevel + ")";

		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + tooltip;
			this.menuAction[this.menuSize] = 367;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			this.menuOption[this.menuSize] = "Follow @whi@" + tooltip;
			this.menuAction[this.menuSize] = 1544;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;

			if (this.overrideChat == 0) {
				this.menuOption[this.menuSize] = "Trade with @whi@" + tooltip;
				this.menuAction[this.menuSize] = 1373;
				this.menuParamA[this.menuSize] = a;
				this.menuParamB[this.menuSize] = b;
				this.menuParamC[this.menuSize] = c;
				this.menuSize++;
			}

			if (this.wildernessLevel > 0) {
				this.menuOption[this.menuSize] = "Attack @whi@" + tooltip;
				if (localPlayer.vislevel >= player.vislevel) {
					this.menuAction[this.menuSize] = 151;
				} else {
					this.menuAction[this.menuSize] = 2151;
				}
				this.menuParamA[this.menuSize] = a;
				this.menuParamB[this.menuSize] = b;
				this.menuParamC[this.menuSize] = c;
				this.menuSize++;
			}

			if (this.worldLocationState == 1) {
				this.menuOption[this.menuSize] = "Fight @whi@" + tooltip;
				this.menuAction[this.menuSize] = 151;
				this.menuParamA[this.menuSize] = a;
				this.menuParamB[this.menuSize] = b;
				this.menuParamC[this.menuSize] = c;
				this.menuSize++;
			}

			if (this.worldLocationState == 2) {
				this.menuOption[this.menuSize] = "Duel-with @whi@" + tooltip;
				this.menuAction[this.menuSize] = 1101;
				this.menuParamA[this.menuSize] = a;
				this.menuParamB[this.menuSize] = b;
				this.menuParamC[this.menuSize] = c;
				this.menuSize++;
			}
		} else if ((this.activeSpellFlags & 0x8) == 8) {
			this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + tooltip;
			this.menuAction[this.menuSize] = 651;
			this.menuParamA[this.menuSize] = a;
			this.menuParamB[this.menuSize] = b;
			this.menuParamC[this.menuSize] = c;
			this.menuSize++;
		}

		for (int i = 0; i < this.menuSize; i++) {
			if (this.menuAction[i] == 660) {
				this.menuOption[i] = "Walk here @whi@" + tooltip;
				break;
			}
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String getCombatLevelTag(int otherLevel, int viewerLevel) {
		int diff = viewerLevel - otherLevel;
		if (diff < -9) {
			return "@red@";
		} else if (diff < -6) {
			return "@or3@";
		} else if (diff < -3) {
			return "@or2@";
		} else if (diff < 0) {
			return "@or1@";
		} else if (diff > 9) {
			return "@gre@";
		} else if (diff > 6) {
			return "@gr3@";
		} else if (diff > 3) {
			return "@gr2@";
		} else if (diff > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IIILd;I)V")
	public final void drawInterface(int scrollY, int y, Component com, int x) {
		if (com.type != 0 || com.children == null || com.hide && this.viewportHoveredInterfaceId != com.id && this.sidebarHoveredInterfaceId != com.id && this.chatHoveredInterfaceId != com.id) {
			return;
		}

		int left = Pix2D.left;
		int top = Pix2D.top;
		int right = Pix2D.right;
		int bottom = Pix2D.bottom;
		Pix2D.setClipping(com.width + x, com.height + y, y, x);

		int children = com.children.length;
		for (int i = 0; i < children; i++) {
			int childX = com.childX[i] + x;
			int childY = com.childY[i] + y - scrollY;

			Component child = Component.types[com.children[i]];
			childX += child.x;
			childY += child.y;

			if (child.clientCode > 0) {
				this.updateInterfaceContent(child);
			}

			if (child.type == 0) {
				if (child.scrollPosition > child.scroll - child.height) {
					child.scrollPosition = child.scroll - child.height;
				}

				if (child.scrollPosition < 0) {
					child.scrollPosition = 0;
				}

				this.drawInterface(child.scrollPosition, childY, child, childX);

				if (child.scroll > child.height) {
					this.drawScrollbar(child.width + childX, child.scroll, childY, child.scrollPosition, child.height);
				}
			} else if (child.type != 1) {
				if (child.type == 2) {
					int slot = 0;

					for (int row = 0; row < child.height; row++) {
						for (int col = 0; col < child.width; col++) {
							int slotX = (child.marginX + 32) * col + childX;
							int slotY = (child.marginY + 32) * row + childY;

							if (slot < 20) {
								slotX += child.invSlotOffsetX[slot];
								slotY += child.invSlotOffsetY[slot];
							}

							if (child.invSlotObjId[slot] > 0) {
								int dx = 0;
								int dy = 0;
								int id = child.invSlotObjId[slot] - 1;

								if (slotX > Pix2D.left - 32 && slotX < Pix2D.right && slotY > Pix2D.top - 32 && slotY < Pix2D.bottom || this.objDragArea != 0 && this.objDragSlot == slot) {
									int outline = 0;
									if (this.objSelected == 1 && this.objSelectedSlot == slot && this.objSelectedInterface == child.id) {
										outline = 16777215;
									}

									Pix32 icon = ObjType.getIcon(outline, child.invSlotObjCount[slot], id);
									if (icon != null) {
										if (this.objDragArea != 0 && this.objDragSlot == slot && this.objDragInterfaceId == child.id) {
											dx = super.mouseX - this.objGrabX;
											dy = super.mouseY - this.objGrabY;

											if (dx < 5 && dx > -5) {
												dx = 0;
											}

											if (dy < 5 && dy > -5) {
												dy = 0;
											}

											if (this.objDragCycles < 5) {
												dx = 0;
												dy = 0;
											}

											icon.transPlotSprite(slotX + dx, 128, slotY + dy);

											if (slotY + dy < Pix2D.top && com.scrollPosition > 0) {
												int autoscroll = (Pix2D.top - slotY - dy) * this.sceneDelta / 3;
												if (autoscroll > this.sceneDelta * 10) {
													autoscroll = this.sceneDelta * 10;
												}

												if (autoscroll > com.scrollPosition) {
													autoscroll = com.scrollPosition;
												}

												com.scrollPosition -= autoscroll;
												this.objGrabY += autoscroll;
											}

											if (slotY + dy + 32 > Pix2D.bottom && com.scrollPosition < com.scroll - com.height) {
												int autoscroll = (slotY + dy + 32 - Pix2D.bottom) * this.sceneDelta / 3;
												if (autoscroll > this.sceneDelta * 10) {
													autoscroll = this.sceneDelta * 10;
												}

												if (autoscroll > com.scroll - com.height - com.scrollPosition) {
													autoscroll = com.scroll - com.height - com.scrollPosition;
												}

												com.scrollPosition += autoscroll;
												this.objGrabY -= autoscroll;
											}
										} else if (this.selectedArea != 0 && this.selectedItem == slot && this.selectedInterface == child.id) {
											icon.transPlotSprite(slotX, 128, slotY);
										} else {
											icon.plotSprite(slotX, slotY);
										}

										if (icon.owi == 33 || child.invSlotObjCount[slot] != 1) {
											int count = child.invSlotObjCount[slot];
											this.fontPlain11.drawString(formatObjCount(count), 0, slotY + 10 + dy, slotX + 1 + dx);
											this.fontPlain11.drawString(formatObjCount(count), 16776960, slotY + 9 + dy, slotX + dx);
										}
									}
								}
							} else if (child.invSlotGraphic != null && slot < 20) {
								Pix32 image = child.invSlotGraphic[slot];
								if (image != null) {
									image.plotSprite(slotX, slotY);
								}
							}
							slot++;
						}
					}
				} else if (child.type == 3) {
					if (child.alpha == 0) {
						if (child.fill) {
							Pix2D.fillRect(child.colour, child.width, child.height, childX, childY);
						} else {
							Pix2D.drawRect(child.height, child.width, child.colour, childX, childY);
						}
					} else if (child.fill) {
						Pix2D.fillRectTrans(childY, 256 - (child.alpha & 0xFF), child.height, child.width, child.colour, childX);
					} else {
						Pix2D.drawRectTrans(child.height, child.colour, childX, childY, child.width, 256 - (child.alpha & 0xFF));
					}
				} else if (child.type == 4) {
					PixFont font = child.font;
					int colour = child.colour;
					String text = child.text;

					if ((this.chatHoveredInterfaceId == child.id || this.sidebarHoveredInterfaceId == child.id || this.viewportHoveredInterfaceId == child.id) && child.overColour != 0) {
						colour = child.overColour;
					}

					if (this.executeInterfaceScript(child)) {
						colour = child.activeColour;

						if (child.activeText.length() > 0) {
							text = child.activeText;
						}
					}

					if (child.buttonType == 6 && this.pressedContinueOption) {
						text = "Please wait...";
						colour = child.colour;
					}

					if (Pix2D.width2d == 479) {
						if (colour == 0xffff00) {
							colour = 0x0000ff;
						}

						if (colour == 0x00c000) {
							colour = 0xffffff;
						}
					}

					int lineY = font.height + childY;
					while (text.length() > 0) {
						if (text.indexOf("%") != -1) {
							label311: while (true) {
								int var35 = text.indexOf("%1");
								if (var35 == -1) {
									while (true) {
										int var36 = text.indexOf("%2");
										if (var36 == -1) {
											while (true) {
												int var37 = text.indexOf("%3");
												if (var37 == -1) {
													while (true) {
														int var38 = text.indexOf("%4");
														if (var38 == -1) {
															while (true) {
																int var39 = text.indexOf("%5");
																if (var39 == -1) {
																	break label311;
																}
																text = text.substring(0, var39) + this.getIntString(this.executeClientScript(child, 4)) + text.substring(var39 + 2);
															}
														}
														text = text.substring(0, var38) + this.getIntString(this.executeClientScript(child, 3)) + text.substring(var38 + 2);
													}
												}
												text = text.substring(0, var37) + this.getIntString(this.executeClientScript(child, 2)) + text.substring(var37 + 2);
											}
										}
										text = text.substring(0, var36) + this.getIntString(this.executeClientScript(child, 1)) + text.substring(var36 + 2);
									}
								}
								text = text.substring(0, var35) + this.getIntString(this.executeClientScript(child, 0)) + text.substring(var35 + 2);
							}
						}

						int newline = text.indexOf("\\n");
						String split;
						if (newline == -1) {
							split = text;
							text = "";
						} else {
							split = text.substring(0, newline);
							text = text.substring(newline + 2);
						}

						if (child.center) {
							font.centreStringTag(child.width / 2 + childX, child.shadowed, split, lineY, colour);
						} else {
							font.drawStringTag(colour, childX, child.shadowed, lineY, split);
						}

						lineY += font.height;
					}
				} else if (child.type == 5) {
					Pix32 image;
					if (this.executeInterfaceScript(child)) {
						image = child.activeGraphic;
					} else {
						image = child.graphic;
					}

					if (image != null) {
						image.plotSprite(childX, childY);
					}
				} else if (child.type == 6) {
					int tmpX = Pix3D.centerX;
					int tmpY = Pix3D.centerY;

					Pix3D.centerX = child.width / 2 + childX;
					Pix3D.centerY = child.height / 2 + childY;

					int eyeX = Pix3D.sinTable[child.xan] * child.zoom >> 16;
					int eyeY = Pix3D.cosTable[child.xan] * child.zoom >> 16;

					boolean active = this.executeInterfaceScript(child);

					int anim;
					if (active) {
						anim = child.activeAnim;
					} else {
						anim = child.anim;
					}

					Model model;
					if (anim == -1) {
						model = child.getModel(-1, -1, active);
					} else {
						SeqType seq = SeqType.types[anim];
						model = child.getModel(seq.frames[child.seqFrame], seq.iframes[child.seqFrame], active);
					}

					if (model != null) {
						model.drawSimple(0, child.yan, 0, child.xan, 0, eyeX, eyeY);
					}

					Pix3D.centerX = tmpX;
					Pix3D.centerY = tmpY;
				} else if (child.type == 7) {
					PixFont font = child.font;
					int slot = 0;
					for (int row = 0; row < child.height; row++) {
						for (int col = 0; col < child.width; col++) {
							if (child.invSlotObjId[slot] > 0) {
								ObjType obj = ObjType.get(child.invSlotObjId[slot] - 1);
								String text = obj.name;

								if (obj.stackable || child.invSlotObjCount[slot] != 1) {
									text = text + " x" + formatObjCountTagged(child.invSlotObjCount[slot]);
								}

								int textX = (child.marginX + 115) * col + childX;
								int textY = (child.marginY + 12) * row + childY;

								if (child.center) {
									font.centreStringTag(child.width / 2 + textX, child.shadowed, text, textY, child.colour);
								} else {
									font.drawStringTag(child.colour, textX, child.shadowed, textY, text);
								}
							}

							slot++;
						}
					}
				}
			}
		}

		Pix2D.setClipping(right, bottom, top, left);
	}

	@ObfuscatedName("client.a(IIIIBI)V")
	public final void drawScrollbar(int x, int scrollHeight, int y, int scrollY, int height) {
		this.imageScrollbar0.plotSprite(x, y);
		this.imageScrollbar1.plotSprite(x, y + height - 16);
		Pix2D.fillRect(this.SCROLLBAR_TRACK, 16, height - 32, x, y + 16);

		int gripSize = (height - 32) * height / scrollHeight;
		if (gripSize < 8) {
			gripSize = 8;
		}

		int gripY = (height - 32 - gripSize) * scrollY / (scrollHeight - height);
		Pix2D.fillRect(this.SCROLLBAR_GRIP_FOREGROUND, 16, gripSize, x, y + 16 + gripY);

		Pix2D.vline(x, this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, gripSize);
		Pix2D.vline(x + 1, this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, gripSize);

		Pix2D.hline(this.SCROLLBAR_GRIP_HIGHLIGHT, y + 16 + gripY, 16, x);
		Pix2D.hline(this.SCROLLBAR_GRIP_HIGHLIGHT, y + 17 + gripY, 16, x);

		Pix2D.vline(x + 15, this.SCROLLBAR_GRIP_LOWLIGHT, y + 16 + gripY, gripSize);
		Pix2D.vline(x + 14, this.SCROLLBAR_GRIP_LOWLIGHT, y + 17 + gripY, gripSize - 1);

		Pix2D.hline(this.SCROLLBAR_GRIP_LOWLIGHT, y + 15 + gripY + gripSize, 16, x);
		Pix2D.hline(this.SCROLLBAR_GRIP_LOWLIGHT, y + 14 + gripY + gripSize, 15, x + 1);
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
					register += localPlayer.vislevel;
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

		if ((clientCode >= 1 && clientCode <= 200) || (clientCode >= 701 && clientCode <= 900)) {
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
	public final boolean updateInterfaceAnimation(int delta, int id) {
		boolean updated = false;
		Component com = Component.types[id];

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

						if (child.seqFrame >= seq.numFrames) {
							child.seqFrame -= seq.loops;

							if (child.seqFrame < 0 || child.seqFrame >= seq.numFrames) {
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
	public final void updateVarp(int id) {
		int clientCode = VarpType.types[id].clientcode;
		if (clientCode == 0) {
			return;
		}

		int value = this.varps[id];
		if (clientCode == 1) {
			if (value == 1) {
				Pix3D.initColourTable(0.9D);
			} else if (value == 2) {
				Pix3D.initColourTable(0.8D);
			} else if (value == 3) {
				Pix3D.initColourTable(0.7D);
			} else if (value == 4) {
				Pix3D.initColourTable(0.6D);
			}

			ObjType.iconCache.clear();
			this.redrawFrame = true;
		} else if (clientCode == 3) {
			boolean lastMidiActive = this.midiActive;

			if (value == 0) {
				this.setMidiVolume(128, this.midiActive);
				this.midiActive = true;
			} else if (value == 1) {
				this.setMidiVolume(96, this.midiActive);
				this.midiActive = true;
			} else if (value == 2) {
				this.setMidiVolume(64, this.midiActive);
				this.midiActive = true;
			} else if (value == 3) {
				this.setMidiVolume(32, this.midiActive);
				this.midiActive = true;
			} else if (value == 4) {
				this.midiActive = false;
			}

			if (this.midiActive != lastMidiActive && !lowMem) {
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
				this.setWaveVolume(128);
			} else if (value == 1) {
				this.waveEnabled = true;
				this.setWaveVolume(96);
			} else if (value == 2) {
				this.waveEnabled = true;
				this.setWaveVolume(64);
			} else if (value == 3) {
				this.waveEnabled = true;
				this.setWaveVolume(32);
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

		if ((clientCode >= 1 && clientCode <= 100) || (clientCode >= 701 && clientCode <= 900)) {
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
				com.text = JString.formatDisplayName(JString.fromBase37(this.ignoreName37[clientCode]));
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
					if (kit >= 0 && !IdkType.types[kit].checkModel()) {
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
				model.applyTransform(SeqType.types[localPlayer.readyanim].frames[0]);
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
					com.text = "@whi@this world but member benefits are unavailabe whilst here."; // [sic]
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
	public final boolean handleInterfaceAction(Component com) {
		int clientCode = com.clientCode;

		if (clientCode == 201) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 1;
			this.socialMessage = "Enter name of friend to add to list";
		} else if (clientCode == 202) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 2;
			this.socialMessage = "Enter name of friend to delete from list";
		} else if (clientCode == 205) {
			this.idleTimeout = 250;
			return true;
		} else if (clientCode == 501) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 4;
			this.socialMessage = "Enter name of player to add to list";
		} else if (clientCode == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = false;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 5;
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
			// IF_PLAYERDESIGN
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
				// REPORT_ABUSE
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

		this.imageInvback.plotSprite(0, 0);

		if (this.sidebarInterfaceId != -1) {
			this.drawInterface(0, 0, Component.types[this.sidebarInterfaceId], 0);
		} else if (this.tabInterfaceId[this.selectedTab] != -1) {
			this.drawInterface(0, 0, Component.types[this.tabInterfaceId[this.selectedTab]], 0);
		}

		if (this.menuVisible && this.menuArea == 1) {
			this.drawMenu();
		}

		this.areaSidebar.draw(super.graphics, 553, 205);

		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.i(B)V")
	public final void drawChat() {
		this.areaChatback.bind();
		Pix3D.lineOffset = this.areaChatbackOffset;

		this.imageChatback.plotSprite(0, 0);

		if (this.showSocialInput) {
			this.fontBold12.centreString(239, 0, this.socialMessage, 40);
			this.fontBold12.centreString(239, 128, this.socialInput + "*", 60);
		} else if (this.chatbackInputOpen) {
			this.fontBold12.centreString(239, 0, "Enter amount:", 40);
			this.fontBold12.centreString(239, 128, this.chatbackInput + "*", 60);
		} else if (this.modalMessage != null) {
			this.fontBold12.centreString(239, 0, this.modalMessage, 40);
			this.fontBold12.centreString(239, 128, "Click to continue", 60);
		} else if (this.chatInterfaceId != -1) {
			this.drawInterface(0, 0, Component.types[this.chatInterfaceId], 0);
		} else if (this.stickyChatInterfaceId != -1) {
			this.drawInterface(0, 0, Component.types[this.stickyChatInterfaceId], 0);
		} else {
			PixFont font = this.fontPlain12;
			int line = 0;

			Pix2D.setClipping(463, 77, 0, 0);

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
								this.imageModIcons[0].plotSprite(x, y - 12);
								x += 14;
							} else if (modicon == 2) {
								this.imageModIcons[1].plotSprite(x, y - 12);
								x += 14;
							}
							font.drawString(sender + ":", 0, y, x);

							x += font.stringWid(sender) + 8;
							font.drawString(this.messageText[i], 255, y, x);
						}

						line++;
					} else if ((type == 3 || type == 7) && this.splitPrivateChat == 0 && (type == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							int x = 4;

							font.drawString("From", 0, y, x);
							x += font.stringWid("From ");

							if (modicon == 1) {
								this.imageModIcons[0].plotSprite(x, y - 12);
								x += 14;
							} else if (modicon == 2) {
								this.imageModIcons[1].plotSprite(x, y - 12);
								x += 14;
							}

							font.drawString(sender + ":", 0, y, x);
							x += font.stringWid(sender) + 8;

							font.drawString(this.messageText[i], 0x800000, y, x);
						}

						line++;
					} else if (type == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							font.drawString(sender + " " + this.messageText[i], 0x800080, y, 4);
						}

						line++;
					} else if (type == 5 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (y > 0 && y < 110) {
							font.drawString(this.messageText[i], 0x800000, y, 4);
						}

						line++;
					} else if (type == 6 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (y > 0 && y < 110) {
							font.drawString("To " + sender + ":", 0, y, 4);
							font.drawString(this.messageText[i], 0x800000, y, font.stringWid("To " + sender) + 12);
						}

						line++;
					} else if (type == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(sender))) {
						if (y > 0 && y < 110) {
							font.drawString(sender + " " + this.messageText[i], 0x7e3200, y, 4);
						}

						line++;
					}
				}
			}

			Pix2D.resetClipping();

			this.chatScrollHeight = line * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}

			this.drawScrollbar(463, this.chatScrollHeight, 0, this.chatScrollHeight - this.chatScrollOffset - 77, 77);

			String username;
			if (localPlayer == null || localPlayer.name == null) {
				username = JString.formatDisplayName(this.username);
			} else {
				username = localPlayer.name;
			}

			font.drawString(username + ":", 0, 90, 4);
			font.drawString(this.chatTyped + "*", 255, 90, font.stringWid(username + ": ") + 6);

			Pix2D.hline(0, 77, 479, 0);
		}

		if (this.menuVisible && this.menuArea == 2) {
			this.drawMenu();
		}

		this.areaChatback.draw(super.graphics, 17, 357);

		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.f(Z)V")
	public final void drawMinimap() {
		this.areaMapback.bind();

		int angle = (this.orbitCameraYaw + this.macroMinimapAngle) & 0x7FF;
		int anchorX = (localPlayer.x / 32) + 48;
		int anchorY = 464 - (localPlayer.z / 32);

		this.imageMinimap.drawRotatedMasked(25, anchorY, 146, this.macroMinimapZoom + 256, 5, angle, this.minimapMaskLineLengths, this.minimapMaskLineOffsets, anchorX, 151);
		this.imageCompass.drawRotatedMasked(0, 25, 33, 256, 0, this.orbitCameraYaw, this.compassMaskLineLengths, this.compassMaskLineOffsets, 25, 33);

		for (int i = 0; i < this.activeMapFunctionCount; i++) {
			int x = this.activeMapFunctionX[i] * 4 + 2 - localPlayer.x / 32;
			int y = this.activeMapFunctionZ[i] * 4 + 2 - localPlayer.z / 32;
			this.drawOnMinimap(x, this.activeMapFunctions[i], y);
		}

		for (int ltx = 0; ltx < 104; ltx++) {
			for (int ltz = 0; ltz < 104; ltz++) {
				LinkList objs = this.objStacks[this.currentLevel][ltx][ltz];

				if (objs != null) {
					int x = ((ltx * 4) + 2) - (localPlayer.x / 32);
					int y = ((ltz * 4) + 2) - (localPlayer.z / 32);
					this.drawOnMinimap(x, this.imageMapdot0, y);
				}
			}
		}

		for (int i = 0; i < this.npcCount; i++) {
			ClientNpc npc = this.npcs[this.npcIds[i]];

			if (npc != null && npc.isVisible() && npc.type.minimap) {
				int x = (npc.x / 32) - (localPlayer.x / 32);
				int y = (npc.z / 32) - (localPlayer.z / 32);
				this.drawOnMinimap(x, this.imageMapdot1, y);
			}
		}

		for (int i = 0; i < this.playerCount; i++) {
			ClientPlayer player = this.players[this.playerIds[i]];

			if (player != null && player.isVisible()) {
				int x = (player.x / 32) - (localPlayer.x / 32);
				int y = (player.z / 32) - (localPlayer.z / 32);

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
				ClientNpc npc = this.npcs[this.hintNpc];

				if (npc != null) {
					int x = npc.x / 32 - localPlayer.x / 32;
					int y = npc.z / 32 - localPlayer.z / 32;
					this.drawMinimapArrow(x, y, this.imageMapmarker1);
				}
			} else if (this.hintType == 2) {
				int x = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.x / 32;
				int y = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.z / 32;
				this.drawMinimapArrow(x, y, this.imageMapmarker1);
			} else if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
				ClientPlayer player = this.players[this.hintPlayer];

				if (player != null) {
					int x = player.x / 32 - localPlayer.x / 32;
					int y = player.z / 32 - localPlayer.z / 32;
					this.drawMinimapArrow(x, y, this.imageMapmarker1);
				}
			}
		}

		if (this.flagSceneTileX != 0) {
			int x = ((this.flagSceneTileX * 4) + 2) - (localPlayer.x / 32);
			int y = ((this.flagSceneTileZ * 4) + 2) - (localPlayer.z / 32);
			this.drawOnMinimap(x, this.imageMapmarker0, y);
		}

		Pix2D.fillRect(16777215, 3, 3, 97, 78);

		this.areaViewport.bind();
	}

	// note: placement confirmed by referencing OS1
	@ObfuscatedName("client.a(IBILjb;)V")
	public final void drawMinimapArrow(int dx, int dy, Pix32 image) {
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

		int var11 = (dx * cosAngle + dy * sinAngle) >> 16;
		int var12 = (dy * cosAngle - dx * sinAngle) >> 16;

		double var13 = Math.atan2(var11, var12);
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

		sinAngle = (sinAngle * 256) / (this.macroMinimapZoom + 256);
		cosAngle = (cosAngle * 256) / (this.macroMinimapZoom + 256);

		int x = (dx * cosAngle + dy * sinAngle) >> 16;
		int y = (dy * cosAngle - dx * sinAngle) >> 16;

		if (distance > 2500) {
			image.drawMasked(this.imageMapback, x + 94 - (image.owi / 2) + 4, 83 - y - (image.ohi / 2) - 4);
		} else {
			image.plotSprite(x + 94 - image.owi / 2 + 4, 83 - y - image.ohi / 2 - 4);
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
			return;
		} else if (this.friendCount >= 200) {
			this.addMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
			return;
		}

		String username = JString.formatDisplayName(JString.fromBase37(username37));
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

			// FRIENDLIST_ADD
			this.out.pIsaac(9);
			this.out.p8(username37);
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

				// FRIENDLIST_DEL
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

		String name = JString.formatDisplayName(JString.fromBase37(username37));
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

		// IGNORELIST_ADD
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

				// IGNORELIST_DEL
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
			} catch (Exception ignore) {
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

			for (int y = 0; y < image.hi; y++) {
				for (int x = 0; x < image.wi; x++) {
					if (image.pixels[off++] != 0) {
						int x0 = x + 16 + image.xof;
						int y0 = y + 16 + image.yof;
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
					int alpha = value;
					int invAlpha = 256 - value;
					value = this.flameGradient[value];
					int background = this.imageTitle0.data[dstOffset];

					this.imageTitle0.data[dstOffset++] = ((value & 0xFF00FF) * alpha + (background & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((value & 0xFF00) * alpha + (background & 0xFF00) * invAlpha & 0xFF0000) >> 8;
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
					int alpha = value;
					int invAlpha = 256 - value;
					value = this.flameGradient[value];
					int background = this.imageTitle1.data[dstOffset];

					this.imageTitle1.data[dstOffset++] = ((value & 0xFF00FF) * alpha + (background & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((value & 0xFF00) * alpha + (background & 0xFF00) * invAlpha & 0xFF0000) >> 8;
				}
			}

			srcOffset += 128 - step;
			dstOffset = 128 - step - offset + dstOffset;
		}

		this.imageTitle1.draw(super.graphics, 637, 0);
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int mix(int alpha, int src, int dst) {
		int invAlpha = 256 - alpha;
		return ((src & 0xFF00FF) * invAlpha + (dst & 0xFF00FF) * alpha & 0xFF00FF00) + ((src & 0xFF00) * invAlpha + (dst & 0xFF00) * alpha & 0xFF0000) >> 8;
	}
}
