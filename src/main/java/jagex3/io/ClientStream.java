package jagex3.io;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.applet.PrivilegedRequest;
import jagex3.client.applet.SignLink;
import jagex3.util.ThreadSleep;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("b")
public final class ClientStream implements Runnable {

	@ObfuscatedName("b.c")
	public boolean field134 = false;

	@ObfuscatedName("b.e")
	public boolean field136 = false;

	@ObfuscatedName("b.f")
	public final Socket field137;

	@ObfuscatedName("b.h")
	public byte[] field139;

	@ObfuscatedName("b.i")
	public final SignLink field140;

	@ObfuscatedName("b.n")
	public final OutputStream field145;

	@ObfuscatedName("b.p")
	public final InputStream field147;

	@ObfuscatedName("b.q")
	public PrivilegedRequest field148;

	@ObfuscatedName("b.u")
	public int field152 = 0;

	@ObfuscatedName("b.z")
	public int field157 = 0;

	public ClientStream(Socket arg0, SignLink arg1) throws IOException {
		this.field140 = arg1;
		this.field137 = arg0;
		this.field137.setSoTimeout(30000);
		this.field137.setTcpNoDelay(true);
		this.field147 = this.field137.getInputStream();
		this.field145 = this.field137.getOutputStream();
	}

	@ObfuscatedName("b.b(I)I")
	public int read() throws IOException {
		return this.field136 ? 0 : this.field147.read();
	}

	@ObfuscatedName("b.a([BIIB)V")
	public void write(byte[] arg0, int arg1) throws IOException {
		if (this.field136) {
			return;
		}
		if (this.field134) {
			this.field134 = false;
			throw new IOException();
		}
		if (this.field139 == null) {
			this.field139 = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg1; var4++) {
				this.field139[this.field152] = arg0[var4];
				this.field152 = (this.field152 + 1) % 5000;
				if (this.field152 == (this.field157 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.field148 == null) {
				this.field148 = this.field140.threadreq(3, this, 106);
			}
			this.notifyAll();
		}
	}

	@ObfuscatedName("b.a(II[BI)V")
	public void read(int arg0, byte[] arg1, int arg2) throws IOException {
		if (this.field136) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field147.read(arg1, arg0, arg2);
			if (var4 <= 0) {
				throw new EOFException();
			}
			arg2 -= var4;
			arg0 += var4;
		}
	}

	@Override
	public void finalize() {
		this.close();
	}

	@ObfuscatedName("b.c(B)I")
	public int available() throws IOException {
		return this.field136 ? 0 : this.field147.available();
	}

	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					int var2;
					int var3;
					synchronized (this) {
						if (this.field152 == this.field157) {
							if (this.field136) {
								break label80;
							}
							try {
								this.wait();
							} catch (InterruptedException var8) {
							}
						}
						if (this.field152 < this.field157) {
							var2 = 5000 - this.field157;
						} else {
							var2 = this.field152 - this.field157;
						}
						var3 = this.field157;
					}
					if (var2 <= 0) {
						continue;
					}
					try {
						this.field145.write(this.field139, var3, var2);
					} catch (IOException var7) {
						this.field134 = true;
					}
					this.field157 = (var2 + this.field157) % 5000;
					try {
						if (this.field157 == this.field152) {
							this.field145.flush();
						}
					} catch (IOException var6) {
						this.field134 = true;
					}
					continue;
				}
				try {
					if (this.field147 != null) {
						this.field147.close();
					}
					if (this.field145 != null) {
						this.field145.close();
					}
					if (this.field137 != null) {
						this.field137.close();
					}
				} catch (IOException var5) {
				}
				this.field139 = null;
				break;
			}
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("b.c(I)V")
	public void close() {
		if (this.field136) {
			return;
		}
		synchronized (this) {
			this.field136 = true;
			this.notifyAll();
		}
		if (this.field148 != null) {
			while (this.field148.status == 0) {
				ThreadSleep.sleepPrecise(1L);
			}
			if (this.field148.status == 1) {
				try {
					((Thread) this.field148.result).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.field148 = null;
	}
}
