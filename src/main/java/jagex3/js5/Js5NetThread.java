package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.callstack.JagException;
import jagex3.client.GameShell;
import jagex3.datastruct.LinkList;

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
							var2.method739();
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
