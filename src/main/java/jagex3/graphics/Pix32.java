package jagex3.graphics;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;

@ObfuscatedName("rc")
public abstract class Pix32 extends Linkable2 {

	@ObfuscatedName("rc.D")
	public int xof;

	@ObfuscatedName("rc.F")
	public int ohi;

	@ObfuscatedName("rc.J")
	public int owi;

	@ObfuscatedName("rc.M")
	public int hi;

	@ObfuscatedName("rc.N")
	public int yof;

	@ObfuscatedName("rc.O")
	public int wi;

	@ObfuscatedName("rc.a(IIII)V")
	public abstract void scalePlotSprite(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("rc.b(II)V")
	public abstract void quickPlotSprite(int arg0, int arg1);

	@ObfuscatedName("rc.a(IIIIII)V")
	public abstract void pixelPerfectRotateScalePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	@ObfuscatedName("rc.a(ZIIII)V")
	public final void pixelPerfectRotateScalePlotSprite(int arg0, int arg1, int arg2, int arg3) {
		int var5 = this.ohi << 3;
		int var6 = (var5 & 0xF) + (arg0 << 4);
		int var7 = this.owi << 3;
		int var8 = (var7 & 0xF) + (arg1 << 4);
		this.pixelPerfectRotateScalePlotSprite(var7, var5, var8, var6, arg3, arg2);
	}

	@ObfuscatedName("rc.a(IIIII)V")
	public abstract void transScalePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4);

	@ObfuscatedName("rc.a(III)V")
	public abstract void transPlotSprite(int arg0, int arg1, int arg2);

	@ObfuscatedName("rc.b(IIII)V")
	public abstract void litPlotSprite(int arg0, int arg1);

	@ObfuscatedName("rc.c(II)V")
	public abstract void plotSprite(int arg0, int arg1);
}
