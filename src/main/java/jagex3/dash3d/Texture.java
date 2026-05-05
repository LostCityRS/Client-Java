package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("b")
public final class Texture {

	@ObfuscatedName("q.Mc")
	public static final int[] field3507 = new int[256];
	@ObfuscatedName("we.y")
	public static TextureProvider field4488;
	@ObfuscatedName("de.B")
	public static Js5 field684;
	@ObfuscatedName("gd.v")
	public static int field1276;
	@ObfuscatedName("bj.xb")
	public static int[] field351;
	@ObfuscatedName("di.gb")
	public static int field738;
	@ObfuscatedName("cd.j")
	public static int field460;
	@ObfuscatedName("e.fb")
	public static int field789;
	@ObfuscatedName("kb.o")
	public static int[] field2021;
	@ObfuscatedName("ub.ab")
	public static int field4158;
	@ObfuscatedName("tg.i")
	public static double field4041 = -1.0D;
	@ObfuscatedName("b.a")
	public final TextureOp[] field168;

	@ObfuscatedName("b.c")
	public final TextureOp field170;

	@ObfuscatedName("b.f")
	public final int[] field173;

	@ObfuscatedName("b.l")
	public final TextureOp field179;

	@ObfuscatedName("b.q")
	public final int[] field184;

	public Texture() {
		this.field173 = new int[0];
		this.field184 = new int[0];
		this.field179 = new TextureOp0();
		this.field179.field363 = 1;
		this.field170 = new TextureOp0();
		this.field168 = new TextureOp[] { this.field179, this.field170 };
		this.field170.field363 = 1;
	}

