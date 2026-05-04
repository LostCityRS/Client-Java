package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("uh")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("jj.w")
	public static final LruCache field1955 = new LruCache(64);
	@ObfuscatedName("sh.x")
	public static Js5 field3883;

	@ObfuscatedName("uh.D")
	public int field4233;

	@ObfuscatedName("uh.E")
	public int field4234;

	@ObfuscatedName("uh.I")
	public int field4237;

	@ObfuscatedName("oa.b(II)Luh;")
	public static VarBitType method1043(int arg0) {
		VarBitType var1 = (VarBitType) field1955.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3883.getFile(Statics.method473(arg0), Statics.method1585(arg0));
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.method1516(new Packet(var2));
		}
		field1955.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("ge.b(Z)V")
	public static void resetCache() {
		field1955.clear();
	}

	@ObfuscatedName("qf.a(Lnb;B)V")
	public static void init(Js5 arg0) {
		field3883 = arg0;
	}

	@ObfuscatedName("uh.a(Lea;I)V")
	public void method1516(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method1518(var2, arg0);
		}
	}

	@ObfuscatedName("uh.a(IILea;)V")
	public void method1518(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field4233 = arg1.g2();
			this.field4234 = arg1.g1();
			this.field4237 = arg1.g1();
		}
	}
}
