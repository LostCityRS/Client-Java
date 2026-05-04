package jagex3.io;

import deob.ObfuscatedName;

import java.util.zip.Inflater;

@ObfuscatedName("fc")
public final class GZip {

	@ObfuscatedName("fc.g")
	public Inflater field1112;

	public GZip() {
		this(-1, 1000000, 1000000);
	}

	public GZip(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("fc.a(Lea;Z[B)V")
	public void method424(Packet arg0, byte[] arg1) {
		if (arg0.data[arg0.pos] != 31 || arg0.data[arg0.pos + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.field1112 == null) {
			this.field1112 = new Inflater(true);
		}
		try {
			this.field1112.setInput(arg0.data, arg0.pos + 10, arg0.data.length - arg0.pos - 18);
			this.field1112.inflate(arg1);
		} catch (Exception var3) {
			this.field1112.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.field1112.reset();
	}
}
