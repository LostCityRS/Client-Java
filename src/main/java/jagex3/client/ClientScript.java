package jagex3.client;

import deob.ObfuscatedName;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("cc")
public final class ClientScript extends Linkable2 {

    @ObfuscatedName("f.d")
    public static LruCache field830 = new LruCache(128);
	@ObfuscatedName("j.lc")
	public static JagString field1437 = JagString.wrap("");
	@ObfuscatedName("hb.fb")
	public static JagString field1160 = JagString.wrap(")1");
	@ObfuscatedName("cc.tb")
	public int[] intOperands;

	@ObfuscatedName("cc.ub")
	public int intArgCount;

	@ObfuscatedName("cc.xb")
	public int stringArgCount;

	@ObfuscatedName("cc.yb")
	public int stringLocalCount;

	@ObfuscatedName("cc.Cb")
	public int intLocalCount;

	@ObfuscatedName("cc.Db")
	public int[] instructions;

	@ObfuscatedName("cc.Bb")
	public JagString[] stringOperands;

	@ObfuscatedName("pe.a(III)Lcc;")
	public static ClientScript get(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		ClientScript var4 = (ClientScript) field830.find(var2);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Client.scripts.getFile(field1437, JagString.join(new JagString[]{JagString.parseInt(arg1), field1160, JagString.parseInt(arg0)}));
		Packet var6 = new Packet(var5);
		ClientScript var7 = new ClientScript();
		var6.pos = var6.data.length - 12;
		int var8 = var6.g4();
		int var9 = 0;
		var7.intLocalCount = var6.g2();
		var7.stringLocalCount = var6.g2();
		var7.intArgCount = var6.g2();
		var7.stringArgCount = var6.g2();
		var7.stringOperands = new JagString[var8];
		var7.intOperands = new int[var8];
		var6.pos = 0;
		var7.instructions = new int[var8];
		while (var6.pos < var6.data.length - 12) {
			int var10 = var6.g2();
			if (var10 == 3) {
				var7.stringOperands[var9] = var6.gjstr();
			} else if (var10 >= 100 || var10 == 21 || var10 == 38 || var10 == 39) {
				var7.intOperands[var9] = var6.g1();
			} else {
				var7.intOperands[var9] = var6.g4();
			}
			var7.instructions[var9++] = var10;
		}
		field830.put(var2, var7);
		return var7;
	}
}
