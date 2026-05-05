package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.datastruct.IntHashTable;
import jagex3.io.BZip2;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.GZip;
import jagex3.io.Packet;
import jagex3.jstring.JagString;
import jagex3.util.ArrayUtil;

@ObfuscatedName("nb")
public abstract class Js5 {

	@ObfuscatedName("oa.A")
	public static final GZip gzip = new GZip();
	@ObfuscatedName("da.kb")
	public static final boolean strictBounds = false;
	@ObfuscatedName("og.R")
	public static final int js5MaxSize = 0;
	@ObfuscatedName("uj.o")
	public static final JagString field4281 = JagString.wrap("");
	@ObfuscatedName("nb.ab")
	public int crc;

	@ObfuscatedName("nb.i")
	public int[] groupVersions;

	@ObfuscatedName("nb.n")
	public IntHashTable[] fileNameHashTables;

	@ObfuscatedName("nb.o")
	public int[] fileIdLimit;

	@ObfuscatedName("nb.r")
	public final boolean discardPacked;

	@ObfuscatedName("nb.s")
	public int[][] fileIds;

	@ObfuscatedName("nb.w")
	public int[] groupNameHash;

	@ObfuscatedName("nb.S")
	public final boolean discardUnpacked;

	@ObfuscatedName("nb.N")
	public int size;

	@ObfuscatedName("nb.C")
	public IntHashTable groupNameHashTable;

	@ObfuscatedName("nb.x")
	public int[] groupSizes;

	@ObfuscatedName("nb.E")
	public int[] groupChecksums;

	@ObfuscatedName("nb.W")
	public int[] groupIds;

	@ObfuscatedName("nb.U")
	public Object[] packed;

	@ObfuscatedName("nb.K")
	public int[][] fileNameHashes;

	@ObfuscatedName("nb.O")
	public Object[][] unpacked;

	public Js5(boolean arg0, boolean arg1) {
		this.discardPacked = arg0;
		this.discardUnpacked = arg1;
	}

