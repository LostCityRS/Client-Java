package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("rc")
public class VarpType {

	@ObfuscatedName("rc.b")
	public static int count;

	@ObfuscatedName("rc.c")
	public static VarpType[] list;

	@ObfuscatedName("rc.d")
	public static int field1155;

	@ObfuscatedName("rc.e")
	public static int[] field1156;

	@ObfuscatedName("rc.f")
	public String debugname;

	@ObfuscatedName("rc.g")
	public int field1158;

	@ObfuscatedName("rc.h")
	public int field1159;

	@ObfuscatedName("rc.i")
	public boolean field1160 = false;

	@ObfuscatedName("rc.j")
	public boolean field1161 = true;

	@ObfuscatedName("rc.k")
	public int clientcode;

	@ObfuscatedName("rc.l")
	public boolean field1163 = false;

	@ObfuscatedName("rc.m")
	public int field1164;

	@ObfuscatedName("rc.n")
	public boolean field1165 = false;

	@ObfuscatedName("rc.o")
	public boolean field1166 = false;

	@ObfuscatedName("rc.a(ZLyb;)V")
	public static void unpack(JagFile arg1) {
		Packet var2 = new Packet(arg1.read("varp.dat", null));
		field1155 = 0;
		count = var2.g2();
		if (list == null) {
			list = new VarpType[count];
		}
		if (field1156 == null) {
			field1156 = new int[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (list[var3] == null) {
				list[var3] = new VarpType();
			}
			list[var3].decode(var3, var2);
		}
		if (var2.pos != var2.data.length) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(IILmb;)V")
	public void decode(int arg0, Packet arg2) {
		while (true) {
			int var5 = arg2.g1();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.field1158 = arg2.g1();
			} else if (var5 == 2) {
				this.field1159 = arg2.g1();
			} else if (var5 == 3) {
				this.field1160 = true;
				field1156[field1155++] = arg0;
			} else if (var5 == 4) {
				this.field1161 = false;
			} else if (var5 == 5) {
				this.clientcode = arg2.g2();
			} else if (var5 == 6) {
				this.field1163 = true;
			} else if (var5 == 7) {
				this.field1164 = arg2.g4();
			} else if (var5 == 8) {
				this.field1165 = true;
				this.field1166 = true;
			} else if (var5 == 10) {
				this.debugname = arg2.gstr();
			} else if (var5 == 11) {
				this.field1166 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
