package deob;

@ObfuscatedName("vc")
public final class class149 extends class13 {

	@ObfuscatedName("vc.ab")
	public int[] field3385;

	@ObfuscatedName("vc.bb")
	public int field3386 = -1;

	@ObfuscatedName("vc.cb")
	public int[] field3387;

	@ObfuscatedName("vc.eb")
	public int field3389 = 99;

	@ObfuscatedName("vc.fb")
	public int field3390 = -1;

	@ObfuscatedName("vc.ib")
	public int[] field3393;

	@ObfuscatedName("vc.jb")
	public static int field3394 = 0;

	@ObfuscatedName("vc.kb")
	public int field3395 = 2;

	@ObfuscatedName("vc.L")
	public static class32 field3370 = class73.method593("Your account is already logged in)3", true);

	@ObfuscatedName("vc.K")
	public static class32 field3369 = field3370;

	@ObfuscatedName("vc.U")
	public static class32 field3379 = class73.method593("jlv", true);

	@ObfuscatedName("vc.H")
	public int field3366 = -1;

	@ObfuscatedName("vc.W")
	public int field3381 = -1;

	@ObfuscatedName("vc.X")
	public int field3382 = -1;

	@ObfuscatedName("vc.Z")
	public int field3384 = 5;

	@ObfuscatedName("vc.M")
	public boolean field3371 = false;

	@ObfuscatedName("vc.Y")
	public static byte field3383;

	@ObfuscatedName("vc.N")
	public static class110 field3372;

	@ObfuscatedName("vc.J")
	public int[] field3368;

	@ObfuscatedName("vc.R")
	public int[] field3376;

	@ObfuscatedName("vc.a(IILec;)V")
	public static void method1108(int arg0, class32 arg1) {
		class32 var2 = arg1.method244().method264();
		boolean var3 = false;
		for (int var4 = 0; var4 < class62.field1404; var4++) {
			class70 var5 = class52.field1175[class137.field3187[var4]];
			if (var5 != null && var5.field1659 != null && var5.field1659.method271(var2)) {
				class94.method747(false, 0, class20.field373.field2736[0], 0, 1, var5.field2759[0], class20.field373.field2759[0], 0, var5.field2736[0], 1, 2);
				var3 = true;
				if (arg0 == 1) {
					class44.field1026.method356(35);
					class44.field1026.method546(class137.field3187[var4]);
				} else if (arg0 == 4) {
					class44.field1026.method356(81);
					class44.field1026.method504(class137.field3187[var4]);
				} else if (arg0 == 6) {
					class44.field1026.method356(193);
					class44.field1026.method513(class137.field3187[var4]);
				} else if (arg0 == 7) {
					class44.field1026.method356(138);
					class44.field1026.method548(class137.field3187[var4]);
				}
				break;
			}
		}
		if (!var3) {
			class79.method628(class52.method402(new class32[] { class97.field2238, var2 }), 0, class77.field1786);
		}
	}

	@ObfuscatedName("vc.a(JI)V")
	public static void method1112(long arg0) {
		if (arg0 != 0L) {
			class44.field1026.method356(23);
			class44.field1026.method541(arg0);
		}
	}

