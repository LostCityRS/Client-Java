package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;

import java.util.Random;

@ObfuscatedName("lc")
public final class Tone {

	@ObfuscatedName("lc.a")
	public Envelope frequencyBase;

	@ObfuscatedName("lc.b")
	public static final int[] noise = new int[32768];

	@ObfuscatedName("lc.c")
	public final int[] harmonicSemitone = new int[5];

	@ObfuscatedName("lc.d")
	public static final int[] buf;

	@ObfuscatedName("lc.e")
	public int start = 0;

	@ObfuscatedName("lc.f")
	public Envelope frequencyModRange;

	@ObfuscatedName("lc.g")
	public int reverbDelay = 0;

	@ObfuscatedName("lc.h")
	public int reverbVolume = 100;

	@ObfuscatedName("lc.i")
	public Filter filter;

	@ObfuscatedName("lc.j")
	public int length = 500;

	@ObfuscatedName("lc.k")
	public static final int[] sine;

	@ObfuscatedName("lc.l")
	public Envelope filterRange;

	@ObfuscatedName("lc.m")
	public Envelope frequencyModRate;

	@ObfuscatedName("lc.n")
	public final int[] harmonicDelay = new int[5];

	@ObfuscatedName("lc.o")
	public final int[] harmonicVolume = new int[5];

	@ObfuscatedName("lc.p")
	public Envelope release;

	@ObfuscatedName("lc.q")
	public static final int[] fMulti;

	@ObfuscatedName("lc.r")
	public Envelope amplitudeModRange;

	@ObfuscatedName("lc.s")
	public static final int[] fPos;

	@ObfuscatedName("lc.t")
	public static final int[] fOffset;

	@ObfuscatedName("lc.u")
	public static final int[] fAmp;

	@ObfuscatedName("lc.v")
	public Envelope amplitudeBase;

	@ObfuscatedName("lc.w")
	public static final int[] fDel;

	@ObfuscatedName("lc.x")
	public Envelope attack;

