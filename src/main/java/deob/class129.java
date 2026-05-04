package deob;

@ObfuscatedName("li")
public final class class129 extends Linkable2 {

	@ObfuscatedName("li.L")
	public final class197[] field2421;

	public class129(Js5 arg0, Js5 arg1, int arg2, boolean arg3) {
		LinkList var5 = new LinkList();
		int var6 = arg0.getFileIdLimit(arg2);
		this.field2421 = new class197[var6];
		int[] var7 = arg0.method948(arg2);
		for (int var8 = 0; var8 < var7.length; var8++) {
			byte[] var9 = arg0.getFile(var7[var8], arg2);
			int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
			class78 var11 = null;
			for (class78 var12 = (class78) var5.head(); var12 != null; var12 = (class78) var5.method1619()) {
				if (var10 == var12.field1412) {
					var11 = var12;
					break;
				}
			}
			if (var11 == null) {
				byte[] var13 = arg1.method947(0, var10);
				var11 = new class78(var10, var13);
				var5.push(var11);
			}
			this.field2421[var7[var8]] = new class197(var9, var11);
		}
	}

	@ObfuscatedName("li.a(ZI)Z")
	public boolean method875(int arg0) {
		return this.field2421[arg0].field3777;
	}
}
