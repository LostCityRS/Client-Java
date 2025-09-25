package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("a.e")
	public int state;

	@ObfuscatedName("a.f")
	public int deltime = 20;

	@ObfuscatedName("a.g")
	public int mindel = 1;

	@ObfuscatedName("a.h")
	public long[] otim = new long[10];

	@ObfuscatedName("a.i")
	public int fps;

	@ObfuscatedName("a.j")
	public boolean debug = false;

	@ObfuscatedName("a.k")
	public int canvasWidth;

	@ObfuscatedName("a.l")
	public int canvasHeight;

	@ObfuscatedName("a.m")
	public Graphics graphics;

	@ObfuscatedName("a.n")
	public PixMap drawArea;

	@ObfuscatedName("a.o")
	public Pix32[] temp = new Pix32[6];

	@ObfuscatedName("a.p")
	public ViewBox frame;

	@ObfuscatedName("a.q")
	public boolean redrawScreen = true;

	@ObfuscatedName("a.r")
	public boolean hasFocus = true;

	@ObfuscatedName("a.s")
	public int idleCycles;

	@ObfuscatedName("a.t")
	public int mouseButton;

	@ObfuscatedName("a.u")
	public int mouseX;

	@ObfuscatedName("a.v")
	public int mouseY;

	@ObfuscatedName("a.w")
	public int nextMouseClickButton;

	@ObfuscatedName("a.x")
	public int nextMouseClickX;

	@ObfuscatedName("a.y")
	public int nextMouseClickY;

	@ObfuscatedName("a.z")
	public long nextMouseClickTime;

	@ObfuscatedName("a.E")
	public int[] actionKey = new int[128];

	@ObfuscatedName("a.F")
	public int[] keyQueue = new int[128];

	@ObfuscatedName("a.A")
	public int mouseClickButton;

	@ObfuscatedName("a.B")
	public int mouseClickX;

	@ObfuscatedName("a.C")
	public int mouseClickY;

	@ObfuscatedName("a.G")
	public int keyQueueReadPos;

	@ObfuscatedName("a.H")
	public int keyQueueWritePos;

	@ObfuscatedName("a.D")
	public long mouseClickTime;

	@ObfuscatedName("a.a(III)V")
	public void initApplication(int height, int width) {
		this.setPreferredSize(new Dimension(width, height));

		this.canvasWidth = width;
		this.canvasHeight = height;
		this.frame = new ViewBox(this.canvasHeight, this, this.canvasWidth);
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.canvasHeight, this.getBaseComponent(), this.canvasWidth);

		this.startThread(this, 1);
	}

	@ObfuscatedName("a.a(IIZ)V")
	public void initApplet(int width, int height) {
		this.canvasWidth = width;
		this.canvasHeight = height;
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.canvasHeight, this.getBaseComponent(), this.canvasWidth);

		this.startThread(this, 1);
	}

	public void run() {
		this.getBaseComponent().addMouseListener(this);
		this.getBaseComponent().addMouseMotionListener(this);
		this.getBaseComponent().addKeyListener(this);
		this.getBaseComponent().addFocusListener(this);

		if (this.frame != null) {
			this.frame.addWindowListener(this);
		}

		this.drawProgress("Loading...", 0);
		this.load();

		int opos = 0;
		int ratio = 256;
		int del = 1;
		int count = 0;
		int intex = 0;

		for (int i = 0; i < 10; i++) {
			this.otim[i] = System.currentTimeMillis();
		}

		long ntime = System.currentTimeMillis();
		while (this.state >= 0) {
			if (this.state > 0) {
				this.state--;

				if (this.state == 0) {
					this.shutdown();
					return;
				}
			}

			int lastRatio = ratio;
			int lastDel = del;
			ratio = 300;
			del = 1;
			ntime = System.currentTimeMillis();

			if (this.otim[opos] == 0L) {
				ratio = lastRatio;
				del = lastDel;
			} else if (ntime > this.otim[opos]) {
				ratio = (int) ((this.deltime * 2560L) / (ntime - this.otim[opos]));
			}

			if (ratio < 25) {
				ratio = 25;
			}

			if (ratio > 256) {
				ratio = 256;
				del = (int) ((long) this.deltime - (ntime - this.otim[opos]) / 10L);
			}

			if (del > this.deltime) {
				del = this.deltime;
			}

			this.otim[opos] = ntime;
			opos = (opos + 1) % 10;

			if (del > 1) {
				for (int i = 0; i < 10; i++) {
					if (this.otim[i] != 0L) {
						this.otim[i] += del;
					}
				}
			}

			if (del < this.mindel) {
				del = this.mindel;
			}

			try {
				Thread.sleep(del);
			} catch (InterruptedException ignore) {
				intex++;
			}

			while (count < 256) {
				this.mouseClickButton = this.nextMouseClickButton;
				this.mouseClickX = this.nextMouseClickX;
				this.mouseClickY = this.nextMouseClickY;
				this.mouseClickTime = this.nextMouseClickTime;
				this.nextMouseClickButton = 0;

				this.update();

				this.keyQueueReadPos = this.keyQueueWritePos;
				count += ratio;
			}
			count &= 0xFF;

			if (this.deltime > 0) {
				this.fps = ratio * 1000 / (this.deltime * 256);
			}

			this.draw();

			if (this.debug) {
				System.out.println("ntime:" + ntime);
				for (int i = 0; i < 10; i++) {
					int o = (opos - i - 1 + 20) % 10;
					System.out.println("otim" + o + ":" + this.otim[o]);
				}
				System.out.println("fps:" + this.fps + " ratio:" + ratio + " count:" + count);
				System.out.println("del:" + del + " deltime:" + this.deltime + " mindel:" + this.mindel);
				System.out.println("intex:" + intex + " opos:" + opos);
				this.debug = false;
				intex = 0;
			}
		}

		if (this.state == -1) {
			this.shutdown();
		}
	}

	@ObfuscatedName("a.a(I)V")
	public void shutdown() {
		this.state = -2;
		this.unload();

		try {
			Thread.sleep(1000L);
		} catch (Exception ignore) {
		}

		try {
			System.exit(0);
		} catch (Throwable ignore) {
		}
	}

	@ObfuscatedName("a.a(IB)V")
	public void setFramerate(int fps) {
		this.deltime = 1000 / fps;
	}

	public void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	public void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltime;
		}
	}

	public void destroy() {
		this.state = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception ignore) {
		}

		if (this.state == -1) {
			this.shutdown();
		}
	}

	public void update(Graphics g) {
		if (this.graphics == null) {
			this.graphics = g;
		}

		this.redrawScreen = true;
		this.refresh();
	}

	public void paint(Graphics g) {
		if (this.graphics == null) {
			this.graphics = g;
		}

		this.redrawScreen = true;
		this.refresh();
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		this.idleCycles = 0;
		this.nextMouseClickX = x;
		this.nextMouseClickY = y;
		this.nextMouseClickTime = System.currentTimeMillis();

		try {
			if (e.getButton() == MouseEvent.BUTTON3) {
				this.nextMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.nextMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.enabled) {
				InputTracking.mousePressed(y, e.getButton() == MouseEvent.BUTTON3 ? 1 : 0, x);
			}
		} catch (NoSuchMethodError ex) {
			if (e.isMetaDown()) {
				this.nextMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.nextMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.enabled) {
				InputTracking.mousePressed(y, e.isMetaDown() ? 1 : 0, x);
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
		this.idleCycles = 0;
		this.mouseButton = 0;

		try {
			if (InputTracking.enabled) {
				InputTracking.mouseReleased(e.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (InputTracking.enabled) {
				InputTracking.mouseReleased(e.isMetaDown() ? 1 : 0);
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		if (InputTracking.enabled) {
			InputTracking.mouseEntered();
		}
	}

	public void mouseExited(MouseEvent e) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;

		if (InputTracking.enabled) {
			InputTracking.mouseExited();
		}
	}

	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		this.idleCycles = 0;
		this.mouseX = x;
		this.mouseY = y;

		if (InputTracking.enabled) {
			InputTracking.mouseMoved(x, y);
		}
	}

	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		this.idleCycles = 0;
		this.mouseX = x;
		this.mouseY = y;

		if (InputTracking.enabled) {
			InputTracking.mouseMoved(x, y);
		}
	}

	public void keyPressed(KeyEvent e) {
		this.idleCycles = 0;

		int code = e.getKeyCode();
		int ch = e.getKeyChar();

		if (ch < 30) {
			ch = 0;
		}

		if (code == 37) {
			ch = 1;
		} else if (code == 39) {
			ch = 2;
		} else if (code == 38) {
			ch = 3;
		} else if (code == 40) {
			ch = 4;
		} else if (code == 17) {
			ch = 5;
		} else if (code == 8) {
			ch = '\b';
		} else if (code == 127) {
			ch = '\b';
		} else if (code == 9) {
			ch = '\t';
		} else if (code == 10) {
			ch = '\n';
		} else if (code >= 112 && code <= 123) {
			ch = code + 1008 - 112;
		} else if (code == 36) {
			ch = 1000;
		} else if (code == 35) {
			ch = 1001;
		} else if (code == 33) {
			ch = 1002;
		} else if (code == 34) {
			ch = 1003;
		}

		if (ch > 0 && ch < 128) {
			this.actionKey[ch] = 1;
		}

		if (ch > 4) {
			this.keyQueue[this.keyQueueWritePos] = ch;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}

		if (InputTracking.enabled) {
			InputTracking.keyPressed(ch);
		}
	}

	public void keyReleased(KeyEvent e) {
		this.idleCycles = 0;

		int code = e.getKeyCode();
		int ch = e.getKeyChar();

		if (ch < 30) {
			ch = 0;
		}

		if (code == 37) {
			ch = 1;
		} else if (code == 39) {
			ch = 2;
		} else if (code == 38) {
			ch = 3;
		} else if (code == 40) {
			ch = 4;
		} else if (code == 17) {
			ch = 5;
		} else if (code == 8) {
			ch = '\b';
		} else if (code == 127) {
			ch = '\b';
		} else if (code == 9) {
			ch = '\t';
		} else if (code == 10) {
			ch = '\n';
		}

		if (ch > 0 && ch < 128) {
			this.actionKey[ch] = 0;
		}

		if (InputTracking.enabled) {
			InputTracking.keyReleased(ch);
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	@ObfuscatedName("a.a(Z)I")
	public int pollKey() {
		int key = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			key = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return key;
	}

	public void focusGained(FocusEvent e) {
		this.hasFocus = true;

		this.redrawScreen = true;
		this.refresh();

		if (InputTracking.enabled) {
			InputTracking.focusGained();
		}
	}

	public void focusLost(FocusEvent e) {
		this.hasFocus = false;

		if (InputTracking.enabled) {
			InputTracking.focusLost();
		}
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		this.destroy();
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	@ObfuscatedName("a.a()V")
	public void load() {
	}

	@ObfuscatedName("a.b(I)V")
	public void update() {
	}

	@ObfuscatedName("a.c(I)V")
	public void unload() {
	}

	@ObfuscatedName("a.d(I)V")
	public void draw() {
	}

	@ObfuscatedName("a.e(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.f(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable thread, int priority) {
		Thread t = new Thread(thread);
		t.start();
		t.setPriority(priority);
	}

	@ObfuscatedName("a.a(BLjava/lang/String;I)V")
	public void drawProgress(String message, int percent) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent().getGraphics();

			try {
				this.getBaseComponent().repaint();
			} catch (Exception ignore) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception ignore) {
			}
		}

		Font bold = new Font("Helvetica", Font.BOLD, 13);
		FontMetrics boldMetrics = this.getBaseComponent().getFontMetrics(bold);

		Font plain = new Font("Helvetica", Font.PLAIN, 13);
		FontMetrics plainMetrics = this.getBaseComponent().getFontMetrics(plain);

		if (this.redrawScreen) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.canvasWidth, this.canvasHeight);
			this.redrawScreen = false;
		}

		Color barColor = new Color(140, 17, 17);
		int y = this.canvasHeight / 2 - 18;

		this.graphics.setColor(barColor);
		this.graphics.drawRect(this.canvasWidth / 2 - 152, y, 304, 34);
		this.graphics.fillRect(this.canvasWidth / 2 - 150, y + 2, percent * 3, 30);

		this.graphics.setColor(Color.black);
		this.graphics.fillRect(this.canvasWidth / 2 - 150 + percent * 3, y + 2, 300 - percent * 3, 30);

		this.graphics.setFont(bold);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(message, (this.canvasWidth - boldMetrics.stringWidth(message)) / 2, y + 22);
	}
}
