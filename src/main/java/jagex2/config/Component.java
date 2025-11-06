package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("d")
public class Component {

	@ObfuscatedName("d.c")
	public static Component[] field70;

	@ObfuscatedName("d.d")
	public int[] field71;

	@ObfuscatedName("d.e")
	public int[] field72;

	@ObfuscatedName("d.f")
	public int field73;

	@ObfuscatedName("d.g")
	public int field74;

	@ObfuscatedName("d.h")
	public int field75;

	@ObfuscatedName("d.i")
	public int field76;

	@ObfuscatedName("d.j")
	public int field77;

	@ObfuscatedName("d.k")
	public int field78;

	@ObfuscatedName("d.l")
	public int field79;

	@ObfuscatedName("d.m")
	public int field80;

	@ObfuscatedName("d.n")
	public int field81;

	@ObfuscatedName("d.o")
	public byte field82;

	@ObfuscatedName("d.p")
	public int field83;

	@ObfuscatedName("d.q")
	public int field84;

	@ObfuscatedName("d.r")
	public int[][] field85;

	@ObfuscatedName("d.s")
	public int[] field86;

	@ObfuscatedName("d.t")
	public int[] field87;

	@ObfuscatedName("d.u")
	public int field88;

	@ObfuscatedName("d.v")
	public int field89;

	@ObfuscatedName("d.w")
	public int field90;

	@ObfuscatedName("d.x")
	public boolean field91;

	@ObfuscatedName("d.y")
	public int[] field92;

	@ObfuscatedName("d.z")
	public int[] field93;

	@ObfuscatedName("d.ab")
	public int field120;

	@ObfuscatedName("d.bb")
	public int field121;

	@ObfuscatedName("d.cb")
	public int field122;

	@ObfuscatedName("d.db")
	public int field123;

	@ObfuscatedName("d.eb")
	public int field124;

	@ObfuscatedName("d.fb")
	public int field125;

	@ObfuscatedName("d.gb")
	public int field126;

	@ObfuscatedName("d.hb")
	public int field127;

	@ObfuscatedName("d.ib")
	public String field128;

	@ObfuscatedName("d.jb")
	public String field129;

	@ObfuscatedName("d.kb")
	public int field130;

	@ObfuscatedName("d.lb")
	public String field131;

	@ObfuscatedName("d.mb")
	public static LruCache field132 = new LruCache(30);

	@ObfuscatedName("d.nb")
	public static LruCache field133;

	@ObfuscatedName("d.H")
	public int field101;

	@ObfuscatedName("d.I")
	public int field102;

	@ObfuscatedName("d.T")
	public int field113;

	@ObfuscatedName("d.U")
	public int field114;

	@ObfuscatedName("d.V")
	public int field115;

	@ObfuscatedName("d.W")
	public int field116;

	@ObfuscatedName("d.Z")
	public int field119;

	@ObfuscatedName("d.B")
	public int field95;

	@ObfuscatedName("d.X")
	public Pix32 field117;

	@ObfuscatedName("d.Y")
	public Pix32 field118;

	@ObfuscatedName("d.Q")
	public PixFont field110;

	@ObfuscatedName("d.R")
	public String field111;

	@ObfuscatedName("d.S")
	public String field112;

	@ObfuscatedName("d.G")
	public boolean field100;

	@ObfuscatedName("d.N")
	public boolean field107;

	@ObfuscatedName("d.O")
	public boolean field108;

	@ObfuscatedName("d.P")
	public boolean field109;

	@ObfuscatedName("d.C")
	public boolean field96;

	@ObfuscatedName("d.D")
	public boolean field97;

	@ObfuscatedName("d.E")
	public boolean field98;

	@ObfuscatedName("d.F")
	public boolean field99;

	@ObfuscatedName("d.K")
	public int[] field104;

	@ObfuscatedName("d.L")
	public int[] field105;

	@ObfuscatedName("d.A")
	public int[] field94;

	@ObfuscatedName("d.J")
	public Pix32[] field103;

	@ObfuscatedName("d.M")
	public String[] field106;

