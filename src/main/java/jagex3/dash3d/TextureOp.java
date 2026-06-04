package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;
import jagex3.graphics.ColorImageCache;
import jagex3.graphics.MonochromeImageCache;
import jagex3.io.Packet;

@ObfuscatedName("c")
public abstract class TextureOp extends Linkable {

	@ObfuscatedName("c.D")
	public boolean monochrome;

	@ObfuscatedName("c.K")
	public final TextureOp[] inputs;

	@ObfuscatedName("c.x")
	public int opacity;

	@ObfuscatedName("c.N")
	public MonochromeImageCache monoCache;

	@ObfuscatedName("c.y")
	public ColorImageCache colorCache;

	public TextureOp(int arg0, boolean arg1) {
		this.monochrome = arg1;
		this.inputs = new TextureOp[arg0];
	}

	@ObfuscatedName("c.a(IB)[I")
	public int[] renderMono(int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@ObfuscatedName("c.a(IZI)[I")
	public final int[] getInputMono(int arg0, int arg1) {
		return this.inputs[arg1].monochrome ? this.inputs[arg1].renderMono(arg0) : this.inputs[arg1].renderColor(arg0)[0];
	}

	@ObfuscatedName("c.a(Lea;II)V")
	public void decode(Packet arg0, int arg1) {
	}

	@ObfuscatedName("c.a(IBI)[[I")
	public final int[][] getInputColor(int arg0, int arg1) {
		if (this.inputs[arg0].monochrome) {
			int[] var3 = this.inputs[arg0].renderMono(arg1);
			return new int[][] { var3, var3, var3 };
		} else {
			return this.inputs[arg0].renderColor(arg1);
		}
	}

	@ObfuscatedName("c.b(B)V")
	public void postDecode() {
	}

	@ObfuscatedName("c.b(I)I")
	public int getImageId() {
		return -1;
	}

	@ObfuscatedName("c.b(IB)[[I")
	public int[][] renderColor(int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@ObfuscatedName("c.c(I)V")
	public void clearCache() {
		if (this.monochrome) {
			this.monoCache.method1081();
			this.monoCache = null;
		} else {
			this.colorCache.method1531();
			this.colorCache = null;
		}
	}

	@ObfuscatedName("c.a(BII)V")
	public final void createCache(int arg0, int arg1) {
		int var3 = this.opacity == 255 ? arg1 : this.opacity;
		if (this.monochrome) {
			this.monoCache = new MonochromeImageCache(var3, arg1, arg0);
		} else {
			this.colorCache = new ColorImageCache(var3, arg1, arg0);
		}
	}

	@ObfuscatedName("c.d(I)I")
	public int getSpriteId() {
		return -1;
	}
}
