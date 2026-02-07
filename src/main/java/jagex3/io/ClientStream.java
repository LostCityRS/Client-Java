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
	public boolean ioerror = false;

	@ObfuscatedName("b.e")
	public boolean dummy = false;

	@ObfuscatedName("b.f")
	public final Socket socket;

	@ObfuscatedName("b.h")
	public byte[] buf;

	@ObfuscatedName("b.i")
	public final SignLink signlink;

	@ObfuscatedName("b.n")
	public final OutputStream out;

	@ObfuscatedName("b.p")
	public final InputStream in;

	@ObfuscatedName("b.q")
	public PrivilegedRequest writer;

	@ObfuscatedName("b.u")
	public int tnum = 0;

	@ObfuscatedName("b.z")
	public int tcyl = 0;

	public ClientStream(Socket arg0, SignLink arg1) throws IOException {
		this.signlink = arg1;
		this.socket = arg0;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@ObfuscatedName("b.b(I)I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("b.a([BIIB)V")
	public void write(byte[] arg0, int arg1) throws IOException {
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
			for (int var4 = 0; var4 < arg1; var4++) {
				this.buf[this.tnum] = arg0[var4];
				this.tnum = (this.tnum + 1) % 5000;
				if (this.tnum == (this.tcyl + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.writer == null) {
				this.writer = this.signlink.threadreq(3, this, 106);
			}
			this.notifyAll();
		}
	}

	@ObfuscatedName("b.a(II[BI)V")
	public void read(int arg0, byte[] arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg1, arg0, arg2);
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
		return this.dummy ? 0 : this.in.available();
	}

	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					int var2;
					int var3;
					synchronized (this) {
						if (this.tnum == this.tcyl) {
							if (this.dummy) {
								break label80;
							}
							try {
								this.wait();
							} catch (InterruptedException var8) {
							}
						}
						if (this.tnum < this.tcyl) {
							var2 = 5000 - this.tcyl;
						} else {
							var2 = this.tnum - this.tcyl;
						}
						var3 = this.tcyl;
					}
					if (var2 <= 0) {
						continue;
					}
					try {
						this.out.write(this.buf, var3, var2);
					} catch (IOException var7) {
						this.ioerror = true;
					}
					this.tcyl = (var2 + this.tcyl) % 5000;
					try {
						if (this.tcyl == this.tnum) {
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
				break;
			}
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("b.c(I)V")
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
					((Thread) this.writer.result).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.writer = null;
	}
}
