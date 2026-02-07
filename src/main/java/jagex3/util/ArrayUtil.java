package jagex3.util;

import deob.ObfuscatedName;

@ObfuscatedName("id")
public final class ArrayUtil {

	@ObfuscatedName("id.a([BI[BII)V")
	public static void copy(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
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

	@ObfuscatedName("id.a([III)V")
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

	@ObfuscatedName("mc.a(I[B)[B")
	public static byte[] method668(byte[] arg0) {
		int var1 = arg0.length;
		byte[] var2 = new byte[var1];
		copy(arg0, 0, var2, 0, var1);
		return var2;
	}
}
