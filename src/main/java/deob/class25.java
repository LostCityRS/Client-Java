package deob;

import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dc")
public final class class25 implements Runnable {

	@ObfuscatedName("dc.a")
	public class18 field450 = null;

	@ObfuscatedName("dc.b")
	public boolean field451 = false;

	@ObfuscatedName("dc.c")
	public static Method field452;

	@ObfuscatedName("dc.d")
	public final Thread field453;

	@ObfuscatedName("dc.e")
	public class78 field454 = null;

	@ObfuscatedName("dc.f")
	public class78[] field455;

	@ObfuscatedName("dc.g")
	public static String field456;

	@ObfuscatedName("dc.h")
	public static String field457;

	@ObfuscatedName("dc.i")
	public Applet field458 = null;

	@ObfuscatedName("dc.j")
	public EventQueue field459;

	@ObfuscatedName("dc.k")
	public class78 field460 = null;

	@ObfuscatedName("dc.l")
	public class22 field461;

	@ObfuscatedName("dc.m")
	public class18 field462 = null;

	@ObfuscatedName("dc.n")
	public File field463 = null;

	@ObfuscatedName("dc.o")
	public static String field464;

	@ObfuscatedName("dc.p")
	public static final int field465 = 3;

	@ObfuscatedName("dc.q")
	public static Method field466;

	@ObfuscatedName("dc.r")
	public File field467 = null;

	@ObfuscatedName("dc.s")
	public class78 field468 = null;

