package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;
import jagex3.jstring.JagString;

@ObfuscatedName("ac")
public final class ParamType extends Linkable2 {

	@ObfuscatedName("of.c")
	public static final LruCache recentUse = new LruCache(64);

	@ObfuscatedName("qe.k")
	public static Js5 configClient;

	@ObfuscatedName("ac.I")
	public int type;

	@ObfuscatedName("ac.K")
	public int defaultInt;

	@ObfuscatedName("ac.O")
	public JagString defaultString;

	@ObfuscatedName("ti.a(IB)Lac;")
	public static ParamType list(int arg0) {
		ParamType var1 = (ParamType) recentUse.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = configClient.getFile(arg0, 11);
		ParamType var3 = new ParamType();
		if (var2 != null) {
			var3.decode(new Packet(var2));
		}
		recentUse.put((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("j.a(BLnb;)V")
	public static void init(Js5 arg0) {
		configClient = arg0;
	}

	@ObfuscatedName("ac.d(I)Z")
	public boolean isString() {
		return this.type == 115;
	}

	@ObfuscatedName("ac.b(Lea;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(ILea;I)V")
	public void decode(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.type = arg1.g1();
		} else if (arg0 == 2) {
			this.defaultInt = arg1.g4();
		} else if (arg0 == 5) {
			this.defaultString = arg1.gjstr();
		}
	}
}
