package jagex2.client;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class InputTracking {

	@ObfuscatedName("f.e")
	public static boolean active;

	@ObfuscatedName("f.f")
	public static Packet old = null;

	@ObfuscatedName("f.g")
	public static Packet out = null;

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
	public static synchronized void activate() {
		old = Packet.alloc(1);
		out = null;
		lastTime = System.currentTimeMillis();
		active = true;
	}

	@ObfuscatedName("f.b(I)V")
	public static synchronized void deactivate() {
		active = false;
		old = null;
		out = null;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static synchronized Packet flush() {
		Packet var1 = null;
		if (out != null && active) {
			var1 = out;
		}
		out = null;
		return var1;
	}

	@ObfuscatedName("f.a(Z)Lmb;")
	public static synchronized Packet stop() {
		Packet var1 = null;
		if (old != null && old.pos > 0 && active) {
			var1 = old;
		}
		deactivate();
		return var1;
	}

	@ObfuscatedName("f.a(II)V")
	public static synchronized void ensureCapacity(int arg1) {
		if (old.pos + arg1 >= 500) {
			Packet var2 = old;
			old = Packet.alloc(1);
			out = var2;
		}
	}

	@ObfuscatedName("f.a(IBII)V")
	public static synchronized void mousePressed(int arg0, int arg2, int arg3) {
		if (!active || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
			return;
		}
		trackedCount++;
		long var4 = System.currentTimeMillis();
		long var6 = (var4 - lastTime) / 10L;
		if (var6 > 250L) {
			var6 = 250L;
		}
		lastTime = var4;
		ensureCapacity(5);
		if (arg3 == 1) {
			old.p1(1);
		} else {
			old.p1(2);
		}
		old.p1((int) var6);
		old.p3(arg0 + (arg2 << 10));
	}

	@ObfuscatedName("f.a(IB)V")
	public static synchronized void mouseReleased(int arg0) {
		if (!active) {
			return;
		}
		trackedCount++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - lastTime) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		lastTime = var2;
		ensureCapacity(2);
		if (arg0 == 1) {
			old.p1(3);
		} else {
			old.p1(4);
		}
		old.p1((int) var4);
	}

	@ObfuscatedName("f.a(III)V")
	public static synchronized void mouseMoved(int arg1, int arg2) {
		if (!active || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
			return;
		}
		long var4 = System.currentTimeMillis();
		if (var4 - lastMoveTime < 50L) {
			return;
		}
		lastMoveTime = var4;
		trackedCount++;
		long var6 = (var4 - lastTime) / 10L;
		if (var6 > 250L) {
			var6 = 250L;
		}
		lastTime = var4;
		if (arg1 - lastX < 8 && arg1 - lastX >= -8 && arg2 - lastY < 8 && arg2 - lastY >= -8) {
			ensureCapacity(3);
			old.p1(5);
			old.p1((int) var6);
			old.p1(arg1 - lastX + 8 + (arg2 - lastY + 8 << 4));
		} else if (arg1 - lastX < 128 && arg1 - lastX >= -128 && arg2 - lastY < 128 && arg2 - lastY >= -128) {
			ensureCapacity(4);
			old.p1(6);
			old.p1((int) var6);
			old.p1(arg1 - lastX + 128);
			old.p1(arg2 - lastY + 128);
		} else {
			ensureCapacity(5);
			old.p1(7);
			old.p1((int) var6);
			old.p3(arg1 + (arg2 << 10));
		}
		lastX = arg1;
		lastY = arg2;
	}

	@ObfuscatedName("f.b(II)V")
	public static synchronized void keyPressed(int arg0) {
		if (!active) {
			return;
		}
		trackedCount++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - lastTime) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		lastTime = var2;
		if (arg0 == 1000) {
			arg0 = 11;
		}
		if (arg0 == 1001) {
			arg0 = 12;
		}
		if (arg0 == 1002) {
			arg0 = 14;
		}
		if (arg0 == 1003) {
			arg0 = 15;
		}
		if (arg0 >= 1008) {
			arg0 -= 992;
		}
		ensureCapacity(3);
		old.p1(8);
		old.p1((int) var4);
		old.p1(arg0);
	}

	@ObfuscatedName("f.c(II)V")
	public static synchronized void keyReleased(int arg1) {
		if (!active) {
			return;
		}
		trackedCount++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - lastTime) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		lastTime = var2;
		if (arg1 == 1000) {
			arg1 = 11;
		}
		if (arg1 == 1001) {
			arg1 = 12;
		}
		if (arg1 == 1002) {
			arg1 = 14;
		}
		if (arg1 == 1003) {
			arg1 = 15;
		}
		if (arg1 >= 1008) {
			arg1 -= 992;
		}
		ensureCapacity(3);
		old.p1(9);
		old.p1((int) var4);
		old.p1(arg1);
	}

	@ObfuscatedName("f.a(B)V")
	public static synchronized void focusGained() {
		if (!active) {
			return;
		}
		trackedCount++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - lastTime) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		lastTime = var2;
		ensureCapacity(2);
		old.p1(10);
		old.p1((int) var4);
	}

	@ObfuscatedName("f.d(I)V")
	public static synchronized void focusLost() {
		if (!active) {
			return;
		}
		trackedCount++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - lastTime) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}
		lastTime = var1;
		ensureCapacity(2);
		old.p1(11);
		old.p1((int) var3);
	}

	@ObfuscatedName("f.b(Z)V")
	public static synchronized void mouseEntered() {
		if (!active) {
			return;
		}
		trackedCount++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - lastTime) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}
		lastTime = var1;
		ensureCapacity(2);
		old.p1(12);
		old.p1((int) var3);
	}

	@ObfuscatedName("f.e(I)V")
	public static synchronized void mouseExited() {
		if (!active) {
			return;
		}
		trackedCount++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - lastTime) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		lastTime = var2;
		ensureCapacity(2);
		old.p1(13);
		old.p1((int) var4);
	}
}
