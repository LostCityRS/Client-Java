package jagex3.client;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.graphics.PixMap;
import jagex3.io.BufferedRandomAccessFile;
import jagex3.io.Packet;
import jagex3.jstring.JagString;
import jagex3.util.MonotonicTime;
import jagex3.util.ThreadSleep;
import jagex3.util.Timer;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@ObfuscatedName("hj")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("lf.O")
	public static SignLink signlink;

	@ObfuscatedName("ej.s")
	public static GameShell shell = null;

	@ObfuscatedName("ag.g")
	public static int loaded = 0;

	@ObfuscatedName("da.X")
	public static long killtime = 0L;

	@ObfuscatedName("ec.U")
	public static boolean alreadyshutdown = false;

	@ObfuscatedName("hj.y")
	public boolean alreadyerrored = false;

	@ObfuscatedName("oa.C")
	public static int updateCount;

	@ObfuscatedName("pb.a")
	public static int deltime = 20;

	@ObfuscatedName("lj.o")
	public static int mindel = 1;

	@ObfuscatedName("ba.h")
	public static int fps = 0;

	@ObfuscatedName("na.W")
	public static Timer timer;

	@ObfuscatedName("ia.J")
	public static final long[] drawTime = new long[32];

	@ObfuscatedName("kg.db")
	public static int drawPos;

	@ObfuscatedName("ec.O")
	public static final long[] updateTime = new long[32];

	@ObfuscatedName("je.D")
	public static int updatePos;

	@ObfuscatedName("ud.n")
	public static int sWid;

	@ObfuscatedName("nc.l")
	public static int sHei;

	@ObfuscatedName("na.L")
	public static Image progressBar;

	@ObfuscatedName("bc.g")
	public static Font progressFont;

	@ObfuscatedName("se.i")
	public static FontMetrics progressFontMetrics;

	@ObfuscatedName("sf.l")
	public static PixMap drawArea;

	@ObfuscatedName("se.a")
	public static Frame frame;

	@ObfuscatedName("ob.l")
	public static Canvas canvas;

	@ObfuscatedName("eh.e")
	public static volatile boolean fullredraw = true;

	@ObfuscatedName("hj.r")
	public static int redrawNum = 500;

	@ObfuscatedName("kg.T")
	public static volatile long lastCanvasReplace = 0L;

	@ObfuscatedName("ki.m")
	public static volatile boolean focus_in = true;

	@ObfuscatedName("qa.b")
	public static boolean focus;

	// ---- todo: sort fields

	@ObfuscatedName("ed.j")
	public static final JagString field920 = JagString.wrap("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
	@ObfuscatedName("k.bb")
	public static final JagString field1982 = JagString.wrap("; Expires=");
	@ObfuscatedName("ui.S")
	public static final JagString field4265 = JagString.wrap("cookieprefix");
	@ObfuscatedName("wh.J")
	public static final JagString field4516 = JagString.wrap("cookiehost");
	@ObfuscatedName("db.T")
	public static final JagString field651 = JagString.wrap("settings=");
	@ObfuscatedName("ei.d")
	public static final JagString field1005 = JagString.wrap("; version=1; path=)4; domain=");
	@ObfuscatedName("d.eb")
	public static final JagString field591 = JagString.wrap("(R");
	@ObfuscatedName("ih.i")
	public static final JagString field1767 = JagString.wrap("; Max)2Age=");
	@ObfuscatedName("pe.C")
	public static final JagString field3237 = JagString.wrap("document)3cookie=(R");
	@ObfuscatedName("wi.o")
	public static final Calendar field4545 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	@ObfuscatedName("ia.l")
	public static final JagString field1672 = JagString.wrap("Thu");
	@ObfuscatedName("ia.s")
	public static final JagString field1679 = JagString.wrap("Fri");
	@ObfuscatedName("ia.u")
	public static final JagString field1681 = JagString.wrap("Wed");
	@ObfuscatedName("ia.D")
	public static final JagString field1690 = JagString.wrap("Tue");
	@ObfuscatedName("ia.F")
	public static final JagString field1692 = JagString.wrap("Sun");
	@ObfuscatedName("ia.y")
	public static final JagString field1685 = JagString.wrap("Sat");
	@ObfuscatedName("ia.E")
	public static final JagString field1691 = JagString.wrap("Mon");
	@ObfuscatedName("ia.m")
	public static final JagString[] field1673 = new JagString[] { field1692, field1691, field1690, field1681, field1672, field1679, field1685 };
	@ObfuscatedName("db.bb")
	public static final JagString field659 = JagString.wrap("Nov");
	@ObfuscatedName("db.db")
	public static final JagString field661 = JagString.wrap("Jun");
	@ObfuscatedName("db.s")
	public static final JagString field624 = JagString.wrap("Jul");
	@ObfuscatedName("db.w")
	public static final JagString field628 = JagString.wrap("Dec");
	@ObfuscatedName("db.A")
	public static final JagString field632 = JagString.wrap("Aug");
	@ObfuscatedName("db.V")
	public static final JagString field653 = JagString.wrap("Sep");
	@ObfuscatedName("db.L")
	public static final JagString field643 = JagString.wrap("Mar");
	@ObfuscatedName("db.N")
	public static final JagString field645 = JagString.wrap("Jan");
	@ObfuscatedName("db.I")
	public static final JagString field640 = JagString.wrap("Oct");
	@ObfuscatedName("db.K")
	public static final JagString field642 = JagString.wrap("Feb");
	@ObfuscatedName("db.U")
	public static final JagString field652 = JagString.wrap("Apr");
	@ObfuscatedName("db.Y")
	public static final JagString field656 = JagString.wrap("May");
	@ObfuscatedName("db.ab")
	public static final JagString[] field658 = new JagString[] {field645, field642, field643, field652, field656, field661, field624, field632, field653, field640, field659, field628};
	@ObfuscatedName("pa.a")
	public static final JagString field3135 = JagString.wrap(")2");
	@ObfuscatedName("ui.P")
	public static final JagString field4262 = JagString.wrap(" ");
	@ObfuscatedName("k.D")
	public static final JagString field1959 = JagString.wrap(":");
	@ObfuscatedName("ae.Vb")
	public static final JagString field82 = JagString.wrap(" GMT");
	@ObfuscatedName("s.mb")
	public static final JagString field3772 = JagString.wrap(")1 ");

	@ObfuscatedName("bf.J")
	public static BufferedRandomAccessFile cacheDat;

	@ObfuscatedName("qa.k")
	public static BufferedRandomAccessFile randomDat;

	@ObfuscatedName("jf.hb")
	public static BufferedRandomAccessFile masterIndexFile;

	@ObfuscatedName("wg.s")
	public static final BufferedRandomAccessFile[] cacheIndex = new BufferedRandomAccessFile[27];

	@ObfuscatedName("ne.a")
	public static JagString loadingText = null;

	@ObfuscatedName("hj.a(IIIIIILjava/lang/String;)V")
	public final void startApplication(int arg0, int arg1, int arg2, int arg3, int arg4, String arg6) {
		try {
			sWid = arg2;
			shell = this;
			sHei = arg1;
			JagException.revision = arg3;
			frame = new Frame();
			frame.setTitle("Jagex");
			frame.setResizable(false);
			frame.addWindowListener(this);
			frame.setVisible(true);
			frame.toFront();
			Insets var8 = frame.getInsets();
			frame.setSize(var8.right + arg2 + var8.left, var8.bottom + arg1 - -var8.top);
			JagException.signlink = signlink = new SignLink(true, null, arg4, arg6, arg0);
			signlink.threadreq(this, 1);
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("hj.a(BIIII)V")
	public final void startCommon(int arg0) {
		try {
			if (shell == null) {
				sWid = 765;
				shell = this;
				sHei = 503;
				JagException.revision = 500;
				if (signlink == null) {
					JagException.signlink = signlink = new SignLink(false, this, arg0, null, 0);
				}
				signlink.threadreq(this, 1);
			} else {
				loaded++;
				if (loaded >= 3) {
					this.error("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (Exception var3) {
			JagException.report(null, var3);
			this.error("crash");
		}
	}

	@ObfuscatedName("hj.b(B)V")
	public synchronized void addcanvas() {
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
		lastCanvasReplace = MonotonicTime.currentTime();
	}

	@ObfuscatedName("hj.f(I)Z")
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
			this.addcanvas();
			drawArea = PixMap.method1259(sWid, canvas, sHei);
			this.maininit();
			timer = Timer.create();
			while (killtime == 0L || killtime > MonotonicTime.currentTime()) {
				updateCount = timer.count(mindel, deltime);
				for (int var4 = 0; var4 < updateCount; var4++) {
					this.mainloopwrapper();
				}
				this.mainredrawwrapper();
				flushEvents(canvas, signlink);
			}
		} catch (Exception var7) {
			JagException.report(null, var7);
			this.error("crash");
		}
		this.shutdown(true);
	}

	@ObfuscatedName("hj.a(B)V")
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

	@ObfuscatedName("hj.c(I)V")
	public void mainredrawwrapper() {
		long var1 = MonotonicTime.currentTime();
		long var3 = drawTime[drawPos];
		drawTime[drawPos] = var1;
		drawPos = drawPos + 1 & 0x1F;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			fps = ((var5 >> 1) + 32000) / var5;
		}
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

	@ObfuscatedName("hj.a(IZ)V")
	public void shutdown(boolean clean) {
		synchronized (this) {
			if (alreadyshutdown) {
				return;
			}
			alreadyshutdown = true;
		}
		if (signlink.applet != null) {
			signlink.applet.destroy();
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				Container var3;
				if (frame == null) {
					var3 = signlink.applet;
				} else {
					var3 = frame;
				}
				var3.remove(canvas);
			} catch (Exception var7) {
			}
		}
		try {
			this.mainquit();
		} catch (Exception var6) {
		}
		if (signlink != null) {
			try {
				signlink.close();
			} catch (Exception var5) {
			}
		}
		this.onKilled();
		if (frame != null) {
			try {
				System.exit(0);
			} catch (Throwable var4) {
			}
		}
		System.out.println("Shutdown complete - clean:" + clean);
	}

	@ObfuscatedName("jj.a(Z)V")
	public static void doneslowupdate() {
		timer.reset();
		for (int var0 = 0; var0 < 32; var0++) {
			drawTime[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			updateTime[var1] = 0L;
		}
		updateCount = 0;
	}

	@Override
	public final void start() {
		if (shell == this && !alreadyshutdown) {
			killtime = 0L;
		}
	}

	@Override
	public final void stop() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime() + 4000L;
		}
	}

	@Override
	public final void destroy() {
		if (shell == this && !alreadyshutdown) {
			killtime = MonotonicTime.currentTime();
			ThreadSleep.sleepPrecise(5000L);
			JagException.signlink = null;
			this.shutdown(false);
		}
	}

	@Override
	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (shell != this || alreadyshutdown) {
			return;
		}
		fullredraw = true;
		if (SignLink.javaVersion == null || !SignLink.javaVersion.startsWith("1.5") || MonotonicTime.currentTime() - lastCanvasReplace <= 1000L) {
			return;
		}
		Rectangle var2 = arg0.getClipBounds();
		boolean var10000;
		if (var2 == null || var2.width >= sWid && sHei <= var2.height) {
			var10000 = true;
		} else {
			var10000 = false;
		}
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		focus_in = true;
		fullredraw = true;
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		focus_in = false;
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
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

	@ObfuscatedName("hj.a(BLjava/lang/String;)V")
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

	@ObfuscatedName("hj.d(I)V")
	public abstract void mainquit();

	@ObfuscatedName("hj.b(I)V")
	public abstract void maininit();

	@ObfuscatedName("hj.c(B)V")
	public abstract void mainloop();

	@ObfuscatedName("hj.a(I)V")
	public abstract void onKilled();

	@ObfuscatedName("hj.e(I)V")
	public abstract void mainredraw();

	@Override
	public abstract void init();

	@ObfuscatedName("pc.a(ILjava/awt/Color;Li;ZI)V")
	public static void drawProgress(Color arg0, JagString arg1, boolean arg2, int arg3) {
		try {
			Graphics var4 = canvas.getGraphics();
			if (progressFont == null) {
				progressFont = new Font("Helvetica", 1, 13);
				progressFontMetrics = canvas.getFontMetrics(progressFont);
			}
			if (arg2) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, sWid, sHei);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (progressBar == null) {
					progressBar = canvas.createImage(304, 34);
				}
				Graphics var5 = progressBar.getGraphics();
				var5.setColor(arg0);
				var5.drawRect(0, 0, 303, 33);
				var5.fillRect(2, 2, arg3 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(1, 1, 301, 31);
				var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				var5.setFont(progressFont);
				var5.setColor(Color.white);
				arg1.drawString((304 - arg1.stringWidth(progressFontMetrics)) / 2, 22, var5);
				var4.drawImage(progressBar, sWid / 2 - 152, sHei / 2 + -18, null);
			} catch (Exception var8) {
				int var6 = sWid / 2 - 152;
				int var7 = sHei / 2 - 18;
				var4.setColor(arg0);
				var4.drawRect(var6, var7, 303, 33);
				var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var6 + 1, var7 + 1, 301, 31);
				var4.fillRect(arg3 * 3 + var6 + 2, var7 + 2, 300 - arg3 * 3, 30);
				var4.setFont(progressFont);
				var4.setColor(Color.white);
				arg1.drawString(var6 + (304 - arg1.stringWidth(progressFontMetrics)) / 2, var7 + 22, var4);
			}
			if (loadingText != null) {
				var4.setFont(progressFont);
				var4.setColor(Color.white);
				loadingText.drawString(sWid / 2 - loadingText.stringWidth(progressFontMetrics) / 2, sHei / 2 + -26, var4);
			}
		} catch (Exception var9) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("mc.a(I)V")
	public static void resetProgress() {
		progressFont = null;
		progressFontMetrics = null;
		progressBar = null;
	}

	//  ---- todo: sort methods

	public static void providesignlink(SignLink arg0) {
		signlink = arg0;
		JagException.signlink = arg0;
	}

	@ObfuscatedName("ac.a(Lea;B)V")
	public static void pushUID192(Packet arg0) {
		byte[] var1 = new byte[24];
		if (randomDat != null) {
			try {
				randomDat.seek(0L);
				randomDat.read(var1);
				int var2;
				for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
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
		arg0.pdata(24, var1);
	}

	@ObfuscatedName("jg.a(Lea;Z)V")
	public static void updateUID192(Packet arg0) {
		if (randomDat != null) {
			try {
				randomDat.seek(0L);
				randomDat.write(arg0.data, 24, arg0.pos);
			} catch (Exception var1) {
			}
		}
		arg0.pos += 24;
	}

	@ObfuscatedName("ng.a(ILjava/lang/Object;Lqg;)V")
	public static void flushEvents(Object arg0, SignLink arg1) {
		if (arg1.eventQueue == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && arg1.eventQueue.peekEvent() != null; var2++) {
			ThreadSleep.sleepPrecise(1L);
		}
		if (arg0 != null) {
			arg1.eventQueue.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("og.c(II)V")
	public static void setFramerate(int arg0) {
		deltime = 1000 / arg0;
	}

	@ObfuscatedName("pb.b(ILi;)V")
	public static void method1138(JagString arg0) {
		try {
			shell.getAppletContext().showDocument(arg0.resolveURL(shell.getCodeBase()), "_blank");
		} catch (Exception var1) {
		}
	}

	@ObfuscatedName("pb.a(ILi;)V")
	public static void method1132(JagString arg0) {
		if (signlink.applet == null) {
			return;
		}
		try {
			JagString var1 = field4265.getParameter(signlink.applet);
			JagString var2 = field4516.getParameter(signlink.applet);
			JagString var3 = JagString.join(new JagString[] { var1, field651, arg0, field1005, var2 });
			JagString var4;
			if (arg0.length() == 0) {
				var4 = JagString.join(new JagString[] { var3, field920});
			} else {
				var4 = JagString.join(new JagString[] { var3, field1982, method1139(MonotonicTime.currentTime() + 94608000000L), field1767, JagString.valueOf(94608000L) });
			}
			JagString.join(new JagString[] {field3237, var4, field591}).eval(signlink.applet);
		} catch (Throwable var5) {
		}
	}

	@ObfuscatedName("pb.a(JI)Li;")
	public static JagString method1139(long arg0) {
		field4545.setTime(new Date(arg0));
		int var2 = field4545.get(7);
		int var3 = field4545.get(5);
		int var4 = field4545.get(2);
		int var5 = field4545.get(1);
		int var6 = field4545.get(11);
		int var7 = field4545.get(12);
		int var8 = field4545.get(13);
		return JagString.join(new JagString[] { field1673[var2 - 1], field3772, JagString.parseInt(var3 / 10), JagString.parseInt(var3 % 10), field3135, field658[var4], field3135, JagString.parseInt(var5), field4262, JagString.parseInt(var6 / 10), JagString.parseInt(var6 % 10), field1959, JagString.parseInt(var7 / 10), JagString.parseInt(var7 % 10), field1959, JagString.parseInt(var8 / 10), JagString.parseInt(var8 % 10), field82});
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
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getAppletContext() : signlink.applet.getAppletContext();
		} else {
			return null;
		}
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
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.applet == this ? super.getDocumentBase() : signlink.applet.getDocumentBase();
		} else {
			return null;
		}
	}
}
