package deob;

@ObfuscatedName("nf")
public final class class96 extends class99 {

	public class96(byte[] arg0) {
		super(arg0);
	}

	public class96(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("nf.b([BIIIII)V")
	@Override
	public void method749(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * class141.field3240;
		int var8 = class141.field3240 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class141.field3236) {
			int var11 = class141.field3236 - arg2;
			arg4 -= var11;
			arg2 = class141.field3236;
			var10 = var11 * arg3;
			var7 += var11 * class141.field3240;
		}
		if (arg2 + arg4 > class141.field3239) {
			arg4 -= arg2 + arg4 - class141.field3239;
		}
		if (arg1 < class141.field3238) {
			int var12 = class141.field3238 - arg1;
			arg3 -= var12;
			arg1 = class141.field3238;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 > class141.field3241) {
			int var13 = arg1 + arg3 - class141.field3241;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			class99.method792(class141.field3237, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("nf.a([BIIIIII)V")
	@Override
	public void method750(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 * class141.field3240;
		int var9 = class141.field3240 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < class141.field3236) {
			int var12 = class141.field3236 - arg2;
			arg4 -= var12;
			arg2 = class141.field3236;
			var11 = var12 * arg3;
			var8 += var12 * class141.field3240;
		}
		if (arg2 + arg4 > class141.field3239) {
			arg4 -= arg2 + arg4 - class141.field3239;
		}
		if (arg1 < class141.field3238) {
			int var13 = class141.field3238 - arg1;
			arg3 -= var13;
			arg1 = class141.field3238;
			var11 += var13;
			var8 += var13;
			var10 = var13;
			var9 += var13;
		}
		if (arg1 + arg3 > class141.field3241) {
			int var14 = arg1 + arg3 - class141.field3241;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			class99.method778(class141.field3237, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
		}
	}
}
