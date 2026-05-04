package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelSourceCache;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.*;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;
import jagex3.var.VarCache;

@ObfuscatedName("lf")
public final class NpcType extends Linkable2 {

	@ObfuscatedName("vb.N")
	public static final LruCache field4331 = new LruCache(64);
	@ObfuscatedName("jh.c")
	public static final ModelSourceCache field1923 = new ModelSourceCache(50);
	@ObfuscatedName("mj.h")
	public static final ModelSourceCache field2606 = new ModelSourceCache(5);
	@ObfuscatedName("tb.m")
	public static Js5 field3968;
	@ObfuscatedName("pg.L")
	public static Js5 field3262;
	@ObfuscatedName("lf.ab")
	public byte[] field2335;

	@ObfuscatedName("lf.cb")
	public int field2337 = -1;

	@ObfuscatedName("lf.eb")
	public int field2339 = 32;

	@ObfuscatedName("lf.fb")
	public int field2340 = 128;

	@ObfuscatedName("lf.gb")
	public JagString field2341 = Statics.field34;

	@ObfuscatedName("lf.hb")
	public final JagString[] field2342 = new JagString[5];

	@ObfuscatedName("lf.ib")
	public int field2343 = -1;

	@ObfuscatedName("lf.jb")
	public HashTable field2344;

	@ObfuscatedName("lf.kb")
	public short[] field2345;

	@ObfuscatedName("lf.mb")
	public int field2347 = 128;

	@ObfuscatedName("lf.ob")
	public int field2349 = 1;

	@ObfuscatedName("lf.pb")
	public short field2350 = 0;

	@ObfuscatedName("lf.qb")
	public int field2351 = -1;

	@ObfuscatedName("lf.sb")
	public int field2353 = -1;

	@ObfuscatedName("lf.tb")
	public boolean field2354 = true;

	@ObfuscatedName("lf.ub")
	public short[] field2355;

	@ObfuscatedName("lf.wb")
	public boolean field2357 = true;

	@ObfuscatedName("lf.Q")
	public int field2326 = -1;

	@ObfuscatedName("lf.T")
	public short field2329 = 0;

	@ObfuscatedName("lf.J")
	public int field2319 = 0;

	@ObfuscatedName("lf.H")
	public int field2317 = -1;

	@ObfuscatedName("lf.W")
	public int field2331 = -1;

	@ObfuscatedName("lf.P")
	public int field2325 = -1;

	@ObfuscatedName("lf.M")
	public int field2322 = -1;

	@ObfuscatedName("lf.xb")
	public int field2358 = 0;

	@ObfuscatedName("lf.yb")
	public boolean field2359 = true;

	@ObfuscatedName("lf.zb")
	public int field2360 = -1;

	@ObfuscatedName("lf.Cb")
	public boolean field2363 = false;

	@ObfuscatedName("lf.Eb")
	public int field2365 = -1;

	@ObfuscatedName("lf.E")
	public int field2314;

	@ObfuscatedName("lf.R")
	public int[] field2327;

	@ObfuscatedName("lf.Ab")
	public int[] field2361;

	@ObfuscatedName("lf.Bb")
	public int[] field2362;

	@ObfuscatedName("lf.G")
	public short[] field2316;

	@ObfuscatedName("lf.Y")
	public short[] field2333;

	@ObfuscatedName("ne.a(II)Llf;")
	public static NpcType list(int arg0) {
		NpcType var1 = (NpcType) field4331.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3968.getFile(Statics.method387(arg0), Statics.method702(arg0));
		NpcType var3 = new NpcType();
		var3.field2314 = arg0;
		if (var2 != null) {
			var3.method853(new Packet(var2));
		}
		var3.method858();
		field4331.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ab.a(B)V")
	public static void resetCache() {
		field4331.clear();
		field1923.clear();
		field2606.clear();
	}

	@ObfuscatedName("eb.a(ILnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field3968 = arg0;
		field3262 = arg1;
	}

	@ObfuscatedName("je.b(I)V")
	public static void method711() {
		field1923.clear();
	}

	@ObfuscatedName("lf.b(Z)Z")
	public boolean method852() {
		if (this.field2327 == null) {
			return true;
		}
		int var1 = -1;
		if (this.field2353 != -1) {
			var1 = VarCache.method930(this.field2353);
		} else if (this.field2365 != -1) {
			var1 = VarCache.field2050[this.field2365];
		}
		if (var1 < 0 || var1 >= this.field2327.length - 1 || this.field2327[var1] == -1) {
			int var2 = this.field2327[this.field2327.length - 1];
			return var2 != -1;
		} else {
			return true;
		}
	}

	@ObfuscatedName("lf.a(Lea;I)V")
	public void method853(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method857(var2, arg0);
		}
	}

