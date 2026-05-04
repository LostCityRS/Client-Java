package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("ud")
public final class class222 {

	@ObfuscatedName("ud.a")
	public static short field4179 = 32767;

	@ObfuscatedName("ud.b")
	public class119 field4180 = null;

	@ObfuscatedName("ud.c")
	public final int field4181;

	@ObfuscatedName("ud.d")
	public static class88 field4182 = null;

	@ObfuscatedName("ud.e")
	public int field4183 = 65000;

	@ObfuscatedName("ud.g")
	public class119 field4185 = null;

	@ObfuscatedName("ud.j")
	public static final class88 field4188 = class208.method1423(105, "Gegenstand f-Ur Mitglieder");

	@ObfuscatedName("ud.l")
	public static final class88 field4190 = class208.method1423(105, "<br>(X100(U(Y");

	@ObfuscatedName("ud.n")
	public static int field4192;

	@ObfuscatedName("ud.a(Lq;BI)Li;")
	public static class88 method1494(class174 arg0, int arg1) {
		if (!class105.method726(arg1, class80.method530(arg0)) && arg0.field3401 == null) {
			return null;
		} else if (arg0.field3373 == null || arg1 >= arg0.field3373.length || arg0.field3373[arg1] == null || arg0.field3373[arg1].method602().method604() == 0) {
			return class116.field2103 ? class166.method1140(new class88[] { class99.field1802, class170.method1212(arg1) }) : null;
		} else {
			return arg0.field3373[arg1];
		}
	}

	public class222(int arg0, class119 arg1, class119 arg2, int arg3) {
		this.field4181 = arg0;
		this.field4183 = arg3;
		this.field4185 = arg1;
		this.field4180 = arg2;
	}

