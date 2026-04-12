package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("q")
public final class class96 {

	@ObfuscatedName("q.a")
	public long field2385;

	@ObfuscatedName("q.b")
	public final long field2386;

	@ObfuscatedName("q.c")
	public RandomAccessFile field2387;

	@ObfuscatedName("q.d")
	public final File field2388;

	@ObfuscatedName("q.a(Z)Ljava/io/File;")
	public File method829() {
		return this.field2388;
	}

	@ObfuscatedName("q.a(ZJ)V")
	public void method830(long arg0) throws IOException {
		this.field2387.seek(arg0);
		this.field2385 = arg0;
	}

	@ObfuscatedName("q.a(I)V")
	public void method831() throws IOException {
		this.field2387.close();
		this.field2387 = null;
	}

	public class96(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg2 <= arg0.length()) {
			arg0.delete();
		}
		this.field2387 = new RandomAccessFile(arg0, arg1);
		this.field2386 = arg2;
		this.field2388 = arg0;
		this.field2385 = 0L;
	}

	@ObfuscatedName("q.a([BIIZ)V")
	public void method832(byte[] arg0, int arg1, int arg2) throws IOException {
		if ((long) arg2 + this.field2385 > this.field2386) {
			this.field2387.seek(this.field2386 + 1L);
			this.field2387.write(1);
			throw new EOFException();
		} else {
			this.field2387.write(arg0, arg1, arg2);
			this.field2385 += arg2;
		}
	}

	@ObfuscatedName("q.b(I)J")
	public long method833() throws IOException {
		return this.field2387.length();
	}

	@ObfuscatedName("q.a(II[BI)I")
	public int method834(int arg0, int arg1, byte[] arg2) throws IOException {
		int var4 = this.field2387.read(arg2, arg0, arg1);
		if (var4 > 0) {
			this.field2385 += var4;
		}
		return var4;
	}
}
