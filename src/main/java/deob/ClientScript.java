package deob;

@ObfuscatedName("wh")
public final class ClientScript extends Linkable2 {

	@ObfuscatedName("cj.gb")
	public static final LruCache cache = new LruCache(128);

	@ObfuscatedName("wh.K")
	public int field4517;

	@ObfuscatedName("wh.L")
	public int field4518;

	@ObfuscatedName("wh.O")
	public int field4520;

	@ObfuscatedName("wh.U")
	public int field4526;

	@ObfuscatedName("wh.Y")
	public JagString field4530;

	@ObfuscatedName("wh.N")
	public int[] field4519;

	@ObfuscatedName("wh.P")
	public int[] field4521;

	@ObfuscatedName("wh.G")
	public HashTable[] field4514;

	@ObfuscatedName("wh.Q")
	public JagString[] field4522;

	@ObfuscatedName("fc.b(II)Lwh;")
	public static ClientScript method427(int arg0) {
		ClientScript var1 = (ClientScript) cache.method665((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = client.scripts.getFile(0, arg0);
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
		var3.field4526 = var4.g2();
		var3.field4517 = var4.g2();
		var3.field4520 = var4.g2();
		var3.field4518 = var4.g2();
		int var8 = var4.g1();
		if (var8 > 0) {
			var3.field4514 = new HashTable[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = var4.g2();
				HashTable var11 = new HashTable(Statics.bitceil(var10));
				var3.field4514[var9] = var11;
				while (var10-- > 0) {
					int var12 = var4.g4();
					int var13 = var4.g4();
					var11.put((long) var12, new IntNode(var13));
				}
			}
		}
		int var14 = 0;
		var4.pos = 0;
		var3.field4530 = var4.method353();
		var3.field4522 = new JagString[var7];
		var3.field4519 = new int[var7];
		var3.field4521 = new int[var7];
		while (var6 > var4.pos) {
			int var15 = var4.g2();
			if (var15 == 3) {
				var3.field4522[var14] = var4.gjstr();
			} else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
				var3.field4521[var14] = var4.g1();
			} else {
				var3.field4521[var14] = var4.g4();
			}
			var3.field4519[var14++] = var15;
		}
		cache.method663((long) arg0, var3);
		return var3;
	}
}
