package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("wc")
public abstract class PixMap {

	@ObfuscatedName("wc.c")
	public int height;

	@ObfuscatedName("wc.e")
	public int width;

	@ObfuscatedName("wc.g")
	public int[] data;

	@ObfuscatedName("wc.k")
	public Image image;

	@ObfuscatedName("rb.a(IILjava/awt/Component;I)Lwc;")
	public static PixMap createSafe(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("jagex3.graphics.JavaPixMap");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.create(arg1, arg2, arg0);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.create(arg1, arg2, arg0);
			return var5;
		}
	}

	@ObfuscatedName("wc.a(B)V")
	public final void bind() {
		Pix2D.setPixels(this.data, this.width, this.height);
	}

	@ObfuscatedName("wc.a(IILjava/awt/Component;I)V")
	public abstract void create(int arg0, Component arg1, int arg2);

	@ObfuscatedName("wc.a(IILjava/awt/Graphics;I)V")
	public abstract void draw(int arg0, Graphics arg1, int arg2);
}
