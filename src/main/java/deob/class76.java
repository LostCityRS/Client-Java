package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("gj")
public final class class76 extends PixMap {

	@ObfuscatedName("gj.q")
	public Component field1365;

	@ObfuscatedName("gj.a(IIZLjava/awt/Component;)V")
	@Override
	public void method243(int arg0, int arg1, Component arg2) {
		this.field4271 = arg0;
		this.field4269 = new int[arg0 * arg1 + 1];
		this.field4274 = arg1;
		DataBufferInt var4 = new DataBufferInt(this.field4269, this.field4269.length);
		DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4274, this.field4271), var4, null);
		this.field4272 = new BufferedImage(var5, var6, false, new Hashtable());
		this.field1365 = arg2;
		this.method1521();
	}

	@ObfuscatedName("gj.a(BIIIILjava/awt/Graphics;)V")
	@Override
	public void draw(int arg0, int arg1, int arg2, int arg3, Graphics arg4) {
		Shape var6 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(this.field4272, 0, 0, this.field1365);
		arg4.setClip(var6);
	}

	@ObfuscatedName("gj.a(IIILjava/awt/Graphics;)V")
	@Override
	public void method246(Graphics arg0) {
		arg0.drawImage(this.field4272, 0, 0, this.field1365);
	}
}
