package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ud")
public final class DataFile {

	@ObfuscatedName("ud.b")
	public BufferedRandomAccessFile idx = null;

	@ObfuscatedName("ud.c")
	public final int archive;

	@ObfuscatedName("ud.e")
	public int maxFileSize = 65000;

	@ObfuscatedName("ud.g")
	public BufferedRandomAccessFile dat = null;

	public DataFile(int arg0, BufferedRandomAccessFile arg1, BufferedRandomAccessFile arg2, int arg3) {
		this.archive = arg0;
		this.maxFileSize = arg3;
		this.dat = arg1;
		this.idx = arg2;
	}

	@ObfuscatedName("ud.a(IIIZ[B)Z")
	public boolean writeToFile(int arg0, int arg1, boolean arg2, byte[] arg3) {
		BufferedRandomAccessFile var5 = this.dat;
		synchronized (this.dat) {
			try {
				int var6;
				if (arg2) {
					if (this.idx.length() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.idx.seek((long) (arg1 * 6));
					this.idx.read(FileOnDisk.field4303, 0, 6);
					var6 = ((FileOnDisk.field4303[4] & 0xFF) << 8) + ((FileOnDisk.field4303[3] & 0xFF) << 16) + (FileOnDisk.field4303[5] & 0xFF);
					if (var6 <= 0 || (long) var6 > this.dat.length() / 520L) {
						return false;
					}
				} else {
					var6 = (int) ((this.dat.length() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				FileOnDisk.field4303[0] = (byte) (arg0 >> 16);
				FileOnDisk.field4303[5] = (byte) var6;
				int var7 = 0;
				FileOnDisk.field4303[2] = (byte) arg0;
				FileOnDisk.field4303[4] = (byte) (var6 >> 8);
				FileOnDisk.field4303[3] = (byte) (var6 >> 16);
				int var8 = 0;
				FileOnDisk.field4303[1] = (byte) (arg0 >> 8);
				this.idx.seek((long) (arg1 * 6));
				this.idx.write(FileOnDisk.field4303, 6, 0);
				while (var7 < arg0) {
					int var9 = 0;
					if (arg2) {
						this.dat.seek((long) (var6 * 520));
						try {
							this.dat.read(FileOnDisk.field4303, 0, 8);
						} catch (EOFException var14) {
							return true;
						}
						var9 = (FileOnDisk.field4303[6] & 0xFF) + ((FileOnDisk.field4303[5] & 0xFF) << 8) + ((FileOnDisk.field4303[4] & 0xFF) << 16);
						int var10 = ((FileOnDisk.field4303[0] & 0xFF) << 8) + (FileOnDisk.field4303[1] & 0xFF);
						int var11 = ((FileOnDisk.field4303[2] & 0xFF) << 8) + (FileOnDisk.field4303[3] & 0xFF);
						int var12 = FileOnDisk.field4303[7] & 0xFF;
						if (var10 != arg1 || var8 != var11 || var12 != this.archive) {
							return false;
						}
						if (var9 < 0 || this.dat.length() / 520L < (long) var9) {
							return false;
						}
					}
					if (var9 == 0) {
						var9 = (int) ((this.dat.length() + 519L) / 520L);
						arg2 = false;
						if (var9 == 0) {
							var9++;
						}
						if (var9 == var6) {
							var9++;
						}
					}
					FileOnDisk.field4303[2] = (byte) (var8 >> 8);
					FileOnDisk.field4303[1] = (byte) arg1;
					FileOnDisk.field4303[3] = (byte) var8;
					FileOnDisk.field4303[0] = (byte) (arg1 >> 8);
					FileOnDisk.field4303[7] = (byte) this.archive;
					var8++;
					if (arg0 - var7 <= 512) {
						var9 = 0;
					}
					FileOnDisk.field4303[5] = (byte) (var9 >> 8);
					int var13 = arg0 - var7;
					if (var13 > 512) {
						var13 = 512;
					}
					FileOnDisk.field4303[4] = (byte) (var9 >> 16);
					FileOnDisk.field4303[6] = (byte) var9;
					this.dat.seek((long) (var6 * 520));
					var6 = var9;
					this.dat.write(FileOnDisk.field4303, 8, 0);
					this.dat.write(arg3, var13, var7);
					var7 += var13;
				}
				return true;
			} catch (IOException var15) {
				return false;
			}
		}
	}

	@ObfuscatedName("ud.a(IB)[B")
	public byte[] readFromFile(int arg0) {
		BufferedRandomAccessFile var2 = this.dat;
		synchronized (this.dat) {
			try {
				if ((long) (arg0 * 6 + 6) > this.idx.length()) {
					return null;
				}
				this.idx.seek((long) (arg0 * 6));
				this.idx.read(FileOnDisk.field4303, 0, 6);
				int var4 = (FileOnDisk.field4303[2] & 0xFF) + ((FileOnDisk.field4303[1] & 0xFF) << 8) + ((FileOnDisk.field4303[0] & 0xFF) << 16);
				int var5 = (FileOnDisk.field4303[5] & 0xFF) + ((FileOnDisk.field4303[4] & 0xFF) << 8) + ((FileOnDisk.field4303[3] & 0xFF) << 16);
				if (var4 < 0 || this.maxFileSize < var4) {
					return null;
				} else if (var5 > 0 && this.dat.length() / 520L >= (long) var5) {
					byte[] var8 = new byte[var4];
					int var9 = 0;
					int var10 = 0;
					while (var4 > var9) {
						if (var5 == 0) {
							return null;
						}
						this.dat.seek((long) (var5 * 520));
						int var12 = var4 - var9;
						if (var12 > 512) {
							var12 = 512;
						}
						this.dat.read(FileOnDisk.field4303, 0, var12 + 8);
						int var13 = (FileOnDisk.field4303[1] & 0xFF) + ((FileOnDisk.field4303[0] & 0xFF) << 8);
						int var14 = ((FileOnDisk.field4303[5] & 0xFF) << 8) + (FileOnDisk.field4303[4] << 16 & 0xFF0000) + (FileOnDisk.field4303[6] & 0xFF);
						int var15 = FileOnDisk.field4303[7] & 0xFF;
						int var16 = (FileOnDisk.field4303[3] & 0xFF) + ((FileOnDisk.field4303[2] & 0xFF) << 8);
						if (var13 == arg0 && var10 == var16 && this.archive == var15) {
							if (var14 >= 0 && (long) var14 <= this.dat.length() / 520L) {
								for (int var19 = 0; var19 < var12; var19++) {
									var8[var9++] = FileOnDisk.field4303[var19 + 8];
								}
								var5 = var14;
								var10++;
								continue;
							}
							return null;
						}
						return null;
					}
					return var8;
				} else {
					return null;
				}
			} catch (IOException var21) {
				return null;
			}
		}
	}

	@ObfuscatedName("ud.a([BIII)Z")
	public boolean writeToFile(byte[] arg0, int arg1, int arg2) {
		BufferedRandomAccessFile var4 = this.dat;
		synchronized (this.dat) {
			if (arg2 < 0 || arg2 > this.maxFileSize) {
				throw new IllegalArgumentException();
			}
			boolean var5 = this.writeToFile(arg2, arg1, true, arg0);
			if (!var5) {
				var5 = this.writeToFile(arg2, arg1, false, arg0);
			}
			return var5;
		}
	}

	@Override
	public String toString() {
		return "Cache:" + this.archive;
	}
}
