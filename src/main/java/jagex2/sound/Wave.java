package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("cc")
public class Wave {

	@ObfuscatedName("cc.b")
	public static Wave[] field893 = new Wave[1000];

	@ObfuscatedName("cc.c")
	public static int[] field894 = new int[1000];

	@ObfuscatedName("cc.d")
	public static byte[] field895;

	@ObfuscatedName("cc.e")
	public static Packet field896;

	@ObfuscatedName("cc.f")
	public Tone[] field897 = new Tone[10];

	@ObfuscatedName("cc.g")
	public int field898;

	@ObfuscatedName("cc.h")
	public int field899;

	public Wave() {
	}

	@ObfuscatedName("cc.a(ZLmb;)V")
	public static final void method322(Packet arg1) {
		field895 = new byte[441000];
		field896 = new Packet(field895);
		Tone.method328();
		while (true) {
			int var2 = arg1.method241();
			if (var2 == 65535) {
				return;
			}
			field893[var2] = new Wave();
			field893[var2].method324(arg1);
			field894[var2] = field893[var2].method325();
		}
	}

	@ObfuscatedName("cc.a(IIB)Lmb;")
	public static final Packet method323(int arg0, int arg1) {
		if (field893[arg1] == null) {
			return null;
		} else {
			Wave var4 = field893[arg1];
			return var4.method326(arg0);
		}
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void method324(Packet arg1) {
		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = arg1.method239();
			if (var4 != 0) {
				arg1.field711--;
				this.field897[var3] = new Tone();
				this.field897[var3].method331(arg1);
			}
		}
		this.field898 = arg1.method241();
		this.field899 = arg1.method241();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method325() {
		int var2 = 9999999;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field897[var3] != null && this.field897[var3].field916 / 20 < var2) {
				var2 = this.field897[var3].field916 / 20;
			}
		}
		if (this.field898 < this.field899 && this.field898 / 20 < var2) {
			var2 = this.field898 / 20;
		}
		if (var2 == 9999999 || var2 == 0) {
			return 0;
		}
		for (int var4 = 0; var4 < 10; var4++) {
			if (this.field897[var4] != null) {
				this.field897[var4].field916 -= var2 * 20;
			}
		}
		if (this.field898 < this.field899) {
			this.field898 -= var2 * 20;
			this.field899 -= var2 * 20;
		}
		return var2;
	}

	@ObfuscatedName("cc.a(II)Lmb;")
	public final Packet method326(int arg1) {
		int var3 = this.method327(arg1);
		field896.field711 = 0;
		field896.method233(1380533830);
		field896.method234(var3 + 36);
		field896.method233(1463899717);
		field896.method233(1718449184);
		field896.method234(16);
		field896.method231(1);
		field896.method231(1);
		field896.method234(22050);
		field896.method234(22050);
		field896.method231(1);
		field896.method231(8);
		field896.method233(1684108385);
		field896.method234(var3);
		field896.field711 += var3;
		return field896;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int method327(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field897[var3] != null && this.field897[var3].field915 + this.field897[var3].field916 > var2) {
				var2 = this.field897[var3].field915 + this.field897[var3].field916;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.field898 * 22050 / 1000;
		int var6 = this.field899 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = var4 + (var6 - var5) * (arg0 - 1);
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field895[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.field897[var9] != null) {
				int var10 = this.field897[var9].field915 * 22050 / 1000;
				int var11 = this.field897[var9].field916 * 22050 / 1000;
				int[] var12 = this.field897[var9].method329(var10, this.field897[var9].field915);
				for (int var13 = 0; var13 < var10; var13++) {
					field895[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field895[var15 + var14] = field895[var15];
			}
			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field895[var18 + var17] = field895[var18];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
