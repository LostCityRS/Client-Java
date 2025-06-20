package jagex2.io;

import jagex2.client.GameShell;
import deob.ObfuscatedName;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public class ClientStream implements Runnable {

	@ObfuscatedName("e.a")
	public InputStream in;

	@ObfuscatedName("e.b")
	public OutputStream out;

	@ObfuscatedName("e.c")
	public Socket socket;

	@ObfuscatedName("e.d")
	public boolean dummy = false;

	@ObfuscatedName("e.e")
	public GameShell shell;

	@ObfuscatedName("e.f")
	public byte[] data;

	@ObfuscatedName("e.g")
	public int tcycl;

	@ObfuscatedName("e.h")
	public int tnum;

	@ObfuscatedName("e.i")
	public boolean writer = false;

	@ObfuscatedName("e.j")
	public boolean ioerror = false;

	public ClientStream(Socket socket, GameShell shell) throws IOException {
		this.shell = shell;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void close() {
		this.dummy = true;

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
		} catch (IOException ignore) {
			System.out.println("Error closing stream");
		}

		this.writer = false;

		synchronized (this) {
			this.notify();
		}

		this.data = null;
	}

	@ObfuscatedName("e.b()I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("e.c()I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void read(byte[] dst, int off, int len) throws IOException {
		if (this.dummy) {
			return;
		}

		while (len > 0) {
			int n = this.in.read(dst, off, len);
			if (n <= 0) {
				throw new IOException("EOF");
			}

			off += n;
			len -= n;
		}
	}

	@ObfuscatedName("e.a(IZI[B)V")
	public void write(int len, int off, byte[] src) throws IOException {
		if (this.dummy) {
			return;
		}

		if (this.ioerror) {
			this.ioerror = false;
			throw new IOException("Error in writer thread");
		}

		if (this.data == null) {
			this.data = new byte[5000];
		}

		synchronized (this) {
			for (int i = 0; i < len; i++) {
				this.data[this.tnum] = src[off + i];
				this.tnum = (this.tnum + 1) % 5000;

				if ((this.tcycl + 4900) % 5000 == this.tnum) {
					throw new IOException("buffer overflow");
				}
			}

			if (!this.writer) {
				this.writer = true;
				this.shell.startThread(this, 3);
			}

			this.notify();
		}
	}

	public void run() {
		while (this.writer) {
			int off;
			int len;

			label54: {
				synchronized (this) {
					if (this.tnum == this.tcycl) {
						try {
							this.wait();
						} catch (InterruptedException ignore) {
						}
					}

					if (this.writer) {
						off = this.tcycl;
						if (this.tnum >= this.tcycl) {
							len = this.tnum - this.tcycl;
						} else {
							len = 5000 - this.tcycl;
						}
						break label54;
					}
				}
				return;
			}

			if (len > 0) {
				try {
					this.out.write(this.data, off, len);
				} catch (IOException ignore) {
					this.ioerror = true;
				}

				this.tcycl = (this.tcycl + len) % 5000;

				try {
					if (this.tnum == this.tcycl) {
						this.out.flush();
					}
				} catch (IOException ignore) {
					this.ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void debug() {
		System.out.println("dummy:" + this.dummy);
		System.out.println("tcycl:" + this.tcycl);
		System.out.println("tnum:" + this.tnum);
		System.out.println("writer:" + this.writer);
		System.out.println("ioerror:" + this.ioerror);
		try {
			System.out.println("available:" + this.available());
		} catch (IOException ignore) {
		}
	}
}
