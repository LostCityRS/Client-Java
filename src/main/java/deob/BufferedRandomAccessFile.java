package deob;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("wb")
public final class BufferedRandomAccessFile {

	@ObfuscatedName("wb.b")
	public static volatile boolean field3242 = false;

	@ObfuscatedName("wb.e")
	public long field3245;

	@ObfuscatedName("wb.i")
	public static LruCache field3249 = new LruCache(20);

	@ObfuscatedName("wb.j")
	public final byte[] field3250;

	@ObfuscatedName("wb.m")
	public static int field3253 = -1;

	@ObfuscatedName("wb.o")
	public static int[] field3255 = new int[1000];

	@ObfuscatedName("wb.p")
	public int field3256;

	@ObfuscatedName("wb.s")
	public final byte[] field3259;

	@ObfuscatedName("wb.t")
	public long field3260 = -1L;

	@ObfuscatedName("wb.v")
	public int field3262 = 0;

	@ObfuscatedName("wb.w")
	public long field3263 = -1L;

	@ObfuscatedName("wb.B")
	public static boolean field3268 = false;

	@ObfuscatedName("wb.H")
	public static int field3274 = 10;

	@ObfuscatedName("wb.L")
	public static LruCache field3278 = new LruCache(50);

	@ObfuscatedName("wb.O")
	public static long[] field3281 = new long[32];

	@ObfuscatedName("wb.D")
	public final FileOnDisk field3270;

	@ObfuscatedName("wb.E")
	public long field3271;

	@ObfuscatedName("wb.C")
	public long field3269;

	@ObfuscatedName("wb.A")
	public long field3267;

	@ObfuscatedName("wb.a(IJ)V")
	public void method1041(long arg0) {
		if (arg0 >= 0L) {
			this.field3245 = arg0;
		}
	}

	@ObfuscatedName("wb.a(I)J")
	public long method1042() {
		return this.field3269;
	}

