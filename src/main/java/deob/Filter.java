package deob;

@ObfuscatedName("r")
public final class Filter {

	@ObfuscatedName("r.a")
	public final int[][][] field3614 = new int[2][2][4];

	@ObfuscatedName("r.b")
	public static int field3615;

	@ObfuscatedName("r.c")
	public final int[][][] field3616 = new int[2][2][4];

	@ObfuscatedName("r.d")
	public final int[] field3617 = new int[2];

	@ObfuscatedName("r.e")
	public static float field3618;

	@ObfuscatedName("r.f")
	public static final int[][] field3619 = new int[2][8];

	@ObfuscatedName("r.g")
	public final int[] field3620 = new int[2];

	@ObfuscatedName("r.h")
	public static final float[][] field3621 = new float[2][8];

	@ObfuscatedName("r.a(F)F")
	public static float method1301(float arg0) {
		float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("r.a(IIF)F")
	public float method1300(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field3614[arg0][0][arg1] + arg2 * (float) (this.field3614[arg0][1][arg1] - this.field3614[arg0][0][arg1]);
		float var5 = var4 * 1.2207031E-4F;
		return method1301(var5);
	}

	@ObfuscatedName("r.b(IIF)F")
	public float method1302(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field3616[arg0][0][arg1] + arg2 * (float) (this.field3616[arg0][1][arg1] - this.field3616[arg0][0][arg1]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("r.a(IF)I")
	public int method1303(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) this.field3617[0] + (float) (this.field3617[1] - this.field3617[0]) * arg1;
			float var4 = var3 * 0.0030517578F;
			field3618 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			field3615 = (int) (field3618 * 65536.0F);
		}
		if (this.field3620[arg0] == 0) {
			return 0;
		}
		float var5 = this.method1302(arg0, 0, arg1);
		field3621[arg0][0] = -2.0F * var5 * (float) Math.cos((double) this.method1300(arg0, 0, arg1));
		field3621[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < this.field3620[arg0]; var6++) {
			float var7 = this.method1302(arg0, var6, arg1);
			float var8 = -2.0F * var7 * (float) Math.cos((double) this.method1300(arg0, var6, arg1));
			float var9 = var7 * var7;
			field3621[arg0][var6 * 2 + 1] = field3621[arg0][var6 * 2 - 1] * var9;
			field3621[arg0][var6 * 2] = field3621[arg0][var6 * 2 - 1] * var8 + field3621[arg0][var6 * 2 - 2] * var9;
			for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
				field3621[arg0][var10] += field3621[arg0][var10 - 1] * var8 + field3621[arg0][var10 - 2] * var9;
			}
			field3621[arg0][1] += field3621[arg0][0] * var8 + var9;
			field3621[arg0][0] += var8;
		}
		if (arg0 == 0) {
			for (int var11 = 0; var11 < this.field3620[0] * 2; var11++) {
				field3621[0][var11] *= field3618;
			}
		}
		for (int var12 = 0; var12 < this.field3620[arg0] * 2; var12++) {
			field3619[arg0][var12] = (int) (field3621[arg0][var12] * 65536.0F);
		}
		return this.field3620[arg0] * 2;
	}

	@ObfuscatedName("r.a(Lea;Lvf;)V")
	public void method1305(Packet arg0, Envelope arg1) {
		int var3 = arg0.g1();
		this.field3620[0] = var3 >> 4;
		this.field3620[1] = var3 & 0xF;
		if (var3 == 0) {
			this.field3617[0] = this.field3617[1] = 0;
			return;
		}
		this.field3617[0] = arg0.g2();
		this.field3617[1] = arg0.g2();
		int var4 = arg0.g1();
		for (int var5 = 0; var5 < 2; var5++) {
			for (int var6 = 0; var6 < this.field3620[var5]; var6++) {
				this.field3614[var5][0][var6] = arg0.g2();
				this.field3616[var5][0][var6] = arg0.g2();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.field3620[var7]; var8++) {
				if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
					this.field3614[var7][1][var8] = this.field3614[var7][0][var8];
					this.field3616[var7][1][var8] = this.field3616[var7][0][var8];
				} else {
					this.field3614[var7][1][var8] = arg0.g2();
					this.field3616[var7][1][var8] = arg0.g2();
				}
			}
		}
		if (var4 != 0 || this.field3617[1] != this.field3617[0]) {
			arg1.method1562(arg0);
		}
	}
}
