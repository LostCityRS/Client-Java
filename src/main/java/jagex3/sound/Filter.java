package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("ee")
public final class Filter {

	@ObfuscatedName("ee.a")
	public static float field819;
	@ObfuscatedName("ee.e")
	public static int field823;
	@ObfuscatedName("ee.b")
	public final int[][][] field820 = new int[2][2][4];

	@ObfuscatedName("ee.c")
	public static int[][] field821 = new int[2][8];

	@ObfuscatedName("ee.d")
	public static float[][] field822 = new float[2][8];

	@ObfuscatedName("ee.f")
	public final int[] field824 = new int[2];

	@ObfuscatedName("ee.g")
	public final int[] field825 = new int[2];

	@ObfuscatedName("ee.h")
	public final int[][][] field826 = new int[2][2][4];

	@ObfuscatedName("ee.a()V")
	public static void unload() {
		field822 = null;
		field821 = null;
	}

	@ObfuscatedName("ee.a(Lba;Lc;)V")
	public void method375(Packet arg0, Envelope arg1) {
		int var3 = arg0.g1();
		this.field825[0] = var3 >> 4;
		this.field825[1] = var3 & 0xF;
		if (var3 == 0) {
			this.field824[0] = this.field824[1] = 0;
			return;
		}
		this.field824[0] = arg0.g2();
		this.field824[1] = arg0.g2();
		int var4 = arg0.g1();
		for (int var5 = 0; var5 < 2; var5++) {
			for (int var6 = 0; var6 < this.field825[var5]; var6++) {
				this.field820[var5][0][var6] = arg0.g2();
				this.field826[var5][0][var6] = arg0.g2();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.field825[var7]; var8++) {
				if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
					this.field820[var7][1][var8] = this.field820[var7][0][var8];
					this.field826[var7][1][var8] = this.field826[var7][0][var8];
				} else {
					this.field820[var7][1][var8] = arg0.g2();
					this.field826[var7][1][var8] = arg0.g2();
				}
			}
		}
		if (var4 != 0 || this.field824[1] != this.field824[0]) {
			arg1.method250(arg0);
		}
	}

	@ObfuscatedName("ee.a(IIF)F")
	public float method377(int arg0, int arg1, float arg2) {
		float var4 = (float) (this.field826[arg0][1][arg1] - this.field826[arg0][0][arg1]) * arg2 + (float) this.field826[arg0][0][arg1];
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("ee.a(IF)I")
	public int method378(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (float) (this.field824[1] - this.field824[0]) * arg1 + (float) this.field824[0];
			float var4 = var3 * 0.0030517578F;
			field819 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
			field823 = (int) (field819 * 65536.0F);
		}
		if (this.field825[arg0] == 0) {
			return 0;
		}
		float var5 = this.method377(arg0, 0, arg1);
		field822[arg0][0] = var5 * -2.0F * (float) Math.cos((double) this.method379(arg0, 0, arg1));
		field822[arg0][1] = var5 * var5;
		for (int var6 = 1; var6 < this.field825[arg0]; var6++) {
			float var7 = this.method377(arg0, var6, arg1);
			float var8 = var7 * -2.0F * (float) Math.cos((double) this.method379(arg0, var6, arg1));
			float var9 = var7 * var7;
			field822[arg0][var6 * 2 + 1] = field822[arg0][var6 * 2 - 1] * var9;
			field822[arg0][var6 * 2] = field822[arg0][var6 * 2 - 1] * var8 + field822[arg0][var6 * 2 - 2] * var9;
			for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
				field822[arg0][var10] += field822[arg0][var10 - 1] * var8 + field822[arg0][var10 - 2] * var9;
			}
			field822[arg0][1] += field822[arg0][0] * var8 + var9;
			field822[arg0][0] += var8;
		}
		if (arg0 == 0) {
			for (int var11 = 0; var11 < this.field825[0] * 2; var11++) {
				field822[0][var11] *= field819;
			}
		}
		for (int var12 = 0; var12 < this.field825[arg0] * 2; var12++) {
			field821[arg0][var12] = (int) (field822[arg0][var12] * 65536.0F);
		}
		return this.field825[arg0] * 2;
	}

	@ObfuscatedName("ee.b(IIF)F")
	public float method379(int arg0, int arg1, float arg2) {
		float var4 = (float) (this.field820[arg0][1][arg1] - this.field820[arg0][0][arg1]) * arg2 + (float) this.field820[arg0][0][arg1];
		float var5 = var4 * 1.2207031E-4F;
		return method380(var5);
	}

	@ObfuscatedName("ee.a(F)F")
	public static float method380(float arg0) {
		float var1 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var1 * 3.1415927F / 11025.0F;
	}
}
