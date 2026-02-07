package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.datastruct.IntHashTable;
import jagex3.io.BZip2;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.GZip;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;

@ObfuscatedName("ea")
public abstract class Js5 {

	@ObfuscatedName("f.x")
	public static final int maxsize = 0;
	@ObfuscatedName("be.x")
	public static GZip gzip = new GZip();
	@ObfuscatedName("ea.c")
	public int size;

	@ObfuscatedName("ea.e")
	public Object[] packed;

	@ObfuscatedName("ea.h")
	public int[] groupVersions;

	@ObfuscatedName("ea.k")
	public int[] groupSizes;

	@ObfuscatedName("ea.o")
	public Object[][] unpacked;

	@ObfuscatedName("ea.u")
	public int[] groupNameHash;

	@ObfuscatedName("ea.F")
	public final boolean discardPacked;

	@ObfuscatedName("ea.H")
	public final boolean discardUnpacked;

	@ObfuscatedName("ea.B")
	public int crc;

	@ObfuscatedName("ea.P")
	public IntHashTable groupNameHashTable;

	@ObfuscatedName("ea.A")
	public int[] groupChecksums;

	@ObfuscatedName("ea.K")
	public int[] groupIds;

	@ObfuscatedName("ea.E")
	public IntHashTable[] fileNameHashTable;

	@ObfuscatedName("ea.S")
	public int[][] fileIds;

	@ObfuscatedName("ea.V")
	public int[][] fileNameHashes;

	public Js5(boolean arg0, boolean arg1) {
		this.discardPacked = arg1;
		this.discardUnpacked = arg0;
	}

