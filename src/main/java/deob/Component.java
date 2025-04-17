package deob;

@ObfuscatedName("d")
public class Component {

	@ObfuscatedName("d.a")
	public boolean field70 = false;

	@ObfuscatedName("d.b")
	public static int field71;

	@ObfuscatedName("d.c")
	public boolean field72 = true;

	@ObfuscatedName("d.d")
	public static Component[] field73;

	@ObfuscatedName("d.e")
	public int[] field74;

	@ObfuscatedName("d.f")
	public int[] field75;

	@ObfuscatedName("d.g")
	public int field76;

	@ObfuscatedName("d.h")
	public int field77;

	@ObfuscatedName("d.i")
	public int field78;

	@ObfuscatedName("d.j")
	public int field79;

	@ObfuscatedName("d.k")
	public int field80;

	@ObfuscatedName("d.l")
	public int field81;

	@ObfuscatedName("d.m")
	public int field82;

	@ObfuscatedName("d.n")
	public int field83;

	@ObfuscatedName("d.o")
	public int field84;

	@ObfuscatedName("d.p")
	public byte field85;

	@ObfuscatedName("d.q")
	public int field86;

	@ObfuscatedName("d.r")
	public int field87;

	@ObfuscatedName("d.s")
	public int[][] field88;

	@ObfuscatedName("d.t")
	public int[] field89;

	@ObfuscatedName("d.u")
	public int[] field90;

	@ObfuscatedName("d.v")
	public int field91;

	@ObfuscatedName("d.w")
	public int field92;

	@ObfuscatedName("d.x")
	public int field93;

	@ObfuscatedName("d.y")
	public boolean field94;

	@ObfuscatedName("d.z")
	public int[] field95;

	@ObfuscatedName("d.ab")
	public int field122;

	@ObfuscatedName("d.bb")
	public int field123;

	@ObfuscatedName("d.cb")
	public int field124;

	@ObfuscatedName("d.db")
	public int field125;

	@ObfuscatedName("d.eb")
	public int field126;

	@ObfuscatedName("d.fb")
	public int field127;

	@ObfuscatedName("d.gb")
	public int field128;

	@ObfuscatedName("d.hb")
	public String field129;

	@ObfuscatedName("d.ib")
	public String field130;

	@ObfuscatedName("d.jb")
	public int field131;

	@ObfuscatedName("d.kb")
	public String field132;

	@ObfuscatedName("d.lb")
	public static LruCache field133 = new LruCache(30, 1);

	@ObfuscatedName("d.mb")
	public static LruCache field134;

	@ObfuscatedName("d.H")
	public int field103;

	@ObfuscatedName("d.I")
	public int field104;

	@ObfuscatedName("d.T")
	public int field115;

	@ObfuscatedName("d.U")
	public int field116;

	@ObfuscatedName("d.V")
	public int field117;

	@ObfuscatedName("d.Y")
	public int field120;

	@ObfuscatedName("d.Z")
	public int field121;

	@ObfuscatedName("d.C")
	public int field98;

	@ObfuscatedName("d.W")
	public Pix32 field118;

	@ObfuscatedName("d.X")
	public Pix32 field119;

	@ObfuscatedName("d.Q")
	public PixFont field112;

	@ObfuscatedName("d.R")
	public String field113;

	@ObfuscatedName("d.S")
	public String field114;

	@ObfuscatedName("d.E")
	public boolean field100;

	@ObfuscatedName("d.F")
	public boolean field101;

	@ObfuscatedName("d.G")
	public boolean field102;

	@ObfuscatedName("d.N")
	public boolean field109;

	@ObfuscatedName("d.O")
	public boolean field110;

	@ObfuscatedName("d.P")
	public boolean field111;

	@ObfuscatedName("d.D")
	public boolean field99;

	@ObfuscatedName("d.K")
	public int[] field106;

	@ObfuscatedName("d.L")
	public int[] field107;

	@ObfuscatedName("d.A")
	public int[] field96;

	@ObfuscatedName("d.B")
	public int[] field97;

	@ObfuscatedName("d.J")
	public Pix32[] field105;

	@ObfuscatedName("d.M")
	public String[] field108;

