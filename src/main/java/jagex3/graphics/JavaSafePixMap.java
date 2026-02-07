package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("g")
public final class JavaSafePixMap extends PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("g.u")
	public ColorModel colorModel;

	@ObfuscatedName("g.K")
	public ImageConsumer consumer;

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.consumer == arg0;
	}

	@ObfuscatedName("g.a(Ljava/awt/Graphics;III)V")
	@Override
	public void draw(Graphics arg0) {
		this.setPixels();
		arg0.drawImage(super.image, 0, 0, this);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.consumer) {
			this.consumer = null;
		}
	}

	@ObfuscatedName("g.a(IIIII)V")
	public synchronized void setPixels(int arg0, int arg1, int arg2, int arg3) {
		if (this.consumer != null) {
			this.consumer.setPixels(arg0, arg3, arg1, arg2, this.colorModel, super.data, super.width * arg3 + arg0, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@ObfuscatedName("g.b(Z)V")
	public synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.data, 0, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@ObfuscatedName("g.a(IIILjava/awt/Component;)V")
	@Override
	public void create(int arg0, int arg1, Component arg2) {
		super.data = new int[arg1 * arg0 + 1];
		super.width = arg1;
		super.height = arg0;
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

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(super.width, super.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@ObfuscatedName("g.a(ILjava/awt/Graphics;IIII)V")
	@Override
	public void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		this.setPixels(arg3, arg1, arg2, arg4);
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(super.image, 0, 0, this);
		arg0.setClip(var6);
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
