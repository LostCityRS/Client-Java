package jagex3.config;

import deob.ObfuscatedName;

public class ServerActive {
	@ObfuscatedName("ch.a(II)Z")
	public static boolean method201(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

    @ObfuscatedName("be.a(BI)I")
    public static int method81(int arg0) {
        return arg0 >> 17 & 0x7;
    }

	@ObfuscatedName("fc.a(II)Z")
	public static boolean method423(int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@ObfuscatedName("fd.a(BI)Z")
	public static boolean method431(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("og.a(IB)Z")
	public static boolean method1070(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

    @ObfuscatedName("ae.e(IB)Z")
    public static boolean method27(int arg0) {
        return (arg0 >> 31 & 0x1) != 0;
    }

	@ObfuscatedName("v.b(II)Z")
	public static boolean method1526(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("jg.a(III)Z")
	public static boolean method726(int arg0, int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("ga.a(IZ)Z")
	public static boolean method465(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
