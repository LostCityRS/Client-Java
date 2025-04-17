package deob;

@ObfuscatedName("kc")
public class FloType {

	@ObfuscatedName("kc.a")
	public static int field1084 = 78;

	@ObfuscatedName("kc.b")
	public static int field1085;

	@ObfuscatedName("kc.c")
	public static FloType[] field1086;

	@ObfuscatedName("kc.d")
	public int field1087;

	@ObfuscatedName("kc.e")
	public int field1088 = -1;

	@ObfuscatedName("kc.f")
	public boolean field1089 = false;

	@ObfuscatedName("kc.g")
	public boolean field1090 = true;

	@ObfuscatedName("kc.h")
	public String field1091;

	@ObfuscatedName("kc.i")
	public int field1092;

	@ObfuscatedName("kc.j")
	public int field1093;

	@ObfuscatedName("kc.k")
	public int field1094;

	@ObfuscatedName("kc.l")
	public int field1095;

	@ObfuscatedName("kc.m")
	public int field1096;

	@ObfuscatedName("kc.n")
	public int field1097;

	@ObfuscatedName("kc.a(Lyb;B)V")
	public static void method371(Jagfile arg0, byte arg1) {
		Packet var2 = new Packet((byte) -109, arg0.method308("flo.dat", null));
		if (arg1 != 127) {
			field1084 = 231;
		}
		field1085 = var2.method240();
		if (field1086 == null) {
			field1086 = new FloType[field1085];
		}
		for (int var3 = 0; var3 < field1085; var3++) {
			if (field1086[var3] == null) {
				field1086[var3] = new FloType();
			}
			field1086[var3].method372(168, var2);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void method372(int arg0, Packet arg1) {
		int var3 = 90 / arg0;
		while (true) {
			int var4 = arg1.method238();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.field1087 = arg1.method242();
				this.method373(this.field1087, 48735);
			} else if (var4 == 2) {
				this.field1088 = arg1.method238();
			} else if (var4 == 3) {
				this.field1089 = true;
			} else if (var4 == 5) {
				this.field1090 = false;
			} else if (var4 == 6) {
				this.field1091 = arg1.method245();
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method373(int arg0, int arg1) {
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg0 & 0xFF) / 256.0D;
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
				var15 = (var11 - var9) / (var9 + var11);
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
		this.field1092 = (int) (var19 * 256.0D);
		this.field1093 = (int) (var15 * 256.0D);
		this.field1094 = (int) (var17 * 256.0D);
		if (this.field1093 < 0) {
			this.field1093 = 0;
		} else if (this.field1093 > 255) {
			this.field1093 = 255;
		}
		if (this.field1094 < 0) {
			this.field1094 = 0;
		} else if (this.field1094 > 255) {
			this.field1094 = 255;
		}
		if (var17 > 0.5D) {
			this.field1096 = (int) ((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field1096 = (int) (var15 * var17 * 512.0D);
		}
		if (this.field1096 < 1) {
			this.field1096 = 1;
		}
		this.field1095 = (int) ((double) this.field1096 * var19);
		int var21 = this.field1092 + (int) (Math.random() * 16.0D) - 8;
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		int var22 = this.field1093 + (int) (Math.random() * 48.0D) - 24;
		if (var22 < 0) {
			var22 = 0;
		} else if (var22 > 255) {
			var22 = 255;
		}
		int var23 = this.field1094 + (int) (Math.random() * 48.0D) - 24;
		if (var23 < 0) {
			var23 = 0;
		} else if (var23 > 255) {
			var23 = 255;
		}
		this.field1097 = this.method374(var21, var22, var23);
		if (arg1 == 48735) {
			;
		}
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method374(int arg0, int arg1, int arg2) {
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
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
