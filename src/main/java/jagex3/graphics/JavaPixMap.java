package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("gj")
public final class JavaPixMap extends PixMap {

	@ObfuscatedName("gj.q")
	public Component component;

	@ObfuscatedName("gj.a(IIZLjava/awt/Component;)V")
	@Override
	public void create(int arg0, int arg1, Component arg2) {
		this.height = arg0;
		this.data = new int[arg0 * arg1 + 1];
		this.width = arg1;
		DataBufferInt var4 = new DataBufferInt(this.data, this.data.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.width, this.height), var4, null);
		this.image = new BufferedImage(var5, var6, false, new Hashtable());
		this.component = arg2;
		this.bind();
	}

	@ObfuscatedName("gj.a(BIIIILjava/awt/Graphics;)V")
	@Override
	public void draw(int arg0, int arg1, int arg2, int arg3, Graphics arg4) {
		Shape var6 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(this.image, 0, 0, this.component);
		arg4.setClip(var6);
	}

	@ObfuscatedName("gj.a(IIILjava/awt/Graphics;)V")
	@Override
	public void draw(Graphics arg0) {
		arg0.drawImage(this.image, 0, 0, this.component);
	}
}
