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

@ObfuscatedName("vc")
public final class ClientStream implements Runnable {

	@ObfuscatedName("vc.d")
	public final InputStream in;

	@ObfuscatedName("vc.e")
	public byte[] buf;

	@ObfuscatedName("vc.i")
	public final Socket socket;

	@ObfuscatedName("vc.j")
	public int tnum = 0;

	@ObfuscatedName("vc.k")
	public boolean ioerror = false;

	@ObfuscatedName("vc.m")
	public PrivilegedRequest writer;

	@ObfuscatedName("vc.n")
	public boolean dummy = false;

	@ObfuscatedName("vc.p")
	public final SignLink signlink;

	@ObfuscatedName("vc.u")
	public int tcyl = 0;

	@ObfuscatedName("vc.C")
	public final OutputStream out;

	@ObfuscatedName("vc.a(III[B)V")
	public void read(int arg0, int arg1, byte[] arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg1 > 0) {
			int var4 = this.in.read(arg2, arg0, arg1);
			if (var4 <= 0) {
				throw new EOFException();
			}
			arg1 -= var4;
			arg0 += var4;
		}
	}

	@ObfuscatedName("vc.a(I)V")
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

	@ObfuscatedName("vc.a(IBI[B)V")
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
				if ((this.tcyl + 4900) % 5000 == this.tnum) {
					throw new IOException();
				}
			}
			if (this.writer == null) {
				this.writer = this.signlink.threadreq(3, this);
			}
			this.notifyAll();
		}
	}

	@Override
	public void finalize() {
		this.close();
	}

	public ClientStream(Socket arg0, SignLink arg1) throws IOException {
		this.signlink = arg1;
		this.socket = arg0;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@Override
	public void run() {
		try {
			while (true) {
				label77:
				{
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
						if (this.tcyl <= this.tnum) {
							var2 = this.tnum - this.tcyl;
						} else {
							var2 = 5000 - this.tcyl;
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
					this.tcyl = (this.tcyl + var2) % 5000;
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
				return;
			}
		} catch (Exception var10) {
			JagException.report(null, var10);
		}
	}

	@ObfuscatedName("vc.b(I)I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("vc.d(I)I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}
}
