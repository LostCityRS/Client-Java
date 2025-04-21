package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.a")
	public boolean field899 = true;

	@ObfuscatedName("cc.b")
	public int field900 = 826;

	@ObfuscatedName("cc.c")
	public boolean field901 = false;

	@ObfuscatedName("cc.d")
	public static Wave[] field902 = new Wave[1000];

	@ObfuscatedName("cc.e")
	public static int[] field903 = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] field904;

	@ObfuscatedName("cc.g")
	public static Packet field905;

	@ObfuscatedName("cc.h")
	public Tone[] field906 = new Tone[10];

	@ObfuscatedName("cc.i")
	public int field907;

	@ObfuscatedName("cc.j")
	public int field908;

	@ObfuscatedName("cc.a(Lmb;B)V")
	public static final void unpack(Packet arg0, byte arg1) {
		field904 = new byte[441000];
		if (arg1 != 127) {
			return;
		}
		field905 = new Packet((byte) -109, field904);
		Tone.method327();
		while (true) {
			int var2 = arg0.g2();
			if (var2 == 65535) {
				return;
			}
			field902[var2] = new Wave();
			field902[var2].method323(168, arg0);
			field903[var2] = field902[var2].method324(0);
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final Packet method322(int arg0, int arg1, int arg2) {
		if (arg2 <= 0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		if (field902[arg1] == null) {
			return null;
		} else {
			Wave var4 = field902[arg1];
			return var4.method325(arg0, (byte) -1);
		}
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void method323(int arg0, Packet arg1) {
		for (int var3 = 0; var3 < 10; var3++) {
			int var5 = arg1.g1();
			if (var5 != 0) {
				arg1.pos--;
				this.field906[var3] = new Tone();
				this.field906[var3].method330(168, arg1);
			}
		}
		this.field907 = arg1.g2();
		if (arg0 <= 0) {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		this.field908 = arg1.g2();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method324(int arg0) {
		int var2 = 9999999;
		if (arg0 != 0) {
			this.field901 = !this.field901;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field906[var3] != null && this.field906[var3].field925 / 20 < var2) {
				var2 = this.field906[var3].field925 / 20;
			}
		}
		if (this.field907 < this.field908 && this.field907 / 20 < var2) {
			var2 = this.field907 / 20;
		}
		if (var2 == 9999999 || var2 == 0) {
			return 0;
		}
		for (int var4 = 0; var4 < 10; var4++) {
			if (this.field906[var4] != null) {
				this.field906[var4].field925 -= var2 * 20;
			}
		}
		if (this.field907 < this.field908) {
			this.field907 -= var2 * 20;
			this.field908 -= var2 * 20;
		}
		return var2;
	}

	@ObfuscatedName("cc.a(IB)Lmb;")
	public final Packet method325(int arg0, byte arg1) {
		int var3 = this.method326(arg0);
		field905.pos = 0;
		field905.p4(1380533830);
		field905.ip4(this.field900, var3 + 36);
		field905.p4(1463899717);
		field905.p4(1718449184);
		field905.ip4(this.field900, 16);
		field905.ip2(1, this.field899);
		field905.ip2(1, this.field899);
		field905.ip4(this.field900, 22050);
		if (arg1 != -1) {
			this.field900 = 456;
		}
		field905.ip4(this.field900, 22050);
		field905.ip2(1, this.field899);
		field905.ip2(8, this.field899);
		field905.p4(1684108385);
		field905.ip4(this.field900, var3);
		field905.pos += var3;
		return field905;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int method326(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field906[var3] != null && this.field906[var3].field925 + this.field906[var3].field924 > var2) {
				var2 = this.field906[var3].field925 + this.field906[var3].field924;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.field907 * 22050 / 1000;
		int var6 = this.field908 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field904[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.field906[var9] != null) {
				int var15 = this.field906[var9].field924 * 22050 / 1000;
				int var16 = this.field906[var9].field925 * 22050 / 1000;
				int[] var17 = this.field906[var9].method328(var15, this.field906[var9].field924);
				for (int var18 = 0; var18 < var15; var18++) {
					field904[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var10 = var7 - var4;
			for (int var11 = var4 - 1; var11 >= var6; var11--) {
				field904[var10 + var11] = field904[var11];
			}
			for (int var12 = 1; var12 < arg0; var12++) {
				int var13 = (var6 - var5) * var12;
				for (int var14 = var5; var14 < var6; var14++) {
					field904[var13 + var14] = field904[var14];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