	@ObfuscatedName("lc.y")
	public Envelope amplitudeModRate;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			noise[var1] = (var0.nextInt() & 0x2) - 1;
		}
		sine = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			sine[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		buf = new int[220500];
		fMulti = new int[5];
		fPos = new int[5];
		fOffset = new int[5];
		fAmp = new int[5];
		fDel = new int[5];
	}

	@ObfuscatedName("lc.a(III)I")
	public int waveFunc(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return sine[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return noise[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("lc.a(II)[I")
	public int[] generate(int arg0, int arg1) {
		ArrayUtil.clear(buf, 0, arg0);
		if (arg1 < 10) {
			return buf;
		}
		double var3 = (double) arg0 / ((double) arg1 + 0.0D);
		this.frequencyBase.genInit();
		this.amplitudeBase.genInit();
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		if (this.frequencyModRate != null) {
			this.frequencyModRate.genInit();
			this.frequencyModRange.genInit();
			var5 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var3);
			var6 = (int) ((double) this.frequencyModRate.start * 32.768D / var3);
		}
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		if (this.amplitudeModRate != null) {
			this.amplitudeModRate.genInit();
			this.amplitudeModRange.genInit();
			var8 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var3);
			var9 = (int) ((double) this.amplitudeModRate.start * 32.768D / var3);
		}
		for (int var11 = 0; var11 < 5; var11++) {
			if (this.harmonicVolume[var11] != 0) {
				fPos[var11] = 0;
				fDel[var11] = (int) ((double) this.harmonicDelay[var11] * var3);
				fAmp[var11] = (this.harmonicVolume[var11] << 14) / 100;
				fMulti[var11] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var11]) / var3);
				fOffset[var11] = (int) ((double) this.frequencyBase.start * 32.768D / var3);
			}
		}
		for (int var12 = 0; var12 < arg0; var12++) {
			int var13 = this.frequencyBase.genNext(arg0);
			int var14 = this.amplitudeBase.genNext(arg0);
			if (this.frequencyModRate != null) {
				int var15 = this.frequencyModRate.genNext(arg0);
				int var16 = this.frequencyModRange.genNext(arg0);
				var13 += this.waveFunc(var7, var16, this.frequencyModRate.form) >> 1;
				var7 += (var15 * var5 >> 16) + var6;
			}
			if (this.amplitudeModRate != null) {
				int var17 = this.amplitudeModRate.genNext(arg0);
				int var18 = this.amplitudeModRange.genNext(arg0);
				var14 = var14 * ((this.waveFunc(var10, var18, this.amplitudeModRate.form) >> 1) + 32768) >> 15;
				var10 += (var17 * var8 >> 16) + var9;
			}
			for (int var19 = 0; var19 < 5; var19++) {
				if (this.harmonicVolume[var19] != 0) {
					int var20 = var12 + fDel[var19];
					if (var20 < arg0) {
						buf[var20] += this.waveFunc(fPos[var19], var14 * fAmp[var19] >> 15, this.frequencyBase.form);
						fPos[var19] += (var13 * fMulti[var19] >> 16) + fOffset[var19];
					}
				}
			}
		}
		if (this.release != null) {
			this.release.genInit();
			this.attack.genInit();
			int var21 = 0;
			boolean var22 = true;
			for (int var23 = 0; var23 < arg0; var23++) {
				int var24 = this.release.genNext(arg0);
				int var25 = this.attack.genNext(arg0);
				int var26;
				if (var22) {
					var26 = this.release.start + ((this.release.end - this.release.start) * var24 >> 8);
				} else {
					var26 = this.release.start + ((this.release.end - this.release.start) * var25 >> 8);
				}
				var21 += 256;
				if (var21 >= var26) {
					var21 = 0;
					var22 = !var22;
				}
				if (var22) {
					buf[var23] = 0;
				}
			}
		}
		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			int var27 = (int) ((double) this.reverbDelay * var3);
			for (int var28 = var27; var28 < arg0; var28++) {
				buf[var28] += buf[var28 - var27] * this.reverbVolume / 100;
			}
		}
		if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
			this.filterRange.genInit();
			int var29 = this.filterRange.genNext(arg0 + 1);
			int var30 = this.filter.calculateCoeffs(0, (float) var29 / 65536.0F);
			int var31 = this.filter.calculateCoeffs(1, (float) var29 / 65536.0F);
			if (arg0 >= var30 + var31) {
				int var32 = 0;
				int var33 = var31;
				if (var31 > arg0 - var30) {
					var33 = arg0 - var30;
				}
				while (var32 < var33) {
					int var34 = (int) ((long) buf[var32 + var30] * (long) Filter.reduceCoeffInt >> 16);
					for (int var35 = 0; var35 < var30; var35++) {
						var34 += (int) ((long) buf[var32 + var30 - var35 - 1] * (long) Filter.coeffInt[0][var35] >> 16);
					}
					for (int var36 = 0; var36 < var32; var36++) {
						var34 -= (int) ((long) buf[var32 - var36 - 1] * (long) Filter.coeffInt[1][var36] >> 16);
					}
					buf[var32] = var34;
					var29 = this.filterRange.genNext(arg0 + 1);
					var32++;
				}
				int var37 = 128;
				while (true) {
					if (var37 > arg0 - var30) {
						var37 = arg0 - var30;
					}
					while (var32 < var37) {
						int var38 = (int) ((long) buf[var32 + var30] * (long) Filter.reduceCoeffInt >> 16);
						for (int var39 = 0; var39 < var30; var39++) {
							var38 += (int) ((long) buf[var32 + var30 - var39 - 1] * (long) Filter.coeffInt[0][var39] >> 16);
						}
						for (int var40 = 0; var40 < var31; var40++) {
							var38 -= (int) ((long) buf[var32 - var40 - 1] * (long) Filter.coeffInt[1][var40] >> 16);
						}
						buf[var32] = var38;
						var29 = this.filterRange.genNext(arg0 + 1);
						var32++;
					}
					if (var32 >= arg0 - var30) {
						while (var32 < arg0) {
							int var41 = 0;
							for (int var42 = var32 + var30 - arg0; var42 < var30; var42++) {
								var41 += (int) ((long) buf[var32 + var30 - var42 - 1] * (long) Filter.coeffInt[0][var42] >> 16);
							}
							for (int var43 = 0; var43 < var31; var43++) {
								var41 -= (int) ((long) buf[var32 - var43 - 1] * (long) Filter.coeffInt[1][var43] >> 16);
							}
							buf[var32] = var41;
							this.filterRange.genNext(arg0 + 1);
							var32++;
						}
						break;
					}
					var30 = this.filter.calculateCoeffs(0, (float) var29 / 65536.0F);
					var31 = this.filter.calculateCoeffs(1, (float) var29 / 65536.0F);
					var37 += 128;
				}
			}
		}
		for (int var45 = 0; var45 < arg0; var45++) {
			if (buf[var45] < -32768) {
				buf[var45] = -32768;
			}
			if (buf[var45] > 32767) {
				buf[var45] = 32767;
			}
		}
		return buf;
	}

	@ObfuscatedName("lc.a(Lea;)V")
	public void load(Packet arg0) {
		this.frequencyBase = new Envelope();
		this.frequencyBase.load(arg0);
		this.amplitudeBase = new Envelope();
		this.amplitudeBase.load(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			this.frequencyModRate = new Envelope();
			this.frequencyModRate.load(arg0);
			this.frequencyModRange = new Envelope();
			this.frequencyModRange.load(arg0);
		}
		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			this.amplitudeModRate = new Envelope();
			this.amplitudeModRate.load(arg0);
			this.amplitudeModRange = new Envelope();
			this.amplitudeModRange.load(arg0);
		}
		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			this.release = new Envelope();
			this.release.load(arg0);
			this.attack = new Envelope();
			this.attack.load(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method350();
			if (var6 == 0) {
				break;
			}
			this.harmonicVolume[var5] = var6;
			this.harmonicSemitone[var5] = arg0.method342();
			this.harmonicDelay[var5] = arg0.method350();
		}
		this.reverbDelay = arg0.method350();
		this.reverbVolume = arg0.method350();
		this.length = arg0.g2();
		this.start = arg0.g2();
		this.filter = new Filter();
		this.filterRange = new Envelope();
		this.filter.load(arg0, this.filterRange);
	}
}
