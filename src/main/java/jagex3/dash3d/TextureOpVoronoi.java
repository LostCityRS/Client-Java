package jagex3.dash3d;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.ByteArrayNode2;
import jagex3.io.Packet;

import java.util.Random;

@ObfuscatedName("l")
public final class TextureOpVoronoi extends TextureOp {

    @ObfuscatedName("ma.bb")
    public static int field2472;
    @ObfuscatedName("sc.ab")
    public static int field3809;
	@ObfuscatedName("jd.g")
	public static int field1850;
	@ObfuscatedName("hc.eb")
	public static int field1452;
	@ObfuscatedName("l.eb")
	public int jitter = 2048;

	@ObfuscatedName("l.hb")
	public int seed = 0;

	@ObfuscatedName("l.jb")
	public int cellsX = 5;

	@ObfuscatedName("l.lb")
	public int distanceMetric = 1;

	@ObfuscatedName("l.Q")
	public int cellsY = 5;

	@ObfuscatedName("l.U")
	public int outputMetric = 2;

	@ObfuscatedName("l.W")
	public byte[] permTable = new byte[512];

	@ObfuscatedName("l.V")
	public short[] jitterTable = new short[512];

	public TextureOpVoronoi() {
		super(0, true);
	}

	@ObfuscatedName("l.a(Lea;II)V")
	@Override
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 0) {
			this.cellsX = this.cellsY = arg0.g1();
		} else if (arg1 == 1) {
			this.seed = arg0.g1();
		} else if (arg1 == 2) {
			this.jitter = arg0.g2();
		} else if (arg1 == 3) {
			this.outputMetric = arg0.g1();
		} else if (arg1 == 4) {
			this.distanceMetric = arg0.g1();
		} else if (arg1 == 5) {
			this.cellsX = arg0.g1();
		} else if (arg1 == 6) {
			this.cellsY = arg0.g1();
		}
	}

	@ObfuscatedName("l.a(IB)[I")
	@Override
	public int[] renderMono(int arg0) {
		int[] var2 = super.monoCache.method1078(arg0);
		if (super.monoCache.field3098) {
			int var3 = Texture.field2021[arg0] * this.cellsY + 2048;
			int var4 = var3 >> 12;
			int var5 = var4 + 1;
			for (int var6 = 0; var6 < Texture.field1276; var6++) {
				field1452 = Integer.MAX_VALUE;
				field1850 = Integer.MAX_VALUE;
				field3809 = Integer.MAX_VALUE;
				field2472 = Integer.MAX_VALUE;
				int var7 = Texture.field351[var6] * this.cellsX + 2048;
				int var8 = var7 >> 12;
				int var9 = var8 + 1;
				for (int var10 = var4 - 1; var10 <= var5; var10++) {
					int var11 = this.permTable[(var10 < this.cellsY ? var10 : var10 - this.cellsY) & 0xFF] & 0xFF;
					for (int var12 = var8 - 1; var12 <= var9; var12++) {
						int var13 = (this.permTable[var11 + (this.cellsX <= var12 ? var12 - this.cellsX : var12) & 0xFF] & 0xFF) * 2;
						int var26 = var13 + 1;
						int var14 = var7 - this.jitterTable[var13] - (var12 << 12);
						int var15 = var3 - (var10 << 12) - this.jitterTable[var26];
						int var16 = this.distanceMetric;
						int var17;
						if (var16 == 1) {
							var17 = var14 * var14 + var15 * var15 >> 12;
						} else if (var16 == 3) {
							int var18 = var15 >= 0 ? var15 : -var15;
							int var19 = var14 < 0 ? -var14 : var14;
							var17 = var19 <= var18 ? var18 : var19;
						} else if (var16 == 4) {
							int var20 = (int) (Math.sqrt((double) ((float) (var14 >= 0 ? var14 : -var14) / 4096.0F)) * 4096.0D);
							int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
							int var22 = var21 + var20;
							var17 = var22 * var22 >> 12;
						} else if (var16 == 5) {
							int var23 = var14 * var14;
							int var24 = var15 * var15;
							var17 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var23 + var24) / 1.6777216E7F))) * 4096.0D);
						} else if (var16 == 2) {
							var17 = (var15 >= 0 ? var15 : -var15) + (var14 < 0 ? -var14 : var14);
						} else {
							var17 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var14 * var14) / 1.6777216E7F)) * 4096.0D);
						}
						if (field2472 > var17) {
							field1452 = field1850;
							field1850 = field3809;
							field3809 = field2472;
							field2472 = var17;
						} else if (var17 < field3809) {
							field1452 = field1850;
							field1850 = field3809;
							field3809 = var17;
						} else if (var17 < field1850) {
							field1452 = field1850;
							field1850 = var17;
						} else if (var17 < field1452) {
							field1452 = var17;
						}
					}
				}
				int var25 = this.outputMetric;
				if (var25 == 0) {
					var2[var6] = field2472;
				} else if (var25 == 1) {
					var2[var6] = field3809;
				} else if (var25 == 3) {
					var2[var6] = field1850;
				} else if (var25 == 4) {
					var2[var6] = field1452;
				} else if (var25 == 2) {
					var2[var6] = field3809 - field2472;
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("l.b(B)V")
	@Override
	public void postDecode() {
		this.permTable = ByteArrayNode2.method1072(this.seed);
		this.generateJitter();
	}

	@ObfuscatedName("l.e(I)V")
	public void generateJitter() {
		Random var1 = new Random((long) this.seed);
		this.jitterTable = new short[512];
		if (this.jitter > 0) {
			for (int var2 = 0; var2 < 512; var2++) {
				this.jitterTable[var2] = (short) Statics.method812(this.jitter, var1);
			}
		}
	}
}
