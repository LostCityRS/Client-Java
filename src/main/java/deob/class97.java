package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfuscatedName("o")
public final class class97 extends class13 {

	@ObfuscatedName("o.ab")
	public class32 field2204 = class71.field1671;

	@ObfuscatedName("o.cb")
	public int field2206 = 128;

	@ObfuscatedName("o.fb")
	public int field2209 = -1;

	@ObfuscatedName("o.hb")
	public int field2211 = -1;

	@ObfuscatedName("o.ib")
	public static class156 field2212 = new class156(4096);

	@ObfuscatedName("o.kb")
	public int[] field2214;

	@ObfuscatedName("o.nb")
	public int field2217 = -1;

	@ObfuscatedName("o.ob")
	public int field2218 = 32;

	@ObfuscatedName("o.pb")
	public int field2219 = -1;

	@ObfuscatedName("o.qb")
	public short[] field2220;

	@ObfuscatedName("o.rb")
	public boolean field2221 = true;

	@ObfuscatedName("o.sb")
	public int field2222 = 0;

	@ObfuscatedName("o.ub")
	public int field2224;

	@ObfuscatedName("o.Ab")
	public static int field2230 = 0;

	@ObfuscatedName("o.Cb")
	public static class32 field2232 = class73.method593("You are standing in a members)2only area)3", true);

	@ObfuscatedName("o.Eb")
	public static class32 field2234 = class73.method593("Ihr Charakter)2Profil wird in:", true);

	@ObfuscatedName("o.Bb")
	public static class32 field2231 = class73.method593("Please try again)3", true);

	@ObfuscatedName("o.Kb")
	public static final int field2240 = 20;

	@ObfuscatedName("o.Jb")
	public static class32 field2239 = field2232;

	@ObfuscatedName("o.Gb")
	public static class32 field2236 = field2231;

	@ObfuscatedName("o.zb")
	public static class32 field2229 = class73.method593("Unable to find ", true);

	@ObfuscatedName("o.Ib")
	public static class32 field2238 = field2229;

	@ObfuscatedName("o.Mb")
	public static class32 field2242 = class73.method593(" has logged out)3", true);

	@ObfuscatedName("o.wb")
	public static class32 field2226 = field2242;

	@ObfuscatedName("o.K")
	public boolean field2188 = true;

	@ObfuscatedName("o.L")
	public final class32[] field2189 = new class32[5];

	@ObfuscatedName("o.H")
	public int field2185 = -1;

	@ObfuscatedName("o.O")
	public int field2192 = -1;

	@ObfuscatedName("o.R")
	public int field2195 = -1;

	@ObfuscatedName("o.S")
	public int field2196 = 1;

	@ObfuscatedName("o.Y")
	public int field2202 = -1;

	@ObfuscatedName("o.N")
	public int field2191 = 0;

	@ObfuscatedName("o.U")
	public int field2198 = -1;

	@ObfuscatedName("o.I")
	public int field2186 = -1;

	@ObfuscatedName("o.X")
	public int field2201 = -1;

	@ObfuscatedName("o.xb")
	public int field2227 = 128;

	@ObfuscatedName("o.Lb")
	public boolean field2241 = true;

	@ObfuscatedName("o.Nb")
	public boolean field2243 = false;

	@ObfuscatedName("o.Hb")
	public static class30 field2237;

	@ObfuscatedName("o.M")
	public int[] field2190;

	@ObfuscatedName("o.Z")
	public int[] field2203;

	@ObfuscatedName("o.Fb")
	public static class102[] field2235;

	@ObfuscatedName("o.Db")
	public static class49[] field2233;

	@ObfuscatedName("o.P")
	public short[] field2193;

	@ObfuscatedName("o.T")
	public short[] field2197;

	@ObfuscatedName("o.yb")
	public short[] field2228;

