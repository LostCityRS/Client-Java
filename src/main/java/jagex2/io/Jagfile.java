package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public class Jagfile {

	@ObfuscatedName("yb.a")
	public boolean field869 = false;

	@ObfuscatedName("yb.b")
	public int field870 = -119;

	@ObfuscatedName("yb.c")
	public boolean field871 = true;

	@ObfuscatedName("yb.d")
	public byte[] field872;

	@ObfuscatedName("yb.e")
	public int field873;

	@ObfuscatedName("yb.f")
	public int[] field874;

	@ObfuscatedName("yb.g")
	public int[] field875;

	@ObfuscatedName("yb.h")
	public int[] field876;

	@ObfuscatedName("yb.i")
	public int[] field877;

	@ObfuscatedName("yb.j")
	public boolean field878;

	public Jagfile(byte arg0, byte[] arg1) {
		if (arg0 != 5) {
			this.field869 = !this.field869;
		}
		this.method307(arg1, 0);
	}

	@ObfuscatedName("yb.a([BI)V")
	public void method307(byte[] arg0, int arg1) {
		if (arg1 != 0) {
			this.field871 = !this.field871;
		}
		Packet var3 = new Packet((byte) -109, arg0);
		int var4 = var3.g3();
		int var5 = var3.g3();
		if (var4 == var5) {
			this.field872 = arg0;
			this.field878 = false;
		} else {
			byte[] var6 = new byte[var4];
			BZip2.method270(var6, var4, arg0, var5, 6);
			this.field872 = var6;
			var3 = new Packet((byte) -109, this.field872);
			this.field878 = true;
		}
		this.field873 = var3.g2();
		this.field874 = new int[this.field873];
		this.field875 = new int[this.field873];
		this.field876 = new int[this.field873];
		this.field877 = new int[this.field873];
		int var7 = this.field873 * 10 + var3.pos;
		for (int var8 = 0; var8 < this.field873; var8++) {
			this.field874[var8] = var3.g4();
			this.field875[var8] = var3.g3();
			this.field876[var8] = var3.g3();
			this.field877[var8] = var7;
			var7 += this.field876[var8];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.field873; var6++) {
			if (this.field874[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.field875[var6]];
				}
				if (this.field878) {
					for (int var7 = 0; var7 < this.field875[var6]; var7++) {
						arg1[var7] = this.field872[this.field877[var6] + var7];
					}
				} else {
					BZip2.method270(arg1, this.field875[var6], this.field872, this.field876[var6], this.field877[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
