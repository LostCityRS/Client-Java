package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("ud")
public final class ClientScript extends Linkable2 {

	@ObfuscatedName("ha.s")
	public static LruCache field1146 = new LruCache(128);

	@ObfuscatedName("ud.I")
	public int field3259;

	@ObfuscatedName("ud.M")
	public int field3263;

	@ObfuscatedName("ud.N")
	public int field3264;

	@ObfuscatedName("ud.Q")
	public int field3267;

	@ObfuscatedName("ud.K")
	public JagString field3261;

	@ObfuscatedName("ud.O")
	public int[] field3265;

	@ObfuscatedName("ud.U")
	public int[] field3270;

	@ObfuscatedName("ud.R")
	public JagString[] field3268;

	@ObfuscatedName("ec.b(ZI)Lud;")
	public static ClientScript method276(int arg0) {
		ClientScript var1 = (ClientScript) field1146.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Client.scripts.getFile(arg0, 0);
		if (var2 == null) {
			return null;
		}
		ClientScript var3 = new ClientScript();
		Packet var4 = new Packet(var2);
		int var5 = 0;
		var4.pos = var4.data.length - 12;
		int var6 = var4.g4();
		var3.field3259 = var4.g2();
		var3.field3264 = var4.g2();
		var3.field3267 = var4.g2();
		var3.field3263 = var4.g2();
		var4.pos = 0;
		var3.field3261 = var4.method507();
		var3.field3265 = new int[var6];
		var3.field3268 = new JagString[var6];
		var3.field3270 = new int[var6];
		while (var4.data.length - 12 > var4.pos) {
			int var7 = var4.g2();
			if (var7 == 3) {
				var3.field3268[var5] = var4.method555();
			} else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
				var3.field3270[var5] = var4.g1();
			} else {
				var3.field3270[var5] = var4.g4();
			}
			var3.field3265[var5++] = var7;
		}
		field1146.put((long) arg0, var3);
		return var3;
	}
}
