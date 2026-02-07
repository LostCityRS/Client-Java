package jagex3.config.iftype;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("fb")
public final class ServerActive extends Linkable {

	@ObfuscatedName("fb.t")
	public int eventCode;

	public ServerActive() {
	}

	public ServerActive(int arg0) {
		this.eventCode = arg0;
	}

	@ObfuscatedName("kb.a(II)Z")
	public static boolean pauseButton(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("be.a(III)Z")
	public static boolean hasOp(int arg0, int opindex) {
		return ((arg0 >> (opindex + 1)) & 0x1) != 0;
	}

	@ObfuscatedName("oa.a(ZI)I")
	public static int targetMask(int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@ObfuscatedName("ha.b(II)I")
	public static int serverDraggable(int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@ObfuscatedName("qf.a(II)Z")
	public static boolean isDragTarget(int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@ObfuscatedName("nd.a(IB)Z")
	public static boolean isUseTarget(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("bf.a(BI)Z")
	public static boolean isObjSwapEnabled(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@ObfuscatedName("i.a(II)Z")
	public static boolean isObjReplaceEnabled(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("of.a(II)Z")
	public static boolean isObjOpsEnabled(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("wd.a(II)Z")
	public static boolean isObjUseEnabled(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
