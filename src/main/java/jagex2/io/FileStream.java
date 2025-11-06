package jagex2.io;

import deob.ObfuscatedName;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public class FileStream {

	@ObfuscatedName("wb.a")
	public boolean field848 = true;

	@ObfuscatedName("wb.b")
	public static byte[] field849 = new byte[520];

	@ObfuscatedName("wb.c")
	public RandomAccessFile field850;

	@ObfuscatedName("wb.d")
	public RandomAccessFile field851;

	@ObfuscatedName("wb.e")
	public int field852;

	@ObfuscatedName("wb.f")
	public int field853 = 65000;

	public FileStream(RandomAccessFile arg0, int arg1, int arg2, int arg3, RandomAccessFile arg4) {
		if (arg1 != 0) {
			throw new NullPointerException();
		}
		this.field852 = arg3;
		this.field850 = arg4;
		this.field851 = arg0;
		this.field853 = arg2;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] method301(int arg0, int arg1) {
		if (arg0 != 9) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		try {
			this.method304(this.field851, arg1 * 6, 0);
			int var5;
			for (int var4 = 0; var4 < 6; var4 += var5) {
				var5 = this.field851.read(field849, var4, 6 - var4);
				if (var5 == -1) {
					return null;
				}
			}
			int var6 = ((field849[0] & 0xFF) << 16) + ((field849[1] & 0xFF) << 8) + (field849[2] & 0xFF);
			int var7 = ((field849[3] & 0xFF) << 16) + ((field849[4] & 0xFF) << 8) + (field849[5] & 0xFF);
			if (var6 < 0 || var6 > this.field853) {
				return null;
			} else if (var7 > 0 && (long) var7 <= this.field850.length() / 520L) {
				byte[] var8 = new byte[var6];
				int var9 = 0;
				int var10 = 0;
				while (var9 < var6) {
					if (var7 == 0) {
						return null;
					}
					this.method304(this.field850, var7 * 520, 0);
					int var11 = 0;
					int var12 = var6 - var9;
					if (var12 > 512) {
						var12 = 512;
					}
					while (var11 < var12 + 8) {
						int var13 = this.field850.read(field849, var11, var12 + 8 - var11);
						if (var13 == -1) {
							return null;
						}
						var11 += var13;
					}
					int var14 = ((field849[0] & 0xFF) << 8) + (field849[1] & 0xFF);
					int var15 = ((field849[2] & 0xFF) << 8) + (field849[3] & 0xFF);
					int var16 = ((field849[4] & 0xFF) << 16) + ((field849[5] & 0xFF) << 8) + (field849[6] & 0xFF);
					int var17 = field849[7] & 0xFF;
					if (var14 == arg1 && var15 == var10 && var17 == this.field852) {
						if (var16 >= 0 && (long) var16 <= this.field850.length() / 520L) {
							for (int var18 = 0; var18 < var12; var18++) {
								var8[var9++] = field849[var18 + 8];
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
	public synchronized boolean method302(int arg0, int arg1, byte[] arg2, boolean arg3) {
		if (arg3) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		boolean var6 = this.method303(arg2, arg1, arg0, (byte) -45, true);
		if (!var6) {
			var6 = this.method303(arg2, arg1, arg0, (byte) -45, false);
		}
		return var6;
	}

	@ObfuscatedName("wb.a([BIIBZ)Z")
	public synchronized boolean method303(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4) {
		if (arg3 != -45) {
			this.field848 = !this.field848;
		}
		try {
			int var8;
			if (arg4) {
				this.method304(this.field851, arg1 * 6, 0);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = this.field851.read(field849, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = ((field849[3] & 0xFF) << 16) + ((field849[4] & 0xFF) << 8) + (field849[5] & 0xFF);
				if (var8 <= 0 || (long) var8 > this.field850.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((this.field850.length() + 519L) / 520L);
				if (var8 == 0) {
					var8 = 1;
				}
			}
			field849[0] = (byte) (arg2 >> 16);
			field849[1] = (byte) (arg2 >> 8);
			field849[2] = (byte) arg2;
			field849[3] = (byte) (var8 >> 16);
			field849[4] = (byte) (var8 >> 8);
			field849[5] = (byte) var8;
			this.method304(this.field851, arg1 * 6, 0);
			this.field851.write(field849, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg2) {
				int var11 = 0;
				if (arg4) {
					this.method304(this.field850, var8 * 520, 0);
					int var12;
					int var13;
					for (var12 = 0; var12 < 8; var12 += var13) {
						var13 = this.field850.read(field849, var12, 8 - var12);
						if (var13 == -1) {
							break;
						}
					}
					if (var12 == 8) {
						label117: {
							int var14 = ((field849[0] & 0xFF) << 8) + (field849[1] & 0xFF);
							int var15 = ((field849[2] & 0xFF) << 8) + (field849[3] & 0xFF);
							var11 = ((field849[4] & 0xFF) << 16) + ((field849[5] & 0xFF) << 8) + (field849[6] & 0xFF);
							int var16 = field849[7] & 0xFF;
							if (var14 == arg1 && var15 == var10 && var16 == this.field852) {
								if (var11 >= 0 && (long) var11 <= this.field850.length() / 520L) {
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
					var11 = (int) ((this.field850.length() + 519L) / 520L);
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
				field849[0] = (byte) (arg1 >> 8);
				field849[1] = (byte) arg1;
				field849[2] = (byte) (var10 >> 8);
				field849[3] = (byte) var10;
				field849[4] = (byte) (var11 >> 16);
				field849[5] = (byte) (var11 >> 8);
				field849[6] = (byte) var11;
				field849[7] = (byte) this.field852;
				this.method304(this.field850, var8 * 520, 0);
				this.field850.write(field849, 0, 8);
				int var17 = arg2 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				this.field850.write(arg0, var9, var17);
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
	public synchronized void method304(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
		if (arg2 != 0) {
			return;
		}
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
