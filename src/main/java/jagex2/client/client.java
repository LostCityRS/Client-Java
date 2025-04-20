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
	public int[] field1201 = new int[500];

	@ObfuscatedName("client.bb")
	public int[] field1202 = new int[500];

	@ObfuscatedName("client.cb")
	public int[] field1203 = new int[500];

	@ObfuscatedName("client.db")
	public int[] field1204 = new int[500];

	@ObfuscatedName("client.eb")
	public int field1205;

	@ObfuscatedName("client.fb")
	public int field1206 = -20334;

	@ObfuscatedName("client.gb")
	public int[] field1207 = new int[151];

	@ObfuscatedName("client.hb")
	public long[] field1208 = new long[200];

	@ObfuscatedName("client.ib")
	public static int field1209;

	@ObfuscatedName("client.jb")
	public int field1210;

	@ObfuscatedName("client.kb")
	public int[] field1211 = new int[1000];

	@ObfuscatedName("client.lb")
	public int[] field1212 = new int[1000];

	@ObfuscatedName("client.mb")
	public String field1213 = "";

	@ObfuscatedName("client.nb")
	public byte[] field1214 = new byte[16384];

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

	@ObfuscatedName("client.tb")
	public int field1220;

	@ObfuscatedName("client.ub")
	public boolean field1221 = false;

	@ObfuscatedName("client.vb")
	public int[] field1222 = new int[50];

	@ObfuscatedName("client.wb")
	public int field1223 = 7;

	@ObfuscatedName("client.xb")
	public static String field1224 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.yb")
	public int field1225 = 3;

	@ObfuscatedName("client.zb")
	public int field1226;

	@ObfuscatedName("client.ac")
	public int field1253 = -1;

	@ObfuscatedName("client.bc")
	public int field1254;

	@ObfuscatedName("client.cc")
	public int field1255;

	@ObfuscatedName("client.dc")
	public int field1256;

	@ObfuscatedName("client.ec")
	public int[] field1257 = new int[5];

	@ObfuscatedName("client.fc")
	public World3D field1258;

	@ObfuscatedName("client.gc")
	public int field1259;

	@ObfuscatedName("client.hc")
	public int field1260;

	@ObfuscatedName("client.ic")
	public int field1261;

	@ObfuscatedName("client.jc")
	public int field1262;

	@ObfuscatedName("client.kc")
	public int field1263;

	@ObfuscatedName("client.lc")
	public int field1264;

	@ObfuscatedName("client.mc")
	public int field1265 = -1;

	@ObfuscatedName("client.nc")
	public int field1266;

	@ObfuscatedName("client.oc")
	public int field1267 = 2;

	@ObfuscatedName("client.pc")
	public byte[][] field1268;

	@ObfuscatedName("client.qc")
	public Pix32 imageFlamesRight;

	@ObfuscatedName("client.L")
	public int[] field1186 = new int[50];

	@ObfuscatedName("client.P")
	public LinkList field1190 = new LinkList((byte) 7);

	@ObfuscatedName("client.Q")
	public int field1191 = 855;

	@ObfuscatedName("client.R")
	public int field1192 = -1;

	@ObfuscatedName("client.V")
	public boolean field1196 = false;

	@ObfuscatedName("client.Z")
	public int[][] field1200 = new int[104][104];

	@ObfuscatedName("client.Bb")
	public int field1228 = 1;

	@ObfuscatedName("client.Cb")
	public int field1229 = -1;

	@ObfuscatedName("client.Db")
	public int[] field1230 = new int[50];

	@ObfuscatedName("client.Eb")
	public FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.Fb")
	public boolean field1232 = false;

	@ObfuscatedName("client.Hb")
	public int[] field1234 = new int[50];

	@ObfuscatedName("client.Ib")
	public int field1235 = 4;

	@ObfuscatedName("client.Jb")
	public boolean field1236 = false;

	@ObfuscatedName("client.Kb")
	public int[] field1237 = new int[5];

	@ObfuscatedName("client.Mb")
	public int[][] field1239 = new int[104][104];

	@ObfuscatedName("client.Nb")
	public final int field1240 = 100;

	@ObfuscatedName("client.Ob")
	public int[] field1241 = new int[100];

	@ObfuscatedName("client.Pb")
	public int[] field1242 = new int[5];

	@ObfuscatedName("client.Wb")
	public boolean field1249 = false;

	@ObfuscatedName("client.Xb")
	public int field1250 = 3;

	@ObfuscatedName("client.Yb")
	public int field1251 = -1;

	@ObfuscatedName("client.Zb")
	public boolean field1252 = true;

	@ObfuscatedName("client.sc")
	public int[][] field1271 = new int[104][104];

	@ObfuscatedName("client.tc")
	public int field1272 = 489;

	@ObfuscatedName("client.uc")
	public int field1273 = -1;

	@ObfuscatedName("client.xc")
	public int field1276 = 3353893;

	@ObfuscatedName("client.zc")
	public int[] field1278 = new int[2000];

	@ObfuscatedName("client.Ac")
	public int[] field1279 = new int[5];

	@ObfuscatedName("client.Bc")
	public int field1280 = 5063219;

	@ObfuscatedName("client.Ec")
	public int field1283 = 2048;

	@ObfuscatedName("client.Fc")
	public int field1284 = 2047;

	@ObfuscatedName("client.Gc")
	public PlayerEntity[] field1285 = new PlayerEntity[this.field1283];

	@ObfuscatedName("client.Ic")
	public int[] field1287 = new int[this.field1283];

	@ObfuscatedName("client.Kc")
	public int[] field1289 = new int[this.field1283];

	@ObfuscatedName("client.Lc")
	public Packet[] field1290 = new Packet[this.field1283];

	@ObfuscatedName("client.Mc")
	public int[] field1291 = new int[9];

	@ObfuscatedName("client.Pc")
	public int field1294 = -1;

	@ObfuscatedName("client.Qc")
	public int field1295 = -1;

	@ObfuscatedName("client.Yc")
	public byte field1303 = 54;

	@ObfuscatedName("client.Zc")
	public int field1304 = 2301979;

	@ObfuscatedName("client.ad")
	public final int[] field1305 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.bd")
	public int field1306 = -922;

	@ObfuscatedName("client.hd")
	public int field1312 = 5;

	@ObfuscatedName("client.sd")
	public int[] field1323 = new int[1000];

	@ObfuscatedName("client.td")
	public int[] field1324 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.yd")
	public CRC32 field1329 = new CRC32();

	@ObfuscatedName("client.Ad")
	public int field1331 = 1;

	@ObfuscatedName("client.Bd")
	public Pix8[] field1332 = new Pix8[2];

	@ObfuscatedName("client.Fd")
	public String field1336 = "";

	@ObfuscatedName("client.Id")
	public long[] field1339 = new long[100];

	@ObfuscatedName("client.Od")
	public String field1345 = "";

	@ObfuscatedName("client.Vd")
	public boolean[] field1352 = new boolean[5];

	@ObfuscatedName("client.Zd")
	public boolean field1356 = false;

	@ObfuscatedName("client.ae")
	public int field1357 = 354;

	@ObfuscatedName("client.be")
	public boolean flameThread = false;

	@ObfuscatedName("client.ee")
	public boolean ingame = false;

	@ObfuscatedName("client.se")
	public int field1375 = -119;

	@ObfuscatedName("client.te")
	public boolean field1376 = false;

	@ObfuscatedName("client.ue")
	public boolean field1377 = false;

	@ObfuscatedName("client.Be")
	public boolean field1384 = false;

	@ObfuscatedName("client.Ge")
	public Pix32[] field1389 = new Pix32[20];

	@ObfuscatedName("client.Ne")
	public int field1396 = -1;

	@ObfuscatedName("client.Oe")
	public int field1397 = -1;

	@ObfuscatedName("client.Ve")
	public Packet field1404 = Packet.alloc(5, 1);

	@ObfuscatedName("client.df")
	public boolean field1412 = true;

	@ObfuscatedName("client.ef")
	public int[] field1413 = new int[50];

	@ObfuscatedName("client.jf")
	public boolean field1417 = true;

	@ObfuscatedName("client.nf")
	public boolean field1421 = true;

	@ObfuscatedName("client.sf")
	public boolean field1426 = false;

	@ObfuscatedName("client.tf")
	public int[] field1427 = new int[33];

	@ObfuscatedName("client.vf")
	public int[] field1429 = new int[100];

	@ObfuscatedName("client.wf")
	public String[] field1430 = new String[100];

	@ObfuscatedName("client.xf")
	public String[] field1431 = new String[100];

	@ObfuscatedName("client.yf")
	public LinkList[][][] field1432 = new LinkList[4][104][104];

	@ObfuscatedName("client.Af")
	public int field1434 = -162;

	@ObfuscatedName("client.Df")
	public boolean errorLoading = false;

	@ObfuscatedName("client.Ef")
	public NpcEntity[] field1438 = new NpcEntity[8192];

	@ObfuscatedName("client.Gf")
	public int[] field1440 = new int[8192];

	@ObfuscatedName("client.Of")
	public Pix32[] field1448 = new Pix32[1000];

	@ObfuscatedName("client.Pf")
	public String field1449 = "";

	@ObfuscatedName("client.Qf")
	public boolean errorStarted = false;

	@ObfuscatedName("client.Rf")
	public boolean field1451 = false;

	@ObfuscatedName("client.Sf")
	public boolean flameActive = false;

	@ObfuscatedName("client.Uf")
	public boolean field1454 = false;

	@ObfuscatedName("client.ag")
	public boolean field1460 = true;

	@ObfuscatedName("client.eg")
	public int[] field1464 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.kg")
	public int[] field1470 = new int[200];

	@ObfuscatedName("client.lg")
	public boolean field1471 = false;

	@ObfuscatedName("client.mg")
	public int field1472 = -1;

	@ObfuscatedName("client.rg")
	public boolean field1477 = false;

	@ObfuscatedName("client.ug")
	public int field1480 = 576;

	@ObfuscatedName("client.xg")
	public boolean field1483 = false;

	@ObfuscatedName("client.yg")
	public Packet in = Packet.alloc(5, 1);

	@ObfuscatedName("client.Ag")
	public int field1486 = 2;

	@ObfuscatedName("client.Jg")
	public int field1495 = 78;

	@ObfuscatedName("client.Kg")
	public byte field1496 = 0;

	@ObfuscatedName("client.Rg")
	public boolean errorHost = false;

	@ObfuscatedName("client.Sg")
	public boolean field1504 = true;

	@ObfuscatedName("client.Tg")
	public int[] field1505 = new int[151];

	@ObfuscatedName("client.Vg")
	public boolean field1507 = false;

	@ObfuscatedName("client.Wg")
	public String field1508 = "";

	@ObfuscatedName("client.Xg")
	public String field1509 = "";

	@ObfuscatedName("client.Yg")
	public int[] field1510 = new int[2000];

	@ObfuscatedName("client.Zg")
	public int[] field1511 = new int[4000];

	@ObfuscatedName("client.ah")
	public int[] field1512 = new int[4000];

	@ObfuscatedName("client.ch")
	public Pix32[] field1514 = new Pix32[20];

	@ObfuscatedName("client.hh")
	public int[] field1519 = new int[50];

	@ObfuscatedName("client.ih")
	public byte field1520 = 8;

	@ObfuscatedName("client.jh")
	public Packet field1521 = Packet.alloc(5, 1);

	@ObfuscatedName("client.lh")
	public int field1523 = 7;

	@ObfuscatedName("client.sh")
	public int field1530 = -1;

	@ObfuscatedName("client.wh")
	public int field1534 = 2;

	@ObfuscatedName("client.xh")
	public int field1535 = 7759444;

	@ObfuscatedName("client.Ah")
	public boolean field1538 = false;

	@ObfuscatedName("client.Ch")
	public int[] field1540 = new int[256];

	@ObfuscatedName("client.Qh")
	public CollisionMap[] field1554 = new CollisionMap[4];

	@ObfuscatedName("client.Rh")
	public int field1555 = 5;

	@ObfuscatedName("client.Sh")
	public String[] field1556 = new String[200];

	@ObfuscatedName("client.Th")
	public int[] field1557 = new int[5];

	@ObfuscatedName("client.Vh")
	public int field1559 = 128;

	@ObfuscatedName("client.Zh")
	public int field1563 = 78;

	@ObfuscatedName("client.bi")
	public int field1565 = -1;

	@ObfuscatedName("client.ci")
	public Pix32[] field1566 = new Pix32[50];

	@ObfuscatedName("client.di")
	public int field1567 = -1;

	@ObfuscatedName("client.fi")
	public boolean field1569 = false;

	@ObfuscatedName("client.gi")
	public boolean field1570 = true;

	@ObfuscatedName("client.ji")
	public LinkList field1573 = new LinkList((byte) 7);

	@ObfuscatedName("client.ki")
	public Pix8[] field1574 = new Pix8[50];

	@ObfuscatedName("client.li")
	public int field1575 = 11089;

	@ObfuscatedName("client.ni")
	public String field1577 = "";

	@ObfuscatedName("client.oi")
	public String field1578 = "";

	@ObfuscatedName("client.pi")
	public String[] field1579 = new String[500];

	@ObfuscatedName("client.Bi")
	public LinkList field1591 = new LinkList((byte) 7);

	@ObfuscatedName("client.Di")
	public Pix8[] field1593 = new Pix8[13];

	@ObfuscatedName("client.Fi")
	public byte field1595 = 71;

	@ObfuscatedName("client.Gi")
	public String field1596 = "";

	@ObfuscatedName("client.Hi")
	public int[] field1597 = new int[7];

	@ObfuscatedName("client.Ji")
	public Pix32[] field1599 = new Pix32[8];

	@ObfuscatedName("client.Oi")
	public int field1604 = 612;

	@ObfuscatedName("client.Pi")
	public byte field1605 = -102;

	@ObfuscatedName("client.Ri")
	public int[] field1607 = new int[33];

	@ObfuscatedName("client.Vi")
	public int field1611 = 4;

	@ObfuscatedName("client.Xi")
	public boolean field1613 = false;

	@ObfuscatedName("client.Yi")
	public boolean field1614 = true;

	@ObfuscatedName("client.Zi")
	public boolean field1615 = false;

	@ObfuscatedName("client.aj")
	public boolean field1616 = false;

	@ObfuscatedName("client.dj")
	public Component field1619 = new Component();

	@ObfuscatedName("client.ej")
	public int field1620 = 280;

	@ObfuscatedName("client.fj")
	public boolean field1621 = false;

	@ObfuscatedName("client.kj")
	public boolean field1626 = false;

	@ObfuscatedName("client.mj")
	public int field1628 = 50;

	@ObfuscatedName("client.nj")
	public int[] field1629 = new int[this.field1628];

	@ObfuscatedName("client.oj")
	public int[] field1630 = new int[this.field1628];

	@ObfuscatedName("client.pj")
	public int[] field1631 = new int[this.field1628];

	@ObfuscatedName("client.qj")
	public int[] field1632 = new int[this.field1628];

	@ObfuscatedName("client.rj")
	public int[] field1633 = new int[this.field1628];

	@ObfuscatedName("client.sj")
	public int[] field1634 = new int[this.field1628];

	@ObfuscatedName("client.tj")
	public int[] field1635 = new int[this.field1628];

	@ObfuscatedName("client.uj")
	public String[] field1636 = new String[this.field1628];

	@ObfuscatedName("client.N")
	public static BigInteger field1188 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.we")
	public static final int[][] field1379 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Pe")
	public static int field1398 = 10;

	@ObfuscatedName("client.Re")
	public static boolean field1400 = true;

	@ObfuscatedName("client.vg")
	public static int[] field1481 = new int[99];

	@ObfuscatedName("client.qh")
	public static final int[] field1528;

	@ObfuscatedName("client.Fh")
	public static int field1543;

	@ObfuscatedName("client.Hh")
	public static int field1545;

	@ObfuscatedName("client.Si")
	public static BigInteger field1608;

	@ObfuscatedName("client.M")
	public int field1187;

	@ObfuscatedName("client.O")
	public int field1189;

	@ObfuscatedName("client.S")
	public int field1193;

	@ObfuscatedName("client.T")
	public static int field1194;

	@ObfuscatedName("client.U")
	public static int field1195;

	@ObfuscatedName("client.Ab")
	public int field1227;

	@ObfuscatedName("client.Gb")
	public int field1233;

	@ObfuscatedName("client.Lb")
	public int field1238;

	@ObfuscatedName("client.Qb")
	public int psize;

	@ObfuscatedName("client.Rb")
	public int ptype;

	@ObfuscatedName("client.Sb")
	public int field1245;

	@ObfuscatedName("client.Tb")
	public int field1246;

	@ObfuscatedName("client.Ub")
	public int field1247;

	@ObfuscatedName("client.Vb")
	public int field1248;

	@ObfuscatedName("client.wc")
	public int field1275;

	@ObfuscatedName("client.yc")
	public int field1277;

	@ObfuscatedName("client.Hc")
	public int field1286;

	@ObfuscatedName("client.Jc")
	public int field1288;

	@ObfuscatedName("client.Nc")
	public int field1292;

	@ObfuscatedName("client.Oc")
	public int field1293;

	@ObfuscatedName("client.Rc")
	public int field1296;

	@ObfuscatedName("client.Sc")
	public int field1297;

	@ObfuscatedName("client.Tc")
	public int field1298;

	@ObfuscatedName("client.Uc")
	public int field1299;

	@ObfuscatedName("client.Vc")
	public int field1300;

	@ObfuscatedName("client.cd")
	public int field1307;

	@ObfuscatedName("client.dd")
	public int field1308;

	@ObfuscatedName("client.ed")
	public int field1309;

	@ObfuscatedName("client.rd")
	public int field1322;

	@ObfuscatedName("client.xd")
	public int field1328;

	@ObfuscatedName("client.zd")
	public int field1330;

	@ObfuscatedName("client.Cd")
	public int field1333;

	@ObfuscatedName("client.Dd")
	public int field1334;

	@ObfuscatedName("client.Ed")
	public int field1335;

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
	public int field1346;

	@ObfuscatedName("client.Qd")
	public int field1347;

	@ObfuscatedName("client.Rd")
	public int field1348;

	@ObfuscatedName("client.Sd")
	public int field1349;

	@ObfuscatedName("client.Td")
	public int field1350;

	@ObfuscatedName("client.Ud")
	public int field1351;

	@ObfuscatedName("client.ce")
	public int field1359;

	@ObfuscatedName("client.de")
	public int field1360;

	@ObfuscatedName("client.qe")
	public int field1373;

	@ObfuscatedName("client.re")
	public static int field1374;

	@ObfuscatedName("client.ve")
	public int field1378;

	@ObfuscatedName("client.xe")
	public int field1380;

	@ObfuscatedName("client.ye")
	public int ptype0;

	@ObfuscatedName("client.ze")
	public int ptype1;

	@ObfuscatedName("client.Ae")
	public int field1383;

	@ObfuscatedName("client.Ce")
	public int flameCycle;

	@ObfuscatedName("client.De")
	public static int field1386;

	@ObfuscatedName("client.Fe")
	public int field1388;

	@ObfuscatedName("client.Qe")
	public static int portOffset;

	@ObfuscatedName("client.Ue")
	public int field1403;

	@ObfuscatedName("client.Ze")
	public int field1408;

	@ObfuscatedName("client.bf")
	public int field1410;

	@ObfuscatedName("client.cf")
	public int field1411;

	@ObfuscatedName("client.ff")
	public int field1414;

	@ObfuscatedName("client.gf")
	public int field1415;

	@ObfuscatedName("client.hf")
	public int field1416;

	@ObfuscatedName("client.kf")
	public int field1418;

	@ObfuscatedName("client.lf")
	public int field1419;

	@ObfuscatedName("client.rf")
	public int field1425;

	@ObfuscatedName("client.zf")
	public int field1433;

	@ObfuscatedName("client.Ff")
	public int field1439;

	@ObfuscatedName("client.Tf")
	public static int field1453;

	@ObfuscatedName("client.Vf")
	public int field1455;

	@ObfuscatedName("client.Wf")
	public int field1456;

	@ObfuscatedName("client.Xf")
	public int field1457;

	@ObfuscatedName("client.Yf")
	public int field1458;

	@ObfuscatedName("client.Zf")
	public int field1459;

	@ObfuscatedName("client.bg")
	public int field1461;

	@ObfuscatedName("client.cg")
	public int field1462;

	@ObfuscatedName("client.fg")
	public int field1465;

	@ObfuscatedName("client.gg")
	public int field1466;

	@ObfuscatedName("client.hg")
	public int field1467;

	@ObfuscatedName("client.ig")
	public int field1468;

	@ObfuscatedName("client.jg")
	public int field1469;

	@ObfuscatedName("client.pg")
	public int field1475;

	@ObfuscatedName("client.qg")
	public int field1476;

	@ObfuscatedName("client.tg")
	public int field1479;

	@ObfuscatedName("client.wg")
	public int field1482;

	@ObfuscatedName("client.zg")
	public int field1485;

	@ObfuscatedName("client.Bg")
	public int field1487;

	@ObfuscatedName("client.Cg")
	public int field1488;

	@ObfuscatedName("client.Eg")
	public int field1490;

	@ObfuscatedName("client.Lg")
	public int field1497;

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
	public int field1522;

	@ObfuscatedName("client.mh")
	public static int field1524;

	@ObfuscatedName("client.oh")
	public int field1526;

	@ObfuscatedName("client.ph")
	public int field1527;

	@ObfuscatedName("client.rh")
	public int field1529;

	@ObfuscatedName("client.th")
	public int field1531;

	@ObfuscatedName("client.uh")
	public int field1532;

	@ObfuscatedName("client.vh")
	public int field1533;

	@ObfuscatedName("client.yh")
	public int field1536;

	@ObfuscatedName("client.Bh")
	public int field1539;

	@ObfuscatedName("client.Dh")
	public int field1541;

	@ObfuscatedName("client.Eh")
	public static int field1542;

	@ObfuscatedName("client.Gh")
	public int field1544;

	@ObfuscatedName("client.Ih")
	public int field1546;

	@ObfuscatedName("client.Jh")
	public int field1547;

	@ObfuscatedName("client.Kh")
	public int field1548;

	@ObfuscatedName("client.Lh")
	public int field1549;

	@ObfuscatedName("client.Mh")
	public int field1550;

	@ObfuscatedName("client.Nh")
	public int field1551;

	@ObfuscatedName("client.Ph")
	public static int field1553;

	@ObfuscatedName("client.Uh")
	public static int field1558;

	@ObfuscatedName("client.Wh")
	public int field1560;

	@ObfuscatedName("client.Xh")
	public int field1561;

	@ObfuscatedName("client.Yh")
	public int field1562;

	@ObfuscatedName("client.ai")
	public int field1564;

	@ObfuscatedName("client.ei")
	public int field1568;

	@ObfuscatedName("client.mi")
	public int field1576;

	@ObfuscatedName("client.qi")
	public int field1580;

	@ObfuscatedName("client.ri")
	public int field1581;

	@ObfuscatedName("client.si")
	public int dragCycles;

	@ObfuscatedName("client.yi")
	public static int loopCycle;

	@ObfuscatedName("client.zi")
	public int field1589;

	@ObfuscatedName("client.Ai")
	public int field1590;

	@ObfuscatedName("client.Ci")
	public int field1592;

	@ObfuscatedName("client.Ei")
	public int field1594;

	@ObfuscatedName("client.Ii")
	public static int field1598;

	@ObfuscatedName("client.Ki")
	public int field1600;

	@ObfuscatedName("client.Li")
	public int field1601;

	@ObfuscatedName("client.Mi")
	public int field1602;

	@ObfuscatedName("client.Ni")
	public int field1603;

	@ObfuscatedName("client.Qi")
	public static int field1606;

	@ObfuscatedName("client.Ui")
	public static int field1610;

	@ObfuscatedName("client.Wi")
	public static int field1612;

	@ObfuscatedName("client.bj")
	public int field1617;

	@ObfuscatedName("client.cj")
	public int field1618;

	@ObfuscatedName("client.gj")
	public static int field1622;

	@ObfuscatedName("client.lj")
	public int field1627;

	@ObfuscatedName("client.vj")
	public int field1637;

	@ObfuscatedName("client.wj")
	public int field1638;

	@ObfuscatedName("client.xj")
	public int field1639;

	@ObfuscatedName("client.yj")
	public int field1640;

	@ObfuscatedName("client.zj")
	public int field1641;

	@ObfuscatedName("client.Ee")
	public long field1387;

	@ObfuscatedName("client.Te")
	public long field1402;

	@ObfuscatedName("client.mf")
	public long field1420;

	@ObfuscatedName("client.Dg")
	public long field1489;

	@ObfuscatedName("client.jj")
	public long field1625;

	@ObfuscatedName("client.uf")
	public static PlayerEntity localPlayer;

	@ObfuscatedName("client.rc")
	public Pix32 levelObjStacks;

	@ObfuscatedName("client.Bf")
	public Pix32 field1435;

	@ObfuscatedName("client.Cf")
	public Pix32 field1436;

	@ObfuscatedName("client.dg")
	public Pix32 field1463;

	@ObfuscatedName("client.ng")
	public Pix32 field1473;

	@ObfuscatedName("client.og")
	public Pix32 field1474;

	@ObfuscatedName("client.sg")
	public Pix32 field1478;

	@ObfuscatedName("client.Fg")
	public Pix32 field1491;

	@ObfuscatedName("client.Gg")
	public Pix32 field1492;

	@ObfuscatedName("client.Hg")
	public Pix32 field1493;

	@ObfuscatedName("client.Ig")
	public Pix32 field1494;

	@ObfuscatedName("client.Oh")
	public Pix32 field1552;

	@ObfuscatedName("client.W")
	public Pix8 field1197;

	@ObfuscatedName("client.X")
	public Pix8 field1198;

	@ObfuscatedName("client.fe")
	public Pix8 imageTitlebox;

	@ObfuscatedName("client.ge")
	public Pix8 imageTitlebutton;

	@ObfuscatedName("client.Ie")
	public Pix8 field1391;

	@ObfuscatedName("client.Je")
	public Pix8 field1392;

	@ObfuscatedName("client.Ke")
	public Pix8 field1393;

	@ObfuscatedName("client.Le")
	public Pix8 field1394;

	@ObfuscatedName("client.Me")
	public Pix8 field1395;

	@ObfuscatedName("client.of")
	public Pix8 field1422;

	@ObfuscatedName("client.pf")
	public Pix8 field1423;

	@ObfuscatedName("client.qf")
	public Pix8 field1424;

	@ObfuscatedName("client.Lf")
	public Pix8 field1445;

	@ObfuscatedName("client.Mf")
	public Pix8 field1446;

	@ObfuscatedName("client.Nf")
	public Pix8 field1447;

	@ObfuscatedName("client.ti")
	public Pix8 field1583;

	@ObfuscatedName("client.ui")
	public Pix8 field1584;

	@ObfuscatedName("client.vi")
	public Pix8 field1585;

	@ObfuscatedName("client.wi")
	public Pix8 field1586;

	@ObfuscatedName("client.xi")
	public Pix8 field1587;

	@ObfuscatedName("client.Hf")
	public PixFont field1441;

	@ObfuscatedName("client.If")
	public PixFont field1442;

	@ObfuscatedName("client.Jf")
	public PixFont field1443;

	@ObfuscatedName("client.Kf")
	public PixFont field1444;

	@ObfuscatedName("client.id")
	public PixMap field1313;

	@ObfuscatedName("client.jd")
	public PixMap field1314;

	@ObfuscatedName("client.kd")
	public PixMap field1315;

	@ObfuscatedName("client.ld")
	public PixMap field1316;

	@ObfuscatedName("client.md")
	public PixMap field1317;

	@ObfuscatedName("client.nd")
	public PixMap field1318;

	@ObfuscatedName("client.od")
	public PixMap field1319;

	@ObfuscatedName("client.pd")
	public PixMap field1320;

	@ObfuscatedName("client.qd")
	public PixMap field1321;

	@ObfuscatedName("client.ud")
	public PixMap field1325;

	@ObfuscatedName("client.vd")
	public PixMap field1326;

	@ObfuscatedName("client.wd")
	public PixMap field1327;

	@ObfuscatedName("client.he")
	public PixMap field1364;

	@ObfuscatedName("client.ie")
	public PixMap field1365;

	@ObfuscatedName("client.je")
	public PixMap field1366;

	@ObfuscatedName("client.ke")
	public PixMap field1367;

	@ObfuscatedName("client.le")
	public PixMap field1368;

	@ObfuscatedName("client.me")
	public PixMap field1369;

	@ObfuscatedName("client.ne")
	public PixMap field1370;

	@ObfuscatedName("client.oe")
	public PixMap field1371;

	@ObfuscatedName("client.pe")
	public PixMap field1372;

	@ObfuscatedName("client.dh")
	public PixMap field1515;

	@ObfuscatedName("client.eh")
	public PixMap field1516;

	@ObfuscatedName("client.fh")
	public PixMap field1517;

	@ObfuscatedName("client.gh")
	public PixMap field1518;

	@ObfuscatedName("client.nh")
	public OnDemand onDemand;

	@ObfuscatedName("client.zh")
	public Isaac field1537;

	@ObfuscatedName("client.He")
	public Jagfile field1390;

	@ObfuscatedName("client.hj")
	public MouseTracking field1623;

	@ObfuscatedName("client.vc")
	public ClientStream field1274;

	@ObfuscatedName("client.Y")
	public String field1199;

	@ObfuscatedName("client.fd")
	public String field1310;

	@ObfuscatedName("client.Pg")
	public String field1501;

	@ObfuscatedName("client.ij")
	public String field1624;

	@ObfuscatedName("client.Dc")
	public static boolean field1282;

	@ObfuscatedName("client.Se")
	public static boolean field1401;

	@ObfuscatedName("client.Ti")
	public static boolean field1609;

	@ObfuscatedName("client.Aj")
	public static boolean field1642;

	@ObfuscatedName("client.Wc")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Xc")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Wd")
	public int[] field1353;

	@ObfuscatedName("client.Xd")
	public int[] field1354;

	@ObfuscatedName("client.Yd")
	public int[] field1355;

	@ObfuscatedName("client.We")
	public int[] field1405;

	@ObfuscatedName("client.Xe")
	public int[] field1406;

	@ObfuscatedName("client.Ye")
	public int[] field1407;

	@ObfuscatedName("client.hi")
	public int[] flameBuffer2;

	@ObfuscatedName("client.ii")
	public int[] imageFlamesLeft;

	@ObfuscatedName("client.Qg")
	public Pix8[] imageRunes;

	@ObfuscatedName("client.gd")
	public byte[][] field1311;

	@ObfuscatedName("client.Cc")
	public byte[][][] field1281;

	@ObfuscatedName("client.af")
	public int[][][] field1409;

	@ObfuscatedName("client.b(Z)V")
	public final void method427(boolean arg0) {
		this.field1580++;
		this.method453(this.field1495, true);
		this.method486(7);
		this.method453(this.field1495, false);
		this.method449(this.field1193);
		this.method465(this.field1480);
		if (!this.field1471) {
			int var2 = this.field1559;
			if (this.field1226 / 256 > var2) {
				var2 = this.field1226 / 256;
			}
			if (this.field1352[4] && this.field1242[4] + 128 > var2) {
				var2 = this.field1242[4] + 128;
			}
			int var3 = this.field1560 + this.field1227 & 0x7FF;
			this.method491(this.field1375, var3, this.method473(false, localPlayer.field405, this.field1479, localPlayer.field404) - 50, var2, this.field1476, var2 * 3 + 600, this.field1475);
			field1209++;
			if (field1209 > 1802) {
				field1209 = 0;
				this.field1404.pIsaac(148, this.field1496);
				this.field1404.p1(0);
				int var4 = this.field1404.pos;
				this.field1404.p2(29711);
				this.field1404.p1(70);
				this.field1404.p1((int) (Math.random() * 256.0D));
				this.field1404.p1(242);
				this.field1404.p1(186);
				this.field1404.p1(39);
				this.field1404.p1(61);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field1404.p1(13);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field1404.p2(57856);
				}
				this.field1404.p2((int) (Math.random() * 65536.0D));
				this.field1404.psize1(41372, this.field1404.pos - var4);
			}
		}
		int var5;
		if (this.field1471) {
			var5 = this.method521(8);
		} else {
			var5 = this.method520(150);
		}
		int var6 = this.field1637;
		int var7 = this.field1638;
		int var8 = this.field1639;
		int var9 = this.field1640;
		int var10 = this.field1641;
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.field1352[var11]) {
				int var13 = (int) (Math.random() * (double) (this.field1279[var11] * 2 + 1) - (double) this.field1279[var11] + Math.sin((double) this.field1237[var11] / 100.0D * (double) this.field1257[var11]) * (double) this.field1242[var11]);
				if (var11 == 0) {
					this.field1637 += var13;
				}
				if (var11 == 1) {
					this.field1638 += var13;
				}
				if (var11 == 2) {
					this.field1639 += var13;
				}
				if (var11 == 3) {
					this.field1641 = this.field1641 + var13 & 0x7FF;
				}
				if (var11 == 4) {
					this.field1640 += var13;
					if (this.field1640 < 128) {
						this.field1640 = 128;
					}
					if (this.field1640 > 383) {
						this.field1640 = 383;
					}
				}
			}
		}
		int var12 = Pix3D.field662;
		Model.field601 = true;
		Model.field604 = 0;
		Model.field602 = super.mouseX - 4;
		if (!arg0) {
			this.field1426 = !this.field1426;
		}
		Model.field603 = super.mouseY - 4;
		Pix2D.method167(false);
		this.field1258.method102(this.field1637, var5, 7, this.field1641, this.field1640, this.field1639, this.field1638);
		this.field1258.method77((byte) -48);
		this.method462(47);
		this.method509(317);
		this.method555(var12, -131);
		this.method475((byte) 1);
		this.field1517.method268(super.graphics, 4, (byte) 55, 4);
		this.field1637 = var6;
		this.field1638 = var7;
		this.field1639 = var8;
		this.field1640 = var9;
		this.field1641 = var10;
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method428(int arg0, int arg1, Packet arg2) {
		this.field1322 = 0;
		if (arg0 != -13193) {
			this.ptype = -1;
		}
		this.field1288 = 0;
		this.method485(arg2, (byte) 20, arg1);
		this.method518(arg1, false, arg2);
		this.method498(false, arg2, arg1);
		for (int var4 = 0; var4 < this.field1322; var4++) {
			int var6 = this.field1323[var4];
			if (loopCycle != this.field1438[var6].field449) {
				this.field1438[var6].field461 = null;
				this.field1438[var6] = null;
			}
		}
		if (arg2.pos != arg1) {
			signlink.reporterror(this.field1577 + " size mismatch in getnpcpos - pos:" + arg2.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.field1439; var5++) {
			if (this.field1438[this.field1440[var5]] == null) {
				signlink.reporterror(this.field1577 + " null entry in npc list - pos:" + var5 + " size:" + this.field1439);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void tryReconnect(int arg0) {
		if (arg0 != 0) {
			this.field1404.p1(174);
		}
		if (this.field1247 > 0) {
			this.logout(false);
			return;
		}
		this.field1517.method267(212);
		this.field1442.method213(257, 1, 0, "Connection lost", 144);
		this.field1442.method213(256, 1, 16777215, "Connection lost", 143);
		this.field1442.method213(257, 1, 0, "Please wait - attempting to reestablish", 159);
		this.field1442.method213(256, 1, 16777215, "Please wait - attempting to reestablish", 158);
		this.field1517.method268(super.graphics, 4, (byte) 55, 4);
		this.field1461 = 0;
		ClientStream var2 = this.field1274;
		this.ingame = false;
		this.method448(this.field1577, this.field1578, true);
		if (!this.ingame) {
			this.logout(false);
		}
		try {
			var2.close();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.h(I)V")
	public final void method430(int arg0) {
		if (arg0 != 10370) {
			this.field1404.p1(93);
		}
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.field1324[0] != -1) {
			this.field1221 = true;
			this.field1225 = 0;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1324[1] != -1) {
			this.field1221 = true;
			this.field1225 = 1;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1324[2] != -1) {
			this.field1221 = true;
			this.field1225 = 2;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.field1324[3] != -1) {
			this.field1221 = true;
			this.field1225 = 3;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1324[4] != -1) {
			this.field1221 = true;
			this.field1225 = 4;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.field1324[5] != -1) {
			this.field1221 = true;
			this.field1225 = 5;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.field1324[6] != -1) {
			this.field1221 = true;
			this.field1225 = 6;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.field1324[7] != -1) {
			this.field1221 = true;
			this.field1225 = 7;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1324[8] != -1) {
			this.field1221 = true;
			this.field1225 = 8;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1324[9] != -1) {
			this.field1221 = true;
			this.field1225 = 9;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.field1324[10] != -1) {
			this.field1221 = true;
			this.field1225 = 10;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1324[11] != -1) {
			this.field1221 = true;
			this.field1225 = 11;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.field1324[12] != -1) {
			this.field1221 = true;
			this.field1225 = 12;
			this.field1384 = true;
		}
		if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.field1324[13] != -1) {
			this.field1221 = true;
			this.field1225 = 13;
			this.field1384 = true;
		}
		field1513++;
		if (field1513 > 150) {
			field1513 = 0;
			this.field1404.pIsaac(46, this.field1496);
			this.field1404.p1(43);
			return;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;IZ)V")
	public final void method431(String arg0, String arg1, int arg2, boolean arg3) {
		if (arg2 == 0 && this.field1565 != -1) {
			this.field1199 = arg0;
			super.mouseClickButton = 0;
		}
		if (this.field1396 == -1) {
			this.field1236 = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			this.field1429[var5] = this.field1429[var5 - 1];
			this.field1430[var5] = this.field1430[var5 - 1];
			this.field1431[var5] = this.field1431[var5 - 1];
		}
		if (arg3) {
			this.ptype = -1;
		}
		this.field1429[0] = arg2;
		this.field1430[0] = arg1;
		this.field1431[0] = arg0;
	}

	@ObfuscatedName("client.a(B)V")
	public final void method432(byte arg0) {
		if (arg0 != -119) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		if (super.mouseClickButton != 1) {
			return;
		}
		if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1408 = (this.field1408 + 1) % 4;
			this.field1616 = true;
			this.field1236 = true;
			this.field1404.pIsaac(98, this.field1496);
			this.field1404.p1(this.field1408);
			this.field1404.p1(this.field1576);
			this.field1404.p1(this.field1275);
		}
		if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1576 = (this.field1576 + 1) % 3;
			this.field1616 = true;
			this.field1236 = true;
			this.field1404.pIsaac(98, this.field1496);
			this.field1404.p1(this.field1408);
			this.field1404.p1(this.field1576);
			this.field1404.p1(this.field1275);
		}
		if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
			this.field1275 = (this.field1275 + 1) % 3;
			this.field1616 = true;
			this.field1236 = true;
			this.field1404.pIsaac(98, this.field1496);
			this.field1404.p1(this.field1408);
			this.field1404.p1(this.field1576);
			this.field1404.p1(this.field1275);
		}
		if (super.mouseClickX < 412 || super.mouseClickX > 512 || super.mouseClickY < 467 || super.mouseClickY > 499) {
			return;
		}
		this.method450(true);
		this.field1345 = "";
		this.field1451 = false;
		for (int var3 = 0; var3 < Component.types.length; var3++) {
			if (Component.types[var3] != null && Component.types[var3].field82 == 600) {
				this.field1192 = this.field1273 = Component.types[var3].field79;
				return;
			}
		}
		return;
	}

	@ObfuscatedName("client.a(Ld;B)V")
	public final void method433(Component arg0, byte arg1) {
		if (arg1 != 102) {
			this.field1404.p1(206);
		}
		int var3 = arg0.field82;
		if (var3 >= 1 && var3 <= 100 || !(var3 < 701 || var3 > 800)) {
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= this.field1418) {
				arg0.field113 = "";
				arg0.field81 = 0;
			} else {
				arg0.field113 = this.field1556[var3];
				arg0.field81 = 1;
			}
		} else if (var3 >= 101 && var3 <= 200 || !(var3 < 801 || var3 > 900)) {
			if (var3 > 800) {
				var3 -= 701;
			} else {
				var3 -= 101;
			}
			if (var3 >= this.field1418) {
				arg0.field113 = "";
				arg0.field81 = 0;
			} else {
				if (this.field1470[var3] == 0) {
					arg0.field113 = "@red@Offline";
				} else if (this.field1470[var3] == field1398) {
					arg0.field113 = "@gre@World-" + (this.field1470[var3] - 9);
				} else {
					arg0.field113 = "@yel@World-" + (this.field1470[var3] - 9);
				}
				arg0.field81 = 1;
			}
		} else if (var3 == 203) {
			arg0.field92 = this.field1418 * 15 + 20;
			if (arg0.field92 <= arg0.field84) {
				arg0.field92 = arg0.field84 + 1;
			}
		} else if (var3 >= 401 && var3 <= 500) {
			var3 -= 401;
			if (var3 >= this.field1359) {
				arg0.field113 = "";
				arg0.field81 = 0;
			} else {
				arg0.field113 = JString.method313(true, JString.method310((byte) 88, this.field1339[var3]));
				arg0.field81 = 1;
			}
		} else if (var3 == 503) {
			arg0.field92 = this.field1359 * 15 + 20;
			if (arg0.field92 <= arg0.field84) {
				arg0.field92 = arg0.field84 + 1;
			}
		} else if (var3 == 327) {
			arg0.field127 = 150;
			arg0.field128 = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			if (this.field1196) {
				for (int var4 = 0; var4 < 7; var4++) {
					int var11 = this.field1597[var4];
					if (var11 >= 0 && !IdkType.types[var11].method377(6)) {
						return;
					}
				}
				this.field1196 = false;
				Model[] var5 = new Model[7];
				int var6 = 0;
				for (int var7 = 0; var7 < 7; var7++) {
					int var10 = this.field1597[var7];
					if (var10 >= 0) {
						var5[var6++] = IdkType.types[var10].method378(597);
					}
				}
				Model var8 = new Model(var6, 652, var5);
				for (int var9 = 0; var9 < 5; var9++) {
					if (this.field1557[var9] != 0) {
						var8.recolour(field1379[var9][0], field1379[var9][this.field1557[var9]]);
						if (var9 == 1) {
							var8.recolour(field1528[0], field1528[this.field1557[var9]]);
						}
					}
				}
				var8.method145(-591);
				var8.method146(SeqType.types[localPlayer.field409].frames[0], 13056);
				var8.calculateNormals(64, 850, -30, -50, -30, true);
				arg0.field120 = 5;
				arg0.field121 = 0;
				Component.method36(var8, 675, 0, 5);
			}
		} else if (var3 == 324) {
			if (this.field1435 == null) {
				this.field1435 = arg0.field118;
				this.field1436 = arg0.field119;
			}
			if (this.field1570) {
				arg0.field118 = this.field1436;
			} else {
				arg0.field118 = this.field1435;
			}
		} else if (var3 == 325) {
			if (this.field1435 == null) {
				this.field1435 = arg0.field118;
				this.field1436 = arg0.field119;
			}
			if (this.field1570) {
				arg0.field118 = this.field1435;
			} else {
				arg0.field118 = this.field1436;
			}
		} else if (var3 == 600) {
			arg0.field113 = this.field1345;
			if (loopCycle % 20 < 10) {
				arg0.field113 = arg0.field113 + "|";
			} else {
				arg0.field113 = arg0.field113 + " ";
			}
		} else {
			if (var3 == 613) {
				if (this.field1378 < 1) {
					arg0.field113 = "";
				} else if (this.field1451) {
					arg0.field115 = 16711680;
					arg0.field113 = "Moderator option: Mute player for 48 hours: <ON>";
				} else {
					arg0.field115 = 16777215;
					arg0.field113 = "Moderator option: Mute player for 48 hours: <OFF>";
				}
			}
			if (var3 == 650 || var3 == 655) {
				if (this.field1487 == 0) {
					arg0.field113 = "";
				} else {
					String var12;
					if (this.field1529 == 0) {
						var12 = "earlier today";
					} else if (this.field1529 == 1) {
						var12 = "yesterday";
					} else {
						var12 = this.field1529 + " days ago";
					}
					arg0.field113 = "You last logged in " + var12 + " from: " + signlink.dns;
				}
			}
			if (var3 == 651) {
				if (this.field1189 == 0) {
					arg0.field113 = "0 unread messages";
					arg0.field115 = 16776960;
				}
				if (this.field1189 == 1) {
					arg0.field113 = "1 unread message";
					arg0.field115 = 65280;
				}
				if (this.field1189 > 1) {
					arg0.field113 = this.field1189 + " unread messages";
					arg0.field115 = 65280;
				}
			}
			if (var3 == 652) {
				if (this.field1238 == 201) {
					if (this.field1425 == 1) {
						arg0.field113 = "@yel@This is a non-members world: @whi@Since you are a member we";
					} else {
						arg0.field113 = "";
					}
				} else if (this.field1238 == 200) {
					arg0.field113 = "You have not yet set any password recovery questions.";
				} else {
					String var13;
					if (this.field1238 == 0) {
						var13 = "Earlier today";
					} else if (this.field1238 == 1) {
						var13 = "Yesterday";
					} else {
						var13 = this.field1238 + " days ago";
					}
					arg0.field113 = var13 + " you changed your recovery questions";
				}
			}
			if (var3 == 653) {
				if (this.field1238 == 201) {
					if (this.field1425 == 1) {
						arg0.field113 = "@whi@recommend you use a members world instead. You may use";
					} else {
						arg0.field113 = "";
					}
				} else if (this.field1238 == 200) {
					arg0.field113 = "We strongly recommend you do so now to secure your account.";
				} else {
					arg0.field113 = "If you do not remember making this change then cancel it immediately";
				}
			}
			if (var3 == 654) {
				if (this.field1238 == 201) {
					if (this.field1425 == 1) {
						arg0.field113 = "@whi@this world but member benefits are unavailabe whilst here.";
					} else {
						arg0.field113 = "";
					}
				} else if (this.field1238 == 200) {
					arg0.field113 = "Do this from the 'account management' area on our front webpage";
				} else {
					arg0.field113 = "Do this from the 'account management' area on our front webpage";
				}
			}
		}
	}

	@ObfuscatedName("client.i(I)V")
	public final void method434(int arg0) {
		if (arg0 != 9 || this.field1261 != 0) {
			return;
		}
		int var2 = super.mouseClickButton;
		if (this.field1307 == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
			var2 = 0;
		}
		if (!this.field1356) {
			if (var2 == 1 && this.field1564 > 0) {
				int var13 = this.field1203[this.field1564 - 1];
				if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
					int var14 = this.field1201[this.field1564 - 1];
					int var15 = this.field1202[this.field1564 - 1];
					Component var16 = Component.types[var15];
					if (var16.field100) {
						this.field1232 = false;
						this.field1254 = 0;
						this.field1259 = var15;
						this.field1260 = var14;
						this.field1261 = 2;
						this.field1262 = super.mouseClickX;
						this.field1263 = super.mouseClickY;
						if (Component.types[var15].field79 == this.field1273) {
							this.field1261 = 1;
						}
						if (Component.types[var15].field79 == this.field1396) {
							this.field1261 = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (this.field1522 == 1 || this.method487(this.field1564 - 1, true)) && this.field1564 > 2) {
				var2 = 2;
			}
			if (var2 == 1 && this.field1564 > 0) {
				this.method512(this.field1564 - 1, 0);
			}
			if (var2 != 2 || this.field1564 <= 0) {
				return;
			}
			this.method541((byte) 2);
			return;
		}
		if (var2 != 1) {
			int var3 = super.mouseX;
			int var4 = super.mouseY;
			if (this.field1455 == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (this.field1455 == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (this.field1455 == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < this.field1456 - 10 || var3 > this.field1458 + this.field1456 + 10 || var4 < this.field1457 - 10 || var4 > this.field1459 + this.field1457 + 10) {
				this.field1356 = false;
				if (this.field1455 == 1) {
					this.field1221 = true;
				}
				if (this.field1455 == 2) {
					this.field1236 = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = this.field1456;
		int var6 = this.field1457;
		int var7 = this.field1458;
		int var8 = super.mouseClickX;
		int var9 = super.mouseClickY;
		if (this.field1455 == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.field1455 == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.field1455 == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < this.field1564; var11++) {
			int var12 = (this.field1564 - 1 - var11) * 15 + var6 + 31;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			this.method512(var10, 0);
		}
		this.field1356 = false;
		if (this.field1455 == 1) {
			this.field1221 = true;
		}
		if (this.field1455 == 2) {
			this.field1236 = true;
			return;
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method435(boolean arg0) {
		byte[] var2 = this.field1390.read("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.field1367.method267(212);
		var3.method196(0, 0, 7);
		this.field1368.method267(212);
		var3.method196(-637, 0, 7);
		this.field1364.method267(212);
		var3.method196(-128, 0, 7);
		this.field1365.method267(212);
		var3.method196(-202, -371, 7);
		this.field1366.method267(212);
		var3.method196(-202, -171, 7);
		this.field1369.method267(212);
		if (!arg0) {
			this.ptype = this.in.g1();
		}
		var3.method196(0, -265, 7);
		this.field1370.method267(212);
		var3.method196(-562, -265, 7);
		this.field1371.method267(212);
		var3.method196(-128, -171, 7);
		this.field1372.method267(212);
		var3.method196(-562, -171, 7);
		int[] var4 = new int[var3.field671];
		for (int var5 = 0; var5 < var3.field672; var5++) {
			for (int var10 = 0; var10 < var3.field671; var10++) {
				var4[var10] = var3.field670[var3.field671 * var5 + (var3.field671 - var10 - 1)];
			}
			for (int var11 = 0; var11 < var3.field671; var11++) {
				var3.field670[var3.field671 * var5 + var11] = var4[var11];
			}
		}
		this.field1367.method267(212);
		var3.method196(382, 0, 7);
		this.field1368.method267(212);
		var3.method196(-255, 0, 7);
		this.field1364.method267(212);
		var3.method196(254, 0, 7);
		this.field1365.method267(212);
		var3.method196(180, -371, 7);
		this.field1366.method267(212);
		var3.method196(180, -171, 7);
		this.field1369.method267(212);
		var3.method196(382, -265, 7);
		this.field1370.method267(212);
		var3.method196(-180, -265, 7);
		this.field1371.method267(212);
		var3.method196(254, -171, 7);
		this.field1372.method267(212);
		var3.method196(-180, -171, 7);
		Pix32 var6 = new Pix32(this.field1390, "logo", 0);
		this.field1364.method267(212);
		var6.method198((byte) 9, 382 - var6.field671 / 2 - 128, 18);
		Object var7 = null;
		Object var8 = null;
		Object var9 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = arg2 >> 14 & 0x7FFF;
		int var7 = this.field1258.method93(this.field1479, arg1, arg4, arg2);
		if (var7 == -1) {
			return false;
		}
		int var8 = var7 & 0x1F;
		int var9 = var7 >> 6 & 0x3;
		if (var8 == 10 || var8 == 11 || var8 == 22) {
			LocType var10 = LocType.method333(var6);
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
			this.method515(false, var11, localPlayer.routeTileZ[0], var13, 2, false, 0, arg1, 0, arg4, var12, localPlayer.routeTileX[0]);
		} else {
			this.method515(false, 0, localPlayer.routeTileZ[0], 0, 2, false, var9, arg1, var8 + 1, arg4, 0, localPlayer.routeTileX[0]);
		}
		this.field1600 = super.mouseClickX;
		this.field1601 = super.mouseClickY;
		this.field1603 = 2;
		this.field1602 = 0;
		while (arg3 >= 0) {
			for (int var14 = 1; var14 > 0; var14++) {
			}
		}
		this.field1404.pIsaac(arg0, this.field1496);
		this.field1404.p2(this.sceneBaseTileX + arg1);
		this.field1404.p2(this.sceneBaseTileZ + arg4);
		this.field1404.p2(var6);
		return true;
	}

	@ObfuscatedName("client.j(I)V")
	public final void method437(int arg0) {
		for (int var2 = 0; var2 < this.field1439; var2++) {
			int var3 = this.field1440[var2];
			NpcEntity var4 = this.field1438[var3];
			if (var4 != null) {
				this.method438(var4, var4.field461.size, 867);
			}
		}
		this.psize += arg0;
	}

	@ObfuscatedName("client.a(Lz;II)V")
	public final void method438(PathingEntity arg0, int arg1, int arg2) {
		if (arg0.field404 < 128 || arg0.field405 < 128 || arg0.field404 >= 13184 || arg0.field405 >= 13184) {
			arg0.field432 = -1;
			arg0.field437 = -1;
			arg0.field446 = 0;
			arg0.field447 = 0;
			arg0.field404 = arg0.routeTileX[0] * 128 + arg0.field408 * 64;
			arg0.field405 = arg0.routeTileZ[0] * 128 + arg0.field408 * 64;
			arg0.method125(2);
		}
		if (localPlayer == arg0 && (arg0.field404 < 1536 || arg0.field405 < 1536 || arg0.field404 >= 11776 || arg0.field405 >= 11776)) {
			arg0.field432 = -1;
			arg0.field437 = -1;
			arg0.field446 = 0;
			arg0.field447 = 0;
			arg0.field404 = arg0.routeTileX[0] * 128 + arg0.field408 * 64;
			arg0.field405 = arg0.routeTileZ[0] * 128 + arg0.field408 * 64;
			arg0.method125(2);
		}
		if (arg0.field446 > loopCycle) {
			this.method439(0, arg0);
		} else if (arg0.field447 >= loopCycle) {
			this.method440(arg0, 4);
		} else {
			this.method441(arg0, -848);
		}
		this.method442(arg0, 8);
		int var4 = 7 / arg2;
		this.method443(arg0, -391);
	}

	@ObfuscatedName("client.a(ILz;)V")
	public final void method439(int arg0, PathingEntity arg1) {
		int var3 = arg1.field446 - loopCycle;
		int var4 = arg1.field442 * 128 + arg1.field408 * 64;
		int var5 = arg1.field444 * 128 + arg1.field408 * 64;
		arg1.field404 += (var4 - arg1.field404) / var3;
		this.psize += arg0;
		arg1.field405 += (var5 - arg1.field405) / var3;
		arg1.field456 = 0;
		if (arg1.field448 == 0) {
			arg1.field451 = 1024;
		}
		if (arg1.field448 == 1) {
			arg1.field451 = 1536;
		}
		if (arg1.field448 == 2) {
			arg1.field451 = 0;
		}
		if (arg1.field448 == 3) {
			arg1.field451 = 512;
		}
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method440(PathingEntity arg0, int arg1) {
		if (loopCycle == arg0.field447 || arg0.field432 == -1 || arg0.field435 != 0 || arg0.field434 + 1 > SeqType.types[arg0.field432].method382(0, arg0.field433)) {
			int var3 = arg0.field447 - arg0.field446;
			int var4 = loopCycle - arg0.field446;
			int var5 = arg0.field442 * 128 + arg0.field408 * 64;
			int var6 = arg0.field444 * 128 + arg0.field408 * 64;
			int var7 = arg0.field443 * 128 + arg0.field408 * 64;
			int var8 = arg0.field445 * 128 + arg0.field408 * 64;
			arg0.field404 = ((var3 - var4) * var5 + var4 * var7) / var3;
			arg0.field405 = ((var3 - var4) * var6 + var4 * var8) / var3;
		}
		arg0.field456 = 0;
		if (this.field1235 != arg1) {
			this.field1426 = !this.field1426;
		}
		if (arg0.field448 == 0) {
			arg0.field451 = 1024;
		}
		if (arg0.field448 == 1) {
			arg0.field451 = 1536;
		}
		if (arg0.field448 == 2) {
			arg0.field451 = 0;
		}
		if (arg0.field448 == 3) {
			arg0.field451 = 512;
		}
		arg0.field406 = arg0.field451;
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method441(PathingEntity arg0, int arg1) {
		arg0.field429 = arg0.field409;
		if (arg0.field452 == 0) {
			arg0.field456 = 0;
			return;
		}
		if (arg0.field432 != -1 && arg0.field435 == 0) {
			SeqType var3 = SeqType.types[arg0.field432];
			if (arg0.field457 > 0 && var3.preanim_move == 0) {
				arg0.field456++;
				return;
			}
			if (arg0.field457 <= 0 && var3.postanim_mode == 0) {
				arg0.field456++;
				return;
			}
		}
		int var4 = arg0.field404;
		int var5 = arg0.field405;
		int var6 = arg0.routeTileX[arg0.field452 - 1] * 128 + arg0.field408 * 64;
		int var7 = arg0.routeTileZ[arg0.field452 - 1] * 128 + arg0.field408 * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg0.field404 = var6;
			arg0.field405 = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg0.field451 = 1280;
			} else if (var5 > var7) {
				arg0.field451 = 1792;
			} else {
				arg0.field451 = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg0.field451 = 768;
			} else if (var5 > var7) {
				arg0.field451 = 256;
			} else {
				arg0.field451 = 512;
			}
		} else if (var5 < var7) {
			arg0.field451 = 1024;
		} else {
			arg0.field451 = 0;
		}
		int var8 = arg0.field451 - arg0.field406 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.field412;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.field411;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.field414;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.field413;
		}
		if (var9 == -1) {
			var9 = arg0.field411;
		}
		arg0.field429 = var9;
		if (arg1 >= 0) {
			return;
		}
		int var10 = 4;
		if (arg0.field451 != arg0.field406 && arg0.field426 == -1) {
			var10 = 2;
		}
		if (arg0.field452 > 2) {
			var10 = 6;
		}
		if (arg0.field452 > 3) {
			var10 = 8;
		}
		if (arg0.field456 > 0 && arg0.field452 > 1) {
			var10 = 8;
			arg0.field456--;
		}
		if (arg0.field455[arg0.field452 - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg0.field429 == arg0.field411 && arg0.field415 != -1) {
			arg0.field429 = arg0.field415;
		}
		if (var4 < var6) {
			arg0.field404 += var10;
			if (arg0.field404 > var6) {
				arg0.field404 = var6;
			}
		} else if (var4 > var6) {
			arg0.field404 -= var10;
			if (arg0.field404 < var6) {
				arg0.field404 = var6;
			}
		}
		if (var5 < var7) {
			arg0.field405 += var10;
			if (arg0.field405 > var7) {
				arg0.field405 = var7;
			}
		} else if (var5 > var7) {
			arg0.field405 -= var10;
			if (arg0.field405 < var7) {
				arg0.field405 = var7;
			}
		}
		if (arg0.field404 != var6 || arg0.field405 != var7) {
			return;
		}
		arg0.field452--;
		if (arg0.field457 > 0) {
			arg0.field457--;
			return;
		}
	}

	@ObfuscatedName("client.c(Lz;I)V")
	public final void method442(PathingEntity arg0, int arg1) {
		if (arg1 != 8) {
			return;
		}
		if (arg0.field426 != -1 && arg0.field426 < 32768) {
			NpcEntity var3 = this.field1438[arg0.field426];
			if (var3 != null) {
				int var4 = arg0.field404 - var3.field404;
				int var5 = arg0.field405 - var3.field405;
				if (var4 != 0 || var5 != 0) {
					arg0.field451 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field426 >= 32768) {
			int var6 = arg0.field426 - 32768;
			if (this.field1397 == var6) {
				var6 = this.field1284;
			}
			PlayerEntity var7 = this.field1285[var6];
			if (var7 != null) {
				int var8 = arg0.field404 - var7.field404;
				int var9 = arg0.field405 - var7.field405;
				if (var8 != 0 || var9 != 0) {
					arg0.field451 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field427 != 0 || arg0.field428 != 0) && (arg0.field452 == 0 || arg0.field456 > 0)) {
			int var10 = arg0.field404 - (arg0.field427 - this.sceneBaseTileX - this.sceneBaseTileX) * 64;
			int var11 = arg0.field405 - (arg0.field428 - this.sceneBaseTileZ - this.sceneBaseTileZ) * 64;
			if (var10 != 0 || var11 != 0) {
				arg0.field451 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg0.field427 = 0;
			arg0.field428 = 0;
		}
		int var12 = arg0.field451 - arg0.field406 & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < 32 || var12 > 2016) {
			arg0.field406 = arg0.field451;
		} else if (var12 > 1024) {
			arg0.field406 -= 32;
		} else {
			arg0.field406 += 32;
		}
		arg0.field406 &= 0x7FF;
		if (arg0.field429 != arg0.field409 || arg0.field451 == arg0.field406) {
			return;
		}
		if (arg0.field410 != -1) {
			arg0.field429 = arg0.field410;
			return;
		}
		arg0.field429 = arg0.field411;
		return;
	}

	@ObfuscatedName("client.d(Lz;I)V")
	public final void method443(PathingEntity arg0, int arg1) {
		if (arg1 >= 0) {
			this.field1432 = null;
		}
		arg0.field407 = false;
		if (arg0.field429 != -1) {
			SeqType var3 = SeqType.types[arg0.field429];
			arg0.field431++;
			if (arg0.field430 < var3.frameCount && arg0.field431 > var3.method382(0, arg0.field430)) {
				arg0.field431 = 0;
				arg0.field430++;
			}
			if (arg0.field430 >= var3.frameCount) {
				arg0.field431 = 0;
				arg0.field430 = 0;
			}
		}
		if (arg0.field437 != -1 && loopCycle >= arg0.field440) {
			if (arg0.field438 < 0) {
				arg0.field438 = 0;
			}
			SeqType var4 = SpotAnimType.types[arg0.field437].seq;
			arg0.field439++;
			while (arg0.field438 < var4.frameCount && arg0.field439 > var4.method382(0, arg0.field438)) {
				arg0.field439 -= var4.method382(0, arg0.field438);
				arg0.field438++;
			}
			if (arg0.field438 >= var4.frameCount && (arg0.field438 < 0 || arg0.field438 >= var4.frameCount)) {
				arg0.field437 = -1;
			}
		}
		if (arg0.field432 != -1 && arg0.field435 <= 1) {
			SeqType var5 = SeqType.types[arg0.field432];
			if (var5.preanim_move == 1 && arg0.field457 > 0 && arg0.field446 <= loopCycle && arg0.field447 < loopCycle) {
				arg0.field435 = 1;
				return;
			}
		}
		if (arg0.field432 != -1 && arg0.field435 == 0) {
			SeqType var6 = SeqType.types[arg0.field432];
			arg0.field434++;
			while (arg0.field433 < var6.frameCount && arg0.field434 > var6.method382(0, arg0.field433)) {
				arg0.field434 -= var6.method382(0, arg0.field433);
				arg0.field433++;
			}
			if (arg0.field433 >= var6.frameCount) {
				arg0.field433 -= var6.replayoff;
				arg0.field436++;
				if (arg0.field436 >= var6.replaycount) {
					arg0.field432 = -1;
				}
				if (arg0.field433 < 0 || arg0.field433 >= var6.frameCount) {
					arg0.field432 = -1;
				}
			}
			arg0.field407 = var6.stretches;
		}
		if (arg0.field435 > 0) {
			arg0.field435--;
		}
	}

	@ObfuscatedName("client.k(I)V")
	public final void drawGame(int arg0) {
		if (this.field1483) {
			this.field1483 = false;
			this.field1313.method268(super.graphics, 4, (byte) 55, 0);
			this.field1314.method268(super.graphics, 357, (byte) 55, 0);
			this.field1315.method268(super.graphics, 4, (byte) 55, 722);
			this.field1316.method268(super.graphics, 205, (byte) 55, 743);
			this.field1317.method268(super.graphics, 0, (byte) 55, 0);
			this.field1318.method268(super.graphics, 4, (byte) 55, 516);
			this.field1319.method268(super.graphics, 205, (byte) 55, 516);
			this.field1320.method268(super.graphics, 357, (byte) 55, 496);
			this.field1321.method268(super.graphics, 338, (byte) 55, 0);
			this.field1221 = true;
			this.field1236 = true;
			this.field1384 = true;
			this.field1616 = true;
			if (this.field1527 != 2) {
				this.field1517.method268(super.graphics, 4, (byte) 55, 4);
				this.field1516.method268(super.graphics, 4, (byte) 55, 550);
			}
		}
		if (this.field1527 == 2) {
			this.method427(true);
		}
		if (this.field1356 && this.field1455 == 1) {
			this.field1221 = true;
		}
		if (this.field1567 != -1) {
			boolean var2 = this.method489(this.field1488, 225, this.field1567);
			if (var2) {
				this.field1221 = true;
			}
		}
		if (this.field1300 == 2) {
			this.field1221 = true;
		}
		if (this.field1261 == 2) {
			this.field1221 = true;
		}
		if (this.field1221) {
			this.method464((byte) 5);
			this.field1221 = false;
		}
		if (this.field1396 == -1) {
			this.field1619.field93 = this.field1563 - this.field1248 - 77;
			if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
				this.method542(this.field1619, 0, false, super.mouseY - 357, 77, this.field1563, super.mouseX - 17, 463, -960);
			}
			int var3 = this.field1563 - 77 - this.field1619.field93;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > this.field1563 - 77) {
				var3 = this.field1563 - 77;
			}
			if (this.field1248 != var3) {
				this.field1248 = var3;
				this.field1236 = true;
			}
		}
		if (this.field1396 != -1) {
			boolean var4 = this.method489(this.field1488, 225, this.field1396);
			if (var4) {
				this.field1236 = true;
			}
		}
		if (this.field1300 == 3) {
			this.field1236 = true;
		}
		if (this.field1261 == 3) {
			this.field1236 = true;
		}
		if (this.field1199 != null) {
			this.field1236 = true;
		}
		if (this.field1356 && this.field1455 == 2) {
			this.field1236 = true;
		}
		if (this.field1236) {
			this.method492((byte) 71);
			this.field1236 = false;
		}
		if (this.field1527 == 2) {
			this.method456(false);
			this.field1516.method268(super.graphics, 4, (byte) 55, 550);
		}
		if (this.field1253 != -1) {
			this.field1384 = true;
		}
		if (this.field1384) {
			if (this.field1253 != -1 && this.field1253 == this.field1225) {
				this.field1253 = -1;
				this.field1404.pIsaac(233, this.field1496);
				this.field1404.p1(this.field1225);
			}
			this.field1384 = false;
			this.field1327.method267(212);
			this.field1424.method211((byte) 9, 0, 0);
			if (this.field1567 == -1) {
				if (this.field1324[this.field1225] != -1) {
					if (this.field1225 == 0) {
						this.field1391.method211((byte) 9, 22, 10);
					}
					if (this.field1225 == 1) {
						this.field1392.method211((byte) 9, 54, 8);
					}
					if (this.field1225 == 2) {
						this.field1392.method211((byte) 9, 82, 8);
					}
					if (this.field1225 == 3) {
						this.field1393.method211((byte) 9, 110, 8);
					}
					if (this.field1225 == 4) {
						this.field1395.method211((byte) 9, 153, 8);
					}
					if (this.field1225 == 5) {
						this.field1395.method211((byte) 9, 181, 8);
					}
					if (this.field1225 == 6) {
						this.field1394.method211((byte) 9, 209, 9);
					}
				}
				if (this.field1324[0] != -1 && (this.field1253 != 0 || loopCycle % 20 < 10)) {
					this.field1593[0].method211((byte) 9, 29, 13);
				}
				if (this.field1324[1] != -1 && (this.field1253 != 1 || loopCycle % 20 < 10)) {
					this.field1593[1].method211((byte) 9, 53, 11);
				}
				if (this.field1324[2] != -1 && (this.field1253 != 2 || loopCycle % 20 < 10)) {
					this.field1593[2].method211((byte) 9, 82, 11);
				}
				if (this.field1324[3] != -1 && (this.field1253 != 3 || loopCycle % 20 < 10)) {
					this.field1593[3].method211((byte) 9, 115, 12);
				}
				if (this.field1324[4] != -1 && (this.field1253 != 4 || loopCycle % 20 < 10)) {
					this.field1593[4].method211((byte) 9, 153, 13);
				}
				if (this.field1324[5] != -1 && (this.field1253 != 5 || loopCycle % 20 < 10)) {
					this.field1593[5].method211((byte) 9, 180, 11);
				}
				if (this.field1324[6] != -1 && (this.field1253 != 6 || loopCycle % 20 < 10)) {
					this.field1593[6].method211((byte) 9, 208, 13);
				}
			}
			this.field1327.method268(super.graphics, 160, (byte) 55, 516);
			this.field1326.method267(212);
			this.field1423.method211((byte) 9, 0, 0);
			if (this.field1567 == -1) {
				if (this.field1324[this.field1225] != -1) {
					if (this.field1225 == 7) {
						this.field1583.method211((byte) 9, 42, 0);
					}
					if (this.field1225 == 8) {
						this.field1584.method211((byte) 9, 74, 0);
					}
					if (this.field1225 == 9) {
						this.field1584.method211((byte) 9, 102, 0);
					}
					if (this.field1225 == 10) {
						this.field1585.method211((byte) 9, 130, 1);
					}
					if (this.field1225 == 11) {
						this.field1587.method211((byte) 9, 173, 0);
					}
					if (this.field1225 == 12) {
						this.field1587.method211((byte) 9, 201, 0);
					}
					if (this.field1225 == 13) {
						this.field1586.method211((byte) 9, 229, 0);
					}
				}
				if (this.field1324[8] != -1 && (this.field1253 != 8 || loopCycle % 20 < 10)) {
					this.field1593[7].method211((byte) 9, 74, 2);
				}
				if (this.field1324[9] != -1 && (this.field1253 != 9 || loopCycle % 20 < 10)) {
					this.field1593[8].method211((byte) 9, 102, 3);
				}
				if (this.field1324[10] != -1 && (this.field1253 != 10 || loopCycle % 20 < 10)) {
					this.field1593[9].method211((byte) 9, 137, 4);
				}
				if (this.field1324[11] != -1 && (this.field1253 != 11 || loopCycle % 20 < 10)) {
					this.field1593[10].method211((byte) 9, 174, 2);
				}
				if (this.field1324[12] != -1 && (this.field1253 != 12 || loopCycle % 20 < 10)) {
					this.field1593[11].method211((byte) 9, 201, 2);
				}
				if (this.field1324[13] != -1 && (this.field1253 != 13 || loopCycle % 20 < 10)) {
					this.field1593[12].method211((byte) 9, 226, 2);
				}
			}
			this.field1326.method268(super.graphics, 466, (byte) 55, 496);
			this.field1517.method267(212);
		}
		if (this.field1616) {
			this.field1616 = false;
			this.field1325.method267(212);
			this.field1422.method211((byte) 9, 0, 0);
			this.field1442.method214(55, true, "Public chat", true, 28, 16777215);
			if (this.field1408 == 0) {
				this.field1442.method214(55, true, "On", true, 41, 65280);
			}
			if (this.field1408 == 1) {
				this.field1442.method214(55, true, "Friends", true, 41, 16776960);
			}
			if (this.field1408 == 2) {
				this.field1442.method214(55, true, "Off", true, 41, 16711680);
			}
			if (this.field1408 == 3) {
				this.field1442.method214(55, true, "Hide", true, 41, 65535);
			}
			this.field1442.method214(184, true, "Private chat", true, 28, 16777215);
			if (this.field1576 == 0) {
				this.field1442.method214(184, true, "On", true, 41, 65280);
			}
			if (this.field1576 == 1) {
				this.field1442.method214(184, true, "Friends", true, 41, 16776960);
			}
			if (this.field1576 == 2) {
				this.field1442.method214(184, true, "Off", true, 41, 16711680);
			}
			this.field1442.method214(324, true, "Trade/duel", true, 28, 16777215);
			if (this.field1275 == 0) {
				this.field1442.method214(324, true, "On", true, 41, 65280);
			}
			if (this.field1275 == 1) {
				this.field1442.method214(324, true, "Friends", true, 41, 16776960);
			}
			if (this.field1275 == 2) {
				this.field1442.method214(324, true, "Off", true, 41, 16711680);
			}
			this.field1442.method214(458, true, "Report abuse", true, 33, 16777215);
			this.field1325.method268(super.graphics, 453, (byte) 55, 0);
			this.field1517.method267(212);
		}
		this.field1488 = 0;
		if (arg0 >= 0) {
			;
		}
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method445(boolean arg0) {
		if (!arg0) {
			this.field1480 = this.field1537.nextInt();
		}
		if (this.field1497 == 0 && this.field1307 == 0) {
			this.field1579[this.field1564] = "Walk here";
			this.field1203[this.field1564] = 660;
			this.field1201[this.field1564] = super.mouseX;
			this.field1202[this.field1564] = super.mouseY;
			this.field1564++;
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
				if (var7 == 2 && this.field1258.method93(this.field1479, var5, var6, var4) >= 0) {
					LocType var9 = LocType.method333(var8);
					if (this.field1497 == 1) {
						this.field1579[this.field1564] = "Use " + this.field1501 + " with @cya@" + var9.name;
						this.field1203[this.field1564] = 450;
						this.field1204[this.field1564] = var4;
						this.field1201[this.field1564] = var5;
						this.field1202[this.field1564] = var6;
						this.field1564++;
					} else if (this.field1307 != 1) {
						if (var9.op != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.op[var10] != null) {
									this.field1579[this.field1564] = var9.op[var10] + " @cya@" + var9.name;
									if (var10 == 0) {
										this.field1203[this.field1564] = 285;
									}
									if (var10 == 1) {
										this.field1203[this.field1564] = 504;
									}
									if (var10 == 2) {
										this.field1203[this.field1564] = 364;
									}
									if (var10 == 3) {
										this.field1203[this.field1564] = 581;
									}
									if (var10 == 4) {
										this.field1203[this.field1564] = 1501;
									}
									this.field1204[this.field1564] = var4;
									this.field1201[this.field1564] = var5;
									this.field1202[this.field1564] = var6;
									this.field1564++;
								}
							}
						}
						this.field1579[this.field1564] = "Examine @cya@" + var9.name;
						this.field1203[this.field1564] = 1175;
						this.field1204[this.field1564] = var4;
						this.field1201[this.field1564] = var5;
						this.field1202[this.field1564] = var6;
						this.field1564++;
					} else if ((this.field1309 & 0x4) == 4) {
						this.field1579[this.field1564] = this.field1310 + " @cya@" + var9.name;
						this.field1203[this.field1564] = 55;
						this.field1204[this.field1564] = var4;
						this.field1201[this.field1564] = var5;
						this.field1202[this.field1564] = var6;
						this.field1564++;
					}
				}
				if (var7 == 1) {
					NpcEntity var11 = this.field1438[var8];
					if (var11.field461.size == 1 && (var11.field404 & 0x7F) == 64 && (var11.field405 & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.field1439; var12++) {
							NpcEntity var13 = this.field1438[this.field1440[var12]];
							if (var13 != null && var11 != var13 && var13.field461.size == 1 && var11.field404 == var13.field404 && var11.field405 == var13.field405) {
								this.method511(var6, var5, this.field1440[var12], 682, var13.field461);
							}
						}
					}
					this.method511(var6, var5, var8, 682, var11.field461);
				}
				if (var7 == 0) {
					PlayerEntity var14 = this.field1285[var8];
					if ((var14.field404 & 0x7F) == 64 && (var14.field405 & 0x7F) == 64) {
						for (int var15 = 0; var15 < this.field1439; var15++) {
							NpcEntity var18 = this.field1438[this.field1440[var15]];
							if (var18 != null && var18.field461.size == 1 && var14.field404 == var18.field404 && var14.field405 == var18.field405) {
								this.method511(var6, var5, this.field1440[var15], 682, var18.field461);
							}
						}
						for (int var16 = 0; var16 < this.field1286; var16++) {
							PlayerEntity var17 = this.field1285[this.field1287[var16]];
							if (var17 != null && var14 != var17 && var14.field404 == var17.field404 && var14.field405 == var17.field405) {
								this.method554(this.field1287[var16], var5, -162, var6, var17);
							}
						}
					}
					this.method554(var8, var5, -162, var6, var14);
				}
				if (var7 == 3) {
					LinkList var19 = this.field1432[this.field1479][var5][var6];
					if (var19 != null) {
						for (ObjStackEntity var20 = (ObjStackEntity) var19.tail((byte) 6); var20 != null; var20 = (ObjStackEntity) var19.prev(false)) {
							ObjType var21 = ObjType.get(var20.field500);
							if (this.field1497 == 1) {
								this.field1579[this.field1564] = "Use " + this.field1501 + " with @lre@" + var21.name;
								this.field1203[this.field1564] = 217;
								this.field1204[this.field1564] = var20.field500;
								this.field1201[this.field1564] = var5;
								this.field1202[this.field1564] = var6;
								this.field1564++;
							} else if (this.field1307 != 1) {
								for (int var22 = 4; var22 >= 0; var22--) {
									if (var21.op != null && var21.op[var22] != null) {
										this.field1579[this.field1564] = var21.op[var22] + " @lre@" + var21.name;
										if (var22 == 0) {
											this.field1203[this.field1564] = 224;
										}
										if (var22 == 1) {
											this.field1203[this.field1564] = 993;
										}
										if (var22 == 2) {
											this.field1203[this.field1564] = 99;
										}
										if (var22 == 3) {
											this.field1203[this.field1564] = 746;
										}
										if (var22 == 4) {
											this.field1203[this.field1564] = 877;
										}
										this.field1204[this.field1564] = var20.field500;
										this.field1201[this.field1564] = var5;
										this.field1202[this.field1564] = var6;
										this.field1564++;
									} else if (var22 == 2) {
										this.field1579[this.field1564] = "Take @lre@" + var21.name;
										this.field1203[this.field1564] = 99;
										this.field1204[this.field1564] = var20.field500;
										this.field1201[this.field1564] = var5;
										this.field1202[this.field1564] = var6;
										this.field1564++;
									}
								}
								this.field1579[this.field1564] = "Examine @lre@" + var21.name;
								this.field1203[this.field1564] = 1102;
								this.field1204[this.field1564] = var20.field500;
								this.field1201[this.field1564] = var5;
								this.field1202[this.field1564] = var6;
								this.field1564++;
							} else if ((this.field1309 & 0x1) == 1) {
								this.field1579[this.field1564] = this.field1310 + " @lre@" + var21.name;
								this.field1203[this.field1564] = 965;
								this.field1204[this.field1564] = var20.field500;
								this.field1201[this.field1564] = var5;
								this.field1202[this.field1564] = var6;
								this.field1564++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(BJ)V")
	public final void method446(byte arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.field1359 >= 100) {
			this.method431("Your ignore list is full. Max of 100 hit", "", 0, false);
			return;
		}
		String var4 = JString.method313(true, JString.method310((byte) 88, arg1));
		for (int var5 = 0; var5 < this.field1359; var5++) {
			if (this.field1339[var5] == arg1) {
				this.method431(var4 + " is already on your ignore list", "", 0, false);
				return;
			}
		}
		for (int var6 = 0; var6 < this.field1418; var6++) {
			if (this.field1208[var6] == arg1) {
				this.method431("Please remove " + var4 + " from your friend list first", "", 0, false);
				return;
			}
		}
		this.field1339[this.field1359++] = arg1;
		this.field1221 = true;
		if (arg0 != 57) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		this.field1404.pIsaac(203, this.field1496);
		this.field1404.p8(arg1, this.field1377);
	}

	@ObfuscatedName("client.a(IBILjb;)V")
	public final void method447(int arg0, byte arg1, int arg2, Pix32 arg3) {
		int var5 = arg0 * arg0 + arg2 * arg2;
		if (arg1 != 2) {
			this.field1250 = this.field1537.nextInt();
		}
		if (var5 <= 4225 || var5 >= 90000) {
			this.method553(arg0, false, arg3, arg2);
			return;
		}
		int var6 = this.field1560 + this.field1533 & 0x7FF;
		int var7 = Model.sinTable[var6];
		int var8 = Model.cosTable[var6];
		int var9 = var7 * 256 / (this.field1330 + 256);
		int var10 = var8 * 256 / (this.field1330 + 256);
		int var11 = arg0 * var10 + arg2 * var9 >> 16;
		int var12 = arg2 * var10 - arg0 * var9 >> 16;
		double var13 = Math.atan2((double) var11, (double) var12);
		int var15 = (int) (Math.sin(var13) * 63.0D);
		int var16 = (int) (Math.cos(var13) * 57.0D);
		this.field1552.method203(83 - var16 - 20, (byte) 0, var13, 256, 15, 15, 20, 20, var15 + 94 + 4 - 10);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method448(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.field1508 = "";
				this.field1509 = "Connecting to server...";
				this.drawTitle(this.field1206);
			}
			this.field1274 = new ClientStream(this.openSocket(portOffset + 43594), this, (byte) 11);
			long var4 = JString.method309(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.field1404.pos = 0;
			this.field1404.p1(14);
			this.field1404.p1(var6);
			this.field1274.write(2, true, 0, this.field1404.data);
			for (int var7 = 0; var7 < 8; var7++) {
				this.field1274.read();
			}
			int var8 = this.field1274.read();
			if (var8 == 0) {
				this.field1274.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.field1387 = this.in.g8(this.field1191);
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1387 >> 32), (int) this.field1387 };
				this.field1404.pos = 0;
				this.field1404.p1(10);
				this.field1404.p4(var9[0]);
				this.field1404.p4(var9[1]);
				this.field1404.p4(var9[2]);
				this.field1404.p4(var9[3]);
				this.field1404.p4(signlink.uid);
				this.field1404.pjstr(arg0);
				this.field1404.pjstr(arg1);
				this.field1404.rsaenc(41466, field1608, field1188);
				this.field1521.pos = 0;
				if (arg2) {
					this.field1521.p1(18);
				} else {
					this.field1521.p1(16);
				}
				this.field1521.p1(this.field1404.pos + 36 + 1 + 1);
				this.field1521.p1(244);
				this.field1521.p1(field1401 ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					this.field1521.p4(this.field1291[var10]);
				}
				this.field1521.pdata(this.field1404.pos, 0, 0, this.field1404.data);
				this.field1404.random = new Isaac(var9, this.field1536);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				this.field1537 = new Isaac(var9, this.field1536);
				this.field1274.write(this.field1521.pos, true, 0, this.field1521.data);
				var8 = this.field1274.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var19) {
				}
				this.method448(arg0, arg1, arg2);
			} else if (var8 == 2 || var8 == 18 || var8 == 19) {
				this.field1378 = 0;
				if (var8 == 18) {
					this.field1378 = 1;
				}
				if (var8 == 19) {
					this.field1378 = 2;
				}
				InputTracking.setDisabled(this.field1303);
				this.field1402 = 0L;
				this.field1403 = 0;
				this.field1623.length = 0;
				super.hasFocus = true;
				this.field1252 = true;
				this.ingame = true;
				this.field1404.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.field1380 = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.psize = 0;
				this.field1245 = 0;
				this.field1592 = 0;
				this.field1247 = 0;
				this.field1581 = 0;
				this.field1264 = 0;
				this.field1564 = 0;
				this.field1356 = false;
				super.idleCycles = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					this.field1431[var12] = null;
				}
				this.field1497 = 0;
				this.field1307 = 0;
				this.field1527 = 0;
				this.field1334 = 0;
				this.field1485 = (int) (Math.random() * 100.0D) - 50;
				this.field1266 = (int) (Math.random() * 110.0D) - 55;
				this.field1227 = (int) (Math.random() * 80.0D) - 40;
				this.field1533 = (int) (Math.random() * 120.0D) - 60;
				this.field1330 = (int) (Math.random() * 30.0D) - 20;
				this.field1560 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.field1265 = -1;
				this.field1461 = 0;
				this.field1462 = 0;
				this.field1286 = 0;
				this.field1439 = 0;
				for (int var13 = 0; var13 < this.field1283; var13++) {
					this.field1285[var13] = null;
					this.field1290[var13] = null;
				}
				for (int var14 = 0; var14 < 8192; var14++) {
					this.field1438[var14] = null;
				}
				localPlayer = this.field1285[this.field1284] = new PlayerEntity();
				this.field1573.clear();
				this.field1591.clear();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							this.field1432[var15][var16][var17] = null;
						}
					}
				}
				this.field1190 = new LinkList((byte) 7);
				this.field1418 = 0;
				this.field1565 = -1;
				this.field1396 = -1;
				this.field1273 = -1;
				this.field1567 = -1;
				this.field1229 = -1;
				this.field1613 = false;
				this.field1225 = 3;
				this.field1376 = false;
				this.field1356 = false;
				this.field1626 = false;
				this.field1199 = null;
				this.field1416 = 0;
				this.field1253 = -1;
				this.field1570 = true;
				this.method501(0);
				for (int var18 = 0; var18 < 5; var18++) {
					this.field1557[var18] = 0;
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
				this.method467(-437);
			} else if (var8 == 3) {
				this.field1508 = "";
				this.field1509 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.field1508 = "Your account has been disabled.";
				this.field1509 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.field1508 = "Your account is already logged in.";
				this.field1509 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.field1508 = "RuneScape has been updated!";
				this.field1509 = "Please reload this page.";
			} else if (var8 == 7) {
				this.field1508 = "This world is full.";
				this.field1509 = "Please use a different world.";
			} else if (var8 == 8) {
				this.field1508 = "Unable to connect.";
				this.field1509 = "Login server offline.";
			} else if (var8 == 9) {
				this.field1508 = "Login limit exceeded.";
				this.field1509 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.field1508 = "Unable to connect.";
				this.field1509 = "Bad session id.";
			} else if (var8 == 11) {
				this.field1509 = "Login server rejected session.";
				this.field1509 = "Please try again.";
			} else if (var8 == 12) {
				this.field1508 = "You need a members account to login to this world.";
				this.field1509 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.field1508 = "Could not complete login.";
				this.field1509 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.field1508 = "The server is being updated.";
				this.field1509 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.ingame = true;
				this.field1404.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.field1380 = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.psize = 0;
				this.field1245 = 0;
				this.field1592 = 0;
				this.field1564 = 0;
				this.field1356 = false;
				this.field1489 = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.field1508 = "Login attempts exceeded.";
				this.field1509 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.field1508 = "You are standing in a members-only area.";
				this.field1509 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.field1508 = "Invalid loginserver requested";
				this.field1509 = "Please try using a different world.";
			} else {
				this.field1508 = "Unexpected server response";
				this.field1509 = "Please try using a different world.";
			}
		} catch (IOException var20) {
			this.field1508 = "";
			this.field1509 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.l(I)V")
	public final void method449(int arg0) {
		ProjectileEntity var2 = (ProjectileEntity) this.field1573.head();
		if (arg0 != 0) {
			this.field1373 = -391;
		}
		while (var2 != null) {
			if (this.field1479 != var2.field505 || loopCycle > var2.field511) {
				var2.unlink();
			} else if (loopCycle >= var2.field510) {
				if (var2.field514 > 0) {
					NpcEntity var3 = this.field1438[var2.field514 - 1];
					if (var3 != null && var3.field404 >= 0 && var3.field404 < 13312 && var3.field405 >= 0 && var3.field405 < 13312) {
						var2.method132(var3.field405, (byte) -12, this.method473(false, var3.field405, var2.field505, var3.field404) - var2.field509, var3.field404, loopCycle);
					}
				}
				if (var2.field514 < 0) {
					int var4 = -var2.field514 - 1;
					PlayerEntity var5;
					if (this.field1397 == var4) {
						var5 = localPlayer;
					} else {
						var5 = this.field1285[var4];
					}
					if (var5 != null && var5.field404 >= 0 && var5.field404 < 13312 && var5.field405 >= 0 && var5.field405 < 13312) {
						var2.method132(var5.field405, (byte) -12, this.method473(false, var5.field405, var2.field505, var5.field404) - var2.field509, var5.field404, loopCycle);
					}
				}
				var2.method133(-847, this.field1488);
				this.field1258.method74(60, false, (int) var2.field518, var2.field524, (int) var2.field517, var2, (int) var2.field516, false, -1, this.field1479);
			}
			var2 = (ProjectileEntity) this.field1573.next(-976);
		}
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method450(boolean arg0) {
		this.field1404.pIsaac(187, this.field1496);
		if (this.field1567 != -1) {
			this.field1567 = -1;
			this.field1221 = true;
			this.field1613 = false;
			this.field1384 = true;
		}
		if (this.field1396 != -1) {
			this.field1396 = -1;
			this.field1236 = true;
			this.field1613 = false;
		}
		this.field1273 = -1;
		this.ingame &= arg0;
	}

	@ObfuscatedName("client.m(I)V")
	public final void method451(int arg0) {
		if (this.field1261 != 0) {
			return;
		}
		this.field1579[0] = "Cancel";
		this.field1203[0] = 1252;
		this.field1564 = 1;
		if (arg0 >= 0) {
			return;
		}
		this.method550(this.field1539);
		this.field1296 = 0;
		if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
			if (this.field1273 == -1) {
				this.method445(this.field1412);
			} else {
				this.method523(super.mouseX, 4, super.mouseY, 7, 4, Component.types[this.field1273], 0);
			}
		}
		if (this.field1541 != this.field1296) {
			this.field1541 = this.field1296;
		}
		this.field1296 = 0;
		if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
			if (this.field1567 != -1) {
				this.method523(super.mouseX, 205, super.mouseY, 7, 553, Component.types[this.field1567], 0);
			} else if (this.field1324[this.field1225] != -1) {
				this.method523(super.mouseX, 205, super.mouseY, 7, 553, Component.types[this.field1324[this.field1225]], 0);
			}
		}
		if (this.field1618 != this.field1296) {
			this.field1221 = true;
			this.field1618 = this.field1296;
		}
		this.field1296 = 0;
		if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 426 && super.mouseY < 453) {
			if (this.field1396 != -1) {
				this.method523(super.mouseX, 357, super.mouseY, 7, 17, Component.types[this.field1396], 0);
			} else if (super.mouseY < 434) {
				this.method533(false, super.mouseX - 17, super.mouseY - 357);
			}
		}
		if (this.field1396 != -1 && this.field1490 != this.field1296) {
			this.field1236 = true;
			this.field1490 = this.field1296;
		}
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < this.field1564 - 1; var3++) {
				if (this.field1203[var3] < 1000 && this.field1203[var3 + 1] > 1000) {
					String var4 = this.field1579[var3];
					this.field1579[var3] = this.field1579[var3 + 1];
					this.field1579[var3 + 1] = var4;
					int var5 = this.field1203[var3];
					this.field1203[var3] = this.field1203[var3 + 1];
					this.field1203[var3 + 1] = var5;
					int var6 = this.field1201[var3];
					this.field1201[var3] = this.field1201[var3 + 1];
					this.field1201[var3 + 1] = var6;
					int var7 = this.field1202[var3];
					this.field1202[var3] = this.field1202[var3 + 1];
					this.field1202[var3 + 1] = var7;
					int var8 = this.field1204[var3];
					this.field1204[var3] = this.field1204[var3 + 1];
					this.field1204[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.a(BLob;)V")
	public final void method452(byte arg0, LocSpawned arg1) {
		if (this.field1605 != arg0) {
			this.field1404.p1(139);
		}
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (arg1.field737 == 0) {
			var3 = this.field1258.method89(arg1.field736, arg1.field738, arg1.field739);
		}
		if (arg1.field737 == 1) {
			var3 = this.field1258.method90(arg1.field739, 0, arg1.field736, arg1.field738);
		}
		if (arg1.field737 == 2) {
			var3 = this.field1258.method91(arg1.field736, arg1.field738, arg1.field739);
		}
		if (arg1.field737 == 3) {
			var3 = this.field1258.method92(arg1.field736, arg1.field738, arg1.field739);
		}
		if (var3 != 0) {
			int var7 = this.field1258.method93(arg1.field736, arg1.field738, arg1.field739, var3);
			var4 = var3 >> 14 & 0x7FFF;
			var5 = var7 & 0x1F;
			var6 = var7 >> 6;
		}
		arg1.field740 = var4;
		arg1.field742 = var5;
		arg1.field741 = var6;
	}

	public final void run() {
		if (this.field1621) {
			this.method556(-7);
		} else {
			super.run();
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 244);
			if (arg0.length == 5) {
				field1398 = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method483(6);
				} else if (arg0[2].equals("highmem")) {
					method488((byte) 110);
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					field1400 = false;
				} else if (arg0[3].equals("members")) {
					field1400 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.initApplication(370, 503, 765);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public final void method453(int arg0, boolean arg1) {
		for (int var3 = 0; var3 < this.field1439; var3++) {
			NpcEntity var4 = this.field1438[this.field1440[var3]];
			int var5 = (this.field1440[var3] << 14) + 536870912;
			if (var4 != null && var4.method126(this.field1520) && var4.field461.alwaysontop == arg1) {
				int var6 = var4.field404 >> 7;
				int var7 = var4.field405 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field408 == 1 && (var4.field404 & 0x7F) == 64 && (var4.field405 & 0x7F) == 64) {
						if (this.field1200[var6][var7] == this.field1580) {
							continue;
						}
						this.field1200[var6][var7] = this.field1580;
					}
					this.field1258.method74((var4.field408 - 1) * 64 + 60, var4.field407, this.method473(false, var4.field405, this.field1479, var4.field404), var4.field406, var4.field405, var4, var4.field404, false, var5, this.field1479);
				}
			}
		}
		if (arg0 <= 0) {
			field1195 = this.field1537.nextInt();
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void method454(byte arg0) {
		if (this.field1346 == 0) {
			return;
		}
		PixFont var2 = this.field1442;
		if (arg0 != 0) {
			this.field1434 = this.field1537.nextInt();
		}
		int var3 = 0;
		if (this.field1592 != 0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < 100; var4++) {
			if (this.field1431[var4] != null) {
				int var5 = this.field1429[var4];
				String var6 = this.field1430[var4];
				byte var7 = 0;
				if (var6 != null && var6.startsWith("@cr1@")) {
					var6 = var6.substring(5);
					var7 = 1;
				}
				if (var6 != null && var6.startsWith("@cr2@")) {
					var6 = var6.substring(5);
					var7 = 2;
				}
				if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var6, (byte) 1))) {
					int var8 = 329 - var3 * 13;
					byte var9 = 4;
					var2.method216("From", 0, (byte) 8, var8, var9);
					var2.method216("From", 65535, (byte) 8, var8 - 1, var9);
					int var10 = var9 + var2.method215("From ", (byte) 4);
					if (var7 == 1) {
						this.field1332[0].method211((byte) 9, var10, var8 - 12);
						var10 += 14;
					}
					if (var7 == 2) {
						this.field1332[1].method211((byte) 9, var10, var8 - 12);
						var10 += 14;
					}
					var2.method216(var6 + ": " + this.field1431[var4], 0, (byte) 8, var8, var10);
					var2.method216(var6 + ": " + this.field1431[var4], 65535, (byte) 8, var8 - 1, var10);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 5 && this.field1576 < 2) {
					int var11 = 329 - var3 * 13;
					var2.method216(this.field1431[var4], 0, (byte) 8, var11, 4);
					var2.method216(this.field1431[var4], 65535, (byte) 8, var11 - 1, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
				if (var5 == 6 && this.field1576 < 2) {
					int var12 = 329 - var3 * 13;
					var2.method216("To " + var6 + ": " + this.field1431[var4], 0, (byte) 8, var12, 4);
					var2.method216("To " + var6 + ": " + this.field1431[var4], 65535, (byte) 8, var12 - 1, 4);
					var3++;
					if (var3 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.c(B)V")
	public final void method455(byte arg0) {
		if (arg0 == 9) {
			boolean var2 = false;
		} else {
			field1282 = !field1282;
		}
		if (this.field1564 < 2 && this.field1497 == 0 && this.field1307 == 0) {
			return;
		}
		String var3;
		if (this.field1497 == 1 && this.field1564 < 2) {
			var3 = "Use " + this.field1501 + " with...";
		} else if (this.field1307 == 1 && this.field1564 < 2) {
			var3 = this.field1310 + "...";
		} else {
			var3 = this.field1579[this.field1564 - 1];
		}
		if (this.field1564 > 2) {
			var3 = var3 + "@whi@ / " + (this.field1564 - 2) + " more options";
		}
		this.field1443.method219(true, loopCycle / 1000, 4, 15, 7019, 16777215, var3);
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method456(boolean arg0) {
		this.field1516.method267(212);
		int var2 = this.field1560 + this.field1533 & 0x7FF;
		int var3 = localPlayer.field404 / 32 + 48;
		if (arg0) {
			this.field1404.p1(242);
		}
		int var4 = 464 - localPlayer.field405 / 32;
		this.field1463.method202(25, var4, 146, this.field1330 + 256, 5, var2, this.field1538, this.field1207, this.field1505, var3, 151);
		this.field1478.method202(0, 25, 33, 256, 0, this.field1560, this.field1538, this.field1607, this.field1427, 25, 33);
		for (int var5 = 0; var5 < this.field1210; var5++) {
			int var33 = this.field1211[var5] * 4 + 2 - localPlayer.field404 / 32;
			int var34 = this.field1212[var5] * 4 + 2 - localPlayer.field405 / 32;
			this.method553(var33, false, this.field1448[var5], var34);
		}
		for (int var6 = 0; var6 < 104; var6++) {
			for (int var29 = 0; var29 < 104; var29++) {
				LinkList var30 = this.field1432[this.field1479][var6][var29];
				if (var30 != null) {
					int var31 = var6 * 4 + 2 - localPlayer.field404 / 32;
					int var32 = var29 * 4 + 2 - localPlayer.field405 / 32;
					this.method553(var31, false, this.field1491, var32);
				}
			}
		}
		for (int var7 = 0; var7 < this.field1439; var7++) {
			NpcEntity var26 = this.field1438[this.field1440[var7]];
			if (var26 != null && var26.method126(this.field1520) && var26.field461.minimap) {
				int var27 = var26.field404 / 32 - localPlayer.field404 / 32;
				int var28 = var26.field405 / 32 - localPlayer.field405 / 32;
				this.method553(var27, false, this.field1492, var28);
			}
		}
		for (int var8 = 0; var8 < this.field1286; var8++) {
			PlayerEntity var19 = this.field1285[this.field1287[var8]];
			if (var19 != null && var19.method126(this.field1520)) {
				int var20 = var19.field404 / 32 - localPlayer.field404 / 32;
				int var21 = var19.field405 / 32 - localPlayer.field405 / 32;
				boolean var22 = false;
				long var23 = JString.method309(var19.field465);
				for (int var25 = 0; var25 < this.field1418; var25++) {
					if (this.field1208[var25] == var23 && this.field1470[var25] != 0) {
						var22 = true;
						break;
					}
				}
				if (var22) {
					this.method553(var20, false, this.field1494, var21);
				} else {
					this.method553(var20, false, this.field1493, var21);
				}
			}
		}
		if (this.field1581 != 0 && loopCycle % 20 < 10) {
			if (this.field1581 == 1 && this.field1277 >= 0 && this.field1277 < this.field1438.length) {
				NpcEntity var9 = this.field1438[this.field1277];
				if (var9 != null) {
					int var10 = var9.field404 / 32 - localPlayer.field404 / 32;
					int var11 = var9.field405 / 32 - localPlayer.field405 / 32;
					this.method447(var10, (byte) 2, var11, this.field1474);
				}
			}
			if (this.field1581 == 2) {
				int var12 = (this.field1347 - this.sceneBaseTileX) * 4 + 2 - localPlayer.field404 / 32;
				int var13 = (this.field1348 - this.sceneBaseTileZ) * 4 + 2 - localPlayer.field405 / 32;
				this.method447(var12, (byte) 2, var13, this.field1474);
			}
			if (this.field1581 == 10 && this.field1415 >= 0 && this.field1415 < this.field1285.length) {
				PlayerEntity var14 = this.field1285[this.field1415];
				if (var14 != null) {
					int var15 = var14.field404 / 32 - localPlayer.field404 / 32;
					int var16 = var14.field405 / 32 - localPlayer.field405 / 32;
					this.method447(var15, (byte) 2, var16, this.field1474);
				}
			}
		}
		if (this.field1461 != 0) {
			int var17 = this.field1461 * 4 + 2 - localPlayer.field404 / 32;
			int var18 = this.field1462 * 4 + 2 - localPlayer.field405 / 32;
			this.method553(var17, false, this.field1473, var18);
		}
		Pix2D.method169(0, 16777215, 3, 3, 97, 78);
		this.field1517.method267(212);
	}

	@ObfuscatedName("client.a(ILjava/lang/String;ILjava/lang/String;II)Lyb;")
	public final Jagfile method457(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
		byte[] var7 = null;
		this.psize += arg5;
		int var8 = 5;
		try {
			if (this.fileStreams[0] != null) {
				var7 = this.fileStreams[0].method300(168, arg2);
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
			return new Jagfile((byte) 5, var7);
		}
		int var11 = 0;
		while (var7 == null) {
			this.drawProgress(7, arg4, "Requesting " + arg3);
			Object var12 = null;
			try {
				int var13 = 0;
				DataInputStream var14 = this.method506(arg1 + arg0);
				byte[] var15 = new byte[6];
				var14.readFully(var15, 0, 6);
				Packet var16 = new Packet((byte) -109, var15);
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
						this.drawProgress(7, arg4, "Loading " + arg3 + " - " + var22 + "%");
					}
					var13 = var22;
				}
				var14.close();
				try {
					if (this.fileStreams[0] != null) {
						this.fileStreams[0].write(var7, arg2, true, var7.length);
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
						this.drawProgress(7, arg4, "Game updated - please reload page");
						var24 = 10;
					} else {
						this.drawProgress(7, arg4, "Error loading - Will retry in " + var24 + " secs.");
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
		return new Jagfile((byte) 5, var7);
	}

	@ObfuscatedName("client.a()V")
	public final void load() {
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (field1609) {
			this.errorStarted = true;
			return;
		}
		field1609 = true;
		boolean var1 = false;
		String var2 = this.method531(false);
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
				this.fileStreams[var3] = new FileStream(var3 + 1, signlink.cache_idx[var3], signlink.cache_dat, true, 500000);
			}
		}
		try {
			int var4 = 5;
			this.field1291[8] = 0;
			while (this.field1291[8] == 0) {
				this.drawProgress(7, 20, "Connecting to web server");
				try {
					DataInputStream var5 = this.method506("crc" + (int) (Math.random() * 9.9999999E7D));
					Packet var6 = new Packet((byte) -109, new byte[36]);
					var5.readFully(var6.data, 0, 36);
					for (int var7 = 0; var7 < 9; var7++) {
						this.field1291[var7] = var6.g4();
					}
					var5.close();
				} catch (IOException var80) {
					for (int var8 = var4; var8 > 0; var8--) {
						this.drawProgress(7, 10, "Error loading - Will retry in " + var8 + " secs.");
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
			this.field1390 = this.method457(this.field1291[1], "title", 1, "title screen", 25, field1195);
			this.field1441 = new PixFont(this.field1390, "p11", 0);
			this.field1442 = new PixFont(this.field1390, "p12", 0);
			this.field1443 = new PixFont(this.field1390, "b12", 0);
			this.field1444 = new PixFont(this.field1390, "q8", 0);
			this.method435(true);
			this.method495(field1374);
			Jagfile var9 = this.method457(this.field1291[2], "config", 2, "config", 30, field1195);
			Jagfile var10 = this.method457(this.field1291[3], "interface", 3, "interface", 35, field1195);
			Jagfile var11 = this.method457(this.field1291[4], "media", 4, "2d graphics", 40, field1195);
			Jagfile var12 = this.method457(this.field1291[6], "textures", 6, "textures", 45, field1195);
			Jagfile var13 = this.method457(this.field1291[7], "wordenc", 7, "chat system", 50, field1195);
			Jagfile var14 = this.method457(this.field1291[8], "sounds", 8, "sound effects", 55, field1195);
			this.field1281 = new byte[4][104][104];
			this.field1409 = new int[4][105][105];
			this.field1258 = new World3D(104, this.field1409, 104, 4, true);
			for (int var15 = 0; var15 < 4; var15++) {
				this.field1554[var15] = new CollisionMap(104, false, 104);
			}
			this.field1463 = new Pix32(512, 512);
			Jagfile var16 = this.method457(this.field1291[5], "versionlist", 5, "update list", 60, field1195);
			this.drawProgress(7, 60, "Connecting to update server");
			this.onDemand = new OnDemand();
			this.onDemand.unpack(var16, this);
			AnimFrame.init(this.onDemand.getAnimCount((byte) 4));
			Model.init(this.onDemand.getFileCount(0, 0), this.onDemand);
			if (!field1401) {
				this.field1568 = 0;
				this.field1569 = false;
				this.onDemand.request(2, this.field1568);
				while (this.onDemand.remaining() > 0) {
					this.method460((byte) 71);
					try {
						Thread.sleep(100L);
					} catch (Exception var74) {
					}
				}
			}
			this.drawProgress(7, 65, "Requesting animations");
			int var17 = this.onDemand.getFileCount(1, 0);
			for (int var18 = 0; var18 < var17; var18++) {
				this.onDemand.request(1, var18);
			}
			while (this.onDemand.remaining() > 0) {
				int var19 = var17 - this.onDemand.remaining();
				if (var19 > 0) {
					this.drawProgress(7, 65, "Loading animations - " + var19 * 100 / var17 + "%");
				}
				this.method460((byte) 71);
				try {
					Thread.sleep(100L);
				} catch (Exception var73) {
				}
			}
			this.drawProgress(7, 70, "Requesting models");
			int var20 = this.onDemand.getFileCount(0, 0);
			for (int var21 = 0; var21 < var20; var21++) {
				int var22 = this.onDemand.getModelFlags(-250, var21);
				if ((var22 & 0x1) != 0) {
					this.onDemand.request(0, var21);
				}
			}
			int var23 = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int var24 = var23 - this.onDemand.remaining();
				if (var24 > 0) {
					this.drawProgress(7, 70, "Loading models - " + var24 * 100 / var23 + "%");
				}
				this.method460((byte) 71);
				try {
					Thread.sleep(100L);
				} catch (Exception var72) {
				}
			}
			if (this.fileStreams[0] != null) {
				this.drawProgress(7, 75, "Requesting maps");
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 1, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 1, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 1, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 1, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 1, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 0, field1543));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 1, field1543));
				int var25 = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int var26 = var25 - this.onDemand.remaining();
					if (var26 > 0) {
						this.drawProgress(7, 75, "Loading maps - " + var26 * 100 / var25 + "%");
					}
					this.method460((byte) 71);
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
				}
			}
			int var27 = this.onDemand.getFileCount(0, 0);
			for (int var28 = 0; var28 < var27; var28++) {
				int var29 = this.onDemand.getModelFlags(-250, var28);
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
					this.onDemand.prefetch(0, false, var28, var30);
				}
			}
			this.onDemand.prefetchMaps(field1400, 0);
			if (!field1401) {
				int var31 = this.onDemand.getFileCount(2, 0);
				for (int var32 = 1; var32 < var31; var32++) {
					if (this.onDemand.shouldPrefetchMidi(var32, -23943)) {
						this.onDemand.prefetch(2, false, var32, (byte) 1);
					}
				}
			}
			this.drawProgress(7, 80, "Unpacking media");
			this.field1445 = new Pix8(var11, "invback", 0);
			this.field1447 = new Pix8(var11, "chatback", 0);
			this.field1446 = new Pix8(var11, "mapback", 0);
			this.field1422 = new Pix8(var11, "backbase1", 0);
			this.field1423 = new Pix8(var11, "backbase2", 0);
			this.field1424 = new Pix8(var11, "backhmid1", 0);
			for (int var33 = 0; var33 < 13; var33++) {
				this.field1593[var33] = new Pix8(var11, "sideicons", var33);
			}
			this.field1478 = new Pix32(var11, "compass", 0);
			this.field1552 = new Pix32(var11, "mapedge", 0);
			this.field1552.method195(false);
			try {
				for (int var34 = 0; var34 < 50; var34++) {
					this.field1574[var34] = new Pix8(var11, "mapscene", var34);
				}
			} catch (Exception var79) {
			}
			try {
				for (int var35 = 0; var35 < 50; var35++) {
					this.field1566[var35] = new Pix32(var11, "mapfunction", var35);
				}
			} catch (Exception var78) {
			}
			try {
				for (int var36 = 0; var36 < 20; var36++) {
					this.field1514[var36] = new Pix32(var11, "hitmarks", var36);
				}
			} catch (Exception var77) {
			}
			try {
				for (int var37 = 0; var37 < 20; var37++) {
					this.field1389[var37] = new Pix32(var11, "headicons", var37);
				}
			} catch (Exception var76) {
			}
			this.field1473 = new Pix32(var11, "mapmarker", 0);
			this.field1474 = new Pix32(var11, "mapmarker", 1);
			for (int var38 = 0; var38 < 8; var38++) {
				this.field1599[var38] = new Pix32(var11, "cross", var38);
			}
			this.field1491 = new Pix32(var11, "mapdots", 0);
			this.field1492 = new Pix32(var11, "mapdots", 1);
			this.field1493 = new Pix32(var11, "mapdots", 2);
			this.field1494 = new Pix32(var11, "mapdots", 3);
			this.field1197 = new Pix8(var11, "scrollbar", 0);
			this.field1198 = new Pix8(var11, "scrollbar", 1);
			this.field1391 = new Pix8(var11, "redstone1", 0);
			this.field1392 = new Pix8(var11, "redstone2", 0);
			this.field1393 = new Pix8(var11, "redstone3", 0);
			this.field1394 = new Pix8(var11, "redstone1", 0);
			this.field1394.method208(4);
			this.field1395 = new Pix8(var11, "redstone2", 0);
			this.field1395.method208(4);
			this.field1583 = new Pix8(var11, "redstone1", 0);
			this.field1583.method209(35546);
			this.field1584 = new Pix8(var11, "redstone2", 0);
			this.field1584.method209(35546);
			this.field1585 = new Pix8(var11, "redstone3", 0);
			this.field1585.method209(35546);
			this.field1586 = new Pix8(var11, "redstone1", 0);
			this.field1586.method208(4);
			this.field1586.method209(35546);
			this.field1587 = new Pix8(var11, "redstone2", 0);
			this.field1587.method208(4);
			this.field1587.method209(35546);
			for (int var39 = 0; var39 < 2; var39++) {
				this.field1332[var39] = new Pix8(var11, "mod_icons", var39);
			}
			Pix32 var40 = new Pix32(var11, "backleft1", 0);
			this.field1313 = new PixMap(this.getBaseComponent(3), var40.field672, var40.field671, 2);
			var40.method196(0, 0, 7);
			Pix32 var41 = new Pix32(var11, "backleft2", 0);
			this.field1314 = new PixMap(this.getBaseComponent(3), var41.field672, var41.field671, 2);
			var41.method196(0, 0, 7);
			Pix32 var42 = new Pix32(var11, "backright1", 0);
			this.field1315 = new PixMap(this.getBaseComponent(3), var42.field672, var42.field671, 2);
			var42.method196(0, 0, 7);
			Pix32 var43 = new Pix32(var11, "backright2", 0);
			this.field1316 = new PixMap(this.getBaseComponent(3), var43.field672, var43.field671, 2);
			var43.method196(0, 0, 7);
			Pix32 var44 = new Pix32(var11, "backtop1", 0);
			this.field1317 = new PixMap(this.getBaseComponent(3), var44.field672, var44.field671, 2);
			var44.method196(0, 0, 7);
			Pix32 var45 = new Pix32(var11, "backvmid1", 0);
			this.field1318 = new PixMap(this.getBaseComponent(3), var45.field672, var45.field671, 2);
			var45.method196(0, 0, 7);
			Pix32 var46 = new Pix32(var11, "backvmid2", 0);
			this.field1319 = new PixMap(this.getBaseComponent(3), var46.field672, var46.field671, 2);
			var46.method196(0, 0, 7);
			Pix32 var47 = new Pix32(var11, "backvmid3", 0);
			this.field1320 = new PixMap(this.getBaseComponent(3), var47.field672, var47.field671, 2);
			var47.method196(0, 0, 7);
			Pix32 var48 = new Pix32(var11, "backhmid2", 0);
			this.field1321 = new PixMap(this.getBaseComponent(3), var48.field672, var48.field671, 2);
			var48.method196(0, 0, 7);
			int var49 = (int) (Math.random() * 21.0D) - 10;
			int var50 = (int) (Math.random() * 21.0D) - 10;
			int var51 = (int) (Math.random() * 21.0D) - 10;
			int var52 = (int) (Math.random() * 41.0D) - 20;
			for (int var53 = 0; var53 < 50; var53++) {
				if (this.field1566[var53] != null) {
					this.field1566[var53].method194(var49 + var52, var51 + var52, 8, var50 + var52);
				}
				if (this.field1574[var53] != null) {
					this.field1574[var53].method210(var49 + var52, var51 + var52, 8, var50 + var52);
				}
			}
			this.drawProgress(7, 83, "Unpacking textures");
			Pix3D.method181(false, var12);
			Pix3D.method185(43504, 0.8D);
			Pix3D.method180(field1545, 20);
			this.drawProgress(7, 86, "Unpacking config");
			SeqType.unpack(var9, (byte) 127);
			LocType.unpack(var9);
			FloType.unpack(var9, (byte) 127);
			ObjType.unpack(var9);
			NpcType.unpack(var9);
			IdkType.unpack(var9, (byte) 127);
			SpotAnimType.unpack(var9, (byte) 127);
			VarpType.unpack(var9, (byte) 127);
			ObjType.membersWorld = field1400;
			if (!field1401) {
				this.drawProgress(7, 90, "Unpacking sounds");
				byte[] var54 = var14.read("sounds.dat", null);
				Packet var55 = new Packet((byte) -109, var54);
				Wave.method321(var55, (byte) 127);
			}
			this.drawProgress(7, 95, "Unpacking interfaces");
			PixFont[] var56 = new PixFont[] { this.field1441, this.field1442, this.field1443, this.field1444 };
			Component.method32(var10, 0, var11, var56);
			this.drawProgress(7, 100, "Preparing game engine");
			for (int var57 = 0; var57 < 33; var57++) {
				int var58 = 999;
				int var59 = 0;
				for (int var60 = 0; var60 < 34; var60++) {
					if (this.field1446.field683[this.field1446.field685 * var57 + var60] == 0) {
						if (var58 == 999) {
							var58 = var60;
						}
					} else if (var58 != 999) {
						var59 = var60;
						break;
					}
				}
				this.field1427[var57] = var58;
				this.field1607[var57] = var59 - var58;
			}
			for (int var61 = 5; var61 < 156; var61++) {
				int var62 = 999;
				int var63 = 0;
				for (int var64 = 25; var64 < 172; var64++) {
					if (this.field1446.field683[this.field1446.field685 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
						if (var62 == 999) {
							var62 = var64;
						}
					} else if (var62 != 999) {
						var63 = var64;
						break;
					}
				}
				this.field1505[var61 - 5] = var62 - 25;
				this.field1207[var61 - 5] = var63 - var62;
			}
			Pix3D.method178(-130, 96, 479);
			this.field1353 = Pix3D.field653;
			Pix3D.method178(-130, 261, 190);
			this.field1354 = Pix3D.field653;
			Pix3D.method178(-130, 334, 512);
			this.field1355 = Pix3D.field653;
			int[] var65 = new int[9];
			for (int var66 = 0; var66 < 9; var66++) {
				int var67 = var66 * 32 + 128 + 15;
				int var68 = var67 * 3 + 600;
				int var69 = Pix3D.sinTable[var67];
				var65[var66] = var68 * var69 >> 16;
			}
			World3D.method99(800, 334, (byte) 1, 500, 512, var65);
			WordFilter.method389(var13);
			this.field1623 = new MouseTracking(this, -74);
		} catch (Exception var81) {
			signlink.reporterror("loaderror " + this.field1624 + " " + this.field1617);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method458(int arg0, Packet arg1, int arg2) {
		arg1.bits(30730);
		int var4 = arg1.gBit(9, 1);
		if (var4 == 0) {
			return;
		}
		int var5 = arg1.gBit(9, 2);
		int var6 = 30 / arg2;
		if (var5 == 0) {
			this.field1289[this.field1288++] = this.field1284;
		} else if (var5 == 1) {
			int var7 = arg1.gBit(9, 3);
			localPlayer.method124(var7, false, this.field1504);
			int var8 = arg1.gBit(9, 1);
			if (var8 == 1) {
				this.field1289[this.field1288++] = this.field1284;
			}
		} else if (var5 == 2) {
			int var9 = arg1.gBit(9, 3);
			localPlayer.method124(var9, true, this.field1504);
			int var10 = arg1.gBit(9, 3);
			localPlayer.method124(var10, true, this.field1504);
			int var11 = arg1.gBit(9, 1);
			if (var11 == 1) {
				this.field1289[this.field1288++] = this.field1284;
			}
		} else if (var5 == 3) {
			this.field1479 = arg1.gBit(9, 2);
			int var12 = arg1.gBit(9, 7);
			int var13 = arg1.gBit(9, 7);
			int var14 = arg1.gBit(9, 1);
			localPlayer.method123(var14 == 1, var12, var13, this.field1523);
			int var15 = arg1.gBit(9, 1);
			if (var15 == 1) {
				this.field1289[this.field1288++] = this.field1284;
			}
		}
	}

	public final void init() {
		field1398 = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method483(6);
		} else {
			method488((byte) 110);
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1400 = false;
		} else {
			field1400 = true;
		}
		this.initApplet((byte) 57, 503, 765);
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method459(int arg0, int arg1) {
		if (arg0 < 5 || arg0 > 5) {
			throw new NullPointerException();
		}
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
	public final void method460(byte arg0) {
		if (arg0 != 71) {
			this.field1191 = -492;
		}
		while (true) {
			OnDemandRequest var2 = this.onDemand.cycle();
			if (var2 == null) {
				return;
			}
			if (var2.archive == 0) {
				Model.unpack(var2.file, false, var2.data);
				if ((this.onDemand.getModelFlags(-250, var2.file) & 0x62) != 0) {
					this.field1221 = true;
					if (this.field1396 != -1) {
						this.field1236 = true;
					}
				}
			}
			if (var2.archive == 1 && var2.data != null) {
				AnimFrame.unpack(300, var2.data);
			}
			if (var2.archive == 2 && this.field1568 == var2.file && var2.data != null) {
				this.method466(this.field1569, var2.data, this.field1417);
			}
			if (var2.archive == 3 && this.field1527 == 1) {
				for (int var3 = 0; var3 < this.field1268.length; var3++) {
					if (this.field1406[var3] == var2.file) {
						this.field1268[var3] = var2.data;
						if (var2.data == null) {
							this.field1406[var3] = -1;
						}
						break;
					}
					if (this.field1407[var3] == var2.file) {
						this.field1311[var3] = var2.data;
						if (var2.data == null) {
							this.field1407[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.archive == 93 && this.onDemand.hasMapLocFile(var2.file, 9)) {
				World.method17(31048, new Packet((byte) -109, var2.data), this.onDemand);
			}
		}
	}

	@ObfuscatedName("client.a(BIII)I")
	public final int method461(byte arg0, int arg1, int arg2, int arg3) {
		int var5 = 256 - arg1;
		if (arg0 != 8) {
			this.field1404.p1(54);
		}
		return ((arg2 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg1 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.n(I)V")
	public final void method462(int arg0) {
		if (arg0 <= 0) {
			return;
		}
		this.field1627 = 0;
		for (int var2 = -1; var2 < this.field1439 + this.field1286; var2++) {
			PathingEntity var17;
			if (var2 == -1) {
				var17 = localPlayer;
			} else if (var2 < this.field1286) {
				var17 = this.field1285[this.field1287[var2]];
			} else {
				var17 = this.field1438[this.field1440[var2 - this.field1286]];
			}
			if (var17 != null && var17.method126(this.field1520)) {
				if (var2 >= this.field1286) {
					NpcType var21 = ((NpcEntity) var17).field461;
					if (var21.headicon >= 0 && var21.headicon < this.field1389.length) {
						this.method479(this.field1433, var17.field450 + 15, var17);
						if (this.field1294 > -1) {
							this.field1389[var21.headicon].method198((byte) 9, this.field1294 - 12, this.field1295 - 30);
						}
					}
					if (this.field1581 == 1 && this.field1440[var2 - this.field1286] == this.field1277 && loopCycle % 20 < 10) {
						this.method479(this.field1433, var17.field450 + 15, var17);
						if (this.field1294 > -1) {
							this.field1389[2].method198((byte) 9, this.field1294 - 12, this.field1295 - 28);
						}
					}
				} else {
					int var18 = 30;
					PlayerEntity var19 = (PlayerEntity) var17;
					if (var19.field468 != 0) {
						this.method479(this.field1433, var17.field450 + 15, var17);
						if (this.field1294 > -1) {
							for (int var20 = 0; var20 < 8; var20++) {
								if ((var19.field468 & 0x1 << var20) != 0) {
									this.field1389[var20].method198((byte) 9, this.field1294 - 12, this.field1295 - var18);
									var18 -= 25;
								}
							}
						}
					}
					if (var2 >= 0 && this.field1581 == 10 && this.field1287[var2] == this.field1415) {
						this.method479(this.field1433, var17.field450 + 15, var17);
						if (this.field1294 > -1) {
							this.field1389[7].method198((byte) 9, this.field1294 - 12, this.field1295 - var18);
						}
					}
				}
				if (var17.field416 != null && (var2 >= this.field1286 || this.field1408 == 0 || this.field1408 == 3 || this.field1408 == 1 && this.method502(((PlayerEntity) var17).field465, (byte) 1))) {
					this.method479(this.field1433, var17.field450, var17);
					if (this.field1294 > -1 && this.field1627 < this.field1628) {
						this.field1632[this.field1627] = this.field1443.method215(var17.field416, (byte) 4) / 2;
						this.field1631[this.field1627] = this.field1443.field704;
						this.field1629[this.field1627] = this.field1294;
						this.field1630[this.field1627] = this.field1295;
						this.field1633[this.field1627] = var17.field418;
						this.field1634[this.field1627] = var17.field419;
						this.field1635[this.field1627] = var17.field417;
						this.field1636[this.field1627++] = var17.field416;
						if (this.field1333 == 0 && var17.field419 == 1) {
							this.field1631[this.field1627] += 10;
							this.field1630[this.field1627] += 5;
						}
						if (this.field1333 == 0 && var17.field419 == 2) {
							this.field1632[this.field1627] = 60;
						}
					}
				}
				if (var17.field423 > loopCycle) {
					this.method479(this.field1433, var17.field450 + 15, var17);
					if (this.field1294 > -1) {
						int var22 = var17.field424 * 30 / var17.field425;
						if (var22 > 30) {
							var22 = 30;
						}
						Pix2D.method169(0, 65280, var22, 5, this.field1294 - 15, this.field1295 - 3);
						Pix2D.method169(0, 16711680, 30 - var22, 5, this.field1294 - 15 + var22, this.field1295 - 3);
					}
				}
				for (int var23 = 0; var23 < 4; var23++) {
					if (var17.field422[var23] > loopCycle) {
						this.method479(this.field1433, var17.field450 / 2, var17);
						if (this.field1294 > -1) {
							if (var23 == 1) {
								this.field1295 -= 20;
							}
							if (var23 == 2) {
								this.field1294 -= 15;
								this.field1295 -= 10;
							}
							if (var23 == 3) {
								this.field1294 += 15;
								this.field1295 -= 10;
							}
							this.field1514[var17.field421[var23]].method198((byte) 9, this.field1294 - 12, this.field1295 - 12);
							this.field1441.method213(this.field1294, 1, 0, String.valueOf(var17.field420[var23]), this.field1295 + 4);
							this.field1441.method213(this.field1294 - 1, 1, 16777215, String.valueOf(var17.field420[var23]), this.field1295 + 3);
						}
					}
				}
			}
		}
		for (int var3 = 0; var3 < this.field1627; var3++) {
			int var4 = this.field1629[var3];
			int var5 = this.field1630[var3];
			int var6 = this.field1632[var3];
			int var7 = this.field1631[var3];
			boolean var8 = true;
			while (var8) {
				var8 = false;
				for (int var16 = 0; var16 < var3; var16++) {
					if (var5 + 2 > this.field1630[var16] - this.field1631[var16] && var5 - var7 < this.field1630[var16] + 2 && var4 - var6 < this.field1632[var16] + this.field1629[var16] && var4 + var6 > this.field1629[var16] - this.field1632[var16] && this.field1630[var16] - this.field1631[var16] < var5) {
						var5 = this.field1630[var16] - this.field1631[var16];
						var8 = true;
					}
				}
			}
			this.field1294 = this.field1629[var3];
			this.field1295 = this.field1630[var3] = var5;
			String var9 = this.field1636[var3];
			if (this.field1333 == 0) {
				int var10 = 16776960;
				if (this.field1633[var3] < 6) {
					var10 = this.field1464[this.field1633[var3]];
				}
				if (this.field1633[var3] == 6) {
					var10 = this.field1580 % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.field1633[var3] == 7) {
					var10 = this.field1580 % 20 < 10 ? 255 : 65535;
				}
				if (this.field1633[var3] == 8) {
					var10 = this.field1580 % 20 < 10 ? 45056 : 8454016;
				}
				if (this.field1633[var3] == 9) {
					int var11 = 150 - this.field1635[var3];
					if (var11 < 50) {
						var10 = var11 * 1280 + 16711680;
					} else if (var11 < 100) {
						var10 = 16776960 - (var11 - 50) * 327680;
					} else if (var11 < 150) {
						var10 = (var11 - 100) * 5 + 65280;
					}
				}
				if (this.field1633[var3] == 10) {
					int var12 = 150 - this.field1635[var3];
					if (var12 < 50) {
						var10 = var12 * 5 + 16711680;
					} else if (var12 < 100) {
						var10 = 16711935 - (var12 - 50) * 327680;
					} else if (var12 < 150) {
						var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
					}
				}
				if (this.field1633[var3] == 11) {
					int var13 = 150 - this.field1635[var3];
					if (var13 < 50) {
						var10 = 16777215 - var13 * 327685;
					} else if (var13 < 100) {
						var10 = (var13 - 50) * 327685 + 65280;
					} else if (var13 < 150) {
						var10 = 16777215 - (var13 - 100) * 327680;
					}
				}
				if (this.field1634[var3] == 0) {
					this.field1443.method213(this.field1294, 1, 0, var9, this.field1295 + 1);
					this.field1443.method213(this.field1294, 1, var10, var9, this.field1295);
				}
				if (this.field1634[var3] == 1) {
					this.field1443.method217(this.field1295 + 1, this.field1580, var9, 29720, this.field1294, 0);
					this.field1443.method217(this.field1295, this.field1580, var9, 29720, this.field1294, var10);
				}
				if (this.field1634[var3] == 2) {
					int var14 = this.field1443.method215(var9, (byte) 4);
					int var15 = (150 - this.field1635[var3]) * (var14 + 100) / 150;
					Pix2D.method166(this.field1294 + 50, 334, this.field1611, 0, this.field1294 - 50);
					this.field1443.method216(var9, 0, (byte) 8, this.field1295 + 1, this.field1294 + 50 - var15);
					this.field1443.method216(var9, var10, (byte) 8, this.field1295, this.field1294 + 50 - var15);
					Pix2D.method165((byte) -115);
				}
			} else {
				this.field1443.method213(this.field1294, 1, 0, var9, this.field1295 + 1);
				this.field1443.method213(this.field1294, 1, 16776960, var9, this.field1295);
			}
		}
	}

	@ObfuscatedName("client.c(II)V")
	public final void method463(int arg0, int arg1) {
		signlink.wavevol = arg0;
		if (arg1 != 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
	}

	@ObfuscatedName("client.e(B)V")
	public final void method464(byte arg0) {
		this.field1515.method267(212);
		if (arg0 != 5) {
			field1543 = this.field1537.nextInt();
		}
		Pix3D.field653 = this.field1354;
		this.field1445.method211((byte) 9, 0, 0);
		if (this.field1567 != -1) {
			this.method544(0, 0, 0, Component.types[this.field1567], 0);
		} else if (this.field1324[this.field1225] != -1) {
			this.method544(0, 0, 0, Component.types[this.field1324[this.field1225]], 0);
		}
		if (this.field1356 && this.field1455 == 1) {
			this.method477((byte) 34);
		}
		this.field1515.method268(super.graphics, 205, (byte) 55, 553);
		this.field1517.method267(212);
		Pix3D.field653 = this.field1355;
	}

	@ObfuscatedName("client.o(I)V")
	public final void method465(int arg0) {
		if (arg0 <= 0) {
			this.field1193 = -475;
		}
		for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1591.head(); var2 != null; var2 = (SpotAnimEntity) this.field1591.next(-976)) {
			if (this.field1479 != var2.field613 || var2.field619) {
				var2.unlink();
			} else if (loopCycle >= var2.field612) {
				var2.method163(this.field1419, this.field1488);
				if (var2.field619) {
					var2.unlink();
				} else {
					this.field1258.method74(60, false, var2.field616, 0, var2.field615, var2, var2.field614, false, -1, var2.field613);
				}
			}
		}
	}

	@ObfuscatedName("client.a(Z[BZ)V")
	public final void method466(boolean arg0, byte[] arg1, boolean arg2) {
		signlink.midifade = arg0 ? 1 : 0;
		signlink.midisave(arg1, arg1.length);
		this.ingame &= arg2;
	}

	@ObfuscatedName("client.p(I)V")
	public final void method467(int arg0) {
		if (this.field1518 != null) {
			return;
		}
		this.unloadTitle(0);
		super.drawArea = null;
		this.field1364 = null;
		this.field1365 = null;
		this.field1366 = null;
		this.field1367 = null;
		this.field1368 = null;
		this.field1369 = null;
		this.field1370 = null;
		this.field1371 = null;
		this.field1372 = null;
		this.field1518 = new PixMap(this.getBaseComponent(3), 96, 479, 2);
		this.field1516 = new PixMap(this.getBaseComponent(3), 156, 172, 2);
		Pix2D.method167(false);
		this.field1446.method211((byte) 9, 0, 0);
		this.field1515 = new PixMap(this.getBaseComponent(3), 261, 190, 2);
		this.field1517 = new PixMap(this.getBaseComponent(3), 334, 512, 2);
		while (arg0 >= 0) {
			this.ptype = -1;
		}
		Pix2D.method167(false);
		this.field1325 = new PixMap(this.getBaseComponent(3), 50, 496, 2);
		this.field1326 = new PixMap(this.getBaseComponent(3), 37, 269, 2);
		this.field1327 = new PixMap(this.getBaseComponent(3), 45, 249, 2);
		this.field1483 = true;
	}

	@ObfuscatedName("client.q(I)V")
	public final void method468(int arg0) {
		int var2 = (localPlayer.field404 >> 7) + this.sceneBaseTileX;
		int var3 = (localPlayer.field405 >> 7) + this.sceneBaseTileZ;
		if (arg0 != -11934) {
			this.ptype = -1;
		}
		if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
			this.field1410 = (var3 - 3520) / 8 + 1;
		} else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
			this.field1410 = (var3 - 9920) / 8 + 1;
		} else {
			this.field1410 = 0;
		}
		this.field1187 = 0;
		if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
			int var4 = var2 & 0x3F;
			int var5 = var3 & 0x3F;
			if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
				this.field1187 = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
				this.field1187 = 1;
			}
			if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
				this.field1187 = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
				this.field1187 = 1;
			}
			if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
				this.field1187 = 1;
			}
			if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
				this.field1187 = 1;
			}
		}
		if (this.field1187 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
			this.field1187 = 2;
		}
		this.field1360 = 0;
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			this.field1360 = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			this.field1360 = 1;
		}
		if (this.field1360 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			this.field1360 = 0;
		}
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method469(int arg0, int arg1, int arg2) {
		if (arg1 != 31733) {
			throw new NullPointerException();
		}
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
	public final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg5 != -21245) {
			this.field1432 = null;
		}
		if (arg1 < 1 || arg6 < 1 || arg1 > 102 || arg6 > 102) {
			return;
		}
		if (field1401 && this.field1479 != arg4) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg7 == 0) {
			var9 = this.field1258.method89(arg4, arg1, arg6);
		}
		if (arg7 == 1) {
			var9 = this.field1258.method90(arg6, 0, arg4, arg1);
		}
		if (arg7 == 2) {
			var9 = this.field1258.method91(arg4, arg1, arg6);
		}
		if (arg7 == 3) {
			var9 = this.field1258.method92(arg4, arg1, arg6);
		}
		if (var9 != 0) {
			int var13 = this.field1258.method93(arg4, arg1, arg6, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg7 == 0) {
				this.field1258.method80(arg1, arg4, arg6, -284);
				LocType var17 = LocType.method333(var14);
				if (var17.blockwalk) {
					this.field1554[arg4].method364(var17.blockrange, arg6, var16, var15, this.field1620, arg1);
				}
			}
			if (arg7 == 1) {
				this.field1258.method81(arg6, (byte) 98, arg1, arg4);
			}
			if (arg7 == 2) {
				this.field1258.method82(arg1, arg6, 1, arg4);
				LocType var18 = LocType.method333(var14);
				if (var18.width + arg1 > 103 || var18.width + arg6 > 103 || var18.length + arg1 > 103 || var18.length + arg6 > 103) {
					return;
				}
				if (var18.blockwalk) {
					this.field1554[arg4].method365(var18.width, arg6, arg1, var18.blockrange, var18.length, true, var16);
				}
			}
			if (arg7 == 3) {
				this.field1258.method83(arg6, arg4, arg1, this.field1272);
				LocType var19 = LocType.method333(var14);
				if (var19.blockwalk && var19.active) {
					this.field1554[arg4].method367(arg6, -625, arg1);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		int var20 = arg4;
		if (arg4 < 3 && (this.field1281[1][arg1][arg6] & 0x2) == 2) {
			var20 = arg4 + 1;
		}
		World.method31(arg1, arg3, arg0, arg6, this.field1258, (byte) 5, arg2, this.field1409, this.field1554[arg4], var20, arg4);
		return;
	}

	@ObfuscatedName("client.d(II)V")
	public final void method471(int arg0, int arg1) {
		Component var3 = Component.types[arg0];
		for (int var4 = 0; var4 < var3.field95.length && var3.field95[var4] != -1; var4++) {
			Component var5 = Component.types[var3.field95[var4]];
			if (var5.field80 == 1) {
				this.method471(var5.field78, 5);
			}
			var5.field76 = 0;
			var5.field77 = 0;
		}
		if (arg1 < 5 || arg1 > 5) {
			this.field1432 = null;
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public final void method472(boolean arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (this.field1418 >= 100 && this.field1255 != 1) {
			this.method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, false);
		} else if (this.field1418 >= 200) {
			this.method431("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0, false);
		} else {
			String var4 = JString.method313(true, JString.method310((byte) 88, arg1));
			for (int var5 = 0; var5 < this.field1418; var5++) {
				if (this.field1208[var5] == arg1) {
					this.method431(var4 + " is already on your friend list", "", 0, false);
					return;
				}
			}
			for (int var6 = 0; var6 < this.field1359; var6++) {
				if (this.field1339[var6] == arg1) {
					this.method431("Please remove " + var4 + " from your ignore list first", "", 0, false);
					return;
				}
			}
			if (!var4.equals(localPlayer.field465)) {
				this.field1556[this.field1418] = var4;
				if (arg0) {
					this.field1208[this.field1418] = arg1;
					this.field1470[this.field1418] = 0;
					this.field1418++;
					this.field1221 = true;
					this.field1404.pIsaac(9, this.field1496);
					this.field1404.p8(arg1, this.field1377);
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIII)I")
	public final int method473(boolean arg0, int arg1, int arg2, int arg3) {
		int var5 = arg3 >> 7;
		int var6 = arg1 >> 7;
		if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
			return 0;
		}
		int var7 = arg2;
		if (arg2 < 3 && (this.field1281[1][var5][var6] & 0x2) == 2) {
			var7 = arg2 + 1;
		}
		int var8 = arg3 & 0x7F;
		int var9 = arg1 & 0x7F;
		int var10 = (128 - var8) * this.field1409[var7][var5][var6] + this.field1409[var7][var5 + 1][var6] * var8 >> 7;
		if (arg0) {
			this.field1404.p1(190);
		}
		int var11 = (128 - var8) * this.field1409[var7][var5][var6 + 1] + this.field1409[var7][var5 + 1][var6 + 1] * var8 >> 7;
		return (128 - var9) * var10 + var9 * var11 >> 7;
	}

	@ObfuscatedName("client.b(ZJ)V")
	public final void method474(boolean arg0, long arg1) {
		if (arg1 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field1359; var4++) {
			if (this.field1339[var4] == arg1) {
				this.field1359--;
				this.field1221 = true;
				for (int var5 = var4; var5 < this.field1359; var5++) {
					this.field1339[var5] = this.field1339[var5 + 1];
				}
				this.field1404.pIsaac(207, this.field1496);
				this.field1404.p8(arg1, this.field1377);
				break;
			}
		}
		if (!arg0) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
	}

	@ObfuscatedName("client.f(B)V")
	public final void method475(byte arg0) {
		this.method454((byte) 0);
		if (this.field1603 == 1) {
			this.field1599[this.field1602 / 100].method198((byte) 9, this.field1600 - 8 - 4, this.field1601 - 8 - 4);
		}
		if (this.field1603 == 2) {
			this.field1599[this.field1602 / 100 + 4].method198((byte) 9, this.field1600 - 8 - 4, this.field1601 - 8 - 4);
		}
		if (this.field1229 != -1) {
			this.method489(this.field1488, 225, this.field1229);
			this.method544(0, 0, 0, Component.types[this.field1229], 0);
		}
		if (this.field1264 > 0) {
			int var2 = 302 - (int) Math.abs(Math.sin((double) this.field1264 / 10.0D) * 10.0D);
			for (int var3 = 0; var3 < 30; var3++) {
				int var4 = (30 - var3) * 16;
				Pix2D.method173(var2 + var3, var4, 629, 16776960, 256 - var4 / 2, this.field1264);
			}
		}
		if (this.field1273 != -1) {
			this.method489(this.field1488, 225, this.field1273);
			this.method544(0, 0, 0, Component.types[this.field1273], 0);
		}
		this.method468(-11934);
		if (arg0 == 1) {
			boolean var5 = false;
		} else {
			field1543 = 182;
		}
		if (!this.field1356) {
			this.method451(-346);
			this.method455((byte) 9);
		} else if (this.field1455 == 0) {
			this.method477((byte) 34);
		}
		if (this.field1416 == 1) {
			if (this.field1410 > 0 || this.field1187 == 1) {
				this.field1389[1].method198((byte) 9, 472, 258);
			} else {
				this.field1389[1].method198((byte) 9, 472, 296);
			}
		}
		if (this.field1410 > 0) {
			this.field1389[0].method198((byte) 9, 472, 296);
			this.field1442.method213(484, 1, 16776960, "Level: " + this.field1410, 329);
		}
		if (this.field1187 == 1) {
			this.field1389[6].method198((byte) 9, 472, 296);
			this.field1442.method213(484, 1, 16776960, "Arena", 329);
		}
		if (this.field1592 == 0) {
			return;
		}
		int var6 = this.field1592 / 50;
		int var7 = var6 / 60;
		int var8 = var6 % 60;
		if (var8 < 10) {
			this.field1442.method216("System update in: " + var7 + ":0" + var8, 16776960, (byte) 8, 329, 4);
		} else {
			this.field1442.method216("System update in: " + var7 + ":" + var8, 16776960, (byte) 8, 329, 4);
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public final void logout(boolean arg0) {
		try {
			if (this.field1274 != null) {
				this.field1274.close();
			}
		} catch (Exception var3) {
		}
		this.field1274 = null;
		if (arg0) {
			this.field1404.p1(159);
		}
		this.ingame = false;
		this.field1414 = 0;
		this.field1577 = "";
		this.field1578 = "";
		InputTracking.setDisabled(this.field1303);
		this.method481(true);
		this.field1258.method63(0);
		for (int var2 = 0; var2 < 4; var2++) {
			this.field1554[var2].reset((byte) 0);
		}
		System.gc();
		this.method503(0);
		this.field1472 = -1;
		this.field1568 = -1;
		this.field1205 = 0;
	}

	@ObfuscatedName("client.g(B)V")
	public final void method477(byte arg0) {
		int var2 = this.field1456;
		int var3 = this.field1457;
		int var4 = this.field1458;
		int var5 = this.field1459;
		int var6 = 6116423;
		Pix2D.method169(0, var6, var4, var5, var2, var3);
		Pix2D.method169(0, 0, var4 - 2, 16, var2 + 1, var3 + 1);
		Pix2D.method170(var5 - 19, var4 - 2, 0, var2 + 1, 901, var3 + 18);
		this.field1443.method216("Choose Option", var6, (byte) 8, var3 + 14, var2 + 3);
		int var7 = super.mouseX;
		int var8 = super.mouseY;
		if (this.field1455 == 0) {
			var7 -= 4;
			var8 -= 4;
		}
		if (this.field1455 == 1) {
			var7 -= 553;
			var8 -= 205;
		}
		if (this.field1455 == 2) {
			var7 -= 17;
			var8 -= 357;
		}
		for (int var9 = 0; var9 < this.field1564; var9++) {
			int var10 = (this.field1564 - 1 - var9) * 15 + var3 + 31;
			int var11 = 16777215;
			if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
				var11 = 16776960;
			}
			this.field1443.method218(var11, var2 + 3, true, false, var10, this.field1579[var9]);
		}
		if (arg0 != 34) {
			this.ptype = -1;
		}
	}

	@ObfuscatedName("client.a(Lmb;IB)V")
	public final void method478(Packet arg0, int arg1, byte arg2) {
		if (arg2 == 7) {
			boolean var4 = false;
		} else {
			this.field1193 = 145;
		}
		for (int var5 = 0; var5 < this.field1288; var5++) {
			int var6 = this.field1289[var5];
			PlayerEntity var7 = this.field1285[var6];
			int var8 = arg0.g1();
			if ((var8 & 0x80) == 128) {
				var8 += arg0.g1() << 8;
			}
			this.method522(var8, arg0, -113, var6, var7);
		}
	}

	@ObfuscatedName("client.a(IILz;)V")
	public final void method479(int arg0, int arg1, PathingEntity arg2) {
		this.method480(3, arg2.field405, arg1, arg2.field404);
		if (arg0 != 0) {
			this.field1419 = this.field1537.nextInt();
		}
	}

	@ObfuscatedName("client.a(IIII)V")
	public final void method480(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 128 || arg1 < 128 || arg3 > 13056 || arg1 > 13056) {
			this.field1294 = -1;
			this.field1295 = -1;
			return;
		}
		int var5 = this.method473(false, arg1, this.field1479, arg3) - arg2;
		int var6 = arg3 - this.field1637;
		int var7 = var5 - this.field1638;
		int var8 = arg1 - this.field1639;
		int var9 = Model.sinTable[this.field1640];
		int var10 = Model.cosTable[this.field1640];
		int var11 = Model.sinTable[this.field1641];
		int var12 = Model.cosTable[this.field1641];
		int var13 = var6 * var12 + var8 * var11 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		int var16 = var7 * var10 - var9 * var14 >> 16;
		int var17 = var7 * var9 + var10 * var14 >> 16;
		if (arg0 < 3 || arg0 > 3) {
			return;
		}
		if (var17 >= 50) {
			this.field1294 = (var13 << 9) / var17 + Pix3D.field647;
			this.field1295 = (var16 << 9) / var17 + Pix3D.field648;
		} else {
			this.field1294 = -1;
			this.field1295 = -1;
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
	public final void method481(boolean arg0) {
		LocType.modelCacheStatic.method116();
		LocType.modelCacheDynamic.method116();
		NpcType.field1019.method116();
		ObjType.field1069.method116();
		ObjType.field1070.method116();
		PlayerEntity.field486.method116();
		SpotAnimType.field1151.method116();
		this.ingame &= arg0;
	}

	@ObfuscatedName("client.r(I)V")
	public final void method482(int arg0) {
		while (arg0 >= 0) {
			field1282 = !field1282;
		}
		for (int var2 = 0; var2 < this.field1334; var2++) {
			if (this.field1413[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.field1186[var2] != this.field1530 || this.field1230[var2] != this.field1251) {
						Packet var4 = Wave.method322(this.field1230[var2], this.field1186[var2], this.field1604);
						if (System.currentTimeMillis() + (long) (var4.pos / 22) > (long) (this.field1328 / 22) + this.field1420) {
							this.field1328 = var4.pos;
							this.field1420 = System.currentTimeMillis();
							if (this.method552((byte) 6, var4.data, var4.pos)) {
								this.field1530 = this.field1186[var2];
								this.field1251 = this.field1230[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!this.method497(this.field1250)) {
						var3 = true;
					}
				} catch (Exception var7) {
				}
				if (var3 && this.field1413[var2] != -5) {
					this.field1413[var2] = -5;
				} else {
					this.field1334--;
					for (int var6 = var2; var6 < this.field1334; var6++) {
						this.field1186[var6] = this.field1186[var6 + 1];
						this.field1230[var6] = this.field1230[var6 + 1];
						this.field1413[var6] = this.field1413[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = this.field1413[var2]--;
			}
		}
		if (this.field1205 <= 0) {
			return;
		}
		this.field1205 -= 20;
		if (this.field1205 < 0) {
			this.field1205 = 0;
		}
		if (this.field1205 == 0 && this.field1460 && !field1401) {
			this.field1568 = this.field1472;
			this.field1569 = false;
			this.onDemand.request(2, this.field1568);
			return;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public static final void method483(int arg0) {
		World3D.field295 = true;
		Pix3D.field642 = true;
		if (arg0 == 6) {
			field1401 = true;
			World.field45 = true;
		}
	}

	@ObfuscatedName("client.b(IILmb;)V")
	public final void method484(int arg0, int arg1, Packet arg2) {
		if (arg0 != 6) {
			return;
		}
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
				this.method500(var102, var105, -1, 30437, var108, var106, var107, var103, this.field1479, 0);
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
				int var12 = this.field1409[this.field1479][var5][var6];
				int var13 = this.field1409[this.field1479][var5 + 1][var6];
				int var14 = this.field1409[this.field1479][var5 + 1][var6 + 1];
				int var15 = this.field1409[this.field1479][var5][var6 + 1];
				if (var10 == 0) {
					Wall var16 = this.field1258.method85(var5, var6, this.field1479, true);
					if (var16 != null) {
						int var17 = var16.field287 >> 14 & 0x7FFF;
						if (var8 == 2) {
							var16.field285 = new LocEntity(var15, var14, var12, true, 2, var9 + 4, false, var13, var17, var11);
							var16.field286 = new LocEntity(var15, var14, var12, true, 2, var9 + 1 & 0x3, false, var13, var17, var11);
						} else {
							var16.field285 = new LocEntity(var15, var14, var12, true, var8, var9, false, var13, var17, var11);
						}
					}
				}
				if (var10 == 1) {
					Decor var18 = this.field1258.method86(var5, this.field1479, -98, var6);
					if (var18 != null) {
						var18.field176 = new LocEntity(var15, var14, var12, true, 4, 0, false, var13, var18.field177 >> 14 & 0x7FFF, var11);
					}
				}
				if (var10 == 2) {
					Location var19 = this.field1258.method87(this.field1479, var6, 0, var5);
					if (var8 == 11) {
						var8 = 10;
					}
					if (var19 != null) {
						var19.field270 = new LocEntity(var15, var14, var12, true, var8, var9, false, var13, var19.field278 >> 14 & 0x7FFF, var11);
					}
				}
				if (var10 == 3) {
					GroundDecor var20 = this.field1258.method88(false, var5, var6, this.field1479);
					if (var20 != null) {
						var20.field209 = new LocEntity(var15, var14, var12, true, 22, var9, false, var13, var20.field210 >> 14 & 0x7FFF, var11);
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
				if (this.field1432[this.field1479][var22][var23] == null) {
					this.field1432[this.field1479][var22][var23] = new LinkList((byte) 7);
				}
				this.field1432[this.field1479][var22][var23].addTail(var26);
				this.method536(var22, var23);
			}
		} else if (arg1 == 39) {
			int var27 = arg2.g1();
			int var28 = (var27 >> 4 & 0x7) + this.field1337;
			int var29 = (var27 & 0x7) + this.field1338;
			int var30 = arg2.g2();
			if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
				LinkList var31 = this.field1432[this.field1479][var28][var29];
				if (var31 != null) {
					for (ObjStackEntity var32 = (ObjStackEntity) var31.head(); var32 != null; var32 = (ObjStackEntity) var31.next(-976)) {
						if ((var30 & 0x7FFF) == var32.field500) {
							var32.unlink();
							break;
						}
					}
					if (var31.head() == null) {
						this.field1432[this.field1479][var28][var29] = null;
					}
					this.method536(var28, var29);
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
				ProjectileEntity var50 = new ProjectileEntity(var46, var39, var44, var41, (byte) -2, this.field1479, var47, this.method473(false, var47, this.field1479, var46) - var40, var45, loopCycle + var42, var38, loopCycle + var43);
				var50.method132(var49, (byte) -12, this.method473(false, var49, this.field1479, var48) - var41, var48, loopCycle + var42);
				this.field1573.addTail(var50);
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
				SpotAnimEntity var59 = new SpotAnimEntity(var58, var57, this.field1479, var54, this.method473(false, var58, this.field1479, var57) - var55, -258, loopCycle, var56);
				this.field1591.addTail(var59);
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
				if (this.field1432[this.field1479][var61][var62] == null) {
					this.field1432[this.field1479][var61][var62] = new LinkList((byte) 7);
				}
				this.field1432[this.field1479][var61][var62].addTail(var66);
				this.method536(var61, var62);
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
					var82 = this.field1285[var77];
				}
				if (var82 != null) {
					LocType var83 = LocType.method333(var74);
					int var84 = this.field1409[this.field1479][var68][var69];
					int var85 = this.field1409[this.field1479][var68 + 1][var69];
					int var86 = this.field1409[this.field1479][var68 + 1][var69 + 1];
					int var87 = this.field1409[this.field1479][var68][var69 + 1];
					Model var88 = var83.method339(var71, var72, var84, var85, var86, var87, -1);
					if (var88 != null) {
						this.method500(var68, 0, var76 + 1, 30437, -1, 0, var73, var69, this.field1479, var75 + 1);
						var82.field474 = loopCycle + var75;
						var82.field475 = loopCycle + var76;
						var82.field479 = var88;
						int var89 = var83.width;
						int var90 = var83.length;
						if (var72 == 1 || var72 == 3) {
							var89 = var83.length;
							var90 = var83.width;
						}
						var82.field476 = var68 * 128 + var89 * 64;
						var82.field478 = var69 * 128 + var90 * 64;
						var82.field477 = this.method473(false, var82.field478, this.field1479, var82.field476);
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
						var82.field480 = var68 + var78;
						var82.field482 = var68 + var80;
						var82.field481 = var69 + var79;
						var82.field483 = var69 + var81;
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
					LinkList var99 = this.field1432[this.field1479][var94][var95];
					if (var99 != null) {
						for (ObjStackEntity var100 = (ObjStackEntity) var99.head(); var100 != null; var100 = (ObjStackEntity) var99.next(-976)) {
							if ((var96 & 0x7FFF) == var100.field500 && var100.field501 == var97) {
								var100.field501 = var98;
								break;
							}
						}
						this.method536(var94, var95);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Lmb;BI)V")
	public final void method485(Packet arg0, byte arg1, int arg2) {
		arg0.bits(30730);
		int var4 = arg0.gBit(9, 8);
		if (var4 < this.field1439) {
			for (int var5 = var4; var5 < this.field1439; var5++) {
				this.field1323[this.field1322++] = this.field1440[var5];
			}
		}
		if (var4 > this.field1439) {
			signlink.reporterror(this.field1577 + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.field1439 = 0;
		if (arg1 != 20) {
			return;
		}
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.field1440[var6];
			NpcEntity var8 = this.field1438[var7];
			int var9 = arg0.gBit(9, 1);
			if (var9 == 0) {
				this.field1440[this.field1439++] = var7;
				var8.field449 = loopCycle;
			} else {
				int var10 = arg0.gBit(9, 2);
				if (var10 == 0) {
					this.field1440[this.field1439++] = var7;
					var8.field449 = loopCycle;
					this.field1289[this.field1288++] = var7;
				} else if (var10 == 1) {
					this.field1440[this.field1439++] = var7;
					var8.field449 = loopCycle;
					int var11 = arg0.gBit(9, 3);
					var8.method124(var11, false, this.field1504);
					int var12 = arg0.gBit(9, 1);
					if (var12 == 1) {
						this.field1289[this.field1288++] = var7;
					}
				} else if (var10 == 2) {
					this.field1440[this.field1439++] = var7;
					var8.field449 = loopCycle;
					int var13 = arg0.gBit(9, 3);
					var8.method124(var13, true, this.field1504);
					int var14 = arg0.gBit(9, 3);
					var8.method124(var14, true, this.field1504);
					int var15 = arg0.gBit(9, 1);
					if (var15 == 1) {
						this.field1289[this.field1288++] = var7;
					}
				} else if (var10 == 3) {
					this.field1323[this.field1322++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public final void method486(int arg0) {
		if (arg0 != 7) {
			return;
		}
		if (localPlayer.field404 >> 7 == this.field1461 && localPlayer.field405 >> 7 == this.field1462) {
			this.field1461 = 0;
		}
		for (int var2 = -1; var2 < this.field1286; var2++) {
			PlayerEntity var3;
			int var4;
			if (var2 == -1) {
				var3 = localPlayer;
				var4 = this.field1284 << 14;
			} else {
				var3 = this.field1285[this.field1287[var2]];
				var4 = this.field1287[var2] << 14;
			}
			if (var3 != null && var3.method126(this.field1520)) {
				var3.field484 = false;
				if ((field1401 && this.field1286 > 50 || this.field1286 > 200) && var2 != -1 && var3.field429 == var3.field409) {
					var3.field484 = true;
				}
				int var5 = var3.field404 >> 7;
				int var6 = var3.field405 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var3.field479 == null || loopCycle < var3.field474 || loopCycle >= var3.field475) {
						if ((var3.field404 & 0x7F) == 64 && (var3.field405 & 0x7F) == 64) {
							if (this.field1200[var5][var6] == this.field1580 && var2 != -1) {
								continue;
							}
							this.field1200[var5][var6] = this.field1580;
						}
						var3.field473 = this.method473(false, var3.field405, this.field1479, var3.field404);
						this.field1258.method74(60, var3.field407, var3.field473, var3.field406, var3.field405, var3, var3.field404, false, var4, this.field1479);
					} else {
						var3.field484 = false;
						var3.field473 = this.method473(false, var3.field405, this.field1479, var3.field404);
						this.field1258.method75(this.field1479, var3, var3.field405, var3.field482, var3.field483, (byte) 7, var3.field473, var3.field406, var3.field404, var3.field480, 60, var4, var3.field481);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.b(IZ)Z")
	public final boolean method487(int arg0, boolean arg1) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = this.field1203[arg0];
		if (!arg1) {
			this.field1426 = !this.field1426;
		}
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 406;
	}

	@ObfuscatedName("client.h(B)V")
	public static final void method488(byte arg0) {
		if (arg0 != 110) {
			field1282 = !field1282;
		}
		World3D.field295 = false;
		Pix3D.field642 = false;
		field1401 = false;
		World.field45 = false;
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method489(int arg0, int arg1, int arg2) {
		if (arg1 <= 0) {
			this.field1432 = null;
		}
		boolean var4 = false;
		Component var5 = Component.types[arg2];
		for (int var6 = 0; var6 < var5.field95.length && var5.field95[var6] != -1; var6++) {
			Component var7 = Component.types[var5.field95[var6]];
			if (var7.field80 == 1) {
				var4 |= this.method489(arg0, 225, var7.field78);
			}
			if (var7.field80 == 6 && (var7.field124 != -1 || var7.field125 != -1)) {
				boolean var8 = this.method516(var7, 551);
				int var9;
				if (var8) {
					var9 = var7.field125;
				} else {
					var9 = var7.field124;
				}
				if (var9 != -1) {
					SeqType var10 = SeqType.types[var9];
					var7.field77 += arg0;
					while (var7.field77 > var10.method382(0, var7.field76)) {
						var7.field77 -= var10.method382(0, var7.field76) + 1;
						var7.field76++;
						if (var7.field76 >= var10.frameCount) {
							var7.field76 -= var10.replayoff;
							if (var7.field76 < 0 || var7.field76 >= var10.frameCount) {
								var7.field76 = 0;
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
	public final void method490(int arg0) {
		for (int var2 = -1; var2 < this.field1286; var2++) {
			int var4;
			if (var2 == -1) {
				var4 = this.field1284;
			} else {
				var4 = this.field1287[var2];
			}
			PlayerEntity var5 = this.field1285[var4];
			if (var5 != null) {
				this.method438(var5, 1, 867);
			}
		}
		field1610++;
		if (arg0 != 20697) {
			field1282 = !field1282;
		}
		if (field1610 <= 1406) {
			return;
		}
		field1610 = 0;
		this.field1404.pIsaac(215, this.field1496);
		this.field1404.p1(0);
		int var3 = this.field1404.pos;
		this.field1404.p1(162);
		this.field1404.p1(22);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1404.p1(84);
		}
		this.field1404.p2(31824);
		this.field1404.p2(13490);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1404.p1(123);
		}
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1404.p1(134);
		}
		this.field1404.p1(100);
		this.field1404.p1(94);
		this.field1404.p2(35521);
		this.field1404.psize1(41372, this.field1404.pos - var3);
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 2048 - arg3 & 0x7FF;
		int var9 = 2048 - arg1 & 0x7FF;
		if (arg0 >= 0) {
			return;
		}
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
		this.field1637 = arg6 - var10;
		this.field1638 = arg2 - var11;
		this.field1639 = arg4 - var12;
		this.field1640 = arg3;
		this.field1641 = arg1;
	}

	@ObfuscatedName("client.a(IILjava/lang/String;)V")
	public final void drawProgress(int arg0, int arg1, String arg2) {
		this.field1617 = arg1;
		this.field1624 = arg2;
		this.method540(true);
		if (this.field1390 == null) {
			super.drawProgress(7, arg1, arg2);
			return;
		}
		this.field1366.method267(212);
		short var4 = 360;
		short var5 = 200;
		byte var6 = 20;
		this.field1443.method213(var4 / 2, 1, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
		int var7 = var5 / 2 - 18 - var6;
		Pix2D.method170(34, 304, 9179409, var4 / 2 - 152, 901, var7);
		Pix2D.method170(32, 302, 0, var4 / 2 - 151, 901, var7 + 1);
		Pix2D.method169(0, 9179409, arg1 * 3, 30, var4 / 2 - 150, var7 + 2);
		Pix2D.method169(0, 0, 300 - arg1 * 3, 30, arg1 * 3 + (var4 / 2 - 150), var7 + 2);
		this.field1443.method213(var4 / 2, 1, 16777215, arg2, var5 / 2 + 5 - var6);
		if (arg0 < 7 || arg0 > 7) {
			this.load();
		}
		this.field1366.method268(super.graphics, 171, (byte) 55, 202);
		if (!this.field1483) {
			return;
		}
		this.field1483 = false;
		if (!this.flameActive) {
			this.field1367.method268(super.graphics, 0, (byte) 55, 0);
			this.field1368.method268(super.graphics, 0, (byte) 55, 637);
		}
		this.field1364.method268(super.graphics, 0, (byte) 55, 128);
		this.field1365.method268(super.graphics, 371, (byte) 55, 202);
		this.field1369.method268(super.graphics, 265, (byte) 55, 0);
		this.field1370.method268(super.graphics, 265, (byte) 55, 562);
		this.field1371.method268(super.graphics, 171, (byte) 55, 128);
		this.field1372.method268(super.graphics, 171, (byte) 55, 562);
	}

	@ObfuscatedName("client.i(B)V")
	public final void method492(byte arg0) {
		this.field1518.method267(212);
		if (this.field1595 != arg0) {
			return;
		}
		Pix3D.field653 = this.field1353;
		this.field1447.method211((byte) 9, 0, 0);
		if (this.field1626) {
			this.field1443.method213(239, 1, 0, this.field1213, 40);
			this.field1443.method213(239, 1, 128, this.field1449 + "*", 60);
		} else if (this.field1376) {
			this.field1443.method213(239, 1, 0, "Enter amount:", 40);
			this.field1443.method213(239, 1, 128, this.field1336 + "*", 60);
		} else if (this.field1199 != null) {
			this.field1443.method213(239, 1, 0, this.field1199, 40);
			this.field1443.method213(239, 1, 128, "Click to continue", 60);
		} else if (this.field1396 != -1) {
			this.method544(0, 0, 0, Component.types[this.field1396], 0);
		} else if (this.field1565 == -1) {
			PixFont var2 = this.field1442;
			int var3 = 0;
			Pix2D.method166(463, 77, this.field1611, 0, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.field1431[var4] != null) {
					int var6 = this.field1429[var4];
					int var7 = 70 - var3 * 14 + this.field1248;
					String var8 = this.field1430[var4];
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
							var2.method216(this.field1431[var4], 0, (byte) 8, var7, 4);
						}
						var3++;
					}
					if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1408 == 0 || this.field1408 == 1 && this.method502(var8, (byte) 1))) {
						if (var7 > 0 && var7 < 110) {
							int var10 = 4;
							if (var9 == 1) {
								this.field1332[0].method211((byte) 9, var10, var7 - 12);
								var10 += 14;
							}
							if (var9 == 2) {
								this.field1332[1].method211((byte) 9, var10, var7 - 12);
								var10 += 14;
							}
							var2.method216(var8 + ":", 0, (byte) 8, var7, var10);
							int var11 = var10 + var2.method215(var8, (byte) 4) + 8;
							var2.method216(this.field1431[var4], 255, (byte) 8, var7, var11);
						}
						var3++;
					}
					if ((var6 == 3 || var6 == 7) && this.field1346 == 0 && (var6 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var8, (byte) 1))) {
						if (var7 > 0 && var7 < 110) {
							byte var12 = 4;
							var2.method216("From", 0, (byte) 8, var7, var12);
							int var13 = var12 + var2.method215("From ", (byte) 4);
							if (var9 == 1) {
								this.field1332[0].method211((byte) 9, var13, var7 - 12);
								var13 += 14;
							}
							if (var9 == 2) {
								this.field1332[1].method211((byte) 9, var13, var7 - 12);
								var13 += 14;
							}
							var2.method216(var8 + ":", 0, (byte) 8, var7, var13);
							int var14 = var13 + var2.method215(var8, (byte) 4) + 8;
							var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, var14);
						}
						var3++;
					}
					if (var6 == 4 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
						if (var7 > 0 && var7 < 110) {
							var2.method216(var8 + " " + this.field1431[var4], 8388736, (byte) 8, var7, 4);
						}
						var3++;
					}
					if (var6 == 5 && this.field1346 == 0 && this.field1576 < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, 4);
						}
						var3++;
					}
					if (var6 == 6 && this.field1346 == 0 && this.field1576 < 2) {
						if (var7 > 0 && var7 < 110) {
							var2.method216("To " + var8 + ":", 0, (byte) 8, var7, 4);
							var2.method216(this.field1431[var4], 8388608, (byte) 8, var7, var2.method215("To " + var8, (byte) 4) + 12);
						}
						var3++;
					}
					if (var6 == 8 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
						if (var7 > 0 && var7 < 110) {
							var2.method216(var8 + " " + this.field1431[var4], 8270336, (byte) 8, var7, 4);
						}
						var3++;
					}
				}
			}
			Pix2D.method165((byte) -115);
			this.field1563 = var3 * 14 + 7;
			if (this.field1563 < 78) {
				this.field1563 = 78;
			}
			this.method551(463, this.field1563, 0, this.field1563 - this.field1248 - 77, (byte) 9, 77);
			String var5;
			if (localPlayer == null || localPlayer.field465 == null) {
				var5 = JString.method313(true, this.field1577);
			} else {
				var5 = localPlayer.field465;
			}
			var2.method216(var5 + ":", 0, (byte) 8, 90, 4);
			var2.method216(this.field1596 + "*", 255, (byte) 8, 90, var2.method215(var5 + ": ", (byte) 4) + 6);
			Pix2D.method172(0, 77, 479, 0, this.field1220);
		} else {
			this.method544(0, 0, 0, Component.types[this.field1565], 0);
		}
		if (this.field1356 && this.field1455 == 2) {
			this.method477((byte) 34);
		}
		this.field1518.method268(super.graphics, 357, (byte) 55, 17);
		this.field1517.method267(212);
		Pix3D.field653 = this.field1355;
	}

	@ObfuscatedName("client.j(B)V")
	public void lag(byte arg0) {
		if (arg0 != 40) {
			return;
		}
		System.out.println("============");
		System.out.println("flame-cycle:" + this.flameCycle);
		if (this.onDemand != null) {
			System.out.println("Od-cycle:" + this.onDemand.cycle);
		}
		System.out.println("loop-cycle:" + loopCycle);
		System.out.println("draw-cycle:" + drawCycle);
		System.out.println("ptype:" + this.ptype);
		System.out.println("psize:" + this.psize);
		if (this.field1274 != null) {
			this.field1274.debug((byte) 40);
		}
		super.debug = true;
	}

	@ObfuscatedName("client.f(I)Ljava/awt/Component;")
	public final java.awt.Component getBaseComponent(int arg0) {
		if (arg0 < 3 || arg0 > 3) {
			this.load();
		}
		if (signlink.mainapp == null) {
			return super.frame == null ? this : super.frame;
		} else {
			return signlink.mainapp;
		}
	}

	@ObfuscatedName("client.v(I)V")
	public final void method494(int arg0) {
		for (int var2 = -1; var2 < this.field1286; var2++) {
			int var6;
			if (var2 == -1) {
				var6 = this.field1284;
			} else {
				var6 = this.field1287[var2];
			}
			PlayerEntity var7 = this.field1285[var6];
			if (var7 != null && var7.field417 > 0) {
				var7.field417--;
				if (var7.field417 == 0) {
					var7.field416 = null;
				}
			}
		}
		for (int var3 = 0; var3 < this.field1439; var3++) {
			int var4 = this.field1440[var3];
			NpcEntity var5 = this.field1438[var4];
			if (var5 != null && var5.field417 > 0) {
				var5.field417--;
				if (var5.field417 == 0) {
					var5.field416 = null;
				}
			}
		}
		if (arg0 < 8 || arg0 > 8) {
			this.ptype = this.in.g1();
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method495(int arg0) {
		if (arg0 != 0) {
			field1282 = !field1282;
		}
		this.imageTitlebox = new Pix8(this.field1390, "titlebox", 0);
		this.imageTitlebutton = new Pix8(this.field1390, "titlebutton", 0);
		this.imageRunes = new Pix8[12];
		for (int var2 = 0; var2 < 12; var2++) {
			this.imageRunes[var2] = new Pix8(this.field1390, "runes", var2);
		}
		this.imageFlamesRight = new Pix32(128, 265);
		this.levelObjStacks = new Pix32(128, 265);
		for (int var3 = 0; var3 < 33920; var3++) {
			this.imageFlamesRight.field670[var3] = this.field1367.field757[var3];
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.levelObjStacks.field670[var4] = this.field1368.field757[var4];
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
		this.method527(null, (byte) 66);
		this.flameBuffer2 = new int[32768];
		this.imageFlamesLeft = new int[32768];
		this.drawProgress(7, 10, "Connecting to fileserver");
		if (!this.flameActive) {
			this.field1621 = true;
			this.flameActive = true;
			this.startThread(this, 2);
		}
	}

	@ObfuscatedName("client.x(I)V")
	public final void method496(int arg0) {
		int var2 = 7 / arg0;
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
		int var5 = this.field1560 + this.field1533 & 0x7FF;
		int var6 = Pix3D.sinTable[var5];
		int var7 = Pix3D.cosTable[var5];
		int var8 = (this.field1330 + 256) * var6 >> 8;
		int var9 = (this.field1330 + 256) * var7 >> 8;
		int var10 = var3 * var9 + var4 * var8 >> 11;
		int var11 = var4 * var9 - var3 * var8 >> 11;
		int var12 = localPlayer.field404 + var10 >> 7;
		int var13 = localPlayer.field405 - var11 >> 7;
		boolean var14 = this.method515(false, 0, localPlayer.routeTileZ[0], 0, 1, true, 0, var12, 0, var13, 0, localPlayer.routeTileX[0]);
		if (!var14) {
			return;
		}
		this.field1404.p1(var3);
		this.field1404.p1(var4);
		this.field1404.p2(this.field1560);
		this.field1404.p1(57);
		this.field1404.p1(this.field1533);
		this.field1404.p1(this.field1330);
		this.field1404.p1(89);
		this.field1404.p2(localPlayer.field404);
		this.field1404.p2(localPlayer.field405);
		this.field1404.p1(this.field1544);
		this.field1404.p1(63);
		return;
	}

	@ObfuscatedName("client.y(I)Z")
	public final boolean method497(int arg0) {
		if (arg0 != 3) {
			this.ptype = -1;
		}
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method498(boolean arg0, Packet arg1, int arg2) {
		if (arg0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		for (int var5 = 0; var5 < this.field1288; var5++) {
			int var6 = this.field1289[var5];
			NpcEntity var7 = this.field1438[var6];
			int var8 = arg1.g1();
			if ((var8 & 0x1) == 1) {
				int var9 = arg1.g1();
				int var10 = arg1.g1();
				var7.method127(var10, 0, var9);
				var7.field423 = loopCycle + 300;
				var7.field424 = arg1.g1();
				var7.field425 = arg1.g1();
			}
			if ((var8 & 0x2) == 2) {
				int var11 = arg1.g2();
				if (var11 == 65535) {
					var11 = -1;
				}
				if (var7.field432 == var11) {
					var7.field436 = 0;
				}
				int var12 = arg1.g1();
				if (var7.field432 == var11 && var11 != -1) {
					int var13 = SeqType.types[var11].replacemode;
					if (var13 == 1) {
						var7.field433 = 0;
						var7.field434 = 0;
						var7.field435 = var12;
						var7.field436 = 0;
					}
					if (var13 == 2) {
						var7.field436 = 0;
					}
				} else if (var11 == -1 || var7.field432 == -1 || SeqType.types[var11].priority >= SeqType.types[var7.field432].priority) {
					var7.field432 = var11;
					var7.field433 = 0;
					var7.field434 = 0;
					var7.field435 = var12;
					var7.field436 = 0;
					var7.field457 = var7.field452;
				}
			}
			if ((var8 & 0x4) == 4) {
				var7.field426 = arg1.g2();
				if (var7.field426 == 65535) {
					var7.field426 = -1;
				}
			}
			if ((var8 & 0x8) == 8) {
				var7.field416 = arg1.gjstr();
				var7.field417 = 100;
			}
			if ((var8 & 0x10) == 16) {
				int var14 = arg1.g1();
				int var15 = arg1.g1();
				var7.method127(var15, 0, var14);
				var7.field423 = loopCycle + 300;
				var7.field424 = arg1.g1();
				var7.field425 = arg1.g1();
			}
			if ((var8 & 0x20) == 32) {
				var7.field461 = NpcType.method342(arg1.g2());
				var7.field411 = var7.field461.walkanim;
				var7.field412 = var7.field461.walkanim_b;
				var7.field413 = var7.field461.walkanim_r;
				var7.field414 = var7.field461.walkanim_l;
				var7.field409 = var7.field461.readyanim;
			}
			if ((var8 & 0x40) == 64) {
				var7.field437 = arg1.g2();
				int var16 = arg1.g4();
				var7.field441 = var16 >> 16;
				var7.field440 = (var16 & 0xFFFF) + loopCycle;
				var7.field438 = 0;
				var7.field439 = 0;
				if (var7.field440 > loopCycle) {
					var7.field438 = -1;
				}
				if (var7.field437 == 65535) {
					var7.field437 = -1;
				}
			}
			if ((var8 & 0x80) == 128) {
				var7.field427 = arg1.g2();
				var7.field428 = arg1.g2();
			}
		}
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method499(int arg0, Packet arg1, int arg2) {
		int var4 = arg1.gBit(9, 8);
		if (this.field1312 != arg2) {
			this.field1620 = this.field1537.nextInt();
		}
		if (var4 < this.field1286) {
			for (int var5 = var4; var5 < this.field1286; var5++) {
				this.field1323[this.field1322++] = this.field1287[var5];
			}
		}
		if (var4 > this.field1286) {
			signlink.reporterror(this.field1577 + " Too many players");
			throw new RuntimeException("eek");
		}
		this.field1286 = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.field1287[var6];
			PlayerEntity var8 = this.field1285[var7];
			int var9 = arg1.gBit(9, 1);
			if (var9 == 0) {
				this.field1287[this.field1286++] = var7;
				var8.field449 = loopCycle;
			} else {
				int var10 = arg1.gBit(9, 2);
				if (var10 == 0) {
					this.field1287[this.field1286++] = var7;
					var8.field449 = loopCycle;
					this.field1289[this.field1288++] = var7;
				} else if (var10 == 1) {
					this.field1287[this.field1286++] = var7;
					var8.field449 = loopCycle;
					int var11 = arg1.gBit(9, 3);
					var8.method124(var11, false, this.field1504);
					int var12 = arg1.gBit(9, 1);
					if (var12 == 1) {
						this.field1289[this.field1288++] = var7;
					}
				} else if (var10 == 2) {
					this.field1287[this.field1286++] = var7;
					var8.field449 = loopCycle;
					int var13 = arg1.gBit(9, 3);
					var8.method124(var13, true, this.field1504);
					int var14 = arg1.gBit(9, 3);
					var8.method124(var14, true, this.field1504);
					int var15 = arg1.gBit(9, 1);
					if (var15 == 1) {
						this.field1289[this.field1288++] = var7;
					}
				} else if (var10 == 3) {
					this.field1323[this.field1322++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.e(I)V")
	public final void refresh(int arg0) {
		if (arg0 <= 0) {
			this.ptype = this.in.g1();
		}
		this.field1483 = true;
	}

	@ObfuscatedName("client.a(IIIIIIIIII)V")
	public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocSpawned var11 = null;
		for (LocSpawned var12 = (LocSpawned) this.field1190.head(); var12 != null; var12 = (LocSpawned) this.field1190.next(-976)) {
			if (var12.field736 == arg8 && var12.field738 == arg0 && var12.field739 == arg7 && var12.field737 == arg6) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocSpawned();
			var11.field736 = arg8;
			var11.field737 = arg6;
			var11.field738 = arg0;
			var11.field739 = arg7;
			this.method452((byte) -102, var11);
			this.field1190.addTail(var11);
		}
		var11.field743 = arg4;
		var11.field745 = arg1;
		var11.field744 = arg5;
		var11.field746 = arg9;
		if (arg3 != 30437) {
			this.load();
		}
		var11.field747 = arg2;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method501(int arg0) {
		this.field1196 = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.field1597[var2] = -1;
			for (int var3 = 0; var3 < IdkType.count; var3++) {
				if (!IdkType.types[var3].disable && IdkType.types[var3].type == var2 + (this.field1570 ? 0 : 7)) {
					this.field1597[var2] = var3;
					break;
				}
			}
		}
		if (arg0 != 0) {
			this.field1404.p1(220);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method502(String arg0, byte arg1) {
		if (arg1 != 1) {
			this.ptype = this.in.g1();
		}
		if (arg0 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.field1418; var3++) {
			if (arg0.equalsIgnoreCase(this.field1556[var3])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(localPlayer.field465);
	}

	@ObfuscatedName("client.A(I)V")
	public final void method503(int arg0) {
		this.psize += arg0;
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method504(long arg0, boolean arg1) {
		if (arg1 || arg0 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field1418; var4++) {
			if (this.field1208[var4] == arg0) {
				this.field1418--;
				this.field1221 = true;
				for (int var5 = var4; var5 < this.field1418; var5++) {
					this.field1556[var5] = this.field1556[var5 + 1];
					this.field1470[var5] = this.field1470[var5 + 1];
					this.field1208[var5] = this.field1208[var5 + 1];
				}
				this.field1404.pIsaac(69, this.field1496);
				this.field1404.p8(arg0, this.field1377);
				return;
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method505(int arg0) {
		int var2 = this.field1546 * 128 + 64;
		int var3 = this.field1547 * 128 + 64;
		int var4 = this.method473(false, var3, this.field1479, var2) - this.field1548;
		if (this.field1637 < var2) {
			this.field1637 += (var2 - this.field1637) * this.field1550 / 1000 + this.field1549;
			if (this.field1637 > var2) {
				this.field1637 = var2;
			}
		}
		if (this.field1637 > var2) {
			this.field1637 -= (this.field1637 - var2) * this.field1550 / 1000 + this.field1549;
			if (this.field1637 < var2) {
				this.field1637 = var2;
			}
		}
		if (this.field1638 < var4) {
			this.field1638 += (var4 - this.field1638) * this.field1550 / 1000 + this.field1549;
			if (this.field1638 > var4) {
				this.field1638 = var4;
			}
		}
		if (this.field1638 > var4) {
			this.field1638 -= (this.field1638 - var4) * this.field1550 / 1000 + this.field1549;
			if (this.field1638 < var4) {
				this.field1638 = var4;
			}
		}
		if (this.field1639 < var3) {
			this.field1639 += (var3 - this.field1639) * this.field1550 / 1000 + this.field1549;
			if (this.field1639 > var3) {
				this.field1639 = var3;
			}
		}
		if (this.field1639 > var3) {
			this.field1639 -= (this.field1639 - var3) * this.field1550 / 1000 + this.field1549;
			if (this.field1639 < var3) {
				this.field1639 = var3;
			}
		}
		int var5 = this.field1465 * 128 + 64;
		int var6 = this.field1466 * 128 + 64;
		int var7 = this.method473(false, var6, this.field1479, var5) - this.field1467;
		int var8 = var5 - this.field1637;
		int var9 = var7 - this.field1638;
		int var10 = var6 - this.field1639;
		if (this.field1555 != arg0) {
			this.field1417 = !this.field1417;
		}
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.field1640 < var12) {
			this.field1640 += (var12 - this.field1640) * this.field1469 / 1000 + this.field1468;
			if (this.field1640 > var12) {
				this.field1640 = var12;
			}
		}
		if (this.field1640 > var12) {
			this.field1640 -= (this.field1640 - var12) * this.field1469 / 1000 + this.field1468;
			if (this.field1640 < var12) {
				this.field1640 = var12;
			}
		}
		int var14 = var13 - this.field1641;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 > 0) {
			this.field1641 += this.field1469 * var14 / 1000 + this.field1468;
			this.field1641 &= 0x7FF;
		}
		if (var14 < 0) {
			this.field1641 -= -var14 * this.field1469 / 1000 + this.field1468;
			this.field1641 &= 0x7FF;
		}
		int var15 = var13 - this.field1641;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
			this.field1641 = var13;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method506(String arg0) throws IOException {
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
	public final void method508(boolean arg0) {
		if (arg0) {
			this.load();
		}
		while (true) {
			int var2;
			do {
				while (true) {
					var2 = this.pollKey(9);
					if (var2 == -1) {
						return;
					}
					if (this.field1273 != -1 && this.field1273 == this.field1192) {
						if (var2 == 8 && this.field1345.length() > 0) {
							this.field1345 = this.field1345.substring(0, this.field1345.length() - 1);
						}
						break;
					}
					if (this.field1626) {
						if (var2 >= 32 && var2 <= 122 && this.field1449.length() < 80) {
							this.field1449 = this.field1449 + (char) var2;
							this.field1236 = true;
						}
						if (var2 == 8 && this.field1449.length() > 0) {
							this.field1449 = this.field1449.substring(0, this.field1449.length() - 1);
							this.field1236 = true;
						}
						if (var2 == 13 || var2 == 10) {
							this.field1626 = false;
							this.field1236 = true;
							if (this.field1256 == 1) {
								long var3 = JString.method309(this.field1449);
								this.method472(true, var3);
							}
							if (this.field1256 == 2 && this.field1418 > 0) {
								long var5 = JString.method309(this.field1449);
								this.method504(var5, false);
							}
							if (this.field1256 == 3 && this.field1449.length() > 0) {
								this.field1404.pIsaac(170, this.field1496);
								this.field1404.p1(0);
								int var7 = this.field1404.pos;
								this.field1404.p8(this.field1625, this.field1377);
								WordPack.method317(this.field1449, -786, this.field1404);
								this.field1404.psize1(41372, this.field1404.pos - var7);
								this.field1449 = JString.method314(true, this.field1449);
								this.field1449 = WordFilter.method399(this.field1449, (byte) 5);
								this.method431(this.field1449, JString.method313(true, JString.method310((byte) 88, this.field1625)), 6, false);
								if (this.field1576 == 2) {
									this.field1576 = 1;
									this.field1616 = true;
									this.field1404.pIsaac(98, this.field1496);
									this.field1404.p1(this.field1408);
									this.field1404.p1(this.field1576);
									this.field1404.p1(this.field1275);
								}
							}
							if (this.field1256 == 4 && this.field1359 < 100) {
								long var8 = JString.method309(this.field1449);
								this.method446((byte) 57, var8);
							}
							if (this.field1256 == 5 && this.field1359 > 0) {
								long var10 = JString.method309(this.field1449);
								this.method474(true, var10);
							}
						}
					} else if (this.field1376) {
						if (var2 >= 48 && var2 <= 57 && this.field1336.length() < 10) {
							this.field1336 = this.field1336 + (char) var2;
							this.field1236 = true;
						}
						if (var2 == 8 && this.field1336.length() > 0) {
							this.field1336 = this.field1336.substring(0, this.field1336.length() - 1);
							this.field1236 = true;
						}
						if (var2 == 13 || var2 == 10) {
							if (this.field1336.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(this.field1336);
								} catch (Exception var17) {
								}
								this.field1404.pIsaac(190, this.field1496);
								this.field1404.p4(var12);
							}
							this.field1376 = false;
							this.field1236 = true;
						}
					} else if (this.field1396 == -1) {
						if (var2 >= 32 && var2 <= 122 && this.field1596.length() < 80) {
							this.field1596 = this.field1596 + (char) var2;
							this.field1236 = true;
						}
						if (var2 == 8 && this.field1596.length() > 0) {
							this.field1596 = this.field1596.substring(0, this.field1596.length() - 1);
							this.field1236 = true;
						}
						if ((var2 == 13 || var2 == 10) && this.field1596.length() > 0) {
							if (this.field1378 == 2) {
								if (this.field1596.equals("::clientdrop")) {
									this.tryReconnect(0);
								}
								if (this.field1596.equals("::lag")) {
									this.lag((byte) 40);
								}
								if (this.field1596.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < this.onDemand.getFileCount(2, 0); var13++) {
										this.onDemand.prefetch(2, false, var13, (byte) 1);
									}
								}
							}
							if (this.field1596.startsWith("::")) {
								this.field1404.pIsaac(76, this.field1496);
								this.field1404.p1(this.field1596.length() - 1);
								this.field1404.pjstr(this.field1596.substring(2));
							} else {
								byte var14 = 0;
								if (this.field1596.startsWith("yellow:")) {
									var14 = 0;
									this.field1596 = this.field1596.substring(7);
								}
								if (this.field1596.startsWith("red:")) {
									var14 = 1;
									this.field1596 = this.field1596.substring(4);
								}
								if (this.field1596.startsWith("green:")) {
									var14 = 2;
									this.field1596 = this.field1596.substring(6);
								}
								if (this.field1596.startsWith("cyan:")) {
									var14 = 3;
									this.field1596 = this.field1596.substring(5);
								}
								if (this.field1596.startsWith("purple:")) {
									var14 = 4;
									this.field1596 = this.field1596.substring(7);
								}
								if (this.field1596.startsWith("white:")) {
									var14 = 5;
									this.field1596 = this.field1596.substring(6);
								}
								if (this.field1596.startsWith("flash1:")) {
									var14 = 6;
									this.field1596 = this.field1596.substring(7);
								}
								if (this.field1596.startsWith("flash2:")) {
									var14 = 7;
									this.field1596 = this.field1596.substring(7);
								}
								if (this.field1596.startsWith("flash3:")) {
									var14 = 8;
									this.field1596 = this.field1596.substring(7);
								}
								if (this.field1596.startsWith("glow1:")) {
									var14 = 9;
									this.field1596 = this.field1596.substring(6);
								}
								if (this.field1596.startsWith("glow2:")) {
									var14 = 10;
									this.field1596 = this.field1596.substring(6);
								}
								if (this.field1596.startsWith("glow3:")) {
									var14 = 11;
									this.field1596 = this.field1596.substring(6);
								}
								byte var15 = 0;
								if (this.field1596.startsWith("wave:")) {
									var15 = 1;
									this.field1596 = this.field1596.substring(5);
								}
								if (this.field1596.startsWith("scroll:")) {
									var15 = 2;
									this.field1596 = this.field1596.substring(7);
								}
								this.field1404.pIsaac(171, this.field1496);
								this.field1404.p1(0);
								int var16 = this.field1404.pos;
								this.field1404.p1(var14);
								this.field1404.p1(var15);
								WordPack.method317(this.field1596, -786, this.field1404);
								this.field1404.psize1(41372, this.field1404.pos - var16);
								this.field1596 = JString.method314(true, this.field1596);
								this.field1596 = WordFilter.method399(this.field1596, (byte) 5);
								localPlayer.field416 = this.field1596;
								localPlayer.field418 = var14;
								localPlayer.field419 = var15;
								localPlayer.field417 = 150;
								if (this.field1378 == 2) {
									this.method431(localPlayer.field416, "@cr2@" + localPlayer.field465, 2, false);
								} else if (this.field1378 == 1) {
									this.method431(localPlayer.field416, "@cr1@" + localPlayer.field465, 2, false);
								} else {
									this.method431(localPlayer.field416, localPlayer.field465, 2, false);
								}
								if (this.field1408 == 2) {
									this.field1408 = 3;
									this.field1616 = true;
									this.field1404.pIsaac(98, this.field1496);
									this.field1404.p1(this.field1408);
									this.field1404.p1(this.field1576);
									this.field1404.p1(this.field1275);
								}
							}
							this.field1596 = "";
							this.field1236 = true;
						}
					}
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
			if (this.field1345.length() < 12) {
				this.field1345 = this.field1345 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.D(I)V")
	public final void method509(int arg0) {
		int var2 = 98 / arg0;
		if (this.field1581 == 2) {
			this.method480(3, (this.field1348 - this.sceneBaseTileZ << 7) + this.field1351, this.field1349 * 2, (this.field1347 - this.sceneBaseTileX << 7) + this.field1350);
			if (this.field1294 > -1 && loopCycle % 20 < 10) {
				this.field1389[2].method198((byte) 9, this.field1294 - 12, this.field1295 - 28);
			}
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method510(int arg0, int arg1) {
		int var3 = VarpType.types[arg0].clientcode;
		if (arg1 < this.field1223 || arg1 > this.field1223) {
			this.ptype = -1;
		}
		if (var3 == 0) {
			return;
		}
		int var4 = this.field1278[arg0];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.method185(43504, 0.9D);
			}
			if (var4 == 2) {
				Pix3D.method185(43504, 0.8D);
			}
			if (var4 == 3) {
				Pix3D.method185(43504, 0.7D);
			}
			if (var4 == 4) {
				Pix3D.method185(43504, 0.6D);
			}
			ObjType.field1070.method116();
			this.field1483 = true;
		}
		if (var3 == 3) {
			boolean var5 = this.field1460;
			if (var4 == 0) {
				this.method534(0, this.field1460, false);
				this.field1460 = true;
			}
			if (var4 == 1) {
				this.method534(-400, this.field1460, false);
				this.field1460 = true;
			}
			if (var4 == 2) {
				this.method534(-800, this.field1460, false);
				this.field1460 = true;
			}
			if (var4 == 3) {
				this.method534(-1200, this.field1460, false);
				this.field1460 = true;
			}
			if (var4 == 4) {
				this.field1460 = false;
			}
			if (this.field1460 != var5 && !field1401) {
				if (this.field1460) {
					this.field1568 = this.field1472;
					this.field1569 = false;
					this.onDemand.request(2, this.field1568);
				} else {
					this.method503(0);
				}
				this.field1205 = 0;
			}
		}
		if (var3 == 4) {
			if (var4 == 0) {
				this.field1614 = true;
				this.method463(0, 0);
			}
			if (var4 == 1) {
				this.field1614 = true;
				this.method463(-400, 0);
			}
			if (var4 == 2) {
				this.field1614 = true;
				this.method463(-800, 0);
			}
			if (var4 == 3) {
				this.field1614 = true;
				this.method463(-1200, 0);
			}
			if (var4 == 4) {
				this.field1614 = false;
			}
		}
		if (var3 == 5) {
			this.field1522 = var4;
		}
		if (var3 == 6) {
			this.field1333 = var4;
		}
		if (var3 == 8) {
			this.field1346 = var4;
			this.field1236 = true;
		}
		if (var3 == 9) {
			this.field1551 = var4;
		}
	}

	@ObfuscatedName("client.a(IIIILgc;)V")
	public final void method511(int arg0, int arg1, int arg2, int arg3, NpcType arg4) {
		if (arg3 <= 0) {
			this.field1426 = !this.field1426;
		}
		if (this.field1564 >= 400) {
			return;
		}
		String var6 = arg4.name;
		if (arg4.vislevel != 0) {
			var6 = var6 + method469(arg4.vislevel, 31733, localPlayer.field471) + " (level-" + arg4.vislevel + ")";
		}
		if (this.field1497 == 1) {
			this.field1579[this.field1564] = "Use " + this.field1501 + " with @yel@" + var6;
			this.field1203[this.field1564] = 900;
			this.field1204[this.field1564] = arg2;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg0;
			this.field1564++;
		} else if (this.field1307 != 1) {
			if (arg4.op != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg4.op[var7] != null && !arg4.op[var7].equalsIgnoreCase("attack")) {
						this.field1579[this.field1564] = arg4.op[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.field1203[this.field1564] = 728;
						}
						if (var7 == 1) {
							this.field1203[this.field1564] = 542;
						}
						if (var7 == 2) {
							this.field1203[this.field1564] = 6;
						}
						if (var7 == 3) {
							this.field1203[this.field1564] = 963;
						}
						if (var7 == 4) {
							this.field1203[this.field1564] = 245;
						}
						this.field1204[this.field1564] = arg2;
						this.field1201[this.field1564] = arg1;
						this.field1202[this.field1564] = arg0;
						this.field1564++;
					}
				}
			}
			if (arg4.op != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg4.op[var8] != null && arg4.op[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg4.vislevel > localPlayer.field471) {
							var9 = 2000;
						}
						this.field1579[this.field1564] = arg4.op[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.field1203[this.field1564] = var9 + 728;
						}
						if (var8 == 1) {
							this.field1203[this.field1564] = var9 + 542;
						}
						if (var8 == 2) {
							this.field1203[this.field1564] = var9 + 6;
						}
						if (var8 == 3) {
							this.field1203[this.field1564] = var9 + 963;
						}
						if (var8 == 4) {
							this.field1203[this.field1564] = var9 + 245;
						}
						this.field1204[this.field1564] = arg2;
						this.field1201[this.field1564] = arg1;
						this.field1202[this.field1564] = arg0;
						this.field1564++;
					}
				}
			}
			this.field1579[this.field1564] = "Examine @yel@" + var6;
			this.field1203[this.field1564] = 1607;
			this.field1204[this.field1564] = arg2;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg0;
			this.field1564++;
		} else if ((this.field1309 & 0x2) == 2) {
			this.field1579[this.field1564] = this.field1310 + " @yel@" + var6;
			this.field1203[this.field1564] = 265;
			this.field1204[this.field1564] = arg2;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg0;
			this.field1564++;
			return;
		}
	}

	@ObfuscatedName("client.f(II)V")
	public final void method512(int arg0, int arg1) {
		if (arg0 < 0) {
			return;
		}
		if (this.field1376) {
			this.field1376 = false;
			this.field1236 = true;
		}
		int var3 = this.field1201[arg0];
		int var4 = this.field1202[arg0];
		int var5 = this.field1203[arg0];
		int var6 = this.field1204[arg0];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 1501) {
			field1542 += this.sceneBaseTileZ;
			if (field1542 >= 92) {
				this.field1404.pIsaac(177, this.field1496);
				this.field1404.p4(0);
			}
			this.method436(243, var3, var6, -841, var4);
		}
		if (var5 == 34) {
			String var7 = this.field1579[arg0];
			int var8 = var7.indexOf("@whi@");
			if (var8 != -1) {
				this.method450(true);
				this.field1345 = var7.substring(var8 + 5).trim();
				this.field1451 = false;
				for (int var9 = 0; var9 < Component.types.length; var9++) {
					if (Component.types[var9] != null && Component.types[var9].field82 == 600) {
						this.field1192 = this.field1273 = Component.types[var9].field79;
						break;
					}
				}
			}
		}
		if (var5 == 367) {
			PlayerEntity var10 = this.field1285[var6];
			if (var10 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var10.routeTileX[0], 0, var10.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				this.field1404.pIsaac(48, this.field1496);
				this.field1404.p2(var6);
				this.field1404.p2(this.field1500);
				this.field1404.p2(this.field1498);
				this.field1404.p2(this.field1499);
			}
		}
		if (var5 == 951) {
			Component var11 = Component.types[var4];
			boolean var12 = true;
			if (var11.field82 > 0) {
				var12 = this.method532(var11, (byte) 7);
			}
			if (var12) {
				this.field1404.pIsaac(39, this.field1496);
				this.field1404.p2(var4);
			}
		}
		if (var5 == 217) {
			boolean var13 = this.method515(false, 0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var13) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.field1600 = super.mouseClickX;
			this.field1601 = super.mouseClickY;
			this.field1603 = 2;
			this.field1602 = 0;
			this.field1404.pIsaac(111, this.field1496);
			this.field1404.p2(this.sceneBaseTileX + var3);
			this.field1404.p2(this.sceneBaseTileZ + var4);
			this.field1404.p2(var6);
			this.field1404.p2(this.field1500);
			this.field1404.p2(this.field1498);
			this.field1404.p2(this.field1499);
		}
		if (var5 == 450 && this.method436(106, var3, var6, -841, var4)) {
			this.field1404.p2(this.field1500);
			this.field1404.p2(this.field1498);
			this.field1404.p2(this.field1499);
		}
		if (var5 == 265) {
			NpcEntity var15 = this.field1438[var6];
			if (var15 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var15.routeTileX[0], 0, var15.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				this.field1404.pIsaac(101, this.field1496);
				this.field1404.p2(var6);
				this.field1404.p2(this.field1308);
			}
		}
		if (var5 == 364) {
			this.method436(19, var3, var6, -841, var4);
		}
		if (var5 == 55 && this.method436(182, var3, var6, -841, var4)) {
			this.field1404.p2(this.field1308);
		}
		if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
			boolean var16 = this.method515(false, 0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var16) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.field1600 = super.mouseClickX;
			this.field1601 = super.mouseClickY;
			this.field1603 = 2;
			this.field1602 = 0;
			if (var5 == 99) {
				this.field1404.pIsaac(27, this.field1496);
			}
			if (var5 == 993) {
				this.field1404.pIsaac(110, this.field1496);
			}
			if (var5 == 224) {
				this.field1404.pIsaac(231, this.field1496);
			}
			if (var5 == 877) {
				this.field1404.pIsaac(225, this.field1496);
			}
			if (var5 == 746) {
				this.field1404.pIsaac(17, this.field1496);
			}
			this.field1404.p2(this.sceneBaseTileX + var3);
			this.field1404.p2(this.sceneBaseTileZ + var4);
			this.field1404.p2(var6);
		}
		if (var5 == 581) {
			if ((var6 & 0x3) == 0) {
				field1506++;
			}
			if (field1506 >= 99) {
				this.field1404.pIsaac(47, this.field1496);
				this.field1404.p4(0);
			}
			this.method436(55, var3, var6, -841, var4);
		}
		if (var5 == 679) {
			String var18 = this.field1579[arg0];
			int var19 = var18.indexOf("@whi@");
			if (var19 != -1) {
				long var20 = JString.method309(var18.substring(var19 + 5).trim());
				int var22 = -1;
				for (int var23 = 0; var23 < this.field1418; var23++) {
					if (this.field1208[var23] == var20) {
						var22 = var23;
						break;
					}
				}
				if (var22 != -1 && this.field1470[var22] > 0) {
					this.field1236 = true;
					this.field1376 = false;
					this.field1626 = true;
					this.field1449 = "";
					this.field1256 = 3;
					this.field1625 = this.field1208[var22];
					this.field1213 = "Enter message to send to " + this.field1556[var22];
				}
			}
		}
		if (var5 == 960) {
			this.field1404.pIsaac(39, this.field1496);
			this.field1404.p2(var4);
			Component var24 = Component.types[var4];
			if (var24.field88 != null && var24.field88[0][0] == 5) {
				int var25 = var24.field88[0][1];
				if (this.field1278[var25] != var24.field90[0]) {
					this.field1278[var25] = var24.field90[0];
					this.method510(var25, 7);
					this.field1221 = true;
				}
			}
		}
		if (var5 == 1175) {
			int var26 = var6 >> 14 & 0x7FFF;
			LocType var27 = LocType.method333(var26);
			String var28;
			if (var27.desc == null) {
				var28 = "It's a " + var27.name + ".";
			} else {
				var28 = new String(var27.desc);
			}
			this.method431(var28, "", 0, false);
		}
		if (var5 == 881) {
			this.field1404.pIsaac(58, this.field1496);
			this.field1404.p2(var6);
			this.field1404.p2(var3);
			this.field1404.p2(var4);
			this.field1404.p2(this.field1500);
			this.field1404.p2(this.field1498);
			this.field1404.p2(this.field1499);
			this.field1297 = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.field1300 = 2;
			if (Component.types[var4].field79 == this.field1273) {
				this.field1300 = 1;
			}
			if (Component.types[var4].field79 == this.field1396) {
				this.field1300 = 3;
			}
		}
		if (var5 == 44 && !this.field1613) {
			this.field1404.pIsaac(11, this.field1496);
			this.field1404.p2(var4);
			this.field1613 = true;
		}
		if (var5 == 285) {
			this.method436(238, var3, var6, -841, var4);
		}
		if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
			String var29 = this.field1579[arg0];
			int var30 = var29.indexOf("@whi@");
			if (var30 != -1) {
				long var31 = JString.method309(var29.substring(var30 + 5).trim());
				if (var5 == 406) {
					this.method472(true, var31);
				}
				if (var5 == 436) {
					this.method446((byte) 57, var31);
				}
				if (var5 == 557) {
					this.method504(var31, false);
				}
				if (var5 == 556) {
					this.method474(true, var31);
				}
			}
		}
		if (var5 == 947) {
			this.method450(true);
		}
		if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
			if (var5 == 347) {
				this.field1404.pIsaac(133, this.field1496);
			}
			if (var5 == 422) {
				this.field1404.pIsaac(221, this.field1496);
			}
			if (var5 == 478) {
				if ((var3 & 0x3) == 0) {
					field1219++;
				}
				if (field1219 >= 90) {
					this.field1404.pIsaac(7, this.field1496);
				}
				this.field1404.pIsaac(6, this.field1496);
			}
			if (var5 == 405) {
				field1606 += var6;
				if (field1606 >= 97) {
					this.field1404.pIsaac(37, this.field1496);
					this.field1404.p3(14953816);
				}
				this.field1404.pIsaac(228, this.field1496);
			}
			if (var5 == 38) {
				this.field1404.pIsaac(166, this.field1496);
			}
			this.field1404.p2(var6);
			this.field1404.p2(var3);
			this.field1404.p2(var4);
			this.field1297 = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.field1300 = 2;
			if (Component.types[var4].field79 == this.field1273) {
				this.field1300 = 1;
			}
			if (Component.types[var4].field79 == this.field1396) {
				this.field1300 = 3;
			}
		}
		if (var5 == 965) {
			boolean var33 = this.method515(false, 0, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 0, localPlayer.routeTileX[0]);
			if (!var33) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var3, 0, var4, 1, localPlayer.routeTileX[0]);
			}
			this.field1600 = super.mouseClickX;
			this.field1601 = super.mouseClickY;
			this.field1603 = 2;
			this.field1602 = 0;
			this.field1404.pIsaac(25, this.field1496);
			this.field1404.p2(this.sceneBaseTileX + var3);
			this.field1404.p2(this.sceneBaseTileZ + var4);
			this.field1404.p2(var6);
			this.field1404.p2(this.field1308);
		}
		if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
			if (var5 == 415) {
				if ((var4 & 0x3) == 0) {
					field1622++;
				}
				if (field1622 >= 55) {
					this.field1404.pIsaac(50, this.field1496);
					this.field1404.p4(0);
				}
				this.field1404.pIsaac(212, this.field1496);
			}
			if (var5 == 22) {
				this.field1404.pIsaac(158, this.field1496);
			}
			if (var5 == 596) {
				this.field1404.pIsaac(193, this.field1496);
			}
			if (var5 == 892) {
				if ((var3 & 0x3) == 0) {
					field1558++;
				}
				if (field1558 >= 130) {
					this.field1404.pIsaac(169, this.field1496);
					this.field1404.p1(177);
				}
				this.field1404.pIsaac(204, this.field1496);
			}
			if (var5 == 602) {
				this.field1404.pIsaac(153, this.field1496);
			}
			this.field1404.p2(var6);
			this.field1404.p2(var3);
			this.field1404.p2(var4);
			this.field1297 = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.field1300 = 2;
			if (Component.types[var4].field79 == this.field1273) {
				this.field1300 = 1;
			}
			if (Component.types[var4].field79 == this.field1396) {
				this.field1300 = 3;
			}
		}
		if (var5 == 465) {
			this.field1404.pIsaac(39, this.field1496);
			this.field1404.p2(var4);
			Component var35 = Component.types[var4];
			if (var35.field88 != null && var35.field88[0][0] == 5) {
				int var36 = var35.field88[0][1];
				this.field1278[var36] = 1 - this.field1278[var36];
				this.method510(var36, 7);
				this.field1221 = true;
			}
		}
		if (var5 == 900) {
			NpcEntity var37 = this.field1438[var6];
			if (var37 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var37.routeTileX[0], 0, var37.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				this.field1404.pIsaac(52, this.field1496);
				this.field1404.p2(var6);
				this.field1404.p2(this.field1500);
				this.field1404.p2(this.field1498);
				this.field1404.p2(this.field1499);
			}
		}
		if (var5 == 188) {
			this.field1497 = 1;
			this.field1498 = var3;
			this.field1499 = var4;
			this.field1500 = var6;
			this.field1501 = ObjType.get(var6).name;
			this.field1307 = 0;
			this.field1221 = true;
			return;
		}
		if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
			NpcEntity var38 = this.field1438[var6];
			if (var38 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var38.routeTileX[0], 0, var38.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				if (var5 == 963) {
					this.field1404.pIsaac(229, this.field1496);
				}
				if (var5 == 6) {
					if ((var6 & 0x3) == 0) {
						field1612++;
					}
					if (field1612 >= 124) {
						this.field1404.pIsaac(218, this.field1496);
						this.field1404.p4(0);
					}
					this.field1404.pIsaac(132, this.field1496);
				}
				if (var5 == 245) {
					if ((var6 & 0x3) == 0) {
						field1553++;
					}
					if (field1553 >= 85) {
						this.field1404.pIsaac(34, this.field1496);
						this.field1404.p2(39596);
					}
					this.field1404.pIsaac(102, this.field1496);
				}
				if (var5 == 728) {
					this.field1404.pIsaac(222, this.field1496);
				}
				if (var5 == 542) {
					this.field1404.pIsaac(84, this.field1496);
				}
				this.field1404.p2(var6);
			}
		}
		if (var5 == 391) {
			this.field1404.pIsaac(143, this.field1496);
			this.field1404.p2(var6);
			this.field1404.p2(var3);
			this.field1404.p2(var4);
			this.field1404.p2(this.field1308);
			this.field1297 = 0;
			this.field1298 = var4;
			this.field1299 = var3;
			this.field1300 = 2;
			if (Component.types[var4].field79 == this.field1273) {
				this.field1300 = 1;
			}
			if (Component.types[var4].field79 == this.field1396) {
				this.field1300 = 3;
			}
		}
		if (var5 == 930) {
			Component var39 = Component.types[var4];
			this.field1307 = 1;
			this.field1308 = var4;
			this.field1309 = var39.field131;
			this.field1497 = 0;
			this.field1221 = true;
			String var40 = var39.field129;
			if (var40.indexOf(" ") != -1) {
				var40 = var40.substring(0, var40.indexOf(" "));
			}
			String var41 = var39.field129;
			if (var41.indexOf(" ") != -1) {
				var41 = var41.substring(var41.indexOf(" ") + 1);
			}
			this.field1310 = var40 + " " + var39.field130 + " " + var41;
			if (this.field1309 == 16) {
				this.field1221 = true;
				this.field1225 = 3;
				this.field1384 = true;
			}
			return;
		}
		if (var5 == 660) {
			if (this.field1356) {
				this.field1258.method101((byte) 38, var4 - 4, var3 - 4);
			} else {
				this.field1258.method101((byte) 38, super.mouseClickY - 4, super.mouseClickX - 4);
			}
		}
		if (var5 == 903 || var5 == 363) {
			String var42 = this.field1579[arg0];
			int var43 = var42.indexOf("@whi@");
			if (var43 != -1) {
				String var44 = var42.substring(var43 + 5).trim();
				String var45 = JString.method313(true, JString.method310((byte) 88, JString.method309(var44)));
				boolean var46 = false;
				for (int var47 = 0; var47 < this.field1286; var47++) {
					PlayerEntity var48 = this.field1285[this.field1287[var47]];
					if (var48 != null && var48.field465 != null && var48.field465.equalsIgnoreCase(var45)) {
						this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var48.routeTileX[0], 0, var48.routeTileZ[0], 1, localPlayer.routeTileX[0]);
						if (var5 == 903) {
							this.field1404.pIsaac(43, this.field1496);
						}
						if (var5 == 363) {
							this.field1404.pIsaac(211, this.field1496);
						}
						this.field1404.p2(this.field1287[var47]);
						var46 = true;
						break;
					}
				}
				if (!var46) {
					this.method431("Unable to find " + var45, "", 0, false);
				}
			}
		}
		if (var5 == 1607) {
			NpcEntity var49 = this.field1438[var6];
			if (var49 != null) {
				String var50;
				if (var49.field461.desc == null) {
					var50 = "It's a " + var49.field461.name + ".";
				} else {
					var50 = new String(var49.field461.desc);
				}
				this.method431(var50, "", 0, false);
			}
		}
		if (var5 == 651) {
			PlayerEntity var51 = this.field1285[var6];
			if (var51 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var51.routeTileX[0], 0, var51.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				this.field1404.pIsaac(73, this.field1496);
				this.field1404.p2(var6);
				this.field1404.p2(this.field1308);
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
			this.method431(var53, "", 0, false);
		}
		if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
			PlayerEntity var54 = this.field1285[var6];
			if (var54 != null) {
				this.method515(false, 1, localPlayer.routeTileZ[0], 0, 2, false, 0, var54.routeTileX[0], 0, var54.routeTileZ[0], 1, localPlayer.routeTileX[0]);
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 2;
				this.field1602 = 0;
				if (var5 == 1544) {
					this.field1404.pIsaac(64, this.field1496);
				}
				if (var5 == 1373) {
					this.field1404.pIsaac(43, this.field1496);
				}
				if (var5 == 151) {
					field1386++;
					if (field1386 >= 90) {
						this.field1404.pIsaac(100, this.field1496);
						this.field1404.p2(31114);
					}
					this.field1404.pIsaac(219, this.field1496);
				}
				if (var5 == 1101) {
					this.field1404.pIsaac(211, this.field1496);
				}
				this.field1404.p2(var6);
			}
		}
		if (var5 == 504) {
			this.method436(38, var3, var6, -841, var4);
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
			this.method431(var56, "", 0, false);
		}
		this.field1497 = 0;
		this.field1307 = 0;
		if (arg1 == 0) {
			this.field1221 = true;
		}
	}

	@ObfuscatedName("client.E(I)V")
	public final void method513(int arg0) {
		LocSpawned var2 = (LocSpawned) this.field1190.head();
		while (arg0 >= 0) {
			field1282 = !field1282;
		}
		while (var2 != null) {
			if (var2.field747 == -1) {
				var2.field746 = 0;
				this.method452((byte) -102, var2);
			} else {
				var2.unlink();
			}
			var2 = (LocSpawned) this.field1190.next(-976);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method514(int arg0) {
		if (arg0 != 3) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		try {
			int var3 = localPlayer.field404 + this.field1485;
			int var4 = localPlayer.field405 + this.field1266;
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
			this.field1560 = this.field1561 / 2 + this.field1560 & 0x7FF;
			this.field1559 += this.field1562 / 2;
			if (this.field1559 < 128) {
				this.field1559 = 128;
			}
			if (this.field1559 > 383) {
				this.field1559 = 383;
			}
			int var5 = this.field1475 >> 7;
			int var6 = this.field1476 >> 7;
			int var7 = this.method473(false, this.field1476, this.field1479, this.field1475);
			int var8 = 0;
			if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
				for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
					for (int var10 = var6 - 4; var10 <= var6 + 4; var10++) {
						int var11 = this.field1479;
						if (var11 < 3 && (this.field1281[1][var9][var10] & 0x2) == 2) {
							var11++;
						}
						int var12 = var7 - this.field1409[var11][var9][var10];
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
			signlink.reporterror("glfc_ex " + localPlayer.field404 + "," + localPlayer.field405 + "," + this.field1475 + "," + this.field1476 + "," + this.field1589 + "," + this.field1590 + "," + this.sceneBaseTileX + "," + this.sceneBaseTileZ);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.a(ZIIIIZIIIIII)Z")
	public final boolean method515(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var35 = 0; var35 < var14; var35++) {
				this.field1271[var15][var35] = 0;
				this.field1239[var15][var35] = 99999999;
			}
		}
		int var16 = arg11;
		int var17 = arg2;
		this.field1271[arg11][arg2] = 99;
		if (arg0) {
			field1374 = -379;
		}
		this.field1239[arg11][arg2] = 0;
		byte var18 = 0;
		int var19 = 0;
		this.field1511[var18] = arg11;
		int var36 = var18 + 1;
		this.field1512[var18] = arg2;
		boolean var20 = false;
		int var21 = this.field1511.length;
		int[][] var22 = this.field1554[this.field1479].flags;
		while (var36 != var19) {
			var16 = this.field1511[var19];
			var17 = this.field1512[var19];
			var19 = (var19 + 1) % var21;
			if (arg7 == var16 && arg9 == var17) {
				var20 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && this.field1554[this.field1479].method368(arg7, false, arg8 - 1, arg9, var17, var16, arg6)) {
					var20 = true;
					break;
				}
				if (arg8 < 10 && this.field1554[this.field1479].method369(var17, var16, arg7, true, arg8 - 1, arg6, arg9)) {
					var20 = true;
					break;
				}
			}
			if (arg1 != 0 && arg10 != 0 && this.field1554[this.field1479].method370(arg1, var16, arg7, arg9, arg3, var17, (byte) 6, arg10)) {
				var20 = true;
				break;
			}
			int var34 = this.field1239[var16][var17] + 1;
			if (var16 > 0 && this.field1271[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 0x280108) == 0) {
				this.field1511[var36] = var16 - 1;
				this.field1512[var36] = var17;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 - 1][var17] = 2;
				this.field1239[var16 - 1][var17] = var34;
			}
			if (var16 < var13 - 1 && this.field1271[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 0x280180) == 0) {
				this.field1511[var36] = var16 + 1;
				this.field1512[var36] = var17;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 + 1][var17] = 8;
				this.field1239[var16 + 1][var17] = var34;
			}
			if (var17 > 0 && this.field1271[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.field1511[var36] = var16;
				this.field1512[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16][var17 - 1] = 1;
				this.field1239[var16][var17 - 1] = var34;
			}
			if (var17 < var14 - 1 && this.field1271[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.field1511[var36] = var16;
				this.field1512[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16][var17 + 1] = 4;
				this.field1239[var16][var17 + 1] = var34;
			}
			if (var16 > 0 && var17 > 0 && this.field1271[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 0x28010E) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.field1511[var36] = var16 - 1;
				this.field1512[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 - 1][var17 - 1] = 3;
				this.field1239[var16 - 1][var17 - 1] = var34;
			}
			if (var16 < var13 - 1 && var17 > 0 && this.field1271[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 0x280183) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 - 1] & 0x280102) == 0) {
				this.field1511[var36] = var16 + 1;
				this.field1512[var36] = var17 - 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 + 1][var17 - 1] = 9;
				this.field1239[var16 + 1][var17 - 1] = var34;
			}
			if (var16 > 0 && var17 < var14 - 1 && this.field1271[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 0x280138) == 0 && (var22[var16 - 1][var17] & 0x280108) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.field1511[var36] = var16 - 1;
				this.field1512[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 - 1][var17 + 1] = 6;
				this.field1239[var16 - 1][var17 + 1] = var34;
			}
			if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1271[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 0x2801E0) == 0 && (var22[var16 + 1][var17] & 0x280180) == 0 && (var22[var16][var17 + 1] & 0x280120) == 0) {
				this.field1511[var36] = var16 + 1;
				this.field1512[var36] = var17 + 1;
				var36 = (var36 + 1) % var21;
				this.field1271[var16 + 1][var17 + 1] = 12;
				this.field1239[var16 + 1][var17 + 1] = var34;
			}
		}
		this.field1544 = 0;
		if (!var20) {
			if (arg5) {
				int var23 = 100;
				for (int var24 = 1; var24 < 2; var24++) {
					for (int var25 = arg7 - var24; var25 <= arg7 + var24; var25++) {
						for (int var26 = arg9 - var24; var26 <= arg9 + var24; var26++) {
							if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1239[var25][var26] < var23) {
								var23 = this.field1239[var25][var26];
								var16 = var25;
								var17 = var26;
								this.field1544 = 1;
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
		this.field1511[var27] = var16;
		int var37 = var27 + 1;
		this.field1512[var27] = var17;
		int var28;
		int var29 = var28 = this.field1271[var16][var17];
		while (arg11 != var16 || arg2 != var17) {
			if (var28 != var29) {
				var28 = var29;
				this.field1511[var37] = var16;
				this.field1512[var37++] = var17;
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
			var29 = this.field1271[var16][var17];
		}
		if (var37 > 0) {
			int var30 = var37;
			if (var37 > 25) {
				var30 = 25;
			}
			var37--;
			int var31 = this.field1511[var37];
			int var32 = this.field1512[var37];
			if (arg4 == 0) {
				this.field1404.pIsaac(63, this.field1496);
				this.field1404.p1(var30 + var30 + 3);
			}
			if (arg4 == 1) {
				this.field1404.pIsaac(56, this.field1496);
				this.field1404.p1(var30 + var30 + 3 + 14);
			}
			if (arg4 == 2) {
				this.field1404.pIsaac(167, this.field1496);
				this.field1404.p1(var30 + var30 + 3);
			}
			if (super.actionKey[5] == 1) {
				this.field1404.p1(1);
			} else {
				this.field1404.p1(0);
			}
			this.field1404.p2(this.sceneBaseTileX + var31);
			this.field1404.p2(this.sceneBaseTileZ + var32);
			this.field1461 = this.field1511[0];
			this.field1462 = this.field1512[0];
			for (int var33 = 1; var33 < var30; var33++) {
				var37--;
				this.field1404.p1(this.field1511[var37] - var31);
				this.field1404.p1(this.field1512[var37] - var32);
			}
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method516(Component arg0, int arg1) {
		if (arg1 <= 0) {
			throw new NullPointerException();
		} else if (arg0.field89 == null) {
			return false;
		} else {
			for (int var3 = 0; var3 < arg0.field89.length; var3++) {
				int var4 = this.method526(arg0, 52, var3);
				int var5 = arg0.field90[var3];
				if (arg0.field89[var3] == 2) {
					if (var4 >= var5) {
						return false;
					}
				} else if (arg0.field89[var3] == 3) {
					if (var4 <= var5) {
						return false;
					}
				} else if (arg0.field89[var3] == 4) {
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
	public final void drawTitle(int arg0) {
		this.method540(true);
		if (this.field1206 != arg0) {
			this.field1404.p1(143);
		}
		this.field1366.method267(212);
		this.imageTitlebox.method211((byte) 9, 0, 0);
		short var2 = 360;
		short var3 = 200;
		if (this.field1414 == 0) {
			int var4 = var3 / 2 + 80;
			this.field1441.method214(var2 / 2, true, this.onDemand.message, true, var4, 7711145);
			int var5 = var3 / 2 - 20;
			this.field1443.method214(var2 / 2, true, "Welcome to RuneScape", true, var5, 16776960);
			int var16 = var5 + 30;
			int var6 = var2 / 2 - 80;
			int var7 = var3 / 2 + 20;
			this.imageTitlebutton.method211((byte) 9, var6 - 73, var7 - 20);
			this.field1443.method214(var6, true, "New user", true, var7 + 5, 16777215);
			int var8 = var2 / 2 + 80;
			this.imageTitlebutton.method211((byte) 9, var8 - 73, var7 - 20);
			this.field1443.method214(var8, true, "Existing User", true, var7 + 5, 16777215);
		}
		if (this.field1414 == 2) {
			int var9 = var3 / 2 - 40;
			if (this.field1508.length() > 0) {
				this.field1443.method214(var2 / 2, true, this.field1508, true, var9 - 15, 16776960);
				this.field1443.method214(var2 / 2, true, this.field1509, true, var9, 16776960);
				var9 += 30;
			} else {
				this.field1443.method214(var2 / 2, true, this.field1509, true, var9 - 7, 16776960);
				var9 += 30;
			}
			this.field1443.method218(16777215, var2 / 2 - 90, true, false, var9, "Username: " + this.field1577 + (this.field1526 == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			this.field1443.method218(16777215, var2 / 2 - 88, true, false, var9, "Password: " + JString.method315(false, this.field1578) + (this.field1526 == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
			var9 += 15;
			int var10 = var2 / 2 - 80;
			int var11 = var3 / 2 + 50;
			this.imageTitlebutton.method211((byte) 9, var10 - 73, var11 - 20);
			this.field1443.method214(var10, true, "Login", true, var11 + 5, 16777215);
			int var12 = var2 / 2 + 80;
			this.imageTitlebutton.method211((byte) 9, var12 - 73, var11 - 20);
			this.field1443.method214(var12, true, "Cancel", true, var11 + 5, 16777215);
		}
		if (this.field1414 == 3) {
			this.field1443.method214(var2 / 2, true, "Create a free account", true, var3 / 2 - 60, 16776960);
			int var13 = var3 / 2 - 35;
			this.field1443.method214(var2 / 2, true, "To create a new account you need to", true, var13, 16777215);
			int var17 = var13 + 15;
			this.field1443.method214(var2 / 2, true, "go back to the main RuneScape webpage", true, var17, 16777215);
			int var18 = var17 + 15;
			this.field1443.method214(var2 / 2, true, "and choose the red 'create account'", true, var18, 16777215);
			int var19 = var18 + 15;
			this.field1443.method214(var2 / 2, true, "button at the top right of that page.", true, var19, 16777215);
			int var20 = var19 + 15;
			int var14 = var2 / 2;
			int var15 = var3 / 2 + 50;
			this.imageTitlebutton.method211((byte) 9, var14 - 73, var15 - 20);
			this.field1443.method214(var14, true, "Cancel", true, var15 + 5, 16777215);
		}
		this.field1366.method268(super.graphics, 171, (byte) 55, 202);
		if (!this.field1483) {
			return;
		}
		this.field1483 = false;
		this.field1364.method268(super.graphics, 0, (byte) 55, 128);
		this.field1365.method268(super.graphics, 371, (byte) 55, 202);
		this.field1369.method268(super.graphics, 265, (byte) 55, 0);
		this.field1370.method268(super.graphics, 265, (byte) 55, 562);
		this.field1371.method268(super.graphics, 171, (byte) 55, 128);
		this.field1372.method268(super.graphics, 171, (byte) 55, 562);
	}

	@ObfuscatedName("client.a(IZLmb;)V")
	public final void method518(int arg0, boolean arg1, Packet arg2) {
		if (arg1) {
			field1282 = !field1282;
		}
		while (arg2.bitPos + 21 < arg0 * 8) {
			int var4 = arg2.gBit(9, 13);
			if (var4 == 8191) {
				break;
			}
			if (this.field1438[var4] == null) {
				this.field1438[var4] = new NpcEntity();
			}
			NpcEntity var5 = this.field1438[var4];
			this.field1440[this.field1439++] = var4;
			var5.field449 = loopCycle;
			var5.field461 = NpcType.method342(arg2.gBit(9, 11));
			var5.field408 = var5.field461.size;
			var5.field411 = var5.field461.walkanim;
			var5.field412 = var5.field461.walkanim_b;
			var5.field413 = var5.field461.walkanim_r;
			var5.field414 = var5.field461.walkanim_l;
			var5.field409 = var5.field461.readyanim;
			int var6 = arg2.gBit(9, 5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg2.gBit(9, 5);
			if (var7 > 15) {
				var7 -= 32;
			}
			var5.method123(false, localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7, this.field1523);
			int var8 = arg2.gBit(9, 1);
			if (var8 == 1) {
				this.field1289[this.field1288++] = var4;
			}
		}
		arg2.bytes(0);
	}

	@ObfuscatedName("client.g(II)Ljava/lang/String;")
	public final String method519(int arg0, int arg1) {
		while (arg1 >= 0) {
			this.ptype = this.in.g1();
		}
		if (arg0 < 999999999) {
			return String.valueOf(arg0);
		} else {
			return "*";
		}
	}

	@ObfuscatedName("client.H(I)I")
	public final int method520(int arg0) {
		int var2 = 3;
		if (arg0 <= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		if (this.field1640 < 310) {
			int var4 = this.field1637 >> 7;
			int var5 = this.field1639 >> 7;
			int var6 = localPlayer.field404 >> 7;
			int var7 = localPlayer.field405 >> 7;
			if ((this.field1281[this.field1479][var4][var5] & 0x4) != 0) {
				var2 = this.field1479;
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
					if ((this.field1281[this.field1479][var4][var5] & 0x4) != 0) {
						var2 = this.field1479;
					}
					var11 += var10;
					if (var11 >= 65536) {
						var11 -= 65536;
						if (var5 < var7) {
							var5++;
						} else if (var5 > var7) {
							var5--;
						}
						if ((this.field1281[this.field1479][var4][var5] & 0x4) != 0) {
							var2 = this.field1479;
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
					if ((this.field1281[this.field1479][var4][var5] & 0x4) != 0) {
						var2 = this.field1479;
					}
					var13 += var12;
					if (var13 >= 65536) {
						var13 -= 65536;
						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}
						if ((this.field1281[this.field1479][var4][var5] & 0x4) != 0) {
							var2 = this.field1479;
						}
					}
				}
			}
		}
		if ((this.field1281[this.field1479][localPlayer.field404 >> 7][localPlayer.field405 >> 7] & 0x4) != 0) {
			var2 = this.field1479;
		}
		return var2;
	}

	@ObfuscatedName("client.I(I)I")
	public final int method521(int arg0) {
		if (arg0 == 8) {
			int var2 = this.method473(false, this.field1639, this.field1479, this.field1637);
			return var2 - this.field1638 >= 800 || (this.field1281[this.field1479][this.field1637 >> 7][this.field1639 >> 7] & 0x4) == 0 ? 3 : this.field1479;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void method522(int arg0, Packet arg1, int arg2, int arg3, PlayerEntity arg4) {
		if (arg2 >= 0) {
			field1282 = !field1282;
		}
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1.g1();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet((byte) -109, var7);
			arg1.gdata(var7, 0, 188, var6);
			this.field1290[arg3] = var8;
			arg4.method129(var8, -323);
		}
		if ((arg0 & 0x2) == 2) {
			int var9 = arg1.g2();
			if (var9 == 65535) {
				var9 = -1;
			}
			if (arg4.field432 == var9) {
				arg4.field436 = 0;
			}
			int var10 = arg1.g1();
			if (arg4.field432 == var9 && var9 != -1) {
				int var11 = SeqType.types[var9].replacemode;
				if (var11 == 1) {
					arg4.field433 = 0;
					arg4.field434 = 0;
					arg4.field435 = var10;
					arg4.field436 = 0;
				}
				if (var11 == 2) {
					arg4.field436 = 0;
				}
			} else if (var9 == -1 || arg4.field432 == -1 || SeqType.types[var9].priority >= SeqType.types[arg4.field432].priority) {
				arg4.field432 = var9;
				arg4.field433 = 0;
				arg4.field434 = 0;
				arg4.field435 = var10;
				arg4.field436 = 0;
				arg4.field457 = arg4.field452;
			}
		}
		if ((arg0 & 0x4) == 4) {
			arg4.field426 = arg1.g2();
			if (arg4.field426 == 65535) {
				arg4.field426 = -1;
			}
		}
		if ((arg0 & 0x8) == 8) {
			arg4.field416 = arg1.gjstr();
			arg4.field418 = 0;
			arg4.field419 = 0;
			arg4.field417 = 150;
			this.method431(arg4.field416, arg4.field465, 2, false);
		}
		if ((arg0 & 0x10) == 16) {
			int var12 = arg1.g1();
			int var13 = arg1.g1();
			arg4.method127(var13, 0, var12);
			arg4.field423 = loopCycle + 300;
			arg4.field424 = arg1.g1();
			arg4.field425 = arg1.g1();
		}
		if ((arg0 & 0x20) == 32) {
			arg4.field427 = arg1.g2();
			arg4.field428 = arg1.g2();
		}
		if ((arg0 & 0x40) == 64) {
			int var14 = arg1.g2();
			int var15 = arg1.g1();
			int var16 = arg1.g1();
			int var17 = arg1.pos;
			if (arg4.field465 != null && arg4.field466) {
				long var18 = JString.method309(arg4.field465);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < this.field1359; var21++) {
						if (this.field1339[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}
				if (!var20 && this.field1360 == 0) {
					try {
						String var22 = WordPack.method316(var16, 355, arg1);
						String var23 = WordFilter.method399(var22, (byte) 5);
						arg4.field416 = var23;
						arg4.field418 = var14 >> 8;
						arg4.field419 = var14 & 0xFF;
						arg4.field417 = 150;
						if (var15 == 2 || var15 == 3) {
							this.method431(var23, "@cr2@" + arg4.field465, 1, false);
						} else if (var15 == 1) {
							this.method431(var23, "@cr1@" + arg4.field465, 1, false);
						} else {
							this.method431(var23, arg4.field465, 2, false);
						}
					} catch (Exception var28) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg1.pos = var16 + var17;
		}
		if ((arg0 & 0x100) == 256) {
			arg4.field437 = arg1.g2();
			int var25 = arg1.g4();
			arg4.field441 = var25 >> 16;
			arg4.field440 = (var25 & 0xFFFF) + loopCycle;
			arg4.field438 = 0;
			arg4.field439 = 0;
			if (arg4.field440 > loopCycle) {
				arg4.field438 = -1;
			}
			if (arg4.field437 == 65535) {
				arg4.field437 = -1;
			}
		}
		if ((arg0 & 0x200) == 512) {
			arg4.field442 = arg1.g1();
			arg4.field444 = arg1.g1();
			arg4.field443 = arg1.g1();
			arg4.field445 = arg1.g1();
			arg4.field446 = arg1.g2() + loopCycle;
			arg4.field447 = arg1.g2() + loopCycle;
			arg4.field448 = arg1.g1();
			arg4.method125(2);
		}
		if ((arg0 & 0x400) != 1024) {
			return;
		}
		int var26 = arg1.g1();
		int var27 = arg1.g1();
		arg4.method127(var27, 0, var26);
		arg4.field423 = loopCycle + 300;
		arg4.field424 = arg1.g1();
		arg4.field425 = arg1.g1();
	}

	@ObfuscatedName("client.a(IIIIILd;I)V")
	public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, Component arg5, int arg6) {
		if (arg5.field80 != 0 || arg5.field95 == null || arg5.field94 || (arg0 < arg4 || arg2 < arg1 || arg0 > arg5.field83 + arg4 || arg2 > arg5.field84 + arg1)) {
			return;
		}
		int var8 = arg5.field95.length;
		if (arg3 != 7) {
			return;
		}
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg5.field96[var9] + arg4;
			int var11 = arg5.field97[var9] + arg1 - arg6;
			Component var12 = Component.types[arg5.field95[var9]];
			int var13 = var12.field86 + var10;
			int var14 = var12.field87 + var11;
			if ((var12.field91 >= 0 || var12.field117 != 0) && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
				if (var12.field91 >= 0) {
					this.field1296 = var12.field91;
				} else {
					this.field1296 = var12.field78;
				}
			}
			if (var12.field80 == 0) {
				this.method523(arg0, var14, arg2, 7, var13, var12, var12.field93);
				if (var12.field92 > var12.field84) {
					this.method542(var12, var14, true, arg2, var12.field84, var12.field92, arg0, var12.field83 + var13, -960);
				}
			} else {
				if (var12.field81 == 1 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					boolean var15 = false;
					if (var12.field82 != 0) {
						var15 = this.method558(this.field1306, var12);
					}
					if (!var15) {
						this.field1579[this.field1564] = var12.field132;
						this.field1203[this.field1564] = 951;
						this.field1202[this.field1564] = var12.field78;
						this.field1564++;
					}
				}
				if (var12.field81 == 2 && this.field1307 == 0 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					String var16 = var12.field129;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					this.field1579[this.field1564] = var16 + " @gre@" + var12.field130;
					this.field1203[this.field1564] = 930;
					this.field1202[this.field1564] = var12.field78;
					this.field1564++;
				}
				if (var12.field81 == 3 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					this.field1579[this.field1564] = "Close";
					this.field1203[this.field1564] = 947;
					this.field1202[this.field1564] = var12.field78;
					this.field1564++;
				}
				if (var12.field81 == 4 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					this.field1579[this.field1564] = var12.field132;
					this.field1203[this.field1564] = 465;
					this.field1202[this.field1564] = var12.field78;
					this.field1564++;
				}
				if (var12.field81 == 5 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					this.field1579[this.field1564] = var12.field132;
					this.field1203[this.field1564] = 960;
					this.field1202[this.field1564] = var12.field78;
					this.field1564++;
				}
				if (var12.field81 == 6 && !this.field1613 && arg0 >= var13 && arg2 >= var14 && arg0 < var12.field83 + var13 && arg2 < var12.field84 + var14) {
					this.field1579[this.field1564] = var12.field132;
					this.field1203[this.field1564] = 44;
					this.field1202[this.field1564] = var12.field78;
					this.field1564++;
				}
				if (var12.field80 == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.field84; var18++) {
						for (int var19 = 0; var19 < var12.field83; var19++) {
							int var20 = (var12.field103 + 32) * var19 + var13;
							int var21 = (var12.field104 + 32) * var18 + var14;
							if (var17 < 20) {
								var20 += var12.field106[var17];
								var21 += var12.field107[var17];
							}
							if (arg0 >= var20 && arg2 >= var21 && arg0 < var20 + 32 && arg2 < var21 + 32) {
								this.field1531 = var17;
								this.field1532 = var12.field78;
								if (var12.field74[var17] > 0) {
									ObjType var22 = ObjType.get(var12.field74[var17] - 1);
									if (this.field1497 == 1 && var12.field101) {
										if (this.field1499 != var12.field78 || this.field1498 != var17) {
											this.field1579[this.field1564] = "Use " + this.field1501 + " with @lre@" + var22.name;
											this.field1203[this.field1564] = 881;
											this.field1204[this.field1564] = var22.id;
											this.field1201[this.field1564] = var17;
											this.field1202[this.field1564] = var12.field78;
											this.field1564++;
										}
									} else if (this.field1307 != 1 || !var12.field101) {
										if (var12.field101) {
											for (int var23 = 4; var23 >= 3; var23--) {
												if (var22.iop != null && var22.iop[var23] != null) {
													this.field1579[this.field1564] = var22.iop[var23] + " @lre@" + var22.name;
													if (var23 == 3) {
														this.field1203[this.field1564] = 478;
													}
													if (var23 == 4) {
														this.field1203[this.field1564] = 347;
													}
													this.field1204[this.field1564] = var22.id;
													this.field1201[this.field1564] = var17;
													this.field1202[this.field1564] = var12.field78;
													this.field1564++;
												} else if (var23 == 4) {
													this.field1579[this.field1564] = "Drop @lre@" + var22.name;
													this.field1203[this.field1564] = 347;
													this.field1204[this.field1564] = var22.id;
													this.field1201[this.field1564] = var17;
													this.field1202[this.field1564] = var12.field78;
													this.field1564++;
												}
											}
										}
										if (var12.field102) {
											this.field1579[this.field1564] = "Use @lre@" + var22.name;
											this.field1203[this.field1564] = 188;
											this.field1204[this.field1564] = var22.id;
											this.field1201[this.field1564] = var17;
											this.field1202[this.field1564] = var12.field78;
											this.field1564++;
										}
										if (var12.field101 && var22.iop != null) {
											for (int var24 = 2; var24 >= 0; var24--) {
												if (var22.iop[var24] != null) {
													this.field1579[this.field1564] = var22.iop[var24] + " @lre@" + var22.name;
													if (var24 == 0) {
														this.field1203[this.field1564] = 405;
													}
													if (var24 == 1) {
														this.field1203[this.field1564] = 38;
													}
													if (var24 == 2) {
														this.field1203[this.field1564] = 422;
													}
													this.field1204[this.field1564] = var22.id;
													this.field1201[this.field1564] = var17;
													this.field1202[this.field1564] = var12.field78;
													this.field1564++;
												}
											}
										}
										if (var12.field108 != null) {
											for (int var25 = 4; var25 >= 0; var25--) {
												if (var12.field108[var25] != null) {
													this.field1579[this.field1564] = var12.field108[var25] + " @lre@" + var22.name;
													if (var25 == 0) {
														this.field1203[this.field1564] = 602;
													}
													if (var25 == 1) {
														this.field1203[this.field1564] = 596;
													}
													if (var25 == 2) {
														this.field1203[this.field1564] = 22;
													}
													if (var25 == 3) {
														this.field1203[this.field1564] = 892;
													}
													if (var25 == 4) {
														this.field1203[this.field1564] = 415;
													}
													this.field1204[this.field1564] = var22.id;
													this.field1201[this.field1564] = var17;
													this.field1202[this.field1564] = var12.field78;
													this.field1564++;
												}
											}
										}
										this.field1579[this.field1564] = "Examine @lre@" + var22.name;
										this.field1203[this.field1564] = 1773;
										this.field1204[this.field1564] = var22.id;
										this.field1202[this.field1564] = var12.field75[var17];
										this.field1564++;
									} else if ((this.field1309 & 0x10) == 16) {
										this.field1579[this.field1564] = this.field1310 + " @lre@" + var22.name;
										this.field1203[this.field1564] = 391;
										this.field1204[this.field1564] = var22.id;
										this.field1201[this.field1564] = var17;
										this.field1202[this.field1564] = var12.field78;
										this.field1564++;
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
	public final boolean method524(int arg0) {
		if (arg0 != -35584) {
			this.load();
		}
		if (this.field1274 == null) {
			return false;
		}
		try {
			int var2 = this.field1274.available();
			if (var2 == 0) {
				return false;
			}
			if (this.ptype == -1) {
				this.field1274.read(this.in.data, 0, 1);
				this.ptype = this.in.data[0] & 0xFF;
				if (this.field1537 != null) {
					this.ptype = this.ptype - this.field1537.nextInt() & 0xFF;
				}
				this.psize = Protocol.CLIENTPROT_LENGTH[this.ptype];
				var2--;
			}
			if (this.psize == -1) {
				if (var2 <= 0) {
					return false;
				}
				this.field1274.read(this.in.data, 0, 1);
				this.psize = this.in.data[0] & 0xFF;
				var2--;
			}
			if (this.psize == -2) {
				if (var2 <= 1) {
					return false;
				}
				this.field1274.read(this.in.data, 0, 2);
				this.in.pos = 0;
				this.psize = this.in.g2();
				var2 -= 2;
			}
			if (var2 < this.psize) {
				return false;
			}
			this.in.pos = 0;
			this.field1274.read(this.in.data, 0, this.psize);
			this.field1245 = 0;
			this.ptype1 = this.ptype0;
			this.ptype0 = this.field1380;
			this.field1380 = this.ptype;
			if (this.ptype == 44) {
				this.field1487 = this.in.g4();
				this.field1529 = this.in.g2();
				this.field1238 = this.in.g1();
				this.field1189 = this.in.g2();
				this.field1425 = this.in.g1();
				if (this.field1487 != 0 && this.field1273 == -1) {
					signlink.dnslookup(JString.method312(this.field1487, (byte) -35));
					this.method450(true);
					short var3 = 650;
					if (this.field1238 != 201 || this.field1425 == 1) {
						var3 = 655;
					}
					this.field1345 = "";
					this.field1451 = false;
					for (int var4 = 0; var4 < Component.types.length; var4++) {
						if (Component.types[var4] != null && Component.types[var4].field82 == var3) {
							this.field1273 = Component.types[var4].field79;
							break;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 72) {
				this.field1221 = true;
				int var5 = this.in.g2();
				Component var6 = Component.types[var5];
				int var7 = this.in.g1();
				for (int var8 = 0; var8 < var7; var8++) {
					var6.field74[var8] = this.in.g2();
					int var9 = this.in.g1();
					if (var9 == 255) {
						var9 = this.in.g4();
					}
					var6.field75[var8] = var9;
				}
				for (int var10 = var7; var10 < var6.field74.length; var10++) {
					var6.field74[var10] = 0;
					var6.field75[var10] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 164) {
				int var11 = this.in.g2();
				int var12 = this.in.g2();
				int var13 = this.in.g2();
				ObjType var14 = ObjType.get(var12);
				Component.types[var11].field120 = 4;
				Component.types[var11].field121 = var12;
				Component.types[var11].field127 = var14.xan2d;
				Component.types[var11].field128 = var14.yan2d;
				Component.types[var11].field126 = var14.zoom2d * 100 / var13;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 207) {
				int var15 = this.in.g2();
				int var16 = this.in.g2();
				if (this.field1396 != -1) {
					this.field1396 = -1;
					this.field1236 = true;
				}
				if (this.field1376) {
					this.field1376 = false;
					this.field1236 = true;
				}
				this.field1273 = var15;
				this.field1567 = var16;
				this.field1221 = true;
				this.field1384 = true;
				this.field1613 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 192) {
				this.field1264 = 255;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 70) {
				long var17 = this.in.g8(this.field1191);
				int var19 = this.in.g1();
				String var20 = JString.method313(true, JString.method310((byte) 88, var17));
				for (int var21 = 0; var21 < this.field1418; var21++) {
					if (this.field1208[var21] == var17) {
						if (this.field1470[var21] != var19) {
							this.field1470[var21] = var19;
							this.field1221 = true;
							if (var19 > 0) {
								this.method431(var20 + " has logged in.", "", 5, false);
							}
							if (var19 == 0) {
								this.method431(var20 + " has logged out.", "", 5, false);
							}
						}
						var20 = null;
						break;
					}
				}
				if (var20 != null && this.field1418 < 200) {
					this.field1208[this.field1418] = var17;
					this.field1556[this.field1418] = var20;
					this.field1470[this.field1418] = var19;
					this.field1418++;
					this.field1221 = true;
				}
				boolean var22 = false;
				while (!var22) {
					var22 = true;
					for (int var23 = 0; var23 < this.field1418 - 1; var23++) {
						if (this.field1470[var23] != field1398 && this.field1470[var23 + 1] == field1398 || this.field1470[var23] == 0 && this.field1470[var23 + 1] != 0) {
							int var24 = this.field1470[var23];
							this.field1470[var23] = this.field1470[var23 + 1];
							this.field1470[var23 + 1] = var24;
							String var25 = this.field1556[var23];
							this.field1556[var23] = this.field1556[var23 + 1];
							this.field1556[var23 + 1] = var25;
							long var26 = this.field1208[var23];
							this.field1208[var23] = this.field1208[var23 + 1];
							this.field1208[var23 + 1] = var26;
							this.field1221 = true;
							var22 = false;
						}
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 17) {
				this.logout(false);
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
				this.field1257[var28] = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 22) {
				InputTracking.setEnabled(53);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 160) {
				if (this.field1225 == 12) {
					this.field1221 = true;
				}
				this.field1388 = this.in.g2b();
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
				Component.types[var32].field115 = (var36 << 3) + (var34 << 19) + (var35 << 11);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 152) {
				this.field1626 = false;
				this.field1376 = true;
				this.field1336 = "";
				this.field1236 = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 53) {
				this.field1471 = false;
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
				if (this.field1472 != var38 && this.field1460 && !field1401) {
					this.field1568 = var38;
					this.field1569 = true;
					this.onDemand.request(2, this.field1568);
				}
				this.field1472 = var38;
				this.field1205 = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 173) {
				int var39 = this.in.g2();
				int var40 = this.in.g2();
				if (this.field1460 && !field1401) {
					this.field1568 = var39;
					this.field1569 = false;
					this.onDemand.request(2, this.field1568);
					this.field1205 = var40;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 158) {
				int var41 = this.in.g2b();
				this.field1229 = var41;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 9) {
				this.field1408 = this.in.g1();
				this.field1576 = this.in.g1();
				this.field1275 = this.in.g1();
				this.field1616 = true;
				this.field1236 = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 209 || this.ptype == 29 || this.ptype == 69 || this.ptype == 198 || this.ptype == 137 || this.ptype == 39 || this.ptype == 234 || this.ptype == 155 || this.ptype == 125 || this.ptype == 232) {
				this.method484(6, this.ptype, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 241) {
				int var42 = this.in.g2();
				int var43 = this.in.g2b();
				int var44 = this.in.g2b();
				Component var45 = Component.types[var42];
				var45.field86 = var43;
				var45.field87 = var44;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 226) {
				int var46 = this.in.g2();
				int var47 = this.in.g4();
				this.field1510[var46] = var47;
				if (this.field1278[var46] != var47) {
					this.field1278[var46] = var47;
					this.method510(var46, 7);
					this.field1221 = true;
					if (this.field1565 != -1) {
						this.field1236 = true;
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
				this.field1416 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 85) {
				this.field1592 = this.in.g2() * 30;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 245) {
				int var48 = this.in.g2();
				int var49 = this.in.g2();
				Component.types[var48].field120 = 1;
				Component.types[var48].field121 = var49;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 151) {
				int var50 = this.in.g2();
				int var51 = this.in.g1();
				int var52 = this.in.g2();
				if (this.field1614 && !field1401 && this.field1334 < 50) {
					this.field1186[this.field1334] = var50;
					this.field1230[this.field1334] = var51;
					this.field1413[this.field1334] = Wave.field903[var50] + var52;
					this.field1334++;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 87) {
				for (int var53 = 0; var53 < this.field1278.length; var53++) {
					if (this.field1510[var53] != this.field1278[var53]) {
						this.field1278[var53] = this.field1510[var53];
						this.method510(var53, 7);
						this.field1221 = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 165) {
				int var54 = this.in.g2();
				int var55 = this.in.g2();
				if (this.field1589 == var54 && this.field1590 == var55 && this.field1527 == 2) {
					this.ptype = -1;
					return true;
				}
				this.field1589 = var54;
				this.field1590 = var55;
				this.sceneBaseTileX = (this.field1589 - 6) * 8;
				this.sceneBaseTileZ = (this.field1590 - 6) * 8;
				this.field1507 = false;
				if ((this.field1589 / 8 == 48 || this.field1589 / 8 == 49) && this.field1590 / 8 == 48) {
					this.field1507 = true;
				}
				if (this.field1589 / 8 == 48 && this.field1590 / 8 == 148) {
					this.field1507 = true;
				}
				this.field1527 = 1;
				this.field1489 = System.currentTimeMillis();
				this.field1517.method267(212);
				this.field1442.method213(257, 1, 0, "Loading - please wait.", 151);
				this.field1442.method213(256, 1, 16777215, "Loading - please wait.", 150);
				this.field1517.method268(super.graphics, 4, (byte) 55, 4);
				int var56 = 0;
				for (int var57 = (this.field1589 - 6) / 8; var57 <= (this.field1589 + 6) / 8; var57++) {
					for (int var58 = (this.field1590 - 6) / 8; var58 <= (this.field1590 + 6) / 8; var58++) {
						var56++;
					}
				}
				this.field1268 = new byte[var56][];
				this.field1311 = new byte[var56][];
				this.field1405 = new int[var56];
				this.field1406 = new int[var56];
				this.field1407 = new int[var56];
				int var59 = 0;
				for (int var60 = (this.field1589 - 6) / 8; var60 <= (this.field1589 + 6) / 8; var60++) {
					for (int var61 = (this.field1590 - 6) / 8; var61 <= (this.field1590 + 6) / 8; var61++) {
						this.field1405[var59] = (var60 << 8) + var61;
						if (this.field1507 && (var61 == 49 || var61 == 149 || var61 == 147 || var60 == 50 || var60 == 49 && var61 == 47)) {
							this.field1406[var59] = -1;
							this.field1407[var59] = -1;
							var59++;
						} else {
							int var62 = this.field1406[var59] = this.onDemand.getMapFile(var61, var60, 0, field1543);
							if (var62 != -1) {
								this.onDemand.request(3, var62);
							}
							int var63 = this.field1407[var59] = this.onDemand.getMapFile(var61, var60, 1, field1543);
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
					NpcEntity var67 = this.field1438[var66];
					if (var67 != null) {
						for (int var68 = 0; var68 < 10; var68++) {
							var67.routeTileX[var68] -= var64;
							var67.routeTileZ[var68] -= var65;
						}
						var67.field404 -= var64 * 128;
						var67.field405 -= var65 * 128;
					}
				}
				for (int var69 = 0; var69 < this.field1283; var69++) {
					PlayerEntity var70 = this.field1285[var69];
					if (var70 != null) {
						for (int var71 = 0; var71 < 10; var71++) {
							var70.routeTileX[var71] -= var64;
							var70.routeTileZ[var71] -= var65;
						}
						var70.field404 -= var64 * 128;
						var70.field405 -= var65 * 128;
					}
				}
				this.field1615 = true;
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
				for (LocSpawned var83 = (LocSpawned) this.field1190.head(); var83 != null; var83 = (LocSpawned) this.field1190.next(-976)) {
					var83.field738 -= var64;
					var83.field739 -= var65;
					if (var83.field738 < 0 || var83.field739 < 0 || var83.field738 >= 104 || var83.field739 >= 104) {
						var83.unlink();
					}
				}
				if (this.field1461 != 0) {
					this.field1461 -= var64;
					this.field1462 -= var65;
				}
				this.field1471 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 214) {
				if (this.field1567 != -1) {
					this.field1567 = -1;
					this.field1221 = true;
					this.field1384 = true;
				}
				if (this.field1396 != -1) {
					this.field1396 = -1;
					this.field1236 = true;
				}
				if (this.field1376) {
					this.field1376 = false;
					this.field1236 = true;
				}
				this.field1273 = -1;
				this.field1613 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 219) {
				int var84 = this.in.g2();
				int var85 = this.in.g2();
				Component.types[var84].field124 = var85;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 95) {
				String var86 = this.in.gjstr();
				if (var86.endsWith(":tradereq:")) {
					String var87 = var86.substring(0, var86.indexOf(":"));
					long var88 = JString.method309(var87);
					boolean var90 = false;
					for (int var91 = 0; var91 < this.field1359; var91++) {
						if (this.field1339[var91] == var88) {
							var90 = true;
							break;
						}
					}
					if (!var90 && this.field1360 == 0) {
						this.method431("wishes to trade with you.", var87, 4, false);
					}
				} else if (var86.endsWith(":duelreq:")) {
					String var92 = var86.substring(0, var86.indexOf(":"));
					long var93 = JString.method309(var92);
					boolean var95 = false;
					for (int var96 = 0; var96 < this.field1359; var96++) {
						if (this.field1339[var96] == var93) {
							var95 = true;
							break;
						}
					}
					if (!var95 && this.field1360 == 0) {
						this.method431("wishes to duel with you.", var92, 8, false);
					}
				} else {
					this.method431(var86, "", 0, false);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 24) {
				this.field1221 = true;
				int var97 = this.in.g1();
				int var98 = this.in.g4();
				int var99 = this.in.g1();
				this.field1234[var97] = var98;
				this.field1519[var97] = var99;
				this.field1222[var97] = 1;
				for (int var100 = 0; var100 < 98; var100++) {
					if (var98 >= field1481[var100]) {
						this.field1222[var97] = var100 + 2;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 60) {
				Packet var101 = InputTracking.stop(0);
				if (var101 != null) {
					this.field1404.pIsaac(217, this.field1496);
					this.field1404.p2(var101.pos);
					this.field1404.pdata(var101.pos, 0, 0, var101.data);
					var101.method226(7290);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 242) {
				for (int var102 = 0; var102 < this.field1285.length; var102++) {
					if (this.field1285[var102] != null) {
						this.field1285[var102].field432 = -1;
					}
				}
				for (int var103 = 0; var103 < this.field1438.length; var103++) {
					if (this.field1438[var103] != null) {
						this.field1438[var103].field432 = -1;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 108) {
				int var104 = this.in.g2();
				Component.types[var104].field120 = 3;
				Component.types[var104].field121 = (localPlayer.field469[8] << 6) + (localPlayer.field469[0] << 12) + (localPlayer.field470[0] << 24) + (localPlayer.field470[4] << 18) + localPlayer.field469[11];
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 86) {
				this.method547(829, this.psize, this.in);
				this.field1615 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 176) {
				int var105 = this.in.g2();
				this.method471(var105, 5);
				if (this.field1396 != -1) {
					this.field1396 = -1;
					this.field1236 = true;
				}
				if (this.field1376) {
					this.field1376 = false;
					this.field1236 = true;
				}
				this.field1567 = var105;
				this.field1221 = true;
				this.field1384 = true;
				this.field1273 = -1;
				this.field1613 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 168) {
				this.field1253 = this.in.g1();
				if (this.field1253 == this.field1225) {
					if (this.field1253 == 3) {
						this.field1225 = 1;
					} else {
						this.field1225 = 3;
					}
					this.field1221 = true;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 174) {
				int var106 = this.in.g2b();
				this.field1565 = var106;
				this.field1236 = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 154) {
				int var107 = this.in.g2();
				String var108 = this.in.gjstr();
				Component.types[var107].field113 = var108;
				if (this.field1324[this.field1225] == Component.types[var107].field79) {
					this.field1221 = true;
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
				this.field1324[var110] = var109;
				this.field1221 = true;
				this.field1384 = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 56) {
				this.field1225 = this.in.g1();
				this.field1221 = true;
				this.field1384 = true;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 129) {
				int var111 = this.in.g2();
				int var112 = this.in.g2();
				Component.types[var111].field120 = 2;
				Component.types[var111].field121 = var112;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 222) {
				this.field1471 = true;
				this.field1465 = this.in.g1();
				this.field1466 = this.in.g1();
				this.field1467 = this.in.g2();
				this.field1468 = this.in.g1();
				this.field1469 = this.in.g1();
				if (this.field1469 >= 100) {
					int var113 = this.field1465 * 128 + 64;
					int var114 = this.field1466 * 128 + 64;
					int var115 = this.method473(false, var114, this.field1479, var113) - this.field1467;
					int var116 = var113 - this.field1637;
					int var117 = var115 - this.field1638;
					int var118 = var114 - this.field1639;
					int var119 = (int) Math.sqrt((double) (var116 * var116 + var118 * var118));
					this.field1640 = (int) (Math.atan2((double) var117, (double) var119) * 325.949D) & 0x7FF;
					this.field1641 = (int) (Math.atan2((double) var116, (double) var118) * -325.949D) & 0x7FF;
					if (this.field1640 < 128) {
						this.field1640 = 128;
					}
					if (this.field1640 > 383) {
						this.field1640 = 383;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 177) {
				if (this.field1225 == 12) {
					this.field1221 = true;
				}
				this.field1233 = this.in.g1();
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 62) {
				this.field1461 = 0;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 162) {
				int var120 = this.in.g2();
				Component var121 = Component.types[var120];
				for (int var122 = 0; var122 < var121.field74.length; var122++) {
					var121.field74[var122] = -1;
					var121.field74[var122] = 0;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 49) {
				this.field1581 = this.in.g1();
				if (this.field1581 == 1) {
					this.field1277 = this.in.g2();
				}
				if (this.field1581 >= 2 && this.field1581 <= 6) {
					if (this.field1581 == 2) {
						this.field1350 = 64;
						this.field1351 = 64;
					}
					if (this.field1581 == 3) {
						this.field1350 = 0;
						this.field1351 = 64;
					}
					if (this.field1581 == 4) {
						this.field1350 = 128;
						this.field1351 = 64;
					}
					if (this.field1581 == 5) {
						this.field1350 = 64;
						this.field1351 = 0;
					}
					if (this.field1581 == 6) {
						this.field1350 = 64;
						this.field1351 = 128;
					}
					this.field1581 = 2;
					this.field1347 = this.in.g2();
					this.field1348 = this.in.g2();
					this.field1349 = this.in.g1();
				}
				if (this.field1581 == 10) {
					this.field1415 = this.in.g2();
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 10) {
				int var123 = this.in.g2();
				this.method471(var123, 5);
				if (this.field1567 != -1) {
					this.field1567 = -1;
					this.field1221 = true;
					this.field1384 = true;
				}
				if (this.field1396 != -1) {
					this.field1396 = -1;
					this.field1236 = true;
				}
				if (this.field1376) {
					this.field1376 = false;
					this.field1236 = true;
				}
				this.field1273 = var123;
				this.field1613 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 189) {
				int var124 = this.in.g2();
				this.method471(var124, 5);
				if (this.field1567 != -1) {
					this.field1567 = -1;
					this.field1221 = true;
					this.field1384 = true;
				}
				this.field1396 = var124;
				this.field1236 = true;
				this.field1273 = -1;
				this.field1613 = false;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 244) {
				this.method428(-13193, this.psize, this.in);
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 132) {
				this.field1221 = true;
				int var125 = this.in.g2();
				Component var126 = Component.types[var125];
				while (this.in.pos < this.psize) {
					int var127 = this.in.g1();
					int var128 = this.in.g2();
					int var129 = this.in.g1();
					if (var129 == 255) {
						var129 = this.in.g4();
					}
					if (var127 >= 0 && var127 < var126.field74.length) {
						var126.field74[var127] = var128;
						var126.field75[var127] = var129;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 12) {
				this.field1471 = true;
				this.field1546 = this.in.g1();
				this.field1547 = this.in.g1();
				this.field1548 = this.in.g2();
				this.field1549 = this.in.g1();
				this.field1550 = this.in.g1();
				if (this.field1550 >= 100) {
					this.field1637 = this.field1546 * 128 + 64;
					this.field1639 = this.field1547 * 128 + 64;
					this.field1638 = this.method473(false, this.field1639, this.field1479, this.field1637) - this.field1548;
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 233) {
				this.field1337 = this.in.g1();
				this.field1338 = this.in.g1();
				while (this.in.pos < this.psize) {
					int var130 = this.in.g1();
					this.method484(6, var130, this.in);
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 131) {
				this.field1337 = this.in.g1();
				this.field1338 = this.in.g1();
				for (int var131 = this.field1337; var131 < this.field1337 + 8; var131++) {
					for (int var132 = this.field1338; var132 < this.field1338 + 8; var132++) {
						if (this.field1432[this.field1479][var131][var132] != null) {
							this.field1432[this.field1479][var131][var132] = null;
							this.method536(var131, var132);
						}
					}
				}
				for (LocSpawned var133 = (LocSpawned) this.field1190.head(); var133 != null; var133 = (LocSpawned) this.field1190.next(-976)) {
					if (var133.field738 >= this.field1337 && var133.field738 < this.field1337 + 8 && var133.field739 >= this.field1338 && var133.field739 < this.field1338 + 8 && this.field1479 == var133.field736) {
						var133.field747 = 0;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 30) {
				long var134 = this.in.g8(this.field1191);
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
					for (int var140 = 0; var140 < this.field1359; var140++) {
						if (this.field1339[var140] == var134) {
							var138 = true;
							break;
						}
					}
				}
				if (!var138 && this.field1360 == 0) {
					try {
						this.field1241[this.field1411] = var136;
						this.field1411 = (this.field1411 + 1) % 100;
						String var141 = WordPack.method316(this.psize - 13, 355, this.in);
						String var142 = WordFilter.method399(var141, (byte) 5);
						if (var137 == 2 || var137 == 3) {
							this.method431(var142, "@cr2@" + JString.method313(true, JString.method310((byte) 88, var134)), 7, false);
						} else if (var137 == 1) {
							this.method431(var142, "@cr1@" + JString.method313(true, JString.method310((byte) 88, var134)), 7, false);
						} else {
							this.method431(var142, JString.method313(true, JString.method310((byte) 88, var134)), 3, false);
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
				Component.types[var144].field94 = var145;
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 236) {
				int var146 = this.in.g2();
				byte var147 = this.in.g1b();
				this.field1510[var146] = var147;
				if (this.field1278[var146] != var147) {
					this.field1278[var146] = var147;
					this.method510(var146, 7);
					this.field1221 = true;
					if (this.field1565 != -1) {
						this.field1236 = true;
					}
				}
				this.ptype = -1;
				return true;
			}
			if (this.ptype == 7) {
				this.field1359 = this.psize / 8;
				for (int var148 = 0; var148 < this.field1359; var148++) {
					this.field1339[var148] = this.in.g8(this.field1191);
				}
				this.ptype = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype0 + "," + this.ptype1);
			this.logout(false);
		} catch (IOException var153) {
			this.tryReconnect(0);
		} catch (Exception var154) {
			String var150 = "T2 - " + this.ptype + "," + this.ptype0 + "," + this.ptype1 + " - " + this.psize + "," + (localPlayer.routeTileX[0] + this.sceneBaseTileX) + "," + (localPlayer.routeTileZ[0] + this.sceneBaseTileZ) + " - ";
			for (int var151 = 0; var151 < this.psize && var151 < 50; var151++) {
				var150 = var150 + this.in.data[var151] + ",";
			}
			signlink.reporterror(var150);
			this.logout(false);
		}
		return true;
	}

	@ObfuscatedName("client.a(Z)V")
	public final void draw(boolean arg0) {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			this.drawError((byte) 6);
			return;
		}
		drawCycle++;
		if (arg0) {
			this.ptype = -1;
		}
		if (this.ingame) {
			this.drawGame(-476);
		} else {
			this.drawTitle(this.field1206);
		}
		this.dragCycles = 0;
	}

	@ObfuscatedName("client.K(I)V")
	public final void unloadTitle(int arg0) {
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
		if (arg0 != 0) {
			this.load();
		}
		this.flameGradient2 = null;
		this.flameBuffer0 = null;
		this.flameBuffer1 = null;
		this.flameBuffer2 = null;
		this.imageFlamesLeft = null;
		this.imageFlamesRight = null;
		this.levelObjStacks = null;
	}

	@ObfuscatedName("client.a(Ld;II)I")
	public final int method526(Component arg0, int arg1, int arg2) {
		if (arg1 <= 0) {
			return 4;
		} else if (arg0.field88 == null || arg2 >= arg0.field88.length) {
			return -2;
		} else {
			try {
				int[] var4 = arg0.field88[arg2];
				int var5 = 0;
				int var6 = 0;
				while (true) {
					int var7 = var4[var6++];
					if (var7 == 0) {
						return var5;
					}
					if (var7 == 1) {
						var5 += this.field1519[var4[var6++]];
					}
					if (var7 == 2) {
						var5 += this.field1222[var4[var6++]];
					}
					if (var7 == 3) {
						var5 += this.field1234[var4[var6++]];
					}
					if (var7 == 4) {
						Component var8 = Component.types[var4[var6++]];
						int var9 = var4[var6++] + 1;
						for (int var10 = 0; var10 < var8.field74.length; var10++) {
							if (var8.field74[var10] == var9) {
								var5 += var8.field75[var10];
							}
						}
					}
					if (var7 == 5) {
						var5 += this.field1278[var4[var6++]];
					}
					if (var7 == 6) {
						var5 += field1481[this.field1222[var4[var6++]] - 1];
					}
					if (var7 == 7) {
						var5 += this.field1278[var4[var6++]] * 100 / 46875;
					}
					if (var7 == 8) {
						var5 += localPlayer.field471;
					}
					if (var7 == 9) {
						for (int var11 = 0; var11 < 19; var11++) {
							if (var11 == 18) {
								var11 = 20;
							}
							var5 += this.field1222[var11];
						}
					}
					if (var7 == 10) {
						Component var12 = Component.types[var4[var6++]];
						int var13 = var4[var6++] + 1;
						for (int var14 = 0; var14 < var12.field74.length; var14++) {
							if (var12.field74[var14] == var13) {
								var5 += 999999999;
								break;
							}
						}
					}
					if (var7 == 11) {
						var5 += this.field1233;
					}
					if (var7 == 12) {
						var5 += this.field1388;
					}
					if (var7 == 13) {
						int var15 = this.field1278[var4[var6++]];
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
	public final void method527(Pix8 arg0, byte arg1) {
		if (arg1 != 66) {
			return;
		}
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
		for (int var8 = 0; var8 < arg0.field686; var8++) {
			for (int var9 = 0; var9 < arg0.field685; var9++) {
				if (arg0.field683[var7++] != 0) {
					int var10 = var9 + 16 + arg0.field687;
					int var11 = var8 + 16 + arg0.field688;
					int var12 = (var11 << 7) + var10;
					this.flameBuffer0[var12] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.h(II)Ljava/lang/String;")
	public static final String method528(int arg0, int arg1) {
		if (arg0 < 1 || arg0 > 1) {
			throw new NullPointerException();
		} else if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.a(IIBIII)V")
	public final void method529(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
		int var7 = this.field1258.method89(arg1, arg5, arg0);
		if (var7 != 0) {
			int var8 = this.field1258.method93(arg1, arg5, arg0, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg4;
			if (var7 > 0) {
				var11 = arg3;
			}
			int[] var12 = this.field1463.field670;
			int var13 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
			int var14 = var7 >> 14 & 0x7FFF;
			LocType var15 = LocType.method333(var14);
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
				Pix8 var16 = this.field1574[var15.mapscene];
				if (var16 != null) {
					int var17 = (var15.width * 4 - var16.field685) / 2;
					int var18 = (var15.length * 4 - var16.field686) / 2;
					var16.method211((byte) 9, arg5 * 4 + 48 + var17, (104 - arg0 - var15.length) * 4 + 48 + var18);
				}
			}
		}
		int var19 = this.field1258.method91(arg1, arg5, arg0);
		if (var19 != 0) {
			int var20 = this.field1258.method93(arg1, arg5, arg0, var19);
			int var21 = var20 >> 6 & 0x3;
			int var22 = var20 & 0x1F;
			int var23 = var19 >> 14 & 0x7FFF;
			LocType var24 = LocType.method333(var23);
			if (var24.mapscene != -1) {
				Pix8 var25 = this.field1574[var24.mapscene];
				if (var25 != null) {
					int var26 = (var24.width * 4 - var25.field685) / 2;
					int var27 = (var24.length * 4 - var25.field686) / 2;
					var25.method211((byte) 9, arg5 * 4 + 48 + var26, (104 - arg0 - var24.length) * 4 + 48 + var27);
				}
			} else if (var22 == 9) {
				int var28 = 15658734;
				if (var19 > 0) {
					var28 = 15597568;
				}
				int[] var29 = this.field1463.field670;
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
		int var31 = this.field1258.method92(arg1, arg5, arg0);
		if (arg2 != -24) {
			for (int var32 = 1; var32 > 0; var32++) {
			}
		}
		if (var31 == 0) {
			return;
		}
		int var33 = var31 >> 14 & 0x7FFF;
		LocType var34 = LocType.method333(var33);
		if (var34.mapscene == -1) {
			return;
		}
		Pix8 var35 = this.field1574[var34.mapscene];
		if (var35 != null) {
			int var36 = (var34.width * 4 - var35.field685) / 2;
			int var37 = (var34.length * 4 - var35.field686) / 2;
			var35.method211((byte) 9, arg5 * 4 + 48 + var36, (104 - arg0 - var34.length) * 4 + 48 + var37);
			return;
		}
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.L(I)V")
	public final void method530(int arg0) {
		if (arg0 >= 0 || this.field1527 != 2) {
			return;
		}
		for (LocSpawned var2 = (LocSpawned) this.field1190.head(); var2 != null; var2 = (LocSpawned) this.field1190.next(-976)) {
			if (var2.field747 > 0) {
				var2.field747--;
			}
			if (var2.field747 != 0) {
				if (var2.field746 > 0) {
					var2.field746--;
				}
				if (var2.field746 == 0 && (var2.field743 < 0 || World.method30(21, var2.field743, var2.field745))) {
					this.method470(var2.field743, var2.field738, var2.field744, var2.field745, var2.field736, -21245, var2.field739, var2.field737);
					var2.field746 = -1;
					if (var2.field743 == var2.field740 && var2.field740 == -1) {
						var2.unlink();
					} else if (var2.field743 == var2.field740 && var2.field744 == var2.field741 && var2.field745 == var2.field742) {
						var2.unlink();
					}
				}
			} else if (var2.field740 < 0 || World.method30(21, var2.field740, var2.field742)) {
				this.method470(var2.field740, var2.field738, var2.field741, var2.field742, var2.field736, -21245, var2.field739, var2.field737);
				var2.unlink();
			}
		}
		field1453++;
		if (field1453 > 85) {
			field1453 = 0;
			this.field1404.pIsaac(232, this.field1496);
			return;
		}
	}

	@ObfuscatedName("client.d(I)V")
	public final void unload(int arg0) {
		signlink.reporterror = false;
		try {
			if (this.field1274 != null) {
				this.field1274.close();
			}
		} catch (Exception var2) {
		}
		this.field1274 = null;
		this.method503(0);
		if (this.field1623 != null) {
			this.field1623.active = false;
		}
		this.field1623 = null;
		this.onDemand.stop();
		this.onDemand = null;
		this.field1404 = null;
		this.field1521 = null;
		this.in = null;
		this.field1405 = null;
		this.field1268 = null;
		this.field1311 = null;
		this.field1406 = null;
		this.field1407 = null;
		this.field1409 = null;
		this.field1281 = null;
		this.field1258 = null;
		this.field1554 = null;
		this.field1271 = null;
		this.field1239 = null;
		this.field1511 = null;
		this.field1512 = null;
		this.field1214 = null;
		this.field1515 = null;
		this.field1516 = null;
		this.field1517 = null;
		this.field1518 = null;
		this.field1325 = null;
		this.field1326 = null;
		this.field1327 = null;
		this.field1313 = null;
		this.field1314 = null;
		this.field1315 = null;
		this.field1316 = null;
		this.field1317 = null;
		this.field1318 = null;
		this.field1319 = null;
		this.field1320 = null;
		this.field1321 = null;
		this.field1445 = null;
		this.field1446 = null;
		this.field1447 = null;
		this.field1422 = null;
		this.field1423 = null;
		this.field1424 = null;
		this.field1593 = null;
		this.field1391 = null;
		this.field1392 = null;
		this.field1393 = null;
		this.field1394 = null;
		this.field1395 = null;
		this.field1583 = null;
		this.field1584 = null;
		this.field1585 = null;
		this.field1586 = null;
		this.field1587 = null;
		this.field1478 = null;
		this.field1514 = null;
		this.field1389 = null;
		this.field1599 = null;
		this.field1491 = null;
		this.field1492 = null;
		this.field1493 = null;
		this.field1494 = null;
		this.field1574 = null;
		this.field1566 = null;
		this.field1200 = null;
		this.field1285 = null;
		this.field1287 = null;
		this.field1289 = null;
		this.field1290 = null;
		if (this.field1575 != arg0) {
			this.field1191 = this.field1537.nextInt();
		}
		this.field1323 = null;
		this.field1438 = null;
		this.field1440 = null;
		this.field1432 = null;
		this.field1190 = null;
		this.field1573 = null;
		this.field1591 = null;
		this.field1201 = null;
		this.field1202 = null;
		this.field1203 = null;
		this.field1204 = null;
		this.field1579 = null;
		this.field1278 = null;
		this.field1211 = null;
		this.field1212 = null;
		this.field1448 = null;
		this.field1463 = null;
		this.field1556 = null;
		this.field1208 = null;
		this.field1470 = null;
		this.field1367 = null;
		this.field1368 = null;
		this.field1364 = null;
		this.field1365 = null;
		this.field1366 = null;
		this.field1369 = null;
		this.field1370 = null;
		this.field1371 = null;
		this.field1372 = null;
		this.unloadTitle(0);
		LocType.unload((byte) 9);
		NpcType.unload((byte) 9);
		ObjType.unload((byte) 9);
		FloType.types = null;
		IdkType.types = null;
		Component.types = null;
		UnkType.types = null;
		SeqType.types = null;
		SpotAnimType.types = null;
		SpotAnimType.field1151 = null;
		VarpType.types = null;
		super.drawArea = null;
		PlayerEntity.field486 = null;
		Pix3D.unload((byte) 9);
		World3D.unload((byte) 9);
		Model.unload((byte) 9);
		AnimFrame.unload((byte) 9);
		System.gc();
	}

	@ObfuscatedName("client.j(Z)Ljava/lang/String;")
	public final String method531(boolean arg0) {
		if (arg0) {
			this.ptype = this.in.g1();
		}
		if (signlink.mainapp == null) {
			return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.b(Ld;B)Z")
	public final boolean method532(Component arg0, byte arg1) {
		if (arg1 != 7) {
			this.ptype = -1;
		}
		int var3 = arg0.field82;
		if (var3 == 201) {
			this.field1236 = true;
			this.field1376 = false;
			this.field1626 = true;
			this.field1449 = "";
			this.field1256 = 1;
			this.field1213 = "Enter name of friend to add to list";
		}
		if (var3 == 202) {
			this.field1236 = true;
			this.field1376 = false;
			this.field1626 = true;
			this.field1449 = "";
			this.field1256 = 2;
			this.field1213 = "Enter name of friend to delete from list";
		}
		if (var3 == 205) {
			this.field1247 = 250;
			return true;
		}
		if (var3 == 501) {
			this.field1236 = true;
			this.field1376 = false;
			this.field1626 = true;
			this.field1449 = "";
			this.field1256 = 4;
			this.field1213 = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.field1236 = true;
			this.field1376 = false;
			this.field1626 = true;
			this.field1449 = "";
			this.field1256 = 5;
			this.field1213 = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.field1597[var4];
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
					if (!IdkType.types[var6].disable && IdkType.types[var6].type == var4 + (this.field1570 ? 0 : 7)) {
						this.field1597[var4] = var6;
						this.field1196 = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.field1557[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = field1379[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= field1379[var7].length) {
					var9 = 0;
				}
			}
			this.field1557[var7] = var9;
			this.field1196 = true;
		}
		if (var3 == 324 && !this.field1570) {
			this.field1570 = true;
			this.method501(0);
		}
		if (var3 == 325 && this.field1570) {
			this.field1570 = false;
			this.method501(0);
		}
		if (var3 == 326) {
			this.field1404.pIsaac(8, this.field1496);
			this.field1404.p1(this.field1570 ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.field1404.p1(this.field1597[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.field1404.p1(this.field1557[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			this.field1451 = !this.field1451;
		}
		if (var3 >= 601 && var3 <= 612) {
			this.method450(true);
			if (this.field1345.length() > 0) {
				this.field1404.pIsaac(251, this.field1496);
				this.field1404.p8(JString.method309(this.field1345), this.field1377);
				this.field1404.p1(var3 - 601);
				this.field1404.p1(this.field1451 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.a(ZII)V")
	public final void method533(boolean arg0, int arg1, int arg2) {
		if (arg0) {
			this.load();
		}
		int var4 = 0;
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.field1431[var5] != null) {
				int var6 = this.field1429[var5];
				int var7 = 70 - var4 * 14 + this.field1248 + 4;
				if (var7 < -20) {
					break;
				}
				String var8 = this.field1430[var5];
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
				if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1408 == 0 || this.field1408 == 1 && this.method502(var8, (byte) 1))) {
					if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(localPlayer.field465)) {
						if (this.field1378 >= 1) {
							this.field1579[this.field1564] = "Report abuse @whi@" + var8;
							this.field1203[this.field1564] = 34;
							this.field1564++;
						}
						this.field1579[this.field1564] = "Add ignore @whi@" + var8;
						this.field1203[this.field1564] = 436;
						this.field1564++;
						this.field1579[this.field1564] = "Add friend @whi@" + var8;
						this.field1203[this.field1564] = 406;
						this.field1564++;
					}
					var4++;
				}
				if ((var6 == 3 || var6 == 7) && this.field1346 == 0 && (var6 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var8, (byte) 1))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						if (this.field1378 >= 1) {
							this.field1579[this.field1564] = "Report abuse @whi@" + var8;
							this.field1203[this.field1564] = 34;
							this.field1564++;
						}
						this.field1579[this.field1564] = "Add ignore @whi@" + var8;
						this.field1203[this.field1564] = 436;
						this.field1564++;
						this.field1579[this.field1564] = "Add friend @whi@" + var8;
						this.field1203[this.field1564] = 406;
						this.field1564++;
					}
					var4++;
				}
				if (var6 == 4 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						this.field1579[this.field1564] = "Accept trade @whi@" + var8;
						this.field1203[this.field1564] = 903;
						this.field1564++;
					}
					var4++;
				}
				if ((var6 == 5 || var6 == 6) && this.field1346 == 0 && this.field1576 < 2) {
					var4++;
				}
				if (var6 == 8 && (this.field1275 == 0 || this.field1275 == 1 && this.method502(var8, (byte) 1))) {
					if (arg2 > var7 - 14 && arg2 <= var7) {
						this.field1579[this.field1564] = "Accept duel @whi@" + var8;
						this.field1203[this.field1564] = 363;
						this.field1564++;
					}
					var4++;
				}
			}
		}
	}

	@ObfuscatedName("client.a(IZZ)V")
	public final void method534(int arg0, boolean arg1, boolean arg2) {
		signlink.midivol = arg0;
		if (arg2) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		if (arg1) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method535(int arg0) {
		if (arg0 != 0) {
			this.ptype = this.in.g1();
		}
		if (this.field1414 == 0) {
			int var2 = super.screenWidth / 2 - 80;
			int var3 = super.screenHeight / 2 + 20;
			int var14 = var3 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.field1414 = 3;
				this.field1526 = 0;
			}
			int var4 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
				this.field1508 = "";
				this.field1509 = "Enter your username & password.";
				this.field1414 = 2;
				this.field1526 = 0;
			}
		} else if (this.field1414 == 2) {
			int var5 = super.screenHeight / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var16 - 15 && super.mouseClickY < var16) {
				this.field1526 = 0;
			}
			var5 = var16 + 15;
			if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
				this.field1526 = 1;
			}
			var5 += 15;
			int var6 = super.screenWidth / 2 - 80;
			int var7 = super.screenHeight / 2 + 50;
			int var17 = var7 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.method448(this.field1577, this.field1578, false);
				if (this.ingame) {
					return;
				}
			}
			int var8 = super.screenWidth / 2 + 80;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
				this.field1414 = 0;
				this.field1577 = "";
				this.field1578 = "";
			}
			while (true) {
				while (true) {
					int var9 = this.pollKey(9);
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < field1224.length(); var11++) {
						if (var9 == field1224.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (this.field1526 == 0) {
						if (var9 == 8 && this.field1577.length() > 0) {
							this.field1577 = this.field1577.substring(0, this.field1577.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field1526 = 1;
						}
						if (var10) {
							this.field1577 = this.field1577 + (char) var9;
						}
						if (this.field1577.length() > 12) {
							this.field1577 = this.field1577.substring(0, 12);
						}
					} else if (this.field1526 == 1) {
						if (var9 == 8 && this.field1578.length() > 0) {
							this.field1578 = this.field1578.substring(0, this.field1578.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field1526 = 0;
						}
						if (var10) {
							this.field1578 = this.field1578 + (char) var9;
						}
						if (this.field1578.length() > 20) {
							this.field1578 = this.field1578.substring(0, 20);
						}
					}
				}
			}
		} else if (this.field1414 == 3) {
			int var12 = super.screenWidth / 2;
			int var13 = super.screenHeight / 2 + 50;
			int var18 = var13 + 20;
			if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
				this.field1414 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.i(II)V")
	public final void method536(int arg0, int arg1) {
		LinkList var3 = this.field1432[this.field1479][arg0][arg1];
		if (var3 == null) {
			this.field1258.method84(this.field1479, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ObjStackEntity var5 = null;
		for (ObjStackEntity var6 = (ObjStackEntity) var3.head(); var6 != null; var6 = (ObjStackEntity) var3.next(-976)) {
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
		var3.addHead(var5, (byte) 80);
		ObjStackEntity var7 = null;
		ObjStackEntity var8 = null;
		for (ObjStackEntity var9 = (ObjStackEntity) var3.head(); var9 != null; var9 = (ObjStackEntity) var3.next(-976)) {
			if (var5.field500 != var9.field500 && var7 == null) {
				var7 = var9;
			}
			if (var5.field500 != var9.field500 && var7.field500 != var9.field500 && var8 == null) {
				var8 = var9;
			}
		}
		int var10 = (arg1 << 7) + arg0 + 1610612736;
		this.field1258.method70(var10, false, this.method473(false, arg1 * 128 + 64, this.field1479, arg0 * 128 + 64), arg0, arg1, var8, var5, this.field1479, var7);
	}

	@ObfuscatedName("client.N(I)V")
	public final void method537(int arg0) {
		try {
			this.field1265 = -1;
			this.field1591.clear();
			this.field1573.clear();
			Pix3D.method179(7);
			this.method481(true);
			this.field1258.method63(0);
			for (int var2 = 0; var2 < 4; var2++) {
				this.field1554[var2].reset((byte) 0);
			}
			System.gc();
			World var3 = new World(true, this.field1409, this.field1281, 104, 104);
			int var4 = this.field1268.length;
			World.field45 = World3D.field295;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = this.field1405[var5] >> 8;
				int var7 = this.field1405[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					World.field45 = false;
				}
			}
			if (World.field45) {
				this.field1258.method64(-229, this.field1479);
			} else {
				this.field1258.method64(-229, 0);
			}
			this.field1404.pIsaac(107, this.field1496);
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (this.field1405[var8] >> 8) * 64 - this.sceneBaseTileX;
				int var10 = (this.field1405[var8] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] var11 = this.field1268[var8];
				if (var11 != null) {
					var3.method15(this.field1357, var11, var9, var10, (this.field1589 - 6) * 8, (this.field1590 - 6) * 8);
				}
			}
			for (int var12 = 0; var12 < var4; var12++) {
				int var13 = (this.field1405[var12] >> 8) * 64 - this.sceneBaseTileX;
				int var14 = (this.field1405[var12] & 0xFF) * 64 - this.sceneBaseTileZ;
				byte[] var15 = this.field1268[var12];
				if (var15 == null && this.field1590 < 800) {
					var3.method14(var13, var14, 64, true, 64);
				}
			}
			this.field1404.pIsaac(107, this.field1496);
			for (int var16 = 0; var16 < var4; var16++) {
				byte[] var17 = this.field1311[var16];
				if (var17 != null) {
					int var18 = (this.field1405[var16] >> 8) * 64 - this.sceneBaseTileX;
					int var19 = (this.field1405[var16] & 0xFF) * 64 - this.sceneBaseTileZ;
					var3.method18(var19, this.field1258, this.field1554, var18, true, var17);
				}
			}
			this.field1404.pIsaac(107, this.field1496);
			var3.method20(this.field1258, this.field1554, false);
			this.field1517.method267(212);
			this.field1404.pIsaac(107, this.field1496);
			for (int var20 = 0; var20 < 104; var20++) {
				for (int var21 = 0; var21 < 104; var21++) {
					this.method536(var20, var21);
				}
			}
			this.method513(-592);
		} catch (Exception var34) {
		}
		LocType.modelCacheStatic.method116();
		if (arg0 >= 0) {
			field1282 = !field1282;
		}
		if (field1401 && signlink.cache_dat != null) {
			int var23 = this.onDemand.getFileCount(0, 0);
			for (int var24 = 0; var24 < var23; var24++) {
				int var25 = this.onDemand.getModelFlags(-250, var24);
				if ((var25 & 0x79) == 0) {
					Model.unload(-209, var24);
				}
			}
		}
		System.gc();
		Pix3D.method180(field1545, 20);
		this.onDemand.method292(0);
		int var26 = (this.field1589 - 6) / 8 - 1;
		int var27 = (this.field1589 + 6) / 8 + 1;
		int var28 = (this.field1590 - 6) / 8 - 1;
		int var29 = (this.field1590 + 6) / 8 + 1;
		if (this.field1507) {
			var26 = 49;
			var27 = 50;
			var28 = 49;
			var29 = 50;
		}
		for (int var30 = var26; var30 <= var27; var30++) {
			for (int var31 = var28; var31 <= var29; var31++) {
				if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
					int var32 = this.onDemand.getMapFile(var31, var30, 0, field1543);
					if (var32 != -1) {
						this.onDemand.method293(3, var32, -938);
					}
					int var33 = this.onDemand.getMapFile(var31, var30, 1, field1543);
					if (var33 != -1) {
						this.onDemand.method293(3, var33, -938);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method538(int arg0) {
		short var2 = 256;
		if (this.field1292 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.field1292 > 768) {
					this.flameGradient[var3] = this.method461((byte) 8, 1024 - this.field1292, this.flameGradient0[var3], this.flameGradient1[var3]);
				} else if (this.field1292 > 256) {
					this.flameGradient[var3] = this.flameGradient1[var3];
				} else {
					this.flameGradient[var3] = this.method461((byte) 8, 256 - this.field1292, this.flameGradient1[var3], this.flameGradient0[var3]);
				}
			}
		} else if (this.field1293 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.field1293 > 768) {
					this.flameGradient[var4] = this.method461((byte) 8, 1024 - this.field1293, this.flameGradient0[var4], this.flameGradient2[var4]);
				} else if (this.field1293 > 256) {
					this.flameGradient[var4] = this.flameGradient2[var4];
				} else {
					this.flameGradient[var4] = this.method461((byte) 8, 256 - this.field1293, this.flameGradient2[var4], this.flameGradient0[var4]);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				this.flameGradient[var5] = this.flameGradient0[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.field1367.field757[var6] = this.imageFlamesRight.field670[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var23 = (var2 - var9) * this.field1540[var9] / var2;
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
					int var30 = this.field1367.field757[var8];
					this.field1367.field757[var8++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var8 += var24;
		}
		if (arg0 != 25630) {
			return;
		}
		this.field1367.method268(super.graphics, 0, (byte) 55, 0);
		for (int var10 = 0; var10 < 33920; var10++) {
			this.field1368.field757[var10] = this.levelObjStacks.field670[var10];
		}
		int var11 = 0;
		int var12 = 1176;
		for (int var13 = 1; var13 < var2 - 1; var13++) {
			int var14 = (var2 - var13) * this.field1540[var13] / var2;
			int var15 = 103 - var14;
			int var16 = var12 + var14;
			for (int var17 = 0; var17 < var15; var17++) {
				int var18 = this.flameBuffer2[var11++];
				if (var18 == 0) {
					var16++;
				} else {
					int var20 = 256 - var18;
					int var21 = this.flameGradient[var18];
					int var22 = this.field1368.field757[var16];
					this.field1368.field757[var16++] = ((var21 & 0xFF00FF) * var18 + (var22 & 0xFF00FF) * var20 & 0xFF00FF00) + ((var21 & 0xFF00) * var18 + (var22 & 0xFF00) * var20 & 0xFF0000) >> 8;
				}
			}
			var11 += 128 - var15;
			var12 = 128 - var15 - var14 + var16;
		}
		this.field1368.method268(super.graphics, 0, (byte) 55, 637);
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method539(byte arg0, int arg1) {
		int[] var3 = this.field1463.field670;
		int var4 = var3.length;
		if (arg0 != -24) {
			this.ptype = -1;
		}
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var23 = (103 - var6) * 512 * 4 + 24628;
			for (int var24 = 1; var24 < 103; var24++) {
				if ((this.field1281[arg1][var24][var6] & 0x18) == 0) {
					this.field1258.method98(var3, var23, 512, arg1, var24, var6);
				}
				if (arg1 < 3 && (this.field1281[arg1 + 1][var24][var6] & 0x8) != 0) {
					this.field1258.method98(var3, var23, 512, arg1 + 1, var24, var6);
				}
				var23 += 4;
			}
		}
		int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.field1463.method193(212);
		for (int var9 = 1; var9 < 103; var9++) {
			for (int var22 = 1; var22 < 103; var22++) {
				if ((this.field1281[arg1][var22][var9] & 0x18) == 0) {
					this.method529(var9, arg1, (byte) -24, var8, var7, var22);
				}
				if (arg1 < 3 && (this.field1281[arg1 + 1][var22][var9] & 0x8) != 0) {
					this.method529(var9, arg1 + 1, (byte) -24, var8, var7, var22);
				}
			}
		}
		this.field1517.method267(212);
		this.field1210 = 0;
		for (int var10 = 0; var10 < 104; var10++) {
			for (int var11 = 0; var11 < 104; var11++) {
				int var12 = this.field1258.method92(this.field1479, var10, var11);
				if (var12 != 0) {
					int var13 = var12 >> 14 & 0x7FFF;
					int var14 = LocType.method333(var13).mapfunction;
					if (var14 >= 0) {
						int var15 = var10;
						int var16 = var11;
						if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
							byte var17 = 104;
							byte var18 = 104;
							int[][] var19 = this.field1554[this.field1479].flags;
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
						this.field1448[this.field1210] = this.field1566[var14];
						this.field1211[this.field1210] = var15;
						this.field1212[this.field1210] = var16;
						this.field1210++;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.k(Z)V")
	public final void method540(boolean arg0) {
		if (this.field1364 != null) {
			return;
		}
		super.drawArea = null;
		this.field1518 = null;
		this.field1516 = null;
		this.field1515 = null;
		this.field1517 = null;
		this.field1325 = null;
		this.field1326 = null;
		this.field1327 = null;
		this.field1367 = new PixMap(this.getBaseComponent(3), 265, 128, 2);
		Pix2D.method167(false);
		this.field1368 = new PixMap(this.getBaseComponent(3), 265, 128, 2);
		this.ingame &= arg0;
		Pix2D.method167(false);
		this.field1364 = new PixMap(this.getBaseComponent(3), 171, 509, 2);
		Pix2D.method167(false);
		this.field1365 = new PixMap(this.getBaseComponent(3), 132, 360, 2);
		Pix2D.method167(false);
		this.field1366 = new PixMap(this.getBaseComponent(3), 200, 360, 2);
		Pix2D.method167(false);
		this.field1369 = new PixMap(this.getBaseComponent(3), 238, 202, 2);
		Pix2D.method167(false);
		this.field1370 = new PixMap(this.getBaseComponent(3), 238, 203, 2);
		Pix2D.method167(false);
		this.field1371 = new PixMap(this.getBaseComponent(3), 94, 74, 2);
		Pix2D.method167(false);
		this.field1372 = new PixMap(this.getBaseComponent(3), 94, 75, 2);
		Pix2D.method167(false);
		if (this.field1390 != null) {
			this.method435(true);
			this.method495(field1374);
		}
		this.field1483 = true;
	}

	@ObfuscatedName("client.k(B)V")
	public final void method541(byte arg0) {
		int var2 = this.field1443.method215("Choose Option", (byte) 4);
		if (arg0 != 2) {
			return;
		}
		for (int var3 = 0; var3 < this.field1564; var3++) {
			int var11 = this.field1443.method215(this.field1579[var3], (byte) 4);
			if (var11 > var2) {
				var2 = var11;
			}
		}
		var2 += 8;
		int var4 = this.field1564 * 15 + 21;
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
			this.field1356 = true;
			this.field1455 = 0;
			this.field1456 = var5;
			this.field1457 = var6;
			this.field1458 = var2;
			this.field1459 = this.field1564 * 15 + 22;
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
			this.field1356 = true;
			this.field1455 = 1;
			this.field1456 = var7;
			this.field1457 = var8;
			this.field1458 = var2;
			this.field1459 = this.field1564 * 15 + 22;
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
		this.field1356 = true;
		this.field1455 = 2;
		this.field1456 = var9;
		this.field1457 = var10;
		this.field1458 = var2;
		this.field1459 = this.field1564 * 15 + 22;
	}

	@ObfuscatedName("client.a(Ld;IZIIIIII)V")
	public final void method542(Component arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg8 >= 0) {
			return;
		}
		if (this.field1249) {
			this.field1594 = 32;
		} else {
			this.field1594 = 0;
		}
		this.field1249 = false;
		if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 && arg3 < arg1 + 16) {
			arg0.field93 -= this.dragCycles * 4;
			if (arg2) {
				this.field1221 = true;
				return;
			}
		} else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg3 >= arg1 + arg4 - 16 && arg3 < arg1 + arg4) {
			arg0.field93 += this.dragCycles * 4;
			if (arg2) {
				this.field1221 = true;
				return;
			}
		} else if (arg6 >= arg7 - this.field1594 && arg6 < arg7 + 16 + this.field1594 && arg3 >= arg1 + 16 && arg3 < arg1 + arg4 - 16 && this.dragCycles > 0) {
			int var10 = (arg4 - 32) * arg4 / arg5;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg3 - arg1 - 16 - var10 / 2;
			int var12 = arg4 - 32 - var10;
			arg0.field93 = (arg5 - arg4) * var11 / var12;
			if (arg2) {
				this.field1221 = true;
			}
			this.field1249 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method543(Packet arg0, int arg1, int arg2) {
		if (arg2 != 0) {
			this.field1404.p1(201);
		}
		while (arg0.bitPos + 10 < arg1 * 8) {
			int var4 = arg0.gBit(9, 11);
			if (var4 == 2047) {
				break;
			}
			if (this.field1285[var4] == null) {
				this.field1285[var4] = new PlayerEntity();
				if (this.field1290[var4] != null) {
					this.field1285[var4].method129(this.field1290[var4], -323);
				}
			}
			this.field1287[this.field1286++] = var4;
			PlayerEntity var5 = this.field1285[var4];
			var5.field449 = loopCycle;
			int var6 = arg0.gBit(9, 5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg0.gBit(9, 5);
			if (var7 > 15) {
				var7 -= 32;
			}
			int var8 = arg0.gBit(9, 1);
			var5.method123(var8 == 1, localPlayer.routeTileX[0] + var6, localPlayer.routeTileZ[0] + var7, this.field1523);
			int var9 = arg0.gBit(9, 1);
			if (var9 == 1) {
				this.field1289[this.field1288++] = var4;
			}
		}
		arg0.bytes(0);
	}

	@ObfuscatedName("client.a(IIILd;I)V")
	public final void method544(int arg0, int arg1, int arg2, Component arg3, int arg4) {
		if (arg3.field80 != 0 || arg3.field95 == null || arg3.field94 && this.field1541 != arg3.field78 && this.field1618 != arg3.field78 && this.field1490 != arg3.field78) {
			return;
		}
		int var6 = Pix2D.field632;
		int var7 = Pix2D.field630;
		int var8 = Pix2D.field633;
		int var9 = Pix2D.field631;
		this.psize += arg1;
		Pix2D.method166(arg3.field83 + arg4, arg3.field84 + arg2, this.field1611, arg2, arg4);
		int var10 = arg3.field95.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg3.field96[var11] + arg4;
			int var13 = arg3.field97[var11] + arg2 - arg0;
			Component var14 = Component.types[arg3.field95[var11]];
			int var15 = var14.field86 + var12;
			int var16 = var14.field87 + var13;
			if (var14.field82 > 0) {
				this.method433(var14, (byte) 102);
			}
			if (var14.field80 == 0) {
				if (var14.field93 > var14.field92 - var14.field84) {
					var14.field93 = var14.field92 - var14.field84;
				}
				if (var14.field93 < 0) {
					var14.field93 = 0;
				}
				this.method544(var14.field93, 0, var16, var14, var15);
				if (var14.field92 > var14.field84) {
					this.method551(var14.field83 + var15, var14.field92, var16, var14.field93, (byte) 9, var14.field84);
				}
			} else if (var14.field80 != 1) {
				if (var14.field80 == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.field84; var18++) {
						for (int var19 = 0; var19 < var14.field83; var19++) {
							int var20 = (var14.field103 + 32) * var19 + var15;
							int var21 = (var14.field104 + 32) * var18 + var16;
							if (var17 < 20) {
								var20 += var14.field106[var17];
								var21 += var14.field107[var17];
							}
							if (var14.field74[var17] > 0) {
								int var22 = 0;
								int var23 = 0;
								int var24 = var14.field74[var17] - 1;
								if (var20 > Pix2D.field632 - 32 && var20 < Pix2D.field633 && var21 > Pix2D.field630 - 32 && var21 < Pix2D.field631 || this.field1261 != 0 && this.field1260 == var17) {
									int var25 = 0;
									if (this.field1497 == 1 && this.field1498 == var17 && this.field1499 == var14.field78) {
										var25 = 16777215;
									}
									Pix32 var26 = ObjType.method354(var25, var14.field75[var17], var24, 723);
									if (var26 != null) {
										if (this.field1261 != 0 && this.field1260 == var17 && this.field1259 == var14.field78) {
											var22 = super.mouseX - this.field1262;
											var23 = super.mouseY - this.field1263;
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (var23 < 5 && var23 > -5) {
												var23 = 0;
											}
											if (this.field1254 < 5) {
												var22 = 0;
												var23 = 0;
											}
											var26.method200(var20 + var22, 128, 953, var21 + var23);
											if (var21 + var23 < Pix2D.field630 && arg3.field93 > 0) {
												int var27 = (Pix2D.field630 - var21 - var23) * this.field1488 / 3;
												if (var27 > this.field1488 * 10) {
													var27 = this.field1488 * 10;
												}
												if (var27 > arg3.field93) {
													var27 = arg3.field93;
												}
												arg3.field93 -= var27;
												this.field1263 += var27;
											}
											if (var21 + var23 + 32 > Pix2D.field631 && arg3.field93 < arg3.field92 - arg3.field84) {
												int var28 = (var21 + var23 + 32 - Pix2D.field631) * this.field1488 / 3;
												if (var28 > this.field1488 * 10) {
													var28 = this.field1488 * 10;
												}
												if (var28 > arg3.field92 - arg3.field84 - arg3.field93) {
													var28 = arg3.field92 - arg3.field84 - arg3.field93;
												}
												arg3.field93 += var28;
												this.field1263 -= var28;
											}
										} else if (this.field1300 != 0 && this.field1299 == var17 && this.field1298 == var14.field78) {
											var26.method200(var20, 128, 953, var21);
										} else {
											var26.method198((byte) 9, var20, var21);
										}
										if (var26.field675 == 33 || var14.field75[var17] != 1) {
											int var29 = var14.field75[var17];
											this.field1441.method216(method528(1, var29), 0, (byte) 8, var21 + 10 + var23, var20 + 1 + var22);
											this.field1441.method216(method528(1, var29), 16776960, (byte) 8, var21 + 9 + var23, var20 + var22);
										}
									}
								}
							} else if (var14.field105 != null && var17 < 20) {
								Pix32 var30 = var14.field105[var17];
								if (var30 != null) {
									var30.method198((byte) 9, var20, var21);
								}
							}
							var17++;
						}
					}
				} else if (var14.field80 == 3) {
					if (var14.field85 == 0) {
						if (var14.field109) {
							Pix2D.method169(0, var14.field115, var14.field83, var14.field84, var15, var16);
						} else {
							Pix2D.method170(var14.field84, var14.field83, var14.field115, var15, 901, var16);
						}
					} else if (var14.field109) {
						Pix2D.method168(var16, 256 - (var14.field85 & 0xFF), var14.field84, var14.field83, var14.field115, var15, (byte) -30);
					} else {
						Pix2D.method171(var14.field84, var14.field115, var15, var16, var14.field83, true, 256 - (var14.field85 & 0xFF));
					}
				} else if (var14.field80 == 4) {
					PixFont var31 = var14.field112;
					int var32 = var14.field115;
					String var33 = var14.field113;
					if ((this.field1490 == var14.field78 || this.field1618 == var14.field78 || this.field1541 == var14.field78) && var14.field117 != 0) {
						var32 = var14.field117;
					}
					if (this.method516(var14, 551)) {
						var32 = var14.field116;
						if (var14.field114.length() > 0) {
							var33 = var14.field114;
						}
					}
					if (var14.field81 == 6 && this.field1613) {
						var33 = "Please wait...";
						var32 = var14.field115;
					}
					if (Pix2D.field628 == 479) {
						if (var32 == 16776960) {
							var32 = 255;
						}
						if (var32 == 49152) {
							var32 = 16777215;
						}
					}
					int var34 = var31.field704 + var16;
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
																var33 = var33.substring(0, var39) + this.method519(this.method526(var14, 52, 4), -218) + var33.substring(var39 + 2);
															}
														}
														var33 = var33.substring(0, var38) + this.method519(this.method526(var14, 52, 3), -218) + var33.substring(var38 + 2);
													}
												}
												var33 = var33.substring(0, var37) + this.method519(this.method526(var14, 52, 2), -218) + var33.substring(var37 + 2);
											}
										}
										var33 = var33.substring(0, var36) + this.method519(this.method526(var14, 52, 1), -218) + var33.substring(var36 + 2);
									}
								}
								var33 = var33.substring(0, var35) + this.method519(this.method526(var14, 52, 0), -218) + var33.substring(var35 + 2);
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
						if (var14.field110) {
							var31.method214(var14.field83 / 2 + var15, var14.field111, var41, true, var34, var32);
						} else {
							var31.method218(var32, var15, var14.field111, false, var34, var41);
						}
						var34 += var31.field704;
					}
				} else if (var14.field80 == 5) {
					Pix32 var42;
					if (this.method516(var14, 551)) {
						var42 = var14.field119;
					} else {
						var42 = var14.field118;
					}
					if (var42 != null) {
						var42.method198((byte) 9, var15, var16);
					}
				} else if (var14.field80 == 6) {
					int var43 = Pix3D.field647;
					int var44 = Pix3D.field648;
					Pix3D.field647 = var14.field83 / 2 + var15;
					Pix3D.field648 = var14.field84 / 2 + var16;
					int var45 = Pix3D.sinTable[var14.field127] * var14.field126 >> 16;
					int var46 = Pix3D.cosTable[var14.field127] * var14.field126 >> 16;
					boolean var47 = this.method516(var14, 551);
					int var48;
					if (var47) {
						var48 = var14.field125;
					} else {
						var48 = var14.field124;
					}
					Model var49;
					if (var48 == -1) {
						var49 = var14.method34((byte) 0, -1, -1, var47);
					} else {
						SeqType var50 = SeqType.types[var48];
						var49 = var14.method34((byte) 0, var50.frames[var14.field76], var50.iframes[var14.field76], var47);
					}
					if (var49 != null) {
						var49.method158(0, var14.field128, 0, var14.field127, 0, var45, var46);
					}
					Pix3D.field647 = var43;
					Pix3D.field648 = var44;
				} else if (var14.field80 == 7) {
					PixFont var51 = var14.field112;
					int var52 = 0;
					for (int var53 = 0; var53 < var14.field84; var53++) {
						for (int var54 = 0; var54 < var14.field83; var54++) {
							if (var14.field74[var52] > 0) {
								ObjType var55 = ObjType.get(var14.field74[var52] - 1);
								String var56 = var55.name;
								if (var55.stackable || var14.field75[var52] != 1) {
									var56 = var56 + " x" + method459(5, var14.field75[var52]);
								}
								int var57 = (var14.field103 + 115) * var54 + var15;
								int var58 = (var14.field104 + 12) * var53 + var16;
								if (var14.field110) {
									var51.method214(var14.field83 / 2 + var57, var14.field111, var56, true, var58, var14.field115);
								} else {
									var51.method218(var14.field115, var57, var14.field111, false, var58, var56);
								}
							}
							var52++;
						}
					}
				}
			}
		}
		Pix2D.method166(var8, var9, this.field1611, var7, var6);
	}

	@ObfuscatedName("client.l(B)V")
	public final void drawError(byte arg0) {
		Graphics var2 = this.getBaseComponent(3).getGraphics();
		var2.setColor(Color.black);
		var2.fillRect(0, 0, 765, 503);
		this.setFramerate(1, 400);
		if (arg0 == 6) {
			boolean var3 = false;
		} else {
			this.ptype = this.in.g1();
		}
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
	public final void method546(boolean arg0) {
		if (this.field1592 > 1) {
			this.field1592--;
		}
		if (this.field1247 > 0) {
			this.field1247--;
		}
		if (this.field1264 > 0) {
			this.field1264 -= 2;
		}
		for (int var2 = 0; var2 < 5 && this.method524(-35584); var2++) {
		}
		if (!this.ingame) {
			return;
		}
		this.method548((byte) 6);
		this.method530(-63);
		this.method482(-563);
		Packet var3 = InputTracking.flush(3);
		if (var3 != null) {
			this.field1404.pIsaac(217, this.field1496);
			this.field1404.p2(var3.pos);
			this.field1404.pdata(var3.pos, 0, 0, var3.data);
			var3.method226(7290);
		}
		this.field1245++;
		if (this.field1245 > 750) {
			this.tryReconnect(0);
		}
		this.method490(20697);
		this.method437(0);
		this.method494(8);
		this.field1488++;
		if (this.field1603 != 0) {
			this.field1602 += 20;
			if (this.field1602 >= 400) {
				this.field1603 = 0;
			}
		}
		if (this.field1300 != 0) {
			this.field1297++;
			if (this.field1297 >= 15) {
				if (this.field1300 == 2) {
					this.field1221 = true;
				}
				if (this.field1300 == 3) {
					this.field1236 = true;
				}
				this.field1300 = 0;
			}
		}
		if (this.field1261 != 0) {
			this.field1254++;
			if (super.mouseX > this.field1262 + 5 || super.mouseX < this.field1262 - 5 || super.mouseY > this.field1263 + 5 || super.mouseY < this.field1263 - 5) {
				this.field1232 = true;
			}
			if (super.mouseButton == 0) {
				if (this.field1261 == 2) {
					this.field1221 = true;
				}
				if (this.field1261 == 3) {
					this.field1236 = true;
				}
				this.field1261 = 0;
				if (this.field1232 && this.field1254 >= 5) {
					this.field1532 = -1;
					this.method451(-346);
					if (this.field1532 == this.field1259 && this.field1531 != this.field1260) {
						Component var4 = Component.types[this.field1259];
						byte var5 = 0;
						if (this.field1551 == 1 && var4.field82 == 206) {
							var5 = 1;
						}
						if (var4.field74[this.field1531] <= 0) {
							var5 = 0;
						}
						if (var5 == 1) {
							int var6 = this.field1260;
							int var7 = this.field1531;
							while (var6 != var7) {
								if (var6 > var7) {
									var4.method33(var6, false, var6 - 1);
									var6--;
								} else if (var6 < var7) {
									var4.method33(var6, false, var6 + 1);
									var6++;
								}
							}
						} else {
							var4.method33(this.field1260, false, this.field1531);
						}
						this.field1404.pIsaac(81, this.field1496);
						this.field1404.p2(this.field1259);
						this.field1404.p2(this.field1260);
						this.field1404.p2(this.field1531);
						this.field1404.p1(var5);
					}
				} else if ((this.field1522 == 1 || this.method487(this.field1564 - 1, true)) && this.field1564 > 2) {
					this.method541((byte) 2);
				} else if (this.field1564 > 0) {
					this.method512(this.field1564 - 1, 0);
				}
				this.field1297 = 10;
				super.mouseClickButton = 0;
			}
		}
		field1598++;
		if (field1598 > 127) {
			field1598 = 0;
			this.field1404.pIsaac(144, this.field1496);
			this.field1404.p3(4991788);
		}
		if (World3D.field329 != -1) {
			int var8 = World3D.field329;
			int var9 = World3D.field330;
			boolean var10 = this.method515(false, 0, localPlayer.routeTileZ[0], 0, 0, true, 0, var8, 0, var9, 0, localPlayer.routeTileX[0]);
			World3D.field329 = -1;
			if (var10) {
				this.field1600 = super.mouseClickX;
				this.field1601 = super.mouseClickY;
				this.field1603 = 1;
				this.field1602 = 0;
			}
		}
		if (super.mouseClickButton == 1 && this.field1199 != null) {
			this.field1199 = null;
			this.field1236 = true;
			super.mouseClickButton = 0;
		}
		this.method434(9);
		this.method496(374);
		this.method430(10370);
		this.method432((byte) -119);
		if (super.mouseButton == 1 || super.mouseClickButton == 1) {
			this.dragCycles++;
		}
		if (this.field1527 == 2) {
			this.method514(3);
		}
		if (this.field1527 == 2 && this.field1471) {
			this.method505(5);
		}
		for (int var11 = 0; var11 < 5; var11++) {
			int var10002 = this.field1257[var11]++;
		}
		this.method508(false);
		super.idleCycles++;
		if (super.idleCycles > 4500) {
			this.field1247 = 250;
			super.idleCycles -= 500;
			this.field1404.pIsaac(146, this.field1496);
		}
		this.field1383++;
		if (this.field1383 > 500) {
			this.field1383 = 0;
			int var12 = (int) (Math.random() * 8.0D);
			if ((var12 & 0x1) == 1) {
				this.field1485 += this.field1486;
			}
			if ((var12 & 0x2) == 2) {
				this.field1266 += this.field1267;
			}
			if ((var12 & 0x4) == 4) {
				this.field1227 += this.field1228;
			}
		}
		if (this.field1485 < -50) {
			this.field1486 = 2;
		}
		if (this.field1485 > 50) {
			this.field1486 = -2;
		}
		if (this.field1266 < -55) {
			this.field1267 = 2;
		}
		if (this.field1266 > 55) {
			this.field1267 = -2;
		}
		if (this.field1227 < -40) {
			this.field1228 = 1;
		}
		if (this.field1227 > 40) {
			this.field1228 = -1;
		}
		this.field1482++;
		if (this.field1482 > 500) {
			this.field1482 = 0;
			int var13 = (int) (Math.random() * 8.0D);
			if ((var13 & 0x1) == 1) {
				this.field1533 += this.field1534;
			}
			if ((var13 & 0x2) == 2) {
				this.field1330 += this.field1331;
			}
		}
		if (this.field1533 < -60) {
			this.field1534 = 2;
		}
		if (this.field1533 > 60) {
			this.field1534 = -2;
		}
		if (this.field1330 < -20) {
			this.field1331 = 1;
		}
		if (this.field1330 > 10) {
			this.field1331 = -1;
		}
		field1194++;
		if (field1194 > 110) {
			field1194 = 0;
			this.field1404.pIsaac(41, this.field1496);
			this.field1404.p4(0);
		}
		this.field1246++;
		if (arg0) {
			this.ptype = this.in.g1();
		}
		if (this.field1246 > 50) {
			this.field1404.pIsaac(107, this.field1496);
		}
		try {
			if (this.field1274 != null && this.field1404.pos > 0) {
				this.field1274.write(this.field1404.pos, true, 0, this.field1404.data);
				this.field1404.pos = 0;
				this.field1246 = 0;
			}
		} catch (IOException var15) {
			this.tryReconnect(0);
		} catch (Exception var16) {
			this.logout(false);
		}
	}

	@ObfuscatedName("client.c(I)V")
	public final void update(int arg0) {
		if (this.errorStarted || this.errorLoading || this.errorHost) {
			return;
		}
		loopCycle++;
		if (this.ingame) {
			this.method546(false);
		} else {
			this.method535(0);
		}
		this.method460((byte) 71);
		this.psize += arg0;
	}

	@ObfuscatedName("client.c(IILmb;)V")
	public final void method547(int arg0, int arg1, Packet arg2) {
		this.field1322 = 0;
		this.field1288 = 0;
		this.method458(arg1, arg2, 515);
		if (arg0 <= 0) {
			this.field1404.p1(74);
		}
		this.method499(arg1, arg2, 5);
		this.method543(arg2, arg1, 0);
		this.method478(arg2, arg1, (byte) 7);
		for (int var4 = 0; var4 < this.field1322; var4++) {
			int var6 = this.field1323[var4];
			if (loopCycle != this.field1285[var6].field449) {
				this.field1285[var6] = null;
			}
		}
		if (arg2.pos != arg1) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.pos + " psize:" + arg1);
			throw new RuntimeException("eek");
		}
		for (int var5 = 0; var5 < this.field1286; var5++) {
			if (this.field1285[this.field1287[var5]] == null) {
				signlink.reporterror(this.field1577 + " null entry in pl list - pos:" + var5 + " size:" + this.field1286);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method548(byte arg0) {
		if (arg0 != 6) {
			this.ptype = -1;
		}
		if (field1401 && this.field1527 == 2 && World.field46 != this.field1479) {
			this.field1517.method267(212);
			this.field1442.method213(257, 1, 0, "Loading - please wait.", 151);
			this.field1442.method213(256, 1, 16777215, "Loading - please wait.", 150);
			this.field1517.method268(super.graphics, 4, (byte) 55, 4);
			this.field1527 = 1;
			this.field1489 = System.currentTimeMillis();
		}
		if (this.field1527 == 1) {
			int var2 = this.method549(-216);
			if (var2 != 0 && System.currentTimeMillis() - this.field1489 > 360000L) {
				signlink.reporterror(this.field1577 + " glcfb " + this.field1387 + "," + var2 + "," + field1401 + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.field1479 + "," + this.field1589 + "," + this.field1590);
				this.field1489 = System.currentTimeMillis();
			}
		}
		if (this.field1527 == 2 && this.field1479 != this.field1265) {
			this.field1265 = this.field1479;
			this.method539((byte) -24, this.field1479);
		}
	}

	@ObfuscatedName("client.P(I)I")
	public final int method549(int arg0) {
		for (int var2 = 0; var2 < this.field1268.length; var2++) {
			if (this.field1268[var2] == null && this.field1406[var2] != -1) {
				return -1;
			}
			if (this.field1311[var2] == null && this.field1407[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		for (int var4 = 0; var4 < this.field1268.length; var4++) {
			byte[] var5 = this.field1311[var4];
			if (var5 != null) {
				int var6 = (this.field1405[var4] >> 8) * 64 - this.sceneBaseTileX;
				int var7 = (this.field1405[var4] & 0xFF) * 64 - this.sceneBaseTileZ;
				var3 &= World.method16(var6, var7, var5, true);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.field1615) {
			return -4;
		} else {
			this.field1527 = 2;
			World.field46 = this.field1479;
			if (arg0 >= 0) {
				return this.field1250;
			} else {
				this.method537(-732);
				return 0;
			}
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method550(int arg0) {
		if (this.field1346 == 0) {
			return;
		}
		int var2 = 0;
		if (arg0 != 0) {
			this.field1432 = null;
		}
		if (this.field1592 != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (this.field1431[var3] != null) {
				int var4 = this.field1429[var3];
				String var5 = this.field1430[var3];
				boolean var6 = false;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					boolean var7 = true;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					boolean var8 = true;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1576 == 0 || this.field1576 == 1 && this.method502(var5, (byte) 1))) {
					int var9 = 329 - var2 * 13;
					if (super.mouseX > 4 && super.mouseX < 516 && super.mouseY - 4 > var9 - 10 && super.mouseY - 4 <= var9 + 3) {
						if (this.field1378 >= 1) {
							this.field1579[this.field1564] = "Report abuse @whi@" + var5;
							this.field1203[this.field1564] = 2034;
							this.field1564++;
						}
						this.field1579[this.field1564] = "Add ignore @whi@" + var5;
						this.field1203[this.field1564] = 2436;
						this.field1564++;
						this.field1579[this.field1564] = "Add friend @whi@" + var5;
						this.field1203[this.field1564] = 2406;
						this.field1564++;
					}
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if ((var4 == 5 || var4 == 6) && this.field1576 < 2) {
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IIIIBI)V")
	public final void method551(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
		this.field1197.method211((byte) 9, arg0, arg2);
		this.field1198.method211((byte) 9, arg0, arg2 + arg5 - 16);
		Pix2D.method169(0, this.field1304, 16, arg5 - 32, arg0, arg2 + 16);
		int var7 = (arg5 - 32) * arg5 / arg1;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg5 - 32 - var7) * arg3 / (arg1 - arg5);
		Pix2D.method169(0, this.field1280, 16, var7, arg0, arg2 + 16 + var8);
		if (arg4 == 9) {
			boolean var9 = false;
		} else {
			this.field1523 = this.field1537.nextInt();
		}
		Pix2D.method174(arg0, this.field1535, arg2 + 16 + var8, var7, this.field1421);
		Pix2D.method174(arg0 + 1, this.field1535, arg2 + 16 + var8, var7, this.field1421);
		Pix2D.method172(this.field1535, arg2 + 16 + var8, 16, arg0, this.field1220);
		Pix2D.method172(this.field1535, arg2 + 17 + var8, 16, arg0, this.field1220);
		Pix2D.method174(arg0 + 15, this.field1276, arg2 + 16 + var8, var7, this.field1421);
		Pix2D.method174(arg0 + 14, this.field1276, arg2 + 17 + var8, var7 - 1, this.field1421);
		Pix2D.method172(this.field1276, arg2 + 15 + var8 + var7, 16, arg0, this.field1220);
		Pix2D.method172(this.field1276, arg2 + 14 + var8 + var7, 15, arg0 + 1, this.field1220);
	}

	@ObfuscatedName("client.a(B[BI)Z")
	public final boolean method552(byte arg0, byte[] arg1, int arg2) {
		if (arg0 != 6) {
			field1374 = 76;
		}
		return arg1 == null ? true : signlink.wavesave(arg1, arg2);
	}

	@ObfuscatedName("client.a(IZLjb;I)V")
	public final void method553(int arg0, boolean arg1, Pix32 arg2, int arg3) {
		int var5 = this.field1560 + this.field1533 & 0x7FF;
		if (arg1) {
			this.field1604 = -474;
		}
		int var6 = arg0 * arg0 + arg3 * arg3;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.sinTable[var5];
		int var8 = Model.cosTable[var5];
		int var9 = var7 * 256 / (this.field1330 + 256);
		int var10 = var8 * 256 / (this.field1330 + 256);
		int var11 = arg0 * var10 + arg3 * var9 >> 16;
		int var12 = arg3 * var10 - arg0 * var9 >> 16;
		if (var6 > 2500) {
			arg2.method204(this.field1446, false, var11 + 94 - arg2.field675 / 2 + 4, 83 - var12 - arg2.field676 / 2 - 4);
		} else {
			arg2.method198((byte) 9, var11 + 94 - arg2.field675 / 2 + 4, 83 - var12 - arg2.field676 / 2 - 4);
		}
	}

	@ObfuscatedName("client.a(IIIILbb;)V")
	public final void method554(int arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
		if (localPlayer == arg4 || this.field1564 >= 400) {
			return;
		}
		String var6 = arg4.field465 + method469(arg4.field471, 31733, localPlayer.field471) + " (level-" + arg4.field471 + ")";
		if (this.field1497 == 1) {
			this.field1579[this.field1564] = "Use " + this.field1501 + " with @whi@" + var6;
			this.field1203[this.field1564] = 367;
			this.field1204[this.field1564] = arg0;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg3;
			this.field1564++;
		} else if (this.field1307 != 1) {
			this.field1579[this.field1564] = "Follow @whi@" + var6;
			this.field1203[this.field1564] = 1544;
			this.field1204[this.field1564] = arg0;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg3;
			this.field1564++;
			if (this.field1360 == 0) {
				this.field1579[this.field1564] = "Trade with @whi@" + var6;
				this.field1203[this.field1564] = 1373;
				this.field1204[this.field1564] = arg0;
				this.field1201[this.field1564] = arg1;
				this.field1202[this.field1564] = arg3;
				this.field1564++;
			}
			if (this.field1410 > 0) {
				this.field1579[this.field1564] = "Attack @whi@" + var6;
				if (localPlayer.field471 >= arg4.field471) {
					this.field1203[this.field1564] = 151;
				} else {
					this.field1203[this.field1564] = 2151;
				}
				this.field1204[this.field1564] = arg0;
				this.field1201[this.field1564] = arg1;
				this.field1202[this.field1564] = arg3;
				this.field1564++;
			}
			if (this.field1187 == 1) {
				this.field1579[this.field1564] = "Fight @whi@" + var6;
				this.field1203[this.field1564] = 151;
				this.field1204[this.field1564] = arg0;
				this.field1201[this.field1564] = arg1;
				this.field1202[this.field1564] = arg3;
				this.field1564++;
			}
			if (this.field1187 == 2) {
				this.field1579[this.field1564] = "Duel-with @whi@" + var6;
				this.field1203[this.field1564] = 1101;
				this.field1204[this.field1564] = arg0;
				this.field1201[this.field1564] = arg1;
				this.field1202[this.field1564] = arg3;
				this.field1564++;
			}
		} else if ((this.field1309 & 0x8) == 8) {
			this.field1579[this.field1564] = this.field1310 + " @whi@" + var6;
			this.field1203[this.field1564] = 651;
			this.field1204[this.field1564] = arg0;
			this.field1201[this.field1564] = arg1;
			this.field1202[this.field1564] = arg3;
			this.field1564++;
		}
		for (int var7 = 0; var7 < this.field1564; var7++) {
			if (this.field1203[var7] == 660) {
				this.field1579[var7] = "Walk here @whi@" + var6;
				break;
			}
		}
		while (arg2 >= 0) {
			this.ptype = this.in.g1();
		}
	}

	@ObfuscatedName("client.j(II)V")
	public final void method555(int arg0, int arg1) {
		if (arg1 >= 0) {
			this.field1480 = 166;
		}
		if (field1401) {
			return;
		}
		if (Pix3D.field661[17] >= arg0) {
			Pix8 var3 = Pix3D.field655[17];
			int var4 = var3.field686 * var3.field685 - 1;
			int var5 = this.field1488 * var3.field685 * 2;
			byte[] var6 = var3.field683;
			byte[] var7 = this.field1214;
			for (int var8 = 0; var8 <= var4; var8++) {
				var7[var8] = var6[var8 - var5 & var4];
			}
			var3.field683 = var7;
			this.field1214 = var6;
			Pix3D.method183(17, (byte) 4);
		}
		if (Pix3D.field661[24] < arg0) {
			return;
		}
		Pix8 var9 = Pix3D.field655[24];
		int var10 = var9.field686 * var9.field685 - 1;
		int var11 = this.field1488 * var9.field685 * 2;
		byte[] var12 = var9.field683;
		byte[] var13 = this.field1214;
		for (int var14 = 0; var14 <= var10; var14++) {
			var13[var14] = var12[var14 - var11 & var10];
		}
		var9.field683 = var13;
		this.field1214 = var12;
		Pix3D.method183(24, (byte) 4);
		return;
	}

	@ObfuscatedName("client.R(I)V")
	public final void method556(int arg0) {
		this.flameThread = true;
		if (arg0 >= 0) {
			this.field1191 = this.field1537.nextInt();
		}
		try {
			long var2 = System.currentTimeMillis();
			int var4 = 0;
			int var5 = 20;
			while (this.flameActive) {
				this.flameCycle++;
				this.method557(false);
				this.method557(false);
				this.method538(25630);
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
	public final void method557(boolean arg0) {
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
		this.field1335 += 128;
		if (arg0) {
			field1282 = !field1282;
		}
		if (this.field1335 > this.flameBuffer0.length) {
			this.field1335 -= this.flameBuffer0.length;
			int var6 = (int) (Math.random() * 12.0D);
			this.method527(this.imageRunes[var6], (byte) 66);
		}
		for (int var7 = 1; var7 < var2 - 1; var7++) {
			for (int var10 = 1; var10 < 127; var10++) {
				int var11 = (var7 << 7) + var10;
				int var12 = this.imageFlamesLeft[var11 + 128] - this.flameBuffer0[this.field1335 + var11 & this.flameBuffer0.length - 1] / 5;
				if (var12 < 0) {
					var12 = 0;
				}
				this.flameBuffer2[var11] = var12;
			}
		}
		for (int var8 = 0; var8 < var2 - 1; var8++) {
			this.field1540[var8] = this.field1540[var8 + 1];
		}
		this.field1540[var2 - 1] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (this.field1292 > 0) {
			this.field1292 -= 4;
		}
		if (this.field1293 > 0) {
			this.field1293 -= 4;
		}
		if (this.field1292 != 0 || this.field1293 != 0) {
			return;
		}
		int var9 = (int) (Math.random() * 2000.0D);
		if (var9 == 0) {
			this.field1292 = 1024;
		}
		if (var9 == 1) {
			this.field1293 = 1024;
			return;
		}
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method558(int arg0, Component arg1) {
		int var3 = arg1.field82;
		if (arg0 >= 0) {
			this.ptype = this.in.g1();
		}
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
			this.field1579[this.field1564] = "Remove @whi@" + this.field1556[var3];
			this.field1203[this.field1564] = 557;
			this.field1564++;
			this.field1579[this.field1564] = "Message @whi@" + this.field1556[var3];
			this.field1203[this.field1564] = 679;
			this.field1564++;
			return true;
		} else if (var3 >= 401 && var3 <= 500) {
			this.field1579[this.field1564] = "Remove @whi@" + arg1.field113;
			this.field1203[this.field1564] = 556;
			this.field1564++;
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
			field1481[var1] = var0 / 4;
		}
		field1528 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		field1543 = 5;
		field1545 = -12734;
		field1608 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}
}
