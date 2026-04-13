package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class PixLoader {
	@ObfuscatedName("md.Lb")
	public static int field1900;
	@ObfuscatedName("nb.wc")
	public static int[] field1985;
	@ObfuscatedName("se.v")
	public static byte[][] field2794;
	@ObfuscatedName("f.k")
	public static int[] field837;
	@ObfuscatedName("vd.Md")
	public static int[] field3194;
	@ObfuscatedName("sd.r")
	public static int[] field2771;
	@ObfuscatedName("ta.rc")
	public static int field2877;
	@ObfuscatedName("kd.E")
	public static int field1628;
	@ObfuscatedName("ba.Wb")
	public static int[] field292;

	@ObfuscatedName("bd.a([BI)V")
	public static void method229(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		field1900 = var1.method145();
		field1985 = new int[field1900];
		field2794 = new byte[field1900][];
		field837 = new int[field1900];
		field3194 = new int[field1900];
		field2771 = new int[field1900];
		var1.pos = arg0.length - field1900 * 8 - 7;
		field2877 = var1.method145();
		field1628 = var1.method145();
		int var2 = (var1.method144() & 0xFF) + 1;
		for (int var3 = 0; var3 < field1900; var3++) {
			field2771[var3] = var1.method145();
		}
		for (int var4 = 0; var4 < field1900; var4++) {
			field1985[var4] = var1.method145();
		}
		for (int var5 = 0; var5 < field1900; var5++) {
			field837[var5] = var1.method145();
		}
		for (int var6 = 0; var6 < field1900; var6++) {
			field3194[var6] = var1.method145();
		}
		var1.pos = arg0.length + 3 - field1900 * 8 - var2 * 3 - 7;
		field292 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			field292[var7] = var1.method164();
			if (field292[var7] == 0) {
				field292[var7] = 1;
			}
		}
		var1.pos = 0;
		for (int var8 = 0; var8 < field1900; var8++) {
			int var9 = field3194[var8];
			int var10 = field837[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			field2794[var8] = var12;
			int var13 = var1.method144();
			if (var13 == 0) {
				for (int var16 = 0; var16 < var11; var16++) {
					var12[var16] = var1.method184();
				}
			} else if (var13 == 1) {
				for (int var14 = 0; var14 < var10; var14++) {
					for (int var15 = 0; var15 < var9; var15++) {
						var12[var10 * var15 + var14] = var1.method184();
					}
				}
			}
		}
	}

	@ObfuscatedName("h.j(I)Ljd;")
	public static Pix32 method458() {
		Pix32 var0 = new Pix32();
		var0.field1479 = field2877;
		var0.field1477 = field1628;
		var0.field1478 = field2771[0];
		var0.field1474 = field1985[0];
		var0.field1476 = field837[0];
		var0.field1475 = field3194[0];
		byte[] var1 = field2794[0];
		int var2 = var0.field1476 * var0.field1475;
		var0.field1480 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			var0.field1480[var3] = field292[var1[var3] & 0xFF];
		}
		method449();
		return var0;
	}

	@ObfuscatedName("id.a(Lbd;ILa;La;)Lbc;")
	public static PixFont method528(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg2);
		int var4 = arg0.method224(var3, arg1);
		return method294(var4, arg0, var3);
	}

	@ObfuscatedName("qb.a(ILbd;ZI)Ljd;")
	public static Pix32 method846(int arg0, Js5 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method458() : null;
	}

	@ObfuscatedName("kc.a(La;La;Lbd;B)Le;")
	public static Pix8 method605(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method228(arg0);
		int var4 = arg2.method224(var3, arg1);
		return method609(arg2, var4, var3);
	}

	@ObfuscatedName("uc.d(B)[Ljd;")
	public static Pix32[] method998() {
		Pix32[] var0 = new Pix32[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			Pix32 var2 = var0[var1] = new Pix32();
			var2.field1479 = field2877;
			var2.field1477 = field1628;
			var2.field1478 = field2771[var1];
			var2.field1474 = field1985[var1];
			var2.field1476 = field837[var1];
			var2.field1475 = field3194[var1];
			byte[] var3 = field2794[var1];
			int var4 = var2.field1476 * var2.field1475;
			var2.field1480 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				var2.field1480[var5] = field292[var3[var5] & 0xFF];
			}
		}
		method449();
		return var0;
	}

	@ObfuscatedName("be.a(Lbd;ILa;La;)[Ljd;")
	public static Pix32[] method245(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method881(var3, arg0, var4);
	}

	@ObfuscatedName("td.a(I)Lbc;")
	public static PixFont method965() {
		PixFont var0 = new PixFont(field1985, field837, field3194, field292, field2794);
		method449();
		return var0;
	}

	@ObfuscatedName("kc.a(Lbd;BII)Le;")
	public static Pix8 method609(Js5 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method467() : null;
	}

	@ObfuscatedName("hb.b(I)Le;")
	public static Pix8 method467() {
		Pix8 var0 = new Pix8();
		var0.field746 = field2877;
		var0.field747 = field1628;
		var0.field751 = field2771[0];
		var0.field750 = field1985[0];
		var0.field744 = field837[0];
		var0.field749 = field3194[0];
		var0.field745 = field292;
		var0.field748 = field2794[0];
		method449();
		return var0;
	}

	@ObfuscatedName("uc.d(I)[Le;")
	public static Pix8[] method994() {
		Pix8[] var0 = new Pix8[field1900];
		for (int var1 = 0; var1 < field1900; var1++) {
			Pix8 var2 = var0[var1] = new Pix8();
			var2.field746 = field2877;
			var2.field747 = field1628;
			var2.field751 = field2771[var1];
			var2.field750 = field1985[var1];
			var2.field744 = field837[var1];
			var2.field749 = field3194[var1];
			var2.field745 = field292;
			var2.field748 = field2794[var1];
		}
		method449();
		return var0;
	}

	@ObfuscatedName("wa.a(Lbd;La;BLa;)Ljd;")
	public static Pix32 method1038(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return method846(var4, arg0, var3);
	}

	@ObfuscatedName("j.a(ILbd;I)Le;")
	public static Pix8 method533(Js5 arg0, int arg1) {
		return method148(arg0, arg1) ? method467() : null;
	}

    @ObfuscatedName("ec.a(Lbd;BLa;La;)[Le;")
    public static Pix8[] method372(Js5 arg0, JagString arg1, JagString arg2) {
        int var3 = arg0.method228(arg1);
        int var4 = arg0.method224(var3, arg2);
        return method518(arg0, var4, var3);
    }

	@ObfuscatedName("ib.a(ILbd;II)[Le;")
	public static Pix8[] method518(Js5 arg0, int arg1, int arg2) {
		return method885(arg1, arg2, arg0) ? method994() : null;
	}

	@ObfuscatedName("rc.a(BILbd;I)[Ljd;")
	public static Pix32[] method881(int arg0, Js5 arg1, int arg2) {
		return method885(arg2, arg0, arg1) ? method998() : null;
	}

	@ObfuscatedName("d.a(IBLbd;I)Lbc;")
	public static PixFont method294(int arg0, Js5 arg1, int arg2) {
		return method885(arg0, arg2, arg1) ? method965() : null;
	}

	@ObfuscatedName("h.b(Z)V")
	public static void method449() {
		field837 = null;
		field2794 = null;
		field3194 = null;
		field1985 = null;
		field292 = null;
		field2771 = null;
	}

	@ObfuscatedName("rc.a(IILbd;I)Z")
	public static boolean method885(int arg0, int arg1, Js5 arg2) {
		byte[] var3 = arg2.method217(arg0, arg1);
		if (var3 == null) {
			return false;
		} else {
			method229(var3);
			return true;
		}
	}

	@ObfuscatedName("ba.a(ILbd;I)Z")
	public static boolean method148(Js5 arg0, int arg1) {
		byte[] var2 = arg0.method232(arg1);
		if (var2 == null) {
			return false;
		} else {
			method229(var2);
			return true;
		}
	}
}
