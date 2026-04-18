package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("sa")
public final class DataFile {

    @ObfuscatedName("h.kc")
    public static byte[] temp = new byte[520];
    @ObfuscatedName("sa.a")
	public BufferedRandomAccessFile dat = null;

	@ObfuscatedName("sa.e")
	public BufferedRandomAccessFile idx = null;

	@ObfuscatedName("sa.m")
	public int maxFileSize = 65000;

	@ObfuscatedName("sa.p")
	public final int archive;

	@Override
	public String toString() {
		return "Cache:" + this.archive;
	}

	@ObfuscatedName("sa.a(IB)[B")
	public byte[] readFromFile(int arg0) {
		BufferedRandomAccessFile var2 = this.dat;
		synchronized (this.dat) {
			try {
				if (this.idx.length() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.idx.seek((long) (arg0 * 6));
				this.idx.read(0, 6, temp);
				int var4 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
				int var5 = (temp[2] & 0xFF) + (((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8));
				if (var5 < 0 || var5 > this.maxFileSize) {
					return null;
				} else if (var4 > 0 && (long) var4 <= this.dat.length() / 520L) {
					int var8 = 0;
					int var9 = 0;
					byte[] var10 = new byte[var5];
					while (var5 > var8) {
						if (var4 == 0) {
							return null;
						}
						this.dat.seek((long) (var4 * 520));
						int var12 = var5 - var8;
						if (var12 > 512) {
							var12 = 512;
						}
						this.dat.read(0, var12 + 8, temp);
						int var13 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var14 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
						int var15 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						int var16 = temp[7] & 0xFF;
						if (arg0 == var13 && var9 == var15 && this.archive == var16) {
							if (var14 >= 0 && (long) var14 <= this.dat.length() / 520L) {
								var9++;
								for (int var19 = 0; var19 < var12; var19++) {
									var10[var8++] = temp[var19 + 8];
								}
								var4 = var14;
								continue;
							}
							return null;
						}
						return null;
					}
					return var10;
				} else {
					return null;
				}
			} catch (IOException var21) {
				return null;
			}
		}
	}

	@ObfuscatedName("sa.a([BIZIB)Z")
	public boolean writeToFile(byte[] arg0, int arg1, boolean arg2, int arg3) {
		BufferedRandomAccessFile var5 = this.dat;
		synchronized (this.dat) {
			try {
				int var6;
				if (arg2) {
					if (this.idx.length() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.idx.seek((long) (arg3 * 6));
					this.idx.read(0, 6, temp);
					var6 = (temp[5] & 0xFF) + (((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8));
					if (var6 <= 0 || (long) var6 > this.dat.length() / 520L) {
						return false;
					}
				} else {
					var6 = (int) ((this.dat.length() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				temp[0] = (byte) (arg1 >> 16);
				temp[1] = (byte) (arg1 >> 8);
				temp[2] = (byte) arg1;
				int var7 = 0;
				temp[3] = (byte) (var6 >> 16);
				int var8 = 0;
				temp[4] = (byte) (var6 >> 8);
				temp[5] = (byte) var6;
				this.idx.seek((long) (arg3 * 6));
				this.idx.write(0, 6, temp);
				while (var7 < arg1) {
					int var9 = 0;
					if (arg2) {
						this.dat.seek((long) (var6 * 520));
						try {
							this.dat.read(0, 8, temp);
						} catch (EOFException var14) {
							return true;
						}
						var9 = (temp[6] & 0xFF) + (((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8));
						int var10 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var11 = temp[7] & 0xFF;
						int var12 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						if (arg3 != var10 || var8 != var12 || this.archive != var11) {
							return false;
						}
						if (var9 < 0 || this.dat.length() / 520L < (long) var9) {
							return false;
						}
					}
					if (var9 == 0) {
						arg2 = false;
						var9 = (int) ((this.dat.length() + 519L) / 520L);
						if (var9 == 0) {
							var9++;
						}
						if (var6 == var9) {
							var9++;
						}
					}
					temp[0] = (byte) (arg3 >> 8);
					if (arg1 - var7 <= 512) {
						var9 = 0;
					}
					temp[1] = (byte) arg3;
					int var13 = arg1 - var7;
					if (var13 > 512) {
						var13 = 512;
					}
					temp[2] = (byte) (var8 >> 8);
					temp[3] = (byte) var8;
					temp[4] = (byte) (var9 >> 16);
					temp[5] = (byte) (var9 >> 8);
					var8++;
					temp[6] = (byte) var9;
					temp[7] = (byte) this.archive;
					this.dat.seek((long) (var6 * 520));
					this.dat.write(0, 8, temp);
					var6 = var9;
					this.dat.write(var7, var13, arg0);
					var7 += var13;
				}
				return true;
			} catch (IOException var15) {
				return false;
			}
		}
	}

	public DataFile(int arg0, BufferedRandomAccessFile arg1, BufferedRandomAccessFile arg2, int arg3) {
		this.maxFileSize = arg3;
		this.idx = arg2;
		this.dat = arg1;
		this.archive = arg0;
	}

	@ObfuscatedName("sa.a([BIII)Z")
	public boolean writeToFile(byte[] arg0, int arg1, int arg2) {
		BufferedRandomAccessFile var4 = this.dat;
		synchronized (this.dat) {
			if (arg1 < 0 || arg1 > this.maxFileSize) {
				throw new IllegalArgumentException();
			}
			boolean var5 = this.writeToFile(arg0, arg1, true, arg2);
			if (!var5) {
				var5 = this.writeToFile(arg0, arg1, false, arg2);
			}
			return var5;
		}
	}
}
