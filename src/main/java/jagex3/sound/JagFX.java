package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("me")
public final class JagFX {

	@ObfuscatedName("me.a")
	public final Tone[] field1904 = new Tone[10];

	@ObfuscatedName("me.b")
	public int field1905;

	@ObfuscatedName("me.c")
	public int field1906;

	@ObfuscatedName("me.a()[B")
	public byte[] method708() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field1904[var2] != null && this.field1904[var2].field3100 + this.field1904[var2].field3082 > var1) {
				var1 = this.field1904[var2].field3100 + this.field1904[var2].field3082;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.field1904[var5] != null) {
				int var6 = this.field1904[var5].field3100 * 22050 / 1000;
				int var7 = this.field1904[var5].field3082 * 22050 / 1000;
				int[] var8 = this.field1904[var5].method1006(var6, this.field1904[var5].field3100);
				for (int var9 = 0; var9 < var6; var9++) {
					int var10 = (var8[var9] >> 8) + var4[var7 + var9];
					if ((var10 + 128 & 0xFFFFFF00) != 0) {
						var10 = var10 >> 31 ^ 0x7F;
					}
					var4[var7 + var9] = (byte) var10;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("me.b()I")
	public int method709() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field1904[var2] != null && this.field1904[var2].field3082 / 20 < var1) {
				var1 = this.field1904[var2].field3082 / 20;
			}
		}
		if (this.field1905 < this.field1906 && this.field1905 / 20 < var1) {
			var1 = this.field1905 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field1904[var3] != null) {
				this.field1904[var3].field3082 -= var1 * 20;
			}
		}
		if (this.field1905 < this.field1906) {
			this.field1905 -= var1 * 20;
			this.field1906 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("me.c()Lwd;")
	public Wave method710() {
		byte[] var1 = this.method708();
		return new Wave(22050, var1, this.field1905 * 22050 / 1000, this.field1906 * 22050 / 1000);
	}

	public JagFX(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method144();
			if (var3 != 0) {
				arg0.pos--;
				this.field1904[var2] = new Tone();
				this.field1904[var2].method1003(arg0);
			}
		}
		this.field1905 = arg0.method145();
		this.field1906 = arg0.method145();
	}

	public JagFX() {
	}

	@ObfuscatedName("me.a(Lbd;II)Lme;")
	public static JagFX method711(Js5 arg0, int arg1) {
		byte[] var2 = arg0.method217(0, arg1);
		return var2 == null ? null : new JagFX(new Packet(var2));
	}
}
