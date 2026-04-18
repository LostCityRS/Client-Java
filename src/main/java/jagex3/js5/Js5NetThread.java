package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.datastruct.LinkList;
import jagex3.io.DataFile;
import jagex3.util.ThreadUtil;

@ObfuscatedName("oe")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("ad.z")
	public static Object lock = new Object();
	@ObfuscatedName("ba.lc")
	public static int keepAlive = 0;
	@ObfuscatedName("kb.g")
	public static LinkList requestQueue = new LinkList();

	@ObfuscatedName("i.a(I)V")
	public static void method500() {
		Object var0 = lock;
		synchronized (lock) {
			if (keepAlive == 0) {
				GameShell.signlink.threadreq(5, new Js5NetThread());
			}
			keepAlive = 600;
		}
	}

	@ObfuscatedName("ha.a([BBLsa;I)V")
	public static void method464(byte[] arg0, DataFile arg1, int arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.key = arg2;
		var3.data = arg0;
		var3.type = 0;
		var3.fs = arg1;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method500();
	}

    @ObfuscatedName("ia.a(Lu;ILsa;B)V")
    public static void queueRequest(Js5Loader arg0, int arg1, DataFile arg2) {
        byte[] var3 = null;
        LinkList var4 = requestQueue;
        synchronized (requestQueue) {
            for (Js5WorkerRequest var5 = (Js5WorkerRequest) requestQueue.head(); var5 != null; var5 = (Js5WorkerRequest) requestQueue.next()) {
                if ((long) arg1 == var5.key && var5.fs == arg2 && var5.type == 0) {
                    var3 = var5.data;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var6 = arg2.readFromFile(arg1);
            arg0.loadIndex(true, var6, arg1, arg2);
        } else {
            arg0.loadIndex(true, var3, arg1, arg2);
        }
    }

	@ObfuscatedName("fe.a(ILu;Lsa;B)V")
	public static void method410(int arg0, Js5Loader arg1, DataFile arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.type = 1;
		var3.key = arg0;
		var3.fs = arg2;
		var3.field1456 = arg1;
		LinkList var4 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.push(var3);
		}
		method500();
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
					ThreadUtil.sleepPrecise(100L);
					Object var3 = lock;
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
						var2.fs.writeToFile(var2.data, var2.data.length, (int) var2.key);
						LinkList var5 = requestQueue;
						synchronized (requestQueue) {
							var2.unlink();
						}
					} else if (var2.type == 1) {
						var2.data = var2.fs.readFromFile((int) var2.key);
						LinkList var4 = requestQueue;
						synchronized (requestQueue) {
							Statics.field2371.push(var2);
						}
					}
					Object var6 = lock;
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
