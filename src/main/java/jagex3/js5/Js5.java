package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.datastruct.IntHashTable;
import jagex3.io.BZip2;
import jagex3.io.Packet;
import jagex3.util.ArrayUtil;
import jagex3.util.JagString;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

@ObfuscatedName("bd")
public abstract class Js5 {

    @ObfuscatedName("ra.i")
    public static final int maxsize = 0;
    @ObfuscatedName("bd.b")
	public byte[][] packed;

	@ObfuscatedName("bd.f")
	public int crc;

	@ObfuscatedName("bd.g")
	public IntHashTable[] fileNameHashes;

	@ObfuscatedName("bd.j")
	public final boolean discardUnpacked;

	@ObfuscatedName("bd.k")
	public int size;

	@ObfuscatedName("bd.n")
	public int[] groupVersions;

	@ObfuscatedName("bd.q")
	public int[] groupIds;

	@ObfuscatedName("bd.w")
	public final boolean discardPacked;

	@ObfuscatedName("bd.R")
	public IntHashTable groupNameHashTable;

	@ObfuscatedName("bd.C")
	public int[] groupNameHash;

	@ObfuscatedName("bd.P")
	public int[] groupChecksums;

	@ObfuscatedName("bd.Y")
	public int[] groupSizes;

	@ObfuscatedName("bd.z")
	public int[][] fileNameHashTable;

	@ObfuscatedName("bd.G")
	public int[][] fileIds;

	@ObfuscatedName("bd.M")
	public byte[][][] unpacked;

