package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.js5.Js5;
import jagex3.sound.WaveCache;
import jagex3.util.JagString;

public class MidiManager {
	@ObfuscatedName("kd.E")
	public static int field1724;
	@ObfuscatedName("wd.C")
	public static int field3606;
	@ObfuscatedName("oa.K")
	public static int field2263 = 0;
	@ObfuscatedName("m.S")
	public static MidiPlayer field1966;
	@ObfuscatedName("ee.Z")
	public static Js5 field718;
	@ObfuscatedName("ia.Q")
	public static int field1321;
	@ObfuscatedName("sa.n")
	public static int field2928;
	@ObfuscatedName("rc.O")
	public static boolean field2870;
	@ObfuscatedName("pa.s")
	public static Js5 field2499;
	@ObfuscatedName("o.Hb")
	public static Js5 field2237;
	@ObfuscatedName("oa.E")
	public static Js5 field2257;
	@ObfuscatedName("wf.b")
	public static WaveCache field3644;
	@ObfuscatedName("sd.h")
	public static MidiFile field2977;

	@ObfuscatedName("we.a(Z)V")
	public static void updateFadeOut() {
		try {
			if (field2263 == 1) {
				int var0 = field1966.method112();
				if (var0 > 0 && field1966.method90()) {
					int var1 = var0 - field1724;
					if (var1 < 0) {
						var1 = 0;
					}
					field1966.method89(var1);
				} else {
					field1966.method115();
					field1966.method91();
					field3644 = null;
					if (field718 == null) {
						field2263 = 0;
					} else {
						field2263 = 2;
					}
					field2977 = null;
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			field1966.method115();
			field3644 = null;
			field2263 = 0;
			field2977 = null;
			field718 = null;
		}
	}

	@ObfuscatedName("b.d(I)Z")
	public static boolean updateLoading() {
		try {
			if (field2263 == 2) {
				if (field2977 == null) {
					field2977 = MidiFile.method25(field718, field3606, field2928);
					if (field2977 == null) {
						return false;
					}
				}
				if (field3644 == null) {
					field3644 = new WaveCache(field2499, field2257);
				}
				if (field1966.method96(field2237, field3644, field2977)) {
					field1966.method121();
					field1966.method89(field1321);
					field1966.method84(field2870, field2977);
					field3644 = null;
					field2263 = 0;
					field2977 = null;
					field718 = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			field1966.method115();
			field2977 = null;
			field718 = null;
			field3644 = null;
			field2263 = 0;
		}
		return false;
	}

	@ObfuscatedName("ge.a(Lea;Lea;Lc;BLea;)Z")
	public static boolean init(Js5 arg0, Js5 arg1, MidiPlayer arg2, Js5 arg3) {
		field1966 = arg2;
		field2499 = arg0;
		field2237 = arg3;
		field2257 = arg1;
		return true;
	}

	@ObfuscatedName("wa.a(Lea;IIIZI)V")
	public static void play(Js5 arg0, int arg1, int arg2, int arg3) {
		field2928 = arg3;
		field3606 = arg1;
		field718 = arg0;
		field1321 = arg2;
		field2263 = 1;
		field2870 = false;
		field1724 = 10000;
	}

	@ObfuscatedName("oe.a(Lec;Lea;ZILec;B)V")
	public static void play(JagString arg0, Js5 arg1, JagString arg2) {
		int var3 = arg1.method201(arg2);
		int var4 = arg1.method215(arg0, var3);
		play(arg1, var3, 255, var4);
	}

	@ObfuscatedName("jf.a(Z)V")
	public static void stop() {
		field1966.method115();
		field718 = null;
		field2263 = 1;
	}

	@ObfuscatedName("vf.a(IB)V")
	public static void method1176() {
		field1724 = 2;
		field3606 = -1;
		field2263 = 1;
		field718 = null;
		field1321 = 0;
		field2870 = false;
		field2928 = -1;
	}

	@ObfuscatedName("kc.a(Lea;Lec;IZILec;I)V")
	public static void method590(Js5 arg0, JagString arg1, JagString arg2) {
		int var3 = arg0.method201(arg1);
		int var4 = arg0.method215(arg2, var3);
		method667(arg0, 255, var4, var3);
	}

	@ObfuscatedName("mc.a(ZLea;IZIII)V")
	public static void method667(Js5 arg0, int arg1, int arg2, int arg3) {
		field1724 = 2;
		field718 = arg0;
		field3606 = arg3;
		field2870 = false;
		field1321 = arg1;
		field2263 = 1;
		field2928 = arg2;
	}

	@ObfuscatedName("jf.a(IZ)V")
	public static void method568(int arg0) {
		if (field2263 == 0) {
			field1966.method89(arg0);
		} else {
			field1321 = arg0;
		}
	}

	@ObfuscatedName("e.e(I)Z")
	public static boolean method197() {
		return field2263 == 0 ? field1966.method90() : true;
	}
}
