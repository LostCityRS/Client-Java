package jagex3.io;

import deob.ObfuscatedName;
import jagex3.util.ArrayUtil;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("wb")
public final class BufferedRandomAccessFile {

	@ObfuscatedName("wb.e")
	public long targetPos;

	@ObfuscatedName("wb.j")
	public final byte[] buffer;

	@ObfuscatedName("wb.p")
	public int bufferPos;

	@ObfuscatedName("wb.s")
	public final byte[] writeBuffer;

	@ObfuscatedName("wb.t")
	public long writeBufferPos = -1L;

	@ObfuscatedName("wb.v")
	public int writeBufferSize = 0;

	@ObfuscatedName("wb.w")
	public long bufferStartPos = -1L;

	@ObfuscatedName("wb.D")
	public final FileOnDisk file;

	@ObfuscatedName("wb.E")
	public long fileLength;

	@ObfuscatedName("wb.C")
	public long field3269;

	@ObfuscatedName("wb.A")
	public long filePos;

	@ObfuscatedName("wb.a(IJ)V")
	public void seek(long arg0) {
		if (arg0 >= 0L) {
			this.targetPos = arg0;
		}
	}

	@ObfuscatedName("wb.a(I)J")
	public long length() {
		return this.field3269;
	}

	@ObfuscatedName("wb.a(III[B)V")
	public void write(int arg0, int arg1, byte[] arg2) throws IOException {
		try {
			if ((long) arg1 + this.targetPos > this.field3269) {
				this.field3269 = (long) arg1 + this.targetPos;
			}
			if (this.writeBufferPos != -1L && (this.targetPos < this.writeBufferPos || this.targetPos > (long) this.writeBufferSize + this.writeBufferPos)) {
				this.flush();
			}
			if (this.writeBufferPos != -1L && (long) arg1 + this.targetPos > (long) this.writeBuffer.length + this.writeBufferPos) {
				int var4 = (int) (this.writeBufferPos + (long) this.writeBuffer.length - this.targetPos);
				arg1 -= var4;
				ArrayUtil.copy(arg2, arg0, this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), var4);
				this.targetPos += var4;
				this.writeBufferSize = this.writeBuffer.length;
				arg0 += var4;
				this.flush();
			}
			if (this.writeBuffer.length < arg1) {
				if (this.filePos != this.targetPos) {
					this.file.seek(this.targetPos);
					this.filePos = this.targetPos;
				}
				this.file.write(arg2, arg0, arg1);
				this.filePos += arg1;
				if (this.filePos > this.fileLength) {
					this.fileLength = this.filePos;
				}
				long var5 = -1L;
				long var7 = -1L;
				if (this.targetPos >= this.bufferStartPos && this.targetPos < (long) this.bufferPos + this.bufferStartPos) {
					var7 = this.targetPos;
				} else if (this.bufferStartPos >= this.targetPos && this.bufferStartPos < this.targetPos + (long) arg1) {
					var7 = this.bufferStartPos;
				}
				if (this.bufferStartPos < this.targetPos + (long) arg1 && (long) arg1 + this.targetPos <= this.bufferStartPos - -((long) this.bufferPos)) {
					var5 = (long) arg1 + this.targetPos;
				} else if ((long) this.bufferPos + this.bufferStartPos > this.targetPos && (long) this.bufferPos + this.bufferStartPos <= (long) arg1 + this.targetPos) {
					var5 = (long) this.bufferPos + this.bufferStartPos;
				}
				if (var7 > -1L && var5 > var7) {
					int var9 = (int) (var5 - var7);
					ArrayUtil.copy(arg2, (int) (var7 + (long) arg0 - this.targetPos), this.buffer, (int) (var7 - this.bufferStartPos), var9);
				}
				this.targetPos += arg1;
			} else if (arg1 > 0) {
				if (this.writeBufferPos == -1L) {
					this.writeBufferPos = this.targetPos;
				}
				ArrayUtil.copy(arg2, arg0, this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), arg1);
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

	@ObfuscatedName("wb.a(IBI[B)V")
	public void read(int arg0, int arg1, byte[] arg2) throws IOException {
		try {
			if (arg1 > arg2.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.writeBufferPos != -1L && this.targetPos >= this.writeBufferPos && (long) arg1 + this.targetPos <= (long) this.writeBufferSize + this.writeBufferPos) {
				ArrayUtil.copy(this.writeBuffer, (int) (this.targetPos - this.writeBufferPos), arg2, 0, arg1);
				this.targetPos += arg1;
				return;
			}
			int var4 = arg1;
			long var5 = this.targetPos;
			if (this.bufferStartPos <= this.targetPos && (long) this.bufferPos + this.bufferStartPos > this.targetPos) {
				int var7 = (int) (this.bufferStartPos + (long) this.bufferPos - this.targetPos);
				if (var7 > arg1) {
					var7 = arg1;
				}
				ArrayUtil.copy(this.buffer, (int) (this.targetPos - this.bufferStartPos), arg2, 0, var7);
				arg0 = var7;
				this.targetPos += var7;
				arg1 -= var7;
			}
			if (arg1 > this.buffer.length) {
				this.file.seek(this.targetPos);
				this.filePos = this.targetPos;
				while (arg1 > 0) {
					int var9 = this.file.read(arg0, arg1, arg2);
					if (var9 == -1) {
						break;
					}
					this.targetPos += var9;
					this.filePos += var9;
					arg0 += var9;
					arg1 -= var9;
				}
			} else if (arg1 > 0) {
				int var8 = arg1;
				this.fillBuffer();
				if (arg1 > this.bufferPos) {
					var8 = this.bufferPos;
				}
				ArrayUtil.copy(this.buffer, 0, arg2, arg0, var8);
				this.targetPos += var8;
				arg0 += var8;
				arg1 -= var8;
			}
			if (this.writeBufferPos != -1L) {
				if (this.targetPos < this.writeBufferPos && arg1 > 0) {
					int var10 = (int) (this.writeBufferPos - this.targetPos) + arg0;
					if (var10 > arg0 + arg1) {
						var10 = arg0 + arg1;
					}
					while (arg0 < var10) {
						arg1--;
						arg2[arg0++] = 0;
						this.targetPos++;
					}
				}
				long var11 = -1L;
				if (this.writeBufferPos + (long) this.writeBufferSize > var5 && (long) var4 + var5 >= (long) this.writeBufferSize + this.writeBufferPos) {
					var11 = (long) this.writeBufferSize + this.writeBufferPos;
				} else if (var5 + (long) var4 > this.writeBufferPos && (long) this.writeBufferSize + this.writeBufferPos >= var5 - -((long) var4)) {
					var11 = (long) var4 + var5;
				}
				long var13 = -1L;
				if (var5 <= this.writeBufferPos && (long) var4 + var5 > this.writeBufferPos) {
					var13 = this.writeBufferPos;
				} else if (this.writeBufferPos <= var5 && this.writeBufferPos + (long) this.writeBufferSize > var5) {
					var13 = var5;
				}
				if (var13 > -1L && var13 < var11) {
					int var15 = (int) (var11 - var13);
					ArrayUtil.copy(this.writeBuffer, (int) (var13 - this.writeBufferPos), arg2, (int) (var13 - var5), var15);
					if (this.targetPos < var11) {
						arg1 = (int) ((long) arg1 + this.targetPos - var11);
						this.targetPos = var11;
					}
				}
			}
		} catch (IOException var17) {
			this.filePos = -1L;
			throw var17;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("wb.b(I)V")
	public void close() throws IOException {
		this.flush();
		this.file.close();
	}

	@ObfuscatedName("wb.a(B)V")
	public void fillBuffer() throws IOException {
		this.bufferPos = 0;
		if (this.filePos != this.targetPos) {
			this.file.seek(this.targetPos);
			this.filePos = this.targetPos;
		}
		this.bufferStartPos = this.targetPos;
		while (this.buffer.length > this.bufferPos) {
			int var1 = this.file.read(this.bufferPos, this.buffer.length - this.bufferPos, this.buffer);
			if (var1 == -1) {
				break;
			}
			this.filePos += var1;
			this.bufferPos += var1;
		}
	}

	public BufferedRandomAccessFile(FileOnDisk arg0, int arg1, int arg2) throws IOException {
		this.file = arg0;
		this.field3269 = this.fileLength = arg0.length();
		this.writeBuffer = new byte[0];
		this.buffer = new byte[arg1];
		this.targetPos = 0L;
	}

	@ObfuscatedName("wb.c(I)V")
	public void flush() throws IOException {
		if (this.writeBufferPos == -1L) {
			return;
		}
		if (this.filePos != this.writeBufferPos) {
			this.file.seek(this.writeBufferPos);
			this.filePos = this.writeBufferPos;
		}
		this.file.write(this.writeBuffer, 0, this.writeBufferSize);
		this.filePos += this.writeBufferSize;
		if (this.fileLength < this.filePos) {
			this.fileLength = this.filePos;
		}
		long var1 = -1L;
		if (this.bufferStartPos <= this.writeBufferPos && this.writeBufferPos < this.bufferStartPos + (long) this.bufferPos) {
			var1 = this.writeBufferPos;
		} else if (this.writeBufferPos <= this.bufferStartPos && (long) this.writeBufferSize + this.writeBufferPos > this.bufferStartPos) {
			var1 = this.bufferStartPos;
		}
		long var3 = -1L;
		if ((long) this.writeBufferSize + this.writeBufferPos > this.bufferStartPos && (long) this.bufferPos + this.bufferStartPos >= this.writeBufferPos - -((long) this.writeBufferSize)) {
			var3 = (long) this.writeBufferSize + this.writeBufferPos;
		} else if ((long) this.bufferPos + this.bufferStartPos > this.writeBufferPos && (long) this.writeBufferSize + this.writeBufferPos >= this.bufferStartPos - -((long) this.bufferPos)) {
			var3 = (long) this.bufferPos + this.bufferStartPos;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			ArrayUtil.copy(this.writeBuffer, (int) (var1 - this.writeBufferPos), this.buffer, (int) (var1 - this.bufferStartPos), var5);
		}
		this.writeBufferSize = 0;
		this.writeBufferPos = -1L;
	}
}
