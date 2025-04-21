package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("dc")
public class Tone {

	@ObfuscatedName("dc.a")
	public boolean field909 = true;

	@ObfuscatedName("dc.b")
	public static int field910 = 6;

	@ObfuscatedName("dc.c")
	public Envelope frequencyBase;

	@ObfuscatedName("dc.d")
	public Envelope amplitudeBase;

	@ObfuscatedName("dc.e")
	public Envelope frequencyModRate;

	@ObfuscatedName("dc.f")
	public Envelope frequencyModRange;

	@ObfuscatedName("dc.g")
	public Envelope amplitudeModRate;

	@ObfuscatedName("dc.h")
	public Envelope amplitudeModRange;

	@ObfuscatedName("dc.i")
	public Envelope release;

	@ObfuscatedName("dc.j")
	public Envelope attack;

	@ObfuscatedName("dc.k")
	public int[] harmonicVolume = new int[5];

	@ObfuscatedName("dc.l")
	public int[] harmonicSemitone = new int[5];

	@ObfuscatedName("dc.m")
	public int[] harmonicDelay = new int[5];

	@ObfuscatedName("dc.n")
	public int reverbDelay;

	@ObfuscatedName("dc.o")
	public int reverbVolume = 100;

	@ObfuscatedName("dc.p")
	public int length = 500;

	@ObfuscatedName("dc.q")
	public int start;

	@ObfuscatedName("dc.r")
	public static int[] buffer;

	@ObfuscatedName("dc.s")
	public static int[] noise;

	@ObfuscatedName("dc.t")
	public static int[] sin;

	@ObfuscatedName("dc.u")
	public static int[] tmpPhases = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] tmpDelays = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] tmpVolumes = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] tmpSemitones = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] tmpStarts = new int[5];

	@ObfuscatedName("dc.z")
	public static int field934;

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
		sin = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			sin[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		buffer = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buffer[var3] = 0;
		}
		if (arg1 < 10) {
			return buffer;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.frequencyBase.reset((byte) 3);
		this.amplitudeBase.reset((byte) 3);
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.frequencyModRate != null) {
			this.frequencyModRate.reset((byte) 3);
			this.frequencyModRange.reset((byte) 3);
			var6 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var4);
			var7 = (int) ((double) this.frequencyModRate.start * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.amplitudeModRate != null) {
			this.amplitudeModRate.reset((byte) 3);
			this.amplitudeModRange.reset((byte) 3);
			var9 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) ((double) this.amplitudeModRate.start * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.harmonicVolume[var12] != 0) {
				tmpPhases[var12] = 0;
				tmpDelays[var12] = (int) ((double) this.harmonicDelay[var12] * var4);
				tmpVolumes[var12] = (this.harmonicVolume[var12] << 14) / 100;
				tmpSemitones[var12] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var12]) / var4);
				tmpStarts[var12] = (int) ((double) this.frequencyBase.start * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var24 = this.frequencyBase.evaluate(arg0, field910);
			int var25 = this.amplitudeBase.evaluate(arg0, field910);
			if (this.frequencyModRate != null) {
				int var26 = this.frequencyModRate.evaluate(arg0, field910);
				int var27 = this.frequencyModRange.evaluate(arg0, field910);
				var24 += this.generate(this.frequencyModRate.form, var27, var8, 2) >> 1;
				var8 += (var6 * var26 >> 16) + var7;
			}
			if (this.amplitudeModRate != null) {
				int var28 = this.amplitudeModRate.evaluate(arg0, field910);
				int var29 = this.amplitudeModRange.evaluate(arg0, field910);
				var25 = var25 * ((this.generate(this.amplitudeModRate.form, var29, var11, 2) >> 1) + 32768) >> 15;
				var11 += (var9 * var28 >> 16) + var10;
			}
			for (int var30 = 0; var30 < 5; var30++) {
				if (this.harmonicVolume[var30] != 0) {
					int var31 = tmpDelays[var30] + var13;
					if (var31 < arg0) {
						buffer[var31] += this.generate(this.frequencyBase.form, tmpVolumes[var30] * var25 >> 15, tmpPhases[var30], 2);
						tmpPhases[var30] += (tmpSemitones[var30] * var24 >> 16) + tmpStarts[var30];
					}
				}
			}
		}
		if (this.release != null) {
			this.release.reset((byte) 3);
			this.attack.reset((byte) 3);
			int var14 = 0;
			boolean var15 = false;
			boolean var16 = true;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = this.release.evaluate(arg0, field910);
				int var19 = this.attack.evaluate(arg0, field910);
				int var20;
				if (var16) {
					var20 = ((this.release.end - this.release.start) * var18 >> 8) + this.release.start;
				} else {
					var20 = ((this.release.end - this.release.start) * var19 >> 8) + this.release.start;
				}
				var14 += 256;
				if (var14 >= var20) {
					var14 = 0;
					var16 = !var16;
				}
				if (var16) {
					buffer[var17] = 0;
				}
			}
		}
		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			int var21 = (int) ((double) this.reverbDelay * var4);
			for (int var22 = var21; var22 < arg0; var22++) {
				buffer[var22] += buffer[var22 - var21] * this.reverbVolume / 100;
			}
		}
		for (int var23 = 0; var23 < arg0; var23++) {
			if (buffer[var23] < -32768) {
				buffer[var23] = -32768;
			}
			if (buffer[var23] > 32767) {
				buffer[var23] = 32767;
			}
		}
		return buffer;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int generate(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 != 2) {
			this.field909 = !this.field909;
		}
		if (arg0 == 1) {
			return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg0 == 2) {
			return sin[arg2 & 0x7FFF] * arg1 >> 14;
		} else if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg0 == 4) {
			return noise[arg2 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("dc.a(ILmb;)V")
	public final void unpack(int arg0, Packet arg1) {
		this.frequencyBase = new Envelope();
		this.frequencyBase.unpack(168, arg1);
		this.amplitudeBase = new Envelope();
		this.amplitudeBase.unpack(168, arg1);
		int var3 = arg1.g1();
		if (var3 != 0) {
			arg1.pos--;
			this.frequencyModRate = new Envelope();
			this.frequencyModRate.unpack(168, arg1);
			this.frequencyModRange = new Envelope();
			this.frequencyModRange.unpack(168, arg1);
		}
		int var4 = arg1.g1();
		int var5 = 82 / arg0;
		if (var4 != 0) {
			arg1.pos--;
			this.amplitudeModRate = new Envelope();
			this.amplitudeModRate.unpack(168, arg1);
			this.amplitudeModRange = new Envelope();
			this.amplitudeModRange.unpack(168, arg1);
		}
		int var6 = arg1.g1();
		if (var6 != 0) {
			arg1.pos--;
			this.release = new Envelope();
			this.release.unpack(168, arg1);
			this.attack = new Envelope();
			this.attack.unpack(168, arg1);
		}
		for (int var7 = 0; var7 < 10; var7++) {
			int var8 = arg1.gsmarts();
			if (var8 == 0) {
				break;
			}
			this.harmonicVolume[var7] = var8;
			this.harmonicSemitone[var7] = arg1.gsmart();
			this.harmonicDelay[var7] = arg1.gsmarts();
		}
		this.reverbDelay = arg1.gsmarts();
		this.reverbVolume = arg1.gsmarts();
		this.length = arg1.g2();
		this.start = arg1.g2();
	}
}
