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

	public PixMap(int width, int height, Component c) {
		this.width = width;
		this.height = height;
		this.data = new int[height * width];
		this.colorModel = new DirectColorModel(32, 0xff0000, 0x00ff00, 0x0000ff);

		this.image = c.createImage(this);

		this.setPixels();
		c.prepareImage(this.image, this);

		this.setPixels();
		c.prepareImage(this.image, this);

		this.setPixels();
		c.prepareImage(this.image, this);

		this.bind();
	}

	@ObfuscatedName("rb.a(I)V")
	public void bind() {
		Pix2D.bind(this.width, this.data, this.height);
	}

	@ObfuscatedName("rb.a(Ljava/awt/Graphics;IBI)V")
	public void draw(Graphics g, int x, int y) {
		this.setPixels();
		g.drawImage(this.image, x, y, this);
	}

	public synchronized void addConsumer(ImageConsumer c) {
		this.consumer = c;
		c.setDimensions(this.width, this.height);
		c.setProperties(null);
		c.setColorModel(this.colorModel);
		c.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer c) {
		return this.consumer == c;
	}

	public synchronized void removeConsumer(ImageConsumer c) {
		if (this.consumer == c) {
			this.consumer = null;
		}
	}

	public void startProduction(ImageConsumer c) {
		this.addConsumer(c);
	}

	public void requestTopDownLeftRightResend(ImageConsumer c) {
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
