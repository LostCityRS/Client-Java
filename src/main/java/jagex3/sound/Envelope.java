package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("vf")
public final class Envelope {

	@ObfuscatedName("vf.a")
	public int[] field4385 = new int[2];

	@ObfuscatedName("vf.b")
	public int field4386;

	@ObfuscatedName("vf.c")
	public int field4387;

	@ObfuscatedName("vf.d")
	public int field4388;

	@ObfuscatedName("vf.e")
	public int field4389 = 2;

	@ObfuscatedName("vf.f")
	public int[] field4390 = new int[2];

	@ObfuscatedName("vf.g")
	public int field4391;

	@ObfuscatedName("vf.h")
	public int field4392;

	@ObfuscatedName("vf.i")
	public int field4393;

	@ObfuscatedName("vf.j")
	public int field4394;

	@ObfuscatedName("vf.k")
	public int field4395;

	public Envelope() {
		this.field4390[0] = 0;
		this.field4390[1] = 65535;
		this.field4385[0] = 0;
		this.field4385[1] = 65535;
	}

	@ObfuscatedName("vf.a(I)I")
	public int method1560(int arg0) {
		if (this.field4393 >= this.field4392) {
			this.field4394 = this.field4385[this.field4395++] << 15;
			if (this.field4395 >= this.field4389) {
				this.field4395 = this.field4389 - 1;
			}
			this.field4392 = (int) ((double) this.field4390[this.field4395] / 65536.0D * (double) arg0);
			if (this.field4392 > this.field4393) {
				this.field4391 = ((this.field4385[this.field4395] << 15) - this.field4394) / (this.field4392 - this.field4393);
			}
		}
		this.field4394 += this.field4391;
		this.field4393++;
		return this.field4394 - this.field4391 >> 15;
	}

	@ObfuscatedName("vf.a()V")
	public void method1561() {
		this.field4392 = 0;
		this.field4395 = 0;
		this.field4391 = 0;
		this.field4394 = 0;
		this.field4393 = 0;
	}

	@ObfuscatedName("vf.a(Lea;)V")
	public void method1562(Packet arg0) {
		this.field4389 = arg0.g1();
		this.field4390 = new int[this.field4389];
		this.field4385 = new int[this.field4389];
		for (int var2 = 0; var2 < this.field4389; var2++) {
			this.field4390[var2] = arg0.g2();
			this.field4385[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("vf.b(Lea;)V")
	public void method1563(Packet arg0) {
		this.field4388 = arg0.g1();
		this.field4387 = arg0.g4();
		this.field4386 = arg0.g4();
		this.method1562(arg0);
	}
}
