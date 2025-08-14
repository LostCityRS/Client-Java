package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

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
	public final void unpack(Packet buf) {
		this.form = buf.g1();
		this.start = buf.g4();
		this.end = buf.g4();

		// load points
		this.length = buf.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int i = 0; i < this.length; i++) {
			this.shapeDelta[i] = buf.g2();
			this.shapePeak[i] = buf.g2();
		}
	}

	@ObfuscatedName("bc.a(B)V")
	public final void genInit() {
		this.threshold = 0;
		this.position = 0;
		this.delta = 0;
		this.amplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int genNext(int delta) {
		if (this.ticks >= this.threshold) {
			this.amplitude = this.shapePeak[this.position++] << 15;
			if (this.position >= this.length) {
				this.position = this.length - 1;
			}

			this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) delta);
			if (this.threshold > this.ticks) {
				this.delta = ((this.shapePeak[this.position] << 15) - this.amplitude) / (this.threshold - this.ticks);
			}
		}

		this.amplitude += this.delta;
		this.ticks++;
		return this.amplitude - this.delta >> 15;
	}
}
