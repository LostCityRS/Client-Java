package jagex2.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.b")
	public static byte[] temp = new byte[520];

	@ObfuscatedName("wb.c")
	public RandomAccessFile dat;

	@ObfuscatedName("wb.d")
	public RandomAccessFile idx;

	@ObfuscatedName("wb.e")
	public int archive;

	@ObfuscatedName("wb.f")
	public int maxFileSize = 65000;

	public FileStream(RandomAccessFile arg0, int arg2, int arg3, RandomAccessFile arg4) {
		this.archive = arg3;
		this.dat = arg4;
		this.idx = arg0;
		this.maxFileSize = arg2;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] read(int arg1) {
		try {
			this.seek(this.idx, arg1 * 6);
			int var5;
			for (int var4 = 0; var4 < 6; var4 += var5) {
				var5 = this.idx.read(temp, var4, 6 - var4);
				if (var5 == -1) {
					return null;
				}
			}
			int var6 = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
			int var7 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
			if (var6 < 0 || var6 > this.maxFileSize) {
				return null;
			} else if (var7 > 0 && (long) var7 <= this.dat.length() / 520L) {
				byte[] var8 = new byte[var6];
				int var9 = 0;
				int var10 = 0;
				while (var9 < var6) {
					if (var7 == 0) {
						return null;
					}
					this.seek(this.dat, var7 * 520);
					int var11 = 0;
					int var12 = var6 - var9;
					if (var12 > 512) {
						var12 = 512;
					}
					while (var11 < var12 + 8) {
						int var13 = this.dat.read(temp, var11, var12 + 8 - var11);
						if (var13 == -1) {
							return null;
						}
						var11 += var13;
					}
					int var14 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
					int var15 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
					int var16 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
					int var17 = temp[7] & 0xFF;
					if (var14 == arg1 && var15 == var10 && var17 == this.archive) {
						if (var16 >= 0 && (long) var16 <= this.dat.length() / 520L) {
							for (int var18 = 0; var18 < var12; var18++) {
								var8[var9++] = temp[var18 + 8];
							}
							var7 = var16;
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
		} catch (IOException var19) {
			return null;
		}
	}

	@ObfuscatedName("wb.a(II[BZ)Z")
	public synchronized boolean write(int arg0, int arg1, byte[] arg2) {
		boolean var6 = this.write(arg2, arg1, arg0, true);
		if (!var6) {
			var6 = this.write(arg2, arg1, arg0, false);
		}
		return var6;
	}

	@ObfuscatedName("wb.a([BIIBZ)Z")
	public synchronized boolean write(byte[] arg0, int arg1, int arg2, boolean arg4) {
		try {
			int var8;
			if (arg4) {
				this.seek(this.idx, arg1 * 6);
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
			temp[0] = (byte) (arg2 >> 16);
			temp[1] = (byte) (arg2 >> 8);
			temp[2] = (byte) arg2;
			temp[3] = (byte) (var8 >> 16);
			temp[4] = (byte) (var8 >> 8);
			temp[5] = (byte) var8;
			this.seek(this.idx, arg1 * 6);
			this.idx.write(temp, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg2) {
				int var11 = 0;
				if (arg4) {
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
						label117: {
							int var14 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
							int var15 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
							var11 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
							int var16 = temp[7] & 0xFF;
							if (var14 == arg1 && var15 == var10 && var16 == this.archive) {
								if (var11 >= 0 && (long) var11 <= this.dat.length() / 520L) {
									break label117;
								}
								return false;
							}
							return false;
						}
					}
				}
				if (var11 == 0) {
					arg4 = false;
					var11 = (int) ((this.dat.length() + 519L) / 520L);
					if (var11 == 0) {
						var11++;
					}
					if (var11 == var8) {
						var11++;
					}
				}
				if (arg2 - var9 <= 512) {
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
				this.seek(this.dat, var8 * 520);
				this.dat.write(temp, 0, 8);
				int var17 = arg2 - var9;
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

	@ObfuscatedName("wb.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void seek(RandomAccessFile arg0, int arg1) throws IOException {
		if (arg1 < 0 || arg1 > 62914560) {
			System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
			arg1 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
		}
		arg0.seek((long) arg1);
	}
}
