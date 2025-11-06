package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public class JagFile {

	@ObfuscatedName("yb.d")
	public byte[] field864;

	@ObfuscatedName("yb.e")
	public int field865;

	@ObfuscatedName("yb.f")
	public int[] field866;

	@ObfuscatedName("yb.g")
	public int[] field867;

	@ObfuscatedName("yb.h")
	public int[] field868;

	@ObfuscatedName("yb.i")
	public int[] field869;

	@ObfuscatedName("yb.j")
	public boolean field870;

	public JagFile(byte[] arg0) {
		this.method308(arg0);
	}

	@ObfuscatedName("yb.a([BZ)V")
	public void method308(byte[] arg0) {
		Packet var3 = new Packet(arg0);
		int var4 = var3.method243();
		int var5 = var3.method243();
		if (var5 == var4) {
			this.field864 = arg0;
			this.field870 = false;
		} else {
			byte[] var6 = new byte[var4];
			BZip2.method271(var6, var4, arg0, var5, 6);
			this.field864 = var6;
			var3 = new Packet(this.field864);
			this.field870 = true;
		}
		this.field865 = var3.method241();
		this.field866 = new int[this.field865];
		this.field867 = new int[this.field865];
		this.field868 = new int[this.field865];
		this.field869 = new int[this.field865];
		int var7 = var3.field711 + this.field865 * 10;
		for (int var8 = 0; var8 < this.field865; var8++) {
			this.field866[var8] = var3.method244();
			this.field867[var8] = var3.method243();
			this.field868[var8] = var3.method243();
			this.field869[var8] = var7;
			var7 += this.field868[var8];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] method309(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.field865; var6++) {
			if (this.field866[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.field867[var6]];
				}
				if (this.field870) {
					for (int var7 = 0; var7 < this.field867[var6]; var7++) {
						arg1[var7] = this.field864[this.field869[var6] + var7];
					}
				} else {
					BZip2.method271(arg1, this.field867[var6], this.field864, this.field868[var6], this.field869[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
