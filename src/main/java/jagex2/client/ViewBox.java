package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public ViewBox(int arg0, GameShell arg1, int arg2) {
		this.shell = arg1;
		this.setTitle("Jagex");
		this.setResizable(false);
		this.show();
		this.toFront();
		this.resize(arg2 + 8, arg0 + 28);
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		this.shell.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.shell.paint(arg0);
	}
}
