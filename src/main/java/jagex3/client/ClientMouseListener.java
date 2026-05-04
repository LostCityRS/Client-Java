package jagex3.client;

import deob.ObfuscatedName;
import jagex3.util.MonotonicTime;

import java.awt.*;
import java.awt.event.*;

@ObfuscatedName("be")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("di.ab")
	public static ClientMouseListener field732 = new ClientMouseListener();
	@ObfuscatedName("re.b")
	public static volatile int field3668 = 0;
	@ObfuscatedName("ea.Z")
	public static volatile int field833 = 0;
	@ObfuscatedName("mh.T")
	public static volatile int field2575 = 0;
	@ObfuscatedName("ra.Z")
	public static volatile long field3631 = 0L;
	@ObfuscatedName("of.i")
	public static volatile int field3044 = 0;
	@ObfuscatedName("ea.z")
	public static volatile int field807 = 0;
	@ObfuscatedName("vc.Y")
	public static volatile int field4353 = -1;
	@ObfuscatedName("pg.ub")
	public static volatile int field3297 = -1;
	@ObfuscatedName("od.G")
	public static int field3016 = 0;
	@ObfuscatedName("ce.Z")
	public static int field471 = 0;
	@ObfuscatedName("w.p")
	public static int field4449 = 0;
	@ObfuscatedName("db.t")
	public static int field625 = 0;
	@ObfuscatedName("uh.K")
	public static int field4239 = 0;
	@ObfuscatedName("pi.X")
	public static int field3339 = 0;
	@ObfuscatedName("db.r")
	public static long field623 = 0L;
	@ObfuscatedName("hc.eb")
	public static int field1452;
	@ObfuscatedName("ig.U")
	public static int field1756;
	@ObfuscatedName("kg.db")
	public static int field2101;
	@ObfuscatedName("kg.jb")
	public static int field2107;
	@ObfuscatedName("kg.T")
	public static volatile long field2091 = 0L;
	@ObfuscatedName("ph.X")
	public static int field3327;
	@ObfuscatedName("ub.ib")
	public static byte[][][] field4166;

	@ObfuscatedName("k.a(Ljava/awt/Component;I)V")
	public static void method748(java.awt.Component arg0) {
		arg0.addMouseListener(field732);
		arg0.addMouseMotionListener(field732);
		arg0.addFocusListener(field732);
	}

	@ObfuscatedName("kg.a(BLjava/awt/Component;)V")
	public static void removeListeners(Component arg0) {
		arg0.removeMouseListener(field732);
		arg0.removeMouseMotionListener(field732);
		arg0.removeFocusListener(field732);
		field807 = 0;
	}

	@ObfuscatedName("sh.b(B)V")
	public static void method1397() {
		ClientMouseListener var0 = field732;
		synchronized (field732) {
			field3668++;
			field3016 = field807;
			field471 = field4353;
			field4449 = field3297;
			field625 = field3044;
			field4239 = field833;
			field3339 = field2575;
			field623 = field3631;
			field3044 = 0;
		}
	}

	@ObfuscatedName("nj.a(BI)V")
	public static void method1031(int arg0) {
		ClientMouseListener var1 = field732;
		synchronized (field732) {
			field3668 = arg0;
		}
	}

	@ObfuscatedName("eb.d(I)V")
	public static void method362() {
		if (field732 != null) {
			ClientMouseListener var0 = field732;
			synchronized (field732) {
				field732 = null;
			}
		}
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (field732 != null) {
			field3668 = 0;
			field833 = arg0.getX();
			field2575 = arg0.getY();
			field3631 = MonotonicTime.currentTime();
			if (arg0.isMetaDown()) {
				field3044 = 2;
				field807 = 2;
			} else {
				field3044 = 1;
				field807 = 1;
			}
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (field732 != null) {
			field807 = 0;
		}
	}

	@Override
	public synchronized void mouseMoved(MouseEvent arg0) {
		if (field732 != null) {
			field3668 = 0;
			field4353 = arg0.getX();
			field3297 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (field732 != null) {
			field3668 = 0;
			field4353 = arg0.getX();
			field3297 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (field732 != null) {
			field3668 = 0;
			field4353 = arg0.getX();
			field3297 = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (field732 != null) {
			field3668 = 0;
			field4353 = -1;
			field3297 = -1;
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
		if (field732 != null) {
			field3668 = 0;
			field807 = 0;
			int var2 = arg0.getModifiers();
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
