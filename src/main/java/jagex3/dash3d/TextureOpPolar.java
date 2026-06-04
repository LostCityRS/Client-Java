package jagex3.dash3d;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ri")
public final class TextureOpPolar extends TextureOp {

    @ObfuscatedName("ba.s")
    public static int field203 = 0;
	@ObfuscatedName("ra.gb")
	public static int opacity8 = 0;

	public TextureOpPolar() {
		super(1, false);
	}

	@ObfuscatedName("ri.b(IZI)V")
	public void computePolarLookup(int arg0, int arg1) {
		int var3 = Texture.rowLut[arg1];
		int var4 = Texture.columnLut[arg0];
		float var5 = (float) Math.atan2((double) (var4 - 2048), (double) (var3 - 2048));
		if ((double) var5 >= -3.141592653589793D && (double) var5 <= -2.356194490192345D) {
			field203 = arg1;
			opacity8 = arg0;
		} else if ((double) var5 <= -1.5707963267948966D && (double) var5 >= -2.356194490192345D) {
			field203 = arg0;
			opacity8 = arg1;
		} else if ((double) var5 <= -0.7853981633974483D && (double) var5 >= -1.5707963267948966D) {
			opacity8 = Texture.width - arg1;
			field203 = arg0;
		} else if (var5 <= 0.0F && (double) var5 >= -0.7853981633974483D) {
			opacity8 = arg0;
			field203 = Texture.height - arg1;
		} else if (var5 >= 0.0F && (double) var5 <= 0.7853981633974483D) {
			opacity8 = Texture.width - arg0;
			field203 = Texture.height - arg1;
		} else if ((double) var5 >= 0.7853981633974483D && (double) var5 <= 1.5707963267948966D) {
			opacity8 = Texture.width - arg1;
			field203 = Texture.height - arg0;
		} else if ((double) var5 >= 1.5707963267948966D && (double) var5 <= 2.356194490192345D) {
			opacity8 = arg1;
			field203 = Texture.height - arg0;
		} else if ((double) var5 >= 2.356194490192345D && (double) var5 <= 3.141592653589793D) {
			field203 = arg1;
			opacity8 = Texture.width - arg0;
		}
		field203 &= Texture.heightMask;
		opacity8 &= Texture.widthMask;
	}

	@ObfuscatedName("ri.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			for (int var3 = 0; var3 < Texture.width; var3++) {
				this.computePolarLookup(var3, arg0);
				int[] var4 = this.getInputMono(field203, 0);
				var2[var3] = var4[opacity8];
			}
		}
		return var2;
	}

	@ObfuscatedName("ri.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			super.monochrome = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("ri.b(IB)[[I")
	@Override
	public int[][] renderColor(int arg0) {
		int[][] var2 = super.colorCache.getFrame(arg0);
		if (super.colorCache.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[1];
			int[] var5 = var2[2];
			for (int var6 = 0; var6 < Texture.width; var6++) {
				this.computePolarLookup(var6, arg0);
				int[][] var7 = this.getInputColor(0, field203);
				var3[var6] = var7[0][opacity8];
				var4[var6] = var7[1][opacity8];
				var5[var6] = var7[2][opacity8];
			}
		}
		return var2;
	}
}
