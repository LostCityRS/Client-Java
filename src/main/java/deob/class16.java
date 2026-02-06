package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("ca")
public final class class16 extends class48 {

	@ObfuscatedName("ca.t")
	public Component field332;

	@ObfuscatedName("ca.a(Ljava/awt/Graphics;III)V")
	@Override
	public void method122(Graphics arg0) {
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
	public void method124(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.field1121, 0, 0, this.field332);
		arg0.setClip(var6);
	}
}
