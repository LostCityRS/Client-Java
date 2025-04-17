package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public class ClientStream implements Runnable {

	@ObfuscatedName("e.a")
	public InputStream field135;

	@ObfuscatedName("e.b")
	public OutputStream field136;

	@ObfuscatedName("e.c")
	public Socket field137;

	@ObfuscatedName("e.d")
	public boolean field138 = false;

	@ObfuscatedName("e.e")
	public GameShell field139;

	@ObfuscatedName("e.f")
	public byte[] field140;

	@ObfuscatedName("e.g")
	public int field141;

	@ObfuscatedName("e.h")
	public int field142;

	@ObfuscatedName("e.i")
	public boolean field143 = false;

	@ObfuscatedName("e.j")
	public boolean field144 = false;

	public ClientStream(Socket arg0, GameShell arg1, byte arg2) throws IOException {
		if (arg2 != 11) {
			throw new NullPointerException();
		}
		this.field139 = arg1;
		this.field137 = arg0;
		this.field137.setSoTimeout(30000);
		this.field137.setTcpNoDelay(true);
		this.field135 = this.field137.getInputStream();
		this.field136 = this.field137.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		this.field138 = true;
		try {
			if (this.field135 != null) {
				this.field135.close();
			}
			if (this.field136 != null) {
				this.field136.close();
			}
			if (this.field137 != null) {
				this.field137.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.field143 = false;
		synchronized (this) {
			this.notify();
		}
		this.field140 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		return this.field138 ? 0 : this.field135.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		return this.field138 ? 0 : this.field135.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field138) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field135.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("e.a(IZI[B)V")
	public void method42(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
		if (this.field138) {
			return;
		}
		if (this.field144) {
			this.field144 = false;
			throw new IOException("Error in writer thread");
		}
		if (this.field140 == null) {
			this.field140 = new byte[5000];
		}
		synchronized (this) {
			for (int var6 = 0; var6 < arg0; var6++) {
				this.field140[this.field142] = arg3[arg2 + var6];
				this.field142 = (this.field142 + 1) % 5000;
				if ((this.field141 + 4900) % 5000 == this.field142) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.field143) {
				this.field143 = true;
				this.field139.method12(this, 3);
			}
			this.notify();
		}
		if (!arg1) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
	}

	public void run() {
		while (this.field143) {
			int var2;
			int var3;
			label54: {
				synchronized (this) {
					if (this.field142 == this.field141) {
						try {
							this.wait();
						} catch (InterruptedException var7) {
						}
					}
					if (this.field143) {
						var2 = this.field141;
						if (this.field142 >= this.field141) {
							var3 = this.field142 - this.field141;
						} else {
							var3 = 5000 - this.field141;
						}
						break label54;
					}
				}
				return;
			}
			if (var3 > 0) {
				try {
					this.field136.write(this.field140, var2, var3);
				} catch (IOException var6) {
					this.field144 = true;
				}
				this.field141 = (this.field141 + var3) % 5000;
				try {
					if (this.field142 == this.field141) {
						this.field136.flush();
					}
				} catch (IOException var5) {
					this.field144 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void method43(byte arg0) {
		System.out.println("dummy:" + this.field138);
		System.out.println("tcycl:" + this.field141);
		System.out.println("tnum:" + this.field142);
		System.out.println("writer:" + this.field143);
		System.out.println("ioerror:" + this.field144);
		if (arg0 != 40) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		try {
			System.out.println("available:" + this.method40());
		} catch (IOException var3) {
		}
	}
}
