package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("vb")
public final class FileStream {

	@ObfuscatedName("vb.a")
	public boolean field846 = false;

	@ObfuscatedName("vb.b")
	public int field847;

	@ObfuscatedName("vb.c")
	public final int field848 = 887;

	@ObfuscatedName("vb.d")
	public static final byte[] temp = new byte[520];

	@ObfuscatedName("vb.e")
	public final RandomAccessFile dat;

	@ObfuscatedName("vb.f")
	public final RandomAccessFile idx;

	@ObfuscatedName("vb.g")
	public final int archive;

	@ObfuscatedName("vb.h")
	public int maxFileSize = 65000;

	public FileStream(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3, byte arg4) {
		archive = arg3;
		dat = arg0;
		idx = arg2;
		maxFileSize = 500000;
	}

	@ObfuscatedName("vb.a(ZI)[B")
	public synchronized byte[] readFromFile(int arg0) {
		try {
			seek(idx, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = idx.read(temp, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}
			int var4 = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
			int var5 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
			if (var4 < 0 || var4 > maxFileSize) {
				return null;
			} else if (var5 > 0 && (long) var5 <= dat.length() / 520L) {
				byte[] var6 = new byte[var4];
				int var7 = 0;
				int var8 = 0;
				while (var7 < var4) {
					if (var5 == 0) {
						return null;
					}
					seek(dat, var5 * 520);
					int var9 = 0;
					int var10 = var4 - var7;
					if (var10 > 512) {
						var10 = 512;
					}
					while (var9 < var10 + 8) {
						int var11 = dat.read(temp, var9, var10 + 8 - var9);
						if (var11 == -1) {
							return null;
						}
						var9 += var11;
					}
					int var12 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
					int var13 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
					int var14 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
					int var15 = temp[7] & 0xFF;
					if (var12 != arg0 || var13 != var8 || var15 != archive) {
						return null;
					}
					if (var14 >= 0 && (long) var14 <= dat.length() / 520L) {
						for (int var16 = 0; var16 < var10; var16++) {
							var6[var7++] = temp[var16 + 8];
						}
						var5 = var14;
						var8++;
						continue;
					}
					return null;
				}
				return var6;
			} else {
				return null;
			}
		} catch (IOException var17) {
			return null;
		}
	}

	@ObfuscatedName("vb.a([BBII)Z")
	public synchronized boolean writeToFile(byte[] arg0, int arg1, int arg2) {
		boolean var4 = writeToFile(true, arg1, field847, arg2, arg0);
		if (!var4) {
			var4 = writeToFile(false, arg1, field847, arg2, arg0);
		}
		return var4;
	}

	@ObfuscatedName("vb.a(ZIII[B)Z")
	public synchronized boolean writeToFile(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
		if (arg2 != 0) {
			field846 = !field846;
		}
		try {
			int var8;
			if (arg0) {
				seek(idx, arg3 * 6);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = idx.read(temp, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
				if (var8 <= 0 || (long) var8 > dat.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((dat.length() + 519L) / 520L);
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
			seek(idx, arg3 * 6);
			idx.write(temp, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg1) {
				int var11 = 0;
				if (arg0) {
					seek(dat, var8 * 520);
					int var12;
					int var13;
					for (var12 = 0; var12 < 8; var12 += var13) {
						var13 = dat.read(temp, var12, 8 - var12);
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
							if (var14 != arg3 || var15 != var10 || var16 != archive) {
								return false;
							}
							if (var11 >= 0 && (long) var11 <= dat.length() / 520L) {
								break label117;
							}
							return false;
						}
					}
				}
				if (var11 == 0) {
					arg0 = false;
					var11 = (int) ((dat.length() + 519L) / 520L);
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
				temp[0] = (byte) (arg3 >> 8);
				temp[1] = (byte) arg3;
				temp[2] = (byte) (var10 >> 8);
				temp[3] = (byte) var10;
				temp[4] = (byte) (var11 >> 16);
				temp[5] = (byte) (var11 >> 8);
				temp[6] = (byte) var11;
				temp[7] = (byte) archive;
				seek(dat, var8 * 520);
				dat.write(temp, 0, 8);
				int var17 = arg1 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				dat.write(arg4, var9, var17);
				var9 += var17;
				var8 = var11;
				var10++;
			}
			return true;
		} catch (IOException var18) {
			return false;
		}
	}

	@ObfuscatedName("vb.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void seek(RandomAccessFile arg0, int arg1) throws IOException {
		if (arg1 < 0 || arg1 > 62914560) {
			System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
			arg1 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}
		arg0.seek((long) arg1);
	}
}
