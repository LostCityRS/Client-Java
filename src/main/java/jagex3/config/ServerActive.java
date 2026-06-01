package jagex3.config;

import deob.ObfuscatedName;

public class ServerActive {
	@ObfuscatedName("ch.a(II)Z")
	public static boolean isUseTarget(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("be.a(BI)I")
	public static int serverDraggable(int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@ObfuscatedName("fc.a(II)Z")
	public static boolean isDragTarget(int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@ObfuscatedName("fd.a(BI)Z")
	public static boolean isObjOpsEnabled(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("og.a(IB)Z")
	public static boolean isObjReplaceEnabled(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("ae.e(IB)Z")
	public static boolean isObjUseEnabled(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@ObfuscatedName("v.b(II)Z")
	public static boolean pauseButton(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("jg.a(III)Z")
	public static boolean hasOp(int arg0, int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@ObfuscatedName("ga.a(IZ)Z")
	public static boolean isObjSwapEnabled(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@ObfuscatedName("hj.a(II)I")
	public static int targetMask(int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
