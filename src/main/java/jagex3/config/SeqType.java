package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.dash3d.AnimFrameSet;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("he")
public final class SeqType extends Linkable2 {

	@ObfuscatedName("hd.xb")
	public static LruCache field1196 = new LruCache(64);
	@ObfuscatedName("he.Mb")
	public static Js5 field1241;
	@ObfuscatedName("te.rb")
	public static Js5 field2966;
	@ObfuscatedName("fd.Hb")
	public static Js5 field939;
	@ObfuscatedName("he.ub")
	public int[] field1223;

	@ObfuscatedName("he.yb")
	public int field1227 = -1;

	@ObfuscatedName("he.Eb")
	public int field1233 = -1;

	@ObfuscatedName("he.Lb")
	public int field1240 = 2;

	@ObfuscatedName("he.Fb")
	public int field1234 = -1;

	@ObfuscatedName("he.Rb")
	public int field1246 = -1;

	@ObfuscatedName("he.Wb")
	public int field1251 = 5;

	@ObfuscatedName("he.Xb")
	public int field1252 = 99;

	@ObfuscatedName("he.Zb")
	public int field1254 = -1;

	@ObfuscatedName("he.Yb")
	public boolean field1253 = false;

	@ObfuscatedName("he.Bb")
	public int[] field1230;

	@ObfuscatedName("he.Hb")
	public int[] field1236;

	@ObfuscatedName("he.Nb")
	public int[] field1242;

	@ObfuscatedName("cb.a(ZLbd;Lbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		field2966 = arg0;
		field939 = arg2;
		field1241 = arg1;
	}

	@ObfuscatedName("ac.b(II)Lhe;")
	public static SeqType method103(int arg0) {
		SeqType var1 = (SeqType) field1196.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1241.getFile(arg0, 12);
		SeqType var3 = new SeqType();
		if (var2 != null) {
			var3.method489(new Packet(var2));
		}
		var3.method486();
		field1196.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bd.a(Z)V")
	public static void method233() {
		field1196.clear();
		Statics.field2136.clear();
	}

	@ObfuscatedName("he.a(Lpa;Lhe;IIB)Lpa;")
	public Model method485(Model arg0, SeqType arg1, int arg2, int arg3) {
		int var5 = this.field1242[arg2];
		AnimFrameSet var6 = AnimFrameSet.method897(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.method494(arg3, arg0);
		}
		int var8 = arg1.field1242[arg3];
		AnimFrameSet var9 = AnimFrameSet.method897(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			Model var11 = arg0.method785(!var6.method938(var7));
			var11.method793(var6, var7);
			return var11;
		} else {
			Model var12 = arg0.method785(!var6.method938(var7) & !var9.method938(var10));
			var12.method777(var6, var7, var9, var10, this.field1230);
			return var12;
		}
	}

	@ObfuscatedName("he.b(B)V")
	public void method486() {
		if (this.field1233 == -1) {
			if (this.field1230 == null) {
				this.field1233 = 0;
			} else {
				this.field1233 = 2;
			}
		}
		if (this.field1227 != -1) {
			return;
		}
		if (this.field1230 == null) {
			this.field1227 = 0;
		} else {
			this.field1227 = 2;
		}
	}

	@ObfuscatedName("he.a(IZLpa;I)Lpa;")
	public Model method488(int arg0, Model arg1, int arg2) {
		int var4 = this.field1242[arg0];
		AnimFrameSet var5 = AnimFrameSet.method897(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg1.method785(true);
		}
		int var7 = arg2 & 0x3;
		Model var8 = arg1.method785(!var5.method938(var6));
		if (var7 == 1) {
			var8.method792();
		} else if (var7 == 2) {
			var8.method787();
		} else if (var7 == 3) {
			var8.method781();
		}
		var8.method793(var5, var6);
		if (var7 == 1) {
			var8.method781();
		} else if (var7 == 2) {
			var8.method787();
		} else if (var7 == 3) {
			var8.method792();
		}
		return var8;
	}

	@ObfuscatedName("he.a(ILba;)V")
	public void method489(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method490(var2, arg0);
		}
	}

	@ObfuscatedName("he.a(IILba;)V")
	public void method490(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			this.field1223 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1223[var4] = arg1.g2();
			}
			this.field1242 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field1242[var5] = arg1.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field1242[var6] += arg1.g2() << 16;
			}
		} else if (arg0 == 2) {
			this.field1254 = arg1.g2();
		} else if (arg0 == 3) {
			int var10 = arg1.g1();
			this.field1230 = new int[var10 + 1];
			for (int var11 = 0; var11 < var10; var11++) {
				this.field1230[var11] = arg1.g1();
			}
			this.field1230[var10] = 9999999;
		} else if (arg0 == 4) {
			this.field1253 = true;
		} else if (arg0 == 5) {
			this.field1251 = arg1.g1();
		} else if (arg0 == 6) {
			this.field1234 = arg1.g2();
		} else if (arg0 == 7) {
			this.field1246 = arg1.g2();
		} else if (arg0 == 8) {
			this.field1252 = arg1.g1();
		} else if (arg0 == 9) {
			this.field1227 = arg1.g1();
		} else if (arg0 == 10) {
			this.field1233 = arg1.g1();
		} else if (arg0 == 11) {
			this.field1240 = arg1.g1();
			return;
		} else if (arg0 == 12) {
			int var7 = arg1.g1();
			this.field1236 = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field1236[var8] = arg1.g2();
			}
			for (int var9 = 0; var9 < var7; var9++) {
				this.field1236[var9] += arg1.g2() << 16;
			}
			return;
		}
	}

	@ObfuscatedName("he.a(BLpa;I)Lpa;")
	public Model method492(Model arg0, int arg1) {
		int var3 = this.field1242[arg1];
		AnimFrameSet var4 = AnimFrameSet.method897(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method774(true);
		} else {
			Model var6 = arg0.method774(!var4.method938(var5));
			var6.method793(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("he.a(ILpa;Z)Lpa;")
	public Model method493(int arg0, Model arg1) {
		int var3 = this.field1242[arg0];
		AnimFrameSet var4 = AnimFrameSet.method897(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method785(true);
		}
		AnimFrameSet var6 = null;
		int var7 = 0;
		if (this.field1236 != null && this.field1236.length > arg0) {
			int var8 = this.field1236[arg0];
			var6 = AnimFrameSet.method897(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			Model var9 = arg1.method785(!var4.method938(var5));
			var9.method793(var4, var5);
			return var9;
		} else {
			Model var10 = arg1.method785(!var4.method938(var5) & !var6.method938(var7));
			var10.method793(var4, var5);
			var10.method793(var6, var7);
			return var10;
		}
	}

	@ObfuscatedName("he.b(ILpa;Z)Lpa;")
	public Model method494(int arg0, Model arg1) {
		int var3 = this.field1242[arg0];
		AnimFrameSet var4 = AnimFrameSet.method897(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.method785(true);
		} else {
			Model var6 = arg1.method785(!var4.method938(var5));
			var6.method793(var4, var5);
			return var6;
		}
	}
}
