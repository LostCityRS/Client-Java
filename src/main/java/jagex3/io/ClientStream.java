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
	public PrivilegedRequest writer;

	@ObfuscatedName("mf.f")
	public final SignLink signlink;

	@ObfuscatedName("mf.h")
	public boolean dummy = false;

	@ObfuscatedName("mf.i")
	public final OutputStream out;

	@ObfuscatedName("mf.k")
	public int tcyl = 0;

	@ObfuscatedName("mf.l")
	public final InputStream in;

	@ObfuscatedName("mf.r")
	public int tnum = 0;

	@ObfuscatedName("mf.s")
	public boolean ioerror = false;

	@ObfuscatedName("mf.t")
	public byte[] buf;

	@ObfuscatedName("mf.u")
	public final Socket socket;

	public ClientStream(Socket arg0, SignLink arg1) throws IOException {
		this.signlink = arg1;
		this.socket = arg0;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@ObfuscatedName("mf.b(I)I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("mf.a(II[BI)V")
	public void write(int arg0, byte[] arg1) throws IOException {
		if (this.dummy) {
			return;
		}
		if (this.ioerror) {
			this.ioerror = false;
			throw new IOException();
		}
		if (this.buf == null) {
			this.buf = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg0; var4++) {
				this.buf[this.tnum] = arg1[var4];
				this.tnum = (this.tnum + 1) % 5000;
				if (this.tnum == (this.tcyl + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.writer == null) {
				this.writer = this.signlink.threadreq(this, 3);
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
						if (this.tcyl == this.tnum) {
							if (this.dummy) {
								break label77;
							}
							try {
								this.wait();
							} catch (InterruptedException var8) {
							}
						}
						var2 = this.tcyl;
						if (this.tcyl <= this.tnum) {
							var3 = this.tnum - this.tcyl;
						} else {
							var3 = 5000 - this.tcyl;
						}
					}
					if (var3 <= 0) {
						continue;
					}
					try {
						this.out.write(this.buf, var2, var3);
					} catch (IOException var7) {
						this.ioerror = true;
					}
					this.tcyl = (var3 + this.tcyl) % 5000;
					try {
						if (this.tnum == this.tcyl) {
							this.out.flush();
						}
					} catch (IOException var6) {
						this.ioerror = true;
					}
					continue;
				}
				try {
					if (this.in != null) {
						this.in.close();
					}
					if (this.out != null) {
						this.out.close();
					}
					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var5) {
				}
				this.buf = null;
				return;
			}
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("mf.a(I[BBI)V")
	public void read(int arg0, byte[] arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg1, arg0, arg2);
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
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("mf.a(Z)V")
	public void close() {
		if (this.dummy) {
			return;
		}
		synchronized (this) {
			this.dummy = true;
			this.notifyAll();
		}
		if (this.writer != null) {
			while (this.writer.status == 0) {
				ThreadSleep.sleepPrecise(1L);
			}
			if (this.writer.status == 1) {
				try {
					((Thread) this.writer.field3129).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.writer = null;
	}
}