	@ObfuscatedName("o.b(III)I")
	public static int method751(int arg0, int arg1) {
		int var2 = arg1 + arg0 * 57;
		int var3 = var2 ^ var2 << 13;
		int var4 = Integer.MAX_VALUE & var3 * (var3 * 15731 * var3 + 789221) + 1376312589;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("o.a(BILge;)V")
	public static void method753(class47 arg0) {
		while (true) {
			class29 var1 = (class29) class112.field2627.method1211();
			if (var1 == null) {
				return;
			}
			boolean var2 = false;
			for (int var3 = 0; var3 < var1.field535; var3++) {
				if (var1.field529[var3] != null) {
					if (var1.field529[var3].field355 == 2) {
						var1.field524[var3] = -5;
					}
					if (var1.field529[var3].field355 == 0) {
						var2 = true;
					}
				}
				if (var1.field534[var3] != null) {
					if (var1.field534[var3].field355 == 2) {
						var1.field524[var3] = -6;
					}
					if (var1.field534[var3].field355 == 0) {
						var2 = true;
					}
				}
			}
			if (var2) {
				return;
			}
			arg0.method356(183);
			arg0.method514(0);
			int var4 = arg0.field1568;
			arg0.method530(var1.field518);
			for (int var5 = 0; var5 < var1.field535; var5++) {
				if (var1.field524[var5] == 0) {
					try {
						int var6 = var1.field532[var5];
						if (var6 == 0) {
							Field var10 = (Field) var1.field529[var5].field352;
							int var11 = var10.getInt(null);
							arg0.method514(0);
							arg0.method530(var11);
						} else if (var6 == 1) {
							Field var9 = (Field) var1.field529[var5].field352;
							var9.setInt(null, var1.field526[var5]);
							arg0.method514(0);
						} else if (var6 == 2) {
							Field var7 = (Field) var1.field529[var5].field352;
							int var8 = var7.getModifiers();
							arg0.method514(0);
							arg0.method530(var8);
						}
						if (var6 == 3) {
							Method var14 = (Method) var1.field534[var5].field352;
							byte[][] var15 = var1.field533[var5];
							Object[] var16 = new Object[var15.length];
							for (int var17 = 0; var17 < var15.length; var17++) {
								ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
								var16[var17] = var18.readObject();
							}
							Object var19 = var14.invoke(null, var16);
							if (var19 == null) {
								arg0.method514(0);
							} else if (var19 instanceof Number) {
								arg0.method514(1);
								arg0.method541(((Number) var19).longValue());
							} else if (var19 instanceof class32) {
								arg0.method514(2);
								arg0.method521((class32) var19);
							} else {
								arg0.method514(4);
							}
						} else if (var6 == 4) {
							Method var12 = (Method) var1.field534[var5].field352;
							int var13 = var12.getModifiers();
							arg0.method514(0);
							arg0.method530(var13);
						}
					} catch (ClassNotFoundException var20) {
						arg0.method514(-10);
					} catch (InvalidClassException var21) {
						arg0.method514(-11);
					} catch (StreamCorruptedException var22) {
						arg0.method514(-12);
					} catch (OptionalDataException var23) {
						arg0.method514(-13);
					} catch (IllegalAccessException var24) {
						arg0.method514(-14);
					} catch (IllegalArgumentException var25) {
						arg0.method514(-15);
					} catch (InvocationTargetException var26) {
						arg0.method514(-16);
					} catch (SecurityException var27) {
						arg0.method514(-17);
					} catch (IOException var28) {
						arg0.method514(-18);
					} catch (NullPointerException var29) {
						arg0.method514(-19);
					} catch (Exception var30) {
						arg0.method514(-20);
					} catch (Throwable var31) {
						arg0.method514(-21);
					}
				} else {
					arg0.method514(var1.field524[var5]);
				}
			}
			arg0.method522(var4);
			arg0.method515(arg0.field1568 - var4);
			var1.method1091();
		}
	}

	@ObfuscatedName("o.a(I[B)[B")
	public static byte[] method754(byte[] arg0) {
		class66 var1 = new class66(arg0);
		int var2 = var1.method532();
		int var3 = var1.method538();
		if (var3 < 0 || class36.field742 != 0 && class36.field742 < var3) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.method557(var3, var6);
			return var6;
		} else {
			int var4 = var1.method538();
			if (var4 < 0 || class36.field742 != 0 && class36.field742 < var4) {
				throw new RuntimeException();
			}
			byte[] var5 = new byte[var4];
			if (var2 == 1) {
				class122.method964(var5, var4, arg0, var3);
			} else {
				class13.field217.method6(var5, var1);
			}
			return var5;
		}
	}

