package jagex2.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

@ObfuscatedName("rb")
public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.c")
	public int[] data;

	@ObfuscatedName("rb.d")
	public int width;

	@ObfuscatedName("rb.e")
	public int height;

	@ObfuscatedName("rb.f")
	public ColorModel colorModel;

	@ObfuscatedName("rb.g")
	public ImageConsumer consumer;

	@ObfuscatedName("rb.h")
	public Image image;

	public PixMap(Component arg0, int arg1, int arg2) {
		this.width = arg2;
		this.height = arg1;
		this.data = new int[arg1 * arg2];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.image = arg0.createImage(this);
		this.setPixels();
		arg0.prepareImage(this.image, this);
		this.setPixels();
		arg0.prepareImage(this.image, this);
		this.setPixels();
		arg0.prepareImage(this.image, this);
		this.bind();
	}

	@ObfuscatedName("rb.a(I)V")
	public void bind() {
		Pix2D.bind(this.width, this.data, this.height);
	}

	@ObfuscatedName("rb.a(Ljava/awt/Graphics;IBI)V")
	public void draw(Graphics arg0, int arg1, int arg3) {
		this.setPixels();
		arg0.drawImage(this.image, arg3, arg1, this);
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
