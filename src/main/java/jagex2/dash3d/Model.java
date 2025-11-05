package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

public class Model extends ModelSource {

	@ObfuscatedName("LZYQDKJV.eb")
	public boolean field1227 = false;

	@ObfuscatedName("LZYQDKJV.y")
	public int field1195;

	@ObfuscatedName("LZYQDKJV.C")
	public int field1199;

	@ObfuscatedName("LZYQDKJV.O")
	public int field1211;

	@ObfuscatedName("LZYQDKJV.z")
	public int[] field1196;

	@ObfuscatedName("LZYQDKJV.A")
	public int[] field1197;

	@ObfuscatedName("LZYQDKJV.B")
	public int[] field1198;

	@ObfuscatedName("LZYQDKJV.D")
	public int[] field1200;

	@ObfuscatedName("LZYQDKJV.E")
	public int[] field1201;

	@ObfuscatedName("LZYQDKJV.F")
	public int[] field1202;

	@ObfuscatedName("LZYQDKJV.P")
	public int[] field1212;

	@ObfuscatedName("LZYQDKJV.Q")
	public int[] field1213;

	@ObfuscatedName("LZYQDKJV.R")
	public int[] field1214;

	@ObfuscatedName("LZYQDKJV.ab")
	public int[] field1223;

	@ObfuscatedName("LZYQDKJV.J")
	public int[] field1206;

	@ObfuscatedName("LZYQDKJV.K")
	public int[] field1207;

	@ObfuscatedName("LZYQDKJV.N")
	public int field1210;

	@ObfuscatedName("LZYQDKJV.L")
	public int[] field1208;

	@ObfuscatedName("LZYQDKJV.bb")
	public int[] field1224;

	@ObfuscatedName("LZYQDKJV.M")
	public int[] faceColour;

	@ObfuscatedName("LZYQDKJV.G")
	public int[] field1203;

	@ObfuscatedName("LZYQDKJV.H")
	public int[] field1204;

	@ObfuscatedName("LZYQDKJV.I")
	public int[] field1205;

	@ObfuscatedName("LZYQDKJV.fb")
	public VertexNormal[] field1228;

	@ObfuscatedName("LZYQDKJV.W")
	public int field1219;

	@ObfuscatedName("LZYQDKJV.V")
	public int field1218;

	@ObfuscatedName("LZYQDKJV.Y")
	public int field1221;

	@ObfuscatedName("LZYQDKJV.X")
	public int field1220;

	@ObfuscatedName("LZYQDKJV.T")
	public int field1216;

	@ObfuscatedName("LZYQDKJV.U")
	public int field1217;

	@ObfuscatedName("LZYQDKJV.S")
	public int field1215;

	@ObfuscatedName("LZYQDKJV.t")
	public static Model field1190 = new Model(852);

	@ObfuscatedName("LZYQDKJV.u")
	public static int[] field1191 = new int[2000];

	@ObfuscatedName("LZYQDKJV.v")
	public static int[] field1192 = new int[2000];

	@ObfuscatedName("LZYQDKJV.w")
	public static int[] field1193 = new int[2000];

	@ObfuscatedName("LZYQDKJV.x")
	public static int[] field1194 = new int[2000];

	@ObfuscatedName("LZYQDKJV.ib")
	public static boolean[] field1231 = new boolean[4096];

	@ObfuscatedName("LZYQDKJV.jb")
	public static boolean[] field1232 = new boolean[4096];

	@ObfuscatedName("LZYQDKJV.kb")
	public static int[] field1233 = new int[4096];

	@ObfuscatedName("LZYQDKJV.lb")
	public static int[] field1234 = new int[4096];

	@ObfuscatedName("LZYQDKJV.mb")
	public static int[] field1235 = new int[4096];

	@ObfuscatedName("LZYQDKJV.nb")
	public static int[] field1236 = new int[4096];

	@ObfuscatedName("LZYQDKJV.ob")
	public static int[] field1237 = new int[4096];

	@ObfuscatedName("LZYQDKJV.pb")
	public static int[] field1238 = new int[4096];

	@ObfuscatedName("LZYQDKJV.qb")
	public static int[] field1239 = new int[1500];

	@ObfuscatedName("LZYQDKJV.rb")
	public static int[][] field1240 = new int[1500][512];

	@ObfuscatedName("LZYQDKJV.sb")
	public static int[] field1241 = new int[12];

	@ObfuscatedName("LZYQDKJV.tb")
	public static int[][] field1242 = new int[12][2000];

	@ObfuscatedName("LZYQDKJV.ub")
	public static int[] field1243 = new int[2000];

	@ObfuscatedName("LZYQDKJV.vb")
	public static int[] field1244 = new int[2000];

	@ObfuscatedName("LZYQDKJV.wb")
	public static int[] field1245 = new int[12];

	@ObfuscatedName("LZYQDKJV.xb")
	public static int[] field1246 = new int[10];

	@ObfuscatedName("LZYQDKJV.yb")
	public static int[] field1247 = new int[10];

	@ObfuscatedName("LZYQDKJV.zb")
	public static int[] field1248 = new int[10];

	@ObfuscatedName("LZYQDKJV.Hb")
	public static int[] field1256 = new int[1000];

	@ObfuscatedName("LZYQDKJV.Ib")
	public static int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("LZYQDKJV.Jb")
	public static int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("LZYQDKJV.Kb")
	public static int[] field1259 = Pix3D.colourTable;

	@ObfuscatedName("LZYQDKJV.Lb")
	public static int[] field1260 = Pix3D.divTable2;

	@ObfuscatedName("LZYQDKJV.s")
	public static int field1189;

	@ObfuscatedName("LZYQDKJV.Z")
	public int field1222;

	@ObfuscatedName("LZYQDKJV.Ab")
	public static int field1249;

	@ObfuscatedName("LZYQDKJV.Bb")
	public static int field1250;

	@ObfuscatedName("LZYQDKJV.Cb")
	public static int field1251;

	@ObfuscatedName("LZYQDKJV.Eb")
	public static int mouseX;

	@ObfuscatedName("LZYQDKJV.Fb")
	public static int mouseY;

	@ObfuscatedName("LZYQDKJV.Gb")
	public static int pickedCount;

	@ObfuscatedName("LZYQDKJV.hb")
	public static OnDemandProvider field1230;

	@ObfuscatedName("LZYQDKJV.Db")
	public static boolean checkHover;

	@ObfuscatedName("LZYQDKJV.gb")
	public static Metadata[] field1229;

	@ObfuscatedName("LZYQDKJV.cb")
	public int[][] field1225;

	@ObfuscatedName("LZYQDKJV.db")
	public int[][] field1226;

	@ObfuscatedName("LZYQDKJV.a(Z)V")
	public static void unload() {
		field1229 = null;
		field1231 = null;
		field1232 = null;
		field1233 = null;
		field1234 = null;
		field1235 = null;
		field1236 = null;
		field1237 = null;
		field1238 = null;
		field1239 = null;
		field1240 = null;
		field1241 = null;
		field1242 = null;
		field1243 = null;
		field1244 = null;
		field1245 = null;
		sinTable = null;
		cosTable = null;
		field1259 = null;
		field1260 = null;
	}

	@ObfuscatedName("LZYQDKJV.a(ILQUWTPUDC;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		field1229 = new Metadata[arg0];
		field1230 = arg1;
	}

