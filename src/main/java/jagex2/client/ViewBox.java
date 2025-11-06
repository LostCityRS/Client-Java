package jagex2.client;

import deob.ObfuscatedName;
import sign.signlink;

import java.awt.*;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell field38;

	public ViewBox(boolean arg0, int arg1, GameShell arg2, int arg3) {
		this.field38 = arg2;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(this.field38, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
	}

	public final void update(Graphics arg0) {
		this.field38.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.field38.paint(arg0);
	}
}
