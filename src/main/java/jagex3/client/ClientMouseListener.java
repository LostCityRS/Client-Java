package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("ub")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("j.Mb")
	public static ClientMouseListener field1412 = new ClientMouseListener();
	@ObfuscatedName("pb.w")
	public static volatile int field2293 = 0;
	@ObfuscatedName("dd.j")
	public static volatile int field710 = -1;
	@ObfuscatedName("cb.q")
	public static volatile int field496 = -1;
	@ObfuscatedName("cb.o")
	public static volatile int field494 = 0;
	@ObfuscatedName("s.j")
	public static volatile int field2711 = 0;
	@ObfuscatedName("qa.zb")
	public static volatile int field2396 = 0;
	@ObfuscatedName("fc.Wb")
	public static volatile long field919 = 0L;
	@ObfuscatedName("nb.cd")
	public static volatile int field2017 = 0;
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
		arg0.addMouseListener(field1412);
		arg0.addMouseMotionListener(field1412);
		arg0.addFocusListener(field1412);
	}

	@ObfuscatedName("s.a(ILjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeMouseListener(field1412);
		arg0.removeMouseMotionListener(field1412);
		arg0.removeFocusListener(field1412);
	}

	@ObfuscatedName("de.a(Z)V")
	public static void method327() {
		if (field1412 != null) {
			ClientMouseListener var0 = field1412;
			synchronized (field1412) {
				field1412 = null;
			}
		}
	}

	@ObfuscatedName("vc.c(I)V")
	public static void cycle() {
		ClientMouseListener var0 = field1412;
		synchronized (field1412) {
			mouseButton = field494;
			mouseX = field710;
			mouseY = field496;
			mouseClickButton = field2017;
			mouseClickX = field2711;
			mouseClickY = field2396;
			mouseClickTime = field919;
			field2017 = 0;
		}
	}

	@ObfuscatedName("ld.b(I)I")
	public static int getIdleTimer() {
		return field2293++;
	}

	@ObfuscatedName("rb.a(ZI)V")
	public static void setIdleTimer(int arg0) {
		field2293 = arg0;
	}

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (field1412 != null) {
			field2293 = 0;
			field710 = arg0.getX();
			field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (field1412 != null) {
			field2293 = 0;
			field710 = -1;
			field496 = -1;
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (field1412 != null) {
			field494 = 0;
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (field1412 != null) {
			field2293 = 0;
			field710 = arg0.getX();
			field496 = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (field1412 != null) {
			field2293 = 0;
			field2711 = arg0.getX();
			field2396 = arg0.getY();
			field919 = MonotonicTime.currentTime();
			if (arg0.isMetaDown()) {
				field2017 = 2;
				field494 = 2;
			} else {
				field2017 = 1;
				field494 = 1;
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
		if (field1412 != null) {
			field2293 = 0;
			field710 = arg0.getX();
			field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (field1412 != null) {
			field2293 = 0;
			field494 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
