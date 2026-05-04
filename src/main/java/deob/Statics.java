package deob;

import jagex3.client.*;
import jagex3.config.*;
import jagex3.constants.Text;
import jagex3.dash3d.*;
import jagex3.datastruct.*;
import jagex3.graphics.Pix2D;
import jagex3.graphics.Pix32;
import jagex3.graphics.SoftwarePix32;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.sound.AudioThread;
import jagex3.sound.PcmStream;
import jagex3.util.ArrayUtil;
import jagex3.util.MonotonicTime;
import jagex3.wordfilter2.WordPack;
import jagex3.worldmap.WorldMapFont;
import jagex3.worldmap.WorldMapLabel;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.CRC32;

public class Statics {
	@ObfuscatedName("bb.a")
	public static final JagString field207 = JagString.wrap("null");
	@ObfuscatedName("bb.j")
	public static final JagString field216 = JagString.wrap("(U(Y");
	@ObfuscatedName("ej.j")
	public static final int[] field1023 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@ObfuscatedName("ch.h")
	public static final JagString field502 = JagString.wrap("<col=ffb000>");
	@ObfuscatedName("ch.o")
	public static final JagString field509 = JagString.wrap("<br>(X");
	@ObfuscatedName("rc.E")
	public static final JagString field3644 = JagString.wrap(")3)3)3");
	@ObfuscatedName("pa.a")
	public static final JagString field3135 = JagString.wrap(")2");
	@ObfuscatedName("pa.g")
	public static final JagString field3141 = JagString.wrap("<img=1>");
	@ObfuscatedName("ce.ab")
	public static final JagString field472 = JagString.wrap("<img=1>");
	@ObfuscatedName("ag.f")
	public static final JagString field120 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("tb.A")
	public static final JagString field3982 = JagString.wrap("(Y<)4col>");
	@ObfuscatedName("vd.c")
	public static final JagString field4367 = JagString.wrap("hint_headicons");
	@ObfuscatedName("we.F")
	public static final int[] field4495 = new int[32];
	@ObfuscatedName("uj.i")
	public static final JagString field4275 = JagString.wrap(":duelfriend:");
	@ObfuscatedName("uj.l")
	public static final JagString field4278 = JagString.wrap("sl_back");
	@ObfuscatedName("uj.o")
	public static final JagString field4281 = JagString.wrap("");
	@ObfuscatedName("pc.o")
	public static final JagString field3201 = JagString.wrap("<img=0>");
	@ObfuscatedName("di.Z")
	public static final JagString field731 = JagString.wrap(":trade:");
	@ObfuscatedName("tj.h")
	public static final short[][] field4062 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	@ObfuscatedName("bc.l")
	public static final JagString field233 = JagString.wrap("null");
	@ObfuscatedName("wa.g")
	public static final JagString field4459 = JagString.wrap("mod_icons");
	@ObfuscatedName("fj.b")
	public static final JagString field1188 = JagString.wrap("");
	@ObfuscatedName("fj.h")
	public static final int[] field1194 = new int[5];
	@ObfuscatedName("be.j")
	public static final JagString field259 = JagString.wrap("<col=00ffff>");
	@ObfuscatedName("be.k")
	public static final JagString field260 = JagString.wrap("mapscene");
	@ObfuscatedName("sj.d")
	public static final JagString field3921 = JagString.wrap("Mem:");
	@ObfuscatedName("sj.e")
	public static final JagString field3922 = JagString.wrap(")3runescape)3com");
	@ObfuscatedName("l.gb")
	public static final JagString field2199 = JagString.wrap("<)4col>");
	@ObfuscatedName("qc.z")
	public static final JagString field3554 = JagString.wrap("<img=0>");
	@ObfuscatedName("k.D")
	public static final JagString field1959 = JagString.wrap(":");
	@ObfuscatedName("k.bb")
	public static final JagString field1982 = JagString.wrap("; Expires=");
	@ObfuscatedName("k.nb")
	public static final JagString field1994 = JagString.wrap("settings");
	@ObfuscatedName("ua.l")
	public static final int[] field4142 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
	@ObfuscatedName("dh.b")
	public static final JagString field710 = JagString.wrap("Null");
	@ObfuscatedName("b.o")
	public static final JagString field182 = JagString.wrap("<col=00ff00>");
	@ObfuscatedName("bc.c")
	public static final int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("n.i")
	public static final JagString field2621 = JagString.wrap("scrollbar");
	@ObfuscatedName("n.j")
	public static final JagString field2622 = JagString.wrap("hint_mapmarkers");
	@ObfuscatedName("n.f")
	public static final JagString field2618 = JagString.wrap("<br>");
	@ObfuscatedName("ed.j")
	public static final JagString field920 = JagString.wrap("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
	@ObfuscatedName("ed.e")
	public static final JagString field915 = JagString.wrap(")4slr2)3ws?order=LPWM");
	@ObfuscatedName("ed.d")
	public static final JagString field914 = JagString.wrap(" )2> <col=ffffff>");
	@ObfuscatedName("ei.d")
	public static final JagString field1005 = JagString.wrap("; version=1; path=)4; domain=");
	@ObfuscatedName("i.M")
	public static final JagString field1637 = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("i.c")
	public static final short[] field1601 = new short[] { -10304, 9104, -1, -1, -1 };
	@ObfuscatedName("ci.w")
	public static final JagString field523 = JagString.wrap("<)4col> x");
	@ObfuscatedName("ac.U")
	public static final JagString field63 = JagString.wrap(")4l");
	@ObfuscatedName("g.l")
	public static final JagString field1214 = JagString.wrap("<)4col>");
	@ObfuscatedName("cf.l")
	public static final JagString field488 = Text.field491;
	@ObfuscatedName("fc.h")
	public static final JagString field1113 = JagString.wrap("");
	@ObfuscatedName("fc.a")
	public static final JagString field1106 = JagString.wrap("compass");
	@ObfuscatedName("qf.Q")
	public static final JagString field3569 = JagString.wrap("Fps:");
	@ObfuscatedName("qf.T")
	public static final JagString field3572 = JagString.wrap("null");
	@ObfuscatedName("e.Z")
	public static final LinkList field783 = new LinkList();
	@ObfuscatedName("ff.X")
	public static final JagString field1143 = JagString.wrap("logo");
	@ObfuscatedName("kj.e")
	public static final JagString field2156 = JagString.wrap("scape main");
	@ObfuscatedName("af.K")
	public static final JagString field102 = JagString.wrap("sl_stars");
	@ObfuscatedName("ja.i")
	public static final short[][] field1810 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };
	@ObfuscatedName("ja.a")
	public static final JagString field1802 = JagString.wrap("Hidden)2");
	@ObfuscatedName("ja.f")
	public static final boolean field1807 = false;
	@ObfuscatedName("sf.j")
	public static final short[][] field3850 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 823, 1837, 4019, 7091, 10169, 14259, 17331, 21427, 27571, 30643, -31821, -27721, -24647, -21593, -16587, -13391, 790, 5014, 7056, 1156, 15124, 19986, 30610, -30830, -27758, -23664, -17518, -14446, -9328, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115, 88, 59, 35, 16, 2, 819, 929, 792, 2743, 2729, 3858, 4923, 4907, 4884, 7995, 7966, 11069, 11047, 11028, 18227, 18204, 18314, 30397, 30373, 30350, -31175, -31197, -32116, -25920, -25939, -25960, -21833, -21849, -21740, -19008, -18011, -18928, -11845, -11867, -14736, 23440, 22032, 21642, 1752, 4946, 8916, 14036, 25948, 32472, -27950, -20778, -15660, -7470, 8097, 7830, 5392, 4890, 4882, 788, 530, -22756, -24044, 13964 } };
	@ObfuscatedName("gd.k")
	public static final short[] field1265 = new short[] { -4160, -4163, -8256, -8259, 22461 };
	@ObfuscatedName("sf.m")
	public static final short[] field3853 = new short[] { 960, 957, -21568, -21571, 22464 };
	@ObfuscatedName("ta.db")
	public static final short[] field3955 = new short[] { 6798, 8741, 25238, 4626, 4550 };
	@ObfuscatedName("mj.m")
	public static final short[][] field2611 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	@ObfuscatedName("l.bb")
	public static final JagString field2194 = JagString.wrap("::");
	@ObfuscatedName("db.bb")
	public static final JagString field659 = JagString.wrap("Nov");
	@ObfuscatedName("db.db")
	public static final JagString field661 = JagString.wrap("Jun");
	@ObfuscatedName("db.s")
	public static final JagString field624 = JagString.wrap("Jul");
	@ObfuscatedName("db.w")
	public static final JagString field628 = JagString.wrap("Dec");
	@ObfuscatedName("db.A")
	public static final JagString field632 = JagString.wrap("Aug");
	@ObfuscatedName("db.M")
	public static final JagString field644 = JagString.wrap(" <col=ffffff>");
	@ObfuscatedName("db.V")
	public static final JagString field653 = JagString.wrap("Sep");
	@ObfuscatedName("db.L")
	public static final JagString field643 = JagString.wrap("Mar");
	@ObfuscatedName("db.N")
	public static final JagString field645 = JagString.wrap("Jan");
	@ObfuscatedName("db.T")
	public static final JagString field651 = JagString.wrap("settings=");
	@ObfuscatedName("db.I")
	public static final JagString field640 = JagString.wrap("Oct");
	@ObfuscatedName("db.K")
	public static final JagString field642 = JagString.wrap("Feb");
	@ObfuscatedName("db.U")
	public static final JagString field652 = JagString.wrap("Apr");
	@ObfuscatedName("db.Y")
	public static final JagString field656 = JagString.wrap("May");
	@ObfuscatedName("db.ab")
	public static final JagString[] field658 = new JagString[] {field645, field642, field643, field652, field656, field661, field624, field632, field653, field640, field659, field628};
	@ObfuscatedName("uh.M")
	public static final CRC32 field4241 = new CRC32();
	@ObfuscatedName("bj.zb")
	public static final Calendar field353 = Calendar.getInstance();
	@ObfuscatedName("pi.S")
	public static final JagString field3334 = JagString.wrap(":clan:");
	@ObfuscatedName("hc.W")
	public static final JagString field1444 = JagString.wrap("details)3dat");
	@ObfuscatedName("hb.S")
	public static final JagString field1426 = JagString.wrap("null");
	@ObfuscatedName("jf.U")
	public static final JagString field1879 = JagString.wrap("(Y");
	@ObfuscatedName("aa.W")
	public static final JagString field18 = JagString.wrap("<col=ff7000>");
	@ObfuscatedName("aa.Z")
	public static final JagString field21 = JagString.wrap(")1p");
	@ObfuscatedName("ra.eb")
	public static final JagString field3636 = JagString.wrap("<col=ff3000>");
	@ObfuscatedName("o.W")
	public static final int[][] field2948 = new int[104][104];
	@ObfuscatedName("o.Y")
	public static final JagString field2950 = JagString.wrap("mem=");
	@ObfuscatedName("ri.R")
	public static final JagString field3707 = JagString.wrap("event_opbase");
	@ObfuscatedName("ri.Y")
	public static final int[] field3714 = new int[5];
	@ObfuscatedName("d.eb")
	public static final JagString field591 = JagString.wrap("(R");
	@ObfuscatedName("d.U")
	public static final JagString field581 = JagString.wrap(" )2> <col=ff9040>");
	@ObfuscatedName("a.g")
	public static final JagString field7 = JagString.wrap("mapfunction");
	@ObfuscatedName("ab.i")
	public static final JagString field34 = JagString.wrap("null");
	@ObfuscatedName("ab.o")
	public static final JagString field40 = JagString.wrap("(Z");
	@ObfuscatedName("bh.J")
	public static final JagString field316 = JagString.wrap("runes");
	@ObfuscatedName("bi.d")
	public static final JagString field325 = JagString.wrap("overlay)3dat");
	@ObfuscatedName("ca.g")
	public static final LruCache field388 = new LruCache(16);
	@ObfuscatedName("cb.d")
	public static final JagString field399 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("cb.g")
	public static final int[] field402 = new int[32768];
	@ObfuscatedName("cb.i")
	public static final JagString field404 = JagString.wrap("labels)3dat");
	@ObfuscatedName("od.y")
	public static final JagString field3009 = JagString.wrap(":tradereq:");
	@ObfuscatedName("dc.d")
	public static final JagString field665 = JagString.wrap(":clanreq:");
	@ObfuscatedName("dc.h")
	public static final JagString field669 = Text.field668;
	@ObfuscatedName("ee.i")
	public static final JagString field933 = JagString.wrap("_");
	@ObfuscatedName("ge.L")
	public static final JagString field1325 = JagString.wrap("Mem:");
	@ObfuscatedName("gh.o")
	public static final JagString field1344 = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("gh.j")
	public static final JagString field1339 = field1344;
	@ObfuscatedName("gh.v")
	public static final JagString field1351 = JagString.wrap(")1j");
	@ObfuscatedName("gh.z")
	public static final JagString field1355 = Text.field1356;
	@ObfuscatedName("cj.eb")
	public static final JagString field553 = JagString.wrap("<col=40ff00>");
	@ObfuscatedName("ui.E")
	public static final JagString field4251 = JagString.wrap("cross");
	@ObfuscatedName("ui.P")
	public static final JagString field4262 = JagString.wrap(" ");
	@ObfuscatedName("ui.S")
	public static final JagString field4265 = JagString.wrap("cookieprefix");
	@ObfuscatedName("kf.e")
	public static final JagString field2075 = JagString.wrap("mapdots");
	@ObfuscatedName("qa.h")
	public static final JagString field3526 = JagString.wrap(" )2> <col=00ffff>");
	@ObfuscatedName("ue.p")
	public static final JagString field4208 = JagString.wrap("overlay2)3dat");
	@ObfuscatedName("og.t")
	public static final LinkList field3049 = new LinkList();
	@ObfuscatedName("og.U")
	public static final JagString field3076 = JagString.wrap(")3runescape)3com)4l=");
	@ObfuscatedName("og.R")
	public static final int field3073 = 0;
	@ObfuscatedName("ie.p")
	public static final JagString field1750 = JagString.wrap("rect_debug=");
	@ObfuscatedName("ge.u")
	public static final JagString field1308 = Text.field1320;
	@ObfuscatedName("ga.q")
	public static final JagString field1238 = JagString.wrap(" (X");
	@ObfuscatedName("ma.R")
	public static final JagString field2462 = JagString.wrap("<col=00ff80>");
	@ObfuscatedName("lh.V")
	public static final JagString field2400 = JagString.wrap(":assist:");
	@ObfuscatedName("vc.eb")
	public static final LinkList field4359 = new LinkList();
	@ObfuscatedName("vc.ib")
	public static final JagString field4363 = Text.field4361;
	@ObfuscatedName("da.hb")
	public static final JagString field612 = Text.field611;
	@ObfuscatedName("kg.R")
	public static final JagString field2089 = JagString.wrap("titlebutton");
	@ObfuscatedName("te.S")
	public static final JagString field4011 = JagString.wrap("sl_flags");
	@ObfuscatedName("te.Q")
	public static final JagString field4009 = JagString.wrap("::tele 0)1");
	@ObfuscatedName("te.Z")
	public static final JagString field4018 = JagString.wrap("m");
	@ObfuscatedName("fa.Y")
	public static final JagString field1083 = Text.field1078;
	@ObfuscatedName("ob.j")
	public static final JagString field2973 = JagString.wrap("huffman");
	@ObfuscatedName("jc.M")
	public static final JagString field1837 = Text.field1839;
	@ObfuscatedName("of.j")
	public static final JagString field3045 = JagString.wrap("p12_full");
	@ObfuscatedName("bd.f")
	public static final JagString field241 = JagString.wrap("<col=ffffff>");
	@ObfuscatedName("de.N")
	public static final JagString field696 = Text.field688;
	@ObfuscatedName("de.H")
	public static final JagString field690 = JagString.wrap("hint_mapedge");
	@ObfuscatedName("de.G")
	public static final JagString field689 = JagString.wrap("title)3jpg");
	@ObfuscatedName("k.S")
	public static final JagString field1973 = JagString.wrap(" x ");
	@ObfuscatedName("be.n")
	public static final JagString field263 = Text.field272;
	@ObfuscatedName("s.mb")
	public static final JagString field3772 = JagString.wrap(")1 ");
	@ObfuscatedName("ae.Vb")
	public static final JagString field82 = JagString.wrap(" GMT");
	@ObfuscatedName("vh.H")
	public static final JagString field4411 = JagString.wrap("mapflag");
	@ObfuscatedName("pe.C")
	public static final JagString field3237 = JagString.wrap("document)3cookie=(R");
	@ObfuscatedName("pe.J")
	public static final JagString field3244 = JagString.wrap("<col=ff0000>");
	@ObfuscatedName("ih.i")
	public static final JagString field1767 = JagString.wrap("; Max)2Age=");
	@ObfuscatedName("ih.m")
	public static final JagString field1771 = JagString.wrap("http:)4)4");
	@ObfuscatedName("h.r")
	public static final JagString field1370 = JagString.wrap(" <col=ffff00>");
	@ObfuscatedName("h.G")
	public static final JagString field1385 = JagString.wrap("k");
	@ObfuscatedName("nb.e")
	public static final JagString field2664 = JagString.wrap("hitmarks");
	@ObfuscatedName("jj.x")
	public static final ModelSourceCache field1956 = new ModelSourceCache(4);
	@ObfuscatedName("jj.y")
	public static final JagString field1957 = JagString.wrap("b12_full");
	@ObfuscatedName("ud.l")
	public static final JagString field4190 = JagString.wrap("<br>(X100(U(Y");
	@ObfuscatedName("pg.Db")
	public static final JagString field3306 = JagString.wrap(": ");
	@ObfuscatedName("pg.D")
	public static final JagString field3254 = JagString.wrap("loc)3dat");
	@ObfuscatedName("oi.l")
	public static final JagString field3110 = JagString.wrap("Service unavailable)3");
	@ObfuscatedName("oi.n")
	public static final JagString field3112 = field3110;
	@ObfuscatedName("sd.c")
	public static final JagString field3814 = JagString.wrap("0(U");
	@ObfuscatedName("sd.f")
	public static final JagString field3817 = Text.field3828;
	@ObfuscatedName("wi.o")
	public static final Calendar field4545 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	@ObfuscatedName("wi.r")
	public static final JagString field4548 = JagString.wrap(" )2> ");
	@ObfuscatedName("oe.i")
	public static final JagString field3025 = JagString.wrap(":duelstake:");
	@ObfuscatedName("sc.D")
	public static final JagString field3787 = JagString.wrap(" ");
	@ObfuscatedName("sc.M")
	public static final JagString field3795 = JagString.wrap("p11_full");
	@ObfuscatedName("wh.J")
	public static final JagString field4516 = JagString.wrap("cookiehost");
	@ObfuscatedName("tc.D")
	public static final JagString field3983 = JagString.wrap("http:)4)4www)3runescape)3com)4l=");
	@ObfuscatedName("mg.Db")
	public static final JagString field2564 = Text.field2562;
	@ObfuscatedName("rg.v")
	public static final JagString field3690 = Text.field3699;
	@ObfuscatedName("rg.I")
	public static final JagString field3703 = Text.field3689;
	@ObfuscatedName("wb.g")
	public static final JagString field4467 = Text.field4462;
	@ObfuscatedName("vb.K")
	public static final int[] field4328 = new int[32];
	@ObfuscatedName("vb.U")
	public static final JagString field4338 = JagString.wrap("<col=80ff00>");
	@ObfuscatedName("nd.s")
	public static final int[] field2745 = new int[1000];
	@ObfuscatedName("oh.m")
	public static final JagString field3089 = JagString.wrap(" )2>");
	@ObfuscatedName("oh.h")
	public static final JagString field3084 = Text.field3094;
	@ObfuscatedName("ia.l")
	public static final JagString field1672 = JagString.wrap("Thu");
	@ObfuscatedName("ia.s")
	public static final JagString field1679 = JagString.wrap("Fri");
	@ObfuscatedName("ia.u")
	public static final JagString field1681 = JagString.wrap("Wed");
	@ObfuscatedName("ia.v")
	public static final JagString field1682 = JagString.wrap("sl_button");
	@ObfuscatedName("ia.D")
	public static final JagString field1690 = JagString.wrap("Tue");
	@ObfuscatedName("ia.F")
	public static final JagString field1692 = JagString.wrap("Sun");
	@ObfuscatedName("ia.y")
	public static final JagString field1685 = JagString.wrap("Sat");
	@ObfuscatedName("ia.E")
	public static final JagString field1691 = JagString.wrap("Mon");
	@ObfuscatedName("ia.m")
	public static final JagString[] field1673 = new JagString[] { field1692, field1691, field1690, field1681, field1672, field1679, field1685 };
	@ObfuscatedName("jd.a")
	public static final JagString field1844 = JagString.wrap("");
	@ObfuscatedName("lf.L")
	public static final JagString field2321 = JagString.wrap("Hidden)2use");
	@ObfuscatedName("ti.z")
	public static final JagString field4050 = Text.field4053;
	@ObfuscatedName("re.h")
	public static final int[] field3674 = new int[5];
	@ObfuscatedName("se.c")
	public static final int[] field3834 = new int[5];
	@ObfuscatedName("jh.a")
	public static final JagString field1921 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("jh.h")
	public static final JagString field1928 = JagString.wrap("l");
	@ObfuscatedName("lj.n")
	public static final PlayerModel field2441 = new PlayerModel();
	@ObfuscatedName("nf.Mb")
	public static final JagString field2828 = JagString.wrap(" <col=00ff80>");
	@ObfuscatedName("t.o")
	public static final JagString field3927 = JagString.wrap(":chalreq:");
	@ObfuscatedName("sf.c")
	public static final JagString field3843 = JagString.wrap("<col=ffff00>*V");
	@ObfuscatedName("hi.h")
	public static final JagString field1556 = JagString.wrap(":assistreq:");
	@ObfuscatedName("ka.c")
	public static final JagString field2007 = JagString.wrap("k");
	@ObfuscatedName("ha.w")
	public static final JagString field1411 = JagString.wrap("");
	@ObfuscatedName("ha.F")
	public static final int[] field1420 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };
	@ObfuscatedName("nh.j")
	public static final JagString field2918 = JagString.wrap("Cabbage");
	@ObfuscatedName("id.d")
	public static final int[] field1720 = new int[4096];
	@ObfuscatedName("id.o")
	public static final int[] field1731 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
	@ObfuscatedName("id.q")
	public static final JagString field1733 = JagString.wrap("title_mute");
	@ObfuscatedName("me.w")
	public static final JagString field2526 = JagString.wrap("<col=c0ff00>");
	@ObfuscatedName("me.z")
	public static final JagString field2529 = JagString.wrap("<col=ff9040>");
	@ObfuscatedName("mc.b")
	public static final JagString field2493 = JagString.wrap(" )2> <col=ffff00>");
	@ObfuscatedName("mj.n")
	public static final JagString field2612 = JagString.wrap(")3");
	@ObfuscatedName("j.e")
	public static final JagString field1796 = JagString.wrap("headicons_pk");
	@ObfuscatedName("jg.z")
	public static final LinkList field1900 = new LinkList();
	@ObfuscatedName("eb.O")
	public static final JagString field881 = JagString.wrap("sl_arrows");
	@ObfuscatedName("eb.Y")
	public static final JagString field891 = JagString.wrap("<col=ffffff> )4 ");
	@ObfuscatedName("vd.d")
	public static final boolean[] field4368 = new boolean[5];
	@ObfuscatedName("eh.m")
	public static final JagString field979 = JagString.wrap(")1");
	@ObfuscatedName("ej.t")
	public static int field1033 = -1;
	@ObfuscatedName("ej.B")
	public static int field1041 = 0;
	@ObfuscatedName("ch.a")
	public static HashTable field495 = new HashTable(512);
	@ObfuscatedName("pa.b")
	public static int field3136;
	@ObfuscatedName("ce.S")
	public static JagString field464 = null;
	@ObfuscatedName("ag.g")
	public static int field121 = 0;
	@ObfuscatedName("s.cb")
	public static WorldMapFont field3762;
	@ObfuscatedName("vg.m")
	public static WorldMapFont field4397;
	@ObfuscatedName("cd.c")
	public static int[] field453;
	@ObfuscatedName("cd.d")
	public static int field454;
	@ObfuscatedName("uj.j")
	public static int field4276 = 0;
	@ObfuscatedName("pc.f")
	public static int field3192 = -1;
	@ObfuscatedName("pc.m")
	public static WorldMapFont field3199;
	@ObfuscatedName("di.V")
	public static int field727;
	@ObfuscatedName("tj.a")
	public static int field4055;
	@ObfuscatedName("fb.lb")
	public static int field1102;
	@ObfuscatedName("ij.K")
	public static byte[][][] field1786;
	@ObfuscatedName("fj.f")
	public static int field1192 = 0;
	@ObfuscatedName("fj.n")
	public static int field1200;
	@ObfuscatedName("be.s")
	public static int[][] field268;
	@ObfuscatedName("wg.y")
	public static int[] field4510;
	@ObfuscatedName("de.K")
	public static int field693;
	@ObfuscatedName("b.h")
	public static WorldMapFont field175;
	@ObfuscatedName("b.p")
	public static int field183 = 100;
	@ObfuscatedName("ba.h")
	public static int field192 = 0;
	@ObfuscatedName("ba.s")
	public static int field203 = 0;
	@ObfuscatedName("bc.e")
	public static QuickChatPhrase field226;
	@ObfuscatedName("bc.g")
	public static Font field228;
	@ObfuscatedName("bd.n")
	public static int field249;
	@ObfuscatedName("n.h")
	public static int field2620 = 0;
	@ObfuscatedName("ei.h")
	public static int[] field1009;
	@ObfuscatedName("ei.k")
	public static int field1012 = 0;
	@ObfuscatedName("g.d")
	public static int field1206 = 0;
	@ObfuscatedName("g.e")
	public static int field1207 = 0;
	@ObfuscatedName("g.h")
	public static short[] field1210;
	@ObfuscatedName("cf.f")
	public static int[] field482;
	@ObfuscatedName("fc.e")
	public static double field1110;
	@ObfuscatedName("qe.j")
	public static IfType[] field3564;
	@ObfuscatedName("e.Q")
	public static byte[][] field774;
	@ObfuscatedName("ff.eb")
	public static int field1150 = 0;
	@ObfuscatedName("af.N")
	public static byte[][][] field105;
	@ObfuscatedName("uh.S")
	public static int field4247 = -1;
	@ObfuscatedName("uh.P")
	public static int field4244 = 0;
	@ObfuscatedName("dj.mc")
	public static int field772;
	@ObfuscatedName("dj.Gb")
	public static int[] field740;
	@ObfuscatedName("jf.lb")
	public static int field1896 = -1;
	@ObfuscatedName("da.X")
	public static long field602 = 0L;
	@ObfuscatedName("aa.db")
	public static int field25 = -1;
	@ObfuscatedName("qj.U")
	public static int field3604 = 0;
	@ObfuscatedName("qj.V")
	public static int[] field3605;
	@ObfuscatedName("ra.gb")
	public static int field3638 = 0;
	@ObfuscatedName("lh.db")
	public static int field2408 = 0;
	@ObfuscatedName("lh.X")
	public static int[] field2402;
	@ObfuscatedName("d.hb")
	public static int field594 = -1;
	@ObfuscatedName("d.T")
	public static short field580 = 256;
	@ObfuscatedName("pd.S")
	public static WorldMapFont field3205;
	@ObfuscatedName("ta.Z")
	public static byte[][][] field3951;
	@ObfuscatedName("ma.bb")
	public static int field2472;
	@ObfuscatedName("a.j")
	public static long field10 = 0L;
	@ObfuscatedName("ab.q")
	public static int[][] field42;
	@ObfuscatedName("ah.z")
	public static int field130;
	@ObfuscatedName("ai.b")
	public static int field142 = 0;
	@ObfuscatedName("ai.e")
	public static boolean field145 = false;
	@ObfuscatedName("bf.o")
	public static int field279 = 100;
	@ObfuscatedName("bh.M")
	public static JagString field319 = null;
	@ObfuscatedName("od.w")
	public static int field3007;
	@ObfuscatedName("ec.J")
	public static int field898 = 0;
	@ObfuscatedName("ec.U")
	public static boolean field909 = false;
	@ObfuscatedName("ec.G")
	public static int[][][] field895;
	@ObfuscatedName("ed.i")
	public static int field919 = 0;
	@ObfuscatedName("ed.k")
	public static short field921 = 205;
	@ObfuscatedName("ed.n")
	public static int field924 = 0;
	@ObfuscatedName("ee.b")
	public static short field926 = 32767;
	@ObfuscatedName("ee.f")
	public static int field930 = 0;
	@ObfuscatedName("eg.w")
	public static int field941;
	@ObfuscatedName("fi.v")
	public static Js5 field1176;
	@ObfuscatedName("ge.v")
	public static int field1309;
	@ObfuscatedName("ge.C")
	public static int field1316 = 0;
	@ObfuscatedName("ge.O")
	public static int field1328 = 0;
	@ObfuscatedName("rd.E")
	public static int field3659 = -1;
	@ObfuscatedName("ui.D")
	public static WorldMapFont field4250;
	@ObfuscatedName("kf.h")
	public static int field2078 = 0;
	@ObfuscatedName("li.R")
	public static IfType field2426;
	@ObfuscatedName("qa.a")
	public static long field3519 = 0L;
	@ObfuscatedName("uc.i")
	public static short field4175 = 256;
	@ObfuscatedName("na.L")
	public static Image field2643;
	@ObfuscatedName("ob.p")
	public static int[][][] field2979;
	@ObfuscatedName("ob.q")
	public static boolean field2980 = true;
	@ObfuscatedName("jc.Q")
	public static int field1841 = 0;
	@ObfuscatedName("jc.G")
	public static int[] field1831;
	@ObfuscatedName("eh.E")
	public static boolean field997 = false;
	@ObfuscatedName("oc.v")
	public static int field2993 = 0;
	@ObfuscatedName("h.P")
	public static int field1394 = 0;
	@ObfuscatedName("nb.bb")
	public static int[] field2713;
	@ObfuscatedName("ud.a")
	public static short field4179 = 32767;
	@ObfuscatedName("ud.d")
	public static JagString field4182 = null;
	@ObfuscatedName("sh.w")
	public static int[] field3882;
	@ObfuscatedName("sh.H")
	public static int field3893;
	@ObfuscatedName("u.yb")
	public static JagString field4134 = null;
	@ObfuscatedName("pg.yb")
	public static byte field3301;
	@ObfuscatedName("oi.g")
	public static int field3105 = 0;
	@ObfuscatedName("ne.a")
	public static JagString field2752 = null;
	@ObfuscatedName("ne.o")
	public static int field2766;
	@ObfuscatedName("oe.c")
	public static int field3019;
	@ObfuscatedName("oe.q")
	public static int field3033;
	@ObfuscatedName("sc.ab")
	public static int field3809;
	@ObfuscatedName("sc.F")
	public static int field3788 = 0;
	@ObfuscatedName("nj.j")
	public static int field2931;
	@ObfuscatedName("nj.k")
	public static int field2932 = -1;
	@ObfuscatedName("va.w")
	public static HashTable field4313;
	@ObfuscatedName("va.x")
	public static int field4314;
	@ObfuscatedName("vb.H")
	public static WorldMapFont field4325;
	@ObfuscatedName("nd.l")
	public static AudioThread field2738;
	@ObfuscatedName("nd.p")
	public static int field2742;
	@ObfuscatedName("oh.g")
	public static short field3083 = 320;
	@ObfuscatedName("ia.H")
	public static LinkList field1694 = new LinkList();
	@ObfuscatedName("ia.L")
	public static int[] field1698;
	@ObfuscatedName("jd.f")
	public static int field1849;
	@ObfuscatedName("jd.g")
	public static int field1850;
	@ObfuscatedName("ti.B")
	public static byte[][][] field4052;
	@ObfuscatedName("sg.x")
	public static IfType field3871;
	@ObfuscatedName("se.d")
	public static JagString field3835 = null;
	@ObfuscatedName("se.i")
	public static FontMetrics field3840;
	@ObfuscatedName("jh.f")
	public static Js5 field1926;
	@ObfuscatedName("lj.o")
	public static int field2442 = 1;
	@ObfuscatedName("ki.q")
	public static WorldMapFont field2147;
	@ObfuscatedName("ue.f")
	public static int field4198 = 0;
	@ObfuscatedName("ka.e")
	public static int field2009 = -1;
	@ObfuscatedName("ka.f")
	public static Pix32 field2010;
	@ObfuscatedName("ha.B")
	public static Square[][][] field1416;
	@ObfuscatedName("nh.b")
	public static int field2910;
	@ObfuscatedName("nh.d")
	public static int field2912 = -1;
	@ObfuscatedName("nh.g")
	public static double field2915;
	@ObfuscatedName("nh.l")
	public static int[] field2920;
	@ObfuscatedName("id.r")
	public static int[] field1734;
	@ObfuscatedName("ug.b")
	public static JagString field4219 = null;
	@ObfuscatedName("me.x")
	public static short field2527 = 1;
	@ObfuscatedName("kh.W")
	public static byte[][][] field2126;
	@ObfuscatedName("mj.l")
	public static int field2610 = 0;
	@ObfuscatedName("j.j")
	public static int field1801;
	@ObfuscatedName("hi.b")
	public static int field1550 = 0;
	@ObfuscatedName("hi.d")
	public static int field1552 = -1;
	@ObfuscatedName("wf.e")
	public static Pix32 field4500;
	@ObfuscatedName("wf.g")
	public static int field4502 = -1;
	@ObfuscatedName("mf.w")
	public static boolean field2555 = false;
	@ObfuscatedName("la.i")
	public static int field2213;
	@ObfuscatedName("wa.f")
	public static int field4458 = 0;
	@ObfuscatedName("qb.R")
	public static int field3545 = 0;
	@ObfuscatedName("lf.V")
	public static int field2330;
	@ObfuscatedName("ub.ib")
	public static byte[][][] field4166;
	@ObfuscatedName("jg.L")
	public static int[][][] field1912;
	@ObfuscatedName("ac.L")
	public static JagString field54;

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field1720[var0] = method394(var0);
		}
	}

	@ObfuscatedName("ve.a(IZ)I")
	public static int method1559(int arg0) {
		double var1 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 & 0xFF) / 256.0D;
		double var7 = var3;
		if (var3 < var1) {
			var7 = var1;
		}
		double var9 = 0.0D;
		double var11 = var3;
		if (var1 < var3) {
			var11 = var1;
		}
		if (var7 < var5) {
			var7 = var5;
		}
		if (var11 > var5) {
			var11 = var5;
		}
		double var13 = 0.0D;
		double var15 = (var11 + var7) / 2.0D;
		if (var11 != var7) {
			if (var15 < 0.5D) {
				var9 = (var7 - var11) / (var7 + var11);
			}
			if (var3 == var7) {
				var13 = (var1 - var5) / (var7 - var11);
			} else if (var7 == var1) {
				var13 = (var5 - var3) / (var7 - var11) + 2.0D;
			} else if (var5 == var7) {
				var13 = (var3 - var1) / (-var11 + var7) + 4.0D;
			}
			if (var15 >= 0.5D) {
				var9 = (var7 - var11) / (2.0D - var11 - var7);
			}
		}
		double var17 = var13 / 6.0D;
		int var19 = (int) (var9 * 256.0D);
		int var20 = (int) (var17 * 256.0D);
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}
		int var21 = (int) (var15 * 256.0D);
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		if (var21 > 243) {
			var19 >>= 0x4;
		} else if (var21 > 217) {
			var19 >>= 0x3;
		} else if (var21 > 192) {
			var19 >>= 0x2;
		} else if (var21 > 179) {
			var19 >>= 0x1;
		}
		return (var19 >> 5 << 7) + (var20 >> 2 << 10) + (var21 >> 1);
	}

	@ObfuscatedName("m.a(IB)I")
	public static int method883(int arg0) {
		return arg0 == 16711935 ? -1 : method1559(arg0);
	}

	@ObfuscatedName("vg.a(IIIIIB)V")
	public static void method1565(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 == arg0) {
			method1532(arg3, arg0, arg2, arg1);
		} else if (arg3 - arg0 >= field1207 && field183 >= arg0 + arg3 && arg2 - arg4 >= field919 && field279 >= arg4 + arg2) {
			method892(arg3, arg0, arg4, arg2, arg1);
		} else {
			method1438(arg3, arg4, arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("cd.a([IB)[I")
	public static int[] method169(int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			int[] var1 = new int[arg0.length];
			ArrayUtil.method838(arg0, 0, var1, 0, arg0.length);
			return var1;
		}
	}

	@ObfuscatedName("uj.a(IBI)I")
	public static int method1524(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = arg0 & 0x1 | var2 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}

	@ObfuscatedName("uj.a(IIBI)I")
	public static int method1525(int arg0, int arg1, int arg2) {
		int var3 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * var3 + arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + var3 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@ObfuscatedName("di.a(BI)V")
	public static void method277(int arg0) {
		if (arg0 == 37) {
			field2915 = 3.0D;
		} else if (arg0 == 50) {
			field2915 = 4.0D;
		} else if (arg0 == 75) {
			field2915 = 6.0D;
		} else {
			field2915 = 8.0D;
		}
		field594 = -1;
		field594 = -1;
	}

	@ObfuscatedName("sj.a(I)V")
	public static void method1416() {
		int[] var0 = new int[ObjType.field3855];
		int var1 = 0;
		for (int var2 = 0; var2 < ObjType.field3855; var2++) {
			ObjType var3 = ObjType.list(var2);
			if (var3.field2888 >= 0 || var3.field2853 >= 0) {
				var0[var1++] = var2;
			}
		}
		field1698 = new int[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			field1698[var4] = var0[var4];
		}
	}

	@ObfuscatedName("ua.a(ZIIIIIIIBI[I)V")
	public static void method1482(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		if (Pix2D.field1334 > arg4) {
			arg1 -= Pix2D.field1334 - arg4;
			arg4 = Pix2D.field1334;
		}
		if (Pix2D.field1335 < arg1 + arg4) {
			arg1 = Pix2D.field1335 - arg4;
		}
		if (Pix2D.field1332 > arg7) {
			arg8 -= Pix2D.field1332 - arg7;
			arg7 = Pix2D.field1332;
		}
		int var10 = arg4 * Pix2D.field1333 + arg7;
		if (arg6 == 9) {
			arg3 = arg3 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg6 = 8;
		}
		if (Pix2D.field1336 < arg8 + arg7) {
			arg8 = Pix2D.field1336 - arg7;
		}
		int var11 = Pix2D.field1333 - arg8;
		if (arg6 == 1) {
			if (arg3 == 0) {
				for (int var12 = 0; var12 < arg1; var12++) {
					for (int var13 = 0; var13 < arg8; var13++) {
						if (var13 <= var12) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var14 = arg1 - 1; var14 >= 0; var14--) {
					for (int var15 = 0; var15 < arg8; var15++) {
						if (var14 >= var15) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var16 = 0; var16 < arg1; var16++) {
					for (int var17 = 0; var17 < arg8; var17++) {
						if (var16 <= var17) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var18 = arg1 - 1; var18 >= 0; var18--) {
					for (int var19 = 0; var19 < arg8; var19++) {
						if (var18 <= var19) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 2) {
			if (arg3 == 0) {
				for (int var20 = arg1 - 1; var20 >= 0; var20--) {
					for (int var21 = 0; var21 < arg8; var21++) {
						if (var21 <= var20 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var22 = 0; var22 < arg1; var22++) {
					for (int var23 = 0; var23 < arg8; var23++) {
						if (var23 >= var22 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var24 = 0; var24 < arg1; var24++) {
					for (int var25 = arg8 - 1; var25 >= 0; var25--) {
						if (var24 >> 1 >= var25) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var26 = arg1 - 1; var26 >= 0; var26--) {
					for (int var27 = arg8 - 1; var27 >= 0; var27--) {
						if (var27 >= var26 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 3) {
			if (arg3 == 0) {
				for (int var28 = arg1 - 1; var28 >= 0; var28--) {
					for (int var29 = arg8 - 1; var29 >= 0; var29--) {
						if (var29 <= var28 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var30 = arg1 - 1; var30 >= 0; var30--) {
					for (int var31 = 0; var31 < arg8; var31++) {
						if (var30 << 1 <= var31) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var32 = 0; var32 < arg1; var32++) {
					for (int var33 = 0; var33 < arg8; var33++) {
						if (var33 <= var32 >> 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var34 = 0; var34 < arg1; var34++) {
					for (int var35 = arg8 - 1; var35 >= 0; var35--) {
						if (var34 << 1 <= var35) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 == 4) {
			if (arg3 == 0) {
				for (int var36 = arg1 - 1; var36 >= 0; var36--) {
					for (int var37 = 0; var37 < arg8; var37++) {
						if (var36 >> 1 <= var37) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 1) {
				for (int var38 = 0; var38 < arg1; var38++) {
					for (int var39 = 0; var39 < arg8; var39++) {
						if (var38 << 1 >= var39) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 2) {
				for (int var40 = 0; var40 < arg1; var40++) {
					for (int var41 = arg8 - 1; var41 >= 0; var41--) {
						if (var40 >> 1 <= var41) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			} else if (arg3 == 3) {
				for (int var42 = arg1 - 1; var42 >= 0; var42--) {
					for (int var43 = arg8 - 1; var43 >= 0; var43--) {
						if (var43 <= var42 << 1) {
							arg9[var10] = arg5;
						} else if (arg0) {
							arg9[var10] = arg2;
						}
						var10++;
					}
					var10 += var11;
				}
			}
		} else if (arg6 != 5) {
			if (arg6 == 6) {
				if (arg3 == 0) {
					for (int var52 = 0; var52 < arg1; var52++) {
						for (int var53 = 0; var53 < arg8; var53++) {
							if (var53 <= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var54 = 0; var54 < arg1; var54++) {
						for (int var55 = 0; var55 < arg8; var55++) {
							if (var54 <= arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var56 = 0; var56 < arg1; var56++) {
						for (int var57 = 0; var57 < arg8; var57++) {
							if (var57 >= arg8 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var58 = 0; var58 < arg1; var58++) {
						for (int var59 = 0; var59 < arg8; var59++) {
							if (arg1 / 2 <= var58) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 7) {
				if (arg3 == 0) {
					for (int var60 = 0; var60 < arg1; var60++) {
						for (int var61 = 0; var61 < arg8; var61++) {
							if (var61 <= var60 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var62 = arg1 - 1; var62 >= 0; var62--) {
						for (int var63 = 0; var63 < arg8; var63++) {
							if (var62 - arg1 / 2 >= var63) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var64 = arg1 - 1; var64 >= 0; var64--) {
						for (int var65 = arg8 - 1; var65 >= 0; var65--) {
							if (var64 - arg1 / 2 >= var65) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var66 = 0; var66 < arg1; var66++) {
						for (int var67 = arg8 - 1; var67 >= 0; var67--) {
							if (var67 <= var66 - arg1 / 2) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
			if (arg6 == 8) {
				if (arg3 == 0) {
					for (int var68 = 0; var68 < arg1; var68++) {
						for (int var69 = 0; var69 < arg8; var69++) {
							if (var68 - arg1 / 2 <= var69) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 1) {
					for (int var70 = arg1 - 1; var70 >= 0; var70--) {
						for (int var71 = 0; var71 < arg8; var71++) {
							if (var70 - arg1 / 2 <= var71) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 2) {
					for (int var72 = arg1 - 1; var72 >= 0; var72--) {
						for (int var73 = arg8 - 1; var73 >= 0; var73--) {
							if (var72 - arg1 / 2 <= var73) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
				if (arg3 == 3) {
					for (int var74 = 0; var74 < arg1; var74++) {
						for (int var75 = arg8 - 1; var75 >= 0; var75--) {
							if (var74 - arg1 / 2 <= var75) {
								arg9[var10] = arg5;
							} else if (arg0) {
								arg9[var10] = arg2;
							}
							var10++;
						}
						var10 += var11;
					}
					return;
				}
			}
		} else if (arg3 == 0) {
			for (int var44 = arg1 - 1; var44 >= 0; var44--) {
				for (int var45 = arg8 - 1; var45 >= 0; var45--) {
					if (var45 >= var44 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 1) {
			for (int var46 = arg1 - 1; var46 >= 0; var46--) {
				for (int var47 = 0; var47 < arg8; var47++) {
					if (var47 <= var46 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 2) {
			for (int var48 = 0; var48 < arg1; var48++) {
				for (int var49 = 0; var49 < arg8; var49++) {
					if (var49 >= var48 >> 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		} else if (arg3 == 3) {
			for (int var50 = 0; var50 < arg1; var50++) {
				for (int var51 = arg8 - 1; var51 >= 0; var51--) {
					if (var51 <= var50 << 1) {
						arg9[var10] = arg5;
					} else if (arg0) {
						arg9[var10] = arg2;
					}
					var10++;
				}
				var10 += var11;
			}
		}
	}

	@ObfuscatedName("ei.a(II)I")
	public static int method394(int arg0) {
		int var1 = arg0 * 6 - 61440;
		int var2 = (var1 * arg0 >> 12) + 40960;
		int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
		return var2 * var3 >> 12;
	}

	@ObfuscatedName("ac.c(II)Z")
	public static boolean method24(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("vi.a(IBIII)V")
	public static void method1575(int arg0, int arg1) {
		field183 = arg1;
		field1207 = 0;
		field919 = 0;
		field279 = arg0;
	}

	@ObfuscatedName("qf.a(ZII)I")
	public static int method1284(int arg0, int arg1) {
		int var2 = arg1 >>> 31;
		return (var2 + arg1) / arg0 - var2;
	}

	@ObfuscatedName("bj.a([[IB)V")
	public static void method114(int[][] arg0) {
		field42 = arg0;
	}

	@ObfuscatedName("c.b(IIIIIIII)V")
	public static void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg2;
		int var8 = 0;
		int var9 = arg6 - arg1;
		int var10 = 0;
		int var11 = arg6 * arg6;
		int var12 = arg2 * arg2;
		int var13 = var9 * var9;
		int var14 = arg2 - arg1;
		int var15 = var14 * var14;
		int var16 = var11 << 1;
		int var17 = var12 << 1;
		int var18 = var15 << 1;
		int var19 = var13 << 1;
		int var20 = arg2 << 1;
		int var21 = var14 << 1;
		int var22 = var12 - var16 * (var20 - 1);
		int var23 = var17 + var11 * (1 - var20);
		int var24 = var12 << 2;
		int var25 = var11 << 2;
		int var26 = var18 + (1 - var21) * var13;
		int var27 = var15 << 2;
		int var28 = (var20 - 3) * var16;
		int var29 = var13 << 2;
		int var30 = var15 - (var21 - 1) * var19;
		int var31 = var17 * 3;
		int var32 = var18 * 3;
		int var33 = (arg2 - 1) * var25;
		int var34 = (var21 - 3) * var19;
		int var35 = (var14 - 1) * var29;
		int[] var36 = field42[arg5];
		int var37 = var24;
		int var38 = var27;
		method1534(arg0 - arg6, arg4, arg0 - var9, var36);
		method1534(arg0 - var9, arg3, var9 + arg0, var36);
		method1534(var9 + arg0, arg4, arg0 + arg6, var36);
		while (var7 > 0) {
			if (var23 < 0) {
				while (var23 < 0) {
					var23 += var31;
					var31 += var24;
					var10++;
					var22 += var37;
					var37 += var24;
				}
			}
			boolean var39 = var7 <= var14;
			if (var39) {
				if (var26 < 0) {
					while (var26 < 0) {
						var8++;
						var30 += var38;
						var38 += var27;
						var26 += var32;
						var32 += var27;
					}
				}
				if (var30 < 0) {
					var8++;
					var26 += var32;
					var32 += var27;
					var30 += var38;
					var38 += var27;
				}
				var26 += -var35;
				var30 += -var34;
				var34 -= var29;
				var35 -= var29;
			}
			if (var22 < 0) {
				var23 += var31;
				var31 += var24;
				var10++;
				var22 += var37;
				var37 += var24;
			}
			var23 += -var33;
			var33 -= var25;
			var22 += -var28;
			var7--;
			int var40 = var10 + arg0;
			int var41 = arg5 - var7;
			var28 -= var25;
			int var42 = var7 + arg5;
			int var43 = arg0 - var10;
			if (var39) {
				int var44 = arg0 + var8;
				int var45 = arg0 - var8;
				method1534(var43, arg4, var45, field42[var41]);
				method1534(var45, arg3, var44, field42[var41]);
				method1534(var44, arg4, var40, field42[var41]);
				method1534(var43, arg4, var45, field42[var42]);
				method1534(var45, arg3, var44, field42[var42]);
				method1534(var44, arg4, var40, field42[var42]);
			} else {
				method1534(var43, arg4, var40, field42[var41]);
				method1534(var43, arg4, var40, field42[var42]);
			}
		}
	}

	@ObfuscatedName("pi.b(II)V")
	public static void method1221(int arg0) {
		field3033 = arg0;
		field594 = -1;
		field594 = -1;
		method1604();
	}

	@ObfuscatedName("hb.a(III[BIII[III)V")
	public static void method527(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg3[arg8++] == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0;
				}
			}
			arg2 += arg6;
			arg8 += arg1;
		}
	}

	@ObfuscatedName("hb.b(II)I")
	public static int method528(int arg0) {
		if (Client.lang == 1) {
			return 7;
		} else if (arg0 == 77) {
			return 1;
		} else if (arg0 == 38) {
			return 2;
		} else if (arg0 == 16) {
			return 3;
		} else if (arg0 == 161) {
			return 4;
		} else if (arg0 == 191) {
			return 5;
		} else if (arg0 == 69) {
			return 6;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("lh.c(B)V")
	public static void method869() {
		field1694 = new LinkList();
	}

	@ObfuscatedName("o.a(II[Li;I[S)V")
	public static void method1037(int arg0, JagString[] arg1, int arg2, short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		int var4 = (arg0 + arg2) / 2;
		JagString var5 = arg1[var4];
		arg1[var4] = arg1[arg2];
		int var6 = arg0;
		arg1[arg2] = var5;
		short var7 = arg3[var4];
		arg3[var4] = arg3[arg2];
		arg3[arg2] = var7;
		for (int var8 = arg0; var8 < arg2; var8++) {
			if (var5 == null || arg1[var8] != null && arg1[var8].method625(var5) < (var8 & 0x1)) {
				JagString var9 = arg1[var8];
				arg1[var8] = arg1[var6];
				arg1[var6] = var9;
				short var10 = arg3[var8];
				arg3[var8] = arg3[var6];
				arg3[var6++] = var10;
			}
		}
		arg1[arg2] = arg1[var6];
		arg1[var6] = var5;
		arg3[arg2] = arg3[var6];
		arg3[var6] = var7;
		method1037(arg0, arg1, var6 - 1, arg3);
		method1037(var6 + 1, arg1, arg2, arg3);
	}

	@ObfuscatedName("o.a(Lnb;Lnb;ILnb;)V")
	public static void method1038(Js5 arg0, Js5 arg1, Js5 arg2) {
		field2009 = arg1.method964(field689);
		field2932 = arg2.method964(field1143);
		field1896 = arg2.method964(Client.field561);
		field3019 = arg2.method964(field2089);
		field4502 = arg2.method964(field316);
		field2912 = arg2.method964(field1733);
		TitleScreen.field209 = arg2.method964(field4278);
		TitleScreen.field119 = arg2.method964(field4011);
		TitleScreen.field1783 = arg2.method964(field881);
		TitleScreen.field2195 = arg2.method964(field102);
		field4247 = arg2.method964(field1682);
		field1552 = arg0.method964(field2156);
	}

	@ObfuscatedName("ri.b(II)I")
	public static int method1344(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("ri.a(Lq;I)Li;")
	public static JagString method1345(IfType arg0) {
		if (GameShell.method592(method530(arg0)) == 0) {
			return null;
		} else if (arg0.field3512 == null || arg0.field3512.method602().method604() == 0) {
			return Client.field2103 ? field2321 : null;
		} else {
			return arg0.field3512;
		}
	}

	@ObfuscatedName("td.a(IIB)I")
	public static int method1439(int arg0, int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			int var2 = arg1 % arg0;
			arg1 = arg0;
			arg0 = var2;
		}
		return arg1;
	}

	@ObfuscatedName("td.a(IZ)I")
	public static int method1441(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("ma.a(IIIIIII)V")
	public static void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (field1207 <= arg5 && arg2 <= field183 && arg1 >= field919 && field279 >= arg3) {
			if (arg0 == 1) {
				method1420(arg5, arg2, arg3, arg1, arg4);
			} else {
				method786(arg2, arg4, arg0, arg3, arg1, arg5);
			}
		} else if (arg0 == 1) {
			method1028(arg3, arg4, arg5, arg1, arg2);
		} else {
			method101(arg3, arg0, arg5, arg1, arg2, arg4);
		}
	}

	@ObfuscatedName("ah.a(IIIIIII)V")
	public static void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method906(arg3);
		int var6 = arg3 - arg5;
		if (var6 < 0) {
			var6 = 0;
		}
		int var7 = 0;
		int var8 = arg3;
		int var9 = -var6;
		int var10 = var6;
		int var11 = -1;
		int var12 = -arg3;
		int var13 = -1;
		int var14 = arg1 - var6;
		int var15 = var6 + arg1;
		int[] var16 = field42[arg4];
		method1534(arg1 - arg3, arg2, var14, var16);
		method1534(var14, arg0, var15, var16);
		method1534(var15, arg2, arg3 + arg1, var16);
		while (var7 < var8) {
			var13 += 2;
			var9 += var13;
			var11 += 2;
			if (var9 >= 0 && var10 >= 1) {
				field482[var10] = var7;
				var10--;
				var9 -= var10 << 1;
			}
			var12 += var11;
			var7++;
			if (var12 >= 0) {
				var8--;
				if (var8 < var6) {
					int[] var17 = field42[arg4 + var8];
					int var18 = field482[var8];
					int[] var19 = field42[arg4 - var8];
					int var20 = arg1 - var7;
					int var21 = arg1 + var7;
					int var22 = arg1 + var18;
					int var23 = arg1 - var18;
					method1534(var20, arg2, var23, var17);
					method1534(var23, arg0, var22, var17);
					method1534(var22, arg2, var21, var17);
					method1534(var20, arg2, var23, var19);
					method1534(var23, arg0, var22, var19);
					method1534(var22, arg2, var21, var19);
				} else {
					int[] var24 = field42[arg4 + var8];
					int[] var25 = field42[arg4 - var8];
					int var26 = var7 + arg1;
					int var27 = arg1 - var7;
					method1534(var27, arg2, var26, var24);
					method1534(var27, arg2, var26, var25);
				}
				var12 -= var8 << 1;
			}
			int[] var28 = field42[var7 + arg4];
			int[] var29 = field42[arg4 - var7];
			int var30 = var8 + arg1;
			int var31 = arg1 - var8;
			if (var6 <= var7) {
				method1534(var31, arg2, var30, var28);
				method1534(var31, arg2, var30, var29);
			} else {
				int var32 = var10 < var7 ? field482[var7] : var10;
				int var33 = arg1 - var32;
				method1534(var31, arg2, var33, var28);
				int var34 = var32 + arg1;
				method1534(var33, arg0, var34, var28);
				method1534(var34, arg2, var30, var28);
				method1534(var31, arg2, var33, var29);
				method1534(var33, arg0, var34, var29);
				method1534(var34, arg2, var30, var29);
			}
		}
	}

	@ObfuscatedName("ah.a(IB)I")
	public static int method50(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("ah.b(II)I")
	public static int method51(int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("bg.a(II)I")
	public static int method96(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; method534(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	@ObfuscatedName("bi.a(ILef;)V")
	public static void method99(PcmStream arg0) {
		if (arg0.field935 != null) {
			arg0.field935.field1254 = 0;
		}
		arg0.field937 = false;
		for (PcmStream var1 = arg0.method385(); var1 != null; var1 = arg0.method380()) {
			method99(var1);
		}
	}

	@ObfuscatedName("bi.a(IIIIIIB)V")
	public static void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = method1058(field919, field279, arg3);
		int var7 = method1058(field919, field279, arg0);
		int var8 = method1058(field1207, field183, arg2);
		int var9 = method1058(field1207, field183, arg4);
		int var10 = method1058(field919, field279, arg3 + arg1);
		int var11 = method1058(field919, field279, arg0 - arg1);
		for (int var12 = var6; var12 < var10; var12++) {
			method1534(var8, arg5, var9, field42[var12]);
		}
		for (int var13 = var7; var13 > var11; var13--) {
			method1534(var8, arg5, var9, field42[var13]);
		}
		int var14 = method1058(field1207, field183, arg1 + arg2);
		int var15 = method1058(field1207, field183, arg4 - arg1);
		for (int var16 = var10; var16 <= var11; var16++) {
			int[] var17 = field42[var16];
			method1534(var8, arg5, var14, var17);
			method1534(var15, arg5, var9, var17);
		}
	}

	@ObfuscatedName("bi.a(II)I")
	public static int method102(int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("bi.a(Lea;I)Li;")
	public static JagString method103(Packet arg0) {
		return WordPack.method524(arg0);
	}

	@ObfuscatedName("od.a(IIII)I")
	public static int method1058(int arg0, int arg1, int arg2) {
		if (arg0 > arg2) {
			return arg0;
		} else if (arg2 > arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@ObfuscatedName("ed.a(IIIIIIII)V")
	public static void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (field1207 <= arg5 && field183 >= arg0 && arg2 >= field919 && arg6 <= field279) {
			method1333(arg4, arg2, arg6, arg3, arg5, arg0, arg1);
		} else {
			method986(arg4, arg0, arg2, arg5, arg6, arg3, arg1);
		}
	}

	@ObfuscatedName("eg.a(IB)I")
	public static int method387(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("ga.a(IZ)Z")
	public static boolean method465(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@ObfuscatedName("gd.a(IZLi;)V")
	public static void method467(boolean arg0, JagString arg1) {
		JagString var2 = arg1.method639();
		int var3 = 0;
		short[] var4 = new short[16];
		for (int var5 = 0; var5 < ObjType.field3855; var5++) {
			ObjType var6 = ObjType.list(var5);
			if ((!arg0 || var6.field2861) && var6.field2867 == -1 && var6.field2884 == -1 && var6.field2850 == 0 && var6.name.method639().method617(var2) != -1) {
				if (var3 >= 250) {
					field3893 = -1;
					field1210 = null;
					return;
				}
				if (var3 >= var4.length) {
					short[] var7 = new short[var4.length * 2];
					for (int var8 = 0; var8 < var3; var8++) {
						var7[var8] = var4[var8];
					}
					var4 = var7;
				}
				var4[var3++] = (short) var5;
			}
		}
		ClientMouseListener.field2107 = 0;
		field3893 = var3;
		field1210 = var4;
		JagString[] var9 = new JagString[field3893];
		for (int var10 = 0; var10 < field3893; var10++) {
			var9[var10] = ObjType.list(var4[var10]).name;
		}
		method1376(field1210, var9);
	}

	@ObfuscatedName("ge.a(BI)I")
	public static int method473(int arg0) {
		return arg0 & 0x3FF;
	}

	@ObfuscatedName("ge.a(ILq;)Z")
	public static boolean method475(IfType arg0) {
		if (Client.field2103) {
			if (method530(arg0) != 0) {
				return false;
			}
			if (arg0.field3390 == 0) {
				return false;
			}
		}
		return arg0.field3378;
	}

	@ObfuscatedName("cj.a(BLi;)Lwe;")
	public static WorldMapLabel method207(JagString arg0) {
		if (arg0.method604() == 0) {
			return null;
		}
		for (WorldMapLabel var1 = (WorldMapLabel) field3049.head(); var1 != null; var1 = (WorldMapLabel) field3049.method1619()) {
			if (var1.field4486.method595(arg0)) {
				return var1;
			}
		}
		return null;
	}

	@ObfuscatedName("n.a(II)I")
	public static int method928(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("rd.d(B)V")
	public static void method1315() {
		if (field2915 > field1110) {
			field1110 += field1110 / 30.0D;
			if (field1110 > field2915) {
				field1110 = field2915;
			}
			method1604();
		} else if (field2915 < field1110) {
			field1110 -= field1110 / 30.0D;
			if (field2915 > field1110) {
				field1110 = field2915;
			}
			method1604();
		}
		if (field3659 == -1 || field594 == -1) {
			return;
		}
		int var0 = field3659 - field2330;
		if (var0 < 2 || var0 > 2) {
			var0 >>= 0x4;
		}
		int var1 = field594 - field3033;
		if (var1 < 2 || var1 > 2) {
			var1 >>= 0x4;
		}
		field3033 += var1;
		field2330 += var0;
		if (var0 == 0 && var1 == 0) {
			field3659 = -1;
			field594 = -1;
		}
		method1604();
	}

	@ObfuscatedName("rd.e(B)V")
	public static void method1319() {
		if (field319 == null) {
			return;
		}
		if (field4276 < 10) {
			if (!Client.worldmap.method954(field319)) {
				field4276 = Client.worldmap.method957(field319) / 10;
				return;
			}
			field4276 = 10;
		}
		if (field4276 == 10) {
			Packet var0 = new Packet(Client.worldmap.method960(field319, field1444));
			int var1 = var0.g2();
			int var2 = var0.g2();
			int var3 = var0.g2();
			int var4 = var0.g2();
			int var5 = var0.g2();
			int var6 = var0.g2();
			ClientBuild.field2181 = var2 * 64;
			ClientBuild.field239 = var1 * 64;
			field1110 = 8.0D;
			field2915 = 8.0D;
			field1009 = new int[FloType.field2923 + 1];
			ClientBuild.field760 = (var4 - var2) * 64 + 64;
			ClientBuild.field1988 = (var3 + 1 - var1) * 64;
			int var7 = Client.field3679 + (Client.localPlayer.field4121 >> 7) - ClientBuild.field2181;
			int var8 = Client.field4212 + (Client.localPlayer.field4136 >> 7) - ClientBuild.field239;
			int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
			int var10 = var7 + (int) (Math.random() * 10.0D) - 5;
			int var11 = ClientBuild.field760 >> 6;
			int var12 = ClientBuild.field1988 >> 6;
			field4052 = new byte[var12][var11][];
			field105 = new byte[var12][var11][];
			field1912 = new int[var12][var11][];
			field1786 = new byte[var12][var11][];
			field4166 = new byte[var12][var11][];
			int var13 = ClientBuild.field1270 >> 1;
			field2126 = new byte[var12][var11][];
			if (var9 >= 0 && var9 < ClientBuild.field1988 && var10 >= 0 && ClientBuild.field760 > var10) {
				field3033 = ClientBuild.field760 - var10;
				field2330 = var9;
			} else {
				field3033 = ClientBuild.field2181 + ClientBuild.field760 - var6 * 64;
				field2330 = var5 * 64 - ClientBuild.field239;
			}
			int var14 = ClientBuild.field4086 >> 2 << 10;
			field895 = new int[var12][var11][];
			field3951 = new byte[var12][var11][];
			for (int var15 = 0; var15 < FloType.field2923; var15++) {
				FloType var16 = FloType.method704(var15);
				if (var16 != null) {
					int var17 = var16.field98;
					if (var17 >= 0 && !Pix3D.field3356.method436(var17)) {
						var17 = -1;
					}
					int var21;
					if (var16.field104 >= 0) {
						int var18 = var16.field104;
						int var19 = var13 + (var18 & 0x7F);
						if (var19 < 0) {
							var19 = 0;
						} else if (var19 > 127) {
							var19 = 127;
						}
						int var20 = (var18 & 0x380) + ((var18 + var14 & 0xFC00) + var19);
						var21 = Pix3D.field3349[ClientBuild.method202(96, var20)];
					} else if (var17 >= 0) {
						var21 = Pix3D.field3349[ClientBuild.method202(96, Pix3D.field3356.method438(var17))];
					} else if (var16.field111 == -1) {
						var21 = -1;
					} else {
						int var22 = var16.field111;
						int var23 = var13 + (var22 & 0x7F);
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 127) {
							var23 = 127;
						}
						int var24 = (var22 & 0x380) + (var22 + var14 & 0xFC00) + var23;
						var21 = Pix3D.field3349[ClientBuild.method202(96, var24)];
					}
					field1009[var15 + 1] = var21;
				}
			}
			field4276 = 20;
		} else if (field4276 == 20) {
			ClientBuild.method1085(Client.worldmap.method960(field319, Client.field570));
			field4276 = 30;
			GameShell.doneslowupdate();
		} else if (field4276 == 30) {
			method1029(Client.worldmap.method960(field319, field325));
			field4276 = 50;
			GameShell.doneslowupdate();
		} else if (field4276 == 50) {
			method1473(Client.worldmap.method960(field319, field4208));
			field4276 = 70;
			GameShell.doneslowupdate();
		} else if (field4276 == 70) {
			method937(Client.worldmap.method960(field319, field3254));
			field4276 = 90;
			GameShell.doneslowupdate();
		} else {
			method658(Client.worldmap.method960(field319, field404));
			if (field4276 == 90) {
				field175 = new WorldMapFont(11, true, GameShell.canvas);
				field2147 = new WorldMapFont(12, true, GameShell.canvas);
				field4397 = new WorldMapFont(14, true, GameShell.canvas);
				field3762 = new WorldMapFont(17, true, GameShell.canvas);
				field3205 = new WorldMapFont(19, true, GameShell.canvas);
				field3199 = new WorldMapFont(22, true, GameShell.canvas);
				field4325 = new WorldMapFont(26, true, GameShell.canvas);
				field4250 = new WorldMapFont(30, true, GameShell.canvas);
				field4276 = 100;
			}
			field3659 = -1;
			field4276 = 100;
			field594 = -1;
			GameShell.doneslowupdate();
			System.gc();
		}
	}

	@ObfuscatedName("kf.a(IIIIIZI)V")
	public static void method786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg2 + arg4;
		int var7 = arg3 - arg2;
		int var8 = arg2 + arg5;
		int var9 = arg0 - arg2;
		for (int var10 = arg4; var10 < var6; var10++) {
			method1534(arg5, arg1, arg0, field42[var10]);
		}
		for (int var11 = arg3; var11 > var7; var11--) {
			method1534(arg5, arg1, arg0, field42[var11]);
		}
		for (int var12 = var6; var12 <= var7; var12++) {
			int[] var13 = field42[var12];
			method1534(arg5, arg1, var8, var13);
			method1534(var9, arg1, arg0, var13);
		}
	}

	@ObfuscatedName("li.b(II)I")
	public static int method872(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("uc.a(II)Z")
	public static boolean method1489(int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@ObfuscatedName("uc.a(Li;Z)Li;")
	public static JagString method1492(JagString arg0) {
		WorldMapLabel var1 = method207(arg0);
		return var1 == null ? field1113 : var1.field4486;
	}

	@ObfuscatedName("og.b(II)[B")
	public static byte[] method1072(int arg0) {
		ByteArrayNode2 var1 = (ByteArrayNode2) field388.method665((long) arg0);
		if (var1 == null) {
			byte[] var2 = new byte[512];
			Random var3 = new Random((long) arg0);
			for (int var4 = 0; var4 < 255; var4++) {
				var2[var4] = (byte) var4;
			}
			for (int var5 = 0; var5 < 255; var5++) {
				int var6 = 255 - var5;
				int var7 = method812(var6, var3);
				byte var8 = var2[var7];
				var2[var7] = var2[var6];
				var2[var6] = var2[511 - var5] = var8;
			}
			var1 = new ByteArrayNode2(var2);
			field388.method663((long) arg0, var1);
		}
		return var1.field3658;
	}

	@ObfuscatedName("ke.a(ZI)Z")
	public static boolean method782(int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@ObfuscatedName("na.a([BB)V")
	public static void method937(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = arg0[var1++] * 64 - ClientBuild.field239;
				int var3 = arg0[var1++] * 64 - ClientBuild.field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < ClientBuild.field1988 && var3 + 64 < ClientBuild.field760) {
					int var7 = var2 >> 6;
					int var8 = ClientBuild.field760 - var3 - 1 >> 6;
					for (int var9 = 0; var9 < 64; var9++) {
						for (int var10 = -64; var10 < 0; var10++) {
							byte var11 = arg0[var1++];
							if (var11 != 0) {
								if ((var11 & 0x1) == 1) {
									byte var12 = arg0[var1++];
									if (field4052[var7][var8] == null) {
										field4052[var7][var8] = new byte[4096];
									}
									field4052[var7][var8][(-(var10 + 1) << 6) + var9] = (byte) var12;
								}
								if ((var11 & 0x2) == 2) {
									byte var13 = arg0[var1++];
									if (field2126[var7][var8] == null) {
										field2126[var7][var8] = new byte[4096];
									}
									field2126[var7][var8][var9 + (-(var10 + 1) << 6)] = (byte) (var13 - 28);
								}
								if ((var11 & 0x4) == 4) {
									var1 += 3;
									int var14 = (arg0[var1 - 1] & 0xFF) + ((arg0[var1 - 3] & 0xFF) << 16) + ((arg0[var1 - 2] & 0xFF) << 8);
									if (field895[var7][var8] == null) {
										field895[var7][var8] = new int[4096];
									}
									var14--;
									LocType var15 = LocType.list(var14);
									if (var15.field2770 != null) {
										var15 = var15.method998();
										if (var15 == null || var15.field2817 == -1) {
											continue;
										}
									}
									field895[var7][var8][(-(var10 + 1) << 6) + var9] = var15.field2831 + 1;
									class65 var16 = new class65();
									var16.field1175 = ClientBuild.field760 - var3;
									var16.field1180 = var15.field2817;
									var16.field1179 = var2;
									field4359.push(var16);
								}
							}
						}
					}
				} else {
					for (int var4 = 0; var4 < 64; var4++) {
						for (int var5 = -64; var5 < 0; var5++) {
							byte var6 = arg0[var1++];
							if (var6 != 0) {
								if ((var6 & 0x1) == 1) {
									var1++;
								}
								if ((var6 & 0x2) == 2) {
									var1++;
								}
								if ((var6 & 0x4) == 4) {
									var1 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("oa.a(IIBIIIIIII)V")
	public static void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg7 && arg4 == arg3 && arg8 == arg2 && arg6 == arg5) {
			method723(arg7, arg5, arg1, arg4, arg2);
			return;
		}
		int var9 = arg7;
		int var10 = arg4;
		int var11 = arg7 * 3;
		int var12 = arg4 * 3;
		int var13 = arg6 * 3;
		int var14 = arg3 * 3;
		int var15 = arg8 * 3;
		int var16 = arg0 * 3;
		int var17 = arg5 + var14 - arg4 - var13;
		int var18 = arg2 + var16 - arg7 - var15;
		int var19 = var15 + var11 - var16 - var16;
		int var20 = var12 + var13 - var14 - var14;
		int var21 = var16 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var24 * var23 >> 12;
			int var26 = var18 * var25;
			int var27 = var24 * var19;
			int var28 = var23 * var21;
			int var29 = var24 * var20;
			int var30 = var17 * var25;
			int var31 = var22 * var23;
			int var32 = arg7 + (var26 + var27 + var28 >> 12);
			int var33 = arg4 + (var31 + var30 + var29 >> 12);
			method723(var9, var33, arg1, var10, var32);
			var10 = var33;
			var9 = var32;
		}
	}

	@ObfuscatedName("ob.b(B)V")
	public static void method1050() {
		NpcType.field2606.clear();
	}

	@ObfuscatedName("ob.a(IIIIIBII)V")
	public static void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		int var8 = arg5;
		int var9 = 0;
		int var10 = arg2 - arg4;
		int var11 = arg5 - arg4;
		int var12 = arg2 * arg2;
		int var13 = arg5 * arg5;
		int var14 = var11 * var11;
		int var15 = var13 << 1;
		int var16 = var10 * var10;
		int var17 = var12 << 1;
		int var18 = var16 << 1;
		int var19 = var14 << 1;
		int var20 = var11 << 1;
		int var21 = var19 + var16 * (1 - var20);
		int var22 = arg5 << 1;
		int var23 = var13 - (var22 - 1) * var17;
		int var24 = (1 - var22) * var12 + var15;
		int var25 = var14 - var18 * (var20 - 1);
		int var26 = var13 << 2;
		int var27 = var12 << 2;
		int var28 = var15 * 3;
		int var29 = var14 << 2;
		int var30 = var16 << 2;
		int var31 = var19 * 3;
		int var32 = var18 * (var20 - 3);
		int var33 = var26;
		int var34 = (var22 - 3) * var17;
		int var35 = var29;
		if (field919 <= arg0 && field279 >= arg0) {
			int[] var36 = field42[arg0];
			int var37 = method1058(field1207, field183, arg6 - arg2);
			int var38 = method1058(field1207, field183, arg6 + arg2);
			int var39 = method1058(field1207, field183, arg6 - var10);
			int var40 = method1058(field1207, field183, arg6 + var10);
			method1534(var37, arg1, var39, var36);
			method1534(var39, arg3, var40, var36);
			method1534(var40, arg1, var38, var36);
		}
		int var41 = (var11 - 1) * var30;
		int var42 = (arg5 - 1) * var27;
		while (var8 > 0) {
			if (var24 < 0) {
				while (var24 < 0) {
					var24 += var28;
					var28 += var26;
					var7++;
					var23 += var33;
					var33 += var26;
				}
			}
			boolean var43 = var11 >= var8;
			var8--;
			int var44 = var8 + arg0;
			int var45 = arg0 - var8;
			if (var43) {
				if (var21 < 0) {
					while (var21 < 0) {
						var25 += var35;
						var21 += var31;
						var31 += var29;
						var9++;
						var35 += var29;
					}
				}
				if (var25 < 0) {
					var25 += var35;
					var9++;
					var21 += var31;
					var31 += var29;
					var35 += var29;
				}
				var25 += -var32;
				var21 += -var41;
				var32 -= var30;
				var41 -= var30;
			}
			if (var23 < 0) {
				var23 += var33;
				var33 += var26;
				var24 += var28;
				var28 += var26;
				var7++;
			}
			var23 += -var34;
			var24 += -var42;
			var42 -= var27;
			var34 -= var27;
			if (var44 >= field919 && field279 >= var45) {
				int var46 = method1058(field1207, field183, arg6 + var7);
				int var47 = method1058(field1207, field183, arg6 - var7);
				if (var43) {
					int var48 = method1058(field1207, field183, arg6 + var9);
					int var49 = method1058(field1207, field183, arg6 - var9);
					if (var45 >= field919) {
						int[] var50 = field42[var45];
						method1534(var47, arg1, var49, var50);
						method1534(var49, arg3, var48, var50);
						method1534(var48, arg1, var46, var50);
					}
					if (field279 >= var44) {
						int[] var51 = field42[var44];
						method1534(var47, arg1, var49, var51);
						method1534(var49, arg3, var48, var51);
						method1534(var48, arg1, var46, var51);
					}
				} else {
					if (var45 >= field919) {
						method1534(var47, arg1, var46, field42[var45]);
					}
					if (field279 >= var44) {
						method1534(var47, arg1, var46, field42[var44]);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.b(II)I")
	public static int method702(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("oc.a(BI)I")
	public static int method1057(int arg0) {
		int var1 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
		int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
		int var4 = var3 + (var3 >>> 8);
		int var5 = var4 + (var4 >>> 16);
		return var5 & 0xFF;
	}

	@ObfuscatedName("ih.a([IIBIII[BIIII)V")
	public static void method677(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = (arg2 * (arg6 & 0xFF00FF) & 0xFF00FF00) + ((arg6 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		int var11 = 256 - arg2;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				if (arg5[arg3++] == 0) {
					arg7++;
				} else {
					int var14 = arg0[arg7];
					arg0[arg7++] = ((var11 * (var14 & 0xFF00FF) & 0xFF00FF00) + (var11 * (var14 & 0xFF00) & 0xFF0000) >> 8) + var10;
				}
			}
			arg7 += arg4;
			arg3 += arg9;
		}
	}

	@ObfuscatedName("jj.a(IIIIIIIIII)V")
	public static void method739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg2 >= field1207 && field183 >= arg2 && field1207 <= arg3 && field183 >= arg3 && arg8 >= field1207 && field183 >= arg8 && arg5 >= field1207 && arg5 <= field183 && arg1 >= field919 && arg1 <= field279 && arg0 >= field919 && field279 >= arg0 && field919 <= arg4 && arg4 <= field279 && field919 <= arg6 && arg6 <= field279) {
			method1042(arg3, arg7, arg5, arg0, arg1, arg6, arg4, arg2, arg8);
		} else {
			method982(arg2, arg3, arg5, arg7, arg6, arg0, arg1, arg4, arg8);
		}
	}

	@ObfuscatedName("jj.a(I)V")
	public static void method740() {
		if (field1734 != null && field2920 != null) {
			return;
		}
		field1734 = new int[256];
		field2920 = new int[256];
		for (int var0 = 0; var0 < 256; var0++) {
			double var1 = (double) var0 / 255.0D * 6.283185307179586D;
			field1734[var0] = (int) (Math.sin(var1) * 4096.0D);
			field2920[var0] = (int) (Math.cos(var1) * 4096.0D);
		}
	}

	@ObfuscatedName("ud.a(Lq;BI)Li;")
	public static JagString method1494(IfType arg0, int arg1) {
		if (!method726(arg1, method530(arg0)) && arg0.field3401 == null) {
			return null;
		} else if (arg0.field3373 == null || arg1 >= arg0.field3373.length || arg0.field3373[arg1] == null || arg0.field3373[arg1].method602().method604() == 0) {
			return Client.field2103 ? JagString.join(new JagString[] {field1802, JagString.method1212(arg1) }) : null;
		} else {
			return arg0.field3373[arg1];
		}
	}

	@ObfuscatedName("u.a([BI)V")
	public static void method1473(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - ClientBuild.field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - ClientBuild.field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < ClientBuild.field1988 && ClientBuild.field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = ClientBuild.field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (field3951[var4][var5] == null) {
									field3951[var4][var5] = new byte[4096];
								}
								field3951[var4][var5][(-(var7 + 1) << 6) + var6] = var8;
								byte var9 = arg0[var1++];
								if (field4166[var4][var5] == null) {
									field4166[var4][var5] = new byte[4096];
								}
								field4166[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
							}
						}
					}
				} else {
					for (int var10 = -4096; var10 < 0; var10++) {
						byte var11 = arg0[var1++];
						if (var11 != 0) {
							var1++;
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("v.a(IBIIII)V")
	public static void method1529(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2 - arg0;
		int var6 = arg1 - arg3;
		if (var5 == 0) {
			if (var6 != 0) {
				method580(arg4, arg1, arg3, arg0);
			}
		} else if (var6 == 0) {
			method659(arg2, arg3, arg4, arg0);
		} else {
			int var7 = (var6 << 12) / var5;
			int var8 = arg3 - (var7 * arg0 >> 12);
			int var9;
			int var10;
			if (field1207 > arg2) {
				var9 = field1207;
				var10 = (field1207 * var7 >> 12) + var8;
			} else if (arg2 > field183) {
				var9 = field183;
				var10 = var8 + (field183 * var7 >> 12);
			} else {
				var9 = arg2;
				var10 = arg1;
			}
			if (field919 > var10) {
				var10 = field919;
				var9 = (field919 - var8 << 12) / var7;
			} else if (var10 > field279) {
				var10 = field279;
				var9 = (field279 - var8 << 12) / var7;
			}
			int var11;
			int var12;
			if (field1207 > arg0) {
				var11 = field1207;
				var12 = (field1207 * var7 >> 12) + var8;
			} else if (field183 < arg0) {
				var11 = field183;
				var12 = (var7 * field183 >> 12) + var8;
			} else {
				var11 = arg0;
				var12 = arg3;
			}
			if (var12 < field919) {
				var12 = field919;
				var11 = (field919 - var8 << 12) / var7;
			} else if (field279 < var12) {
				var12 = field279;
				var11 = (field279 - var8 << 12) / var7;
			}
			method723(var11, var10, arg4, var12, var9);
		}
	}

	@ObfuscatedName("v.b(II)Z")
	public static boolean method1526(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("sd.a([SI[Li;)V")
	public static void method1376(short[] arg0, JagString[] arg1) {
		method1037(0, arg1, arg1.length - 1, arg0);
	}

	@ObfuscatedName("ne.a(IIIIZIIIII)V")
	public static void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg1 == arg0 && arg6 == arg5 && arg2 == arg8 && arg7 == arg4) {
			method1529(arg0, arg4, arg2, arg6, arg3);
			return;
		}
		int var9 = arg0;
		int var10 = arg6;
		int var11 = arg0 * 3;
		int var12 = arg6 * 3;
		int var13 = arg1 * 3;
		int var14 = arg5 * 3;
		int var15 = arg8 * 3;
		int var16 = arg7 * 3;
		int var17 = arg2 + var13 - var15 - arg0;
		int var18 = var15 + var11 - var13 - var13;
		int var19 = arg4 + var14 - arg6 - var16;
		int var20 = var16 + var12 - var14 - var14;
		int var21 = var13 - var11;
		int var22 = var14 - var12;
		for (int var23 = 128; var23 <= 4096; var23 += 128) {
			int var24 = var23 * var23 >> 12;
			int var25 = var21 * var23;
			int var26 = var23 * var24 >> 12;
			int var27 = var23 * var22;
			int var28 = var26 * var17;
			int var29 = var18 * var24;
			int var30 = var26 * var19;
			int var31 = (var25 + var28 + var29 >> 12) + arg0;
			int var32 = var24 * var20;
			int var33 = (var27 + var30 + var32 >> 12) + arg6;
			method1529(var9, var33, var31, var10, arg3);
			var10 = var33;
			var9 = var31;
		}
	}

	@ObfuscatedName("ne.a(IIIIIIII)V")
	public static void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = method1058(field919, field279, arg2);
		int var8 = method1058(field919, field279, arg4);
		int var9 = method1058(field1207, field183, arg3);
		int var10 = method1058(field1207, field183, arg1);
		int var11 = method1058(field919, field279, arg2 + arg5);
		int var12 = method1058(field919, field279, arg4 - arg5);
		for (int var13 = var7; var13 < var11; var13++) {
			method1534(var9, arg6, var10, field42[var13]);
		}
		for (int var14 = var8; var14 > var12; var14--) {
			method1534(var9, arg6, var10, field42[var14]);
		}
		int var15 = method1058(field1207, field183, arg3 + arg5);
		int var16 = method1058(field1207, field183, arg1 - arg5);
		for (int var17 = var11; var17 <= var12; var17++) {
			int[] var18 = field42[var17];
			method1534(var9, arg6, var15, var18);
			method1534(var15, arg0, var16, var18);
			method1534(var16, arg6, var10, var18);
		}
	}

	@ObfuscatedName("sc.a(IJ)V")
	public static void method1365(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}

	@ObfuscatedName("ib.a([BB)V")
	public static void method658(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g2();
		for (int var3 = 0; var3 < var2; var3++) {
			WorldMapLabel var4 = new WorldMapLabel();
			JagString var5 = var1.gjstr();
			var4.field4483 = var1.g2();
			var4.field4485 = var1.g2();
			var4.field4492 = var1.g1();
			var4.field4486 = var5.method626();
			var4.field4490 = var5.method600(47);
			field3049.push(var4);
		}
	}

	@ObfuscatedName("ib.a(IIIII)V")
	public static void method659(int arg0, int arg1, int arg2, int arg3) {
		if (field919 <= arg1 && arg1 <= field279) {
			int var4 = method1058(field1207, field183, arg3);
			int var5 = method1058(field1207, field183, arg0);
			method310(arg1, var5, var4, arg2);
		}
	}

	@ObfuscatedName("tc.e(I)V")
	public static void method1437() {
		for (LocChange var0 = (LocChange) Client.field1140.head(); var0 != null; var0 = (LocChange) Client.field1140.method1619()) {
			if (var0.field3061 == -1) {
				var0.field3054 = 0;
				Client.method1219(var0);
			} else {
				var0.unlink();
			}
		}
	}

	@ObfuscatedName("tc.a(IIIIII)V")
	public static void method1438(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = 0;
		int var6 = arg1;
		int var7 = arg4 * arg4;
		int var8 = arg1 * arg1;
		int var9 = var8 << 1;
		int var10 = var7 << 1;
		int var11 = arg1 << 1;
		int var12 = var9 + var7 * (1 - var11);
		int var13 = var8 - var10 * (var11 - 1);
		int var14 = var7 << 2;
		int var15 = var8 << 2;
		int var16 = var9 * 3;
		int var17 = var10 * ((arg1 << 1) - 3);
		int var18 = var15;
		int var19 = (arg1 - 1) * var14;
		if (field919 <= arg2 && arg2 <= field279) {
			int var20 = method1058(field1207, field183, arg4 + arg0);
			int var21 = method1058(field1207, field183, arg0 - arg4);
			method1534(var21, arg3, var20, field42[arg2]);
		}
		while (var6 > 0) {
			var6--;
			int var22 = arg2 - var6;
			int var23 = var6 + arg2;
			if (var12 < 0) {
				while (var12 < 0) {
					var13 += var18;
					var5++;
					var18 += var15;
					var12 += var16;
					var16 += var15;
				}
			}
			if (var13 < 0) {
				var5++;
				var13 += var18;
				var12 += var16;
				var16 += var15;
				var18 += var15;
			}
			var13 += -var17;
			if (var23 >= field919 && field279 >= var22) {
				int var24 = method1058(field1207, field183, arg0 + var5);
				int var25 = method1058(field1207, field183, arg0 - var5);
				if (var22 >= field919) {
					method1534(var25, arg3, var24, field42[var22]);
				}
				if (field279 >= var23) {
					method1534(var25, arg3, var24, field42[var23]);
				}
			}
			var17 -= var14;
			var12 += -var19;
			var19 -= var14;
		}
	}

	@ObfuscatedName("va.a(IIIIB)V")
	public static void method1532(int arg0, int arg1, int arg2, int arg3) {
		if (field1207 <= arg0 - arg1 && field183 >= arg1 + arg0 && arg2 - arg1 >= field919 && field279 >= arg1 + arg2) {
			method745(arg2, arg3, arg1, arg0);
		} else {
			method318(arg3, arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("va.a(IIII[I)V")
	public static void method1534(int arg0, int arg1, int arg2, int[] arg3) {
		arg0--;
		int var10 = arg2 - 1;
		int var4 = var10 - 7;
		while (arg0 < var4) {
			int var5 = arg0 + 1;
			arg3[var5] = arg1;
			int var6 = var5 + 1;
			arg3[var6] = arg1;
			int var7 = var6 + 1;
			arg3[var7] = arg1;
			int var8 = var7 + 1;
			arg3[var8] = arg1;
			int var9 = var8 + 1;
			arg3[var9] = arg1;
			int var11 = var9 + 1;
			arg3[var11] = arg1;
			int var12 = var11 + 1;
			arg3[var12] = arg1;
			arg0 = var12 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < var10) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}

	@ObfuscatedName("mg.c(II)I")
	public static int method920(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("rg.a(IIZIIIII)V")
	public static void method1333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = arg1 + arg3;
		int var8 = arg2 - arg3;
		int var9 = arg4 + arg3;
		for (int var10 = arg1; var10 < var7; var10++) {
			method1534(arg4, arg6, arg5, field42[var10]);
		}
		int var11 = arg5 - arg3;
		for (int var12 = arg2; var12 > var8; var12--) {
			method1534(arg4, arg6, arg5, field42[var12]);
		}
		for (int var13 = var7; var13 <= var8; var13++) {
			int[] var14 = field42[var13];
			method1534(arg4, arg6, var9, var14);
			method1534(var9, arg0, var11, var14);
			method1534(var11, arg6, arg5, var14);
		}
	}

	@ObfuscatedName("wb.a(IIIII)V")
	public static void method1590(int arg0, int arg1, int arg2, int arg3) {
		Pix2D.setClipping(arg1, arg0, arg2 + arg1, arg3 + arg0);
		Pix2D.method478(arg1, arg0, arg2, arg3, 0);
		if (field4276 < 100) {
			return;
		}
		if (field4500 == null) {
			SoftwarePix32 var4 = new SoftwarePix32(arg2, arg3);
			Pix2D.method496(var4.field3247, arg2, arg3);
			method348(arg3, arg2, 0, 0, ClientBuild.field760, 0, ClientBuild.field1988, 0);
			field4500 = var4;
			GameShell.field3852.method1521();
		}
		field4500.method1161(arg1, arg0);
		int var5 = arg1 + field693 * arg2 / ClientBuild.field1988;
		int var6 = field1309 * arg2 / ClientBuild.field1988;
		int var7 = arg0 + field727 * arg3 / ClientBuild.field760;
		int var8 = field3136 * arg3 / ClientBuild.field760;
		Pix2D.fillRectTrans(var5, var7, var6, var8, 16711680, 128);
		Pix2D.method476(var5, var7, var6, var8, 16711680);
		if (field1012 > 0 && field1012 % 10 < 5) {
			for (class65 var9 = (class65) field4359.head(); var9 != null; var9 = (class65) field4359.method1619()) {
				if (var9.field1180 == field772) {
					int var10 = arg1 + arg2 * var9.field1179 / ClientBuild.field1988;
					int var11 = var9.field1175 * arg3 / ClientBuild.field760 + arg0;
					Pix2D.method478(var10 - 2, var11 + -2, 4, 4, 16776960);
				}
			}
		}
	}

	@ObfuscatedName("oh.a(ZI)I")
	public static int method1077(int arg0) {
		return arg0 >>> 8;
	}

	@ObfuscatedName("oh.a(III)I")
	public static int method1080(int arg0, int arg1) {
		int var2 = arg1 - 1 & arg0 >> 31;
		return var2 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@ObfuscatedName("jd.c(I)I")
	public static int method708() {
		if (field2915 == 3.0D) {
			return 37;
		} else if (field2915 == 4.0D) {
			return 50;
		} else if (field2915 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@ObfuscatedName("sg.a(IIIII)Z")
	public static boolean method1389(int arg0, int arg1, int arg2, int arg3) {
		int var4 = arg3 * World.field3242 + arg0 * World.field3066 >> 16;
		int var5 = arg3 * World.field3066 - arg0 * World.field3242 >> 16;
		int var6 = arg1 * World.field1803 + var5 * World.field3838 >> 16;
		int var7 = arg1 * World.field3838 - var5 * World.field1803 >> 16;
		if (var6 < 1) {
			var6 = 1;
		}
		int var8 = (var4 << 9) / var6;
		int var9 = (var7 << 9) / var6;
		int var10 = arg2 * World.field1803 + var5 * World.field3838 >> 16;
		int var11 = arg2 * World.field3838 - var5 * World.field1803 >> 16;
		if (var10 < 1) {
			var10 = 1;
		}
		int var12 = (var4 << 9) / var10;
		int var13 = (var11 << 9) / var10;
		if (var6 < 50 && var10 < 50) {
			return false;
		} else if (var6 > 3500 && var10 > 3500) {
			return false;
		} else if (var8 < field2766 && var12 < field2766) {
			return false;
		} else if (var8 > field2931 && var12 > field2931) {
			return false;
		} else if (var9 < field1102 && var13 < field1102) {
			return false;
		} else {
			return var9 <= field4055 || var13 <= field4055;
		}
	}

	@ObfuscatedName("se.a(I)V")
	public static void method1378() {
		field4052 = null;
		field4166 = null;
		field1912 = null;
		field105 = null;
		field2126 = null;
		field1786 = null;
		field3951 = null;
		Client.field1706 = null;
		field895 = null;
		field1009 = null;
		field4276 = 0;
		field4359.method1616();
		field3049.method1616();
		field4397 = null;
		field2147 = null;
		field4325 = null;
		field4250 = null;
		field3199 = null;
		field3205 = null;
		field175 = null;
		field4500 = null;
		field3762 = null;
	}

	@ObfuscatedName("hc.b(IBI)I")
	public static int method534(int arg0, int arg1) {
		int var2 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				var2 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("hc.a(ILq;)I")
	public static int method530(IfType arg0) {
		IntNode var1 = (IntNode) field495.method1049(((long) arg0.parentId << 32) + ((long) arg0.field3406));
		return var1 == null ? arg0.field3494 : var1.field3698;
	}

	@ObfuscatedName("lj.a(BLi;)V")
	public static void method879(JagString arg0) {
		WorldMapLabel var1 = method207(arg0);
		if (var1 == null) {
			return;
		}
		field594 = ClientBuild.field760 + ClientBuild.field2181 - var1.field4485;
		field3659 = var1.field4483 - ClientBuild.field239;
		int var2 = field594 - (int) ((double) Client.field1706.field3422 / field1110);
		int var3 = field3659 - (int) ((double) Client.field1706.field3380 / field1110);
		int var4 = field3659 + (int) ((double) Client.field1706.field3380 / field1110);
		if (var3 < 0) {
			field3659 = (int) ((double) Client.field1706.field3380 / field1110);
		}
		int var5 = (int) ((double) Client.field1706.field3422 / field1110) + field594;
		if (var4 > ClientBuild.field1988) {
			field3659 = ClientBuild.field1988 - (int) ((double) Client.field1706.field3380 / field1110);
		}
		if (var2 < 0) {
			field594 = (int) ((double) Client.field1706.field3422 / field1110);
		}
		if (var5 > ClientBuild.field760) {
			field594 = ClientBuild.field760 - (int) ((double) Client.field1706.field3422 / field1110);
		}
	}

	@ObfuscatedName("ki.a(IZ)I")
	public static int method799(int arg0) {
		return arg0 & 0xFF;
	}

	@ObfuscatedName("kj.a(ILjava/util/Random;I)I")
	public static int method812(int arg0, Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (method1017(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			int var2 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			int var3;
			do {
				var3 = arg1.nextInt();
			} while (var2 <= var3);
			return method1080(var3, arg0);
		}
	}

	@ObfuscatedName("t.a(IIBIII)V")
	public static void method1420(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var8 = arg3 + 1;
		method1534(arg0, arg4, arg1, field42[arg3]);
		int var7 = arg2 - 1;
		method1534(arg0, arg4, arg1, field42[arg2]);
		for (int var5 = var8; var5 <= var7; var5++) {
			int[] var6 = field42[var5];
			var6[arg0] = var6[arg1] = arg4;
		}
	}

	@ObfuscatedName("ng.c(II)Z")
	public static boolean method1017(int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@ObfuscatedName("ea.a(IIIBI)V")
	public static void method310(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 <= arg1) {
			method1534(arg2, arg3, arg1, field42[arg0]);
		} else {
			method1534(arg1, arg3, arg2, field42[arg0]);
		}
	}

	@ObfuscatedName("ea.a(IIIII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0;
		int var5 = arg2;
		int var6 = -arg2;
		int var7 = method1058(field1207, field183, arg1 + arg2);
		int var8 = -1;
		int var9 = method1058(field1207, field183, arg1 - arg2);
		method1534(var9, arg0, var7, field42[arg3]);
		while (var5 > var4) {
			var8 += 2;
			var6 += var8;
			if (var6 > 0) {
				var5--;
				var6 -= var5 << 1;
				int var10 = arg3 - var5;
				int var11 = arg3 + var5;
				if (field919 <= var11 && var10 <= field279) {
					int var12 = method1058(field1207, field183, arg1 + var4);
					int var13 = method1058(field1207, field183, arg1 - var4);
					if (var11 <= field279) {
						method1534(var13, arg0, var12, field42[var11]);
					}
					if (var10 >= field919) {
						method1534(var13, arg0, var12, field42[var10]);
					}
				}
			}
			var4++;
			int var14 = var4 + arg3;
			int var15 = arg3 - var4;
			if (field919 <= var14 && field279 >= var15) {
				int var16 = method1058(field1207, field183, arg1 + var5);
				int var17 = method1058(field1207, field183, arg1 - var5);
				if (var14 <= field279) {
					method1534(var17, arg0, var16, field42[var14]);
				}
				if (var15 >= field919) {
					method1534(var17, arg0, var16, field42[var15]);
				}
			}
		}
	}

	@ObfuscatedName("ea.a(Lnb;BLnb;)I")
	public static int method330(Js5 arg0, Js5 arg1) {
		int var2 = 0;
		if (arg0.method953(field2009)) {
			var2++;
		}
		if (arg1.method953(field2932)) {
			var2++;
		}
		if (arg1.method953(field1896)) {
			var2++;
		}
		if (arg1.method953(field3019)) {
			var2++;
		}
		if (arg1.method953(field4502)) {
			var2++;
		}
		if (arg1.method953(field2912)) {
			var2++;
		}
		arg1.method953(TitleScreen.field209);
		arg1.method953(TitleScreen.field119);
		arg1.method953(TitleScreen.field1783);
		arg1.method953(TitleScreen.field2195);
		arg1.method953(field4247);
		return var2;
	}

	@ObfuscatedName("ea.a(IIIBIIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg6 - arg5;
		int var9 = arg4 - arg7;
		int var10 = (arg1 - arg2 << 16) / var8;
		if (ClientBuild.field1988 > arg6) {
			var8++;
		}
		int var11 = (arg0 - arg3 << 16) / var9;
		if (ClientBuild.field760 > arg4) {
			var9++;
		}
		for (int var12 = 0; var12 < var8; var12++) {
			int var13 = var10 * (var12 + 1) >> 16;
			int var14 = var12 * var10 >> 16;
			int var15 = var13 - var14;
			if (var15 > 0) {
				int var16 = var13 + arg2;
				int var17 = var14 + arg2;
				int var18 = var12 + arg5 >> 6;
				int[][] var19 = field1912[var18];
				byte[][] var20 = field1786[var18];
				byte[][] var21 = field105[var18];
				byte[][] var22 = field4166[var18];
				byte[][] var23 = field3951[var18];
				byte[][] var24 = field4052[var18];
				for (int var25 = 0; var25 < var9; var25++) {
					int var26 = var25 * var11 >> 16;
					int var27 = var11 * (var25 + 1) >> 16;
					int var28 = var27 - var26;
					if (var28 > 0) {
						int var29 = var26 + arg3;
						int var30 = var25 + arg7 >> 6;
						int var31 = arg7 + var25 & 0x3F;
						int var32 = var27 + arg3;
						int var33 = var12 + arg5 & 0x3F;
						int var34 = var33 + (var31 << 6);
						int var35;
						if (var19[var30] == null) {
							int var36 = var12 + arg5 & 0x4;
							int var37 = var25 + arg7 & 0x4;
							if (var36 < 2 && var37 > 2 || var36 > 2 && var37 < 2) {
								var35 = 4936552;
							} else {
								var35 = field1009[FloType.field2489 + 1];
							}
						} else {
							var35 = var19[var30][var34];
						}
						if (var35 == 0) {
							var35 = 1;
						}
						int var38 = var21[var30] == null ? 0 : field1009[var21[var30][var34] & 0xFF];
						int var39 = var23[var30] == null ? 0 : field1009[var23[var30][var34] & 0xFF];
						if (var38 == 0 && var39 == 0) {
							Pix2D.method478(var17, var29, var15, var28, var35);
						} else {
							if (var38 != 0) {
								byte var40 = var20[var30] == null ? 0 : var20[var30][var34];
								int var41 = var40 & 0xFC;
								if (var38 == -1) {
									var38 = 1;
								}
								if (var41 == 0 || var15 <= 1 || var28 <= 1) {
									Pix2D.method478(var17, var29, var15, var28, var38);
								} else {
									method1482(true, var28, var35, var40 & 0x3, var29, var38, var41 >> 2, var17, var15, Pix2D.field1331);
								}
							}
							if (var39 != 0) {
								if (var39 == -1) {
									var39 = var35;
								}
								byte var42 = var22[var30][var34];
								int var43 = var42 & 0xFC;
								if (var43 == 0 || var15 <= 1 || var28 <= 1) {
									Pix2D.method478(var17, var29, var15, var28, var39);
								}
								method1482(var38 == 0, var28, 0, var42 & 0x3, var29, var39, var43 >> 2, var17, var15, Pix2D.field1331);
							}
						}
						if (var24[var30] != null) {
							int var44 = var24[var30][var34] & 0xFF;
							if (var44 != 0) {
								int var45;
								if (var15 == 1) {
									var45 = var17;
								} else {
									var45 = var16 - 1;
								}
								int var46;
								if (var28 == 1) {
									var46 = var29;
								} else {
									var46 = var32 - 1;
								}
								int var47 = 13421772;
								if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
									var44 -= 4;
									var47 = 13369344;
								}
								if (var44 == 1) {
									Pix2D.method487(var17, var29, var28, var47);
								} else if (var44 == 2) {
									Pix2D.method489(var17, var29, var15, var47);
								} else if (var44 == 3) {
									Pix2D.method487(var45, var29, var28, var47);
								} else if (var44 == 4) {
									Pix2D.method489(var17, var46, var15, var47);
								} else if (var44 == 9) {
									Pix2D.method487(var17, var29, var28, 16777215);
									Pix2D.method489(var17, var29, var15, var47);
								} else if (var44 == 10) {
									Pix2D.method487(var45, var29, var28, 16777215);
									Pix2D.method489(var17, var29, var15, var47);
								} else if (var44 == 11) {
									Pix2D.method487(var45, var29, var28, 16777215);
									Pix2D.method489(var17, var46, var15, var47);
								} else if (var44 == 12) {
									Pix2D.method487(var17, var29, var28, 16777215);
									Pix2D.method489(var17, var46, var15, var47);
								} else if (var44 == 17) {
									Pix2D.method489(var17, var29, 1, var47);
								} else if (var44 == 18) {
									Pix2D.method489(var45, var29, 1, var47);
								} else if (var44 == 19) {
									Pix2D.method489(var45, var46, 1, var47);
								} else if (var44 == 20) {
									Pix2D.method489(var17, var46, 1, var47);
								} else if (var44 == 25) {
									for (int var48 = 0; var48 < var28; var48++) {
										Pix2D.method489(var48 + var17, -var48 + var46, 1, var47);
									}
								} else if (var44 == 26) {
									for (int var49 = 0; var49 < var28; var49++) {
										Pix2D.method489(var17 + var49, var49 + var29, 1, var47);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int var50 = 0; var50 < var8; var50++) {
			int var51 = var50 * var10 >> 16;
			int var52 = (var50 + 1) * var10 >> 16;
			int var53 = var52 - var51;
			if (var53 > 0) {
				int var54 = var51 + arg2;
				byte[][] var55 = field2126[arg5 + var50 >> 6];
				for (int var56 = 0; var56 < var9; var56++) {
					int var57 = var56 * var11 >> 16;
					int var58 = (var56 + 1) * var11 >> 16;
					int var59 = var58 - var57;
					if (var59 > 0) {
						int var60 = (arg5 + var50 & 0x3F) + ((var56 + arg7 & 0x3F) << 6);
						int var61 = var56 + arg7 >> 6;
						int var62 = var57 + arg3;
						if (var55[var61] != null) {
							int var63 = var55[var61][var60] & 0xFF;
							if (var63 != 0) {
								if (var63 == 47 || var63 == 53) {
									Client.field4460[var63 - 1].method1338(var54, var62, var53 * 2 + 1, var59 * 2 + 1);
								} else {
									Client.field4460[var63 - 1].method1338(var54 - var53 / 2, var62 + -(var59 / 2), var53 * 2, var59 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ue.a(IIIIIIIII)V")
	public static void method1500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg5 - arg6;
		int var9 = arg7 - arg4;
		int var10 = (arg2 - arg1 << 16) / var8;
		int var11 = (arg3 - arg0 << 16) / var9;
		boolean var12;
		if (field1012 > 0 && field1012 % 10 < 5) {
			var12 = true;
		} else {
			var12 = false;
		}
		for (int var13 = 0; var13 < var8; var13++) {
			int var14 = var10 * (var13 + 1) >> 16;
			int var15 = var13 * var10 >> 16;
			int var16 = var14 - var15;
			if (var16 > 0) {
				int[][] var17 = field895[var13 + arg6 >> 6];
				int var18 = var15 + arg1;
				for (int var19 = 0; var19 < var9; var19++) {
					int var20 = (var19 + 1) * var11 >> 16;
					int var21 = var19 * var11 >> 16;
					int var22 = var20 - var21;
					if (var22 > 0) {
						int var23 = var21 + arg0;
						int var24 = var19 + arg4 >> 6;
						if (var17[var24] != null) {
							int var25 = (var13 + arg6 & 0x3F) + ((var19 + arg4 & 0x3F) << 6);
							int var26 = var17[var24][var25];
							if (var26 != 0) {
								LocType var27 = LocType.list(var26 - 1);
								if (var12 && field772 == var27.field2817) {
									class65 var28 = new class65();
									var28.field1179 = var18;
									var28.field1180 = var27.field2817;
									var28.field1175 = var23;
									field783.push(var28);
								}
								Client.field505[var27.field2817].method1155(var18 - 7, var23 + -7);
							}
						}
					}
				}
			}
		}
		if (field1110 == field2915) {
			for (WorldMapLabel var29 = (WorldMapLabel) field3049.head(); var29 != null; var29 = (WorldMapLabel) field3049.method1619()) {
				int var30 = var29.field4483;
				int var31 = var30 - ClientBuild.field239;
				int var32 = var29.field4485;
				int var33 = ClientBuild.field2181 + ClientBuild.field760 - var32;
				int var34 = arg1 + (arg2 - arg1) * (var31 - arg6) / (arg5 - arg6);
				int var35 = (var33 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				int var36 = var29.field4492;
				int var37 = 16777215;
				WorldMapFont var38 = null;
				if (var36 == 0) {
					if (field1110 == 3.0D) {
						var38 = field175;
					}
					if (field1110 == 4.0D) {
						var38 = field2147;
					}
					if (field1110 == 6.0D) {
						var38 = field4397;
					}
					if (field1110 == 8.0D) {
						var38 = field3762;
					}
				}
				if (var36 == 1) {
					if (field1110 == 3.0D) {
						var38 = field4397;
					}
					if (field1110 == 4.0D) {
						var38 = field3762;
					}
					if (field1110 == 6.0D) {
						var38 = field3205;
					}
					if (field1110 == 8.0D) {
						var38 = field3199;
					}
				}
				if (var36 == 2) {
					var37 = 16755200;
					if (field1110 == 3.0D) {
						var38 = field3205;
					}
					if (field1110 == 4.0D) {
						var38 = field3199;
					}
					if (field1110 == 6.0D) {
						var38 = field4325;
					}
					if (field1110 == 8.0D) {
						var38 = field4250;
					}
				}
				if (var38 != null) {
					JagString[] var39 = var29.field4490;
					int var40 = var39.length;
					int var41 = var35 - var38.method508() * (var40 - 1) / 2;
					int var42 = var41 + var38.method505() / 2;
					for (int var43 = 0; var43 < var40; var43++) {
						var38.method511(var39[var43], var34, var42, var37);
						var42 += var38.method508();
					}
				}
			}
		}
		for (class65 var44 = (class65) field783.head(); var44 != null; var44 = (class65) field783.method1619()) {
			Client.field505[var44.field1180].method1155(var44.field1179 - 7, var44.field1175 + -7);
			Pix2D.method483(var44.field1179, var44.field1175, 15, 16776960, 128);
			Pix2D.method483(var44.field1179, var44.field1175, 7, 16777215, 256);
		}
		field783.method1616();
	}

	@ObfuscatedName("ue.a(IIIIZI)V")
	public static void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var5 = arg3; var5 <= arg4; var5++) {
			method1534(arg0, arg1, arg2, field42[var5]);
		}
	}

	@ObfuscatedName("nh.a(IIIZII)V")
	public static void method1028(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 > field279 || field919 > arg0) {
			return;
		}
		boolean var5;
		if (field1207 > arg2) {
			var5 = false;
			arg2 = field1207;
		} else if (field183 >= arg2) {
			var5 = true;
		} else {
			arg2 = field183;
			var5 = false;
		}
		boolean var6;
		if (arg4 < field1207) {
			arg4 = field1207;
			var6 = false;
		} else if (field183 >= arg4) {
			var6 = true;
		} else {
			arg4 = field183;
			var6 = false;
		}
		if (arg3 >= field919) {
			method1534(arg2, arg1, arg4, field42[arg3++]);
		} else {
			arg3 = field919;
		}
		if (arg0 <= field279) {
			method1534(arg2, arg1, arg4, field42[arg0--]);
		} else {
			arg0 = field279;
		}
		if (var5 && var6) {
			for (int var9 = arg3; var9 <= arg0; var9++) {
				int[] var10 = field42[var9];
				var10[arg2] = var10[arg4] = arg1;
			}
			return;
		}
		if (var5) {
			for (int var7 = arg3; var7 <= arg0; var7++) {
				field42[var7][arg2] = arg1;
			}
			return;
		}
		if (var6) {
			for (int var8 = arg3; var8 <= arg0; var8++) {
				field42[var8][arg4] = arg1;
			}
			return;
		}
	}

	@ObfuscatedName("nh.a([BI)V")
	public static void method1029(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - ClientBuild.field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - ClientBuild.field2181;
				if (var2 > 0 && var3 > 0 && ClientBuild.field1988 > var2 + 64 && ClientBuild.field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = ClientBuild.field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (field105[var4][var5] == null) {
									field105[var4][var5] = new byte[4096];
								}
								field105[var4][var5][var6 + (-(var7 + 1) << 6)] = var8;
								byte var9 = arg0[var1++];
								if (field1786[var4][var5] == null) {
									field1786[var4][var5] = new byte[4096];
								}
								field1786[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
							}
						}
					}
				} else {
					for (int var10 = -4096; var10 < 0; var10++) {
						byte var11 = arg0[var1++];
						if (var11 != 0) {
							var1++;
						}
					}
				}
			}
			return;
		}
	}

	@ObfuscatedName("lb.a(IIIIIIB)V")
	public static void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method906(arg3);
		int var6 = 0;
		int var7 = arg3 - arg5;
		if (var7 < 0) {
			var7 = 0;
		}
		int var8 = arg3;
		int var9 = -arg3;
		int var10 = var7;
		if (field919 <= arg1 && arg1 <= field279) {
			int[] var11 = field42[arg1];
			int var12 = method1058(field1207, field183, arg4 - arg3);
			int var13 = method1058(field1207, field183, arg4 + arg3);
			int var14 = method1058(field1207, field183, arg4 - var7);
			int var15 = method1058(field1207, field183, arg4 + var7);
			method1534(var12, arg2, var14, var11);
			method1534(var14, arg0, var15, var11);
			method1534(var15, arg2, var13, var11);
		}
		int var16 = -1;
		int var17 = -var7;
		int var18 = -1;
		while (var8 > var6) {
			var18 += 2;
			var9 += var18;
			var16 += 2;
			var17 += var16;
			if (var17 >= 0 && var10 >= 1) {
				var10--;
				field482[var10] = var6;
				var17 -= var10 << 1;
			}
			var6++;
			if (var9 >= 0) {
				var8--;
				var9 -= var8 << 1;
				int var19 = arg1 - var8;
				int var20 = arg1 + var8;
				if (field919 <= var20 && field279 >= var19) {
					if (var8 < var7) {
						int var21 = field482[var8];
						int var22 = method1058(field1207, field183, arg4 + var6);
						int var23 = method1058(field1207, field183, arg4 - var6);
						int var24 = method1058(field1207, field183, var21 + arg4);
						int var25 = method1058(field1207, field183, arg4 - var21);
						if (var20 <= field279) {
							int[] var26 = field42[var20];
							method1534(var23, arg2, var25, var26);
							method1534(var25, arg0, var24, var26);
							method1534(var24, arg2, var22, var26);
						}
						if (var19 >= field919) {
							int[] var27 = field42[var19];
							method1534(var23, arg2, var25, var27);
							method1534(var25, arg0, var24, var27);
							method1534(var24, arg2, var22, var27);
						}
					} else {
						int var28 = method1058(field1207, field183, var6 + arg4);
						int var29 = method1058(field1207, field183, arg4 - var6);
						if (var20 <= field279) {
							method1534(var29, arg2, var28, field42[var20]);
						}
						if (field919 <= var19) {
							method1534(var29, arg2, var28, field42[var19]);
						}
					}
				}
			}
			int var30 = var6 + arg1;
			int var31 = arg1 - var6;
			if (var30 >= field919 && var31 <= field279) {
				int var32 = arg4 + var8;
				int var33 = arg4 - var8;
				if (field1207 <= var32 && var33 <= field183) {
					int var34 = method1058(field1207, field183, var32);
					int var35 = method1058(field1207, field183, var33);
					if (var7 > var6) {
						int var36 = var10 >= var6 ? var10 : field482[var6];
						int var37 = method1058(field1207, field183, var36 + arg4);
						int var38 = method1058(field1207, field183, arg4 - var36);
						if (var30 <= field279) {
							int[] var39 = field42[var30];
							method1534(var35, arg2, var38, var39);
							method1534(var38, arg0, var37, var39);
							method1534(var37, arg2, var34, var39);
						}
						if (var31 >= field919) {
							int[] var40 = field42[var31];
							method1534(var35, arg2, var38, var40);
							method1534(var38, arg0, var37, var40);
							method1534(var37, arg2, var34, var40);
						}
					} else {
						if (field279 >= var30) {
							method1534(var35, arg2, var34, field42[var30]);
						}
						if (field919 <= var31) {
							method1534(var35, arg2, var34, field42[var31]);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ug.a(ILq;)Lq;")
	public static IfType method1512(IfType arg0) {
		IfType var1 = GameShell.method583(arg0);
		if (var1 == null) {
			var1 = arg0.field3502;
		}
		return var1;
	}

	@ObfuscatedName("ug.a(IIIIIBII)V")
	public static void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 == arg2) {
			Client.method216(arg2, arg5, arg4, arg6, arg0, arg3);
		} else if (arg3 - arg2 >= field1207 && arg2 + arg3 <= field183 && field919 <= arg6 - arg1 && field279 >= arg1 + arg6) {
			method126(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			method1051(arg6, arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}

	@ObfuscatedName("me.a(IZ)V")
	public static void method906(int arg0) {
		if (field482 == null || field482.length < arg0) {
			field482 = new int[arg0];
		}
	}

	@ObfuscatedName("mc.a(IIBIII)V")
	public static void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg2;
		method1534(arg0 - arg1, arg4, arg0 + arg1, field42[arg3]);
		int var6 = arg1 * arg1;
		int var7 = 0;
		int var8 = arg2 * arg2;
		int var9 = var8 << 1;
		int var10 = var6 << 1;
		int var11 = arg2 << 1;
		int var12 = var8 - var10 * (var11 - 1);
		int var13 = var9 + var6 * (1 - var11);
		int var14 = var6 << 2;
		int var15 = var10 * ((arg2 << 1) - 3);
		int var16 = var8 << 2;
		int var17 = var16;
		int var18 = var9 * 3;
		int var19 = (arg2 - 1) * var14;
		while (var5 > 0) {
			if (var13 < 0) {
				while (var13 < 0) {
					var7++;
					var13 += var18;
					var12 += var17;
					var18 += var16;
					var17 += var16;
				}
			}
			var5--;
			int var20 = arg3 - var5;
			if (var12 < 0) {
				var13 += var18;
				var7++;
				var18 += var16;
				var12 += var17;
				var17 += var16;
			}
			int var21 = var5 + arg3;
			var13 += -var19;
			var19 -= var14;
			int var22 = arg0 + var7;
			int var23 = arg0 - var7;
			method1534(var23, arg4, var22, field42[var20]);
			var12 += -var15;
			var15 -= var14;
			method1534(var23, arg4, var22, field42[var21]);
		}
	}

	@ObfuscatedName("kb.a(Li;Z)V")
	public static void method764(JagString arg0) {
		field319 = arg0;
		method1378();
	}

	@ObfuscatedName("jg.a(III)Z")
	public static boolean method726(int arg0, int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("jg.a(IIIIBI)V")
	public static void method723(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var5 = arg1 - arg3;
		int var6 = arg4 - arg0;
		if (var6 == 0) {
			if (var5 != 0) {
				method753(arg2, arg3, arg0, arg1);
			}
		} else if (var5 == 0) {
			method310(arg3, arg4, arg0, arg2);
		} else {
			if (var6 < 0) {
				var6 = -var6;
			}
			if (var5 < 0) {
				var5 = -var5;
			}
			boolean var7 = var6 < var5;
			if (var7) {
				int var8 = arg0;
				arg0 = arg3;
				arg3 = var8;
				int var9 = arg4;
				arg4 = arg1;
				arg1 = var9;
			}
			if (arg4 < arg0) {
				int var10 = arg0;
				int var11 = arg3;
				arg3 = arg1;
				arg0 = arg4;
				arg1 = var11;
				arg4 = var10;
			}
			int var12 = arg1 - arg3;
			int var13 = arg4 - arg0;
			if (var12 < 0) {
				var12 = -var12;
			}
			int var14 = arg3;
			int var15 = -(var13 >> 1);
			int var16 = arg3 < arg1 ? 1 : -1;
			if (var7) {
				for (int var17 = arg0; var17 <= arg4; var17++) {
					field42[var17][var14] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var14 += var16;
						var15 -= var13;
					}
				}
			} else {
				for (int var18 = arg0; var18 <= arg4; var18++) {
					field42[var14][var18] = arg2;
					var15 += var12;
					if (var15 > 0) {
						var15 -= var13;
						var14 += var16;
					}
				}
			}
		}
	}

	@ObfuscatedName("hi.a(IBIII)V")
	public static void method580(int arg0, int arg1, int arg2, int arg3) {
		if (field1207 <= arg3 && arg3 <= field183) {
			int var4 = method1058(field919, field279, arg2);
			int var5 = method1058(field919, field279, arg1);
			method753(arg0, var4, arg3, var5);
		}
	}

	@ObfuscatedName("hi.a(IZ)V")
	public static void method581(int arg0) {
		field772 = arg0;
		field1012 = 50;
	}

	@ObfuscatedName("wf.a(I)V")
	public static void method1604() {
		int var0 = field2330 - (int) ((double) Client.field1706.field3380 / field1110);
		int var1 = field3033 - (int) ((double) Client.field1706.field3422 / field1110);
		int var2 = field2330 + (int) ((double) Client.field1706.field3380 / field1110);
		if (var0 < 0) {
			field2330 = (int) ((double) Client.field1706.field3380 / field1110);
			field3659 = -1;
			field594 = -1;
		}
		if (ClientBuild.field1988 < var2) {
			field2330 = ClientBuild.field1988 - (int) ((double) Client.field1706.field3380 / field1110);
			field594 = -1;
			field3659 = -1;
		}
		int var3 = (int) ((double) Client.field1706.field3422 / field1110) + field3033;
		if (var1 < 0) {
			field3033 = (int) ((double) Client.field1706.field3422 / field1110);
			field3659 = -1;
			field594 = -1;
		}
		if (var3 > ClientBuild.field760) {
			field3033 = ClientBuild.field760 - (int) ((double) Client.field1706.field3422 / field1110);
			field3659 = -1;
			field594 = -1;
		}
	}

	@ObfuscatedName("wa.a(II)I")
	public static int method1585(int arg0) {
		return arg0 >>> 10;
	}

	@ObfuscatedName("vd.a(ZI)V")
	public static void method1551(int arg0) {
		field2330 = arg0;
		field3659 = -1;
		field594 = -1;
		method1604();
	}

	@ObfuscatedName("k.b(IIIII)V")
	public static void method753(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 > arg3) {
			for (int var4 = arg3; var4 < arg1; var4++) {
				field42[var4][arg2] = arg0;
			}
		} else {
			for (int var5 = arg1; var5 < arg3; var5++) {
				field42[var5][arg2] = arg0;
			}
		}
	}

	@ObfuscatedName("k.a(IIIII)V")
	public static void method745(int arg0, int arg1, int arg2, int arg3) {
		method1534(arg3 - arg2, arg1, arg2 + arg3, field42[arg0]);
		int var4 = 0;
		int var5 = arg2;
		int var6 = -1;
		int var7 = -arg2;
		while (var4 < var5) {
			var6 += 2;
			var7 += var6;
			var4++;
			if (var7 >= 0) {
				var5--;
				var7 -= var5 << 1;
				int[] var8 = field42[var5 + arg0];
				int[] var9 = field42[arg0 - var5];
				int var10 = var4 + arg3;
				int var11 = arg3 - var4;
				method1534(var11, arg1, var10, var8);
				method1534(var11, arg1, var10, var9);
			}
			int var12 = arg3 + var5;
			int var13 = arg3 - var5;
			int[] var14 = field42[arg0 + var4];
			int[] var15 = field42[arg0 - var4];
			method1534(var13, arg1, var12, var14);
			method1534(var13, arg1, var12, var15);
		}
	}

	@ObfuscatedName("k.b(II)Z")
	public static boolean method746(int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@ObfuscatedName("pb.a(JI)Li;")
	public static JagString method1139(long arg0) {
		field4545.setTime(new Date(arg0));
		int var2 = field4545.get(7);
		int var3 = field4545.get(5);
		int var4 = field4545.get(2);
		int var5 = field4545.get(1);
		int var6 = field4545.get(11);
		int var7 = field4545.get(12);
		int var8 = field4545.get(13);
		return JagString.join(new JagString[] { field1673[var2 - 1], field3772, JagString.method1212(var3 / 10), JagString.method1212(var3 % 10), field3135, field658[var4], field3135, JagString.method1212(var5), field4262, JagString.method1212(var6 / 10), JagString.method1212(var6 % 10), field1959, JagString.method1212(var7 / 10), JagString.method1212(var7 % 10), field1959, JagString.method1212(var8 / 10), JagString.method1212(var8 % 10), field82});
	}

	@ObfuscatedName("pb.a(IIIII)V")
	public static void method1137(int arg0, int arg1, int arg2, int arg3) {
		field2330 = ClientBuild.field1988 * arg2 / arg0;
		field3033 = ClientBuild.field760 * arg1 / arg3;
		field594 = -1;
		field3659 = -1;
		method1604();
	}

	@ObfuscatedName("pb.a(ILi;)V")
	public static void method1132(JagString arg0) {
		if (GameShell.signlink.field3597 == null) {
			return;
		}
		try {
			JagString var1 = field4265.method608(GameShell.signlink.field3597);
			JagString var2 = field4516.method608(GameShell.signlink.field3597);
			JagString var3 = JagString.join(new JagString[] { var1, field651, arg0, field1005, var2 });
			JagString var4;
			if (arg0.method604() == 0) {
				var4 = JagString.join(new JagString[] { var3, field920});
			} else {
				var4 = JagString.join(new JagString[] { var3, field1982, method1139(MonotonicTime.currentTime() + 94608000000L), field1767, JagString.method1556(94608000L) });
			}
			JagString.join(new JagString[] {field3237, var4, field591}).method636(GameShell.signlink.field3597);
		} catch (Throwable var5) {
		}
	}

	@ObfuscatedName("pb.b(ILi;)V")
	public static void method1138(JagString arg0) {
		try {
			GameShell.shell.getAppletContext().showDocument(arg0.method632(GameShell.shell.getCodeBase()), "_blank");
		} catch (Exception var1) {
		}
	}
}
