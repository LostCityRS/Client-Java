package deob;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

@ObfuscatedName("db")
public final class JavaSafePixMap extends PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("db.y")
	public ColorModel field630;

	@ObfuscatedName("db.F")
	public ImageConsumer field637;

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.field637) {
			this.field637 = null;
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@ObfuscatedName("db.a(BIIIILjava/awt/Graphics;)V")
	@Override
	public void draw(int arg0, int arg1, int arg2, int arg3, Graphics arg4) {
		this.method247(arg0, arg2, arg1, arg3);
		Shape var6 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(super.field4272, 0, 0, this);
		arg4.setClip(var6);
	}

	@ObfuscatedName("db.a(IIZLjava/awt/Component;)V")
	@Override
	public void method243(int arg0, int arg1, java.awt.Component arg2) {
		super.field4274 = arg1;
		super.field4271 = arg0;
		super.field4269 = new int[arg0 * arg1 + 1];
		this.field630 = new DirectColorModel(32, 16711680, 65280, 255);
		super.field4272 = arg2.createImage(this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method1521();
	}

	@ObfuscatedName("db.d(I)V")
	public synchronized void method245() {
		if (this.field637 != null) {
			this.field637.setPixels(0, 0, super.field4274, super.field4271, this.field630, super.field4269, 0, super.field4274);
			this.field637.imageComplete(2);
		}
	}

	@ObfuscatedName("db.a(IIILjava/awt/Graphics;)V")
	@Override
	public void method246(Graphics arg0) {
		this.method245();
		arg0.drawImage(super.field4272, 0, 0, this);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field637 = arg0;
		arg0.setDimensions(super.field4274, super.field4271);
		arg0.setProperties(null);
		arg0.setColorModel(this.field630);
		arg0.setHints(14);
	}

	@ObfuscatedName("db.a(IIIII)V")
	public synchronized void method247(int arg0, int arg1, int arg2, int arg3) {
		if (this.field637 != null) {
			this.field637.setPixels(arg3, arg1, arg2, arg0, this.field630, super.field4269, super.field4274 * arg1 + arg3, super.field4274);
			this.field637.imageComplete(2);
		}
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field637 == arg0;
	}
}
