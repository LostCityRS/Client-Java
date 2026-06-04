package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("ga")
public final class TextureManager implements TextureProvider {

	@ObfuscatedName("ga.a")
	public final byte[] field1222;

	@ObfuscatedName("ga.b")
	public final boolean[] field1223;

	@ObfuscatedName("ga.c")
	public final byte[] field1224;

	@ObfuscatedName("ga.e")
	public final Js5 field1226;

	@ObfuscatedName("ga.f")
	public int poolSize = 50;

	@ObfuscatedName("ga.h")
	public final short[] field1229;

	@ObfuscatedName("ga.k")
	public final LruCache field1232;

	@ObfuscatedName("ga.l")
	public final byte[] field1233;

	@ObfuscatedName("ga.n")
	public final Js5 sprites;

	@ObfuscatedName("ga.p")
	public final boolean[] field1237;

	@ObfuscatedName("ga.t")
	public final boolean[] field1241;

	@ObfuscatedName("ga.v")
	public final boolean[] field1243;

	@ObfuscatedName("ga.A")
	public boolean field1248 = false;

	@ObfuscatedName("ga.E")
	public final boolean[] opaque;

	@ObfuscatedName("ga.C")
	public final byte[] field1250;

	public TextureManager(Js5 arg0, Js5 arg1, Js5 arg2, int arg3, boolean arg4) {
		this.field1248 = arg4;
		this.field1226 = arg0;
		this.sprites = arg2;
		this.poolSize = 20;
		this.field1232 = new LruCache(this.poolSize);
		Packet var6 = new Packet(arg1.getFile(0, 0));
		int var7 = var6.g2();
		this.field1222 = new byte[var7];
		this.field1223 = new boolean[var7];
		this.opaque = new boolean[var7];
		this.field1224 = new byte[var7];
		this.field1250 = new byte[var7];
		this.field1237 = new boolean[var7];
		this.field1243 = new boolean[var7];
		this.field1241 = new boolean[var7];
		this.field1233 = new byte[var7];
		this.field1229 = new short[var7];
		for (int var8 = 0; var8 < var7; var8++) {
			this.field1243[var8] = var6.g1() == 1;
		}
		for (int var9 = 0; var9 < var7; var9++) {
			if (this.field1243[var9]) {
				this.field1223[var9] = var6.g1() == 1;
			}
		}
		for (int var10 = 0; var10 < var7; var10++) {
			if (this.field1243[var10]) {
				this.opaque[var10] = var6.g1() == 1;
			}
		}
		for (int var11 = 0; var11 < var7; var11++) {
			if (this.field1243[var11]) {
				this.field1237[var11] = var6.g1() == 1;
			}
		}
		for (int var12 = 0; var12 < var7; var12++) {
			if (this.field1243[var12]) {
				this.field1241[var12] = var6.g1() == 1;
			}
		}
		for (int var13 = 0; var13 < var7; var13++) {
			if (this.field1243[var13]) {
				this.field1222[var13] = var6.g1b();
			}
		}
		for (int var14 = 0; var14 < var7; var14++) {
			if (this.field1243[var14]) {
				this.field1250[var14] = var6.g1b();
			}
		}
		for (int var15 = 0; var15 < var7; var15++) {
			if (this.field1243[var15]) {
				this.field1224[var15] = var6.g1b();
			}
		}
		for (int var16 = 0; var16 < var7; var16++) {
			if (this.field1243[var16]) {
				this.field1233[var16] = var6.g1b();
			}
		}
		for (int var17 = 0; var17 < var7; var17++) {
			if (this.field1243[var17]) {
				this.field1229[var17] = (short) var6.g2();
			}
		}
	}

	@ObfuscatedName("ga.a(II)Z")
	@Override
	public boolean isOpaque(int arg0) {
		return this.opaque[arg0];
	}

	@ObfuscatedName("ga.a(IB)Z")
	@Override
	public boolean isTextureEnabled(int arg0) {
		return this.field1223[arg0];
	}

	@ObfuscatedName("ga.c(IB)Z")
	@Override
	public boolean isLoaded(int arg0) {
		GlTexture var2 = this.loadTexture(arg0);
		return var2 == null ? false : var2.method1368(this, this.sprites);
	}

	@ObfuscatedName("ga.b(II)I")
	@Override
	public int getAverageRgb(int arg0) {
		return this.field1229[arg0] & 0xFFFF;
	}

	@ObfuscatedName("ga.d(IB)Lsc;")
	public GlTexture loadTexture(int arg0) {
		GlTexture var2 = (GlTexture) this.field1232.find((long) arg0);
		if (var2 != null) {
			return var2;
		}
		byte[] var3 = this.field1226.getFile(0, arg0);
		if (var3 == null) {
			return null;
		} else {
			Packet var4 = new Packet(var3);
			GlTexture var5 = new GlTexture(var4);
			this.field1232.put((long) arg0, var5);
			return var5;
		}
	}

	@ObfuscatedName("ga.b(IB)Z")
	@Override
	public boolean isLowMem(int arg0) {
		return this.field1248 || this.field1237[arg0];
	}

	@ObfuscatedName("ga.b(I)V")
	public void reset() {
		this.field1232.clear();
	}

	@ObfuscatedName("ga.c(II)[I")
	@Override
	public int[] getTexels(int arg0) {
		GlTexture var2 = this.loadTexture(arg0);
		return var2 == null ? null : var2.method1366(this.sprites, this.field1248 || this.field1237[arg0], this);
	}

	@ObfuscatedName("ga.d(II)V")
	public void runAnims(int arg0) {
		for (GlTexture var2 = (GlTexture) this.field1232.search(); var2 != null; var2 = (GlTexture) this.field1232.findnext()) {
			if (var2.field3800) {
				var2.method1367(arg0);
				var2.field3800 = false;
			}
		}
	}

	@ObfuscatedName("ga.a(FIZ)[I")
	@Override
	public int[] getTexels(float arg0, int arg1) {
		GlTexture var3 = this.loadTexture(arg1);
		if (var3 == null) {
			return null;
		} else {
			var3.field3800 = true;
			return var3.method1369(this, arg0, this.sprites, this.field1248 || this.field1237[arg1]);
		}
	}
}
