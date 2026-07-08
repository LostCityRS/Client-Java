package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public final class Tone {

	@ObfuscatedName("dc.d")
	public Envelope frequencyBase;

	@ObfuscatedName("dc.e")
	public Envelope amplitudeBase;

	@ObfuscatedName("dc.f")
	public Envelope frequencyModRate;

	@ObfuscatedName("dc.g")
	public Envelope frequencyModRange;

	@ObfuscatedName("dc.h")
	public Envelope amplitudeModRate;

	@ObfuscatedName("dc.i")
	public Envelope amplitudeModRange;

	@ObfuscatedName("dc.j")
	public Envelope release;

	@ObfuscatedName("dc.k")
	public Envelope attack;

	@ObfuscatedName("dc.l")
	public final int[] harmonicVolume = new int[5];

	@ObfuscatedName("dc.m")
	public final int[] harmonicSemitone = new int[5];

	@ObfuscatedName("dc.n")
	public final int[] harmonicDelay = new int[5];

	@ObfuscatedName("dc.o")
	public int reverbDelay;

	@ObfuscatedName("dc.p")
	public int reverbVolume = 100;

	@ObfuscatedName("dc.q")
	public Filter filter;

	@ObfuscatedName("dc.r")
	public Envelope filterRange;

	@ObfuscatedName("dc.s")
	public int length = 500;

	@ObfuscatedName("dc.t")
	public int start;

	@ObfuscatedName("dc.u")
	public static int[] buf;

	@ObfuscatedName("dc.v")
	public static int[] noise;

	@ObfuscatedName("dc.w")
	public static int[] sine;

	@ObfuscatedName("dc.x")
	public static final int[] fPos = new int[5];

	@ObfuscatedName("dc.y")
	public static final int[] fDel = new int[5];

	@ObfuscatedName("dc.z")
	public static final int[] fAmp = new int[5];

	@ObfuscatedName("dc.A")
	public static final int[] fMulti = new int[5];

	@ObfuscatedName("dc.B")
	public static final int[] fOffset = new int[5];

	@ObfuscatedName("dc.a")
	public final boolean field918 = false;

	@ObfuscatedName("dc.b")
	public final int field919 = 188;

	@ObfuscatedName("dc.c")
	public final int field920 = 810;

	@ObfuscatedName("dc.a(II)[I")
	public int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buf[var3] = 0;
		}
		if (arg1 < 10) {
			return buf;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		frequencyBase.genInit();
		amplitudeBase.genInit();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (frequencyModRate != null) {
			frequencyModRate.genInit();
			frequencyModRange.genInit();
			var6 = (int) ((double) (frequencyModRate.end - frequencyModRate.start) * 32.768D / var4);
			var7 = (int) ((double) frequencyModRate.start * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (amplitudeModRate != null) {
			amplitudeModRate.genInit();
			amplitudeModRange.genInit();
			var9 = (int) ((double) (amplitudeModRate.end - amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) ((double) amplitudeModRate.start * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (harmonicVolume[var12] != 0) {
				fPos[var12] = 0;
				fDel[var12] = (int) ((double) harmonicDelay[var12] * var4);
				fAmp[var12] = (harmonicVolume[var12] << 14) / 100;
				fMulti[var12] = (int) ((double) (frequencyBase.end - frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) harmonicSemitone[var12]) / var4);
				fOffset[var12] = (int) ((double) frequencyBase.start * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = frequencyBase.genNext(arg0);
			int var15 = amplitudeBase.genNext(arg0);
			if (frequencyModRate != null) {
				int var16 = frequencyModRate.genNext(arg0);
				int var17 = frequencyModRange.genNext(arg0);
				var14 += waveFunc(var17, var8, frequencyModRate.form) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (amplitudeModRate != null) {
				int var18 = amplitudeModRate.genNext(arg0);
				int var19 = amplitudeModRange.genNext(arg0);
				var15 = var15 * ((waveFunc(var19, var11, amplitudeModRate.form) >> 1) + 0x8000) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (harmonicVolume[var20] != 0) {
					int var21 = var13 + fDel[var20];
					if (var21 < arg0) {
						buf[var21] += waveFunc(var15 * fAmp[var20] >> 15, fPos[var20], frequencyBase.form);
						fPos[var20] += (var14 * fMulti[var20] >> 16) + fOffset[var20];
					}
				}
			}
		}
		if (release != null) {
			release.genInit();
			attack.genInit();
			int var22 = 0;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = release.genNext(arg0);
				int var26 = attack.genNext(arg0);
				int var27;
				if (var23) {
					var27 = release.start + ((release.end - release.start) * var25 >> 8);
				} else {
					var27 = release.start + ((release.end - release.start) * var26 >> 8);
				}
				var22 += 256;
				if (var22 >= var27) {
					var22 = 0;
					var23 = !var23;
				}
				if (var23) {
					buf[var24] = 0;
				}
			}
		}
		if (reverbDelay > 0 && reverbVolume > 0) {
			int var28 = (int) ((double) reverbDelay * var4);
			for (int var29 = var28; var29 < arg0; var29++) {
				buf[var29] += buf[var29 - var28] * reverbVolume / 100;
			}
		}
		if (filter.pairs[0] > 0 || filter.pairs[1] > 0) {
			filterRange.genInit();
			int var30 = filterRange.genNext(arg0 + 1);
			int var31 = filter.calculateCoeffs(0, (float) var30 / 65536.0F);
			int var32 = filter.calculateCoeffs(1, (float) var30 / 65536.0F);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) buf[var33 + var31] * (long) Filter.reduceCoeffInt >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) buf[var33 + var31 - var36 - 1] * (long) Filter.coeffInt[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) buf[var33 - var37 - 1] * (long) Filter.coeffInt[1][var37] >> 16);
					}
					buf[var33] = var35;
					var30 = filterRange.genNext(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) buf[var33 + var31] * (long) Filter.reduceCoeffInt >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) buf[var33 + var31 - var40 - 1] * (long) Filter.coeffInt[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) buf[var33 - var41 - 1] * (long) Filter.coeffInt[1][var41] >> 16);
						}
						buf[var33] = var39;
						var30 = filterRange.genNext(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var33 + var31 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) buf[var33 + var31 - var43 - 1] * (long) Filter.coeffInt[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) buf[var33 - var44 - 1] * (long) Filter.coeffInt[1][var44] >> 16);
							}
							buf[var33] = var42;
							filterRange.genNext(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = filter.calculateCoeffs(0, (float) var30 / 65536.0F);
					var32 = filter.calculateCoeffs(1, (float) var30 / 65536.0F);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (buf[var46] < -32768) {
				buf[var46] = -32768;
			}
			if (buf[var46] > 32767) {
				buf[var46] = 32767;
			}
		}
		return buf;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public int waveFunc(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
		} else if (arg2 == 2) {
			return sine[arg1 & 0x7FFF] * arg0 >> 14;
		} else if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		} else if (arg2 == 4) {
			return noise[arg1 / 2607 & 0x7FFF] * arg0;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(ZLlb;)V")
	public void load(Packet arg0) {
		frequencyBase = new Envelope();
		frequencyBase.load(arg0);
		amplitudeBase = new Envelope();
		amplitudeBase.load(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			frequencyModRate = new Envelope();
			frequencyModRate.load(arg0);
			frequencyModRange = new Envelope();
			frequencyModRange.load(arg0);
		}
		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			amplitudeModRate = new Envelope();
			amplitudeModRate.load(arg0);
			amplitudeModRange = new Envelope();
			amplitudeModRange.load(arg0);
		}
		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			release = new Envelope();
			release.load(arg0);
			attack = new Envelope();
			attack.load(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.gsmart();
			if (var6 == 0) {
				break;
			}
			harmonicVolume[var5] = var6;
			harmonicSemitone[var5] = arg0.gsmarts();
			harmonicDelay[var5] = arg0.gsmart();
		}
		reverbDelay = arg0.gsmart();
		reverbVolume = arg0.gsmart();
		length = arg0.g2();
		start = arg0.g2();
		filter = new Filter();
		filterRange = new Envelope();
		filter.load(field920, filterRange, arg0);
	}

	@ObfuscatedName("dc.a()V")
	public static void init() {
		noise = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				noise[var0] = 1;
			} else {
				noise[var0] = -1;
			}
		}
		sine = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			sine[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		buf = new int[220500];
	}
}
