package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("db")
public final class class36 extends class228 implements ImageProducer, ImageObserver {

	@ObfuscatedName("db.bb")
	public static final class88 field659 = class208.method1423(105, "Nov");

	@ObfuscatedName("db.db")
	public static final class88 field661 = class208.method1423(105, "Jun");

	@ObfuscatedName("db.r")
	public static long field623 = 0L;

	@ObfuscatedName("db.s")
	public static final class88 field624 = class208.method1423(105, "Jul");

	@ObfuscatedName("db.t")
	public static int field625 = 0;

	@ObfuscatedName("db.w")
	public static final class88 field628 = class208.method1423(105, "Dec");

	@ObfuscatedName("db.A")
	public static final class88 field632 = class208.method1423(105, "Aug");

	@ObfuscatedName("db.M")
	public static final class88 field644 = class208.method1423(105, " <col=ffffff>");

	@ObfuscatedName("db.V")
	public static final class88 field653 = class208.method1423(105, "Sep");

	@ObfuscatedName("db.L")
	public static final class88 field643 = class208.method1423(105, "Mar");

	@ObfuscatedName("db.N")
	public static final class88 field645 = class208.method1423(105, "Jan");

	@ObfuscatedName("db.R")
	public static final class88 field649 = class208.method1423(105, "Fallen lassen");

	@ObfuscatedName("db.T")
	public static final class88 field651 = class208.method1423(105, "settings=");

	@ObfuscatedName("db.I")
	public static final class88 field640 = class208.method1423(105, "Oct");

	@ObfuscatedName("db.K")
	public static final class88 field642 = class208.method1423(105, "Feb");

	@ObfuscatedName("db.U")
	public static final class88 field652 = class208.method1423(105, "Apr");

	@ObfuscatedName("db.Y")
	public static final class88 field656 = class208.method1423(105, "May");

	@ObfuscatedName("db.z")
	public static long field631;

	@ObfuscatedName("db.B")
	public static class144 field633;

	@ObfuscatedName("db.D")
	public static class174 field635;

	@ObfuscatedName("db.y")
	public ColorModel field630;

	@ObfuscatedName("db.F")
	public ImageConsumer field637;

	@ObfuscatedName("db.ab")
	public static final class88[] field658 = new class88[] { field645, field642, field643, field652, field656, field661, field624, field632, field653, field640, field659, field628 };

	@ObfuscatedName("db.a(IIZ)Lq;")
	public static class174 method238(int arg0, int arg1) {
		class174 var2 = class239.method1579(arg1);
		if (arg0 == -1) {
			return var2;
		} else if (var2 == null || var2.field3465 == null || var2.field3465.length <= arg0) {
			return null;
		} else {
			return var2.field3465[arg0];
		}
	}

	@ObfuscatedName("db.a(IZ)V")
	public static void method239() {
		byte[][] var0 = class167.field3221;
		for (int var1 = 0; var1 < 4; var1++) {
			class219.method1479();
			for (int var2 = 0; var2 < 13; var2++) {
				for (int var3 = 0; var3 < 13; var3++) {
					boolean var4 = false;
					int var5 = class111.field2024[var1][var2][var3];
					if (var5 != -1) {
						int var6 = var5 >> 24 & 0x3;
						int var7 = var5 >> 14 & 0x3FF;
						int var8 = var5 >> 1 & 0x3;
						int var9 = var5 >> 3 & 0x7FF;
						int var10 = var9 / 8 + (var7 / 8 << 8);
						for (int var11 = 0; var11 < class146.field2731.length; var11++) {
							if (var10 == class146.field2731[var11] && var0[var11] != null) {
								class64.method449(var2 * 8, var8, (var7 & 0x7) * 8, (var9 & 0x7) * 8, class166.field3200, var6, var0[var11], var3 * 8, var1);
								var4 = true;
								break;
							}
						}
					}
					if (!var4) {
						class17.method83(var1, 8, 8, var3 * 8, var2 * 8);
					}
				}
			}
		}
	}

	@ObfuscatedName("db.a(B[B)Lcc;")
	public static class26 method241(byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			class41 var1 = new class41(arg0, class247.field4528, class135.field2510, class102.field1851, class67.field1218, class116.field2104);
			class239.method1578();
			return var1;
		}
	}

	@ObfuscatedName("db.a([BZILud;)V")
	public static void method244(byte[] arg0, int arg1, class222 arg2) {
		class90 var3 = new class90();
		var3.field1713 = arg2;
		var3.field1705 = arg0;
		var3.field1701 = 0;
		var3.field1219 = arg1;
		class248 var4 = class227.field4252;
		synchronized (class227.field4252) {
			class227.field4252.method1622(var3);
		}
		class146.method977();
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (arg0 == this.field637) {
			this.field637 = null;
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}

	@ObfuscatedName("db.a(BIIIILjava/awt/Graphics;)V")
	@Override
	public void method242(int arg0, int arg1, int arg2, int arg3, Graphics arg4) {
		this.method247(arg0, arg2, arg1, arg3);
		Shape var6 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(super.field4272, 0, 0, this);
		arg4.setClip(var6);
	}

	@ObfuscatedName("db.a(IIZLjava/awt/Component;)V")
	@Override
	public void method243(int arg0, int arg1, Component arg2) {
		super.field4274 = arg1;
		super.field4271 = arg0;
		super.field4269 = new int[arg0 * arg1 + 1];
		this.field630 = new DirectColorModel(32, 16711680, 65280, 255);
		super.field4272 = arg2.createImage(this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method245();
		arg2.prepareImage(super.field4272, this);
		this.method1521();
	}

	@ObfuscatedName("db.d(I)V")
	public synchronized void method245() {
		if (this.field637 != null) {
			this.field637.setPixels(0, 0, super.field4274, super.field4271, this.field630, super.field4269, 0, super.field4274);
			this.field637.imageComplete(2);
		}
	}

	@ObfuscatedName("db.a(IIILjava/awt/Graphics;)V")
	@Override
	public void method246(Graphics arg0) {
		this.method245();
		arg0.drawImage(super.field4272, 0, 0, this);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field637 = arg0;
		arg0.setDimensions(super.field4274, super.field4271);
		arg0.setProperties(null);
		arg0.setColorModel(this.field630);
		arg0.setHints(14);
	}

	@ObfuscatedName("db.a(IIIII)V")
	public synchronized void method247(int arg0, int arg1, int arg2, int arg3) {
		if (this.field637 != null) {
			this.field637.setPixels(arg3, arg1, arg2, arg0, this.field630, super.field4269, super.field4274 * arg1 + arg3, super.field4274);
			this.field637.imageComplete(2);
		}
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field637 == arg0;
	}
}
