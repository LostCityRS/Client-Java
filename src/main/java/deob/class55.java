package deob;

@ObfuscatedName("hf")
public final class class55 {

	@ObfuscatedName("hf.a")
	public static int[][] field1284 = new int[2][8];

	@ObfuscatedName("hf.b")
	public final int[] field1285 = new int[2];

	@ObfuscatedName("hf.c")
	public final int[][][] field1286 = new int[2][2][4];

	@ObfuscatedName("hf.d")
	public static float[][] field1287 = new float[2][8];

	@ObfuscatedName("hf.e")
	public static int field1288;

	@ObfuscatedName("hf.f")
	public static float field1289;

	@ObfuscatedName("hf.g")
	public final int[] field1290 = new int[2];

	@ObfuscatedName("hf.h")
	public final int[][][] field1291 = new int[2][2][4];

	@ObfuscatedName("hf.a(F)F")
	public static float method431(float arg0) {
		float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("hf.a()V")
	public static void method433() {
		field1287 = null;
		field1284 = null;
	}

	@ObfuscatedName("hf.a(Ljd;Lk;)V")
	public void method430(class66 arg0, class69 arg1) {
		int var3 = arg0.method532();
		this.field1285[0] = var3 >> 4;
		this.field1285[1] = var3 & 0xF;
		if (var3 == 0) {
			this.field1290[0] = this.field1290[1] = 0;
			return;
		}
		this.field1290[0] = arg0.method531();
		this.field1290[1] = arg0.method531();
		int var4 = arg0.method532();
		for (int var5 = 0; var5 < 2; var5++) {
			for (int var6 = 0; var6 < this.field1285[var5]; var6++) {
				this.field1291[var5][0][var6] = arg0.method531();
				this.field1286[var5][0][var6] = arg0.method531();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.field1285[var7]; var8++) {
				if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
					this.field1291[var7][1][var8] = this.field1291[var7][0][var8];
					this.field1286[var7][1][var8] = this.field1286[var7][0][var8];
				} else {
					this.field1291[var7][1][var8] = arg0.method531();
					this.field1286[var7][1][var8] = arg0.method531();
				}
			}
		}
		if (var4 != 0 || this.field1290[1] != this.field1290[0]) {
			arg1.method575(arg0);
		}
	}

	@ObfuscatedName("hf.a(IF)I")
	public int method432(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) this.field1290[0] + (float) (this.field1290[1] - this.field1290[0]) * arg1;
			float var4 = var3 * 0.0030517578F;
			field1289 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			field1288 = (int) (field1289 * 65536.0F);
		}
		if (this.field1285[arg0] == 0) {
			return 0;
		}
		float var5 = this.method435(arg0, 0, arg1);
		field1287[arg0][0] = -2.0F * var5 * (float) Math.cos((double) this.method434(arg0, 0, arg1));
		field1287[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < this.field1285[arg0]; var6++) {
			float var7 = this.method435(arg0, var6, arg1);
			float var8 = -2.0F * var7 * (float) Math.cos((double) this.method434(arg0, var6, arg1));
			float var9 = var7 * var7;
			field1287[arg0][var6 * 2 + 1] = field1287[arg0][var6 * 2 - 1] * var9;
			field1287[arg0][var6 * 2] = field1287[arg0][var6 * 2 - 1] * var8 + field1287[arg0][var6 * 2 - 2] * var9;
			for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
				field1287[arg0][var10] += field1287[arg0][var10 - 1] * var8 + field1287[arg0][var10 - 2] * var9;
			}
			field1287[arg0][1] += field1287[arg0][0] * var8 + var9;
			field1287[arg0][0] += var8;
		}
		if (arg0 == 0) {
			for (int var11 = 0; var11 < this.field1285[0] * 2; var11++) {
				field1287[0][var11] *= field1289;
			}
		}
		for (int var12 = 0; var12 < this.field1285[arg0] * 2; var12++) {
			field1284[arg0][var12] = (int) (field1287[arg0][var12] * 65536.0F);
		}
		return this.field1285[arg0] * 2;
	}

	@ObfuscatedName("hf.a(IIF)F")
	public float method434(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field1291[arg0][0][arg1] + arg2 * (float) (this.field1291[arg0][1][arg1] - this.field1291[arg0][0][arg1]);
		float var5 = var4 * 1.2207031E-4F;
		return method431(var5);
	}

	@ObfuscatedName("hf.b(IIF)F")
	public float method435(int arg0, int arg1, float arg2) {
		float var4 = (float) this.field1286[arg0][0][arg1] + arg2 * (float) (this.field1286[arg0][1][arg1] - this.field1286[arg0][0][arg1]);
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}
}
