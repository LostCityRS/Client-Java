package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSource;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("hd")
public final class LocType extends Linkable2 {

	@ObfuscatedName("ve.c")
	public static Js5 field3454;
	@ObfuscatedName("fa.D")
	public static boolean field888 = false;
	@ObfuscatedName("ra.c")
	public static Js5 field2840;
	@ObfuscatedName("ga.ab")
	public static LruCache field1014 = new LruCache(64);
	@ObfuscatedName("qd.Cb")
	public static LruCache mc1 = new LruCache(500);
	@ObfuscatedName("ed.j")
	public static LruCache field689 = new LruCache(30);
	@ObfuscatedName("te.m")
	public static LruCache field3185 = new LruCache(30);
	@ObfuscatedName("te.n")
	public static ModelUnlit[] field3186 = new ModelUnlit[4];
	@ObfuscatedName("hd.ab")
	public int field1209 = -1;

	@ObfuscatedName("hd.ac")
	public short[] field1261;

	@ObfuscatedName("hd.bb")
	public boolean field1210 = false;

	@ObfuscatedName("hd.bc")
	public int field1262 = 128;

	@ObfuscatedName("hd.cb")
	public short[] field1211;

	@ObfuscatedName("qd.hb")
	public static JagString field2699 = JagString.wrap("null");
	@ObfuscatedName("hd.eb")
	public JagString field1213 = field2699;

	@ObfuscatedName("hd.hb")
	public int field1216 = 128;

	@ObfuscatedName("hd.jb")
	public int[] field1218;

	@ObfuscatedName("hd.kb")
	public boolean field1219 = true;

	@ObfuscatedName("hd.mb")
	public int field1221;

	@ObfuscatedName("hd.nb")
	public int field1222 = 1;

	@ObfuscatedName("hd.ob")
	public int field1223 = 0;

	@ObfuscatedName("hd.qb")
	public int field1225 = -1;

	@ObfuscatedName("hd.rb")
	public int field1226 = -1;

	@ObfuscatedName("hd.wb")
	public int field1231 = 0;

	@ObfuscatedName("hd.V")
	public boolean field1204 = false;

	@ObfuscatedName("hd.J")
	public int field1193 = -1;

	@ObfuscatedName("hd.Ab")
	public int field1235 = 2;

	@ObfuscatedName("hd.I")
	public int field1192 = 0;

	@ObfuscatedName("hd.Db")
	public int field1238 = 128;

	@ObfuscatedName("hd.Bb")
	public int field1236 = -1;

	@ObfuscatedName("hd.yb")
	public int field1233 = 1;

	@ObfuscatedName("hd.Kb")
	public int field1245 = 16;

	@ObfuscatedName("hd.Fb")
	public int field1240 = 0;

	@ObfuscatedName("hd.W")
	public int field1205 = 0;

	@ObfuscatedName("hd.Rb")
	public int field1252 = -1;

	@ObfuscatedName("hd.Lb")
	public int field1246 = -1;

	@ObfuscatedName("hd.xb")
	public int field1232 = 0;

	@ObfuscatedName("hd.Pb")
	public int field1250 = 0;

	@ObfuscatedName("hd.K")
	public boolean field1194 = false;

	@ObfuscatedName("hd.Tb")
	public int field1254 = -1;

	@ObfuscatedName("hd.Ub")
	public final JagString[] field1255 = new JagString[5];

	@ObfuscatedName("hd.Sb")
	public boolean field1253 = true;

	@ObfuscatedName("hd.O")
	public boolean field1198 = false;

	@ObfuscatedName("hd.Vb")
	public int field1256 = -1;

	@ObfuscatedName("hd.Wb")
	public boolean field1257 = false;

	@ObfuscatedName("hd.Yb")
	public int field1259 = 0;

	@ObfuscatedName("hd.Hb")
	public int field1242 = 0;

	@ObfuscatedName("hd.P")
	public int[] field1199;

	@ObfuscatedName("hd.Ib")
	public int[] field1243;

	@ObfuscatedName("hd.Qb")
	public int[] field1251;

	@ObfuscatedName("hd.N")
	public short[] field1197;

	@ObfuscatedName("hd.U")
	public short[] field1203;

