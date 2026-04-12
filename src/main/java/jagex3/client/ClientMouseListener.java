package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;

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

	@ObfuscatedName("ha.a(Ljava/awt/Component;B)V")
	public static void method465(Component arg0) {
		arg0.addMouseListener(field1412);
		arg0.addMouseMotionListener(field1412);
		arg0.addFocusListener(field1412);
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
			field919 = Statics.currentTime();
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
