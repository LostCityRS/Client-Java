package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public class Jagfile {

	@ObfuscatedName("yb.e")
	public byte[] data;

	@ObfuscatedName("yb.f")
	public int fileCount;

	@ObfuscatedName("yb.g")
	public int[] fileHash;

	@ObfuscatedName("yb.h")
	public int[] fileUnpackedSize;

	@ObfuscatedName("yb.i")
	public int[] filePackedSize;

	@ObfuscatedName("yb.j")
	public int[] fileOffset;

	@ObfuscatedName("yb.k")
	public boolean unpacked;

	public Jagfile(byte[] arg1) {
		this.unpack(arg1);
	}

	@ObfuscatedName("yb.a([BB)V")
	public void unpack(byte[] arg0) {
		Packet var3 = new Packet(arg0);
		int var4 = var3.g3();
		int var6 = var3.g3();
		if (var6 == var4) {
			this.data = arg0;
			this.unpacked = false;
		} else {
			byte[] var7 = new byte[var4];
			BZip2.decompress(var7, var4, arg0, var6, 6);
			this.data = var7;
			var3 = new Packet(this.data);
			this.unpacked = true;
		}
		this.fileCount = var3.g2();
		this.fileHash = new int[this.fileCount];
		this.fileUnpackedSize = new int[this.fileCount];
		this.filePackedSize = new int[this.fileCount];
		this.fileOffset = new int[this.fileCount];
		int var8 = var3.pos + this.fileCount * 10;
		for (int var9 = 0; var9 < this.fileCount; var9++) {
			this.fileHash[var9] = var3.g4();
			this.fileUnpackedSize[var9] = var3.g3();
			this.filePackedSize[var9] = var3.g3();
			this.fileOffset[var9] = var8;
			var8 += this.filePackedSize[var9];
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
