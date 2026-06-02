package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

public class PixLoader {
	@ObfuscatedName("pi.db")
	public static int count;
	@ObfuscatedName("g.p")
	public static int[] hi;
	@ObfuscatedName("kg.gb")
	public static byte[][] bspr;
	@ObfuscatedName("md.W")
	public static int[] yof;
	@ObfuscatedName("wh.W")
	public static int[] xof;
	@ObfuscatedName("jd.h")
	public static int[] wi;
	@ObfuscatedName("bc.h")
	public static int owi;
	@ObfuscatedName("li.P")
	public static int ohi;
	@ObfuscatedName("cd.f")
	public static int[] bpal;

	@ObfuscatedName("we.a(I[B)V")
	public static void depack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		count = var1.g2();
		hi = new int[count];
		bspr = new byte[count][];
		yof = new int[count];
		xof = new int[count];
		wi = new int[count];
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
			int var9 = hi[var8];
			int var10 = wi[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			bspr[var8] = var12;
			int var13 = var1.g1();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.g1b();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var9; var16++) {
						var12[var16 * var10 + var15] = var1.g1b();
					}
				}
			}
		}
	}

	@ObfuscatedName("q.a(B)[Lrh;")
	public static SoftwarePix8[] makeSoftwarePix8Array() {
		SoftwarePix8[] var0 = new SoftwarePix8[count];
		for (int var1 = 0; var1 < count; var1++) {
			var0[var1] = new SoftwarePix8(owi, ohi, xof[var1], yof[var1], wi[var1], hi[var1], bspr[var1], bpal);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("pa.a(I)Lrh;")
	public static SoftwarePix8 makeSoftwarePix8() {
		SoftwarePix8 var0 = new SoftwarePix8(owi, ohi, xof[0], yof[0], wi[0], hi[0], bspr[0], bpal);
		method1578();
		return var0;
	}

	@ObfuscatedName("cd.b(B)Llj;")
	public static Pix8 makePix8() {
		SoftwarePix8 var0 = new SoftwarePix8(owi, ohi, xof[0], yof[0], wi[0], hi[0], bspr[0], bpal);
		method1578();
		return var0;
	}

	@ObfuscatedName("db.a(B[B)Lcc;")
	public static PixfontGeneric makePixFont(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			SoftwarePixFont var1 = new SoftwarePixFont(arg0, xof, yof, wi, hi, bspr);
			method1578();
			return var1;
		}
	}

	@ObfuscatedName("d.d(B)[Lpf;")
	public static SoftwarePix32[] makeSoftwarePix32Array() {
		SoftwarePix32[] var0 = new SoftwarePix32[count];
		for (int var1 = 0; var1 < count; var1++) {
			int var2 = wi[var1] * hi[var1];
			byte[] var3 = bspr[var1];
			int[] var4 = new int[var2];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = bpal[var3[var5] & 0xFF];
			}
			var0[var1] = new SoftwarePix32(owi, ohi, xof[var1], yof[var1], wi[var1], hi[var1], var4);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("bi.a(B)[Lrc;")
	public static Pix32[] method100() {
		Pix32[] var0 = new Pix32[count];
		for (int var1 = 0; var1 < count; var1++) {
			int var2 = hi[var1] * wi[var1];
			int[] var3 = new int[var2];
			byte[] var4 = bspr[var1];
			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = bpal[var4[var5] & 0xFF];
			}
			var0[var1] = new SoftwarePix32(owi, ohi, xof[var1], yof[var1], wi[var1], hi[var1], var3);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("vh.d(I)Lpf;")
	public static SoftwarePix32 makeSoftwarePix32() {
		byte[] var0 = bspr[0];
		int var1 = wi[0] * hi[0];
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = bpal[var0[var3] & 0xFF];
		}
		SoftwarePix32 var4 = new SoftwarePix32(owi, ohi, xof[0], yof[0], wi[0], hi[0], var2);
		method1578();
		return var4;
	}

	@ObfuscatedName("re.a(B)[Llj;")
	public static Pix8[] makePix8Array() {
		Pix8[] var0 = new Pix8[count];
		for (int var1 = 0; var1 < count; var1++) {
			var0[var1] = new SoftwarePix8(owi, ohi, xof[var1], yof[var1], wi[var1], hi[var1], bspr[var1], bpal);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("re.a(IBLnb;I)[Llj;")
	public static Pix8[] makePix8Array(int arg0, Js5 arg1, int arg2) {
		return depack(arg1, arg0, arg2) ? makePix8Array() : null;
	}

	@ObfuscatedName("re.a(IILnb;B)[Lrh;")
	public static SoftwarePix8[] makePix8Array(int arg0, int arg1, Js5 arg2) {
		return depack(arg2, arg0, arg1) ? makeSoftwarePix8Array() : null;
	}

	@ObfuscatedName("sg.b(B)Lrc;")
	public static Pix32 makePix32() {
		byte[] var0 = bspr[0];
		int var1 = wi[0] * hi[0];
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = bpal[var0[var3] & 0xFF];
		}
		SoftwarePix32 var4 = new SoftwarePix32(owi, ohi, xof[0], yof[0], wi[0], hi[0], var2);
		method1578();
		return var4;
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1578() {
		xof = null;
		hi = null;
		yof = null;
		bspr = null;
		bpal = null;
		wi = null;
	}

	@ObfuscatedName("eb.a(ILnb;II)Z")
	public static boolean depack(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg2, arg1);
		if (var3 == null) {
			return false;
		} else {
			depack(var3);
			return true;
		}
	}

	@ObfuscatedName("ve.a(Lnb;ZII)Lrc;")
	public static Pix32 makePix32(Js5 arg0, int arg1, int arg2) {
		return depack(arg0, arg1, arg2) ? makePix32() : null;
	}

	@ObfuscatedName("d.a(ILnb;II)[Lrc;")
	public static Pix32[] makePix32Array(int arg0, Js5 arg1, int arg2) {
		return depack(arg1, arg2, arg0) ? method100() : null;
	}

	@ObfuscatedName("jh.a(ILnb;IILnb;)Lcc;")
	public static PixfontGeneric makePixFont(int arg0, Js5 arg1, int arg2, Js5 arg3) {
		return depack(arg3, arg2, arg0) ? makePixFont(arg1.getFile(arg0, arg2)) : null;
	}

	@ObfuscatedName("fd.a(Lnb;Lnb;Li;ILi;)Lcc;")
	public static PixfontGeneric makePixFont(Js5 arg0, Js5 arg1, JagString arg2, JagString arg3) {
		int var4 = arg1.getGroupId(arg3);
		int var5 = arg1.getFileId(arg2, var4);
		return makePixFont(var5, arg0, var4, arg1);
	}

	@ObfuscatedName("a.a(Li;BLnb;Li;)[Llj;")
	public static Pix8[] makePix8Array(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg0);
		int var4 = arg1.getFileId(arg2, var3);
		return makePix8Array(var3, arg1, var4);
	}

	@ObfuscatedName("w.a(ILnb;II)[Lpf;")
	public static SoftwarePix32[] makeSoftwarePix32Array(int arg0, Js5 arg1, int arg2) {
		return depack(arg1, arg2, arg0) ? makeSoftwarePix32Array() : null;
	}

	@ObfuscatedName("w.a(Li;ZLnb;Li;)[Lrc;")
	public static Pix32[] makePix32Array(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg0);
		int var4 = arg1.getFileId(arg2, var3);
		return makePix32Array(var4, arg1, var3);
	}

	@ObfuscatedName("ab.a(Li;ZLi;Lnb;)[Lpf;")
	public static SoftwarePix32[] makeSoftwarePix32Array(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.getGroupId(arg0);
		int var4 = arg2.getFileId(arg1, var3);
		return makeSoftwarePix32Array(var4, arg2, var3);
	}

	@ObfuscatedName("ci.a(ZLnb;II)Lpf;")
	public static SoftwarePix32 makeSoftwarePix32(Js5 arg0, int arg1, int arg2) {
		return depack(arg0, arg2, arg1) ? makeSoftwarePix32() : null;
	}

	@ObfuscatedName("dc.a(Lnb;BI)Lpf;")
	public static SoftwarePix32 makeSoftwarePix32(Js5 arg0, int arg1) {
		return depack(arg1, arg0) ? makeSoftwarePix32() : null;
	}

	@ObfuscatedName("tg.a(IILnb;I)Llj;")
	public static Pix8 makePix8(int arg0, Js5 arg1) {
		return depack(arg1, arg0, 0) ? makePix8() : null;
	}

	@ObfuscatedName("jc.a(Lnb;BI)[Llj;")
	public static Pix8[] makePix8Array(Js5 arg0, int arg1) {
		return depack(arg1, arg0) ? makePix8Array() : null;
	}

	@ObfuscatedName("ne.a(ILi;Li;Lnb;)[Lrh;")
	public static SoftwarePix8[] makeSoftwarePix8Array(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.getGroupId(arg0);
		int var4 = arg2.getFileId(arg1, var3);
		return makePix8Array(var3, var4, arg2);
	}

	@ObfuscatedName("uc.a(Li;Li;BLnb;)Lrc;")
	public static Pix32 makePix32(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.getGroupId(arg0);
		int var4 = arg2.getFileId(arg1, var3);
		return makePix32(arg2, var3, var4);
	}

	@ObfuscatedName("ah.a(Li;BLnb;Li;)Lpf;")
	public static SoftwarePix32 makeSoftwarePix32(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.getGroupId(arg0);
		int var4 = arg1.getFileId(arg2, var3);
		return makeSoftwarePix32(arg1, var4, var3);
	}

	@ObfuscatedName("te.a(BILnb;)Z")
	public static boolean depack(int arg0, Js5 arg1) {
		byte[] var2 = arg1.getFile(arg0);
		if (var2 == null) {
			return false;
		} else {
			depack(var2);
			return true;
		}
	}

	@ObfuscatedName("lb.a(Lnb;II)[Lrh;")
	public static SoftwarePix8[] makeSoftwarePix8Array(Js5 arg0, int arg1) {
		return depack(arg1, arg0) ? makeSoftwarePix8Array() : null;
	}

	@ObfuscatedName("lb.a(BILnb;)Llj;")
	public static Pix8 method826(int arg0, Js5 arg1) {
		return depack(arg0, arg1) ? makePix8() : null;
	}

	@ObfuscatedName("vd.a(IILnb;I)Lrh;")
	public static SoftwarePix8 makeSoftwarePix8(Js5 arg0, int arg1) {
		return depack(arg0, arg1, 0) ? makeSoftwarePix8() : null;
	}
}
