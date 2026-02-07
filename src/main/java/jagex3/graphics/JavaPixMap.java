package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

@ObfuscatedName("ca")
public final class JavaPixMap extends PixMap {

	@ObfuscatedName("ca.t")
	public Component field332;

	@ObfuscatedName("ca.a(Ljava/awt/Graphics;III)V")
	@Override
	public void draw(Graphics arg0) {
		arg0.drawImage(this.field1121, 0, 0, this.field332);
	}

	@ObfuscatedName("ca.a(IIILjava/awt/Component;)V")
	@Override
	public void method123(int arg0, int arg1, Component arg2) {
		this.field1122 = arg0;
		this.field1120 = arg1;
		this.field1124 = new int[arg1 * arg0 + 1];
		DataBufferInt var4 = new DataBufferInt(this.field1124, this.field1124.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1120, this.field1122), var4, null);
		this.field1121 = new BufferedImage(var5, var6, false, new Hashtable());
		this.field332 = arg2;
		this.method361();
	}

	@ObfuscatedName("ca.a(ILjava/awt/Graphics;IIII)V")
	@Override
	public void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.field1121, 0, 0, this.field332);
		arg0.setClip(var6);
	}
}
