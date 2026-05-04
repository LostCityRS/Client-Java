package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Random;

@ObfuscatedName("kj")
public final class class119 {

	@ObfuscatedName("kj.a")
	public long field2152;

	@ObfuscatedName("kj.c")
	public static final class88 field2154 = class208.method1423(105, "und haben es deaktiviert)3 Klicken Sie auf der");

	@ObfuscatedName("kj.e")
	public static final class88 field2156 = class208.method1423(105, "scape main");

	@ObfuscatedName("kj.f")
	public int field2157;

	@ObfuscatedName("kj.h")
	public static int field2159 = 0;

	@ObfuscatedName("kj.k")
	public final class63 field2162;

	@ObfuscatedName("kj.l")
	public long field2163;

	@ObfuscatedName("kj.m")
	public long field2164;

	@ObfuscatedName("kj.n")
	public static final class88 field2165 = class208.method1423(105, "Starte 3D)2Softwarebibliothek)3");

	@ObfuscatedName("kj.p")
	public static final int[] field2167 = new int[2000];

	@ObfuscatedName("kj.r")
	public final byte[] field2169;

	@ObfuscatedName("kj.s")
	public final byte[] field2170;

	@ObfuscatedName("kj.t")
	public static final class88 field2171 = class208.method1423(105, ")2");

	@ObfuscatedName("kj.u")
	public static int field2172 = 127;

	@ObfuscatedName("kj.w")
	public int field2174 = 0;

	@ObfuscatedName("kj.x")
	public long field2175 = -1L;

	@ObfuscatedName("kj.A")
	public long field2178 = -1L;

	@ObfuscatedName("kj.D")
	public static int field2181;

	@ObfuscatedName("kj.y")
	public long field2176;

