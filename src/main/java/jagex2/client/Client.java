package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.Component;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.config.UnkType;
import jagex2.config.VarbitType;
import jagex2.config.VarpType;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.ClientEntity;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.ClientNpc;
import jagex2.dash3d.ClientObj;
import jagex2.dash3d.ClientPlayer;
import jagex2.dash3d.ClientProj;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Decor;
import jagex2.dash3d.GroundDecor;
import jagex2.dash3d.LocChange;
import jagex2.dash3d.MapSpotAnim;
import jagex2.dash3d.Model;
import jagex2.dash3d.Sprite;
import jagex2.dash3d.Wall;
import jagex2.dash3d.World;
import jagex2.dash3d.World3D;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix3D;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.jstring.JString;
import jagex2.sound.Wave;
import jagex2.wordenc.WordFilter;
import jagex2.wordenc.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import sign.signlink;

public class Client extends GameShell {

	@ObfuscatedName("client.K")
	public int[] jagChecksum = new int[9];

	@ObfuscatedName("client.M")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.P")
	public int[] CHAT_COLOURS = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.Q")
	public int[] skillExperience = new int[Stats.field1503];

	@ObfuscatedName("client.W")
	public String[] friendName = new String[200];

	@ObfuscatedName("client.Z")
	public int[] cameraModifierWobbleScale = new int[5];

	@ObfuscatedName("client.bb")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.ib")
	public String field157 = "";

	@ObfuscatedName("client.kb")
	public String[] field159 = new String[100];

	@ObfuscatedName("client.lb")
	public int[] field160 = new int[100];

	@ObfuscatedName("client.nb")
	public boolean showSocialInput = false;

	@ObfuscatedName("client.Ab")
	public int[][][] sceneMapRegion = new int[4][13][13];

	@ObfuscatedName("client.Gb")
	public int[][] bfsDirection = new int[104][104];

	@ObfuscatedName("client.Hb")
	public int[][] tileLastOccupiedCycle = new int[104][104];

	@ObfuscatedName("client.Rb")
	public Pix32[] imageCross = new Pix32[8];

	@ObfuscatedName("client.Vb")
	public boolean field196 = false;

	@ObfuscatedName("client.mc")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.pc")
	public int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.wc")
	public boolean[] cameraModifierEnabled = new boolean[5];

	@ObfuscatedName("client.yc")
	public Packet login = Packet.alloc(1);

	@ObfuscatedName("client.Ac")
	public int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("client.Bc")
	public int projectX = -1;

	@ObfuscatedName("client.Cc")
	public int projectY = -1;

	@ObfuscatedName("client.Ec")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.Gc")
	public String socialMessage = "";

	@ObfuscatedName("client.Jc")
	public int MAX_CHATS = 50;

	@ObfuscatedName("client.Kc")
	public int[] chatX = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Lc")
	public int[] chatY = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Mc")
	public int[] chatHeight = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Nc")
	public int[] chatWidth = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Oc")
	public int[] chatColour = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Pc")
	public int[] chatEffect = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Qc")
	public int[] chatTimer = new int[this.MAX_CHATS];

	@ObfuscatedName("client.Rc")
	public String[] chatMessage = new String[this.MAX_CHATS];

	@ObfuscatedName("client.Sc")
	public String chatbackInput = "";

	@ObfuscatedName("client.Tc")
	public boolean redrawSideicons = false;

	@ObfuscatedName("client.Xc")
	public Pix32[] imageHeadiconsHint = new Pix32[32];

	@ObfuscatedName("client.ad")
	public String loginMessage0 = "";

	@ObfuscatedName("client.bd")
	public String loginMessage1 = "";

	@ObfuscatedName("client.dd")
	public int fullscreenInterfaceId1 = -1;

	@ObfuscatedName("client.ed")
	public int localPid = -1;

	@ObfuscatedName("client.hd")
	public Packet out = Packet.alloc(1);

	@ObfuscatedName("client.ld")
	public int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.md")
	public int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.nd")
	public ClientPlayer[] players = new ClientPlayer[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.pd")
	public int[] playerIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.rd")
	public int[] entityUpdateIds = new int[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.sd")
	public Packet[] playerAppearanceBuffer = new Packet[this.MAX_PLAYER_COUNT];

	@ObfuscatedName("client.td")
	public Pix8[] imageSideicons = new Pix8[13];

	@ObfuscatedName("client.wd")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.xd")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.yd")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.zd")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.Fd")
	public int chatInterfaceId = -1;

	@ObfuscatedName("client.Id")
	public int[] cameraModifierWobbleSpeed = new int[5];

	@ObfuscatedName("client.Wd")
	public int[] varCache = new int[2000];

	@ObfuscatedName("client.be")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.he")
	public boolean errorStarted = false;

	@ObfuscatedName("client.ke")
	public int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.re")
	public String socialInput = "";

	@ObfuscatedName("client.ue")
	public int[] skillLevel = new int[Stats.field1503];

	@ObfuscatedName("client.we")
	public Pix32[] imageMapfunction = new Pix32[100];

	@ObfuscatedName("client.xe")
	public final int[] LOC_SHAPE_TO_LAYER = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Ee")
	public int[] varps = new int[2000];

	@ObfuscatedName("client.Le")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.Se")
	public int fullscreenInterfaceId0 = -1;

	@ObfuscatedName("client.Te")
	public int[] skillBaseLevel = new int[Stats.field1503];

	@ObfuscatedName("client.ef")
	public boolean menuVisible = false;

	@ObfuscatedName("client.gf")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.jf")
	public String[] playerOps = new String[5];

	@ObfuscatedName("client.kf")
	public boolean[] playerOpPrimary = new boolean[5];

	@ObfuscatedName("client.nf")
	public long[] ignoreName37 = new long[100];

	@ObfuscatedName("client.rf")
	public int[] activeMapFunctionX = new int[1000];

	@ObfuscatedName("client.sf")
	public int[] activeMapFunctionZ = new int[1000];

	@ObfuscatedName("client.tf")
	public Pix32[] imageHeadiconsPrayer = new Pix32[32];

	@ObfuscatedName("client.uf")
	public int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("client.vf")
	public int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Cf")
	public CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.Df")
	public int sidebarInterfaceId = -1;

	@ObfuscatedName("client.Ef")
	public int[] waveIds = new int[50];

	@ObfuscatedName("client.Gf")
	public String username = "";

	@ObfuscatedName("client.Hf")
	public String password = "";

	@ObfuscatedName("client.Lf")
	public boolean errorHost = false;

	@ObfuscatedName("client.Mf")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.Nf")
	public int[] designColours = new int[5];

	@ObfuscatedName("client.Sf")
	public String chatTyped = "";

	@ObfuscatedName("client.Tf")
	public int[] cameraModifierJitter = new int[5];

	@ObfuscatedName("client.Vf")
	public int chatScrollHeight = 78;

	@ObfuscatedName("client.lg")
	public int[] bfsStepX = new int[4000];

	@ObfuscatedName("client.mg")
	public int[] bfsStepZ = new int[4000];

	@ObfuscatedName("client.pg")
	public boolean scrollGrabbed = false;

	@ObfuscatedName("client.sg")
	public long[] friendName37 = new long[200];

	@ObfuscatedName("client.tg")
	public Packet field427 = new Packet(new byte[5000]);

	@ObfuscatedName("client.ug")
	public ClientNpc[] npcs = new ClientNpc[16384];

	@ObfuscatedName("client.wg")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.xg")
	public int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

	@ObfuscatedName("client.zg")
	public boolean ingame = false;

	@ObfuscatedName("client.Eg")
	public Pix8[] imageModIcons = new Pix8[2];

	@ObfuscatedName("client.Gg")
	public boolean designGender = true;

	@ObfuscatedName("client.Hg")
	public int[] cameraModifierCycle = new int[5];

	@ObfuscatedName("client.Pg")
	public Pix8[] imageMapscene = new Pix8[100];

	@ObfuscatedName("client.Rg")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.Zg")
	public boolean sceneInstanced = false;

	@ObfuscatedName("client.ch")
	public int[] flameLineOffset = new int[256];

	@ObfuscatedName("client.fh")
	public int viewportInterfaceId = -1;

	@ObfuscatedName("client.qh")
	public int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.rh")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.sh")
	public Pix32[] imageHitmarks = new Pix32[20];

	@ObfuscatedName("client.uh")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.yh")
	public Packet in = Packet.alloc(1);

	@ObfuscatedName("client.zh")
	public int[][] bfsCost = new int[104][104];

	@ObfuscatedName("client.Bh")
	public int stickyChatInterfaceId = -1;

	@ObfuscatedName("client.Th")
	public boolean awaitingSync = false;

	@ObfuscatedName("client.Uh")
	public LinkList spotanims = new LinkList();

	@ObfuscatedName("client.Vh")
	public boolean cutscene = false;

	@ObfuscatedName("client.Wh")
	public boolean redrawPrivacySettings = false;

	@ObfuscatedName("client.Xh")
	public int flashingTab = -1;

	@ObfuscatedName("client.mi")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.pi")
	public int reportAbuseInterfaceId = -1;

	@ObfuscatedName("client.si")
	public int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.xi")
	public boolean pressedContinueOption = false;

	@ObfuscatedName("client.yi")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Bi")
	public volatile boolean flameActive = false;

	@ObfuscatedName("client.Di")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.Hi")
	public Component chatInterface = new Component();

	@ObfuscatedName("client.Ji")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Oi")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.Qi")
	public int[] messageIds = new int[100];

	@ObfuscatedName("client.Ri")
	public int[] waveDelay = new int[50];

	@ObfuscatedName("client.Si")
	public CollisionMap[] levelCollisionMap = new CollisionMap[4];

	@ObfuscatedName("client.Ti")
	public LinkList locChanges = new LinkList();

	@ObfuscatedName("client.Xi")
	public boolean movingCamera = false;

	@ObfuscatedName("client.Yi")
	public boolean midiActive = true;

	@ObfuscatedName("client.Zi")
	public int[] friendWorld = new int[200];

	@ObfuscatedName("client.dj")
	public boolean midiFading = true;

	@ObfuscatedName("client.ej")
	public int lastWaveId = -1;

	@ObfuscatedName("client.hj")
	public boolean field571 = true;

	@ObfuscatedName("client.ij")
	public int minimapLevel = -1;

	@ObfuscatedName("client.jj")
	public boolean updateDesignModel = false;

	@ObfuscatedName("client.kj")
	public Pix32[] activeMapFunctions = new Pix32[1000];

	@ObfuscatedName("client.lj")
	public int viewportOverlayInterfaceId = -1;

	@ObfuscatedName("client.oj")
	public LinkList projectiles = new LinkList();

	@ObfuscatedName("client.pj")
	public boolean errorLoading = false;

	@ObfuscatedName("client.rj")
	public int selectedTab = 3;

	@ObfuscatedName("client.sj")
	public int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.tj")
	public int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("client.uj")
	public Pix32[] imageHeadiconsPk = new Pix32[32];

	@ObfuscatedName("client.wj")
	public int[] ANIMATED_TEXTURES = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Bj")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Cj")
	public int[] messageType = new int[100];

	@ObfuscatedName("client.Dj")
	public String[] messageSender = new String[100];

	@ObfuscatedName("client.Ej")
	public String[] messageText = new String[100];

	@ObfuscatedName("client.Hj")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.Uj")
	public volatile boolean flameActive0 = false;

	@ObfuscatedName("client.ak")
	public volatile boolean flamesCurrentlyRunning = false;

	@ObfuscatedName("client.bk")
	public int[] waveLoops = new int[50];

	@ObfuscatedName("client.dk")
	public LinkList[][][] objStacks = new LinkList[4][104][104];

	@ObfuscatedName("client.gk")
	public int[] designKits = new int[7];

	@ObfuscatedName("client.hk")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.N")
	public static BigInteger LOGIN_RSAN = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sc")
	public static int nodeId = 10;

	@ObfuscatedName("client.uc")
	public static boolean membersWorld = true;

	@ObfuscatedName("client.Vc")
	public static int[] field248 = new int[99];

	@ObfuscatedName("client.Yd")
	public static String CHARSET;

	@ObfuscatedName("client.Zd")
	public static final int[][] DESIGN_BODY_COLOUR;

	@ObfuscatedName("client.Yh")
	public static int[] field510;

	@ObfuscatedName("client.aj")
	public static final int[] DESIGN_HAIR_COLOUR;

	@ObfuscatedName("client.Wj")
	public static BigInteger LOGIN_RSAE;

	@ObfuscatedName("client.O")
	public static int field137;

	@ObfuscatedName("client.R")
	public int hintTileX;

	@ObfuscatedName("client.S")
	public int hintTileZ;

	@ObfuscatedName("client.T")
	public int hintHeight;

	@ObfuscatedName("client.U")
	public int hintOffsetX;

	@ObfuscatedName("client.V")
	public int hintOffsetZ;

	@ObfuscatedName("client.X")
	public int field146;

	@ObfuscatedName("client.Y")
	public int chatScrollOffset;

	@ObfuscatedName("client.ab")
	public int macroCameraX;

	@ObfuscatedName("client.cb")
	public int ignoreCount;

	@ObfuscatedName("client.gb")
	public int friendCount;

	@ObfuscatedName("client.hb")
	public int friendlistStatus;

	@ObfuscatedName("client.jb")
	public int field158;

	@ObfuscatedName("client.mb")
	public int field161;

	@ObfuscatedName("client.ob")
	public int staffModLevel;

	@ObfuscatedName("client.qb")
	public int psize;

	@ObfuscatedName("client.rb")
	public int ptype;

	@ObfuscatedName("client.sb")
	public int idleNetCycles;

	@ObfuscatedName("client.tb")
	public int noTimeoutCycle;

	@ObfuscatedName("client.ub")
	public int idleTimeout;

	@ObfuscatedName("client.vb")
	public int cutsceneSrcLocalTileX;

	@ObfuscatedName("client.wb")
	public int cutsceneSrcLocalTileZ;

	@ObfuscatedName("client.xb")
	public int cutsceneSrcHeight;

	@ObfuscatedName("client.yb")
	public int cutsceneMoveSpeed;

	@ObfuscatedName("client.zb")
	public int cutsceneMoveAcceleration;

	@ObfuscatedName("client.Ib")
	public int chatPrivateMode;

	@ObfuscatedName("client.Kb")
	public int sceneCenterZoneX;

	@ObfuscatedName("client.Lb")
	public int sceneCenterZoneZ;

	@ObfuscatedName("client.Ob")
	public int field189;

	@ObfuscatedName("client.Qb")
	public static int cyclelogic3;

	@ObfuscatedName("client.Yb")
	public int ptype0;

	@ObfuscatedName("client.Zb")
	public int ptype1;

	@ObfuscatedName("client.ac")
	public int ptype2;

	@ObfuscatedName("client.kc")
	public int lastHoveredInterfaceId;

	@ObfuscatedName("client.lc")
	public int macroMinimapAngle;

	@ObfuscatedName("client.tc")
	public static int portOffset;

	@ObfuscatedName("client.Ic")
	public int chatCount;

	@ObfuscatedName("client.Uc")
	public int sceneDelta;

	@ObfuscatedName("client.Yc")
	public int bankArrangeMode;

	@ObfuscatedName("client.od")
	public int playerCount;

	@ObfuscatedName("client.qd")
	public int entityUpdateCount;

	@ObfuscatedName("client.ud")
	public int titleLoginField;

	@ObfuscatedName("client.vd")
	public static int cyclelogic1;

	@ObfuscatedName("client.Gd")
	public int baseX;

	@ObfuscatedName("client.Hd")
	public int baseZ;

	@ObfuscatedName("client.Jd")
	public int daysOfMembersRemaining;

	@ObfuscatedName("client.Kd")
	public int field289;

	@ObfuscatedName("client.Ld")
	public int field290;

	@ObfuscatedName("client.Md")
	public int field291;

	@ObfuscatedName("client.Nd")
	public int field292;

	@ObfuscatedName("client.Od")
	public int field293;

	@ObfuscatedName("client.Pd")
	public int chatEffects;

	@ObfuscatedName("client.Vd")
	public int field300;

	@ObfuscatedName("client.Xd")
	public int chatPublicMode;

	@ObfuscatedName("client.ae")
	public int macroCameraZ;

	@ObfuscatedName("client.ce")
	public int field307;

	@ObfuscatedName("client.de")
	public int field308;

	@ObfuscatedName("client.ee")
	public static int field309;

	@ObfuscatedName("client.le")
	public int crossX;

	@ObfuscatedName("client.me")
	public int crossY;

	@ObfuscatedName("client.ne")
	public int crossCycle;

	@ObfuscatedName("client.oe")
	public int crossMode;

	@ObfuscatedName("client.ve")
	public int runweight;

	@ObfuscatedName("client.ze")
	public int recoveriesLastChangedDay;

	@ObfuscatedName("client.Ae")
	public int waveCount;

	@ObfuscatedName("client.Fe")
	public int sceneBaseTileX;

	@ObfuscatedName("client.Ge")
	public int sceneBaseTileZ;

	@ObfuscatedName("client.He")
	public int mapLastBaseX;

	@ObfuscatedName("client.Ie")
	public int mapLastBaseZ;

	@ObfuscatedName("client.Je")
	public int field340;

	@ObfuscatedName("client.Ke")
	public int macroMinimapCycle;

	@ObfuscatedName("client.Me")
	public int flameGradientCycle0;

	@ObfuscatedName("client.Ne")
	public int flameGradientCycle1;

	@ObfuscatedName("client.Oe")
	public static int field345;

	@ObfuscatedName("client.Pe")
	public int minimapType;

	@ObfuscatedName("client.Re")
	public static int oplogic4;

	@ObfuscatedName("client.We")
	public int systemUpdateTimer;

	@ObfuscatedName("client.cf")
	public int hoveredSlot;

	@ObfuscatedName("client.df")
	public int hoveredSlotInterfaceId;

	@ObfuscatedName("client.hf")
	public int membersAccount;

	@ObfuscatedName("client.lf")
	public int sceneState;

	@ObfuscatedName("client.pf")
	public int field371;

	@ObfuscatedName("client.qf")
	public int activeMapFunctionCount;

	@ObfuscatedName("client.wf")
	public static int field378;

	@ObfuscatedName("client.xf")
	public int daysSincePasswordChanged;

	@ObfuscatedName("client.Ff")
	public int currentLevel;

	@ObfuscatedName("client.If")
	public int dragCycles;

	@ObfuscatedName("client.Of")
	public static int oplogic1;

	@ObfuscatedName("client.Pf")
	public int flameCycle;

	@ObfuscatedName("client.Uf")
	public int chatHoveredInterfaceIndex;

	@ObfuscatedName("client.Zf")
	public int objDragInterfaceId;

	@ObfuscatedName("client.ag")
	public int objDragSlot;

	@ObfuscatedName("client.bg")
	public int objDragArea;

	@ObfuscatedName("client.cg")
	public int objGrabX;

	@ObfuscatedName("client.dg")
	public int objGrabY;

	@ObfuscatedName("client.gg")
	public int macroCameraCycle;

	@ObfuscatedName("client.ig")
	public int flagSceneTileX;

	@ObfuscatedName("client.jg")
	public int flagSceneTileZ;

	@ObfuscatedName("client.og")
	public int tryMoveNearest;

	@ObfuscatedName("client.qg")
	public int nextMusicDelay;

	@ObfuscatedName("client.rg")
	public int field425;

	@ObfuscatedName("client.vg")
	public int npcCount;

	@ObfuscatedName("client.Ag")
	public int sceneCycle;

	@ObfuscatedName("client.Bg")
	public static int oplogic5;

	@ObfuscatedName("client.Ig")
	public int objSelected;

	@ObfuscatedName("client.Jg")
	public int objSelectedSlot;

	@ObfuscatedName("client.Kg")
	public int objSelectedInterface;

	@ObfuscatedName("client.Lg")
	public int objInterface;

	@ObfuscatedName("client.Ng")
	public int hintPlayer;

	@ObfuscatedName("client.Og")
	public int privateMessageCount;

	@ObfuscatedName("client.Wg")
	public static int field456;

	@ObfuscatedName("client.Yg")
	public static int field458;

	@ObfuscatedName("client.bh")
	public static int oplogic2;

	@ObfuscatedName("client.eh")
	public static int field464;

	@ObfuscatedName("client.gh")
	public int currentDay;

	@ObfuscatedName("client.hh")
	public int spellSelected;

	@ObfuscatedName("client.ih")
	public int activeSpellId;

	@ObfuscatedName("client.jh")
	public int activeSpellFlags;

	@ObfuscatedName("client.ph")
	public int lastWaveLength;

	@ObfuscatedName("client.th")
	public int menuSize;

	@ObfuscatedName("client.Hh")
	public int hintType;

	@ObfuscatedName("client.Sh")
	public int field504;

	@ObfuscatedName("client.Zh")
	public int previousLoginDay;

	@ObfuscatedName("client.ai")
	public int cameraX;

	@ObfuscatedName("client.bi")
	public int cameraY;

	@ObfuscatedName("client.ci")
	public int cameraZ;

	@ObfuscatedName("client.di")
	public int cameraPitch;

	@ObfuscatedName("client.ei")
	public int cameraYaw;

	@ObfuscatedName("client.fi")
	public int socialInputType;

	@ObfuscatedName("client.gi")
	public int field518;

	@ObfuscatedName("client.hi")
	public int splitPrivateChat;

	@ObfuscatedName("client.ji")
	public int titleScreenState;

	@ObfuscatedName("client.ki")
	public int hintNpc;

	@ObfuscatedName("client.li")
	public int chatTradeMode;

	@ObfuscatedName("client.oi")
	public static int field526;

	@ObfuscatedName("client.ri")
	public int macroMinimapZoom;

	@ObfuscatedName("client.ti")
	public static int oplogic3;

	@ObfuscatedName("client.vi")
	public static int field533;

	@ObfuscatedName("client.wi")
	public int flameCycle0;

	@ObfuscatedName("client.zi")
	public int lastAddress;

	@ObfuscatedName("client.Ci")
	public int chatbackInputOpen;

	@ObfuscatedName("client.Ei")
	public int overrideChat;

	@ObfuscatedName("client.Ki")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Li")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.Mi")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.Ni")
	public int macroCameraAngle;

	@ObfuscatedName("client.Ui")
	public int orbitCameraX;

	@ObfuscatedName("client.Vi")
	public int orbitCameraZ;

	@ObfuscatedName("client.Wi")
	public int cameraPositionEventTimer;

	@ObfuscatedName("client.bj")
	public int objDragCycles;

	@ObfuscatedName("client.cj")
	public int midiSong;

	@ObfuscatedName("client.fj")
	public int unreadMessageCount;

	@ObfuscatedName("client.mj")
	public int sidebarHoveredInterfaceIndex;

	@ObfuscatedName("client.qj")
	public int field580;

	@ObfuscatedName("client.vj")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Aj")
	public int entityRemovalCount;

	@ObfuscatedName("client.Fj")
	public int field595;

	@ObfuscatedName("client.Gj")
	public int oneMouseButton;

	@ObfuscatedName("client.Ij")
	public int viewportHoveredInterfaceIndex;

	@ObfuscatedName("client.Jj")
	public int scrollInputPadding;

	@ObfuscatedName("client.Kj")
	public int menuArea;

	@ObfuscatedName("client.Lj")
	public int menuX;

	@ObfuscatedName("client.Mj")
	public int menuY;

	@ObfuscatedName("client.Nj")
	public int menuWidth;

	@ObfuscatedName("client.Oj")
	public int menuHeight;

	@ObfuscatedName("client.Pj")
	public static int drawCycle;

	@ObfuscatedName("client.Vj")
	public int field611;

	@ObfuscatedName("client.Zj")
	public int inMultizone;

	@ObfuscatedName("client.ck")
	public int lastProgressPercent;

	@ObfuscatedName("client.ek")
	public int runenergy;

	@ObfuscatedName("client.fk")
	public static int loopCycle;

	@ObfuscatedName("client.jk")
	public int selectedCycle;

	@ObfuscatedName("client.kk")
	public int selectedInterface;

	@ObfuscatedName("client.lk")
	public int selectedItem;

	@ObfuscatedName("client.mk")
	public int selectedArea;

	@ObfuscatedName("client.Xb")
	public long lastMouseClickTime;

	@ObfuscatedName("client.zc")
	public long serverSeed;

	@ObfuscatedName("client.Dg")
	public long socialName37;

	@ObfuscatedName("client.ni")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.Ii")
	public long lastWaveStartTime;

	@ObfuscatedName("client.Jb")
	public Jagfile jagTitle;

	@ObfuscatedName("client.Gi")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.ie")
	public Pix32 imageFlamesLeft;

	@ObfuscatedName("client.je")
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.Be")
	public Pix32 imageMapmarker0;

	@ObfuscatedName("client.Ce")
	public Pix32 imageMapmarker1;

	@ObfuscatedName("client.Af")
	public Pix32 imageOverlayMultiway;

	@ObfuscatedName("client.Qf")
	public Pix32 genderButtonImage0;

	@ObfuscatedName("client.Rf")
	public Pix32 genderButtonImage1;

	@ObfuscatedName("client.eg")
	public Pix32 imageCompass;

	@ObfuscatedName("client.kg")
	public Pix32 imageMinimap;

	@ObfuscatedName("client.Ch")
	public Pix32 imageMapdot0;

	@ObfuscatedName("client.Dh")
	public Pix32 imageMapdot1;

	@ObfuscatedName("client.Eh")
	public Pix32 imageMapdot2;

	@ObfuscatedName("client.Fh")
	public Pix32 imageMapdot3;

	@ObfuscatedName("client.Gh")
	public Pix32 imageMapdot4;

	@ObfuscatedName("client.Fi")
	public Pix32 imageMapedge;

	@ObfuscatedName("client.pe")
	public ClientStream stream;

	@ObfuscatedName("client.bc")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.cc")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.dc")
	public PixMap areaBackright1;

	@ObfuscatedName("client.ec")
	public PixMap areaBackright2;

	@ObfuscatedName("client.fc")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.gc")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.hc")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.ic")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.jc")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.Wf")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.Xf")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.Yf")
	public PixMap areaBackmid1;

	@ObfuscatedName("client.Sg")
	public PixMap areaSidebar;

	@ObfuscatedName("client.Tg")
	public PixMap areaMapback;

	@ObfuscatedName("client.Ug")
	public PixMap areaViewport;

	@ObfuscatedName("client.Vg")
	public PixMap areaChatback;

	@ObfuscatedName("client.Ih")
	public PixMap imageTitle2;

	@ObfuscatedName("client.Jh")
	public PixMap imageTitle3;

	@ObfuscatedName("client.Kh")
	public PixMap imageTitle4;

	@ObfuscatedName("client.Lh")
	public PixMap imageTitle0;

	@ObfuscatedName("client.Mh")
	public PixMap imageTitle1;

	@ObfuscatedName("client.Nh")
	public PixMap imageTitle5;

	@ObfuscatedName("client.Oh")
	public PixMap imageTitle6;

	@ObfuscatedName("client.Ph")
	public PixMap imageTitle7;

	@ObfuscatedName("client.Qh")
	public PixMap imageTitle8;

	@ObfuscatedName("client.Ye")
	public PixFont fontPlain11;

	@ObfuscatedName("client.Ze")
	public PixFont fontPlain12;

	@ObfuscatedName("client.af")
	public PixFont fontBold12;

	@ObfuscatedName("client.bf")
	public PixFont fontQuill8;

	@ObfuscatedName("client.ah")
	public World3D scene;

	@ObfuscatedName("client.Ub")
	public Isaac randomIn;

	@ObfuscatedName("client.Bb")
	public Pix8 imageRedstone1;

	@ObfuscatedName("client.Cb")
	public Pix8 imageRedstone2;

	@ObfuscatedName("client.Db")
	public Pix8 imageRedstone3;

	@ObfuscatedName("client.Eb")
	public Pix8 imageRedstone1h;

	@ObfuscatedName("client.Fb")
	public Pix8 imageRedstone2h;

	@ObfuscatedName("client.id")
	public Pix8 imageBackbase1;

	@ObfuscatedName("client.jd")
	public Pix8 imageBackbase2;

	@ObfuscatedName("client.kd")
	public Pix8 imageBackhmid1;

	@ObfuscatedName("client.Ad")
	public Pix8 imageRedstone1v;

	@ObfuscatedName("client.Bd")
	public Pix8 imageRedstone2v;

	@ObfuscatedName("client.Cd")
	public Pix8 imageRedstone3v;

	@ObfuscatedName("client.Dd")
	public Pix8 imageRedstone1hv;

	@ObfuscatedName("client.Ed")
	public Pix8 imageRedstone2hv;

	@ObfuscatedName("client.Jf")
	public Pix8 imageScrollbar0;

	@ObfuscatedName("client.Kf")
	public Pix8 imageScrollbar1;

	@ObfuscatedName("client.vh")
	public Pix8 imageInvback;

	@ObfuscatedName("client.wh")
	public Pix8 imageMapback;

	@ObfuscatedName("client.xh")
	public Pix8 imageChatback;

	@ObfuscatedName("client.yj")
	public Pix8 imageTitlebox;

	@ObfuscatedName("client.zj")
	public Pix8 imageTitlebutton;

	@ObfuscatedName("client.dh")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.xj")
	public OnDemand onDemand;

	@ObfuscatedName("client.se")
	public String lastProgressMessage;

	@ObfuscatedName("client.Xe")
	public String modalMessage;

	@ObfuscatedName("client.Mg")
	public String objSelectedName;

	@ObfuscatedName("client.kh")
	public String spellCaption;

	@ObfuscatedName("client.ii")
	public Socket field520;

	@ObfuscatedName("client.pb")
	public static boolean displayFps;

	@ObfuscatedName("client.vc")
	public static boolean lowMem;

	@ObfuscatedName("client.fd")
	public static boolean field258;

	@ObfuscatedName("client.Qd")
	public static boolean alreadyStarted;

	@ObfuscatedName("client.db")
	public int[] sceneMapIndex;

	@ObfuscatedName("client.eb")
	public int[] sceneMapLandFile;

	@ObfuscatedName("client.fb")
	public int[] sceneMapLocFile;

	@ObfuscatedName("client.Rd")
	public int[] areaChatbackOffset;

	@ObfuscatedName("client.Sd")
	public int[] areaSidebarOffset;

	@ObfuscatedName("client.Td")
	public int[] areaViewportOffset;

	@ObfuscatedName("client.Ud")
	public int[] areaFullscreenOffset;

	@ObfuscatedName("client.yf")
	public int[] flameBuffer3;

	@ObfuscatedName("client.zf")
	public int[] flameBuffer2;

	@ObfuscatedName("client.mh")
	public int[] flameBuffer0;

	@ObfuscatedName("client.nh")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Qj")
	public int[] flameGradient;

	@ObfuscatedName("client.Rj")
	public int[] flameGradient0;

	@ObfuscatedName("client.Sj")
	public int[] flameGradient1;

	@ObfuscatedName("client.Tj")
	public int[] flameGradient2;

	@ObfuscatedName("client.fg")
	public Pix8[] imageRunes;

	@ObfuscatedName("client.L")
	public byte[][] sceneMapLandData;

	@ObfuscatedName("client.qi")
	public byte[][] sceneMapLocData;

	@ObfuscatedName("client.ng")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("client.Mb")
	public int[][][] levelHeightmap;

	@ObfuscatedName("client.a(Ljava/lang/String;I)V")
	public void searchObjNames(String arg0) {
		if (arg0 == null || arg0.length() == 0) {
			this.field158 = 0;
			return;
		}
		String var3 = arg0;
		String[] var4 = new String[100];
		int var5 = 0;
		while (true) {
			int var6 = var3.indexOf(" ");
			if (var6 == -1) {
				String var8 = var3.trim();
				if (var8.length() > 0) {
					var4[var5++] = var8.toLowerCase();
				}
				this.field158 = 0;
				label56: for (int var9 = 0; var9 < ObjType.field817; var9++) {
					ObjType var10 = ObjType.get(var9);
					if (var10.field825 == -1 && var10.field811 != null) {
						String var11 = var10.field811.toLowerCase();
						for (int var12 = 0; var12 < var5; var12++) {
							if (var11.indexOf(var4[var12]) == -1) {
								continue label56;
							}
						}
						this.field159[this.field158] = var11;
						this.field160[this.field158] = var9;
						this.field158++;
						if (this.field158 >= this.field159.length) {
							return;
						}
					}
				}
				return;
			}
			String var7 = var3.substring(0, var6).trim();
			if (var7.length() > 0) {
				var4[var5++] = var7.toLowerCase();
			}
			var3 = var3.substring(var6 + 1);
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public void closeInterfaces() {
		// CLOSE_MODAL
		this.out.p1isaac(110);
		if (this.sidebarInterfaceId != -1) {
			this.unloadCom(this.sidebarInterfaceId);
			this.sidebarInterfaceId = -1;
			this.redrawSidebar = true;
			this.pressedContinueOption = false;
			this.redrawSideicons = true;
		}
		if (this.chatInterfaceId != -1) {
			this.unloadCom(this.chatInterfaceId);
			this.chatInterfaceId = -1;
			this.redrawChatback = true;
			this.pressedContinueOption = false;
		}
		if (this.fullscreenInterfaceId0 != -1) {
			this.unloadCom(this.fullscreenInterfaceId0);
			this.fullscreenInterfaceId0 = -1;
			this.redrawFrame = true;
		}
		if (this.fullscreenInterfaceId1 != -1) {
			this.unloadCom(this.fullscreenInterfaceId1);
			this.fullscreenInterfaceId1 = -1;
		}
		if (this.viewportInterfaceId != -1) {
			this.unloadCom(this.viewportInterfaceId);
			this.viewportInterfaceId = -1;
		}
	}

	@ObfuscatedName("client.a(IBLMFMVIYHT;)V")
	public void getPlayerNewVis(int psize, Packet buf) {
		while (buf.bitPos + 10 < psize * 8) {
			int index = buf.gBit(11);
			if (index == 2047) {
				break;
			}

			if (this.players[index] == null) {
				this.players[index] = new ClientPlayer();

				if (this.playerAppearanceBuffer[index] != null) {
					this.players[index].method574(this.playerAppearanceBuffer[index]);
				}
			}

			this.playerIds[this.playerCount++] = index;
			ClientPlayer player = this.players[index];
			player.cycle = loopCycle;

			int dx = buf.gBit(5);
			if (dx > 15) {
				dx -= 32;
			}

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = index;
			}

			int telejump = buf.gBit(1);

			int dz = buf.gBit(5);
			if (dz > 15) {
				dz -= 32;
			}

			player.move(localPlayer.routeTileZ[0] + dz, telejump == 1, localPlayer.routeTileX[0] + dx);
		}

		buf.accessBytes();
		this.ptype = -1;
	}

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
			} else if (args.length == 0) {
				// default args: 10 0 highmem members 32
				nodeId = 10;
				portOffset = 0;
				setHighMem();
				membersWorld = true;

				signlink.storeid = 32;
				signlink.startpriv(InetAddress.getLocalHost());

				Client app = new Client();
				app.initApplication(503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception ignore) {
		}
	}

	@ObfuscatedName("client.c(B)V")
	public void runFlames() {
		this.flamesCurrentlyRunning = true;
		try {
			long var3 = System.currentTimeMillis();
			int var5 = 0;
			int var6 = 20;
			while (this.flameActive) {
				this.flameCycle++;
				this.updateFlames();
				this.updateFlames();
				this.drawFlames();
				var5++;
				if (var5 > 10) {
					long var7 = System.currentTimeMillis();
					int var9 = (int) (var7 - var3) / 10 - var6;
					var6 = 40 - var9;
					if (var6 < 5) {
						var6 = 5;
					}
					var5 = 0;
					var3 = var7;
				}
				try {
					Thread.sleep((long) var6);
				} catch (Exception var10) {
				}
			}
		} catch (Exception var11) {
		}
		this.flamesCurrentlyRunning = false;
	}

	@ObfuscatedName("client.d(B)V")
	public void clearLocChanges() {
		for (LocChange var2 = (LocChange) this.locChanges.method6(); var2 != null; var2 = (LocChange) this.locChanges.method8()) {
			if (var2.field1322 == -1) {
				var2.field1327 = 0;
				this.storeLoc(var2);
			} else {
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public void showError(String err) {
		System.out.println(err);

		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + err + ".html"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		while (true) {
			try {
				Thread.sleep(1000L);
			} catch (Exception ignore) {
			}
		}
	}

	@ObfuscatedName("client.a(II)Ljava/lang/String;")
	public static String formatObjCount(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		} else if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		} else {
			return arg0 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.b(I)V")
	public void unload() {
		this.players = null;
		this.playerIds = null;
		this.entityUpdateIds = null;
		this.playerAppearanceBuffer = null;
		this.entityRemovalIds = null;
		this.areaBackleft1 = null;
		this.areaBackleft2 = null;
		this.areaBackright1 = null;
		this.areaBackright2 = null;
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
		this.friendName = null;
		this.friendName37 = null;
		this.friendWorld = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackmid1 = null;
		this.varps = null;
		this.sceneMapIndex = null;
		this.sceneMapLandData = null;
		this.sceneMapLocData = null;
		this.sceneMapLandFile = null;
		this.sceneMapLocFile = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;
		this.bfsDirection = null;
		this.bfsCost = null;
		this.bfsStepX = null;
		this.bfsStepZ = null;
		this.imageMapdot0 = null;
		this.imageMapdot1 = null;
		this.imageMapdot2 = null;
		this.imageMapdot3 = null;
		this.imageMapdot4 = null;
		if (this.mouseTracking != null) {
			this.mouseTracking.field94 = false;
		}
		this.mouseTracking = null;
		this.imageBackbase1 = null;
		this.imageBackbase2 = null;
		this.imageBackhmid1 = null;
		this.areaBacktop1 = null;
		this.areaBackvmid1 = null;
		this.areaBackvmid2 = null;
		this.areaBackvmid3 = null;
		this.areaBackhmid2 = null;
		this.levelHeightmap = null;
		this.levelTileFlags = null;
		this.scene = null;
		this.levelCollisionMap = null;
		this.imageMinimap = null;
		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageCompass = null;
		this.imageHitmarks = null;
		this.imageHeadiconsPk = null;
		this.imageHeadiconsPrayer = null;
		this.imageHeadiconsHint = null;
		this.imageCross = null;
		this.stopMidi();
		this.out = null;
		this.login = null;
		this.in = null;
		this.areaSidebar = null;
		this.areaMapback = null;
		this.areaViewport = null;
		this.areaChatback = null;
		this.imageInvback = null;
		this.imageMapback = null;
		this.imageChatback = null;
		try {
			if (this.stream != null) {
				this.stream.method233();
			}
		} catch (Exception var3) {
		}
		this.stream = null;
		this.activeMapFunctionX = null;
		this.activeMapFunctionZ = null;
		this.activeMapFunctions = null;
		this.npcs = null;
		this.npcIds = null;
		this.textureBuffer = null;
		this.field427 = null;
		this.imageMapscene = null;
		this.imageMapfunction = null;
		this.tileLastOccupiedCycle = null;
		this.imageSideicons = null;
		this.projectiles = null;
		this.spotanims = null;
		this.imageOverlayMultiway = null;
		if (this.onDemand != null) {
			this.onDemand.method596();
		}
		this.onDemand = null;
		this.menuParamB = null;
		this.menuParamC = null;
		this.menuAction = null;
		this.menuParamA = null;
		this.menuOption = null;
		this.objStacks = null;
		this.locChanges = null;
		this.unloadTitle();
		LocType.unload();
		NpcType.unload();
		ObjType.unload();
		Component.unload();
		FloType.field796 = null;
		IdkType.field1699 = null;
		UnkType.field66 = null;
		SeqType.field775 = null;
		SpotAnimType.field1297 = null;
		SpotAnimType.field1309 = null;
		VarpType.field1507 = null;
		super.drawArea = null;
		ClientPlayer.field1683 = null;
		Pix3D.unload();
		World3D.unload();
		Model.unload();
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.c(Z)V")
	public void handleTabInput() {
		if (super.mouseClickButton == 1) {
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
		}
	}

	@ObfuscatedName("client.e(I)V")
	public void updateOrbitCamera() {
		try {
			int var3 = localPlayer.field1157 + this.macroCameraX;
			int var4 = localPlayer.field1158 + this.macroCameraZ;
			if (this.orbitCameraX - var3 < -500 || this.orbitCameraX - var3 > 500 || this.orbitCameraZ - var4 < -500 || this.orbitCameraZ - var4 > 500) {
				this.orbitCameraX = var3;
				this.orbitCameraZ = var4;
			}
			if (this.orbitCameraX != var3) {
				this.orbitCameraX += (var3 - this.orbitCameraX) / 16;
			}
			if (this.orbitCameraZ != var4) {
				this.orbitCameraZ += (var4 - this.orbitCameraZ) / 16;
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
			int var5 = this.orbitCameraX >> 7;
			int var6 = this.orbitCameraZ >> 7;
			int var7 = this.getHeightmapY(this.orbitCameraZ, this.orbitCameraX, this.currentLevel);
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
			if (var13 > this.cameraPitchClamp) {
				this.cameraPitchClamp += (var13 - this.cameraPitchClamp) / 24;
			} else if (var13 < this.cameraPitchClamp) {
				this.cameraPitchClamp += (var13 - this.cameraPitchClamp) / 80;
			}
		} catch (Exception var14) {
			signlink.reporterror("glfc_ex " + localPlayer.field1157 + "," + localPlayer.field1158 + "," + this.orbitCameraX + "," + this.orbitCameraZ + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(LEWIXBTLV;I)Z")
	public boolean handleSocialMenuOption(Component arg0) {
		int var4 = arg0.clientCode;
		if (var4 >= 1 && var4 <= 200 || !(var4 < 701 || var4 > 900)) {
			if (var4 >= 801) {
				var4 -= 701;
			} else if (var4 >= 701) {
				var4 -= 601;
			} else if (var4 >= 101) {
				var4 -= 101;
			} else {
				var4--;
			}
			this.menuOption[this.menuSize] = "Remove @whi@" + this.friendName[var4];
			this.menuAction[this.menuSize] = 775;
			this.menuSize++;
			this.menuOption[this.menuSize] = "Message @whi@" + this.friendName[var4];
			this.menuAction[this.menuSize] = 984;
			this.menuSize++;
			return true;
		} else if (var4 >= 401 && var4 <= 500) {
			this.menuOption[this.menuSize] = "Remove @whi@" + arg0.text;
			this.menuAction[this.menuSize] = 859;
			this.menuSize++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.a(Z[BI)V")
	public void saveMidi(boolean arg0, byte[] arg1) {
		if (this.midiActive) {
			signlink.midifade = arg0 ? 1 : 0;
			signlink.midisave(arg1, arg1.length);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void validateCharacterDesign() {
		this.updateDesignModel = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.designKits[var2] = -1;
			for (int var3 = 0; var3 < IdkType.field1698; var3++) {
				if (!IdkType.field1699[var3].field1705 && IdkType.field1699[var3].field1700 == var2 + (this.designGender ? 0 : 7)) {
					this.designKits[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.b(II)V")
	public void sortObjStacks(int arg0, int arg1) {
		LinkList var3 = this.objStacks[this.currentLevel][arg0][arg1];
		if (var3 == null) {
			this.scene.method295(this.currentLevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.method6(); var6 != null; var6 = (ClientObj) var3.method8()) {
			ObjType var11 = ObjType.get(var6.field873);
			int var12 = var11.field827;
			if (var11.field853) {
				var12 = (var6.field875 + 1) * var12;
			}
			if (var12 > var4) {
				var4 = var12;
				var5 = var6;
			}
		}
		var3.method4(var5);
		ClientObj var7 = null;
		ClientObj var8 = null;
		for (ClientObj var9 = (ClientObj) var3.method6(); var9 != null; var9 = (ClientObj) var3.method8()) {
			if (var5.field873 != var9.field873 && var7 == null) {
				var7 = var9;
			}
			if (var5.field873 != var9.field873 && var7.field873 != var9.field873 && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.scene.method281(this.getHeightmapY(arg1 * 128 + 64, arg0 * 128 + 64, this.currentLevel), this.currentLevel, var5, var7, var10, var8, arg1, arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public static void setHighMem() {
		World3D.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		World.lowMem = false;
		LocType.lowMem = false;
	}

	@ObfuscatedName("client.e(B)V")
	public void updateGame() {
		if (this.systemUpdateTimer > 1) {
			this.systemUpdateTimer--;
		}

		if (this.idleTimeout > 0) {
			this.idleTimeout--;
		}

		for (int i = 0; i < 5 && this.readPacket(); i++) {
		}

		if (this.ingame) {
			Object lock = this.mouseTracking.lock;
			synchronized (lock) {
				if (!field258) {
					this.mouseTracking.field99 = 0;
				} else if (super.mouseClickButton != 0 || this.mouseTracking.field99 >= 40) {
					// EVENT_MOUSE_MOVE
					this.out.p1isaac(171);
					this.out.p1(0);
					int var4 = this.out.pos;
					int var5 = 0;
					for (int var6 = 0; var6 < this.mouseTracking.field99 && var4 - this.out.pos < 240; var6++) {
						var5++;
						int var7 = this.mouseTracking.field95[var6];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 502) {
							var7 = 502;
						}
						int var8 = this.mouseTracking.field100[var6];
						if (var8 < 0) {
							var8 = 0;
						} else if (var8 > 764) {
							var8 = 764;
						}
						int var9 = var7 * 765 + var8;
						if (this.mouseTracking.field95[var6] == -1 && this.mouseTracking.field100[var6] == -1) {
							var8 = -1;
							var7 = -1;
							var9 = 524287;
						}
						if (this.field307 != var8 || this.field308 != var7) {
							int var10 = var8 - this.field307;
							this.field307 = var8;
							int var11 = var7 - this.field308;
							this.field308 = var7;
							if (this.field595 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
								var10 += 32;
								var11 += 32;
								this.out.p2((this.field595 << 12) + (var10 << 6) + var11);
								this.field595 = 0;
							} else if (this.field595 < 8) {
								this.out.p3((this.field595 << 19) + 8388608 + var9);
								this.field595 = 0;
							} else {
								this.out.p4((this.field595 << 19) + -1073741824 + var9);
								this.field595 = 0;
							}
						} else if (this.field595 < 2047) {
							this.field595++;
						}
					}
					this.out.psize1(this.out.pos - var4);
					if (var5 >= this.mouseTracking.field99) {
						this.mouseTracking.field99 = 0;
					} else {
						this.mouseTracking.field99 -= var5;
						for (int var12 = 0; var12 < this.mouseTracking.field99; var12++) {
							this.mouseTracking.field100[var12] = this.mouseTracking.field100[var5 + var12];
							this.mouseTracking.field95[var12] = this.mouseTracking.field95[var5 + var12];
						}
					}
				}
			}

			if (super.mouseClickButton != 0) {
				long var13 = (super.mouseClickTime - this.lastMouseClickTime) / 50L;
				if (var13 > 4095L) {
					var13 = 4095L;
				}
				this.lastMouseClickTime = super.mouseClickTime;
				int var15 = super.mouseClickY;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 502) {
					var15 = 502;
				}
				int var16 = super.mouseClickX;
				if (var16 < 0) {
					var16 = 0;
				} else if (var16 > 764) {
					var16 = 764;
				}
				int var17 = var15 * 765 + var16;
				byte var18 = 0;
				if (super.mouseClickButton == 2) {
					var18 = 1;
				}
				int var19 = (int) var13;
				// EVENT_MOUSE_CLICK
				this.out.p1isaac(19);
				this.out.p4((var18 << 19) + (var19 << 20) + var17);
			}

			if (this.cameraPositionEventTimer > 0) {
				this.cameraPositionEventTimer--;
			}

			if (super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) {
				this.movingCamera = true;
			}

			if (this.movingCamera && this.cameraPositionEventTimer <= 0) {
				this.cameraPositionEventTimer = 20;
				this.movingCamera = false;

				// todo: camera position
				this.out.p1isaac(140);
				this.out.p2_alt1(this.orbitCameraPitch);
				this.out.p2_alt1(this.orbitCameraYaw);
			}

			if (super.hasFocus && !this.field571) {
				this.field571 = true;

				// todo: applet focus
				this.out.p1isaac(187);
				this.out.p1(1);
			}

			if (!super.hasFocus && this.field571) {
				this.field571 = false;

				// todo: applet focus
				this.out.p1isaac(187);
				this.out.p1(0);
			}

			this.updateSceneState();
			this.updateLocChanges();
			this.updateAudio();

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

						if (this.objDragInterfaceId == this.hoveredSlotInterfaceId && this.objDragSlot != this.hoveredSlot) {
							Component com = Component.get(this.objDragInterfaceId);

							byte mode = 0;
							if (this.bankArrangeMode == 1 && com.clientCode == 206) {
								mode = 1;
							}
							if (com.invSlotObjId[this.hoveredSlot] <= 0) {
								mode = 0;
							}

							if (com.swappable) {
								int src = this.objDragSlot;
								int dst = this.hoveredSlot;
								com.invSlotObjId[dst] = com.invSlotObjId[src];
								com.invSlotObjCount[dst] = com.invSlotObjCount[src];
								com.invSlotObjId[src] = -1;
								com.invSlotObjCount[src] = 0;
							} else if (mode == 1) {
								int src = this.objDragSlot;
								int dst = this.hoveredSlot;
								while (src != dst) {
									if (src > dst) {
										com.swapObj(src - 1, src);
										src--;
									} else if (src < dst) {
										com.swapObj(src + 1, src);
										src++;
									}
								}
							} else {
								com.swapObj(this.hoveredSlot, this.objDragSlot);
							}

							// INV_BUTTOND
							this.out.p1isaac(123);
							this.out.p2_alt3(this.hoveredSlot);
							this.out.p1_alt1(mode);
							this.out.p2_alt2(this.objDragInterfaceId);
							this.out.p2_alt1(this.objDragSlot);
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

			if (World3D.clickTileX != -1) {
				int x = World3D.clickTileX;
				int z = World3D.clickTileZ;
				boolean success = this.tryMove(true, false, z, localPlayer.routeTileZ[0], 0, 0, 0, 0, x, 0, 0, localPlayer.routeTileX[0]);
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

			if (this.fullscreenInterfaceId0 == -1) {
				this.handleMinimapInput();
				this.handleTabInput();
				this.handleChatModeInput();
			}

			if (super.mouseButton == 1 || super.mouseClickButton == 1) {
				this.dragCycles++;
			}

			if (this.field580 == 0 && this.field340 == 0 && this.field425 == 0) {
				if (this.field189 > 0) {
					this.field189--;
				}
			} else if (this.field189 < 100) {
				this.field189++;

				if (this.field189 == 100) {
					if (this.field580 != 0) {
						this.redrawChatback = true;
					}

					if (this.field340 != 0) {
						this.redrawSidebar = true;
					}
				}
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
				this.out.p1isaac(202);
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

			this.noTimeoutCycle++;
			if (this.noTimeoutCycle > 50) {
				// NO_TIMEOUT
				this.out.p1isaac(40);
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

	@ObfuscatedName("client.e(Z)V")
	public void applyCutscene() {
		int var2 = this.cutsceneSrcLocalTileX * 128 + 64;
		int var3 = this.cutsceneSrcLocalTileZ * 128 + 64;
		int var4 = this.getHeightmapY(var3, var2, this.currentLevel) - this.cutsceneSrcHeight;
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
		int var5 = this.field289 * 128 + 64;
		int var6 = this.field290 * 128 + 64;
		int var7 = this.getHeightmapY(var6, var5, this.currentLevel) - this.field291;
		int var8 = var5 - this.cameraX;
		int var9 = var7 - this.cameraY;
		int var10 = var6 - this.cameraZ;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		int var14 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.cameraPitch < var12) {
			this.cameraPitch += (var12 - this.cameraPitch) * this.field293 / 1000 + this.field292;
			if (this.cameraPitch > var12) {
				this.cameraPitch = var12;
			}
		}
		if (this.cameraPitch > var12) {
			this.cameraPitch -= (this.cameraPitch - var12) * this.field293 / 1000 + this.field292;
			if (this.cameraPitch < var12) {
				this.cameraPitch = var12;
			}
		}
		int var15 = var14 - this.cameraYaw;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 > 0) {
			this.cameraYaw += this.field293 * var15 / 1000 + this.field292;
			this.cameraYaw &= 0x7FF;
		}
		if (var15 < 0) {
			this.cameraYaw -= -var15 * this.field293 / 1000 + this.field292;
			this.cameraYaw &= 0x7FF;
		}
		int var16 = var14 - this.cameraYaw;
		if (var16 > 1024) {
			var16 -= 2048;
		}
		if (var16 < -1024) {
			var16 += 2048;
		}
		if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
			this.cameraYaw = var14;
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void handleInputKey() {
		while (true) {
			int key;
			do {
				while (true) {
					key = this.pollKey();
					if (key == -1) {
						return;
					}

					if (this.viewportInterfaceId != -1 && this.reportAbuseInterfaceId == this.viewportInterfaceId) {
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
								this.out.p1isaac(227);
								this.out.p1(0);

								int start = this.out.pos;
								this.out.p8(this.socialName37);
								WordPack.pack(this.socialInput, this.out);
								this.out.psize1(this.out.pos - start);

								this.socialInput = WordPack.toSentenceCase(this.socialInput);
								this.socialInput = WordFilter.filter(this.socialInput);

								this.addMessage(JString.formatDisplayName(JString.fromBase37(this.socialName37)), this.socialInput, 6);

								if (this.chatPrivateMode == 2) {
									this.chatPrivateMode = 1;
									this.redrawPrivacySettings = true;

									// CHAT_SETMODE
									this.out.p1isaac(176);
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
					} else if (this.chatbackInputOpen == 1) {
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
								this.out.p1isaac(75);
								this.out.p4(value);
							}

							this.chatbackInputOpen = 0;
							this.redrawChatback = true;
						}
					} else if (this.chatbackInputOpen == 2) {
						if (key >= 32 && key <= 122 && this.chatbackInput.length() < 12) {
							this.chatbackInput = this.chatbackInput + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}

						if (key == 13 || key == 10) {
							if (this.chatbackInput.length() > 0) {
								// RESUME_P_NAMEDIALOG
								this.out.p1isaac(206);
								this.out.p8(JString.toBase37(this.chatbackInput));
							}

							this.chatbackInputOpen = 0;
							this.redrawChatback = true;
						}
					} else if (this.chatbackInputOpen == 3) {
						if (key >= 32 && key <= 122 && this.chatbackInput.length() < 40) {
							this.chatbackInput = this.chatbackInput + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.chatbackInput.length() > 0) {
							this.chatbackInput = this.chatbackInput.substring(0, this.chatbackInput.length() - 1);
							this.redrawChatback = true;
						}
					} else if (this.chatInterfaceId == -1 && this.fullscreenInterfaceId0 == -1) {
						if (key >= 32 && (key <= 122 || (this.chatTyped.startsWith("::") && key <= 126)) && this.chatTyped.length() < 80) {
							this.chatTyped = this.chatTyped + (char) key;
							this.redrawChatback = true;
						}

						if (key == 8 && this.chatTyped.length() > 0) {
							this.chatTyped = this.chatTyped.substring(0, this.chatTyped.length() - 1);
							this.redrawChatback = true;
						}

						if ((key == 13 || key == 10) && this.chatTyped.length() > 0) {
							if (this.staffModLevel == 2) {
								if (this.chatTyped.equals("::clientdrop")) {
									this.tryReconnect();
								} else if (this.chatTyped.equals("::lag")) {
									this.lag();
								} else if (this.chatTyped.equals("::prefetchmusic")) {
									for (int i = 0; i < this.onDemand.getFileCount(2); i++) {
										this.onDemand.prefetch(2, (byte) 1, i);
									}
								} else if (this.chatTyped.equals("::fpson")) {
									displayFps = true;
								} else if (this.chatTyped.equals("::fpsoff")) {
									displayFps = false;
								} else if (this.chatTyped.equals("::noclip")) {
									for (int level = 0; level < 4; level++) {
										for (int x = 1; x < 103; x++) {
											for (int z = 1; z < 103; z++) {
												this.levelCollisionMap[level].field1585[x][z] = 0;
											}
										}
									}
								}
							}

							if (this.chatTyped.startsWith("::")) {
								// CLIENT_CHEAT
								this.out.p1isaac(56);
								this.out.p1(this.chatTyped.length() - 1);
								this.out.pjstr(this.chatTyped.substring(2));
							} else {
								String lower = this.chatTyped.toLowerCase();

								byte colour = 0;
								if (lower.startsWith("yellow:")) {
									colour = 0;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower.startsWith("red:")) {
									colour = 1;
									this.chatTyped = this.chatTyped.substring(4);
								} else if (lower.startsWith("green:")) {
									colour = 2;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower.startsWith("cyan:")) {
									colour = 3;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (lower.startsWith("purple:")) {
									colour = 4;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower.startsWith("white:")) {
									colour = 5;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower.startsWith("flash1:")) {
									colour = 6;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower.startsWith("flash2:")) {
									colour = 7;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower.startsWith("flash3:")) {
									colour = 8;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower.startsWith("glow1:")) {
									colour = 9;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower.startsWith("glow2:")) {
									colour = 10;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower.startsWith("glow3:")) {
									colour = 11;
									this.chatTyped = this.chatTyped.substring(6);
								}

								String lower2 = this.chatTyped.toLowerCase();
								byte effect = 0;
								if (lower2.startsWith("wave:")) {
									effect = 1;
									this.chatTyped = this.chatTyped.substring(5);
								} else if (lower2.startsWith("wave2:")) {
									effect = 2;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower2.startsWith("shake:")) {
									effect = 3;
									this.chatTyped = this.chatTyped.substring(6);
								} else if (lower2.startsWith("scroll:")) {
									effect = 4;
									this.chatTyped = this.chatTyped.substring(7);
								} else if (lower2.startsWith("slide:")) {
									effect = 5;
									this.chatTyped = this.chatTyped.substring(6);
								}

								// MESSAGE_PUBLIC
								this.out.p1isaac(49);
								this.out.p1(0);

								int start = this.out.pos;
								this.out.p1_alt2(colour);
								this.out.p1_alt1(effect);
								this.field427.pos = 0;
								WordPack.pack(this.chatTyped, this.field427);
								this.out.pdata(this.field427.data, this.field427.pos, 0);
								this.out.psize1(this.out.pos - start);

								this.chatTyped = WordPack.toSentenceCase(this.chatTyped);
								this.chatTyped = WordFilter.filter(this.chatTyped);

								localPlayer.chatMessage = this.chatTyped;
								localPlayer.chatColour = colour;
								localPlayer.chatEffect = effect;
								localPlayer.chatTimer = 150;

								if (this.staffModLevel == 2) {
									this.addMessage("@cr2@" + localPlayer.name, localPlayer.chatMessage, 2);
								} else if (this.staffModLevel == 1) {
									this.addMessage("@cr1@" + localPlayer.name, localPlayer.chatMessage, 2);
								} else {
									this.addMessage(localPlayer.name, localPlayer.chatMessage, 2);
								}

								if (this.chatPublicMode == 2) {
									this.chatPublicMode = 3;
									this.redrawPrivacySettings = true;
									// CHAT_SETMODE
									this.out.p1isaac(176);
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

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream openUrl(String arg0) throws IOException {
		if (this.field196) {
			if (this.field520 != null) {
				try {
					this.field520.close();
				} catch (Exception var4) {
				}
				this.field520 = null;
			}
			this.field520 = this.openSocket(43595);
			this.field520.setSoTimeout(10000);
			InputStream var2 = this.field520.getInputStream();
			OutputStream var3 = this.field520.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.g(I)Ljava/net/Socket;")
	public Socket openSocket(int port) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port) : signlink.opensocket(port);
	}

	@ObfuscatedName("client.h(I)Z")
	public boolean readPacket() {
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
			} else if (this.psize == -2) {
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

			if (this.ptype == 166) {
				// IF_SETPOSITION
				int var4 = this.in.g2b_alt1();
				int var5 = this.in.g2b_alt1();
				int var6 = this.in.g2();
				Component var7 = Component.get(var6);
				var7.field710 = var5;
				var7.field741 = var4;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 186) {
				// todo (setting model xan/yan/zoom)
				int var8 = this.in.g2_alt2();
				int var9 = this.in.g2_alt3();
				int var10 = this.in.g2_alt2();
				int var11 = this.in.g2_alt1();
				Component.get(var9).xan = var8;
				Component.get(var9).yan = var11;
				Component.get(var9).zoom = var10;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 216) {
				// IF_SETMODEL
				int var12 = this.in.g2_alt3();
				int var13 = this.in.g2_alt3();
				Component.get(var13).modelType = 1;
				Component.get(var13).model = var12;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 26) {
				// SYNTH_SOUND
				int var14 = this.in.g2();
				int var15 = this.in.g1();
				int var16 = this.in.g2();
				if (var16 == 65535) {
					if (this.waveCount < 50) {
						this.waveIds[this.waveCount] = (short) var14;
						this.waveLoops[this.waveCount] = var15;
						this.waveDelay[this.waveCount] = 0;
						this.waveCount++;
					}
				} else if (this.waveEnabled && !lowMem && this.waveCount < 50) {
					this.waveIds[this.waveCount] = var14;
					this.waveLoops[this.waveCount] = var15;
					this.waveDelay[this.waveCount] = Wave.field1472[var14] + var16;
					this.waveCount++;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 182) {
				// VARP_SMALL
				int var17 = this.in.g2_alt2();
				byte var18 = this.in.g1b_alt3();
				this.varCache[var17] = var18;
				if (this.varps[var17] != var18) {
					this.varps[var17] = var18;
					this.updateVarp(var17);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 13) {
				// RESET_ANIMS
				for (int var19 = 0; var19 < this.players.length; var19++) {
					if (this.players[var19] != null) {
						this.players[var19].field1171 = -1;
					}
				}
				for (int var20 = 0; var20 < this.npcs.length; var20++) {
					if (this.npcs[var20] != null) {
						this.npcs[var20].field1171 = -1;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 156) {
				// MINIMAP_TOGGLE
				this.minimapType = this.in.g1();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 162) {
				// IF_SETNPCHEAD
				int var21 = this.in.g2_alt2();
				int var22 = this.in.g2_alt1();
				Component.get(var22).modelType = 2;
				Component.get(var22).model = var21;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 109) {
				// IF_OPENCHAT
				int var23 = this.in.g2();
				this.resetInterfaceAnimation(var23);
				if (this.sidebarInterfaceId != -1) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.fullscreenInterfaceId0 != -1) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = -1;
					this.redrawFrame = true;
				}
				if (this.fullscreenInterfaceId1 != -1) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = -1;
				}
				if (this.viewportInterfaceId != -1) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = -1;
				}
				if (this.chatInterfaceId != var23) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = var23;
				}
				this.pressedContinueOption = false;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 220) {
				// MIDI_SONG
				int var24 = this.in.g2_alt3();
				if (var24 == 65535) {
					var24 = -1;
				}
				if (this.nextMidiSong != var24 && this.midiActive && !lowMem && this.nextMusicDelay == 0) {
					this.midiSong = var24;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
				}
				this.nextMidiSong = var24;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 249) {
				// MIDI_JINGLE
				int var25 = this.in.g2_alt1();
				int var26 = this.in.g3_alt3();
				if (this.midiActive && !lowMem) {
					this.midiSong = var25;
					this.midiFading = false;
					this.onDemand.request(2, this.midiSong);
					this.nextMusicDelay = var26;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 158) {
				// TUT_OPEN
				int var27 = this.in.g2b_alt1();
				if (this.stickyChatInterfaceId != var27) {
					this.unloadCom(this.stickyChatInterfaceId);
					this.stickyChatInterfaceId = var27;
				}
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 218) {
				// IF_SETCOLOUR
				int var28 = this.in.g2();
				int var29 = this.in.g2_alt2();
				int var30 = var29 >> 10 & 0x1F;
				int var31 = var29 >> 5 & 0x1F;
				int var32 = var29 & 0x1F;
				Component.get(var28).colour = (var32 << 3) + (var30 << 19) + (var31 << 11);
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 157) {
				// SET_PLAYER_OP
				int var33 = this.in.g1_alt2();
				String var34 = this.in.gjstr();
				int var35 = this.in.g1();
				if (var33 >= 1 && var33 <= 5) {
					if (var34.equalsIgnoreCase("null")) {
						var34 = null;
					}
					this.playerOps[var33 - 1] = var34;
					this.playerOpPrimary[var33 - 1] = var35 == 0;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 6) {
				// P_NAMEDIALOG
				this.showSocialInput = false;
				this.chatbackInputOpen = 2;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 201) {
				// CHAT_FILTER_SETTINGS
				this.chatPublicMode = this.in.g1();
				this.chatPrivateMode = this.in.g1();
				this.chatTradeMode = this.in.g1();
				this.redrawPrivacySettings = true;
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 199) {
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

			if (this.ptype == 167) {
				// CAM_LOOKAT
				this.cutscene = true;
				this.field289 = this.in.g1();
				this.field290 = this.in.g1();
				this.field291 = this.in.g2();
				this.field292 = this.in.g1();
				this.field293 = this.in.g1();
				if (this.field293 >= 100) {
					int var36 = this.field289 * 128 + 64;
					int var37 = this.field290 * 128 + 64;
					int var38 = this.getHeightmapY(var37, var36, this.currentLevel) - this.field291;
					int var39 = var36 - this.cameraX;
					int var40 = var38 - this.cameraY;
					int var41 = var37 - this.cameraZ;
					int var42 = (int) Math.sqrt((double) (var39 * var39 + var41 * var41));
					this.cameraPitch = (int) (Math.atan2((double) var40, (double) var42) * 325.949D) & 0x7FF;
					this.cameraYaw = (int) (Math.atan2((double) var39, (double) var41) * -325.949D) & 0x7FF;
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

			if (this.ptype == 5) {
				// LOGOUT
				this.logout();
				this.ptype = -1;
				return false;
			}

			if (this.ptype == 115) {
				// VARP_LARGE
				int var43 = this.in.g4_alt3();
				int var44 = this.in.g2_alt1();
				this.varCache[var44] = var43;
				if (this.varps[var44] != var43) {
					this.varps[var44] = var43;
					this.updateVarp(var44);
					this.redrawSidebar = true;
					if (this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 29) {
				// IF_CLOSE
				if (this.sidebarInterfaceId != -1) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.fullscreenInterfaceId0 != -1) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = -1;
					this.redrawFrame = true;
				}
				if (this.fullscreenInterfaceId1 != -1) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = -1;
				}
				if (this.viewportInterfaceId != -1) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = -1;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 76) {
				// LAST_LOGIN_INFO
				this.daysSincePasswordChanged = this.in.g2_alt1();
				this.field371 = this.in.g2_alt3();
				this.in.g2();
				this.field504 = this.in.g2();
				this.currentDay = this.in.g2_alt1();
				this.unreadMessageCount = this.in.g2_alt2();
				this.previousLoginDay = this.in.g2_alt2();
				this.daysOfMembersRemaining = this.in.g2();
				this.lastAddress = this.in.g4_alt1();
				this.recoveriesLastChangedDay = this.in.g2_alt3();
				this.in.g1_alt1();
				signlink.dnslookup(JString.formatIPv4(this.lastAddress));
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 63) {
				// MESSAGE_GAME
				String var45 = this.in.gjstr();
				if (var45.endsWith(":tradereq:")) {
					String var46 = var45.substring(0, var45.indexOf(":"));
					long var47 = JString.toBase37(var46);
					boolean var49 = false;
					for (int var50 = 0; var50 < this.ignoreCount; var50++) {
						if (this.ignoreName37[var50] == var47) {
							var49 = true;
							break;
						}
					}
					if (!var49 && this.overrideChat == 0) {
						this.addMessage(var46, "wishes to trade with you.", 4);
					}
				} else if (var45.endsWith(":duelreq:")) {
					String var51 = var45.substring(0, var45.indexOf(":"));
					long var52 = JString.toBase37(var51);
					boolean var54 = false;
					for (int var55 = 0; var55 < this.ignoreCount; var55++) {
						if (this.ignoreName37[var55] == var52) {
							var54 = true;
							break;
						}
					}
					if (!var54 && this.overrideChat == 0) {
						this.addMessage(var51, "wishes to duel with you.", 8);
					}
				} else if (var45.endsWith(":chalreq:")) {
					String var56 = var45.substring(0, var45.indexOf(":"));
					long var57 = JString.toBase37(var56);
					boolean var59 = false;
					for (int var60 = 0; var60 < this.ignoreCount; var60++) {
						if (this.ignoreName37[var60] == var57) {
							var59 = true;
							break;
						}
					}
					if (!var59 && this.overrideChat == 0) {
						String var61 = var45.substring(var45.indexOf(":") + 1, var45.length() - 9);
						this.addMessage(var56, var61, 8);
					}
				} else {
					this.addMessage("", var45, 0);
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 50) {
				// IF_OPENOVERLAY
				int var62 = this.in.g2b();
				if (var62 >= 0) {
					this.resetInterfaceAnimation(var62);
				}
				if (this.viewportOverlayInterfaceId != var62) {
					this.unloadCom(this.viewportOverlayInterfaceId);
					this.viewportOverlayInterfaceId = var62;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 82) {
				// IF_SETHIDE
				boolean var63 = this.in.g1() == 1;
				int var64 = this.in.g2();
				Component.get(var64).hide = var63;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 174) {
				// UPDATE_RUNWEIGHT
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runweight = this.in.g2b();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 233) {
				// SET_MULTIWAY
				this.inMultizone = this.in.g1();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 61) {
				// UNSET_MAP_FLAG
				this.flagSceneTileX = 0;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 128) {
				// IF_OPENMAIN_SIDE
				int var65 = this.in.g2_alt2();
				int var66 = this.in.g2_alt3();
				if (this.chatInterfaceId != -1) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.fullscreenInterfaceId0 != -1) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = -1;
					this.redrawFrame = true;
				}
				if (this.fullscreenInterfaceId1 != -1) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = -1;
				}
				if (this.viewportInterfaceId != var65) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = var65;
				}
				if (this.sidebarInterfaceId != var66) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = var66;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 67) {
				// CAM_SHAKE
				int var67 = this.in.g1();
				int var68 = this.in.g1();
				int var69 = this.in.g1();
				int var70 = this.in.g1();
				this.cameraModifierEnabled[var67] = true;
				this.cameraModifierJitter[var67] = var68;
				this.cameraModifierWobbleScale[var67] = var69;
				this.cameraModifierWobbleSpeed[var67] = var70;
				this.cameraModifierCycle[var67] = 0;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 134) {
				// UPDATE_INV_PARTIAL
				this.redrawSidebar = true;
				int var71 = this.in.g2();
				Component var72 = Component.get(var71);
				while (this.in.pos < this.psize) {
					int var73 = this.in.gsmarts();
					int var74 = this.in.g2();
					int var75 = this.in.g1();
					if (var75 == 255) {
						var75 = this.in.g4();
					}
					if (var73 >= 0 && var73 < var72.invSlotObjId.length) {
						var72.invSlotObjId[var73] = var74;
						var72.invSlotObjCount[var73] = var75;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 78) {
				// UPDATE_FRIENDLIST
				long var76 = this.in.g8();
				int var78 = this.in.g1();
				String var79 = JString.formatDisplayName(JString.fromBase37(var76));
				for (int var80 = 0; var80 < this.friendCount; var80++) {
					if (this.friendName37[var80] == var76) {
						if (this.friendWorld[var80] != var78) {
							this.friendWorld[var80] = var78;
							this.redrawSidebar = true;
							if (var78 > 0) {
								this.addMessage("", var79 + " has logged in.", 5);
							}
							if (var78 == 0) {
								this.addMessage("", var79 + " has logged out.", 5);
							}
						}
						var79 = null;
						break;
					}
				}
				if (var79 != null && this.friendCount < 200) {
					this.friendName37[this.friendCount] = var76;
					this.friendName[this.friendCount] = var79;
					this.friendWorld[this.friendCount] = var78;
					this.friendCount++;
					this.redrawSidebar = true;
				}
				boolean var81 = false;
				while (!var81) {
					var81 = true;
					for (int var82 = 0; var82 < this.friendCount - 1; var82++) {
						if (this.friendWorld[var82] != nodeId && this.friendWorld[var82 + 1] == nodeId || this.friendWorld[var82] == 0 && this.friendWorld[var82 + 1] != 0) {
							int var83 = this.friendWorld[var82];
							this.friendWorld[var82] = this.friendWorld[var82 + 1];
							this.friendWorld[var82 + 1] = var83;
							String var84 = this.friendName[var82];
							this.friendName[var82] = this.friendName[var82 + 1];
							this.friendName[var82 + 1] = var84;
							long var85 = this.friendName37[var82];
							this.friendName37[var82] = this.friendName37[var82 + 1];
							this.friendName37[var82 + 1] = var85;
							this.redrawSidebar = true;
							var81 = false;
						}
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 58) {
				// P_COUNTDIALOG
				this.showSocialInput = false;
				this.chatbackInputOpen = 1;
				this.chatbackInput = "";
				this.redrawChatback = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 252) {
				// IF_SETTAB_ACTIVE
				this.selectedTab = this.in.g1_alt2();
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 40) {
				// UPDATE_ZONE_FULL_FOLLOWS
				this.baseZ = this.in.g1_alt3();
				this.baseX = this.in.g1_alt2();
				for (int var87 = this.baseX; var87 < this.baseX + 8; var87++) {
					for (int var88 = this.baseZ; var88 < this.baseZ + 8; var88++) {
						if (this.objStacks[this.currentLevel][var87][var88] != null) {
							this.objStacks[this.currentLevel][var87][var88] = null;
							this.sortObjStacks(var87, var88);
						}
					}
				}
				for (LocChange var89 = (LocChange) this.locChanges.method6(); var89 != null; var89 = (LocChange) this.locChanges.method8()) {
					if (var89.field1325 >= this.baseX && var89.field1325 < this.baseX + 8 && var89.field1326 >= this.baseZ && var89.field1326 < this.baseZ + 8 && this.currentLevel == var89.field1323) {
						var89.field1322 = 0;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 255) {
				// IF_SETPLAYERHEAD
				int var90 = this.in.g2_alt3();
				Component.get(var90).modelType = 3;
				if (localPlayer.field1679 == null) {
					Component.get(var90).model = (localPlayer.field1674[11] << 5) + (localPlayer.field1674[8] << 10) + (localPlayer.field1674[0] << 15) + (localPlayer.field1682[0] << 25) + (localPlayer.field1682[4] << 20) + localPlayer.field1674[1];
				} else {
					Component.get(var90).model = (int) (localPlayer.field1679.field1431 + 305419896L);
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 135) {
				// MESSAGE_PRIVATE
				long var91 = this.in.g8();
				int var93 = this.in.g4();
				int var94 = this.in.g1();
				boolean var95 = false;
				for (int var96 = 0; var96 < 100; var96++) {
					if (this.messageIds[var96] == var93) {
						var95 = true;
						break;
					}
				}
				if (var94 <= 1) {
					for (int var97 = 0; var97 < this.ignoreCount; var97++) {
						if (this.ignoreName37[var97] == var91) {
							var95 = true;
							break;
						}
					}
				}
				if (!var95 && this.overrideChat == 0) {
					try {
						this.messageIds[this.privateMessageCount] = var93;
						this.privateMessageCount = (this.privateMessageCount + 1) % 100;
						String var98 = WordPack.method453(this.in, this.psize - 13);
						if (var94 != 3) {
							var98 = WordFilter.filter(var98);
						}
						if (var94 == 2 || var94 == 3) {
							this.addMessage("@cr2@" + JString.formatDisplayName(JString.fromBase37(var91)), var98, 7);
						} else if (var94 == 1) {
							this.addMessage("@cr1@" + JString.formatDisplayName(JString.fromBase37(var91)), var98, 7);
						} else {
							this.addMessage(JString.formatDisplayName(JString.fromBase37(var91)), var98, 3);
						}
					} catch (Exception var191) {
						signlink.reporterror("cde1");
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 183) {
				// UPDATE_ZONE_PARTIAL_ENCLOSED
				this.baseX = this.in.g1();
				this.baseZ = this.in.g1_alt1();
				while (this.in.pos < this.psize) {
					int var100 = this.in.g1();
					this.readZonePacket(this.in, var100);
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 159) {
				// IF_OPENMAIN
				int var101 = this.in.g2_alt3();
				this.resetInterfaceAnimation(var101);
				if (this.sidebarInterfaceId != -1) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = -1;
					this.redrawSidebar = true;
					this.redrawSideicons = true;
				}
				if (this.chatInterfaceId != -1) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.fullscreenInterfaceId0 != -1) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = -1;
					this.redrawFrame = true;
				}
				if (this.fullscreenInterfaceId1 != -1) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = -1;
				}
				if (this.viewportInterfaceId != var101) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = var101;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 246) {
				// IF_OPENSIDE
				int var102 = this.in.g2_alt3();
				this.resetInterfaceAnimation(var102);
				if (this.chatInterfaceId != -1) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = -1;
					this.redrawChatback = true;
				}
				if (this.fullscreenInterfaceId0 != -1) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = -1;
					this.redrawFrame = true;
				}
				if (this.fullscreenInterfaceId1 != -1) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = -1;
				}
				if (this.viewportInterfaceId != -1) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = -1;
				}
				if (this.sidebarInterfaceId != var102) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = var102;
				}
				if (this.chatbackInputOpen != 0) {
					this.chatbackInputOpen = 0;
					this.redrawChatback = true;
				}
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 49) {
				// UPDATE_STAT
				this.redrawSidebar = true;
				int var103 = this.in.g1_alt2();
				int var104 = this.in.g1();
				int var105 = this.in.g4();
				this.skillExperience[var103] = var105;
				this.skillLevel[var103] = var104;
				this.skillBaseLevel[var103] = 1;
				for (int var106 = 0; var106 < 98; var106++) {
					if (var105 >= field248[var106]) {
						this.skillBaseLevel[var103] = var106 + 2;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 206) {
				// UPDATE_INV_FULL
				this.redrawSidebar = true;
				int var107 = this.in.g2();
				Component var108 = Component.get(var107);
				int var109 = this.in.g2();
				for (int var110 = 0; var110 < var109; var110++) {
					var108.invSlotObjId[var110] = this.in.g2_alt3();
					int var111 = this.in.g1_alt2();
					if (var111 == 255) {
						var111 = this.in.g4_alt1();
					}
					var108.invSlotObjCount[var110] = var111;
				}
				for (int var112 = var109; var112 < var108.invSlotObjId.length; var112++) {
					var108.invSlotObjId[var112] = 0;
					var108.invSlotObjCount[var112] = 0;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 222 || this.ptype == 53) {
				int var113 = this.sceneCenterZoneX;
				int var114 = this.sceneCenterZoneZ;
				if (this.ptype == 222) {
					// REBUILD_NORMAL
					var114 = this.in.g2();
					var113 = this.in.g2_alt3();
					this.sceneInstanced = false;
				}
				if (this.ptype == 53) {
					// REBUILD_REGION
					var113 = this.in.g2_alt2();
					this.in.accessBits();
					int var115 = 0;
					while (true) {
						if (var115 >= 4) {
							this.in.accessBytes();
							var114 = this.in.g2_alt2();
							this.sceneInstanced = true;
							break;
						}
						for (int var116 = 0; var116 < 13; var116++) {
							for (int var117 = 0; var117 < 13; var117++) {
								int var118 = this.in.gBit(1);
								if (var118 == 1) {
									this.sceneMapRegion[var115][var116][var117] = this.in.gBit(26);
								} else {
									this.sceneMapRegion[var115][var116][var117] = -1;
								}
							}
						}
						var115++;
					}
				}
				if (this.sceneCenterZoneX == var113 && this.sceneCenterZoneZ == var114 && this.sceneState == 2) {
					this.ptype = -1;
					return true;
				}
				this.sceneCenterZoneX = var113;
				this.sceneCenterZoneZ = var114;
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
				this.showPopupMessage(null, "Loading - please wait.");
				if (this.ptype == 222) {
					int var119 = 0;
					int var120 = (this.sceneCenterZoneX - 6) / 8;
					label1209: while (true) {
						if (var120 > (this.sceneCenterZoneX + 6) / 8) {
							this.sceneMapLandData = new byte[var119][];
							this.sceneMapLocData = new byte[var119][];
							this.sceneMapIndex = new int[var119];
							this.sceneMapLandFile = new int[var119];
							this.sceneMapLocFile = new int[var119];
							int var122 = 0;
							int var123 = (this.sceneCenterZoneX - 6) / 8;
							while (true) {
								if (var123 > (this.sceneCenterZoneX + 6) / 8) {
									break label1209;
								}
								for (int var124 = (this.sceneCenterZoneZ - 6) / 8; var124 <= (this.sceneCenterZoneZ + 6) / 8; var124++) {
									this.sceneMapIndex[var122] = (var123 << 8) + var124;
									if (this.withinTutorialIsland && (var124 == 49 || var124 == 149 || var124 == 147 || var123 == 50 || var123 == 49 && var124 == 47)) {
										this.sceneMapLandFile[var122] = -1;
										this.sceneMapLocFile[var122] = -1;
										var122++;
									} else {
										int var125 = this.sceneMapLandFile[var122] = this.onDemand.getMapFile(var123, var124, 0);
										if (var125 != -1) {
											this.onDemand.request(3, var125);
										}
										int var126 = this.sceneMapLocFile[var122] = this.onDemand.getMapFile(var123, var124, 1);
										if (var126 != -1) {
											this.onDemand.request(3, var126);
										}
										var122++;
									}
								}
								var123++;
							}
						}
						for (int var121 = (this.sceneCenterZoneZ - 6) / 8; var121 <= (this.sceneCenterZoneZ + 6) / 8; var121++) {
							var119++;
						}
						var120++;
					}
				}
				if (this.ptype == 53) {
					int var127 = 0;
					int[] var128 = new int[676];
					int var129 = 0;
					label1168: while (true) {
						if (var129 >= 4) {
							this.sceneMapLandData = new byte[var127][];
							this.sceneMapLocData = new byte[var127][];
							this.sceneMapIndex = new int[var127];
							this.sceneMapLandFile = new int[var127];
							this.sceneMapLocFile = new int[var127];
							int var137 = 0;
							while (true) {
								if (var137 >= var127) {
									break label1168;
								}
								int var138 = this.sceneMapIndex[var137] = var128[var137];
								int var139 = var138 >> 8 & 0xFF;
								int var140 = var138 & 0xFF;
								int var141 = this.sceneMapLandFile[var137] = this.onDemand.getMapFile(var139, var140, 0);
								if (var141 != -1) {
									this.onDemand.request(3, var141);
								}
								int var142 = this.sceneMapLocFile[var137] = this.onDemand.getMapFile(var139, var140, 1);
								if (var142 != -1) {
									this.onDemand.request(3, var142);
								}
								var137++;
							}
						}
						for (int var130 = 0; var130 < 13; var130++) {
							for (int var131 = 0; var131 < 13; var131++) {
								int var132 = this.sceneMapRegion[var129][var130][var131];
								if (var132 != -1) {
									int var133 = var132 >> 14 & 0x3FF;
									int var134 = var132 >> 3 & 0x7FF;
									int var135 = (var133 / 8 << 8) + var134 / 8;
									for (int var136 = 0; var136 < var127; var136++) {
										if (var128[var136] == var135) {
											var135 = -1;
											break;
										}
									}
									if (var135 != -1) {
										var128[var127++] = var135;
									}
								}
							}
						}
						var129++;
					}
				}
				int var143 = this.sceneBaseTileX - this.mapLastBaseX;
				int var144 = this.sceneBaseTileZ - this.mapLastBaseZ;
				this.mapLastBaseX = this.sceneBaseTileX;
				this.mapLastBaseZ = this.sceneBaseTileZ;
				for (int var145 = 0; var145 < 16384; var145++) {
					ClientNpc var146 = this.npcs[var145];
					if (var146 != null) {
						for (int var147 = 0; var147 < 10; var147++) {
							var146.routeTileX[var147] -= var143;
							var146.routeTileZ[var147] -= var144;
						}
						var146.field1157 -= var143 * 128;
						var146.field1158 -= var144 * 128;
					}
				}
				for (int var148 = 0; var148 < this.MAX_PLAYER_COUNT; var148++) {
					ClientPlayer var149 = this.players[var148];
					if (var149 != null) {
						for (int var150 = 0; var150 < 10; var150++) {
							var149.routeTileX[var150] -= var143;
							var149.routeTileZ[var150] -= var144;
						}
						var149.field1157 -= var143 * 128;
						var149.field1158 -= var144 * 128;
					}
				}
				this.awaitingSync = true;
				byte var151 = 0;
				byte var152 = 104;
				byte var153 = 1;
				if (var143 < 0) {
					var151 = 103;
					var152 = -1;
					var153 = -1;
				}
				byte var154 = 0;
				byte var155 = 104;
				byte var156 = 1;
				if (var144 < 0) {
					var154 = 103;
					var155 = -1;
					var156 = -1;
				}
				for (int var157 = var151; var157 != var152; var157 += var153) {
					for (int var158 = var154; var158 != var155; var158 += var156) {
						int var159 = var143 + var157;
						int var160 = var144 + var158;
						for (int var161 = 0; var161 < 4; var161++) {
							if (var159 >= 0 && var160 >= 0 && var159 < 104 && var160 < 104) {
								this.objStacks[var161][var157][var158] = this.objStacks[var161][var159][var160];
							} else {
								this.objStacks[var161][var157][var158] = null;
							}
						}
					}
				}
				for (LocChange var162 = (LocChange) this.locChanges.method6(); var162 != null; var162 = (LocChange) this.locChanges.method8()) {
					var162.field1325 -= var143;
					var162.field1326 -= var144;
					if (var162.field1325 < 0 || var162.field1326 < 0 || var162.field1325 >= 104 || var162.field1326 >= 104) {
						var162.unlink();
					}
				}
				if (this.flagSceneTileX != 0) {
					this.flagSceneTileX -= var143;
					this.flagSceneTileZ -= var144;
				}
				this.cutscene = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 190) {
				// UPDATE_REBOOT_TIMER
				this.systemUpdateTimer = this.in.g2_alt1() * 30;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 41 || this.ptype == 121 || this.ptype == 203 || this.ptype == 106 || this.ptype == 59 || this.ptype == 181 || this.ptype == 208 || this.ptype == 107 || this.ptype == 142 || this.ptype == 88 || this.ptype == 152) {
				this.readZonePacket(this.in, this.ptype);
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 125) {
				// UPDATE_RUNENERGY
				if (this.selectedTab == 12) {
					this.redrawSidebar = true;
				}
				this.runenergy = this.in.g1();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 21) {
				// IF_SETOBJECT
				int var163 = this.in.g2();
				int var164 = this.in.g2_alt1();
				int var165 = this.in.g2_alt3();
				if (var164 == 65535) {
					Component.get(var165).modelType = 0;
					this.ptype = -1;
					return true;
				}
				ObjType var166 = ObjType.get(var164);
				Component.get(var165).modelType = 4;
				Component.get(var165).model = var164;
				Component.get(var165).xan = var166.field841;
				Component.get(var165).yan = var166.field838;
				Component.get(var165).zoom = var166.field851 * 100 / var163;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 3) {
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
					this.cameraY = this.getHeightmapY(this.cameraZ, this.cameraX, this.currentLevel) - this.cutsceneSrcHeight;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 2) {
				// IF_SETANIM
				int var167 = this.in.g2_alt3();
				int var168 = this.in.g2b_alt2();
				Component var169 = Component.get(var167);
				if (var169.anim != var168 || var168 == -1) {
					var169.anim = var168;
					var169.field717 = 0;
					var169.field709 = 0;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 71) {
				// NPC_INFO
				this.getNpcPos(this.in, this.psize);
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 226) {
				// UPDATE_IGNORELIST
				this.ignoreCount = this.psize / 8;
				for (int var170 = 0; var170 < this.ignoreCount; var170++) {
					this.ignoreName37[var170] = this.in.g8();
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 10) {
				// IF_SETTAB
				int var171 = this.in.g1_alt3();
				int var172 = this.in.g2_alt2();
				if (var172 == 65535) {
					var172 = -1;
				}
				if (this.tabInterfaceId[var171] != var172) {
					this.unloadCom(this.tabInterfaceId[var171]);
					this.tabInterfaceId[var171] = var172;
				}
				this.redrawSidebar = true;
				this.redrawSideicons = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 219) {
				// UPDATE_INV_STOP_TRANSMIT
				int var173 = this.in.g2_alt1();
				Component var174 = Component.get(var173);
				for (int var175 = 0; var175 < var174.invSlotObjId.length; var175++) {
					var174.invSlotObjId[var175] = -1;
					var174.invSlotObjId[var175] = 0;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 238) {
				// TUT_FLASH
				this.flashingTab = this.in.g1();
				if (this.selectedTab == this.flashingTab) {
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

			if (this.ptype == 148) {
				// CAM_RESET
				this.cutscene = false;
				for (int var176 = 0; var176 < 5; var176++) {
					this.cameraModifierEnabled[var176] = false;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 126) {
				// UPDATE_PID
				this.membersAccount = this.in.g1();
				this.localPid = this.in.g2_alt1();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 75) {
				// UPDATE_ZONE_PARTIAL_FOLLOWS
				this.baseX = this.in.g1_alt2();
				this.baseZ = this.in.g1_alt1();
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 253) {
				// todo: opens fullscreen interface
				int var177 = this.in.g2_alt1();
				int var178 = this.in.g2_alt2();
				this.resetInterfaceAnimation(var178);
				if (var177 != -1) {
					this.resetInterfaceAnimation(var177);
				}
				if (this.viewportInterfaceId != -1) {
					this.unloadCom(this.viewportInterfaceId);
					this.viewportInterfaceId = -1;
				}
				if (this.sidebarInterfaceId != -1) {
					this.unloadCom(this.sidebarInterfaceId);
					this.sidebarInterfaceId = -1;
				}
				if (this.chatInterfaceId != -1) {
					this.unloadCom(this.chatInterfaceId);
					this.chatInterfaceId = -1;
				}
				if (this.fullscreenInterfaceId0 != var178) {
					this.unloadCom(this.fullscreenInterfaceId0);
					this.fullscreenInterfaceId0 = var178;
				}
				if (this.fullscreenInterfaceId1 != var178) {
					this.unloadCom(this.fullscreenInterfaceId1);
					this.fullscreenInterfaceId1 = var177;
				}
				this.chatbackInputOpen = 0;
				this.pressedContinueOption = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 251) {
				// FRIENDLIST_LOADED
				this.friendlistStatus = this.in.g1();
				this.redrawSidebar = true;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 18) {
				// todo
				int var179 = this.in.g2();
				int var180 = this.in.g2_alt2();
				int var181 = this.in.g2_alt1();
				Component.get(var180).field700 = (var179 << 16) + var181;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 90) {
				// PLAYER_INFO
				this.getPlayerPos(this.psize, this.in);
				this.awaitingSync = false;
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 113) {
				// RESET_CLIENT_VARCACHE
				for (int var182 = 0; var182 < this.varps.length; var182++) {
					if (this.varps[var182] != this.varCache[var182]) {
						this.varps[var182] = this.varCache[var182];
						this.updateVarp(var182);
						this.redrawSidebar = true;
					}
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 232) {
				// IF_SETTEXT
				int var183 = this.in.g2_alt3();
				String var184 = this.in.gjstr();
				Component.get(var183).text = var184;
				int var10001 = this.tabInterfaceId[this.selectedTab];
				if (Component.get(var183).layer == var10001) {
					this.redrawSidebar = true;
				}
				this.ptype = -1;
				return true;
			}

			if (this.ptype == 200) {
				// IF_SETSCROLLPOS
				int var185 = this.in.g2();
				int var186 = this.in.g2_alt3();
				Component var187 = Component.get(var185);
				if (var187 != null && var187.type == 0) {
					if (var186 < 0) {
						var186 = 0;
					}
					if (var186 > var187.scroll - var187.height) {
						var186 = var187.scroll - var187.height;
					}
					var187.field713 = var186;
				}
				this.ptype = -1;
				return true;
			}

			signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
			this.logout();
		} catch (IOException ignore) {
			this.tryReconnect();
		} catch (Exception ignore) {
			String errMsg = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (localPlayer.routeTileX[0] + this.sceneBaseTileX) + "," + (localPlayer.routeTileZ[0] + this.sceneBaseTileZ) + " - ";
			for (int i = 0; i < this.psize && i < 50; i++) {
				errMsg = errMsg + this.in.data[i] + ",";
			}
			signlink.reporterror(errMsg);
			this.logout();
		}

		return true;
	}

	@ObfuscatedName("client.g(B)V")
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
		this.fontBold12.drawStringAntiMacro(true, loopCycle / 1000, 4, 16777215, 15, var2);
	}

	@ObfuscatedName("client.a(ZZIIIIIIIIII)Z")
	public boolean tryMove(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var39 = 0; var39 < var14; var39++) {
				this.bfsDirection[var15][var39] = 0;
				this.bfsCost[var15][var39] = 99999999;
			}
		}
		int var16 = arg11;
		int var17 = arg3;
		this.bfsDirection[arg11][arg3] = 99;
		this.bfsCost[arg11][arg3] = 0;
		byte var18 = 0;
		int var19 = 0;
		this.bfsStepX[var18] = arg11;
		int var40 = var18 + 1;
		this.bfsStepZ[var18] = arg3;
		boolean var20 = false;
		int var21 = this.bfsStepX.length;
		int[][] var22 = this.levelCollisionMap[this.currentLevel].field1585;
		while (var40 != var19) {
			var16 = this.bfsStepX[var19];
			var17 = this.bfsStepZ[var19];
			var19 = (var19 + 1) % var21;
			if (arg8 == var16 && arg2 == var17) {
				var20 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && this.levelCollisionMap[this.currentLevel].method541(arg8, arg2, arg7 - 1, var16, var17, arg10)) {
					var20 = true;
					break;
				}
				if (arg7 < 10 && this.levelCollisionMap[this.currentLevel].method542(var17, arg8, var16, arg10, arg7 - 1, arg2)) {
					var20 = true;
					break;
				}
			}
			if (arg4 != 0 && arg5 != 0 && this.levelCollisionMap[this.currentLevel].method543(arg4, var16, arg8, arg9, arg5, arg2, var17)) {
				var20 = true;
				break;
			}
			int var38 = this.bfsCost[var16][var17] + 1;
			if (var16 > 0 && this.bfsDirection[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0) {
				this.bfsStepX[var40] = var16 - 1;
				this.bfsStepZ[var40] = var17;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 - 1][var17] = 2;
				this.bfsCost[var16 - 1][var17] = var38;
			}
			if (var16 < var13 - 1 && this.bfsDirection[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0) {
				this.bfsStepX[var40] = var16 + 1;
				this.bfsStepZ[var40] = var17;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 + 1][var17] = 8;
				this.bfsCost[var16 + 1][var17] = var38;
			}
			if (var17 > 0 && this.bfsDirection[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var40] = var16;
				this.bfsStepZ[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16][var17 - 1] = 1;
				this.bfsCost[var16][var17 - 1] = var38;
			}
			if (var17 < var14 - 1 && this.bfsDirection[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var40] = var16;
				this.bfsStepZ[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16][var17 + 1] = 4;
				this.bfsCost[var16][var17 + 1] = var38;
			}
			if (var16 > 0 && var17 > 0 && this.bfsDirection[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x128010E) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var40] = var16 - 1;
				this.bfsStepZ[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 - 1] = 3;
				this.bfsCost[var16 - 1][var17 - 1] = var38;
			}
			if (var16 < var13 - 1 && var17 > 0 && this.bfsDirection[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x1280183) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 - 1] & 0x1280102) == 0) {
				this.bfsStepX[var40] = var16 + 1;
				this.bfsStepZ[var40] = var17 - 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 - 1] = 9;
				this.bfsCost[var16 + 1][var17 - 1] = var38;
			}
			if (var16 > 0 && var17 < var14 - 1 && this.bfsDirection[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x1280138) == 0 && (var22[var16 - 1][var17] & 0x1280108) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var40] = var16 - 1;
				this.bfsStepZ[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 - 1][var17 + 1] = 6;
				this.bfsCost[var16 - 1][var17 + 1] = var38;
			}
			if (var16 < var13 - 1 && var17 < var14 - 1 && this.bfsDirection[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x12801E0) == 0 && (var22[var16 + 1][var17] & 0x1280180) == 0 && (var22[var16][var17 + 1] & 0x1280120) == 0) {
				this.bfsStepX[var40] = var16 + 1;
				this.bfsStepZ[var40] = var17 + 1;
				var40 = (var40 + 1) % var21;
				this.bfsDirection[var16 + 1][var17 + 1] = 12;
				this.bfsCost[var16 + 1][var17 + 1] = var38;
			}
		}
		this.tryMoveNearest = 0;
		if (!var20) {
			if (!arg0) {
				return false;
			}
			int var23 = 1000;
			int var24 = 100;
			byte var25 = 10;
			for (int var26 = arg8 - var25; var26 <= arg8 + var25; var26++) {
				for (int var27 = arg2 - var25; var27 <= arg2 + var25; var27++) {
					if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.bfsCost[var26][var27] < 100) {
						int var28 = 0;
						if (var26 < arg8) {
							var28 = arg8 - var26;
						} else if (var26 > arg4 + arg8 - 1) {
							var28 = var26 - (arg4 + arg8 - 1);
						}
						int var29 = 0;
						if (var27 < arg2) {
							var29 = arg2 - var27;
						} else if (var27 > arg2 + arg5 - 1) {
							var29 = var27 - (arg2 + arg5 - 1);
						}
						int var30 = var28 * var28 + var29 * var29;
						if (var30 < var23 || var23 == var30 && this.bfsCost[var26][var27] < var24) {
							var23 = var30;
							var24 = this.bfsCost[var26][var27];
							var16 = var26;
							var17 = var27;
						}
					}
				}
			}
			if (var23 == 1000) {
				return false;
			}
			if (arg11 == var16 && arg3 == var17) {
				return false;
			}
			this.tryMoveNearest = 1;
		}
		byte var31 = 0;
		if (arg1) {
			this.load();
		}
		this.bfsStepX[var31] = var16;
		int var41 = var31 + 1;
		this.bfsStepZ[var31] = var17;
		int var32;
		int var33 = var32 = this.bfsDirection[var16][var17];
		while (arg11 != var16 || arg3 != var17) {
			if (var32 != var33) {
				var32 = var33;
				this.bfsStepX[var41] = var16;
				this.bfsStepZ[var41++] = var17;
			}
			if ((var33 & 0x2) != 0) {
				var16++;
			} else if ((var33 & 0x8) != 0) {
				var16--;
			}
			if ((var33 & 0x1) != 0) {
				var17++;
			} else if ((var33 & 0x4) != 0) {
				var17--;
			}
			var33 = this.bfsDirection[var16][var17];
		}
		if (var41 > 0) {
			int var34 = var41;
			if (var41 > 25) {
				var34 = 25;
			}
			var41--;
			int var35 = this.bfsStepX[var41];
			int var36 = this.bfsStepZ[var41];
			if (arg6 == 0) {
				// MOVE_GAMECLICK
				this.out.p1isaac(28);
				this.out.p1(var34 + var34 + 3);
			}
			if (arg6 == 1) {
				// MOVE_MINIMAPCLICK
				this.out.p1isaac(213);
				this.out.p1(var34 + var34 + 3 + 14);
			}
			if (arg6 == 2) {
				// MOVE_OPCLICK
				this.out.p1isaac(247);
				this.out.p1(var34 + var34 + 3);
			}
			this.out.p2_alt3(this.sceneBaseTileX + var35);
			this.out.p1(super.actionKey[5] == 1 ? 1 : 0);
			this.out.p2_alt3(this.sceneBaseTileZ + var36);
			this.flagSceneTileX = this.bfsStepX[0];
			this.flagSceneTileZ = this.bfsStepZ[0];
			for (int var37 = 1; var37 < var34; var37++) {
				var41--;
				this.out.p1(this.bfsStepX[var41] - var35);
				this.out.p1_alt3(this.bfsStepZ[var41] - var36);
			}
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void updateLocChanges() {
		if (this.sceneState != 2) {
			return;
		}
		for (LocChange var2 = (LocChange) this.locChanges.method6(); var2 != null; var2 = (LocChange) this.locChanges.method8()) {
			if (var2.field1322 > 0) {
				var2.field1322--;
			}
			if (var2.field1322 != 0) {
				if (var2.field1327 > 0) {
					var2.field1327--;
				}
				if (var2.field1327 == 0 && var2.field1325 >= 1 && var2.field1326 >= 1 && var2.field1325 <= 102 && var2.field1326 <= 102 && (var2.field1316 < 0 || World.method18(var2.field1318, var2.field1316))) {
					this.addLoc(var2.field1317, var2.field1325, var2.field1316, var2.field1326, var2.field1323, var2.field1318, var2.field1324);
					var2.field1327 = -1;
					if (var2.field1319 == var2.field1316 && var2.field1319 == -1) {
						var2.unlink();
					} else if (var2.field1319 == var2.field1316 && var2.field1320 == var2.field1317 && var2.field1321 == var2.field1318) {
						var2.unlink();
					}
				}
			} else if (var2.field1319 < 0 || World.method18(var2.field1321, var2.field1319)) {
				this.addLoc(var2.field1320, var2.field1325, var2.field1319, var2.field1326, var2.field1323, var2.field1321, var2.field1324);
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("client.j(I)Ljava/lang/String;")
	public String getHost(int arg0) {
		if (arg0 != -42588) {
			this.ptype = this.in.g1();
		}
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.a(IIILZGNGQRPJ;I)V")
	public void addPlayerOptions(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (localPlayer == arg3 || this.menuSize >= 400) {
			return;
		}
		String var6;
		if (arg3.field1681 == 0) {
			var6 = arg3.name + getCombatLevelTag(arg3.field1675, localPlayer.field1675) + " (level-" + arg3.field1675 + ")";
		} else {
			var6 = arg3.name + " (skill-" + arg3.field1681 + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @whi@" + var6;
			this.menuAction[this.menuSize] = 596;
			this.menuParamA[this.menuSize] = arg0;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg1;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			for (int var7 = 4; var7 >= 0; var7--) {
				if (this.playerOps[var7] != null) {
					this.menuOption[this.menuSize] = this.playerOps[var7] + " @whi@" + var6;
					short var9 = 0;
					if (this.playerOps[var7].equalsIgnoreCase("attack")) {
						if (arg3.field1675 > localPlayer.field1675) {
							var9 = 2000;
						}
						if (localPlayer.field1688 != 0 && arg3.field1688 != 0) {
							if (localPlayer.field1688 == arg3.field1688) {
								var9 = 2000;
							} else {
								var9 = 0;
							}
						}
					} else if (this.playerOpPrimary[var7]) {
						var9 = 2000;
					}
					if (var7 == 0) {
						this.menuAction[this.menuSize] = var9 + 200;
					}
					if (var7 == 1) {
						this.menuAction[this.menuSize] = var9 + 493;
					}
					if (var7 == 2) {
						this.menuAction[this.menuSize] = var9 + 408;
					}
					if (var7 == 3) {
						this.menuAction[this.menuSize] = var9 + 677;
					}
					if (var7 == 4) {
						this.menuAction[this.menuSize] = var9 + 876;
					}
					this.menuParamA[this.menuSize] = arg0;
					this.menuParamB[this.menuSize] = arg2;
					this.menuParamC[this.menuSize] = arg1;
					this.menuSize++;
				}
			}
		} else if ((this.activeSpellFlags & 0x8) == 8) {
			this.menuOption[this.menuSize] = this.spellCaption + " @whi@" + var6;
			this.menuAction[this.menuSize] = 918;
			this.menuParamA[this.menuSize] = arg0;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg1;
			this.menuSize++;
		}
		for (int var8 = 0; var8 < this.menuSize; var8++) {
			if (this.menuAction[var8] == 14) {
				this.menuOption[var8] = "Walk here @whi@" + var6;
				return;
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void handleChatModeInput() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPublicMode = (this.chatPublicMode + 1) % 4;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1isaac(176);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatPrivateMode = (this.chatPrivateMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1isaac(176);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.chatTradeMode = (this.chatTradeMode + 1) % 3;
			this.redrawPrivacySettings = true;
			this.redrawChatback = true;
			// CHAT_SETMODE
			this.out.p1isaac(176);
			this.out.p1(this.chatPublicMode);
			this.out.p1(this.chatPrivateMode);
			this.out.p1(this.chatTradeMode);
		}
		if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			if (this.viewportInterfaceId == -1) {
				this.closeInterfaces();
				this.reportAbuseInput = "";
				this.reportAbuseMuteOption = false;
				this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.field728;
			} else {
				this.addMessage("", "Please close the interface you have open before using 'report abuse'", 0);
			}
		}
		field456++;
		if (field456 > 161) {
			field456 = 0;
			// ANTICHEAT_CYCLELOGIC6
			this.out.p1isaac(22);
			this.out.p2(38304);
		}
	}

	@ObfuscatedName("client.a(ILMFMVIYHT;I)V")
	public void getPlayerExtended(Packet buf, int psize) {
		for (int i = 0; i < this.entityUpdateCount; i++) {
			int index = this.entityUpdateIds[i];
			ClientPlayer player = this.players[index];

			int flags = buf.g1();
			if ((flags & 0x20) != 0) {
				// BIG
				flags += buf.g1() << 8;
			}

			this.getPlayerExtendedInfo(index, player, flags, buf);
		}
	}

	@ObfuscatedName("client.a(IZLMFMVIYHT;)V")
	public void getPlayerLocal(int psize, Packet buf) {
		buf.accessBits();

		int info = buf.gBit(1);
		if (info == 0) {
			return;
		}

		int op = buf.gBit(2);
		if (op == 0) {
			this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
		} else if (op == 1) {
			int walkDir = buf.gBit(3);
			localPlayer.step(false, walkDir);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (op == 2) {
			int walkDir = buf.gBit(3);
			localPlayer.step(true, walkDir);

			int runDir = buf.gBit(3);
			localPlayer.step(true, runDir);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}
		} else if (op == 3) {
			int telejump = buf.gBit(1);
			this.currentLevel = buf.gBit(2);
			int z = buf.gBit(7);
			int x = buf.gBit(7);

			int extendedInfo = buf.gBit(1);
			if (extendedInfo == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
			}

			localPlayer.move(z, telejump == 1, x);
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;BIIIII)V")
	public void handleScrollInput(int arg0, int arg1, Component arg2, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.scrollGrabbed) {
			this.scrollInputPadding = 32;
		} else {
			this.scrollInputPadding = 0;
		}
		this.scrollGrabbed = false;
		if (arg6 >= arg8 && arg6 < arg8 + 16 && arg4 >= arg1 && arg4 < arg1 + 16) {
			arg2.field713 -= this.dragCycles * 4;
			if (arg5 == 1) {
				this.redrawSidebar = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.redrawChatback = true;
			}
		} else if (arg6 >= arg8 && arg6 < arg8 + 16 && arg4 >= arg1 + arg7 - 16 && arg4 < arg1 + arg7) {
			arg2.field713 += this.dragCycles * 4;
			if (arg5 == 1) {
				this.redrawSidebar = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.redrawChatback = true;
			}
		} else if (arg6 >= arg8 - this.scrollInputPadding && arg6 < arg8 + 16 + this.scrollInputPadding && arg4 >= arg1 + 16 && arg4 < arg1 + arg7 - 16 && this.dragCycles > 0) {
			int var11 = (arg7 - 32) * arg7 / arg0;
			if (var11 < 8) {
				var11 = 8;
			}
			int var12 = arg4 - arg1 - 16 - var11 / 2;
			int var13 = arg7 - 32 - var11;
			arg2.field713 = (arg0 - arg7) * var12 / var13;
			if (arg5 == 1) {
				this.redrawSidebar = true;
			}
			if (arg5 == 2 || arg5 == 3) {
				this.redrawChatback = true;
			}
			this.scrollGrabbed = true;
		}
	}

	@ObfuscatedName("client.h(B)V")
	public void handleViewportOptions() {
		if (this.objSelected == 0 && this.spellSelected == 0) {
			this.menuOption[this.menuSize] = "Walk here";
			this.menuAction[this.menuSize] = 14;
			this.menuParamB[this.menuSize] = super.mouseX;
			this.menuParamC[this.menuSize] = super.mouseY;
			this.menuSize++;
		}
		int var2 = -1;
		for (int var3 = 0; var3 < Model.pickedCount; var3++) {
			int var4 = Model.field1256[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var2 != var4) {
				var2 = var4;
				if (var7 == 2 && this.scene.method304(this.currentLevel, var5, var6, var4) >= 0) {
					LocType var9 = LocType.method561(var8);
					if (var9.field1659 != null) {
						var9 = var9.method562();
					}
					if (var9 == null) {
						continue;
					}
					if (this.objSelected == 1) {
						this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @cya@" + var9.field1630;
						this.menuAction[this.menuSize] = 467;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if (this.spellSelected != 1) {
						if (var9.field1644 != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.field1644[var10] != null) {
									this.menuOption[this.menuSize] = var9.field1644[var10] + " @cya@" + var9.field1630;
									if (var10 == 0) {
										this.menuAction[this.menuSize] = 35;
									}
									if (var10 == 1) {
										this.menuAction[this.menuSize] = 389;
									}
									if (var10 == 2) {
										this.menuAction[this.menuSize] = 888;
									}
									if (var10 == 3) {
										this.menuAction[this.menuSize] = 892;
									}
									if (var10 == 4) {
										this.menuAction[this.menuSize] = 1280;
									}
									this.menuParamA[this.menuSize] = var4;
									this.menuParamB[this.menuSize] = var5;
									this.menuParamC[this.menuSize] = var6;
									this.menuSize++;
								}
							}
						}
						this.menuOption[this.menuSize] = "Examine @cya@" + var9.field1630;
						this.menuAction[this.menuSize] = 1412;
						this.menuParamA[this.menuSize] = var9.field1627 << 14;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					} else if ((this.activeSpellFlags & 0x4) == 4) {
						this.menuOption[this.menuSize] = this.spellCaption + " @cya@" + var9.field1630;
						this.menuAction[this.menuSize] = 376;
						this.menuParamA[this.menuSize] = var4;
						this.menuParamB[this.menuSize] = var5;
						this.menuParamC[this.menuSize] = var6;
						this.menuSize++;
					}
				}
				if (var7 == 1) {
					ClientNpc var11 = this.npcs[var8];
					if (var11.field1370.field1445 == 1 && (var11.field1157 & 0x7F) == 64 && (var11.field1158 & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.npcCount; var12++) {
							ClientNpc var15 = this.npcs[this.npcIds[var12]];
							if (var15 != null && var11 != var15 && var15.field1370.field1445 == 1 && var11.field1157 == var15.field1157 && var11.field1158 == var15.field1158) {
								this.addNpcOptions(var15.field1370, var6, var5, this.npcIds[var12]);
							}
						}
						for (int var13 = 0; var13 < this.playerCount; var13++) {
							ClientPlayer var14 = this.players[this.playerIds[var13]];
							if (var14 != null && var11.field1157 == var14.field1157 && var11.field1158 == var14.field1158) {
								this.addPlayerOptions(this.playerIds[var13], var6, var5, var14);
							}
						}
					}
					this.addNpcOptions(var11.field1370, var6, var5, var8);
				}
				if (var7 == 0) {
					ClientPlayer var16 = this.players[var8];
					if ((var16.field1157 & 0x7F) == 64 && (var16.field1158 & 0x7F) == 64) {
						for (int var17 = 0; var17 < this.npcCount; var17++) {
							ClientNpc var20 = this.npcs[this.npcIds[var17]];
							if (var20 != null && var20.field1370.field1445 == 1 && var16.field1157 == var20.field1157 && var16.field1158 == var20.field1158) {
								this.addNpcOptions(var20.field1370, var6, var5, this.npcIds[var17]);
							}
						}
						for (int var18 = 0; var18 < this.playerCount; var18++) {
							ClientPlayer var19 = this.players[this.playerIds[var18]];
							if (var19 != null && var16 != var19 && var16.field1157 == var19.field1157 && var16.field1158 == var19.field1158) {
								this.addPlayerOptions(this.playerIds[var18], var6, var5, var19);
							}
						}
					}
					this.addPlayerOptions(var8, var6, var5, var16);
				}
				if (var7 == 3) {
					LinkList var21 = this.objStacks[this.currentLevel][var5][var6];
					if (var21 != null) {
						for (ClientObj var22 = (ClientObj) var21.method7(); var22 != null; var22 = (ClientObj) var21.method9()) {
							ObjType var23 = ObjType.get(var22.field873);
							if (this.objSelected == 1) {
								this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var23.field811;
								this.menuAction[this.menuSize] = 100;
								this.menuParamA[this.menuSize] = var22.field873;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if (this.spellSelected != 1) {
								for (int var24 = 4; var24 >= 0; var24--) {
									if (var23.field820 != null && var23.field820[var24] != null) {
										this.menuOption[this.menuSize] = var23.field820[var24] + " @lre@" + var23.field811;
										if (var24 == 0) {
											this.menuAction[this.menuSize] = 68;
										}
										if (var24 == 1) {
											this.menuAction[this.menuSize] = 26;
										}
										if (var24 == 2) {
											this.menuAction[this.menuSize] = 684;
										}
										if (var24 == 3) {
											this.menuAction[this.menuSize] = 930;
										}
										if (var24 == 4) {
											this.menuAction[this.menuSize] = 270;
										}
										this.menuParamA[this.menuSize] = var22.field873;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									} else if (var24 == 2) {
										this.menuOption[this.menuSize] = "Take @lre@" + var23.field811;
										this.menuAction[this.menuSize] = 684;
										this.menuParamA[this.menuSize] = var22.field873;
										this.menuParamB[this.menuSize] = var5;
										this.menuParamC[this.menuSize] = var6;
										this.menuSize++;
									}
								}
								this.menuOption[this.menuSize] = "Examine @lre@" + var23.field811;
								this.menuAction[this.menuSize] = 1564;
								this.menuParamA[this.menuSize] = var22.field873;
								this.menuParamB[this.menuSize] = var5;
								this.menuParamC[this.menuSize] = var6;
								this.menuSize++;
							} else if ((this.activeSpellFlags & 0x1) == 1) {
								this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var23.field811;
								this.menuAction[this.menuSize] = 199;
								this.menuParamA[this.menuSize] = var22.field873;
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

	@ObfuscatedName("client.a(ZI)V")
	public void unloadCom(int arg1) {
		Component.unloadCom(arg1);
	}

	@ObfuscatedName("client.a(IIIIIIBI)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		if (arg1 < 1 || arg3 < 1 || arg1 > 102 || arg3 > 102) {
			return;
		}
		if (lowMem && this.currentLevel != arg4) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg7 == 0) {
			var9 = this.scene.method300(arg4, arg1, arg3);
		}
		if (arg7 == 1) {
			var9 = this.scene.method301(arg1, arg4, arg3);
		}
		if (arg7 == 2) {
			var9 = this.scene.method302(arg4, arg1, arg3);
		}
		if (arg7 == 3) {
			var9 = this.scene.method303(arg4, arg1, arg3);
		}
		if (var9 != 0) {
			int var13 = this.scene.method304(arg4, arg1, arg3, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg7 == 0) {
				this.scene.method291(arg3, arg4, arg1);
				LocType var17 = LocType.method561(var14);
				if (var17.field1664) {
					this.levelCollisionMap[arg4].method537(var16, arg1, arg3, var15, var17.field1663);
				}
			}
			if (arg7 == 1) {
				this.scene.method292(false, arg1, arg3, arg4);
			}
			if (arg7 == 2) {
				this.scene.method293(arg3, arg4, arg1);
				LocType var18 = LocType.method561(var14);
				if (var18.field1655 + arg1 > 103 || var18.field1655 + arg3 > 103 || var18.field1629 + arg1 > 103 || var18.field1629 + arg3 > 103) {
					return;
				}
				if (var18.field1664) {
					this.levelCollisionMap[arg4].method538(arg3, arg1, var16, var18.field1629, var18.field1663, var18.field1655);
				}
			}
			if (arg7 == 3) {
				this.scene.method294(arg1, arg3, arg4);
				LocType var19 = LocType.method561(var14);
				if (var19.field1664 && var19.field1613) {
					this.levelCollisionMap[arg4].method540(arg1, arg3);
				}
			}
		}
		if (arg2 >= 0) {
			int var20 = arg4;
			if (arg4 < 3 && (this.levelTileFlags[1][arg1][arg3] & 0x2) == 2) {
				var20 = arg4 + 1;
			}
			World.method13(arg2, var20, arg5, arg3, this.levelCollisionMap[arg4], arg0, arg1, arg4, this.scene, this.levelHeightmap);
		}
	}

	@ObfuscatedName("client.b(IBLMFMVIYHT;)V")
	public void getNpcPosOldVis(int arg0, Packet arg2) {
		arg2.accessBits();
		int var4 = arg2.gBit(8);
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
			int var9 = arg2.gBit(1);
			if (var9 == 0) {
				this.npcIds[this.npcCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg2.gBit(2);
				if (var10 == 0) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					this.entityUpdateIds[this.entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg2.gBit(3);
					var8.step(false, var11);
					int var12 = arg2.gBit(1);
					if (var12 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					this.npcIds[this.npcCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg2.gBit(3);
					var8.step(true, var13);
					int var14 = arg2.gBit(3);
					var8.step(true, var14);
					int var15 = arg2.gBit(1);
					if (var15 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					this.entityRemovalIds[this.entityRemovalCount++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BLjava/lang/String;I)V")
	public void addMessage(String arg0, String arg2, int arg3) {
		if (arg3 == 0 && this.stickyChatInterfaceId != -1) {
			this.modalMessage = arg2;
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
		this.messageType[0] = arg3;
		this.messageSender[0] = arg0;
		this.messageText[0] = arg2;
	}

	@ObfuscatedName("client.a(LMFMVIYHT;ZI)V")
	public void getNpcPos(Packet arg0, int arg2) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;
		this.getNpcPosOldVis(arg2, arg0);
		this.getNpcPosNewVis(arg0, arg2);
		this.getNpcPosExtended(arg0, arg2);
		for (int var4 = 0; var4 < this.entityRemovalCount; var4++) {
			int var6 = this.entityRemovalIds[var4];
			if (loopCycle != this.npcs[var6].cycle) {
				this.npcs[var6].field1370 = null;
				this.npcs[var6] = null;
			}
		}
		if (arg0.pos != arg2) {
			signlink.reporterror(this.username + " size mismatch in getnpcpos - pos:" + arg0.pos + " psize:" + arg2);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.npcCount; var5++) {
			if (this.npcs[this.npcIds[var5]] == null) {
				signlink.reporterror(this.username + " null entry in npc list - pos:" + var5 + " size:" + this.npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void clearCache() {
		LocType.field1633.clear();
		LocType.field1616.clear();
		NpcType.field1438.clear();
		ObjType.field819.clear();
		ObjType.field828.clear();
		ClientPlayer.field1683.clear();
		SpotAnimType.field1309.clear();
	}

	@ObfuscatedName("client.g(Z)V")
	public void stopMidi() {
		signlink.midiplay = false;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.h(Z)V")
	public void pushProjectiles() {
		ClientProj var2 = (ClientProj) this.projectiles.method6();
		while (var2 != null) {
			if (this.currentLevel != var2.field975 || loopCycle > var2.field987) {
				var2.unlink();
			} else if (loopCycle >= var2.field986) {
				if (var2.field981 > 0) {
					ClientNpc var3 = this.npcs[var2.field981 - 1];
					if (var3 != null && var3.field1157 >= 0 && var3.field1157 < 13312 && var3.field1158 >= 0 && var3.field1158 < 13312) {
						var2.method271(var3.field1157, var3.field1158, this.getHeightmapY(var3.field1158, var3.field1157, var2.field975) - var2.field1000, loopCycle);
					}
				}
				if (var2.field981 < 0) {
					int var4 = -var2.field981 - 1;
					ClientPlayer var5;
					if (this.localPid == var4) {
						var5 = localPlayer;
					} else {
						var5 = this.players[var4];
					}
					if (var5 != null && var5.field1157 >= 0 && var5.field1157 < 13312 && var5.field1158 >= 0 && var5.field1158 < 13312) {
						var2.method271(var5.field1157, var5.field1158, this.getHeightmapY(var5.field1158, var5.field1157, var2.field975) - var2.field1000, loopCycle);
					}
				}
				var2.method272(this.sceneDelta);
				this.scene.method285(-1, var2, (int) var2.field976, (int) var2.field978, false, 0, this.currentLevel, 60, (int) var2.field977, var2.field983);
			}
			var2 = (ClientProj) this.projectiles.method8();
		}
		field464++;
		if (field464 > 51) {
			field464 = 0;
			// ANTICHEAT_CYCLELOGIC5
			this.out.p1isaac(248);
		}
	}

	@ObfuscatedName("client.i(Z)V")
	public void loadTitleImages() {
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
			this.flameActive0 = true;
			this.flameActive = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.a(JI)V")
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
				this.out.p1isaac(141);
				this.out.p8(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void handleMouseInput() {
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
				if (var13 == 9 || var13 == 225 || var13 == 444 || var13 == 564 || var13 == 894 || var13 == 961 || var13 == 399 || var13 == 324 || var13 == 227 || var13 == 891 || var13 == 52 || var13 == 1094) {
					int var14 = this.menuParamB[this.menuSize - 1];
					int var15 = this.menuParamC[this.menuSize - 1];
					Component var16 = Component.get(var15);
					if (var16.draggable || var16.swappable) {
						this.objGrabThreshold = false;
						this.objDragCycles = 0;
						this.objDragInterfaceId = var15;
						this.objDragSlot = var14;
						this.objDragArea = 2;
						this.objGrabX = super.mouseClickX;
						this.objGrabY = super.mouseClickY;
						if (Component.get(var15).layer == this.viewportInterfaceId) {
							this.objDragArea = 1;
						}
						if (Component.get(var15).layer == this.chatInterfaceId) {
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
				this.useMenuOption(this.menuSize - 1);
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
		if (var2 == 1) {
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
				this.useMenuOption(var10);
			}
			this.menuVisible = false;
			if (this.menuArea == 1) {
				this.redrawSidebar = true;
			}
			if (this.menuArea == 2) {
				this.redrawChatback = true;
			}
		}
	}

	@ObfuscatedName("client.a(ILEPQDEJTO;II)V")
	public void drawMinimapArrow(int arg0, Pix32 arg1, int arg3) {
		int var5 = arg0 * arg0 + arg3 * arg3;
		if (var5 <= 4225 || var5 >= 90000) {
			this.drawOnMinimap(arg0, arg1, arg3);
			return;
		}
		int var6 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var7 = Model.sinTable[var6];
		int var8 = Model.cosTable[var6];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var11 = arg0 * var9 + arg3 * var10 >> 16;
		int var12 = arg0 * var10 - arg3 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.imageMapedge.drawRotated(256, 15, var15 + 94 + 4 - 10, 15, 20, 20, var13, 83 - var16 - 20);
	}

	@ObfuscatedName("client.a(ZIIIII)V")
	public void drawScrollbar(int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.imageScrollbar0.plotSprite(arg5, arg2);
		this.imageScrollbar1.plotSprite(arg3 + arg5 - 16, arg2);
		Pix2D.fillRect(arg3 - 32, arg5 + 16, this.SCROLLBAR_TRACK, 16, arg2);
		int var7 = (arg3 - 32) * arg3 / arg4;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg3 - 32 - var7) * arg1 / (arg4 - arg3);
		Pix2D.fillRect(var7, arg5 + 16 + var8, this.SCROLLBAR_GRIP_FOREGROUND, 16, arg2);
		Pix2D.vline(arg2, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg5 + 16 + var8);
		Pix2D.vline(arg2 + 1, this.SCROLLBAR_GRIP_HIGHLIGHT, var7, arg5 + 16 + var8);
		Pix2D.hline(arg2, this.SCROLLBAR_GRIP_HIGHLIGHT, arg5 + 16 + var8, 16);
		Pix2D.hline(arg2, this.SCROLLBAR_GRIP_HIGHLIGHT, arg5 + 17 + var8, 16);
		Pix2D.vline(arg2 + 15, this.SCROLLBAR_GRIP_LOWLIGHT, var7, arg5 + 16 + var8);
		Pix2D.vline(arg2 + 14, this.SCROLLBAR_GRIP_LOWLIGHT, var7 - 1, arg5 + 17 + var8);
		Pix2D.hline(arg2, this.SCROLLBAR_GRIP_LOWLIGHT, arg5 + 15 + var8 + var7, 16);
		Pix2D.hline(arg2 + 1, this.SCROLLBAR_GRIP_LOWLIGHT, arg5 + 14 + var8 + var7, 15);
	}

	@ObfuscatedName("client.a(IZ)V")
	public void pushPlayers(boolean arg1) {
		for (int var4 = 0; var4 < this.npcCount; var4++) {
			ClientNpc var5 = this.npcs[this.npcIds[var4]];
			int var6 = (this.npcIds[var4] << 14) + 536870912;
			if (var5 != null && var5.method351() && var5.field1370.field1447 == arg1 && var5.field1370.method473()) {
				int var7 = var5.field1157 >> 7;
				int var8 = var5.field1158 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field1148 == 1 && (var5.field1157 & 0x7F) == 64 && (var5.field1158 & 0x7F) == 64) {
						if (this.tileLastOccupiedCycle[var7][var8] == this.sceneCycle) {
							continue;
						}
						this.tileLastOccupiedCycle[var7][var8] = this.sceneCycle;
					}
					if (!var5.field1370.field1434) {
						var6 += Integer.MIN_VALUE;
					}
					this.scene.method285(var6, var5, var5.field1157, this.getHeightmapY(var5.field1158, var5.field1157, this.currentLevel), var5.field1139, 0, this.currentLevel, (var5.field1148 - 1) * 64 + 60, var5.field1158, var5.field1159);
				}
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void setWaveVolume(int arg1) {
		signlink.wavevol = arg1;
	}

	@ObfuscatedName("client.m(I)V")
	public void tryReconnect() {
		if (this.idleTimeout > 0) {
			this.logout();
			return;
		}
		this.showPopupMessage("Please wait - attempting to reestablish", "Connection lost");
		this.minimapType = 0;
		this.flagSceneTileX = 0;
		ClientStream var2 = this.stream;
		this.ingame = false;
		this.field146 = 0;
		this.login(this.username, this.password, true);
		if (!this.ingame) {
			this.logout();
		}
		try {
			var2.method233();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;)Z")
	public boolean handleInterfaceAction(Component arg1) {
		int var3 = arg1.clientCode;
		if (this.friendlistStatus == 2) {
			if (var3 == 201) {
				this.redrawChatback = true;
				this.chatbackInputOpen = 0;
				this.showSocialInput = true;
				this.socialInput = "";
				this.socialInputType = 1;
				this.socialMessage = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.redrawChatback = true;
				this.chatbackInputOpen = 0;
				this.showSocialInput = true;
				this.socialInput = "";
				this.socialInputType = 2;
				this.socialMessage = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			this.idleTimeout = 250;
			return true;
		}
		if (var3 == 501) {
			this.redrawChatback = true;
			this.chatbackInputOpen = 0;
			this.showSocialInput = true;
			this.socialInput = "";
			this.socialInputType = 4;
			this.socialMessage = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.redrawChatback = true;
			this.chatbackInputOpen = 0;
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
							var6 = IdkType.field1698 - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.field1698) {
							var6 = 0;
						}
					}
					if (!IdkType.field1699[var6].field1705 && IdkType.field1699[var6].field1700 == var4 + (this.designGender ? 0 : 7)) {
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
			this.out.p1isaac(163);
			this.out.p1(this.designGender ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.out.p1(this.designKits[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.out.p1(this.designColours[var11]);
			}
			return true;
		}
		if (var3 == 620) {
			this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
		}
		if (var3 >= 601 && var3 <= 613) {
			this.closeInterfaces();
			if (this.reportAbuseInput.length() > 0) {
				// REPORT_ABUSE
				this.out.p1isaac(184);
				this.out.p8(JString.toBase37(this.reportAbuseInput));
				this.out.p1(var3 - 601);
				this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;IILjava/lang/String;)LATJMVOZR;")
	public Jagfile getJagFile(int arg1, String arg2, int arg3, int arg4, String arg5) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (this.fileStreams[0] != null) {
				var7 = this.fileStreams[0].method325(arg4);
			}
		} catch (Exception var30) {
		}
		if (var7 != null) {
			this.crc32.reset();
			this.crc32.update(var7);
			int var9 = (int) this.crc32.getValue();
			if (arg1 != var9) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new Jagfile(var7);
		}
		int var11 = 0;
		while (var7 == null) {
			String var12 = "Unknown error";
			this.drawProgress(arg3, "Requesting " + arg5);
			Object var13 = null;
			try {
				int var14 = 0;
				DataInputStream var15 = this.openUrl(arg2 + arg1);
				byte[] var16 = new byte[6];
				var15.readFully(var16, 0, 6);
				Packet var17 = new Packet(var16);
				var17.pos = 3;
				int var18 = var17.g3() + 6;
				int var19 = 6;
				var7 = new byte[var18];
				for (int var20 = 0; var20 < 6; var20++) {
					var7[var20] = var16[var20];
				}
				while (var19 < var18) {
					int var21 = var18 - var19;
					if (var21 > 1000) {
						var21 = 1000;
					}
					int var22 = var15.read(var7, var19, var21);
					if (var22 < 0) {
						(new StringBuffer("Length error: ")).append(var19).append("/").append(var18).toString();
						throw new IOException("EOF");
					}
					var19 += var22;
					int var23 = var19 * 100 / var18;
					if (var14 != var23) {
						this.drawProgress(arg3, "Loading " + arg5 + " - " + var23 + "%");
					}
					var14 = var23;
				}
				var15.close();
				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].method326(var7.length, var7, arg4);
					}
				} catch (Exception var29) {
					this.fileStreams[0] = null;
				}
				if (var7 != null) {
					this.crc32.reset();
					this.crc32.update(var7);
					int var24 = (int) this.crc32.getValue();
					if (arg1 != var24) {
						var7 = null;
						var11++;
						var12 = "Checksum error: " + var24;
					}
				}
			} catch (IOException var31) {
				if (var12.equals("Unknown error")) {
					var12 = "Connection error";
				}
				var7 = null;
			} catch (NullPointerException var32) {
				var12 = "Null error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var33) {
				var12 = "Bounds error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var34) {
				var12 = "Unexpected error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var26 = var8; var26 > 0; var26--) {
					if (var11 >= 3) {
						this.drawProgress(arg3, "Game updated - please reload page");
						var26 = 10;
					} else {
						this.drawProgress(arg3, var12 + " - Retrying in " + var26);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var28) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
				this.field196 = !this.field196;
			}
		}
		return new Jagfile(var7);
	}

	@ObfuscatedName("client.b(B)V")
	public void refresh() {
		this.redrawFrame = true;
	}

	@ObfuscatedName("client.a(LMFMVIYHT;II)V")
	public void getNpcPosExtended(Packet arg0, int arg1) {
		for (int var5 = 0; var5 < this.entityUpdateCount; var5++) {
			int var6 = this.entityUpdateIds[var5];
			ClientNpc var7 = this.npcs[var6];
			int var8 = arg0.g1();
			if ((var8 & 0x1) != 0) {
				// CHANGETYPE
				var7.field1370 = NpcType.get(arg0.g2_alt2());
				var7.field1148 = var7.field1370.field1445;
				var7.field1147 = var7.field1370.field1454;
				var7.field1166 = var7.field1370.field1448;
				var7.field1167 = var7.field1370.field1446;
				var7.field1168 = var7.field1370.field1444;
				var7.field1169 = var7.field1370.field1436;
				var7.field1181 = var7.field1370.field1424;
			}
			if ((var8 & 0x40) != 0) {
				// FACE_ENTITY
				var7.field1156 = arg0.g2_alt1();
				if (var7.field1156 == 65535) {
					var7.field1156 = -1;
				}
			}
			if ((var8 & 0x80) != 0) {
				// DAMAGE
				int var9 = arg0.g1_alt1();
				int var10 = arg0.g1_alt1();
				var7.method353(loopCycle, var9, var10);
				var7.field1142 = loopCycle + 300;
				var7.field1143 = arg0.g1();
				var7.field1144 = arg0.g1_alt3();
			}
			if ((var8 & 0x4) != 0) {
				// SPOTANIM
				var7.field1161 = arg0.g2();
				int var11 = arg0.g4_alt2();
				var7.field1165 = var11 >> 16;
				var7.field1164 = (var11 & 0xFFFF) + loopCycle;
				var7.field1162 = 0;
				var7.field1163 = 0;
				if (var7.field1164 > loopCycle) {
					var7.field1162 = -1;
				}
				if (var7.field1161 == 65535) {
					var7.field1161 = -1;
				}
			}
			if ((var8 & 0x20) != 0) {
				// SAY
				var7.chatMessage = arg0.gjstr();
				var7.chatTimer = 100;
			}
			if ((var8 & 0x8) != 0) {
				// FACE_COORD
				var7.field1145 = arg0.g2_alt3();
				var7.field1146 = arg0.g2_alt1();
			}
			if ((var8 & 0x2) != 0) {
				// ANIM
				int var12 = arg0.g2();
				if (var12 == 65535) {
					var12 = -1;
				}
				int var13 = arg0.g1_alt3();
				if (var7.field1171 == var12 && var12 != -1) {
					int var14 = SeqType.field775[var12].field789;
					if (var14 == 1) {
						var7.field1172 = 0;
						var7.field1173 = 0;
						var7.field1174 = var13;
						var7.field1175 = 0;
					}
					if (var14 == 2) {
						var7.field1175 = 0;
					}
				} else if (var12 == -1 || var7.field1171 == -1 || SeqType.field775[var12].field783 >= SeqType.field775[var7.field1171].field783) {
					var7.field1171 = var12;
					var7.field1172 = 0;
					var7.field1173 = 0;
					var7.field1174 = var13;
					var7.field1175 = 0;
					var7.field1160 = var7.field1180;
				}
			}
			if ((var8 & 0x10) != 0) {
				// DAMAGE2
				int var15 = arg0.g1_alt3();
				int var16 = arg0.g1_alt3();
				var7.method353(loopCycle, var15, var16);
				var7.field1142 = loopCycle + 300;
				var7.field1143 = arg0.g1();
				var7.field1144 = arg0.g1_alt2();
			}
		}
	}

	@ObfuscatedName("client.a(IILZGNGQRPJ;ILMFMVIYHT;)V")
	public void getPlayerExtendedInfo(int arg1, ClientPlayer arg2, int arg3, Packet arg4) {
		if ((arg3 & 0x8) != 0) {
			// ANIM
			int var7 = arg4.g2();
			if (var7 == 65535) {
				var7 = -1;
			}
			int var8 = arg4.g1_alt3();
			if (arg2.field1171 == var7 && var7 != -1) {
				int var9 = SeqType.field775[var7].field789;
				if (var9 == 1) {
					arg2.field1172 = 0;
					arg2.field1173 = 0;
					arg2.field1174 = var8;
					arg2.field1175 = 0;
				}
				if (var9 == 2) {
					arg2.field1175 = 0;
				}
			} else if (var7 == -1 || arg2.field1171 == -1 || SeqType.field775[var7].field783 >= SeqType.field775[arg2.field1171].field783) {
				arg2.field1171 = var7;
				arg2.field1172 = 0;
				arg2.field1173 = 0;
				arg2.field1174 = var8;
				arg2.field1175 = 0;
				arg2.field1160 = arg2.field1180;
			}
		}
		if ((arg3 & 0x10) != 0) {
			// SAY
			arg2.chatMessage = arg4.gjstr();
			if (arg2.chatMessage.charAt(0) == '~') {
				arg2.chatMessage = arg2.chatMessage.substring(1);
				this.addMessage(arg2.name, arg2.chatMessage, 2);
			} else if (localPlayer == arg2) {
				this.addMessage(arg2.name, arg2.chatMessage, 2);
			}
			arg2.chatColour = 0;
			arg2.chatEffect = 0;
			arg2.chatTimer = 150;
		}
		if ((arg3 & 0x100) != 0) {
			// EXACTMOVE
			arg2.field1149 = arg4.g1_alt1();
			arg2.field1151 = arg4.g1_alt2();
			arg2.field1150 = arg4.g1_alt3();
			arg2.field1152 = arg4.g1();
			arg2.field1153 = arg4.g2() + loopCycle;
			arg2.field1154 = arg4.g2_alt2() + loopCycle;
			arg2.field1155 = arg4.g1();
			arg2.clearRoute();
		}
		if ((arg3 & 0x1) != 0) {
			// FACE_ENTITY
			arg2.field1156 = arg4.g2_alt2();
			if (arg2.field1156 == 65535) {
				arg2.field1156 = -1;
			}
		}
		if ((arg3 & 0x2) != 0) {
			// FACE_COORD
			arg2.field1145 = arg4.g2();
			arg2.field1146 = arg4.g2();
		}
		if ((arg3 & 0x200) != 0) {
			// SPOTANIM
			arg2.field1161 = arg4.g2_alt2();
			int var10 = arg4.g4_alt2();
			arg2.field1165 = var10 >> 16;
			arg2.field1164 = (var10 & 0xFFFF) + loopCycle;
			arg2.field1162 = 0;
			arg2.field1163 = 0;
			if (arg2.field1164 > loopCycle) {
				arg2.field1162 = -1;
			}
			if (arg2.field1161 == 65535) {
				arg2.field1161 = -1;
			}
		}
		if ((arg3 & 0x4) != 0) {
			// APPEARANCE
			int var11 = arg4.g1();
			byte[] var12 = new byte[var11];
			Packet var13 = new Packet(var12);
			arg4.gdata_alt1(var12, var11, 0);
			this.playerAppearanceBuffer[arg1] = var13;
			arg2.method574(var13);
		}
		if ((arg3 & 0x400) != 0) {
			// DAMAGE
			int var14 = arg4.g1_alt1();
			int var15 = arg4.g1_alt3();
			arg2.method353(loopCycle, var14, var15);
			arg2.field1142 = loopCycle + 300;
			arg2.field1143 = arg4.g1_alt2();
			arg2.field1144 = arg4.g1();
		}
		if ((arg3 & 0x40) != 0) {
			// CHAT
			int var16 = arg4.g2();
			int var17 = arg4.g1_alt2();
			int var18 = arg4.g1_alt1();
			int var19 = arg4.pos;
			if (arg2.name != null && arg2.field1680) {
				long var20 = JString.toBase37(arg2.name);
				boolean var22 = false;
				if (var17 <= 1) {
					for (int var23 = 0; var23 < this.ignoreCount; var23++) {
						if (this.ignoreName37[var23] == var20) {
							var22 = true;
							break;
						}
					}
				}
				if (!var22 && this.overrideChat == 0) {
					try {
						this.field427.pos = 0;
						arg4.gdata_alt2(this.field427.data, var18, 0);
						this.field427.pos = 0;
						String var24 = WordPack.method453(this.field427, var18);
						String var25 = WordFilter.filter(var24);
						arg2.chatMessage = var25;
						arg2.chatColour = var16 >> 8;
						arg2.chatEffect = var16 & 0xFF;
						arg2.chatTimer = 150;
						if (var17 == 2 || var17 == 3) {
							this.addMessage("@cr2@" + arg2.name, var25, 1);
						} else if (var17 == 1) {
							this.addMessage("@cr1@" + arg2.name, var25, 1);
						} else {
							this.addMessage(arg2.name, var25, 2);
						}
					} catch (Exception var29) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg4.pos = var18 + var19;
		}
		if ((arg3 & 0x80) != 0) {
			// DAMAGE2
			int var27 = arg4.g1_alt3();
			int var28 = arg4.g1_alt2();
			arg2.method353(loopCycle, var27, var28);
			arg2.field1142 = loopCycle + 300;
			arg2.field1143 = arg4.g1_alt3();
			arg2.field1144 = arg4.g1();
		}
	}

	@ObfuscatedName("client.n(I)V")
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
		this.areaBackmid1 = null;
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

	@ObfuscatedName("client.a()V")
	public void load() {
		this.drawProgress(20, "Starting up");

		if (signlink.sunjava) {
			super.mindel = 5;
		}

		if (alreadyStarted) {
			this.errorStarted = true;
			return;
		}

		alreadyStarted = true;

		boolean validHost = false;
		String host = this.getHost(-42588);
		if (host.endsWith("jagex.com")) {
			validHost = true;
		}
		if (host.endsWith("runescape.com")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.2")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.231")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.229")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.228")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.227")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.226")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.224")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.223")) {
			validHost = true;
		}
		if (host.endsWith("192.168.1.221")) {
			validHost = true;
		}
		if (host.endsWith("127.0.0.1")) {
			validHost = true;
		}
		if (!validHost) {
			this.errorHost = true;
			return;
		}

		if (signlink.cache_dat != null) {
			for (int i = 0; i < 5; i++) {
				this.fileStreams[i] = new FileStream(i + 1, 600000, signlink.cache_dat, signlink.cache_idx[i]);
			}
		}

		try {
			this.getJagCrc();

			this.jagTitle = this.getJagFile(this.jagChecksum[1], "title", 25, 1, "title screen");

			this.fontPlain11 = new PixFont(false, this.jagTitle, "p11_full");
			this.fontPlain12 = new PixFont(false, this.jagTitle, "p12_full");
			this.fontBold12 = new PixFont(false, this.jagTitle, "b12_full");
			this.fontQuill8 = new PixFont(true, this.jagTitle, "q8_full");

			this.loadTitleBackground();
			this.loadTitleImages();

			Jagfile jagConfig = this.getJagFile(this.jagChecksum[2], "config", 30, 2, "config");
			Jagfile jagInterface = this.getJagFile(this.jagChecksum[3], "interface", 35, 3, "interface");
			Jagfile jagMedia = this.getJagFile(this.jagChecksum[4], "media", 40, 4, "2d graphics");
			Jagfile jagTextures = this.getJagFile(this.jagChecksum[6], "textures", 45, 6, "textures");
			Jagfile jagWordenc = this.getJagFile(this.jagChecksum[7], "wordenc", 50, 7, "chat system");
			Jagfile jagSounds = this.getJagFile(this.jagChecksum[8], "sounds", 55, 8, "sound effects");

			this.levelTileFlags = new byte[4][104][104];
			this.levelHeightmap = new int[4][105][105];
			this.scene = new World3D(this.levelHeightmap, 104, 4, 104);
			for (int i = 0; i < 4; i++) {
				this.levelCollisionMap[i] = new CollisionMap(104, 104);
			}
			this.imageMinimap = new Pix32(512, 512);

			Jagfile jagVersionlist = this.getJagFile(this.jagChecksum[5], "versionlist", 60, 5, "update list");

			this.drawProgress(60, "Connecting to update server");

			this.onDemand = new OnDemand();
			this.onDemand.unpack(jagVersionlist, this);
			AnimFrame.init(this.onDemand.getAnimCount());
			Model.init(this.onDemand.getFileCount(0), this.onDemand);

			if (!lowMem) {
				this.midiSong = 0;
				this.midiFading = true;

				this.onDemand.request(2, this.midiSong);

				while (this.onDemand.remaining() > 0) {
					this.updateOnDemand();
					try {
						Thread.sleep(100L);
					} catch (Exception ignore) {
					}

					if (this.onDemand.tries > 3) {
						this.showError("ondemand");
						return;
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

				if (this.onDemand.tries > 3) {
					this.showError("ondemand");
					return;
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

				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(49, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(49, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 148, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 148, 1));

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
					this.onDemand.prefetch(0, priority, i);
				}
			}

			this.onDemand.prefetchMaps(membersWorld);

			if (!lowMem) {
				int midiCount = this.onDemand.getFileCount(2);
				for (int i = 1; i < midiCount; i++) {
					if (this.onDemand.shouldPrefetchMidi(i)) {
						this.onDemand.prefetch(2, (byte) 1, i);
					}
				}
			}

			int modelCount3 = this.onDemand.getFileCount(0);
			for (int i = 0; i < modelCount3; i++) {
				int flags = this.onDemand.getModelFlags(i);
				if (flags == 0 && this.onDemand.totalPrefetchFiles < 200) {
					this.onDemand.prefetch(0, (byte) 1, i);
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

			for (int i = 0; i < 72; i++) {
				this.imageMapscene[i] = new Pix8(jagMedia, "mapscene", i);
			}

			for (int i = 0; i < 70; i++) {
				this.imageMapfunction[i] = new Pix32(jagMedia, "mapfunction", i);
			}

			for (int i = 0; i < 5; i++) {
				this.imageHitmarks[i] = new Pix32(jagMedia, "hitmarks", i);
			}

			for (int i = 0; i < 6; i++) {
				this.imageHeadiconsPk[i] = new Pix32(jagMedia, "headicons_pk", i);
			}

			for (int i = 0; i < 9; i++) {
				this.imageHeadiconsPrayer[i] = new Pix32(jagMedia, "headicons_prayer", i);
			}

			for (int i = 0; i < 6; i++) {
				this.imageHeadiconsHint[i] = new Pix32(jagMedia, "headicons_hint", i);
			}

			this.imageOverlayMultiway = new Pix32(jagMedia, "overlay_multiway", 0);

			this.imageMapmarker0 = new Pix32(jagMedia, "mapmarker", 0);
			this.imageMapmarker1 = new Pix32(jagMedia, "mapmarker", 1);

			for (int i = 0; i < 8; i++) {
				this.imageCross[i] = new Pix32(jagMedia, "cross", i);
			}

			this.imageMapdot0 = new Pix32(jagMedia, "mapdots", 0);
			this.imageMapdot1 = new Pix32(jagMedia, "mapdots", 1);
			this.imageMapdot2 = new Pix32(jagMedia, "mapdots", 2);
			this.imageMapdot3 = new Pix32(jagMedia, "mapdots", 3);
			this.imageMapdot4 = new Pix32(jagMedia, "mapdots", 4);

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

			for (int i = 0; i < 100; i++) {
				if (this.imageMapfunction[i] != null) {
					this.imageMapfunction[i].rgbAdjust(randB + rand, randG + rand, randR + rand);
				}

				if (this.imageMapscene[i] != null) {
					this.imageMapscene[i].rgbAdjust(randB + rand, randG + rand, randR + rand);
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
			VarbitType.unpack(jagConfig);
			ObjType.membersWorld = membersWorld;

			if (!lowMem) {
				this.drawProgress(90, "Unpacking sounds");

				byte[] dat = jagSounds.read("sounds.dat", null);
				Packet sounds = new Packet(dat);
				Wave.unpack(sounds, 36135);
			}

			this.drawProgress(95, "Unpacking interfaces");

			PixFont[] fonts = new PixFont[] { this.fontPlain11, this.fontPlain12, this.fontBold12, this.fontQuill8};
			Component.unpack(fonts, jagInterface, jagMedia);

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

			Pix3D.init3D(503, 765);
			this.areaFullscreenOffset = Pix3D.lineOffset;

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

			World3D.init(334, distance, 800, 500, 512);
			WordFilter.unpack(jagWordenc);

			this.mouseTracking = new MouseTracking(this);
			this.startThread(this.mouseTracking, 10);

			ClientLocAnim.varProvider = this;
			LocType.varProvider = this;
			NpcType.varProvider = this;
		} catch (Exception ignore) {
			signlink.reporterror("loaderror " + this.lastProgressMessage + " " + this.lastProgressPercent);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.d(II)V")
	public void updateTextures(int arg0) {
		if (lowMem) {
			return;
		}
		for (int var3 = 0; var3 < this.ANIMATED_TEXTURES.length; var3++) {
			int var4 = this.ANIMATED_TEXTURES[var3];
			if (Pix3D.textureCycle[var4] >= arg0) {
				Pix8 var5 = Pix3D.textures[var4];
				int var6 = var5.hi * var5.wi - 1;
				int var7 = this.sceneDelta * var5.wi * 2;
				byte[] var8 = var5.pixels;
				byte[] var9 = this.textureBuffer;
				for (int var10 = 0; var10 <= var6; var10++) {
					var9[var10] = var8[var10 - var7 & var6];
				}
				var5.pixels = var9;
				this.textureBuffer = var8;
				Pix3D.pushTexture(var4);
			}
		}
	}

	@ObfuscatedName("client.a(ILEWIXBTLV;IIIIII)V")
	public void handleInterfaceInput(int arg0, Component arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		if (arg1.type != 0 || arg1.children == null || arg1.hide || (arg5 < arg4 || arg7 < arg0 || arg5 > arg1.width + arg4 || arg7 > arg1.height + arg0)) {
			return;
		}
		int var9 = arg1.children.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg1.childX[var10] + arg4;
			int var12 = arg1.childY[var10] + arg0 - arg3;
			Component var13 = Component.get(arg1.children[var10]);
			int var14 = var13.field710 + var11;
			int var15 = var13.field741 + var12;
			if ((var13.overlayer >= 0 || var13.overColour != 0) && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
				if (var13.overlayer >= 0) {
					this.lastHoveredInterfaceId = var13.overlayer;
				} else {
					this.lastHoveredInterfaceId = var13.id;
				}
			}
			if (var13.type == 8 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
				this.field611 = var13.id;
			}
			if (var13.type == 0) {
				this.handleInterfaceInput(var15, var13, arg2, var13.field713, var14, arg5, arg7);
				if (var13.scroll > var13.height) {
					this.handleScrollInput(var13.scroll, var15, var13, arg7, arg2, arg5, var13.height, var13.width + var14);
				}
			} else {
				if (var13.buttonType == 1 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					boolean var16 = false;
					if (var13.clientCode != 0) {
						var16 = this.handleSocialMenuOption(var13);
					}
					if (!var16) {
						this.menuOption[this.menuSize] = var13.option;
						this.menuAction[this.menuSize] = 352;
						this.menuParamC[this.menuSize] = var13.id;
						this.menuSize++;
					}
				}
				if (var13.buttonType == 2 && this.spellSelected == 0 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					String var17 = var13.targetVerb;
					if (var17.indexOf(" ") != -1) {
						var17 = var17.substring(0, var17.indexOf(" "));
					}
					this.menuOption[this.menuSize] = var17 + " @gre@" + var13.targetText;
					this.menuAction[this.menuSize] = 70;
					this.menuParamC[this.menuSize] = var13.id;
					this.menuSize++;
				}
				if (var13.buttonType == 3 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					this.menuOption[this.menuSize] = "Close";
					if (arg2 == 3) {
						this.menuAction[this.menuSize] = 55;
					} else {
						this.menuAction[this.menuSize] = 639;
					}
					this.menuParamC[this.menuSize] = var13.id;
					this.menuSize++;
				}
				if (var13.buttonType == 4 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					this.menuOption[this.menuSize] = var13.option;
					this.menuAction[this.menuSize] = 890;
					this.menuParamC[this.menuSize] = var13.id;
					this.menuSize++;
				}
				if (var13.buttonType == 5 && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					this.menuOption[this.menuSize] = var13.option;
					this.menuAction[this.menuSize] = 518;
					this.menuParamC[this.menuSize] = var13.id;
					this.menuSize++;
				}
				if (var13.buttonType == 6 && !this.pressedContinueOption && arg5 >= var14 && arg7 >= var15 && arg5 < var13.width + var14 && arg7 < var13.height + var15) {
					this.menuOption[this.menuSize] = var13.option;
					this.menuAction[this.menuSize] = 575;
					this.menuParamC[this.menuSize] = var13.id;
					this.menuSize++;
				}
				if (var13.type == 2) {
					int var18 = 0;
					for (int var19 = 0; var19 < var13.height; var19++) {
						for (int var20 = 0; var20 < var13.width; var20++) {
							int var21 = (var13.marginX + 32) * var20 + var14;
							int var22 = (var13.marginY + 32) * var19 + var15;
							if (var18 < 20) {
								var21 += var13.invSlotOffsetX[var18];
								var22 += var13.invSlotOffsetY[var18];
							}
							if (arg5 >= var21 && arg7 >= var22 && arg5 < var21 + 32 && arg7 < var22 + 32) {
								this.hoveredSlot = var18;
								this.hoveredSlotInterfaceId = var13.id;
								if (var13.invSlotObjId[var18] > 0) {
									ObjType var23 = ObjType.get(var13.invSlotObjId[var18] - 1);
									if (this.objSelected == 1 && var13.interactable) {
										if (this.objSelectedInterface != var13.id || this.objSelectedSlot != var18) {
											this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @lre@" + var23.field811;
											this.menuAction[this.menuSize] = 903;
											this.menuParamA[this.menuSize] = var23.field845;
											this.menuParamB[this.menuSize] = var18;
											this.menuParamC[this.menuSize] = var13.id;
											this.menuSize++;
										}
									} else if (this.spellSelected != 1 || !var13.interactable) {
										if (var13.interactable) {
											for (int var24 = 4; var24 >= 3; var24--) {
												if (var23.field830 != null && var23.field830[var24] != null) {
													this.menuOption[this.menuSize] = var23.field830[var24] + " @lre@" + var23.field811;
													if (var24 == 3) {
														this.menuAction[this.menuSize] = 227;
													}
													if (var24 == 4) {
														this.menuAction[this.menuSize] = 891;
													}
													this.menuParamA[this.menuSize] = var23.field845;
													this.menuParamB[this.menuSize] = var18;
													this.menuParamC[this.menuSize] = var13.id;
													this.menuSize++;
												} else if (var24 == 4) {
													this.menuOption[this.menuSize] = "Drop @lre@" + var23.field811;
													this.menuAction[this.menuSize] = 891;
													this.menuParamA[this.menuSize] = var23.field845;
													this.menuParamB[this.menuSize] = var18;
													this.menuParamC[this.menuSize] = var13.id;
													this.menuSize++;
												}
											}
										}
										if (var13.usable) {
											this.menuOption[this.menuSize] = "Use @lre@" + var23.field811;
											this.menuAction[this.menuSize] = 52;
											this.menuParamA[this.menuSize] = var23.field845;
											this.menuParamB[this.menuSize] = var18;
											this.menuParamC[this.menuSize] = var13.id;
											this.menuSize++;
										}
										if (var13.interactable && var23.field830 != null) {
											for (int var25 = 2; var25 >= 0; var25--) {
												if (var23.field830[var25] != null) {
													this.menuOption[this.menuSize] = var23.field830[var25] + " @lre@" + var23.field811;
													if (var25 == 0) {
														this.menuAction[this.menuSize] = 961;
													}
													if (var25 == 1) {
														this.menuAction[this.menuSize] = 399;
													}
													if (var25 == 2) {
														this.menuAction[this.menuSize] = 324;
													}
													this.menuParamA[this.menuSize] = var23.field845;
													this.menuParamB[this.menuSize] = var18;
													this.menuParamC[this.menuSize] = var13.id;
													this.menuSize++;
												}
											}
										}
										if (var13.iop != null) {
											for (int var26 = 4; var26 >= 0; var26--) {
												if (var13.iop[var26] != null) {
													this.menuOption[this.menuSize] = var13.iop[var26] + " @lre@" + var23.field811;
													if (var26 == 0) {
														this.menuAction[this.menuSize] = 9;
													}
													if (var26 == 1) {
														this.menuAction[this.menuSize] = 225;
													}
													if (var26 == 2) {
														this.menuAction[this.menuSize] = 444;
													}
													if (var26 == 3) {
														this.menuAction[this.menuSize] = 564;
													}
													if (var26 == 4) {
														this.menuAction[this.menuSize] = 894;
													}
													this.menuParamA[this.menuSize] = var23.field845;
													this.menuParamB[this.menuSize] = var18;
													this.menuParamC[this.menuSize] = var13.id;
													this.menuSize++;
												}
											}
										}
										this.menuOption[this.menuSize] = "Examine @lre@" + var23.field811;
										this.menuAction[this.menuSize] = 1094;
										this.menuParamA[this.menuSize] = var23.field845;
										this.menuParamB[this.menuSize] = var18;
										this.menuParamC[this.menuSize] = var13.id;
										this.menuSize++;
									} else if ((this.activeSpellFlags & 0x10) == 16) {
										this.menuOption[this.menuSize] = this.spellCaption + " @lre@" + var23.field811;
										this.menuAction[this.menuSize] = 361;
										this.menuParamA[this.menuSize] = var23.field845;
										this.menuParamB[this.menuSize] = var18;
										this.menuParamC[this.menuSize] = var13.id;
										this.menuSize++;
									}
								}
							}
							var18++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public void updateNpcs() {
		for (int var2 = 0; var2 < this.npcCount; var2++) {
			int var3 = this.npcIds[var2];
			ClientNpc var4 = this.npcs[var3];
			if (var4 != null) {
				this.updateEntity(var4.field1370.field1445, var4);
			}
		}
	}

	@ObfuscatedName("client.a(IBLLRUWCBNN;)V")
	public void updateEntity(int arg0, ClientEntity arg2) {
		if (arg2.field1157 < 128 || arg2.field1158 < 128 || arg2.field1157 >= 13184 || arg2.field1158 >= 13184) {
			arg2.field1171 = -1;
			arg2.field1161 = -1;
			arg2.field1153 = 0;
			arg2.field1154 = 0;
			arg2.field1157 = arg2.routeTileX[0] * 128 + arg2.field1148 * 64;
			arg2.field1158 = arg2.routeTileZ[0] * 128 + arg2.field1148 * 64;
			arg2.clearRoute();
		}
		if (localPlayer == arg2 && (arg2.field1157 < 1536 || arg2.field1158 < 1536 || arg2.field1157 >= 11776 || arg2.field1158 >= 11776)) {
			arg2.field1171 = -1;
			arg2.field1161 = -1;
			arg2.field1153 = 0;
			arg2.field1154 = 0;
			arg2.field1157 = arg2.routeTileX[0] * 128 + arg2.field1148 * 64;
			arg2.field1158 = arg2.routeTileZ[0] * 128 + arg2.field1148 * 64;
			arg2.clearRoute();
		}
		if (arg2.field1153 > loopCycle) {
			this.updateForceMovement(arg2);
		} else if (arg2.field1154 >= loopCycle) {
			this.startForceMovement(arg2);
		} else {
			this.updateMovement(arg2);
		}
		this.updateFacingDirection(arg2);
		this.updateSequences(arg2);
	}

	@ObfuscatedName("client.a(LLRUWCBNN;Z)V")
	public void updateForceMovement(ClientEntity arg0) {
		int var3 = arg0.field1153 - loopCycle;
		int var4 = arg0.field1149 * 128 + arg0.field1148 * 64;
		int var5 = arg0.field1151 * 128 + arg0.field1148 * 64;
		arg0.field1157 += (var4 - arg0.field1157) / var3;
		arg0.field1158 += (var5 - arg0.field1158) / var3;
		arg0.field1170 = 0;
		if (arg0.field1155 == 0) {
			arg0.field1131 = 1024;
		}
		if (arg0.field1155 == 1) {
			arg0.field1131 = 1536;
		}
		if (arg0.field1155 == 2) {
			arg0.field1131 = 0;
		}
		if (arg0.field1155 == 3) {
			arg0.field1131 = 512;
		}
	}

	@ObfuscatedName("client.a(LLRUWCBNN;I)V")
	public void startForceMovement(ClientEntity arg0) {
		if (loopCycle == arg0.field1154 || arg0.field1171 == -1 || arg0.field1174 != 0 || arg0.field1173 + 1 > SeqType.field775[arg0.field1171].method214(arg0.field1172)) {
			int var3 = arg0.field1154 - arg0.field1153;
			int var4 = loopCycle - arg0.field1153;
			int var5 = arg0.field1149 * 128 + arg0.field1148 * 64;
			int var6 = arg0.field1151 * 128 + arg0.field1148 * 64;
			int var7 = arg0.field1150 * 128 + arg0.field1148 * 64;
			int var8 = arg0.field1152 * 128 + arg0.field1148 * 64;
			arg0.field1157 = ((var3 - var4) * var5 + var4 * var7) / var3;
			arg0.field1158 = ((var3 - var4) * var6 + var4 * var8) / var3;
		}
		arg0.field1170 = 0;
		if (arg0.field1155 == 0) {
			arg0.field1131 = 1024;
		}
		if (arg0.field1155 == 1) {
			arg0.field1131 = 1536;
		}
		if (arg0.field1155 == 2) {
			arg0.field1131 = 0;
		}
		if (arg0.field1155 == 3) {
			arg0.field1131 = 512;
		}
		arg0.field1159 = arg0.field1131;
	}

	@ObfuscatedName("client.b(LLRUWCBNN;I)V")
	public void updateMovement(ClientEntity arg0) {
		arg0.field1135 = arg0.field1181;
		if (arg0.field1180 == 0) {
			arg0.field1170 = 0;
			return;
		}
		if (arg0.field1171 != -1 && arg0.field1174 == 0) {
			SeqType var3 = SeqType.field775[arg0.field1171];
			if (arg0.field1160 > 0 && var3.field787 == 0) {
				arg0.field1170++;
				return;
			}
			if (arg0.field1160 <= 0 && var3.field788 == 0) {
				arg0.field1170++;
				return;
			}
		}
		int var4 = arg0.field1157;
		int var5 = arg0.field1158;
		int var6 = arg0.routeTileX[arg0.field1180 - 1] * 128 + arg0.field1148 * 64;
		int var7 = arg0.routeTileZ[arg0.field1180 - 1] * 128 + arg0.field1148 * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg0.field1157 = var6;
			arg0.field1158 = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg0.field1131 = 1280;
			} else if (var5 > var7) {
				arg0.field1131 = 1792;
			} else {
				arg0.field1131 = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg0.field1131 = 768;
			} else if (var5 > var7) {
				arg0.field1131 = 256;
			} else {
				arg0.field1131 = 512;
			}
		} else if (var5 < var7) {
			arg0.field1131 = 1024;
		} else {
			arg0.field1131 = 0;
		}
		int var8 = arg0.field1131 - arg0.field1159 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.field1167;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.field1166;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.field1169;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.field1168;
		}
		if (var9 == -1) {
			var9 = arg0.field1166;
		}
		arg0.field1135 = var9;
		int var10 = 4;
		if (arg0.field1159 != arg0.field1131 && arg0.field1156 == -1 && arg0.field1147 != 0) {
			var10 = 2;
		}
		if (arg0.field1180 > 2) {
			var10 = 6;
		}
		if (arg0.field1180 > 3) {
			var10 = 8;
		}
		if (arg0.field1170 > 0 && arg0.field1180 > 1) {
			var10 = 8;
			arg0.field1170--;
		}
		if (arg0.field1138[arg0.field1180 - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg0.field1166 == arg0.field1135 && arg0.field1176 != -1) {
			arg0.field1135 = arg0.field1176;
		}
		if (var4 < var6) {
			arg0.field1157 += var10;
			if (arg0.field1157 > var6) {
				arg0.field1157 = var6;
			}
		} else if (var4 > var6) {
			arg0.field1157 -= var10;
			if (arg0.field1157 < var6) {
				arg0.field1157 = var6;
			}
		}
		if (var5 < var7) {
			arg0.field1158 += var10;
			if (arg0.field1158 > var7) {
				arg0.field1158 = var7;
			}
		} else if (var5 > var7) {
			arg0.field1158 -= var10;
			if (arg0.field1158 < var7) {
				arg0.field1158 = var7;
			}
		}
		if (arg0.field1157 == var6 && arg0.field1158 == var7) {
			arg0.field1180--;
			if (arg0.field1160 > 0) {
				arg0.field1160--;
			}
		}
	}

	@ObfuscatedName("client.a(BLLRUWCBNN;)V")
	public void updateFacingDirection(ClientEntity arg1) {
		if (arg1.field1147 == 0) {
			return;
		}
		if (arg1.field1156 != -1 && arg1.field1156 < 32768) {
			ClientNpc var3 = this.npcs[arg1.field1156];
			if (var3 != null) {
				int var4 = arg1.field1157 - var3.field1157;
				int var5 = arg1.field1158 - var3.field1158;
				if (var4 != 0 || var5 != 0) {
					arg1.field1131 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg1.field1156 >= 32768) {
			int var6 = arg1.field1156 - 32768;
			if (this.localPid == var6) {
				var6 = this.LOCAL_PLAYER_INDEX;
			}
			ClientPlayer var7 = this.players[var6];
			if (var7 != null) {
				int var8 = arg1.field1157 - var7.field1157;
				int var9 = arg1.field1158 - var7.field1158;
				if (var8 != 0 || var9 != 0) {
					arg1.field1131 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg1.field1145 != 0 || arg1.field1146 != 0) && (arg1.field1180 == 0 || arg1.field1170 > 0)) {
			int var10 = arg1.field1157 - (arg1.field1145 - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
			int var11 = arg1.field1158 - (arg1.field1146 - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
			if (var10 != 0 || var11 != 0) {
				arg1.field1131 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg1.field1145 = 0;
			arg1.field1146 = 0;
		}
		int var12 = arg1.field1131 - arg1.field1159 & 0x7FF;
		if (var12 != 0) {
			if (var12 < arg1.field1147 || var12 > 2048 - arg1.field1147) {
				arg1.field1159 = arg1.field1131;
			} else if (var12 > 1024) {
				arg1.field1159 -= arg1.field1147;
			} else {
				arg1.field1159 += arg1.field1147;
			}
			arg1.field1159 &= 0x7FF;
			if (arg1.field1181 == arg1.field1135 && arg1.field1159 != arg1.field1131) {
				if (arg1.field1182 != -1) {
					arg1.field1135 = arg1.field1182;
				} else {
					arg1.field1135 = arg1.field1166;
				}
			}
		}
	}

	@ObfuscatedName("client.c(LLRUWCBNN;I)V")
	public void updateSequences(ClientEntity arg0) {
		arg0.field1139 = false;
		if (arg0.field1135 != -1) {
			SeqType var3 = SeqType.field775[arg0.field1135];
			arg0.field1137++;
			if (arg0.field1136 < var3.field776 && arg0.field1137 > var3.method214(arg0.field1136)) {
				arg0.field1137 = 1;
				arg0.field1136++;
			}
			if (arg0.field1136 >= var3.field776) {
				arg0.field1137 = 1;
				arg0.field1136 = 0;
			}
		}
		if (arg0.field1161 != -1 && loopCycle >= arg0.field1164) {
			if (arg0.field1162 < 0) {
				arg0.field1162 = 0;
			}
			SeqType var4 = SpotAnimType.field1297[arg0.field1161].field1301;
			arg0.field1163++;
			if (arg0.field1162 < var4.field776 && arg0.field1163 > var4.method214(arg0.field1162)) {
				arg0.field1163 = 1;
				arg0.field1162++;
			}
			if (arg0.field1162 >= var4.field776 && (arg0.field1162 < 0 || arg0.field1162 >= var4.field776)) {
				arg0.field1161 = -1;
			}
		}
		if (arg0.field1171 != -1 && arg0.field1174 <= 1) {
			SeqType var5 = SeqType.field775[arg0.field1171];
			if (var5.field787 == 1 && arg0.field1160 > 0 && arg0.field1153 <= loopCycle && arg0.field1154 < loopCycle) {
				arg0.field1174 = 1;
				return;
			}
		}
		if (arg0.field1171 != -1 && arg0.field1174 == 0) {
			SeqType var6 = SeqType.field775[arg0.field1171];
			arg0.field1173++;
			if (arg0.field1172 < var6.field776 && arg0.field1173 > var6.method214(arg0.field1172)) {
				arg0.field1173 = 1;
				arg0.field1172++;
			}
			if (arg0.field1172 >= var6.field776) {
				arg0.field1172 -= var6.field780;
				arg0.field1175++;
				if (arg0.field1175 >= var6.field786) {
					arg0.field1171 = -1;
				}
				if (arg0.field1172 < 0 || arg0.field1172 >= var6.field776) {
					arg0.field1171 = -1;
				}
			}
			arg0.field1139 = var6.field782;
		}
		if (arg0.field1174 > 0) {
			arg0.field1174--;
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void drawGame() {
		if (this.fullscreenInterfaceId0 != -1 && (this.sceneState == 2 || super.drawArea != null)) {
			if (this.sceneState == 2) {
				this.updateInterfaceAnimation(this.sceneDelta, this.fullscreenInterfaceId0);
				if (this.fullscreenInterfaceId1 != -1) {
					this.updateInterfaceAnimation(this.sceneDelta, this.fullscreenInterfaceId1);
				}
				this.sceneDelta = 0;
				this.prepareFullGame();
				super.drawArea.bind();
				Pix3D.lineOffset = this.areaFullscreenOffset;
				Pix2D.cls();
				this.redrawFrame = true;
				Component var2 = Component.get(this.fullscreenInterfaceId0);
				if (var2.width == 512 && var2.height == 334 && var2.type == 0) {
					var2.width = 765;
					var2.height = 503;
				}
				this.drawInterface(0, 0, var2, 0);
				if (this.fullscreenInterfaceId1 != -1) {
					Component var3 = Component.get(this.fullscreenInterfaceId1);
					if (var3.width == 512 && var3.height == 334 && var3.type == 0) {
						var3.width = 765;
						var3.height = 503;
					}
					this.drawInterface(0, 0, var3, 0);
				}
				if (this.menuVisible) {
					this.drawMenu();
				} else {
					this.handleInput();
					this.drawTooltip();
				}
			}
			super.drawArea.draw(0, 0, super.graphics);
			return;
		}

		if (this.redrawFrame) {
			this.prepareGame();
			this.redrawFrame = false;
			this.areaBackleft1.draw(4, 0, super.graphics);
			this.areaBackleft2.draw(357, 0, super.graphics);
			this.areaBackright1.draw(4, 722, super.graphics);
			this.areaBackright2.draw(205, 743, super.graphics);
			this.areaBacktop1.draw(0, 0, super.graphics);
			this.areaBackvmid1.draw(4, 516, super.graphics);
			this.areaBackvmid2.draw(205, 516, super.graphics);
			this.areaBackvmid3.draw(357, 496, super.graphics);
			this.areaBackhmid2.draw(338, 0, super.graphics);
			this.redrawSidebar = true;
			this.redrawChatback = true;
			this.redrawSideicons = true;
			this.redrawPrivacySettings = true;

			if (this.sceneState != 2) {
				this.areaViewport.draw(4, 4, super.graphics);
				this.areaMapback.draw(4, 550, super.graphics);
			}

			field533++;
			if (field533 > 85) {
				field533 = 0;
				// ANTICHEAT_CYCLELOGIC2
				this.out.p1isaac(168);
			}
		}

		if (this.sceneState == 2) {
			this.drawScene();
		}

		if (this.menuVisible && this.menuArea == 1) {
			this.redrawSidebar = true;
		}
		if (this.sidebarInterfaceId != -1) {
			boolean var4 = this.updateInterfaceAnimation(this.sceneDelta, this.sidebarInterfaceId);
			if (var4) {
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
		if (this.chatInterfaceId == -1 && this.chatbackInputOpen == 0) {
			this.chatInterface.field713 = this.chatScrollHeight - this.chatScrollOffset - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.handleScrollInput(this.chatScrollHeight, 0, this.chatInterface, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
			}
			int var5 = this.chatScrollHeight - 77 - this.chatInterface.field713;
			if (var5 < 0) {
				var5 = 0;
			}
			if (var5 > this.chatScrollHeight - 77) {
				var5 = this.chatScrollHeight - 77;
			}
			if (this.chatScrollOffset != var5) {
				this.chatScrollOffset = var5;
				this.redrawChatback = true;
			}
		}
		if (this.chatInterfaceId == -1 && this.chatbackInputOpen == 3) {
			int var6 = this.field158 * 14 + 7;
			this.chatInterface.field713 = this.field161;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.handleScrollInput(var6, 0, this.chatInterface, super.mouseY - 357, -1, super.mouseX - 17, 77, 463);
			}
			int var7 = this.chatInterface.field713;
			if (var7 < 0) {
				var7 = 0;
			}
			if (var7 > var6 - 77) {
				var7 = var6 - 77;
			}
			if (this.field161 != var7) {
				this.field161 = var7;
				this.redrawChatback = true;
			}
		}
		if (this.chatInterfaceId != -1) {
			boolean var8 = this.updateInterfaceAnimation(this.sceneDelta, this.chatInterfaceId);
			if (var8) {
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
			this.areaMapback.draw(4, 550, super.graphics);
		}
		if (this.flashingTab != -1) {
			this.redrawSideicons = true;
		}
		if (this.redrawSideicons) {
			if (this.flashingTab != -1 && this.selectedTab == this.flashingTab) {
				this.flashingTab = -1;
				// TUTORIAL_CLICKSIDE
				this.out.p1isaac(119);
				this.out.p1(this.selectedTab);
			}
			this.redrawSideicons = false;
			this.areaBackmid1.bind();
			this.imageBackhmid1.plotSprite(0, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 0) {
						this.imageRedstone1.plotSprite(10, 22);
					}
					if (this.selectedTab == 1) {
						this.imageRedstone2.plotSprite(8, 54);
					}
					if (this.selectedTab == 2) {
						this.imageRedstone2.plotSprite(8, 82);
					}
					if (this.selectedTab == 3) {
						this.imageRedstone3.plotSprite(8, 110);
					}
					if (this.selectedTab == 4) {
						this.imageRedstone2h.plotSprite(8, 153);
					}
					if (this.selectedTab == 5) {
						this.imageRedstone2h.plotSprite(8, 181);
					}
					if (this.selectedTab == 6) {
						this.imageRedstone1h.plotSprite(9, 209);
					}
				}
				if (this.tabInterfaceId[0] != -1 && (this.flashingTab != 0 || loopCycle % 20 < 10)) {
					this.imageSideicons[0].plotSprite(13, 29);
				}
				if (this.tabInterfaceId[1] != -1 && (this.flashingTab != 1 || loopCycle % 20 < 10)) {
					this.imageSideicons[1].plotSprite(11, 53);
				}
				if (this.tabInterfaceId[2] != -1 && (this.flashingTab != 2 || loopCycle % 20 < 10)) {
					this.imageSideicons[2].plotSprite(11, 82);
				}
				if (this.tabInterfaceId[3] != -1 && (this.flashingTab != 3 || loopCycle % 20 < 10)) {
					this.imageSideicons[3].plotSprite(12, 115);
				}
				if (this.tabInterfaceId[4] != -1 && (this.flashingTab != 4 || loopCycle % 20 < 10)) {
					this.imageSideicons[4].plotSprite(13, 153);
				}
				if (this.tabInterfaceId[5] != -1 && (this.flashingTab != 5 || loopCycle % 20 < 10)) {
					this.imageSideicons[5].plotSprite(11, 180);
				}
				if (this.tabInterfaceId[6] != -1 && (this.flashingTab != 6 || loopCycle % 20 < 10)) {
					this.imageSideicons[6].plotSprite(13, 208);
				}
			}
			this.areaBackmid1.draw(160, 516, super.graphics);
			this.areaBackbase2.bind();
			this.imageBackbase2.plotSprite(0, 0);
			if (this.sidebarInterfaceId == -1) {
				if (this.tabInterfaceId[this.selectedTab] != -1) {
					if (this.selectedTab == 7) {
						this.imageRedstone1v.plotSprite(0, 42);
					}
					if (this.selectedTab == 8) {
						this.imageRedstone2v.plotSprite(0, 74);
					}
					if (this.selectedTab == 9) {
						this.imageRedstone2v.plotSprite(0, 102);
					}
					if (this.selectedTab == 10) {
						this.imageRedstone3v.plotSprite(1, 130);
					}
					if (this.selectedTab == 11) {
						this.imageRedstone2hv.plotSprite(0, 173);
					}
					if (this.selectedTab == 12) {
						this.imageRedstone2hv.plotSprite(0, 201);
					}
					if (this.selectedTab == 13) {
						this.imageRedstone1hv.plotSprite(0, 229);
					}
				}
				if (this.tabInterfaceId[8] != -1 && (this.flashingTab != 8 || loopCycle % 20 < 10)) {
					this.imageSideicons[7].plotSprite(2, 74);
				}
				if (this.tabInterfaceId[9] != -1 && (this.flashingTab != 9 || loopCycle % 20 < 10)) {
					this.imageSideicons[8].plotSprite(3, 102);
				}
				if (this.tabInterfaceId[10] != -1 && (this.flashingTab != 10 || loopCycle % 20 < 10)) {
					this.imageSideicons[9].plotSprite(4, 137);
				}
				if (this.tabInterfaceId[11] != -1 && (this.flashingTab != 11 || loopCycle % 20 < 10)) {
					this.imageSideicons[10].plotSprite(2, 174);
				}
				if (this.tabInterfaceId[12] != -1 && (this.flashingTab != 12 || loopCycle % 20 < 10)) {
					this.imageSideicons[11].plotSprite(2, 201);
				}
				if (this.tabInterfaceId[13] != -1 && (this.flashingTab != 13 || loopCycle % 20 < 10)) {
					this.imageSideicons[12].plotSprite(2, 226);
				}
			}
			this.areaBackbase2.draw(466, 496, super.graphics);
			this.areaViewport.bind();
			Pix3D.lineOffset = this.areaViewportOffset;
		}

		if (this.redrawPrivacySettings) {
			this.redrawPrivacySettings = false;

			this.areaBackbase1.bind();
			this.imageBackbase1.plotSprite(0, 0);

			this.fontPlain12.centreStringTag(true, 16777215, 28, 55, "Public chat");
			if (this.chatPublicMode == 0) {
				this.fontPlain12.centreStringTag(true, 65280, 41, 55, "On");
			} else if (this.chatPublicMode == 1) {
				this.fontPlain12.centreStringTag(true, 16776960, 41, 55, "Friends");
			} else if (this.chatPublicMode == 2) {
				this.fontPlain12.centreStringTag(true, 16711680, 41, 55, "Off");
			} else if (this.chatPublicMode == 3) {
				this.fontPlain12.centreStringTag(true, 65535, 41, 55, "Hide");
			}

			this.fontPlain12.centreStringTag(true, 16777215, 28, 184, "Private chat");
			if (this.chatPrivateMode == 0) {
				this.fontPlain12.centreStringTag(true, 65280, 41, 184, "On");
			} else if (this.chatPrivateMode == 1) {
				this.fontPlain12.centreStringTag(true, 16776960, 41, 184, "Friends");
			} else if (this.chatPrivateMode == 2) {
				this.fontPlain12.centreStringTag(true, 16711680, 41, 184, "Off");
			}

			this.fontPlain12.centreStringTag(true, 16777215, 28, 324, "Trade/compete");
			if (this.chatTradeMode == 0) {
				this.fontPlain12.centreStringTag(true, 65280, 41, 324, "On");
			} else if (this.chatTradeMode == 1) {
				this.fontPlain12.centreStringTag(true, 16776960, 41, 324, "Friends");
			} else if (this.chatTradeMode == 2) {
				this.fontPlain12.centreStringTag(true, 16711680, 41, 324, "Off");
			}

			this.fontPlain12.centreStringTag(true, 16777215, 33, 458, "Report abuse");

			this.areaBackbase1.draw(453, 0, super.graphics);

			this.areaViewport.bind();
			Pix3D.lineOffset = this.areaViewportOffset;
		}
		this.sceneDelta = 0;
	}

	@ObfuscatedName("client.q(I)V")
	public void drawPrivateMessages() {
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
					var2.drawString(var9, 0, var8, "From");
					var2.drawString(var9, 65535, var8 - 1, "From");
					int var10 = var9 + var2.stringWidTag("From ");
					if (var7 == 1) {
						this.imageModIcons[0].plotSprite(var8 - 12, var10);
						var10 += 14;
					}
					if (var7 == 2) {
						this.imageModIcons[1].plotSprite(var8 - 12, var10);
						var10 += 14;
					}
					var2.drawString(var10, 0, var8, var6 + ": " + this.messageText[var4]);
					var2.drawString(var10, 65535, var8 - 1, var6 + ": " + this.messageText[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && this.chatPrivateMode < 2) {
					int var11 = 329 - var3 * 13;
					var2.drawString(4, 0, var11, this.messageText[var4]);
					var2.drawString(4, 65535, var11 - 1, this.messageText[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && this.chatPrivateMode < 2) {
					int var12 = 329 - var3 * 13;
					var2.drawString(4, 0, var12, "To " + var6 + ": " + this.messageText[var4]);
					var2.drawString(4, 65535, var12 - 1, "To " + var6 + ": " + this.messageText[var4]);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	public void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem();
		} else {
			setHighMem();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			membersWorld = false;
		} else {
			membersWorld = true;
		}
		this.initApplet(765, 503);
	}

	@ObfuscatedName("client.r(I)V")
	public void pushSpotanims() {
		for (MapSpotAnim var2 = (MapSpotAnim) this.spotanims.method6(); var2 != null; var2 = (MapSpotAnim) this.spotanims.method8()) {
			if (this.currentLevel != var2.field1522 || var2.field1527) {
				var2.unlink();
			} else if (loopCycle >= var2.field1531) {
				var2.method486((byte) 1, this.sceneDelta);
				if (var2.field1527) {
					var2.unlink();
				} else {
					this.scene.method285(-1, var2, var2.field1523, var2.field1525, false, 0, var2.field1522, 60, var2.field1524, 0);
				}
			}
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public void updateOnDemand() {
		while (true) {
			OnDemandRequest var2 = this.onDemand.method587();
			if (var2 == null) {
				return;
			}
			if (var2.field1363 == 0) {
				Model.method357(var2.field1366, var2.field1364, (byte) 7);
				if ((this.onDemand.getModelFlags(var2.field1364) & 0x62) != 0) {
					this.redrawSidebar = true;
					if (this.chatInterfaceId != -1 || this.stickyChatInterfaceId != -1) {
						this.redrawChatback = true;
					}
				}
			}
			if (var2.field1363 == 1 && var2.field1366 != null) {
				AnimFrame.method262(var2.field1366);
			}
			if (var2.field1363 == 2 && this.midiSong == var2.field1364 && var2.field1366 != null) {
				this.saveMidi(this.midiFading, var2.field1366);
			}
			if (var2.field1363 == 3 && this.sceneState == 1) {
				for (int var3 = 0; var3 < this.sceneMapLandData.length; var3++) {
					if (this.sceneMapLandFile[var3] == var2.field1364) {
						this.sceneMapLandData[var3] = var2.field1366;
						if (var2.field1366 == null) {
							this.sceneMapLandFile[var3] = -1;
						}
						break;
					}
					if (this.sceneMapLocFile[var3] == var2.field1364) {
						this.sceneMapLocData[var3] = var2.field1366;
						if (var2.field1366 == null) {
							this.sceneMapLocFile[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.field1363 == 93 && this.onDemand.method591(var2.field1364)) {
				World.method17(this.onDemand, new Packet(var2.field1366));
			}
		}
	}

	@ObfuscatedName("client.s(I)Z")
	public boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void login(String arg0, String arg1, boolean arg2) {
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
				this.stream.method234();
			}
			int var8 = this.stream.method234();
			int var9 = var8;
			if (var8 == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.serverSeed = this.in.g8();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.serverSeed >> 32), (int) this.serverSeed };
				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(var10[0]);
				this.out.p4(var10[1]);
				this.out.p4(var10[2]);
				this.out.p4(var10[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(arg0);
				this.out.pjstr(arg1);
				this.out.rsaenc(LOGIN_RSAN, LOGIN_RSAE);
				this.login.pos = 0;
				if (arg2) {
					this.login.p1(18);
				} else {
					this.login.p1(16);
				}
				this.login.p1(this.out.pos + 36 + 1 + 1 + 2);
				this.login.p1(255);
				this.login.p2(377);
				this.login.p1(lowMem ? 1 : 0);
				for (int var11 = 0; var11 < 9; var11++) {
					this.login.p4(this.jagChecksum[var11]);
				}
				this.login.pdata(this.out.data, this.out.pos, 0);
				this.out.field1284 = new Isaac(var10);
				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}
				this.randomIn = new Isaac(var10);
				this.stream.write(this.login.pos, 0, this.login.data);
				var8 = this.stream.method234();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.staffModLevel = this.stream.method234();
				field258 = this.stream.method234() == 1;
				this.lastMouseClickTime = 0L;
				this.field595 = 0;
				this.mouseTracking.field99 = 0;
				super.hasFocus = true;
				this.field571 = true;
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
				this.menuSize = 0;
				this.menuVisible = false;
				super.idleCycles = 0;
				for (int var13 = 0; var13 < 100; var13++) {
					this.messageText[var13] = null;
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
				this.minimapType = 0;
				this.minimapLevel = -1;
				this.flagSceneTileX = 0;
				this.flagSceneTileZ = 0;
				this.playerCount = 0;
				this.npcCount = 0;
				for (int var14 = 0; var14 < this.MAX_PLAYER_COUNT; var14++) {
					this.players[var14] = null;
					this.playerAppearanceBuffer[var14] = null;
				}
				for (int var15 = 0; var15 < 16384; var15++) {
					this.npcs[var15] = null;
				}
				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new ClientPlayer();
				this.projectiles.method10();
				this.spotanims.method10();
				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							this.objStacks[var16][var17][var18] = null;
						}
					}
				}
				this.locChanges = new LinkList();
				this.friendlistStatus = 0;
				this.friendCount = 0;
				this.unloadCom(this.stickyChatInterfaceId);
				this.stickyChatInterfaceId = -1;
				this.unloadCom(this.chatInterfaceId);
				this.chatInterfaceId = -1;
				this.unloadCom(this.viewportInterfaceId);
				this.viewportInterfaceId = -1;
				this.unloadCom(this.fullscreenInterfaceId0);
				this.fullscreenInterfaceId0 = -1;
				this.unloadCom(this.fullscreenInterfaceId1);
				this.fullscreenInterfaceId1 = -1;
				this.unloadCom(this.sidebarInterfaceId);
				this.sidebarInterfaceId = -1;
				this.unloadCom(this.viewportOverlayInterfaceId);
				this.viewportOverlayInterfaceId = -1;
				this.pressedContinueOption = false;
				this.selectedTab = 3;
				this.chatbackInputOpen = 0;
				this.menuVisible = false;
				this.showSocialInput = false;
				this.modalMessage = null;
				this.inMultizone = 0;
				this.flashingTab = -1;
				this.designGender = true;
				this.validateCharacterDesign();
				for (int var19 = 0; var19 < 5; var19++) {
					this.designColours[var19] = 0;
				}
				for (int var20 = 0; var20 < 5; var20++) {
					this.playerOps[var20] = null;
					this.playerOpPrimary[var20] = false;
				}
				oplogic1 = 0;
				oplogic2 = 0;
				oplogic3 = 0;
				oplogic4 = 0;
				oplogic5 = 0;
				field137 = 0;
				field526 = 0;
				field309 = 0;
				field345 = 0;
				field458 = 0;
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
			} else if (var8 == 18) {
				this.loginMessage0 = "Account locked as we suspect it has been stolen.";
				this.loginMessage1 = "Press 'recover a locked account' on front page.";
			} else if (var8 == 20) {
				this.loginMessage0 = "Invalid loginserver requested";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = this.stream.method234();
				for (int var26 = var21 + 3; var26 >= 0; var26--) {
					this.loginMessage0 = "You have only just left another world";
					this.loginMessage1 = "Your profile will be transferred in: " + var26;
					this.drawTitle();
					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 22) {
				this.loginMessage0 = "Malformed login packet.";
				this.loginMessage1 = "Please try again.";
			} else if (var8 == 23) {
				this.loginMessage0 = "No reply from loginserver.";
				this.loginMessage1 = "Please try again.";
			} else if (var8 == 24) {
				this.loginMessage0 = "Error loading your profile.";
				this.loginMessage1 = "Please contact customer support.";
			} else if (var8 == 25) {
				this.loginMessage0 = "Unexpected loginserver response.";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var8 == 26) {
				this.loginMessage0 = "This computers address has been blocked";
				this.loginMessage1 = "as it was used to break our rules";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				this.loginMessage0 = "Unexpected server response";
				this.loginMessage1 = "Please try using a different world.";
			} else if (var9 != 0) {
				this.loginMessage0 = "No response from server";
				this.loginMessage1 = "Please try using a different world.";
			} else if (this.field146 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}
				this.field146++;
				this.login(arg0, arg1, arg2);
			} else {
				this.loginMessage0 = "No response from loginserver";
				this.loginMessage1 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			this.loginMessage0 = "";
			this.loginMessage1 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public boolean interactWithLoc(int arg0, int arg2, int arg3) {
		int var5 = arg3 >> 14 & 0x7FFF;
		int var6 = this.scene.method304(this.currentLevel, arg2, arg0, arg3);
		if (var6 == -1) {
			return false;
		}
		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var9 = LocType.method561(var5);
			int var10;
			int var11;
			if (var8 == 0 || var8 == 2) {
				var10 = var9.field1655;
				var11 = var9.field1629;
			} else {
				var10 = var9.field1629;
				var11 = var9.field1655;
			}
			int var12 = var9.field1618;
			if (var8 != 0) {
				var12 = (var12 >> 4 - var8) + (var12 << var8 & 0xF);
			}
			this.tryMove(true, false, arg0, localPlayer.routeTileZ[0], var10, var11, 2, 0, arg2, var12, 0, localPlayer.routeTileX[0]);
		} else {
			this.tryMove(true, false, arg0, localPlayer.routeTileZ[0], 0, 0, 2, var7 + 1, arg2, 0, var8, localPlayer.routeTileX[0]);
		}
		this.crossX = super.mouseClickX;
		this.crossY = super.mouseClickY;
		this.crossMode = 2;
		this.crossCycle = 0;
		return true;
	}

	@ObfuscatedName("client.i(B)V")
	public void updateFlames() {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var20 = (int) (Math.random() * 100.0D);
			if (var20 < 50) {
				this.flameBuffer3[(var2 - 2 << 7) + var3] = 255;
			}
		}
		for (int var4 = 0; var4 < 100; var4++) {
			int var17 = (int) (Math.random() * 124.0D) + 2;
			int var18 = (int) (Math.random() * 128.0D) + 128;
			int var19 = (var18 << 7) + var17;
			this.flameBuffer3[var19] = 192;
		}
		for (int var5 = 1; var5 < var2 - 1; var5++) {
			for (int var15 = 1; var15 < 127; var15++) {
				int var16 = (var5 << 7) + var15;
				this.flameBuffer2[var16] = (this.flameBuffer3[var16 - 1] + this.flameBuffer3[var16 + 1] + this.flameBuffer3[var16 - 128] + this.flameBuffer3[var16 + 128]) / 4;
			}
		}
		this.flameCycle0 += 128;
		if (this.flameCycle0 > this.flameBuffer0.length) {
			this.flameCycle0 -= this.flameBuffer0.length;
			int var6 = (int) (Math.random() * 12.0D);
			this.updateFlameBuffer(this.imageRunes[var6]);
		}
		for (int var7 = 1; var7 < var2 - 1; var7++) {
			for (int var12 = 1; var12 < 127; var12++) {
				int var13 = (var7 << 7) + var12;
				int var14 = this.flameBuffer2[var13 + 128] - this.flameBuffer0[this.flameCycle0 + var13 & this.flameBuffer0.length - 1] / 5;
				if (var14 < 0) {
					var14 = 0;
				}
				this.flameBuffer3[var13] = var14;
			}
		}
		for (int var10 = 0; var10 < var2 - 1; var10++) {
			this.flameLineOffset[var10] = this.flameLineOffset[var10 + 1];
		}
		this.flameLineOffset[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (this.flameGradientCycle0 > 0) {
			this.flameGradientCycle0 -= 4;
		}
		if (this.flameGradientCycle1 > 0) {
			this.flameGradientCycle1 -= 4;
		}
		if (this.flameGradientCycle0 == 0 && this.flameGradientCycle1 == 0) {
			int var11 = (int) (Math.random() * 2000.0D);
			if (var11 == 0) {
				this.flameGradientCycle0 = 1024;
			}
			if (var11 == 1) {
				this.flameGradientCycle1 = 1024;
			}
		}
	}

	@ObfuscatedName("client.a(LSLDUQHOR;IIIB)V")
	public void addNpcOptions(NpcType arg0, int arg1, int arg2, int arg3) {
		if (this.menuSize >= 400) {
			return;
		}
		if (arg0.field1425 != null) {
			arg0 = arg0.method476();
		}
		if (arg0 == null || !arg0.field1434) {
			return;
		}
		String var6 = arg0.field1455;
		if (arg0.field1442 != 0) {
			var6 = var6 + getCombatLevelTag(arg0.field1442, localPlayer.field1675) + " (level-" + arg0.field1442 + ")";
		}
		if (this.objSelected == 1) {
			this.menuOption[this.menuSize] = "Use " + this.objSelectedName + " with @yel@" + var6;
			this.menuAction[this.menuSize] = 347;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg1;
			this.menuSize++;
		} else if (this.spellSelected != 1) {
			if (arg0.field1449 != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg0.field1449[var7] != null && !arg0.field1449[var7].equalsIgnoreCase("attack")) {
						this.menuOption[this.menuSize] = arg0.field1449[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.menuAction[this.menuSize] = 318;
						}
						if (var7 == 1) {
							this.menuAction[this.menuSize] = 921;
						}
						if (var7 == 2) {
							this.menuAction[this.menuSize] = 118;
						}
						if (var7 == 3) {
							this.menuAction[this.menuSize] = 553;
						}
						if (var7 == 4) {
							this.menuAction[this.menuSize] = 432;
						}
						this.menuParamA[this.menuSize] = arg3;
						this.menuParamB[this.menuSize] = arg2;
						this.menuParamC[this.menuSize] = arg1;
						this.menuSize++;
					}
				}
			}
			if (arg0.field1449 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg0.field1449[var8] != null && arg0.field1449[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg0.field1442 > localPlayer.field1675) {
							var9 = 2000;
						}
						this.menuOption[this.menuSize] = arg0.field1449[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.menuAction[this.menuSize] = var9 + 318;
						}
						if (var8 == 1) {
							this.menuAction[this.menuSize] = var9 + 921;
						}
						if (var8 == 2) {
							this.menuAction[this.menuSize] = var9 + 118;
						}
						if (var8 == 3) {
							this.menuAction[this.menuSize] = var9 + 553;
						}
						if (var8 == 4) {
							this.menuAction[this.menuSize] = var9 + 432;
						}
						this.menuParamA[this.menuSize] = arg3;
						this.menuParamB[this.menuSize] = arg2;
						this.menuParamC[this.menuSize] = arg1;
						this.menuSize++;
					}
				}
			}
			this.menuOption[this.menuSize] = "Examine @yel@" + var6;
			this.menuAction[this.menuSize] = 1668;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg1;
			this.menuSize++;
		} else if ((this.activeSpellFlags & 0x2) == 2) {
			this.menuOption[this.menuSize] = this.spellCaption + " @yel@" + var6;
			this.menuAction[this.menuSize] = 67;
			this.menuParamA[this.menuSize] = arg3;
			this.menuParamB[this.menuSize] = arg2;
			this.menuParamC[this.menuSize] = arg1;
			this.menuSize++;
		}
	}

	@ObfuscatedName("client.a(LWRRBQEHV;I)V")
	public void updateFlameBuffer(Pix8 arg0) {
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
		if (arg0 != null) {
			int var7 = 0;
			for (int var8 = 0; var8 < arg0.hi; var8++) {
				for (int var9 = 0; var9 < arg0.wi; var9++) {
					if (arg0.pixels[var7++] != 0) {
						int var10 = var9 + 16 + arg0.xof;
						int var11 = var8 + 16 + arg0.yof;
						int var12 = (var11 << 7) + var10;
						this.flameBuffer0[var12] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public void drawChat() {
		this.areaChatback.bind();
		Pix3D.lineOffset = this.areaChatbackOffset;
		this.imageChatback.plotSprite(0, 0);
		if (this.showSocialInput) {
			this.fontBold12.centreString(239, 40, 0, this.socialMessage);
			this.fontBold12.centreString(239, 60, 128, this.socialInput + "*");
		} else if (this.chatbackInputOpen == 1) {
			this.fontBold12.centreString(239, 40, 0, "Enter amount:");
			this.fontBold12.centreString(239, 60, 128, this.chatbackInput + "*");
		} else if (this.chatbackInputOpen == 2) {
			this.fontBold12.centreString(239, 40, 0, "Enter name:");
			this.fontBold12.centreString(239, 60, 128, this.chatbackInput + "*");
		} else if (this.chatbackInputOpen == 3) {
			if (this.chatbackInput != this.field157) {
				this.searchObjNames(this.chatbackInput);
				this.field157 = this.chatbackInput;
			}
			PixFont var2 = this.fontPlain12;
			Pix2D.setClipping(0, 0, 77, 463);
			for (int var3 = 0; var3 < this.field158; var3++) {
				int var4 = var3 * 14 + 18 - this.field161;
				if (var4 > 0 && var4 < 110) {
					var2.centreString(239, var4, 0, this.field159[var3]);
				}
			}
			Pix2D.resetClipping();
			if (this.field158 > 5) {
				this.drawScrollbar(this.field161, 463, 77, this.field158 * 14 + 7, 0);
			}
			if (this.chatbackInput.length() == 0) {
				this.fontBold12.centreString(239, 40, 255, "Enter object name");
			} else if (this.field158 == 0) {
				this.fontBold12.centreString(239, 40, 0, "No matching objects found, please shorten search");
			}
			var2.centreString(239, 90, 0, this.chatbackInput + "*");
			Pix2D.hline(0, 0, 77, 479);
		} else if (this.modalMessage != null) {
			this.fontBold12.centreString(239, 40, 0, this.modalMessage);
			this.fontBold12.centreString(239, 60, 128, "Click to continue");
		} else if (this.chatInterfaceId != -1) {
			this.drawInterface(0, 0, Component.get(this.chatInterfaceId), 0);
		} else if (this.stickyChatInterfaceId == -1) {
			PixFont var5 = this.fontPlain12;
			int var6 = 0;
			Pix2D.setClipping(0, 0, 77, 463);
			for (int var7 = 0; var7 < 100; var7++) {
				if (this.messageText[var7] != null) {
					int var9 = this.messageType[var7];
					int var10 = 70 - var6 * 14 + this.chatScrollOffset;
					String var11 = this.messageSender[var7];
					byte var12 = 0;
					if (var11 != null && var11.startsWith("@cr1@")) {
						var11 = var11.substring(5);
						var12 = 1;
					}
					if (var11 != null && var11.startsWith("@cr2@")) {
						var11 = var11.substring(5);
						var12 = 2;
					}
					if (var9 == 0) {
						if (var10 > 0 && var10 < 110) {
							var5.drawString(4, 0, var10, this.messageText[var7]);
						}
						var6++;
					}
					if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var11))) {
						if (var10 > 0 && var10 < 110) {
							int var13 = 4;
							if (var12 == 1) {
								this.imageModIcons[0].plotSprite(var10 - 12, var13);
								var13 += 14;
							}
							if (var12 == 2) {
								this.imageModIcons[1].plotSprite(var10 - 12, var13);
								var13 += 14;
							}
							var5.drawString(var13, 0, var10, var11 + ":");
							int var14 = var13 + var5.stringWidTag(var11) + 8;
							var5.drawString(var14, 255, var10, this.messageText[var7]);
						}
						var6++;
					}
					if ((var9 == 3 || var9 == 7) && this.splitPrivateChat == 0 && (var9 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var11))) {
						if (var10 > 0 && var10 < 110) {
							byte var15 = 4;
							var5.drawString(var15, 0, var10, "From");
							int var16 = var15 + var5.stringWidTag("From ");
							if (var12 == 1) {
								this.imageModIcons[0].plotSprite(var10 - 12, var16);
								var16 += 14;
							}
							if (var12 == 2) {
								this.imageModIcons[1].plotSprite(var10 - 12, var16);
								var16 += 14;
							}
							var5.drawString(var16, 0, var10, var11 + ":");
							int var17 = var16 + var5.stringWidTag(var11) + 8;
							var5.drawString(var17, 8388608, var10, this.messageText[var7]);
						}
						var6++;
					}
					if (var9 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var11))) {
						if (var10 > 0 && var10 < 110) {
							var5.drawString(4, 8388736, var10, var11 + " " + this.messageText[var7]);
						}
						var6++;
					}
					if (var9 == 5 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var10 > 0 && var10 < 110) {
							var5.drawString(4, 8388608, var10, this.messageText[var7]);
						}
						var6++;
					}
					if (var9 == 6 && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
						if (var10 > 0 && var10 < 110) {
							var5.drawString(4, 0, var10, "To " + var11 + ":");
							var5.drawString(var5.stringWidTag("To " + var11) + 12, 8388608, var10, this.messageText[var7]);
						}
						var6++;
					}
					if (var9 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var11))) {
						if (var10 > 0 && var10 < 110) {
							var5.drawString(4, 8270336, var10, var11 + " " + this.messageText[var7]);
						}
						var6++;
					}
				}
			}
			Pix2D.resetClipping();
			this.chatScrollHeight = var6 * 14 + 7;
			if (this.chatScrollHeight < 78) {
				this.chatScrollHeight = 78;
			}
			this.drawScrollbar(this.chatScrollHeight - this.chatScrollOffset - 77, 463, 77, this.chatScrollHeight, 0);
			String var8;
			if (localPlayer == null || localPlayer.name == null) {
				var8 = JString.formatDisplayName(this.username);
			} else {
				var8 = localPlayer.name;
			}
			var5.drawString(4, 0, 90, var8 + ":");
			var5.drawString(var5.stringWidTag(var8 + ": ") + 6, 255, 90, this.chatTyped + "*");
			Pix2D.hline(0, 0, 77, 479);
		} else {
			this.drawInterface(0, 0, Component.get(this.stickyChatInterfaceId), 0);
		}
		if (this.menuVisible && this.menuArea == 2) {
			this.drawMenu();
		}
		this.areaChatback.draw(357, 17, super.graphics);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.u(I)V")
	public void updateEntityChats() {
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var6;
			if (var2 == -1) {
				var6 = this.LOCAL_PLAYER_INDEX;
			} else {
				var6 = this.playerIds[var2];
			}
			ClientPlayer var7 = this.players[var6];
			if (var7 != null && var7.chatTimer > 0) {
				var7.chatTimer--;
				if (var7.chatTimer == 0) {
					var7.chatMessage = null;
				}
			}
		}
		for (int var3 = 0; var3 < this.npcCount; var3++) {
			int var4 = this.npcIds[var3];
			ClientNpc var5 = this.npcs[var4];
			if (var5 != null && var5.chatTimer > 0) {
				var5.chatTimer--;
				if (var5.chatTimer == 0) {
					var5.chatMessage = null;
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public void getJagCrc() {
		int var2 = 5;
		this.jagChecksum[8] = 0;
		int var4 = 0;
		while (this.jagChecksum[8] == 0) {
			String var5 = "Unknown problem";
			this.drawProgress(20, "Connecting to web server");
			try {
				DataInputStream var6 = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 377);
				Packet var7 = new Packet(new byte[40]);
				var6.readFully(var7.data, 0, 40);
				var6.close();
				for (int var8 = 0; var8 < 9; var8++) {
					this.jagChecksum[var8] = var7.g4();
				}
				int var9 = var7.g4();
				int var10 = 1234;
				for (int var11 = 0; var11 < 9; var11++) {
					var10 = (var10 << 1) + this.jagChecksum[var11];
				}
				if (var9 != var10) {
					var5 = "checksum problem";
					this.jagChecksum[8] = 0;
				}
			} catch (EOFException var14) {
				var5 = "EOF problem";
				this.jagChecksum[8] = 0;
			} catch (IOException var15) {
				var5 = "connection problem";
				this.jagChecksum[8] = 0;
			} catch (Exception var16) {
				var5 = "logic problem";
				this.jagChecksum[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (this.jagChecksum[8] == 0) {
				var4++;
				for (int var12 = var2; var12 > 0; var12--) {
					if (var4 >= 10) {
						this.drawProgress(10, "Game updated - please reload page");
						var12 = 10;
					} else {
						this.drawProgress(10, var5 + " - Will retry in " + var12 + " secs.");
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var13) {
					}
				}
				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}
				this.field196 = !this.field196;
			}
		}
	}

	@ObfuscatedName("client.v(I)V")
	public void drawMinimap() {
		this.areaMapback.bind();
		if (this.minimapType == 2) {
			byte[] var2 = this.imageMapback.pixels;
			int[] var3 = Pix2D.data;
			int var4 = var2.length;
			for (int var5 = 0; var5 < var4; var5++) {
				if (var2[var5] == 0) {
					var3[var5] = 0;
				}
			}
			this.imageCompass.drawRotatedMasked(0, 33, 25, 33, this.compassMaskLineLengths, 0, this.orbitCameraYaw, 256, this.compassMaskLineOffsets, 25);
			this.areaViewport.bind();
			Pix3D.lineOffset = this.areaViewportOffset;
			return;
		}
		int var6 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var7 = localPlayer.field1157 / 32 + 48;
		int var9 = 464 - localPlayer.field1158 / 32;
		this.imageMinimap.drawRotatedMasked(5, 151, var7, 146, this.minimapMaskLineLengths, 25, var6, this.macroMinimapZoom + 256, this.minimapMaskLineOffsets, var9);
		this.imageCompass.drawRotatedMasked(0, 33, 25, 33, this.compassMaskLineLengths, 0, this.orbitCameraYaw, 256, this.compassMaskLineOffsets, 25);
		for (int var10 = 0; var10 < this.activeMapFunctionCount; var10++) {
			int var40 = this.activeMapFunctionX[var10] * 4 + 2 - localPlayer.field1157 / 32;
			int var41 = this.activeMapFunctionZ[var10] * 4 + 2 - localPlayer.field1158 / 32;
			this.drawOnMinimap(var41, this.activeMapFunctions[var10], var40);
		}
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var36 = 0; var36 < 104; var36++) {
				LinkList var37 = this.objStacks[this.currentLevel][var11][var36];
				if (var37 != null) {
					int var38 = var11 * 4 + 2 - localPlayer.field1157 / 32;
					int var39 = var36 * 4 + 2 - localPlayer.field1158 / 32;
					this.drawOnMinimap(var39, this.imageMapdot0, var38);
				}
			}
		}
		for (int var12 = 0; var12 < this.npcCount; var12++) {
			ClientNpc var32 = this.npcs[this.npcIds[var12]];
			if (var32 != null && var32.method351()) {
				NpcType var33 = var32.field1370;
				if (var33.field1425 != null) {
					var33 = var33.method476();
				}
				if (var33 != null && var33.field1439 && var33.field1434) {
					int var34 = var32.field1157 / 32 - localPlayer.field1157 / 32;
					int var35 = var32.field1158 / 32 - localPlayer.field1158 / 32;
					this.drawOnMinimap(var35, this.imageMapdot1, var34);
				}
			}
		}
		for (int var13 = 0; var13 < this.playerCount; var13++) {
			ClientPlayer var24 = this.players[this.playerIds[var13]];
			if (var24 != null && var24.method351()) {
				int var25 = var24.field1157 / 32 - localPlayer.field1157 / 32;
				int var26 = var24.field1158 / 32 - localPlayer.field1158 / 32;
				boolean var27 = false;
				long var28 = JString.toBase37(var24.name);
				for (int var30 = 0; var30 < this.friendCount; var30++) {
					if (this.friendName37[var30] == var28 && this.friendWorld[var30] != 0) {
						var27 = true;
						break;
					}
				}
				boolean var31 = false;
				if (localPlayer.field1688 != 0 && var24.field1688 != 0 && localPlayer.field1688 == var24.field1688) {
					var31 = true;
				}
				if (var27) {
					this.drawOnMinimap(var26, this.imageMapdot3, var25);
				} else if (var31) {
					this.drawOnMinimap(var26, this.imageMapdot4, var25);
				} else {
					this.drawOnMinimap(var26, this.imageMapdot2, var25);
				}
			}
		}
		if (this.hintType != 0 && loopCycle % 20 < 10) {
			if (this.hintType == 1 && this.hintNpc >= 0 && this.hintNpc < this.npcs.length) {
				ClientNpc var14 = this.npcs[this.hintNpc];
				if (var14 != null) {
					int var15 = var14.field1157 / 32 - localPlayer.field1157 / 32;
					int var16 = var14.field1158 / 32 - localPlayer.field1158 / 32;
					this.drawMinimapArrow(var16, this.imageMapmarker1, var15);
				}
			}
			if (this.hintType == 2) {
				int var17 = (this.hintTileX - this.sceneBaseTileX) * 4 + 2 - localPlayer.field1157 / 32;
				int var18 = (this.hintTileZ - this.sceneBaseTileZ) * 4 + 2 - localPlayer.field1158 / 32;
				this.drawMinimapArrow(var18, this.imageMapmarker1, var17);
			}
			if (this.hintType == 10 && this.hintPlayer >= 0 && this.hintPlayer < this.players.length) {
				ClientPlayer var19 = this.players[this.hintPlayer];
				if (var19 != null) {
					int var20 = var19.field1157 / 32 - localPlayer.field1157 / 32;
					int var21 = var19.field1158 / 32 - localPlayer.field1158 / 32;
					this.drawMinimapArrow(var21, this.imageMapmarker1, var20);
				}
			}
		}
		if (this.flagSceneTileX != 0) {
			int var22 = this.flagSceneTileX * 4 + 2 - localPlayer.field1157 / 32;
			int var23 = this.flagSceneTileZ * 4 + 2 - localPlayer.field1158 / 32;
			this.drawOnMinimap(var23, this.imageMapmarker0, var22);
		}
		Pix2D.fillRect(3, 78, 16777215, 3, 97);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	public URL getCodeBase() {
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

	@ObfuscatedName("client.a(IIB)Z")
	public boolean updateInterfaceAnimation(int arg0, int arg1) {
		boolean var4 = false;
		Component var5 = Component.get(arg1);
		for (int var6 = 0; var6 < var5.children.length && var5.children[var6] != -1; var6++) {
			Component var7 = Component.get(var5.children[var6]);
			if (var7.type == 0) {
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
					SeqType var10 = SeqType.field775[var9];
					var7.field709 += arg0;
					while (var7.field709 > var10.method214(var7.field717)) {
						var7.field709 -= var10.method214(var7.field717);
						var7.field717++;
						if (var7.field717 >= var10.field776) {
							var7.field717 -= var10.field780;
							if (var7.field717 < 0 || var7.field717 >= var10.field776) {
								var7.field717 = 0;
							}
						}
						var4 = true;
					}
				}
			}
			if (var7.type == 6 && var7.field700 != 0) {
				int var11 = var7.field700 >> 16;
				int var12 = var7.field700 << 16 >> 16;
				int var13 = arg0 * var11;
				int var14 = arg0 * var12;
				var7.xan = var7.xan + var13 & 0x7FF;
				var7.yan = var7.yan + var14 & 0x7FF;
				var4 = true;
			}
		}
		return var4;
	}

	@ObfuscatedName("client.e(II)Ljava/lang/String;")
	public String getIntString(int arg0) {
		return arg0 < 999999999 ? String.valueOf(arg0) : "*";
	}

	@ObfuscatedName("client.a(IJ)V")
	public void addIgnore(long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.ignoreCount >= 100) {
			this.addMessage("", "Your ignore list is full. Max of 100 hit", 0);
			return;
		}
		String var4 = JString.formatDisplayName(JString.fromBase37(arg1));
		for (int var5 = 0; var5 < this.ignoreCount; var5++) {
			if (this.ignoreName37[var5] == arg1) {
				this.addMessage("", var4 + " is already on your ignore list", 0);
				return;
			}
		}
		for (int var6 = 0; var6 < this.friendCount; var6++) {
			if (this.friendName37[var6] == arg1) {
				this.addMessage("", "Please remove " + var4 + " from your friend list first", 0);
				return;
			}
		}
		this.ignoreName37[this.ignoreCount++] = arg1;
		this.redrawSidebar = true;
		// IGNORELIST_ADD
		this.out.p1isaac(217);
		this.out.p8(arg1);
	}

	@ObfuscatedName("client.a(B)V")
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

	@ObfuscatedName("client.w(I)V")
	public void handleInput() {
		if (this.objDragArea != 0) {
			return;
		}
		this.menuOption[0] = "Cancel";
		this.menuAction[0] = 1016;
		this.menuSize = 1;
		if (this.fullscreenInterfaceId0 != -1) {
			this.lastHoveredInterfaceId = 0;
			this.field611 = 0;
			this.handleInterfaceInput(0, Component.get(this.fullscreenInterfaceId0), 0, 0, 0, super.mouseX, super.mouseY);
			if (this.viewportHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
				this.viewportHoveredInterfaceIndex = this.lastHoveredInterfaceId;
			}
			if (this.field611 != this.field425) {
				this.field425 = this.field611;
			}
			return;
		}
		this.handlePrivateChatInput();
		this.lastHoveredInterfaceId = 0;
		this.field611 = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (this.viewportInterfaceId == -1) {
				this.handleViewportOptions();
			} else {
				this.handleInterfaceInput(4, Component.get(this.viewportInterfaceId), 0, 0, 4, super.mouseX, super.mouseY);
			}
		}
		if (this.viewportHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.viewportHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		if (this.field611 != this.field425) {
			this.field425 = this.field611;
		}
		this.lastHoveredInterfaceId = 0;
		this.field611 = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.sidebarInterfaceId != -1) {
				this.handleInterfaceInput(205, Component.get(this.sidebarInterfaceId), 1, 0, 553, super.mouseX, super.mouseY);
			} else if (this.tabInterfaceId[this.selectedTab] != -1) {
				this.handleInterfaceInput(205, Component.get(this.tabInterfaceId[this.selectedTab]), 1, 0, 553, super.mouseX, super.mouseY);
			}
		}
		if (this.sidebarHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.redrawSidebar = true;
			this.sidebarHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		if (this.field611 != this.field340) {
			this.redrawSidebar = true;
			this.field340 = this.field611;
		}
		this.lastHoveredInterfaceId = 0;
		this.field611 = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (this.chatInterfaceId != -1) {
				this.handleInterfaceInput(357, Component.get(this.chatInterfaceId), 2, 0, 17, super.mouseX, super.mouseY);
			} else if (this.stickyChatInterfaceId != -1) {
				this.handleInterfaceInput(357, Component.get(this.stickyChatInterfaceId), 3, 0, 17, super.mouseX, super.mouseY);
			} else if (super.mouseY < 434 && super.mouseX < 426 && this.chatbackInputOpen == 0) {
				this.handleChatMouseInput(super.mouseX - 17, super.mouseY - 357);
			}
		}
		if ((this.chatInterfaceId != -1 || this.stickyChatInterfaceId != -1) && this.chatHoveredInterfaceIndex != this.lastHoveredInterfaceId) {
			this.redrawChatback = true;
			this.chatHoveredInterfaceIndex = this.lastHoveredInterfaceId;
		}
		if ((this.chatInterfaceId != -1 || this.stickyChatInterfaceId != -1) && this.field611 != this.field580) {
			this.redrawChatback = true;
			this.field580 = this.field611;
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

	@ObfuscatedName("client.c(III)Ljava/lang/String;")
	public static String getCombatLevelTag(int arg0, int arg1) {
		int var3 = arg1 - arg0;
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

	@ObfuscatedName("client.x(I)V")
	public void buildScene() {
		try {
			this.minimapLevel = -1;
			this.spotanims.method10();
			this.projectiles.method10();
			Pix3D.clearTexels();
			this.clearCache();
			this.scene.method274();
			System.gc();
			for (int var2 = 0; var2 < 4; var2++) {
				this.levelCollisionMap[var2].method532();
			}
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						this.levelTileFlags[var3][var4][var5] = 0;
					}
				}
			}
			World var6 = new World(this.levelHeightmap, this.levelTileFlags, 104, 104);
			int var7 = this.sceneMapLandData.length;
			// NO_TIMEOUT
			this.out.p1isaac(40);
			if (!this.sceneInstanced) {
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = (this.sceneMapIndex[var8] >> 8) * 64 - this.sceneBaseTileX;
					int var10 = (this.sceneMapIndex[var8] & 0xFF) * 64 - this.sceneBaseTileZ;
					byte[] var11 = this.sceneMapLandData[var8];
					if (var11 != null) {
						var6.method22(var10, (this.sceneCenterZoneZ - 6) * 8, var9, var11, (this.sceneCenterZoneX - 6) * 8, this.levelCollisionMap);
					}
				}
				for (int var12 = 0; var12 < var7; var12++) {
					int var13 = (this.sceneMapIndex[var12] >> 8) * 64 - this.sceneBaseTileX;
					int var14 = (this.sceneMapIndex[var12] & 0xFF) * 64 - this.sceneBaseTileZ;
					byte[] var15 = this.sceneMapLandData[var12];
					if (var15 == null && this.sceneCenterZoneZ < 800) {
						var6.method28(var13, var14, 64, 64);
					}
				}
				// NO_TIMEOUT
				this.out.p1isaac(40);
				for (int var16 = 0; var16 < var7; var16++) {
					byte[] var17 = this.sceneMapLocData[var16];
					if (var17 != null) {
						int var18 = (this.sceneMapIndex[var16] >> 8) * 64 - this.sceneBaseTileX;
						int var19 = (this.sceneMapIndex[var16] & 0xFF) * 64 - this.sceneBaseTileZ;
						var6.method27(var19, this.levelCollisionMap, var18, this.scene, var17);
					}
				}
			}
			if (this.sceneInstanced) {
				int var20 = 0;
				label252: while (true) {
					if (var20 >= 4) {
						for (int var31 = 0; var31 < 13; var31++) {
							for (int var32 = 0; var32 < 13; var32++) {
								int var33 = this.sceneMapRegion[0][var31][var32];
								if (var33 == -1) {
									var6.method28(var31 * 8, var32 * 8, 8, 8);
								}
							}
						}
						// NO_TIMEOUT
						this.out.p1isaac(40);
						int var34 = 0;
						while (true) {
							if (var34 >= 4) {
								break label252;
							}
							for (int var35 = 0; var35 < 13; var35++) {
								for (int var36 = 0; var36 < 13; var36++) {
									int var37 = this.sceneMapRegion[var34][var35][var36];
									if (var37 != -1) {
										int var38 = var37 >> 24 & 0x3;
										int var39 = var37 >> 1 & 0x3;
										int var40 = var37 >> 14 & 0x3FF;
										int var41 = var37 >> 3 & 0x7FF;
										int var42 = (var40 / 8 << 8) + var41 / 8;
										for (int var43 = 0; var43 < this.sceneMapIndex.length; var43++) {
											if (this.sceneMapIndex[var43] == var42 && this.sceneMapLocData[var43] != null) {
												var6.method20(var34, this.levelCollisionMap, this.scene, this.sceneMapLocData[var43], var36 * 8, var39, (var40 & 0x7) * 8, var35 * 8, (var41 & 0x7) * 8, var38);
												break;
											}
										}
									}
								}
							}
							var34++;
						}
					}
					for (int var21 = 0; var21 < 13; var21++) {
						for (int var22 = 0; var22 < 13; var22++) {
							boolean var23 = false;
							int var24 = this.sceneMapRegion[var20][var21][var22];
							if (var24 != -1) {
								int var25 = var24 >> 24 & 0x3;
								int var26 = var24 >> 1 & 0x3;
								int var27 = var24 >> 14 & 0x3FF;
								int var28 = var24 >> 3 & 0x7FF;
								int var29 = (var27 / 8 << 8) + var28 / 8;
								for (int var30 = 0; var30 < this.sceneMapIndex.length; var30++) {
									if (this.sceneMapIndex[var30] == var29 && this.sceneMapLandData[var30] != null) {
										var6.method16(var26, (var28 & 0x7) * 8, this.sceneMapLandData[var30], var20, var25, var21 * 8, this.levelCollisionMap, var22 * 8, (var27 & 0x7) * 8);
										var23 = true;
										break;
									}
								}
							}
							if (!var23) {
								var6.method14(var20, var22 * 8, var21 * 8);
							}
						}
					}
					var20++;
				}
			}
			// NO_TIMEOUT
			this.out.p1isaac(40);
			var6.method15(this.levelCollisionMap, this.scene);
			if (this.areaViewport != null) {
				this.areaViewport.bind();
				Pix3D.lineOffset = this.areaViewportOffset;
			}
			// NO_TIMEOUT
			this.out.p1isaac(40);
			int var44 = World.field113;
			if (var44 > this.currentLevel) {
				var44 = this.currentLevel;
			}
			if (var44 < this.currentLevel - 1) {
				int var45 = this.currentLevel - 1;
			}
			if (lowMem) {
				this.scene.method275(World.field113);
			} else {
				this.scene.method275(0);
			}
			for (int var46 = 0; var46 < 104; var46++) {
				for (int var47 = 0; var47 < 104; var47++) {
					this.sortObjStacks(var46, var47);
				}
			}
			this.clearLocChanges();
		} catch (Exception var61) {
		}
		LocType.field1633.clear();
		if (super.frame != null) {
			// todo: notifying the client is in a frame
			this.out.p1isaac(78);
			this.out.p4(1057001181);
		}
		if (lowMem && signlink.cache_dat != null) {
			int var49 = this.onDemand.getFileCount(0);
			for (int var50 = 0; var50 < var49; var50++) {
				int var51 = this.onDemand.getModelFlags(var50);
				if ((var51 & 0x79) == 0) {
					Model.method358(var50);
				}
			}
		}
		System.gc();
		Pix3D.initPool(20);
		this.onDemand.method593();
		int var52 = (this.sceneCenterZoneX - 6) / 8 - 1;
		int var53 = (this.sceneCenterZoneX + 6) / 8 + 1;
		int var54 = (this.sceneCenterZoneZ - 6) / 8 - 1;
		int var55 = (this.sceneCenterZoneZ + 6) / 8 + 1;
		if (this.withinTutorialIsland) {
			var52 = 49;
			var53 = 50;
			var54 = 49;
			var55 = 50;
		}
		for (int var57 = var52; var57 <= var53; var57++) {
			for (int var58 = var54; var58 <= var55; var58++) {
				if (var52 == var57 || var53 == var57 || var54 == var58 || var55 == var58) {
					int var59 = this.onDemand.getMapFile(var57, var58, 0);
					if (var59 != -1) {
						this.onDemand.method594(var59, 3);
					}
					int var60 = this.onDemand.getMapFile(var57, var58, 1);
					if (var60 != -1) {
						this.onDemand.method594(var60, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIB)V")
	public void orbitCamera(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var8 = 2048 - arg2 & 0x7FF;
		int var9 = 2048 - arg4 & 0x7FF;
		int var10 = 0;
		int var11 = 0;
		int var12 = arg3;
		if (var8 != 0) {
			int var13 = Model.sinTable[var8];
			int var14 = Model.cosTable[var8];
			int var15 = var11 * var14 - arg3 * var13 >> 16;
			var12 = var11 * var13 + arg3 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.sinTable[var9];
			int var17 = Model.cosTable[var9];
			int var18 = var10 * var17 + var12 * var16 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		this.cameraX = arg1 - var10;
		this.cameraY = arg0 - var11;
		this.cameraZ = arg5 - var12;
		this.cameraPitch = arg2;
		this.cameraYaw = arg4;
	}

	@ObfuscatedName("client.b(LEWIXBTLV;I)Z")
	public boolean executeInterfaceScript(Component arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg0.scriptComparator.length; var3++) {
			int var4 = this.executeClientScript(var3, arg0);
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

	@ObfuscatedName("client.a(IILMFMVIYHT;)V")
	public void getPlayerPos(int psize, Packet buf) {
		this.entityRemovalCount = 0;
		this.entityUpdateCount = 0;

		this.getPlayerLocal(psize, buf);
		this.getPlayerOldVis(psize, buf);
		this.getPlayerNewVis(psize, buf);
		this.getPlayerExtended(buf, psize);

		for (int i = 0; i < this.entityRemovalCount; i++) {
			int index = this.entityRemovalIds[i];
			if (loopCycle != this.players[index].cycle) {
				this.players[index] = null;
			}
		}

		if (buf.pos != psize) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + buf.pos + " psize:" + psize);
			throw new RuntimeException("eek");
		}

		for (int i = 0; i < this.playerCount; i++) {
			if (this.players[this.playerIds[i]] == null) {
				signlink.reporterror(this.username + " null entry in pl list - pos:" + i + " size:" + this.playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
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
				this.out.p1isaac(160);
				this.out.p8(arg1);
				break;
			}
		}
	}

	public String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.y(I)V")
	public void drawFlames() {
		short var2 = 256;
		if (this.flameGradientCycle0 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.flameGradientCycle0 > 768) {
					this.flameGradient[var3] = this.mix(this.flameGradient0[var3], this.flameGradient1[var3], 1024 - this.flameGradientCycle0);
				} else if (this.flameGradientCycle0 > 256) {
					this.flameGradient[var3] = this.flameGradient1[var3];
				} else {
					this.flameGradient[var3] = this.mix(this.flameGradient1[var3], this.flameGradient0[var3], 256 - this.flameGradientCycle0);
				}
			}
		} else if (this.flameGradientCycle1 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.flameGradientCycle1 > 768) {
					this.flameGradient[var4] = this.mix(this.flameGradient0[var4], this.flameGradient2[var4], 1024 - this.flameGradientCycle1);
				} else if (this.flameGradientCycle1 > 256) {
					this.flameGradient[var4] = this.flameGradient2[var4];
				} else {
					this.flameGradient[var4] = this.mix(this.flameGradient2[var4], this.flameGradient0[var4], 256 - this.flameGradientCycle1);
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
			int var24 = (var2 - var9) * this.flameLineOffset[var9] / var2;
			int var25 = var24 + 22;
			if (var25 < 0) {
				var25 = 0;
			}
			var7 += var25;
			for (int var26 = var25; var26 < 128; var26++) {
				int var27 = this.flameBuffer3[var7++];
				if (var27 == 0) {
					var8++;
				} else {
					int var29 = 256 - var27;
					int var30 = this.flameGradient[var27];
					int var31 = this.imageTitle0.data[var8];
					this.imageTitle0.data[var8++] = ((var30 & 0xFF00FF) * var27 + (var31 & 0xFF00FF) * var29 & 0xFF00FF00) + ((var30 & 0xFF00) * var27 + (var31 & 0xFF00) * var29 & 0xFF0000) >> 8;
				}
			}
			var8 += var25;
		}
		this.imageTitle0.draw(0, 0, super.graphics);
		for (int var11 = 0; var11 < 33920; var11++) {
			this.imageTitle1.data[var11] = this.imageFlamesRight.pixels[var11];
		}
		int var12 = 0;
		int var13 = 1176;
		for (int var14 = 1; var14 < var2 - 1; var14++) {
			int var15 = (var2 - var14) * this.flameLineOffset[var14] / var2;
			int var16 = 103 - var15;
			int var17 = var13 + var15;
			for (int var18 = 0; var18 < var16; var18++) {
				int var19 = this.flameBuffer3[var12++];
				if (var19 == 0) {
					var17++;
				} else {
					int var21 = 256 - var19;
					int var22 = this.flameGradient[var19];
					int var23 = this.imageTitle1.data[var17];
					this.imageTitle1.data[var17++] = ((var22 & 0xFF00FF) * var19 + (var23 & 0xFF00FF) * var21 & 0xFF00FF00) + ((var22 & 0xFF00) * var19 + (var23 & 0xFF00) * var21 & 0xFF0000) >> 8;
				}
			}
			var12 += 128 - var16;
			var13 = 128 - var16 - var15 + var17;
		}
		this.imageTitle1.draw(0, 637, super.graphics);
	}

	@ObfuscatedName("client.a(ZBI)V")
	public void setMidiVolume(boolean midiActive, int arg2) {
		signlink.midivol = arg2;
		if (midiActive) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void updatePlayers() {
		for (int var2 = -1; var2 < this.playerCount; var2++) {
			int var4;
			if (var2 == -1) {
				var4 = this.LOCAL_PLAYER_INDEX;
			} else {
				var4 = this.playerIds[var2];
			}
			ClientPlayer var5 = this.players[var4];
			if (var5 != null) {
				this.updateEntity(1, var5);
			}
		}
	}

	@ObfuscatedName("client.l(Z)V")
	public static void setLowMem() {
		World3D.lowMem = true;
		Pix3D.lowMem = true;
		lowMem = true;
		World.lowMem = true;
		LocType.lowMem = true;
	}

	@ObfuscatedName("client.b(JI)V")
	public void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.friendCount >= 100 && this.membersAccount != 1) {
			this.addMessage("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
		} else if (this.friendCount >= 200) {
			this.addMessage("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
		} else {
			String var4 = JString.formatDisplayName(JString.fromBase37(arg0));
			for (int var5 = 0; var5 < this.friendCount; var5++) {
				if (this.friendName37[var5] == arg0) {
					this.addMessage("", var4 + " is already on your friend list", 0);
					return;
				}
			}
			for (int var6 = 0; var6 < this.ignoreCount; var6++) {
				if (this.ignoreName37[var6] == arg0) {
					this.addMessage("", "Please remove " + var4 + " from your ignore list first", 0);
					return;
				}
			}
			if (!var4.equals(localPlayer.name)) {
				this.friendName[this.friendCount] = var4;
				this.friendName37[this.friendCount] = arg0;
				this.friendWorld[this.friendCount] = 0;
				this.friendCount++;
				this.redrawSidebar = true;
				// FRIENDLIST_ADD
				this.out.p1isaac(120);
				this.out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BLEWIXBTLV;)V")
	public void updateInterfaceContent(Component arg1) {
		int var4 = arg1.clientCode;
		if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
			if (var4 >= 101 && var4 <= 200 || !(var4 < 801 || var4 > 900)) {
				int var6 = this.friendCount;
				if (this.friendlistStatus != 2) {
					var6 = 0;
				}
				if (var4 > 800) {
					var4 -= 701;
				} else {
					var4 -= 101;
				}
				if (var4 >= var6) {
					arg1.text = "";
					arg1.buttonType = 0;
				} else {
					if (this.friendWorld[var4] == 0) {
						arg1.text = "@red@Offline";
					} else if (this.friendWorld[var4] < 200) {
						if (this.friendWorld[var4] == nodeId) {
							arg1.text = "@gre@World" + (this.friendWorld[var4] - 9);
						} else {
							arg1.text = "@yel@World" + (this.friendWorld[var4] - 9);
						}
					} else if (this.friendWorld[var4] == nodeId) {
						arg1.text = "@gre@Classic" + (this.friendWorld[var4] - 219);
					} else {
						arg1.text = "@yel@Classic" + (this.friendWorld[var4] - 219);
					}
					arg1.buttonType = 1;
				}
			} else if (var4 == 203) {
				int var7 = this.friendCount;
				if (this.friendlistStatus != 2) {
					var7 = 0;
				}
				arg1.scroll = var7 * 15 + 20;
				if (arg1.scroll <= arg1.height) {
					arg1.scroll = arg1.height + 1;
				}
			} else if (var4 >= 401 && var4 <= 500) {
				var4 -= 401;
				if (var4 == 0 && this.friendlistStatus == 0) {
					arg1.text = "Loading ignore list";
					arg1.buttonType = 0;
				} else if (var4 == 1 && this.friendlistStatus == 0) {
					arg1.text = "Please wait...";
					arg1.buttonType = 0;
				} else {
					int var8 = this.ignoreCount;
					if (this.friendlistStatus == 0) {
						var8 = 0;
					}
					if (var4 >= var8) {
						arg1.text = "";
						arg1.buttonType = 0;
					} else {
						arg1.text = JString.formatDisplayName(JString.fromBase37(this.ignoreName37[var4]));
						arg1.buttonType = 1;
					}
				}
			} else if (var4 == 503) {
				arg1.scroll = this.ignoreCount * 15 + 20;
				if (arg1.scroll <= arg1.height) {
					arg1.scroll = arg1.height + 1;
				}
			} else if (var4 == 327) {
				arg1.xan = 150;
				arg1.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
				if (this.updateDesignModel) {
					for (int var9 = 0; var9 < 7; var9++) {
						int var16 = this.designKits[var9];
						if (var16 >= 0 && !IdkType.field1699[var16].method577()) {
							return;
						}
					}
					this.updateDesignModel = false;
					Model[] var10 = new Model[7];
					int var11 = 0;
					for (int var12 = 0; var12 < 7; var12++) {
						int var15 = this.designKits[var12];
						if (var15 >= 0) {
							var10[var11++] = IdkType.field1699[var15].method578();
						}
					}
					Model var13 = new Model(var11, var10, (byte) -89);
					for (int var14 = 0; var14 < 5; var14++) {
						if (this.designColours[var14] != 0) {
							var13.method373(DESIGN_BODY_COLOUR[var14][0], DESIGN_BODY_COLOUR[var14][this.designColours[var14]]);
							if (var14 == 1) {
								var13.method373(DESIGN_HAIR_COLOUR[0], DESIGN_HAIR_COLOUR[this.designColours[var14]]);
							}
						}
					}
					var13.createLabelReferences();
					var13.applyTransform(SeqType.field775[localPlayer.field1181].field777[0]);
					var13.calculateNormals(64, 850, -30, -50, -30, true);
					arg1.modelType = 5;
					arg1.model = 0;
					Component.cacheModel(5, var13, 0);
				}
			} else if (var4 == 324) {
				if (this.genderButtonImage0 == null) {
					this.genderButtonImage0 = arg1.graphic;
					this.genderButtonImage1 = arg1.activeGraphic;
				}
				if (this.designGender) {
					arg1.graphic = this.genderButtonImage1;
				} else {
					arg1.graphic = this.genderButtonImage0;
				}
			} else if (var4 == 325) {
				if (this.genderButtonImage0 == null) {
					this.genderButtonImage0 = arg1.graphic;
					this.genderButtonImage1 = arg1.activeGraphic;
				}
				if (this.designGender) {
					arg1.graphic = this.genderButtonImage0;
				} else {
					arg1.graphic = this.genderButtonImage1;
				}
			} else if (var4 == 600) {
				arg1.text = this.reportAbuseInput;
				if (loopCycle % 20 < 10) {
					arg1.text = arg1.text + "|";
				} else {
					arg1.text = arg1.text + " ";
				}
			} else {
				if (var4 == 620) {
					if (this.staffModLevel < 1) {
						arg1.text = "";
					} else if (this.reportAbuseMuteOption) {
						arg1.colour = 16711680;
						arg1.text = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg1.colour = 16777215;
						arg1.text = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var4 == 660) {
					int var17 = this.currentDay - this.previousLoginDay;
					String var18;
					if (var17 <= 0) {
						var18 = "earlier today";
					} else if (var17 == 1) {
						var18 = "yesterday";
					} else {
						var18 = var17 + " days ago";
					}
					arg1.text = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
				}
				if (var4 == 661) {
					if (this.recoveriesLastChangedDay == 0) {
						arg1.text = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
					} else if (this.recoveriesLastChangedDay <= this.currentDay) {
						arg1.text = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.getDateString(this.recoveriesLastChangedDay);
					} else {
						int var19 = this.currentDay + 14 - this.recoveriesLastChangedDay;
						String var20;
						if (var19 <= 0) {
							var20 = "Earlier today";
						} else if (var19 == 1) {
							var20 = "Yesterday";
						} else {
							var20 = var19 + " days ago";
						}
						arg1.text = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.getDateString(this.recoveriesLastChangedDay) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
					}
				}
				if (var4 == 662) {
					String var21;
					if (this.unreadMessageCount == 0) {
						var21 = "@yel@0 unread messages";
					} else if (this.unreadMessageCount == 1) {
						var21 = "@gre@1 unread message";
					} else {
						var21 = "@gre@" + this.unreadMessageCount + " unread messages";
					}
					arg1.text = "You have " + var21 + "\\nin your message centre.";
				}
				if (var4 == 663) {
					if (this.daysSincePasswordChanged > 0 && this.daysSincePasswordChanged <= this.currentDay + 10) {
						arg1.text = "Last password change:\\n@gre@" + this.getDateString(this.daysSincePasswordChanged);
					} else {
						arg1.text = "Last password change:\\n@gre@Never changed";
					}
				}
				if (var4 == 665) {
					if (this.daysOfMembersRemaining > 2 && !membersWorld) {
						arg1.text = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
					} else if (this.daysOfMembersRemaining > 2) {
						arg1.text = "\\n\\nYou have @gre@" + this.daysOfMembersRemaining + "@yel@ days of\\nmember credit remaining.";
					} else if (this.daysOfMembersRemaining > 0) {
						arg1.text = "You have @gre@" + this.daysOfMembersRemaining + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
					} else {
						arg1.text = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
					}
				}
				if (var4 == 667) {
					if (this.daysOfMembersRemaining > 2 && !membersWorld) {
						arg1.text = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
					} else if (this.daysOfMembersRemaining > 0) {
						arg1.text = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
					} else {
						arg1.text = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
					}
				}
				if (var4 == 668) {
					if (this.recoveriesLastChangedDay > this.currentDay) {
						arg1.text = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
					} else {
						arg1.text = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
					}
				}
			}
		} else if (var4 == 1 && this.friendlistStatus == 0) {
			arg1.text = "Loading friend list";
			arg1.buttonType = 0;
		} else if (var4 == 1 && this.friendlistStatus == 1) {
			arg1.text = "Connecting to friendserver";
			arg1.buttonType = 0;
		} else if (var4 == 2 && this.friendlistStatus != 2) {
			arg1.text = "Please wait...";
			arg1.buttonType = 0;
		} else {
			int var5 = this.friendCount;
			if (this.friendlistStatus != 2) {
				var5 = 0;
			}
			if (var4 > 700) {
				var4 -= 601;
			} else {
				var4--;
			}
			if (var4 >= var5) {
				arg1.text = "";
				arg1.buttonType = 0;
			} else {
				arg1.text = this.friendName[var4];
				arg1.buttonType = 1;
			}
		}
	}

	@ObfuscatedName("client.a(IB)Ljava/lang/String;")
	public String getDateString(int arg0) {
		if (arg0 > this.currentDay + 10) {
			return "Unknown";
		}
		long var3 = ((long) arg0 + 11745L) * 86400000L;
		Calendar var5 = Calendar.getInstance();
		var5.setTime(new Date(var3));
		int var6 = var5.get(Calendar.DATE);
		int var7 = var5.get(Calendar.MONTH);
		int var8 = var5.get(Calendar.YEAR);
		String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		return var6 + "-" + var9[var7] + "-" + var8;
	}

	@ObfuscatedName("client.f(II)V")
	public void updateVarp(int arg1) {
		int var3 = VarpType.field1507[arg1].field1515;
		if (var3 == 0) {
			return;
		}
		int var4 = this.varps[arg1];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.initColourTable(0.9D);
			}
			if (var4 == 2) {
				Pix3D.initColourTable(0.8D);
			}
			if (var4 == 3) {
				Pix3D.initColourTable(0.7D);
			}
			if (var4 == 4) {
				Pix3D.initColourTable(0.6D);
			}
			ObjType.field828.clear();
			this.redrawFrame = true;
		}
		if (var3 == 3) {
			boolean var5 = this.midiActive;
			if (var4 == 0) {
				this.setMidiVolume(this.midiActive, 128);
				this.midiActive = true;
			}
			if (var4 == 1) {
				this.setMidiVolume(this.midiActive, 96);
				this.midiActive = true;
			}
			if (var4 == 2) {
				this.setMidiVolume(this.midiActive, 64);
				this.midiActive = true;
			}
			if (var4 == 3) {
				this.setMidiVolume(this.midiActive, 32);
				this.midiActive = true;
			}
			if (var4 == 4) {
				this.midiActive = false;
			}
			if (this.midiActive != var5 && !lowMem) {
				if (this.midiActive) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = true;
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
				this.setWaveVolume(128);
			}
			if (var4 == 1) {
				this.waveEnabled = true;
				this.setWaveVolume(96);
			}
			if (var4 == 2) {
				this.waveEnabled = true;
				this.setWaveVolume(64);
			}
			if (var4 == 3) {
				this.waveEnabled = true;
				this.setWaveVolume(32);
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

	@ObfuscatedName("client.b(IIII)I")
	public int mix(int arg0, int arg1, int arg2) {
		int var5 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var5 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var5 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.A(I)V")
	public void updateWorldLocation() {
		this.overrideChat = 0;
		int var2 = (localPlayer.field1157 >> 7) + this.sceneBaseTileX;
		int var3 = (localPlayer.field1158 >> 7) + this.sceneBaseTileZ;
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

	@ObfuscatedName("client.B(I)V")
	public void showContextMenu() {
		int var2 = this.fontBold12.stringWidTag("Choose Option");
		for (int var3 = 0; var3 < this.menuSize; var3++) {
			int var11 = this.fontBold12.stringWidTag(this.menuOption[var3]);
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
		if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
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
	}

	@ObfuscatedName("client.C(I)V")
	public void draw3DEntityElements() {
		this.drawPrivateMessages();
		if (this.crossMode == 1) {
			this.imageCross[this.crossCycle / 100].plotSprite(this.crossY - 8 - 4, this.crossX - 8 - 4);
		}
		if (this.crossMode == 2) {
			this.imageCross[this.crossCycle / 100 + 4].plotSprite(this.crossY - 8 - 4, this.crossX - 8 - 4);
		}
		if (this.viewportOverlayInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, this.viewportOverlayInterfaceId);
			this.drawInterface(0, 0, Component.get(this.viewportOverlayInterfaceId), 0);
		}
		if (this.viewportInterfaceId != -1) {
			this.updateInterfaceAnimation(this.sceneDelta, this.viewportInterfaceId);
			this.drawInterface(0, 0, Component.get(this.viewportInterfaceId), 0);
		}
		this.updateWorldLocation();
		if (!this.menuVisible) {
			this.handleInput();
			this.drawTooltip();
		} else if (this.menuArea == 0) {
			this.drawMenu();
		}
		if (this.inMultizone == 1) {
			this.imageOverlayMultiway.plotSprite(296, 472);
		}
		if (displayFps) {
			short var2 = 507;
			byte var3 = 20;
			int var4 = 16776960;
			if (super.fps < 30 && lowMem) {
				var4 = 16711680;
			}
			if (super.fps < 20 && !lowMem) {
				var4 = 16711680;
			}
			this.fontPlain12.method243("Fps:" + super.fps, var4, var2, var3);
			int var13 = var3 + 15;
			Runtime var5 = Runtime.getRuntime();
			int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
			int var7 = 16776960;
			if (var6 > 33554432 && lowMem) {
				int var8 = 16711680;
			}
			if (var6 > 67108864 && !lowMem) {
				int var9 = 16711680;
			}
			this.fontPlain12.method243("Mem:" + var6 + "k", 16776960, var2, var13);
			var13 += 15;
		}
		if (this.systemUpdateTimer != 0) {
			int var10 = this.systemUpdateTimer / 50;
			int var11 = var10 / 60;
			int var12 = var10 % 60;
			if (var12 < 10) {
				this.fontPlain12.drawString(4, 16776960, 329, "System update in: " + var11 + ":0" + var12);
			} else {
				this.fontPlain12.drawString(4, 16776960, 329, "System update in: " + var11 + ":" + var12);
			}
			cyclelogic3++;
			if (cyclelogic3 > 112) {
				cyclelogic3 = 0;
				// ANTICHEAT_CYCLELOGIC3
				this.out.p1isaac(197);
				this.out.p4(0);
			}
		}
	}

	public void run() {
		if (this.flameActive0) {
			this.runFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public int getHeightmapY(int arg0, int arg1, int arg3) {
		int var5 = arg1 >> 7;
		int var6 = arg0 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg3;
		if (arg3 < 3 && (this.levelTileFlags[1][var5][var6] & 0x2) == 2) {
			var7 = arg3 + 1;
		}
		int var8 = arg1 & 0x7F;
		int var9 = arg0 & 0x7F;
		int var10 = (128 - var8) * this.levelHeightmap[var7][var5][var6] + this.levelHeightmap[var7][var5 + 1][var6] * var8 >> 7;
		int var11 = (128 - var8) * this.levelHeightmap[var7][var5][var6 + 1] + this.levelHeightmap[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return (128 - var9) * var10 + var9 * var11 >> 7;
	}

	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.D(I)V")
	public void handlePrivateChatInput() {
		if (this.splitPrivateChat == 0) {
			return;
		}
		int var3 = 0;
		if (this.systemUpdateTimer != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.messageText[var4] != null) {
				int var5 = this.messageType[var4];
				String var6 = this.messageSender[var4];
				boolean var7 = false;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					boolean var8 = true;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					boolean var9 = true;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var6))) {
					int var10 = 329 - var3 * 13;
					if (super.mouseX > 4 && super.mouseY - 4 > var10 - 10 && super.mouseY - 4 <= var10 + 3) {
						int var11 = this.fontPlain12.stringWidTag("From:  " + var6 + this.messageText[var4]) + 25;
						if (var11 > 450) {
							var11 = 450;
						}
						if (super.mouseX < var11 + 4) {
							if (this.staffModLevel >= 1) {
								this.menuOption[this.menuSize] = "Report abuse @whi@" + var6;
								this.menuAction[this.menuSize] = 2507;
								this.menuSize++;
							}
							this.menuOption[this.menuSize] = "Add ignore @whi@" + var6;
							this.menuAction[this.menuSize] = 2574;
							this.menuSize++;
							this.menuOption[this.menuSize] = "Add friend @whi@" + var6;
							this.menuAction[this.menuSize] = 2762;
							this.menuSize++;
						}
					}
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if ((var5 == 5 || var5 == 6) && this.chatPrivateMode < 2) {
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public void resetInterfaceAnimation(int arg1) {
		Component var3 = Component.get(arg1);
		for (int var4 = 0; var4 < var3.children.length && var3.children[var4] != -1; var4++) {
			Component var5 = Component.get(var3.children[var4]);
			if (var5.type == 1) {
				this.resetInterfaceAnimation(var5.id);
			}
			var5.field717 = 0;
			var5.field709 = 0;
		}
	}

	@ObfuscatedName("client.d(III)V")
	public void handleChatMouseInput(int arg1, int arg2) {
		int var4 = 0;
		for (int var6 = 0; var6 < 100; var6++) {
			if (this.messageText[var6] != null) {
				int var7 = this.messageType[var6];
				int var8 = 70 - var4 * 14 + this.chatScrollOffset + 4;
				if (var8 < -20) {
					break;
				}
				String var9 = this.messageSender[var6];
				boolean var10 = false;
				if (var9 != null && var9.startsWith("@cr1@")) {
					var9 = var9.substring(5);
					boolean var11 = true;
				}
				if (var9 != null && var9.startsWith("@cr2@")) {
					var9 = var9.substring(5);
					boolean var12 = true;
				}
				if (var7 == 0) {
					var4++;
				}
				if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8 && !var9.equals(localPlayer.name)) {
						if (this.staffModLevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var9;
							this.menuAction[this.menuSize] = 507;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var9;
						this.menuAction[this.menuSize] = 574;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var9;
						this.menuAction[this.menuSize] = 762;
						this.menuSize++;
					}
					var4++;
				}
				if ((var7 == 3 || var7 == 7) && this.splitPrivateChat == 0 && (var7 == 7 || this.chatPrivateMode == 0 || this.chatPrivateMode == 1 && this.isFriend(var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						if (this.staffModLevel >= 1) {
							this.menuOption[this.menuSize] = "Report abuse @whi@" + var9;
							this.menuAction[this.menuSize] = 507;
							this.menuSize++;
						}
						this.menuOption[this.menuSize] = "Add ignore @whi@" + var9;
						this.menuAction[this.menuSize] = 574;
						this.menuSize++;
						this.menuOption[this.menuSize] = "Add friend @whi@" + var9;
						this.menuAction[this.menuSize] = 762;
						this.menuSize++;
					}
					var4++;
				}
				if (var7 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						this.menuOption[this.menuSize] = "Accept trade @whi@" + var9;
						this.menuAction[this.menuSize] = 544;
						this.menuSize++;
					}
					var4++;
				}
				if ((var7 == 5 || var7 == 6) && this.splitPrivateChat == 0 && this.chatPrivateMode < 2) {
					var4++;
				}
				if (var7 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var9))) {
					if (arg2 > var8 - 14 && arg2 <= var8) {
						this.menuOption[this.menuSize] = "Accept challenge @whi@" + var9;
						this.menuAction[this.menuSize] = 695;
						this.menuSize++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.b(IILMFMVIYHT;)V")
	public void getPlayerOldVis(int psize, Packet buf) {
		int count = buf.gBit(8);

		if (count < this.playerCount) {
			for (int i = count; i < this.playerCount; i++) {
				this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[i];
			}
		}

		if (count > this.playerCount) {
			signlink.reporterror(this.username + " Too many players");
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
					player.step(false, walkDir);

					int extendedInfo = buf.gBit(1);
					if (extendedInfo == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = index;
					}
				} else if (op == 2) {
					this.playerIds[this.playerCount++] = index;
					player.cycle = loopCycle;

					int walkDir = buf.gBit(3);
					player.step(true, walkDir);

					int runDir = buf.gBit(3);
					player.step(true, runDir);

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

	@ObfuscatedName("client.g(II)V")
	public void createMinimap(int arg0) {
		int[] var3 = this.imageMinimap.pixels;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var23 = (103 - var6) * 512 * 4 + 24628;
			for (int var24 = 1; var24 < 103; var24++) {
				if ((this.levelTileFlags[arg0][var24][var6] & 0x18) == 0) {
					this.scene.method309(var3, var23, 512, arg0, var24, var6);
				}
				if (arg0 < 3 && (this.levelTileFlags[arg0 + 1][var24][var6] & 0x8) != 0) {
					this.scene.method309(var3, var23, 512, arg0 + 1, var24, var6);
				}
				var23 += 4;
			}
		}
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.imageMinimap.bind();
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var22 = 1; var22 < 103; var22++) {
				if ((this.levelTileFlags[arg0][var22][var9] & 0x18) == 0) {
					this.drawMinimapLoc(var9, arg0, var22, var8, var7);
				}
				if (arg0 < 3 && (this.levelTileFlags[arg0 + 1][var22][var9] & 0x8) != 0) {
					this.drawMinimapLoc(var9, arg0 + 1, var22, var8, var7);
				}
			}
		}
		if (this.areaViewport != null) {
			this.areaViewport.bind();
			Pix3D.lineOffset = this.areaViewportOffset;
		}
		field378++;
		if (field378 > 177) {
			field378 = 0;
			// ANTICHEAT_CYCLELOGIC4
			this.out.p1isaac(173);
			this.out.p3(2657152);
		}
		this.activeMapFunctionCount = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = this.scene.method303(this.currentLevel, var10, var11);
				if (var12 != 0) {
					int var13 = var12 >> 14 & 0x7FFF;
					int var14 = LocType.method561(var13).field1660;
					if (var14 >= 0) {
						int var15 = var10;
						int var16 = var11;
						if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
							byte var17 = 104;
							byte var18 = 104;
							int[][] var19 = this.levelCollisionMap[this.currentLevel].field1585;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 0x1280108) == 0) {
									var15--;
								}
								if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 0x1280180) == 0) {
									var15++;
								}
								if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 0x1280102) == 0) {
									var16--;
								}
								if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 0x1280120) == 0) {
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

	@ObfuscatedName("client.a(II[B)Z")
	public boolean saveWave(int arg1, byte[] arg2) {
		return arg2 == null ? true : signlink.wavesave(arg2, arg1);
	}

	@ObfuscatedName("client.j(B)I")
	public int getTopLevel() {
		int var2 = 3;
		if (this.cameraPitch < 310) {
			cyclelogic1++;
			if (cyclelogic1 > 1457) {
				cyclelogic1 = 0;
				// ANTICHEAT_CYCLELOGIC1
				this.out.p1isaac(244);
				this.out.p1(0);
				int var4 = this.out.pos;
				this.out.p1(219);
				this.out.p2(37745);
				this.out.p1(61);
				this.out.p2(43756);
				this.out.p2((int) (Math.random() * 65536.0D));
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.p2(51171);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(15808);
				}
				this.out.p1(97);
				this.out.p1((int) (Math.random() * 256.0D));
				this.out.psize1(this.out.pos - var4);
			}
			int var5 = this.cameraX >> 7;
			int var6 = this.cameraZ >> 7;
			int var7 = localPlayer.field1157 >> 7;
			int var8 = localPlayer.field1158 >> 7;
			if ((this.levelTileFlags[this.currentLevel][var5][var6] & 0x4) != 0) {
				var2 = this.currentLevel;
			}
			int var9;
			if (var7 > var5) {
				var9 = var7 - var5;
			} else {
				var9 = var5 - var7;
			}
			int var10;
			if (var8 > var6) {
				var10 = var8 - var6;
			} else {
				var10 = var6 - var8;
			}
			if (var9 > var10) {
				int var11 = var10 * 65536 / var9;
				int var12 = 32768;
				while (var5 != var7) {
					if (var5 < var7) {
						var5++;
					} else if (var5 > var7) {
						var5--;
					}
					if ((this.levelTileFlags[this.currentLevel][var5][var6] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var6 < var8) {
							var6++;
						} else if (var6 > var8) {
							var6--;
						}
						if ((this.levelTileFlags[this.currentLevel][var5][var6] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			} else {
				int var13 = var9 * 65536 / var10;
				int var14 = 32768;
				while (var6 != var8) {
					if (var6 < var8) {
						var6++;
					} else if (var6 > var8) {
						var6--;
					}
					if ((this.levelTileFlags[this.currentLevel][var5][var6] & 0x4) != 0) {
						var2 = this.currentLevel;
					}
					var14 += var13;
					if (var14 >= 65536) {
						var14 -= 65536;
						if (var5 < var7) {
							var5++;
						} else if (var5 > var7) {
							var5--;
						}
						if ((this.levelTileFlags[this.currentLevel][var5][var6] & 0x4) != 0) {
							var2 = this.currentLevel;
						}
					}
				}
			}
		}
		if ((this.levelTileFlags[this.currentLevel][localPlayer.field1157 >> 7][localPlayer.field1158 >> 7] & 0x4) != 0) {
			var2 = this.currentLevel;
		}
		return var2;
	}

	@ObfuscatedName("client.E(I)I")
	public int getTopLevelCutscene() {
		int var2 = this.getHeightmapY(this.cameraZ, this.cameraX, this.currentLevel);
		return var2 - this.cameraY >= 800 || (this.levelTileFlags[this.currentLevel][this.cameraX >> 7][this.cameraZ >> 7] & 0x4) == 0 ? 3 : this.currentLevel;
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

	@ObfuscatedName("client.b(IZ)V")
	public void pushNpcs(boolean arg1) {
		if (localPlayer.field1157 >> 7 == this.flagSceneTileX && localPlayer.field1158 >> 7 == this.flagSceneTileZ) {
			this.flagSceneTileX = 0;
		}
		int var3 = this.playerCount;
		if (arg1) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			ClientPlayer var5;
			int var6;
			if (arg1) {
				var5 = localPlayer;
				var6 = this.LOCAL_PLAYER_INDEX << 14;
			} else {
				var5 = this.players[this.playerIds[var4]];
				var6 = this.playerIds[var4] << 14;
			}
			if (var5 != null && var5.method351()) {
				var5.field1685 = false;
				if ((lowMem && this.playerCount > 50 || this.playerCount > 200) && !arg1 && var5.field1181 == var5.field1135) {
					var5.field1685 = true;
				}
				int var7 = var5.field1157 >> 7;
				int var8 = var5.field1158 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field1668 == null || loopCycle < var5.field1686 || loopCycle >= var5.field1687) {
						if ((var5.field1157 & 0x7F) == 64 && (var5.field1158 & 0x7F) == 64) {
							if (this.tileLastOccupiedCycle[var7][var8] == this.sceneCycle) {
								continue;
							}
							this.tileLastOccupiedCycle[var7][var8] = this.sceneCycle;
						}
						var5.field1672 = this.getHeightmapY(var5.field1158, var5.field1157, this.currentLevel);
						this.scene.method285(var6, var5, var5.field1157, var5.field1672, var5.field1139, 0, this.currentLevel, 60, var5.field1158, var5.field1159);
					} else {
						var5.field1685 = false;
						var5.field1672 = this.getHeightmapY(var5.field1158, var5.field1157, this.currentLevel);
						this.scene.method286(var5.field1672, var5.field1691, 60, var5, var5.field1690, var5.field1158, var5.field1693, var5.field1157, var5.field1159, var5.field1692, this.currentLevel, var6);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)V")
	public void useMenuOption(int arg0) {
		if (arg0 < 0) {
			return;
		}
		int var3 = this.menuParamB[arg0];
		int var4 = this.menuParamC[arg0];
		int var5 = this.menuAction[arg0];
		int var6 = this.menuParamA[arg0];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (this.chatbackInputOpen != 0 && var5 != 1016) {
			this.chatbackInputOpen = 0;
			this.redrawChatback = true;
		}
		if (var5 == 200) {
			ClientPlayer var7 = this.players[var6];
			if (var7 != null) {
				this.tryMove(false, false, var7.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var7.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYER1
				this.out.p1isaac(245);
				this.out.p2_alt3(var6);
			}
		}
		if (var5 == 227) {
			oplogic2++;
			if (oplogic2 >= 62) {
				// ANTICHEAT_OPLOGIC2
				this.out.p1isaac(165);
				this.out.p1(206);
				oplogic2 = 0;
			}
			// OPHELD4
			this.out.p1isaac(228);
			this.out.p2_alt1(var3);
			this.out.p2_alt2(var6);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 876) {
			ClientPlayer var8 = this.players[var6];
			if (var8 != null) {
				this.tryMove(false, false, var8.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var8.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYER5
				this.out.p1isaac(45);
				this.out.p2_alt2(var6);
			}
		}
		if (var5 == 921) {
			ClientNpc var9 = this.npcs[var6];
			if (var9 != null) {
				this.tryMove(false, false, var9.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var9.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPC2
				this.out.p1isaac(67);
				this.out.p2_alt2(var6);
			}
		}
		if (var5 == 961) {
			oplogic5 += var6;
			if (oplogic5 >= 115) {
				// ANTICHEAT_OPLOGIC5
				this.out.p1isaac(126);
				this.out.p1(125);
				oplogic5 = 0;
			}
			// OPHELD1
			this.out.p1isaac(203);
			this.out.p2_alt2(var4);
			this.out.p2_alt1(var3);
			this.out.p2_alt1(var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 467 && this.interactWithLoc(var4, var3, var6)) {
			// OPLOCU
			this.out.p1isaac(152);
			this.out.p2_alt1(var6 >> 14 & 0x7FFF);
			this.out.p2_alt1(this.objSelectedInterface);
			this.out.p2_alt1(this.objInterface);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
			this.out.p2(this.objSelectedSlot);
			this.out.p2_alt3(this.sceneBaseTileX + var3);
		}
		if (var5 == 9) {
			// INV_BUTTON1
			this.out.p1isaac(3);
			this.out.p2_alt2(var6);
			this.out.p2(var4);
			this.out.p2(var3);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 553) {
			ClientNpc var10 = this.npcs[var6];
			if (var10 != null) {
				this.tryMove(false, false, var10.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var10.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPC4
				this.out.p1isaac(42);
				this.out.p2_alt1(var6);
			}
		}
		if (var5 == 677) {
			ClientPlayer var11 = this.players[var6];
			if (var11 != null) {
				this.tryMove(false, false, var11.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var11.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYER4
				this.out.p1isaac(116);
				this.out.p2_alt1(var6);
			}
		}
		if (var5 == 762 || var5 == 574 || var5 == 775 || var5 == 859) {
			String var12 = this.menuOption[arg0];
			int var13 = var12.indexOf("@whi@");
			if (var13 != -1) {
				long var14 = JString.toBase37(var12.substring(var13 + 5).trim());
				if (var5 == 762) {
					this.addFriend(var14);
				}
				if (var5 == 574) {
					this.addIgnore(var14);
				}
				if (var5 == 775) {
					this.removeFriend(var14);
				}
				if (var5 == 859) {
					this.removeIgnore(var14);
				}
			}
		}
		if (var5 == 930) {
			boolean var16 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var16) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJ4
			this.out.p1isaac(54);
			this.out.p2_alt2(var6);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
			this.out.p2(this.sceneBaseTileX + var3);
		}
		if (var5 == 399) {
			// OPHELD2
			this.out.p1isaac(24);
			this.out.p2_alt1(var4);
			this.out.p2_alt1(var6);
			this.out.p2_alt2(var3);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 347) {
			ClientNpc var18 = this.npcs[var6];
			if (var18 != null) {
				this.tryMove(false, false, var18.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var18.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPCU
				this.out.p1isaac(57);
				this.out.p2(var6);
				this.out.p2_alt1(this.objInterface);
				this.out.p2_alt3(this.objSelectedInterface);
				this.out.p2(this.objSelectedSlot);
			}
		}
		if (var5 == 890) {
			// IF_BUTTON
			this.out.p1isaac(79);
			this.out.p2(var4);
			Component var19 = Component.get(var4);
			if (var19.scripts != null && var19.scripts[0][0] == 5) {
				int var20 = var19.scripts[0][1];
				this.varps[var20] = 1 - this.varps[var20];
				this.updateVarp(var20);
				this.redrawSidebar = true;
			}
		}
		if (var5 == 493) {
			ClientPlayer var21 = this.players[var6];
			if (var21 != null) {
				this.tryMove(false, false, var21.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var21.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYER2
				this.out.p1isaac(233);
				this.out.p2_alt2(var6);
			}
		}
		if (var5 == 14) {
			if (this.menuVisible) {
				this.scene.method312(var3 - 4, var4 - 4);
			} else {
				this.scene.method312(super.mouseClickX - 4, super.mouseClickY - 4);
			}
		}
		if (var5 == 903) {
			// OPHELDU
			this.out.p1isaac(1);
			this.out.p2(var6);
			this.out.p2_alt1(this.objSelectedSlot);
			this.out.p2_alt1(this.objInterface);
			this.out.p2_alt3(this.objSelectedInterface);
			this.out.p2_alt2(var3);
			this.out.p2_alt2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 361) {
			// OPHELDT
			this.out.p1isaac(36);
			this.out.p2(this.activeSpellId);
			this.out.p2_alt2(var4);
			this.out.p2_alt2(var3);
			this.out.p2_alt2(var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 118) {
			ClientNpc var22 = this.npcs[var6];
			if (var22 != null) {
				this.tryMove(false, false, var22.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var22.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				oplogic3 += var6;
				if (oplogic3 >= 143) {
					// ANTICHEAT_OPLOGIC3
					this.out.p1isaac(157);
					this.out.p4(0);
					oplogic3 = 0;
				}
				// OPNPC3
				this.out.p1isaac(13);
				this.out.p2_alt3(var6);
			}
		}
		if (var5 == 376 && this.interactWithLoc(var4, var3, var6)) {
			// OPLOCT
			this.out.p1isaac(210);
			this.out.p2(this.activeSpellId);
			this.out.p2_alt1(var6 >> 14 & 0x7FFF);
			this.out.p2_alt2(this.sceneBaseTileX + var3);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
		}
		if (var5 == 432) {
			ClientNpc var23 = this.npcs[var6];
			if (var23 != null) {
				this.tryMove(false, false, var23.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var23.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPC5
				this.out.p1isaac(8);
				this.out.p2_alt1(var6);
			}
		}
		if (var5 == 639) {
			this.closeInterfaces();
		}
		if (var5 == 918) {
			ClientPlayer var24 = this.players[var6];
			if (var24 != null) {
				this.tryMove(false, false, var24.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var24.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYERT
				this.out.p1isaac(31);
				this.out.p2(var6);
				this.out.p2_alt1(this.activeSpellId);
			}
		}
		if (var5 == 67) {
			ClientNpc var25 = this.npcs[var6];
			if (var25 != null) {
				this.tryMove(false, false, var25.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var25.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPCT
				this.out.p1isaac(104);
				this.out.p2_alt2(this.activeSpellId);
				this.out.p2_alt1(var6);
			}
		}
		if (var5 == 68) {
			boolean var26 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var26) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJ1
			this.out.p1isaac(77);
			this.out.p2_alt2(this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2_alt3(var6);
		}
		if (var5 == 684) {
			boolean var28 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var28) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			if ((var6 & 0x3) == 0) {
				oplogic4++;
			}
			if (oplogic4 >= 84) {
				// ANTICHEAT_OPLOGIC4
				this.out.p1isaac(222);
				this.out.p3(11257922);
				oplogic4 = 0;
			}
			// OPOBJ3
			this.out.p1isaac(71);
			this.out.p2_alt3(var6);
			this.out.p2_alt3(this.sceneBaseTileX + var3);
			this.out.p2_alt2(this.sceneBaseTileZ + var4);
		}
		if (var5 == 544 || var5 == 695) {
			String var30 = this.menuOption[arg0];
			int var31 = var30.indexOf("@whi@");
			if (var31 != -1) {
				String var32 = var30.substring(var31 + 5).trim();
				String var33 = JString.formatDisplayName(JString.fromBase37(JString.toBase37(var32)));
				boolean var34 = false;
				for (int var35 = 0; var35 < this.playerCount; var35++) {
					ClientPlayer var36 = this.players[this.playerIds[var35]];
					if (var36 != null && var36.name != null && var36.name.equalsIgnoreCase(var33)) {
						this.tryMove(false, false, var36.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var36.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
						if (var5 == 544) {
							// OPPLAYER4
							this.out.p1isaac(116);
							this.out.p2_alt1(this.playerIds[var35]);
						}
						if (var5 == 695) {
							// OPPLAYER1
							this.out.p1isaac(245);
							this.out.p2_alt3(this.playerIds[var35]);
						}
						var34 = true;
						break;
					}
				}
				if (!var34) {
					this.addMessage("", "Unable to find " + var33, 0);
				}
			}
		}
		if (var5 == 225) {
			// INV_BUTTON2
			this.out.p1isaac(177);
			this.out.p2_alt2(var3);
			this.out.p2_alt1(var6);
			this.out.p2_alt1(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 70) {
			Component var37 = Component.get(var4);
			this.spellSelected = 1;
			this.activeSpellId = var4;
			this.activeSpellFlags = var37.targetMask;
			this.objSelected = 0;
			this.redrawSidebar = true;
			String var38 = var37.targetVerb;
			if (var38.indexOf(" ") != -1) {
				var38 = var38.substring(0, var38.indexOf(" "));
			}
			String var39 = var37.targetVerb;
			if (var39.indexOf(" ") != -1) {
				var39 = var39.substring(var39.indexOf(" ") + 1);
			}
			this.spellCaption = var38 + " " + var37.targetText + " " + var39;
			if (this.activeSpellFlags == 16) {
				this.redrawSidebar = true;
				this.selectedTab = 3;
				this.redrawSideicons = true;
			}
			return;
		}
		if (var5 == 891) {
			// OPHELD5
			this.out.p1isaac(4);
			this.out.p2_alt1(var3);
			this.out.p2_alt3(var6);
			this.out.p2_alt3(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 894) {
			// INV_BUTTON5
			this.out.p1isaac(158);
			this.out.p2_alt3(var3);
			this.out.p2_alt3(var6);
			this.out.p2_alt1(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 1280) {
			this.interactWithLoc(var4, var3, var6);
			// OPLOC5
			this.out.p1isaac(55);
			this.out.p2_alt1(var6 >> 14 & 0x7FFF);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
			this.out.p2(this.sceneBaseTileX + var3);
		}
		if (var5 == 35) {
			this.interactWithLoc(var4, var3, var6);
			// OPLOC1
			this.out.p1isaac(181);
			this.out.p2_alt2(this.sceneBaseTileX + var3);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
			this.out.p2_alt1(var6 >> 14 & 0x7FFF);
		}
		if (var5 == 888) {
			this.interactWithLoc(var4, var3, var6);
			// OPLOC3
			this.out.p1isaac(50);
			this.out.p2_alt2(this.sceneBaseTileZ + var4);
			this.out.p2_alt1(var6 >> 14 & 0x7FFF);
			this.out.p2_alt3(this.sceneBaseTileX + var3);
		}
		if (var5 == 324) {
			// OPHELD3
			this.out.p1isaac(161);
			this.out.p2_alt3(var3);
			this.out.p2_alt3(var6);
			this.out.p2_alt1(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 1094) {
			ObjType var40 = ObjType.get(var6);
			Component var41 = Component.get(var4);
			String var42;
			if (var41 != null && var41.invSlotObjCount[var3] >= 100000) {
				var42 = var41.invSlotObjCount[var3] + " x " + var40.field811;
			} else if (var40.field810 == null) {
				var42 = "It's a " + var40.field811 + ".";
			} else {
				var42 = new String(var40.field810);
			}
			this.addMessage("", var42, 0);
		}
		if (var5 == 352) {
			Component var43 = Component.get(var4);
			boolean var44 = true;
			if (var43.clientCode > 0) {
				var44 = this.handleInterfaceAction(var43);
			}
			if (var44) {
				// IF_BUTTON
				this.out.p1isaac(79);
				this.out.p2(var4);
			}
		}
		if (var5 == 1412) {
			int var45 = var6 >> 14 & 0x7FFF;
			LocType var46 = LocType.method561(var45);
			String var47;
			if (var46.field1637 == null) {
				var47 = "It's a " + var46.field1630 + ".";
			} else {
				var47 = new String(var46.field1637);
			}
			this.addMessage("", var47, 0);
		}
		if (var5 == 575 && !this.pressedContinueOption) {
			// RESUME_PAUSEBUTTON
			this.out.p1isaac(226);
			this.out.p2(var4);
			this.pressedContinueOption = true;
		}
		if (var5 == 892) {
			this.interactWithLoc(var4, var3, var6);
			// OPLOC4
			this.out.p1isaac(136);
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2_alt1(this.sceneBaseTileZ + var4);
			this.out.p2(var6 >> 14 & 0x7FFF);
		}
		if (var5 == 270) {
			boolean var48 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var48) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJ5
			this.out.p1isaac(230);
			this.out.p2_alt1(var6);
			this.out.p2_alt2(this.sceneBaseTileX + var3);
			this.out.p2(this.sceneBaseTileZ + var4);
		}
		if (var5 == 596) {
			ClientPlayer var50 = this.players[var6];
			if (var50 != null) {
				this.tryMove(false, false, var50.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var50.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYERU
				this.out.p1isaac(143);
				this.out.p2_alt1(this.objInterface);
				this.out.p2_alt3(this.objSelectedSlot);
				this.out.p2(this.objSelectedInterface);
				this.out.p2_alt2(var6);
			}
		}
		if (var5 == 100) {
			boolean var51 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var51) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJU
			this.out.p1isaac(211);
			this.out.p2_alt3(this.objSelectedSlot);
			this.out.p2_alt2(this.objInterface);
			this.out.p2_alt3(this.sceneBaseTileZ + var4);
			this.out.p2_alt3(this.sceneBaseTileX + var3);
			this.out.p2_alt1(this.objSelectedInterface);
			this.out.p2_alt1(var6);
		}
		if (var5 == 1668) {
			ClientNpc var53 = this.npcs[var6];
			if (var53 != null) {
				NpcType var54 = var53.field1370;
				if (var54.field1425 != null) {
					var54 = var54.method476();
				}
				if (var54 != null) {
					String var55;
					if (var54.field1463 == null) {
						var55 = "It's a " + var54.field1455 + ".";
					} else {
						var55 = new String(var54.field1463);
					}
					this.addMessage("", var55, 0);
				}
			}
		}
		if (var5 == 26) {
			boolean var56 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var56) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			oplogic1++;
			if (oplogic1 >= 120) {
				// ANTICHEAT_OPLOGIC1
				this.out.p1isaac(95);
				this.out.p4(0);
				oplogic1 = 0;
			}
			// OPOBJ2
			this.out.p1isaac(100);
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2_alt2(this.sceneBaseTileZ + var4);
			this.out.p2_alt3(var6);
		}
		if (var5 == 444) {
			// INV_BUTTON3
			this.out.p1isaac(91);
			this.out.p2_alt1(var6);
			this.out.p2_alt3(var3);
			this.out.p2(var4);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 507) {
			String var58 = this.menuOption[arg0];
			int var59 = var58.indexOf("@whi@");
			if (var59 != -1) {
				if (this.viewportInterfaceId == -1) {
					this.closeInterfaces();
					this.reportAbuseInput = var58.substring(var59 + 5).trim();
					this.reportAbuseMuteOption = false;
					this.reportAbuseInterfaceId = this.viewportInterfaceId = Component.field728;
				} else {
					this.addMessage("", "Please close the interface you have open before using 'report abuse'", 0);
				}
			}
		}
		if (var5 == 389) {
			this.interactWithLoc(var4, var3, var6);
			// OPLOC2
			this.out.p1isaac(241);
			this.out.p2(var6 >> 14 & 0x7FFF);
			this.out.p2(this.sceneBaseTileX + var3);
			this.out.p2_alt2(this.sceneBaseTileZ + var4);
		}
		if (var5 == 564) {
			// INV_BUTTON4
			this.out.p1isaac(231);
			this.out.p2_alt3(var4);
			this.out.p2_alt1(var3);
			this.out.p2(var6);
			this.selectedCycle = 0;
			this.selectedInterface = var4;
			this.selectedItem = var3;
			this.selectedArea = 2;
			if (Component.get(var4).layer == this.viewportInterfaceId) {
				this.selectedArea = 1;
			}
			if (Component.get(var4).layer == this.chatInterfaceId) {
				this.selectedArea = 3;
			}
		}
		if (var5 == 984) {
			String var60 = this.menuOption[arg0];
			int var61 = var60.indexOf("@whi@");
			if (var61 != -1) {
				long var62 = JString.toBase37(var60.substring(var61 + 5).trim());
				int var64 = -1;
				for (int var65 = 0; var65 < this.friendCount; var65++) {
					if (this.friendName37[var65] == var62) {
						var64 = var65;
						break;
					}
				}
				if (var64 != -1 && this.friendWorld[var64] > 0) {
					this.redrawChatback = true;
					this.chatbackInputOpen = 0;
					this.showSocialInput = true;
					this.socialInput = "";
					this.socialInputType = 3;
					this.socialName37 = this.friendName37[var64];
					this.socialMessage = "Enter message to send to " + this.friendName[var64];
				}
			}
		}
		if (var5 == 518) {
			// IF_BUTTON
			this.out.p1isaac(79);
			this.out.p2(var4);
			Component var66 = Component.get(var4);
			if (var66.scripts != null && var66.scripts[0][0] == 5) {
				int var67 = var66.scripts[0][1];
				if (this.varps[var67] != var66.scriptOperand[0]) {
					this.varps[var67] = var66.scriptOperand[0];
					this.updateVarp(var67);
					this.redrawSidebar = true;
				}
			}
		}
		if (var5 == 318) {
			ClientNpc var68 = this.npcs[var6];
			if (var68 != null) {
				this.tryMove(false, false, var68.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var68.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPNPC1
				this.out.p1isaac(112);
				this.out.p2_alt1(var6);
			}
		}
		if (var5 == 199) {
			boolean var69 = this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 0, 0, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			if (!var69) {
				this.tryMove(false, false, var4, localPlayer.routeTileZ[0], 1, 1, 2, 0, var3, 0, 0, localPlayer.routeTileX[0]);
			}
			this.crossX = super.mouseClickX;
			this.crossY = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			// OPOBJT
			this.out.p1isaac(83);
			this.out.p2_alt1(var6);
			this.out.p2(this.sceneBaseTileZ + var4);
			this.out.p2_alt1(this.activeSpellId);
			this.out.p2_alt3(this.sceneBaseTileX + var3);
		}
		if (var5 == 55) {
			this.unloadCom(this.stickyChatInterfaceId);
			this.stickyChatInterfaceId = -1;
			this.redrawChatback = true;
		}
		if (var5 == 52) {
			this.objSelected = 1;
			this.objSelectedSlot = var3;
			this.objSelectedInterface = var4;
			this.objInterface = var6;
			this.objSelectedName = String.valueOf(ObjType.get(var6).field811);
			this.spellSelected = 0;
			this.redrawSidebar = true;
			return;
		}
		if (var5 == 1564) {
			ObjType var71 = ObjType.get(var6);
			String var72;
			if (var71.field810 == null) {
				var72 = "It's a " + var71.field811 + ".";
			} else {
				var72 = new String(var71.field810);
			}
			this.addMessage("", var72, 0);
		}
		if (var5 == 408) {
			ClientPlayer var73 = this.players[var6];
			if (var73 != null) {
				this.tryMove(false, false, var73.routeTileZ[0], localPlayer.routeTileZ[0], 1, 1, 2, 0, var73.routeTileX[0], 0, 0, localPlayer.routeTileX[0]);
				this.crossX = super.mouseClickX;
				this.crossY = super.mouseClickY;
				this.crossMode = 2;
				this.crossCycle = 0;
				// OPPLAYER3
				this.out.p1isaac(194);
				this.out.p2_alt1(var6);
			}
		}
		this.objSelected = 0;
		this.spellSelected = 0;
		this.redrawSidebar = true;
	}

	@ObfuscatedName("client.m(Z)V")
	public void draw2DEntityElements() {
		this.chatCount = 0;
		for (int var2 = -1; var2 < this.npcCount + this.playerCount; var2++) {
			ClientEntity var19;
			if (var2 == -1) {
				var19 = localPlayer;
			} else if (var2 < this.playerCount) {
				var19 = this.players[this.playerIds[var2]];
			} else {
				var19 = this.npcs[this.npcIds[var2 - this.playerCount]];
			}
			if (var19 != null && var19.method351()) {
				if (var19 instanceof ClientNpc) {
					NpcType var20 = ((ClientNpc) var19).field1370;
					if (var20.field1425 != null) {
						var20 = var20.method476();
					}
					if (var20 == null) {
						continue;
					}
				}
				if (var2 >= this.playerCount) {
					NpcType var23 = ((ClientNpc) var19).field1370;
					if (var23.field1441 >= 0 && var23.field1441 < this.imageHeadiconsPrayer.length) {
						this.projectFromEntity(var19, var19.field1141 + 15);
						if (this.projectX > -1) {
							this.imageHeadiconsPrayer[var23.field1441].plotSprite(this.projectY - 30, this.projectX - 12);
						}
					}
					if (this.hintType == 1 && this.npcIds[var2 - this.playerCount] == this.hintNpc && loopCycle % 20 < 10) {
						this.projectFromEntity(var19, var19.field1141 + 15);
						if (this.projectX > -1) {
							this.imageHeadiconsHint[0].plotSprite(this.projectY - 28, this.projectX - 12);
						}
					}
				} else {
					int var21 = 30;
					ClientPlayer var22 = (ClientPlayer) var19;
					if (var22.field1678 != -1 || var22.field1670 != -1) {
						this.projectFromEntity(var19, var19.field1141 + 15);
						if (this.projectX > -1) {
							if (var22.field1678 != -1) {
								this.imageHeadiconsPk[var22.field1678].plotSprite(this.projectY - var21, this.projectX - 12);
								var21 += 25;
							}
							if (var22.field1670 != -1) {
								this.imageHeadiconsPrayer[var22.field1670].plotSprite(this.projectY - var21, this.projectX - 12);
								var21 += 25;
							}
						}
					}
					if (var2 >= 0 && this.hintType == 10 && this.playerIds[var2] == this.hintPlayer) {
						this.projectFromEntity(var19, var19.field1141 + 15);
						if (this.projectX > -1) {
							this.imageHeadiconsHint[1].plotSprite(this.projectY - var21, this.projectX - 12);
						}
					}
				}
				if (var19.chatMessage != null && (var2 >= this.playerCount || this.chatPublicMode == 0 || this.chatPublicMode == 3 || this.chatPublicMode == 1 && this.isFriend(((ClientPlayer) var19).name))) {
					this.projectFromEntity(var19, var19.field1141);
					if (this.projectX > -1 && this.chatCount < this.MAX_CHATS) {
						this.chatWidth[this.chatCount] = this.fontBold12.stringWid(var19.chatMessage) / 2;
						this.chatHeight[this.chatCount] = this.fontBold12.height;
						this.chatX[this.chatCount] = this.projectX;
						this.chatY[this.chatCount] = this.projectY;
						this.chatColour[this.chatCount] = var19.chatColour;
						this.chatEffect[this.chatCount] = var19.chatEffect;
						this.chatTimer[this.chatCount] = var19.chatTimer;
						this.chatMessage[this.chatCount++] = var19.chatMessage;
						if (this.chatEffects == 0 && var19.chatEffect >= 1 && var19.chatEffect <= 3) {
							this.chatHeight[this.chatCount] += 10;
							this.chatY[this.chatCount] += 5;
						}
						if (this.chatEffects == 0 && var19.chatEffect == 4) {
							this.chatWidth[this.chatCount] = 60;
						}
						if (this.chatEffects == 0 && var19.chatEffect == 5) {
							this.chatHeight[this.chatCount] += 5;
						}
					}
				}
				if (var19.field1142 > loopCycle) {
					this.projectFromEntity(var19, var19.field1141 + 15);
					if (this.projectX > -1) {
						int var24 = var19.field1143 * 30 / var19.field1144;
						if (var24 > 30) {
							var24 = 30;
						}
						Pix2D.fillRect(5, this.projectY - 3, 65280, var24, this.projectX - 15);
						Pix2D.fillRect(5, this.projectY - 3, 16711680, 30 - var24, this.projectX - 15 + var24);
					}
				}
				for (int var25 = 0; var25 < 4; var25++) {
					if (var19.field1179[var25] > loopCycle) {
						this.projectFromEntity(var19, var19.field1141 / 2);
						if (this.projectX > -1) {
							if (var25 == 1) {
								this.projectY -= 20;
							}
							if (var25 == 2) {
								this.projectX -= 15;
								this.projectY -= 10;
							}
							if (var25 == 3) {
								this.projectX += 15;
								this.projectY -= 10;
							}
							this.imageHitmarks[var19.field1178[var25]].plotSprite(this.projectY - 12, this.projectX - 12);
							this.fontPlain11.centreString(this.projectX, this.projectY + 4, 0, String.valueOf(var19.field1177[var25]));
							this.fontPlain11.centreString(this.projectX - 1, this.projectY + 3, 16777215, String.valueOf(var19.field1177[var25]));
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
				for (int var18 = 0; var18 < var3; var18++) {
					if (var5 + 2 > this.chatY[var18] - this.chatHeight[var18] && var5 - var7 < this.chatY[var18] + 2 && var4 - var6 < this.chatWidth[var18] + this.chatX[var18] && var4 + var6 > this.chatX[var18] - this.chatWidth[var18] && this.chatY[var18] - this.chatHeight[var18] < var5) {
						var5 = this.chatY[var18] - this.chatHeight[var18];
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
					this.fontBold12.centreString(this.projectX, this.projectY + 1, 0, var9);
					this.fontBold12.centreString(this.projectX, this.projectY, var10, var9);
				}
				if (this.chatEffect[var3] == 1) {
					this.fontBold12.centreStringWave(this.projectY + 1, this.sceneCycle, var9, this.projectX, 0);
					this.fontBold12.centreStringWave(this.projectY, this.sceneCycle, var9, this.projectX, var10);
				}
				if (this.chatEffect[var3] == 2) {
					this.fontBold12.centreStringWave2(this.projectY + 1, 0, var9, this.projectX, this.sceneCycle);
					this.fontBold12.centreStringWave2(this.projectY, var10, var9, this.projectX, this.sceneCycle);
				}
				if (this.chatEffect[var3] == 3) {
					this.fontBold12.centreStringShake(var9, 0, this.projectX, this.projectY + 1, 150 - this.chatTimer[var3], this.sceneCycle);
					this.fontBold12.centreStringShake(var9, var10, this.projectX, this.projectY, 150 - this.chatTimer[var3], this.sceneCycle);
				}
				if (this.chatEffect[var3] == 4) {
					int var14 = this.fontBold12.stringWid(var9);
					int var15 = (150 - this.chatTimer[var3]) * (var14 + 100) / 150;
					Pix2D.setClipping(0, this.projectX - 50, 334, this.projectX + 50);
					this.fontBold12.drawString(this.projectX + 50 - var15, 0, this.projectY + 1, var9);
					this.fontBold12.drawString(this.projectX + 50 - var15, var10, this.projectY, var9);
					Pix2D.resetClipping();
				}
				if (this.chatEffect[var3] == 5) {
					int var16 = 150 - this.chatTimer[var3];
					int var17 = 0;
					if (var16 < 25) {
						var17 = var16 - 25;
					} else if (var16 > 125) {
						var17 = var16 - 125;
					}
					Pix2D.setClipping(this.projectY - this.fontBold12.height - 1, 0, this.projectY + 5, 512);
					this.fontBold12.centreString(this.projectX, this.projectY + 1 + var17, 0, var9);
					this.fontBold12.centreString(this.projectX, this.projectY + var17, var10, var9);
					Pix2D.resetClipping();
				}
			} else {
				this.fontBold12.centreString(this.projectX, this.projectY + 1, 0, var9);
				this.fontBold12.centreString(this.projectX, this.projectY, 16776960, var9);
			}
		}
	}

	@ObfuscatedName("client.F(I)V")
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
		this.areaBackmid1 = new PixMap(45, this.getBaseComponent(), 249);
		this.redrawFrame = true;
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.G(I)V")
	public void drawError() {
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
		if (this.errorStarted) {
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
	}

	@ObfuscatedName("client.n(Z)V")
	public void logout() {
		try {
			if (this.stream != null) {
				this.stream.method233();
			}
		} catch (Exception var3) {
		}
		this.stream = null;
		this.ingame = false;
		this.titleScreenState = 0;
		this.username = "";
		this.password = "";
		this.clearCache();
		this.scene.method274();
		for (int var2 = 0; var2 < 4; var2++) {
			this.levelCollisionMap[var2].method532();
		}
		System.gc();
		this.stopMidi();
		this.nextMidiSong = -1;
		this.midiSong = -1;
		this.nextMusicDelay = 0;
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;)V")
	public void showPopupMessage(String arg1, String arg2) {
		if (this.areaViewport != null) {
			this.areaViewport.bind();
			Pix3D.lineOffset = this.areaViewportOffset;
			int var4 = 151;
			if (arg1 != null) {
				var4 -= 7;
			}
			this.fontPlain12.centreString(257, var4, 0, arg2);
			this.fontPlain12.centreString(256, var4 - 1, 16777215, arg2);
			var4 += 15;
			if (arg1 != null) {
				this.fontPlain12.centreString(257, var4, 0, arg1);
				this.fontPlain12.centreString(256, var4 - 1, 16777215, arg1);
			}
			this.areaViewport.draw(4, 4, super.graphics);
		} else if (super.drawArea != null) {
			super.drawArea.bind();
			Pix3D.lineOffset = this.areaFullscreenOffset;
			int var5 = 251;
			short var6 = 300;
			byte var7 = 50;
			Pix2D.fillRect(var7, var5 - 5 - var7 / 2, 0, var6, 383 - var6 / 2);
			Pix2D.drawRect(var5 - 5 - var7 / 2, var7, 16777215, 383 - var6 / 2, var6);
			if (arg1 != null) {
				var5 -= 7;
			}
			this.fontPlain12.centreString(383, var5, 0, arg2);
			this.fontPlain12.centreString(382, var5 - 1, 16777215, arg2);
			var5 += 15;
			if (arg1 != null) {
				this.fontPlain12.centreString(383, var5, 0, arg1);
				this.fontPlain12.centreString(382, var5 - 1, 16777215, arg1);
			}
			super.drawArea.draw(0, 0, super.graphics);
		}
	}

	@ObfuscatedName("client.b(IB)Z")
	public boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = this.menuAction[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 762;
	}

	@ObfuscatedName("client.o(Z)V")
	public void drawTileHint() {
		if (this.hintType == 2) {
			this.projectFromGround((this.hintTileX - this.sceneBaseTileX << 7) + this.hintOffsetX, this.hintHeight * 2, (this.hintTileZ - this.sceneBaseTileZ << 7) + this.hintOffsetZ);
			if (this.projectX > -1 && loopCycle % 20 < 10) {
				this.imageHeadiconsHint[0].plotSprite(this.projectY - 28, this.projectX - 12);
			}
		}
	}

	@ObfuscatedName("client.c(I)V")
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

	@ObfuscatedName("client.p(Z)V")
	public void drawMenu() {
		int var2 = this.menuX;
		int var3 = this.menuY;
		int var4 = this.menuWidth;
		int var5 = this.menuHeight;
		int var6 = 6116423;
		Pix2D.fillRect(var5, var3, var6, var4, var2);
		Pix2D.fillRect(16, var3 + 1, 0, var4 - 2, var2 + 1);
		Pix2D.drawRect(var3 + 18, var5 - 19, 0, var2 + 1, var4 - 2);
		this.fontBold12.drawString(var2 + 3, var6, var3 + 14, "Choose Option");
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
			this.fontBold12.drawStringTag(var11, var2 + 3, var10, true, this.menuOption[var9]);
		}
	}

	@ObfuscatedName("client.a(IILEWIXBTLV;)I")
	public int executeClientScript(int arg1, Component arg2) {
		if (arg2.scripts == null || arg1 >= arg2.scripts.length) {
			return -2;
		} else {
			try {
				int[] var4 = arg2.scripts[arg1];
				int var5 = 0;
				int var6 = 0;
				byte var7 = 0;
				while (true) {
					int var8 = var4[var6++];
					int var9 = 0;
					byte var10 = 0;
					if (var8 == 0) {
						return var5;
					}
					if (var8 == 1) {
						var9 = this.skillLevel[var4[var6++]];
					}
					if (var8 == 2) {
						var9 = this.skillBaseLevel[var4[var6++]];
					}
					if (var8 == 3) {
						var9 = this.skillExperience[var4[var6++]];
					}
					if (var8 == 4) {
						Component var11 = Component.get(var4[var6++]);
						int var12 = var4[var6++];
						if (var12 >= 0 && var12 < ObjType.field817 && (!ObjType.get(var12).field859 || membersWorld)) {
							for (int var13 = 0; var13 < var11.invSlotObjId.length; var13++) {
								if (var12 + 1 == var11.invSlotObjId[var13]) {
									var9 += var11.invSlotObjCount[var13];
								}
							}
						}
					}
					if (var8 == 5) {
						var9 = this.varps[var4[var6++]];
					}
					if (var8 == 6) {
						var9 = field248[this.skillBaseLevel[var4[var6++]] - 1];
					}
					if (var8 == 7) {
						var9 = this.varps[var4[var6++]] * 100 / 46875;
					}
					if (var8 == 8) {
						var9 = localPlayer.field1675;
					}
					if (var8 == 9) {
						for (int var14 = 0; var14 < Stats.field1503; var14++) {
							if (Stats.field1505[var14]) {
								var9 += this.skillBaseLevel[var14];
							}
						}
					}
					if (var8 == 10) {
						Component var15 = Component.get(var4[var6++]);
						int var16 = var4[var6++] + 1;
						if (var16 >= 0 && var16 < ObjType.field817 && (!ObjType.get(var16).field859 || membersWorld)) {
							for (int var17 = 0; var17 < var15.invSlotObjId.length; var17++) {
								if (var15.invSlotObjId[var17] == var16) {
									var9 = 999999999;
									break;
								}
							}
						}
					}
					if (var8 == 11) {
						var9 = this.runenergy;
					}
					if (var8 == 12) {
						var9 = this.runweight;
					}
					if (var8 == 13) {
						int var18 = this.varps[var4[var6++]];
						int var19 = var4[var6++];
						var9 = (var18 & 0x1 << var19) == 0 ? 0 : 1;
					}
					if (var8 == 14) {
						int var20 = var4[var6++];
						VarbitType var21 = VarbitType.field1760[var20];
						int var22 = var21.field1762;
						int var23 = var21.field1763;
						int var24 = var21.field1764;
						int var25 = field510[var24 - var23];
						var9 = this.varps[var22] >> var23 & var25;
					}
					if (var8 == 15) {
						var10 = 1;
					}
					if (var8 == 16) {
						var10 = 2;
					}
					if (var8 == 17) {
						var10 = 3;
					}
					if (var8 == 18) {
						var9 = (localPlayer.field1157 >> 7) + this.sceneBaseTileX;
					}
					if (var8 == 19) {
						var9 = (localPlayer.field1158 >> 7) + this.sceneBaseTileZ;
					}
					if (var8 == 20) {
						var9 = var4[var6++];
					}
					if (var10 == 0) {
						if (var7 == 0) {
							var5 += var9;
						}
						if (var7 == 1) {
							var5 -= var9;
						}
						if (var7 == 2 && var9 != 0) {
							var5 /= var9;
						}
						if (var7 == 3) {
							var5 *= var9;
						}
						var7 = 0;
					} else {
						var7 = var10;
					}
				}
			} catch (Exception var26) {
				return -1;
			}
		}
	}

	@ObfuscatedName("client.a(IZLEPQDEJTO;I)V")
	public void drawOnMinimap(int arg0, Pix32 arg2, int arg3) {
		if (arg2 == null) {
			return;
		}
		int var5 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var6 = arg0 * arg0 + arg3 * arg3;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.sinTable[var5];
		int var8 = Model.cosTable[var5];
		int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
		int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
		int var11 = arg0 * var9 + arg3 * var10 >> 16;
		int var12 = arg0 * var10 - arg3 * var9 >> 16;
		if (var6 > 2500) {
			arg2.drawMasked(this.imageMapback, 83 - var12 - arg2.ohi / 2 - 4, var11 + 94 - arg2.owi / 2 + 4);
		} else {
			arg2.plotSprite(83 - var12 - arg2.ohi / 2 - 4, var11 + 94 - arg2.owi / 2 + 4);
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public void drawTitle() {
		this.loadTitle();
		this.imageTitle4.bind();
		this.imageTitlebox.plotSprite(0, 0);
		short var3 = 360;
		short var4 = 200;
		if (this.titleScreenState == 0) {
			int var6 = var4 / 2 + 80;
			this.fontPlain11.centreStringTag(true, 7711145, var6, var3 / 2, this.onDemand.field1724);
			int var7 = var4 / 2 - 20;
			this.fontBold12.centreStringTag(true, 16776960, var7, var3 / 2, "Welcome to RuneScape");
			int var18 = var7 + 30;
			int var8 = var3 / 2 - 80;
			int var9 = var4 / 2 + 20;
			this.imageTitlebutton.plotSprite(var9 - 20, var8 - 73);
			this.fontBold12.centreStringTag(true, 16777215, var9 + 5, var8, "New User");
			int var10 = var3 / 2 + 80;
			this.imageTitlebutton.plotSprite(var9 - 20, var10 - 73);
			this.fontBold12.centreStringTag(true, 16777215, var9 + 5, var10, "Existing User");
		}
		if (this.titleScreenState == 2) {
			int var11 = var4 / 2 - 40;
			if (this.loginMessage0.length() > 0) {
				this.fontBold12.centreStringTag(true, 16776960, var11 - 15, var3 / 2, this.loginMessage0);
				this.fontBold12.centreStringTag(true, 16776960, var11, var3 / 2, this.loginMessage1);
				var11 += 30;
			} else {
				this.fontBold12.centreStringTag(true, 16776960, var11 - 7, var3 / 2, this.loginMessage1);
				var11 += 30;
			}
			this.fontBold12.drawStringTag(16777215, var3 / 2 - 90, var11, true, "Username: " + this.username + (this.titleLoginField == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var11 += 15;
			this.fontBold12.drawStringTag(16777215, var3 / 2 - 88, var11, true, "Password: " + JString.censor(this.password) + (this.titleLoginField == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var11 += 15;
			int var12 = var3 / 2 - 80;
			int var13 = var4 / 2 + 50;
			this.imageTitlebutton.plotSprite(var13 - 20, var12 - 73);
			this.fontBold12.centreStringTag(true, 16777215, var13 + 5, var12, "Login");
			int var14 = var3 / 2 + 80;
			this.imageTitlebutton.plotSprite(var13 - 20, var14 - 73);
			this.fontBold12.centreStringTag(true, 16777215, var13 + 5, var14, "Cancel");
		}
		if (this.titleScreenState == 3) {
			this.fontBold12.centreStringTag(true, 16776960, var4 / 2 - 60, var3 / 2, "Create a free account");
			int var15 = var4 / 2 - 35;
			this.fontBold12.centreStringTag(true, 16777215, var15, var3 / 2, "To create a new account you need to");
			int var19 = var15 + 15;
			this.fontBold12.centreStringTag(true, 16777215, var19, var3 / 2, "go back to the main RuneScape webpage");
			int var20 = var19 + 15;
			this.fontBold12.centreStringTag(true, 16777215, var20, var3 / 2, "and choose the 'create account'");
			int var21 = var20 + 15;
			this.fontBold12.centreStringTag(true, 16777215, var21, var3 / 2, "button near the top of that page.");
			int var22 = var21 + 15;
			int var16 = var3 / 2;
			int var17 = var4 / 2 + 50;
			this.imageTitlebutton.plotSprite(var17 - 20, var16 - 73);
			this.fontBold12.centreStringTag(true, 16777215, var17 + 5, var16, "Cancel");
		}
		this.imageTitle4.draw(171, 202, super.graphics);
		if (this.redrawFrame) {
			this.redrawFrame = false;
			this.imageTitle2.draw(0, 128, super.graphics);
			this.imageTitle3.draw(371, 202, super.graphics);
			this.imageTitle5.draw(265, 0, super.graphics);
			this.imageTitle6.draw(265, 562, super.graphics);
			this.imageTitle7.draw(171, 128, super.graphics);
			this.imageTitle8.draw(171, 562, super.graphics);
		}
	}

	@ObfuscatedName("client.a(LMFMVIYHT;IZ)V")
	public void getNpcPosNewVis(Packet arg0, int arg1) {
		while (arg0.bitPos + 21 < arg1 * 8) {
			int var4 = arg0.gBit(14);
			if (var4 == 16383) {
				break;
			}
			if (this.npcs[var4] == null) {
				this.npcs[var4] = new ClientNpc();
			}
			ClientNpc var5 = this.npcs[var4];
			this.npcIds[this.npcCount++] = var4;
			var5.cycle = loopCycle;
			int var6 = arg0.gBit(1);
			if (var6 == 1) {
				this.entityUpdateIds[this.entityUpdateCount++] = var4;
			}
			int var7 = arg0.gBit(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg0.gBit(5);
			if (var8 > 15) {
				var8 -= 32;
			}
			int var9 = arg0.gBit(1);
			var5.field1370 = NpcType.get(arg0.gBit(13));
			var5.field1148 = var5.field1370.field1445;
			var5.field1147 = var5.field1370.field1454;
			var5.field1166 = var5.field1370.field1448;
			var5.field1167 = var5.field1370.field1446;
			var5.field1168 = var5.field1370.field1444;
			var5.field1169 = var5.field1370.field1436;
			var5.field1181 = var5.field1370.field1424;
			var5.move(localPlayer.routeTileZ[0] + var7, var9 == 1, localPlayer.routeTileX[0] + var8);
		}
		arg0.accessBytes();
	}

	@ObfuscatedName("client.b(LMFMVIYHT;II)V")
	public void readZonePacket(Packet arg0, int arg2) {
		if (arg2 == 203) {
			// LOC_MERGE
			int var4 = arg0.g2();
			int var5 = arg0.g1();
			int var6 = var5 >> 2;
			int var7 = var5 & 0x3;
			int var8 = this.LOC_SHAPE_TO_LAYER[var6];
			byte var9 = arg0.g1b_alt2();
			int var10 = arg0.g1_alt1();
			int var11 = (var10 >> 4 & 0x7) + this.baseX;
			int var12 = (var10 & 0x7) + this.baseZ;
			byte var13 = arg0.g1b_alt1();
			int var14 = arg0.g2_alt2();
			int var15 = arg0.g2_alt1();
			byte var16 = arg0.g1b();
			byte var17 = arg0.g1b_alt1();
			int var18 = arg0.g2();
			ClientPlayer var19;
			if (this.localPid == var15) {
				var19 = localPlayer;
			} else {
				var19 = this.players[var15];
			}
			if (var19 != null) {
				LocType var20 = LocType.method561(var4);
				int var21 = this.levelHeightmap[this.currentLevel][var11][var12];
				int var22 = this.levelHeightmap[this.currentLevel][var11 + 1][var12];
				int var23 = this.levelHeightmap[this.currentLevel][var11 + 1][var12 + 1];
				int var24 = this.levelHeightmap[this.currentLevel][var11][var12 + 1];
				Model var25 = var20.method569(var6, var7, var21, var22, var23, var24, -1);
				if (var25 != null) {
					this.appendLoc(this.currentLevel, var11, 0, var14 + 1, 0, -1, var18 + 1, var8, var12);
					var19.field1686 = loopCycle + var18;
					var19.field1687 = loopCycle + var14;
					var19.field1668 = var25;
					int var26 = var20.field1655;
					int var27 = var20.field1629;
					if (var7 == 1 || var7 == 3) {
						var26 = var20.field1629;
						var27 = var20.field1655;
					}
					var19.field1665 = var11 * 128 + var26 * 64;
					var19.field1667 = var12 * 128 + var27 * 64;
					var19.field1666 = this.getHeightmapY(var19.field1667, var19.field1665, this.currentLevel);
					if (var13 > var9) {
						byte var28 = var13;
						var13 = var9;
						var9 = var28;
					}
					if (var17 > var16) {
						byte var29 = var17;
						var17 = var16;
						var16 = var29;
					}
					var19.field1690 = var11 + var13;
					var19.field1692 = var9 + var11;
					var19.field1691 = var12 + var17;
					var19.field1693 = var12 + var16;
				}
			}
		}
		if (arg2 == 106) {
			// OBJ_REVEAL
			int var30 = arg0.g1_alt1();
			int var31 = (var30 >> 4 & 0x7) + this.baseX;
			int var32 = (var30 & 0x7) + this.baseZ;
			int var33 = arg0.g2_alt3();
			int var34 = arg0.g2_alt2();
			int var35 = arg0.g2_alt2();
			if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && this.localPid != var35) {
				ClientObj var36 = new ClientObj();
				var36.field873 = var34;
				var36.field875 = var33;
				if (this.objStacks[this.currentLevel][var31][var32] == null) {
					this.objStacks[this.currentLevel][var31][var32] = new LinkList();
				}
				this.objStacks[this.currentLevel][var31][var32].method3(var36);
				this.sortObjStacks(var31, var32);
			}
		} else if (arg2 == 142) {
			// LOC_ANIM
			int var37 = arg0.g2();
			int var38 = arg0.g1_alt1();
			int var39 = var38 >> 2;
			int var40 = var38 & 0x3;
			int var41 = this.LOC_SHAPE_TO_LAYER[var39];
			int var42 = arg0.g1();
			int var43 = (var42 >> 4 & 0x7) + this.baseX;
			int var44 = (var42 & 0x7) + this.baseZ;
			if (var43 >= 0 && var44 >= 0 && var43 < 103 && var44 < 103) {
				int var45 = this.levelHeightmap[this.currentLevel][var43][var44];
				int var46 = this.levelHeightmap[this.currentLevel][var43 + 1][var44];
				int var47 = this.levelHeightmap[this.currentLevel][var43 + 1][var44 + 1];
				int var48 = this.levelHeightmap[this.currentLevel][var43][var44 + 1];
				if (var41 == 0) {
					Wall var49 = this.scene.method296(this.currentLevel, var43, var44);
					if (var49 != null) {
						int var50 = var49.field1539 >> 14 & 0x7FFF;
						if (var39 == 2) {
							var49.field1537 = new ClientLocAnim(var37, var47, var48, var46, 2, var50, false, var45, var40 + 4);
							var49.field1538 = new ClientLocAnim(var37, var47, var48, var46, 2, var50, false, var45, var40 + 1 & 0x3);
						} else {
							var49.field1537 = new ClientLocAnim(var37, var47, var48, var46, var39, var50, false, var45, var40);
						}
					}
				}
				if (var41 == 1) {
					Decor var51 = this.scene.method297(this.currentLevel, var44, var43);
					if (var51 != null) {
						var51.field1411 = new ClientLocAnim(var37, var47, var48, var46, 4, var51.field1412 >> 14 & 0x7FFF, false, var45, 0);
					}
				}
				if (var41 == 2) {
					Sprite var52 = this.scene.method298(var43, var44, this.currentLevel);
					if (var39 == 11) {
						var39 = 10;
					}
					if (var52 != null) {
						var52.field80 = new ClientLocAnim(var37, var47, var48, var46, var39, var52.field88 >> 14 & 0x7FFF, false, var45, var40);
					}
				}
				if (var41 == 3) {
					GroundDecor var53 = this.scene.method299(this.currentLevel, var44, var43);
					if (var53 != null) {
						var53.field1313 = new ClientLocAnim(var37, var47, var48, var46, 22, var53.field1314 >> 14 & 0x7FFF, false, var45, var40);
					}
				}
			}
		} else if (arg2 == 107) {
			// OBJ_ADD
			int var54 = arg0.g2();
			int var55 = arg0.g1_alt2();
			int var56 = (var55 >> 4 & 0x7) + this.baseX;
			int var57 = (var55 & 0x7) + this.baseZ;
			int var58 = arg0.g2_alt2();
			if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
				ClientObj var59 = new ClientObj();
				var59.field873 = var54;
				var59.field875 = var58;
				if (this.objStacks[this.currentLevel][var56][var57] == null) {
					this.objStacks[this.currentLevel][var56][var57] = new LinkList();
				}
				this.objStacks[this.currentLevel][var56][var57].method3(var59);
				this.sortObjStacks(var56, var57);
			}
		} else if (arg2 == 121) {
			// OBJ_COUNT
			int var60 = arg0.g1();
			int var61 = (var60 >> 4 & 0x7) + this.baseX;
			int var62 = (var60 & 0x7) + this.baseZ;
			int var63 = arg0.g2();
			int var64 = arg0.g2();
			int var65 = arg0.g2();
			if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
				LinkList var66 = this.objStacks[this.currentLevel][var61][var62];
				if (var66 != null) {
					for (ClientObj var67 = (ClientObj) var66.method6(); var67 != null; var67 = (ClientObj) var66.method8()) {
						if ((var63 & 0x7FFF) == var67.field873 && var67.field875 == var64) {
							var67.field875 = var65;
							break;
						}
					}
					this.sortObjStacks(var61, var62);
				}
			}
		} else if (arg2 == 181) {
			// MAP_PROJANIM
			int var68 = arg0.g1();
			int var69 = (var68 >> 4 & 0x7) + this.baseX;
			int var70 = (var68 & 0x7) + this.baseZ;
			int var71 = var69 + arg0.g1b();
			int var72 = var70 + arg0.g1b();
			int var73 = arg0.g2b();
			int var74 = arg0.g2();
			int var75 = arg0.g1() * 4;
			int var76 = arg0.g1() * 4;
			int var77 = arg0.g2();
			int var78 = arg0.g2();
			int var79 = arg0.g1();
			int var80 = arg0.g1();
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
				int var81 = var69 * 128 + 64;
				int var82 = var70 * 128 + 64;
				int var83 = var71 * 128 + 64;
				int var84 = var72 * 128 + 64;
				ClientProj var85 = new ClientProj(this.currentLevel, var76, var80, var82, var74, loopCycle + var78, var79, var73, this.getHeightmapY(var82, var81, this.currentLevel) - var75, var81, loopCycle + var77);
				var85.method271(var83, var84, this.getHeightmapY(var84, var83, this.currentLevel) - var76, loopCycle + var77);
				this.projectiles.method3(var85);
			}
		} else {
			if (arg2 == 41) {
				// SOUND_AREA
				int var86 = arg0.g1();
				int var87 = (var86 >> 4 & 0x7) + this.baseX;
				int var88 = (var86 & 0x7) + this.baseZ;
				int var89 = arg0.g2();
				int var90 = arg0.g1();
				int var91 = var90 >> 4 & 0xF;
				int var92 = var90 & 0x7;
				if (localPlayer.routeTileX[0] >= var87 - var91 && localPlayer.routeTileX[0] <= var87 + var91 && localPlayer.routeTileZ[0] >= var88 - var91 && localPlayer.routeTileZ[0] <= var88 + var91 && this.waveEnabled && !lowMem && this.waveCount < 50) {
					this.waveIds[this.waveCount] = var89;
					this.waveLoops[this.waveCount] = var92;
					this.waveDelay[this.waveCount] = Wave.field1472[var89];
					this.waveCount++;
				}
			}
			if (arg2 == 59) {
				// MAP_ANIM
				int var93 = arg0.g1();
				int var94 = (var93 >> 4 & 0x7) + this.baseX;
				int var95 = (var93 & 0x7) + this.baseZ;
				int var96 = arg0.g2();
				int var97 = arg0.g1();
				int var98 = arg0.g2();
				if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
					int var99 = var94 * 128 + 64;
					int var100 = var95 * 128 + 64;
					MapSpotAnim var101 = new MapSpotAnim(var99, this.currentLevel, this.getHeightmapY(var100, var99, this.currentLevel) - var97, var98, var96, loopCycle, var100, 10709);
					this.spotanims.method3(var101);
				}
			} else if (arg2 == 152) {
				// LOC_ADD_CHANGE
				int var102 = arg0.g1_alt2();
				int var103 = var102 >> 2;
				int var104 = var102 & 0x3;
				int var105 = this.LOC_SHAPE_TO_LAYER[var103];
				int var106 = arg0.g2_alt3();
				int var107 = arg0.g1_alt1();
				int var108 = (var107 >> 4 & 0x7) + this.baseX;
				int var109 = (var107 & 0x7) + this.baseZ;
				if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
					this.appendLoc(this.currentLevel, var108, var104, -1, var103, var106, 0, var105, var109);
				}
			} else if (arg2 == 208) {
				// OBJ_DEL
				int var110 = arg0.g2_alt2();
				int var111 = arg0.g1_alt1();
				int var112 = (var111 >> 4 & 0x7) + this.baseX;
				int var113 = (var111 & 0x7) + this.baseZ;
				if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
					LinkList var114 = this.objStacks[this.currentLevel][var112][var113];
					if (var114 != null) {
						for (ClientObj var115 = (ClientObj) var114.method6(); var115 != null; var115 = (ClientObj) var114.method8()) {
							if ((var110 & 0x7FFF) == var115.field873) {
								var115.unlink();
								break;
							}
						}
						if (var114.method6() == null) {
							this.objStacks[this.currentLevel][var112][var113] = null;
						}
						this.sortObjStacks(var112, var113);
					}
				}
			} else if (arg2 == 88) {
				// LOC_DEL
				int var116 = arg0.g1_alt3();
				int var117 = (var116 >> 4 & 0x7) + this.baseX;
				int var118 = (var116 & 0x7) + this.baseZ;
				int var119 = arg0.g1_alt3();
				int var120 = var119 >> 2;
				int var121 = var119 & 0x3;
				int var122 = this.LOC_SHAPE_TO_LAYER[var120];
				if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
					this.appendLoc(this.currentLevel, var117, var121, -1, var120, -1, 0, var122, var118);
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public void drawSidebar() {
		this.areaSidebar.bind();
		Pix3D.lineOffset = this.areaSidebarOffset;
		this.imageInvback.plotSprite(0, 0);
		if (this.sidebarInterfaceId != -1) {
			this.drawInterface(0, 0, Component.get(this.sidebarInterfaceId), 0);
		} else if (this.tabInterfaceId[this.selectedTab] != -1) {
			this.drawInterface(0, 0, Component.get(this.tabInterfaceId[this.selectedTab]), 0);
		}
		if (this.menuVisible && this.menuArea == 1) {
			this.drawMenu();
		}
		this.areaSidebar.draw(205, 553, super.graphics);
		this.areaViewport.bind();
		Pix3D.lineOffset = this.areaViewportOffset;
	}

	@ObfuscatedName("client.i(II)Ljava/lang/String;")
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

	@ObfuscatedName("client.a(LLRUWCBNN;ZI)V")
	public void projectFromEntity(ClientEntity arg0, int arg2) {
		this.projectFromGround(arg0.field1157, arg2, arg0.field1158);
	}

	@ObfuscatedName("client.c(IIII)V")
	public void projectFromGround(int arg0, int arg1, int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			this.projectX = -1;
			this.projectY = -1;
			return;
		}
		int var5 = this.getHeightmapY(arg2, arg0, this.currentLevel) - arg1;
		int var6 = arg0 - this.cameraX;
		int var7 = var5 - this.cameraY;
		int var8 = arg2 - this.cameraZ;
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

	@ObfuscatedName("client.q(Z)V")
	public void lag() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.flameCycle);
		if (this.onDemand != null) {
			System.out.println("Od-cycle:" + this.onDemand.field1725);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + this.ptype);
		System.out.println("psize:" + this.psize);
		if (this.stream != null) {
			this.stream.method238();
		}
		super.debug = true;
	}

	@ObfuscatedName("client.d(I)Ljava/awt/Component;")
	public java.awt.Component getBaseComponent() {
		return this;
	}

	@ObfuscatedName("client.a(IZLjava/lang/String;)V")
	public void drawProgress(int percent, String message) {
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
		this.fontBold12.centreString(var4 / 2, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...");
		int var7 = var5 / 2 - 18 - var6;
		Pix2D.drawRect(var7, 34, 9179409, var4 / 2 - 152, 304);
		Pix2D.drawRect(var7 + 1, 32, 0, var4 / 2 - 151, 302);
		Pix2D.fillRect(30, var7 + 2, 9179409, percent * 3, var4 / 2 - 150);
		Pix2D.fillRect(30, var7 + 2, 0, 300 - percent * 3, percent * 3 + (var4 / 2 - 150));
		this.fontBold12.centreString(var4 / 2, var5 / 2 + 5 - var6, 16777215, message);
		this.imageTitle4.draw(171, 202, super.graphics);
		if (this.redrawFrame) {
			this.redrawFrame = false;
			if (!this.flameActive) {
				this.imageTitle0.draw(0, 0, super.graphics);
				this.imageTitle1.draw(0, 637, super.graphics);
			}
			this.imageTitle2.draw(0, 128, super.graphics);
			this.imageTitle3.draw(371, 202, super.graphics);
			this.imageTitle5.draw(265, 0, super.graphics);
			this.imageTitle6.draw(265, 562, super.graphics);
			this.imageTitle7.draw(171, 128, super.graphics);
			this.imageTitle8.draw(171, 562, super.graphics);
		}
	}

	@ObfuscatedName("client.r(Z)V")
	public void loadTitleBackground() {
		byte[] var2 = this.jagTitle.read("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.imageTitle0.bind();
		var3.quickPlotSprite(0, 0);
		this.imageTitle1.bind();
		var3.quickPlotSprite(0, -637);
		this.imageTitle2.bind();
		var3.quickPlotSprite(0, -128);
		this.imageTitle3.bind();
		var3.quickPlotSprite(-371, -202);
		this.imageTitle4.bind();
		var3.quickPlotSprite(-171, -202);
		this.imageTitle5.bind();
		var3.quickPlotSprite(-265, 0);
		this.imageTitle6.bind();
		var3.quickPlotSprite(-265, -562);
		this.imageTitle7.bind();
		var3.quickPlotSprite(-171, -128);
		this.imageTitle8.bind();
		var3.quickPlotSprite(-171, -562);
		int[] var4 = new int[var3.wi];
		for (int var5 = 0; var5 < var3.hi; var5++) {
			for (int var11 = 0; var11 < var3.wi; var11++) {
				var4[var11] = var3.pixels[var3.wi * var5 + (var3.wi - var11 - 1)];
			}
			for (int var12 = 0; var12 < var3.wi; var12++) {
				var3.pixels[var3.wi * var5 + var12] = var4[var12];
			}
		}
		this.imageTitle0.bind();
		var3.quickPlotSprite(0, 382);
		this.imageTitle1.bind();
		var3.quickPlotSprite(0, -255);
		this.imageTitle2.bind();
		var3.quickPlotSprite(0, 254);
		this.imageTitle3.bind();
		var3.quickPlotSprite(-371, 180);
		this.imageTitle4.bind();
		var3.quickPlotSprite(-171, 180);
		this.imageTitle5.bind();
		var3.quickPlotSprite(-265, 382);
		this.imageTitle6.bind();
		var3.quickPlotSprite(-265, -180);
		this.imageTitle7.bind();
		var3.quickPlotSprite(-171, 254);
		this.imageTitle8.bind();
		var3.quickPlotSprite(-171, -180);
		Pix32 var7 = new Pix32(this.jagTitle, "logo", 0);
		this.imageTitle2.bind();
		var7.plotSprite(18, 382 - var7.wi / 2 - 128);
		Object var8 = null;
		Object var9 = null;
		Object var10 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(BLNLLHDXXJ;)V")
	public void storeLoc(LocChange arg1) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.field1324 == 0) {
			var3 = this.scene.method300(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (arg1.field1324 == 1) {
			var3 = this.scene.method301(arg1.field1325, arg1.field1323, arg1.field1326);
		}
		if (arg1.field1324 == 2) {
			var3 = this.scene.method302(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (arg1.field1324 == 3) {
			var3 = this.scene.method303(arg1.field1323, arg1.field1325, arg1.field1326);
		}
		if (var3 != 0) {
			int var7 = this.scene.method304(arg1.field1323, arg1.field1325, arg1.field1326, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.field1319 = var4;
		arg1.field1321 = var5;
		arg1.field1320 = var6;
	}

	@ObfuscatedName("client.H(I)V")
	public void unloadTitle() {
		this.flameActive = false;
		while (this.flamesCurrentlyRunning) {
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

	@ObfuscatedName("client.a(IILEWIXBTLV;II)V")
	public void drawInterface(int arg0, int arg1, Component arg2, int arg3) {
		if (arg2.type != 0 || arg2.children == null || arg2.hide && this.viewportHoveredInterfaceIndex != arg2.id && this.sidebarHoveredInterfaceIndex != arg2.id && this.chatHoveredInterfaceIndex != arg2.id) {
			return;
		}
		int var6 = Pix2D.left;
		int var7 = Pix2D.top;
		int var8 = Pix2D.right;
		int var9 = Pix2D.bottom;
		Pix2D.setClipping(arg0, arg1, arg2.height + arg0, arg2.width + arg1);
		int var10 = arg2.children.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg2.childX[var11] + arg1;
			int var13 = arg2.childY[var11] + arg0 - arg3;
			Component var14 = Component.get(arg2.children[var11]);
			int var15 = var14.field710 + var12;
			int var16 = var14.field741 + var13;
			if (var14.clientCode > 0) {
				this.updateInterfaceContent(var14);
			}
			if (var14.type == 0) {
				if (var14.field713 > var14.scroll - var14.height) {
					var14.field713 = var14.scroll - var14.height;
				}
				if (var14.field713 < 0) {
					var14.field713 = 0;
				}
				this.drawInterface(var16, var15, var14, var14.field713);
				if (var14.scroll > var14.height) {
					this.drawScrollbar(var14.field713, var14.width + var15, var14.height, var14.scroll, var16);
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
									Pix32 var26 = ObjType.method230(var25, var14.invSlotObjCount[var17], var24);
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
											var26.transPlotSprite(var20 + var22, var21 + var23, 128);
											if (var21 + var23 < Pix2D.top && arg2.field713 > 0) {
												int var27 = (Pix2D.top - var21 - var23) * this.sceneDelta / 3;
												if (var27 > this.sceneDelta * 10) {
													var27 = this.sceneDelta * 10;
												}
												if (var27 > arg2.field713) {
													var27 = arg2.field713;
												}
												arg2.field713 -= var27;
												this.objGrabY += var27;
											}
											if (var21 + var23 + 32 > Pix2D.bottom && arg2.field713 < arg2.scroll - arg2.height) {
												int var28 = (var21 + var23 + 32 - Pix2D.bottom) * this.sceneDelta / 3;
												if (var28 > this.sceneDelta * 10) {
													var28 = this.sceneDelta * 10;
												}
												if (var28 > arg2.scroll - arg2.height - arg2.field713) {
													var28 = arg2.scroll - arg2.height - arg2.field713;
												}
												arg2.field713 += var28;
												this.objGrabY -= var28;
											}
										} else if (this.selectedArea != 0 && this.selectedItem == var17 && this.selectedInterface == var14.id) {
											var26.transPlotSprite(var20, var21, 128);
										} else {
											var26.plotSprite(var21, var20);
										}
										if (var26.owi == 33 || var14.invSlotObjCount[var17] != 1) {
											int var29 = var14.invSlotObjCount[var17];
											this.fontPlain11.drawString(var20 + 1 + var22, 0, var21 + 10 + var23, formatObjCount(var29));
											this.fontPlain11.drawString(var20 + var22, 16776960, var21 + 9 + var23, formatObjCount(var29));
										}
									}
								}
							} else if (var14.invSlotGraphic != null && var17 < 20) {
								Pix32 var30 = var14.invSlotGraphic[var17];
								if (var30 != null) {
									var30.plotSprite(var21, var20);
								}
							}
							var17++;
						}
					}
				} else if (var14.type == 3) {
					boolean var31 = false;
					if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
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
							Pix2D.fillRect(var14.height, var16, var32, var14.width, var15);
						} else {
							Pix2D.drawRect(var16, var14.height, var32, var15, var14.width);
						}
					} else if (var14.fill) {
						Pix2D.fillRectTrans(var32, var16, var14.width, var14.height, 256 - (var14.trans & 0xFF), var15);
					} else {
						Pix2D.drawRectTrans(var15, var14.width, var32, var14.height, var16, 256 - (var14.trans & 0xFF));
					}
				} else if (var14.type == 4) {
					PixFont var33 = var14.font;
					String var34 = var14.text;
					boolean var35 = false;
					if (this.chatHoveredInterfaceIndex == var14.id || this.sidebarHoveredInterfaceIndex == var14.id || this.viewportHoveredInterfaceIndex == var14.id) {
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
					int var37 = var33.height + var16;
					while (var34.length() > 0) {
						if (var34.indexOf("%") != -1) {
							label393: while (true) {
								int var38 = var34.indexOf("%1");
								if (var38 == -1) {
									while (true) {
										int var39 = var34.indexOf("%2");
										if (var39 == -1) {
											while (true) {
												int var40 = var34.indexOf("%3");
												if (var40 == -1) {
													while (true) {
														int var41 = var34.indexOf("%4");
														if (var41 == -1) {
															while (true) {
																int var42 = var34.indexOf("%5");
																if (var42 == -1) {
																	break label393;
																}
																var34 = var34.substring(0, var42) + this.getIntString(this.executeClientScript(4, var14)) + var34.substring(var42 + 2);
															}
														}
														var34 = var34.substring(0, var41) + this.getIntString(this.executeClientScript(3, var14)) + var34.substring(var41 + 2);
													}
												}
												var34 = var34.substring(0, var40) + this.getIntString(this.executeClientScript(2, var14)) + var34.substring(var40 + 2);
											}
										}
										var34 = var34.substring(0, var39) + this.getIntString(this.executeClientScript(1, var14)) + var34.substring(var39 + 2);
									}
								}
								var34 = var34.substring(0, var38) + this.getIntString(this.executeClientScript(0, var14)) + var34.substring(var38 + 2);
							}
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
							var33.centreStringTag(var14.shadowed, var36, var37, var14.width / 2 + var15, var44);
						} else {
							var33.drawStringTag(var36, var15, var37, var14.shadowed, var44);
						}
						var37 += var33.height;
					}
				} else if (var14.type == 5) {
					Pix32 var45;
					if (this.executeInterfaceScript(var14)) {
						var45 = var14.activeGraphic;
					} else {
						var45 = var14.graphic;
					}
					if (var45 != null) {
						var45.plotSprite(var16, var15);
					}
				} else if (var14.type == 6) {
					int var46 = Pix3D.centerX;
					int var47 = Pix3D.centerY;
					Pix3D.centerX = var14.width / 2 + var15;
					Pix3D.centerY = var14.height / 2 + var16;
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
						var52 = var14.getModel(-1, -1, var50);
					} else {
						SeqType var53 = SeqType.field775[var51];
						var52 = var14.getModel(var53.field777[var14.field717], var53.field778[var14.field717], var50);
					}
					if (var52 != null) {
						var52.method380(0, var14.yan, 0, var14.xan, 0, var48, var49);
					}
					Pix3D.centerX = var46;
					Pix3D.centerY = var47;
				} else {
					if (var14.type == 7) {
						PixFont var54 = var14.font;
						int var55 = 0;
						for (int var56 = 0; var56 < var14.height; var56++) {
							for (int var57 = 0; var57 < var14.width; var57++) {
								if (var14.invSlotObjId[var55] > 0) {
									ObjType var58 = ObjType.get(var14.invSlotObjId[var55] - 1);
									String var59 = String.valueOf(var58.field811);
									if (var58.field853 || var14.invSlotObjCount[var55] != 1) {
										var59 = var59 + " x" + formatObjCountTagged(var14.invSlotObjCount[var55]);
									}
									int var60 = (var14.marginX + 115) * var57 + var15;
									int var61 = (var14.marginY + 12) * var56 + var16;
									if (var14.center) {
										var54.centreStringTag(var14.shadowed, var14.colour, var61, var14.width / 2 + var60, var59);
									} else {
										var54.drawStringTag(var14.colour, var60, var61, var14.shadowed, var59);
									}
								}
								var55++;
							}
						}
					}
					if (var14.type == 8 && (this.field580 == var14.id || this.field340 == var14.id || this.field425 == var14.id) && this.field189 == 100) {
						int var62 = 0;
						int var63 = 0;
						PixFont var64 = this.fontPlain12;
						String var65 = var14.text;
						while (var65.length() > 0) {
							int var72 = var65.indexOf("\\n");
							String var73;
							if (var72 == -1) {
								var73 = var65;
								var65 = "";
							} else {
								var73 = var65.substring(0, var72);
								var65 = var65.substring(var72 + 2);
							}
							int var74 = var64.stringWidTag(var73);
							if (var74 > var62) {
								var62 = var74;
							}
							var63 += var64.height + 1;
						}
						var62 += 6;
						var63 += 7;
						int var66 = var14.width + var15 - 5 - var62;
						int var67 = var14.height + var16 + 5;
						if (var66 < var15 + 5) {
							var66 = var15 + 5;
						}
						if (var62 + var66 > arg2.width + arg1) {
							var66 = arg2.width + arg1 - var62;
						}
						if (var63 + var67 > arg2.height + arg0) {
							var67 = arg2.height + arg0 - var63;
						}
						Pix2D.fillRect(var63, var67, 16777120, var62, var66);
						Pix2D.drawRect(var67, var63, 0, var66, var62);
						String var68 = var14.text;
						int var69 = var64.height + var67 + 2;
						while (var68.length() > 0) {
							int var70 = var68.indexOf("\\n");
							String var71;
							if (var70 == -1) {
								var71 = var68;
								var68 = "";
							} else {
								var71 = var68.substring(0, var70);
								var68 = var68.substring(var70 + 2);
							}
							var64.drawStringTag(0, var66 + 3, var69, false, var71);
							var69 += var64.height + 1;
						}
					}
				}
			}
		}
		Pix2D.setClipping(var7, var6, var9, var8);
	}

	@ObfuscatedName("client.l(B)V")
	public void updateSceneState() {
		if (lowMem && this.sceneState == 2 && World.field125 != this.currentLevel) {
			this.showPopupMessage(null, "Loading - please wait.");
			this.sceneState = 1;
			this.sceneLoadStartTime = System.currentTimeMillis();
		}
		if (this.sceneState == 1) {
			int var2 = this.checkScene();
			if (var2 != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
				signlink.reporterror(this.username + " glcfb " + this.serverSeed + "," + var2 + "," + lowMem + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.currentLevel + "," + this.sceneCenterZoneX + "," + this.sceneCenterZoneZ);
				this.sceneLoadStartTime = System.currentTimeMillis();
			}
		}
		if (this.sceneState == 2 && this.minimapLevel != this.currentLevel) {
			this.minimapLevel = this.currentLevel;
			this.createMinimap(this.currentLevel);
		}
	}

	@ObfuscatedName("client.I(I)I")
	public int checkScene() {
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
				if (this.sceneInstanced) {
					var6 = 10;
					var7 = 10;
				}
				var3 &= World.method29(var6, var7, var5);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.awaitingSync) {
			return -4;
		} else {
			this.sceneState = 2;
			World.field125 = this.currentLevel;
			this.buildScene();
			// MAP_BUILD_COMPLETE
			this.out.p1isaac(6);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ZIIIIIIIII)V")
	public void appendLoc(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) this.locChanges.method6(); var12 != null; var12 = (LocChange) this.locChanges.method8()) {
			if (var12.field1323 == arg1 && var12.field1325 == arg2 && var12.field1326 == arg9 && var12.field1324 == arg8) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.field1323 = arg1;
			var11.field1324 = arg8;
			var11.field1325 = arg2;
			var11.field1326 = arg9;
			this.storeLoc(var11);
			this.locChanges.method3(var11);
		}
		var11.field1316 = arg6;
		var11.field1318 = arg5;
		var11.field1317 = arg3;
		var11.field1327 = arg7;
		var11.field1322 = arg4;
	}

	@ObfuscatedName("client.m(B)V")
	public void handleMinimapInput() {
		if (this.minimapType != 0 || super.mouseClickButton != 1) {
			return;
		}
		int var2 = super.mouseClickX - 25 - 550;
		int var3 = super.mouseClickY - 5 - 4;
		if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
			return;
		}
		var2 -= 73;
		var3 -= 75;
		int var4 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
		int var5 = Pix3D.sinTable[var4];
		int var6 = Pix3D.cosTable[var4];
		int var7 = (this.macroMinimapZoom + 256) * var5 >> 8;
		int var8 = (this.macroMinimapZoom + 256) * var6 >> 8;
		int var9 = var2 * var8 + var3 * var7 >> 11;
		int var10 = var3 * var8 - var2 * var7 >> 11;
		int var11 = localPlayer.field1157 + var9 >> 7;
		int var12 = localPlayer.field1158 - var10 >> 7;
		boolean var13 = this.tryMove(true, false, var12, localPlayer.routeTileZ[0], 0, 0, 1, 0, var11, 0, 0, localPlayer.routeTileX[0]);
		if (var13) {
			this.out.p1(var2);
			this.out.p1(var3);
			this.out.p2(this.orbitCameraYaw);
			this.out.p1(57);
			this.out.p1(this.macroMinimapAngle);
			this.out.p1(this.macroMinimapZoom);
			this.out.p1(89);
			this.out.p2(localPlayer.field1157);
			this.out.p2(localPlayer.field1158);
			this.out.p1(this.tryMoveNearest);
			this.out.p1(63);
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void prepareFullGame() {
		if (super.drawArea != null) {
			return;
		}
		this.unloadTitle();
		this.imageTitle2 = null;
		this.imageTitle3 = null;
		this.imageTitle4 = null;
		this.imageTitle0 = null;
		this.imageTitle1 = null;
		this.imageTitle5 = null;
		this.imageTitle6 = null;
		this.imageTitle7 = null;
		this.imageTitle8 = null;
		this.areaChatback = null;
		this.areaMapback = null;
		this.areaSidebar = null;
		this.areaViewport = null;
		this.areaBackbase1 = null;
		this.areaBackbase2 = null;
		this.areaBackmid1 = null;
		super.drawArea = new PixMap(503, this.getBaseComponent(), 765);
		this.redrawFrame = true;
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

	@ObfuscatedName("client.K(I)V")
	public void updateTitle() {
		if (this.titleScreenState == 0) {
			int var2 = super.canvasWidth / 2 - 80;
			int var3 = super.canvasHeight / 2 + 20;
			int var14 = var3 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.titleScreenState = 3;
				this.titleLoginField = 0;
			}
			int var4 = super.canvasWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.loginMessage0 = "";
				this.loginMessage1 = "Enter your username & password.";
				this.titleScreenState = 2;
				this.titleLoginField = 0;
			}
		} else if (this.titleScreenState == 2) {
			int var5 = super.canvasHeight / 2 - 40;
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
			int var6 = super.canvasWidth / 2 - 80;
			int var7 = super.canvasHeight / 2 + 50;
			int var17 = var7 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.field146 = 0;
				this.login(this.username, this.password, false);
				if (this.ingame) {
					return;
				}
			}
			int var8 = super.canvasWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.titleScreenState = 0;
				this.username = "";
				this.password = "";
			}
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
		} else if (this.titleScreenState == 3) {
			int var12 = super.canvasWidth / 2;
			int var13 = super.canvasHeight / 2 + 50;
			int var18 = var13 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
				this.titleScreenState = 0;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public void drawMinimapLoc(int arg0, int arg1, int arg2, int arg3, int arg5) {
		int var7 = this.scene.method300(arg1, arg2, arg0);
		if (var7 != 0) {
			int var9 = this.scene.method304(arg1, arg2, arg0, var7);
			int var10 = var9 >> 6 & 0x3;
			int var11 = var9 & 0x1F;
			int var12 = arg5;
			if (var7 > 0) {
				var12 = arg3;
			}
			int[] var13 = this.imageMinimap.pixels;
			int var14 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
			int var15 = var7 >> 14 & 0x7FFF;
			LocType var16 = LocType.method561(var15);
			if (var16.field1649 == -1) {
				if (var11 == 0 || var11 == 2) {
					if (var10 == 0) {
						var13[var14] = var12;
						var13[var14 + 512] = var12;
						var13[var14 + 1024] = var12;
						var13[var14 + 1536] = var12;
					} else if (var10 == 1) {
						var13[var14] = var12;
						var13[var14 + 1] = var12;
						var13[var14 + 2] = var12;
						var13[var14 + 3] = var12;
					} else if (var10 == 2) {
						var13[var14 + 3] = var12;
						var13[var14 + 3 + 512] = var12;
						var13[var14 + 3 + 1024] = var12;
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var13[var14 + 1536] = var12;
						var13[var14 + 1536 + 1] = var12;
						var13[var14 + 1536 + 2] = var12;
						var13[var14 + 1536 + 3] = var12;
					}
				}
				if (var11 == 3) {
					if (var10 == 0) {
						var13[var14] = var12;
					} else if (var10 == 1) {
						var13[var14 + 3] = var12;
					} else if (var10 == 2) {
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var13[var14 + 1536] = var12;
					}
				}
				if (var11 == 2) {
					if (var10 == 3) {
						var13[var14] = var12;
						var13[var14 + 512] = var12;
						var13[var14 + 1024] = var12;
						var13[var14 + 1536] = var12;
					} else if (var10 == 0) {
						var13[var14] = var12;
						var13[var14 + 1] = var12;
						var13[var14 + 2] = var12;
						var13[var14 + 3] = var12;
					} else if (var10 == 1) {
						var13[var14 + 3] = var12;
						var13[var14 + 3 + 512] = var12;
						var13[var14 + 3 + 1024] = var12;
						var13[var14 + 3 + 1536] = var12;
					} else if (var10 == 2) {
						var13[var14 + 1536] = var12;
						var13[var14 + 1536 + 1] = var12;
						var13[var14 + 1536 + 2] = var12;
						var13[var14 + 1536 + 3] = var12;
					}
				}
			} else {
				Pix8 var17 = this.imageMapscene[var16.field1649];
				if (var17 != null) {
					int var18 = (var16.field1655 * 4 - var17.wi) / 2;
					int var19 = (var16.field1629 * 4 - var17.hi) / 2;
					var17.plotSprite((104 - arg0 - var16.field1629) * 4 + 48 + var19, arg2 * 4 + 48 + var18);
				}
			}
		}
		int var20 = this.scene.method302(arg1, arg2, arg0);
		if (var20 != 0) {
			int var21 = this.scene.method304(arg1, arg2, arg0, var20);
			int var22 = var21 >> 6 & 0x3;
			int var23 = var21 & 0x1F;
			int var24 = var20 >> 14 & 0x7FFF;
			LocType var25 = LocType.method561(var24);
			if (var25.field1649 != -1) {
				Pix8 var26 = this.imageMapscene[var25.field1649];
				if (var26 != null) {
					int var27 = (var25.field1655 * 4 - var26.wi) / 2;
					int var28 = (var25.field1629 * 4 - var26.hi) / 2;
					var26.plotSprite((104 - arg0 - var25.field1629) * 4 + 48 + var28, arg2 * 4 + 48 + var27);
				}
			} else if (var23 == 9) {
				int var29 = 15658734;
				if (var20 > 0) {
					var29 = 15597568;
				}
				int[] var30 = this.imageMinimap.pixels;
				int var31 = (103 - arg0) * 512 * 4 + arg2 * 4 + 24624;
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
		int var32 = this.scene.method303(arg1, arg2, arg0);
		if (var32 != 0) {
			int var33 = var32 >> 14 & 0x7FFF;
			LocType var34 = LocType.method561(var33);
			if (var34.field1649 != -1) {
				Pix8 var35 = this.imageMapscene[var34.field1649];
				if (var35 != null) {
					int var36 = (var34.field1655 * 4 - var35.wi) / 2;
					int var37 = (var34.field1629 * 4 - var35.hi) / 2;
					var35.plotSprite((104 - arg0 - var34.field1629) * 4 + 48 + var37, arg2 * 4 + 48 + var36);
				}
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public void drawScene() {
		this.sceneCycle++;
		this.pushNpcs(true);
		this.pushPlayers(true);
		this.pushNpcs(false);
		this.pushPlayers(false);
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
			int var3 = this.macroCameraAngle + this.orbitCameraYaw & 0x7FF;
			this.orbitCamera(this.getHeightmapY(localPlayer.field1158, localPlayer.field1157, this.currentLevel) - 50, this.orbitCameraX, var2, var2 * 3 + 600, var3, this.orbitCameraZ);
		}
		int var4;
		if (this.cutscene) {
			var4 = this.getTopLevelCutscene();
		} else {
			var4 = this.getTopLevel();
		}
		int var5 = this.cameraX;
		int var6 = this.cameraY;
		int var7 = this.cameraZ;
		int var8 = this.cameraPitch;
		int var9 = this.cameraYaw;
		for (int var10 = 0; var10 < 5; var10++) {
			if (this.cameraModifierEnabled[var10]) {
				int var12 = (int) (Math.random() * (double) (this.cameraModifierJitter[var10] * 2 + 1) - (double) this.cameraModifierJitter[var10] + Math.sin((double) this.cameraModifierWobbleSpeed[var10] / 100.0D * (double) this.cameraModifierCycle[var10]) * (double) this.cameraModifierWobbleScale[var10]);
				if (var10 == 0) {
					this.cameraX += var12;
				}
				if (var10 == 1) {
					this.cameraY += var12;
				}
				if (var10 == 2) {
					this.cameraZ += var12;
				}
				if (var10 == 3) {
					this.cameraYaw = this.cameraYaw + var12 & 0x7FF;
				}
				if (var10 == 4) {
					this.cameraPitch += var12;
					if (this.cameraPitch < 128) {
						this.cameraPitch = 128;
					}
					if (this.cameraPitch > 383) {
						this.cameraPitch = 383;
					}
				}
			}
		}
		int var11 = Pix3D.cycle;
		Model.checkHover = true;
		Model.pickedCount = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;
		Pix2D.cls();
		this.scene.draw(this.cameraX, var4, this.cameraY, this.cameraZ, this.cameraYaw, this.cameraPitch);
		this.scene.clearLocChanges();
		this.draw2DEntityElements();
		this.drawTileHint();
		this.updateTextures(var11);
		this.draw3DEntityElements();
		this.areaViewport.draw(4, 4, super.graphics);
		this.cameraX = var5;
		this.cameraY = var6;
		this.cameraZ = var7;
		this.cameraPitch = var8;
		this.cameraYaw = var9;
	}

	@ObfuscatedName("client.M(I)V")
	public void updateAudio() {
		for (int var2 = 0; var2 < this.waveCount; var2++) {
			if (this.waveDelay[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.waveIds[var2] != this.lastWaveId || this.waveLoops[var2] != this.lastWaveLoops) {
						Packet var4 = Wave.method479(this.waveLoops[var2], (byte) 6, this.waveIds[var2]);
						if (System.currentTimeMillis() + (long) (var4.pos / 22) > (long) (this.lastWaveLength / 22) + this.lastWaveStartTime) {
							this.lastWaveLength = var4.pos;
							this.lastWaveStartTime = System.currentTimeMillis();
							if (this.saveWave(var4.pos, var4.data)) {
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
					if (signlink.reporterror) {
						// todo: reporting synth error
						this.out.p1isaac(80);
						this.out.p2(this.waveIds[var2] & 0x7FFF);
					} else {
						// todo: reporting synth error
						this.out.p1isaac(80);
						this.out.p2(-1);
					}
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
			if (this.nextMusicDelay == 0 && this.midiActive && !lowMem) {
				this.midiSong = this.nextMidiSong;
				this.midiFading = true;
				this.onDemand.request(2, this.midiSong);
			}
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var4 = var1 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var0 += var5;
			field248[var1] = var0 / 4;
		}
		CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		DESIGN_BODY_COLOUR = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		field510 = new int[32];
		int var2 = 2;
		for (int var3 = 0; var3 < 32; var3++) {
			field510[var3] = var2 - 1;
			var2 += var2;
		}
		DESIGN_HAIR_COLOUR = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		LOGIN_RSAE = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}
}
