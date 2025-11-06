package jagex2.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("rb")
public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.a")
	public int[] field749;

	@ObfuscatedName("rb.b")
	public int field750;

	@ObfuscatedName("rb.c")
	public int field751;

	@ObfuscatedName("rb.d")
	public ColorModel field752;

	@ObfuscatedName("rb.e")
	public ImageConsumer field753;

	@ObfuscatedName("rb.f")
	public Image field754;

	public PixMap(Component arg1, int arg2, int arg3) {
		this.field750 = arg2;
		this.field751 = arg3;
		this.field749 = new int[arg2 * arg3];
		this.field752 = new DirectColorModel(32, 16711680, 65280, 255);
		this.field754 = arg1.createImage(this);
		this.method270();
		arg1.prepareImage(this.field754, this);
		this.method270();
		arg1.prepareImage(this.field754, this);
		this.method270();
		arg1.prepareImage(this.field754, this);
		this.method268();
	}

	@ObfuscatedName("rb.a(B)V")
	public void method268() {
		Pix2D.method165(this.field751, this.field749, this.field750);
	}

	@ObfuscatedName("rb.a(IILjava/awt/Graphics;Z)V")
	public void method269(int arg0, int arg1, Graphics arg2) {
		this.method270();
		arg2.drawImage(this.field754, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field753 = arg0;
		arg0.setDimensions(this.field750, this.field751);
		arg0.setProperties(null);
		arg0.setColorModel(this.field752);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field753 == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field753 == arg0) {
			this.field753 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method270() {
		if (this.field753 != null) {
			this.field753.setPixels(0, 0, this.field750, this.field751, this.field752, this.field749, 0, this.field750);
			this.field753.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
