package deob;

import java.awt.*;

@ObfuscatedName("kb")
public final class class62 extends Canvas {

	@ObfuscatedName("kb.a")
	public static byte[][] field1541 = new byte[50][];

	@ObfuscatedName("kb.c")
	public final Component field1543;

	@ObfuscatedName("kb.g")
	public static LinkList field1547 = new LinkList();

	@ObfuscatedName("kb.h")
	public static int field1548 = 0;

	@ObfuscatedName("kb.n")
	public static int field1554 = 255;

	@ObfuscatedName("kb.s")
	public static int field1559 = 127;

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
