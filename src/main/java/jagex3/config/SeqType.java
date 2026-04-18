package jagex3.config;

import deob.ObfuscatedName;
import jagex3.dash3d.AnimFrameSet;
import jagex3.dash3d.Model;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("he")
public final class SeqType extends Linkable2 {

	@ObfuscatedName("hd.xb")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("he.Mb")
	public static Js5 configClient;
	@ObfuscatedName("te.rb")
	public static Js5 bases;
	@ObfuscatedName("fd.Hb")
	public static Js5 anims;
	@ObfuscatedName("oa.k")
	public static LruCache framesetCache = new LruCache(100);
	@ObfuscatedName("he.ub")
	public int[] delay;

	@ObfuscatedName("he.yb")
	public int postanim_move = -1;

	@ObfuscatedName("he.Eb")
	public int preanim_move = -1;

	@ObfuscatedName("he.Lb")
	public int duplicatebehaviour = 2;

	@ObfuscatedName("he.Fb")
	public int replaceheldleft = -1;

	@ObfuscatedName("he.Rb")
	public int replaceheldright = -1;

	@ObfuscatedName("he.Wb")
	public int priority = 5;

	@ObfuscatedName("he.Xb")
	public int maxloops = 99;

	@ObfuscatedName("he.Zb")
	public int loops = -1;

	@ObfuscatedName("he.Yb")
	public boolean reachforward = false;

	@ObfuscatedName("he.Bb")
	public int[] walkmerge;

	@ObfuscatedName("he.Hb")
	public int[] iframes;

	@ObfuscatedName("he.Nb")
	public int[] frames;

	@ObfuscatedName("cb.a(ZLbd;Lbd;Lbd;)V")
	public static void init(Js5 arg0, Js5 arg1, Js5 arg2) {
		bases = arg0;
		anims = arg2;
		configClient = arg1;
	}

	@ObfuscatedName("ac.b(II)Lhe;")
	public static SeqType list(int arg0) {
		SeqType var1 = (SeqType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 12);
		SeqType var3 = new SeqType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		var3.postDecode();
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("bd.a(Z)V")
	public static void resetCache() {
		recentUse.clear();
		framesetCache.clear();
	}

	@ObfuscatedName("s.a(BI)Lt;")
	public static AnimFrameSet get(int arg0) {
		AnimFrameSet var1 = (AnimFrameSet) framesetCache.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		AnimFrameSet var2 = AnimFrameSet.load(anims, arg0, bases);
		if (var2 != null) {
			framesetCache.put((long) arg0, var2);
		}
		return var2;
	}

	@ObfuscatedName("he.a(Lpa;Lhe;IIB)Lpa;")
	public Model splitAnimateModel(Model arg0, SeqType arg1, int arg2, int arg3) {
		int var5 = this.frames[arg2];
		AnimFrameSet var6 = get(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg1.animateModel(arg3, arg0);
		}
		int var8 = arg1.frames[arg3];
		AnimFrameSet var9 = get(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			Model var11 = arg0.copyForAnim(!var6.getAnimateTransparencies(var7));
			var11.animate(var6, var7);
			return var11;
		} else {
			Model var12 = arg0.copyForAnim(!var6.getAnimateTransparencies(var7) & !var9.getAnimateTransparencies(var10));
			var12.maskAnimate(var6, var7, var9, var10, this.walkmerge);
			return var12;
		}
	}

	@ObfuscatedName("he.b(B)V")
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

	@ObfuscatedName("he.a(IZLpa;I)Lpa;")
	public Model animateModel90(int arg0, Model arg1, int arg2) {
		int var4 = this.frames[arg0];
		AnimFrameSet var5 = get(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg1.copyForAnim(true);
		}
		int var7 = arg2 & 0x3;
		Model var8 = arg1.copyForAnim(!var5.getAnimateTransparencies(var6));
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

	@ObfuscatedName("he.a(ILba;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("he.a(IILba;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			int var3 = arg1.g1();
			this.delay = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.delay[var4] = arg1.g2();
			}
			this.frames = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.frames[var5] = arg1.g2();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.frames[var6] += arg1.g2() << 16;
			}
		} else if (arg0 == 2) {
			this.loops = arg1.g2();
		} else if (arg0 == 3) {
			int var10 = arg1.g1();
			this.walkmerge = new int[var10 + 1];
			for (int var11 = 0; var11 < var10; var11++) {
				this.walkmerge[var11] = arg1.g1();
			}
			this.walkmerge[var10] = 9999999;
		} else if (arg0 == 4) {
			this.reachforward = true;
		} else if (arg0 == 5) {
			this.priority = arg1.g1();
		} else if (arg0 == 6) {
			this.replaceheldleft = arg1.g2();
		} else if (arg0 == 7) {
			this.replaceheldright = arg1.g2();
		} else if (arg0 == 8) {
			this.maxloops = arg1.g1();
		} else if (arg0 == 9) {
			this.postanim_move = arg1.g1();
		} else if (arg0 == 10) {
			this.preanim_move = arg1.g1();
		} else if (arg0 == 11) {
			this.duplicatebehaviour = arg1.g1();
		} else if (arg0 == 12) {
			int var7 = arg1.g1();
			this.iframes = new int[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.iframes[var8] = arg1.g2();
			}
			for (int var9 = 0; var9 < var7; var9++) {
				this.iframes[var9] += arg1.g2() << 16;
			}
		}
	}

	@ObfuscatedName("he.a(BLpa;I)Lpa;")
	public Model animateModel2(Model arg0, int arg1) {
		int var3 = this.frames[arg1];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.copyForAnim2(true);
		} else {
			Model var6 = arg0.copyForAnim2(!var4.getAnimateTransparencies(var5));
			var6.animate(var4, var5);
			return var6;
		}
	}

	@ObfuscatedName("he.a(ILpa;Z)Lpa;")
	public Model animateModelWithExtra(int arg0, Model arg1) {
		int var3 = this.frames[arg0];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.copyForAnim(true);
		}
		AnimFrameSet var6 = null;
		int var7 = 0;
		if (this.iframes != null && this.iframes.length > arg0) {
			int var8 = this.iframes[arg0];
			var6 = get(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			Model var9 = arg1.copyForAnim(!var4.getAnimateTransparencies(var5));
			var9.animate(var4, var5);
			return var9;
		} else {
			Model var10 = arg1.copyForAnim(!var4.getAnimateTransparencies(var5) & !var6.getAnimateTransparencies(var7));
			var10.animate(var4, var5);
			var10.animate(var6, var7);
			return var10;
		}
	}

	@ObfuscatedName("he.b(ILpa;Z)Lpa;")
	public Model animateModel(int arg0, Model arg1) {
		int var3 = this.frames[arg0];
		AnimFrameSet var4 = get(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg1.copyForAnim(true);
		} else {
			Model var6 = arg1.copyForAnim(!var4.getAnimateTransparencies(var5));
			var6.animate(var4, var5);
			return var6;
		}
	}
}
