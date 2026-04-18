package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("ac")
public final class JavaSafePixMap extends PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("ac.E")
	public ColorModel colorModel;

	@ObfuscatedName("ac.H")
	public ImageConsumer consumer;

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.consumer == arg0;
	}

	@ObfuscatedName("ac.b(B)V")
	public synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.data, 0, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@ObfuscatedName("ac.a(IILjava/awt/Graphics;I)V")
	@Override
	public void draw(int arg0, Graphics arg1, int arg2) {
		this.setPixels();
		arg1.drawImage(super.image, arg0, arg2, this);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.consumer == arg0) {
			this.consumer = null;
		}
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(super.width, super.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@ObfuscatedName("ac.a(IILjava/awt/Component;I)V")
	@Override
	public void create(int arg0, Component arg1, int arg2) {
		super.data = new int[arg0 * arg2 + 1];
		super.width = arg0;
		super.height = arg2;
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		super.image = arg1.createImage(this);
		this.setPixels();
		arg1.prepareImage(super.image, this);
		this.setPixels();
		arg1.prepareImage(super.image, this);
		this.setPixels();
		arg1.prepareImage(super.image, this);
		this.bind();
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
