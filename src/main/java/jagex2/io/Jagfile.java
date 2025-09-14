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

	public Jagfile(byte[] src) {
		this.unpack(src);
	}

	@ObfuscatedName("yb.a([BB)V")
	public void unpack(byte[] src) {
		Packet buf = new Packet(src);
		int packedSize = buf.g3();
		int unpackedSize = buf.g3();

		if (unpackedSize == packedSize) {
			this.data = src;
			this.unpacked = false;
		} else {
			byte[] temp = new byte[packedSize];
			BZip2.decompress(temp, packedSize, src, unpackedSize, 6);
			this.data = temp;

			buf = new Packet(this.data);
			this.unpacked = true;
		}

		this.fileCount = buf.g2();
		this.fileHash = new int[this.fileCount];
		this.fileUnpackedSize = new int[this.fileCount];
		this.filePackedSize = new int[this.fileCount];
		this.fileOffset = new int[this.fileCount];

		int pos = buf.pos + this.fileCount * 10;
		for (int i = 0; i < this.fileCount; i++) {
			this.fileHash[i] = buf.g4();
			this.fileUnpackedSize[i] = buf.g3();
			this.filePackedSize[i] = buf.g3();
			this.fileOffset[i] = pos;
			pos += this.filePackedSize[i];
		}
	}

	@ObfuscatedName("yb.a(Ljava/lang/String;[B)[B")
	public byte[] read(String name, byte[] dst) {
		int hash = 0;
		String upper = name.toUpperCase();
		for (int i = 0; i < upper.length(); i++) {
			hash = hash * 61 + upper.charAt(i) - 32;
		}

		for (int i = 0; i < this.fileCount; i++) {
			if (this.fileHash[i] == hash) {
				if (dst == null) {
					dst = new byte[this.fileUnpackedSize[i]];
				}

				if (this.unpacked) {
					for (int j = 0; j < this.fileUnpackedSize[i]; j++) {
						dst[j] = this.data[this.fileOffset[i] + j];
					}
				} else {
					BZip2.decompress(dst, this.fileUnpackedSize[i], this.data, this.filePackedSize[i], this.fileOffset[i]);
				}

				return dst;
			}
		}

		return null;
	}
}
