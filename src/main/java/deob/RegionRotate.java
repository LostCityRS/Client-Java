package deob;

public class RegionRotate {
	@ObfuscatedName("wf.b(IIII)I")
	public static int method1606(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("k.a(IIIIZII)I")
	public static int method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			int var7 = arg4;
			arg4 = arg3;
			arg3 = var7;
		}
		if (var6 == 0) {
			return arg0;
		} else if (var6 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (var6 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

    @ObfuscatedName("og.a(IIII)I")
    public static int method1069(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg0;
        } else if (var3 == 1) {
            return 7 - arg1;
        } else if (var3 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

	@ObfuscatedName("gd.a(IIIIBII)I")
	public static int method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}
		int var7 = arg1 & 0x3;
		if (var7 == 0) {
			return arg3;
		} else if (var7 == 1) {
			return arg2;
		} else if (var7 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 8 - arg2 - arg4;
		}
	}
}
