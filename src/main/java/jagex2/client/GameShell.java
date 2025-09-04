package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.awt.Canvas;
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
import java.util.concurrent.locks.LockSupport;

@ObfuscatedName("a")
public class GameShell extends Canvas implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

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

	@Override
	@SuppressWarnings("BusyWait")
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

			// Park instead of sleep to avoid InterruptedException overhead
			LockSupport.parkNanos((long) delta * 1_000_000L);
			if (Thread.interrupted()) {
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

		// Brief pause before exit without busy-waiting
		LockSupport.parkNanos(1_000_000_000L);
		if (Thread.interrupted()) {
			Thread.currentThread().interrupt();
		}

		try {
			System.exit(0);
		} catch (SecurityException ignore) {
		}
	}

	@ObfuscatedName("a.a(II)V")
	public final void setFramerate(int fps) {
		this.deltime = 1000 / fps;
	}

    // Lifecycle methods retained for compatibility (no longer Applet overrides)
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

		LockSupport.parkNanos(5_000_000_000L);
		if (Thread.interrupted()) {
			Thread.currentThread().interrupt();
		}

		if (this.state == -1) {
			this.shutdown();
		}
	}

    @Override
    public final void update(Graphics g) {
        if (this.graphics == null) {
            this.graphics = g;
        }

		this.redrawScreen = true;
		this.refresh();
	}

    @Override
    public final void paint(Graphics g) {
        if (this.graphics == null) {
            this.graphics = g;
        }

		this.redrawScreen = true;
		this.refresh();
	}

	@Override
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

	@Override
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

	@Override
	public final void mouseClicked(MouseEvent e) {
	}

	@Override
	public final void mouseEntered(MouseEvent e) {
		if (InputTracking.enabled) {
			InputTracking.mouseEntered();
		}
	}

	@Override
	public final void mouseExited(MouseEvent e) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;

		if (InputTracking.enabled) {
			InputTracking.mouseExited();
		}
	}

	@Override
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

	@Override
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

	@Override
	public final void keyPressed(KeyEvent e) {
		this.idleCycles = 0;

		int code = e.getKeyCode();
		int ch = e.getKeyChar();

		if (ch < 30) {
			ch = 0;
		}

		ch = mapKeyCodeToChPressed(code, ch);

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

	@Override
	public final void keyReleased(KeyEvent e) {
		this.idleCycles = 0;

		int code = e.getKeyCode();
		char ch = e.getKeyChar();

		if (ch < 30) {
			ch = 0;
		}

		ch = (char) mapKeyCodeToChReleased(code, ch);

		if (ch > 0 && ch < 128) {
			this.actionKey[ch] = 0;
		}

		if (InputTracking.enabled) {
			InputTracking.keyReleased(ch);
		}
	}

	@Override
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

	@Override
	public final void focusGained(FocusEvent e) {
		this.hasFocus = true;
		this.redrawScreen = true;
		this.refresh();

		if (InputTracking.enabled) {
			InputTracking.focusGained();
		}
	}

	@Override
	public final void focusLost(FocusEvent e) {
		this.hasFocus = false;

		if (InputTracking.enabled) {
			InputTracking.focusLost();
		}
	}

	@Override
	public final void windowActivated(WindowEvent e) {
	}

	@Override
	public final void windowClosed(WindowEvent e) {
	}

	@Override
	public final void windowClosing(WindowEvent e) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent e) {
	}

	@Override
	public final void windowDeiconified(WindowEvent e) {
	}

	@Override
	public final void windowIconified(WindowEvent e) {
	}

	@Override
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

	private static int mapKeyCodeToChPressed(int code, int defaultCh) {
		return switch (code) {
			case 37 -> 1;
			case 39 -> 2;
			case 38 -> 3;
			case 40 -> 4;
			case 17 -> 5;
			case 8, 127 -> '\b';
			case 9 -> '\t';
			case 10 -> '\n';
			case 112 -> 1008;
			case 113 -> 1009;
			case 114 -> 1010;
			case 115 -> 1011;
			case 116 -> 1012;
			case 117 -> 1013;
			case 118 -> 1014;
			case 119 -> 1015;
			case 120 -> 1016;
			case 121 -> 1017;
			case 122 -> 1018;
			case 123 -> 1019;
			case 36 -> 1000;
			case 35 -> 1001;
			case 33 -> 1002;
			case 34 -> 1003;
			default -> defaultCh;
		};
	}

	private static int mapKeyCodeToChReleased(int code, int defaultCh) {
		return switch (code) {
			case 37 -> 1;
			case 39 -> 2;
			case 38 -> 3;
			case 40 -> 4;
			case 17 -> 5;
			case 8, 127 -> '\b';
			case 9 -> '\t';
			case 10 -> '\n';
			default -> defaultCh;
		};
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable thread, int priority) {
		Thread t = new Thread(thread);
		t.start();
		t.setPriority(priority);
	}

	@ObfuscatedName("a.a(IILjava/lang/String;)V")
	@SuppressWarnings("BusyWait")
	public void drawProgress(int percent, String message) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent().getGraphics();

			this.getBaseComponent().repaint();

			// Wait for graphics to be ready without throwing InterruptedException
			LockSupport.parkNanos(1_000_000_000L);
			if (Thread.interrupted()) {
				Thread.currentThread().interrupt();
				break;
			}
		}

		Font bold = new Font("Helvetica", Font.BOLD, 13);
		FontMetrics boldMetrics = this.getBaseComponent().getFontMetrics(bold);

		// Removed unused plain font metrics

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
