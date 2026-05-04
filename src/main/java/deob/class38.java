package deob;

@ObfuscatedName("dd")
public final class class38 {

	@ObfuscatedName("dd.a")
	public final class123[] field673 = new class123[10];

	@ObfuscatedName("dd.b")
	public int field674;

	@ObfuscatedName("dd.c")
	public int field675;

	@ObfuscatedName("dd.a(Lnb;II)Ldd;")
	public static class38 method252(class144 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method939(arg2, arg1);
		return var3 == null ? null : new class38(new class46(var3));
	}

	public class38(class46 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method347();
			if (var3 != 0) {
				arg0.field831--;
				this.field673[var2] = new class123();
				this.field673[var2].method834(arg0);
			}
		}
		this.field674 = arg0.method301();
		this.field675 = arg0.method301();
	}

	public class38() {
	}

	@ObfuscatedName("dd.a()I")
	public int method251() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field673[var2] != null && this.field673[var2].field2236 / 20 < var1) {
				var1 = this.field673[var2].field2236 / 20;
			}
		}
		if (this.field674 < this.field675 && this.field674 / 20 < var1) {
			var1 = this.field674 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field673[var3] != null) {
				this.field673[var3].field2236 -= var1 * 20;
			}
		}
		if (this.field674 < this.field675) {
			this.field674 -= var1 * 20;
			this.field675 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("dd.b()Ltf;")
	public class213 method253() {
		byte[] var1 = this.method254();
		return new class213(22050, var1, this.field674 * 22050 / 1000, this.field675 * 22050 / 1000);
	}

	@ObfuscatedName("dd.c()[B")
	public byte[] method254() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field673[var2] != null && this.field673[var2].field2241 + this.field673[var2].field2236 > var1) {
				var1 = this.field673[var2].field2241 + this.field673[var2].field2236;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.field673[var5] != null) {
				int var6 = this.field673[var5].field2241 * 22050 / 1000;
				int var7 = this.field673[var5].field2236 * 22050 / 1000;
				int[] var8 = this.field673[var5].method833(var6, this.field673[var5].field2241);
				for (int var9 = 0; var9 < var6; var9++) {
					int var10 = var4[var9 + var7] + (var8[var9] >> 8);
					if ((var10 + 128 & 0xFFFFFF00) != 0) {
						var10 = var10 >> 31 ^ 0x7F;
					}
					var4[var9 + var7] = (byte) var10;
				}
			}
		}
		return var4;
	}
}