	public Texture(Packet arg0) {
		int var2 = arg0.g1();
		this.field168 = new TextureOp[var2];
		int var3 = 0;
		int var4 = 0;
		int[][] var5 = new int[var2][];
		for (int var6 = 0; var6 < var2; var6++) {
			TextureOp var7 = method674(arg0);
			if (var7.method124() >= 0) {
				var4++;
			}
			if (var7.method129() >= 0) {
				var3++;
			}
			int var8 = var7.field376.length;
			var5[var6] = new int[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				var5[var6][var9] = arg0.g1();
			}
			this.field168[var6] = var7;
		}
		this.field173 = new int[var4];
		this.field184 = new int[var3];
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < var2; var12++) {
			TextureOp var13 = this.field168[var12];
			int var14 = var13.field376.length;
			for (int var15 = 0; var15 < var14; var15++) {
				var13.field376[var15] = this.field168[var5[var12][var15]];
			}
			int var16 = var13.method124();
			int var17 = var13.method129();
			if (var16 > 0) {
				this.field173[var10++] = var16;
			}
			if (var17 > 0) {
				this.field184[var11++] = var17;
			}
			var5[var12] = null;
		}
		this.field179 = this.field168[arg0.g1()];
		this.field170 = this.field168[arg0.g1()];
	}

	@ObfuscatedName("vd.a(IB)Lc;")
	public static TextureOp method1552(int arg0) {
		if (arg0 == 0) {
			return new TextureOp0();
		} else if (arg0 == 1) {
			return new TextureOp1();
		} else if (arg0 == 2) {
			return new TextureOp2();
		} else if (arg0 == 3) {
			return new TextureOp3();
		} else if (arg0 == 4) {
			return new TextureOp4();
		} else if (arg0 == 5) {
			return new TextureOp5();
		} else if (arg0 == 6) {
			return new TextureOp6();
		} else if (arg0 == 7) {
			return new TextureOp7();
		} else if (arg0 == 8) {
			return new TextureOp8();
		} else if (arg0 == 9) {
			return new TextureOp9();
		} else if (arg0 == 10) {
			return new TextureOp10();
		} else if (arg0 == 11) {
			return new TextureOp11();
		} else if (arg0 == 12) {
			return new TextureOp12();
		} else if (arg0 == 13) {
			return new TextureOp13();
		} else if (arg0 == 14) {
			return new TextureOp14();
		} else if (arg0 == 15) {
			return new TextureOp15();
		} else if (arg0 == 16) {
			return new TextureOp16();
		} else if (arg0 == 17) {
			return new TextureOp17();
		} else if (arg0 == 18) {
			return new TextureOp18();
		} else if (arg0 == 19) {
			return new TextureOp19();
		} else if (arg0 == 20) {
			return new TextureOp20();
		} else if (arg0 == 21) {
			return new TextureOp21();
		} else if (arg0 == 22) {
			return new TextureOp22();
		} else if (arg0 == 23) {
			return new TextureOp23();
		} else if (arg0 == 24) {
			return new TextureOp24();
		} else if (arg0 == 25) {
			return new TextureOp25();
		} else if (arg0 == 26) {
			return new TextureOp26();
		} else if (arg0 == 27) {
			return new TextureOp27();
		} else if (arg0 == 28) {
			return new TextureOp28();
		} else if (arg0 == 29) {
			return new TextureOp29();
		} else if (arg0 == 30) {
			return new TextureOp30();
		} else if (arg0 == 31) {
			return new TextureOp31();
		} else if (arg0 == 32) {
			return new TextureOp32();
		} else if (arg0 == 33) {
			return new TextureOp33();
		} else if (arg0 == 34) {
			return new TextureOp34();
		} else if (arg0 == 35) {
			return new TextureOp35();
		} else if (arg0 == 36) {
			return new TextureOp36();
		} else if (arg0 == 37) {
			return new TextureOp37();
		} else if (arg0 == 38) {
			return new TextureOp38();
		} else if (arg0 == 39) {
			return new TextureOp39();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ig.a(ILea;)Lc;")
	public static TextureOp method674(Packet arg0) {
		arg0.g1();
		int var1 = arg0.g1();
		TextureOp var2 = method1552(var1);
		var2.field363 = arg0.g1();
		int var3 = arg0.g1();
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = arg0.g1();
			var2.method11(arg0, var5);
		}
		var2.method123();
		return var2;
	}

	@ObfuscatedName("dj.a(DB)V")
	public static void method282(double arg0) {
		if (field4041 == arg0) {
			return;
		}
		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = (int) (Math.pow((double) var2 / 255.0D, arg0) * 255.0D);
			field3507[var2] = var3 <= 255 ? var3 : 255;
		}
		field4041 = arg0;
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
			field2021 = field351;
		} else {
			field2021 = new int[arg1];
			for (int var3 = 0; var3 < arg1; var3++) {
				field2021[var3] = (var3 << 12) / arg1;
			}
		}
		field460 = arg1;
		field4158 = arg1 - 1;
	}

	@ObfuscatedName("b.a(DIZLnb;Lfe;IIZ)[I")
	public int[] method60(double arg0, int arg1, boolean arg2, Js5 arg3, TextureProvider arg4, int arg5, boolean arg6) {
		method282(arg0);
		field4488 = arg4;
		field684 = arg3;
		method802(arg1, arg5);
		for (int var9 = 0; var9 < this.field168.length; var9++) {
			this.field168[var9].method128(arg1, arg5);
		}
		int[] var10 = new int[arg5 * arg1];
		int var11;
		int var12;
		byte var13;
		if (arg6) {
			var11 = -1;
			var12 = arg1 - 1;
			var13 = -1;
		} else {
			var12 = 0;
			var11 = arg1;
			var13 = 1;
		}
		int var14 = 0;
		for (int var15 = 0; var15 < arg5; var15++) {
			if (arg2) {
				var14 = var15;
			}
			int[] var17;
			int[] var18;
			int[] var19;
			if (this.field179.field369) {
				int[] var20 = this.field179.method54(var15);
				var18 = var20;
				var17 = var20;
				var19 = var20;
			} else {
				int[][] var16 = this.field179.method7(var15);
				var17 = var16[1];
				var18 = var16[0];
				var19 = var16[2];
			}
			for (int var21 = var12; var21 != var11; var21 += var13) {
				int var22 = var18[var21] >> 4;
				if (var22 > 255) {
					var22 = 255;
				}
				if (var22 < 0) {
					var22 = 0;
				}
				int var23 = field3507[var22];
				int var24 = var17[var21] >> 4;
				if (var24 > 255) {
					var24 = 255;
				}
				int var25 = var19[var21] >> 4;
				if (var24 < 0) {
					var24 = 0;
				}
				if (var25 > 255) {
					var25 = 255;
				}
				int var26 = field3507[var24];
				if (var25 < 0) {
					var25 = 0;
				}
				int var27 = field3507[var25];
				var10[var14++] = var27 + (var26 << 8) + (var23 << 16);
				if (arg2) {
					var14 += arg1 - 1;
				}
			}
		}
		for (int var28 = 0; var28 < this.field168.length; var28++) {
			this.field168[var28].method127();
		}
		return var10;
	}

	@ObfuscatedName("b.a(Lfe;Lnb;I)Z")
	public boolean method63(TextureProvider arg0, Js5 arg1) {
		for (int var3 = 0; var3 < this.field173.length; var3++) {
			if (!arg1.requestDownload(this.field173[var3])) {
				return false;
			}
		}
		for (int var4 = 0; var4 < this.field184.length; var4++) {
			if (!arg0.method439(this.field184[var4])) {
				return false;
			}
		}
		return true;
	}
}
