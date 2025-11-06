package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class VarBitType {

	@ObfuscatedName("qc.a")
	public static boolean field1145;

	@ObfuscatedName("qc.b")
	public static int field1146;

	@ObfuscatedName("qc.c")
	public static VarBitType[] field1147;

	@ObfuscatedName("qc.d")
	public String field1148;

	@ObfuscatedName("qc.e")
	public int field1149;

	@ObfuscatedName("qc.f")
	public int field1150;

	@ObfuscatedName("qc.g")
	public int field1151;

	@ObfuscatedName("qc.a(ZLyb;)V")
	public static void method389(boolean arg0, JagFile arg1) {
		if (!arg0) {
			field1145 = !field1145;
		}
		Packet var2 = new Packet(arg1.method309("varbit.dat", null), (byte) 3);
		field1146 = var2.method241();
		if (field1147 == null) {
			field1147 = new VarBitType[field1146];
		}
		for (int var3 = 0; var3 < field1146; var3++) {
			if (field1147[var3] == null) {
				field1147[var3] = new VarBitType();
			}
			field1147[var3].method390(var3, 890, var2);
		}
		if (var2.field711 != var2.field710.length) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(IILmb;)V")
	public void method390(int arg0, int arg1, Packet arg2) {
		int var4 = 26 / arg1;
		while (true) {
			int var5 = arg2.method239();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.field1149 = arg2.method241();
				this.field1150 = arg2.method239();
				this.field1151 = arg2.method239();
			} else if (var5 == 10) {
				this.field1148 = arg2.method246();
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
