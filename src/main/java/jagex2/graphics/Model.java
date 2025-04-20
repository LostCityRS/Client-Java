package jagex2.graphics;

import deob.*;
import jagex2.dash3d.AnimBase;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Entity;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("fb")
public class Model extends Entity {

	@ObfuscatedName("fb.l")
	public boolean field528 = true;

	@ObfuscatedName("fb.m")
	public int field529 = 855;

	@ObfuscatedName("fb.n")
	public int field530;

	@ObfuscatedName("fb.o")
	public byte field531 = 3;

	@ObfuscatedName("fb.p")
	public int field532 = -796;

	@ObfuscatedName("fb.q")
	public boolean field533 = true;

	@ObfuscatedName("fb.r")
	public byte field534 = 4;

	@ObfuscatedName("fb.s")
	public boolean field535 = false;

	@ObfuscatedName("fb.t")
	public static boolean field536 = true;

	@ObfuscatedName("fb.u")
	public static int field537;

	@ObfuscatedName("fb.v")
	public static Model field538 = new Model(104);

	@ObfuscatedName("fb.w")
	public static int[] field539 = new int[2000];

	@ObfuscatedName("fb.x")
	public static int[] field540 = new int[2000];

	@ObfuscatedName("fb.y")
	public static int[] field541 = new int[2000];

	@ObfuscatedName("fb.z")
	public static int[] field542 = new int[2000];

	@ObfuscatedName("fb.ab")
	public int field569;

	@ObfuscatedName("fb.bb")
	public int field570;

	@ObfuscatedName("fb.cb")
	public int field571;

	@ObfuscatedName("fb.db")
	public int[] field572;

	@ObfuscatedName("fb.eb")
	public int[] field573;

	@ObfuscatedName("fb.fb")
	public int[][] field574;

	@ObfuscatedName("fb.gb")
	public int[][] field575;

	@ObfuscatedName("fb.hb")
	public boolean field576 = false;

	@ObfuscatedName("fb.ib")
	public VertexNormal[] field577;

	@ObfuscatedName("fb.jb")
	public static Metadata[] field578;

	@ObfuscatedName("fb.kb")
	public static OnDemandProvider field579;

	@ObfuscatedName("fb.lb")
	public static boolean[] field580 = new boolean[4096];

	@ObfuscatedName("fb.mb")
	public static boolean[] field581 = new boolean[4096];

	@ObfuscatedName("fb.nb")
	public static int[] field582 = new int[4096];

	@ObfuscatedName("fb.ob")
	public static int[] field583 = new int[4096];

	@ObfuscatedName("fb.pb")
	public static int[] field584 = new int[4096];

	@ObfuscatedName("fb.qb")
	public static int[] field585 = new int[4096];

	@ObfuscatedName("fb.rb")
	public static int[] field586 = new int[4096];

	@ObfuscatedName("fb.sb")
	public static int[] field587 = new int[4096];

	@ObfuscatedName("fb.tb")
	public static int[] field588 = new int[1500];

	@ObfuscatedName("fb.ub")
	public static int[][] field589 = new int[1500][512];

	@ObfuscatedName("fb.vb")
	public static int[] field590 = new int[12];

	@ObfuscatedName("fb.wb")
	public static int[][] field591 = new int[12][2000];

	@ObfuscatedName("fb.xb")
	public static int[] field592 = new int[2000];

	@ObfuscatedName("fb.yb")
	public static int[] field593 = new int[2000];

	@ObfuscatedName("fb.zb")
	public static int[] field594 = new int[12];

	@ObfuscatedName("fb.A")
	public int vertexCount;

	@ObfuscatedName("fb.E")
	public int field547;

	@ObfuscatedName("fb.Q")
	public int field559;

	@ObfuscatedName("fb.B")
	public int[] vertexX;

	@ObfuscatedName("fb.C")
	public int[] vertexY;

	@ObfuscatedName("fb.D")
	public int[] vertexZ;

	@ObfuscatedName("fb.F")
	public int[] field548;

	@ObfuscatedName("fb.G")
	public int[] field549;

	@ObfuscatedName("fb.H")
	public int[] field550;

	@ObfuscatedName("fb.R")
	public int[] field560;

	@ObfuscatedName("fb.S")
	public int[] field561;

	@ObfuscatedName("fb.T")
	public int[] field562;

	@ObfuscatedName("fb.L")
	public int[] field554;

	@ObfuscatedName("fb.M")
	public int[] field555;

	@ObfuscatedName("fb.P")
	public int field558;

	@ObfuscatedName("fb.N")
	public int[] field556;

	@ObfuscatedName("fb.O")
	public int[] field557;

	@ObfuscatedName("fb.I")
	public int[] field551;

	@ObfuscatedName("fb.J")
	public int[] field552;

	@ObfuscatedName("fb.K")
	public int[] field553;

	@ObfuscatedName("fb.Z")
	public int field568;

	@ObfuscatedName("fb.Y")
	public int field567;

	@ObfuscatedName("fb.U")
	public int field563;

	@ObfuscatedName("fb.W")
	public int field565;

	@ObfuscatedName("fb.X")
	public int field566;

	@ObfuscatedName("fb.V")
	public int field564;

	@ObfuscatedName("fb.Ab")
	public static int[] field595 = new int[10];

	@ObfuscatedName("fb.Bb")
	public static int[] field596 = new int[10];

	@ObfuscatedName("fb.Cb")
	public static int[] field597 = new int[10];

	@ObfuscatedName("fb.Kb")
	public static int[] field605 = new int[1000];

	@ObfuscatedName("fb.Lb")
	public static int[] field606 = Pix3D.field651;

	@ObfuscatedName("fb.Mb")
	public static int[] field607 = Pix3D.field652;

	@ObfuscatedName("fb.Nb")
	public static int[] field608 = Pix3D.field663;

	@ObfuscatedName("fb.Ob")
	public static int[] field609 = Pix3D.field650;

	@ObfuscatedName("fb.Db")
	public static int field598;

	@ObfuscatedName("fb.Eb")
	public static int field599;

	@ObfuscatedName("fb.Fb")
	public static int field600;

	@ObfuscatedName("fb.Hb")
	public static int field602;

	@ObfuscatedName("fb.Ib")
	public static int field603;

	@ObfuscatedName("fb.Jb")
	public static int field604;

	@ObfuscatedName("fb.Gb")
	public static boolean field601;

	@ObfuscatedName("fb.a(B)V")
	public static void method134(byte arg0) {
		field578 = null;
		field580 = null;
		field581 = null;
		field582 = null;
		field583 = null;
		field584 = null;
		field585 = null;
		field586 = null;
		field587 = null;
		field588 = null;
		field589 = null;
		field590 = null;
		field591 = null;
		field592 = null;
		field593 = null;
		if (arg0 == 9) {
			boolean var1 = false;
		}
		field594 = null;
		field606 = null;
		field607 = null;
		field608 = null;
		field609 = null;
	}

	@ObfuscatedName("fb.a(ILub;)V")
	public static void method135(int arg0, OnDemandProvider arg1) {
		field578 = new Metadata[arg0];
		field579 = arg1;
	}