	@ObfuscatedName("ad.a(II)Lhd;")
	public static LocType list(int arg0) {
		LocType var1 = (LocType) field1014.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3454.method206(6, arg0);
		LocType var3 = new LocType();
		var3.field1221 = arg0;
		if (var2 != null) {
			var3.method419(new Packet(var2));
		}
		var3.method424();
		if (var3.field1198) {
			var3.field1219 = false;
			var3.field1235 = 0;
		}
		field1014.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ke.a(Lea;IZLea;)V")
	public static void init(Js5 arg0, boolean arg1, Js5 arg2) {
		field3454 = arg2;
		field888 = arg1;
		field2840 = arg0;
	}

	@ObfuscatedName("ge.v(I)V")
	public static void method357() {
		field1014.clear();
		mc1.clear();
		field689.clear();
		field3185.clear();
	}

	@ObfuscatedName("hd.a(B)Z")
	public boolean method411() {
		if (this.field1251 == null) {
			return this.field1256 != -1 || this.field1218 != null;
		}
		for (int var1 = 0; var1 < this.field1251.length; var1++) {
			if (this.field1251[var1] != -1) {
				LocType var2 = list(this.field1251[var1]);
				if (var2.field1256 != -1 || var2.field1218 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("hd.a(IIII[[III)Lod;")
	public ModelLit method412(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
		long var7;
		if (this.field1199 == null) {
			var7 = arg4 + (this.field1221 << 10);
		} else {
			var7 = arg4 + (arg1 << 3) + (this.field1221 << 10);
		}
		ModelLit var9 = (ModelLit) field3185.find(var7);
		if (var9 == null) {
			ModelUnlit var10 = this.method413(arg4, arg1);
			if (var10 == null) {
				return null;
			}
			var9 = var10.method847(this.field1231 + 64, this.field1242 * 5 + 768, -50, -10, -50);
			field3185.put(var7, var9);
		}
		if (this.field1246 >= 0) {
			var9 = var9.method808(arg3, arg0, arg5, arg2, true, this.field1246);
		}
		return var9;
	}

	@ObfuscatedName("hd.a(IZI)Lp;")
	public ModelUnlit method413(int arg0, int arg1) {
		ModelUnlit var3 = null;
		if (this.field1199 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.field1243 == null) {
				return null;
			}
			boolean var8 = this.field1257;
			if (arg1 == 2 && arg0 > 3) {
				var8 = !var8;
			}
			int var9 = this.field1243.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = this.field1243[var10];
				if (var8) {
					var11 += 65536;
				}
				var3 = (ModelUnlit) mc1.find((long) var11);
				if (var3 == null) {
					var3 = ModelUnlit.method840(field2840, var11 & 0xFFFF);
					if (var3 == null) {
						return null;
					}
					if (var8) {
						var3.method844();
					}
					mc1.put((long) var11, var3);
				}
				if (var9 > 1) {
					field3186[var10] = var3;
				}
			}
			if (var9 > 1) {
				var3 = new ModelUnlit(field3186, var9);
			}
		} else {
			int var4 = -1;
			for (int var5 = 0; var5 < this.field1199.length; var5++) {
				if (this.field1199[var5] == arg1) {
					var4 = var5;
					break;
				}
			}
			if (var4 == -1) {
				return null;
			}
			int var6 = this.field1243[var4];
			boolean var7 = arg0 > 3 ^ this.field1257;
			if (var7) {
				var6 += 65536;
			}
			var3 = (ModelUnlit) mc1.find((long) var6);
			if (var3 == null) {
				var3 = ModelUnlit.method840(field2840, var6 & 0xFFFF);
				if (var3 == null) {
					return null;
				}
				if (var7) {
					var3.method844();
				}
				mc1.put((long) var6, var3);
			}
		}
		boolean var12;
		if (this.field1216 == 128 && this.field1238 == 128 && this.field1262 == 128) {
			var12 = false;
		} else {
			var12 = true;
		}
		boolean var13;
		if (this.field1205 == 0 && this.field1223 == 0 && this.field1232 == 0) {
			var13 = false;
		} else {
			var13 = true;
		}
		ModelUnlit var14 = new ModelUnlit(var3, arg0 == 0 && !var12 && !var13, this.field1203 == null, this.field1211 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			var14.method851();
			var14.method834(45, 0, -45);
		}
		int var15 = arg0 & 0x3;
		if (var15 == 1) {
			var14.method837();
		} else if (var15 == 2) {
			var14.method842();
		} else if (var15 == 3) {
			var14.method838();
		}
		if (this.field1203 != null) {
			for (int var16 = 0; var16 < this.field1203.length; var16++) {
				var14.method833(this.field1203[var16], this.field1261[var16]);
			}
		}
		if (this.field1211 != null) {
			for (int var17 = 0; var17 < this.field1211.length; var17++) {
				var14.method853(this.field1211[var17], this.field1197[var17]);
			}
		}
		if (var12) {
			var14.method855(this.field1216, this.field1238, this.field1262);
		}
		if (var13) {
			var14.method834(this.field1205, this.field1223, this.field1232);
		}
		return var14;
	}

	@ObfuscatedName("hd.e(I)Z")
	public boolean method414() {
		if (this.field1243 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1243.length; var2++) {
			var1 &= field2840.method213(this.field1243[var2] & 0xFFFF, 0);
		}
		return var1;
	}

	@ObfuscatedName("hd.a(ZLvc;II[[IIIII)Lod;")
	public ModelLit method415(SeqType arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6, int arg7) {
		long var9;
		if (this.field1199 == null) {
			var9 = (this.field1221 << 10) + arg7;
		} else {
			var9 = (arg2 << 3) + (this.field1221 << 10) + arg7;
		}
		ModelLit var11 = (ModelLit) field3185.find(var9);
		if (var11 == null) {
			ModelUnlit var12 = this.method413(arg7, arg2);
			if (var12 == null) {
				return null;
			}
			var11 = var12.method847(this.field1231 + 64, this.field1242 * 5 + 768, -50, -10, -50);
			field3185.put(var9, var11);
		}
		if (arg0 == null && this.field1246 == -1) {
			return var11;
		}
		ModelLit var13;
		if (arg0 == null) {
			var13 = var11.method799(true);
		} else {
			var13 = arg0.method1109(arg7, arg5, var11);
		}
		if (this.field1246 >= 0) {
			var13 = var13.method808(arg3, arg4, arg6, arg1, false, this.field1246);
		}
		return var13;
	}

	@ObfuscatedName("hd.a(BLjd;I)V")
	public void method416(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			if (var3 > 0) {
				if (this.field1243 != null && !field888) {
					arg0.pos += var3 * 3;
					return;
				}
				this.field1243 = new int[var3];
				this.field1199 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					this.field1243[var4] = arg0.g2();
					this.field1199[var4] = arg0.g1();
				}
				return;
			}
		} else if (arg1 == 2) {
			this.field1213 = arg0.method555();
		} else if (arg1 == 5) {
			int var13 = arg0.g1();
			if (var13 > 0) {
				if (this.field1243 != null && !field888) {
					arg0.pos += var13 * 2;
					return;
				}
				this.field1199 = null;
				this.field1243 = new int[var13];
				for (int var14 = 0; var14 < var13; var14++) {
					this.field1243[var14] = arg0.g2();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.field1222 = arg0.g1();
			return;
		} else if (arg1 == 15) {
			this.field1233 = arg0.g1();
			return;
		} else if (arg1 == 17) {
			this.field1219 = false;
			this.field1235 = 0;
			return;
		} else if (arg1 == 18) {
			this.field1219 = false;
			return;
		} else if (arg1 == 19) {
			this.field1193 = arg0.g1();
			return;
		} else if (arg1 == 21) {
			this.field1246 = 0;
			return;
		} else if (arg1 == 22) {
			this.field1194 = true;
			return;
		} else if (arg1 == 23) {
			this.field1210 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.field1225 = arg0.g2();
				if (this.field1225 == 65535) {
					this.field1225 = -1;
					return;
				}
			} else if (arg1 == 27) {
				this.field1235 = 1;
			} else if (arg1 == 28) {
				this.field1245 = arg0.g1();
				return;
			} else if (arg1 == 29) {
				this.field1231 = arg0.method544();
				return;
			} else if (arg1 == 39) {
				this.field1242 = arg0.method544() * 5;
				return;
			} else {
				if (arg1 >= 30 && arg1 < 35) {
					this.field1255[arg1 - 30] = arg0.method555();
					if (this.field1255[arg1 - 30].method271(Text.HIDDEN)) {
						this.field1255[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					int var11 = arg0.g1();
					this.field1203 = new short[var11];
					this.field1261 = new short[var11];
					for (int var12 = 0; var12 < var11; var12++) {
						this.field1203[var12] = (short) arg0.g2();
						this.field1261[var12] = (short) arg0.g2();
					}
				} else if (arg1 == 41) {
					int var5 = arg0.g1();
					this.field1197 = new short[var5];
					this.field1211 = new short[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.field1211[var6] = (short) arg0.g2();
						this.field1197[var6] = (short) arg0.g2();
					}
					return;
				} else if (arg1 == 60) {
					this.field1209 = arg0.g2();
					return;
				} else if (arg1 == 62) {
					this.field1257 = true;
					return;
				} else if (arg1 == 64) {
					this.field1253 = false;
					return;
				} else if (arg1 == 65) {
					this.field1216 = arg0.g2();
					return;
				} else if (arg1 == 66) {
					this.field1238 = arg0.g2();
					return;
				} else if (arg1 == 67) {
					this.field1262 = arg0.g2();
					return;
				} else if (arg1 == 68) {
					this.field1226 = arg0.g2();
					return;
				} else if (arg1 == 69) {
					this.field1192 = arg0.g1();
					return;
				} else if (arg1 == 70) {
					this.field1205 = arg0.method551();
					return;
				} else if (arg1 == 71) {
					this.field1223 = arg0.method551();
					return;
				} else if (arg1 == 72) {
					this.field1232 = arg0.method551();
					return;
				} else if (arg1 == 73) {
					this.field1204 = true;
					return;
				} else if (arg1 == 74) {
					this.field1198 = true;
					return;
				} else if (arg1 == 75) {
					this.field1252 = arg0.g1();
					return;
				} else if (arg1 == 77) {
					this.field1254 = arg0.g2();
					if (this.field1254 == 65535) {
						this.field1254 = -1;
					}
					this.field1236 = arg0.g2();
					if (this.field1236 == 65535) {
						this.field1236 = -1;
					}
					int var7 = arg0.g1();
					this.field1251 = new int[var7 + 1];
					for (int var8 = 0; var8 <= var7; var8++) {
						this.field1251[var8] = arg0.g2();
						if (this.field1251[var8] == 65535) {
							this.field1251[var8] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.field1256 = arg0.g2();
					this.field1240 = arg0.g1();
					return;
				} else {
					if (arg1 == 79) {
						this.field1259 = arg0.g2();
						this.field1250 = arg0.g2();
						this.field1240 = arg0.g1();
						int var9 = arg0.g1();
						this.field1218 = new int[var9];
						for (int var10 = 0; var10 < var9; var10++) {
							this.field1218[var10] = arg0.g2();
						}
					} else if (arg1 == 81) {
						this.field1246 = arg0.g1() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@ObfuscatedName("hd.a(Ljd;Z)V")
	public void method419(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method416(arg0, var2);
		}
	}

	@ObfuscatedName("hd.a(ZIII[[III)Ldd;")
	public ModelSource method421(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
		long var7;
		if (this.field1199 == null) {
			var7 = arg2 + (this.field1221 << 10);
		} else {
			var7 = (this.field1221 << 10) + (arg5 << 3) + arg2;
		}
		ModelSource var9 = (ModelSource) field689.find(var7);
		if (var9 == null) {
			ModelUnlit var10 = this.method413(arg2, arg5);
			if (var10 == null) {
				return null;
			}
			if (this.field1194) {
				var9 = var10;
				var10.field2457 = (short) (this.field1242 * 5 + 768);
				var10.field2446 = (short) (this.field1231 + 64);
				var10.method839();
			} else {
				var9 = var10.method847(this.field1231 + 64, this.field1242 * 5 + 768, -50, -10, -50);
			}
			field689.put(var7, var9);
		}
		if (this.field1194) {
			var9 = ((ModelUnlit) var9).method832();
		}
		if (this.field1246 >= 0) {
			if (var9 instanceof ModelLit) {
				var9 = ((ModelLit) var9).method808(arg3, arg4, arg1, arg0, true, this.field1246);
			} else if (var9 instanceof ModelUnlit) {
				var9 = ((ModelUnlit) var9).method836(arg3, arg4, arg1, arg0, this.field1246);
			}
		}
		return var9;
	}

	@ObfuscatedName("hd.d(B)Lhd;")
	public LocType method422() {
		int var1 = -1;
		if (this.field1254 != -1) {
			var1 = VarCache.getVarbit(this.field1254);
		} else if (this.field1236 != -1) {
			var1 = VarCache.field504[this.field1236];
		}
		return var1 < 0 || var1 >= this.field1251.length || this.field1251[var1] == -1 ? null : list(this.field1251[var1]);
	}

	@ObfuscatedName("hd.b(II)Z")
	public boolean checkModel(int arg0) {
		if (this.field1199 != null) {
			for (int var2 = 0; var2 < this.field1199.length; var2++) {
				if (this.field1199[var2] == arg0) {
					return field2840.method213(this.field1243[var2] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.field1243 == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var3 = true;
			for (int var4 = 0; var4 < this.field1243.length; var4++) {
				var3 &= field2840.method213(this.field1243[var4] & 0xFFFF, 0);
			}
			return var3;
		} else {
			return true;
		}
	}

	@ObfuscatedName("hd.f(I)V")
	public void method424() {
		if (this.field1193 == -1) {
			this.field1193 = 0;
			if (this.field1243 != null && (this.field1199 == null || this.field1199[0] == 10)) {
				this.field1193 = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.field1255[var1] != null) {
					this.field1193 = 1;
				}
			}
		}
		if (this.field1252 == -1) {
			this.field1252 = this.field1235 == 0 ? 0 : 1;
		}
	}
}
