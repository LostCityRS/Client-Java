package jagex2.client;

import deob.ObfuscatedName;

import java.awt.Frame;
import java.awt.Graphics;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell field38;

	public ViewBox(boolean arg0, int arg1, GameShell arg2, int arg3) {
		this.field38 = arg2;
		this.setTitle("Jagex");
		this.setResizable(false);
		if (arg0) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		this.show();
		this.toFront();
		this.resize(arg3 + 8, arg1 + 28);
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
