package jagex3.client;

import deob.ObfuscatedName;
import jagex3.io.FileOnDisk;
import jagex3.sound.AudioSource;

import java.applet.Applet;
import java.awt.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("qg")
public final class SignLink implements Runnable {

	@ObfuscatedName("qg.a")
	public static final int field3579 = 3;

	@ObfuscatedName("qg.b")
	public File field3580 = null;

	@ObfuscatedName("qg.c")
	public static Method setFocusCycleRoot;

	@ObfuscatedName("qg.d")
	public FileOnDisk field3582 = null;

	@ObfuscatedName("qg.e")
	public PrivilegedRequest task = null;

	@ObfuscatedName("qg.f")
	public FileOnDisk[] field3584;

	@ObfuscatedName("qg.g")
	public static String userHome;

	@ObfuscatedName("qg.h")
	public static Method setFocusTraversalKeysEnabled;

	@ObfuscatedName("qg.i")
	public PrivilegedRequest current = null;

	@ObfuscatedName("qg.j")
	public FileOnDisk field3588 = null;

	@ObfuscatedName("qg.k")
	public AudioSource audio;

	@ObfuscatedName("qg.l")
	public FileOnDisk field3590 = null;

	@ObfuscatedName("qg.m")
	public static String javaVersion;

	@ObfuscatedName("qg.n")
	public EventQueue eventQueue;

	@ObfuscatedName("qg.o")
	public File field3593 = null;

	@ObfuscatedName("qg.p")
	public static String javaVendor;

	@ObfuscatedName("qg.q")
	public final Thread thread;

	@ObfuscatedName("qg.r")
	public boolean isClosed = false;

	@ObfuscatedName("qg.s")
	public Applet applet = null;

	public SignLink(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
		this.applet = arg1;
		javaVersion = "1.1";
		javaVendor = "Unknown";
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
		// custom: Why does the client not call this? Is this supposed to be called by a loader?
		// This function is what enables the cache...
		if (arg0) {
			this.getCacheDirectory(arg3, arg2, arg4);
		}
		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("qg.a(B)Lqd;")
	public AudioSource getAudio() {
		return this.audio;
	}

	@ObfuscatedName("qg.a(ILjava/lang/Runnable;I)Lp;")
	public PrivilegedRequest threadreq(Runnable arg1, int arg2) {
		return this.newRequest(2, arg1, arg2);
	}

	@ObfuscatedName("qg.a(Ljava/lang/String;II)Lp;")
	public PrivilegedRequest socketreq(String arg0, int arg1) {
		return this.newRequest(1, arg0, arg1);
	}

	@ObfuscatedName("qg.a(I)V")
	public void close() {
		synchronized (this) {
			this.isClosed = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException var7) {
		}
		if (this.field3590 != null) {
			try {
				this.field3590.close();
			} catch (IOException var6) {
			}
		}
		if (this.field3582 != null) {
			try {
				this.field3582.close();
			} catch (IOException var5) {
			}
		}
		if (this.field3584 != null) {
			for (int var2 = 0; var2 < this.field3584.length; var2++) {
				if (this.field3584[var2] != null) {
					try {
						this.field3584[var2].close();
					} catch (IOException var4) {
					}
				}
			}
		}
		if (this.field3588 != null) {
			try {
				this.field3588.close();
			} catch (IOException var3) {
			}
		}
	}

	@ObfuscatedName("qg.a(ILjava/lang/Object;III)Lp;")
	public PrivilegedRequest newRequest(int arg0, Object arg1, int arg2) {
		PrivilegedRequest var4 = new PrivilegedRequest();
		var4.objArg = arg1;
		var4.intArg = arg2;
		var4.type = arg0;
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
					Thread var6 = new Thread((Runnable) var2.objArg);
					var6.setDaemon(true);
					var6.start();
					var6.setPriority(var2.intArg);
					var2.result = var6;
				} else if (var3 == 4) {
					var2.result = new DataInputStream(((URL) var2.objArg).openStream());
				} else if (var3 == 8) {
					Object[] var4 = (Object[]) var2.objArg;
					var2.result = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
				} else if (var3 == 9) {
					Object[] var5 = (Object[]) var2.objArg;
					var2.result = ((Class) var5[0]).getDeclaredField((String) var5[1]);
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

	@ObfuscatedName("qg.a(Ljava/lang/String;ILjava/lang/Class;)Lp;")
	public PrivilegedRequest fieldreq(String arg0, Class arg1) {
		return this.newRequest(9, new Object[] { arg1, arg0 }, 0);
	}

	@ObfuscatedName("qg.a(II)Lp;")
	public PrivilegedRequest dnsreq(int arg0) {
		return this.newRequest(3, null, arg0);
	}

	@ObfuscatedName("qg.a(ZLjava/net/URL;)Lp;")
	public PrivilegedRequest urlreq(URL arg0) {
		return this.newRequest(4, arg0, 0);
	}

	@ObfuscatedName("qg.a(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;B)Lp;")
	public PrivilegedRequest methodreq(String arg0, Class arg1, Class[] arg2) {
		return this.newRequest(8, new Object[] { arg1, arg0, arg2 }, 0);
	}

	@ObfuscatedName("qg.a(Ljava/lang/String;III)V")
	public void getCacheDirectory(String arg0, int arg2, int arg3) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHome, "/tmp/", "" };
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < var5.length; var8++) {
				for (int var9 = 0; var9 < var6.length; var9++) {
					try {
						String var10 = var6[var9];
						if (var10.length() > 0 && !(new File(var10)).exists()) {
							continue;
						}
						File var11 = new File(var10 + var5[var8]);
						if (var7 == 1 && !var11.exists()) {
							boolean var12 = var11.mkdir();
							if (!var12) {
								continue;
							}
						}
						if (this.field3588 == null) {
							try {
								File var13 = new File(var11, "random.dat");
								if (var7 == 1 || var13.exists()) {
									this.field3588 = new FileOnDisk(var13, "rw", 25L);
								}
							} catch (Exception var21) {
								this.field3588 = null;
							}
						}
						if (this.field3580 == null) {
							try {
								File var14 = new File(var11, arg0);
								if (var7 == 1 && !var14.exists()) {
									boolean var15 = var14.mkdir();
									if (!var15) {
										continue;
									}
								}
								File var16 = new File(var14, "main_file_cache.dat2");
								if (var7 == 0 && !var16.exists()) {
									continue;
								}
								this.field3590 = new FileOnDisk(var16, "rw", 104857600L);
								this.field3584 = new FileOnDisk[arg3];
								for (int var17 = 0; var17 < arg3; var17++) {
									this.field3584[var17] = new FileOnDisk(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
								}
								this.field3582 = new FileOnDisk(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
								this.field3593 = this.field3580 = var14;
							} catch (Exception var20) {
								try {
									this.field3590.close();
									for (int var18 = 0; var18 < arg3; var18++) {
										this.field3584[var18].close();
									}
									this.field3582.close();
								} catch (Exception var19) {
								}
								this.field3584 = null;
								this.field3593 = this.field3580 = null;
								this.field3590 = this.field3582 = null;
							}
						}
					} catch (Exception var22) {
					}
					if (this.field3588 != null && this.field3580 != null) {
						return;
					}
				}
			}
		}
		if (this.field3580 == null) {
			throw new RuntimeException();
		}
	}
}
