package jagex2.client;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("f")
public class InputTracking {

	@ObfuscatedName("f.e")
	public static boolean field151;

	@ObfuscatedName("f.f")
	public static Packet field152 = null;

	@ObfuscatedName("f.g")
	public static Packet field153 = null;

	@ObfuscatedName("f.h")
	public static long field154;

	@ObfuscatedName("f.i")
	public static int field155;

	@ObfuscatedName("f.j")
	public static long field156;

	@ObfuscatedName("f.k")
	public static int field157;

	@ObfuscatedName("f.l")
	public static int field158;

	@ObfuscatedName("f.a(I)V")
	public static final synchronized void method44() {
		field152 = Packet.method226(1);
		field153 = null;
		field154 = System.currentTimeMillis();
		field151 = true;
	}

	@ObfuscatedName("f.b(I)V")
	public static final synchronized void method45() {
		field151 = false;
		field152 = null;
		field153 = null;
	}

	@ObfuscatedName("f.c(I)Lmb;")
	public static final synchronized Packet method46() {
		Packet var1 = null;
		if (field153 != null && field151) {
			var1 = field153;
		}
		field153 = null;
		return var1;
	}

	@ObfuscatedName("f.a(Z)Lmb;")
	public static final synchronized Packet method47() {
		Packet var1 = null;
		if (field152 != null && field152.field711 > 0 && field151) {
			var1 = field152;
		}
		method45();
		return var1;
	}

	@ObfuscatedName("f.a(II)V")
	public static final synchronized void method48(int arg1) {
		if (field152.field711 + arg1 >= 500) {
			Packet var2 = field152;
			field152 = Packet.method226(1);
			field153 = var2;
		}
	}

	@ObfuscatedName("f.a(IBII)V")
	public static final synchronized void method49(int arg0, int arg2, int arg3) {
		if (!field151 || (arg0 < 0 || arg0 >= 789 || arg2 < 0 || arg2 >= 532)) {
			return;
		}
		field155++;
		long var4 = System.currentTimeMillis();
		long var6 = (var4 - field154) / 10L;
		if (var6 > 250L) {
			var6 = 250L;
		}
		field154 = var4;
		method48(5);
		if (arg3 == 1) {
			field152.method229(1);
		} else {
			field152.method229(2);
		}
		field152.method229((int) var6);
		field152.method232(arg0 + (arg2 << 10));
	}

	@ObfuscatedName("f.a(IB)V")
	public static final synchronized void method50(int arg0) {
		if (!field151) {
			return;
		}
		field155++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - field154) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		field154 = var2;
		method48(2);
		if (arg0 == 1) {
			field152.method229(3);
		} else {
			field152.method229(4);
		}
		field152.method229((int) var4);
	}

	@ObfuscatedName("f.a(III)V")
	public static final synchronized void method51(int arg1, int arg2) {
		if (!field151 || (arg1 < 0 || arg1 >= 789 || arg2 < 0 || arg2 >= 532)) {
			return;
		}
		long var4 = System.currentTimeMillis();
		if (var4 - field156 < 50L) {
			return;
		}
		field156 = var4;
		field155++;
		long var6 = (var4 - field154) / 10L;
		if (var6 > 250L) {
			var6 = 250L;
		}
		field154 = var4;
		if (arg1 - field157 < 8 && arg1 - field157 >= -8 && arg2 - field158 < 8 && arg2 - field158 >= -8) {
			method48(3);
			field152.method229(5);
			field152.method229((int) var6);
			field152.method229(arg1 - field157 + 8 + (arg2 - field158 + 8 << 4));
		} else if (arg1 - field157 < 128 && arg1 - field157 >= -128 && arg2 - field158 < 128 && arg2 - field158 >= -128) {
			method48(4);
			field152.method229(6);
			field152.method229((int) var6);
			field152.method229(arg1 - field157 + 128);
			field152.method229(arg2 - field158 + 128);
		} else {
			method48(5);
			field152.method229(7);
			field152.method229((int) var6);
			field152.method232(arg1 + (arg2 << 10));
		}
		field157 = arg1;
		field158 = arg2;
	}

	@ObfuscatedName("f.b(II)V")
	public static final synchronized void method52(int arg0) {
		if (!field151) {
			return;
		}
		field155++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - field154) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		field154 = var2;
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
		method48(3);
		field152.method229(8);
		field152.method229((int) var4);
		field152.method229(arg0);
	}

	@ObfuscatedName("f.c(II)V")
	public static final synchronized void method53(int arg1) {
		if (!field151) {
			return;
		}
		field155++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - field154) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		field154 = var2;
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
		method48(3);
		field152.method229(9);
		field152.method229((int) var4);
		field152.method229(arg1);
	}

	@ObfuscatedName("f.a(B)V")
	public static final synchronized void method54() {
		if (!field151) {
			return;
		}
		field155++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - field154) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		field154 = var2;
		method48(2);
		field152.method229(10);
		field152.method229((int) var4);
	}

	@ObfuscatedName("f.d(I)V")
	public static final synchronized void method55() {
		if (!field151) {
			return;
		}
		field155++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field154) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}
		field154 = var1;
		method48(2);
		field152.method229(11);
		field152.method229((int) var3);
	}

	@ObfuscatedName("f.b(Z)V")
	public static final synchronized void method56() {
		if (!field151) {
			return;
		}
		field155++;
		long var1 = System.currentTimeMillis();
		long var3 = (var1 - field154) / 10L;
		if (var3 > 250L) {
			var3 = 250L;
		}
		field154 = var1;
		method48(2);
		field152.method229(12);
		field152.method229((int) var3);
	}

	@ObfuscatedName("f.e(I)V")
	public static final synchronized void method57() {
		if (!field151) {
			return;
		}
		field155++;
		long var2 = System.currentTimeMillis();
		long var4 = (var2 - field154) / 10L;
		if (var4 > 250L) {
			var4 = 250L;
		}
		field154 = var2;
		method48(2);
		field152.method229(13);
		field152.method229((int) var4);
	}
}
