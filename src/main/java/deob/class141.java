package deob;

@ObfuscatedName("mj")
public final class class141 {

	@ObfuscatedName("mj.a")
	public int[] field2599;

	@ObfuscatedName("mj.e")
	public int field2603 = -1;

	@ObfuscatedName("mj.f")
	public JagString[] field2604;

	@ObfuscatedName("mj.g")
	public ClientScript field2605;

	@ObfuscatedName("mj.j")
	public static final long[] crctable64 = new long[256];

	@ObfuscatedName("mj.l")
	public static int field2610 = 0;

	@ObfuscatedName("mj.n")
	public static final JagString field2612 = JagString.wrap(")3");

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			long var1 = (long) var0;
			for (int var3 = 0; var3 < 8; var3++) {
				if ((var1 & 0x1L) == 1L) {
					var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var1 >>>= 0x1;
				}
			}
			crctable64[var0] = var1;
		}
	}

	@ObfuscatedName("mj.a(IZILrf;)V")
	public static void method925(int arg0, int arg1, class191 arg2) {
		if (arg0 == arg2.field4077 && arg0 != -1) {
			SeqType var3 = SeqType.method75(arg0);
			int var4 = var3.field1966;
			if (var4 == 1) {
				arg2.field4132 = 0;
				arg2.field4098 = 0;
				arg2.field4140 = arg1;
				arg2.field4101 = 0;
				Statics.method433(false, arg2.field4121, arg2.field4101, arg2.field4136, var3);
			}
			if (var4 == 2) {
				arg2.field4132 = 0;
			}
		} else if (arg0 == -1 || arg2.field4077 == -1 || SeqType.method75(arg0).field1999 >= SeqType.method75(arg2.field4077).field1999) {
			arg2.field4098 = 0;
			arg2.field4140 = arg1;
			arg2.field4137 = arg2.field4135;
			arg2.field4101 = 0;
			arg2.field4132 = 0;
			arg2.field4077 = arg0;
			if (arg2.field4077 != -1) {
				Statics.method433(false, arg2.field4121, arg2.field4101, arg2.field4136, SeqType.method75(arg2.field4077));
			}
		}
	}

	@ObfuscatedName("mj.a(II)Li;")
	public static JagString method926(int arg0) {
		return JagString.join(new JagString[] { Statics.method1212(arg0 >> 24 & 0xFF), field2612, Statics.method1212(arg0 >> 16 & 0xFF), field2612, Statics.method1212(arg0 >> 8 & 0xFF), field2612, Statics.method1212(arg0 & 0xFF) });
	}
}
