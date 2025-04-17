package deob;

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

	@ObfuscatedName("a.a")
	public byte field1 = 4;

	@ObfuscatedName("a.b")
	public int field2 = 370;

	@ObfuscatedName("a.c")
	public int field3 = 398;

	@ObfuscatedName("a.d")
	public int field4 = 11089;

	@ObfuscatedName("a.e")
	public int field5 = 11089;

	@ObfuscatedName("a.f")
	public boolean field6 = true;

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

	@ObfuscatedName("a.B")
	public long field28;

	@ObfuscatedName("a.F")
	public long field32;

	@ObfuscatedName("a.K")
	public static boolean field37;

	@ObfuscatedName("a.a(III)V")
	public final void method1(int arg0, int arg1, int arg2) {
		this.field13 = arg2;
		if (arg0 <= 0) {
			this.field2 = 381;
		}
		this.field14 = arg1;
		this.field18 = new ViewBox(this.field13, 992, this.field14, this);
		this.field15 = this.method11(3).getGraphics();
		this.field16 = new PixMap(this.method11(3), this.field14, this.field13, 2);
		this.method12(this, 1);
	}

	@ObfuscatedName("a.a(BII)V")
	public final void method2(byte arg0, int arg1, int arg2) {
		this.field13 = arg2;
		this.field14 = arg1;
		this.field15 = this.method11(3).getGraphics();
		this.field16 = new PixMap(this.method11(3), this.field14, this.field13, 2);
		if (arg0 != 57) {
			this.field2 = -103;
		}
		this.method12(this, 1);
	}

	public void run() {
		this.method11(3).addMouseListener(this);
		this.method11(3).addMouseMotionListener(this);
		this.method11(3).addKeyListener(this);
		this.method11(3).addFocusListener(this);
		if (this.field18 != null) {
			this.field18.addWindowListener(this);
		}
		this.method13(7, 0, "Loading...");
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
						this.method3(398);
					}
					return;
				}
				if (this.field7 > 0) {
					this.field7--;
					if (this.field7 == 0) {
						this.method3(398);
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
					this.method7(0);
					this.field35 = this.field36;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.field8 > 0) {
					this.field11 = var2 * 1000 / (this.field8 * 256);
				}
				this.method9(false);
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

	@ObfuscatedName("a.a(I)V")
	public final void method3(int arg0) {
		this.field7 = -2;
		int var2 = 12 / arg0;
		this.method8(this.field4);
		try {
			Thread.sleep(1000L);
		} catch (Exception var4) {
		}
		try {
			System.exit(0);
		} catch (Throwable var3) {
		}
	}

	@ObfuscatedName("a.a(II)V")
	public final void method4(int arg0, int arg1) {
		int var3 = 30 / arg1;
		this.field8 = 1000 / arg0;
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
			this.method3(398);
		}
	}

	public final void update(Graphics arg0) {
		if (this.field15 == null) {
			this.field15 = arg0;
		}
		this.field19 = true;
		this.method10(922);
	}

	public final void paint(Graphics arg0) {
		if (this.field15 == null) {
			this.field15 = arg0;
		}
		this.field19 = true;
		this.method10(922);
	}

	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field18 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field21 = 0;
		this.field26 = var2;
		this.field27 = var3;
		this.field28 = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.field25 = 2;
			this.field22 = 2;
		} else {
			this.field25 = 1;
			this.field22 = 1;
		}
		if (InputTracking.field149) {
			InputTracking.method49(var2, true, var3, arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseReleased(MouseEvent arg0) {
		this.field21 = 0;
		this.field22 = 0;
		if (InputTracking.field149) {
			InputTracking.method50(51, arg0.isMetaDown() ? 1 : 0);
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
	}

	public final void mouseEntered(MouseEvent arg0) {
		if (InputTracking.field149) {
			InputTracking.method56(19919);
		}
	}

	public final void mouseExited(MouseEvent arg0) {
		this.field21 = 0;
		this.field23 = -1;
		this.field24 = -1;
		if (InputTracking.field149) {
			InputTracking.method57((byte) 6);
		}
	}

	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field18 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field21 = 0;
		this.field23 = var2;
		this.field24 = var3;
		if (InputTracking.field149) {
			InputTracking.method51(var2, -7388, var3);
		}
	}

	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.field18 != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.field21 = 0;
		this.field23 = var2;
		this.field24 = var3;
		if (InputTracking.field149) {
			InputTracking.method51(var2, -7388, var3);
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
		if (InputTracking.field149) {
			InputTracking.method52(var3, (byte) 6);
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
		if (InputTracking.field149) {
			InputTracking.method53(var3, true);
		}
	}

	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("a.b(I)I")
	public final int method5(int arg0) {
		int var2 = -1;
		if (arg0 != 9) {
			return this.field4;
		}
		if (this.field36 != this.field35) {
			var2 = this.field34[this.field35];
			this.field35 = this.field35 + 1 & 0x7F;
		}
		return var2;
	}

	public final void focusGained(FocusEvent arg0) {
		this.field20 = true;
		this.field19 = true;
		this.method10(922);
		if (InputTracking.field149) {
			InputTracking.method54(this.field1);
		}
	}

	public final void focusLost(FocusEvent arg0) {
		this.field20 = false;
		if (InputTracking.field149) {
			InputTracking.method55(true);
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

	@ObfuscatedName("a.c(I)V")
	public void method7(int arg0) {
		if (arg0 != 0) {
			this.field3 = -142;
		}
	}

	@ObfuscatedName("a.d(I)V")
	public void method8(int arg0) {
		if (this.field5 != arg0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	@ObfuscatedName("a.a(Z)V")
	public void method9(boolean arg0) {
		if (arg0) {
			this.field5 = 499;
		}
	}

	@ObfuscatedName("a.e(I)V")
	public void method10(int arg0) {
		if (arg0 <= 0) {
			this.field2 = -243;
		}
	}

	@ObfuscatedName("a.f(I)Ljava/awt/Component;")
	public java.awt.Component method11(int arg0) {
		if (arg0 < 3 || arg0 > 3) {
			this.field6 = !this.field6;
		}
		return this.field18 == null ? this : this.field18;
	}

	@ObfuscatedName("a.a(Ljava/lang/Runnable;I)V")
	public void method12(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}

	@ObfuscatedName("a.a(IILjava/lang/String;)V")
	public void method13(int arg0, int arg1, String arg2) {
		while (this.field15 == null) {
			this.field15 = this.method11(3).getGraphics();
			try {
				this.method11(3).repaint();
			} catch (Exception var10) {
			}
			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}
		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.method11(3).getFontMetrics(var4);
		Font var6 = new Font("Helvetica", 0, 13);
		this.method11(3).getFontMetrics(var6);
		if (this.field19) {
			this.field15.setColor(Color.black);
			this.field15.fillRect(0, 0, this.field13, this.field14);
			this.field19 = false;
		}
		Color var7 = new Color(140, 17, 17);
		int var8 = this.field14 / 2 - 18;
		this.field15.setColor(var7);
		this.field15.drawRect(this.field13 / 2 - 152, var8, 304, 34);
		this.field15.fillRect(this.field13 / 2 - 150, var8 + 2, arg1 * 3, 30);
		this.field15.setColor(Color.black);
		this.field15.fillRect(arg1 * 3 + (this.field13 / 2 - 150), var8 + 2, 300 - arg1 * 3, 30);
		this.field15.setFont(var4);
		this.field15.setColor(Color.white);
		this.field15.drawString(arg2, (this.field13 - var5.stringWidth(arg2)) / 2, var8 + 22);
		if (arg0 == 7) {
			;
		}
	}
}
