package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

@ObfuscatedName("fj")
public final class class66 extends Canvas {

	@ObfuscatedName("fj.b")
	public static final class88 field1188 = class208.method1423(105, "");

	@ObfuscatedName("fj.e")
	public static final class88[] field1191 = new class88[500];

	@ObfuscatedName("fj.f")
	public static int field1192 = 0;

	@ObfuscatedName("fj.g")
	public static class22 field1193;

	@ObfuscatedName("fj.h")
	public static final int[] field1194 = new int[5];

	@ObfuscatedName("fj.i")
	public static final class88 field1195 = class208.method1423(105, "Zu viele Verbindungen von Ihrer Adresse)3");

	@ObfuscatedName("fj.j")
	public static final class248 field1196 = new class248();

	@ObfuscatedName("fj.l")
	public final Component field1198;

	@ObfuscatedName("fj.m")
	public static class144 field1199;

	@ObfuscatedName("fj.n")
	public static int field1200;

	@ObfuscatedName("fj.o")
	public static final class88 field1201 = class208.method1423(105, "Bitte versuchen Sie es erneut)3");

	@ObfuscatedName("fj.p")
	public static int field1202;

	@ObfuscatedName("fj.a(Ljava/awt/event/KeyEvent;I)I")
	public static int method455(KeyEvent arg0) {
		int var1 = arg0.getKeyChar();
		if (var1 == 8364) {
			return 128;
		} else {
			if (var1 <= 0 || var1 >= 256) {
				var1 = -1;
			}
			return var1;
		}
	}

	public class66(Component arg0) {
		this.field1198 = arg0;
	}

	@Override
	public void update(Graphics arg0) {
		this.field1198.update(arg0);
	}

	@Override
	public void paint(Graphics arg0) {
		this.field1198.paint(arg0);
	}
}
