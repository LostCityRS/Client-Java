package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("ld")
public final class ArrayUtil {

	@ObfuscatedName("ld.a([III)V")
	public static void clear(int[] arg0, int arg1, int arg2) {
		int var3 = arg2 - 7;
		while (arg1 < var3) {
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}
		var3 += 7;
		while (arg1 < var3) {
			arg0[arg1++] = 0;
		}
	}

	@ObfuscatedName("ld.a([BI[BII)V")
	public static void method836(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				int var9 = arg4 - 1;
				int var5 = arg1 + var9;
				int var6 = arg3 + var9;
				int var7 = var5 - var9;
				int var10 = var7 + 7;
				while (var5 >= var10) {
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
				}
				var7 = var10 - 7;
				while (var5 >= var7) {
					arg2[var6--] = arg0[var5--];
				}
				return;
			}
		}
		int var8 = arg4 + arg1;
		int var11 = var8 - 7;
		while (arg1 < var11) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		var8 = var11 + 7;
		while (arg1 < var8) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@ObfuscatedName("ld.a([IIII)V")
	public static void method837(int[] arg0, int arg1, int arg2, int arg3) {
		int var4 = arg1 + arg2 - 7;
		while (arg1 < var4) {
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
		}
		var4 += 7;
		while (arg1 < var4) {
			arg0[arg1++] = arg3;
		}
	}

	@ObfuscatedName("ld.a([II[III)V")
	public static void method838(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
		if (arg0 == arg2) {
			return;
		}
		int var5 = arg4;
		int var6 = var5 - 7;
		while (arg1 < var6) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		var5 = var6 + 7;
		while (arg1 < var5) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@ObfuscatedName("qe.a([BZ)[B")
	public static byte[] method1276(byte[] arg0) {
		int var1 = arg0.length;
		byte[] var2 = new byte[var1];
		method836(arg0, 0, var2, 0, var1);
		return var2;
	}

    @ObfuscatedName("cd.a([IB)[I")
    public static int[] method169(int[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            int[] var1 = new int[arg0.length];
            method838(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

	@ObfuscatedName("va.a(IIII[I)V")
	public static void method1534(int arg0, int arg1, int arg2, int[] arg3) {
		arg0--;
		int var10 = arg2 - 1;
		int var4 = var10 - 7;
		while (arg0 < var4) {
			int var5 = arg0 + 1;
			arg3[var5] = arg1;
			int var6 = var5 + 1;
			arg3[var6] = arg1;
			int var7 = var6 + 1;
			arg3[var7] = arg1;
			int var8 = var7 + 1;
			arg3[var8] = arg1;
			int var9 = var8 + 1;
			arg3[var9] = arg1;
			int var11 = var9 + 1;
			arg3[var11] = arg1;
			int var12 = var11 + 1;
			arg3[var12] = arg1;
			arg0 = var12 + 1;
			arg3[arg0] = arg1;
		}
		while (arg0 < var10) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}
}
