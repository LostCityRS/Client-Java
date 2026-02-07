package jagex3.client.applet;

import deob.ObfuscatedName;
import jagex3.io.FileOnDisk;
import jagex3.sound.AudioSource;
import jagex3.util.ThreadSleep;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dc")
public final class SignLink implements Runnable {

	@ObfuscatedName("dc.a")
	public PrivilegedRequest current = null;

	@ObfuscatedName("dc.b")
	public boolean isClosed = false;

	@ObfuscatedName("dc.c")
	public static Method setFocusTraversalKeysEnabled;

	@ObfuscatedName("dc.d")
	public final Thread thread;

	@ObfuscatedName("dc.e")
	public FileOnDisk field454 = null;

	@ObfuscatedName("dc.f")
	public FileOnDisk[] field455;

	@ObfuscatedName("dc.g")
	public static String userHome;

	@ObfuscatedName("dc.h")
	public static String javaVersion;

	@ObfuscatedName("dc.i")
	public Applet applet = null;

	@ObfuscatedName("dc.j")
	public EventQueue eventQueue;

	@ObfuscatedName("dc.k")
	public FileOnDisk field460 = null;

	@ObfuscatedName("dc.l")
	public AudioSource field461;

	@ObfuscatedName("dc.m")
	public PrivilegedRequest task = null;

	@ObfuscatedName("dc.n")
	public File field463 = null;

	@ObfuscatedName("dc.o")
	public static String javaVendor;

	@ObfuscatedName("dc.p")
	public static final int field465 = 3;

	@ObfuscatedName("dc.q")
	public static Method setFocusCycleRoot;

	@ObfuscatedName("dc.r")
	public File field467 = null;

	@ObfuscatedName("dc.s")
	public FileOnDisk field468 = null;

	public SignLink(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
		this.applet = arg1;
		javaVendor = "Unknown";
		javaVersion = "1.1";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var10) {
		}
		try {
			userHome = System.getProperty("user.home");
			if (userHome != null) {
				userHome = userHome + "/";
			}
		} catch (Exception var9) {
		}
		if (userHome == null) {
			userHome = "~/";
		}
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var8) {
		}
		try {
			if (arg1 == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception var7) {
		}
		try {
			if (arg1 == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception var6) {
		}
		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("i.a(Ljava/lang/Object;Ldc;I)V")
	public static void flushEvents(Object arg0, SignLink arg1) {
		if (arg1.eventQueue == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && arg1.eventQueue.peekEvent() != null; var2++) {
			ThreadSleep.sleepPrecise(1L);
		}
		if (arg0 != null) {
			arg1.eventQueue.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("dc.a(ZLjava/lang/Class;Ljava/lang/String;)Lcc;")
	public PrivilegedRequest getDeclaredField(Class arg0, String arg1) {
		return this.newRequest(0, new Object[] { arg0, arg1 }, 9);
	}

	@ObfuscatedName("dc.a(ILjava/lang/String;II)V")
	public void method174(int arg0, String arg1, int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHome, "/tmp/", "" };
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
									this.field468 = new FileOnDisk(var12, "rw", 25L);
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
								this.field454 = new FileOnDisk(var15, "rw", 52428800L);
								this.field455 = new FileOnDisk[arg2];
								for (int var16 = 0; var16 < arg2; var16++) {
									this.field455[var16] = new FileOnDisk(new File(var13, "main_file_cache.idx" + var16), "rw", 1048576L);
								}
								this.field460 = new FileOnDisk(new File(var13, "main_file_cache.idx255"), "rw", 1048576L);
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
	public PrivilegedRequest threadreq(int arg0, Runnable arg1, int arg2) {
		return this.newRequest(arg0, arg1, 2);
	}

	@ObfuscatedName("dc.a(I)V")
	public void close() {
		synchronized (this) {
			this.isClosed = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
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
			PrivilegedRequest var2;
			synchronized (this) {
				while (true) {
					if (this.isClosed) {
						return;
					}
					if (this.current != null) {
						var2 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
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
				int var3 = var2.type;
				if (var3 == 1) {
					var2.result = new Socket(InetAddress.getByName((String) var2.objArg), var2.intArg);
				} else if (var3 == 2) {
					Thread var4 = new Thread((Runnable) var2.objArg);
					var4.setDaemon(true);
					var4.start();
					var4.setPriority(var2.intArg);
					var2.result = var4;
				} else if (var3 == 4) {
					var2.result = new DataInputStream(((URL) var2.objArg).openStream());
				} else if (var3 == 8) {
					Object[] var5 = (Object[]) var2.objArg;
					var2.result = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
				} else if (var3 == 9) {
					Object[] var6 = (Object[]) var2.objArg;
					var2.result = ((Class) var6[0]).getDeclaredField((String) var6[1]);
				} else {
					throw new Exception();
				}
				var2.status = 1;
			} catch (ThreadDeath var8) {
				throw var8;
			} catch (Throwable var9) {
				var2.status = 2;
			}
		}
	}

	@ObfuscatedName("dc.b(I)Ld;")
	public AudioSource method177() {
		return this.field461;
	}

	@ObfuscatedName("dc.a(BLjava/net/URL;)Lcc;")
	public PrivilegedRequest urlreq(URL arg0) {
		return this.newRequest(0, arg0, 4);
	}

	@ObfuscatedName("dc.a([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lcc;")
	public PrivilegedRequest getDeclaredMethod(Class[] arg0, String arg1, Class arg2) {
		return this.newRequest(0, new Object[] { arg2, arg1, arg0 }, 8);
	}

	@ObfuscatedName("dc.a(II)Lcc;")
	public PrivilegedRequest dnsreq(int arg0) {
		return this.newRequest(arg0, null, 3);
	}

	@ObfuscatedName("dc.a(Ljava/lang/String;II)Lcc;")
	public PrivilegedRequest socketreq(String arg0, int arg1) {
		return this.newRequest(arg1, arg0, 1);
	}

	@ObfuscatedName("dc.a(IIILjava/lang/Object;I)Lcc;")
	public PrivilegedRequest newRequest(int arg0, Object arg1, int arg2) {
		PrivilegedRequest var4 = new PrivilegedRequest();
		var4.type = arg2;
		var4.objArg = arg1;
		var4.intArg = arg0;
		synchronized (this) {
			if (this.task == null) {
				this.task = this.current = var4;
			} else {
				this.task.next = var4;
				this.task = var4;
			}
			this.notify();
			return var4;
		}
	}
}