	@ObfuscatedName("d.a(Lyb;ILyb;[Llb;)V")
	public static void method32(Jagfile arg0, int arg1, Jagfile arg2, PixFont[] arg3) {
		field134 = new LruCache(50000, 1);
		Packet var4 = new Packet((byte) -109, arg0.method308("data", null));
		if (arg1 != 0) {
			return;
		}
		int var5 = -1;
		int var6 = var4.method240();
		field73 = new Component[var6];
		while (true) {
			Component var8;
			do {
				if (var4.field719 >= var4.field718.length) {
					field134 = null;
					return;
				}
				int var7 = var4.method240();
				if (var7 == 65535) {
					var5 = var4.method240();
					var7 = var4.method240();
				}
				var8 = field73[var7] = new Component();
				var8.field78 = var7;
				var8.field79 = var5;
				var8.field80 = var4.method238();
				var8.field81 = var4.method238();
				var8.field82 = var4.method240();
				var8.field83 = var4.method240();
				var8.field84 = var4.method240();
				var8.field85 = (byte) var4.method238();
				var8.field91 = var4.method238();
				if (var8.field91 == 0) {
					var8.field91 = -1;
				} else {
					var8.field91 = (var8.field91 - 1 << 8) + var4.method238();
				}
				int var9 = var4.method238();
				if (var9 > 0) {
					var8.field89 = new int[var9];
					var8.field90 = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						var8.field89[var10] = var4.method238();
						var8.field90[var10] = var4.method240();
					}
				}
				int var11 = var4.method238();
				if (var11 > 0) {
					var8.field88 = new int[var11][];
					for (int var12 = 0; var12 < var11; var12++) {
						int var13 = var4.method240();
						var8.field88[var12] = new int[var13];
						for (int var14 = 0; var14 < var13; var14++) {
							var8.field88[var12][var14] = var4.method240();
						}
					}
				}
				if (var8.field80 == 0) {
					var8.field92 = var4.method240();
					var8.field94 = var4.method238() == 1;
					int var15 = var4.method240();
					var8.field95 = new int[var15];
					var8.field96 = new int[var15];
					var8.field97 = new int[var15];
					for (int var16 = 0; var16 < var15; var16++) {
						var8.field95[var16] = var4.method240();
						var8.field96[var16] = var4.method241();
						var8.field97[var16] = var4.method241();
					}
				}
				if (var8.field80 == 1) {
					var8.field98 = var4.method240();
					var8.field99 = var4.method238() == 1;
				}
				if (var8.field80 == 2) {
					var8.field74 = new int[var8.field84 * var8.field83];
					var8.field75 = new int[var8.field84 * var8.field83];
					var8.field100 = var4.method238() == 1;
					var8.field101 = var4.method238() == 1;
					var8.field102 = var4.method238() == 1;
					var8.field103 = var4.method238();
					var8.field104 = var4.method238();
					var8.field106 = new int[20];
					var8.field107 = new int[20];
					var8.field105 = new Pix32[20];
					for (int var17 = 0; var17 < 20; var17++) {
						int var19 = var4.method238();
						if (var19 == 1) {
							var8.field106[var17] = var4.method241();
							var8.field107[var17] = var4.method241();
							String var20 = var4.method245();
							if (arg2 != null && var20.length() > 0) {
								int var21 = var20.lastIndexOf(",");
								var8.field105[var17] = method37(Integer.parseInt(var20.substring(var21 + 1)), arg2, -18993, var20.substring(0, var21));
							}
						}
					}
					var8.field108 = new String[5];
					for (int var18 = 0; var18 < 5; var18++) {
						var8.field108[var18] = var4.method245();
						if (var8.field108[var18].length() == 0) {
							var8.field108[var18] = null;
						}
					}
				}
				if (var8.field80 == 3) {
					var8.field109 = var4.method238() == 1;
				}
				if (var8.field80 == 4 || var8.field80 == 1) {
					var8.field110 = var4.method238() == 1;
					int var22 = var4.method238();
					if (arg3 != null) {
						var8.field112 = arg3[var22];
					}
					var8.field111 = var4.method238() == 1;
				}
				if (var8.field80 == 4) {
					var8.field113 = var4.method245();
					var8.field114 = var4.method245();
				}
				if (var8.field80 == 1 || var8.field80 == 3 || var8.field80 == 4) {
					var8.field115 = var4.method243();
				}
				if (var8.field80 == 3 || var8.field80 == 4) {
					var8.field116 = var4.method243();
					var8.field117 = var4.method243();
				}
				if (var8.field80 == 5) {
					String var23 = var4.method245();
					if (arg2 != null && var23.length() > 0) {
						int var24 = var23.lastIndexOf(",");
						var8.field118 = method37(Integer.parseInt(var23.substring(var24 + 1)), arg2, -18993, var23.substring(0, var24));
					}
					String var25 = var4.method245();
					if (arg2 != null && var25.length() > 0) {
						int var26 = var25.lastIndexOf(",");
						var8.field119 = method37(Integer.parseInt(var25.substring(var26 + 1)), arg2, -18993, var25.substring(0, var26));
					}
				}
				if (var8.field80 == 6) {
					int var27 = var4.method238();
					if (var27 != 0) {
						var8.field120 = 1;
						var8.field121 = (var27 - 1 << 8) + var4.method238();
					}
					int var28 = var4.method238();
					if (var28 != 0) {
						var8.field122 = 1;
						var8.field123 = (var28 - 1 << 8) + var4.method238();
					}
					int var29 = var4.method238();
					if (var29 == 0) {
						var8.field124 = -1;
					} else {
						var8.field124 = (var29 - 1 << 8) + var4.method238();
					}
					int var30 = var4.method238();
					if (var30 == 0) {
						var8.field125 = -1;
					} else {
						var8.field125 = (var30 - 1 << 8) + var4.method238();
					}
					var8.field126 = var4.method240();
					var8.field127 = var4.method240();
					var8.field128 = var4.method240();
				}
				if (var8.field80 == 7) {
					var8.field74 = new int[var8.field84 * var8.field83];
					var8.field75 = new int[var8.field84 * var8.field83];
					var8.field110 = var4.method238() == 1;
					int var31 = var4.method238();
					if (arg3 != null) {
						var8.field112 = arg3[var31];
					}
					var8.field111 = var4.method238() == 1;
					var8.field115 = var4.method243();
					var8.field103 = var4.method241();
					var8.field104 = var4.method241();
					var8.field101 = var4.method238() == 1;
					var8.field108 = new String[5];
					for (int var32 = 0; var32 < 5; var32++) {
						var8.field108[var32] = var4.method245();
						if (var8.field108[var32].length() == 0) {
							var8.field108[var32] = null;
						}
					}
				}
				if (var8.field81 == 2 || var8.field80 == 2) {
					var8.field129 = var4.method245();
					var8.field130 = var4.method245();
					var8.field131 = var4.method240();
				}
			} while (var8.field81 != 1 && var8.field81 != 4 && var8.field81 != 5 && var8.field81 != 6);
			var8.field132 = var4.method245();
			if (var8.field132.length() == 0) {
				if (var8.field81 == 1) {
					var8.field132 = "Ok";
				}
				if (var8.field81 == 4) {
					var8.field132 = "Select";
				}
				if (var8.field81 == 5) {
					var8.field132 = "Select";
				}
				if (var8.field81 == 6) {
					var8.field132 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(IZI)V")
	public void method33(int arg0, boolean arg1, int arg2) {
		int var4 = this.field74[arg0];
		this.field74[arg0] = this.field74[arg2];
		this.field74[arg2] = var4;
		int var5 = this.field75[arg0];
		this.field75[arg0] = this.field75[arg2];
		if (arg1) {
			this.field70 = !this.field70;
		}
		this.field75[arg2] = var5;
	}

	@ObfuscatedName("d.a(BIIZ)Lfb;")
	public Model method34(byte arg0, int arg1, int arg2, boolean arg3) {
		Model var5;
		if (arg3) {
			var5 = this.method35(this.field122, this.field123);
		} else {
			var5 = this.method35(this.field120, this.field121);
		}
		if (var5 == null) {
			return null;
		} else if (arg1 == -1 && arg2 == -1 && var5.field557 == null) {
			return var5;
		} else {
			Model var6 = new Model(var5, true, false, true, -796);
			if (arg1 != -1 || arg2 != -1) {
				var6.method145(-591);
			}
			if (arg1 != -1) {
				var6.method146(arg1, 13056);
			}
			if (arg2 != -1) {
				var6.method146(arg2, 13056);
			}
			var6.method155(64, 768, -50, -10, -50, true);
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return var6;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public Model method35(int arg0, int arg1) {
		Model var3 = (Model) field133.method114((long) ((arg0 << 16) + arg1));
		if (var3 != null) {
			return var3;
		}
		if (arg0 == 1) {
			var3 = Model.method138(arg1, -404);
		}
		if (arg0 == 2) {
			var3 = NpcType.method342(arg1).method345(this.field72);
		}
		if (arg0 == 3) {
			var3 = client.field1428.method131(445);
		}
		if (arg0 == 4) {
			var3 = ObjType.method348(arg1).method353(-42857, 50);
		}
		if (arg0 == 5) {
			var3 = null;
		}
		if (var3 != null) {
			field133.method115(var3, (long) ((arg0 << 16) + arg1), 39399);
		}
		return var3;
	}

	@ObfuscatedName("d.a(Lfb;III)V")
	public static void method36(Model arg0, int arg1, int arg2, int arg3) {
		field133.method116();
		if (arg1 > 0 && (arg0 != null && arg3 != 4)) {
			field133.method115(arg0, (long) ((arg3 << 16) + arg2), 39399);
		}
	}

	@ObfuscatedName("d.a(ILyb;ILjava/lang/String;)Ljb;")
	public static Pix32 method37(int arg0, Jagfile arg1, int arg2, String arg3) {
		long var4 = (JString.method311(false, arg3) << 8) + (long) arg0;
		Pix32 var6 = (Pix32) field134.method114(var4);
		if (arg2 != -18993) {
			field71 = 299;
		}
		if (var6 != null) {
			return var6;
		}
		try {
			Pix32 var7 = new Pix32(arg1, arg3, arg0);
			field134.method115(var7, var4, 39399);
			return var7;
		} catch (Exception var8) {
			return null;
		}
	}
}
