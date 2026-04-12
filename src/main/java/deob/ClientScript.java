package deob;

import jagex3.client.Client;
import jagex3.datastruct.LinkList;
import jagex3.datastruct.Linkable2;
import jagex3.io.Packet;
import jagex3.util.JagString;

@ObfuscatedName("cc")
public final class ClientScript extends Linkable2 {

	@ObfuscatedName("cc.tb")
	public int[] field509;

	@ObfuscatedName("cc.ub")
	public int field510;

	@ObfuscatedName("cc.zb")
	public static LinkList field515 = new LinkList();

	@ObfuscatedName("cc.Hb")
	public static int field523 = 0;

	@ObfuscatedName("cc.Lb")
	public static int field527 = 0;

	@ObfuscatedName("cc.Jb")
	public static int field525 = 0;

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
		ClientScript var4 = (ClientScript) class31.field830.method263(var2);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Client.field2739.method215(Statics.field1437, JagString.join(new JagString[] { Statics.method502(arg1), Statics.field1160, Statics.method502(arg0) }));
		Packet var6 = new Packet(var5);
		ClientScript var7 = new ClientScript();
		var6.field267 = var6.field284.length - 12;
		int var8 = var6.method167();
		int var9 = 0;
		var7.field518 = var6.method145();
		var7.field514 = var6.method145();
		var7.field510 = var6.method145();
		var7.field513 = var6.method145();
		var7.field517 = new JagString[var8];
		var7.field509 = new int[var8];
		var6.field267 = 0;
		var7.field519 = new int[var8];
		while (var6.field267 < var6.field284.length - 12) {
			int var10 = var6.method145();
			if (var10 == 3) {
				var7.field517[var9] = var6.method140();
			} else if (var10 >= 100 || var10 == 21 || var10 == 38 || var10 == 39) {
				var7.field509[var9] = var6.method144();
			} else {
				var7.field509[var9] = var6.method167();
			}
			var7.field519[var9++] = var10;
		}
		class31.field830.method262(var2, var7);
		return var7;
	}
}
