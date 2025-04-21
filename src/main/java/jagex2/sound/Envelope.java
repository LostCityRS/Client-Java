package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

	@ObfuscatedName("bc.a")
	public boolean field887 = true;

	@ObfuscatedName("bc.b")
	public int length;

	@ObfuscatedName("bc.c")
	public int[] shapeDelta;

	@ObfuscatedName("bc.d")
	public int[] shapePeak;

	@ObfuscatedName("bc.e")
	public int start;

	@ObfuscatedName("bc.f")
	public int end;

	@ObfuscatedName("bc.g")
	public int form;

	@ObfuscatedName("bc.h")
	public int threshold;

	@ObfuscatedName("bc.i")
	public int position;

	@ObfuscatedName("bc.j")
	public int delta;

	@ObfuscatedName("bc.k")
	public int amplitude;

	@ObfuscatedName("bc.l")
	public int ticks;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void unpack(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.form = arg1.g1();
		this.start = arg1.g4();
		this.end = arg1.g4();
		this.length = arg1.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int var4 = 0; var4 < this.length; var4++) {
			this.shapeDelta[var4] = arg1.g2();
			this.shapePeak[var4] = arg1.g2();
		}
	}

	@ObfuscatedName("bc.a(B)V")
	public final void reset(byte arg0) {
		this.threshold = 0;
		this.position = 0;
		this.delta = 0;
		if (arg0 != 3) {
			this.field887 = !this.field887;
		}
		this.amplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int evaluate(int arg0, int arg1) {
		if (this.ticks >= this.threshold) {
			this.amplitude = this.shapePeak[this.position++] << 15;
			if (this.position >= this.length) {
				this.position = this.length - 1;
			}
			this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) arg0);
			if (this.threshold > this.ticks) {
				this.delta = ((this.shapePeak[this.position] << 15) - this.amplitude) / (this.threshold - this.ticks);
			}
		}
		this.amplitude += this.delta;
		if (arg1 == 6) {
			this.ticks++;
			return this.amplitude - this.delta >> 15;
		} else {
			return 2;
		}
	}
}
