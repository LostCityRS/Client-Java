package deob;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

@ObfuscatedName("lf")
public abstract class class82 extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("lf.i")
	public boolean field1887 = false;

	@ObfuscatedName("lf.m")
	public static class32 field1891 = class73.method593("Geben Sie Ihren Benutzernamen", true);

	@ObfuscatedName("lf.B")
	public static class32 field1906 = class73.method593("title)3jpg", true);

	@ObfuscatedName("lf.D")
	public static int field1908 = 0;

	@ObfuscatedName("lf.J")
	public static class63 field1914 = new class63(64);

	@ObfuscatedName("lf.N")
	public static boolean field1918 = false;

	@ObfuscatedName("lf.M")
	public static volatile int field1917 = 0;

	@ObfuscatedName("lf.O")
	public static class32 field1919 = class73.method593("Please subscribe)1 or use a different world)3", true);

	@ObfuscatedName("lf.L")
	public static class32 field1916 = field1919;

	@ObfuscatedName("lf.P")
	public static class44 field1920;

	@ObfuscatedName("lf.b(B)Lba;")
	public static class9 method641() {
		try {
			return (class9) Class.forName("pd").getDeclaredConstructor().newInstance();
		} catch (Throwable var0) {
			return new class81();
		}
	}

	@ObfuscatedName("lf.d(B)V")
	public static void method644() {
		for (class144 var0 = (class144) class109.field2571.method1203(); var0 != null; var0 = (class144) class109.field2571.method1199()) {
			int var1 = var0.field3280;
			if (class28.method192(var1)) {
				boolean var2 = true;
				class36[] var3 = class79.field1825[var1];
				for (int var4 = 0; var4 < var3.length; var4++) {
					if (var3[var4] != null) {
						var2 = var3[var4].field848;
						break;
					}
				}
				if (!var2) {
					int var5 = (int) var0.field3324;
					class36 var6 = class128.method991(var5);
					if (var6 != null) {
						class132.method1008(var6);
					}
				}
			}
		}
	}

	public static void providesignlink(class25 arg0) {
		class154.field3516 = arg0;
		class86.field2010 = arg0;
	}

	@ObfuscatedName("lf.b(Z)V")
	public static void method648() {
		field1916 = null;
		field1906 = null;
		field1920 = null;
		field1914 = null;
		field1891 = null;
		field1919 = null;
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		class27.field484 = false;
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@Override
	public final String getParameter(String arg0) {
		if (class11.field184 == null) {
			return class154.field3516 == null || class154.field3516.field458 == this ? super.getParameter(arg0) : class154.field3516.field458.getParameter(arg0);
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.a(I)V")
	public abstract void method145();

	@Override
	public final void start() {
		if (class62.field1386 == this && !class62.field1389) {
			class53.field1248 = 0L;
		}
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.b(I)Z")
	public final boolean method639() {
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
				this.method649("invalidhost");
				return false;
			}
		}
	}

	@Override
	public final URL getCodeBase() {
		if (class11.field184 == null) {
			return class154.field3516 == null || class154.field3516.field458 == this ? super.getCodeBase() : class154.field3516.field458.getCodeBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.a(B)V")
	public abstract void method154();

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.a(IIILjava/lang/String;III)V")
	public final void method640(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
		try {
			class62.field1386 = this;
			class33.field696 = arg5;
			class117.field2812 = arg2;
			class144.field3292 = arg4;
			class11.field184 = new Frame();
			class11.field184.setTitle("Jagex");
			class11.field184.setResizable(false);
			class11.field184.addWindowListener(this);
			class11.field184.setVisible(true);
			class11.field184.toFront();
			Insets var8 = class11.field184.getInsets();
			class11.field184.setSize(var8.right + var8.left + arg4, var8.bottom + (arg5 - -var8.top));
			class86.field2010 = class154.field3516 = new class25(true, null, arg6, arg3, arg0);
			class154.field3516.method175(arg1, this, arg1 ^ 0x67);
		} catch (Exception var10) {
			class110.method870(var10, null);
		}
	}

	@ObfuscatedName("lf.c(I)V")
	public abstract void method147();

	@Override
	public final AppletContext getAppletContext() {
		if (class11.field184 == null) {
			return class154.field3516 == null || class154.field3516.field458 == this ? super.getAppletContext() : class154.field3516.field458.getAppletContext();
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public final void stop() {
		if (class62.field1386 == this && !class62.field1389) {
			class53.field1248 = class52.method407() + 4000L;
		}
	}

	@ObfuscatedName("lf.d(I)V")
	public synchronized void method642() {
		if (class62.field1389) {
			return;
		}
		class62.field1389 = true;
		try {
			class107.field2539.removeFocusListener(this);
		} catch (Exception var4) {
		}
		try {
			this.method153();
		} catch (Exception var3) {
		}
		if (class11.field184 != null) {
			try {
				System.exit(0);
			} catch (Throwable var2) {
			}
		}
		if (class154.field3516 != null) {
			try {
				class154.field3516.method176();
			} catch (Exception var1) {
			}
		}
		this.method147();
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@ObfuscatedName("lf.c(B)V")
	public void method643() {
		long var1 = class52.method407();
		long var3 = class125.field2903[class146.field3321];
		boolean var10000;
		if (var3 == 0L || var3 >= var1) {
			var10000 = false;
		} else {
			var10000 = true;
		}
		class125.field2903[class146.field3321] = var1;
		class146.field3321 = class146.field3321 + 1 & 0x1F;
		synchronized (this) {
			class126.field2926 = class27.field484;
		}
		this.method145();
	}

	@ObfuscatedName("lf.a(Z)V")
	public abstract void method153();

	@Override
	public final void focusGained(FocusEvent arg0) {
		class27.field484 = true;
		class1.field3 = true;
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (class62.field1386 != this || class62.field1389) {
			return;
		}
		class1.field3 = true;
		if (class25.field457 != null && class25.field457.startsWith("1.5") && class52.method407() - class63.field1443 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= class144.field3292 && class33.field696 <= var2.height) {
				class158.field3619 = true;
			}
		}
	}

	@Override
	public final void run() {
		try {
			if (class25.field464 != null) {
				String var1 = class25.field464.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class25.field457;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
						this.method649("wrongjava");
						return;
					}
					class74.field1737 = 5;
				} else if (var1.indexOf("ibm") != -1 && (class25.field457 == null || class25.field457.equals("1.4.2"))) {
					this.method649("wrongjava");
					return;
				}
			}
			if (class154.field3516.field458 != null) {
				Method var3 = class25.field466;
				if (var3 != null) {
					try {
						var3.invoke(class154.field3516.field458, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
			}
			this.method645();
			class50.field1157 = class132.method1011(class33.field696, class144.field3292, class107.field2539);
			this.method154();
			class85.field1981 = method641();
			while (class53.field1248 == 0L || class52.method407() < class53.field1248) {
				class105.field2488 = class85.field1981.method58(class97.field2240, class74.field1737);
				for (int var4 = 0; var4 < class105.field2488; var4++) {
					this.method643();
				}
				this.method646();
				class56.method441(class107.field2539, class154.field3516);
			}
		} catch (Exception var7) {
			class110.method870(var7, null);
			this.method649("crash");
		}
		this.method642();
	}

	@ObfuscatedName("lf.e(I)V")
	public final synchronized void method645() {
		Container var1;
		if (class11.field184 == null) {
			var1 = class154.field3516.field458;
		} else {
			var1 = class11.field184;
		}
		if (class107.field2539 != null) {
			class107.field2539.removeFocusListener(this);
			var1.remove(class107.field2539);
		}
		class107.field2539 = new class54(this);
		var1.add(class107.field2539);
		class107.field2539.setSize(class144.field3292, class33.field696);
		class107.field2539.setVisible(true);
		if (class11.field184 == null) {
			class107.field2539.setLocation(0, 0);
		} else {
			Insets var2 = class11.field184.getInsets();
			class107.field2539.setLocation(var2.left, var2.top);
		}
		class107.field2539.addFocusListener(this);
		class107.field2539.requestFocus();
		class1.field3 = true;
		class158.field3619 = false;
		class63.field1443 = class52.method407();
	}

	@ObfuscatedName("lf.f(I)V")
	public void method646() {
		long var1 = class52.method407();
		long var3 = class44.field1029[class111.field2611];
		class44.field1029[class111.field2611] = var1;
		class111.field2611 = class111.field2611 + 1 & 0x1F;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			class98.field2270 = ((var5 >> 1) + 32000) / var5;
		}
		if (class113.field2638++ > 50) {
			class1.field3 = true;
			class113.field2638 -= 50;
			class107.field2539.setSize(class144.field3292, class33.field696);
			class107.field2539.setVisible(true);
			if (class11.field184 == null) {
				class107.field2539.setLocation(0, 0);
			} else {
				Insets var6 = class11.field184.getInsets();
				class107.field2539.setLocation(var6.left, var6.top);
			}
		}
		this.method150();
	}

	@ObfuscatedName("lf.a(IIIII)V")
	public final void method647(int arg0) {
		try {
			if (class62.field1386 == null) {
				class62.field1386 = this;
				class144.field3292 = 765;
				class33.field696 = 503;
				class117.field2812 = 468;
				if (class154.field3516 == null) {
					class86.field2010 = class154.field3516 = new class25(false, this, arg0, null, 0);
				}
				class154.field3516.method175(1, this, 109);
			} else {
				class158.field3637++;
				if (class158.field3637 >= 3) {
					this.method649("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (Exception var3) {
			class110.method870(var3, null);
			this.method649("crash");
		}
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	public abstract void init();

	@Override
	public final URL getDocumentBase() {
		if (class11.field184 == null) {
			return class154.field3516 == null || class154.field3516.field458 == this ? super.getDocumentBase() : class154.field3516.field458.getDocumentBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("lf.g(I)V")
	public abstract void method150();

	@Override
	public final void destroy() {
		if (class62.field1386 == this && !class62.field1389) {
			class53.field1248 = class52.method407();
			class54.method426(5000L);
			class86.field2010 = null;
			this.method642();
		}
	}

	@ObfuscatedName("lf.a(BLjava/lang/String;)V")
	public final void method649(String arg0) {
		if (this.field1887) {
			return;
		}
		this.field1887 = true;
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
