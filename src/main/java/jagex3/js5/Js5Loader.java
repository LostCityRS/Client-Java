package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.io.DataFile;

import java.util.zip.CRC32;

@ObfuscatedName("u")
public final class Js5Loader extends Js5 {

    @ObfuscatedName("w.b")
    public static CRC32 crc32 = new CRC32();
    @ObfuscatedName("u.fb")
	public volatile boolean[] loadedGroups;

	@ObfuscatedName("u.gb")
	public int field2976 = -1;

	@ObfuscatedName("u.jb")
	public volatile boolean loadStatus = false;

	@ObfuscatedName("u.lb")
	public final DataFile indexDataFile;

	@ObfuscatedName("u.qb")
	public final int archive;

	@ObfuscatedName("u.tb")
	public int indexCrc;

	@ObfuscatedName("u.ub")
	public boolean remoteEnabled = false;

	@ObfuscatedName("u.vb")
	public final DataFile dataFile;

	@ObfuscatedName("u.a(ZZIZ[B)V")
	public void write(boolean arg0, int arg1, boolean arg2, byte[] arg3) {
		if (!arg0) {
			arg3[arg3.length - 2] = (byte) (super.groupVersions[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.groupVersions[arg1];
			if (this.dataFile != null) {
				Js5NetThread.method464(arg3, this.dataFile, arg1);
				this.loadedGroups[arg1] = true;
			}
			if (arg2) {
				super.packed[arg1] = arg3;
			}
		} else if (this.loadStatus) {
			throw new RuntimeException();
		} else {
			if (this.indexDataFile != null) {
				Js5NetThread.method464(arg3, this.indexDataFile, this.archive);
			}
			this.decodeIndex(arg3);
			this.loadAllLocal();
		}
	}

	@ObfuscatedName("u.d(I)I")
	public int getIndexPercentage() {
		if (this.loadStatus) {
			return 100;
		} else if (super.packed == null) {
			int var1 = Js5Net.transferProgress(255, this.archive);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		} else {
			return 99;
		}
	}

	@ObfuscatedName("u.a(BZ[BILsa;)V")
	public void loadIndex(boolean arg0, byte[] arg1, int arg2, DataFile arg3) {
		if (this.indexDataFile == arg3) {
			if (this.loadStatus) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Js5Net.queueRequest(true, this, 255, this.archive, (byte) 0, this.indexCrc);
				return;
			}
			crc32.reset();
			crc32.update(arg1, 0, arg1.length);
			int var5 = (int) crc32.getValue();
			if (this.indexCrc != var5) {
				Js5Net.queueRequest(true, this, 255, this.archive, (byte) 0, this.indexCrc);
				return;
			}
			this.decodeIndex(arg1);
			this.loadAllLocal();
			return;
		}
		if (!arg0 && this.field2976 == arg2) {
			this.loadStatus = true;
		}
		if (arg1 == null || arg1.length <= 2) {
			this.loadedGroups[arg2] = false;
			if (this.remoteEnabled || arg0) {
				Js5Net.queueRequest(arg0, this, this.archive, arg2, (byte) 2, super.groupChecksums[arg2]);
			}
			return;
		}
		crc32.reset();
		crc32.update(arg1, 0, arg1.length - 2);
		int var6 = (int) crc32.getValue();
		int var7 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
		if (super.groupChecksums[arg2] != var6 || super.groupVersions[arg2] != var7) {
			this.loadedGroups[arg2] = false;
			if (this.remoteEnabled || arg0) {
				Js5Net.queueRequest(arg0, this, this.archive, arg2, (byte) 2, super.groupChecksums[arg2]);
			}
			return;
		}
		this.loadedGroups[arg2] = true;
		if (arg0) {
			super.packed[arg2] = arg1;
		}
	}

	@ObfuscatedName("u.b(II)V")
	@Override
	public void requestGroupDownload2(int arg0) {
		if (this.dataFile == null || this.loadedGroups == null || !this.loadedGroups[arg0]) {
			Js5Net.queueRequest(true, this, this.archive, arg0, (byte) 2, super.groupChecksums[arg0]);
		} else {
			Js5NetThread.queueRequest(this, arg0, this.dataFile);
		}
	}

	@ObfuscatedName("u.a(IB)V")
	@Override
	public void updateCacheHint(int arg0) {
		Js5Net.updateCacheHint(this.archive, arg0);
	}

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.dataFile = arg0;
		this.remoteEnabled = arg5;
		this.indexDataFile = arg1;
		this.archive = arg2;
		Js5Net.method280(this, this.archive);
	}

	@ObfuscatedName("u.e(I)V")
	public void loadAllLocal() {
		this.loadedGroups = new boolean[super.packed.length];
		for (int var1 = 0; var1 < this.loadedGroups.length; var1++) {
			this.loadedGroups[var1] = false;
		}
		if (this.dataFile == null) {
			this.loadStatus = true;
			return;
		}
		this.field2976 = -1;
		for (int var2 = 0; var2 < this.loadedGroups.length; var2++) {
			if (super.groupSizes[var2] > 0) {
				Js5NetThread.method410(var2, this, this.dataFile);
				this.field2976 = var2;
			}
		}
		if (this.field2976 == -1) {
			this.loadStatus = true;
		}
	}

	@ObfuscatedName("u.d(II)V")
	public void requestIndex(int arg0) {
		this.indexCrc = arg0;
		if (this.indexDataFile == null) {
			Js5Net.queueRequest(true, this, 255, this.archive, (byte) 0, this.indexCrc);
		} else {
			Js5NetThread.queueRequest(this, this.archive, this.indexDataFile);
		}
	}

	@ObfuscatedName("u.e(II)I")
	public int getGroupLoadProgress(int arg0) {
		if (super.packed[arg0] == null) {
			return this.loadedGroups[arg0] ? 100 : Js5Net.transferProgress(this.archive, arg0);
		} else {
			return 100;
		}
	}

	@ObfuscatedName("u.c(Z)I")
	public int getIndexLoadProgress() {
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < super.packed.length; var3++) {
			if (super.groupSizes[var3] > 0) {
				var1 += 100;
				var2 += this.getGroupLoadProgress(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}
}
