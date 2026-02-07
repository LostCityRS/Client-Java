package jagex3.graphics;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("gf")
public abstract class PixMap {

	@ObfuscatedName("gf.b")
	public int field1120;

	@ObfuscatedName("gf.c")
	public Image field1121;

	@ObfuscatedName("gf.d")
	public int field1122;

	@ObfuscatedName("gf.f")
	public int[] field1124;

	@ObfuscatedName("t.a(IILjava/awt/Component;I)Lgf;")
	public static PixMap create(int arg0, int arg1, Component arg2) {
		try {
			Class var3 = Class.forName("ca");
			PixMap var4 = (PixMap) var3.getDeclaredConstructor().newInstance();
			var4.method123(arg0, arg1, arg2);
			return var4;
		} catch (Throwable var6) {
			JavaSafePixMap var5 = new JavaSafePixMap();
			var5.method123(arg0, arg1, arg2);
			return var5;
		}
	}

	@ObfuscatedName("gf.a(B)V")
	public final void method361() {
		Pix2D.method1052(this.field1124, this.field1120, this.field1122);
	}

	@ObfuscatedName("gf.a(Ljava/awt/Graphics;III)V")
	public abstract void draw(Graphics arg0);

	@ObfuscatedName("gf.a(IIILjava/awt/Component;)V")
	public abstract void method123(int arg0, int arg1, Component arg2);

	@ObfuscatedName("gf.a(ILjava/awt/Graphics;IIII)V")
	public abstract void draw(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
