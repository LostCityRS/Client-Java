package jagex2.client;

import deob.ObfuscatedName;
import sign.signlink;

import javax.swing.*;
import java.awt.*;

@ObfuscatedName("b")
public class ViewBox extends JFrame {

	@ObfuscatedName("b.a")
	public GameShell shell;

	public ViewBox(int height, GameShell shell, int width) {
		this.shell = shell;
		this.setTitle("RS2 user client - release #" + signlink.clientversion);
		this.setResizable(false);

		BorderLayout manager = new BorderLayout();
		this.setLayout(manager);

		this.add(this.shell, BorderLayout.CENTER);
		this.pack();

		this.setVisible(true);
		this.toFront();
	}

	public void update(Graphics g) {
		this.shell.update(g);
	}

	public void paint(Graphics g) {
		this.shell.paint(g);
	}
}
