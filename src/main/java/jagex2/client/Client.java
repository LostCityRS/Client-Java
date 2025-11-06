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
	public int field1207;

	@ObfuscatedName("client.bb")
	public int[] field1208 = new int[1000];

	@ObfuscatedName("client.cb")
	public int[] field1209 = new int[1000];

	@ObfuscatedName("client.eb")
	public int[] field1211 = new int[2000];

	@ObfuscatedName("client.hb")
	public int field1214;

	@ObfuscatedName("client.ib")
	public int field1215;

	@ObfuscatedName("client.jb")
	public int field1216;

	@ObfuscatedName("client.kb")
	public int field1217;

	@ObfuscatedName("client.lb")
	public int field1218;

	@ObfuscatedName("client.mb")
	public ClientNpc[] field1219 = new ClientNpc[16384];

	@ObfuscatedName("client.nb")
	public int field1220;

	@ObfuscatedName("client.ob")
	public int[] field1221 = new int[16384];

	@ObfuscatedName("client.pb")
	public int field1222;

	@ObfuscatedName("client.qb")
	public int field1223;

	@ObfuscatedName("client.rb")
	public int field1224;

	@ObfuscatedName("client.sb")
	public int field1225;

	@ObfuscatedName("client.tb")
	public Pix8 field1226;

	@ObfuscatedName("client.ub")
	public Pix8 field1227;

	@ObfuscatedName("client.vb")
	public Pix8 field1228;

	@ObfuscatedName("client.wb")
	public Pix8 field1229;

	@ObfuscatedName("client.xb")
	public Pix8 field1230;

	@ObfuscatedName("client.yb")
	public static ClientPlayer field1231;

	@ObfuscatedName("client.zb")
	public FileStream[] field1232 = new FileStream[5];

	@ObfuscatedName("client.bc")
	public Packet field1260 = Packet.method226(1);

	@ObfuscatedName("client.cc")
	public int[] field1261 = new int[5];

	@ObfuscatedName("client.dc")
	public Pix32 field1262;

	@ObfuscatedName("client.ec")
	public Pix32 field1263;

	@ObfuscatedName("client.fc")
	public int[] field1264;

	@ObfuscatedName("client.gc")
	public int[] field1265;

	@ObfuscatedName("client.hc")
	public int field1266;

	@ObfuscatedName("client.ic")
	public int field1267;

	@ObfuscatedName("client.jc")
	public int field1268;

	@ObfuscatedName("client.kc")
	public int field1269;

	@ObfuscatedName("client.lc")
	public int field1270;

	@ObfuscatedName("client.mc")
	public static final int[] field1271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@ObfuscatedName("client.nc")
	public int field1272;

	@ObfuscatedName("client.oc")
	public int field1273 = 2;

	@ObfuscatedName("client.pc")
	public long field1274;

	@ObfuscatedName("client.qc")
	public boolean field1275 = false;

	@ObfuscatedName("client.rc")
	public int[][][] field1276;

	@ObfuscatedName("client.sc")
	public int field1277;

	@ObfuscatedName("client.L")
	public int[] field1192 = new int[50];

	@ObfuscatedName("client.N")
	public boolean field1194 = false;

	@ObfuscatedName("client.T")
	public boolean field1200 = false;

	@ObfuscatedName("client.V")
	public Pix32[] field1202 = new Pix32[1000];

	@ObfuscatedName("client.W")
	public int[] field1203 = new int[500];

	@ObfuscatedName("client.X")
	public int[] field1204 = new int[500];

	@ObfuscatedName("client.Y")
	public int[] field1205 = new int[500];

	@ObfuscatedName("client.Z")
	public int[] field1206 = new int[500];

	@ObfuscatedName("client.Ab")
	public CollisionMap[] field1233 = new CollisionMap[4];

	@ObfuscatedName("client.Eb")
	public CRC32 field1237 = new CRC32();

	@ObfuscatedName("client.Fb")
	public boolean field1238 = false;

	@ObfuscatedName("client.Kb")
	public boolean field1243 = false;

	@ObfuscatedName("client.Lb")
	public int[] field1244 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.Mb")
	public int[] field1245 = new int[100];

	@ObfuscatedName("client.Nb")
	public String[] field1246 = new String[100];

	@ObfuscatedName("client.Ob")
	public String[] field1247 = new String[100];

	@ObfuscatedName("client.Pb")
	public int field1248 = 3;

	@ObfuscatedName("client.Rb")
	public int[] field1250 = new int[100];

	@ObfuscatedName("client.Tb")
	public int field1252 = 128;

	@ObfuscatedName("client.Yb")
	public String[] field1257 = new String[200];

	@ObfuscatedName("client.uc")
	public int field1279 = 2;

	@ObfuscatedName("client.Cc")
	public int[] field1287 = new int[256];

	@ObfuscatedName("client.Ec")
	public int field1289 = -1;

	@ObfuscatedName("client.Hc")
	public String[] field1292 = new String[500];

	@ObfuscatedName("client.Nc")
	public int field1298 = -1;

	@ObfuscatedName("client.Oc")
	public int field1299 = -1;

	@ObfuscatedName("client.Uc")
	public int[] field1305 = new int[50];

	@ObfuscatedName("client.ad")
	public int[] field1311 = new int[5];

	@ObfuscatedName("client.ed")
	public boolean field1315 = true;

	@ObfuscatedName("client.id")
	public Packet field1319 = Packet.method226(1);

	@ObfuscatedName("client.qd")
	public int[] field1327 = new int[7];

	@ObfuscatedName("client.sd")
	public int field1329 = 50;

	@ObfuscatedName("client.td")
	public int[] field1330 = new int[this.field1329];

	@ObfuscatedName("client.ud")
	public int[] field1331 = new int[this.field1329];

	@ObfuscatedName("client.vd")
	public int[] field1332 = new int[this.field1329];

	@ObfuscatedName("client.wd")
	public int[] field1333 = new int[this.field1329];

	@ObfuscatedName("client.xd")
	public int[] field1334 = new int[this.field1329];

	@ObfuscatedName("client.yd")
	public int[] field1335 = new int[this.field1329];

	@ObfuscatedName("client.zd")
	public int[] field1336 = new int[this.field1329];

	@ObfuscatedName("client.Ad")
	public String[] field1337 = new String[this.field1329];

	@ObfuscatedName("client.Dd")
	public int[] field1340 = new int[50];

	@ObfuscatedName("client.Md")
	public int field1349 = 1;

	@ObfuscatedName("client.Od")
	public boolean field1351 = true;

	@ObfuscatedName("client.Pd")
	public boolean field1352 = false;

	@ObfuscatedName("client.Qd")
	public Pix32[] field1353 = new Pix32[20];

	@ObfuscatedName("client.Ud")
	public int[][] field1357 = new int[104][104];

	@ObfuscatedName("client.Zd")
	public boolean field1362 = false;

	@ObfuscatedName("client.ge")
	public boolean field1369 = false;

	@ObfuscatedName("client.me")
	public boolean field1375 = false;

	@ObfuscatedName("client.ne")
	public int field1376 = 2048;

	@ObfuscatedName("client.oe")
	public int field1377 = 2047;

	@ObfuscatedName("client.pe")
	public ClientPlayer[] field1378 = new ClientPlayer[this.field1376];

	@ObfuscatedName("client.re")
	public int[] field1380 = new int[this.field1376];

	@ObfuscatedName("client.te")
	public int[] field1382 = new int[this.field1376];

	@ObfuscatedName("client.ue")
	public Packet[] field1383 = new Packet[this.field1376];

	@ObfuscatedName("client.ve")
	public boolean field1384 = false;

	@ObfuscatedName("client.we")
	public boolean field1385 = false;

	@ObfuscatedName("client.Ge")
	public boolean field1395 = false;

	@ObfuscatedName("client.He")
	public int[][] field1396 = new int[104][104];

	@ObfuscatedName("client.Je")
	public boolean field1398 = false;

	@ObfuscatedName("client.Re")
	public LinkList[][][] field1406 = new LinkList[4][104][104];

	@ObfuscatedName("client.Ve")
	public boolean field1410 = false;

	@ObfuscatedName("client.We")
	public int field1411 = -1;

	@ObfuscatedName("client.Xe")
	public int[] field1412 = new int[5];

	@ObfuscatedName("client.cf")
	public String field1417 = "";

	@ObfuscatedName("client.df")
	public String field1418 = "";

	@ObfuscatedName("client.ef")
	public int[] field1419 = new int[Stats.field1128];

	@ObfuscatedName("client.ff")
	public boolean field1420 = false;

	@ObfuscatedName("client.jf")
	public LinkList field1423 = new LinkList();

	@ObfuscatedName("client.kf")
	public int[] field1424 = new int[33];

	@ObfuscatedName("client.mf")
	public String field1426 = "";

	@ObfuscatedName("client.nf")
	public String field1427 = "";

	@ObfuscatedName("client.yf")
	public boolean field1438 = false;

	@ObfuscatedName("client.Af")
	public int field1440 = -1;

	@ObfuscatedName("client.Ef")
	public String field1444 = "";

	@ObfuscatedName("client.Gf")
	public int field1446 = 1;

	@ObfuscatedName("client.If")
	public boolean field1448 = false;

	@ObfuscatedName("client.Lf")
	public LinkList field1451 = new LinkList();

	@ObfuscatedName("client.Of")
	public int[] field1454 = new int[1000];

	@ObfuscatedName("client.Pf")
	public int field1455 = 2301979;

	@ObfuscatedName("client.Rf")
	public int field1457 = 3353893;

	@ObfuscatedName("client.Uf")
	public Pix8[] field1460 = new Pix8[13];

	@ObfuscatedName("client.bg")
	public int[] field1467 = new int[Stats.field1128];

	@ObfuscatedName("client.cg")
	public int[] field1468 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.hg")
	public Pix8[] field1473 = new Pix8[50];

	@ObfuscatedName("client.ug")
	public Component field1486 = new Component();

	@ObfuscatedName("client.Cg")
	public boolean field1494 = true;

	@ObfuscatedName("client.Fg")
	public int[] field1497 = new int[2000];

	@ObfuscatedName("client.Kg")
	public int[] field1502 = new int[151];

	@ObfuscatedName("client.Lg")
	public final int[] field1503 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.Qg")
	public boolean field1508 = false;

	@ObfuscatedName("client.Rg")
	public int field1509 = 78;

	@ObfuscatedName("client.Vg")
	public int field1513 = 7759444;

	@ObfuscatedName("client.Wg")
	public int[] field1514 = new int[5];

	@ObfuscatedName("client.Xg")
	public long[] field1515 = new long[100];

	@ObfuscatedName("client.Yg")
	public int field1516 = 581;

	@ObfuscatedName("client.ch")
	public int[] field1520 = new int[5];

	@ObfuscatedName("client.dh")
	public long[] field1521 = new long[200];

	@ObfuscatedName("client.fh")
	public int field1523 = -1;

	@ObfuscatedName("client.kh")
	public boolean field1528 = false;

	@ObfuscatedName("client.lh")
	public int[] field1529 = new int[4000];

	@ObfuscatedName("client.mh")
	public int[] field1530 = new int[4000];

	@ObfuscatedName("client.yh")
	public int field1542 = -1;

	@ObfuscatedName("client.zh")
	public Packet field1543 = Packet.method226(1);

	@ObfuscatedName("client.Jh")
	public int[] field1553 = new int[200];

	@ObfuscatedName("client.Lh")
	public String field1555 = "";

	@ObfuscatedName("client.Nh")
	public int field1557 = 2;

	@ObfuscatedName("client.Oh")
	public int field1558 = -1;

	@ObfuscatedName("client.Ph")
	public Pix32[] field1559 = new Pix32[20];

	@ObfuscatedName("client.ei")
	public int field1574 = -1;

	@ObfuscatedName("client.fi")
	public int[] field1575 = new int[Stats.field1128];

	@ObfuscatedName("client.gi")
	public String field1576 = "";

	@ObfuscatedName("client.oi")
	public String field1584 = "";

	@ObfuscatedName("client.pi")
	public int field1585 = 5063219;

	@ObfuscatedName("client.qi")
	public int[][] field1586 = new int[104][104];

	@ObfuscatedName("client.si")
	public String field1588 = "";

	@ObfuscatedName("client.yi")
	public int field1594 = -1;

	@ObfuscatedName("client.zi")
	public int[] field1595 = new int[33];

	@ObfuscatedName("client.Ci")
	public int field1598 = -1;

	@ObfuscatedName("client.Ei")
	public Pix32[] field1600 = new Pix32[50];

	@ObfuscatedName("client.Ji")
	public String[] field1605 = new String[5];

	@ObfuscatedName("client.Ki")
	public boolean[] field1606 = new boolean[5];

	@ObfuscatedName("client.Pi")
	public boolean field1611 = false;

	@ObfuscatedName("client.Qi")
	public boolean field1612 = true;

	@ObfuscatedName("client.Vi")
	public boolean field1617 = false;

	@ObfuscatedName("client.Zi")
	public boolean field1621 = false;

	@ObfuscatedName("client.aj")
	public Pix32[] field1622 = new Pix32[8];

	@ObfuscatedName("client.bj")
	public boolean field1623 = false;

	@ObfuscatedName("client.cj")
	public boolean field1624 = false;

	@ObfuscatedName("client.fj")
	public boolean field1627 = false;

	@ObfuscatedName("client.ij")
	public Pix8[] field1630 = new Pix8[2];

	@ObfuscatedName("client.kj")
	public int field1632 = -1;

	@ObfuscatedName("client.lj")
	public int field1633 = -1;

	@ObfuscatedName("client.mj")
	public byte[] field1634 = new byte[16384];

	@ObfuscatedName("client.oj")
	public LinkList field1636 = new LinkList();

	@ObfuscatedName("client.pj")
	public int[] field1637 = new int[9];

	@ObfuscatedName("client.qj")
	public int field1638 = -1;

	@ObfuscatedName("client.Aj")
	public int[] field1648 = new int[151];

	@ObfuscatedName("client.Bj")
	public boolean[] field1649 = new boolean[5];

	@ObfuscatedName("client.Gb")
	public static int field1239 = 10;

	@ObfuscatedName("client.Ib")
	public static boolean field1241 = true;

	@ObfuscatedName("client.Zb")
	public static String field1258 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

	@ObfuscatedName("client.uf")
	public static BigInteger field1434 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.fg")
	public static int[] field1471 = new int[32];

	@ObfuscatedName("client.ig")
	public static int[] field1474;

	@ObfuscatedName("client.Pg")
	public static BigInteger field1507;

	@ObfuscatedName("client.uh")
	public static final int[][] field1538;

	@ObfuscatedName("client.xi")
	public static int field1593;

	@ObfuscatedName("client.O")
	public int field1195;

	@ObfuscatedName("client.P")
	public int field1196;

	@ObfuscatedName("client.Q")
	public int field1197;

	@ObfuscatedName("client.R")
	public int field1198;

	@ObfuscatedName("client.U")
	public int field1201;

	@ObfuscatedName("client.Bb")
	public int field1234;

	@ObfuscatedName("client.Cb")
	public static int field1235;

	@ObfuscatedName("client.Hb")
	public static int field1240;

	@ObfuscatedName("client.Sb")
	public int field1251;

	@ObfuscatedName("client.Ub")
	public int field1253;

	@ObfuscatedName("client.Vb")
	public int field1254;

	@ObfuscatedName("client.Wb")
	public int field1255;

	@ObfuscatedName("client.Xb")
	public static int field1256;

	@ObfuscatedName("client.tc")
	public int field1278;

	@ObfuscatedName("client.zc")
	public static int field1284;

	@ObfuscatedName("client.Ac")
	public static int field1285;

	@ObfuscatedName("client.Fc")
	public int field1290;

	@ObfuscatedName("client.Gc")
	public int field1291;

	@ObfuscatedName("client.Ic")
	public int field1293;

	@ObfuscatedName("client.Jc")
	public static int field1294;

	@ObfuscatedName("client.Qc")
	public int field1301;

	@ObfuscatedName("client.Rc")
	public int field1302;

	@ObfuscatedName("client.Tc")
	public int field1304;

	@ObfuscatedName("client.Vc")
	public int field1306;

	@ObfuscatedName("client.Wc")
	public int field1307;

	@ObfuscatedName("client.Xc")
	public int field1308;

	@ObfuscatedName("client.Yc")
	public int field1309;

	@ObfuscatedName("client.Zc")
	public int field1310;

	@ObfuscatedName("client.cd")
	public int field1313;

	@ObfuscatedName("client.dd")
	public int field1314;

	@ObfuscatedName("client.fd")
	public int field1316;

	@ObfuscatedName("client.gd")
	public int field1317;

	@ObfuscatedName("client.jd")
	public int field1320;

	@ObfuscatedName("client.ld")
	public int field1322;

	@ObfuscatedName("client.nd")
	public int field1324;

	@ObfuscatedName("client.pd")
	public int field1326;

	@ObfuscatedName("client.rd")
	public int field1328;

	@ObfuscatedName("client.Bd")
	public static int field1338;

	@ObfuscatedName("client.Cd")
	public static int field1339;

	@ObfuscatedName("client.Fd")
	public int field1342;

	@ObfuscatedName("client.Gd")
	public int field1343;

	@ObfuscatedName("client.Ld")
	public int field1348;

	@ObfuscatedName("client.Nd")
	public int field1350;

	@ObfuscatedName("client.Rd")
	public static int field1354;

	@ObfuscatedName("client.Vd")
	public int field1358;

	@ObfuscatedName("client.Wd")
	public int field1359;

	@ObfuscatedName("client.Yd")
	public int field1361;

	@ObfuscatedName("client.ae")
	public int field1363;

	@ObfuscatedName("client.be")
	public int field1364;

	@ObfuscatedName("client.ce")
	public int field1365;

	@ObfuscatedName("client.de")
	public int field1366;

	@ObfuscatedName("client.ee")
	public int field1367;

	@ObfuscatedName("client.fe")
	public int field1368;

	@ObfuscatedName("client.je")
	public int field1372;

	@ObfuscatedName("client.ke")
	public int field1373;

	@ObfuscatedName("client.le")
	public int field1374;

	@ObfuscatedName("client.qe")
	public int field1379;

	@ObfuscatedName("client.se")
	public int field1381;

	@ObfuscatedName("client.xe")
	public int field1386;

	@ObfuscatedName("client.ye")
	public int field1387;

	@ObfuscatedName("client.ze")
	public int field1388;

	@ObfuscatedName("client.Ae")
	public int field1389;

	@ObfuscatedName("client.Fe")
	public int field1394;

	@ObfuscatedName("client.Pe")
	public int field1404;

	@ObfuscatedName("client.Te")
	public static int field1408;

	@ObfuscatedName("client.Ue")
	public static int field1409;

	@ObfuscatedName("client.Ze")
	public int field1414;

	@ObfuscatedName("client.hf")
	public int field1422;

	@ObfuscatedName("client.of")
	public int field1428;

	@ObfuscatedName("client.pf")
	public int field1429;

	@ObfuscatedName("client.qf")
	public int field1430;

	@ObfuscatedName("client.rf")
	public int field1431;

	@ObfuscatedName("client.sf")
	public int field1432;

	@ObfuscatedName("client.xf")
	public int field1437;

	@ObfuscatedName("client.Ff")
	public int field1445;

	@ObfuscatedName("client.Hf")
	public int field1447;

	@ObfuscatedName("client.Kf")
	public int field1450;

	@ObfuscatedName("client.Mf")
	public int field1452;

	@ObfuscatedName("client.Nf")
	public int field1453;

	@ObfuscatedName("client.Qf")
	public int field1456;

	@ObfuscatedName("client.Sf")
	public int field1458;

	@ObfuscatedName("client.Wf")
	public int field1462;

	@ObfuscatedName("client.Xf")
	public int field1463;

	@ObfuscatedName("client.Yf")
	public int field1464;

	@ObfuscatedName("client.eg")
	public static int field1470;

	@ObfuscatedName("client.jg")
	public int field1475;

	@ObfuscatedName("client.kg")
	public int field1476;

	@ObfuscatedName("client.lg")
	public int field1477;

	@ObfuscatedName("client.mg")
	public int field1478;

	@ObfuscatedName("client.ng")
	public int field1479;

	@ObfuscatedName("client.og")
	public int field1480;

	@ObfuscatedName("client.pg")
	public int field1481;

	@ObfuscatedName("client.vg")
	public int field1487;

	@ObfuscatedName("client.wg")
	public int field1488;

	@ObfuscatedName("client.xg")
	public int field1489;

	@ObfuscatedName("client.yg")
	public int field1490;

	@ObfuscatedName("client.Ag")
	public int field1492;

	@ObfuscatedName("client.Bg")
	public int field1493;

	@ObfuscatedName("client.Dg")
	public int field1495;

	@ObfuscatedName("client.Eg")
	public static int field1496;

	@ObfuscatedName("client.Gg")
	public int field1498;

	@ObfuscatedName("client.Hg")
	public int field1499;

	@ObfuscatedName("client.Ig")
	public int field1500;

	@ObfuscatedName("client.Jg")
	public int field1501;

	@ObfuscatedName("client.Sg")
	public int field1510;

	@ObfuscatedName("client.Tg")
	public static int field1511;

	@ObfuscatedName("client.eh")
	public int field1522;

	@ObfuscatedName("client.gh")
	public int field1524;

	@ObfuscatedName("client.hh")
	public int field1525;

	@ObfuscatedName("client.ih")
	public int field1526;

	@ObfuscatedName("client.vh")
	public int field1539;

	@ObfuscatedName("client.wh")
	public int field1540;

	@ObfuscatedName("client.xh")
	public int field1541;

	@ObfuscatedName("client.Kh")
	public int field1554;

	@ObfuscatedName("client.Mh")
	public int field1556;

	@ObfuscatedName("client.Zh")
	public int field1569;

	@ObfuscatedName("client.hi")
	public int field1577;

	@ObfuscatedName("client.ii")
	public int field1578;

	@ObfuscatedName("client.ji")
	public int field1579;

	@ObfuscatedName("client.ki")
	public int field1580;

	@ObfuscatedName("client.li")
	public int field1581;

	@ObfuscatedName("client.mi")
	public int field1582;

	@ObfuscatedName("client.ni")
	public int field1583;

	@ObfuscatedName("client.ri")
	public static int field1587;

	@ObfuscatedName("client.ti")
	public int field1589;

	@ObfuscatedName("client.vi")
	public static int field1591;

	@ObfuscatedName("client.Ai")
	public static int field1596;

	@ObfuscatedName("client.Bi")
	public static int field1597;

	@ObfuscatedName("client.Fi")
	public int field1601;

	@ObfuscatedName("client.Gi")
	public int field1602;

	@ObfuscatedName("client.Hi")
	public int field1603;

	@ObfuscatedName("client.Ii")
	public int field1604;

	@ObfuscatedName("client.Mi")
	public int field1608;

	@ObfuscatedName("client.Ni")
	public int field1609;

	@ObfuscatedName("client.Oi")
	public int field1610;

	@ObfuscatedName("client.Ui")
	public int field1616;

	@ObfuscatedName("client.Wi")
	public static int field1618;

	@ObfuscatedName("client.Xi")
	public int field1619;

	@ObfuscatedName("client.dj")
	public int field1625;

	@ObfuscatedName("client.hj")
	public int field1629;

	@ObfuscatedName("client.jj")
	public int field1631;

	@ObfuscatedName("client.yj")
	public int field1646;

	@ObfuscatedName("client.zj")
	public static int field1647;

	@ObfuscatedName("client.he")
	public long field1370;

	@ObfuscatedName("client.Ye")
	public long field1413;

	@ObfuscatedName("client.Zg")
	public long field1517;

	@ObfuscatedName("client.jh")
	public long field1527;

	@ObfuscatedName("client.od")
	public World3D field1325;

	@ObfuscatedName("client.Pc")
	public Pix32 field1300;

	@ObfuscatedName("client.Sc")
	public Pix32 field1303;

	@ObfuscatedName("client.Cf")
	public Pix32 field1442;

	@ObfuscatedName("client.Df")
	public Pix32 field1443;

	@ObfuscatedName("client.ah")
	public Pix32 field1518;

	@ObfuscatedName("client.bh")
	public Pix32 field1519;

	@ObfuscatedName("client.ai")
	public Pix32 field1570;

	@ObfuscatedName("client.bi")
	public Pix32 field1571;

	@ObfuscatedName("client.ci")
	public Pix32 field1572;

	@ObfuscatedName("client.di")
	public Pix32 field1573;

	@ObfuscatedName("client.ui")
	public Pix32 field1590;

	@ObfuscatedName("client.vc")
	public Pix8 field1280;

	@ObfuscatedName("client.wc")
	public Pix8 field1281;

	@ObfuscatedName("client.xc")
	public Pix8 field1282;

	@ObfuscatedName("client.Kc")
	public Pix8 field1295;

	@ObfuscatedName("client.Lc")
	public Pix8 field1296;

	@ObfuscatedName("client.Mc")
	public Pix8 field1297;

	@ObfuscatedName("client.Sd")
	public Pix8 field1355;

	@ObfuscatedName("client.Td")
	public Pix8 field1356;

	@ObfuscatedName("client.De")
	public Pix8 field1392;

	@ObfuscatedName("client.Ee")
	public Pix8 field1393;

	@ObfuscatedName("client.Ke")
	public Pix8 field1399;

	@ObfuscatedName("client.Le")
	public Pix8 field1400;

	@ObfuscatedName("client.Me")
	public Pix8 field1401;

	@ObfuscatedName("client.Ne")
	public Pix8 field1402;

	@ObfuscatedName("client.Oe")
	public Pix8 field1403;

	@ObfuscatedName("client.Hd")
	public PixFont field1344;

	@ObfuscatedName("client.Id")
	public PixFont field1345;

	@ObfuscatedName("client.Jd")
	public PixFont field1346;

	@ObfuscatedName("client.Kd")
	public PixFont field1347;

	@ObfuscatedName("client.qg")
	public PixMap field1482;

	@ObfuscatedName("client.rg")
	public PixMap field1483;

	@ObfuscatedName("client.sg")
	public PixMap field1484;

	@ObfuscatedName("client.tg")
	public PixMap field1485;

	@ObfuscatedName("client.oh")
	public PixMap field1532;

	@ObfuscatedName("client.ph")
	public PixMap field1533;

	@ObfuscatedName("client.qh")
	public PixMap field1534;

	@ObfuscatedName("client.Ah")
	public PixMap field1544;

	@ObfuscatedName("client.Bh")
	public PixMap field1545;

	@ObfuscatedName("client.Ch")
	public PixMap field1546;

	@ObfuscatedName("client.Dh")
	public PixMap field1547;

	@ObfuscatedName("client.Eh")
	public PixMap field1548;

	@ObfuscatedName("client.Fh")
	public PixMap field1549;

	@ObfuscatedName("client.Gh")
	public PixMap field1550;

	@ObfuscatedName("client.Hh")
	public PixMap field1551;

	@ObfuscatedName("client.Ih")
	public PixMap field1552;

	@ObfuscatedName("client.Qh")
	public PixMap field1560;

	@ObfuscatedName("client.Rh")
	public PixMap field1561;

	@ObfuscatedName("client.Sh")
	public PixMap field1562;

	@ObfuscatedName("client.Th")
	public PixMap field1563;

	@ObfuscatedName("client.Uh")
	public PixMap field1564;

	@ObfuscatedName("client.Vh")
	public PixMap field1565;

	@ObfuscatedName("client.Wh")
	public PixMap field1566;

	@ObfuscatedName("client.Xh")
	public PixMap field1567;

	@ObfuscatedName("client.Yh")
	public PixMap field1568;

	@ObfuscatedName("client.af")
	public OnDemand field1415;

	@ObfuscatedName("client.Vf")
	public Isaac field1461;

	@ObfuscatedName("client.ie")
	public JagFile field1371;

	@ObfuscatedName("client.wj")
	public MouseTracking field1644;

	@ObfuscatedName("client.Li")
	public ClientStream field1607;

	@ObfuscatedName("client.S")
	public String field1199;

	@ObfuscatedName("client.Be")
	public String field1390;

	@ObfuscatedName("client.dg")
	public String field1469;

	@ObfuscatedName("client.nj")
	public String field1635;

	@ObfuscatedName("client.Jb")
	public static boolean field1242;

	@ObfuscatedName("client.Ie")
	public static boolean field1397;

	@ObfuscatedName("client.Yi")
	public static boolean field1620;

	@ObfuscatedName("client.Cj")
	public static boolean field1650;

	@ObfuscatedName("client.Zf")
	public int[] field1465;

	@ObfuscatedName("client.ag")
	public int[] field1466;

	@ObfuscatedName("client.Mg")
	public int[] field1504;

	@ObfuscatedName("client.Ng")
	public int[] field1505;

	@ObfuscatedName("client.Og")
	public int[] field1506;

	@ObfuscatedName("client.Ri")
	public int[] field1613;

	@ObfuscatedName("client.Si")
	public int[] field1614;

	@ObfuscatedName("client.Ti")
	public int[] field1615;

	@ObfuscatedName("client.rj")
	public int[] field1639;

	@ObfuscatedName("client.sj")
	public int[] field1640;

	@ObfuscatedName("client.tj")
	public int[] field1641;

	@ObfuscatedName("client.uj")
	public int[] field1642;

	@ObfuscatedName("client.ej")
	public Pix8[] field1626;

	@ObfuscatedName("client.wf")
	public byte[][] field1436;

	@ObfuscatedName("client.gg")
	public byte[][] field1472;

	@ObfuscatedName("client.Ug")
	public byte[][][] field1512;

	@ObfuscatedName("client.c(B)Z")
	public final boolean method431() {
		return signlink.wavereplay();
	}

	@ObfuscatedName("client.a(IZ)Ljava/lang/String;")
	public final String method432(int arg0) {
		return arg0 < 999999999 ? String.valueOf(arg0) : "*";
	}

	@ObfuscatedName("client.a(BI)V")
	public final void method433(int arg1) {
		if (arg1 < 0) {
			return;
		}
		if (this.field1621) {
			this.field1621 = false;
			this.field1528 = true;
		}
		int var3 = this.field1203[arg1];
		int var4 = this.field1204[arg1];
		int var5 = this.field1205[arg1];
		int var6 = this.field1206[arg1];
		if (var5 >= 2000) {
			var5 -= 2000;
		}
		if (var5 == 737) {
			this.method442();
		}
		if (var5 == 563) {
			this.field1543.method228(102);
			this.field1543.method230(var6);
			this.field1543.method230(var3);
			this.field1543.method230(var4);
			this.field1543.method230(this.field1388);
			this.field1222 = 0;
			this.field1223 = var4;
			this.field1224 = var3;
			this.field1225 = 2;
			if (Component.field70[var4].field76 == this.field1523) {
				this.field1225 = 1;
			}
			if (Component.field70[var4].field76 == this.field1558) {
				this.field1225 = 3;
			}
		}
		if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
			if (var5 == 681) {
				field1618++;
				if (field1618 >= 116) {
					this.field1543.method228(162);
					this.field1543.method232(13018169);
				}
				this.field1543.method228(163);
			}
			if (var5 == 962) {
				this.field1543.method228(228);
			}
			if (var5 == 694) {
				this.field1543.method228(243);
			}
			if (var5 == 100) {
				this.field1543.method228(74);
			}
			if (var5 == 795) {
				this.field1543.method228(80);
			}
			this.field1543.method230(var6);
			this.field1543.method230(var3);
			this.field1543.method230(var4);
			this.field1222 = 0;
			this.field1223 = var4;
			this.field1224 = var3;
			this.field1225 = 2;
			if (Component.field70[var4].field76 == this.field1523) {
				this.field1225 = 1;
			}
			if (Component.field70[var4].field76 == this.field1558) {
				this.field1225 = 3;
			}
		}
		if (var5 == 398) {
			this.field1543.method228(200);
			this.field1543.method230(var6);
			this.field1543.method230(var3);
			this.field1543.method230(var4);
			this.field1543.method230(this.field1198);
			this.field1543.method230(this.field1196);
			this.field1543.method230(this.field1197);
			this.field1222 = 0;
			this.field1223 = var4;
			this.field1224 = var3;
			this.field1225 = 2;
			if (Component.field70[var4].field76 == this.field1523) {
				this.field1225 = 1;
			}
			if (Component.field70[var4].field76 == this.field1558) {
				this.field1225 = 3;
			}
		}
		if (var5 == 231) {
			Component var8 = Component.field70[var4];
			boolean var9 = true;
			if (var8.field79 > 0) {
				var9 = this.method440(var8);
			}
			if (var9) {
				this.field1543.method228(244);
				this.field1543.method230(var4);
			}
		}
		if (var5 == 1714) {
			ClientNpc var10 = this.field1219[var6];
			if (var10 != null) {
				String var11;
				if (var10.field465.field986 == null) {
					var11 = "It's a " + var10.field465.field985 + ".";
				} else {
					var11 = new String(var10.field465.field986);
				}
				this.method515("", 0, var11);
			}
		}
		if (var5 == 524) {
			String var12 = this.field1292[arg1];
			int var13 = var12.indexOf("@whi@");
			if (var13 != -1) {
				this.method442();
				this.field1444 = var12.substring(var13 + 5).trim();
				this.field1623 = false;
				for (int var14 = 0; var14 < Component.field70.length; var14++) {
					if (Component.field70[var14] != null && Component.field70[var14].field79 == 600) {
						this.field1633 = this.field1523 = Component.field70[var14].field76;
						break;
					}
				}
			}
		}
		if (var5 == 721) {
			field1408 += var4;
			if (field1408 >= 139) {
				this.field1543.method228(28);
				this.field1543.method233(0);
			}
			this.method531(var3, var4, var6, 213);
		}
		if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
			ClientNpc var15 = this.field1219[var6];
			if (var15 != null) {
				this.method488(0, 1, 0, var15.field460[0], 2, field1231.field461[0], field1231.field460[0], var15.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				if (var5 == 309) {
					this.field1543.method228(69);
				}
				if (var5 == 852) {
					this.field1543.method228(122);
				}
				if (var5 == 209) {
					this.field1543.method228(195);
				}
				if (var5 == 793) {
					this.field1543.method228(118);
				}
				if (var5 == 242) {
					this.field1543.method228(143);
				}
				this.field1543.method230(var6);
			}
		}
		if (var5 == 899 && this.method531(var3, var4, var6, 26)) {
			this.field1543.method230(this.field1388);
		}
		if (var5 == 225) {
			this.field1543.method228(244);
			this.field1543.method230(var4);
			Component var16 = Component.field70[var4];
			if (var16.field85 != null && var16.field85[0][0] == 5) {
				int var17 = var16.field85[0][1];
				if (this.field1211[var17] != var16.field87[0]) {
					this.field1211[var17] = var16.field87[0];
					this.method475(var17);
					this.field1200 = true;
				}
			}
		}
		if (var5 == 1328) {
			ObjType var18 = ObjType.method350(var6);
			Component var19 = Component.field70[var4];
			String var20;
			if (var19 != null && var19.field72[var3] >= 100000) {
				var20 = var19.field72[var3] + " x " + var18.field1024;
			} else if (var18.field1025 == null) {
				var20 = "It's a " + var18.field1024 + ".";
			} else {
				var20 = new String(var18.field1025);
			}
			this.method515("", 0, var20);
		}
		if (var5 == 902) {
			String var21 = this.field1292[arg1];
			int var22 = var21.indexOf("@whi@");
			if (var22 != -1) {
				long var23 = JString.method310(var21.substring(var22 + 5).trim());
				int var25 = -1;
				for (int var26 = 0; var26 < this.field1609; var26++) {
					if (this.field1521[var26] == var23) {
						var25 = var26;
						break;
					}
				}
				if (var25 != -1 && this.field1553[var25] > 0) {
					this.field1528 = true;
					this.field1621 = false;
					this.field1611 = true;
					this.field1588 = "";
					this.field1619 = 3;
					this.field1413 = this.field1521[var25];
					this.field1576 = "Enter message to send to " + this.field1257[var25];
				}
			}
		}
		if (var5 == 357) {
			this.method531(var3, var4, var6, 87);
		}
		if (var5 == 370) {
			boolean var27 = this.method488(0, 0, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
			if (!var27) {
				this.method488(0, 1, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
			}
			this.field1498 = super.field30;
			this.field1499 = super.field31;
			this.field1501 = 2;
			this.field1500 = 0;
			this.field1543.method228(202);
			this.field1543.method230(var3 + this.field1487);
			this.field1543.method230(var4 + this.field1488);
			this.field1543.method230(var6);
			this.field1543.method230(this.field1388);
		}
		if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
			boolean var29 = this.method488(0, 0, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
			if (!var29) {
				this.method488(0, 1, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
			}
			this.field1498 = super.field30;
			this.field1499 = super.field31;
			this.field1501 = 2;
			this.field1500 = 0;
			if (var5 == 617) {
				this.field1543.method228(178);
			}
			if (var5 == 662) {
				field1496 += this.field1488;
				if (field1496 >= 118) {
					this.field1543.method228(56);
					this.field1543.method233(0);
				}
				this.field1543.method228(97);
			}
			if (var5 == 778) {
				this.field1543.method228(67);
			}
			if (var5 == 139) {
				if ((var3 & 0x3) == 0) {
					field1235++;
				}
				if (field1235 >= 123) {
					this.field1543.method228(187);
					this.field1543.method233(0);
				}
				this.field1543.method228(141);
			}
			if (var5 == 224) {
				field1597 += var4;
				if (field1597 >= 75) {
					this.field1543.method228(206);
					this.field1543.method229(19);
				}
				this.field1543.method228(47);
			}
			this.field1543.method230(var3 + this.field1487);
			this.field1543.method230(var4 + this.field1488);
			this.field1543.method230(var6);
		}
		if (var5 == 507 || var5 == 957) {
			String var31 = this.field1292[arg1];
			int var32 = var31.indexOf("@whi@");
			if (var32 != -1) {
				String var33 = var31.substring(var32 + 5).trim();
				String var34 = JString.method314(JString.method311(JString.method310(var33)));
				boolean var35 = false;
				for (int var36 = 0; var36 < this.field1379; var36++) {
					ClientPlayer var37 = this.field1378[this.field1380[var36]];
					if (var37 != null && var37.field468 != null && var37.field468.equalsIgnoreCase(var34)) {
						this.method488(0, 1, 0, var37.field460[0], 2, field1231.field461[0], field1231.field460[0], var37.field461[0], false, 1, 0);
						if (var5 == 507) {
							field1338 += var6;
							if (field1338 >= 66) {
								this.field1543.method228(233);
								this.field1543.method229(154);
							}
							this.field1543.method228(72);
						}
						if (var5 == 957) {
							field1647++;
							if (field1647 >= 52) {
								this.field1543.method228(121);
								this.field1543.method229(131);
							}
							this.field1543.method228(192);
						}
						this.field1543.method230(this.field1380[var36]);
						var35 = true;
						break;
					}
				}
				if (!var35) {
					this.method515("", 0, "Unable to find " + var34);
				}
			}
		}
		if (var5 == 810 && this.method531(var3, var4, var6, 240)) {
			this.field1543.method230(this.field1198);
			this.field1543.method230(this.field1196);
			this.field1543.method230(this.field1197);
		}
		if (var5 == 1381) {
			int var38 = var6 >> 14 & 0x7FFF;
			LocType var39 = LocType.method334(var38);
			String var40;
			if (var39.field938 == null) {
				var40 = "It's a " + var39.field937 + ".";
			} else {
				var40 = new String(var39.field938);
			}
			this.method515("", 0, var40);
		}
		if (var5 == 274) {
			Component var41 = Component.field70[var4];
			this.field1387 = 1;
			this.field1388 = var4;
			this.field1389 = var41.field130;
			this.field1195 = 0;
			this.field1200 = true;
			String var42 = var41.field128;
			if (var42.indexOf(" ") != -1) {
				var42 = var42.substring(0, var42.indexOf(" "));
			}
			String var43 = var41.field128;
			if (var43.indexOf(" ") != -1) {
				var43 = var43.substring(var43.indexOf(" ") + 1);
			}
			this.field1390 = var42 + " " + var41.field129 + " " + var43;
			if (this.field1389 == 16) {
				this.field1200 = true;
				this.field1248 = 3;
				this.field1352 = true;
			}
			return;
		}
		if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
			if (var5 == 331) {
				this.field1543.method228(160);
			}
			if (var5 == 582) {
				if ((var6 & 0x3) == 0) {
					field1409++;
				}
				if (field1409 >= 133) {
					this.field1543.method228(131);
					this.field1543.method230(6118);
				}
				this.field1543.method228(181);
			}
			if (var5 == 113) {
				this.field1543.method228(70);
			}
			if (var5 == 555) {
				this.field1543.method228(59);
			}
			if (var5 == 354) {
				this.field1543.method228(62);
			}
			this.field1543.method230(var6);
			this.field1543.method230(var3);
			this.field1543.method230(var4);
			this.field1222 = 0;
			this.field1223 = var4;
			this.field1224 = var3;
			this.field1225 = 2;
			if (Component.field70[var4].field76 == this.field1523) {
				this.field1225 = 1;
			}
			if (Component.field70[var4].field76 == this.field1558) {
				this.field1225 = 3;
			}
		}
		if (var5 == 111) {
			boolean var44 = this.method488(0, 0, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
			if (!var44) {
				this.method488(0, 1, 0, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
			}
			this.field1498 = super.field30;
			this.field1499 = super.field31;
			this.field1501 = 2;
			this.field1500 = 0;
			this.field1543.method228(245);
			this.field1543.method230(var3 + this.field1487);
			this.field1543.method230(var4 + this.field1488);
			this.field1543.method230(var6);
			this.field1543.method230(this.field1198);
			this.field1543.method230(this.field1196);
			this.field1543.method230(this.field1197);
		}
		if (var5 == 829) {
			ClientNpc var46 = this.field1219[var6];
			if (var46 != null) {
				this.method488(0, 1, 0, var46.field460[0], 2, field1231.field461[0], field1231.field460[0], var46.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				this.field1543.method228(119);
				this.field1543.method230(var6);
				this.field1543.method230(this.field1198);
				this.field1543.method230(this.field1196);
				this.field1543.method230(this.field1197);
			}
		}
		if (var5 == 718) {
			if (this.field1384) {
				this.field1325.method102(var4 - 4, var3 - 4);
			} else {
				this.field1325.method102(super.field31 - 4, super.field30 - 4);
			}
		}
		if (var5 == 997 && !this.field1420) {
			this.field1543.method228(146);
			this.field1543.method230(var4);
			this.field1420 = true;
		}
		if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
			ClientPlayer var47 = this.field1378[var6];
			if (var47 != null) {
				this.method488(0, 1, 0, var47.field460[0], 2, field1231.field461[0], field1231.field460[0], var47.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				if (var5 == 387) {
					field1338 += var6;
					if (field1338 >= 66) {
						this.field1543.method228(233);
						this.field1543.method229(154);
					}
					this.field1543.method228(72);
				}
				if (var5 == 27) {
					this.field1543.method228(18);
				}
				if (var5 == 639) {
					field1647++;
					if (field1647 >= 52) {
						this.field1543.method228(121);
						this.field1543.method229(131);
					}
					this.field1543.method228(192);
				}
				if (var5 == 185) {
					this.field1543.method228(230);
				}
				if (var5 == 499) {
					this.field1543.method228(17);
				}
				this.field1543.method230(var6);
			}
		}
		if (var5 == 435) {
			this.field1543.method228(244);
			this.field1543.method230(var4);
			Component var48 = Component.field70[var4];
			if (var48.field85 != null && var48.field85[0][0] == 5) {
				int var49 = var48.field85[0][1];
				this.field1211[var49] = 1 - this.field1211[var49];
				this.method475(var49);
				this.field1200 = true;
			}
		}
		if (var5 == 625) {
			this.method531(var3, var4, var6, 33);
		}
		if (var5 == 131) {
			ClientPlayer var50 = this.field1378[var6];
			if (var50 != null) {
				this.method488(0, 1, 0, var50.field460[0], 2, field1231.field461[0], field1231.field460[0], var50.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				this.field1543.method228(68);
				this.field1543.method230(var6);
				this.field1543.method230(this.field1388);
			}
		}
		if (var5 == 1152) {
			ObjType var51 = ObjType.method350(var6);
			String var52;
			if (var51.field1025 == null) {
				var52 = "It's a " + var51.field1024 + ".";
			} else {
				var52 = new String(var51.field1025);
			}
			this.method515("", 0, var52);
		}
		if (var5 == 1071) {
			this.method531(var3, var4, var6, 147);
		}
		if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
			String var53 = this.field1292[arg1];
			int var54 = var53.indexOf("@whi@");
			if (var54 != -1) {
				long var55 = JString.method310(var53.substring(var54 + 5).trim());
				if (var5 == 605) {
					this.method504(var55);
				}
				if (var5 == 47) {
					this.method484(var55);
				}
				if (var5 == 513) {
					this.method472(var55);
				}
				if (var5 == 884) {
					this.method447(var55);
				}
			}
		}
		if (var5 == 240) {
			ClientNpc var57 = this.field1219[var6];
			if (var57 != null) {
				this.method488(0, 1, 0, var57.field460[0], 2, field1231.field461[0], field1231.field460[0], var57.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				this.field1543.method228(231);
				this.field1543.method230(var6);
				this.field1543.method230(this.field1388);
			}
		}
		if (var5 == 275) {
			ClientPlayer var58 = this.field1378[var6];
			if (var58 != null) {
				this.method488(0, 1, 0, var58.field460[0], 2, field1231.field461[0], field1231.field460[0], var58.field461[0], false, 1, 0);
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 2;
				this.field1500 = 0;
				this.field1543.method228(113);
				this.field1543.method230(var6);
				this.field1543.method230(this.field1198);
				this.field1543.method230(this.field1196);
				this.field1543.method230(this.field1197);
			}
		}
		if (var5 == 743) {
			field1284++;
			if (field1284 >= 124) {
				this.field1543.method228(77);
				this.field1543.method230(37954);
			}
			this.method531(var3, var4, var6, 98);
		}
		if (var5 != 102) {
			this.field1195 = 0;
			this.field1387 = 0;
			this.field1200 = true;
			return;
		}
		this.field1195 = 1;
		this.field1196 = var3;
		this.field1197 = var4;
		this.field1198 = var6;
		this.field1199 = ObjType.method350(var6).field1024;
		this.field1387 = 0;
		this.field1200 = true;
	}

	@ObfuscatedName("client.d(I)V")
	public final void method434() {
		if (this.field1317 != 2) {
			return;
		}
		for (LocChange var2 = (LocChange) this.field1636.method258(); var2 != null; var2 = (LocChange) this.field1636.method260()) {
			if (var2.field740 > 0) {
				var2.field740--;
			}
			if (var2.field740 != 0) {
				if (var2.field739 > 0) {
					var2.field739--;
				}
				if (var2.field739 == 0 && var2.field731 >= 1 && var2.field732 >= 1 && var2.field731 <= 102 && var2.field732 <= 102 && (var2.field736 < 0 || World.method30(var2.field736, var2.field738))) {
					this.method547(var2.field729, var2.field737, var2.field736, var2.field732, var2.field730, var2.field738, var2.field731);
					var2.field739 = -1;
					if (var2.field736 == var2.field733 && var2.field733 == -1) {
						var2.method120();
					} else if (var2.field736 == var2.field733 && var2.field737 == var2.field734 && var2.field738 == var2.field735) {
						var2.method120();
					}
				}
			} else if (var2.field733 < 0 || World.method30(var2.field733, var2.field735)) {
				this.method547(var2.field729, var2.field734, var2.field733, var2.field732, var2.field730, var2.field735, var2.field731);
				var2.method120();
			}
		}
	}

	@ObfuscatedName("client.b(B)V")
	public final void update() {
		if (this.field1410 || this.field1508 || this.field1194) {
			return;
		}
		field1591++;
		if (this.field1238) {
			this.method536();
		} else {
			this.method552();
		}
		this.method465();
	}

	@ObfuscatedName("client.e(I)V")
	public final void method435() {
		if (field1242 && this.field1317 == 2 && World.field45 != this.field1277) {
			this.field1484.method268();
			this.field1345.method214(151, "Loading - please wait.", 257, 0);
			this.field1345.method214(150, "Loading - please wait.", 256, 16777215);
			this.field1484.method269(4, 4, super.field15);
			this.field1317 = 1;
			this.field1527 = System.currentTimeMillis();
		}
		if (this.field1317 == 1) {
			int var2 = this.method436();
			if (var2 != 0 && System.currentTimeMillis() - this.field1527 > 360000L) {
				signlink.reporterror(this.field1426 + " glcfb " + this.field1517 + "," + var2 + "," + field1242 + "," + this.field1232[0] + "," + this.field1415.method290() + "," + this.field1277 + "," + this.field1480 + "," + this.field1481);
				this.field1527 = System.currentTimeMillis();
			}
		}
		if (this.field1317 == 2 && this.field1277 != this.field1638) {
			this.field1638 = this.field1277;
			this.method527(this.field1277);
		}
	}

	@ObfuscatedName("client.d(B)I")
	public final int method436() {
		for (int var2 = 0; var2 < this.field1472.length; var2++) {
			if (this.field1472[var2] == null && this.field1505[var2] != -1) {
				return -1;
			}
			if (this.field1436[var2] == null && this.field1506[var2] != -1) {
				return -2;
			}
		}
		boolean var3 = true;
		for (int var4 = 0; var4 < this.field1472.length; var4++) {
			byte[] var5 = this.field1436[var4];
			if (var5 != null) {
				int var6 = (this.field1504[var4] >> 8) * 64 - this.field1487;
				int var7 = (this.field1504[var4] & 0xFF) * 64 - this.field1488;
				var3 &= World.method16(var7, var6, var5);
			}
		}
		if (!var3) {
			return -3;
		} else if (this.field1398) {
			return -4;
		} else {
			this.field1317 = 2;
			boolean var8 = false;
			World.field45 = this.field1277;
			this.method553();
			this.field1543.method228(134);
			return 0;
		}
	}

	@ObfuscatedName("client.a(ZB)V")
	public final void method437(boolean arg0) {
		this.method534();
		this.field1546.method268();
		this.field1392.method212(0, 0);
		short var4 = 360;
		short var5 = 200;
		if (this.field1493 == 0) {
			int var6 = var5 / 2 + 80;
			this.field1344.method215(7711145, var4 / 2, this.field1415.field833, var6, true);
			int var7 = var5 / 2 - 20;
			this.field1346.method215(16776960, var4 / 2, "Welcome to RuneScape", var7, true);
			int var18 = var7 + 30;
			int var8 = var4 / 2 - 80;
			int var9 = var5 / 2 + 20;
			this.field1393.method212(var8 - 73, var9 - 20);
			this.field1346.method215(16777215, var8, "New user", var9 + 5, true);
			int var10 = var4 / 2 + 80;
			this.field1393.method212(var10 - 73, var9 - 20);
			this.field1346.method215(16777215, var10, "Existing User", var9 + 5, true);
		}
		if (this.field1493 == 2) {
			int var11 = var5 / 2 - 40;
			if (this.field1417.length() > 0) {
				this.field1346.method215(16776960, var4 / 2, this.field1417, var11 - 15, true);
				this.field1346.method215(16776960, var4 / 2, this.field1418, var11, true);
				var11 += 30;
			} else {
				this.field1346.method215(16776960, var4 / 2, this.field1418, var11 - 7, true);
				var11 += 30;
			}
			this.field1346.method219(true, "Username: " + this.field1426 + (this.field1422 == 0 & field1591 % 40 < 20 ? "@yel@|" : ""), var11, 16777215, var4 / 2 - 90);
			var11 += 15;
			this.field1346.method219(true, "Password: " + JString.method316(this.field1427) + (this.field1422 == 1 & field1591 % 40 < 20 ? "@yel@|" : ""), var11, 16777215, var4 / 2 - 88);
			var11 += 15;
			if (!arg0) {
				int var12 = var4 / 2 - 80;
				int var13 = var5 / 2 + 50;
				this.field1393.method212(var12 - 73, var13 - 20);
				this.field1346.method215(16777215, var12, "Login", var13 + 5, true);
				int var14 = var4 / 2 + 80;
				this.field1393.method212(var14 - 73, var13 - 20);
				this.field1346.method215(16777215, var14, "Cancel", var13 + 5, true);
			}
		}
		if (this.field1493 == 3) {
			this.field1346.method215(16776960, var4 / 2, "Create a free account", var5 / 2 - 60, true);
			int var15 = var5 / 2 - 35;
			this.field1346.method215(16777215, var4 / 2, "To create a new account you need to", var15, true);
			int var19 = var15 + 15;
			this.field1346.method215(16777215, var4 / 2, "go back to the main RuneScape webpage", var19, true);
			int var20 = var19 + 15;
			this.field1346.method215(16777215, var4 / 2, "and choose the red 'create account'", var20, true);
			int var21 = var20 + 15;
			this.field1346.method215(16777215, var4 / 2, "button at the top right of that page.", var21, true);
			int var22 = var21 + 15;
			int var16 = var4 / 2;
			int var17 = var5 / 2 + 50;
			this.field1393.method212(var16 - 73, var17 - 20);
			this.field1346.method215(16777215, var16, "Cancel", var17 + 5, true);
		}
		this.field1546.method269(171, 202, super.field15);
		if (!this.field1448) {
			return;
		}
		this.field1448 = false;
		this.field1544.method269(0, 128, super.field15);
		this.field1545.method269(371, 202, super.field15);
		this.field1549.method269(265, 0, super.field15);
		this.field1550.method269(265, 562, super.field15);
		this.field1551.method269(171, 128, super.field15);
		this.field1552.method269(171, 562, super.field15);
	}

	@ObfuscatedName("client.c(Z)V")
	public final void method438() {
		if (this.field1366 != 0) {
			return;
		}
		this.field1292[0] = "Cancel";
		this.field1205[0] = 1106;
		this.field1314 = 1;
		this.method485();
		this.field1456 = 0;
		if (super.field23 > 4 && super.field24 > 4 && super.field23 < 516 && super.field24 < 338) {
			if (this.field1523 == -1) {
				this.method496();
			} else {
				this.method460(super.field24, 4, Component.field70[this.field1523], 4, super.field23, 0);
			}
		}
		if (this.field1456 != this.field1582) {
			this.field1582 = this.field1456;
		}
		this.field1456 = 0;
		if (super.field23 > 553 && super.field24 > 205 && super.field23 < 743 && super.field24 < 466) {
			if (this.field1594 != -1) {
				this.method460(super.field24, 205, Component.field70[this.field1594], 553, super.field23, 0);
			} else if (this.field1468[this.field1248] != -1) {
				this.method460(super.field24, 205, Component.field70[this.field1468[this.field1248]], 553, super.field23, 0);
			}
		}
		if (this.field1456 != this.field1629) {
			this.field1200 = true;
			this.field1629 = this.field1456;
		}
		this.field1456 = 0;
		if (super.field23 > 17 && super.field24 > 357 && super.field23 < 496 && super.field24 < 453) {
			if (this.field1558 != -1) {
				this.method460(super.field24, 357, Component.field70[this.field1558], 17, super.field23, 0);
			} else if (super.field24 < 434 && super.field23 < 426) {
				this.method532(super.field24 - 357, super.field23 - 17);
			}
		}
		if (this.field1558 != -1 && this.field1456 != this.field1608) {
			this.field1528 = true;
			this.field1608 = this.field1456;
		}
		boolean var2 = false;
		while (!var2) {
			var2 = true;
			for (int var3 = 0; var3 < this.field1314 - 1; var3++) {
				if (this.field1205[var3] < 1000 && this.field1205[var3 + 1] > 1000) {
					String var4 = this.field1292[var3];
					this.field1292[var3] = this.field1292[var3 + 1];
					this.field1292[var3 + 1] = var4;
					int var5 = this.field1205[var3];
					this.field1205[var3] = this.field1205[var3 + 1];
					this.field1205[var3 + 1] = var5;
					int var6 = this.field1203[var3];
					this.field1203[var3] = this.field1203[var3 + 1];
					this.field1203[var3 + 1] = var6;
					int var7 = this.field1204[var3];
					this.field1204[var3] = this.field1204[var3 + 1];
					this.field1204[var3 + 1] = var7;
					int var8 = this.field1206[var3];
					this.field1206[var3] = this.field1206[var3 + 1];
					this.field1206[var3 + 1] = var8;
					var2 = false;
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZIIILbb;)V")
	public final void method439(int arg1, int arg2, int arg3, ClientPlayer arg4) {
		if (arg4 == field1231 || this.field1314 >= 400) {
			return;
		}
		String var6 = arg4.field468 + method450(arg4.field474, field1231.field474) + " (level-" + arg4.field474 + ")";
		if (this.field1195 == 1) {
			this.field1292[this.field1314] = "Use " + this.field1199 + " with @whi@" + var6;
			this.field1205[this.field1314] = 275;
			this.field1206[this.field1314] = arg2;
			this.field1203[this.field1314] = arg3;
			this.field1204[this.field1314] = arg1;
			this.field1314++;
		} else if (this.field1387 != 1) {
			for (int var7 = 4; var7 >= 0; var7--) {
				if (this.field1605[var7] != null) {
					this.field1292[this.field1314] = this.field1605[var7] + " @whi@" + var6;
					short var8 = 0;
					if (this.field1605[var7].equalsIgnoreCase("attack")) {
						if (arg4.field474 > field1231.field474) {
							var8 = 2000;
						}
					} else if (this.field1606[var7]) {
						var8 = 2000;
					}
					if (var7 == 0) {
						this.field1205[this.field1314] = var8 + 639;
					}
					if (var7 == 1) {
						this.field1205[this.field1314] = var8 + 499;
					}
					if (var7 == 2) {
						this.field1205[this.field1314] = var8 + 27;
					}
					if (var7 == 3) {
						this.field1205[this.field1314] = var8 + 387;
					}
					if (var7 == 4) {
						this.field1205[this.field1314] = var8 + 185;
					}
					this.field1206[this.field1314] = arg2;
					this.field1203[this.field1314] = arg3;
					this.field1204[this.field1314] = arg1;
					this.field1314++;
				}
			}
		} else if ((this.field1389 & 0x8) == 8) {
			this.field1292[this.field1314] = this.field1390 + " @whi@" + var6;
			this.field1205[this.field1314] = 131;
			this.field1206[this.field1314] = arg2;
			this.field1203[this.field1314] = arg3;
			this.field1204[this.field1314] = arg1;
			this.field1314++;
		}
		for (int var9 = 0; var9 < this.field1314; var9++) {
			if (this.field1205[var9] == 718) {
				this.field1292[var9] = "Walk here @whi@" + var6;
				break;
			}
		}
	}

	@ObfuscatedName("client.a(Ld;I)Z")
	public final boolean method440(Component arg0) {
		int var3 = arg0.field79;
		if (this.field1610 == 2) {
			if (var3 == 201) {
				this.field1528 = true;
				this.field1621 = false;
				this.field1611 = true;
				this.field1588 = "";
				this.field1619 = 1;
				this.field1576 = "Enter name of friend to add to list";
			}
			if (var3 == 202) {
				this.field1528 = true;
				this.field1621 = false;
				this.field1611 = true;
				this.field1588 = "";
				this.field1619 = 2;
				this.field1576 = "Enter name of friend to delete from list";
			}
		}
		if (var3 == 205) {
			this.field1432 = 250;
			return true;
		}
		if (var3 == 501) {
			this.field1528 = true;
			this.field1621 = false;
			this.field1611 = true;
			this.field1588 = "";
			this.field1619 = 4;
			this.field1576 = "Enter name of player to add to list";
		}
		if (var3 == 502) {
			this.field1528 = true;
			this.field1621 = false;
			this.field1611 = true;
			this.field1588 = "";
			this.field1619 = 5;
			this.field1576 = "Enter name of player to delete from list";
		}
		if (var3 >= 300 && var3 <= 313) {
			int var4 = (var3 - 300) / 2;
			int var5 = var3 & 0x1;
			int var6 = this.field1327[var4];
			if (var6 != -1) {
				while (true) {
					if (var5 == 0) {
						var6--;
						if (var6 < 0) {
							var6 = IdkType.field1090 - 1;
						}
					}
					if (var5 == 1) {
						var6++;
						if (var6 >= IdkType.field1090) {
							var6 = 0;
						}
					}
					if (!IdkType.field1091[var6].field1097 && IdkType.field1091[var6].field1092 == var4 + (this.field1494 ? 0 : 7)) {
						this.field1327[var4] = var6;
						this.field1438 = true;
						break;
					}
				}
			}
		}
		if (var3 >= 314 && var3 <= 323) {
			int var7 = (var3 - 314) / 2;
			int var8 = var3 & 0x1;
			int var9 = this.field1514[var7];
			if (var8 == 0) {
				var9--;
				if (var9 < 0) {
					var9 = field1538[var7].length - 1;
				}
			}
			if (var8 == 1) {
				var9++;
				if (var9 >= field1538[var7].length) {
					var9 = 0;
				}
			}
			this.field1514[var7] = var9;
			this.field1438 = true;
		}
		if (var3 == 324 && !this.field1494) {
			this.field1494 = true;
			this.method452();
		}
		if (var3 == 325 && this.field1494) {
			this.field1494 = false;
			this.method452();
		}
		if (var3 == 326) {
			this.field1543.method228(13);
			this.field1543.method229(this.field1494 ? 0 : 1);
			for (int var10 = 0; var10 < 7; var10++) {
				this.field1543.method229(this.field1327[var10]);
			}
			for (int var11 = 0; var11 < 5; var11++) {
				this.field1543.method229(this.field1514[var11]);
			}
			return true;
		}
		if (var3 == 613) {
			this.field1623 = !this.field1623;
		}
		if (var3 >= 601 && var3 <= 612) {
			this.method442();
			if (this.field1444.length() > 0) {
				this.field1543.method228(203);
				this.field1543.method235(JString.method310(this.field1444));
				this.field1543.method229(var3 - 601);
				this.field1543.method229(this.field1623 ? 1 : 0);
			}
		}
		return false;
	}

	@ObfuscatedName("client.f(I)V")
	public final void method441() {
		try {
			int var2 = field1231.field410 + this.field1556;
			int var3 = field1231.field411 + this.field1272;
			if (this.field1372 - var2 < -500 || this.field1372 - var2 > 500 || this.field1373 - var3 < -500 || this.field1373 - var3 > 500) {
				this.field1372 = var2;
				this.field1373 = var3;
			}
			if (this.field1372 != var2) {
				this.field1372 += (var2 - this.field1372) / 16;
			}
			if (this.field1373 != var3) {
				this.field1373 += (var3 - this.field1373) / 16;
			}
			if (super.field33[1] == 1) {
				this.field1254 += (-24 - this.field1254) / 2;
			} else if (super.field33[2] == 1) {
				this.field1254 += (24 - this.field1254) / 2;
			} else {
				this.field1254 /= 2;
			}
			if (super.field33[3] == 1) {
				this.field1255 += (12 - this.field1255) / 2;
			} else if (super.field33[4] == 1) {
				this.field1255 += (-12 - this.field1255) / 2;
			} else {
				this.field1255 /= 2;
			}
			this.field1253 = this.field1253 + this.field1254 / 2 & 0x7FF;
			this.field1252 += this.field1255 / 2;
			if (this.field1252 < 128) {
				this.field1252 = 128;
			}
			if (this.field1252 > 383) {
				this.field1252 = 383;
			}
			int var4 = this.field1372 >> 7;
			int var5 = this.field1373 >> 7;
			int var6 = this.method470(this.field1373, this.field1277, this.field1372);
			int var7 = 0;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
						int var10 = this.field1277;
						if (var10 < 3 && (this.field1512[1][var8][var9] & 0x2) == 2) {
							var10++;
						}
						int var11 = var6 - this.field1276[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}
			int var12 = var7 * 192;
			if (var12 > 98048) {
				var12 = 98048;
			}
			if (var12 < 32768) {
				var12 = 32768;
			}
			if (var12 > this.field1394) {
				this.field1394 += (var12 - this.field1394) / 24;
			} else if (var12 < this.field1394) {
				this.field1394 += (var12 - this.field1394) / 80;
			}
		} catch (Exception var13) {
			signlink.reporterror("glfc_ex " + field1231.field410 + "," + field1231.field411 + "," + this.field1372 + "," + this.field1373 + "," + this.field1480 + "," + this.field1481 + "," + this.field1487 + "," + this.field1488);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedName("client.g(I)V")
	public final void method442() {
		this.field1543.method228(58);
		if (this.field1594 != -1) {
			this.field1594 = -1;
			this.field1200 = true;
			this.field1420 = false;
			this.field1352 = true;
		}
		if (this.field1558 != -1) {
			this.field1558 = -1;
			this.field1528 = true;
			this.field1420 = false;
		}
		this.field1523 = -1;
	}

	@ObfuscatedName("client.a(IIZ)V")
	public final void method443(int arg1, boolean arg2) {
		signlink.midivol = arg1;
		if (arg2) {
			signlink.midi = "voladjust";
		}
	}

	@ObfuscatedName("client.h(I)Ljava/net/Socket;")
	public final Socket method444(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.d(Z)V")
	public final void method445() {
		if (this.field1342 == 0) {
			return;
		}
		PixFont var3 = this.field1345;
		int var4 = 0;
		if (this.field1452 != 0) {
			var4 = 1;
		}
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.field1247[var5] != null) {
				int var6 = this.field1245[var5];
				String var7 = this.field1246[var5];
				byte var8 = 0;
				if (var7 != null && var7.startsWith("@cr1@")) {
					var7 = var7.substring(5);
					var8 = 1;
				}
				if (var7 != null && var7.startsWith("@cr2@")) {
					var7 = var7.substring(5);
					var8 = 2;
				}
				if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var7))) {
					int var9 = 329 - var4 * 13;
					byte var10 = 4;
					var3.method217(0, var10, var9, "From");
					var3.method217(65535, var10, var9 - 1, "From");
					int var11 = var10 + var3.method216("From ");
					if (var8 == 1) {
						this.field1630[0].method212(var11, var9 - 12);
						var11 += 14;
					}
					if (var8 == 2) {
						this.field1630[1].method212(var11, var9 - 12);
						var11 += 14;
					}
					var3.method217(0, var11, var9, var7 + ": " + this.field1247[var5]);
					var3.method217(65535, var11, var9 - 1, var7 + ": " + this.field1247[var5]);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
				if (var6 == 5 && this.field1625 < 2) {
					int var12 = 329 - var4 * 13;
					var3.method217(0, 4, var12, this.field1247[var5]);
					var3.method217(65535, 4, var12 - 1, this.field1247[var5]);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
				if (var6 == 6 && this.field1625 < 2) {
					int var13 = 329 - var4 * 13;
					var3.method217(0, 4, var13, "To " + var7 + ": " + this.field1247[var5]);
					var3.method217(65535, 4, var13 - 1, "To " + var7 + ": " + this.field1247[var5]);
					var4++;
					if (var4 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IILd;II)V")
	public final void method446(int arg1, Component arg2, int arg3, int arg4) {
		if (arg2.field77 != 0 || arg2.field92 == null || arg2.field91 && this.field1582 != arg2.field75 && this.field1629 != arg2.field75 && this.field1608 != arg2.field75) {
			return;
		}
		int var6 = Pix2D.field628;
		int var7 = Pix2D.field626;
		int var8 = Pix2D.field629;
		int var9 = Pix2D.field627;
		Pix2D.method167(arg3 + arg2.field80, arg3, arg1 + arg2.field81, arg1);
		int var10 = arg2.field92.length;
		for (int var11 = 0; var11 < var10; var11++) {
			int var12 = arg2.field93[var11] + arg3;
			int var13 = arg2.field94[var11] + arg1 - arg4;
			Component var14 = Component.field70[arg2.field92[var11]];
			int var15 = var12 + var14.field83;
			int var16 = var13 + var14.field84;
			if (var14.field79 > 0) {
				this.method500(var14);
			}
			if (var14.field77 == 0) {
				if (var14.field90 > var14.field89 - var14.field81) {
					var14.field90 = var14.field89 - var14.field81;
				}
				if (var14.field90 < 0) {
					var14.field90 = 0;
				}
				this.method446(var16, var14, var15, var14.field90);
				if (var14.field89 > var14.field81) {
					this.method478(var14.field81, var14.field89, var15 + var14.field80, var14.field90, var16);
				}
			} else if (var14.field77 != 1) {
				if (var14.field77 == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var14.field81; var18++) {
						for (int var19 = 0; var19 < var14.field80; var19++) {
							int var20 = var15 + var19 * (var14.field101 + 32);
							int var21 = var16 + var18 * (var14.field102 + 32);
							if (var17 < 20) {
								var20 += var14.field104[var17];
								var21 += var14.field105[var17];
							}
							if (var14.field71[var17] > 0) {
								int var22 = 0;
								int var23 = 0;
								int var24 = var14.field71[var17] - 1;
								if (var20 > Pix2D.field628 - 32 && var20 < Pix2D.field629 && var21 > Pix2D.field626 - 32 && var21 < Pix2D.field627 || this.field1366 != 0 && this.field1365 == var17) {
									int var25 = 0;
									if (this.field1195 == 1 && this.field1196 == var17 && this.field1197 == var14.field75) {
										var25 = 16777215;
									}
									Pix32 var26 = ObjType.method356(var25, var14.field72[var17], var24);
									if (var26 != null) {
										if (this.field1366 != 0 && this.field1365 == var17 && this.field1364 == var14.field75) {
											var22 = super.field23 - this.field1367;
											var23 = super.field24 - this.field1368;
											if (var22 < 5 && var22 > -5) {
												var22 = 0;
											}
											if (var23 < 5 && var23 > -5) {
												var23 = 0;
											}
											if (this.field1251 < 5) {
												var22 = 0;
												var23 = 0;
											}
											var26.method201(var20 + var22, 128, var21 + var23);
											if (var21 + var23 < Pix2D.field626 && arg2.field90 > 0) {
												int var27 = this.field1464 * (Pix2D.field626 - var21 - var23) / 3;
												if (var27 > this.field1464 * 10) {
													var27 = this.field1464 * 10;
												}
												if (var27 > arg2.field90) {
													var27 = arg2.field90;
												}
												arg2.field90 -= var27;
												this.field1368 += var27;
											}
											if (var21 + var23 + 32 > Pix2D.field627 && arg2.field90 < arg2.field89 - arg2.field81) {
												int var28 = this.field1464 * (var21 + var23 + 32 - Pix2D.field627) / 3;
												if (var28 > this.field1464 * 10) {
													var28 = this.field1464 * 10;
												}
												if (var28 > arg2.field89 - arg2.field81 - arg2.field90) {
													var28 = arg2.field89 - arg2.field81 - arg2.field90;
												}
												arg2.field90 += var28;
												this.field1368 -= var28;
											}
										} else if (this.field1225 != 0 && this.field1224 == var17 && this.field1223 == var14.field75) {
											var26.method201(var20, 128, var21);
										} else {
											var26.method199(var20, var21);
										}
										if (var26.field671 == 33 || var14.field72[var17] != 1) {
											int var29 = var14.field72[var17];
											this.field1344.method217(0, var20 + 1 + var22, var21 + 10 + var23, method544(var29));
											this.field1344.method217(16776960, var20 + var22, var21 + 9 + var23, method544(var29));
										}
									}
								}
							} else if (var14.field103 != null && var17 < 20) {
								Pix32 var30 = var14.field103[var17];
								if (var30 != null) {
									var30.method199(var20, var21);
								}
							}
							var17++;
						}
					}
				} else if (var14.field77 == 3) {
					boolean var31 = false;
					if (this.field1608 == var14.field75 || this.field1629 == var14.field75 || this.field1582 == var14.field75) {
						var31 = true;
					}
					int var32;
					if (this.method458(var14)) {
						var32 = var14.field114;
						if (var31 && var14.field116 != 0) {
							var32 = var14.field116;
						}
					} else {
						var32 = var14.field113;
						if (var31 && var14.field115 != 0) {
							var32 = var14.field115;
						}
					}
					if (var14.field82 == 0) {
						if (var14.field107) {
							Pix2D.method170(var14.field81, var14.field80, var15, var16, var32);
						} else {
							Pix2D.method171(var32, var14.field80, var16, var15, var14.field81);
						}
					} else if (var14.field107) {
						Pix2D.method169(var16, 256 - (var14.field82 & 0xFF), var15, var14.field81, var14.field80, var32);
					} else {
						Pix2D.method172(256 - (var14.field82 & 0xFF), var32, var14.field80, var15, var14.field81, var16);
					}
				} else if (var14.field77 == 4) {
					PixFont var33 = var14.field110;
					String var34 = var14.field111;
					boolean var35 = false;
					if (this.field1608 == var14.field75 || this.field1629 == var14.field75 || this.field1582 == var14.field75) {
						var35 = true;
					}
					int var36;
					if (this.method458(var14)) {
						var36 = var14.field114;
						if (var35 && var14.field116 != 0) {
							var36 = var14.field116;
						}
						if (var14.field112.length() > 0) {
							var34 = var14.field112;
						}
					} else {
						var36 = var14.field113;
						if (var35 && var14.field115 != 0) {
							var36 = var14.field115;
						}
					}
					if (var14.field78 == 6 && this.field1420) {
						var34 = "Please wait...";
						var36 = var14.field113;
					}
					if (Pix2D.field624 == 479) {
						if (var36 == 16776960) {
							var36 = 255;
						}
						if (var36 == 49152) {
							var36 = 16777215;
						}
					}
					int var37 = var16 + var33.field694;
					while (var34.length() > 0) {
						if (var34.indexOf("%") != -1) {
							label348: while (true) {
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
																	break label348;
																}
																var34 = var34.substring(0, var42) + this.method432(this.method546(4, var14)) + var34.substring(var42 + 2);
															}
														}
														var34 = var34.substring(0, var41) + this.method432(this.method546(3, var14)) + var34.substring(var41 + 2);
													}
												}
												var34 = var34.substring(0, var40) + this.method432(this.method546(2, var14)) + var34.substring(var40 + 2);
											}
										}
										var34 = var34.substring(0, var39) + this.method432(this.method546(1, var14)) + var34.substring(var39 + 2);
									}
								}
								var34 = var34.substring(0, var38) + this.method432(this.method546(0, var14)) + var34.substring(var38 + 2);
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
						if (var14.field108) {
							var33.method215(var36, var15 + var14.field80 / 2, var44, var37, var14.field109);
						} else {
							var33.method219(var14.field109, var44, var37, var36, var15);
						}
						var37 += var33.field694;
					}
				} else if (var14.field77 == 5) {
					Pix32 var45;
					if (this.method458(var14)) {
						var45 = var14.field118;
					} else {
						var45 = var14.field117;
					}
					if (var45 != null) {
						var45.method199(var15, var16);
					}
				} else if (var14.field77 == 6) {
					int var46 = Pix3D.field641;
					int var47 = Pix3D.field642;
					Pix3D.field641 = var15 + var14.field80 / 2;
					Pix3D.field642 = var16 + var14.field81 / 2;
					int var48 = Pix3D.field645[var14.field126] * var14.field125 >> 16;
					int var49 = Pix3D.field646[var14.field126] * var14.field125 >> 16;
					boolean var50 = this.method458(var14);
					int var51;
					if (var50) {
						var51 = var14.field124;
					} else {
						var51 = var14.field123;
					}
					Model var52;
					if (var51 == -1) {
						var52 = var14.method34(-1, var50, -1);
					} else {
						SeqType var53 = SeqType.field1112[var51];
						var52 = var14.method34(var53.field1114[var14.field73], var50, var53.field1115[var14.field73]);
					}
					if (var52 != null) {
						var52.method159(0, var14.field127, 0, var14.field126, 0, var48, var49);
					}
					Pix3D.field641 = var46;
					Pix3D.field642 = var47;
				} else if (var14.field77 == 7) {
					PixFont var54 = var14.field110;
					int var55 = 0;
					for (int var56 = 0; var56 < var14.field81; var56++) {
						for (int var57 = 0; var57 < var14.field80; var57++) {
							if (var14.field71[var55] > 0) {
								ObjType var58 = ObjType.method350(var14.field71[var55] - 1);
								String var59 = var58.field1024;
								if (var58.field1035 || var14.field72[var55] != 1) {
									var59 = var59 + " x" + method468(var14.field72[var55]);
								}
								int var60 = var15 + var57 * (var14.field101 + 115);
								int var61 = var16 + var56 * (var14.field102 + 12);
								if (var14.field108) {
									var54.method215(var14.field113, var60 + var14.field80 / 2, var59, var61, var14.field109);
								} else {
									var54.method219(var14.field109, var59, var61, var14.field113, var60);
								}
							}
							var55++;
						}
					}
				}
			}
		}
		Pix2D.method167(var8, var6, var9, var7);
	}

	@ObfuscatedName("client.a(JI)V")
	public final void method447(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field1646; var4++) {
			if (this.field1515[var4] == arg0) {
				this.field1646--;
				this.field1200 = true;
				for (int var5 = var4; var5 < this.field1646; var5++) {
					this.field1515[var5] = this.field1515[var5 + 1];
				}
				this.field1543.method228(193);
				this.field1543.method235(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;B)Z")
	public final boolean method448(String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var3 = 0; var3 < this.field1609; var3++) {
			if (arg0.equalsIgnoreCase(this.field1257[var3])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(field1231.field468);
	}

	@ObfuscatedName("client.i(I)V")
	public final void method449() {
		short var2 = 256;
		if (this.field1358 > 0) {
			for (int var3 = 0; var3 < 256; var3++) {
				if (this.field1358 > 768) {
					this.field1639[var3] = this.method480(this.field1640[var3], 1024 - this.field1358, this.field1641[var3]);
				} else if (this.field1358 > 256) {
					this.field1639[var3] = this.field1641[var3];
				} else {
					this.field1639[var3] = this.method480(this.field1641[var3], 256 - this.field1358, this.field1640[var3]);
				}
			}
		} else if (this.field1359 > 0) {
			for (int var4 = 0; var4 < 256; var4++) {
				if (this.field1359 > 768) {
					this.field1639[var4] = this.method480(this.field1640[var4], 1024 - this.field1359, this.field1642[var4]);
				} else if (this.field1359 > 256) {
					this.field1639[var4] = this.field1642[var4];
				} else {
					this.field1639[var4] = this.method480(this.field1642[var4], 256 - this.field1359, this.field1640[var4]);
				}
			}
		} else {
			for (int var5 = 0; var5 < 256; var5++) {
				this.field1639[var5] = this.field1640[var5];
			}
		}
		for (int var6 = 0; var6 < 33920; var6++) {
			this.field1547.field749[var6] = this.field1518.field666[var6];
		}
		int var7 = 0;
		int var8 = 1152;
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			int var10 = this.field1287[var9] * (var2 - var9) / var2;
			int var11 = var10 + 22;
			if (var11 < 0) {
				var11 = 0;
			}
			var7 += var11;
			for (int var12 = var11; var12 < 128; var12++) {
				int var13 = this.field1465[var7++];
				if (var13 == 0) {
					var8++;
				} else {
					int var15 = 256 - var13;
					int var16 = this.field1639[var13];
					int var17 = this.field1547.field749[var8];
					this.field1547.field749[var8++] = ((var16 & 0xFF00FF) * var13 + (var17 & 0xFF00FF) * var15 & 0xFF00FF00) + ((var16 & 0xFF00) * var13 + (var17 & 0xFF00) * var15 & 0xFF0000) >> 8;
				}
			}
			var8 += var11;
		}
		this.field1547.method269(0, 0, super.field15);
		for (int var18 = 0; var18 < 33920; var18++) {
			this.field1548.field749[var18] = this.field1519.field666[var18];
		}
		int var19 = 0;
		int var20 = 1176;
		for (int var21 = 1; var21 < var2 - 1; var21++) {
			int var22 = this.field1287[var21] * (var2 - var21) / var2;
			int var23 = 103 - var22;
			int var24 = var20 + var22;
			for (int var25 = 0; var25 < var23; var25++) {
				int var26 = this.field1465[var19++];
				if (var26 == 0) {
					var24++;
				} else {
					int var28 = 256 - var26;
					int var29 = this.field1639[var26];
					int var30 = this.field1548.field749[var24];
					this.field1548.field749[var24++] = ((var29 & 0xFF00FF) * var26 + (var30 & 0xFF00FF) * var28 & 0xFF00FF00) + ((var29 & 0xFF00) * var26 + (var30 & 0xFF00) * var28 & 0xFF0000) >> 8;
				}
			}
			var19 += 128 - var23;
			var20 = var24 + (128 - var23 - var22);
		}
		this.field1548.method269(0, 637, super.field15);
	}

	public final String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.b(III)Ljava/lang/String;")
	public static final String method450(int arg1, int arg2) {
		int var4 = arg2 - arg1;
		if (var4 < -9) {
			return "@red@";
		} else if (var4 < -6) {
			return "@or3@";
		} else if (var4 < -3) {
			return "@or2@";
		} else if (var4 < 0) {
			return "@or1@";
		} else if (var4 > 9) {
			return "@gre@";
		} else if (var4 > 6) {
			return "@gr3@";
		} else if (var4 > 3) {
			return "@gr2@";
		} else if (var4 > 0) {
			return "@gr1@";
		} else {
			return "@yel@";
		}
	}

	@ObfuscatedName("client.j(I)V")
	public final void method451() {
		if (this.field1485 != null) {
			return;
		}
		this.method545();
		super.field16 = null;
		this.field1544 = null;
		this.field1545 = null;
		this.field1546 = null;
		this.field1547 = null;
		this.field1548 = null;
		this.field1549 = null;
		this.field1550 = null;
		this.field1551 = null;
		this.field1552 = null;
		this.field1485 = new PixMap(this.method11(), 479, 96);
		this.field1483 = new PixMap(this.method11(), 172, 156);
		Pix2D.method168();
		this.field1296.method212(0, 0);
		this.field1482 = new PixMap(this.method11(), 190, 261);
		this.field1484 = new PixMap(this.method11(), 512, 334);
		Pix2D.method168();
		this.field1532 = new PixMap(this.method11(), 496, 50);
		this.field1533 = new PixMap(this.method11(), 269, 37);
		this.field1534 = new PixMap(this.method11(), 249, 45);
		this.field1448 = true;
	}

	@ObfuscatedName("client.b(I)V")
	public final void method10() {
		this.field1448 = true;
	}

	public final void init() {
		field1239 = Integer.parseInt(this.getParameter("nodeid"));
		field1240 = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method560();
		} else {
			method543();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field1241 = false;
		} else {
			field1241 = true;
		}
		this.method2(503, 765);
	}

	@ObfuscatedName("client.e(Z)V")
	public final void method452() {
		this.field1438 = true;
		for (int var2 = 0; var2 < 7; var2++) {
			this.field1327[var2] = -1;
			for (int var3 = 0; var3 < IdkType.field1090; var3++) {
				if (!IdkType.field1091[var3].field1097 && IdkType.field1091[var3].field1092 == var2 + (this.field1494 ? 0 : 7)) {
					this.field1327[var2] = var3;
					break;
				}
			}
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public final void method453() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	@ObfuscatedName("client.a(ILob;)V")
	public final void method454(LocChange arg1) {
		int var4 = 0;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (arg1.field730 == 0) {
			var4 = this.field1325.method90(arg1.field729, arg1.field731, arg1.field732);
		}
		if (arg1.field730 == 1) {
			var4 = this.field1325.method91(arg1.field731, arg1.field729, arg1.field732);
		}
		if (arg1.field730 == 2) {
			var4 = this.field1325.method92(arg1.field729, arg1.field731, arg1.field732);
		}
		if (arg1.field730 == 3) {
			var4 = this.field1325.method93(arg1.field729, arg1.field731, arg1.field732);
		}
		if (var4 != 0) {
			int var8 = this.field1325.method94(arg1.field729, arg1.field731, arg1.field732, var4);
			var5 = var4 >> 14 & 0x7FFF;
			var6 = var8 & 0x1F;
			var7 = var8 >> 6;
		}
		arg1.field733 = var5;
		arg1.field735 = var6;
		arg1.field734 = var7;
	}

	@ObfuscatedName("client.k(I)V")
	public final void method455() {
		this.field1482.method268();
		Pix3D.field647 = this.field1614;
		this.field1295.method212(0, 0);
		if (this.field1594 != -1) {
			this.method446(0, Component.field70[this.field1594], 0, 0);
		} else if (this.field1468[this.field1248] != -1) {
			this.method446(0, Component.field70[this.field1468[this.field1248]], 0, 0);
		}
		if (this.field1384 && this.field1214 == 1) {
			this.method548();
		}
		this.field1482.method269(205, 553, super.field15);
		this.field1484.method268();
		Pix3D.field647 = this.field1615;
	}

	@ObfuscatedName("client.g(Z)Z")
	public final boolean method456() {
		if (this.field1607 == null) {
			return false;
		}
		try {
			int var2 = this.field1607.method40();
			if (var2 == 0) {
				return false;
			}
			if (this.field1429 == -1) {
				this.field1607.method41(this.field1319.field710, 0, 1);
				this.field1429 = this.field1319.field710[0] & 0xFF;
				if (this.field1461 != null) {
					this.field1429 = this.field1429 - this.field1461.method305() & 0xFF;
				}
				this.field1428 = Protocol.field1064[this.field1429];
				var2--;
			}
			if (this.field1428 == -1) {
				if (var2 <= 0) {
					return false;
				}
				this.field1607.method41(this.field1319.field710, 0, 1);
				this.field1428 = this.field1319.field710[0] & 0xFF;
				var2--;
			}
			if (this.field1428 == -2) {
				if (var2 <= 1) {
					return false;
				}
				this.field1607.method41(this.field1319.field710, 0, 2);
				this.field1319.field711 = 0;
				this.field1428 = this.field1319.method241();
				var2 -= 2;
			}
			if (var2 < this.field1428) {
				return false;
			}
			this.field1319.field711 = 0;
			this.field1607.method41(this.field1319.field710, 0, this.field1428);
			this.field1430 = 0;
			this.field1541 = this.field1540;
			this.field1540 = this.field1539;
			this.field1539 = this.field1429;
			if (this.field1429 == 141) {
				int var3 = this.field1319.method241();
				this.method521(var3);
				if (this.field1594 != -1) {
					this.field1594 = -1;
					this.field1200 = true;
					this.field1352 = true;
				}
				this.field1558 = var3;
				this.field1528 = true;
				this.field1523 = -1;
				this.field1420 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 197) {
				int var4 = this.field1319.method241();
				this.method521(var4);
				if (this.field1594 != -1) {
					this.field1594 = -1;
					this.field1200 = true;
					this.field1352 = true;
				}
				if (this.field1558 != -1) {
					this.field1558 = -1;
					this.field1528 = true;
				}
				if (this.field1621) {
					this.field1621 = false;
					this.field1528 = true;
				}
				this.field1523 = var4;
				this.field1420 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 167) {
				this.field1362 = false;
				for (int var5 = 0; var5 < 5; var5++) {
					this.field1649[var5] = false;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 204) {
				int var6 = this.field1319.method239();
				int var7 = this.field1319.method239();
				String var8 = this.field1319.method246();
				if (var6 >= 1 && var6 <= 5) {
					if (var8.equalsIgnoreCase("null")) {
						var8 = null;
					}
					this.field1605[var6 - 1] = var8;
					this.field1606[var6 - 1] = var7 == 0;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 146) {
				this.field1304 = this.field1319.method244();
				this.field1313 = this.field1319.method241();
				this.field1631 = this.field1319.method239();
				this.field1324 = this.field1319.method241();
				this.field1526 = this.field1319.method239();
				if (this.field1304 != 0 && this.field1523 == -1) {
					signlink.dnslookup(JString.method313(this.field1304));
					this.method442();
					short var9 = 650;
					if (this.field1631 != 201 || this.field1526 == 1) {
						var9 = 655;
					}
					this.field1444 = "";
					this.field1623 = false;
					for (int var10 = 0; var10 < Component.field70.length; var10++) {
						if (Component.field70[var10] != null && Component.field70[var10].field79 == var9) {
							this.field1523 = Component.field70[var10].field76;
							break;
						}
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 222) {
				int var11 = this.field1319.method241();
				int var12 = this.field1319.method241();
				int var13 = this.field1319.method241();
				ObjType var14 = ObjType.method350(var12);
				Component.field70[var11].field119 = 4;
				Component.field70[var11].field120 = var12;
				Component.field70[var11].field126 = var14.field1029;
				Component.field70[var11].field127 = var14.field1030;
				Component.field70[var11].field125 = var14.field1028 * 100 / var13;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 63) {
				this.field1646 = this.field1428 / 8;
				for (int var15 = 0; var15 < this.field1646; var15++) {
					this.field1515[var15] = this.field1319.method245();
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 27) {
				int var16 = this.field1319.method241();
				int var17 = this.field1319.method242();
				int var18 = this.field1319.method242();
				Component var19 = Component.field70[var16];
				var19.field83 = var17;
				var19.field84 = var18;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 196) {
				int var20 = this.field1319.method241();
				int var21 = this.field1319.method244();
				this.field1497[var20] = var21;
				if (this.field1211[var20] != var21) {
					this.field1211[var20] = var21;
					this.method475(var20);
					this.field1200 = true;
					if (this.field1289 != -1) {
						this.field1528 = true;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 28) {
				this.field1200 = true;
				int var22 = this.field1319.method241();
				Component var23 = Component.field70[var22];
				int var24 = this.field1319.method239();
				for (int var25 = 0; var25 < var24; var25++) {
					var23.field71[var25] = this.field1319.method241();
					int var26 = this.field1319.method239();
					if (var26 == 255) {
						var26 = this.field1319.method244();
					}
					var23.field72[var25] = var26;
				}
				for (int var27 = var24; var27 < var23.field71.length; var27++) {
					var23.field71[var27] = 0;
					var23.field72[var27] = 0;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 136) {
				this.field1200 = true;
				int var28 = this.field1319.method239();
				int var29 = this.field1319.method244();
				int var30 = this.field1319.method239();
				this.field1575[var28] = var29;
				this.field1419[var28] = var30;
				this.field1467[var28] = 1;
				for (int var31 = 0; var31 < 98; var31++) {
					if (var29 >= field1474[var31]) {
						this.field1467[var28] = var31 + 2;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 187) {
				int var32 = this.field1319.method241();
				this.method521(var32);
				if (this.field1558 != -1) {
					this.field1558 = -1;
					this.field1528 = true;
				}
				if (this.field1621) {
					this.field1621 = false;
					this.field1528 = true;
				}
				this.field1594 = var32;
				this.field1200 = true;
				this.field1352 = true;
				this.field1523 = -1;
				this.field1420 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 249) {
				int var33 = this.field1319.method241();
				int var34 = this.field1319.method241();
				if (this.field1558 != -1) {
					this.field1558 = -1;
					this.field1528 = true;
				}
				if (this.field1621) {
					this.field1621 = false;
					this.field1528 = true;
				}
				this.field1523 = var33;
				this.field1594 = var34;
				this.field1200 = true;
				this.field1352 = true;
				this.field1420 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 5) {
				this.field1611 = false;
				this.field1621 = true;
				this.field1584 = "";
				this.field1528 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 239) {
				int var35 = this.field1319.method242();
				this.field1289 = var35;
				this.field1528 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 38) {
				int var36 = this.field1319.method241();
				int var37 = this.field1319.method241();
				int var38 = var37 >> 10 & 0x1F;
				int var39 = var37 >> 5 & 0x1F;
				int var40 = var37 & 0x1F;
				Component.field70[var36].field113 = (var38 << 19) + (var39 << 11) + (var40 << 3);
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 64) {
				this.field1458 = this.field1319.method239();
				if (this.field1458 == 1) {
					this.field1234 = this.field1319.method241();
				}
				if (this.field1458 >= 2 && this.field1458 <= 6) {
					if (this.field1458 == 2) {
						this.field1478 = 64;
						this.field1479 = 64;
					}
					if (this.field1458 == 3) {
						this.field1478 = 0;
						this.field1479 = 64;
					}
					if (this.field1458 == 4) {
						this.field1478 = 128;
						this.field1479 = 64;
					}
					if (this.field1458 == 5) {
						this.field1478 = 64;
						this.field1479 = 0;
					}
					if (this.field1458 == 6) {
						this.field1478 = 64;
						this.field1479 = 128;
					}
					this.field1458 = 2;
					this.field1475 = this.field1319.method241();
					this.field1476 = this.field1319.method241();
					this.field1477 = this.field1319.method239();
				}
				if (this.field1458 == 10) {
					this.field1437 = this.field1319.method241();
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 159) {
				this.field1603 = this.field1319.method239();
				this.field1604 = this.field1319.method239();
				for (int var41 = this.field1603; var41 < this.field1603 + 8; var41++) {
					for (int var42 = this.field1604; var42 < this.field1604 + 8; var42++) {
						if (this.field1406[this.field1277][var41][var42] != null) {
							this.field1406[this.field1277][var41][var42] = null;
							this.method529(var41, var42);
						}
					}
				}
				for (LocChange var43 = (LocChange) this.field1636.method258(); var43 != null; var43 = (LocChange) this.field1636.method260()) {
					if (var43.field731 >= this.field1603 && var43.field731 < this.field1603 + 8 && var43.field732 >= this.field1604 && var43.field732 < this.field1604 + 8 && var43.field729 == this.field1277) {
						var43.field740 = 0;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 161) {
				int var44 = this.field1319.method241();
				Component.field70[var44].field119 = 3;
				Component.field70[var44].field120 = (field1231.field473[0] << 24) + (field1231.field473[4] << 18) + (field1231.field472[0] << 12) + (field1231.field472[8] << 6) + field1231.field472[11];
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 225) {
				int var45 = this.field1319.method239();
				int var46 = this.field1319.method239();
				int var47 = this.field1319.method239();
				int var48 = this.field1319.method239();
				this.field1649[var45] = true;
				this.field1261[var45] = var46;
				this.field1520[var45] = var47;
				this.field1311[var45] = var48;
				this.field1412[var45] = 0;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 213) {
				this.field1542 = this.field1319.method241();
				this.field1492 = this.field1319.method239();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 170) {
				this.field1200 = true;
				int var49 = this.field1319.method241();
				Component var50 = Component.field70[var49];
				while (this.field1319.field711 < this.field1428) {
					int var51 = this.field1319.method239();
					int var52 = this.field1319.method241();
					int var53 = this.field1319.method239();
					if (var53 == 255) {
						var53 = this.field1319.method244();
					}
					if (var51 >= 0 && var51 < var50.field71.length) {
						var50.field71[var51] = var52;
						var50.field72[var51] = var53;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 138) {
				this.field1248 = this.field1319.method239();
				this.field1200 = true;
				this.field1352 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 255) {
				this.field1610 = this.field1319.method239();
				this.field1200 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 61) {
				this.field1603 = this.field1319.method239();
				this.field1604 = this.field1319.method239();
				while (this.field1319.field711 < this.field1428) {
					int var54 = this.field1319.method239();
					this.method501(var54, this.field1319, this.field1516);
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 75) {
				this.field1350 = this.field1319.method239();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 55) {
				this.field1362 = true;
				this.field1306 = this.field1319.method239();
				this.field1307 = this.field1319.method239();
				this.field1308 = this.field1319.method241();
				this.field1309 = this.field1319.method239();
				this.field1310 = this.field1319.method239();
				if (this.field1310 >= 100) {
					this.field1266 = this.field1306 * 128 + 64;
					this.field1268 = this.field1307 * 128 + 64;
					this.field1267 = this.method470(this.field1268, this.field1277, this.field1266) - this.field1308;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 173) {
				this.field1603 = this.field1319.method239();
				this.field1604 = this.field1319.method239();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 29) {
				Packet var55 = InputTracking.method47();
				if (var55 != null) {
					this.field1543.method228(142);
					this.field1543.method230(var55.field711);
					this.field1543.method237(0, var55.field710, var55.field711);
					var55.method227();
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 0) {
				this.field1362 = true;
				this.field1577 = this.field1319.method239();
				this.field1578 = this.field1319.method239();
				this.field1579 = this.field1319.method241();
				this.field1580 = this.field1319.method239();
				this.field1581 = this.field1319.method239();
				if (this.field1581 >= 100) {
					int var56 = this.field1577 * 128 + 64;
					int var57 = this.field1578 * 128 + 64;
					int var58 = this.method470(var57, this.field1277, var56) - this.field1579;
					int var59 = var56 - this.field1266;
					int var60 = var58 - this.field1267;
					int var61 = var57 - this.field1268;
					int var62 = (int) Math.sqrt((double) (var59 * var59 + var61 * var61));
					this.field1269 = (int) (Math.atan2((double) var60, (double) var62) * 325.949D) & 0x7FF;
					this.field1270 = (int) (Math.atan2((double) var59, (double) var61) * -325.949D) & 0x7FF;
					if (this.field1269 < 128) {
						this.field1269 = 128;
					}
					if (this.field1269 > 383) {
						this.field1269 = 383;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 95) {
				int var63 = this.field1319.method241();
				int var64 = this.field1319.method242();
				Component var65 = Component.field70[var63];
				var65.field123 = var64;
				if (var64 == -1) {
					var65.field73 = 0;
					var65.field74 = 0;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 94) {
				if (this.field1248 == 12) {
					this.field1200 = true;
				}
				this.field1326 = this.field1319.method239();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 58) {
				this.field1632 = this.field1319.method239();
				if (this.field1632 == this.field1248) {
					if (this.field1632 == 3) {
						this.field1248 = 1;
					} else {
						this.field1248 = 3;
					}
					this.field1200 = true;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 60) {
				long var66 = this.field1319.method245();
				int var68 = this.field1319.method244();
				int var69 = this.field1319.method239();
				boolean var70 = false;
				for (int var71 = 0; var71 < 100; var71++) {
					if (this.field1250[var71] == var68) {
						var70 = true;
						break;
					}
				}
				if (var69 <= 1) {
					for (int var72 = 0; var72 < this.field1646; var72++) {
						if (this.field1515[var72] == var66) {
							var70 = true;
							break;
						}
					}
				}
				if (!var70 && this.field1450 == 0) {
					try {
						this.field1250[this.field1601] = var68;
						this.field1601 = (this.field1601 + 1) % 100;
						String var73 = WordPack.method317(this.field1319, this.field1428 - 13);
						String var74 = WordFilter.method403(var73);
						if (var69 == 2 || var69 == 3) {
							this.method515("@cr2@" + JString.method314(JString.method311(var66)), 7, var74);
						} else if (var69 == 1) {
							this.method515("@cr1@" + JString.method314(JString.method311(var66)), 7, var74);
						} else {
							this.method515(JString.method314(JString.method311(var66)), 3, var74);
						}
					} catch (Exception var159) {
						signlink.reporterror("cde1");
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 143) {
				this.field1452 = this.field1319.method241() * 30;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 14) {
				int var76 = this.field1319.method241();
				int var77 = this.field1319.method241();
				Component var78 = Component.field70[var76];
				if (var78 != null && var78.field77 == 0) {
					if (var77 < 0) {
						var77 = 0;
					}
					if (var77 > var78.field89 - var78.field81) {
						var77 = var78.field89 - var78.field81;
					}
					var78.field90 = var77;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 3) {
				int var79 = this.field1319.method241();
				int var80 = this.field1319.method241();
				Component.field70[var79].field119 = 2;
				Component.field70[var79].field120 = var80;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 164) {
				if (this.field1248 == 12) {
					this.field1200 = true;
				}
				this.field1404 = this.field1319.method242();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 168) {
				int var81 = this.field1319.method241();
				Component var82 = Component.field70[var81];
				for (int var83 = 0; var83 < var82.field71.length; var83++) {
					var82.field71[var83] = -1;
					var82.field71[var83] = 0;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 123) {
				this.method503(this.field1319, this.field1428);
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 211) {
				int var84 = this.field1319.method241();
				int var85 = this.field1319.method241();
				Component.field70[var84].field119 = 1;
				Component.field70[var84].field120 = var85;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 140) {
				for (int var86 = 0; var86 < this.field1211.length; var86++) {
					if (this.field1211[var86] != this.field1497[var86]) {
						this.field1211[var86] = this.field1497[var86];
						this.method475(var86);
						this.field1200 = true;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 91) {
				int var87 = this.field1319.method241();
				int var88 = this.field1319.method239();
				if (var87 == 65535) {
					var87 = -1;
				}
				this.field1468[var88] = var87;
				this.field1200 = true;
				this.field1352 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 21) {
				this.method479();
				this.field1429 = -1;
				return false;
			}
			if (this.field1429 == 163) {
				int var89 = this.field1319.method241();
				if (var89 == 65535) {
					var89 = -1;
				}
				if (var89 != this.field1598 && this.field1315 && !field1242 && this.field1569 == 0) {
					this.field1616 = var89;
					this.field1617 = true;
					this.field1415.method289(2, this.field1616);
				}
				this.field1598 = var89;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 242) {
				int var90 = this.field1319.method241();
				int var91 = this.field1319.method241();
				if (this.field1315 && !field1242) {
					this.field1616 = var90;
					this.field1617 = false;
					this.field1415.method289(2, this.field1616);
					this.field1569 = var91;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 174) {
				if (this.field1594 != -1) {
					this.field1594 = -1;
					this.field1200 = true;
					this.field1352 = true;
				}
				if (this.field1558 != -1) {
					this.field1558 = -1;
					this.field1528 = true;
				}
				if (this.field1621) {
					this.field1621 = false;
					this.field1528 = true;
				}
				this.field1523 = -1;
				this.field1420 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 111) {
				long var92 = this.field1319.method245();
				int var94 = this.field1319.method239();
				String var95 = JString.method314(JString.method311(var92));
				for (int var96 = 0; var96 < this.field1609; var96++) {
					if (var92 == this.field1521[var96]) {
						if (this.field1553[var96] != var94) {
							this.field1553[var96] = var94;
							this.field1200 = true;
							if (var94 > 0) {
								this.method515("", 5, var95 + " has logged in.");
							}
							if (var94 == 0) {
								this.method515("", 5, var95 + " has logged out.");
							}
						}
						var95 = null;
						break;
					}
				}
				if (var95 != null && this.field1609 < 200) {
					this.field1521[this.field1609] = var92;
					this.field1257[this.field1609] = var95;
					this.field1553[this.field1609] = var94;
					this.field1609++;
					this.field1200 = true;
				}
				boolean var97 = false;
				while (!var97) {
					var97 = true;
					for (int var98 = 0; var98 < this.field1609 - 1; var98++) {
						if (this.field1553[var98] != field1239 && this.field1553[var98 + 1] == field1239 || this.field1553[var98] == 0 && this.field1553[var98 + 1] != 0) {
							int var99 = this.field1553[var98];
							this.field1553[var98] = this.field1553[var98 + 1];
							this.field1553[var98 + 1] = var99;
							String var100 = this.field1257[var98];
							this.field1257[var98] = this.field1257[var98 + 1];
							this.field1257[var98 + 1] = var100;
							long var101 = this.field1521[var98];
							this.field1521[var98] = this.field1521[var98 + 1];
							this.field1521[var98 + 1] = var101;
							this.field1200 = true;
							var97 = false;
						}
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 85) {
				int var103 = this.field1319.method242();
				if (var103 >= 0) {
					this.method521(var103);
				}
				this.field1574 = var103;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 87) {
				this.method549(this.field1319, this.field1428);
				this.field1398 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 203) {
				for (int var104 = 0; var104 < this.field1378.length; var104++) {
					if (this.field1378[var104] != null) {
						this.field1378[var104].field438 = -1;
					}
				}
				for (int var105 = 0; var105 < this.field1219.length; var105++) {
					if (this.field1219[var105] != null) {
						this.field1219[var105].field438 = -1;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 227) {
				int var106 = this.field1319.method241();
				boolean var107 = this.field1319.method239() == 1;
				Component.field70[var106].field91 = var107;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 25) {
				int var108 = this.field1319.method241();
				int var109 = this.field1319.method239();
				int var110 = this.field1319.method241();
				if (this.field1351 && !field1242 && this.field1322 < 50) {
					this.field1192[this.field1322] = var108;
					this.field1340[this.field1322] = var109;
					this.field1305[this.field1322] = var110 + Wave.field894[var108];
					this.field1322++;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 73) {
				String var111 = this.field1319.method246();
				if (var111.endsWith(":tradereq:")) {
					String var112 = var111.substring(0, var111.indexOf(":"));
					long var113 = JString.method310(var112);
					boolean var115 = false;
					for (int var116 = 0; var116 < this.field1646; var116++) {
						if (this.field1515[var116] == var113) {
							var115 = true;
							break;
						}
					}
					if (!var115 && this.field1450 == 0) {
						this.method515(var112, 4, "wishes to trade with you.");
					}
				} else if (var111.endsWith(":duelreq:")) {
					String var117 = var111.substring(0, var111.indexOf(":"));
					long var118 = JString.method310(var117);
					boolean var120 = false;
					for (int var121 = 0; var121 < this.field1646; var121++) {
						if (this.field1515[var121] == var118) {
							var120 = true;
							break;
						}
					}
					if (!var120 && this.field1450 == 0) {
						this.method515(var117, 8, "wishes to duel with you.");
					}
				} else {
					this.method515("", 0, var111);
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 41) {
				int var122 = this.field1319.method241();
				String var123 = this.field1319.method246();
				Component.field70[var122].field111 = var123;
				if (Component.field70[var122].field76 == this.field1468[this.field1248]) {
					this.field1200 = true;
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 24) {
				this.field1583 = this.field1319.method239();
				this.field1625 = this.field1319.method239();
				this.field1554 = this.field1319.method239();
				this.field1243 = true;
				this.field1528 = true;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 108) {
				this.field1301 = 0;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 209) {
				int var124 = this.field1319.method241();
				int var125 = this.field1319.method241();
				if (this.field1480 == var124 && this.field1481 == var125 && this.field1317 == 2) {
					this.field1429 = -1;
					return true;
				}
				this.field1480 = var124;
				this.field1481 = var125;
				this.field1487 = (this.field1480 - 6) * 8;
				this.field1488 = (this.field1481 - 6) * 8;
				this.field1275 = false;
				if ((this.field1480 / 8 == 48 || this.field1480 / 8 == 49) && this.field1481 / 8 == 48) {
					this.field1275 = true;
				}
				if (this.field1480 / 8 == 48 && this.field1481 / 8 == 148) {
					this.field1275 = true;
				}
				this.field1317 = 1;
				this.field1527 = System.currentTimeMillis();
				this.field1484.method268();
				this.field1345.method214(151, "Loading - please wait.", 257, 0);
				this.field1345.method214(150, "Loading - please wait.", 256, 16777215);
				this.field1484.method269(4, 4, super.field15);
				int var126 = 0;
				for (int var127 = (this.field1480 - 6) / 8; var127 <= (this.field1480 + 6) / 8; var127++) {
					for (int var128 = (this.field1481 - 6) / 8; var128 <= (this.field1481 + 6) / 8; var128++) {
						var126++;
					}
				}
				this.field1472 = new byte[var126][];
				this.field1436 = new byte[var126][];
				this.field1504 = new int[var126];
				this.field1505 = new int[var126];
				this.field1506 = new int[var126];
				int var129 = 0;
				for (int var130 = (this.field1480 - 6) / 8; var130 <= (this.field1480 + 6) / 8; var130++) {
					for (int var131 = (this.field1481 - 6) / 8; var131 <= (this.field1481 + 6) / 8; var131++) {
						this.field1504[var129] = (var130 << 8) + var131;
						if (this.field1275 && (var131 == 49 || var131 == 149 || var131 == 147 || var130 == 50 || var130 == 49 && var131 == 47)) {
							this.field1505[var129] = -1;
							this.field1506[var129] = -1;
							var129++;
						} else {
							int var132 = this.field1505[var129] = this.field1415.method284(var130, var131, 0);
							if (var132 != -1) {
								this.field1415.method289(3, var132);
							}
							int var133 = this.field1506[var129] = this.field1415.method284(var130, var131, 1);
							if (var133 != -1) {
								this.field1415.method289(3, var133);
							}
							var129++;
						}
					}
				}
				int var134 = this.field1487 - this.field1489;
				int var135 = this.field1488 - this.field1490;
				this.field1489 = this.field1487;
				this.field1490 = this.field1488;
				for (int var136 = 0; var136 < 16384; var136++) {
					ClientNpc var137 = this.field1219[var136];
					if (var137 != null) {
						for (int var138 = 0; var138 < 10; var138++) {
							var137.field460[var138] -= var134;
							var137.field461[var138] -= var135;
						}
						var137.field410 -= var134 * 128;
						var137.field411 -= var135 * 128;
					}
				}
				for (int var139 = 0; var139 < this.field1376; var139++) {
					ClientPlayer var140 = this.field1378[var139];
					if (var140 != null) {
						for (int var141 = 0; var141 < 10; var141++) {
							var140.field460[var141] -= var134;
							var140.field461[var141] -= var135;
						}
						var140.field410 -= var134 * 128;
						var140.field411 -= var135 * 128;
					}
				}
				this.field1398 = true;
				byte var142 = 0;
				byte var143 = 104;
				byte var144 = 1;
				if (var134 < 0) {
					var142 = 103;
					var143 = -1;
					var144 = -1;
				}
				byte var145 = 0;
				byte var146 = 104;
				byte var147 = 1;
				if (var135 < 0) {
					var145 = 103;
					var146 = -1;
					var147 = -1;
				}
				for (int var148 = var142; var148 != var143; var148 += var144) {
					for (int var149 = var145; var149 != var146; var149 += var147) {
						int var150 = var148 + var134;
						int var151 = var149 + var135;
						for (int var152 = 0; var152 < 4; var152++) {
							if (var150 >= 0 && var151 >= 0 && var150 < 104 && var151 < 104) {
								this.field1406[var152][var148][var149] = this.field1406[var152][var150][var151];
							} else {
								this.field1406[var152][var148][var149] = null;
							}
						}
					}
				}
				for (LocChange var153 = (LocChange) this.field1636.method258(); var153 != null; var153 = (LocChange) this.field1636.method260()) {
					var153.field731 -= var134;
					var153.field732 -= var135;
					if (var153.field731 < 0 || var153.field732 < 0 || var153.field731 >= 104 || var153.field732 >= 104) {
						var153.method120();
					}
				}
				if (this.field1301 != 0) {
					this.field1301 -= var134;
					this.field1302 -= var135;
				}
				this.field1362 = false;
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 251) {
				InputTracking.method44();
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 186) {
				int var154 = this.field1319.method241();
				byte var155 = this.field1319.method240();
				this.field1497[var154] = var155;
				if (this.field1211[var154] != var155) {
					this.field1211[var154] = var155;
					this.method475(var154);
					this.field1200 = true;
					if (this.field1289 != -1) {
						this.field1528 = true;
					}
				}
				this.field1429 = -1;
				return true;
			}
			if (this.field1429 == 98 || this.field1429 == 218 || this.field1429 == 8 || this.field1429 == 114 || this.field1429 == 37 || this.field1429 == 115 || this.field1429 == 120 || this.field1429 == 30 || this.field1429 == 88 || this.field1429 == 70) {
				this.method501(this.field1429, this.field1319, this.field1516);
				this.field1429 = -1;
				return true;
			}
			signlink.reporterror("T1 - " + this.field1429 + "," + this.field1428 + " - " + this.field1540 + "," + this.field1541);
			this.method479();
		} catch (IOException var160) {
			this.method561();
		} catch (Exception var161) {
			String var157 = "T2 - " + this.field1429 + "," + this.field1540 + "," + this.field1541 + " - " + this.field1428 + "," + (this.field1487 + field1231.field460[0]) + "," + (this.field1488 + field1231.field461[0]) + " - ";
			for (int var158 = 0; var158 < this.field1428 && var158 < 50; var158++) {
				var157 = var157 + this.field1319.field710[var158] + ",";
			}
			signlink.reporterror(var157);
			this.method479();
		}
		return true;
	}

	@ObfuscatedName("client.l(I)V")
	public final void method457() {
		LocType.field968.method117();
		LocType.field969.method117();
		NpcType.field1010.method117();
		ObjType.field1061.method117();
		ObjType.field1062.method117();
		ClientPlayer.field490.method117();
		SpotAnimType.field1144.method117();
	}

	@ObfuscatedName("client.a(ZLd;)Z")
	public final boolean method458(Component arg1) {
		if (arg1.field86 == null) {
			return false;
		}
		for (int var3 = 0; var3 < arg1.field86.length; var3++) {
			int var4 = this.method546(var3, arg1);
			int var5 = arg1.field87[var3];
			if (arg1.field86[var3] == 2) {
				if (var4 >= var5) {
					return false;
				}
			} else if (arg1.field86[var3] == 3) {
				if (var4 <= var5) {
					return false;
				}
			} else if (arg1.field86[var3] == 4) {
				if (var4 == var5) {
					return false;
				}
			} else if (var4 != var5) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public final void method459(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.field1417 = "";
				this.field1418 = "Connecting to server...";
				this.method437(true);
			}
			this.field1607 = new ClientStream(this, this.method444(field1240 + 43594));
			long var4 = JString.method310(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.field1543.field711 = 0;
			this.field1543.method229(14);
			this.field1543.method229(var6);
			this.field1607.method42(this.field1543.field710, 0, 2);
			for (int var7 = 0; var7 < 8; var7++) {
				this.field1607.method39();
			}
			int var8 = this.field1607.method39();
			if (var8 == 0) {
				this.field1607.method41(this.field1319.field710, 0, 8);
				this.field1319.field711 = 0;
				this.field1517 = this.field1319.method245();
				int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1517 >> 32), (int) this.field1517 };
				this.field1543.field711 = 0;
				this.field1543.method229(10);
				this.field1543.method233(var9[0]);
				this.field1543.method233(var9[1]);
				this.field1543.method233(var9[2]);
				this.field1543.method233(var9[3]);
				this.field1543.method233(signlink.uid);
				this.field1543.method236(arg0);
				this.field1543.method236(arg1);
				this.field1543.method254(field1507, field1434);
				this.field1260.field711 = 0;
				if (arg2) {
					this.field1260.method229(18);
				} else {
					this.field1260.method229(16);
				}
				this.field1260.method229(this.field1543.field711 + 36 + 1 + 1);
				this.field1260.method229(254);
				this.field1260.method229(field1242 ? 1 : 0);
				for (int var10 = 0; var10 < 9; var10++) {
					this.field1260.method233(this.field1637[var10]);
				}
				this.field1260.method237(0, this.field1543.field710, this.field1543.field711);
				this.field1543.random = new Isaac(var9);
				for (int var11 = 0; var11 < 4; var11++) {
					var9[var11] += 50;
				}
				this.field1461 = new Isaac(var9);
				this.field1607.method42(this.field1260.field710, 0, this.field1260.field711);
				var8 = this.field1607.method39();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var21) {
				}
				this.method459(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.field1510 = this.field1607.method39();
				field1397 = this.field1607.method39() == 1;
				InputTracking.method45();
				this.field1370 = 0L;
				this.field1589 = 0;
				this.field1644.field974 = 0;
				super.field20 = true;
				this.field1612 = true;
				this.field1238 = true;
				this.field1543.field711 = 0;
				this.field1319.field711 = 0;
				this.field1429 = -1;
				this.field1539 = -1;
				this.field1540 = -1;
				this.field1541 = -1;
				this.field1428 = 0;
				this.field1430 = 0;
				this.field1452 = 0;
				this.field1432 = 0;
				this.field1458 = 0;
				this.field1314 = 0;
				this.field1384 = false;
				super.field21 = 0;
				for (int var12 = 0; var12 < 100; var12++) {
					this.field1247[var12] = null;
				}
				this.field1195 = 0;
				this.field1387 = 0;
				this.field1317 = 0;
				this.field1322 = 0;
				this.field1556 = (int) (Math.random() * 100.0D) - 50;
				this.field1272 = (int) (Math.random() * 110.0D) - 55;
				this.field1445 = (int) (Math.random() * 80.0D) - 40;
				this.field1278 = (int) (Math.random() * 120.0D) - 60;
				this.field1348 = (int) (Math.random() * 30.0D) - 20;
				this.field1253 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.field1638 = -1;
				this.field1301 = 0;
				this.field1302 = 0;
				this.field1379 = 0;
				this.field1220 = 0;
				for (int var13 = 0; var13 < this.field1376; var13++) {
					this.field1378[var13] = null;
					this.field1383[var13] = null;
				}
				for (int var14 = 0; var14 < 16384; var14++) {
					this.field1219[var14] = null;
				}
				field1231 = this.field1378[this.field1377] = new ClientPlayer();
				this.field1451.method262();
				this.field1423.method262();
				for (int var15 = 0; var15 < 4; var15++) {
					for (int var16 = 0; var16 < 104; var16++) {
						for (int var17 = 0; var17 < 104; var17++) {
							this.field1406[var15][var16][var17] = null;
						}
					}
				}
				this.field1636 = new LinkList();
				this.field1610 = 0;
				this.field1609 = 0;
				this.field1289 = -1;
				this.field1558 = -1;
				this.field1523 = -1;
				this.field1594 = -1;
				this.field1574 = -1;
				this.field1420 = false;
				this.field1248 = 3;
				this.field1621 = false;
				this.field1384 = false;
				this.field1611 = false;
				this.field1635 = null;
				this.field1350 = 0;
				this.field1632 = -1;
				this.field1494 = true;
				this.method452();
				for (int var18 = 0; var18 < 5; var18++) {
					this.field1514[var18] = 0;
				}
				for (int var19 = 0; var19 < 5; var19++) {
					this.field1605[var19] = null;
					this.field1606[var19] = false;
				}
				field1408 = 0;
				field1284 = 0;
				field1496 = 0;
				field1647 = 0;
				field1338 = 0;
				field1409 = 0;
				field1235 = 0;
				field1597 = 0;
				field1618 = 0;
				field1256 = 0;
				this.method451();
			} else if (var8 == 3) {
				this.field1417 = "";
				this.field1418 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.field1417 = "Your account has been disabled.";
				this.field1418 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.field1417 = "Your account is already logged in.";
				this.field1418 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.field1417 = "RuneScape has been updated!";
				this.field1418 = "Please reload this page.";
			} else if (var8 == 7) {
				this.field1417 = "This world is full.";
				this.field1418 = "Please use a different world.";
			} else if (var8 == 8) {
				this.field1417 = "Unable to connect.";
				this.field1418 = "Login server offline.";
			} else if (var8 == 9) {
				this.field1417 = "Login limit exceeded.";
				this.field1418 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.field1417 = "Unable to connect.";
				this.field1418 = "Bad session id.";
			} else if (var8 == 11) {
				this.field1418 = "Login server rejected session.";
				this.field1418 = "Please try again.";
			} else if (var8 == 12) {
				this.field1417 = "You need a members account to login to this world.";
				this.field1418 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.field1417 = "Could not complete login.";
				this.field1418 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.field1417 = "The server is being updated.";
				this.field1418 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.field1238 = true;
				this.field1543.field711 = 0;
				this.field1319.field711 = 0;
				this.field1429 = -1;
				this.field1539 = -1;
				this.field1540 = -1;
				this.field1541 = -1;
				this.field1428 = 0;
				this.field1430 = 0;
				this.field1452 = 0;
				this.field1314 = 0;
				this.field1384 = false;
				this.field1527 = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.field1417 = "Login attempts exceeded.";
				this.field1418 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.field1417 = "You are standing in a members-only area.";
				this.field1418 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.field1417 = "Invalid loginserver requested";
				this.field1418 = "Please try using a different world.";
			} else if (var8 == 21) {
				for (int var20 = this.field1607.method39(); var20 >= 0; var20--) {
					this.field1417 = "You have only just left another world";
					this.field1418 = "Your profile will be transfered in: " + var20 + " seconds";
					this.method437(true);
					try {
						Thread.sleep(1000L);
					} catch (Exception var22) {
					}
				}
				this.method459(arg0, arg1, arg2);
			} else if (var8 == -1) {
				this.field1417 = "No response from server";
				this.field1418 = "Please try using a different world.";
			} else {
				System.out.println("response:" + var8);
				this.field1417 = "Unexpected server response";
				this.field1418 = "Please try using a different world.";
			}
		} catch (IOException var23) {
			this.field1417 = "";
			this.field1418 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.a(IIILd;III)V")
	public final void method460(int arg0, int arg1, Component arg3, int arg4, int arg5, int arg6) {
		if (arg3.field77 != 0 || arg3.field92 == null || arg3.field91 || (arg5 < arg4 || arg0 < arg1 || arg5 > arg4 + arg3.field80 || arg0 > arg1 + arg3.field81)) {
			return;
		}
		int var8 = arg3.field92.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg3.field93[var9] + arg4;
			int var11 = arg3.field94[var9] + arg1 - arg6;
			Component var12 = Component.field70[arg3.field92[var9]];
			int var13 = var10 + var12.field83;
			int var14 = var11 + var12.field84;
			if ((var12.field88 >= 0 || var12.field115 != 0) && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
				if (var12.field88 >= 0) {
					this.field1456 = var12.field88;
				} else {
					this.field1456 = var12.field75;
				}
			}
			if (var12.field77 == 0) {
				this.method460(arg0, var14, var12, var13, arg5, var12.field90);
				if (var12.field89 > var12.field81) {
					this.method469(var13 + var12.field80, var12.field89, true, arg5, var12, arg0, var12.field81, var14);
				}
			} else {
				if (var12.field78 == 1 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					boolean var15 = false;
					if (var12.field79 != 0) {
						var15 = this.method530(var12);
					}
					if (!var15) {
						this.field1292[this.field1314] = var12.field131;
						this.field1205[this.field1314] = 231;
						this.field1204[this.field1314] = var12.field75;
						this.field1314++;
					}
				}
				if (var12.field78 == 2 && this.field1387 == 0 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					String var16 = var12.field128;
					if (var16.indexOf(" ") != -1) {
						var16 = var16.substring(0, var16.indexOf(" "));
					}
					this.field1292[this.field1314] = var16 + " @gre@" + var12.field129;
					this.field1205[this.field1314] = 274;
					this.field1204[this.field1314] = var12.field75;
					this.field1314++;
				}
				if (var12.field78 == 3 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					this.field1292[this.field1314] = "Close";
					this.field1205[this.field1314] = 737;
					this.field1204[this.field1314] = var12.field75;
					this.field1314++;
				}
				if (var12.field78 == 4 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					this.field1292[this.field1314] = var12.field131;
					this.field1205[this.field1314] = 435;
					this.field1204[this.field1314] = var12.field75;
					this.field1314++;
				}
				if (var12.field78 == 5 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					this.field1292[this.field1314] = var12.field131;
					this.field1205[this.field1314] = 225;
					this.field1204[this.field1314] = var12.field75;
					this.field1314++;
				}
				if (var12.field78 == 6 && !this.field1420 && arg5 >= var13 && arg0 >= var14 && arg5 < var13 + var12.field80 && arg0 < var14 + var12.field81) {
					this.field1292[this.field1314] = var12.field131;
					this.field1205[this.field1314] = 997;
					this.field1204[this.field1314] = var12.field75;
					this.field1314++;
				}
				if (var12.field77 == 2) {
					int var17 = 0;
					for (int var18 = 0; var18 < var12.field81; var18++) {
						for (int var19 = 0; var19 < var12.field80; var19++) {
							int var20 = var13 + var19 * (var12.field101 + 32);
							int var21 = var14 + var18 * (var12.field102 + 32);
							if (var17 < 20) {
								var20 += var12.field104[var17];
								var21 += var12.field105[var17];
							}
							if (arg5 >= var20 && arg0 >= var21 && arg5 < var20 + 32 && arg0 < var21 + 32) {
								this.field1524 = var17;
								this.field1525 = var12.field75;
								if (var12.field71[var17] > 0) {
									ObjType var22 = ObjType.method350(var12.field71[var17] - 1);
									if (this.field1195 == 1 && var12.field98) {
										if (var12.field75 != this.field1197 || var17 != this.field1196) {
											this.field1292[this.field1314] = "Use " + this.field1199 + " with @lre@" + var22.field1024;
											this.field1205[this.field1314] = 398;
											this.field1206[this.field1314] = var22.field1022;
											this.field1203[this.field1314] = var17;
											this.field1204[this.field1314] = var12.field75;
											this.field1314++;
										}
									} else if (this.field1387 != 1 || !var12.field98) {
										if (var12.field98) {
											for (int var23 = 4; var23 >= 3; var23--) {
												if (var22.field1039 != null && var22.field1039[var23] != null) {
													this.field1292[this.field1314] = var22.field1039[var23] + " @lre@" + var22.field1024;
													if (var23 == 3) {
														this.field1205[this.field1314] = 681;
													}
													if (var23 == 4) {
														this.field1205[this.field1314] = 100;
													}
													this.field1206[this.field1314] = var22.field1022;
													this.field1203[this.field1314] = var17;
													this.field1204[this.field1314] = var12.field75;
													this.field1314++;
												} else if (var23 == 4) {
													this.field1292[this.field1314] = "Drop @lre@" + var22.field1024;
													this.field1205[this.field1314] = 100;
													this.field1206[this.field1314] = var22.field1022;
													this.field1203[this.field1314] = var17;
													this.field1204[this.field1314] = var12.field75;
													this.field1314++;
												}
											}
										}
										if (var12.field99) {
											this.field1292[this.field1314] = "Use @lre@" + var22.field1024;
											this.field1205[this.field1314] = 102;
											this.field1206[this.field1314] = var22.field1022;
											this.field1203[this.field1314] = var17;
											this.field1204[this.field1314] = var12.field75;
											this.field1314++;
										}
										if (var12.field98 && var22.field1039 != null) {
											for (int var24 = 2; var24 >= 0; var24--) {
												if (var22.field1039[var24] != null) {
													this.field1292[this.field1314] = var22.field1039[var24] + " @lre@" + var22.field1024;
													if (var24 == 0) {
														this.field1205[this.field1314] = 694;
													}
													if (var24 == 1) {
														this.field1205[this.field1314] = 962;
													}
													if (var24 == 2) {
														this.field1205[this.field1314] = 795;
													}
													this.field1206[this.field1314] = var22.field1022;
													this.field1203[this.field1314] = var17;
													this.field1204[this.field1314] = var12.field75;
													this.field1314++;
												}
											}
										}
										if (var12.field106 != null) {
											for (int var25 = 4; var25 >= 0; var25--) {
												if (var12.field106[var25] != null) {
													this.field1292[this.field1314] = var12.field106[var25] + " @lre@" + var22.field1024;
													if (var25 == 0) {
														this.field1205[this.field1314] = 582;
													}
													if (var25 == 1) {
														this.field1205[this.field1314] = 113;
													}
													if (var25 == 2) {
														this.field1205[this.field1314] = 555;
													}
													if (var25 == 3) {
														this.field1205[this.field1314] = 331;
													}
													if (var25 == 4) {
														this.field1205[this.field1314] = 354;
													}
													this.field1206[this.field1314] = var22.field1022;
													this.field1203[this.field1314] = var17;
													this.field1204[this.field1314] = var12.field75;
													this.field1314++;
												}
											}
										}
										this.field1292[this.field1314] = "Examine @lre@" + var22.field1024;
										this.field1205[this.field1314] = 1328;
										this.field1206[this.field1314] = var22.field1022;
										this.field1203[this.field1314] = var17;
										this.field1204[this.field1314] = var12.field75;
										this.field1314++;
									} else if ((this.field1389 & 0x10) == 16) {
										this.field1292[this.field1314] = this.field1390 + " @lre@" + var22.field1024;
										this.field1205[this.field1314] = 563;
										this.field1206[this.field1314] = var22.field1022;
										this.field1203[this.field1314] = var17;
										this.field1204[this.field1314] = var12.field75;
										this.field1314++;
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

	@ObfuscatedName("client.e(B)V")
	public final void method461() {
		for (int var2 = -1; var2 < this.field1379; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = this.field1377;
			} else {
				var3 = this.field1380[var2];
			}
			ClientPlayer var4 = this.field1378[var3];
			if (var4 != null && var4.field423 > 0) {
				var4.field423--;
				if (var4.field423 == 0) {
					var4.field422 = null;
				}
			}
		}
		for (int var5 = 0; var5 < this.field1220; var5++) {
			int var6 = this.field1221[var5];
			ClientNpc var7 = this.field1219[var6];
			if (var7 != null && var7.field423 > 0) {
				var7.field423--;
				if (var7.field423 == 0) {
					var7.field422 = null;
				}
			}
		}
	}

	@ObfuscatedName("client.m(I)V")
	public final void method462() {
		if (this.field1314 < 2 && this.field1195 == 0 && this.field1387 == 0) {
			return;
		}
		String var2;
		if (this.field1195 == 1 && this.field1314 < 2) {
			var2 = "Use " + this.field1199 + " with...";
		} else if (this.field1387 == 1 && this.field1314 < 2) {
			var2 = this.field1390 + "...";
		} else {
			var2 = this.field1292[this.field1314 - 1];
		}
		if (this.field1314 > 2) {
			var2 = var2 + "@whi@ / " + (this.field1314 - 2) + " more options";
		}
		this.field1346.method220(15, var2, 16777215, true, field1591 / 1000, 4);
	}

	@ObfuscatedName("client.a(IIIIII)V")
	public final void method463(int arg0, int arg1, int arg2, int arg4, int arg5) {
		int var7 = this.field1325.method90(arg1, arg2, arg5);
		if (var7 != 0) {
			int var8 = this.field1325.method94(arg1, arg2, arg5, var7);
			int var9 = var8 >> 6 & 0x3;
			int var10 = var8 & 0x1F;
			int var11 = arg0;
			if (var7 > 0) {
				var11 = arg4;
			}
			int[] var12 = this.field1303.field666;
			int var13 = arg2 * 4 + 24624 + (103 - arg5) * 512 * 4;
			int var14 = var7 >> 14 & 0x7FFF;
			LocType var15 = LocType.method334(var14);
			if (var15.field955 == -1) {
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
				Pix8 var16 = this.field1473[var15.field955];
				if (var16 != null) {
					int var17 = (var15.field941 * 4 - var16.field676) / 2;
					int var18 = (var15.field942 * 4 - var16.field677) / 2;
					var16.method212(arg2 * 4 + 48 + var17, (104 - arg5 - var15.field942) * 4 + 48 + var18);
				}
			}
		}
		int var19 = this.field1325.method92(arg1, arg2, arg5);
		if (var19 != 0) {
			int var20 = this.field1325.method94(arg1, arg2, arg5, var19);
			int var21 = var20 >> 6 & 0x3;
			int var22 = var20 & 0x1F;
			int var23 = var19 >> 14 & 0x7FFF;
			LocType var24 = LocType.method334(var23);
			if (var24.field955 != -1) {
				Pix8 var25 = this.field1473[var24.field955];
				if (var25 != null) {
					int var26 = (var24.field941 * 4 - var25.field676) / 2;
					int var27 = (var24.field942 * 4 - var25.field677) / 2;
					var25.method212(arg2 * 4 + 48 + var26, (104 - arg5 - var24.field942) * 4 + 48 + var27);
				}
			} else if (var22 == 9) {
				int var28 = 15658734;
				if (var19 > 0) {
					var28 = 15597568;
				}
				int[] var29 = this.field1303.field666;
				int var30 = arg2 * 4 + 24624 + (103 - arg5) * 512 * 4;
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
		int var31 = this.field1325.method93(arg1, arg2, arg5);
		if (var31 != 0) {
			int var32 = var31 >> 14 & 0x7FFF;
			LocType var33 = LocType.method334(var32);
			if (var33.field955 != -1) {
				Pix8 var34 = this.field1473[var33.field955];
				if (var34 != null) {
					int var35 = (var33.field941 * 4 - var34.field676) / 2;
					int var36 = (var33.field942 * 4 - var34.field677) / 2;
					var34.method212(arg2 * 4 + 48 + var35, (104 - arg5 - var33.field942) * 4 + 48 + var36);
				}
			}
		}
	}

	@ObfuscatedName("client.n(I)V")
	public final void method464() {
		field1339++;
		if (field1339 > 192) {
			field1339 = 0;
			this.field1543.method228(226);
			this.field1543.method229(232);
		}
		while (true) {
			int var2;
			do {
				while (true) {
					var2 = this.method5();
					if (var2 == -1) {
						return;
					}
					if (this.field1523 != -1 && this.field1523 == this.field1633) {
						if (var2 == 8 && this.field1444.length() > 0) {
							this.field1444 = this.field1444.substring(0, this.field1444.length() - 1);
						}
						break;
					}
					if (this.field1611) {
						if (var2 >= 32 && var2 <= 122 && this.field1588.length() < 80) {
							this.field1588 = this.field1588 + (char) var2;
							this.field1528 = true;
						}
						if (var2 == 8 && this.field1588.length() > 0) {
							this.field1588 = this.field1588.substring(0, this.field1588.length() - 1);
							this.field1528 = true;
						}
						if (var2 == 13 || var2 == 10) {
							this.field1611 = false;
							this.field1528 = true;
							if (this.field1619 == 1) {
								long var3 = JString.method310(this.field1588);
								this.method504(var3);
							}
							if (this.field1619 == 2 && this.field1609 > 0) {
								long var5 = JString.method310(this.field1588);
								this.method472(var5);
							}
							if (this.field1619 == 3 && this.field1588.length() > 0) {
								this.field1543.method228(214);
								this.field1543.method229(0);
								int var7 = this.field1543.field711;
								this.field1543.method235(this.field1413);
								WordPack.method318(this.field1543, this.field1588);
								this.field1543.method238(this.field1543.field711 - var7);
								this.field1588 = JString.method315(this.field1588);
								this.field1588 = WordFilter.method403(this.field1588);
								this.method515(JString.method314(JString.method311(this.field1413)), 6, this.field1588);
								if (this.field1625 == 2) {
									this.field1625 = 1;
									this.field1243 = true;
									this.field1543.method228(129);
									this.field1543.method229(this.field1583);
									this.field1543.method229(this.field1625);
									this.field1543.method229(this.field1554);
								}
							}
							if (this.field1619 == 4 && this.field1646 < 100) {
								long var8 = JString.method310(this.field1588);
								this.method484(var8);
							}
							if (this.field1619 == 5 && this.field1646 > 0) {
								long var10 = JString.method310(this.field1588);
								this.method447(var10);
							}
						}
					} else if (this.field1621) {
						if (var2 >= 48 && var2 <= 57 && this.field1584.length() < 10) {
							this.field1584 = this.field1584 + (char) var2;
							this.field1528 = true;
						}
						if (var2 == 8 && this.field1584.length() > 0) {
							this.field1584 = this.field1584.substring(0, this.field1584.length() - 1);
							this.field1528 = true;
						}
						if (var2 == 13 || var2 == 10) {
							if (this.field1584.length() > 0) {
								int var12 = 0;
								try {
									var12 = Integer.parseInt(this.field1584);
								} catch (Exception var17) {
								}
								this.field1543.method228(161);
								this.field1543.method233(var12);
							}
							this.field1621 = false;
							this.field1528 = true;
						}
					} else if (this.field1558 == -1) {
						if (var2 >= 32 && var2 <= 122 && this.field1555.length() < 80) {
							this.field1555 = this.field1555 + (char) var2;
							this.field1528 = true;
						}
						if (var2 == 8 && this.field1555.length() > 0) {
							this.field1555 = this.field1555.substring(0, this.field1555.length() - 1);
							this.field1528 = true;
						}
						if ((var2 == 13 || var2 == 10) && this.field1555.length() > 0) {
							if (this.field1510 == 2) {
								if (this.field1555.equals("::clientdrop")) {
									this.method561();
								}
								if (this.field1555.equals("::lag")) {
									this.method491();
								}
								if (this.field1555.equals("::prefetchmusic")) {
									for (int var13 = 0; var13 < this.field1415.method282(2); var13++) {
										this.field1415.method292(2, (byte) 1, var13);
									}
								}
							}
							if (this.field1555.startsWith("::")) {
								this.field1543.method228(86);
								this.field1543.method229(this.field1555.length() - 1);
								this.field1543.method236(this.field1555.substring(2));
							} else {
								byte var14 = 0;
								if (this.field1555.startsWith("yellow:")) {
									var14 = 0;
									this.field1555 = this.field1555.substring(7);
								}
								if (this.field1555.startsWith("red:")) {
									var14 = 1;
									this.field1555 = this.field1555.substring(4);
								}
								if (this.field1555.startsWith("green:")) {
									var14 = 2;
									this.field1555 = this.field1555.substring(6);
								}
								if (this.field1555.startsWith("cyan:")) {
									var14 = 3;
									this.field1555 = this.field1555.substring(5);
								}
								if (this.field1555.startsWith("purple:")) {
									var14 = 4;
									this.field1555 = this.field1555.substring(7);
								}
								if (this.field1555.startsWith("white:")) {
									var14 = 5;
									this.field1555 = this.field1555.substring(6);
								}
								if (this.field1555.startsWith("flash1:")) {
									var14 = 6;
									this.field1555 = this.field1555.substring(7);
								}
								if (this.field1555.startsWith("flash2:")) {
									var14 = 7;
									this.field1555 = this.field1555.substring(7);
								}
								if (this.field1555.startsWith("flash3:")) {
									var14 = 8;
									this.field1555 = this.field1555.substring(7);
								}
								if (this.field1555.startsWith("glow1:")) {
									var14 = 9;
									this.field1555 = this.field1555.substring(6);
								}
								if (this.field1555.startsWith("glow2:")) {
									var14 = 10;
									this.field1555 = this.field1555.substring(6);
								}
								if (this.field1555.startsWith("glow3:")) {
									var14 = 11;
									this.field1555 = this.field1555.substring(6);
								}
								byte var15 = 0;
								if (this.field1555.startsWith("wave:")) {
									var15 = 1;
									this.field1555 = this.field1555.substring(5);
								}
								if (this.field1555.startsWith("scroll:")) {
									var15 = 2;
									this.field1555 = this.field1555.substring(7);
								}
								this.field1543.method228(83);
								this.field1543.method229(0);
								int var16 = this.field1543.field711;
								this.field1543.method229(var14);
								this.field1543.method229(var15);
								WordPack.method318(this.field1543, this.field1555);
								this.field1543.method238(this.field1543.field711 - var16);
								this.field1555 = JString.method315(this.field1555);
								this.field1555 = WordFilter.method403(this.field1555);
								field1231.field422 = this.field1555;
								field1231.field424 = var14;
								field1231.field425 = var15;
								field1231.field423 = 150;
								if (this.field1510 == 2) {
									this.method515("@cr2@" + field1231.field468, 2, field1231.field422);
								} else if (this.field1510 == 1) {
									this.method515("@cr1@" + field1231.field468, 2, field1231.field422);
								} else {
									this.method515(field1231.field468, 2, field1231.field422);
								}
								if (this.field1583 == 2) {
									this.field1583 = 3;
									this.field1243 = true;
									this.field1543.method228(129);
									this.field1543.method229(this.field1583);
									this.field1543.method229(this.field1625);
									this.field1543.method229(this.field1554);
								}
							}
							this.field1555 = "";
							this.field1528 = true;
						}
					}
				}
			} while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
			if (this.field1444.length() < 12) {
				this.field1444 = this.field1444 + (char) var2;
			}
		}
	}

	@ObfuscatedName("client.o(I)V")
	public final void method465() {
		while (true) {
			OnDemandRequest var2 = this.field1415.method291();
			if (var2 == null) {
				return;
			}
			if (var2.field724 == 0) {
				Model.method137(var2.field726, var2.field725);
				if ((this.field1415.method287(var2.field725) & 0x62) != 0) {
					this.field1200 = true;
					if (this.field1558 != -1) {
						this.field1528 = true;
					}
				}
			}
			if (var2.field724 == 1 && var2.field726 != null) {
				AnimFrame.method59(var2.field726);
			}
			if (var2.field724 == 2 && var2.field725 == this.field1616 && var2.field726 != null) {
				this.method541(this.field1617, var2.field726);
			}
			if (var2.field724 == 3 && this.field1317 == 1) {
				for (int var3 = 0; var3 < this.field1472.length; var3++) {
					if (this.field1505[var3] == var2.field725) {
						this.field1472[var3] = var2.field726;
						if (var2.field726 == null) {
							this.field1505[var3] = -1;
						}
						break;
					}
					if (this.field1506[var3] == var2.field725) {
						this.field1436[var3] = var2.field726;
						if (var2.field726 == null) {
							this.field1506[var3] = -1;
						}
						break;
					}
				}
			}
			if (var2.field724 == 93 && this.field1415.method286(var2.field725)) {
				World.method17(new Packet(var2.field726), this.field1415);
			}
		}
	}

	@ObfuscatedName("client.a(ZILmb;)V")
	public final void method466(int arg1, Packet arg2) {
		arg2.method249();
		int var4 = arg2.method250(1);
		if (var4 == 0) {
			return;
		}
		int var5 = arg2.method250(2);
		if (var5 == 0) {
			this.field1382[this.field1381++] = this.field1377;
		} else if (var5 == 1) {
			int var6 = arg2.method250(3);
			field1231.method125(false, var6);
			int var7 = arg2.method250(1);
			if (var7 == 1) {
				this.field1382[this.field1381++] = this.field1377;
			}
		} else if (var5 == 2) {
			int var8 = arg2.method250(3);
			field1231.method125(true, var8);
			int var9 = arg2.method250(3);
			field1231.method125(true, var9);
			int var10 = arg2.method250(1);
			if (var10 == 1) {
				this.field1382[this.field1381++] = this.field1377;
			}
		} else if (var5 == 3) {
			this.field1277 = arg2.method250(2);
			int var11 = arg2.method250(7);
			int var12 = arg2.method250(7);
			int var13 = arg2.method250(1);
			field1231.method124(var12, var11, var13 == 1);
			int var14 = arg2.method250(1);
			if (var14 == 1) {
				this.field1382[this.field1381++] = this.field1377;
			}
		}
	}

	@ObfuscatedName("client.p(I)V")
	public final void method467() {
		if (super.field29 != 1) {
			return;
		}
		if (super.field30 >= 539 && super.field30 <= 573 && super.field31 >= 169 && super.field31 < 205 && this.field1468[0] != -1) {
			this.field1200 = true;
			this.field1248 = 0;
			this.field1352 = true;
		}
		if (super.field30 >= 569 && super.field30 <= 599 && super.field31 >= 168 && super.field31 < 205 && this.field1468[1] != -1) {
			this.field1200 = true;
			this.field1248 = 1;
			this.field1352 = true;
		}
		if (super.field30 >= 597 && super.field30 <= 627 && super.field31 >= 168 && super.field31 < 205 && this.field1468[2] != -1) {
			this.field1200 = true;
			this.field1248 = 2;
			this.field1352 = true;
		}
		if (super.field30 >= 625 && super.field30 <= 669 && super.field31 >= 168 && super.field31 < 203 && this.field1468[3] != -1) {
			this.field1200 = true;
			this.field1248 = 3;
			this.field1352 = true;
		}
		if (super.field30 >= 666 && super.field30 <= 696 && super.field31 >= 168 && super.field31 < 205 && this.field1468[4] != -1) {
			this.field1200 = true;
			this.field1248 = 4;
			this.field1352 = true;
		}
		if (super.field30 >= 694 && super.field30 <= 724 && super.field31 >= 168 && super.field31 < 205 && this.field1468[5] != -1) {
			this.field1200 = true;
			this.field1248 = 5;
			this.field1352 = true;
		}
		if (super.field30 >= 722 && super.field30 <= 756 && super.field31 >= 169 && super.field31 < 205 && this.field1468[6] != -1) {
			this.field1200 = true;
			this.field1248 = 6;
			this.field1352 = true;
		}
		if (super.field30 >= 540 && super.field30 <= 574 && super.field31 >= 466 && super.field31 < 502 && this.field1468[7] != -1) {
			this.field1200 = true;
			this.field1248 = 7;
			this.field1352 = true;
		}
		if (super.field30 >= 572 && super.field30 <= 602 && super.field31 >= 466 && super.field31 < 503 && this.field1468[8] != -1) {
			this.field1200 = true;
			this.field1248 = 8;
			this.field1352 = true;
		}
		if (super.field30 >= 599 && super.field30 <= 629 && super.field31 >= 466 && super.field31 < 503 && this.field1468[9] != -1) {
			this.field1200 = true;
			this.field1248 = 9;
			this.field1352 = true;
		}
		if (super.field30 >= 627 && super.field30 <= 671 && super.field31 >= 467 && super.field31 < 502 && this.field1468[10] != -1) {
			this.field1200 = true;
			this.field1248 = 10;
			this.field1352 = true;
		}
		if (super.field30 >= 669 && super.field30 <= 699 && super.field31 >= 466 && super.field31 < 503 && this.field1468[11] != -1) {
			this.field1200 = true;
			this.field1248 = 11;
			this.field1352 = true;
		}
		if (super.field30 >= 696 && super.field30 <= 726 && super.field31 >= 466 && super.field31 < 503 && this.field1468[12] != -1) {
			this.field1200 = true;
			this.field1248 = 12;
			this.field1352 = true;
		}
		if (super.field30 >= 724 && super.field30 <= 758 && super.field31 >= 466 && super.field31 < 502 && this.field1468[13] != -1) {
			this.field1200 = true;
			this.field1248 = 13;
			this.field1352 = true;
			return;
		}
	}

	@ObfuscatedName("client.b(II)Ljava/lang/String;")
	public static final String method468(int arg0) {
		String var2 = String.valueOf(arg0);
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

	@ObfuscatedName("client.a(IIZBILd;III)V")
	public final void method469(int arg0, int arg1, boolean arg2, int arg4, Component arg5, int arg6, int arg7, int arg8) {
		if (this.field1624) {
			this.field1290 = 32;
		} else {
			this.field1290 = 0;
		}
		this.field1624 = false;
		if (arg4 >= arg0 && arg4 < arg0 + 16 && arg6 >= arg8 && arg6 < arg8 + 16) {
			arg5.field90 -= this.field1361 * 4;
			if (arg2) {
				this.field1200 = true;
				return;
			}
		} else if (arg4 >= arg0 && arg4 < arg0 + 16 && arg6 >= arg8 + arg7 - 16 && arg6 < arg8 + arg7) {
			arg5.field90 += this.field1361 * 4;
			if (arg2) {
				this.field1200 = true;
				return;
			}
		} else if (arg4 >= arg0 - this.field1290 && arg4 < arg0 + 16 + this.field1290 && arg6 >= arg8 + 16 && arg6 < arg8 + arg7 - 16 && this.field1361 > 0) {
			int var10 = (arg7 - 32) * arg7 / arg1;
			if (var10 < 8) {
				var10 = 8;
			}
			int var11 = arg6 - arg8 - 16 - var10 / 2;
			int var12 = arg7 - 32 - var10;
			arg5.field90 = (arg1 - arg7) * var11 / var12;
			if (arg2) {
				this.field1200 = true;
			}
			this.field1624 = true;
		} else {
			return;
		}
	}

	@ObfuscatedName("client.a(IIII)I")
	public final int method470(int arg0, int arg1, int arg2) {
		int var5 = arg2 >> 7;
		int var6 = arg0 >> 7;
		if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
			int var7 = arg1;
			if (arg1 < 3 && (this.field1512[1][var5][var6] & 0x2) == 2) {
				var7 = arg1 + 1;
			}
			int var8 = arg2 & 0x7F;
			int var9 = arg0 & 0x7F;
			int var10 = this.field1276[var7][var5][var6] * (128 - var8) + this.field1276[var7][var5 + 1][var6] * var8 >> 7;
			int var11 = this.field1276[var7][var5][var6 + 1] * (128 - var8) + this.field1276[var7][var5 + 1][var6 + 1] * var8 >> 7;
			return var10 * (128 - var9) + var11 * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public final boolean method471(int arg1, int arg2) {
		boolean var5 = false;
		Component var6 = Component.field70[arg2];
		for (int var7 = 0; var7 < var6.field92.length && var6.field92[var7] != -1; var7++) {
			Component var8 = Component.field70[var6.field92[var7]];
			if (var8.field77 == 1) {
				var5 |= this.method471(arg1, var8.field75);
			}
			if (var8.field77 == 6 && (var8.field123 != -1 || var8.field124 != -1)) {
				boolean var9 = this.method458(var8);
				int var10;
				if (var9) {
					var10 = var8.field124;
				} else {
					var10 = var8.field123;
				}
				if (var10 != -1) {
					SeqType var11 = SeqType.field1112[var10];
					var8.field74 += arg1;
					while (var8.field74 > var11.method384(var8.field73)) {
						var8.field74 -= var11.method384(var8.field73) + 1;
						var8.field73++;
						if (var8.field73 >= var11.field1113) {
							var8.field73 -= var11.field1117;
							if (var8.field73 < 0 || var8.field73 >= var11.field1113) {
								var8.field73 = 0;
							}
						}
						var5 = true;
					}
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("client.a(JZ)V")
	public final void method472(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (int var4 = 0; var4 < this.field1609; var4++) {
			if (this.field1521[var4] == arg0) {
				this.field1609--;
				this.field1200 = true;
				for (int var5 = var4; var5 < this.field1609; var5++) {
					this.field1257[var5] = this.field1257[var5 + 1];
					this.field1553[var5] = this.field1553[var5 + 1];
					this.field1521[var5] = this.field1521[var5 + 1];
				}
				this.field1543.method228(84);
				this.field1543.method235(arg0);
				break;
			}
		}
	}

	@ObfuscatedName("client.a(Ljb;III)V")
	public final void method473(Pix32 arg0, int arg2, int arg3) {
		int var5 = this.field1253 + this.field1278 & 0x7FF;
		int var6 = arg3 * arg3 + arg2 * arg2;
		if (var6 > 6400) {
			return;
		}
		int var7 = Model.field602[var5];
		int var8 = Model.field603[var5];
		int var9 = var7 * 256 / (this.field1348 + 256);
		int var10 = var8 * 256 / (this.field1348 + 256);
		int var11 = arg2 * var9 + arg3 * var10 >> 16;
		int var12 = arg2 * var10 - arg3 * var9 >> 16;
		if (var6 > 2500) {
			arg0.method205(this.field1296, 83 - var12 - arg0.field672 / 2 - 4, var11 + 94 - arg0.field671 / 2 + 4);
		} else {
			arg0.method199(var11 + 94 - arg0.field671 / 2 + 4, 83 - var12 - arg0.field672 / 2 - 4);
		}
	}

	@ObfuscatedName("client.h(Z)V")
	public final void method474() {
		for (int var2 = 0; var2 < this.field1322; var2++) {
			if (this.field1305[var2] <= 0) {
				boolean var3 = false;
				try {
					if (this.field1192[var2] != this.field1411 || this.field1340[var2] != this.field1440) {
						Packet var4 = Wave.method323(this.field1340[var2], this.field1192[var2]);
						if (System.currentTimeMillis() + (long) (var4.field711 / 22) > this.field1274 + (long) (this.field1602 / 22)) {
							this.field1602 = var4.field711;
							this.field1274 = System.currentTimeMillis();
							if (this.method505(var4.field710, var4.field711)) {
								this.field1411 = this.field1192[var2];
								this.field1440 = this.field1340[var2];
							} else {
								var3 = true;
							}
						}
					} else if (!this.method431()) {
						var3 = true;
					}
				} catch (Exception var7) {
				}
				if (var3 && this.field1305[var2] != -5) {
					this.field1305[var2] = -5;
				} else {
					this.field1322--;
					for (int var6 = var2; var6 < this.field1322; var6++) {
						this.field1192[var6] = this.field1192[var6 + 1];
						this.field1340[var6] = this.field1340[var6 + 1];
						this.field1305[var6] = this.field1305[var6 + 1];
					}
					var2--;
				}
			} else {
				int var10002 = this.field1305[var2]--;
			}
		}
		if (this.field1569 > 0) {
			this.field1569 -= 20;
			if (this.field1569 < 0) {
				this.field1569 = 0;
			}
			if (this.field1569 == 0 && this.field1315 && !field1242) {
				this.field1616 = this.field1598;
				this.field1617 = false;
				this.field1415.method289(2, this.field1616);
			}
		}
	}

	@ObfuscatedName("client.a(ZI)V")
	public final void method475(int arg1) {
		int var3 = VarpType.field1154[arg1].field1162;
		if (var3 == 0) {
			return;
		}
		int var4 = this.field1211[arg1];
		if (var3 == 1) {
			if (var4 == 1) {
				Pix3D.method186(0.9D);
			}
			if (var4 == 2) {
				Pix3D.method186(0.8D);
			}
			if (var4 == 3) {
				Pix3D.method186(0.7D);
			}
			if (var4 == 4) {
				Pix3D.method186(0.6D);
			}
			ObjType.field1062.method117();
			this.field1448 = true;
		}
		if (var3 == 3) {
			boolean var5 = this.field1315;
			if (var4 == 0) {
				this.method443(0, this.field1315);
				this.field1315 = true;
			}
			if (var4 == 1) {
				this.method443(-400, this.field1315);
				this.field1315 = true;
			}
			if (var4 == 2) {
				this.method443(-800, this.field1315);
				this.field1315 = true;
			}
			if (var4 == 3) {
				this.method443(-1200, this.field1315);
				this.field1315 = true;
			}
			if (var4 == 4) {
				this.field1315 = false;
			}
			if (this.field1315 != var5 && !field1242) {
				if (this.field1315) {
					this.field1616 = this.field1598;
					this.field1617 = false;
					this.field1415.method289(2, this.field1616);
				} else {
					this.method453();
				}
				this.field1569 = 0;
			}
		}
		if (var3 == 4) {
			if (var4 == 0) {
				this.field1351 = true;
				this.method522(0);
			}
			if (var4 == 1) {
				this.field1351 = true;
				this.method522(-400);
			}
			if (var4 == 2) {
				this.field1351 = true;
				this.method522(-800);
			}
			if (var4 == 3) {
				this.field1351 = true;
				this.method522(-1200);
			}
			if (var4 == 4) {
				this.field1351 = false;
			}
		}
		if (var3 == 5) {
			this.field1495 = var4;
		}
		if (var3 == 6) {
			this.field1386 = var4;
		}
		if (var3 == 8) {
			this.field1342 = var4;
			this.field1528 = true;
		}
		if (var3 == 9) {
			this.field1522 = var4;
		}
	}

	@ObfuscatedName("client.a(IBLmb;)V")
	public final void method476(int arg0, Packet arg2) {
		for (int var4 = 0; var4 < this.field1381; var4++) {
			int var5 = this.field1382[var4];
			ClientNpc var6 = this.field1219[var5];
			int var7 = arg2.method239();
			if ((var7 & 0x1) == 1) {
				int var8 = arg2.method239();
				int var9 = arg2.method239();
				var6.method128(var9, var8);
				var6.field429 = field1591 + 300;
				var6.field430 = arg2.method239();
				var6.field431 = arg2.method239();
			}
			if ((var7 & 0x2) == 2) {
				int var10 = arg2.method241();
				if (var10 == 65535) {
					var10 = -1;
				}
				if (var10 == var6.field438) {
					var6.field442 = 0;
				}
				int var11 = arg2.method239();
				if (var10 == var6.field438 && var10 != -1) {
					int var12 = SeqType.field1112[var10].field1126;
					if (var12 == 1) {
						var6.field439 = 0;
						var6.field440 = 0;
						var6.field441 = var11;
						var6.field442 = 0;
					}
					if (var12 == 2) {
						var6.field442 = 0;
					}
				} else if (var10 == -1 || var6.field438 == -1 || SeqType.field1112[var10].field1120 >= SeqType.field1112[var6.field438].field1120) {
					var6.field438 = var10;
					var6.field439 = 0;
					var6.field440 = 0;
					var6.field441 = var11;
					var6.field442 = 0;
					var6.field464 = var6.field459;
				}
			}
			if ((var7 & 0x4) == 4) {
				var6.field432 = arg2.method241();
				if (var6.field432 == 65535) {
					var6.field432 = -1;
				}
			}
			if ((var7 & 0x8) == 8) {
				var6.field422 = arg2.method246();
				var6.field423 = 100;
			}
			if ((var7 & 0x10) == 16) {
				int var13 = arg2.method239();
				int var14 = arg2.method239();
				var6.method128(var14, var13);
				var6.field429 = field1591 + 300;
				var6.field430 = arg2.method239();
				var6.field431 = arg2.method239();
			}
			if ((var7 & 0x20) == 32) {
				var6.field465 = NpcType.method344(arg2.method241());
				var6.field414 = var6.field465.field987;
				var6.field458 = var6.field465.field1009;
				var6.field417 = var6.field465.field991;
				var6.field418 = var6.field465.field992;
				var6.field419 = var6.field465.field993;
				var6.field420 = var6.field465.field994;
				var6.field415 = var6.field465.field990;
			}
			if ((var7 & 0x40) == 64) {
				var6.field443 = arg2.method241();
				int var15 = arg2.method244();
				var6.field447 = var15 >> 16;
				var6.field446 = field1591 + (var15 & 0xFFFF);
				var6.field444 = 0;
				var6.field445 = 0;
				if (var6.field446 > field1591) {
					var6.field444 = -1;
				}
				if (var6.field443 == 65535) {
					var6.field443 = -1;
				}
			}
			if ((var7 & 0x80) == 128) {
				var6.field433 = arg2.method241();
				var6.field434 = arg2.method241();
			}
		}
	}

	@ObfuscatedName("client.a()V")
	public final void method6() {
		if (signlink.sunjava) {
			super.field9 = 5;
		}
		if (field1620) {
			this.field1410 = true;
			return;
		}
		field1620 = true;
		boolean var1 = false;
		String var2 = this.method550();
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
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.field1194 = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.field1232[var3] = new FileStream(signlink.cache_idx[var3], 500000, var3 + 1, signlink.cache_dat);
			}
		}
		try {
			int var4 = 5;
			this.field1637[8] = 0;
			while (this.field1637[8] == 0) {
				this.method13("Connecting to web server", 20);
				try {
					DataInputStream var5 = this.method498("crc" + (int) (Math.random() * 9.9999999E7D));
					Packet var6 = new Packet(new byte[36]);
					var5.readFully(var6.field710, 0, 36);
					for (int var7 = 0; var7 < 9; var7++) {
						this.field1637[var7] = var6.method244();
					}
					var5.close();
				} catch (IOException var80) {
					for (int var8 = var4; var8 > 0; var8--) {
						this.method13("Error loading - Will retry in " + var8 + " secs.", 10);
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
			this.field1371 = this.method533("title screen", this.field1637[1], 25, "title", 1);
			this.field1344 = new PixFont("p11", this.field1371);
			this.field1345 = new PixFont("p12", this.field1371);
			this.field1346 = new PixFont("b12", this.field1371);
			this.field1347 = new PixFont("q8", this.field1371);
			this.method526();
			this.method558();
			JagFile var9 = this.method533("config", this.field1637[2], 30, "config", 2);
			JagFile var10 = this.method533("interface", this.field1637[3], 35, "interface", 3);
			JagFile var11 = this.method533("2d graphics", this.field1637[4], 40, "media", 4);
			JagFile var12 = this.method533("textures", this.field1637[6], 45, "textures", 6);
			JagFile var13 = this.method533("chat system", this.field1637[7], 50, "wordenc", 7);
			JagFile var14 = this.method533("sound effects", this.field1637[8], 55, "sounds", 8);
			this.field1512 = new byte[4][104][104];
			this.field1276 = new int[4][105][105];
			this.field1325 = new World3D(104, 104, this.field1276, 4);
			for (int var15 = 0; var15 < 4; var15++) {
				this.field1233[var15] = new CollisionMap(104, 104);
			}
			this.field1303 = new Pix32(512, 512);
			JagFile var16 = this.method533("update list", this.field1637[5], 60, "versionlist", 5);
			this.method13("Connecting to update server", 60);
			this.field1415 = new OnDemand();
			this.field1415.method280(var16, this);
			AnimFrame.method58(this.field1415.method283(false));
			Model.method136(this.field1415.method282(0), this.field1415);
			if (!field1242) {
				this.field1616 = 0;
				this.field1617 = false;
				this.field1415.method289(2, this.field1616);
				while (this.field1415.method290() > 0) {
					this.method465();
					try {
						Thread.sleep(100L);
					} catch (Exception var74) {
					}
				}
			}
			this.method13("Requesting animations", 65);
			int var17 = this.field1415.method282(1);
			for (int var18 = 0; var18 < var17; var18++) {
				this.field1415.method289(1, var18);
			}
			while (this.field1415.method290() > 0) {
				int var19 = var17 - this.field1415.method290();
				if (var19 > 0) {
					this.method13("Loading animations - " + var19 * 100 / var17 + "%", 65);
				}
				this.method465();
				try {
					Thread.sleep(100L);
				} catch (Exception var73) {
				}
			}
			this.method13("Requesting models", 70);
			int var20 = this.field1415.method282(0);
			for (int var21 = 0; var21 < var20; var21++) {
				int var22 = this.field1415.method287(var21);
				if ((var22 & 0x1) != 0) {
					this.field1415.method289(0, var21);
				}
			}
			int var23 = this.field1415.method290();
			while (this.field1415.method290() > 0) {
				int var24 = var23 - this.field1415.method290();
				if (var24 > 0) {
					this.method13("Loading models - " + var24 * 100 / var23 + "%", 70);
				}
				this.method465();
				try {
					Thread.sleep(100L);
				} catch (Exception var72) {
				}
			}
			if (this.field1232[0] != null) {
				this.method13("Requesting maps", 75);
				this.field1415.method289(3, this.field1415.method284(47, 48, 0));
				this.field1415.method289(3, this.field1415.method284(47, 48, 1));
				this.field1415.method289(3, this.field1415.method284(48, 48, 0));
				this.field1415.method289(3, this.field1415.method284(48, 48, 1));
				this.field1415.method289(3, this.field1415.method284(49, 48, 0));
				this.field1415.method289(3, this.field1415.method284(49, 48, 1));
				this.field1415.method289(3, this.field1415.method284(47, 47, 0));
				this.field1415.method289(3, this.field1415.method284(47, 47, 1));
				this.field1415.method289(3, this.field1415.method284(48, 47, 0));
				this.field1415.method289(3, this.field1415.method284(48, 47, 1));
				this.field1415.method289(3, this.field1415.method284(48, 148, 0));
				this.field1415.method289(3, this.field1415.method284(48, 148, 1));
				int var25 = this.field1415.method290();
				while (this.field1415.method290() > 0) {
					int var26 = var25 - this.field1415.method290();
					if (var26 > 0) {
						this.method13("Loading maps - " + var26 * 100 / var25 + "%", 75);
					}
					this.method465();
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
				}
			}
			int var27 = this.field1415.method282(0);
			for (int var28 = 0; var28 < var27; var28++) {
				int var29 = this.field1415.method287(var28);
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
					this.field1415.method292(0, var30, var28);
				}
			}
			this.field1415.method285(field1241);
			if (!field1242) {
				int var31 = this.field1415.method282(2);
				for (int var32 = 1; var32 < var31; var32++) {
					if (this.field1415.method288(var32)) {
						this.field1415.method292(2, (byte) 1, var32);
					}
				}
			}
			this.method13("Unpacking media", 80);
			this.field1295 = new Pix8(var11, "invback", 0);
			this.field1297 = new Pix8(var11, "chatback", 0);
			this.field1296 = new Pix8(var11, "mapback", 0);
			this.field1280 = new Pix8(var11, "backbase1", 0);
			this.field1281 = new Pix8(var11, "backbase2", 0);
			this.field1282 = new Pix8(var11, "backhmid1", 0);
			for (int var33 = 0; var33 < 13; var33++) {
				this.field1460[var33] = new Pix8(var11, "sideicons", var33);
			}
			this.field1300 = new Pix32(var11, "compass", 0);
			this.field1590 = new Pix32(var11, "mapedge", 0);
			this.field1590.method196();
			try {
				for (int var34 = 0; var34 < 50; var34++) {
					this.field1473[var34] = new Pix8(var11, "mapscene", var34);
				}
			} catch (Exception var79) {
			}
			try {
				for (int var35 = 0; var35 < 50; var35++) {
					this.field1600[var35] = new Pix32(var11, "mapfunction", var35);
				}
			} catch (Exception var78) {
			}
			try {
				for (int var36 = 0; var36 < 20; var36++) {
					this.field1353[var36] = new Pix32(var11, "hitmarks", var36);
				}
			} catch (Exception var77) {
			}
			try {
				for (int var37 = 0; var37 < 20; var37++) {
					this.field1559[var37] = new Pix32(var11, "headicons", var37);
				}
			} catch (Exception var76) {
			}
			this.field1442 = new Pix32(var11, "mapmarker", 0);
			this.field1443 = new Pix32(var11, "mapmarker", 1);
			for (int var38 = 0; var38 < 8; var38++) {
				this.field1622[var38] = new Pix32(var11, "cross", var38);
			}
			this.field1570 = new Pix32(var11, "mapdots", 0);
			this.field1571 = new Pix32(var11, "mapdots", 1);
			this.field1572 = new Pix32(var11, "mapdots", 2);
			this.field1573 = new Pix32(var11, "mapdots", 3);
			this.field1355 = new Pix8(var11, "scrollbar", 0);
			this.field1356 = new Pix8(var11, "scrollbar", 1);
			this.field1399 = new Pix8(var11, "redstone1", 0);
			this.field1400 = new Pix8(var11, "redstone2", 0);
			this.field1401 = new Pix8(var11, "redstone3", 0);
			this.field1402 = new Pix8(var11, "redstone1", 0);
			this.field1402.method209();
			this.field1403 = new Pix8(var11, "redstone2", 0);
			this.field1403.method209();
			this.field1226 = new Pix8(var11, "redstone1", 0);
			this.field1226.method210();
			this.field1227 = new Pix8(var11, "redstone2", 0);
			this.field1227.method210();
			this.field1228 = new Pix8(var11, "redstone3", 0);
			this.field1228.method210();
			this.field1229 = new Pix8(var11, "redstone1", 0);
			this.field1229.method209();
			this.field1229.method210();
			this.field1230 = new Pix8(var11, "redstone2", 0);
			this.field1230.method209();
			this.field1230.method210();
			for (int var39 = 0; var39 < 2; var39++) {
				this.field1630[var39] = new Pix8(var11, "mod_icons", var39);
			}
			Pix32 var40 = new Pix32(var11, "backleft1", 0);
			this.field1560 = new PixMap(this.method11(), var40.field667, var40.field668);
			var40.method197(0, 0);
			Pix32 var41 = new Pix32(var11, "backleft2", 0);
			this.field1561 = new PixMap(this.method11(), var41.field667, var41.field668);
			var41.method197(0, 0);
			Pix32 var42 = new Pix32(var11, "backright1", 0);
			this.field1562 = new PixMap(this.method11(), var42.field667, var42.field668);
			var42.method197(0, 0);
			Pix32 var43 = new Pix32(var11, "backright2", 0);
			this.field1563 = new PixMap(this.method11(), var43.field667, var43.field668);
			var43.method197(0, 0);
			Pix32 var44 = new Pix32(var11, "backtop1", 0);
			this.field1564 = new PixMap(this.method11(), var44.field667, var44.field668);
			var44.method197(0, 0);
			Pix32 var45 = new Pix32(var11, "backvmid1", 0);
			this.field1565 = new PixMap(this.method11(), var45.field667, var45.field668);
			var45.method197(0, 0);
			Pix32 var46 = new Pix32(var11, "backvmid2", 0);
			this.field1566 = new PixMap(this.method11(), var46.field667, var46.field668);
			var46.method197(0, 0);
			Pix32 var47 = new Pix32(var11, "backvmid3", 0);
			this.field1567 = new PixMap(this.method11(), var47.field667, var47.field668);
			var47.method197(0, 0);
			Pix32 var48 = new Pix32(var11, "backhmid2", 0);
			this.field1568 = new PixMap(this.method11(), var48.field667, var48.field668);
			var48.method197(0, 0);
			int var49 = (int) (Math.random() * 21.0D) - 10;
			int var50 = (int) (Math.random() * 21.0D) - 10;
			int var51 = (int) (Math.random() * 21.0D) - 10;
			int var52 = (int) (Math.random() * 41.0D) - 20;
			for (int var53 = 0; var53 < 50; var53++) {
				if (this.field1600[var53] != null) {
					this.field1600[var53].method195(var50 + var52, var49 + var52, var51 + var52);
				}
				if (this.field1473[var53] != null) {
					this.field1473[var53].method211(var50 + var52, var49 + var52, var51 + var52);
				}
			}
			this.method13("Unpacking textures", 83);
			Pix3D.method182(var12);
			Pix3D.method186(0.8D);
			Pix3D.method181(20);
			this.method13("Unpacking config", 86);
			SeqType.method383(var9);
			LocType.method332(var9);
			FloType.method373(var9);
			ObjType.method348(var9);
			NpcType.method342(var9);
			IdkType.method377(var9);
			SpotAnimType.method386(var9);
			VarpType.method391(var9);
			VarBitType.method389(var9);
			ObjType.field1021 = field1241;
			if (!field1242) {
				this.method13("Unpacking sounds", 90);
				byte[] var54 = var14.method309("sounds.dat", null);
				Packet var55 = new Packet(var54);
				Wave.method322(var55);
			}
			this.method13("Unpacking interfaces", 95);
			PixFont[] var56 = new PixFont[] { this.field1344, this.field1345, this.field1346, this.field1347 };
			Component.method32(var11, var56, var10);
			this.method13("Preparing game engine", 100);
			for (int var57 = 0; var57 < 33; var57++) {
				int var58 = 999;
				int var59 = 0;
				for (int var60 = 0; var60 < 34; var60++) {
					if (this.field1296.field674[var60 + var57 * this.field1296.field676] == 0) {
						if (var58 == 999) {
							var58 = var60;
						}
					} else if (var58 != 999) {
						var59 = var60;
						break;
					}
				}
				this.field1595[var57] = var58;
				this.field1424[var57] = var59 - var58;
			}
			for (int var61 = 5; var61 < 156; var61++) {
				int var62 = 999;
				int var63 = 0;
				for (int var64 = 25; var64 < 172; var64++) {
					if (this.field1296.field674[var64 + var61 * this.field1296.field676] == 0 && (var64 > 34 || var61 > 34)) {
						if (var62 == 999) {
							var62 = var64;
						}
					} else if (var62 != 999) {
						var63 = var64;
						break;
					}
				}
				this.field1502[var61 - 5] = var62 - 25;
				this.field1648[var61 - 5] = var63 - var62;
			}
			Pix3D.method179(479, 96);
			this.field1613 = Pix3D.field647;
			Pix3D.method179(190, 261);
			this.field1614 = Pix3D.field647;
			Pix3D.method179(512, 334);
			this.field1615 = Pix3D.field647;
			int[] var65 = new int[9];
			for (int var66 = 0; var66 < 9; var66++) {
				int var67 = var66 * 32 + 128 + 15;
				int var68 = var67 * 3 + 600;
				int var69 = Pix3D.field645[var67];
				var65[var66] = var68 * var69 >> 16;
			}
			World3D.method100(500, 512, 334, 800, var65);
			WordFilter.method393(var13);
			this.field1644 = new MouseTracking(this);
			this.method12(this.field1644, 10);
		} catch (Exception var81) {
			signlink.reporterror("loaderror " + this.field1469 + " " + this.field1201);
			this.field1508 = true;
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public final void method477(boolean arg0) {
		for (int var3 = 0; var3 < this.field1220; var3++) {
			ClientNpc var4 = this.field1219[this.field1221[var3]];
			int var5 = (this.field1221[var3] << 14) + 536870912;
			if (var4 != null && var4.method127() && var4.field465.field1005 == arg0) {
				int var6 = var4.field410 >> 7;
				int var7 = var4.field411 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.field414 == 1 && (var4.field410 & 0x7F) == 64 && (var4.field411 & 0x7F) == 64) {
						if (this.field1586[var6][var7] == this.field1320) {
							continue;
						}
						this.field1586[var6][var7] = this.field1320;
					}
					this.field1325.method75(var4.field412, var5, (var4.field414 - 1) * 64 + 60, var4.field410, var4, this.method470(var4.field411, this.field1277, var4.field410), this.field1277, var4.field413, var4.field411);
				}
			}
		}
	}

	@ObfuscatedName("client.b(IIIIII)V")
	public final void method478(int arg1, int arg2, int arg3, int arg4, int arg5) {
		this.field1355.method212(arg3, arg5);
		this.field1356.method212(arg3, arg5 + arg1 - 16);
		Pix2D.method170(arg1 - 32, 16, arg3, arg5 + 16, this.field1455);
		int var7 = (arg1 - 32) * arg1 / arg2;
		if (var7 < 8) {
			var7 = 8;
		}
		int var8 = (arg1 - 32 - var7) * arg4 / (arg2 - arg1);
		Pix2D.method170(var7, 16, arg3, arg5 + 16 + var8, this.field1585);
		Pix2D.method175(arg5 + 16 + var8, var7, this.field1513, arg3, -490);
		Pix2D.method175(arg5 + 16 + var8, var7, this.field1513, arg3 + 1, -490);
		Pix2D.method173(arg3, arg5 + 16 + var8, this.field1513, 16);
		Pix2D.method173(arg3, arg5 + 17 + var8, this.field1513, 16);
		Pix2D.method175(arg5 + 16 + var8, var7, this.field1457, arg3 + 15, -490);
		Pix2D.method175(arg5 + 17 + var8, var7 - 1, this.field1457, arg3 + 14, -490);
		Pix2D.method173(arg3, arg5 + 15 + var8 + var7, this.field1457, 16);
		Pix2D.method173(arg3 + 1, arg5 + 14 + var8 + var7, this.field1457, 15);
	}

	@ObfuscatedName("client.q(I)V")
	public final void method479() {
		try {
			if (this.field1607 != null) {
				this.field1607.method38();
			}
		} catch (Exception var3) {
		}
		this.field1607 = null;
		this.field1238 = false;
		this.field1493 = 0;
		this.field1426 = "";
		this.field1427 = "";
		InputTracking.method45();
		this.method457();
		this.field1325.method64();
		for (int var2 = 0; var2 < 4; var2++) {
			this.field1233[var2].method361();
		}
		System.gc();
		this.method453();
		this.field1598 = -1;
		this.field1616 = -1;
		this.field1569 = 0;
	}

	@ObfuscatedName("client.a(IZII)I")
	public final int method480(int arg0, int arg2, int arg3) {
		int var5 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var5 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var5 + (arg3 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("client.f(B)I")
	public final int method481() {
		int var2 = 3;
		if (this.field1269 < 310) {
			int var3 = this.field1266 >> 7;
			int var4 = this.field1268 >> 7;
			int var5 = field1231.field410 >> 7;
			int var6 = field1231.field411 >> 7;
			if ((this.field1512[this.field1277][var3][var4] & 0x4) != 0) {
				var2 = this.field1277;
			}
			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}
			int var8;
			if (var6 > var4) {
				var8 = var6 - var4;
			} else {
				var8 = var4 - var6;
			}
			if (var7 > var8) {
				int var9 = var8 * 65536 / var7;
				int var10 = 32768;
				while (var3 != var5) {
					if (var3 < var5) {
						var3++;
					} else if (var3 > var5) {
						var3--;
					}
					if ((this.field1512[this.field1277][var3][var4] & 0x4) != 0) {
						var2 = this.field1277;
					}
					var10 += var9;
					if (var10 >= 65536) {
						var10 -= 65536;
						if (var4 < var6) {
							var4++;
						} else if (var4 > var6) {
							var4--;
						}
						if ((this.field1512[this.field1277][var3][var4] & 0x4) != 0) {
							var2 = this.field1277;
						}
					}
				}
			} else {
				int var11 = var7 * 65536 / var8;
				int var12 = 32768;
				while (var4 != var6) {
					if (var4 < var6) {
						var4++;
					} else if (var4 > var6) {
						var4--;
					}
					if ((this.field1512[this.field1277][var3][var4] & 0x4) != 0) {
						var2 = this.field1277;
					}
					var12 += var11;
					if (var12 >= 65536) {
						var12 -= 65536;
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((this.field1512[this.field1277][var3][var4] & 0x4) != 0) {
							var2 = this.field1277;
						}
					}
				}
			}
		}
		if ((this.field1512[this.field1277][field1231.field410 >> 7][field1231.field411 >> 7] & 0x4) != 0) {
			var2 = this.field1277;
		}
		return var2;
	}

	@ObfuscatedName("client.i(Z)I")
	public final int method482() {
		int var2 = this.method470(this.field1268, this.field1277, this.field1266);
		return var2 - this.field1267 >= 800 || (this.field1512[this.field1277][this.field1266 >> 7][this.field1268 >> 7] & 0x4) == 0 ? 3 : this.field1277;
	}

	@ObfuscatedName("client.a(ZILgc;II)V")
	public final void method483(int arg1, NpcType arg2, int arg3, int arg4) {
		if (this.field1314 >= 400) {
			return;
		}
		String var6 = arg2.field985;
		if (arg2.field1002 != 0) {
			var6 = var6 + method450(arg2.field1002, field1231.field474) + " (level-" + arg2.field1002 + ")";
		}
		if (this.field1195 == 1) {
			this.field1292[this.field1314] = "Use " + this.field1199 + " with @yel@" + var6;
			this.field1205[this.field1314] = 829;
			this.field1206[this.field1314] = arg3;
			this.field1203[this.field1314] = arg1;
			this.field1204[this.field1314] = arg4;
			this.field1314++;
		} else if (this.field1387 != 1) {
			if (arg2.field997 != null) {
				for (int var7 = 4; var7 >= 0; var7--) {
					if (arg2.field997[var7] != null && !arg2.field997[var7].equalsIgnoreCase("attack")) {
						this.field1292[this.field1314] = arg2.field997[var7] + " @yel@" + var6;
						if (var7 == 0) {
							this.field1205[this.field1314] = 242;
						}
						if (var7 == 1) {
							this.field1205[this.field1314] = 209;
						}
						if (var7 == 2) {
							this.field1205[this.field1314] = 309;
						}
						if (var7 == 3) {
							this.field1205[this.field1314] = 852;
						}
						if (var7 == 4) {
							this.field1205[this.field1314] = 793;
						}
						this.field1206[this.field1314] = arg3;
						this.field1203[this.field1314] = arg1;
						this.field1204[this.field1314] = arg4;
						this.field1314++;
					}
				}
			}
			if (arg2.field997 != null) {
				for (int var8 = 4; var8 >= 0; var8--) {
					if (arg2.field997[var8] != null && arg2.field997[var8].equalsIgnoreCase("attack")) {
						short var9 = 0;
						if (arg2.field1002 > field1231.field474) {
							var9 = 2000;
						}
						this.field1292[this.field1314] = arg2.field997[var8] + " @yel@" + var6;
						if (var8 == 0) {
							this.field1205[this.field1314] = var9 + 242;
						}
						if (var8 == 1) {
							this.field1205[this.field1314] = var9 + 209;
						}
						if (var8 == 2) {
							this.field1205[this.field1314] = var9 + 309;
						}
						if (var8 == 3) {
							this.field1205[this.field1314] = var9 + 852;
						}
						if (var8 == 4) {
							this.field1205[this.field1314] = var9 + 793;
						}
						this.field1206[this.field1314] = arg3;
						this.field1203[this.field1314] = arg1;
						this.field1204[this.field1314] = arg4;
						this.field1314++;
					}
				}
			}
			this.field1292[this.field1314] = "Examine @yel@" + var6;
			this.field1205[this.field1314] = 1714;
			this.field1206[this.field1314] = arg3;
			this.field1203[this.field1314] = arg1;
			this.field1204[this.field1314] = arg4;
			this.field1314++;
		} else if ((this.field1389 & 0x2) == 2) {
			this.field1292[this.field1314] = this.field1390 + " @yel@" + var6;
			this.field1205[this.field1314] = 240;
			this.field1206[this.field1314] = arg3;
			this.field1203[this.field1314] = arg1;
			this.field1204[this.field1314] = arg4;
			this.field1314++;
			return;
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public final void method484(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.field1646 >= 100) {
			this.method515("", 0, "Your ignore list is full. Max of 100 hit");
			return;
		}
		String var4 = JString.method314(JString.method311(arg0));
		for (int var5 = 0; var5 < this.field1646; var5++) {
			if (this.field1515[var5] == arg0) {
				this.method515("", 0, var4 + " is already on your ignore list");
				return;
			}
		}
		for (int var6 = 0; var6 < this.field1609; var6++) {
			if (this.field1521[var6] == arg0) {
				this.method515("", 0, "Please remove " + var4 + " from your friend list first");
				return;
			}
		}
		this.field1515[this.field1646++] = arg0;
		this.field1200 = true;
		this.field1543.method228(189);
		this.field1543.method235(arg0);
	}

	@ObfuscatedName("client.r(I)V")
	public final void method485() {
		if (this.field1342 == 0) {
			return;
		}
		int var2 = 0;
		if (this.field1452 != 0) {
			var2 = 1;
		}
		for (int var3 = 0; var3 < 100; var3++) {
			if (this.field1247[var3] != null) {
				int var4 = this.field1245[var3];
				String var5 = this.field1246[var3];
				boolean var6 = false;
				if (var5 != null && var5.startsWith("@cr1@")) {
					var5 = var5.substring(5);
					boolean var7 = true;
				}
				if (var5 != null && var5.startsWith("@cr2@")) {
					var5 = var5.substring(5);
					boolean var8 = true;
				}
				if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var5))) {
					int var9 = 329 - var2 * 13;
					if (super.field23 > 4 && super.field24 - 4 > var9 - 10 && super.field24 - 4 <= var9 + 3) {
						int var10 = this.field1345.method216("From:  " + var5 + this.field1247[var3]) + 25;
						if (var10 > 450) {
							var10 = 450;
						}
						if (super.field23 < var10 + 4) {
							if (this.field1510 >= 1) {
								this.field1292[this.field1314] = "Report abuse @whi@" + var5;
								this.field1205[this.field1314] = 2524;
								this.field1314++;
							}
							this.field1292[this.field1314] = "Add ignore @whi@" + var5;
							this.field1205[this.field1314] = 2047;
							this.field1314++;
							this.field1292[this.field1314] = "Add friend @whi@" + var5;
							this.field1205[this.field1314] = 2605;
							this.field1314++;
						}
					}
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
				if ((var4 == 5 || var4 == 6) && this.field1625 < 2) {
					var2++;
					if (var2 >= 5) {
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(IBLz;)V")
	public final void method486(int arg0, ClientEntity arg2) {
		this.method487(arg2.field411, arg2.field410, arg0);
	}

	@ObfuscatedName("client.b(IZII)V")
	public final void method487(int arg0, int arg2, int arg3) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			this.field1298 = -1;
			this.field1299 = -1;
			return;
		}
		int var5 = this.method470(arg0, this.field1277, arg2) - arg3;
		int var6 = arg2 - this.field1266;
		int var7 = var5 - this.field1267;
		int var8 = arg0 - this.field1268;
		int var9 = Model.field602[this.field1269];
		int var10 = Model.field603[this.field1269];
		int var11 = Model.field602[this.field1270];
		int var12 = Model.field603[this.field1270];
		int var13 = var8 * var11 + var6 * var12 >> 16;
		int var14 = var8 * var12 - var6 * var11 >> 16;
		int var16 = var7 * var10 - var14 * var9 >> 16;
		int var17 = var7 * var9 + var14 * var10 >> 16;
		if (var17 >= 50) {
			this.field1298 = Pix3D.field641 + (var13 << 9) / var17;
			this.field1299 = Pix3D.field642 + (var16 << 9) / var17;
		} else {
			this.field1298 = -1;
			this.field1299 = -1;
		}
	}

	@ObfuscatedName("client.a(IIIIIIIIIZII)Z")
	public final boolean method488(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
		byte var13 = 104;
		byte var14 = 104;
		for (int var15 = 0; var15 < var13; var15++) {
			for (int var16 = 0; var16 < var14; var16++) {
				this.field1396[var15][var16] = 0;
				this.field1357[var15][var16] = 99999999;
			}
		}
		int var17 = arg7;
		int var18 = arg6;
		this.field1396[arg7][arg6] = 99;
		this.field1357[arg7][arg6] = 0;
		byte var19 = 0;
		int var20 = 0;
		this.field1529[var19] = arg7;
		int var36 = var19 + 1;
		this.field1530[var19] = arg6;
		boolean var21 = false;
		int var22 = this.field1529.length;
		int[][] var23 = this.field1233[this.field1277].field1075;
		while (var20 != var36) {
			var17 = this.field1529[var20];
			var18 = this.field1530[var20];
			var20 = (var20 + 1) % var22;
			if (var17 == arg4 && var18 == arg8) {
				var21 = true;
				break;
			}
			if (arg11 != 0) {
				if ((arg11 < 5 || arg11 == 10) && this.field1233[this.field1277].method370(arg2, arg4, var18, arg8, arg11 - 1, var17)) {
					var21 = true;
					break;
				}
				if (arg11 < 10 && this.field1233[this.field1277].method371(arg4, var18, arg11 - 1, arg2, var17, arg8)) {
					var21 = true;
					break;
				}
			}
			if (arg10 != 0 && arg1 != 0 && this.field1233[this.field1277].method372(arg10, var17, arg0, arg4, var18, arg1, arg8)) {
				var21 = true;
				break;
			}
			int var24 = this.field1357[var17][var18] + 1;
			if (var17 > 0 && this.field1396[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 0x280108) == 0) {
				this.field1529[var36] = var17 - 1;
				this.field1530[var36] = var18;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 - 1][var18] = 2;
				this.field1357[var17 - 1][var18] = var24;
			}
			if (var17 < var13 - 1 && this.field1396[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 0x280180) == 0) {
				this.field1529[var36] = var17 + 1;
				this.field1530[var36] = var18;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 + 1][var18] = 8;
				this.field1357[var17 + 1][var18] = var24;
			}
			if (var18 > 0 && this.field1396[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.field1529[var36] = var17;
				this.field1530[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17][var18 - 1] = 1;
				this.field1357[var17][var18 - 1] = var24;
			}
			if (var18 < var14 - 1 && this.field1396[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.field1529[var36] = var17;
				this.field1530[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17][var18 + 1] = 4;
				this.field1357[var17][var18 + 1] = var24;
			}
			if (var17 > 0 && var18 > 0 && this.field1396[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 0x28010E) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.field1529[var36] = var17 - 1;
				this.field1530[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 - 1][var18 - 1] = 3;
				this.field1357[var17 - 1][var18 - 1] = var24;
			}
			if (var17 < var13 - 1 && var18 > 0 && this.field1396[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 0x280183) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 - 1] & 0x280102) == 0) {
				this.field1529[var36] = var17 + 1;
				this.field1530[var36] = var18 - 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 + 1][var18 - 1] = 9;
				this.field1357[var17 + 1][var18 - 1] = var24;
			}
			if (var17 > 0 && var18 < var14 - 1 && this.field1396[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 0x280138) == 0 && (var23[var17 - 1][var18] & 0x280108) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.field1529[var36] = var17 - 1;
				this.field1530[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 - 1][var18 + 1] = 6;
				this.field1357[var17 - 1][var18 + 1] = var24;
			}
			if (var17 < var13 - 1 && var18 < var14 - 1 && this.field1396[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 0x2801E0) == 0 && (var23[var17 + 1][var18] & 0x280180) == 0 && (var23[var17][var18 + 1] & 0x280120) == 0) {
				this.field1529[var36] = var17 + 1;
				this.field1530[var36] = var18 + 1;
				var36 = (var36 + 1) % var22;
				this.field1396[var17 + 1][var18 + 1] = 12;
				this.field1357[var17 + 1][var18 + 1] = var24;
			}
		}
		this.field1291 = 0;
		if (!var21) {
			if (arg9) {
				int var25 = 100;
				for (int var26 = 1; var26 < 2; var26++) {
					for (int var27 = arg4 - var26; var27 <= arg4 + var26; var27++) {
						for (int var28 = arg8 - var26; var28 <= arg8 + var26; var28++) {
							if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && this.field1357[var27][var28] < var25) {
								var25 = this.field1357[var27][var28];
								var17 = var27;
								var18 = var28;
								this.field1291 = 1;
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
		this.field1529[var29] = var17;
		int var37 = var29 + 1;
		this.field1530[var29] = var18;
		int var30;
		int var31 = var30 = this.field1396[var17][var18];
		while (var17 != arg7 || var18 != arg6) {
			if (var31 != var30) {
				var30 = var31;
				this.field1529[var37] = var17;
				this.field1530[var37++] = var18;
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
			var31 = this.field1396[var17][var18];
		}
		if (var37 > 0) {
			int var32 = var37;
			if (var37 > 25) {
				var32 = 25;
			}
			var37--;
			int var33 = this.field1529[var37];
			int var34 = this.field1530[var37];
			if (arg5 == 0) {
				this.field1543.method228(6);
				this.field1543.method229(var32 + var32 + 3);
			}
			if (arg5 == 1) {
				this.field1543.method228(220);
				this.field1543.method229(var32 + var32 + 3 + 14);
			}
			if (arg5 == 2) {
				this.field1543.method228(127);
				this.field1543.method229(var32 + var32 + 3);
			}
			if (super.field33[5] == 1) {
				this.field1543.method229(1);
			} else {
				this.field1543.method229(0);
			}
			this.field1543.method230(var33 + this.field1487);
			this.field1543.method230(var34 + this.field1488);
			this.field1301 = this.field1529[0];
			this.field1302 = this.field1530[0];
			for (int var35 = 1; var35 < var32; var35++) {
				var37--;
				this.field1543.method229(this.field1529[var37] - var33);
				this.field1543.method229(this.field1530[var37] - var34);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("client.s(I)V")
	public final void method489() {
		Graphics var2 = this.method11().getGraphics();
		var2.setColor(Color.black);
		var2.fillRect(0, 0, 765, 503);
		this.method4(this.field1316, 1);
		if (this.field1508) {
			this.field1627 = false;
			var2.setFont(new Font("Helvetica", 1, 16));
			var2.setColor(Color.yellow);
			byte var3 = 35;
			var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
			int var5 = var3 + 50;
			var2.setColor(Color.white);
			var2.drawString("To fix this try the following (in order):", 30, var5);
			int var6 = var5 + 50;
			var2.setColor(Color.white);
			var2.setFont(new Font("Helvetica", 1, 12));
			var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
			int var7 = var6 + 30;
			var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
			int var8 = var7 + 30;
			var2.drawString("3: Try using a different game-world", 30, var8);
			int var10 = var8 + 30;
			var2.drawString("4: Try rebooting your computer", 30, var10);
			int var12 = var10 + 30;
			var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var12);
		}
		if (this.field1194) {
			this.field1627 = false;
			var2.setFont(new Font("Helvetica", 1, 20));
			var2.setColor(Color.white);
			var2.drawString("Error - unable to load game!", 50, 50);
			var2.drawString("To play RuneScape make sure you play from", 50, 100);
			var2.drawString("http://www.runescape.com", 50, 150);
		}
		if (!this.field1410) {
			return;
		}
		this.field1627 = false;
		var2.setColor(Color.yellow);
		byte var4 = 35;
		var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var4);
		int var9 = var4 + 50;
		var2.setColor(Color.white);
		var2.drawString("To fix this try the following (in order):", 30, var9);
		int var11 = var9 + 50;
		var2.setColor(Color.white);
		var2.setFont(new Font("Helvetica", 1, 12));
		var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var11);
		int var13 = var11 + 30;
		var2.drawString("2: Try rebooting your computer, and reloading", 30, var13);
		int var14 = var13 + 30;
	}

	@ObfuscatedName("client.a(Lmb;II)V")
	public final void method490(Packet arg0, int arg1) {
		arg0.method249();
		int var4 = arg0.method250(8);
		if (var4 < this.field1220) {
			for (int var5 = var4; var5 < this.field1220; var5++) {
				this.field1454[this.field1453++] = this.field1221[var5];
			}
		}
		if (var4 > this.field1220) {
			signlink.reporterror(this.field1426 + " Too many npcs");
			throw new RuntimeException("eek");
		}
		this.field1220 = 0;
		for (int var6 = 0; var6 < var4; var6++) {
			int var7 = this.field1221[var6];
			ClientNpc var8 = this.field1219[var7];
			int var9 = arg0.method250(1);
			if (var9 == 0) {
				this.field1221[this.field1220++] = var7;
				var8.field455 = field1591;
			} else {
				int var10 = arg0.method250(2);
				if (var10 == 0) {
					this.field1221[this.field1220++] = var7;
					var8.field455 = field1591;
					this.field1382[this.field1381++] = var7;
				} else if (var10 == 1) {
					this.field1221[this.field1220++] = var7;
					var8.field455 = field1591;
					int var11 = arg0.method250(3);
					var8.method125(false, var11);
					int var12 = arg0.method250(1);
					if (var12 == 1) {
						this.field1382[this.field1381++] = var7;
					}
				} else if (var10 == 2) {
					this.field1221[this.field1220++] = var7;
					var8.field455 = field1591;
					int var13 = arg0.method250(3);
					var8.method125(true, var13);
					int var14 = arg0.method250(3);
					var8.method125(true, var14);
					int var15 = arg0.method250(1);
					if (var15 == 1) {
						this.field1382[this.field1381++] = var7;
					}
				} else if (var10 == 3) {
					this.field1454[this.field1453++] = var7;
				}
			}
		}
	}

	@ObfuscatedName("client.t(I)V")
	public void method491() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.field1363);
		if (this.field1415 != null) {
			System.out.println("Od-cycle:" + this.field1415.field847);
		}
		System.out.println("loop-cycle:" + field1591);
		System.out.println("draw-cycle:" + field1470);
		System.out.println("ptype:" + this.field1429);
		System.out.println("psize:" + this.field1428);
		if (this.field1607 != null) {
			this.field1607.method43();
		}
		super.field12 = true;
	}

	@ObfuscatedName("client.c(I)Ljava/awt/Component;")
	public final java.awt.Component method11() {
		if (signlink.mainapp != null) {
			return signlink.mainapp;
		} else {
			return this;
		}
	}

	@ObfuscatedName("client.a(Lmb;ZI)V")
	public final void method492(Packet arg0, int arg2) {
		while (arg0.field712 + 21 < arg2 * 8) {
			int var4 = arg0.method250(14);
			if (var4 == 16383) {
				break;
			}
			if (this.field1219[var4] == null) {
				this.field1219[var4] = new ClientNpc();
			}
			ClientNpc var5 = this.field1219[var4];
			this.field1221[this.field1220++] = var4;
			var5.field455 = field1591;
			var5.field465 = NpcType.method344(arg0.method250(11));
			var5.field414 = var5.field465.field987;
			var5.field458 = var5.field465.field1009;
			var5.field417 = var5.field465.field991;
			var5.field418 = var5.field465.field992;
			var5.field419 = var5.field465.field993;
			var5.field420 = var5.field465.field994;
			var5.field415 = var5.field465.field990;
			int var6 = arg0.method250(5);
			if (var6 > 15) {
				var6 -= 32;
			}
			int var7 = arg0.method250(5);
			if (var7 > 15) {
				var7 -= 32;
			}
			var5.method124(field1231.field461[0] + var7, field1231.field460[0] + var6, false);
			int var8 = arg0.method250(1);
			if (var8 == 1) {
				this.field1382[this.field1381++] = var4;
			}
		}
		arg0.method251();
	}

	@ObfuscatedName("client.u(I)V")
	public final void method493() {
		int var2 = this.field1346.method216("Choose Option");
		for (int var3 = 0; var3 < this.field1314; var3++) {
			int var4 = this.field1346.method216(this.field1292[var3]);
			if (var4 > var2) {
				var2 = var4;
			}
		}
		var2 += 8;
		int var5 = this.field1314 * 15 + 21;
		if (super.field30 > 4 && super.field31 > 4 && super.field30 < 516 && super.field31 < 338) {
			int var6 = super.field30 - 4 - var2 / 2;
			if (var6 + var2 > 512) {
				var6 = 512 - var2;
			}
			if (var6 < 0) {
				var6 = 0;
			}
			int var7 = super.field31 - 4;
			if (var7 + var5 > 334) {
				var7 = 334 - var5;
			}
			if (var7 < 0) {
				var7 = 0;
			}
			this.field1384 = true;
			this.field1214 = 0;
			this.field1215 = var6;
			this.field1216 = var7;
			this.field1217 = var2;
			this.field1218 = this.field1314 * 15 + 22;
		}
		if (super.field30 > 553 && super.field31 > 205 && super.field30 < 743 && super.field31 < 466) {
			int var8 = super.field30 - 553 - var2 / 2;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 + var2 > 190) {
				var8 = 190 - var2;
			}
			int var9 = super.field31 - 205;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 + var5 > 261) {
				var9 = 261 - var5;
			}
			this.field1384 = true;
			this.field1214 = 1;
			this.field1215 = var8;
			this.field1216 = var9;
			this.field1217 = var2;
			this.field1218 = this.field1314 * 15 + 22;
		}
		if (super.field30 <= 17 || super.field31 <= 357 || super.field30 >= 496 || super.field31 >= 453) {
			return;
		}
		int var10 = super.field30 - 17 - var2 / 2;
		if (var10 < 0) {
			var10 = 0;
		} else if (var10 + var2 > 479) {
			var10 = 479 - var2;
		}
		int var11 = super.field31 - 357;
		if (var11 < 0) {
			var11 = 0;
		} else if (var11 + var5 > 96) {
			var11 = 96 - var5;
		}
		this.field1384 = true;
		this.field1214 = 2;
		this.field1215 = var10;
		this.field1216 = var11;
		this.field1217 = var2;
		this.field1218 = this.field1314 * 15 + 22;
	}

	@ObfuscatedName("client.b(Z)V")
	public final void method8() {
		signlink.reporterror = false;
		try {
			if (this.field1607 != null) {
				this.field1607.method38();
			}
		} catch (Exception var2) {
		}
		this.field1607 = null;
		this.method453();
		if (this.field1644 != null) {
			this.field1644.field972 = false;
		}
		this.field1644 = null;
		this.field1415.method281();
		this.field1415 = null;
		this.field1543 = null;
		this.field1260 = null;
		this.field1319 = null;
		this.field1504 = null;
		this.field1472 = null;
		this.field1436 = null;
		this.field1505 = null;
		this.field1506 = null;
		this.field1276 = null;
		this.field1512 = null;
		this.field1325 = null;
		this.field1233 = null;
		this.field1396 = null;
		this.field1357 = null;
		this.field1529 = null;
		this.field1530 = null;
		this.field1634 = null;
		this.field1482 = null;
		this.field1483 = null;
		this.field1484 = null;
		this.field1485 = null;
		this.field1532 = null;
		this.field1533 = null;
		this.field1534 = null;
		this.field1560 = null;
		this.field1561 = null;
		this.field1562 = null;
		this.field1563 = null;
		this.field1564 = null;
		this.field1565 = null;
		this.field1566 = null;
		this.field1567 = null;
		this.field1568 = null;
		this.field1295 = null;
		this.field1296 = null;
		this.field1297 = null;
		this.field1280 = null;
		this.field1281 = null;
		this.field1282 = null;
		this.field1460 = null;
		this.field1399 = null;
		this.field1400 = null;
		this.field1401 = null;
		this.field1402 = null;
		this.field1403 = null;
		this.field1226 = null;
		this.field1227 = null;
		this.field1228 = null;
		this.field1229 = null;
		this.field1230 = null;
		this.field1300 = null;
		this.field1353 = null;
		this.field1559 = null;
		this.field1622 = null;
		this.field1570 = null;
		this.field1571 = null;
		this.field1572 = null;
		this.field1573 = null;
		this.field1473 = null;
		this.field1600 = null;
		this.field1586 = null;
		this.field1378 = null;
		this.field1380 = null;
		this.field1382 = null;
		this.field1383 = null;
		this.field1454 = null;
		this.field1219 = null;
		this.field1221 = null;
		this.field1406 = null;
		this.field1636 = null;
		this.field1451 = null;
		this.field1423 = null;
		this.field1203 = null;
		this.field1204 = null;
		this.field1205 = null;
		this.field1206 = null;
		this.field1292 = null;
		this.field1211 = null;
		this.field1208 = null;
		this.field1209 = null;
		this.field1202 = null;
		this.field1303 = null;
		this.field1257 = null;
		this.field1521 = null;
		this.field1553 = null;
		this.field1547 = null;
		this.field1548 = null;
		this.field1544 = null;
		this.field1545 = null;
		this.field1546 = null;
		this.field1549 = null;
		this.field1550 = null;
		this.field1551 = null;
		this.field1552 = null;
		this.method545();
		LocType.method333();
		NpcType.method343();
		ObjType.method349();
		FloType.field1077 = null;
		IdkType.field1091 = null;
		Component.field70 = null;
		UnkType.field1098 = null;
		SeqType.field1112 = null;
		SpotAnimType.field1132 = null;
		SpotAnimType.field1144 = null;
		VarpType.field1154 = null;
		super.field16 = null;
		ClientPlayer.field490 = null;
		Pix3D.method177();
		World3D.method63();
		Model.method135();
		AnimFrame.method60();
		System.gc();
	}

	@ObfuscatedName("client.c(II)V")
	public final void method494(int arg0) {
		if (field1242) {
			return;
		}
		if (Pix3D.field655[17] >= arg0) {
			Pix8 var3 = Pix3D.field649[17];
			int var4 = var3.field676 * var3.field677 - 1;
			int var5 = var3.field676 * this.field1464 * 2;
			byte[] var6 = var3.field674;
			byte[] var7 = this.field1634;
			for (int var8 = 0; var8 <= var4; var8++) {
				var7[var8] = var6[var8 - var5 & var4];
			}
			var3.field674 = var7;
			this.field1634 = var6;
			Pix3D.method184(17);
		}
		if (Pix3D.field655[24] < arg0) {
			return;
		}
		Pix8 var9 = Pix3D.field649[24];
		int var10 = var9.field676 * var9.field677 - 1;
		int var11 = var9.field676 * this.field1464 * 2;
		byte[] var12 = var9.field674;
		byte[] var13 = this.field1634;
		for (int var14 = 0; var14 <= var10; var14++) {
			var13[var14] = var12[var14 - var11 & var10];
		}
		var9.field674 = var13;
		this.field1634 = var12;
		Pix3D.method184(24);
		return;
	}

	@ObfuscatedName("client.v(I)V")
	public final void method495() {
		int var2 = this.field1306 * 128 + 64;
		int var3 = this.field1307 * 128 + 64;
		int var4 = this.method470(var3, this.field1277, var2) - this.field1308;
		if (this.field1266 < var2) {
			this.field1266 += this.field1309 + (var2 - this.field1266) * this.field1310 / 1000;
			if (this.field1266 > var2) {
				this.field1266 = var2;
			}
		}
		if (this.field1266 > var2) {
			this.field1266 -= this.field1309 + (this.field1266 - var2) * this.field1310 / 1000;
			if (this.field1266 < var2) {
				this.field1266 = var2;
			}
		}
		if (this.field1267 < var4) {
			this.field1267 += this.field1309 + (var4 - this.field1267) * this.field1310 / 1000;
			if (this.field1267 > var4) {
				this.field1267 = var4;
			}
		}
		if (this.field1267 > var4) {
			this.field1267 -= this.field1309 + (this.field1267 - var4) * this.field1310 / 1000;
			if (this.field1267 < var4) {
				this.field1267 = var4;
			}
		}
		if (this.field1268 < var3) {
			this.field1268 += this.field1309 + (var3 - this.field1268) * this.field1310 / 1000;
			if (this.field1268 > var3) {
				this.field1268 = var3;
			}
		}
		if (this.field1268 > var3) {
			this.field1268 -= this.field1309 + (this.field1268 - var3) * this.field1310 / 1000;
			if (this.field1268 < var3) {
				this.field1268 = var3;
			}
		}
		int var5 = this.field1577 * 128 + 64;
		int var6 = this.field1578 * 128 + 64;
		int var7 = this.method470(var6, this.field1277, var5) - this.field1579;
		int var8 = var5 - this.field1266;
		int var9 = var7 - this.field1267;
		int var10 = var6 - this.field1268;
		int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
		int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 0x7FF;
		int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 0x7FF;
		if (var12 < 128) {
			var12 = 128;
		}
		if (var12 > 383) {
			var12 = 383;
		}
		if (this.field1269 < var12) {
			this.field1269 += this.field1580 + (var12 - this.field1269) * this.field1581 / 1000;
			if (this.field1269 > var12) {
				this.field1269 = var12;
			}
		}
		if (this.field1269 > var12) {
			this.field1269 -= this.field1580 + (this.field1269 - var12) * this.field1581 / 1000;
			if (this.field1269 < var12) {
				this.field1269 = var12;
			}
		}
		int var14 = var13 - this.field1270;
		if (var14 > 1024) {
			var14 -= 2048;
		}
		if (var14 < -1024) {
			var14 += 2048;
		}
		if (var14 > 0) {
			this.field1270 += this.field1580 + var14 * this.field1581 / 1000;
			this.field1270 &= 0x7FF;
		}
		if (var14 < 0) {
			this.field1270 -= this.field1580 + -var14 * this.field1581 / 1000;
			this.field1270 &= 0x7FF;
		}
		int var15 = var13 - this.field1270;
		if (var15 > 1024) {
			var15 -= 2048;
		}
		if (var15 < -1024) {
			var15 += 2048;
		}
		if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
			this.field1270 = var13;
		}
	}

	@ObfuscatedName("client.w(I)V")
	public final void method496() {
		if (this.field1195 == 0 && this.field1387 == 0) {
			this.field1292[this.field1314] = "Walk here";
			this.field1205[this.field1314] = 718;
			this.field1203[this.field1314] = super.field23;
			this.field1204[this.field1314] = super.field24;
			this.field1314++;
		}
		int var2 = -1;
		for (int var3 = 0; var3 < Model.field600; var3++) {
			int var4 = Model.field601[var3];
			int var5 = var4 & 0x7F;
			int var6 = var4 >> 7 & 0x7F;
			int var7 = var4 >> 29 & 0x3;
			int var8 = var4 >> 14 & 0x7FFF;
			if (var4 != var2) {
				var2 = var4;
				if (var7 == 2 && this.field1325.method94(this.field1277, var5, var6, var4) >= 0) {
					LocType var9 = LocType.method334(var8);
					if (this.field1195 == 1) {
						this.field1292[this.field1314] = "Use " + this.field1199 + " with @cya@" + var9.field937;
						this.field1205[this.field1314] = 810;
						this.field1206[this.field1314] = var4;
						this.field1203[this.field1314] = var5;
						this.field1204[this.field1314] = var6;
						this.field1314++;
					} else if (this.field1387 != 1) {
						if (var9.field953 != null) {
							for (int var10 = 4; var10 >= 0; var10--) {
								if (var9.field953[var10] != null) {
									this.field1292[this.field1314] = var9.field953[var10] + " @cya@" + var9.field937;
									if (var10 == 0) {
										this.field1205[this.field1314] = 625;
									}
									if (var10 == 1) {
										this.field1205[this.field1314] = 721;
									}
									if (var10 == 2) {
										this.field1205[this.field1314] = 743;
									}
									if (var10 == 3) {
										this.field1205[this.field1314] = 357;
									}
									if (var10 == 4) {
										this.field1205[this.field1314] = 1071;
									}
									this.field1206[this.field1314] = var4;
									this.field1203[this.field1314] = var5;
									this.field1204[this.field1314] = var6;
									this.field1314++;
								}
							}
						}
						this.field1292[this.field1314] = "Examine @cya@" + var9.field937;
						this.field1205[this.field1314] = 1381;
						this.field1206[this.field1314] = var4;
						this.field1203[this.field1314] = var5;
						this.field1204[this.field1314] = var6;
						this.field1314++;
					} else if ((this.field1389 & 0x4) == 4) {
						this.field1292[this.field1314] = this.field1390 + " @cya@" + var9.field937;
						this.field1205[this.field1314] = 899;
						this.field1206[this.field1314] = var4;
						this.field1203[this.field1314] = var5;
						this.field1204[this.field1314] = var6;
						this.field1314++;
					}
				}
				if (var7 == 1) {
					ClientNpc var11 = this.field1219[var8];
					if (var11.field465.field987 == 1 && (var11.field410 & 0x7F) == 64 && (var11.field411 & 0x7F) == 64) {
						for (int var12 = 0; var12 < this.field1220; var12++) {
							ClientNpc var13 = this.field1219[this.field1221[var12]];
							if (var13 != null && var13 != var11 && var13.field465.field987 == 1 && var13.field410 == var11.field410 && var13.field411 == var11.field411) {
								this.method483(var5, var13.field465, this.field1221[var12], var6);
							}
						}
					}
					this.method483(var5, var11.field465, var8, var6);
				}
				if (var7 == 0) {
					ClientPlayer var14 = this.field1378[var8];
					if ((var14.field410 & 0x7F) == 64 && (var14.field411 & 0x7F) == 64) {
						for (int var15 = 0; var15 < this.field1220; var15++) {
							ClientNpc var16 = this.field1219[this.field1221[var15]];
							if (var16 != null && var16.field465.field987 == 1 && var16.field410 == var14.field410 && var16.field411 == var14.field411) {
								this.method483(var5, var16.field465, this.field1221[var15], var6);
							}
						}
						for (int var17 = 0; var17 < this.field1379; var17++) {
							ClientPlayer var18 = this.field1378[this.field1380[var17]];
							if (var18 != null && var18 != var14 && var18.field410 == var14.field410 && var18.field411 == var14.field411) {
								this.method439(var6, this.field1380[var17], var5, var18);
							}
						}
					}
					this.method439(var6, var8, var5, var14);
				}
				if (var7 == 3) {
					LinkList var19 = this.field1406[this.field1277][var5][var6];
					if (var19 != null) {
						for (ClientObj var20 = (ClientObj) var19.method259(); var20 != null; var20 = (ClientObj) var19.method261()) {
							ObjType var21 = ObjType.method350(var20.field501);
							if (this.field1195 == 1) {
								this.field1292[this.field1314] = "Use " + this.field1199 + " with @lre@" + var21.field1024;
								this.field1205[this.field1314] = 111;
								this.field1206[this.field1314] = var20.field501;
								this.field1203[this.field1314] = var5;
								this.field1204[this.field1314] = var6;
								this.field1314++;
							} else if (this.field1387 != 1) {
								for (int var22 = 4; var22 >= 0; var22--) {
									if (var21.field1038 != null && var21.field1038[var22] != null) {
										this.field1292[this.field1314] = var21.field1038[var22] + " @lre@" + var21.field1024;
										if (var22 == 0) {
											this.field1205[this.field1314] = 139;
										}
										if (var22 == 1) {
											this.field1205[this.field1314] = 778;
										}
										if (var22 == 2) {
											this.field1205[this.field1314] = 617;
										}
										if (var22 == 3) {
											this.field1205[this.field1314] = 224;
										}
										if (var22 == 4) {
											this.field1205[this.field1314] = 662;
										}
										this.field1206[this.field1314] = var20.field501;
										this.field1203[this.field1314] = var5;
										this.field1204[this.field1314] = var6;
										this.field1314++;
									} else if (var22 == 2) {
										this.field1292[this.field1314] = "Take @lre@" + var21.field1024;
										this.field1205[this.field1314] = 617;
										this.field1206[this.field1314] = var20.field501;
										this.field1203[this.field1314] = var5;
										this.field1204[this.field1314] = var6;
										this.field1314++;
									}
								}
								this.field1292[this.field1314] = "Examine @lre@" + var21.field1024;
								this.field1205[this.field1314] = 1152;
								this.field1206[this.field1314] = var20.field501;
								this.field1203[this.field1314] = var5;
								this.field1204[this.field1314] = var6;
								this.field1314++;
							} else if ((this.field1389 & 0x1) == 1) {
								this.field1292[this.field1314] = this.field1390 + " @lre@" + var21.field1024;
								this.field1205[this.field1314] = 370;
								this.field1206[this.field1314] = var20.field501;
								this.field1203[this.field1314] = var5;
								this.field1204[this.field1314] = var6;
								this.field1314++;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(ZLmb;I)V")
	public final void method497(Packet arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1381; var4++) {
			int var5 = this.field1382[var4];
			ClientPlayer var6 = this.field1378[var5];
			int var7 = arg1.method239();
			if ((var7 & 0x80) == 128) {
				var7 += arg1.method239() << 8;
			}
			this.method517(var7, arg1, var5, var6);
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public final DataInputStream method498(String arg0) throws IOException {
		return signlink.mainapp == null ? new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream()) : signlink.openurl(arg0);
	}

	@ObfuscatedName("client.x(I)V")
	public final void method499() {
		if (this.field1458 == 2) {
			this.method487((this.field1476 - this.field1488 << 7) + this.field1479, (this.field1475 - this.field1487 << 7) + this.field1478, this.field1477 * 2);
			if (this.field1298 > -1 && field1591 % 20 < 10) {
				this.field1559[2].method199(this.field1298 - 12, this.field1299 - 28);
			}
		}
	}

	@ObfuscatedName("client.a(Ld;Z)V")
	public final void method500(Component arg0) {
		int var3 = arg0.field79;
		if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
			if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
				int var5 = this.field1609;
				if (this.field1610 != 2) {
					var5 = 0;
				}
				if (var3 > 800) {
					var3 -= 701;
				} else {
					var3 -= 101;
				}
				if (var3 >= var5) {
					arg0.field111 = "";
					arg0.field78 = 0;
				} else {
					if (this.field1553[var3] == 0) {
						arg0.field111 = "@red@Offline";
					} else if (this.field1553[var3] == field1239) {
						arg0.field111 = "@gre@World-" + (this.field1553[var3] - 9);
					} else {
						arg0.field111 = "@yel@World-" + (this.field1553[var3] - 9);
					}
					arg0.field78 = 1;
				}
			} else if (var3 == 203) {
				int var6 = this.field1609;
				if (this.field1610 != 2) {
					var6 = 0;
				}
				arg0.field89 = var6 * 15 + 20;
				if (arg0.field89 <= arg0.field81) {
					arg0.field89 = arg0.field81 + 1;
				}
			} else if (var3 >= 401 && var3 <= 500) {
				var3 -= 401;
				if (var3 >= this.field1646) {
					arg0.field111 = "";
					arg0.field78 = 0;
				} else {
					arg0.field111 = JString.method314(JString.method311(this.field1515[var3]));
					arg0.field78 = 1;
				}
			} else if (var3 == 503) {
				arg0.field89 = this.field1646 * 15 + 20;
				if (arg0.field89 <= arg0.field81) {
					arg0.field89 = arg0.field81 + 1;
				}
			} else if (var3 == 327) {
				arg0.field126 = 150;
				arg0.field127 = (int) (Math.sin((double) field1591 / 40.0D) * 256.0D) & 0x7FF;
				if (this.field1438) {
					for (int var7 = 0; var7 < 7; var7++) {
						int var8 = this.field1327[var7];
						if (var8 >= 0 && !IdkType.field1091[var8].method379()) {
							return;
						}
					}
					this.field1438 = false;
					Model[] var9 = new Model[7];
					int var10 = 0;
					for (int var11 = 0; var11 < 7; var11++) {
						int var12 = this.field1327[var11];
						if (var12 >= 0) {
							var9[var10++] = IdkType.field1091[var12].method380();
						}
					}
					Model var13 = new Model(var9, var10);
					for (int var14 = 0; var14 < 5; var14++) {
						if (this.field1514[var14] != 0) {
							var13.method153(field1538[var14][0], field1538[var14][this.field1514[var14]]);
							if (var14 == 1) {
								var13.method153(field1271[0], field1271[this.field1514[var14]]);
							}
						}
					}
					var13.method146();
					var13.method147(SeqType.field1112[field1231.field415].field1114[0]);
					var13.method156(64, 850, -30, -50, -30, true);
					arg0.field119 = 5;
					arg0.field120 = 0;
					Component.method36(0, var13, 5);
				}
			} else if (var3 == 324) {
				if (this.field1262 == null) {
					this.field1262 = arg0.field117;
					this.field1263 = arg0.field118;
				}
				if (this.field1494) {
					arg0.field117 = this.field1263;
				} else {
					arg0.field117 = this.field1262;
				}
			} else if (var3 == 325) {
				if (this.field1262 == null) {
					this.field1262 = arg0.field117;
					this.field1263 = arg0.field118;
				}
				if (this.field1494) {
					arg0.field117 = this.field1262;
				} else {
					arg0.field117 = this.field1263;
				}
			} else if (var3 == 600) {
				arg0.field111 = this.field1444;
				if (field1591 % 20 < 10) {
					arg0.field111 = arg0.field111 + "|";
				} else {
					arg0.field111 = arg0.field111 + " ";
				}
			} else {
				if (var3 == 613) {
					if (this.field1510 < 1) {
						arg0.field111 = "";
					} else if (this.field1623) {
						arg0.field113 = 16711680;
						arg0.field111 = "Moderator option: Mute player for 48 hours: <ON>";
					} else {
						arg0.field113 = 16777215;
						arg0.field111 = "Moderator option: Mute player for 48 hours: <OFF>";
					}
				}
				if (var3 == 650 || var3 == 655) {
					if (this.field1304 == 0) {
						arg0.field111 = "";
					} else {
						String var15;
						if (this.field1313 == 0) {
							var15 = "earlier today";
						} else if (this.field1313 == 1) {
							var15 = "yesterday";
						} else {
							var15 = this.field1313 + " days ago";
						}
						arg0.field111 = "You last logged in " + var15 + " from: " + signlink.dns;
					}
				}
				if (var3 == 651) {
					if (this.field1324 == 0) {
						arg0.field111 = "0 unread messages";
						arg0.field113 = 16776960;
					}
					if (this.field1324 == 1) {
						arg0.field111 = "1 unread message";
						arg0.field113 = 65280;
					}
					if (this.field1324 > 1) {
						arg0.field111 = this.field1324 + " unread messages";
						arg0.field113 = 65280;
					}
				}
				if (var3 == 652) {
					if (this.field1631 == 201) {
						if (this.field1526 == 1) {
							arg0.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
						} else {
							arg0.field111 = "";
						}
					} else if (this.field1631 == 200) {
						arg0.field111 = "You have not yet set any password recovery questions.";
					} else {
						String var16;
						if (this.field1631 == 0) {
							var16 = "Earlier today";
						} else if (this.field1631 == 1) {
							var16 = "Yesterday";
						} else {
							var16 = this.field1631 + " days ago";
						}
						arg0.field111 = var16 + " you changed your recovery questions";
					}
				}
				if (var3 == 653) {
					if (this.field1631 == 201) {
						if (this.field1526 == 1) {
							arg0.field111 = "@whi@recommend you use a members world instead. You may use";
						} else {
							arg0.field111 = "";
						}
					} else if (this.field1631 == 200) {
						arg0.field111 = "We strongly recommend you do so now to secure your account.";
					} else {
						arg0.field111 = "If you do not remember making this change then cancel it immediately";
					}
				}
				if (var3 == 654) {
					if (this.field1631 == 201) {
						if (this.field1526 == 1) {
							arg0.field111 = "@whi@this world but member benefits are unavailabe whilst here.";
						} else {
							arg0.field111 = "";
						}
					} else if (this.field1631 == 200) {
						arg0.field111 = "Do this from the 'account management' area on our front webpage";
					} else {
						arg0.field111 = "Do this from the 'account management' area on our front webpage";
					}
				}
			}
		} else if (var3 == 1 && this.field1610 == 0) {
			arg0.field111 = "Loading friend list";
			arg0.field78 = 0;
		} else if (var3 == 1 && this.field1610 == 1) {
			arg0.field111 = "Connecting to friendserver";
			arg0.field78 = 0;
		} else if (var3 == 2 && this.field1610 != 2) {
			arg0.field111 = "Please wait...";
			arg0.field78 = 0;
		} else {
			int var4 = this.field1609;
			if (this.field1610 != 2) {
				var4 = 0;
			}
			if (var3 > 700) {
				var3 -= 601;
			} else {
				var3--;
			}
			if (var3 >= var4) {
				arg0.field111 = "";
				arg0.field78 = 0;
			} else {
				arg0.field111 = this.field1257[var3];
				arg0.field78 = 1;
			}
		}
	}

	@ObfuscatedName("client.a(ILmb;I)V")
	public final void method501(int arg0, Packet arg1, int arg2) {
		if (arg2 <= 0) {
			arg0 = arg1.method239();
		}
		if (arg0 == 70 || arg0 == 88) {
			int var4 = arg1.method239();
			int var5 = this.field1603 + (var4 >> 4 & 0x7);
			int var6 = this.field1604 + (var4 & 0x7);
			int var7 = arg1.method239();
			int var8 = var7 >> 2;
			int var9 = var7 & 0x3;
			int var10 = this.field1503[var8];
			int var11;
			if (arg0 == 88) {
				var11 = -1;
			} else {
				var11 = arg1.method241();
			}
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				this.method542(this.field1277, var5, 0, var11, var8, var10, -1, var6, var9);
			}
		} else if (arg0 == 30) {
			int var12 = arg1.method239();
			int var13 = this.field1603 + (var12 >> 4 & 0x7);
			int var14 = this.field1604 + (var12 & 0x7);
			int var15 = arg1.method239();
			int var16 = var15 >> 2;
			int var17 = var15 & 0x3;
			int var18 = this.field1503[var16];
			int var19 = arg1.method241();
			if (var13 >= 0 && var14 >= 0 && var13 < 103 && var14 < 103) {
				int var20 = this.field1276[this.field1277][var13][var14];
				int var21 = this.field1276[this.field1277][var13 + 1][var14];
				int var22 = this.field1276[this.field1277][var13 + 1][var14 + 1];
				int var23 = this.field1276[this.field1277][var13][var14 + 1];
				if (var18 == 0) {
					Wall var24 = this.field1325.method86(this.field1277, var13, var14);
					if (var24 != null) {
						int var25 = var24.field287 >> 14 & 0x7FFF;
						if (var16 == 2) {
							var24.field285 = new ClientLocAnim(2, var17 + 4, var20, var25, var22, var23, false, var19, var21);
							var24.field286 = new ClientLocAnim(2, var17 + 1 & 0x3, var20, var25, var22, var23, false, var19, var21);
						} else {
							var24.field285 = new ClientLocAnim(var16, var17, var20, var25, var22, var23, false, var19, var21);
						}
					}
				}
				if (var18 == 1) {
					Decor var26 = this.field1325.method87(var13, var14, this.field1277);
					if (var26 != null) {
						var26.field177 = new ClientLocAnim(4, 0, var20, var26.field178 >> 14 & 0x7FFF, var22, var23, false, var19, var21);
					}
				}
				if (var18 == 2) {
					Sprite var27 = this.field1325.method88(var13, var14, this.field1277);
					if (var16 == 11) {
						var16 = 10;
					}
					if (var27 != null) {
						var27.field270 = new ClientLocAnim(var16, var17, var20, var27.field278 >> 14 & 0x7FFF, var22, var23, false, var19, var21);
					}
				}
				if (var18 == 3) {
					GroundDecor var28 = this.field1325.method89(this.field1277, var13, var14);
					if (var28 != null) {
						var28.field209 = new ClientLocAnim(22, var17, var20, var28.field210 >> 14 & 0x7FFF, var22, var23, false, var19, var21);
					}
				}
			}
		} else if (arg0 == 120) {
			int var29 = arg1.method239();
			int var30 = this.field1603 + (var29 >> 4 & 0x7);
			int var31 = this.field1604 + (var29 & 0x7);
			int var32 = arg1.method241();
			int var33 = arg1.method241();
			if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
				ClientObj var34 = new ClientObj();
				var34.field501 = var32;
				var34.field502 = var33;
				if (this.field1406[this.field1277][var30][var31] == null) {
					this.field1406[this.field1277][var30][var31] = new LinkList();
				}
				this.field1406[this.field1277][var30][var31].method255(var34);
				this.method529(var30, var31);
			}
		} else if (arg0 == 115) {
			int var35 = arg1.method239();
			int var36 = this.field1603 + (var35 >> 4 & 0x7);
			int var37 = this.field1604 + (var35 & 0x7);
			int var38 = arg1.method241();
			if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
				LinkList var39 = this.field1406[this.field1277][var36][var37];
				if (var39 != null) {
					for (ClientObj var40 = (ClientObj) var39.method258(); var40 != null; var40 = (ClientObj) var39.method260()) {
						if (var40.field501 == (var38 & 0x7FFF)) {
							var40.method120();
							break;
						}
					}
					if (var39.method258() == null) {
						this.field1406[this.field1277][var36][var37] = null;
					}
					this.method529(var36, var37);
				}
			}
		} else if (arg0 == 37) {
			int var41 = arg1.method239();
			int var42 = this.field1603 + (var41 >> 4 & 0x7);
			int var43 = this.field1604 + (var41 & 0x7);
			int var44 = var42 + arg1.method240();
			int var45 = var43 + arg1.method240();
			int var46 = arg1.method242();
			int var47 = arg1.method241();
			int var48 = arg1.method239() * 4;
			int var49 = arg1.method239() * 4;
			int var50 = arg1.method241();
			int var51 = arg1.method241();
			int var52 = arg1.method239();
			int var53 = arg1.method239();
			if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
				int var54 = var42 * 128 + 64;
				int var55 = var43 * 128 + 64;
				int var56 = var44 * 128 + 64;
				int var57 = var45 * 128 + 64;
				ClientProj var58 = new ClientProj(this.field1277, var47, var50 + field1591, var51 + field1591, this.method470(var55, this.field1277, var54) - var48, var49, var54, var52, var46, var55, var53);
				var58.method133(var57, this.method470(var57, this.field1277, var56) - var49, var56, var50 + field1591);
				this.field1451.method255(var58);
			}
		} else if (arg0 == 114) {
			int var59 = arg1.method239();
			int var60 = this.field1603 + (var59 >> 4 & 0x7);
			int var61 = this.field1604 + (var59 & 0x7);
			int var62 = arg1.method241();
			int var63 = arg1.method239();
			int var64 = arg1.method241();
			if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
				int var65 = var60 * 128 + 64;
				int var66 = var61 * 128 + 64;
				MapSpotAnim var67 = new MapSpotAnim(this.method470(var66, this.field1277, var65) - var63, field1591, var66, this.field1277, var65, var62, var64);
				this.field1423.method255(var67);
			}
		} else if (arg0 == 8) {
			int var68 = arg1.method239();
			int var69 = this.field1603 + (var68 >> 4 & 0x7);
			int var70 = this.field1604 + (var68 & 0x7);
			int var71 = arg1.method241();
			int var72 = arg1.method241();
			int var73 = arg1.method241();
			if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var73 != this.field1542) {
				ClientObj var74 = new ClientObj();
				var74.field501 = var71;
				var74.field502 = var72;
				if (this.field1406[this.field1277][var69][var70] == null) {
					this.field1406[this.field1277][var69][var70] = new LinkList();
				}
				this.field1406[this.field1277][var69][var70].method255(var74);
				this.method529(var69, var70);
			}
		} else {
			if (arg0 == 218) {
				int var75 = arg1.method239();
				int var76 = this.field1603 + (var75 >> 4 & 0x7);
				int var77 = this.field1604 + (var75 & 0x7);
				int var78 = arg1.method239();
				int var79 = var78 >> 2;
				int var80 = var78 & 0x3;
				int var81 = this.field1503[var79];
				int var82 = arg1.method241();
				int var83 = arg1.method241();
				int var84 = arg1.method241();
				int var85 = arg1.method241();
				byte var86 = arg1.method240();
				byte var87 = arg1.method240();
				byte var88 = arg1.method240();
				byte var89 = arg1.method240();
				ClientPlayer var90;
				if (var85 == this.field1542) {
					var90 = field1231;
				} else {
					var90 = this.field1378[var85];
				}
				if (var90 != null) {
					LocType var91 = LocType.method334(var82);
					int var92 = this.field1276[this.field1277][var76][var77];
					int var93 = this.field1276[this.field1277][var76 + 1][var77];
					int var94 = this.field1276[this.field1277][var76 + 1][var77 + 1];
					int var95 = this.field1276[this.field1277][var76][var77 + 1];
					Model var96 = var91.method340(var79, var80, var92, var93, var94, var95, -1);
					if (var96 != null) {
						this.method542(this.field1277, var76, var83 + 1, -1, 0, var81, var84 + 1, var77, 0);
						var90.field477 = var83 + field1591;
						var90.field478 = var84 + field1591;
						var90.field482 = var96;
						int var97 = var91.field941;
						int var98 = var91.field942;
						if (var80 == 1 || var80 == 3) {
							var97 = var91.field942;
							var98 = var91.field941;
						}
						var90.field479 = var76 * 128 + var97 * 64;
						var90.field481 = var77 * 128 + var98 * 64;
						var90.field480 = this.method470(var90.field481, this.field1277, var90.field479);
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
						var90.field483 = var76 + var86;
						var90.field485 = var76 + var88;
						var90.field484 = var77 + var87;
						var90.field486 = var77 + var89;
					}
				}
			}
			if (arg0 == 98) {
				int var101 = arg1.method239();
				int var102 = this.field1603 + (var101 >> 4 & 0x7);
				int var103 = this.field1604 + (var101 & 0x7);
				int var104 = arg1.method241();
				int var105 = arg1.method241();
				int var106 = arg1.method241();
				if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
					LinkList var107 = this.field1406[this.field1277][var102][var103];
					if (var107 != null) {
						for (ClientObj var108 = (ClientObj) var107.method258(); var108 != null; var108 = (ClientObj) var107.method260()) {
							if (var108.field501 == (var104 & 0x7FFF) && var108.field502 == var105) {
								var108.field502 = var106;
								break;
							}
						}
						this.method529(var102, var103);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(B)V")
	public final void method502() {
		if (super.field29 != 1) {
			return;
		}
		int var3 = super.field30 - 25 - 550;
		int var4 = super.field31 - 5 - 4;
		if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
			return;
		}
		var3 -= 73;
		var4 -= 75;
		int var5 = this.field1253 + this.field1278 & 0x7FF;
		int var6 = Pix3D.field645[var5];
		int var7 = Pix3D.field646[var5];
		int var8 = var6 * (this.field1348 + 256) >> 8;
		int var9 = var7 * (this.field1348 + 256) >> 8;
		int var10 = var4 * var8 + var3 * var9 >> 11;
		int var11 = var4 * var9 - var3 * var8 >> 11;
		int var12 = field1231.field410 + var10 >> 7;
		int var13 = field1231.field411 - var11 >> 7;
		boolean var14 = this.method488(0, 0, 0, var12, 1, field1231.field461[0], field1231.field460[0], var13, true, 0, 0);
		if (!var14) {
			return;
		}
		this.field1543.method229(var3);
		this.field1543.method229(var4);
		this.field1543.method230(this.field1253);
		this.field1543.method229(57);
		this.field1543.method229(this.field1278);
		this.field1543.method229(this.field1348);
		this.field1543.method229(89);
		this.field1543.method230(field1231.field410);
		this.field1543.method230(field1231.field411);
		this.field1543.method229(this.field1291);
		this.field1543.method229(63);
		return;
	}

	@ObfuscatedName("client.b(ILmb;I)V")
	public final void method503(Packet arg1, int arg2) {
		this.field1453 = 0;
		this.field1381 = 0;
		this.method490(arg1, arg2);
		this.method492(arg1, arg2);
		this.method476(arg2, arg1);
		for (int var4 = 0; var4 < this.field1453; var4++) {
			int var5 = this.field1454[var4];
			if (this.field1219[var5].field455 != field1591) {
				this.field1219[var5].field465 = null;
				this.field1219[var5] = null;
			}
		}
		if (arg1.field711 != arg2) {
			signlink.reporterror(this.field1426 + " size mismatch in getnpcpos - pos:" + arg1.field711 + " psize:" + arg2);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.field1220; var6++) {
			if (this.field1219[this.field1221[var6]] == null) {
				signlink.reporterror(this.field1426 + " null entry in npc list - pos:" + var6 + " size:" + this.field1220);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.a(JB)V")
	public final void method504(long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (this.field1609 >= 100 && this.field1492 != 1) {
			this.method515("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else if (this.field1609 >= 200) {
			this.method515("", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
		} else {
			String var4 = JString.method314(JString.method311(arg0));
			for (int var5 = 0; var5 < this.field1609; var5++) {
				if (this.field1521[var5] == arg0) {
					this.method515("", 0, var4 + " is already on your friend list");
					return;
				}
			}
			for (int var6 = 0; var6 < this.field1646; var6++) {
				if (this.field1515[var6] == arg0) {
					this.method515("", 0, "Please remove " + var4 + " from your ignore list first");
					return;
				}
			}
			if (!var4.equals(field1231.field468)) {
				this.field1257[this.field1609] = var4;
				this.field1521[this.field1609] = arg0;
				this.field1553[this.field1609] = 0;
				this.field1609++;
				this.field1200 = true;
				this.field1543.method228(9);
				this.field1543.method235(arg0);
			}
		}
	}

	@ObfuscatedName("client.a([BII)Z")
	public final boolean method505(byte[] arg0, int arg1) {
		return arg0 == null ? true : signlink.wavesave(arg0, arg1);
	}

	@ObfuscatedName("client.y(I)V")
	public final void method506() {
		for (int var2 = 0; var2 < this.field1220; var2++) {
			int var3 = this.field1221[var2];
			ClientNpc var4 = this.field1219[var3];
			if (var4 != null) {
				this.method507(var4, var4.field465.field987);
			}
		}
	}

	@ObfuscatedName("client.a(BLz;I)V")
	public final void method507(ClientEntity arg1, int arg2) {
		if (arg1.field410 < 128 || arg1.field411 < 128 || arg1.field410 >= 13184 || arg1.field411 >= 13184) {
			arg1.field438 = -1;
			arg1.field443 = -1;
			arg1.field452 = 0;
			arg1.field453 = 0;
			arg1.field410 = arg1.field460[0] * 128 + arg1.field414 * 64;
			arg1.field411 = arg1.field461[0] * 128 + arg1.field414 * 64;
			arg1.method126();
		}
		if (arg1 == field1231 && (arg1.field410 < 1536 || arg1.field411 < 1536 || arg1.field410 >= 11776 || arg1.field411 >= 11776)) {
			arg1.field438 = -1;
			arg1.field443 = -1;
			arg1.field452 = 0;
			arg1.field453 = 0;
			arg1.field410 = arg1.field460[0] * 128 + arg1.field414 * 64;
			arg1.field411 = arg1.field461[0] * 128 + arg1.field414 * 64;
			arg1.method126();
		}
		if (arg1.field452 > field1591) {
			this.method508(arg1);
		} else if (arg1.field453 >= field1591) {
			this.method509(arg1);
		} else {
			this.method510(arg1);
		}
		this.method511(arg1);
		this.method512(arg1);
	}

	@ObfuscatedName("client.a(Lz;B)V")
	public final void method508(ClientEntity arg0) {
		int var4 = arg0.field452 - field1591;
		int var5 = arg0.field448 * 128 + arg0.field414 * 64;
		int var6 = arg0.field450 * 128 + arg0.field414 * 64;
		arg0.field410 += (var5 - arg0.field410) / var4;
		arg0.field411 += (var6 - arg0.field411) / var4;
		arg0.field463 = 0;
		if (arg0.field454 == 0) {
			arg0.field457 = 1024;
		}
		if (arg0.field454 == 1) {
			arg0.field457 = 1536;
		}
		if (arg0.field454 == 2) {
			arg0.field457 = 0;
		}
		if (arg0.field454 == 3) {
			arg0.field457 = 512;
		}
	}

	@ObfuscatedName("client.a(BLz;)V")
	public final void method509(ClientEntity arg1) {
		if (arg1.field453 == field1591 || arg1.field438 == -1 || arg1.field441 != 0 || arg1.field440 + 1 > SeqType.field1112[arg1.field438].method384(arg1.field439)) {
			int var3 = arg1.field453 - arg1.field452;
			int var4 = field1591 - arg1.field452;
			int var5 = arg1.field448 * 128 + arg1.field414 * 64;
			int var6 = arg1.field450 * 128 + arg1.field414 * 64;
			int var7 = arg1.field449 * 128 + arg1.field414 * 64;
			int var8 = arg1.field451 * 128 + arg1.field414 * 64;
			arg1.field410 = (var5 * (var3 - var4) + var7 * var4) / var3;
			arg1.field411 = (var6 * (var3 - var4) + var8 * var4) / var3;
		}
		arg1.field463 = 0;
		if (arg1.field454 == 0) {
			arg1.field457 = 1024;
		}
		if (arg1.field454 == 1) {
			arg1.field457 = 1536;
		}
		if (arg1.field454 == 2) {
			arg1.field457 = 0;
		}
		if (arg1.field454 == 3) {
			arg1.field457 = 512;
		}
		arg1.field412 = arg1.field457;
	}

	@ObfuscatedName("client.a(Lz;I)V")
	public final void method510(ClientEntity arg0) {
		arg0.field435 = arg0.field415;
		if (arg0.field459 == 0) {
			arg0.field463 = 0;
			return;
		}
		if (arg0.field438 != -1 && arg0.field441 == 0) {
			SeqType var3 = SeqType.field1112[arg0.field438];
			if (arg0.field464 > 0 && var3.field1124 == 0) {
				arg0.field463++;
				return;
			}
			if (arg0.field464 <= 0 && var3.field1125 == 0) {
				arg0.field463++;
				return;
			}
		}
		int var4 = arg0.field410;
		int var5 = arg0.field411;
		int var6 = arg0.field460[arg0.field459 - 1] * 128 + arg0.field414 * 64;
		int var7 = arg0.field461[arg0.field459 - 1] * 128 + arg0.field414 * 64;
		if (var6 - var4 > 256 || var6 - var4 < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
			arg0.field410 = var6;
			arg0.field411 = var7;
			return;
		}
		if (var4 < var6) {
			if (var5 < var7) {
				arg0.field457 = 1280;
			} else if (var5 > var7) {
				arg0.field457 = 1792;
			} else {
				arg0.field457 = 1536;
			}
		} else if (var4 > var6) {
			if (var5 < var7) {
				arg0.field457 = 768;
			} else if (var5 > var7) {
				arg0.field457 = 256;
			} else {
				arg0.field457 = 512;
			}
		} else if (var5 < var7) {
			arg0.field457 = 1024;
		} else {
			arg0.field457 = 0;
		}
		int var8 = arg0.field457 - arg0.field412 & 0x7FF;
		if (var8 > 1024) {
			var8 -= 2048;
		}
		int var9 = arg0.field418;
		if (var8 >= -256 && var8 <= 256) {
			var9 = arg0.field417;
		} else if (var8 >= 256 && var8 < 768) {
			var9 = arg0.field420;
		} else if (var8 >= -768 && var8 <= -256) {
			var9 = arg0.field419;
		}
		if (var9 == -1) {
			var9 = arg0.field417;
		}
		arg0.field435 = var9;
		int var10 = 4;
		if (arg0.field412 != arg0.field457 && arg0.field432 == -1 && arg0.field458 != 0) {
			var10 = 2;
		}
		if (arg0.field459 > 2) {
			var10 = 6;
		}
		if (arg0.field459 > 3) {
			var10 = 8;
		}
		if (arg0.field463 > 0 && arg0.field459 > 1) {
			var10 = 8;
			arg0.field463--;
		}
		if (arg0.field462[arg0.field459 - 1]) {
			var10 <<= 0x1;
		}
		if (var10 >= 8 && arg0.field435 == arg0.field417 && arg0.field421 != -1) {
			arg0.field435 = arg0.field421;
		}
		if (var4 < var6) {
			arg0.field410 += var10;
			if (arg0.field410 > var6) {
				arg0.field410 = var6;
			}
		} else if (var4 > var6) {
			arg0.field410 -= var10;
			if (arg0.field410 < var6) {
				arg0.field410 = var6;
			}
		}
		if (var5 < var7) {
			arg0.field411 += var10;
			if (arg0.field411 > var7) {
				arg0.field411 = var7;
			}
		} else if (var5 > var7) {
			arg0.field411 -= var10;
			if (arg0.field411 < var7) {
				arg0.field411 = var7;
			}
		}
		if (arg0.field410 != var6 || arg0.field411 != var7) {
			return;
		}
		arg0.field459--;
		if (arg0.field464 > 0) {
			arg0.field464--;
			return;
		}
	}

	@ObfuscatedName("client.b(Lz;I)V")
	public final void method511(ClientEntity arg0) {
		if (arg0.field458 == 0) {
			return;
		}
		if (arg0.field432 != -1 && arg0.field432 < 32768) {
			ClientNpc var3 = this.field1219[arg0.field432];
			if (var3 != null) {
				int var4 = arg0.field410 - var3.field410;
				int var5 = arg0.field411 - var3.field411;
				if (var4 != 0 || var5 != 0) {
					arg0.field457 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field432 >= 32768) {
			int var6 = arg0.field432 - 32768;
			if (var6 == this.field1542) {
				var6 = this.field1377;
			}
			ClientPlayer var7 = this.field1378[var6];
			if (var7 != null) {
				int var8 = arg0.field410 - var7.field410;
				int var9 = arg0.field411 - var7.field411;
				if (var8 != 0 || var9 != 0) {
					arg0.field457 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field433 != 0 || arg0.field434 != 0) && (arg0.field459 == 0 || arg0.field463 > 0)) {
			int var10 = arg0.field410 - (arg0.field433 - this.field1487 - this.field1487) * 64;
			int var11 = arg0.field411 - (arg0.field434 - this.field1488 - this.field1488) * 64;
			if (var10 != 0 || var11 != 0) {
				arg0.field457 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
			}
			arg0.field433 = 0;
			arg0.field434 = 0;
		}
		int var12 = arg0.field457 - arg0.field412 & 0x7FF;
		if (var12 == 0) {
			return;
		}
		if (var12 < arg0.field458 || var12 > 2048 - arg0.field458) {
			arg0.field412 = arg0.field457;
		} else if (var12 > 1024) {
			arg0.field412 -= arg0.field458;
		} else {
			arg0.field412 += arg0.field458;
		}
		arg0.field412 &= 0x7FF;
		if (arg0.field435 != arg0.field415 || arg0.field412 == arg0.field457) {
			return;
		}
		if (arg0.field416 != -1) {
			arg0.field435 = arg0.field416;
			return;
		}
		arg0.field435 = arg0.field417;
		return;
	}

	@ObfuscatedName("client.a(ZLz;)V")
	public final void method512(ClientEntity arg1) {
		arg1.field413 = false;
		if (arg1.field435 != -1) {
			SeqType var3 = SeqType.field1112[arg1.field435];
			arg1.field437++;
			if (arg1.field436 < var3.field1113 && arg1.field437 > var3.method384(arg1.field436)) {
				arg1.field437 = 0;
				arg1.field436++;
			}
			if (arg1.field436 >= var3.field1113) {
				arg1.field437 = 0;
				arg1.field436 = 0;
			}
		}
		if (arg1.field443 != -1 && field1591 >= arg1.field446) {
			if (arg1.field444 < 0) {
				arg1.field444 = 0;
			}
			SeqType var4 = SpotAnimType.field1132[arg1.field443].field1136;
			arg1.field445++;
			while (arg1.field444 < var4.field1113 && arg1.field445 > var4.method384(arg1.field444)) {
				arg1.field445 -= var4.method384(arg1.field444);
				arg1.field444++;
			}
			if (arg1.field444 >= var4.field1113 && (arg1.field444 < 0 || arg1.field444 >= var4.field1113)) {
				arg1.field443 = -1;
			}
		}
		if (arg1.field438 != -1 && arg1.field441 <= 1) {
			SeqType var5 = SeqType.field1112[arg1.field438];
			if (var5.field1124 == 1 && arg1.field464 > 0 && arg1.field452 <= field1591 && arg1.field453 < field1591) {
				arg1.field441 = 1;
				return;
			}
		}
		if (arg1.field438 != -1 && arg1.field441 == 0) {
			SeqType var6 = SeqType.field1112[arg1.field438];
			arg1.field440++;
			while (arg1.field439 < var6.field1113 && arg1.field440 > var6.method384(arg1.field439)) {
				arg1.field440 -= var6.method384(arg1.field439);
				arg1.field439++;
			}
			if (arg1.field439 >= var6.field1113) {
				arg1.field439 -= var6.field1117;
				arg1.field442++;
				if (arg1.field442 >= var6.field1123) {
					arg1.field438 = -1;
				}
				if (arg1.field439 < 0 || arg1.field439 >= var6.field1113) {
					arg1.field438 = -1;
				}
			}
			arg1.field413 = var6.field1119;
		}
		if (arg1.field441 > 0) {
			arg1.field441--;
		}
	}

	@ObfuscatedName("client.j(Z)V")
	public final void method513() {
		if (this.field1448) {
			this.field1448 = false;
			this.field1560.method269(4, 0, super.field15);
			this.field1561.method269(357, 0, super.field15);
			this.field1562.method269(4, 722, super.field15);
			this.field1563.method269(205, 743, super.field15);
			this.field1564.method269(0, 0, super.field15);
			this.field1565.method269(4, 516, super.field15);
			this.field1566.method269(205, 516, super.field15);
			this.field1567.method269(357, 496, super.field15);
			this.field1568.method269(338, 0, super.field15);
			this.field1200 = true;
			this.field1528 = true;
			this.field1352 = true;
			this.field1243 = true;
			if (this.field1317 != 2) {
				this.field1484.method269(4, 4, super.field15);
				this.field1483.method269(4, 550, super.field15);
			}
		}
		if (this.field1317 == 2) {
			this.method540();
		}
		if (this.field1384 && this.field1214 == 1) {
			this.field1200 = true;
		}
		if (this.field1594 != -1) {
			boolean var2 = this.method471(this.field1464, this.field1594);
			if (var2) {
				this.field1200 = true;
			}
		}
		if (this.field1225 == 2) {
			this.field1200 = true;
		}
		if (this.field1366 == 2) {
			this.field1200 = true;
		}
		if (this.field1200) {
			this.method455();
			this.field1200 = false;
		}
		if (this.field1558 == -1) {
			this.field1486.field90 = this.field1509 - this.field1343 - 77;
			if (super.field23 > 448 && super.field23 < 560 && super.field24 > 332) {
				this.method469(463, this.field1509, false, super.field23 - 17, this.field1486, super.field24 - 357, 77, 0);
			}
			int var3 = this.field1509 - 77 - this.field1486.field90;
			if (var3 < 0) {
				var3 = 0;
			}
			if (var3 > this.field1509 - 77) {
				var3 = this.field1509 - 77;
			}
			if (this.field1343 != var3) {
				this.field1343 = var3;
				this.field1528 = true;
			}
		}
		if (this.field1558 != -1) {
			boolean var4 = this.method471(this.field1464, this.field1558);
			if (var4) {
				this.field1528 = true;
			}
		}
		if (this.field1225 == 3) {
			this.field1528 = true;
		}
		if (this.field1366 == 3) {
			this.field1528 = true;
		}
		if (this.field1635 != null) {
			this.field1528 = true;
		}
		if (this.field1384 && this.field1214 == 2) {
			this.field1528 = true;
		}
		if (this.field1528) {
			this.method538();
			this.field1528 = false;
		}
		if (this.field1317 == 2) {
			this.method516();
			this.field1483.method269(4, 550, super.field15);
		}
		if (this.field1632 != -1) {
			this.field1352 = true;
		}
		if (this.field1352) {
			if (this.field1632 != -1 && this.field1632 == this.field1248) {
				this.field1632 = -1;
				this.field1543.method228(201);
				this.field1543.method229(this.field1248);
			}
			this.field1352 = false;
			this.field1534.method268();
			this.field1282.method212(0, 0);
			if (this.field1594 == -1) {
				if (this.field1468[this.field1248] != -1) {
					if (this.field1248 == 0) {
						this.field1399.method212(22, 10);
					}
					if (this.field1248 == 1) {
						this.field1400.method212(54, 8);
					}
					if (this.field1248 == 2) {
						this.field1400.method212(82, 8);
					}
					if (this.field1248 == 3) {
						this.field1401.method212(110, 8);
					}
					if (this.field1248 == 4) {
						this.field1403.method212(153, 8);
					}
					if (this.field1248 == 5) {
						this.field1403.method212(181, 8);
					}
					if (this.field1248 == 6) {
						this.field1402.method212(209, 9);
					}
				}
				if (this.field1468[0] != -1 && (this.field1632 != 0 || field1591 % 20 < 10)) {
					this.field1460[0].method212(29, 13);
				}
				if (this.field1468[1] != -1 && (this.field1632 != 1 || field1591 % 20 < 10)) {
					this.field1460[1].method212(53, 11);
				}
				if (this.field1468[2] != -1 && (this.field1632 != 2 || field1591 % 20 < 10)) {
					this.field1460[2].method212(82, 11);
				}
				if (this.field1468[3] != -1 && (this.field1632 != 3 || field1591 % 20 < 10)) {
					this.field1460[3].method212(115, 12);
				}
				if (this.field1468[4] != -1 && (this.field1632 != 4 || field1591 % 20 < 10)) {
					this.field1460[4].method212(153, 13);
				}
				if (this.field1468[5] != -1 && (this.field1632 != 5 || field1591 % 20 < 10)) {
					this.field1460[5].method212(180, 11);
				}
				if (this.field1468[6] != -1 && (this.field1632 != 6 || field1591 % 20 < 10)) {
					this.field1460[6].method212(208, 13);
				}
			}
			this.field1534.method269(160, 516, super.field15);
			this.field1533.method268();
			this.field1281.method212(0, 0);
			if (this.field1594 == -1) {
				if (this.field1468[this.field1248] != -1) {
					if (this.field1248 == 7) {
						this.field1226.method212(42, 0);
					}
					if (this.field1248 == 8) {
						this.field1227.method212(74, 0);
					}
					if (this.field1248 == 9) {
						this.field1227.method212(102, 0);
					}
					if (this.field1248 == 10) {
						this.field1228.method212(130, 1);
					}
					if (this.field1248 == 11) {
						this.field1230.method212(173, 0);
					}
					if (this.field1248 == 12) {
						this.field1230.method212(201, 0);
					}
					if (this.field1248 == 13) {
						this.field1229.method212(229, 0);
					}
				}
				if (this.field1468[8] != -1 && (this.field1632 != 8 || field1591 % 20 < 10)) {
					this.field1460[7].method212(74, 2);
				}
				if (this.field1468[9] != -1 && (this.field1632 != 9 || field1591 % 20 < 10)) {
					this.field1460[8].method212(102, 3);
				}
				if (this.field1468[10] != -1 && (this.field1632 != 10 || field1591 % 20 < 10)) {
					this.field1460[9].method212(137, 4);
				}
				if (this.field1468[11] != -1 && (this.field1632 != 11 || field1591 % 20 < 10)) {
					this.field1460[10].method212(174, 2);
				}
				if (this.field1468[12] != -1 && (this.field1632 != 12 || field1591 % 20 < 10)) {
					this.field1460[11].method212(201, 2);
				}
				if (this.field1468[13] != -1 && (this.field1632 != 13 || field1591 % 20 < 10)) {
					this.field1460[12].method212(226, 2);
				}
			}
			this.field1533.method269(466, 496, super.field15);
			this.field1484.method268();
		}
		if (this.field1243) {
			this.field1243 = false;
			this.field1532.method268();
			this.field1280.method212(0, 0);
			this.field1345.method215(16777215, 55, "Public chat", 28, true);
			if (this.field1583 == 0) {
				this.field1345.method215(65280, 55, "On", 41, true);
			}
			if (this.field1583 == 1) {
				this.field1345.method215(16776960, 55, "Friends", 41, true);
			}
			if (this.field1583 == 2) {
				this.field1345.method215(16711680, 55, "Off", 41, true);
			}
			if (this.field1583 == 3) {
				this.field1345.method215(65535, 55, "Hide", 41, true);
			}
			this.field1345.method215(16777215, 184, "Private chat", 28, true);
			if (this.field1625 == 0) {
				this.field1345.method215(65280, 184, "On", 41, true);
			}
			if (this.field1625 == 1) {
				this.field1345.method215(16776960, 184, "Friends", 41, true);
			}
			if (this.field1625 == 2) {
				this.field1345.method215(16711680, 184, "Off", 41, true);
			}
			this.field1345.method215(16777215, 324, "Trade/duel", 28, true);
			if (this.field1554 == 0) {
				this.field1345.method215(65280, 324, "On", 41, true);
			}
			if (this.field1554 == 1) {
				this.field1345.method215(16776960, 324, "Friends", 41, true);
			}
			if (this.field1554 == 2) {
				this.field1345.method215(16711680, 324, "Off", 41, true);
			}
			this.field1345.method215(16777215, 458, "Report abuse", 33, true);
			this.field1532.method269(453, 0, super.field15);
			this.field1484.method268();
		}
		this.field1464 = 0;
	}

	@ObfuscatedName("client.z(I)V")
	public final void method514() {
		short var2 = 256;
		for (int var3 = 10; var3 < 117; var3++) {
			int var4 = (int) (Math.random() * 100.0D);
			if (var4 < 50) {
				this.field1465[var3 + (var2 - 2 << 7)] = 255;
			}
		}
		for (int var5 = 0; var5 < 100; var5++) {
			int var6 = (int) (Math.random() * 124.0D) + 2;
			int var7 = (int) (Math.random() * 128.0D) + 128;
			int var8 = var6 + (var7 << 7);
			this.field1465[var8] = 192;
		}
		for (int var9 = 1; var9 < var2 - 1; var9++) {
			for (int var10 = 1; var10 < 127; var10++) {
				int var11 = var10 + (var9 << 7);
				this.field1466[var11] = (this.field1465[var11 - 1] + this.field1465[var11 + 1] + this.field1465[var11 - 128] + this.field1465[var11 + 128]) / 4;
			}
		}
		this.field1414 += 128;
		if (this.field1414 > this.field1264.length) {
			this.field1414 -= this.field1264.length;
			int var12 = (int) (Math.random() * 12.0D);
			this.method554(this.field1626[var12]);
		}
		for (int var13 = 1; var13 < var2 - 1; var13++) {
			for (int var14 = 1; var14 < 127; var14++) {
				int var15 = var14 + (var13 << 7);
				int var16 = this.field1466[var15 + 128] - this.field1264[var15 + this.field1414 & this.field1264.length - 1] / 5;
				if (var16 < 0) {
					var16 = 0;
				}
				this.field1465[var15] = var16;
			}
		}
		for (int var17 = 0; var17 < var2 - 1; var17++) {
			this.field1287[var17] = this.field1287[var17 + 1];
		}
		this.field1287[var2 - 1] = (int) (Math.sin((double) field1591 / 14.0D) * 16.0D + Math.sin((double) field1591 / 15.0D) * 14.0D + Math.sin((double) field1591 / 16.0D) * 12.0D);
		if (this.field1358 > 0) {
			this.field1358 -= 4;
		}
		if (this.field1359 > 0) {
			this.field1359 -= 4;
		}
		if (this.field1358 != 0 || this.field1359 != 0) {
			return;
		}
		int var18 = (int) (Math.random() * 2000.0D);
		if (var18 == 0) {
			this.field1358 = 1024;
		}
		if (var18 == 1) {
			this.field1359 = 1024;
			return;
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IILjava/lang/String;)V")
	public final void method515(String arg0, int arg1, String arg3) {
		if (arg1 == 0 && this.field1289 != -1) {
			this.field1635 = arg3;
			super.field29 = 0;
		}
		if (this.field1558 == -1) {
			this.field1528 = true;
		}
		for (int var5 = 99; var5 > 0; var5--) {
			this.field1245[var5] = this.field1245[var5 - 1];
			this.field1246[var5] = this.field1246[var5 - 1];
			this.field1247[var5] = this.field1247[var5 - 1];
		}
		this.field1245[0] = arg1;
		this.field1246[0] = arg0;
		this.field1247[0] = arg3;
	}

	@ObfuscatedName("client.h(B)V")
	public final void method516() {
		this.field1483.method268();
		int var2 = this.field1253 + this.field1278 & 0x7FF;
		int var3 = field1231.field410 / 32 + 48;
		boolean var4 = false;
		int var5 = 464 - field1231.field411 / 32;
		this.field1303.method203(146, this.field1502, this.field1348 + 256, this.field1648, 25, var3, 151, 5, var5, var2);
		this.field1300.method203(33, this.field1595, 256, this.field1424, 0, 25, 33, 0, 25, this.field1253);
		for (int var6 = 0; var6 < this.field1207; var6++) {
			int var7 = this.field1208[var6] * 4 + 2 - field1231.field410 / 32;
			int var8 = this.field1209[var6] * 4 + 2 - field1231.field411 / 32;
			this.method473(this.field1202[var6], var8, var7);
		}
		for (int var9 = 0; var9 < 104; var9++) {
			for (int var10 = 0; var10 < 104; var10++) {
				LinkList var11 = this.field1406[this.field1277][var9][var10];
				if (var11 != null) {
					int var12 = var9 * 4 + 2 - field1231.field410 / 32;
					int var13 = var10 * 4 + 2 - field1231.field411 / 32;
					this.method473(this.field1570, var13, var12);
				}
			}
		}
		for (int var14 = 0; var14 < this.field1220; var14++) {
			ClientNpc var15 = this.field1219[this.field1221[var14]];
			if (var15 != null && var15.method127() && var15.field465.field1001) {
				int var16 = var15.field410 / 32 - field1231.field410 / 32;
				int var17 = var15.field411 / 32 - field1231.field411 / 32;
				this.method473(this.field1571, var17, var16);
			}
		}
		for (int var18 = 0; var18 < this.field1379; var18++) {
			ClientPlayer var19 = this.field1378[this.field1380[var18]];
			if (var19 != null && var19.method127()) {
				int var20 = var19.field410 / 32 - field1231.field410 / 32;
				int var21 = var19.field411 / 32 - field1231.field411 / 32;
				boolean var22 = false;
				long var23 = JString.method310(var19.field468);
				for (int var25 = 0; var25 < this.field1609; var25++) {
					if (var23 == this.field1521[var25] && this.field1553[var25] != 0) {
						var22 = true;
						break;
					}
				}
				if (var22) {
					this.method473(this.field1573, var21, var20);
				} else {
					this.method473(this.field1572, var21, var20);
				}
			}
		}
		if (this.field1458 != 0 && field1591 % 20 < 10) {
			if (this.field1458 == 1 && this.field1234 >= 0 && this.field1234 < this.field1219.length) {
				ClientNpc var26 = this.field1219[this.field1234];
				if (var26 != null) {
					int var27 = var26.field410 / 32 - field1231.field410 / 32;
					int var28 = var26.field411 / 32 - field1231.field411 / 32;
					this.method556(this.field1443, var27, var28);
				}
			}
			if (this.field1458 == 2) {
				int var29 = (this.field1475 - this.field1487) * 4 + 2 - field1231.field410 / 32;
				int var30 = (this.field1476 - this.field1488) * 4 + 2 - field1231.field411 / 32;
				this.method556(this.field1443, var29, var30);
			}
			if (this.field1458 == 10 && this.field1437 >= 0 && this.field1437 < this.field1378.length) {
				ClientPlayer var31 = this.field1378[this.field1437];
				if (var31 != null) {
					int var32 = var31.field410 / 32 - field1231.field410 / 32;
					int var33 = var31.field411 / 32 - field1231.field411 / 32;
					this.method556(this.field1443, var32, var33);
				}
			}
		}
		if (this.field1301 != 0) {
			int var34 = this.field1301 * 4 + 2 - field1231.field410 / 32;
			int var35 = this.field1302 * 4 + 2 - field1231.field411 / 32;
			this.method473(this.field1442, var35, var34);
		}
		Pix2D.method170(3, 3, 97, 78, 16777215);
		this.field1484.method268();
	}

	@ObfuscatedName("client.a(ILmb;IILbb;)V")
	public final void method517(int arg0, Packet arg1, int arg2, ClientPlayer arg4) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg1.method239();
			byte[] var7 = new byte[var6];
			Packet var8 = new Packet(var7);
			arg1.method248(0, var7, var6);
			this.field1383[arg2] = var8;
			arg4.method130(var8);
		}
		if ((arg0 & 0x2) == 2) {
			int var9 = arg1.method241();
			if (var9 == 65535) {
				var9 = -1;
			}
			if (var9 == arg4.field438) {
				arg4.field442 = 0;
			}
			int var10 = arg1.method239();
			if (var9 == arg4.field438 && var9 != -1) {
				int var11 = SeqType.field1112[var9].field1126;
				if (var11 == 1) {
					arg4.field439 = 0;
					arg4.field440 = 0;
					arg4.field441 = var10;
					arg4.field442 = 0;
				}
				if (var11 == 2) {
					arg4.field442 = 0;
				}
			} else if (var9 == -1 || arg4.field438 == -1 || SeqType.field1112[var9].field1120 >= SeqType.field1112[arg4.field438].field1120) {
				arg4.field438 = var9;
				arg4.field439 = 0;
				arg4.field440 = 0;
				arg4.field441 = var10;
				arg4.field442 = 0;
				arg4.field464 = arg4.field459;
			}
		}
		if ((arg0 & 0x4) == 4) {
			arg4.field432 = arg1.method241();
			if (arg4.field432 == 65535) {
				arg4.field432 = -1;
			}
		}
		if ((arg0 & 0x8) == 8) {
			arg4.field422 = arg1.method246();
			arg4.field424 = 0;
			arg4.field425 = 0;
			arg4.field423 = 150;
			this.method515(arg4.field468, 2, arg4.field422);
		}
		if ((arg0 & 0x10) == 16) {
			int var12 = arg1.method239();
			int var13 = arg1.method239();
			arg4.method128(var13, var12);
			arg4.field429 = field1591 + 300;
			arg4.field430 = arg1.method239();
			arg4.field431 = arg1.method239();
		}
		if ((arg0 & 0x20) == 32) {
			arg4.field433 = arg1.method241();
			arg4.field434 = arg1.method241();
		}
		if ((arg0 & 0x40) == 64) {
			int var14 = arg1.method241();
			int var15 = arg1.method239();
			int var16 = arg1.method239();
			int var17 = arg1.field711;
			if (arg4.field468 != null && arg4.field469) {
				long var18 = JString.method310(arg4.field468);
				boolean var20 = false;
				if (var15 <= 1) {
					for (int var21 = 0; var21 < this.field1646; var21++) {
						if (this.field1515[var21] == var18) {
							var20 = true;
							break;
						}
					}
				}
				if (!var20 && this.field1450 == 0) {
					try {
						String var22 = WordPack.method317(arg1, var16);
						String var23 = WordFilter.method403(var22);
						arg4.field422 = var23;
						arg4.field424 = var14 >> 8;
						arg4.field425 = var14 & 0xFF;
						arg4.field423 = 150;
						if (var15 == 2 || var15 == 3) {
							this.method515("@cr2@" + arg4.field468, 1, var23);
						} else if (var15 == 1) {
							this.method515("@cr1@" + arg4.field468, 1, var23);
						} else {
							this.method515(arg4.field468, 2, var23);
						}
					} catch (Exception var28) {
						signlink.reporterror("cde2");
					}
				}
			}
			arg1.field711 = var17 + var16;
		}
		if ((arg0 & 0x100) == 256) {
			arg4.field443 = arg1.method241();
			int var25 = arg1.method244();
			arg4.field447 = var25 >> 16;
			arg4.field446 = field1591 + (var25 & 0xFFFF);
			arg4.field444 = 0;
			arg4.field445 = 0;
			if (arg4.field446 > field1591) {
				arg4.field444 = -1;
			}
			if (arg4.field443 == 65535) {
				arg4.field443 = -1;
			}
		}
		if ((arg0 & 0x200) == 512) {
			arg4.field448 = arg1.method239();
			arg4.field450 = arg1.method239();
			arg4.field449 = arg1.method239();
			arg4.field451 = arg1.method239();
			arg4.field452 = arg1.method241() + field1591;
			arg4.field453 = arg1.method241() + field1591;
			arg4.field454 = arg1.method239();
			arg4.method126();
		}
		if ((arg0 & 0x400) != 1024) {
			return;
		}
		int var26 = arg1.method239();
		int var27 = arg1.method239();
		arg4.method128(var27, var26);
		arg4.field429 = field1591 + 300;
		arg4.field430 = arg1.method239();
		arg4.field431 = arg1.method239();
	}

	@ObfuscatedName("client.A(I)V")
	public final void method518() {
		if (this.field1366 != 0) {
			return;
		}
		int var2 = super.field29;
		if (this.field1387 == 1 && super.field30 >= 516 && super.field31 >= 160 && super.field30 <= 765 && super.field31 <= 205) {
			var2 = 0;
		}
		if (!this.field1384) {
			if (var2 == 1 && this.field1314 > 0) {
				int var13 = this.field1205[this.field1314 - 1];
				if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
					int var14 = this.field1203[this.field1314 - 1];
					int var15 = this.field1204[this.field1314 - 1];
					Component var16 = Component.field70[var15];
					if (var16.field97 || var16.field100) {
						this.field1385 = false;
						this.field1251 = 0;
						this.field1364 = var15;
						this.field1365 = var14;
						this.field1366 = 2;
						this.field1367 = super.field30;
						this.field1368 = super.field31;
						if (Component.field70[var15].field76 == this.field1523) {
							this.field1366 = 1;
						}
						if (Component.field70[var15].field76 == this.field1558) {
							this.field1366 = 3;
						}
						return;
					}
				}
			}
			if (var2 == 1 && (this.field1495 == 1 || this.method524(this.field1314 - 1)) && this.field1314 > 2) {
				var2 = 2;
			}
			if (var2 == 1 && this.field1314 > 0) {
				this.method433(this.field1314 - 1);
			}
			if (var2 != 2 || this.field1314 <= 0) {
				return;
			}
			this.method493();
			return;
		}
		if (var2 != 1) {
			int var3 = super.field23;
			int var4 = super.field24;
			if (this.field1214 == 0) {
				var3 -= 4;
				var4 -= 4;
			}
			if (this.field1214 == 1) {
				var3 -= 553;
				var4 -= 205;
			}
			if (this.field1214 == 2) {
				var3 -= 17;
				var4 -= 357;
			}
			if (var3 < this.field1215 - 10 || var3 > this.field1215 + this.field1217 + 10 || var4 < this.field1216 - 10 || var4 > this.field1216 + this.field1218 + 10) {
				this.field1384 = false;
				if (this.field1214 == 1) {
					this.field1200 = true;
				}
				if (this.field1214 == 2) {
					this.field1528 = true;
				}
			}
		}
		if (var2 != 1) {
			return;
		}
		int var5 = this.field1215;
		int var6 = this.field1216;
		int var7 = this.field1217;
		int var8 = super.field30;
		int var9 = super.field31;
		if (this.field1214 == 0) {
			var8 -= 4;
			var9 -= 4;
		}
		if (this.field1214 == 1) {
			var8 -= 553;
			var9 -= 205;
		}
		if (this.field1214 == 2) {
			var8 -= 17;
			var9 -= 357;
		}
		int var10 = -1;
		for (int var11 = 0; var11 < this.field1314; var11++) {
			int var12 = var6 + 31 + (this.field1314 - 1 - var11) * 15;
			if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
				var10 = var11;
			}
		}
		if (var10 != -1) {
			this.method433(var10);
		}
		this.field1384 = false;
		if (this.field1214 == 1) {
			this.field1200 = true;
		}
		if (this.field1214 == 2) {
			this.field1528 = true;
			return;
		}
	}

	@ObfuscatedName("client.b(Lmb;II)V")
	public final void method519(Packet arg0, int arg1) {
		int var4 = arg0.method250(8);
		if (var4 < this.field1379) {
			for (int var6 = var4; var6 < this.field1379; var6++) {
				this.field1454[this.field1453++] = this.field1380[var6];
			}
		}
		if (var4 > this.field1379) {
			signlink.reporterror(this.field1426 + " Too many players");
			throw new RuntimeException("eek");
		}
		this.field1379 = 0;
		for (int var7 = 0; var7 < var4; var7++) {
			int var8 = this.field1380[var7];
			ClientPlayer var9 = this.field1378[var8];
			int var10 = arg0.method250(1);
			if (var10 == 0) {
				this.field1380[this.field1379++] = var8;
				var9.field455 = field1591;
			} else {
				int var11 = arg0.method250(2);
				if (var11 == 0) {
					this.field1380[this.field1379++] = var8;
					var9.field455 = field1591;
					this.field1382[this.field1381++] = var8;
				} else if (var11 == 1) {
					this.field1380[this.field1379++] = var8;
					var9.field455 = field1591;
					int var12 = arg0.method250(3);
					var9.method125(false, var12);
					int var13 = arg0.method250(1);
					if (var13 == 1) {
						this.field1382[this.field1381++] = var8;
					}
				} else if (var11 == 2) {
					this.field1380[this.field1379++] = var8;
					var9.field455 = field1591;
					int var14 = arg0.method250(3);
					var9.method125(true, var14);
					int var15 = arg0.method250(3);
					var9.method125(true, var15);
					int var16 = arg0.method250(1);
					if (var16 == 1) {
						this.field1382[this.field1381++] = var8;
					}
				} else if (var11 == 3) {
					this.field1454[this.field1453++] = var8;
				}
			}
		}
	}

	@ObfuscatedName("client.B(I)V")
	public final void method520() {
		for (int var2 = -1; var2 < this.field1379; var2++) {
			int var3;
			if (var2 == -1) {
				var3 = this.field1377;
			} else {
				var3 = this.field1380[var2];
			}
			ClientPlayer var4 = this.field1378[var3];
			if (var4 != null) {
				this.method507(var4, 1);
			}
		}
	}

	@ObfuscatedName("client.d(II)V")
	public final void method521(int arg1) {
		Component var3 = Component.field70[arg1];
		for (int var4 = 0; var4 < var3.field92.length && var3.field92[var4] != -1; var4++) {
			Component var5 = Component.field70[var3.field92[var4]];
			if (var5.field77 == 1) {
				this.method521(var5.field75);
			}
			var5.field73 = 0;
			var5.field74 = 0;
		}
	}

	@ObfuscatedName("client.e(II)V")
	public final void method522(int arg1) {
		signlink.wavevol = arg1;
	}

	@ObfuscatedName("client.C(I)V")
	public final void method523() {
		this.field1395 = true;
		try {
			long var2 = System.currentTimeMillis();
			int var4 = 0;
			int var5 = 20;
			while (this.field1627) {
				this.field1363++;
				this.method514();
				this.method514();
				this.method449();
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
		this.field1395 = false;
	}

	@ObfuscatedName("client.f(II)Z")
	public final boolean method524(int arg0) {
		if (arg0 < 0) {
			return false;
		}
		int var3 = this.field1205[arg0];
		if (var3 >= 2000) {
			var3 -= 2000;
		}
		return var3 == 605;
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public final void method525(int arg0, int arg1, int arg2, int arg3, int arg5, int arg6) {
		int var8 = 2048 - arg0 & 0x7FF;
		int var9 = 2048 - arg6 & 0x7FF;
		int var10 = 0;
		int var11 = 0;
		int var12 = arg5;
		if (var8 != 0) {
			int var13 = Model.field602[var8];
			int var14 = Model.field603[var8];
			int var15 = var11 * var14 - arg5 * var13 >> 16;
			var12 = var11 * var13 + arg5 * var14 >> 16;
			var11 = var15;
		}
		if (var9 != 0) {
			int var16 = Model.field602[var9];
			int var17 = Model.field603[var9];
			int var18 = var12 * var16 + var10 * var17 >> 16;
			var12 = var12 * var17 - var10 * var16 >> 16;
			var10 = var18;
		}
		this.field1266 = arg1 - var10;
		this.field1267 = arg2 - var11;
		this.field1268 = arg3 - var12;
		this.field1269 = arg0;
		this.field1270 = arg6;
	}

	@ObfuscatedName("client.a(I)V")
	public final void method9() {
		if (this.field1410 || this.field1508 || this.field1194) {
			this.method489();
			return;
		}
		field1470++;
		if (this.field1238) {
			this.method513();
		} else {
			this.method437(false);
		}
		this.field1361 = 0;
	}

	@ObfuscatedName("client.i(B)V")
	public final void method526() {
		byte[] var2 = this.field1371.method309("title.dat", null);
		Pix32 var3 = new Pix32(var2, this);
		this.field1547.method268();
		var3.method197(0, 0);
		this.field1548.method268();
		var3.method197(0, -637);
		this.field1544.method268();
		var3.method197(0, -128);
		this.field1545.method268();
		var3.method197(-371, -202);
		this.field1546.method268();
		var3.method197(-171, -202);
		this.field1549.method268();
		var3.method197(-265, 0);
		this.field1550.method268();
		var3.method197(-265, -562);
		this.field1551.method268();
		var3.method197(-171, -128);
		this.field1552.method268();
		var3.method197(-171, -562);
		int[] var4 = new int[var3.field667];
		for (int var5 = 0; var5 < var3.field668; var5++) {
			for (int var6 = 0; var6 < var3.field667; var6++) {
				var4[var6] = var3.field666[var3.field667 - var6 - 1 + var3.field667 * var5];
			}
			for (int var7 = 0; var7 < var3.field667; var7++) {
				var3.field666[var7 + var3.field667 * var5] = var4[var7];
			}
		}
		this.field1547.method268();
		var3.method197(0, 382);
		this.field1548.method268();
		var3.method197(0, -255);
		this.field1544.method268();
		var3.method197(0, 254);
		this.field1545.method268();
		var3.method197(-371, 180);
		this.field1546.method268();
		var3.method197(-171, 180);
		this.field1549.method268();
		var3.method197(-265, 382);
		this.field1550.method268();
		var3.method197(-265, -180);
		this.field1551.method268();
		var3.method197(-171, 254);
		this.field1552.method268();
		var3.method197(-171, -180);
		Pix32 var8 = new Pix32(this.field1371, "logo", 0);
		this.field1544.method268();
		var8.method199(382 - var8.field667 / 2 - 128, 18);
		Object var9 = null;
		Object var10 = null;
		Object var11 = null;
		System.gc();
	}

	@ObfuscatedName("client.a(IB)V")
	public final void method527(int arg0) {
		int[] var3 = this.field1303.field666;
		int var4 = var3.length;
		for (int var5 = 0; var5 < var4; var5++) {
			var3[var5] = 0;
		}
		for (int var6 = 1; var6 < 103; var6++) {
			int var7 = (103 - var6) * 512 * 4 + 24628;
			for (int var8 = 1; var8 < 103; var8++) {
				if ((this.field1512[arg0][var8][var6] & 0x18) == 0) {
					this.field1325.method99(var3, var7, 512, arg0, var8, var6);
				}
				if (arg0 < 3 && (this.field1512[arg0 + 1][var8][var6] & 0x8) != 0) {
					this.field1325.method99(var3, var7, 512, arg0 + 1, var8, var6);
				}
				var7 += 4;
			}
		}
		int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10);
		int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		this.field1303.method194();
		for (int var11 = 1; var11 < 103; var11++) {
			for (int var12 = 1; var12 < 103; var12++) {
				if ((this.field1512[arg0][var12][var11] & 0x18) == 0) {
					this.method463(var9, arg0, var12, var10, var11);
				}
				if (arg0 < 3 && (this.field1512[arg0 + 1][var12][var11] & 0x8) != 0) {
					this.method463(var9, arg0 + 1, var12, var10, var11);
				}
			}
		}
		this.field1484.method268();
		this.field1207 = 0;
		for (int var13 = 0; var13 < 104; var13++) {
			for (int var14 = 0; var14 < 104; var14++) {
				int var15 = this.field1325.method93(this.field1277, var13, var14);
				if (var15 != 0) {
					int var16 = var15 >> 14 & 0x7FFF;
					int var17 = LocType.method334(var16).field954;
					if (var17 >= 0) {
						int var18 = var13;
						int var19 = var14;
						if (var17 != 22 && var17 != 29 && var17 != 34 && var17 != 36 && var17 != 46 && var17 != 47 && var17 != 48) {
							byte var20 = 104;
							byte var21 = 104;
							int[][] var22 = this.field1233[this.field1277].field1075;
							for (int var23 = 0; var23 < 10; var23++) {
								int var24 = (int) (Math.random() * 4.0D);
								if (var24 == 0 && var18 > 0 && var18 > var13 - 3 && (var22[var18 - 1][var19] & 0x280108) == 0) {
									var18--;
								}
								if (var24 == 1 && var18 < var20 - 1 && var18 < var13 + 3 && (var22[var18 + 1][var19] & 0x280180) == 0) {
									var18++;
								}
								if (var24 == 2 && var19 > 0 && var19 > var14 - 3 && (var22[var18][var19 - 1] & 0x280102) == 0) {
									var19--;
								}
								if (var24 == 3 && var19 < var21 - 1 && var19 < var14 + 3 && (var22[var18][var19 + 1] & 0x280120) == 0) {
									var19++;
								}
							}
						}
						this.field1202[this.field1207] = this.field1600[var17];
						this.field1208[this.field1207] = var18;
						this.field1209[this.field1207] = var19;
						this.field1207++;
					}
				}
			}
		}
		field1354++;
		if (field1354 > 112) {
			field1354 = 0;
			this.field1543.method228(4);
			this.field1543.method229(50);
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public final void method528(boolean arg0) {
		if (field1231.field410 >> 7 == this.field1301 && field1231.field411 >> 7 == this.field1302) {
			this.field1301 = 0;
			field1587++;
			if (field1587 > 122) {
				field1587 = 0;
				this.field1543.method228(36);
				this.field1543.method229(62);
			}
		}
		int var3 = this.field1379;
		if (arg0) {
			var3 = 1;
		}
		for (int var4 = 0; var4 < var3; var4++) {
			ClientPlayer var5;
			int var6;
			if (arg0) {
				var5 = field1231;
				var6 = this.field1377 << 14;
			} else {
				var5 = this.field1378[this.field1380[var4]];
				var6 = this.field1380[var4] << 14;
			}
			if (var5 != null && var5.method127()) {
				var5.field487 = false;
				if ((field1242 && this.field1379 > 50 || this.field1379 > 200) && !arg0 && var5.field435 == var5.field415) {
					var5.field487 = true;
				}
				int var7 = var5.field410 >> 7;
				int var8 = var5.field411 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.field482 == null || field1591 < var5.field477 || field1591 >= var5.field478) {
						if ((var5.field410 & 0x7F) == 64 && (var5.field411 & 0x7F) == 64) {
							if (this.field1586[var7][var8] == this.field1320) {
								continue;
							}
							this.field1586[var7][var8] = this.field1320;
						}
						var5.field476 = this.method470(var5.field411, this.field1277, var5.field410);
						this.field1325.method75(var5.field412, var6, 60, var5.field410, var5, var5.field476, this.field1277, var5.field413, var5.field411);
					} else {
						var5.field487 = false;
						var5.field476 = this.method470(var5.field411, this.field1277, var5.field410);
						this.field1325.method76(var5.field476, var5.field412, var5.field484, 60, var5.field486, var5.field411, var5, var5.field483, var5.field410, var6, this.field1277, var5.field485);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.g(II)V")
	public final void method529(int arg0, int arg1) {
		LinkList var3 = this.field1406[this.field1277][arg0][arg1];
		if (var3 == null) {
			this.field1325.method85(this.field1277, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.method258(); var6 != null; var6 = (ClientObj) var3.method260()) {
			ObjType var7 = ObjType.method350(var6.field501);
			int var8 = var7.field1036;
			if (var7.field1035) {
				var8 *= var6.field502 + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.method256(var5);
		ClientObj var9 = null;
		ClientObj var10 = null;
		for (ClientObj var11 = (ClientObj) var3.method258(); var11 != null; var11 = (ClientObj) var3.method260()) {
			if (var11.field501 != var5.field501 && var9 == null) {
				var9 = var11;
			}
			if (var11.field501 != var5.field501 && var11.field501 != var9.field501 && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		this.field1325.method71(var5, var12, this.method470(arg1 * 128 + 64, this.field1277, arg0 * 128 + 64), var10, this.field1277, arg0, arg1, var9);
	}

	@ObfuscatedName("client.a(ILd;)Z")
	public final boolean method530(Component arg1) {
		int var3 = arg1.field79;
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
			this.field1292[this.field1314] = "Remove @whi@" + this.field1257[var3];
			this.field1205[this.field1314] = 513;
			this.field1314++;
			this.field1292[this.field1314] = "Message @whi@" + this.field1257[var3];
			this.field1205[this.field1314] = 902;
			this.field1314++;
			return true;
		} else if (var3 >= 401 && var3 <= 500) {
			this.field1292[this.field1314] = "Remove @whi@" + arg1.field111;
			this.field1205[this.field1314] = 884;
			this.field1314++;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("client.a(IIIII)Z")
	public final boolean method531(int arg0, int arg2, int arg3, int arg4) {
		int var6 = arg3 >> 14 & 0x7FFF;
		int var7 = this.field1325.method94(this.field1277, arg0, arg2, arg3);
		if (var7 == -1) {
			return false;
		}
		int var8 = var7 & 0x1F;
		int var9 = var7 >> 6 & 0x3;
		field1285++;
		if (field1285 > 1086) {
			field1285 = 0;
			this.field1543.method228(225);
			this.field1543.method229(0);
			int var10 = this.field1543.field711;
			if ((int) (Math.random() * 2.0D) == 0) {
				this.field1543.method230(16791);
			}
			this.field1543.method229(254);
			this.field1543.method230((int) (Math.random() * 65536.0D));
			this.field1543.method230(16128);
			this.field1543.method230(52610);
			this.field1543.method230((int) (Math.random() * 65536.0D));
			this.field1543.method230(55420);
			if ((int) (Math.random() * 2.0D) == 0) {
				this.field1543.method230(35025);
			}
			this.field1543.method230(46628);
			this.field1543.method229((int) (Math.random() * 256.0D));
			this.field1543.method238(this.field1543.field711 - var10);
		}
		if (var8 == 10 || var8 == 11 || var8 == 22) {
			LocType var11 = LocType.method334(var6);
			int var12;
			int var13;
			if (var9 == 0 || var9 == 2) {
				var12 = var11.field941;
				var13 = var11.field942;
			} else {
				var12 = var11.field942;
				var13 = var11.field941;
			}
			int var14 = var11.field964;
			if (var9 != 0) {
				var14 = (var14 << var9 & 0xF) + (var14 >> 4 - var9);
			}
			this.method488(var14, var13, 0, arg0, 2, field1231.field461[0], field1231.field460[0], arg2, false, var12, 0);
		} else {
			this.method488(0, 0, var9, arg0, 2, field1231.field461[0], field1231.field460[0], arg2, false, 0, var8 + 1);
		}
		this.field1498 = super.field30;
		this.field1499 = super.field31;
		this.field1501 = 2;
		this.field1500 = 0;
		this.field1543.method228(arg4);
		this.field1543.method230(arg0 + this.field1487);
		this.field1543.method230(arg2 + this.field1488);
		this.field1543.method230(var6);
		return true;
	}

	@ObfuscatedName("client.d(III)V")
	public final void method532(int arg0, int arg2) {
		int var4 = 0;
		for (int var5 = 0; var5 < 100; var5++) {
			if (this.field1247[var5] != null) {
				int var6 = this.field1245[var5];
				int var7 = 70 - var4 * 14 + this.field1343 + 4;
				if (var7 < -20) {
					break;
				}
				String var8 = this.field1246[var5];
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
				if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1583 == 0 || this.field1583 == 1 && this.method448(var8))) {
					if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1231.field468)) {
						if (this.field1510 >= 1) {
							this.field1292[this.field1314] = "Report abuse @whi@" + var8;
							this.field1205[this.field1314] = 524;
							this.field1314++;
						}
						this.field1292[this.field1314] = "Add ignore @whi@" + var8;
						this.field1205[this.field1314] = 47;
						this.field1314++;
						this.field1292[this.field1314] = "Add friend @whi@" + var8;
						this.field1205[this.field1314] = 605;
						this.field1314++;
					}
					var4++;
				}
				if ((var6 == 3 || var6 == 7) && this.field1342 == 0 && (var6 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var8))) {
					if (arg0 > var7 - 14 && arg0 <= var7) {
						if (this.field1510 >= 1) {
							this.field1292[this.field1314] = "Report abuse @whi@" + var8;
							this.field1205[this.field1314] = 524;
							this.field1314++;
						}
						this.field1292[this.field1314] = "Add ignore @whi@" + var8;
						this.field1205[this.field1314] = 47;
						this.field1314++;
						this.field1292[this.field1314] = "Add friend @whi@" + var8;
						this.field1205[this.field1314] = 605;
						this.field1314++;
					}
					var4++;
				}
				if (var6 == 4 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8))) {
					if (arg0 > var7 - 14 && arg0 <= var7) {
						this.field1292[this.field1314] = "Accept trade @whi@" + var8;
						this.field1205[this.field1314] = 507;
						this.field1314++;
					}
					var4++;
				}
				if ((var6 == 5 || var6 == 6) && this.field1342 == 0 && this.field1625 < 2) {
					var4++;
				}
				if (var6 == 8 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8))) {
					if (arg0 > var7 - 14 && arg0 <= var7) {
						this.field1292[this.field1314] = "Accept duel @whi@" + var8;
						this.field1205[this.field1314] = 957;
						this.field1314++;
					}
					var4++;
				}
			}
		}
	}

	public static final void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + signlink.clientversion);
			if (arg0.length == 5) {
				field1239 = Integer.parseInt(arg0[0]);
				field1240 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method560();
				} else if (arg0[2].equals("highmem")) {
					method543();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					field1241 = false;
				} else if (arg0[3].equals("members")) {
					field1241 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.method1(765, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	public final URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.field18 != null) {
				return new URL("http://127.0.0.1:" + (field1240 + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.a(BLjava/lang/String;I)V")
	public final void method13(String arg1, int arg2) {
		boolean var4 = false;
		this.field1201 = arg2;
		this.field1469 = arg1;
		this.method534();
		if (this.field1371 == null) {
			super.method13(arg1, arg2);
			return;
		}
		this.field1546.method268();
		short var5 = 360;
		short var6 = 200;
		byte var7 = 20;
		this.field1346.method214(var6 / 2 - 26 - var7, "RuneScape is loading - please wait...", var5 / 2, 16777215);
		int var8 = var6 / 2 - 18 - var7;
		Pix2D.method171(9179409, 304, var8, var5 / 2 - 152, 34);
		Pix2D.method171(0, 302, var8 + 1, var5 / 2 - 151, 32);
		Pix2D.method170(30, arg2 * 3, var5 / 2 - 150, var8 + 2, 9179409);
		Pix2D.method170(30, 300 - arg2 * 3, var5 / 2 - 150 + arg2 * 3, var8 + 2, 0);
		this.field1346.method214(var6 / 2 + 5 - var7, arg1, var5 / 2, 16777215);
		this.field1546.method269(171, 202, super.field15);
		if (!this.field1448) {
			return;
		}
		this.field1448 = false;
		if (!this.field1627) {
			this.field1547.method269(0, 0, super.field15);
			this.field1548.method269(0, 637, super.field15);
		}
		this.field1544.method269(0, 128, super.field15);
		this.field1545.method269(371, 202, super.field15);
		this.field1549.method269(265, 0, super.field15);
		this.field1550.method269(265, 562, super.field15);
		this.field1551.method269(171, 128, super.field15);
		this.field1552.method269(171, 562, super.field15);
	}

	@ObfuscatedName("client.a(Ljava/lang/String;IIZLjava/lang/String;I)Lyb;")
	public final JagFile method533(String arg0, int arg1, int arg2, String arg4, int arg5) {
		byte[] var7 = null;
		int var8 = 5;
		try {
			if (this.field1232[0] != null) {
				var7 = this.field1232[0].method301(arg5);
			}
		} catch (Exception var29) {
		}
		if (var7 != null) {
			this.field1237.reset();
			this.field1237.update(var7);
			int var9 = (int) this.field1237.getValue();
			if (var9 != arg1) {
				var7 = null;
			}
		}
		if (var7 != null) {
			return new JagFile(var7);
		}
		int var11 = 0;
		while (var7 == null) {
			String var12 = "Unknown error";
			this.method13("Requesting " + arg0, arg2);
			Object var13 = null;
			try {
				int var14 = 0;
				DataInputStream var15 = this.method498(arg4 + arg1);
				byte[] var16 = new byte[6];
				var15.readFully(var16, 0, 6);
				Packet var17 = new Packet(var16);
				var17.field711 = 3;
				int var18 = var17.method243() + 6;
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
					if (var23 != var14) {
						this.method13("Loading " + arg0 + " - " + var23 + "%", arg2);
					}
					var14 = var23;
				}
				var15.close();
				try {
					if (this.field1232[0] != null) {
						this.field1232[0].method302(var7.length, arg5, var7);
					}
				} catch (Exception var28) {
					this.field1232[0] = null;
				}
				if (var7 != null) {
					this.field1237.reset();
					this.field1237.update(var7);
					int var24 = (int) this.field1237.getValue();
					if (var24 != arg1) {
						var7 = null;
						var11++;
						var12 = "Checksum error: " + var24;
					}
				}
			} catch (IOException var30) {
				if (var12.equals("Unknown error")) {
					var12 = "Connection error";
				}
				var7 = null;
			} catch (NullPointerException var31) {
				var12 = "Null error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (ArrayIndexOutOfBoundsException var32) {
				var12 = "Bounds error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			} catch (Exception var33) {
				var12 = "Unexpected error";
				var7 = null;
				if (!signlink.reporterror) {
					return null;
				}
			}
			if (var7 == null) {
				for (int var25 = var8; var25 > 0; var25--) {
					if (var11 >= 3) {
						this.method13("Game updated - please reload page", arg2);
						var25 = 10;
					} else {
						this.method13(var12 + " - Retrying in " + var25, arg2);
					}
					try {
						Thread.sleep(1000L);
					} catch (Exception var27) {
					}
				}
				var8 *= 2;
				if (var8 > 60) {
					var8 = 60;
				}
			}
		}
		return new JagFile(var7);
	}

	@ObfuscatedName("client.D(I)V")
	public final void method534() {
		if (this.field1544 != null) {
			return;
		}
		super.field16 = null;
		this.field1485 = null;
		this.field1483 = null;
		this.field1482 = null;
		this.field1484 = null;
		this.field1532 = null;
		this.field1533 = null;
		this.field1534 = null;
		this.field1547 = new PixMap(this.method11(), 128, 265);
		Pix2D.method168();
		this.field1548 = new PixMap(this.method11(), 128, 265);
		Pix2D.method168();
		this.field1544 = new PixMap(this.method11(), 509, 171);
		Pix2D.method168();
		this.field1545 = new PixMap(this.method11(), 360, 132);
		Pix2D.method168();
		this.field1546 = new PixMap(this.method11(), 360, 200);
		Pix2D.method168();
		this.field1549 = new PixMap(this.method11(), 202, 238);
		Pix2D.method168();
		this.field1550 = new PixMap(this.method11(), 203, 238);
		Pix2D.method168();
		this.field1551 = new PixMap(this.method11(), 74, 94);
		Pix2D.method168();
		this.field1552 = new PixMap(this.method11(), 75, 94);
		Pix2D.method168();
		if (this.field1371 != null) {
			this.method526();
			this.method558();
		}
		this.field1448 = true;
	}

	@ObfuscatedName("client.E(I)V")
	public final void method535() {
		this.method445();
		if (this.field1501 == 1) {
			this.field1622[this.field1500 / 100].method199(this.field1498 - 8 - 4, this.field1499 - 8 - 4);
		}
		if (this.field1501 == 2) {
			this.field1622[this.field1500 / 100 + 4].method199(this.field1498 - 8 - 4, this.field1499 - 8 - 4);
			field1511++;
			if (field1511 > 57) {
				field1511 = 0;
				this.field1543.method228(100);
			}
		}
		if (this.field1574 != -1) {
			this.method471(this.field1464, this.field1574);
			this.method446(0, Component.field70[this.field1574], 0, 0);
		}
		if (this.field1523 != -1) {
			this.method471(this.field1464, this.field1523);
			this.method446(0, Component.field70[this.field1523], 0, 0);
		}
		this.method537();
		if (!this.field1384) {
			this.method438();
			this.method462();
		} else if (this.field1214 == 0) {
			this.method548();
		}
		if (this.field1350 == 1) {
			this.field1559[1].method199(472, 296);
		}
		if (this.field1452 == 0) {
			return;
		}
		int var2 = this.field1452 / 50;
		int var3 = var2 / 60;
		int var4 = var2 % 60;
		if (var4 < 10) {
			this.field1345.method217(16776960, 4, 329, "System update in: " + var3 + ":0" + var4);
		} else {
			this.field1345.method217(16776960, 4, 329, "System update in: " + var3 + ":" + var4);
		}
	}

	@ObfuscatedName("client.F(I)V")
	public final void method536() {
		if (this.field1452 > 1) {
			this.field1452--;
		}
		if (this.field1432 > 0) {
			this.field1432--;
		}
		for (int var2 = 0; var2 < 5 && this.method456(); var2++) {
		}
		if (!this.field1238) {
			return;
		}
		Object var3 = this.field1644.field973;
		synchronized (this.field1644.field973) {
			if (!field1397) {
				this.field1644.field974 = 0;
			} else if (super.field29 != 0 || this.field1644.field974 >= 40) {
				this.field1543.method228(232);
				this.field1543.method229(0);
				int var4 = this.field1543.field711;
				int var5 = 0;
				for (int var6 = 0; var6 < this.field1644.field974 && var4 - this.field1543.field711 < 240; var6++) {
					var5++;
					int var7 = this.field1644.field976[var6];
					if (var7 < 0) {
						var7 = 0;
					} else if (var7 > 502) {
						var7 = 502;
					}
					int var8 = this.field1644.field975[var6];
					if (var8 < 0) {
						var8 = 0;
					} else if (var8 > 764) {
						var8 = 764;
					}
					int var9 = var7 * 765 + var8;
					if (this.field1644.field976[var6] == -1 && this.field1644.field975[var6] == -1) {
						var8 = -1;
						var7 = -1;
						var9 = 524287;
					}
					if (var8 != this.field1462 || var7 != this.field1463) {
						int var10 = var8 - this.field1462;
						this.field1462 = var8;
						int var11 = var7 - this.field1463;
						this.field1463 = var7;
						if (this.field1589 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
							var10 += 32;
							var11 += 32;
							this.field1543.method230((this.field1589 << 12) + (var10 << 6) + var11);
							this.field1589 = 0;
						} else if (this.field1589 < 8) {
							this.field1543.method232((this.field1589 << 19) + 8388608 + var9);
							this.field1589 = 0;
						} else {
							this.field1543.method233((this.field1589 << 19) + -1073741824 + var9);
							this.field1589 = 0;
						}
					} else if (this.field1589 < 2047) {
						this.field1589++;
					}
				}
				this.field1543.method238(this.field1543.field711 - var4);
				if (var5 >= this.field1644.field974) {
					this.field1644.field974 = 0;
				} else {
					this.field1644.field974 -= var5;
					for (int var12 = 0; var12 < this.field1644.field974; var12++) {
						this.field1644.field975[var12] = this.field1644.field975[var12 + var5];
						this.field1644.field976[var12] = this.field1644.field976[var12 + var5];
					}
				}
			}
		}
		if (super.field29 != 0) {
			long var13 = (super.field32 - this.field1370) / 50L;
			if (var13 > 4095L) {
				var13 = 4095L;
			}
			this.field1370 = super.field32;
			int var15 = super.field31;
			if (var15 < 0) {
				var15 = 0;
			} else if (var15 > 502) {
				var15 = 502;
			}
			int var16 = super.field30;
			if (var16 < 0) {
				var16 = 0;
			} else if (var16 > 764) {
				var16 = 764;
			}
			int var17 = var15 * 765 + var16;
			byte var18 = 0;
			if (super.field29 == 2) {
				var18 = 1;
			}
			int var19 = (int) var13;
			this.field1543.method228(234);
			this.field1543.method233((var19 << 20) + (var18 << 19) + var17);
		}
		if (this.field1374 > 0) {
			this.field1374--;
		}
		if (super.field33[1] == 1 || super.field33[2] == 1 || super.field33[3] == 1 || super.field33[4] == 1) {
			this.field1375 = true;
		}
		if (this.field1375 && this.field1374 <= 0) {
			this.field1374 = 20;
			this.field1375 = false;
			this.field1543.method228(91);
			this.field1543.method230(this.field1252);
			this.field1543.method230(this.field1253);
		}
		if (super.field20 && !this.field1612) {
			this.field1612 = true;
			this.field1543.method228(8);
			this.field1543.method229(1);
		}
		if (!super.field20 && this.field1612) {
			this.field1612 = false;
			this.field1543.method228(8);
			this.field1543.method229(0);
		}
		this.method435();
		this.method434();
		this.method474();
		Packet var20 = InputTracking.method46();
		if (var20 != null) {
			this.field1543.method228(142);
			this.field1543.method230(var20.field711);
			this.field1543.method237(0, var20.field710, var20.field711);
			var20.method227();
		}
		this.field1430++;
		if (this.field1430 > 750) {
			this.method561();
		}
		this.method520();
		this.method506();
		this.method461();
		this.field1464++;
		if (this.field1501 != 0) {
			this.field1500 += 20;
			if (this.field1500 >= 400) {
				this.field1501 = 0;
			}
		}
		if (this.field1225 != 0) {
			this.field1222++;
			if (this.field1222 >= 15) {
				if (this.field1225 == 2) {
					this.field1200 = true;
				}
				if (this.field1225 == 3) {
					this.field1528 = true;
				}
				this.field1225 = 0;
			}
		}
		if (this.field1366 != 0) {
			this.field1251++;
			if (super.field23 > this.field1367 + 5 || super.field23 < this.field1367 - 5 || super.field24 > this.field1368 + 5 || super.field24 < this.field1368 - 5) {
				this.field1385 = true;
			}
			if (super.field22 == 0) {
				if (this.field1366 == 2) {
					this.field1200 = true;
				}
				if (this.field1366 == 3) {
					this.field1528 = true;
				}
				this.field1366 = 0;
				if (this.field1385 && this.field1251 >= 5) {
					this.field1525 = -1;
					this.method438();
					if (this.field1525 == this.field1364 && this.field1524 != this.field1365) {
						Component var21 = Component.field70[this.field1364];
						byte var22 = 0;
						if (this.field1522 == 1 && var21.field79 == 206) {
							var22 = 1;
						}
						if (var21.field71[this.field1524] <= 0) {
							var22 = 0;
						}
						if (var21.field100) {
							int var23 = this.field1365;
							int var24 = this.field1524;
							var21.field71[var24] = var21.field71[var23];
							var21.field72[var24] = var21.field72[var23];
							var21.field71[var23] = -1;
							var21.field72[var23] = 0;
						} else if (var22 == 1) {
							int var25 = this.field1365;
							int var26 = this.field1524;
							while (var25 != var26) {
								if (var25 > var26) {
									var21.method33(var25 - 1, var25);
									var25--;
								} else if (var25 < var26) {
									var21.method33(var25 + 1, var25);
									var25++;
								}
							}
						} else {
							var21.method33(this.field1524, this.field1365);
						}
						this.field1543.method228(176);
						this.field1543.method230(this.field1364);
						this.field1543.method230(this.field1365);
						this.field1543.method230(this.field1524);
						this.field1543.method229(var22);
					}
				} else if ((this.field1495 == 1 || this.method524(this.field1314 - 1)) && this.field1314 > 2) {
					this.method493();
				} else if (this.field1314 > 0) {
					this.method433(this.field1314 - 1);
				}
				this.field1222 = 10;
				super.field29 = 0;
			}
		}
		field1596++;
		if (field1596 > 62) {
			field1596 = 0;
			this.field1543.method228(182);
		}
		if (World3D.field330 != -1) {
			int var27 = World3D.field330;
			int var28 = World3D.field331;
			boolean var29 = this.method488(0, 0, 0, var27, 0, field1231.field461[0], field1231.field460[0], var28, true, 0, 0);
			World3D.field330 = -1;
			if (var29) {
				this.field1498 = super.field30;
				this.field1499 = super.field31;
				this.field1501 = 1;
				this.field1500 = 0;
			}
		}
		if (super.field29 == 1 && this.field1635 != null) {
			this.field1635 = null;
			this.field1528 = true;
			super.field29 = 0;
		}
		this.method518();
		this.method502();
		this.method467();
		this.method562();
		if (super.field22 == 1 || super.field29 == 1) {
			this.field1361++;
		}
		if (this.field1317 == 2) {
			this.method441();
		}
		if (this.field1317 == 2 && this.field1362) {
			this.method495();
		}
		for (int var30 = 0; var30 < 5; var30++) {
			int var10002 = this.field1412[var30]++;
		}
		this.method464();
		super.field21++;
		if (super.field21 > 4500) {
			this.field1432 = 250;
			super.field21 -= 500;
			this.field1543.method228(144);
		}
		this.field1293++;
		if (this.field1293 > 500) {
			this.field1293 = 0;
			int var31 = (int) (Math.random() * 8.0D);
			if ((var31 & 0x1) == 1) {
				this.field1556 += this.field1557;
			}
			if ((var31 & 0x2) == 2) {
				this.field1272 += this.field1273;
			}
			if ((var31 & 0x4) == 4) {
				this.field1445 += this.field1446;
			}
		}
		if (this.field1556 < -50) {
			this.field1557 = 2;
		}
		if (this.field1556 > 50) {
			this.field1557 = -2;
		}
		if (this.field1272 < -55) {
			this.field1273 = 2;
		}
		if (this.field1272 > 55) {
			this.field1273 = -2;
		}
		if (this.field1445 < -40) {
			this.field1446 = 1;
		}
		if (this.field1445 > 40) {
			this.field1446 = -1;
		}
		this.field1447++;
		if (this.field1447 > 500) {
			this.field1447 = 0;
			int var32 = (int) (Math.random() * 8.0D);
			if ((var32 & 0x1) == 1) {
				this.field1278 += this.field1279;
			}
			if ((var32 & 0x2) == 2) {
				this.field1348 += this.field1349;
			}
		}
		if (this.field1278 < -60) {
			this.field1279 = 2;
		}
		if (this.field1278 > 60) {
			this.field1279 = -2;
		}
		if (this.field1348 < -20) {
			this.field1349 = 1;
		}
		if (this.field1348 > 10) {
			this.field1349 = -1;
		}
		this.field1431++;
		if (this.field1431 > 50) {
			this.field1543.method228(239);
		}
		try {
			if (this.field1607 != null && this.field1543.field711 > 0) {
				this.field1607.method42(this.field1543.field710, 0, this.field1543.field711);
				this.field1543.field711 = 0;
				this.field1431 = 0;
			}
		} catch (IOException var34) {
			this.method561();
		} catch (Exception var35) {
			this.method479();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public final void method537() {
		this.field1450 = 0;
		int var2 = (field1231.field410 >> 7) + this.field1487;
		int var3 = (field1231.field411 >> 7) + this.field1488;
		if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
			this.field1450 = 1;
		}
		if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
			this.field1450 = 1;
		}
		if (this.field1450 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
			this.field1450 = 0;
		}
	}

	@ObfuscatedName("client.H(I)V")
	public final void method538() {
		this.field1485.method268();
		Pix3D.field647 = this.field1613;
		this.field1297.method212(0, 0);
		if (this.field1611) {
			this.field1346.method214(40, this.field1576, 239, 0);
			this.field1346.method214(60, this.field1588 + "*", 239, 128);
		} else if (this.field1621) {
			this.field1346.method214(40, "Enter amount:", 239, 0);
			this.field1346.method214(60, this.field1584 + "*", 239, 128);
		} else if (this.field1635 != null) {
			this.field1346.method214(40, this.field1635, 239, 0);
			this.field1346.method214(60, "Click to continue", 239, 128);
		} else if (this.field1558 != -1) {
			this.method446(0, Component.field70[this.field1558], 0, 0);
		} else if (this.field1289 == -1) {
			PixFont var2 = this.field1345;
			int var3 = 0;
			Pix2D.method167(463, 0, 77, 0);
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.field1247[var4] != null) {
					int var5 = this.field1245[var4];
					int var6 = 70 - var3 * 14 + this.field1343;
					String var7 = this.field1246[var4];
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
							var2.method217(0, 4, var6, this.field1247[var4]);
						}
						var3++;
					}
					if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.field1583 == 0 || this.field1583 == 1 && this.method448(var7))) {
						if (var6 > 0 && var6 < 110) {
							int var9 = 4;
							if (var8 == 1) {
								this.field1630[0].method212(var9, var6 - 12);
								var9 += 14;
							}
							if (var8 == 2) {
								this.field1630[1].method212(var9, var6 - 12);
								var9 += 14;
							}
							var2.method217(0, var9, var6, var7 + ":");
							int var10 = var9 + var2.method216(var7) + 8;
							var2.method217(255, var10, var6, this.field1247[var4]);
						}
						var3++;
					}
					if ((var5 == 3 || var5 == 7) && this.field1342 == 0 && (var5 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var7))) {
						if (var6 > 0 && var6 < 110) {
							byte var11 = 4;
							var2.method217(0, var11, var6, "From");
							int var12 = var11 + var2.method216("From ");
							if (var8 == 1) {
								this.field1630[0].method212(var12, var6 - 12);
								var12 += 14;
							}
							if (var8 == 2) {
								this.field1630[1].method212(var12, var6 - 12);
								var12 += 14;
							}
							var2.method217(0, var12, var6, var7 + ":");
							int var13 = var12 + var2.method216(var7) + 8;
							var2.method217(8388608, var13, var6, this.field1247[var4]);
						}
						var3++;
					}
					if (var5 == 4 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.method217(8388736, 4, var6, var7 + " " + this.field1247[var4]);
						}
						var3++;
					}
					if (var5 == 5 && this.field1342 == 0 && this.field1625 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method217(8388608, 4, var6, this.field1247[var4]);
						}
						var3++;
					}
					if (var5 == 6 && this.field1342 == 0 && this.field1625 < 2) {
						if (var6 > 0 && var6 < 110) {
							var2.method217(0, 4, var6, "To " + var7 + ":");
							var2.method217(8388608, var2.method216("To " + var7) + 12, var6, this.field1247[var4]);
						}
						var3++;
					}
					if (var5 == 8 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var7))) {
						if (var6 > 0 && var6 < 110) {
							var2.method217(8270336, 4, var6, var7 + " " + this.field1247[var4]);
						}
						var3++;
					}
				}
			}
			Pix2D.method166();
			this.field1509 = var3 * 14 + 7;
			if (this.field1509 < 78) {
				this.field1509 = 78;
			}
			this.method478(77, this.field1509, 463, this.field1509 - this.field1343 - 77, 0);
			String var14;
			if (field1231 == null || field1231.field468 == null) {
				var14 = JString.method314(this.field1426);
			} else {
				var14 = field1231.field468;
			}
			var2.method217(0, 4, 90, var14 + ":");
			var2.method217(255, var2.method216(var14 + ": ") + 6, 90, this.field1555 + "*");
			Pix2D.method173(0, 77, 0, 479);
		} else {
			this.method446(0, Component.field70[this.field1289], 0, 0);
		}
		if (this.field1384 && this.field1214 == 2) {
			this.method548();
		}
		this.field1485.method269(357, 17, super.field15);
		this.field1484.method268();
		Pix3D.field647 = this.field1615;
	}

	@ObfuscatedName("client.I(I)V")
	public final void method539() {
		MapSpotAnim var2 = (MapSpotAnim) this.field1423.method258();
		while (var2 != null) {
			if (var2.field610 != this.field1277 || var2.field616) {
				var2.method120();
			} else if (field1591 >= var2.field609) {
				var2.method164(this.field1464);
				if (var2.field616) {
					var2.method120();
				} else {
					this.field1325.method75(0, -1, 60, var2.field611, var2, var2.field613, var2.field610, false, var2.field612);
				}
			}
			var2 = (MapSpotAnim) this.field1423.method260();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public final void method540() {
		this.field1320++;
		this.method528(true);
		this.method477(true);
		this.method528(false);
		this.method477(false);
		this.method559();
		this.method539();
		if (!this.field1362) {
			int var2 = this.field1252;
			if (this.field1394 / 256 > var2) {
				var2 = this.field1394 / 256;
			}
			if (this.field1649[4] && this.field1520[4] + 128 > var2) {
				var2 = this.field1520[4] + 128;
			}
			int var3 = this.field1253 + this.field1445 & 0x7FF;
			this.method525(var2, this.field1372, this.method470(field1231.field411, this.field1277, field1231.field410) - 50, this.field1373, var2 * 3 + 600, var3);
		}
		int var4;
		if (this.field1362) {
			var4 = this.method482();
		} else {
			var4 = this.method481();
		}
		int var5 = this.field1266;
		int var6 = this.field1267;
		int var7 = this.field1268;
		int var8 = this.field1269;
		int var9 = this.field1270;
		for (int var10 = 0; var10 < 5; var10++) {
			if (this.field1649[var10]) {
				int var11 = (int) (Math.random() * (double) (this.field1261[var10] * 2 + 1) - (double) this.field1261[var10] + Math.sin((double) this.field1412[var10] * ((double) this.field1311[var10] / 100.0D)) * (double) this.field1520[var10]);
				if (var10 == 0) {
					this.field1266 += var11;
				}
				if (var10 == 1) {
					this.field1267 += var11;
				}
				if (var10 == 2) {
					this.field1268 += var11;
				}
				if (var10 == 3) {
					this.field1270 = this.field1270 + var11 & 0x7FF;
				}
				if (var10 == 4) {
					this.field1269 += var11;
					if (this.field1269 < 128) {
						this.field1269 = 128;
					}
					if (this.field1269 > 383) {
						this.field1269 = 383;
					}
				}
			}
		}
		int var12 = Pix3D.field656;
		Model.field597 = true;
		Model.field600 = 0;
		Model.field598 = super.field23 - 4;
		Model.field599 = super.field24 - 4;
		Pix2D.method168();
		this.field1325.method103(this.field1266, this.field1268, this.field1269, this.field1267, var4, this.field1270);
		this.field1325.method78();
		this.method557();
		this.method499();
		this.method494(var12);
		this.method535();
		this.field1484.method269(4, 4, super.field15);
		this.field1266 = var5;
		this.field1267 = var6;
		this.field1268 = var7;
		this.field1269 = var8;
		this.field1270 = var9;
	}

	@ObfuscatedName("client.a(IZ[B)V")
	public final void method541(boolean arg1, byte[] arg2) {
		signlink.midifade = arg1 ? 1 : 0;
		signlink.midisave(arg2, arg2.length);
	}

	@ObfuscatedName("client.a(IIIBIIIIII)V")
	public final void method542(int arg0, int arg1, int arg2, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LocChange var11 = null;
		for (LocChange var12 = (LocChange) this.field1636.method258(); var12 != null; var12 = (LocChange) this.field1636.method260()) {
			if (var12.field729 == arg0 && var12.field731 == arg1 && var12.field732 == arg8 && var12.field730 == arg6) {
				var11 = var12;
				break;
			}
		}
		if (var11 == null) {
			var11 = new LocChange();
			var11.field729 = arg0;
			var11.field730 = arg6;
			var11.field731 = arg1;
			var11.field732 = arg8;
			this.method454(var11);
			this.field1636.method255(var11);
		}
		var11.field736 = arg4;
		var11.field738 = arg5;
		var11.field737 = arg9;
		var11.field739 = arg2;
		var11.field740 = arg7;
	}

	@ObfuscatedName("client.j(B)V")
	public static final void method543() {
		World3D.field296 = false;
		Pix3D.field636 = false;
		field1242 = false;
		World.field44 = false;
	}

	public final void run() {
		if (this.field1369) {
			this.method523();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.b(BI)Ljava/lang/String;")
	public static final String method544(int arg1) {
		if (arg1 < 100000) {
			return String.valueOf(arg1);
		} else if (arg1 < 10000000) {
			return arg1 / 1000 + "K";
		} else {
			return arg1 / 1000000 + "M";
		}
	}

	@ObfuscatedName("client.K(I)V")
	public final void method545() {
		this.field1627 = false;
		while (this.field1395) {
			this.field1627 = false;
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
		this.field1392 = null;
		this.field1393 = null;
		this.field1626 = null;
		this.field1639 = null;
		this.field1640 = null;
		this.field1641 = null;
		this.field1642 = null;
		this.field1264 = null;
		this.field1265 = null;
		this.field1465 = null;
		this.field1466 = null;
		this.field1518 = null;
		this.field1519 = null;
	}

	@ObfuscatedName("client.a(IILd;)I")
	public final int method546(int arg0, Component arg2) {
		if (arg2.field85 == null || arg0 >= arg2.field85.length) {
			return -2;
		}
		try {
			int[] var4 = arg2.field85[arg0];
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
					var9 = this.field1419[var4[var6++]];
				}
				if (var8 == 2) {
					var9 = this.field1467[var4[var6++]];
				}
				if (var8 == 3) {
					var9 = this.field1575[var4[var6++]];
				}
				if (var8 == 4) {
					Component var11 = Component.field70[var4[var6++]];
					int var12 = var4[var6++];
					if (var12 >= 0 && var12 < ObjType.field1016 && (!ObjType.method350(var12).field1037 || field1241)) {
						for (int var13 = 0; var13 < var11.field71.length; var13++) {
							if (var11.field71[var13] == var12 + 1) {
								var9 += var11.field72[var13];
							}
						}
					}
				}
				if (var8 == 5) {
					var9 = this.field1211[var4[var6++]];
				}
				if (var8 == 6) {
					var9 = field1474[this.field1467[var4[var6++]] - 1];
				}
				if (var8 == 7) {
					var9 = this.field1211[var4[var6++]] * 100 / 46875;
				}
				if (var8 == 8) {
					var9 = field1231.field474;
				}
				if (var8 == 9) {
					for (int var14 = 0; var14 < Stats.field1128; var14++) {
						if (Stats.field1130[var14]) {
							var9 += this.field1467[var14];
						}
					}
				}
				if (var8 == 10) {
					Component var15 = Component.field70[var4[var6++]];
					int var16 = var4[var6++] + 1;
					if (var16 >= 0 && var16 < ObjType.field1016 && (!ObjType.method350(var16).field1037 || field1241)) {
						for (int var17 = 0; var17 < var15.field71.length; var17++) {
							if (var15.field71[var17] == var16) {
								var9 = 999999999;
								break;
							}
						}
					}
				}
				if (var8 == 11) {
					var9 = this.field1326;
				}
				if (var8 == 12) {
					var9 = this.field1404;
				}
				if (var8 == 13) {
					int var18 = this.field1211[var4[var6++]];
					int var19 = var4[var6++];
					var9 = (var18 & 0x1 << var19) == 0 ? 0 : 1;
				}
				if (var8 == 14) {
					int var20 = var4[var6++];
					VarBitType var21 = VarBitType.field1147[var20];
					int var22 = var21.field1149;
					int var23 = var21.field1150;
					int var24 = var21.field1151;
					int var25 = field1471[var24 - var23];
					var9 = this.field1211[var22] >> var23 & var25;
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
					var9 = (field1231.field410 >> 7) + this.field1487;
				}
				if (var8 == 19) {
					var9 = (field1231.field411 >> 7) + this.field1488;
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

	@ObfuscatedName("client.a(IIIIIIZI)V")
	public final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg7) {
		if (arg7 < 1 || arg3 < 1 || arg7 > 102 || arg3 > 102) {
			return;
		}
		if (field1242 && arg0 != this.field1277) {
			return;
		}
		int var9 = 0;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12 = false;
		if (arg4 == 0) {
			var9 = this.field1325.method90(arg0, arg7, arg3);
		}
		if (arg4 == 1) {
			var9 = this.field1325.method91(arg7, arg0, arg3);
		}
		if (arg4 == 2) {
			var9 = this.field1325.method92(arg0, arg7, arg3);
		}
		if (arg4 == 3) {
			var9 = this.field1325.method93(arg0, arg7, arg3);
		}
		if (var9 != 0) {
			int var13 = this.field1325.method94(arg0, arg7, arg3, var9);
			int var14 = var9 >> 14 & 0x7FFF;
			int var15 = var13 & 0x1F;
			int var16 = var13 >> 6;
			if (arg4 == 0) {
				this.field1325.method81(arg7, arg0, arg3);
				LocType var17 = LocType.method334(var14);
				if (var17.field943) {
					this.field1233[arg0].method366(var15, arg7, var16, arg3, var17.field944);
				}
			}
			if (arg4 == 1) {
				this.field1325.method82(arg7, arg3, arg0);
			}
			if (arg4 == 2) {
				this.field1325.method83(arg3, arg7, arg0);
				LocType var18 = LocType.method334(var14);
				if (arg7 + var18.field941 > 103 || arg3 + var18.field941 > 103 || arg7 + var18.field942 > 103 || arg3 + var18.field942 > 103) {
					return;
				}
				if (var18.field943) {
					this.field1233[arg0].method367(var18.field944, var18.field941, arg3, var18.field942, var16, arg7);
				}
			}
			if (arg4 == 3) {
				this.field1325.method84(arg0, arg3, arg7);
				LocType var19 = LocType.method334(var14);
				if (var19.field943 && var19.field945) {
					this.field1233[arg0].method369(arg3, arg7);
				}
			}
		}
		if (arg2 >= 0) {
			int var20 = arg0;
			if (arg0 < 3 && (this.field1512[1][arg7][arg3] & 0x2) == 2) {
				var20 = arg0 + 1;
			}
			World.method31(arg1, arg7, this.field1233[arg0], arg3, arg5, arg2, this.field1325, this.field1276, var20, arg0);
		}
	}

	@ObfuscatedName("client.k(B)V")
	public final void method548() {
		int var2 = this.field1215;
		int var3 = this.field1216;
		int var4 = this.field1217;
		int var5 = this.field1218;
		int var6 = 6116423;
		Pix2D.method170(var5, var4, var2, var3, var6);
		Pix2D.method170(16, var4 - 2, var2 + 1, var3 + 1, 0);
		Pix2D.method171(0, var4 - 2, var3 + 18, var2 + 1, var5 - 19);
		this.field1346.method217(var6, var2 + 3, var3 + 14, "Choose Option");
		int var7 = super.field23;
		int var8 = super.field24;
		if (this.field1214 == 0) {
			var7 -= 4;
			var8 -= 4;
		}
		if (this.field1214 == 1) {
			var7 -= 553;
			var8 -= 205;
		}
		if (this.field1214 == 2) {
			var7 -= 17;
			var8 -= 357;
		}
		for (int var10 = 0; var10 < this.field1314; var10++) {
			int var11 = var3 + 31 + (this.field1314 - 1 - var10) * 15;
			int var12 = 16777215;
			if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3) {
				var12 = 16776960;
			}
			this.field1346.method219(true, this.field1292[var10], var11, var12, var2 + 3);
		}
	}

	@ObfuscatedName("client.c(Lmb;II)V")
	public final void method549(Packet arg0, int arg2) {
		this.field1453 = 0;
		this.field1381 = 0;
		this.method466(arg2, arg0);
		this.method519(arg0, arg2);
		this.method551(arg2, arg0);
		this.method497(arg0, arg2);
		for (int var4 = 0; var4 < this.field1453; var4++) {
			int var5 = this.field1454[var4];
			if (this.field1378[var5].field455 != field1591) {
				this.field1378[var5] = null;
			}
		}
		if (arg0.field711 != arg2) {
			signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field711 + " psize:" + arg2);
			throw new RuntimeException("eek");
		}
		for (int var6 = 0; var6 < this.field1379; var6++) {
			if (this.field1378[this.field1380[var6]] == null) {
				signlink.reporterror(this.field1426 + " null entry in pl list - pos:" + var6 + " size:" + this.field1379);
				throw new RuntimeException("eek");
			}
		}
	}

	@ObfuscatedName("client.L(I)Ljava/lang/String;")
	public final String method550() {
		if (signlink.mainapp == null) {
			return super.field18 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
		} else {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedName("client.a(IILmb;)V")
	public final void method551(int arg0, Packet arg2) {
		while (true) {
			if (arg2.field712 + 10 < arg0 * 8) {
				int var4 = arg2.method250(11);
				if (var4 != 2047) {
					if (this.field1378[var4] == null) {
						this.field1378[var4] = new ClientPlayer();
						if (this.field1383[var4] != null) {
							this.field1378[var4].method130(this.field1383[var4]);
						}
					}
					this.field1380[this.field1379++] = var4;
					ClientPlayer var5 = this.field1378[var4];
					var5.field455 = field1591;
					int var6 = arg2.method250(5);
					if (var6 > 15) {
						var6 -= 32;
					}
					int var7 = arg2.method250(5);
					if (var7 > 15) {
						var7 -= 32;
					}
					int var8 = arg2.method250(1);
					var5.method124(field1231.field461[0] + var7, field1231.field460[0] + var6, var8 == 1);
					int var9 = arg2.method250(1);
					if (var9 == 1) {
						this.field1382[this.field1381++] = var4;
					}
					continue;
				}
			}
			arg2.method251();
			return;
		}
	}

	@ObfuscatedName("client.l(B)V")
	public final void method552() {
		if (this.field1493 == 0) {
			int var2 = super.field13 / 2 - 80;
			int var3 = super.field14 / 2 + 20;
			int var14 = var3 + 20;
			if (super.field29 == 1 && super.field30 >= var2 - 75 && super.field30 <= var2 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
				this.field1493 = 3;
				this.field1422 = 0;
			}
			int var4 = super.field13 / 2 + 80;
			if (super.field29 == 1 && super.field30 >= var4 - 75 && super.field30 <= var4 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
				this.field1417 = "";
				this.field1418 = "Enter your username & password.";
				this.field1493 = 2;
				this.field1422 = 0;
			}
		} else if (this.field1493 == 2) {
			int var5 = super.field14 / 2 - 40;
			int var15 = var5 + 30;
			int var16 = var15 + 25;
			if (super.field29 == 1 && super.field31 >= var16 - 15 && super.field31 < var16) {
				this.field1422 = 0;
			}
			var5 = var16 + 15;
			if (super.field29 == 1 && super.field31 >= var5 - 15 && super.field31 < var5) {
				this.field1422 = 1;
			}
			var5 += 15;
			int var6 = super.field13 / 2 - 80;
			int var7 = super.field14 / 2 + 50;
			int var17 = var7 + 20;
			if (super.field29 == 1 && super.field30 >= var6 - 75 && super.field30 <= var6 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
				this.method459(this.field1426, this.field1427, false);
				if (this.field1238) {
					return;
				}
			}
			int var8 = super.field13 / 2 + 80;
			if (super.field29 == 1 && super.field30 >= var8 - 75 && super.field30 <= var8 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
				this.field1493 = 0;
				this.field1426 = "";
				this.field1427 = "";
			}
			while (true) {
				while (true) {
					int var9 = this.method5();
					if (var9 == -1) {
						return;
					}
					boolean var10 = false;
					for (int var11 = 0; var11 < field1258.length(); var11++) {
						if (var9 == field1258.charAt(var11)) {
							var10 = true;
							break;
						}
					}
					if (this.field1422 == 0) {
						if (var9 == 8 && this.field1426.length() > 0) {
							this.field1426 = this.field1426.substring(0, this.field1426.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field1422 = 1;
						}
						if (var10) {
							this.field1426 = this.field1426 + (char) var9;
						}
						if (this.field1426.length() > 12) {
							this.field1426 = this.field1426.substring(0, 12);
						}
					} else if (this.field1422 == 1) {
						if (var9 == 8 && this.field1427.length() > 0) {
							this.field1427 = this.field1427.substring(0, this.field1427.length() - 1);
						}
						if (var9 == 9 || var9 == 10 || var9 == 13) {
							this.field1422 = 0;
						}
						if (var10) {
							this.field1427 = this.field1427 + (char) var9;
						}
						if (this.field1427.length() > 20) {
							this.field1427 = this.field1427.substring(0, 20);
						}
					}
				}
			}
		} else if (this.field1493 == 3) {
			int var12 = super.field13 / 2;
			int var13 = super.field14 / 2 + 50;
			int var18 = var13 + 20;
			if (super.field29 == 1 && super.field30 >= var12 - 75 && super.field30 <= var12 + 75 && super.field31 >= var18 - 20 && super.field31 <= var18 + 20) {
				this.field1493 = 0;
				return;
			}
		}
	}

	@ObfuscatedName("client.m(B)V")
	public final void method553() {
		try {
			this.field1638 = -1;
			this.field1423.method262();
			this.field1451.method262();
			Pix3D.method180();
			this.method457();
			this.field1325.method64();
			for (int var2 = 0; var2 < 4; var2++) {
				this.field1233[var2].method361();
			}
			System.gc();
			World var3 = new World(this.field1512, this.field1276, 104, 104);
			int var4 = this.field1472.length;
			World.field44 = World3D.field296;
			for (int var5 = 0; var5 < var4; var5++) {
				int var6 = this.field1504[var5] >> 8;
				int var7 = this.field1504[var5] & 0xFF;
				if (var6 == 33 && var7 >= 71 && var7 <= 73) {
					World.field44 = false;
				}
			}
			if (World.field44) {
				this.field1325.method65(this.field1277);
			} else {
				this.field1325.method65(0);
			}
			this.field1543.method228(239);
			for (int var8 = 0; var8 < var4; var8++) {
				int var9 = (this.field1504[var8] >> 8) * 64 - this.field1487;
				int var10 = (this.field1504[var8] & 0xFF) * 64 - this.field1488;
				byte[] var11 = this.field1472[var8];
				if (var11 != null) {
					var3.method15(var9, (this.field1480 - 6) * 8, var11, (this.field1481 - 6) * 8, var10);
				}
			}
			for (int var12 = 0; var12 < var4; var12++) {
				int var13 = (this.field1504[var12] >> 8) * 64 - this.field1487;
				int var14 = (this.field1504[var12] & 0xFF) * 64 - this.field1488;
				byte[] var15 = this.field1472[var12];
				if (var15 == null && this.field1481 < 800) {
					var3.method14(64, var13, var14, 64);
				}
			}
			this.field1543.method228(239);
			for (int var16 = 0; var16 < var4; var16++) {
				byte[] var17 = this.field1436[var16];
				if (var17 != null) {
					int var18 = (this.field1504[var16] >> 8) * 64 - this.field1487;
					int var19 = (this.field1504[var16] & 0xFF) * 64 - this.field1488;
					var3.method18(var19, this.field1325, var18, var17, this.field1233);
				}
			}
			this.field1543.method228(239);
			var3.method20(this.field1325, this.field1233);
			this.field1484.method268();
			this.field1543.method228(239);
			for (int var20 = 0; var20 < 104; var20++) {
				for (int var21 = 0; var21 < 104; var21++) {
					this.method529(var20, var21);
				}
			}
			this.method555();
		} catch (Exception var34) {
		}
		LocType.field968.method117();
		if (field1242 && signlink.cache_dat != null) {
			int var23 = this.field1415.method282(0);
			for (int var24 = 0; var24 < var23; var24++) {
				int var25 = this.field1415.method287(var24);
				if ((var25 & 0x79) == 0) {
					Model.method138(true, var24);
				}
			}
		}
		System.gc();
		Pix3D.method181(20);
		this.field1415.method293();
		int var26 = (this.field1480 - 6) / 8 - 1;
		int var27 = (this.field1480 + 6) / 8 + 1;
		int var28 = (this.field1481 - 6) / 8 - 1;
		int var29 = (this.field1481 + 6) / 8 + 1;
		if (this.field1275) {
			var26 = 49;
			var27 = 50;
			var28 = 49;
			var29 = 50;
		}
		for (int var30 = var26; var30 <= var27; var30++) {
			for (int var31 = var28; var31 <= var29; var31++) {
				if (var30 == var26 || var30 == var27 || var31 == var28 || var31 == var29) {
					int var32 = this.field1415.method284(var30, var31, 0);
					if (var32 != -1) {
						this.field1415.method294(3, var32);
					}
					int var33 = this.field1415.method284(var30, var31, 1);
					if (var33 != -1) {
						this.field1415.method294(3, var33);
					}
				}
			}
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	public final void method12(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method12(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.a(Lkb;B)V")
	public final void method554(Pix8 arg0) {
		short var3 = 256;
		for (int var4 = 0; var4 < this.field1264.length; var4++) {
			this.field1264[var4] = 0;
		}
		for (int var5 = 0; var5 < 5000; var5++) {
			int var6 = (int) (Math.random() * 128.0D * (double) var3);
			this.field1264[var6] = (int) (Math.random() * 256.0D);
		}
		for (int var7 = 0; var7 < 20; var7++) {
			for (int var8 = 1; var8 < var3 - 1; var8++) {
				for (int var9 = 1; var9 < 127; var9++) {
					int var10 = var9 + (var8 << 7);
					this.field1265[var10] = (this.field1264[var10 - 1] + this.field1264[var10 + 1] + this.field1264[var10 - 128] + this.field1264[var10 + 128]) / 4;
				}
			}
			int[] var11 = this.field1264;
			this.field1264 = this.field1265;
			this.field1265 = var11;
		}
		if (arg0 == null) {
			return;
		}
		int var14 = 0;
		for (int var15 = 0; var15 < arg0.field677; var15++) {
			for (int var16 = 0; var16 < arg0.field676; var16++) {
				if (arg0.field674[var14++] != 0) {
					int var17 = var16 + 16 + arg0.field678;
					int var18 = var15 + 16 + arg0.field679;
					int var19 = var17 + (var18 << 7);
					this.field1264[var19] = 0;
				}
			}
		}
	}

	@ObfuscatedName("client.M(I)V")
	public final void method555() {
		for (LocChange var2 = (LocChange) this.field1636.method258(); var2 != null; var2 = (LocChange) this.field1636.method260()) {
			if (var2.field740 == -1) {
				var2.field739 = 0;
				this.method454(var2);
			} else {
				var2.method120();
			}
		}
	}

	@ObfuscatedName("client.b(Ljb;III)V")
	public final void method556(Pix32 arg0, int arg1, int arg2) {
		int var6 = arg1 * arg1 + arg2 * arg2;
		if (var6 <= 4225 || var6 >= 90000) {
			this.method473(arg0, arg2, arg1);
			return;
		}
		int var7 = this.field1253 + this.field1278 & 0x7FF;
		int var8 = Model.field602[var7];
		int var9 = Model.field603[var7];
		int var10 = var8 * 256 / (this.field1348 + 256);
		int var11 = var9 * 256 / (this.field1348 + 256);
		int var12 = arg2 * var10 + arg1 * var11 >> 16;
		int var13 = arg2 * var11 - arg1 * var10 >> 16;
		double var14 = Math.atan2((double) var12, (double) var13);
		int var16 = (int) (Math.sin(var14) * 63.0D);
		int var17 = (int) (Math.cos(var14) * 57.0D);
		this.field1590.method204(83 - var17 - 20, 20, 256, 15, var16 + 94 + 4 - 10, 20, var14, 15);
	}

	@ObfuscatedName("client.N(I)V")
	public final void method557() {
		this.field1328 = 0;
		for (int var2 = -1; var2 < this.field1379 + this.field1220; var2++) {
			ClientEntity var3;
			if (var2 == -1) {
				var3 = field1231;
			} else if (var2 < this.field1379) {
				var3 = this.field1378[this.field1380[var2]];
			} else {
				var3 = this.field1219[this.field1221[var2 - this.field1379]];
			}
			if (var3 != null && var3.method127()) {
				if (var2 >= this.field1379) {
					NpcType var7 = ((ClientNpc) var3).field465;
					if (var7.field1008 >= 0 && var7.field1008 < this.field1559.length) {
						this.method486(var3.field456 + 15, var3);
						if (this.field1298 > -1) {
							this.field1559[var7.field1008].method199(this.field1298 - 12, this.field1299 - 30);
						}
					}
					if (this.field1458 == 1 && this.field1234 == this.field1221[var2 - this.field1379] && field1591 % 20 < 10) {
						this.method486(var3.field456 + 15, var3);
						if (this.field1298 > -1) {
							this.field1559[2].method199(this.field1298 - 12, this.field1299 - 28);
						}
					}
				} else {
					int var4 = 30;
					ClientPlayer var5 = (ClientPlayer) var3;
					if (var5.field471 != 0) {
						this.method486(var3.field456 + 15, var3);
						if (this.field1298 > -1) {
							for (int var6 = 0; var6 < 8; var6++) {
								if ((var5.field471 & 0x1 << var6) != 0) {
									this.field1559[var6].method199(this.field1298 - 12, this.field1299 - var4);
									var4 -= 25;
								}
							}
						}
					}
					if (var2 >= 0 && this.field1458 == 10 && this.field1437 == this.field1380[var2]) {
						this.method486(var3.field456 + 15, var3);
						if (this.field1298 > -1) {
							this.field1559[7].method199(this.field1298 - 12, this.field1299 - var4);
						}
					}
				}
				if (var3.field422 != null && (var2 >= this.field1379 || this.field1583 == 0 || this.field1583 == 3 || this.field1583 == 1 && this.method448(((ClientPlayer) var3).field468))) {
					this.method486(var3.field456, var3);
					if (this.field1298 > -1 && this.field1328 < this.field1329) {
						this.field1333[this.field1328] = this.field1346.method216(var3.field422) / 2;
						this.field1332[this.field1328] = this.field1346.field694;
						this.field1330[this.field1328] = this.field1298;
						this.field1331[this.field1328] = this.field1299;
						this.field1334[this.field1328] = var3.field424;
						this.field1335[this.field1328] = var3.field425;
						this.field1336[this.field1328] = var3.field423;
						this.field1337[this.field1328++] = var3.field422;
						if (this.field1386 == 0 && var3.field425 == 1) {
							this.field1332[this.field1328] += 10;
							this.field1331[this.field1328] += 5;
						}
						if (this.field1386 == 0 && var3.field425 == 2) {
							this.field1333[this.field1328] = 60;
						}
					}
				}
				if (var3.field429 > field1591) {
					this.method486(var3.field456 + 15, var3);
					if (this.field1298 > -1) {
						int var8 = var3.field430 * 30 / var3.field431;
						if (var8 > 30) {
							var8 = 30;
						}
						Pix2D.method170(5, var8, this.field1298 - 15, this.field1299 - 3, 65280);
						Pix2D.method170(5, 30 - var8, this.field1298 - 15 + var8, this.field1299 - 3, 16711680);
					}
				}
				for (int var9 = 0; var9 < 4; var9++) {
					if (var3.field428[var9] > field1591) {
						this.method486(var3.field456 / 2, var3);
						if (this.field1298 > -1) {
							if (var9 == 1) {
								this.field1299 -= 20;
							}
							if (var9 == 2) {
								this.field1298 -= 15;
								this.field1299 -= 10;
							}
							if (var9 == 3) {
								this.field1298 += 15;
								this.field1299 -= 10;
							}
							this.field1353[var3.field427[var9]].method199(this.field1298 - 12, this.field1299 - 12);
							this.field1344.method214(this.field1299 + 4, String.valueOf(var3.field426[var9]), this.field1298, 0);
							this.field1344.method214(this.field1299 + 3, String.valueOf(var3.field426[var9]), this.field1298 - 1, 16777215);
						}
					}
				}
			}
		}
		for (int var10 = 0; var10 < this.field1328; var10++) {
			int var11 = this.field1330[var10];
			int var12 = this.field1331[var10];
			int var13 = this.field1333[var10];
			int var14 = this.field1332[var10];
			boolean var15 = true;
			while (var15) {
				var15 = false;
				for (int var16 = 0; var16 < var10; var16++) {
					if (var12 + 2 > this.field1331[var16] - this.field1332[var16] && var12 - var14 < this.field1331[var16] + 2 && var11 - var13 < this.field1330[var16] + this.field1333[var16] && var11 + var13 > this.field1330[var16] - this.field1333[var16] && this.field1331[var16] - this.field1332[var16] < var12) {
						var12 = this.field1331[var16] - this.field1332[var16];
						var15 = true;
					}
				}
			}
			this.field1298 = this.field1330[var10];
			this.field1299 = this.field1331[var10] = var12;
			String var17 = this.field1337[var10];
			if (this.field1386 == 0) {
				int var18 = 16776960;
				if (this.field1334[var10] < 6) {
					var18 = this.field1244[this.field1334[var10]];
				}
				if (this.field1334[var10] == 6) {
					var18 = this.field1320 % 20 < 10 ? 16711680 : 16776960;
				}
				if (this.field1334[var10] == 7) {
					var18 = this.field1320 % 20 < 10 ? 255 : 65535;
				}
				if (this.field1334[var10] == 8) {
					var18 = this.field1320 % 20 < 10 ? 45056 : 8454016;
				}
				if (this.field1334[var10] == 9) {
					int var19 = 150 - this.field1336[var10];
					if (var19 < 50) {
						var18 = var19 * 1280 + 16711680;
					} else if (var19 < 100) {
						var18 = 16776960 - (var19 - 50) * 327680;
					} else if (var19 < 150) {
						var18 = (var19 - 100) * 5 + 65280;
					}
				}
				if (this.field1334[var10] == 10) {
					int var20 = 150 - this.field1336[var10];
					if (var20 < 50) {
						var18 = var20 * 5 + 16711680;
					} else if (var20 < 100) {
						var18 = 16711935 - (var20 - 50) * 327680;
					} else if (var20 < 150) {
						var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
					}
				}
				if (this.field1334[var10] == 11) {
					int var21 = 150 - this.field1336[var10];
					if (var21 < 50) {
						var18 = 16777215 - var21 * 327685;
					} else if (var21 < 100) {
						var18 = (var21 - 50) * 327685 + 65280;
					} else if (var21 < 150) {
						var18 = 16777215 - (var21 - 100) * 327680;
					}
				}
				if (this.field1335[var10] == 0) {
					this.field1346.method214(this.field1299 + 1, var17, this.field1298, 0);
					this.field1346.method214(this.field1299, var17, this.field1298, var18);
				}
				if (this.field1335[var10] == 1) {
					this.field1346.method218(this.field1320, 0, this.field1298, var17, this.field1299 + 1);
					this.field1346.method218(this.field1320, var18, this.field1298, var17, this.field1299);
				}
				if (this.field1335[var10] == 2) {
					int var22 = this.field1346.method216(var17);
					int var23 = (150 - this.field1336[var10]) * (var22 + 100) / 150;
					Pix2D.method167(this.field1298 + 50, this.field1298 - 50, 334, 0);
					this.field1346.method217(0, this.field1298 + 50 - var23, this.field1299 + 1, var17);
					this.field1346.method217(var18, this.field1298 + 50 - var23, this.field1299, var17);
					Pix2D.method166();
				}
			} else {
				this.field1346.method214(this.field1299 + 1, var17, this.field1298, 0);
				this.field1346.method214(this.field1299, var17, this.field1298, 16776960);
			}
		}
	}

	@ObfuscatedName("client.O(I)V")
	public final void method558() {
		this.field1392 = new Pix8(this.field1371, "titlebox", 0);
		this.field1393 = new Pix8(this.field1371, "titlebutton", 0);
		this.field1626 = new Pix8[12];
		for (int var2 = 0; var2 < 12; var2++) {
			this.field1626[var2] = new Pix8(this.field1371, "runes", var2);
		}
		this.field1518 = new Pix32(128, 265);
		this.field1519 = new Pix32(128, 265);
		for (int var3 = 0; var3 < 33920; var3++) {
			this.field1518.field666[var3] = this.field1547.field749[var3];
		}
		for (int var4 = 0; var4 < 33920; var4++) {
			this.field1519.field666[var4] = this.field1548.field749[var4];
		}
		this.field1640 = new int[256];
		for (int var5 = 0; var5 < 64; var5++) {
			this.field1640[var5] = var5 * 262144;
		}
		for (int var6 = 0; var6 < 64; var6++) {
			this.field1640[var6 + 64] = var6 * 1024 + 16711680;
		}
		for (int var7 = 0; var7 < 64; var7++) {
			this.field1640[var7 + 128] = var7 * 4 + 16776960;
		}
		for (int var8 = 0; var8 < 64; var8++) {
			this.field1640[var8 + 192] = 16777215;
		}
		this.field1641 = new int[256];
		for (int var9 = 0; var9 < 64; var9++) {
			this.field1641[var9] = var9 * 1024;
		}
		for (int var10 = 0; var10 < 64; var10++) {
			this.field1641[var10 + 64] = var10 * 4 + 65280;
		}
		for (int var11 = 0; var11 < 64; var11++) {
			this.field1641[var11 + 128] = var11 * 262144 + 65535;
		}
		for (int var12 = 0; var12 < 64; var12++) {
			this.field1641[var12 + 192] = 16777215;
		}
		this.field1642 = new int[256];
		for (int var13 = 0; var13 < 64; var13++) {
			this.field1642[var13] = var13 * 4;
		}
		for (int var14 = 0; var14 < 64; var14++) {
			this.field1642[var14 + 64] = var14 * 262144 + 255;
		}
		for (int var15 = 0; var15 < 64; var15++) {
			this.field1642[var15 + 128] = var15 * 1024 + 16711935;
		}
		for (int var16 = 0; var16 < 64; var16++) {
			this.field1642[var16 + 192] = 16777215;
		}
		this.field1639 = new int[256];
		this.field1264 = new int[32768];
		this.field1265 = new int[32768];
		this.method554(null);
		this.field1465 = new int[32768];
		this.field1466 = new int[32768];
		this.method13("Connecting to fileserver", 10);
		if (!this.field1627) {
			this.field1369 = true;
			this.field1627 = true;
			this.method12(this, 2);
		}
	}

	@ObfuscatedName("client.P(I)V")
	public final void method559() {
		for (ClientProj var3 = (ClientProj) this.field1451.method258(); var3 != null; var3 = (ClientProj) this.field1451.method260()) {
			if (var3.field506 != this.field1277 || field1591 > var3.field512) {
				var3.method120();
			} else if (field1591 >= var3.field511) {
				if (var3.field515 > 0) {
					ClientNpc var4 = this.field1219[var3.field515 - 1];
					if (var4 != null && var4.field410 >= 0 && var4.field410 < 13312 && var4.field411 >= 0 && var4.field411 < 13312) {
						var3.method133(var4.field411, this.method470(var4.field411, var3.field506, var4.field410) - var3.field510, var4.field410, field1591);
					}
				}
				if (var3.field515 < 0) {
					int var5 = -var3.field515 - 1;
					ClientPlayer var6;
					if (var5 == this.field1542) {
						var6 = field1231;
					} else {
						var6 = this.field1378[var5];
					}
					if (var6 != null && var6.field410 >= 0 && var6.field410 < 13312 && var6.field411 >= 0 && var6.field411 < 13312) {
						var3.method133(var6.field411, this.method470(var6.field411, var3.field506, var6.field410) - var3.field510, var6.field410, field1591);
					}
				}
				var3.method134(this.field1464);
				this.field1325.method75(var3.field525, -1, 60, (int) var3.field517, var3, (int) var3.field519, this.field1277, false, (int) var3.field518);
			}
		}
		field1294++;
		if (field1294 <= 1174) {
			return;
		}
		field1294 = 0;
		this.field1543.method228(51);
		this.field1543.method229(0);
		int var7 = this.field1543.field711;
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1543.method230(11499);
		}
		this.field1543.method230(10548);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1543.method229(139);
		}
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1543.method229(94);
		}
		this.field1543.method230(51693);
		this.field1543.method229(16);
		this.field1543.method230(15036);
		if ((int) (Math.random() * 2.0D) == 0) {
			this.field1543.method229(65);
		}
		this.field1543.method229((int) (Math.random() * 256.0D));
		this.field1543.method230(22990);
		this.field1543.method238(this.field1543.field711 - var7);
	}

	@ObfuscatedName("client.n(B)V")
	public static final void method560() {
		World3D.field296 = true;
		Pix3D.field636 = true;
		field1242 = true;
		World.field44 = true;
	}

	@ObfuscatedName("client.Q(I)V")
	public final void method561() {
		if (this.field1432 > 0) {
			this.method479();
			return;
		}
		this.field1484.method268();
		this.field1345.method214(144, "Connection lost", 257, 0);
		this.field1345.method214(143, "Connection lost", 256, 16777215);
		this.field1345.method214(159, "Please wait - attempting to reestablish", 257, 0);
		this.field1345.method214(158, "Please wait - attempting to reestablish", 256, 16777215);
		this.field1484.method269(4, 4, super.field15);
		this.field1301 = 0;
		ClientStream var2 = this.field1607;
		this.field1238 = false;
		this.method459(this.field1426, this.field1427, true);
		if (!this.field1238) {
			this.method479();
		}
		try {
			var2.method38();
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.o(B)V")
	public final void method562() {
		if (super.field29 != 1) {
			return;
		}
		if (super.field30 >= 6 && super.field30 <= 106 && super.field31 >= 467 && super.field31 <= 499) {
			this.field1583 = (this.field1583 + 1) % 4;
			this.field1243 = true;
			this.field1528 = true;
			this.field1543.method228(129);
			this.field1543.method229(this.field1583);
			this.field1543.method229(this.field1625);
			this.field1543.method229(this.field1554);
		}
		if (super.field30 >= 135 && super.field30 <= 235 && super.field31 >= 467 && super.field31 <= 499) {
			this.field1625 = (this.field1625 + 1) % 3;
			this.field1243 = true;
			this.field1528 = true;
			this.field1543.method228(129);
			this.field1543.method229(this.field1583);
			this.field1543.method229(this.field1625);
			this.field1543.method229(this.field1554);
		}
		if (super.field30 >= 273 && super.field30 <= 373 && super.field31 >= 467 && super.field31 <= 499) {
			this.field1554 = (this.field1554 + 1) % 3;
			this.field1243 = true;
			this.field1528 = true;
			this.field1543.method228(129);
			this.field1543.method229(this.field1583);
			this.field1543.method229(this.field1625);
			this.field1543.method229(this.field1554);
		}
		if (super.field30 < 412 || super.field30 > 512 || super.field31 < 467 || super.field31 > 499) {
			return;
		}
		this.method442();
		this.field1444 = "";
		this.field1623 = false;
		for (int var2 = 0; var2 < Component.field70.length; var2++) {
			if (Component.field70[var2] != null && Component.field70[var2].field79 == 600) {
				this.field1633 = this.field1523 = Component.field70[var2].field76;
				return;
			}
		}
		return;
	}

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1471[var1] = var0 - 1;
			var0 += var0;
		}
		field1474 = new int[99];
		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var2 += var5;
			field1474[var3] = var2 / 4;
		}
		field1507 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
		field1538 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
		field1593 = 623;
	}
}
