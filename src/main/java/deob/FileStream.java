package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.a")
	public int field856;

	@ObfuscatedName("wb.b")
	public boolean field857 = true;

	@ObfuscatedName("wb.c")
	public static byte[] field858 = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile field859;

	@ObfuscatedName("wb.e")
	public RandomAccessFile field860;

	@ObfuscatedName("wb.f")
	public int field861;

	@ObfuscatedName("wb.g")
	public int field862 = 65000;

	public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, boolean arg3, int arg4) {
		this.field861 = arg0;
		this.field859 = arg2;
		this.field860 = arg1;
		this.field862 = arg4;
		if (!arg3) {
			throw new NullPointerException();
		}
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] method300(int arg0, int arg1) {
		if (arg0 <= 0) {
			throw new NullPointerException();
		}
		try {
			this.method303(arg1 * 6, 482, this.field860);
			int var4;
			for (int var3 = 0; var3 < 6; var3 += var4) {
				var4 = this.field860.read(field858, var3, 6 - var3);
				if (var4 == -1) {
					return null;
				}
			}
			int var5 = (field858[2] & 0xFF) + ((field858[0] & 0xFF) << 16) + ((field858[1] & 0xFF) << 8);
			int var6 = (field858[5] & 0xFF) + ((field858[3] & 0xFF) << 16) + ((field858[4] & 0xFF) << 8);
			if (var5 < 0 || var5 > this.field862) {
				return null;
			} else if (var6 > 0 && (long) var6 <= this.field859.length() / 520L) {
				byte[] var7 = new byte[var5];
				int var8 = 0;
				int var9 = 0;
				while (var8 < var5) {
					if (var6 == 0) {
						return null;
					}
					this.method303(var6 * 520, 482, this.field859);
					int var10 = 0;
					int var11 = var5 - var8;
					if (var11 > 512) {
						var11 = 512;
					}
					while (var10 < var11 + 8) {
						int var12 = this.field859.read(field858, var10, var11 + 8 - var10);
						if (var12 == -1) {
							return null;
						}
						var10 += var12;
					}
					int var13 = ((field858[0] & 0xFF) << 8) + (field858[1] & 0xFF);
					int var14 = ((field858[2] & 0xFF) << 8) + (field858[3] & 0xFF);
					int var15 = (field858[6] & 0xFF) + ((field858[4] & 0xFF) << 16) + ((field858[5] & 0xFF) << 8);
					int var16 = field858[7] & 0xFF;
					if (arg1 == var13 && var9 == var14 && this.field861 == var16) {
						if (var15 >= 0 && (long) var15 <= this.field859.length() / 520L) {
							for (int var17 = 0; var17 < var11; var17++) {
								var7[var8++] = field858[var17 + 8];
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
	public synchronized boolean method301(byte[] arg0, int arg1, boolean arg2, int arg3) {
		boolean var5 = this.method302(arg0, arg1, true, -20133, arg3);
		if (!arg2) {
			this.field856 = -335;
		}
		if (!var5) {
			var5 = this.method302(arg0, arg1, false, -20133, arg3);
		}
		return var5;
	}

	@ObfuscatedName("wb.a([BIZII)Z")
	public synchronized boolean method302(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
		if (arg3 != -20133) {
			throw new NullPointerException();
		}
		try {
			int var8;
			if (arg2) {
				this.method303(arg1 * 6, 482, this.field860);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = this.field860.read(field858, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = (field858[5] & 0xFF) + ((field858[3] & 0xFF) << 16) + ((field858[4] & 0xFF) << 8);
				if (var8 <= 0 || (long) var8 > this.field859.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((this.field859.length() + 519L) / 520L);
				if (var8 == 0) {
					var8 = 1;
				}
			}
			field858[0] = (byte) (arg4 >> 16);
			field858[1] = (byte) (arg4 >> 8);
			field858[2] = (byte) arg4;
			field858[3] = (byte) (var8 >> 16);
			field858[4] = (byte) (var8 >> 8);
			field858[5] = (byte) var8;
			this.method303(arg1 * 6, 482, this.field860);
			this.field860.write(field858, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg4) {
				int var11 = 0;
				if (arg2) {
					this.method303(var8 * 520, 482, this.field859);
					int var12;
					int var13;
					for (var12 = 0; var12 < 8; var12 += var13) {
						var13 = this.field859.read(field858, var12, 8 - var12);
						if (var13 == -1) {
							break;
						}
					}
					if (var12 == 8) {
						label110: {
							int var14 = ((field858[0] & 0xFF) << 8) + (field858[1] & 0xFF);
							int var15 = ((field858[2] & 0xFF) << 8) + (field858[3] & 0xFF);
							var11 = (field858[6] & 0xFF) + ((field858[4] & 0xFF) << 16) + ((field858[5] & 0xFF) << 8);
							int var16 = field858[7] & 0xFF;
							if (arg1 == var14 && var10 == var15 && this.field861 == var16) {
								if (var11 >= 0 && (long) var11 <= this.field859.length() / 520L) {
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
					var11 = (int) ((this.field859.length() + 519L) / 520L);
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
				field858[0] = (byte) (arg1 >> 8);
				field858[1] = (byte) arg1;
				field858[2] = (byte) (var10 >> 8);
				field858[3] = (byte) var10;
				field858[4] = (byte) (var11 >> 16);
				field858[5] = (byte) (var11 >> 8);
				field858[6] = (byte) var11;
				field858[7] = (byte) this.field861;
				this.method303(var8 * 520, 482, this.field859);
				this.field859.write(field858, 0, 8);
				int var17 = arg4 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				this.field859.write(arg0, var9, var17);
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
	public synchronized void method303(int arg0, int arg1, RandomAccessFile arg2) throws IOException {
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
