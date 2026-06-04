package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

import java.util.Random;

@ObfuscatedName("e")
public final class TextureOpClouds extends TextureOp {

	@ObfuscatedName("e.db")
	public int halfEdge;

	@ObfuscatedName("e.eb")
	public int edgeWidth = 81;

	@ObfuscatedName("e.gb")
	public int noiseAmplitudeY = 204;

	@ObfuscatedName("e.hb")
	public int cellWidth;

	@ObfuscatedName("e.jb")
	public int[][] cells;

	@ObfuscatedName("e.lb")
	public int cellHeight;

	@ObfuscatedName("e.nb")
	public int cellsX = 4;

	@ObfuscatedName("e.ob")
	public int cellBrightness = 1024;

	@ObfuscatedName("e.pb")
	public int cellsY = 8;

	@ObfuscatedName("e.V")
	public int contrast = 1024;

	@ObfuscatedName("e.X")
	public int noiseAmplitudeX = 409;

	@ObfuscatedName("e.S")
	public int timeOffset = 0;

	@ObfuscatedName("e.W")
	public int[] rowBounds;

	@ObfuscatedName("e.T")
	public int[][] cellBoundsX;

	public TextureOpClouds() {
		super(0, true);
	}

	@ObfuscatedName("e.e(I)V")
	public void generateNoise() {
		Random var1 = new Random((long) this.cellsY);
		this.cells = new int[this.cellsY][this.cellsX];
		this.cellBoundsX = new int[this.cellsY][this.cellsX + 1];
		this.cellHeight = 4096 / this.cellsX;
		this.halfEdge = this.edgeWidth / 2;
		this.rowBounds = new int[this.cellsY + 1];
		this.rowBounds[0] = 0;
		this.cellWidth = 4096 / this.cellsY;
		int var2 = this.cellHeight / 2;
		int var3 = this.cellWidth / 2;
		for (int var4 = 0; var4 < this.cellsY; var4++) {
			if (var4 > 0) {
				int var5 = this.cellWidth;
				int var6 = (Statics.method812(4096, var1) - 2048) * this.noiseAmplitudeY >> 12;
				int var7 = var5 + (var3 * var6 >> 12);
				this.rowBounds[var4] = var7 + this.rowBounds[var4 - 1];
			}
			this.cellBoundsX[var4][0] = 0;
			for (int var8 = 0; var8 < this.cellsX; var8++) {
				if (var8 > 0) {
					int var9 = this.cellHeight;
					int var10 = (Statics.method812(4096, var1) - 2048) * this.noiseAmplitudeX >> 12;
					int var11 = var9 + (var10 * var2 >> 12);
					this.cellBoundsX[var4][var8] = var11 + this.cellBoundsX[var4][var8 - 1];
				}
				this.cells[var4][var8] = this.cellBrightness <= 0 ? 4096 : 4096 - Statics.method812(this.cellBrightness, var1);
			}
			this.cellBoundsX[var4][this.cellsX] = 4096;
		}
		this.rowBounds[this.cellsY] = 4096;
	}

	@ObfuscatedName("e.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.cellsX = arg0.g1();
		} else if (arg1 == 1) {
			this.cellsY = arg0.g1();
		} else if (arg1 == 2) {
			this.noiseAmplitudeX = arg0.g2();
		} else if (arg1 == 3) {
			this.noiseAmplitudeY = arg0.g2();
		} else if (arg1 == 4) {
			this.contrast = arg0.g2();
		} else if (arg1 == 5) {
			this.timeOffset = arg0.g2();
		} else if (arg1 == 6) {
			this.edgeWidth = arg0.g2();
		} else if (arg1 == 7) {
			this.cellBrightness = arg0.g2();
		}
	}

	@ObfuscatedName("e.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = 0;
			int var4;
			for (var4 = this.timeOffset + Texture.field2021[arg0]; var4 < 0; var4 += 4096) {
			}
			while (var4 > 4096) {
				var4 -= 4096;
			}
			while (this.cellsY > var3 && var4 >= this.rowBounds[var3]) {
				var3++;
			}
			int var5 = this.rowBounds[var3];
			boolean var6 = (var3 & 0x1) == 0;
			int var7 = var3 - 1;
			int var8 = this.rowBounds[var3 - 1];
			if (var4 > this.halfEdge + var8 && var5 - this.halfEdge > var4) {
				for (int var9 = 0; var9 < Texture.field1276; var9++) {
					int var10 = var6 ? this.contrast : -this.contrast;
					int var11 = 0;
					int var12;
					for (var12 = (var10 * this.cellHeight >> 12) + Texture.field351[var9]; var12 < 0; var12 += 4096) {
					}
					while (var12 > 4096) {
						var12 -= 4096;
					}
					while (this.cellsX > var11 && this.cellBoundsX[var7][var11] <= var12) {
						var11++;
					}
					int var13 = this.cellBoundsX[var7][var11];
					int var14 = var11 - 1;
					int var15 = this.cellBoundsX[var7][var14];
					if (var15 + this.halfEdge < var12 && var12 < var13 - this.halfEdge) {
						var2[var9] = this.cells[var7][var14];
					} else {
						var2[var9] = 0;
					}
				}
			} else {
				ArrayUtil.method837(var2, 0, Texture.field1276, 0);
			}
		}
		return var2;
	}

	@ObfuscatedName("e.b(B)V")
	@Override
	public void postDecode() {
		this.generateNoise();
	}
}
