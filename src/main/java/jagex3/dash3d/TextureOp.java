package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.graphics.ColorImageCache;
import jagex3.graphics.MonochromeImageCache;
import jagex3.io.Packet;

@ObfuscatedName("c")
public abstract class TextureOp extends Linkable {

	@ObfuscatedName("c.D")
	public boolean field369;

	@ObfuscatedName("c.K")
	public final TextureOp[] field376;

	@ObfuscatedName("c.x")
	public int field363;

	@ObfuscatedName("c.N")
	public MonochromeImageCache field379;

	@ObfuscatedName("c.y")
	public ColorImageCache field364;

	public TextureOp(int arg0, boolean arg1) {
		this.field369 = arg1;
		this.field376 = new TextureOp[arg0];
	}

	@ObfuscatedName("c.a(IB)[I")
	public int[] method54(int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@ObfuscatedName("c.a(IZI)[I")
	public final int[] method120(int arg0, int arg1) {
		return this.field376[arg1].field369 ? this.field376[arg1].method54(arg0) : this.field376[arg1].method7(arg0)[0];
	}

	@ObfuscatedName("c.a(Lea;II)V")
	public void method11(Packet arg0, int arg1) {
	}

	@ObfuscatedName("c.a(IBI)[[I")
	public final int[][] method121(int arg0, int arg1) {
		if (this.field376[arg0].field369) {
			int[] var3 = this.field376[arg0].method54(arg1);
			return new int[][] { var3, var3, var3 };
		} else {
			return this.field376[arg0].method7(arg1);
		}
	}

	@ObfuscatedName("c.b(B)V")
	public void method123() {
	}

	@ObfuscatedName("c.b(I)I")
	public int method124() {
		return -1;
	}

	@ObfuscatedName("c.b(IB)[[I")
	public int[][] method7(int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@ObfuscatedName("c.c(I)V")
	public void method127() {
		if (this.field369) {
			this.field379.method1081();
			this.field379 = null;
		} else {
			this.field364.method1531();
			this.field364 = null;
		}
	}

	@ObfuscatedName("c.a(BII)V")
	public final void method128(int arg0, int arg1) {
		int var3 = this.field363 == 255 ? arg1 : this.field363;
		if (this.field369) {
			this.field379 = new MonochromeImageCache(var3, arg1, arg0);
		} else {
			this.field364 = new ColorImageCache(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("c.d(I)I")
	public int method129() {
		return -1;
	}
}
