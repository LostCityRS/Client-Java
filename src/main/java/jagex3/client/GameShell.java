package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.applet.SignLink;
import jagex3.graphics.PixMap;
import jagex3.io.BufferedRandomAccessFile;
import jagex3.io.DataFile;
import jagex3.io.Packet;
import jagex3.util.JagString;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadSleep;
import jagex3.util.Timer;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

@ObfuscatedName("lf")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("o.Kb")
	public static final int deltime = 20;
	@ObfuscatedName("wa.x")
	public static SignLink signlink;
	@ObfuscatedName("we.l")
	public static volatile boolean canvasReplaceRecommended = false;
	@ObfuscatedName("pc.y")
	public static Canvas canvas;
	@ObfuscatedName("a.c")
	public static volatile boolean fullredraw = true;
	@ObfuscatedName("ha.D")
	public static PixMap drawArea;
	@ObfuscatedName("ga.sb")
	public static BufferedRandomAccessFile cacheDat;
	@ObfuscatedName("r.q")
	public static BufferedRandomAccessFile[] cacheIndex = new BufferedRandomAccessFile[16];
	@ObfuscatedName("vf.A")
	public static BufferedRandomAccessFile masterIndex;
	@ObfuscatedName("ta.R")
	public static BufferedRandomAccessFile uidDat;
	@ObfuscatedName("t.m")
	public static DataFile field3032;
	@ObfuscatedName("j.bb")
	public static GameShell shell = null;
	@ObfuscatedName("bc.n")
	public static Frame frame;
	@ObfuscatedName("ed.q")
	public static int sHei;
	@ObfuscatedName("ue.E")
	public static int sWid;
	@ObfuscatedName("hd.Nb")
	public static long killtime = 0L;
	@ObfuscatedName("j.eb")
	public static boolean alreadyshutdown = false;
	@ObfuscatedName("s.f")
	public static long[] updateTime = new long[32];
	@ObfuscatedName("v.n")
	public static int updatePos;
	@ObfuscatedName("sa.l")
	public static boolean focus;
	@ObfuscatedName("de.d")
	public static volatile boolean focus_in = true;
	@ObfuscatedName("ja.d")
	public static volatile long lastCanvasReplace = 0L;
	@ObfuscatedName("mb.d")
	public static Timer timer;
	@ObfuscatedName("ga.pb")
	public static long[] drawTime = new long[32];
	@ObfuscatedName("pa.h")
	public static int updateCount;
	@ObfuscatedName("q.Xc")
	public static int drawPos;
	@ObfuscatedName("oa.R")
	public static int fps = 0;
	@ObfuscatedName("qb.e")
	public static int redrawNum = 500;
	@ObfuscatedName("ec.M")
	public static Font progressFont;
	@ObfuscatedName("qa.s")
	public static FontMetrics progressFontMetrics;
	@ObfuscatedName("oe.m")
	public static Image progressBar;
	@ObfuscatedName("ke.b")
	public static int mindel = 1;
	@ObfuscatedName("lf.i")
	public boolean alreadyerrored = false;

	public static void providesignlink(SignLink arg0) {
		signlink = arg0;
		JagException.signlink = arg0;
	}

	@ObfuscatedName("qb.a(I)V")
	public static void doneslowupdate() {
		timer.method57();
		for (int var0 = 0; var0 < 32; var0++) {
			drawTime[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			updateTime[var1] = 0L;
		}
		updateCount = 0;
	}

	@ObfuscatedName("te.a(Lec;ILjava/awt/Color;I)V")
	public static void drawProgress(JagString arg0, Color arg1, int arg2) {
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
				var4.fillRect(2, 2, arg2 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(1, 1, 301, 31);
				var4.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				var4.setFont(progressFont);
				var4.setColor(Color.white);
				arg0.drawString((304 - arg0.stringWidth(progressFontMetrics)) / 2, 22, var4);
				var3.drawImage(progressBar, sWid / 2 - 152, sHei / 2 - 18, null);
			} catch (Exception var7) {
				int var5 = sHei / 2 - 18;
				int var6 = sWid / 2 - 152;
				var3.setColor(arg1);
				var3.drawRect(var6, var5, 303, 33);
				var3.fillRect(var6 + 2, var5 + 2, arg2 * 3, 30);
				var3.setColor(Color.black);
				var3.drawRect(var6 + 1, var5 + 1, 301, 31);
				var3.fillRect(arg2 * 3 + var6 + 2, var5 + 2, 300 - arg2 * 3, 30);
				var3.setFont(progressFont);
				var3.setColor(Color.white);
				arg0.drawString(var6 + (304 - arg0.stringWidth(progressFontMetrics)) / 2, var5 - -22, var3);
			}
		} catch (Exception var8) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("nd.a(B)V")
	public static void resetProgress() {
		progressFont = null;
		progressFontMetrics = null;
		progressBar = null;
	}

    @ObfuscatedName("bf.a(ILjd;)V")
    public static void storeUID192(Packet arg0) {
        if (uidDat != null) {
            try {
                uidDat.method1184(0L);
                uidDat.method1175(arg0.data, 24, arg0.pos);
            } catch (Exception var1) {
            }
        }
        arg0.pos += 24;
    }

	@ObfuscatedName("v.a(Ljd;B)V")
	public static void pushUID192(Packet arg0) {
		byte[] var1 = new byte[24];
		if (uidDat != null) {
			try {
				uidDat.method1184(0L);
				int var2 = 0;
				uidDat.method1182(var1);
				while (var2 < 24 && var1[var2] == 0) {
					var2++;
				}
				if (var2 >= 24) {
					throw new IOException();
				}
			} catch (Exception var4) {
				for (int var3 = 0; var3 < 24; var3++) {
					var1[var3] = -1;
				}
			}
		}
		arg0.method543(24, var1);
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		focus_in = false;
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@Override
	public final String getParameter(String arg0) {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getParameter(arg0) : signlink.applet.getParameter(arg0);
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.a(I)V")
	public abstract void mainloop();

	@Override
	public final void start() {
		if (shell == this && !alreadyshutdown) {
			killtime = 0L;
		}
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.b(I)Z")
	public final boolean checkhost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
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
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getCodeBase() : signlink.applet.getCodeBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.a(B)V")
	public abstract void maininit();

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.a(IIILjava/lang/String;III)V")
	public final void startApplication(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
		try {
			shell = this;
			sHei = arg5;
			JagException.revision = arg2;
			sWid = arg4;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(false);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			Insets var8 = frame.getInsets();
			frame.setSize(var8.right + var8.left + arg4, var8.bottom + (arg5 - -var8.top));
			JagException.signlink = signlink = new SignLink(true, null, arg6, arg3, arg0);
			signlink.threadreq(arg1, this, arg1 ^ 0x67);
		} catch (Exception var10) {
			JagException.report(var10, null);
		}
	}

	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public final void stop() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime() + 4000L;
		}
	}

	@ObfuscatedName("lf.d(I)V")
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
				signlink.close();
			} catch (Exception var1) {
			}
		}
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.c(B)V")
	public void mainloopwrapper() {
		long var1 = MonotonicTime.currentTime();
		long var3 = updateTime[updatePos];
		boolean var10000;
		if (var3 == 0L || var3 >= var1) {
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

	@ObfuscatedName("lf.a(Z)V")
	public abstract void mainquit();

	@Override
	public final void focusGained(FocusEvent arg0) {
		focus_in = true;
		fullredraw = true;
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (shell != this || alreadyshutdown) {
			return;
		}
		fullredraw = true;
		if (SignLink.javaVersion != null && SignLink.javaVersion.startsWith("1.5") && MonotonicTime.currentTime() - lastCanvasReplace > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= sWid && sHei <= var2.height) {
				canvasReplaceRecommended = true;
			}
		}
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
			drawArea = PixMap.create(sHei, sWid, canvas);
			this.maininit();
			timer = Timer.create();
			while (killtime == 0L || MonotonicTime.currentTime() < killtime) {
				updateCount = timer.count(deltime, mindel);
				for (int var4 = 0; var4 < updateCount; var4++) {
					this.mainloopwrapper();
				}
				this.maindrawwrapper();
				SignLink.flushEvents(canvas, signlink);
			}
		} catch (Exception var7) {
			JagException.report(var7, null);
			this.error("crash");
		}
		this.shutdown();
	}

	@ObfuscatedName("lf.e(I)V")
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

	@ObfuscatedName("lf.f(I)V")
	public void maindrawwrapper() {
		long var1 = MonotonicTime.currentTime();
		long var3 = drawTime[drawPos];
		drawTime[drawPos] = var1;
		drawPos = drawPos + 1 & 0x1F;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			fps = ((var5 >> 1) + 32000) / var5;
		}
		if (redrawNum++ > 50) {
			fullredraw = true;
			redrawNum -= 50;
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

	@ObfuscatedName("lf.a(IIIII)V")
	public final void startCommon(int arg0) {
		try {
			if (shell == null) {
				shell = this;
				sWid = 765;
				sHei = 503;
				JagException.revision = 468;
				if (signlink == null) {
					JagException.signlink = signlink = new SignLink(false, this, arg0, null, 0);
				}
				signlink.threadreq(1, this, 109);
			} else {
				Client.alreadyloaded++;
				if (Client.alreadyloaded >= 3) {
					this.error("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (Exception var3) {
			JagException.report(var3, null);
			this.error("crash");
		}
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public abstract void init();

	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.g(I)V")
	public abstract void mainredraw();

	@Override
	public final void destroy() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime();
			ThreadSleep.sleepPrecise(5000L);
			JagException.signlink = null;
			this.shutdown();
		}
	}

	@ObfuscatedName("lf.a(BLjava/lang/String;)V")
	public final void error(String arg0) {
		if (this.alreadyerrored) {
			return;
		}
		this.alreadyerrored = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (Exception var2) {
		}
	}

	@Override
	public final void update(Graphics arg0) {
		this.paint(arg0);
	}
}
