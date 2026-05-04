package jagex3.client;

import deob.ObfuscatedName;
import jagex3.io.Packet;
import jagex3.util.MonotonicTime;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ab")
public final class HTTPRequest {

	@ObfuscatedName("ab.d")
	public int field29;

	@ObfuscatedName("ab.h")
	public DataInputStream field33;

	@ObfuscatedName("ab.j")
	public byte[] field35;

	@ObfuscatedName("ab.k")
	public int field36;

	@ObfuscatedName("ab.l")
	public final long field37;

	@ObfuscatedName("ab.n")
	public final byte[] field39 = new byte[4];

	@ObfuscatedName("ab.p")
	public int field41;

	@ObfuscatedName("ab.r")
	public final PrivilegedRequest field43;

	public HTTPRequest(SignLink arg0, URL arg1) {
		this.field43 = arg0.method1293(arg1);
		this.field36 = 0;
		this.field37 = MonotonicTime.currentTime() + 30000L;
	}

	@ObfuscatedName("ab.a(Z)[B")
	public byte[] method12() throws IOException {
		if (this.field37 < MonotonicTime.currentTime()) {
			throw new IOException("fdt");
		}
		if (this.field36 == 0) {
			if (this.field43.status == 2) {
				throw new IOException("fds");
			}
			if (this.field43.status == 1) {
				this.field36 = 1;
				this.field33 = (DataInputStream) this.field43.field3129;
			}
		}
		if (this.field36 == 1) {
			int var1 = this.field33.available();
			if (var1 > 0) {
				if (var1 + this.field29 > 4) {
					var1 = 4 - this.field29;
				}
				this.field29 += this.field33.read(this.field39, this.field29, var1);
				if (this.field29 == 4) {
					int var2 = (new Packet(this.field39)).g4();
					this.field36 = 2;
					this.field35 = new byte[var2];
				}
			}
		}
		if (this.field36 == 2) {
			int var3 = this.field33.available();
			if (var3 > 0) {
				if (this.field35.length < this.field41 + var3) {
					var3 = this.field35.length - this.field41;
				}
				this.field41 += this.field33.read(this.field35, this.field41, var3);
				if (this.field41 == this.field35.length) {
					return this.field35;
				}
			}
		}
		return null;
	}
}
