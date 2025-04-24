package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.d")
	public static Wave[] tracks = new Wave[1000];

	@ObfuscatedName("cc.e")
	public static int[] delays = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] waveBytes;

	@ObfuscatedName("cc.g")
	public static Packet waveBuffer;

	@ObfuscatedName("cc.h")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("cc.i")
	public int loopBegin;

	@ObfuscatedName("cc.j")
	public int loopEnd;

	@ObfuscatedName("cc.a(Lmb;B)V")
	public static final void unpack(Packet arg0) {
		waveBytes = new byte[441000];
		waveBuffer = new Packet(waveBytes);
		Tone.init();
		while (true) {
			int var2 = arg0.g2();
			if (var2 == 65535) {
				return;
			}
			tracks[var2] = new Wave();
			tracks[var2].readWave(arg0);
			delays[var2] = tracks[var2].trim();
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final Packet generate(int arg0, int arg1) {
		if (tracks[arg1] == null) {
			return null;
		} else {
			Wave var4 = tracks[arg1];
			return var4.getWave(arg0);
		}
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void readWave(Packet arg1) {
		for (int var3 = 0; var3 < 10; var3++) {
			int var5 = arg1.g1();
			if (var5 != 0) {
				arg1.pos--;
				this.tones[var3] = new Tone();
				this.tones[var3].unpack(arg1);
			}
		}
		this.loopBegin = arg1.g2();
		this.loopEnd = arg1.g2();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int trim() {
		int var2 = 9999999;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].start / 20 < var2) {
				var2 = this.tones[var3].start / 20;
			}
		}
		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var2) {
			var2 = this.loopBegin / 20;
		}
		if (var2 == 9999999 || var2 == 0) {
			return 0;
		}
		for (int var4 = 0; var4 < 10; var4++) {
			if (this.tones[var4] != null) {
				this.tones[var4].start -= var2 * 20;
			}
		}
		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= var2 * 20;
			this.loopEnd -= var2 * 20;
		}
		return var2;
	}

	@ObfuscatedName("cc.a(IB)Lmb;")
	public final Packet getWave(int arg0) {
		int var3 = this.generate(arg0);
		waveBuffer.pos = 0;
		waveBuffer.p4(1380533830);
		waveBuffer.ip4(var3 + 36);
		waveBuffer.p4(1463899717);
		waveBuffer.p4(1718449184);
		waveBuffer.ip4(16);
		waveBuffer.ip2(1);
		waveBuffer.ip2(1);
		waveBuffer.ip4(22050);
		waveBuffer.ip4(22050);
		waveBuffer.ip2(1);
		waveBuffer.ip2(8);
		waveBuffer.p4(1684108385);
		waveBuffer.ip4(var3);
		waveBuffer.pos += var3;
		return waveBuffer;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int generate(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].start + this.tones[var3].length > var2) {
				var2 = this.tones[var3].start + this.tones[var3].length;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.loopBegin * 22050 / 1000;
		int var6 = this.loopEnd * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			waveBytes[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.tones[var9] != null) {
				int var15 = this.tones[var9].length * 22050 / 1000;
				int var16 = this.tones[var9].start * 22050 / 1000;
				int[] var17 = this.tones[var9].generate(var15, this.tones[var9].length);
				for (int var18 = 0; var18 < var15; var18++) {
					waveBytes[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var10 = var7 - var4;
			for (int var11 = var4 - 1; var11 >= var6; var11--) {
				waveBytes[var10 + var11] = waveBytes[var11];
			}
			for (int var12 = 1; var12 < arg0; var12++) {
				int var13 = (var6 - var5) * var12;
				for (int var14 = var5; var14 < var6; var14++) {
					waveBytes[var13 + var14] = waveBytes[var14];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
