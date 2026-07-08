package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public final class VarbitType {

	@ObfuscatedName("qc.a")
	public static final int field1186 = 810;

	@ObfuscatedName("qc.b")
	public static int field1187;

	@ObfuscatedName("qc.c")
	public static VarbitType[] list;

	@ObfuscatedName("qc.d")
	public String debugname;

	@ObfuscatedName("qc.e")
	public int basevar;

	@ObfuscatedName("qc.f")
	public int startbit;

	@ObfuscatedName("qc.g")
	public int endbit;

	@ObfuscatedName("qc.h")
	public boolean field1193 = false;

	@ObfuscatedName("qc.i")
	public int field1194 = -1;

	@ObfuscatedName("qc.j")
	public int field1195;

	@ObfuscatedName("qc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varbit.dat", null), 15787);
		field1187 = var1.g2();
		if (list == null) {
			list = new VarbitType[field1187];
		}
		for (int var2 = 0; var2 < field1187; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarbitType();
			}
			list[var2].decode(field1186, var2, var1);
			if (list[var2].field1193) {
				VarpType.list[list[var2].basevar].field1212 = true;
			}
		}
		if (var1.pos != var1.data.length) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(IILlb;)V")
	public void decode(int arg0, int arg1, Packet arg2) {
		while (true) {
			int var4 = arg2.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				basevar = arg2.g2();
				startbit = arg2.g1();
				endbit = arg2.g1();
			} else if (var4 == 10) {
				debugname = arg2.gstr();
			} else if (var4 == 2) {
				field1193 = true;
			} else if (var4 == 3) {
				field1194 = arg2.g4();
			} else if (var4 == 4) {
				field1195 = arg2.g4();
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}
}
