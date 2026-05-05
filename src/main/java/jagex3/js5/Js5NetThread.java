package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.datastruct.LinkList;
import jagex3.io.DataFile;
import jagex3.util.ThreadSleep;

@ObfuscatedName("ch")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("ui.F")
	public static final LinkList requestQueue = new LinkList();
	@ObfuscatedName("cj.K")
	public static final Object lock = new Object();
	@ObfuscatedName("m.s")
	public static final LinkList completed = new LinkList();
	@ObfuscatedName("ug.n")
	public static int keepAlive = 0;

	@ObfuscatedName("vg.a(I)V")
	public static void shutdown() {
		Object var0 = lock;
		synchronized (lock) {
			if (keepAlive != 0) {
				keepAlive = 1;
				try {
					lock.wait();
				} catch (InterruptedException var1) {
				}
			}
		}
	}

	@ObfuscatedName("e.g(I)V")
	public static void method293() {
		while (true) {
			LinkList var0 = requestQueue;
			Js5WorkerRequest var1;
			synchronized (requestQueue) {
				var1 = (Js5WorkerRequest) completed.popFront();
			}
			if (var1 == null) {
				return;
			}
			var1.field1702.loadIndex(var1.data, (int) var1.key, var1.fs, false);
		}
	}

	@ObfuscatedName("db.a([BZILud;)V")
	public static void method244(byte[] arg0, int arg1, DataFile arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.fs = arg2;
		var3.data = arg0;
		var3.type = 0;
		var3.key = arg1;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method977();
	}

	@ObfuscatedName("nd.a(B)V")
	public static void method977() {
		Object var0 = lock;
		synchronized (lock) {
			if (keepAlive == 0) {
				GameShell.signlink.threadreq(new Js5NetThread(), 5);
			}
			keepAlive = 600;
		}
	}

	@ObfuscatedName("lb.a(IILbj;Lud;)V")
	public static void method828(int arg0, Js5Loader arg1, DataFile arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field1702 = arg1;
		var3.key = arg0;
		var3.type = 1;
		var3.fs = arg2;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method977();
	}

	@ObfuscatedName("hd.a(Lbj;IILud;)V")
	public static void queueRequest(Js5Loader arg0, int arg1, DataFile arg2) {
		byte[] var3 = null;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			for (Js5WorkerRequest var5 = (Js5WorkerRequest) requestQueue.head(); var5 != null; var5 = (Js5WorkerRequest) requestQueue.next()) {
				if (var5.key == (long) arg1 && arg2 == var5.fs && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.readFromFile(arg1);
			arg0.loadIndex(var6, arg1, arg2, true);
		} else {
			arg0.loadIndex(var3, arg1, arg2, true);
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
						var2.fs.writeToFile(var2.data, (int) var2.key, var2.data.length);
						LinkList var3 = requestQueue;
						synchronized (requestQueue) {
							var2.unlink();
						}
					} else if (var2.type == 1) {
						var2.data = var2.fs.readFromFile((int) var2.key);
						LinkList var4 = requestQueue;
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
