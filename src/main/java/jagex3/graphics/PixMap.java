package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("gf")
public abstract class PixMap {

	@ObfuscatedName("gf.b")
	public int width;

	@ObfuscatedName("gf.c")
	public Image image;

	@ObfuscatedName("gf.d")
	public int height;

	@ObfuscatedName("gf.f")
	public int[] data;

	@ObfuscatedName("t.a(IILjava/awt/Component;I)Lgf;")
	public static PixMap createSafe(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("jagex3.graphics.JavaPixMap");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.create(arg0, arg1, arg2);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.create(arg0, arg1, arg2);
			return var5;
		}
	}

	@ObfuscatedName("gf.a(B)V")
	public final void bind() {
		Pix2D.setPixels(this.data, this.width, this.height);
	}

	@ObfuscatedName("gf.a(Ljava/awt/Graphics;III)V")
	public abstract void draw(Graphics arg0);

	@ObfuscatedName("gf.a(IIILjava/awt/Component;)V")
	public abstract void create(int arg0, int arg1, Component arg2);

	@ObfuscatedName("gf.a(ILjava/awt/Graphics;IIII)V")
	public abstract void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
