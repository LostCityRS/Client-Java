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

@ObfuscatedName("hj")
public abstract class class87 extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("hj.o")
	public static final class155 field1572 = new class155(0, 0);

	@ObfuscatedName("hj.p")
	public static class88 field1573 = class208.method1423(105, "W-=hlen Sie eine Welt");

	@ObfuscatedName("hj.r")
	public static int field1575 = 500;

	@ObfuscatedName("hj.u")
	public static short field1578 = 1;

	@ObfuscatedName("hj.G")
	public static final class88 field1590 = class208.method1423(105, "go back to the main RuneScape webpage");

	@ObfuscatedName("hj.H")
	public static class88 field1591 = field1590;

	@ObfuscatedName("hj.x")
	public static int field1581 = -1;

	@ObfuscatedName("hj.y")
	public boolean field1582 = false;

	@ObfuscatedName("hj.O")
	public static int field1598;

	@ObfuscatedName("hj.M")
	public static short[][] field1596;

	@ObfuscatedName("hj.a(ILq;)Lq;")
	public static class174 method583(class174 arg0) {
		int var1 = class17.method81(class80.method530(arg0));
		if (var1 == 0) {
			return null;
		}
		for (int var2 = 0; var2 < var1; var2++) {
			arg0 = class239.method1579(arg0.field3504);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	public static void providesignlink(class181 arg0) {
		class126.field2324 = arg0;
		class6.field93 = arg0;
	}

	@ObfuscatedName("hj.a(II)I")
	public static int method592(int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final void start() {
		if (class55.field1032 == this && !class48.field909) {
			class35.field602 = 0L;
		}
	}

	@ObfuscatedName("hj.a(I)V")
	public abstract void method225();

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		class118.field2143 = false;
	}

	@ObfuscatedName("hj.a(B)V")
	public void method584() {
		long var1 = class206.method1418();
		long var3 = class48.field903[class103.field1874];
		boolean var10000;
		if (var3 == 0L || var1 <= var3) {
			var10000 = false;
		} else {
			var10000 = true;
		}
		class48.field903[class103.field1874] = var1;
		class103.field1874 = class103.field1874 + 1 & 0x1F;
		synchronized (this) {
			class175.field3520 = class118.field2143;
		}
		this.method222();
	}

	@Override
	public final void stop() {
		if (class55.field1032 == this && !class48.field909) {
			class35.field602 = class206.method1418() + 4000L;
		}
	}

	@Override
	public final URL getCodeBase() {
		if (class201.field3832 == null) {
			return class126.field2324 == null || class126.field2324.field3597 == this ? super.getCodeBase() : class126.field2324.field3597.getCodeBase();
		} else {
			return null;
		}
	}

	@ObfuscatedName("hj.b(B)V")
	public synchronized void method585() {
		Container var1;
		if (class201.field3832 == null) {
			var1 = class126.field2324.field3597;
		} else {
			var1 = class201.field3832;
		}
		if (class154.field2975 != null) {
			class154.field2975.removeFocusListener(this);
			var1.remove(class154.field2975);
		}
		class154.field2975 = new class66(this);
		var1.add(class154.field2975);
		class154.field2975.setSize(class222.field4192, class145.field2725);
		class154.field2975.setVisible(true);
		if (class201.field3832 == null) {
			class154.field2975.setLocation(0, 0);
		} else {
			Insets var2 = class201.field3832.getInsets();
			class154.field2975.setLocation(var2.left, var2.top);
		}
		class154.field2975.addFocusListener(this);
		class154.field2975.requestFocus();
		class53.field971 = true;
		class116.field2091 = class206.method1418();
	}

	@Override
	public final synchronized void paint(Graphics arg0) {
		if (class55.field1032 != this || class48.field909) {
			return;
		}
		class53.field971 = true;
		if (class181.field3591 == null || !class181.field3591.startsWith("1.5") || class206.method1418() - class116.field2091 <= 1000L) {
			return;
		}
		Rectangle var2 = arg0.getClipBounds();
		boolean var10000;
		if (var2 == null || var2.width >= class222.field4192 && class145.field2725 <= var2.height) {
			var10000 = true;
		} else {
			var10000 = false;
		}
	}

	@ObfuscatedName("hj.a(IIIIIILjava/lang/String;)V")
	public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
		try {
			if (arg5 != -11124) {
				field1573 = null;
			}
			class222.field4192 = arg2;
			class55.field1032 = this;
			class145.field2725 = arg1;
			class225.field4226 = arg3;
			class201.field3832 = new Frame();
			class201.field3832.setTitle("Jagex");
			class201.field3832.setResizable(false);
			class201.field3832.addWindowListener(this);
			class201.field3832.setVisible(true);
			class201.field3832.toFront();
			Insets var8 = class201.field3832.getInsets();
			class201.field3832.setSize(var8.right + arg2 + var8.left, var8.bottom + arg1 - -var8.top);
			class6.field93 = class126.field2324 = new class181(true, null, arg4, arg6, arg0);
			class126.field2324.method1287(arg5 + 11126, this, 1);
		} catch (Exception var10) {
			class221.method1488(null, var10);
		}
	}

	@Override
	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@Override
	public final AppletContext getAppletContext() {
		if (class201.field3832 == null) {
			return class126.field2324 == null || class126.field2324.field3597 == this ? super.getAppletContext() : class126.field2324.field3597.getAppletContext();
		} else {
			return null;
		}
	}

	@ObfuscatedName("hj.b(I)V")
	public abstract void method214();

	@ObfuscatedName("hj.a(IZ)V")
	public void method587(boolean arg0) {
		synchronized (this) {
			if (class48.field909) {
				return;
			}
			class48.field909 = true;
		}
		if (class126.field2324.field3597 != null) {
			class126.field2324.field3597.destroy();
		}
		if (class154.field2975 != null) {
			try {
				class154.field2975.removeFocusListener(this);
				Container var3;
				if (class201.field3832 == null) {
					var3 = class126.field2324.field3597;
				} else {
					var3 = class201.field3832;
				}
				var3.remove(class154.field2975);
			} catch (Exception var7) {
			}
		}
		try {
			this.method218();
		} catch (Exception var6) {
		}
		if (class126.field2324 != null) {
			try {
				class126.field2324.method1289();
			} catch (Exception var5) {
			}
		}
		this.method225();
		if (class201.field3832 != null) {
			try {
				System.exit(0);
			} catch (Throwable var4) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@ObfuscatedName("hj.a(BLjava/lang/String;)V")
	public final void method588(String arg0) {
		if (this.field1582) {
			return;
		}
		this.field1582 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (Exception var2) {
		}
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@ObfuscatedName("hj.c(I)V")
	public void method589() {
		long var1 = class206.method1418();
		long var3 = class89.field1696[class116.field2101];
		class89.field1696[class116.field2101] = var1;
		class116.field2101 = class116.field2101 + 1 & 0x1F;
		if (var3 != 0L && var3 < var1) {
			int var5 = (int) (var1 - var3);
			class13.field192 = ((var5 >> 1) + 32000) / var5;
		}
		if (field1575++ > 50) {
			field1575 -= 50;
			class53.field971 = true;
			class154.field2975.setSize(class222.field4192, class145.field2725);
			class154.field2975.setVisible(true);
			if (class201.field3832 == null) {
				class154.field2975.setLocation(0, 0);
			} else {
				Insets var6 = class201.field3832.getInsets();
				class154.field2975.setLocation(var6.left, var6.top);
			}
		}
		this.method220();
	}

	@ObfuscatedName("hj.d(I)V")
	public abstract void method218();

	@ObfuscatedName("hj.e(I)V")
	public abstract void method220();

	@ObfuscatedName("hj.f(I)Z")
	public final boolean method590() {
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
				this.method588("invalidhost");
				return false;
			}
		}
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	public abstract void init();

	@Override
	public final String getParameter(String arg0) {
		if (class201.field3832 == null) {
			return class126.field2324 == null || class126.field2324.field3597 == this ? super.getParameter(arg0) : class126.field2324.field3597.getParameter(arg0);
		} else {
			return null;
		}
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void run() {
		try {
			if (class181.field3594 != null) {
				String var1 = class181.field3594.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class181.field3591;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
						this.method588("wrongjava");
						return;
					}
					class130.field2442 = 5;
				} else if (var1.indexOf("ibm") != -1 && (class181.field3591 == null || class181.field3591.equals("1.4.2"))) {
					this.method588("wrongjava");
					return;
				}
			}
			if (class126.field2324.field3597 != null) {
				Method var3 = class181.field3581;
				if (var3 != null) {
					try {
						var3.invoke(class126.field2324.field3597, Boolean.TRUE);
					} catch (Throwable var6) {
					}
				}
			}
			this.method585();
			class202.field3852 = class176.method1259(class222.field4192, class154.field2975, class145.field2725);
			this.method214();
			class143.field2654 = class196.method1358();
			while (class35.field602 == 0L || class35.field602 > class206.method1418()) {
				class153.field2960 = class143.field2654.method204(class130.field2442, class165.field3145);
				for (int var4 = 0; var4 < class153.field2960; var4++) {
					this.method584();
				}
				this.method589();
				class149.method1006(class154.field2975, class126.field2324);
			}
		} catch (Exception var7) {
			class221.method1488(null, var7);
			this.method588("crash");
		}
		this.method587(true);
	}

	@ObfuscatedName("hj.c(B)V")
	public abstract void method222();

	@Override
	public final void focusGained(FocusEvent arg0) {
		class118.field2143 = true;
		class53.field971 = true;
	}

	@Override
	public final void destroy() {
		if (class55.field1032 == this && !class48.field909) {
			class35.field602 = class206.method1418();
			class21.method98(5000L);
			class6.field93 = null;
			this.method587(false);
		}
	}

	@ObfuscatedName("hj.a(BIIII)V")
	public final void method593(int arg0) {
		try {
			if (class55.field1032 == null) {
				class222.field4192 = 765;
				class55.field1032 = this;
				class145.field2725 = 503;
				class225.field4226 = 500;
				if (class126.field2324 == null) {
					class6.field93 = class126.field2324 = new class181(false, this, arg0, null, 0);
				}
				class126.field2324.method1287(2, this, 1);
			} else {
				class8.field121++;
				if (class8.field121 >= 3) {
					this.method588("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (Exception var3) {
			class221.method1488(null, var3);
			this.method588("crash");
		}
	}

	@Override
	public final URL getDocumentBase() {
		if (class201.field3832 == null) {
			return class126.field2324 == null || class126.field2324.field3597 == this ? super.getDocumentBase() : class126.field2324.field3597.getDocumentBase();
		} else {
			return null;
		}
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}
}
