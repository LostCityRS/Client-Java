package deob;

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
public abstract class class64 extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("kd.b")
	public static int[] field1599 = new int[5];

	@ObfuscatedName("kd.d")
	public static long[] field1601 = new long[32];

	@ObfuscatedName("kd.Q")
	public boolean field1640 = false;

	@Override
	public final void run() {
		try {
			if (Statics.field1714 != null) {
				String var1 = Statics.field1714.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Statics.field1718;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
						this.method620("wrongjava");
						return;
					}
					class22.field685 = 5;
				} else if (var1.indexOf("ibm") != -1 && (Statics.field1718 == null || Statics.field1718.equals("1.4.2"))) {
					this.method620("wrongjava");
					return;
				}
			}
			if (Statics.field1071.field1719 != null) {
				Method var3 = Statics.field1703;
				if (var3 != null) {
					try {
						var3.invoke(Statics.field1071.field1719, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
			}
			this.method628();
			Statics.field187 = Statics.method875(Statics.field2372, Statics.field711, Statics.field3049);
			this.method290();
			Statics.field1747 = Statics.method909();
			Statics.field1747.method571();
			while (Js5.field369 == 0L || Statics.method869() < Js5.field369) {
				Statics.field681 = Statics.field1747.method573(class81.field2049, class22.field685);
				for (int var4 = 0; var4 < Statics.field681; var4++) {
					this.method625();
				}
				this.method622();
			}
		} catch (Exception var7) {
			Statics.method214(null, var7);
			this.method620("crash");
		}
		this.method615();
	}

	@ObfuscatedName("kd.b(I)V")
	public synchronized void method615() {
		if (class36.field972) {
			return;
		}
		class36.field972 = true;
		try {
			Statics.field3049.removeFocusListener(this);
		} catch (Exception var4) {
		}
		try {
			this.method286();
		} catch (Exception var3) {
		}
		if (Statics.field1859 != null) {
			try {
				System.exit(0);
			} catch (Throwable var2) {
			}
		}
		if (Statics.field1071 != null) {
			try {
				Statics.field1071.method647();
			} catch (Exception var1) {
			}
		}
		this.method288();
	}

	@Override
	public final void stop() {
		if (class6.field230 == this && !class36.field972) {
			Js5.field369 = Statics.method869() + 4000L;
		}
	}

	@ObfuscatedName("kd.c(I)Z")
	public final boolean method619() {
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
				this.method620("invalidhost");
				return false;
			}
		}
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.a(BLjava/lang/String;)V")
	public final void method620(String arg0) {
		if (this.field1640) {
			return;
		}
		this.field1640 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (Exception var2) {
		}
	}

	@Override
	public final void start() {
		if (class6.field230 == this && !class36.field972) {
			Js5.field369 = 0L;
		}
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		class105.field2631 = false;
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (class6.field230 != this || class36.field972) {
			return;
		}
		class97.field2402 = true;
		if (Statics.field1718 != null && Statics.field1718.startsWith("1.5") && Statics.method869() - class6.field225 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || Statics.field711 <= var2.width && var2.height >= Statics.field2372) {
				class133.field3242 = true;
			}
		}
	}

	@Override
	public final void destroy() {
		if (class6.field230 == this && !class36.field972) {
			Js5.field369 = Statics.method869();
			Statics.method753(5000L);
			Statics.field2026 = null;
			this.method615();
		}
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		class105.field2631 = true;
		class97.field2402 = true;
	}

	@Override
	public final URL getDocumentBase() {
		if (Statics.field1859 == null) {
			return Statics.field1071 == null || Statics.field1071.field1719 == this ? super.getDocumentBase() : Statics.field1071.field1719.getDocumentBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.a(BIIII)V")
	public final void method621(int arg0) {
		try {
			if (class6.field230 != null) {
				this.method620("alreadyloaded");
				return;
			}
			Statics.field711 = 765;
			Statics.field2038 = 435;
			Statics.field2372 = 503;
			class6.field230 = this;
			if (Statics.field1071 == null) {
				Statics.field2026 = Statics.field1071 = new class69(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
			}
			Statics.field1071.method656(1, this);
		} catch (Exception var3) {
			Statics.method214(null, var3);
			this.method620("crash");
		}
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	public static void providesignlink(class69 arg0) {
		Statics.field1071 = arg0;
		Statics.field2026 = arg0;
	}

	@ObfuscatedName("kd.a(B)V")
	public void method622() {
		long var1 = Statics.method869();
		long var3 = field1601[Statics.field1656];
		field1601[Statics.field1656] = var1;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			class105.field2635 = ((var5 >> 1) + 32000) / var5;
		}
		Statics.field1656 = Statics.field1656 + 1 & 0x1F;
		if (Linkable.field2075++ > 50) {
			Linkable.field2075 -= 50;
			class97.field2402 = true;
			Statics.field3049.setSize(Statics.field711, Statics.field2372);
			Statics.field3049.setVisible(true);
			if (Statics.field1859 == null) {
				Statics.field3049.setLocation(0, 0);
			} else {
				Insets var6 = Statics.field1859.getInsets();
				Statics.field3049.setLocation(var6.left, var6.top);
			}
		}
		this.method283();
	}

	@Override
	public final AppletContext getAppletContext() {
		if (Statics.field1859 == null) {
			return Statics.field1071 == null || Statics.field1071.field1719 == this ? super.getAppletContext() : Statics.field1071.field1719.getAppletContext();
		} else {
			return null;
		}
	}

	@ObfuscatedName("kd.b(Z)V")
	public void method625() {
		long var1 = Statics.method869();
		long var3 = class133.field3281[Statics.field3048];
		boolean var10000;
		if (var3 == 0L || var1 <= var3) {
			var10000 = false;
		} else {
			var10000 = true;
		}
		class133.field3281[Statics.field3048] = var1;
		Statics.field3048 = Statics.field3048 + 1 & 0x1F;
		synchronized (this) {
			Statics.field1277 = class105.field2631;
		}
		this.method279();
	}

	@ObfuscatedName("kd.a(Ljava/lang/String;IIIILjava/net/InetAddress;II)V")
	public final void method626(String arg0, int arg1, int arg2, int arg3, InetAddress arg4, int arg5, int arg6) {
		try {
			Statics.field2038 = arg5;
			Statics.field711 = arg6;
			class6.field230 = this;
			Statics.field2372 = arg2;
			Statics.field1859 = new Frame();
			Statics.field1859.setTitle("Jagex");
			Statics.field1859.setResizable(false);
			Statics.field1859.addWindowListener(this);
			Statics.field1859.setVisible(true);
			Statics.field1859.toFront();
			Insets var8 = Statics.field1859.getInsets();
			Statics.field1859.setSize(arg6 + var8.left + var8.right, var8.top + var8.bottom + arg2);
			Statics.field2026 = Statics.field1071 = new class69(true, null, arg4, arg3, arg0, arg1);
			Statics.field1071.method656(1, this);
		} catch (Exception var10) {
			Statics.method214(null, var10);
		}
	}

	@Override
	public final URL getCodeBase() {
		if (Statics.field1859 == null) {
			return Statics.field1071 == null || Statics.field1071.field1719 == this ? super.getCodeBase() : Statics.field1071.field1719.getCodeBase();
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
		if (Statics.field1859 == null) {
			return Statics.field1071 == null || Statics.field1071.field1719 == this ? super.getParameter(arg0) : Statics.field1071.field1719.getParameter(arg0);
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@ObfuscatedName("kd.b(B)V")
	public final synchronized void method628() {
		Container var1;
		if (Statics.field1859 == null) {
			var1 = Statics.field1071.field1719;
		} else {
			var1 = Statics.field1859;
		}
		if (Statics.field3049 != null) {
			Statics.field3049.removeFocusListener(this);
			var1.remove(Statics.field3049);
		}
		Statics.field3049 = new class62(this);
		var1.add(Statics.field3049);
		Statics.field3049.setSize(Statics.field711, Statics.field2372);
		Statics.field3049.setVisible(true);
		if (Statics.field1859 == null) {
			Statics.field3049.setLocation(0, 0);
		} else {
			Insets var2 = Statics.field1859.getInsets();
			Statics.field3049.setLocation(var2.left, var2.top);
		}
		Statics.field3049.addFocusListener(this);
		Statics.field3049.requestFocus();
		class97.field2402 = true;
		class133.field3242 = false;
		class6.field225 = Statics.method869();
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
	public abstract void method288();

	public abstract void init();

	@ObfuscatedName("kd.d(I)V")
	public abstract void method279();

	@ObfuscatedName("kd.e(I)V")
	public abstract void method286();

	@ObfuscatedName("kd.c(Z)V")
	public abstract void method290();

	@ObfuscatedName("kd.f(I)V")
	public abstract void method283();
}
