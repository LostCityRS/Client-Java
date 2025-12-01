package jagex2.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("rb")
public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.a")
	public int[] data;

	@ObfuscatedName("rb.b")
	public int width;

	@ObfuscatedName("rb.c")
	public int height;

	@ObfuscatedName("rb.d")
	public ColorModel model;

	@ObfuscatedName("rb.e")
	public ImageConsumer ic;

	@ObfuscatedName("rb.f")
	public Image img;

	public PixMap(Component arg1, int arg2, int arg3) {
		this.width = arg2;
		this.height = arg3;
		this.data = new int[arg2 * arg3];
		this.model = new DirectColorModel(32, 16711680, 65280, 255);
		this.img = arg1.createImage(this);
		this.setPixels();
		arg1.prepareImage(this.img, this);
		this.setPixels();
		arg1.prepareImage(this.img, this);
		this.setPixels();
		arg1.prepareImage(this.img, this);
		this.bind();
	}

	@ObfuscatedName("rb.a(B)V")
	public void bind() {
		Pix2D.setPixels(this.height, this.data, this.width);
	}

	@ObfuscatedName("rb.a(IILjava/awt/Graphics;Z)V")
	public void draw(int arg0, int arg1, Graphics arg2) {
		this.setPixels();
		arg2.drawImage(this.img, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.ic = arg0;
		arg0.setDimensions(this.width, this.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.model);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.ic == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.ic == arg0) {
			this.ic = null;
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
		if (this.ic != null) {
			this.ic.setPixels(0, 0, this.width, this.height, this.model, this.data, 0, this.width);
			this.ic.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
