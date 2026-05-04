package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("ri")
public final class TextureOp23 extends TextureOp {

	public TextureOp23() {
		super(1, false);
	}

	@ObfuscatedName("ri.b(IZI)V")
	public void method1342(int arg0, int arg1) {
		int var3 = Texture.field2021[arg1];
		int var4 = Texture.field351[arg0];
		float var5 = (float) Math.atan2((double) (var4 - 2048), (double) (var3 - 2048));
		if ((double) var5 >= -3.141592653589793D && (double) var5 <= -2.356194490192345D) {
			Statics.field203 = arg1;
			Statics.field3638 = arg0;
		} else if ((double) var5 <= -1.5707963267948966D && (double) var5 >= -2.356194490192345D) {
			Statics.field203 = arg0;
			Statics.field3638 = arg1;
		} else if ((double) var5 <= -0.7853981633974483D && (double) var5 >= -1.5707963267948966D) {
			Statics.field3638 = Texture.field1276 - arg1;
			Statics.field203 = arg0;
		} else if (var5 <= 0.0F && (double) var5 >= -0.7853981633974483D) {
			Statics.field3638 = arg0;
			Statics.field203 = Texture.field460 - arg1;
		} else if (var5 >= 0.0F && (double) var5 <= 0.7853981633974483D) {
			Statics.field3638 = Texture.field1276 - arg0;
			Statics.field203 = Texture.field460 - arg1;
		} else if ((double) var5 >= 0.7853981633974483D && (double) var5 <= 1.5707963267948966D) {
			Statics.field3638 = Texture.field1276 - arg1;
			Statics.field203 = Texture.field460 - arg0;
		} else if ((double) var5 >= 1.5707963267948966D && (double) var5 <= 2.356194490192345D) {
			Statics.field3638 = arg1;
			Statics.field203 = Texture.field460 - arg0;
		} else if ((double) var5 >= 2.356194490192345D && (double) var5 <= 3.141592653589793D) {
			Statics.field203 = arg1;
			Statics.field3638 = Texture.field1276 - arg0;
		}
		Statics.field203 &= Texture.field4158;
		Statics.field3638 &= Texture.field789;
	}

	@ObfuscatedName("ri.a(IB)[I")
	@Override
	public int[] method54(int arg0) {
		int[] var2 = super.field379.method1078(arg0);
		if (super.field379.field3098) {
			for (int var3 = 0; var3 < Texture.field1276; var3++) {
				this.method1342(var3, arg0);
				int[] var4 = this.method120(Statics.field203, 0);
				var2[var3] = var4[Statics.field3638];
			}
		}
		return var2;
	}

	@ObfuscatedName("ri.a(Lea;II)V")
	@Override
	public void method11(Packet arg0, int arg1) {
		if (arg1 == 0) {
			super.field369 = arg0.g1() == 1;
		}
	}

	@ObfuscatedName("ri.b(IB)[[I")
	@Override
	public int[][] method7(int arg0) {
		int[][] var2 = super.field364.method1539(arg0);
		if (super.field364.field4310) {
			int[] var3 = var2[0];
			int[] var4 = var2[1];
			int[] var5 = var2[2];
			for (int var6 = 0; var6 < Texture.field1276; var6++) {
				this.method1342(var6, arg0);
				int[][] var7 = this.method121(0, Statics.field203);
				var3[var6] = var7[0][Statics.field3638];
				var4[var6] = var7[1][Statics.field3638];
				var5[var6] = var7[2][Statics.field3638];
			}
		}
		return var2;
	}
}
