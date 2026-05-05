package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("dd")
public final class JagFX {

	@ObfuscatedName("dd.a")
	public final Tone[] tones = new Tone[10];

	@ObfuscatedName("dd.b")
	public int loopBegin;

	@ObfuscatedName("dd.c")
	public int loopEnd;

	@ObfuscatedName("dd.a(Lnb;II)Ldd;")
	public static JagFX load(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg2, arg1);
		return var3 == null ? null : new JagFX(new Packet(var3));
	}

	public JagFX(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				this.tones[var2] = new Tone();
				this.tones[var2].load(arg0);
			}
		}
		this.loopBegin = arg0.g2();
		this.loopEnd = arg0.g2();
	}

	public JagFX() {
	}

	@ObfuscatedName("dd.a()I")
	public int optimiseStart() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.tones[var2] != null && this.tones[var2].start / 20 < var1) {
				var1 = this.tones[var2].start / 20;
			}
		}
		if (this.loopBegin < this.loopEnd && this.loopBegin / 20 < var1) {
			var1 = this.loopBegin / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.tones[var3] != null) {
				this.tones[var3].start -= var1 * 20;
			}
		}
		if (this.loopBegin < this.loopEnd) {
			this.loopBegin -= var1 * 20;
			this.loopEnd -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("dd.b()Ltf;")
	public Wave toWave() {
		byte[] var1 = this.makeSound();
		return new Wave(22050, var1, this.loopBegin * 22050 / 1000, this.loopEnd * 22050 / 1000);
	}

	@ObfuscatedName("dd.c()[B")
	public byte[] makeSound() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.tones[var2] != null && this.tones[var2].length + this.tones[var2].start > var1) {
				var1 = this.tones[var2].length + this.tones[var2].start;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.tones[var5] != null) {
				int var6 = this.tones[var5].length * 22050 / 1000;
				int var7 = this.tones[var5].start * 22050 / 1000;
				int[] var8 = this.tones[var5].generate(var6, this.tones[var5].length);
				for (int var9 = 0; var9 < var6; var9++) {
					int var10 = var4[var9 + var7] + (var8[var9] >> 8);
					if ((var10 + 128 & 0xFFFFFF00) != 0) {
						var10 = var10 >> 31 ^ 0x7F;
					}
					var4[var9 + var7] = (byte) var10;
				}
			}
		}
		return var4;
	}
}
