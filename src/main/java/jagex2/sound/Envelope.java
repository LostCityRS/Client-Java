package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

	@ObfuscatedName("bc.c")
	public int length;

	@ObfuscatedName("bc.d")
	public int[] shapeDelta;

	@ObfuscatedName("bc.e")
	public int[] shapePeak;

	@ObfuscatedName("bc.f")
	public int start;

	@ObfuscatedName("bc.g")
	public int end;

	@ObfuscatedName("bc.h")
	public int form;

	@ObfuscatedName("bc.i")
	public int threshold;

	@ObfuscatedName("bc.j")
	public int position;

	@ObfuscatedName("bc.k")
	public int delta;

	@ObfuscatedName("bc.l")
	public int amplitude;

	@ObfuscatedName("bc.m")
	public int ticks;

	@ObfuscatedName("bc.a(ILmb;)V")
	public void unpack(Packet arg1) {
		this.form = arg1.g1();
		this.start = arg1.g4();
		this.end = arg1.g4();
		this.length = arg1.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int var3 = 0; var3 < this.length; var3++) {
			this.shapeDelta[var3] = arg1.g2();
			this.shapePeak[var3] = arg1.g2();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public void genInit() {
		this.threshold = 0;
		this.position = 0;
		this.delta = 0;
		this.amplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public int genNext(int arg0) {
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
		this.ticks++;
		return this.amplitude - this.delta >> 15;
	}
}
