package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.IdkType;
import jagex2.config.IfType;
import jagex2.config.LocType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;
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
import jagex2.dash3d.Pix3D;
import jagex2.dash3d.Sprite;
import jagex2.dash3d.Wall;
import jagex2.dash3d.World;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix32;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.graphics.PixMap;
import jagex2.io.ClientStream;
import jagex2.io.FileStream;
import jagex2.io.Isaac;
import jagex2.io.JagFile;
import jagex2.io.OnDemand;
import jagex2.io.OnDemandRequest;
import jagex2.io.Packet;
import jagex2.io.Protocol;
import jagex2.sound.JagFX;
import jagex2.wordfilter.WordFilter;
import jagex2.wordfilter.WordPack;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
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
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.Oi")
	public static int nodeId;

	@ObfuscatedName("client.Pi")
	public static int portOffset;

	@ObfuscatedName("client.Qi")
	public static boolean memServer;

	@ObfuscatedName("client.Ri")
	public static boolean lowMem;

	@ObfuscatedName("client.Zf")
	public static int cyclelogic4;

	@ObfuscatedName("client.Qc")
	public static int cyclelogic5;

	@ObfuscatedName("client.Sb")
	public static int cyclelogic7;

	@ObfuscatedName("client.Ui")
	public static int oplogic1;

	@ObfuscatedName("client.Oh")
	public static int oplogic2;

	@ObfuscatedName("client.be")
	public static int oplogic3;

	@ObfuscatedName("client.Pb")
	public static int oplogic4;

	@ObfuscatedName("client.S")
	public static int oplogic5;

	@ObfuscatedName("client.Ej")
	public static int oplogic6;

	@ObfuscatedName("client.Ag")
	public static int oplogic7;

	@ObfuscatedName("client.kf")
	public static int oplogic8;

	@ObfuscatedName("client.mg")
	public static int oplogic9;

	@ObfuscatedName("client.Wi")
	public static int loopCycle;

	@ObfuscatedName("client.Hd")
	public static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.ag")
	public static final int[] readbit;

	@ObfuscatedName("client.Si")
	public boolean errorStarted = false;

	@ObfuscatedName("client.tf")
	public boolean errorLoading = false;

	@ObfuscatedName("client.R")
	public boolean errorHost = false;

	@ObfuscatedName("client.Ph")
	public long prevMouseClickTime;

	@ObfuscatedName("client.ed")
	public static boolean mouseTracked;

	@ObfuscatedName("client.Lb")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.Q")
	public int mouseTrackedDelta;

	@ObfuscatedName("client.bd")
	public boolean focusIn = true;

	@ObfuscatedName("client.ne")
	public int rebootTimer;

	@ObfuscatedName("client.ue")
	public int hintType;

	@ObfuscatedName("client.Ni")
	public int lastAddress;

	@ObfuscatedName("client.od")
	public int daysSinceLastLogin;

	@ObfuscatedName("client.Ob")
	public int daysSinceRecoveriesChanged;

	@ObfuscatedName("client.Me")
	public int unreadMessages;

	@ObfuscatedName("client.Kc")
	public int warnMembersInNonMembers;

	@ObfuscatedName("client.L")
	public OnDemand onDemand;

	@ObfuscatedName("client.Ce")
	public Socket jaggrabSocket;

	@ObfuscatedName("client.xe")
	public ClientNpc[] npc = new ClientNpc[16384];

	@ObfuscatedName("client.ye")
	public int npcCount;

	@ObfuscatedName("client.ze")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.lg")
	public ClientStream stream;

	@ObfuscatedName("client.K")
	public long loginSeed;

	@ObfuscatedName("client.Uc")
	public Isaac randomIn;

	@ObfuscatedName("client.vb")
	public Packet out = Packet.alloc(-929, 1);

	@ObfuscatedName("client.T")
	public Packet loginout = Packet.alloc(-929, 1);

	@ObfuscatedName("client.Sg")
	public Packet in = Packet.alloc(-929, 1);

	@ObfuscatedName("client.Dh")
	public int psize;

	@ObfuscatedName("client.Eh")
	public int ptype;

	@ObfuscatedName("client.Fh")
	public int timeoutTimer;

	@ObfuscatedName("client.Gh")
	public int noTimeoutTimer;

	@ObfuscatedName("client.Hh")
	public int logoutTimer;

	@ObfuscatedName("client.Ff")
	public int ptype0;

	@ObfuscatedName("client.Gf")
	public int ptype1;

	@ObfuscatedName("client.Hf")
	public int ptype2;

	@ObfuscatedName("client.Dg")
	public JagFile title;

	@ObfuscatedName("client.lj")
	public PixFont p11;

	@ObfuscatedName("client.mj")
	public PixFont p12;

	@ObfuscatedName("client.nj")
	public PixFont b12;

	@ObfuscatedName("client.oj")
	public PixFont q8;

	@ObfuscatedName("client.Sh")
	public int mapBuildBaseX;

	@ObfuscatedName("client.Th")
	public int mapBuildBaseZ;

	@ObfuscatedName("client.bc")
	public int sceneState;

	@ObfuscatedName("client.If")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.zc")
	public boolean withinTutorialIsland = false;

	@ObfuscatedName("client.Fj")
	public boolean awaitingPlayerInfo = false;

	@ObfuscatedName("client.cf")
	public int[] mapBuildIndex;

	@ObfuscatedName("client.df")
	public int[] mapBuildGroundFile;

	@ObfuscatedName("client.ef")
	public int[] mapBuildLocationFile;

	@ObfuscatedName("client.Wd")
	public byte[][] mapBuildGroundData;

	@ObfuscatedName("client.Od")
	public byte[][] mapBuildLocationData;

	@ObfuscatedName("client.ai")
	public World world;

	@ObfuscatedName("client.Qb")
	public byte[][][] mapl;

	@ObfuscatedName("client.Kb")
	public int[][][] groundh;

	@ObfuscatedName("client.Le")
	public CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("client.vg")
	public byte[] textureBuffer = new byte[16384];

	@ObfuscatedName("client.Ae")
	public int macroCameraX;

	@ObfuscatedName("client.Be")
	public int macroCameraXModifier = 2;

	@ObfuscatedName("client.xi")
	public int macroCameraZ;

	@ObfuscatedName("client.yi")
	public int macroCameraZModifier = 2;

	@ObfuscatedName("client.sg")
	public int macroCameraAngle;

	@ObfuscatedName("client.tg")
	public int macroCameraAngleModifier = 1;

	@ObfuscatedName("client.Oc")
	public int macroCameraCycle;

	@ObfuscatedName("client.Ad")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Bd")
	public int macroMinimapAngleModifier = 2;

	@ObfuscatedName("client.Nf")
	public int macroMinimapZoom;

	@ObfuscatedName("client.Of")
	public int macroMinimapZoomModifier = 1;

	@ObfuscatedName("client.Ac")
	public int macroMinimapCycle;

	@ObfuscatedName("client.V")
	public int worldUpdateNum;

	@ObfuscatedName("client.Gc")
	public Pix32 minimap;

	@ObfuscatedName("client.de")
	public Pix32 compass;

	@ObfuscatedName("client.rj")
	public Pix32 mapedge;

	@ObfuscatedName("client.Xi")
	public Pix8[] mapscene = new Pix8[100];

	@ObfuscatedName("client.qf")
	public Pix32[] mapfunction = new Pix32[100];

	@ObfuscatedName("client.ug")
	public Pix32[] hitmarks = new Pix32[20];

	@ObfuscatedName("client.Rh")
	public Pix32[] headicons = new Pix32[20];

	@ObfuscatedName("client.si")
	public Pix32 mapmarker0;

	@ObfuscatedName("client.ti")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.Mb")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.Pf")
	public Pix32 mapdots0;

	@ObfuscatedName("client.Qf")
	public Pix32 mapdots1;

	@ObfuscatedName("client.Rf")
	public Pix32 mapdots2;

	@ObfuscatedName("client.Sf")
	public Pix32 mapdots3;

	@ObfuscatedName("client.wf")
	public Pix8 scrollbar0;

	@ObfuscatedName("client.xf")
	public Pix8 scrollbar1;

	@ObfuscatedName("client.hb")
	public final Pix8[] modIcons = new Pix8[2];

	@ObfuscatedName("client.eh")
	public Pix8 mapback;

	@ObfuscatedName("client.Bc")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.tj")
	public PixMap imageTitle2;

	@ObfuscatedName("client.uj")
	public PixMap imageTitle3;

	@ObfuscatedName("client.vj")
	public PixMap imageTitle4;

	@ObfuscatedName("client.yj")
	public PixMap imageTitle5;

	@ObfuscatedName("client.zj")
	public PixMap imageTitle6;

	@ObfuscatedName("client.Aj")
	public PixMap imageTitle7;

	@ObfuscatedName("client.Bj")
	public PixMap imageTitle8;

	@ObfuscatedName("client.De")
	public int loginscreen;

	@ObfuscatedName("client.cb")
	public int loginSelect;

	@ObfuscatedName("client.wg")
	public String loginMes1 = "";

	@ObfuscatedName("client.xg")
	public String loginMes2 = "";

	@ObfuscatedName("client.Jf")
	public String loginUser = "";

	@ObfuscatedName("client.Kf")
	public String loginPass = "";

	@ObfuscatedName("client.Jb")
	public Pix8[] runes;

	@ObfuscatedName("client.ei")
	public PixMap areaMap;

	@ObfuscatedName("client.fi")
	public PixMap areaGame;

	@ObfuscatedName("client.Db")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.Eb")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.Fb")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.Jg")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.Kg")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.Lg")
	public PixMap areaBackright1;

	@ObfuscatedName("client.Mg")
	public PixMap areaBackright2;

	@ObfuscatedName("client.Ng")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.Og")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.Pg")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.Qg")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.Rg")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.Hc")
	public int[] chatScanline;

	@ObfuscatedName("client.Ic")
	public int[] sideScanline;

	@ObfuscatedName("client.Jc")
	public int[] gameScanline;

	@ObfuscatedName("client.dh")
	public Pix8 invback;

	@ObfuscatedName("client.fh")
	public Pix8 chatback;

	@ObfuscatedName("client.wc")
	public Pix8 backbase1;

	@ObfuscatedName("client.xc")
	public Pix8 backbase2;

	@ObfuscatedName("client.yc")
	public Pix8 backhmid1;

	@ObfuscatedName("client.Gj")
	public Pix8[] sideicons = new Pix8[13];

	@ObfuscatedName("client.Wg")
	public Pix8 redstone1;

	@ObfuscatedName("client.Xg")
	public Pix8 redstone2;

	@ObfuscatedName("client.Yg")
	public Pix8 redstone3;

	@ObfuscatedName("client.Zg")
	public Pix8 redstone1h;

	@ObfuscatedName("client.ah")
	public Pix8 redstone2h;

	@ObfuscatedName("client.xb")
	public Pix8 redstone1v;

	@ObfuscatedName("client.yb")
	public Pix8 redstone2v;

	@ObfuscatedName("client.zb")
	public Pix8 redstone3v;

	@ObfuscatedName("client.Ab")
	public Pix8 redstone1hv;

	@ObfuscatedName("client.Bb")
	public Pix8 redstone2hv;

	@ObfuscatedName("client.oh")
	public boolean redrawIcons = false;

	@ObfuscatedName("client.Af")
	public boolean redrawChatMode = false;

	@ObfuscatedName("client.Cd")
	public final int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.Dc")
	public final int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.ac")
	public final int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.Nb")
	public final int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.pe")
	public final int SCROLLBAR_TRACK = 2301979;

	@ObfuscatedName("client.ii")
	public final int SCROLLBAR_GRIP_FOREGROUND = 5063219;

	@ObfuscatedName("client.pb")
	public final int SCROLLBAR_GRIP_LOWLIGHT = 3353893;

	@ObfuscatedName("client.Xf")
	public final int SCROLLBAR_GRIP_HIGHLIGHT = 7759444;

	@ObfuscatedName("client.Ef")
	public int scrollCycle;

	@ObfuscatedName("client.Ub")
	public int camX;

	@ObfuscatedName("client.Vb")
	public int camY;

	@ObfuscatedName("client.Wb")
	public int camZ;

	@ObfuscatedName("client.Xb")
	public int camPitch;

	@ObfuscatedName("client.Yb")
	public int camYaw;

	@ObfuscatedName("client.Wc")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Xc")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Yc")
	public int orbitCameraYawVelocity;

	@ObfuscatedName("client.Zc")
	public int orbitCameraPitchVelocity;

	@ObfuscatedName("client.Tf")
	public int orbitCameraX;

	@ObfuscatedName("client.Uf")
	public int orbitCameraZ;

	@ObfuscatedName("client.Vf")
	public int sendCameraDelay;

	@ObfuscatedName("client.Wf")
	public boolean sendCamera = false;

	@ObfuscatedName("client.Vi")
	public int cameraPitchClamp;

	@ObfuscatedName("client.Xh")
	public int sceneCycle;

	@ObfuscatedName("client.Cf")
	public int projectX = -1;

	@ObfuscatedName("client.Df")
	public int projectY = -1;

	@ObfuscatedName("client.M")
	public int crossX;

	@ObfuscatedName("client.N")
	public int crossY;

	@ObfuscatedName("client.O")
	public int crossCycle;

	@ObfuscatedName("client.P")
	public int crossMode;

	@ObfuscatedName("client.lh")
	public int selectedArea;

	@ObfuscatedName("client.ih")
	public int selectedCycle;

	@ObfuscatedName("client.hg")
	public int objDragArea;

	@ObfuscatedName("client.fg")
	public int objDragComId;

	@ObfuscatedName("client.Yd")
	public int hoveredSlotComId;

	@ObfuscatedName("client.gg")
	public int objDragSlot;

	@ObfuscatedName("client.ig")
	public int objGrabX;

	@ObfuscatedName("client.jg")
	public int objGrabY;

	@ObfuscatedName("client.sb")
	public boolean objGrabThreshold = false;

	@ObfuscatedName("client.Xd")
	public int hoveredSlot;

	@ObfuscatedName("client.yg")
	public int inMultizone;

	@ObfuscatedName("client.bj")
	public int chatDisabled;

	@ObfuscatedName("client.Fi")
	public final int MAX_PLAYER_COUNT = 2048;

	@ObfuscatedName("client.Hi")
	public ClientPlayer[] players = new ClientPlayer[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Ii")
	public int playerCount;

	@ObfuscatedName("client.Ji")
	public int[] playerIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Ki")
	public int entityUpdateCount;

	@ObfuscatedName("client.Li")
	public int[] entityUpdateIds = new int[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.Mi")
	public Packet[] playerAppearanceBuffer = new Packet[MAX_PLAYER_COUNT];

	@ObfuscatedName("client.ph")
	public int minusedlevel;

	@ObfuscatedName("client.lf")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.hd")
	public int entityRemovalCount;

	@ObfuscatedName("client.id")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.Mc")
	public final String[] playerOp = new String[5];

	@ObfuscatedName("client.Nc")
	public final boolean[] playerOpPriority = new boolean[5];

	@ObfuscatedName("client.gh")
	public LinkList[][][] groundObj = new LinkList[4][104][104];

	@ObfuscatedName("client.Cg")
	public LinkList locChanges = new LinkList(-199);

	@ObfuscatedName("client.Lc")
	public LinkList projectiles = new LinkList(-199);

	@ObfuscatedName("client.sf")
	public LinkList spotanims = new LinkList(-199);

	@ObfuscatedName("client.Hb")
	public int oneMouseButton;

	@ObfuscatedName("client.nd")
	public boolean isMenuOpen = false;

	@ObfuscatedName("client.Md")
	public int menuNumEntries;

	@ObfuscatedName("client.ib")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.jb")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.kb")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.lb")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.qc")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.td")
	public int useMode;

	@ObfuscatedName("client.xd")
	public String objSelectedName;

	@ObfuscatedName("client.je")
	public int targetMode;

	@ObfuscatedName("client.le")
	public int targetMask;

	@ObfuscatedName("client.me")
	public String targetOp;

	@ObfuscatedName("client.hi")
	public int mainModalId = -1;

	@ObfuscatedName("client.ic")
	public int sideModalId = -1;

	@ObfuscatedName("client.Rc")
	public int mainOverlayId = -1;

	@ObfuscatedName("client.Qe")
	public int activeIcon = 3;

	@ObfuscatedName("client.yf")
	public final int[] sideIcon = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Gd")
	public int tutComId = -1;

	@ObfuscatedName("client.U")
	public String tutComMessage;

	@ObfuscatedName("client.eb")
	public int tutFlashIcon = -1;

	@ObfuscatedName("client.Ld")
	public int chatEffects;

	@ObfuscatedName("client.Ge")
	public int splitPrivateChat;

	@ObfuscatedName("client.gb")
	public int bankArrangeMode;

	@ObfuscatedName("client.cd")
	public boolean resumedPauseButton = false;

	@ObfuscatedName("client.Wh")
	public int staffmodlevel;

	@ObfuscatedName("client.wi")
	public int[] var = new int[2000];

	@ObfuscatedName("client.ji")
	public final IfType chatInterface = new IfType();

	@ObfuscatedName("client.pg")
	public int chatScrollPos;

	@ObfuscatedName("client.bh")
	public String chatInput = "";

	@ObfuscatedName("client.re")
	public final int[] chatType = new int[100];

	@ObfuscatedName("client.se")
	public final String[] chatUsername = new String[100];

	@ObfuscatedName("client.te")
	public final String[] chatText = new String[100];

	@ObfuscatedName("client.ob")
	public int chatPublicMode;

	@ObfuscatedName("client.oc")
	public int chatPrivateMode;

	@ObfuscatedName("client.Ch")
	public int chatTradeMode;

	@ObfuscatedName("client.Ei")
	public boolean socialInputOpen = false;

	@ObfuscatedName("client.we")
	public String socialInput = "";

	@ObfuscatedName("client.Zb")
	public int socialInputType;

	@ObfuscatedName("client.Vd")
	public boolean dialogInputOpen = false;

	@ObfuscatedName("client.eg")
	public String dialogInput = "";

	@ObfuscatedName("client.gd")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.ce")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.zi")
	public int reportAbuseComId = -1;

	@ObfuscatedName("client.Bf")
	public int minimapLevel = -1;

	@ObfuscatedName("client.Ec")
	public int minimapFlagX;

	@ObfuscatedName("client.Fc")
	public int minimapFlagZ;

	@ObfuscatedName("client.tb")
	public int minimapState;

	@ObfuscatedName("client.vf")
	public boolean midiActive = true;

	@ObfuscatedName("client.Yh")
	public int midiSong;

	@ObfuscatedName("client.Ed")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.of")
	public boolean waveEnabled = true;

	@ObfuscatedName("client.Jd")
	public int waveCount;

	@ObfuscatedName("client.rb")
	public final int[] waveIds = new int[50];

	@ObfuscatedName("client.ve")
	public final int[] waveLoops = new int[50];

	@ObfuscatedName("client.bi")
	public final int[] waveDelay = new int[50];

	@ObfuscatedName("client.tc")
	public int lastWaveId = -1;

	@ObfuscatedName("client.Lh")
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.Re")
	public int lastWaveLength;

	@ObfuscatedName("client.mf")
	public long lastWaveStartTime;

	@ObfuscatedName("client.ab")
	public boolean cinemaCam = false;

	@ObfuscatedName("client.ri")
	public final boolean[] camShake = new boolean[5];

	@ObfuscatedName("client.Rd")
	public final int[] camShakeAxis = new int[5];

	@ObfuscatedName("client.oi")
	public final int[] camShakeRan = new int[5];

	@ObfuscatedName("client.kd")
	public final int[] camShakeAmp = new int[5];

	@ObfuscatedName("client.qe")
	public final int[] camShakeCycle = new int[5];

	@ObfuscatedName("client.Eg")
	public int camMoveToLx;

	@ObfuscatedName("client.Fg")
	public int camMoveToLz;

	@ObfuscatedName("client.Gg")
	public int camMoveToHei;

	@ObfuscatedName("client.Hg")
	public int camMoveToRate;

	@ObfuscatedName("client.Ig")
	public int camMoveToRate2;

	@ObfuscatedName("client.ee")
	public int camLookAtLx;

	@ObfuscatedName("client.fe")
	public int camLookAtLz;

	@ObfuscatedName("client.ge")
	public int camLookAtHei;

	@ObfuscatedName("client.he")
	public int camLookAtRate;

	@ObfuscatedName("client.ie")
	public int camLookAtRate2;

	@ObfuscatedName("client.qg")
	public int friendCount;

	@ObfuscatedName("client.rg")
	public int friendServerStatus;

	@ObfuscatedName("client.hf")
	public String[] friendUsername = new String[200];

	@ObfuscatedName("client.Ud")
	public long[] friendUserhash = new long[200];

	@ObfuscatedName("client.nc")
	public int[] friendNodeId = new int[200];

	@ObfuscatedName("client.yd")
	public int ignoreCount;

	@ObfuscatedName("client.kj")
	public final long[] ignoreUserhash = new long[100];

	@ObfuscatedName("client.Nh")
	public boolean idkDesignGender = true;

	@ObfuscatedName("client.J")
	public boolean idkDesignRedraw = false;

	@ObfuscatedName("client.ub")
	public final int[] idkDesignPart = new int[7];

	@ObfuscatedName("client.fd")
	public final int[] idkDesignColour = new int[5];

	@ObfuscatedName("client.Oe")
	public Pix32 idkDesignButton1;

	@ObfuscatedName("client.Pe")
	public Pix32 idkDesignButton2;

	@ObfuscatedName("client.bb")
	public final byte field1251 = -83;

	@ObfuscatedName("client.db")
	public int field1253;

	@ObfuscatedName("client.fb")
	public int field1255;

	@ObfuscatedName("client.mb")
	public int mapBuildCentreZoneX;

	@ObfuscatedName("client.nb")
	public int mapBuildCentreZoneZ;

	@ObfuscatedName("client.wb")
	public final int[] field1272 = new int[Skills.count];

	@ObfuscatedName("client.cc")
	public final byte field1304 = -127;

	@ObfuscatedName("client.dc")
	public final byte field1305 = 38;

	@ObfuscatedName("client.ec")
	public int[][] field1306 = new int[104][104];

	@ObfuscatedName("client.fc")
	public boolean flamesThread = false;

	@ObfuscatedName("client.gc")
	public int field1308;

	@ObfuscatedName("client.hc")
	public int field1309;

	@ObfuscatedName("client.jc")
	public int field1311;

	@ObfuscatedName("client.kc")
	public Pix8 titlebox;

	@ObfuscatedName("client.lc")
	public Pix8 titlebutton;

	@ObfuscatedName("client.mc")
	public boolean flameThread = false;

	@ObfuscatedName("client.pc")
	public static boolean alreadystarted;

	@ObfuscatedName("client.rc")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.sc")
	public int field1320;

	@ObfuscatedName("client.qd")
	public static final byte field1370 = -48;

	@ObfuscatedName("client.zd")
	public static final int field1379 = 1;

	@ObfuscatedName("client.Zd")
	public static final int[] skillxp = new int[99];

	@ObfuscatedName("client.gf")
	public static final int[] recol2d;

	@ObfuscatedName("client.jf")
	public static final BigInteger field1466;

	@ObfuscatedName("client.Lf")
	public static final int[][] recol1d;

	@ObfuscatedName("client.Vg")
	public static final BigInteger field1556;

	@ObfuscatedName("client.ci")
	public static final byte field1615;

	@ObfuscatedName("client.cj")
	public static final int field1667;

	@ObfuscatedName("client.Y")
	public int[] field1248 = new int[1000];

	@ObfuscatedName("client.Z")
	public int[] field1249 = new int[1000];

	@ObfuscatedName("client.Ib")
	public boolean ingame = false;

	@ObfuscatedName("client.Rb")
	public Pix32[] field1293 = new Pix32[1000];

	@ObfuscatedName("client.Tb")
	public int scrollHeight = 78;

	@ObfuscatedName("client.vc")
	public final int field1323 = 70;

	@ObfuscatedName("client.Pc")
	public boolean jaggrabEnabled = false;

	@ObfuscatedName("client.Sc")
	public final byte field1346 = 1;

	@ObfuscatedName("client.pd")
	public final int field1369 = -587;

	@ObfuscatedName("client.rd")
	public final boolean field1371 = true;

	@ObfuscatedName("client.sd")
	public final CRC32 crc32 = new CRC32();

	@ObfuscatedName("client.Dd")
	public int field1383 = 817;

	@ObfuscatedName("client.Kd")
	public final int field1390 = -8033;

	@ObfuscatedName("client.Pd")
	public final int field1395 = 8;

	@ObfuscatedName("client.Qd")
	public int[][] field1396 = new int[104][104];

	@ObfuscatedName("client.Sd")
	public final byte field1398 = 8;

	@ObfuscatedName("client.ae")
	public final boolean field1406 = true;

	@ObfuscatedName("client.Ee")
	public final int field1436 = 100;

	@ObfuscatedName("client.Fe")
	public final int[] field1437 = new int[100];

	@ObfuscatedName("client.He")
	public final int[] field1439 = new int[256];

	@ObfuscatedName("client.Ie")
	public final int field1440 = 661;

	@ObfuscatedName("client.Je")
	public int[] field1441 = new int[4000];

	@ObfuscatedName("client.Ke")
	public int[] field1442 = new int[4000];

	@ObfuscatedName("client.Ne")
	public final int[] field1445 = new int[2000];

	@ObfuscatedName("client.Ye")
	public final int[] field1456 = new int[Skills.count];

	@ObfuscatedName("client.Ze")
	public boolean field1457 = true;

	@ObfuscatedName("client.ff")
	public final byte field1463 = -71;

	@ObfuscatedName("client.nf")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.pf")
	public final int[] field1472 = new int[9];

	@ObfuscatedName("client.rf")
	public final byte field1474 = 29;

	@ObfuscatedName("client.uf")
	public int field1477 = 513;

	@ObfuscatedName("client.Mf")
	public final int field1495 = -940;

	@ObfuscatedName("client.Yf")
	public final byte field1507 = 38;

	@ObfuscatedName("client.cg")
	public final int[] field1511 = new int[Skills.count];

	@ObfuscatedName("client.dg")
	public final int field1512 = 37395;

	@ObfuscatedName("client.kg")
	public final byte field1519 = 29;

	@ObfuscatedName("client.ng")
	public final byte field1522 = 6;

	@ObfuscatedName("client.og")
	public String socialInputHeader = "";

	@ObfuscatedName("client.zg")
	public int[][] field1534 = new int[104][104];

	@ObfuscatedName("client.Bg")
	public int field1536 = -1;

	@ObfuscatedName("client.ch")
	public final int[] field1563 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.hh")
	public final boolean field1568 = false;

	@ObfuscatedName("client.nh")
	public final int field1574 = -6002;

	@ObfuscatedName("client.qh")
	public boolean field1577 = false;

	@ObfuscatedName("client.sh")
	public final int field1579 = 50;

	@ObfuscatedName("client.th")
	public final int[] field1580 = new int[field1579];

	@ObfuscatedName("client.uh")
	public final int[] field1581 = new int[field1579];

	@ObfuscatedName("client.vh")
	public final int[] field1582 = new int[field1579];

	@ObfuscatedName("client.wh")
	public final int[] field1583 = new int[field1579];

	@ObfuscatedName("client.xh")
	public final int[] field1584 = new int[field1579];

	@ObfuscatedName("client.yh")
	public final int[] field1585 = new int[field1579];

	@ObfuscatedName("client.zh")
	public final int[] field1586 = new int[field1579];

	@ObfuscatedName("client.Ah")
	public final String[] field1587 = new String[field1579];

	@ObfuscatedName("client.Ih")
	public boolean flameActive = false;

	@ObfuscatedName("client.Mh")
	public boolean field1599 = true;

	@ObfuscatedName("client.Qh")
	public final byte field1603 = 2;

	@ObfuscatedName("client.Zh")
	public boolean midiFading = true;

	@ObfuscatedName("client.ki")
	public final int field1623 = 9;

	@ObfuscatedName("client.li")
	public final int[] field1624 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.qi")
	public final FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.vi")
	public final byte field1634 = 1;

	@ObfuscatedName("client.Gi")
	public final int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.Ti")
	public final boolean field1658 = false;

	@ObfuscatedName("client.Zi")
	public final int field1664 = 831;

	@ObfuscatedName("client.aj")
	public final int field1665 = 393;

	@ObfuscatedName("client.dj")
	public final int field1668 = -282;

	@ObfuscatedName("client.jj")
	public int chatComId = -1;

	@ObfuscatedName("client.sj")
	public boolean field1683 = false;

	@ObfuscatedName("client.W")
	public int field1246;

	@ObfuscatedName("client.X")
	public int field1247;

	@ObfuscatedName("client.Cb")
	public int field1278;

	@ObfuscatedName("client.Gb")
	public int field1282;

	@ObfuscatedName("client.uc")
	public int field1322;

	@ObfuscatedName("client.Cc")
	public int field1330;

	@ObfuscatedName("client.Vc")
	public int field1349;

	@ObfuscatedName("client.ad")
	public int field1354;

	@ObfuscatedName("client.dd")
	public int field1357;

	@ObfuscatedName("client.jd")
	public int nextMidiDelay;

	@ObfuscatedName("client.ld")
	public static int field1365;

	@ObfuscatedName("client.md")
	public int flameCycle;

	@ObfuscatedName("client.ud")
	public int field1374;

	@ObfuscatedName("client.vd")
	public int field1375;

	@ObfuscatedName("client.wd")
	public int field1376;

	@ObfuscatedName("client.Fd")
	public int field1385;

	@ObfuscatedName("client.Nd")
	public int field1393;

	@ObfuscatedName("client.Td")
	public int objDragCycle;

	@ObfuscatedName("client.ke")
	public int field1416;

	@ObfuscatedName("client.oe")
	public int field1420;

	@ObfuscatedName("client.Se")
	public static int field1450;

	@ObfuscatedName("client.Te")
	public int menuArea;

	@ObfuscatedName("client.Ue")
	public int field1452;

	@ObfuscatedName("client.Ve")
	public int field1453;

	@ObfuscatedName("client.We")
	public int field1454;

	@ObfuscatedName("client.Xe")
	public int field1455;

	@ObfuscatedName("client.af")
	public int field1458;

	@ObfuscatedName("client.bf")
	public int field1459;

	@ObfuscatedName("client.bg")
	public int field1510;

	@ObfuscatedName("client.jh")
	public int field1570;

	@ObfuscatedName("client.kh")
	public int field1571;

	@ObfuscatedName("client.mh")
	public int field1573;

	@ObfuscatedName("client.rh")
	public int field1578;

	@ObfuscatedName("client.Bh")
	public static int field1588;

	@ObfuscatedName("client.Jh")
	public static int field1596;

	@ObfuscatedName("client.Kh")
	public int field1597;

	@ObfuscatedName("client.Uh")
	public int field1607;

	@ObfuscatedName("client.Vh")
	public int field1608;

	@ObfuscatedName("client.mi")
	public static int field1625;

	@ObfuscatedName("client.ni")
	public int field1626;

	@ObfuscatedName("client.pi")
	public static int field1628;

	@ObfuscatedName("client.ui")
	public int field1633;

	@ObfuscatedName("client.Yi")
	public int field1663;

	@ObfuscatedName("client.ej")
	public int field1669;

	@ObfuscatedName("client.fj")
	public int field1670;

	@ObfuscatedName("client.gj")
	public int field1671;

	@ObfuscatedName("client.hj")
	public int field1672;

	@ObfuscatedName("client.ij")
	public int field1673;

	@ObfuscatedName("client.pj")
	public int field1680;

	@ObfuscatedName("client.qj")
	public int field1681;

	@ObfuscatedName("client.Id")
	public long field1388;

	@ObfuscatedName("client.Hj")
	public Pix32 flameLeft;

	@ObfuscatedName("client.Ij")
	public Pix32 flameRight;

	@ObfuscatedName("client.di")
	public PixMap field1616;

	@ObfuscatedName("client.gi")
	public PixMap field1619;

	@ObfuscatedName("client.wj")
	public PixMap field1687;

	@ObfuscatedName("client.xj")
	public PixMap field1688;

	@ObfuscatedName("client.Tc")
	public String field1347;

	@ObfuscatedName("client.zf")
	public static boolean field1482;

	@ObfuscatedName("client.Tg")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Ug")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Ai")
	public int[] flameGradient;

	@ObfuscatedName("client.Bi")
	public int[] flameGradient0;

	@ObfuscatedName("client.Ci")
	public int[] flameGradient1;

	@ObfuscatedName("client.Di")
	public int[] flameGradient2;

	@ObfuscatedName("client.Cj")
	public int[] flameBuffer3;

	@ObfuscatedName("client.Dj")
	public int[] flameBuffer2;

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			skillxp[var1] = var0 / 4;
		}
		recol2d = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		field1466 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		recol1d = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		readbit = new int[32];
		int var4 = 2;
		for (int var5 = 0; var5 < 32; var5++) {
			readbit[var5] = var4 - 1;
			var4 += var4;
		}
		field1556 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
		field1615 = 102;
		nodeId = 10;
		memServer = true;
		field1667 = 604;
	}

	@ObfuscatedName("client.u(B)V")
	public static void setLowMem(byte arg0) {
		World.lowMem = true;
		if (arg0 != 102) {
			for (int var1 = 1; var1 > 0; var1++) {
			}
		}
		Pix3D.lowMem = true;
		lowMem = true;
		ClientBuild.lowMem = true;
	}

	@ObfuscatedName("client.d(Z)V")
	public static void setHighMem() {
		World.lowMem = false;
		Pix3D.lowMem = false;
		lowMem = false;
		ClientBuild.lowMem = false;
	}

	@Override
	public AppletContext getAppletContext() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getAppletContext();
		}
		return super.getAppletContext();
	}

	@ObfuscatedName("client.e(I)Ljava/awt/Component;")
	@Override
	public Component getBaseComponent() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		}
		if (super.frame != null) {
			return super.frame;
		}
		return this;
	}

	@Override
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

	@ObfuscatedName("client.C(I)Ljava/lang/String;")
	public String getHost() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
		if (super.frame != null) {
			return "runescape.com";
		}
		return super.getDocumentBase().getHost().toLowerCase();
	}

	@Override
	public String getParameter(String arg0) {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getParameter(arg0);
		}
		return super.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	@Override
	public void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.l(I)Ljava/net/Socket;")
	public Socket openSocket(int arg0) throws IOException {
		if (signlink.mainapp != null) {
			return signlink.opensocket(arg0);
		}
		return new Socket(InetAddress.getByName(getCodeBase().getHost()), arg0);
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream openUrl(String arg0) throws IOException {
		if (jaggrabEnabled) {
			if (jaggrabSocket != null) {
				try {
					jaggrabSocket.close();
				} catch (Exception var4) {
				}
				jaggrabSocket = null;
			}
			jaggrabSocket = openSocket(43595);
			jaggrabSocket.setSoTimeout(10000);
			InputStream var2 = jaggrabSocket.getInputStream();
			OutputStream var3 = jaggrabSocket.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}
		if (signlink.mainapp != null) {
			return signlink.openurl(arg0);
		}
		return new DataInputStream((new URL(getCodeBase(), arg0)).openStream());
	}

	@ObfuscatedName("client.a(B[BZ)V")
	public void saveMidi(byte[] arg0, boolean arg1) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg0, arg0.length);
	}

	@ObfuscatedName("client.a(ZIZ)V")
	public void setMidiVolume(int arg0, boolean arg1) {
		signlink.midivol = arg0;
		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.g(I)V")
	public void stopMidi() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.n(B)Z")
	public boolean replayWave() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ZI)V")
	public void setWaveVolume(boolean arg0, int arg1) {
		if (!arg0) {
			ptype = in.g1();
		}
		signlink.wavevol = arg1;
	}

	public static void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 289);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMem(field1615);
				} else if (arg0[2].equals("highmem")) {
					setHighMem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					memServer = false;
				} else if (arg0[3].equals("members")) {
					memServer = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(503, 765, 0);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@Override
	public void init() {
		nodeId = Integer.parseInt(getParameter("nodeid"));
		portOffset = Integer.parseInt(getParameter("portoff"));
		String var1 = getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem(field1615);
		} else {
			setHighMem();
		}
		String var2 = getParameter("free");
		if (var2 != null && var2.equals("1")) {
			memServer = false;
		} else {
			memServer = true;
		}
		initApplet();
	}

	@ObfuscatedName("client.a()V")
	@Override
	public void maininit() {
		drawProgress(20, "Starting up");
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (alreadystarted) {
			errorStarted = true;
			return;
		}
		alreadystarted = true;
		boolean var1 = false;
		String var2 = getHost();
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.246")) {
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
		if (var2.endsWith("192.168.1.242")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			errorHost = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				fileStreams[var3] = new FileStream(signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1, (byte) 4);
			}
		}
		try {
			getJagChecksums(field1370);
			title = getJagFile("title screen", 1, "title", 25, field1472[1]);
			p11 = new PixFont(9, "p11_full", false, title);
			p12 = new PixFont(9, "p12_full", false, title);
			b12 = new PixFont(9, "b12_full", false, title);
			q8 = new PixFont(9, "q8_full", true, title);
			loadTitleBackground();
			loadTitleImages();
			JagFile var4 = getJagFile("config", 2, "config", 30, field1472[2]);
			JagFile var5 = getJagFile("interface", 3, "interface", 35, field1472[3]);
			JagFile var6 = getJagFile("2d graphics", 4, "media", 40, field1472[4]);
			JagFile var7 = getJagFile("textures", 6, "textures", 45, field1472[6]);
			JagFile var8 = getJagFile("chat system", 7, "wordenc", 50, field1472[7]);
			JagFile var9 = getJagFile("sound effects", 8, "sounds", 55, field1472[8]);
			mapl = new byte[4][104][104];
			groundh = new int[4][105][105];
			world = new World(104, 4, groundh, 104, field1667);
			for (int var10 = 0; var10 < 4; var10++) {
				collision[var10] = new CollisionMap(99, 104, 104);
			}
			minimap = new Pix32(512, 512);
			JagFile var11 = getJagFile("update list", 5, "versionlist", 60, field1472[5]);
			drawProgress(60, "Connecting to update server");
			onDemand = new OnDemand();
			onDemand.init(var11, this);
			AnimFrame.init(onDemand.getAnimFrameCount());
			Model.init(onDemand.getFileCount(0), onDemand);
			if (!lowMem) {
				midiSong = 0;
				try {
					midiSong = Integer.parseInt(getParameter("music"));
				} catch (Exception var70) {
				}
				midiFading = true;
				onDemand.request(2, midiSong);
				while (onDemand.remaining() > 0) {
					onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var69) {
					}
					if (onDemand.failCount > 3) {
						showLoadError("ondemand");
						return;
					}
				}
			}
			drawProgress(65, "Requesting animations");
			int var12 = onDemand.getFileCount(1);
			for (int var13 = 0; var13 < var12; var13++) {
				onDemand.request(1, var13);
			}
			while (onDemand.remaining() > 0) {
				int var14 = var12 - onDemand.remaining();
				if (var14 > 0) {
					drawProgress(65, "Loading animations - " + var14 * 100 / var12 + "%");
				}
				onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var68) {
				}
				if (onDemand.failCount > 3) {
					showLoadError("ondemand");
					return;
				}
			}
			drawProgress(70, "Requesting models");
			int var15 = onDemand.getFileCount(0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = onDemand.getModelUse(var16);
				if ((var17 & 0x1) != 0) {
					onDemand.request(0, var16);
				}
			}
			int var18 = onDemand.remaining();
			while (onDemand.remaining() > 0) {
				int var19 = var18 - onDemand.remaining();
				if (var19 > 0) {
					drawProgress(70, "Loading models - " + var19 * 100 / var18 + "%");
				}
				onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var67) {
				}
			}
			if (fileStreams[0] != null) {
				drawProgress(75, "Requesting maps");
				onDemand.request(3, onDemand.getMapFile(48, 47, 0));
				onDemand.request(3, onDemand.getMapFile(48, 47, 1));
				onDemand.request(3, onDemand.getMapFile(48, 48, 0));
				onDemand.request(3, onDemand.getMapFile(48, 48, 1));
				onDemand.request(3, onDemand.getMapFile(48, 49, 0));
				onDemand.request(3, onDemand.getMapFile(48, 49, 1));
				onDemand.request(3, onDemand.getMapFile(47, 47, 0));
				onDemand.request(3, onDemand.getMapFile(47, 47, 1));
				onDemand.request(3, onDemand.getMapFile(47, 48, 0));
				onDemand.request(3, onDemand.getMapFile(47, 48, 1));
				onDemand.request(3, onDemand.getMapFile(148, 48, 0));
				onDemand.request(3, onDemand.getMapFile(148, 48, 1));
				int var20 = onDemand.remaining();
				while (onDemand.remaining() > 0) {
					int var21 = var20 - onDemand.remaining();
					if (var21 > 0) {
						drawProgress(75, "Loading maps - " + var21 * 100 / var20 + "%");
					}
					onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var66) {
					}
				}
			}
			int var22 = onDemand.getFileCount(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = onDemand.getModelUse(var23);
				byte var25 = 0;
				if ((var24 & 0x8) != 0) {
					var25 = 10;
				} else if ((var24 & 0x20) != 0) {
					var25 = 9;
				} else if ((var24 & 0x10) != 0) {
					var25 = 8;
				} else if ((var24 & 0x40) != 0) {
					var25 = 7;
				} else if ((var24 & 0x80) != 0) {
					var25 = 6;
				} else if ((var24 & 0x2) != 0) {
					var25 = 5;
				} else if ((var24 & 0x4) != 0) {
					var25 = 4;
				}
				if ((var24 & 0x1) != 0) {
					var25 = 3;
				}
				if (var25 != 0) {
					onDemand.prefetchPriority(0, var25, var23);
				}
			}
			onDemand.prefetchMaps(memServer);
			if (!lowMem) {
				int var26 = onDemand.getFileCount(2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (onDemand.method276(var27)) {
						onDemand.prefetchPriority(2, (byte) 1, var27);
					}
				}
			}
			drawProgress(80, "Unpacking media");
			invback = new Pix8(var6, "invback", 0);
			chatback = new Pix8(var6, "chatback", 0);
			mapback = new Pix8(var6, "mapback", 0);
			backbase1 = new Pix8(var6, "backbase1", 0);
			backbase2 = new Pix8(var6, "backbase2", 0);
			backhmid1 = new Pix8(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				sideicons[var28] = new Pix8(var6, "sideicons", var28);
			}
			compass = new Pix32(var6, "compass", 0);
			mapedge = new Pix32(var6, "mapedge", 0);
			mapedge.trim();
			try {
				for (int var29 = 0; var29 < 100; var29++) {
					mapscene[var29] = new Pix8(var6, "mapscene", var29);
				}
			} catch (Exception var74) {
			}
			try {
				for (int var30 = 0; var30 < 100; var30++) {
					mapfunction[var30] = new Pix32(var6, "mapfunction", var30);
				}
			} catch (Exception var73) {
			}
			try {
				for (int var31 = 0; var31 < 20; var31++) {
					hitmarks[var31] = new Pix32(var6, "hitmarks", var31);
				}
			} catch (Exception var72) {
			}
			try {
				for (int var32 = 0; var32 < 20; var32++) {
					headicons[var32] = new Pix32(var6, "headicons", var32);
				}
			} catch (Exception var71) {
			}
			mapmarker0 = new Pix32(var6, "mapmarker", 0);
			mapmarker1 = new Pix32(var6, "mapmarker", 1);
			for (int var33 = 0; var33 < 8; var33++) {
				cross[var33] = new Pix32(var6, "cross", var33);
			}
			mapdots0 = new Pix32(var6, "mapdots", 0);
			mapdots1 = new Pix32(var6, "mapdots", 1);
			mapdots2 = new Pix32(var6, "mapdots", 2);
			mapdots3 = new Pix32(var6, "mapdots", 3);
			scrollbar0 = new Pix8(var6, "scrollbar", 0);
			scrollbar1 = new Pix8(var6, "scrollbar", 1);
			redstone1 = new Pix8(var6, "redstone1", 0);
			redstone2 = new Pix8(var6, "redstone2", 0);
			redstone3 = new Pix8(var6, "redstone3", 0);
			redstone1h = new Pix8(var6, "redstone1", 0);
			redstone1h.hflip();
			redstone2h = new Pix8(var6, "redstone2", 0);
			redstone2h.hflip();
			redstone1v = new Pix8(var6, "redstone1", 0);
			redstone1v.vflip();
			redstone2v = new Pix8(var6, "redstone2", 0);
			redstone2v.vflip();
			redstone3v = new Pix8(var6, "redstone3", 0);
			redstone3v.vflip();
			redstone1hv = new Pix8(var6, "redstone1", 0);
			redstone1hv.hflip();
			redstone1hv.vflip();
			redstone2hv = new Pix8(var6, "redstone2", 0);
			redstone2hv.hflip();
			redstone2hv.vflip();
			for (int var34 = 0; var34 < 2; var34++) {
				modIcons[var34] = new Pix8(var6, "mod_icons", var34);
			}
			Pix32 var35 = new Pix32(var6, "backleft1", 0);
			areaBackleft1 = new PixMap(getBaseComponent(), var35.wi, var35.hi, 2);
			var35.quickPlotSprite(0, 0);
			Pix32 var36 = new Pix32(var6, "backleft2", 0);
			areaBackleft2 = new PixMap(getBaseComponent(), var36.wi, var36.hi, 2);
			var36.quickPlotSprite(0, 0);
			Pix32 var37 = new Pix32(var6, "backright1", 0);
			areaBackright1 = new PixMap(getBaseComponent(), var37.wi, var37.hi, 2);
			var37.quickPlotSprite(0, 0);
			Pix32 var38 = new Pix32(var6, "backright2", 0);
			areaBackright2 = new PixMap(getBaseComponent(), var38.wi, var38.hi, 2);
			var38.quickPlotSprite(0, 0);
			Pix32 var39 = new Pix32(var6, "backtop1", 0);
			areaBacktop1 = new PixMap(getBaseComponent(), var39.wi, var39.hi, 2);
			var39.quickPlotSprite(0, 0);
			Pix32 var40 = new Pix32(var6, "backvmid1", 0);
			areaBackvmid1 = new PixMap(getBaseComponent(), var40.wi, var40.hi, 2);
			var40.quickPlotSprite(0, 0);
			Pix32 var41 = new Pix32(var6, "backvmid2", 0);
			areaBackvmid2 = new PixMap(getBaseComponent(), var41.wi, var41.hi, 2);
			var41.quickPlotSprite(0, 0);
			Pix32 var42 = new Pix32(var6, "backvmid3", 0);
			areaBackvmid3 = new PixMap(getBaseComponent(), var42.wi, var42.hi, 2);
			var42.quickPlotSprite(0, 0);
			Pix32 var43 = new Pix32(var6, "backhmid2", 0);
			areaBackhmid2 = new PixMap(getBaseComponent(), var43.wi, var43.hi, 2);
			var43.quickPlotSprite(0, 0);
			int var44 = (int) (Math.random() * 21.0D) - 10;
			int var45 = (int) (Math.random() * 21.0D) - 10;
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 41.0D) - 20;
			for (int var48 = 0; var48 < 100; var48++) {
				if (mapfunction[var48] != null) {
					mapfunction[var48].rgbAdjust(var44 + var47, var45 + var47, var46 + var47);
				}
				if (mapscene[var48] != null) {
					mapscene[var48].rgbAdjust(var44 + var47, var45 + var47, var46 + var47);
				}
			}
			drawProgress(83, "Unpacking textures");
			Pix3D.unpackTextures(var7, field1482);
			Pix3D.initColourTable(0.8D);
			Pix3D.initPool();
			drawProgress(86, "Unpacking config");
			SeqType.init(var4);
			LocType.init(var4);
			FloType.init(var4);
			ObjType.init(var4);
			NpcType.init(var4);
			IdkType.init(var4);
			SpotType.init(var4);
			VarpType.init(var4);
			VarbitType.init(var4);
			ObjType.memServer = memServer;
			if (!lowMem) {
				drawProgress(90, "Unpacking sounds");
				byte[] var49 = var9.read("sounds.dat", null);
				Packet var50 = new Packet(var49, 15787);
				JagFX.init(var50);
			}
			drawProgress(95, "Unpacking interfaces");
			PixFont[] var51 = new PixFont[] { p11, p12, b12, q8 };
			IfType.unpack(var51, var6, var5);
			drawProgress(100, "Preparing game engine");
			for (int var52 = 0; var52 < 33; var52++) {
				int var53 = 999;
				int var54 = 0;
				for (int var55 = 0; var55 < 34; var55++) {
					if (mapback.data[var55 + var52 * mapback.wi] == 0) {
						if (var53 == 999) {
							var53 = var55;
						}
					} else if (var53 != 999) {
						var54 = var55;
						break;
					}
				}
				compassMaskLineOffsets[var52] = var53;
				compassMaskLineLengths[var52] = var54 - var53;
			}
			for (int var56 = 5; var56 < 156; var56++) {
				int var57 = 999;
				int var58 = 0;
				for (int var59 = 25; var59 < 172; var59++) {
					if (mapback.data[var59 + var56 * mapback.wi] == 0 && (var59 > 34 || var56 > 34)) {
						if (var57 == 999) {
							var57 = var59;
						}
					} else if (var57 != 999) {
						var58 = var59;
						break;
					}
				}
				minimapMaskLineOffsets[var56 - 5] = var57 - 25;
				minimapMaskLineLengths[var56 - 5] = var58 - var57;
			}
			Pix3D.setClipping(96, 479);
			chatScanline = Pix3D.scanline;
			Pix3D.setClipping(261, 190);
			sideScanline = Pix3D.scanline;
			Pix3D.setClipping(334, 512);
			gameScanline = Pix3D.scanline;
			int[] var60 = new int[9];
			for (int var61 = 0; var61 < 9; var61++) {
				int var62 = var61 * 32 + 128 + 15;
				int var63 = var62 * 3 + 600;
				int var64 = Pix3D.sinTable[var62];
				var60[var61] = var63 * var64 >> 16;
			}
			World.resetVisCalc(var60);
			WordFilter.unpack(var8);
			mouseTracking = new MouseTracking(228, this);
			startThread(mouseTracking, 10);
			ClientLocAnim.app = this;
		} catch (Exception var75) {
			signlink.reporterror("loaderror " + field1347 + " " + field1597);
			errorLoading = true;
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void mainloop() {
		if (errorStarted || errorLoading || errorHost) {
			return;
		}
		loopCycle++;
		if (ingame) {
			gameLoop(field1477);
		} else {
			titleScreenLoop();
		}
		onDemandLoop();
	}

	@ObfuscatedName("client.a(B)V")
	@Override
	public void mainredraw() {
		if (errorStarted || errorLoading || errorHost) {
			drawError();
			return;
		}
		field1596++;
		if (ingame) {
			gameDraw();
		} else {
			titleScreenDraw(false);
		}
		scrollCycle = 0;
	}

	@ObfuscatedName("client.a(Z)V")
	@Override
	public void refresh() {
		redrawFrame = true;
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void mainquit() {
		signlink.reporterror = false;
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var1) {
		}
		stream = null;
		stopMidi();
		if (mouseTracking != null) {
			mouseTracking.active = false;
		}
		mouseTracking = null;
		onDemand.stop();
		onDemand = null;
		out = null;
		loginout = null;
		in = null;
		mapBuildIndex = null;
		mapBuildGroundData = null;
		mapBuildLocationData = null;
		mapBuildGroundFile = null;
		mapBuildLocationFile = null;
		groundh = null;
		mapl = null;
		world = null;
		collision = null;
		field1534 = null;
		field1396 = null;
		field1441 = null;
		field1442 = null;
		textureBuffer = null;
		field1616 = null;
		areaMap = null;
		areaGame = null;
		field1619 = null;
		areaBackbase1 = null;
		areaBackbase2 = null;
		areaBackhmid1 = null;
		areaBackleft1 = null;
		areaBackleft2 = null;
		areaBackright1 = null;
		areaBackright2 = null;
		areaBacktop1 = null;
		areaBackvmid1 = null;
		areaBackvmid2 = null;
		areaBackvmid3 = null;
		areaBackhmid2 = null;
		invback = null;
		mapback = null;
		chatback = null;
		backbase1 = null;
		backbase2 = null;
		backhmid1 = null;
		sideicons = null;
		redstone1 = null;
		redstone2 = null;
		redstone3 = null;
		redstone1h = null;
		redstone2h = null;
		redstone1v = null;
		redstone2v = null;
		redstone3v = null;
		redstone1hv = null;
		redstone2hv = null;
		compass = null;
		hitmarks = null;
		headicons = null;
		cross = null;
		mapdots0 = null;
		mapdots1 = null;
		mapdots2 = null;
		mapdots3 = null;
		mapscene = null;
		mapfunction = null;
		field1306 = null;
		players = null;
		playerIds = null;
		entityUpdateIds = null;
		playerAppearanceBuffer = null;
		entityRemovalIds = null;
		npc = null;
		npcIds = null;
		groundObj = null;
		locChanges = null;
		projectiles = null;
		spotanims = null;
		menuParamB = null;
		menuParamC = null;
		menuAction = null;
		menuParamA = null;
		menuOption = null;
		var = null;
		field1248 = null;
		field1249 = null;
		field1293 = null;
		minimap = null;
		friendUsername = null;
		friendUserhash = null;
		friendNodeId = null;
		field1687 = null;
		field1688 = null;
		imageTitle2 = null;
		imageTitle3 = null;
		imageTitle4 = null;
		imageTitle5 = null;
		imageTitle6 = null;
		imageTitle7 = null;
		imageTitle8 = null;
		unloadTitle();
		LocType.unload();
		NpcType.unload();
		ObjType.unload();
		FloType.list = null;
		IdkType.list = null;
		IfType.list = null;
		UnkType.list = null;
		SeqType.list = null;
		SpotType.list = null;
		SpotType.modelCache = null;
		VarpType.list = null;
		super.drawArea = null;
		ClientPlayer.modelCache = null;
		Pix3D.unload();
		World.unload();
		Model.unload();
		AnimFrame.unload();
		System.gc();
	}

	@ObfuscatedName("client.a(ZILjava/lang/String;)V")
	@Override
	public void drawProgress(int arg0, String arg1) {
		field1597 = arg0;
		field1347 = arg1;
		prepareTitle();
		if (title == null) {
			super.drawProgress(arg0, arg1);
			return;
		}
		imageTitle4.setPixels();
		b12.centreStringTag(180, "RuneScape is loading - please wait...", 16777215, 54);
		Pix2D.drawRect(28, 304, 9179409, 62, 34);
		Pix2D.drawRect(29, 302, 0, 63, 32);
		Pix2D.fillRect(9179409, 64, 30, 30, arg0 * 3);
		Pix2D.fillRect(0, 64, 30, arg0 * 3 + 30, 300 - arg0 * 3);
		b12.centreStringTag(180, arg1, 16777215, 85);
		imageTitle4.draw(202, 171, super.graphics);
		if (redrawFrame) {
			redrawFrame = false;
			if (!flameActive) {
				field1687.draw(0, 0, super.graphics);
				field1688.draw(637, 0, super.graphics);
			}
			imageTitle2.draw(128, 0, super.graphics);
			imageTitle3.draw(202, 371, super.graphics);
			imageTitle5.draw(0, 265, super.graphics);
			imageTitle6.draw(562, 265, super.graphics);
			imageTitle7.draw(128, 171, super.graphics);
			imageTitle8.draw(562, 171, super.graphics);
		}
	}

	@ObfuscatedName("client.s(I)V")
	public void drawError() {
		Graphics var1 = getBaseComponent().getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		setFramerate();
		if (errorLoading) {
			flameActive = false;
			var1.setFont(new Font("Helvetica", 1, 16));
			var1.setColor(Color.yellow);
			byte var2 = 35;
			var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
			int var4 = var2 + 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, 85);
			int var5 = var4 + 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
			int var6 = var5 + 30;
			var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
			int var7 = var6 + 30;
			var1.drawString("3: Try using a different game-world", 30, 195);
			int var9 = var7 + 30;
			var1.drawString("4: Try rebooting your computer", 30, 225);
			int var11 = var9 + 30;
			var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
		}
		if (errorHost) {
			flameActive = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}
		if (errorStarted) {
			flameActive = false;
			var1.setColor(Color.yellow);
			byte var3 = 35;
			var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
			int var8 = var3 + 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, 85);
			int var10 = var8 + 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
			int var12 = var10 + 30;
			var1.drawString("2: Try rebooting your computer, and reloading", 30, 165);
			int var13 = var12 + 30;
		}
	}

	@ObfuscatedName("client.e(B)V")
	public void getJagChecksums(byte arg0) {
		int var2 = 5;
		field1472[8] = 0;
		if (arg0 != -48) {
			ptype = in.g1();
		}
		int var3 = 0;
		while (field1472[8] == 0) {
			String var4 = "Unknown problem";
			drawProgress(20, "Connecting to web server");
			try {
				DataInputStream var5 = openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 289);
				Packet var6 = new Packet(new byte[40], 15787);
				var5.readFully(var6.data, 0, 40);
				var5.close();
				for (int var7 = 0; var7 < 9; var7++) {
					field1472[var7] = var6.g4();
				}
				int var8 = var6.g4();
				int var9 = 1234;
				for (int var10 = 0; var10 < 9; var10++) {
					var9 = (var9 << 1) + field1472[var10];
				}
				if (var8 != var9) {
					var4 = "checksum problem";
					field1472[8] = 0;
				}
			} catch (EOFException var13) {
				var4 = "EOF problem";
				field1472[8] = 0;
			} catch (IOException var14) {
				var4 = "connection problem";
				field1472[8] = 0;
			} catch (Exception var15) {
				var4 = "logic problem";
				field1472[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}
			if (field1472[8] == 0) {
				var3++;
				for (int var11 = var2; var11 > 0; var11--) {
					if (var3 >= 10) {
						drawProgress(10, "Game updated - please reload page");
						var11 = 10;
					} else {
						drawProgress(10, var4 + " - Will retry in " + var11 + " secs.");
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var12) {
					}
				}
				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}
				jaggrabEnabled = !jaggrabEnabled;
			}
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;ILjava/lang/String;II)Lxb;")
	public JagFile getJagFile(String arg0, int arg1, String arg2, int arg3, int arg4) {
		byte[] var6 = null;
		int var7 = 5;
		try {
			if (fileStreams[0] != null) {
				var6 = fileStreams[0].readFromFile(arg1);
			}
		} catch (Exception var28) {
		}
		if (var6 != null) {
			crc32.reset();
			crc32.update(var6);
			int var8 = (int) crc32.getValue();
			if (var8 != arg4) {
				var6 = null;
			}
		}
		if (var6 != null) {
			return new JagFile(var6, 0);
		}
		int var10 = 0;
		while (var6 == null) {
			String var11 = "Unknown error";
			drawProgress(arg3, "Requesting " + arg0);
			try {
				int var12 = 0;
				DataInputStream var13 = openUrl(arg2 + arg4);
				byte[] var14 = new byte[6];
				var13.readFully(var14, 0, 6);
				Packet var15 = new Packet(var14, 15787);
				var15.pos = 3;
				int var16 = var15.g3() + 6;
				int var17 = 6;
				var6 = new byte[var16];
				for (int var18 = 0; var18 < 6; var18++) {
					var6[var18] = var14[var18];
				}
				while (var17 < var16) {
					int var19 = var16 - var17;
					if (var19 > 1000) {
						var19 = 1000;
					}
					int var20 = var13.read(var6, var17, var19);
					if (var20 < 0) {
						(new StringBuffer("Length error: ")).append(var17).append("/").append(var16).toString();
						throw new IOException("EOF");
					}
					var17 += var20;
					int var21 = var17 * 100 / var16;
					if (var21 != var12) {
						drawProgress(arg3, "Loading " + arg0 + " - " + var21 + "%");
					}
					var12 = var21;
				}
				var13.close();
				try {
					if (fileStreams[0] != null) {
						fileStreams[0].writeToFile(var6, var6.length, arg1);
					}
				} catch (Exception var27) {
					fileStreams[0] = null;
				}
				if (var6 != null) {
					crc32.reset();
					crc32.update(var6);
					int var22 = (int) crc32.getValue();
					if (var22 != arg4) {
						var6 = null;
						var10++;
						var11 = "Checksum error: " + var22;
					}
				}
			} catch (IOException var29) {
				if (var11.equals("Unknown error")) {
					var11 = "Connection error";
				}
				var6 = null;
			} catch (NullPointerException var30) {
				var11 = "Null error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var31) {
				var11 = "Bounds error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var32) {
				var11 = "Unexpected error";
				var6 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var6 == null) {
				for (int var24 = var7; var24 > 0; var24--) {
					if (var10 >= 3) {
						drawProgress(arg3, "Game updated - please reload page");
						var24 = 10;
					} else {
						drawProgress(arg3, var11 + " - Retrying in " + var24);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var26) {
					}
				}
				var7 *= 2;
				if (var7 > 60) {
					var7 = 60;
				}
				jaggrabEnabled = !jaggrabEnabled;
			}
		}
		return new JagFile(var6, 0);
	}

	@ObfuscatedName("client.e(Z)V")
	public void onDemandLoop() {
		while (true) {
			OnDemandRequest var1 = onDemand.loop();
			if (var1 == null) {
				return;
			}
			if (var1.archive == 0) {
				Model.unpack(var1.data, var1.file);
				if ((onDemand.getModelUse(var1.file) & 0x62) != 0) {
					redrawSidebar = true;
					if (chatComId != -1) {
						redrawChatback = true;
					}
				}
			}
			if (var1.archive == 1 && var1.data != null) {
				AnimFrame.unpack(var1.data);
			}
			if (var1.archive == 2 && var1.file == midiSong && var1.data != null) {
				saveMidi(var1.data, midiFading);
			}
			if (var1.archive == 3 && sceneState == 1) {
				for (int var2 = 0; var2 < mapBuildGroundData.length; var2++) {
					if (mapBuildGroundFile[var2] == var1.file) {
						mapBuildGroundData[var2] = var1.data;
						if (var1.data == null) {
							mapBuildGroundFile[var2] = -1;
						}
						break;
					}
					if (mapBuildLocationFile[var2] == var1.file) {
						mapBuildLocationData[var2] = var1.data;
						if (var1.data == null) {
							mapBuildLocationFile[var2] = -1;
						}
						break;
					}
				}
			}
			if (var1.archive == 93 && onDemand.hasMapLocFile(var1.file, field1278)) {
				ClientBuild.prefetchLocations(onDemand, new Packet(var1.data, 15787), field1668);
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public void showLoadError(String arg0) {
		System.out.println(arg0);
		try {
			getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	@ObfuscatedName("client.p(B)V")
	public void titleScreenLoop() {
		if (loginscreen == 0) {
			int var1 = super.sHei / 2 - 80;
			int var2 = super.sWid / 2 + 20;
			int var13 = var2 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var1 - 75 && super.mouseClickX <= var1 + 75 && super.mouseClickY >= var13 - 20 && super.mouseClickY <= var13 + 20) {
				loginscreen = 3;
				loginSelect = 0;
			}
			int var3 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var3 - 75 && super.mouseClickX <= var3 + 75 && super.mouseClickY >= var13 - 20 && super.mouseClickY <= var13 + 20) {
				loginMes1 = "";
				loginMes2 = "Enter your username & password.";
				loginscreen = 2;
				loginSelect = 0;
			}
		} else if (loginscreen == 2) {
			int var4 = super.sWid / 2 - 40;
			int var14 = var4 + 30;
			int var15 = var14 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var15 - 15 && super.mouseClickY < var15) {
				loginSelect = 0;
			}
			var4 = var15 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var4 - 15 && super.mouseClickY < var4) {
				loginSelect = 1;
			}
			var4 += 15;
			int var5 = super.sHei / 2 - 80;
			int var6 = super.sWid / 2 + 50;
			int var16 = var6 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var5 - 75 && super.mouseClickX <= var5 + 75 && super.mouseClickY >= var16 - 20 && super.mouseClickY <= var16 + 20) {
				login(loginUser, loginPass, false);
				if (ingame) {
					return;
				}
			}
			int var7 = super.sHei / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var7 - 75 && super.mouseClickX <= var7 + 75 && super.mouseClickY >= var16 - 20 && super.mouseClickY <= var16 + 20) {
				loginscreen = 0;
				loginUser = "";
				loginPass = "";
			}
			while (true) {
				while (true) {
					int var8 = pollKey();
					if (var8 == -1) {
						return;
					}
					boolean var9 = false;
					for (int var10 = 0; var10 < CHARSET.length(); var10++) {
						if (var8 == CHARSET.charAt(var10)) {
							var9 = true;
							break;
						}
					}
					if (loginSelect == 0) {
						if (var8 == 8 && loginUser.length() > 0) {
							loginUser = loginUser.substring(0, loginUser.length() - 1);
						}
						if (var8 == 9 || var8 == 10 || var8 == 13) {
							loginSelect = 1;
						}
						if (var9) {
							loginUser = loginUser + (char) var8;
						}
						if (loginUser.length() > 12) {
							loginUser = loginUser.substring(0, 12);
						}
					} else if (loginSelect == 1) {
						if (var8 == 8 && loginPass.length() > 0) {
							loginPass = loginPass.substring(0, loginPass.length() - 1);
						}
						if (var8 == 9 || var8 == 10 || var8 == 13) {
							loginSelect = 0;
						}
						if (var9) {
							loginPass = loginPass + (char) var8;
						}
						if (loginPass.length() > 20) {
							loginPass = loginPass.substring(0, 20);
						}
					}
				}
			}
		} else if (loginscreen == 3) {
			int var11 = super.sHei / 2;
			int var12 = super.sWid / 2 + 50;
			int var17 = var12 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var11 - 75 && super.mouseClickX <= var11 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				loginscreen = 0;
			}
		}
	}

	@ObfuscatedName("client.a(BZ)V")
	public void titleScreenDraw(boolean arg0) {
		prepareTitle();
		imageTitle4.setPixels();
		titlebox.plotSprite(0, field1634, 0);
		if (loginscreen == 0) {
			p11.centreString(true, 7711145, 180, onDemand.message, 180);
			byte var2 = 80;
			b12.centreString(true, 16776960, 180, "Welcome to RuneScape", 80);
			int var5 = var2 + 30;
			titlebutton.plotSprite(100, field1634, 27);
			b12.centreString(true, 16777215, 100, "New User", 125);
			titlebutton.plotSprite(100, field1634, 187);
			b12.centreString(true, 16777215, 260, "Existing User", 125);
		}
		if (loginscreen == 2) {
			byte var3 = 60;
			int var6;
			if (loginMes1.length() > 0) {
				b12.centreString(true, 16776960, 180, loginMes1, 45);
				b12.centreString(true, 16776960, 180, loginMes2, 60);
				var6 = var3 + 30;
			} else {
				b12.centreString(true, 16776960, 180, loginMes2, 53);
				var6 = var3 + 30;
			}
			b12.drawStringTag(16777215, 90, true, 90, "Username: " + loginUser + (loginSelect == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			b12.drawStringTag(16777215, 105, true, 92, "Password: " + JString.getRepeatedCharacter(loginPass) + (loginSelect == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var6 += 15;
			if (!arg0) {
				titlebutton.plotSprite(130, field1634, 27);
				b12.centreString(true, 16777215, 100, "Login", 155);
				titlebutton.plotSprite(130, field1634, 187);
				b12.centreString(true, 16777215, 260, "Cancel", 155);
			}
		}
		if (loginscreen == 3) {
			b12.centreString(true, 16776960, 180, "Create a free account", 40);
			byte var4 = 65;
			b12.centreString(true, 16777215, 180, "To create a new account you need to", 65);
			int var7 = var4 + 15;
			b12.centreString(true, 16777215, 180, "go back to the main RuneScape webpage", 80);
			int var8 = var7 + 15;
			b12.centreString(true, 16777215, 180, "and choose the red 'create account'", 95);
			int var9 = var8 + 15;
			b12.centreString(true, 16777215, 180, "button at the top right of that page.", 110);
			int var10 = var9 + 15;
			titlebutton.plotSprite(130, field1634, 107);
			b12.centreString(true, 16777215, 180, "Cancel", 155);
		}
		imageTitle4.draw(202, 171, super.graphics);
		if (redrawFrame) {
			redrawFrame = false;
			imageTitle2.draw(128, 0, super.graphics);
			imageTitle3.draw(202, 371, super.graphics);
			imageTitle5.draw(0, 265, super.graphics);
			imageTitle6.draw(562, 265, super.graphics);
			imageTitle7.draw(128, 171, super.graphics);
			imageTitle8.draw(562, 171, super.graphics);
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void prepareTitle() {
		if (imageTitle2 != null) {
			return;
		}
		super.drawArea = null;
		field1619 = null;
		areaMap = null;
		field1616 = null;
		areaGame = null;
		areaBackbase1 = null;
		areaBackbase2 = null;
		areaBackhmid1 = null;
		field1687 = new PixMap(getBaseComponent(), 128, 265, 2);
		Pix2D.cls();
		field1688 = new PixMap(getBaseComponent(), 128, 265, 2);
		Pix2D.cls();
		imageTitle2 = new PixMap(getBaseComponent(), 509, 171, 2);
		Pix2D.cls();
		imageTitle3 = new PixMap(getBaseComponent(), 360, 132, 2);
		Pix2D.cls();
		imageTitle4 = new PixMap(getBaseComponent(), 360, 200, 2);
		Pix2D.cls();
		imageTitle5 = new PixMap(getBaseComponent(), 202, 238, 2);
		Pix2D.cls();
		imageTitle6 = new PixMap(getBaseComponent(), 203, 238, 2);
		Pix2D.cls();
		imageTitle7 = new PixMap(getBaseComponent(), 74, 94, 2);
		Pix2D.cls();
		imageTitle8 = new PixMap(getBaseComponent(), 75, 94, 2);
		Pix2D.cls();
		if (title != null) {
			loadTitleBackground();
			loadTitleImages();
		}
		redrawFrame = true;
	}

	@ObfuscatedName("client.x(I)V")
	public void loadTitleBackground() {
		byte[] var1 = title.read("title.dat", null);
		Pix32 var2 = new Pix32(var1, this);
		field1687.setPixels();
		var2.quickPlotSprite(0, 0);
		field1688.setPixels();
		var2.quickPlotSprite(-637, 0);
		imageTitle2.setPixels();
		var2.quickPlotSprite(-128, 0);
		imageTitle3.setPixels();
		var2.quickPlotSprite(-202, -371);
		imageTitle4.setPixels();
		var2.quickPlotSprite(-202, -171);
		imageTitle5.setPixels();
		var2.quickPlotSprite(0, -265);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-562, -265);
		imageTitle7.setPixels();
		var2.quickPlotSprite(-128, -171);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-562, -171);
		int[] var3 = new int[var2.wi];
		for (int var4 = 0; var4 < var2.hi; var4++) {
			for (int var5 = 0; var5 < var2.wi; var5++) {
				var3[var5] = var2.data[var2.wi + var2.wi * var4 - var5 - 1];
			}
			for (int var6 = 0; var6 < var2.wi; var6++) {
				var2.data[var6 + var2.wi * var4] = var3[var6];
			}
		}
		field1687.setPixels();
		var2.quickPlotSprite(382, 0);
		field1688.setPixels();
		var2.quickPlotSprite(-255, 0);
		imageTitle2.setPixels();
		var2.quickPlotSprite(254, 0);
		imageTitle3.setPixels();
		var2.quickPlotSprite(180, -371);
		imageTitle4.setPixels();
		var2.quickPlotSprite(180, -171);
		imageTitle5.setPixels();
		var2.quickPlotSprite(382, -265);
		imageTitle6.setPixels();
		var2.quickPlotSprite(-180, -265);
		imageTitle7.setPixels();
		var2.quickPlotSprite(254, -171);
		imageTitle8.setPixels();
		var2.quickPlotSprite(-180, -171);
		Pix32 var7 = new Pix32(title, "logo", 0);
		imageTitle2.setPixels();
		var7.plotSprite(18, field1634, 382 - var7.wi / 2 - 128);
		System.gc();
	}

	@ObfuscatedName("client.q(I)V")
	public void loadTitleImages() {
		titlebox = new Pix8(title, "titlebox", 0);
		titlebutton = new Pix8(title, "titlebutton", 0);
		runes = new Pix8[12];
		int var1 = 0;
		try {
			var1 = Integer.parseInt(getParameter("fl_icon"));
		} catch (Exception var18) {
		}
		if (var1 == 0) {
			for (int var2 = 0; var2 < 12; var2++) {
				runes[var2] = new Pix8(title, "runes", var2);
			}
		} else {
			for (int var3 = 0; var3 < 12; var3++) {
				runes[var3] = new Pix8(title, "runes", (var3 & 0x3) + 12);
			}
		}
		flameLeft = new Pix32(128, 265);
		flameRight = new Pix32(128, 265);
		for (int var4 = 0; var4 < 33920; var4++) {
			flameLeft.data[var4] = field1687.data[var4];
		}
		for (int var5 = 0; var5 < 33920; var5++) {
			flameRight.data[var5] = field1688.data[var5];
		}
		flameGradient0 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			flameGradient0[var6] = var6 * 262144;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			flameGradient0[var7 + 64] = var7 * 1024 + 16711680;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			flameGradient0[var8 + 128] = var8 * 4 + 16776960;
		}
		for (int var9 = 0; var9 < 64; var9++) {
			flameGradient0[var9 + 192] = 16777215;
		}
		flameGradient1 = new int[256];
		for (int var10 = 0; var10 < 64; var10++) {
			flameGradient1[var10] = var10 * 1024;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			flameGradient1[var11 + 64] = var11 * 4 + 65280;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			flameGradient1[var12 + 128] = var12 * 262144 + 65535;
		}
		for (int var13 = 0; var13 < 64; var13++) {
			flameGradient1[var13 + 192] = 16777215;
		}
		flameGradient2 = new int[256];
		for (int var14 = 0; var14 < 64; var14++) {
			flameGradient2[var14] = var14 * 4;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			flameGradient2[var15 + 64] = var15 * 262144 + 255;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			flameGradient2[var16 + 128] = var16 * 1024 + 16711935;
		}
		for (int var17 = 0; var17 < 64; var17++) {
			flameGradient2[var17 + 192] = 16777215;
		}
		flameGradient = new int[256];
		flameBuffer0 = new int[32768];
		flameBuffer1 = new int[32768];
		generateFlameCoolingMap(null);
		flameBuffer3 = new int[32768];
		flameBuffer2 = new int[32768];
		drawProgress(10, "Connecting to fileserver");
		if (!flameActive) {
			flamesThread = true;
			flameActive = true;
			startThread(this, 2);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				loginMes1 = "";
				loginMes2 = "Connecting to server...";
				titleScreenDraw(true);
			}
			stream = new ClientStream(openSocket(portOffset + 43594), 32596, this);
			long var4 = JString.toUserhash(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			out.pos = 0;
			out.p1(14);
			out.p1(var6);
			stream.write(out.data, 2);
			for (int var7 = 0; var7 < 8; var7++) {
				stream.read();
			}
			int var8 = stream.read();
			if (var8 == 0) {
				stream.read(in.data, 0, 8);
				in.pos = 0;
				loginSeed = in.g8();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (loginSeed >> 32), (int) loginSeed };
				out.pos = 0;
				out.p1(10);
				out.p4(var9[0]);
				out.p4(var9[1]);
				out.p4(var9[2]);
				out.p4(var9[3]);
				out.p4(signlink.uid);
				out.pjstr(arg0);
				out.pjstr(arg1);
				out.rsaenc(field1556, field1466);
				loginout.pos = 0;
				if (arg2) {
					loginout.p1(18);
				} else {
					loginout.p1(16);
				}
				loginout.p1(out.pos + 36 + 1 + 1 + 2);
				loginout.p1(255);
				loginout.p2(289);
				loginout.p1(lowMem ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					loginout.p4(field1472[var10]);
				}
				loginout.pdata(out.data, out.pos);
				out.random = new Isaac(var9, (byte) -23);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				randomIn = new Isaac(var9, (byte) -23);
				stream.write(loginout.data, loginout.pos);
				var8 = stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}
				login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				staffmodlevel = stream.read();
				mouseTracked = stream.read() == 1;
				prevMouseClickTime = 0L;
				mouseTrackedDelta = 0;
				mouseTracking.length = 0;
				super.focus = true;
				focusIn = true;
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				logoutTimer = 0;
				hintType = 0;
				menuNumEntries = 0;
				isMenuOpen = false;
				super.idleTimer = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					chatText[var12] = null;
				}
				useMode = 0;
				targetMode = 0;
				sceneState = 0;
				waveCount = 0;
				macroCameraX = (int) (Math.random() * 100.0D) - 50;
				macroCameraZ = (int) (Math.random() * 110.0D) - 55;
				macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
				macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
				macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
				orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				minimapState = 0;
				minimapLevel = -1;
				minimapFlagX = 0;
				minimapFlagZ = 0;
				playerCount = 0;
				npcCount = 0;
				for (int var13 = 0; var13 < MAX_PLAYER_COUNT; var13++) {
					players[var13] = null;
					playerAppearanceBuffer[var13] = null;
				}
				for (int var14 = 0; var14 < 16384; var14++) {
					npc[var14] = null;
				}
				localPlayer = players[LOCAL_PLAYER_INDEX] = new ClientPlayer();
				projectiles.clear();
				spotanims.clear();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							groundObj[var15][var16][var17] = null;
						}
					}
				}
				locChanges = new LinkList(-199);
				friendServerStatus = 0;
				friendCount = 0;
				tutComId = -1;
				chatComId = -1;
				mainModalId = -1;
				sideModalId = -1;
				mainOverlayId = -1;
				resumedPauseButton = false;
				activeIcon = 3;
				dialogInputOpen = false;
				isMenuOpen = false;
				socialInputOpen = false;
				tutComMessage = null;
				inMultizone = 0;
				tutFlashIcon = -1;
				idkDesignGender = true;
				validateIdkDesign(field1304);
				for (int var18 = 0; var18 < 5; var18++) {
					idkDesignColour[var18] = 0;
				}
				for (int var19 = 0; var19 < 5; var19++) {
					playerOp[var19] = null;
					playerOpPriority[var19] = false;
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
				prepareGame();
			} else if (var8 == 3) {
				loginMes1 = "";
				loginMes2 = "Invalid username or password.";
			} else if (var8 == 4) {
				loginMes1 = "Your account has been disabled.";
				loginMes2 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				loginMes1 = "Your account is already logged in.";
				loginMes2 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				loginMes1 = "RuneScape has been updated!";
				loginMes2 = "Please reload this page.";
			} else if (var8 == 7) {
				loginMes1 = "This world is full.";
				loginMes2 = "Please use a different world.";
			} else if (var8 == 8) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Login server offline.";
			} else if (var8 == 9) {
				loginMes1 = "Login limit exceeded.";
				loginMes2 = "Too many connections from your address.";
			} else if (var8 == 10) {
				loginMes1 = "Unable to connect.";
				loginMes2 = "Bad session id.";
			} else if (var8 == 11) {
				loginMes2 = "Login server rejected session.";
				loginMes2 = "Please try again.";
			} else if (var8 == 12) {
				loginMes1 = "You need a members account to login to this world.";
				loginMes2 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				loginMes1 = "Could not complete login.";
				loginMes2 = "Please try using a different world.";
			} else if (var8 == 14) {
				loginMes1 = "The server is being updated.";
				loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				ingame = true;
				out.pos = 0;
				in.pos = 0;
				ptype = -1;
				ptype0 = -1;
				ptype1 = -1;
				ptype2 = -1;
				psize = 0;
				timeoutTimer = 0;
				rebootTimer = 0;
				menuNumEntries = 0;
				isMenuOpen = false;
				sceneLoadStartTime = System.currentTimeMillis();
			} else if (var8 == 16) {
				loginMes1 = "Login attempts exceeded.";
				loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				loginMes1 = "You are standing in a members-only area.";
				loginMes2 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				loginMes1 = "Invalid loginserver requested";
				loginMes2 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = stream.read(); var20 >= 0; var20--) {
					loginMes1 = "You have only just left another world";
					loginMes2 = "Your profile will be transferred in: " + var20 + " seconds";
					titleScreenDraw(true);
					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}
				login(arg0, arg1, arg2);
			} else if (var8 == -1) {
				loginMes1 = "No response from server";
				loginMes2 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				loginMes1 = "Unexpected server response";
				loginMes2 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			loginMes1 = "";
			loginMes2 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void unloadTitle() {
		flameActive = false;
		while (flameThread) {
			flameActive = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		titlebox = null;
		titlebutton = null;
		runes = null;
		flameGradient = null;
		flameGradient0 = null;
		flameGradient1 = null;
		flameGradient2 = null;
		flameBuffer0 = null;
		flameBuffer1 = null;
		flameBuffer3 = null;
		flameBuffer2 = null;
		flameLeft = null;
		flameRight = null;
	}

	@ObfuscatedName("client.u(I)V")
	public void prepareGame() {
		if (field1619 != null) {
			return;
		}
		unloadTitle();
		super.drawArea = null;
		imageTitle2 = null;
		imageTitle3 = null;
		imageTitle4 = null;
		field1687 = null;
		field1688 = null;
		imageTitle5 = null;
		imageTitle6 = null;
		imageTitle7 = null;
		imageTitle8 = null;
		field1619 = new PixMap(getBaseComponent(), 479, 96, 2);
		areaMap = new PixMap(getBaseComponent(), 172, 156, 2);
		Pix2D.cls();
		mapback.plotSprite(0, field1634, 0);
		field1616 = new PixMap(getBaseComponent(), 190, 261, 2);
		areaGame = new PixMap(getBaseComponent(), 512, 334, 2);
		Pix2D.cls();
		areaBackbase1 = new PixMap(getBaseComponent(), 496, 50, 2);
		areaBackbase2 = new PixMap(getBaseComponent(), 269, 37, 2);
		areaBackhmid1 = new PixMap(getBaseComponent(), 249, 45, 2);
		redrawFrame = true;
	}

	@ObfuscatedName("client.t(I)V")
	public void gameLoop(int arg0) {
		if (rebootTimer > 1) {
			rebootTimer--;
		}
		if (logoutTimer > 0) {
			logoutTimer--;
		}
		for (int var2 = 0; var2 < 5 && tcpIn(); var2++) {
		}
		if (ingame) {
			Object var3 = mouseTracking.lock;
			synchronized (mouseTracking.lock) {
				if (!mouseTracked) {
					mouseTracking.length = 0;
				} else if (super.mouseClickButton != 0 || mouseTracking.length >= 40) {
					out.p1enc(229);
					out.p1(0);
					int var4 = out.pos;
					int var5 = 0;
					for (int var6 = 0; var6 < mouseTracking.length && var4 - out.pos < 240; var6++) {
						var5++;
						int var7 = mouseTracking.y[var6];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 502) {
							var7 = 502;
						}
						int var8 = mouseTracking.x[var6];
						if (var8 < 0) {
							var8 = 0;
						} else if (var8 > 764) {
							var8 = 764;
						}
						int var9 = var7 * 765 + var8;
						if (mouseTracking.y[var6] == -1 && mouseTracking.x[var6] == -1) {
							var8 = -1;
							var7 = -1;
							var9 = 524287;
						}
						if (var8 != field1308 || var7 != field1309) {
							int var10 = var8 - field1308;
							field1308 = var8;
							int var11 = var7 - field1309;
							field1309 = var7;
							if (mouseTrackedDelta < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
								var10 += 32;
								var11 += 32;
								out.p2((mouseTrackedDelta << 12) + (var10 << 6) + var11);
								mouseTrackedDelta = 0;
							} else if (mouseTrackedDelta < 8) {
								out.p3((mouseTrackedDelta << 19) + var9 + 0x800000);
								mouseTrackedDelta = 0;
							} else {
								out.p4((mouseTrackedDelta << 19) + var9 - 0x40000000);
								mouseTrackedDelta = 0;
							}
						} else if (mouseTrackedDelta < 2047) {
							mouseTrackedDelta++;
						}
					}
					out.psize1(out.pos - var4, field1573);
					if (var5 >= mouseTracking.length) {
						mouseTracking.length = 0;
					} else {
						mouseTracking.length -= var5;
						for (int var12 = 0; var12 < mouseTracking.length; var12++) {
							mouseTracking.x[var12] = mouseTracking.x[var12 + var5];
							mouseTracking.y[var12] = mouseTracking.y[var12 + var5];
						}
					}
				}
			}
			if (super.mouseClickButton != 0) {
				long var13 = (super.mouseClickTime - prevMouseClickTime) / 50L;
				if (var13 > 4095L) {
					var13 = 4095L;
				}
				prevMouseClickTime = super.mouseClickTime;
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
				out.p1enc(224);
				out.p4((var19 << 20) + (var18 << 19) + var17);
			}
			if (sendCameraDelay > 0) {
				sendCameraDelay--;
			}
			if (super.keyHeld[1] == 1 || super.keyHeld[2] == 1 || super.keyHeld[3] == 1 || super.keyHeld[4] == 1) {
				sendCamera = true;
			}
			if (sendCamera && sendCameraDelay <= 0) {
				sendCameraDelay = 20;
				sendCamera = false;
				out.p1enc(193);
				out.p2(orbitCameraPitch);
				out.p2(orbitCameraYaw);
			}
			if (super.focus && !focusIn) {
				focusIn = true;
				out.p1enc(149);
				out.p1(1);
			}
			if (!super.focus && focusIn) {
				focusIn = false;
				out.p1enc(149);
				out.p1(0);
			}
			checkMinimap();
			locChangeDoQueue();
			soundsDoQueue();
			timeoutTimer++;
			if (timeoutTimer > 750) {
				lostCon();
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
			if (selectedArea != 0) {
				selectedCycle++;
				if (selectedCycle >= 15) {
					if (selectedArea == 2) {
						redrawSidebar = true;
					}
					if (selectedArea == 3) {
						redrawChatback = true;
					}
					selectedArea = 0;
				}
			}
			if (objDragArea != 0) {
				objDragCycle++;
				if (super.mouseX > objGrabX + 5 || super.mouseX < objGrabX - 5 || super.mouseY > objGrabY + 5 || super.mouseY < objGrabY - 5) {
					objGrabThreshold = true;
				}
				if (super.mouseButton == 0) {
					if (objDragArea == 2) {
						redrawSidebar = true;
					}
					if (objDragArea == 3) {
						redrawChatback = true;
					}
					objDragArea = 0;
					if (objGrabThreshold && objDragCycle >= 5) {
						hoveredSlotComId = -1;
						buildMinimenu();
						if (hoveredSlotComId == objDragComId && hoveredSlot != objDragSlot) {
							IfType var20 = IfType.list[objDragComId];
							byte var21 = 0;
							if (bankArrangeMode == 1 && var20.clientCode == 206) {
								var21 = 1;
							}
							if (var20.linkObjType[hoveredSlot] <= 0) {
								var21 = 0;
							}
							if (var20.objReplace) {
								int var22 = objDragSlot;
								int var23 = hoveredSlot;
								var20.linkObjType[var23] = var20.linkObjType[var22];
								var20.linkObjNumber[var23] = var20.linkObjNumber[var22];
								var20.linkObjType[var22] = -1;
								var20.linkObjNumber[var22] = 0;
							} else if (var21 == 1) {
								int var24 = objDragSlot;
								int var25 = hoveredSlot;
								while (var24 != var25) {
									if (var24 > var25) {
										var20.swapSlots(var24 - 1, var24);
										var24--;
									} else if (var24 < var25) {
										var20.swapSlots(var24 + 1, var24);
										var24++;
									}
								}
							} else {
								var20.swapSlots(hoveredSlot, objDragSlot);
							}
							out.p1enc(253);
							out.p2(objDragComId);
							out.p2(objDragSlot);
							out.p2(hoveredSlot);
							out.p1(var21);
						}
					} else if ((oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
						openMenu(field1320);
					} else if (menuNumEntries > 0) {
						doAction(menuNumEntries - 1);
					}
					selectedCycle = 10;
					super.mouseClickButton = 0;
				}
			}
			cyclelogic7++;
			if (cyclelogic7 > 62) {
				cyclelogic7 = 0;
				out.p1enc(232);
			}
			if (World.groundX != -1) {
				int var26 = World.groundX;
				int var27 = World.groundZ;
				boolean var28 = tryMove(0, localPlayer.routeX[0], 0, var27, 0, 0, true, 0, 0, var26, localPlayer.routeZ[0]);
				World.groundX = -1;
				if (var28) {
					crossX = super.mouseClickX;
					crossY = super.mouseClickY;
					crossMode = 1;
					crossCycle = 0;
				}
			}
			if (super.mouseClickButton == 1 && tutComMessage != null) {
				tutComMessage = null;
				redrawChatback = true;
				super.mouseClickButton = 0;
			}
			mouseLoop();
			minimapLoop();
			iconLoop();
			if (arg0 <= 0) {
				out.p1(98);
			}
			chatModeLoop();
			if (super.mouseButton == 1 || super.mouseClickButton == 1) {
				scrollCycle++;
			}
			if (sceneState == 2) {
				followCamera();
			}
			if (sceneState == 2 && cinemaCam) {
				cinemaCamera();
			}
			for (int var29 = 0; var29 < 5; var29++) {
				int var10002 = camShakeCycle[var29]++;
			}
			handleInputKey(field1495);
			super.idleTimer++;
			if (super.idleTimer > 4500) {
				logoutTimer = 250;
				super.idleTimer -= 500;
				out.p1enc(145);
			}
			macroCameraCycle++;
			if (macroCameraCycle > 500) {
				macroCameraCycle = 0;
				int var30 = (int) (Math.random() * 8.0D);
				if ((var30 & 0x1) == 0x1) {
					macroCameraX += macroCameraXModifier;
				}
				if ((var30 & 0x2) == 0x2) {
					macroCameraZ += macroCameraZModifier;
				}
				if ((var30 & 0x4) == 0x4) {
					macroCameraAngle += macroCameraAngleModifier;
				}
			}
			if (macroCameraX < -50) {
				macroCameraXModifier = 2;
			}
			if (macroCameraX > 50) {
				macroCameraXModifier = -2;
			}
			if (macroCameraZ < -55) {
				macroCameraZModifier = 2;
			}
			if (macroCameraZ > 55) {
				macroCameraZModifier = -2;
			}
			if (macroCameraAngle < -40) {
				macroCameraAngleModifier = 1;
			}
			if (macroCameraAngle > 40) {
				macroCameraAngleModifier = -1;
			}
			macroMinimapCycle++;
			if (macroMinimapCycle > 500) {
				macroMinimapCycle = 0;
				int var31 = (int) (Math.random() * 8.0D);
				if ((var31 & 0x1) == 0x1) {
					macroMinimapAngle += macroMinimapAngleModifier;
				}
				if ((var31 & 0x2) == 0x2) {
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
				out.p1enc(181);
			}
			try {
				if (stream != null && out.pos > 0) {
					stream.write(out.data, out.pos);
					out.pos = 0;
					noTimeoutTimer = 0;
				}
			} catch (IOException var33) {
				lostCon();
			} catch (Exception var34) {
				logout();
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void gameDraw() {
		if (redrawFrame) {
			redrawFrame = false;
			areaBackleft1.draw(0, 4, super.graphics);
			areaBackleft2.draw(0, 357, super.graphics);
			areaBackright1.draw(722, 4, super.graphics);
			areaBackright2.draw(743, 205, super.graphics);
			areaBacktop1.draw(0, 0, super.graphics);
			areaBackvmid1.draw(516, 4, super.graphics);
			areaBackvmid2.draw(516, 205, super.graphics);
			areaBackvmid3.draw(496, 357, super.graphics);
			areaBackhmid2.draw(0, 338, super.graphics);
			redrawSidebar = true;
			redrawChatback = true;
			redrawIcons = true;
			redrawChatMode = true;
			if (sceneState != 2) {
				areaGame.draw(4, 4, super.graphics);
				areaMap.draw(550, 4, super.graphics);
			}
		}
		if (sceneState == 2) {
			gameDrawMain();
		}
		if (isMenuOpen && menuArea == 1) {
			redrawSidebar = true;
		}
		if (sideModalId != -1) {
			boolean var1 = animateInterface(worldUpdateNum, sideModalId);
			if (var1) {
				redrawSidebar = true;
			}
		}
		if (selectedArea == 2) {
			redrawSidebar = true;
		}
		if (objDragArea == 2) {
			redrawSidebar = true;
		}
		if (redrawSidebar) {
			drawSide();
			redrawSidebar = false;
		}
		if (chatComId == -1) {
			chatInterface.scrollPos = scrollHeight - chatScrollPos - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				doScrollbar(0, super.mouseX - 17, chatInterface, 463, false, 77, field1251, super.mouseY - 357, scrollHeight);
			}
			int var2 = scrollHeight - chatInterface.scrollPos - 77;
			if (var2 < 0) {
				var2 = 0;
			}
			if (var2 > scrollHeight - 77) {
				var2 = scrollHeight - 77;
			}
			if (chatScrollPos != var2) {
				chatScrollPos = var2;
				redrawChatback = true;
			}
		}
		if (chatComId != -1) {
			boolean var3 = animateInterface(worldUpdateNum, chatComId);
			if (var3) {
				redrawChatback = true;
			}
		}
		if (selectedArea == 3) {
			redrawChatback = true;
		}
		if (objDragArea == 3) {
			redrawChatback = true;
		}
		if (tutComMessage != null) {
			redrawChatback = true;
		}
		if (isMenuOpen && menuArea == 2) {
			redrawChatback = true;
		}
		if (redrawChatback) {
			drawChat();
			redrawChatback = false;
		}
		if (sceneState == 2) {
			minimapDraw();
			areaMap.draw(550, 4, super.graphics);
		}
		if (tutFlashIcon != -1) {
			redrawIcons = true;
		}
		if (redrawIcons) {
			if (tutFlashIcon != -1 && tutFlashIcon == activeIcon) {
				tutFlashIcon = -1;
				out.p1enc(146);
				out.p1(activeIcon);
			}
			redrawIcons = false;
			areaBackhmid1.setPixels();
			backhmid1.plotSprite(0, field1634, 0);
			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 0) {
						redstone1.plotSprite(10, field1634, 22);
					}
					if (activeIcon == 1) {
						redstone2.plotSprite(8, field1634, 54);
					}
					if (activeIcon == 2) {
						redstone2.plotSprite(8, field1634, 82);
					}
					if (activeIcon == 3) {
						redstone3.plotSprite(8, field1634, 110);
					}
					if (activeIcon == 4) {
						redstone2h.plotSprite(8, field1634, 153);
					}
					if (activeIcon == 5) {
						redstone2h.plotSprite(8, field1634, 181);
					}
					if (activeIcon == 6) {
						redstone1h.plotSprite(9, field1634, 209);
					}
				}
				if (sideIcon[0] != -1 && (tutFlashIcon != 0 || loopCycle % 20 < 10)) {
					sideicons[0].plotSprite(13, field1634, 29);
				}
				if (sideIcon[1] != -1 && (tutFlashIcon != 1 || loopCycle % 20 < 10)) {
					sideicons[1].plotSprite(11, field1634, 53);
				}
				if (sideIcon[2] != -1 && (tutFlashIcon != 2 || loopCycle % 20 < 10)) {
					sideicons[2].plotSprite(11, field1634, 82);
				}
				if (sideIcon[3] != -1 && (tutFlashIcon != 3 || loopCycle % 20 < 10)) {
					sideicons[3].plotSprite(12, field1634, 115);
				}
				if (sideIcon[4] != -1 && (tutFlashIcon != 4 || loopCycle % 20 < 10)) {
					sideicons[4].plotSprite(13, field1634, 153);
				}
				if (sideIcon[5] != -1 && (tutFlashIcon != 5 || loopCycle % 20 < 10)) {
					sideicons[5].plotSprite(11, field1634, 180);
				}
				if (sideIcon[6] != -1 && (tutFlashIcon != 6 || loopCycle % 20 < 10)) {
					sideicons[6].plotSprite(13, field1634, 208);
				}
			}
			areaBackhmid1.draw(516, 160, super.graphics);
			areaBackbase2.setPixels();
			backbase2.plotSprite(0, field1634, 0);
			if (sideModalId == -1) {
				if (sideIcon[activeIcon] != -1) {
					if (activeIcon == 7) {
						redstone1v.plotSprite(0, field1634, 42);
					}
					if (activeIcon == 8) {
						redstone2v.plotSprite(0, field1634, 74);
					}
					if (activeIcon == 9) {
						redstone2v.plotSprite(0, field1634, 102);
					}
					if (activeIcon == 10) {
						redstone3v.plotSprite(1, field1634, 130);
					}
					if (activeIcon == 11) {
						redstone2hv.plotSprite(0, field1634, 173);
					}
					if (activeIcon == 12) {
						redstone2hv.plotSprite(0, field1634, 201);
					}
					if (activeIcon == 13) {
						redstone1hv.plotSprite(0, field1634, 229);
					}
				}
				if (sideIcon[8] != -1 && (tutFlashIcon != 8 || loopCycle % 20 < 10)) {
					sideicons[7].plotSprite(2, field1634, 74);
				}
				if (sideIcon[9] != -1 && (tutFlashIcon != 9 || loopCycle % 20 < 10)) {
					sideicons[8].plotSprite(3, field1634, 102);
				}
				if (sideIcon[10] != -1 && (tutFlashIcon != 10 || loopCycle % 20 < 10)) {
					sideicons[9].plotSprite(4, field1634, 137);
				}
				if (sideIcon[11] != -1 && (tutFlashIcon != 11 || loopCycle % 20 < 10)) {
					sideicons[10].plotSprite(2, field1634, 174);
				}
				if (sideIcon[12] != -1 && (tutFlashIcon != 12 || loopCycle % 20 < 10)) {
					sideicons[11].plotSprite(2, field1634, 201);
				}
				if (sideIcon[13] != -1 && (tutFlashIcon != 13 || loopCycle % 20 < 10)) {
					sideicons[12].plotSprite(2, field1634, 226);
				}
			}
			areaBackbase2.draw(496, 466, super.graphics);
			areaGame.setPixels();
		}
		if (redrawChatMode) {
			redrawChatMode = false;
			areaBackbase1.setPixels();
			backbase1.plotSprite(0, field1634, 0);
			p12.centreString(true, 16777215, 55, "Public chat", 28);
			if (chatPublicMode == 0) {
				p12.centreString(true, 65280, 55, "On", 41);
			}
			if (chatPublicMode == 1) {
				p12.centreString(true, 16776960, 55, "Friends", 41);
			}
			if (chatPublicMode == 2) {
				p12.centreString(true, 16711680, 55, "Off", 41);
			}
			if (chatPublicMode == 3) {
				p12.centreString(true, 65535, 55, "Hide", 41);
			}
			p12.centreString(true, 16777215, 184, "Private chat", 28);
			if (chatPrivateMode == 0) {
				p12.centreString(true, 65280, 184, "On", 41);
			}
			if (chatPrivateMode == 1) {
				p12.centreString(true, 16776960, 184, "Friends", 41);
			}
			if (chatPrivateMode == 2) {
				p12.centreString(true, 16711680, 184, "Off", 41);
			}
			p12.centreString(true, 16777215, 324, "Trade/compete", 28);
			if (chatTradeMode == 0) {
				p12.centreString(true, 65280, 324, "On", 41);
			}
			if (chatTradeMode == 1) {
				p12.centreString(true, 16776960, 324, "Friends", 41);
			}
			if (chatTradeMode == 2) {
				p12.centreString(true, 16711680, 324, "Off", 41);
			}
			p12.centreString(true, 16777215, 458, "Report abuse", 33);
			areaBackbase1.draw(0, 453, super.graphics);
			areaGame.setPixels();
		}
		worldUpdateNum = 0;
	}

	@ObfuscatedName("client.c(B)V")
	public void logout() {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (Exception var2) {
		}
		stream = null;
		ingame = false;
		loginscreen = 0;
		loginUser = "";
		loginPass = "";
		clearCaches(field1463);
		world.resetMap();
		for (int var1 = 0; var1 < 4; var1++) {
			collision[var1].reset();
		}
		System.gc();
		stopMidi();
		nextMidiSong = -1;
		midiSong = -1;
		nextMidiDelay = 0;
	}

	@ObfuscatedName("client.m(B)V")
	public void clearCaches(byte arg0) {
		LocType.mc1.clear();
		LocType.mc2.clear();
		if (arg0 != -71) {
			field1477 = randomIn.takeNextValue();
		}
		NpcType.modelCache.clear();
		ObjType.modelcache.clear();
		ObjType.spriteCache.clear();
		ClientPlayer.modelCache.clear();
		SpotType.modelCache.clear();
	}

	@ObfuscatedName("client.q(B)V")
	public void lostCon() {
		if (logoutTimer > 0) {
			logout();
			return;
		}
		areaGame.setPixels();
		p12.centreStringTag(257, "Connection lost", 0, 144);
		p12.centreStringTag(256, "Connection lost", 16777215, 143);
		p12.centreStringTag(257, "Please wait - attempting to reestablish", 0, 159);
		p12.centreStringTag(256, "Please wait - attempting to reestablish", 16777215, 158);
		areaGame.draw(4, 4, super.graphics);
		minimapState = 0;
		minimapFlagX = 0;
		ClientStream var1 = stream;
		ingame = false;
		login(loginUser, loginPass, true);
		if (!ingame) {
			logout();
		}
		try {
			var1.close();
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public boolean saveWave(byte[] arg0, int arg1) {
		if (arg0 == null) {
			return true;
		}
		return signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.j(B)V")
	public void buildMinimenu() {
		if (objDragArea != 0) {
			return;
		}
		menuOption[0] = "Cancel";
		menuAction[0] = 1106;
		menuNumEntries = 1;
		addPrivateChatOptions();
		field1246 = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (mainModalId == -1) {
				addWorldOptions();
			} else {
				addComponentOptions(4, 0, super.mouseX, IfType.list[mainModalId], 4, super.mouseY);
			}
		}
		if (field1246 != field1420) {
			field1420 = field1246;
		}
		field1246 = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (sideModalId != -1) {
				addComponentOptions(553, 0, super.mouseX, IfType.list[sideModalId], 205, super.mouseY);
			} else if (sideIcon[activeIcon] != -1) {
				addComponentOptions(553, 0, super.mouseX, IfType.list[sideIcon[activeIcon]], 205, super.mouseY);
			}
		}
		if (field1246 != field1354) {
			redrawSidebar = true;
			field1354 = field1246;
		}
		field1246 = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
			if (chatComId != -1) {
				addComponentOptions(17, 0, super.mouseX, IfType.list[chatComId], 357, super.mouseY);
			} else if (super.mouseY < 434 && super.mouseX < 426) {
				addChatOptions(super.mouseX - 17, super.mouseY - 357);
			}
		}
		if (chatComId != -1 && field1246 != field1633) {
			redrawChatback = true;
			field1633 = field1246;
		}
		boolean var1 = false;
		while (!var1) {
			var1 = true;
			for (int var2 = 0; var2 < menuNumEntries - 1; var2++) {
				if (menuAction[var2] < 1000 && menuAction[var2 + 1] > 1000) {
					String var3 = menuOption[var2];
					menuOption[var2] = menuOption[var2 + 1];
					menuOption[var2 + 1] = var3;
					int var4 = menuAction[var2];
					menuAction[var2] = menuAction[var2 + 1];
					menuAction[var2 + 1] = var4;
					int var5 = menuParamB[var2];
					menuParamB[var2] = menuParamB[var2 + 1];
					menuParamB[var2 + 1] = var5;
					int var6 = menuParamC[var2];
					menuParamC[var2] = menuParamC[var2 + 1];
					menuParamC[var2 + 1] = var6;
					int var7 = menuParamA[var2];
					menuParamA[var2] = menuParamA[var2 + 1];
					menuParamA[var2 + 1] = var7;
					var1 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public void addPrivateChatOptions() {
		if (splitPrivateChat == 0) {
			return;
		}
		int var1 = 0;
		if (rebootTimer != 0) {
			var1 = 1;
		}
		for (int var2 = 0; var2 < 100; var2++) {
			if (chatText[var2] != null) {
				int var3 = chatType[var2];
				String var4 = chatUsername[var2];
				if (var4 != null && var4.startsWith("@cr1@")) {
					var4 = var4.substring(5);
				}
				if (var4 != null && var4.startsWith("@cr2@")) {
					var4 = var4.substring(5);
				}
				if ((var3 == 3 || var3 == 7) && (var3 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var4))) {
					int var5 = 329 - var1 * 13;
					if (super.mouseX > 4 && super.mouseY - 4 > var5 - 10 && super.mouseY - 4 <= var5 + 3) {
						int var6 = p12.stringWidTag("From:  " + var4 + chatText[var2]) + 25;
						if (var6 > 450) {
							var6 = 450;
						}
						if (super.mouseX < var6 + 4) {
							if (staffmodlevel >= 1) {
								menuOption[menuNumEntries] = "Report abuse @whi@" + var4;
								menuAction[menuNumEntries] = 2524;
								menuNumEntries++;
							}
							menuOption[menuNumEntries] = "Add ignore @whi@" + var4;
							menuAction[menuNumEntries] = 2047;
							menuNumEntries++;
							menuOption[menuNumEntries] = "Add friend @whi@" + var4;
							menuAction[menuNumEntries] = 2605;
							menuNumEntries++;
						}
					}
					var1++;
					if (var1 >= 5) {
						return;
					}
				}
				if ((var3 == 5 || var3 == 6) && chatPrivateMode < 2) {
					var1++;
					if (var1 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBI)V")
	public void addChatOptions(int arg0, int arg1) {
		int var3 = 0;
		for (int var4 = 0; var4 < 100; var4++) {
			if (chatText[var4] != null) {
				int var5 = chatType[var4];
				int var6 = chatScrollPos + 70 + 4 - var3 * 14;
				if (var6 < -20) {
					break;
				}
				String var7 = chatUsername[var4];
				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
				}
				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
				}
				if (var5 == 0) {
					var3++;
				}
				if ((var5 == 1 || var5 == 2) && (var5 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6 && !var7.equals(localPlayer.name)) {
						if (staffmodlevel >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var7;
							menuAction[menuNumEntries] = 524;
							menuNumEntries++;
						}
						menuOption[menuNumEntries] = "Add ignore @whi@" + var7;
						menuAction[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var7;
						menuAction[menuNumEntries] = 605;
						menuNumEntries++;
					}
					var3++;
				}
				if ((var5 == 3 || var5 == 7) && splitPrivateChat == 0 && (var5 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						if (staffmodlevel >= 1) {
							menuOption[menuNumEntries] = "Report abuse @whi@" + var7;
							menuAction[menuNumEntries] = 524;
							menuNumEntries++;
						}
						menuOption[menuNumEntries] = "Add ignore @whi@" + var7;
						menuAction[menuNumEntries] = 47;
						menuNumEntries++;
						menuOption[menuNumEntries] = "Add friend @whi@" + var7;
						menuAction[menuNumEntries] = 605;
						menuNumEntries++;
					}
					var3++;
				}
				if (var5 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuNumEntries] = "Accept trade @whi@" + var7;
						menuAction[menuNumEntries] = 507;
						menuNumEntries++;
					}
					var3++;
				}
				if ((var5 == 5 || var5 == 6) && splitPrivateChat == 0 && chatPrivateMode < 2) {
					var3++;
				}
				if (var5 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var7))) {
					if (arg1 > var6 - 14 && arg1 <= var6) {
						menuOption[menuNumEntries] = "Accept challenge @whi@" + var7;
						menuAction[menuNumEntries] = 957;
						menuNumEntries++;
					}
					var3++;
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public void minimapLoop() {
		if (minimapState != 0 || super.mouseClickButton != 1) {
			return;
		}
		int var1 = super.mouseClickX - 25 - 550;
		int var2 = super.mouseClickY - 5 - 4;
		if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
			var1 -= 73;
			var2 -= 75;
			int var3 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
			int var4 = Pix3D.sinTable[var3];
			int var5 = Pix3D.cosTable[var3];
			int var6 = var4 * (macroMinimapZoom + 256) >> 8;
			int var7 = var5 * (macroMinimapZoom + 256) >> 8;
			int var8 = var2 * var6 + var1 * var7 >> 11;
			int var9 = var2 * var7 - var1 * var6 >> 11;
			int var10 = localPlayer.x + var8 >> 7;
			int var11 = localPlayer.z - var9 >> 7;
			boolean var12 = tryMove(0, localPlayer.routeX[0], 0, var11, 0, 0, true, 1, 0, var10, localPlayer.routeZ[0]);
			if (var12) {
				out.p1(var1);
				out.p1(var2);
				out.p2(orbitCameraYaw);
				out.p1(57);
				out.p1(macroMinimapAngle);
				out.p1(macroMinimapZoom);
				out.p1(89);
				out.p2(localPlayer.x);
				out.p2(localPlayer.z);
				out.p1(field1393);
				out.p1(63);
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public void iconLoop() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && sideIcon[0] != -1) {
			redrawSidebar = true;
			activeIcon = 0;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && sideIcon[1] != -1) {
			redrawSidebar = true;
			activeIcon = 1;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && sideIcon[2] != -1) {
			redrawSidebar = true;
			activeIcon = 2;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && sideIcon[3] != -1) {
			redrawSidebar = true;
			activeIcon = 3;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && sideIcon[4] != -1) {
			redrawSidebar = true;
			activeIcon = 4;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && sideIcon[5] != -1) {
			redrawSidebar = true;
			activeIcon = 5;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && sideIcon[6] != -1) {
			redrawSidebar = true;
			activeIcon = 6;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && sideIcon[7] != -1) {
			redrawSidebar = true;
			activeIcon = 7;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && sideIcon[8] != -1) {
			redrawSidebar = true;
			activeIcon = 8;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && sideIcon[9] != -1) {
			redrawSidebar = true;
			activeIcon = 9;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && sideIcon[10] != -1) {
			redrawSidebar = true;
			activeIcon = 10;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && sideIcon[11] != -1) {
			redrawSidebar = true;
			activeIcon = 11;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && sideIcon[12] != -1) {
			redrawSidebar = true;
			activeIcon = 12;
			redrawIcons = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && sideIcon[13] != -1) {
			redrawSidebar = true;
			activeIcon = 13;
			redrawIcons = true;
		}
	}

	@ObfuscatedName("client.v(B)V")
	public void chatModeLoop() {
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			chatPublicMode = (chatPublicMode + 1) % 4;
			redrawChatMode = true;
			redrawChatback = true;
			out.p1enc(161);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			chatPrivateMode = (chatPrivateMode + 1) % 3;
			redrawChatMode = true;
			redrawChatback = true;
			out.p1enc(161);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			chatTradeMode = (chatTradeMode + 1) % 3;
			redrawChatMode = true;
			redrawChatback = true;
			out.p1enc(161);
			out.p1(chatPublicMode);
			out.p1(chatPrivateMode);
			out.p1(chatTradeMode);
		}
		if (super.mouseClickX < 412 || super.mouseClickX > 512 || super.mouseClickY < 467 || super.mouseClickY > 499) {
			return;
		}
		if (mainModalId != -1) {
			addChat(0, "Please close the interface you have open before using 'report abuse'", "");
			return;
		}
		closeModal();
		reportAbuseInput = "";
		reportAbuseMuteOption = false;
		for (int var1 = 0; var1 < IfType.list.length; var1++) {
			if (IfType.list[var1] != null && IfType.list[var1].clientCode == 600) {
				reportAbuseComId = mainModalId = IfType.list[var1].layerId;
				return;
			}
		}
	}

	@ObfuscatedName("client.h(I)V")
	public void timeoutChat() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}
			ClientPlayer var3 = players[var2];
			if (var3 != null && var3.chatTimer > 0) {
				var3.chatTimer--;
				if (var3.chatTimer == 0) {
					var3.chatMessage = null;
				}
			}
		}
		for (int var4 = 0; var4 < npcCount; var4++) {
			int var5 = npcIds[var4];
			ClientNpc var6 = npc[var5];
			if (var6 != null && var6.chatTimer > 0) {
				var6.chatTimer--;
				if (var6.chatTimer == 0) {
					var6.chatMessage = null;
				}
			}
		}
	}

	@ObfuscatedName("client.K(I)V")
	public void handleInputKey(int arg0) {
		cyclelogic4++;
		while (arg0 >= 0) {
			field1383 = 326;
		}
		if (cyclelogic4 > 192) {
			cyclelogic4 = 0;
			out.p1enc(137);
			out.p1(232);
		}
		while (true) {
			int var2;
			do {
				while (true) {
					var2 = pollKey();
					if (var2 == -1) {
						return;
					}
					if (mainModalId != -1 && mainModalId == reportAbuseComId) {
						if (var2 == 8 && reportAbuseInput.length() > 0) {
							reportAbuseInput = reportAbuseInput.substring(0, reportAbuseInput.length() - 1);
						}
						break;
					}
					if (socialInputOpen) {
						if (var2 >= 32 && var2 <= 122 && socialInput.length() < 80) {
							socialInput = socialInput + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && socialInput.length() > 0) {
							socialInput = socialInput.substring(0, socialInput.length() - 1);
							redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							socialInputOpen = false;
							redrawChatback = true;
							if (socialInputType == 1) {
								long var3 = JString.toUserhash(socialInput);
								addFriend(var3);
							}
							if (socialInputType == 2 && friendCount > 0) {
								long var5 = JString.toUserhash(socialInput);
								delFriend(var5);
							}
							if (socialInputType == 3 && socialInput.length() > 0) {
								out.p1enc(107);
								out.p1(0);
								int var7 = out.pos;
								out.p8(field1388);
								WordPack.pack(socialInput, out);
								out.psize1(out.pos - var7, field1573);
								socialInput = WordPack.method306(socialInput, field1663);
								socialInput = WordFilter.method397(socialInput, field1663);
								addChat(6, socialInput, JString.toSentenceCase(JString.toRawUsername(field1388)));
								if (chatPrivateMode == 2) {
									chatPrivateMode = 1;
									redrawChatMode = true;
									out.p1enc(161);
									out.p1(chatPublicMode);
									out.p1(chatPrivateMode);
									out.p1(chatTradeMode);
								}
							}
							if (socialInputType == 4 && ignoreCount < 100) {
								long var8 = JString.toUserhash(socialInput);
								addIgnore(var8);
							}
							if (socialInputType == 5 && ignoreCount > 0) {
								long var10 = JString.toUserhash(socialInput);
								delIgnore(var10);
							}
						}
					} else if (dialogInputOpen) {
						if (var2 >= 48 && var2 <= 57 && dialogInput.length() < 10) {
							dialogInput = dialogInput + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && dialogInput.length() > 0) {
							dialogInput = dialogInput.substring(0, dialogInput.length() - 1);
							redrawChatback = true;
						}
						if (var2 == 13 || var2 == 10) {
							if (dialogInput.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(dialogInput);
								} catch (Exception var19) {
								}
								out.p1enc(180);
								out.p4(var12);
							}
							dialogInputOpen = false;
							redrawChatback = true;
						}
					} else if (chatComId == -1) {
						if (var2 >= 32 && var2 <= 122 && chatInput.length() < 80) {
							chatInput = chatInput + (char) var2;
							redrawChatback = true;
						}
						if (var2 == 8 && chatInput.length() > 0) {
							chatInput = chatInput.substring(0, chatInput.length() - 1);
							redrawChatback = true;
						}
						if ((var2 == 13 || var2 == 10) && chatInput.length() > 0) {
							if (staffmodlevel == 2) {
								if (chatInput.equals("::clientdrop")) {
									lostCon();
								}
								if (chatInput.equals("::lag")) {
									lag();
								}
								if (chatInput.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < onDemand.getFileCount(2); var13++) {
										onDemand.prefetchPriority(2, (byte) 1, var13);
									}
								}
							}
							if (chatInput.startsWith("::")) {
								out.p1enc(34);
								out.p1(chatInput.length() - 1);
								out.pjstr(chatInput.substring(2));
							} else {
								String var14 = chatInput.toLowerCase();
								byte var15 = 0;
								if (var14.startsWith("yellow:")) {
									var15 = 0;
									chatInput = chatInput.substring(7);
								} else if (var14.startsWith("red:")) {
									var15 = 1;
									chatInput = chatInput.substring(4);
								} else if (var14.startsWith("green:")) {
									var15 = 2;
									chatInput = chatInput.substring(6);
								} else if (var14.startsWith("cyan:")) {
									var15 = 3;
									chatInput = chatInput.substring(5);
								} else if (var14.startsWith("purple:")) {
									var15 = 4;
									chatInput = chatInput.substring(7);
								} else if (var14.startsWith("white:")) {
									var15 = 5;
									chatInput = chatInput.substring(6);
								} else if (var14.startsWith("flash1:")) {
									var15 = 6;
									chatInput = chatInput.substring(7);
								} else if (var14.startsWith("flash2:")) {
									var15 = 7;
									chatInput = chatInput.substring(7);
								} else if (var14.startsWith("flash3:")) {
									var15 = 8;
									chatInput = chatInput.substring(7);
								} else if (var14.startsWith("glow1:")) {
									var15 = 9;
									chatInput = chatInput.substring(6);
								} else if (var14.startsWith("glow2:")) {
									var15 = 10;
									chatInput = chatInput.substring(6);
								} else if (var14.startsWith("glow3:")) {
									var15 = 11;
									chatInput = chatInput.substring(6);
								}
								String var16 = chatInput.toLowerCase();
								byte var17 = 0;
								if (var16.startsWith("wave:")) {
									var17 = 1;
									chatInput = chatInput.substring(5);
								} else if (var16.startsWith("wave2:")) {
									var17 = 2;
									chatInput = chatInput.substring(6);
								} else if (var16.startsWith("shake:")) {
									var17 = 3;
									chatInput = chatInput.substring(6);
								} else if (var16.startsWith("scroll:")) {
									var17 = 4;
									chatInput = chatInput.substring(7);
								} else if (var16.startsWith("slide:")) {
									var17 = 5;
									chatInput = chatInput.substring(6);
								}
								out.p1enc(156);
								out.p1(0);
								int var18 = out.pos;
								out.p1(var15);
								out.p1(var17);
								WordPack.pack(chatInput, out);
								out.psize1(out.pos - var18, field1573);
								chatInput = WordPack.method306(chatInput, field1663);
								chatInput = WordFilter.method397(chatInput, field1663);
								localPlayer.chatMessage = chatInput;
								localPlayer.chatColour = var15;
								localPlayer.chatEffect = var17;
								localPlayer.chatTimer = 150;
								if (staffmodlevel == 2) {
									addChat(2, localPlayer.chatMessage, "@cr2@" + localPlayer.name);
								} else if (staffmodlevel == 1) {
									addChat(2, localPlayer.chatMessage, "@cr1@" + localPlayer.name);
								} else {
									addChat(2, localPlayer.chatMessage, localPlayer.name);
								}
								if (chatPublicMode == 2) {
									chatPublicMode = 3;
									redrawChatMode = true;
									out.p1enc(161);
									out.p1(chatPublicMode);
									out.p1(chatPrivateMode);
									out.p1(chatTradeMode);
								}
							}
							chatInput = "";
							redrawChatback = true;
						}
					}
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
			if (reportAbuseInput.length() < 12) {
				reportAbuseInput = reportAbuseInput + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void lag() {
		System.out.println("============");
		System.out.println("flame-cycle:" + flameCycle);
		if (onDemand != null) {
			System.out.println("Od-cycle:" + onDemand.field845);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + field1596);
		System.out.println("ptype:" + ptype);
		System.out.println("psize:" + psize);
		if (stream != null) {
			stream.debug();
		}
		super.debug = true;
	}

	@ObfuscatedName("client.i(B)V")
	public void followCamera() {
		if (field1522 != 6) {
			field1599 = !field1599;
		}
		try {
			int var1 = localPlayer.x + macroCameraX;
			int var2 = localPlayer.z + macroCameraZ;
			if (orbitCameraX - var1 < -500 || orbitCameraX - var1 > 500 || orbitCameraZ - var2 < -500 || orbitCameraZ - var2 > 500) {
				orbitCameraX = var1;
				orbitCameraZ = var2;
			}
			if (orbitCameraX != var1) {
				orbitCameraX += (var1 - orbitCameraX) / 16;
			}
			if (orbitCameraZ != var2) {
				orbitCameraZ += (var2 - orbitCameraZ) / 16;
			}
			if (super.keyHeld[1] == 1) {
				orbitCameraYawVelocity += (-orbitCameraYawVelocity - 24) / 2;
			} else if (super.keyHeld[2] == 1) {
				orbitCameraYawVelocity += (24 - orbitCameraYawVelocity) / 2;
			} else {
				orbitCameraYawVelocity /= 2;
			}
			if (super.keyHeld[3] == 1) {
				orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
			} else if (super.keyHeld[4] == 1) {
				orbitCameraPitchVelocity += (-orbitCameraPitchVelocity - 12) / 2;
			} else {
				orbitCameraPitchVelocity /= 2;
			}
			orbitCameraYaw = orbitCameraYaw + orbitCameraYawVelocity / 2 & 0x7FF;
			orbitCameraPitch += orbitCameraPitchVelocity / 2;
			if (orbitCameraPitch < 128) {
				orbitCameraPitch = 128;
			}
			if (orbitCameraPitch > 383) {
				orbitCameraPitch = 383;
			}
			int var3 = orbitCameraX >> 7;
			int var4 = orbitCameraZ >> 7;
			int var5 = getAvH(orbitCameraZ, orbitCameraX, minusedlevel);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
						int var9 = minusedlevel;
						if (var9 < 3 && (mapl[1][var7][var8] & 0x2) == 0x2) {
							var9++;
						}
						int var10 = var5 - groundh[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}
			int var11 = var6 * 192;
			if (var11 > 98048) {
				var11 = 98048;
			}
			if (var11 < 32768) {
				var11 = 32768;
			}
			if (var11 > cameraPitchClamp) {
				cameraPitchClamp += (var11 - cameraPitchClamp) / 24;
			} else if (var11 < cameraPitchClamp) {
				cameraPitchClamp += (var11 - cameraPitchClamp) / 80;
			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + orbitCameraX + "," + orbitCameraZ + "," + mapBuildCentreZoneX + "," + mapBuildCentreZoneZ + "," + mapBuildBaseX + "," + mapBuildBaseZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void cinemaCamera() {
		int var1 = camMoveToLx * 128 + 64;
		int var2 = camMoveToLz * 128 + 64;
		int var3 = getAvH(var2, var1, minusedlevel) - camMoveToHei;
		if (camX < var1) {
			camX += camMoveToRate + (var1 - camX) * camMoveToRate2 / 1000;
			if (camX > var1) {
				camX = var1;
			}
		}
		if (camX > var1) {
			camX -= camMoveToRate + (camX - var1) * camMoveToRate2 / 1000;
			if (camX < var1) {
				camX = var1;
			}
		}
		if (camY < var3) {
			camY += camMoveToRate + (var3 - camY) * camMoveToRate2 / 1000;
			if (camY > var3) {
				camY = var3;
			}
		}
		if (camY > var3) {
			camY -= camMoveToRate + (camY - var3) * camMoveToRate2 / 1000;
			if (camY < var3) {
				camY = var3;
			}
		}
		if (camZ < var2) {
			camZ += camMoveToRate + (var2 - camZ) * camMoveToRate2 / 1000;
			if (camZ > var2) {
				camZ = var2;
			}
		}
		if (camZ > var2) {
			camZ -= camMoveToRate + (camZ - var2) * camMoveToRate2 / 1000;
			if (camZ < var2) {
				camZ = var2;
			}
		}
		int var4 = camLookAtLx * 128 + 64;
		int var5 = camLookAtLz * 128 + 64;
		int var6 = getAvH(var5, var4, minusedlevel) - camLookAtHei;
		int var7 = var4 - camX;
		int var8 = var6 - camY;
		int var9 = var5 - camZ;
		int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
		int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
		int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
		if (var11 < 128) {
			var11 = 128;
		}
		if (var11 > 383) {
			var11 = 383;
		}
		if (camPitch < var11) {
			camPitch += camLookAtRate + (var11 - camPitch) * camLookAtRate2 / 1000;
			if (camPitch > var11) {
				camPitch = var11;
			}
		}
		if (camPitch > var11) {
			camPitch -= camLookAtRate + (camPitch - var11) * camLookAtRate2 / 1000;
			if (camPitch < var11) {
				camPitch = var11;
			}
		}
		int var13 = var12 - camYaw;
		if (var13 > 1024) {
			var13 -= 2048;
		}
		if (var13 < -1024) {
			var13 += 2048;
		}
		if (var13 > 0) {
			camYaw += camLookAtRate + var13 * camLookAtRate2 / 1000;
			camYaw &= 0x7FF;
		}
		if (var13 < 0) {
			camYaw -= camLookAtRate + -var13 * camLookAtRate2 / 1000;
			camYaw &= 0x7FF;
		}
		int var14 = var12 - camYaw;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
			camYaw = var12;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void soundsDoQueue() {
		for (int var1 = 0; var1 < waveCount; var1++) {
			if (waveDelay[var1] <= 0) {
				boolean var2 = false;
				try {
					if (waveIds[var1] != lastWaveId || waveLoops[var1] != lastWaveLoops) {
						Packet var3 = JagFX.generate(waveLoops[var1], waveIds[var1]);
						if (System.currentTimeMillis() + (long) (var3.pos / 22) > lastWaveStartTime + (long) (lastWaveLength / 22)) {
							lastWaveLength = var3.pos;
							lastWaveStartTime = System.currentTimeMillis();
							if (saveWave(var3.data, var3.pos)) {
								lastWaveId = waveIds[var1];
								lastWaveLoops = waveLoops[var1];
							} else {
								var2 = true;
							}
						}
					} else if (!replayWave()) {
						var2 = true;
					}
				} catch (Exception var6) {
				}
				if (var2 && waveDelay[var1] != -5) {
					waveDelay[var1] = -5;
				} else {
					waveCount--;
					for (int var5 = var1; var5 < waveCount; var5++) {
						waveIds[var5] = waveIds[var5 + 1];
						waveLoops[var5] = waveLoops[var5 + 1];
						waveDelay[var5] = waveDelay[var5 + 1];
					}
					var1--;
				}
			} else {
				int var10002 = waveDelay[var1]--;
			}
		}
		if (nextMidiDelay > 0) {
			nextMidiDelay -= 20;
			if (nextMidiDelay < 0) {
				nextMidiDelay = 0;
			}
			if (nextMidiDelay == 0 && midiActive && !lowMem) {
				midiSong = nextMidiSong;
				midiFading = true;
				onDemand.request(2, midiSong);
			}
		}
	}

	@ObfuscatedName("client.o(B)V")
	public void movePlayers() {
		for (int var1 = -1; var1 < playerCount; var1++) {
			int var2;
			if (var1 == -1) {
				var2 = LOCAL_PLAYER_INDEX;
			} else {
				var2 = playerIds[var1];
			}
			ClientPlayer var3 = players[var2];
			if (var3 != null) {
				moveEntity(var3, 1);
			}
		}
	}

	@ObfuscatedName("client.H(I)V")
	public void moveNpcs() {
		for (int var1 = 0; var1 < npcCount; var1++) {
			int var2 = npcIds[var1];
			ClientNpc var3 = npc[var2];
			if (var3 != null) {
				moveEntity(var3, var3.type.size);
			}
		}
	}

	@ObfuscatedName("client.b(ILy;I)V")
	public void moveEntity(ClientEntity arg0, int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.field438 = 0;
			arg0.field439 = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
		}
		if (arg0 == localPlayer && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.primaryAnim = -1;
			arg0.spotanimId = -1;
			arg0.field438 = 0;
			arg0.field439 = 0;
			arg0.x = arg0.routeX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.routeZ[0] * 128 + arg0.size * 64;
			arg0.abortRoute();
		}
		if (arg0.field438 > loopCycle) {
			exactMove1(arg0);
		} else if (arg0.field439 >= loopCycle) {
			exactMove2(field1512, arg0);
		} else {
			routeMove(arg0);
		}
		entityFace(arg0);
		entityAnim(arg0);
	}

	@ObfuscatedName("client.a(ILy;)V")
	public void exactMove1(ClientEntity arg0) {
		int var2 = arg0.field438 - loopCycle;
		int var3 = arg0.field434 * 128 + arg0.size * 64;
		int var4 = arg0.field436 * 128 + arg0.size * 64;
		arg0.x += (var3 - arg0.x) / var2;
		arg0.z += (var4 - arg0.z) / var2;
		arg0.animDelayMove = 0;
		if (arg0.field440 == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.field440 == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.field440 == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.field440 == 3) {
			arg0.dstYaw = 512;
		}
	}

	@ObfuscatedName("client.b(ILy;)V")
	public void exactMove2(int arg0, ClientEntity arg1) {
		if (arg1.field439 == loopCycle || arg1.primaryAnim == -1 || arg1.primaryAnimDelay != 0 || arg1.field426 + 1 > SeqType.list[arg1.primaryAnim].getDelay(arg1.primaryFrame)) {
			int var3 = arg1.field439 - arg1.field438;
			int var4 = loopCycle - arg1.field438;
			int var5 = arg1.field434 * 128 + arg1.size * 64;
			int var6 = arg1.field436 * 128 + arg1.size * 64;
			int var7 = arg1.field435 * 128 + arg1.size * 64;
			int var8 = arg1.field437 * 128 + arg1.size * 64;
			arg1.x = (var5 * (var3 - var4) + var7 * var4) / var3;
			arg1.z = (var6 * (var3 - var4) + var8 * var4) / var3;
		}
		arg1.animDelayMove = 0;
		if (arg1.field440 == 0) {
			arg1.dstYaw = 1024;
		}
		if (arg1.field440 == 1) {
			arg1.dstYaw = 1536;
		}
		if (arg1.field440 == 2) {
			arg1.dstYaw = 0;
		}
		if (arg1.field440 == 3) {
			arg1.dstYaw = 512;
		}
		arg1.field398 = arg1.dstYaw;
		if (arg0 != 37395) {
			ptype = in.g1();
		}
	}

	@ObfuscatedName("client.a(Ly;I)V")
	public void routeMove(ClientEntity arg0) {
		arg0.secondaryAnim = arg0.readyanim;
		if (arg0.routeLength == 0) {
			arg0.animDelayMove = 0;
			return;
		}
		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
			SeqType var2 = SeqType.list[arg0.primaryAnim];
			if (arg0.preanimRouteLength > 0 && var2.preanim_move == 0) {
				arg0.animDelayMove++;
				return;
			}
			if (arg0.preanimRouteLength <= 0 && var2.postanim_move == 0) {
				arg0.animDelayMove++;
				return;
			}
		}
		int var3 = arg0.x;
		int var4 = arg0.z;
		int var5 = arg0.routeX[arg0.routeLength - 1] * 128 + arg0.size * 64;
		int var6 = arg0.routeZ[arg0.routeLength - 1] * 128 + arg0.size * 64;
		if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
			arg0.x = var5;
			arg0.z = var6;
			return;
		}
		if (var3 < var5) {
			if (var4 < var6) {
				arg0.dstYaw = 1280;
			} else if (var4 > var6) {
				arg0.dstYaw = 1792;
			} else {
				arg0.dstYaw = 1536;
			}
		} else if (var3 > var5) {
			if (var4 < var6) {
				arg0.dstYaw = 768;
			} else if (var4 > var6) {
				arg0.dstYaw = 256;
			} else {
				arg0.dstYaw = 512;
			}
		} else if (var4 < var6) {
			arg0.dstYaw = 1024;
		} else {
			arg0.dstYaw = 0;
		}
		int var7 = arg0.dstYaw - arg0.field398 & 0x7FF;
		if (var7 > 1024) {
			var7 -= 2048;
		}
		int var8 = arg0.walkanim_b;
		if (var7 >= -256 && var7 <= 256) {
			var8 = arg0.walkanim;
		} else if (var7 >= 256 && var7 < 768) {
			var8 = arg0.walkanim_r;
		} else if (var7 >= -768 && var7 <= -256) {
			var8 = arg0.walkanim_l;
		}
		if (var8 == -1) {
			var8 = arg0.walkanim;
		}
		arg0.secondaryAnim = var8;
		int var9 = 4;
		if (arg0.field398 != arg0.dstYaw && arg0.field418 == -1 && arg0.field444 != 0) {
			var9 = 2;
		}
		if (arg0.routeLength > 2) {
			var9 = 6;
		}
		if (arg0.routeLength > 3) {
			var9 = 8;
		}
		if (arg0.animDelayMove > 0 && arg0.routeLength > 1) {
			var9 = 8;
			arg0.animDelayMove--;
		}
		if (arg0.routeRun[arg0.routeLength - 1]) {
			var9 <<= 0x1;
		}
		if (var9 >= 8 && arg0.secondaryAnim == arg0.walkanim && arg0.runanim != -1) {
			arg0.secondaryAnim = arg0.runanim;
		}
		if (var3 < var5) {
			arg0.x += var9;
			if (arg0.x > var5) {
				arg0.x = var5;
			}
		} else if (var3 > var5) {
			arg0.x -= var9;
			if (arg0.x < var5) {
				arg0.x = var5;
			}
		}
		if (var4 < var6) {
			arg0.z += var9;
			if (arg0.z > var6) {
				arg0.z = var6;
			}
		} else if (var4 > var6) {
			arg0.z -= var9;
			if (arg0.z < var6) {
				arg0.z = var6;
			}
		}
		if (arg0.x == var5 && arg0.z == var6) {
			arg0.routeLength--;
			if (arg0.preanimRouteLength > 0) {
				arg0.preanimRouteLength--;
			}
		}
	}

	@ObfuscatedName("client.a(BLy;)V")
	public void entityFace(ClientEntity arg0) {
		if (arg0.field444 == 0) {
			return;
		}
		if (arg0.field418 != -1 && arg0.field418 < 32768) {
			ClientNpc var2 = npc[arg0.field418];
			if (var2 != null) {
				int var3 = arg0.x - var2.x;
				int var4 = arg0.z - var2.z;
				if (var3 != 0 || var4 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field418 >= 32768) {
			int var5 = arg0.field418 - 32768;
			if (var5 == field1536) {
				var5 = LOCAL_PLAYER_INDEX;
			}
			ClientPlayer var6 = players[var5];
			if (var6 != null) {
				int var7 = arg0.x - var6.x;
				int var8 = arg0.z - var6.z;
				if (var7 != 0 || var8 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field419 != 0 || arg0.field420 != 0) && (arg0.routeLength == 0 || arg0.animDelayMove > 0)) {
			int var9 = arg0.x - (arg0.field419 - mapBuildBaseX - mapBuildBaseX) * 64;
			int var10 = arg0.z - (arg0.field420 - mapBuildBaseZ - mapBuildBaseZ) * 64;
			if (var9 != 0 || var10 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
			}
			arg0.field419 = 0;
			arg0.field420 = 0;
		}
		int var11 = arg0.dstYaw - arg0.field398 & 0x7FF;
		if (var11 != 0) {
			if (var11 < arg0.field444 || var11 > 2048 - arg0.field444) {
				arg0.field398 = arg0.dstYaw;
			} else if (var11 > 1024) {
				arg0.field398 -= arg0.field444;
			} else {
				arg0.field398 += arg0.field444;
			}
			arg0.field398 &= 0x7FF;
			if (arg0.secondaryAnim == arg0.readyanim && arg0.field398 != arg0.dstYaw) {
				if (arg0.turnanim == -1) {
					arg0.secondaryAnim = arg0.walkanim;
				} else {
					arg0.secondaryAnim = arg0.turnanim;
				}
			}
		}
	}

	@ObfuscatedName("client.b(Ly;I)V")
	public void entityAnim(ClientEntity arg0) {
		arg0.field399 = false;
		if (arg0.secondaryAnim != -1) {
			SeqType var2 = SeqType.list[arg0.secondaryAnim];
			arg0.field423++;
			if (arg0.secondaryFrame < var2.numFrames && arg0.field423 > var2.getDelay(arg0.secondaryFrame)) {
				arg0.field423 = 0;
				arg0.secondaryFrame++;
			}
			if (arg0.secondaryFrame >= var2.numFrames) {
				arg0.field423 = 0;
				arg0.secondaryFrame = 0;
			}
		}
		if (arg0.spotanimId != -1 && loopCycle >= arg0.field432) {
			if (arg0.spotanimFrame < 0) {
				arg0.spotanimFrame = 0;
			}
			SeqType var3 = SpotType.list[arg0.spotanimId].seq;
			arg0.field431++;
			while (arg0.spotanimFrame < var3.numFrames && arg0.field431 > var3.getDelay(arg0.spotanimFrame)) {
				arg0.field431 -= var3.getDelay(arg0.spotanimFrame);
				arg0.spotanimFrame++;
			}
			if (arg0.spotanimFrame >= var3.numFrames && (arg0.spotanimFrame < 0 || arg0.spotanimFrame >= var3.numFrames)) {
				arg0.spotanimId = -1;
			}
		}
		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay <= 1) {
			SeqType var4 = SeqType.list[arg0.primaryAnim];
			if (var4.preanim_move == 1 && arg0.preanimRouteLength > 0 && arg0.field438 <= loopCycle && arg0.field439 < loopCycle) {
				arg0.primaryAnimDelay = 1;
				return;
			}
		}
		if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
			SeqType var5 = SeqType.list[arg0.primaryAnim];
			arg0.field426++;
			while (arg0.primaryFrame < var5.numFrames && arg0.field426 > var5.getDelay(arg0.primaryFrame)) {
				arg0.field426 -= var5.getDelay(arg0.primaryFrame);
				arg0.primaryFrame++;
			}
			if (arg0.primaryFrame >= var5.numFrames) {
				arg0.primaryFrame -= var5.loops;
				arg0.field428++;
				if (arg0.field428 >= var5.maxloops) {
					arg0.primaryAnim = -1;
				}
				if (arg0.primaryFrame < 0 || arg0.primaryFrame >= var5.numFrames) {
					arg0.primaryAnim = -1;
				}
			}
			arg0.field399 = var5.reachforward;
		}
		if (arg0.primaryAnimDelay > 0) {
			arg0.primaryAnimDelay--;
		}
	}

	@ObfuscatedName("client.n(I)V")
	public void gameDrawMain() {
		sceneCycle++;
		addPlayers(true);
		addNpcs(true);
		addPlayers(false);
		addNpcs(false);
		addProjectiles(field1519);
		addMapAnim();
		if (!cinemaCam) {
			int var1 = orbitCameraPitch;
			if (cameraPitchClamp / 256 > var1) {
				var1 = cameraPitchClamp / 256;
			}
			if (camShake[4] && camShakeRan[4] + 128 > var1) {
				var1 = camShakeRan[4] + 128;
			}
			int var2 = orbitCameraYaw + macroCameraAngle & 0x7FF;
			camFollow(var1 * 3 + 600, var2, getAvH(localPlayer.z, localPlayer.x, minusedlevel) - 50, orbitCameraZ, orbitCameraX, var1);
		}
		int var3;
		if (cinemaCam) {
			var3 = roofCheck2();
		} else {
			var3 = roofCheck();
		}
		int var4 = camX;
		int var5 = camY;
		int var6 = camZ;
		int var7 = camPitch;
		int var8 = camYaw;
		for (int var9 = 0; var9 < 5; var9++) {
			if (camShake[var9]) {
				int var10 = (int) (Math.random() * (double) (camShakeAxis[var9] * 2 + 1) + Math.sin((double) camShakeCycle[var9] * ((double) camShakeAmp[var9] / 100.0D)) * (double) camShakeRan[var9] - (double) camShakeAxis[var9]);
				if (var9 == 0) {
					camX += var10;
				}
				if (var9 == 1) {
					camY += var10;
				}
				if (var9 == 2) {
					camZ += var10;
				}
				if (var9 == 3) {
					camYaw = camYaw + var10 & 0x7FF;
				}
				if (var9 == 4) {
					camPitch += var10;
					if (camPitch < 128) {
						camPitch = 128;
					}
					if (camPitch > 383) {
						camPitch = 383;
					}
				}
			}
		}
		int var11 = Pix3D.cycle;
		Model.mouseCheck = true;
		Model.pickedCount = 0;
		Model.mouseX = super.mouseX - 4;
		Model.mouseY = super.mouseY - 4;
		Pix2D.cls();
		world.renderAll(camX, camPitch, camZ, var3, camY, camYaw);
		world.removeSprites();
		entityOverlays();
		coordArrow(field1440);
		textureRunAnims(var11);
		otherOverlays();
		areaGame.draw(4, 4, super.graphics);
		camX = var4;
		camY = var5;
		camZ = var6;
		camPitch = var7;
		camYaw = var8;
	}

	@ObfuscatedName("client.b(ZZ)V")
	public void addPlayers(boolean arg0) {
		if (localPlayer.x >> 7 == minimapFlagX && localPlayer.z >> 7 == minimapFlagZ) {
			minimapFlagX = 0;
			field1365++;
			if (field1365 > 122) {
				field1365 = 0;
				out.p1enc(255);
				out.p1(62);
			}
		}
		int var2 = playerCount;
		if (arg0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			ClientPlayer var4;
			int var5;
			if (arg0) {
				var4 = localPlayer;
				var5 = LOCAL_PLAYER_INDEX << 14;
			} else {
				var4 = players[playerIds[var3]];
				var5 = playerIds[var3] << 14;
			}
			if (var4 != null && var4.isReady()) {
				var4.field477 = false;
				if ((lowMem && playerCount > 50 || playerCount > 200) && !arg0 && var4.secondaryAnim == var4.readyanim) {
					var4.field477 = true;
				}
				int var6 = var4.x >> 7;
				int var7 = var4.z >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.locModel == null || loopCycle < var4.locStartCycle || loopCycle >= var4.locStopCycle) {
						if ((var4.x & 0x7F) == 0x40 && (var4.z & 0x7F) == 0x40) {
							if (field1306[var6][var7] == sceneCycle) {
								continue;
							}
							field1306[var6][var7] = sceneCycle;
						}
						var4.y = getAvH(var4.z, var4.x, minusedlevel);
						world.addDynamic(60, var5, var4.y, var4.x, var4, var4.field398, var4.field399, var4.z, minusedlevel);
					} else {
						var4.field477 = false;
						var4.y = getAvH(var4.z, var4.x, minusedlevel);
						world.addDynamic2(var5, var4.field474, var4.field475, var4.x, var4.field476, var4, var4.z, minusedlevel, var4.y, var4.field473, var4.field398);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZZ)V")
	public void addNpcs(boolean arg0) {
		for (int var2 = 0; var2 < npcCount; var2++) {
			ClientNpc var3 = npc[npcIds[var2]];
			int var4 = (npcIds[var2] << 14) + 0x20000000;
			if (var3 != null && var3.isReady() && var3.type.alwaysontop == arg0) {
				int var5 = var3.x >> 7;
				int var6 = var3.z >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.size == 1 && (var3.x & 0x7F) == 0x40 && (var3.z & 0x7F) == 0x40) {
						if (field1306[var5][var6] == sceneCycle) {
							continue;
						}
						field1306[var5][var6] = sceneCycle;
					}
					world.addDynamic((var3.size - 1) * 64 + 60, var4, getAvH(var3.z, var3.x, minusedlevel), var3.x, var3, var3.field398, var3.field399, var3.z, minusedlevel);
				}
			}
		}
	}

	@ObfuscatedName("client.k(B)V")
	public void addProjectiles(byte arg0) {
		for (ClientProj var2 = (ClientProj) projectiles.head(); var2 != null; var2 = (ClientProj) projectiles.next()) {
			if (var2.level != minusedlevel || loopCycle > var2.t2) {
				var2.unlink();
			} else if (loopCycle >= var2.t1) {
				if (var2.target > 0) {
					ClientNpc var3 = npc[var2.target - 1];
					if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.z >= 0 && var3.z < 13312) {
						var2.setTarget(getAvH(var3.z, var3.x, var2.level) - var2.h2, var3.z, loopCycle, var3.x);
					}
				}
				if (var2.target < 0) {
					int var4 = -var2.target - 1;
					ClientPlayer var5;
					if (var4 == field1536) {
						var5 = localPlayer;
					} else {
						var5 = players[var4];
					}
					if (var5 != null && var5.x >= 0 && var5.x < 13312 && var5.z >= 0 && var5.z < 13312) {
						var2.setTarget(getAvH(var5.z, var5.x, var2.level) - var2.h2, var5.z, loopCycle, var5.x);
					}
				}
				var2.move(worldUpdateNum);
				world.addDynamic(60, -1, (int) var2.y, (int) var2.x, var2, var2.yaw, false, (int) var2.z, minusedlevel);
			}
		}
		field1588++;
		if (arg0 != field1474) {
			field1683 = !field1683;
		}
		if (field1588 > 1174) {
			field1588 = 0;
			out.p1enc(130);
			out.p1(0);
			int var6 = out.pos;
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(11499);
			}
			out.p2(10548);
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(139);
			}
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(94);
			}
			out.p2(51693);
			out.p1(16);
			out.p2(15036);
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p1(65);
			}
			out.p1((int) (Math.random() * 256.0D));
			out.p2(22990);
			out.psize1(out.pos - var6, field1573);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public void addMapAnim() {
		for (MapSpotAnim var1 = (MapSpotAnim) spotanims.head(); var1 != null; var1 = (MapSpotAnim) spotanims.next()) {
			if (var1.level != minusedlevel || var1.animComplete) {
				var1.unlink();
			} else if (loopCycle >= var1.startCycle) {
				var1.update(worldUpdateNum);
				if (var1.animComplete) {
					var1.unlink();
				} else {
					world.addDynamic(60, -1, var1.y, var1.x, var1, 0, false, var1.z, var1.level);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBIIIII)V")
	public void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 2048 - arg5 & 0x7FF;
		int var8 = 2048 - arg1 & 0x7FF;
		int var9 = 0;
		int var10 = 0;
		int var11 = arg0;
		if (var7 != 0) {
			int var12 = Model.sinTable[var7];
			int var13 = Model.cosTable[var7];
			int var14 = var13 * 0 - arg0 * var12 >> 16;
			var11 = var12 * 0 + arg0 * var13 >> 16;
			var10 = var14;
		}
		if (var8 != 0) {
			int var15 = Model.sinTable[var8];
			int var16 = Model.cosTable[var8];
			int var17 = var11 * var15 + var16 * 0 >> 16;
			var11 = var11 * var16 - var15 * 0 >> 16;
			var9 = var17;
		}
		camX = arg4 - var9;
		camY = arg2 - var10;
		camZ = arg3 - var11;
		camPitch = arg5;
		camYaw = arg1;
	}

	@ObfuscatedName("client.t(B)I")
	public int roofCheck2() {
		int var1 = getAvH(camZ, camX, minusedlevel);
		return var1 - camY >= 800 || (mapl[minusedlevel][camX >> 7][camZ >> 7] & 0x4) == 0 ? 3 : minusedlevel;
	}

	@ObfuscatedName("client.s(B)I")
	public int roofCheck() {
		int var1 = 3;
		if (camPitch < 310) {
			int var2 = camX >> 7;
			int var3 = camZ >> 7;
			int var4 = localPlayer.x >> 7;
			int var5 = localPlayer.z >> 7;
			if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
				var1 = minusedlevel;
			}
			int var6;
			if (var4 > var2) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}
			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}
			if (var6 > var7) {
				int var8 = var7 * 65536 / var6;
				int var9 = 32768;
				while (var2 != var4) {
					if (var2 < var4) {
						var2++;
					} else if (var2 > var4) {
						var2--;
					}
					if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
						var1 = minusedlevel;
					}
					var9 += var8;
					if (var9 >= 65536) {
						var9 -= 65536;
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = minusedlevel;
						}
					}
				}
			} else {
				int var10 = var6 * 65536 / var7;
				int var11 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}
					if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
						var1 = minusedlevel;
					}
					var11 += var10;
					if (var11 >= 65536) {
						var11 -= 65536;
						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}
						if ((mapl[minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = minusedlevel;
						}
					}
				}
			}
		}
		if ((mapl[minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
			var1 = minusedlevel;
		}
		return var1;
	}

	@ObfuscatedName("client.v(I)V")
	public void entityOverlays() {
		field1578 = 0;
		for (int var1 = -1; var1 < playerCount + npcCount; var1++) {
			ClientEntity var2;
			if (var1 == -1) {
				var2 = localPlayer;
			} else if (var1 < playerCount) {
				var2 = players[playerIds[var1]];
			} else {
				var2 = npc[npcIds[var1 - playerCount]];
			}
			if (var2 != null && var2.isReady()) {
				if (var1 >= playerCount) {
					NpcType var6 = ((ClientNpc) var2).type;
					if (var6.headicon >= 0 && var6.headicon < headicons.length) {
						getOverlayPos(var2.height + 15, var2);
						if (projectX > -1) {
							headicons[var6.headicon].plotSprite(projectY - 30, field1634, projectX - 12);
						}
					}
					if (hintType == 1 && field1322 == npcIds[var1 - playerCount] && loopCycle % 20 < 10) {
						getOverlayPos(var2.height + 15, var2);
						if (projectX > -1) {
							headicons[2].plotSprite(projectY - 28, field1634, projectX - 12);
						}
					}
				} else {
					int var3 = 30;
					ClientPlayer var4 = (ClientPlayer) var2;
					if (var4.headicons != 0) {
						getOverlayPos(var2.height + 15, var2);
						if (projectX > -1) {
							for (int var5 = 0; var5 < 8; var5++) {
								if ((var4.headicons & 0x1 << var5) != 0) {
									headicons[var5].plotSprite(projectY - var3, field1634, projectX - 12);
									var3 -= 25;
								}
							}
						}
					}
					if (var1 >= 0 && hintType == 10 && field1330 == playerIds[var1]) {
						getOverlayPos(var2.height + 15, var2);
						if (projectX > -1) {
							headicons[7].plotSprite(projectY - var3, field1634, projectX - 12);
						}
					}
				}
				if (var2.chatMessage != null && (var1 >= playerCount || chatPublicMode == 0 || chatPublicMode == 3 || chatPublicMode == 1 && isFriend(((ClientPlayer) var2).name))) {
					getOverlayPos(var2.height, var2);
					if (projectX > -1 && field1578 < field1579) {
						field1583[field1578] = b12.stringWid(var2.chatMessage) / 2;
						field1582[field1578] = b12.height;
						field1580[field1578] = projectX;
						field1581[field1578] = projectY;
						field1584[field1578] = var2.chatColour;
						field1585[field1578] = var2.chatEffect;
						field1586[field1578] = var2.chatTimer;
						field1587[field1578++] = var2.chatMessage;
						if (chatEffects == 0 && var2.chatEffect >= 1 && var2.chatEffect <= 3) {
							field1582[field1578] += 10;
							field1581[field1578] += 5;
						}
						if (chatEffects == 0 && var2.chatEffect == 4) {
							field1583[field1578] = 60;
						}
						if (chatEffects == 0 && var2.chatEffect == 5) {
							field1582[field1578] += 5;
						}
					}
				}
				if (var2.field415 > loopCycle) {
					getOverlayPos(var2.height + 15, var2);
					if (projectX > -1) {
						int var7 = var2.field416 * 30 / var2.field417;
						if (var7 > 30) {
							var7 = 30;
						}
						Pix2D.fillRect(65280, projectY - 3, 5, projectX - 15, var7);
						Pix2D.fillRect(16711680, projectY - 3, 5, projectX + var7 - 15, 30 - var7);
					}
				}
				for (int var8 = 0; var8 < 4; var8++) {
					if (var2.damageCycles[var8] > loopCycle) {
						getOverlayPos(var2.height / 2, var2);
						if (projectX > -1) {
							if (var8 == 1) {
								projectY -= 20;
							}
							if (var8 == 2) {
								projectX -= 15;
								projectY -= 10;
							}
							if (var8 == 3) {
								projectX += 15;
								projectY -= 10;
							}
							hitmarks[var2.damageTypes[var8]].plotSprite(projectY - 12, field1634, projectX - 12);
							p11.centreStringTag(projectX, String.valueOf(var2.damageValues[var8]), 0, projectY + 4);
							p11.centreStringTag(projectX - 1, String.valueOf(var2.damageValues[var8]), 16777215, projectY + 3);
						}
					}
				}
			}
		}
		for (int var9 = 0; var9 < field1578; var9++) {
			int var10 = field1580[var9];
			int var11 = field1581[var9];
			int var12 = field1583[var9];
			int var13 = field1582[var9];
			boolean var14 = true;
			while (var14) {
				var14 = false;
				for (int var15 = 0; var15 < var9; var15++) {
					if (var11 + 2 > field1581[var15] - field1582[var15] && var11 - var13 < field1581[var15] + 2 && var10 - var12 < field1580[var15] + field1583[var15] && var10 + var12 > field1580[var15] - field1583[var15] && field1581[var15] - field1582[var15] < var11) {
						var11 = field1581[var15] - field1582[var15];
						var14 = true;
					}
				}
			}
			projectX = field1580[var9];
			projectY = field1581[var9] = var11;
			String var16 = field1587[var9];
			if (chatEffects == 0) {
				int var17 = 16776960;
				if (field1584[var9] < 6) {
					var17 = field1624[field1584[var9]];
				}
				if (field1584[var9] == 6) {
					var17 = sceneCycle % 20 < 10 ? 16711680 : 16776960;
				}
				if (field1584[var9] == 7) {
					var17 = sceneCycle % 20 < 10 ? 255 : 65535;
				}
				if (field1584[var9] == 8) {
					var17 = sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				if (field1584[var9] == 9) {
					int var18 = 150 - field1586[var9];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}
				if (field1584[var9] == 10) {
					int var19 = 150 - field1586[var9];
					if (var19 < 50) {
						var17 = var19 * 5 + 16711680;
					} else if (var19 < 100) {
						var17 = 16711935 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var17 = (var19 - 100) * 327680 + 255 - (var19 - 100) * 5;
					}
				}
				if (field1584[var9] == 11) {
					int var20 = 150 - field1586[var9];
					if (var20 < 50) {
						var17 = 16777215 - var20 * 327685;
					} else if (var20 < 100) {
						var17 = (var20 - 50) * 327685 + 65280;
					} else if (var20 < 150) {
						var17 = 16777215 - (var20 - 100) * 327680;
					}
				}
				if (field1585[var9] == 0) {
					b12.centreStringTag(projectX, var16, 0, projectY + 1);
					b12.centreStringTag(projectX, var16, var17, projectY);
				}
				if (field1585[var9] == 1) {
					b12.centreStringWave(projectX, sceneCycle, 0, projectY + 1, var16);
					b12.centreStringWave(projectX, sceneCycle, var17, projectY, var16);
				}
				if (field1585[var9] == 2) {
					b12.centreStringWave2(0, var16, projectX, projectY + 1, sceneCycle);
					b12.centreStringWave2(var17, var16, projectX, projectY, sceneCycle);
				}
				if (field1585[var9] == 3) {
					b12.centreStringWave3(var16, projectX, sceneCycle, projectY + 1, 0, field1395, 150 - field1586[var9]);
					b12.centreStringWave3(var16, projectX, sceneCycle, projectY, var17, field1395, 150 - field1586[var9]);
				}
				if (field1585[var9] == 4) {
					int var21 = b12.stringWid(var16);
					int var22 = (150 - field1586[var9]) * (var21 + 100) / 150;
					Pix2D.setClipping(field1398, 334, projectX + 50, 0, projectX - 50);
					b12.drawString(0, var16, projectX + 50 - var22, projectY + 1);
					b12.drawString(var17, var16, projectX + 50 - var22, projectY);
					Pix2D.resetClipping();
				}
				if (field1585[var9] == 5) {
					int var23 = 150 - field1586[var9];
					int var24 = 0;
					if (var23 < 25) {
						var24 = var23 - 25;
					} else if (var23 > 125) {
						var24 = var23 - 125;
					}
					Pix2D.setClipping(field1398, projectY + 5, 512, projectY - b12.height - 1, 0);
					b12.centreStringTag(projectX, var16, 0, projectY + var24 + 1);
					b12.centreStringTag(projectX, var16, var17, projectY + var24);
					Pix2D.resetClipping();
				}
			} else {
				b12.centreStringTag(projectX, var16, 0, projectY + 1);
				b12.centreStringTag(projectX, var16, 16776960, projectY);
			}
		}
	}

	@ObfuscatedName("client.L(I)V")
	public void coordArrow(int arg0) {
		if (arg0 <= 0) {
			ptype = -1;
		}
		if (hintType == 2) {
			getOverlayPos((field1669 - mapBuildBaseX << 7) + field1672, field1671 * 2, (field1670 - mapBuildBaseZ << 7) + field1673);
			if (projectX > -1 && loopCycle % 20 < 10) {
				headicons[2].plotSprite(projectY - 28, field1634, projectX - 12);
			}
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public void textureRunAnims(int arg0) {
		if (lowMem) {
			return;
		}
		if (Pix3D.texCycle[17] >= arg0) {
			Pix8 var2 = Pix3D.textures[17];
			int var3 = var2.wi * var2.hi - 1;
			int var4 = var2.wi * worldUpdateNum * 2;
			byte[] var5 = var2.data;
			byte[] var6 = textureBuffer;
			for (int var7 = 0; var7 <= var3; var7++) {
				var6[var7] = var5[var7 - var4 & var3];
			}
			var2.data = var6;
			textureBuffer = var5;
			Pix3D.pushTexture(17);
		}
		if (Pix3D.texCycle[24] >= arg0) {
			Pix8 var8 = Pix3D.textures[24];
			int var9 = var8.wi * var8.hi - 1;
			int var10 = var8.wi * worldUpdateNum * 2;
			byte[] var11 = var8.data;
			byte[] var12 = textureBuffer;
			for (int var13 = 0; var13 <= var9; var13++) {
				var12[var13] = var11[var13 - var10 & var9];
			}
			var8.data = var12;
			textureBuffer = var11;
			Pix3D.pushTexture(24);
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void otherOverlays() {
		drawPrivateMessages();
		if (crossMode == 1) {
			cross[crossCycle / 100].plotSprite(crossY - 8 - 4, field1634, crossX - 8 - 4);
		}
		if (crossMode == 2) {
			cross[crossCycle / 100 + 4].plotSprite(crossY - 8 - 4, field1634, crossX - 8 - 4);
			cyclelogic5++;
			if (cyclelogic5 > 57) {
				cyclelogic5 = 0;
				out.p1enc(85);
			}
		}
		if (mainOverlayId != -1) {
			animateInterface(worldUpdateNum, mainOverlayId);
			drawInterface(0, 0, IfType.list[mainOverlayId], 0);
		}
		if (mainModalId != -1) {
			animateInterface(worldUpdateNum, mainModalId);
			drawInterface(0, 0, IfType.list[mainModalId], 0);
		}
		getSpecialArea();
		if (field1390 != -8033) {
			out.p1(186);
		}
		if (!isMenuOpen) {
			buildMinimenu();
			drawFeedback();
		} else if (menuArea == 0) {
			drawMinimenu();
		}
		if (inMultizone == 1) {
			headicons[1].plotSprite(296, field1634, 472);
		}
		if (rebootTimer != 0) {
			int var1 = rebootTimer / 50;
			int var2 = var1 / 60;
			int var3 = var1 % 60;
			if (var3 < 10) {
				p12.drawString(16776960, "System update in: " + var2 + ":0" + var3, 4, 329);
			} else {
				p12.drawString(16776960, "System update in: " + var2 + ":" + var3, 4, 329);
			}
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void drawPrivateMessages() {
		if (splitPrivateChat == 0) {
			return;
		}
		PixFont var1 = p12;
		int var2 = 0;
		if (rebootTimer != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (chatText[var3] != null) {
				int var4 = chatType[var3];
				String var5 = chatUsername[var3];
				byte var6 = 0;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					var6 = 1;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					var6 = 2;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var5))) {
					int var7 = 329 - var2 * 13;
					var1.drawString(0, "From", 4, var7);
					var1.drawString(65535, "From", 4, var7 - 1);
					int var8 = var1.stringWidTag("From ") + 4;
					if (var6 == 1) {
						modIcons[0].plotSprite(var7 - 12, field1634, var8);
						var8 += 14;
					}
					if (var6 == 2) {
						modIcons[1].plotSprite(var7 - 12, field1634, var8);
						var8 += 14;
					}
					var1.drawString(0, var5 + ": " + chatText[var3], var8, var7);
					var1.drawString(65535, var5 + ": " + chatText[var3], var8, var7 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if (var4 == 5 && chatPrivateMode < 2) {
					int var9 = 329 - var2 * 13;
					var1.drawString(0, chatText[var3], 4, var9);
					var1.drawString(65535, chatText[var3], 4, var9 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if (var4 == 6 && chatPrivateMode < 2) {
					int var10 = 329 - var2 * 13;
					var1.drawString(0, "To " + var5 + ": " + chatText[var3], 4, var10);
					var1.drawString(65535, "To " + var5 + ": " + chatText[var3], 4, var10 - 1);
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void getSpecialArea() {
		chatDisabled = 0;
		int var1 = (localPlayer.x >> 7) + mapBuildBaseX;
		int var2 = (localPlayer.z >> 7) + mapBuildBaseZ;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			chatDisabled = 1;
		}
		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			chatDisabled = 1;
		}
		if (chatDisabled == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			chatDisabled = 0;
		}
	}

	@ObfuscatedName("client.a(ILy;I)V")
	public void getOverlayPos(int arg0, ClientEntity arg1) {
		getOverlayPos(arg1.x, arg0, arg1.z);
	}

	@ObfuscatedName("client.a(IIBI)V")
	public void getOverlayPos(int arg0, int arg1, int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			projectX = -1;
			projectY = -1;
			return;
		}
		int var4 = getAvH(arg2, arg0, minusedlevel) - arg1;
		int var5 = arg0 - camX;
		int var6 = var4 - camY;
		int var7 = arg2 - camZ;
		int var8 = Model.sinTable[camPitch];
		int var9 = Model.cosTable[camPitch];
		int var10 = Model.sinTable[camYaw];
		int var11 = Model.cosTable[camYaw];
		int var12 = var7 * var10 + var5 * var11 >> 16;
		int var13 = var7 * var11 - var5 * var10 >> 16;
		int var15 = var6 * var9 - var13 * var8 >> 16;
		int var16 = var6 * var8 + var13 * var9 >> 16;
		if (var16 >= 50) {
			projectX = Pix3D.originX + (var12 << 9) / var16;
			projectY = Pix3D.originY + (var15 << 9) / var16;
		} else {
			projectX = -1;
			projectY = -1;
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public int getAvH(int arg0, int arg1, int arg2) {
		int var4 = arg1 >> 7;
		int var5 = arg0 >> 7;
		if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
			return 0;
		}
		int var6 = arg2;
		if (arg2 < 3 && (mapl[1][var4][var5] & 0x2) == 0x2) {
			var6 = arg2 + 1;
		}
		int var7 = arg1 & 0x7F;
		int var8 = arg0 & 0x7F;
		int var9 = groundh[var6][var4][var5] * (128 - var7) + groundh[var6][var4 + 1][var5] * var7 >> 7;
		int var10 = groundh[var6][var4][var5 + 1] * (128 - var7) + groundh[var6][var4 + 1][var5 + 1] * var7 >> 7;
		return var9 * (128 - var8) + var10 * var8 >> 7;
	}

	@ObfuscatedName("client.g(B)V")
	public void checkMinimap() {
		if (lowMem && sceneState == 2 && ClientBuild.minusedlevel != minusedlevel) {
			areaGame.setPixels();
			p12.centreStringTag(257, "Loading - please wait.", 0, 151);
			p12.centreStringTag(256, "Loading - please wait.", 16777215, 150);
			areaGame.draw(4, 4, super.graphics);
			sceneState = 1;
			sceneLoadStartTime = System.currentTimeMillis();
		}
		if (sceneState == 1) {
			int var1 = checkScene(field1603);
			if (var1 != 0 && System.currentTimeMillis() - sceneLoadStartTime > 360000L) {
				signlink.reporterror(loginUser + " glcfb " + loginSeed + "," + var1 + "," + lowMem + "," + fileStreams[0] + "," + onDemand.remaining() + "," + minusedlevel + "," + mapBuildCentreZoneX + "," + mapBuildCentreZoneZ);
				sceneLoadStartTime = System.currentTimeMillis();
			}
		}
		if (sceneState == 2 && minusedlevel != minimapLevel) {
			minimapLevel = minusedlevel;
			minimapBuildBuffer(minusedlevel);
		}
	}

	@ObfuscatedName("client.h(B)I")
	public int checkScene(byte arg0) {
		for (int var2 = 0; var2 < mapBuildGroundData.length; var2++) {
			if (mapBuildGroundData[var2] == null && mapBuildGroundFile[var2] != -1) {
				return -1;
			}
			if (mapBuildLocationData[var2] == null && mapBuildLocationFile[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		for (int var4 = 0; var4 < mapBuildGroundData.length; var4++) {
			byte[] var5 = mapBuildLocationData[var4];
			if (var5 != null) {
				int var6 = (mapBuildIndex[var4] >> 8) * 64 - mapBuildBaseX;
				int var7 = (mapBuildIndex[var4] & 0xFF) * 64 - mapBuildBaseZ;
				var3 &= ClientBuild.checkLocations(var7, var6, var5);
			}
		}
		if (!var3) {
			return -3;
		} else if (awaitingPlayerInfo) {
			return -4;
		} else {
			sceneState = 2;
			ClientBuild.minusedlevel = minusedlevel;
			mapBuild();
			out.p1enc(214);
			if (arg0 != 2) {
				field1450 = 384;
			}
			return 0;
		}
	}

	@ObfuscatedName("client.I(I)V")
	public void mapBuild() {
		try {
			minimapLevel = -1;
			spotanims.clear();
			projectiles.clear();
			Pix3D.clearTexels();
			clearCaches(field1463);
			world.resetMap();
			for (int var1 = 0; var1 < 4; var1++) {
				collision[var1].reset();
			}
			System.gc();
			ClientBuild var2 = new ClientBuild(groundh, 104, (byte) 9, mapl, 104);
			int var3 = mapBuildGroundData.length;
			ClientBuild.lowMem = World.lowMem;
			for (int var4 = 0; var4 < var3; var4++) {
				int var5 = mapBuildIndex[var4] >> 8;
				int var6 = mapBuildIndex[var4] & 0xFF;
				if (var5 == 33 && var6 >= 71 && var6 <= 73) {
					ClientBuild.lowMem = false;
				}
			}
			if (ClientBuild.lowMem) {
				world.fillBaseLevel(minusedlevel);
			} else {
				world.fillBaseLevel(0);
			}
			out.p1enc(181);
			for (int var7 = 0; var7 < var3; var7++) {
				int var8 = (mapBuildIndex[var7] >> 8) * 64 - mapBuildBaseX;
				int var9 = (mapBuildIndex[var7] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var10 = mapBuildGroundData[var7];
				if (var10 != null) {
					var2.loadGround((mapBuildCentreZoneZ - 6) * 8, (mapBuildCentreZoneX - 6) * 8, var10, var9, var8);
				}
			}
			for (int var11 = 0; var11 < var3; var11++) {
				int var12 = (mapBuildIndex[var11] >> 8) * 64 - mapBuildBaseX;
				int var13 = (mapBuildIndex[var11] & 0xFF) * 64 - mapBuildBaseZ;
				byte[] var14 = mapBuildGroundData[var11];
				if (var14 == null && mapBuildCentreZoneZ < 800) {
					var2.fadeAdjacent(var12, var13);
				}
			}
			out.p1enc(181);
			for (int var15 = 0; var15 < var3; var15++) {
				byte[] var16 = mapBuildLocationData[var15];
				if (var16 != null) {
					int var17 = (mapBuildIndex[var15] >> 8) * 64 - mapBuildBaseX;
					int var18 = (mapBuildIndex[var15] & 0xFF) * 64 - mapBuildBaseZ;
					var2.loadLocations(var18, var17, var16, world, collision);
				}
			}
			out.p1enc(181);
			var2.finishBuild(collision, world);
			areaGame.setPixels();
			out.p1enc(181);
			for (int var19 = 0; var19 < 104; var19++) {
				for (int var20 = 0; var20 < 104; var20++) {
					showObject(var19, var20);
				}
			}
			locChangePostBuildCorrect();
		} catch (Exception var33) {
		}
		LocType.mc1.clear();
		if (lowMem && signlink.cache_dat != null) {
			int var22 = onDemand.getFileCount(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = onDemand.getModelUse(var23);
				if ((var24 & 0x79) == 0) {
					Model.unload(var23);
				}
			}
		}
		System.gc();
		Pix3D.initPool();
		onDemand.clearPrefetches(field1369);
		int var25 = (mapBuildCentreZoneX - 6) / 8 - 1;
		int var26 = (mapBuildCentreZoneX + 6) / 8 + 1;
		int var27 = (mapBuildCentreZoneZ - 6) / 8 - 1;
		int var28 = (mapBuildCentreZoneZ + 6) / 8 + 1;
		if (withinTutorialIsland) {
			var25 = 49;
			var26 = 50;
			var27 = 49;
			var28 = 50;
		}
		for (int var29 = var25; var29 <= var26; var29++) {
			for (int var30 = var27; var30 <= var28; var30++) {
				if (var29 == var25 || var29 == var26 || var30 == var27 || var30 == var28) {
					int var31 = onDemand.getMapFile(var30, var29, 0);
					if (var31 != -1) {
						onDemand.prefetch(var31, 3);
					}
					int var32 = onDemand.getMapFile(var30, var29, 1);
					if (var32 != -1) {
						onDemand.prefetch(var32, 3);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BI)V")
	public void minimapBuildBuffer(int arg0) {
		int[] var2 = minimap.data;
		int var3 = var2.length;
		for (int var4 = 0; var4 < var3; var4++) {
			var2[var4] = 0;
		}
		for (int var5 = 1; var5 < 103; var5++) {
			int var6 = (103 - var5) * 512 * 4 + 24628;
			for (int var7 = 1; var7 < 103; var7++) {
				if ((mapl[arg0][var7][var5] & 0x18) == 0) {
					world.render2DGround(var2, var6, arg0, var7, var5);
				}
				if (arg0 < 3 && (mapl[arg0 + 1][var7][var5] & 0x8) != 0) {
					world.render2DGround(var2, var6, arg0 + 1, var7, var5);
				}
				var6 += 4;
			}
		}
		int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 0xEE - 0xA;
		int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		minimap.setPixels();
		for (int var10 = 1; var10 < 103; var10++) {
			for (int var11 = 1; var11 < 103; var11++) {
				if ((mapl[arg0][var11][var10] & 0x18) == 0) {
					drawDetail(var11, var10, var8, arg0, var9);
				}
				if (arg0 < 3 && (mapl[arg0 + 1][var11][var10] & 0x8) != 0) {
					drawDetail(var11, var10, var8, arg0 + 1, var9);
				}
			}
		}
		areaGame.setPixels();
		field1247 = 0;
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				int var14 = world.gdType(minusedlevel, var12, var13);
				if (var14 != 0) {
					int var15 = var14 >> 14 & 0x7FFF;
					int var16 = LocType.list(var15).mapfunction;
					if (var16 >= 0) {
						int var17 = var12;
						int var18 = var13;
						if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
							int[][] var19 = collision[minusedlevel].flags;
							for (int var20 = 0; var20 < 10; var20++) {
								int var21 = (int) (Math.random() * 4.0D);
								if (var21 == 0 && var17 > 0 && var17 > var12 - 3 && (var19[var17 - 1][var18] & 0x280108) == 0) {
									var17--;
								}
								if (var21 == 1 && var17 < 103 && var17 < var12 + 3 && (var19[var17 + 1][var18] & 0x280180) == 0) {
									var17++;
								}
								if (var21 == 2 && var18 > 0 && var18 > var13 - 3 && (var19[var17][var18 - 1] & 0x280102) == 0) {
									var18--;
								}
								if (var21 == 3 && var18 < 103 && var18 < var13 + 3 && (var19[var17][var18 + 1] & 0x280120) == 0) {
									var18++;
								}
							}
						}
						field1293[field1247] = mapfunction[var16];
						field1248[field1247] = var17;
						field1249[field1247] = var18;
						field1247++;
					}
				}
			}
		}
		field1625++;
		if (field1625 > 112) {
			field1625 = 0;
			out.p1enc(125);
			out.p1(50);
		}
	}

	@ObfuscatedName("client.a(IIIBII)V")
	public void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = world.wallType(arg3, arg0, arg1);
		if (var6 != 0) {
			int var7 = world.typeCode2(arg3, arg0, arg1, var6);
			int var8 = var7 >> 6 & 0x3;
			int var9 = var7 & 0x1F;
			int var10 = arg2;
			if (var6 > 0) {
				var10 = arg4;
			}
			int[] var11 = minimap.data;
			int var12 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
			int var13 = var6 >> 14 & 0x7FFF;
			LocType var14 = LocType.list(var13);
			if (var14.mapscene == -1) {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}
				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 3 + 512] = var10;
						var11[var12 + 3 + 1024] = var10;
						var11[var12 + 3 + 1536] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			} else {
				Pix8 var15 = mapscene[var14.mapscene];
				if (var15 != null) {
					int var16 = (var14.width * 4 - var15.wi) / 2;
					int var17 = (var14.length * 4 - var15.hi) / 2;
					var15.plotSprite((104 - arg1 - var14.length) * 4 + var17 + 48, field1634, arg0 * 4 + var16 + 48);
				}
			}
		}
		int var18 = world.sceneType(arg3, arg0, arg1);
		if (var18 != 0) {
			int var19 = world.typeCode2(arg3, arg0, arg1, var18);
			int var20 = var19 >> 6 & 0x3;
			int var21 = var19 & 0x1F;
			int var22 = var18 >> 14 & 0x7FFF;
			LocType var23 = LocType.list(var22);
			if (var23.mapscene != -1) {
				Pix8 var24 = mapscene[var23.mapscene];
				if (var24 != null) {
					int var25 = (var23.width * 4 - var24.wi) / 2;
					int var26 = (var23.length * 4 - var24.hi) / 2;
					var24.plotSprite((104 - arg1 - var23.length) * 4 + var26 + 48, field1634, arg0 * 4 + var25 + 48);
				}
			} else if (var21 == 9) {
				int var27 = 15658734;
				if (var18 > 0) {
					var27 = 15597568;
				}
				int[] var28 = minimap.data;
				int var29 = arg0 * 4 + (103 - arg1) * 512 * 4 + 24624;
				if (var20 == 0 || var20 == 2) {
					var28[var29 + 1536] = var27;
					var28[var29 + 1024 + 1] = var27;
					var28[var29 + 512 + 2] = var27;
					var28[var29 + 3] = var27;
				} else {
					var28[var29] = var27;
					var28[var29 + 512 + 1] = var27;
					var28[var29 + 1024 + 2] = var27;
					var28[var29 + 1536 + 3] = var27;
				}
			}
		}
		int var30 = world.gdType(arg3, arg0, arg1);
		if (var30 != 0) {
			int var31 = var30 >> 14 & 0x7FFF;
			LocType var32 = LocType.list(var31);
			if (var32.mapscene != -1) {
				Pix8 var33 = mapscene[var32.mapscene];
				if (var33 != null) {
					int var34 = (var32.width * 4 - var33.wi) / 2;
					int var35 = (var32.length * 4 - var33.hi) / 2;
					var33.plotSprite((104 - arg1 - var32.length) * 4 + var35 + 48, field1634, arg0 * 4 + var34 + 48);
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIZII)Z")
	public boolean interactWithLoc(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg0 >> 14 & 0x7FFF;
		int var6 = world.typeCode2(minusedlevel, arg3, arg2, arg0);
		if (var6 == -1) {
			return false;
		}
		int var7 = var6 & 0x1F;
		int var8 = var6 >> 6 & 0x3;
		field1628++;
		if (field1628 > 1086) {
			field1628 = 0;
			out.p1enc(154);
			out.p1(0);
			int var9 = out.pos;
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(16791);
			}
			out.p1(254);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(16128);
			out.p2(52610);
			out.p2((int) (Math.random() * 65536.0D));
			out.p2(55420);
			if ((int) (Math.random() * 2.0D) == 0) {
				out.p2(35025);
			}
			out.p2(46628);
			out.p1((int) (Math.random() * 256.0D));
			out.psize1(out.pos - var9, field1573);
		}
		if (var7 == 10 || var7 == 11 || var7 == 22) {
			LocType var10 = LocType.list(var5);
			int var11;
			int var12;
			if (var8 == 0 || var8 == 2) {
				var11 = var10.width;
				var12 = var10.length;
			} else {
				var11 = var10.length;
				var12 = var10.width;
			}
			int var13 = var10.forceapproach;
			if (var8 != 0) {
				var13 = (var13 << var8 & 0xF) + (var13 >> 4 - var8);
			}
			tryMove(var11, localPlayer.routeX[0], 0, arg2, var13, 0, false, 2, var12, arg3, localPlayer.routeZ[0]);
		} else {
			tryMove(0, localPlayer.routeX[0], var8, arg2, 0, var7 + 1, false, 2, 0, arg3, localPlayer.routeZ[0]);
		}
		crossX = super.mouseClickX;
		crossY = super.mouseClickY;
		crossMode = 2;
		crossCycle = 0;
		out.p1enc(arg1);
		out.p2(arg3 + mapBuildBaseX);
		out.p2(arg2 + mapBuildBaseZ);
		out.p2(var5);
		return true;
	}

	@ObfuscatedName("client.a(IIIIIIZIIIII)Z")
	public boolean tryMove(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		for (int var12 = 0; var12 < 104; var12++) {
			for (int var13 = 0; var13 < 104; var13++) {
				field1534[var12][var13] = 0;
				field1396[var12][var13] = 99999999;
			}
		}
		int var14 = arg1;
		int var15 = arg10;
		field1534[arg1][arg10] = 99;
		field1396[arg1][arg10] = 0;
		byte var16 = 0;
		int var17 = 0;
		field1441[0] = arg1;
		int var33 = var16 + 1;
		field1442[0] = arg10;
		boolean var18 = false;
		int var19 = field1441.length;
		int[][] var20 = collision[minusedlevel].flags;
		while (var17 != var33) {
			var14 = field1441[var17];
			var15 = field1442[var17];
			var17 = (var17 + 1) % var19;
			if (var14 == arg9 && var15 == arg3) {
				var18 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && collision[minusedlevel].testWall(arg3, arg2, arg5 - 1, arg9, var15, var14)) {
					var18 = true;
					break;
				}
				if (arg5 < 10 && collision[minusedlevel].testWDecor(arg9, var15, arg3, arg5 - 1, arg2, var14)) {
					var18 = true;
					break;
				}
			}
			if (arg0 != 0 && arg8 != 0 && collision[minusedlevel].testLoc(arg0, arg3, var15, field1379, arg8, var14, arg4, arg9)) {
				var18 = true;
				break;
			}
			int var21 = field1396[var14][var15] + 1;
			if (var14 > 0 && field1534[var14 - 1][var15] == 0 && (var20[var14 - 1][var15] & 0x280108) == 0) {
				field1441[var33] = var14 - 1;
				field1442[var33] = var15;
				var33 = (var33 + 1) % var19;
				field1534[var14 - 1][var15] = 2;
				field1396[var14 - 1][var15] = var21;
			}
			if (var14 < 103 && field1534[var14 + 1][var15] == 0 && (var20[var14 + 1][var15] & 0x280180) == 0) {
				field1441[var33] = var14 + 1;
				field1442[var33] = var15;
				var33 = (var33 + 1) % var19;
				field1534[var14 + 1][var15] = 8;
				field1396[var14 + 1][var15] = var21;
			}
			if (var15 > 0 && field1534[var14][var15 - 1] == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				field1441[var33] = var14;
				field1442[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				field1534[var14][var15 - 1] = 1;
				field1396[var14][var15 - 1] = var21;
			}
			if (var15 < 103 && field1534[var14][var15 + 1] == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				field1441[var33] = var14;
				field1442[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				field1534[var14][var15 + 1] = 4;
				field1396[var14][var15 + 1] = var21;
			}
			if (var14 > 0 && var15 > 0 && field1534[var14 - 1][var15 - 1] == 0 && (var20[var14 - 1][var15 - 1] & 0x28010E) == 0 && (var20[var14 - 1][var15] & 0x280108) == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				field1441[var33] = var14 - 1;
				field1442[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				field1534[var14 - 1][var15 - 1] = 3;
				field1396[var14 - 1][var15 - 1] = var21;
			}
			if (var14 < 103 && var15 > 0 && field1534[var14 + 1][var15 - 1] == 0 && (var20[var14 + 1][var15 - 1] & 0x280183) == 0 && (var20[var14 + 1][var15] & 0x280180) == 0 && (var20[var14][var15 - 1] & 0x280102) == 0) {
				field1441[var33] = var14 + 1;
				field1442[var33] = var15 - 1;
				var33 = (var33 + 1) % var19;
				field1534[var14 + 1][var15 - 1] = 9;
				field1396[var14 + 1][var15 - 1] = var21;
			}
			if (var14 > 0 && var15 < 103 && field1534[var14 - 1][var15 + 1] == 0 && (var20[var14 - 1][var15 + 1] & 0x280138) == 0 && (var20[var14 - 1][var15] & 0x280108) == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				field1441[var33] = var14 - 1;
				field1442[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				field1534[var14 - 1][var15 + 1] = 6;
				field1396[var14 - 1][var15 + 1] = var21;
			}
			if (var14 < 103 && var15 < 103 && field1534[var14 + 1][var15 + 1] == 0 && (var20[var14 + 1][var15 + 1] & 0x2801E0) == 0 && (var20[var14 + 1][var15] & 0x280180) == 0 && (var20[var14][var15 + 1] & 0x280120) == 0) {
				field1441[var33] = var14 + 1;
				field1442[var33] = var15 + 1;
				var33 = (var33 + 1) % var19;
				field1534[var14 + 1][var15 + 1] = 12;
				field1396[var14 + 1][var15 + 1] = var21;
			}
		}
		field1393 = 0;
		if (!var18) {
			if (arg6) {
				int var22 = 100;
				for (int var23 = 1; var23 < 2; var23++) {
					for (int var24 = arg9 - var23; var24 <= arg9 + var23; var24++) {
						for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
							if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field1396[var24][var25] < var22) {
								var22 = field1396[var24][var25];
								var14 = var24;
								var15 = var25;
								field1393 = 1;
								var18 = true;
							}
						}
					}
					if (var18) {
						break;
					}
				}
			}
			if (!var18) {
				return false;
			}
		}
		byte var26 = 0;
		field1441[0] = var14;
		int var34 = var26 + 1;
		field1442[0] = var15;
		int var27;
		int var28 = var27 = field1534[var14][var15];
		while (var14 != arg1 || var15 != arg10) {
			if (var28 != var27) {
				var27 = var28;
				field1441[var34] = var14;
				field1442[var34++] = var15;
			}
			if ((var28 & 0x2) != 0) {
				var14++;
			} else if ((var28 & 0x8) != 0) {
				var14--;
			}
			if ((var28 & 0x1) != 0) {
				var15++;
			} else if ((var28 & 0x4) != 0) {
				var15--;
			}
			var28 = field1534[var14][var15];
		}
		if (var34 > 0) {
			int var29 = var34;
			if (var34 > 25) {
				var29 = 25;
			}
			var34--;
			int var30 = field1441[var34];
			int var31 = field1442[var34];
			if (arg7 == 0) {
				out.p1enc(234);
				out.p1(var29 + var29 + 3);
			}
			if (arg7 == 1) {
				out.p1enc(236);
				out.p1(var29 + var29 + 3 + 14);
			}
			if (arg7 == 2) {
				out.p1enc(67);
				out.p1(var29 + var29 + 3);
			}
			if (super.keyHeld[5] == 1) {
				out.p1(1);
			} else {
				out.p1(0);
			}
			out.p2(var30 + mapBuildBaseX);
			out.p2(var31 + mapBuildBaseZ);
			minimapFlagX = field1441[0];
			minimapFlagZ = field1442[0];
			for (int var32 = 1; var32 < var29; var32++) {
				var34--;
				out.p1(field1441[var34] - var30);
				out.p1(field1442[var34] - var31);
			}
			return true;
		} else if (arg7 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.b(Z)Z")
	public boolean tcpIn() {
		if (stream == null) {
			return false;
		}
		try {
			int var1 = stream.available();
			if (var1 == 0) {
				return false;
			}
			if (ptype == -1) {
				stream.read(in.data, 0, 1);
				ptype = in.data[0] & 0xFF;
				if (randomIn != null) {
					ptype = ptype - randomIn.takeNextValue() & 0xFF;
				}
				psize = Protocol.SERVERPROT_SIZE[ptype];
				var1--;
			}
			if (psize == -1) {
				if (var1 <= 0) {
					return false;
				}
				stream.read(in.data, 0, 1);
				psize = in.data[0] & 0xFF;
				var1--;
			}
			if (psize == -2) {
				if (var1 <= 1) {
					return false;
				}
				stream.read(in.data, 0, 2);
				in.pos = 0;
				psize = in.g2();
				var1 -= 2;
			}
			if (var1 < psize) {
				return false;
			}
			in.pos = 0;
			stream.read(in.data, 0, psize);
			timeoutTimer = 0;
			ptype2 = ptype1;
			ptype1 = ptype0;
			ptype0 = ptype;
			if (ptype == 55) {
				int var2 = in.g2();
				int var3 = in.g2();
				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}
				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}
				mainModalId = var2;
				sideModalId = var3;
				redrawSidebar = true;
				redrawIcons = true;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}
			if (ptype == 13) {
				chatPublicMode = in.g1();
				chatPrivateMode = in.g1();
				chatTradeMode = in.g1();
				redrawChatMode = true;
				redrawChatback = true;
				ptype = -1;
				return true;
			}
			if (ptype == 195) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}
				field1357 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 46) {
				if (activeIcon == 12) {
					redrawSidebar = true;
				}
				field1626 = in.g2b();
				ptype = -1;
				return true;
			}
			if (ptype == 59) {
				int var4 = in.g2();
				String var5 = in.gstr();
				IfType.list[var4].text = var5;
				if (IfType.list[var4].layerId == sideIcon[activeIcon]) {
					redrawSidebar = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 120) {
				field1536 = in.g2();
				field1510 = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 79) {
				int var6 = in.g2();
				int var7 = in.g2b();
				int var8 = in.g2b();
				IfType var9 = IfType.list[var6];
				var9.field80 = var7;
				var9.field81 = var8;
				ptype = -1;
				return true;
			}
			if (ptype == 252) {
				int var10 = in.g2();
				ifAnimReset(var10);
				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}
				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}
				sideModalId = var10;
				redrawSidebar = true;
				redrawIcons = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}
			if (ptype == 115) {
				hintType = in.g1();
				if (hintType == 1) {
					field1322 = in.g2();
				}
				if (hintType >= 2 && hintType <= 6) {
					if (hintType == 2) {
						field1672 = 64;
						field1673 = 64;
					}
					if (hintType == 3) {
						field1672 = 0;
						field1673 = 64;
					}
					if (hintType == 4) {
						field1672 = 128;
						field1673 = 64;
					}
					if (hintType == 5) {
						field1672 = 64;
						field1673 = 0;
					}
					if (hintType == 6) {
						field1672 = 64;
						field1673 = 128;
					}
					hintType = 2;
					field1669 = in.g2();
					field1670 = in.g2();
					field1671 = in.g1();
				}
				if (hintType == 10) {
					field1330 = in.g2();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 211) {
				int var11 = in.g2();
				int var12 = in.g2b();
				IfType var13 = IfType.list[var11];
				var13.modelAnim = var12;
				if (var12 == -1) {
					var13.animFrame = 0;
					var13.animCycle = 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 136) {
				minimapState = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 91 || ptype == 117 || ptype == 83 || ptype == 176 || ptype == 233 || ptype == 87 || ptype == 71 || ptype == 60 || ptype == 106 || ptype == 194 || ptype == 90) {
				zonePacket(in, ptype);
				ptype = -1;
				return true;
			}
			if (ptype == 28) {
				int var14 = in.g2();
				IfType var15 = IfType.list[var14];
				for (int var16 = 0; var16 < var15.linkObjType.length; var16++) {
					var15.linkObjType[var16] = -1;
					var15.linkObjType[var16] = 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 144) {
				field1458 = in.g1();
				field1459 = in.g1();
				for (int var17 = field1458; var17 < field1458 + 8; var17++) {
					for (int var18 = field1459; var18 < field1459 + 8; var18++) {
						if (groundObj[minusedlevel][var17][var18] != null) {
							groundObj[minusedlevel][var17][var18] = null;
							showObject(var17, var18);
						}
					}
				}
				for (LocChange var19 = (LocChange) locChanges.head(); var19 != null; var19 = (LocChange) locChanges.next()) {
					if (var19.x >= field1458 && var19.x < field1458 + 8 && var19.z >= field1459 && var19.z < field1459 + 8 && var19.level == minusedlevel) {
						var19.endTime = 0;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 154) {
				redrawSidebar = true;
				int var20 = in.g1();
				int var21 = in.g4();
				int var22 = in.g1();
				field1272[var20] = var21;
				field1456[var20] = var22;
				field1511[var20] = 1;
				for (int var23 = 0; var23 < 98; var23++) {
					if (var21 >= skillxp[var23]) {
						field1511[var20] = var23 + 2;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 181) {
				tutFlashIcon = in.g1();
				if (tutFlashIcon == activeIcon) {
					if (tutFlashIcon == 3) {
						activeIcon = 1;
					} else {
						activeIcon = 3;
					}
					redrawSidebar = true;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 73) {
				cinemaCam = true;
				camMoveToLx = in.g1();
				camMoveToLz = in.g1();
				camMoveToHei = in.g2();
				camMoveToRate = in.g1();
				camMoveToRate2 = in.g1();
				if (camMoveToRate2 >= 100) {
					camX = camMoveToLx * 128 + 64;
					camZ = camMoveToLz * 128 + 64;
					camY = getAvH(camZ, camX, minusedlevel) - camMoveToHei;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 188) {
				getPlayerPos(psize, in);
				awaitingPlayerInfo = false;
				ptype = -1;
				return true;
			}
			if (ptype == 244) {
				int var24 = in.g2();
				int var25 = in.g2();
				IfType.list[var24].model1Type = 2;
				IfType.list[var24].model1Id = var25;
				ptype = -1;
				return true;
			}
			if (ptype == 121) {
				logout();
				ptype = -1;
				return false;
			}
			if (ptype == 119) {
				int var26 = in.g2();
				ifAnimReset(var26);
				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}
				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}
				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}
				mainModalId = var26;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}
			if (ptype == 168) {
				long var27 = in.g8();
				int var29 = in.g1();
				String var30 = JString.toSentenceCase(JString.toRawUsername(var27));
				for (int var31 = 0; var31 < friendCount; var31++) {
					if (var27 == friendUserhash[var31]) {
						if (friendNodeId[var31] != var29) {
							friendNodeId[var31] = var29;
							redrawSidebar = true;
							if (var29 > 0) {
								addChat(5, var30 + " has logged in.", "");
							}
							if (var29 == 0) {
								addChat(5, var30 + " has logged out.", "");
							}
						}
						var30 = null;
						break;
					}
				}
				if (var30 != null && friendCount < 200) {
					friendUserhash[friendCount] = var27;
					friendUsername[friendCount] = var30;
					friendNodeId[friendCount] = var29;
					friendCount++;
					redrawSidebar = true;
				}
				boolean var32 = false;
				while (!var32) {
					var32 = true;
					for (int var33 = 0; var33 < friendCount - 1; var33++) {
						if (friendNodeId[var33] != nodeId && friendNodeId[var33 + 1] == nodeId || friendNodeId[var33] == 0 && friendNodeId[var33 + 1] != 0) {
							int var34 = friendNodeId[var33];
							friendNodeId[var33] = friendNodeId[var33 + 1];
							friendNodeId[var33 + 1] = var34;
							String var35 = friendUsername[var33];
							friendUsername[var33] = friendUsername[var33 + 1];
							friendUsername[var33 + 1] = var35;
							long var36 = friendUserhash[var33];
							friendUserhash[var33] = friendUserhash[var33 + 1];
							friendUserhash[var33 + 1] = var36;
							redrawSidebar = true;
							var32 = false;
						}
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 164) {
				minimapFlagX = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 243) {
				long var38 = in.g8();
				int var40 = in.g4();
				int var41 = in.g1();
				boolean var42 = false;
				for (int var43 = 0; var43 < 100; var43++) {
					if (field1437[var43] == var40) {
						var42 = true;
						break;
					}
				}
				if (var41 <= 1) {
					for (int var44 = 0; var44 < ignoreCount; var44++) {
						if (ignoreUserhash[var44] == var38) {
							var42 = true;
							break;
						}
					}
				}
				if (!var42 && chatDisabled == 0) {
					try {
						field1437[field1349] = var40;
						field1349 = (field1349 + 1) % 100;
						String var45 = WordPack.unpack(in, psize - 13);
						String var46 = WordFilter.method397(var45, field1663);
						if (var41 == 2 || var41 == 3) {
							addChat(7, var46, "@cr2@" + JString.toSentenceCase(JString.toRawUsername(var38)));
						} else if (var41 == 1) {
							addChat(7, var46, "@cr1@" + JString.toSentenceCase(JString.toRawUsername(var38)));
						} else {
							addChat(3, var46, JString.toSentenceCase(JString.toRawUsername(var38)));
						}
					} catch (Exception var163) {
						signlink.reporterror("cde1");
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 208) {
				int var48 = in.g1();
				int var49 = in.g1();
				int var50 = in.g1();
				int var51 = in.g1();
				camShake[var48] = true;
				camShakeAxis[var48] = var49;
				camShakeRan[var48] = var50;
				camShakeAmp[var48] = var51;
				camShakeCycle[var48] = 0;
				ptype = -1;
				return true;
			}
			if (ptype == 107) {
				redrawSidebar = true;
				int var52 = in.g2();
				IfType var53 = IfType.list[var52];
				int var54 = in.g2();
				for (int var55 = 0; var55 < var54; var55++) {
					var53.linkObjType[var55] = in.g2();
					int var56 = in.g1();
					if (var56 == 255) {
						var56 = in.g4();
					}
					var53.linkObjNumber[var55] = var56;
				}
				for (int var57 = var54; var57 < var53.linkObjType.length; var57++) {
					var53.linkObjType[var57] = 0;
					var53.linkObjNumber[var57] = 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 12) {
				int var58 = in.g2b();
				tutComId = var58;
				redrawChatback = true;
				ptype = -1;
				return true;
			}
			if (ptype == 219) {
				int var59 = in.g2();
				int var60 = in.g2();
				if (mapBuildCentreZoneX == var59 && mapBuildCentreZoneZ == var60 && sceneState == 2) {
					ptype = -1;
					return true;
				}
				mapBuildCentreZoneX = var59;
				mapBuildCentreZoneZ = var60;
				mapBuildBaseX = (mapBuildCentreZoneX - 6) * 8;
				mapBuildBaseZ = (mapBuildCentreZoneZ - 6) * 8;
				withinTutorialIsland = false;
				if ((mapBuildCentreZoneX / 8 == 48 || mapBuildCentreZoneX / 8 == 49) && mapBuildCentreZoneZ / 8 == 48) {
					withinTutorialIsland = true;
				}
				if (mapBuildCentreZoneX / 8 == 48 && mapBuildCentreZoneZ / 8 == 148) {
					withinTutorialIsland = true;
				}
				sceneState = 1;
				sceneLoadStartTime = System.currentTimeMillis();
				areaGame.setPixels();
				p12.centreStringTag(257, "Loading - please wait.", 0, 151);
				p12.centreStringTag(256, "Loading - please wait.", 16777215, 150);
				areaGame.draw(4, 4, super.graphics);
				int var61 = 0;
				for (int var62 = (mapBuildCentreZoneX - 6) / 8; var62 <= (mapBuildCentreZoneX + 6) / 8; var62++) {
					for (int var63 = (mapBuildCentreZoneZ - 6) / 8; var63 <= (mapBuildCentreZoneZ + 6) / 8; var63++) {
						var61++;
					}
				}
				mapBuildGroundData = new byte[var61][];
				mapBuildLocationData = new byte[var61][];
				mapBuildIndex = new int[var61];
				mapBuildGroundFile = new int[var61];
				mapBuildLocationFile = new int[var61];
				int var64 = 0;
				for (int var65 = (mapBuildCentreZoneX - 6) / 8; var65 <= (mapBuildCentreZoneX + 6) / 8; var65++) {
					for (int var66 = (mapBuildCentreZoneZ - 6) / 8; var66 <= (mapBuildCentreZoneZ + 6) / 8; var66++) {
						mapBuildIndex[var64] = (var65 << 8) + var66;
						if (withinTutorialIsland && (var66 == 49 || var66 == 149 || var66 == 147 || var65 == 50 || var65 == 49 && var66 == 47)) {
							mapBuildGroundFile[var64] = -1;
							mapBuildLocationFile[var64] = -1;
							var64++;
						} else {
							int var67 = mapBuildGroundFile[var64] = onDemand.getMapFile(var66, var65, 0);
							if (var67 != -1) {
								onDemand.request(3, var67);
							}
							int var68 = mapBuildLocationFile[var64] = onDemand.getMapFile(var66, var65, 1);
							if (var68 != -1) {
								onDemand.request(3, var68);
							}
							var64++;
						}
					}
				}
				int var69 = mapBuildBaseX - field1607;
				int var70 = mapBuildBaseZ - field1608;
				field1607 = mapBuildBaseX;
				field1608 = mapBuildBaseZ;
				for (int var71 = 0; var71 < 16384; var71++) {
					ClientNpc var72 = npc[var71];
					if (var72 != null) {
						for (int var73 = 0; var73 < 10; var73++) {
							var72.routeX[var73] -= var69;
							var72.routeZ[var73] -= var70;
						}
						var72.x -= var69 * 128;
						var72.z -= var70 * 128;
					}
				}
				for (int var74 = 0; var74 < MAX_PLAYER_COUNT; var74++) {
					ClientPlayer var75 = players[var74];
					if (var75 != null) {
						for (int var76 = 0; var76 < 10; var76++) {
							var75.routeX[var76] -= var69;
							var75.routeZ[var76] -= var70;
						}
						var75.x -= var69 * 128;
						var75.z -= var70 * 128;
					}
				}
				awaitingPlayerInfo = true;
				byte var77 = 0;
				byte var78 = 104;
				byte var79 = 1;
				if (var69 < 0) {
					var77 = 103;
					var78 = -1;
					var79 = -1;
				}
				byte var80 = 0;
				byte var81 = 104;
				byte var82 = 1;
				if (var70 < 0) {
					var80 = 103;
					var81 = -1;
					var82 = -1;
				}
				for (int var83 = var77; var83 != var78; var83 += var79) {
					for (int var84 = var80; var84 != var81; var84 += var82) {
						int var85 = var83 + var69;
						int var86 = var84 + var70;
						for (int var87 = 0; var87 < 4; var87++) {
							if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
								groundObj[var87][var83][var84] = groundObj[var87][var85][var86];
							} else {
								groundObj[var87][var83][var84] = null;
							}
						}
					}
				}
				for (LocChange var88 = (LocChange) locChanges.head(); var88 != null; var88 = (LocChange) locChanges.next()) {
					var88.x -= var69;
					var88.z -= var70;
					if (var88.x < 0 || var88.z < 0 || var88.x >= 104 || var88.z >= 104) {
						var88.unlink();
					}
				}
				if (minimapFlagX != 0) {
					minimapFlagX -= var69;
					minimapFlagZ -= var70;
				}
				cinemaCam = false;
				ptype = -1;
				return true;
			}
			if (ptype == 63) {
				int var89 = in.g2();
				int var90 = in.g1();
				if (var89 == 65535) {
					var89 = -1;
				}
				sideIcon[var90] = var89;
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}
			if (ptype == 184) {
				int var91 = in.g2();
				int var92 = in.g2();
				IfType var93 = IfType.list[var91];
				if (var93 != null && var93.type == 0) {
					if (var92 < 0) {
						var92 = 0;
					}
					if (var92 > var93.scrollHeight - var93.height) {
						var92 = var93.scrollHeight - var93.height;
					}
					var93.scrollPos = var92;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 204) {
				rebootTimer = in.g2() * 30;
				ptype = -1;
				return true;
			}
			if (ptype == 253) {
				lastAddress = in.g4();
				daysSinceLastLogin = in.g2();
				daysSinceRecoveriesChanged = in.g1();
				unreadMessages = in.g2();
				warnMembersInNonMembers = in.g1();
				if (lastAddress != 0 && mainModalId == -1) {
					signlink.dnslookup(JString.formatIPv4(lastAddress));
					closeModal();
					short var94 = 650;
					if (daysSinceRecoveriesChanged != 201 || warnMembersInNonMembers == 1) {
						var94 = 655;
					}
					reportAbuseInput = "";
					reportAbuseMuteOption = false;
					for (int var95 = 0; var95 < IfType.list.length; var95++) {
						if (IfType.list[var95] != null && IfType.list[var95].clientCode == var94) {
							mainModalId = IfType.list[var95].layerId;
							break;
						}
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 30) {
				int var96 = in.g2();
				IfType.list[var96].model1Type = 3;
				if (localPlayer.transmog == null) {
					IfType.list[var96].model1Id = (localPlayer.colour[0] << 24) + (localPlayer.colour[4] << 18) + (localPlayer.appearance[0] << 12) + (localPlayer.appearance[8] << 6) + localPlayer.appearance[11];
				} else {
					IfType.list[var96].model1Id = (int) (localPlayer.transmog.id + 305419896L);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 23) {
				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}
				if (chatComId != -1) {
					chatComId = -1;
					redrawChatback = true;
				}
				if (dialogInputOpen) {
					dialogInputOpen = false;
					redrawChatback = true;
				}
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}
			if (ptype == 21) {
				int var97 = in.g1();
				int var98 = in.g1();
				String var99 = in.gstr();
				if (var97 >= 1 && var97 <= 5) {
					if (var99.equalsIgnoreCase("null")) {
						var99 = null;
					}
					playerOp[var97 - 1] = var99;
					playerOpPriority[var97 - 1] = var98 == 0;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 189) {
				activeIcon = in.g1();
				redrawSidebar = true;
				redrawIcons = true;
				ptype = -1;
				return true;
			}
			if (ptype == 196) {
				String var100 = in.gstr();
				if (var100.endsWith(":tradereq:")) {
					String var101 = var100.substring(0, var100.indexOf(":"));
					long var102 = JString.toUserhash(var101);
					boolean var104 = false;
					for (int var105 = 0; var105 < ignoreCount; var105++) {
						if (ignoreUserhash[var105] == var102) {
							var104 = true;
							break;
						}
					}
					if (!var104 && chatDisabled == 0) {
						addChat(4, "wishes to trade with you.", var101);
					}
				} else if (var100.endsWith(":duelreq:")) {
					String var106 = var100.substring(0, var100.indexOf(":"));
					long var107 = JString.toUserhash(var106);
					boolean var109 = false;
					for (int var110 = 0; var110 < ignoreCount; var110++) {
						if (ignoreUserhash[var110] == var107) {
							var109 = true;
							break;
						}
					}
					if (!var109 && chatDisabled == 0) {
						addChat(8, "wishes to duel with you.", var106);
					}
				} else if (var100.endsWith(":chalreq:")) {
					String var111 = var100.substring(0, var100.indexOf(":"));
					long var112 = JString.toUserhash(var111);
					boolean var114 = false;
					for (int var115 = 0; var115 < ignoreCount; var115++) {
						if (ignoreUserhash[var115] == var112) {
							var114 = true;
							break;
						}
					}
					if (!var114 && chatDisabled == 0) {
						String var116 = var100.substring(var100.indexOf(":") + 1, var100.length() - 9);
						addChat(8, var116, var111);
					}
				} else {
					addChat(0, var100, "");
				}
				ptype = -1;
				return true;
			}
			if (ptype == 18) {
				int var117 = in.g2();
				int var118 = in.g2();
				int var119 = in.g2();
				if (var118 == 65535) {
					IfType.list[var117].model1Type = 0;
					ptype = -1;
					return true;
				}
				ObjType var120 = ObjType.list(var118);
				IfType.list[var117].model1Type = 4;
				IfType.list[var117].model1Id = var118;
				IfType.list[var117].modelXAn = var120.xan2d;
				IfType.list[var117].modelYAn = var120.yan2d;
				IfType.list[var117].modelZoom = var120.zoom2d * 100 / var119;
				ptype = -1;
				return true;
			}
			if (ptype == 187) {
				int var121 = in.g2();
				if (var121 == 65535) {
					var121 = -1;
				}
				if (var121 != nextMidiSong && midiActive && !lowMem && nextMidiDelay == 0) {
					midiSong = var121;
					midiFading = true;
					onDemand.request(2, midiSong);
				}
				nextMidiSong = var121;
				ptype = -1;
				return true;
			}
			if (ptype == 29) {
				int var122 = in.g2();
				int var123 = in.g2();
				if (midiActive && !lowMem) {
					midiSong = var122;
					midiFading = false;
					onDemand.request(2, midiSong);
					nextMidiDelay = var123;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 177) {
				int var124 = in.g2();
				int var125 = in.g1();
				int var126 = in.g2();
				if (waveEnabled && !lowMem && waveCount < 50) {
					waveIds[waveCount] = var124;
					waveLoops[waveCount] = var125;
					waveDelay[waveCount] = var126 + JagFX.delays[var124];
					waveCount++;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 112) {
				field1458 = in.g1();
				field1459 = in.g1();
				while (in.pos < psize) {
					int var127 = in.g1();
					zonePacket(in, var127);
				}
				ptype = -1;
				return true;
			}
			if (ptype == 172) {
				for (int var128 = 0; var128 < var.length; var128++) {
					if (var[var128] != field1445[var128]) {
						var[var128] = field1445[var128];
						clientVar(var128);
						redrawSidebar = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 160) {
				int var129 = in.g2();
				int var130 = in.g2();
				int var131 = var130 >> 10 & 0x1F;
				int var132 = var130 >> 5 & 0x1F;
				int var133 = var130 & 0x1F;
				IfType.list[var129].colour = (var131 << 19) + (var132 << 11) + (var133 << 3);
				ptype = -1;
				return true;
			}
			if (ptype == 47) {
				ignoreCount = psize / 8;
				for (int var134 = 0; var134 < ignoreCount; var134++) {
					ignoreUserhash[var134] = in.g8();
				}
				ptype = -1;
				return true;
			}
			if (ptype == 65) {
				getNpcPos(psize, in);
				ptype = -1;
				return true;
			}
			if (ptype == 222) {
				int var135 = in.g2();
				int var136 = in.g2();
				IfType.list[var135].model1Type = 1;
				IfType.list[var135].model1Id = var136;
				ptype = -1;
				return true;
			}
			if (ptype == 127) {
				int var137 = in.g2b();
				if (var137 >= 0) {
					ifAnimReset(var137);
				}
				mainOverlayId = var137;
				ptype = -1;
				return true;
			}
			if (ptype == 75) {
				int var138 = in.g2();
				byte var139 = in.g1b();
				field1445[var138] = var139;
				if (var[var138] != var139) {
					var[var138] = var139;
					clientVar(var138);
					redrawSidebar = true;
					if (tutComId != -1) {
						redrawChatback = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 82) {
				cinemaCam = true;
				camLookAtLx = in.g1();
				camLookAtLz = in.g1();
				camLookAtHei = in.g2();
				camLookAtRate = in.g1();
				camLookAtRate2 = in.g1();
				if (camLookAtRate2 >= 100) {
					int var140 = camLookAtLx * 128 + 64;
					int var141 = camLookAtLz * 128 + 64;
					int var142 = getAvH(var141, var140, minusedlevel) - camLookAtHei;
					int var143 = var140 - camX;
					int var144 = var142 - camY;
					int var145 = var141 - camZ;
					int var146 = (int) Math.sqrt((double) (var143 * var143 + var145 * var145));
					camPitch = (int) (Math.atan2((double) var144, (double) var146) * 325.949D) & 0x7FF;
					camYaw = (int) (Math.atan2((double) var143, (double) var145) * -325.949D) & 0x7FF;
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
			if (ptype == 81) {
				int var147 = in.g2();
				ifAnimReset(var147);
				if (sideModalId != -1) {
					sideModalId = -1;
					redrawSidebar = true;
					redrawIcons = true;
				}
				chatComId = var147;
				redrawChatback = true;
				mainModalId = -1;
				resumedPauseButton = false;
				ptype = -1;
				return true;
			}
			if (ptype == 138) {
				int var148 = in.g2();
				boolean var149 = in.g1() == 1;
				IfType.list[var148].hide = var149;
				ptype = -1;
				return true;
			}
			if (ptype == 247) {
				inMultizone = in.g1();
				ptype = -1;
				return true;
			}
			if (ptype == 235) {
				friendServerStatus = in.g1();
				redrawSidebar = true;
				ptype = -1;
				return true;
			}
			if (ptype == 76) {
				redrawSidebar = true;
				int var150 = in.g2();
				IfType var151 = IfType.list[var150];
				while (in.pos < psize) {
					int var152 = in.gsmart();
					int var153 = in.g2();
					int var154 = in.g1();
					if (var154 == 255) {
						var154 = in.g4();
					}
					if (var152 >= 0 && var152 < var151.linkObjType.length) {
						var151.linkObjType[var152] = var153;
						var151.linkObjNumber[var152] = var154;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 201) {
				for (int var155 = 0; var155 < players.length; var155++) {
					if (players[var155] != null) {
						players[var155].primaryAnim = -1;
					}
				}
				for (int var156 = 0; var156 < npc.length; var156++) {
					if (npc[var156] != null) {
						npc[var156].primaryAnim = -1;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 35) {
				socialInputOpen = false;
				dialogInputOpen = true;
				dialogInput = "";
				redrawChatback = true;
				ptype = -1;
				return true;
			}
			if (ptype == 133) {
				cinemaCam = false;
				for (int var157 = 0; var157 < 5; var157++) {
					camShake[var157] = false;
				}
				ptype = -1;
				return true;
			}
			if (ptype == 97) {
				int var158 = in.g2();
				int var159 = in.g4();
				field1445[var158] = var159;
				if (var[var158] != var159) {
					var[var158] = var159;
					clientVar(var158);
					redrawSidebar = true;
					if (tutComId != -1) {
						redrawChatback = true;
					}
				}
				ptype = -1;
				return true;
			}
			if (ptype == 155) {
				field1458 = in.g1();
				field1459 = in.g1();
				ptype = -1;
				return true;
			}
			signlink.reporterror("T1 - " + ptype + "," + psize + " - " + ptype1 + "," + ptype2);
			logout();
		} catch (IOException var164) {
			lostCon();
		} catch (Exception var165) {
			String var161 = "T2 - " + ptype + "," + ptype1 + "," + ptype2 + " - " + psize + "," + (mapBuildBaseX + localPlayer.routeX[0]) + "," + (mapBuildBaseZ + localPlayer.routeZ[0]) + " - ";
			for (int var162 = 0; var162 < psize && var162 < 50; var162++) {
				var161 = var161 + in.data[var162] + ",";
			}
			signlink.reporterror(var161);
			logout();
		}
		return true;
	}

	@ObfuscatedName("client.a(Llb;II)V")
	public void zonePacket(Packet arg0, int arg1) {
		if (arg1 == 90 || arg1 == 194) {
			int var3 = arg0.g1();
			int var4 = field1458 + (var3 >> 4 & 0x7);
			int var5 = field1459 + (var3 & 0x7);
			int var6 = arg0.g1();
			int var7 = var6 >> 2;
			int var8 = var6 & 0x3;
			int var9 = field1563[var7];
			int var10;
			if (arg1 == 194) {
				var10 = -1;
			} else {
				var10 = arg0.g2();
			}
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				locChangeCreate(0, minusedlevel, var10, var7, var5, var8, -1, var9, var4);
			}
		} else if (arg1 == 106) {
			int var11 = arg0.g1();
			int var12 = field1458 + (var11 >> 4 & 0x7);
			int var13 = field1459 + (var11 & 0x7);
			int var14 = arg0.g1();
			int var15 = var14 >> 2;
			int var16 = var14 & 0x3;
			int var17 = field1563[var15];
			int var18 = arg0.g2();
			if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
				int var19 = groundh[minusedlevel][var12][var13];
				int var20 = groundh[minusedlevel][var12 + 1][var13];
				int var21 = groundh[minusedlevel][var12 + 1][var13 + 1];
				int var22 = groundh[minusedlevel][var12][var13 + 1];
				if (var17 == 0) {
					Wall var23 = world.getWall(minusedlevel, var12, var13);
					if (var23 != null) {
						int var24 = var23.field271 >> 14 & 0x7FFF;
						if (var15 == 2) {
							var23.field269 = new ClientLocAnim(var16 + 4, var24, 2, var22, var21, false, var19, var18, false, var20);
							var23.field270 = new ClientLocAnim(var16 + 1 & 0x3, var24, 2, var22, var21, false, var19, var18, false, var20);
						} else {
							var23.field269 = new ClientLocAnim(var16, var24, var15, var22, var21, false, var19, var18, false, var20);
						}
					}
				}
				if (var17 == 1) {
					Decor var25 = world.method73(var13, minusedlevel, var12);
					if (var25 != null) {
						var25.model = new ClientLocAnim(0, var25.field162 >> 14 & 0x7FFF, 4, var22, var21, false, var19, var18, false, var20);
					}
				}
				if (var17 == 2) {
					Sprite var26 = world.method74(var12, var13, minusedlevel);
					if (var15 == 11) {
						var15 = 10;
					}
					if (var26 != null) {
						var26.model = new ClientLocAnim(var16, var26.field262 >> 14 & 0x7FFF, var15, var22, var21, false, var19, var18, false, var20);
					}
				}
				if (var17 == 3) {
					GroundDecor var27 = world.method75(minusedlevel, var13, var12);
					if (var27 != null) {
						var27.model = new ClientLocAnim(var16, var27.field194 >> 14 & 0x7FFF, 22, var22, var21, false, var19, var18, false, var20);
					}
				}
			}
		} else if (arg1 == 60) {
			int var28 = arg0.g1();
			int var29 = field1458 + (var28 >> 4 & 0x7);
			int var30 = field1459 + (var28 & 0x7);
			int var31 = arg0.g2();
			int var32 = arg0.g2();
			if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
				ClientObj var33 = new ClientObj();
				var33.id = var31;
				var33.count = var32;
				if (groundObj[minusedlevel][var29][var30] == null) {
					groundObj[minusedlevel][var29][var30] = new LinkList(-199);
				}
				groundObj[minusedlevel][var29][var30].push(var33);
				showObject(var29, var30);
			}
		} else if (arg1 == 71) {
			int var34 = arg0.g1();
			int var35 = field1458 + (var34 >> 4 & 0x7);
			int var36 = field1459 + (var34 & 0x7);
			int var37 = arg0.g2();
			if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
				LinkList var38 = groundObj[minusedlevel][var35][var36];
				if (var38 != null) {
					for (ClientObj var39 = (ClientObj) var38.head(); var39 != null; var39 = (ClientObj) var38.next()) {
						if (var39.id == (var37 & 0x7FFF)) {
							var39.unlink();
							break;
						}
					}
					if (var38.head() == null) {
						groundObj[minusedlevel][var35][var36] = null;
					}
					showObject(var35, var36);
				}
			}
		} else if (arg1 == 87) {
			int var40 = arg0.g1();
			int var41 = field1458 + (var40 >> 4 & 0x7);
			int var42 = field1459 + (var40 & 0x7);
			int var43 = var41 + arg0.g1b();
			int var44 = var42 + arg0.g1b();
			int var45 = arg0.g2b();
			int var46 = arg0.g2();
			int var47 = arg0.g1() * 4;
			int var48 = arg0.g1() * 4;
			int var49 = arg0.g2();
			int var50 = arg0.g2();
			int var51 = arg0.g1();
			int var52 = arg0.g1();
			if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
				int var53 = var41 * 128 + 64;
				int var54 = var42 * 128 + 64;
				int var55 = var43 * 128 + 64;
				int var56 = var44 * 128 + 64;
				ClientProj var57 = new ClientProj(var52, getAvH(var54, var53, minusedlevel) - var47, var49 + loopCycle, var46, var53, var45, minusedlevel, var54, var50 + loopCycle, var51, false, var48);
				var57.setTarget(getAvH(var56, var55, minusedlevel) - var48, var56, var49 + loopCycle, var55);
				projectiles.push(var57);
			}
		} else if (arg1 == 233) {
			int var58 = arg0.g1();
			int var59 = field1458 + (var58 >> 4 & 0x7);
			int var60 = field1459 + (var58 & 0x7);
			int var61 = arg0.g2();
			int var62 = arg0.g1();
			int var63 = arg0.g2();
			if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
				int var64 = var59 * 128 + 64;
				int var65 = var60 * 128 + 64;
				MapSpotAnim var66 = new MapSpotAnim(var64, minusedlevel, getAvH(var65, var64, minusedlevel) - var62, var63, true, var65, var61, loopCycle);
				spotanims.push(var66);
			}
		} else if (arg1 == 176) {
			int var67 = arg0.g1();
			int var68 = field1458 + (var67 >> 4 & 0x7);
			int var69 = field1459 + (var67 & 0x7);
			int var70 = arg0.g2();
			int var71 = arg0.g2();
			int var72 = arg0.g2();
			if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var72 != field1536) {
				ClientObj var73 = new ClientObj();
				var73.id = var70;
				var73.count = var71;
				if (groundObj[minusedlevel][var68][var69] == null) {
					groundObj[minusedlevel][var68][var69] = new LinkList(-199);
				}
				groundObj[minusedlevel][var68][var69].push(var73);
				showObject(var68, var69);
			}
		} else if (arg1 == 83) {
			int var74 = arg0.g1();
			int var75 = field1458 + (var74 >> 4 & 0x7);
			int var76 = field1459 + (var74 & 0x7);
			int var77 = arg0.g1();
			int var78 = var77 >> 2;
			int var79 = var77 & 0x3;
			int var80 = field1563[var78];
			int var81 = arg0.g2();
			int var82 = arg0.g2();
			int var83 = arg0.g2();
			int var84 = arg0.g2();
			byte var85 = arg0.g1b();
			byte var86 = arg0.g1b();
			byte var87 = arg0.g1b();
			byte var88 = arg0.g1b();
			ClientPlayer var89;
			if (var84 == field1536) {
				var89 = localPlayer;
			} else {
				var89 = players[var84];
			}
			if (var89 != null) {
				LocType var90 = LocType.list(var81);
				int var91 = groundh[minusedlevel][var75][var76];
				int var92 = groundh[minusedlevel][var75 + 1][var76];
				int var93 = groundh[minusedlevel][var75 + 1][var76 + 1];
				int var94 = groundh[minusedlevel][var75][var76 + 1];
				Model var95 = var90.getModel(var78, var79, var91, var92, var93, var94, -1);
				if (var95 != null) {
					locChangeCreate(var82 + 1, minusedlevel, -1, 0, var76, 0, var83 + 1, var80, var75);
					var89.locStartCycle = var82 + loopCycle;
					var89.locStopCycle = var83 + loopCycle;
					var89.locModel = var95;
					int var96 = var90.width;
					int var97 = var90.length;
					if (var79 == 1 || var79 == 3) {
						var96 = var90.length;
						var97 = var90.width;
					}
					var89.locOffsetX = var75 * 128 + var96 * 64;
					var89.locOffsetZ = var76 * 128 + var97 * 64;
					var89.locOffsetY = getAvH(var89.locOffsetZ, var89.locOffsetX, minusedlevel);
					if (var85 > var87) {
						byte var98 = var85;
						var85 = var87;
						var87 = var98;
					}
					if (var86 > var88) {
						byte var99 = var86;
						var86 = var88;
						var88 = var99;
					}
					var89.field473 = var75 + var85;
					var89.field475 = var75 + var87;
					var89.field474 = var76 + var86;
					var89.field476 = var76 + var88;
				}
			}
		} else if (arg1 == 117) {
			int var100 = arg0.g1();
			int var101 = field1458 + (var100 >> 4 & 0x7);
			int var102 = field1459 + (var100 & 0x7);
			int var103 = arg0.g2();
			int var104 = arg0.g2();
			int var105 = arg0.g2();
			if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
				LinkList var106 = groundObj[minusedlevel][var101][var102];
				if (var106 != null) {
					for (ClientObj var107 = (ClientObj) var106.head(); var107 != null; var107 = (ClientObj) var106.next()) {
						if (var107.id == (var103 & 0x7FFF) && var107.count == var104) {
							var107.count = var105;
							break;
						}
					}
					showObject(var101, var102);
				}
			}
		} else if (arg1 == 91) {
			int var108 = arg0.g1();
			int var109 = field1458 + (var108 >> 4 & 0x7);
			int var110 = field1459 + (var108 & 0x7);
			int var111 = arg0.g2();
			int var112 = arg0.g1();
			int var113 = var112 >> 4 & 0xF;
			int var114 = var112 & 0x7;
			if (localPlayer.routeX[0] >= var109 - var113 && localPlayer.routeX[0] <= var109 + var113 && localPlayer.routeZ[0] >= var110 - var113 && localPlayer.routeZ[0] <= var110 + var113 && waveEnabled && !lowMem && waveCount < 50) {
				waveIds[waveCount] = var111;
				waveLoops[waveCount] = var114;
				waveDelay[waveCount] = JagFX.delays[var111];
				waveCount++;
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		LocChange var10 = null;
		for (LocChange var11 = (LocChange) locChanges.head(); var11 != null; var11 = (LocChange) locChanges.next()) {
			if (var11.level == arg1 && var11.x == arg8 && var11.z == arg4 && var11.layer == arg7) {
				var10 = var11;
				break;
			}
		}
		if (var10 == null) {
			var10 = new LocChange();
			var10.level = arg1;
			var10.layer = arg7;
			var10.x = arg8;
			var10.z = arg4;
			locChangeSetOld(var10);
			locChanges.push(var10);
		}
		var10.newType = arg2;
		var10.newShape = arg3;
		var10.newAngle = arg5;
		var10.startTime = arg0;
		var10.endTime = arg6;
	}

	@ObfuscatedName("client.B(I)V")
	public void locChangePostBuildCorrect() {
		for (LocChange var1 = (LocChange) locChanges.head(); var1 != null; var1 = (LocChange) locChanges.next()) {
			if (var1.endTime == -1) {
				var1.startTime = 0;
				locChangeSetOld(var1);
			} else {
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("client.a(Lnb;Z)V")
	public void locChangeSetOld(LocChange arg0) {
		int var2 = 0;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (arg0.layer == 0) {
			var2 = world.wallType(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 1) {
			var2 = world.decorType(arg0.z, arg0.level, arg0.x);
		}
		if (arg0.layer == 2) {
			var2 = world.sceneType(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 3) {
			var2 = world.gdType(arg0.level, arg0.x, arg0.z);
		}
		if (var2 != 0) {
			int var6 = world.typeCode2(arg0.level, arg0.x, arg0.z, var2);
			var3 = var2 >> 14 & 0x7FFF;
			var4 = var6 & 0x1F;
			var5 = var6 >> 6;
		}
		arg0.oldType = var3;
		arg0.oldShape = var4;
		arg0.oldAngle = var5;
	}

	@ObfuscatedName("client.i(I)V")
	public void locChangeDoQueue() {
		if (sceneState != 2) {
			return;
		}
		for (LocChange var1 = (LocChange) locChanges.head(); var1 != null; var1 = (LocChange) locChanges.next()) {
			if (var1.endTime > 0) {
				var1.endTime--;
			}
			if (var1.endTime != 0) {
				if (var1.startTime > 0) {
					var1.startTime--;
				}
				if (var1.startTime == 0 && var1.x >= 1 && var1.z >= 1 && var1.x <= 102 && var1.z <= 102 && (var1.newType < 0 || ClientBuild.changeLocAvailable(var1.newType, var1.newShape))) {
					locChangeUnchecked(var1.newAngle, var1.newShape, var1.level, var1.newType, var1.x, var1.layer, var1.z);
					var1.startTime = -1;
					if (var1.newType == var1.oldType && var1.oldType == -1) {
						var1.unlink();
					} else if (var1.newType == var1.oldType && var1.newAngle == var1.oldAngle && var1.newShape == var1.oldShape) {
						var1.unlink();
					}
				}
			} else if (var1.oldType < 0 || ClientBuild.changeLocAvailable(var1.oldType, var1.oldShape)) {
				locChangeUnchecked(var1.oldAngle, var1.oldShape, var1.level, var1.oldType, var1.x, var1.layer, var1.z);
				var1.unlink();
			}
		}
	}

	@ObfuscatedName("client.a(IIIIIIII)V")
	public void locChangeUnchecked(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 < 1 || arg6 < 1 || arg4 > 102 || arg6 > 102) {
			return;
		}
		if (lowMem && arg2 != minusedlevel) {
			return;
		}
		int var8 = 0;
		if (arg5 == 0) {
			var8 = world.wallType(arg2, arg4, arg6);
		}
		if (arg5 == 1) {
			var8 = world.decorType(arg6, arg2, arg4);
		}
		if (arg5 == 2) {
			var8 = world.sceneType(arg2, arg4, arg6);
		}
		if (arg5 == 3) {
			var8 = world.gdType(arg2, arg4, arg6);
		}
		if (var8 != 0) {
			int var9 = world.typeCode2(arg2, arg4, arg6, var8);
			int var10 = var8 >> 14 & 0x7FFF;
			int var11 = var9 & 0x1F;
			int var12 = var9 >> 6;
			if (arg5 == 0) {
				world.delWall(arg6, arg4, arg2);
				LocType var13 = LocType.list(var10);
				if (var13.blockwalk) {
					collision[arg2].delWall(var12, var11, arg6, arg4, var13.blockrange);
				}
			}
			if (arg5 == 1) {
				world.delDecor(arg2, arg6, arg4);
			}
			if (arg5 == 2) {
				world.delLoc(arg2, arg6, arg4);
				LocType var14 = LocType.list(var10);
				if (arg4 + var14.width > 103 || arg6 + var14.width > 103 || arg4 + var14.length > 103 || arg6 + var14.length > 103) {
					return;
				}
				if (var14.blockwalk) {
					collision[arg2].delLoc(var14.length, arg6, arg4, var14.blockrange, var12, var14.width);
				}
			}
			if (arg5 == 3) {
				world.delGroundDecor(arg4, arg6, arg2);
				LocType var15 = LocType.list(var10);
				if (var15.blockwalk && var15.active) {
					collision[arg2].unblockGround(arg6, arg4);
				}
			}
		}
		if (arg3 >= 0) {
			int var16 = arg2;
			if (arg2 < 3 && (mapl[1][arg4][arg6] & 0x2) == 0x2) {
				var16 = arg2 + 1;
			}
			ClientBuild.addLoc(arg0, arg2, arg6, arg1, groundh, var16, arg4, collision[arg2], world, arg3);
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void showObject(int arg0, int arg1) {
		LinkList var3 = groundObj[minusedlevel][arg0][arg1];
		if (var3 == null) {
			world.delObj(minusedlevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next()) {
			ObjType var7 = ObjType.list(var6.id);
			int var8 = var7.cost;
			if (var7.stackable) {
				var8 *= var6.count + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.pushFront(var5);
		ClientObj var9 = null;
		ClientObj var10 = null;
		for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next()) {
			if (var11.id != var5.id && var9 == null) {
				var9 = var11;
			}
			if (var11.id != var5.id && var11.id != var9.id && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 0x60000000;
		world.method57(arg1, var12, var9, arg0, var10, minusedlevel, getAvH(arg1 * 128 + 64, arg0 * 128 + 64, minusedlevel), var5);
	}

	@ObfuscatedName("client.a(IBLlb;)V")
	public void getPlayerPos(int arg0, Packet arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getPlayerPosLocal(arg0, arg1);
		getPlayerPosOldVis(arg1, arg0);
		getPlayerPosNewVis(arg0, arg1);
		getPlayerPosExtended(arg1, arg0);
		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (players[var4].cycle != loopCycle) {
				players[var4] = null;
			}
		}
		if (arg1.pos != arg0) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < playerCount; var5++) {
			if (players[playerIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in pl list - pos:" + var5 + " size:" + playerCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;Z)V")
	public void getPlayerPosLocal(int arg0, Packet arg1) {
		arg1.gbitstart();
		int var3 = arg1.gbit(1);
		if (var3 != 0) {
			int var4 = arg1.gbit(2);
			if (var4 == 0) {
				entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
			} else if (var4 == 1) {
				int var5 = arg1.gbit(3);
				localPlayer.moveCode(false, var5, field1574);
				int var6 = arg1.gbit(1);
				if (var6 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 2) {
				int var7 = arg1.gbit(3);
				localPlayer.moveCode(true, var7, field1574);
				int var8 = arg1.gbit(3);
				localPlayer.moveCode(true, var8, field1574);
				int var9 = arg1.gbit(1);
				if (var9 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			} else if (var4 == 3) {
				minusedlevel = arg1.gbit(2);
				int var10 = arg1.gbit(7);
				int var11 = arg1.gbit(7);
				int var12 = arg1.gbit(1);
				localPlayer.teleport(var10, var12 == 1, var11, field1346);
				int var13 = arg1.gbit(1);
				if (var13 == 1) {
					entityUpdateIds[entityUpdateCount++] = LOCAL_PLAYER_INDEX;
				}
			}
		}
	}

	@ObfuscatedName("client.b(ILlb;I)V")
	public void getPlayerPosOldVis(Packet arg0, int arg1) {
		int var3 = arg0.gbit(8);
		if (var3 < playerCount) {
			for (int var4 = var3; var4 < playerCount; var4++) {
				entityRemovalIds[entityRemovalCount++] = playerIds[var4];
			}
		}
		if (var3 > playerCount) {
			signlink.reporterror(loginUser + " Too many players");
			throw new RuntimeException("eek");
		}
		playerCount = 0;
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = playerIds[var5];
			ClientPlayer var7 = players[var6];
			int var8 = arg0.gbit(1);
			if (var8 == 0) {
				playerIds[playerCount++] = var6;
				var7.cycle = loopCycle;
			} else {
				int var9 = arg0.gbit(2);
				if (var9 == 0) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var6;
				} else if (var9 == 1) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var10 = arg0.gbit(3);
					var7.moveCode(false, var10, field1574);
					int var11 = arg0.gbit(1);
					if (var11 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 2) {
					playerIds[playerCount++] = var6;
					var7.cycle = loopCycle;
					int var12 = arg0.gbit(3);
					var7.moveCode(true, var12, field1574);
					int var13 = arg0.gbit(3);
					var7.moveCode(true, var13, field1574);
					int var14 = arg0.gbit(1);
					if (var14 == 1) {
						entityUpdateIds[entityUpdateCount++] = var6;
					}
				} else if (var9 == 3) {
					entityRemovalIds[entityRemovalCount++] = var6;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILlb;I)V")
	public void getPlayerPosNewVis(int arg0, Packet arg1) {
		while (true) {
			if (arg1.bitpos + 10 < arg0 * 8) {
				int var3 = arg1.gbit(11);
				if (var3 != 2047) {
					if (players[var3] == null) {
						players[var3] = new ClientPlayer();
						if (playerAppearanceBuffer[var3] != null) {
							players[var3].setAppearance(playerAppearanceBuffer[var3]);
						}
					}
					playerIds[playerCount++] = var3;
					ClientPlayer var4 = players[var3];
					var4.cycle = loopCycle;
					int var5 = arg1.gbit(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = arg1.gbit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg1.gbit(1);
					var4.teleport(localPlayer.routeX[0] + var5, var7 == 1, localPlayer.routeZ[0] + var6, field1346);
					int var8 = arg1.gbit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
					continue;
				}
			}
			arg1.gbitend();
			return;
		}
	}

	@ObfuscatedName("client.a(IBLlb;ILab;)V")
	public void getPlayerPosExtended(int arg0, Packet arg1, int arg2, ClientPlayer arg3) {
		if ((arg0 & 0x1) == 0x1) {
			int var5 = arg1.g1();
			byte[] var6 = new byte[var5];
			Packet var7 = new Packet(var6, 15787);
			arg1.gdata(var6, var5);
			playerAppearanceBuffer[arg2] = var7;
			arg3.setAppearance(var7);
		}
		if ((arg0 & 0x2) == 0x2) {
			int var8 = arg1.g2();
			if (var8 == 65535) {
				var8 = -1;
			}
			if (var8 == arg3.primaryAnim) {
				arg3.field428 = 0;
			}
			int var9 = arg1.g1();
			if (var8 == arg3.primaryAnim && var8 != -1) {
				int var10 = SeqType.list[var8].duplicatebehaviour;
				if (var10 == 1) {
					arg3.primaryFrame = 0;
					arg3.field426 = 0;
					arg3.primaryAnimDelay = var9;
					arg3.field428 = 0;
				}
				if (var10 == 2) {
					arg3.field428 = 0;
				}
			} else if (var8 == -1 || arg3.primaryAnim == -1 || SeqType.list[var8].priority >= SeqType.list[arg3.primaryAnim].priority) {
				arg3.primaryAnim = var8;
				arg3.primaryFrame = 0;
				arg3.field426 = 0;
				arg3.primaryAnimDelay = var9;
				arg3.field428 = 0;
				arg3.preanimRouteLength = arg3.routeLength;
			}
		}
		if ((arg0 & 0x4) == 0x4) {
			arg3.field418 = arg1.g2();
			if (arg3.field418 == 65535) {
				arg3.field418 = -1;
			}
		}
		if ((arg0 & 0x8) == 0x8) {
			arg3.chatMessage = arg1.gstr();
			if (arg3.chatMessage.charAt(0) == '~') {
				arg3.chatMessage = arg3.chatMessage.substring(1);
				addChat(2, arg3.chatMessage, arg3.name);
			} else if (arg3 == localPlayer) {
				addChat(2, arg3.chatMessage, arg3.name);
			}
			arg3.chatColour = 0;
			arg3.chatEffect = 0;
			arg3.chatTimer = 150;
		}
		if ((arg0 & 0x10) == 0x10) {
			int var11 = arg1.g1();
			int var12 = arg1.g1();
			arg3.addHitmark(var12, loopCycle, var11);
			arg3.field415 = loopCycle + 300;
			arg3.field416 = arg1.g1();
			arg3.field417 = arg1.g1();
		}
		if ((arg0 & 0x20) == 0x20) {
			arg3.field419 = arg1.g2();
			arg3.field420 = arg1.g2();
		}
		if ((arg0 & 0x40) == 0x40) {
			int var13 = arg1.g2();
			int var14 = arg1.g1();
			int var15 = arg1.g1();
			int var16 = arg1.pos;
			if (arg3.name != null && arg3.ready) {
				long var17 = JString.toUserhash(arg3.name);
				boolean var19 = false;
				if (var14 <= 1) {
					for (int var20 = 0; var20 < ignoreCount; var20++) {
						if (ignoreUserhash[var20] == var17) {
							var19 = true;
							break;
						}
					}
				}
				if (!var19 && chatDisabled == 0) {
					try {
						String var21 = WordPack.unpack(arg1, var15);
						String var22 = WordFilter.method397(var21, field1663);
						arg3.chatMessage = var22;
						arg3.chatColour = var13 >> 8;
						arg3.chatEffect = var13 & 0xFF;
						arg3.chatTimer = 150;
						if (var14 == 2 || var14 == 3) {
							addChat(1, var22, "@cr2@" + arg3.name);
						} else if (var14 == 1) {
							addChat(1, var22, "@cr1@" + arg3.name);
						} else {
							addChat(2, var22, arg3.name);
						}
					} catch (Exception var27) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg1.pos = var16 + var15;
		}
		if ((arg0 & 0x100) == 0x100) {
			arg3.spotanimId = arg1.g2();
			int var24 = arg1.g4();
			arg3.spotanimHeight = var24 >> 16;
			arg3.field432 = loopCycle + (var24 & 0xFFFF);
			arg3.spotanimFrame = 0;
			arg3.field431 = 0;
			if (arg3.field432 > loopCycle) {
				arg3.spotanimFrame = -1;
			}
			if (arg3.spotanimId == 65535) {
				arg3.spotanimId = -1;
			}
		}
		if ((arg0 & 0x200) == 0x200) {
			arg3.field434 = arg1.g1();
			arg3.field436 = arg1.g1();
			arg3.field435 = arg1.g1();
			arg3.field437 = arg1.g1();
			arg3.field438 = arg1.g2() + loopCycle;
			arg3.field439 = arg1.g2() + loopCycle;
			arg3.field440 = arg1.g1();
			arg3.abortRoute();
		}
		if ((arg0 & 0x400) == 0x400) {
			int var25 = arg1.g1();
			int var26 = arg1.g1();
			arg3.addHitmark(var26, loopCycle, var25);
			arg3.field415 = loopCycle + 300;
			arg3.field416 = arg1.g1();
			arg3.field417 = arg1.g1();
		}
	}

	@ObfuscatedName("client.a(Llb;ZI)V")
	public void getPlayerPosExtended(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientPlayer var5 = players[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x80) == 0x80) {
				var6 += arg0.g1() << 8;
			}
			getPlayerPosExtended(var6, arg0, var4, var5);
		}
	}

	@ObfuscatedName("client.a(ZILlb;)V")
	public void getNpcPos(int arg0, Packet arg1) {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		getNpcPosOldVis(arg0, arg1, field1623);
		getNpcPosNewVis(arg0, arg1);
		getNpcPosExtended(arg1, arg0);
		for (int var3 = 0; var3 < entityRemovalCount; var3++) {
			int var4 = entityRemovalIds[var3];
			if (npc[var4].cycle != loopCycle) {
				npc[var4].type = null;
				npc[var4] = null;
			}
		}
		if (arg1.pos != arg0) {
			signlink.reporterror(loginUser + " size mismatch in getnpcpos - pos:" + arg1.pos + " psize:" + arg0);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < npcCount; var5++) {
			if (npc[npcIds[var5]] == null) {
				signlink.reporterror(loginUser + " null entry in npc list - pos:" + var5 + " size:" + npcCount);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.d(ILlb;I)V")
	public void getNpcPosOldVis(int arg0, Packet arg1, int arg2) {
		arg1.gbitstart();
		int var4 = arg1.gbit(8);
		if (var4 < npcCount) {
			for (int var5 = var4; var5 < npcCount; var5++) {
				entityRemovalIds[entityRemovalCount++] = npcIds[var5];
			}
		}
		if (var4 > npcCount) {
			signlink.reporterror(loginUser + " Too many npcs");
			throw new RuntimeException("eek");
		}
		npcCount = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = npcIds[var6];
			ClientNpc var8 = npc[var7];
			int var9 = arg1.gbit(1);
			if (var9 == 0) {
				npcIds[npcCount++] = var7;
				var8.cycle = loopCycle;
			} else {
				int var10 = arg1.gbit(2);
				if (var10 == 0) {
					npcIds[npcCount++] = var7;
					var8.cycle = loopCycle;
					entityUpdateIds[entityUpdateCount++] = var7;
				} else if (var10 == 1) {
					npcIds[npcCount++] = var7;
					var8.cycle = loopCycle;
					int var11 = arg1.gbit(3);
					var8.moveCode(false, var11, field1574);
					int var12 = arg1.gbit(1);
					if (var12 == 1) {
						entityUpdateIds[entityUpdateCount++] = var7;
					}
				} else if (var10 == 2) {
					npcIds[npcCount++] = var7;
					var8.cycle = loopCycle;
					int var13 = arg1.gbit(3);
					var8.moveCode(true, var13, field1574);
					int var14 = arg1.gbit(3);
					var8.moveCode(true, var14, field1574);
					int var15 = arg1.gbit(1);
					if (var15 == 1) {
						entityUpdateIds[entityUpdateCount++] = var7;
					}
				} else if (var10 == 3) {
					entityRemovalIds[entityRemovalCount++] = var7;
				}
			}
		}
		if (arg2 < 9 || arg2 > 9) {
			ptype = -1;
		}
	}

	@ObfuscatedName("client.a(BILlb;)V")
	public void getNpcPosNewVis(int arg0, Packet arg1) {
		while (true) {
			if (arg1.bitpos + 21 < arg0 * 8) {
				int var3 = arg1.gbit(14);
				if (var3 != 16383) {
					if (npc[var3] == null) {
						npc[var3] = new ClientNpc();
					}
					ClientNpc var4 = npc[var3];
					npcIds[npcCount++] = var3;
					var4.cycle = loopCycle;
					var4.type = NpcType.list(arg1.gbit(11));
					var4.size = var4.type.size;
					var4.field444 = var4.type.turnspeed;
					var4.walkanim = var4.type.walkanim;
					var4.walkanim_b = var4.type.walkanim_b;
					var4.walkanim_l = var4.type.walkanim_r;
					var4.walkanim_r = var4.type.walkanim_l;
					var4.readyanim = var4.type.readyanim;
					int var5 = arg1.gbit(5);
					if (var5 > 15) {
						var5 -= 32;
					}
					int var6 = arg1.gbit(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg1.gbit(1);
					var4.teleport(localPlayer.routeX[0] + var5, var7 == 1, localPlayer.routeZ[0] + var6, field1346);
					int var8 = arg1.gbit(1);
					if (var8 == 1) {
						entityUpdateIds[entityUpdateCount++] = var3;
					}
					continue;
				}
			}
			arg1.gbitend();
			return;
		}
	}

	@ObfuscatedName("client.c(ILlb;I)V")
	public void getNpcPosExtended(Packet arg0, int arg1) {
		for (int var3 = 0; var3 < entityUpdateCount; var3++) {
			int var4 = entityUpdateIds[var3];
			ClientNpc var5 = npc[var4];
			int var6 = arg0.g1();
			if ((var6 & 0x1) == 0x1) {
				int var7 = arg0.g1();
				int var8 = arg0.g1();
				var5.addHitmark(var8, loopCycle, var7);
				var5.field415 = loopCycle + 300;
				var5.field416 = arg0.g1();
				var5.field417 = arg0.g1();
			}
			if ((var6 & 0x2) == 0x2) {
				int var9 = arg0.g2();
				if (var9 == 65535) {
					var9 = -1;
				}
				if (var9 == var5.primaryAnim) {
					var5.field428 = 0;
				}
				int var10 = arg0.g1();
				if (var9 == var5.primaryAnim && var9 != -1) {
					int var11 = SeqType.list[var9].duplicatebehaviour;
					if (var11 == 1) {
						var5.primaryFrame = 0;
						var5.field426 = 0;
						var5.primaryAnimDelay = var10;
						var5.field428 = 0;
					}
					if (var11 == 2) {
						var5.field428 = 0;
					}
				} else if (var9 == -1 || var5.primaryAnim == -1 || SeqType.list[var9].priority >= SeqType.list[var5.primaryAnim].priority) {
					var5.primaryAnim = var9;
					var5.primaryFrame = 0;
					var5.field426 = 0;
					var5.primaryAnimDelay = var10;
					var5.field428 = 0;
					var5.preanimRouteLength = var5.routeLength;
				}
			}
			if ((var6 & 0x4) == 0x4) {
				var5.field418 = arg0.g2();
				if (var5.field418 == 65535) {
					var5.field418 = -1;
				}
			}
			if ((var6 & 0x8) == 0x8) {
				var5.chatMessage = arg0.gstr();
				var5.chatTimer = 100;
			}
			if ((var6 & 0x10) == 0x10) {
				int var12 = arg0.g1();
				int var13 = arg0.g1();
				var5.addHitmark(var13, loopCycle, var12);
				var5.field415 = loopCycle + 300;
				var5.field416 = arg0.g1();
				var5.field417 = arg0.g1();
			}
			if ((var6 & 0x20) == 0x20) {
				var5.type = NpcType.list(arg0.g2());
				var5.size = var5.type.size;
				var5.field444 = var5.type.turnspeed;
				var5.walkanim = var5.type.walkanim;
				var5.walkanim_b = var5.type.walkanim_b;
				var5.walkanim_l = var5.type.walkanim_r;
				var5.walkanim_r = var5.type.walkanim_l;
				var5.readyanim = var5.type.readyanim;
			}
			if ((var6 & 0x40) == 0x40) {
				var5.spotanimId = arg0.g2();
				int var14 = arg0.g4();
				var5.spotanimHeight = var14 >> 16;
				var5.field432 = loopCycle + (var14 & 0xFFFF);
				var5.spotanimFrame = 0;
				var5.field431 = 0;
				if (var5.field432 > loopCycle) {
					var5.spotanimFrame = -1;
				}
				if (var5.spotanimId == 65535) {
					var5.spotanimId = -1;
				}
			}
			if ((var6 & 0x80) == 0x80) {
				var5.field419 = arg0.g2();
				var5.field420 = arg0.g2();
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public void mouseLoop() {
		if (objDragArea != 0) {
			return;
		}
		int var1 = super.mouseClickButton;
		if (targetMode == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var1 = 0;
		}
		if (!isMenuOpen) {
			if (var1 == 1 && menuNumEntries > 0) {
				int var12 = menuAction[menuNumEntries - 1];
				if (var12 == 582 || var12 == 113 || var12 == 555 || var12 == 331 || var12 == 354 || var12 == 694 || var12 == 962 || var12 == 795 || var12 == 681 || var12 == 100 || var12 == 102 || var12 == 1328) {
					int var13 = menuParamB[menuNumEntries - 1];
					int var14 = menuParamC[menuNumEntries - 1];
					IfType var15 = IfType.list[var14];
					if (var15.objSwap || var15.objReplace) {
						objGrabThreshold = false;
						objDragCycle = 0;
						objDragComId = var14;
						objDragSlot = var13;
						objDragArea = 2;
						objGrabX = super.mouseClickX;
						objGrabY = super.mouseClickY;
						if (IfType.list[var14].layerId == mainModalId) {
							objDragArea = 1;
						}
						if (IfType.list[var14].layerId == chatComId) {
							objDragArea = 3;
						}
						return;
					}
				}
			}
			if (var1 == 1 && (oneMouseButton == 1 || isAddFriendOption(menuNumEntries - 1)) && menuNumEntries > 2) {
				var1 = 2;
			}
			if (var1 == 1 && menuNumEntries > 0) {
				doAction(menuNumEntries - 1);
			}
			if (var1 == 2 && menuNumEntries > 0) {
				openMenu(field1320);
			} else {
			}
		}
		if (var1 != 1) {
			int var2 = super.mouseX;
			int var3 = super.mouseY;
			if (menuArea == 0) {
				var2 -= 4;
				var3 -= 4;
			}
			if (menuArea == 1) {
				var2 -= 553;
				var3 -= 205;
			}
			if (menuArea == 2) {
				var2 -= 17;
				var3 -= 357;
			}
			if (var2 < field1452 - 10 || var2 > field1452 + field1454 + 10 || var3 < field1453 - 10 || var3 > field1453 + field1455 + 10) {
				isMenuOpen = false;
				if (menuArea == 1) {
					redrawSidebar = true;
				}
				if (menuArea == 2) {
					redrawChatback = true;
				}
			}
		}
		if (var1 == 1) {
			int var4 = field1452;
			int var5 = field1453;
			int var6 = field1454;
			int var7 = super.mouseClickX;
			int var8 = super.mouseClickY;
			if (menuArea == 0) {
				var7 -= 4;
				var8 -= 4;
			}
			if (menuArea == 1) {
				var7 -= 553;
				var8 -= 205;
			}
			if (menuArea == 2) {
				var7 -= 17;
				var8 -= 357;
			}
			int var9 = -1;
			for (int var10 = 0; var10 < menuNumEntries; var10++) {
				int var11 = var5 + (menuNumEntries - 1 - var10) * 15 + 31;
				if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
					var9 = var10;
				}
			}
			if (var9 != -1) {
				doAction(var9);
			}
			isMenuOpen = false;
			if (menuArea == 1) {
				redrawSidebar = true;
			}
			if (menuArea == 2) {
				redrawChatback = true;
			}
		}
	}

	@ObfuscatedName("client.G(I)V")
	public void drawMinimenu() {
		int var1 = field1452;
		int var2 = field1453;
		int var3 = field1454;
		int var4 = field1455;
		Pix2D.fillRect(6116423, var2, var4, var1, var3);
		Pix2D.fillRect(0, var2 + 1, 16, var1 + 1, var3 - 2);
		Pix2D.drawRect(var1 + 1, var3 - 2, 0, var2 + 18, var4 - 19);
		b12.drawString(6116423, "Choose Option", var1 + 3, var2 + 14);
		int var5 = super.mouseX;
		int var6 = super.mouseY;
		if (menuArea == 0) {
			var5 -= 4;
			var6 -= 4;
		}
		if (menuArea == 1) {
			var5 -= 553;
			var6 -= 205;
		}
		if (menuArea == 2) {
			var5 -= 17;
			var6 -= 357;
		}
		for (int var7 = 0; var7 < menuNumEntries; var7++) {
			int var8 = var2 + (menuNumEntries - 1 - var7) * 15 + 31;
			int var9 = 16777215;
			if (var5 > var1 && var5 < var1 + var3 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}
			b12.drawStringTag(var9, var8, true, var1 + 3, menuOption[var7]);
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void drawFeedback() {
		if (menuNumEntries < 2 && useMode == 0 && targetMode == 0) {
			return;
		}
		String var1;
		if (useMode == 1 && menuNumEntries < 2) {
			var1 = "Use " + objSelectedName + " with...";
		} else if (targetMode == 1 && menuNumEntries < 2) {
			var1 = targetOp + "...";
		} else {
			var1 = menuOption[menuNumEntries - 1];
		}
		if (menuNumEntries > 2) {
			var1 = var1 + "@whi@ / " + (menuNumEntries - 2) + " more options";
		}
		b12.drawStringAntiMacro(var1, 16777215, 4, loopCycle / 1000);
	}

	@ObfuscatedName("client.A(I)V")
	public void openMenu(int arg0) {
		int var2 = b12.stringWidTag("Choose Option");
		for (int var3 = 0; var3 < menuNumEntries; var3++) {
			int var4 = b12.stringWidTag(menuOption[var3]);
			if (var4 > var2) {
				var2 = var4;
			}
		}
		var2 += 8;
		if (arg0 != 0) {
			field1457 = !field1457;
		}
		int var5 = menuNumEntries * 15 + 21;
		if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
			int var6 = super.mouseClickX - var2 / 2 - 4;
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
			isMenuOpen = true;
			menuArea = 0;
			field1452 = var6;
			field1453 = var7;
			field1454 = var2;
			field1455 = menuNumEntries * 15 + 22;
		}
		if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
			int var8 = super.mouseClickX - var2 / 2 - 553;
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
			isMenuOpen = true;
			menuArea = 1;
			field1452 = var8;
			field1453 = var9;
			field1454 = var2;
			field1455 = menuNumEntries * 15 + 22;
		}
		if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
			int var10 = super.mouseClickX - var2 / 2 - 17;
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
			isMenuOpen = true;
			menuArea = 2;
			field1452 = var10;
			field1453 = var11;
			field1454 = var2;
			field1455 = menuNumEntries * 15 + 22;
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public boolean isAddFriendOption(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var2 = menuAction[arg0];
		if (var2 >= 2000) {
			var2 -= 2000;
		}
		return var2 == 605;
	}

	@ObfuscatedName("client.f(II)V")
	public void doAction(int arg0) {
		if (arg0 < 0) {
			return;
		}
		if (dialogInputOpen) {
			dialogInputOpen = false;
			redrawChatback = true;
		}
		int var2 = menuParamB[arg0];
		int var3 = menuParamC[arg0];
		int var4 = menuAction[arg0];
		int var5 = menuParamA[arg0];
		if (var4 >= 2000) {
			var4 -= 2000;
		}
		if (var4 == 721) {
			oplogic1 += var3;
			if (oplogic1 >= 139) {
				out.p1enc(195);
				out.p4(0);
			}
			interactWithLoc(var5, 45, var3, var2);
		}
		if (var4 == 718) {
			if (isMenuOpen) {
				world.method88(var3 - 4, field1282, var2 - 4);
			} else {
				world.method88(super.mouseClickY - 4, field1282, super.mouseClickX - 4);
			}
		}
		if (var4 == 131) {
			ClientPlayer var6 = players[var5];
			if (var6 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var6.routeZ[0], 0, 0, false, 2, 1, var6.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1enc(138);
				out.p2(var5);
				out.p2(field1416);
			}
		}
		if (var4 == 507 || var4 == 957) {
			String var7 = menuOption[arg0];
			int var8 = var7.indexOf("@whi@");
			if (var8 != -1) {
				String var9 = var7.substring(var8 + 5).trim();
				String var10 = JString.toSentenceCase(JString.toRawUsername(JString.toUserhash(var9)));
				boolean var11 = false;
				for (int var12 = 0; var12 < playerCount; var12++) {
					ClientPlayer var13 = players[playerIds[var12]];
					if (var13 != null && var13.name != null && var13.name.equalsIgnoreCase(var10)) {
						tryMove(1, localPlayer.routeX[0], 0, var13.routeZ[0], 0, 0, false, 2, 1, var13.routeX[0], localPlayer.routeZ[0]);
						if (var4 == 507) {
							oplogic5 += var5;
							if (oplogic5 >= 66) {
								out.p1enc(46);
								out.p1(154);
							}
							out.p1enc(189);
						}
						if (var4 == 957) {
							oplogic4++;
							if (oplogic4 >= 52) {
								out.p1enc(49);
								out.p1(131);
							}
							out.p1enc(220);
						}
						out.p2(playerIds[var12]);
						var11 = true;
						break;
					}
				}
				if (!var11) {
					addChat(0, "Unable to find " + var10, "");
				}
			}
		}
		if (var4 == 625) {
			interactWithLoc(var5, 10, var3, var2);
		}
		if (var4 == 1152) {
			ObjType var14 = ObjType.list(var5);
			String var15;
			if (var14.desc == null) {
				var15 = "It's a " + var14.name + ".";
			} else {
				var15 = new String(var14.desc);
			}
			addChat(0, var15, "");
		}
		if (var4 == 737) {
			closeModal();
		}
		if (var4 == 902) {
			String var16 = menuOption[arg0];
			int var17 = var16.indexOf("@whi@");
			if (var17 != -1) {
				long var18 = JString.toUserhash(var16.substring(var17 + 5).trim());
				int var20 = -1;
				for (int var21 = 0; var21 < friendCount; var21++) {
					if (friendUserhash[var21] == var18) {
						var20 = var21;
						break;
					}
				}
				if (var20 != -1 && friendNodeId[var20] > 0) {
					redrawChatback = true;
					dialogInputOpen = false;
					socialInputOpen = true;
					socialInput = "";
					socialInputType = 3;
					field1388 = friendUserhash[var20];
					socialInputHeader = "Enter message to send to " + friendUsername[var20];
				}
			}
		}
		if (var4 == 605 || var4 == 47 || var4 == 513 || var4 == 884) {
			String var22 = menuOption[arg0];
			int var23 = var22.indexOf("@whi@");
			if (var23 != -1) {
				long var24 = JString.toUserhash(var22.substring(var23 + 5).trim());
				if (var4 == 605) {
					addFriend(var24);
				}
				if (var4 == 47) {
					addIgnore(var24);
				}
				if (var4 == 513) {
					delFriend(var24);
				}
				if (var4 == 884) {
					delIgnore(var24);
				}
			}
		}
		if (var4 == 563) {
			out.p1enc(112);
			out.p2(var5);
			out.p2(var2);
			out.p2(var3);
			out.p2(field1416);
			selectedCycle = 0;
			field1570 = var3;
			field1571 = var2;
			selectedArea = 2;
			if (IfType.list[var3].layerId == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var3].layerId == chatComId) {
				selectedArea = 3;
			}
		}
		if (var4 == 274) {
			IfType var26 = IfType.list[var3];
			targetMode = 1;
			field1416 = var3;
			targetMask = var26.targetMask;
			useMode = 0;
			redrawSidebar = true;
			String var27 = var26.targetVerb;
			if (var27.indexOf(" ") != -1) {
				var27 = var27.substring(0, var27.indexOf(" "));
			}
			String var28 = var26.targetVerb;
			if (var28.indexOf(" ") != -1) {
				var28 = var28.substring(var28.indexOf(" ") + 1);
			}
			targetOp = var27 + " " + var26.targetBase + " " + var28;
			if (targetMask == 16) {
				redrawSidebar = true;
				activeIcon = 3;
				redrawIcons = true;
			}
			return;
		}
		if (var4 == 225) {
			out.p1enc(86);
			out.p2(var3);
			IfType var29 = IfType.list[var3];
			if (var29.scripts != null && var29.scripts[0][0] == 5) {
				int var30 = var29.scripts[0][1];
				if (var[var30] != var29.scriptOperand[0]) {
					var[var30] = var29.scriptOperand[0];
					clientVar(var30);
					redrawSidebar = true;
				}
			}
		}
		if (var4 == 524) {
			String var31 = menuOption[arg0];
			int var32 = var31.indexOf("@whi@");
			if (var32 != -1) {
				if (mainModalId == -1) {
					closeModal();
					reportAbuseInput = var31.substring(var32 + 5).trim();
					reportAbuseMuteOption = false;
					for (int var33 = 0; var33 < IfType.list.length; var33++) {
						if (IfType.list[var33] != null && IfType.list[var33].clientCode == 600) {
							reportAbuseComId = mainModalId = IfType.list[var33].layerId;
							break;
						}
					}
				} else {
					addChat(0, "Please close the interface you have open before using 'report abuse'", "");
				}
			}
		}
		if (var4 == 242 || var4 == 209 || var4 == 309 || var4 == 852 || var4 == 793) {
			ClientNpc var34 = npc[var5];
			if (var34 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var34.routeZ[0], 0, 0, false, 2, 1, var34.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				if (var4 == 242) {
					out.p1enc(252);
				}
				if (var4 == 209) {
					out.p1enc(21);
				}
				if (var4 == 793) {
					out.p1enc(247);
				}
				if (var4 == 309) {
					out.p1enc(178);
				}
				if (var4 == 852) {
					out.p1enc(30);
				}
				out.p2(var5);
			}
		}
		if (var4 == 231) {
			IfType var35 = IfType.list[var3];
			boolean var36 = true;
			if (var35.clientCode > 0) {
				var36 = clientButton(var35);
			}
			if (var36) {
				out.p1enc(86);
				out.p2(var3);
			}
		}
		if (var4 == 1714) {
			ClientNpc var37 = npc[var5];
			if (var37 != null) {
				String var38;
				if (var37.type.desc == null) {
					var38 = "It's a " + var37.type.name + ".";
				} else {
					var38 = new String(var37.type.desc);
				}
				addChat(0, var38, "");
			}
		}
		if (var4 == 398) {
			out.p1enc(200);
			out.p2(var5);
			out.p2(var2);
			out.p2(var3);
			out.p2(field1376);
			out.p2(field1374);
			out.p2(field1375);
			selectedCycle = 0;
			field1570 = var3;
			field1571 = var2;
			selectedArea = 2;
			if (IfType.list[var3].layerId == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var3].layerId == chatComId) {
				selectedArea = 3;
			}
		}
		if (var4 == 102) {
			useMode = 1;
			field1374 = var2;
			field1375 = var3;
			field1376 = var5;
			objSelectedName = ObjType.list(var5).name;
			targetMode = 0;
			redrawSidebar = true;
			return;
		}
		if (var4 == 997 && !resumedPauseButton) {
			out.p1enc(166);
			out.p2(var3);
			resumedPauseButton = true;
		}
		if (var4 == 899 && interactWithLoc(var5, 218, var3, var2)) {
			out.p2(field1416);
		}
		if (var4 == 694 || var4 == 962 || var4 == 795 || var4 == 681 || var4 == 100) {
			if (var4 == 100) {
				out.p1enc(79);
			}
			if (var4 == 681) {
				oplogic9++;
				if (oplogic9 >= 116) {
					out.p1enc(88);
					out.p3(13018169);
				}
				out.p1enc(191);
			}
			if (var4 == 694) {
				out.p1enc(76);
			}
			if (var4 == 795) {
				out.p1enc(40);
			}
			if (var4 == 962) {
				out.p1enc(177);
			}
			out.p2(var5);
			out.p2(var2);
			out.p2(var3);
			selectedCycle = 0;
			field1570 = var3;
			field1571 = var2;
			selectedArea = 2;
			if (IfType.list[var3].layerId == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var3].layerId == chatComId) {
				selectedArea = 3;
			}
		}
		if (var4 == 275) {
			ClientPlayer var39 = players[var5];
			if (var39 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var39.routeZ[0], 0, 0, false, 2, 1, var39.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1enc(16);
				out.p2(var5);
				out.p2(field1376);
				out.p2(field1374);
				out.p2(field1375);
			}
		}
		if (var4 == 240) {
			ClientNpc var40 = npc[var5];
			if (var40 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var40.routeZ[0], 0, 0, false, 2, 1, var40.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1enc(108);
				out.p2(var5);
				out.p2(field1416);
			}
		}
		if (var4 == 743) {
			oplogic2++;
			if (oplogic2 >= 124) {
				out.p1enc(81);
				out.p2(37954);
			}
			interactWithLoc(var5, 196, var3, var2);
		}
		if (var4 == 111) {
			boolean var41 = tryMove(0, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 0, var2, localPlayer.routeZ[0]);
			if (!var41) {
				tryMove(1, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 1, var2, localPlayer.routeZ[0]);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			out.p1enc(55);
			out.p2(var2 + mapBuildBaseX);
			out.p2(var3 + mapBuildBaseZ);
			out.p2(var5);
			out.p2(field1376);
			out.p2(field1374);
			out.p2(field1375);
		}
		if (var4 == 810 && interactWithLoc(var5, 184, var3, var2)) {
			out.p2(field1376);
			out.p2(field1374);
			out.p2(field1375);
		}
		if (var4 == 829) {
			ClientNpc var43 = npc[var5];
			if (var43 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var43.routeZ[0], 0, 0, false, 2, 1, var43.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				out.p1enc(160);
				out.p2(var5);
				out.p2(field1376);
				out.p2(field1374);
				out.p2(field1375);
			}
		}
		if (var4 == 1381) {
			int var44 = var5 >> 14 & 0x7FFF;
			LocType var45 = LocType.list(var44);
			String var46;
			if (var45.desc == null) {
				var46 = "It's a " + var45.name + ".";
			} else {
				var46 = new String(var45.desc);
			}
			addChat(0, var46, "");
		}
		if (var4 == 1071) {
			interactWithLoc(var5, 126, var3, var2);
		}
		if (var4 == 139 || var4 == 778 || var4 == 617 || var4 == 224 || var4 == 662) {
			boolean var47 = tryMove(0, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 0, var2, localPlayer.routeZ[0]);
			if (!var47) {
				tryMove(1, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 1, var2, localPlayer.routeZ[0]);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			if (var4 == 662) {
				oplogic3 += mapBuildBaseZ;
				if (oplogic3 >= 118) {
					out.p1enc(122);
					out.p4(0);
				}
				out.p1enc(22);
			}
			if (var4 == 139) {
				if ((var2 & 0x3) == 0) {
					oplogic7++;
				}
				if (oplogic7 >= 123) {
					out.p1enc(133);
					out.p4(0);
				}
				out.p1enc(97);
			}
			if (var4 == 778) {
				out.p1enc(4);
			}
			if (var4 == 617) {
				out.p1enc(110);
			}
			if (var4 == 224) {
				oplogic8 += var3;
				if (oplogic8 >= 75) {
					out.p1enc(168);
					out.p1(19);
				}
				out.p1enc(147);
			}
			out.p2(var2 + mapBuildBaseX);
			out.p2(var3 + mapBuildBaseZ);
			out.p2(var5);
		}
		if (var4 == 435) {
			out.p1enc(86);
			out.p2(var3);
			IfType var49 = IfType.list[var3];
			if (var49.scripts != null && var49.scripts[0][0] == 5) {
				int var50 = var49.scripts[0][1];
				var[var50] = 1 - var[var50];
				clientVar(var50);
				redrawSidebar = true;
			}
		}
		if (var4 == 357) {
			interactWithLoc(var5, 53, var3, var2);
		}
		if (var4 == 370) {
			boolean var51 = tryMove(0, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 0, var2, localPlayer.routeZ[0]);
			if (!var51) {
				tryMove(1, localPlayer.routeX[0], 0, var3, 0, 0, false, 2, 1, var2, localPlayer.routeZ[0]);
			}
			crossX = super.mouseClickX;
			crossY = super.mouseClickY;
			crossMode = 2;
			crossCycle = 0;
			out.p1enc(241);
			out.p2(var2 + mapBuildBaseX);
			out.p2(var3 + mapBuildBaseZ);
			out.p2(var5);
			out.p2(field1416);
		}
		if (var4 == 639 || var4 == 499 || var4 == 27 || var4 == 387 || var4 == 185) {
			ClientPlayer var53 = players[var5];
			if (var53 != null) {
				tryMove(1, localPlayer.routeX[0], 0, var53.routeZ[0], 0, 0, false, 2, 1, var53.routeX[0], localPlayer.routeZ[0]);
				crossX = super.mouseClickX;
				crossY = super.mouseClickY;
				crossMode = 2;
				crossCycle = 0;
				if (var4 == 185) {
					out.p1enc(69);
				}
				if (var4 == 387) {
					oplogic5 += var5;
					if (oplogic5 >= 66) {
						out.p1enc(46);
						out.p1(154);
					}
					out.p1enc(189);
				}
				if (var4 == 499) {
					out.p1enc(51);
				}
				if (var4 == 639) {
					oplogic4++;
					if (oplogic4 >= 52) {
						out.p1enc(49);
						out.p1(131);
					}
					out.p1enc(220);
				}
				if (var4 == 27) {
					out.p1enc(13);
				}
				out.p2(var5);
			}
		}
		if (var4 == 582 || var4 == 113 || var4 == 555 || var4 == 331 || var4 == 354) {
			if (var4 == 555) {
				out.p1enc(124);
			}
			if (var4 == 113) {
				out.p1enc(111);
			}
			if (var4 == 354) {
				out.p1enc(227);
			}
			if (var4 == 582) {
				if ((var5 & 0x3) == 0) {
					oplogic6++;
				}
				if (oplogic6 >= 133) {
					out.p1enc(73);
					out.p2(6118);
				}
				out.p1enc(44);
			}
			if (var4 == 331) {
				out.p1enc(248);
			}
			out.p2(var5);
			out.p2(var2);
			out.p2(var3);
			selectedCycle = 0;
			field1570 = var3;
			field1571 = var2;
			selectedArea = 2;
			if (IfType.list[var3].layerId == mainModalId) {
				selectedArea = 1;
			}
			if (IfType.list[var3].layerId == chatComId) {
				selectedArea = 3;
			}
		}
		if (var4 == 1328) {
			ObjType var54 = ObjType.list(var5);
			IfType var55 = IfType.list[var3];
			String var56;
			if (var55 != null && var55.linkObjNumber[var2] >= 100000) {
				var56 = var55.linkObjNumber[var2] + " x " + var54.name;
			} else if (var54.desc == null) {
				var56 = "It's a " + var54.name + ".";
			} else {
				var56 = new String(var54.desc);
			}
			addChat(0, var56, "");
		}
		useMode = 0;
		targetMode = 0;
		redrawSidebar = true;
	}

	@ObfuscatedName("client.h(Z)V")
	public void addWorldOptions() {
		if (useMode == 0 && targetMode == 0) {
			menuOption[menuNumEntries] = "Walk here";
			menuAction[menuNumEntries] = 718;
			menuParamB[menuNumEntries] = super.mouseX;
			menuParamC[menuNumEntries] = super.mouseY;
			menuNumEntries++;
		}
		int var1 = -1;
		for (int var2 = 0; var2 < Model.pickedCount; var2++) {
			int var3 = Model.pickedEntityTypecode[var2];
			int var4 = var3 & 0x7F;
			int var5 = var3 >> 7 & 0x7F;
			int var6 = var3 >> 29 & 0x3;
			int var7 = var3 >> 14 & 0x7FFF;
			if (var3 != var1) {
				var1 = var3;
				if (var6 == 2 && world.typeCode2(minusedlevel, var4, var5, var3) >= 0) {
					LocType var8 = LocType.list(var7);
					if (var8.multiloc != null) {
						VarbitType var9 = VarbitType.list[var8.multivarbit];
						int var10 = var9.basevar;
						int var11 = var9.startbit;
						int var12 = var9.endbit;
						int var13 = readbit[var12 - var11];
						int var14 = var[var10] >> var11 & var13;
						if (var14 < 0 || var14 >= var8.multiloc.length || var8.multiloc[var14] == -1) {
							continue;
						}
						var8 = LocType.list(var8.multiloc[var14]);
					}
					if (useMode == 1) {
						menuOption[menuNumEntries] = "Use " + objSelectedName + " with @cya@" + var8.name;
						menuAction[menuNumEntries] = 810;
						menuParamA[menuNumEntries] = var3;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					} else if (targetMode == 1) {
						if ((targetMask & 0x4) == 0x4) {
							menuOption[menuNumEntries] = targetOp + " @cya@" + var8.name;
							menuAction[menuNumEntries] = 899;
							menuParamA[menuNumEntries] = var3;
							menuParamB[menuNumEntries] = var4;
							menuParamC[menuNumEntries] = var5;
							menuNumEntries++;
						}
					} else {
						if (var8.op != null) {
							for (int var15 = 4; var15 >= 0; var15--) {
								if (var8.op[var15] != null) {
									menuOption[menuNumEntries] = var8.op[var15] + " @cya@" + var8.name;
									if (var15 == 0) {
										menuAction[menuNumEntries] = 625;
									}
									if (var15 == 1) {
										menuAction[menuNumEntries] = 721;
									}
									if (var15 == 2) {
										menuAction[menuNumEntries] = 743;
									}
									if (var15 == 3) {
										menuAction[menuNumEntries] = 357;
									}
									if (var15 == 4) {
										menuAction[menuNumEntries] = 1071;
									}
									menuParamA[menuNumEntries] = var3;
									menuParamB[menuNumEntries] = var4;
									menuParamC[menuNumEntries] = var5;
									menuNumEntries++;
								}
							}
						}
						menuOption[menuNumEntries] = "Examine @cya@" + var8.name;
						menuAction[menuNumEntries] = 1381;
						menuParamA[menuNumEntries] = var8.id << 14;
						menuParamB[menuNumEntries] = var4;
						menuParamC[menuNumEntries] = var5;
						menuNumEntries++;
					}
				}
				if (var6 == 1) {
					ClientNpc var16 = npc[var7];
					if (var16.type.size == 1 && (var16.x & 0x7F) == 0x40 && (var16.z & 0x7F) == 0x40) {
						for (int var17 = 0; var17 < npcCount; var17++) {
							ClientNpc var18 = npc[npcIds[var17]];
							if (var18 != null && var18 != var16 && var18.type.size == 1 && var18.x == var16.x && var18.z == var16.z) {
								addNpcOptions(npcIds[var17], var18.type, var4, var5);
							}
						}
						for (int var19 = 0; var19 < playerCount; var19++) {
							ClientPlayer var20 = players[playerIds[var19]];
							if (var20 != null && var20.x == var16.x && var20.z == var16.z) {
								addPlayerOptions(var5, var20, var4, playerIds[var19]);
							}
						}
					}
					addNpcOptions(var7, var16.type, var4, var5);
				}
				if (var6 == 0) {
					ClientPlayer var21 = players[var7];
					if ((var21.x & 0x7F) == 0x40 && (var21.z & 0x7F) == 0x40) {
						for (int var22 = 0; var22 < npcCount; var22++) {
							ClientNpc var23 = npc[npcIds[var22]];
							if (var23 != null && var23.type.size == 1 && var23.x == var21.x && var23.z == var21.z) {
								addNpcOptions(npcIds[var22], var23.type, var4, var5);
							}
						}
						for (int var24 = 0; var24 < playerCount; var24++) {
							ClientPlayer var25 = players[playerIds[var24]];
							if (var25 != null && var25 != var21 && var25.x == var21.x && var25.z == var21.z) {
								addPlayerOptions(var5, var25, var4, playerIds[var24]);
							}
						}
					}
					addPlayerOptions(var5, var21, var4, var7);
				}
				if (var6 == 3) {
					LinkList var26 = groundObj[minusedlevel][var4][var5];
					if (var26 != null) {
						for (ClientObj var27 = (ClientObj) var26.tail(); var27 != null; var27 = (ClientObj) var26.prev()) {
							ObjType var28 = ObjType.list(var27.id);
							if (useMode == 1) {
								menuOption[menuNumEntries] = "Use " + objSelectedName + " with @lre@" + var28.name;
								menuAction[menuNumEntries] = 111;
								menuParamA[menuNumEntries] = var27.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							} else if (targetMode == 1) {
								if ((targetMask & 0x1) == 0x1) {
									menuOption[menuNumEntries] = targetOp + " @lre@" + var28.name;
									menuAction[menuNumEntries] = 370;
									menuParamA[menuNumEntries] = var27.id;
									menuParamB[menuNumEntries] = var4;
									menuParamC[menuNumEntries] = var5;
									menuNumEntries++;
								}
							} else {
								for (int var29 = 4; var29 >= 0; var29--) {
									if (var28.op != null && var28.op[var29] != null) {
										menuOption[menuNumEntries] = var28.op[var29] + " @lre@" + var28.name;
										if (var29 == 0) {
											menuAction[menuNumEntries] = 139;
										}
										if (var29 == 1) {
											menuAction[menuNumEntries] = 778;
										}
										if (var29 == 2) {
											menuAction[menuNumEntries] = 617;
										}
										if (var29 == 3) {
											menuAction[menuNumEntries] = 224;
										}
										if (var29 == 4) {
											menuAction[menuNumEntries] = 662;
										}
										menuParamA[menuNumEntries] = var27.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									} else if (var29 == 2) {
										menuOption[menuNumEntries] = "Take @lre@" + var28.name;
										menuAction[menuNumEntries] = 617;
										menuParamA[menuNumEntries] = var27.id;
										menuParamB[menuNumEntries] = var4;
										menuParamC[menuNumEntries] = var5;
										menuNumEntries++;
									}
								}
								menuOption[menuNumEntries] = "Examine @lre@" + var28.name;
								menuAction[menuNumEntries] = 1152;
								menuParamA[menuNumEntries] = var27.id;
								menuParamB[menuNumEntries] = var4;
								menuParamC[menuNumEntries] = var5;
								menuNumEntries++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ILgc;III)V")
	public void addNpcOptions(int arg0, NpcType arg1, int arg2, int arg3) {
		if (menuNumEntries >= 400) {
			return;
		}
		String var5 = arg1.name;
		if (arg1.vislevel != 0) {
			var5 = var5 + combatColourCode(arg1.vislevel, localPlayer.combatLevel) + " (level-" + arg1.vislevel + ")";
		}
		if (useMode == 1) {
			menuOption[menuNumEntries] = "Use " + objSelectedName + " with @yel@" + var5;
			menuAction[menuNumEntries] = 829;
			menuParamA[menuNumEntries] = arg0;
			menuParamB[menuNumEntries] = arg2;
			menuParamC[menuNumEntries] = arg3;
			menuNumEntries++;
		} else if (targetMode == 1) {
			if ((targetMask & 0x2) == 0x2) {
				menuOption[menuNumEntries] = targetOp + " @yel@" + var5;
				menuAction[menuNumEntries] = 240;
				menuParamA[menuNumEntries] = arg0;
				menuParamB[menuNumEntries] = arg2;
				menuParamC[menuNumEntries] = arg3;
				menuNumEntries++;
			}
		} else {
			if (arg1.op != null) {
				for (int var6 = 4; var6 >= 0; var6--) {
					if (arg1.op[var6] != null && !arg1.op[var6].equalsIgnoreCase("attack")) {
						menuOption[menuNumEntries] = arg1.op[var6] + " @yel@" + var5;
						if (var6 == 0) {
							menuAction[menuNumEntries] = 242;
						}
						if (var6 == 1) {
							menuAction[menuNumEntries] = 209;
						}
						if (var6 == 2) {
							menuAction[menuNumEntries] = 309;
						}
						if (var6 == 3) {
							menuAction[menuNumEntries] = 852;
						}
						if (var6 == 4) {
							menuAction[menuNumEntries] = 793;
						}
						menuParamA[menuNumEntries] = arg0;
						menuParamB[menuNumEntries] = arg2;
						menuParamC[menuNumEntries] = arg3;
						menuNumEntries++;
					}
				}
			}
			if (arg1.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg1.op[var7] != null && arg1.op[var7].equalsIgnoreCase("attack")) {
						short var8 = 0;
						if (arg1.vislevel > localPlayer.combatLevel) {
							var8 = 2000;
						}
						menuOption[menuNumEntries] = arg1.op[var7] + " @yel@" + var5;
						if (var7 == 0) {
							menuAction[menuNumEntries] = var8 + 242;
						}
						if (var7 == 1) {
							menuAction[menuNumEntries] = var8 + 209;
						}
						if (var7 == 2) {
							menuAction[menuNumEntries] = var8 + 309;
						}
						if (var7 == 3) {
							menuAction[menuNumEntries] = var8 + 852;
						}
						if (var7 == 4) {
							menuAction[menuNumEntries] = var8 + 793;
						}
						menuParamA[menuNumEntries] = arg0;
						menuParamB[menuNumEntries] = arg2;
						menuParamC[menuNumEntries] = arg3;
						menuNumEntries++;
					}
				}
			}
			menuOption[menuNumEntries] = "Examine @yel@" + var5;
			menuAction[menuNumEntries] = 1714;
			menuParamA[menuNumEntries] = arg0;
			menuParamB[menuNumEntries] = arg2;
			menuParamC[menuNumEntries] = arg3;
			menuNumEntries++;
		}
	}

	@ObfuscatedName("client.a(IILab;II)V")
	public void addPlayerOptions(int arg0, ClientPlayer arg1, int arg2, int arg3) {
		if (arg1 == localPlayer || menuNumEntries >= 400) {
			return;
		}
		String var5;
		if (arg1.skillLevel == 0) {
			var5 = arg1.name + combatColourCode(arg1.combatLevel, localPlayer.combatLevel) + " (level-" + arg1.combatLevel + ")";
		} else {
			var5 = arg1.name + " (skill-" + arg1.skillLevel + ")";
		}
		if (useMode == 1) {
			menuOption[menuNumEntries] = "Use " + objSelectedName + " with @whi@" + var5;
			menuAction[menuNumEntries] = 275;
			menuParamA[menuNumEntries] = arg3;
			menuParamB[menuNumEntries] = arg2;
			menuParamC[menuNumEntries] = arg0;
			menuNumEntries++;
		} else if (targetMode == 1) {
			if ((targetMask & 0x8) == 0x8) {
				menuOption[menuNumEntries] = targetOp + " @whi@" + var5;
				menuAction[menuNumEntries] = 131;
				menuParamA[menuNumEntries] = arg3;
				menuParamB[menuNumEntries] = arg2;
				menuParamC[menuNumEntries] = arg0;
				menuNumEntries++;
			}
		} else {
			for (int var6 = 4; var6 >= 0; var6--) {
				if (playerOp[var6] != null) {
					menuOption[menuNumEntries] = playerOp[var6] + " @whi@" + var5;
					short var7 = 0;
					if (playerOp[var6].equalsIgnoreCase("attack")) {
						if (arg1.combatLevel > localPlayer.combatLevel) {
							var7 = 2000;
						}
						if (localPlayer.team != 0 && arg1.team != 0) {
							if (localPlayer.team == arg1.team) {
								var7 = 2000;
							} else {
								var7 = 0;
							}
						}
					} else if (playerOpPriority[var6]) {
						var7 = 2000;
					}
					if (var6 == 0) {
						menuAction[menuNumEntries] = var7 + 639;
					}
					if (var6 == 1) {
						menuAction[menuNumEntries] = var7 + 499;
					}
					if (var6 == 2) {
						menuAction[menuNumEntries] = var7 + 27;
					}
					if (var6 == 3) {
						menuAction[menuNumEntries] = var7 + 387;
					}
					if (var6 == 4) {
						menuAction[menuNumEntries] = var7 + 185;
					}
					menuParamA[menuNumEntries] = arg3;
					menuParamB[menuNumEntries] = arg2;
					menuParamC[menuNumEntries] = arg0;
					menuNumEntries++;
				}
			}
		}
		for (int var8 = 0; var8 < menuNumEntries; var8++) {
			if (menuAction[var8] == 718) {
				menuOption[var8] = "Walk here @whi@" + var5;
				break;
			}
		}
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public void addComponentOptions(int arg0, int arg1, int arg2, IfType arg3, int arg4, int arg5) {
		if (arg3.type != 0 || arg3.children == null || arg3.hide || (arg2 < arg0 || arg5 < arg4 || arg2 > arg0 + arg3.width || arg5 > arg4 + arg3.height)) {
			return;
		}
		int var7 = arg3.children.length;
		for (int var8 = 0; var8 < var7; var8++) {
			int var9 = arg3.childX[var8] + arg0;
			int var10 = arg3.childY[var8] + arg4 - arg1;
			IfType var11 = IfType.list[arg3.children[var8]];
			int var12 = var9 + var11.field80;
			int var13 = var10 + var11.field81;
			if ((var11.overLayerId >= 0 || var11.colourOver != 0) && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
				if (var11.overLayerId >= 0) {
					field1246 = var11.overLayerId;
				} else {
					field1246 = var11.id;
				}
			}
			if (var11.type == 0) {
				addComponentOptions(var12, var11.scrollPos, arg2, var11, var13, arg5);
				if (var11.scrollHeight > var11.height) {
					doScrollbar(var13, arg2, var11, var12 + var11.width, true, var11.height, field1251, arg5, var11.scrollHeight);
				}
			} else {
				if (var11.buttonType == 1 && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					boolean var14 = false;
					if (var11.clientCode != 0) {
						var14 = addSocialOptions(var11);
					}
					if (!var14) {
						menuOption[menuNumEntries] = var11.buttonText;
						menuAction[menuNumEntries] = 231;
						menuParamC[menuNumEntries] = var11.id;
						menuNumEntries++;
					}
				}
				if (var11.buttonType == 2 && targetMode == 0 && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					String var15 = var11.targetVerb;
					if (var15.indexOf(" ") != -1) {
						var15 = var15.substring(0, var15.indexOf(" "));
					}
					menuOption[menuNumEntries] = var15 + " @gre@" + var11.targetBase;
					menuAction[menuNumEntries] = 274;
					menuParamC[menuNumEntries] = var11.id;
					menuNumEntries++;
				}
				if (var11.buttonType == 3 && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					menuOption[menuNumEntries] = "Close";
					menuAction[menuNumEntries] = 737;
					menuParamC[menuNumEntries] = var11.id;
					menuNumEntries++;
				}
				if (var11.buttonType == 4 && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					menuOption[menuNumEntries] = var11.buttonText;
					menuAction[menuNumEntries] = 435;
					menuParamC[menuNumEntries] = var11.id;
					menuNumEntries++;
				}
				if (var11.buttonType == 5 && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					menuOption[menuNumEntries] = var11.buttonText;
					menuAction[menuNumEntries] = 225;
					menuParamC[menuNumEntries] = var11.id;
					menuNumEntries++;
				}
				if (var11.buttonType == 6 && !resumedPauseButton && arg2 >= var12 && arg5 >= var13 && arg2 < var12 + var11.width && arg5 < var13 + var11.height) {
					menuOption[menuNumEntries] = var11.buttonText;
					menuAction[menuNumEntries] = 997;
					menuParamC[menuNumEntries] = var11.id;
					menuNumEntries++;
				}
				if (var11.type == 2) {
					int var16 = 0;
					for (int var17 = 0; var17 < var11.height; var17++) {
						for (int var18 = 0; var18 < var11.width; var18++) {
							int var19 = var12 + var18 * (var11.marginX + 32);
							int var20 = var13 + var17 * (var11.marginY + 32);
							if (var16 < 20) {
								var19 += var11.invBackgroundX[var16];
								var20 += var11.invBackgroundY[var16];
							}
							if (arg2 >= var19 && arg5 >= var20 && arg2 < var19 + 32 && arg5 < var20 + 32) {
								hoveredSlot = var16;
								hoveredSlotComId = var11.id;
								if (var11.linkObjType[var16] > 0) {
									ObjType var21 = ObjType.list(var11.linkObjType[var16] - 1);
									if (useMode == 1 && var11.objOps) {
										if (var11.id != field1375 || var16 != field1374) {
											menuOption[menuNumEntries] = "Use " + objSelectedName + " with @lre@" + var21.name;
											menuAction[menuNumEntries] = 398;
											menuParamA[menuNumEntries] = var21.id;
											menuParamB[menuNumEntries] = var16;
											menuParamC[menuNumEntries] = var11.id;
											menuNumEntries++;
										}
									} else if (targetMode == 1 && var11.objOps) {
										if ((targetMask & 0x10) == 0x10) {
											menuOption[menuNumEntries] = targetOp + " @lre@" + var21.name;
											menuAction[menuNumEntries] = 563;
											menuParamA[menuNumEntries] = var21.id;
											menuParamB[menuNumEntries] = var16;
											menuParamC[menuNumEntries] = var11.id;
											menuNumEntries++;
										}
									} else {
										if (var11.objOps) {
											for (int var22 = 4; var22 >= 3; var22--) {
												if (var21.iop != null && var21.iop[var22] != null) {
													menuOption[menuNumEntries] = var21.iop[var22] + " @lre@" + var21.name;
													if (var22 == 3) {
														menuAction[menuNumEntries] = 681;
													}
													if (var22 == 4) {
														menuAction[menuNumEntries] = 100;
													}
													menuParamA[menuNumEntries] = var21.id;
													menuParamB[menuNumEntries] = var16;
													menuParamC[menuNumEntries] = var11.id;
													menuNumEntries++;
												} else if (var22 == 4) {
													menuOption[menuNumEntries] = "Drop @lre@" + var21.name;
													menuAction[menuNumEntries] = 100;
													menuParamA[menuNumEntries] = var21.id;
													menuParamB[menuNumEntries] = var16;
													menuParamC[menuNumEntries] = var11.id;
													menuNumEntries++;
												}
											}
										}
										if (var11.objUse) {
											menuOption[menuNumEntries] = "Use @lre@" + var21.name;
											menuAction[menuNumEntries] = 102;
											menuParamA[menuNumEntries] = var21.id;
											menuParamB[menuNumEntries] = var16;
											menuParamC[menuNumEntries] = var11.id;
											menuNumEntries++;
										}
										if (var11.objOps && var21.iop != null) {
											for (int var23 = 2; var23 >= 0; var23--) {
												if (var21.iop[var23] != null) {
													menuOption[menuNumEntries] = var21.iop[var23] + " @lre@" + var21.name;
													if (var23 == 0) {
														menuAction[menuNumEntries] = 694;
													}
													if (var23 == 1) {
														menuAction[menuNumEntries] = 962;
													}
													if (var23 == 2) {
														menuAction[menuNumEntries] = 795;
													}
													menuParamA[menuNumEntries] = var21.id;
													menuParamB[menuNumEntries] = var16;
													menuParamC[menuNumEntries] = var11.id;
													menuNumEntries++;
												}
											}
										}
										if (var11.iop != null) {
											for (int var24 = 4; var24 >= 0; var24--) {
												if (var11.iop[var24] != null) {
													menuOption[menuNumEntries] = var11.iop[var24] + " @lre@" + var21.name;
													if (var24 == 0) {
														menuAction[menuNumEntries] = 582;
													}
													if (var24 == 1) {
														menuAction[menuNumEntries] = 113;
													}
													if (var24 == 2) {
														menuAction[menuNumEntries] = 555;
													}
													if (var24 == 3) {
														menuAction[menuNumEntries] = 331;
													}
													if (var24 == 4) {
														menuAction[menuNumEntries] = 354;
													}
													menuParamA[menuNumEntries] = var21.id;
													menuParamB[menuNumEntries] = var16;
													menuParamC[menuNumEntries] = var11.id;
													menuNumEntries++;
												}
											}
										}
										menuOption[menuNumEntries] = "Examine @lre@" + var21.name;
										menuAction[menuNumEntries] = 1328;
										menuParamA[menuNumEntries] = var21.id;
										menuParamB[menuNumEntries] = var16;
										menuParamC[menuNumEntries] = var11.id;
										menuNumEntries++;
									}
								}
							}
							var16++;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ld;Z)Z")
	public boolean addSocialOptions(IfType arg0) {
		int var2 = arg0.clientCode;
		if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
			if (var2 >= 801) {
				var2 -= 701;
			} else if (var2 >= 701) {
				var2 -= 601;
			} else if (var2 >= 101) {
				var2 -= 101;
			} else {
				var2--;
			}
			menuOption[menuNumEntries] = "Remove @whi@" + friendUsername[var2];
			menuAction[menuNumEntries] = 513;
			menuNumEntries++;
			menuOption[menuNumEntries] = "Message @whi@" + friendUsername[var2];
			menuAction[menuNumEntries] = 902;
			menuNumEntries++;
			return true;
		} else if (var2 >= 401 && var2 <= 500) {
			menuOption[menuNumEntries] = "Remove @whi@" + arg0.text;
			menuAction[menuNumEntries] = 884;
			menuNumEntries++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static String combatColourCode(int arg0, int arg1) {
		int var2 = arg1 - arg0;
		if (var2 < -9) {
			return "@red@";
		} else if (var2 < -6) {
			return "@or3@";
		} else if (var2 < -3) {
			return "@or2@";
		} else if (var2 < 0) {
			return "@or1@";
		} else if (var2 > 9) {
			return "@gre@";
		} else if (var2 > 6) {
			return "@gr3@";
		} else if (var2 > 3) {
			return "@gr2@";
		} else if (var2 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.a(IIILd;I)V")
	public void drawInterface(int arg0, int arg1, IfType arg2, int arg3) {
		if (arg2.type != 0 || arg2.children == null || arg2.hide && field1420 != arg2.id && field1354 != arg2.id && field1633 != arg2.id) {
			return;
		}
		int var5 = Pix2D.clipMinX;
		int var6 = Pix2D.clipMinY;
		int var7 = Pix2D.clipMaxX;
		int var8 = Pix2D.clipMaxY;
		Pix2D.setClipping(field1398, arg3 + arg2.height, arg1 + arg2.width, arg3, arg1);
		int var9 = arg2.children.length;
		for (int var10 = 0; var10 < var9; var10++) {
			int var11 = arg2.childX[var10] + arg1;
			int var12 = arg2.childY[var10] + arg3 - arg0;
			IfType var13 = IfType.list[arg2.children[var10]];
			int var14 = var11 + var13.field80;
			int var15 = var12 + var13.field81;
			if (var13.clientCode > 0) {
				clientComponent(var13);
			}
			if (var13.type == 0) {
				if (var13.scrollPos > var13.scrollHeight - var13.height) {
					var13.scrollPos = var13.scrollHeight - var13.height;
				}
				if (var13.scrollPos < 0) {
					var13.scrollPos = 0;
				}
				drawInterface(var13.scrollPos, var14, var13, var15);
				if (var13.scrollHeight > var13.height) {
					drawScrollbar(var15, var14 + var13.width, var13.scrollPos, var13.scrollHeight, var13.height);
				}
			} else if (var13.type != 1) {
				if (var13.type == 2) {
					int var16 = 0;
					for (int var17 = 0; var17 < var13.height; var17++) {
						for (int var18 = 0; var18 < var13.width; var18++) {
							int var19 = var14 + var18 * (var13.marginX + 32);
							int var20 = var15 + var17 * (var13.marginY + 32);
							if (var16 < 20) {
								var19 += var13.invBackgroundX[var16];
								var20 += var13.invBackgroundY[var16];
							}
							if (var13.linkObjType[var16] > 0) {
								int var21 = 0;
								int var22 = 0;
								int var23 = var13.linkObjType[var16] - 1;
								if (var19 > Pix2D.clipMinX - 32 && var19 < Pix2D.clipMaxX && var20 > Pix2D.clipMinY - 32 && var20 < Pix2D.clipMaxY || objDragArea != 0 && objDragSlot == var16) {
									int var24 = 0;
									if (useMode == 1 && field1374 == var16 && field1375 == var13.id) {
										var24 = 16777215;
									}
									Pix32 var25 = ObjType.getSprite(var23, var24, var13.linkObjNumber[var16]);
									if (var25 != null) {
										if (objDragArea != 0 && objDragSlot == var16 && objDragComId == var13.id) {
											var21 = super.mouseX - objGrabX;
											var22 = super.mouseY - objGrabY;
											if (var21 < 5 && var21 > -5) {
												var21 = 0;
											}
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (objDragCycle < 5) {
												var21 = 0;
												var22 = 0;
											}
											var25.transPlotSprite(field1323, var20 + var22, var19 + var21);
											if (var20 + var22 < Pix2D.clipMinY && arg2.scrollPos > 0) {
												int var26 = worldUpdateNum * (Pix2D.clipMinY - var20 - var22) / 3;
												if (var26 > worldUpdateNum * 10) {
													var26 = worldUpdateNum * 10;
												}
												if (var26 > arg2.scrollPos) {
													var26 = arg2.scrollPos;
												}
												arg2.scrollPos -= var26;
												objGrabY += var26;
											}
											if (var20 + var22 + 32 > Pix2D.clipMaxY && arg2.scrollPos < arg2.scrollHeight - arg2.height) {
												int var27 = worldUpdateNum * (var20 + var22 + 32 - Pix2D.clipMaxY) / 3;
												if (var27 > worldUpdateNum * 10) {
													var27 = worldUpdateNum * 10;
												}
												if (var27 > arg2.scrollHeight - arg2.height - arg2.scrollPos) {
													var27 = arg2.scrollHeight - arg2.height - arg2.scrollPos;
												}
												arg2.scrollPos += var27;
												objGrabY -= var27;
											}
										} else if (selectedArea != 0 && field1571 == var16 && field1570 == var13.id) {
											var25.transPlotSprite(field1323, var20, var19);
										} else {
											var25.plotSprite(var20, field1634, var19);
										}
										if (var25.owi == 33 || var13.linkObjNumber[var16] != 1) {
											int var28 = var13.linkObjNumber[var16];
											p11.drawString(0, invNumber(var28), var19 + var21 + 1, var20 + 10 + var22);
											p11.drawString(16776960, invNumber(var28), var19 + var21, var20 + 9 + var22);
										}
									}
								}
							} else if (var13.invBackground != null && var16 < 20) {
								Pix32 var29 = var13.invBackground[var16];
								if (var29 != null) {
									var29.plotSprite(var20, field1634, var19);
								}
							}
							var16++;
						}
					}
				} else if (var13.type == 3) {
					boolean var30 = false;
					if (field1633 == var13.id || field1354 == var13.id || field1420 == var13.id) {
						var30 = true;
					}
					int var31;
					if (getIfActive(var13)) {
						var31 = var13.colour2;
						if (var30 && var13.colour2Over != 0) {
							var31 = var13.colour2Over;
						}
					} else {
						var31 = var13.colour;
						if (var30 && var13.colourOver != 0) {
							var31 = var13.colourOver;
						}
					}
					if (var13.trans == 0) {
						if (var13.fill) {
							Pix2D.fillRect(var31, var15, var13.height, var14, var13.width);
						} else {
							Pix2D.drawRect(var14, var13.width, var31, var15, var13.height);
						}
					} else if (var13.fill) {
						Pix2D.fillRectTrans(var15, var13.height, 256 - (var13.trans & 0xFF), var31, var13.width, var14);
					} else {
						Pix2D.drawRectTrans(var13.height, var31, var14, var13.width, 256 - (var13.trans & 0xFF), var15);
					}
				} else if (var13.type == 4) {
					PixFont var32 = var13.font;
					String var33 = var13.text;
					boolean var34 = false;
					if (field1633 == var13.id || field1354 == var13.id || field1420 == var13.id) {
						var34 = true;
					}
					int var35;
					if (getIfActive(var13)) {
						var35 = var13.colour2;
						if (var34 && var13.colour2Over != 0) {
							var35 = var13.colour2Over;
						}
						if (var13.text2.length() > 0) {
							var33 = var13.text2;
						}
					} else {
						var35 = var13.colour;
						if (var34 && var13.colourOver != 0) {
							var35 = var13.colourOver;
						}
					}
					if (var13.buttonType == 6 && resumedPauseButton) {
						var33 = "Please wait...";
						var35 = var13.colour;
					}
					if (Pix2D.width == 479) {
						if (var35 == 16776960) {
							var35 = 255;
						}
						if (var35 == 49152) {
							var35 = 16777215;
						}
					}
					int var36 = var15 + var32.height;
					while (var33.length() > 0) {
						if (var33.indexOf("%") != -1) {
							label344: while (true) {
								int var37 = var33.indexOf("%1");
								if (var37 == -1) {
									while (true) {
										int var38 = var33.indexOf("%2");
										if (var38 == -1) {
											while (true) {
												int var39 = var33.indexOf("%3");
												if (var39 == -1) {
													while (true) {
														int var40 = var33.indexOf("%4");
														if (var40 == -1) {
															while (true) {
																int var41 = var33.indexOf("%5");
																if (var41 == -1) {
																	break label344;
																}
																var33 = var33.substring(0, var41) + inf(getIfVar(4, field1507, var13)) + var33.substring(var41 + 2);
															}
														}
														var33 = var33.substring(0, var40) + inf(getIfVar(3, field1507, var13)) + var33.substring(var40 + 2);
													}
												}
												var33 = var33.substring(0, var39) + inf(getIfVar(2, field1507, var13)) + var33.substring(var39 + 2);
											}
										}
										var33 = var33.substring(0, var38) + inf(getIfVar(1, field1507, var13)) + var33.substring(var38 + 2);
									}
								}
								var33 = var33.substring(0, var37) + inf(getIfVar(0, field1507, var13)) + var33.substring(var37 + 2);
							}
						}
						int var42 = var33.indexOf("\\n");
						String var43;
						if (var42 == -1) {
							var43 = var33;
							var33 = "";
						} else {
							var43 = var33.substring(0, var42);
							var33 = var33.substring(var42 + 2);
						}
						if (var13.centre) {
							var32.centreString(var13.shadow, var35, var14 + var13.width / 2, var43, var36);
						} else {
							var32.drawStringTag(var35, var36, var13.shadow, var14, var43);
						}
						var36 += var32.height;
					}
				} else if (var13.type == 5) {
					Pix32 var44;
					if (getIfActive(var13)) {
						var44 = var13.graphic2;
					} else {
						var44 = var13.graphic;
					}
					if (var44 != null) {
						var44.plotSprite(var15, field1634, var14);
					}
				} else if (var13.type == 6) {
					int var45 = Pix3D.originX;
					int var46 = Pix3D.originY;
					Pix3D.originX = var14 + var13.width / 2;
					Pix3D.originY = var15 + var13.height / 2;
					int var47 = Pix3D.sinTable[var13.modelXAn] * var13.modelZoom >> 16;
					int var48 = Pix3D.cosTable[var13.modelXAn] * var13.modelZoom >> 16;
					boolean var49 = getIfActive(var13);
					int var50;
					if (var49) {
						var50 = var13.modelAnim2;
					} else {
						var50 = var13.modelAnim;
					}
					Model var51;
					if (var50 == -1) {
						var51 = var13.getTempModel(-1, -1, var49);
					} else {
						SeqType var52 = SeqType.list[var50];
						var51 = var13.getTempModel(var52.iframes[var13.animFrame], var52.frames[var13.animFrame], var49);
					}
					if (var51 != null) {
						var51.objRender(var13.modelYAn, 0, var13.modelXAn, 0, var47, var48);
					}
					Pix3D.originX = var45;
					Pix3D.originY = var46;
				} else if (var13.type == 7) {
					PixFont var53 = var13.font;
					int var54 = 0;
					for (int var55 = 0; var55 < var13.height; var55++) {
						for (int var56 = 0; var56 < var13.width; var56++) {
							if (var13.linkObjType[var54] > 0) {
								ObjType var57 = ObjType.list(var13.linkObjType[var54] - 1);
								String var58 = var57.name;
								if (var57.stackable || var13.linkObjNumber[var54] != 1) {
									var58 = var58 + " x" + niceNumber(var13.linkObjNumber[var54]);
								}
								int var59 = var14 + var56 * (var13.marginX + 115);
								int var60 = var15 + var55 * (var13.marginY + 12);
								if (var13.centre) {
									var53.centreString(var13.shadow, var13.colour, var59 + var13.width / 2, var58, var60);
								} else {
									var53.drawStringTag(var13.colour, var60, var13.shadow, var59, var58);
								}
							}
							var54++;
						}
					}
				}
			}
		}
		Pix2D.setClipping(field1398, var8, var7, var6, var5);
	}

	@ObfuscatedName("client.d(II)Ljava/lang/String;")
	public static String invNumber(int arg0) {
		if (arg0 < 100000) {
			return String.valueOf(arg0);
		} else if (arg0 < 10000000) {
			return arg0 / 1000 + "K";
		} else {
			return arg0 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public static String niceNumber(int arg0) {
		String var1 = String.valueOf(arg0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}
		if (var1.length() > 8) {
			var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
		} else if (var1.length() > 4) {
			var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
		}
		return " " + var1;
	}

	@ObfuscatedName("client.a(IILd;IZIBII)V")
	public void doScrollbar(int arg0, int arg1, IfType arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8) {
		if (field1577) {
			field1253 = 32;
		} else {
			field1253 = 0;
		}
		field1577 = false;
		if (arg6 != -83) {
			out.p1(103);
		}
		if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 && arg7 < arg0 + 16) {
			arg2.scrollPos -= scrollCycle * 4;
			if (arg4) {
				redrawSidebar = true;
			}
		} else if (arg1 >= arg3 && arg1 < arg3 + 16 && arg7 >= arg0 + arg5 - 16 && arg7 < arg0 + arg5) {
			arg2.scrollPos += scrollCycle * 4;
			if (arg4) {
				redrawSidebar = true;
			}
		} else if (arg1 >= arg3 - field1253 && arg1 < arg3 + field1253 + 16 && arg7 >= arg0 + 16 && arg7 < arg0 + arg5 - 16 && scrollCycle > 0) {
			int var10 = (arg5 - 32) * arg5 / arg8;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg7 - arg0 - var10 / 2 - 16;
			int var12 = arg5 - var10 - 32;
			arg2.scrollPos = (arg8 - arg5) * var11 / var12;
			if (arg4) {
				redrawSidebar = true;
			}
			field1577 = true;
		} else {
		}
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		scrollbar0.plotSprite(arg0, field1634, arg1);
		scrollbar1.plotSprite(arg0 + arg4 - 16, field1634, arg1);
		Pix2D.fillRect(SCROLLBAR_TRACK, arg0 + 16, arg4 - 32, arg1, 16);
		int var6 = (arg4 - 32) * arg4 / arg3;
		if (var6 < 8) {
			var6 = 8;
		}
		int var7 = (arg4 - var6 - 32) * arg2 / (arg3 - arg4);
		Pix2D.fillRect(SCROLLBAR_GRIP_FOREGROUND, arg0 + var7 + 16, var6, arg1, 16);
		Pix2D.vline(arg0 + var7 + 16, arg1, SCROLLBAR_GRIP_HIGHLIGHT, var6);
		Pix2D.vline(arg0 + var7 + 16, arg1 + 1, SCROLLBAR_GRIP_HIGHLIGHT, var6);
		Pix2D.hline(16, arg1, SCROLLBAR_GRIP_HIGHLIGHT, arg0 + var7 + 16);
		Pix2D.hline(16, arg1, SCROLLBAR_GRIP_HIGHLIGHT, arg0 + var7 + 17);
		Pix2D.vline(arg0 + var7 + 16, arg1 + 15, SCROLLBAR_GRIP_LOWLIGHT, var6);
		Pix2D.vline(arg0 + var7 + 17, arg1 + 14, SCROLLBAR_GRIP_LOWLIGHT, var6 - 1);
		Pix2D.hline(16, arg1, SCROLLBAR_GRIP_LOWLIGHT, arg0 + var7 + var6 + 15);
		Pix2D.hline(15, arg1 + 1, SCROLLBAR_GRIP_LOWLIGHT, arg0 + var7 + var6 + 14);
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public String inf(int arg0) {
		return arg0 < 999999999 ? String.valueOf(arg0) : "*";
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public boolean getIfActive(IfType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (int var2 = 0; var2 < arg0.scriptComparator.length; var2++) {
			int var3 = getIfVar(var2, field1507, arg0);
			int var4 = arg0.scriptOperand[var2];
			if (arg0.scriptComparator[var2] == 2) {
				if (var3 >= var4) {
					return false;
				}
			} else if (arg0.scriptComparator[var2] == 3) {
				if (var3 <= var4) {
					return false;
				}
			} else if (arg0.scriptComparator[var2] == 4) {
				if (var3 == var4) {
					return false;
				}
			} else if (var3 != var4) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.a(IBLd;)I")
	public int getIfVar(int arg0, byte arg1, IfType arg2) {
		if (arg1 != field1305) {
			out.p1(14);
		}
		if (arg2.scripts == null || arg0 >= arg2.scripts.length) {
			return -2;
		}
		try {
			int[] var4 = arg2.scripts[arg0];
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
					var9 = field1456[var4[var6++]];
				}
				if (var8 == 2) {
					var9 = field1511[var4[var6++]];
				}
				if (var8 == 3) {
					var9 = field1272[var4[var6++]];
				}
				if (var8 == 4) {
					IfType var11 = IfType.list[var4[var6++]];
					int var12 = var4[var6++];
					if (var12 >= 0 && var12 < ObjType.numDefinitions && (!ObjType.list(var12).members || memServer)) {
						for (int var13 = 0; var13 < var11.linkObjType.length; var13++) {
							if (var11.linkObjType[var13] == var12 + 1) {
								var9 += var11.linkObjNumber[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var9 = var[var4[var6++]];
				}
				if (var8 == 6) {
					var9 = skillxp[field1511[var4[var6++]] - 1];
				}
				if (var8 == 7) {
					var9 = var[var4[var6++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var9 = localPlayer.combatLevel;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < Skills.count; var14++) {
						if (Skills.used[var14]) {
							var9 += field1511[var14];
						}
					}
				}
				if (var8 == 10) {
					IfType var15 = IfType.list[var4[var6++]];
					int var16 = var4[var6++] + 1;
					if (var16 >= 0 && var16 < ObjType.numDefinitions && (!ObjType.list(var16).members || memServer)) {
						for (int var17 = 0; var17 < var15.linkObjType.length; var17++) {
							if (var15.linkObjType[var17] == var16) {
								var9 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var9 = field1357;
				}
				if (var8 == 12) {
					var9 = field1626;
				}
				if (var8 == 13) {
					int var18 = var[var4[var6++]];
					int var19 = var4[var6++];
					var9 = (var18 & 0x1 << var19) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var20 = var4[var6++];
					VarbitType var21 = VarbitType.list[var20];
					int var22 = var21.basevar;
					int var23 = var21.startbit;
					int var24 = var21.endbit;
					int var25 = readbit[var24 - var23];
					var9 = var[var22] >> var23 & var25;
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
					var9 = (localPlayer.x >> 7) + mapBuildBaseX;
				}
				if (var8 == 19) {
					var9 = (localPlayer.z >> 7) + mapBuildBaseZ;
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

	@ObfuscatedName("client.e(II)V")
	public void ifAnimReset(int arg0) {
		IfType var2 = IfType.list[arg0];
		for (int var3 = 0; var3 < var2.children.length && var2.children[var3] != -1; var3++) {
			IfType var4 = IfType.list[var2.children[var3]];
			if (var4.type == 1) {
				ifAnimReset(var4.id);
			}
			var4.animFrame = 0;
			var4.animCycle = 0;
		}
	}

	@ObfuscatedName("client.a(IIB)Z")
	public boolean animateInterface(int arg0, int arg1) {
		boolean var3 = false;
		IfType var4 = IfType.list[arg1];
		for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
			IfType var6 = IfType.list[var4.children[var5]];
			if (var6.type == 1) {
				var3 |= animateInterface(arg0, var6.id);
			}
			if (var6.type == 6 && (var6.modelAnim != -1 || var6.modelAnim2 != -1)) {
				boolean var7 = getIfActive(var6);
				int var8;
				if (var7) {
					var8 = var6.modelAnim2;
				} else {
					var8 = var6.modelAnim;
				}
				if (var8 != -1) {
					SeqType var9 = SeqType.list[var8];
					var6.animCycle += arg0;
					while (var6.animCycle > var9.getDelay(var6.animFrame)) {
						var6.animCycle -= var9.getDelay(var6.animFrame) + 1;
						var6.animFrame++;
						if (var6.animFrame >= var9.numFrames) {
							var6.animFrame -= var9.loops;
							if (var6.animFrame < 0 || var6.animFrame >= var9.numFrames) {
								var6.animFrame = 0;
							}
						}
						var3 = true;
					}
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("client.b(ZI)V")
	public void clientVar(int arg0) {
		int var2 = VarpType.list[arg0].clientCode;
		if (var2 != 0) {
			int var3 = var[arg0];
			if (var2 == 1) {
				if (var3 == 1) {
					Pix3D.initColourTable(0.9D);
				}
				if (var3 == 2) {
					Pix3D.initColourTable(0.8D);
				}
				if (var3 == 3) {
					Pix3D.initColourTable(0.7D);
				}
				if (var3 == 4) {
					Pix3D.initColourTable(0.6D);
				}
				ObjType.spriteCache.clear();
				redrawFrame = true;
			}
			if (var2 == 3) {
				boolean var4 = midiActive;
				if (var3 == 0) {
					setMidiVolume(0, midiActive);
					midiActive = true;
				}
				if (var3 == 1) {
					setMidiVolume(-400, midiActive);
					midiActive = true;
				}
				if (var3 == 2) {
					setMidiVolume(-800, midiActive);
					midiActive = true;
				}
				if (var3 == 3) {
					setMidiVolume(-1200, midiActive);
					midiActive = true;
				}
				if (var3 == 4) {
					midiActive = false;
				}
				if (midiActive != var4 && !lowMem) {
					if (midiActive) {
						midiSong = nextMidiSong;
						midiFading = true;
						onDemand.request(2, midiSong);
					} else {
						stopMidi();
					}
					nextMidiDelay = 0;
				}
			}
			if (var2 == 4) {
				if (var3 == 0) {
					waveEnabled = true;
					setWaveVolume(field1406, 0);
				}
				if (var3 == 1) {
					waveEnabled = true;
					setWaveVolume(field1406, -400);
				}
				if (var3 == 2) {
					waveEnabled = true;
					setWaveVolume(field1406, -800);
				}
				if (var3 == 3) {
					waveEnabled = true;
					setWaveVolume(field1406, -1200);
				}
				if (var3 == 4) {
					waveEnabled = false;
				}
			}
			if (var2 == 5) {
				oneMouseButton = var3;
			}
			if (var2 == 6) {
				chatEffects = var3;
			}
			if (var2 == 8) {
				splitPrivateChat = var3;
				redrawChatback = true;
			}
			if (var2 == 9) {
				bankArrangeMode = var3;
			}
		}
	}

	@ObfuscatedName("client.a(ILd;)V")
	public void clientComponent(IfType arg0) {
		int var2 = arg0.clientCode;
		if ((var2 < 1 || var2 > 100) && (var2 < 701 || var2 > 800)) {
			if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
				int var4 = friendCount;
				if (friendServerStatus != 2) {
					var4 = 0;
				}
				if (var2 > 800) {
					var2 -= 701;
				} else {
					var2 -= 101;
				}
				if (var2 >= var4) {
					arg0.text = "";
					arg0.buttonType = 0;
				} else {
					if (friendNodeId[var2] == 0) {
						arg0.text = "@red@Offline";
					} else if (friendNodeId[var2] == nodeId) {
						arg0.text = "@gre@World-" + (friendNodeId[var2] - 9);
					} else {
						arg0.text = "@yel@World-" + (friendNodeId[var2] - 9);
					}
					arg0.buttonType = 1;
				}
			} else if (var2 == 203) {
				int var5 = friendCount;
				if (friendServerStatus != 2) {
					var5 = 0;
				}
				arg0.scrollHeight = var5 * 15 + 20;
				if (arg0.scrollHeight <= arg0.height) {
					arg0.scrollHeight = arg0.height + 1;
				}
			} else if (var2 >= 401 && var2 <= 500) {
				var2 -= 401;
				if (var2 == 0 && friendServerStatus == 0) {
					arg0.text = "Loading ignore list";
					arg0.buttonType = 0;
				} else if (var2 == 1 && friendServerStatus == 0) {
					arg0.text = "Please wait...";
					arg0.buttonType = 0;
				} else {
					int var6 = ignoreCount;
					if (friendServerStatus == 0) {
						var6 = 0;
					}
					if (var2 >= var6) {
						arg0.text = "";
						arg0.buttonType = 0;
					} else {
						arg0.text = JString.toSentenceCase(JString.toRawUsername(ignoreUserhash[var2]));
						arg0.buttonType = 1;
					}
				}
			} else if (var2 == 503) {
				arg0.scrollHeight = ignoreCount * 15 + 20;
				if (arg0.scrollHeight <= arg0.height) {
					arg0.scrollHeight = arg0.height + 1;
				}
			} else if (var2 == 327) {
				arg0.modelXAn = 150;
				arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
				if (idkDesignRedraw) {
					for (int var7 = 0; var7 < 7; var7++) {
						int var8 = idkDesignPart[var7];
						if (var8 >= 0 && !IdkType.list[var8].checkModel()) {
							return;
						}
					}
					idkDesignRedraw = false;
					Model[] var9 = new Model[7];
					int var10 = 0;
					for (int var11 = 0; var11 < 7; var11++) {
						int var12 = idkDesignPart[var11];
						if (var12 >= 0) {
							var9[var10++] = IdkType.list[var12].getModelNoCheck();
						}
					}
					Model var13 = new Model(var9, var10, -33019);
					for (int var14 = 0; var14 < 5; var14++) {
						if (idkDesignColour[var14] != 0) {
							var13.recolour(recol1d[var14][0], recol1d[var14][idkDesignColour[var14]]);
							if (var14 == 1) {
								var13.recolour(recol2d[0], recol2d[idkDesignColour[var14]]);
							}
						}
					}
					var13.prepareAnim();
					var13.animate(SeqType.list[localPlayer.readyanim].frames[0]);
					var13.calculateNormals(64, 850, -30, -50, -30, true);
					arg0.model1Type = 5;
					arg0.model1Id = 0;
					IfType.cacheModel(var13);
				}
			} else if (var2 == 324) {
				if (idkDesignButton1 == null) {
					idkDesignButton1 = arg0.graphic;
					idkDesignButton2 = arg0.graphic2;
				}
				if (idkDesignGender) {
					arg0.graphic = idkDesignButton2;
				} else {
					arg0.graphic = idkDesignButton1;
				}
			} else if (var2 == 325) {
				if (idkDesignButton1 == null) {
					idkDesignButton1 = arg0.graphic;
					idkDesignButton2 = arg0.graphic2;
				}
				if (idkDesignGender) {
					arg0.graphic = idkDesignButton1;
				} else {
					arg0.graphic = idkDesignButton2;
				}
			} else if (var2 == 600) {
				arg0.text = reportAbuseInput;
				if (loopCycle % 20 < 10) {
					arg0.text = arg0.text + "|";
				} else {
					arg0.text = arg0.text + " ";
				}
			} else {
				if (var2 == 613) {
					if (staffmodlevel < 1) {
						arg0.text = "";
					} else if (reportAbuseMuteOption) {
						arg0.colour = 16711680;
						arg0.text = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.colour = 16777215;
						arg0.text = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var2 == 650 || var2 == 655) {
					if (lastAddress == 0) {
						arg0.text = "";
					} else {
						String var15;
						if (daysSinceLastLogin == 0) {
							var15 = "earlier today";
						} else if (daysSinceLastLogin == 1) {
							var15 = "yesterday";
						} else {
							var15 = daysSinceLastLogin + " days ago";
						}
						arg0.text = "You last logged in " + var15 + " from: " + signlink.dns;
					}
				}
				if (var2 == 651) {
					if (unreadMessages == 0) {
						arg0.text = "0 unread messages";
						arg0.colour = 16776960;
					}
					if (unreadMessages == 1) {
						arg0.text = "1 unread message";
						arg0.colour = 65280;
					}
					if (unreadMessages > 1) {
						arg0.text = unreadMessages + " unread messages";
						arg0.colour = 65280;
					}
				}
				if (var2 == 652) {
					if (daysSinceRecoveriesChanged == 201) {
						if (warnMembersInNonMembers == 1) {
							arg0.text = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.text = "";
						}
					} else if (daysSinceRecoveriesChanged == 200) {
						arg0.text = "You have not yet set any password recovery questions.";
					} else {
						String var16;
						if (daysSinceRecoveriesChanged == 0) {
							var16 = "Earlier today";
						} else if (daysSinceRecoveriesChanged == 1) {
							var16 = "Yesterday";
						} else {
							var16 = daysSinceRecoveriesChanged + " days ago";
						}
						arg0.text = var16 + " you changed your recovery questions";
					}
				}
				if (var2 == 653) {
					if (daysSinceRecoveriesChanged == 201) {
						if (warnMembersInNonMembers == 1) {
							arg0.text = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.text = "";
						}
					} else if (daysSinceRecoveriesChanged == 200) {
						arg0.text = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.text = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var2 == 654) {
					if (daysSinceRecoveriesChanged == 201) {
						if (warnMembersInNonMembers == 1) {
							arg0.text = "@whi@this world but member benefits are unavailable whilst here.";
						} else {
							arg0.text = "";
						}
					} else if (daysSinceRecoveriesChanged == 200) {
						arg0.text = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.text = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} else if (var2 == 1 && friendServerStatus == 0) {
			arg0.text = "Loading friend list";
			arg0.buttonType = 0;
		} else if (var2 == 1 && friendServerStatus == 1) {
			arg0.text = "Connecting to friendserver";
			arg0.buttonType = 0;
		} else if (var2 == 2 && friendServerStatus != 2) {
			arg0.text = "Please wait...";
			arg0.buttonType = 0;
		} else {
			int var3 = friendCount;
			if (friendServerStatus != 2) {
				var3 = 0;
			}
			if (var2 > 700) {
				var2 -= 601;
			} else {
				var2--;
			}
			if (var2 >= var3) {
				arg0.text = "";
				arg0.buttonType = 0;
			} else {
				arg0.text = friendUsername[var2];
				arg0.buttonType = 1;
			}
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void closeModal() {
		out.p1enc(93);
		if (sideModalId != -1) {
			sideModalId = -1;
			redrawSidebar = true;
			resumedPauseButton = false;
			redrawIcons = true;
		}
		if (chatComId != -1) {
			chatComId = -1;
			redrawChatback = true;
			resumedPauseButton = false;
		}
		mainModalId = -1;
	}

	@ObfuscatedName("client.a(BLd;)Z")
	public boolean clientButton(IfType arg0) {
		int var2 = arg0.clientCode;
		if (friendServerStatus == 2) {
			if (var2 == 201) {
				redrawChatback = true;
				dialogInputOpen = false;
				socialInputOpen = true;
				socialInput = "";
				socialInputType = 1;
				socialInputHeader = "Enter name of friend to add to list";
			}
			if (var2 == 202) {
				redrawChatback = true;
				dialogInputOpen = false;
				socialInputOpen = true;
				socialInput = "";
				socialInputType = 2;
				socialInputHeader = "Enter name of friend to delete from list";
			}
		}
		if (var2 == 205) {
			logoutTimer = 250;
			return true;
		}
		if (var2 == 501) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 4;
			socialInputHeader = "Enter name of player to add to list";
		}
		if (var2 == 502) {
			redrawChatback = true;
			dialogInputOpen = false;
			socialInputOpen = true;
			socialInput = "";
			socialInputType = 5;
			socialInputHeader = "Enter name of player to delete from list";
		}
		if (var2 >= 300 && var2 <= 313) {
			int var3 = (var2 - 300) / 2;
			int var4 = var2 & 0x1;
			int var5 = idkDesignPart[var3];
			if (var5 != -1) {
				while (true) {
					if (var4 == 0) {
						var5--;
						if (var5 < 0) {
							var5 = IdkType.numDefinitions - 1;
						}
					}
					if (var4 == 1) {
						var5++;
						if (var5 >= IdkType.numDefinitions) {
							var5 = 0;
						}
					}
					if (!IdkType.list[var5].disable && IdkType.list[var5].part == var3 + (idkDesignGender ? 0 : 7)) {
						idkDesignPart[var3] = var5;
						idkDesignRedraw = true;
						break;
					}
				}
			}
		}
		if (var2 >= 314 && var2 <= 323) {
			int var6 = (var2 - 314) / 2;
			int var7 = var2 & 0x1;
			int var8 = idkDesignColour[var6];
			if (var7 == 0) {
				var8--;
				if (var8 < 0) {
					var8 = recol1d[var6].length - 1;
				}
			}
			if (var7 == 1) {
				var8++;
				if (var8 >= recol1d[var6].length) {
					var8 = 0;
				}
			}
			idkDesignColour[var6] = var8;
			idkDesignRedraw = true;
		}
		if (var2 == 324 && !idkDesignGender) {
			idkDesignGender = true;
			validateIdkDesign(field1304);
		}
		if (var2 == 325 && idkDesignGender) {
			idkDesignGender = false;
			validateIdkDesign(field1304);
		}
		if (var2 == 326) {
			out.p1enc(27);
			out.p1(idkDesignGender ? 0 : 1);
			for (int var9 = 0; var9 < 7; var9++) {
				out.p1(idkDesignPart[var9]);
			}
			for (int var10 = 0; var10 < 5; var10++) {
				out.p1(idkDesignColour[var10]);
			}
			return true;
		}
		if (var2 == 613) {
			reportAbuseMuteOption = !reportAbuseMuteOption;
		}
		if (var2 >= 601 && var2 <= 612) {
			closeModal();
			if (reportAbuseInput.length() > 0) {
				out.p1enc(94);
				out.p8(JString.toUserhash(reportAbuseInput));
				out.p1(var2 - 601);
				out.p1(reportAbuseMuteOption ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.l(B)V")
	public void validateIdkDesign(byte arg0) {
		idkDesignRedraw = true;
		for (int var2 = 0; var2 < 7; var2++) {
			idkDesignPart[var2] = -1;
			for (int var3 = 0; var3 < IdkType.numDefinitions; var3++) {
				if (!IdkType.list[var3].disable && IdkType.list[var3].part == var2 + (idkDesignGender ? 0 : 7)) {
					idkDesignPart[var2] = var3;
					break;
				}
			}
		}
		if (arg0 != -127) {
			ptype = in.g1();
		}
	}

	@ObfuscatedName("client.r(B)V")
	public void drawSide() {
		field1616.setPixels();
		Pix3D.scanline = sideScanline;
		invback.plotSprite(0, field1634, 0);
		if (sideModalId != -1) {
			drawInterface(0, 0, IfType.list[sideModalId], 0);
		} else if (sideIcon[activeIcon] != -1) {
			drawInterface(0, 0, IfType.list[sideIcon[activeIcon]], 0);
		}
		if (isMenuOpen && menuArea == 1) {
			drawMinimenu();
		}
		field1616.draw(553, 205, super.graphics);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.p(I)V")
	public void drawChat() {
		field1619.setPixels();
		Pix3D.scanline = chatScanline;
		chatback.plotSprite(0, field1634, 0);
		if (socialInputOpen) {
			b12.centreStringTag(239, socialInputHeader, 0, 40);
			b12.centreStringTag(239, socialInput + "*", 128, 60);
		} else if (dialogInputOpen) {
			b12.centreStringTag(239, "Enter amount:", 0, 40);
			b12.centreStringTag(239, dialogInput + "*", 128, 60);
		} else if (tutComMessage == null) {
			if (chatComId != -1) {
				drawInterface(0, 0, IfType.list[chatComId], 0);
			} else if (tutComId == -1) {
				PixFont var1 = p12;
				int var2 = 0;
				Pix2D.setClipping(field1398, 77, 463, 0, 0);
				for (int var3 = 0; var3 < 100; var3++) {
					if (chatText[var3] != null) {
						int var4 = chatType[var3];
						int var5 = chatScrollPos + 70 - var2 * 14;
						String var6 = chatUsername[var3];
						byte var7 = 0;
						if (var6 != null && var6.startsWith("@cr1@")) {
							var6 = var6.substring(5);
							var7 = 1;
						}
						if (var6 != null && var6.startsWith("@cr2@")) {
							var6 = var6.substring(5);
							var7 = 2;
						}
						if (var4 == 0) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(0, chatText[var3], 4, var5);
							}
							var2++;
						}
						if ((var4 == 1 || var4 == 2) && (var4 == 1 || chatPublicMode == 0 || chatPublicMode == 1 && isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								int var8 = 4;
								if (var7 == 1) {
									modIcons[0].plotSprite(var5 - 12, field1634, 4);
									var8 += 14;
								}
								if (var7 == 2) {
									modIcons[1].plotSprite(var5 - 12, field1634, var8);
									var8 += 14;
								}
								var1.drawString(0, var6 + ":", var8, var5);
								int var9 = var8 + var1.stringWidTag(var6) + 8;
								var1.drawString(255, chatText[var3], var9, var5);
							}
							var2++;
						}
						if ((var4 == 3 || var4 == 7) && splitPrivateChat == 0 && (var4 == 7 || chatPrivateMode == 0 || chatPrivateMode == 1 && isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(0, "From", 4, var5);
								int var10 = var1.stringWidTag("From ") + 4;
								if (var7 == 1) {
									modIcons[0].plotSprite(var5 - 12, field1634, var10);
									var10 += 14;
								}
								if (var7 == 2) {
									modIcons[1].plotSprite(var5 - 12, field1634, var10);
									var10 += 14;
								}
								var1.drawString(0, var6 + ":", var10, var5);
								int var11 = var10 + var1.stringWidTag(var6) + 8;
								var1.drawString(8388608, chatText[var3], var11, var5);
							}
							var2++;
						}
						if (var4 == 4 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(8388736, var6 + " " + chatText[var3], 4, var5);
							}
							var2++;
						}
						if (var4 == 5 && splitPrivateChat == 0 && chatPrivateMode < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(8388608, chatText[var3], 4, var5);
							}
							var2++;
						}
						if (var4 == 6 && splitPrivateChat == 0 && chatPrivateMode < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(0, "To " + var6 + ":", 4, var5);
								var1.drawString(8388608, chatText[var3], var1.stringWidTag("To " + var6) + 12, var5);
							}
							var2++;
						}
						if (var4 == 8 && (chatTradeMode == 0 || chatTradeMode == 1 && isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(8270336, var6 + " " + chatText[var3], 4, var5);
							}
							var2++;
						}
					}
				}
				Pix2D.resetClipping();
				scrollHeight = var2 * 14 + 7;
				if (scrollHeight < 78) {
					scrollHeight = 78;
				}
				drawScrollbar(0, 463, scrollHeight - chatScrollPos - 77, scrollHeight, 77);
				String var12;
				if (localPlayer == null || localPlayer.name == null) {
					var12 = JString.toSentenceCase(loginUser);
				} else {
					var12 = localPlayer.name;
				}
				var1.drawString(0, var12 + ":", 4, 90);
				var1.drawString(255, chatInput + "*", var1.stringWidTag(var12 + ": ") + 6, 90);
				Pix2D.hline(479, 0, 0, 77);
			} else {
				drawInterface(0, 0, IfType.list[tutComId], 0);
			}
		} else {
			b12.centreStringTag(239, tutComMessage, 0, 40);
			b12.centreStringTag(239, "Click to continue", 128, 60);
		}
		if (isMenuOpen && menuArea == 2) {
			drawMinimenu();
		}
		field1619.draw(17, 357, super.graphics);
		areaGame.setPixels();
		Pix3D.scanline = gameScanline;
	}

	@ObfuscatedName("client.m(I)V")
	public void minimapDraw() {
		areaMap.setPixels();
		if (minimapState == 2) {
			byte[] var1 = mapback.data;
			int[] var2 = Pix2D.pixels;
			int var3 = var1.length;
			for (int var4 = 0; var4 < var3; var4++) {
				if (var1[var4] == 0) {
					var2[var4] = 0;
				}
			}
			compass.scanlineRotatePlotSprite(compassMaskLineOffsets, 0, 25, 256, orbitCameraYaw, 33, compassMaskLineLengths, 33, 25, 0);
			areaGame.setPixels();
			return;
		}
		int var5 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var6 = localPlayer.x / 32 + 48;
		int var7 = 464 - localPlayer.z / 32;
		minimap.scanlineRotatePlotSprite(minimapMaskLineOffsets, 5, var7, macroMinimapZoom + 256, var5, 151, minimapMaskLineLengths, 146, var6, 25);
		compass.scanlineRotatePlotSprite(compassMaskLineOffsets, 0, 25, 256, orbitCameraYaw, 33, compassMaskLineLengths, 33, 25, 0);
		for (int var8 = 0; var8 < field1247; var8++) {
			int var9 = field1248[var8] * 4 + 2 - localPlayer.x / 32;
			int var10 = field1249[var8] * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var9, field1293[var8], var10);
		}
		for (int var11 = 0; var11 < 104; var11++) {
			for (int var12 = 0; var12 < 104; var12++) {
				LinkList var13 = groundObj[minusedlevel][var11][var12];
				if (var13 != null) {
					int var14 = var11 * 4 + 2 - localPlayer.x / 32;
					int var15 = var12 * 4 + 2 - localPlayer.z / 32;
					minimapDrawDot(var14, mapdots0, var15);
				}
			}
		}
		for (int var16 = 0; var16 < npcCount; var16++) {
			ClientNpc var17 = npc[npcIds[var16]];
			if (var17 != null && var17.isReady() && var17.type.minimap) {
				int var18 = var17.x / 32 - localPlayer.x / 32;
				int var19 = var17.z / 32 - localPlayer.z / 32;
				minimapDrawDot(var18, mapdots1, var19);
			}
		}
		for (int var20 = 0; var20 < playerCount; var20++) {
			ClientPlayer var21 = players[playerIds[var20]];
			if (var21 != null && var21.isReady()) {
				int var22 = var21.x / 32 - localPlayer.x / 32;
				int var23 = var21.z / 32 - localPlayer.z / 32;
				boolean var24 = false;
				long var25 = JString.toUserhash(var21.name);
				for (int var27 = 0; var27 < friendCount; var27++) {
					if (var25 == friendUserhash[var27] && friendNodeId[var27] != 0) {
						var24 = true;
						break;
					}
				}
				if (localPlayer.team != 0 && var21.team != 0) {
					if (localPlayer.team == var21.team) {
						var24 = true;
					} else {
						var24 = false;
					}
				}
				if (var24) {
					minimapDrawDot(var22, mapdots3, var23);
				} else {
					minimapDrawDot(var22, mapdots2, var23);
				}
			}
		}
		if (hintType != 0 && loopCycle % 20 < 10) {
			if (hintType == 1 && field1322 >= 0 && field1322 < npc.length) {
				ClientNpc var28 = npc[field1322];
				if (var28 != null) {
					int var29 = var28.x / 32 - localPlayer.x / 32;
					int var30 = var28.z / 32 - localPlayer.z / 32;
					minimapDrawArrow(var29, mapmarker1, var30, field1255);
				}
			}
			if (hintType == 2) {
				int var31 = (field1669 - mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
				int var32 = (field1670 - mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
				minimapDrawArrow(var31, mapmarker1, var32, field1255);
			}
			if (hintType == 10 && field1330 >= 0 && field1330 < players.length) {
				ClientPlayer var33 = players[field1330];
				if (var33 != null) {
					int var34 = var33.x / 32 - localPlayer.x / 32;
					int var35 = var33.z / 32 - localPlayer.z / 32;
					minimapDrawArrow(var34, mapmarker1, var35, field1255);
				}
			}
		}
		if (minimapFlagX != 0) {
			int var36 = minimapFlagX * 4 + 2 - localPlayer.x / 32;
			int var37 = minimapFlagZ * 4 + 2 - localPlayer.z / 32;
			minimapDrawDot(var36, mapmarker0, var37);
		}
		Pix2D.fillRect(16777215, 78, 3, 97, 3);
		areaGame.setPixels();
	}

	@ObfuscatedName("client.a(ILib;II)V")
	public void minimapDrawArrow(int arg0, Pix32 arg1, int arg2, int arg3) {
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (arg3 != 0) {
			out.p1(121);
		}
		if (var5 <= 4225 || var5 >= 90000) {
			minimapDrawDot(arg0, arg1, arg2);
			return;
		}
		int var6 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var7 = Model.sinTable[var6];
		int var8 = Model.cosTable[var6];
		int var9 = var7 * 256 / (macroMinimapZoom + 256);
		int var10 = var8 * 256 / (macroMinimapZoom + 256);
		int var11 = arg2 * var9 + arg0 * var10 >> 16;
		int var12 = arg2 * var10 - arg0 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		mapedge.rotatePlotSprite(var13, var15 + 94 + 4 - 10, 83 - var16 - 20);
	}

	@ObfuscatedName("client.b(ILib;II)V")
	public void minimapDrawDot(int arg0, Pix32 arg1, int arg2) {
		int var4 = orbitCameraYaw + macroMinimapAngle & 0x7FF;
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (var5 <= 6400) {
			int var6 = Model.sinTable[var4];
			int var7 = Model.cosTable[var4];
			int var8 = var6 * 256 / (macroMinimapZoom + 256);
			int var9 = var7 * 256 / (macroMinimapZoom + 256);
			int var10 = arg2 * var8 + arg0 * var9 >> 16;
			int var11 = arg2 * var9 - arg0 * var8 >> 16;
			if (var5 > 2500) {
				arg1.scanlinePlotSprite(var10 + 94 + 4 - arg1.owi / 2, mapback, 83 - var11 - arg1.ohi / 2 - 4);
			} else {
				arg1.plotSprite(83 - var11 - arg1.ohi / 2 - 4, field1634, var10 + 94 + 4 - arg1.owi / 2);
			}
		}
	}

	@ObfuscatedName("client.a(IBLjava/lang/String;Ljava/lang/String;)V")
	public void addChat(int arg0, String arg1, String arg2) {
		if (arg0 == 0 && tutComId != -1) {
			tutComMessage = arg1;
			super.mouseClickButton = 0;
		}
		if (chatComId == -1) {
			redrawChatback = true;
		}
		for (int var4 = 99; var4 > 0; var4--) {
			chatType[var4] = chatType[var4 - 1];
			chatUsername[var4] = chatUsername[var4 - 1];
			chatText[var4] = chatText[var4 - 1];
		}
		chatType[0] = arg0;
		chatUsername[0] = arg2;
		chatText[0] = arg1;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public boolean isFriend(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var2 = 0; var2 < friendCount; var2++) {
			if (arg0.equalsIgnoreCase(friendUsername[var2])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.name);
	}

	@ObfuscatedName("client.a(IJ)V")
	public void addFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (friendCount >= 100 && field1510 != 1) {
			addChat(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
		} else if (friendCount >= 200) {
			addChat(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
		} else {
			String var3 = JString.toSentenceCase(JString.toRawUsername(arg0));
			for (int var4 = 0; var4 < friendCount; var4++) {
				if (friendUserhash[var4] == arg0) {
					addChat(0, var3 + " is already on your friend list", "");
					return;
				}
			}
			for (int var5 = 0; var5 < ignoreCount; var5++) {
				if (ignoreUserhash[var5] == arg0) {
					addChat(0, "Please remove " + var3 + " from your ignore list first", "");
					return;
				}
			}
			if (!var3.equals(localPlayer.name)) {
				friendUsername[friendCount] = var3;
				friendUserhash[friendCount] = arg0;
				friendNodeId[friendCount] = 0;
				friendCount++;
				redrawSidebar = true;
				out.p1enc(235);
				out.p8(arg0);
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public void addIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (ignoreCount >= 100) {
			addChat(0, "Your ignore list is full. Max of 100 hit", "");
			return;
		}
		String var3 = JString.toSentenceCase(JString.toRawUsername(arg0));
		for (int var4 = 0; var4 < ignoreCount; var4++) {
			if (ignoreUserhash[var4] == arg0) {
				addChat(0, var3 + " is already on your ignore list", "");
				return;
			}
		}
		for (int var5 = 0; var5 < friendCount; var5++) {
			if (friendUserhash[var5] == arg0) {
				addChat(0, "Please remove " + var3 + " from your friend list first", "");
				return;
			}
		}
		ignoreUserhash[ignoreCount++] = arg0;
		redrawSidebar = true;
		out.p1enc(192);
		out.p8(arg0);
	}

	@ObfuscatedName("client.a(JI)V")
	public void delFriend(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var3 = 0; var3 < friendCount; var3++) {
			if (friendUserhash[var3] == arg0) {
				friendCount--;
				redrawSidebar = true;
				for (int var4 = var3; var4 < friendCount; var4++) {
					friendUsername[var4] = friendUsername[var4 + 1];
					friendNodeId[var4] = friendNodeId[var4 + 1];
					friendUserhash[var4] = friendUserhash[var4 + 1];
				}
				out.p1enc(203);
				out.p8(arg0);
				return;
			}
		}
	}

	@ObfuscatedName("client.b(IJ)V")
	public void delIgnore(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var3 = 0; var3 < ignoreCount; var3++) {
			if (ignoreUserhash[var3] == arg0) {
				ignoreCount--;
				redrawSidebar = true;
				for (int var4 = var3; var4 < ignoreCount; var4++) {
					ignoreUserhash[var4] = ignoreUserhash[var4 + 1];
				}
				out.p1enc(251);
				out.p8(arg0);
				return;
			}
		}
	}

	@Override
	public void run() {
		if (flamesThread) {
			renderFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public void renderFlames() {
		flameThread = true;
		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;
			while (flameActive) {
				flameCycle++;
				updateFlames();
				updateFlames();
				drawFlames();
				var3++;
				if (var3 > 10) {
					long var5 = System.currentTimeMillis();
					int var7 = (int) (var5 - var1) / 10 - var4;
					var4 = 40 - var7;
					if (var4 < 5) {
						var4 = 5;
					}
					var3 = 0;
					var1 = var5;
				}
				try {
					Thread.sleep((long) var4);
				} catch (Exception var8) {
				}
			}
		} catch (Exception var9) {
		}
		flameThread = false;
	}

	@ObfuscatedName("client.j(I)V")
	public void updateFlames() {
		for (int var1 = 10; var1 < 117; var1++) {
			int var2 = (int) (Math.random() * 100.0D);
			if (var2 < 50) {
				flameBuffer3[var1 + 32512] = 255;
			}
		}
		for (int var3 = 0; var3 < 100; var3++) {
			int var4 = (int) (Math.random() * 124.0D) + 2;
			int var5 = (int) (Math.random() * 128.0D) + 128;
			int var6 = var4 + (var5 << 7);
			flameBuffer3[var6] = 192;
		}
		for (int var7 = 1; var7 < 255; var7++) {
			for (int var8 = 1; var8 < 127; var8++) {
				int var9 = var8 + (var7 << 7);
				flameBuffer2[var9] = (flameBuffer3[var9 - 1] + flameBuffer3[var9 + 1] + flameBuffer3[var9 - 128] + flameBuffer3[var9 + 128]) / 4;
			}
		}
		field1311 += 128;
		if (field1311 > flameBuffer0.length) {
			field1311 -= flameBuffer0.length;
			int var10 = (int) (Math.random() * 12.0D);
			generateFlameCoolingMap(runes[var10]);
		}
		for (int var11 = 1; var11 < 255; var11++) {
			for (int var12 = 1; var12 < 127; var12++) {
				int var13 = var12 + (var11 << 7);
				int var14 = flameBuffer2[var13 + 128] - flameBuffer0[var13 + field1311 & flameBuffer0.length - 1] / 5;
				if (var14 < 0) {
					var14 = 0;
				}
				flameBuffer3[var13] = var14;
			}
		}
		for (int var15 = 0; var15 < 255; var15++) {
			field1439[var15] = field1439[var15 + 1];
		}
		field1439[255] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (field1680 > 0) {
			field1680 -= 4;
		}
		if (field1681 > 0) {
			field1681 -= 4;
		}
		if (field1680 == 0 && field1681 == 0) {
			int var16 = (int) (Math.random() * 2000.0D);
			if (var16 == 0) {
				field1680 = 1024;
			}
			if (var16 == 1) {
				field1681 = 1024;
			}
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void drawFlames() {
		if (field1680 > 0) {
			for (int var1 = 0; var1 < 256; var1++) {
				if (field1680 > 768) {
					flameGradient[var1] = titleFlamesMerge(flameGradient0[var1], flameGradient1[var1], 1024 - field1680);
				} else if (field1680 > 256) {
					flameGradient[var1] = flameGradient1[var1];
				} else {
					flameGradient[var1] = titleFlamesMerge(flameGradient1[var1], flameGradient0[var1], 256 - field1680);
				}
			}
		} else if (field1681 > 0) {
			for (int var2 = 0; var2 < 256; var2++) {
				if (field1681 > 768) {
					flameGradient[var2] = titleFlamesMerge(flameGradient0[var2], flameGradient2[var2], 1024 - field1681);
				} else if (field1681 > 256) {
					flameGradient[var2] = flameGradient2[var2];
				} else {
					flameGradient[var2] = titleFlamesMerge(flameGradient2[var2], flameGradient0[var2], 256 - field1681);
				}
			}
		} else {
			for (int var3 = 0; var3 < 256; var3++) {
				flameGradient[var3] = flameGradient0[var3];
			}
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			field1687.data[var4] = flameLeft.data[var4];
		}
		int var5 = 0;
		int var6 = 1152;
		for (int var7 = 1; var7 < 255; var7++) {
			int var8 = field1439[var7] * (256 - var7) / 256;
			int var9 = var8 + 22;
			if (var9 < 0) {
				var9 = 0;
			}
			var5 += var9;
			for (int var10 = var9; var10 < 128; var10++) {
				int var11 = flameBuffer3[var5++];
				if (var11 == 0) {
					var6++;
				} else {
					int var13 = 256 - var11;
					int var14 = flameGradient[var11];
					int var15 = field1687.data[var6];
					field1687.data[var6++] = ((var14 & 0xFF00FF) * var11 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
				}
			}
			var6 += var9;
		}
		field1687.draw(0, 0, super.graphics);
		for (int var16 = 0; var16 < 33920; var16++) {
			field1688.data[var16] = flameRight.data[var16];
		}
		int var17 = 0;
		int var18 = 1176;
		for (int var19 = 1; var19 < 255; var19++) {
			int var20 = field1439[var19] * (256 - var19) / 256;
			int var21 = 103 - var20;
			int var22 = var18 + var20;
			for (int var23 = 0; var23 < var21; var23++) {
				int var24 = flameBuffer3[var17++];
				if (var24 == 0) {
					var22++;
				} else {
					int var26 = 256 - var24;
					int var27 = flameGradient[var24];
					int var28 = field1688.data[var22];
					field1688.data[var22++] = ((var27 & 0xFF00FF) * var24 + (var28 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var27 & 0xFF00) * var24 + (var28 & 0xFF00) * var26 & 0xFF0000) >> 8;
				}
			}
			var17 += 128 - var21;
			var18 = var22 + 128 - var21 - var20;
		}
		field1688.draw(637, 0, super.graphics);
	}

	@ObfuscatedName("client.a(Ljb;I)V")
	public void generateFlameCoolingMap(Pix8 arg0) {
		for (int var2 = 0; var2 < flameBuffer0.length; var2++) {
			flameBuffer0[var2] = 0;
		}
		for (int var3 = 0; var3 < 5000; var3++) {
			int var4 = (int) (Math.random() * 128.0D * (double) 256);
			flameBuffer0[var4] = (int) (Math.random() * 256.0D);
		}
		for (int var5 = 0; var5 < 20; var5++) {
			for (int var6 = 1; var6 < 255; var6++) {
				for (int var7 = 1; var7 < 127; var7++) {
					int var8 = var7 + (var6 << 7);
					flameBuffer1[var8] = (flameBuffer0[var8 - 1] + flameBuffer0[var8 + 1] + flameBuffer0[var8 - 128] + flameBuffer0[var8 + 128]) / 4;
				}
			}
			int[] var9 = flameBuffer0;
			flameBuffer0 = flameBuffer1;
			flameBuffer1 = var9;
		}
		if (arg0 != null) {
			int var10 = 0;
			for (int var11 = 0; var11 < arg0.hi; var11++) {
				for (int var12 = 0; var12 < arg0.wi; var12++) {
					if (arg0.data[var10++] != 0) {
						int var13 = var12 + arg0.xof + 16;
						int var14 = var11 + arg0.yof + 16;
						int var15 = var13 + (var14 << 7);
						flameBuffer0[var15] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public int titleFlamesMerge(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}
}
