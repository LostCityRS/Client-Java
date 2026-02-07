package jagex3.client;

import deob.ObfuscatedName;
import jagex3.client.applet.PrivilegedRequest;
import jagex3.client.applet.SignLink;
import jagex3.io.Packet;
import jagex3.util.MonotonicTime;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("bc")
public final class HTTPRequest {

	@ObfuscatedName("bc.a")
	public int field171;

	@ObfuscatedName("bc.b")
	public int field172;

	@ObfuscatedName("bc.g")
	public byte[] field177;

	@ObfuscatedName("bc.h")
	public DataInputStream field178;

	@ObfuscatedName("bc.j")
	public final byte[] field180 = new byte[4];

	@ObfuscatedName("bc.k")
	public int field181;

	@ObfuscatedName("bc.t")
	public final long field190;

	@ObfuscatedName("bc.v")
	public final PrivilegedRequest field192;

	public HTTPRequest(SignLink arg0, URL arg1) {
		this.field192 = arg0.urlreq(arg1);
		this.field181 = 0;
		this.field190 = MonotonicTime.currentTime() + 30000L;
	}

	@ObfuscatedName("bc.a(Z)[B")
	public byte[] method63() throws IOException {
		if (this.field190 < MonotonicTime.currentTime()) {
			throw new IOException("fdt");
		}
		if (this.field181 == 0) {
			if (this.field192.status == 2) {
				throw new IOException("fds");
			}
			if (this.field192.status == 1) {
				this.field181 = 1;
				this.field178 = (DataInputStream) this.field192.result;
			}
		}
		if (this.field181 == 1) {
			int var1 = this.field178.available();
			if (var1 > 0) {
				if (var1 + this.field172 > 4) {
					var1 = 4 - this.field172;
				}
				this.field172 += this.field178.read(this.field180, this.field172, var1);
				if (this.field172 == 4) {
					int var2 = (new Packet(this.field180)).g4();
					this.field177 = new byte[var2];
					this.field181 = 2;
				}
			}
		}
		if (this.field181 == 2) {
			int var3 = this.field178.available();
			if (var3 > 0) {
				if (this.field177.length < this.field171 + var3) {
					var3 = this.field177.length - this.field171;
				}
				this.field171 += this.field178.read(this.field177, this.field171, var3);
				if (this.field177.length == this.field171) {
					return this.field177;
				}
			}
		}
		return null;
	}
}
