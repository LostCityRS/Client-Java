package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public class ClientStream implements Runnable {

	@ObfuscatedName("e.a")
	public int field134 = 6;

	@ObfuscatedName("e.b")
	public boolean field135 = false;

	@ObfuscatedName("e.c")
	public boolean field136 = false;

	@ObfuscatedName("e.d")
	public InputStream field137;

	@ObfuscatedName("e.e")
	public OutputStream field138;

	@ObfuscatedName("e.f")
	public Socket field139;

	@ObfuscatedName("e.g")
	public boolean field140 = false;

	@ObfuscatedName("e.h")
	public GameShell field141;

	@ObfuscatedName("e.i")
	public byte[] field142;

	@ObfuscatedName("e.j")
	public int field143;

	@ObfuscatedName("e.k")
	public int field144;

	@ObfuscatedName("e.l")
	public boolean field145 = false;

	@ObfuscatedName("e.m")
	public boolean field146 = false;

	public ClientStream(GameShell arg0, Socket arg1, int arg2) throws IOException {
		this.field141 = arg0;
		this.field139 = arg1;
		this.field139.setSoTimeout(30000);
		this.field139.setTcpNoDelay(true);
		this.field137 = this.field139.getInputStream();
		this.field138 = this.field139.getOutputStream();
		if (arg2 < this.field134 || arg2 > this.field134) {
			throw new NullPointerException();
		}
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		this.field140 = true;
		try {
			if (this.field137 != null) {
				this.field137.close();
			}
			if (this.field138 != null) {
				this.field138.close();
			}
			if (this.field139 != null) {
				this.field139.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.field145 = false;
		synchronized (this) {
			this.notify();
		}
		this.field142 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		return this.field140 ? 0 : this.field137.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		return this.field140 ? 0 : this.field137.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field140) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field137.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.a([BIII)V")
	public void method42(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
		if (this.field140) {
			return;
		}
		if (this.field146) {
			this.field146 = false;
			throw new IOException("Error in writer thread");
		}
		if (this.field142 == null) {
			this.field142 = new byte[5000];
		}
		synchronized (this) {
			for (int var6 = 0; var6 < arg3; var6++) {
				this.field142[this.field144] = arg0[var6 + arg1];
				this.field144 = (this.field144 + 1) % 5000;
				if (this.field144 == (this.field143 + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.field145) {
				this.field145 = true;
				this.field141.method12(this, 3);
			}
			this.notify();
		}
		if (arg2 == 0) {
			;
		}
	}

	public void run() {
		while (this.field145) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.field144 == this.field143) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.field145) {
					return;
				}
				var2 = this.field143;
				if (this.field144 >= this.field143) {
					var3 = this.field144 - this.field143;
				} else {
					var3 = 5000 - this.field143;
				}
			}
			if (var3 > 0) {
				try {
					this.field138.write(this.field142, var2, var3);
				} catch (IOException var5) {
					this.field146 = true;
				}
				this.field143 = (this.field143 + var3) % 5000;
				try {
					if (this.field144 == this.field143) {
						this.field138.flush();
					}
				} catch (IOException var4) {
					this.field146 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(I)V")
	public void method43(int arg0) {
		System.out.println("dummy:" + this.field140);
		System.out.println("tcycl:" + this.field143);
		while (arg0 >= 0) {
			this.field136 = !this.field136;
		}
		System.out.println("tnum:" + this.field144);
		System.out.println("writer:" + this.field145);
		System.out.println("ioerror:" + this.field146);
		try {
			System.out.println("available:" + this.method40());
		} catch (IOException var2) {
		}
	}
}
