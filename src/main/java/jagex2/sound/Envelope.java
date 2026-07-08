package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("ac")
public final class Envelope {

	@ObfuscatedName("ac.b")
	public int length;

	@ObfuscatedName("ac.c")
	public int[] shapeDelta;

	@ObfuscatedName("ac.d")
	public int[] shapePeak;

	@ObfuscatedName("ac.e")
	public int start;

	@ObfuscatedName("ac.f")
	public int end;

	@ObfuscatedName("ac.g")
	public int form;

	@ObfuscatedName("ac.h")
	public int threshold;

	@ObfuscatedName("ac.i")
	public int position;

	@ObfuscatedName("ac.j")
	public int delta;

	@ObfuscatedName("ac.k")
	public int amplitude;

	@ObfuscatedName("ac.l")
	public int ticks;

	@ObfuscatedName("ac.a")
	public final boolean field885 = false;

	@ObfuscatedName("ac.a(ZLlb;)V")
	public void load(Packet arg0) {
		form = arg0.g1();
		start = arg0.g4();
		end = arg0.g4();
		loadPoints(arg0);
	}

	@ObfuscatedName("ac.a(ILlb;)V")
	public void loadPoints(Packet arg0) {
		length = arg0.g1();
		shapeDelta = new int[length];
		shapePeak = new int[length];
		for (int var2 = 0; var2 < length; var2++) {
			shapeDelta[var2] = arg0.g2();
			shapePeak[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public void genInit() {
		threshold = 0;
		position = 0;
		delta = 0;
		amplitude = 0;
		ticks = 0;
	}

	@ObfuscatedName("ac.a(II)I")
	public int genNext(int arg0) {
		if (ticks >= threshold) {
			amplitude = shapePeak[position++] << 15;
			if (position >= length) {
				position = length - 1;
			}
			threshold = (int) ((double) shapeDelta[position] / 65536.0D * (double) arg0);
			if (threshold > ticks) {
				delta = ((shapePeak[position] << 15) - amplitude) / (threshold - ticks);
			}
		}
		amplitude += delta;
		ticks++;
		return amplitude - delta >> 15;
	}
}
