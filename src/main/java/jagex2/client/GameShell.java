package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
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

	@ObfuscatedName("a.f")
	public int deltime = 20;

	@ObfuscatedName("a.g")
	public int mindel = 1;

	@ObfuscatedName("a.i")
	public int fps;

	@ObfuscatedName("a.l")
	public int sWid;

	@ObfuscatedName("a.k")
	public int sHei;

	@ObfuscatedName("a.n")
	public PixMap drawArea;

	@ObfuscatedName("a.p")
	public ViewBox frame;

	@ObfuscatedName("a.q")
	public boolean fullredraw = true;

	@ObfuscatedName("a.r")
	public boolean focus = true;

	@ObfuscatedName("a.a")
	public final boolean field1 = false;

	@ObfuscatedName("a.b")
	public final int field2 = -128;

	@ObfuscatedName("a.c")
	public final int field3 = 37395;

	@ObfuscatedName("a.d")
	public int field4 = -6002;

	@ObfuscatedName("a.e")
	public int state;

	@ObfuscatedName("a.h")
	public final long[] otim = new long[10];

	@ObfuscatedName("a.j")
	public boolean debug = false;

	@ObfuscatedName("a.m")
	public Graphics graphics;

	@ObfuscatedName("a.o")
	public final Pix32[] drawAreas = new Pix32[6];

	@ObfuscatedName("a.s")
	public int idleTimer;

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
	public final int[] keyHeld = new int[128];

	@ObfuscatedName("a.F")
	public final int[] keyQueue = new int[128];

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

	@Override
	public void run() {
		getBaseComponent().addMouseListener(this);
		getBaseComponent().addMouseMotionListener(this);
		getBaseComponent().addKeyListener(this);
		getBaseComponent().addFocusListener(this);
		if (frame != null) {
			frame.addWindowListener(this);
		}
		drawProgress(0, "Loading...");
		maininit();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			otim[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (state < 0) {
					if (state == -1) {
						shutdown();
					}
					return;
				}
				if (state > 0) {
					state--;
					if (state == 0) {
						shutdown();
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > otim[var1]) {
					var2 = (int) ((long) (deltime * 2560) / (var11 - otim[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) deltime - (var11 - otim[var1]) / 10L);
				}
				if (var3 > deltime) {
					var3 = deltime;
				}
				otim[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (otim[var13] != 0L) {
							otim[var13] += var3;
						}
					}
				}
				if (var3 < mindel) {
					var3 = mindel;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					mouseClickButton = nextMouseClickButton;
					mouseClickX = nextMouseClickX;
					mouseClickY = nextMouseClickY;
					mouseClickTime = nextMouseClickTime;
					nextMouseClickButton = 0;
					mainloop();
					keyQueueReadPos = keyQueueWritePos;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (deltime > 0) {
					fps = var2 * 1000 / (deltime * 256);
				}
				mainredraw();
			} while (!debug);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + otim[var15]);
			}
			System.out.println("fps:" + fps + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + deltime + " mindel:" + mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			debug = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(I)V")
	public void shutdown() {
		state = -2;
		mainquit();
		if (frame != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception var2) {
			}
			try {
				System.exit(0);
			} catch (Throwable var1) {
			}
		}
	}

	@Override
	public final void start() {
		if (state >= 0) {
			state = 0;
		}
	}

	@Override
	public final void stop() {
		if (state >= 0) {
			state = 4000 / deltime;
		}
	}

	@Override
	public final void destroy() {
		state = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (state == -1) {
			shutdown();
		}
	}

	@Override
	public final void update(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}
		fullredraw = true;
		refresh();
	}

	@Override
	public final void paint(Graphics arg0) {
		if (graphics == null) {
			graphics = arg0;
		}
		fullredraw = true;
		refresh();
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		focus = true;
		fullredraw = true;
		refresh();
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		focus = false;
		for (int var2 = 0; var2 < 128; var2++) {
			keyHeld[var2] = 0;
		}
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("a.d(I)V")
	public void mainquit() {
	}

	@ObfuscatedName("a.a()V")
	public void maininit() {
	}

	@ObfuscatedName("a.c(I)V")
	public void mainloop() {
	}

	@ObfuscatedName("a.a(B)V")
	public void mainredraw() {
	}

	@ObfuscatedName("a.a(ZILjava/lang/String;)V")
	public void drawProgress(int arg0, String arg1) {
		while (graphics == null) {
			graphics = getBaseComponent().getGraphics();
			try {
				getBaseComponent().repaint();
			} catch (Exception var9) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var8) {
			}
		}
		Font var3 = new Font("Helvetica", 1, 13);
		FontMetrics var4 = getBaseComponent().getFontMetrics(var3);
		Font var5 = new Font("Helvetica", 0, 13);
		getBaseComponent().getFontMetrics(var5);
		if (fullredraw) {
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, sHei, sWid);
			fullredraw = false;
		}
		Color var6 = new Color(140, 17, 17);
		int var7 = sWid / 2 - 18;
		graphics.setColor(var6);
		graphics.drawRect(sHei / 2 - 152, var7, 304, 34);
		graphics.fillRect(sHei / 2 - 150, var7 + 2, arg0 * 3, 30);
		graphics.setColor(Color.black);
		graphics.fillRect(sHei / 2 + arg0 * 3 - 150, var7 + 2, 300 - arg0 * 3, 30);
		graphics.setFont(var3);
		graphics.setColor(Color.white);
		graphics.drawString(arg1, (sHei - var4.stringWidth(arg1)) / 2, var7 + 22);
	}

	@ObfuscatedName("a.a(III)V")
	public final void initApplication(int arg0, int arg1, int arg2) {
		sHei = arg1;
		sWid = arg0;
		frame = new ViewBox(sWid, 27016, sHei, this);
		graphics = getBaseComponent().getGraphics();
		if (arg2 != 0) {
			field4 = -480;
		}
		drawArea = new PixMap(getBaseComponent(), sHei, sWid, 2);
		startThread(this, 1);
	}

	@ObfuscatedName("a.a(ZII)V")
	public final void initApplet() {
		sHei = 765;
		sWid = 503;
		graphics = getBaseComponent().getGraphics();
		drawArea = new PixMap(getBaseComponent(), sHei, sWid, 2);
		startThread(this, 1);
	}

	@ObfuscatedName("a.a(II)V")
	public final void setFramerate() {
		deltime = 1000;
	}

	@Override
	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		idleTimer = 0;
		nextMouseClickX = var2;
		nextMouseClickY = var3;
		nextMouseClickTime = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			nextMouseClickButton = 2;
			mouseButton = 2;
		} else {
			nextMouseClickButton = 1;
			mouseButton = 1;
		}
	}

	@Override
	public final void mouseReleased(MouseEvent arg0) {
		idleTimer = 0;
		mouseButton = 0;
	}

	@Override
	public final void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public final void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public final void mouseExited(MouseEvent arg0) {
		idleTimer = 0;
		mouseX = -1;
		mouseY = -1;
	}

	@Override
	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		idleTimer = 0;
		mouseX = var2;
		mouseY = var3;
	}

	@Override
	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		idleTimer = 0;
		mouseX = var2;
		mouseY = var3;
	}

	@Override
	public final void keyPressed(KeyEvent arg0) {
		idleTimer = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = 8;
		}
		if (var2 == 127) {
			var3 = 8;
		}
		if (var2 == 9) {
			var3 = 9;
		}
		if (var2 == 10) {
			var3 = 10;
		}
		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}
		if (var2 == 36) {
			var3 = 1000;
		}
		if (var2 == 35) {
			var3 = 1001;
		}
		if (var2 == 33) {
			var3 = 1002;
		}
		if (var2 == 34) {
			var3 = 1003;
		}
		if (var3 > 0 && var3 < 128) {
			keyHeld[var3] = 1;
		}
		if (var3 > 4) {
			keyQueue[keyQueueWritePos] = var3;
			keyQueueWritePos = keyQueueWritePos + 1 & 0x7F;
		}
	}

	@Override
	public final void keyReleased(KeyEvent arg0) {
		idleTimer = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < '\u001E') {
			var3 = '\u0000';
		}
		if (var2 == 37) {
			var3 = '\u0001';
		}
		if (var2 == 39) {
			var3 = '\u0002';
		}
		if (var2 == 38) {
			var3 = '\u0003';
		}
		if (var2 == 40) {
			var3 = '\u0004';
		}
		if (var2 == 17) {
			var3 = '\u0005';
		}
		if (var2 == 8) {
			var3 = '\b';
		}
		if (var2 == 127) {
			var3 = '\b';
		}
		if (var2 == 9) {
			var3 = '\t';
		}
		if (var2 == 10) {
			var3 = '\n';
		}
		if (var3 > '\u0000' && var3 < '\u0080') {
			keyHeld[var3] = 0;
		}
	}

	@Override
	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.b(I)I")
	public final int pollKey() {
		int var1 = -1;
		if (keyQueueWritePos != keyQueueReadPos) {
			var1 = keyQueue[keyQueueReadPos];
			keyQueueReadPos = keyQueueReadPos + 1 & 0x7F;
		}
		return var1;
	}

	@ObfuscatedName("a.a(Z)V")
	public void refresh() {
	}

	@ObfuscatedName("a.e(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		if (frame != null) {
			return frame;
		}
		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}
}
