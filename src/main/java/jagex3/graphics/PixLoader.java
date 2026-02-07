package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class PixLoader {
	@ObfuscatedName("nb.z")
	public static int count;
	@ObfuscatedName("vf.G")
	public static int owi;
	@ObfuscatedName("sc.Bb")
	public static int ohi;
	@ObfuscatedName("ka.Qc")
	public static int[] xof;
	@ObfuscatedName("ke.k")
	public static int[] yof;
	@ObfuscatedName("sa.k")
	public static int[] wi;
	@ObfuscatedName("ee.ab")
	public static int[] hi;
	@ObfuscatedName("va.t")
	public static byte[][] bspr;
	@ObfuscatedName("eb.C")
	public static int[] bpal;

	@ObfuscatedName("a.a(I)[Lh;")
	public static Pix32[] makePix32Array() {
		Pix32[] var0 = new Pix32[count];
		for (int var1 = 0; var1 < count; var1++) {
			Pix32 var2 = var0[var1] = new Pix32();
			var2.owi = owi;
			var2.ohi = ohi;
			var2.xof = xof[var1];
			var2.yof = yof[var1];
			var2.wi = wi[var1];
			var2.hi = hi[var1];
			int var3 = var2.hi * var2.wi;
			byte[] var4 = bspr[var1];
			var2.data = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				var2.data[var5] = bpal[var4[var5] & 0xFF];
			}
		}
		reset();
		return var0;
	}

	@ObfuscatedName("ue.e(I)[Lhb;")
	public static Pix8[] makePix8Array() {
		Pix8[] var0 = new Pix8[count];
		for (int var1 = 0; var1 < count; var1++) {
			Pix8 var2 = var0[var1] = new Pix8();
			var2.owi = owi;
			var2.ohi = ohi;
			var2.xof = xof[var1];
			var2.yof = yof[var1];
			var2.wi = wi[var1];
			var2.hi = hi[var1];
			var2.bpal = bpal;
			var2.bspr = bspr[var1];
		}
		reset();
		return var0;
	}

	@ObfuscatedName("td.a(Lec;Lea;ZLec;)Lhb;")
	public static Pix8 makePix8(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg2);
		int var4 = arg1.getFileId(arg0, var3);
		return makePix8(var4, var3, arg1);
	}

	@ObfuscatedName("nd.a(BILea;I)[Lh;")
	public static Pix32[] makePix32Array(int arg0, Js5 arg1, int arg2) {
		return depack(arg2, arg1, arg0) ? makePix32Array() : null;
	}

	@ObfuscatedName("he.a(Z[B)V")
	public static void depack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		count = var1.g2();
		wi = new int[count];
		xof = new int[count];
		hi = new int[count];
		bspr = new byte[count][];
		yof = new int[count];
		var1.pos = arg0.length - count * 8 - 7;
		owi = var1.g2();
		ohi = var1.g2();
		int var2 = (var1.g1() & 0xFF) + 1;
		for (int var3 = 0; var3 < count; var3++) {
			xof[var3] = var1.g2();
		}
		for (int var4 = 0; var4 < count; var4++) {
			yof[var4] = var1.g2();
		}
		for (int var5 = 0; var5 < count; var5++) {
			wi[var5] = var1.g2();
		}
		for (int var6 = 0; var6 < count; var6++) {
			hi[var6] = var1.g2();
		}
		var1.pos = arg0.length - count * 8 - (var2 + -1) * 3 - 7;
		bpal = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			bpal[var7] = var1.g3();
			if (bpal[var7] == 0) {
				bpal[var7] = 1;
			}
		}
		var1.pos = 0;
		for (int var8 = 0; var8 < count; var8++) {
			int var9 = wi[var8];
			int var10 = hi[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			bspr[var8] = var12;
			int var13 = var1.g1();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.g1b();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var9; var15++) {
					for (int var16 = 0; var16 < var10; var16++) {
						var12[var15 + var9 * var16] = var1.g1b();
					}
				}
			}
		}
	}

	@ObfuscatedName("df.a(ILea;II)Z")
	public static boolean depack(int arg0, Js5 arg1, int arg2) {
		byte[] var3 = arg1.getFile(arg0, arg2);
		if (var3 == null) {
			return false;
		} else {
			depack(var3);
			return true;
		}
	}

	@ObfuscatedName("hc.a(ILea;I)Lhb;")
	public static Pix8 makePix8(Js5 arg0, int arg1) {
		return depack(arg0, arg1) ? makePix8() : null;
	}

	@ObfuscatedName("i.a(Lec;Lec;ILea;)[Lhb;")
	public static Pix8[] makePix8Array(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.getGroupId(arg1);
		int var4 = arg2.getFileId(arg0, var3);
		return makePix8Array(var3, var4, arg2);
	}

	@ObfuscatedName("nd.a(I)Lhb;")
	public static Pix8 makePix8() {
		Pix8 var0 = new Pix8();
		var0.bpal = bpal;
		var0.xof = xof[0];
		var0.bspr = bspr[0];
		var0.ohi = ohi;
		var0.owi = owi;
		var0.hi = hi[0];
		var0.yof = yof[0];
		var0.wi = wi[0];
		reset();
		return var0;
	}

	@ObfuscatedName("qa.a(BLea;Lea;Lec;Lec;)Lnf;")
	public static PixFontGeneric makePixFont(Js5 arg0, Js5 arg1, JagString arg2, JagString arg3) {
		int var4 = arg0.getGroupId(arg3);
		int var5 = arg0.getFileId(arg2, var4);
		return makePixFont(var4, arg1, arg0, var5);
	}

	@ObfuscatedName("sd.a(ILea;BLea;I)Lnf;")
	public static PixFontGeneric makePixFont(int arg0, Js5 arg1, Js5 arg2, int arg3) {
		return depack(arg0, arg2, arg3) ? makePixFont(arg1.getFile(arg0, arg3)) : null;
	}

	@ObfuscatedName("ge.a(Lea;IB)Z")
	public static boolean depack(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(arg1);
		if (var2 == null) {
			return false;
		} else {
			depack(var2);
			return true;
		}
	}

	@ObfuscatedName("f.a(ILea;II)Lh;")
	public static Pix32 makePix32(int arg0, Js5 arg1, int arg2) {
		return depack(arg2, arg1, arg0) ? makePix32() : null;
	}

	@ObfuscatedName("aa.a(Lea;Lec;Lec;I)Lh;")
	public static Pix32 makePix32(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.getGroupId(arg2);
		int var4 = arg0.getFileId(arg1, var3);
		return makePix32(var4, arg0, var3);
	}

	@ObfuscatedName("a.a(IIZLea;)Lhb;")
	public static Pix8 makePix8(int arg0, int arg1, Js5 arg2) {
		return depack(arg1, arg2, arg0) ? makePix8() : null;
	}

	@ObfuscatedName("j.a(Lec;Lea;ZLec;)[Lh;")
	public static Pix32[] makePix32Array(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg0);
		int var4 = arg1.getFileId(arg2, var3);
		return makePix32Array(var4, arg1, var3);
	}

	@ObfuscatedName("ac.a(IIILea;)[Lhb;")
	public static Pix8[] makePix8Array(int arg0, int arg1, Js5 arg2) {
		return depack(arg0, arg2, arg1) ? makePix8Array() : null;
	}

	@ObfuscatedName("le.c(B)Lh;")
	public static Pix32 makePix32() {
		Pix32 var0 = new Pix32();
		var0.owi = owi;
		var0.hi = hi[0];
		var0.yof = yof[0];
		var0.wi = wi[0];
		byte[] var1 = bspr[0];
		int var2 = var0.wi * var0.hi;
		var0.xof = xof[0];
		var0.data = new int[var2];
		var0.ohi = ohi;
		for (int var3 = 0; var3 < var2; var3++) {
			var0.data[var3] = bpal[var1[var3] & 0xFF];
		}
		reset();
		return var0;
	}

	@ObfuscatedName("c.a([BZ)Lnf;")
	public static PixFontGeneric makePixFont(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			PixFontGeneric var1 = new PixFontGeneric(arg0, xof, yof, wi, hi, bpal, bspr);
			reset();
			return var1;
		}
	}

	@ObfuscatedName("ka.c(B)V")
	public static void reset() {
		xof = null;
		yof = null;
		bspr = null;
		wi = null;
		hi = null;
		bpal = null;
	}
}
