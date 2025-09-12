package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class VarpType {

	@ObfuscatedName("pc.a")
	public static int count;

	@ObfuscatedName("pc.b")
	public static VarpType[] types;

	@ObfuscatedName("pc.c")
	public static int field1158;

	@ObfuscatedName("pc.d")
	public static int[] field1159;

	@ObfuscatedName("pc.e")
	public String field1160;

	@ObfuscatedName("pc.f")
	public int field1161;

	@ObfuscatedName("pc.g")
	public int field1162;

	@ObfuscatedName("pc.h")
	public boolean field1163 = false;

	@ObfuscatedName("pc.i")
	public boolean field1164 = true;

	@ObfuscatedName("pc.j")
	public int clientcode;

	@ObfuscatedName("pc.k")
	public boolean field1166 = false;

	@ObfuscatedName("pc.l")
	public int field1167;

	@ObfuscatedName("pc.m")
	public boolean field1168 = false;

	@ObfuscatedName("pc.n")
	public boolean field1169 = false;

	@ObfuscatedName("pc.a(ILyb;)V")
	public static void unpack(Jagfile arg1) {
		Packet var3 = new Packet(arg1.read("varp.dat", null));
		field1158 = 0;
		count = var3.g2();
		if (types == null) {
			types = new VarpType[count];
		}
		if (field1159 == null) {
			field1159 = new int[count];
		}
		for (int var4 = 0; var4 < count; var4++) {
			if (types[var4] == null) {
				types[var4] = new VarpType();
			}
			types[var4].decode(var3, var4);
		}
		if (var3.pos != var3.data.length) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(BLmb;I)V")
	public void decode(Packet arg1, int arg2) {
		while (true) {
			int var5 = arg1.g1();
			if (var5 == 0) {
				return;
			}
			if (var5 == 1) {
				this.field1161 = arg1.g1();
			} else if (var5 == 2) {
				this.field1162 = arg1.g1();
			} else if (var5 == 3) {
				this.field1163 = true;
				field1159[field1158++] = arg2;
			} else if (var5 == 4) {
				this.field1164 = false;
			} else if (var5 == 5) {
				this.clientcode = arg1.g2();
			} else if (var5 == 6) {
				this.field1166 = true;
			} else if (var5 == 7) {
				this.field1167 = arg1.g4();
			} else if (var5 == 8) {
				this.field1168 = true;
				this.field1169 = true;
			} else if (var5 == 10) {
				this.field1160 = arg1.gjstr();
			} else if (var5 == 11) {
				this.field1169 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var5);
			}
		}
	}
}
