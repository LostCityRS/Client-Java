package jagex3.config;

import deob.ObfuscatedName;
import jagex3.constants.Text;
import jagex3.dash3d.ModelLit;
import jagex3.dash3d.ModelUnlit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.util.JagString;
import jagex3.var.VarCache;

@ObfuscatedName("o")
public final class NPCType extends Linkable2 {

	@ObfuscatedName("wa.t")
	public static Js5 field3512;
	@ObfuscatedName("cd.f")
	public static Js5 field363;
	@ObfuscatedName("ba.f")
	public static LruCache field164 = new LruCache(64);
	@ObfuscatedName("ud.T")
	public static LruCache field3269 = new LruCache(50);
	@ObfuscatedName("kb.j")
	public static JagString field1671 = JagString.wrap("null");
	@ObfuscatedName("o.ab")
	public JagString field2204 = field1671;

	@ObfuscatedName("o.cb")
	public int field2206 = 128;

	@ObfuscatedName("o.fb")
	public int field2209 = -1;

	@ObfuscatedName("o.hb")
	public int field2211 = -1;

	@ObfuscatedName("o.kb")
	public int[] field2214;

	@ObfuscatedName("o.nb")
	public int field2217 = -1;

	@ObfuscatedName("o.ob")
	public int field2218 = 32;

	@ObfuscatedName("o.pb")
	public int field2219 = -1;

	@ObfuscatedName("o.qb")
	public short[] field2220;

	@ObfuscatedName("o.rb")
	public boolean field2221 = true;

	@ObfuscatedName("o.sb")
	public int field2222 = 0;

	@ObfuscatedName("o.ub")
	public int field2224;

	@ObfuscatedName("o.K")
	public boolean field2188 = true;

	@ObfuscatedName("o.L")
	public final JagString[] field2189 = new JagString[5];

	@ObfuscatedName("o.H")
	public int field2185 = -1;

	@ObfuscatedName("o.O")
	public int field2192 = -1;

	@ObfuscatedName("o.R")
	public int field2195 = -1;

	@ObfuscatedName("o.S")
	public int field2196 = 1;

	@ObfuscatedName("o.Y")
	public int field2202 = -1;

	@ObfuscatedName("o.N")
	public int field2191 = 0;

	@ObfuscatedName("o.U")
	public int field2198 = -1;

	@ObfuscatedName("o.I")
	public int field2186 = -1;

	@ObfuscatedName("o.X")
	public int field2201 = -1;

	@ObfuscatedName("o.xb")
	public int field2227 = 128;

	@ObfuscatedName("o.Lb")
	public boolean field2241 = true;

	@ObfuscatedName("o.Nb")
	public boolean field2243 = false;

	@ObfuscatedName("o.M")
	public int[] field2190;

	@ObfuscatedName("o.Z")
	public int[] field2203;

	@ObfuscatedName("o.P")
	public short[] field2193;

	@ObfuscatedName("o.T")
	public short[] field2197;

	@ObfuscatedName("o.yb")
	public short[] field2228;

