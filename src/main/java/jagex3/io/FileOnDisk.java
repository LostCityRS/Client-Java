package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("q")
public final class FileOnDisk {

	@ObfuscatedName("q.a")
	public long pos;

	@ObfuscatedName("q.b")
	public final long maxLength;

	@ObfuscatedName("q.c")
	public RandomAccessFile file;

	@ObfuscatedName("q.d")
	public final File underlyingFile;

	@ObfuscatedName("q.a(Z)Ljava/io/File;")
	public File getFile() {
		return this.underlyingFile;
	}

	@ObfuscatedName("q.a(ZJ)V")
	public void seek(long arg0) throws IOException {
		this.file.seek(arg0);
		this.pos = arg0;
	}

	@ObfuscatedName("q.a(I)V")
	public void close() throws IOException {
		this.file.close();
		this.file = null;
	}

	public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.file = new RandomAccessFile(arg0, arg1);
		this.maxLength = arg2;
		this.underlyingFile = arg0;
		this.pos = 0L;
	}

	@ObfuscatedName("q.a([BIIZ)V")
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		if ((long) arg2 + this.pos > this.maxLength) {
			this.file.seek(this.maxLength + 1L);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(arg0, arg1, arg2);
			this.pos += arg2;
		}
	}

	@ObfuscatedName("q.b(I)J")
	public long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("q.a(II[BI)I")
	public int read(int arg0, int arg1, byte[] arg2) throws IOException {
		int var4 = this.file.read(arg2, arg0, arg1);
		if (var4 > 0) {
			this.pos += var4;
		}
		return var4;
	}
}
