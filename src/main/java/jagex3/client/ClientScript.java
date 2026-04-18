package jagex3.client;

import deob.ObfuscatedName;
import deob.Statics;
import jagex3.datastruct.Linkable2;
import jagex3.datastruct.LruCache;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("cc")
public final class ClientScript extends Linkable2 {

    @ObfuscatedName("f.d")
    public static LruCache field830 = new LruCache(128);
    @ObfuscatedName("cc.tb")
	public int[] field509;

	@ObfuscatedName("cc.ub")
	public int field510;

	@ObfuscatedName("cc.xb")
	public int field513;

	@ObfuscatedName("cc.yb")
	public int field514;

	@ObfuscatedName("cc.Cb")
	public int field518;

	@ObfuscatedName("cc.Db")
	public int[] field519;

	@ObfuscatedName("cc.Bb")
	public JagString[] field517;

	@ObfuscatedName("pe.a(III)Lcc;")
	public static ClientScript method824(int arg0, int arg1) {
		long var2 = (long) ((arg1 << 16) + arg0);
		ClientScript var4 = (ClientScript) field830.find(var2);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Client.scripts.method215(Statics.field1437, JagString.join(new JagString[]{Statics.method502(arg1), Statics.field1160, Statics.method502(arg0)}));
		Packet var6 = new Packet(var5);
		ClientScript var7 = new ClientScript();
		var6.pos = var6.data.length - 12;
		int var8 = var6.method167();
		int var9 = 0;
		var7.field518 = var6.g2();
		var7.field514 = var6.g2();
		var7.field510 = var6.g2();
		var7.field513 = var6.g2();
		var7.field517 = new JagString[var8];
		var7.field509 = new int[var8];
		var6.pos = 0;
		var7.field519 = new int[var8];
		while (var6.pos < var6.data.length - 12) {
			int var10 = var6.g2();
			if (var10 == 3) {
				var7.field517[var9] = var6.gjstr();
			} else if (var10 >= 100 || var10 == 21 || var10 == 38 || var10 == 39) {
				var7.field509[var9] = var6.g1();
			} else {
				var7.field509[var9] = var6.method167();
			}
			var7.field519[var9++] = var10;
		}
		field830.put(var2, var7);
		return var7;
	}
}
