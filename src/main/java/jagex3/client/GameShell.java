package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.graphics.PixMap;
import jagex3.io.BufferedRandomAccessFile;
import jagex3.io.DataFile;
import jagex3.util.JagString;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadUtil;
import jagex3.util.Timer;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;

@ObfuscatedName("kd")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("nc.o")
	public static final int deltime = 20;

	@ObfuscatedName("kd.d")
	public static long[] drawTime = new long[32];
	@ObfuscatedName("dc.lb")
	public static int mindel = 1;
	@ObfuscatedName("gb.y")
	public static SignLink signlink;
	@ObfuscatedName("ac.Y")
	public static PixMap drawArea;
	@ObfuscatedName("ld.A")
	public static Timer timer;
	@ObfuscatedName("bd.i")
	public static long killtime = 0L;
	@ObfuscatedName("dc.hb")
	public static int updateCount;
	@ObfuscatedName("pe.Mb")
	public static int sHei;
	@ObfuscatedName("dd.k")
	public static int sWid;
	@ObfuscatedName("ub.w")
	public static Canvas canvas;
	@ObfuscatedName("fe.Oc")
	public static boolean alreadyshutdown = false;
	@ObfuscatedName("mc.n")
	public static Frame frame;
	@ObfuscatedName("ae.g")
	public static GameShell shell = null;
	@ObfuscatedName("qa.Fb")
	public static volatile boolean fullredraw = true;
	@ObfuscatedName("wb.b")
	public static volatile boolean canvasReplaceRecommended = false;
	@ObfuscatedName("rc.e")
	public static volatile boolean focus_in = true;
	@ObfuscatedName("la.b")
	public static int drawPos;
	@ObfuscatedName("rc.i")
	public static int fps = 0;
	@ObfuscatedName("nd.p")
	public static int redrawNum = 500;
	@ObfuscatedName("wb.O")
	public static long[] updateTime = new long[32];
	@ObfuscatedName("ub.v")
	public static int updatePos;
	@ObfuscatedName("i.w")
	public static boolean focus;
	@ObfuscatedName("ae.b")
	public static volatile long lastCanvasReplace = 0L;
	@ObfuscatedName("f.p")
	public static Font progressFont;
	@ObfuscatedName("ca.u")
	public static FontMetrics progressFontMetrics;
	@ObfuscatedName("ie.i")
	public static Image progressBar;
	@ObfuscatedName("ec.Ib")
	public static BufferedRandomAccessFile cacheDat;
	@ObfuscatedName("hd.ub")
	public static BufferedRandomAccessFile[] cacheIndex = new BufferedRandomAccessFile[13];
	@ObfuscatedName("la.n")
	public static BufferedRandomAccessFile field1668;
	@ObfuscatedName("fd.zb")
	public static DataFile masterIndex;

	@ObfuscatedName("kd.Q")
	public boolean alreadyerrored = false;

	@ObfuscatedName("j.a(ILjava/awt/Color;La;I)V")
	public static void drawProgress(int arg0, Color arg1, JagString arg2) {
		try {
			Graphics var3 = canvas.getGraphics();
			if (progressFont == null) {
				progressFont = new Font("Helvetica", 1, 13);
				progressFontMetrics = canvas.getFontMetrics(progressFont);
			}
			if (fullredraw) {
				fullredraw = false;
				var3.setColor(Color.black);
				var3.fillRect(0, 0, sWid, sHei);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (progressBar == null) {
					progressBar = canvas.createImage(304, 34);
				}
				Graphics var4 = progressBar.getGraphics();
				var4.setColor(arg1);
				var4.drawRect(0, 0, 303, 33);
				var4.fillRect(2, 2, arg0 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(1, 1, 301, 31);
				var4.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				var4.setFont(progressFont);
				var4.setColor(Color.white);
				arg2.drawString((304 - arg2.stringWidth(progressFontMetrics)) / 2, 22, var4);
				var3.drawImage(progressBar, sWid / 2 - 152, sHei / 2 + -18, null);
			} catch (Exception var7) {
				int var5 = sWid / 2 - 152;
				int var6 = sHei / 2 - 18;
				var3.setColor(arg1);
				var3.drawRect(var5, var6, 303, 33);
				var3.fillRect(var5 + 2, var6 - -2, arg0 * 3, 30);
				var3.setColor(Color.black);
				var3.drawRect(var5 + 1, var6 + 1, 301, 31);
				var3.fillRect(arg0 * 3 + var5 + 2, var6 + 2, 300 - arg0 * 3, 30);
				var3.setFont(progressFont);
				var3.setColor(Color.white);
				arg2.drawString((304 - arg2.stringWidth(progressFontMetrics)) / 2 + var5, var6 + 22, var3);
			}
		} catch (Exception var8) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("td.c(I)V")
	public static void doneslowupdate() {
		timer.init();
		for (int var0 = 0; var0 < 32; var0++) {
			drawTime[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			updateTime[var1] = 0L;
		}
		updateCount = 0;
	}

	@ObfuscatedName("ha.b(I)V")
	public static void doneslowupdate2() {
		timer.reset();
		for (int var0 = 0; var0 < 32; var0++) {
			drawTime[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			updateTime[var1] = 0L;
		}
		updateCount = 0;
	}

    @ObfuscatedName("ad.a(I)V")
    public static void method108() {
        GameShell.progressFontMetrics = null;
        GameShell.progressFont = null;
        GameShell.progressBar = null;
    }

    @Override
	public final void run() {
		try {
			if (SignLink.javaVendor != null) {
				String var1 = SignLink.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = SignLink.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					mindel = 5;
				} else if (var1.indexOf("ibm") != -1 && (SignLink.javaVersion == null || SignLink.javaVersion.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			if (signlink.applet != null) {
				Method var3 = SignLink.setFocusCycleRoot;
				if (var3 != null) {
					try {
						var3.invoke(signlink.applet, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
			}
			this.addCanvas();
			drawArea = PixMap.createSafe(sHei, sWid, canvas);
			this.maininit();
			timer = Timer.create();
			timer.init();
			while (killtime == 0L || MonotonicTime.currentTime() < killtime) {
				updateCount = timer.count(deltime, mindel);
				for (int var4 = 0; var4 < updateCount; var4++) {
					this.mainloopwrapper();
				}
				this.maindrawwrapper();
			}
		} catch (Exception var7) {
			JagException.report(null, var7);
			this.error("crash");
		}
		this.shutdown();
	}

	@ObfuscatedName("kd.b(I)V")
	public synchronized void shutdown() {
		if (alreadyshutdown) {
			return;
		}
		alreadyshutdown = true;
		try {
			canvas.removeFocusListener(this);
		} catch (Exception var4) {
		}
		try {
			this.mainquit();
		} catch (Exception var3) {
		}
		if (frame != null) {
			try {
				System.exit(0);
			} catch (Throwable var2) {
			}
		}
		if (signlink != null) {
			try {
				signlink.method647();
			} catch (Exception var1) {
			}
		}
		this.unload();
	}

	@Override
	public final void stop() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime() + 4000L;
		}
	}

	@ObfuscatedName("kd.c(I)Z")
	public final boolean checkhost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (var1.endsWith("jagex.com")) {
			return true;
		} else if (var1.endsWith("runescape.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}
			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.error("invalidhost");
				return false;
			}
		}
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.a(BLjava/lang/String;)V")
	public final void error(String arg0) {
		if (this.alreadyerrored) {
			return;
		}
		this.alreadyerrored = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (Exception var2) {
		}
	}

	@Override
	public final void start() {
		if (shell == this && !alreadyshutdown) {
			killtime = 0L;
		}
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		focus_in = false;
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (shell != this || alreadyshutdown) {
			return;
		}
		fullredraw = true;
		if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.5") && MonotonicTime.currentTime() - lastCanvasReplace > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || sWid <= var2.width && var2.height >= sHei) {
				canvasReplaceRecommended = true;
			}
		}
	}

	@Override
	public final void destroy() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime();
			ThreadUtil.sleepPrecise(5000L);
			JagException.signlink = null;
			this.shutdown();
		}
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		focus_in = true;
		fullredraw = true;
	}

	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.a(BIIII)V")
	public final void method621(int arg0) {
		try {
			if (shell != null) {
				this.error("alreadyloaded");
				return;
			}
			sWid = 765;
			JagException.revision = 435;
			sHei = 503;
			shell = this;
			if (signlink == null) {
				JagException.signlink = signlink = new SignLink(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
			}
			signlink.threadreq(1, this);
		} catch (Exception var3) {
			JagException.report(null, var3);
			this.error("crash");
		}
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	public static void providesignlink(SignLink arg0) {
		signlink = arg0;
		JagException.signlink = arg0;
	}

	@ObfuscatedName("kd.a(B)V")
	public void maindrawwrapper() {
		long var1 = MonotonicTime.currentTime();
		long var3 = drawTime[drawPos];
		drawTime[drawPos] = var1;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			fps = ((var5 >> 1) + 32000) / var5;
		}
		drawPos = drawPos + 1 & 0x1F;
		if (redrawNum++ > 50) {
			redrawNum -= 50;
			fullredraw = true;
			canvas.setSize(sWid, sHei);
			canvas.setVisible(true);
			if (frame == null) {
				canvas.setLocation(0, 0);
			} else {
				Insets var6 = frame.getInsets();
				canvas.setLocation(var6.left, var6.top);
			}
		}
		this.mainredraw();
	}

	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.b(Z)V")
	public void mainloopwrapper() {
		long var1 = MonotonicTime.currentTime();
		long var3 = updateTime[updatePos];
		boolean var10000;
		if (var3 == 0L || var1 <= var3) {
			var10000 = false;
		} else {
			var10000 = true;
		}
		updateTime[updatePos] = var1;
		updatePos = updatePos + 1 & 0x1F;
		synchronized (this) {
			focus = focus_in;
		}
		this.mainloop();
	}

	@ObfuscatedName("kd.a(Ljava/lang/String;IIIILjava/net/InetAddress;II)V")
	public final void startApplication(String arg0, int arg1, int arg2, int arg3, InetAddress arg4, int arg5, int arg6) {
		try {
			JagException.revision = arg5;
			sWid = arg6;
			shell = this;
			sHei = arg2;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(false);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			Insets var8 = frame.getInsets();
			frame.setSize(arg6 + var8.left + var8.right, var8.top + var8.bottom + arg2);
			JagException.signlink = signlink = new SignLink(true, null, arg4, arg3, arg0, arg1);
			signlink.threadreq(1, this);
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@Override
	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final String getParameter(String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.b(B)V")
	public final synchronized void addCanvas() {
		Container var1;
		if (frame == null) {
			var1 = signlink.applet;
		} else {
			var1 = frame;
		}
		if (canvas != null) {
			canvas.removeFocusListener(this);
			var1.remove(canvas);
		}
		canvas = new GameCanvas(this);
		var1.add(canvas);
		canvas.setSize(sWid, sHei);
		canvas.setVisible(true);
		if (frame == null) {
			canvas.setLocation(0, 0);
		} else {
			Insets var2 = frame.getInsets();
			canvas.setLocation(var2.left, var2.top);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		fullredraw = true;
		canvasReplaceRecommended = false;
		lastCanvasReplace = MonotonicTime.currentTime();
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.a(I)V")
	public abstract void unload();

	public abstract void init();

	@ObfuscatedName("kd.d(I)V")
	public abstract void mainloop();

	@ObfuscatedName("kd.e(I)V")
	public abstract void mainquit();

	@ObfuscatedName("kd.c(Z)V")
	public abstract void maininit();

	@ObfuscatedName("kd.f(I)V")
	public abstract void mainredraw();
}
