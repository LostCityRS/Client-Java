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
	public int field7;

	@ObfuscatedName("a.h")
	public int field8 = 20;

	@ObfuscatedName("a.i")
	public int field9 = 1;

	@ObfuscatedName("a.j")
	public long[] field10 = new long[10];

	@ObfuscatedName("a.k")
	public int field11;

	@ObfuscatedName("a.l")
	public boolean field12 = false;

	@ObfuscatedName("a.m")
	public int field13;

	@ObfuscatedName("a.n")
	public int field14;

	@ObfuscatedName("a.o")
	public Graphics field15;

	@ObfuscatedName("a.p")
	public PixMap field16;

	@ObfuscatedName("a.q")
	public Pix32[] field17 = new Pix32[6];

	@ObfuscatedName("a.r")
	public ViewBox field18;

	@ObfuscatedName("a.s")
	public boolean field19 = true;

	@ObfuscatedName("a.t")
	public boolean field20 = true;

	@ObfuscatedName("a.u")
	public int field21;

	@ObfuscatedName("a.v")
	public int field22;

	@ObfuscatedName("a.w")
	public int field23;

	@ObfuscatedName("a.x")
	public int field24;

	@ObfuscatedName("a.y")
	public int field25;

	@ObfuscatedName("a.z")
	public int field26;

	@ObfuscatedName("a.G")
	public int[] field33 = new int[128];

	@ObfuscatedName("a.H")
	public int[] field34 = new int[128];

	@ObfuscatedName("a.A")
	public int field27;

	@ObfuscatedName("a.C")
	public int field29;

	@ObfuscatedName("a.D")
	public int field30;

	@ObfuscatedName("a.E")
	public int field31;

	@ObfuscatedName("a.I")
	public int field35;

	@ObfuscatedName("a.J")
	public int field36;

	@ObfuscatedName("a.K")
	public static int field37;

	@ObfuscatedName("a.B")
	public long field28;

	@ObfuscatedName("a.F")
	public long field32;

	@ObfuscatedName("a.a(IIB)V")
	public final void method1(int arg0, int arg1) {
		this.setPreferredSize(new Dimension(arg0, arg1));

		this.field13 = arg0;
		this.field14 = arg1;
		this.field18 = new ViewBox(false, this.field14, this, this.field13);
		this.field15 = this.method11().getGraphics();
		this.field16 = new PixMap(this.method11(), this.field13, this.field14);

		this.method12(this, 1);
	}

	@ObfuscatedName("a.a(III)V")
	public final void method2(int arg1, int arg2) {
		this.field13 = arg2;
		this.field14 = arg1;
		this.field15 = this.method11().getGraphics();
		this.field16 = new PixMap(this.method11(), this.field13, this.field14);
		this.method12(this, 1);
	}

	public void run() {
		this.method11().addMouseListener(this);
		this.method11().addMouseMotionListener(this);
		this.method11().addKeyListener(this);
		this.method11().addFocusListener(this);
		if (this.field18 != null) {
			this.field18.addWindowListener(this);
		}
		this.method13("Loading...", 0);
		this.method6();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.field10[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.field7 < 0) {
					if (this.field7 == -1) {
						this.method3(true);
					}
					return;
				}
				if (this.field7 > 0) {
					this.field7--;
					if (this.field7 == 0) {
						this.method3(true);
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.field10[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.field10[var1]) {
					var2 = (int) ((long) (this.field8 * 2560) / (var11 - this.field10[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.field8 - (var11 - this.field10[var1]) / 10L);
				}
				if (var3 > this.field8) {
					var3 = this.field8;
				}
				this.field10[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.field10[var13] != 0L) {
							this.field10[var13] += var3;
						}
					}
				}
				if (var3 < this.field9) {
					var3 = this.field9;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.field29 = this.field25;
					this.field30 = this.field26;
					this.field31 = this.field27;
					this.field32 = this.field28;
					this.field25 = 0;
					this.update();
					this.field35 = this.field36;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.field8 > 0) {
					this.field11 = var2 * 1000 / (this.field8 * 256);
				}
				this.method9();
			} while (!this.field12);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 - var14 - 1 + 20) % 10;
				System.out.println("otim" + var15 + ":" + this.field10[var15]);
			}
			System.out.println("fps:" + this.field11 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.field8 + " mindel:" + this.field9);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.field12 = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("a.a(Z)V")
	public final void method3(boolean arg0) {
		this.field7 = -2;
		this.method8();
		if (this.field18 != null) {
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
	public final void method4(int arg0, int arg1) {
		if (arg0 == 0) {
			this.field8 = 1000 / arg1;
		}
	}

	public final void start() {
		if (this.field7 >= 0) {
			this.field7 = 0;
		}
	}

	public final void stop() {
		if (this.field7 >= 0) {
			this.field7 = 4000 / this.field8;
		}
	}

	public final void destroy() {
		this.field7 = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.field7 == -1) {
			this.method3(true);
		}
	}

	public final void update(Graphics arg0) {
		if (this.field15 == null) {
			this.field15 = arg0;
		}
		this.field19 = true;
		this.method10();
	}

	public final void paint(Graphics arg0) {
		if (this.field15 == null) {
			this.field15 = arg0;
		}
		this.field19 = true;
		this.method10();
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();

		this.field21 = 0;
		this.field26 = var2;
		this.field27 = var3;
		this.field28 = System.currentTimeMillis();

		try {
			if (arg0.getButton() == MouseEvent.BUTTON3) {
				this.field25 = 2;
				this.field22 = 2;
			} else {
				this.field25 = 1;
				this.field22 = 1;
			}

			if (InputTracking.field151) {
				InputTracking.method49(var2, var3, arg0.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (arg0.isMetaDown()) {
				this.field25 = 2;
				this.field22 = 2;
			} else {
				this.field25 = 1;
				this.field22 = 1;
			}

			if (InputTracking.field151) {
				InputTracking.method49(var2, var3, arg0.isMetaDown() ? 1 : 0);
			}
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.field21 = 0;
		this.field22 = 0;

		try {
			if (InputTracking.field151) {
				InputTracking.method50(arg0.getButton() == MouseEvent.BUTTON3 ? 1 : 0);
			}
		} catch (NoSuchMethodError ex) {
			if (InputTracking.field151) {
				InputTracking.method50(arg0.isMetaDown() ? 1 : 0);
			}
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (InputTracking.field151) {
			InputTracking.method56();
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		this.field21 = 0;
		this.field23 = -1;
		this.field24 = -1;
		if (InputTracking.field151) {
			InputTracking.method57();
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.field21 = 0;
		this.field23 = var2;
		this.field24 = var3;
		if (InputTracking.field151) {
			InputTracking.method51(var2, var3);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		this.field21 = 0;
		this.field23 = var2;
		this.field24 = var3;
		if (InputTracking.field151) {
			InputTracking.method51(var2, var3);
		}
	}

	public final void keyPressed(KeyEvent arg0) {
		this.field21 = 0;
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
			this.field33[var3] = 1;
		}
		if (var3 > 4) {
			this.field34[this.field36] = var3;
			this.field36 = this.field36 + 1 & 0x7F;
		}
		if (InputTracking.field151) {
			InputTracking.method52(var3);
		}
	}

	public final void keyReleased(KeyEvent arg0) {
		this.field21 = 0;
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
			this.field33[var3] = 0;
		}
		if (InputTracking.field151) {
			InputTracking.method53(var3);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.a(B)I")
	public final int method5() {
		int var2 = -1;
		if (this.field36 != this.field35) {
			var2 = this.field34[this.field35];
			this.field35 = this.field35 + 1 & 0x7F;
		}
		return var2;
	}

	public final void focusGained(FocusEvent arg0) {
		this.field20 = true;
		this.field19 = true;
		this.method10();
		if (InputTracking.field151) {
			InputTracking.method54();
		}
	}

	public final void focusLost(FocusEvent arg0) {
		this.field20 = false;
		if (InputTracking.field151) {
			InputTracking.method55();
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
	public void method6() {
	}

	@ObfuscatedName("a.b(B)V")
	public void update() {
	}

	@ObfuscatedName("a.b(Z)V")
	public void method8() {
	}

	@ObfuscatedName("a.a(I)V")
	public void method9() {
	}

	@ObfuscatedName("a.b(I)V")
	public void method10() {
	}

	@ObfuscatedName("a.c(I)Ljava/awt/Component;")
	public Component method11() {
		return this;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(BLjava/lang/String;I)V")
	public void method13(String arg1, int arg2) {
		while (this.field15 == null) {
			this.field15 = this.method11().getGraphics();
			try {
				this.method11().repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", Font.BOLD, 13);
		FontMetrics var5 = this.method11().getFontMetrics(var4);
		Font var6 = new Font("Helvetica", Font.PLAIN, 13);
		FontMetrics plainMetrics = this.method11().getFontMetrics(var6);
		if (this.field19) {
			this.field15.setColor(Color.black);
			this.field15.fillRect(0, 0, this.field13, this.field14);
			this.field19 = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.field14 / 2 - 18;
		this.field15.setColor(var7);
		this.field15.drawRect(this.field13 / 2 - 152, var8, 304, 34);
		this.field15.fillRect(this.field13 / 2 - 150, var8 + 2, arg2 * 3, 30);
		this.field15.setColor(Color.black);
		this.field15.fillRect(this.field13 / 2 - 150 + arg2 * 3, var8 + 2, 300 - arg2 * 3, 30);
		this.field15.setFont(var4);
		this.field15.setColor(Color.white);
		this.field15.drawString(arg1, (this.field13 - var5.stringWidth(arg1)) / 2, var8 + 22);
	}
}
