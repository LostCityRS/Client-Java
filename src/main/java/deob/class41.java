package deob;

@ObfuscatedName("dg")
public final class class41 extends class138 {

	public class41(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public class41(byte[] arg0) {
		super(arg0);
	}

	@ObfuscatedName("dg.a(IIIIIII)V")
	@Override
	public void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 * class72.field1333;
		int var9 = class72.field1333 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < class72.field1334) {
			int var12 = class72.field1334 - arg2;
			arg4 -= var12;
			arg2 = class72.field1334;
			var11 = var12 * arg3;
			var8 += var12 * class72.field1333;
		}
		if (arg2 + arg4 > class72.field1335) {
			arg4 -= arg2 + arg4 - class72.field1335;
		}
		if (arg1 < class72.field1332) {
			int var13 = class72.field1332 - arg1;
			arg3 -= var13;
			arg1 = class72.field1332;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg1 + arg3 > class72.field1336) {
			int var14 = arg1 + arg3 - class72.field1336;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			class95.method677(class72.field1331, arg3, arg6, var11, var9, super.field2557[arg0], arg5, var8, arg4, var10);
		}
	}

	@ObfuscatedName("dg.b(IIIIII)V")
	@Override
	public void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * class72.field1333;
		int var8 = class72.field1333 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class72.field1334) {
			int var11 = class72.field1334 - arg2;
			arg4 -= var11;
			arg2 = class72.field1334;
			var10 = var11 * arg3;
			var7 += var11 * class72.field1333;
		}
		if (arg2 + arg4 > class72.field1335) {
			arg4 -= arg2 + arg4 - class72.field1335;
		}
		if (arg1 < class72.field1332) {
			int var12 = class72.field1332 - arg1;
			arg3 -= var12;
			arg1 = class72.field1332;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 > class72.field1336) {
			int var13 = arg1 + arg3 - class72.field1336;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			class79.method527(arg5, var9, var7, super.field2557[arg0], arg3, arg4, var8, class72.field1331, var10);
		}
	}
}
