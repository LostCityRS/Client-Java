package deob;

import java.applet.Applet;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("lc")
public final class class69 implements Runnable {

	@ObfuscatedName("lc.a")
	public String field1699 = null;

	@ObfuscatedName("lc.b")
	public boolean field1700 = false;

	@ObfuscatedName("lc.c")
	public int field1701 = 0;

	@ObfuscatedName("lc.d")
	public class96[] field1702;

	@ObfuscatedName("lc.f")
	public class29 field1704 = null;

	@ObfuscatedName("lc.h")
	public class21 field1706;

	@ObfuscatedName("lc.i")
	public class96 field1707 = null;

	@ObfuscatedName("lc.k")
	public final InetAddress field1709;

	@ObfuscatedName("lc.l")
	public class29 field1710 = null;

	@ObfuscatedName("lc.m")
	public class71 field1711;

	@ObfuscatedName("lc.n")
	public final Thread field1712;

	@ObfuscatedName("lc.o")
	public String field1713 = null;

	@ObfuscatedName("lc.q")
	public class96 field1715 = null;

	@ObfuscatedName("lc.r")
	public static final int field1716 = 3;

	@ObfuscatedName("lc.s")
	public String field1717 = null;

	@ObfuscatedName("lc.u")
	public Applet field1719 = null;

	@ObfuscatedName("lc.v")
	public String field1720 = null;

	@ObfuscatedName("lc.a(I)V")
	public void method647() {
		synchronized (this) {
			this.field1700 = true;
			this.notifyAll();
		}
		try {
			this.field1712.join();
		} catch (InterruptedException var6) {
		}
		if (this.field1706 != null) {
			this.field1706.method309();
		}
		if (this.field1715 != null) {
			try {
				this.field1715.method831();
			} catch (IOException var5) {
			}
		}
		if (this.field1707 != null) {
			try {
				this.field1707.method831();
			} catch (IOException var4) {
			}
		}
		if (this.field1702 == null) {
			return;
		}
		for (int var2 = 0; var2 < this.field1702.length; var2++) {
			if (this.field1702[var2] != null) {
				try {
					this.field1702[var2].method831();
				} catch (IOException var3) {
				}
			}
		}
	}

	@ObfuscatedName("lc.a([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Led;")
	public class29 method648(Class[] arg0, String arg1, Class arg2) {
		return this.method651(0, 9, new Object[] { arg2, arg1, arg0 });
	}

	@ObfuscatedName("lc.b(I)Lle;")
	public class71 method649() {
		return this.field1711;
	}

	@ObfuscatedName("lc.a(ZLjava/net/URL;)Led;")
	public class29 method650(URL arg0) {
		return this.method651(0, 4, arg0);
	}

	@ObfuscatedName("lc.a(IIIILjava/lang/Object;)Led;")
	public class29 method651(int arg0, int arg1, Object arg2) {
		class29 var4 = new class29();
		var4.field816 = arg2;
		var4.field813 = arg0;
		var4.field814 = arg1;
		synchronized (this) {
			if (this.field1710 == null) {
				this.field1710 = this.field1704 = var4;
			} else {
				this.field1710.field817 = var4;
				this.field1710 = var4;
			}
			this.notify();
			return var4;
		}
	}

	public class69(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
		this.field1719 = arg1;
		this.field1709 = arg2;
		Statics.field1718 = "1.1";
		Statics.field1714 = "Unknown";
		try {
			Statics.field1714 = System.getProperty("java.vendor");
			Statics.field1718 = System.getProperty("java.version");
			Statics.field1705 = System.getProperty("user.home");
			if (Statics.field1705 != null) {
				Statics.field1705 = Statics.field1705 + "/";
			}
		} catch (Exception var9) {
		}
		try {
			if (arg1 == null) {
				Statics.field1708 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				Statics.field1708 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception var8) {
		}
		try {
			if (arg1 == null) {
				Statics.field1703 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				Statics.field1703 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception var7) {
		}
		this.field1700 = false;
		this.field1712 = new Thread(this);
		this.field1712.setPriority(10);
		this.field1712.setDaemon(true);
		this.field1712.start();
	}

	@ObfuscatedName("lc.c(I)V")
	public void method652(int arg0) {
		try {
			File var2 = new File(this.field1717 + "uid.dat");
			if (!var2.exists() || var2.length() < 4L) {
				DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field1717 + "uid.dat"));
				var3.writeInt((int) (Math.random() * 9.9999999E7D));
				var3.close();
			}
		} catch (Exception var6) {
		}
		if (arg0 != 6) {
			this.field1701 = 116;
		}
		try {
			DataInputStream var4 = new DataInputStream(new FileInputStream(this.field1717 + "uid.dat"));
			this.field1701 = var4.readInt() + 1;
			var4.close();
		} catch (Exception var5) {
		}
	}

