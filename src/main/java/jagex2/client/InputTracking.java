package jagex2.client;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class InputTracking {

	@ObfuscatedName("f.e")
	public static boolean enabled;

	@ObfuscatedName("f.f")
	public static Packet oldBuffer = null;

	@ObfuscatedName("f.g")
	public static Packet outBuffer = null;

	@ObfuscatedName("f.h")
	public static long lastTime;

	@ObfuscatedName("f.i")
	public static int trackedCount;

	@ObfuscatedName("f.j")
	public static long lastMoveTime;

	@ObfuscatedName("f.k")
	public static int lastX;

	@ObfuscatedName("f.l")
	public static int lastY;

	@ObfuscatedName("f.a(I)V")
	public static synchronized void setEnabled() {
		oldBuffer = Packet.alloc(1);
		outBuffer = null;
		lastTime = System.currentTimeMillis();
		enabled = true;
	}

	@ObfuscatedName("f.a(Z)V")
	public static synchronized void setDisabled() {
		enabled = false;
		oldBuffer = null;
		outBuffer = null;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static synchronized Packet flush() {
		Packet buf = null;
		if (outBuffer != null && enabled) {
			buf = outBuffer;
		}

		outBuffer = null;
		return buf;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static synchronized Packet stop() {
		Packet buf = null;
		if (oldBuffer != null && oldBuffer.pos > 0 && enabled) {
			buf = oldBuffer;
		}

		setDisabled();
		return buf;
	}

	@ObfuscatedName("f.a(IZ)V")
	public static synchronized void ensureCapacity(int n) {
		if (oldBuffer.pos + n >= 500) {
			Packet buf = oldBuffer;
			oldBuffer = Packet.alloc(1);
			outBuffer = buf;
		}
	}

	@ObfuscatedName("f.a(IIII)V")
	public static synchronized void mousePressed(int y, int button, int x) {
		if (!enabled || (x < 0 || x >= 789 || y < 0 || y >= 532)) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(5);
		if (button == 1) {
			oldBuffer.p1(1);
		} else {
			oldBuffer.p1(2);
		}
		oldBuffer.p1((int) delta);
		oldBuffer.p3(x + (y << 10));
	}

	@ObfuscatedName("f.a(II)V")
	public static synchronized void mouseReleased(int button) {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(2);
		if (button == 1) {
			oldBuffer.p1(3);
		} else {
			oldBuffer.p1(4);
		}
		oldBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.a(ZII)V")
	public static synchronized void mouseMoved(int x, int y) {
		if (!enabled || (x < 0 || x >= 789 || y < 0 || y >= 532)) {
			return;
		}

		long now = System.currentTimeMillis();
		if (now - lastMoveTime < 50L) {
			return;
		}

		lastMoveTime = now;
		trackedCount++;

		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		if (x - lastX < 8 && x - lastX >= -8 && y - lastY < 8 && y - lastY >= -8) {
			ensureCapacity(3);
			oldBuffer.p1(5);
			oldBuffer.p1((int) delta);
			oldBuffer.p1(x - lastX + 8 + (y - lastY + 8 << 4));
		} else if (x - lastX < 128 && x - lastX >= -128 && y - lastY < 128 && y - lastY >= -128) {
			ensureCapacity(4);
			oldBuffer.p1(6);
			oldBuffer.p1((int) delta);
			oldBuffer.p1(x - lastX + 128);
			oldBuffer.p1(y - lastY + 128);
		} else {
			ensureCapacity(5);
			oldBuffer.p1(7);
			oldBuffer.p1((int) delta);
			oldBuffer.p3(x + (y << 10));
		}

		lastX = x;
		lastY = y;
	}

	@ObfuscatedName("f.b(IZ)V")
	public static synchronized void keyPressed(int key) {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		if (key == 1000) {
			key = 11;
		} else if (key == 1001) {
			key = 12;
		} else if (key == 1002) {
			key = 14;
		} else if (key == 1003) {
			key = 15;
		} else if (key >= 1008) {
			key -= 992;
		}

		ensureCapacity(3);
		oldBuffer.p1(8);
		oldBuffer.p1((int) delta);
		oldBuffer.p1(key);
	}

	@ObfuscatedName("f.b(II)V")
	public static synchronized void keyReleased(int key) {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		if (key == 1000) {
			key = 11;
		} else if (key == 1001) {
			key = 12;
		} else if (key == 1002) {
			key = 14;
		} else if (key == 1003) {
			key = 15;
		} else if (key >= 1008) {
			key -= 992;
		}

		ensureCapacity(3);
		oldBuffer.p1(9);
		oldBuffer.p1((int) delta);
		oldBuffer.p1(key);
	}

	@ObfuscatedName("f.d(I)V")
	public static synchronized void focusGained() {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(2);
		oldBuffer.p1(10);
		oldBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.b(Z)V")
	public static synchronized void focusLost() {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(2);
		oldBuffer.p1(11);
		oldBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.a(B)V")
	public static synchronized void mouseEntered() {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(2);
		oldBuffer.p1(12);
		oldBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.e(I)V")
	public static synchronized void mouseExited() {
		if (!enabled) {
			return;
		}

		trackedCount++;

		long now = System.currentTimeMillis();
		long delta = (now - lastTime) / 10L;
		if (delta > 250L) {
			delta = 250L;
		}
		lastTime = now;

		ensureCapacity(2);
		oldBuffer.p1(13);
		oldBuffer.p1((int) delta);
	}
}
