package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("uh")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("jj.w")
	public static final LruCache recentUse = new LruCache(64);
	@ObfuscatedName("sh.x")
	public static Js5 configClient;

	@ObfuscatedName("uh.D")
	public int basevar;

	@ObfuscatedName("uh.E")
	public int startbit;

	@ObfuscatedName("uh.I")
	public int endbit;

	@ObfuscatedName("oa.b(II)Luh;")
	public static VarBitType list(int arg0) {
		VarBitType var1 = (VarBitType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(method473(arg0), method1585(arg0));
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ge.b(Z)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("qf.a(Lnb;B)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("ge.a(BI)I")
	public static int method473(int arg0) {
		return arg0 & 0x3FF;
	}

	@ObfuscatedName("wa.a(II)I")
	public static int method1585(int arg0) {
		return arg0 >>> 10;
	}

	@ObfuscatedName("uh.a(Lea;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("uh.a(IILea;)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.basevar = arg1.g2();
			this.startbit = arg1.g1();
			this.endbit = arg1.g1();
		}
	}
}
