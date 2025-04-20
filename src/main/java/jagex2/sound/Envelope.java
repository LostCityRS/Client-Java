package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Envelope {

	@ObfuscatedName("bc.a")
	public boolean field887 = true;

	@ObfuscatedName("bc.b")
	public int field888;

	@ObfuscatedName("bc.c")
	public int[] field889;

	@ObfuscatedName("bc.d")
	public int[] field890;

	@ObfuscatedName("bc.e")
	public int field891;

	@ObfuscatedName("bc.f")
	public int field892;

	@ObfuscatedName("bc.g")
	public int field893;

	@ObfuscatedName("bc.h")
	public int field894;

	@ObfuscatedName("bc.i")
	public int field895;

	@ObfuscatedName("bc.j")
	public int field896;

	@ObfuscatedName("bc.k")
	public int field897;

	@ObfuscatedName("bc.l")
	public int field898;

	@ObfuscatedName("bc.a(ILmb;)V")
	public final void method318(int arg0, Packet arg1) {
		if (arg0 <= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		this.field893 = arg1.g1();
		this.field891 = arg1.g4();
		this.field892 = arg1.g4();
		this.field888 = arg1.g1();
		this.field889 = new int[this.field888];
		this.field890 = new int[this.field888];
		for (int var4 = 0; var4 < this.field888; var4++) {
			this.field889[var4] = arg1.g2();
			this.field890[var4] = arg1.g2();
		}
	}

	@ObfuscatedName("bc.a(B)V")
	public final void method319(byte arg0) {
		this.field894 = 0;
		this.field895 = 0;
		this.field896 = 0;
		if (arg0 != 3) {
			this.field887 = !this.field887;
		}
		this.field897 = 0;
		this.field898 = 0;
	}

	@ObfuscatedName("bc.a(II)I")
	public final int method320(int arg0, int arg1) {
		if (this.field898 >= this.field894) {
			this.field897 = this.field890[this.field895++] << 15;
			if (this.field895 >= this.field888) {
				this.field895 = this.field888 - 1;
			}
			this.field894 = (int) ((double) this.field889[this.field895] / 65536.0D * (double) arg0);
			if (this.field894 > this.field898) {
				this.field896 = ((this.field890[this.field895] << 15) - this.field897) / (this.field894 - this.field898);
			}
		}
		this.field897 += this.field896;
		if (arg1 == 6) {
			this.field898++;
			return this.field897 - this.field896 >> 15;
		} else {
			return 2;
		}
	}
}
