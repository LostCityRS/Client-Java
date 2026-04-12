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

	@ObfuscatedName("kb.i")
	public static JagString field1549 = JagString.wrap("shake:");

	@ObfuscatedName("kb.e")
	public static JagString field1545 = field1549;

	@ObfuscatedName("kb.n")
	public static int field1554 = 255;

	@ObfuscatedName("kb.s")
	public static int field1559 = 127;

	@ObfuscatedName("kb.v")
	public static JagString field1562 = JagString.wrap("k");

	@ObfuscatedName("kb.w")
	public static JagString field1563 = JagString.wrap("Your profile will be transferred in:");

	@ObfuscatedName("kb.u")
	public static JagString field1561 = field1563;

	@ObfuscatedName("kb.x")
	public static JagString field1564 = JagString.wrap("Prepared visibility map");

	@ObfuscatedName("kb.q")
	public static JagString field1557 = field1564;

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
