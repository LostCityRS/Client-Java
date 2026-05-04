package deob;

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

	@ObfuscatedName("mf.p")
	public static int field2548 = 0;

	@ObfuscatedName("mf.r")
	public int field2550 = 0;

	@ObfuscatedName("mf.s")
	public boolean field2551 = false;

	@ObfuscatedName("mf.t")
	public byte[] field2552;

	@ObfuscatedName("mf.u")
	public final Socket field2553;

	@ObfuscatedName("mf.w")
	public static boolean field2555 = false;

	@ObfuscatedName("mf.a(III)V")
	public static void method912(int arg0, int arg1) {
		if (IfType.openInterface(arg0)) {
			client.method1536(arg1, IfType.list[arg0]);
		}
	}

	@ObfuscatedName("mf.a(ILea;IZIIIII)V")
	public static void method914(int arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg0 < 0 || arg0 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				int var7 = arg1.g1();
				if (var7 == 0) {
					return;
				}
				if (var7 == 1) {
					arg1.g1();
					return;
				}
				if (var7 <= 49) {
					arg1.g1();
				}
			}
		}
		ClientBuild.field2098[arg6][arg0][arg4] = 0;
		while (true) {
			int var8 = arg1.g1();
			if (var8 == 0) {
				if (arg6 == 0) {
					ClientBuild.field1137[0][arg0][arg4] = -Statics.method1470(arg3 + arg0 + 932731, 556238 - -arg4 - -arg2) * 8;
					return;
				} else {
					ClientBuild.field1137[arg6][arg0][arg4] = ClientBuild.field1137[arg6 - 1][arg0][arg4] - 240;
					return;
				}
			}
			if (var8 == 1) {
				int var9 = arg1.g1();
				if (var9 == 1) {
					var9 = 0;
				}
				if (arg6 == 0) {
					ClientBuild.field1137[0][arg0][arg4] = -var9 * 8;
					return;
				}
				ClientBuild.field1137[arg6][arg0][arg4] = ClientBuild.field1137[arg6 - 1][arg0][arg4] - var9 * 8;
				return;
			}
			if (var8 <= 49) {
				ClientBuild.field1962[arg6][arg0][arg4] = arg1.method324();
				ClientBuild.field115[arg6][arg0][arg4] = (byte) ((var8 - 2) / 4);
				ClientBuild.field4377[arg6][arg0][arg4] = (byte) (arg5 + var8 - 2 & 0x3);
			} else if (var8 <= 81) {
				ClientBuild.field2098[arg6][arg0][arg4] = (byte) (var8 - 49);
			} else {
				ClientBuild.field3142[arg6][arg0][arg4] = (byte) (var8 - 81);
			}
		}
	}

	@ObfuscatedName("mf.a(Ljj;)V")
	public static void method915(class108 arg0) {
		for (int var1 = arg0.field1933; var1 <= arg0.field1940; var1++) {
			for (int var2 = arg0.field1936; var2 <= arg0.field1935; var2++) {
				class52 var3 = World.field489[arg0.field1952][var1][var2];
				if (var3 != null) {
					for (int var4 = 0; var4 < var3.field962; var4++) {
						if (var3.field963[var4] == arg0) {
							var3.field962--;
							for (int var5 = var4; var5 < var3.field962; var5++) {
								var3.field963[var5] = var3.field963[var5 + 1];
								var3.field957[var5] = var3.field957[var5 + 1];
							}
							var3.field963[var3.field962] = null;
							break;
						}
					}
					var3.field954 = 0;
					for (int var6 = 0; var6 < var3.field962; var6++) {
						var3.field954 |= var3.field957[var6];
					}
				}
			}
		}
	}

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
				ThreadUtil.sleepPrecise(1L);
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
