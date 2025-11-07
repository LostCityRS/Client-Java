package jagex2.client;

import deob.ObfuscatedName;
import sign.signlink;

import java.awt.*;

@ObfuscatedName("b")
public class ViewBox extends Frame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public ViewBox(boolean arg0, int arg1, GameShell arg2, int arg3) {
		this.shell = arg2;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(this.shell, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
	}

	public void update(Graphics arg0) {
		this.shell.update(arg0);
	}

	public void paint(Graphics arg0) {
		this.shell.paint(arg0);
	}
}
