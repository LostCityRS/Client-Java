package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.AnimFrameSet;
import jagex3.dash3d.ModelLit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("k")
public final class SeqType extends Linkable2 {

	@ObfuscatedName("wb.k")
	public static final LruCache field4471 = new LruCache(64);
	@ObfuscatedName("tc.J")
	public static final LruCache field3989 = new LruCache(100);
	@ObfuscatedName("dc.k")
	public static Js5 field672;
	@ObfuscatedName("n.l")
	public static Js5 field2624;
	@ObfuscatedName("nf.O")
	public static Js5 field2778;

	@ObfuscatedName("k.cb")
	public int field1983 = -1;

	@ObfuscatedName("k.eb")
	public int[] field1985;

	@ObfuscatedName("k.jb")
	public int[] field1990;

	@ObfuscatedName("k.mb")
	public boolean field1993 = false;

	@ObfuscatedName("k.sb")
	public int field1999 = 5;

	@ObfuscatedName("k.tb")
	public int field2000 = -1;

	@ObfuscatedName("k.ub")
	public int[][] field2001;

	@ObfuscatedName("k.wb")
	public int[] field2003;

	@ObfuscatedName("k.E")
	public boolean field1960 = false;

	@ObfuscatedName("k.R")
	public int field1972 = -1;

	@ObfuscatedName("k.U")
	public int field1975 = -1;

	@ObfuscatedName("k.Z")
	public int field1980 = -1;

	@ObfuscatedName("k.K")
	public int field1966 = 2;

	@ObfuscatedName("k.P")
	public int field1970 = 99;

	@ObfuscatedName("k.J")
	public int[] field1965;

	@ObfuscatedName("bc.a(IB)Lk;")
	public static SeqType list(int arg0) {
		SeqType var1 = (SeqType) field4471.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field672.getFile(method50(arg0), method1441(arg0));
		SeqType var3 = new SeqType();
		if (var2 != null) {
			var3.method751(new Packet(var2));
		}
		var3.method757();
		field4471.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bc.a(I)V")
	public static void resetCache() {
		field4471.clear();
		field3989.clear();
	}

	@ObfuscatedName("e.a(Lnb;BLnb;Lnb;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		field2624 = arg1;
		field672 = arg0;
		field2778 = arg2;
	}

	@ObfuscatedName("ea.a(Lnb;ILnb;ZB)Lli;")
	public static AnimFrameSet method309(Js5 arg0, int arg1, Js5 arg2) {
		boolean var3 = true;
		int[] var4 = arg2.method948(arg1);
		for (int var5 = 0; var5 < var4.length; var5++) {
			byte[] var6 = arg2.method947(var4[var5], arg1);
			if (var6 == null) {
				var3 = false;
			} else {
				int var7 = var6[1] & 0xFF | (var6[0] & 0xFF) << 8;
				byte[] var8 = arg0.method947(0, var7);
				if (var8 == null) {
					var3 = false;
				}
			}
		}
		if (!var3) {
			return null;
		}
		try {
			return new AnimFrameSet(arg2, arg0, arg1, false);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("lj.b(II)Lli;")
	public static AnimFrameSet method878(int arg0) {
		AnimFrameSet var1 = (AnimFrameSet) field3989.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = method309(field2778, arg0, field2624);
		if (var2 != null) {
			field3989.method663((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("ah.a(IB)I")
	public static int method50(int arg0) {
		return arg0 & 0x7F;
	}

	@ObfuscatedName("td.a(IZ)I")
	public static int method1441(int arg0) {
		return arg0 >>> 7;
	}

	@ObfuscatedName("k.a(ILcg;I)Lcg;")
	public ModelLit method741(ModelLit arg0, int arg1) {
		int var3 = this.field1965[arg1];
		AnimFrameSet var4 = method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method185(true, true);
		} else {
			ModelLit var6 = arg0.method185(!var4.method875(var5), !this.field1993);
			var6.method187(var4, var5, this.field1993);
			return var6;
		}
	}

	@ObfuscatedName("k.a(Lea;II)V")
	public void method744(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g2();
			this.field1990 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1990[var4] = arg0.g2();
			}
			this.field1965 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field1965[var5] = arg0.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field1965[var6] = (arg0.g2() << 16) + this.field1965[var6];
			}
		} else if (arg1 == 2) {
			this.field1972 = arg0.g2();
		} else if (arg1 == 3) {
			int var7 = arg0.g1();
			this.field1985 = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1985[var8] = arg0.g1();
			}
			this.field1985[var7] = 9999999;
		} else if (arg1 == 4) {
			this.field1960 = true;
		} else if (arg1 == 5) {
			this.field1999 = arg0.g1();
		} else if (arg1 == 6) {
			this.field2000 = arg0.g2();
		} else if (arg1 == 7) {
			this.field1975 = arg0.g2();
		} else if (arg1 == 8) {
			this.field1970 = arg0.g1();
		} else if (arg1 == 9) {
			this.field1983 = arg0.g1();
		} else if (arg1 == 10) {
			this.field1980 = arg0.g1();
		} else if (arg1 == 11) {
			this.field1966 = arg0.g1();
		} else if (arg1 == 12) {
			int var13 = arg0.g1();
			this.field2003 = new int[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.field2003[var14] = arg0.g2();
			}
			for (int var15 = 0; var15 < var13; var15++) {
				this.field2003[var15] = (arg0.g2() << 16) + this.field2003[var15];
			}
		} else if (arg1 == 13) {
			int var9 = arg0.g2();
			this.field2001 = new int[var9][];
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = arg0.g1();
				if (var11 > 0) {
					this.field2001[var10] = new int[var11];
					this.field2001[var10][0] = arg0.g3();
					for (int var12 = 1; var12 < var11; var12++) {
						this.field2001[var10][var12] = arg0.g2();
					}
				}
			}
			return;
		} else if (arg1 == 14) {
			this.field1993 = true;
			return;
		}
	}

	@ObfuscatedName("k.a(IZLcg;I)Lcg;")
	public ModelLit method749(int arg0, ModelLit arg1, int arg2) {
		int var4 = this.field1965[arg2];
		AnimFrameSet var5 = method878(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg1.method184(true, true);
		}
		int var7 = arg0 & 0x3;
		ModelLit var8 = arg1.method184(!var5.method875(var6), !this.field1993);
		if (var7 == 1) {
			var8.method181();
		} else if (var7 == 2) {
			var8.method190();
		} else if (var7 == 3) {
			var8.method182();
		}
		var8.method187(var5, var6, this.field1993);
		if (var7 == 1) {
			var8.method182();
		} else if (var7 == 2) {
			var8.method190();
		} else if (var7 == 3) {
			var8.method181();
		}
		return var8;
	}

	@ObfuscatedName("k.a(IILcg;)Lcg;")
	public ModelLit method750(int arg0, ModelLit arg1) {
		int var3 = this.field1965[arg0];
		AnimFrameSet var4 = method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method184(true, true);
		} else {
			ModelLit var6 = arg1.method184(!var4.method875(var5), !this.field1993);
			var6.method187(var4, var5, this.field1993);
			return var6;
		}
	}