	@ObfuscatedName("o.a(I[B)[B")
	public static byte[] getUncompressedPacket(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		int var3 = var1.g4();
		if (var3 < 0 || maxsize != 0 && maxsize < var3) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.gdata(var3, var6);
			return var6;
		} else {
			int var4 = var1.g4();
			if (var4 < 0 || maxsize != 0 && maxsize < var4) {
				throw new RuntimeException();
			}
			byte[] var5 = new byte[var4];
			if (var2 == 1) {
				BZip2.decompress(var5, var4, arg0, var3);
			} else {
				gzip.decompress(var5, var1);
			}
			return var5;
		}
	}

	@ObfuscatedName("ea.a(II[I)Z")
	public boolean unpackGroupData(int arg0, int[] arg1) {
		if (this.packed[arg0] == null) {
			return false;
		}
		int var3 = this.groupSizes[arg0];
		int[] var4 = this.fileIds[arg0];
		Object[] var5 = this.unpacked[arg0];
		boolean var6 = true;
		for (int var7 = 0; var7 < var3; var7++) {
			if (var5[var4[var7]] == null) {
				var6 = false;
				break;
			}
		}
		if (var6) {
			return true;
		}
		byte[] var8;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			var8 = ByteArrayWrapper.unwrap(false, this.packed[arg0]);
		} else {
			var8 = ByteArrayWrapper.unwrap(true, this.packed[arg0]);
			Packet var9 = new Packet(var8);
			var9.tinydec(var9.data.length, arg1);
		}
		byte[] var10;
		try {
			var10 = getUncompressedPacket(var8);
		} catch (RuntimeException var27) {
			throw JagException.report(var27, "T3 - " + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Packet.getcrc(var8.length, var8) + "," + Packet.getcrc(var8.length - 2, var8) + "," + this.groupChecksums[arg0] + "," + this.crc);
		}
		if (this.discardUnpacked) {
			this.packed[arg0] = null;
		}
		if (var3 > 1) {
			int var12 = var10.length;
			int var28 = var12 - 1;
			int var13 = var10[var28] & 0xFF;
			Packet var14 = new Packet(var10);
			int var15 = var28 - var3 * var13 * 4;
			var14.pos = var15;
			int[] var16 = new int[var3];
			for (int var17 = 0; var17 < var13; var17++) {
				int var18 = 0;
				for (int var19 = 0; var19 < var3; var19++) {
					var18 += var14.g4();
					var16[var19] += var18;
				}
			}
			byte[][] var20 = new byte[var3][];
			for (int var21 = 0; var21 < var3; var21++) {
				var20[var21] = new byte[var16[var21]];
				var16[var21] = 0;
			}
			var14.pos = var15;
			int var22 = 0;
			for (int var23 = 0; var23 < var13; var23++) {
				int var24 = 0;
				for (int var25 = 0; var25 < var3; var25++) {
					var24 += var14.g4();
					ArrayUtil.copy(var10, var22, var20[var25], var16[var25], var24);
					var22 += var24;
					var16[var25] += var24;
				}
			}
			for (int var26 = 0; var26 < var3; var26++) {
				if (this.discardPacked) {
					var5[var4[var26]] = var20[var26];
				} else {
					var5[var4[var26]] = ByteArrayWrapper.wrap(var20[var26]);
				}
			}
		} else if (this.discardPacked) {
			var5[var4[0]] = var10;
		} else {
			var5[var4[0]] = ByteArrayWrapper.wrap(var10);
		}
		return true;
	}

	@ObfuscatedName("ea.a(II)V")
	public void requestGroupDownload2(int arg0) {
	}

	@ObfuscatedName("ea.a(BI)I")
	public final int getFileIdLimit(int arg0) {
		return this.unpacked[arg0].length;
	}

	@ObfuscatedName("ea.a(ILec;)I")
	public final int getGroupId(JagString arg0) {
		JagString var2 = arg0.toLowerCase();
		return this.groupNameHashTable.find(var2.computeCp1252HashFromUtf8());
	}

	@ObfuscatedName("ea.b(II)Z")
	public final boolean requestGroupDownload(int arg0) {
		if (this.packed[arg0] == null) {
			this.requestGroupDownload2(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ea.b(I)I")
	public final int getGroupCount() {
		return this.unpacked.length;
	}

	@ObfuscatedName("ea.b(BI)V")
	public void updateCacheHint(int arg0) {
	}

	@ObfuscatedName("ea.a(III)[B")
	public final byte[] getFile(int arg0, int arg1) {
		return this.fetchFile(arg0, null, arg1);
	}

	@ObfuscatedName("ea.c(II)[I")
	public final int[] getFileList(int arg0) {
		return this.fileIds[arg0];
	}

	@ObfuscatedName("ea.c(I)Z")
	public final boolean requestFullDownload() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.groupIds.length; var2++) {
			int var3 = this.groupIds[var2];
			if (this.packed[var3] == null) {
				this.requestGroupDownload2(var3);
				if (this.packed[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("ea.a([BI)V")
	public final void decodeIndex(byte[] arg0) {
		this.crc = Packet.getcrc(arg0.length, arg0);
		Packet var2 = new Packet(getUncompressedPacket(arg0));
		int var3 = var2.g1();
		if (var3 != 5 && var3 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + var3);
		}
		if (var3 >= 6) {
			var2.g4();
		}
		int var4 = 0;
		int var5 = var2.g1();
		this.size = var2.g2();
		this.groupIds = new int[this.size];
		int var6 = -1;
		for (int var7 = 0; var7 < this.size; var7++) {
			this.groupIds[var7] = var4 += var2.g2();
			if (var6 < this.groupIds[var7]) {
				var6 = this.groupIds[var7];
			}
		}
		this.groupChecksums = new int[var6 + 1];
		this.groupVersions = new int[var6 + 1];
		this.packed = new Object[var6 + 1];
		this.unpacked = new Object[var6 + 1][];
		this.groupSizes = new int[var6 + 1];
		this.fileIds = new int[var6 + 1][];
		if (var5 != 0) {
			this.groupNameHash = new int[var6 + 1];
			for (int var8 = 0; var8 < this.size; var8++) {
				this.groupNameHash[this.groupIds[var8]] = var2.g4();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHash);
		}
		for (int var9 = 0; var9 < this.size; var9++) {
			this.groupChecksums[this.groupIds[var9]] = var2.g4();
		}
		for (int var10 = 0; var10 < this.size; var10++) {
			this.groupVersions[this.groupIds[var10]] = var2.g4();
		}
		for (int var11 = 0; var11 < this.size; var11++) {
			this.groupSizes[this.groupIds[var11]] = var2.g2();
		}
		for (int var12 = 0; var12 < this.size; var12++) {
			int var13 = 0;
			int var14 = -1;
			int var15 = this.groupIds[var12];
			int var16 = this.groupSizes[var15];
			this.fileIds[var15] = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				int var18 = this.fileIds[var15][var17] = var13 += var2.g2();
				if (var14 < var18) {
					var14 = var18;
				}
			}
			this.unpacked[var15] = new Object[var14 + 1];
		}
		if (var5 != 0) {
			this.fileNameHashes = new int[var6 + 1][];
			this.fileNameHashTable = new IntHashTable[var6 + 1];
			for (int var19 = 0; var19 < this.size; var19++) {
				int var20 = this.groupIds[var19];
				int var21 = this.groupSizes[var20];
				this.fileNameHashes[var20] = new int[this.unpacked[var20].length];
				for (int var22 = 0; var22 < var21; var22++) {
					this.fileNameHashes[var20][this.fileIds[var20][var22]] = var2.g4();
				}
				this.fileNameHashTable[var20] = new IntHashTable(this.fileNameHashes[var20]);
			}
		}
	}

	@ObfuscatedName("ea.a(Lec;Lec;I)Z")
	public final boolean requestDownload(JagString arg0, JagString arg1) {
		JagString var3 = arg0.toLowerCase();
		JagString var4 = arg1.toLowerCase();
		int var5 = this.groupNameHashTable.find(var3.computeCp1252HashFromUtf8());
		int var6 = this.fileNameHashTable[var5].find(var4.computeCp1252HashFromUtf8());
		return this.requestDownload(var5, var6);
	}

	@ObfuscatedName("ea.a(BLec;)V")
	public final void updateCacheHint(JagString arg0) {
		JagString var2 = arg0.toLowerCase();
		int var3 = this.groupNameHashTable.find(var2.computeCp1252HashFromUtf8());
		if (var3 >= 0) {
			this.updateCacheHint(var3);
		}
	}

	@ObfuscatedName("ea.a(IZI)Z")
	public final boolean requestDownload(int arg0, int arg1) {
		if (arg0 < 0 || arg0 >= this.unpacked.length || this.unpacked[arg0] == null || arg1 < 0 || this.unpacked[arg0].length <= arg1) {
			return false;
		} else if (this.unpacked[arg0][arg1] != null) {
			return true;
		} else if (this.packed[arg0] == null) {
			this.requestGroupDownload2(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ea.d(I)V")
	public final void discardAllFiles() {
		for (int var1 = 0; var1 < this.unpacked.length; var1++) {
			if (this.unpacked[var1] != null) {
				for (int var2 = 0; var2 < this.unpacked[var1].length; var2++) {
					this.unpacked[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("ea.a(Lec;IZ)I")
	public final int getFileId(JagString arg0, int arg1) {
		JagString var3 = arg0.toLowerCase();
		return this.fileNameHashTable[arg1].find(var3.computeCp1252HashFromUtf8());
	}

	@ObfuscatedName("ea.d(II)[B")
	public final byte[] peekFile(int arg0) {
		if (this.unpacked.length == 1) {
			return this.peekFile(arg0, 0);
		} else if (this.unpacked[arg0].length == 1) {
			return this.peekFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ea.b(III)[B")
	public final byte[] peekFile(int arg0, int arg1) {
		if (arg1 < 0 || this.unpacked.length <= arg1 || this.unpacked[arg1] == null || arg0 < 0 || arg0 >= this.unpacked[arg1].length) {
			return null;
		}
		if (this.unpacked[arg1][arg0] == null) {
			boolean var3 = this.unpackGroupData(arg1, null);
			if (!var3) {
				this.requestGroupDownload2(arg1);
				boolean var4 = this.unpackGroupData(arg1, null);
				if (!var4) {
					return null;
				}
			}
		}
		return ByteArrayWrapper.unwrap(false, this.unpacked[arg1][arg0]);
	}

	@ObfuscatedName("ea.e(II)[B")
	public final byte[] getFile(int arg0) {
		if (this.unpacked.length == 1) {
			return this.getFile(0, arg0);
		} else if (this.unpacked[arg0].length == 1) {
			return this.getFile(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ea.a(Lec;ILec;)[B")
	public final byte[] getFile(JagString arg0, JagString arg1) {
		JagString var3 = arg0.toLowerCase();
		JagString var4 = arg1.toLowerCase();
		int var5 = this.groupNameHashTable.find(var3.computeCp1252HashFromUtf8());
		int var6 = this.fileNameHashTable[var5].find(var4.computeCp1252HashFromUtf8());
		return this.getFile(var5, var6);
	}

	@ObfuscatedName("ea.a(II[II)[B")
	public final byte[] fetchFile(int arg0, int[] arg1, int arg2) {
		if (arg0 < 0 || this.unpacked.length <= arg0 || this.unpacked[arg0] == null || arg2 < 0 || arg2 >= this.unpacked[arg0].length) {
			return null;
		}
		if (this.unpacked[arg0][arg2] == null) {
			boolean var4 = this.unpackGroupData(arg0, arg1);
			if (!var4) {
				this.requestGroupDownload2(arg0);
				boolean var5 = this.unpackGroupData(arg0, arg1);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = ByteArrayWrapper.unwrap(false, this.unpacked[arg0][arg2]);
		if (this.discardPacked) {
			this.unpacked[arg0][arg2] = null;
		}
		return var6;
	}

	@ObfuscatedName("ea.a(IZ)V")
	public final void discardFiles(int arg0) {
		for (int var2 = 0; var2 < this.unpacked[arg0].length; var2++) {
			this.unpacked[arg0][var2] = null;
		}
	}
}
