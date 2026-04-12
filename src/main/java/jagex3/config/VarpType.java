package jagex3.config;

import deob.ObfuscatedName;
import deob.Statics;
import deob.class24;
import jagex3.datastruct.Linkable2;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("qa")
public final class VarpType extends Linkable2 {

	@ObfuscatedName("qa.Hb")
	public int field2404 = 0;

	@ObfuscatedName("vd.a(BI)Lqa;")
	public static VarpType method1023(int arg0) {
		VarpType var1 = (VarpType) class24.field727.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field3167.method217(arg0, 16);
		VarpType var3 = new VarpType();
		if (var2 != null) {
			var3.method838(new Packet(var2));
		}
		class24.field727.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("client.a(Lbd;Z)V")
	public static void init(Js5 arg0) {
		Statics.field3167 = arg0;
		Statics.field2915 = Statics.field3167.method235(16);
	}

	@ObfuscatedName("qa.a(Lba;I)V")
	public void method838(Packet arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method839(var2, arg0);
		}
	}

	@ObfuscatedName("qa.a(IILba;)V")
	public void method839(int arg0, Packet arg1) {
		if (arg0 == 5) {
			this.field2404 = arg1.method145();
		}
	}
}
