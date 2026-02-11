package jagex3.sound;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.js5.Js5;

@ObfuscatedName("re")
public final class JagFX {

	@ObfuscatedName("re.a")
	public int field2879;

	@ObfuscatedName("re.b")
	public int field2880;

	@ObfuscatedName("re.c")
	public final Tone[] field2881 = new Tone[10];

	@ObfuscatedName("re.a(Lea;II)Lre;")
	public static JagFX load(Js5 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.getFile(arg1, arg2);
		return var3 == null ? null : new JagFX(new Packet(var3));
	}

	public JagFX(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				this.field2881[var2] = new Tone();
				this.field2881[var2].method169(arg0);
			}
		}
		this.field2879 = arg0.g2();
		this.field2880 = arg0.g2();
	}

	public JagFX() {
	}

	@ObfuscatedName("re.a()I")
	public int optimiseStart() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field2881[var2] != null && this.field2881[var2].field434 / 20 < var1) {
				var1 = this.field2881[var2].field434 / 20;
			}
		}
		if (this.field2879 < this.field2880 && this.field2879 / 20 < var1) {
			var1 = this.field2879 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field2881[var3] != null) {
				this.field2881[var3].field434 -= var1 * 20;
			}
		}
		if (this.field2879 < this.field2880) {
			this.field2879 -= var1 * 20;
			this.field2880 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("re.b()[B")
	public byte[] method970() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field2881[var2] != null && this.field2881[var2].field447 + this.field2881[var2].field434 > var1) {
				var1 = this.field2881[var2].field447 + this.field2881[var2].field434;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.field2881[var5] != null) {
				int var6 = this.field2881[var5].field447 * 22050 / 1000;
				int var7 = this.field2881[var5].field434 * 22050 / 1000;
				int[] var8 = this.field2881[var5].method170(var6, this.field2881[var5].field447);
				for (int var9 = 0; var9 < var6; var9++) {
					int var10 = var4[var9 + var7] + (var8[var9] >> 8);
					if ((var10 + 128 & 0xFFFFFF00) != 0) {
						var10 = var10 >> 31 ^ 0x7F;
					}
					var4[var9 + var7] = (byte) var10;
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("re.c()Lib;")
	public Wave toWave() {
		byte[] var1 = this.method970();
		return new Wave(22050, var1, this.field2879 * 22050 / 1000, this.field2880 * 22050 / 1000);
	}
}
