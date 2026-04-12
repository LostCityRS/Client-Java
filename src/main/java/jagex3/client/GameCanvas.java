package jagex3.client;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("kb")
public final class GameCanvas extends Canvas {

	@ObfuscatedName("kb.c")
	public final Component field1543;

	@Override
	public void paint(Graphics arg0) {
		this.field1543.paint(arg0);
	}

	@Override
	public void update(Graphics arg0) {
		this.field1543.update(arg0);
	}

	public GameCanvas(Component arg0) {
		this.field1543 = arg0;
	}
}
