package jagex3.js5;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.config.IdkType;
import jagex3.dash3d.CollisionMap;
import jagex3.datastruct.LinkList;
import jagex3.io.Packet;

@ObfuscatedName("oe")
public final class Js5NetThread implements Runnable {

	@ObfuscatedName("oe.g")
	public static int field2175 = 0;

	@ObfuscatedName("oe.k")
	public static byte[][] field2179 = new byte[250][];

	@ObfuscatedName("oe.l")
	public static int field2180 = 256;

	@ObfuscatedName("oe.n")
	public static int field2182 = 0;

	@ObfuscatedName("oe.t")
	public static int field2188 = -1;

	@ObfuscatedName("oe.u")
	public static int field2189 = 0;

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
					Object var3 = CollisionMap.field213;
					synchronized (CollisionMap.field213) {
						if (Packet.field307 <= 1) {
							Packet.field307 = 0;
							CollisionMap.field213.notifyAll();
							return;
						}
						Packet.field307--;
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
							IdkType.field2371.method804(var2);
						}
					}
					Object var6 = CollisionMap.field213;
					synchronized (CollisionMap.field213) {
						if (Packet.field307 <= 1) {
							Packet.field307 = 0;
							CollisionMap.field213.notifyAll();
							return;
						}
						Packet.field307 = 600;
					}
				}
			}
		} catch (Exception var13) {
			Statics.method214(null, var13);
		}
	}
}