	@ObfuscatedName("wb.a(III[B)V")
	public void method1043(int arg0, int arg1, byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.field3245 > this.field3269) {
				this.field3269 = (long) arg1 + this.field3245;
			}
			if (this.field3260 != -1L && (this.field3245 < this.field3260 || this.field3245 > (long) this.field3262 + this.field3260)) {
				this.method1049();
			}
			if (this.field3260 != -1L && (long) arg1 + this.field3245 > (long) this.field3259.length + this.field3260) {
				int var4 = (int) (this.field3260 + (long) this.field3259.length - this.field3245);
				arg1 -= var4;
				class33.method392(arg2, arg0, this.field3259, (int) (this.field3245 - this.field3260), var4);
				this.field3245 += var4;
				this.field3262 = this.field3259.length;
				arg0 += var4;
				this.method1049();
			}
			if (this.field3259.length < arg1) {
				if (this.field3267 != this.field3245) {
					this.field3270.method830(this.field3245);
					this.field3267 = this.field3245;
				}
				this.field3270.method832(arg2, arg0, arg1);
				this.field3267 += arg1;
				if (this.field3267 > this.field3271) {
					this.field3271 = this.field3267;
				}
				long var5 = -1L;
				long var7 = -1L;
				if (this.field3245 >= this.field3263 && this.field3245 < (long) this.field3256 + this.field3263) {
					var7 = this.field3245;
				} else if (this.field3263 >= this.field3245 && this.field3263 < this.field3245 + (long) arg1) {
					var7 = this.field3263;
				}
				if (this.field3263 < this.field3245 + (long) arg1 && (long) arg1 + this.field3245 <= this.field3263 - -((long) this.field3256)) {
					var5 = (long) arg1 + this.field3245;
				} else if ((long) this.field3256 + this.field3263 > this.field3245 && (long) this.field3256 + this.field3263 <= (long) arg1 + this.field3245) {
					var5 = (long) this.field3256 + this.field3263;
				}
				if (var7 > -1L && var5 > var7) {
					int var9 = (int) (var5 - var7);
					class33.method392(arg2, (int) (var7 + (long) arg0 - this.field3245), this.field3250, (int) (var7 - this.field3263), var9);
				}
				this.field3245 += arg1;
			} else if (arg1 > 0) {
				if (this.field3260 == -1L) {
					this.field3260 = this.field3245;
				}
				class33.method392(arg2, arg0, this.field3259, (int) (this.field3245 - this.field3260), arg1);
				this.field3245 += arg1;
				if ((long) this.field3262 < this.field3245 - this.field3260) {
					this.field3262 = (int) (this.field3245 - this.field3260);
				}
			}
		} catch (IOException var11) {
			this.field3267 = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("wb.a(IBI[B)V")
	public void method1045(int arg0, int arg1, byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.field3260 != -1L && this.field3245 >= this.field3260 && (long) arg1 + this.field3245 <= (long) this.field3262 + this.field3260) {
				class33.method392(this.field3259, (int) (this.field3245 - this.field3260), arg2, 0, arg1);
				this.field3245 += arg1;
				return;
			}
			int var4 = arg1;
			long var5 = this.field3245;
			if (this.field3263 <= this.field3245 && (long) this.field3256 + this.field3263 > this.field3245) {
				int var7 = (int) (this.field3263 + (long) this.field3256 - this.field3245);
				if (var7 > arg1) {
					var7 = arg1;
				}
				class33.method392(this.field3250, (int) (this.field3245 - this.field3263), arg2, 0, var7);
				arg0 = var7;
				this.field3245 += var7;
				arg1 -= var7;
			}
			if (arg1 > this.field3250.length) {
				this.field3270.method830(this.field3245);
				this.field3267 = this.field3245;
				while (arg1 > 0) {
					int var9 = this.field3270.method834(arg0, arg1, arg2);
					if (var9 == -1) {
						break;
					}
					this.field3245 += var9;
					this.field3267 += var9;
					arg0 += var9;
					arg1 -= var9;
				}
			} else if (arg1 > 0) {
				int var8 = arg1;
				this.method1048();
				if (arg1 > this.field3256) {
					var8 = this.field3256;
				}
				class33.method392(this.field3250, 0, arg2, arg0, var8);
				this.field3245 += var8;
				arg0 += var8;
				arg1 -= var8;
			}
			if (this.field3260 != -1L) {
				if (this.field3245 < this.field3260 && arg1 > 0) {
					int var10 = (int) (this.field3260 - this.field3245) + arg0;
					if (var10 > arg0 + arg1) {
						var10 = arg0 + arg1;
					}
					while (arg0 < var10) {
						arg1--;
						arg2[arg0++] = 0;
						this.field3245++;
					}
				}
				long var11 = -1L;
				if (this.field3260 + (long) this.field3262 > var5 && (long) var4 + var5 >= (long) this.field3262 + this.field3260) {
					var11 = (long) this.field3262 + this.field3260;
				} else if (var5 + (long) var4 > this.field3260 && (long) this.field3262 + this.field3260 >= var5 - -((long) var4)) {
					var11 = (long) var4 + var5;
				}
				long var13 = -1L;
				if (var5 <= this.field3260 && (long) var4 + var5 > this.field3260) {
					var13 = this.field3260;
				} else if (this.field3260 <= var5 && this.field3260 + (long) this.field3262 > var5) {
					var13 = var5;
				}
				if (var13 > -1L && var13 < var11) {
					int var15 = (int) (var11 - var13);
					class33.method392(this.field3259, (int) (var13 - this.field3260), arg2, (int) (var13 - var5), var15);
					if (this.field3245 < var11) {
						arg1 = (int) ((long) arg1 + this.field3245 - var11);
						this.field3245 = var11;
					}
				}
			}
		} catch (IOException var17) {
			this.field3267 = -1L;
			throw var17;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("wb.b(I)V")
	public void method1046() throws IOException {
		this.method1049();
		this.field3270.method831();
	}

	@ObfuscatedName("wb.a(B)V")
	public void method1048() throws IOException {
		this.field3256 = 0;
		if (this.field3267 != this.field3245) {
			this.field3270.method830(this.field3245);
			this.field3267 = this.field3245;
		}
		this.field3263 = this.field3245;
		while (this.field3250.length > this.field3256) {
			int var1 = this.field3270.method834(this.field3256, this.field3250.length - this.field3256, this.field3250);
			if (var1 == -1) {
				break;
			}
			this.field3267 += var1;
			this.field3256 += var1;
		}
	}

	public BufferedRandomAccessFile(FileOnDisk arg0, int arg1, int arg2) throws IOException {
		this.field3270 = arg0;
		this.field3269 = this.field3271 = arg0.method833();
		this.field3259 = new byte[0];
		this.field3250 = new byte[arg1];
		this.field3245 = 0L;
	}

	@ObfuscatedName("wb.c(I)V")
	public void method1049() throws IOException {
		if (this.field3260 == -1L) {
			return;
		}
		if (this.field3267 != this.field3260) {
			this.field3270.method830(this.field3260);
			this.field3267 = this.field3260;
		}
		this.field3270.method832(this.field3259, 0, this.field3262);
		this.field3267 += this.field3262;
		if (this.field3271 < this.field3267) {
			this.field3271 = this.field3267;
		}
		long var1 = -1L;
		if (this.field3263 <= this.field3260 && this.field3260 < this.field3263 + (long) this.field3256) {
			var1 = this.field3260;
		} else if (this.field3260 <= this.field3263 && (long) this.field3262 + this.field3260 > this.field3263) {
			var1 = this.field3263;
		}
		long var3 = -1L;
		if ((long) this.field3262 + this.field3260 > this.field3263 && (long) this.field3256 + this.field3263 >= this.field3260 - -((long) this.field3262)) {
			var3 = (long) this.field3262 + this.field3260;
		} else if ((long) this.field3256 + this.field3263 > this.field3260 && (long) this.field3262 + this.field3260 >= this.field3263 - -((long) this.field3256)) {
			var3 = (long) this.field3256 + this.field3263;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			class33.method392(this.field3259, (int) (var1 - this.field3260), this.field3250, (int) (var1 - this.field3263), var5);
		}
		this.field3262 = 0;
		this.field3260 = -1L;
	}
}