	@ObfuscatedName("LZYQDKJV.a([BIB)V")
	public static void method357(byte[] arg0, int arg1, byte arg2) {
		if (arg2 != 7) {
			return;
		}
		if (arg0 == null) {
			Metadata var3 = field1229[arg1] = new Metadata();
			var3.field1111 = 0;
			var3.field1112 = 0;
			var3.field1113 = 0;
			return;
		}
		Packet var4 = new Packet(arg0);
		var4.pos = arg0.length - 18;
		Metadata var5 = field1229[arg1] = new Metadata();
		var5.field1110 = arg0;
		var5.field1111 = var4.g2();
		var5.field1112 = var4.g2();
		var5.field1113 = var4.g1();
		int var6 = var4.g1();
		int var7 = var4.g1();
		int var8 = var4.g1();
		int var9 = var4.g1();
		int var10 = var4.g1();
		int var11 = var4.g2();
		int var12 = var4.g2();
		int var13 = var4.g2();
		int var14 = var4.g2();
		byte var15 = 0;
		var5.field1114 = var15;
		int var16 = var5.field1111 + var15;
		var5.field1120 = var16;
		int var17 = var5.field1112 + var16;
		var5.field1123 = var17;
		if (var7 == 255) {
			var17 += var5.field1112;
		} else {
			var5.field1123 = -var7 - 1;
		}
		var5.field1125 = var17;
		if (var9 == 1) {
			var17 += var5.field1112;
		} else {
			var5.field1125 = -1;
		}
		var5.field1122 = var17;
		if (var6 == 1) {
			var17 += var5.field1112;
		} else {
			var5.field1122 = -1;
		}
		var5.field1118 = var17;
		if (var10 == 1) {
			var17 += var5.field1111;
		} else {
			var5.field1118 = -1;
		}
		var5.field1124 = var17;
		if (var8 == 1) {
			var17 += var5.field1112;
		} else {
			var5.field1124 = -1;
		}
		var5.field1119 = var17;
		int var18 = var14 + var17;
		var5.field1121 = var18;
		int var19 = var5.field1112 * 2 + var18;
		var5.field1126 = var19;
		int var20 = var5.field1113 * 6 + var19;
		var5.field1115 = var20;
		int var21 = var11 + var20;
		var5.field1116 = var21;
		int var22 = var12 + var21;
		var5.field1117 = var22;
		int var10000 = var13 + var22;
	}

	@ObfuscatedName("LZYQDKJV.a(II)V")
	public static void method358(int arg0) {
		field1229[arg0] = null;
	}

	@ObfuscatedName("LZYQDKJV.a(I)LLZYQDKJV;")
	public static Model tryGet(int arg0) {
		if (field1229 == null) {
			return null;
		}
		Metadata var1 = field1229[arg0];
		if (var1 == null) {
			field1230.requestModel(arg0);
			return null;
		} else {
			return new Model(arg0, -478);
		}
	}

	@ObfuscatedName("LZYQDKJV.b(I)Z")
	public static boolean method360(int arg0) {
		if (field1229 == null) {
			return false;
		}
		Metadata var1 = field1229[arg0];
		if (var1 == null) {
			field1230.requestModel(arg0);
			return false;
		} else {
			return true;
		}
	}

	public Model(int arg0) {
	}

	public Model(int arg0, int arg1) {
		field1189++;
		Metadata var3 = field1229[arg0];
		this.field1195 = var3.field1111;
		this.field1199 = var3.field1112;
		this.field1211 = var3.field1113;
		this.field1196 = new int[this.field1195];
		this.field1197 = new int[this.field1195];
		this.field1198 = new int[this.field1195];
		this.field1200 = new int[this.field1199];
		this.field1201 = new int[this.field1199];
		this.field1202 = new int[this.field1199];
		this.field1212 = new int[this.field1211];
		this.field1213 = new int[this.field1211];
		this.field1214 = new int[this.field1211];
		if (var3.field1118 >= 0) {
			this.field1223 = new int[this.field1195];
		}
		if (var3.field1122 >= 0) {
			this.field1206 = new int[this.field1199];
		}
		if (var3.field1123 >= 0) {
			this.field1207 = new int[this.field1199];
		} else {
			this.field1210 = -var3.field1123 - 1;
		}
		if (var3.field1124 >= 0) {
			this.field1208 = new int[this.field1199];
		}
		if (var3.field1125 >= 0) {
			this.field1224 = new int[this.field1199];
		}
		this.faceColour = new int[this.field1199];
		Packet var4 = new Packet(var3.field1110);
		var4.pos = var3.field1114;
		Packet var5 = new Packet(var3.field1110);
		var5.pos = var3.field1115;
		Packet var6 = new Packet(var3.field1110);
		var6.pos = var3.field1116;
		Packet var7 = new Packet(var3.field1110);
		var7.pos = var3.field1117;
		Packet var8 = new Packet(var3.field1110);
		var8.pos = var3.field1118;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		for (int var12 = 0; var12 < this.field1195; var12++) {
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
			this.field1196[var12] = var9 + var25;
			this.field1197[var12] = var10 + var26;
			this.field1198[var12] = var11 + var27;
			var9 = this.field1196[var12];
			var10 = this.field1197[var12];
			var11 = this.field1198[var12];
			if (this.field1223 != null) {
				this.field1223[var12] = var8.g1();
			}
		}
		var4.pos = var3.field1121;
		var5.pos = var3.field1122;
		var6.pos = var3.field1123;
		var7.pos = var3.field1124;
		var8.pos = var3.field1125;
		for (int var13 = 0; var13 < this.field1199; var13++) {
			this.faceColour[var13] = var4.g2();
			if (this.field1206 != null) {
				this.field1206[var13] = var5.g1();
			}
			if (this.field1207 != null) {
				this.field1207[var13] = var6.g1();
			}
			if (this.field1208 != null) {
				this.field1208[var13] = var7.g1();
			}
			if (this.field1224 != null) {
				this.field1224[var13] = var8.g1();
			}
		}
		var4.pos = var3.field1119;
		var5.pos = var3.field1120;
		int var14 = 0;
		int var15 = 0;
		int var16 = 0;
		int var17 = 0;
		for (int var18 = 0; var18 < this.field1199; var18++) {
			int var20 = var5.g1();
			if (var20 == 1) {
				var14 = var4.gsmart() + var17;
				var15 = var4.gsmart() + var14;
				var16 = var4.gsmart() + var15;
				var17 = var16;
				this.field1200[var18] = var14;
				this.field1201[var18] = var15;
				this.field1202[var18] = var16;
			}
			if (var20 == 2) {
				var14 = var14;
				var15 = var16;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field1200[var18] = var14;
				this.field1201[var18] = var15;
				this.field1202[var18] = var16;
			}
			if (var20 == 3) {
				var14 = var16;
				var15 = var15;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field1200[var18] = var14;
				this.field1201[var18] = var15;
				this.field1202[var18] = var16;
			}
			if (var20 == 4) {
				int var23 = var14;
				var14 = var15;
				var15 = var23;
				var16 = var4.gsmart() + var17;
				var17 = var16;
				this.field1200[var18] = var14;
				this.field1201[var18] = var23;
				this.field1202[var18] = var16;
			}
		}
		var4.pos = var3.field1126;
		for (int var19 = 0; var19 < this.field1211; var19++) {
			this.field1212[var19] = var4.g2();
			this.field1213[var19] = var4.g2();
			this.field1214[var19] = var4.g2();
		}
	}

