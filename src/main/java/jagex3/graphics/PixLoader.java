package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class PixLoader {
	@ObfuscatedName("md.Lb")
	public static int count;
	@ObfuscatedName("nb.wc")
	public static int[] yof;
	@ObfuscatedName("se.v")
	public static byte[][] bspr;
	@ObfuscatedName("f.k")
	public static int[] wi;
	@ObfuscatedName("vd.Md")
	public static int[] hi;
	@ObfuscatedName("sd.r")
	public static int[] xof;
	@ObfuscatedName("ta.rc")
	public static int owi;
	@ObfuscatedName("kd.E")
	public static int ohi;
	@ObfuscatedName("ba.Wb")
	public static int[] bpal;

	@ObfuscatedName("bd.a([BI)V")
	public static void depack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		count = var1.g2();
		yof = new int[count];
		bspr = new byte[count][];
		wi = new int[count];
		hi = new int[count];
		xof = new int[count];
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
		var1.pos = arg0.length + 3 - count * 8 - var2 * 3 - 7;
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
				for (int var16 = 0; var16 < var11; var16++) {
					var12[var16] = var1.g1b();
				}
			} else if (var13 == 1) {
				for (int var14 = 0; var14 < var10; var14++) {
					for (int var15 = 0; var15 < var9; var15++) {
						var12[var10 * var15 + var14] = var1.g1b();
					}
				}
			}
		}
	}

	@ObfuscatedName("h.j(I)Ljd;")
	public static Pix32 makePix32() {
		Pix32 var0 = new Pix32();
		var0.owi = owi;
		var0.ohi = ohi;
		var0.xof = xof[0];
		var0.yof = yof[0];
		var0.wi = wi[0];
		var0.hi = hi[0];
		byte[] var1 = bspr[0];
		int var2 = var0.wi * var0.hi;
		var0.data = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			var0.data[var3] = bpal[var1[var3] & 0xFF];
		}
		reset();
		return var0;
	}

	@ObfuscatedName("id.a(Lbd;ILa;La;)Lbc;")
	public static PixFont makePixFont(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.getGroupId(arg2);
		int var4 = arg0.getFileId(var3, arg1);
		return makePixFont(var4, arg0, var3);
	}

	@ObfuscatedName("qb.a(ILbd;ZI)Ljd;")
	public static Pix32 makePix32(int arg0, Js5 arg1, int arg2) {
		return depack(arg0, arg2, arg1) ? makePix32() : null;
	}

	@ObfuscatedName("kc.a(La;La;Lbd;B)Le;")
	public static Pix8 makePix8(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.getGroupId(arg0);
		int var4 = arg2.getFileId(var3, arg1);
		return makePix8(arg2, var4, var3);
	}

	@ObfuscatedName("uc.d(B)[Ljd;")
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
			byte[] var3 = bspr[var1];
			int var4 = var2.wi * var2.hi;
			var2.data = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				var2.data[var5] = bpal[var3[var5] & 0xFF];
			}
		}
		reset();
		return var0;
	}

	@ObfuscatedName("be.a(Lbd;ILa;La;)[Ljd;")
	public static Pix32[] makePix32Array(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.getGroupId(arg1);
		int var4 = arg0.getFileId(var3, arg2);
		return makePix32Array(var3, arg0, var4);
	}

	@ObfuscatedName("td.a(I)Lbc;")
	public static PixFont makePixFont() {
		PixFont var0 = new PixFont(yof, wi, hi, bpal, bspr);
		reset();
		return var0;
	}

	@ObfuscatedName("kc.a(Lbd;BII)Le;")
	public static Pix8 makePix8(Js5 arg0, int arg1, int arg2) {
		return depack(arg1, arg2, arg0) ? makePix8() : null;
	}

	@ObfuscatedName("hb.b(I)Le;")
	public static Pix8 makePix8() {
		Pix8 var0 = new Pix8();
		var0.owi = owi;
		var0.ohi = ohi;
		var0.xof = xof[0];
		var0.yof = yof[0];
		var0.wi = wi[0];
		var0.hi = hi[0];
		var0.bpal = bpal;
		var0.data = bspr[0];
		reset();
		return var0;
	}

	@ObfuscatedName("uc.d(I)[Le;")
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
			var2.data = bspr[var1];
		}
		reset();
		return var0;
	}

	@ObfuscatedName("wa.a(Lbd;La;BLa;)Ljd;")
	public static Pix32 makePix32(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.getGroupId(arg1);
		int var4 = arg0.getFileId(var3, arg2);
		return makePix32(var4, arg0, var3);
	}

	@ObfuscatedName("j.a(ILbd;I)Le;")
	public static Pix8 makePix8(Js5 arg0, int arg1) {
		return depack(arg0, arg1) ? makePix8() : null;
	}

    @ObfuscatedName("ec.a(Lbd;BLa;La;)[Le;")
    public static Pix8[] makePix8Array(Js5 arg0, JagString arg1, JagString arg2) {
        int var3 = arg0.getGroupId(arg1);
        int var4 = arg0.getFileId(var3, arg2);
        return makePix8Array(arg0, var4, var3);
    }

	@ObfuscatedName("ib.a(ILbd;II)[Le;")
	public static Pix8[] makePix8Array(Js5 arg0, int arg1, int arg2) {
		return depack(arg1, arg2, arg0) ? makePix8Array() : null;
	}

	@ObfuscatedName("rc.a(BILbd;I)[Ljd;")
	public static Pix32[] makePix32Array(int arg0, Js5 arg1, int arg2) {
		return depack(arg2, arg0, arg1) ? makePix32Array() : null;
	}

	@ObfuscatedName("d.a(IBLbd;I)Lbc;")
	public static PixFont makePixFont(int arg0, Js5 arg1, int arg2) {
		return depack(arg0, arg2, arg1) ? makePixFont() : null;
	}

	@ObfuscatedName("h.b(Z)V")
	public static void reset() {
		wi = null;
		bspr = null;
		hi = null;
		yof = null;
		bpal = null;
		xof = null;
	}

	@ObfuscatedName("rc.a(IILbd;I)Z")
	public static boolean depack(int arg0, int arg1, Js5 arg2) {
		byte[] var3 = arg2.getFile(arg0, arg1);
		if (var3 == null) {
			return false;
		} else {
			depack(var3);
			return true;
		}
	}

	@ObfuscatedName("ba.a(ILbd;I)Z")
	public static boolean depack(Js5 arg0, int arg1) {
		byte[] var2 = arg0.getFile(arg1);
		if (var2 == null) {
			return false;
		} else {
			depack(var2);
			return true;
		}
	}
}