	@ObfuscatedName("o.a(Lec;ZILec;Lec;)V")
	public static void method756(class32 arg0, int arg1, class32 arg2, class32 arg3) {
		for (int var4 = 99; var4 > 0; var4--) {
			class17.field347[var4] = class17.field347[var4 - 1];
			class14.field245[var4] = class14.field245[var4 - 1];
			class36.field832[var4] = class36.field832[var4 - 1];
			class111.field2610[var4] = class111.field2610[var4 - 1];
		}
		class15.field319 = class115.field2767;
		class14.field245[0] = arg0;
		class23.field423++;
		class17.field347[0] = arg1;
		class36.field832[0] = arg2;
		class111.field2610[0] = arg3;
	}

	@ObfuscatedName("o.a(BI)Lvc;")
	public static class149 method760(int arg0) {
		class149 var1 = (class149) class92.field2107.method485((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = class79.field1828.method206(12, arg0);
		class149 var3 = new class149();
		if (var2 != null) {
			var3.method1107(new class66(var2));
		}
		var3.method1115();
		class92.field2107.method484((long) arg0, var3);
		return var3;
	}

	@ObfuscatedName("o.e(I)Lp;")
	public class104 method752() {
		if (this.field2214 != null) {
			class97 var1 = this.method757();
			return var1 == null ? null : var1.method752();
		} else if (this.field2203 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < this.field2203.length; var3++) {
				if (!class19.field363.method213(this.field2203[var3], 0)) {
					var2 = true;
				}
			}
			if (var2) {
				return null;
			}
			class104[] var4 = new class104[this.field2203.length];
			for (int var5 = 0; var5 < this.field2203.length; var5++) {
				var4[var5] = class104.method840(class19.field363, this.field2203[var5]);
			}
			class104 var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new class104(var4, var4.length);
			}
			if (this.field2228 != null) {
				for (int var7 = 0; var7 < this.field2228.length; var7++) {
					var6.method833(this.field2228[var7], this.field2220[var7]);
				}
			}
			if (this.field2193 != null) {
				for (int var8 = 0; var8 < this.field2193.length; var8++) {
					var6.method853(this.field2193[var8], this.field2197[var8]);
				}
			}
			return var6;
		}
	}

	@ObfuscatedName("o.f(I)Z")
	public boolean method755() {
		if (this.field2214 == null) {
			return true;
		}
		int var1 = -1;
		if (this.field2192 != -1) {
			var1 = class70.method577(this.field2192);
		} else if (this.field2186 != -1) {
			var1 = class27.field504[this.field2186];
		}
		return var1 >= 0 && var1 < this.field2214.length && this.field2214[var1] != -1;
	}

	@ObfuscatedName("o.g(I)Lo;")
	public class97 method757() {
		int var1 = -1;
		if (this.field2192 != -1) {
			var1 = class70.method577(this.field2192);
		} else if (this.field2186 != -1) {
			var1 = class27.field504[this.field2186];
		}
		return var1 < 0 || var1 >= this.field2214.length || this.field2214[var1] == -1 ? null : class17.method130(this.field2214[var1]);
	}

	@ObfuscatedName("o.a(BLjd;)V")
	public void method758(class66 arg0) {
		while (true) {
			int var2 = arg0.method532();
			if (var2 == 0) {
				return;
			}
			this.method763(arg0, var2);
		}
	}

