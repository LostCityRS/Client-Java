package jagex2.client;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class InputTracking {

	@ObfuscatedName("f.e")
	public static boolean enabled;

	@ObfuscatedName("f.f")
	public static Packet outBuffer = null;

	@ObfuscatedName("f.g")
	public static Packet oldBuffer = null;

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
	public static final synchronized void setEnabled() {
		outBuffer = Packet.alloc(1);
		oldBuffer = null;
		lastTime = System.currentTimeMillis();
		enabled = true;
	}

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void setDisabled() {
		enabled = false;
		outBuffer = null;
		oldBuffer = null;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized Packet flush() {
		Packet buf = null;

		if (oldBuffer != null && enabled) {
			buf = oldBuffer;
		}

		oldBuffer = null;
		return buf;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static final synchronized Packet stop() {
		Packet buf = null;

		if (outBuffer != null && outBuffer.pos > 0 && enabled) {
			buf = outBuffer;
		}

		setDisabled();
		return buf;
	}

	@ObfuscatedName("f.a(ZI)V")
	public static final synchronized void ensureCapacity(int n) {
		if (outBuffer.pos + n >= 500) {
			Packet buf = outBuffer;
			outBuffer = Packet.alloc(1);
			oldBuffer = buf;
		}
	}

	@ObfuscatedName("f.a(IZII)V")
	public static final synchronized void mousePressed(int x, int y, int button) {
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
			outBuffer.p1(1);
		} else {
			outBuffer.p1(2);
		}

		outBuffer.p1((int) delta);
		outBuffer.p3((y << 10) + x);
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void mouseReleased(int button) {
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
			outBuffer.p1(3);
		} else {
			outBuffer.p1(4);
		}

		outBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.a(III)V")
	public static final synchronized void mouseMoved(int x, int y) {
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
			outBuffer.p1(5);
			outBuffer.p1((int) delta);
			outBuffer.p1((y - lastY + 8 << 4) + x - lastX + 8);
		} else if (x - lastX < 128 && x - lastX >= -128 && y - lastY < 128 && y - lastY >= -128) {
			ensureCapacity(4);
			outBuffer.p1(6);
			outBuffer.p1((int) delta);
			outBuffer.p1(x - lastX + 128);
			outBuffer.p1(y - lastY + 128);
		} else {
			ensureCapacity(5);
			outBuffer.p1(7);
			outBuffer.p1((int) delta);
			outBuffer.p3((y << 10) + x);
		}

		lastX = x;
		lastY = y;
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void keyPressed(int key) {
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
		outBuffer.p1(8);
		outBuffer.p1((int) delta);
		outBuffer.p1(key);
	}

	@ObfuscatedName("f.a(IZ)V")
	public static final synchronized void keyReleased(int key) {
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
		outBuffer.p1(9);
		outBuffer.p1((int) delta);
		outBuffer.p1(key);
	}

	@ObfuscatedName("f.b(B)V")
	public static final synchronized void focusGained() {
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
		outBuffer.p1(10);
		outBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.a(Z)V")
	public static final synchronized void focusLost() {
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
		outBuffer.p1(11);
		outBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void mouseEntered() {
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
		outBuffer.p1(12);
		outBuffer.p1((int) delta);
	}

	@ObfuscatedName("f.c(B)V")
	public static final synchronized void mouseExited() {
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
		outBuffer.p1(13);
		outBuffer.p1((int) delta);
	}
}
