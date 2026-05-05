package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("be")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("di.ab")
	public static ClientMouseListener instance = new ClientMouseListener();
	@ObfuscatedName("re.b")
	public static volatile int idleTimer = 0;
	@ObfuscatedName("ea.Z")
	public static volatile int nextMouseClickX = 0;
	@ObfuscatedName("mh.T")
	public static volatile int nextMouseClickY = 0;
	@ObfuscatedName("ra.Z")
	public static volatile long nextMouseClickTime = 0L;
	@ObfuscatedName("of.i")
	public static volatile int nextMouseClickButton = 0;
	@ObfuscatedName("ea.z")
	public static volatile int nextMouseButton = 0;
	@ObfuscatedName("vc.Y")
	public static volatile int nextMouseX = -1;
	@ObfuscatedName("pg.ub")
	public static volatile int nextMouseY = -1;
	@ObfuscatedName("od.G")
	public static int mouseButton = 0;
	@ObfuscatedName("ce.Z")
	public static int mouseX = 0;
	@ObfuscatedName("w.p")
	public static int mouseY = 0;
	@ObfuscatedName("db.t")
	public static int mouseClickButton = 0;
	@ObfuscatedName("uh.K")
	public static int mouseClickX = 0;
	@ObfuscatedName("pi.X")
	public static int mouseClickY = 0;
	@ObfuscatedName("db.r")
	public static long mouseClickTime = 0L;
	@ObfuscatedName("hc.eb")
	public static int field1452;
	@ObfuscatedName("kg.db")
	public static int drawPos;
	@ObfuscatedName("kg.jb")
	public static int field2107;
	@ObfuscatedName("kg.T")
	public static volatile long lastCanvasReplace = 0L;

	@ObfuscatedName("k.a(Ljava/awt/Component;I)V")
	public static void addListeners(java.awt.Component arg0) {
		arg0.addMouseListener(instance);
		arg0.addMouseMotionListener(instance);
		arg0.addFocusListener(instance);
	}

	@ObfuscatedName("kg.a(BLjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeMouseListener(instance);
		arg0.removeMouseMotionListener(instance);
		arg0.removeFocusListener(instance);
		nextMouseButton = 0;
	}

	@ObfuscatedName("sh.b(B)V")
	public static void cycle() {
		ClientMouseListener var0 = instance;
		synchronized (instance) {
			idleTimer++;
			mouseButton = nextMouseButton;
			mouseX = nextMouseX;
			mouseY = nextMouseY;
			mouseClickButton = nextMouseClickButton;
			mouseClickX = nextMouseClickX;
			mouseClickY = nextMouseClickY;
			mouseClickTime = nextMouseClickTime;
			nextMouseClickButton = 0;
		}
	}

	@ObfuscatedName("nj.a(BI)V")
	public static void setIdleTimer(int arg0) {
		ClientMouseListener var1 = instance;
		synchronized (instance) {
			idleTimer = arg0;
		}
	}

	@ObfuscatedName("eb.d(I)V")
	public static void shutdown() {
		if (instance != null) {
			ClientMouseListener var0 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@ObfuscatedName("ne.a(I)I")
	public static int getIdleTimer() {
		return idleTimer;
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseClickX = arg0.getX();
			nextMouseClickY = arg0.getY();
			nextMouseClickTime = MonotonicTime.currentTime();
			if (arg0.isMetaDown()) {
				nextMouseClickButton = 2;
				nextMouseButton = 2;
			} else {
				nextMouseClickButton = 1;
				nextMouseButton = 1;
			}
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (instance != null) {
			nextMouseButton = 0;
		}
	}

	@Override
	public synchronized void mouseMoved(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseX = arg0.getX();
			nextMouseY = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseX = arg0.getX();
			nextMouseY = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseX = arg0.getX();
			nextMouseY = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseX = -1;
			nextMouseY = -1;
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseButton = 0;
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