	@ObfuscatedName("fb.a(IZ[B)V")
	public static void method136(int arg0, boolean arg1, byte[] arg2) {
		if (arg2 == null) {
			Metadata var3 = field578[arg0] = new Metadata();
			var3.field221 = 0;
			var3.field222 = 0;
			var3.field223 = 0;
			return;
		}
		Packet var4 = new Packet((byte) -109, arg2);
		var4.pos = arg2.length - 18;
		Metadata var5 = field578[arg0] = new Metadata();
		var5.field220 = arg2;
		var5.field221 = var4.g2();
		var5.field222 = var4.g2();
		var5.field223 = var4.g1();
		int var6 = var4.g1();
		int var7 = var4.g1();
		int var8 = var4.g1();
		int var9 = var4.g1();
		if (arg1) {
			field536 = true;
		}
		int var10 = var4.g1();
		int var11 = var4.g2();
		int var12 = var4.g2();
		int var13 = var4.g2();
		int var14 = var4.g2();
		byte var15 = 0;
		var5.field224 = var15;
		int var16 = var5.field221 + var15;
		var5.field230 = var16;
		int var17 = var5.field222 + var16;
		var5.field233 = var17;
		if (var7 == 255) {
			var17 += var5.field222;
		} else {
			var5.field233 = -var7 - 1;
		}
		var5.field235 = var17;
		if (var9 == 1) {
			var17 += var5.field222;
		} else {
			var5.field235 = -1;
		}
		var5.field232 = var17;
		if (var6 == 1) {
			var17 += var5.field222;
		} else {
			var5.field232 = -1;
		}
		var5.field228 = var17;
		if (var10 == 1) {
			var17 += var5.field221;
		} else {
			var5.field228 = -1;
		}
		var5.field234 = var17;
		if (var8 == 1) {
			var17 += var5.field222;
		} else {
			var5.field234 = -1;
		}
		var5.field229 = var17;
		int var18 = var14 + var17;
		var5.field231 = var18;
		int var19 = var5.field222 * 2 + var18;
		var5.field236 = var19;
		int var20 = var5.field223 * 6 + var19;
		var5.field225 = var20;
		int var21 = var11 + var20;
		var5.field226 = var21;
		int var22 = var12 + var21;
		var5.field227 = var22;
		int var10000 = var13 + var22;
	}

	@ObfuscatedName("fb.a(II)V")
	public static void method137(int arg0, int arg1) {
		field578[arg1] = null;
		while (arg0 >= 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	@ObfuscatedName("fb.b(II)Lfb;")
	public static Model method138(int arg0, int arg1) {
		if (field578 == null) {
			return null;
		}
		Metadata var2 = field578[arg0];
		while (arg1 >= 0) {
		}
		if (var2 == null) {
			field579.method278(arg0);
			return null;
		} else {
			return new Model(arg0, (byte) 3);
		}
	}

	@ObfuscatedName("fb.b(I)Z")
	public static boolean method139(int arg0) {
		if (field578 == null) {
			return false;
		}
		Metadata var1 = field578[arg0];
		if (var1 == null) {
			field579.method278(arg0);
			return false;
		} else {
			return true;
		}
	}

	public Model(int arg0) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
	}

	public Model(int arg0, byte arg1) {
		field537++;
		Metadata var3 = field578[arg0];
		this.vertexCount = var3.field221;
		this.field547 = var3.field222;
		this.field559 = var3.field223;
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.field548 = new int[this.field547];
		this.field549 = new int[this.field547];
		this.field550 = new int[this.field547];
		this.field560 = new int[this.field559];
		this.field561 = new int[this.field559];
		this.field562 = new int[this.field559];
		if (var3.field228 >= 0) {
			this.field572 = new int[this.vertexCount];
		}
		if (var3.field232 >= 0) {
			this.field554 = new int[this.field547];
		}
		if (var3.field233 >= 0) {
			this.field555 = new int[this.field547];
		} else {
			this.field558 = -var3.field233 - 1;
		}
		if (var3.field234 >= 0) {
			this.field556 = new int[this.field547];
		}
		if (var3.field235 >= 0) {
			this.field573 = new int[this.field547];
		}
		this.field557 = new int[this.field547];
		Packet var4 = new Packet((byte) -109, var3.field220);
		var4.pos = var3.field224;
		Packet var5 = new Packet((byte) -109, var3.field220);
		var5.pos = var3.field225;
		Packet var6 = new Packet((byte) -109, var3.field220);
		var6.pos = var3.field226;
		Packet var7 = new Packet((byte) -109, var3.field220);
		var7.pos = var3.field227;
		Packet var8 = new Packet((byte) -109, var3.field220);
		var8.pos = var3.field228;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < this.vertexCount; var12++) {
			int var24 = var4.g1();
			int var25 = 0;
			if ((var24 & 0x1) != 0) {
				var25 = var5.gsmart();
			}
			int var26 = 0;
			if ((var24 & 0x2) != 0) {
				var26 = var6.gsmart();
			}
			int var27 = 0;
			if ((var24 & 0x4) != 0) {
				var27 = var7.gsmart();
			}
			this.vertexX[var12] = var9 + var25;
			this.vertexY[var12] = var10 + var26;
			this.vertexZ[var12] = var11 + var27;
			var9 = this.vertexX[var12];
			var10 = this.vertexY[var12];
			var11 = this.vertexZ[var12];
			if (this.field572 != null) {
				this.field572[var12] = var8.g1();
			}
		}
		var4.pos = var3.field231;
		var5.pos = var3.field232;
		var6.pos = var3.field233;
		var7.pos = var3.field234;
		var8.pos = var3.field235;
		for (int var13 = 0; var13 < this.field547; var13++) {
			this.field557[var13] = var4.g2();
			if (this.field554 != null) {
				this.field554[var13] = var5.g1();
			}
			if (this.field555 != null) {
				this.field555[var13] = var6.g1();
			}
			if (this.field556 != null) {
				this.field556[var13] = var7.g1();
			}
			if (this.field573 != null) {
				this.field573[var13] = var8.g1();
			}
		}
		var4.pos = var3.field229;
		var5.pos = var3.field230;
		int var14 = 0;
		int var15 = 0;
		int var16 = 0;
		int var17 = 0;
		for (int var18 = 0; var18 < this.field547; var18++) {
			int var20 = var5.g1();
			if (var20 == 1) {
				var14 = var4.gsmart() + var17;
				var15 = var4.gsmart() + var14;
				var16 = var4.gsmart() + var15;
				var17 = var16;
				this.field548[var18] = var14;
				this.field549[var18] = var15;
				this.field550[var18] = var16;
			}
			if (var20 == 2) {
				var14 = var14;
				var15 = var16;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field548[var18] = var14;
				this.field549[var18] = var15;
				this.field550[var18] = var16;
			}
			if (var20 == 3) {
				var14 = var16;
				var15 = var15;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field548[var18] = var14;
				this.field549[var18] = var15;
				this.field550[var18] = var16;
			}
			if (var20 == 4) {
				int var23 = var14;
				var14 = var15;
				var15 = var23;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field548[var18] = var14;
				this.field549[var18] = var23;
				this.field550[var18] = var16;
			}
		}
		var4.pos = var3.field236;
		if (this.field531 != arg1) {
			throw new NullPointerException();
		}
		for (int var19 = 0; var19 < this.field559; var19++) {
			this.field560[var19] = var4.g2();
			this.field561[var19] = var4.g2();
			this.field562[var19] = var4.g2();
		}
	}

