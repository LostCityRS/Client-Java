package deob;

@ObfuscatedName("mg")
public abstract class PixFont extends PixfontGeneric {

	@ObfuscatedName("mg.wb")
	public byte[][] field2557 = new byte[256][];

	public PixFont(byte[] arg0) {
		super(arg0);
	}

	public PixFont(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.field2557 = arg5;
	}

	@ObfuscatedName("mg.b(IIIIIII)V")
	@Override
	public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 * Pix2D.field1333 + arg1;
		int var9 = 0;
		int var10 = Pix2D.field1333 - arg3;
		int var11 = 0;
		if (Pix2D.field1334 > arg2) {
			int var12 = Pix2D.field1334 - arg2;
			arg2 = Pix2D.field1334;
			var11 = arg3 * var12;
			arg4 -= var12;
			var8 += var12 * Pix2D.field1333;
		}
		if (Pix2D.field1335 < arg2 + arg4) {
			arg4 -= arg2 + arg4 - Pix2D.field1335;
		}
		if (arg1 < Pix2D.field1332) {
			int var13 = Pix2D.field1332 - arg1;
			arg1 = Pix2D.field1332;
			var9 = var13;
			var10 += var13;
			var11 += var13;
			var8 += var13;
			arg3 -= var13;
		}
		if (Pix2D.field1336 < arg1 + arg3) {
			int var14 = arg3 + arg1 - Pix2D.field1336;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}
		if (arg3 > 0 && arg4 > 0) {
			Statics.method677(Pix2D.field1331, arg3, arg6, var11, var10, this.field2557[arg0], arg5, var8, arg4, var9);
		}
	}

	@ObfuscatedName("mg.a(IIIIII)V")
	@Override
	public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix2D.field1333 - arg3;
		int var8 = Pix2D.field1333 * arg2 + arg1;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < Pix2D.field1334) {
			int var11 = Pix2D.field1334 - arg2;
			var10 = var11 * arg3;
			arg4 -= var11;
			var8 += Pix2D.field1333 * var11;
			arg2 = Pix2D.field1334;
		}
		if (Pix2D.field1335 < arg2 + arg4) {
			arg4 -= arg4 + arg2 - Pix2D.field1335;
		}
		if (Pix2D.field1332 > arg1) {
			int var12 = Pix2D.field1332 - arg1;
			var8 += var12;
			var9 = var12;
			var10 += var12;
			arg3 -= var12;
			var7 += var12;
			arg1 = Pix2D.field1332;
		}
		if (arg1 + arg3 > Pix2D.field1336) {
			int var13 = arg1 + arg3 - Pix2D.field1336;
			var7 += var13;
			arg3 -= var13;
			var9 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			Statics.method527(arg5, var9, var8, this.field2557[arg0], arg3, arg4, var7, Pix2D.field1331, var10);
		}
	}
}