	@ObfuscatedName("r.a([BI)[B")
	public static byte[] getUncompressedPacket(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		int var3 = var1.g4();
		if (var3 < 0 || maxsize != 0 && maxsize < var3) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var7 = new byte[var3];
			var1.gdata(var7, var3);
			return var7;
		} else {
			int var4 = var1.g4();
			if (var4 < 0 || maxsize != 0 && var4 > maxsize) {
				throw new RuntimeException();
			}
			byte[] var5 = new byte[var4];
			if (var2 == 1) {
				BZip2.decompress(var5, var4, arg0, var3);
			} else {
				try {
					DataInputStream var6 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var3)));
					var6.readFully(var5);
					var6.close();
				} catch (IOException var8) {
				}
			}
			return var5;
		}
	}

	@ObfuscatedName("bd.a(La;La;I)[B")
	public final byte[] getFile(JagString arg0, JagString arg1) {
		JagString var3 = arg1.toLowerCase();
		JagString var4 = arg0.toLowerCase();
		int var5 = this.groupNameHashTable.find(var3.hash());
		int var6 = this.fileNameHashes[var5].find(var4.hash());
		return this.getFile(var6, var5);
	}

	@ObfuscatedName("bd.a(II)V")
	public final void discardFiles(int arg0) {
		for (int var2 = 0; var2 < this.unpacked[arg0].length; var2++) {
			this.unpacked[arg0][var2] = null;
		}
	}

	@ObfuscatedName("bd.a(III)[B")
	public final byte[] getFile(int arg0, int arg1) {
		return this.fetchFile(arg1, arg0, null);
	}

	@ObfuscatedName("bd.a(IBI)Z")
	public final boolean requestDownload(int arg0, int arg1) {
		if (arg0 < 0 || this.unpacked.length <= arg0 || this.unpacked[arg0] == null || arg1 < 0 || arg1 >= this.unpacked[arg0].length) {
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

	@ObfuscatedName("bd.a(IB)V")
	public void method219(int arg0) {
	}

	@ObfuscatedName("bd.a(I)I")
	public final int getGroupCount() {
		return this.unpacked.length;
	}

	@ObfuscatedName("bd.a(II[II)[B")
	public final byte[] fetchFile(int arg0, int arg1, int[] arg2) {
		if (arg0 < 0 || this.unpacked.length <= arg0 || this.unpacked[arg0] == null || arg1 < 0 || arg1 >= this.unpacked[arg0].length) {
			return null;
		}
		if (this.unpacked[arg0][arg1] == null) {
			boolean var4 = this.unpackGroupData(arg0, arg2);
			if (!var4) {
				this.requestGroupDownload2(arg0);
				boolean var5 = this.unpackGroupData(arg0, arg2);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = this.unpacked[arg0][arg1];
		if (this.discardUnpacked) {
			this.unpacked[arg0][arg1] = null;
		}
		return var6;
	}

	@ObfuscatedName("bd.b(II)V")
	public void requestGroupDownload2(int arg0) {
	}

	@ObfuscatedName("bd.a(I[B)V")
	public final void decodeIndex(byte[] arg0) {
		this.crc = Packet.getcrc(arg0, arg0.length);
		Packet var2 = new Packet(getUncompressedPacket(arg0));
		int var3 = var2.g1();
		if (var3 != 5) {
			return;
		}
		int var4 = 0;
		int var5 = var2.g1();
		this.size = var2.g2();
		this.groupIds = new int[this.size];
		int var6 = -1;
		for (int var7 = 0; var7 < this.size; var7++) {
			this.groupIds[var7] = var4 += var2.g2();
			if (this.groupIds[var7] > var6) {
				var6 = this.groupIds[var7];
			}
		}
		this.fileIds = new int[var6 + 1][];
		this.groupVersions = new int[var6 + 1];
		this.groupChecksums = new int[var6 + 1];
		this.unpacked = new byte[var6 + 1][][];
		this.groupSizes = new int[var6 + 1];
		this.packed = new byte[var6 + 1][];
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
			int var14 = this.groupIds[var12];
			int var15 = -1;
			int var16 = this.groupSizes[var14];
			this.fileIds[var14] = new int[var16];
			for (int var17 = 0; var17 < var16; var17++) {
				int var18 = this.fileIds[var14][var17] = var13 += var2.g2();
				if (var18 > var15) {
					var15 = var18;
				}
			}
			this.unpacked[var14] = new byte[var15 + 1][];
		}
		if (var5 != 0) {
			this.fileNameHashes = new IntHashTable[var6 + 1];
			this.fileNameHashTable = new int[var6 + 1][];
			for (int var19 = 0; var19 < this.size; var19++) {
				int var20 = this.groupIds[var19];
				int var21 = this.groupSizes[var20];
				this.fileNameHashTable[var20] = new int[this.unpacked[var20].length];
				for (int var22 = 0; var22 < var21; var22++) {
					this.fileNameHashTable[var20][this.fileIds[var20][var22]] = var2.g4();
				}
				this.fileNameHashes[var20] = new IntHashTable(this.fileNameHashTable[var20]);
			}
		}
	}

	@ObfuscatedName("bd.a(IILa;)I")
	public final int getFileId(int arg0, JagString arg1) {
		JagString var3 = arg1.toLowerCase();
		return this.fileNameHashes[arg0].find(var3.hash());
	}

	@ObfuscatedName("bd.a(II[I)Z")
	public boolean unpackGroupData(int arg0, int[] arg1) {
		if (this.packed[arg0] == null) {
			return false;
		}
		int var3 = this.groupSizes[arg0];
		byte[][] var4 = this.unpacked[arg0];
		int[] var5 = this.fileIds[arg0];
		boolean var6 = true;
		for (int var7 = 0; var7 < var3; var7++) {
			if (var4[var5[var7]] == null) {
				var6 = false;
				break;
			}
		}
		if (var6) {
			return true;
		}
		byte[] var8;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			var8 = this.packed[arg0];
		} else {
			var8 = new byte[this.packed[arg0].length];
			ArrayUtil.copy(this.packed[arg0], 0, var8, 0, var8.length);
			Packet var9 = new Packet(var8);
			var9.tinydec(arg1, var9.data.length);
		}
		byte[] var10;
		try {
			var10 = getUncompressedPacket(var8);
		} catch (RuntimeException var25) {
			throw JagException.report(var25, "T3 - " + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Packet.getcrc(var8, var8.length) + "," + Packet.getcrc(var8, var8.length - 2) + "," + this.groupChecksums[arg0] + "," + this.crc);
		}
		if (this.discardPacked) {
			this.packed[arg0] = null;
		}
		if (var3 > 1) {
			int var12 = var10.length;
			int var26 = var12 - 1;
			int var13 = var10[var26] & 0xFF;
			Packet var14 = new Packet(var10);
			int var15 = var26 - var3 * var13 * 4;
			var14.pos = var15;
			int[] var16 = new int[var3];
			for (int var17 = 0; var17 < var13; var17++) {
				int var18 = 0;
				for (int var19 = 0; var19 < var3; var19++) {
					var18 += var14.g4();
					var16[var19] += var18;
				}
			}
			for (int var20 = 0; var20 < var3; var20++) {
				if (var4[var5[var20]] == null) {
					var4[var5[var20]] = new byte[var16[var20]];
				}
				var16[var20] = 0;
			}
			var14.pos = var15;
			int var21 = 0;
			for (int var22 = 0; var22 < var13; var22++) {
				int var23 = 0;
				for (int var24 = 0; var24 < var3; var24++) {
					var23 += var14.g4();
					ArrayUtil.copy(var10, var21, var4[var5[var24]], var16[var24], var23);
					var16[var24] += var23;
					var21 += var23;
				}
			}
		} else {
			var4[var5[0]] = var10;
		}
		return true;
	}

	@ObfuscatedName("bd.b(III)[B")
	public final byte[] peekFile(int arg0, int arg1) {
		if (arg1 < 0 || this.unpacked.length <= arg1 || this.unpacked[arg1] == null || arg0 < 0 || this.unpacked[arg1].length <= arg0) {
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
		return this.unpacked[arg1][arg0];
	}

	@ObfuscatedName("bd.a(ILa;)I")
	public final int getGroupId(JagString arg0) {
		JagString var2 = arg0.toLowerCase();
		return this.groupNameHashTable.find(var2.hash());
	}

	@ObfuscatedName("bd.a(B)Z")
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

	@ObfuscatedName("bd.c(II)Z")
	public final boolean requestGroupDownload(int arg0) {
		if (this.packed[arg0] == null) {
			this.requestGroupDownload2(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bd.b(IB)[B")
	public final byte[] getFile(int arg0) {
		if (this.unpacked.length == 1) {
			return this.getFile(arg0, 0);
		} else if (this.unpacked[arg0].length == 1) {
			return this.getFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bd.c(IB)I")
	public final int getFileIdLimit(int arg0) {
		return this.unpacked[arg0].length;
	}

	@ObfuscatedName("bd.c(I)V")
	public final void discardAllFiles() {
		for (int var1 = 0; var1 < this.unpacked.length; var1++) {
			if (this.unpacked[var1] != null) {
				for (int var2 = 0; var2 < this.unpacked[var1].length; var2++) {
					this.unpacked[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("bd.a(IZ)[I")
	public final int[] getFileList(int arg0) {
		return this.fileIds[arg0];
	}

	@ObfuscatedName("bd.a(BI)[B")
	public final byte[] method238(int arg0) {
		if (this.unpacked.length == 1) {
			return this.peekFile(arg0, 0);
		} else if (this.unpacked[arg0].length == 1) {
			return this.peekFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bd.b(La;La;I)Z")
	public final boolean requestDownload(JagString arg0, JagString arg1) {
		JagString var3 = arg0.toLowerCase();
		JagString var4 = arg1.toLowerCase();
		int var5 = this.groupNameHashTable.find(var3.hash());
		int var6 = this.fileNameHashes[var5].find(var4.hash());
		return this.requestDownload(var5, var6);
	}

	@ObfuscatedName("bd.b(ILa;)V")
	public final void updateCacheHint(JagString arg0) {
		JagString var2 = arg0.toLowerCase();
		int var3 = this.groupNameHashTable.find(var2.hash());
		if (var3 >= 0) {
			this.method219(var3);
		}
	}

	public Js5(boolean arg0, boolean arg1) {
		this.discardUnpacked = arg1;
		this.discardPacked = arg0;
	}
}
