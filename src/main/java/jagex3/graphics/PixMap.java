package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("wc")
public abstract class PixMap {

	@ObfuscatedName("wc.c")
	public int field3284;

	@ObfuscatedName("wc.e")
	public int field3286;

	@ObfuscatedName("wc.g")
	public int[] field3288;

	@ObfuscatedName("wc.k")
	public Image field3292;

	@ObfuscatedName("rb.a(IILjava/awt/Component;I)Lwc;")
	public static PixMap method875(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("jagex3.graphics.JavaPixMap");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.method106(arg1, arg2, arg0);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.method106(arg1, arg2, arg0);
			return var5;
		}
	}

	@ObfuscatedName("wc.a(B)V")
	public final void method1054() {
		Pix2D.method926(this.field3288, this.field3286, this.field3284);
	}

	@ObfuscatedName("wc.a(IILjava/awt/Component;I)V")
	public abstract void method106(int arg0, Component arg1, int arg2);

	@ObfuscatedName("wc.a(IILjava/awt/Graphics;I)V")
	public abstract void method101(int arg0, Graphics arg1, int arg2);
}
