package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.HashTable;
import jagex3.datastruct.IntNode;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.jstring.JagString;
import jagex3.util.IntUtil;

@ObfuscatedName("wh")
public final class ClientScript extends Linkable2 {

	@ObfuscatedName("cj.gb")
	public static final LruCache cache = new LruCache(128);

	@ObfuscatedName("wh.K")
	public int stringLocalCount;

	@ObfuscatedName("wh.L")
	public int stringArgCount;

	@ObfuscatedName("wh.O")
	public int intArgCount;

	@ObfuscatedName("wh.U")
	public int intLocalCount;

	@ObfuscatedName("wh.Y")
	public JagString name;

	@ObfuscatedName("wh.N")
	public int[] instructions;

	@ObfuscatedName("wh.P")
	public int[] intOperands;

	@ObfuscatedName("wh.G")
	public HashTable[] switchTables;

	@ObfuscatedName("wh.Q")
	public JagString[] stringOperands;

	@ObfuscatedName("fc.b(II)Lwh;")
	public static ClientScript get(int arg0) {
		ClientScript var1 = (ClientScript) cache.find((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Client.scripts.getFile(0, arg0);
		if (var2 == null) {
			return null;
		}
		ClientScript var3 = new ClientScript();
		Packet var4 = new Packet(var2);
		var4.pos = var4.data.length - 2;
		int var5 = var4.g2();
		int var6 = var4.data.length - var5 - 2 - 12;
		var4.pos = var6;
		int var7 = var4.g4();
		var3.intLocalCount = var4.g2();
		var3.stringLocalCount = var4.g2();
		var3.intArgCount = var4.g2();
		var3.stringArgCount = var4.g2();
		int var8 = var4.g1();
		if (var8 > 0) {
			var3.switchTables = new HashTable[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = var4.g2();
				HashTable var11 = new HashTable(IntUtil.bitceil(var10));
				var3.switchTables[var9] = var11;
				while (var10-- > 0) {
					int var12 = var4.g4();
					int var13 = var4.g4();
					var11.put((long) var12, new IntNode(var13));
				}
			}
		}
		int var14 = 0;
		var4.pos = 0;
		var3.name = var4.method353();
		var3.stringOperands = new JagString[var7];
		var3.instructions = new int[var7];
		var3.intOperands = new int[var7];
		while (var6 > var4.pos) {
			int var15 = var4.g2();
			if (var15 == 3) {
				var3.stringOperands[var14] = var4.gjstr();
			} else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
				var3.intOperands[var14] = var4.g1();
			} else {
				var3.intOperands[var14] = var4.g4();
			}
			var3.instructions[var14++] = var15;
		}
		cache.put((long) arg0, var3);
		return var3;
	}
}
