package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fg")
public final class FileOnDisk {

	@ObfuscatedName("va.m")
	public static final byte[] field4303 = new byte[520];
	@ObfuscatedName("fg.a")
	public final File field1153;

	@ObfuscatedName("fg.b")
	public RandomAccessFile file;

	@ObfuscatedName("fg.c")
	public long pos;

	@ObfuscatedName("fg.d")
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
		this.maxLength = arg2;
		this.field1153 = arg0;
		int var5 = this.file.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.file.seek(0L);
			this.file.write(var5);
		}
		this.file.seek(0L);
	}

	@ObfuscatedName("fg.a(IBI[B)V")
	public void write(int arg0, int arg1, byte[] arg2) throws IOException {
		if (this.maxLength < (long) arg1 + this.pos) {
			this.file.seek(this.maxLength + 1L);
			this.file.write(1);
			throw new EOFException();
		} else {
			this.file.write(arg2, arg0, arg1);
			this.pos += arg1;
		}
	}

	@ObfuscatedName("fg.a(IJ)V")
	public void seek(long arg0) throws IOException {
		this.file.seek(arg0);
		this.pos = arg0;
	}

	@ObfuscatedName("fg.a(B)Ljava/io/File;")
	public File method445() {
		return this.field1153;
	}

	@Override
	public void finalize() throws Throwable {
		if (this.file != null) {
			System.out.println("Warning! fileondisk " + this.field1153 + " not closed correctly using close(). Auto-closing instead. ");
			this.close();
		}
	}

	@ObfuscatedName("fg.a(I)V")
	public void close() throws IOException {
		if (this.file != null) {
			this.file.close();
			this.file = null;
		}
	}

	@ObfuscatedName("fg.b(B)J")
	public long length() throws IOException {
		return this.file.length();
	}

	@ObfuscatedName("fg.a(BII[B)I")
	public int read(int arg0, int arg1, byte[] arg2) throws IOException {
		int var4 = this.file.read(arg2, arg0, arg1);
		if (var4 > 0) {
			this.pos += var4;
		}
		return var4;
	}
}