	@ObfuscatedName("lc.d(I)Ldb;")
	public class21 method653() {
		return this.field1706;
	}

	@Override
	public void run() {
		while (true) {
			class29 var2;
			synchronized (this) {
				while (true) {
					if (this.field1700) {
						return;
					}
					if (this.field1704 != null) {
						var2 = this.field1704;
						this.field1704 = this.field1704.field817;
						if (this.field1704 == null) {
							this.field1710 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}
			try {
				int var3 = var2.field814;
				if (var3 == 1) {
					var2.field818 = new Socket(this.field1709, var2.field813);
				} else if (var3 == 2) {
					Thread var6 = new Thread((Runnable) var2.field816);
					var6.setDaemon(true);
					var6.start();
					var6.setPriority(var2.field813);
					var2.field818 = var6;
				} else if (var3 == 4) {
					var2.field818 = new DataInputStream(((URL) var2.field816).openStream());
				} else if (var3 == 9) {
					Object[] var4 = (Object[]) var2.field816;
					var2.field818 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
				} else if (var3 == 10) {
					Object[] var5 = (Object[]) var2.field816;
					var2.field818 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
				} else {
					throw new Exception();
				}
				var2.field815 = 1;
			} catch (Exception var7) {
				var2.field815 = 2;
			}
		}
	}

	@ObfuscatedName("lc.a(Ljava/lang/Class;Ljava/lang/String;Z)Led;")
	public class29 method654(Class arg0, String arg1) {
		return this.method651(0, 10, new Object[] { arg0, arg1 });
	}

	@ObfuscatedName("lc.a(II)Led;")
	public class29 method655(int arg0) {
		return this.method651(arg0, 3, null);
	}

	@ObfuscatedName("lc.a(IILjava/lang/Runnable;)Led;")
	public class29 method656(int arg0, Runnable arg1) {
		return this.method651(arg0, 2, arg1);
	}

	@ObfuscatedName("lc.b(II)Led;")
	public class29 method657(int arg0) {
		return this.method651(arg0, 1, null);
	}

	@ObfuscatedName("lc.e(I)Led;")
	public class29 method658() {
		return null;
	}

	@ObfuscatedName("lc.a(IILjava/lang/String;)V")
	public void method659(int arg0, int arg1, String arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		if (Statics.field1705 == null) {
			Statics.field1705 = "~/";
		}
		String var4 = ".file_store_" + arg1;
		String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", Statics.field1705, "/tmp/", "" };
		if (arg0 != -3849) {
			this.method654(null, null);
		}
		for (int var6 = 0; var6 < var5.length; var6++) {
			try {
				String var7 = var5[var6];
				if (var7.length() > 0) {
					File var8 = new File(var7);
					if (!var8.exists()) {
						continue;
					}
				}
				File var9 = new File(var7 + var4);
				if (var9.exists() || var9.mkdir()) {
					if (arg2.length() > 0) {
						var9 = new File(var9, arg2);
						if (!var9.exists() && !var9.mkdir()) {
							continue;
						}
					}
					this.field1720 = this.field1717 = var9.getParent() + "/";
					this.field1699 = this.field1713 = var9.getPath() + "/";
					return;
				}
			} catch (Exception var10) {
			}
		}
		throw new RuntimeException();
	}
}
