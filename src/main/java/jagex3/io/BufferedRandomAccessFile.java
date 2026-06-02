package jagex3.io;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

@ObfuscatedName("kj")
public final class BufferedRandomAccessFile {

	@ObfuscatedName("kj.a")
	public long field2152;

	@ObfuscatedName("kj.f")
	public int bufferPos;

	@ObfuscatedName("kj.k")
	public final FileOnDisk file;

	@ObfuscatedName("kj.l")
	public long fileLength;

	@ObfuscatedName("kj.m")
	public long targetPos;

	@ObfuscatedName("kj.r")
	public final byte[] buffer;

	@ObfuscatedName("kj.s")
	public final byte[] writeBuffer;

	@ObfuscatedName("kj.w")
	public int writeBufferSize = 0;

	@ObfuscatedName("kj.x")
	public long bufferStartPos = -1L;

	@ObfuscatedName("kj.A")
	public long writeBufferPos = -1L;

	@ObfuscatedName("kj.y")
	public long filePos;

	public BufferedRandomAccessFile(FileOnDisk arg0, int arg1, int arg2) throws IOException {
		this.file = arg0;
		this.field2152 = this.fileLength = arg0.length();
		this.buffer = new byte[arg1];
		this.targetPos = 0L;
		this.writeBuffer = new byte[0];
	}

