package jagex3.dash3d;

import deob.ObfuscatedName;

public class RegionRotate {
	@ObfuscatedName("ud.a(IIIIIBI)I")
	public static int DX(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			int var7 = arg3;
			arg3 = arg1;
			arg1 = var7;
		}
		if (var6 == 0) {
			return arg4;
		} else if (var6 == 1) {
			return arg0;
		} else if (var6 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}

	@ObfuscatedName("fc.a(IIII)I")
	public static int DX(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("kb.a(IIIIIII)I")
	public static int DZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg0 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg3;
			arg3 = var6;
		}
		int var7 = arg2 & 0x3;
		if (var7 == 0) {
			return arg1;
		} else if (var7 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (var7 == 2) {
			return 7 + 1 - arg1 - arg3;
		} else {
			return arg5;
		}
	}

    @ObfuscatedName("ed.a(IIII)I")
    public static int DZ(int arg0, int arg1, int arg2) {
        int var3 = arg0 & 0x3;
        if (var3 == 0) {
            return arg1;
        } else if (var3 == 1) {
            return 7 - arg2;
        } else if (var3 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }
}
