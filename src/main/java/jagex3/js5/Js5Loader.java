package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.io.ByteArrayWrapper;
import jagex3.io.DataFile;
import jagex3.io.Packet;

import java.util.zip.CRC32;

@ObfuscatedName("bj")
public final class Js5Loader extends Js5 {

	@ObfuscatedName("uh.M")
	public static final CRC32 js5Crc32 = new CRC32();
	@ObfuscatedName("bj.cb")
	public volatile boolean[] loadedGroups;

	@ObfuscatedName("bj.fb")
	public final DataFile dataFile;

	@ObfuscatedName("bj.gb")
	public final int archive;

	@ObfuscatedName("bj.mb")
	public final DataFile indexDataFile;

	@ObfuscatedName("bj.ob")
	public boolean remoteEnabled = false;

	@ObfuscatedName("bj.tb")
	public int indexVersion;

	@ObfuscatedName("bj.ub")
	public volatile boolean loadStatus = false;

	@ObfuscatedName("bj.vb")
	public int indexCrc;

	@ObfuscatedName("bj.yb")
	public int lastLocalGroup = -1;

	public Js5Loader(DataFile arg0, DataFile arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
		super(arg3, arg4);
		this.indexDataFile = arg1;
		this.remoteEnabled = arg5;
		this.archive = arg2;
		this.dataFile = arg0;
		Js5Net.registerProvider(this.archive, this);
	}

	@ObfuscatedName("bj.a(I[BZIZ)V")
	public void write(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
		if (arg3) {
			if (this.loadStatus) {
				throw new RuntimeException();
			}
			if (this.indexDataFile != null) {
				Js5NetThread.queueWrite(arg1, this.archive, this.indexDataFile);
			}
			this.decodeIndex(arg1);
			this.loadAllLocal();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.groupVersions[arg0] >> 8);
		arg1[arg1.length - 1] = (byte) super.groupVersions[arg0];
		if (this.dataFile != null) {
			Js5NetThread.queueWrite(arg1, arg0, this.dataFile);
			this.loadedGroups[arg0] = true;
		}
		if (arg2) {
			super.packed[arg0] = ByteArrayWrapper.wrap(arg1);
			return;
		}
	}

	@ObfuscatedName("bj.c(III)V")
	public void requestIndex(int arg0, int arg1) {
		this.indexCrc = arg0;
		this.indexVersion = arg1;
		if (this.indexDataFile == null) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
		} else {
			Js5NetThread.queueRequest(this, this.archive, this.indexDataFile);
		}
	}

	@ObfuscatedName("bj.a(II)V")
	@Override
	public void updateCacheHint(int arg0) {
		if (this.isGroupValid(arg0)) {
			Js5Net.updateCacheHint(this.archive, arg0);
		}
	}

	@ObfuscatedName("bj.a([BILud;BZ)V")
	public void loadIndex(byte[] arg0, int arg1, DataFile arg2, boolean arg3) {
		if (arg2 != this.indexDataFile) {
			if (!arg3 && arg1 == this.lastLocalGroup) {
				this.loadStatus = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.loadedGroups[arg1] = false;
				if (this.remoteEnabled || arg3) {
					Js5Net.queueRequest(this, arg1, this.archive, (byte) 2, super.groupChecksums[arg1], arg3);
				}
				return;
			}
			js5Crc32.reset();
			js5Crc32.update(arg0, 0, arg0.length - 2);
			int var5 = (int) js5Crc32.getValue();
			int var6 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (var5 != super.groupChecksums[arg1] || super.groupVersions[arg1] != var6) {
				this.loadedGroups[arg1] = false;
				if (this.remoteEnabled || arg3) {
					Js5Net.queueRequest(this, arg1, this.archive, (byte) 2, super.groupChecksums[arg1], arg3);
				}
				return;
			}
			this.loadedGroups[arg1] = true;
			if (arg3) {
				super.packed[arg1] = ByteArrayWrapper.wrap(arg0);
				return;
			}
			return;
		}
		if (this.loadStatus) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
			return;
		}
		js5Crc32.reset();
		js5Crc32.update(arg0, 0, arg0.length);
		int var7 = (int) js5Crc32.getValue();
		if (var7 != this.indexCrc) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
			return;
		}
		Packet var8;
		try {
			var8 = new Packet(Js5.getUncompressedPacket(arg0));
		} catch (RuntimeException var11) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
			return;
		}
		int var9 = var8.g1();
		if (var9 != 5 && var9 != 6) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
			return;
		}
		int var10 = 0;
		if (var9 >= 6) {
			var10 = var8.g4();
		}
		if (this.indexVersion != var10) {
			Js5Net.queueRequest(this, this.archive, 255, (byte) 0, this.indexCrc, true);
			return;
		}
		this.decodeIndex(arg0);
		this.loadAllLocal();
	}

	@ObfuscatedName("bj.a(IZ)V")
	@Override
	public void requestGroupDownload2(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return;
		}
		if (this.dataFile == null || this.loadedGroups == null || !this.loadedGroups[arg0]) {
			Js5Net.queueRequest(this, arg0, this.archive, (byte) 2, super.groupChecksums[arg0], true);
		} else {
			Js5NetThread.queueRequest(this, arg0, this.dataFile);
		}
	}

	@ObfuscatedName("bj.c(I)V")
	public void loadAllLocal() {
		this.loadedGroups = new boolean[super.packed.length];
		for (int var1 = 0; var1 < this.loadedGroups.length; var1++) {
			this.loadedGroups[var1] = false;
		}
		if (this.dataFile == null) {
			this.loadStatus = true;
			return;
		}
		this.lastLocalGroup = -1;
		for (int var2 = 0; var2 < this.loadedGroups.length; var2++) {
			if (super.groupSizes[var2] > 0) {
				Js5NetThread.queueRead(var2, this, this.dataFile);
				this.lastLocalGroup = var2;
			}
		}
		if (this.lastLocalGroup == -1) {
			this.loadStatus = true;
		}
	}

	@ObfuscatedName("bj.d(Z)I")
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

	@ObfuscatedName("bj.a(BI)I")
	@Override
	public int getGroupLoadProgress(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return 0;
		} else if (super.packed[arg0] == null) {
			return this.loadedGroups[arg0] ? 100 : Js5Net.transferProgress(this.archive, arg0);
		} else {
			return 100;
		}
	}
}