	@ObfuscatedName("o.a(Lvc;ILvc;BI)Lod;")
	public class101 method761(class149 arg0, int arg1, class149 arg2, int arg3) {
		if (this.field2214 != null) {
			class97 var5 = this.method757();
			return var5 == null ? null : var5.method761(arg0, arg1, arg2, arg3);
		}
		class101 var6 = (class101) class143.field3269.method485((long) this.field2224);
		if (var6 == null) {
			boolean var7 = false;
			for (int var8 = 0; var8 < this.field2190.length; var8++) {
				if (!class19.field363.method213(this.field2190[var8], 0)) {
					var7 = true;
				}
			}
			if (var7) {
				return null;
			}
			class104[] var9 = new class104[this.field2190.length];
			for (int var10 = 0; var10 < this.field2190.length; var10++) {
				var9[var10] = class104.method840(class19.field363, this.field2190[var10]);
			}
			class104 var11;
			if (var9.length == 1) {
				var11 = var9[0];
			} else {
				var11 = new class104(var9, var9.length);
			}
			if (this.field2228 != null) {
				for (int var12 = 0; var12 < this.field2228.length; var12++) {
					var11.method833(this.field2228[var12], this.field2220[var12]);
				}
			}
			if (this.field2193 != null) {
				for (int var13 = 0; var13 < this.field2193.length; var13++) {
					var11.method853(this.field2193[var13], this.field2197[var13]);
				}
			}
			var6 = var11.method847(this.field2191 + 64, this.field2222 + 850, -30, -50, -30);
			class143.field3269.method484((long) this.field2224, var6);
		}
		class101 var14;
		if (arg2 != null && arg0 != null) {
			var14 = arg2.method1114(arg3, arg0, var6, arg1);
		} else if (arg2 != null) {
			var14 = arg2.method1116(var6, arg1);
		} else if (arg0 == null) {
			var14 = var6.method799(true);
		} else {
			var14 = arg0.method1116(var6, arg3);
		}
		if (this.field2206 != 128 || this.field2227 != 128) {
			var14.method805(this.field2206, this.field2227, this.field2206);
		}
		return var14;
	}

	@ObfuscatedName("o.b(B)V")
	public void method762() {
	}

	@ObfuscatedName("o.a(ILjd;I)V")
	public void method763(class66 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method532();
			this.field2190 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2190[var4] = arg0.method531();
			}
		} else if (arg1 == 2) {
			this.field2204 = arg0.method555();
		} else if (arg1 == 12) {
			this.field2196 = arg0.method532();
		} else if (arg1 == 13) {
			this.field2195 = arg0.method531();
		} else if (arg1 == 14) {
			this.field2202 = arg0.method531();
		} else if (arg1 == 15) {
			this.field2209 = arg0.method531();
		} else if (arg1 == 16) {
			this.field2185 = arg0.method531();
		} else if (arg1 == 17) {
			this.field2202 = arg0.method531();
			this.field2201 = arg0.method531();
			this.field2219 = arg0.method531();
			this.field2211 = arg0.method531();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field2189[arg1 - 30] = arg0.method555();
			if (this.field2189[arg1 - 30].method271(class159.field3655)) {
				this.field2189[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var11 = arg0.method532();
			this.field2228 = new short[var11];
			this.field2220 = new short[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				this.field2228[var12] = (short) arg0.method531();
				this.field2220[var12] = (short) arg0.method531();
			}
		} else if (arg1 == 41) {
			int var9 = arg0.method532();
			this.field2193 = new short[var9];
			this.field2197 = new short[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2193[var10] = (short) arg0.method531();
				this.field2197[var10] = (short) arg0.method531();
			}
		} else if (arg1 == 60) {
			int var5 = arg0.method532();
			this.field2203 = new int[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2203[var6] = arg0.method531();
			}
		} else if (arg1 == 93) {
			this.field2221 = false;
		} else if (arg1 == 95) {
			this.field2198 = arg0.method531();
		} else if (arg1 == 97) {
			this.field2206 = arg0.method531();
		} else if (arg1 == 98) {
			this.field2227 = arg0.method531();
		} else if (arg1 == 99) {
			this.field2243 = true;
		} else if (arg1 == 100) {
			this.field2191 = arg0.method544();
		} else if (arg1 == 101) {
			this.field2222 = arg0.method544() * 5;
		} else if (arg1 == 102) {
			this.field2217 = arg0.method531();
		} else if (arg1 == 103) {
			this.field2218 = arg0.method531();
		} else if (arg1 == 106) {
			this.field2192 = arg0.method531();
			if (this.field2192 == 65535) {
				this.field2192 = -1;
			}
			this.field2186 = arg0.method531();
			if (this.field2186 == 65535) {
				this.field2186 = -1;
			}
			int var7 = arg0.method532();
			this.field2214 = new int[var7 + 1];
			for (int var8 = 0; var8 <= var7; var8++) {
				this.field2214[var8] = arg0.method531();
				if (this.field2214[var8] == 65535) {
					this.field2214[var8] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.field2188 = false;
		} else if (arg1 == 109) {
			this.field2241 = false;
		}
	}
}
