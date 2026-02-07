package jagex3.io;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

@ObfuscatedName("vf")
public final class BufferedRandomAccessFile {

	@ObfuscatedName("vf.b")
	public long field3475 = -1L;

	@ObfuscatedName("vf.d")
	public final byte[] field3477;

	@ObfuscatedName("vf.g")
	public int field3480;

	@ObfuscatedName("vf.i")
	public long field3482;

	@ObfuscatedName("vf.j")
	public long field3483 = -1L;

	@ObfuscatedName("vf.k")
	public long field3484;

	@ObfuscatedName("vf.o")
	public final byte[] field3488;

	@ObfuscatedName("vf.w")
	public long field3496;

	@ObfuscatedName("vf.y")
	public int field3498 = 0;

	@ObfuscatedName("vf.C")
	public final FileOnDisk field3502;

	@ObfuscatedName("vf.B")
	public long field3501;

	public BufferedRandomAccessFile(FileOnDisk arg0, int arg1, int arg2) throws IOException {
		this.field3502 = arg0;
		this.field3496 = this.field3501 = arg0.method622();
		this.field3482 = 0L;
		this.field3477 = new byte[0];
		this.field3488 = new byte[arg1];
	}

	@ObfuscatedName("vf.a(I)J")
	public long method1174() {
		return this.field3496;
	}