	@ObfuscatedName("d.a(Lyb;I[Llb;Lyb;)V")
	public static void method32(JagFile arg0, PixFont[] arg2, JagFile arg3) {
		field133 = new LruCache(50000);
		Packet var4 = new Packet(arg3.method309("data", null));
		int var6 = -1;
		int var7 = var4.method241();
		field70 = new Component[var7];
		while (true) {
			Component var9;
			do {
				if (var4.field711 >= var4.field710.length) {
					field133 = null;
					return;
				}
				int var8 = var4.method241();
				if (var8 == 65535) {
					var6 = var4.method241();
					var8 = var4.method241();
				}
				var9 = field70[var8] = new Component();
				var9.field75 = var8;
				var9.field76 = var6;
				var9.field77 = var4.method239();
				var9.field78 = var4.method239();
				var9.field79 = var4.method241();
				var9.field80 = var4.method241();
				var9.field81 = var4.method241();
				var9.field82 = (byte) var4.method239();
				var9.field88 = var4.method239();
				if (var9.field88 == 0) {
					var9.field88 = -1;
				} else {
					var9.field88 = (var9.field88 - 1 << 8) + var4.method239();
				}
				int var10 = var4.method239();
				if (var10 > 0) {
					var9.field86 = new int[var10];
					var9.field87 = new int[var10];
					for (int var11 = 0; var11 < var10; var11++) {
						var9.field86[var11] = var4.method239();
						var9.field87[var11] = var4.method241();
					}
				}
				int var12 = var4.method239();
				if (var12 > 0) {
					var9.field85 = new int[var12][];
					for (int var13 = 0; var13 < var12; var13++) {
						int var14 = var4.method241();
						var9.field85[var13] = new int[var14];
						for (int var15 = 0; var15 < var14; var15++) {
							var9.field85[var13][var15] = var4.method241();
						}
					}
				}
				if (var9.field77 == 0) {
					var9.field89 = var4.method241();
					var9.field91 = var4.method239() == 1;
					int var16 = var4.method241();
					var9.field92 = new int[var16];
					var9.field93 = new int[var16];
					var9.field94 = new int[var16];
					for (int var17 = 0; var17 < var16; var17++) {
						var9.field92[var17] = var4.method241();
						var9.field93[var17] = var4.method242();
						var9.field94[var17] = var4.method242();
					}
				}
				if (var9.field77 == 1) {
					var9.field95 = var4.method241();
					var9.field96 = var4.method239() == 1;
				}
				if (var9.field77 == 2) {
					var9.field71 = new int[var9.field80 * var9.field81];
					var9.field72 = new int[var9.field80 * var9.field81];
					var9.field97 = var4.method239() == 1;
					var9.field98 = var4.method239() == 1;
					var9.field99 = var4.method239() == 1;
					var9.field100 = var4.method239() == 1;
					var9.field101 = var4.method239();
					var9.field102 = var4.method239();
					var9.field104 = new int[20];
					var9.field105 = new int[20];
					var9.field103 = new Pix32[20];
					for (int var18 = 0; var18 < 20; var18++) {
						int var19 = var4.method239();
						if (var19 == 1) {
							var9.field104[var18] = var4.method242();
							var9.field105[var18] = var4.method242();
							String var20 = var4.method246();
							if (arg0 != null && var20.length() > 0) {
								int var21 = var20.lastIndexOf(",");
								var9.field103[var18] = method37(Integer.parseInt(var20.substring(var21 + 1)), var20.substring(0, var21), arg0);
							}
						}
					}
					var9.field106 = new String[5];
					for (int var22 = 0; var22 < 5; var22++) {
						var9.field106[var22] = var4.method246();
						if (var9.field106[var22].length() == 0) {
							var9.field106[var22] = null;
						}
					}
				}
				if (var9.field77 == 3) {
					var9.field107 = var4.method239() == 1;
				}
				if (var9.field77 == 4 || var9.field77 == 1) {
					var9.field108 = var4.method239() == 1;
					int var23 = var4.method239();
					if (arg2 != null) {
						var9.field110 = arg2[var23];
					}
					var9.field109 = var4.method239() == 1;
				}
				if (var9.field77 == 4) {
					var9.field111 = var4.method246();
					var9.field112 = var4.method246();
				}
				if (var9.field77 == 1 || var9.field77 == 3 || var9.field77 == 4) {
					var9.field113 = var4.method244();
				}
				if (var9.field77 == 3 || var9.field77 == 4) {
					var9.field114 = var4.method244();
					var9.field115 = var4.method244();
					var9.field116 = var4.method244();
				}
				if (var9.field77 == 5) {
					String var24 = var4.method246();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var9.field117 = method37(Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25), arg0);
					}
					String var26 = var4.method246();
					if (arg0 != null && var26.length() > 0) {
						int var27 = var26.lastIndexOf(",");
						var9.field118 = method37(Integer.parseInt(var26.substring(var27 + 1)), var26.substring(0, var27), arg0);
					}
				}
				if (var9.field77 == 6) {
					int var28 = var4.method239();
					if (var28 != 0) {
						var9.field119 = 1;
						var9.field120 = (var28 - 1 << 8) + var4.method239();
					}
					int var29 = var4.method239();
					if (var29 != 0) {
						var9.field121 = 1;
						var9.field122 = (var29 - 1 << 8) + var4.method239();
					}
					int var30 = var4.method239();
					if (var30 == 0) {
						var9.field123 = -1;
					} else {
						var9.field123 = (var30 - 1 << 8) + var4.method239();
					}
					int var31 = var4.method239();
					if (var31 == 0) {
						var9.field124 = -1;
					} else {
						var9.field124 = (var31 - 1 << 8) + var4.method239();
					}
					var9.field125 = var4.method241();
					var9.field126 = var4.method241();
					var9.field127 = var4.method241();
				}
				if (var9.field77 == 7) {
					var9.field71 = new int[var9.field80 * var9.field81];
					var9.field72 = new int[var9.field80 * var9.field81];
					var9.field108 = var4.method239() == 1;
					int var32 = var4.method239();
					if (arg2 != null) {
						var9.field110 = arg2[var32];
					}
					var9.field109 = var4.method239() == 1;
					var9.field113 = var4.method244();
					var9.field101 = var4.method242();
					var9.field102 = var4.method242();
					var9.field98 = var4.method239() == 1;
					var9.field106 = new String[5];
					for (int var33 = 0; var33 < 5; var33++) {
						var9.field106[var33] = var4.method246();
						if (var9.field106[var33].length() == 0) {
							var9.field106[var33] = null;
						}
					}
				}
				if (var9.field78 == 2 || var9.field77 == 2) {
					var9.field128 = var4.method246();
					var9.field129 = var4.method246();
					var9.field130 = var4.method241();
				}
			} while (var9.field78 != 1 && var9.field78 != 4 && var9.field78 != 5 && var9.field78 != 6);
			var9.field131 = var4.method246();
			if (var9.field131.length() == 0) {
				if (var9.field78 == 1) {
					var9.field131 = "Ok";
				}
				if (var9.field78 == 4) {
					var9.field131 = "Select";
				}
				if (var9.field78 == 5) {
					var9.field131 = "Select";
				}
				if (var9.field78 == 6) {
					var9.field131 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void method33(int arg0, int arg1) {
		int var4 = this.field71[arg1];
		this.field71[arg1] = this.field71[arg0];
		this.field71[arg0] = var4;
		int var5 = this.field72[arg1];
		this.field72[arg1] = this.field72[arg0];
		this.field72[arg0] = var5;
	}

	@ObfuscatedName("d.a(IIZI)Lfb;")
	public Model method34(int arg1, boolean arg2, int arg3) {
		Model var5;
		if (arg2) {
			var5 = this.method35(this.field121, this.field122);
		} else {
			var5 = this.method35(this.field119, this.field120);
		}
		if (var5 == null) {
			return null;
		} else if (arg1 == -1 && arg3 == -1 && var5.field553 == null) {
			return var5;
		} else {
			Model var6 = new Model(AnimFrame.method62(arg1) & AnimFrame.method62(arg3), false, true, var5);
			if (arg1 != -1 || arg3 != -1) {
				var6.method146();
			}
			if (arg1 != -1) {
				var6.method147(arg1);
			}
			if (arg3 != -1) {
				var6.method147(arg3);
			}
			var6.method156(64, 768, -50, -10, -50, true);
			return var6;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public Model method35(int arg0, int arg1) {
		Model var3 = (Model) field132.method115((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.method139(arg1);
		}
		if (arg0 == 2) {
			var3 = NpcType.method344(arg1).method347();
		}
		if (arg0 == 3) {
			var3 = Client.field1231.method132();
		}
		if (arg0 == 4) {
			var3 = ObjType.method350(arg1).method355(50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			field132.method116(var3, (long) ((arg0 << 16) + arg1));
		}
		return var3;
	}

	@ObfuscatedName("d.a(ZILfb;I)V")
	public static void method36(int arg1, Model arg2, int arg3) {
		field132.method117();
		if (arg2 != null && arg3 != 4) {
			field132.method116(arg2, (long) ((arg3 << 16) + arg1));
		}
	}

	@ObfuscatedName("d.a(IILjava/lang/String;Lyb;)Ljb;")
	public static Pix32 method37(int arg1, String arg2, JagFile arg3) {
		long var4 = (JString.method312(arg2) << 8) + (long) arg1;
		Pix32 var6 = (Pix32) field133.method115(var4);
		if (var6 == null) {
			try {
				Pix32 var7 = new Pix32(arg3, arg2, arg1);
				field133.method116(var7, var4);
				return var7;
			} catch (Exception var8) {
				return null;
			}
		} else {
			return var6;
		}
	}
}