	@ObfuscatedName("vc.b(Ljd;B)V")
	public void method1107(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method1110(arg0, var2);
		}
	}

	@ObfuscatedName("vc.a(IILod;B)Lod;")
	public class101 method1109(int arg0, int arg1, class101 arg2) {
		int var4 = this.field3393[arg1];
		class121 var5 = class86.method666(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg2.method799(true);
		}
		int var7 = arg0 & 0x3;
		class101 var8 = arg2.method799(!var5.method958(var6));
		if (var7 == 1) {
			var8.method812();
		} else if (var7 == 2) {
			var8.method803();
		} else if (var7 == 3) {
			var8.method801();
		}
		var8.method810(var5, var6);
		if (var7 == 1) {
			var8.method801();
		} else if (var7 == 2) {
			var8.method803();
		} else if (var7 == 3) {
			var8.method812();
		}
		return var8;
	}

	@ObfuscatedName("vc.a(Ljd;IB)V")
	public void method1110(class66 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method531();
			this.field3376 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field3376[var4] = arg0.method531();
			}
			this.field3393 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field3393[var5] = arg0.method531();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field3393[var6] += arg0.method531() << 16;
			}
		} else if (arg1 == 2) {
			this.field3386 = arg0.method531();
		} else if (arg1 == 3) {
			int var7 = arg0.method532();
			this.field3385 = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field3385[var8] = arg0.method532();
			}
			this.field3385[var7] = 9999999;
		} else if (arg1 == 4) {
			this.field3371 = true;
		} else if (arg1 == 5) {
			this.field3384 = arg0.method532();
		} else if (arg1 == 6) {
			this.field3390 = arg0.method531();
		} else if (arg1 == 7) {
			this.field3366 = arg0.method531();
		} else if (arg1 == 8) {
			this.field3389 = arg0.method532();
		} else if (arg1 == 9) {
			this.field3382 = arg0.method532();
		} else if (arg1 == 10) {
			this.field3381 = arg0.method532();
		} else if (arg1 == 11) {
			this.field3395 = arg0.method532();
		} else if (arg1 == 12) {
			int var9 = arg0.method532();
			this.field3387 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field3387[var10] = arg0.method531();
			}
			for (int var11 = 0; var11 < var9; var11++) {
				this.field3387[var11] = (arg0.method531() << 16) + this.field3387[var11];
			}
			return;
		} else if (arg1 == 13) {
			int var12 = arg0.method532();
			this.field3368 = new int[var12];
			for (int var13 = 0; var13 < var12; var13++) {
				this.field3368[var13] = arg0.method517();
			}
			return;
		}
	}

	@ObfuscatedName("vc.a(ZLod;I)Lod;")
	public class101 method1111(class101 arg0, int arg1) {
		int var3 = this.field3393[arg1];
		class121 var4 = class86.method666(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method820(true);
		} else {
			class101 var6 = arg0.method820(!var4.method958(var5));
			var6.method810(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("vc.a(IILod;)Lod;")
	public class101 method1113(int arg0, class101 arg1) {
		int var3 = this.field3393[arg0];
		class121 var4 = class86.method666(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method799(true);
		}
		class121 var6 = null;
		int var7 = 0;
		if (this.field3387 != null && arg0 < this.field3387.length) {
			int var8 = this.field3387[arg0];
			var6 = class86.method666(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			class101 var9 = arg1.method799(!var4.method958(var5));
			var9.method810(var4, var5);
			return var9;
		} else {
			class101 var10 = arg1.method799(!var4.method958(var5) & !var6.method958(var7));
			var10.method810(var4, var5);
			var10.method810(var6, var7);
			return var10;
		}
	}

	@ObfuscatedName("vc.a(ILvc;Lod;II)Lod;")
	public class101 method1114(int arg0, class149 arg1, class101 arg2, int arg3) {
		int var5 = this.field3393[arg3];
		class121 var6 = class86.method666(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.method1116(arg2, arg0);
		}
		int var8 = arg1.field3393[arg0];
		class121 var9 = class86.method666(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			class101 var11 = arg2.method799(!var6.method958(var7));
			var11.method810(var6, var7);
			return var11;
		} else {
			class101 var12 = arg2.method799(!var6.method958(var7) & !var9.method958(var10));
			var12.method814(var6, var7, var9, var10, this.field3385);
			return var12;
		}
	}

	@ObfuscatedName("vc.f(I)V")
	public void method1115() {
		if (this.field3382 == -1) {
			if (this.field3385 == null) {
				this.field3382 = 0;
			} else {
				this.field3382 = 2;
			}
		}
		if (this.field3381 != -1) {
			return;
		}
		if (this.field3385 == null) {
			this.field3381 = 0;
		} else {
			this.field3381 = 2;
		}
	}

	@ObfuscatedName("vc.a(Lod;II)Lod;")
	public class101 method1116(class101 arg0, int arg1) {
		int var3 = this.field3393[arg1];
		class121 var4 = class86.method666(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method799(true);
		} else {
			class101 var6 = arg0.method799(!var4.method958(var5));
			var6.method810(var4, var5);
			return var6;
		}
	}
}
