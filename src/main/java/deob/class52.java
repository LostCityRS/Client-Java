package deob;

import jagex3.config.VarpType;
import jagex3.js5.Js5Loader;
import jagex3.js5.Js5Net;

@ObfuscatedName("hc")
public final class class52 {

	@ObfuscatedName("hc.a(ILga;I)V")
	public static void method405(int arg0, Js5Loader arg1) {
		if (Js5Net.masterIndexBuffer == null) {
			Js5Net.queueRequest(true, (byte) 0, 255, 255, null, 0);
			Js5Net.field2047[arg0] = arg1;
		} else {
			Js5Net.masterIndexBuffer.pos = arg0 * 8 + 5;
			int var2 = Js5Net.masterIndexBuffer.g4();
			int var3 = Js5Net.masterIndexBuffer.g4();
			arg1.requestIndex(var3, var2);
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static void method410() {
		VarpType.field43.clear();
	}
}
