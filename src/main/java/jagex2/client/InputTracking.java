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
	public static final synchronized void setEnabled() {
		oldBuffer = Packet.alloc(5, 1);
		outBuffer = null;
		lastTime = System.currentTimeMillis();
		enabled = true;
	}

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void setDisabled() {
		enabled = false;
		oldBuffer = null;
		outBuffer = null;
	}

	@ObfuscatedName("f.b(I)Lmb;")
	public static final synchronized Packet flush() {
		Packet var1 = null;
		if (outBuffer != null && enabled) {
			var1 = outBuffer;
		}
		outBuffer = null;
		return var1;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static final synchronized Packet stop() {
		Packet var1 = null;
		if (oldBuffer != null && oldBuffer.pos > 0 && enabled) {
			var1 = oldBuffer;
		}
		setDisabled();
		return var1;
	}

	@ObfuscatedName("f.a(ZI)V")
	public static final synchronized void ensureCapacity(int arg1) {
		if (oldBuffer.pos + arg1 >= 500) {
			Packet var3 = oldBuffer;
			oldBuffer = Packet.alloc(5, 1);
			outBuffer = var3;
		}
	}

	@ObfuscatedName("f.a(IZII)V")
	public static final synchronized void mousePressed(int arg0, int arg2, int arg3) {
		if (!enabled || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
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
			oldBuffer.p1(1);
		} else {
			oldBuffer.p1(2);
		}
		oldBuffer.p1((int) var6);
		oldBuffer.p3((arg2 << 10) + arg0);
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void mouseReleased(int arg1) {
		if (!enabled) {
			return;
		}
		trackedCount++;
		long var3 = System.currentTimeMillis();
		long var5 = (var3 - lastTime) / 10L;
		if (var5 > 250L) {
			var5 = 250L;
		}
		lastTime = var3;
		ensureCapacity(2);
		if (arg1 == 1) {
			oldBuffer.p1(3);
		} else {
			oldBuffer.p1(4);
		}
		oldBuffer.p1((int) var5);
	}

	@ObfuscatedName("f.a(III)V")
	public static final synchronized void mouseMoved(int arg0, int arg2) {
		if (!enabled || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
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
		if (arg0 - lastX < 8 && arg0 - lastX >= -8 && arg2 - lastY < 8 && arg2 - lastY >= -8) {
			ensureCapacity(3);
			oldBuffer.p1(5);
			oldBuffer.p1((int) var6);
			oldBuffer.p1((arg2 - lastY + 8 << 4) + arg0 - lastX + 8);
		} else if (arg0 - lastX < 128 && arg0 - lastX >= -128 && arg2 - lastY < 128 && arg2 - lastY >= -128) {
			ensureCapacity(4);
			oldBuffer.p1(6);
			oldBuffer.p1((int) var6);
			oldBuffer.p1(arg0 - lastX + 128);
			oldBuffer.p1(arg2 - lastY + 128);
		} else {
			ensureCapacity(5);
			oldBuffer.p1(7);
			oldBuffer.p1((int) var6);
			oldBuffer.p3((arg2 << 10) + arg0);
		}
		lastX = arg0;
		lastY = arg2;
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void keyPressed(int arg0) {
		if (!enabled) {
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
		oldBuffer.p1(8);
		oldBuffer.p1((int) var4);
		oldBuffer.p1(arg0);
	}

	@ObfuscatedName("f.a(IZ)V")
	public static final synchronized void keyReleased(int arg0) {
		if (!enabled) {
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
		oldBuffer.p1(9);
		oldBuffer.p1((int) var4);
		oldBuffer.p1(arg0);
	}

	@ObfuscatedName("f.b(B)V")
	public static final synchronized void focusGained() {
		if (!enabled) {
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
		oldBuffer.p1(10);
		oldBuffer.p1((int) var3);
	}

	@ObfuscatedName("f.a(Z)V")
	public static final synchronized void focusLost() {
		if (!enabled) {
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
		oldBuffer.p1(11);
		oldBuffer.p1((int) var3);
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void mouseEntered() {
		if (!enabled) {
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
		oldBuffer.p1(12);
		oldBuffer.p1((int) var3);
	}

	@ObfuscatedName("f.c(B)V")
	public static final synchronized void mouseExited() {
		if (!enabled) {
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
		oldBuffer.p1(13);
		oldBuffer.p1((int) var3);
	}
}
