package deob;

@ObfuscatedName("ac")
public final class ParamType extends Linkable2 {

	@ObfuscatedName("of.c")
	public static final LruCache field3038 = new LruCache(64);

	@ObfuscatedName("qe.k")
	public static Js5 field3565;

	@ObfuscatedName("ac.I")
	public int field51;

	@ObfuscatedName("ac.K")
	public int field53;

	@ObfuscatedName("ac.L")
	public static JagString field54;

	@ObfuscatedName("ac.O")
	public JagString field57;

	@ObfuscatedName("ti.a(IB)Lac;")
	public static ParamType method1467(int arg0) {
		ParamType var1 = (ParamType) field3038.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field3565.getFile(arg0, 11);
		ParamType var3 = new ParamType();
		if (var2 != null) {
			var3.method21(new Packet(var2));
		}
		field3038.method663((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("j.a(BLnb;)V")
	public static void init(Js5 arg0) {
		field3565 = arg0;
	}

	@ObfuscatedName("ac.d(I)Z")
	public boolean method17() {
		return this.field51 == 115;
	}

	@ObfuscatedName("ac.b(Lea;B)V")
	public void method21(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method22(var2, arg0);
		}
	}

	@ObfuscatedName("ac.a(ILea;I)V")
	public void method22(int arg0, Packet arg1) {
		if (arg0 == 1) {
			this.field51 = arg1.g1();
		} else if (arg0 == 2) {
			this.field53 = arg1.g4();
		} else if (arg0 == 5) {
			this.field57 = arg1.gjstr();
		}
	}
}