	@ObfuscatedName("vf.a([BBII)V")
	public void method1175(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if ((long) arg1 + this.field3482 > this.field3496) {
				this.field3496 = this.field3482 + (long) arg1;
			}
			if (this.field3483 != -1L && (this.field3483 > this.field3482 || this.field3482 > (long) this.field3498 + this.field3483)) {
				this.method1181();
			}
			if (this.field3483 != -1L && (long) arg1 + this.field3482 > (long) this.field3477.length + this.field3483) {
				int var4 = (int) ((long) this.field3477.length + this.field3483 - this.field3482);
				arg1 -= var4;
				ArrayUtil.copy(arg0, arg2, this.field3477, (int) (this.field3482 - this.field3483), var4);
				this.field3482 += var4;
				arg2 += var4;
				this.field3498 = this.field3477.length;
				this.method1181();
			}
			if (arg1 > this.field3477.length) {
				if (this.field3484 != this.field3482) {
					this.field3502.method620(this.field3482);
					this.field3484 = this.field3482;
				}
				this.field3502.method623(arg0, arg2, arg1);
				long var5 = -1L;
				this.field3484 += arg1;
				long var7 = -1L;
				if (this.field3482 >= this.field3475 && (long) this.field3480 + this.field3475 > this.field3482) {
					var5 = this.field3482;
				} else if (this.field3475 >= this.field3482 && (long) arg1 + this.field3482 > this.field3475) {
					var5 = this.field3475;
				}
				if (this.field3475 < this.field3482 + (long) arg1 && this.field3475 + (long) this.field3480 >= this.field3482 + (long) arg1) {
					var7 = (long) arg1 + this.field3482;
				} else if ((long) this.field3480 + this.field3475 > this.field3482 && (long) this.field3480 + this.field3475 <= (long) arg1 + this.field3482) {
					var7 = (long) this.field3480 + this.field3475;
				}
				if (this.field3501 < this.field3484) {
					this.field3501 = this.field3484;
				}
				if (var5 > -1L && var5 < var7) {
					int var9 = (int) (var7 - var5);
					ArrayUtil.copy(arg0, (int) (var5 + (long) arg2 - this.field3482), this.field3488, (int) (var5 - this.field3475), var9);
				}
				this.field3482 += arg1;
			} else if (arg1 > 0) {
				if (this.field3483 == -1L) {
					this.field3483 = this.field3482;
				}
				ArrayUtil.copy(arg0, arg2, this.field3477, (int) (this.field3482 - this.field3483), arg1);
				this.field3482 += arg1;
				if (this.field3482 - this.field3483 > (long) this.field3498) {
					this.field3498 = (int) (this.field3482 - this.field3483);
				}
			}
		} catch (IOException var11) {
			this.field3484 = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("vf.b(I)Ljava/io/File;")
	public File method1178() {
		return this.field3502.method619();
	}

	@ObfuscatedName("vf.c(I)V")
	public void close() throws IOException {
		this.method1181();
		this.field3502.method624();
	}

	@ObfuscatedName("vf.a(II[BI)V")
	public void method1180(int arg0, byte[] arg1, int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.field3483 != -1L && this.field3482 >= this.field3483 && this.field3483 + (long) this.field3498 >= (long) arg0 + this.field3482) {
				ArrayUtil.copy(this.field3477, (int) (this.field3482 - this.field3483), arg1, 0, arg0);
				this.field3482 += arg0;
				return;
			}
			long var4 = this.field3482;
			int var6 = arg0;
			if (this.field3482 >= this.field3475 && (long) this.field3480 + this.field3475 > this.field3482) {
				int var7 = (int) (this.field3475 + (long) this.field3480 - this.field3482);
				if (var7 > arg0) {
					var7 = arg0;
				}
				arg0 -= var7;
				ArrayUtil.copy(this.field3488, (int) (this.field3482 - this.field3475), arg1, 0, var7);
				arg2 = var7;
				this.field3482 += var7;
			}
			if (arg0 > this.field3488.length) {
				this.field3502.method620(this.field3482);
				this.field3484 = this.field3482;
				while (arg0 > 0) {
					int var9 = this.field3502.method621(arg2, arg1, arg0);
					if (var9 == -1) {
						break;
					}
					arg2 += var9;
					arg0 -= var9;
					this.field3484 += var9;
					this.field3482 += var9;
				}
			} else if (arg0 > 0) {
				this.method1183();
				int var8 = arg0;
				if (arg0 > this.field3480) {
					var8 = this.field3480;
				}
				ArrayUtil.copy(this.field3488, 0, arg1, arg2, var8);
				arg0 -= var8;
				this.field3482 += var8;
				arg2 += var8;
			}
			if (this.field3483 != -1L) {
				if (this.field3482 < this.field3483 && arg0 > 0) {
					int var10 = (int) (this.field3483 - this.field3482) + arg2;
					if (var10 > arg0 + arg2) {
						var10 = arg2 + arg0;
					}
					while (arg2 < var10) {
						arg0--;
						arg1[arg2++] = 0;
						this.field3482++;
					}
				}
				long var11 = -1L;
				if (var4 < (long) this.field3498 + this.field3483 && (long) this.field3498 + this.field3483 <= (long) var6 + var4) {
					var11 = (long) this.field3498 + this.field3483;
				} else if (this.field3483 < var4 + (long) var6 && var4 + (long) var6 <= this.field3483 + (long) this.field3498) {
					var11 = (long) var6 + var4;
				}
				long var13 = -1L;
				if (this.field3483 >= var4 && (long) var6 + var4 > this.field3483) {
					var13 = this.field3483;
				} else if (this.field3483 <= var4 && this.field3483 + (long) this.field3498 > var4) {
					var13 = var4;
				}
				if (var13 > -1L && var13 < var11) {
					int var15 = (int) (var11 - var13);
					ArrayUtil.copy(this.field3477, (int) (var13 - this.field3483), arg1, (int) (var13 - var4), var15);
					if (this.field3482 < var11) {
						arg0 = (int) ((long) arg0 + this.field3482 - var11);
						this.field3482 = var11;
					}
				}
			}
		} catch (IOException var17) {
			this.field3484 = -1L;
			throw var17;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("vf.d(I)V")
	public void method1181() throws IOException {
		if (this.field3483 == -1L) {
			return;
		}
		long var1 = -1L;
		if (this.field3484 != this.field3483) {
			this.field3502.method620(this.field3483);
			this.field3484 = this.field3483;
		}
		this.field3502.method623(this.field3477, 0, this.field3498);
		if (this.field3475 <= this.field3483 && this.field3483 < (long) this.field3480 + this.field3475) {
			var1 = this.field3483;
		} else if (this.field3475 >= this.field3483 && this.field3475 < this.field3483 + (long) this.field3498) {
			var1 = this.field3475;
		}
		this.field3484 += this.field3498;
		if (this.field3501 < this.field3484) {
			this.field3501 = this.field3484;
		}
		long var3 = -1L;
		if ((long) this.field3498 + this.field3483 > this.field3475 && this.field3475 + (long) this.field3480 >= this.field3483 + (long) this.field3498) {
			var3 = (long) this.field3498 + this.field3483;
		} else if (this.field3483 < this.field3475 + (long) this.field3480 && (long) this.field3480 + this.field3475 <= this.field3483 - -((long) this.field3498)) {
			var3 = (long) this.field3480 + this.field3475;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			ArrayUtil.copy(this.field3477, (int) (var1 - this.field3483), this.field3488, (int) (var1 - this.field3475), var5);
		}
		this.field3483 = -1L;
		this.field3498 = 0;
	}

	@ObfuscatedName("vf.a([BI)V")
	public void method1182(byte[] arg0) throws IOException {
		this.method1180(arg0.length, arg0, 0);
	}

	@ObfuscatedName("vf.a(B)V")
	public void method1183() throws IOException {
		this.field3480 = 0;
		if (this.field3484 != this.field3482) {
			this.field3502.method620(this.field3482);
			this.field3484 = this.field3482;
		}
		this.field3475 = this.field3482;
		while (this.field3480 < this.field3488.length) {
			int var1 = this.field3502.method621(this.field3480, this.field3488, this.field3488.length - this.field3480);
			if (var1 == -1) {
				break;
			}
			this.field3480 += var1;
			this.field3484 += var1;
		}
	}

	@ObfuscatedName("vf.a(BJ)V")
	public void method1184(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1178());
		}
		this.field3482 = arg0;
	}
}