	public Model(int arg0, Model[] arg1, byte arg2) {
		field1189++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.field1195 = 0;
		this.field1199 = 0;
		this.field1211 = 0;
		this.field1210 = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var15 = arg1[var8];
			if (var15 != null) {
				this.field1195 += var15.field1195;
				this.field1199 += var15.field1199;
				this.field1211 += var15.field1211;
				var4 |= var15.field1206 != null;
				if (var15.field1207 == null) {
					if (this.field1210 == -1) {
						this.field1210 = var15.field1210;
					}
					if (this.field1210 != var15.field1210) {
						var5 = true;
					}
				} else {
					var5 = true;
				}
				var6 |= var15.field1208 != null;
				var7 |= var15.field1224 != null;
			}
		}
		this.field1196 = new int[this.field1195];
		this.field1197 = new int[this.field1195];
		this.field1198 = new int[this.field1195];
		this.field1223 = new int[this.field1195];
		this.field1200 = new int[this.field1199];
		this.field1201 = new int[this.field1199];
		this.field1202 = new int[this.field1199];
		this.field1212 = new int[this.field1211];
		this.field1213 = new int[this.field1211];
		this.field1214 = new int[this.field1211];
		if (var4) {
			this.field1206 = new int[this.field1199];
		}
		if (var5) {
			this.field1207 = new int[this.field1199];
		}
		if (var6) {
			this.field1208 = new int[this.field1199];
		}
		if (var7) {
			this.field1224 = new int[this.field1199];
		}
		this.faceColour = new int[this.field1199];
		this.field1195 = 0;
		this.field1199 = 0;
		this.field1211 = 0;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0; var10++) {
			Model var11 = arg1[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.field1199; var12++) {
					if (var4) {
						if (var11.field1206 == null) {
							this.field1206[this.field1199] = 0;
						} else {
							int var14 = var11.field1206[var12];
							if ((var14 & 0x2) == 2) {
								var14 += var9 << 2;
							}
							this.field1206[this.field1199] = var14;
						}
					}
					if (var5) {
						if (var11.field1207 == null) {
							this.field1207[this.field1199] = var11.field1210;
						} else {
							this.field1207[this.field1199] = var11.field1207[var12];
						}
					}
					if (var6) {
						if (var11.field1208 == null) {
							this.field1208[this.field1199] = 0;
						} else {
							this.field1208[this.field1199] = var11.field1208[var12];
						}
					}
					if (var7 && var11.field1224 != null) {
						this.field1224[this.field1199] = var11.field1224[var12];
					}
					this.faceColour[this.field1199] = var11.faceColour[var12];
					this.field1200[this.field1199] = this.method362(var11, var11.field1200[var12]);
					this.field1201[this.field1199] = this.method362(var11, var11.field1201[var12]);
					this.field1202[this.field1199] = this.method362(var11, var11.field1202[var12]);
					this.field1199++;
				}
				for (int var13 = 0; var13 < var11.field1211; var13++) {
					this.field1212[this.field1211] = this.method362(var11, var11.field1212[var13]);
					this.field1213[this.field1211] = this.method362(var11, var11.field1213[var13]);
					this.field1214[this.field1211] = this.method362(var11, var11.field1214[var13]);
					this.field1211++;
				}
				var9 += var11.field1211;
			}
		}
	}

	public Model(int arg0, boolean arg1, int arg2, Model[] arg3) {
		field1189++;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.field1195 = 0;
		this.field1199 = 0;
		this.field1211 = 0;
		this.field1210 = -1;
		for (int var9 = 0; var9 < arg0; var9++) {
			Model var18 = arg3[var9];
			if (var18 != null) {
				this.field1195 += var18.field1195;
				this.field1199 += var18.field1199;
				this.field1211 += var18.field1211;
				var5 |= var18.field1206 != null;
				if (var18.field1207 == null) {
					if (this.field1210 == -1) {
						this.field1210 = var18.field1210;
					}
					if (this.field1210 != var18.field1210) {
						var6 = true;
					}
				} else {
					var6 = true;
				}
				var7 |= var18.field1208 != null;
				var8 |= var18.faceColour != null;
			}
		}
		this.field1196 = new int[this.field1195];
		this.field1197 = new int[this.field1195];
		this.field1198 = new int[this.field1195];
		this.field1200 = new int[this.field1199];
		this.field1201 = new int[this.field1199];
		this.field1202 = new int[this.field1199];
		this.field1203 = new int[this.field1199];
		this.field1204 = new int[this.field1199];
		this.field1205 = new int[this.field1199];
		this.field1212 = new int[this.field1211];
		this.field1213 = new int[this.field1211];
		this.field1214 = new int[this.field1211];
		if (var5) {
			this.field1206 = new int[this.field1199];
		}
		if (var6) {
			this.field1207 = new int[this.field1199];
		}
		if (var7) {
			this.field1208 = new int[this.field1199];
		}
		if (var8) {
			this.faceColour = new int[this.field1199];
		}
		this.field1195 = 0;
		if (arg2 != 0) {
			throw new NullPointerException();
		}
		this.field1199 = 0;
		this.field1211 = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < arg0; var11++) {
			Model var12 = arg3[var11];
			if (var12 != null) {
				int var13 = this.field1195;
				for (int var14 = 0; var14 < var12.field1195; var14++) {
					this.field1196[this.field1195] = var12.field1196[var14];
					this.field1197[this.field1195] = var12.field1197[var14];
					this.field1198[this.field1195] = var12.field1198[var14];
					this.field1195++;
				}
				for (int var15 = 0; var15 < var12.field1199; var15++) {
					this.field1200[this.field1199] = var12.field1200[var15] + var13;
					this.field1201[this.field1199] = var12.field1201[var15] + var13;
					this.field1202[this.field1199] = var12.field1202[var15] + var13;
					this.field1203[this.field1199] = var12.field1203[var15];
					this.field1204[this.field1199] = var12.field1204[var15];
					this.field1205[this.field1199] = var12.field1205[var15];
					if (var5) {
						if (var12.field1206 == null) {
							this.field1206[this.field1199] = 0;
						} else {
							int var17 = var12.field1206[var15];
							if ((var17 & 0x2) == 2) {
								var17 += var10 << 2;
							}
							this.field1206[this.field1199] = var17;
						}
					}
					if (var6) {
						if (var12.field1207 == null) {
							this.field1207[this.field1199] = var12.field1210;
						} else {
							this.field1207[this.field1199] = var12.field1207[var15];
						}
					}
					if (var7) {
						if (var12.field1208 == null) {
							this.field1208[this.field1199] = 0;
						} else {
							this.field1208[this.field1199] = var12.field1208[var15];
						}
					}
					if (var8 && var12.faceColour != null) {
						this.faceColour[this.field1199] = var12.faceColour[var15];
					}
					this.field1199++;
				}
				for (int var16 = 0; var16 < var12.field1211; var16++) {
					this.field1212[this.field1211] = var12.field1212[var16] + var13;
					this.field1213[this.field1211] = var12.field1213[var16] + var13;
					this.field1214[this.field1211] = var12.field1214[var16] + var13;
					this.field1211++;
				}
				var10 += var12.field1211;
			}
		}
		this.method363();
	}

	public Model(boolean arg0, boolean arg1, boolean arg2, Model arg3, boolean arg4) {
		field1189++;
		this.field1195 = arg3.field1195;
		this.field1199 = arg3.field1199;
		this.field1211 = arg3.field1211;
		if (arg0) {
			this.field1196 = arg3.field1196;
			this.field1197 = arg3.field1197;
			this.field1198 = arg3.field1198;
		} else {
			this.field1196 = new int[this.field1195];
			this.field1197 = new int[this.field1195];
			this.field1198 = new int[this.field1195];
			for (int var6 = 0; var6 < this.field1195; var6++) {
				this.field1196[var6] = arg3.field1196[var6];
				this.field1197[var6] = arg3.field1197[var6];
				this.field1198[var6] = arg3.field1198[var6];
			}
		}
		if (arg2) {
			this.faceColour = arg3.faceColour;
		} else {
			this.faceColour = new int[this.field1199];
			for (int var7 = 0; var7 < this.field1199; var7++) {
				this.faceColour[var7] = arg3.faceColour[var7];
			}
		}
		if (arg4) {
			this.field1208 = arg3.field1208;
		} else {
			this.field1208 = new int[this.field1199];
			if (arg3.field1208 == null) {
				for (int var8 = 0; var8 < this.field1199; var8++) {
					this.field1208[var8] = 0;
				}
			} else {
				for (int var9 = 0; var9 < this.field1199; var9++) {
					this.field1208[var9] = arg3.field1208[var9];
				}
			}
		}
		this.field1223 = arg3.field1223;
		this.field1224 = arg3.field1224;
		this.field1206 = arg3.field1206;
		this.field1200 = arg3.field1200;
		this.field1201 = arg3.field1201;
		this.field1202 = arg3.field1202;
		this.field1207 = arg3.field1207;
		this.field1210 = arg3.field1210;
		this.field1212 = arg3.field1212;
		this.field1213 = arg3.field1213;
		this.field1214 = arg3.field1214;
	}

	public Model(boolean arg0, boolean arg1, int arg2, Model arg3) {
		field1189++;
		this.field1195 = arg3.field1195;
		this.field1199 = arg3.field1199;
		this.field1211 = arg3.field1211;
		if (arg0) {
			this.field1197 = new int[this.field1195];
			for (int var5 = 0; var5 < this.field1195; var5++) {
				this.field1197[var5] = arg3.field1197[var5];
			}
		} else {
			this.field1197 = arg3.field1197;
		}
		if (arg1) {
			this.field1203 = new int[this.field1199];
			this.field1204 = new int[this.field1199];
			this.field1205 = new int[this.field1199];
			for (int var6 = 0; var6 < this.field1199; var6++) {
				this.field1203[var6] = arg3.field1203[var6];
				this.field1204[var6] = arg3.field1204[var6];
				this.field1205[var6] = arg3.field1205[var6];
			}
			this.field1206 = new int[this.field1199];
			if (arg3.field1206 == null) {
				for (int var7 = 0; var7 < this.field1199; var7++) {
					this.field1206[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < this.field1199; var8++) {
					this.field1206[var8] = arg3.field1206[var8];
				}
			}
			super.field1708 = new VertexNormal[this.field1195];
			for (int var9 = 0; var9 < this.field1195; var9++) {
				VertexNormal var10 = super.field1708[var9] = new VertexNormal();
				VertexNormal var11 = arg3.field1708[var9];
				var10.field1496 = var11.field1496;
				var10.field1497 = var11.field1497;
				var10.field1498 = var11.field1498;
				var10.field1499 = var11.field1499;
			}
			this.field1228 = arg3.field1228;
		} else {
			this.field1203 = arg3.field1203;
			this.field1204 = arg3.field1204;
			this.field1205 = arg3.field1205;
			this.field1206 = arg3.field1206;
		}
		this.field1196 = arg3.field1196;
		this.field1198 = arg3.field1198;
		this.faceColour = arg3.faceColour;
		this.field1208 = arg3.field1208;
		this.field1207 = arg3.field1207;
		this.field1210 = arg3.field1210;
		this.field1200 = arg3.field1200;
		this.field1201 = arg3.field1201;
		this.field1202 = arg3.field1202;
		this.field1212 = arg3.field1212;
		this.field1213 = arg3.field1213;
		this.field1214 = arg3.field1214;
		super.field1709 = arg3.field1709;
		this.field1219 = arg3.field1219;
		this.field1218 = arg3.field1218;
		this.field1221 = arg3.field1221;
		this.field1220 = arg3.field1220;
		this.field1216 = arg3.field1216;
		this.field1217 = arg3.field1217;
		this.field1215 = arg3.field1215;
	}

	@ObfuscatedName("LZYQDKJV.a(ZLLZYQDKJV;I)V")
	public void method361(boolean arg0, Model arg1) {
		this.field1195 = arg1.field1195;
		this.field1199 = arg1.field1199;
		this.field1211 = arg1.field1211;
		if (field1191.length < this.field1195) {
			field1191 = new int[this.field1195 + 100];
			field1192 = new int[this.field1195 + 100];
			field1193 = new int[this.field1195 + 100];
		}
		this.field1196 = field1191;
		this.field1197 = field1192;
		this.field1198 = field1193;
		for (int var4 = 0; var4 < this.field1195; var4++) {
			this.field1196[var4] = arg1.field1196[var4];
			this.field1197[var4] = arg1.field1197[var4];
			this.field1198[var4] = arg1.field1198[var4];
		}
		if (arg0) {
			this.field1208 = arg1.field1208;
		} else {
			if (field1194.length < this.field1199) {
				field1194 = new int[this.field1199 + 100];
			}
			this.field1208 = field1194;
			if (arg1.field1208 == null) {
				for (int var5 = 0; var5 < this.field1199; var5++) {
					this.field1208[var5] = 0;
				}
			} else {
				for (int var6 = 0; var6 < this.field1199; var6++) {
					this.field1208[var6] = arg1.field1208[var6];
				}
			}
		}
		this.field1206 = arg1.field1206;
		this.faceColour = arg1.faceColour;
		this.field1207 = arg1.field1207;
		this.field1210 = arg1.field1210;
		this.field1226 = arg1.field1226;
		this.field1225 = arg1.field1225;
		this.field1200 = arg1.field1200;
		this.field1201 = arg1.field1201;
		this.field1202 = arg1.field1202;
		this.field1203 = arg1.field1203;
		this.field1204 = arg1.field1204;
		this.field1205 = arg1.field1205;
		this.field1212 = arg1.field1212;
		this.field1213 = arg1.field1213;
		this.field1214 = arg1.field1214;
	}

	@ObfuscatedName("LZYQDKJV.a(LLZYQDKJV;I)I")
	public int method362(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.field1196[arg1];
		int var5 = arg0.field1197[arg1];
		int var6 = arg0.field1198[arg1];
		for (int var7 = 0; var7 < this.field1195; var7++) {
			if (this.field1196[var7] == var4 && this.field1197[var7] == var5 && this.field1198[var7] == var6) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.field1196[this.field1195] = var4;
			this.field1197[this.field1195] = var5;
			this.field1198[this.field1195] = var6;
			if (arg0.field1223 != null) {
				this.field1223[this.field1195] = arg0.field1223[arg1];
			}
			var3 = this.field1195++;
		}
		return var3;
	}

	@ObfuscatedName("LZYQDKJV.c(I)V")
	public void method363() {
		super.field1709 = 0;
		this.field1218 = 0;
		this.field1219 = 0;
		for (int var2 = 0; var2 < this.field1195; var2++) {
			int var4 = this.field1196[var2];
			int var5 = this.field1197[var2];
			int var6 = this.field1198[var2];
			if (-var5 > super.field1709) {
				super.field1709 = -var5;
			}
			if (var5 > this.field1219) {
				this.field1219 = var5;
			}
			int var7 = var4 * var4 + var6 * var6;
			if (var7 > this.field1218) {
				this.field1218 = var7;
			}
		}
		this.field1218 = (int) (Math.sqrt((double) this.field1218) + 0.99D);
		this.field1221 = (int) (Math.sqrt((double) (super.field1709 * super.field1709 + this.field1218 * this.field1218)) + 0.99D);
		this.field1220 = this.field1221 + (int) (Math.sqrt((double) (this.field1219 * this.field1219 + this.field1218 * this.field1218)) + 0.99D);
	}

	@ObfuscatedName("LZYQDKJV.d(I)V")
	public void method364() {
		super.field1709 = 0;
		this.field1219 = 0;
		for (int var2 = 0; var2 < this.field1195; var2++) {
			int var3 = this.field1197[var2];
			if (-var3 > super.field1709) {
				super.field1709 = -var3;
			}
			if (var3 > this.field1219) {
				this.field1219 = var3;
			}
		}
		this.field1221 = (int) (Math.sqrt((double) (super.field1709 * super.field1709 + this.field1218 * this.field1218)) + 0.99D);
		this.field1220 = this.field1221 + (int) (Math.sqrt((double) (this.field1219 * this.field1219 + this.field1218 * this.field1218)) + 0.99D);
	}

	@ObfuscatedName("LZYQDKJV.e(I)V")
	public void method365() {
		super.field1709 = 0;
		this.field1218 = 0;
		this.field1219 = 0;
		int var2 = 32767;
		int var3 = -32767;
		int var4 = -32767;
		int var5 = 32767;
		for (int var6 = 0; var6 < this.field1195; var6++) {
			int var7 = this.field1196[var6];
			int var8 = this.field1197[var6];
			int var9 = this.field1198[var6];
			if (var7 < var2) {
				var2 = var7;
			}
			if (var7 > var3) {
				var3 = var7;
			}
			if (var9 < var5) {
				var5 = var9;
			}
			if (var9 > var4) {
				var4 = var9;
			}
			if (-var8 > super.field1709) {
				super.field1709 = -var8;
			}
			if (var8 > this.field1219) {
				this.field1219 = var8;
			}
			int var10 = var7 * var7 + var9 * var9;
			if (var10 > this.field1218) {
				this.field1218 = var10;
			}
		}
		this.field1218 = (int) Math.sqrt((double) this.field1218);
		this.field1221 = (int) Math.sqrt((double) (super.field1709 * super.field1709 + this.field1218 * this.field1218));
		this.field1220 = this.field1221 + (int) Math.sqrt((double) (this.field1219 * this.field1219 + this.field1218 * this.field1218));
		this.field1216 = (var2 << 16) + (var3 & 0xFFFF);
		this.field1217 = (var4 << 16) + (var5 & 0xFFFF);
	}

	@ObfuscatedName("LZYQDKJV.f(I)V")
	public void createLabelReferences() {
		int var10002;
		if (this.field1223 != null) {
			int[] var2 = new int[256];
			int var3 = 0;
			for (int var4 = 0; var4 < this.field1195; var4++) {
				int var8 = this.field1223[var4];
				var10002 = var2[var8]++;
				if (var8 > var3) {
					var3 = var8;
				}
			}
			this.field1225 = new int[var3 + 1][];
			for (int var5 = 0; var5 <= var3; var5++) {
				this.field1225[var5] = new int[var2[var5]];
				var2[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.field1195) {
				int var7 = this.field1223[var6];
				this.field1225[var7][var2[var7]++] = var6++;
			}
			this.field1223 = null;
		}
		if (this.field1224 == null) {
			return;
		}
		int[] var9 = new int[256];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field1199; var11++) {
			int var15 = this.field1224[var11];
			var10002 = var9[var15]++;
			if (var15 > var10) {
				var10 = var15;
			}
		}
		this.field1226 = new int[var10 + 1][];
		for (int var12 = 0; var12 <= var10; var12++) {
			this.field1226[var12] = new int[var9[var12]];
			var9[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.field1199) {
			int var14 = this.field1224[var13];
			this.field1226[var14][var9[var14]++] = var13++;
		}
		this.field1224 = null;
	}

	@ObfuscatedName("LZYQDKJV.a(IB)V")
	public void applyTransform(int arg0) {
		if (this.field1225 == null || arg0 == -1) {
			return;
		}
		AnimFrame var3 = AnimFrame.get(arg0);
		if (var3 == null) {
			return;
		}
		AnimBase var4 = var3.base;
		boolean var5 = false;
		field1249 = 0;
		field1250 = 0;
		field1251 = 0;
		for (int var6 = 0; var6 < var3.size; var6++) {
			int var7 = var3.ti[var6];
			this.method369(var4.types[var7], var4.labels[var7], var3.tx[var6], var3.ty[var6], var3.tz[var6]);
		}
	}

	@ObfuscatedName("LZYQDKJV.a(III[I)V")
	public void method368(int arg0, int arg2, int[] arg3) {
		if (arg2 == -1) {
			return;
		}
		if (arg3 == null || arg0 == -1) {
			this.applyTransform(arg2);
			return;
		}
		AnimFrame var5 = AnimFrame.get(arg2);
		if (var5 == null) {
			return;
		}
		AnimFrame var6 = AnimFrame.get(arg0);
		if (var6 == null) {
			this.applyTransform(arg2);
			return;
		}
		AnimBase var7 = var5.base;
		field1249 = 0;
		field1250 = 0;
		field1251 = 0;
		byte var8 = 0;
		int var16 = var8 + 1;
		int var9 = arg3[var8];
		for (int var10 = 0; var10 < var5.size; var10++) {
			int var15 = var5.ti[var10];
			while (var15 > var9) {
				var9 = arg3[var16++];
			}
			if (var9 != var15 || var7.types[var15] == 0) {
				this.method369(var7.types[var15], var7.labels[var15], var5.tx[var10], var5.ty[var10], var5.tz[var10]);
			}
		}
		field1249 = 0;
		field1250 = 0;
		field1251 = 0;
		byte var11 = 0;
		int var17 = var11 + 1;
		int var12 = arg3[var11];
		for (int var13 = 0; var13 < var6.size; var13++) {
			int var14 = var6.ti[var13];
			while (var14 > var12) {
				var12 = arg3[var17++];
			}
			if (var12 == var14 || var7.types[var14] == 0) {
				this.method369(var7.types[var14], var7.labels[var14], var6.tx[var13], var6.ty[var13], var6.tz[var13]);
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.a(I[IIII)V")
	public void method369(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field1249 = 0;
			field1250 = 0;
			field1251 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.field1225.length) {
					int[] var10 = this.field1225[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field1249 += this.field1196[var12];
						field1250 += this.field1197[var12];
						field1251 += this.field1198[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				field1249 = field1249 / var7 + arg2;
				field1250 = field1250 / var7 + arg3;
				field1251 = field1251 / var7 + arg4;
			} else {
				field1249 = arg2;
				field1250 = arg3;
				field1251 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.field1225.length) {
					int[] var15 = this.field1225[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.field1196[var17] += arg2;
						this.field1197[var17] += arg3;
						this.field1198[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.field1225.length) {
					int[] var20 = this.field1225[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.field1196[var22] -= field1249;
						this.field1197[var22] -= field1250;
						this.field1198[var22] -= field1251;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sinTable[var25];
							int var27 = cosTable[var25];
							int var28 = this.field1197[var22] * var26 + this.field1196[var22] * var27 >> 16;
							this.field1197[var22] = this.field1197[var22] * var27 - this.field1196[var22] * var26 >> 16;
							this.field1196[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = sinTable[var23];
							int var30 = cosTable[var23];
							int var31 = this.field1197[var22] * var30 - this.field1198[var22] * var29 >> 16;
							this.field1198[var22] = this.field1198[var22] * var30 + this.field1197[var22] * var29 >> 16;
							this.field1197[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = sinTable[var24];
							int var33 = cosTable[var24];
							int var34 = this.field1198[var22] * var32 + this.field1196[var22] * var33 >> 16;
							this.field1198[var22] = this.field1198[var22] * var33 - this.field1196[var22] * var32 >> 16;
							this.field1196[var22] = var34;
						}
						this.field1196[var22] += field1249;
						this.field1197[var22] += field1250;
						this.field1198[var22] += field1251;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.field1225.length) {
					int[] var37 = this.field1225[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.field1196[var39] -= field1249;
						this.field1197[var39] -= field1250;
						this.field1198[var39] -= field1251;
						this.field1196[var39] = this.field1196[var39] * arg2 / 128;
						this.field1197[var39] = this.field1197[var39] * arg3 / 128;
						this.field1198[var39] = this.field1198[var39] * arg4 / 128;
						this.field1196[var39] += field1249;
						this.field1197[var39] += field1250;
						this.field1198[var39] += field1251;
					}
				}
			}
		} else if (arg0 == 5 && (this.field1226 != null && this.field1208 != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.field1226.length) {
					int[] var42 = this.field1226[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						this.field1208[var44] += arg2 * 8;
						if (this.field1208[var44] < 0) {
							this.field1208[var44] = 0;
						}
						if (this.field1208[var44] > 255) {
							this.field1208[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.b(Z)V")
	public void method370(boolean arg0) {
		if (!arg0) {
			return;
		}
		for (int var2 = 0; var2 < this.field1195; var2++) {
			int var3 = this.field1196[var2];
			this.field1196[var2] = this.field1198[var2];
			this.field1198[var2] = -var3;
		}
	}

	@ObfuscatedName("LZYQDKJV.b(II)V")
	public void method371(int arg0) {
		int var3 = sinTable[arg0];
		int var4 = cosTable[arg0];
		for (int var5 = 0; var5 < this.field1195; var5++) {
			int var7 = this.field1197[var5] * var4 - this.field1198[var5] * var3 >> 16;
			this.field1198[var5] = this.field1198[var5] * var4 + this.field1197[var5] * var3 >> 16;
			this.field1197[var5] = var7;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIZI)V")
	public void method372(int arg0, int arg1, int arg3) {
		for (int var5 = 0; var5 < this.field1195; var5++) {
			this.field1196[var5] += arg0;
			this.field1197[var5] += arg3;
			this.field1198[var5] += arg1;
		}
	}

	@ObfuscatedName("LZYQDKJV.c(II)V")
	public void method373(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field1199; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.g(I)V")
	public void method374() {
		for (int var3 = 0; var3 < this.field1195; var3++) {
			this.field1198[var3] = -this.field1198[var3];
		}
		for (int var4 = 0; var4 < this.field1199; var4++) {
			int var5 = this.field1200[var4];
			this.field1200[var4] = this.field1202[var4];
			this.field1202[var4] = var5;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIII)V")
	public void method375(int arg0, int arg1, int arg3) {
		for (int var5 = 0; var5 < this.field1195; var5++) {
			this.field1196[var5] = this.field1196[var5] * arg3 / 128;
			this.field1197[var5] = this.field1197[var5] * arg0 / 128;
			this.field1198[var5] = this.field1198[var5] * arg1 / 128;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIZ)V")
	public void calculateNormals(int ambient, int contrast, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
		int var8 = contrast * var7 >> 8;
		if (this.field1203 == null) {
			this.field1203 = new int[this.field1199];
			this.field1204 = new int[this.field1199];
			this.field1205 = new int[this.field1199];
		}
		if (super.field1708 == null) {
			super.field1708 = new VertexNormal[this.field1195];
			for (int var9 = 0; var9 < this.field1195; var9++) {
				super.field1708[var9] = new VertexNormal();
			}
		}
		for (int var10 = 0; var10 < this.field1199; var10++) {
			int var14 = this.field1200[var10];
			int var15 = this.field1201[var10];
			int var16 = this.field1202[var10];
			int var17 = this.field1196[var15] - this.field1196[var14];
			int var18 = this.field1197[var15] - this.field1197[var14];
			int var19 = this.field1198[var15] - this.field1198[var14];
			int var20 = this.field1196[var16] - this.field1196[var14];
			int var21 = this.field1197[var16] - this.field1197[var14];
			int var22 = this.field1198[var16] - this.field1198[var14];
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
			if (this.field1206 == null || (this.field1206[var10] & 0x1) == 0) {
				VertexNormal var31 = super.field1708[var14];
				var31.field1496 += var27;
				var31.field1497 += var28;
				var31.field1498 += var29;
				var31.field1499++;
				VertexNormal var32 = super.field1708[var15];
				var32.field1496 += var27;
				var32.field1497 += var28;
				var32.field1498 += var29;
				var32.field1499++;
				VertexNormal var33 = super.field1708[var16];
				var33.field1496 += var27;
				var33.field1497 += var28;
				var33.field1498 += var29;
				var33.field1499++;
			} else {
				int var30 = (arg4 * var29 + arg2 * var27 + arg3 * var28) / (var8 / 2 + var8) + ambient;
				this.field1203[var10] = method379(this.faceColour[var10], var30, this.field1206[var10]);
			}
		}
		if (arg5) {
			this.method378(ambient, var8, arg2, arg3, arg4);
		} else {
			this.field1228 = new VertexNormal[this.field1195];
			for (int var11 = 0; var11 < this.field1195; var11++) {
				VertexNormal var12 = super.field1708[var11];
				VertexNormal var13 = this.field1228[var11] = new VertexNormal();
				var13.field1496 = var12.field1496;
				var13.field1497 = var12.field1497;
				var13.field1498 = var12.field1498;
				var13.field1499 = var12.field1499;
			}
			this.field1215 = (ambient << 16) + (var8 & 0xFFFF);
		}
		if (arg5) {
			this.method363();
		} else {
			this.method365();
		}
	}

	@ObfuscatedName("LZYQDKJV.b(IIII)V")
	public void method377(int arg0, int arg1, int arg3) {
		int var5 = this.field1215 >> 16;
		int var6 = this.field1215 << 16 >> 16;
		this.method378(var5, var6, arg3, arg0, arg1);
	}

	@ObfuscatedName("LZYQDKJV.a(IIIII)V")
	public void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.field1199; var6++) {
			int var8 = this.field1200[var6];
			int var9 = this.field1201[var6];
			int var10 = this.field1202[var6];
			if (this.field1206 == null) {
				int var11 = this.faceColour[var6];
				VertexNormal var12 = super.field1708[var8];
				int var13 = (var12.field1498 * arg4 + var12.field1497 * arg3 + var12.field1496 * arg2) / (var12.field1499 * arg1) + arg0;
				this.field1203[var6] = method379(var11, var13, 0);
				VertexNormal var14 = super.field1708[var9];
				int var15 = (var14.field1498 * arg4 + var14.field1497 * arg3 + var14.field1496 * arg2) / (var14.field1499 * arg1) + arg0;
				this.field1204[var6] = method379(var11, var15, 0);
				VertexNormal var16 = super.field1708[var10];
				int var17 = (var16.field1498 * arg4 + var16.field1497 * arg3 + var16.field1496 * arg2) / (var16.field1499 * arg1) + arg0;
				this.field1205[var6] = method379(var11, var17, 0);
			} else if ((this.field1206[var6] & 0x1) == 0) {
				int var18 = this.faceColour[var6];
				int var19 = this.field1206[var6];
				VertexNormal var20 = super.field1708[var8];
				int var21 = (var20.field1498 * arg4 + var20.field1497 * arg3 + var20.field1496 * arg2) / (var20.field1499 * arg1) + arg0;
				this.field1203[var6] = method379(var18, var21, var19);
				VertexNormal var22 = super.field1708[var9];
				int var23 = (var22.field1498 * arg4 + var22.field1497 * arg3 + var22.field1496 * arg2) / (var22.field1499 * arg1) + arg0;
				this.field1204[var6] = method379(var18, var23, var19);
				VertexNormal var24 = super.field1708[var10];
				int var25 = (var24.field1498 * arg4 + var24.field1497 * arg3 + var24.field1496 * arg2) / (var24.field1499 * arg1) + arg0;
				this.field1205[var6] = method379(var18, var25, var19);
			}
		}
		super.field1708 = null;
		this.field1228 = null;
		this.field1223 = null;
		this.field1224 = null;
		if (this.field1206 != null) {
			for (int var7 = 0; var7 < this.field1199; var7++) {
				if ((this.field1206[var7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.faceColour = null;
	}

	@ObfuscatedName("LZYQDKJV.a(III)I")
	public static final int method379(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("LZYQDKJV.a(IIIIIII)V")
	public void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.centerX;
		int var9 = Pix3D.centerY;
		int var10 = sinTable[arg0];
		int var11 = cosTable[arg0];
		int var12 = sinTable[arg1];
		int var13 = cosTable[arg1];
		int var14 = sinTable[arg2];
		int var15 = cosTable[arg2];
		int var16 = sinTable[arg3];
		int var17 = cosTable[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < this.field1195; var19++) {
			int var20 = this.field1196[var19];
			int var21 = this.field1197[var19];
			int var22 = this.field1198[var19];
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
			field1235[var19] = var30 - var18;
			field1233[var19] = (var26 << 9) / var30 + var8;
			field1234[var19] = (var29 << 9) / var30 + var9;
			if (this.field1211 > 0) {
				field1236[var19] = var26;
				field1237[var19] = var29;
				field1238[var19] = var30;
			}
		}
		try {
			this.method382(false, false, 0);
		} catch (Exception var32) {
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIIIII)V")
	public void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = this.field1218 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
		int var15 = var14 - this.field1218 << 9;
		if (var15 / var13 >= Pix2D.centerX2d) {
			return;
		}
		int var16 = this.field1218 + var14 << 9;
		if (var16 / var13 <= -Pix2D.centerX2d) {
			return;
		}
		int var17 = arg2 * arg6 - arg1 * var10 >> 16;
		int var18 = this.field1218 * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= -Pix2D.centerY2d) {
			return;
		}
		int var20 = (super.field1709 * arg2 >> 16) + var18;
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix2D.centerY2d) {
			return;
		}
		int var22 = (super.field1709 * arg1 >> 16) + var12;
		boolean var23 = false;
		if (var11 - var22 <= 50) {
			var23 = true;
		}
		boolean var24 = false;
		if (arg8 > 0 && checkHover) {
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
			int var30 = mouseX - Pix3D.centerX;
			int var31 = mouseY - Pix3D.centerY;
			if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
				if (this.field1227) {
					field1256[pickedCount++] = arg8;
				} else {
					var24 = true;
				}
			}
		}
		int var32 = Pix3D.centerX;
		int var33 = Pix3D.centerY;
		int var34 = 0;
		int var35 = 0;
		if (arg0 != 0) {
			var34 = sinTable[arg0];
			var35 = cosTable[arg0];
		}
		for (int var36 = 0; var36 < this.field1195; var36++) {
			int var37 = this.field1196[var36];
			int var38 = this.field1197[var36];
			int var39 = this.field1198[var36];
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
			field1235[var36] = var48 - var11;
			if (var48 >= 50) {
				field1233[var36] = (var44 << 9) / var48 + var32;
				field1234[var36] = (var47 << 9) / var48 + var33;
			} else {
				field1233[var36] = -5000;
				var23 = true;
			}
			if (var23 || this.field1211 > 0) {
				field1236[var36] = var44;
				field1237[var36] = var47;
				field1238[var36] = var48;
			}
		}
		try {
			this.method382(var23, var24, arg8);
		} catch (Exception var50) {
		}
	}

	@ObfuscatedName("LZYQDKJV.a(ZZI)V")
	public void method382(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < this.field1220; var4++) {
			field1239[var4] = 0;
		}
		for (int var5 = 0; var5 < this.field1199; var5++) {
			if (this.field1206 == null || this.field1206[var5] != -1) {
				int var30 = this.field1200[var5];
				int var31 = this.field1201[var5];
				int var32 = this.field1202[var5];
				int var33 = field1233[var30];
				int var34 = field1233[var31];
				int var35 = field1233[var32];
				if (arg0 && (var33 == -5000 || var34 == -5000 || var35 == -5000)) {
					field1232[var5] = true;
					int var36 = (field1235[var30] + field1235[var31] + field1235[var32]) / 3 + this.field1221;
					field1240[var36][field1239[var36]++] = var5;
				} else {
					if (arg1 && this.method385(mouseX, mouseY, field1234[var30], field1234[var31], field1234[var32], var33, var34, var35)) {
						field1256[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((field1234[var32] - field1234[var31]) * (var33 - var34) - (field1234[var30] - field1234[var31]) * (var35 - var34) > 0) {
						field1232[var5] = false;
						if (var33 >= 0 && var34 >= 0 && var35 >= 0 && var33 <= Pix2D.safeWidth && var34 <= Pix2D.safeWidth && var35 <= Pix2D.safeWidth) {
							field1231[var5] = false;
						} else {
							field1231[var5] = true;
						}
						int var37 = (field1235[var30] + field1235[var31] + field1235[var32]) / 3 + this.field1221;
						field1240[var37][field1239[var37]++] = var5;
					}
				}
			}
		}
		if (this.field1207 == null) {
			for (int var6 = this.field1220 - 1; var6 >= 0; var6--) {
				int var7 = field1239[var6];
				if (var7 > 0) {
					int[] var8 = field1240[var6];
					for (int var9 = 0; var9 < var7; var9++) {
						this.method383(var8[var9]);
					}
				}
			}
			return;
		}
		for (int var10 = 0; var10 < 12; var10++) {
			field1241[var10] = 0;
			field1245[var10] = 0;
		}
		for (int var11 = this.field1220 - 1; var11 >= 0; var11--) {
			int var24 = field1239[var11];
			if (var24 > 0) {
				int[] var25 = field1240[var11];
				for (int var26 = 0; var26 < var24; var26++) {
					int var27 = var25[var26];
					int var28 = this.field1207[var27];
					int var29 = field1241[var28]++;
					field1242[var28][var29] = var27;
					if (var28 < 10) {
						field1245[var28] += var11;
					} else if (var28 == 10) {
						field1243[var29] = var11;
					} else {
						field1244[var29] = var11;
					}
				}
			}
		}
		int var12 = 0;
		if (field1241[1] > 0 || field1241[2] > 0) {
			var12 = (field1245[1] + field1245[2]) / (field1241[1] + field1241[2]);
		}
		int var13 = 0;
		if (field1241[3] > 0 || field1241[4] > 0) {
			var13 = (field1245[3] + field1245[4]) / (field1241[3] + field1241[4]);
		}
		int var14 = 0;
		if (field1241[6] > 0 || field1241[8] > 0) {
			var14 = (field1245[6] + field1245[8]) / (field1241[6] + field1241[8]);
		}
		int var15 = 0;
		int var16 = field1241[10];
		int[] var17 = field1242[10];
		int[] var18 = field1243;
		if (var15 == var16) {
			var15 = 0;
			var16 = field1241[11];
			var17 = field1242[11];
			var18 = field1244;
		}
		int var19;
		if (var15 < var16) {
			var19 = var18[var15];
		} else {
			var19 = -1000;
		}
		for (int var20 = 0; var20 < 10; var20++) {
			while (var20 == 0 && var19 > var12) {
				this.method383(var17[var15++]);
				if (var15 == var16 && field1242[11] != var17) {
					var15 = 0;
					var16 = field1241[11];
					var17 = field1242[11];
					var18 = field1244;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 3 && var19 > var13) {
				this.method383(var17[var15++]);
				if (var15 == var16 && field1242[11] != var17) {
					var15 = 0;
					var16 = field1241[11];
					var17 = field1242[11];
					var18 = field1244;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			while (var20 == 5 && var19 > var14) {
				this.method383(var17[var15++]);
				if (var15 == var16 && field1242[11] != var17) {
					var15 = 0;
					var16 = field1241[11];
					var17 = field1242[11];
					var18 = field1244;
				}
				if (var15 < var16) {
					var19 = var18[var15];
				} else {
					var19 = -1000;
				}
			}
			int var21 = field1241[var20];
			int[] var22 = field1242[var20];
			for (int var23 = 0; var23 < var21; var23++) {
				this.method383(var22[var23]);
			}
		}
		while (var19 != -1000) {
			this.method383(var17[var15++]);
			if (var15 == var16 && field1242[11] != var17) {
				var15 = 0;
				var17 = field1242[11];
				var16 = field1241[11];
				var18 = field1244;
			}
			if (var15 < var16) {
				var19 = var18[var15];
			} else {
				var19 = -1000;
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.h(I)V")
	public void method383(int arg0) {
		if (field1232[arg0]) {
			this.method384(arg0);
			return;
		}
		int var2 = this.field1200[arg0];
		int var3 = this.field1201[arg0];
		int var4 = this.field1202[arg0];
		Pix3D.hclip = field1231[arg0];
		if (this.field1208 == null) {
			Pix3D.field1593 = 0;
		} else {
			Pix3D.field1593 = this.field1208[arg0];
		}
		int var5;
		if (this.field1206 == null) {
			var5 = 0;
		} else {
			var5 = this.field1206[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.gouraudTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1204[arg0], this.field1205[arg0]);
		} else if (var5 == 1) {
			Pix3D.flatTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], field1259[this.field1203[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.field1206[arg0] >> 2;
			int var7 = this.field1212[var6];
			int var8 = this.field1213[var6];
			int var9 = this.field1214[var6];
			Pix3D.textureTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1204[arg0], this.field1205[arg0], field1236[var7], field1236[var8], field1236[var9], field1237[var7], field1237[var8], field1237[var9], field1238[var7], field1238[var8], field1238[var9], this.faceColour[arg0]);
		} else if (var5 == 3) {
			int var10 = this.field1206[arg0] >> 2;
			int var11 = this.field1212[var10];
			int var12 = this.field1213[var10];
			int var13 = this.field1214[var10];
			Pix3D.textureTriangle(field1234[var2], field1234[var3], field1234[var4], field1233[var2], field1233[var3], field1233[var4], this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var11], field1236[var12], field1236[var13], field1237[var11], field1237[var12], field1237[var13], field1238[var11], field1238[var12], field1238[var13], this.faceColour[arg0]);
		}
	}

	@ObfuscatedName("LZYQDKJV.i(I)V")
	public void method384(int arg0) {
		int var2 = Pix3D.centerX;
		int var3 = Pix3D.centerY;
		int var4 = 0;
		int var5 = this.field1200[arg0];
		int var6 = this.field1201[arg0];
		int var7 = this.field1202[arg0];
		int var8 = field1238[var5];
		int var9 = field1238[var6];
		int var10 = field1238[var7];
		if (var8 >= 50) {
			field1246[var4] = field1233[var5];
			field1247[var4] = field1234[var5];
			field1248[var4++] = this.field1203[arg0];
		} else {
			int var11 = field1236[var5];
			int var12 = field1237[var5];
			int var13 = this.field1203[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field1260[var10 - var8];
				field1246[var4] = (((field1236[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1205[arg0] - var13) * var14 >> 16) + var13;
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field1260[var9 - var8];
				field1246[var4] = (((field1236[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1204[arg0] - var13) * var15 >> 16) + var13;
			}
		}
		if (var9 >= 50) {
			field1246[var4] = field1233[var6];
			field1247[var4] = field1234[var6];
			field1248[var4++] = this.field1204[arg0];
		} else {
			int var16 = field1236[var6];
			int var17 = field1237[var6];
			int var18 = this.field1204[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field1260[var8 - var9];
				field1246[var4] = (((field1236[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1203[arg0] - var18) * var19 >> 16) + var18;
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field1260[var10 - var9];
				field1246[var4] = (((field1236[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1205[arg0] - var18) * var20 >> 16) + var18;
			}
		}
		if (var10 >= 50) {
			field1246[var4] = field1233[var7];
			field1247[var4] = field1234[var7];
			field1248[var4++] = this.field1205[arg0];
		} else {
			int var21 = field1236[var7];
			int var22 = field1237[var7];
			int var23 = this.field1205[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field1260[var9 - var10];
				field1246[var4] = (((field1236[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1204[arg0] - var23) * var24 >> 16) + var23;
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field1260[var8 - var10];
				field1246[var4] = (((field1236[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				field1247[var4] = (((field1237[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				field1248[var4++] = ((this.field1203[arg0] - var23) * var25 >> 16) + var23;
			}
		}
		int var26 = field1246[0];
		int var27 = field1246[1];
		int var28 = field1246[2];
		int var29 = field1247[0];
		int var30 = field1247[1];
		int var31 = field1247[2];
		if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.safeWidth || var27 > Pix2D.safeWidth || var28 > Pix2D.safeWidth) {
				Pix3D.hclip = true;
			}
			int var32;
			if (this.field1206 == null) {
				var32 = 0;
			} else {
				var32 = this.field1206[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2]);
			} else if (var32 == 1) {
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, field1259[this.field1203[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.field1206[arg0] >> 2;
				int var34 = this.field1212[var33];
				int var35 = this.field1213[var33];
				int var36 = this.field1214[var33];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2], field1236[var34], field1236[var35], field1236[var36], field1237[var34], field1237[var35], field1237[var36], field1238[var34], field1238[var35], field1238[var36], this.faceColour[arg0]);
			} else if (var32 == 3) {
				int var37 = this.field1206[arg0] >> 2;
				int var38 = this.field1212[var37];
				int var39 = this.field1213[var37];
				int var40 = this.field1214[var37];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var38], field1236[var39], field1236[var40], field1237[var38], field1237[var39], field1237[var40], field1238[var38], field1238[var39], field1238[var40], this.faceColour[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.safeWidth || var27 > Pix2D.safeWidth || var28 > Pix2D.safeWidth || field1246[3] < 0 || field1246[3] > Pix2D.safeWidth) {
			Pix3D.hclip = true;
		}
		int var41;
		if (this.field1206 == null) {
			var41 = 0;
		} else {
			var41 = this.field1206[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2]);
			Pix3D.gouraudTriangle(var29, var31, field1247[3], var26, var28, field1246[3], field1248[0], field1248[2], field1248[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = field1259[this.field1203[arg0]];
			Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.flatTriangle(var29, var31, field1247[3], var26, var28, field1246[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.field1206[arg0] >> 2;
			int var44 = this.field1212[var43];
			int var45 = this.field1213[var43];
			int var46 = this.field1214[var43];
			Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, field1248[0], field1248[1], field1248[2], field1236[var44], field1236[var45], field1236[var46], field1237[var44], field1237[var45], field1237[var46], field1238[var44], field1238[var45], field1238[var46], this.faceColour[arg0]);
			Pix3D.textureTriangle(var29, var31, field1247[3], var26, var28, field1246[3], field1248[0], field1248[2], field1248[3], field1236[var44], field1236[var45], field1236[var46], field1237[var44], field1237[var45], field1237[var46], field1238[var44], field1238[var45], field1238[var46], this.faceColour[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.field1206[arg0] >> 2;
		int var48 = this.field1212[var47];
		int var49 = this.field1213[var47];
		int var50 = this.field1214[var47];
		Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var48], field1236[var49], field1236[var50], field1237[var48], field1237[var49], field1237[var50], field1238[var48], field1238[var49], field1238[var50], this.faceColour[arg0]);
		Pix3D.textureTriangle(var29, var31, field1247[3], var26, var28, field1246[3], this.field1203[arg0], this.field1203[arg0], this.field1203[arg0], field1236[var48], field1236[var49], field1236[var50], field1237[var48], field1237[var49], field1237[var50], field1238[var48], field1238[var49], field1238[var50], this.faceColour[arg0]);
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIIII)Z")
	public boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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
