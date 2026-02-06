package deob;

@ObfuscatedName("rb")
public final class class120 {

	@ObfuscatedName("rb.a")
	public static byte[] field2854 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("rb.b")
	public final class66 field2855 = new class66(null);

	@ObfuscatedName("rb.c")
	public long field2856;

	@ObfuscatedName("rb.d")
	public int[] field2857;

	@ObfuscatedName("rb.e")
	public int field2858;

	@ObfuscatedName("rb.f")
	public int[] field2859;

	@ObfuscatedName("rb.g")
	public int[] field2860;

	@ObfuscatedName("rb.h")
	public int field2861;

	@ObfuscatedName("rb.i")
	public int[] field2862;

	public class120() {
	}

	public class120(byte[] arg0) {
		this.method952(arg0);
	}

	@ObfuscatedName("rb.a(I)I")
	public int method939(int arg0) {
		byte var2 = this.field2855.field1586[this.field2855.field1568];
		int var3;
		if (var2 < 0) {
			var3 = var2 & 0xFF;
			this.field2857[arg0] = var3;
			this.field2855.field1568++;
		} else {
			var3 = this.field2857[arg0];
		}
		if (var3 != 240 && var3 != 247) {
			return this.method941(arg0, var3);
		}
		int var4 = this.field2855.method510();
		if (var3 == 247 && var4 > 0) {
			int var5 = this.field2855.field1586[this.field2855.field1568] & 0xFF;
			if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
				this.field2855.field1568++;
				this.field2857[arg0] = var5;
				return this.method941(arg0, var5);
			}
		}
		this.field2855.field1568 += var4;
		return 0;
	}

	@ObfuscatedName("rb.b(I)V")
	public void method940(int arg0) {
		this.field2859[arg0] = this.field2855.field1568;
	}

	@ObfuscatedName("rb.a(II)I")
	public int method941(int arg0, int arg1) {
		if (arg1 != 255) {
			byte var7 = field2854[arg1 - 128];
			int var8 = arg1;
			if (var7 >= 1) {
				var8 = arg1 | this.field2855.method532() << 8;
			}
			if (var7 >= 2) {
				var8 |= this.field2855.method532() << 16;
			}
			return var8;
		}
		int var3 = this.field2855.method532();
		int var4 = this.field2855.method510();
		if (var3 == 47) {
			this.field2855.field1568 += var4;
			return 1;
		} else if (var3 == 81) {
			int var5 = this.field2855.method517();
			var4 -= 3;
			int var6 = this.field2862[arg0];
			this.field2856 += (long) var6 * (long) (this.field2858 - var5);
			this.field2858 = var5;
			this.field2855.field1568 += var4;
			return 2;
		} else {
			this.field2855.field1568 += var4;
			return 3;
		}
	}

	@ObfuscatedName("rb.a()Z")
	public boolean method942() {
		return this.field2855.field1586 != null;
	}

	@ObfuscatedName("rb.c()V")
	public void method944() {
		this.field2855.field1586 = null;
		this.field2860 = null;
		this.field2859 = null;
		this.field2862 = null;
		this.field2857 = null;
	}

	@ObfuscatedName("rb.d()Z")
	public boolean method945() {
		int var1 = this.field2859.length;
		for (int var2 = 0; var2 < var1; var2++) {
			if (this.field2859[var2] >= 0) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("rb.e()I")
	public int method946() {
		return this.field2859.length;
	}

	@ObfuscatedName("rb.c(I)J")
	public long method947(int arg0) {
		return this.field2856 + (long) arg0 * (long) this.field2858;
	}

	@ObfuscatedName("rb.f()V")
	public void method948() {
		this.field2855.field1568 = -1;
	}

	@ObfuscatedName("rb.g()I")
	public int method949() {
		int var1 = this.field2859.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;
		for (int var4 = 0; var4 < var1; var4++) {
			if (this.field2859[var4] >= 0 && this.field2862[var4] < var3) {
				var2 = var4;
				var3 = this.field2862[var4];
			}
		}
		return var2;
	}

	@ObfuscatedName("rb.a(J)V")
	public void method950(long arg0) {
		this.field2856 = arg0;
		int var3 = this.field2859.length;
		for (int var4 = 0; var4 < var3; var4++) {
			this.field2862[var4] = 0;
			this.field2857[var4] = 0;
			this.field2855.field1568 = this.field2860[var4];
			this.method951(var4);
			this.field2859[var4] = this.field2855.field1568;
		}
	}

	@ObfuscatedName("rb.d(I)V")
	public void method951(int arg0) {
		int var2 = this.field2855.method510();
		this.field2862[arg0] += var2;
	}

	@ObfuscatedName("rb.a([B)V")
	public void method952(byte[] arg0) {
		this.field2855.field1586 = arg0;
		this.field2855.field1568 = 10;
		int var2 = this.field2855.method531();
		this.field2861 = this.field2855.method531();
		this.field2858 = 500000;
		this.field2860 = new int[var2];
		int var3 = 0;
		while (var3 < var2) {
			int var4 = this.field2855.method538();
			int var5 = this.field2855.method538();
			if (var4 == 1297379947) {
				this.field2860[var3] = this.field2855.field1568;
				var3++;
			}
			this.field2855.field1568 += var5;
		}
		this.field2856 = 0L;
		this.field2859 = new int[var2];
		for (int var6 = 0; var6 < var2; var6++) {
			this.field2859[var6] = this.field2860[var6];
		}
		this.field2862 = new int[var2];
		this.field2857 = new int[var2];
	}

	@ObfuscatedName("rb.e(I)V")
	public void method953(int arg0) {
		this.field2855.field1568 = this.field2859[arg0];
	}

	@ObfuscatedName("rb.f(I)I")
	public int method954(int arg0) {
		return this.method939(arg0);
	}
}
