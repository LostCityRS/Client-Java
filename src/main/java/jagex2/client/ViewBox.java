package jagex2.client;

import deob.ObfuscatedName;
import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public final class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public final GameShell shell;

	public ViewBox(int arg0, int arg1, int arg2, GameShell arg3) {
		shell = arg3;
		setTitle("Jagex");
		setResizable(false);
		resize(arg2 + 8, arg0 + 28);
		if (arg1 != 27016) {
			throw new NullPointerException();
		}
		show();
		toFront();
		resize(arg2 + 8, arg0 + 28);
	}

	@Override
	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	@Override
	public void update(Graphics arg0) {
		shell.update(arg0);
	}

	@Override
	public void paint(Graphics arg0) {
		shell.paint(arg0);
	}
}
