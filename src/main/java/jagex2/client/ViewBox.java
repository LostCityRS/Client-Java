package jagex2.client;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public Insets insets;

	public ViewBox(int width, int height, GameShell shell) {
		this.shell = shell;
		this.setTitle("Jagex");
		this.setResizable(false);

		// macOS won't work if the canvas isn't appropriately sized first
		this.setSize(width + 8, height + 28);
		this.setVisible(true);
		this.toFront();

		this.insets = this.getInsets();
		this.setSize(width + this.insets.left + this.insets.right, height + this.insets.top + this.insets.bottom);
	}

	@Override
	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		if (this.insets != null) {
			g.translate(this.insets.left, this.insets.top);
		}
		return g;
	}

	@Override
	public final void update(Graphics g) {
		this.shell.update(g);
	}

	@Override
	public final void paint(Graphics g) {
		this.shell.paint(g);
	}
}
