package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public class Tone {

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
	public int[] harmonicVolume = new int[5];

	@ObfuscatedName("dc.m")
	public int[] harmonicSemitone = new int[5];

	@ObfuscatedName("dc.n")
	public int[] harmonicDelay = new int[5];

	@ObfuscatedName("dc.o")
	public int reverbDelay;

	@ObfuscatedName("dc.p")
	public int reverbVolume = 100;

	@ObfuscatedName("dc.q")
	public int length = 500;

	@ObfuscatedName("dc.r")
	public int start;

	@ObfuscatedName("dc.s")
	public static int[] buf;

	@ObfuscatedName("dc.t")
	public static int[] noise;

	@ObfuscatedName("dc.u")
	public static int[] sine;

	@ObfuscatedName("dc.v")
	public static int[] fPos = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] fDel = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] fAmp = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] fMulti = new int[5];

	@ObfuscatedName("dc.z")
	public static int[] fOffset = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void init() {
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

	@ObfuscatedName("dc.a(II)[I")
	public final int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buf[var3] = 0;
		}
		if (arg1 < 10) {
			return buf;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.frequencyBase.genInit();
		this.amplitudeBase.genInit();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.frequencyModRate != null) {
			this.frequencyModRate.genInit();
			this.frequencyModRange.genInit();
			var6 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var4);
			var7 = (int) ((double) this.frequencyModRate.start * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.amplitudeModRate != null) {
			this.amplitudeModRate.genInit();
			this.amplitudeModRange.genInit();
			var9 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) ((double) this.amplitudeModRate.start * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.harmonicVolume[var12] != 0) {
				fPos[var12] = 0;
				fDel[var12] = (int) ((double) this.harmonicDelay[var12] * var4);
				fAmp[var12] = (this.harmonicVolume[var12] << 14) / 100;
				fMulti[var12] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var12]) / var4);
				fOffset[var12] = (int) ((double) this.frequencyBase.start * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.frequencyBase.genNext(arg0);
			int var15 = this.amplitudeBase.genNext(arg0);
			if (this.frequencyModRate != null) {
				int var16 = this.frequencyModRate.genNext(arg0);
				int var17 = this.frequencyModRange.genNext(arg0);
				var14 += this.waveFunc(var17, this.frequencyModRate.form, var8) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (this.amplitudeModRate != null) {
				int var18 = this.amplitudeModRate.genNext(arg0);
				int var19 = this.amplitudeModRange.genNext(arg0);
				var15 = var15 * ((this.waveFunc(var19, this.amplitudeModRate.form, var11) >> 1) + 32768) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.harmonicVolume[var20] != 0) {
					int var21 = var13 + fDel[var20];
					if (var21 < arg0) {
						buf[var21] += this.waveFunc(var15 * fAmp[var20] >> 15, this.frequencyBase.form, fPos[var20]);
						fPos[var20] += (var14 * fMulti[var20] >> 16) + fOffset[var20];
					}
				}
			}
		}
		if (this.release != null) {
			this.release.genInit();
			this.attack.genInit();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = this.release.genNext(arg0);
				int var27 = this.attack.genNext(arg0);
				int var28;
				if (var24) {
					var28 = this.release.start + ((this.release.end - this.release.start) * var26 >> 8);
				} else {
					var28 = this.release.start + ((this.release.end - this.release.start) * var27 >> 8);
				}
				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}
				if (var24) {
					buf[var25] = 0;
				}
			}
		}
		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			int var29 = (int) ((double) this.reverbDelay * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				buf[var30] += buf[var30 - var29] * this.reverbVolume / 100;
			}
		}
		for (int var31 = 0; var31 < arg0; var31++) {
			if (buf[var31] < -32768) {
				buf[var31] = -32768;
			}
			if (buf[var31] > 32767) {
				buf[var31] = 32767;
			}
		}
		return buf;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int waveFunc(int arg1, int arg2, int arg3) {
		if (arg2 == 1) {
			return (arg3 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return sine[arg3 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return noise[arg3 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(ZLmb;)V")
	public final void unpack(Packet arg1) {
		this.frequencyBase = new Envelope();
		this.frequencyBase.unpack(arg1);
		this.amplitudeBase = new Envelope();
		this.amplitudeBase.unpack(arg1);
		int var3 = arg1.g1();
		if (var3 != 0) {
			arg1.pos--;
			this.frequencyModRate = new Envelope();
			this.frequencyModRate.unpack(arg1);
			this.frequencyModRange = new Envelope();
			this.frequencyModRange.unpack(arg1);
		}
		int var4 = arg1.g1();
		if (var4 != 0) {
			arg1.pos--;
			this.amplitudeModRate = new Envelope();
			this.amplitudeModRate.unpack(arg1);
			this.amplitudeModRange = new Envelope();
			this.amplitudeModRange.unpack(arg1);
		}
		int var5 = arg1.g1();
		if (var5 != 0) {
			arg1.pos--;
			this.release = new Envelope();
			this.release.unpack(arg1);
			this.attack = new Envelope();
			this.attack.unpack(arg1);
		}
		for (int var6 = 0; var6 < 10; var6++) {
			int var7 = arg1.gsmarts();
			if (var7 == 0) {
				break;
			}
			this.harmonicVolume[var6] = var7;
			this.harmonicSemitone[var6] = arg1.gsmart();
			this.harmonicDelay[var6] = arg1.gsmarts();
		}
		this.reverbDelay = arg1.gsmarts();
		this.reverbVolume = arg1.gsmarts();
		this.length = arg1.g2();
		this.start = arg1.g2();
	}
}
