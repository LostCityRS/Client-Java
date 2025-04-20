package jagex2.config;

import jagex2.io.Jagfile;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class VarpType {

	@ObfuscatedName("pc.a")
	public int _flowObfuscator1 = 439;

	@ObfuscatedName("pc.b")
	public static int count;

	@ObfuscatedName("pc.c")
	public static VarpType[] types;

	@ObfuscatedName("pc.d")
	public static int field1155;

	@ObfuscatedName("pc.e")
	public static int[] field1156;

	@ObfuscatedName("pc.f")
	public String field1157;

	@ObfuscatedName("pc.g")
	public int field1158;

	@ObfuscatedName("pc.h")
	public int field1159;

	@ObfuscatedName("pc.i")
	public boolean field1160 = false;

	@ObfuscatedName("pc.j")
	public boolean field1161 = true;

	@ObfuscatedName("pc.k")
	public int clientcode;

	@ObfuscatedName("pc.l")
	public boolean field1163 = false;

	@ObfuscatedName("pc.m")
	public int field1164;

	@ObfuscatedName("pc.n")
	public boolean field1165 = false;

	@ObfuscatedName("pc.o")
	public boolean field1166 = false;

	@ObfuscatedName("pc.a(Lyb;B)V")
	public static void unpack(Jagfile arg0, byte arg1) {
		if (arg1 != 127) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		Packet var3 = new Packet((byte) -109, arg0.read("varp.dat", null));
		field1155 = 0;
		count = var3.g2();
		if (types == null) {
			types = new VarpType[count];
		}
		if (field1156 == null) {
			field1156 = new int[count];
		}
		for (int var4 = 0; var4 < count; var4++) {
			if (types[var4] == null) {
				types[var4] = new VarpType();
			}
			types[var4].decode(var3, var4, 439);
		}
		if (var3.data.length != var3.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(Lmb;II)V")
	public void decode(Packet arg0, int arg1, int arg2) {
		if (arg2 <= 0) {
			return;
		}
		while (true) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.field1158 = arg0.g1();
			} else if (var4 == 2) {
				this.field1159 = arg0.g1();
			} else if (var4 == 3) {
				this.field1160 = true;
				field1156[field1155++] = arg1;
			} else if (var4 == 4) {
				this.field1161 = false;
			} else if (var4 == 5) {
				this.clientcode = arg0.g2();
			} else if (var4 == 6) {
				this.field1163 = true;
			} else if (var4 == 7) {
				this.field1164 = arg0.g4();
			} else if (var4 == 8) {
				this.field1165 = true;
				this.field1166 = true;
			} else if (var4 == 10) {
				this.field1157 = arg0.gjstr();
			} else if (var4 == 11) {
				this.field1166 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}
}
