package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("ud")
public final class ClientScript extends Linkable2 {

	@ObfuscatedName("ha.s")
	public static LruCache cache = new LruCache(128);

	@ObfuscatedName("ud.I")
	public int intLocalCount;

	@ObfuscatedName("ud.M")
	public int stringArgCount;

	@ObfuscatedName("ud.N")
	public int stringLocalCount;

	@ObfuscatedName("ud.Q")
	public int intArgCount;

	@ObfuscatedName("ud.K")
	public JagString name;

	@ObfuscatedName("ud.O")
	public int[] instructions;

	@ObfuscatedName("ud.U")
	public int[] intOperands;

	@ObfuscatedName("ud.R")
	public JagString[] stringOperands;

	@ObfuscatedName("ec.b(ZI)Lud;")
	public static ClientScript get(int arg0) {
		ClientScript var1 = (ClientScript) cache.find((long) arg0);
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
		var3.intLocalCount = var4.g2();
		var3.stringLocalCount = var4.g2();
		var3.intArgCount = var4.g2();
		var3.stringArgCount = var4.g2();
		var4.pos = 0;
		var3.name = var4.fastgstr();
		var3.instructions = new int[var6];
		var3.stringOperands = new JagString[var6];
		var3.intOperands = new int[var6];
		while (var4.data.length - 12 > var4.pos) {
			int var7 = var4.g2();
			if (var7 == 3) {
				var3.stringOperands[var5] = var4.gjstr();
			} else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
				var3.intOperands[var5] = var4.g1();
			} else {
				var3.intOperands[var5] = var4.g4();
			}
			var3.instructions[var5++] = var7;
		}
		cache.put((long) arg0, var3);
		return var3;
	}
}
