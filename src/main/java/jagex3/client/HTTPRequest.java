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
	public int read2;

	@ObfuscatedName("bc.b")
	public int read1;

	@ObfuscatedName("bc.g")
	public byte[] data;

	@ObfuscatedName("bc.h")
	public DataInputStream stream;

	@ObfuscatedName("bc.j")
	public final byte[] field180 = new byte[4];

	@ObfuscatedName("bc.k")
	public int stage;

	@ObfuscatedName("bc.t")
	public final long timeout;

	@ObfuscatedName("bc.v")
	public final PrivilegedRequest req;

	public HTTPRequest(SignLink arg0, URL arg1) {
		this.req = arg0.urlreq(arg1);
		this.stage = 0;
		this.timeout = MonotonicTime.currentTime() + 30000L;
	}

	@ObfuscatedName("bc.a(Z)[B")
	public byte[] getData() throws IOException {
		if (this.timeout < MonotonicTime.currentTime()) {
			throw new IOException("fdt");
		}
		if (this.stage == 0) {
			if (this.req.status == 2) {
				throw new IOException("fds");
			}
			if (this.req.status == 1) {
				this.stage = 1;
				this.stream = (DataInputStream) this.req.result;
			}
		}
		if (this.stage == 1) {
			int var1 = this.stream.available();
			if (var1 > 0) {
				if (var1 + this.read1 > 4) {
					var1 = 4 - this.read1;
				}
				this.read1 += this.stream.read(this.field180, this.read1, var1);
				if (this.read1 == 4) {
					int var2 = (new Packet(this.field180)).g4();
					this.data = new byte[var2];
					this.stage = 2;
				}
			}
		}
		if (this.stage == 2) {
			int var3 = this.stream.available();
			if (var3 > 0) {
				if (this.data.length < this.read2 + var3) {
					var3 = this.data.length - this.read2;
				}
				this.read2 += this.stream.read(this.data, this.read2, var3);
				if (this.data.length == this.read2) {
					return this.data;
				}
			}
		}
		return null;
	}
}
