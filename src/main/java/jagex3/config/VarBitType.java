package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("fd")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("sd.b")
	public static LruCache recentUse = new LruCache(64);
	@ObfuscatedName("kb.o")
	public static Js5 configClient;

	@ObfuscatedName("fd.Bb")
	public int basevar;

	@ObfuscatedName("fd.Lb")
	public int startbit;

	@ObfuscatedName("fd.Nb")
	public int endbit;

	@ObfuscatedName("mb.a(II)Lfd;")
	public static VarBitType list(int arg0) {
		VarBitType var1 = (VarBitType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 14);
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("r.a(ILbd;)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("pb.c(I)V")
	public static void resetCache() {
		recentUse.clear();
	}

	@ObfuscatedName("fd.a(ILba;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("fd.a(Lba;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.basevar = arg0.g2();
			this.startbit = arg0.g1();
			this.endbit = arg0.g1();
		}
	}
}
