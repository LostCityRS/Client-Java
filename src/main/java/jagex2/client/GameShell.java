package jagex2.client;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

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
	public int canvasWidth;

	@ObfuscatedName("a.n")
	public int canvasHeight;

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
	public int nextMouseClickButton;

	@ObfuscatedName("a.z")
	public int nextMouseClickX;

	@ObfuscatedName("a.G")
	public int[] actionKey = new int[128];

	@ObfuscatedName("a.H")
	public int[] keyQueue = new int[128];

	@ObfuscatedName("a.A")
	public int nextMouseClickY;

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
	public long nextMouseClickTime;

	@ObfuscatedName("a.F")
	public long mouseClickTime;

	@ObfuscatedName("a.a(IIB)V")
	public void initApplication(int arg0, int arg1) {
		this.setPreferredSize(new Dimension(arg0, arg1));

		this.canvasWidth = arg0;
		this.canvasHeight = arg1;
		this.frame = new ViewBox(false, this.canvasHeight, this, this.canvasWidth);
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.getBaseComponent(), this.canvasWidth, this.canvasHeight);

		this.startThread(this, 1);
	}

	@ObfuscatedName("a.a(III)V")
	public void initApplet(int arg1, int arg2) {
		this.canvasWidth = arg2;
		this.canvasHeight = arg1;
		this.graphics = this.getBaseComponent().getGraphics();
		this.drawArea = new PixMap(this.getBaseComponent(), this.canvasWidth, this.canvasHeight);
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
		while (true) {
			long var11;
			do {
				if (this.state < 0) {
					if (this.state == -1) {
						this.shutdown(true);
					}
					return;
				}
				if (this.state > 0) {
					this.state--;
					if (this.state == 0) {
						this.shutdown(true);
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.otim[var1]) {
					var2 = (int) ((long) (this.deltime * 2560) / (var11 - this.otim[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.deltime - (var11 - this.otim[var1]) / 10L);
				}
				if (var3 > this.deltime) {
					var3 = this.deltime;
				}
				this.otim[var1] = var11;
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
					this.loop();
					this.keyQueueReadPos = this.keyQueueWritePos;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.deltime > 0) {
					this.fps = var2 * 1000 / (this.deltime * 256);
				}
				this.draw();
			} while (!this.debug);
			System.out.println("ntime:" + var11);
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

	@ObfuscatedName("a.a(Z)V")
	public void shutdown(boolean arg0) {
		this.state = -2;
		this.unload();
		if (this.frame != null) {
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
			try {
				System.exit(0);
			} catch (Throwable var3) {
			}
		}
	}

	@ObfuscatedName("a.a(II)V")
	public void setFramerate(int arg1) {
		this.deltime = 1000 / arg1;
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
		} catch (Exception var1) {
		}
		if (this.state == -1) {
			this.shutdown(true);
		}
	}

	public void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.redrawScreen = true;
		this.refresh();
	}

	public void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.redrawScreen = true;
		this.refresh();
	}

	public void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();

		this.idleCycles = 0;
		this.nextMouseClickX = var2;
		this.nextMouseClickY = var3;
		this.nextMouseClickTime = System.currentTimeMillis();

		try {
			if (arg0.getButton() == MouseEvent.BUTTON3) {
				this.nextMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.nextMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.active) {
				InputTracking.mousePressed(var2, var3, arg0.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (arg0.isMetaDown()) {
				this.nextMouseClickButton = 2;
				this.mouseButton = 2;
			} else {
				this.nextMouseClickButton = 1;
				this.mouseButton = 1;
			}

			if (InputTracking.active) {
				InputTracking.mousePressed(var2, var3, arg0.isMetaDown() ? 1 : 0);
			}
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseButton = 0;

		try {
			if (InputTracking.active) {
				InputTracking.mouseReleased(arg0.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (InputTracking.active) {
				InputTracking.mouseReleased(arg0.isMetaDown() ? 1 : 0);
			}
		}
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
		if (InputTracking.active) {
			InputTracking.mouseEntered();
		}
	}

	public void mouseExited(MouseEvent arg0) {
		this.idleCycles = 0;
		this.mouseX = -1;
		this.mouseY = -1;
		if (InputTracking.active) {
			InputTracking.mouseExited();
		}
	}

	public void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
		if (InputTracking.active) {
			InputTracking.mouseMoved(var2, var3);
		}
	}

	public void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.idleCycles = 0;
		this.mouseX = var2;
		this.mouseY = var3;
		if (InputTracking.active) {
			InputTracking.mouseMoved(var2, var3);
		}
	}

	public void keyPressed(KeyEvent arg0) {
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
		if (InputTracking.active) {
			InputTracking.keyPressed(var3);
		}
	}

	public void keyReleased(KeyEvent arg0) {
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
		if (InputTracking.active) {
			InputTracking.keyReleased(var3);
		}
	}

	public void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.a(B)I")
	public int pollKey() {
		int var2 = -1;
		if (this.keyQueueWritePos != this.keyQueueReadPos) {
			var2 = this.keyQueue[this.keyQueueReadPos];
			this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
		}
		return var2;
	}

	public void focusGained(FocusEvent arg0) {
		this.hasFocus = true;
		this.redrawScreen = true;
		this.refresh();
		if (InputTracking.active) {
			InputTracking.focusGained();
		}
	}

	public void focusLost(FocusEvent arg0) {
		this.hasFocus = false;
		if (InputTracking.active) {
			InputTracking.focusLost();
		}
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public void windowDeactivated(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("a.a()V")
	public void load() {
	}

	@ObfuscatedName("a.b(B)V")
	public void loop() {
	}

	@ObfuscatedName("a.b(Z)V")
	public void unload() {
	}

	@ObfuscatedName("a.a(I)V")
	public void draw() {
	}

	@ObfuscatedName("a.b(I)V")
	public void refresh() {
	}

	@ObfuscatedName("a.c(I)Ljava/awt/Component;")
	public Component getBaseComponent() {
		return this;
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
		Font var4 = new Font("Helvetica", Font.BOLD, 13);
		FontMetrics var5 = this.getBaseComponent().getFontMetrics(var4);
		Font var6 = new Font("Helvetica", Font.PLAIN, 13);
		FontMetrics plainMetrics = this.getBaseComponent().getFontMetrics(var6);
		if (this.redrawScreen) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.canvasWidth, this.canvasHeight);
			this.redrawScreen = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.canvasHeight / 2 - 18;
		this.graphics.setColor(var7);
		this.graphics.drawRect(this.canvasWidth / 2 - 152, var8, 304, 34);
		this.graphics.fillRect(this.canvasWidth / 2 - 150, var8 + 2, arg2 * 3, 30);
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(this.canvasWidth / 2 - 150 + arg2 * 3, var8 + 2, 300 - arg2 * 3, 30);
		this.graphics.setFont(var4);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(arg1, (this.canvasWidth - var5.stringWidth(arg1)) / 2, var8 + 22);
	}
}
