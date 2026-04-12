package deob;

import java.awt.*;
import java.awt.image.*;

@ObfuscatedName("ac")
public final class class4 extends class134 implements ImageProducer, ImageObserver {

	@ObfuscatedName("ac.I")
	public static class1 field172 = Statics.method931("Name eingeben:");

	@ObfuscatedName("ac.J")
	public static int[] field173 = new int[32];

	@ObfuscatedName("ac.S")
	public static int[] field181 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("ac.W")
	public static int field185;

	@ObfuscatedName("ac.X")
	public static class1 field186;

	@ObfuscatedName("ac.U")
	public static class1 field183;

	@ObfuscatedName("ac.E")
	public ColorModel field168;

	@ObfuscatedName("ac.H")
	public ImageConsumer field171;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field173[var1] = var0 - 1;
			var0 += var0;
		}
		field185 = 2;
		field186 = Statics.method931("Login server offline)3");
		field183 = field186;
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field171 == arg0;
	}

	@ObfuscatedName("ac.b(B)V")
	public synchronized void method100() {
		if (this.field171 != null) {
			this.field171.setPixels(0, 0, super.field3286, super.field3284, this.field168, super.field3288, 0, super.field3286);
			this.field171.imageComplete(2);
		}
	}

	@ObfuscatedName("ac.a(IILjava/awt/Graphics;I)V")
	@Override
	public void method101(int arg0, Graphics arg1, int arg2) {
		this.method100();
		arg1.drawImage(super.field3292, arg0, arg2, this);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field171 == arg0) {
			this.field171 = null;
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
		this.field171 = arg0;
		arg0.setDimensions(super.field3286, super.field3284);
		arg0.setProperties(null);
		arg0.setColorModel(this.field168);
		arg0.setHints(14);
	}

	@ObfuscatedName("ac.a(IILjava/awt/Component;I)V")
	@Override
	public void method106(int arg0, Component arg1, int arg2) {
		super.field3288 = new int[arg0 * arg2 + 1];
		super.field3286 = arg0;
		super.field3284 = arg2;
		this.field168 = new DirectColorModel(32, 16711680, 65280, 255);
		super.field3292 = arg1.createImage(this);
		this.method100();
		arg1.prepareImage(super.field3292, this);
		this.method100();
		arg1.prepareImage(super.field3292, this);
		this.method100();
		arg1.prepareImage(super.field3292, this);
		this.method1054();
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}
}
