package jagex3.io;

import deob.ObfuscatedName;
import jagex3.config.ObjType;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("tb")
public final class DataFile {

	@ObfuscatedName("tb.j")
	public final int field3117;

	@ObfuscatedName("tb.k")
	public int field3118 = 65000;

	@ObfuscatedName("tb.l")
	public BufferedRandomAccessFile field3119 = null;

	@ObfuscatedName("tb.w")
	public BufferedRandomAccessFile field3130 = null;

	public DataFile(int arg0, BufferedRandomAccessFile arg1, BufferedRandomAccessFile arg2, int arg3) {
		this.field3130 = arg2;
		this.field3117 = arg0;
		this.field3118 = arg3;
		this.field3119 = arg1;
	}

	@ObfuscatedName("tb.a(IIZZ[B)Z")
	public boolean method1019(int arg0, int arg1, boolean arg2, byte[] arg3) {
		BufferedRandomAccessFile var5 = this.field3119;
		synchronized (this.field3119) {
			try {
				int var6;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.field3130.method1174()) {
						return false;
					}
					this.field3130.method1184((long) (arg0 * 6));
					this.field3130.method1180(6, ObjType.field1438, 0);
					var6 = ((ObjType.field1438[3] & 0xFF) << 16) - (-((ObjType.field1438[4] & 0xFF) << 8) - (ObjType.field1438[5] & 0xFF));
					if (var6 <= 0 || this.field3119.method1174() / 520L < (long) var6) {
						return false;
					}
				} else {
					var6 = (int) ((this.field3119.method1174() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				ObjType.field1438[3] = (byte) (var6 >> 16);
				ObjType.field1438[4] = (byte) (var6 >> 8);
				ObjType.field1438[0] = (byte) (arg1 >> 16);
				ObjType.field1438[5] = (byte) var6;
				ObjType.field1438[2] = (byte) arg1;
				int var7 = 0;
				ObjType.field1438[1] = (byte) (arg1 >> 8);
				int var8 = 0;
				this.field3130.method1184((long) (arg0 * 6));
				this.field3130.method1175(ObjType.field1438, 6, 0);
				while (arg1 > var7) {
					int var9 = 0;
					if (arg2) {
						this.field3119.method1184((long) (var6 * 520));
						try {
							this.field3119.method1180(8, ObjType.field1438, 0);
						} catch (EOFException var14) {
							return true;
						}
						var9 = ((ObjType.field1438[4] & 0xFF) << 16) + ((ObjType.field1438[5] << 8 & 0xFF00) + (ObjType.field1438[6] & 0xFF));
						int var10 = ((ObjType.field1438[0] & 0xFF) << 8) + (ObjType.field1438[1] & 0xFF);
						int var11 = (ObjType.field1438[3] & 0xFF) + ((ObjType.field1438[2] & 0xFF) << 8);
						int var12 = ObjType.field1438[7] & 0xFF;
						if (var10 != arg0 || var8 != var11 || this.field3117 != var12) {
							return false;
						}
						if (var9 < 0 || (long) var9 > this.field3119.method1174() / 520L) {
							return false;
						}
					}
					if (var9 == 0) {
						arg2 = false;
						var9 = (int) ((this.field3119.method1174() + 519L) / 520L);
						if (var9 == 0) {
							var9++;
						}
						if (var9 == var6) {
							var9++;
						}
					}
					ObjType.field1438[2] = (byte) (var8 >> 8);
					ObjType.field1438[3] = (byte) var8;
					ObjType.field1438[1] = (byte) arg0;
					int var13 = arg1 - var7;
					ObjType.field1438[7] = (byte) this.field3117;
					var8++;
					ObjType.field1438[0] = (byte) (arg0 >> 8);
					if (var13 > 512) {
						var13 = 512;
					}
					if (arg1 - var7 <= 512) {
						var9 = 0;
					}
					ObjType.field1438[6] = (byte) var9;
					ObjType.field1438[5] = (byte) (var9 >> 8);
					ObjType.field1438[4] = (byte) (var9 >> 16);
					this.field3119.method1184((long) (var6 * 520));
					this.field3119.method1175(ObjType.field1438, 8, 0);
					this.field3119.method1175(arg3, var13, var7);
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
		BufferedRandomAccessFile var2 = this.field3119;
		synchronized (this.field3119) {
			try {
				if ((long) (arg0 * 6 + 6) > this.field3130.method1174()) {
					return null;
				}
				this.field3130.method1184((long) (arg0 * 6));
				this.field3130.method1180(6, ObjType.field1438, 0);
				int var4 = ((ObjType.field1438[0] & 0xFF) << 16) + ((ObjType.field1438[1] & 0xFF) << 8) + (ObjType.field1438[2] & 0xFF);
				int var5 = ((ObjType.field1438[4] & 0xFF) << 8) + ((ObjType.field1438[3] & 0xFF) << 16) + (ObjType.field1438[5] & 0xFF);
				if (var4 < 0 || var4 > this.field3118) {
					return null;
				} else if (var5 > 0 && (long) var5 <= this.field3119.method1174() / 520L) {
					byte[] var8 = new byte[var4];
					int var9 = 0;
					int var10 = 0;
					label55: while (var9 < var4) {
						if (var5 == 0) {
							return null;
						}
						this.field3119.method1184((long) (var5 * 520));
						int var12 = var4 - var9;
						if (var12 > 512) {
							var12 = 512;
						}
						this.field3119.method1180(var12 + 8, ObjType.field1438, 0);
						int var13 = ((ObjType.field1438[2] & 0xFF) << 8) + (ObjType.field1438[3] & 0xFF);
						int var14 = (ObjType.field1438[1] & 0xFF) + ((ObjType.field1438[0] & 0xFF) << 8);
						int var15 = (ObjType.field1438[6] & 0xFF) + (((ObjType.field1438[4] & 0xFF) << 16) + ((ObjType.field1438[5] & 0xFF) << 8));
						int var16 = ObjType.field1438[7] & 0xFF;
						if (arg0 == var14 && var10 == var13 && var16 == this.field3117) {
							if (var15 >= 0 && (long) var15 <= this.field3119.method1174() / 520L) {
								var5 = var15;
								var10++;
								int var19 = 0;
								while (true) {
									if (var12 <= var19) {
										continue label55;
									}
									var8[var9++] = ObjType.field1438[var19 + 8];
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
		return "Cache:" + this.field3117;
	}

	@ObfuscatedName("tb.a(BII[B)Z")
	public boolean writeToFile(int arg0, int arg1, byte[] arg2) {
		BufferedRandomAccessFile var4 = this.field3119;
		synchronized (this.field3119) {
			if (arg1 < 0 || this.field3118 < arg1) {
				throw new IllegalArgumentException();
			}
			boolean var5 = this.method1019(arg0, arg1, true, arg2);
			if (!var5) {
				var5 = this.method1019(arg0, arg1, false, arg2);
			}
			return var5;
		}
	}
}
