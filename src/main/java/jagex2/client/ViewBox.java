package jagex2.client;

import deob.ObfuscatedName;
import sign.signlink;

import javax.swing.*;
import java.awt.*;

@ObfuscatedName("b")
public class ViewBox extends JFrame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public ViewBox(int arg0, GameShell arg1, int arg2) {
		this.shell = arg1;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(shell, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
	}

	public final void update(Graphics g) {
		this.shell.update(g);
	}

	public final void paint(Graphics g) {
		this.shell.paint(g);
	}
}
