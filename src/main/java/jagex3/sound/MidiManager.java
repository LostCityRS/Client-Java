package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.datastruct.ByteArrayNode;
import jagex3.datastruct.LruCache;
import jagex3.js5.Js5;
import jagex3.util.JagString;

public class MidiManager {
	@ObfuscatedName("ie.c")
	public static boolean field1391 = false;
	@ObfuscatedName("u.pb")
	public static int field2985;
	@ObfuscatedName("bd.S")
	public static int field405;
	@ObfuscatedName("fc.Ub")
	public static int field917;
	@ObfuscatedName("d.Fc")
	public static int field661;
	@ObfuscatedName("client.Eb")
	public static boolean field611;
	@ObfuscatedName("jc.pb")
	public static int field1462;
	@ObfuscatedName("ga.M")
	public static Js5 field1028;
	@ObfuscatedName("ca.o")
	public static int field463;
	@ObfuscatedName("bb.a")
	public static MidiStream field311;
	@ObfuscatedName("ub.d")
	public static int field3030 = -1;
	@ObfuscatedName("nc.l")
	public static int field2046 = 0;
	@ObfuscatedName("aa.Id")
	public static byte[] field78;
	@ObfuscatedName("kb.h")
	public static int field1548 = 0;
	@ObfuscatedName("ba.gc")
	public static int field302 = 0;
	@ObfuscatedName("fe.Rc")
	public static int field975;
	@ObfuscatedName("la.h")
	public static boolean field1662;
	@ObfuscatedName("a.D")
	public static LruCache field30;

	@ObfuscatedName("m.a(ZIIIILbd;I)V")
	public static synchronized void play(int arg0, int arg1, int arg2, Js5 arg3) {
		if (!method521()) {
			return;
		}
		field1391 = true;
		field2985 = -1;
		field405 = -1;
		field917 = arg2;
		field661 = 0;
		field611 = false;
		field1462 = arg0;
		field1028 = arg3;
		field463 = arg1;
	}

	@ObfuscatedName("ib.a(I)Z")
	public static boolean method521() {
		return field311 != null;
	}

	@ObfuscatedName("m.a(Z)V")
	public static synchronized void method669() {
		if (method521()) {
			method475();
			field1391 = false;
			field1028 = null;
		}
	}

	@ObfuscatedName("m.a(IZIILbd;IIZ)V")
	public static synchronized void method670(int arg0, int arg1, Js5 arg2, int arg3) {
		if (!method521()) {
			return;
		}
		field611 = false;
		field405 = 10;
		field661 = arg3;
		field1391 = true;
		field1028 = arg2;
		field2985 = -1;
		field917 = arg0;
		field1462 = 0;
		field463 = arg1;
	}

	@ObfuscatedName("m.a(II)V")
	public static synchronized void method672() {
		if (method521()) {
			method397();
			field1028 = null;
			field1391 = false;
		}
	}

	@ObfuscatedName("m.b(B)V")
	public static synchronized void method680() {
		if (!method521()) {
			return;
		}
		if (field1391) {
			byte[] var0 = method25(field661, field1028, field463, field1462);
			if (var0 != null) {
				if (field405 >= 0) {
					method749(field917, field611, var0, field405);
				} else if (field2985 < 0) {
					method7(field611, var0, field917);
				} else {
					method406(field917, field611, field2985, var0);
				}
				field1391 = false;
				field1028 = null;
			}
		}
		method962();
	}

	@ObfuscatedName("hc.c(I)V")
	public static void method475() {
		method7(false, null, 0);
	}

	@ObfuscatedName("a.a(IZ[BI)V")
	public static void method7(boolean arg0, byte[] arg1, int arg2) {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			field311.method305();
			field2046 = 0;
			field78 = null;
			field1548 = 20;
			field3030 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (field1548 > 0) {
			field311.method304(arg2);
			field1548 = 0;
		}
		field3030 = arg2;
		field311.method307(arg1, arg0, arg2);
	}

