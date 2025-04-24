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

	public ClientStream(Socket arg0, GameShell arg1) throws IOException {
		this.shell = arg1;
		this.socket = arg0;
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
		} catch (IOException var3) {
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
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.a(IZI[B)V")
	public void write(int arg0, int arg2, byte[] arg3) throws IOException {
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
			for (int var6 = 0; var6 < arg0; var6++) {
				this.data[this.tnum] = arg3[arg2 + var6];
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
			int var2;
			int var3;
			label54: {
				synchronized (this) {
					if (this.tnum == this.tcycl) {
						try {
							this.wait();
						} catch (InterruptedException var7) {
						}
					}
					if (this.writer) {
						var2 = this.tcycl;
						if (this.tnum >= this.tcycl) {
							var3 = this.tnum - this.tcycl;
						} else {
							var3 = 5000 - this.tcycl;
						}
						break label54;
					}
				}
				return;
			}
			if (var3 > 0) {
				try {
					this.out.write(this.data, var2, var3);
				} catch (IOException var6) {
					this.ioerror = true;
				}
				this.tcycl = (this.tcycl + var3) % 5000;
				try {
					if (this.tnum == this.tcycl) {
						this.out.flush();
					}
				} catch (IOException var5) {
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
		} catch (IOException var3) {
		}
	}
}