	@ObfuscatedName("kj.a(ILjava/util/Random;I)I")
	public static int method812(int arg0, Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (class149.method1017(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			int var2 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			int var3;
			do {
				var3 = arg1.nextInt();
			} while (var2 <= var3);
			return class160.method1080(var3, arg0);
		}
	}

	@ObfuscatedName("kj.a(IBLbj;)V")
	public static void method814(int arg0, class22 arg1) {
		if (class79.field1427 == null) {
			class188.method1312(null, 255, 255, (byte) 0, 0, true);
			class10.field141[arg0] = arg1;
		} else {
			class79.field1427.field831 = arg0 * 8 + 5;
			int var2 = class79.field1427.method323();
			int var3 = class79.field1427.method323();
			arg1.method109(var2, var3);
		}
	}

	@ObfuscatedName("kj.a([IIIIII)V")
	public static void method815(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		class52 var5 = class29.field489[arg2][arg3][arg4];
		if (var5 == null) {
			return;
		}
		class95 var6 = var5.field947;
		if (var6 != null) {
			int var7 = var6.field1772;
			if (var7 != 0) {
				for (int var8 = 0; var8 < 4; var8++) {
					arg0[arg1] = var7;
					arg0[arg1 + 1] = var7;
					arg0[arg1 + 2] = var7;
					arg0[arg1 + 3] = var7;
					arg1 += 512;
				}
			}
			return;
		}
		class56 var9 = var5.field964;
		if (var9 == null) {
			return;
		}
		int var10 = var9.field1065;
		int var11 = var9.field1066;
		int var12 = var9.field1061;
		int var13 = var9.field1067;
		int[] var14 = class225.field4232[var10];
		int[] var15 = class16.field248[var11];
		int var16 = 0;
		if (var12 != 0) {
			for (int var17 = 0; var17 < 4; var17++) {
				arg0[arg1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg0[arg1 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
				arg1 += 512;
			}
			return;
		}
		for (int var18 = 0; var18 < 4; var18++) {
			if (var14[var15[var16++]] != 0) {
				arg0[arg1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 1] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 2] = var13;
			}
			if (var14[var15[var16++]] != 0) {
				arg0[arg1 + 3] = var13;
			}
			arg1 += 512;
		}
	}

	public class119(class63 arg0, int arg1, int arg2) throws IOException {
		this.field2162 = arg0;
		this.field2152 = this.field2163 = arg0.method447();
		this.field2169 = new byte[arg1];
		this.field2164 = 0L;
		this.field2170 = new byte[0];
	}

	@ObfuscatedName("kj.a([BIII)V")
	public void method806(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (this.field2152 < (long) arg1 + this.field2164) {
				this.field2152 = (long) arg1 + this.field2164;
			}
			if (this.field2178 != -1L && (this.field2178 > this.field2164 || this.field2164 > (long) this.field2174 + this.field2178)) {
				this.method807();
			}
			if (this.field2178 != -1L && (long) this.field2170.length + this.field2178 < this.field2164 - -((long) arg1)) {
				int var4 = (int) (this.field2178 + (long) this.field2170.length - this.field2164);
				arg1 -= var4;
				class124.method836(arg0, arg2, this.field2170, (int) (this.field2164 - this.field2178), var4);
				this.field2164 += var4;
				this.field2174 = this.field2170.length;
				arg2 += var4;
				this.method807();
			}
			if (this.field2170.length < arg1) {
				if (this.field2176 != this.field2164) {
					this.field2162.method444(this.field2164);
					this.field2176 = this.field2164;
				}
				this.field2162.method443(arg2, arg1, arg0);
				this.field2176 += arg1;
				if (this.field2176 > this.field2163) {
					this.field2163 = this.field2176;
				}
				long var5 = -1L;
				if (this.field2175 <= this.field2164 && (long) this.field2157 + this.field2175 > this.field2164) {
					var5 = this.field2164;
				} else if (this.field2175 >= this.field2164 && this.field2164 + (long) arg1 > this.field2175) {
					var5 = this.field2175;
				}
				long var7 = -1L;
				if ((long) arg1 + this.field2164 > this.field2175 && (long) arg1 + this.field2164 <= (long) this.field2157 + this.field2175) {
					var7 = (long) arg1 + this.field2164;
				} else if ((long) this.field2157 + this.field2175 > this.field2164 && (long) this.field2157 + this.field2175 <= this.field2164 + (long) arg1) {
					var7 = this.field2175 + (long) this.field2157;
				}
				if (var5 > -1L && var5 < var7) {
					int var9 = (int) (var7 - var5);
					class124.method836(arg0, (int) (var5 + (long) arg2 - this.field2164), this.field2169, (int) (var5 - this.field2175), var9);
				}
				this.field2164 += arg1;
			} else if (arg1 > 0) {
				if (this.field2178 == -1L) {
					this.field2178 = this.field2164;
				}
				class124.method836(arg0, arg2, this.field2170, (int) (this.field2164 - this.field2178), arg1);
				this.field2164 += arg1;
				if ((long) this.field2174 < this.field2164 - this.field2178) {
					this.field2174 = (int) (this.field2164 - this.field2178);
				}
			}
		} catch (IOException var11) {
			this.field2176 = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("kj.a(I)V")
	public void method807() throws IOException {
		if (this.field2178 == (long) -1) {
			return;
		}
		if (this.field2178 != this.field2176) {
			this.field2162.method444(this.field2178);
			this.field2176 = this.field2178;
		}
		this.field2162.method443(0, this.field2174, this.field2170);
		long var1 = -1L;
		this.field2176 += this.field2174;
		if (this.field2175 <= this.field2178 && this.field2178 < this.field2175 + (long) this.field2157) {
			var1 = this.field2178;
		} else if (this.field2175 >= this.field2178 && this.field2175 < (long) this.field2174 + this.field2178) {
			var1 = this.field2175;
		}
		if (this.field2176 > this.field2163) {
			this.field2163 = this.field2176;
		}
		long var3 = -1L;
		if (this.field2175 < this.field2178 + (long) this.field2174 && this.field2178 + (long) this.field2174 <= this.field2175 - -((long) this.field2157)) {
			var3 = this.field2178 + (long) this.field2174;
		} else if (this.field2178 < this.field2175 + (long) this.field2157 && (long) this.field2157 + this.field2175 <= (long) this.field2174 + this.field2178) {
			var3 = (long) this.field2157 + this.field2175;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			class124.method836(this.field2170, (int) (var1 - this.field2178), this.field2169, (int) (var1 - this.field2175), var5);
		}
		this.field2174 = 0;
		this.field2178 = -1L;
	}

	@ObfuscatedName("kj.b(I)J")
	public long method808() {
		return this.field2152;
	}

	@ObfuscatedName("kj.c(I)V")
	public void method809() throws IOException {
		this.field2157 = 0;
		if (this.field2164 != this.field2176) {
			this.field2162.method444(this.field2164);
			this.field2176 = this.field2164;
		}
		this.field2175 = this.field2164;
		while (this.field2157 < this.field2169.length) {
			int var1 = this.field2169.length - this.field2157;
			if (var1 > 200000000) {
				var1 = 200000000;
			}
			int var2 = this.field2162.method448(this.field2157, var1, this.field2169);
			if (var2 == -1) {
				break;
			}
			this.field2176 += var2;
			this.field2157 += var2;
		}
	}

	@ObfuscatedName("kj.a(I[B)V")
	public void method810(byte[] arg0) throws IOException {
		this.method816(arg0, 0, arg0.length);
	}

	@ObfuscatedName("kj.b(B)Ljava/io/File;")
	public File method813() {
		return this.field2162.method445();
	}

	@ObfuscatedName("kj.a([BBII)V")
	public void method816(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.field2178 != -1L && this.field2164 >= this.field2178 && (long) arg2 + this.field2164 <= this.field2178 - -((long) this.field2174)) {
				class124.method836(this.field2170, (int) (this.field2164 - this.field2178), arg0, 0, arg2);
				this.field2164 += arg2;
				return;
			}
			long var4 = this.field2164;
			int var6 = arg2;
			if (this.field2164 >= this.field2175 && this.field2175 + (long) this.field2157 > this.field2164) {
				int var7 = (int) ((long) this.field2157 + this.field2175 - this.field2164);
				if (var7 > arg2) {
					var7 = arg2;
				}
				arg2 -= var7;
				class124.method836(this.field2169, (int) (this.field2164 - this.field2175), arg0, 0, var7);
				this.field2164 += var7;
				arg1 = var7;
			}
			if (arg2 > this.field2169.length) {
				this.field2162.method444(this.field2164);
				this.field2176 = this.field2164;
				while (arg2 > 0) {
					int var9 = this.field2162.method448(arg1, arg2, arg0);
					if (var9 == -1) {
						break;
					}
					arg1 += var9;
					this.field2164 += var9;
					arg2 -= var9;
					this.field2176 += var9;
				}
			} else if (arg2 > 0) {
				this.method809();
				int var8 = arg2;
				if (arg2 > this.field2157) {
					var8 = this.field2157;
				}
				arg2 -= var8;
				class124.method836(this.field2169, 0, arg0, arg1, var8);
				arg1 += var8;
				this.field2164 += var8;
			}
			if (this.field2178 != -1L) {
				if (this.field2178 > this.field2164 && arg2 > 0) {
					int var10 = (int) (this.field2178 - this.field2164) + arg1;
					if (arg2 + arg1 < var10) {
						var10 = arg2 + arg1;
					}
					while (var10 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.field2164++;
					}
				}
				long var11 = -1L;
				if (this.field2178 >= var4 && var4 + (long) var6 > this.field2178) {
					var11 = this.field2178;
				} else if (var4 >= this.field2178 && var4 < this.field2178 + (long) this.field2174) {
					var11 = var4;
				}
				long var13 = -1L;
				if (this.field2178 + (long) this.field2174 > var4 && this.field2178 + (long) this.field2174 <= (long) var6 + var4) {
					var13 = this.field2178 + (long) this.field2174;
				} else if (var4 + (long) var6 > this.field2178 && (long) var6 + var4 <= this.field2178 + (long) this.field2174) {
					var13 = (long) var6 + var4;
				}
				if (var11 > -1L && var11 < var13) {
					int var15 = (int) (var13 - var11);
					class124.method836(this.field2170, (int) (var11 - this.field2178), arg0, (int) (var11 - var4), var15);
					if (this.field2164 < var13) {
						arg2 = (int) ((long) arg2 + this.field2164 - var13);
						this.field2164 = var13;
					}
				}
			}
		} catch (IOException var17) {
			this.field2176 = -1L;
			throw var17;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("kj.d(I)V")
	public void method817() throws IOException {
		this.method807();
		this.field2162.method446(0);
	}

	@ObfuscatedName("kj.a(BJ)V")
	public void method818(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method813());
		}
		this.field2164 = arg0;
	}
}
