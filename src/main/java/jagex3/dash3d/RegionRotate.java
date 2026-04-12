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

	@ObfuscatedName("client.a(IIIIIII)I")
	public static int method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			int var7 = arg1;
			arg1 = arg3;
			arg3 = var7;
		}
		if (var6 == 0) {
			return arg2;
		} else if (var6 == 1) {
			return arg5;
		} else if (var6 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 1 + 7 - arg5 - arg3;
		}
	}

	@ObfuscatedName("m.a(IIIZ)I")
	public static int method677(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return 7 - arg0;
		} else if (var3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
