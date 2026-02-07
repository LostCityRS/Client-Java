package jagex3.client;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("he")
public final class GameCanvas extends Canvas {

	@ObfuscatedName("he.p")
	public final Component component;

	public GameCanvas(Component arg0) {
		this.component = arg0;
	}

	@Override
	public void paint(Graphics arg0) {
		this.component.paint(arg0);
	}

	@Override
	public void update(Graphics arg0) {
		this.component.update(arg0);
	}
}
