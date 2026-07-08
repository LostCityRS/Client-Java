package jagex2.graphics;

import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("qb")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("qb.b")
	public final int[] data;

	@ObfuscatedName("qb.c")
	public final int width;

	@ObfuscatedName("qb.d")
	public final int height;

	@ObfuscatedName("qb.g")
	public final Image image;

	@ObfuscatedName("qb.a")
	public final int field747 = 831;

	@ObfuscatedName("qb.e")
	public final ColorModel colorModel;

	@ObfuscatedName("qb.f")
	public ImageConsumer imageConsumer;

	public PixMap(Component arg0, int arg1, int arg2, int arg3) {
		width = arg1;
		height = arg2;
		data = new int[arg1 * arg2];
		colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		image = arg0.createImage(this);
		consumerSetPixels();
		arg0.prepareImage(image, this);
		consumerSetPixels();
		arg0.prepareImage(image, this);
		consumerSetPixels();
		arg0.prepareImage(image, this);
		setPixels();
	}

	@ObfuscatedName("qb.a(IIILjava/awt/Graphics;)V")
	public void draw(int arg0, int arg1, Graphics arg2) {
		consumerSetPixels();
		arg2.drawImage(image, arg0, arg1, this);
	}

	@ObfuscatedName("qb.a(B)V")
	public void setPixels() {
		Pix2D.setPixels(data, width, height);
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		imageConsumer = arg0;
		arg0.setDimensions(width, height);
		arg0.setProperties(null);
		arg0.setColorModel(colorModel);
		arg0.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return imageConsumer == arg0;
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (imageConsumer == arg0) {
			imageConsumer = null;
		}
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void consumerSetPixels() {
		if (imageConsumer != null) {
			imageConsumer.setPixels(0, 0, width, height, colorModel, data, 0, width);
			imageConsumer.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
