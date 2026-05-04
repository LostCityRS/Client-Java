package deob;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
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
	@ObfuscatedName("ag.b")
	public static final int[] field116 = new int[50];
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
	@ObfuscatedName("tj.l")
	public static final int[] field4066 = new int[25];
	@ObfuscatedName("fb.mb")
	public static final JagString field1103 = JagString.wrap("::rect_debug");
	@ObfuscatedName("ij.N")
	public static final int[] field1789 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	@ObfuscatedName("mc.e")
	public static final JagString field2496 = JagString.wrap("(U0a )2 non)2existant gosub script)2num: ");
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
	@ObfuscatedName("be.f")
	public static final boolean[] field255 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
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
	@ObfuscatedName("ba.n")
	public static final int[] field198 = new int[] { 1, 0, -1, 0 };
	@ObfuscatedName("bc.c")
	public static final int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("bd.l")
	public static final int[][] field247 = new int[5][5000];
	@ObfuscatedName("bd.m")
	public static final int[][] field248 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
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
	@ObfuscatedName("ei.g")
	public static final byte[] field1008 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
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
	@ObfuscatedName("vi.c")
	public static final int[] field4427 = new int[] { 16, 32, 64, 128 };
	@ObfuscatedName("vi.h")
	public static final int field4432 = 2301979;
	@ObfuscatedName("fc.h")
	public static final JagString field1113 = JagString.wrap("");
	@ObfuscatedName("fc.a")
	public static final JagString field1106 = JagString.wrap("compass");
	@ObfuscatedName("fc.o")
	public static final boolean[] field1120 = new boolean[200];
	@ObfuscatedName("qf.Q")
	public static final JagString field3569 = JagString.wrap("Fps:");
	@ObfuscatedName("qf.T")
	public static final JagString field3572 = JagString.wrap("null");
	@ObfuscatedName("qe.i")
	public static final JagString field3563 = JagString.wrap("Clientscript error )2 check log for details");
	@ObfuscatedName("qe.h")
	public static final int[] field3562 = new int[25];
	@ObfuscatedName("nc.m")
	public static final int[] field2726 = new int[50];
	@ObfuscatedName("e.Z")
	public static final LinkList field783 = new LinkList();
	@ObfuscatedName("ff.X")
	public static final JagString field1143 = JagString.wrap("logo");
	@ObfuscatedName("kj.e")
	public static final JagString field2156 = JagString.wrap("scape main");
	@ObfuscatedName("kj.t")
	public static final JagString field2171 = JagString.wrap(")2");
	@ObfuscatedName("af.K")
	public static final JagString field102 = JagString.wrap("sl_stars");
	@ObfuscatedName("af.Y")
	public static final JagString[] field114 = new JagString[1000];
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
	@ObfuscatedName("uh.U")
	public static final JagString field4249 = JagString.wrap("::fps ");
	@ObfuscatedName("bj.qb")
	public static final JagString field344 = JagString.wrap("::errortest");
	@ObfuscatedName("bj.Cb")
	public static final JagString field356 = JagString.wrap("(U0a )2 via: ");
	@ObfuscatedName("bj.zb")
	public static final Calendar field353 = Calendar.getInstance();
	@ObfuscatedName("c.E")
	public static final JagString[] field370 = new JagString[200];
	@ObfuscatedName("pi.V")
	public static final JagString field3337 = JagString.wrap("::noclip");
	@ObfuscatedName("pi.S")
	public static final JagString field3334 = JagString.wrap(":clan:");
	@ObfuscatedName("md.U")
	public static final int[] field2508 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };
	@ObfuscatedName("hc.W")
	public static final JagString field1444 = JagString.wrap("details)3dat");
	@ObfuscatedName("ub.S")
	public static final int[] field4150 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	@ObfuscatedName("hc.Y")
	public static final class141[] field1446 = new class141[50];
	@ObfuscatedName("dj.Rb")
	public static final JagString field751 = JagString.wrap("::autoshadow on");
	@ObfuscatedName("hb.S")
	public static final JagString field1426 = JagString.wrap("null");
	@ObfuscatedName("jf.U")
	public static final JagString field1879 = JagString.wrap("(Y");
	@ObfuscatedName("da.ob")
	public static final LinkList field619 = new LinkList();
	@ObfuscatedName("aa.W")
	public static final JagString field18 = JagString.wrap("<col=ff7000>");
	@ObfuscatedName("aa.Z")
	public static final JagString field21 = JagString.wrap(")1p");
	@ObfuscatedName("ra.eb")
	public static final JagString field3636 = JagString.wrap("<col=ff3000>");
	@ObfuscatedName("ra.R")
	public static final class210 field3623 = new class210();
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
	@ObfuscatedName("d.W")
	public static final JagString field583 = JagString.wrap("::fpsoff");
	@ObfuscatedName("aj.V")
	public static final JagString field156 = JagString.wrap("::clientdrop");
	@ObfuscatedName("fd.W")
	public static final ModelUnlit[] field1127 = new ModelUnlit[4];
	@ObfuscatedName("pd.Q")
	public static final long[] field3203 = new long[100];
	@ObfuscatedName("mh.V")
	public static final int[] field2577 = new int[1000];
	@ObfuscatedName("a.f")
	public static final JagString field6 = JagString.wrap("::autoshadow off");
	@ObfuscatedName("a.g")
	public static final JagString field7 = JagString.wrap("mapfunction");
	@ObfuscatedName("ab.a")
	public static final int field26 = 5063219;
	@ObfuscatedName("ab.i")
	public static final JagString field34 = JagString.wrap("null");
	@ObfuscatedName("ab.o")
	public static final JagString field40 = JagString.wrap("(Z");
	@ObfuscatedName("bf.x")
	public static final JagString field288 = JagString.wrap("Clientscript error in: ");
	@ObfuscatedName("bh.J")
	public static final JagString field316 = JagString.wrap("runes");
	@ObfuscatedName("bi.d")
	public static final JagString field325 = JagString.wrap("overlay)3dat");
	@ObfuscatedName("ca.g")
	public static final LruCache field388 = new LruCache(16);
	@ObfuscatedName("ca.i")
	public static final short[] field390 = new short[] { 30, 58, 29, 45, 37, 16, 1, 50 };
	@ObfuscatedName("cb.b")
	public static final int[] field397 = new int[50];
	@ObfuscatedName("cb.d")
	public static final JagString field399 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("cb.g")
	public static final int[] field402 = new int[32768];
	@ObfuscatedName("cb.i")
	public static final JagString field404 = JagString.wrap("labels)3dat");
	@ObfuscatedName("od.z")
	public static final JagString field3010 = JagString.wrap("(U0a )2 in: ");
	@ObfuscatedName("od.y")
	public static final JagString field3009 = JagString.wrap(":tradereq:");
	@ObfuscatedName("dc.d")
	public static final JagString field665 = JagString.wrap(":clanreq:");
	@ObfuscatedName("dc.h")
	public static final JagString field669 = Text.field668;
	@ObfuscatedName("df.a")
	public static final byte[] field700 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	@ObfuscatedName("ee.i")
	public static final JagString field933 = JagString.wrap("_");
	@ObfuscatedName("eg.u")
	public static final int field939 = 3353893;
	@ObfuscatedName("fh.o")
	public static final class118[] field1171 = new class118[4];
	@ObfuscatedName("gd.e")
	public static final Random field1259 = new Random();
	@ObfuscatedName("ge.L")
	public static final JagString field1325 = JagString.wrap("Mem:");
	@ObfuscatedName("gh.o")
	public static final JagString field1344 = JagString.wrap("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
	@ObfuscatedName("gh.j")
	public static final JagString field1339 = field1344;
	@ObfuscatedName("gh.t")
	public static final LinkList field1349 = new LinkList();
	@ObfuscatedName("gh.v")
	public static final JagString field1351 = JagString.wrap(")1j");
	@ObfuscatedName("gh.z")
	public static final JagString field1355 = Text.field1356;
	@ObfuscatedName("cj.eb")
	public static final JagString field553 = JagString.wrap("<col=40ff00>");
	@ObfuscatedName("cj.cb")
	public static final int[] field551 = new int[] { -1, -1, 1, 1 };
	@ObfuscatedName("ui.E")
	public static final JagString field4251 = JagString.wrap("cross");
	@ObfuscatedName("ui.P")
	public static final JagString field4262 = JagString.wrap(" ");
	@ObfuscatedName("ui.S")
	public static final JagString field4265 = JagString.wrap("cookieprefix");
	@ObfuscatedName("kf.e")
	public static final JagString field2075 = JagString.wrap("mapdots");
	@ObfuscatedName("kf.p")
	public static final long[] field2086 = new long[200];
	@ObfuscatedName("qa.h")
	public static final JagString field3526 = JagString.wrap(" )2> <col=00ffff>");
	@ObfuscatedName("ue.p")
	public static final JagString field4208 = JagString.wrap("overlay2)3dat");
	@ObfuscatedName("je.y")
	public static final int[] field1869 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	@ObfuscatedName("og.t")
	public static final LinkList field3049 = new LinkList();
	@ObfuscatedName("og.T")
	public static final class13[] field3075 = new class13[500];
	@ObfuscatedName("og.U")
	public static final JagString field3076 = JagString.wrap(")3runescape)3com)4l=");
	@ObfuscatedName("og.R")
	public static final int field3073 = 0;
	@ObfuscatedName("wc.L")
	public static final int[] field4479 = new int[128];
	@ObfuscatedName("ie.p")
	public static final JagString field1750 = JagString.wrap("rect_debug=");
	@ObfuscatedName("ge.u")
	public static final JagString field1308 = Text.field1320;
	@ObfuscatedName("ga.o")
	public static final class156 field1236 = new class156(0, 0);
	@ObfuscatedName("ga.q")
	public static final JagString field1238 = JagString.wrap(" (X");
	@ObfuscatedName("ec.P")
	public static final int[] field904 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	@ObfuscatedName("fj.j")
	public static final LinkList field1196 = new LinkList();
	@ObfuscatedName("na.K")
	public static final int[] field2642 = new int[32];
	@ObfuscatedName("oa.A")
	public static final GZip gzip = new GZip();
	@ObfuscatedName("ma.R")
	public static final JagString field2462 = JagString.wrap("<col=00ff80>");
	@ObfuscatedName("ta.X")
	public static final int[] field3949 = new int[] { 1, 2, 4, 8 };
	@ObfuscatedName("lh.V")
	public static final JagString field2400 = JagString.wrap(":assist:");
	@ObfuscatedName("vc.eb")
	public static final LinkList field4359 = new LinkList();
	@ObfuscatedName("vc.ib")
	public static final JagString field4363 = Text.field4361;
	@ObfuscatedName("da.hb")
	public static final JagString field612 = Text.field611;
	@ObfuscatedName("da.kb")
	public static final boolean field615 = false;
	@ObfuscatedName("kg.R")
	public static final JagString field2089 = JagString.wrap("titlebutton");
	@ObfuscatedName("ph.ab")
	public static final JagString[] field3330 = new JagString[1000];
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
	@ObfuscatedName("jc.H")
	public static final int[] field1832 = new int[32];
	@ObfuscatedName("jc.M")
	public static final JagString field1837 = Text.field1839;
	@ObfuscatedName("eh.d")
	public static final JagString field970 = JagString.wrap("Apr");
	@ObfuscatedName("eh.k")
	public static final JagString field977 = JagString.wrap("Jun");
	@ObfuscatedName("eh.l")
	public static final JagString field978 = JagString.wrap("Aug");
	@ObfuscatedName("eh.m")
	public static final JagString field979 = JagString.wrap(")1");
	@ObfuscatedName("eh.n")
	public static final JagString field980 = JagString.wrap("Sep");
	@ObfuscatedName("eh.o")
	public static final JagString field981 = JagString.wrap("Mar");
	@ObfuscatedName("eh.s")
	public static final JagString field985 = JagString.wrap("Dec");
	@ObfuscatedName("eh.u")
	public static final JagString field987 = JagString.wrap("May");
	@ObfuscatedName("eh.v")
	public static final JagString field988 = JagString.wrap("Jan");
	@ObfuscatedName("eh.w")
	public static final JagString field989 = JagString.wrap("Oct");
	@ObfuscatedName("eh.A")
	public static final JagString field993 = JagString.wrap("Fps:");
	@ObfuscatedName("eh.y")
	public static final JagString field991 = JagString.wrap("Nov");
	@ObfuscatedName("eh.C")
	public static final JagString field995 = JagString.wrap("Feb");
	@ObfuscatedName("eh.D")
	public static final JagString field996 = JagString.wrap("Jul");
	@ObfuscatedName("eh.z")
	public static final JagString[] field992 = new JagString[] { field988, field995, field981, field970, field987, field977, field996, field978, field980, field989, field991, field985 };
	@ObfuscatedName("eh.I")
	public static final int[] field1001 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
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
	@ObfuscatedName("vh.N")
	public static final JagFX[] field4417 = new JagFX[50];
	@ObfuscatedName("pe.t")
	public static final LruCache field3228 = new LruCache(64);
	@ObfuscatedName("pe.C")
	public static final JagString field3237 = JagString.wrap("document)3cookie=(R");
	@ObfuscatedName("pe.D")
	public static final JagString[] field3238 = new JagString[200];
	@ObfuscatedName("pe.F")
	public static final int[] field3240 = new int[] { 1, -1, -1, 1 };
	@ObfuscatedName("pe.J")
	public static final JagString field3244 = JagString.wrap("<col=ff0000>");
	@ObfuscatedName("pe.K")
	public static final int[] field3245 = new int[2000];
	@ObfuscatedName("ih.d")
	public static final int[] field1762 = new int[5];
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
	@ObfuscatedName("jj.l")
	public static final int[] field1944 = new int[1000];
	@ObfuscatedName("jj.x")
	public static final class24 field1956 = new class24(4);
	@ObfuscatedName("jj.y")
	public static final JagString field1957 = JagString.wrap("b12_full");
	@ObfuscatedName("ud.l")
	public static final JagString field4190 = JagString.wrap("<br>(X100(U(Y");
	@ObfuscatedName("v.F")
	public static final int[] field4285 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	@ObfuscatedName("pg.Db")
	public static final JagString field3306 = JagString.wrap(": ");
	@ObfuscatedName("pg.D")
	public static final JagString field3254 = JagString.wrap("loc)3dat");
	@ObfuscatedName("oi.l")
	public static final JagString field3110 = JagString.wrap("Service unavailable)3");
	@ObfuscatedName("oi.n")
	public static final JagString field3112 = field3110;
	@ObfuscatedName("sd.a")
	public static final int[] field3812 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	@ObfuscatedName("sd.c")
	public static final JagString field3814 = JagString.wrap("0(U");
	@ObfuscatedName("sd.f")
	public static final JagString field3817 = Text.field3828;
	@ObfuscatedName("rf.Kb")
	public static final int[] field3685 = new int[128];
	@ObfuscatedName("wi.o")
	public static final Calendar field4545 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	@ObfuscatedName("wi.q")
	public static final JagString field4547 = JagString.wrap("::fpson");
	@ObfuscatedName("wi.r")
	public static final JagString field4548 = JagString.wrap(" )2> ");
	@ObfuscatedName("oe.i")
	public static final JagString field3025 = JagString.wrap(":duelstake:");
	@ObfuscatedName("sc.bb")
	public static final LinkList field3810 = new LinkList();
	@ObfuscatedName("sc.D")
	public static final JagString field3787 = JagString.wrap(" ");
	@ObfuscatedName("sc.M")
	public static final JagString field3795 = JagString.wrap("p11_full");
	@ObfuscatedName("ib.E")
	public static final int[] field1710 = new int[99];
	@ObfuscatedName("wh.J")
	public static final JagString field4516 = JagString.wrap("cookiehost");
	@ObfuscatedName("wh.D")
	public static final boolean[] field4511 = new boolean[112];
	@ObfuscatedName("tc.D")
	public static final JagString field3983 = JagString.wrap("http:)4)4www)3runescape)3com)4l=");
	@ObfuscatedName("va.z")
	public static final int field4316 = 7759444;
	@ObfuscatedName("mg.Cb")
	public static final int field2563 = 50;
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
	@ObfuscatedName("oh.p")
	public static final int[] field3092 = new int[200];
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
	@ObfuscatedName("sg.B")
	public static final boolean[] field3875 = new boolean[8];
	@ObfuscatedName("se.c")
	public static final int[] field3834 = new int[5];
	@ObfuscatedName("jh.a")
	public static final JagString field1921 = JagString.wrap("headicons_prayer");
	@ObfuscatedName("jh.h")
	public static final JagString field1928 = JagString.wrap("l");
	@ObfuscatedName("jh.j")
	public static final JagString field1930 = JagString.wrap("::qa_op_test");
	@ObfuscatedName("lj.d")
	public static final byte[] field2431;
	@ObfuscatedName("lj.i")
	public static final JagString[] field2436 = new JagString[8];
	@ObfuscatedName("lj.n")
	public static final PlayerModel field2441 = new PlayerModel();
	@ObfuscatedName("kj.p")
	public static final int[] field2167 = new int[2000];
	@ObfuscatedName("nf.Mb")
	public static final JagString field2828 = JagString.wrap(" <col=00ff80>");
	@ObfuscatedName("t.m")
	public static final int field3925 = 50;
	@ObfuscatedName("t.y")
	public static final int[] field3937 = new int[field3925];
	@ObfuscatedName("t.B")
	public static final int[] field3940 = new int[field3925];
	@ObfuscatedName("t.z")
	public static final int[] field3938 = new int[field3925];
	@ObfuscatedName("t.u")
	public static final JagString[] field3933 = new JagString[field3925];
	@ObfuscatedName("t.t")
	public static final int[] field3932 = new int[field3925];
	@ObfuscatedName("t.s")
	public static final int[] field3931 = new int[field3925];
	@ObfuscatedName("t.q")
	public static final int[] field3929 = new int[field3925];
	@ObfuscatedName("t.n")
	public static final int[] field3926 = new int[field3925];
	@ObfuscatedName("t.o")
	public static final JagString field3927 = JagString.wrap(":chalreq:");
	@ObfuscatedName("sf.c")
	public static final JagString field3843 = JagString.wrap("<col=ffff00>*V");
	@ObfuscatedName("ea.lb")
	public static final int[] field845 = new int[200];
	@ObfuscatedName("hi.h")
	public static final JagString field1556 = JagString.wrap(":assistreq:");
	@ObfuscatedName("ka.a")
	public static final int[] field2005 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	@ObfuscatedName("ka.c")
	public static final JagString field2007 = JagString.wrap("k");
	@ObfuscatedName("ka.l")
	public static final int[] field2016 = new int[50];
	@ObfuscatedName("ha.w")
	public static final JagString field1411 = JagString.wrap("");
	@ObfuscatedName("ha.F")
	public static final int[] field1420 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };
	@ObfuscatedName("ha.G")
	public static final JagString field1421 = JagString.wrap("::gc");
	@ObfuscatedName("nh.j")
	public static final JagString field2918 = JagString.wrap("Cabbage");
	@ObfuscatedName("hd.B")
	public static final JagString field1468 = JagString.wrap("");
	@ObfuscatedName("id.d")
	public static final int[] field1720 = new int[4096];
	@ObfuscatedName("id.o")
	public static final int[] field1731 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
	@ObfuscatedName("id.q")
	public static final JagString field1733 = JagString.wrap("title_mute");
	@ObfuscatedName("ug.o")
	public static final int[][] field4232 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	@ObfuscatedName("me.w")
	public static final JagString field2526 = JagString.wrap("<col=c0ff00>");
	@ObfuscatedName("me.z")
	public static final JagString field2529 = JagString.wrap("<col=ff9040>");
	@ObfuscatedName("bb.c")
	public static int field209 = -1;
	@ObfuscatedName("ej.i")
	public static int field1022 = 0;
	@ObfuscatedName("ej.t")
	public static int field1033 = -1;
	@ObfuscatedName("ej.B")
	public static int field1041 = 0;
	@ObfuscatedName("ch.a")
	public static HashTable field495 = new HashTable(512);
	@ObfuscatedName("ch.k")
	public static SoftwarePix32[] field505;
	@ObfuscatedName("pa.b")
	public static int field3136;
	@ObfuscatedName("ce.S")
	public static JagString field464 = null;
	@ObfuscatedName("ag.e")
	public static int field119 = -1;
	@ObfuscatedName("ag.g")
	public static int field121 = 0;
	@ObfuscatedName("ve.Z")
	public static int field4383;
	@ObfuscatedName("s.cb")
	public static class75 field3762;
	@ObfuscatedName("vg.m")
	public static class75 field4397;
	@ObfuscatedName("cd.c")
	public static int[] field453;
	@ObfuscatedName("cd.d")
	public static int field454;
	@ObfuscatedName("cd.j")
	public static int field460;
	@ObfuscatedName("cd.k")
	public static int[] field461 = new int[] { 0, 1, 2, 3 };
	@ObfuscatedName("we.y")
	public static class61 field4488;
	@ObfuscatedName("uj.j")
	public static int field4276 = 0;
	@ObfuscatedName("pc.f")
	public static int field3192 = -1;
	@ObfuscatedName("pc.m")
	public static class75 field3199;
	@ObfuscatedName("di.gb")
	public static int field738;
	@ObfuscatedName("di.hb")
	public static boolean field739 = false;
	@ObfuscatedName("di.V")
	public static int field727;
	@ObfuscatedName("tj.a")
	public static int field4055;
	@ObfuscatedName("fb.lb")
	public static int field1102;
	@ObfuscatedName("mb.U")
	public static int field2484 = 0;
	@ObfuscatedName("mb.Z")
	public static int field2489 = 0;
	@ObfuscatedName("ij.H")
	public static int field1783 = -1;
	@ObfuscatedName("ij.K")
	public static byte[][][] field1786;
	@ObfuscatedName("fj.f")
	public static int field1192 = 0;
	@ObfuscatedName("fj.n")
	public static int field1200;
	@ObfuscatedName("be.s")
	public static int[][] field268;
	@ObfuscatedName("wg.u")
	public static int field4506;
	@ObfuscatedName("wg.y")
	public static int[] field4510;
	@ObfuscatedName("ua.p")
	public static int field4146 = 0;
	@ObfuscatedName("de.K")
	public static int field693;
	@ObfuscatedName("de.B")
	public static Js5 field684;
	@ObfuscatedName("b.h")
	public static class75 field175;
	@ObfuscatedName("b.p")
	public static int field183 = 100;
	@ObfuscatedName("ba.h")
	public static int field192 = 0;
	@ObfuscatedName("ba.s")
	public static int field203 = 0;
	@ObfuscatedName("bc.e")
	public static class217 field226;
	@ObfuscatedName("bc.g")
	public static Font field228;
	@ObfuscatedName("bd.d")
	public static int field239;
	@ObfuscatedName("bd.n")
	public static int field249;
	@ObfuscatedName("n.h")
	public static int field2620 = 0;
	@ObfuscatedName("ei.h")
	public static int[] field1009;
	@ObfuscatedName("ei.k")
	public static int field1012 = 0;
	@ObfuscatedName("i.N")
	public static int field1638 = 0;
	@ObfuscatedName("i.U")
	public static int field1644 = 2;
	@ObfuscatedName("i.L")
	public static int field1636;
	@ObfuscatedName("g.d")
	public static int field1206 = 0;
	@ObfuscatedName("g.e")
	public static int field1207 = 0;
	@ObfuscatedName("g.h")
	public static short[] field1210;
	@ObfuscatedName("cf.e")
	public static int field481 = 1;
	@ObfuscatedName("cf.f")
	public static int[] field482;
	@ObfuscatedName("vi.a")
	public static Pix32[] field4425;
	@ObfuscatedName("fc.e")
	public static double field1110;
	@ObfuscatedName("qe.j")
	public static IfType[] field3564;
	@ObfuscatedName("nc.e")
	public static Pix32[] field2718;
	@ObfuscatedName("e.fb")
	public static int field789;
	@ObfuscatedName("e.Q")
	public static byte[][] field774;
	@ObfuscatedName("ff.eb")
	public static int field1150 = 0;
	@ObfuscatedName("af.S")
	public static short[] field108 = new short[256];
	@ObfuscatedName("af.U")
	public static int field110 = 0;
	@ObfuscatedName("af.P")
	public static Pix8[] field106;
	@ObfuscatedName("af.N")
	public static byte[][][] field105;
	@ObfuscatedName("ja.b")
	public static int field1803;
	@ObfuscatedName("ja.c")
	public static long field1804 = 0L;
	@ObfuscatedName("kh.D")
	public static short[] field2108;
	@ObfuscatedName("l.Z")
	public static short[] field2192 = new short[256];
	@ObfuscatedName("l.cb")
	public static int field2195 = -1;
	@ObfuscatedName("db.D")
	public static IfType field635;
	@ObfuscatedName("uh.S")
	public static int field4247 = -1;
	@ObfuscatedName("uh.P")
	public static int field4244 = 0;
	@ObfuscatedName("bj.Bb")
	public static boolean field355 = true;
	@ObfuscatedName("bj.xb")
	public static int[] field351;
	@ObfuscatedName("pi.R")
	public static int field3333 = 0;
	@ObfuscatedName("md.ab")
	public static IfType field2514;
	@ObfuscatedName("md.Y")
	public static int field2512;
	@ObfuscatedName("dj.ac")
	public static int field760;
	@ObfuscatedName("dj.mc")
	public static int field772;
	@ObfuscatedName("dj.Gb")
	public static int[] field740;
	@ObfuscatedName("hb.bb")
	public static int field1435;
	@ObfuscatedName("jf.kb")
	public static int field1895 = 0;
	@ObfuscatedName("jf.lb")
	public static int field1896 = -1;
	@ObfuscatedName("da.X")
	public static long field602 = 0L;
	@ObfuscatedName("da.S")
	public static Pix32[] field597;
	@ObfuscatedName("aa.db")
	public static int field25 = -1;
	@ObfuscatedName("hh.R")
	public static int field1531 = 0;
	@ObfuscatedName("qj.U")
	public static int field3604 = 0;
	@ObfuscatedName("qj.V")
	public static int[] field3605;
	@ObfuscatedName("kd.V")
	public static Pix32[] field2041;
	@ObfuscatedName("ra.gb")
	public static int field3638 = 0;
	@ObfuscatedName("vc.cb")
	public static int field4357 = 2;
	@ObfuscatedName("lh.db")
	public static int field2408 = 0;
	@ObfuscatedName("lh.Q")
	public static HashTable field2395 = new HashTable(8);
	@ObfuscatedName("lh.X")
	public static int[] field2402;
	@ObfuscatedName("d.ab")
	public static Pix8[] field587;
	@ObfuscatedName("d.hb")
	public static int field594 = -1;
	@ObfuscatedName("d.T")
	public static short field580 = 256;
	@ObfuscatedName("aj.fb")
	public static boolean field166 = false;
	@ObfuscatedName("pd.jb")
	public static byte[][] field3221;
	@ObfuscatedName("pd.S")
	public static class75 field3205;
	@ObfuscatedName("td.bb")
	public static int field4004 = 0;
	@ObfuscatedName("ta.ab")
	public static int field3952 = 0;
	@ObfuscatedName("ta.Z")
	public static byte[][][] field3951;
	@ObfuscatedName("ma.bb")
	public static int field2472;
	@ObfuscatedName("a.i")
	public static boolean field9 = false;
	@ObfuscatedName("a.j")
	public static long field10 = 0L;
	@ObfuscatedName("ab.e")
	public static PixfontGeneric field30;
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
	@ObfuscatedName("bf.P")
	public static int field305 = 0;
	@ObfuscatedName("bh.M")
	public static JagString field319 = null;
	@ObfuscatedName("od.w")
	public static int field3007;
	@ObfuscatedName("dc.e")
	public static int field666;
	@ObfuscatedName("ec.J")
	public static int field898 = 0;
	@ObfuscatedName("ec.F")
	public static int field894 = 0;
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
	@ObfuscatedName("fh.q")
	public static int field1173 = 128;
	@ObfuscatedName("fi.v")
	public static Js5 field1176;
	@ObfuscatedName("fi.w")
	public static IfType field1177;
	@ObfuscatedName("fi.F")
	public static int field1185 = 0;
	@ObfuscatedName("gd.j")
	public static int field1264;
	@ObfuscatedName("gd.v")
	public static int field1276;
	@ObfuscatedName("ge.v")
	public static int field1309;
	@ObfuscatedName("ge.C")
	public static int field1316 = 0;
	@ObfuscatedName("ge.O")
	public static int field1328 = 0;
	@ObfuscatedName("kc.b")
	public static class214 field2033;
	@ObfuscatedName("rd.E")
	public static int field3659 = -1;
	@ObfuscatedName("ui.D")
	public static class75 field4250;
	@ObfuscatedName("ui.K")
	public static Pix32[] field4257;
	@ObfuscatedName("kf.h")
	public static int field2078 = 0;
	@ObfuscatedName("kf.n")
	public static int field2084;
	@ObfuscatedName("li.R")
	public static IfType field2426;
	@ObfuscatedName("li.E")
	public static class3 field2414;
	@ObfuscatedName("qa.a")
	public static long field3519 = 0L;
	@ObfuscatedName("qa.j")
	public static int field3528 = 3;
	@ObfuscatedName("qa.n")
	public static boolean field3532 = false;
	@ObfuscatedName("uc.i")
	public static short field4175 = 256;
	@ObfuscatedName("og.K")
	public static int field3066;
	@ObfuscatedName("ke.K")
	public static int field2061 = 0;
	@ObfuscatedName("wc.J")
	public static int[] field4477;
	@ObfuscatedName("na.L")
	public static Image field2643;
	@ObfuscatedName("oa.F")
	public static JagString[] field2963;
	@ObfuscatedName("ob.f")
	public static int field2969 = 0;
	@ObfuscatedName("ob.p")
	public static int[][][] field2979;
	@ObfuscatedName("ob.q")
	public static boolean field2980 = true;
	@ObfuscatedName("ob.s")
	public static Pix32[] field2982;
	@ObfuscatedName("jc.Q")
	public static int field1841 = 0;
	@ObfuscatedName("jc.G")
	public static int[] field1831;
	@ObfuscatedName("eh.a")
	public static IfType field967 = null;
	@ObfuscatedName("eh.E")
	public static boolean field997 = false;
	@ObfuscatedName("oc.t")
	public static int field2991 = 0;
	@ObfuscatedName("oc.v")
	public static int field2993 = 0;
	@ObfuscatedName("vh.R")
	public static int field4421;
	@ObfuscatedName("pe.H")
	public static int field3242;
	@ObfuscatedName("h.F")
	public static int field1384 = 0;
	@ObfuscatedName("h.P")
	public static int field1394 = 0;
	@ObfuscatedName("nb.bb")
	public static int[] field2713;
	@ObfuscatedName("nb.V")
	public static int field2707 = 0;
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
	@ObfuscatedName("oi.a")
	public static int field3099 = 0;
	@ObfuscatedName("oi.g")
	public static int field3105 = 0;
	@ObfuscatedName("oi.m")
	public static int field3111 = 1;
	@ObfuscatedName("sd.o")
	public static Pix32 field3826;
	@ObfuscatedName("ne.a")
	public static JagString field2752 = null;
	@ObfuscatedName("ne.n")
	public static int field2765 = 0;
	@ObfuscatedName("ne.o")
	public static int field2766;
	@ObfuscatedName("wi.e")
	public static int field4535 = 0;
	@ObfuscatedName("oe.c")
	public static int field3019;
	@ObfuscatedName("oe.q")
	public static int field3033;
	@ObfuscatedName("sc.ab")
	public static int field3809;
	@ObfuscatedName("sc.F")
	public static int field3788 = 0;
	@ObfuscatedName("ib.C")
	public static int field1708 = 0;
	@ObfuscatedName("ib.A")
	public static IfType field1706;
	@ObfuscatedName("wh.T")
	public static Pix32[] field4525;
	@ObfuscatedName("nj.j")
	public static int field2931;
	@ObfuscatedName("nj.k")
	public static int field2932 = -1;
	@ObfuscatedName("tc.K")
	public static int field3990 = 0;
	@ObfuscatedName("va.w")
	public static HashTable field4313;
	@ObfuscatedName("va.C")
	public static int field4318 = 0;
	@ObfuscatedName("va.x")
	public static int field4314;
	@ObfuscatedName("rg.F")
	public static int field3700 = 0;
	@ObfuscatedName("vb.H")
	public static class75 field4325;
	@ObfuscatedName("nd.c")
	public static int field2729 = 0;
	@ObfuscatedName("nd.e")
	public static int[] field2731;
	@ObfuscatedName("nd.l")
	public static class161 field2738;
	@ObfuscatedName("nd.p")
	public static int field2742;
	@ObfuscatedName("oh.g")
	public static short field3083 = 320;
	@ObfuscatedName("oh.q")
	public static int field3093;
	@ObfuscatedName("ia.z")
	public static int[] field1686 = new int[] { 1, 1, 1, 1 };
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
	@ObfuscatedName("tg.i")
	public static double field4041 = -1.0D;
	@ObfuscatedName("sg.x")
	public static IfType field3871;
	@ObfuscatedName("eb.U")
	public static Pix32 field887;
	@ObfuscatedName("se.d")
	public static JagString field3835 = null;
	@ObfuscatedName("se.g")
	public static int field3838;
	@ObfuscatedName("se.i")
	public static FontMetrics field3840;
	@ObfuscatedName("jh.f")
	public static Js5 field1926;
	@ObfuscatedName("lj.a")
	public static Pix32[] field2428;
	@ObfuscatedName("lj.o")
	public static int field2442 = 1;
	@ObfuscatedName("ki.a")
	public static int field2131 = 0;
	@ObfuscatedName("ki.q")
	public static class75 field2147;
	@ObfuscatedName("kj.u")
	public static int field2172 = 127;
	@ObfuscatedName("kj.D")
	public static int field2181;
	@ObfuscatedName("sf.e")
	public static class70[] field3845;
	@ObfuscatedName("ea.ob")
	public static int field848;
	@ObfuscatedName("ea.zb")
	public static int field859 = 0;
	@ObfuscatedName("eb.W")
	public static int field889;
	@ObfuscatedName("hi.a")
	public static int field1549;
	@ObfuscatedName("ue.f")
	public static int field4198 = 0;
	@ObfuscatedName("ue.g")
	public static int field4199 = 0;
	@ObfuscatedName("ka.e")
	public static int field2009 = -1;
	@ObfuscatedName("ka.f")
	public static Pix32 field2010;
	@ObfuscatedName("ha.B")
	public static class52[][][] field1416;
	@ObfuscatedName("nh.b")
	public static int field2910;
	@ObfuscatedName("nh.d")
	public static int field2912 = -1;
	@ObfuscatedName("nh.g")
	public static double field2915;
	@ObfuscatedName("nh.l")
	public static int[] field2920;
	@ObfuscatedName("hd.A")
	public static int field1467 = 0;
	@ObfuscatedName("id.r")
	public static int[] field1734;
	@ObfuscatedName("ug.a")
	public static int[] field4218;
	@ObfuscatedName("ug.b")
	public static JagString field4219 = null;
	@ObfuscatedName("me.B")
	public static int field2531 = 2;
	@ObfuscatedName("me.x")
	public static short field2527 = 1;
	@ObfuscatedName("kh.W")
	public static byte[][][] field2126;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field1832[var1] = var0 - 1;
			var0 += var0;
		}
	}

	static {
		int var0 = 0;
		for (int var1 = 0; var1 < 99; var1++) {
			int var2 = var1 + 1;
			int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
			var0 += var3;
			field1710[var1] = var0 / 4;
		}
	}

	static {
		int var0 = 0;
		field2431 = new byte[32896];
		for (int var1 = 0; var1 < 256; var1++) {
			for (int var2 = 0; var2 <= var1; var2++) {
				field2431[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F)));
			}
		}
	}

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field1720[var0] = method394(var0);
		}
	}

	@ObfuscatedName("bb.a(BLtg;)V")
	public static void method69(class214 arg0) {
		field2033 = arg0;
	}

	@ObfuscatedName("ej.b(II)I")
	public static int bitsRequired(int arg0) {
		int var1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			var1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			var1 += 8;
		}
		if (arg0 >= 16) {
			var1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			var1 += 2;
		}
		if (arg0 >= 1) {
			var1++;
			arg0 >>>= 0x1;
		}
		return var1 + arg0;
	}

	@ObfuscatedName("rc.a(Lbj;IIBIIZ)V")
	public static void method1312(Js5Loader arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
		long var6 = (long) (arg1 + (arg2 << 16));
		Js5NetRequest var8 = (Js5NetRequest) Js5Net.field4465.method1049(var6);
		if (var8 != null) {
			return;
		}
		Js5NetRequest var9 = (Js5NetRequest) Js5Net.field2922.method1049(var6);
		if (var9 != null) {
			return;
		}
		Js5NetRequest var10 = (Js5NetRequest) Js5Net.field3907.method1049(var6);
		if (var10 == null) {
			if (!arg5) {
				Js5NetRequest var11 = (Js5NetRequest) Js5Net.field1951.method1049(var6);
				if (var11 != null) {
					return;
				}
			}
			Js5NetRequest var12 = new Js5NetRequest();
			var12.field1782 = arg3;
			var12.field1780 = arg4;
			var12.field1787 = arg0;
			if (arg5) {
				Js5Net.field4465.put(var6, var12);
				Js5Net.field3943++;
			} else {
				Js5Net.field2559.method1387(var12);
				Js5Net.field3907.put(var6, var12);
				Js5Net.field4157++;
			}
		} else if (arg5) {
			var10.method907();
			Js5Net.field4465.put(var6, var10);
			Js5Net.field4157--;
			Js5Net.field3943++;
		}
	}

	@ObfuscatedName("pa.a(BLi;)Z")
	public static boolean method1130(JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (int var1 = 0; var1 < client.field1221; var1++) {
			if (arg0.method624(client.field2741[var1])) {
				return true;
			}
		}
		return false;
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

	@ObfuscatedName("ve.a(IJ)Li;")
	public static JagString method1556(long arg0) {
		return class240.method1586(arg0);
	}

	@ObfuscatedName("m.a(IB)I")
	public static int method883(int arg0) {
		return arg0 == 16711935 ? -1 : method1559(arg0);
	}

	@ObfuscatedName("m.a(B)I")
	public static int method885() {
		int var0 = 3;
		if (client.field3934 < 310) {
			int var1 = client.field1428 >> 7;
			int var2 = client.field3608 >> 7;
			int var3 = client.localPlayer.field4136 >> 7;
			if ((ClientBuild.field2098[client.field2907][var1][var2] & 0x4) != 0) {
				var0 = client.field2907;
			}
			int var4;
			if (var1 < var3) {
				var4 = var3 - var1;
			} else {
				var4 = var1 - var3;
			}
			int var5 = client.localPlayer.field4121 >> 7;
			int var6;
			if (var5 > var2) {
				var6 = var5 - var2;
			} else {
				var6 = var2 - var5;
			}
			if (var6 >= var4) {
				int var7 = var4 * 65536 / var6;
				int var8 = 32768;
				while (var5 != var2) {
					if (var5 > var2) {
						var2++;
					} else if (var2 > var5) {
						var2--;
					}
					var8 += var7;
					if ((ClientBuild.field2098[client.field2907][var1][var2] & 0x4) != 0) {
						var0 = client.field2907;
					}
					if (var8 >= 65536) {
						var8 -= 65536;
						if (var3 > var1) {
							var1++;
						} else if (var3 < var1) {
							var1--;
						}
						if ((ClientBuild.field2098[client.field2907][var1][var2] & 0x4) != 0) {
							var0 = client.field2907;
						}
					}
				}
			} else {
				int var9 = var6 * 65536 / var4;
				int var10 = 32768;
				while (var1 != var3) {
					if (var1 < var3) {
						var1++;
					} else if (var1 > var3) {
						var1--;
					}
					var10 += var9;
					if ((ClientBuild.field2098[client.field2907][var1][var2] & 0x4) != 0) {
						var0 = client.field2907;
					}
					if (var10 >= 65536) {
						if (var2 < var5) {
							var2++;
						} else if (var2 > var5) {
							var2--;
						}
						if ((ClientBuild.field2098[client.field2907][var1][var2] & 0x4) != 0) {
							var0 = client.field2907;
						}
						var10 -= 65536;
					}
				}
			}
		}
		if ((ClientBuild.field2098[client.field2907][client.localPlayer.field4136 >> 7][client.localPlayer.field4121 >> 7] & 0x4) != 0) {
			var0 = client.field2907;
		}
		return var0;
	}

	@ObfuscatedName("vg.a(IIIIIB)V")
	public static void method1565(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 == arg0) {
			method1532(arg3, arg0, arg2, arg1);
		} else if (arg3 - arg0 >= field1207 && field183 >= arg0 + arg3 && arg2 - arg4 >= field919 && field279 >= arg4 + arg2) {
			class134.method892(arg3, arg0, arg4, arg2, arg1);
		} else {
			method1438(arg3, arg4, arg2, arg1, arg0);
		}
	}

	@ObfuscatedName("cd.a(III)V")
	public static void method168(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field948 = null;
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

	@ObfuscatedName("uj.a(III)I")
	public static int method1523(int arg0, int arg1) {
		long var2 = (long) (arg1 + (arg0 << 16));
		return Js5Net.field990 != null && Js5Net.field990.key == var2 ? Js5Net.field2908.pos * 99 / (Js5Net.field2908.data.length - Js5Net.field990.field1782) + 1 : 0;
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

	@ObfuscatedName("tj.a(III)I")
	public static int method1470(int arg0, int arg1) {
		int var2 = method292(arg1 + 91923, 4, arg0 + 45365) + (method292(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (method292(arg1, 1, arg0) + -128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
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

	@ObfuscatedName("eh.a(IIIIIII)V")
	public static void method391(int arg0, int arg1, int arg2, int arg3) {
		class105.field1918 = 0;
		for (int var4 = -1; var4 < field1041 + client.field1027; var4++) {
			class218 var5;
			if (var4 == -1) {
				var5 = client.localPlayer;
			} else if (var4 >= client.field1027) {
				var5 = client.field4223[field402[var4 - client.field1027]];
			} else {
				var5 = client.field4491[client.field3428[var4]];
			}
			if (var5 != null && var5.method287()) {
				if (var5 instanceof class191) {
					NpcType var6 = ((class191) var5).field3682;
					if (var6.field2327 != null) {
						var6 = var6.method862();
					}
					if (var6 == null) {
						continue;
					}
				}
				if (var4 >= client.field1027) {
					NpcType var12 = ((class191) var5).field3682;
					if (var12.field2327 != null) {
						var12 = var12.method862();
					}
					if (var12.field2326 >= 0 && field2428.length > var12.field2326) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (client.field401 > -1) {
							field2428[var12.field2326].method1155(client.field401 + arg0 - 12, client.field541 + -30 + arg1);
						}
					}
					class118[] var13 = field1171;
					for (int var14 = 0; var14 < var13.length; var14++) {
						class118 var15 = var13[var14];
						if (var15 != null && var15.field2139 == 1 && var15.field2146 == field402[var4 - client.field1027] && client.field2113 % 20 < 10) {
							method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
							if (client.field401 > -1) {
								StructType.field3543[var15.field2137].method1155(client.field401 + arg0 - 12, client.field541 + arg1 - 28);
							}
						}
					}
				} else {
					int var7 = 30;
					ClientPlayer var8 = (ClientPlayer) var5;
					if (var8.field756 != -1 || var8.field750 != -1) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
						if (client.field401 > -1) {
							if (var8.field756 != -1) {
								field4425[var8.field756].method1155(client.field401 + arg0 - 12, client.field541 + -30 + arg1);
								var7 += 25;
							}
							if (var8.field750 != -1) {
								field2428[var8.field750].method1155(arg0 + client.field401 - 12, arg1 - -client.field541 + -var7);
								var7 += 25;
							}
						}
					}
					if (var4 >= 0) {
						class118[] var9 = field1171;
						for (int var10 = 0; var10 < var9.length; var10++) {
							class118 var11 = var9[var10];
							if (var11 != null && var11.field2139 == 10 && client.field3428[var4] == var11.field2146) {
								method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
								if (client.field401 > -1) {
									StructType.field3543[var11.field2137].method1155(arg0 + client.field401 - 12, arg1 - (-client.field541 + var7));
								}
							}
						}
					}
				}
				if (var5.field4071 != null && (client.field1027 <= var4 || field1206 == 0 || field1206 == 3 || field1206 == 1 && ScriptRunner.method901(((ClientPlayer) var5).field766))) {
					method1027(arg3 >> 1, arg2 >> 1, var5.method1475(), var5);
					if (client.field401 > -1 && field3925 > class105.field1918) {
						field3931[class105.field1918] = client.field1011.method158(var5.field4071) / 2;
						field3929[class105.field1918] = client.field1011.ascent;
						field3938[class105.field1918] = client.field401;
						field3940[class105.field1918] = client.field541;
						field3937[class105.field1918] = var5.field4083;
						field3932[class105.field1918] = var5.field4138;
						field3926[class105.field1918] = var5.field4112;
						field3933[class105.field1918] = var5.field4071;
						class105.field1918++;
					}
				}
				if (var5.field4118 > client.field2113) {
					method1027(arg3 >> 1, arg2 >> 1, var5.method1475() + 15, var5);
					if (client.field401 > -1) {
						Pix2D.method478(arg0 + client.field401 - 15, client.field541 + -3 + arg1, var5.field4109, 5, 65280);
						Pix2D.method478(var5.field4109 + arg0 + client.field401 - 15, arg1 + -3 + client.field541, 30 - var5.field4109, 5, 16711680);
					}
				}
				for (int var16 = 0; var16 < 4; var16++) {
					if (client.field2113 < var5.field4073[var16]) {
						method1027(arg3 >> 1, arg2 >> 1, var5.method1475() / 2, var5);
						if (client.field401 > -1) {
							if (var16 == 1) {
								client.field541 -= 20;
							}
							if (var16 == 2) {
								client.field541 -= 10;
								client.field401 -= 15;
							}
							if (var16 == 3) {
								client.field541 -= 10;
								client.field401 += 15;
							}
							field2718[var5.field4078[var16]].method1155(arg0 + client.field401 - 12, arg1 + -12 + client.field541);
							client.field917.method141(method1212(var5.field4131[var16]), arg0 + client.field401 - 1, client.field541 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (int var17 = 0; var17 < class105.field1918; var17++) {
			int var18 = field3938[var17];
			int var19 = field3940[var17];
			int var20 = field3931[var17];
			boolean var21 = true;
			int var22 = field3929[var17];
			while (var21) {
				var21 = false;
				for (int var23 = 0; var23 < var17; var23++) {
					if (field3940[var23] - field3929[var23] < var19 + 2 && var19 - var22 < field3940[var23] + 2 && var18 - var20 < field3938[var23] - -field3931[var23] && field3938[var23] - field3931[var23] < var20 + var18 && var19 > field3940[var23] - field3929[var23]) {
						var19 = field3940[var23] - field3929[var23];
						var21 = true;
					}
				}
			}
			client.field401 = field3938[var17];
			client.field541 = field3940[var17] = var19;
			JagString var24 = field3933[var17];
			if (ClientStream.field2548 == 0) {
				int var25 = 16776960;
				if (field3937[var17] < 6) {
					var25 = field3812[field3937[var17]];
				}
				if (field3937[var17] == 6) {
					var25 = field3990 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (field3937[var17] == 7) {
					var25 = field3990 % 20 >= 10 ? 65535 : 255;
				}
				if (field3937[var17] == 8) {
					var25 = field3990 % 20 < 10 ? 45056 : 8454016;
				}
				if (field3937[var17] == 9) {
					int var26 = 150 - field3926[var17];
					if (var26 < 50) {
						var25 = var26 * 1280 + 16711680;
					} else if (var26 < 100) {
						var25 = 16384000 + 16776960 - var26 * 327680;
					} else if (var26 < 150) {
						var25 = (var26 - 100) * 5 + 65280;
					}
				}
				if (field3937[var17] == 10) {
					int var27 = 150 - field3926[var17];
					if (var27 < 50) {
						var25 = var27 * 5 + 16711680;
					} else if (var27 < 100) {
						var25 = 16711935 - (var27 - 50) * 327680;
					} else if (var27 < 150) {
						var25 = var27 * 327680 + 500 + 255 - var27 * 5 - 32768000;
					}
				}
				if (field3937[var17] == 11) {
					int var28 = 150 - field3926[var17];
					if (var28 < 50) {
						var25 = 16777215 - var28 * 327685;
					} else if (var28 < 100) {
						var25 = (var28 - 50) * 327685 + 65280;
					} else if (var28 < 150) {
						var25 = 16777215 - (var28 - 100) * 327680;
					}
				}
				if (field3932[var17] == 0) {
					client.field1011.method141(var24, arg0 + client.field401, client.field541 + arg1, var25, 0);
				}
				if (field3932[var17] == 1) {
					client.field1011.method144(var24, client.field401 + arg0, client.field541 + arg1, var25, field3990);
				}
				if (field3932[var17] == 2) {
					client.field1011.method145(var24, arg0 + client.field401, arg1 - -client.field541, var25, field3990);
				}
				if (field3932[var17] == 3) {
					client.field1011.method164(var24, client.field401 + arg0, arg1 + client.field541, var25, field3990, 150 - field3926[var17]);
				}
				if (field3932[var17] == 4) {
					int var29 = (150 - field3926[var17]) * (client.field1011.method158(var24) + 100) / 150;
					Pix2D.method493(arg0 + client.field401 - 50, arg1, arg0 + client.field401 + 50, arg1 + arg2);
					client.field1011.method154(var24, arg0 + client.field401 + 50 - var29, arg1 - -client.field541, var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (field3932[var17] == 5) {
					int var30 = 0;
					int var31 = 150 - field3926[var17];
					if (var31 < 25) {
						var30 = var31 - 25;
					} else if (var31 > 125) {
						var30 = var31 - 125;
					}
					Pix2D.method493(arg0, client.field541 + arg1 - client.field1011.ascent - 1, arg3 + arg0, client.field541 + arg1 + 5);
					client.field1011.method141(var24, arg0 + client.field401, arg1 + (client.field541 - -var30), var25, 0);
					Pix2D.setClipping(arg0, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				client.field1011.method141(var24, arg0 + client.field401, arg1 + client.field541, 16776960, 0);
			}
		}
	}

	@ObfuscatedName("eh.a(ILnb;BZII)V")
	public static void method388(Js5 arg0, int arg1, int arg2) {
		MidiManager.field159 = arg2;
		MidiManager.field3039 = arg0;
		MidiManager.field4268 = arg1;
		MidiManager.field3343 = 10000;
		MidiManager.field2230 = 1;
		MidiManager.field4480 = 0;
		MidiManager.field277 = false;
	}

	@ObfuscatedName("eh.a(ILq;)Z")
	public static boolean method389(IfType arg0) {
		if (arg0.field3439 == 205) {
			class105.field1910 = 250;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("eh.a(IIIIIILnc;IJ)Z")
	public static boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7, long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			int var10 = arg1 * 128 + arg4 * 64;
			int var11 = arg2 * 128 + arg5 * 64;
			return World.method768(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
		}
	}

	@ObfuscatedName("k.a(III)V")
	public static void method755(int arg0, int arg1) {
		VarBitType var2 = VarBitType.method1043(arg0);
		int var3 = var2.field4233;
		int var4 = var2.field4234;
		int var5 = var2.field4237;
		int var6 = field1832[var5 - var4];
		if (arg1 < 0 || arg1 > var6) {
			arg1 = 0;
		}
		int var7 = var6 << var4;
		client.field2050[var3] = ~var7 & client.field2050[var3] | var7 & arg1 << var4;
	}

	@ObfuscatedName("ua.a(ZIII)Li;")
	public static JagString method1481(boolean arg0, int arg1) {
		int var2 = 1;
		int var3 = arg1 / 10;
		while (var3 != 0) {
			var3 /= 10;
			var2++;
		}
		int var4 = var2;
		if (arg1 < 0 || arg0) {
			var4 = var2 + 1;
		}
		byte[] var5 = new byte[var4];
		if (arg1 < 0) {
			var5[0] = 45;
		} else if (arg0) {
			var5[0] = 43;
		}
		for (int var6 = 0; var6 < var2; var6++) {
			int var7 = arg1 % 10;
			arg1 /= 10;
			if (var7 < 0) {
				var7 = -var7;
			}
			if (var7 > 9) {
				var7 += 39;
			}
			var5[var4 - var6 - 1] = (byte) (var7 + 48);
		}
		JagString var8 = new JagString();
		var8.length = var4;
		var8.chars = var5;
		return var8;
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

	@ObfuscatedName("b.a(IILq;B)V")
	public static void method65(int arg0, int arg1, IfType arg2) {
		if (arg2.field3368 == 1) {
			class98.method685(0, arg2.field3460, (short) 11, 0L, client.field3453, arg2.parentId);
		}
		if (arg2.field3368 == 2 && !field145) {
			JagString var3 = method1345(arg2);
			if (var3 != null) {
				class98.method685(-1, var3, (short) 15, 0L, JagString.join(new JagString[] { field182, arg2.field3459 }), arg2.parentId);
			}
		}
		if (arg2.field3368 == 3) {
			class98.method685(0, Text.field530, (short) 14, 0L, client.field3453, arg2.parentId);
		}
		if (arg2.field3368 == 4) {
			class98.method685(0, arg2.field3460, (short) 36, 0L, client.field3453, arg2.parentId);
		}
		if (arg2.field3368 == 5) {
			class98.method685(0, arg2.field3460, (short) 20, 0L, client.field3453, arg2.parentId);
		}
		if (arg2.field3368 == 6 && field967 == null) {
			class98.method685(-1, arg2.field3460, (short) 47, 0L, client.field3453, arg2.parentId);
		}
		if (arg2.field3390 == 2) {
			int var4 = 0;
			for (int var5 = 0; var5 < arg2.field3418; var5++) {
				for (int var6 = 0; var6 < arg2.field3501; var6++) {
					int var7 = (arg2.field3508 + 32) * var5;
					int var8 = (arg2.field3466 + 32) * var6;
					if (var4 < 20) {
						var7 += arg2.field3397[var4];
						var8 += arg2.field3472[var4];
					}
					if (arg1 >= var8 && arg0 >= var7 && var8 + 32 > arg1 && var7 + 32 > arg0) {
						client.field4229 = arg2;
						field3333 = var4;
						if (arg2.field3388[var4] > 0) {
							ObjType var9 = ObjType.list(arg2.field3388[var4] - 1);
							if (client.field475 == 1 && method431(method530(arg2))) {
								if (client.field3965 != arg2.parentId || var4 != client.field1105) {
									class98.method685(var4, Text.field608, (short) 42, (long) var9.field2844, JagString.join(new JagString[] { client.field1414, field581, var9.field2892 }), arg2.parentId);
								}
							} else if (!field145 || !method431(method530(arg2))) {
								JagString[] var10 = var9.field2904;
								if (field1807) {
									var10 = method921(var10);
								}
								if (method431(method530(arg2))) {
									for (int var11 = 4; var11 >= 3; var11--) {
										if (var10 != null && var10[var11] != null) {
											byte var12;
											if (var11 == 3) {
												var12 = 21;
											} else {
												var12 = 18;
											}
											class98.method685(var4, var10[var11], var12, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
										} else if (var11 == 4) {
											class98.method685(var4, Text.field4171, (short) 18, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
										}
									}
								}
								if (PacketBit.method27(method530(arg2))) {
									class98.method685(var4, Text.field608, (short) 12, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
								}
								if (method431(method530(arg2)) && var10 != null) {
									for (int var13 = 2; var13 >= 0; var13--) {
										if (var10[var13] != null) {
											byte var14 = 0;
											if (var13 == 0) {
												var14 = 28;
											}
											if (var13 == 1) {
												var14 = 9;
											}
											if (var13 == 2) {
												var14 = 2;
											}
											class98.method685(var4, var10[var13], var14, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
										}
									}
								}
								JagString[] var15 = arg2.field3511;
								if (field1807) {
									var15 = method921(var15);
								}
								if (var15 != null) {
									for (int var16 = 4; var16 >= 0; var16--) {
										if (var15[var16] != null) {
											byte var17 = 0;
											if (var16 == 0) {
												var17 = 6;
											}
											if (var16 == 1) {
												var17 = 8;
											}
											if (var16 == 2) {
												var17 = 49;
											}
											if (var16 == 3) {
												var17 = 44;
											}
											if (var16 == 4) {
												var17 = 13;
											}
											class98.method685(var4, var15[var16], var17, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
										}
									}
								}
								class98.method685(var4, Text.field1174, (short) 1001, (long) var9.field2844, JagString.join(new JagString[] { field2529, var9.field2892 }), arg2.parentId);
							} else if ((field2084 & 0x10) == 16) {
								class98.method685(var4, field3835, (short) 39, (long) var9.field2844, JagString.join(new JagString[] {field464, field581, var9.field2892 }), arg2.parentId);
							}
						}
					}
					var4++;
				}
			}
		}
		if (!arg2.field3410) {
			return;
		}
		if (!field145) {
			for (int var18 = 9; var18 >= 5; var18--) {
				JagString var19 = method1494(arg2, var18);
				if (var19 != null) {
					class98.method685(arg2.field3406, var19, (short) 1003, (long) (var18 + 1), arg2.field3457, arg2.parentId);
				}
			}
			JagString var20 = method1345(arg2);
			if (var20 != null) {
				class98.method685(arg2.field3406, var20, (short) 15, 0L, arg2.field3457, arg2.parentId);
			}
			for (int var21 = 4; var21 >= 0; var21--) {
				JagString var22 = method1494(arg2, var21);
				if (var22 != null) {
					class98.method685(arg2.field3406, var22, (short) 43, (long) (var21 + 1), arg2.field3457, arg2.parentId);
				}
			}
			if (method1526(method530(arg2))) {
				class98.method685(arg2.field3406, Text.field3665, (short) 47, 0L, client.field3453, arg2.parentId);
				return;
			}
			return;
		}
		if (ServerActive.method201(method530(arg2)) && (field2084 & 0x20) == 32) {
			class98.method685(arg2.field3406, field3835, (short) 40, 0L, JagString.join(new JagString[] {field464, field4548, arg2.field3457 }), arg2.parentId);
			return;
		}
	}

	@ObfuscatedName("ba.a(III)I")
	public static int method67(int arg0, int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		int var2 = arg0 * (arg1 & 0x7F) >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return var2 + (arg1 & 0xFF80);
	}

	@ObfuscatedName("bc.a(ZLae;I)V")
	public static void method71(PacketBit arg0) {
		while (true) {
			ReflectionCheck var1 = (ReflectionCheck) field1694.head();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field124; var3++) {
				if (var1.field139[var3] != null) {
					if (var1.field139[var3].status == 2) {
						var1.field132[var3] = -5;
					}
					if (var1.field139[var3].status == 0) {
						var2 = true;
					}
				}
				if (var1.field138[var3] != null) {
					if (var1.field138[var3].status == 2) {
						var1.field132[var3] = -6;
					}
					if (var1.field138[var3].status == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.method30(56);
			arg0.p1(0);
			int var4 = arg0.pos;
			arg0.p4(var1.field136);
			for (int var5 = 0; var5 < var1.field124; var5++) {
				if (var1.field132[var5] == 0) {
					try {
						int var6 = var1.field128[var5];
						if (var6 == 0) {
							Field var7 = (Field) var1.field139[var5].field3129;
							int var8 = var7.getInt(null);
							arg0.p1(0);
							arg0.p4(var8);
						} else if (var6 == 1) {
							Field var11 = (Field) var1.field139[var5].field3129;
							var11.setInt(null, var1.field129[var5]);
							arg0.p1(0);
						} else if (var6 == 2) {
							Field var9 = (Field) var1.field139[var5].field3129;
							int var10 = var9.getModifiers();
							arg0.p1(0);
							arg0.p4(var10);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field138[var5].field3129;
							byte[][] var15 = var1.field131[var5];
							Object[] var16 = new Object[var15.length];
							for (int var17 = 0; var17 < var15.length; var17++) {
								ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
								var16[var17] = var18.readObject();
							}
							Object var19 = var14.invoke(null, var16);
							if (var19 == null) {
								arg0.p1(0);
							} else if (var19 instanceof Number) {
								arg0.p1(1);
								arg0.p8(((Number) var19).longValue());
							} else if (var19 instanceof JagString) {
								arg0.p1(2);
								arg0.pjstr((JagString) var19);
							} else {
								arg0.p1(4);
							}
						} else if (var6 == 4) {
							Method var12 = (Method) var1.field138[var5].field3129;
							int var13 = var12.getModifiers();
							arg0.p1(0);
							arg0.p4(var13);
						}
					} catch (ClassNotFoundException var20) {
						arg0.p1(-10);
					} catch (InvalidClassException var21) {
						arg0.p1(-11);
					} catch (StreamCorruptedException var22) {
						arg0.p1(-12);
					} catch (OptionalDataException var23) {
						arg0.p1(-13);
					} catch (IllegalAccessException var24) {
						arg0.p1(-14);
					} catch (IllegalArgumentException var25) {
						arg0.p1(-15);
					} catch (InvocationTargetException var26) {
						arg0.p1(-16);
					} catch (SecurityException var27) {
						arg0.p1(-17);
					} catch (IOException var28) {
						arg0.p1(-18);
					} catch (NullPointerException var29) {
						arg0.p1(-19);
					} catch (Exception var30) {
						arg0.p1(-20);
					} catch (Throwable var31) {
						arg0.p1(-21);
					}
				} else {
					arg0.p1(var1.field132[var5]);
				}
			}
			arg0.method345(var4);
			arg0.method341(arg0.pos - var4);
			var1.unlink();
		}
	}

	@ObfuscatedName("n.b(II)I")
	public static int method930(int arg0) {
		VarBitType var1 = VarBitType.method1043(arg0);
		int var2 = var1.field4234;
		int var3 = var1.field4237;
		int var4 = var1.field4233;
		int var5 = field1832[var3 - var2];
		return client.field2050[var4] >> var2 & var5;
	}

	@ObfuscatedName("ei.a(II)I")
	public static int method394(int arg0) {
		int var1 = arg0 * 6 - 61440;
		int var2 = (var1 * arg0 >> 12) + 40960;
		int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
		return var2 * var3 >> 12;
	}

	@ObfuscatedName("ei.a(III)Lpc;")
	public static class166 method397(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null || var3.field949 == null ? null : var3.field949;
	}

	@ObfuscatedName("ac.a(ZII)V")
	public static void method23(int arg0, int arg1) {
		if (TitleScreen.field1183 != 0 && arg0 != -1) {
			method388(client.jingles, arg0, TitleScreen.field1183);
			client.field2012 = true;
		}
	}

	@ObfuscatedName("ac.c(II)Z")
	public static boolean method24(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@ObfuscatedName("g.a(ZLjava/lang/Object;I)[B")
	public static byte[] method457(boolean arg0, Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			byte[] var2 = (byte[]) arg1;
			return arg0 ? method1276(var2) : var2;
		} else if (arg1 instanceof class1) {
			class1 var3 = (class1) arg1;
			return var3.method1();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cf.a(I)V")
	public static void method174() {
		client.out.method30(24);
		for (class168 var0 = (class168) field2395.method1047(); var0 != null; var0 = (class168) field2395.method1048()) {
			if (var0.field3233 == 0) {
				method672(var0, true);
			}
		}
		if (field967 != null) {
			client.method1371(field967);
			field967 = null;
		}
	}

	@ObfuscatedName("vi.a(IBIII)V")
	public static void method1575(int arg0, int arg1) {
		field183 = arg1;
		field1207 = 0;
		field919 = 0;
		field279 = arg0;
	}

	@ObfuscatedName("fc.a(III)V")
	public static void method426(int arg0, int arg1) {
		long var2 = (long) ((arg0 << 16) + arg1);
		Js5NetRequest var4 = (Js5NetRequest) Js5Net.field3907.method1049(var2);
		if (var4 != null) {
			Js5Net.field2559.method1388(var4);
		}
	}

	@ObfuscatedName("qf.a(ZII)I")
	public static int method1284(int arg0, int arg1) {
		int var2 = arg1 >>> 31;
		return (var2 + arg1) / arg0 - var2;
	}

	@ObfuscatedName("qe.a([BZ)[B")
	public static byte[] method1276(byte[] arg0) {
		int var1 = arg0.length;
		byte[] var2 = new byte[var1];
		ArrayUtil.method836(arg0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("e.f(I)V")
	public static void method290() {
		if (Js5Net.field4033 != null) {
			Js5Net.field4033.close();
		}
	}

	@ObfuscatedName("e.a(IIII)I")
	public static int method292(int arg0, int arg1, int arg2) {
		int var3 = arg2 / arg1;
		int var4 = arg1 - 1 & arg2;
		int var5 = arg1 - 1 & arg0;
		int var6 = arg0 / arg1;
		int var7 = method48(var6, var3);
		int var8 = method48(var6, var3 + 1);
		int var9 = method48(var6 + 1, var3);
		int var10 = method48(var6 + 1, var3 + 1);
		int var11 = method419(arg1, var7, var4, var8);
		int var12 = method419(arg1, var9, var4, var10);
		return method419(arg1, var11, var5, var12);
	}

	@ObfuscatedName("l.a(Li;I)I")
	public static int method823(JagString arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (int var1 = 0; var1 < field2729; var1++) {
			if (arg0.method624(field370[var1])) {
				return var1;
			}
		}
		return -1;
	}

	@ObfuscatedName("db.a(IIZ)Lq;")
	public static IfType method238(int arg0, int arg1) {
		IfType var2 = client.method1579(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.field3465 == null || var2.field3465.length <= arg0) {
			return null;
		} else {
			return var2.field3465[arg0];
		}
	}

	@ObfuscatedName("db.a(IZ)V")
	public static void method239() {
		byte[][] var0 = field3221;
		for (int var1 = 0; var1 < 4; var1++) {
			client.method1479();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					boolean var4 = false;
					int var5 = class111.field2024[var1][var2][var3];
					if (var5 != -1) {
						int var6 = var5 >> 24 & 0x3;
						int var7 = var5 >> 14 & 0x3FF;
						int var8 = var5 >> 1 & 0x3;
						int var9 = var5 >> 3 & 0x7FF;
						int var10 = var9 / 8 + (var7 / 8 << 8);
						for (int var11 = 0; var11 < field2731.length; var11++) {
							if (var10 == field2731[var11] && var0[var11] != null) {
								method449(var2 * 8, var8, (var7 & 0x7) * 8, (var9 & 0x7) * 8, client.collision, var6, var0[var11], var3 * 8, var1);
								var4 = true;
								break;
							}
						}
					}
					if (!var4) {
						ClientBuild.method83(var1, 8, 8, var3 * 8, var2 * 8);
					}
				}
			}
		}
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

	@ObfuscatedName("pi.a(ILog;)V")
	public static void method1219(class159 arg0) {
		long var1 = 0L;
		if (arg0.field3063 == 0) {
			var1 = method1062(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		int var3 = 0;
		int var4 = 0;
		int var5 = -1;
		if (arg0.field3063 == 1) {
			var1 = method1082(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 2) {
			var1 = method770(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (arg0.field3063 == 3) {
			var1 = method501(arg0.field3055, arg0.field3059, arg0.field3052);
		}
		if (var1 != 0L) {
			var4 = (int) var1 >> 20 & 0x3;
			var5 = (int) (var1 >>> 32) & Integer.MAX_VALUE;
			var3 = (int) var1 >> 14 & 0x1F;
		}
		arg0.field3064 = var4;
		arg0.field3053 = var5;
		arg0.field3060 = var3;
	}

	@ObfuscatedName("pi.a(Lea;Li;B)I")
	public static int method1220(Packet arg0, JagString arg1) {
		int var2 = arg0.pos;
		arg0.method308(arg1.length);
		arg0.pos += field2033.method1456(arg1.chars, arg0.pos, arg1.length, 0, arg0.data);
		return arg0.pos - var2;
	}

	@ObfuscatedName("pi.b(II)V")
	public static void method1221(int arg0) {
		field3033 = arg0;
		field594 = -1;
		field594 = -1;
		class245.method1604();
	}

	@ObfuscatedName("dj.e(I)V")
	public static void method281(int arg0) {
		field3105 = arg0;
		for (int var1 = 0; var1 < World.field899; var1++) {
			for (int var2 = 0; var2 < World.field1202; var2++) {
				if (World.field489[arg0][var1][var2] == null) {
					World.field489[arg0][var1][var2] = new class52(arg0, var1, var2);
				}
			}
		}
	}

	@ObfuscatedName("dj.a(DB)V")
	public static void method282(double arg0) {
		if (field4041 == arg0) {
			return;
		}
		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = (int) (Math.pow((double) var2 / 255.0D, arg0) * 255.0D);
			IfType.field3507[var2] = var3 <= 255 ? var3 : 255;
		}
		field4041 = arg0;
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
		if (client.lang == 1) {
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

	@ObfuscatedName("jf.a(IIIB)Lpe;")
	public static class168 method720(int arg0, int arg1, int arg2) {
		class168 var3 = new class168();
		var3.field3233 = arg0;
		var3.field3229 = arg2;
		field2395.put((long) arg1, var3);
		client.method1005(arg2);
		IfType var4 = client.method1579(arg1);
		if (var4 != null) {
			client.method1371(var4);
		}
		if (field967 != null) {
			client.method1371(field967);
			field967 = null;
		}
		client.field1958 = false;
		client.field3862 = 0;
		client.method861(field889, field4421, field4383, field1549);
		if (var4 != null) {
			client.method759(false, var4);
		}
		client.method972(arg2);
		if (client.field723 != -1) {
			ClientStream.method912(client.field723, 1);
		}
		return var3;
	}

	@ObfuscatedName("jf.a(Lu;I)V")
	public static void method721(class218 arg0) {
		arg0.field4093 = false;
		if (arg0.field4106 != -1) {
			SeqType var1 = SeqType.method75(arg0.field4106);
			if (var1 == null || var1.field1965 == null) {
				arg0.field4106 = -1;
			} else {
				arg0.field4111++;
				if (arg0.field4127 < var1.field1965.length && var1.field1990[arg0.field4127] < arg0.field4111) {
					arg0.field4111 = 1;
					arg0.field4127++;
					method433(arg0 == client.localPlayer, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
				if (arg0.field4127 >= var1.field1965.length) {
					arg0.field4127 = 0;
					arg0.field4111 = 0;
					method433(arg0 == client.localPlayer, arg0.field4121, arg0.field4127, arg0.field4136, var1);
				}
			}
		}
		if (arg0.field4080 != -1 && client.field2113 >= arg0.field4082) {
			if (arg0.field4075 < 0) {
				arg0.field4075 = 0;
			}
			int var2 = SpotType.list(arg0.field4080).field542;
			if (var2 == -1) {
				arg0.field4080 = -1;
			} else {
				SeqType var3 = SeqType.method75(var2);
				if (var3 == null || var3.field1965 == null) {
					arg0.field4080 = -1;
				} else {
					arg0.field4120++;
					if (var3.field1965.length > arg0.field4075 && var3.field1990[arg0.field4075] < arg0.field4120) {
						arg0.field4075++;
						arg0.field4120 = 1;
						method433(client.localPlayer == arg0, arg0.field4121, arg0.field4075, arg0.field4136, var3);
					}
					if (arg0.field4075 >= var3.field1965.length) {
						arg0.field4080 = -1;
					}
				}
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 <= 1) {
			SeqType var4 = SeqType.method75(arg0.field4077);
			if (var4.field1983 == 1 && arg0.field4137 > 0 && arg0.field4133 <= client.field2113 && client.field2113 > arg0.field4130) {
				arg0.field4140 = 1;
				return;
			}
		}
		if (arg0.field4077 != -1 && arg0.field4140 == 0) {
			SeqType var5 = SeqType.method75(arg0.field4077);
			if (var5 == null || var5.field1965 == null) {
				arg0.field4077 = -1;
			} else {
				arg0.field4098++;
				if (arg0.field4101 < var5.field1965.length && var5.field1990[arg0.field4101] < arg0.field4098) {
					arg0.field4098 = 1;
					arg0.field4101++;
					method433(arg0 == client.localPlayer, arg0.field4121, arg0.field4101, arg0.field4136, var5);
				}
				if (arg0.field4101 >= var5.field1965.length) {
					arg0.field4132++;
					arg0.field4101 -= var5.field1972;
					if (arg0.field4132 >= var5.field1970) {
						arg0.field4077 = -1;
					} else if (arg0.field4101 >= 0 && arg0.field4101 < var5.field1965.length) {
						method433(arg0 == client.localPlayer, arg0.field4121, arg0.field4101, arg0.field4136, var5);
					} else {
						arg0.field4077 = -1;
					}
				}
				arg0.field4093 = var5.field1960;
			}
		}
		if (arg0.field4140 > 0) {
			arg0.field4140--;
		}
	}

	@ObfuscatedName("hh.a(ZI)V")
	public static void method576() {
		byte[][] var0 = field774;
		for (int var1 = 0; var1 < 4; var1++) {
			client.method1479();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					int var4 = class111.field2024[var1][var2][var3];
					if (var4 != -1) {
						int var5 = var4 >> 24 & 0x3;
						int var6 = var4 >> 1 & 0x3;
						int var7 = var4 >> 14 & 0x3FF;
						int var8 = var4 >> 3 & 0x7FF;
						int var9 = (var7 / 8 << 8) + (var8 / 8);
						for (int var10 = 0; var10 < field2731.length; var10++) {
							if (var9 == field2731[var10] && var0[var10] != null) {
								ClientBuild.method1447(var6, (var7 & 0x7) * 8, client.collision, (var8 & 0x7) * 8, var1, var0[var10], var5, var3 * 8, var2 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hh.a(Lea;I)Llb;")
	public static class122 method577(Packet arg0) {
		return new class122(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("qj.a(ZI)I")
	public static int bitceil(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

	@ObfuscatedName("kd.c(IIIIIIII)V")
	public static void method774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 < 0 || arg5 < 0 || arg1 >= 103 || arg5 >= 103) {
			return;
		}
		if (arg2 == 0) {
			class157 var7 = method1332(arg4, arg1, arg5);
			if (var7 != null) {
				int var8 = Integer.MAX_VALUE & (int) (var7.field3028 >>> 32);
				if (arg0 == 2) {
					var7.field3021 = new class81(var8, 2, arg3 + 4, arg4, arg1, arg5, arg6, false, var7.field3021);
					var7.field3032 = new class81(var8, 2, arg3 + 1 & 0x3, arg4, arg1, arg5, arg6, false, var7.field3032);
				} else {
					var7.field3021 = new class81(var8, arg0, arg3, arg4, arg1, arg5, arg6, false, var7.field3021);
				}
			}
		}
		if (arg2 == 1) {
			class64 var9 = method522(arg4, arg1, arg5);
			if (var9 != null) {
				int var10 = (int) (var9.field1158 >>> 32) & Integer.MAX_VALUE;
				if (arg0 == 4 || arg0 == 5) {
					var9.field1159 = new class81(var10, 4, arg3, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 6) {
					var9.field1159 = new class81(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 7) {
					var9.field1159 = new class81(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
				} else if (arg0 == 8) {
					var9.field1159 = new class81(var10, 4, arg3 + 4, arg4, arg1, arg5, arg6, false, var9.field1159);
					var9.field1160 = new class81(var10, 4, (arg3 + 2 & 0x3) + 4, arg4, arg1, arg5, arg6, false, var9.field1160);
				}
			}
		}
		if (arg2 == 2) {
			if (arg0 == 11) {
				arg0 = 10;
			}
			class108 var11 = World.method1396(arg4, arg1, arg5);
			if (var11 != null) {
				var11.field1943 = new class81((int) (var11.field1948 >>> 32) & Integer.MAX_VALUE, arg0, arg3, arg4, arg1, arg5, arg6, false, var11.field1943);
			}
		}
		if (arg2 == 3) {
			class166 var12 = method397(arg4, arg1, arg5);
			if (var12 != null) {
				var12.field3194 = new class81((int) (var12.field3202 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg1, arg5, arg6, false, var12.field3194);
			}
		}
	}

	@ObfuscatedName("lh.c(B)V")
	public static void method869() {
		field1694 = new LinkList();
	}

	@ObfuscatedName("lh.a(IIZIII)V")
	public static void method871(int arg0, int arg1, int arg2, int arg3, int arg4) {
		long var5 = method1062(arg2, arg4, arg0);
		if (var5 != 0L) {
			int var7 = (int) var5 >> 20 & 0x3;
			int var8 = (int) var5 >> 14 & 0x1F;
			int var9 = arg3;
			int[] var10 = Pix2D.field1331;
			int var11 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			int var12 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
			if (var5 > 0L) {
				var9 = arg1;
			}
			LocType var13 = LocType.method1321(var12);
			if (var13.field2832 == -1) {
				if (var8 == 0 || var8 == 2) {
					if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 1) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 3] = var9;
						var10[var11 + 515] = var9;
						var10[var11 + 1024 + 3] = var9;
						var10[var11 + 3 + 1536] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1 + 1536] = var9;
						var10[var11 + 2 + 1536] = var9;
						var10[var11 + 1536 + 3] = var9;
					}
				}
				if (var8 == 3) {
					if (var7 == 0) {
						var10[var11] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 3) {
						var10[var11 + 1536] = var9;
					}
				}
				if (var8 == 2) {
					if (var7 == 3) {
						var10[var11] = var9;
						var10[var11 + 512] = var9;
						var10[var11 + 1024] = var9;
						var10[var11 + 1536] = var9;
					} else if (var7 == 0) {
						var10[var11] = var9;
						var10[var11 + 1] = var9;
						var10[var11 + 2] = var9;
						var10[var11 + 3] = var9;
					} else if (var7 == 1) {
						var10[var11 + 3] = var9;
						var10[var11 + 512 + 3] = var9;
						var10[var11 + 3 + 1024] = var9;
						var10[var11 + 1536 + 3] = var9;
					} else if (var7 == 2) {
						var10[var11 + 1536] = var9;
						var10[var11 + 1536 + 1] = var9;
						var10[var11 + 1538] = var9;
						var10[var11 + 3 + 1536] = var9;
					}
				}
			} else {
				SoftwarePix8 var14 = class240.field4460[var13.field2832];
				if (var14 != null) {
					int var15 = (var13.field2774 * 4 - var14.field2434) / 2;
					int var16 = (var13.field2794 * 4 - var14.field2437) / 2;
					var14.method876(arg4 * 4 + var15 + 48, 48 - -((104 - (arg0 - -var13.field2794)) * 4) + var16);
				}
			}
		}
		long var17 = method770(arg2, arg4, arg0);
		if (var17 != 0L) {
			int var19 = (int) var17 >> 20 & 0x3;
			int var20 = (int) var17 >> 14 & 0x1F;
			int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
			LocType var22 = LocType.method1321(var21);
			if (var22.field2832 != -1) {
				SoftwarePix8 var23 = class240.field4460[var22.field2832];
				if (var23 != null) {
					int var24 = (var22.field2774 * 4 - var23.field2434) / 2;
					int var25 = (var22.field2794 * 4 - var23.field2437) / 2;
					var23.method876(arg4 * 4 + var24 + 48, var25 + (-var22.field2794 + -arg0 + 104) * 4 + 48);
				}
			} else if (var20 == 9) {
				int var26 = 15658734;
				int[] var27 = Pix2D.field1331;
				if (var17 > 0L) {
					var26 = 15597568;
				}
				int var28 = arg4 * 4 + (103 - arg0) * 512 * 4 + 24624;
				if (var19 == 0 || var19 == 2) {
					var27[var28 + 1536] = var26;
					var27[var28 + 1025] = var26;
					var27[var28 + 514] = var26;
					var27[var28 + 3] = var26;
				} else {
					var27[var28] = var26;
					var27[var28 + 1 + 512] = var26;
					var27[var28 + 1024 + 2] = var26;
					var27[var28 + 1539] = var26;
				}
			}
		}
		long var29 = method501(arg2, arg4, arg0);
		if (var29 == 0L) {
			return;
		}
		int var31 = Integer.MAX_VALUE & (int) (var29 >>> 32);
		LocType var32 = LocType.method1321(var31);
		if (var32.field2832 == -1) {
			return;
		}
		SoftwarePix8 var33 = class240.field4460[var32.field2832];
		if (var33 != null) {
			int var34 = (var32.field2774 * 4 - var33.field2434) / 2;
			int var35 = (var32.field2794 * 4 - var33.field2437) / 2;
			var33.method876(var34 + arg4 * 4 + 48, (-arg0 + 104 + -var32.field2794) * 4 + 48 - -var35);
			return;
		}
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
		field1896 = arg2.method964(client.field561);
		field3019 = arg2.method964(field2089);
		class245.field4502 = arg2.method964(field316);
		field2912 = arg2.method964(field1733);
		field209 = arg2.method964(field4278);
		field119 = arg2.method964(field4011);
		field1783 = arg2.method964(JagString.field881);
		field2195 = arg2.method964(field102);
		field4247 = arg2.method964(field1682);
		class86.field1552 = arg0.method964(field2156);
	}

	@ObfuscatedName("o.f(I)I")
	public static int method1040() {
		int var0 = client.method1584(client.field1428, client.field3608, client.field2907);
		return var0 - client.field1954 >= 800 || (ClientBuild.field2098[client.field2907][client.field1428 >> 7][client.field3608 >> 7] & 0x4) == 0 ? 3 : client.field2907;
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
			return client.field2103 ? field2321 : null;
		} else {
			return arg0.field3512;
		}
	}

	@ObfuscatedName("fd.a(Li;IBLi;Li;)V")
	public static void method428(JagString arg0, JagString arg1, JagString arg2) {
		client.method801(arg1, -1, arg0, 9, arg2);
	}

	@ObfuscatedName("fd.a(BI)Z")
	public static boolean method431(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("fd.a(IZIIILk;)V")
	public static void method433(boolean arg0, int arg1, int arg2, int arg3, SeqType arg4) {
		if (client.field3445 >= 50 || (arg4.field2001 == null || arg4.field2001.length < 1 || arg2 >= arg4.field2001.length || arg4.field2001[arg2] == null)) {
			return;
		}
		int var5 = arg4.field2001[arg2][0];
		int var6 = var5 >> 8;
		int var7 = var5 >> 4 & 0x7;
		int var8 = var5 & 0xF;
		if (arg4.field2001[arg2].length > 1) {
			int var9 = (int) (Math.random() * (double) arg4.field2001[arg2].length);
			if (var9 > 0) {
				var6 = arg4.field2001[arg2][var9];
			}
		}
		if (var8 == 0) {
			if (arg0) {
				method668(var7, 0, var6);
			}
		} else if (client.field4211 != 0) {
			field397[client.field3445] = var6;
			field2016[client.field3445] = var7;
			field116[client.field3445] = 0;
			int var10 = (arg3 - 64) / 128;
			field4417[client.field3445] = null;
			int var11 = (arg1 - 64) / 128;
			field2726[client.field3445] = (var10 << 16) + (var11 << 8) + var8;
			client.field3445++;
		}
	}

	@ObfuscatedName("pd.a(I[Lgd;II)V")
	public static void method1143(int arg0, class70[] arg1, int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		int var3 = arg0 - 1;
		int var4 = (arg0 + arg2) / 2;
		int var5 = arg2 + 1;
		class70 var6 = arg1[var4];
		arg1[var4] = arg1[arg0];
		arg1[arg0] = var6;
		while (var3 < var5) {
			boolean var7 = true;
			do {
				var5--;
				for (int var8 = 0; var8 < 4; var8++) {
					int var9;
					int var10;
					if (field461[var8] == 2) {
						var10 = arg1[var5].field1258;
						var9 = var6.field1258;
					} else if (field461[var8] == 1) {
						var9 = var6.field1255;
						if (var9 == -1 && field1686[var8] == 1) {
							var9 = 2001;
						}
						var10 = arg1[var5].field1255;
						if (var10 == -1 && field1686[var8] == 1) {
							var10 = 2001;
						}
					} else if (field461[var8] == 3) {
						var10 = arg1[var5].field1257 ? 1 : 0;
						var9 = var6.field1257 ? 1 : 0;
					} else {
						var10 = arg1[var5].field1261;
						var9 = var6.field1261;
					}
					if (var10 != var9) {
						if ((field1686[var8] != 1 || var10 <= var9) && (field1686[var8] != 0 || var10 >= var9)) {
							var7 = false;
						}
						break;
					}
					if (var8 == 3) {
						var7 = false;
					}
				}
			} while (var7);
			boolean var11 = true;
			do {
				var3++;
				for (int var12 = 0; var12 < 4; var12++) {
					int var13;
					int var14;
					if (field461[var12] == 2) {
						var13 = arg1[var3].field1258;
						var14 = var6.field1258;
					} else if (field461[var12] == 1) {
						var13 = arg1[var3].field1255;
						if (var13 == -1 && field1686[var12] == 1) {
							var13 = 2001;
						}
						var14 = var6.field1255;
						if (var14 == -1 && field1686[var12] == 1) {
							var14 = 2001;
						}
					} else if (field461[var12] == 3) {
						var13 = arg1[var3].field1257 ? 1 : 0;
						var14 = var6.field1257 ? 1 : 0;
					} else {
						var13 = arg1[var3].field1261;
						var14 = var6.field1261;
					}
					if (var13 != var14) {
						if ((field1686[var12] != 1 || var13 >= var14) && (field1686[var12] != 0 || var13 <= var14)) {
							var11 = false;
						}
						break;
					}
					if (var12 == 3) {
						var11 = false;
					}
				}
			} while (var11);
			if (var5 > var3) {
				class70 var15 = arg1[var3];
				arg1[var3] = arg1[var5];
				arg1[var5] = var15;
			}
		}
		method1143(arg0, arg1, var5);
		method1143(var5 + 1, arg1, arg2);
	}

	@ObfuscatedName("pd.c(B)V")
	public static void method1144() {
		for (int var0 = 0; var0 < field1041; var0++) {
			int var1 = field402[var0];
			class191 var2 = client.field4223[var1];
			if (var2 != null) {
				client.method514(var2.field3682.field2349, var2);
			}
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

	@ObfuscatedName("td.a(Lu;I)V")
	public static void method1444(class218 arg0) {
		if (arg0.field4130 == client.field2113 || arg0.field4077 == -1 || arg0.field4140 != 0 || arg0.field4098 + 1 > SeqType.method75(arg0.field4077).field1990[arg0.field4101]) {
			int var1 = client.field2113 - arg0.field4133;
			int var2 = arg0.field4113 * 128 + arg0.field4103 * 64;
			int var3 = arg0.field4130 - arg0.field4133;
			int var4 = arg0.field4094 * 128 + arg0.field4103 * 64;
			int var5 = arg0.field4100 * 128 + arg0.field4103 * 64;
			int var6 = arg0.field4072 * 128 + arg0.field4103 * 64;
			arg0.field4121 = ((var3 - var1) * var4 + var6 * var1) / var3;
			arg0.field4136 = ((var3 - var1) * var2 + var5 * var1) / var3;
		}
		arg0.field4108 = 0;
		if (arg0.field4139 == 0) {
			arg0.field4119 = 1024;
		}
		if (arg0.field4139 == 1) {
			arg0.field4119 = 1536;
		}
		if (arg0.field4139 == 2) {
			arg0.field4119 = 0;
		}
		if (arg0.field4139 == 3) {
			arg0.field4119 = 512;
		}
		arg0.field4085 = arg0.field4119;
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

	@ObfuscatedName("mh.a(IIIILdj;)V")
	public static void method922(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		if (arg3 == client.localPlayer || client.field3862 >= 400) {
			return;
		}
		JagString var4;
		if (arg3.field749 == 0) {
			var4 = JagString.join(new JagString[] { arg3.field766, client.method1152(arg3.field747, client.localPlayer.field747), field1238, Text.field2717, method1212(arg3.field747), field1879});
		} else {
			var4 = JagString.join(new JagString[] { arg3.field766, field1238, Text.field2637, method1212(arg3.field749), field1879});
		}
		if (client.field475 == 1) {
			class98.method685(arg1, Text.field608, (short) 31, (long) arg0, JagString.join(new JagString[] { client.field1414, field914, var4 }), arg2);
		} else if (!field145) {
			for (int var5 = 7; var5 >= 0; var5--) {
				if (field2436[var5] != null) {
					short var6 = 0;
					if (client.game == 0 && field2436[var5].method624(Text.field3041)) {
						if (arg3.field747 > client.localPlayer.field747) {
							var6 = 2000;
						}
						if (client.localPlayer.field752 != 0 && arg3.field752 != 0) {
							if (arg3.field752 == client.localPlayer.field752) {
								var6 = 2000;
							} else {
								var6 = 0;
							}
						}
					} else if (field3875[var5]) {
						var6 = 2000;
					}
					short var7 = field390[var5];
					short var8 = (short) (var7 + var6);
					class98.method685(arg1, field2436[var5], var8, (long) arg0, JagString.join(new JagString[] {field1637, var4 }), arg2);
				}
			}
		} else if ((field2084 & 0x8) == 8) {
			class98.method685(arg1, field3835, (short) 23, (long) arg0, JagString.join(new JagString[] {field464, field914, var4 }), arg2);
		}
		for (int var9 = 0; var9 < client.field3862; var9++) {
			if (client.field994[var9] == 10) {
				client.field3836[var9] = JagString.join(new JagString[] {field1637, var4 });
				return;
			}
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

	@ObfuscatedName("ah.a(III)I")
	public static int method48(int arg0, int arg1) {
		int var2 = method1330(arg0 - 1, arg1 + -1) + method1330(arg0 - 1, arg1 + 1) + method1330(arg0 + 1, arg1 + -1) + method1330(arg0 - -1, arg1 - -1);
		int var3 = method1330(arg0, arg1 - 1) + method1330(arg0, arg1 + 1) + method1330(arg0 + -1, arg1) + method1330(arg0 - -1, arg1);
		int var4 = method1330(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
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

	@ObfuscatedName("bf.a(Lu;Z)V")
	public static void method86(class218 arg0) {
		if (arg0.field4102 == 0) {
			return;
		}
		if (arg0.field4114 != -1 && arg0.field4114 < 32768) {
			class191 var1 = client.field4223[arg0.field4114];
			if (var1 != null) {
				int var2 = arg0.field4121 - var1.field4121;
				int var3 = arg0.field4136 - var1.field4136;
				if (var3 != 0 || var2 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var3, (double) var2) * 325.949D) & 0x7FF;
				}
			}
		}
		if (arg0.field4114 >= 32768) {
			int var4 = arg0.field4114 - 32768;
			if (var4 == client.selfSlot) {
				var4 = 2047;
			}
			ClientPlayer var5 = client.field4491[var4];
			if (var5 != null) {
				int var6 = arg0.field4136 - var5.field4136;
				int var7 = arg0.field4121 - var5.field4121;
				if (var6 != 0 || var7 != 0) {
					arg0.field4119 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.field4096 != 0 || arg0.field4099 != 0) && (arg0.field4135 == 0 || arg0.field4108 > 0)) {
			int var8 = arg0.field4103 * 64 + arg0.field4121 - (-client.field3679 + arg0.field4099 + -client.field3679) * 64 - 64;
			int var9 = arg0.field4136 + (arg0.field4103 - 1) * 64 - (arg0.field4096 - client.field4212 - client.field4212) * 64;
			if (var9 != 0 || var8 != 0) {
				arg0.field4119 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
			}
			arg0.field4099 = 0;
			arg0.field4096 = 0;
		}
		int var10 = arg0.field4119 - arg0.field4085 & 0x7FF;
		if (var10 == 0) {
			arg0.field4089 = 0;
			return;
		}
		arg0.field4089++;
		if (var10 > 1024) {
			arg0.field4085 -= arg0.field4102;
			boolean var11 = true;
			if (var10 < arg0.field4102 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var11 = false;
			}
			if (arg0.field4105 == arg0.field4106 && (arg0.field4089 > 25 || var11)) {
				if (arg0.field4091 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4091;
				}
			}
		} else {
			arg0.field4085 += arg0.field4102;
			boolean var12 = true;
			if (arg0.field4102 > var10 || 2048 - arg0.field4102 < var10) {
				arg0.field4085 = arg0.field4119;
				var12 = false;
			}
			if (arg0.field4106 == arg0.field4105 && (arg0.field4089 > 25 || var12)) {
				if (arg0.field4128 == -1) {
					arg0.field4106 = arg0.field4092;
				} else {
					arg0.field4106 = arg0.field4128;
				}
			}
		}
		arg0.field4085 &= 0x7FF;
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
		return method524(arg0);
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

	@ObfuscatedName("od.a(Lf;IIIIIIZ)V")
	public static void method1060(Ground arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		int var8 = arg0.field1069.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg0.field1069[var9] - World.field1353;
			int var11 = arg0.field1064[var9] - World.field4461;
			int var12 = arg0.field1053[var9] - World.field4048;
			int var13 = var12 * arg3 + var10 * arg4 >> 16;
			int var14 = var12 * arg4 - var10 * arg3 >> 16;
			int var16 = var11 * arg2 - var14 * arg1 >> 16;
			int var17 = var11 * arg1 + var14 * arg2 >> 16;
			if (var17 < 50) {
				return;
			}
			if (arg0.field1063 != null) {
				Ground.field1058[var9] = var13;
				Ground.field1072[var9] = var16;
				Ground.field1057[var9] = var17;
			}
			Ground.field1055[var9] = Pix3D.field3363 + (var13 << 9) / var17;
			Ground.field1062[var9] = Pix3D.field3361 + (var16 << 9) / var17;
		}
		Pix3D.field3348 = 0;
		int var18 = arg0.field1074.length;
		for (int var19 = 0; var19 < var18; var19++) {
			int var20 = arg0.field1074[var19];
			int var21 = arg0.field1056[var19];
			int var22 = arg0.field1054[var19];
			int var23 = Ground.field1055[var20];
			int var24 = Ground.field1055[var21];
			int var25 = Ground.field1055[var22];
			int var26 = Ground.field1062[var20];
			int var27 = Ground.field1062[var21];
			int var28 = Ground.field1062[var22];
			if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
				if (World.field2145 && World.method122(World.field698 + Pix3D.field3363, World.field621 + Pix3D.field3361, var26, var27, var28, var23, var24, var25)) {
					World.field2057 = arg5;
					World.field1714 = arg6;
				}
				if (!arg7) {
					Pix3D.field3358 = false;
					if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix3D.field3350 || var24 > Pix3D.field3350 || var25 > Pix3D.field3350) {
						Pix3D.field3358 = true;
					}
					if (arg0.field1063 == null || arg0.field1063[var19] == -1) {
						if (arg0.field1073[var19] != 12345678) {
							Pix3D.method1227(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19]);
						}
					} else if (World.field1882) {
						int var29 = Pix3D.field3356.method438(arg0.field1063[var19]);
						Pix3D.method1227(var26, var27, var28, var23, var24, var25, QuickChatCatTypeList.method791(var29, arg0.field1073[var19]), QuickChatCatTypeList.method791(var29, arg0.field1070[var19]), QuickChatCatTypeList.method791(var29, arg0.field1060[var19]));
					} else if (arg0.field1068) {
						Pix3D.method1225(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19], Ground.field1058[0], Ground.field1058[1], Ground.field1058[3], Ground.field1072[0], Ground.field1072[1], Ground.field1072[3], Ground.field1057[0], Ground.field1057[1], Ground.field1057[3], arg0.field1063[var19]);
					} else {
						Pix3D.method1225(var26, var27, var28, var23, var24, var25, arg0.field1073[var19], arg0.field1070[var19], arg0.field1060[var19], Ground.field1058[var20], Ground.field1058[var21], Ground.field1058[var22], Ground.field1072[var20], Ground.field1072[var21], Ground.field1072[var22], Ground.field1057[var20], Ground.field1057[var21], Ground.field1057[var22], arg0.field1063[var19]);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.c(I)V")
	public static void method367() {
		for (int var0 = 0; var0 < client.field3445; var0++) {
			int var10002 = field116[var0]--;
			if (field116[var0] >= -10) {
				JagFX var2 = field4417[var0];
				if (var2 == null) {
					var2 = JagFX.method252(client.jagFX, field397[var0], 0);
					if (var2 == null) {
						continue;
					}
					field116[var0] += var2.method251();
					field4417[var0] = var2;
				}
				if (field116[var0] < 0) {
					int var3;
					if (field2726[var0] == 0) {
						var3 = field2172;
					} else {
						int var4 = (field2726[var0] & 0xFF) * 128;
						int var5 = field2726[var0] >> 16 & 0xFF;
						int var6 = var5 * 128 + 64 - client.localPlayer.field4136;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = field2726[var0] >> 8 & 0xFF;
						int var8 = var7 * 128 + 64 - client.localPlayer.field4121;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							field116[var0] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = (var4 - var9) * client.field4211 / var4;
					}
					if (var3 > 0) {
						class213 var10 = var2.method253().method1453(client.decimator);
						class162 var11 = class162.method1124(var10, var3);
						var11.method1119(field2016[var0] - 1);
						client.mixer.method1506(var11);
					}
					field116[var0] = -100;
				}
			} else {
				client.field3445--;
				for (int var1 = var0; var1 < client.field3445; var1++) {
					field397[var1] = field397[var1 + 1];
					field4417[var1] = field4417[var1 + 1];
					field2016[var1] = field2016[var1 + 1];
					field116[var1] = field116[var1 + 1];
					field2726[var1] = field2726[var1 + 1];
				}
				var0--;
			}
		}
		if (client.field2012 && !MidiManager.method707()) {
			if (TitleScreen.field1183 != 0 && field25 != -1) {
				method388(client.songs, field25, TitleScreen.field1183);
			}
			client.field2012 = false;
		} else if (TitleScreen.field1183 != 0 && field25 != -1 && !MidiManager.method707()) {
			client.out.method30(133);
			client.out.p4(field25);
			field25 = -1;
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

	@ObfuscatedName("ee.a(B)V")
	public static void method372() {
		if (field2514 != null || client.field3568 != null) {
			return;
		}
		int var0 = ClientMouseListener.field625;
		if (client.field1958) {
			if (var0 != 1) {
				int var5 = ClientMouseListener.field471;
				int var6 = ClientMouseListener.field4449;
				if (field1549 - 10 > var5 || field1549 + field4421 + 10 < var5 || var6 < field4383 - 10 || field889 + field4383 + 10 < var6) {
					client.field1958 = false;
					client.method861(field889, field4421, field4383, field1549);
				}
			}
			if (var0 != 1) {
				return;
			}
			int var7 = field1549;
			int var8 = field4383;
			int var9 = field4421;
			int var10 = ClientMouseListener.field4239;
			int var11 = ClientMouseListener.field3339;
			int var12 = -1;
			for (int var13 = 0; var13 < client.field3862; var13++) {
				int var14 = var8 + (-var13 + client.field3862 + -1) * 15 + 31;
				if (var10 > var7 && var10 < var7 + var9 && var11 > var14 - 13 && var11 < var14 + 3) {
					var12 = var13;
				}
			}
			if (var12 != -1) {
				client.method1257(var12);
			}
			client.field1958 = false;
			client.method861(field889, field4421, field4383, field1549);
			return;
		}
		if (var0 == 1 && client.field3862 > 0) {
			short var1 = client.field994[client.field3862 - 1];
			if (var1 == 6 || var1 == 8 || var1 == 49 || var1 == 44 || var1 == 13 || var1 == 28 || var1 == 9 || var1 == 2 || var1 == 21 || var1 == 18 || var1 == 12 || var1 == 1001) {
				int var2 = client.field3176[client.field3862 - 1];
				int var3 = client.field4060[client.field3862 - 1];
				IfType var4 = client.method1579(var3);
				if (method465(method530(var4)) || method1070(method530(var4))) {
					field4535 = 0;
					field739 = false;
					if (field2514 != null) {
						client.method1371(field2514);
					}
					field2514 = client.method1579(var3);
					field305 = var2;
					field4146 = ClientMouseListener.field4239;
					field894 = ClientMouseListener.field3339;
					client.method1371(field2514);
					return;
				}
			}
		}
		if (var0 == 1 && (client.field3859 == 1 && client.field3862 > 2 || client.method1554(client.field3862 - 1))) {
			var0 = 2;
		}
		if (var0 == 1 && client.field3862 > 0) {
			client.method1257(client.field3862 - 1);
		}
		if (var0 == 2 && client.field3862 > 0) {
			client.method904();
			return;
		}
	}

	@ObfuscatedName("ee.b(III)V")
	public static void method374(int arg0, int arg1, int arg2) {
		World.field2145 = true;
		field2484 = arg0;
		World.field698 = arg1;
		World.field621 = arg2;
		World.field2057 = -1;
		World.field1714 = -1;
	}

	@ObfuscatedName("ee.a(BZI)Li;")
	public static JagString method375(int arg0) {
		return method1481(true, arg0);
	}

	@ObfuscatedName("eg.a(IB)I")
	public static int method387(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("fh.a(IIZIII[Lia;I[BII)V")
	public static void method449(int arg0, int arg1, int arg2, int arg3, CollisionMap[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		for (int var9 = 0; var9 < 8; var9++) {
			for (int var10 = 0; var10 < 8; var10++) {
				if (var9 + arg0 > 0 && var9 + arg0 < 103 && arg7 + var10 > 0 && var10 + arg7 < 103) {
					arg4[arg8].field1667[arg0 + var9][arg7 + var10] &= 0xFEFFFFFF;
				}
			}
		}
		Packet var11 = new Packet(arg6);
		for (int var12 = 0; var12 < 4; var12++) {
			for (int var13 = 0; var13 < 64; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					if (var12 == arg5 && var13 >= arg2 && var13 < arg2 + 8 && var14 >= arg3 && var14 < arg3 + 8) {
						ClientStream.method914(RegionRotate.method1606(arg1, var13 & 0x7, var14 & 0x7) + arg0, var11, 0, 0, arg7 + RegionRotate.method1069(var14 & 0x7, var13 & 0x7, arg1), arg1, arg8);
					} else {
						ClientStream.method914(-1, var11, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("fi.a(Lhj;B)V")
	public static void method453(GameShell arg0) {
		if (ClientMouseListener.field625 != 1) {
			return;
		}
		if (ClientMouseListener.field4239 >= 280 && ClientMouseListener.field4239 <= 294 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(0, 0);
			return;
		}
		if (ClientMouseListener.field4239 >= 295 && ClientMouseListener.field4239 <= 360 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(0, 1);
			return;
		}
		if (ClientMouseListener.field4239 >= 390 && ClientMouseListener.field4239 <= 404 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(1, 0);
			return;
		}
		if (ClientMouseListener.field4239 >= 405 && ClientMouseListener.field4239 <= 470 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(1, 1);
			return;
		}
		if (ClientMouseListener.field4239 >= 500 && ClientMouseListener.field4239 <= 514 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(2, 0);
			return;
		}
		if (ClientMouseListener.field4239 >= 515 && ClientMouseListener.field4239 <= 580 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(2, 1);
			return;
		}
		if (ClientMouseListener.field4239 >= 610 && ClientMouseListener.field4239 <= 624 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(3, 0);
			return;
		}
		if (ClientMouseListener.field4239 >= 625 && ClientMouseListener.field4239 <= 690 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field3339 <= 18) {
			method656(3, 1);
			return;
		}
		if (ClientMouseListener.field4239 >= 700 && ClientMouseListener.field3339 >= 4 && ClientMouseListener.field4239 <= 758 && ClientMouseListener.field3339 <= 20) {
			TitleScreen.field3959 = false;
			TitleScreen.method1493();
			return;
		}
		if (GameShell.field1581 == -1) {
			return;
		}
		class70 var1 = field3845[GameShell.field1581];
		if (client.memServer == var1.field1257) {
			byte[] var2 = JagString.join(new JagString[] { var1.field1262, field3922}).method613();
			client.field1760 = new String(var2, 0, var2.length);
			client.worldid = var1.field1261;
			if (client.modewhere != 0) {
				client.loginJs5Port = 443;
				client.modewhere = 0;
				client.loginPort = 43594;
				client.loginGamePort = 43594;
			}
			TitleScreen.field3959 = false;
			TitleScreen.method1493();
			return;
		}
		JagString var3 = JagString.join(new JagString[] { field1771, var1.field1262, field3076, method1212(client.lang), field63, method1212(client.lowMem ? 1 : 0), field21, method1212(client.plug), field1351, method1212(client.js) });
		try {
			arg0.getAppletContext().showDocument(var3.method606(), "_self");
		} catch (Exception var4) {
		}
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
			if ((!arg0 || var6.field2861) && var6.field2867 == -1 && var6.field2884 == -1 && var6.field2850 == 0 && var6.field2892.method639().method617(var2) != -1) {
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
			var9[var10] = ObjType.list(var4[var10]).field2892;
		}
		method1376(field1210, var9);
	}

	@ObfuscatedName("ge.a(BI)I")
	public static int method473(int arg0) {
		return arg0 & 0x3FF;
	}

	@ObfuscatedName("ge.a(ILq;)Z")
	public static boolean method475(IfType arg0) {
		if (client.field2103) {
			if (method530(arg0) != 0) {
				return false;
			}
			if (arg0.field3390 == 0) {
				return false;
			}
		}
		return arg0.field3378;
	}

	@ObfuscatedName("gh.c(III)J")
	public static long method501(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null || var3.field949 == null ? 0L : var3.field949.field3202;
	}

	@ObfuscatedName("b.a(Lea;I)Lgh;")
	public static class74 method62(Packet arg0) {
		return new class74(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("kc.a(III)J")
	public static long method770(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		if (var3 == null) {
			return 0L;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			class108 var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				return var5.field1948;
			}
		}
		return 0L;
	}

	@ObfuscatedName("ie.a(BLpe;Z)V")
	public static void method672(class168 arg0, boolean arg1) {
		int var2 = arg0.field3229;
		int var3 = (int) arg0.key;
		arg0.unlink();
		if (arg1) {
			IfType.method233(var2);
		}
		client.method70(var2);
		IfType var4 = client.method1579(var3);
		if (var4 != null) {
			client.method1371(var4);
		}
		client.field3862 = 0;
		client.field1958 = false;
		client.method861(field889, field4421, field4383, field1549);
		if (client.field723 != -1) {
			ClientStream.method912(client.field723, 1);
		}
	}

	@ObfuscatedName("cj.a(BLi;)Lwe;")
	public static class244 method207(JagString arg0) {
		if (arg0.method604() == 0) {
			return null;
		}
		for (class244 var1 = (class244) field3049.head(); var1 != null; var1 = (class244) field3049.method1619()) {
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
			class245.method1604();
		} else if (field2915 < field1110) {
			field1110 -= field1110 / 30.0D;
			if (field2915 > field1110) {
				field1110 = field2915;
			}
			class245.method1604();
		}
		if (field3659 == -1 || field594 == -1) {
			return;
		}
		int var0 = field3659 - NpcType.field2330;
		if (var0 < 2 || var0 > 2) {
			var0 >>= 0x4;
		}
		int var1 = field594 - field3033;
		if (var1 < 2 || var1 > 2) {
			var1 >>= 0x4;
		}
		field3033 += var1;
		NpcType.field2330 += var0;
		if (var0 == 0 && var1 == 0) {
			field3659 = -1;
			field594 = -1;
		}
		class245.method1604();
	}

	@ObfuscatedName("rd.e(B)V")
	public static void method1319() {
		if (field319 == null) {
			return;
		}
		if (field4276 < 10) {
			if (!client.worldmap.method954(field319)) {
				field4276 = client.worldmap.method957(field319) / 10;
				return;
			}
			field4276 = 10;
		}
		if (field4276 == 10) {
			Packet var0 = new Packet(client.worldmap.method960(field319, field1444));
			int var1 = var0.g2();
			int var2 = var0.g2();
			int var3 = var0.g2();
			int var4 = var0.g2();
			int var5 = var0.g2();
			int var6 = var0.g2();
			field2181 = var2 * 64;
			field239 = var1 * 64;
			field1110 = 8.0D;
			field2915 = 8.0D;
			field1009 = new int[FloType.field2923 + 1];
			field760 = (var4 - var2) * 64 + 64;
			SeqType.field1988 = (var3 + 1 - var1) * 64;
			int var7 = client.field3679 + (client.localPlayer.field4121 >> 7) - field2181;
			int var8 = client.field4212 + (client.localPlayer.field4136 >> 7) - field239;
			int var9 = var8 + (int) (Math.random() * 10.0D) - 5;
			int var10 = var7 + (int) (Math.random() * 10.0D) - 5;
			int var11 = field760 >> 6;
			int var12 = SeqType.field1988 >> 6;
			field4052 = new byte[var12][var11][];
			field105 = new byte[var12][var11][];
			class105.field1912 = new int[var12][var11][];
			field1786 = new byte[var12][var11][];
			ClientMouseListener.field4166 = new byte[var12][var11][];
			int var13 = ClientBuild.field1270 >> 1;
			field2126 = new byte[var12][var11][];
			if (var9 >= 0 && var9 < SeqType.field1988 && var10 >= 0 && field760 > var10) {
				field3033 = field760 - var10;
				NpcType.field2330 = var9;
			} else {
				field3033 = field2181 + field760 - var6 * 64;
				NpcType.field2330 = var5 * 64 - field239;
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
			ClientBuild.method1085(client.worldmap.method960(field319, client.field570));
			field4276 = 30;
			GameShell.doneslowupdate();
		} else if (field4276 == 30) {
			method1029(client.worldmap.method960(field319, field325));
			field4276 = 50;
			GameShell.doneslowupdate();
		} else if (field4276 == 50) {
			method1473(client.worldmap.method960(field319, field4208));
			field4276 = 70;
			GameShell.doneslowupdate();
		} else if (field4276 == 70) {
			method937(client.worldmap.method960(field319, field3254));
			field4276 = 90;
			GameShell.doneslowupdate();
		} else {
			method658(client.worldmap.method960(field319, field404));
			if (field4276 == 90) {
				field175 = new class75(11, true, GameShell.canvas);
				field2147 = new class75(12, true, GameShell.canvas);
				field4397 = new class75(14, true, GameShell.canvas);
				field3762 = new class75(17, true, GameShell.canvas);
				field3205 = new class75(19, true, GameShell.canvas);
				field3199 = new class75(22, true, GameShell.canvas);
				field4325 = new class75(26, true, GameShell.canvas);
				field4250 = new class75(30, true, GameShell.canvas);
				field4276 = 100;
			}
			field3659 = -1;
			field4276 = 100;
			field594 = -1;
			GameShell.doneslowupdate();
			System.gc();
		}
	}

	@ObfuscatedName("rd.a(IIII)Z")
	public static boolean method1320(int arg0, int arg1, int arg2, int arg3) {
		if (World.method1581(arg0, arg1, arg2)) {
			int var4 = arg1 << 7;
			int var5 = arg2 << 7;
			return World.method718(var4 + 1, ClientBuild.field1137[arg0][arg1][arg2] + arg3, var5 + 1) && World.method718(var4 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && World.method718(var4 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && World.method718(var4 + 1, ClientBuild.field1137[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("si.a(BLq;)Lq;")
	public static IfType method1413(IfType arg0) {
		if (arg0.field3504 != -1) {
			return client.method1579(arg0.field3504);
		}
		int var1 = arg0.parentId >>> 16;
		for (class168 var2 = (class168) field2395.method1047(); var2 != null; var2 = (class168) field2395.method1048()) {
			if (var1 == var2.field3229) {
				return client.method1579((int) var2.key);
			}
		}
		return null;
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
		class244 var1 = method207(arg0);
		return var1 == null ? field1113 : var1.field4486;
	}

	@ObfuscatedName("og.a(IB)Z")
	public static boolean method1070(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("og.b(II)[B")
	public static byte[] method1072(int arg0) {
		class189 var1 = (class189) field388.method665((long) arg0);
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
			var1 = new class189(var2);
			field388.method663((long) arg0, var1);
		}
		return var1.field3658;
	}

	@ObfuscatedName("og.c(II)V")
	public static void method1073(int arg0) {
		BZip2State.field3145 = 1000 / arg0;
	}

	@ObfuscatedName("ke.d(I)V")
	public static void method779() {
		try {
			if (field2414 == null) {
				field2414 = new class3(GameShell.signlink, JagString.join(new JagString[] { field3983, method1212(client.lang), field915}).method606());
			} else {
				byte[] var0 = field2414.method12();
				if (var0 != null) {
					Packet var1 = new Packet(var0);
					field1895 = var1.g2();
					field3845 = new class70[field1895];
					for (int var2 = 0; var2 < field1895; var2++) {
						class70 var3 = field3845[var2] = new class70();
						int var4 = var1.g2();
						var3.field1261 = var4 & 0x7FFF;
						var3.field1257 = (var4 & 0x8000) != 0;
						var3.field1262 = var1.gjstr();
						var3.field1255 = var1.method334();
						var3.field1258 = var2;
						var3.field1260 = method528(var1.g2());
					}
					method1143(0, field3845, field3845.length - 1);
					TitleScreen.field3959 = true;
					field2414 = null;
				}
			}
		} catch (Exception var6) {
			var6.printStackTrace();
			field2414 = null;
		}
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

	@ObfuscatedName("na.a(ZI)V")
	public static void method934() {
		byte[][] var0 = field3221;
		int var1 = var0.length;
		for (int var2 = 0; var2 < var1; var2++) {
			int var3 = (field2731[var2] >> 8) * 64 - client.field4212;
			byte[] var4 = var0[var2];
			int var5 = (field2731[var2] & 0xFF) * 64 - client.field3679;
			if (var4 != null) {
				client.method1479();
				ClientBuild.method963(client.field2014 * 8 - 48, var3, (client.mapBuildCentreZoneX - 6) * 8, client.collision, var5, var4);
			}
		}
		for (int var6 = 0; var6 < var1; var6++) {
			int var7 = (field2731[var6] >> 8) * 64 - client.field4212;
			int var8 = (field2731[var6] & 0xFF) * 64 - client.field3679;
			byte[] var9 = var0[var6];
			if (var9 == null && client.field2014 < 800) {
				client.method1479();
				for (int var10 = 0; var10 < 4; var10++) {
					ClientBuild.method83(var10, 64, 64, var8, var7);
				}
			}
		}
	}

	@ObfuscatedName("na.a([BB)V")
	public static void method937(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = arg0[var1++] * 64 - field239;
				int var3 = arg0[var1++] * 64 - field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < SeqType.field1988 && var3 + 64 < field760) {
					int var7 = var2 >> 6;
					int var8 = field760 - var3 - 1 >> 6;
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
									LocType var15 = LocType.method1321(var14);
									if (var15.field2770 != null) {
										var15 = var15.method998();
										if (var15 == null || var15.field2817 == -1) {
											continue;
										}
									}
									field895[var7][var8][(-(var10 + 1) << 6) + var9] = var15.field2831 + 1;
									class65 var16 = new class65();
									var16.field1175 = field760 - var3;
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

	@ObfuscatedName("na.a(BLea;)Lje;")
	public static class103 method936(Packet arg0) {
		return new class103(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("oa.a(IIBIIIIIII)V")
	public static void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg0 == arg7 && arg4 == arg3 && arg8 == arg2 && arg6 == arg5) {
			class105.method723(arg7, arg5, arg1, arg4, arg2);
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
			class105.method723(var9, var33, arg1, var10, var32);
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

	@ObfuscatedName("of.a(ZIII)V")
	public static void method1064(int arg0, int arg1, int arg2) {
		IfType var3 = method238(arg2, arg0);
		if (var3 != null && var3.field3447 != null) {
			HookReq var4 = new HookReq();
			var4.field678 = var3;
			var4.field681 = var3.field3447;
			ScriptRunner.method1373(var4);
		}
		field145 = true;
		client.field569 = arg2;
		field2084 = arg1;
		field249 = arg0;
		client.method1371(var3);
	}

	@ObfuscatedName("of.a(IIII)I")
	public static int method1066(int arg0, int arg1, int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
	}

	@ObfuscatedName("of.a(ZIZ)I")
	public static int method1067() {
		return Js5Net.field3943 + Js5Net.field3876;
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

	@ObfuscatedName("vh.a(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1574(String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
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

	@ObfuscatedName("nb.a(JII[I)Li;")
	public static JagString method952(long arg0, int arg1, int[] arg2) {
		if (QuickChatPhraseTypeList.field4527 != null) {
			JagString var4 = QuickChatPhraseTypeList.field4527.method1126(arg2, arg1, arg0);
			if (var4 != null) {
				return var4;
			}
		}
		return arg1 == 5 ? method1375(arg0).method614() : method1556(arg0);
	}

	@ObfuscatedName("nb.f(II)Li;")
	public static JagString method958(int arg0) {
		JagString var1 = method1212(arg0);
		for (int var2 = var1.method604() - 3; var2 > 0; var2 -= 3) {
			var1 = JagString.join(new JagString[] { var1.method623(0, var2), field979, var1.method635(var2) });
		}
		if (var1.method604() > 9) {
			return JagString.join(new JagString[] { field2828, var1.method623(0, var1.method604() - 8), Text.field2469, field1238, var1, field3982});
		} else if (var1.method604() > 6) {
			return JagString.join(new JagString[] {field644, var1.method623(0, var1.method604() - 4), Text.field3071, field1238, var1, field3982});
		} else {
			return JagString.join(new JagString[] {field1370, var1, field2199});
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
		if (!class105.method726(arg1, method530(arg0)) && arg0.field3401 == null) {
			return null;
		} else if (arg0.field3373 == null || arg1 >= arg0.field3373.length || arg0.field3373[arg1] == null || arg0.field3373[arg1].method602().method604() == 0) {
			return client.field2103 ? JagString.join(new JagString[] {field1802, method1212(arg1) }) : null;
		} else {
			return arg0.field3373[arg1];
		}
	}

	@ObfuscatedName("sh.a(IIIIIII)V")
	public static void method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (client.field475 == 0 && !field145) {
			int var6 = field2766;
			int var7 = field2931;
			int var8 = field1102;
			int var9 = field4055;
			int var10 = var8 + (var9 - var8) * (arg0 - arg4) / arg2;
			int var11 = var6 + (var7 - var6) * (arg5 - arg1) / arg3;
			class98.method685(var11, ParamType.field54, (short) 10, 0L, client.field3453, var10);
		}
		long var12 = -1L;
		for (int var14 = 0; var14 < SoftwareModelLit.field3101; var14++) {
			long var15 = SoftwareModelLit.field476[var14];
			int var17 = (int) var15 & 0x7F;
			int var18 = (int) var15 >> 7 & 0x7F;
			int var19 = (int) var15 >> 29 & 0x3;
			int var20 = Integer.MAX_VALUE & (int) (var15 >>> 32);
			if (var15 != var12) {
				var12 = var15;
				if (var19 == 2 && World.method1386(client.field2907, var17, var18, var15)) {
					LocType var21 = LocType.method1321(var20);
					if (var21.field2770 != null) {
						var21 = var21.method998();
					}
					if (var21 == null) {
						continue;
					}
					if (client.field475 == 1) {
						class98.method685(var17, Text.field608, (short) 26, var15, JagString.join(new JagString[] { client.field1414, field3526, var21.field2773 }), var18);
					} else if (!field145) {
						JagString[] var22 = var21.field2816;
						if (field1807) {
							var22 = method921(var22);
						}
						if (var22 != null) {
							for (int var23 = 4; var23 >= 0; var23--) {
								if (var22[var23] != null) {
									short var24 = 0;
									if (var23 == 0) {
										var24 = 7;
									}
									if (var23 == 1) {
										var24 = 35;
									}
									if (var23 == 2) {
										var24 = 51;
									}
									if (var23 == 3) {
										var24 = 33;
									}
									if (var23 == 4) {
										var24 = 1004;
									}
									class98.method685(var17, var22[var23], var24, var15, JagString.join(new JagString[] {field259, var21.field2773 }), var18);
								}
							}
						}
						class98.method685(var17, Text.field1174, (short) 1005, (long) var21.field2831, JagString.join(new JagString[] {field259, var21.field2773 }), var18);
					} else if ((field2084 & 0x4) == 4) {
						class98.method685(var17, field3835, (short) 24, var15, JagString.join(new JagString[] {field464, field3526, var21.field2773 }), var18);
					}
				}
				if (var19 == 1) {
					class191 var25 = client.field4223[var20];
					if (var25.field3682.field2349 == 1 && (var25.field4136 & 0x7F) == 64 && (var25.field4121 & 0x7F) == 64) {
						for (int var26 = 0; var26 < field1041; var26++) {
							class191 var27 = client.field4223[field402[var26]];
							if (var27 != null && var25 != var27 && var27.field3682.field2349 == 1 && var25.field4136 == var27.field4136 && var25.field4121 == var27.field4121) {
								client.method1513(var27.field3682, field402[var26], var18, var17);
							}
						}
						for (int var28 = 0; var28 < client.field1027; var28++) {
							ClientPlayer var29 = client.field4491[client.field3428[var28]];
							if (var29 != null && var25.field4136 == var29.field4136 && var29.field4121 == var25.field4121) {
								method922(client.field3428[var28], var17, var18, var29);
							}
						}
					}
					client.method1513(var25.field3682, var20, var18, var17);
				}
				if (var19 == 0) {
					ClientPlayer var30 = client.field4491[var20];
					if ((var30.field4136 & 0x7F) == 64 && (var30.field4121 & 0x7F) == 64) {
						for (int var31 = 0; var31 < field1041; var31++) {
							class191 var32 = client.field4223[field402[var31]];
							if (var32 != null && var32.field3682.field2349 == 1 && var32.field4136 == var30.field4136 && var32.field4121 == var30.field4121) {
								client.method1513(var32.field3682, field402[var31], var18, var17);
							}
						}
						for (int var33 = 0; var33 < client.field1027; var33++) {
							ClientPlayer var34 = client.field4491[client.field3428[var33]];
							if (var34 != null && var34 != var30 && var34.field4136 == var30.field4136 && var34.field4121 == var30.field4121) {
								method922(client.field3428[var33], var17, var18, var34);
							}
						}
					}
					method922(var20, var17, var18, var30);
				}
				if (var19 == 3) {
					LinkList var35 = client.field2497[client.field2907][var17][var18];
					if (var35 != null) {
						for (class227 var36 = (class227) var35.method1612(); var36 != null; var36 = (class227) var35.method1617()) {
							int var37 = var36.field4258.field2030;
							ObjType var38 = ObjType.list(var37);
							if (client.field475 == 1) {
								class98.method685(var17, Text.field608, (short) 46, (long) var37, JagString.join(new JagString[] { client.field1414, field581, var38.field2892 }), var18);
							} else if (!field145) {
								JagString[] var39 = var38.field2898;
								if (field1807) {
									var39 = method921(var39);
								}
								for (int var40 = 4; var40 >= 0; var40--) {
									if (var39 != null && var39[var40] != null) {
										byte var41 = 0;
										if (var40 == 0) {
											var41 = 5;
										}
										if (var40 == 1) {
											var41 = 22;
										}
										if (var40 == 2) {
											var41 = 41;
										}
										if (var40 == 3) {
											var41 = 57;
										}
										if (var40 == 4) {
											var41 = 3;
										}
										class98.method685(var17, var39[var40], var41, (long) var37, JagString.join(new JagString[] { field2529, var38.field2892 }), var18);
									} else if (var40 == 2) {
										class98.method685(var17, Text.field4343, (short) 41, (long) var37, JagString.join(new JagString[] { field2529, var38.field2892 }), var18);
									}
								}
								class98.method685(var17, Text.field1174, (short) 1006, (long) var37, JagString.join(new JagString[] { field2529, var38.field2892 }), var18);
							} else if ((field2084 & 0x1) == 1) {
								class98.method685(var17, field3835, (short) 25, (long) var37, JagString.join(new JagString[] {field464, field581, var38.field2892 }), var18);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("u.a([BI)V")
	public static void method1473(byte[] arg0) {
		int var1 = 0;
		while (true) {
			while (var1 < arg0.length) {
				int var2 = (arg0[var1++] & 0xFF) * 64 - field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - field2181;
				if (var2 > 0 && var3 > 0 && var2 + 64 < SeqType.field1988 && field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = field760 - var3 - 1 >> 6;
					for (int var6 = 0; var6 < 64; var6++) {
						for (int var7 = -64; var7 < 0; var7++) {
							byte var8 = arg0[var1++];
							if (var8 != 0) {
								if (field3951[var4][var5] == null) {
									field3951[var4][var5] = new byte[4096];
								}
								field3951[var4][var5][(-(var7 + 1) << 6) + var6] = var8;
								byte var9 = arg0[var1++];
								if (ClientMouseListener.field4166[var4][var5] == null) {
									ClientMouseListener.field4166[var4][var5] = new byte[4096];
								}
								ClientMouseListener.field4166[var4][var5][(-(var7 + 1) << 6) + var6] = var9;
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
				class86.method580(arg4, arg1, arg3, arg0);
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
			class105.method723(var11, var10, arg4, var12, var9);
		}
	}

	@ObfuscatedName("v.b(II)Z")
	public static boolean method1526(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("pg.f(II)Li;")
	public static JagString method1212(int arg0) {
		return method1481(false, arg0);
	}

	@ObfuscatedName("oi.a(III)J")
	public static long method1082(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null || var3.field956 == null ? 0L : var3.field956.field1158;
	}

	@ObfuscatedName("sd.a(JB)Li;")
	public static JagString method1375(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			long var3 = arg0;
			while (var3 != 0L) {
				var3 /= 37L;
				var2++;
			}
			byte[] var5 = new byte[var2];
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				var2--;
				var5[var2] = field1008[(int) (var6 - arg0 * 37L)];
			}
			JagString var8 = new JagString();
			var8.chars = var5;
			var8.length = var5.length;
			return var8;
		}
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

	@ObfuscatedName("ne.a(I)I")
	public static int method984() {
		return ClientMouseListener.field3668;
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

	@ObfuscatedName("oe.a(III)J")
	public static long method1062(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null || var3.field959 == null ? 0L : var3.field959.field3028;
	}

	@ObfuscatedName("sc.a(IJ)V")
	public static void method1365(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}

	@ObfuscatedName("sc.d(I)V")
	public static void method1370() {
		for (class242 var0 = (class242) client.field714.head(); var0 != null; var0 = (class242) client.field714.method1619()) {
			class18 var1 = var0.field4474;
			if (var1.field292 != client.field2907 || var1.field302) {
				var0.unlink();
			} else if (var1.field287 <= client.field2113) {
				var1.method90(client.field261);
				if (var1.field302) {
					var0.unlink();
				} else {
					World.method859(var1.field292, var1.field296, var1.field290, var1.field295, 60, var1, 0, -1L, false);
				}
			}
		}
	}

	@ObfuscatedName("ib.a(III)V")
	public static void method656(int arg0, int arg1) {
		int[] var2 = new int[4];
		int var3 = 1;
		int[] var4 = new int[4];
		var4[0] = arg0;
		var2[0] = arg1;
		for (int var5 = 0; var5 < 4; var5++) {
			if (arg0 != field461[var5]) {
				var4[var3] = field461[var5];
				var2[var3] = field1686[var5];
				var3++;
			}
		}
		field1686 = var2;
		field461 = var4;
		method1143(0, field3845, field3845.length - 1);
	}

	@ObfuscatedName("ib.a([BB)V")
	public static void method658(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g2();
		for (int var3 = 0; var3 < var2; var3++) {
			class244 var4 = new class244();
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
		for (class159 var0 = (class159) client.field1140.head(); var0 != null; var0 = (class159) client.field1140.method1619()) {
			if (var0.field3061 == -1) {
				var0.field3054 = 0;
				method1219(var0);
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
			SeqType.method745(arg2, arg3, arg1, arg0);
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

	@ObfuscatedName("mg.a([Li;B)[Li;")
	public static JagString[] method921(JagString[] arg0) {
		JagString[] var1 = new JagString[5];
		for (int var2 = 0; var2 < 5; var2++) {
			var1[var2] = JagString.join(new JagString[] { method1212(var2), field3306});
			if (arg0 != null && arg0[var2] != null) {
				var1[var2] = JagString.join(new JagString[] { var1[var2], arg0[var2] });
			}
		}
		return var1;
	}

	@ObfuscatedName("rg.a(III)I")
	public static int method1330(int arg0, int arg1) {
		int var2 = arg0 * 57 + arg1;
		int var3 = var2 << 13 ^ var2;
		int var4 = Integer.MAX_VALUE & var3 * (var3 * var3 * 15731 + 789221) + 1376312589;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("rg.a()V")
	public static void method1331() {
		int var0 = World.field1148[field2993];
		class13[] var1 = World.field1149[field2993];
		field1316 = 0;
		label187: for (int var2 = 0; var2 < var0; var2++) {
			class13 var3 = var1[var2];
			if (field4510 != null) {
				for (int var4 = 0; var4 < field4510.length; var4++) {
					if (field4510[var4] != -1000000 && (var3.field189 <= field4510[var4] || var3.field196 <= field4510[var4]) && (var3.field185 <= field3605[var4] || var3.field193 <= field3605[var4]) && (var3.field185 >= field740[var4] || var3.field193 >= field740[var4]) && (var3.field191 <= field2713[var4] || var3.field205 <= field2713[var4]) && (var3.field191 >= field3882[var4] || var3.field205 >= field3882[var4])) {
						continue label187;
					}
				}
			}
			if (var3.field190 == 1) {
				int var5 = var3.field204 + World.field2911 - field1435;
				if (var5 >= 0 && var5 <= World.field2911 + World.field2911) {
					int var6 = var3.field187 + World.field2911 - field1636;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = var3.field200 + World.field2911 - field1636;
					if (var7 > World.field2911 + World.field2911) {
						var7 = World.field2911 + World.field2911;
					}
					boolean var8 = false;
					while (var6 <= var7) {
						if (World.field304[var5][var6++]) {
							var8 = true;
							break;
						}
					}
					if (var8) {
						int var9 = World.field1353 - var3.field185;
						if (var9 > 32) {
							var3.field206 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}
							var3.field206 = 2;
							var9 = -var9;
						}
						var3.field199 = (var3.field191 - World.field4048 << 8) / var9;
						var3.field186 = (var3.field205 - World.field4048 << 8) / var9;
						var3.field188 = (var3.field189 - World.field4461 << 8) / var9;
						var3.field201 = (var3.field196 - World.field4461 << 8) / var9;
						field3075[field1316++] = var3;
					}
				}
			} else if (var3.field190 == 2) {
				int var10 = var3.field187 + World.field2911 - field1636;
				if (var10 >= 0 && var10 <= World.field2911 + World.field2911) {
					int var11 = var3.field204 + World.field2911 - field1435;
					if (var11 < 0) {
						var11 = 0;
					}
					int var12 = var3.field194 + World.field2911 - field1435;
					if (var12 > World.field2911 + World.field2911) {
						var12 = World.field2911 + World.field2911;
					}
					boolean var13 = false;
					while (var11 <= var12) {
						if (World.field304[var11++][var10]) {
							var13 = true;
							break;
						}
					}
					if (var13) {
						int var14 = World.field4048 - var3.field191;
						if (var14 > 32) {
							var3.field206 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}
							var3.field206 = 4;
							var14 = -var14;
						}
						var3.field197 = (var3.field185 - World.field1353 << 8) / var14;
						var3.field195 = (var3.field193 - World.field1353 << 8) / var14;
						var3.field188 = (var3.field189 - World.field4461 << 8) / var14;
						var3.field201 = (var3.field196 - World.field4461 << 8) / var14;
						field3075[field1316++] = var3;
					}
				}
			} else if (var3.field190 == 4) {
				int var15 = var3.field189 - World.field4461;
				if (var15 > 128) {
					int var16 = var3.field187 + World.field2911 - field1636;
					if (var16 < 0) {
						var16 = 0;
					}
					int var17 = var3.field200 + World.field2911 - field1636;
					if (var17 > World.field2911 + World.field2911) {
						var17 = World.field2911 + World.field2911;
					}
					if (var16 <= var17) {
						int var18 = var3.field204 + World.field2911 - field1435;
						if (var18 < 0) {
							var18 = 0;
						}
						int var19 = var3.field194 + World.field2911 - field1435;
						if (var19 > World.field2911 + World.field2911) {
							var19 = World.field2911 + World.field2911;
						}
						boolean var20 = false;
						label159: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (World.field304[var21][var22]) {
									var20 = true;
									break label159;
								}
							}
						}
						if (var20) {
							var3.field206 = 5;
							var3.field197 = (var3.field185 - World.field1353 << 8) / var15;
							var3.field195 = (var3.field193 - World.field1353 << 8) / var15;
							var3.field199 = (var3.field191 - World.field4048 << 8) / var15;
							var3.field186 = (var3.field205 - World.field4048 << 8) / var15;
							field3075[field1316++] = var3;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rg.b(III)Loe;")
	public static class157 method1332(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null ? null : var3.field959;
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
		if (class245.field4500 == null) {
			SoftwarePix32 var4 = new SoftwarePix32(arg2, arg3);
			Pix2D.method496(var4.field3247, arg2, arg3);
			method348(arg3, arg2, 0, 0, field760, 0, SeqType.field1988, 0);
			class245.field4500 = var4;
			GameShell.field3852.method1521();
		}
		class245.field4500.method1161(arg1, arg0);
		int var5 = arg1 + field693 * arg2 / SeqType.field1988;
		int var6 = field1309 * arg2 / SeqType.field1988;
		int var7 = arg0 + field727 * arg3 / field760;
		int var8 = field3136 * arg3 / field760;
		Pix2D.fillRectTrans(var5, var7, var6, var8, 16711680, 128);
		Pix2D.method476(var5, var7, var6, var8, 16711680);
		if (field1012 <= 0 || field1012 % 10 >= 5) {
			return;
		}
		for (class65 var9 = (class65) field4359.head(); var9 != null; var9 = (class65) field4359.method1619()) {
			if (var9.field1180 == field772) {
				int var10 = arg1 + arg2 * var9.field1179 / SeqType.field1988;
				int var11 = var9.field1175 * arg3 / field760 + arg0;
				Pix2D.method478(var10 - 2, var11 + -2, 4, 4, 16776960);
			}
		}
	}

	@ObfuscatedName("nd.a(III)V")
	public static void method974(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		if (var3 == null) {
			return;
		}
		for (int var4 = 0; var4 < var3.field962; var4++) {
			class108 var5 = var3.field963[var4];
			if ((var5.field1948 >> 29 & 0x3L) == 2L && var5.field1933 == arg1 && var5.field1936 == arg2) {
				ClientStream.method915(var5);
				return;
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

	@ObfuscatedName("lf.a(IIIILnc;IJIIII)Z")
	public static boolean method855(int arg0, int arg1, int arg2, int arg3, ModelSource arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
		return arg4 == null ? true : World.method768(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@ObfuscatedName("re.a(ZZ)V")
	public static void method1327() {
		byte[][] var0 = field774;
		int var1 = field3221.length;
		for (int var2 = 0; var2 < var1; var2++) {
			byte[] var3 = var0[var2];
			if (var3 != null) {
				int var4 = (field2731[var2] >> 8) * 64 - client.field4212;
				int var5 = (field2731[var2] & 0xFF) * 64 - client.field3679;
				client.method1479();
				ClientBuild.method85(client.collision, var3, var4, var5);
			}
		}
	}

	@ObfuscatedName("re.b(I)V")
	public static void method1328() {
		if (client.lowMem && client.field2907 != client.field3026) {
			client.method820(client.field2907, client.localPlayer.field4141[0], client.mapBuildCentreZoneX, client.field2014, client.localPlayer.field4087[0]);
		} else if (client.field2907 != client.field3336) {
			client.field3336 = client.field2907;
			ClientBuild.method1595(client.field2907);
		}
	}

	@ObfuscatedName("sg.a(IIIII)Z")
	public static boolean method1389(int arg0, int arg1, int arg2, int arg3) {
		int var4 = arg3 * field3242 + arg0 * field3066 >> 16;
		int var5 = arg3 * field3066 - arg0 * field3242 >> 16;
		int var6 = arg1 * field1803 + var5 * field3838 >> 16;
		int var7 = arg1 * field3838 - var5 * field1803 >> 16;
		if (var6 < 1) {
			var6 = 1;
		}
		int var8 = (var4 << 9) / var6;
		int var9 = (var7 << 9) / var6;
		int var10 = arg2 * field1803 + var5 * field3838 >> 16;
		int var11 = arg2 * field3838 - var5 * field1803 >> 16;
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

	@ObfuscatedName("eb.a(IIIIIIII)V")
	public static void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = 2048 - arg2 & 0x7FF;
		int var8 = 0;
		int var9 = 0;
		int var10 = arg4;
		int var11 = 2048 - arg3 & 0x7FF;
		if (var11 != 0) {
			int var12 = Pix3D.field3359[var11];
			int var13 = Pix3D.field3354[var11];
			var9 = var12 * -arg4 >> 16;
			var10 = var13 * arg4 >> 16;
		}
		if (var7 != 0) {
			int var14 = Pix3D.field3359[var7];
			int var15 = Pix3D.field3354[var7];
			var8 = var10 * var14 >> 16;
			var10 = var15 * var10 >> 16;
		}
		client.field1954 = arg1 - var9;
		client.field1428 = arg0 - var8;
		client.field3608 = arg6 - var10;
		client.field3257 = arg2;
		client.field3934 = arg3;
	}

	@ObfuscatedName("eb.e(I)V")
	public static void method363() {
		if (!field145) {
			return;
		}
		IfType var0 = method238(client.field569, field249);
		if (var0 != null && var0.field3440 != null) {
			HookReq var1 = new HookReq();
			var1.field678 = var0;
			var1.field681 = var0.field3440;
			ScriptRunner.method1373(var1);
		}
		field145 = false;
		client.method1371(var0);
	}

	@ObfuscatedName("se.a(I)V")
	public static void method1378() {
		field4052 = null;
		ClientMouseListener.field4166 = null;
		class105.field1912 = null;
		field105 = null;
		field2126 = null;
		field1786 = null;
		field3951 = null;
		field1706 = null;
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
		class245.field4500 = null;
		field3762 = null;
	}

	@ObfuscatedName("fa.a(IIIII)I")
	public static int method419(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.field3354[arg2 * 1024 / arg0] >> 1;
		return (arg1 * (65536 - var4) >> 16) + (arg3 * var4 >> 16);
	}

	@ObfuscatedName("ub.a(IIIIIIIIII)V")
	public static void method1486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class159 var9 = null;
		for (class159 var10 = (class159) client.field1140.head(); var10 != null; var10 = (class159) client.field1140.method1619()) {
			if (arg6 == var10.field3055 && arg7 == var10.field3059 && var10.field3052 == arg1 && var10.field3063 == arg2) {
				var9 = var10;
				break;
			}
		}
		if (var9 == null) {
			var9 = new class159();
			var9.field3052 = arg1;
			var9.field3063 = arg2;
			var9.field3059 = arg7;
			var9.field3055 = arg6;
			method1219(var9);
			client.field1140.push(var9);
		}
		var9.field3062 = arg5;
		var9.field3068 = arg3;
		var9.field3061 = arg4;
		var9.field3051 = arg8;
		var9.field3054 = arg0;
	}

	@ObfuscatedName("ig.a(ILea;)Lc;")
	public static TextureOp method674(Packet arg0) {
		arg0.g1();
		int var1 = arg0.g1();
		TextureOp var2 = TextureOp.method1552(var1);
		var2.field363 = arg0.g1();
		int var3 = arg0.g1();
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = arg0.g1();
			var2.method11(arg0, var5);
		}
		var2.method123();
		return var2;
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

	@ObfuscatedName("lj.b(II)Lli;")
	public static class129 method878(int arg0) {
		class129 var1 = (class129) SeqType.field3989.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class129 var2 = method309(SeqType.field2778, arg0, SeqType.field2624);
		if (var2 != null) {
			SeqType.field3989.method663((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("lj.a(BLi;)V")
	public static void method879(JagString arg0) {
		class244 var1 = method207(arg0);
		if (var1 == null) {
			return;
		}
		field594 = field760 + field2181 - var1.field4485;
		field3659 = var1.field4483 - field239;
		int var2 = field594 - (int) ((double) field1706.field3422 / field1110);
		int var3 = field3659 - (int) ((double) field1706.field3380 / field1110);
		int var4 = field3659 + (int) ((double) field1706.field3380 / field1110);
		if (var3 < 0) {
			field3659 = (int) ((double) field1706.field3380 / field1110);
		}
		int var5 = (int) ((double) field1706.field3422 / field1110) + field594;
		if (var4 > SeqType.field1988) {
			field3659 = SeqType.field1988 - (int) ((double) field1706.field3380 / field1110);
		}
		if (var2 < 0) {
			field594 = (int) ((double) field1706.field3422 / field1110);
		}
		if (var5 > field760) {
			field594 = field760 - (int) ((double) field1706.field3422 / field1110);
		}
	}

	@ObfuscatedName("ki.a(III)V")
	public static void method802(int arg0, int arg1) {
		if (field1276 != arg0) {
			field351 = new int[arg0];
			for (int var2 = 0; var2 < arg0; var2++) {
				field351[var2] = (var2 << 12) / arg0;
			}
			field738 = arg0 == 64 ? 2048 : 4096;
			field1276 = arg0;
			field789 = arg0 - 1;
		}
		if (arg1 == field460) {
			return;
		}
		if (field1276 == arg1) {
			class111.field2021 = field351;
		} else {
			class111.field2021 = new int[arg1];
			for (int var3 = 0; var3 < arg1; var3++) {
				class111.field2021[var3] = (var3 << 12) / arg1;
			}
		}
		field460 = arg1;
		ClientMouseListener.field4158 = arg1 - 1;
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

	@ObfuscatedName("kj.a(IBLbj;)V")
	public static void method814(int arg0, Js5Loader arg1) {
		if (Js5Net.field1427 == null) {
			method1312(null, 255, 255, (byte) 0, 0, true);
			Js5Net.field141[arg0] = arg1;
		} else {
			Js5Net.field1427.pos = arg0 * 8 + 5;
			int var2 = Js5Net.field1427.g4();
			int var3 = Js5Net.field1427.g4();
			arg1.method109(var2, var3);
		}
	}

	@ObfuscatedName("kj.a([IIIIII)V")
	public static void method815(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		class52 var5 = World.field489[arg2][arg3][arg4];
		if (var5 == null) {
			return;
		}
		QuickGround var6 = var5.field947;
		if (var6 != null) {
			int var7 = var6.field1772;
			if (var7 != 0) {
				for (int var8 = 0; var8 < 4; var8++) {
					arg0[arg1] = var7;
					arg0[arg1 + 1] = var7;
					arg0[arg1 + 2] = var7;
					arg0[arg1 + 3] = var7;
					arg1 += 512;
				}
			}
			return;
		}
		Ground var9 = var5.field964;
		if (var9 == null) {
			return;
		}
		int var10 = var9.field1065;
		int var11 = var9.field1066;
		int var12 = var9.field1061;
		int var13 = var9.field1067;
		int[] var14 = field4232[var10];
		int[] var15 = field248[var11];
		int var16 = 0;
		if (var12 != 0) {
			for (int var17 = 0; var17 < 4; var17++) {
				arg0[arg1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg1 += 512;
			}
			return;
		}
		for (int var18 = 0; var18 < 4; var18++) {
			if (var14[var15[var16++]] != 0) {
				arg0[arg1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 2] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 3] = var13;
			}
			arg1 += 512;
		}
	}

	@ObfuscatedName("client.a(IIIIII)Z")
	public static boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var8 = arg1; var8 <= arg2; var8++) {
				for (int var9 = arg3; var9 <= arg4; var9++) {
					if (World.field4429[arg0][var8][var9] == -World.field2627) {
						return false;
					}
				}
			}
			int var10 = (arg1 << 7) + 1;
			int var11 = (arg3 << 7) + 2;
			int var12 = ClientBuild.field1137[arg0][arg1][arg3] + arg5;
			if (!World.method718(var10, var12, var11)) {
				return false;
			}
			int var13 = (arg2 << 7) - 1;
			if (!World.method718(var13, var12, var11)) {
				return false;
			}
			int var14 = (arg4 << 7) - 1;
			if (!World.method718(var10, var12, var14)) {
				return false;
			} else if (World.method718(var13, var12, var14)) {
				return true;
			} else {
				return false;
			}
		} else if (World.method1581(arg0, arg1, arg3)) {
			int var6 = arg1 << 7;
			int var7 = arg3 << 7;
			return World.method718(var6 + 1, ClientBuild.field1137[arg0][arg1][arg3] + arg5, var7 + 1) && World.method718(var6 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && World.method718(var6 + 128 - 1, ClientBuild.field1137[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && World.method718(var6 + 1, ClientBuild.field1137[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nf.a(Lia;IIIIII)V")
	public static void method989(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		long var6 = 0L;
		if (arg3 == 0) {
			var6 = method1062(arg4, arg1, arg5);
		}
		if (arg3 == 1) {
			var6 = method1082(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			var6 = method770(arg4, arg1, arg5);
		}
		if (arg3 == 3) {
			var6 = method501(arg4, arg1, arg5);
		}
		if ((long) 0 == var6) {
			return;
		}
		int var8 = (int) var6 >> 14 & 0x1F;
		int var9 = (int) var6 >> 20 & 0x3;
		int var10 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
		LocType var11 = LocType.method1321(var10);
		if (arg3 == 0) {
			World.method56(arg4, arg1, arg5);
			if (var11.field2819 != 0) {
				arg0.method655(var11.field2789, var8, var9, arg5, arg1);
			}
		}
		if (arg3 == 1) {
			World.method42(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			method974(arg4, arg1, arg5);
			if (var11.field2819 != 0 && var11.field2774 + arg1 < 104 && var11.field2774 + arg5 < 104 && var11.field2794 + arg1 < 104 && arg5 + var11.field2794 < 104) {
				arg0.method642(arg1, var11.field2789, var9, arg5, var11.field2794, var11.field2774);
			}
		}
		if (arg3 != 3) {
			return;
		}
		method1419(arg4, arg1, arg5);
		if (var11.field2819 == 1) {
			arg0.method654(arg1, arg5);
			return;
		}
	}

	@ObfuscatedName("nf.a(IIIIIII)V")
	public static void method993(int arg0, int arg1, int arg2, int arg3) {
		class118[] var4 = field1171;
		for (int var5 = 0; var5 < var4.length; var5++) {
			class118 var6 = var4[var5];
			if (var6 != null && var6.field2139 == 2) {
				client.method681(arg2 >> 1, var6.field2151 * 2, (var6.field2138 - client.field4212 << 7) + var6.field2134, arg3 >> 1, var6.field2150 + (var6.field2135 - client.field3679 << 7));
				if (client.field401 > -1 && client.field2113 % 20 < 10) {
					StructType.field3543[var6.field2137].method1155(arg0 + client.field401 - 12, client.field541 + (arg1 - 28));
				}
			}
		}
	}

	@ObfuscatedName("t.b(III)V")
	public static void method1419(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		if (var3 != null) {
			var3.field949 = null;
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

	@ObfuscatedName("ng.a(ILjava/lang/Object;Lqg;)V")
	public static void method1006(Object arg0, SignLink arg1) {
		if (arg1.field3592 == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && arg1.field3592.peekEvent() != null; var2++) {
			ThreadUtil.sleepPrecise(1L);
		}
		if (arg0 != null) {
			arg1.field3592.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("ng.c(II)Z")
	public static boolean method1017(int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@ObfuscatedName("ng.c(ZI)V")
	public static void method1023(boolean arg0) {
		for (int var1 = 0; var1 < field1041; var1++) {
			class191 var2 = client.field4223[field402[var1]];
			long var3 = (long) field402[var1] << 32 | 0x20000000L;
			if (var2 != null && var2.method287() && arg0 == var2.field3682.field2363 && var2.field3682.method852()) {
				int var5 = var2.field4136 >> 7;
				int var6 = var2.field4121 >> 7;
				if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
					if (var2.field4103 == 1 && (var2.field4136 & 0x7F) == 64 && (var2.field4121 & 0x7F) == 64) {
						if (field3990 == field2948[var5][var6]) {
							continue;
						}
						field2948[var5][var6] = field3990;
					}
					if (!var2.field3682.field2359) {
						var3 |= Long.MIN_VALUE;
					}
					var2.field4097 = client.method1584(var2.field4136 + (var2.field4103 - 1) * 64, var2.field4121 - (-(var2.field4103 * 64) + 64), client.field2907);
					World.method859(client.field2907, var2.field4136, var2.field4121, var2.field4097, (var2.field4103 - 1) * 64 + 60, var2, var2.field4085, var3, var2.field4093);
				}
			}
		}
	}

	@ObfuscatedName("ea.a(Lnb;ILnb;ZB)Lli;")
	public static class129 method309(Js5 arg0, int arg1, Js5 arg2) {
		boolean var3 = true;
		int[] var4 = arg2.method948(arg1);
		for (int var5 = 0; var5 < var4.length; var5++) {
			byte[] var6 = arg2.method947(var4[var5], arg1);
			if (var6 == null) {
				var3 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg0.method947(0, var7);
				if (var8 == null) {
					var3 = false;
				}
			}
		}
		if (!var3) {
			return null;
		}
		try {
			return new class129(arg2, arg0, arg1, false);
		} catch (Exception var9) {
			return null;
		}
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
		if (arg1.method953(class245.field4502)) {
			var2++;
		}
		if (arg1.method953(field2912)) {
			var2++;
		}
		arg1.method953(field209);
		arg1.method953(field119);
		arg1.method953(field1783);
		arg1.method953(field2195);
		arg1.method953(field4247);
		return var2;
	}

	@ObfuscatedName("ea.a(IIIBIIIII)V")
	public static void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var8 = arg6 - arg5;
		int var9 = arg4 - arg7;
		int var10 = (arg1 - arg2 << 16) / var8;
		if (SeqType.field1988 > arg6) {
			var8++;
		}
		int var11 = (arg0 - arg3 << 16) / var9;
		if (field760 > arg4) {
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
				int[][] var19 = class105.field1912[var18];
				byte[][] var20 = field1786[var18];
				byte[][] var21 = field105[var18];
				byte[][] var22 = ClientMouseListener.field4166[var18];
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
								var35 = field1009[field2489 + 1];
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
									class240.field4460[var63 - 1].method1338(var54, var62, var53 * 2 + 1, var59 * 2 + 1);
								} else {
									class240.field4460[var63 - 1].method1338(var54 - var53 / 2, var62 + -(var59 / 2), var53 * 2, var59 * 2);
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
								LocType var27 = LocType.method1321(var26 - 1);
								if (var12 && field772 == var27.field2817) {
									class65 var28 = new class65();
									var28.field1179 = var18;
									var28.field1180 = var27.field2817;
									var28.field1175 = var23;
									field783.push(var28);
								}
								field505[var27.field2817].method1155(var18 - 7, var23 + -7);
							}
						}
					}
				}
			}
		}
		if (field1110 == field2915) {
			for (class244 var29 = (class244) field3049.head(); var29 != null; var29 = (class244) field3049.method1619()) {
				int var30 = var29.field4483;
				int var31 = var30 - field239;
				int var32 = var29.field4485;
				int var33 = field2181 + field760 - var32;
				int var34 = arg1 + (arg2 - arg1) * (var31 - arg6) / (arg5 - arg6);
				int var35 = (var33 - arg4) * (arg3 - arg0) / (arg7 - arg4) + arg0;
				int var36 = var29.field4492;
				int var37 = 16777215;
				class75 var38 = null;
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
			field505[var44.field1180].method1155(var44.field1179 - 7, var44.field1175 + -7);
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

	@ObfuscatedName("ha.a(III)Lfh;")
	public static class64 method522(int arg0, int arg1, int arg2) {
		class52 var3 = World.field489[arg0][arg1][arg2];
		return var3 == null ? null : var3.field956;
	}

	@ObfuscatedName("ha.a(ZLea;I)Li;")
	public static JagString method524(Packet arg0) {
		try {
			JagString var1 = new JagString();
			var1.length = arg0.method350();
			if (var1.length > 32767) {
				var1.length = 32767;
			}
			var1.chars = new byte[var1.length];
			arg0.pos += field2033.method1457(0, var1.chars, arg0.data, var1.length, arg0.pos);
			return var1;
		} catch (Exception var2) {
			return field2918;
		}
	}

	@ObfuscatedName("ha.a(IZ)Li;")
	public static JagString method525(int arg0) {
		return client.field3836[arg0].method604() <= 0 ? client.field1191[arg0] : JagString.join(new JagString[] { client.field1191[arg0], Text.field4398, client.field3836[arg0] });
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
				int var2 = (arg0[var1++] & 0xFF) * 64 - field239;
				int var3 = (arg0[var1++] & 0xFF) * 64 - field2181;
				if (var2 > 0 && var3 > 0 && SeqType.field1988 > var2 + 64 && field760 > var3 + 64) {
					int var4 = var2 >> 6;
					int var5 = field760 - var3 - 1 >> 6;
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

	@ObfuscatedName("nh.a(IIIIILu;I)V")
	public static void method1027(int arg0, int arg1, int arg2, class218 arg3) {
		client.method681(arg1, arg2, arg3.field4136, arg0, arg3.field4121);
	}

	@ObfuscatedName("hd.a(Lea;I)Lsg;")
	public static class203 method538(Packet arg0) {
		return new class203(arg0.method334(), arg0.method334(), arg0.method334(), arg0.method334(), arg0.g3(), arg0.g1());
	}

	@ObfuscatedName("hd.a(Lbj;IILud;)V")
	public static void method540(Js5Loader arg0, int arg1, DataFile arg2) {
		byte[] var3 = null;
		LinkList var4 = Js5NetThread.requestQueue;
		synchronized (Js5NetThread.requestQueue) {
			for (Js5WorkerRequest var5 = (Js5WorkerRequest) Js5NetThread.requestQueue.head(); var5 != null; var5 = (Js5WorkerRequest) Js5NetThread.requestQueue.method1619()) {
				if (var5.key == (long) arg1 && arg2 == var5.fs && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.readFromFile(arg1);
			arg0.method111(var6, arg1, arg2, true);
		} else {
			arg0.method111(var3, arg1, arg2, true);
		}
	}

	@ObfuscatedName("hd.a([BBI)I")
	public static int method541(byte[] arg0, int arg1) {
		return Packet.getcrc(0, arg0, arg1);
	}

	@ObfuscatedName("hd.a(Leg;Z)V")
	public static void method542(class52 arg0, boolean arg1) {
		class105.field1900.push(arg0);
		while (true) {
			class52 var2;
			int var3;
			int var4;
			int var5;
			int var6;
			class52[][] var7;
			class52 var65;
			do {
				class52 var64;
				do {
					class52 var63;
					do {
						class52 var62;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var2 = (class52) class105.field1900.method1613();
												if (var2 == null) {
													return;
												}
											} while (!var2.field965);
											var3 = var2.field961;
											var4 = var2.field945;
											var5 = var2.field966;
											var6 = var2.field960;
											var7 = World.field489[var5];
											if (!var2.field944) {
												break;
											}
											if (arg1) {
												if (var5 > 0) {
													class52 var8 = World.field489[var5 - 1][var3][var4];
													if (var8 != null && var8.field965) {
														continue;
													}
												}
												if (var3 <= field1435 && var3 > field3007) {
													class52 var9 = var7[var3 - 1][var4];
													if (var9 != null && var9.field965 && (var9.field944 || (var2.field954 & 0x1) == 0)) {
														continue;
													}
												}
												if (var3 >= field1435 && var3 < PacketBit.field84 - 1) {
													class52 var10 = var7[var3 + 1][var4];
													if (var10 != null && var10.field965 && (var10.field944 || (var2.field954 & 0x4) == 0)) {
														continue;
													}
												}
												if (var4 <= field1636 && var4 > field1849) {
													class52 var11 = var7[var3][var4 - 1];
													if (var11 != null && var11.field965 && (var11.field944 || (var2.field954 & 0x8) == 0)) {
														continue;
													}
												}
												if (var4 >= field1636 && var4 < field4314 - 1) {
													class52 var12 = var7[var3][var4 + 1];
													if (var12 != null && var12.field965 && (var12.field944 || (var2.field954 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var2.field944 = false;
											if (var2.field951 != null) {
												class52 var13 = var2.field951;
												if (var13.field947 == null) {
													if (var13.field964 != null) {
														if (World.method1581(0, var3, var4)) {
															method1060(var13.field964, field1803, field3838, field3242, field3066, var3, var4, true);
														} else {
															method1060(var13.field964, field1803, field3838, field3242, field3066, var3, var4, false);
														}
													}
												} else if (World.method1581(0, var3, var4)) {
													World.renderQuickGround(var13.field947, 0, field1803, field3838, field3242, field3066, var3, var4, true);
												} else {
													World.renderQuickGround(var13.field947, 0, field1803, field3838, field3242, field3066, var3, var4, false);
												}
												class157 var14 = var13.field959;
												if (var14 != null) {
													var14.field3021.method87(0, field1803, field3838, field3242, field3066, var14.field3029 - World.field1353, var14.field3031 - World.field4461, var14.field3023 - World.field4048, var14.field3028);
												}
												for (int var15 = 0; var15 < var13.field962; var15++) {
													class108 var16 = var13.field963[var15];
													if (var16 != null) {
														var16.field1943.method87(var16.field1939, field1803, field3838, field3242, field3066, var16.field1945 - World.field1353, var16.field1938 - World.field4461, var16.field1949 - World.field4048, var16.field1948);
													}
												}
											}
											boolean var17 = false;
											if (var2.field947 == null) {
												if (var2.field964 != null) {
													if (World.method1581(var6, var3, var4)) {
														method1060(var2.field964, field1803, field3838, field3242, field3066, var3, var4, true);
													} else {
														var17 = true;
														method1060(var2.field964, field1803, field3838, field3242, field3066, var3, var4, false);
													}
												}
											} else if (World.method1581(var6, var3, var4)) {
												World.renderQuickGround(var2.field947, var6, field1803, field3838, field3242, field3066, var3, var4, true);
											} else {
												var17 = true;
												if (var2.field947.field1766 != 12345678 || World.field2145 && var5 <= field2484) {
													World.renderQuickGround(var2.field947, var6, field1803, field3838, field3242, field3066, var3, var4, false);
												}
											}
											int var18 = 0;
											int var19 = 0;
											class157 var20 = var2.field959;
											class64 var21 = var2.field956;
											if (var20 != null || var21 != null) {
												if (field1435 == var3) {
													var18++;
												} else if (field1435 < var3) {
													var18 += 2;
												}
												if (field1636 == var4) {
													var18 += 3;
												} else if (field1636 > var4) {
													var18 += 6;
												}
												var19 = field2005[var18];
												var2.field952 = field4285[var18];
											}
											if (var20 != null) {
												if ((var20.field3027 & field1789[var18]) == 0) {
													var2.field953 = 0;
												} else if (var20.field3027 == 16) {
													var2.field953 = 3;
													var2.field946 = field1001[var18];
													var2.field955 = 3 - var2.field946;
												} else if (var20.field3027 == 32) {
													var2.field953 = 6;
													var2.field946 = field4150[var18];
													var2.field955 = 6 - var2.field946;
												} else if (var20.field3027 == 64) {
													var2.field953 = 12;
													var2.field946 = field1869[var18];
													var2.field955 = 12 - var2.field946;
												} else {
													var2.field953 = 9;
													var2.field946 = field904[var18];
													var2.field955 = 9 - var2.field946;
												}
												if ((var20.field3027 & var19) != 0 && !World.method945(var6, var3, var4, var20.field3027)) {
													var20.field3021.method87(0, field1803, field3838, field3242, field3066, var20.field3029 - World.field1353, var20.field3031 - World.field4461, var20.field3023 - World.field4048, var20.field3028);
												}
												if ((var20.field3024 & var19) != 0 && !World.method945(var6, var3, var4, var20.field3024)) {
													var20.field3032.method87(0, field1803, field3838, field3242, field3066, var20.field3029 - World.field1353, var20.field3031 - World.field4461, var20.field3023 - World.field4048, var20.field3028);
												}
											}
											if (var21 != null && !method1320(var6, var3, var4, var21.field1159.method88())) {
												if ((var21.field1164 & var19) != 0) {
													var21.field1159.method87(0, field1803, field3838, field3242, field3066, var21.field1157 + var21.field1169 - World.field1353, var21.field1168 - World.field4461, var21.field1161 + var21.field1167 - World.field4048, var21.field1158);
												} else if (var21.field1164 == 256) {
													int var22 = var21.field1157 - World.field1353;
													int var23 = var21.field1168 - World.field4461;
													int var24 = var21.field1161 - World.field4048;
													int var25 = var21.field1172;
													int var26;
													if (var25 == 1 || var25 == 2) {
														var26 = -var22;
													} else {
														var26 = var22;
													}
													int var27;
													if (var25 == 2 || var25 == 3) {
														var27 = -var24;
													} else {
														var27 = var24;
													}
													if (var27 < var26) {
														var21.field1159.method87(0, field1803, field3838, field3242, field3066, var22 + var21.field1169, var23, var24 + var21.field1167, var21.field1158);
													} else if (var21.field1160 != null) {
														var21.field1160.method87(0, field1803, field3838, field3242, field3066, var22, var23, var24, var21.field1158);
													}
												}
											}
											if (var17) {
												class166 var28 = var2.field949;
												if (var28 != null) {
													var28.field3194.method87(0, field1803, field3838, field3242, field3066, var28.field3197 - World.field1353, var28.field3193 - World.field4461, var28.field3190 - World.field4048, var28.field3202);
												}
												class239 var29 = var2.field948;
												if (var29 != null && var29.field4435 == 0) {
													if (var29.field4446 != null) {
														var29.field4446.method87(0, field1803, field3838, field3242, field3066, var29.field4451 - World.field1353, var29.field4444 - World.field4461, var29.field4439 - World.field4048, var29.field4440);
													}
													if (var29.field4448 != null) {
														var29.field4448.method87(0, field1803, field3838, field3242, field3066, var29.field4451 - World.field1353, var29.field4444 - World.field4461, var29.field4439 - World.field4048, var29.field4440);
													}
													if (var29.field4443 != null) {
														var29.field4443.method87(0, field1803, field3838, field3242, field3066, var29.field4451 - World.field1353, var29.field4444 - World.field4461, var29.field4439 - World.field4048, var29.field4440);
													}
												}
											}
											int var30 = var2.field954;
											if (var30 != 0) {
												if (var3 < field1435 && (var30 & 0x4) != 0) {
													class52 var31 = var7[var3 + 1][var4];
													if (var31 != null && var31.field965) {
														class105.field1900.push(var31);
													}
												}
												if (var4 < field1636 && (var30 & 0x2) != 0) {
													class52 var32 = var7[var3][var4 + 1];
													if (var32 != null && var32.field965) {
														class105.field1900.push(var32);
													}
												}
												if (var3 > field1435 && (var30 & 0x1) != 0) {
													class52 var33 = var7[var3 - 1][var4];
													if (var33 != null && var33.field965) {
														class105.field1900.push(var33);
													}
												}
												if (var4 > field1636 && (var30 & 0x8) != 0) {
													class52 var34 = var7[var3][var4 - 1];
													if (var34 != null && var34.field965) {
														class105.field1900.push(var34);
													}
												}
											}
											break;
										}
										if (var2.field953 != 0) {
											boolean var35 = true;
											for (int var36 = 0; var36 < var2.field962; var36++) {
												if (var2.field963[var36].field1934 != World.field2627 && (var2.field957[var36] & var2.field953) == var2.field946) {
													var35 = false;
													break;
												}
											}
											if (var35) {
												class157 var37 = var2.field959;
												if (!World.method945(var6, var3, var4, var37.field3027)) {
													var37.field3021.method87(0, field1803, field3838, field3242, field3066, var37.field3029 - World.field1353, var37.field3031 - World.field4461, var37.field3023 - World.field4048, var37.field3028);
												}
												var2.field953 = 0;
											}
										}
										if (!var2.field958) {
											break;
										}
										try {
											int var38 = var2.field962;
											var2.field958 = false;
											int var39 = 0;
											label562: for (int var40 = 0; var40 < var38; var40++) {
												class108 var41 = var2.field963[var40];
												if (var41.field1934 != World.field2627) {
													for (int var42 = var41.field1933; var42 <= var41.field1940; var42++) {
														for (int var43 = var41.field1936; var43 <= var41.field1935; var43++) {
															class52 var44 = var7[var42][var43];
															if (var44.field944) {
																var2.field958 = true;
																continue label562;
															}
															if (var44.field953 != 0) {
																int var45 = 0;
																if (var42 > var41.field1933) {
																	var45++;
																}
																if (var42 < var41.field1940) {
																	var45 += 4;
																}
																if (var43 > var41.field1936) {
																	var45 += 8;
																}
																if (var43 < var41.field1935) {
																	var45 += 2;
																}
																if ((var45 & var44.field953) == var2.field955) {
																	var2.field958 = true;
																	continue label562;
																}
															}
														}
													}
													World.field4447[var39++] = var41;
													int var46 = field1435 - var41.field1933;
													int var47 = var41.field1940 - field1435;
													if (var47 > var46) {
														var46 = var47;
													}
													int var48 = field1636 - var41.field1936;
													int var49 = var41.field1935 - field1636;
													if (var49 > var48) {
														var41.field1950 = var46 + var49;
													} else {
														var41.field1950 = var46 + var48;
													}
												}
											}
											while (var39 > 0) {
												int var50 = -50;
												int var51 = -1;
												for (int var52 = 0; var52 < var39; var52++) {
													class108 var53 = World.field4447[var52];
													if (var53.field1934 != World.field2627) {
														if (var53.field1950 > var50) {
															var50 = var53.field1950;
															var51 = var52;
														} else if (var53.field1950 == var50) {
															int var54 = var53.field1945 - World.field1353;
															int var55 = var53.field1949 - World.field4048;
															int var56 = World.field4447[var51].field1945 - World.field1353;
															int var57 = World.field4447[var51].field1949 - World.field4048;
															if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
																var51 = var52;
															}
														}
													}
												}
												if (var51 == -1) {
													break;
												}
												class108 var58 = World.field4447[var51];
												var58.field1934 = World.field2627;
												if (!method224(var6, var58.field1933, var58.field1940, var58.field1936, var58.field1935, var58.field1943.method88())) {
													var58.field1943.method87(var58.field1939, field1803, field3838, field3242, field3066, var58.field1945 - World.field1353, var58.field1938 - World.field4461, var58.field1949 - World.field4048, var58.field1948);
												}
												for (int var59 = var58.field1933; var59 <= var58.field1940; var59++) {
													for (int var60 = var58.field1936; var60 <= var58.field1935; var60++) {
														class52 var61 = var7[var59][var60];
														if (var61.field953 != 0) {
															class105.field1900.push(var61);
														} else if ((var59 != var3 || var60 != var4) && var61.field965) {
															class105.field1900.push(var61);
														}
													}
												}
											}
											if (!var2.field958) {
												break;
											}
										} catch (Exception var80) {
											var2.field958 = false;
											break;
										}
									}
								} while (!var2.field965);
							} while (var2.field953 != 0);
							if (var3 > field1435 || var3 <= field3007) {
								break;
							}
							var62 = var7[var3 - 1][var4];
						} while (var62 != null && var62.field965);
						if (var3 < field1435 || var3 >= PacketBit.field84 - 1) {
							break;
						}
						var63 = var7[var3 + 1][var4];
					} while (var63 != null && var63.field965);
					if (var4 > field1636 || var4 <= field1849) {
						break;
					}
					var64 = var7[var3][var4 - 1];
				} while (var64 != null && var64.field965);
				if (var4 < field1636 || var4 >= field4314 - 1) {
					break;
				}
				var65 = var7[var3][var4 + 1];
			} while (var65 != null && var65.field965);
			var2.field965 = false;
			StructType.field3545--;
			class239 var66 = var2.field948;
			if (var66 != null && var66.field4435 != 0) {
				if (var66.field4446 != null) {
					var66.field4446.method87(0, field1803, field3838, field3242, field3066, var66.field4451 - World.field1353, var66.field4444 - World.field4461 - var66.field4435, var66.field4439 - World.field4048, var66.field4440);
				}
				if (var66.field4448 != null) {
					var66.field4448.method87(0, field1803, field3838, field3242, field3066, var66.field4451 - World.field1353, var66.field4444 - World.field4461 - var66.field4435, var66.field4439 - World.field4048, var66.field4440);
				}
				if (var66.field4443 != null) {
					var66.field4443.method87(0, field1803, field3838, field3242, field3066, var66.field4451 - World.field1353, var66.field4444 - World.field4461 - var66.field4435, var66.field4439 - World.field4048, var66.field4440);
				}
			}
			if (var2.field952 != 0) {
				class64 var67 = var2.field956;
				if (var67 != null && !method1320(var6, var3, var4, var67.field1159.method88())) {
					if ((var67.field1164 & var2.field952) != 0) {
						var67.field1159.method87(0, field1803, field3838, field3242, field3066, var67.field1157 + var67.field1169 - World.field1353, var67.field1168 - World.field4461, var67.field1161 + var67.field1167 - World.field4048, var67.field1158);
					} else if (var67.field1164 == 256) {
						int var68 = var67.field1157 - World.field1353;
						int var69 = var67.field1168 - World.field4461;
						int var70 = var67.field1161 - World.field4048;
						int var71 = var67.field1172;
						int var72;
						if (var71 == 1 || var71 == 2) {
							var72 = -var68;
						} else {
							var72 = var68;
						}
						int var73;
						if (var71 == 2 || var71 == 3) {
							var73 = -var70;
						} else {
							var73 = var70;
						}
						if (var73 >= var72) {
							var67.field1159.method87(0, field1803, field3838, field3242, field3066, var68 + var67.field1169, var69, var70 + var67.field1167, var67.field1158);
						} else if (var67.field1160 != null) {
							var67.field1160.method87(0, field1803, field3838, field3242, field3066, var68, var69, var70, var67.field1158);
						}
					}
				}
				class157 var74 = var2.field959;
				if (var74 != null) {
					if ((var74.field3024 & var2.field952) != 0 && !World.method945(var6, var3, var4, var74.field3024)) {
						var74.field3032.method87(0, field1803, field3838, field3242, field3066, var74.field3029 - World.field1353, var74.field3031 - World.field4461, var74.field3023 - World.field4048, var74.field3028);
					}
					if ((var74.field3027 & var2.field952) != 0 && !World.method945(var6, var3, var4, var74.field3027)) {
						var74.field3021.method87(0, field1803, field3838, field3242, field3066, var74.field3029 - World.field1353, var74.field3031 - World.field4461, var74.field3023 - World.field4048, var74.field3028);
					}
				}
			}
			if (var5 < World.field152 - 1) {
				class52 var75 = World.field489[var5 + 1][var3][var4];
				if (var75 != null && var75.field965) {
					class105.field1900.push(var75);
				}
			}
			if (var3 < field1435) {
				class52 var76 = var7[var3 + 1][var4];
				if (var76 != null && var76.field965) {
					class105.field1900.push(var76);
				}
			}
			if (var4 < field1636) {
				class52 var77 = var7[var3][var4 + 1];
				if (var77 != null && var77.field965) {
					class105.field1900.push(var77);
				}
			}
			if (var3 > field1435) {
				class52 var78 = var7[var3 - 1][var4];
				if (var78 != null && var78.field965) {
					class105.field1900.push(var78);
				}
			}
			if (var4 > field1636) {
				class52 var79 = var7[var3][var4 - 1];
				if (var79 != null && var79.field965) {
					class105.field1900.push(var79);
				}
			}
		}
	}

	@ObfuscatedName("id.a(BLea;)Ltj;")
	public static class217 method667(Packet arg0) {
		class217 var1 = new class217();
		var1.field4058 = arg0.g2();
		var1.field4065 = QuickChatPhraseTypeList.method1150(var1.field4058);
		return var1;
	}

	@ObfuscatedName("id.a(IIII)V")
	public static void method668(int arg0, int arg1, int arg2) {
		if (field2172 == 0 || arg0 == 0 || client.field3445 >= 50 || arg2 == -1) {
			return;
		}
		field397[client.field3445] = arg2;
		field2016[client.field3445] = arg0;
		field116[client.field3445] = arg1;
		field4417[client.field3445] = null;
		field2726[client.field3445] = 0;
		client.field3445++;
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
			client.method216(arg2, arg5, arg4, arg6, arg0, arg3);
		} else if (arg3 - arg2 >= field1207 && arg2 + arg3 <= field183 && field919 <= arg6 - arg1 && field279 >= arg1 + arg6) {
			method126(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			method1051(arg6, arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}

	@ObfuscatedName("me.c(B)V")
	public static void method905() {
		int var0 = field666 >> 7;
		client.field3930 &= 0x7FF;
		int var1 = class233.field4366 >> 7;
		int var2 = 0;
		if (field1173 < 128) {
			field1173 = 128;
		}
		if (field1173 > 383) {
			field1173 = 383;
		}
		int var3 = client.method1584(field666, class233.field4366, client.field2907);
		if (var0 > 3 && var1 > 3 && var0 < 100 && var1 < 100) {
			for (int var4 = var0 - 4; var4 <= var0 + 4; var4++) {
				for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
					int var6 = client.field2907;
					if (var6 < 3 && (ClientBuild.field2098[1][var4][var5] & 0x2) == 2) {
						var6++;
					}
					int var7 = var3 - ClientBuild.field1137[var6][var4][var5];
					if (var2 < var7) {
						var2 = var7;
					}
				}
			}
		}
		int var8 = var2 * 192;
		if (var8 > 98048) {
			var8 = 98048;
		}
		if (var8 < 32768) {
			var8 = 32768;
		}
		if (field1328 < var8) {
			field1328 += (var8 - field1328) / 24;
		} else if (var8 < field1328) {
			field1328 += (var8 - field1328) / 80;
		}
	}

	@ObfuscatedName("me.a(IZ)V")
	public static void method906(int arg0) {
		if (field482 == null || field482.length < arg0) {
			field482 = new int[arg0];
		}
	}
}
