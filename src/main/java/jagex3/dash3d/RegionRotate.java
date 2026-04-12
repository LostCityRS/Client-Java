package jagex3.dash3d;

import deob.ObfuscatedName;

public class RegionRotate {
	@ObfuscatedName("ib.a(IZII)I")
	public static int method519(int arg0, int arg1, int arg2) {
		int var3 = arg0 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return arg2;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
