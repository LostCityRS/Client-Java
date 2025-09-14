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
	public ColorModel model;

	@ObfuscatedName("rb.h")
	public ImageConsumer ic;

	@ObfuscatedName("rb.i")
	public Image img;

	public PixMap(int height, Component c, int width) {
		this.width = width;
		this.height = height;
		this.data = new int[width * height];
		this.model = new DirectColorModel(32, 16711680, 65280, 255);

		this.img = c.createImage(this);

		this.setPixels();
		c.prepareImage(this.img, this);

		this.setPixels();
		c.prepareImage(this.img, this);

		this.setPixels();
		c.prepareImage(this.img, this);

		this.bind();
	}

	@ObfuscatedName("rb.a(B)V")
	public void bind() {
		Pix2D.bind(this.data, this.width, this.height);
	}

	@ObfuscatedName("rb.a(IBLjava/awt/Graphics;I)V")
	public void draw(int x, Graphics g, int y) {
		this.setPixels();
		g.drawImage(this.img, x, y, this);
	}

	public synchronized void addConsumer(ImageConsumer ic) {
		this.ic = ic;

		ic.setDimensions(this.width, this.height);
		ic.setProperties(null);
		ic.setColorModel(this.model);
		ic.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer ic) {
		return this.ic == ic;
	}

	public synchronized void removeConsumer(ImageConsumer ic) {
		if (this.ic == ic) {
			this.ic = null;
		}
	}

	public void startProduction(ImageConsumer ic) {
		this.addConsumer(ic);
	}

	public void requestTopDownLeftRightResend(ImageConsumer ic) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void setPixels() {
		if (this.ic != null) {
			this.ic.setPixels(0, 0, this.width, this.height, this.model, this.data, 0, this.width);
			this.ic.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		return true;
	}
}
