package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;

@ObfuscatedName("te")
public final class TextureOpCurve extends TextureOp {

	@ObfuscatedName("te.fb")
	public int[][] controlPoints;

	@ObfuscatedName("te.hb")
	public int[] postControl;

	@ObfuscatedName("te.U")
	public final short[] lookupTable = new short[257];

	@ObfuscatedName("te.Y")
	public int curveType = 0;

	@ObfuscatedName("te.W")
	public int[] preControl;

	public TextureOpCurve() {
		super(1, true);
	}

	@ObfuscatedName("te.b(B)V")
	@Override
	public void postDecode() {
		if (this.controlPoints == null) {
			this.controlPoints = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.controlPoints.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.curveType == 2) {
			this.computeExtrapolation();
		}
		Statics.method740();
		this.buildCurve();
	}

	@ObfuscatedName("te.c(IB)[I")
	public int[] getControlPoint(int arg0) {
		if (arg0 < 0) {
			return this.preControl;
		} else if (this.controlPoints.length <= arg0) {
			return this.postControl;
		} else {
			return this.controlPoints[arg0];
		}
	}

	@ObfuscatedName("te.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.getFrame(arg0);
		if (super.monoCache.field3098) {
			int[] var3 = this.getInputMono(arg0, 0);
			for (int var4 = 0; var4 < Texture.width; var4++) {
				int var5 = var3[var4] >> 4;
				if (var5 < 0) {
					var5 = 0;
				}
				if (var5 > 256) {
					var5 = 256;
				}
				var2[var4] = this.lookupTable[var5];
			}
		}
		return var2;
	}

	@ObfuscatedName("te.c(Z)V")
	public void computeExtrapolation() {
		int[] var1 = this.controlPoints[0];
		int[] var2 = this.controlPoints[1];
		int[] var3 = this.controlPoints[this.controlPoints.length - 1];
		int[] var4 = this.controlPoints[this.controlPoints.length - 2];
		this.preControl = new int[] { var1[0] + var1[0] - var2[0], var1[1] - var2[1] - -var1[1] };
		this.postControl = new int[] { var4[0] + var4[0] - var3[0], var4[1] - (var3[1] - var4[1]) };
	}

	@ObfuscatedName("te.c(B)V")
	public void buildCurve() {
		int var1 = this.curveType;
		if (var1 == 2) {
			for (int var2 = 0; var2 < 257; var2++) {
				int var3 = var2 << 4;
				int var4;
				for (var4 = 1; var4 < this.controlPoints.length - 1 && var3 >= this.controlPoints[var4][0]; var4++) {
				}
				int[] var5 = this.controlPoints[var4 - 1];
				int[] var6 = this.controlPoints[var4];
				int var7 = this.getControlPoint(var4 - 2)[1];
				int var8 = var5[1];
				int var9 = var6[1];
				int var10 = this.getControlPoint(var4 + 1)[1];
				int var11 = (var3 - var5[0] << 12) / (var6[0] - var5[0]);
				int var12 = var11 * var11 >> 12;
				int var13 = var8 + var10 - var9 - var7;
				int var14 = (var11 * var13 >> 12) * var12 >> 12;
				int var15 = var9 - var7;
				int var16 = var7 - var13 - var8;
				int var17 = var16 * var12 >> 12;
				int var18 = var11 * var15 >> 12;
				int var19 = var8 + var18 + var17 + var14;
				if (var19 <= -32768) {
					var19 = -32767;
				}
				if (var19 >= 32768) {
					var19 = 32767;
				}
				this.lookupTable[var2] = (short) var19;
			}
		} else if (var1 == 1) {
			for (int var20 = 0; var20 < 257; var20++) {
				int var21 = var20 << 4;
				int var22;
				for (var22 = 1; var22 < this.controlPoints.length - 1 && var21 >= this.controlPoints[var22][0]; var22++) {
				}
				int[] var23 = this.controlPoints[var22 - 1];
				int[] var24 = this.controlPoints[var22];
				int var25 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
				int var26 = 4096 - Statics.field2920[var25 >> 5 & 0xFF] >> 1;
				int var27 = 4096 - var26;
				int var28 = var27 * var23[1] + var26 * var24[1] >> 12;
				if (var28 <= -32768) {
					var28 = -32767;
				}
				if (var28 >= 32768) {
					var28 = 32767;
				}
				this.lookupTable[var20] = (short) var28;
			}
		} else {
			for (int var29 = 0; var29 < 257; var29++) {
				int var30 = var29 << 4;
				int var31;
				for (var31 = 1; var31 < this.controlPoints.length - 1 && var30 >= this.controlPoints[var31][0]; var31++) {
				}
				int[] var32 = this.controlPoints[var31];
				int[] var33 = this.controlPoints[var31 - 1];
				int var34 = (var30 - var33[0] << 12) / (var32[0] - var33[0]);
				int var35 = 4096 - var34;
				int var36 = var33[1] * var35 + var34 * var32[1] >> 12;
				if (var36 <= -32768) {
					var36 = -32767;
				}
				if (var36 >= 32768) {
					var36 = 32767;
				}
				this.lookupTable[var29] = (short) var36;
			}
		}
	}

	@ObfuscatedName("te.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.curveType = arg0.g1();
		this.controlPoints = new int[arg0.g1()][2];
		for (int var3 = 0; var3 < this.controlPoints.length; var3++) {
			this.controlPoints[var3][0] = arg0.g2();
			this.controlPoints[var3][1] = arg0.g2();
		}
	}
}
