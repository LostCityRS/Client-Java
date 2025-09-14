package jagex2.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("rb")
public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.d")
	public int[] data;

	@ObfuscatedName("rb.e")
	public int width;

	@ObfuscatedName("rb.f")
	public int height;

	@ObfuscatedName("rb.g")
	public ColorModel colorModel;

	@ObfuscatedName("rb.h")
	public ImageConsumer consumer;

	@ObfuscatedName("rb.i")
	public Image image;

	public PixMap(int arg0, Component arg1, int arg3) {
		this.width = arg3;
		this.height = arg0;
		this.data = new int[arg3 * arg0];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.image = arg1.createImage(this);
		this.setPixels();
		arg1.prepareImage(this.image, this);
		this.setPixels();
		arg1.prepareImage(this.image, this);
		this.setPixels();
		arg1.prepareImage(this.image, this);
		this.bind();
	}

	@ObfuscatedName("rb.a(B)V")
	public void bind() {
		Pix2D.bind(this.data, this.width, this.height);
	}

	@ObfuscatedName("rb.a(IBLjava/awt/Graphics;I)V")
	public void draw(int arg0, Graphics arg2, int arg3) {
		this.setPixels();
		arg2.drawImage(this.image, arg0, arg3, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(this.width, this.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.consumer == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.consumer == arg0) {
			this.consumer = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.data, 0, this.width);
			this.consumer.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