	@ObfuscatedName("cb.b(II)Lo;")
	public static NPCType method130(int arg0) {
		NPCType var1 = (NPCType) field164.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3512.getFile(9, arg0);
		NPCType var3 = new NPCType();
		var3.field2224 = arg0;
		if (var2 != null) {
			var3.method758(new Packet(var2));
		}
		var3.method762();
		field164.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("td.a(Lea;Lea;B)V")
	public static void init(Js5 arg0, Js5 arg1) {
		field363 = arg1;
		field3512 = arg0;
	}

	@ObfuscatedName("ld.a(I)V")
	public static void method630() {
		field164.clear();
		field3269.clear();
	}

	@ObfuscatedName("o.e(I)Lp;")
	public ModelUnlit method752() {
		if (this.field2214 != null) {
			NPCType var1 = this.method757();
			return var1 == null ? null : var1.method752();
		} else if (this.field2203 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < this.field2203.length; var3++) {
				if (!field363.requestDownload(this.field2203[var3], 0)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			ModelUnlit[] var4 = new ModelUnlit[this.field2203.length];
			for (int var5 = 0; var5 < this.field2203.length; var5++) {
				var4[var5] = ModelUnlit.method840(field363, this.field2203[var5]);
			}
			ModelUnlit var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new ModelUnlit(var4, var4.length);
			}
			if (this.field2228 != null) {
				for (int var7 = 0; var7 < this.field2228.length; var7++) {
					var6.method833(this.field2228[var7], this.field2220[var7]);
				}
			}
			if (this.field2193 != null) {
				for (int var8 = 0; var8 < this.field2193.length; var8++) {
					var6.method853(this.field2193[var8], this.field2197[var8]);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("o.f(I)Z")
	public boolean method755() {
		if (this.field2214 == null) {
			return true;
		}
		int var1 = -1;
		if (this.field2192 != -1) {
			var1 = VarCache.getVarbit(this.field2192);
		} else if (this.field2186 != -1) {
			var1 = VarCache.field504[this.field2186];
		}
		return var1 >= 0 && var1 < this.field2214.length && this.field2214[var1] != -1;
	}

	@ObfuscatedName("o.g(I)Lo;")
	public NPCType method757() {
		int var1 = -1;
		if (this.field2192 != -1) {
			var1 = VarCache.getVarbit(this.field2192);
		} else if (this.field2186 != -1) {
			var1 = VarCache.field504[this.field2186];
		}
		return var1 < 0 || var1 >= this.field2214.length || this.field2214[var1] == -1 ? null : method130(this.field2214[var1]);
	}

	@ObfuscatedName("o.a(BLjd;)V")
	public void method758(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method763(arg0, var2);
		}
	}

	@ObfuscatedName("o.a(Lvc;ILvc;BI)Lod;")
	public ModelLit method761(SeqType arg0, int arg1, SeqType arg2, int arg3) {
		if (this.field2214 != null) {
			NPCType var5 = this.method757();
			return var5 == null ? null : var5.method761(arg0, arg1, arg2, arg3);
		}
		ModelLit var6 = (ModelLit) field3269.find((long) this.field2224);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.field2190.length; var8++) {
				if (!field363.requestDownload(this.field2190[var8], 0)) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			ModelUnlit[] var9 = new ModelUnlit[this.field2190.length];
			for (int var10 = 0; var10 < this.field2190.length; var10++) {
				var9[var10] = ModelUnlit.method840(field363, this.field2190[var10]);
			}
			ModelUnlit var11;
			if (var9.length == 1) {
				var11 = var9[0];
			} else {
				var11 = new ModelUnlit(var9, var9.length);
			}
			if (this.field2228 != null) {
				for (int var12 = 0; var12 < this.field2228.length; var12++) {
					var11.method833(this.field2228[var12], this.field2220[var12]);
				}
			}
			if (this.field2193 != null) {
				for (int var13 = 0; var13 < this.field2193.length; var13++) {
					var11.method853(this.field2193[var13], this.field2197[var13]);
				}
			}
			var6 = var11.method847(this.field2191 + 64, this.field2222 + 850, -30, -50, -30);
			field3269.put((long) this.field2224, var6);
		}
		ModelLit var14;
		if (arg2 != null && arg0 != null) {
			var14 = arg2.method1114(arg3, arg0, var6, arg1);
		} else if (arg2 != null) {
			var14 = arg2.method1116(var6, arg1);
		} else if (arg0 == null) {
			var14 = var6.method799(true);
		} else {
			var14 = arg0.method1116(var6, arg3);
		}
		if (this.field2206 != 128 || this.field2227 != 128) {
			var14.method805(this.field2206, this.field2227, this.field2206);
		}
		return var14;
	}

	@ObfuscatedName("o.b(B)V")
	public void method762() {
	}

	@ObfuscatedName("o.a(ILjd;I)V")
	public void method763(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			this.field2190 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2190[var4] = arg0.g2();
			}
		} else if (arg1 == 2) {
			this.field2204 = arg0.method555();
		} else if (arg1 == 12) {
			this.field2196 = arg0.g1();
		} else if (arg1 == 13) {
			this.field2195 = arg0.g2();
		} else if (arg1 == 14) {
			this.field2202 = arg0.g2();
		} else if (arg1 == 15) {
			this.field2209 = arg0.g2();
		} else if (arg1 == 16) {
			this.field2185 = arg0.g2();
		} else if (arg1 == 17) {
			this.field2202 = arg0.g2();
			this.field2201 = arg0.g2();
			this.field2219 = arg0.g2();
			this.field2211 = arg0.g2();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field2189[arg1 - 30] = arg0.method555();
			if (this.field2189[arg1 - 30].method271(Text.HIDDEN)) {
				this.field2189[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var11 = arg0.g1();
			this.field2228 = new short[var11];
			this.field2220 = new short[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				this.field2228[var12] = (short) arg0.g2();
				this.field2220[var12] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var9 = arg0.g1();
			this.field2193 = new short[var9];
			this.field2197 = new short[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2193[var10] = (short) arg0.g2();
				this.field2197[var10] = (short) arg0.g2();
			}
		} else if (arg1 == 60) {
			int var5 = arg0.g1();
			this.field2203 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2203[var6] = arg0.g2();
			}
		} else if (arg1 == 93) {
			this.field2221 = false;
		} else if (arg1 == 95) {
			this.field2198 = arg0.g2();
		} else if (arg1 == 97) {
			this.field2206 = arg0.g2();
		} else if (arg1 == 98) {
			this.field2227 = arg0.g2();
		} else if (arg1 == 99) {
			this.field2243 = true;
		} else if (arg1 == 100) {
			this.field2191 = arg0.g1b();
		} else if (arg1 == 101) {
			this.field2222 = arg0.g1b() * 5;
		} else if (arg1 == 102) {
			this.field2217 = arg0.g2();
		} else if (arg1 == 103) {
			this.field2218 = arg0.g2();
		} else if (arg1 == 106) {
			this.field2192 = arg0.g2();
			if (this.field2192 == 65535) {
				this.field2192 = -1;
			}
			this.field2186 = arg0.g2();
			if (this.field2186 == 65535) {
				this.field2186 = -1;
			}
			int var7 = arg0.g1();
			this.field2214 = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.field2214[var8] = arg0.g2();
				if (this.field2214[var8] == 65535) {
					this.field2214[var8] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.field2188 = false;
		} else if (arg1 == 109) {
			this.field2241 = false;
		}
	}
}
