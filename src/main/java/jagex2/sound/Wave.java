package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.c")
	public static Wave[] tracks = new Wave[1000];

	@ObfuscatedName("cc.d")
	public static int[] delay = new int[1000];

	@ObfuscatedName("cc.e")
	public static byte[] waveBytes;

	@ObfuscatedName("cc.f")
	public static Packet waveBuffer;

	@ObfuscatedName("cc.g")
	public Tone[] tones = new Tone[10];

	@ObfuscatedName("cc.h")
	public int loopBegin;

	@ObfuscatedName("cc.i")
	public int loopEnd;

	@ObfuscatedName("cc.a(ILmb;)V")
	public static final void unpack(Packet arg1) {
		waveBytes = new byte[441000];
		waveBuffer = new Packet(waveBytes);
		Tone.init();
		while (true) {
			int var2 = arg1.g2();
			if (var2 == 65535) {
				return;
			}
			tracks[var2] = new Wave();
			tracks[var2].read(arg1);
			delay[var2] = tracks[var2].trim();
		}
	}

	@ObfuscatedName("cc.a(IIZ)Lmb;")
	public static final Packet generate(int arg0, int arg1) {
		if (tracks[arg0] == null) {
			return null;
		} else {
			Wave var3 = tracks[arg0];
			return var3.getWave(arg1);
		}
	}

	@ObfuscatedName("cc.a(ZLmb;)V")
	public final void read(Packet arg1) {
		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = arg1.g1();
			if (var4 != 0) {
				arg1.pos--;
				this.tones[var3] = new Tone();
				this.tones[var3].unpack(arg1);
			}
		}
		this.loopBegin = arg1.g2();
		this.loopEnd = arg1.g2();
	}

	@ObfuscatedName("cc.a(Z)I")
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

	@ObfuscatedName("cc.a(II)Lmb;")
	public final Packet getWave(int arg1) {
		int var3 = this.generate(arg1);
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

	@ObfuscatedName("cc.a(I)I")
	public final int generate(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null && this.tones[var3].length + this.tones[var3].start > var2) {
				var2 = this.tones[var3].length + this.tones[var3].start;
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
		int var7 = var4 + (var6 - var5) * (arg0 - 1);
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			waveBytes[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.tones[var9] != null) {
				int var10 = this.tones[var9].length * 22050 / 1000;
				int var11 = this.tones[var9].start * 22050 / 1000;
				int[] var12 = this.tones[var9].generate(var10, this.tones[var9].length);
				for (int var13 = 0; var13 < var10; var13++) {
					waveBytes[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				waveBytes[var15 + var14] = waveBytes[var15];
			}
			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					waveBytes[var18 + var17] = waveBytes[var18];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
