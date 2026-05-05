package deob;

import jagex3.client.ClientMouseListener;
import jagex3.client.GameShell;
import jagex3.config.IfType;
import jagex3.config.ObjType;
import jagex3.constants.Text;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.PlayerModel;
import jagex3.dash3d.Square;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix32;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.sound.AudioThread;
import jagex3.sound.PcmStream;
import jagex3.util.MonotonicTime;

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
	@ObfuscatedName("fj.b")
	public static final JagString field1188 = JagString.wrap("");
	@ObfuscatedName("be.j")
	public static final JagString field259 = JagString.wrap("<col=00ffff>");
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
	@ObfuscatedName("dh.b")
	public static final JagString field710 = JagString.wrap("Null");
	@ObfuscatedName("bc.c")
	public static final int[] field224 = new int[] { 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 2, 3, -2, 0, 0, 0, -1, -2, 0, -2, 0, -2, 24, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 5, -2, 2, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 8, -1, 0, 1, 0, 0, 0, 6, 0, -1, 2, 0, 10, 0, -2, 0, 0, 0, 0, 1, 0, 3, 0, 2, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 5, 4, -1, 0, 0, 0, 0, 0, 0, 20, 0, -2, 0, 0, 5, 3, 0, -2, -1, 0, 0, 10, 0, 0, 15, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -2, 7, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 12, 1, 0, 5, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 2, 0, 0, 0, 0, 0, 0, 0, 4, -1, 6, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1, -2, 4, 0, 5, 6, 0, 0, 0, 0, 4, 3, 0, 4, 0, 0, -1, 6, -1, 0, 0, 0, 0, 0, 0, 0, 9, -2, 0, 0, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0, -2, 7, 0, 7, -1, 0, -1, 0, 3, 0, 8, 0, 2, 4, 4, 8, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 };
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
	@ObfuscatedName("qf.Q")
	public static final JagString field3569 = JagString.wrap("Fps:");
	@ObfuscatedName("qf.T")
	public static final JagString field3572 = JagString.wrap("null");
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
	@ObfuscatedName("ab.i")
	public static final JagString field34 = JagString.wrap("null");
	@ObfuscatedName("ab.o")
	public static final JagString field40 = JagString.wrap("(Z");
	@ObfuscatedName("bh.J")
	public static final JagString field316 = JagString.wrap("runes");
	@ObfuscatedName("ca.g")
	public static final LruCache field388 = new LruCache(16);
	@ObfuscatedName("cb.d")
	public static final JagString field399 = JagString.wrap("<col=ffff00>");
	@ObfuscatedName("cb.g")
	public static final int[] field402 = new int[32768];
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
	@ObfuscatedName("ui.P")
	public static final JagString field4262 = JagString.wrap(" ");
	@ObfuscatedName("ui.S")
	public static final JagString field4265 = JagString.wrap("cookieprefix");
	@ObfuscatedName("qa.h")
	public static final JagString field3526 = JagString.wrap(" )2> <col=00ffff>");
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
	@ObfuscatedName("jj.x")
	public static final ModelSourceCache field1956 = new ModelSourceCache(4);
	@ObfuscatedName("jj.y")
	public static final JagString field1957 = JagString.wrap("b12_full");
	@ObfuscatedName("ud.l")
	public static final JagString field4190 = JagString.wrap("<br>(X100(U(Y");
	@ObfuscatedName("pg.Db")
	public static final JagString field3306 = JagString.wrap(": ");
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
	@ObfuscatedName("nh.j")
	public static final JagString field2918 = JagString.wrap("Cabbage");
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
	@ObfuscatedName("eb.O")
	public static final JagString field881 = JagString.wrap("sl_arrows");
	@ObfuscatedName("eb.Y")
	public static final JagString field891 = JagString.wrap("<col=ffffff> )4 ");
	@ObfuscatedName("eh.m")
	public static final JagString field979 = JagString.wrap(")1");
	@ObfuscatedName("tj.a")
	public static int field4055;
	@ObfuscatedName("fb.lb")
	public static int field1102;
	@ObfuscatedName("ba.h")
	public static int field192 = 0;
	@ObfuscatedName("ba.s")
	public static int field203 = 0;
	@ObfuscatedName("bd.n")
	public static int field249;
	@ObfuscatedName("n.h")
	public static int field2620 = 0;
	@ObfuscatedName("g.d")
	public static int field1206 = 0;
	@ObfuscatedName("g.h")
	public static short[] field1210;
	@ObfuscatedName("e.Q")
	public static byte[][] field774;
	@ObfuscatedName("ff.eb")
	public static int field1150 = 0;
	@ObfuscatedName("uh.S")
	public static int field4247 = -1;
	@ObfuscatedName("uh.P")
	public static int field4244 = 0;
	@ObfuscatedName("dj.Gb")
	public static int[] field740;
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
	@ObfuscatedName("ai.b")
	public static int field142 = 0;
	@ObfuscatedName("ec.J")
	public static int field898 = 0;
	@ObfuscatedName("eg.w")
	public static int field941;
	@ObfuscatedName("fi.v")
	public static Js5 field1176;
	@ObfuscatedName("ge.C")
	public static int field1316 = 0;
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
	@ObfuscatedName("sc.ab")
	public static int field3809;
	@ObfuscatedName("sc.F")
	public static int field3788 = 0;
	@ObfuscatedName("nj.j")
	public static int field2931;
	@ObfuscatedName("va.w")
	public static HashTable field4313;
	@ObfuscatedName("va.x")
	public static int field4314;
	@ObfuscatedName("nd.l")
	public static AudioThread field2738;
	@ObfuscatedName("nd.p")
	public static int field2742;
	@ObfuscatedName("oh.g")
	public static short field3083 = 320;
	@ObfuscatedName("ia.L")
	public static int[] field1698;
	@ObfuscatedName("jd.f")
	public static int field1849;
	@ObfuscatedName("jd.g")
	public static int field1850;
	@ObfuscatedName("sg.x")
	public static IfType field3871;
	@ObfuscatedName("se.i")
	public static FontMetrics field3840;
	@ObfuscatedName("jh.f")
	public static Js5 field1926;
	@ObfuscatedName("lj.o")
	public static int field2442 = 1;
	@ObfuscatedName("ue.f")
	public static int field4198 = 0;
	@ObfuscatedName("ka.f")
	public static Pix32 field2010;
	@ObfuscatedName("ha.B")
	public static Square[][][] field1416;
	@ObfuscatedName("nh.l")
	public static int[] field2920;
	@ObfuscatedName("id.r")
	public static int[] field1734;
	@ObfuscatedName("ug.b")
	public static JagString field4219 = null;
	@ObfuscatedName("mj.l")
	public static int field2610 = 0;
	@ObfuscatedName("j.j")
	public static int field1801;
	@ObfuscatedName("hi.b")
	public static int field1550 = 0;
	@ObfuscatedName("mf.w")
	public static boolean field2555 = false;
	@ObfuscatedName("la.i")
	public static int field2213;
	@ObfuscatedName("wa.f")
	public static int field4458 = 0;
	@ObfuscatedName("qb.R")
	public static int field3545 = 0;
	@ObfuscatedName("ac.L")
	public static JagString field54;
	@ObfuscatedName("eb.X")
	public static int field890;

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

	@ObfuscatedName("sj.a(I)V")
	public static void method1416() {
		int[] var0 = new int[ObjType.field3855];
		int var1 = 0;
		for (int var2 = 0; var2 < ObjType.field3855; var2++) {
			ObjType var3 = ObjType.list(var2);
			if (var3.manwear >= 0 || var3.womanwear >= 0) {
				var0[var1++] = var2;
			}
		}
		field1698 = new int[var1];
		for (int var4 = 0; var4 < var1; var4++) {
			field1698[var4] = var0[var4];
		}
	}

	@ObfuscatedName("ac.c(II)Z")
	public static boolean method24(int arg0) {
		return arg0 >= 48 && arg0 <= 57;
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
		if (arg0.sound != null) {
			arg0.sound.position = 0;
		}
		arg0.active = false;
		for (PcmStream var1 = arg0.substreamStart(); var1 != null; var1 = arg0.substreamNext()) {
			method99(var1);
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

	@ObfuscatedName("gd.a(IZLi;)V")
	public static void method467(boolean arg0, JagString arg1) {
		JagString var2 = arg1.method639();
		int var3 = 0;
		short[] var4 = new short[16];
		for (int var5 = 0; var5 < ObjType.field3855; var5++) {
			ObjType var6 = ObjType.list(var5);
			if ((!arg0 || var6.field2861) && var6.certtemplate == -1 && var6.field2884 == -1 && var6.field2850 == 0 && var6.name.method639().method617(var2) != -1) {
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

	@ObfuscatedName("sd.a([SI[Li;)V")
	public static void method1376(short[] arg0, JagString[] arg1) {
		method1037(0, arg1, arg1.length - 1, arg0);
	}

	@ObfuscatedName("sc.a(IJ)V")
	public static void method1365(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var2) {
		}
	}

	@ObfuscatedName("oh.a(III)I")
	public static int method1080(int arg0, int arg1) {
		int var2 = arg1 - 1 & arg0 >> 31;
		return var2 + (arg0 + (arg0 >>> 31)) % arg1;
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

	@ObfuscatedName("ng.c(II)Z")
	public static boolean method1017(int arg0) {
		return (-arg0 & arg0) == arg0;
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
