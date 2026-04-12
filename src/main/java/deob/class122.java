package deob;

import java.awt.event.*;

@ObfuscatedName("ub")
public final class class122 implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("ub.d")
	public static int field3030 = -1;

	@ObfuscatedName("ub.i")
	public static class15 field3035 = new class15(50);

	@ObfuscatedName("ub.k")
	public static int field3037 = -1;

	@ObfuscatedName("ub.t")
	public static class58[] field3046 = new class58[1000];

	@ObfuscatedName("ub.x")
	public static int field3050 = 0;

	@ObfuscatedName("ub.z")
	public static int field3052 = 78;

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			class15.field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = -1;
			class15.field496 = -1;
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (class54.field1412 != null) {
			class15.field494 = 0;
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			class15.field496 = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class108.field2711 = arg0.getX();
			class97.field2396 = arg0.getY();
			class34.field919 = Statics.method869();
			if (arg0.isMetaDown()) {
				class80.field2017 = 2;
				class15.field494 = 2;
			} else {
				class80.field2017 = 1;
				class15.field494 = 1;
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
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			class15.field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (class54.field1412 != null) {
			LinkList.field2293 = 0;
			class15.field494 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
