package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("ca")
public final class JavaPixMap extends PixMap {

	@ObfuscatedName("ca.t")
	public Component component;

	@ObfuscatedName("ca.a(Ljava/awt/Graphics;III)V")
	@Override
	public void draw(Graphics arg0) {
		arg0.drawImage(this.image, 0, 0, this.component);
	}

	@ObfuscatedName("ca.a(IIILjava/awt/Component;)V")
	@Override
	public void create(int arg0, int arg1, Component arg2) {
		this.height = arg0;
		this.width = arg1;
		this.data = new int[arg1 * arg0 + 1];
		DataBufferInt var4 = new DataBufferInt(this.data, this.data.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.width, this.height), var4, null);
		this.image = new BufferedImage(var5, var6, false, new Hashtable());
		this.component = arg2;
		this.bind();
	}

	@ObfuscatedName("ca.a(ILjava/awt/Graphics;IIII)V")
	@Override
	public void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.image, 0, 0, this.component);
		arg0.setClip(var6);
	}
}
