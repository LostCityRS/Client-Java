package jagex3.graphics;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class PixLoader {
	@ObfuscatedName("bd.a([BI)V")
	public static void method229(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		Statics.field1900 = var1.method145();
		Statics.field1985 = new int[Statics.field1900];
		Statics.field2794 = new byte[Statics.field1900][];
		Statics.field837 = new int[Statics.field1900];
		Statics.field3194 = new int[Statics.field1900];
		Statics.field2771 = new int[Statics.field1900];
		var1.pos = arg0.length - Statics.field1900 * 8 - 7;
		Statics.field2877 = var1.method145();
		Statics.field1628 = var1.method145();
		int var2 = (var1.method144() & 0xFF) + 1;
		for (int var3 = 0; var3 < Statics.field1900; var3++) {
			Statics.field2771[var3] = var1.method145();
		}
		for (int var4 = 0; var4 < Statics.field1900; var4++) {
			Statics.field1985[var4] = var1.method145();
		}
		for (int var5 = 0; var5 < Statics.field1900; var5++) {
			Statics.field837[var5] = var1.method145();
		}
		for (int var6 = 0; var6 < Statics.field1900; var6++) {
			Statics.field3194[var6] = var1.method145();
		}
		var1.pos = arg0.length + 3 - Statics.field1900 * 8 - var2 * 3 - 7;
		Statics.field292 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			Statics.field292[var7] = var1.method164();
			if (Statics.field292[var7] == 0) {
				Statics.field292[var7] = 1;
			}
		}
		var1.pos = 0;
		for (int var8 = 0; var8 < Statics.field1900; var8++) {
			int var9 = Statics.field3194[var8];
			int var10 = Statics.field837[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			Statics.field2794[var8] = var12;
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
		var0.field1479 = Statics.field2877;
		var0.field1477 = Statics.field1628;
		var0.field1478 = Statics.field2771[0];
		var0.field1474 = Statics.field1985[0];
		var0.field1476 = Statics.field837[0];
		var0.field1475 = Statics.field3194[0];
		byte[] var1 = Statics.field2794[0];
		int var2 = var0.field1476 * var0.field1475;
		var0.field1480 = new int[var2];
		for (int var3 = 0; var3 < var2; var3++) {
			var0.field1480[var3] = Statics.field292[var1[var3] & 0xFF];
		}
		Statics.method449();
		return var0;
	}

	@ObfuscatedName("id.a(Lbd;ILa;La;)Lbc;")
	public static PixFont method528(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg2);
		int var4 = arg0.method224(var3, arg1);
		return Statics.method294(var4, arg0, var3);
	}

	@ObfuscatedName("qb.a(ILbd;ZI)Ljd;")
	public static Pix32 method846(int arg0, Js5 arg1, int arg2) {
		return Statics.method885(arg0, arg2, arg1) ? method458() : null;
	}

	@ObfuscatedName("kc.a(La;La;Lbd;B)Le;")
	public static Pix8 method605(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method228(arg0);
		int var4 = arg2.method224(var3, arg1);
		return method609(arg2, var4, var3);
	}

	@ObfuscatedName("uc.d(B)[Ljd;")
	public static Pix32[] method998() {
		Pix32[] var0 = new Pix32[Statics.field1900];
		for (int var1 = 0; var1 < Statics.field1900; var1++) {
			Pix32 var2 = var0[var1] = new Pix32();
			var2.field1479 = Statics.field2877;
			var2.field1477 = Statics.field1628;
			var2.field1478 = Statics.field2771[var1];
			var2.field1474 = Statics.field1985[var1];
			var2.field1476 = Statics.field837[var1];
			var2.field1475 = Statics.field3194[var1];
			byte[] var3 = Statics.field2794[var1];
			int var4 = var2.field1476 * var2.field1475;
			var2.field1480 = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				var2.field1480[var5] = Statics.field292[var3[var5] & 0xFF];
			}
		}
		Statics.method449();
		return var0;
	}

	@ObfuscatedName("be.a(Lbd;ILa;La;)[Ljd;")
	public static Pix32[] method245(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method228(arg1);
		int var4 = arg0.method224(var3, arg2);
		return Statics.method881(var3, arg0, var4);
	}

	@ObfuscatedName("td.a(I)Lbc;")
	public static PixFont method965() {
		PixFont var0 = new PixFont(Statics.field1985, Statics.field837, Statics.field3194, Statics.field292, Statics.field2794);
		Statics.method449();
		return var0;
	}

	@ObfuscatedName("kc.a(Lbd;BII)Le;")
	public static Pix8 method609(Js5 arg0, int arg1, int arg2) {
		return Statics.method885(arg1, arg2, arg0) ? method467() : null;
	}

	@ObfuscatedName("hb.b(I)Le;")
	public static Pix8 method467() {
		Pix8 var0 = new Pix8();
		var0.field746 = Statics.field2877;
		var0.field747 = Statics.field1628;
		var0.field751 = Statics.field2771[0];
		var0.field750 = Statics.field1985[0];
		var0.field744 = Statics.field837[0];
		var0.field749 = Statics.field3194[0];
		var0.field745 = Statics.field292;
		var0.field748 = Statics.field2794[0];
		Statics.method449();
		return var0;
	}

	@ObfuscatedName("uc.d(I)[Le;")
	public static Pix8[] method994() {
		Pix8[] var0 = new Pix8[Statics.field1900];
		for (int var1 = 0; var1 < Statics.field1900; var1++) {
			Pix8 var2 = var0[var1] = new Pix8();
			var2.field746 = Statics.field2877;
			var2.field747 = Statics.field1628;
			var2.field751 = Statics.field2771[var1];
			var2.field750 = Statics.field1985[var1];
			var2.field744 = Statics.field837[var1];
			var2.field749 = Statics.field3194[var1];
			var2.field745 = Statics.field292;
			var2.field748 = Statics.field2794[var1];
		}
		Statics.method449();
		return var0;
	}
}