	@ObfuscatedName("ud.a(IIIZ[B)Z")
	public boolean method1495(int arg0, int arg1, boolean arg2, byte[] arg3) {
		class119 var5 = this.field4185;
		synchronized (this.field4185) {
			try {
				int var6;
				if (arg2) {
					if (this.field4180.method808() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.field4180.method818((long) (arg1 * 6));
					this.field4180.method816(class230.field4303, 0, 6);
					var6 = ((class230.field4303[4] & 0xFF) << 8) + ((class230.field4303[3] & 0xFF) << 16) + (class230.field4303[5] & 0xFF);
					if (var6 <= 0 || (long) var6 > this.field4185.method808() / 520L) {
						return false;
					}
				} else {
					var6 = (int) ((this.field4185.method808() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				class230.field4303[0] = (byte) (arg0 >> 16);
				class230.field4303[5] = (byte) var6;
				int var7 = 0;
				class230.field4303[2] = (byte) arg0;
				class230.field4303[4] = (byte) (var6 >> 8);
				class230.field4303[3] = (byte) (var6 >> 16);
				int var8 = 0;
				class230.field4303[1] = (byte) (arg0 >> 8);
				this.field4180.method818((long) (arg1 * 6));
				this.field4180.method806(class230.field4303, 6, 0);
				while (var7 < arg0) {
					int var9 = 0;
					if (arg2) {
						this.field4185.method818((long) (var6 * 520));
						try {
							this.field4185.method816(class230.field4303, 0, 8);
						} catch (EOFException var14) {
							return true;
						}
						var9 = (class230.field4303[6] & 0xFF) + ((class230.field4303[5] & 0xFF) << 8) + ((class230.field4303[4] & 0xFF) << 16);
						int var10 = ((class230.field4303[0] & 0xFF) << 8) + (class230.field4303[1] & 0xFF);
						int var11 = ((class230.field4303[2] & 0xFF) << 8) + (class230.field4303[3] & 0xFF);
						int var12 = class230.field4303[7] & 0xFF;
						if (var10 != arg1 || var8 != var11 || var12 != this.field4181) {
							return false;
						}
						if (var9 < 0 || this.field4185.method808() / 520L < (long) var9) {
							return false;
						}
					}
					if (var9 == 0) {
						var9 = (int) ((this.field4185.method808() + 519L) / 520L);
						arg2 = false;
						if (var9 == 0) {
							var9++;
						}
						if (var9 == var6) {
							var9++;
						}
					}
					class230.field4303[2] = (byte) (var8 >> 8);
					class230.field4303[1] = (byte) arg1;
					class230.field4303[3] = (byte) var8;
					class230.field4303[0] = (byte) (arg1 >> 8);
					class230.field4303[7] = (byte) this.field4181;
					var8++;
					if (arg0 - var7 <= 512) {
						var9 = 0;
					}
					class230.field4303[5] = (byte) (var9 >> 8);
					int var13 = arg0 - var7;
					if (var13 > 512) {
						var13 = 512;
					}
					class230.field4303[4] = (byte) (var9 >> 16);
					class230.field4303[6] = (byte) var9;
					this.field4185.method818((long) (var6 * 520));
					var6 = var9;
					this.field4185.method806(class230.field4303, 8, 0);
					this.field4185.method806(arg3, var13, var7);
					var7 += var13;
				}
				return true;
			} catch (IOException var15) {
				return false;
			}
		}
	}

	@ObfuscatedName("ud.a(IB)[B")
	public byte[] method1497(int arg0) {
		class119 var2 = this.field4185;
		synchronized (this.field4185) {
			try {
				if ((long) (arg0 * 6 + 6) > this.field4180.method808()) {
					return null;
				}
				this.field4180.method818((long) (arg0 * 6));
				this.field4180.method816(class230.field4303, 0, 6);
				int var4 = (class230.field4303[2] & 0xFF) + ((class230.field4303[1] & 0xFF) << 8) + ((class230.field4303[0] & 0xFF) << 16);
				int var5 = (class230.field4303[5] & 0xFF) + ((class230.field4303[4] & 0xFF) << 8) + ((class230.field4303[3] & 0xFF) << 16);
				if (var4 < 0 || this.field4183 < var4) {
					return null;
				} else if (var5 > 0 && this.field4185.method808() / 520L >= (long) var5) {
					byte[] var8 = new byte[var4];
					int var9 = 0;
					int var10 = 0;
					while (var4 > var9) {
						if (var5 == 0) {
							return null;
						}
						this.field4185.method818((long) (var5 * 520));
						int var12 = var4 - var9;
						if (var12 > 512) {
							var12 = 512;
						}
						this.field4185.method816(class230.field4303, 0, var12 + 8);
						int var13 = (class230.field4303[1] & 0xFF) + ((class230.field4303[0] & 0xFF) << 8);
						int var14 = ((class230.field4303[5] & 0xFF) << 8) + (class230.field4303[4] << 16 & 0xFF0000) + (class230.field4303[6] & 0xFF);
						int var15 = class230.field4303[7] & 0xFF;
						int var16 = (class230.field4303[3] & 0xFF) + ((class230.field4303[2] & 0xFF) << 8);
						if (var13 == arg0 && var10 == var16 && this.field4181 == var15) {
							if (var14 >= 0 && (long) var14 <= this.field4185.method808() / 520L) {
								for (int var19 = 0; var19 < var12; var19++) {
									var8[var9++] = class230.field4303[var19 + 8];
								}
								var5 = var14;
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
			} catch (IOException var21) {
				return null;
			}
		}
	}

	@ObfuscatedName("ud.a([BIII)Z")
	public boolean method1498(byte[] arg0, int arg1, int arg2) {
		class119 var4 = this.field4185;
		synchronized (this.field4185) {
			if (arg2 < 0 || arg2 > this.field4183) {
				throw new IllegalArgumentException();
			}
			boolean var5 = this.method1495(arg2, arg1, true, arg0);
			if (!var5) {
				var5 = this.method1495(arg2, arg1, false, arg0);
			}
			return var5;
		}
	}

	@Override
	public String toString() {
		return "Cache:" + this.field4181;
	}
}
