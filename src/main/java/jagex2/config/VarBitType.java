package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class VarBitType {

	@ObfuscatedName("qc.b")
	public static int count;

	@ObfuscatedName("qc.c")
	public static VarBitType[] list;

	@ObfuscatedName("qc.d")
	public String debugname;

	@ObfuscatedName("qc.e")
	public int basevar;

	@ObfuscatedName("qc.f")
	public int startbit;

	@ObfuscatedName("qc.g")
	public int endbit;

	@ObfuscatedName("qc.a(ZLyb;)V")
	public static void unpack(JagFile arg1) {
		Packet var2 = new Packet(arg1.read("varbit.dat", null));
		count = var2.g2();
		if (list == null) {
			list = new VarBitType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (list[var3] == null) {
				list[var3] = new VarBitType();
			}
			list[var3].decode(var3, var2);
		}
		if (var2.pos != var2.data.length) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(IILmb;)V")
	public void decode(int arg0, Packet arg2) {
		while (true) {
			int var5 = arg2.g1();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.basevar = arg2.g2();
				this.startbit = arg2.g1();
				this.endbit = arg2.g1();
			} else if (var5 == 10) {
				this.debugname = arg2.gstr();
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
