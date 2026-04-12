package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("qe")
public final class JavaPixMap extends PixMap {

	@ObfuscatedName("qe.B")
	public Component field2558;

	@ObfuscatedName("qe.a(IILjava/awt/Graphics;I)V")
	@Override
	public void method101(int arg0, Graphics arg1, int arg2) {
		arg1.drawImage(this.field3292, arg0, arg2, this.field2558);
	}

	@ObfuscatedName("qe.a(IILjava/awt/Component;I)V")
	@Override
	public void method106(int arg0, Component arg1, int arg2) {
		this.field3286 = arg0;
		this.field3288 = new int[arg0 * arg2 + 1];
		this.field3284 = arg2;
		DataBufferInt var4 = new DataBufferInt(this.field3288, this.field3288.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field3286, this.field3284), var4, null);
		this.field3292 = new BufferedImage(var5, var6, false, new Hashtable());
		this.field2558 = arg1;
		this.method1054();
	}
}
