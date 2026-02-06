package deob;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("tb")
public final class class134 {

	@ObfuscatedName("tb.c")
	public static class32 field3110 = class73.method593("::", true);

	@ObfuscatedName("tb.g")
	public static int field3114 = 0;

	@ObfuscatedName("tb.h")
	public static class44 field3115;

	@ObfuscatedName("tb.j")
	public final int field3117;

	@ObfuscatedName("tb.k")
	public int field3118 = 65000;

	@ObfuscatedName("tb.l")
	public class152 field3119 = null;

	@ObfuscatedName("tb.m")
	public static CRC32 field3120 = new CRC32();

	@ObfuscatedName("tb.n")
	public static int field3121 = 0;

	@ObfuscatedName("tb.o")
	public static class32 field3122 = class73.method593("mapfunction", true);

	@ObfuscatedName("tb.p")
	public static byte[][][] field3123;

	@ObfuscatedName("tb.t")
	public static class32 field3127 = class73.method593(" )2> <col=ffffff>", true);

	@ObfuscatedName("tb.u")
	public static class32 field3128 = class73.method593("<col=00ff00>", true);

	@ObfuscatedName("tb.v")
	public static byte[][][] field3129;

	@ObfuscatedName("tb.w")
	public class152 field3130 = null;

	@ObfuscatedName("tb.a(BI)Ljc;")
	public static class65 method1020(int arg0) {
		class65 var1 = (class65) class37.field886.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class13.field226.method206(3, arg0);
		class65 var3 = new class65();
		if (var2 != null) {
			var3.method497(new class66(var2));
		}
		class37.field886.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("tb.a(ZBLue;)V")
	public static void method1021(boolean arg0, class144 arg1) {
		int var2 = (int) arg1.field3324;
		int var3 = arg1.field3280;
		arg1.method1091();
		if (arg0) {
			class117.method926(var3);
		}
		class107.method863(var3);
		class36 var4 = class128.method991(var2);
		if (var4 != null) {
			class132.method1008(var4);
		}
		class26.field476 = false;
		class119.field2849 = 0;
		class62.method476(class36.field863, class121.field2864, class45.field1071, class110.field2585);
		if (class13.field220 != -1) {
			class154.method1192(class13.field220, 1);
		}
	}

	@ObfuscatedName("tb.a(BILka;I)V")
	public static void method1023(int arg0, class70 arg1, int arg2) {
		if (arg2 == arg1.field2712 && arg2 != -1) {
			int var3 = class97.method760(arg2).field3395;
			if (var3 == 1) {
				arg1.field2737 = 0;
				arg1.field2714 = 0;
				arg1.field2725 = 0;
				arg1.field2715 = arg0;
			}
			if (var3 == 2) {
				arg1.field2714 = 0;
			}
		} else if (arg2 == -1 || arg1.field2712 == -1 || class97.method760(arg2).field3384 >= class97.method760(arg1.field2712).field3384) {
			arg1.field2748 = arg1.field2696;
			arg1.field2715 = arg0;
			arg1.field2725 = 0;
			arg1.field2714 = 0;
			arg1.field2737 = 0;
			arg1.field2712 = arg2;
		}
	}

	@ObfuscatedName("tb.a(Ljd;IIIIIII)V")
	public static void method1025(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				int var7 = arg0.method532();
				if (var7 == 0) {
					return;
				}
				if (var7 == 1) {
					arg0.method532();
					return;
				}
				if (var7 <= 49) {
					arg0.method532();
				}
			}
		}
		class3.field50[arg1][arg5][arg4] = 0;
		while (true) {
			int var8 = arg0.method532();
			if (var8 == 0) {
				if (arg1 == 0) {
					class70.field1630[0][arg5][arg4] = -class14.method80(arg2 + arg4 + 556238, arg5 + 932731 - -arg6) * 8;
					return;
				} else {
					class70.field1630[arg1][arg5][arg4] = class70.field1630[arg1 - 1][arg5][arg4] - 240;
					return;
				}
			}
			if (var8 == 1) {
				int var9 = arg0.method532();
				if (var9 == 1) {
					var9 = 0;
				}
				if (arg1 == 0) {
					class70.field1630[0][arg5][arg4] = -var9 * 8;
					return;
				}
				class70.field1630[arg1][arg5][arg4] = class70.field1630[arg1 - 1][arg5][arg4] - var9 * 8;
				return;
			}
			if (var8 <= 49) {
				class111.field2612[arg1][arg5][arg4] = arg0.method544();
				field3129[arg1][arg5][arg4] = (byte) ((var8 - 2) / 4);
				field3123[arg1][arg5][arg4] = (byte) (arg3 + var8 - 2 & 0x3);
			} else if (var8 <= 81) {
				class3.field50[arg1][arg5][arg4] = (byte) (var8 - 49);
			} else {
				class117.field2814[arg1][arg5][arg4] = (byte) (var8 - 81);
			}
		}
	}

	public class134(int arg0, class152 arg1, class152 arg2, int arg3) {
		this.field3130 = arg2;
		this.field3117 = arg0;
		this.field3118 = arg3;
		this.field3119 = arg1;
	}

	@ObfuscatedName("tb.a(IIZZ[B)Z")
	public boolean method1019(int arg0, int arg1, boolean arg2, byte[] arg3) {
		class152 var5 = this.field3119;
		synchronized (this.field3119) {
			try {
				int var6;
				if (arg2) {
					if ((long) (arg0 * 6 + 6) > this.field3130.method1174()) {
						return false;
					}
					this.field3130.method1184((long) (arg0 * 6));
					this.field3130.method1180(6, class62.field1438, 0);
					var6 = ((class62.field1438[3] & 0xFF) << 16) - (-((class62.field1438[4] & 0xFF) << 8) - (class62.field1438[5] & 0xFF));
					if (var6 <= 0 || this.field3119.method1174() / 520L < (long) var6) {
						return false;
					}
				} else {
					var6 = (int) ((this.field3119.method1174() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				class62.field1438[3] = (byte) (var6 >> 16);
				class62.field1438[4] = (byte) (var6 >> 8);
				class62.field1438[0] = (byte) (arg1 >> 16);
				class62.field1438[5] = (byte) var6;
				class62.field1438[2] = (byte) arg1;
				int var7 = 0;
				class62.field1438[1] = (byte) (arg1 >> 8);
				int var8 = 0;
				this.field3130.method1184((long) (arg0 * 6));
				this.field3130.method1175(class62.field1438, 6, 0);
				while (arg1 > var7) {
					int var9 = 0;
					if (arg2) {
						this.field3119.method1184((long) (var6 * 520));
						try {
							this.field3119.method1180(8, class62.field1438, 0);
						} catch (EOFException var14) {
							return true;
						}
						var9 = ((class62.field1438[4] & 0xFF) << 16) + ((class62.field1438[5] << 8 & 0xFF00) + (class62.field1438[6] & 0xFF));
						int var10 = ((class62.field1438[0] & 0xFF) << 8) + (class62.field1438[1] & 0xFF);
						int var11 = (class62.field1438[3] & 0xFF) + ((class62.field1438[2] & 0xFF) << 8);
						int var12 = class62.field1438[7] & 0xFF;
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
					class62.field1438[2] = (byte) (var8 >> 8);
					class62.field1438[3] = (byte) var8;
					class62.field1438[1] = (byte) arg0;
					int var13 = arg1 - var7;
					class62.field1438[7] = (byte) this.field3117;
					var8++;
					class62.field1438[0] = (byte) (arg0 >> 8);
					if (var13 > 512) {
						var13 = 512;
					}
					if (arg1 - var7 <= 512) {
						var9 = 0;
					}
					class62.field1438[6] = (byte) var9;
					class62.field1438[5] = (byte) (var9 >> 8);
					class62.field1438[4] = (byte) (var9 >> 16);
					this.field3119.method1184((long) (var6 * 520));
					this.field3119.method1175(class62.field1438, 8, 0);
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
	public byte[] method1024(int arg0) {
		class152 var2 = this.field3119;
		synchronized (this.field3119) {
			try {
				if ((long) (arg0 * 6 + 6) > this.field3130.method1174()) {
					return null;
				}
				this.field3130.method1184((long) (arg0 * 6));
				this.field3130.method1180(6, class62.field1438, 0);
				int var4 = ((class62.field1438[0] & 0xFF) << 16) + ((class62.field1438[1] & 0xFF) << 8) + (class62.field1438[2] & 0xFF);
				int var5 = ((class62.field1438[4] & 0xFF) << 8) + ((class62.field1438[3] & 0xFF) << 16) + (class62.field1438[5] & 0xFF);
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
						this.field3119.method1180(var12 + 8, class62.field1438, 0);
						int var13 = ((class62.field1438[2] & 0xFF) << 8) + (class62.field1438[3] & 0xFF);
						int var14 = (class62.field1438[1] & 0xFF) + ((class62.field1438[0] & 0xFF) << 8);
						int var15 = (class62.field1438[6] & 0xFF) + (((class62.field1438[4] & 0xFF) << 16) + ((class62.field1438[5] & 0xFF) << 8));
						int var16 = class62.field1438[7] & 0xFF;
						if (arg0 == var14 && var10 == var13 && var16 == this.field3117) {
							if (var15 >= 0 && (long) var15 <= this.field3119.method1174() / 520L) {
								var5 = var15;
								var10++;
								int var19 = 0;
								while (true) {
									if (var12 <= var19) {
										continue label55;
									}
									var8[var9++] = class62.field1438[var19 + 8];
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
	public boolean method1026(int arg0, int arg1, byte[] arg2) {
		class152 var4 = this.field3119;
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
