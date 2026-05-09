package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("db")
public final class JavaSafePixMap extends PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("db.y")
	public ColorModel colorModel;

	@ObfuscatedName("db.F")
	public ImageConsumer consumer;

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.consumer) {
			this.consumer = null;
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@ObfuscatedName("db.a(BIIIILjava/awt/Graphics;)V")
	@Override
	public void draw(int arg0, int arg1, int arg2, int arg3, Graphics arg4) {
		this.setPixels(arg0, arg2, arg1, arg3);
		Shape var6 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(super.image, 0, 0, this);
		arg4.setClip(var6);
	}

	@ObfuscatedName("db.a(IIZLjava/awt/Component;)V")
	@Override
	public void create(int arg0, int arg1, java.awt.Component arg2) {
		super.width = arg1;
		super.height = arg0;
		super.data = new int[arg0 * arg1 + 1];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		super.image = arg2.createImage(this);
		this.setPixels();
		arg2.prepareImage(super.image, this);
		this.setPixels();
		arg2.prepareImage(super.image, this);
		this.setPixels();
		arg2.prepareImage(super.image, this);
		this.bind();
	}

	@ObfuscatedName("db.d(I)V")
	public synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.data, 0, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@ObfuscatedName("db.a(IIILjava/awt/Graphics;)V")
	@Override
	public void draw(Graphics arg0) {
		this.setPixels();
		arg0.drawImage(super.image, 0, 0, this);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(super.width, super.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@ObfuscatedName("db.a(IIIII)V")
	public synchronized void setPixels(int arg0, int arg1, int arg2, int arg3) {
		if (this.consumer != null) {
			this.consumer.setPixels(arg3, arg1, arg2, arg0, this.colorModel, super.data, super.width * arg1 + arg3, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.consumer == arg0;
	}
}
