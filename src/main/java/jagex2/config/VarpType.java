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
	public static int code3count;

	@ObfuscatedName("pc.e")
	public static int[] code3s;

	@ObfuscatedName("pc.f")
	public String code10;

	@ObfuscatedName("pc.g")
	public int code1;

	@ObfuscatedName("pc.h")
	public int code2;

	@ObfuscatedName("pc.i")
	public boolean code3 = false;

	@ObfuscatedName("pc.j")
	public boolean code4 = true;

	@ObfuscatedName("pc.k")
	public int clientcode;

	@ObfuscatedName("pc.l")
	public boolean code6 = false;

	@ObfuscatedName("pc.m")
	public int code7;

	@ObfuscatedName("pc.n")
	public boolean code8 = false;

	@ObfuscatedName("pc.o")
	public boolean code11 = false;

	@ObfuscatedName("pc.a(Lyb;B)V")
	public static void unpack(Jagfile config) {
		Packet dat = new Packet(config.read("varp.dat", null));

		code3count = 0;
		count = dat.g2();

		if (types == null) {
			types = new VarpType[count];
		}

		if (code3s == null) {
			code3s = new int[count];
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
				this.code1 = buf.g1();
			} else if (code == 2) {
				this.code2 = buf.g1();
			} else if (code == 3) {
				this.code3 = true;
				code3s[code3count++] = id;
			} else if (code == 4) {
				this.code4 = false;
			} else if (code == 5) {
				this.clientcode = buf.g2();
			} else if (code == 6) {
				this.code6 = true;
			} else if (code == 7) {
				this.code7 = buf.g4();
			} else if (code == 8) {
				this.code8 = true;
				this.code11 = true;
			} else if (code == 10) {
				this.code10 = buf.gjstr();
			} else if (code == 11) {
				this.code11 = true;
			} else {
				System.out.println("Error unrecognised config code: " + code);
			}
		}
	}
}
