package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class108;
import deob.class23;
import jagex3.config.FloType;
import jagex3.config.VarpType;
import jagex3.dash3d.ClientEntity;
import jagex3.dash3d.ClientLocAnim;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.LruCache;
import jagex3.graphics.Pix32;

import java.awt.event.*;

@ObfuscatedName("ub")
public final class ClientMouseListener implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("ub.d")
	public static int field3030 = -1;

	@ObfuscatedName("ub.i")
	public static LruCache field3035 = new LruCache(50);

	@ObfuscatedName("ub.k")
	public static int field3037 = -1;

	@ObfuscatedName("ub.t")
	public static Pix32[] field3046 = new Pix32[1000];

	@ObfuscatedName("ub.x")
	public static int field3050 = 0;

	@ObfuscatedName("ub.z")
	public static int field3052 = 78;

	@Override
	public synchronized void mouseEntered(MouseEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			LruCache.field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseExited(MouseEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = -1;
			LruCache.field496 = -1;
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LruCache.field494 = 0;
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			LruCache.field496 = arg0.getY();
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
	}

	@Override
	public synchronized void mousePressed(MouseEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			class108.field2711 = arg0.getX();
			VarpType.field2396 = arg0.getY();
			FloType.field919 = Statics.method869();
			if (arg0.isMetaDown()) {
				ClientEntity.field2017 = 2;
				LruCache.field494 = 2;
			} else {
				ClientEntity.field2017 = 1;
				LruCache.field494 = 1;
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
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			class23.field710 = arg0.getX();
			LruCache.field496 = arg0.getY();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent arg0) {
		if (ClientLocAnim.field1412 != null) {
			LinkList.field2293 = 0;
			LruCache.field494 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}
