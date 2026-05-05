package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("vf")
public final class Envelope {

	@ObfuscatedName("vf.a")
	public int[] shapePeak = new int[2];

	@ObfuscatedName("vf.b")
	public int end;

	@ObfuscatedName("vf.c")
	public int start;

	@ObfuscatedName("vf.d")
	public int form;

	@ObfuscatedName("vf.e")
	public int length = 2;

	@ObfuscatedName("vf.f")
	public int[] shapeDelta = new int[2];

	@ObfuscatedName("vf.g")
	public int delta;

	@ObfuscatedName("vf.h")
	public int threshold;

	@ObfuscatedName("vf.i")
	public int ticks;

	@ObfuscatedName("vf.j")
	public int amplitude;

	@ObfuscatedName("vf.k")
	public int position;

	public Envelope() {
		this.shapeDelta[0] = 0;
		this.shapeDelta[1] = 65535;
		this.shapePeak[0] = 0;
		this.shapePeak[1] = 65535;
	}

	@ObfuscatedName("vf.a(I)I")
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

	@ObfuscatedName("vf.a()V")
	public void genInit() {
		this.threshold = 0;
		this.position = 0;
		this.delta = 0;
		this.amplitude = 0;
		this.ticks = 0;
	}

	@ObfuscatedName("vf.a(Lea;)V")
	public void loadPoints(Packet arg0) {
		this.length = arg0.g1();
		this.shapeDelta = new int[this.length];
		this.shapePeak = new int[this.length];
		for (int var2 = 0; var2 < this.length; var2++) {
			this.shapeDelta[var2] = arg0.g2();
			this.shapePeak[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("vf.b(Lea;)V")
	public void load(Packet arg0) {
		this.form = arg0.g1();
		this.start = arg0.g4();
		this.end = arg0.g4();
		this.loadPoints(arg0);
	}
}
