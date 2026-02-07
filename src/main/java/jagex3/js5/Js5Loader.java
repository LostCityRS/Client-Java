package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.DataFile;
import jagex3.io.Packet;

import java.util.zip.CRC32;

@ObfuscatedName("ga")
public final class Js5Loader extends Js5 {

	@ObfuscatedName("tb.m")
	public static CRC32 crc32 = new CRC32();
	@ObfuscatedName("ga.db")
	public volatile boolean loadStatus = false;

	@ObfuscatedName("ga.eb")
	public final int archive;

	@ObfuscatedName("ga.fb")
	public int field1019 = -1;

	@ObfuscatedName("ga.hb")
	public int indexVersion;

	@ObfuscatedName("ga.jb")
	public int indexCrc;

	@ObfuscatedName("ga.kb")
	public final DataFile dataFile;

	@ObfuscatedName("ga.nb")
	public boolean remoteEnabled = false;

	@ObfuscatedName("ga.ob")
	public final DataFile indexDataFile;

	@ObfuscatedName("ga.Ab")
	public volatile boolean[] loadedGroups;

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.indexDataFile = arg1;
		this.dataFile = arg0;
		this.remoteEnabled = arg5;
		this.archive = arg2;
		Js5Net.method405(this.archive, this);
	}

	@ObfuscatedName("ga.a(ZIZZ[B)V")
	public void write(boolean arg0, int arg1, boolean arg2, byte[] arg3) {
		if (!arg2) {
			arg3[arg3.length - 2] = (byte) (super.groupVersions[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.groupVersions[arg1];
			if (this.dataFile != null) {
				Js5NetThread.method190(this.dataFile, arg1, arg3);
				this.loadedGroups[arg1] = true;
			}
			if (arg0) {
				super.packed[arg1] = ByteArrayWrapper.wrap(arg3);
			}
			return;
		}
		if (this.loadStatus) {
			throw new RuntimeException();
		}
		if (this.indexDataFile != null) {
			Js5NetThread.method190(this.indexDataFile, this.archive, arg3);
		}
		this.decodeIndex(arg3);
		this.loadAllLocal();
	}

	@ObfuscatedName("ga.b(BI)V")
	@Override
	public void updateCacheHint(int arg0) {
		Js5Net.updateCacheHint(this.archive, arg0);
	}

	@ObfuscatedName("ga.c(III)V")
	public void requestIndex(int arg0, int arg1) {
		this.indexVersion = arg0;
		this.indexCrc = arg1;
		if (this.indexDataFile == null) {
			Js5Net.queueRequest(true, (byte) 0, this.archive, 255, this, this.indexCrc);
		} else {
			Js5NetThread.queueRequest(this.archive, this, this.indexDataFile);
		}
	}

	@ObfuscatedName("ga.e(I)I")
	public int getIndexPercentage() {
		if (this.loadStatus) {
			return 100;
		} else if (super.packed == null) {
			int var1 = Js5Net.transferProgress(this.archive, 255);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("ga.c(BI)I")
	public int getGroupLoadProgress(int arg0) {
		if (super.packed[arg0] == null) {
			return this.loadedGroups[arg0] ? 100 : Js5Net.transferProgress(arg0, this.archive);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ga.a(ZZ[BILtb;)V")
	public void loadIndex(boolean arg0, byte[] arg1, int arg2, DataFile arg3) {
		if (this.indexDataFile != arg3) {
			if (!arg0 && arg2 == this.field1019) {
				this.loadStatus = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.loadedGroups[arg2] = false;
				if (this.remoteEnabled || arg0) {
					Js5Net.queueRequest(arg0, (byte) 2, arg2, this.archive, this, super.groupChecksums[arg2]);
				}
			} else {
				crc32.reset();
				crc32.update(arg1, 0, arg1.length - 2);
				int var5 = (int) crc32.getValue();
				int var6 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
				if (super.groupChecksums[arg2] == var5 && super.groupVersions[arg2] == var6) {
					this.loadedGroups[arg2] = true;
					if (arg0) {
						super.packed[arg2] = ByteArrayWrapper.wrap(arg1);
					}
				} else {
					this.loadedGroups[arg2] = false;
					if (this.remoteEnabled || arg0) {
						Js5Net.queueRequest(arg0, (byte) 2, arg2, this.archive, this, super.groupChecksums[arg2]);
					}
				}
			}
		} else if (this.loadStatus) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Js5Net.queueRequest(true, (byte) 0, this.archive, 255, this, this.indexCrc);
		} else {
			crc32.reset();
			crc32.update(arg1, 0, arg1.length);
			int var7 = (int) crc32.getValue();
			Packet var8 = new Packet(Js5.getUncompressedPacket(arg1));
			int var9 = var8.g1();
			if (var9 != 5 && var9 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + var9);
			}
			int var10 = 0;
			if (var9 >= 6) {
				var10 = var8.g4();
			}
			if (this.indexCrc == var7 && var10 == this.indexVersion) {
				this.decodeIndex(arg1);
				this.loadAllLocal();
			} else {
				Js5Net.queueRequest(true, (byte) 0, this.archive, 255, this, this.indexCrc);
			}
		}
	}

	@ObfuscatedName("ga.f(I)V")
	public void loadAllLocal() {
		this.loadedGroups = new boolean[super.packed.length];
		for (int var1 = 0; var1 < this.loadedGroups.length; var1++) {
			this.loadedGroups[var1] = false;
		}
		if (this.dataFile == null) {
			this.loadStatus = true;
			return;
		}
		this.field1019 = -1;
		for (int var2 = 0; var2 < this.loadedGroups.length; var2++) {
			if (super.groupSizes[var2] > 0) {
				Js5NetThread.method1002(var2, this.dataFile, this);
				this.field1019 = var2;
			}
		}
		if (this.field1019 == -1) {
			this.loadStatus = true;
		}
	}

	@ObfuscatedName("ga.a(II)V")
	@Override
	public void requestGroupDownload2(int arg0) {
		if (this.dataFile == null || this.loadedGroups == null || !this.loadedGroups[arg0]) {
			Js5Net.queueRequest(true, (byte) 2, arg0, this.archive, this, super.groupChecksums[arg0]);
		} else {
			Js5NetThread.queueRequest(arg0, this, this.dataFile);
		}
	}

	@ObfuscatedName("ga.g(I)I")
	public int getIndexLoadProgress() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < super.packed.length; var3++) {
			if (super.groupSizes[var3] > 0) {
				var1 += this.getGroupLoadProgress(var3);
				var2 += 100;
			}
		}
		if (var2 == 0) {
			return 100;
		} else {
			return var1 * 100 / var2;
		}
	}
}
