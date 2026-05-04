package jagex3.midi2;

import deob.ObfuscatedName;
import jagex3.sound.WaveCache;
import jagex3.js5.Js5;

public class MidiManager {
	@ObfuscatedName("ch.i")
	public static MidiPlayer field503;
	@ObfuscatedName("hi.e")
	public static Js5 field1553;
	@ObfuscatedName("oa.x")
	public static Js5 field2955;
	@ObfuscatedName("b.j")
	public static Js5 field177;
	@ObfuscatedName("lb.w")
	public static int field2230 = 0;
	@ObfuscatedName("s.eb")
	public static MidiFile field3764;
	@ObfuscatedName("wi.v")
	public static WaveCache field4552;
	@ObfuscatedName("of.d")
	public static Js5 field3039;
	@ObfuscatedName("wc.M")
	public static int field4480;
	@ObfuscatedName("aj.Y")
	public static int field159;
	@ObfuscatedName("pi.bb")
	public static int field3343;
	@ObfuscatedName("be.B")
	public static boolean field277;
	@ObfuscatedName("uj.b")
	public static int field4268;

	@ObfuscatedName("pb.a(BLnb;Lpg;Lnb;Lnb;)Z")
	public static boolean init(Js5 arg0, MidiPlayer arg1, Js5 arg2, Js5 arg3) {
		field503 = arg1;
		field1553 = arg0;
		field2955 = arg2;
		field177 = arg3;
		return true;
	}

	@ObfuscatedName("n.a(Z)Z")
	public static boolean updateLoading() {
		try {
			if (field2230 == 2) {
				if (field3764 == null) {
					field3764 = MidiFile.method662(field3039, field4268, field4480);
					if (field3764 == null) {
						return false;
					}
				}
				if (field4552 == null) {
					field4552 = new WaveCache(field2955, field1553);
				}
				if (field503.method1182(field4552, field3764, field177)) {
					field503.method1187();
					field503.method1186(field159);
					field503.method1185(field3764, field277);
					field3039 = null;
					field3764 = null;
					field2230 = 0;
					field4552 = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			field503.method1208();
			field4552 = null;
			field3039 = null;
			field2230 = 0;
			field3764 = null;
		}
		return false;
	}

	@ObfuscatedName("kh.d(II)V")
	public static void method795() {
		field4480 = -1;
		field159 = 0;
		field3343 = 2;
		field3039 = null;
		field277 = false;
		field2230 = 1;
		field4268 = -1;
	}

	@ObfuscatedName("jh.a(IIZIILnb;I)V")
	public static void method730(int arg0, int arg1, Js5 arg2) {
		field3343 = 2;
		field4480 = 0;
		field159 = arg0;
		field277 = false;
		field3039 = arg2;
		field2230 = 1;
		field4268 = arg1;
	}

	@ObfuscatedName("bj.c(Z)V")
	public static void method107() {
		try {
			if (field2230 == 1) {
				int var0 = field503.method1197();
				if (var0 > 0 && field503.method1199()) {
					int var1 = var0 - field3343;
					if (var1 < 0) {
						var1 = 0;
					}
					field503.method1186(var1);
				} else {
					field503.method1208();
					field503.method1180();
					field4552 = null;
					field3764 = null;
					if (field3039 == null) {
						field2230 = 0;
					} else {
						field2230 = 2;
					}
				}
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			field503.method1208();
			field4552 = null;
			field3039 = null;
			field3764 = null;
			field2230 = 0;
		}
	}

	@ObfuscatedName("a.b(I)V")
	public static void method5() {
		field503.method1208();
		field3039 = null;
		field2230 = 1;
	}

	@ObfuscatedName("je.b(II)V")
	public static void method712(int arg0) {
		if (field2230 == 0) {
			field503.method1186(arg0);
		} else {
			field159 = arg0;
		}
	}

	@ObfuscatedName("jd.b(I)Z")
	public static boolean method707() {
		return field2230 == 0 ? field503.method1199() : true;
	}
}