	@ObfuscatedName("c.a([BI)[B")
	public static byte[] getUncompressedPacket(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		int var3 = var1.g4();
		if (var3 < 0 || js5MaxSize != 0 && var3 > js5MaxSize) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.gdata(var3, var4);
			return var4;
		} else {
			int var5 = var1.g4();
			if (var5 < 0 || js5MaxSize != 0 && js5MaxSize < var5) {
				throw new RuntimeException();
			}
			byte[] var6 = new byte[var5];
			if (var2 == 1) {
				BZip2.method1458(var6, var5, arg0, var3);
			} else {
				gzip.decompress(var1, var6);
			}
			return var6;
		}
	}

	@ObfuscatedName("nb.a(II)V")
	public void updateCacheHint(int arg0) {
	}

	@ObfuscatedName("nb.a(BII)[B")
	public final byte[] getFile(int arg0, int arg1) {
		return this.fetchFile(null, arg1, arg0);
	}

	@ObfuscatedName("nb.a(B)I")
	public final int getGroupCount() {
		return this.fileIdLimit.length;
	}

	@ObfuscatedName("nb.a(I)V")
	public final void discardAllFiles() {
		for (int var1 = 0; var1 < this.unpacked.length; var1++) {
			this.unpacked[var1] = null;
		}
	}

	@ObfuscatedName("nb.b(II)I")
	public final int getFileIdLimit(int arg0) {
		return this.isGroupValid(arg0) ? this.fileIdLimit[arg0] : 0;
	}

	@ObfuscatedName("nb.a(III)Z")
	public boolean isFileValid(int arg0, int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.fileIdLimit.length > arg1 && arg0 < this.fileIdLimit[arg1]) {
			return true;
		} else if (strictBounds) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.a(Li;I)Z")
	public final boolean requestDownload(JagString arg0) {
		int var2 = this.getGroupId(field4281);
		return var2 == -1 ? this.requestDownload(arg0, field4281) : this.requestDownload(field4281, arg0);
	}

	@ObfuscatedName("nb.a(ILi;Li;)Z")
	public final boolean requestDownload(JagString arg0, JagString arg1) {
		JagString var3 = arg0.method639();
		JagString var4 = arg1.method639();
		int var5 = this.groupNameHashTable.find(var3.method605());
		if (this.isGroupValid(var5)) {
			int var6 = this.fileNameHashTables[var5].find(var4.method605());
			return this.requestDownload(var5, var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.b(III)[B")
	public final byte[] peekFile(int arg0, int arg1) {
		if (!this.isFileValid(arg0, arg1)) {
			return null;
		}
		if (this.unpacked[arg1] == null || this.unpacked[arg1][arg0] == null) {
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

	@ObfuscatedName("nb.c(II)[I")
	public final int[] getFileList(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return null;
		}
		int[] var2 = this.fileIds[arg0];
		if (var2 == null) {
			var2 = new int[this.groupSizes[arg0]];
			int var3 = 0;
			while (var2.length > var3) {
				var2[var3] = var3++;
			}
		}
		return var2;
	}

	@ObfuscatedName("nb.a(I[III)[B")
	public final byte[] fetchFile(int[] arg0, int arg1, int arg2) {
		if (!this.isFileValid(arg2, arg1)) {
			return null;
		}
		if (this.unpacked[arg1] == null || this.unpacked[arg1][arg2] == null) {
			boolean var4 = this.unpackGroupData(arg1, arg0);
			if (!var4) {
				this.requestGroupDownload2(arg1);
				boolean var5 = this.unpackGroupData(arg1, arg0);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = ByteArrayWrapper.unwrap(false, this.unpacked[arg1][arg2]);
		if (this.discardUnpacked) {
			this.unpacked[arg1][arg2] = null;
			if (this.fileIdLimit[arg1] == 1) {
				this.unpacked[arg1] = null;
			}
		}
		return var6;
	}

	@ObfuscatedName("nb.a(Z)I")
	public final int getTotalLoadProgress() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.packed.length; var3++) {
			if (this.groupSizes[var3] > 0) {
				var2 += this.getGroupLoadProgress(var3);
				var1 += 100;
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("nb.a(I[IB)Z")
	public boolean unpackGroupData(int arg0, int[] arg1) {
		if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.packed[arg0] == null) {
			return false;
		} else {
			int var3 = this.groupSizes[arg0];
			int[] var4 = this.fileIds[arg0];
			if (this.unpacked[arg0] == null) {
				this.unpacked[arg0] = new Object[this.fileIdLimit[arg0]];
			}
			boolean var5 = true;
			Object[] var6 = this.unpacked[arg0];
			for (int var7 = 0; var7 < var3; var7++) {
				int var8;
				if (var4 == null) {
					var8 = var7;
				} else {
					var8 = var4[var7];
				}
				if (var6[var8] == null) {
					var5 = false;
					break;
				}
			}
			if (var5) {
				return true;
			}
			byte[] var9;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				var9 = ByteArrayWrapper.unwrap(false, this.packed[arg0]);
			} else {
				var9 = ByteArrayWrapper.unwrap(true, this.packed[arg0]);
				Packet var10 = new Packet(var9);
				var10.tinydec(var10.data.length, arg1);
			}
			byte[] var11;
			try {
				var11 = getUncompressedPacket(var9);
			} catch (RuntimeException var30) {
				throw JagException.method1076(var30, "T3 - " + (arg1 != null) + "," + arg0 + "," + var9.length + "," + Packet.method541(var9, var9.length) + "," + Packet.method541(var9, var9.length - 2) + "," + this.groupChecksums[arg0] + "," + this.crc);
			}
			if (this.discardPacked) {
				this.packed[arg0] = null;
			}
			if (var3 > 1) {
				int var13 = var11.length;
				int var31 = var13 - 1;
				int var14 = var11[var31] & 0xFF;
				int var15 = var31 - var3 * var14 * 4;
				Packet var16 = new Packet(var11);
				int[] var17 = new int[var3];
				var16.pos = var15;
				for (int var18 = 0; var18 < var14; var18++) {
					int var19 = 0;
					for (int var20 = 0; var20 < var3; var20++) {
						var19 += var16.g4();
						var17[var20] += var19;
					}
				}
				byte[][] var21 = new byte[var3][];
				for (int var22 = 0; var22 < var3; var22++) {
					var21[var22] = new byte[var17[var22]];
					var17[var22] = 0;
				}
				var16.pos = var15;
				int var23 = 0;
				for (int var24 = 0; var24 < var14; var24++) {
					int var25 = 0;
					for (int var26 = 0; var26 < var3; var26++) {
						var25 += var16.g4();
						ArrayUtil.method836(var11, var23, var21[var26], var17[var26], var25);
						var23 += var25;
						var17[var26] += var25;
					}
				}
				for (int var27 = 0; var27 < var3; var27++) {
					int var28;
					if (var4 == null) {
						var28 = var27;
					} else {
						var28 = var4[var27];
					}
					if (this.discardUnpacked) {
						var6[var28] = var21[var27];
					} else {
						var6[var28] = ByteArrayWrapper.wrap(var21[var27]);
					}
				}
			} else {
				int var29;
				if (var4 == null) {
					var29 = 0;
				} else {
					var29 = var4[0];
				}
				if (this.discardUnpacked) {
					var6[var29] = var11;
				} else {
					var6[var29] = ByteArrayWrapper.wrap(var11);
				}
			}
			return true;
		}
	}

	@ObfuscatedName("nb.d(II)Z")
	public final boolean requestDownload(int arg0) {
		if (this.fileIdLimit.length == 1) {
			return this.requestDownload(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.fileIdLimit[arg0] == 1) {
			return this.requestDownload(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nb.a(ILi;)Z")
	public final boolean requestGroupDownload(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.groupNameHashTable.find(var2.method605());
		return this.requestGroupDownload(var3);
	}

	@ObfuscatedName("nb.a(BI)I")
	public int getGroupLoadProgress(int arg0) {
		if (this.isGroupValid(arg0)) {
			return this.packed[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("nb.a(IB)V")
	public final void discardFiles(int arg0) {
		if (this.isGroupValid(arg0)) {
			this.unpacked[arg0] = null;
		}
	}

	@ObfuscatedName("nb.a(IZ)V")
	public void requestGroupDownload2(int arg0) {
	}

	@ObfuscatedName("nb.e(II)[B")
	public final byte[] getFile(int arg0) {
		if (this.fileIdLimit.length == 1) {
			return this.getFile(arg0, 0);
		} else if (!this.isGroupValid(arg0)) {
			return null;
		} else if (this.fileIdLimit[arg0] == 1) {
			return this.getFile(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nb.a(Li;B)I")
	public final int getGroupLoadProgress(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.groupNameHashTable.find(var2.method605());
		return this.getGroupLoadProgress(var3);
	}

	@ObfuscatedName("nb.a(IIB)Z")
	public final boolean requestDownload(int arg0, int arg1) {
		if (!this.isFileValid(arg1, arg0)) {
			return false;
		} else if (this.unpacked[arg0] != null && this.unpacked[arg0][arg1] != null) {
			return true;
		} else if (this.packed[arg0] == null) {
			this.requestGroupDownload2(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nb.b(ILi;Li;)[B")
	public final byte[] getFile(JagString arg0, JagString arg1) {
		JagString var3 = arg0.method639();
		JagString var4 = arg1.method639();
		int var5 = this.groupNameHashTable.find(var3.method605());
		if (this.isGroupValid(var5)) {
			int var6 = this.fileNameHashTables[var5].find(var4.method605());
			return this.getFile(var6, var5);
		} else {
			return null;
		}
	}

	@ObfuscatedName("nb.b(B)Z")
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

	@ObfuscatedName("nb.b(Li;B)I")
	public final int getGroupId(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.groupNameHashTable.find(var2.method605());
		return this.isGroupValid(var3) ? var3 : -1;
	}

	@ObfuscatedName("nb.a(ZZI)V")
	public final void discardNames(boolean arg0) {
		this.fileNameHashTables = null;
		this.fileNameHashes = null;
		if (arg0) {
			this.groupNameHash = null;
			this.groupNameHashTable = null;
		}
	}

	@ObfuscatedName("nb.a(Li;II)I")
	public final int getFileId(JagString arg0, int arg1) {
		if (this.isGroupValid(arg1)) {
			JagString var3 = arg0.method639();
			int var4 = this.fileNameHashTables[arg1].find(var3.method605());
			return this.isFileValid(var4, arg1) ? var4 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("nb.a([BZ)V")
	public final void decodeIndex(byte[] arg0) {
		this.crc = Packet.method541(arg0, arg0.length);
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
		this.fileIdLimit = new int[var6 + 1];
		this.fileIds = new int[var6 + 1][];
		this.unpacked = new Object[var6 + 1][];
		this.groupChecksums = new int[var6 + 1];
		this.packed = new Object[var6 + 1];
		this.groupSizes = new int[var6 + 1];
		this.groupVersions = new int[var6 + 1];
		if (var5 != 0) {
			this.groupNameHash = new int[var6 + 1];
			for (int var8 = 0; var8 < var6 + 1; var8++) {
				this.groupNameHash[var8] = -1;
			}
			for (int var9 = 0; var9 < this.size; var9++) {
				this.groupNameHash[this.groupIds[var9]] = var2.g4();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHash);
		}
		for (int var10 = 0; var10 < this.size; var10++) {
			this.groupChecksums[this.groupIds[var10]] = var2.g4();
		}
		for (int var11 = 0; var11 < this.size; var11++) {
			this.groupVersions[this.groupIds[var11]] = var2.g4();
		}
		for (int var12 = 0; var12 < this.size; var12++) {
			this.groupSizes[this.groupIds[var12]] = var2.g2();
		}
		for (int var13 = 0; var13 < this.size; var13++) {
			int var14 = this.groupIds[var13];
			int var15 = this.groupSizes[var14];
			int var16 = 0;
			this.fileIds[var14] = new int[var15];
			int var17 = -1;
			for (int var18 = 0; var18 < var15; var18++) {
				int var19 = this.fileIds[var14][var18] = var16 += var2.g2();
				if (var17 < var19) {
					var17 = var19;
				}
			}
			this.fileIdLimit[var14] = var17 + 1;
			if (var15 == var17 + 1) {
				this.fileIds[var14] = null;
			}
		}
		if (var5 == 0) {
			return;
		}
		this.fileNameHashes = new int[var6 + 1][];
		this.fileNameHashTables = new IntHashTable[var6 + 1];
		for (int var20 = 0; var20 < this.size; var20++) {
			int var21 = this.groupIds[var20];
			int var22 = this.groupSizes[var21];
			this.fileNameHashes[var21] = new int[this.fileIdLimit[var21]];
			for (int var23 = 0; var23 < this.fileIdLimit[var21]; var23++) {
				this.fileNameHashes[var21][var23] = -1;
			}
			for (int var24 = 0; var24 < var22; var24++) {
				int var25;
				if (this.fileIds[var21] == null) {
					var25 = var24;
				} else {
					var25 = this.fileIds[var21][var24];
				}
				this.fileNameHashes[var21][var25] = var2.g4();
			}
			this.fileNameHashTables[var21] = new IntHashTable(this.fileNameHashes[var21]);
		}
	}

	@ObfuscatedName("nb.g(II)Z")
	public final boolean isGroupValid(int arg0) {
		if (arg0 >= 0 && arg0 < this.fileIdLimit.length && this.fileIdLimit[arg0] != 0) {
			return true;
		} else if (strictBounds) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("nb.b(Li;I)V")
	public final void updateCacheHint(JagString arg0) {
		JagString var2 = arg0.method639();
		int var3 = this.groupNameHashTable.find(var2.method605());
		this.updateCacheHint(var3);
	}

	@ObfuscatedName("nb.b(IB)Z")
	public final boolean requestGroupDownload(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.packed[arg0] == null) {
			this.requestGroupDownload2(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}
}