	@ObfuscatedName("fd.a(IZI[BI)V")
	public static void method406(int arg0, boolean arg1, int arg2, byte[] arg3) {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			field1548 = arg2;
			if (field3030 == 0) {
				field302 = 0;
			} else {
				int var4 = method632(field3030);
				int var5 = var4 - field2046;
				field302 = (arg2 + var5 + 3600 - 1) / arg2;
			}
			field78 = arg3;
			field975 = arg0;
			field1662 = arg1;
		} else if (field1548 == 0) {
			method7(arg1, arg3, arg0);
		} else {
			field975 = arg0;
			field1662 = arg1;
			field78 = arg3;
		}
	}

	@ObfuscatedName("a.a(ILbd;III)[B")
	public static byte[] method25(int arg0, Js5 arg1, int arg2, int arg3) {
		long var4 = ((long) arg3 << 32) + (long) (arg2 * 37 + arg0 & 0xFFFF) + (long) (arg2 << 16);
		if (field30 != null) {
			ByteArrayNode var6 = (ByteArrayNode) field30.find(var4);
			if (var6 != null) {
				return var6.field1198;
			}
		}
		byte[] var7 = arg1.getFile(arg0, arg2);
		if (var7 == null) {
			return null;
		} else {
			if (field30 != null) {
				field30.put(var4, new ByteArrayNode(var7));
			}
			return var7;
		}
	}

	@ObfuscatedName("oa.a(IIZ[BI)V")
	public static void method749(int arg0, boolean arg1, byte[] arg2, int arg3) {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			field302 = arg3;
			if (field3030 == 0) {
				field1548 = 1;
			} else {
				int var4 = method632(field3030);
				int var5 = var4 - field2046;
				field1548 = (var5 + 3600) / arg3;
				if (field1548 < 1) {
					field1548 = 1;
				}
			}
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		} else if (field1548 == 0) {
			method7(arg1, arg2, arg0);
		} else {
			field975 = arg0;
			field78 = arg2;
			field1662 = arg1;
		}
	}

	@ObfuscatedName("tc.c(I)V")
	public static void method962() {
		if (field311 == null) {
			return;
		}
		if (field3030 >= 0) {
			if (field1548 > 0) {
				field2046 += field302;
				field311.method302(field3030, field2046);
				field1548--;
				if (field1548 == 0) {
					field311.method305();
					field3030 = -1;
					field1548 = 20;
				}
			}
		} else if (field1548 > 0) {
			field1548--;
			if (field1548 == 0) {
				if (field78 == null) {
					field311.method304(256);
				} else {
					field311.method304(field975);
					field3030 = field975;
					field311.method307(field78, field1662, field975);
					field78 = null;
				}
				field2046 = 0;
			}
		}
		field311.method308();
	}

	@ObfuscatedName("l.a(II)I")
	public static int method632(int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@ObfuscatedName("fc.a(II)V")
	public static void method397() {
		method749(0, false, null, 10);
	}

	@ObfuscatedName("m.a(ZLbd;IBLa;ILa;I)V")
	public static synchronized void method679(Js5 arg0, JagString arg1, JagString arg2, int arg3) {
		if (method521()) {
			int var4 = arg0.getGroupId(arg1);
			int var5 = arg0.getFileId(var4, arg2);
			method670(arg3, var4, arg0, var5);
		}
	}

	@ObfuscatedName("rb.a(II)V")
	public static void method877(int arg0) {
		if (field311 == null) {
			return;
		}
		if (field1548 == 0) {
			if (field3030 >= 0) {
				field3030 = arg0;
				field311.method302(arg0, 0);
			}
		} else if (field78 != null) {
			field975 = arg0;
		}
	}

	@ObfuscatedName("w.a(I)V")
	public static void method1029() {
		if (field311 == null) {
			return;
		}
		method475();
		if (field1548 > 0) {
			field311.method304(256);
			field1548 = 0;
		}
		field311.method303();
		field311 = null;
	}

	@ObfuscatedName("nd.a(IB)V")
	public static void method738(int arg0) {
		if (!method521()) {
			return;
		}
		if (field1391) {
			field917 = arg0;
		} else {
			method877(arg0);
		}
	}

	@ObfuscatedName("m.b(Z)V")
	public static synchronized void method674() {
		method1029();
	}
}
