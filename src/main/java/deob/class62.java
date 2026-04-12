package deob;

import java.awt.*;

@ObfuscatedName("kb")
public final class class62 extends Canvas {

	@ObfuscatedName("kb.a")
	public static byte[][] field1541 = new byte[50][];

	@ObfuscatedName("kb.c")
	public final Component field1543;

	@ObfuscatedName("kb.g")
	public static class92 field1547 = new class92();

	@ObfuscatedName("kb.h")
	public static int field1548 = 0;

	@ObfuscatedName("kb.i")
	public static class1 field1549 = Statics.method931("shake:");

	@ObfuscatedName("kb.e")
	public static class1 field1545 = field1549;

	@ObfuscatedName("kb.n")
	public static int field1554 = 255;

	@ObfuscatedName("kb.s")
	public static int field1559 = 127;

	@ObfuscatedName("kb.v")
	public static class1 field1562 = Statics.method931("k");

	@ObfuscatedName("kb.w")
	public static class1 field1563 = Statics.method931("Your profile will be transferred in:");

	@ObfuscatedName("kb.u")
	public static class1 field1561 = field1563;

	@ObfuscatedName("kb.x")
	public static class1 field1564 = Statics.method931("Prepared visibility map");

	@ObfuscatedName("kb.q")
	public static class1 field1557 = field1564;

	@Override
	public void paint(Graphics arg0) {
		this.field1543.paint(arg0);
	}

	@Override
	public void update(Graphics arg0) {
		this.field1543.update(arg0);
	}

	public class62(Component arg0) {
		this.field1543 = arg0;
	}
}