	@ObfuscatedName("lf.a(III)I")
	public int method854(int arg0, int arg1) {
		if (this.field2344 == null) {
			return arg0;
		} else {
			IntNode var3 = (IntNode) this.field2344.method1049((long) arg1);
			return var3 == null ? arg0 : var3.field3698;
		}
	}

	@ObfuscatedName("lf.a(IZLea;)V")
	public void method857(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			this.field2361 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2361[var4] = arg1.g2();
			}
		} else if (arg0 == 2) {
			this.field2341 = arg1.gjstr();
		} else if (arg0 == 12) {
			this.field2349 = arg1.g1();
		} else if (arg0 == 13) {
			this.field2325 = arg1.g2();
		} else if (arg0 == 14) {
			this.field2322 = arg1.g2();
		} else if (arg0 == 15) {
			this.field2317 = arg1.g2();
		} else if (arg0 == 16) {
			this.field2360 = arg1.g2();
		} else if (arg0 == 17) {
			this.field2322 = arg1.g2();
			this.field2343 = arg1.g2();
			this.field2351 = arg1.g2();
			this.field2337 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.field2342[arg0 - 30] = arg1.gjstr();
			if (this.field2342[arg0 - 30].method624(Text.field3693)) {
				this.field2342[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			int var20 = arg1.g1();
			this.field2316 = new short[var20];
			this.field2333 = new short[var20];
			for (int var21 = 0; var21 < var20; var21++) {
				this.field2333[var21] = (short) arg1.g2();
				this.field2316[var21] = (short) arg1.g2();
			}
		} else if (arg0 == 41) {
			int var18 = arg1.g1();
			this.field2345 = new short[var18];
			this.field2355 = new short[var18];
			for (int var19 = 0; var19 < var18; var19++) {
				this.field2355[var19] = (short) arg1.g2();
				this.field2345[var19] = (short) arg1.g2();
			}
		} else if (arg0 == 42) {
			int var5 = arg1.g1();
			this.field2335 = new byte[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2335[var6] = arg1.g1b();
			}
		} else if (arg0 == 60) {
			int var16 = arg1.g1();
			this.field2362 = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				this.field2362[var17] = arg1.g2();
			}
		} else if (arg0 == 93) {
			this.field2357 = false;
		} else if (arg0 == 95) {
			this.field2331 = arg1.g2();
		} else if (arg0 == 97) {
			this.field2340 = arg1.g2();
		} else if (arg0 == 98) {
			this.field2347 = arg1.g2();
		} else if (arg0 == 99) {
			this.field2363 = true;
		} else if (arg0 == 100) {
			this.field2358 = arg1.g1b();
		} else if (arg0 == 101) {
			this.field2319 = arg1.g1b() * 5;
		} else if (arg0 == 102) {
			this.field2326 = arg1.g2();
		} else if (arg0 == 103) {
			this.field2339 = arg1.g2();
		} else if (arg0 == 106 || arg0 == 118) {
			int var13 = -1;
			this.field2353 = arg1.g2();
			if (this.field2353 == 65535) {
				this.field2353 = -1;
			}
			this.field2365 = arg1.g2();
			if (this.field2365 == 65535) {
				this.field2365 = -1;
			}
			if (arg0 == 118) {
				var13 = arg1.g2();
				if (var13 == 65535) {
					var13 = -1;
				}
			}
			int var14 = arg1.g1();
			this.field2327 = new int[var14 + 2];
			for (int var15 = 0; var15 <= var14; var15++) {
				this.field2327[var15] = arg1.g2();
				if (this.field2327[var15] == 65535) {
					this.field2327[var15] = -1;
				}
			}
			this.field2327[var14 + 1] = var13;
		} else if (arg0 == 107) {
			this.field2359 = false;
		} else if (arg0 == 109) {
			this.field2354 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.g2();
				arg1.g2();
			} else if (arg0 == 114) {
				arg1.g1b();
				arg1.g1b();
			} else if (arg0 == 115) {
				this.field2350 = (short) (arg1.g1() * 4);
				this.field2329 = (short) (arg1.g1() * 4);
			} else if (arg0 == 119) {
				arg1.g1b();
			} else if (arg0 == 249) {
				int var7 = arg1.g1();
				if (this.field2344 == null) {
					int var8 = IntUtil.bitceil(var7);
					this.field2344 = new HashTable(var8);
				}
				for (int var9 = 0; var9 < var7; var9++) {
					boolean var10 = arg1.g1() == 1;
					int var11 = arg1.g3();
					Linkable var12;
					if (var10) {
						var12 = new StringNode(arg1.gjstr());
					} else {
						var12 = new IntNode(arg1.g4());
					}
					this.field2344.put((long) var11, var12);
				}
			}
		}
	}

	@ObfuscatedName("lf.d(I)V")
	public void method858() {
	}

	@ObfuscatedName("lf.a(IILi;)Li;")
	public JagString method860(int arg0, JagString arg1) {
		if (this.field2344 == null) {
			return arg1;
		} else {
			StringNode var3 = (StringNode) this.field2344.method1049((long) arg0);
			return var3 == null ? arg1 : var3.field4046;
		}
	}

	@ObfuscatedName("lf.d(B)Llf;")
	public NpcType method862() {
		int var1 = -1;
		if (this.field2353 != -1) {
			var1 = VarCache.method930(this.field2353);
		} else if (this.field2365 != -1) {
			var1 = VarCache.field2050[this.field2365];
		}
		if (var1 < 0 || this.field2327.length - 1 <= var1 || this.field2327[var1] == -1) {
			int var2 = this.field2327[this.field2327.length - 1];
			return var2 == -1 ? null : list(var2);
		} else {
			return list(this.field2327[var1]);
		}
	}

	@ObfuscatedName("lf.a(IILk;)Lcg;")
	public ModelLit method864(int arg0, SeqType arg1) {
		if (this.field2327 != null) {
			NpcType var3 = this.method862();
			return var3 == null ? null : var3.method864(arg0, arg1);
		} else if (this.field2362 == null) {
			return null;
		} else {
			ModelLit var4 = (ModelLit) field2606.find((long) this.field2314);
			if (var4 == null) {
				boolean var5 = false;
				for (int var6 = 0; var6 < this.field2362.length; var6++) {
					if (!field3262.method959(this.field2362[var6], 0)) {
						var5 = true;
					}
				}
				if (var5) {
					return null;
				}
				ModelUnlit[] var7 = new ModelUnlit[this.field2362.length];
				for (int var8 = 0; var8 < this.field2362.length; var8++) {
					var7[var8] = ModelUnlit.load(field3262, this.field2362[var8]);
				}
				ModelUnlit var9;
				if (var7.length == 1) {
					var9 = var7[0];
				} else {
					var9 = new ModelUnlit(var7, var7.length);
				}
				if (this.field2333 != null) {
					for (int var10 = 0; var10 < this.field2333.length; var10++) {
						if (this.field2335 == null || this.field2335.length <= var10) {
							var9.method564(this.field2333[var10], this.field2316[var10]);
						} else {
							var9.method564(this.field2333[var10], Statics.field108[this.field2335[var10] & 0xFF]);
						}
					}
				}
				if (this.field2355 != null) {
					for (int var11 = 0; var11 < this.field2355.length; var11++) {
						var9.method553(this.field2355[var11], this.field2345[var11]);
					}
				}
				var4 = var9.light(64, 768, -50, -10, -50);
				field2606.put((long) this.field2314, var4);
			}
			if (arg1 != null) {
				var4 = arg1.method758(arg0, var4);
			}
			return var4;
		}
	}

	@ObfuscatedName("lf.a(ILk;IILk;)Lcg;")
	public ModelLit method865(SeqType arg0, int arg1, int arg2, SeqType arg3) {
		if (this.field2327 != null) {
			NpcType var5 = this.method862();
			return var5 == null ? null : var5.method865(arg0, arg1, arg2, arg3);
		}
		ModelLit var6 = (ModelLit) field1923.find((long) this.field2314);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.field2361.length; var8++) {
				if (!field3262.method959(this.field2361[var8], 0)) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			ModelUnlit[] var9 = new ModelUnlit[this.field2361.length];
			for (int var10 = 0; var10 < this.field2361.length; var10++) {
				var9[var10] = ModelUnlit.load(field3262, this.field2361[var10]);
			}
			ModelUnlit var11;
			if (var9.length == 1) {
				var11 = var9[0];
			} else {
				var11 = new ModelUnlit(var9, var9.length);
			}
			if (this.field2333 != null) {
				for (int var12 = 0; var12 < this.field2333.length; var12++) {
					if (this.field2335 == null || var12 >= this.field2335.length) {
						var11.method564(this.field2333[var12], this.field2316[var12]);
					} else {
						var11.method564(this.field2333[var12], Statics.field108[this.field2335[var12] & 0xFF]);
					}
				}
			}
			if (this.field2355 != null) {
				for (int var13 = 0; var13 < this.field2355.length; var13++) {
					var11.method553(this.field2355[var13], this.field2345[var13]);
				}
			}
			var6 = var11.light(this.field2358 + 64, 850 - -this.field2319, -30, -50, -30);
			field1923.put((long) this.field2314, var6);
		}
		ModelLit var14;
		if (arg3 != null && arg0 != null) {
			var14 = arg3.method754(arg2, arg0, arg1, var6);
		} else if (arg3 != null) {
			var14 = arg3.method750(arg2, var6);
		} else if (arg0 == null) {
			var14 = var6.method184(true, true);
		} else {
			var14 = arg0.method750(arg1, var6);
		}
		if (this.field2340 != 128 || this.field2347 != 128) {
			var14.method183(this.field2340, this.field2347, this.field2340);
		}
		return var14;
	}
}
