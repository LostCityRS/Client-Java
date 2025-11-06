package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("kc")
public class FloType {

	@ObfuscatedName("kc.a")
	public static int field1076;

	@ObfuscatedName("kc.b")
	public static FloType[] field1077;

	@ObfuscatedName("kc.c")
	public int field1078;

	@ObfuscatedName("kc.d")
	public int field1079 = -1;

	@ObfuscatedName("kc.e")
	public boolean field1080 = false;

	@ObfuscatedName("kc.f")
	public boolean field1081 = true;

	@ObfuscatedName("kc.g")
	public String field1082;

	@ObfuscatedName("kc.h")
	public int field1083;

	@ObfuscatedName("kc.i")
	public int field1084;

	@ObfuscatedName("kc.j")
	public int field1085;

	@ObfuscatedName("kc.k")
	public int field1086;

	@ObfuscatedName("kc.l")
	public int field1087;

	@ObfuscatedName("kc.m")
	public int field1088;

	@ObfuscatedName("kc.a(ZLyb;)V")
	public static void method373(boolean arg0, JagFile arg1) {
		if (!arg0) {
			return;
		}
		Packet var2 = new Packet(arg1.method309("flo.dat", null), (byte) 3);
		field1076 = var2.method241();
		if (field1077 == null) {
			field1077 = new FloType[field1076];
		}
		for (int var3 = 0; var3 < field1076; var3++) {
			if (field1077[var3] == null) {
				field1077[var3] = new FloType();
			}
			field1077[var3].method374(9, var2);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void method374(int arg0, Packet arg1) {
		if (arg0 != 9) {
			throw new NullPointerException();
		}
		while (true) {
			int var3 = arg1.method239();
			if (var3 == 0) {
				return;
			}
			if (var3 == 1) {
				this.field1078 = arg1.method243();
				this.method375(-2048, this.field1078);
			} else if (var3 == 2) {
				this.field1079 = arg1.method239();
			} else if (var3 == 3) {
				this.field1080 = true;
			} else if (var3 == 5) {
				this.field1081 = false;
			} else if (var3 == 6) {
				this.field1082 = arg1.method246();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method375(int arg0, int arg1) {
		double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg1 & 0xFF) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}
		if (var7 < var9) {
			var9 = var7;
		}
		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}
		if (var7 > var11) {
			var11 = var7;
		}
		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var11 + var9);
			}
			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}
			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var7 == var11) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}
		double var19 = var13 / 6.0D;
		this.field1083 = (int) (var19 * 256.0D);
		this.field1084 = (int) (var15 * 256.0D);
		this.field1085 = (int) (var17 * 256.0D);
		if (this.field1084 < 0) {
			this.field1084 = 0;
		} else if (this.field1084 > 255) {
			this.field1084 = 255;
		}
		if (this.field1085 < 0) {
			this.field1085 = 0;
		} else if (this.field1085 > 255) {
			this.field1085 = 255;
		}
		if (var17 > 0.5D) {
			this.field1087 = (int) ((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field1087 = (int) (var17 * var15 * 512.0D);
		}
		if (this.field1087 < 1) {
			this.field1087 = 1;
		}
		this.field1086 = (int) (var19 * (double) this.field1087);
		int var21 = this.field1083 + (int) (Math.random() * 16.0D) - 8;
		if (arg0 != -2048) {
			return;
		}
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		int var22 = this.field1084 + (int) (Math.random() * 48.0D) - 24;
		if (var22 < 0) {
			var22 = 0;
		} else if (var22 > 255) {
			var22 = 255;
		}
		int var23 = this.field1085 + (int) (Math.random() * 48.0D) - 24;
		if (var23 < 0) {
			var23 = 0;
		} else if (var23 > 255) {
			var23 = 255;
		}
		this.field1088 = this.method376(var21, var22, var23);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method376(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
