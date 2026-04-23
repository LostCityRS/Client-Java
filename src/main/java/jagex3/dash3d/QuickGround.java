package jagex3.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("rc")
public final class QuickGround {

	@ObfuscatedName("rc.j")
	public final int texture;

	@ObfuscatedName("rc.o")
	public final int field2641;

	@ObfuscatedName("rc.p")
	public final int minimapRgb;

	@ObfuscatedName("rc.s")
	public boolean flat = true;

	@ObfuscatedName("rc.u")
	public final int colourSW;

	@ObfuscatedName("rc.v")
	public final int field2648;

	@ObfuscatedName("rc.y")
	public final int colourNE;

	public QuickGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		this.colourSW = arg0;
		this.flat = arg6;
		this.field2641 = arg1;
		this.colourNE = arg2;
		this.texture = arg4;
		this.field2648 = arg3;
		this.minimapRgb = arg5;
	}
}
