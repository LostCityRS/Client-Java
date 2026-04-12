package jagex3.config;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("fd")
public final class VarBitType extends Linkable2 {

	@ObfuscatedName("fd.Cb")
	public static int field934 = 0;

	@ObfuscatedName("fd.Eb")
	public static int[] field936 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

	@ObfuscatedName("fd.Jb")
	public static int field941 = 0;
	@ObfuscatedName("sd.b")
	public static LruCache field2755 = new LruCache(64);
	@ObfuscatedName("kb.o")
	public static Js5 field1555;

	@ObfuscatedName("fd.Bb")
	public int field933;

	@ObfuscatedName("fd.Lb")
	public int field943;

	@ObfuscatedName("fd.Nb")
	public int field945;

	@ObfuscatedName("mb.a(II)Lfd;")
	public static VarBitType method686(int arg0) {
		VarBitType var1 = (VarBitType) field2755.method263((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = field1555.method217(arg0, 14);
		VarBitType var3 = new VarBitType();
		if (var2 != null) {
			var3.method402(new Packet(var2));
		}
		field2755.method262((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("r.a(ILbd;)V")
	public static void init(Js5 arg0) {
		field1555 = arg0;
	}

	@ObfuscatedName("pb.c(I)V")
	public static void method807() {
		field2755.method267();
	}

	@ObfuscatedName("fd.a(ILba;)V")
	public void method402(Packet arg0) {
		while (true) {
			int var2 = arg0.method144();
			if (var2 == 0) {
				return;
			}
			this.method403(arg0, var2);
		}
	}

	@ObfuscatedName("fd.a(Lba;II)V")
	public void method403(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field933 = arg0.method145();
			this.field943 = arg0.method144();
			this.field945 = arg0.method144();
		}
	}
}
