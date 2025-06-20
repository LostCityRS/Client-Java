package jagex2.config;

import jagex2.io.Jagfile;
import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class VarpType {

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
	public static void unpack(Jagfile config) {
		Packet dat = new Packet(config.read("varp.dat", null));

		field1155 = 0;
		count = dat.g2();

		if (types == null) {
			types = new VarpType[count];
		}

		if (field1156 == null) {
			field1156 = new int[count];
		}

		for (int i = 0; i < count; i++) {
			if (types[i] == null) {
				types[i] = new VarpType();
			}

			types[i].decode(dat, i);
		}

		if (dat.data.length != dat.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(Lmb;II)V")
	public void decode(Packet buf, int id) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				this.field1158 = buf.g1();
			} else if (code == 2) {
				this.field1159 = buf.g1();
			} else if (code == 3) {
				this.field1160 = true;
				field1156[field1155++] = id;
			} else if (code == 4) {
				this.field1161 = false;
			} else if (code == 5) {
				this.clientcode = buf.g2();
			} else if (code == 6) {
				this.field1163 = true;
			} else if (code == 7) {
				this.field1164 = buf.g4();
			} else if (code == 8) {
				this.field1165 = true;
				this.field1166 = true;
			} else if (code == 10) {
				this.field1157 = buf.gjstr();
			} else if (code == 11) {
				this.field1166 = true;
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}
}
