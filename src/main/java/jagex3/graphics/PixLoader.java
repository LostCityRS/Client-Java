package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class PixLoader {
	@ObfuscatedName("nb.z")
	public static int field2110;
	@ObfuscatedName("vf.G")
	public static int field3506;
	@ObfuscatedName("sc.Bb")
	public static int field2965;
	@ObfuscatedName("ka.Qc")
	public static int[] field1638;
	@ObfuscatedName("ke.k")
	public static int[] field1746;
	@ObfuscatedName("sa.k")
	public static int[] field2925;
	@ObfuscatedName("ee.ab")
	public static int[] field719;
	@ObfuscatedName("va.t")
	public static byte[][] field3344;
	@ObfuscatedName("eb.C")
	public static int[] field616;

	@ObfuscatedName("a.a(I)[Lh;")
	public static Pix32[] method1() {
		Pix32[] var0 = new Pix32[field2110];
		for (int var1 = 0; var1 < field2110; var1++) {
			Pix32 var2 = var0[var1] = new Pix32();
			var2.field1138 = field3506;
			var2.field1140 = field2965;
			var2.field1139 = field1638[var1];
			var2.field1143 = field1746[var1];
			var2.field1141 = field2925[var1];
			var2.field1142 = field719[var1];
			int var3 = var2.field1142 * var2.field1141;
			byte[] var4 = field3344[var1];
			var2.field1144 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				var2.field1144[var5] = field616[var4[var5] & 0xFF];
			}
		}
		method579();
		return var0;
	}

	@ObfuscatedName("ue.e(I)[Lhb;")
	public static Pix8[] method1084() {
		Pix8[] var0 = new Pix8[field2110];
		for (int var1 = 0; var1 < field2110; var1++) {
			Pix8 var2 = var0[var1] = new Pix8();
			var2.field1169 = field3506;
			var2.field1168 = field2965;
			var2.field1170 = field1638[var1];
			var2.field1165 = field1746[var1];
			var2.field1167 = field2925[var1];
			var2.field1171 = field719[var1];
			var2.field1166 = field616;
			var2.field1164 = field3344[var1];
		}
		method579();
		return var0;
	}

	@ObfuscatedName("td.a(Lec;Lea;ZLec;)Lhb;")
	public static Pix8 makePix8(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method201(arg2);
		int var4 = arg1.method215(arg0, var3);
		return method4(var4, var3, arg1);
	}

	@ObfuscatedName("nd.a(BILea;I)[Lh;")
	public static Pix32[] method739(int arg0, Js5 arg1, int arg2) {
		return method193(arg2, arg1, arg0) ? method1() : null;
	}

	@ObfuscatedName("he.a(Z[B)V")
	public static void depack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		field2110 = var1.g2();
		field2925 = new int[field2110];
		field1638 = new int[field2110];
		field719 = new int[field2110];
		field3344 = new byte[field2110][];
		field1746 = new int[field2110];
		var1.pos = arg0.length - field2110 * 8 - 7;
		field3506 = var1.g2();
		field2965 = var1.g2();
		int var2 = (var1.g1() & 0xFF) + 1;
		for (int var3 = 0; var3 < field2110; var3++) {
			field1638[var3] = var1.g2();
		}
		for (int var4 = 0; var4 < field2110; var4++) {
			field1746[var4] = var1.g2();
		}
		for (int var5 = 0; var5 < field2110; var5++) {
			field2925[var5] = var1.g2();
		}
		for (int var6 = 0; var6 < field2110; var6++) {
			field719[var6] = var1.g2();
		}
		var1.pos = arg0.length - field2110 * 8 - (var2 + -1) * 3 - 7;
		field616 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			field616[var7] = var1.g3();
			if (field616[var7] == 0) {
				field616[var7] = 1;
			}
		}
		var1.pos = 0;
		for (int var8 = 0; var8 < field2110; var8++) {
			int var9 = field2925[var8];
			int var10 = field719[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			field3344[var8] = var12;
			int var13 = var1.g1();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.method544();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var9; var15++) {
					for (int var16 = 0; var16 < var10; var16++) {
						var12[var15 + var9 * var16] = var1.method544();
					}
				}
			}
		}
	}

	@ObfuscatedName("df.a(ILea;II)Z")
	public static boolean method193(int arg0, Js5 arg1, int arg2) {
		byte[] var3 = arg1.method206(arg0, arg2);
		if (var3 == null) {
			return false;
		} else {
			depack(var3);
			return true;
		}
	}

	@ObfuscatedName("hc.a(ILea;I)Lhb;")
	public static Pix8 method408(Js5 arg0, int arg1) {
		return method358(arg0, arg1) ? method741() : null;
	}

	@ObfuscatedName("i.a(Lec;Lec;ILea;)[Lhb;")
	public static Pix8[] makePix8Array(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method201(arg1);
		int var4 = arg2.method215(arg0, var3);
		return method12(var3, var4, arg2);
	}

	@ObfuscatedName("nd.a(I)Lhb;")
	public static Pix8 method741() {
		Pix8 var0 = new Pix8();
		var0.field1166 = field616;
		var0.field1170 = field1638[0];
		var0.field1164 = field3344[0];
		var0.field1168 = field2965;
		var0.field1169 = field3506;
		var0.field1171 = field719[0];
		var0.field1165 = field1746[0];
		var0.field1167 = field2925[0];
		method579();
		return var0;
	}

	@ObfuscatedName("qa.a(BLea;Lea;Lec;Lec;)Lnf;")
	public static PixFontGeneric method879(Js5 arg0, Js5 arg1, JagString arg2, JagString arg3) {
		int var4 = arg0.method201(arg3);
		int var5 = arg0.method215(arg2, var4);
		return method998(var4, arg1, arg0, var5);
	}

	@ObfuscatedName("sd.a(ILea;BLea;I)Lnf;")
	public static PixFontGeneric method998(int arg0, Js5 arg1, Js5 arg2, int arg3) {
		return method193(arg0, arg2, arg3) ? method102(arg1.method206(arg0, arg3)) : null;
	}

	@ObfuscatedName("ge.a(Lea;IB)Z")
	public static boolean method358(Js5 arg0, int arg1) {
		byte[] var2 = arg0.method218(arg1);
		if (var2 == null) {
			return false;
		} else {
			depack(var2);
			return true;
		}
	}

	@ObfuscatedName("f.a(ILea;II)Lh;")
	public static Pix32 method312(int arg0, Js5 arg1, int arg2) {
		return method193(arg2, arg1, arg0) ? method638() : null;
	}

	@ObfuscatedName("aa.a(Lea;Lec;Lec;I)Lh;")
	public static Pix32 makePix32(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method201(arg2);
		int var4 = arg0.method215(arg1, var3);
		return method312(var4, arg0, var3);
	}

	@ObfuscatedName("a.a(IIZLea;)Lhb;")
	public static Pix8 method4(int arg0, int arg1, Js5 arg2) {
		return method193(arg1, arg2, arg0) ? method741() : null;
	}

	@ObfuscatedName("j.a(Lec;Lea;ZLec;)[Lh;")
	public static Pix32[] makePix32Array(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method201(arg0);
		int var4 = arg1.method215(arg2, var3);
		return method739(var4, arg1, var3);
	}

	@ObfuscatedName("ac.a(IIILea;)[Lhb;")
	public static Pix8[] method12(int arg0, int arg1, Js5 arg2) {
		return method193(arg0, arg2, arg1) ? method1084() : null;
	}

	@ObfuscatedName("le.c(B)Lh;")
	public static Pix32 method638() {
		Pix32 var0 = new Pix32();
		var0.field1138 = field3506;
		var0.field1142 = field719[0];
		var0.field1143 = field1746[0];
		var0.field1141 = field2925[0];
		byte[] var1 = field3344[0];
		int var2 = var0.field1141 * var0.field1142;
		var0.field1139 = field1638[0];
		var0.field1144 = new int[var2];
		var0.field1140 = field2965;
		for (int var3 = 0; var3 < var2; var3++) {
			var0.field1144[var3] = field616[var1[var3] & 0xFF];
		}
		method579();
		return var0;
	}

	@ObfuscatedName("c.a([BZ)Lnf;")
	public static PixFontGeneric method102(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			PixFontGeneric var1 = new PixFontGeneric(arg0, field1638, field1746, field2925, field719, field616, field3344);
			method579();
			return var1;
		}
	}

	@ObfuscatedName("ka.c(B)V")
	public static void method579() {
		field1638 = null;
		field1746 = null;
		field3344 = null;
		field2925 = null;
		field719 = null;
		field616 = null;
	}
}
