package jagex3.io;

import deob.ObfuscatedName;

import java.util.zip.Inflater;

@ObfuscatedName("aa")
public final class GZip {

	@ObfuscatedName("aa.a")
	public Inflater inflater;

	public GZip() {
		this(-1, 1000000, 1000000);
	}

	public GZip(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("aa.a([BBLjd;)V")
	public void decompress(byte[] arg0, Packet arg1) {
		if (arg1.data[arg1.pos] != 31 || arg1.data[arg1.pos + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.inflater == null) {
			this.inflater = new Inflater(true);
		}
		try {
			this.inflater.setInput(arg1.data, arg1.pos + 10, arg1.data.length + -8 + -arg1.pos + -10);
			this.inflater.inflate(arg0);
		} catch (Exception var3) {
			this.inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.inflater.reset();
	}
}
