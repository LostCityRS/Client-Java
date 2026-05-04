package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("fg")
public final class class63 {

	@ObfuscatedName("fg.a")
	public final File field1153;

	@ObfuscatedName("fg.b")
	public RandomAccessFile field1154;

	@ObfuscatedName("fg.c")
	public long field1155;

	@ObfuscatedName("fg.d")
	public final long field1156;

	public class63(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.field1154 = new RandomAccessFile(arg0, arg1);
		this.field1155 = 0L;
		this.field1156 = arg2;
		this.field1153 = arg0;
		int var5 = this.field1154.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.field1154.seek(0L);
			this.field1154.write(var5);
		}
		this.field1154.seek(0L);
	}

	@ObfuscatedName("fg.a(IBI[B)V")
	public void method443(int arg0, int arg1, byte[] arg2) throws IOException {
		if (this.field1156 < (long) arg1 + this.field1155) {
			this.field1154.seek(this.field1156 + 1L);
			this.field1154.write(1);
			throw new EOFException();
		} else {
			this.field1154.write(arg2, arg0, arg1);
			this.field1155 += arg1;
		}
	}

	@ObfuscatedName("fg.a(IJ)V")
	public void method444(long arg0) throws IOException {
		this.field1154.seek(arg0);
		this.field1155 = arg0;
	}

	@ObfuscatedName("fg.a(B)Ljava/io/File;")
	public File method445() {
		return this.field1153;
	}

	@Override
	public void finalize() throws Throwable {
		if (this.field1154 != null) {
			System.out.println("Warning! fileondisk " + this.field1153 + " not closed correctly using close(). Auto-closing instead. ");
			this.method446(0);
		}
	}

	@ObfuscatedName("fg.a(I)V")
	public void method446(int arg0) throws IOException {
		if (this.field1154 != null) {
			this.field1154.close();
			this.field1154 = null;
		}
	}

	@ObfuscatedName("fg.b(B)J")
	public long method447() throws IOException {
		return this.field1154.length();
	}

	@ObfuscatedName("fg.a(BII[B)I")
	public int method448(int arg0, int arg1, byte[] arg2) throws IOException {
		int var4 = this.field1154.read(arg2, arg0, arg1);
		if (var4 > 0) {
			this.field1155 += var4;
		}
		return var4;
	}
}
