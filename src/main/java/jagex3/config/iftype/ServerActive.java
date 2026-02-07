package jagex3.config.iftype;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable;

@ObfuscatedName("fb")
public final class ServerActive extends Linkable {

	@ObfuscatedName("fb.t")
	public int field900;

	public ServerActive() {
	}

	public ServerActive(int arg0) {
		this.field900 = arg0;
	}

	@ObfuscatedName("ha.b(II)I")
	public static int method395(int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@ObfuscatedName("i.a(II)Z")
	public static boolean method436(int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@ObfuscatedName("nd.a(IB)Z")
	public static boolean method742(int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@ObfuscatedName("of.a(II)Z")
	public static boolean method830(int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@ObfuscatedName("oa.a(ZI)I")
	public static int method768(int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@ObfuscatedName("bf.a(BI)Z")
	public static boolean method78(int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@ObfuscatedName("qf.a(II)Z")
	public static boolean method924(int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@ObfuscatedName("kb.a(II)Z")
	public static boolean method583(int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@ObfuscatedName("wd.a(II)Z")
	public static boolean method1210(int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
