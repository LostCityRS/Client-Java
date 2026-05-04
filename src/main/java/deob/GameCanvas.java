package deob;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("fj")
public final class GameCanvas extends Canvas {

	@ObfuscatedName("fj.l")
	public final Component field1198;

	public GameCanvas(Component arg0) {
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
