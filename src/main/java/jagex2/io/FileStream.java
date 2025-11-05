package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileStream {

	@ObfuscatedName("KNWRHOKF.h")
	public int field1083 = 65000;

	@ObfuscatedName("KNWRHOKF.g")
	public int field1082;

	@ObfuscatedName("KNWRHOKF.e")
	public RandomAccessFile field1080;

	@ObfuscatedName("KNWRHOKF.f")
	public RandomAccessFile field1081;

	@ObfuscatedName("KNWRHOKF.d")
	public static byte[] field1079 = new byte[520];

	public FileStream(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		this.field1082 = arg0;
		this.field1080 = arg2;
		this.field1081 = arg3;
		this.field1083 = arg1;
	}

	@ObfuscatedName("KNWRHOKF.a(BI)[B")
	public synchronized byte[] read(int arg1) {
		try {
			this.method328(arg1 * 6, this.field1081);
			int var5;
			for (int var4 = 0; var4 < 6; var4 += var5) {
				var5 = this.field1081.read(field1079, var4, 6 - var4);
				if (var5 == -1) {
					return null;
				}
			}
			int var6 = (field1079[2] & 0xFF) + ((field1079[0] & 0xFF) << 16) + ((field1079[1] & 0xFF) << 8);
			int var7 = (field1079[5] & 0xFF) + ((field1079[3] & 0xFF) << 16) + ((field1079[4] & 0xFF) << 8);
			if (var6 < 0 || var6 > this.field1083) {
				return null;
			} else if (var7 > 0 && (long) var7 <= this.field1080.length() / 520L) {
				byte[] var8 = new byte[var6];
				int var9 = 0;
				int var10 = 0;
				while (var9 < var6) {
					if (var7 == 0) {
						return null;
					}
					this.method328(var7 * 520, this.field1080);
					int var11 = 0;
					int var12 = var6 - var9;
					if (var12 > 512) {
						var12 = 512;
					}
					while (var11 < var12 + 8) {
						int var13 = this.field1080.read(field1079, var11, var12 + 8 - var11);
						if (var13 == -1) {
							return null;
						}
						var11 += var13;
					}
					int var14 = ((field1079[0] & 0xFF) << 8) + (field1079[1] & 0xFF);
					int var15 = ((field1079[2] & 0xFF) << 8) + (field1079[3] & 0xFF);
					int var16 = (field1079[6] & 0xFF) + ((field1079[4] & 0xFF) << 16) + ((field1079[5] & 0xFF) << 8);
					int var17 = field1079[7] & 0xFF;
					if (arg1 == var14 && var10 == var15 && this.field1082 == var17) {
						if (var16 >= 0 && (long) var16 <= this.field1080.length() / 520L) {
							for (int var18 = 0; var18 < var12; var18++) {
								var8[var9++] = field1079[var18 + 8];
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

	@ObfuscatedName("KNWRHOKF.a(IZ[BI)Z")
	public synchronized boolean write(int arg0, byte[] arg2, int arg3) {
		boolean var6 = this.method327(arg2, arg3, true, arg0);
		if (!var6) {
			var6 = this.method327(arg2, arg3, false, arg0);
		}
		return var6;
	}

	@ObfuscatedName("KNWRHOKF.a([BIIZI)Z")
	public synchronized boolean method327(byte[] arg0, int arg2, boolean arg3, int arg4) {
		try {
			int var8;
			if (arg3) {
				this.method328(arg2 * 6, this.field1081);
				int var7;
				for (int var6 = 0; var6 < 6; var6 += var7) {
					var7 = this.field1081.read(field1079, var6, 6 - var6);
					if (var7 == -1) {
						return false;
					}
				}
				var8 = (field1079[5] & 0xFF) + ((field1079[3] & 0xFF) << 16) + ((field1079[4] & 0xFF) << 8);
				if (var8 <= 0 || (long) var8 > this.field1080.length() / 520L) {
					return false;
				}
			} else {
				var8 = (int) ((this.field1080.length() + 519L) / 520L);
				if (var8 == 0) {
					var8 = 1;
				}
			}
			field1079[0] = (byte) (arg4 >> 16);
			field1079[1] = (byte) (arg4 >> 8);
			field1079[2] = (byte) arg4;
			field1079[3] = (byte) (var8 >> 16);
			field1079[4] = (byte) (var8 >> 8);
			field1079[5] = (byte) var8;
			this.method328(arg2 * 6, this.field1081);
			this.field1081.write(field1079, 0, 6);
			int var9 = 0;
			int var10 = 0;
			while (var9 < arg4) {
				int var11 = 0;
				if (arg3) {
					this.method328(var8 * 520, this.field1080);
					int var12;
					int var13;
					for (var12 = 0; var12 < 8; var12 += var13) {
						var13 = this.field1080.read(field1079, var12, 8 - var12);
						if (var13 == -1) {
							break;
						}
					}
					if (var12 == 8) {
						label110: {
							int var14 = ((field1079[0] & 0xFF) << 8) + (field1079[1] & 0xFF);
							int var15 = ((field1079[2] & 0xFF) << 8) + (field1079[3] & 0xFF);
							var11 = (field1079[6] & 0xFF) + ((field1079[4] & 0xFF) << 16) + ((field1079[5] & 0xFF) << 8);
							int var16 = field1079[7] & 0xFF;
							if (arg2 == var14 && var10 == var15 && this.field1082 == var16) {
								if (var11 >= 0 && (long) var11 <= this.field1080.length() / 520L) {
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
					var11 = (int) ((this.field1080.length() + 519L) / 520L);
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
				field1079[0] = (byte) (arg2 >> 8);
				field1079[1] = (byte) arg2;
				field1079[2] = (byte) (var10 >> 8);
				field1079[3] = (byte) var10;
				field1079[4] = (byte) (var11 >> 16);
				field1079[5] = (byte) (var11 >> 8);
				field1079[6] = (byte) var11;
				field1079[7] = (byte) this.field1082;
				this.method328(var8 * 520, this.field1080);
				this.field1080.write(field1079, 0, 8);
				int var17 = arg4 - var9;
				if (var17 > 512) {
					var17 = 512;
				}
				this.field1080.write(arg0, var9, var17);
				var9 += var17;
				var8 = var11;
				var10++;
			}
			return true;
		} catch (IOException var18) {
			return false;
		}
	}

	@ObfuscatedName("KNWRHOKF.a(ZILjava/io/RandomAccessFile;)V")
	public synchronized void method328(int arg1, RandomAccessFile arg2) throws IOException {
		if (arg1 < 0 || arg1 > 62914560) {
			System.out.println("Badseek - pos:" + arg1 + " len:" + arg2.length());
			arg1 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
		}
		arg2.seek((long) arg1);
	}
}
