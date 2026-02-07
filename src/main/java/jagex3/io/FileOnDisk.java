package jagex3.io;

import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("lb")
public final class FileOnDisk {

	@ObfuscatedName("lb.a")
	public final File field1820;

	@ObfuscatedName("lb.b")
	public RandomAccessFile field1821;

	@ObfuscatedName("lb.c")
	public long field1822;

	@ObfuscatedName("lb.d")
	public final long field1823;

	public FileOnDisk(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.field1821 = new RandomAccessFile(arg0, arg1);
		this.field1822 = 0L;
		this.field1820 = arg0;
		this.field1823 = arg2;
		int var5 = this.field1821.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.field1821.seek(0L);
			this.field1821.write(var5);
		}
		this.field1821.seek(0L);
	}

	@ObfuscatedName("lb.a(I)Ljava/io/File;")
	public File method619() {
		return this.field1820;
	}

	@Override
	public void finalize() throws Throwable {
		if (this.field1821 != null) {
			System.out.println("Warning! fileondisk " + this.field1820 + " not closed correctly using close(). Auto-closing instead. ");
			this.method624();
		}
	}

	@ObfuscatedName("lb.a(BJ)V")
	public void method620(long arg0) throws IOException {
		this.field1821.seek(arg0);
		this.field1822 = arg0;
	}

	@ObfuscatedName("lb.a(I[BII)I")
	public int method621(int arg0, byte[] arg1, int arg2) throws IOException {
		int var4 = this.field1821.read(arg1, arg0, arg2);
		if (var4 > 0) {
			this.field1822 += var4;
		}
		return var4;
	}

	@ObfuscatedName("lb.b(I)J")
	public long method622() throws IOException {
		return this.field1821.length();
	}

	@ObfuscatedName("lb.a([BIII)V")
	public void method623(byte[] arg0, int arg1, int arg2) throws IOException {
		if ((long) arg2 + this.field1822 > this.field1823) {
			this.field1821.seek(this.field1823 + 1L);
			this.field1821.write(1);
			throw new EOFException();
		} else {
			this.field1821.write(arg0, arg1, arg2);
			this.field1822 += arg2;
		}
	}

	@ObfuscatedName("lb.c(I)V")
	public void method624() throws IOException {
		if (this.field1821 != null) {
			this.field1821.close();
			this.field1821 = null;
		}
	}
}
