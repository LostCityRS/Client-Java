package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("sa")
public final class DataFile {

    @ObfuscatedName("h.kc")
    public static byte[] field1126 = new byte[520];
    @ObfuscatedName("sa.a")
	public BufferedRandomAccessFile field2725 = null;

	@ObfuscatedName("sa.e")
	public BufferedRandomAccessFile field2729 = null;

	@ObfuscatedName("sa.m")
	public int field2737 = 65000;

	@ObfuscatedName("sa.p")
	public final int field2740;

	@Override
	public String toString() {
		return "Cache:" + this.field2740;
	}

	@ObfuscatedName("sa.a(IB)[B")
	public byte[] method906(int arg0) {
		BufferedRandomAccessFile var2 = this.field2725;
		synchronized (this.field2725) {
			try {
				if (this.field2729.method1042() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.field2729.method1041((long) (arg0 * 6));
				this.field2729.method1045(0, 6, field1126);
				int var4 = (field1126[5] & 0xFF) + ((field1126[3] & 0xFF) << 16) + ((field1126[4] & 0xFF) << 8);
				int var5 = (field1126[2] & 0xFF) + (((field1126[0] & 0xFF) << 16) + ((field1126[1] & 0xFF) << 8));
				if (var5 < 0 || var5 > this.field2737) {
					return null;
				} else if (var4 > 0 && (long) var4 <= this.field2725.method1042() / 520L) {
					int var8 = 0;
					int var9 = 0;
					byte[] var10 = new byte[var5];
					while (var5 > var8) {
						if (var4 == 0) {
							return null;
						}
						this.field2725.method1041((long) (var4 * 520));
						int var12 = var5 - var8;
						if (var12 > 512) {
							var12 = 512;
						}
						this.field2725.method1045(0, var12 + 8, field1126);
						int var13 = ((field1126[0] & 0xFF) << 8) + (field1126[1] & 0xFF);
						int var14 = ((field1126[4] & 0xFF) << 16) + ((field1126[5] & 0xFF) << 8) + (field1126[6] & 0xFF);
						int var15 = ((field1126[2] & 0xFF) << 8) + (field1126[3] & 0xFF);
						int var16 = field1126[7] & 0xFF;
						if (arg0 == var13 && var9 == var15 && this.field2740 == var16) {
							if (var14 >= 0 && (long) var14 <= this.field2725.method1042() / 520L) {
								var9++;
								for (int var19 = 0; var19 < var12; var19++) {
									var10[var8++] = field1126[var19 + 8];
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
	public boolean method907(byte[] arg0, int arg1, boolean arg2, int arg3) {
		BufferedRandomAccessFile var5 = this.field2725;
		synchronized (this.field2725) {
			try {
				int var6;
				if (arg2) {
					if (this.field2729.method1042() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.field2729.method1041((long) (arg3 * 6));
					this.field2729.method1045(0, 6, field1126);
					var6 = (field1126[5] & 0xFF) + (((field1126[3] & 0xFF) << 16) + ((field1126[4] & 0xFF) << 8));
					if (var6 <= 0 || (long) var6 > this.field2725.method1042() / 520L) {
						return false;
					}
				} else {
					var6 = (int) ((this.field2725.method1042() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				field1126[0] = (byte) (arg1 >> 16);
				field1126[1] = (byte) (arg1 >> 8);
				field1126[2] = (byte) arg1;
				int var7 = 0;
				field1126[3] = (byte) (var6 >> 16);
				int var8 = 0;
				field1126[4] = (byte) (var6 >> 8);
				field1126[5] = (byte) var6;
				this.field2729.method1041((long) (arg3 * 6));
				this.field2729.method1043(0, 6, field1126);
				while (var7 < arg1) {
					int var9 = 0;
					if (arg2) {
						this.field2725.method1041((long) (var6 * 520));
						try {
							this.field2725.method1045(0, 8, field1126);
						} catch (EOFException var14) {
							return true;
						}
						var9 = (field1126[6] & 0xFF) + (((field1126[4] & 0xFF) << 16) + ((field1126[5] & 0xFF) << 8));
						int var10 = ((field1126[0] & 0xFF) << 8) + (field1126[1] & 0xFF);
						int var11 = field1126[7] & 0xFF;
						int var12 = ((field1126[2] & 0xFF) << 8) + (field1126[3] & 0xFF);
						if (arg3 != var10 || var8 != var12 || this.field2740 != var11) {
							return false;
						}
						if (var9 < 0 || this.field2725.method1042() / 520L < (long) var9) {
							return false;
						}
					}
					if (var9 == 0) {
						arg2 = false;
						var9 = (int) ((this.field2725.method1042() + 519L) / 520L);
						if (var9 == 0) {
							var9++;
						}
						if (var6 == var9) {
							var9++;
						}
					}
					field1126[0] = (byte) (arg3 >> 8);
					if (arg1 - var7 <= 512) {
						var9 = 0;
					}
					field1126[1] = (byte) arg3;
					int var13 = arg1 - var7;
					if (var13 > 512) {
						var13 = 512;
					}
					field1126[2] = (byte) (var8 >> 8);
					field1126[3] = (byte) var8;
					field1126[4] = (byte) (var9 >> 16);
					field1126[5] = (byte) (var9 >> 8);
					var8++;
					field1126[6] = (byte) var9;
					field1126[7] = (byte) this.field2740;
					this.field2725.method1041((long) (var6 * 520));
					this.field2725.method1043(0, 8, field1126);
					var6 = var9;
					this.field2725.method1043(var7, var13, arg0);
					var7 += var13;
				}
				return true;
			} catch (IOException var15) {
				return false;
			}
		}
	}

	public DataFile(int arg0, BufferedRandomAccessFile arg1, BufferedRandomAccessFile arg2, int arg3) {
		this.field2737 = arg3;
		this.field2729 = arg2;
		this.field2725 = arg1;
		this.field2740 = arg0;
	}

	@ObfuscatedName("sa.a([BIII)Z")
	public boolean method908(byte[] arg0, int arg1, int arg2) {
		BufferedRandomAccessFile var4 = this.field2725;
		synchronized (this.field2725) {
			if (arg1 < 0 || arg1 > this.field2737) {
				throw new IllegalArgumentException();
			}
			boolean var5 = this.method907(arg0, arg1, true, arg2);
			if (!var5) {
				var5 = this.method907(arg0, arg1, false, arg2);
			}
			return var5;
		}
	}
}
