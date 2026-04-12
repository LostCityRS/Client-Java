package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.datastruct.LinkList;
import jagex3.io.DataFile;

@ObfuscatedName("oe")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("i.a(I)V")
	public static void method500() {
		Object var0 = Statics.field213;
		synchronized (Statics.field213) {
			if (Statics.field307 == 0) {
				GameShell.signlink.method656(5, new Js5NetThread());
			}
			Statics.field307 = 600;
		}
	}

	@ObfuscatedName("ha.a([BBLsa;I)V")
	public static void method464(byte[] arg0, DataFile arg1, int arg2) {
		Js5WorkerRequest var3 = new Js5WorkerRequest();
		var3.field2073 = arg2;
		var3.field1454 = arg0;
		var3.field1464 = 0;
		var3.field1469 = arg1;
		LinkList var4 = Statics.field1547;
		synchronized (Statics.field1547) {
			Statics.field1547.method804(var3);
		}
		method500();
	}

	@Override
	public void run() {
		try {
			while (true) {
				LinkList var1 = Statics.field1547;
				Js5WorkerRequest var2;
				synchronized (Statics.field1547) {
					var2 = (Js5WorkerRequest) Statics.field1547.method802();
				}
				if (var2 == null) {
					Statics.sleepPrecise(100L);
					Object var3 = Statics.field213;
					synchronized (Statics.field213) {
						if (Statics.field307 <= 1) {
							Statics.field307 = 0;
							Statics.field213.notifyAll();
							return;
						}
						Statics.field307--;
					}
				} else {
					if (var2.field1464 == 0) {
						var2.field1469.method908(var2.field1454, var2.field1454.length, (int) var2.field2073);
						LinkList var5 = Statics.field1547;
						synchronized (Statics.field1547) {
							var2.unlink();
						}
					} else if (var2.field1464 == 1) {
						var2.field1454 = var2.field1469.method906((int) var2.field2073);
						LinkList var4 = Statics.field1547;
						synchronized (Statics.field1547) {
							Statics.field2371.method804(var2);
						}
					}
					Object var6 = Statics.field213;
					synchronized (Statics.field213) {
						if (Statics.field307 <= 1) {
							Statics.field307 = 0;
							Statics.field213.notifyAll();
							return;
						}
						Statics.field307 = 600;
					}
				}
			}
		} catch (Exception var13) {
			JagException.report(null, var13);
		}
	}
}
