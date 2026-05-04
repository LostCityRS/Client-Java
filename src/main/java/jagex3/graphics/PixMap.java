package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("uj")
public abstract class PixMap {

	@ObfuscatedName("uj.c")
	public int[] field4269;

	@ObfuscatedName("uj.e")
	public int field4271;

	@ObfuscatedName("uj.f")
	public Image field4272;

	@ObfuscatedName("uj.h")
	public int field4274;

	@ObfuscatedName("qb.a(IILjava/awt/Component;I)Luj;")
	public static PixMap method1259(int arg0, Component arg1, int arg2) {
		try {
			Class var3 = Class.forName("jagex3.graphics.JavaPixMap");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.method243(arg2, arg0, arg1);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.method243(arg2, arg0, arg1);
			return var5;
		}
	}

	@ObfuscatedName("uj.a(I)V")
	public final void method1521() {
		Pix2D.method496(this.field4269, this.field4274, this.field4271);
	}

	@ObfuscatedName("uj.a(IIZLjava/awt/Component;)V")
	public abstract void method243(int arg0, int arg1, Component arg2);

	@ObfuscatedName("uj.a(BIIIILjava/awt/Graphics;)V")
	public abstract void draw(int arg0, int arg1, int arg2, int arg3, Graphics arg4);

	@ObfuscatedName("uj.a(IIILjava/awt/Graphics;)V")
	public abstract void method246(Graphics arg0);
}
