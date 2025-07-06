package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@ObfuscatedName("a")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("a.g")
	public int state;

	@ObfuscatedName("a.h")
	public int deltime = 20;

	@ObfuscatedName("a.i")
	public int mindel = 1;

	@ObfuscatedName("a.j")
	public long[] otim = new long[10];

	@ObfuscatedName("a.k")
	public int fps;

	@ObfuscatedName("a.l")
	public boolean debug = false;

	@ObfuscatedName("a.m")
	public int screenWidth;

	@ObfuscatedName("a.n")
	public int screenHeight;

	@ObfuscatedName("a.o")
	public Graphics graphics;

	@ObfuscatedName("a.p")
	public PixMap drawArea;

	@ObfuscatedName("a.q")
	public Pix32[] temp = new Pix32[6];

	@ObfuscatedName("a.r")
	public ViewBox frame;

	@ObfuscatedName("a.s")
	public boolean redrawScreen = true;

	@ObfuscatedName("a.t")
	public boolean hasFocus = true;

	@ObfuscatedName("a.u")
	public int idleCycles;

	@ObfuscatedName("a.v")
	public int mouseButton;

	@ObfuscatedName("a.w")
	public int mouseX;

	@ObfuscatedName("a.x")
	public int mouseY;

	@ObfuscatedName("a.y")
	public int lastMouseClickButton;

	@ObfuscatedName("a.z")
	public int lastMouseClickX;

	@ObfuscatedName("a.G")
	public int[] actionKey = new int[128];

	@ObfuscatedName("a.H")
	public int[] keyQueue = new int[128];

	@ObfuscatedName("a.A")
	public int lastMouseClickY;

	@ObfuscatedName("a.C")
	public int mouseClickButton;

	@ObfuscatedName("a.D")
	public int mouseClickX;

	@ObfuscatedName("a.E")
	public int mouseClickY;

	@ObfuscatedName("a.I")
	public int keyQueueReadPos;

	@ObfuscatedName("a.J")
	public int keyQueueWritePos;

	@ObfuscatedName("a.B")
	public long lastMouseClickTime;

	@ObfuscatedName("a.F")
	public long mouseClickTime;

	@ObfuscatedName("a.a(III)V")
	public final void initApplication(int height, int width) {
		this.screenWidth = width;
		this.screenHeight = height;
		this.frame = new ViewBox(this.screenWidth, this.screenHeight, this);
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.screenWidth, this.screenHeight, this.getBaseComponent());
		this.startThread(this, 1);
	}

	@ObfuscatedName("a.a(BII)V")
	public final void initApplet(int height, int width) {
		this.screenWidth = width;
		this.screenHeight = height;
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.screenWidth, this.screenHeight, this.getBaseComponent());
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

		this.drawProgress(0, "Loading...");
		this.load();

		int opos = 0;
		int ratio = 256;
		int delta = 1;
		int count = 0;
		int intex = 0;

		for (int i = 0; i < 10; i++) {
			this.otim[i] = System.currentTimeMillis();
		}

		while (this.state >= 0) {
			if (this.state > 0) {
				this.state--;

				if (this.state == 0) {
					this.shutdown();
					return;
				}
			}

			int lastRatio = ratio;
			int lastDelta = delta;

			ratio = 300;
			delta = 1;

			long ntime = System.currentTimeMillis();

			if (this.otim[opos] == 0L) {
				ratio = lastRatio;
				delta = lastDelta;
			} else if (ntime > this.otim[opos]) {
				ratio = (int) ((this.deltime * 2560L) / (ntime - this.otim[opos]));
			}

			if (ratio < 25) {
				ratio = 25;
			} else if (ratio > 256) {
				ratio = 256;
				delta = (int) ((long) this.deltime - (ntime - this.otim[opos]) / 10L);
			}

			if (delta > this.deltime) {
				delta = this.deltime;
			}

			this.otim[opos] = ntime;
			opos = (opos + 1) % 10;

			if (delta > 1) {
				for (int i = 0; i < 10; i++) {
					if (this.otim[i] != 0L) {
						this.otim[i] += delta;
					}
				}
			}

			if (delta < this.mindel) {
				delta = this.mindel;
			}

			try {
				Thread.sleep(delta);
			} catch (InterruptedException ignore) {
				intex++;
			}

			while (count < 256) {
				this.mouseClickButton = this.lastMouseClickButton;
				this.mouseClickX = this.lastMouseClickX;
				this.mouseClickY = this.lastMouseClickY;
				this.mouseClickTime = this.lastMouseClickTime;
				this.lastMouseClickButton = 0;

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
				System.out.println("del:" + delta + " deltime:" + this.deltime + " mindel:" + this.mindel);
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
	public final void shutdown() {
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

	@ObfuscatedName("a.a(II)V")
	public final void setFramerate(int fps) {
		this.deltime = 1000 / fps;
	}

	public final void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	public final void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltime;
		}
	}

	public final void destroy() {
		this.state = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception ignore) {
		}

		if (this.state == -1) {
			this.shutdown();
		}
	}

	public final void update(Graphics g) {
		if (this.graphics == null) {
			this.graphics = g;
		}

		this.redrawScreen = true;
		this.refresh();
	}

	public final void paint(Graphics g) {
		if (this.graphics == null) {
			this.graphics = g;
		}

		this.redrawScreen = true;
		this.refresh();
	}

	public final void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (this.frame != null) {
			x -= this.frame.insets.left;
			y -= this.frame.insets.top;
		}

		this.idleCycles = 0;
		this.lastMouseClickX = x;
		this.lastMouseClickY = y;
		this.lastMouseClickTime = System.currentTimeMillis();

		try {
			if (e.getButton() == MouseEvent.BUTTON3) {
				this.lastMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.lastMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.enabled) {
				InputTracking.mousePressed(x, y, e.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (e.isMetaDown()) {
				this.lastMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.lastMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.enabled) {
				InputTracking.mousePressed(x, y, e.isMetaDown() ? 1 : 0);
			}
		}
	}

	public final void mouseReleased(MouseEvent e) {
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

	public final void mouseClicked(MouseEvent e) {
	}

	public final void mouseEntered(MouseEvent e) {
		if (InputTracking.enabled) {
			InputTracking.mouseEntered();
		}
	}

	public final void mouseExited(MouseEvent e) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;

		if (InputTracking.enabled) {
			InputTracking.mouseExited();
		}
	}

	public final void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (this.frame != null) {
			x -= this.frame.insets.left;
			y -= this.frame.insets.top;
		}

		this.idleCycles = 0;
		this.mouseX = x;
		this.mouseY = y;

		if (InputTracking.enabled) {
			InputTracking.mouseMoved(x, y);
		}
	}

	public final void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (this.frame != null) {
			x -= this.frame.insets.left;
			y -= this.frame.insets.top;
		}

		this.idleCycles = 0;
		this.mouseX = x;
		this.mouseY = y;

		if (InputTracking.enabled) {
			InputTracking.mouseMoved(x, y);
		}
	}

	public final void keyPressed(KeyEvent e) {
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

	public final void keyReleased(KeyEvent e) {
		this.idleCycles = 0;

		int code = e.getKeyCode();
		char ch = e.getKeyChar();

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

	public final void keyTyped(KeyEvent e) {
	}

	@ObfuscatedName("a.b(I)I")
	public final int pollKey() {
		int key = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			key = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return key;
	}

	public final void focusGained(FocusEvent e) {
		this.hasFocus = true;
		this.redrawScreen = true;
		this.refresh();

		if (InputTracking.enabled) {
			InputTracking.focusGained();
		}
	}

	public final void focusLost(FocusEvent e) {
		this.hasFocus = false;

		if (InputTracking.enabled) {
			InputTracking.focusLost();
		}
	}

	public final void windowActivated(WindowEvent e) {
	}

	public final void windowClosed(WindowEvent e) {
	}

	public final void windowClosing(WindowEvent e) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent e) {
	}

	public final void windowDeiconified(WindowEvent e) {
	}

	public final void windowIconified(WindowEvent e) {
	}

	public final void windowOpened(WindowEvent e) {
	}

	@ObfuscatedName("a.a()V")
	public void load() {
	}

	@ObfuscatedName("a.c(I)V")
	public void update() {
	}

	@ObfuscatedName("a.d(I)V")
	public void unload() {
	}

	@ObfuscatedName("a.a(Z)V")
	public void draw() {
	}

	@ObfuscatedName("a.e(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.f(I)Ljava/awt/Component;")
	public java.awt.Component getBaseComponent() {
		if (this.frame != null) {
			return this.frame;
		}

		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable thread, int priority) {
		Thread t = new Thread(thread);
		t.start();
		t.setPriority(priority);
	}

	@ObfuscatedName("a.a(IILjava/lang/String;)V")
	public void drawProgress(int percent, String message) {
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
			this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
			this.redrawScreen = false;
		}

		Color background = new Color(140, 17, 17);

		int y = this.screenHeight / 2 - 18;
		this.graphics.setColor(background);
		this.graphics.drawRect(this.screenWidth / 2 - 152, y, 304, 34);
		this.graphics.fillRect(this.screenWidth / 2 - 150, y + 2, percent * 3, 30);

		this.graphics.setColor(Color.black);
		this.graphics.fillRect(percent * 3 + (this.screenWidth / 2 - 150), y + 2, 300 - percent * 3, 30);
		this.graphics.setFont(bold);

		this.graphics.setColor(Color.white);
		this.graphics.drawString(message, (this.screenWidth - boldMetrics.stringWidth(message)) / 2, y + 22);
	}
}
