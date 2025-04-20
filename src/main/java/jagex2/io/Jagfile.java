package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public class Jagfile {

	@ObfuscatedName("yb.a")
	public boolean _flowObfuscator1 = false;

	@ObfuscatedName("yb.b")
	public int _flowObfuscator2 = -119;

	@ObfuscatedName("yb.c")
	public boolean _flowObfuscator3 = true;

	@ObfuscatedName("yb.d")
	public byte[] data;

	@ObfuscatedName("yb.e")
	public int fileCount;

	@ObfuscatedName("yb.f")
	public int[] fileHash;

	@ObfuscatedName("yb.g")
	public int[] fileUnpackedSize;

	@ObfuscatedName("yb.h")
	public int[] filePackedSize;

	@ObfuscatedName("yb.i")
	public int[] fileOffset;

	@ObfuscatedName("yb.j")
	public boolean unpacked;

	public Jagfile(byte arg0, byte[] arg1) {
		if (arg0 != 5) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		this.unpack(arg1, 0);
	}

	@ObfuscatedName("yb.a([BI)V")
	public void unpack(byte[] arg0, int arg1) {
		if (arg1 != 0) {
			this._flowObfuscator3 = !this._flowObfuscator3;
		}
		Packet var3 = new Packet((byte) -109, arg0);
		int var4 = var3.g3();
		int var5 = var3.g3();
		if (var4 == var5) {
			this.data = arg0;
			this.unpacked = false;
		} else {
			byte[] var6 = new byte[var4];
			BZip2.decompress(var6, var4, arg0, var5, 6);
			this.data = var6;
			var3 = new Packet((byte) -109, this.data);
			this.unpacked = true;
		}
		this.fileCount = var3.g2();
		this.fileHash = new int[this.fileCount];
		this.fileUnpackedSize = new int[this.fileCount];
		this.filePackedSize = new int[this.fileCount];
		this.fileOffset = new int[this.fileCount];
		int var7 = this.fileCount * 10 + var3.pos;
		for (int var8 = 0; var8 < this.fileCount; var8++) {
			this.fileHash[var8] = var3.g4();
			this.fileUnpackedSize[var8] = var3.g3();
			this.filePackedSize[var8] = var3.g3();
			this.fileOffset[var8] = var7;
			var7 += this.filePackedSize[var8];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.fileCount; var6++) {
			if (this.fileHash[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.fileUnpackedSize[var6]];
				}
				if (this.unpacked) {
					for (int var7 = 0; var7 < this.fileUnpackedSize[var6]; var7++) {
						arg1[var7] = this.data[this.fileOffset[var6] + var7];
					}
				} else {
					BZip2.decompress(arg1, this.fileUnpackedSize[var6], this.data, this.filePackedSize[var6], this.fileOffset[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
