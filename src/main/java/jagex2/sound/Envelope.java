package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

	@ObfuscatedName("bc.c")
	public int field881;

	@ObfuscatedName("bc.d")
	public int[] field882;

	@ObfuscatedName("bc.e")
	public int[] field883;

	@ObfuscatedName("bc.f")
	public int field884;

	@ObfuscatedName("bc.g")
	public int field885;

	@ObfuscatedName("bc.h")
	public int field886;

	@ObfuscatedName("bc.i")
	public int field887;

	@ObfuscatedName("bc.j")
	public int field888;

	@ObfuscatedName("bc.k")
	public int field889;

	@ObfuscatedName("bc.l")
	public int field890;

	@ObfuscatedName("bc.m")
	public int field891;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void method319(Packet arg1) {
		this.field886 = arg1.method239();
		this.field884 = arg1.method244();
		this.field885 = arg1.method244();
		this.field881 = arg1.method239();
		this.field882 = new int[this.field881];
		this.field883 = new int[this.field881];
		for (int var3 = 0; var3 < this.field881; var3++) {
			this.field882[var3] = arg1.method241();
			this.field883[var3] = arg1.method241();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public final void method320() {
		this.field887 = 0;
		this.field888 = 0;
		this.field889 = 0;
		this.field890 = 0;
		this.field891 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method321(int arg0) {
		if (this.field891 >= this.field887) {
			this.field890 = this.field883[this.field888++] << 15;
			if (this.field888 >= this.field881) {
				this.field888 = this.field881 - 1;
			}
			this.field887 = (int) ((double) this.field882[this.field888] / 65536.0D * (double) arg0);
			if (this.field887 > this.field891) {
				this.field889 = ((this.field883[this.field888] << 15) - this.field890) / (this.field887 - this.field891);
			}
		}
		this.field890 += this.field889;
		this.field891++;
		return this.field890 - this.field889 >> 15;
	}
}