	@ObfuscatedName("kj.a([BIII)V")
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (this.field2152 < (long) arg1 + this.targetPos) {
				this.field2152 = (long) arg1 + this.targetPos;
			}
			if (this.writeBufferPos != -1L && (this.writeBufferPos > this.targetPos || this.targetPos > (long) this.writeBufferSize + this.writeBufferPos)) {
				this.flush();
			}
			if (this.writeBufferPos != -1L && (long) this.writeBuffer.length + this.writeBufferPos < this.targetPos - -((long) arg1)) {
				int var4 = (int) (this.writeBufferPos + (long) this.writeBuffer.length - this.targetPos);
				arg1 -= var4;
				ArrayUtil.copy(arg0, arg2, this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), var4);
				this.targetPos += var4;
				this.writeBufferSize = this.writeBuffer.length;
				arg2 += var4;
				this.flush();
			}
			if (this.writeBuffer.length < arg1) {
				if (this.filePos != this.targetPos) {
					this.file.seek(this.targetPos);
					this.filePos = this.targetPos;
				}
				this.file.write(arg2, arg1, arg0);
				this.filePos += arg1;
				if (this.filePos > this.fileLength) {
					this.fileLength = this.filePos;
				}
				long var5 = -1L;
				if (this.bufferStartPos <= this.targetPos && (long) this.bufferPos + this.bufferStartPos > this.targetPos) {
					var5 = this.targetPos;
				} else if (this.bufferStartPos >= this.targetPos && this.targetPos + (long) arg1 > this.bufferStartPos) {
					var5 = this.bufferStartPos;
				}
				long var7 = -1L;
				if ((long) arg1 + this.targetPos > this.bufferStartPos && (long) arg1 + this.targetPos <= (long) this.bufferPos + this.bufferStartPos) {
					var7 = (long) arg1 + this.targetPos;
				} else if ((long) this.bufferPos + this.bufferStartPos > this.targetPos && (long) this.bufferPos + this.bufferStartPos <= this.targetPos + (long) arg1) {
					var7 = this.bufferStartPos + (long) this.bufferPos;
				}
				if (var5 > -1L && var5 < var7) {
					int var9 = (int) (var7 - var5);
					ArrayUtil.copy(arg0, (int) (var5 + (long) arg2 - this.targetPos), this.buffer, (int) (var5 - this.bufferStartPos), var9);
				}
				this.targetPos += arg1;
			} else if (arg1 > 0) {
				if (this.writeBufferPos == -1L) {
					this.writeBufferPos = this.targetPos;
				}
				ArrayUtil.copy(arg0, arg2, this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), arg1);
				this.targetPos += arg1;
				if ((long) this.writeBufferSize < this.targetPos - this.writeBufferPos) {
					this.writeBufferSize = (int) (this.targetPos - this.writeBufferPos);
				}
			}
		} catch (IOException var11) {
			this.filePos = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("kj.a(I)V")
	public void flush() throws IOException {
		if (this.writeBufferPos == (long) -1) {
			return;
		}
		if (this.writeBufferPos != this.filePos) {
			this.file.seek(this.writeBufferPos);
			this.filePos = this.writeBufferPos;
		}
		this.file.write(0, this.writeBufferSize, this.writeBuffer);
		long var1 = -1L;
		this.filePos += this.writeBufferSize;
		if (this.bufferStartPos <= this.writeBufferPos && this.writeBufferPos < this.bufferStartPos + (long) this.bufferPos) {
			var1 = this.writeBufferPos;
		} else if (this.bufferStartPos >= this.writeBufferPos && this.bufferStartPos < (long) this.writeBufferSize + this.writeBufferPos) {
			var1 = this.bufferStartPos;
		}
		if (this.filePos > this.fileLength) {
			this.fileLength = this.filePos;
		}
		long var3 = -1L;
		if (this.bufferStartPos < this.writeBufferPos + (long) this.writeBufferSize && this.writeBufferPos + (long) this.writeBufferSize <= this.bufferStartPos - -((long) this.bufferPos)) {
			var3 = this.writeBufferPos + (long) this.writeBufferSize;
		} else if (this.writeBufferPos < this.bufferStartPos + (long) this.bufferPos && (long) this.bufferPos + this.bufferStartPos <= (long) this.writeBufferSize + this.writeBufferPos) {
			var3 = (long) this.bufferPos + this.bufferStartPos;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			ArrayUtil.copy(this.writeBuffer, (int) (var1 - this.writeBufferPos), this.buffer, (int) (var1 - this.bufferStartPos), var5);
		}
		this.writeBufferSize = 0;
		this.writeBufferPos = -1L;
	}

	@ObfuscatedName("kj.b(I)J")
	public long length() {
		return this.field2152;
	}

	@ObfuscatedName("kj.c(I)V")
	public void fillBuffer() throws IOException {
		this.bufferPos = 0;
		if (this.targetPos != this.filePos) {
			this.file.seek(this.targetPos);
			this.filePos = this.targetPos;
		}
		this.bufferStartPos = this.targetPos;
		while (this.bufferPos < this.buffer.length) {
			int var1 = this.buffer.length - this.bufferPos;
			if (var1 > 200000000) {
				var1 = 200000000;
			}
			int var2 = this.file.read(this.bufferPos, var1, this.buffer);
			if (var2 == -1) {
				break;
			}
			this.filePos += var2;
			this.bufferPos += var2;
		}
	}

	@ObfuscatedName("kj.a(I[B)V")
	public void read(byte[] arg0) throws IOException {
		this.read(arg0, 0, arg0.length);
	}

	@ObfuscatedName("kj.b(B)Ljava/io/File;")
	public File method813() {
		return this.file.method445();
	}

	@ObfuscatedName("kj.a([BBII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.writeBufferPos != -1L && this.targetPos >= this.writeBufferPos && (long) arg2 + this.targetPos <= this.writeBufferPos - -((long) this.writeBufferSize)) {
				ArrayUtil.copy(this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), arg0, 0, arg2);
				this.targetPos += arg2;
				return;
			}
			long var4 = this.targetPos;
			int var6 = arg2;
			if (this.targetPos >= this.bufferStartPos && this.bufferStartPos + (long) this.bufferPos > this.targetPos) {
				int var7 = (int) ((long) this.bufferPos + this.bufferStartPos - this.targetPos);
				if (var7 > arg2) {
					var7 = arg2;
				}
				arg2 -= var7;
				ArrayUtil.copy(this.buffer, (int) (this.targetPos - this.bufferStartPos), arg0, 0, var7);
				this.targetPos += var7;
				arg1 = var7;
			}
			if (arg2 > this.buffer.length) {
				this.file.seek(this.targetPos);
				this.filePos = this.targetPos;
				while (arg2 > 0) {
					int var9 = this.file.read(arg1, arg2, arg0);
					if (var9 == -1) {
						break;
					}
					arg1 += var9;
					this.targetPos += var9;
					arg2 -= var9;
					this.filePos += var9;
				}
			} else if (arg2 > 0) {
				this.fillBuffer();
				int var8 = arg2;
				if (arg2 > this.bufferPos) {
					var8 = this.bufferPos;
				}
				arg2 -= var8;
				ArrayUtil.copy(this.buffer, 0, arg0, arg1, var8);
				arg1 += var8;
				this.targetPos += var8;
			}
			if (this.writeBufferPos != -1L) {
				if (this.writeBufferPos > this.targetPos && arg2 > 0) {
					int var10 = (int) (this.writeBufferPos - this.targetPos) + arg1;
					if (arg2 + arg1 < var10) {
						var10 = arg2 + arg1;
					}
					while (var10 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.targetPos++;
					}
				}
				long var11 = -1L;
				if (this.writeBufferPos >= var4 && var4 + (long) var6 > this.writeBufferPos) {
					var11 = this.writeBufferPos;
				} else if (var4 >= this.writeBufferPos && var4 < this.writeBufferPos + (long) this.writeBufferSize) {
					var11 = var4;
				}
				long var13 = -1L;
				if (this.writeBufferPos + (long) this.writeBufferSize > var4 && this.writeBufferPos + (long) this.writeBufferSize <= (long) var6 + var4) {
					var13 = this.writeBufferPos + (long) this.writeBufferSize;
				} else if (var4 + (long) var6 > this.writeBufferPos && (long) var6 + var4 <= this.writeBufferPos + (long) this.writeBufferSize) {
					var13 = (long) var6 + var4;
				}
				if (var11 > -1L && var11 < var13) {
					int var15 = (int) (var13 - var11);
					ArrayUtil.copy(this.writeBuffer, (int) (var11 - this.writeBufferPos), arg0, (int) (var11 - var4), var15);
					if (this.targetPos < var13) {
						arg2 = (int) ((long) arg2 + this.targetPos - var13);
						this.targetPos = var13;
					}
				}
			}
		} catch (IOException var17) {
			this.filePos = -1L;
			throw var17;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("kj.d(I)V")
	public void close() throws IOException {
		this.flush();
		this.file.close();
	}

	@ObfuscatedName("kj.a(BJ)V")
	public void seek(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method813());
		}
		this.targetPos = arg0;
	}
}
