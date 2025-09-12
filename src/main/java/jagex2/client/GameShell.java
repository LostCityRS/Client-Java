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
	public int screenWidth;

	@ObfuscatedName("a.l")
	public int screenHeight;

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
	public final void initApplication(int arg1, int arg2) {
		this.screenWidth = arg2;
		this.screenHeight = arg1;
		this.frame = new ViewBox(this.screenHeight, this, this.screenWidth);
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.screenHeight, this.getBaseComponent(), this.screenWidth);
		this.startThread(this, 1);
	}

	@ObfuscatedName("a.a(IIZ)V")
	public final void initApplet(int arg0, int arg1) {
		this.screenWidth = arg0;
		this.screenHeight = arg1;
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.screenHeight, this.getBaseComponent(), this.screenWidth);
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

		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; var6++) {
			this.otim[var6] = System.currentTimeMillis();
		}

		long var7 = System.currentTimeMillis();
		while (this.state >= 0) {
			if (this.state > 0) {
				this.state--;

				if (this.state == 0) {
					this.shutdown();
					return;
				}
			}

			int var9 = var2;
			int var10 = var3;
			var2 = 300;
			var3 = 1;
			var7 = System.currentTimeMillis();

			if (this.otim[var1] == 0L) {
				var2 = var9;
				var3 = var10;
			} else if (var7 > this.otim[var1]) {
				var2 = (int) ((long) (this.deltime * 2560) / (var7 - this.otim[var1]));
			}

			if (var2 < 25) {
				var2 = 25;
			}

			if (var2 > 256) {
				var2 = 256;
				var3 = (int) ((long) this.deltime - (var7 - this.otim[var1]) / 10L);
			}

			if (var3 > this.deltime) {
				var3 = this.deltime;
			}

			this.otim[var1] = var7;
			var1 = (var1 + 1) % 10;

			if (var3 > 1) {
				for (int var13 = 0; var13 < 10; var13++) {
					if (this.otim[var13] != 0L) {
						this.otim[var13] += var3;
					}
				}
			}

			if (var3 < this.mindel) {
				var3 = this.mindel;
			}

			try {
				Thread.sleep((long) var3);
			} catch (InterruptedException var16) {
				var5++;
			}

			while (var4 < 256) {
				this.mouseClickButton = this.nextMouseClickButton;
				this.mouseClickX = this.nextMouseClickX;
				this.mouseClickY = this.nextMouseClickY;
				this.mouseClickTime = this.nextMouseClickTime;
				this.nextMouseClickButton = 0;

				this.update();

				this.keyQueueReadPos = this.keyQueueWritePos;
				var4 += var2;
			}
			var4 &= 0xFF;

			if (this.deltime > 0) {
				this.fps = var2 * 1000 / (this.deltime * 256);
			}

			this.draw();

			if (this.debug) {
				System.out.println("ntime:" + var7);
				for (int var14 = 0; var14 < 10; var14++) {
					int var15 = (var1 - var14 - 1 + 20) % 10;
					System.out.println("otim" + var15 + ":" + this.otim[var15]);
				}
				System.out.println("fps:" + this.fps + " ratio:" + var2 + " count:" + var4);
				System.out.println("del:" + var3 + " deltime:" + this.deltime + " mindel:" + this.mindel);
				System.out.println("intex:" + var5 + " opos:" + var1);
				this.debug = false;
				var5 = 0;
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
		} catch (Exception var4) {
		}
		try {
			System.exit(0);
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("a.a(IB)V")
	public final void setFramerate(int arg0) {
		this.deltime = 1000 / arg0;
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
		} catch (Exception var1) {
		}
		if (this.state == -1) {
			this.shutdown();
		}
	}

	public final void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.redrawScreen = true;
		this.refresh();
	}

	public final void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.redrawScreen = true;
		this.refresh();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.nextMouseClickX = var2;
		this.nextMouseClickY = var3;
		this.nextMouseClickTime = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.nextMouseClickButton = 2;
			this.mouseButton = 2;
		} else {
			this.nextMouseClickButton = 1;
			this.mouseButton = 1;
		}
		if (InputTracking.enabled) {
			InputTracking.mousePressed(var3, arg0.isMetaDown() ? 1 : 0, var2);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseButton = 0;
		if (InputTracking.enabled) {
			InputTracking.mouseReleased(arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (InputTracking.enabled) {
			InputTracking.mouseEntered();
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;
		if (InputTracking.enabled) {
			InputTracking.mouseExited();
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
		if (InputTracking.enabled) {
			InputTracking.mouseMoved(var2, var3);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
		if (InputTracking.enabled) {
			InputTracking.mouseMoved(var2, var3);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		this.idleCycles = 0;
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
			this.actionKey[var3] = 1;
		}
		if (var3 > 4) {
			this.keyQueue[this.keyQueueWritePos] = var3;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}
		if (InputTracking.enabled) {
			InputTracking.keyPressed(var3);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		this.idleCycles = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
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
		if (var3 > 0 && var3 < 128) {
			this.actionKey[var3] = 0;
		}
		if (InputTracking.enabled) {
			InputTracking.keyReleased(var3);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.a(Z)I")
	public final int pollKey() {
		int var2 = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			var2 = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return var2;
	}

	public final void focusGained(FocusEvent arg0) {
		this.hasFocus = true;
		this.redrawScreen = true;
		this.refresh();
		if (InputTracking.enabled) {
			InputTracking.focusGained();
		}
	}

	public final void focusLost(FocusEvent arg0) {
		this.hasFocus = false;
		if (InputTracking.enabled) {
			InputTracking.focusLost();
		}
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
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
		return this.frame == null ? this : this.frame;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(BLjava/lang/String;I)V")
	public void drawProgress(String arg1, int arg2) {
		while (this.graphics == null) {
			this.graphics = this.getBaseComponent().getGraphics();
			try {
				this.getBaseComponent().repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.getBaseComponent().getFontMetrics(var4);
		Font var6 = new Font("Helvetica", 0, 13);
		this.getBaseComponent().getFontMetrics(var6);
		if (this.redrawScreen) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.screenWidth, this.screenHeight);
			this.redrawScreen = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.screenHeight / 2 - 18;
		this.graphics.setColor(var7);
		this.graphics.drawRect(this.screenWidth / 2 - 152, var8, 304, 34);
		this.graphics.fillRect(this.screenWidth / 2 - 150, var8 + 2, arg2 * 3, 30);
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(this.screenWidth / 2 - 150 + arg2 * 3, var8 + 2, 300 - arg2 * 3, 30);
		this.graphics.setFont(var4);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(arg1, (this.screenWidth - var5.stringWidth(arg1)) / 2, var8 + 22);
	}
}
