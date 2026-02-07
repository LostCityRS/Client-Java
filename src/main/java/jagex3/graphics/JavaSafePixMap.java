package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("g")
public final class JavaSafePixMap extends PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("g.u")
	public ColorModel field984;

	@ObfuscatedName("g.K")
	public ImageConsumer field999;

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field999 == arg0;
	}

	@ObfuscatedName("g.a(Ljava/awt/Graphics;III)V")
	@Override
	public void draw(Graphics arg0) {
		this.method334();
		arg0.drawImage(super.field1121, 0, 0, this);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.field999) {
			this.field999 = null;
		}
	}

	@ObfuscatedName("g.a(IIIII)V")
	public synchronized void method332(int arg0, int arg1, int arg2, int arg3) {
		if (this.field999 != null) {
			this.field999.setPixels(arg0, arg3, arg1, arg2, this.field984, super.field1124, super.field1120 * arg3 + arg0, super.field1120);
			this.field999.imageComplete(2);
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
	public synchronized void method334() {
		if (this.field999 != null) {
			this.field999.setPixels(0, 0, super.field1120, super.field1122, this.field984, super.field1124, 0, super.field1120);
			this.field999.imageComplete(2);
		}
	}

	@ObfuscatedName("g.a(IIILjava/awt/Component;)V")
	@Override
	public void method123(int arg0, int arg1, Component arg2) {
		super.field1124 = new int[arg1 * arg0 + 1];
		super.field1120 = arg1;
		super.field1122 = arg0;
		this.field984 = new DirectColorModel(32, 16711680, 65280, 255);
		super.field1121 = arg2.createImage(this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method334();
		arg2.prepareImage(super.field1121, this);
		this.method361();
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field999 = arg0;
		arg0.setDimensions(super.field1120, super.field1122);
		arg0.setProperties(null);
		arg0.setColorModel(this.field984);
		arg0.setHints(14);
	}

	@ObfuscatedName("g.a(ILjava/awt/Graphics;IIII)V")
	@Override
	public void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method332(arg3, arg1, arg2, arg4);
		Shape var6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(super.field1121, 0, 0, this);
		arg0.setClip(var6);
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
