package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("ub")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("j.Mb")
	public static ClientMouseListener instance = new ClientMouseListener();
	@ObfuscatedName("pb.w")
	public static volatile int idleTimer = 0;
	@ObfuscatedName("dd.j")
	public static volatile int nextMouseX = -1;
	@ObfuscatedName("cb.q")
	public static volatile int nextMouseY = -1;
	@ObfuscatedName("cb.o")
	public static volatile int nextMouseButton = 0;
	@ObfuscatedName("s.j")
	public static volatile int nextMouseClickX = 0;
	@ObfuscatedName("qa.zb")
	public static volatile int nextMouseClickY = 0;
	@ObfuscatedName("fc.Wb")
	public static volatile long nextMouseClickTime = 0L;
	@ObfuscatedName("nb.cd")
	public static volatile int nextMouseClickButton = 0;
	@ObfuscatedName("r.j")
	public static int mouseY = 0;
	@ObfuscatedName("de.u")
	public static int mouseX = 0;
	@ObfuscatedName("sd.i")
	public static int mouseClickX = 0;
	@ObfuscatedName("a.n")
	public static int mouseClickY = 0;
	@ObfuscatedName("ec.Mb")
	public static int mouseButton = 0;
	@ObfuscatedName("ub.x")
	public static int mouseClickButton = 0;
	@ObfuscatedName("ia.Dc")
	public static long mouseClickTime = 0L;

	@ObfuscatedName("ha.a(Ljava/awt/Component;B)V")
	public static void addListeners(Component arg0) {
		arg0.addMouseListener(instance);
		arg0.addMouseMotionListener(instance);
		arg0.addFocusListener(instance);
	}

	@ObfuscatedName("s.a(ILjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeMouseListener(instance);
		arg0.removeMouseMotionListener(instance);
		arg0.removeFocusListener(instance);
	}

	@ObfuscatedName("de.a(Z)V")
	public static void shutdown() {
		if (instance != null) {
			ClientMouseListener var0 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

	@ObfuscatedName("vc.c(I)V")
	public static void loop() {
		ClientMouseListener var0 = instance;
		synchronized (instance) {
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

	@ObfuscatedName("ld.b(I)I")
	public static int getIdleTimer() {
		return idleTimer++;
	}

	@ObfuscatedName("rb.a(ZI)V")
	public static void setIdleTimer(int arg0) {
		idleTimer = arg0;
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
	public synchronized void mouseExited(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseX = -1;
			nextMouseY = -1;
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (instance != null) {
			nextMouseButton = 0;
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
	public void focusGained(FocusEvent arg0) {
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
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
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
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (instance != null) {
			idleTimer = 0;
			nextMouseButton = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
