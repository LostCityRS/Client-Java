package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tb")
public final class DataFile {

    @ObfuscatedName("j.bc")
    public static byte[] temp = new byte[520];

    @ObfuscatedName("tb.j")
	public final int archive;

	@ObfuscatedName("tb.k")
	public int maxFileSize = 65000;

	@ObfuscatedName("tb.l")
	public BufferedRandomAccessFile dat = null;

	@ObfuscatedName("tb.w")
	public BufferedRandomAccessFile idx = null;

	public DataFile(int arg0, BufferedRandomAccessFile arg1, BufferedRandomAccessFile arg2, int arg3) {
		this.idx = arg2;
		this.archive = arg0;
		this.maxFileSize = arg3;
		this.dat = arg1;
	}

	@ObfuscatedName("tb.a(IIZZ[B)Z")
	public boolean writeToFile(int arg0, int arg1, boolean arg2, byte[] arg3) {
		BufferedRandomAccessFile var5 = this.dat;
		synchronized (this.dat) {
			try {
				int var6;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.idx.length()) {
						return false;
					}
					this.idx.seek((long) (arg0 * 6));
					this.idx.read(6, temp, 0);
					var6 = ((temp[3] & 0xFF) << 16) - (-((temp[4] & 0xFF) << 8) - (temp[5] & 0xFF));
					if (var6 <= 0 || this.dat.length() / 520L < (long) var6) {
						return false;
					}
				} else {
					var6 = (int) ((this.dat.length() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				temp[3] = (byte) (var6 >> 16);
				temp[4] = (byte) (var6 >> 8);
				temp[0] = (byte) (arg1 >> 16);
				temp[5] = (byte) var6;
				temp[2] = (byte) arg1;
				int var7 = 0;
				temp[1] = (byte) (arg1 >> 8);
				int var8 = 0;
				this.idx.seek((long) (arg0 * 6));
				this.idx.write(temp, 6, 0);
				while (arg1 > var7) {
					int var9 = 0;
					if (arg2) {
						this.dat.seek((long) (var6 * 520));
						try {
							this.dat.read(8, temp, 0);
						} catch (EOFException var14) {
							return true;
						}
						var9 = ((temp[4] & 0xFF) << 16) + ((temp[5] << 8 & 0xFF00) + (temp[6] & 0xFF));
						int var10 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var11 = (temp[3] & 0xFF) + ((temp[2] & 0xFF) << 8);
						int var12 = temp[7] & 0xFF;
						if (var10 != arg0 || var8 != var11 || this.archive != var12) {
							return false;
						}
						if (var9 < 0 || (long) var9 > this.dat.length() / 520L) {
							return false;
						}
					}
					if (var9 == 0) {
						arg2 = false;
						var9 = (int) ((this.dat.length() + 519L) / 520L);
						if (var9 == 0) {
							var9++;
						}
						if (var9 == var6) {
							var9++;
						}
					}
					temp[2] = (byte) (var8 >> 8);
					temp[3] = (byte) var8;
					temp[1] = (byte) arg0;
					int var13 = arg1 - var7;
					temp[7] = (byte) this.archive;
					var8++;
					temp[0] = (byte) (arg0 >> 8);
					if (var13 > 512) {
						var13 = 512;
					}
					if (arg1 - var7 <= 512) {
						var9 = 0;
					}
					temp[6] = (byte) var9;
					temp[5] = (byte) (var9 >> 8);
					temp[4] = (byte) (var9 >> 16);
					this.dat.seek((long) (var6 * 520));
					this.dat.write(temp, 8, 0);
					this.dat.write(arg3, var13, var7);
					var6 = var9;
					var7 += var13;
				}
				return true;
			} catch (IOException var15) {
				return false;
			}
		}
	}

	@ObfuscatedName("tb.a(II)[B")
	public byte[] readFromFile(int arg0) {
		BufferedRandomAccessFile var2 = this.dat;
		synchronized (this.dat) {
			try {
				if ((long) (arg0 * 6 + 6) > this.idx.length()) {
					return null;
				}
				this.idx.seek((long) (arg0 * 6));
				this.idx.read(6, temp, 0);
				int var4 = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
				int var5 = ((temp[4] & 0xFF) << 8) + ((temp[3] & 0xFF) << 16) + (temp[5] & 0xFF);
				if (var4 < 0 || var4 > this.maxFileSize) {
					return null;
				} else if (var5 > 0 && (long) var5 <= this.dat.length() / 520L) {
					byte[] var8 = new byte[var4];
					int var9 = 0;
					int var10 = 0;
					label55: while (var9 < var4) {
						if (var5 == 0) {
							return null;
						}
						this.dat.seek((long) (var5 * 520));
						int var12 = var4 - var9;
						if (var12 > 512) {
							var12 = 512;
						}
						this.dat.read(var12 + 8, temp, 0);
						int var13 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						int var14 = (temp[1] & 0xFF) + ((temp[0] & 0xFF) << 8);
						int var15 = (temp[6] & 0xFF) + (((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8));
						int var16 = temp[7] & 0xFF;
						if (arg0 == var14 && var10 == var13 && var16 == this.archive) {
							if (var15 >= 0 && (long) var15 <= this.dat.length() / 520L) {
								var5 = var15;
								var10++;
								int var19 = 0;
								while (true) {
									if (var12 <= var19) {
										continue label55;
									}
									var8[var9++] = temp[var19 + 8];
									var19++;
								}
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

	@Override
	public String toString() {
		return "Cache:" + this.archive;
	}

	@ObfuscatedName("tb.a(BII[B)Z")
	public boolean writeToFile(int arg0, int arg1, byte[] arg2) {
		BufferedRandomAccessFile var4 = this.dat;
		synchronized (this.dat) {
			if (arg1 < 0 || this.maxFileSize < arg1) {
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
