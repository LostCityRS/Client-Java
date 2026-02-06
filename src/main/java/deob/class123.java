package deob;

@ObfuscatedName("re")
public final class class123 {

	@ObfuscatedName("re.a")
	public int field2879;

	@ObfuscatedName("re.b")
	public int field2880;

	@ObfuscatedName("re.c")
	public final class24[] field2881 = new class24[10];

	@ObfuscatedName("re.a(Lea;II)Lre;")
	public static class123 method972(class30 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method206(arg1, arg2);
		return var3 == null ? null : new class123(new class66(var3));
	}

	public class123(class66 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method532();
			if (var3 != 0) {
				arg0.field1568--;
				this.field2881[var2] = new class24();
				this.field2881[var2].method169(arg0);
			}
		}
		this.field2879 = arg0.method531();
		this.field2880 = arg0.method531();
	}

	public class123() {
	}

	@ObfuscatedName("re.a()I")
	public int method969() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field2881[var2] != null && this.field2881[var2].field434 / 20 < var1) {
				var1 = this.field2881[var2].field434 / 20;
			}
		}
		if (this.field2879 < this.field2880 && this.field2879 / 20 < var1) {
			var1 = this.field2879 / 20;
		}
		if (var1 == 9999999 || var1 == 0) {
			return 0;
		}
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field2881[var3] != null) {
				this.field2881[var3].field434 -= var1 * 20;
			}
		}
		if (this.field2879 < this.field2880) {
			this.field2879 -= var1 * 20;
			this.field2880 -= var1 * 20;
		}
		return var1;
	}

	@ObfuscatedName("re.b()[B")
	public byte[] method970() {
		int var1 = 0;
		for (int var2 = 0; var2 < 10; var2++) {
			if (this.field2881[var2] != null && this.field2881[var2].field447 + this.field2881[var2].field434 > var1) {
				var1 = this.field2881[var2].field447 + this.field2881[var2].field434;
			}
		}
		if (var1 == 0) {
			return new byte[0];
		}
		int var3 = var1 * 22050 / 1000;
		byte[] var4 = new byte[var3];
		for (int var5 = 0; var5 < 10; var5++) {
			if (this.field2881[var5] != null) {
				int var6 = this.field2881[var5].field447 * 22050 / 1000;
				int var7 = this.field2881[var5].field434 * 22050 / 1000;
				int[] var8 = this.field2881[var5].method170(var6, this.field2881[var5].field447);
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

	@ObfuscatedName("re.c()Lib;")
	public class58 method971() {
		byte[] var1 = this.method970();
		return new class58(22050, var1, this.field2879 * 22050 / 1000, this.field2880 * 22050 / 1000);
	}
}
