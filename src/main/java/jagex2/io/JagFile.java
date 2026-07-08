package jagex2.io;

import deob.ObfuscatedName;

@ObfuscatedName("xb")
public final class JagFile {

	@ObfuscatedName("xb.a")
	public final int field862 = -550;

	@ObfuscatedName("xb.b")
	public final int field863 = 30967;

	@ObfuscatedName("xb.c")
	public byte[] data;

	@ObfuscatedName("xb.d")
	public int fileCount;

	@ObfuscatedName("xb.e")
	public int[] fileHash;

	@ObfuscatedName("xb.f")
	public int[] fileUnpackedSize;

	@ObfuscatedName("xb.g")
	public int[] filePackedSize;

	@ObfuscatedName("xb.h")
	public int[] fileOffset;

	@ObfuscatedName("xb.i")
	public boolean unpacked;

	public JagFile(byte[] arg0, int arg1) {
		unpack(arg0);
	}

	@ObfuscatedName("xb.a(B[B)V")
	public void unpack(byte[] arg0) {
		Packet var2 = new Packet(arg0, 15787);
		int var3 = var2.g3();
		int var4 = var2.g3();
		if (var4 == var3) {
			data = arg0;
			unpacked = false;
		} else {
			byte[] var5 = new byte[var3];
			BZip2.decompress(var5, var3, arg0, var4, 6);
			data = var5;
			var2 = new Packet(data, 15787);
			unpacked = true;
		}
		fileCount = var2.g2();
		fileHash = new int[fileCount];
		fileUnpackedSize = new int[fileCount];
		filePackedSize = new int[fileCount];
		fileOffset = new int[fileCount];
		int var6 = var2.pos + fileCount * 10;
		for (int var7 = 0; var7 < fileCount; var7++) {
			fileHash[var7] = var2.g4();
			fileUnpackedSize[var7] = var2.g3();
			filePackedSize[var7] = var2.g3();
			fileOffset[var7] = var6;
			var6 += filePackedSize[var7];
		}
	}

	@ObfuscatedName("xb.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < fileCount; var6++) {
			if (fileHash[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[fileUnpackedSize[var6]];
				}
				if (unpacked) {
					for (int var7 = 0; var7 < fileUnpackedSize[var6]; var7++) {
						arg1[var7] = data[fileOffset[var6] + var7];
					}
				} else {
					BZip2.decompress(arg1, fileUnpackedSize[var6], data, filePackedSize[var6], fileOffset[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
