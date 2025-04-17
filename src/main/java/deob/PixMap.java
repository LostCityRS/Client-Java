package deob;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("rb")
public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.a")
	public int field755;

	@ObfuscatedName("rb.b")
	public boolean field756 = true;

	@ObfuscatedName("rb.c")
	public int[] field757;

	@ObfuscatedName("rb.d")
	public int field758;

	@ObfuscatedName("rb.e")
	public int field759;

	@ObfuscatedName("rb.f")
	public ColorModel field760;

	@ObfuscatedName("rb.g")
	public ImageConsumer field761;

	@ObfuscatedName("rb.h")
	public Image field762;

	public PixMap(java.awt.Component arg0, int arg1, int arg2, int arg3) {
		this.field758 = arg2;
		this.field759 = arg1;
		if (arg3 != 2) {
			this.field756 = !this.field756;
		}
		this.field757 = new int[arg1 * arg2];
		this.field760 = new DirectColorModel(32, 16711680, 65280, 255);
		this.field762 = arg0.createImage(this);
		this.method269();
		arg0.prepareImage(this.field762, this);
		this.method269();
		arg0.prepareImage(this.field762, this);
		this.method269();
		arg0.prepareImage(this.field762, this);
		this.method267(212);
	}

	@ObfuscatedName("rb.a(I)V")
	public void method267(int arg0) {
		Pix2D.method164(this.field758, 2, this.field757, this.field759);
		int var2 = 64 / arg0;
	}

	@ObfuscatedName("rb.a(Ljava/awt/Graphics;IBI)V")
	public void method268(Graphics arg0, int arg1, byte arg2, int arg3) {
		this.method269();
		if (arg2 != 55) {
			this.field755 = 41;
		}
		arg0.drawImage(this.field762, arg3, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field761 = arg0;
		arg0.setDimensions(this.field758, this.field759);
		arg0.setProperties(null);
		arg0.setColorModel(this.field760);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field761 == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field761 == arg0) {
			this.field761 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method269() {
		if (this.field761 != null) {
			this.field761.setPixels(0, 0, this.field758, this.field759, this.field760, this.field757, 0, this.field758);
			this.field761.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
