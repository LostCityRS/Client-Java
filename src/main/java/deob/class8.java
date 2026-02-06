package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("b")
public final class class8 implements Runnable {

	@ObfuscatedName("b.c")
	public boolean field134 = false;

	@ObfuscatedName("b.e")
	public boolean field136 = false;

	@ObfuscatedName("b.f")
	public final Socket field137;

	@ObfuscatedName("b.h")
	public byte[] field139;

	@ObfuscatedName("b.i")
	public final class25 field140;

	@ObfuscatedName("b.j")
	public static short[] field141;

	@ObfuscatedName("b.k")
	public static int field142 = 10;

	@ObfuscatedName("b.l")
	public static class32 field143 = class73.method593(" zuerst von Ihrer Freunde)2Liste(Q", true);

	@ObfuscatedName("b.n")
	public final OutputStream field145;

	@ObfuscatedName("b.o")
	public static class32 field146 = class73.method593("VOLL", true);

	@ObfuscatedName("b.p")
	public final InputStream field147;

	@ObfuscatedName("b.q")
	public class18 field148;

	@ObfuscatedName("b.r")
	public static class32 field149 = class73.method593("AUS", true);

	@ObfuscatedName("b.u")
	public int field152 = 0;

	@ObfuscatedName("b.w")
	public static class32 field154 = class73.method593("Starting game engine)3)3)3", true);

	@ObfuscatedName("b.x")
	public static class32 field155 = field154;

	@ObfuscatedName("b.z")
	public int field157 = 0;

	@ObfuscatedName("b.a(I)V")
	public static void method45() {
		while (true) {
			if (class158.field3612.method354(class115.field2700) >= 11) {
				int var0 = class158.field3612.method352(11);
				if (var0 != 2047) {
					boolean var1 = false;
					if (class52.field1175[var0] == null) {
						class52.field1175[var0] = new class70();
						if (class143.field3262[var0] != null) {
							class52.field1175[var0].method576(class143.field3262[var0]);
						}
						var1 = true;
					}
					class137.field3187[class62.field1404++] = var0;
					class70 var2 = class52.field1175[var0];
					var2.field2713 = class140.field3217;
					int var3 = class158.field3612.method352(5);
					if (var3 > 15) {
						var3 -= 32;
					}
					int var4 = class158.field3612.method352(5);
					if (var4 > 15) {
						var4 -= 32;
					}
					int var5 = class31.field614[class158.field3612.method352(3)];
					if (var1) {
						var2.field2742 = var2.field2745 = var5;
					}
					int var6 = class158.field3612.method352(1);
					int var7 = class158.field3612.method352(1);
					if (var7 == 1) {
						class62.field1418[class61.field1352++] = var0;
					}
					var2.method902(class20.field373.field2736[0] + var4, var6 == 1, class20.field373.field2759[0] + var3);
					continue;
				}
			}
			class158.field3612.method355();
			return;
		}
	}

	@ObfuscatedName("b.a(B)V")
	public static void method47() {
		field146 = null;
		field143 = null;
		field149 = null;
		field154 = null;
		field155 = null;
		field141 = null;
	}

	@ObfuscatedName("b.b(B)V")
	public static void method48() {
		class85.field1987.method490();
		class126.field2922.method490();
		class45.field1055.method490();
	}

	@ObfuscatedName("b.d(I)Z")
	public static boolean method53() {
		try {
			if (class98.field2263 == 2) {
				if (class129.field2977 == null) {
					class129.field2977 = class6.method25(class34.field718, class157.field3606, class126.field2928);
					if (class129.field2977 == null) {
						return false;
					}
				}
				if (class159.field3644 == null) {
					class159.field3644 = new class68(class105.field2499, class98.field2257);
				}
				if (class83.field1966.method96(class97.field2237, class159.field3644, class129.field2977)) {
					class83.field1966.method121();
					class83.field1966.method89(class57.field1321);
					class83.field1966.method84(class121.field2870, class129.field2977);
					class159.field3644 = null;
					class98.field2263 = 0;
					class129.field2977 = null;
					class34.field718 = null;
					return true;
				}
			}
		} catch (Exception var1) {
			var1.printStackTrace();
			class83.field1966.method115();
			class129.field2977 = null;
			class34.field718 = null;
			class159.field3644 = null;
			class98.field2263 = 0;
		}
		return false;
	}

	public class8(Socket arg0, class25 arg1) throws IOException {
		this.field140 = arg1;
		this.field137 = arg0;
		this.field137.setSoTimeout(30000);
		this.field137.setTcpNoDelay(true);
		this.field147 = this.field137.getInputStream();
		this.field145 = this.field137.getOutputStream();
	}

	@ObfuscatedName("b.b(I)I")
	public int method46() throws IOException {
		return this.field136 ? 0 : this.field147.read();
	}

	@ObfuscatedName("b.a([BIIB)V")
	public void method49(byte[] arg0, int arg1) throws IOException {
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
				this.field148 = this.field140.method175(3, this, 106);
			}
			this.notifyAll();
		}
	}

	@ObfuscatedName("b.a(II[BI)V")
	public void method50(int arg0, byte[] arg1, int arg2) throws IOException {
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
		this.method52();
	}

	@ObfuscatedName("b.c(B)I")
	public int method51() throws IOException {
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
			class110.method870(var10, null);
		}
	}

	@ObfuscatedName("b.c(I)V")
	public void method52() {
		if (this.field136) {
			return;
		}
		synchronized (this) {
			this.field136 = true;
			this.notifyAll();
		}
		if (this.field148 != null) {
			while (this.field148.field355 == 0) {
				class54.method426(1L);
			}
			if (this.field148.field355 == 1) {
				try {
					((Thread) this.field148.field352).join();
				} catch (InterruptedException var2) {
				}
			}
		}
		this.field148 = null;
	}
}
