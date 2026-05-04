package jagex3.io;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.PrivilegedRequest;
import jagex3.client.SignLink;
import jagex3.util.ThreadSleep;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("mf")
public final class ClientStream implements Runnable {

	@ObfuscatedName("mf.b")
	public PrivilegedRequest field2534;

	@ObfuscatedName("mf.f")
	public final SignLink field2538;

	@ObfuscatedName("mf.h")
	public boolean field2540 = false;

	@ObfuscatedName("mf.i")
	public final OutputStream field2541;

	@ObfuscatedName("mf.k")
	public int field2543 = 0;

	@ObfuscatedName("mf.l")
	public final InputStream field2544;

	@ObfuscatedName("mf.r")
	public int field2550 = 0;

	@ObfuscatedName("mf.s")
	public boolean field2551 = false;

	@ObfuscatedName("mf.t")
	public byte[] field2552;

	@ObfuscatedName("mf.u")
	public final Socket field2553;

	public ClientStream(Socket arg0, SignLink arg1) throws IOException {
		this.field2538 = arg1;
		this.field2553 = arg0;
		this.field2553.setSoTimeout(30000);
		this.field2553.setTcpNoDelay(true);
		this.field2544 = this.field2553.getInputStream();
		this.field2541 = this.field2553.getOutputStream();
	}

	@ObfuscatedName("mf.b(I)I")
	public int available() throws IOException {
		return this.field2540 ? 0 : this.field2544.available();
	}

	@ObfuscatedName("mf.a(II[BI)V")
	public void write(int arg0, byte[] arg1) throws IOException {
		if (this.field2540) {
			return;
		}
		if (this.field2551) {
			this.field2551 = false;
			throw new IOException();
		}
		if (this.field2552 == null) {
			this.field2552 = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg0; var4++) {
				this.field2552[this.field2550] = arg1[var4];
				this.field2550 = (this.field2550 + 1) % 5000;
				if (this.field2550 == (this.field2543 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.field2534 == null) {
				this.field2534 = this.field2538.threadreq(this, 3);
			}
			this.notifyAll();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					int var2;
					int var3;
					synchronized (this) {
						if (this.field2543 == this.field2550) {
							if (this.field2540) {
								break label77;
							}
							try {
								this.wait();
							} catch (InterruptedException var8) {
							}
						}
						var2 = this.field2543;
						if (this.field2543 <= this.field2550) {
							var3 = this.field2550 - this.field2543;
						} else {
							var3 = 5000 - this.field2543;
						}
					}
					if (var3 <= 0) {
						continue;
					}
					try {
						this.field2541.write(this.field2552, var2, var3);
					} catch (IOException var7) {
						this.field2551 = true;
					}
					this.field2543 = (var3 + this.field2543) % 5000;
					try {
						if (this.field2550 == this.field2543) {
							this.field2541.flush();
						}
					} catch (IOException var6) {
						this.field2551 = true;
					}
					continue;
				}
				try {
					if (this.field2544 != null) {
						this.field2544.close();
					}
					if (this.field2541 != null) {
						this.field2541.close();
					}
					if (this.field2553 != null) {
						this.field2553.close();
					}
				} catch (IOException var5) {
				}
				this.field2552 = null;
				return;
			}
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("mf.a(I[BBI)V")
	public void read(int arg0, byte[] arg1, int arg2) throws IOException {
		if (this.field2540) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field2544.read(arg1, arg0, arg2);
			if (var4 <= 0) {
				throw new EOFException();
			}
			arg0 += var4;
			arg2 -= var4;
		}
	}

	@Override
	public void finalize() {
		this.close();
	}

	@ObfuscatedName("mf.c(I)I")
	public int read() throws IOException {
		return this.field2540 ? 0 : this.field2544.read();
	}

	@ObfuscatedName("mf.a(Z)V")
	public void close() {
		if (this.field2540) {
			return;
		}
		synchronized (this) {
			this.field2540 = true;
			this.notifyAll();
		}
		if (this.field2534 != null) {
			while (this.field2534.status == 0) {
				ThreadSleep.sleepPrecise(1L);
			}
			if (this.field2534.status == 1) {
				try {
					((Thread) this.field2534.field3129).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.field2534 = null;
	}
}
