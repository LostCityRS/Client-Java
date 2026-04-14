package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;

@ObfuscatedName("c")
public final class Envelope {

	@ObfuscatedName("c.a")
	public int field438 = 2;

	@ObfuscatedName("c.b")
	public int[] field439 = new int[2];

	@ObfuscatedName("c.c")
	public int field440;

	@ObfuscatedName("c.d")
	public int field441;

	@ObfuscatedName("c.e")
	public int field442;

	@ObfuscatedName("c.f")
	public int[] field443 = new int[2];

	@ObfuscatedName("c.g")
	public int field444;

	@ObfuscatedName("c.h")
	public int field445;

	@ObfuscatedName("c.i")
	public int field446;

	@ObfuscatedName("c.j")
	public int field447;

	@ObfuscatedName("c.k")
	public int field448;

	@ObfuscatedName("c.a()V")
	public void method248() {
		this.field446 = 0;
		this.field447 = 0;
		this.field445 = 0;
		this.field448 = 0;
		this.field444 = 0;
	}

	@ObfuscatedName("c.a(Lba;)V")
	public void method249(Packet arg0) {
		this.field441 = arg0.g1();
		this.field440 = arg0.method167();
		this.field442 = arg0.method167();
		this.method250(arg0);
	}

	@ObfuscatedName("c.b(Lba;)V")
	public void method250(Packet arg0) {
		this.field438 = arg0.g1();
		this.field439 = new int[this.field438];
		this.field443 = new int[this.field438];
		for (int var2 = 0; var2 < this.field438; var2++) {
			this.field439[var2] = arg0.g2();
			this.field443[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("c.a(I)I")
	public int method251(int arg0) {
		if (this.field444 >= this.field446) {
			this.field448 = this.field443[this.field447++] << 15;
			if (this.field447 >= this.field438) {
				this.field447 = this.field438 - 1;
			}
			this.field446 = (int) ((double) this.field439[this.field447] / 65536.0D * (double) arg0);
			if (this.field446 > this.field444) {
				this.field445 = ((this.field443[this.field447] << 15) - this.field448) / (this.field446 - this.field444);
			}
		}
		this.field448 += this.field445;
		this.field444++;
		return this.field448 - this.field445 >> 15;
	}

	public Envelope() {
		this.field439[0] = 0;
		this.field439[1] = 65535;
		this.field443[0] = 0;
		this.field443[1] = 65535;
	}
}
