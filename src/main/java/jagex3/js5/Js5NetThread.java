package jagex3.js5;

import deob.ObfuscatedName;
import jagex3.callstack.JagException;
import jagex3.datastruct.LinkList;
import jagex3.io.DataFile;
import jagex3.util.ThreadSleep;

@ObfuscatedName("te")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("aa.d")
	public static LinkList field18 = new LinkList();
	@ObfuscatedName("nb.s")
	public static Object lock = new Object();
	@ObfuscatedName("v.p")
	public static int keepAlive = 0;
	@ObfuscatedName("wf.g")
	public static LinkList field3649 = new LinkList();

	@ObfuscatedName("me.a(IILga;Ltb;)V")
	public static void queueRequest(int arg0, Js5Loader arg1, DataFile arg2) {
		byte[] var3 = null;
		LinkList var4 = field18;
		synchronized (field18) {
			for (Js5WorkerRequest var5 = (Js5WorkerRequest) field18.method1211(); var5 != null; var5 = (Js5WorkerRequest) field18.method1209()) {
				if ((long) arg0 == var5.field3324 && arg2 == var5.field3245 && var5.field3243 == 0) {
					var3 = var5.field3249;
					break;
				}
			}
		}
		if (var3 == null) {
			byte[] var6 = arg2.method1024(arg0);
			arg1.method340(true, var6, arg0, arg2);
		} else {
			arg1.method340(true, var3, arg0, arg2);
		}
	}

	@ObfuscatedName("ie.f(I)V")
	public static void method466() {
		while (true) {
			LinkList var0 = field18;
			Js5WorkerRequest var1;
			synchronized (field18) {
				var1 = (Js5WorkerRequest) field3649.method1215();
			}
			if (var1 == null) {
				return;
			}
			var1.field3254.method340(false, var1.field3249, (int) var1.field3324, var1.field3245);
		}
	}

	@ObfuscatedName("se.a(IZLtb;Lga;)V")
	public static void method1002(int arg0, DataFile arg1, Js5Loader arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field3324 = arg0;
		var3.field3254 = arg2;
		var3.field3243 = 1;
		var3.field3245 = arg1;
		LinkList var4 = field18;
		synchronized (field18) {
			field18.method1214(var3);
		}
		Js5Net.method875();
	}

	@ObfuscatedName("j.a(IIB)I")
	public static int method478(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		return Js5Net.field3372 != null && var2 == Js5Net.field3372.field3324 ? Js5Net.field2529.pos * 99 / (Js5Net.field2529.data.length - Js5Net.field3372.field2587) + 1 : 0;
	}

	@ObfuscatedName("de.a(Ltb;I[BI)V")
	public static void method190(DataFile arg0, int arg1, byte[] arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field3249 = arg2;
		var3.field3324 = arg1;
		var3.field3245 = arg0;
		var3.field3243 = 0;
		LinkList var4 = field18;
		synchronized (field18) {
			field18.method1214(var3);
		}
		Js5Net.method875();
	}

	@Override
	public void run() {
		try {
			while (true) {
				LinkList var1 = field18;
				Js5WorkerRequest var2;
				synchronized (field18) {
					var2 = (Js5WorkerRequest) field18.method1211();
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
					if (var2.field3243 == 0) {
						var2.field3245.method1026((int) var2.field3324, var2.field3249.length, var2.field3249);
						LinkList var4 = field18;
						synchronized (field18) {
							var2.unlink();
						}
					} else if (var2.field3243 == 1) {
						var2.field3249 = var2.field3245.method1024((int) var2.field3324);
						LinkList var3 = field18;
						synchronized (field18) {
							field3649.method1214(var2);
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
			JagException.report(var13, null);
		}
	}
}
