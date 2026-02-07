package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("lb")
public final class FileOnDisk {

	@ObfuscatedName("lb.a")
	public final File underlyingFile;

	@ObfuscatedName("lb.b")
	public RandomAccessFile file;

	@ObfuscatedName("lb.c")
	public long pos;

	@ObfuscatedName("lb.d")
	public final long maxLength;

	public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.file = new RandomAccessFile(arg0, arg1);
		this.pos = 0L;
		this.underlyingFile = arg0;
		this.maxLength = arg2;
		int var5 = this.file.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}
		this.file.seek(0L);
	}

	@ObfuscatedName("lb.a(I)Ljava/io/File;")
	public File getFile() {
		return this.underlyingFile;
	}

	@Override
	public void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("Warning! fileondisk " + this.underlyingFile + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@ObfuscatedName("lb.a(BJ)V")
	public void seek(long arg0) throws IOException {
		this.file.seek(arg0);
		this.pos = arg0;
	}

	@ObfuscatedName("lb.a(I[BII)I")
	public int read(int arg0, byte[] arg1, int arg2) throws IOException {
		int var4 = this.file.read(arg1, arg0, arg2);
		if (var4 > 0) {
			this.pos += var4;
		}
		return var4;
	}

	@ObfuscatedName("lb.b(I)J")
	public long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("lb.a([BIII)V")
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

	@ObfuscatedName("lb.c(I)V")
	public void close() throws IOException {
		if (this.file != null) {
			this.file.close();
			this.file = null;
		}
	}
}
