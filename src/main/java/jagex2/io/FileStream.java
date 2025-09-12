package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.c")
	public static byte[] temp = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile dat;

	@ObfuscatedName("wb.e")
	public RandomAccessFile idx;

	@ObfuscatedName("wb.f")
	public int archive;

	@ObfuscatedName("wb.g")
	public int maxFileSize = 65000;

	public FileStream(RandomAccessFile arg1, int arg2, int arg3, RandomAccessFile arg4) {
		this.archive = arg2;
		this.dat = arg1;
		this.idx = arg4;
		this.maxFileSize = arg3;
	}

	@ObfuscatedName("wb.a(ZI)[B")
	public synchronized byte[] read(int arg1) {
		try {
			this.seek(this.idx, arg1 * 6);
			int var4;
			for (int var3 = 0; var3 < 6; var3 += var4) {
				var4 = this.idx.read(temp, var3, 6 - var3);
				if (var4 == -1) {
					return null;
				}
			}
			int var5 = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
			int var6 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
			if (var5 < 0 || var5 > this.maxFileSize) {
				return null;
			} else if (var6 > 0 && (long) var6 <= this.dat.length() / 520L) {
				byte[] var7 = new byte[var5];
				int var8 = 0;
				int var9 = 0;
				while (var8 < var5) {
					if (var6 == 0) {
						return null;
					}
					this.seek(this.dat, var6 * 520);
					int var10 = 0;
					int var11 = var5 - var8;
					if (var11 > 512) {
						var11 = 512;
					}
					while (var10 < var11 + 8) {
						int var12 = this.dat.read(temp, var10, var11 + 8 - var10);
						if (var12 == -1) {
							return null;
						}
						var10 += var12;
					}
					int var13 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
					int var14 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
					int var15 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
					int var16 = temp[7] & 0xFF;
					if (var13 == arg1 && var14 == var9 && var16 == this.archive) {
						if (var15 >= 0 && (long) var15 <= this.dat.length() / 520L) {
							for (int var17 = 0; var17 < var11; var17++) {
								var7[var8++] = temp[var17 + 8];
							}
							var6 = var15;
							var9++;
							continue;
						}
						return null;
					}
					return null;
				}
				return var7;
			} else {
				return null;
			}
		} catch (IOException var18) {
			return null;
		}
	}

	@ObfuscatedName("wb.a([BIIB)Z")
	public synchronized boolean write(byte[] arg0, int arg1, int arg2) {
		boolean var5 = this.write(arg1, arg2, arg0, true);
		if (!var5) {
			var5 = this.write(arg1, arg2, arg0, false);
		}
		return var5;
	}

	@ObfuscatedName("wb.a(II[BZZ)Z")
	public synchronized boolean write(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var8;
			if (arg3) {
				this.seek(this.idx, arg0 * 6);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = this.idx.read(temp, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
				if (var8 <= 0 || (long) var8 > this.dat.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((this.dat.length() + 519L) / 520L);
				if (var8 == 0) {
					var8 = 1;
				}
			}
			temp[0] = (byte) (arg1 >> 16);
			temp[1] = (byte) (arg1 >> 8);
			temp[2] = (byte) arg1;
			temp[3] = (byte) (var8 >> 16);
			temp[4] = (byte) (var8 >> 8);
			temp[5] = (byte) var8;
			this.seek(this.idx, arg0 * 6);
			this.idx.write(temp, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg1) {
				int var11 = 0;
				if (arg3) {
					this.seek(this.dat, var8 * 520);
					int var12;
					int var13;
					for (var12 = 0; var12 < 8; var12 += var13) {
						var13 = this.dat.read(temp, var12, 8 - var12);
						if (var13 == -1) {
							break;
						}
					}
					if (var12 == 8) {
						label110: {
							int var14 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
							int var15 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
							var11 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
							int var16 = temp[7] & 0xFF;
							if (var14 == arg0 && var15 == var10 && var16 == this.archive) {
								if (var11 >= 0 && (long) var11 <= this.dat.length() / 520L) {
									break label110;
								}
								return false;
							}
							return false;
						}
					}
				}
				if (var11 == 0) {
					arg3 = false;
					var11 = (int) ((this.dat.length() + 519L) / 520L);
					if (var11 == 0) {
						var11++;
					}
					if (var11 == var8) {
						var11++;
					}
				}
				if (arg1 - var9 <= 512) {
					var11 = 0;
				}
				temp[0] = (byte) (arg0 >> 8);
				temp[1] = (byte) arg0;
				temp[2] = (byte) (var10 >> 8);
				temp[3] = (byte) var10;
				temp[4] = (byte) (var11 >> 16);
				temp[5] = (byte) (var11 >> 8);
				temp[6] = (byte) var11;
				temp[7] = (byte) this.archive;
				this.seek(this.dat, var8 * 520);
				this.dat.write(temp, 0, 8);
				int var17 = arg1 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				this.dat.write(arg2, var9, var17);
				var9 += var17;
				var8 = var11;
				var10++;
			}
			return true;
		} catch (IOException var18) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(ILjava/io/RandomAccessFile;I)V")
	public synchronized void seek(RandomAccessFile arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg2 > 62914560) {
			System.out.println("Badseek - pos:" + arg2 + " len:" + arg1.length());
			arg2 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
		}
		arg1.seek((long) arg2);
	}
}
