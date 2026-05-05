package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ih")
public final class QuickGround {

	@ObfuscatedName("ih.a")
	public final int colourNW;

	@ObfuscatedName("ih.c")
	public final int colourSW;

	@ObfuscatedName("ih.e")
	public final int texture;

	@ObfuscatedName("ih.h")
	public final int colourNE;

	@ObfuscatedName("ih.k")
	public boolean flat = true;

	@ObfuscatedName("ih.n")
	public final int minimapRgb;

	@ObfuscatedName("ih.o")
	public final int colourSE;

	public QuickGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.colourNW = arg3;
		this.flat = arg6;
		this.colourSW = arg0;
		this.colourSE = arg1;
		this.texture = arg4;
		this.minimapRgb = arg5;
		this.colourNE = arg2;
	}
}