	@ObfuscatedName("k.a(Lea;Z)V")
	public void method751(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method744(arg0, var2);
		}
	}

	@ObfuscatedName("k.a(ILk;IBLcg;)Lcg;")
	public ModelLit method754(int arg0, SeqType arg1, int arg2, ModelLit arg3) {
		int var5 = this.field1965[arg0];
		AnimFrameSet var6 = method878(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.method750(arg2, arg3);
		}
		int var8 = arg1.field1965[arg2];
		AnimFrameSet var9 = method878(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			ModelLit var11 = arg3.method184(!var6.method875(var7), !this.field1993);
			var11.method187(var6, var7, this.field1993);
			return var11;
		} else {
			ModelLit var12 = arg3.method184(!var6.method875(var7) & !var9.method875(var10), !arg1.field1993 & !this.field1993);
			var12.method189(var6, var7, var9, var10, this.field1985, arg1.field1993 | this.field1993);
			return var12;
		}
	}

	@ObfuscatedName("k.d(B)V")
	public void method757() {
		if (this.field1983 == -1) {
			if (this.field1985 == null) {
				this.field1983 = 0;
			} else {
				this.field1983 = 2;
			}
		}
		if (this.field1980 != -1) {
			return;
		}
		if (this.field1985 == null) {
			this.field1980 = 0;
		} else {
			this.field1980 = 2;
		}
	}

	@ObfuscatedName("k.a(ILcg;B)Lcg;")
	public ModelLit method758(int arg0, ModelLit arg1) {
		int var3 = this.field1965[arg0];
		AnimFrameSet var4 = method878(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method184(true, true);
		}
		AnimFrameSet var6 = null;
		int var7 = 0;
		if (this.field2003 != null && this.field2003.length > arg0) {
			int var8 = this.field2003[arg0];
			var6 = method878(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			ModelLit var9 = arg1.method184(!var4.method875(var5), !this.field1993);
			var9.method187(var4, var5, this.field1993);
			return var9;
		} else {
			ModelLit var10 = arg1.method184(!var4.method875(var5) & !var6.method875(var7), !this.field1993);
			var10.method187(var4, var5, this.field1993);
			var10.method187(var6, var7, this.field1993);
			return var10;
		}
	}
}
