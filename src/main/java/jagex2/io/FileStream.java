package jagex2.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.a")
	public int field856;

	@ObfuscatedName("wb.b")
	public boolean field857 = true;

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

	public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, boolean arg3, int arg4) {
		this.archive = arg0;
		this.dat = arg2;
		this.idx = arg1;
		this.maxFileSize = arg4;
		if (!arg3) {
			throw new NullPointerException();
		}
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] read(int arg0, int arg1) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		try {
			this.seek(arg1 * 6, 482, this.idx);
			int var4;
			for (int var3 = 0; var3 < 6; var3 += var4) {
				var4 = this.idx.read(temp, var3, 6 - var3);
				if (var4 == -1) {
					return null;
				}
			}
			int var5 = (temp[2] & 0xFF) + ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8);
			int var6 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
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
					this.seek(var6 * 520, 482, this.dat);
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
					int var15 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
					int var16 = temp[7] & 0xFF;
					if (arg1 == var13 && var9 == var14 && this.archive == var16) {
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

	@ObfuscatedName("wb.a([BIZI)Z")
	public synchronized boolean write(byte[] arg0, int arg1, boolean arg2, int arg3) {
		boolean var5 = this.write(arg0, arg1, true, -20133, arg3);
		if (!arg2) {
			this.field856 = -335;
		}
		if (!var5) {
			var5 = this.write(arg0, arg1, false, -20133, arg3);
		}
		return var5;
	}

	@ObfuscatedName("wb.a([BIZII)Z")
	public synchronized boolean write(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
		if (arg3 != -20133) {
			throw new NullPointerException();
		}
		try {
			int var8;
			if (arg2) {
				this.seek(arg1 * 6, 482, this.idx);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = this.idx.read(temp, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
				if (var8 <= 0 || (long) var8 > this.dat.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((this.dat.length() + 519L) / 520L);
				if (var8 == 0) {
					var8 = 1;
				}
			}
			temp[0] = (byte) (arg4 >> 16);
			temp[1] = (byte) (arg4 >> 8);
			temp[2] = (byte) arg4;
			temp[3] = (byte) (var8 >> 16);
			temp[4] = (byte) (var8 >> 8);
			temp[5] = (byte) var8;
			this.seek(arg1 * 6, 482, this.idx);
			this.idx.write(temp, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg4) {
				int var11 = 0;
				if (arg2) {
					this.seek(var8 * 520, 482, this.dat);
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
							var11 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
							int var16 = temp[7] & 0xFF;
							if (arg1 == var14 && var10 == var15 && this.archive == var16) {
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
					arg2 = false;
					var11 = (int) ((this.dat.length() + 519L) / 520L);
					if (var11 == 0) {
						var11++;
					}
					if (var8 == var11) {
						var11++;
					}
				}
				if (arg4 - var9 <= 512) {
					var11 = 0;
				}
				temp[0] = (byte) (arg1 >> 8);
				temp[1] = (byte) arg1;
				temp[2] = (byte) (var10 >> 8);
				temp[3] = (byte) var10;
				temp[4] = (byte) (var11 >> 16);
				temp[5] = (byte) (var11 >> 8);
				temp[6] = (byte) var11;
				temp[7] = (byte) this.archive;
				this.seek(var8 * 520, 482, this.dat);
				this.dat.write(temp, 0, 8);
				int var17 = arg4 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				this.dat.write(arg0, var9, var17);
				var9 += var17;
				var8 = var11;
				var10++;
			}
			return true;
		} catch (IOException var18) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void seek(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
		int var4 = 51 / arg1;
		if (arg0 < 0 || arg0 > 62914560) {
			System.out.println("Badseek - pos:" + arg0 + " len:" + arg2.length());
			arg0 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var5) {
			}
		}
		arg2.seek((long) arg0);
	}
}
