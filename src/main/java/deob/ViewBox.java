package deob;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell field38;

	public ViewBox(int arg0, int arg1, int arg2, GameShell arg3) {
		this.field38 = arg3;
		this.setTitle("Jagex");
		this.setResizable(false);
		this.show();
		this.toFront();
		this.resize(arg0 + 8, arg2 + 28);
		int var5 = 95 / arg1;
	}

	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	public final void update(Graphics arg0) {
		this.field38.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.field38.paint(arg0);
	}
}
