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
	public static void unpack(Jagfile jag) {
		Packet data = new Packet(jag.read("varp.dat", null));

		field1158 = 0;
		count = data.g2();

		if (types == null) {
			types = new VarpType[count];
		}

		if (field1159 == null) {
			field1159 = new int[count];
		}

		for (int id = 0; id < count; id++) {
			if (types[id] == null) {
				types[id] = new VarpType();
			}

			types[id].decode(data, id);
		}

		if (data.pos != data.data.length) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(BLmb;I)V")
	public void decode(Packet buf, int id) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}

			if (code == 1) {
				this.field1161 = buf.g1();
			} else if (code == 2) {
				this.field1162 = buf.g1();
			} else if (code == 3) {
				this.field1163 = true;
				field1159[field1158++] = id;
			} else if (code == 4) {
				this.field1164 = false;
			} else if (code == 5) {
				this.clientcode = buf.g2();
			} else if (code == 6) {
				this.field1166 = true;
			} else if (code == 7) {
				this.field1167 = buf.g4();
			} else if (code == 8) {
				this.field1168 = true;
				this.field1169 = true;
			} else if (code == 10) {
				this.field1160 = buf.gjstr();
			} else if (code == 11) {
				this.field1169 = true;
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}
}
