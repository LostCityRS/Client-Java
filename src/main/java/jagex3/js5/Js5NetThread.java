package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.datastruct.LinkList;
import jagex3.io.DataFile;
import jagex3.util.ThreadSleep;

@ObfuscatedName("te")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("aa.d")
	public static LinkList requestQueue = new LinkList();
	@ObfuscatedName("nb.s")
	public static Object lock = new Object();
	@ObfuscatedName("v.p")
	public static int keepAlive = 0;
	@ObfuscatedName("wf.g")
	public static LinkList completed = new LinkList();

	@ObfuscatedName("me.a(IILga;Ltb;)V")
	public static void queueRequest(int arg0, Js5Loader arg1, DataFile arg2) {
		byte[] var3 = null;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			for (Js5WorkerRequest var5 = (Js5WorkerRequest) requestQueue.head(); var5 != null; var5 = (Js5WorkerRequest) requestQueue.next()) {
				if ((long) arg0 == var5.key && arg2 == var5.fs && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.readFromFile(arg0);
			arg1.loadIndex(true, var6, arg0, arg2);
		} else {
			arg1.loadIndex(true, var3, arg0, arg2);
		}
	}

	@ObfuscatedName("ie.f(I)V")
	public static void method466() {
		while (true) {
			LinkList var0 = requestQueue;
			Js5WorkerRequest var1;
			synchronized (requestQueue) {
				var1 = (Js5WorkerRequest) completed.popFront();
			}
			if (var1 == null) {
				return;
			}
			var1.field3254.loadIndex(false, var1.data, (int) var1.key, var1.fs);
		}
	}

	@ObfuscatedName("se.a(IZLtb;Lga;)V")
	public static void method1002(int arg0, DataFile arg1, Js5Loader arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.key = arg0;
		var3.field3254 = arg2;
		var3.type = 1;
		var3.fs = arg1;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method875();
	}

	@ObfuscatedName("de.a(Ltb;I[BI)V")
	public static void method190(DataFile arg0, int arg1, byte[] arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.data = arg2;
		var3.key = arg1;
		var3.fs = arg0;
		var3.type = 0;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method875();
	}

	@ObfuscatedName("ja.c(B)V")
	public static void shutdown() {
		Object var0 = lock;
		synchronized (var0) {
			if (keepAlive != 0) {
				keepAlive = 1;
				try {
					lock.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("q.c(B)V")
	public static void method875() {
		Object var0 = lock;
		synchronized (lock) {
			if (keepAlive == 0) {
				GameShell.signlink.threadreq(5, new Js5NetThread(), 112);
			}
			keepAlive = 600;
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				LinkList var1 = requestQueue;
				Js5WorkerRequest var2;
				synchronized (requestQueue) {
					var2 = (Js5WorkerRequest) requestQueue.head();
				}
				if (var2 == null) {
					ThreadSleep.sleepPrecise(100L);
					Object var6 = lock;
					synchronized (lock) {
						if (keepAlive <= 1) {
							keepAlive = 0;
							lock.notifyAll();
							return;
						}
						keepAlive--;
					}
				} else {
					if (var2.type == 0) {
						var2.fs.writeToFile((int) var2.key, var2.data.length, var2.data);
						LinkList var4 = requestQueue;
						synchronized (requestQueue) {
							var2.unlink();
						}
					} else if (var2.type == 1) {
						var2.data = var2.fs.readFromFile((int) var2.key);
						LinkList var3 = requestQueue;
						synchronized (requestQueue) {
							completed.push(var2);
						}
					}
					Object var5 = lock;
					synchronized (lock) {
						if (keepAlive <= 1) {
							keepAlive = 0;
							lock.notifyAll();
							return;
						}
						keepAlive = 600;
					}
				}
			}
		} catch (Exception var13) {
			JagException.report(null, var13);
		}
	}
}
