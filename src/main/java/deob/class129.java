package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("vc")
public final class class129 implements Runnable {

	@ObfuscatedName("vc.a")
	public static class1 field3146 = Statics.method931("Your account has been disabled)3");

	@ObfuscatedName("vc.c")
	public static class1 field3148 = Statics.method931("Wordpack geladen)3");

	@ObfuscatedName("vc.d")
	public final InputStream field3149;

	@ObfuscatedName("vc.e")
	public byte[] field3150;

	@ObfuscatedName("vc.f")
	public static class1 field3151 = Statics.method931("Handel akzeptieren");

	@ObfuscatedName("vc.i")
	public final Socket field3154;

	@ObfuscatedName("vc.j")
	public int field3155 = 0;

	@ObfuscatedName("vc.k")
	public boolean field3156 = false;

	@ObfuscatedName("vc.l")
	public static int field3157 = -1;

	@ObfuscatedName("vc.m")
	public class29 field3158;

	@ObfuscatedName("vc.n")
	public boolean field3159 = false;

	@ObfuscatedName("vc.p")
	public final class69 field3161;

	@ObfuscatedName("vc.r")
	public static class1 field3163 = Statics.method931("redstone3");

	@ObfuscatedName("vc.u")
	public int field3166 = 0;

	@ObfuscatedName("vc.A")
	public static class1 field3172 = field3146;

	@ObfuscatedName("vc.x")
	public static class1 field3169 = Statics.method931("");

	@ObfuscatedName("vc.y")
	public static class1 field3170 = Statics.method931("Menge eingeben:");

	@ObfuscatedName("vc.D")
	public static int field3175 = 99;

	@ObfuscatedName("vc.C")
	public final OutputStream field3174;

	@ObfuscatedName("vc.a(III[B)V")
	public void method1014(int arg0, int arg1, byte[] arg2) throws IOException {
		if (this.field3159) {
			return;
		}
		while (arg1 > 0) {
			int var4 = this.field3149.read(arg2, arg0, arg1);
			if (var4 <= 0) {
				throw new EOFException();
			}
			arg1 -= var4;
			arg0 += var4;
		}
	}

	@ObfuscatedName("vc.a(I)V")
	public void method1015() {
		if (this.field3159) {
			return;
		}
		synchronized (this) {
			this.field3159 = true;
			this.notifyAll();
		}
		if (this.field3158 != null) {
			while (this.field3158.field815 == 0) {
				Statics.method753(1L);
			}
			if (this.field3158.field815 == 1) {
				try {
					((Thread) this.field3158.field818).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.field3158 = null;
	}

	@ObfuscatedName("vc.a(IBI[B)V")
	public void method1016(int arg0, byte[] arg1) throws IOException {
		if (this.field3159) {
			return;
		}
		if (this.field3156) {
			this.field3156 = false;
			throw new IOException();
		}
		if (this.field3150 == null) {
			this.field3150 = new byte[5000];
		}
		synchronized (this) {
			for (int var4 = 0; var4 < arg0; var4++) {
				this.field3150[this.field3155] = arg1[var4];
				this.field3155 = (this.field3155 + 1) % 5000;
				if ((this.field3166 + 4900) % 5000 == this.field3155) {
					throw new IOException();
				}
			}
			if (this.field3158 == null) {
				this.field3158 = this.field3161.method656(3, this);
			}
			this.notifyAll();
		}
	}

	@Override
	public void finalize() {
		this.method1015();
	}

	public class129(Socket arg0, class69 arg1) throws IOException {
		this.field3161 = arg1;
		this.field3154 = arg0;
		this.field3154.setSoTimeout(30000);
		this.field3154.setTcpNoDelay(true);
		this.field3149 = this.field3154.getInputStream();
		this.field3174 = this.field3154.getOutputStream();
	}

	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					int var2;
					int var3;
					synchronized (this) {
						if (this.field3166 == this.field3155) {
							if (this.field3159) {
								break label77;
							}
							try {
								this.wait();
							} catch (InterruptedException var8) {
							}
						}
						if (this.field3166 <= this.field3155) {
							var2 = this.field3155 - this.field3166;
						} else {
							var2 = 5000 - this.field3166;
						}
						var3 = this.field3166;
					}
					if (var2 <= 0) {
						continue;
					}
					try {
						this.field3174.write(this.field3150, var3, var2);
					} catch (IOException var7) {
						this.field3156 = true;
					}
					this.field3166 = (this.field3166 + var2) % 5000;
					try {
						if (this.field3166 == this.field3155) {
							this.field3174.flush();
						}
					} catch (IOException var6) {
						this.field3156 = true;
					}
					continue;
				}
				try {
					if (this.field3149 != null) {
						this.field3149.close();
					}
					if (this.field3174 != null) {
						this.field3174.close();
					}
					if (this.field3154 != null) {
						this.field3154.close();
					}
				} catch (IOException var5) {
				}
				this.field3150 = null;
				return;
			}
		} catch (Exception var10) {
			Statics.method214(null, var10);
		}
	}

	@ObfuscatedName("vc.b(I)I")
	public int method1020() throws IOException {
		return this.field3159 ? 0 : this.field3149.available();
	}

	@ObfuscatedName("vc.d(I)I")
	public int method1022() throws IOException {
		return this.field3159 ? 0 : this.field3149.read();
	}
}