	public class25(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
		this.field458 = arg1;
		field464 = "Unknown";
		field457 = "1.1";
		try {
			field464 = System.getProperty("java.vendor");
			field457 = System.getProperty("java.version");
		} catch (Exception var10) {
		}
		try {
			field456 = System.getProperty("user.home");
			if (field456 != null) {
				field456 = field456 + "/";
			}
		} catch (Exception var9) {
		}
		if (field456 == null) {
			field456 = "~/";
		}
		try {
			this.field459 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var8) {
		}
		try {
			if (arg1 == null) {
				field452 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				field452 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception var7) {
		}
		try {
			if (arg1 == null) {
				field466 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				field466 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception var6) {
		}
		this.field451 = false;
		this.field453 = new Thread(this);
		this.field453.setPriority(10);
		this.field453.setDaemon(true);
		this.field453.start();
	}

	@ObfuscatedName("dc.a(ZLjava/lang/Class;Ljava/lang/String;)Lcc;")
	public class18 method173(Class arg0, String arg1) {
		return this.method182(0, new Object[] { arg0, arg1 }, 9);
	}

	@ObfuscatedName("dc.a(ILjava/lang/String;II)V")
	public void method174(int arg0, String arg1, int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field456, "/tmp/", "" };
		String[] var5 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (int var6 = 0; var6 < 2; var6++) {
			for (int var7 = 0; var7 < var5.length; var7++) {
				for (int var8 = 0; var8 < var4.length; var8++) {
					try {
						String var9 = var4[var8];
						if (var9.length() > 0 && !(new File(var9)).exists()) {
							continue;
						}
						File var10 = new File(var9 + var5[var7]);
						if (var6 == 1 && !var10.exists()) {
							boolean var11 = var10.mkdir();
							if (!var11) {
								continue;
							}
						}
						if (this.field468 == null) {
							try {
								File var12 = new File(var10, "random.dat");
								if (var6 == 1 || var12.exists()) {
									this.field468 = new class78(var12, "rw", 25L);
								}
							} catch (Exception var20) {
								this.field468 = null;
							}
						}
						if (this.field463 == null) {
							try {
								File var13 = new File(var10, arg1);
								if (var6 == 1 && !var13.exists()) {
									boolean var14 = var13.mkdir();
									if (!var14) {
										continue;
									}
								}
								File var15 = new File(var13, "main_file_cache.dat2");
								if (var6 == 0 && !var15.exists()) {
									continue;
								}
								this.field454 = new class78(var15, "rw", 52428800L);
								this.field455 = new class78[arg2];
								for (int var16 = 0; var16 < arg2; var16++) {
									this.field455[var16] = new class78(new File(var13, "main_file_cache.idx" + var16), "rw", 1048576L);
								}
								this.field460 = new class78(new File(var13, "main_file_cache.idx255"), "rw", 1048576L);
								this.field467 = this.field463 = var13;
							} catch (Exception var19) {
								try {
									this.field454.method624();
									for (int var17 = 0; var17 < arg2; var17++) {
										this.field455[var17].method624();
									}
									this.field460.method624();
								} catch (Exception var18) {
								}
								this.field455 = null;
								this.field454 = this.field460 = null;
								this.field467 = this.field463 = null;
							}
						}
					} catch (Exception var21) {
					}
					if (this.field468 != null && this.field463 != null) {
						return;
					}
				}
			}
		}
		if (this.field463 == null) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("dc.a(ILjava/lang/Runnable;I)Lcc;")
	public class18 method175(int arg0, Runnable arg1, int arg2) {
		return this.method182(arg0, arg1, 2);
	}

	@ObfuscatedName("dc.a(I)V")
	public void method176() {
		synchronized (this) {
			this.field451 = true;
			this.notifyAll();
		}
		try {
			this.field453.join();
		} catch (InterruptedException var7) {
		}
		if (this.field454 != null) {
			try {
				this.field454.method624();
			} catch (IOException var6) {
			}
		}
		if (this.field460 != null) {
			try {
				this.field460.method624();
			} catch (IOException var5) {
			}
		}
		if (this.field455 != null) {
			for (int var2 = 0; var2 < this.field455.length; var2++) {
				if (this.field455[var2] != null) {
					try {
						this.field455[var2].method624();
					} catch (IOException var4) {
					}
				}
			}
		}
		if (this.field468 != null) {
			try {
				this.field468.method624();
			} catch (IOException var3) {
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			class18 var2;
			synchronized (this) {
				while (true) {
					if (this.field451) {
						return;
					}
					if (this.field450 != null) {
						var2 = this.field450;
						this.field450 = this.field450.field354;
						if (this.field450 == null) {
							this.field462 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}
			try {
				int var3 = var2.field356;
				if (var3 == 1) {
					var2.field352 = new Socket(InetAddress.getByName((String) var2.field357), var2.field353);
				} else if (var3 == 2) {
					Thread var4 = new Thread((Runnable) var2.field357);
					var4.setDaemon(true);
					var4.start();
					var4.setPriority(var2.field353);
					var2.field352 = var4;
				} else if (var3 == 4) {
					var2.field352 = new DataInputStream(((URL) var2.field357).openStream());
				} else if (var3 == 8) {
					Object[] var5 = (Object[]) var2.field357;
					var2.field352 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
				} else if (var3 == 9) {
					Object[] var6 = (Object[]) var2.field357;
					var2.field352 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
				} else {
					throw new Exception();
				}
				var2.field355 = 1;
			} catch (ThreadDeath var8) {
				throw var8;
			} catch (Throwable var9) {
				var2.field355 = 2;
			}
		}
	}

	@ObfuscatedName("dc.b(I)Ld;")
	public class22 method177() {
		return this.field461;
	}

	@ObfuscatedName("dc.a(BLjava/net/URL;)Lcc;")
	public class18 method178(URL arg0) {
		return this.method182(0, arg0, 4);
	}

	@ObfuscatedName("dc.a([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lcc;")
	public class18 method179(Class[] arg0, String arg1, Class arg2) {
		return this.method182(0, new Object[] { arg2, arg1, arg0 }, 8);
	}

	@ObfuscatedName("dc.a(II)Lcc;")
	public class18 method180(int arg0) {
		return this.method182(arg0, null, 3);
	}

	@ObfuscatedName("dc.a(Ljava/lang/String;II)Lcc;")
	public class18 method181(String arg0, int arg1) {
		return this.method182(arg1, arg0, 1);
	}

	@ObfuscatedName("dc.a(IIILjava/lang/Object;I)Lcc;")
	public class18 method182(int arg0, Object arg1, int arg2) {
		class18 var4 = new class18();
		var4.field356 = arg2;
		var4.field357 = arg1;
		var4.field353 = arg0;
		synchronized (this) {
			if (this.field462 == null) {
				this.field462 = this.field450 = var4;
			} else {
				this.field462.field354 = var4;
				this.field462 = var4;
			}
			this.notify();
			return var4;
		}
	}
}
