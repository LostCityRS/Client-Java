package deob;

public class PixLoader {
	@ObfuscatedName("pi.db")
	public static int field3345;
	@ObfuscatedName("g.p")
	public static int[] field1218;
	@ObfuscatedName("kg.gb")
	public static byte[][] field2104;
	@ObfuscatedName("md.W")
	public static int[] field2510;
	@ObfuscatedName("wh.W")
	public static int[] field4528;
	@ObfuscatedName("jd.h")
	public static int[] field1851;
	@ObfuscatedName("bc.h")
	public static int field229;
	@ObfuscatedName("li.P")
	public static int field2424;
	@ObfuscatedName("cd.f")
	public static int[] field456;

	@ObfuscatedName("we.a(I[B)V")
	public static void depack(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		var1.pos = arg0.length - 2;
		field3345 = var1.g2();
		field1218 = new int[field3345];
		field2104 = new byte[field3345][];
		field2510 = new int[field3345];
		field4528 = new int[field3345];
		field1851 = new int[field3345];
		var1.pos = arg0.length - field3345 * 8 - 7;
		field229 = var1.g2();
		field2424 = var1.g2();
		int var2 = (var1.g1() & 0xFF) + 1;
		for (int var3 = 0; var3 < field3345; var3++) {
			field4528[var3] = var1.g2();
		}
		for (int var4 = 0; var4 < field3345; var4++) {
			field2510[var4] = var1.g2();
		}
		for (int var5 = 0; var5 < field3345; var5++) {
			field1851[var5] = var1.g2();
		}
		for (int var6 = 0; var6 < field3345; var6++) {
			field1218[var6] = var1.g2();
		}
		var1.pos = arg0.length - field3345 * 8 - (var2 + -1) * 3 - 7;
		field456 = new int[var2];
		for (int var7 = 1; var7 < var2; var7++) {
			field456[var7] = var1.g3();
			if (field456[var7] == 0) {
				field456[var7] = 1;
			}
		}
		var1.pos = 0;
		for (int var8 = 0; var8 < field3345; var8++) {
			int var9 = field1218[var8];
			int var10 = field1851[var8];
			int var11 = var9 * var10;
			byte[] var12 = new byte[var11];
			field2104[var8] = var12;
			int var13 = var1.g1();
			if (var13 == 0) {
				for (int var14 = 0; var14 < var11; var14++) {
					var12[var14] = var1.method324();
				}
			} else if (var13 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var9; var16++) {
						var12[var16 * var10 + var15] = var1.method324();
					}
				}
			}
		}
	}

	@ObfuscatedName("q.a(B)[Lrh;")
	public static SoftwarePix8[] method1243() {
		SoftwarePix8[] var0 = new SoftwarePix8[field3345];
		for (int var1 = 0; var1 < field3345; var1++) {
			var0[var1] = new SoftwarePix8(field229, field2424, field4528[var1], field2510[var1], field1851[var1], field1218[var1], field2104[var1], field456);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("pa.a(I)Lrh;")
	public static SoftwarePix8 method1129() {
		SoftwarePix8 var0 = new SoftwarePix8(field229, field2424, field4528[0], field2510[0], field1851[0], field1218[0], field2104[0], field456);
		method1578();
		return var0;
	}

	@ObfuscatedName("cd.b(B)Llj;")
	public static Pix8 method170() {
		SoftwarePix8 var0 = new SoftwarePix8(field229, field2424, field4528[0], field2510[0], field1851[0], field1218[0], field2104[0], field456);
		method1578();
		return var0;
	}

	@ObfuscatedName("db.a(B[B)Lcc;")
	public static PixfontGeneric method241(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			SoftwarePixFont var1 = new SoftwarePixFont(arg0, field4528, field2510, field1851, field1218, field2104);
			method1578();
			return var1;
		}
	}

	@ObfuscatedName("d.d(B)[Lpf;")
	public static SoftwarePix32[] method229() {
		SoftwarePix32[] var0 = new SoftwarePix32[field3345];
		for (int var1 = 0; var1 < field3345; var1++) {
			int var2 = field1851[var1] * field1218[var1];
			byte[] var3 = field2104[var1];
			int[] var4 = new int[var2];
			for (int var5 = 0; var5 < var2; var5++) {
				var4[var5] = field456[var3[var5] & 0xFF];
			}
			var0[var1] = new SoftwarePix32(field229, field2424, field4528[var1], field2510[var1], field1851[var1], field1218[var1], var4);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("bi.a(B)[Lrc;")
	public static Pix32[] method100() {
		Pix32[] var0 = new Pix32[field3345];
		for (int var1 = 0; var1 < field3345; var1++) {
			int var2 = field1218[var1] * field1851[var1];
			int[] var3 = new int[var2];
			byte[] var4 = field2104[var1];
			for (int var5 = 0; var5 < var2; var5++) {
				var3[var5] = field456[var4[var5] & 0xFF];
			}
			var0[var1] = new SoftwarePix32(field229, field2424, field4528[var1], field2510[var1], field1851[var1], field1218[var1], var3);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("vh.d(I)Lpf;")
	public static SoftwarePix32 method1571() {
		byte[] var0 = field2104[0];
		int var1 = field1851[0] * field1218[0];
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = field456[var0[var3] & 0xFF];
		}
		SoftwarePix32 var4 = new SoftwarePix32(field229, field2424, field4528[0], field2510[0], field1851[0], field1218[0], var2);
		method1578();
		return var4;
	}

	@ObfuscatedName("re.a(B)[Llj;")
	public static Pix8[] method1323() {
		Pix8[] var0 = new Pix8[field3345];
		for (int var1 = 0; var1 < field3345; var1++) {
			var0[var1] = new SoftwarePix8(field229, field2424, field4528[var1], field2510[var1], field1851[var1], field1218[var1], field2104[var1], field456);
		}
		method1578();
		return var0;
	}

	@ObfuscatedName("re.a(IBLnb;I)[Llj;")
	public static Pix8[] method1325(int arg0, Js5 arg1, int arg2) {
		return method358(arg1, arg0, arg2) ? method1323() : null;
	}

	@ObfuscatedName("re.a(IILnb;B)[Lrh;")
	public static SoftwarePix8[] method1322(int arg0, int arg1, Js5 arg2) {
		return method358(arg2, arg0, arg1) ? method1243() : null;
	}

	@ObfuscatedName("sg.b(B)Lrc;")
	public static Pix32 method1393() {
		byte[] var0 = field2104[0];
		int var1 = field1851[0] * field1218[0];
		int[] var2 = new int[var1];
		for (int var3 = 0; var3 < var1; var3++) {
			var2[var3] = field456[var0[var3] & 0xFF];
		}
		SoftwarePix32 var4 = new SoftwarePix32(field229, field2424, field4528[0], field2510[0], field1851[0], field1218[0], var2);
		method1578();
		return var4;
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1578() {
		field4528 = null;
		field1218 = null;
		field2510 = null;
		field2104 = null;
		field456 = null;
		field1851 = null;
	}

	@ObfuscatedName("eb.a(ILnb;II)Z")
	public static boolean method358(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg2, arg1);
		if (var3 == null) {
			return false;
		} else {
			depack(var3);
			return true;
		}
	}

	@ObfuscatedName("ve.a(Lnb;ZII)Lrc;")
	public static Pix32 method1558(Js5 arg0, int arg1, int arg2) {
		return method358(arg0, arg1, arg2) ? method1393() : null;
	}

	@ObfuscatedName("d.a(ILnb;II)[Lrc;")
	public static Pix32[] method230(int arg0, Js5 arg1, int arg2) {
		return method358(arg1, arg2, arg0) ? method100() : null;
	}

	@ObfuscatedName("jh.a(ILnb;IILnb;)Lcc;")
	public static PixfontGeneric method735(int arg0, Js5 arg1, int arg2, Js5 arg3) {
		return method358(arg3, arg2, arg0) ? method241(arg1.getFile(arg0, arg2)) : null;
	}

	@ObfuscatedName("fd.a(Lnb;Lnb;Li;ILi;)Lcc;")
	public static PixfontGeneric method429(Js5 arg0, Js5 arg1, JagString arg2, JagString arg3) {
		int var4 = arg1.method964(arg3);
		int var5 = arg1.method966(arg2, var4);
		return method735(var5, arg0, var4, arg1);
	}

	@ObfuscatedName("a.a(Li;BLnb;Li;)[Llj;")
	public static Pix8[] method2(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method964(arg0);
		int var4 = arg1.method966(arg2, var3);
		return method1325(var3, arg1, var4);
	}

	@ObfuscatedName("w.a(ILnb;II)[Lpf;")
	public static SoftwarePix32[] method1583(int arg0, Js5 arg1, int arg2) {
		return method358(arg1, arg2, arg0) ? method229() : null;
	}

	@ObfuscatedName("w.a(Li;ZLnb;Li;)[Lrc;")
	public static Pix32[] method1582(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method964(arg0);
		int var4 = arg1.method966(arg2, var3);
		return method230(var4, arg1, var3);
	}

	@ObfuscatedName("ab.a(Li;ZLi;Lnb;)[Lpf;")
	public static SoftwarePix32[] method15(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return method1583(var4, arg2, var3);
	}

	@ObfuscatedName("ci.a(ZLnb;II)Lpf;")
	public static SoftwarePix32 method203(Js5 arg0, int arg1, int arg2) {
		return method358(arg0, arg2, arg1) ? method1571() : null;
	}

	@ObfuscatedName("dc.a(Lnb;BI)Lpf;")
	public static SoftwarePix32 method250(Js5 arg0, int arg1) {
		return method1451(arg1, arg0) ? method1571() : null;
	}

	@ObfuscatedName("tg.a(IILnb;I)Llj;")
	public static Pix8 method1454(int arg0, Js5 arg1) {
		return method358(arg1, arg0, 0) ? method170() : null;
	}

	@ObfuscatedName("jc.a(Lnb;BI)[Llj;")
	public static Pix8[] method700(Js5 arg0, int arg1) {
		return method1451(arg1, arg0) ? method1323() : null;
	}

	@ObfuscatedName("ne.a(ILi;Li;Lnb;)[Lrh;")
	public static SoftwarePix8[] method981(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return method1322(var3, var4, arg2);
	}

	@ObfuscatedName("uc.a(Li;Li;BLnb;)Lrc;")
	public static Pix32 method1490(JagString arg0, JagString arg1, Js5 arg2) {
		int var3 = arg2.method964(arg0);
		int var4 = arg2.method966(arg1, var3);
		return method1558(arg2, var3, var4);
	}

	@ObfuscatedName("ah.a(Li;BLnb;Li;)Lpf;")
	public static SoftwarePix32 method49(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method964(arg0);
		int var4 = arg1.method966(arg2, var3);
		return method203(arg1, var4, var3);
	}

	@ObfuscatedName("te.a(BILnb;)Z")
	public static boolean method1451(int arg0, Js5 arg1) {
		byte[] var2 = arg1.method956(arg0);
		if (var2 == null) {
			return false;
		} else {
			depack(var2);
			return true;
		}
	}

	@ObfuscatedName("lb.a(Lnb;II)[Lrh;")
	public static SoftwarePix8[] method830(Js5 arg0, int arg1) {
		return method1451(arg1, arg0) ? method1243() : null;
	}

	@ObfuscatedName("lb.a(BILnb;)Llj;")
	public static Pix8 method826(int arg0, Js5 arg1) {
		return method1451(arg0, arg1) ? method170() : null;
	}
}
