package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.AnimFrameSet;
import jagex3.dash3d.ModelLit;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("vc")
public final class SeqType extends Linkable2 {

	@ObfuscatedName("lc.e")
	public static Js5 configClient;

	@ObfuscatedName("ab.q")
	public static Js5 anims;

	@ObfuscatedName("te.u")
	public static Js5 bases;

	@ObfuscatedName("nb.w")
	public static LruCache recentUse = new LruCache(64);

	@ObfuscatedName("jb.d")
	public static LruCache framesetCache = new LruCache(100);

	@ObfuscatedName("vc.ib")
	public int[] frames;

	@ObfuscatedName("vc.cb")
	public int[] iframes;

	@ObfuscatedName("vc.R")
	public int[] delay;

	@ObfuscatedName("vc.J")
	public int[] sound;

	@ObfuscatedName("vc.bb")
	public int loops = -1;

	@ObfuscatedName("vc.ab")
	public int[] walkmerge;

	@ObfuscatedName("vc.M")
	public boolean stretches = false;

	@ObfuscatedName("vc.Z")
	public int priority = 5;

	@ObfuscatedName("vc.fb")
	public int replaceheldleft = -1;

	@ObfuscatedName("vc.H")
	public int replaceheldright = -1;

	@ObfuscatedName("vc.eb")
	public int maxloops = 99;

	@ObfuscatedName("vc.X")
	public int preanim_move = -1;

	@ObfuscatedName("vc.W")
	public int postanim_move = -1;

	@ObfuscatedName("vc.kb")
	public int duplicatebehavior = 2;

	@ObfuscatedName("la.a(Lea;Lea;BLea;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		configClient = arg1;
		anims = arg2;
		bases = arg0;
	}

	@ObfuscatedName("o.a(BI)Lvc;")
	public static SeqType list(int arg0) {
		SeqType var1 = (SeqType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(12, arg0);
		SeqType var3 = new SeqType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("vc.f(I)V")
	public void postDecode() {
		if (this.preanim_move == -1) {
			if (this.walkmerge == null) {
				this.preanim_move = 0;
			} else {
				this.preanim_move = 2;
			}
		}
		if (this.postanim_move == -1) {
			if (this.walkmerge == null) {
				this.postanim_move = 0;
			} else {
				this.postanim_move = 2;
			}
		}
	}

	@ObfuscatedName("vc.b(Ljd;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("vc.a(Ljd;IB)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g2();
			this.delay = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.delay[var4] = arg0.g2();
			}
			this.frames = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.frames[var5] = arg0.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.frames[var6] += arg0.g2() << 16;
			}
		} else if (arg1 == 2) {
			this.loops = arg0.g2();
		} else if (arg1 == 3) {
			int var7 = arg0.g1();
			this.walkmerge = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.walkmerge[var8] = arg0.g1();
			}
			this.walkmerge[var7] = 9999999;
		} else if (arg1 == 4) {
			this.stretches = true;
		} else if (arg1 == 5) {
			this.priority = arg0.g1();
		} else if (arg1 == 6) {
			this.replaceheldleft = arg0.g2();
		} else if (arg1 == 7) {
			this.replaceheldright = arg0.g2();
		} else if (arg1 == 8) {
			this.maxloops = arg0.g1();
		} else if (arg1 == 9) {
			this.preanim_move = arg0.g1();
		} else if (arg1 == 10) {
			this.postanim_move = arg0.g1();
		} else if (arg1 == 11) {
			this.duplicatebehavior = arg0.g1();
		} else if (arg1 == 12) {
			int var9 = arg0.g1();
			this.iframes = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.iframes[var10] = arg0.g2();
			}
			for (int var11 = 0; var11 < var9; var11++) {
				this.iframes[var11] = (arg0.g2() << 16) + this.iframes[var11];
			}
		} else if (arg1 == 13) {
			int var12 = arg0.g1();
			this.sound = new int[var12];
			for (int var13 = 0; var13 < var12; var13++) {
				this.sound[var13] = arg0.g3();
			}
		}
	}

	@ObfuscatedName("vc.a(Lod;II)Lod;")
	public ModelLit animateModel(ModelLit arg0, int arg1) {
		int var3 = this.frames[arg1];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.copyForAnim(true);
		} else {
			ModelLit var6 = arg0.copyForAnim(!var4.getAnimateTransparencies(var5));
			var6.animate(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("vc.a(IILod;B)Lod;")
	public ModelLit animateModel90(int arg0, int arg1, ModelLit arg2) {
		int var4 = this.frames[arg1];
		AnimFrameSet var5 = get(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg2.copyForAnim(true);
		}
		int var7 = arg0 & 0x3;
		ModelLit var8 = arg2.copyForAnim(!var5.getAnimateTransparencies(var6));
		if (var7 == 1) {
			var8.rotate270();
		} else if (var7 == 2) {
			var8.rotate180();
		} else if (var7 == 3) {
			var8.rotate90();
		}
		var8.animate(var5, var6);
		if (var7 == 1) {
			var8.rotate90();
		} else if (var7 == 2) {
			var8.rotate180();
		} else if (var7 == 3) {
			var8.rotate270();
		}
		return var8;
	}

	@ObfuscatedName("vc.a(ZLod;I)Lod;")
	public ModelLit animateModel2(ModelLit arg0, int arg1) {
		int var3 = this.frames[arg1];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.copyForAnim2(true);
		} else {
			ModelLit var6 = arg0.copyForAnim2(!var4.getAnimateTransparencies(var5));
			var6.animate(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("vc.a(ILvc;Lod;II)Lod;")
	public ModelLit splitAnimateModel(int arg0, SeqType arg1, ModelLit arg2, int arg3) {
		int var5 = this.frames[arg3];
		AnimFrameSet var6 = get(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.animateModel(arg2, arg0);
		}
		int var8 = arg1.frames[arg0];
		AnimFrameSet var9 = get(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			ModelLit var11 = arg2.copyForAnim(!var6.getAnimateTransparencies(var7));
			var11.animate(var6, var7);
			return var11;
		} else {
			ModelLit var12 = arg2.copyForAnim(!var6.getAnimateTransparencies(var7) & !var9.getAnimateTransparencies(var10));
			var12.method814(var6, var7, var9, var10, this.walkmerge);
			return var12;
		}
	}

	@ObfuscatedName("vc.a(IILod;)Lod;")
	public ModelLit animateModelWithExtra(int arg0, ModelLit arg1) {
		int var3 = this.frames[arg0];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.copyForAnim(true);
		}
		AnimFrameSet var6 = null;
		int var7 = 0;
		if (this.iframes != null && arg0 < this.iframes.length) {
			int var8 = this.iframes[arg0];
			var6 = get(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			ModelLit var9 = arg1.copyForAnim(!var4.getAnimateTransparencies(var5));
			var9.animate(var4, var5);
			return var9;
		} else {
			ModelLit var10 = arg1.copyForAnim(!var4.getAnimateTransparencies(var5) & !var6.getAnimateTransparencies(var7));
			var10.animate(var4, var5);
			var10.animate(var6, var7);
			return var10;
		}
	}

	@ObfuscatedName("mc.a(BI)Lrc;")
	public static AnimFrameSet get(int arg0) {
		AnimFrameSet var1 = (AnimFrameSet) framesetCache.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = AnimFrameSet.load(bases, anims, arg0);
		if (var2 != null) {
			framesetCache.put((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("qd.f(I)V")
	public static void resetCache() {
		recentUse.clear();
		framesetCache.clear();
	}
}