	public Model(int arg0, int arg1, Model[] arg2) {
		field537++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.vertexCount = 0;
		this.field547 = 0;
		this.field559 = 0;
		this.field558 = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var13 = arg2[var8];
			if (var13 != null) {
				this.vertexCount += var13.vertexCount;
				this.field547 += var13.field547;
				this.field559 += var13.field559;
				var4 |= var13.field554 != null;
				if (var13.field555 == null) {
					if (this.field558 == -1) {
						this.field558 = var13.field558;
					}
					if (this.field558 != var13.field558) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var13.field556 != null;
				var7 |= var13.field573 != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.field572 = new int[this.vertexCount];
		this.field548 = new int[this.field547];
		this.field549 = new int[this.field547];
		this.field550 = new int[this.field547];
		this.field560 = new int[this.field559];
		this.field561 = new int[this.field559];
		this.field562 = new int[this.field559];
		if (var4) {
			this.field554 = new int[this.field547];
		}
		if (var5) {
			this.field555 = new int[this.field547];
		}
		if (var6) {
			this.field556 = new int[this.field547];
		}
		if (var7) {
			this.field573 = new int[this.field547];
		}
		this.field557 = new int[this.field547];
		if (arg1 <= 0) {
			this.field529 = 84;
		}
		this.vertexCount = 0;
		this.field547 = 0;
		this.field559 = 0;
		for (int var9 = 0; var9 < arg0; var9++) {
			Model var10 = arg2[var9];
			if (var10 != null) {
				for (int var11 = 0; var11 < var10.field547; var11++) {
					if (var4) {
						if (var10.field554 == null) {
							this.field554[this.field547] = 0;
						} else {
							this.field554[this.field547] = var10.field554[var11];
						}
					}
					if (var5) {
						if (var10.field555 == null) {
							this.field555[this.field547] = var10.field558;
						} else {
							this.field555[this.field547] = var10.field555[var11];
						}
					}
					if (var6) {
						if (var10.field556 == null) {
							this.field556[this.field547] = 0;
						} else {
							this.field556[this.field547] = var10.field556[var11];
						}
					}
					if (var7 && var10.field573 != null) {
						this.field573[this.field547] = var10.field573[var11];
					}
					this.field557[this.field547] = var10.field557[var11];
					this.field548[this.field547] = this.method141(var10, var10.field548[var11]);
					this.field549[this.field547] = this.method141(var10, var10.field549[var11]);
					this.field550[this.field547] = this.method141(var10, var10.field550[var11]);
					this.field547++;
				}
				for (int var12 = 0; var12 < var10.field559; var12++) {
					this.field560[this.field559] = this.method141(var10, var10.field560[var12]);
					this.field561[this.field559] = this.method141(var10, var10.field561[var12]);
					this.field562[this.field559] = this.method141(var10, var10.field562[var12]);
					this.field559++;
				}
			}
		}
	}

	public Model(int arg0, boolean arg1, int arg2, Model[] arg3) {
		field537++;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.vertexCount = 0;
		this.field547 = 0;
		this.field559 = 0;
		this.field558 = -1;
		for (int var9 = 0; var9 < arg2; var9++) {
			Model var16 = arg3[var9];
			if (var16 != null) {
				this.vertexCount += var16.vertexCount;
				this.field547 += var16.field547;
				this.field559 += var16.field559;
				var5 |= var16.field554 != null;
				if (var16.field555 == null) {
					if (this.field558 == -1) {
						this.field558 = var16.field558;
					}
					if (this.field558 != var16.field558) {
						var6 = true;
					}
				} else {
					var6 = true;
				}
				var7 |= var16.field556 != null;
				var8 |= var16.field557 != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		if (arg0 < this.field530 || arg0 > this.field530) {
			field536 = true;
		}
		this.field548 = new int[this.field547];
		this.field549 = new int[this.field547];
		this.field550 = new int[this.field547];
		this.field551 = new int[this.field547];
		this.field552 = new int[this.field547];
		this.field553 = new int[this.field547];
		this.field560 = new int[this.field559];
		this.field561 = new int[this.field559];
		this.field562 = new int[this.field559];
		if (var5) {
			this.field554 = new int[this.field547];
		}
		if (var6) {
			this.field555 = new int[this.field547];
		}
		if (var7) {
			this.field556 = new int[this.field547];
		}
		if (var8) {
			this.field557 = new int[this.field547];
		}
		this.vertexCount = 0;
		this.field547 = 0;
		this.field559 = 0;
		for (int var10 = 0; var10 < arg2; var10++) {
			Model var11 = arg3[var10];
			if (var11 != null) {
				int var12 = this.vertexCount;
				for (int var13 = 0; var13 < var11.vertexCount; var13++) {
					this.vertexX[this.vertexCount] = var11.vertexX[var13];
					this.vertexY[this.vertexCount] = var11.vertexY[var13];
					this.vertexZ[this.vertexCount] = var11.vertexZ[var13];
					this.vertexCount++;
				}
				for (int var14 = 0; var14 < var11.field547; var14++) {
					this.field548[this.field547] = var11.field548[var14] + var12;
					this.field549[this.field547] = var11.field549[var14] + var12;
					this.field550[this.field547] = var11.field550[var14] + var12;
					this.field551[this.field547] = var11.field551[var14];
					this.field552[this.field547] = var11.field552[var14];
					this.field553[this.field547] = var11.field553[var14];
					if (var5) {
						if (var11.field554 == null) {
							this.field554[this.field547] = 0;
						} else {
							this.field554[this.field547] = var11.field554[var14];
						}
					}
					if (var6) {
						if (var11.field555 == null) {
							this.field555[this.field547] = var11.field558;
						} else {
							this.field555[this.field547] = var11.field555[var14];
						}
					}
					if (var7) {
						if (var11.field556 == null) {
							this.field556[this.field547] = 0;
						} else {
							this.field556[this.field547] = var11.field556[var14];
						}
					}
					if (var8 && var11.field557 != null) {
						this.field557[this.field547] = var11.field557[var14];
					}
					this.field547++;
				}
				for (int var15 = 0; var15 < var11.field559; var15++) {
					this.field560[this.field559] = var11.field560[var15] + var12;
					this.field561[this.field559] = var11.field561[var15] + var12;
					this.field562[this.field559] = var11.field562[var15] + var12;
					this.field559++;
				}
			}
		}
		this.method142(true);
	}

	public Model(Model arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
		field537++;
		this.vertexCount = arg0.vertexCount;
		this.field547 = arg0.field547;
		this.field559 = arg0.field559;
		if (arg2) {
			this.vertexX = arg0.vertexX;
			this.vertexY = arg0.vertexY;
			this.vertexZ = arg0.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			for (int var6 = 0; var6 < this.vertexCount; var6++) {
				this.vertexX[var6] = arg0.vertexX[var6];
				this.vertexY[var6] = arg0.vertexY[var6];
				this.vertexZ[var6] = arg0.vertexZ[var6];
			}
		}
		if (arg1) {
			this.field557 = arg0.field557;
		} else {
			this.field557 = new int[this.field547];
			for (int var7 = 0; var7 < this.field547; var7++) {
				this.field557[var7] = arg0.field557[var7];
			}
		}
		if (arg3) {
			this.field556 = arg0.field556;
		} else {
			this.field556 = new int[this.field547];
			if (arg0.field556 == null) {
				for (int var8 = 0; var8 < this.field547; var8++) {
					this.field556[var8] = 0;
				}
			} else {
				for (int var9 = 0; var9 < this.field547; var9++) {
					this.field556[var9] = arg0.field556[var9];
				}
			}
		}
		this.field572 = arg0.field572;
		this.field573 = arg0.field573;
		this.field554 = arg0.field554;
		while (arg4 >= 0) {
			for (int var10 = 1; var10 > 0; var10++) {
			}
		}
		this.field548 = arg0.field548;
		this.field549 = arg0.field549;
		this.field550 = arg0.field550;
		this.field555 = arg0.field555;
		this.field558 = arg0.field558;
		this.field560 = arg0.field560;
		this.field561 = arg0.field561;
		this.field562 = arg0.field562;
	}

	public Model(int arg0, boolean arg1, boolean arg2, Model arg3) {
		if (arg0 < this.field530 || arg0 > this.field530) {
			this.field529 = 466;
		}
		field537++;
		this.vertexCount = arg3.vertexCount;
		this.field547 = arg3.field547;
		this.field559 = arg3.field559;
		if (arg2) {
			this.vertexY = new int[this.vertexCount];
			for (int var5 = 0; var5 < this.vertexCount; var5++) {
				this.vertexY[var5] = arg3.vertexY[var5];
			}
		} else {
			this.vertexY = arg3.vertexY;
		}
		if (arg1) {
			this.field551 = new int[this.field547];
			this.field552 = new int[this.field547];
			this.field553 = new int[this.field547];
			for (int var6 = 0; var6 < this.field547; var6++) {
				this.field551[var6] = arg3.field551[var6];
				this.field552[var6] = arg3.field552[var6];
				this.field553[var6] = arg3.field553[var6];
			}
			this.field554 = new int[this.field547];
			if (arg3.field554 == null) {
				for (int var7 = 0; var7 < this.field547; var7++) {
					this.field554[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < this.field547; var8++) {
					this.field554[var8] = arg3.field554[var8];
				}
			}
			super.field399 = new VertexNormal[this.vertexCount];
			for (int var9 = 0; var9 < this.vertexCount; var9++) {
				VertexNormal var10 = super.field399[var9] = new VertexNormal();
				VertexNormal var11 = arg3.field399[var9];
				var10.field255 = var11.field255;
				var10.field256 = var11.field256;
				var10.field257 = var11.field257;
				var10.field258 = var11.field258;
			}
			this.field577 = arg3.field577;
		} else {
			this.field551 = arg3.field551;
			this.field552 = arg3.field552;
			this.field553 = arg3.field553;
			this.field554 = arg3.field554;
		}
		this.vertexX = arg3.vertexX;
		this.vertexZ = arg3.vertexZ;
		this.field557 = arg3.field557;
		this.field556 = arg3.field556;
		this.field555 = arg3.field555;
		this.field558 = arg3.field558;
		this.field548 = arg3.field548;
		this.field549 = arg3.field549;
		this.field550 = arg3.field550;
		this.field560 = arg3.field560;
		this.field561 = arg3.field561;
		this.field562 = arg3.field562;
		super.field400 = arg3.field400;
		this.field568 = arg3.field568;
		this.field567 = arg3.field567;
		this.field570 = arg3.field570;
		this.field569 = arg3.field569;
		this.field563 = arg3.field563;
		this.field565 = arg3.field565;
		this.field566 = arg3.field566;
		this.field564 = arg3.field564;
	}

	@ObfuscatedName("fb.a(ZLfb;Z)V")
	public void method140(boolean arg0, Model arg1, boolean arg2) {
		this.vertexCount = arg1.vertexCount;
		this.field547 = arg1.field547;
		this.field559 = arg1.field559;
		if (field539.length < this.vertexCount) {
			field539 = new int[this.vertexCount + 100];
			field540 = new int[this.vertexCount + 100];
			field541 = new int[this.vertexCount + 100];
		}
		this.vertexX = field539;
		this.vertexY = field540;
		this.vertexZ = field541;
		for (int var4 = 0; var4 < this.vertexCount; var4++) {
			this.vertexX[var4] = arg1.vertexX[var4];
			this.vertexY[var4] = arg1.vertexY[var4];
			this.vertexZ[var4] = arg1.vertexZ[var4];
		}
		if (arg0) {
			this.field556 = arg1.field556;
		} else {
			if (field542.length < this.field547) {
				field542 = new int[this.field547 + 100];
			}
			this.field556 = field542;
			if (arg1.field556 == null) {
				for (int var5 = 0; var5 < this.field547; var5++) {
					this.field556[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.field547; var6++) {
					this.field556[var6] = arg1.field556[var6];
				}
			}
		}
		this.field554 = arg1.field554;
		this.field557 = arg1.field557;
		this.field555 = arg1.field555;
		this.field558 = arg1.field558;
		this.field575 = arg1.field575;
		this.field574 = arg1.field574;
		this.field548 = arg1.field548;
		if (!arg2) {
			this.field529 = -254;
		}
		this.field549 = arg1.field549;
		this.field550 = arg1.field550;
		this.field551 = arg1.field551;
		this.field552 = arg1.field552;
		this.field553 = arg1.field553;
		this.field560 = arg1.field560;
		this.field561 = arg1.field561;
		this.field562 = arg1.field562;
	}

	@ObfuscatedName("fb.a(Lfb;I)I")
	public final int method141(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.vertexX[arg1];
		int var5 = arg0.vertexY[arg1];
		int var6 = arg0.vertexZ[arg1];
		for (int var7 = 0; var7 < this.vertexCount; var7++) {
			if (this.vertexX[var7] == var4 && this.vertexY[var7] == var5 && this.vertexZ[var7] == var6) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.vertexX[this.vertexCount] = var4;
			this.vertexY[this.vertexCount] = var5;
			this.vertexZ[this.vertexCount] = var6;
			if (arg0.field572 != null) {
				this.field572[this.vertexCount] = arg0.field572[arg1];
			}
			var3 = this.vertexCount++;
		}
		return var3;
	}

	@ObfuscatedName("fb.a(Z)V")
	public void method142(boolean arg0) {
		super.field400 = 0;
		this.field567 = 0;
		this.field568 = 0;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			int var4 = this.vertexY[var2];
			int var5 = this.vertexZ[var2];
			if (-var4 > super.field400) {
				super.field400 = -var4;
			}
			if (var4 > this.field568) {
				this.field568 = var4;
			}
			int var6 = var3 * var3 + var5 * var5;
			if (var6 > this.field567) {
				this.field567 = var6;
			}
		}
		this.field567 = (int) (Math.sqrt((double) this.field567) + 0.99D);
		if (arg0) {
			this.field570 = (int) (Math.sqrt((double) (this.field567 * this.field567 + super.field400 * super.field400)) + 0.99D);
			this.field569 = this.field570 + (int) (Math.sqrt((double) (this.field568 * this.field568 + this.field567 * this.field567)) + 0.99D);
		}
	}

	@ObfuscatedName("fb.b(B)V")
	public void calculateBoundsY(byte arg0) {
		super.field400 = 0;
		this.field568 = 0;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var4 = this.vertexY[var2];
			if (-var4 > super.field400) {
				super.field400 = -var4;
			}
			if (var4 > this.field568) {
				this.field568 = var4;
			}
		}
		if (arg0 != 6) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field570 = (int) (Math.sqrt((double) (this.field567 * this.field567 + super.field400 * super.field400)) + 0.99D);
		this.field569 = this.field570 + (int) (Math.sqrt((double) (this.field568 * this.field568 + this.field567 * this.field567)) + 0.99D);
	}

	@ObfuscatedName("fb.c(I)V")
	public void method144(int arg0) {
		super.field400 = 0;
		this.field567 = 0;
		this.field568 = 0;
		this.field563 = 999999;
		this.field564 = -999999;
		this.field565 = -99999;
		this.field566 = 99999;
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			int var4 = this.vertexY[var2];
			int var5 = this.vertexZ[var2];
			if (var3 < this.field563) {
				this.field563 = var3;
			}
			if (var3 > this.field564) {
				this.field564 = var3;
			}
			if (var5 < this.field566) {
				this.field566 = var5;
			}
			if (var5 > this.field565) {
				this.field565 = var5;
			}
			if (-var4 > super.field400) {
				super.field400 = -var4;
			}
			if (var4 > this.field568) {
				this.field568 = var4;
			}
			int var6 = var3 * var3 + var5 * var5;
			if (var6 > this.field567) {
				this.field567 = var6;
			}
		}
		this.field567 = (int) Math.sqrt((double) this.field567);
		while (arg0 >= 0) {
			this.field535 = !this.field535;
		}
		this.field570 = (int) Math.sqrt((double) (this.field567 * this.field567 + super.field400 * super.field400));
		this.field569 = this.field570 + (int) Math.sqrt((double) (this.field568 * this.field568 + this.field567 * this.field567));
	}

	@ObfuscatedName("fb.d(I)V")
	public void method145(int arg0) {
		label86: while (true) {
			if (arg0 >= 0) {
				int var16 = 1;
				while (true) {
					if (var16 <= 0) {
						continue label86;
					}
					var16++;
				}
			}
			int var10002;
			if (this.field572 != null) {
				int[] var2 = new int[256];
				int var3 = 0;
				for (int var4 = 0; var4 < this.vertexCount; var4++) {
					int var8 = this.field572[var4];
					var10002 = var2[var8]++;
					if (var8 > var3) {
						var3 = var8;
					}
				}
				this.field574 = new int[var3 + 1][];
				for (int var5 = 0; var5 <= var3; var5++) {
					this.field574[var5] = new int[var2[var5]];
					var2[var5] = 0;
				}
				int var6 = 0;
				while (var6 < this.vertexCount) {
					int var7 = this.field572[var6];
					this.field574[var7][var2[var7]++] = var6++;
				}
				this.field572 = null;
			}
			if (this.field573 == null) {
				return;
			}
			int[] var9 = new int[256];
			int var10 = 0;
			for (int var11 = 0; var11 < this.field547; var11++) {
				int var15 = this.field573[var11];
				var10002 = var9[var15]++;
				if (var15 > var10) {
					var10 = var15;
				}
			}
			this.field575 = new int[var10 + 1][];
			for (int var12 = 0; var12 <= var10; var12++) {
				this.field575[var12] = new int[var9[var12]];
				var9[var12] = 0;
			}
			int var13 = 0;
			while (var13 < this.field547) {
				int var14 = this.field573[var13];
				this.field575[var14][var9[var14]++] = var13++;
			}
			this.field573 = null;
			return;
		}
	}

	@ObfuscatedName("fb.c(II)V")
	public void method146(int arg0, int arg1) {
		if (this.field574 == null || arg0 == -1) {
			return;
		}
		AnimFrame var3 = AnimFrame.method61(arg0, -404);
		if (var3 == null) {
			return;
		}
		AnimBase var4 = var3.field165;
		field598 = 0;
		if (arg1 != 13056) {
			field536 = true;
		}
		field599 = 0;
		field600 = 0;
		for (int var5 = 0; var5 < var3.field166; var5++) {
			int var6 = var3.field167[var5];
			this.method148(var4.field159[var6], var4.field160[var6], var3.field168[var5], var3.field169[var5], var3.field170[var5]);
		}
	}

	@ObfuscatedName("fb.a(BII[I)V")
	public void method147(byte arg0, int arg1, int arg2, int[] arg3) {
		if (arg1 == -1) {
			return;
		}
		if (arg3 == null || arg2 == -1) {
			this.method146(arg1, 13056);
			return;
		}
		AnimFrame var5 = AnimFrame.method61(arg1, -404);
		if (arg0 != 74) {
			this.field529 = -174;
		}
		if (var5 == null) {
			return;
		}
		AnimFrame var6 = AnimFrame.method61(arg2, -404);
		if (var6 == null) {
			this.method146(arg1, 13056);
			return;
		}
		AnimBase var7 = var5.field165;
		field598 = 0;
		field599 = 0;
		field600 = 0;
		byte var8 = 0;
		int var16 = var8 + 1;
		int var9 = arg3[var8];
		for (int var10 = 0; var10 < var5.field166; var10++) {
			int var15 = var5.field167[var10];
			while (var15 > var9) {
				var9 = arg3[var16++];
			}
			if (var9 != var15 || var7.field159[var15] == 0) {
				this.method148(var7.field159[var15], var7.field160[var15], var5.field168[var10], var5.field169[var10], var5.field170[var10]);
			}
		}
		field598 = 0;
		field599 = 0;
		field600 = 0;
		byte var11 = 0;
		int var17 = var11 + 1;
		int var12 = arg3[var11];
		for (int var13 = 0; var13 < var6.field166; var13++) {
			int var14 = var6.field167[var13];
			while (var14 > var12) {
				var12 = arg3[var17++];
			}
			if (var12 == var14 || var7.field159[var14] == 0) {
				this.method148(var7.field159[var14], var7.field160[var14], var6.field168[var13], var6.field169[var13], var6.field170[var13]);
			}
		}
	}

	@ObfuscatedName("fb.a(I[IIII)V")
	public void method148(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field598 = 0;
			field599 = 0;
			field600 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.field574.length) {
					int[] var10 = this.field574[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field598 += this.vertexX[var12];
						field599 += this.vertexY[var12];
						field600 += this.vertexZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field598 = field598 / var7 + arg2;
				field599 = field599 / var7 + arg3;
				field600 = field600 / var7 + arg4;
			} else {
				field598 = arg2;
				field599 = arg3;
				field600 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.field574.length) {
					int[] var15 = this.field574[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.vertexX[var17] += arg2;
						this.vertexY[var17] += arg3;
						this.vertexZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.field574.length) {
					int[] var20 = this.field574[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.vertexX[var22] -= field598;
						this.vertexY[var22] -= field599;
						this.vertexZ[var22] -= field600;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = field606[var25];
							int var27 = field607[var25];
							int var28 = this.vertexY[var22] * var26 + this.vertexX[var22] * var27 >> 16;
							this.vertexY[var22] = this.vertexY[var22] * var27 - this.vertexX[var22] * var26 >> 16;
							this.vertexX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = field606[var23];
							int var30 = field607[var23];
							int var31 = this.vertexY[var22] * var30 - this.vertexZ[var22] * var29 >> 16;
							this.vertexZ[var22] = this.vertexZ[var22] * var30 + this.vertexY[var22] * var29 >> 16;
							this.vertexY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = field606[var24];
							int var33 = field607[var24];
							int var34 = this.vertexZ[var22] * var32 + this.vertexX[var22] * var33 >> 16;
							this.vertexZ[var22] = this.vertexZ[var22] * var33 - this.vertexX[var22] * var32 >> 16;
							this.vertexX[var22] = var34;
						}
						this.vertexX[var22] += field598;
						this.vertexY[var22] += field599;
						this.vertexZ[var22] += field600;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.field574.length) {
					int[] var37 = this.field574[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.vertexX[var39] -= field598;
						this.vertexY[var39] -= field599;
						this.vertexZ[var39] -= field600;
						this.vertexX[var39] = this.vertexX[var39] * arg2 / 128;
						this.vertexY[var39] = this.vertexY[var39] * arg3 / 128;
						this.vertexZ[var39] = this.vertexZ[var39] * arg4 / 128;
						this.vertexX[var39] += field598;
						this.vertexY[var39] += field599;
						this.vertexZ[var39] += field600;
					}
				}
			}
		} else if (arg0 == 5 && (this.field575 != null && this.field556 != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.field575.length) {
					int[] var42 = this.field575[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						this.field556[var44] += arg2 * 8;
						if (this.field556[var44] < 0) {
							this.field556[var44] = 0;
						}
						if (this.field556[var44] > 255) {
							this.field556[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fb.c(B)V")
	public void method149(byte arg0) {
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			int var3 = this.vertexX[var2];
			this.vertexX[var2] = this.vertexZ[var2];
			this.vertexZ[var2] = -var3;
		}
		if (arg0 == 3) {
			;
		}
	}

	@ObfuscatedName("fb.d(II)V")
	public void method150(int arg0, int arg1) {
		if (arg0 != 2) {
			return;
		}
		int var3 = field606[arg1];
		int var4 = field607[arg1];
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			int var6 = this.vertexY[var5] * var4 - this.vertexZ[var5] * var3 >> 16;
			this.vertexZ[var5] = this.vertexZ[var5] * var4 + this.vertexY[var5] * var3 >> 16;
			this.vertexY[var5] = var6;
		}
	}

	@ObfuscatedName("fb.a(IIIZ)V")
	public void translate(int arg0, int arg1, int arg2, boolean arg3) {
		if (arg3) {
			this.field535 = !this.field535;
		}
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			this.vertexX[var5] += arg1;
			this.vertexY[var5] += arg0;
			this.vertexZ[var5] += arg2;
		}
	}

	@ObfuscatedName("fb.e(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field547; var3++) {
			if (this.field557[var3] == arg0) {
				this.field557[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("fb.e(I)V")
	public void method153(int arg0) {
		if (arg0 < 4 || arg0 > 4) {
			this.field528 = !this.field528;
		}
		for (int var2 = 0; var2 < this.vertexCount; var2++) {
			this.vertexZ[var2] = -this.vertexZ[var2];
		}
		for (int var3 = 0; var3 < this.field547; var3++) {
			int var4 = this.field548[var3];
			this.field548[var3] = this.field550[var3];
			this.field550[var3] = var4;
		}
	}

	@ObfuscatedName("fb.a(IIII)V")
	public void scale(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.vertexCount; var5++) {
			this.vertexX[var5] = this.vertexX[var5] * arg3 / 128;
			this.vertexY[var5] = this.vertexY[var5] * arg0 / 128;
			this.vertexZ[var5] = this.vertexZ[var5] * arg1 / 128;
		}
		if (arg2 < 4 || arg2 > 4) {
			this.field532 = 60;
		}
	}

	@ObfuscatedName("fb.a(IIIIIZ)V")
	public final void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
		int var8 = arg1 * var7 >> 8;
		if (this.field551 == null) {
			this.field551 = new int[this.field547];
			this.field552 = new int[this.field547];
			this.field553 = new int[this.field547];
		}
		if (super.field399 == null) {
			super.field399 = new VertexNormal[this.vertexCount];
			for (int var9 = 0; var9 < this.vertexCount; var9++) {
				super.field399[var9] = new VertexNormal();
			}
		}
		for (int var10 = 0; var10 < this.field547; var10++) {
			int var14 = this.field548[var10];
			int var15 = this.field549[var10];
			int var16 = this.field550[var10];
			int var17 = this.vertexX[var15] - this.vertexX[var14];
			int var18 = this.vertexY[var15] - this.vertexY[var14];
			int var19 = this.vertexZ[var15] - this.vertexZ[var14];
			int var20 = this.vertexX[var16] - this.vertexX[var14];
			int var21 = this.vertexY[var16] - this.vertexY[var14];
			int var22 = this.vertexZ[var16] - this.vertexZ[var14];
			int var23 = var18 * var22 - var19 * var21;
			int var24 = var19 * var20 - var17 * var22;
			int var25;
			for (var25 = var17 * var21 - var18 * var20; var23 > 8192 || var24 > 8192 || var25 > 8192 || var23 < -8192 || var24 < -8192 || var25 < -8192; var25 >>= 0x1) {
				var23 >>= 0x1;
				var24 >>= 0x1;
			}
			int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
			if (var26 <= 0) {
				var26 = 1;
			}
			int var27 = var23 * 256 / var26;
			int var28 = var24 * 256 / var26;
			int var29 = var25 * 256 / var26;
			if (this.field554 == null || (this.field554[var10] & 0x1) == 0) {
				VertexNormal var31 = super.field399[var14];
				var31.field255 += var27;
				var31.field256 += var28;
				var31.field257 += var29;
				var31.field258++;
				VertexNormal var32 = super.field399[var15];
				var32.field255 += var27;
				var32.field256 += var28;
				var32.field257 += var29;
				var32.field258++;
				VertexNormal var33 = super.field399[var16];
				var33.field255 += var27;
				var33.field256 += var28;
				var33.field257 += var29;
				var33.field258++;
			} else {
				int var30 = (arg4 * var29 + arg2 * var27 + arg3 * var28) / (var8 / 2 + var8) + arg0;
				this.field551[var10] = method157(this.field557[var10], var30, this.field554[var10]);
			}
		}
		if (arg5) {
			this.method156(arg0, var8, arg2, arg3, arg4);
		} else {
			this.field577 = new VertexNormal[this.vertexCount];
			for (int var11 = 0; var11 < this.vertexCount; var11++) {
				VertexNormal var12 = super.field399[var11];
				VertexNormal var13 = this.field577[var11] = new VertexNormal();
				var13.field255 = var12.field255;
				var13.field256 = var12.field256;
				var13.field257 = var12.field257;
				var13.field258 = var12.field258;
			}
		}
		if (arg5) {
			this.method142(true);
		} else {
			this.method144(-890);
		}
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.field547; var6++) {
			int var8 = this.field548[var6];
			int var9 = this.field549[var6];
			int var10 = this.field550[var6];
			if (this.field554 == null) {
				int var11 = this.field557[var6];
				VertexNormal var12 = super.field399[var8];
				int var13 = (var12.field257 * arg4 + var12.field256 * arg3 + var12.field255 * arg2) / (var12.field258 * arg1) + arg0;
				this.field551[var6] = method157(var11, var13, 0);
				VertexNormal var14 = super.field399[var9];
				int var15 = (var14.field257 * arg4 + var14.field256 * arg3 + var14.field255 * arg2) / (var14.field258 * arg1) + arg0;
				this.field552[var6] = method157(var11, var15, 0);
				VertexNormal var16 = super.field399[var10];
				int var17 = (var16.field257 * arg4 + var16.field256 * arg3 + var16.field255 * arg2) / (var16.field258 * arg1) + arg0;
				this.field553[var6] = method157(var11, var17, 0);
			} else if ((this.field554[var6] & 0x1) == 0) {
				int var18 = this.field557[var6];
				int var19 = this.field554[var6];
				VertexNormal var20 = super.field399[var8];
				int var21 = (var20.field257 * arg4 + var20.field256 * arg3 + var20.field255 * arg2) / (var20.field258 * arg1) + arg0;
				this.field551[var6] = method157(var18, var21, var19);
				VertexNormal var22 = super.field399[var9];
				int var23 = (var22.field257 * arg4 + var22.field256 * arg3 + var22.field255 * arg2) / (var22.field258 * arg1) + arg0;
				this.field552[var6] = method157(var18, var23, var19);
				VertexNormal var24 = super.field399[var10];
				int var25 = (var24.field257 * arg4 + var24.field256 * arg3 + var24.field255 * arg2) / (var24.field258 * arg1) + arg0;
				this.field553[var6] = method157(var18, var25, var19);
			}
		}
		super.field399 = null;
		this.field577 = null;
		this.field572 = null;
		this.field573 = null;
		if (this.field554 != null) {
			for (int var7 = 0; var7 < this.field547; var7++) {
				if ((this.field554[var7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.field557 = null;
	}

	@ObfuscatedName("fb.a(III)I")
	public static final int method157(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		int var4 = (arg0 & 0x7F) * arg1 >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	@ObfuscatedName("fb.a(IIIIIII)V")
	public final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.field647;
		int var9 = Pix3D.field648;
		int var10 = field606[arg0];
		int var11 = field607[arg0];
		int var12 = field606[arg1];
		int var13 = field607[arg1];
		int var14 = field606[arg2];
		int var15 = field607[arg2];
		int var16 = field606[arg3];
		int var17 = field607[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < this.vertexCount; var19++) {
			int var20 = this.vertexX[var19];
			int var21 = this.vertexY[var19];
			int var22 = this.vertexZ[var19];
			if (arg2 != 0) {
				int var23 = var14 * var21 + var15 * var20 >> 16;
				var21 = var15 * var21 - var14 * var20 >> 16;
				var20 = var23;
			}
			if (arg0 != 0) {
				int var24 = var11 * var21 - var10 * var22 >> 16;
				var22 = var10 * var21 + var11 * var22 >> 16;
				var21 = var24;
			}
			if (arg1 != 0) {
				int var25 = var12 * var22 + var13 * var20 >> 16;
				var22 = var13 * var22 - var12 * var20 >> 16;
				var20 = var25;
			}
			int var26 = arg4 + var20;
			int var27 = arg5 + var21;
			int var28 = arg6 + var22;
			int var29 = var17 * var27 - var16 * var28 >> 16;
			int var30 = var16 * var27 + var17 * var28 >> 16;
			field584[var19] = var30 - var18;
			field582[var19] = (var26 << 9) / var30 + var8;
			field583[var19] = (var29 << 9) / var30 + var9;
			if (this.field559 > 0) {
				field585[var19] = var26;
				field586[var19] = var29;
				field587[var19] = var30;
			}
		}
		try {
			this.method159(false, false, 0);
		} catch (Exception var32) {
		}
	}

	@ObfuscatedName("fb.a(IIIIIIIII)V")
	public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = this.field567 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
		int var15 = var14 - this.field567 << 9;
		if (var15 / var13 >= Pix2D.field635) {
			return;
		}
		int var16 = this.field567 + var14 << 9;
		if (var16 / var13 <= -Pix2D.field635) {
			return;
		}
		int var17 = arg2 * arg6 - arg1 * var10 >> 16;
		int var18 = this.field567 * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= -Pix2D.field636) {
			return;
		}
		int var20 = (super.field400 * arg2 >> 16) + var18;
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix2D.field636) {
			return;
		}
		int var22 = (super.field400 * arg1 >> 16) + var12;
		boolean var23 = false;
		if (var11 - var22 <= 50) {
			var23 = true;
		}
		boolean var24 = false;
		if (arg8 > 0 && field601) {
			int var25 = var11 - var12;
			if (var25 <= 50) {
				var25 = 50;
			}
			int var26;
			int var27;
			if (var14 > 0) {
				var26 = var15 / var13;
				var27 = var16 / var25;
			} else {
				var27 = var16 / var13;
				var26 = var15 / var25;
			}
			int var28;
			int var29;
			if (var17 > 0) {
				var28 = var21 / var13;
				var29 = var19 / var25;
			} else {
				var29 = var19 / var13;
				var28 = var21 / var25;
			}
			int var30 = field602 - Pix3D.field647;
			int var31 = field603 - Pix3D.field648;
			if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
				if (this.field576) {
					field605[field604++] = arg8;
				} else {
					var24 = true;
				}
			}
		}
		int var32 = Pix3D.field647;
		int var33 = Pix3D.field648;
		int var34 = 0;
		int var35 = 0;
		if (arg0 != 0) {
			var34 = field606[arg0];
			var35 = field607[arg0];
		}
		for (int var36 = 0; var36 < this.vertexCount; var36++) {
			int var37 = this.vertexX[var36];
			int var38 = this.vertexY[var36];
			int var39 = this.vertexZ[var36];
			if (arg0 != 0) {
				int var40 = var34 * var39 + var35 * var37 >> 16;
				var39 = var35 * var39 - var34 * var37 >> 16;
				var37 = var40;
			}
			int var41 = arg5 + var37;
			int var42 = arg6 + var38;
			int var43 = arg7 + var39;
			int var44 = arg3 * var43 + arg4 * var41 >> 16;
			int var45 = arg4 * var43 - arg3 * var41 >> 16;
			int var47 = arg2 * var42 - arg1 * var45 >> 16;
			int var48 = arg1 * var42 + arg2 * var45 >> 16;
			field584[var36] = var48 - var11;
			if (var48 >= 50) {
				field582[var36] = (var44 << 9) / var48 + var32;
				field583[var36] = (var47 << 9) / var48 + var33;
			} else {
				field582[var36] = -5000;
				var23 = true;
			}
			if (var23 || this.field559 > 0) {
				field585[var36] = var44;
				field586[var36] = var47;
				field587[var36] = var48;
			}
		}
		try {
			this.method159(var23, var24, arg8);
		} catch (Exception var50) {
		}
	}

	@ObfuscatedName("fb.a(ZZI)V")
	public final void method159(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < this.field569; var4++) {
			field588[var4] = 0;
		}
		for (int var5 = 0; var5 < this.field547; var5++) {
			if (this.field554 == null || this.field554[var5] != -1) {
				int var30 = this.field548[var5];
				int var31 = this.field549[var5];
				int var32 = this.field550[var5];
				int var33 = field582[var30];
				int var34 = field582[var31];
				int var35 = field582[var32];
				if (arg0 && (var33 == -5000 || var34 == -5000 || var35 == -5000)) {
					field581[var5] = true;
					int var36 = (field584[var30] + field584[var31] + field584[var32]) / 3 + this.field570;
					field589[var36][field588[var36]++] = var5;
				} else {
					if (arg1 && this.method162(field602, field603, field583[var30], field583[var31], field583[var32], var33, var34, var35)) {
						field605[field604++] = arg2;
						arg1 = false;
					}
					if ((field583[var32] - field583[var31]) * (var33 - var34) - (field583[var30] - field583[var31]) * (var35 - var34) > 0) {
						field581[var5] = false;
						if (var33 >= 0 && var34 >= 0 && var35 >= 0 && var33 <= Pix2D.field634 && var34 <= Pix2D.field634 && var35 <= Pix2D.field634) {
							field580[var5] = false;
						} else {
							field580[var5] = true;
						}
						int var37 = (field584[var30] + field584[var31] + field584[var32]) / 3 + this.field570;
						field589[var37][field588[var37]++] = var5;
					}
				}
			}
		}
		if (this.field555 == null) {
			for (int var6 = this.field569 - 1; var6 >= 0; var6--) {
				int var7 = field588[var6];
				if (var7 > 0) {
					int[] var8 = field589[var6];
					for (int var9 = 0; var9 < var7; var9++) {
						this.method160(var8[var9]);
					}
				}
			}
			return;
		}
		for (int var10 = 0; var10 < 12; var10++) {
			field590[var10] = 0;
			field594[var10] = 0;
		}
		for (int var11 = this.field569 - 1; var11 >= 0; var11--) {
			int var24 = field588[var11];
			if (var24 > 0) {
				int[] var25 = field589[var11];
				for (int var26 = 0; var26 < var24; var26++) {
					int var27 = var25[var26];
					int var28 = this.field555[var27];
					int var29 = field590[var28]++;
					field591[var28][var29] = var27;
					if (var28 < 10) {
						field594[var28] += var11;
					} else if (var28 == 10) {
						field592[var29] = var11;
					} else {
						field593[var29] = var11;
					}
				}
			}
		}
		int var12 = 0;
		if (field590[1] > 0 || field590[2] > 0) {
			var12 = (field594[1] + field594[2]) / (field590[1] + field590[2]);
		}
		int var13 = 0;
		if (field590[3] > 0 || field590[4] > 0) {
			var13 = (field594[3] + field594[4]) / (field590[3] + field590[4]);
		}
		int var14 = 0;
		if (field590[6] > 0 || field590[8] > 0) {
			var14 = (field594[6] + field594[8]) / (field590[6] + field590[8]);
		}
		int var15 = 0;
		int var16 = field590[10];
		int[] var17 = field591[10];
		int[] var18 = field592;
		if (var15 == var16) {
			var15 = 0;
			var16 = field590[11];
			var17 = field591[11];
			var18 = field593;
		}
		int var19;
		if (var15 < var16) {
			var19 = var18[var15];
		} else {
			var19 = -1000;
		}
		for (int var20 = 0; var20 < 10; var20++) {
			while (var20 == 0 && var19 > var12) {
				this.method160(var17[var15++]);
				if (var15 == var16 && field591[11] != var17) {
					var15 = 0;
					var16 = field590[11];
					var17 = field591[11];
					var18 = field593;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 3 && var19 > var13) {
				this.method160(var17[var15++]);
				if (var15 == var16 && field591[11] != var17) {
					var15 = 0;
					var16 = field590[11];
					var17 = field591[11];
					var18 = field593;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 5 && var19 > var14) {
				this.method160(var17[var15++]);
				if (var15 == var16 && field591[11] != var17) {
					var15 = 0;
					var16 = field590[11];
					var17 = field591[11];
					var18 = field593;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			int var21 = field590[var20];
			int[] var22 = field591[var20];
			for (int var23 = 0; var23 < var21; var23++) {
				this.method160(var22[var23]);
			}
		}
		while (var19 != -1000) {
			this.method160(var17[var15++]);
			if (var15 == var16 && field591[11] != var17) {
				var15 = 0;
				var17 = field591[11];
				var16 = field590[11];
				var18 = field593;
			}
			if (var15 < var16) {
				var19 = var18[var15];
			} else {
				var19 = -1000;
			}
		}
	}

	@ObfuscatedName("fb.f(I)V")
	public final void method160(int arg0) {
		if (field581[arg0]) {
			this.method161(arg0);
			return;
		}
		int var2 = this.field548[arg0];
		int var3 = this.field549[arg0];
		int var4 = this.field550[arg0];
		Pix3D.field643 = field580[arg0];
		if (this.field556 == null) {
			Pix3D.field646 = 0;
		} else {
			Pix3D.field646 = this.field556[arg0];
		}
		int var5;
		if (this.field554 == null) {
			var5 = 0;
		} else {
			var5 = this.field554[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.method187(field583[var2], field583[var3], field583[var4], field582[var2], field582[var3], field582[var4], this.field551[arg0], this.field552[arg0], this.field553[arg0]);
		} else if (var5 == 1) {
			Pix3D.method189(field583[var2], field583[var3], field583[var4], field582[var2], field582[var3], field582[var4], field608[this.field551[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.field554[arg0] >> 2;
			int var7 = this.field560[var6];
			int var8 = this.field561[var6];
			int var9 = this.field562[var6];
			Pix3D.method191(field583[var2], field583[var3], field583[var4], field582[var2], field582[var3], field582[var4], this.field551[arg0], this.field552[arg0], this.field553[arg0], field585[var7], field585[var8], field585[var9], field586[var7], field586[var8], field586[var9], field587[var7], field587[var8], field587[var9], this.field557[arg0]);
		} else if (var5 == 3) {
			int var10 = this.field554[arg0] >> 2;
			int var11 = this.field560[var10];
			int var12 = this.field561[var10];
			int var13 = this.field562[var10];
			Pix3D.method191(field583[var2], field583[var3], field583[var4], field582[var2], field582[var3], field582[var4], this.field551[arg0], this.field551[arg0], this.field551[arg0], field585[var11], field585[var12], field585[var13], field586[var11], field586[var12], field586[var13], field587[var11], field587[var12], field587[var13], this.field557[arg0]);
		}
	}

	@ObfuscatedName("fb.g(I)V")
	public final void method161(int arg0) {
		int var2 = Pix3D.field647;
		int var3 = Pix3D.field648;
		int var4 = 0;
		int var5 = this.field548[arg0];
		int var6 = this.field549[arg0];
		int var7 = this.field550[arg0];
		int var8 = field587[var5];
		int var9 = field587[var6];
		int var10 = field587[var7];
		if (var8 >= 50) {
			field595[var4] = field582[var5];
			field596[var4] = field583[var5];
			field597[var4++] = this.field551[arg0];
		} else {
			int var11 = field585[var5];
			int var12 = field586[var5];
			int var13 = this.field551[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field609[var10 - var8];
				field595[var4] = (((field585[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				field596[var4] = (((field586[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				field597[var4++] = ((this.field553[arg0] - var13) * var14 >> 16) + var13;
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field609[var9 - var8];
				field595[var4] = (((field585[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				field596[var4] = (((field586[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				field597[var4++] = ((this.field552[arg0] - var13) * var15 >> 16) + var13;
			}
		}
		if (var9 >= 50) {
			field595[var4] = field582[var6];
			field596[var4] = field583[var6];
			field597[var4++] = this.field552[arg0];
		} else {
			int var16 = field585[var6];
			int var17 = field586[var6];
			int var18 = this.field552[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field609[var8 - var9];
				field595[var4] = (((field585[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				field596[var4] = (((field586[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				field597[var4++] = ((this.field551[arg0] - var18) * var19 >> 16) + var18;
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field609[var10 - var9];
				field595[var4] = (((field585[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				field596[var4] = (((field586[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				field597[var4++] = ((this.field553[arg0] - var18) * var20 >> 16) + var18;
			}
		}
		if (var10 >= 50) {
			field595[var4] = field582[var7];
			field596[var4] = field583[var7];
			field597[var4++] = this.field553[arg0];
		} else {
			int var21 = field585[var7];
			int var22 = field586[var7];
			int var23 = this.field553[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field609[var9 - var10];
				field595[var4] = (((field585[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				field596[var4] = (((field586[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				field597[var4++] = ((this.field552[arg0] - var23) * var24 >> 16) + var23;
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field609[var8 - var10];
				field595[var4] = (((field585[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				field596[var4] = (((field586[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				field597[var4++] = ((this.field551[arg0] - var23) * var25 >> 16) + var23;
			}
		}
		int var26 = field595[0];
		int var27 = field595[1];
		int var28 = field595[2];
		int var29 = field596[0];
		int var30 = field596[1];
		int var31 = field596[2];
		if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) <= 0) {
			return;
		}
		Pix3D.field643 = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.field634 || var27 > Pix2D.field634 || var28 > Pix2D.field634) {
				Pix3D.field643 = true;
			}
			int var32;
			if (this.field554 == null) {
				var32 = 0;
			} else {
				var32 = this.field554[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.method187(var29, var30, var31, var26, var27, var28, field597[0], field597[1], field597[2]);
			} else if (var32 == 1) {
				Pix3D.method189(var29, var30, var31, var26, var27, var28, field608[this.field551[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.field554[arg0] >> 2;
				int var34 = this.field560[var33];
				int var35 = this.field561[var33];
				int var36 = this.field562[var33];
				Pix3D.method191(var29, var30, var31, var26, var27, var28, field597[0], field597[1], field597[2], field585[var34], field585[var35], field585[var36], field586[var34], field586[var35], field586[var36], field587[var34], field587[var35], field587[var36], this.field557[arg0]);
			} else if (var32 == 3) {
				int var37 = this.field554[arg0] >> 2;
				int var38 = this.field560[var37];
				int var39 = this.field561[var37];
				int var40 = this.field562[var37];
				Pix3D.method191(var29, var30, var31, var26, var27, var28, this.field551[arg0], this.field551[arg0], this.field551[arg0], field585[var38], field585[var39], field585[var40], field586[var38], field586[var39], field586[var40], field587[var38], field587[var39], field587[var40], this.field557[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.field634 || var27 > Pix2D.field634 || var28 > Pix2D.field634 || field595[3] < 0 || field595[3] > Pix2D.field634) {
			Pix3D.field643 = true;
		}
		int var41;
		if (this.field554 == null) {
			var41 = 0;
		} else {
			var41 = this.field554[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.method187(var29, var30, var31, var26, var27, var28, field597[0], field597[1], field597[2]);
			Pix3D.method187(var29, var31, field596[3], var26, var28, field595[3], field597[0], field597[2], field597[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = field608[this.field551[arg0]];
			Pix3D.method189(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.method189(var29, var31, field596[3], var26, var28, field595[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.field554[arg0] >> 2;
			int var44 = this.field560[var43];
			int var45 = this.field561[var43];
			int var46 = this.field562[var43];
			Pix3D.method191(var29, var30, var31, var26, var27, var28, field597[0], field597[1], field597[2], field585[var44], field585[var45], field585[var46], field586[var44], field586[var45], field586[var46], field587[var44], field587[var45], field587[var46], this.field557[arg0]);
			Pix3D.method191(var29, var31, field596[3], var26, var28, field595[3], field597[0], field597[2], field597[3], field585[var44], field585[var45], field585[var46], field586[var44], field586[var45], field586[var46], field587[var44], field587[var45], field587[var46], this.field557[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.field554[arg0] >> 2;
		int var48 = this.field560[var47];
		int var49 = this.field561[var47];
		int var50 = this.field562[var47];
		Pix3D.method191(var29, var30, var31, var26, var27, var28, this.field551[arg0], this.field551[arg0], this.field551[arg0], field585[var48], field585[var49], field585[var50], field586[var48], field586[var49], field586[var50], field587[var48], field587[var49], field587[var50], this.field557[arg0]);
		Pix3D.method191(var29, var31, field596[3], var26, var28, field595[3], this.field551[arg0], this.field551[arg0], this.field551[arg0], field585[var48], field585[var49], field585[var50], field586[var48], field586[var49], field586[var50], field587[var48], field587[var49], field587[var50], this.field557[arg0]);
	}

	@ObfuscatedName("fb.a(IIIIIIII)Z")
	public final boolean method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}
}
