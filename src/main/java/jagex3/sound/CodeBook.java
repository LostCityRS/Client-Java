package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.util.MathTool;

@ObfuscatedName("bg")
public final class CodeBook {

	@ObfuscatedName("bg.a")
	public float[][] vqLookup;

	@ObfuscatedName("bg.b")
	public final int[] lengths;

	@ObfuscatedName("bg.c")
	public final int dimensions;

	@ObfuscatedName("bg.d")
	public final int entries;

	@ObfuscatedName("bg.e")
	public int[] multiplicands;

	@ObfuscatedName("bg.f")
	public int[] huffmanTree;

	public CodeBook() {
		JagVorbis.readBits(24);
		this.dimensions = JagVorbis.readBits(16);
		this.entries = JagVorbis.readBits(24);
		this.lengths = new int[this.entries];
		boolean var1 = JagVorbis.readBit() != 0;
		if (var1) {
			int var2 = 0;
			int var3 = JagVorbis.readBits(5) + 1;
			while (var2 < this.entries) {
				int var4 = JagVorbis.readBits(MathTool.bitsRequired(this.entries - var2));
				for (int var5 = 0; var5 < var4; var5++) {
					this.lengths[var2++] = var3;
				}
				var3++;
			}
		} else {
			boolean var6 = JagVorbis.readBit() != 0;
			for (int var7 = 0; var7 < this.entries; var7++) {
				if (var6 && JagVorbis.readBit() == 0) {
					this.lengths[var7] = 0;
				} else {
					this.lengths[var7] = JagVorbis.readBits(5) + 1;
				}
			}
		}
		this.prepareHuffman();
		int var8 = JagVorbis.readBits(4);
		if (var8 > 0) {
			float var9 = JagVorbis.float32Unpack(JagVorbis.readBits(32));
			float var10 = JagVorbis.float32Unpack(JagVorbis.readBits(32));
			int var11 = JagVorbis.readBits(4) + 1;
			boolean var12 = JagVorbis.readBit() != 0;
			int var13;
			if (var8 == 1) {
				var13 = lookup1Values(this.entries, this.dimensions);
			} else {
				var13 = this.entries * this.dimensions;
			}
			this.multiplicands = new int[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				this.multiplicands[var14] = JagVorbis.readBits(var11);
			}
			this.vqLookup = new float[this.entries][this.dimensions];
			if (var8 == 1) {
				for (int var15 = 0; var15 < this.entries; var15++) {
					float var16 = 0.0F;
					int var17 = 1;
					for (int var18 = 0; var18 < this.dimensions; var18++) {
						int var19 = var15 / var17 % var13;
						float var20 = (float) this.multiplicands[var19] * var10 + var9 + var16;
						this.vqLookup[var15][var18] = var20;
						if (var12) {
							var16 = var20;
						}
						var17 *= var13;
					}
				}
				return;
			}
			for (int var21 = 0; var21 < this.entries; var21++) {
				float var22 = 0.0F;
				int var23 = var21 * this.dimensions;
				for (int var24 = 0; var24 < this.dimensions; var24++) {
					float var25 = (float) this.multiplicands[var23] * var10 + var9 + var22;
					this.vqLookup[var21][var24] = var25;
					if (var12) {
						var22 = var25;
					}
					var23++;
				}
			}
		}
	}

	@ObfuscatedName("bg.a(II)I")
	public static int lookup1Values(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; method534(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	@ObfuscatedName("hc.b(IBI)I")
	public static int method534(int arg0, int arg1) {
		int var2 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				var2 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("bg.a()V")
	public void prepareHuffman() {
		int[] var1 = new int[this.entries];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.entries; var3++) {
			int var4 = this.lengths[var3];
			if (var4 != 0) {
				int var5 = 0x1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) == 0) {
					var7 = var6 | var5;
					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var9 != var6) {
							break;
						}
						int var10 = 0x1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}
						var2[var8] = var9 | var10;
					}
				} else {
					var7 = var2[var4 - 1];
				}
				var2[var4] = var7;
				for (int var11 = var4 + 1; var11 <= 32; var11++) {
					int var12 = var2[var11];
					if (var12 == var6) {
						var2[var11] = var7;
					}
				}
			}
		}
		this.huffmanTree = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.entries; var14++) {
			int var15 = this.lengths[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.huffmanTree[var17] == 0) {
							this.huffmanTree[var17] = var13;
						}
						var17 = this.huffmanTree[var17];
					}
					if (var17 >= this.huffmanTree.length) {
						int[] var20 = new int[this.huffmanTree.length * 2];
						for (int var21 = 0; var21 < this.huffmanTree.length; var21++) {
							var20[var21] = this.huffmanTree[var21];
						}
						this.huffmanTree = var20;
					}
				}
				this.huffmanTree[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}

	@ObfuscatedName("bg.b()[F")
	public float[] decodeVQ() {
		return this.vqLookup[this.decodeScalar()];
	}

	@ObfuscatedName("bg.c()I")
	public int decodeScalar() {
		int var1;
		for (var1 = 0; this.huffmanTree[var1] >= 0; var1 = JagVorbis.readBit() == 0 ? var1 + 1 : this.huffmanTree[var1]) {
		}
		return ~this.huffmanTree[var1];
	}
}
