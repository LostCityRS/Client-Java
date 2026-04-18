package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("qe")
public final class JavaPixMap extends PixMap {

	@ObfuscatedName("qe.B")
	public Component component;

	@ObfuscatedName("qe.a(IILjava/awt/Graphics;I)V")
	@Override
	public void draw(int arg0, Graphics arg1, int arg2) {
		arg1.drawImage(this.image, arg0, arg2, this.component);
	}

	@ObfuscatedName("qe.a(IILjava/awt/Component;I)V")
	@Override
	public void create(int arg0, Component arg1, int arg2) {
		this.width = arg0;
		this.data = new int[arg0 * arg2 + 1];
		this.height = arg2;
		DataBufferInt var4 = new DataBufferInt(this.data, this.data.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.width, this.height), var4, null);
		this.image = new BufferedImage(var5, var6, false, new Hashtable());
		this.component = arg1;
		this.bind();
	}
}
