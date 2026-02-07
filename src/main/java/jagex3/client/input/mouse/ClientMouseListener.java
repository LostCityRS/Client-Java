package jagex3.client.input.mouse;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("pe")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("fb.C")
	public static ClientMouseListener instance = new ClientMouseListener();
	@ObfuscatedName("lf.M")
	public static volatile int nextMouseButton = 0;
	@ObfuscatedName("eb.w")
	public static volatile long nextMouseClickTime = 0L;
	@ObfuscatedName("c.kb")
	public static volatile int nextMouseClickY = 0;
	@ObfuscatedName("ve.p")
	public static volatile int nextMouseClickX = 0;
	@ObfuscatedName("u.O")
	public static volatile int idleTimer = 0;
	@ObfuscatedName("sa.a")
	public static volatile int nextMouseX = -1;
	@ObfuscatedName("ga.xb")
	public static volatile int nextMouseY = -1;
	@ObfuscatedName("we.f")
	public static volatile int nextMouseClickButton = 0;
	@ObfuscatedName("mc.q")
	public static int mouseButton = 0;
	@ObfuscatedName("mc.b")
	public static int mouseX = 0;
	@ObfuscatedName("ua.d")
	public static int mouseY = 0;
	@ObfuscatedName("lc.c")
	public static int mouseClickButton = 0;
	@ObfuscatedName("ba.h")
	public static int mouseClickX = 0;
	@ObfuscatedName("jd.Gb")
	public static int mouseClickY = 0;
	@ObfuscatedName("ma.g")
	public static long mouseClickTime = 0L;

	@ObfuscatedName("te.a(I)V")
	public static void cycle() {
		ClientMouseListener var0 = instance;
		synchronized (var0) {
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

	@ObfuscatedName("sa.a(Ljava/awt/Component;I)V")
	public static void removeListeners(Component arg0) {
		arg0.removeMouseListener(instance);
		arg0.removeMouseMotionListener(instance);
		arg0.removeFocusListener(instance);
		nextMouseButton = 0;
	}

	@ObfuscatedName("sc.a(ILjava/awt/Component;)V")
	public static void addListeners(Component arg0) {
		arg0.addMouseListener(instance);
		arg0.addMouseMotionListener(instance);
		arg0.addFocusListener(instance);
	}

	@ObfuscatedName("eb.a(I)I")
	public static int getIdleTimer() {
		return idleTimer++;
	}

	@ObfuscatedName("kf.a(ZI)V")
	public static void setIdleTimer(int arg0) {
		idleTimer = arg0;
	}

	@ObfuscatedName("pb.e(I)V")
	public static void shutdown() {
		if (instance != null) {
			ClientMouseListener var0 = instance;
			synchronized (instance) {
				instance = null;
			}
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
	public synchronized void focusLost(FocusEvent arg0) {
		if (instance != null) {
			nextMouseButton = 0;
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
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
	public synchronized void mouseDragged(MouseEvent arg0) {
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
}
